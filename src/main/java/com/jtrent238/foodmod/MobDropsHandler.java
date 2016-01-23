package com.jtrent238.foodmod;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class MobDropsHandler
{
    @SubscribeEvent
    public void onMobDrops(LivingDropsEvent event)
    {
    	//Sheep Drops Mutton
        if (event.entity instanceof EntitySheep)
        {
 
            ItemStack stack = new ItemStack(FoodMod.itemmuttonraw);
            EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
 
            event.drops.add(drop);
        }
        //Horse Drops Horse Meat
        if (event.entity instanceof EntityHorse)
        {
 
            ItemStack stack = new ItemStack(FoodMod.itemhorsemeat_raw);
            EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
 
            event.drops.add(drop);
        }
    }
}