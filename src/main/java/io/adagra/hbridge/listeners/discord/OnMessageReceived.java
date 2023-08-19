package io.adagra.hbridge.listeners.discord;

import io.adagra.hbridge.HBridge;
import io.adagra.hbridge.MinecraftChat;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.bukkit.ChatColor;

public class OnMessageReceived extends ListenerAdapter {

    private HBridge plugin;

    public OnMessageReceived(HBridge plugin) {
        this.plugin = plugin;
    }
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if(event.getAuthor().getId().equals(plugin.getConfiguration().getString("discord.botId"))) return;

        String discordMessage = event.getMessage().getContentRaw();

        String author = event.getAuthor().getName();
        String message = "[" + ChatColor.LIGHT_PURPLE + "Discord: " + author + ChatColor.RESET + "] " + ChatColor.YELLOW + "-> " + ChatColor.RESET + discordMessage;

        MinecraftChat.sendMessage(message);
    }
}
