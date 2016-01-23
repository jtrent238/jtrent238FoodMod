package com.jtrent238.foodmod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;  
import cpw.mods.fml.common.registry.GameRegistry;

  public class itemcandyfloss extends ItemFood
  {         
	  private String name = "CandyFloss"; 
  
    public itemcandyfloss(int heal, float saturation, boolean wolfMeat)
    {
    	super(heal, saturation, wolfMeat);
    	
		  setUnlocalizedName("itemcandyfloss");
      setTextureName("foodmod:itemcandyfloss");
		  this.setCreativeTab(FoodMod.FoodMod); 
		  GameRegistry.registerItem(this, name);
    }
  
}