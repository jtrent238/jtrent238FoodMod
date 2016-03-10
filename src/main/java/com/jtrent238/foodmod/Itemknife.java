package com.jtrent238.foodmod;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class Itemknife extends ItemSword{

	private ItemStack knife;

	public Itemknife(ToolMaterial iron) {
		super(iron);
		this.setFull3D();
		this.setMaxStackSize(1);
		this.isDamageable();
		this.isItemTool(knife);
		this.doesContainerItemLeaveCraftingGrid(false);
		this.isRepairable();

	}
	private void doesContainerItemLeaveCraftingGrid(boolean b) {

		
	}




}
