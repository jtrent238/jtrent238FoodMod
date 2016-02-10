package com.jtrent238.foodmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Blockcandyrail extends BlockRailBase
{
    @SideOnly(Side.CLIENT)
    private IIcon field_150056_b;
    private static final String __OBFID = "CL_00000293";

    protected Blockcandyrail(String string)
    {
        super(false);
        this.setBlockName("CandyRail");
        this.blockMaterial(blockMaterial.iron);
    }

    private void blockMaterial(Material iron) {
		
	}

	/**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_2_ >= 6 ? this.field_150056_b : this.blockIcon;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        super.registerBlockIcons(p_149651_1_);
        this.field_150056_b = p_149651_1_.registerIcon(this.getTextureName() + "_turned");
    }

    
}