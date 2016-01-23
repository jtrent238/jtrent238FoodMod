package com.jtrent238.weaponmod;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import com.google.common.collect.Sets;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemAxeEmerald extends ItemToolEmerald
{
	private String name = "ItemAxeEmerald";
    private static final Set blocksEffectiveAgainst = Sets.newHashSet(new Block[] {Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin});
    
    protected ItemAxeEmerald(EnumToolEmerald enumtoolemerald)
    {
        super(3.0F, enumtoolemerald, blocksEffectiveAgainst);   

		setUnlocalizedName(name);
		setTextureName(name);
		GameRegistry.registerItem(this, name);
    }

    public float func_150893_a(ItemStack p_150893_1_, Block p_150893_2_)
    {
        return p_150893_2_.getMaterial() != Material.wood && p_150893_2_.getMaterial() != Material.plants && p_150893_2_.getMaterial() != Material.vine ? super.func_150893_a(p_150893_1_, p_150893_2_) : this.efficiencyOnProperMaterial;
    }      
}

  