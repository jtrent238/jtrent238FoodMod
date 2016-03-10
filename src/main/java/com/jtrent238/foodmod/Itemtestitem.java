package com.jtrent238.foodmod;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class Itemtestitem   extends ItemFood{

	private static final int effect = FoodMod.PotionDrunk.getId();

	//private PotionEffect[] effects;

	public Itemtestitem(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
        this.setPotionEffect(effect, 1000, 0, true); //potion effect, duration, effect level, probability of effect (1.0F = always, 0.0F = never)
        
	}



	private void setPotionEffect(int id, int p_77844_2_, int p_77844_3_, boolean b) {
		
	}








}
