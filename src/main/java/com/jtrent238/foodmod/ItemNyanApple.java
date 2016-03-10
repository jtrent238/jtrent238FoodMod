package com.jtrent238.foodmod;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatBase;
import net.minecraft.world.World;

public class ItemNyanApple extends ItemFood{

	private static int potionid = getpotionid();
	public ItemNyanApple(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
	}



	private static int getpotionid() {
		
		potionid = 1;
		potionid = 2;
		potionid = 3;
		potionid = 4;
		potionid = 5;
		potionid = 6;
		potionid = 7;
		potionid = 8;
		potionid = 9;
		potionid = 10;
		potionid = 11;
		potionid = 12;
		potionid = 13;
		potionid = 14;
		potionid = 15;
		potionid = 16;
		potionid = 17;
		potionid = 18;
		potionid = 19;
		potionid = 20;
		potionid = 21;
		potionid = 22;
		potionid = 23;
		
		return potionid;
		
		
	}


	



	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
	    super.onFoodEaten(stack, world, player);
	    	world.playSoundAtEntity(player, "FoodMod:nyansound", 1.0F, 1.0F);
	        this.setPotionEffect(potionid, 255, 1, 100);
	        this.setPotionEffect(2, 255, 1, 1F);
	        this.setPotionEffect(3, 255, 1, 1F);
	        this.setPotionEffect(4, 255, 1, 1F);
	        this.setPotionEffect(5, 255, 1, 1F);
	        this.setPotionEffect(6, 255, 1, 1F);
	        this.setPotionEffect(7, 255, 1, 1F);
	        this.setPotionEffect(8, 255, 1, 1F);
	        this.setPotionEffect(9, 255, 1, 1F);
	        this.setPotionEffect(10, 255, 1, 1F);
	        this.setPotionEffect(11, 255, 1, 1F);
	        this.setPotionEffect(12, 255, 1, 1F);
	        this.setPotionEffect(13, 255, 1, 1F);
	        this.setPotionEffect(14, 255, 1, 1F);
	        this.setPotionEffect(15, 255, 1, 1F);
	        this.setPotionEffect(16, 255, 1, 1F);
	        this.setPotionEffect(17, 255, 1, 1F);
	        this.setPotionEffect(18, 255, 1, 1F);
	        this.setPotionEffect(19, 255, 1, 1F);
	        this.setPotionEffect(20, 255, 1, 1F);
	        this.setPotionEffect(21, 255, 1, 1F);
	        this.setPotionEffect(22, 255, 1, 1F);
	        this.setPotionEffect(23, 255, 1, 1F);
	        this.setAlwaysEdible();
	        //player.addStat(foodmodAchievements.nyan, 1);
	        
	    }
	
	
	
}


