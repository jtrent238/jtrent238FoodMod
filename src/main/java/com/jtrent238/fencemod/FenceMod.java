package com.jtrent238.fencemod;

import com.jtrent238.foodmod.Blockpeppermintlog;
import com.jtrent238.weaponmod.GuiHandler;
import com.jtrent238.weaponmod.Itemlightingwand;

import cpw.mods.fml.client.registry.ClientRegistry;
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

@Mod(modid="fencemod", name="jtrent238's Fence Mod", version="1.0.0.0")
public class FenceMod
{

	public static Block blockpicketfence;
	private String p_i45406_1_;
	


@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	
	//picketfence
	blockpicketfence = new Blockpicketfence(p_i45406_1_, Material.wood).setBlockName("blockpicketfence").setBlockTextureName("fencemod:blockpicketfence").setCreativeTab(fencemod);
    GameRegistry.registerBlock(blockpicketfence, blockpicketfence.getUnlocalizedName().substring(5));
    System.out.println(blockpicketfence.getUnlocalizedName().substring(5));
   
  
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

public static CreativeTabs fencemod = new CreativeTabs("fencemod")
{
	public Item getTabIconItem() {
		return new ItemStack(Blocks.fence).getItem();
	}};

	 public void registerRenderThings() {
         ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockpicketfenceEntity.class, new TileEntityBlockpicketfenceRenderer());
 }
@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event) {}
}
