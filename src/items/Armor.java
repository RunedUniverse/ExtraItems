package items;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Armor {
	
	
	public static ItemStack H1(){
		ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�6Hauber �6des �6W�chters");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("400/400");//----Durability-----
		lore.add("Diese Haube wird von den");
		lore.add("Stadtw�chtern der Zwergen");
		lore.add("bei der Arbeit getragen.");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		item.setDurability((short) 1);//------Texture-Pack Durability-----
		return(item);
	}
	
	public static ItemStack C1(){
		ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�6Knochenr�stung");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("150/150");//----Durability-----
		lore.add("Die Kochenr�stung stammt aus");
		lore.add("den Tempeln der W�sten. Man ");
		lore.add("nimmt an, dass Vorg�nger der");
		lore.add("heutigen Destraner sie getragen");
		lore.add("haben.");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		item.setDurability((short) 1);//------Texture-Pack Durability-----
		return(item);
	}
	public static ItemStack C2(){
		ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�6Sch�tzenweste");
		meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 2, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("300/300");//----Durability-----
		lore.add("Die Sch�tzenweste wurde von");
		lore.add("den Elfen entwickelt um sich");
		lore.add("auf den B�umen sicherer");
		lore.add("fortbewegen und wehren zu");
		lore.add("k�nnen.");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		item.setDurability((short) 2);//------Texture-Pack Durability-----
		return(item);
	}
	
	public static ItemStack L1(){
		ItemStack item = new ItemStack(Material.IRON_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�6verst�rkte �6Plattenhose");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("200/200");//----Durability-----
		lore.add("Die Trolle schmiedeten sich eine");
		lore.add("verst�rkte Plattenhose, da sie");
		lore.add("nach alter Tradition den Oberk�rper");
		lore.add("im Kampf zeigen.");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		item.setDurability((short) 1);//------Texture-Pack Durability-----
		return(item);
	}
	
	public static ItemStack B1(){
		ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�6Wanderstiefel");
		meta.addEnchant(Enchantment.FROST_WALKER, 1, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("200/200");//----Durability-----
		lore.add("Wanderstiefel wurden das erste");
		lore.add("Mal im hohen Norden bei den");
		lore.add("Zwergen gesichtet.");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		item.setDurability((short) 1);//------Texture-Pack Durability-----
		return(item);
	}
	public static ItemStack B2(){
		ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�6verst�rkte �6Flossen");
		meta.addEnchant(Enchantment.DEPTH_STRIDER, 4, true);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("250/250");//----Durability-----
		lore.add("Diese Flossen wurden mit Metall");
		lore.add("verst�rkt, um dem Druck der Tiefsee");
		lore.add("stand zu halten.");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		item.setDurability((short) 2);//------Texture-Pack Durability-----
		return(item);
	}

	
	
	
	
	
}
