package com.jtrent238.foodmod;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.Constants;

public class blockpeanutPlant extends Block 
{                                    

	  private String name = "blockpeanutPlant";
  
  public blockpeanutPlant()
  {
      super(Material.plants);
      
      this.setCreativeTab(CreativeTabs.tabDecorations); 
      setBlockName("itempeanutPlant");
      setBlockTextureName("foodmod:itempeanutPlant");
      GameRegistry.registerBlock(this, name);
  }    

  public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
  {
    return FoodMod.itempeanutSeeds;
  }

  public int quantityDropped(Random random)
  {
    return 2;
  }

public Item setUnlocalizedName(String string) {

	return null;
} 

}