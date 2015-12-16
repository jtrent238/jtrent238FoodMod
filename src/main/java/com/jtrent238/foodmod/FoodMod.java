package com.jtrent238.foodmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid="foodmod", name="jtrent238's Food Mod", version="1.0.0.0")
public class FoodMod
{
	@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {
	}
    

	
	//Items
		//Food
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
	public static Item itemchocolatebar;
	public static Item itemchocolatemilk;
	public static Item itempizza;
	public static Item itemicecream;
	public static Item itemcorndog;
	public static Item itemhotdog;
	public static Item itemcottoncandy;
	public static Item itemapplepie;
	public static Item itemcandyapple;
	public static Item itemsugarcookie;
	public static Item itemoreo;
	public static Item item_mms;
	public static Item itemlemonade;
	public static Item itemlemon;
	public static Item itemmeatball;
	public static Item itemmeatballraw;
	public static Item itempasta;
	public static Item itemchickenwings;
	public static Item itemchickenwingsraw;
	public static Item itemchicken_nuggets;
	public static Item itemchicken_nuggetsraw;
	public static Item itempeanut;
	public static Item itempeanutseeds;
	public static Item itempeanutPlant;
	public static Item itembean;
	public static Item itemgoatmilk;
	public static Item itemfishsticks;
	public static Item itemfishsticksraw;
	public static Item itempie;
	public static Item itemmutton;
	public static Item itemmuttonraw;
	public static Item itemlamb;
	public static Item itemlambraw;
	public static Item itemCheesecakeStuffedStrawberries;
	public static Item itemstrawberry;
	public static Item itemblueberry;
	public static Item itemblackberry;
	public static Item itemcherry;
	public static Item itemsoup;
	public static Item itemfrenchfry;
	public static Item itemlemonpie;
	public static Item itemapplepie;
	public static Item itemasparagus;
	public static Item itembasil;
	public static Item itemcilantro;
	public static Item itembroccoli;
	public static Item itemorange;
	public static Item itemkiwi;
	public static Item itemredpepper;
	public static Item itemtomato;
	public static Item itemavocado;
	public static Item itemgreenpepper;
	public static Item itemraspberries;
	public static Item itempear;
	public static Item itempeach;
	public static Item itemonions;
	public static Item itemgarlic;
	public static Item itemginger;
	public static Item itemadzukibeans;
	public static Item itemblackbeans;
	public static Item itemblackeyepeas;
	public static Item itemgarbanzobeans;
	public static Item itemkidneybeans;
	public static Item itemlentils;
	public static Item itempintobeans;
	public static Item itemwhitebeans;

	
	
		//Kitchen Utensials
	public static Item itemknife;
	public static Item itemfork;
	public static Item itemspoon;
	public static Item itemplate;
	public static Item itembowl;
	public static Item itemtowel;
	public static Item itemnapkin;
	
	
	
	
	
		//Seeds
	public static Item itemappleseed;
	
		//saplings
	public static Block itemapplesapling;
	public static Block itemlemonsapling;

	//Blocks
	public static Block blockstove;
	public static Block blockmicrowave;
		//Plants
	public static Block plantpeanut;


@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	
	FoodModBlocks.init();
    FoodModItems.init();
	
