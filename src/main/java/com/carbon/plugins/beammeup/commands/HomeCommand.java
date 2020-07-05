package com.carbon.plugins.beammeup.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HomeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Location bedSpawn = ((Player) commandSender).getBedSpawnLocation();
            if (bedSpawn == null) commandSender.sendMessage("You don't have a bed, silly!");
            else ((Player) commandSender).teleport(bedSpawn);
        } else {
            commandSender.sendMessage("Only players are able to run this command");
        }

        return true;
    }
}
