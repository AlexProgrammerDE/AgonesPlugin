package net.pistonmaster.agonesplugin;

import dev.agones.AgonesSDK;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.server.ServerLoadEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.concurrent.TimeUnit;

public final class AgonesPlugin extends JavaPlugin implements Listener {
    private final AgonesSDK agonesSDK = new AgonesSDK();

    @Override
    public void onEnable() {
        getLogger().info("Starting Agones SDK Helth Checks");
        agonesSDK.startHealthTask(30, TimeUnit.SECONDS);
        getLogger().info("Registering Agones SDK Ready and Player Checks");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onServerLoad(ServerLoadEvent event) {
        agonesSDK.ready();
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        agonesSDK.alpha().playerConnect(event.getPlayer().getUniqueId().toString());
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        agonesSDK.alpha().playerDisconnect(event.getPlayer().getUniqueId().toString());
    }
}
