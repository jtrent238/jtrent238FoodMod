package com.jtrent238.foodmod;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockBlender extends BlockFurnitureTile
{
	public BlockBlender(Material material)
	{
		super(material);
		setHardness(0.5F);
		setStepSound(Block.soundTypeGlass);
	}
	/*
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		ItemStack currentItem = player.getCurrentEquippedItem();
		TileEntity tileEntity = world.getTileEntity(pos);
		if (tileEntity instanceof TileEntityBlender)
		{
			TileEntityBlender tileEntityBlender = (TileEntityBlender) tileEntity;
			if (tileEntityBlender.drinkCount == 0)
			{
				if (currentItem != null && !tileEntityBlender.isFull() && !tileEntityBlender.isBlending())
				{
					tileEntityBlender.addIngredient(currentItem.copy());
					world.markBlockForUpdate(pos);
					currentItem.stackSize = 0;
					return true;
				}
				else
				{
					if (player.isSneaking())
					{
						if (!tileEntityBlender.isBlending())
						{
							if (tileEntityBlender.hasValidIngredients())
							{
								tileEntityBlender.startBlending();
							}
						}
					}
					else if (!tileEntityBlender.isBlending())
					{
						tileEntityBlender.removeIngredient();
					}
				}
			}
			else
			{
				if (currentItem != null && tileEntityBlender.hasDrink())
				{
					if (currentItem.getItem() == FurnitureItems.itemCup)
					{
						if (currentItem.stackSize == 0 | currentItem.stackSize == 1)
						{
							player.setCurrentItemOrArmor(0, tileEntityBlender.getDrink());
						}
						else
						{
							player.inventory.addItemStackToInventory(tileEntityBlender.getDrink());
							currentItem.stackSize--;
						}
						tileEntityBlender.drinkCount--;
					}
					return true;
				}
			}
		}
		return true;
	}
	*/
	public void setBlockBoundsBasedOnState(IBlockAccess blockAccess, BlockPos pos)
	{
		setBlockBounds(4F * 0.0625F, 0.0F, 4F * 0.0625F, 12F * 0.0625F, 1.0F, 12F * 0.0625F);
	}
/*
	public void addCollisionBoxesToList(World world, BlockPos pos, IBlockState state, AxisAlignedBB mask, List list, Entity collidingEntity)
	{
		setBlockBounds(4F * 0.0625F, 0.0F, 4F * 0.0625F, 12F * 0.0625F, 1.0F, 12F * 0.0625F);
		super.addCollisionBoxesToList(world, pos, state, mask, list, collidingEntity);
	}
	*/
	/*
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityBlender();
	}
	*/
	/*
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return FurnitureItems.itemBlender;
	}
*/
	/*
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos)
	{
		return new ItemStack(FurnitureItems.itemBlender);
	}
	*/
	/*
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
