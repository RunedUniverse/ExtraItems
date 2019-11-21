package listener;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.block.Biome;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import extraitems.main;
import items.Armor;
import items.Items;
import items.Weapons;

public class ActionListener implements Listener {

	public ActionListener(main plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void onHit(EntityDamageByEntityEvent e){ // Specialeffects
		if(e.getDamager() instanceof Player){
			Player player = (Player) e.getDamager();
			if(player.getInventory().getItemInMainHand() != null){
				try {
					ItemStack w = player.getInventory().getItemInMainHand();
				if(w.getItemMeta().getDisplayName().equals(Weapons.S1().getItemMeta().getDisplayName())){
					((LivingEntity) e.getEntity()).addPotionEffect(new PotionEffect(PotionEffectType.POISON, 200, 0), true);
				}
				} catch (Exception e2) {
				}
			}	
		}
	}
	
	@EventHandler(priority = EventPriority.HIGH)
	public void gotItemDamage(PlayerItemDamageEvent event){
		event.setCancelled(true);
		try{
		if(event.getItem().getItemMeta().getLore()!=null){
		List<String> itemLore = event.getItem().getItemMeta().getLore();
        String[] dura = itemLore.get(0).split("/");
        int dura0 = Integer.parseInt(dura[0]);
        int dura1 = Integer.parseInt(dura[1]);
        dura0 = dura0 - 1;
        if(dura0 != 0){
    		itemLore.set(0, Integer.toString(dura0)+"/"+Integer.toString(dura1));
            ItemMeta meta = event.getItem().getItemMeta();
            meta.setLore(itemLore);
            event.getItem().setItemMeta(meta);  
        }
        else {
            event.setDamage(100000);
        }
		}
		else {
			String lore;
			switch(event.getItem().getData().getItemType()){
        	case FLINT_AND_STEEL:
        		lore = "64/65";//----Durability-----
        		break;
        	case BOW:
        		lore = "384/385";
        		break;
        	case SHEARS:
        		lore = "237/238";
        		break;
        	case FISHING_ROD:
        		lore = "64/65";
        		break;
        	case SHIELD:
        		lore = "336/337";
        		break;
        	case ELYTRA:
        		lore = "431/432";
        		break;
        	
        	case WOOD_SPADE:
        		lore = "59/60";
        		break;
        	case WOOD_PICKAXE:
        		lore = "59/60";
        		break;
        	case WOOD_AXE:
        		lore = "59/60";
        		break;
        	case WOOD_SWORD:
        		lore = "59/60";
        		break;
        	case WOOD_HOE:
        		lore = "59/60";
        		break;
        		
        	case STONE_SPADE:
        		lore = "131/132";
        		break;
        	case STONE_PICKAXE:
        		lore = "131/132";
        		break;
        	case STONE_AXE:
        		lore = "131/132";
        		break;
        	case STONE_SWORD:
        		lore = "131/132";
        		break;
        	case STONE_HOE:
        		lore = "131/132";
        		break;
        		
        	case LEATHER_HELMET:
        		lore = "55/56";
        		break;
        	case LEATHER_CHESTPLATE:
        		lore = "80/81";
        		break;
        	case LEATHER_LEGGINGS:
        		lore = "75/76";
        		break;
        	case LEATHER_BOOTS:
        		lore = "65/66";
        		break;
        		
        	case IRON_SPADE:
        		lore = "250/251";
        		break;
        	case IRON_PICKAXE:
        		lore = "250/251";
        		break;
        	case IRON_AXE:
        		lore = "250/251";
        		break;
        	case IRON_SWORD:
        		lore = "250/251";
        		break;
        	case IRON_HOE:
        		lore = "250/251";
        		break;
        	case IRON_HELMET:
        		lore = "165/166";
        		break;
        	case IRON_CHESTPLATE:
        		lore = "240/241";
        		break;
        	case IRON_LEGGINGS:
        		lore = "225/226";
        		break;
        	case IRON_BOOTS:
        		lore = "195/196";
        		break;
        		
        	case GOLD_SPADE:
        		lore = "32/33";
        		break;
        	case GOLD_PICKAXE:
        		lore = "32/33";
        		break;
        	case GOLD_AXE:
        		lore = "32/33";
        		break;
        	case GOLD_SWORD:
        		lore = "32/33";
        		break;
        	case GOLD_HOE:
        		lore = "32/33";
        		break;
        	case GOLD_HELMET:
        		lore = "77/78";
        		break;
        	case GOLD_CHESTPLATE:
        		lore = "112/113";
        		break;
        	case GOLD_LEGGINGS:
        		lore = "105/106";
        		break;
        	case GOLD_BOOTS:
        		lore = "91/92";
        		break;
        		
        	case DIAMOND_SPADE:
        		lore = "1561/1562";
        		break;
        	case DIAMOND_PICKAXE:
        		lore = "1561/1562";
        		break;
        	case DIAMOND_AXE:
        		lore = "1561/1562";
        		break;
        	case DIAMOND_SWORD:
        		lore = "1561/1562";
        		break;
        	case DIAMOND_HOE:
        		lore = "1561/1562";
        		break;
        	case DIAMOND_HELMET:
        		lore = "363/364";
        		break;
        	case DIAMOND_CHESTPLATE:
        		lore = "528/529";
        		break;
        	case DIAMOND_LEGGINGS:
        		lore = "495/496";
        		break;
        	case DIAMOND_BOOTS:
        		lore = "429/430";
        		break;
			default:
				lore = " ";
				break;
        	}
			if(lore!=" "){
				ArrayList<String> itemLore = new ArrayList<String>();
				itemLore.add(lore);
				ItemMeta meta = event.getItem().getItemMeta();
	            meta.setLore(itemLore);
	            event.getItem().setItemMeta(meta);
			}
		}
		}catch(Exception e){e.printStackTrace();}
    }
	
	@EventHandler
    public void hasKilled(EntityDeathEvent event){
    	if(event.getEntity().getKiller() instanceof Player){
    		Player player = event.getEntity().getKiller();
    		if(event.getEntity() instanceof Monster){
    			Random rnd = new Random();
				if(rnd.nextInt(100) < 1){
					player.getWorld().dropItemNaturally(event.getEntity().getLocation(), Items.Diamond());
				}
    		}
    		if(event.getEntity() instanceof Skeleton){
    			if(player.getWorld().getBiome(event.getEntity().getLocation().getBlockX(), event.getEntity().getLocation().getBlockY())==Biome.DESERT||
    				player.getWorld().getBiome(event.getEntity().getLocation().getBlockX(), event.getEntity().getLocation().getBlockY())==Biome.DESERT_HILLS||
    				player.getWorld().getBiome(event.getEntity().getLocation().getBlockX(), event.getEntity().getLocation().getBlockY())==Biome.MUTATED_DESERT){
    				Random rnd = new Random();
    				if(rnd.nextInt(100) < 10){
    					player.getWorld().dropItemNaturally(event.getEntity().getLocation(), Armor.C1());
    				}
    			}
    		}
    		if(event.getEntity() instanceof Zombie){
    			
    		}
    		if(event.getEntity() instanceof Creeper){
    			
    		}
    		if(event.getEntity() instanceof Player){
    			
    		}
    	}
    }
}
