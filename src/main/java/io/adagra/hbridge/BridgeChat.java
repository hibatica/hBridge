package io.adagra.hbridge;

import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;

public class BridgeChat {
    private static TextChannel bridge;

    public static void init(TextChannel bridge) {
        BridgeChat.bridge = bridge;
    }

    public static void sendMessage(String message) {
        if(message.isEmpty()) return;

        bridge.sendMessage(message).queue();
    }
}
