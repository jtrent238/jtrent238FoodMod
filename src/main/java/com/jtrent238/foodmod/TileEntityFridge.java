package com.jtrent238.foodmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;

public class TileEntityFridge extends TileEntity implements IInventory
{
	private ItemStack[] inventory = new ItemStack[15];
	private String customName;

	public int getSizeInventory()
	{
		return 15;
	}

	@Override
	public ItemStack getStackInSlot(int par1)
	{
		return this.inventory[par1];
	}

	@Override
	public ItemStack decrStackSize(int par1, int par2)
	{
		if (this.inventory[par1] != null)
		{
			ItemStack var3;

			if (this.inventory[par1].stackSize <= par2)
			{
				var3 = this.inventory[par1];
				this.inventory[par1] = null;
				this.markDirty();
				return var3;
			}
			var3 = this.inventory[par1].splitStack(par2);

			if (this.inventory[par1].stackSize == 0)
			{
				this.inventory[par1] = null;
			}

			this.markDirty();
			return var3;
		}
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int par1)
	{
		if (this.inventory[par1] != null)
		{
			ItemStack var2 = this.inventory[par1];
			this.inventory[par1] = null;
			return var2;
		}
		return null;
	}

	@Override
	public void setInventorySlotContents(int par1, ItemStack par2ItemStack)
	{
		this.inventory[par1] = par2ItemStack;

		if (par2ItemStack != null && par2ItemStack.stackSize > this.getInventoryStackLimit())
		{
			par2ItemStack.stackSize = this.getInventoryStackLimit();
		}

		this.markDirty();
	}

	/**
	 * Reads a tile entity from NBT.
	 */
	public void readFromNBT(NBTTagCompound tagCompound)
	{
		super.readFromNBT(tagCompound);
		NBTTagList tagList = (NBTTagList) tagCompound.getTag("Items");
		this.inventory = new ItemStack[this.getSizeInventory()];

		for (int count = 0; count < tagList.tagCount(); ++count)
		{
			NBTTagCompound nbt = (NBTTagCompound) tagList.getCompoundTagAt(count);
			int slot = nbt.getByte("Slot") & 255;

			if (slot >= 0 && slot < this.inventory.length)
			{
				this.inventory[slot] = ItemStack.loadItemStackFromNBT(nbt);
			}
		}

		if (tagCompound.hasKey("CustomName", 8))
		{
			this.customName = tagCompound.getString("CustomName");
		}
	}

	@Override
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeToNBT(par1NBTTagCompound);
		NBTTagList var2 = new NBTTagList();

		for (int var3 = 0; var3 < this.inventory.length; ++var3)
		{
			if (this.inventory[var3] != null)
			{
				NBTTagCompound var4 = new NBTTagCompound();
				var4.setByte("Slot", (byte) var3);
				this.inventory[var3].writeToNBT(var4);
				var2.appendTag(var4);
			}
		}

		par1NBTTagCompound.setTag("Items", var2);
	}
/*
	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt)
	{
		NBTTagCompound tagCom = pkt.getNbtCompound();
		this.readFromNBT(tagCom);
	}
*/
	/*
	@Override
	public Packet getDescriptionPacket()
	{
		NBTTagCompound tagCom = new NBTTagCompound();
		this.writeToNBT(tagCom);
		return new S35PacketUpdateTileEntity(pos, getBlockMetadata(), tagCom);
	}
*/
	@Override
	public int getInventoryStackLimit()
	{
		return 64;
	}
/*
	@Override
	public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer)
	{
		return this.worldObj.getTileEntity(pos) != this ? false : par1EntityPlayer.getDistanceSq(this.pos.getX() + 0.5D, this.pos.getY() + 0.5D, this.pos.getZ() + 0.5D) <= 64.0D;
	}
*/
	@Override
	public void invalidate()
	{
		this.updateContainingBlockInfo();
		super.invalidate();
	}

	@Override
	public boolean isItemValidForSlot(int par1, ItemStack par2ItemStack)
	{
		return true;
	}

	public String getName()
	{
		return this.hasCustomName() ? this.customName : "container.fridge";
	}

	public boolean hasCustomName()
	{
		return this.customName != null && this.customName.length() > 0;
	}

	public IChatComponent getDisplayName()
	{
		return new ChatComponentText(getName());
	}

	public void openInventory(EntityPlayer playerIn)
	{
	}

	public void closeInventory(EntityPlayer playerIn)
	{
	}

	public int getField(int id)
	{
		return 0;
	}

	public void setField(int id, int value)
	{
	}

	public int getFieldCount()
	{
		return 0;
	}

	public void clear()
	{
		for (int i = 0; i < inventory.length; i++)
		{
			inventory[i] = null;
		}
	}

	@Override
	public String getInventoryName() {
		return "container.fridge";
	}

	@Override
	public boolean hasCustomInventoryName() {
		return true;
	}

	@Override
	public void openInventory() {
		
	}

	@Override
	public void closeInventory() {
		
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
		return true;
	}
}
