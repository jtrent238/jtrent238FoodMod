package com.jtrent238.foodmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockDynamicLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class liquidMilkFlowing extends BlockDynamicLiquid {
    

	public liquidMilkFlowing(int par1, int white) {
            super(Material.water);
            this.blockHardness = 100.0F;
            this.setLightOpacity(3);
            this.disableStats();
            this.getBlockColor();
            this.getRenderColor(white);
            this.setCreativeTab(FoodMod.TestStuff);
            //Uncomment this if you wish to test and need it in creative mode!
            }
}