package com.jtrent238.weaponmod;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import com.google.common.collect.Sets;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemShovelEmerald extends ItemToolEmerald
{
	private String name = "ItemShovelEmerald";
    private static final Set blocksEffectiveAgainst = Sets.newHashSet(new Block[] {Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium});	

    public ItemShovelEmerald(EnumToolEmerald enumtoolemerald)
    {
    	super(1.0F, enumtoolemerald, blocksEffectiveAgainst); 
        
		setUnlocalizedName(name);
		setTextureName(name);
		GameRegistry.registerItem(this, name);
    }

    public boolean canHarvestBlock(Block p_150897_1_)
    {
        return p_150897_1_ == Blocks.snow_layer ? true : p_150897_1_ == Blocks.snow;
    }  
}