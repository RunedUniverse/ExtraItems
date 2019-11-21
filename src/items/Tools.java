package items;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Tools extends JavaPlugin{
	
	public static ItemStack P1(){
		ItemStack item = new ItemStack(Material.IRON_PICKAXE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§6Zwergen §6Spitzhacke");
		meta.addEnchant(Enchantment.DIG_SPEED, 4, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("2500/2500");//----Durability-----
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		item.setDurability((short) 1);//------Texture-Pack Durability-----
		return(item);
	}
	public static ItemStack A1(){
		ItemStack item = new ItemStack(Material.IRON_AXE);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§6Axt §6des §6Holzfällers");
		meta.addEnchant(Enchantment.DIG_SPEED, 6, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("1000/1000");//----Durability-----
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		item.setDurability((short) 1);//------Texture-Pack Durability-----
		return(item);
	}
}
