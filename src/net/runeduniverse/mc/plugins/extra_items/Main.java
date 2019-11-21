package net.runeduniverse.mc.plugins.extra_items;

import org.bukkit.plugin.java.JavaPlugin;

import net.runeduniverse.mc.plugins.extra_items.commands.UpdateExecutor;
import net.runeduniverse.mc.plugins.extra_items.items.RecipeFactory;
import net.runeduniverse.mc.plugins.extra_items.listeners.ActionListener;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		
		getLogger().info("registering Recipes");
		RecipeFactory.addAll(this);
		
		new ActionListener(this);
		
		new UpdateExecutor(this);
		
		getLogger().info("enabled");
	}
	
	@Override
	public void onDisable() {
		getLogger().info("disabled");
	}
	
	@Override
	public void onLoad() {
		getLogger().info("loading >> ExtraItems from RunedUniverse coded by Pl4yingNight & SoulB");
	}
	
}
