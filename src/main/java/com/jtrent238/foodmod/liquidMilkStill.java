package com.jtrent238.foodmod;

import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class liquidMilkStill extends BlockStaticLiquid{
    
    public liquidMilkStill(int par1, int white) {
            super(Material.water);
            this.blockHardness = 100.0F;
            this.setLightOpacity(3);
            this.disableStats();
            this.getBlockColor();
            this.getRenderColor(white);
            this.setCreativeTab(FoodMod.TestStuff);
            }
    
}