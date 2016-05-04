package com.jtrent238.foodmod;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCookieJar extends TileEntity implements ISimpleInventory
{
	/*
	@Override
	public int getSize()
	{
		return ((Integer) getBlockType().getMetaFromState(getWorld().getBlockState(getPos()))).intValue();
	}
*/
	@Override
	public ItemStack getItem(int i)
	{
		return new ItemStack(Items.cookie);
	}

	@Override
	public void clear()
	{
	}

	@Override
	public int getSize() {
		return 2;
	}
}
