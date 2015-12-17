package com.jtrent238.foodmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.Constants;

public class TileEntityStorage extends TileEntity implements IInventory
{
private ItemStack[] items = new ItemStack[15];
 
public int getSizeInventory()
{
return items.length;
}
 
public ItemStack getStackInSlot(int slot)
{
return items[slot];
}
 
public ItemStack decrStackSize(int slot, int amount)
{
if (items[slot] != null)
{
ItemStack itemstack;
 
if (items[slot].stackSize == amount)
{
itemstack = items[slot];
items[slot] = null;
markDirty();
return itemstack;
}
else
{
itemstack = items[slot].splitStack(amount);
if (items[slot].stackSize == 0) items[slot] = null;
markDirty();
return itemstack;
}
}
else
{
return null;
}
}
 
public ItemStack getStackInSlotOnClosing(int slot)
{
if (items[slot] != null)
{
ItemStack itemstack = items[slot];
items[slot] = null;
return itemstack;
}
else
{
return null;
}
}
 
public void setInventorySlotContents(int slot, ItemStack stack)
{
items[slot] = stack;
if (stack != null && stack.stackSize > getInventoryStackLimit())
{
stack.stackSize = getInventoryStackLimit();
}
 
markDirty();
}
 
public String getInventoryName()
{
return "container.storage";
}
 
public boolean hasCustomInventoryName()
{
return false;
}
 
@Override
public void readFromNBT(NBTTagCompound nbt)
{
super.readFromNBT(nbt);
NBTTagList list = nbt.getTagList("Items", Constants.NBT.TAG_COMPOUND);
items = new ItemStack[getSizeInventory()];
 
for (int i = 0; i < list.tagCount(); ++i) { NBTTagCompound comp = list.getCompoundTagAt(i); int j = comp.getByte("Slot") & 255; if (j >= 0 && j < items.length)
{
items[j] = ItemStack.loadItemStackFromNBT(comp);
}
}
}
 
@Override
public void writeToNBT(NBTTagCompound nbt)
{
super.writeToNBT(nbt);
NBTTagList list = new NBTTagList();
 
for (int i = 0; i < items.length; ++i)
{
if (items[i] != null)
{
NBTTagCompound comp = new NBTTagCompound();
comp.setByte("Slot", (byte)i);
items[i].writeToNBT(comp);
list.appendTag(comp);
}
}
 
nbt.setTag("Items", list);
}
 
public int getInventoryStackLimit()
{
return 64;
}
 
public boolean isUseableByPlayer(EntityPlayer player)
{
return worldObj.getTileEntity(xCoord, yCoord, zCoord) != this ? false : player.getDistanceSq((double)xCoord + 0.5D, (double)yCoord + 0.5D, (double)zCoord + 0.5D) <= 64.0D;
}
 
public void openInventory() {}
 
public void closeInventory() {}
 
public boolean isItemValidForSlot(int slot, ItemStack stack)
{
return true;
}


}