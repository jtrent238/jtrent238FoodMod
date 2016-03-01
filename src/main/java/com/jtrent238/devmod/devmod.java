package com.jtrent238.devmod;

import com.jtrent238.foodmod.Blockpeppermintlog;
import com.jtrent238.weaponmod.GuiHandler;
import com.jtrent238.weaponmod.Itemlightingwand;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockMobSpawner;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

@Mod(modid="devmod", name="jtrent238's Developer Mod", version="1.0.0.0")
public class devmod
{

	public static Block blockspawner;
	public static Item itemlightingwand;
	


@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	
	//Spawner
	blockspawner = new Blockspawner(Material.iron).setBlockName("blockspawner").setBlockTextureName("devmod:blockspawner").setCreativeTab(hiddenstuff);
    GameRegistry.registerBlock(blockspawner, blockspawner.getUnlocalizedName().substring(5));
    System.out.println(blockspawner.getUnlocalizedName().substring(5));
    //Lighting Wand
    itemlightingwand = new Itemlightingwand().setUnlocalizedName("itemlightingwand").setTextureName("devmod:itemlightingwand").setCreativeTab(devmod);
    GameRegistry.registerItem(itemlightingwand, itemlightingwand.getUnlocalizedName().substring(5));
    
    
  
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

public static CreativeTabs devmod = new CreativeTabs("devmod")
{
	public Item getTabIconItem() {
		return new ItemStack(Blocks.lava).getItem();
	}};

public static CreativeTabs hiddenstuff = new CreativeTabs("devmod.hiddenstuff")
	{
		public Item getTabIconItem() {
			return new ItemStack(Blocks.water).getItem();
		}};
@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event) {}
}
