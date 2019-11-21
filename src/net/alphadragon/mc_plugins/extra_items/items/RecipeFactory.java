package net.alphadragon.mc_plugins.extra_items.items;

import java.util.HashSet;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class RecipeFactory {
	
	public static Set<NamespacedKey> namespacedKeys = new HashSet<>();
	
	public static void addAll(JavaPlugin plugin) {
		dwarven_pickaxe(plugin);
		axe_of_the_forest(plugin);
		copper_battleaxe(plugin);
		rusty_sword(plugin);
		steel_ingot(plugin);
		guards_helmet(plugin);
		bone_chestplate(plugin);
		hunters_chestplate(plugin);
		improved_leggings(plugin);
		hiking_boots(plugin);
		turtle_chestplate(plugin);
		turtle_leggings(plugin);
		turtle_boots(plugin);
	}

	//====================== Tools ======================
	
	public static void dwarven_pickaxe(JavaPlugin plugin){
		NamespacedKey key = new NamespacedKey(plugin, "dwarven_pickaxe");
		ShapedRecipe item = new ShapedRecipe(key, Tools.dwarven_pickaxe());
		item.shape("DDD","XPX","LIL");   //X = nix
		item.setIngredient('D', Material.DIAMOND);
		item.setIngredient('P', Material.IRON_PICKAXE);
		item.setIngredient('L', Material.LEATHER);
		item.setIngredient('I', Material.IRON_INGOT);
		namespacedKeys.add(key);Bukkit.addRecipe(item);
	}
	
	public static void axe_of_the_forest(JavaPlugin plugin){
		NamespacedKey key = new NamespacedKey(plugin, "axe_of_the_forest");
		ShapedRecipe item = new ShapedRecipe(key, Tools.axe_of_the_forest());
		item.shape("DAX","DIX","LIL");   //X = nix
		item.setIngredient('D', Material.DIAMOND);
		item.setIngredient('A', Material.DIAMOND_AXE);
		item.setIngredient('L', Material.LEATHER);
		item.setIngredient('I', Material.IRON_INGOT);
		namespacedKeys.add(key);Bukkit.addRecipe(item);
	}
	
	//====================== Weapons ======================
	
	public static void copper_battleaxe(JavaPlugin plugin){
		NamespacedKey key = new NamespacedKey(plugin, "copper_battleaxe");
		ShapedRecipe item = new ShapedRecipe(key, Weapons.copper_battleaxe());
		item.shape("GNX","GSX","XSX");   //X = nix
		item.setIngredient('G', Material.GOLD_INGOT);
		item.setIngredient('N', Material.GOLD_NUGGET);
		item.setIngredient('S', Material.STICK);
		namespacedKeys.add(key);Bukkit.addRecipe(item);
	}
	
	public static void rusty_sword(JavaPlugin plugin){
		NamespacedKey key = new NamespacedKey(plugin, "rusty_sword");
		ShapedRecipe item = new ShapedRecipe(key, Weapons.rusty_sword());
		item.shape("XVI","VIV","SVX");   //X = nix
		item.setIngredient('I', Material.IRON_INGOT);
		item.setIngredient('V', Material.VINE);
		item.setIngredient('S', Material.IRON_SWORD);
		namespacedKeys.add(key);Bukkit.addRecipe(item);
	}
	
	//====================== Items ======================
	
	public static void steel_ingot(JavaPlugin plugin){
		NamespacedKey key = new NamespacedKey(plugin, "steel_ingot");
		ShapedRecipe item = new ShapedRecipe(key, Items.steel_ingot());
		item.shape("IDI","DBD","IDI");   //X = nix
		item.setIngredient('D', Material.DIAMOND);
		item.setIngredient('I', Material.IRON_INGOT);
		item.setIngredient('B', Material.BLAZE_POWDER);
		namespacedKeys.add(key);Bukkit.addRecipe(item);
	}
	
	//====================== Armor ======================
	
	public static void guards_helmet(JavaPlugin plugin){
		NamespacedKey key = new NamespacedKey(plugin, "guards_helmet");
		ShapedRecipe item = new ShapedRecipe(key, Armor.guards_helmet());
		item.shape("III","ILI","XXX");   //X = nix
		item.setIngredient('I', Material.IRON_INGOT);
		item.setIngredient('L', Material.LEATHER_HELMET);
		namespacedKeys.add(key);Bukkit.addRecipe(item);
	}
	
	public static void bone_chestplate(JavaPlugin plugin){
		NamespacedKey key = new NamespacedKey(plugin, "bone_chestplate");
		ShapedRecipe item = new ShapedRecipe(key, Armor.bone_chestplate());
		item.shape("GXG","BBB","BBB");	//X = nix
		item.setIngredient('B', Material.BONE);
		item.setIngredient('G', Material.GOLD_INGOT);
		namespacedKeys.add(key);Bukkit.addRecipe(item);
	}
	
	public static void hunters_chestplate(JavaPlugin plugin){
		NamespacedKey key = new NamespacedKey(plugin, "hunters_chestplate");
		ShapedRecipe item = new ShapedRecipe(key, Armor.hunters_chestplate());
		item.shape("ISI","LLL","ILI");	//X = nix
		item.setIngredient('I', Material.IRON_INGOT);
		item.setIngredient('S', Material.STRING);
		item.setIngredient('L', Material.LEATHER);
		namespacedKeys.add(key);Bukkit.addRecipe(item);
	}
	
	public static void improved_leggings(JavaPlugin plugin){
		NamespacedKey key = new NamespacedKey(plugin, "improved_leggings");
		ShapedRecipe item = new ShapedRecipe(key, Armor.improved_leggings());
		item.shape("IGI","DXD","NXN");   //X = nix
		item.setIngredient('I', Material.IRON_INGOT);
		item.setIngredient('G', Material.GOLD_INGOT);
		item.setIngredient('D', Material.DIAMOND);
		item.setIngredient('N', Material.IRON_NUGGET);
		namespacedKeys.add(key);Bukkit.addRecipe(item);
	}
	
	public static void hiking_boots(JavaPlugin plugin){
		NamespacedKey key = new NamespacedKey(plugin, "hiking_boots");
		ShapedRecipe item = new ShapedRecipe(key, Armor.hiking_boots());
		item.shape("SXS","IEI","IWI");	//X = nix
		item.setIngredient('S', Material.STRING);
		item.setIngredient('I', Material.IRON_INGOT);
		item.setIngredient('W', Material.GREEN_WOOL);
		item.setIngredient('E', Material.EMERALD);
		namespacedKeys.add(key);Bukkit.addRecipe(item);
	}
	
	public static void turtle_chestplate(JavaPlugin plugin){
		NamespacedKey key = new NamespacedKey(plugin, "turtle_chestplate");
		ShapedRecipe item = new ShapedRecipe(key, Armor.turtle_chestplate());
		item.shape("SXS","SSS","SSS");   //X = nix
		item.setIngredient('S', Material.SCUTE);
		namespacedKeys.add(key);Bukkit.addRecipe(item);
	}
	
	public static void turtle_leggings(JavaPlugin plugin){
		NamespacedKey key = new NamespacedKey(plugin, "turtle_leggings");
		ShapedRecipe item = new ShapedRecipe(key, Armor.turtle_leggings());
		item.shape("SSS","SXS","SXS");   //X = nix
		item.setIngredient('S', Material.SCUTE);
		namespacedKeys.add(key);Bukkit.addRecipe(item);
	}
	
	public static void turtle_boots(JavaPlugin plugin){
		NamespacedKey key = new NamespacedKey(plugin, "turtle_boots");
		ShapedRecipe item = new ShapedRecipe(key, Armor.turtle_boots());
		item.shape("XXX","SXS","SXS");   //X = nix
		item.setIngredient('S', Material.SCUTE);
		namespacedKeys.add(key);Bukkit.addRecipe(item);
	}
	
}
