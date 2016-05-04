package com.jtrent238.foodmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotMicrowave extends Slot
{
	private TileEntityMicrowave microwave;

	public SlotMicrowave(TileEntityMicrowave microwave, int id, int x, int y)
	{
		super(microwave, id, x, y);
		this.microwave = microwave;
	}

	@Override
	public boolean isItemValid(ItemStack item)
	{
		if (microwave.isCooking())
		{
			return false;
		}
		return true;
	}

	@Override
	public boolean canTakeStack(EntityPlayer player)
	{
		if (microwave.isCooking())
		{
			return false;
		}
		return true;
	}
}
