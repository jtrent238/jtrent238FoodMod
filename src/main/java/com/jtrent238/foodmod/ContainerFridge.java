package com.jtrent238.foodmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ContainerFridge extends Container
{
	private IInventory lowerChestInventory;
	private int numRows;

	public ContainerFridge(IInventory playerInventory, IInventory fridgeInventory)
	{
		this.lowerChestInventory = playerInventory;
		fridgeInventory.openInventory();
		int var4, var5;

		int count = 0;
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				this.addSlotToContainer(new SlotFridge(fridgeInventory, count, j * 18 + 44, i * 18 + 18));
				count++;
			}
		}

		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 9; ++j)
			{
				this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, j * 18 + 8, i * 18 + 85));
			}
		}

		for (int i = 0; i < 9; i++)
		{
			this.addSlotToContainer(new Slot(playerInventory, i, i * 18 + 8, 143));
		}
	}

	public boolean canInteractWith(EntityPlayer par1EntityPlayer)
	{
		return this.lowerChestInventory.isUseableByPlayer(par1EntityPlayer);
	}

	public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
	{
		ItemStack var3 = null;
		Slot var4 = (Slot) this.inventorySlots.get(par2);

		if (var4 != null && var4.getHasStack())
		{
			ItemStack var5 = var4.getStack();
			var3 = var5.copy();

			if (!(var5.getItem() instanceof ItemFood))
				return null;

			if (par2 < 16)
			{
				if (!this.mergeItemStack(var5, 16, this.inventorySlots.size(), true))
				{
					return null;
				}
			}
			else if (!this.mergeItemStack(var5, 0, 16, false))
			{
				return null;
			}

			if (var5.stackSize == 0)
			{
				var4.putStack((ItemStack) null);
			}
			else
			{
				var4.onSlotChanged();
			}
		}

		return var3;
	}

	/**
	 * Callback for when the crafting gui is closed.
	 */
	public void onContainerClosed(EntityPlayer par1EntityPlayer)
	{
		super.onContainerClosed(par1EntityPlayer);
		this.lowerChestInventory.closeInventory();
	}

	public IInventory func_85151_d()
	{
		return this.lowerChestInventory;
	}
}
