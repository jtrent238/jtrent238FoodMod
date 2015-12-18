package com.jtrent238.foodmod

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class FoodModConfig
{
  static int itemchocolatecakeID;
  static int itemapplecakeID;
  static int itemcarrotcakeID;
  static int itemmagiccakeID;
  static int blockchocolateID;
  static int itemcaramelcakeID;
  public static int AppleCakeItemID;
  public static int ChocoCakeItemID;
  public static int CarrotCakeItemID;
  public static int CaramelCakeItemID;
  public static int itemmilkbottleID;
  public static Configuration config;
  
  public static void FC_Configuration(FMLPreInitializationEvent event)
  {
    config = new Configuration(event.getSuggestedConfigurationFile());
    config.load();
    
    itemmilkbottleID = config.getItem("Milk Bottle", 4041).getInt();
    
    itemchocolatecakeID = config.getBlock("Chocolate Cake", 503).getInt();
    itemapplecakeID = config.getBlock("Apple Cake", 504).getInt();
    itemcarrotcakeID = config.getBlock("Carrot Cake", 505).getInt();
    itemmagiccakeID = config.getBlock("Magic Cake", 506).getInt();
    blockchocolateID = config.getBlock("Chocolate Block", 507).getInt();
    itemcaramelcakeID = config.getBlock("Caramel Cake", 509).getInt();
    
    ChocoCakeItemID = config.getItem("ChocoCakeItem", 4016).getInt();
    AppleCakeItemID = config.getItem("AppleCakeItem", 4017).getInt();
    CarrotCakeItemID = config.getItem("CarrotCakeItem", 4018).getInt();
    MagicCakeItemID = config.getItem("MagicCakeItem", 4019).getInt();
    
    config.save();
  }
}
