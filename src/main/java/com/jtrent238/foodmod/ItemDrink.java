package com.jtrent238.foodmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionHelper;

public class ItemDrink extends ItemPotion{

	private Item ItemDrink;
	protected ItemStack stack;
	private int pass;

	public Item setUnlocalizedName(String string) {
		return ItemDrink;
	}

	public ItemDrink() {
		super();
	}
	
	/**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack p_77661_1_)
    {
        return EnumAction.drink;
    }
    
    @SideOnly(Side.CLIENT)
    public int getColorFromDamage(int p_77620_1_)
    {
        return PotionHelper.func_77915_a(p_77620_1_, false);
    }

    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack p_82790_1_, int p_82790_2_)
    {
        return p_82790_2_ > 0 ? 16777215 : this.getColorFromDamage(p_82790_1_.getItemDamage());
    }
}
