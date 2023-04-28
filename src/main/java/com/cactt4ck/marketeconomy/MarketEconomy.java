package com.cactt4ck.marketeconomy;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

public final class MarketEconomy extends JavaPlugin {

    @Override
    public void onEnable() {
        this.saveDefaultConfig();



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public @NotNull FileConfiguration getConfig() {
        return super.getConfig();
    }

    @Override
    public void reloadConfig() {
        super.reloadConfig();
    }
}
