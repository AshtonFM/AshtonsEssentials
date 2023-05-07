package me.ashton.developer.ashtonsessentials;

import me.ashton.developer.ashtonsessentials.commands.setSpawn;
import org.bukkit.plugin.java.JavaPlugin;

public final class AshtonsEssentials extends JavaPlugin {

    @Override
    public void onEnable() {

        // Config
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        // Config

        getCommand("setspawn").setExecutor(new setSpawn(this));

        System.out.println("Ashton's Essentials HAS STARTED.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Ashton's Essentials HAS STOPPTED.");
    }
}
