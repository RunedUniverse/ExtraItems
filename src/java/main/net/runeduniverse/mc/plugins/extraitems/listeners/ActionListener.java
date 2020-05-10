package net.runeduniverse.mc.plugins.extraitems.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import net.md_5.bungee.api.ChatColor;
import net.runeduniverse.mc.plugins.extraitems.Main;

public class ActionListener implements Listener{
	
	public ActionListener (Main plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void firstJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		if(!player.hasPlayedBefore()) {
			//player.discoverRecipes(RecipeFactory.namespacedKeys);
			player.sendMessage(ChatColor.GOLD + "ExtraItems has tought you how to make stuff!");
		}
	}
	
	
}
