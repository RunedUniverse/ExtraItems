package net.alphadragon.mc_plugins.extra_items.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.alphadragon.mc_plugins.extra_items.items.RecipeFactory;
import net.md_5.bungee.api.ChatColor;

public class UpdateExecutor implements CommandExecutor{
	private JavaPlugin plugin = null;
	
	public UpdateExecutor(JavaPlugin plugin) {
		this.plugin = plugin;
		this.plugin.getCommand("recipes-update").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(!(sender instanceof Player))
			return false;
		
		((Player)sender).discoverRecipes(RecipeFactory.namespacedKeys);
		((Player)sender).sendMessage(ChatColor.GOLD + "ExtraItems has updated your recipes!");
		return true;
	}
	
}
