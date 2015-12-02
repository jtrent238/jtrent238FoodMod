package com.jtrent238.lotsofblocks;

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

@Mod(modid="lotsofblocks", name="jtrent238's Lots Of Blocks Mod", version="1.0.0.0")
public class lotsofblocks
{


	


@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	
	
    
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
