package net.runeduniverse.mc.plugins.extraitems;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion;
import org.bukkit.plugin.java.annotation.plugin.Description;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion.Target;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

import net.runeduniverse.mc.plugins.extraitems.commands.UpdateExecutor;
import net.runeduniverse.mc.plugins.extraitems.listeners.ActionListener;

@Plugin(name = "ExtraItems", version = "6.0.0")
@Description(value = "Adds special items to Minecraft using Crafting Recipes and Multiblocks")
@Author(value = "[RunedUniverse] Pl4yingNight")
@ApiVersion(Target.v1_13)
public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		
		getLogger().info("registering Recipes");
		
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
		getLogger().info("loading >> ExtraItems from RunedUniverse coded by Pl4yingNight");
	}
	
}
