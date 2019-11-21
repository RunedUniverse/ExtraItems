package net.runeduniverse.mc.plugins.extra_items.listeners;

import java.util.Random;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import net.md_5.bungee.api.ChatColor;
import net.runeduniverse.mc.plugins.extra_items.Main;
import net.runeduniverse.mc.plugins.extra_items.inventories.MagmaticAnvil;
import net.runeduniverse.mc.plugins.extra_items.items.Items;
import net.runeduniverse.mc.plugins.extra_items.items.Tools;

public class ActionListener implements Listener{
	
	public ActionListener (Main plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void firstJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		if(!player.hasPlayedBefore()) {
			//player.discoverRecipes(RecipeFactory.namespacedKeys);
			player.sendMessage(ChatColor.GOLD + "ExtraItems has tought you how to make stuff!");
		}
	}
	
	@EventHandler(priority = EventPriority.HIGH)
	public void damageDealt(EntityDamageByEntityEvent event) {
		if(!(event.getDamager() instanceof Player)) return;
		
		Player damager = (Player) event.getDamager();
		ItemStack stack = damager.getInventory().getItemInMainHand();
		
		switch (stack.getType()) {
		case IRON_SWORD:
			if(stack.getItemMeta().getDisplayName().equals("§6rostiges Langschwert"))
				if((new Random()).nextInt(100)<33)
					((LivingEntity) event.getEntity()).addPotionEffect(new PotionEffect(PotionEffectType.POISON, 5, 3));
			break;

		default:
			break;
		}
		
		
	}
	
	@EventHandler(priority = EventPriority.NORMAL)
	public void damageTaken(EntityDamageByEntityEvent event) {
		if(!(event.getEntity() instanceof Player)) return;
		
		Player player = (Player) event.getEntity();
		
		String helmet = player.getInventory().getHelmet().getItemMeta().getDisplayName();
		String chestplate = player.getInventory().getChestplate().getItemMeta().getDisplayName();
		String leggings = player.getInventory().getLeggings().getItemMeta().getDisplayName();
		String boots = player.getInventory().getBoots().getItemMeta().getDisplayName();
		
		
		
		if(chestplate == "§6Jägerweste" && event.getCause().equals(DamageCause.PROJECTILE))
			if(((LivingEntity) event.getEntity()).getEquipment().getItemInMainHand().getItemMeta().hasEnchant(Enchantment.ARROW_KNOCKBACK)||((LivingEntity) event.getEntity()).getEquipment().getItemInOffHand().getItemMeta().hasEnchant(Enchantment.ARROW_KNOCKBACK)){
				player.getVelocity().setX(0);
				player.getVelocity().setY(0);
				player.getVelocity().setZ(0);
			}
		
	}
	
	@EventHandler
	public void useAnvil(PlayerInteractEvent event) {
		
		if(!(event.getAction().equals(Action.RIGHT_CLICK_BLOCK))) return;
		if(!(event.getClickedBlock().getType().equals(Material.ANVIL)||event.getClickedBlock().getType().equals(Material.CHIPPED_ANVIL)||event.getClickedBlock().getType().equals(Material.DAMAGED_ANVIL))) return;
		if(!event.getClickedBlock().getLocation().clone().add(0, -1, 0).getBlock().getType().equals(Material.MAGMA_BLOCK)) return;
		if(!event.getClickedBlock().getLocation().clone().add(1, -1, 0).getBlock().getType().equals(Material.COAL_BLOCK)) return;
		if(!event.getClickedBlock().getLocation().clone().add(-1, -1, 0).getBlock().getType().equals(Material.COAL_BLOCK)) return;
		if(!event.getClickedBlock().getLocation().clone().add(0, -1, 1).getBlock().getType().equals(Material.COAL_BLOCK)) return;
		if(!event.getClickedBlock().getLocation().clone().add(0, -1, -1).getBlock().getType().equals(Material.COAL_BLOCK)) return;
		if(!event.getClickedBlock().getLocation().clone().add(-1, -1, -1).getBlock().getType().equals(Material.NETHER_BRICKS)) return;
		if(!event.getClickedBlock().getLocation().clone().add(1, -1, 1).getBlock().getType().equals(Material.NETHER_BRICKS)) return;
		if(!event.getClickedBlock().getLocation().clone().add(1, -1, -1).getBlock().getType().equals(Material.NETHER_BRICKS)) return;
		if(!event.getClickedBlock().getLocation().clone().add(-1, -1, 1).getBlock().getType().equals(Material.NETHER_BRICKS)) return;
		
		event.setCancelled(true);
		event.getPlayer().openInventory(MagmaticAnvil.getInterface());
		
	}
	
