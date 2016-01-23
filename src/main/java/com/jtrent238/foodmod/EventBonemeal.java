package com.jtrent238.foodmod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class EventBonemeal {

	public void onUseBonemeal(BonemealEvent event)
	{
		World world = event.world;
		int x = event.x;
		int y = event.y;
		int z = event.z;
		Block block = event.block;
		int meta = event.world.getBlockMetadata(x, y, z);
	 
		Random rand = new Random();
		int i = rand.nextInt(13);
			
		if (block == Blocks.grass && event.world.getBlockMetadata(x, y, z) == 0)
		{
			int var14 = y + 1;
			for (int i1 = 0; i1 < 128; ++i1)
			{
				for (int i2 = 0; i2 < i1 / 16; ++i2)
				{
					x += event.world.rand.nextInt(3) - 1;
					var14 += (event.world.rand.nextInt(3) - 1) * event.world.rand.nextInt(3) / 2;
					z += event.world.rand.nextInt(3) - 1;
				}
				if (event.world.getBlock(x, var14, z).isAir(world, x, var14, z))
				{    
					if (FoodModBlocks.plant.canReplace(world, x, var14, z, 0, new ItemStack(FoodModBlocks.plant, 1, i)))
					{
						if (!event.world.isRemote)
						{
							event.world.setBlock(x, var14, z, FoodModBlocks.plant, i, 2);
						}
					}          for (int i2 = 0; i2 < i1 / 16; ++i2)
					{
						x += event.world.rand.nextInt(3) - 1;
						var14 += (event.world.rand.nextInt(3) - 1) * event.world.rand.nextInt(3) / 2;
						z += event.world.rand.nextInt(3) - 1;
					}
					if (event.world.getBlock(x, var14, z).isAir(world, x, var14, z))
					{    
						if (FoodModBlocks.Strawberry.canReplace(world, x, var14, z, 0, new ItemStack(FoodModBlocks.Strawberry, 1, i)))
						{
							if (!event.world.isRemote)
							{
								event.world.setBlock(x, var14, z, FoodModBlocks.Strawberry, i, 2);
							}
				}
			}
		}
	}
}
	}
}
