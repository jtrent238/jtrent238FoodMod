package com.jtrent238.foodmod;


import cpw.mods.fml.client.*;
import cpw.mods.fml.client.registry.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.asm.*;
import cpw.mods.fml.common.asm.transformers.*;
import cpw.mods.fml.common.discovery.*;
import cpw.mods.fml.common.discovery.asm.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.functions.*;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.common.toposort.*;
import cpw.mods.fml.common.versioning.*;
import cpw.mods.fml.relauncher.*;
import cpw.mods.fml.server.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.*;
import net.minecraft.client.audio.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.achievement.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.model.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.client.settings.*;
import net.minecraft.command.*;
import net.minecraft.crash.*;
import net.minecraft.creativetab.*;
import net.minecraft.dispenser.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.*;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;
import net.minecraft.nbt.*;
import net.minecraft.network.*;
import net.minecraft.network.rcon.*;
import net.minecraft.pathfinding.*;
import net.minecraft.potion.*;
import net.minecraft.profiler.*;
import net.minecraft.server.*;
import net.minecraft.server.dedicated.*;
import net.minecraft.server.gui.*;
import net.minecraft.server.integrated.*;
import net.minecraft.server.management.*;
import net.minecraft.src.*;
import net.minecraft.stats.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.village.*;
import net.minecraft.world.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.chunk.storage.*;
import net.minecraft.world.demo.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.layer.*;
import net.minecraft.world.gen.structure.*;
import net.minecraft.world.storage.*;
import net.minecraftforge.classloading.*;
import net.minecraftforge.client.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.event.sound.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.event.entity.item.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.minecart.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.event.world.*;
import net.minecraftforge.oredict.*;
import net.minecraftforge.transformers.*;
import net.minecraft.init.*;
import java.util.*;

import net.minecraftforge.common.util.*;
import net.minecraft.client.renderer.texture.*;
public class test_plant {

public test_plant(){}

public static Block block;

public Object instance;public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){

GameRegistry.registerBlock(block, "TestPlant");
}
public void registerRenderers(){}
public void load(){
}


static{


block = (Block)(new BlockCustomFlower()).setHardness(0.01F).setResistance(2.0F).setLightLevel(0.0F).setBlockTextureName("blockrubyore").setBlockName("TestPlant").setStepSound(Block.soundTypeStone);Block.blockRegistry.addObject(179, "TestPlant", block);

}


public void generateSurface(World world, java.util.Random randomGenerator, int chunkX, int chunkZ){
for(int i = 0; i < 20; i++){
int l6 = chunkX + randomGenerator.nextInt(16) + 8;
int i11 = randomGenerator.nextInt(128);
int l14 = chunkZ + randomGenerator.nextInt(16) + 8;
(new WorldGenFlowers(test_plant.block)).generate(world, randomGenerator, l6, i11, l14);
}
}

public static class BlockCustomFlower extends BlockFlower{
IIcon la;
public BlockCustomFlower(){super(0);}
@SideOnly(Side.CLIENT)
@Override
public IIcon getIcon(int p_149691_1_, int p_149691_2_){return this.la;}
@SideOnly(Side.CLIENT)
@Override
public void registerBlockIcons(IIconRegister reg){
la = reg.registerIcon("null");}
@SideOnly(Side.CLIENT)
@SuppressWarnings("unchecked")
public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_){
for (int i = 0; i < 1; ++i){p_149666_3_.add(new ItemStack(p_149666_1_, 1, i));}}

public int quantityDropped(Random par1Random){
return 1;
}

public Item getItemDropped(int par1, Random par2Random, int par3){
return Item.getItemFromBlock(block);
}
}}
