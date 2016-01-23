package com.jtrent238.foodmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class FoodModBlocks {

	public static final Block plant = null;
	public static Block itemapplesapling;
	public static Block itemlemonsapling;
	public static Block blockstove;
	public static Block blockmicrowave;
	public static Block plantpeanut;
	public static Block tutorialBlock;
	public static Object itempeanut;

	public static Block Flourblock;
	public static Block Strawberry; 
	public static Block StrawberryPlant;
	public static Block GoldenCarrot;
    
    public static void init() {
    
        Flourblock = new BlockFlour();        
        Strawberry = new Strawberry();   
        GoldenCarrot = new GoldenCarrot();
    }
	


	}


