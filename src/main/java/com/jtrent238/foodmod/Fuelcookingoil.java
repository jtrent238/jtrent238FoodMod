package com.jtrent238.foodmod;

import java.util.Random;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Fuelcookingoil{

public Fuelcookingoil(){}

public Object instance;public void load(){
}

public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}
public void registerRenderers(){}
public int addFuel(ItemStack fuel){
Item item = fuel.getItem();

int id = 0;
if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air) id = Block.getIdFromBlock(Block.getBlockFromItem(item));
else id = Item.getIdFromItem(item);

if(id==Block.getIdFromBlock(FluidcookingOil.block))
return 2000;
else
return 0;
}
public String getVersion(){
return "1.0";
}}