package me.Tiernanator.PlayerTitler.Schedules;

import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import me.Tiernanator.PlayerTitler.PlayerTitlerMain;
import me.Tiernanator.Utilities.MetaData.MetaData;

public class PlayerBar extends BukkitRunnable {

	private static PlayerTitlerMain plugin;

	public PlayerBar(PlayerTitlerMain main) {
		plugin = main;
	}
	
	@Override
	public void run() {
		
//		Collection<? extends Player> onlinePlayers = plugin.getServer().getOnlinePlayers();
//		for(Player player : onlinePlayers) {
//			BossBar bossBar = getBar(player);
//			if(bossBar == null) {
//				bossBar = Bukkit.createBossBar(ChatColor.BOLD + "Test", BarColor.PINK, BarStyle.SEGMENTED_20);
//				bossBar.addPlayer(player);
//				bossBar.setProgress(0);
//			} else {
//				bossBar.setProgress(bossBar.getProgress() + 0.05);
//			}
//			if(bossBar.getProgress() >= 1) {
//				bossBar.setProgress(0);
//			}
//			MetaData.setMetadata(player, "Bar", bossBar, plugin);
//		}
//		
		
	}
	
	@SuppressWarnings("unused")
	private BossBar getBar(Player player) {
		return (BossBar) MetaData.getMetadata(player, "Bar", plugin);
	}

}
