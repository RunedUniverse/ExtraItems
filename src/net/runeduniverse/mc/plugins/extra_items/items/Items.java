package net.runeduniverse.mc.plugins.extra_items.items;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Items {
	
	public static ItemStack steel_ingot(){
		ItemStack item = new ItemStack(Material.IRON_INGOT, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.DARK_GRAY+"Steel Ingot");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Ein Barren gehaertetes Eisen");
		meta.setLore(lore);
		item.setItemMeta(meta);
		return(item);
	}
	
}
