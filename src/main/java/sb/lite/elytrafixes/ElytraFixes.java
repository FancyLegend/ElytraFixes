package sb.lite.elytrafixes;

import org.bukkit.plugin.java.JavaPlugin;
import sb.lite.elytrafixes.listener.ElytraListener;

public final class ElytraFixes extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ElytraListener(), this);
    }

    @Override
    public void onDisable() {
    }
}