	//Diamond Apple
    itemdiamondapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemdiamondapple").setTextureName("foodmod:itemdiamondapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemdiamondapple, itemdiamondapple.getUnlocalizedName().substring(5));
    
    //Coal Apple
    itemcoalapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemcoalapple").setTextureName("foodmod:itemcoalapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcoalapple, itemcoalapple.getUnlocalizedName().substring(5));
    
    //Gold Apple
    itemgoldapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemgoldapple").setTextureName("foodmod:itemgoldapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemgoldapple, itemgoldapple.getUnlocalizedName().substring(5));
    
    //Redstone Apple
    itemredstoneapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemredstoneapple").setTextureName("foodmod:itemredstoneapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemredstoneapple, itemredstoneapple.getUnlocalizedName().substring(5));
    
    //Emerald Apple
    itememeraldapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itememeraldapple").setTextureName("foodmod:itememeraldapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itememeraldapple, itememeraldapple.getUnlocalizedName().substring(5));
    
    //Lapiz Apple
    itemlapizapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemlapizapple").setTextureName("foodmod:itemlapizapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemlapizapple, itemlapizapple.getUnlocalizedName().substring(5));
    
    //Iron Apple
    itemironapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemironapple").setTextureName("foodmod:itemironapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemironapple, itemironapple.getUnlocalizedName().substring(5));
    
    //NetherStar Apple
    itemnetherstarapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemnetherstarapple").setTextureName("foodmod:itemnetherstarapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemnetherstarapple, itemnetherstarapple.getUnlocalizedName().substring(5));
   
    //DragonEgg Apple
    itemdragoneggapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemdragoneggapple").setTextureName("foodmod:itemdragoneggapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemdragoneggapple, itemdragoneggapple.getUnlocalizedName().substring(5));
    
    //Cheese
    itemcheese = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcheese").setTextureName("foodmod:itemgrilledcheese").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcheese, itemcheese.getUnlocalizedName().substring(5));
    
    //Grilled Cheese
    itemgrilledcheese = new ItemFood(6, 0.2F, false).setUnlocalizedName("itemgrilledcheese").setTextureName("foodmod:itemgrilledcheese").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemgrilledcheese, itemgrilledcheese.getUnlocalizedName().substring(5));
 
    //Flesh
    itemflesh = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemflesh").setTextureName("foodmod:itemflesh").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemflesh, itemflesh.getUnlocalizedName().substring(5));
    
    //Cooked Flesh
    itemcookedflesh = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemcookedflesh").setTextureName("foodmod:itemcookedflesh").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcookedflesh, itemcookedflesh.getUnlocalizedName().substring(5));
    
    //Bacon
    itembacon = new ItemFood(3, 0.2F, true).setUnlocalizedName("itembacon").setTextureName("foodmod:itembacon").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itembacon, itembacon.getUnlocalizedName().substring(5));
  
    //Cheese Cake
    itemcheesecake = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcheesecake").setTextureName("foodmod:itemcheesecake").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcheesecake, itemcheesecake.getUnlocalizedName().substring(5));
 
    //Carrot Cake
    itemcarrotcake = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcarrotcake").setTextureName("foodmod:itemcarrotcake").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcarrotcake, itemcarrotcake.getUnlocalizedName().substring(5));
 
    //Bark Bread
    itemBarkbread = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemBarkbread").setTextureName("foodmod:itemBarkbread").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemBarkbread, itemBarkbread.getUnlocalizedName().substring(5));

    //Kubdari
    itemKubdari = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemKubdari").setTextureName("foodmod:itemKubdari").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemKubdari, itemKubdari.getUnlocalizedName().substring(5));

    //Rice Bread
    itemRicebread = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemRicebread").setTextureName("foodmod:itemRicebread").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemRicebread, itemRicebread.getUnlocalizedName().substring(5));
    
    //Toast
    itemtoast = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemtoast").setTextureName("foodmod:itemtoast").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemtoast, itemtoast.getUnlocalizedName().substring(5));
    
    //Česnica
    itemČesnica = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemČesnica").setTextureName("foodmod:itemČesnica").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemČesnica, itemČesnica.getUnlocalizedName().substring(5));
    
    //Slicedbread
    itemSlicedbread = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemSlicedbread").setTextureName("foodmod:itemSlicedbread").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemSlicedbread, itemSlicedbread.getUnlocalizedName().substring(5));
    
    //Chocolate Bar
    itemchocolatebar = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemchocolatebar").setTextureName("foodmod:itemchocolatebar").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemchocolatebar, itemchocolatebar.getUnlocalizedName().substring(5));
    
    //Chocolate Milk
    itemchocolatemilk = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemchocolatemilk").setTextureName("foodmod:itemchocolatemilk").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemchocolatemilk, itemchocolatemilk.getUnlocalizedName().substring(5));
    
    //Pizza
    itempizza = new ItemFood(3, 0.2F, false).setUnlocalizedName("itempizza").setTextureName("foodmod:itempizza").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itempizza, itempizza.getUnlocalizedName().substring(5));
    
    //Ice Cream
    itemicecream = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemicecream").setTextureName("foodmod:itemicecream").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemicecream, itemicecream.getUnlocalizedName().substring(5));
    
    //Corn Dog
    itemcorndog = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcorndog").setTextureName("foodmod:itemcorndog").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcorndog, itemcorndog.getUnlocalizedName().substring(5));
    
    //Hot Dog
    itemhotdog = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemhotdog").setTextureName("foodmod:itemhotdog").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemhotdog, itemhotdog.getUnlocalizedName().substring(5));
    
    //Cotton Candy
    itemcottoncandy = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcottoncandy").setTextureName("foodmod:itemcottoncandy").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcottoncandy, itemcottoncandy.getUnlocalizedName().substring(5));
    
    //Apple Pie
    itemapplepie = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemapplepie").setTextureName("foodmod:itemapplepie").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemapplepie, itemapplepie.getUnlocalizedName().substring(5));
    
    //Candy Apple
    itemcandyapple = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcandyapple").setTextureName("foodmod:itemcandyapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcandyapple, itemcandyapple.getUnlocalizedName().substring(5));
    
    //Sugar Cookie
    itemsugarcookie = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemsugarcookie").setTextureName("foodmod:itemsugarcookie").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemsugarcookie, itemsugarcookie.getUnlocalizedName().substring(5));
    
    //Oreo
    itemoreo = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemoreo").setTextureName("foodmod:itemoreo").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemoreo, itemoreo.getUnlocalizedName().substring(5));
    
    //M&M's
    item_mms = new ItemFood(3, 0.2F, false).setUnlocalizedName("item_mms").setTextureName("foodmod:item_mms").setCreativeTab(FoodMod);
    GameRegistry.registerItem(item_mms, item_mms.getUnlocalizedName().substring(5));
    
    //Lemonade
    itemlemonade = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemlemonade").setTextureName("foodmod:itemlemonade").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemlemonade, itemlemonade.getUnlocalizedName().substring(5));
    
    //Lemon
    itemlemon = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemlemon").setTextureName("foodmod:itemlemon").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemlemon, itemlemon.getUnlocalizedName().substring(5));
    
    //Meatball
    itemmeatball = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemmeatball").setTextureName("foodmod:itemmeatball").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemmeatball, itemmeatball.getUnlocalizedName().substring(5));
    
    //Raw Meatball
    itemmeatballraw = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemmeatballraw").setTextureName("foodmod:itemmeatballraw").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemmeatballraw, itemmeatballraw.getUnlocalizedName().substring(5));
    
    //Pasta
    itempasta = new ItemFood(3, 0.2F, false).setUnlocalizedName("itempasta").setTextureName("foodmod:itempasta").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itempasta, itempasta.getUnlocalizedName().substring(5));
    
    //Chicken Wings
    itemchickenwings = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemchickenwings").setTextureName("foodmod:itemchickenwings").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemchickenwings, itemchickenwings.getUnlocalizedName().substring(5));
    
    //Raw Chicken Wings
    itemchickenwingsraw = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemchickenwingsraw").setTextureName("foodmod:itemchickenwingsraw").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemchickenwingsraw, itemchickenwingsraw.getUnlocalizedName().substring(5));
    
    //Chicken Nuggets
    itemchicken_nuggets = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemchicken_nuggets").setTextureName("foodmod:itemchicken_nuggets").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemchicken_nuggets, itemchicken_nuggets.getUnlocalizedName().substring(5));
    
    //Raw Chicken Nuggets
    itemchicken_nuggetsraw = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemchicken_nuggetsraw").setTextureName("foodmod:itemchicken_nuggetsraw").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemchicken_nuggetsraw, itemchicken_nuggetsraw.getUnlocalizedName().substring(5));
    
    //Peanut
    itempeanut = new ItemFood(3, 0.2F, false).setUnlocalizedName("itempeanut").setTextureName("foodmod:itempeanut").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itempeanut, itempeanut.getUnlocalizedName().substring(5));
    
    //Bean
    itembean = new ItemFood(3, 0.2F, false).setUnlocalizedName("itembean").setTextureName("foodmod:itembean").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itembean, itembean.getUnlocalizedName().substring(5));
    
    //Goat Milk
    itemgoatmilk = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemgoatmilk").setTextureName("foodmod:itemgoatmilk").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemgoatmilk, itemgoatmilk.getUnlocalizedName().substring(5));
    
    //Fishsticks
    itemfishsticks = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemfishsticks").setTextureName("foodmod:itemfishsticks").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemfishsticks, itemfishsticks.getUnlocalizedName().substring(5));
    
    //Raw Fishsticks
    itemfishsticksraw = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemfishsticksraw").setTextureName("foodmod:itemfishsticksraw").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemfishsticksraw, itemfishsticksraw.getUnlocalizedName().substring(5));
    
    //Pie
    itempie = new ItemFood(3, 0.2F, false).setUnlocalizedName("itempie").setTextureName("foodmod:itempie").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itempie, itempie.getUnlocalizedName().substring(5));
    
    //Mutton
    itemmutton = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemmutton").setTextureName("foodmod:itemmutton").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemmutton, itemmutton.getUnlocalizedName().substring(5));
    
    //Raw Mutton
    itemmuttonraw = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemmuttonraw").setTextureName("foodmod:itemmuttonraw").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemmuttonraw, itemmuttonraw.getUnlocalizedName().substring(5));
    
    //Lamb
    itemlamb = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemlamb").setTextureName("foodmod:itemlamb").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemlamb, itemlamb.getUnlocalizedName().substring(5));
    
    //Cooked Lamb
    itemlambraw = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemlambraw").setTextureName("foodmod:itemlambraw").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemlambraw, itemlambraw.getUnlocalizedName().substring(5));
    
    //Cheesecake Stuffed Strawberries
    itemCheesecakeStuffedStrawberries = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemCheesecakeStuffedStrawberries").setTextureName("foodmod:itemCheesecakeStuffedStrawberries").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemCheesecakeStuffedStrawberries, itemCheesecakeStuffedStrawberries.getUnlocalizedName().substring(5));
    
    
    //Stove
    blockstove = new Blockstove(Material.iron).setBlockName("blockstove").setBlockTextureName("foodmod:blockstove").setCreativeTab(FoodMod);
    GameRegistry.registerBlock(blockstove, blockstove.getUnlocalizedName().substring(5));
    System.out.println(blockstove.getUnlocalizedName().substring(5));
    
    //Microwave
    blockmicrowave = new Blockmicrowave(Material.iron).setBlockName("blockmicrowave").setBlockTextureName("foodmod:blockmicrowave").setCreativeTab(FoodMod);
    GameRegistry.registerBlock(blockmicrowave, blockmicrowave.getUnlocalizedName().substring(5));
    System.out.println(blockmicrowave.getUnlocalizedName().substring(5));
    
    //Peanut Seeds
    itempeanutSeeds = new itempeanutSeeds(FoodModBlocks.itempeanut, Blocks.farmland);
    


}


