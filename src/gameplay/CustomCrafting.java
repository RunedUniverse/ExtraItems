package gameplay;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

import items.Armor;
import items.Tools;
import items.Weapons;

public class CustomCrafting {
	
public static ShapedRecipe RecipeP1(){
		ShapedRecipe item = new ShapedRecipe(Tools.P1());
		item.shape("DDD","XPX","LIL");   //X = nix
		item.setIngredient('D', Material.DIAMOND);
		item.setIngredient('P', Material.IRON_PICKAXE);
		item.setIngredient('L', Material.LEATHER);
		item.setIngredient('I', Material.IRON_INGOT);
		return(item);
	}
public static ShapedRecipe RecipeA1(){
		ShapedRecipe item = new ShapedRecipe(Tools.A1());
		item.shape("DDX","DPX","XLX");   //X = nix
		item.setIngredient('D', Material.DIAMOND);
		item.setIngredient('P', Material.IRON_AXE);
		item.setIngredient('L', Material.LEATHER);
		return(item);
	}
public static ShapedRecipe RecipeBA1(){
	ShapedRecipe item = new ShapedRecipe(Weapons.BA1());
	item.shape("GSI","GSX","XSX");   //X = nix
	item.setIngredient('S', Material.STICK);
	item.setIngredient('I', Material.IRON_INGOT);
	item.setIngredient('G', Material.GOLD_INGOT);
	return(item);
}
public static ShapedRecipe RecipeS1(){
	ShapedRecipe item = new ShapedRecipe(Weapons.S1());
	item.shape("XIX","VIV","XSX");   //X = nix
	item.setIngredient('S', Material.IRON_SWORD);
	item.setIngredient('I', Material.IRON_INGOT);
	item.setIngredient('V', Material.VINE);
	return(item);
}

public static ShapedRecipe RecipeSponge(){
	ShapedRecipe item = new ShapedRecipe(new ItemStack(Material.SPONGE));
	item.shape("WSW","SWS","WSW");
	item.setIngredient('S', Material.STRING);
	item.setIngredient('W', Material.WOOL);
	return(item);
}
public static ShapelessRecipe RecipePRISMARINE_CRYSTALS(){
	ShapelessRecipe item = new ShapelessRecipe(new ItemStack(Material.PRISMARINE_CRYSTALS, 9));
	item.addIngredient(Material.GLOWSTONE_DUST);
	item.addIngredient(Material.LAPIS_BLOCK);
	return(item);
}
public static ShapedRecipe RecipePRISMARINE_SHARD(){
	ShapedRecipe item = new ShapedRecipe(new ItemStack(Material.PRISMARINE_SHARD, 16));
	item.shape("XSX","SLS","XSX");	//X = nix
	item.setIngredient('S', Material.STONE);
	item.setIngredient('L', Material.LAPIS_BLOCK);
	return(item);
}

public static ShapedRecipe RecipeB1(){
	ShapedRecipe item = new ShapedRecipe(Armor.B1());
	item.shape("SXS","IEI","IWI");	//X = nix
	item.setIngredient('S', Material.STRING);
	item.setIngredient('W', Material.WOOL);
	item.setIngredient('E', Material.EMERALD);
	item.setIngredient('I', Material.IRON_INGOT);
	return(item);
}
public static ShapedRecipe RecipeB2(){
	ShapedRecipe item = new ShapedRecipe(Armor.B2());
	item.shape("LPL","LXL","IXI");	//X = nix
	item.setIngredient('L', Material.LEATHER);
	item.setIngredient('I', Material.IRON_INGOT);
	item.setIngredient('P', Material.PRISMARINE_CRYSTALS);
	return(item);
}
public static ShapedRecipe RecipeH1(){
	ShapedRecipe item = new ShapedRecipe(Armor.H1());
	item.shape("III","ILI","LSL");	//X = nix
	item.setIngredient('L', Material.LEATHER);
	item.setIngredient('I', Material.IRON_INGOT);
	item.setIngredient('S', Material.STRING);
	return(item);
}
public static ShapedRecipe RecipeC1(){
	ShapedRecipe item = new ShapedRecipe(Armor.C1());
	item.shape("GXG","BBB","BBB");	//X = nix
	item.setIngredient('B', Material.BONE);
	item.setIngredient('G', Material.GOLD_INGOT);
	return(item);
}
public static ShapedRecipe RecipeC2(){
	ShapedRecipe item = new ShapedRecipe(Armor.C2());
	item.shape("ISI","LLL","ILI");	//X = nix
	item.setIngredient('L', Material.LEATHER);
	item.setIngredient('I', Material.IRON_INGOT);
	item.setIngredient('S', Material.STRING);
	return(item);
}
public static ShapedRecipe RecipeL1(){
	ShapedRecipe item = new ShapedRecipe(Armor.L1());
	item.shape("LLL","IXI","LXL");	//X = nix
	item.setIngredient('L', Material.LEATHER);
	item.setIngredient('I', Material.IRON_INGOT);
	return(item);
}

}
