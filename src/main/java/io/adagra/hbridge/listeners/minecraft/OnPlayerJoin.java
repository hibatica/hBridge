package io.adagra.hbridge.listeners.minecraft;

import io.adagra.hbridge.BridgeChat;
import io.adagra.hbridge.HBridge;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnPlayerJoin implements Listener {

    private HBridge plugin;

    public OnPlayerJoin(HBridge plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        BridgeChat.sendMessage(":arrow_right:** " + event.getPlayer().getName() + " has joined the server!**");
    }
}
