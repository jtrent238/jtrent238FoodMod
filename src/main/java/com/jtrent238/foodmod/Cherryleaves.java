package com.jtrent238.foodmod;
 
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
 
        public class Cherryleaves extends Block
        {
               
                protected Cherryleaves(Material leaves)
                {
                       
                        super(Material.leaves);
                        this.setCreativeTab(FoodMod.FoodMod);
                       
                }
        public String getTextureFile()
        {
                return "foodmod:leaves_cherry.png";
        }
 
}