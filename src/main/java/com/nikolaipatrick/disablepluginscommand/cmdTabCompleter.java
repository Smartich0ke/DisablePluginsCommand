package com.nikolaipatrick.disablepluginscommand;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;
import java.util.List;

public class cmdTabCompleter implements org.bukkit.command.TabCompleter {
    List<String> verbs = new ArrayList<>();
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        if (verbs.isEmpty()) {
            //Tab completion is really simple here, because we only have 3 commands with no more than 1 argument.
            verbs.add("help");
            verbs.add("version");
            verbs.add("reload");
        }
        if (args.length == 1) {
            return verbs;
        }
        return verbs;
    }
}
