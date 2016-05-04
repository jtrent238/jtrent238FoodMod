package com.jtrent238.foodmod;

import net.minecraft.item.ItemStack;

public abstract interface ISimpleInventory
{
	public int getSize();

	public ItemStack getItem(int i);
	
	public void clear();
}
