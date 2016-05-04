package com.jtrent238.foodmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerFreezer extends Container
{
	private IInventory freezerInventory;

	public ContainerFreezer(IInventory playerInventory, IInventory freezerInventory)
	{
		this.freezerInventory = freezerInventory;
		freezerInventory.openInventory();

		this.addSlotToContainer(new Slot(freezerInventory, 0, 63, 27));
		this.addSlotToContainer(new Slot(freezerInventory, 1, 32, 27));
		this.addSlotToContainer(new SlotFreezer(freezerInventory, 2, 123, 27));

		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 9; ++j)
			{
				this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, j * 18 + 8, i * 18 + 84));
			}
		}

		for (int i = 0; i < 9; i++)
		{
			this.addSlotToContainer(new Slot(playerInventory, i, i * 18 + 8, 142));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer par1EntityPlayer)
	{
		return this.freezerInventory.isUseableByPlayer(par1EntityPlayer);
	}

	@Override
	public ItemStack slotClick(int slotNum, int clickedButton, int mode, EntityPlayer player)
	{
		if (slotNum == 2)
		{
			Slot var4 = (Slot) this.inventorySlots.get(slotNum);
			if (var4 != null && var4.getHasStack())
			{
				//player.triggerAchievement(FurnitureAchievements.freezeItem);
			}
		}
		return super.slotClick(slotNum, clickedButton, mode, player);
	}
/*
	public ItemStack transferStackInSlot(EntityPlayer player, int slotNum)
	{
		ItemStack itemCopy = null;
		Slot slot = (Slot) this.inventorySlots.get(slotNum);

		if (slot != null && slot.getHasStack())
		{
			ItemStack item = slot.getStack();
			itemCopy = item.copy();

			if (slotNum == 2)
			{
				if (!this.mergeItemStack(item, 3, 39, true))
				{
					return null;
				}

				slot.onSlotChange(item, itemCopy);
			}
			else if (slotNum != 1 && slotNum != 0)
			{
				RecipeData data = RecipeAPI.getFreezerRecipeFromInput(item);

				if (data != null)
				{
					if (!this.mergeItemStack(item, 0, 1, false))
					{
						return null;
					}
				}
				else if (TileEntityFreezer.isItemFuel(item))
				{
					if (!this.mergeItemStack(item, 1, 2, false))
					{
						return null;
					}
				}
				else if (slotNum >= 3 && slotNum < 30)
				{
					if (!this.mergeItemStack(item, 30, 39, false))
					{
						return null;
					}
				}
				else if (slotNum >= 30 && slotNum < 39 && !this.mergeItemStack(item, 3, 30, false))
				{
					return null;
				}
			}
			else if (!this.mergeItemStack(item, 3, 39, false))
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

			if (item.stackSize == itemCopy.stackSize)
			{
				return null;
			}

			slot.onPickupFromSlot(player, item);
		}

		return itemCopy;
	}
*/
}
