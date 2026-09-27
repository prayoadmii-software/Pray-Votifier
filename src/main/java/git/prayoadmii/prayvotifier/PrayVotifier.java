package git.prayoadmii.prayvotifier;

import org.bstats.bukkit.Metrics;
import org.bstats.charts.SimplePie;
import org.bukkit.plugin.java.JavaPlugin;

public class PrayVotifier extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

        getLogger().info("Pray Votifier Are Enabled! :3");

        int pluginId = 34350;
        Metrics metrics = new Metrics(this, pluginId);
        getLogger().info("bStats Now Started!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Pray Votifier Are Disabled! :P");
        getLogger().info("See You Later :D");
    }
}