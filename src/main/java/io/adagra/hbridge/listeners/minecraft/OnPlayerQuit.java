package io.adagra.hbridge.listeners.minecraft;

import io.adagra.hbridge.BridgeChat;
import io.adagra.hbridge.HBridge;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class OnPlayerQuit implements Listener {

    private HBridge plugin;

    public OnPlayerQuit(HBridge bridge) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        BridgeChat.sendMessage(":arrow_left:** " + event.getPlayer().getName() + " has left the server**");
    }
}
