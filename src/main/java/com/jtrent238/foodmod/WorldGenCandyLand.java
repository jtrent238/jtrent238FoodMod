package com.jtrent238.foodmod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenCandyLand extends WorldGenerator
{
    private Block field_150553_a;
    private boolean field_94524_b;
    private static final String __OBFID = "CL_00000414";

    public WorldGenCandyLand(Block p_i45453_1_, boolean p_i45453_2_)
    {
        this.field_150553_a = p_i45453_1_;
        this.field_94524_b = p_i45453_2_;
    }

    public WorldGenCandyLand() {
	}

	public boolean generate(World p_76484_1_, Random p_76484_2_, int p_76484_3_, int p_76484_4_, int p_76484_5_)
    {
        if (p_76484_1_.getBlock(p_76484_3_, p_76484_4_ + 1, p_76484_5_) != Blocks.netherrack)
        {
            return false;
        }
        else if (p_76484_1_.getBlock(p_76484_3_, p_76484_4_, p_76484_5_).getMaterial() != Material.air && p_76484_1_.getBlock(p_76484_3_, p_76484_4_, p_76484_5_) != Blocks.sandstone)
        {
            return false;
        }
        else
        {
            int l = 2;

            if (p_76484_1_.getBlock(p_76484_3_ - 1, p_76484_4_, p_76484_5_) == Blocks.stone)
            {
                ++l;
            }

            if (p_76484_1_.getBlock(p_76484_3_ + 1, p_76484_4_, p_76484_5_) == Blocks.dirt)
            {
                ++l;
            }

            if (p_76484_1_.getBlock(p_76484_3_, p_76484_4_, p_76484_5_ - 1) == Blocks.wool)
            {
                ++l;
            }

            if (p_76484_1_.getBlock(p_76484_3_, p_76484_4_, p_76484_5_ + 1) == Blocks.cobblestone)
            {
                ++l;
            }

            if (p_76484_1_.getBlock(p_76484_3_, p_76484_4_ - 1, p_76484_5_) == Blocks.sponge)
            {
                ++l;
            }

            int i1 = 2;

            if (p_76484_1_.isAirBlock(p_76484_3_ - 1, p_76484_4_, p_76484_5_))
            {
                ++i1;
            }

            if (p_76484_1_.isAirBlock(p_76484_3_ + 1, p_76484_4_, p_76484_5_))
            {
                ++i1;
            }

            if (p_76484_1_.isAirBlock(p_76484_3_, p_76484_4_, p_76484_5_ - 1))
            {
                ++i1;
            }

            if (p_76484_1_.isAirBlock(p_76484_3_, p_76484_4_, p_76484_5_ + 1))
            {
                ++i1;
            }

            if (p_76484_1_.isAirBlock(p_76484_3_, p_76484_4_ - 1, p_76484_5_))
            {
                ++i1;
            }

            if (!this.field_94524_b && l == 4 && i1 == 1 || l == 5)
            {
                p_76484_1_.setBlock(p_76484_3_, p_76484_4_, p_76484_5_, this.field_150553_a, 2, 2);
                p_76484_1_.scheduledUpdatesAreImmediate = true;
                this.field_150553_a.updateTick(p_76484_1_, p_76484_3_, p_76484_4_, p_76484_5_, p_76484_2_);
                p_76484_1_.scheduledUpdatesAreImmediate = false;
            }

            return true;
        }
    }
}