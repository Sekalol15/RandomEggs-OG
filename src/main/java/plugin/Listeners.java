// This is free and unencumbered software released into the public domain
// Author: s0me0ne-coder
package plugin;

import java.util.Random;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import io.papermc.paper.event.block.DragonEggFormEvent;
public class Listeners implements Listener {
  
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onDragonEggDrop(DragonEggFormEvent event) {
  	        Random r = new Random();
		// 10% chance
		if (r.nextDouble() < 0.1) {event.setCancelled(false);}
		else {event.setCancelled(true);}
	}
  
}
