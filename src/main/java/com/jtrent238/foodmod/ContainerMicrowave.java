package com.jtrent238.foodmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ContainerMicrowave extends Container
{
	private IInventory microwaveInventory;

	public ContainerMicrowave(IInventory playerInventory, TileEntityMicrowave microwaveInventory)
	{
		this.microwaveInventory = microwaveInventory;

		this.addSlotToContainer(new SlotMicrowave(microwaveInventory, 0, 65, 43));

		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 9; ++j)
			{
				this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, j * 18 + 8, i * 18 + 92));
			}
		}

		for (int i = 0; i < 9; i++)
		{
			this.addSlotToContainer(new Slot(playerInventory, i, i * 18 + 8, 150));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer player)
	{
		return this.microwaveInventory.isUseableByPlayer(player);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int slotNum)
	{
		ItemStack itemCopy = null;
		Slot slot = (Slot) this.inventorySlots.get(slotNum);

		if (slot != null && slot.getHasStack())
		{
			ItemStack item = slot.getStack();
			itemCopy = item.copy();

			if (slotNum < 1)
			{
				if (!this.mergeItemStack(item, 1, this.inventorySlots.size(), false))
				{
					return null;
				}
			}
			else if (slotNum > 0 && slotNum < 27)
			{
				if (!this.mergeItemStack(item, 27, this.inventorySlots.size(), true))
				{
					return null;
				}
			}
			else if (!this.mergeItemStack(item, 1, 27, false))
			{
				return null;
			}

			if (item.stackSize == 0)
			{
				slot.putStack((ItemStack) null);
			}
			else
			{
				slot.onSlotChanged();
			}
		}
		return null;
	}
	
	@Override
	public void onContainerClosed(EntityPlayer player)
	{
		super.onContainerClosed(player);
		this.microwaveInventory.closeInventory();
	}
}
