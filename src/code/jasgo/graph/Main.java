package code.jasgo.graph;

import org.bukkit.ChatColor;
import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import code.jasgo.graph.utils.Graph;

public class Main extends JavaPlugin {

	public static boolean draw = false;
	String prefix = ChatColor.GREEN + "[ " + ChatColor.ITALIC + ChatColor.YELLOW + "삼각함수" + ChatColor.GREEN + " ] ";

	@Override
	public void onEnable() {
		// TODO Auto-generated method stub
		super.onEnable();
	}

	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		super.onDisable();
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (label.equalsIgnoreCase("dg")) {
			if (args.length >= 1) {
				if (args[0].equalsIgnoreCase("start")) {
					if (args.length >= 2) {
						if (args[1].equalsIgnoreCase("sin")) {
							if (args.length == 6) {
								draw = true;
								Graph.singraph(((Player) sender).getLocation(), Particle.valueOf(args[2].toUpperCase()),
										Integer.parseInt(args[3]), Integer.parseInt(args[4]),
										Integer.parseInt(args[5]));
							}
						} else if (args[1].equalsIgnoreCase("cos")) {
							if (args.length == 3) {
								draw = true;
								Graph.cosgraph(((Player) sender).getLocation(), Particle.valueOf(args[2].toUpperCase()),
										Integer.parseInt(args[3]), Integer.parseInt(args[4]),
										Integer.parseInt(args[5]));
							}
						} else if (args[1].equalsIgnoreCase("tan")) {
							if (args.length == 3) {
								draw = true;
								Graph.tangraph(((Player) sender).getLocation(), Particle.valueOf(args[2].toUpperCase()),
										Integer.parseInt(args[3]), Integer.parseInt(args[4]),
										Integer.parseInt(args[5]));
							}
						} else if (args[1].equalsIgnoreCase("csc")) {
							if (args.length == 3) {
								draw = true;
								Graph.cscgraph(((Player) sender).getLocation(), Particle.valueOf(args[2].toUpperCase()),
										Integer.parseInt(args[3]), Integer.parseInt(args[4]),
										Integer.parseInt(args[5]));
							}
						} else if (args[1].equalsIgnoreCase("sec")) {
							if (args.length == 3) {
								draw = true;
								Graph.secgraph(((Player) sender).getLocation(), Particle.valueOf(args[2].toUpperCase()),
										Integer.parseInt(args[3]), Integer.parseInt(args[4]),
										Integer.parseInt(args[5]));
							}
						} else if (args[1].equalsIgnoreCase("cot")) {
							if (args.length == 3) {
								draw = true;
								Graph.cotgraph(((Player) sender).getLocation(), Particle.valueOf(args[2].toUpperCase()),
										Integer.parseInt(args[3]), Integer.parseInt(args[4]),
										Integer.parseInt(args[5]));
							}
						} else if (args[1].equalsIgnoreCase("asin")) {
							if (args.length == 3) {
								draw = true;
								Graph.asingraph(((Player) sender).getLocation(),
										Particle.valueOf(args[2].toUpperCase()), Integer.parseInt(args[3]),
										Integer.parseInt(args[4]), Integer.parseInt(args[5]));
							}
						} else if (args[1].equalsIgnoreCase("acos")) {
							if (args.length == 3) {
								draw = true;
								Graph.acosgraph(((Player) sender).getLocation(),
										Particle.valueOf(args[2].toUpperCase()), Integer.parseInt(args[3]),
										Integer.parseInt(args[4]), Integer.parseInt(args[5]));
							}
						} else if (args[1].equalsIgnoreCase("atan")) {
							if (args.length == 3) {
								draw = true;
								Graph.atangraph(((Player) sender).getLocation(),
										Particle.valueOf(args[2].toUpperCase()), Integer.parseInt(args[3]),
										Integer.parseInt(args[4]), Integer.parseInt(args[5]));
							}
						} else if (args[1].equalsIgnoreCase("acsc")) {
							if (args.length == 3) {
								draw = true;
								Graph.acscgraph(((Player) sender).getLocation(),
										Particle.valueOf(args[2].toUpperCase()), Integer.parseInt(args[3]),
										Integer.parseInt(args[4]), Integer.parseInt(args[5]));
							}
						} else if (args[1].equalsIgnoreCase("asec")) {
							if (args.length == 3) {
								draw = true;
								Graph.asecgraph(((Player) sender).getLocation(),
										Particle.valueOf(args[2].toUpperCase()), Integer.parseInt(args[3]),
										Integer.parseInt(args[4]), Integer.parseInt(args[5]));
							}
						} else if (args[1].equalsIgnoreCase("acot")) {
							if (args.length == 3) {
								draw = true;
								Graph.acotgraph(((Player) sender).getLocation(),
										Particle.valueOf(args[2].toUpperCase()), Integer.parseInt(args[3]),
										Integer.parseInt(args[4]), Integer.parseInt(args[5]));
							}
						}
					}
				} else if (args[0].equalsIgnoreCase("stop")) {
					draw = false;
				} else if (args[0].equalsIgnoreCase("help")) {
					sender.sendMessage(
							prefix + ChatColor.GOLD + "/dg start sin <파티클(String)> <주기(int)> <최댓값(int)> <길이(int)>");
					sender.sendMessage(
							prefix + ChatColor.GOLD + "/dg start cos <파티클(String)> <주기(int)> <최댓값(int)> <길이(int)>");
					sender.sendMessage(
							prefix + ChatColor.GOLD + "/dg start tan <파티클(String)> <주기(int)> <최댓값(int)> <길이(int)>");
					sender.sendMessage(
							prefix + ChatColor.GOLD + "/dg start csc <파티클(String)> <주기(int)> <최댓값(int)> <길이(int)>");
					sender.sendMessage(
							prefix + ChatColor.GOLD + "/dg start sec <파티클(String)> <주기(int)> <최댓값(int)> <길이(int)>");
					sender.sendMessage(
							prefix + ChatColor.GOLD + "/dg start cot <파티클(String)> <주기(int)> <최댓값(int)> <길이(int)>");
					sender.sendMessage(
							prefix + ChatColor.GOLD + "/dg start asin <파티클(String)> <주기(int)> <최댓값(int)> <길이(int)>");
					sender.sendMessage(
							prefix + ChatColor.GOLD + "/dg start acos <파티클(String)> <주기(int)> <최댓값(int)> <길이(int)>");
					sender.sendMessage(
							prefix + ChatColor.GOLD + "/dg start atan <파티클(String)> <주기(int)> <최댓값(int)> <길이(int)>");
					sender.sendMessage(
							prefix + ChatColor.GOLD + "/dg start acsc <파티클(String)> <주기(int)> <최댓값(int)> <길이(int)>");
					sender.sendMessage(
							prefix + ChatColor.GOLD + "/dg start asec <파티클(String)> <주기(int)> <최댓값(int)> <길이(int)>");
					sender.sendMessage(
							prefix + ChatColor.GOLD + "/dg start acot <파티클(String)> <주기(int)> <최댓값(int)> <길이(int)>");
					sender.sendMessage(prefix + ChatColor.GOLD + "/dg stop (모든 그래프 지우기)");
				}
			}
		}
		return false;
	}
}
