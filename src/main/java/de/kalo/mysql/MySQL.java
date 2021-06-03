package de.kalo.mysql;

import de.kalo.mysql.utils.SQL;
import org.bukkit.plugin.java.JavaPlugin;

public class MySQL extends JavaPlugin {

    private static SQL instance;

    @Override
    public void onEnable() {
        // Plugin startup logi
        
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static SQL getInstance() {
        return instance;
    }
}
