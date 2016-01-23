package com.jtrent238.foodmod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Blockstove extends BlockContainer {

	private static Material anvil;

	protected Blockstove(Material anvil) {
		super(anvil);

	}
	{
	
		this.setBlockTextureName("foodmod:blockstove");


}
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return null;
	}

		
	}

