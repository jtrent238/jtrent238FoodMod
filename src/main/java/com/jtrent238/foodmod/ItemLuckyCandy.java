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
        this.setPotionEffect(Potion.wither.id, 5, 5, 0.5F); //potion effect, duration, effect level, probability of effect (1.0F = always, 0.0F = never)
        this.setPotionEffect(Potion.regeneration.id, 5, 5, 0.5F); //potion effect, duration, effect level, probability of effect (1.0F = always, 0.0F = never)
    }



	private void registerItem(String string) {
		
	}



	public ItemLuckyCandy(int i, float f, boolean b) {
		super(i, b);
	}

	public ItemLuckyCandy() {
		super(healAmount, alwaysEdible);

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