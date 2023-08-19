package io.adagra.hbridge.listeners.minecraft;

import io.adagra.hbridge.BridgeChat;
import io.adagra.hbridge.HBridge;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class OnEntityDeath implements Listener {

    private HBridge plugin;

    public OnEntityDeath(HBridge plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onEntityDeath(EntityDeathEvent event) {

        if(event.getEntity() instanceof Player) return;
        if(event.getEntity().getCustomName().isEmpty()) return;

        String entityName = event.getEntity().getCustomName();
        String killer;

        if(event.getEntity().getKiller() == null) {
            killer = "(unknown cause of death)";
        } else {
            killer = "(killed by: " + event.getEntity().getKiller().getName() + ")";
        }

        BridgeChat.sendMessage("**Entity: " + entityName + " was killed by " + killer + "**");

    }
}
