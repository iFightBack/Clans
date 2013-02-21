package Cmds;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CmdCreate extends JavaPlugin {
	public boolean Create(Command sender, Command cmd, String[] args) {
	Player player = (Player) sender;	
	if (args[0].equalsIgnoreCase("create") &&
		args[1].equalsIgnoreCase("")) {
		if(sender instanceof Player) {
		ArrayList<String> clan = new ArrayList<String>();
		clan.add(player.getName());
		//for (Player p : Bukkit.getOnlinePlayers()) {
		
				}
			}
		return false;
	}
}
