package io.adagra.hbridge.listeners.minecraft;

import io.adagra.hbridge.BridgeChat;
import io.adagra.hbridge.HBridge;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class OnAsyncPlayerChat implements Listener {

    private HBridge plugin;

    public OnAsyncPlayerChat(HBridge plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onAsyncPlayerChat(AsyncPlayerChatEvent event) {
        BridgeChat.sendMessage("**" + event.getPlayer().getName() + "**: " + event.getMessage());
    }
}