	@EventHandler
	public void useInv(InventoryClickEvent event) {
		
		InventoryView view = event.getView();
		Inventory inv = event.getClickedInventory();
		Boolean recipeFound = false;
		
		//Checking for KnockOut causes
		if(inv == null) return;
		
		if(view.getTitle().equals(MagmaticAnvil.getTitle())) {
			
			if(event.getCurrentItem()==null)
				return;
			if(event.getCurrentItem().getType().equals(Material.ORANGE_STAINED_GLASS_PANE)) {
				event.setCancelled(true);
				return;
			}
			if(event.getCurrentItem().getType().equals(Material.YELLOW_STAINED_GLASS_PANE)) {
				event.setCancelled(true);
				return;
			}
			if(event.getCurrentItem().getType().equals(Material.RED_STAINED_GLASS_PANE)) {
				event.setCancelled(true);
				return;
			}
			if(event.getCurrentItem().getType().equals(Material.LIME_STAINED_GLASS_PANE)) {
				event.setCancelled(true);
				return;
			}
			if(event.getSlot() == 15 && inv.getItem(14).getType().equals(Material.RED_STAINED_GLASS_PANE)) {
				event.setCancelled(true);
				return;
			}
			
			//Checking for recipes
			if(inv.getItem(1) != null 
					&& inv.getItem(2) != null 
					&& inv.getItem(3) != null 
					&& inv.getItem(10) != null 
					&& inv.getItem(11) != null 
					&& inv.getItem(12) != null
					&& inv.getItem(19) == null
					&& inv.getItem(20) != null
					&& inv.getItem(21) == null)
			if(inv.getItem(1).getItemMeta().equals(Items.steel_ingot().getItemMeta())
					&&inv.getItem(2).getType().equals(Material.EMERALD)
					&&inv.getItem(3).getItemMeta().equals(Items.steel_ingot().getItemMeta())
					&&inv.getItem(10).getItemMeta().equals(Items.steel_ingot().getItemMeta())
					&&inv.getItem(11).equals(Tools.dwarven_pickaxe())
					&&inv.getItem(12).getItemMeta().equals(Items.steel_ingot().getItemMeta())
					&&inv.getItem(20).getType().equals(Material.DIAMOND)) {
				
				inv.setItem(15, Tools.hardened_dwarven_pickaxe());
				recipeFound = true;
				
				if(!((Player)event.getWhoClicked()).getGameMode().equals(GameMode.CREATIVE))
				if(((Player)event.getWhoClicked()).getLevel() < 20) {
					ItemStack red = new ItemStack(Material.RED_STAINED_GLASS_PANE);
					ItemMeta meta = red.getItemMeta();
					meta.setDisplayName(ChatColor.RED+""+ChatColor.BOLD+"20 Level");
					red.setItemMeta(meta);
					inv.setItem(14, red);
					return;
				}
				
				ItemStack green = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
				ItemMeta meta = green.getItemMeta();
				meta.setDisplayName(ChatColor.GREEN+""+ChatColor.BOLD+"20 Level");
				green.setItemMeta(meta);
				inv.setItem(14, green);
			}
			
			if(inv.getItem(1) != null 
					&& inv.getItem(2) != null 
					&& inv.getItem(3) != null 
					&& inv.getItem(10) != null 
					&& inv.getItem(11) != null 
					&& inv.getItem(12) != null
					&& inv.getItem(19) != null
					&& inv.getItem(20) != null
					&& inv.getItem(21) != null)
			if(inv.getItem(1).getType().equals(Material.OBSIDIAN)
					&&inv.getItem(2).getType().equals(Material.NETHER_STAR)
					&&inv.getItem(3).getType().equals(Material.OBSIDIAN)
					&&inv.getItem(10).getItemMeta().equals(Items.steel_ingot().getItemMeta())
					&&inv.getItem(11).equals(Tools.hardened_dwarven_pickaxe())
					&&inv.getItem(12).getItemMeta().equals(Items.steel_ingot().getItemMeta())
					&&inv.getItem(19).getType().equals(Material.EMERALD)
					&&inv.getItem(20).getType().equals(Material.EMERALD_BLOCK)
					&&inv.getItem(21).getType().equals(Material.EMERALD)) {
				
				inv.setItem(15, Tools.enhanced_dwarven_pickaxe());
				recipeFound = true;
				
				if(!((Player)event.getWhoClicked()).getGameMode().equals(GameMode.CREATIVE))
				if(((Player)event.getWhoClicked()).getLevel() < 40) {
					ItemStack red = new ItemStack(Material.RED_STAINED_GLASS_PANE);
					ItemMeta meta = red.getItemMeta();
					meta.setDisplayName(ChatColor.RED+""+ChatColor.BOLD+"40 Level");
					red.setItemMeta(meta);
					inv.setItem(14, red);
					return;
				}

				ItemStack green = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
				ItemMeta meta = green.getItemMeta();
				meta.setDisplayName(ChatColor.GREEN+""+ChatColor.BOLD+"40 Level");
				green.setItemMeta(meta);
				inv.setItem(14, green);
				
			}
			
			//Clearing Output if no recipe is found
			if(!recipeFound) {
				inv.setItem(15, new ItemStack(Material.AIR));
				return;
			}
			
			
			//Crafting items
			if(event.getCurrentItem().equals(Tools.hardened_dwarven_pickaxe())) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount()-1);
				inv.getItem(2).setAmount(inv.getItem(2).getAmount()-1);
				inv.getItem(3).setAmount(inv.getItem(3).getAmount()-1);
				inv.getItem(10).setAmount(inv.getItem(10).getAmount()-1);
				inv.getItem(11).setAmount(inv.getItem(11).getAmount()-1);
				inv.getItem(12).setAmount(inv.getItem(12).getAmount()-1);
				inv.getItem(20).setAmount(inv.getItem(20).getAmount()-1);
				
				if(!((Player)event.getWhoClicked()).getGameMode().equals(GameMode.CREATIVE))
					((Player) event.getWhoClicked()).setLevel(((Player) event.getWhoClicked()).getLevel()-20);
				
				ItemStack red = new ItemStack(Material.RED_STAINED_GLASS_PANE);
				ItemMeta meta = red.getItemMeta();
				meta.setDisplayName(" ");
				red.setItemMeta(meta);
				inv.setItem(14, red);
			}

