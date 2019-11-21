package net.alphadragon.mc_plugins.extra_items.inventories;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MagmaticAnvil {
	
	public static Inventory getInterface() {
		
		Inventory inv = Bukkit.getServer().createInventory(null, 27, ChatColor.RED+""+ChatColor.BOLD+"---== Magmatic Anvil ==---");
		
		ItemStack red = new ItemStack(Material.RED_STAINED_GLASS_PANE);
		ItemStack orange = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);
		ItemStack yellow = new ItemStack(Material.YELLOW_STAINED_GLASS_PANE);
		
		ItemMeta meta = red.getItemMeta();
		meta.setDisplayName(" ");
		
		red.setItemMeta(meta);
		orange.setItemMeta(meta);
		yellow.setItemMeta(meta);
		
		inv.setItem(0, orange);
		inv.setItem(4, yellow);
		inv.setItem(5, yellow);
		inv.setItem(6, orange);
		inv.setItem(7, orange);
		inv.setItem(8, yellow);
		
		inv.setItem(9, orange);
		inv.setItem(13, yellow);
		inv.setItem(14, red);
		inv.setItem(16, yellow);
		inv.setItem(17, yellow);
		
		inv.setItem(18, yellow);
		inv.setItem(22, orange);
		inv.setItem(23, yellow);
		inv.setItem(24, orange);
		inv.setItem(25, orange);
		inv.setItem(26, yellow);
		
		return inv;
	}
	
	public static String getTitle() {
		return ChatColor.RED+""+ChatColor.BOLD+"---== Magmatic Anvil ==---";
	}
	
}
