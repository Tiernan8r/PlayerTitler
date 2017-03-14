package me.Tiernanator.PlayerTitler.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.Tiernanator.Packets.Titler.PlayerTitler;
import me.Tiernanator.PlayerTitler.Main;
import net.minecraft.server.v1_11_R1.PacketPlayOutTitle.EnumTitleAction;

public class PlayerJoinTitler implements Listener {

	// 20 ticks = 1 second
	private int fadeInTicks = 20;
	private int stayTicks = 40;
	private int fadeOutTicks = 30;
	

	public PlayerJoinTitler(Main main) {
	}


	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		
		Player player = event.getPlayer();

//		if (PlayerLogger.ifPlayerHasPlayedBefore(player)) {
		if(player.hasPlayedBefore()) {
			
			PlayerTitler.playerTitle(player, "Welcome Back!", true, false, false, ChatColor.BLUE, fadeInTicks, stayTicks, fadeOutTicks, EnumTitleAction.TITLE);
			
		} else {

			PlayerTitler.playerTitle(player, "Welcome!", true, false, false, ChatColor.BLUE, fadeInTicks, stayTicks, fadeOutTicks, EnumTitleAction.TITLE);
			
		}
		PlayerTitler.playerTitle(player, "Enjoy your Play!", true, true, true, ChatColor.DARK_PURPLE, fadeInTicks * 2, stayTicks * 2, fadeOutTicks * 2, EnumTitleAction.SUBTITLE);


	}

}