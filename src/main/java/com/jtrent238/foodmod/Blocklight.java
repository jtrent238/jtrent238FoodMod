package com.jtrent238.foodmod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.BlockRedstoneLight;
import net.minecraft.block.material.Material;

public class Blocklight extends BlockGlowstone{

	public Blocklight(Material ground) {
		super(ground);

	}

	
	public Block setLightLevel(float p_149715_1_)
    {
        this.lightValue = (int)(15.0F * p_149715_1_);
        return this;
    }
	

}
