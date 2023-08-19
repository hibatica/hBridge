package io.adagra.hbridge.listeners.discord;

import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class OnReadyEvent extends ListenerAdapter {
    @Override
    public void onReady(ReadyEvent event) {
        System.out.println("The Discord bot is ready!");
    }
}
