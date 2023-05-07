package me.ashton.developer.ashtonsessentials.commands;

import me.ashton.developer.ashtonsessentials.AshtonsEssentials;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class setSpawn implements CommandExecutor {

    private final AshtonsEssentials plugin;

    public setSpawn(AshtonsEssentials plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            Location location = player.getLocation();

            //plugin.getConfig().set("spawn.x", location.getX());
            //plugin.getConfig().set("spawn.y", location.getY());
            //plugin.getConfig().set("spawn.z", location.getZ());
            //plugin.getConfig().set("spawn.worldName", location.getWorld().getName());

            plugin.getConfig().set("spawn", location);
            plugin.saveConfig();
            player.sendMessage(ChatColor.GREEN + "You have set the spawn location successfully");

        } else {
            System.out.println("An error has occured while attempting to set the spawn location.");
        }

        return true;
    }
}
