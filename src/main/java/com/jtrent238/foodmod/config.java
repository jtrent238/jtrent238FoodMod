package com.jtrent238.foodmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;
import com.jtrent238.foodmod.ItemLoader;

public class config {
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent event) {
            // you will be able to find the config file in .minecraft/config/ and it will be named Dummy.cfg
            // here our Configuration has been instantiated, and saved under the name "config"
            // If the file doesn't already exist, it will be created.
            Configuration config = new Configuration(event.getSuggestedConfigurationFile());

            // loading the configuration from its file
            config.load();
            
 
            // saving the configuration to its file
            config.save();
    }
	
	
}
