package com.jtrent238.foodmod;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;


public class FoodModItems {

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
	public static Item itemappleseed;
	public static Item plantSeeds;
	public static Item beetroot;
	public static Item HealingApple;
	public static Item StrawberrySeeds;
	public static Item GoldenCarrotSeeds;
	public static Item itemcandyfloss;
	
	public static void init() {

		HealingApple = new HealingApple(20, 1F, false);
		StrawberrySeeds = new StrawberrySeeds(FoodModBlocks.Strawberry, Blocks.farmland);
		GoldenCarrotSeeds = new GoldenCarrotSeeds(FoodModBlocks.GoldenCarrot, Blocks.farmland);
	}

	 	public static Item itemcandyarmorhelmet;
	    public static Item itemcandyarmorchestplate;
	    public static Item itemcandyarmorlegs;
	    public static Item itemcandyarmorboots;
	    
		  public static final ArmorMaterial CANDYARMOR = EnumHelper.addArmorMaterial("CANDYARMOR", 16, new int[] {2,7,5,3}, 56438);{
	    
	      
	    
	      itemcandyfloss = new itemcandyfloss(1, 1F, true);
	      GoldenCarrotSeeds = new GoldenCarrotSeeds(FoodModBlocks.GoldenCarrot, Blocks.farmland);
	      
	      //CandyArmor Armor Set
	      itemcandyarmorhelmet		=	new CandyArmorItemArmor(CANDYARMOR, 6, 0).setUnlocalizedName("itemcandyarmorhelmet").setTextureName("foodmod:itemcandyarmorhelmet");
	      itemcandyarmorchestplate		=	new CandyArmorItemArmor(CANDYARMOR, 6, 1).setUnlocalizedName("itemcandyarmorchestplate").setTextureName("foodmod:itemcandyarmorchestplate");
	      itemcandyarmorlegs		=	new CandyArmorItemArmor(CANDYARMOR, 6, 2).setUnlocalizedName("itemcandyarmorlegs").setTextureName("foodmod:itemcandyarmorlegs");
	      itemcandyarmorboots		=	new CandyArmorItemArmor(CANDYARMOR, 6, 3).setUnlocalizedName("itemcandyarmorboots").setTextureName("foodmod:itemcandyarmorboots");
	    
	    
	    
	}



		
	}


