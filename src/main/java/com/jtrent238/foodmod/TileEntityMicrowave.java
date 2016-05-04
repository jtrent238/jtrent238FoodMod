package com.jtrent238.foodmod;

import java.util.Random;

import cofh.core.particles.ParticleRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IChatComponent;

public class TileEntityMicrowave extends TileEntity implements IInventory, IUpdatePlayerListBox
{
	private ItemStack item = null;
	private String customName;
	private boolean cooking = false;
	public int progress = 0;

	public ItemStack getItem()
	{
		return item;
	}
/*
	public void startCooking()
	{
		if (item != null)
		{
			RecipeData data = RecipeAPI.getMicrowaveRecipeFromIngredients(item);
			if (data != null)
			{
				cooking = true;
			}
		}
	}
*/
	public void stopCooking()
	{
		this.cooking = false;
		this.progress = 0;
	}

	public boolean isCooking()
	{
		return cooking;
	}

	private Random rand = new Random();
	private int timer = 0;
/*
	@Override
	public void update()
	{
		if (cooking)
		{
			if (this.worldObj.isRemote)
			{
				double posX = pos.getX() + 0.35D + (rand.nextDouble() / 3);
				double posZ = pos.getZ() + 0.35D + (rand.nextDouble() / 3);
				ParticleRenderer.spawnParticle("smoke", posX, pos.getY() + 0.065D, posZ);
			}

			progress++;
			if (progress >= 40)
			{
				if (item != null)
				{
					RecipeData data = RecipeAPI.getMicrowaveRecipeFromIngredients(item);
					if (data != null)
					{
						this.item = data.getOutput().copy();
					}
				}
				if (!worldObj.isRemote)
				{
					worldObj.playSoundEffect(pos.getX(), pos.getY(), pos.getZ(), "cfm:microwave_finish", 0.75F, 1.0F);
				}
				timer = 0;
				progress = 0;
				cooking = false;
			}
			else
			{
				if (timer == 20)
				{
					timer = 0;
				}
				if (timer == 0)
				{
					worldObj.playSoundEffect(pos.getX(), pos.getY(), pos.getZ(), "cfm:microwave_running", 0.75F, 1.0F);
				}
				timer++;
			}
		}
	}
*/
	@Override
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readFromNBT(par1NBTTagCompound);
		if (par1NBTTagCompound.hasKey("Item"))
		{
			NBTTagCompound nbt = par1NBTTagCompound.getCompoundTag("Item");
			this.item = ItemStack.loadItemStackFromNBT(nbt);
		}
		this.cooking = par1NBTTagCompound.getBoolean("Coooking");
		this.progress = par1NBTTagCompound.getInteger("Progress");
	}

	@Override
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeToNBT(par1NBTTagCompound);
		NBTTagCompound nbt = new NBTTagCompound();
		if (item != null)
		{
			item.writeToNBT(nbt);
		}
		par1NBTTagCompound.setTag("Item", nbt);
		par1NBTTagCompound.setBoolean("Coooking", cooking);
		par1NBTTagCompound.setInteger("Progress", progress);
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
	public int getSizeInventory()
	{
		return 1;
	}

	@Override
	public ItemStack getStackInSlot(int slot)
	{
		return this.item;
	}

	@Override
	public ItemStack decrStackSize(int slot, int number)
	{
		if (this.item != null)
		{
			ItemStack itemstack;

			if (this.item.stackSize <= number)
			{
				itemstack = this.item;
				this.item = null;
				return itemstack;
			}
			itemstack = this.item.splitStack(number);

			if (this.item.stackSize == 0)
			{
				this.item = null;
			}

			return itemstack;
		}
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot)
	{
		return item;
	}

	@Override
	public void setInventorySlotContents(int par1, ItemStack par2ItemStack)
	{
		this.item = par2ItemStack;

		if (par2ItemStack != null && par2ItemStack.stackSize > this.getInventoryStackLimit())
		{
			par2ItemStack.stackSize = this.getInventoryStackLimit();
		}
	}

	@Override
	public int getInventoryStackLimit()
	{
		return 1;
	}
/*
	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer)
	{
		return this.worldObj.getTileEntity(pos) != this ? false : entityplayer.getDistanceSq(pos.getX() + 0.5D, pos.getY() + 0.5D, pos.getZ() + 0.5D) <= 64.0D;
	}
*/

	@Override
	public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_)
	{
		return false;
	}

	public void openInventory(EntityPlayer player)
	{		
	}

	public void closeInventory(EntityPlayer player)
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
		item = null;
	}

	public String getName()
	{
		return hasCustomName() ? customName : "Microwave";
	}

	public boolean hasCustomName()
	{
		return customName != null;
	}

	public IChatComponent getDisplayName()
	{
		return new ChatComponentText(getName());
	}

	@Override
	public String getInventoryName() {
		return "Microwave";
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
	public void update() {
		
	}
	@Override
	public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
		return true;
	}
}
