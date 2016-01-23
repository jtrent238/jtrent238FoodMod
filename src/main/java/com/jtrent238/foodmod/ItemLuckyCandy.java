package com.jtrent238.foodmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemLuckyCandy extends ItemFood {

    


	private static int healAmount;
	private static boolean alwaysEdible;
	private PotionEffect[] effects;


	public ItemLuckyCandy(PotionEffect[] effects) {
        super(healAmount, alwaysEdible);
        this.setUnlocalizedName("itemluckycandy");
        this.setTextureName("foodmod:itemluckycandy");
        this.setCreativeTab(FoodMod.FoodMod);
        this.registerItem("itemluckycandy");
        this.effects = effects;
    }



	private void registerItem(String string) {
		
	}



	public ItemLuckyCandy(int i, float f, boolean b) {
		super(i, b);
	}

	public ItemLuckyCandy() {
		super(healAmount, alwaysEdible);
	}



	public void onFoodEaten(ItemStack p_77654_1_, World p_77654_2_,
	        EntityPlayer p_77654_3_) {
		this.addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 4), 0.5);
        this.addPotionEffect(new PotionEffect(Potion.wither.id, 200, 4), 0.5);


	}


	private void addPotionEffect(PotionEffect potionEffect, double d) {
		this.addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 4), 0.5);
        this.addPotionEffect(new PotionEffect(Potion.wither.id, 200, 4), 0.5);

	}
	/**
     * Set the field 'alwaysEdible' to true, and make the food edible even if the player don't need to eat.
     */
    public ItemFood setAlwaysEdible()
    {
        this.alwaysEdible = true;
        return this;
    }
    
}