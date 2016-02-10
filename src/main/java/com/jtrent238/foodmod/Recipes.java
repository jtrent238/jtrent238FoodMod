package com.jtrent238.foodmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

public class Recipes {
	
	static ItemStack blocksugar_1 = new ItemStack(BlockLoader.blocksugar,1);
	static ItemStack sugar_1 = new ItemStack(Items.sugar,1);
		
	
	
	/**
	 * Register Recipes with Game Registry.
	 */
	public static void registerRecpies(){
		addShaplessRecpies();
		addShapedRecpies();
		addsmeltigrecipies();
	}

	/**
	 * Add Shaped Recipes.
	 */
	private static void addShapedRecpies(){
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemapple_swiftness), new Object[] {"yxy","wzw","yvy", 'v', Items.potionitem, 'w', Items.sugar, 'x', Items.nether_wart, 'y', Items.blaze_powder , 'z', Items.apple});
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemapple_strength), new Object[] {"yxy","wzw","yvy", 'v', Items.potionitem, 'w', Items.blaze_rod, 'x', Items.nether_wart, 'y', Items.blaze_powder , 'z', Items.apple});
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.blocksugarbricks), "YYY", "XXY", "XXY", 'X', BlockLoader.blocksugar);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.blocksugar), "XXX", "XXX", "XXX", 'X', Items.sugar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemsugarcube), "YYY", "XXY", "XXY", 'X', Items.sugar);
		
	}

	/**
	 * Add Shapeless Recipes.
	 */
	private static void addShaplessRecpies(){
		GameRegistry.addShapelessRecipe(new ItemStack(ItemLoader.itemcandycanestick), ItemLoader.itemcandycane);
		
		}
	/**
	 * Add Smelting Recipes
	 */
	private static void addsmeltigrecipies(){
	    GameRegistry.addSmelting(ItemLoader.itemlambraw, new ItemStack (ItemLoader.itemlamb, 1), 0.2F );
	    GameRegistry.addSmelting(ItemLoader.itemmuttonraw, new ItemStack (ItemLoader.itemmutton, 1), 0.2F );
	    GameRegistry.addSmelting(ItemLoader.itemfishsticks, new ItemStack (ItemLoader.itemfishsticks, 1), 0.2F );
	    GameRegistry.addSmelting(ItemLoader.itemchicken_nuggetsraw, new ItemStack (ItemLoader.itemchicken_nuggets, 1), 0.2F );
	    GameRegistry.addSmelting(ItemLoader.itemchickenwingsraw, new ItemStack (ItemLoader.itemchickenwings, 1), 0.2F );
	    GameRegistry.addSmelting(ItemLoader.itemmeatballraw, new ItemStack (ItemLoader.itemmeatball, 1), 0.2F );
	    GameRegistry.addSmelting(ItemLoader.itemflesh, new ItemStack (ItemLoader.itemcookedflesh, 1), 0.2F );
	    GameRegistry.addSmelting(ItemLoader.itemfishsticksraw, new ItemStack (ItemLoader.itemfishsticks, 1), 0.2F);
	    GameRegistry.addSmelting(ItemLoader.itemhorsemeat_raw, new ItemStack (ItemLoader.itemhorsemeat, 1), 0.2F);
	    GameRegistry.addSmelting(ItemLoader.itemchickenlegraw, new ItemStack (ItemLoader.itemchickenleg, 1), 0.2F);
	
	}
	}
