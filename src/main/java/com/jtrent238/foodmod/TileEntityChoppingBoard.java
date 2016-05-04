package com.jtrent238.foodmod;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityChoppingBoard extends TileEntity implements ISimpleInventory
{
	private ItemStack food = null;

	public void setFood(ItemStack food)
	{
		this.food = food;
	}

	public ItemStack getFood()
	{
		return food;
	}
/*
	public boolean chopFood(ItemStack knife)
	{
		if (food != null)
		{
			RecipeData data = RecipeAPI.getChoppingBoardRecipeFromInput(food);
			if (data != null)
			{
				if (!worldObj.isRemote)
				{
					EntityItem entityItem = new EntityItem(worldObj, pos.getX() + 0.5, pos.getY() + 0.2, pos.getZ() + 0.5, data.getOutput().copy());
					worldObj.spawnEntityInWorld(entityItem);
					worldObj.playSoundEffect(pos.getX(), pos.getY(), pos.getZ(), "cfm:knife_chop", 0.75F, 1.0F);
				}
				setFood(null);
				return true;
			}
		}
		return false;
	}
*/
	@Override
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readFromNBT(par1NBTTagCompound);
		if (par1NBTTagCompound.hasKey("Items"))
		{
			NBTTagList tagList = (NBTTagList) par1NBTTagCompound.getTag("Items");
			for (int i = 0; i < tagList.tagCount(); ++i)
			{
				NBTTagCompound nbttagcompound1 = tagList.getCompoundTagAt(i);
				ItemStack stack = ItemStack.loadItemStackFromNBT(nbttagcompound1);
				this.setFood(stack);
			}
		}
	}

	@Override
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeToNBT(par1NBTTagCompound);
		NBTTagList tagList = new NBTTagList();
		ItemStack itemStack = food;
		if (itemStack != null)
		{
			NBTTagCompound nbttagcompound1 = new NBTTagCompound();
			itemStack.writeToNBT(nbttagcompound1);
			tagList.appendTag(nbttagcompound1);
		}
		par1NBTTagCompound.setTag("Items", tagList);
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
	public int getSize()
	{
		return 1;
	}

	@Override
	public ItemStack getItem(int i)
	{
		return food;
	}

	@Override
	public void clear()
	{
		food = null;
	}
}
