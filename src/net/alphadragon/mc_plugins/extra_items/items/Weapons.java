package net.alphadragon.mc_plugins.extra_items.items;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Weapons {

	public static ItemStack copper_battleaxe(){
		ItemStack item = new ItemStack(Material.GOLDEN_AXE);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD+"Beil des Kupferschmiedes");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Eine urzeitliche Form der Streitaxt.");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
        return(item);
	}
	
	@SuppressWarnings("deprecation")
	public static ItemStack rusty_sword(){
		ItemStack item = new ItemStack(Material.IRON_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD+"rostiges Langschwert");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Ein altes Schwert, es weist einige");
		lore.add("rostige Stellen auf... sie koennten");
		lore.add("eventuell eine Blutvergiftung bewirken");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		item.setDurability((short) 97);
		return(item);
	}
	
}
