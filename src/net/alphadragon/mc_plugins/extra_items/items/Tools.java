package net.alphadragon.mc_plugins.extra_items.items;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Tools {

	public static ItemStack dwarven_pickaxe(){
		ItemStack item = new ItemStack(Material.IRON_PICKAXE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("Zwergen Spitzhacke");
		meta.addEnchant(Enchantment.DIG_SPEED, 4, true);
		meta.addEnchant(Enchantment.DURABILITY, 8, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Die Zwergen Spitzhacke ist ein");
		lore.add("gaengiges Werkzeug der Zwerge.");
		lore.add("Ueberlieferungen berichten, dass");
		lore.add("die erste Spitzhacke vor ueber");
		lore.add("4000 Jahren hergestellt wurde.");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		return(item);
	}
	
	public static ItemStack hardened_dwarven_pickaxe(){
		ItemStack item = new ItemStack(Material.IRON_PICKAXE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.YELLOW+"gehaertete Zwergen Spitzhacke");
		meta.addEnchant(Enchantment.DIG_SPEED, 6, true);
		meta.setUnbreakable(true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Die gehaertete Zwergen Spitzhacke");
		lore.add("wurde nach den Schriften der");
		lore.add("ersten Zwerge gehaertet. Auf Grund");
		lore.add("ihrer besonderen Zutaten hat sie");
		lore.add("sich als unzerstoerbar erwiesen.");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		return(item);
	}
	
	public static ItemStack enhanced_dwarven_pickaxe(){
		ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.DARK_RED+"veredelte Zwergen Spitzhacke");
		meta.addEnchant(Enchantment.DIG_SPEED, 10, true);
		meta.setUnbreakable(true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Die veredelte Zwergen Spitzhacke");
		lore.add("wurde mit Hilfe der verschollen");
		lore.add("geglaubten Schriften der Ur-Zwerge");
		lore.add("veredelt. Aufgrund der besonderen");
		lore.add("Veredelung ist sie eins mit der");
		lore.add("Ewigkeit geworden.");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		return(item);
	}
	
	public static ItemStack axe_of_the_forest(){
		ItemStack item = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD+"Axt des Waldes");
		meta.addEnchant(Enchantment.DIG_SPEED, 6, true);
		meta.addEnchant(Enchantment.DURABILITY, 8, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Die Axt des Waldes wurde von");
		lore.add("einem Kobold Klan entwickelt.");
		lore.add("Ihr Zweck war es, im Kampf gegen");
		lore.add("die Waldelfen, schneller in die");
		lore.add("uralten Eisen-Waiden einzudringen.");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		return(item);
	}
	
}
