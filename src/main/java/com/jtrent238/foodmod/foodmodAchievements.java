package com.jtrent238.foodmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.world.World;
import net.minecraftforge.common.AchievementPage;

public class foodmodAchievements {


	public static Achievement installFoodMod;
	public static Achievement Pork;
	public static Achievement nyan;
	
	
	public static AchievementPage page;

	
	
	public static void loadAchievements()
{
	installFoodMod = new Achievement("achievement.foodmod_install", "foodmod_install", 1, 2, new ItemStack(Items.diamond), null).setSpecial();
	installFoodMod.registerStat();
	Pork = new Achievement("achievement.Pork", "Pork", 3, 4, Items.cooked_chicken, (Achievement)null);
	Pork.registerStat();
	nyan = new Achievement("achievement.nyan", "nyan", 2, 3, Items.diamond, (Achievement)null);
	nyan.registerStat();
	
	page = new AchievementPage("jtrent238's Food Mod", installFoodMod, Pork, nyan);

}

	
	public static void registerPage()
{
	AchievementPage.registerAchievementPage(page);
}





/*
//Pork Achievement
protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity){
	onFoodEaten(itemStack, world, entity);float var4 = 1.0F;
	int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * (double)var4);
	int j = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * (double)var4 + 1.62D - (double)entity.yOffset);
	int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)var4);

	if(true){
	if(entity instanceof EntityPlayer)((EntityPlayer)entity).addStat(Pork, 1);
	}
	}



*/
}
