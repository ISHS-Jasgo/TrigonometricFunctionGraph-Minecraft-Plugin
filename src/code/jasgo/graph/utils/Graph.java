package code.jasgo.graph.utils;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.scheduler.BukkitRunnable;

import code.jasgo.graph.Main;

public class Graph {
	public static void singraph(Location loc, Particle p, int cycle, int max, int length) {
		new BukkitRunnable() {

			@Override
			public void run() {
				if (Main.draw) {
					for (double x = 0; x <= length; x += 0.1) {
						double y = loc.getY() + Math.sin(Math.toRadians(x) * cycle) * max;
						double z = loc.getZ();
						loc.getWorld().spawnParticle(Particle.FLAME, new Location(loc.getWorld(), loc.getX() + x, y, z),
								2, 0, 0, 0, 0.0001);
					}
				} else {
					this.cancel();
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0L, 20L);
	}

	public static void cosgraph(Location loc, Particle p, int cycle, int max, int length) {
		new BukkitRunnable() {

			@Override
			public void run() {
				if (Main.draw) {
					for (double x = 0; x <= length; x += 0.1) {
						double y = loc.getY() + Math.cos(Math.toRadians(x) * cycle) * max;
						double z = loc.getZ();
						loc.getWorld().spawnParticle(Particle.FLAME, new Location(loc.getWorld(), loc.getX() + x, y, z),
								2, 0, 0, 0, 0.0001);
					}
				} else {
					this.cancel();
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0L, 20L);
	}

	public static void tangraph(Location loc, Particle p, int cycle, int max, int length) {
		new BukkitRunnable() {

			@Override
			public void run() {
				if (Main.draw) {
					for (double x = 0; x <= length; x += 0.1) {
						double y = loc.getY() + Math.tan(Math.toRadians(x) * cycle) * max;
						double z = loc.getZ();
						loc.getWorld().spawnParticle(Particle.FLAME, new Location(loc.getWorld(), loc.getX() + x, y, z),
								2, 0, 0, 0, 0.0001);
					}
				} else {
					this.cancel();
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0L, 20L);
	}

	public static void cscgraph(Location loc, Particle p, int cycle, int max, int length) {
		new BukkitRunnable() {

			@Override
			public void run() {
				if (Main.draw) {
					for (double x = 0; x <= length; x += 0.1) {
						double y = loc.getY() + (1 / (Math.sin(Math.toRadians(x) * cycle))) * max;
						double z = loc.getZ();
						loc.getWorld().spawnParticle(Particle.FLAME, new Location(loc.getWorld(), loc.getX() + x, y, z),
								2, 0, 0, 0, 0.0001);
					}
				} else {
					this.cancel();
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0L, 20L);
	}

	public static void secgraph(Location loc, Particle p, int cycle, int max, int length) {
		new BukkitRunnable() {

			@Override
			public void run() {
				if (Main.draw) {
					for (double x = 0; x <= length; x += 0.1) {
						double y = loc.getY() + (1 / (Math.cos(Math.toRadians(x) * cycle))) * max;
						double z = loc.getZ();
						loc.getWorld().spawnParticle(Particle.FLAME, new Location(loc.getWorld(), loc.getX() + x, y, z),
								2, 0, 0, 0, 0.0001);
					}
				} else {
					this.cancel();
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0L, 20L);
	}

	public static void cotgraph(Location loc, Particle p, int cycle, int max, int length) {
		new BukkitRunnable() {

			@Override
			public void run() {
				if (Main.draw) {
					for (double x = 0; x <= length; x += 0.1) {
						double y = loc.getY() + (1 / (Math.tan(Math.toRadians(x) * cycle))) * max;
						double z = loc.getZ();
						loc.getWorld().spawnParticle(Particle.FLAME, new Location(loc.getWorld(), loc.getX() + x, y, z),
								2, 0, 0, 0, 0.0001);
					}
				} else {
					this.cancel();
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0L, 20L);
	}

	public static void asingraph(Location loc, Particle p, int cycle, int max, int length) {
		new BukkitRunnable() {

			@Override
			public void run() {
				if (Main.draw) {
					for (double x = 0; x <= length; x += 0.1) {
						double y = loc.getY() + Math.asin(Math.toRadians(x) * cycle) * max;
						double z = loc.getZ();
						loc.getWorld().spawnParticle(Particle.FLAME, new Location(loc.getWorld(), loc.getX() + x, y, z),
								2, 0, 0, 0, 0.0001);
					}
				} else {
					this.cancel();
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0L, 20L);
	}

	public static void acosgraph(Location loc, Particle p, int cycle, int max, int length) {
		new BukkitRunnable() {

			@Override
			public void run() {
				if (Main.draw) {
					for (double x = 0; x <= length; x += 0.1) {
						double y = loc.getY() + Math.acos(Math.toRadians(x) * cycle) * max;
						double z = loc.getZ();
						loc.getWorld().spawnParticle(Particle.FLAME, new Location(loc.getWorld(), loc.getX() + x, y, z),
								2, 0, 0, 0, 0.0001);
					}
				} else {
					this.cancel();
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0L, 20L);
	}

	public static void atangraph(Location loc, Particle p, int cycle, int max, int length) {
		new BukkitRunnable() {

			@Override
			public void run() {
				if (Main.draw) {
					for (double x = 0; x <= length; x += 0.1) {
						double y = loc.getY() + Math.atan(Math.toRadians(x) * cycle) * max;
						double z = loc.getZ();
						loc.getWorld().spawnParticle(Particle.FLAME, new Location(loc.getWorld(), loc.getX() + x, y, z),
								2, 0, 0, 0, 0.0001);
					}
				} else {
					this.cancel();
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0L, 20L);
	}

	public static void acscgraph(Location loc, Particle p, int cycle, int max, int length) {
		new BukkitRunnable() {

			@Override
			public void run() {
				if (Main.draw) {
					for (double x = 0; x <= length; x += 0.1) {
						double y = loc.getY() + (1 / (Math.asin(Math.toRadians(x) * cycle))) * max;
						double z = loc.getZ();
						loc.getWorld().spawnParticle(Particle.FLAME, new Location(loc.getWorld(), loc.getX() + x, y, z),
								2, 0, 0, 0, 0.0001);
					}
				} else {
					this.cancel();
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0L, 20L);
	}

	public static void asecgraph(Location loc, Particle p, int cycle, int max, int length) {
		new BukkitRunnable() {

			@Override
			public void run() {
				if (Main.draw) {
					for (double x = 0; x <= length; x += 0.1) {
						double y = loc.getY() + (1 / (Math.acos(Math.toRadians(x) * cycle))) * max;
						double z = loc.getZ();
						loc.getWorld().spawnParticle(Particle.FLAME, new Location(loc.getWorld(), loc.getX() + x, y, z),
								2, 0, 0, 0, 0.0001);
					}
				} else {
					this.cancel();
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0L, 20L);
	}

	public static void acotgraph(Location loc, Particle p, int cycle, int max, int length) {
		new BukkitRunnable() {

			@Override
			public void run() {
				if (Main.draw) {
					for (double x = 0; x <= length; x += 0.1) {
						double y = loc.getY() + (1 / (Math.atan(Math.toRadians(x) * cycle))) * max;
						double z = loc.getZ();
						loc.getWorld().spawnParticle(Particle.FLAME, new Location(loc.getWorld(), loc.getX() + x, y, z),
								2, 0, 0, 0, 0.0001);
					}
				} else {
					this.cancel();
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0L, 20L);
	}

	public static void powgraph(Location loc, Particle p, int pow, int length) {
		new BukkitRunnable() {

			@Override
			public void run() {
				if (Main.draw) {
					for (double x = 0; x <= length; x += 0.1) {
						double y = loc.getY() + Math.pow(pow, x);
						double z = loc.getZ();
						loc.getWorld().spawnParticle(Particle.FLAME, new Location(loc.getWorld(), loc.getX() + x, y, z),
								2, 0, 0, 0, 0.0001);
					}
				} else {
					this.cancel();
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0L, 20L);
	}

	public static void loggraph(Location loc, Particle p, int length) {
		new BukkitRunnable() {

			@Override
			public void run() {
				if (Main.draw) {
					for (double x = 0; x <= length; x += 0.1) {
						double y = loc.getY() + Math.log(x);
						double z = loc.getZ();
						loc.getWorld().spawnParticle(Particle.FLAME, new Location(loc.getWorld(), loc.getX() + x, y, z),
								2, 0, 0, 0, 0.0001);
					}
				} else {
					this.cancel();
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0L, 20L);
	}

}
