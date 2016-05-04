package com.jtrent238.foodmod;

import java.util.List;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public abstract class BlockFurnitureTile extends BlockFurniture implements ITileEntityProvider
{
	public BlockFurnitureTile(Material material)
	{
		super(material);
		this.isBlockContainer = true;
	}
	/*
	public void breakBlock(World world, BlockPos pos, IBlockState state)
	{
		TileEntity tileEntity = world.getTileEntity(pos);
		if (tileEntity instanceof IInventory)
		{
			IInventory inv = (IInventory) tileEntity;
			InventoryHelper.dropInventoryItems(world, pos, inv);
		}
		if (tileEntity instanceof ISimpleInventory)
		{
			ISimpleInventory inv = (ISimpleInventory) tileEntity;
			InventoryUtil.dropInventoryItems(world, pos, inv);
		}
		super.breakBlock(world, pos, state);
	}

	public boolean onBlockEventReceived(World worldIn, BlockPos pos, IBlockState state, int eventID, int eventParam)
	{
		super.onBlockEventReceived(worldIn, pos, state, eventID, eventParam);
		TileEntity tileentity = worldIn.getTileEntity(pos);
		return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
	}
	*/

	public void addCollisionBoxesToList(World world, BlockPos pos, IBlockState state, AxisAlignedBB mask, List list,
			Entity collidingEntity) {
		
	}
}
