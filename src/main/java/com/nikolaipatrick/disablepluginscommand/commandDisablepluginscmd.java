package com.nikolaipatrick.disablepluginscommand;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class commandDisablepluginscmd implements CommandExecutor {
    DisablePluginsCommand plugin;
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("disablepluginscmd")) {
            if (args.length == 0) {
                sender.sendMessage("§cNot enough args! §e/disablepluginscmd for more info.");
                return true;
            }
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("reload")) {
                    if (sender.hasPermission("disablePluginsCmd.admin") || sender.isOp()) {
                        DisablePluginsCommand.getPlugin(DisablePluginsCommand.class).reloadConfig();
                        sender.sendMessage("§aConfiguration files reloaded!");
                        return true;
                    } else {
                        sender.sendMessage("§cSorry, but you don't have the necessary permission to run that command!");
                        return true;
                    }
                }
                if (args[0].equalsIgnoreCase("version")) {
                    if (sender.hasPermission("disablePluginsCmd.admin") || sender.isOp()) {
                        sender.sendMessage("§aDisablePluginsCommand §ev1.1.1");
                        sender.sendMessage("§aA plugin by Nikolai Patrick (Artichoke)");
                        return true;
                    } else {
                        sender.sendMessage("§cSorry, but you don't have the necessary permission to run that command!");
                        return true;
                    }
                }
                if (args[0].equalsIgnoreCase("help")) {
                    if (sender.hasPermission("disablePluginsCmd.admin") || sender.isOp()) {
                        sender.sendMessage("§a---Usage:---");
                        sender.sendMessage("§e/disablepluginscmd help §f- displays this help message");
                        sender.sendMessage("§e/disablepluginscmd reload §f- reloads config.yml");
                        sender.sendMessage("§e/disablepluginscmd version §f- displays plugin version");
                        return true;
                    } else {
                        sender.sendMessage("§cSorry, but you don't have the necessary permission to run that command!");
                        return true;
                    }
                }
            }
            return false;
        }
    return false;
    }

}
