package io.github.mittosaurus;
import org.bukkit.plugin.java.JavaPlugin;

public class AFKplugin extends JavaPlugin {

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new Yeet(), this);
	}
    @Override
    public void onDisable() {

    }
}
