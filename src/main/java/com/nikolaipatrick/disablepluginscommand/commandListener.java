package com.nikolaipatrick.disablepluginscommand;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class commandListener implements Listener {
    @EventHandler
    public void playerRunCommand (PlayerCommandPreprocessEvent e) {
        Player p = e.getPlayer();
        String cmd = e.getMessage();
        if (cmd.equalsIgnoreCase("/plugins") || cmd.equalsIgnoreCase("/pl") || cmd.equalsIgnoreCase("/bukkit:pl") || cmd.equalsIgnoreCase("/bukkit:plugins")) {
            if (DisablePluginsCommand.getPlugin(DisablePluginsCommand.class).getConfig().getBoolean("disable-plugins-cmd")) {
                if (!p.hasPermission("disablePluginsCmd.bypass") && !p.isOp()) {
                    e.setCancelled(true);
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', DisablePluginsCommand.getPlugin(DisablePluginsCommand.class).getConfig().getString("deny-message")));
                }
            }
        }
        if (cmd.equalsIgnoreCase("/version") || cmd.equalsIgnoreCase("/ver") || cmd.equalsIgnoreCase("/bukkit:version") || cmd.equalsIgnoreCase("/bukkit:ver")) {
            if (DisablePluginsCommand.getPlugin(DisablePluginsCommand.class).getConfig().getBoolean("disable-version-cmd")) {
                if (!p.hasPermission("disablePluginsCmd.bypass") && !p.isOp()) {
                    e.setCancelled(true);
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', DisablePluginsCommand.getPlugin(DisablePluginsCommand.class).getConfig().getString("deny-message")));
                }
            }
        }
        if (cmd.equalsIgnoreCase("/about") || cmd.equalsIgnoreCase("/bukkit:about")) {
            if (DisablePluginsCommand.getPlugin(DisablePluginsCommand.class).getConfig().getBoolean("disable-about-cmd")) {
                if (!p.hasPermission("disablePluginsCmd.bypass") && !p.isOp()) {
                    e.setCancelled(true);
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', DisablePluginsCommand.getPlugin(DisablePluginsCommand.class).getConfig().getString("deny-message")));
                }
            }
        }
        //TODO: disable /bungee and /waterfall comands
    }
}
