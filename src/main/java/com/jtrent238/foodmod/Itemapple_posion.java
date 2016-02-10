package com.jtrent238.foodmod;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class Itemapple_posion  extends ItemFood{

	private PotionEffect[] effects;

	public Itemapple_posion(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
        this.setPotionEffect(Potion.poison.id, 5000, 5, 1.0F); //potion effect, duration, effect level, probability of effect (1.0F = always, 0.0F = never)
        
	}



}
