package com.jtrent238.weaponmod;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Itemlightingwand extends Item {

	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity){
		float var4 = 1.0F;
		int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * (double)var4);
		int j = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * (double)var4 + 1.62D - (double)entity.yOffset);
		int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)var4);

		if(true){
		world.spawnEntityInWorld(new EntityLightningBolt(world, i, j, k));
		}

		return itemstack;
}
	{
	this.setFull3D();
	}

}