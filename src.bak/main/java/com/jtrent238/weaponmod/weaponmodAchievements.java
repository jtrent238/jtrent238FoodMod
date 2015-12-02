package com.jtrent238.weaponmod;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class weaponmodAchievements {


	public static Achievement installMod;
	
	public static AchievementPage page;

	
	
	public static void loadAchievements()
{
	installMod = new Achievement("achievement.weaponmod_install", "weaponmod_install", 0, 0, new ItemStack(Items.diamond_sword), null).setSpecial();
	installMod.registerStat();
	
	page = new AchievementPage("jtrent238's Weapon Mod", installMod);
}

	
	public static void registerPage()
{
	AchievementPage.registerAchievementPage(page);
}

}