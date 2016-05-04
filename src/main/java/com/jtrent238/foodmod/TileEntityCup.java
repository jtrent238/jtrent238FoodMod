package com.jtrent238.foodmod;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCup extends TileEntity implements ISimpleInventory
{
	private ItemStack item = null;
	public int red, green, blue;

	public void setItem(ItemStack item)
	{
		this.item = item.copy();
	}

	public void setColour(int[] rgb)
	{
		this.red = rgb[0];
		this.green = rgb[1];
		this.blue = rgb[2];
	}

	public ItemStack getDrink()
	{
		return item;
	}

	@Override
	public void readFromNBT(NBTTagCompound tagCompound)
	{
		super.readFromNBT(tagCompound);
		if (tagCompound.hasKey("Item"))
		{
			NBTTagList tagList = (NBTTagList) tagCompound.getTag("Item");
			if (tagList.tagCount() > 0)
			{
				this.item = ItemStack.loadItemStackFromNBT(tagList.getCompoundTagAt(0));
			}
		}
		this.red = tagCompound.getInteger("Red");
		this.green = tagCompound.getInteger("Green");
		this.blue = tagCompound.getInteger("Blue");
	}

	@Override
	public void writeToNBT(NBTTagCompound tagCompound)
	{
		super.writeToNBT(tagCompound);
		NBTTagList tagList = new NBTTagList();
		NBTTagCompound nbt = new NBTTagCompound();
		if (item != null)
		{
			item.writeToNBT(nbt);
			tagList.appendTag(nbt);
		}
		tagCompound.setTag("Item", tagList);
		tagCompound.setInteger("Red", red);
		tagCompound.setInteger("Green", green);
		tagCompound.setInteger("Blue", blue);
	}
/*
	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt)
	{
		NBTTagCompound tagCom = pkt.getNbtCompound();
		this.readFromNBT(tagCom);
	}

	@Override
	public Packet getDescriptionPacket()
	{
		NBTTagCompound tagCom = new NBTTagCompound();
		this.writeToNBT(tagCom);
		return new S35PacketUpdateTileEntity(pos, getBlockMetadata(), tagCom);
	}
*/
	@Override
	public int getSize()
	{
		return 1;
	}

	@Override
	public ItemStack getItem(int i)
	{
		return getDrink();
	}

	@Override
	public void clear()
	{
		item = null;
	}
}
