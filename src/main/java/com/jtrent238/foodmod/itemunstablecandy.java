package com.jtrent238.foodmod;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

public class itemunstablecandy extends ItemFood{


	private int p_77844_1_;
	private int p_77844_2_;
	private int p_77844_3_;
	private float p_77844_4_;
	private ItemStack p_150892_1_;

	public itemunstablecandy(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		 
	}

	public itemunstablecandy() {
		super(6, 100F, true);
		this.setPotionEffect(Potion.hunger.id, 100, 0, 0.25F); //potion effect, duration, effect level, probability of effect (1.0F = always, 0.0F = never)
		this.setPotionEffect(Potion.nightVision.id, 100, 0, 0.25F); //potion effect, duration, effect level, probability of effect (1.0F = always, 0.0F = never)
		this.setPotionEffect(Potion.blindness.id, 100, 0, 0.25F); //potion effect, duration, effect level, probability of effect (1.0F = always, 0.0F = never)
		this.setPotionEffect(Potion.confusion.id, 100, 0, 0.25F); //potion effect, duration, effect level, probability of effect (1.0F = always, 0.0F = never)
		this.setPotionEffect(Potion.harm.id, 100, 0, 0.25F); //potion effect, duration, effect level, probability of effect (1.0F = always, 0.0F = never)
		this.setPotionEffect(Potion.poison.id, 100, 0, 0.25F); //potion effect, duration, effect level, probability of effect (1.0F = always, 0.0F = never)
		this.setPotionEffect(Potion.wither.id, 100, 0, 0.25F); //potion effect, duration, effect level, probability of effect (1.0F = always, 0.0F = never)
		this.setPotionEffect(Potion.weakness.id, 100, 0, 0.25F); //potion effect, duration, effect level, probability of effect (1.0F = always, 0.0F = never)
		this.setPotionEffect(Potion.jump.id, 100, 0, 0.25F); //potion effect, duration, effect level, probability of effect (1.0F = always, 0.0F = never)
		this.setPotionEffect(Potion.heal.id, 100, 0, 0.25F); //potion effect, duration, effect level, probability of effect (1.0F = always, 0.0F = never)
		this.setPotionEffect(Potion.digSlowdown.id, 100, 0, 0.25F); //potion effect, duration, effect level, probability of effect (1.0F = always, 0.0F = never)
		this.setPotionEffect(Potion.digSpeed.id, 100, 0, 0.25F); //potion effect, duration, effect level, probability of effect (1.0F = always, 0.0F = never)
		this.setPotionEffect(Potion.moveSlowdown.id, 100, 0, 0.25F); //potion effect, duration, effect level, probability of effect (1.0F = always, 0.0F = never)
		this.setPotionEffect(Potion.moveSpeed.id, 100, 0, 0.25F); //potion effect, duration, effect level, probability of effect (1.0F = always, 0.0F = never)
		this.isPotionIngredient(p_150892_1_);
	}

		
	}

	


