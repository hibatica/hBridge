package io.adagra.hbridge;

import org.bukkit.plugin.java.JavaPlugin;

public final class HBridge extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin has been enabled");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin has been disabled");
    }
}
