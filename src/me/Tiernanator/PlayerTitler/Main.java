package me.Tiernanator.PlayerTitler;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

import me.Tiernanator.PlayerTitler.Events.PlayerJoinTitler;
import me.Tiernanator.PlayerTitler.Schedules.PlayerBar;


public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		registerCommands();
		registerEvents();
//		registerTasks();
	}

	@Override
	public void onDisable() {
		
//		Collection<? extends Player> onlinePlayers = this.getServer().getOnlinePlayers();
//		for(Player player : onlinePlayers) {
//			BossBar bossBar = (BossBar) MetaData.getMetadata(player, "Bar", this);
//			if(!(bossBar == null)) {
//				bossBar.removeAll();
//			}
//		}

	}

	public void registerCommands() {

	}

	public void registerEvents() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new PlayerJoinTitler(this), this);
	}

	@SuppressWarnings("unused")
	private void registerTasks() {
		//in runTaskTimer() first number is how long you wait the first time to start it
		// the second is how long between iterations
		BukkitTask barUpdaterTask = new PlayerBar(this).runTaskTimer(this, 0, 20);
		
	}

}
