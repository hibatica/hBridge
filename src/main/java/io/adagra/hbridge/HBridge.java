package io.adagra.hbridge;

import io.adagra.hbridge.listeners.minecraft.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class HBridge extends JavaPlugin {

    private FileConfiguration config;

    @Override
    public void onEnable() {

        saveDefaultConfig();
        this.config = getConfig();

        MinecraftChat.init(this);

        try {
            DiscordBot.init(this);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        getServer().getPluginManager().registerEvents(new OnAsyncPlayerChat(this), this);
        getServer().getPluginManager().registerEvents(new OnEntityDeath(this), this);
        getServer().getPluginManager().registerEvents(new OnPlayerAdvancementDone(this), this);
        getServer().getPluginManager().registerEvents(new OnPlayerJoin(this), this);
        getServer().getPluginManager().registerEvents(new OnPlayerQuit(this), this);
        getServer().getPluginManager().registerEvents(new OnPlayerDeath(), this);

        BridgeChat.sendMessage(":white_check_mark: **The server has started!**");

    }

    @Override
    public void onDisable() {
        BridgeChat.sendMessage(":octagonal_sign: **The server has stopped**");
        try {
            DiscordBot.shutdown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public FileConfiguration getConfiguration() {
        return this.config;
    }
}
