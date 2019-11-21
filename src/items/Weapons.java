package items;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Weapons {
	public static ItemStack BA1(){
		ItemStack item = new ItemStack(Material.GOLD_AXE);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§6Beil §6des §6Kupferschmiedes");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("100/100");//----Durability-----
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		item.setDurability((short) 1);//------Texture-Pack Durability-----
        return(item);
	}
	public static ItemStack S1(){
		ItemStack item = new ItemStack(Material.IRON_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§6rostiges §6Langschwert");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("120/120");//----Durability-----
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		item.setDurability((short) 1);//------Texture-Pack Durability-----
		return(item);
	}
}
