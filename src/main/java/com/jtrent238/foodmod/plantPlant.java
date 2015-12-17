package com.jtrent238.foodmod;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.Constants;

public class plantPlant extends Block 
{                                    

	  private String name = "plantPlant";
  
  public plantPlant()
  {
      super(Material.plants);
      
      this.setCreativeTab(CreativeTabs.tabDecorations); 
      setBlockName("plantplant");
      setBlockTextureName("foodmod:plantplant");
      GameRegistry.registerBlock(this, name);
  }    

  public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
  {
    return FoodModItems.plantSeeds;
  }

  public int quantityDropped(Random random)
  {
    return 2;
  } 

}