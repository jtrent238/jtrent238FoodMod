package com.jtrent238.lotsofblocks;

import com.jtrent238.foodmod.Blockpeppermintlog;
import com.jtrent238.weaponmod.GuiHandler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

@Mod(modid="lotsofblocks", name="jtrent238's Lots Of Blocks Mod", version="1.0.0.1")
public class lotsofblocks
{

	public static Block blockspawner;
	public static Block blockChest;
	public static Block blockCraftingTable;
	


@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	
	//Spawner
	blockspawner = new Blockspawner(Material.iron).setBlockName("blockspawner").setBlockTextureName("lotsofblocks:blockspawner").setCreativeTab(lotsofblocks);
    GameRegistry.registerBlock(blockspawner, blockspawner.getUnlocalizedName().substring(5));
    System.out.println(blockspawner.getUnlocalizedName().substring(5));
    
    //Chest
    int p_i45397_1_ = 0;
  	blockChest = new Blockchest(p_i45397_1_).setBlockName("blockChest").setBlockTextureName("lotsofblocks:blockChest").setCreativeTab(lotsofblocks);
    GameRegistry.registerBlock(blockChest, blockChest.getUnlocalizedName().substring(5));
    System.out.println(blockChest.getUnlocalizedName().substring(5));
    //Crafting Table
  	blockCraftingTable = new BlockCraftingTable(Material.wood).setBlockName("blockCraftingTable").setBlockTextureName("lotsofblocks:blockCraftingTable").setCreativeTab(lotsofblocks);
    GameRegistry.registerBlock(blockCraftingTable, blockCraftingTable.getUnlocalizedName().substring(5));
    System.out.println(blockCraftingTable.getUnlocalizedName().substring(5));
      
    
  
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

public static CreativeTabs lotsofblocks = new CreativeTabs("lotsofblocks")
{


	public Item getTabIconItem() {

		return new ItemStack(Blocks.lava).getItem();
	}


	}
;

@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event) {}
}
