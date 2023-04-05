package com.nikolaipatrick.disablepluginscommand;

import org.bukkit.command.TabCompleter;
import org.bukkit.plugin.java.JavaPlugin;

public final class DisablePluginsCommand extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Loading disablePluginsCommand V1.1.2");
        getLogger().info("DisablePluginsCommand by Nikolai Patrick 2022-2023");
        getServer().getPluginManager().registerEvents(new commandListener(), this);
        getCommand("disablepluginscmd").setExecutor(new commandDisablepluginscmd());
        getCommand("disablepluginscmd").setTabCompleter(new cmdTabCompleter());
        this.saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info("Goodbye!");

    }
}
