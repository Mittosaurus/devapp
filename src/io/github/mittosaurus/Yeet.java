package io.github.mittosaurus;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Yeet implements Listener {
	
	
	@EventHandler
	public void afk(BlockDamageEvent event) {
		Player player = event.getPlayer();
		Block block = event.getBlock();
		PlayerInventory inventory = player.getInventory();
		Material material = block.getType();
		ItemStack item = inventory.getItemInMainHand();
		Material dimmi = item.getType();
		
		if (material == Material.WOODEN_DOOR && dimmi == Material.DIAMOND_SPADE){
				player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 5, 5));
			}
		}
	
	@EventHandler
	public void afkbreak(BlockBreakEvent event) {
		Player player = event.getPlayer();
		Block block = event.getBlock();
		PlayerInventory inventory = player.getInventory();
		Material material = block.getType();
		ItemStack item = inventory.getItemInMainHand();
		Material dimmi = item.getType();
		
		if (material == Material.WOODEN_DOOR && dimmi == Material.DIAMOND_SPADE){
			player.sendMessage(ChatColor.DARK_RED + "You have broken this door down!");
			}
	}
}