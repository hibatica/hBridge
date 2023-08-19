package io.adagra.hbridge;

import io.adagra.hbridge.listeners.discord.OnMessageReceived;
import io.adagra.hbridge.listeners.discord.OnReadyEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import java.time.Duration;

public class DiscordBot {
    private static HBridge plugin;

    private static JDA jda;

    public static void init(HBridge plugin) throws InterruptedException {
        DiscordBot.plugin = plugin;

        jda = JDABuilder.createDefault(plugin.getConfiguration().getString("discord.botToken"))
                .addEventListeners(new OnReadyEvent())
                .addEventListeners(new OnMessageReceived(plugin))
                .build()
                .awaitReady();

        BridgeChat.init(jda.getTextChannelById(plugin.getConfiguration().getString("discord.bridgeChannelId")));
    }

    public static void shutdown() throws InterruptedException {
        if (!jda.awaitShutdown(Duration.ofSeconds(10))) {
            jda.shutdownNow(); // Cancel all remaining requests
            jda.awaitShutdown(); // Wait until shutdown is complete (indefinitely)
        }
    }
}