			if(event.getCurrentItem().equals(Tools.enhanced_dwarven_pickaxe())) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount()-1);
				inv.getItem(2).setAmount(inv.getItem(2).getAmount()-1);
				inv.getItem(3).setAmount(inv.getItem(3).getAmount()-1);
				inv.getItem(10).setAmount(inv.getItem(10).getAmount()-1);
				inv.getItem(11).setAmount(inv.getItem(11).getAmount()-1);
				inv.getItem(12).setAmount(inv.getItem(12).getAmount()-1);
				inv.getItem(19).setAmount(inv.getItem(19).getAmount()-1);
				inv.getItem(20).setAmount(inv.getItem(20).getAmount()-1);
				inv.getItem(21).setAmount(inv.getItem(21).getAmount()-1);
				
				if(!((Player)event.getWhoClicked()).getGameMode().equals(GameMode.CREATIVE))
					((Player) event.getWhoClicked()).setLevel(((Player) event.getWhoClicked()).getLevel()-40);
				
				ItemStack red = new ItemStack(Material.RED_STAINED_GLASS_PANE);
				ItemMeta meta = red.getItemMeta();
				meta.setDisplayName(" ");
				red.setItemMeta(meta);
				inv.setItem(14, red);
			}
		}
	}
	
	@EventHandler
	public void closeInv(InventoryCloseEvent event) {
		InventoryView view = event.getView();
		if(view.getTitle().equals(MagmaticAnvil.getTitle())) {
			if(event.getInventory().getItem(1) != null)
				event.getPlayer().getWorld().dropItem(event.getPlayer().getLocation(), event.getInventory().getItem(1));
			if(event.getInventory().getItem(2) != null)
				event.getPlayer().getWorld().dropItem(event.getPlayer().getLocation(), event.getInventory().getItem(2));
			if(event.getInventory().getItem(3) != null)
				event.getPlayer().getWorld().dropItem(event.getPlayer().getLocation(), event.getInventory().getItem(3));
			if(event.getInventory().getItem(10) != null)
				event.getPlayer().getWorld().dropItem(event.getPlayer().getLocation(), event.getInventory().getItem(10));
			if(event.getInventory().getItem(11) != null)
				event.getPlayer().getWorld().dropItem(event.getPlayer().getLocation(), event.getInventory().getItem(11));
			if(event.getInventory().getItem(12) != null)
				event.getPlayer().getWorld().dropItem(event.getPlayer().getLocation(), event.getInventory().getItem(12));
			if(event.getInventory().getItem(19) != null)
				event.getPlayer().getWorld().dropItem(event.getPlayer().getLocation(), event.getInventory().getItem(19));
			if(event.getInventory().getItem(20) != null)
				event.getPlayer().getWorld().dropItem(event.getPlayer().getLocation(), event.getInventory().getItem(20));
			if(event.getInventory().getItem(21) != null)
				event.getPlayer().getWorld().dropItem(event.getPlayer().getLocation(), event.getInventory().getItem(21));

		}
	}
	
}
