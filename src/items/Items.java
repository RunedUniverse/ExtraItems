package items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Items {
	public static ItemStack Diamond(){
		ItemStack item = new ItemStack(Material.DIAMOND);
		ItemMeta meta= item.getItemMeta();
		meta.setDisplayName(ChatColor.BLUE + "gefundener Diamant");
		item.setItemMeta(meta);
		return item;
	}
}
