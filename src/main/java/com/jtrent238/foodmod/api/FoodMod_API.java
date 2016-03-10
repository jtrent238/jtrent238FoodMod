package com.jtrent238.foodmod.api;

import com.jtrent238.foodmod.Recipes;
import cpw.mods.fml.common.registry.GameRegistry.Type;
//import net.minecraftforge.common.config.Property.Type;

public class FoodMod_API {

	public static Type BLENDER;
	public static Type OVEN;
	public static Type FRIDGE;
	public static Type FREEZER;
	public static Type MICROWAVE;
	private static Object microwave;
	private static Object input;
	private static Object output;
	private static Object fridge;
	private static Object blendVars;
	private static Object blendVars_in;
	private static Object blendVars_out;
	private static Object fridgeVars;
	private static Object fridgeVars_in;
	private static Object fridgeVars_out;
	private static Object freezerVars;
	private static Object freezerVars_in;
	private static Object freezerVars_out;
	private static Object microwaveVars;
	private static Object microwaveVars_in;
	private static Object microwaveVars_out;
	private static Object ovenVars;
	private static Object ovenVars_in;
	private static Object ovenVars_out;



	public static void blender(Recipes blendrecipe) {
		blendrecipe.BLENDER = BLENDER;
		blendVars = null;
		blendVars_in = (input);
		blendVars_out = (output);
	}
	
	public static void fridge(Recipes fridgerecipe) {
		fridgerecipe.FRIDGE = FRIDGE;
		fridgeVars = null;
		fridgeVars_in = (input);
		fridgeVars_out = (output);
	}
	
	public static void freezer(Recipes freezerrecipe) {
		freezerrecipe.FREEZER = FREEZER;
		freezerVars = null;
		freezerVars_in = (input);
		freezerVars_out = (output);
	}
	
	public static void microwave(Recipes microwaverecipe) {
		microwaverecipe.MICROWAVE = MICROWAVE;
		microwaveVars = null;
		microwaveVars_in = (input);
		microwaveVars_out = (output);
	}
	public static void oven(Recipes ovenrecipe) {
		ovenrecipe.OVEN = OVEN;
		ovenVars = null;
		ovenVars_in = (input);
		ovenVars_out = (output);
	}
	
}
