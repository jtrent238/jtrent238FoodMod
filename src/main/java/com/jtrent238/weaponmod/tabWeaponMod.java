package com.jtrent238.weaponmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class tabWeaponMod extends CreativeTabs 
{

	public tabWeaponMod(String label) 
	{
		super(label);
	}

	@Override
	public Item getTabIconItem() 
	{
		return Items.diamond_sword;
	}

	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "tabWeaponMod.png";
	}
	
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
}