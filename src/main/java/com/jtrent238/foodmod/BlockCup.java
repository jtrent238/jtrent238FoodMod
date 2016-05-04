package com.jtrent238.foodmod;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCup extends Block implements ITileEntityProvider
{
	public BlockCup(Material material)
	{
		super(material);
		setStepSound(Block.soundTypeGlass);
		setHardness(0.1F);
		//this.setDefaultState(this.blockState.getBaseState());
	}
/*
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public boolean isFullCube()
	{
		return false;
	}

	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
	{
		if (stack.hasTagCompound())
		{
			NBTTagCompound nbt = stack.getTagCompound();
			if (nbt.hasKey("Colour"))
			{
				int[] rgb = nbt.getIntArray("Colour");
				TileEntityCup tileEntityCup = (TileEntityCup) world.getTileEntity(pos);
				tileEntityCup.setColour(rgb);
				tileEntityCup.setItem(stack);
			}
		}
	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess blockAccess, BlockPos pos)
	{
		int metadata = getMetaFromState(blockAccess.getBlockState(pos));
		float[] data = CollisionHelper.fixRotation(metadata, 5F * 0.0625F, 5F * 0.0625F, 11F * 0.0625F, 11F * 0.0625F);
		setBlockBounds(data[0], 0.0F, data[1], data[2], 7.5F * 0.0625F, data[3]);
	}

	@Override
	public void addCollisionBoxesToList(World world, BlockPos pos, IBlockState state, AxisAlignedBB mask, List list, Entity collidingEntity)
	{
		int metadata = getMetaFromState(state);
		float[] data = CollisionHelper.fixRotation(metadata, 5F * 0.0625F, 5F * 0.0625F, 11F * 0.0625F, 11F * 0.0625F);
		setBlockBounds(data[0], 0.0F, data[1], data[2], 7.5F * 0.0625F, data[3]);
		super.addCollisionBoxesToList(world, pos, state, mask, list, collidingEntity);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta)
	{
		return new TileEntityCup();
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return FurnitureItems.itemBlender;
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos)
	{
		TileEntityCup tileEntityCup = (TileEntityCup) world.getTileEntity(pos);
		if (tileEntityCup.getDrink() != null)
		{
			return tileEntityCup.getDrink().copy();
		}
		else
		{
			return new ItemStack(FurnitureItems.itemCup);
		}
	}
	
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.TRANSLUCENT;
	}
	*/

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return null;
	}
}
