package com.jtrent238.foodmod;

import net.ilexiconn.llibrary.common.block.BlockMountable;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Blockchair extends BlockMountable{

	private static final float x = 0;
	private static final float y = 0;
	private static final float z = 0;

	public Blockchair(Material wood) {
		super(wood);
		this.setMountingPosition(x, y, z);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return null;
	}

	
}
