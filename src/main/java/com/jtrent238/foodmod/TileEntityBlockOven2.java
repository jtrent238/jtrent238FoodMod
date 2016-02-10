package com.jtrent238.foodmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityBlockOven2 extends TileEntity implements ISidedInventory {

	 private static final Logger logger = LogManager.getLogger();
	    /** A HashMap storing string names of classes mapping to the actual java.lang.Class type. */
	    private static Map nameToClassMap = new HashMap();
	    /** A HashMap storing the classes and mapping to the string names (reverse of nameToClassMap). */
	    private static Map classToNameMap = new HashMap();
	    /** the instance of the world the tile entity is in. */
	    protected World worldObj;
	    public int xCoord;
	    public int yCoord;
	    public int zCoord;
	    protected boolean tileEntityInvalid;
	    public int blockMetadata = -1;
	    /** the Block type that this TileEntity is contained within */
	    public Block blockType;
	    private static final String __OBFID = "CL_00000340";

	
	private static final int[] slotsTop = new int[] { 0 };
	private static final int[] slotsBottom = new int[] { 2, 1 };
	private static final int[] slotsSides = new int[] { 1 };

	private ItemStack[] ovenItemStacks = new ItemStack[3];

	public int ovenBurnTime;
	public int currentBurnTime;
	public int ovenCookTime;

	private String ovenName;

	public void ovenName(String string){
		this.ovenName = string;
	}
	
	@Override
	public int getSizeInventory() {
		return this.ovenItemStacks.length;
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return this.ovenItemStacks[slot];
	}

	@Override
	public ItemStack decrStackSize(int par1, int par2) {
		if (this.ovenItemStacks[par1] != null) {
			ItemStack itemstack;
			if (this.ovenItemStacks[par1].stackSize <= par2) {
				itemstack = this.ovenItemStacks[par1];
				this.ovenItemStacks[par1] = null;
				return itemstack;
			} else {
				itemstack = this.ovenItemStacks[par1].splitStack(par2);

				if (this.ovenItemStacks[par1].stackSize == 0) {
					this.ovenItemStacks[par1] = null;
				}
				return itemstack;
			}
		} else {
			return null;
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot) {
		if (this.ovenItemStacks[slot] != null) {
			ItemStack itemstack = this.ovenItemStacks[slot];
			this.ovenItemStacks[slot] = null;
			return itemstack;
		} else {
			return null;
		}
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack itemstack) {
		this.ovenItemStacks[slot] = itemstack;

		if (itemstack != null && itemstack.stackSize > this.getInventoryStackLimit()) {
			itemstack.stackSize = this.getInventoryStackLimit();
		}

	}

	@Override
	public String getInventoryName() {
		return this.hasCustomInventoryName() ? this.ovenName : "Tut oven";
	}

	@Override
	public boolean hasCustomInventoryName() {
		return this.ovenName != null && this.ovenName.length() > 0;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	public void readFromNBT(NBTTagCompound tagCompound) {
		super.readFromNBT(tagCompound);
		NBTTagList tagList = tagCompound.getTagList("Items", 10);
		this.ovenItemStacks = new ItemStack[this.getSizeInventory()];

		for (int i = 0; i < tagList.tagCount(); ++i) {
			NBTTagCompound tabCompound1 = tagList.getCompoundTagAt(i);
			byte byte0 = tabCompound1.getByte("Slot");

			if (byte0 >= 0 && byte0 < this.ovenItemStacks.length) {
				this.ovenItemStacks[byte0] = ItemStack.loadItemStackFromNBT(tabCompound1);
			}
		}

		this.ovenBurnTime = tagCompound.getShort("BurnTime");
		this.ovenCookTime = tagCompound.getShort("CookTime");
		this.currentBurnTime = getItemBurnTime(this.ovenItemStacks[1]);

		if (tagCompound.hasKey("CustomName", 8)) {
			this.ovenName = tagCompound.getString("CustomName");
		}
	}

	public void writeToNBT(NBTTagCompound tagCompound) {
		super.writeToNBT(tagCompound);
		tagCompound.setShort("BurnTime", (short) this.ovenBurnTime);
		tagCompound.setShort("CookTime", (short) this.ovenBurnTime);
		NBTTagList tagList = new NBTTagList();

		for (int i = 0; i < this.ovenItemStacks.length; ++i) {
			if (this.ovenItemStacks[i] != null) {
				NBTTagCompound tagCompound1 = new NBTTagCompound();
				tagCompound1.setByte("Slot", (byte) i);
				this.ovenItemStacks[i].writeToNBT(tagCompound1);
				tagList.appendTag(tagCompound1);
			}
		}

		tagCompound.setTag("Items", tagList);

		if (this.hasCustomInventoryName()) {
			tagCompound.setString("CustomName", this.ovenName);
		}
		
	}

	@SideOnly(Side.CLIENT)
	public int getCookProgressScaled(int par1) {
		return this.ovenCookTime * par1 / 200;
	}

	@SideOnly(Side.CLIENT)
	public int getBurnTimeRemainingScaled(int par1) {
		if (this.currentBurnTime == 0) {
			this.currentBurnTime = 200;
		}

		return this.ovenBurnTime * par1 / this.currentBurnTime;
	}

	public boolean isBurning() {
		return this.ovenBurnTime > 0;
	}

	public void updateEntity() {
		boolean flag = this.ovenBurnTime > 0;
		boolean flag1 = false;

		if (this.ovenBurnTime > 0) {
			--this.ovenBurnTime;
		}

		if (!this.worldObj.isRemote) {
			if (this.ovenBurnTime == 0 && this.canSmelt()) {
				this.currentBurnTime = this.ovenBurnTime = getItemBurnTime(this.ovenItemStacks[1]);

				if (this.ovenBurnTime > 0) {
					flag1 = true;
					if (this.ovenItemStacks[1] != null) {
						--this.ovenItemStacks[1].stackSize;

						if (this.ovenItemStacks[1].stackSize == 0) {
							this.ovenItemStacks[1] = ovenItemStacks[1].getItem().getContainerItem(this.ovenItemStacks[1]);
						}
					}
				}
			}

			if (this.isBurning() && this.canSmelt()) {
				++this.ovenCookTime;
				if (this.ovenCookTime == 200) {
					this.ovenCookTime = 0;
					this.smeltItem();
					flag1 = true;
				}
			} else {
				this.ovenCookTime = 0;
			}
		}

		if (flag != this.ovenBurnTime > 0) {
			flag1 = true;
			BlockOven.updateFurnaceBlockState(this.ovenBurnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
		}

		if (flag1) {
			this.markDirty();
		}
	}

	private boolean canSmelt() {
		if (this.ovenItemStacks[0] == null) {
			return false;
		} else {
			ItemStack itemstack = BlockOvenRecipes.smelting().getSmeltingResult(this.ovenItemStacks[0]);
			if (itemstack == null) return false;
			if (this.ovenItemStacks[2] == null) return true;
			if (!this.ovenItemStacks[2].isItemEqual(itemstack)) return false;
			int result = ovenItemStacks[2].stackSize + itemstack.stackSize;
			return result <= getInventoryStackLimit() && result <= this.ovenItemStacks[2].getMaxStackSize();
		}
	}

	public void smeltItem() {
		if (this.canSmelt()) {
			ItemStack itemstack = BlockOvenRecipes.smelting().getSmeltingResult(this.ovenItemStacks[0]);

			if (this.ovenItemStacks[2] == null) {
				this.ovenItemStacks[2] = itemstack.copy();
			} else if (this.ovenItemStacks[2].getItem() == itemstack.getItem()) {
				this.ovenItemStacks[2].stackSize += itemstack.stackSize;
			}
			
			--this.ovenItemStacks[0].stackSize;
			
			if(this.ovenItemStacks[0].stackSize >= 0){
				this.ovenItemStacks[0] = null;
			}
		}
	}
	
	public static int getItemBurnTime(ItemStack itemstack){
		if(itemstack == null){
			return 0;
		}else{
			Item item = itemstack.getItem();
			
			if(item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air){
				Block block = Block.getBlockFromItem(item);
				
				if(block == FoodMod.tutBlock){
					return 200;
				}
				
				if(block.getMaterial() == Material.rock){
					return 300;
				}
			}
			
			if(item == FoodMod.tutItem) return 1600;
			if(item instanceof ItemTool && ((ItemTool) item).getToolMaterialName().equals("EMERALD")) return 300;
			return GameRegistry.getFuelValue(itemstack);
		}
	}

	public static boolean isItemFuel(ItemStack itemstack){
		return getItemBurnTime(itemstack) > 0;
	}
	
	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : player.getDistanceSq((double) this.xCoord + 0.5D, (double) this.yCoord + 0.5D, (double) this.zCoord + 0.5D) <= 64.0D;
	}

	@Override
	public void openInventory() {

	}

	@Override
	public void closeInventory() {

	}

	@Override
	public boolean isItemValidForSlot(int par1, ItemStack itemstack) {
		return par1 == 2 ? false : (par1 == 1 ? isItemFuel(itemstack) : true);
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int par1) {
		return par1 == 0 ? slotsBottom : (par1 == 1 ? slotsTop : slotsSides);
	}

	@Override
	public boolean canInsertItem(int par1, ItemStack itemstack, int par3) {
		return this.isItemValidForSlot(par1, itemstack);
	}

	@Override
	public boolean canExtractItem(int par1, ItemStack itemstack, int par3) {
		return par3 != 0 || par1 != 1 || itemstack.getItem() == Items.bucket;
	}

	public void furnaceName(String Oven) {
		
	}

	public void func_145951_a(String Oven) {
		
	}

}
