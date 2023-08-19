package io.adagra.hbridge;

import org.bukkit.entity.Player;

public class MinecraftChat {
    private static HBridge plugin;

    public static void init(HBridge plugin) {
        MinecraftChat.plugin = plugin;
    }

    public static void sendMessage(String message) {
        if(message == null) return;
        if(message.isEmpty()) return;

        plugin.getServer().broadcastMessage(message);
    }

    public static void whisperToPlayer(Player player, String message) {
        if(message == null) return;
        if(message.isEmpty()) return;

        plugin.getServer().getPlayer(player.getName()).sendMessage(message);
    }
}
