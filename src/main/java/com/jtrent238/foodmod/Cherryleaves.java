package com.jtrent238.foodmod;
 
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;
 
        public class Cherryleaves extends Block
        {
               
                int x;
                int y;
                int z;
                
				protected Cherryleaves(Material leaves, IBlockAccess world)
                {
                       
                        super(Material.leaves);
                        this.setCreativeTab(FoodMod.FoodMod);
                        this.isLeaves(world, x, y, z);
                       
                }
        public String getTextureFile()
        {
                return "foodmod:leaves_cherry.png";
        }
 
}