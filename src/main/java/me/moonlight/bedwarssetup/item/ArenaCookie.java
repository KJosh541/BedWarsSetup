package me.moonlight.bedwarssetup.item;

import me.moonlight.bedwarssetup.Main;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;

import static me.moonlight.bedwarssetup.util.MethodUtils.EMPTY_LINE;


/**
 * Arena Cookie Item Class
 */
public class ArenaCookie extends AbstractItem {


    public ArenaCookie(Main main) {
        super(main, "ARENA_COOKIE", Material.COOKIE, 1, true, false, "&5Arena Cookie",
                "&6Set Waiting Spawn &e&lRIGHT CLICK",
                "&7Set the arena's waiting spawn on",
                "&7your current location.",
                EMPTY_LINE,
                "&6Set Spectator Spawn &e&LLEFT CLICK",
                "&7Set the arena's spectator spawn on",
                "&7your current location."
        );
    }

    @Override
    public void onItemRightClick(PlayerInteractEvent event, Player player) {
        event.setCancelled(true);
        player.performCommand("bw setWaitingSpawn");
    }

    @Override
    public void onItemLeftClick(PlayerInteractEvent event, Player player) {
        event.setCancelled(true);
        player.performCommand("bw setSpectSpawn");
    }
}
