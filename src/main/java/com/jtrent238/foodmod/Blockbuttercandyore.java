package com.jtrent238.foodmod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.jtrent238.foodmod.*;

public class Blockbuttercandyore {

	public Blockbuttercandyore(Material ground) {
	}

	public Blockbuttercandyore() {
	}

	public Block setBlockName(String string) {
		return FoodMod.blockbuttercandyore;
	}
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	  {
	    return FoodMod.itembuttercandy;
	  }

	  public int quantityDropped(Random p_149745_1_)
	  {
	    return 4;
	  }

	public CreativeTabs setCreativeTab(CreativeTabs foodMod) {
		return FoodMod.FoodMod;
	}
	}

