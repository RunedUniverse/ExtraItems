package extraitems;


import org.bukkit.plugin.java.JavaPlugin;
import gameplay.CustomCrafting;
import listener.ActionListener;

public class main extends JavaPlugin{
	
	@Override
	public void onEnable(){
		System.out.println("extraItems activated");
		
		new ActionListener(this);
		
		getServer().addRecipe(CustomCrafting.RecipeP1());
		getServer().addRecipe(CustomCrafting.RecipeA1());
		getServer().addRecipe(CustomCrafting.RecipeBA1());
		getServer().addRecipe(CustomCrafting.RecipeS1());
		getServer().addRecipe(CustomCrafting.RecipePRISMARINE_CRYSTALS());
		getServer().addRecipe(CustomCrafting.RecipePRISMARINE_SHARD());
		getServer().addRecipe(CustomCrafting.RecipeSponge());
		getServer().addRecipe(CustomCrafting.RecipeB1());
		getServer().addRecipe(CustomCrafting.RecipeB2());
		getServer().addRecipe(CustomCrafting.RecipeH1());
		getServer().addRecipe(CustomCrafting.RecipeC1());
		getServer().addRecipe(CustomCrafting.RecipeC2());
		getServer().addRecipe(CustomCrafting.RecipeL1());
	}
	
	@Override
	public void onDisable(){
		System.out.println("extraItems deactivated");
	}
}
