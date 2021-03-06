package com.jtrent238.foodmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Blockcherryworkbench extends Block
{
    protected Blockcherryworkbench(Material p_i45394_1_) {
		super(p_i45394_1_);
	}
    @SideOnly(Side.CLIENT)
    private IIcon field_150035_a;
    @SideOnly(Side.CLIENT)
    private IIcon field_150034_b;
    private static final String __OBFID = "CL_00000221";
    
    /**
     * Gets the block's texture. Args: side, meta
     */
    //@SideOnly(Side.CLIENT)
    //public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    //{
    //    return p_149691_1_ == 1 ? this.field_150035_a : (p_149691_1_ == 0 ? FoodMod.blockcherryplanks.getBlockTextureFromSide(p_149691_1_) : (p_149691_1_ != 2 && p_149691_1_ != 4 ? this.blockIcon : this.field_150034_b));
    //}

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon("blockcherryworkbench_side");
        this.field_150035_a = p_149651_1_.registerIcon("blockcherryworkbench_top");
        this.field_150034_b = p_149651_1_.registerIcon("blockcherryworkbench_front");
    }
    
    /**
     * Displays the crafting GUI for a workbench.
     */
    public void displayGUIWorkbench(int p_71058_1_, int p_71058_2_, int p_71058_3_) {}

    
    /**
    * Called upon block activation (right click on the block.)
    */
   public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
   {
       if (p_149727_1_.isRemote)
       {
           return true;
       }
       else
       {
           p_149727_5_.displayGUIWorkbench(p_149727_2_, p_149727_3_, p_149727_4_);
           return true;
       }
   }
}
