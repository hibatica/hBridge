package io.adagra.hbridge.listeners.minecraft;

import io.adagra.hbridge.BridgeChat;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class OnPlayerDeath implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        BridgeChat.sendMessage("**" + event.getDeathMessage() + "**");
    }
}