@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
    //•//Crafting Recipes//•//
    //END/•//Crafting Recipes//•/END//
    
    //•//Smelting Recipes//•// 
    	//Lamb Furnace Recipe
    GameRegistry.addSmelting(FoodModItems.itemlambraw, new ItemStack (FoodModItems.itemlamb, 1), 0.2F );
    	//Mutton Furnace Recipe
    GameRegistry.addSmelting(FoodModItems.itemmuttonraw, new ItemStack (FoodModItems.itemmutton, 1), 0.2F );
    	//Fishsticks Furnace Recipe
    GameRegistry.addSmelting(FoodModItems.itemfishsticks, new ItemStack (FoodModItems.itemfishsticks, 1), 0.2F );
    	//Chicken Nuggets Furnace Recipe
    GameRegistry.addSmelting(FoodModItems.itemchicken_nuggetsraw, new ItemStack (FoodModItems.itemchicken_nuggets, 1), 0.2F );
    	//Chicken Wings
    GameRegistry.addSmelting(FoodModItems.itemchickenwingsraw, new ItemStack (FoodModItems.itemchickenwings, 1), 0.2F );
    	//Meatball 
    GameRegistry.addSmelting(FoodModItems.itemmeatballraw, new ItemStack (FoodModItems.itemmeatball, 1), 0.2F );
    
    
    //END/•//Smelting Recipes//•/END//
  NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
}


public static CreativeTabs FoodMod = new CreativeTabs("FoodMod")
{


	public Item getTabIconItem() {

		return new ItemStack(Items.golden_apple).getItem();
	}


	}
;

	//Items
		//Seeds
		public static Item itempeanutSeeds;
	//Block
		//Plants
		public static Block blockpeanutPlant;

@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event) {
	{
	    MinecraftForge.EVENT_BUS.register(new Guioven(Minecraft.getMinecraft()));
	  }
}
}
