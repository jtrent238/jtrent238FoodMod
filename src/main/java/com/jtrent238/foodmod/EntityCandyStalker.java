package com.jtrent238.foodmod;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemLead;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityCandyStalker extends EntityMob{

	static int colorBase = (255 << 23) + (451 << 52) + 581; //RGB Value "rgb(X, X, X)"
    static int colorSpots  = (255 << 45) + (75 << 51) + 452; //RGB Value "rgb(X, X, X)"
	
    private static Item getmobdrops() {
		return Items.diamond;
	}
    

    
	public EntityCandyStalker(World p_i1738_1_) {
		super(p_i1738_1_);
	}
	/**
     * Drop items of this living's type
     */
    protected void dropFewItems(boolean var1, int var2)
    {
    	this.entityDropItem(new ItemStack(EntityCandyStalker.getmobdrops()), 0.0F);

    }
}
