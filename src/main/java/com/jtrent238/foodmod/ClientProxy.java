package com.jtrent238.foodmod;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;


public class ClientProxy{private FMLPostInitializationEvent ModUpdater;

FMLPostInitializationEvent event() {

	FoodMod.versionChecker = new VersionChecker();
	Thread versionCheckThread = new Thread(FoodMod.versionChecker, "Version Check");
	versionCheckThread.start();
	return ModUpdater;
	}

}