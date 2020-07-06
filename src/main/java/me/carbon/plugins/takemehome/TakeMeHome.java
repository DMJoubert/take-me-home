package me.carbon.plugins.takemehome;

import me.carbon.plugins.takemehome.commands.HomeCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class TakeMeHome extends JavaPlugin {
    @Override
    public void onDisable() {
        this.getLogger().info("Take me home disabled!");
    }

    @Override
    public void onEnable() {
        this.getCommand("home").setExecutor(new HomeCommand());
        this.getLogger().info("Take me home enabled!");
    }
}
