package com.jtrent238.foodmod;

import cofh.api.core.ICustomInventory;
import cofh.lib.gui.container.CustomInventoryWrapper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemFood;

public class InventoryLoader {

	public static ICustomInventory inventorymicrowave;
	
	public static void LoadInventorys() {
		
		inventorymicrowave = CustomInventoryWrapper(inventorymicrowave, 0);
	    
	}
	
	private static ICustomInventory CustomInventoryWrapper(ICustomInventory inventorymicrowave2, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void RegisterInventorys(){
	
        registerinventory(inventorymicrowave, "inventorymicrowave");
	}

	private static void registerinventory(ICustomInventory inventorymicrowave2, String string) {
		
	}
	
	}

