package com.jtrent238.foodmod;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class ItemPeppermint_Sword extends ItemSword{


		public ItemPeppermint_Sword(ToolMaterial iron) {
			super(iron);
			this.setFull3D();
			this.setMaxStackSize(1);
			this.isDamageable();
			this.isRepairable();

		}

	}
