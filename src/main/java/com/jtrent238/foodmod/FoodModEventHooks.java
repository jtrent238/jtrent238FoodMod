package com.jtrent238.foodmod;

import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class FoodModEventHooks {



public void onEntityUpdate(LivingUpdateEvent event) 
{
     //entityLiving in fact refers to EntityLivingBase so to understand everything about this part go to EntityLivingBase instead
     if (event.entityLiving.isPotionActive(FoodMod.PotionDrunk)) 
     {
         if (event.entityLiving.worldObj.rand.nextInt(20) == 0) 
         {
                  
         }
     }
}
}