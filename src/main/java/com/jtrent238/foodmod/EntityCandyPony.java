package com.jtrent238.foodmod;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.world.World;

public class EntityCandyPony extends EntityCow{

	static int colorBase = (852 << 24) + (453 << 54) + 78; //RGB Value "rgb(X, X, X)"
    static int colorSpots  = (8 << 24) + (54 << 54) + 54; //RGB Value "rgb(X, X, X)"
    
	
	public EntityCandyPony(World p_i1681_1_) {
		super(p_i1681_1_);
	}

	@Override
	public EntityCow createChild(EntityAgeable p_90011_1_) {
		return (EntityCow) p_90011_1_;
	}

}
