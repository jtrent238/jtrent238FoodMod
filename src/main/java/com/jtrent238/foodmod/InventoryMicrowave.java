package com.jtrent238.foodmod;

import cofh.api.core.ICustomInventory;
import cofh.lib.gui.container.CustomInventoryWrapper;
import net.minecraft.item.ItemStack;

public class InventoryMicrowave extends CustomInventoryWrapper {

	public InventoryMicrowave(ICustomInventory arg0, int arg1) {
		super(arg0, arg1);
		this.getInventoryName();
	}

}
