package io.adagra.hbridge.listeners.minecraft;

import io.adagra.hbridge.BridgeChat;
import io.adagra.hbridge.HBridge;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;

public class OnPlayerAdvancementDone implements Listener {

    private HBridge plugin;

    public OnPlayerAdvancementDone(HBridge plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerAdvancementDone(PlayerAdvancementDoneEvent event) {

        if(event == null) return;
        if(event.getAdvancement().getDisplay() == null) return;
        if(event.getAdvancement().getDisplay().getDescription().isEmpty()) return;

        String player = event.getPlayer().getName();
        String description = event.getAdvancement().getDisplay().getDescription();

        BridgeChat.sendMessage(":star: **" + player + "** has completed the advancement: **" + description + "**");
    }
}
