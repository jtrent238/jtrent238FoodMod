package com.jtrent238.foodmod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BlockFridge extends BlockFurnitureTile
{
	public BlockFridge(Material material)
	{
		super(material);
		setHardness(2.0F);
		setStepSound(Block.soundTypeMetal);
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
/*
	public void onNeighborBlockChange(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock)
	{
		if (worldIn.getBlockState(pos.down()).getBlock() != FurnitureBlocks.freezer)
		{
			worldIn.setBlockToAir(pos);
		}
	}
*/
	/*
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		if(!world.isRemote)
		{
			TileEntity tile_entity = world.getTileEntity(pos);

			if (tile_entity instanceof TileEntityFridge)
			{
				//player.openGui(MrCrayfishFurnitureMod.instance, 0, world, pos.getX(), pos.getY(), pos.getZ());
			}

		}
		return true;
	}
	*/
/*
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityFridge();
	}
*/
	/*
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return FurnitureItems.itemFridge;
	}
*/
	/*
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos)
	{
		return new ItemStack(FurnitureItems.itemFridge);
	}
	*/

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityFridge();
	}

}
