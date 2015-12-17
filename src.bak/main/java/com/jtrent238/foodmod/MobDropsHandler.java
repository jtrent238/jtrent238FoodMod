package com.jtrent238.foodmod;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class MobDropsHandler
{
public static Item itemmuttonraw;

@SubscribeEvent
//Sheep Drops Raw Mutton
public void onSheepDrops(LivingDropsEvent event)

{
if (event.entity instanceof EntitySheep)
{

 
ItemStack stack = new ItemStack(itemmuttonraw);
EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
 
event.drops.add(drop);
}
}
}
