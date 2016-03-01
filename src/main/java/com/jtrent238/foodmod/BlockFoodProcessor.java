package com.jtrent238.foodmod;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockFoodProcessor extends BlockContainer
{

	private TileEntity TileEntityFoodProcessor;
	public static Gui GuiFoodProcessor;
	
	protected BlockFoodProcessor(Material p_i45386_1_) {
		super(p_i45386_1_);
		this.setBlockName("blockfoodprocessor");
		this.setBlockTextureName("foodmod:blockfoodprocessor");
		this.setCreativeTab(FoodMod.TestStuff);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return TileEntityFoodProcessor;
	}
	
	public Gui createNewGui() {
		return GuiFoodProcessor;
	}

	
}
    
