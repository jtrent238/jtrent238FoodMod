package com.jtrent238.foodmod;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.Constants;

public class BlockFlour extends Block
{ 
	  private static Item itemflour;
	
  public BlockFlour()
  {
      super(Material.snow);
      setBlockName("blockflour");
      setBlockTextureName("foodmod:blockflour");
      this.setCreativeTab("FoodMod"); 
      registerblock("blockflour");
  }    

  

private void registerblock(String string) {
	
}



private void setCreativeTab(String string) {
	  
}

public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
  {
    return itemflour;
  }

  public int quantityDropped(Random p_149745_1_)
  {
    return 4;
  }
}
