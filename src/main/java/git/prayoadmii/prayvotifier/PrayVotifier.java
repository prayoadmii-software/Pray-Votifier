package git.prayoadmii.prayvotifier;

import org.bukkit.plugin.java.JavaPlugin;

public class PrayVotifier extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

        getLogger().info("PrayVotifier enabled! :3");
    }

    @Override
    public void onDisable() {
        getLogger().info("PrayVotifier disabled!");
    }
}