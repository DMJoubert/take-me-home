package com.carbon.plugins.beammeup;

import com.carbon.plugins.beammeup.commands.HomeCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class BeamMeUp extends JavaPlugin {
    @Override
    public void onDisable() {
        this.getLogger().info("Beam me up disabled!");
    }

    @Override
    public void onEnable() {
        this.getCommand("home").setExecutor(new HomeCommand());
        this.getLogger().info("Beam me up enabled!");
    }
}
