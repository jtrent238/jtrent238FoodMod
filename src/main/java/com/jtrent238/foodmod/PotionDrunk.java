package com.jtrent238.foodmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.potion.Potion;

public class PotionDrunk  extends Potion {


	private Potion PotionDrunk;

	protected PotionDrunk(int par1, boolean par2, int par3) {
		super(24, true, 64);
		this.setPotionName("potion.potionDrunk");
		this.isBadEffect();
		this.getLiquidColor();
		this.getEffectiveness();
		this.setIconIndex(3, 2);
		this.setUnlocalizedName("potionDrunk");
	}



	public Potion setIconIndex(int par1, int par2) 
	   {
	     super.setIconIndex(par1, par2);
	     return this;
	   }

	public Potion setUnlocalizedName(String string) {
		return PotionDrunk;
	}
	}