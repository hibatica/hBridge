package io.adagra.hbridge;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class HBridge extends JavaPlugin {

    private FileConfiguration config;

    @Override
    public void onEnable() {

        saveDefaultConfig();
        this.config = getConfig();

        try {
            DiscordBot.init(this);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void onDisable() {

    }

    public FileConfiguration getConfiguration() {
        return this.config;
    }
}
