package net.runeduniverse.mc.plugins.extra_items.items;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Armor {

	public static ItemStack guards_helmet(){
		ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD+"Haube des Waechters");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Diese Haube wird von den");
		lore.add("Stadtwaechtern der Zwerge");
		lore.add("bei der Arbeit getragen.");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		return(item);
	}
	
	public static ItemStack bone_chestplate(){
		ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD+"Knochenruestung");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Die Kochenruestung stammt aus");
		lore.add("den Tempeln der Wuesten. Man ");
		lore.add("nimmt an, dass Vorgaenger der");
		lore.add("heutigen Destraner sie getragen");
		lore.add("haben.");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		return(item);
	}
	public static ItemStack hunters_chestplate(){
		ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD+"Jaegerweste");
		meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 6, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Die Jaegerweste wurde von");
		lore.add("den Elfen entwickelt um sich");
		lore.add("auf den Baeumen sicherer");
		lore.add("fortbewegen und wehren zu");
		lore.add("koennen.");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		return(item);
	}
	
	public static ItemStack improved_leggings(){
		ItemStack item = new ItemStack(Material.IRON_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD+"verstaerkte Plattenhose");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 8, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Die Trolle schmiedeten sich eine");
		lore.add("verstaerkte Plattenhose, da sie");
		lore.add("nach alter Tradition den Oberkoerper");
		lore.add("im Kampf zeigen.");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		return(item);
	}
	
	public static ItemStack hiking_boots(){
		ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD+"Wanderstiefel");
		meta.addEnchant(Enchantment.FROST_WALKER, 1, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Wanderstiefel wurden das erste");
		lore.add("Mal im hohen Norden bei den");
		lore.add("Zwergen gesichtet.");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		return(item);
	}
	
	public static ItemStack turtle_chestplate(){
		ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GREEN+"Coopa's Shell");
		meta.addEnchant(Enchantment.OXYGEN, 4, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		return(item);
	}

	public static ItemStack turtle_leggings(){
		ItemStack item = new ItemStack(Material.IRON_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GREEN+"Turtle Legs");
		meta.addEnchant(Enchantment.DEPTH_STRIDER, 4, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		return(item);
	}
	
	public static ItemStack turtle_boots(){
		ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GREEN+"Turtle Flippers");
		meta.addEnchant(Enchantment.DEPTH_STRIDER, 4, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		return(item);
	}
}
