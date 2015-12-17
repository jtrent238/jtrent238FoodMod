package com.jtrent238.weaponmod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class weaponmodAchievements {


	public static Achievement installMod;
	public static Achievement dirtystart;
	
	
	public static AchievementPage page;

	
	
	public static void loadAchievements()
{
	installMod = new Achievement("achievement.weaponmod_install", "weaponmod_install", 0, 0, new ItemStack(Items.diamond_sword), null).setSpecial();
	installMod.registerStat();
	dirtystart = new Achievement("dirtystart.ach", "ach", 1, 1, Blocks.dirt, installMod);
	dirtystart.registerStat();

	
	page = new AchievementPage("jtrent238's Weapon Mod", installMod, dirtystart);

}

	
	public static void registerPage()
{
	AchievementPage.registerAchievementPage(page);
}

}