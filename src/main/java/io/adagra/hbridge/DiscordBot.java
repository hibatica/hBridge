package io.adagra.hbridge;

import io.adagra.hbridge.listeners.discord.OnReadyEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class DiscordBot {
    private static HBridge plugin;

    private static JDA jda;

    public static void init(HBridge plugin) throws InterruptedException {
        DiscordBot.plugin = plugin;

        jda = JDABuilder.createDefault(plugin.getConfiguration().getString("discord.botToken"))
                .addEventListeners(new OnReadyEvent())
                .build()
                .awaitReady();
    }
}
