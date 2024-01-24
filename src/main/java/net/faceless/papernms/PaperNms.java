package net.faceless.papernms;

import net.faceless.papernms.commands.TestCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class PaperNms extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("test").setExecutor(new TestCommand());

    }

    @Override
    public void onDisable() {

    }
}
