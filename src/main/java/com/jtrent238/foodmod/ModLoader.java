package com.jtrent238.foodmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModLoader {

	private static final Mod foodplus = null;
	private Object mods;


	public ModLoader(){
		
		this.LoadMods(mods);
	}

	private void LoadMods(Object mods2) {
		this.load(foodplus);
		
	}

	private void load(Mod foodplus2) {
		
	}

	static void LoadMods() {
	}
		public static Item testitem;
		
		/**
		 * Load Items.
		 */
	public static void LoadItems() {
		testitem = new  ItemNyanApple(2, 0.3F, false).setUnlocalizedName("testitem").setTextureName("foodmod:testitem").setCreativeTab(FoodMod.TestStuff);
		registerItems();
		
	}

	
	private static void registerItems() {
		GameRegistry.registerItem(testitem, testitem.getUnlocalizedName().substring(5));
		
		}
		
		{
	
	}
	
}

