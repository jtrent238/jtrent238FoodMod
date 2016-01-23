package com.jtrent238.foodmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.world.World;

public class Blocksugarore extends Block {

	public static Block blocksugarore;

	protected Blocksugarore(Material material) {
		super(material);
	}

	public Block setBlockName(Block blocksugarore2) {

		return null;
	}
	
	/**
     * called by spawner, ore, redstoneOre blocks
     */
    public void dropXpOnBlockBreak(World p_149657_1_, int p_149657_2_, int p_149657_3_, int p_149657_4_, int p_149657_5_)
    {
        if (!p_149657_1_.isRemote)
        {
            while (p_149657_5_ > 0)
            {
                int i1 = EntityXPOrb.getXPSplit(p_149657_5_);
                p_149657_5_ -= i1;
                p_149657_1_.spawnEntityInWorld(new EntityXPOrb(p_149657_1_, (double)p_149657_2_ + 0.5D, (double)p_149657_3_ + 0.5D, (double)p_149657_4_ + 0.5D, i1));
            }
        }
    }
}
