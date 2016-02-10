package com.jtrent238.foodmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerPickupXpEvent;

public class EntityCandyXPOrb extends EntityXPOrb{

	public EntityCandyXPOrb(World p_i1585_1_, double p_i1585_2_, double p_i1585_4_, double p_i1585_6_, int p_i1585_8_) {
		super(p_i1585_1_, p_i1585_2_, p_i1585_4_, p_i1585_6_, p_i1585_8_);
	}
	protected void ResourceLocation(String string) {
		this.ResourceLocation("EntityCandyXPOrb.png");
		}

}