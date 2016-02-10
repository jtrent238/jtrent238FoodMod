package com.jtrent238.foodmod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenCandyAbstractTree extends WorldGenerator
{
    @SuppressWarnings("unused")
	private static final String __OBFID = "CL_00000399";

    public WorldGenCandyAbstractTree(boolean p_i45448_1_)
    {
        super(p_i45448_1_);
    }

    protected boolean func_150523_a(Block p_150523_1_)
    {
        return p_150523_1_.getMaterial() == Material.air || p_150523_1_.getMaterial() == Material.leaves || p_150523_1_ == BlockLoader.blockcandygrass || p_150523_1_ == BlockLoader.blockcandydirt || p_150523_1_ == Blocks.log || p_150523_1_ == Blocks.log || p_150523_1_ == Blocks.sapling || p_150523_1_ == Blocks.vine;
    }

    public void func_150524_b(World p_150524_1_, Random p_150524_2_, int p_150524_3_, int p_150524_4_, int p_150524_5_) {}

    protected boolean isReplaceable(World world, int x, int y, int z)
    {
        Block block = world.getBlock(x, y, z);
        return block.isAir(world, x, y, z) || block.isLeaves(world, x, y, z) || block.isWood(world, x, y, z) || func_150523_a(block);
    }

	@Override
	public boolean generate(World p_76484_1_, Random p_76484_2_, int p_76484_3_, int p_76484_4_, int p_76484_5_) {

		return true;
	}
}