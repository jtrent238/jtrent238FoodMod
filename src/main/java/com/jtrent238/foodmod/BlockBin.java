package com.jtrent238.foodmod;

import java.util.List;
import java.util.Random;

import net.ilexiconn.llibrary.common.entity.EntityMountableBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockBin extends BlockFurnitureTile
{
	public BlockBin(Material material)
	{
		super(material);
		setStepSound(Block.soundTypeAnvil);
		setHardness(0.5F);
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	public boolean isFullCube()
	{
		return false;
	}

	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
	{
	}

	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ, int pos1)
	{
		if (!world.isRemote)
		{
			TileEntity tile_entity = world.getTileEntity(pos1, pos1, pos1);

			if (tile_entity instanceof TileEntityBin)
			{
				player.openGui(FoodMod.instance, 0, world, pos.getX(), pos.getY(), pos.getZ());
			}
		}
		return true;
	}
	
	public void setBlockBoundsBasedOnState(IBlockAccess blockAccess, BlockPos pos)
	{
		setBlockBounds(2F * 0.0625F, 0.0F, 2F * 0.0625F, 14F * 0.0625F, 13F * 0.0625F, 14F * 0.0625F);
	}

	public void addCollisionBoxesToList(World world, BlockPos pos, IBlockState state, AxisAlignedBB mask, List list, Entity collidingEntity)
	{
		if (!(collidingEntity instanceof EntityMountableBlock))
		{
			setBlockBounds(2F * 0.0625F, 0.0F, 2F * 0.0625F, 14F * 0.0625F, 13F * 0.0625F, 14F * 0.0625F);
		}
		else
		{
			setBlockBounds(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		super.addCollisionBoxesToList(world, pos, state, mask, list, collidingEntity);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityBin();
	}
/*
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return FurnitureItems.itemBin;
	}
*/
	/*
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos)
	{
		return new ItemStack(FurnitureItems.itemBin);
	}
	*/
}
