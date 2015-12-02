package com.jtrent238.foodmod;

import com.jtrent238.weaponmod.GuiHandler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

@Mod(modid="foodmod", name="jtrent238's Food Mod", version="1.0.0.0")
public class FoodMod
{
	public static Item itemcheese;
	public static Item itemgrilledcheese;
	public static Item itemgrilledcheesesandwhich;
	public static Item itemdiamondapple;
	public static Item itemcoalapple;
	public static Item itemredstoneapple;
	public static Item itemgoldapple;
	public static Item itememeraldapple;
	public static Item itemlapizapple;
	public static Item itemironapple;
	public static Item itemnetherstarapple;
	public static Item itemdragoneggapple;
	public static Item itemflesh;
	public static Item itemcookedflesh;
	public static Item itembacon;
	public static Item itemcheesecake;
	public static Item itemcarrotcake;
	public static Item itemBakersyeast;
	public static Item itemBarkbread;
	public static Item itemKubdari;
	public static Item itemKisra;
	public static Item itemSimit;
	public static Item itemRicebread;
	public static Item itemtoast;
	public static Item itemČesnica;
	public static Item itemSlicedbread;

	


@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	
	//Diamond Apple
    itemdiamondapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemdiamondapple").setTextureName("weaponmod:itemdiamondapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemdiamondapple, itemdiamondapple.getUnlocalizedName().substring(5));
    
    //Coal Apple
    itemcoalapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemcoalapple").setTextureName("weaponmod:itemcoalapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcoalapple, itemcoalapple.getUnlocalizedName().substring(5));
    
    //Gold Apple
    itemgoldapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemgoldapple").setTextureName("weaponmod:itemgoldapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemgoldapple, itemgoldapple.getUnlocalizedName().substring(5));
    
    //Redstone Apple
    itemredstoneapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemredstoneapple").setTextureName("weaponmod:itemredstoneapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemredstoneapple, itemredstoneapple.getUnlocalizedName().substring(5));
    
    //Emerald Apple
    itememeraldapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itememeraldapple").setTextureName("weaponmod:itememeraldapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itememeraldapple, itememeraldapple.getUnlocalizedName().substring(5));
    
    //Lapiz Apple
    itemlapizapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemlapizapple").setTextureName("weaponmod:itemlapizapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemlapizapple, itemlapizapple.getUnlocalizedName().substring(5));
    
    //Iron Apple
    itemironapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemironapple").setTextureName("weaponmod:itemironapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemironapple, itemironapple.getUnlocalizedName().substring(5));
    
    //NetherStar Apple
    itemnetherstarapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemnetherstarapple").setTextureName("weaponmod:itemnetherstarapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemnetherstarapple, itemnetherstarapple.getUnlocalizedName().substring(5));
   
    //DragonEgg Apple
    itemdragoneggapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemdragoneggapple").setTextureName("weaponmod:itemdragoneggapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemdragoneggapple, itemdragoneggapple.getUnlocalizedName().substring(5));
    
    //Cheese
    itemcheese = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcheese").setTextureName("weaponmod:itemgrilledcheese").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcheese, itemcheese.getUnlocalizedName().substring(5));
    
    //Grilled Cheese
    itemgrilledcheese = new ItemFood(6, 0.2F, false).setUnlocalizedName("itemgrilledcheese").setTextureName("weaponmod:itemgrilledcheese").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemgrilledcheese, itemgrilledcheese.getUnlocalizedName().substring(5));
 
    //Flesh
    itemflesh = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemflesh").setTextureName("weaponmod:itemflesh").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemflesh, itemflesh.getUnlocalizedName().substring(5));
    
    //Cooked Flesh
    itemcookedflesh = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcookedflesh").setTextureName("weaponmod:itemcookedflesh").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcookedflesh, itemcookedflesh.getUnlocalizedName().substring(5));
    
    //Bacon
    itembacon = new ItemFood(3, 0.2F, false).setUnlocalizedName("itembacon").setTextureName("weaponmod:itembacon").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itembacon, itembacon.getUnlocalizedName().substring(5));
  
    //Cheese Cake
    itemcheesecake = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcheesecake").setTextureName("weaponmod:itemcheesecake").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcheesecake, itemcheesecake.getUnlocalizedName().substring(5));
 
    //Carrot Cake
    itemcarrotcake = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcarrotcake").setTextureName("weaponmod:itemcarrotcake").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcarrotcake, itemcarrotcake.getUnlocalizedName().substring(5));
 
    //Bark Bread
    itemBarkbread = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemBarkbread").setTextureName("weaponmod:itemBarkbread").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemBarkbread, itemBarkbread.getUnlocalizedName().substring(5));

    //Kubdari
    itemKubdari = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemKubdari").setTextureName("weaponmod:itemKubdari").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemKubdari, itemKubdari.getUnlocalizedName().substring(5));

    //Rice Bread
    itemRicebread = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemRicebread").setTextureName("weaponmod:itemRicebread").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemRicebread, itemRicebread.getUnlocalizedName().substring(5));
    
    
    //•//Crafting Recipes//•//
    //END/•//Crafting Recipes//•/END//
    
    //•//Smelting Recipes//•// 
    //END/•//Smelting Recipes//•/END//

}


@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
  NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
}

public static CreativeTabs FoodMod = new CreativeTabs("FoodMod")
{


	public Item getTabIconItem() {

		return new ItemStack(Items.golden_apple).getItem();
	}


	}
;

@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event) {}
}
