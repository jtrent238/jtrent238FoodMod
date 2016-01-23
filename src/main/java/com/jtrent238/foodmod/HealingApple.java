package com.jtrent238.foodmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class HealingApple extends ItemFood
{         
	  private String name = "itemHealingApple";
	private CreativeTabs FoodMod; 

  public HealingApple(int heal, float saturation, boolean wolfMeat)
  {
  	super(heal, saturation, wolfMeat);
  	
		  setUnlocalizedName("itemHealingApple");
    setTextureName("foodmod:HealingApple");
		  setCreativeTab(FoodMod); 
		  GameRegistry.registerItem(this, name);
  }




}