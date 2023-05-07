package me.ashton.developer.ashtonsessentials.commands;

import me.ashton.developer.ashtonsessentials.AshtonsEssentials;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Spawn implements CommandExecutor {
    private final AshtonsEssentials plugin;

    public Spawn(AshtonsEssentials plugin) { this.plugin = plugin; }
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        return true;
    }
}
