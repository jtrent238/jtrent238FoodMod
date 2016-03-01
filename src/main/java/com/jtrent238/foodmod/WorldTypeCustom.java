package com.jtrent238.foodmod;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenDesert;
import net.minecraft.world.biome.BiomeGenForest;
import net.minecraft.world.biome.BiomeGenHills;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraft.world.biome.BiomeGenPlains;
import net.minecraft.world.biome.BiomeGenRiver;
import net.minecraft.world.biome.BiomeGenSwamp;
import net.minecraft.world.biome.BiomeGenTaiga;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldTypeCustom extends WorldType
{

	public WorldTypeCustom(int i, String name) {
		super(name);
			//Add Biomes
        this.addNewBiome(BiomeGenBase.sky);
        this.addNewBiome(BiomeGenBase.hell);
        	//Remove Biomes
		this.removeBiome(BiomeGenBase.desert); 
        this.removeBiome(BiomeGenBase.ocean);
        this.removeBiome(BiomeGenBase.plains);
        this.removeBiome(BiomeGenBase.desert);
        this.removeBiome(BiomeGenBase.extremeHills);
        this.removeBiome(BiomeGenBase.forest);
        this.removeBiome(BiomeGenBase.taiga);
        this.removeBiome(BiomeGenBase.swampland);
        this.removeBiome(BiomeGenBase.river);
        this.removeBiome(BiomeGenBase.frozenOcean);
        this.removeBiome(BiomeGenBase.frozenRiver);
        this.removeBiome(BiomeGenBase.icePlains);
        this.removeBiome(BiomeGenBase.iceMountains);
        this.removeBiome(BiomeGenBase.mushroomIsland);
        this.removeBiome(BiomeGenBase.mushroomIslandShore);
        this.removeBiome(BiomeGenBase.beach);
        this.removeBiome(BiomeGenBase.desertHills);
        this.removeBiome(BiomeGenBase.forestHills);
        this.removeBiome(BiomeGenBase.taigaHills);
        this.removeBiome(BiomeGenBase.extremeHillsEdge);
        this.removeBiome(BiomeGenBase.jungle);
        this.removeBiome(BiomeGenBase.jungleHills);
        this.removeBiome(BiomeGenBase.jungleEdge);
        this.removeBiome(BiomeGenBase.deepOcean);
        this.removeBiome(BiomeGenBase.stoneBeach);
        this.removeBiome(BiomeGenBase.coldBeach);
        this.removeBiome(BiomeGenBase.birchForest);
        this.removeBiome(BiomeGenBase.birchForestHills);
        this.removeBiome(BiomeGenBase.roofedForest);
        this.removeBiome(BiomeGenBase.coldTaiga);
        this.removeBiome(BiomeGenBase.coldTaigaHills);
        this.removeBiome(BiomeGenBase.megaTaiga);
        this.removeBiome(BiomeGenBase.megaTaigaHills);
        this.removeBiome(BiomeGenBase.extremeHillsPlus);
        this.removeBiome(BiomeGenBase.savanna);
        this.removeBiome(BiomeGenBase.savannaPlateau);
        this.removeBiome(BiomeGenBase.mesa);
        this.removeBiome(BiomeGenBase.mesaPlateau_F);
        this.removeBiome(BiomeGenBase.mesaPlateau);

        
	}

	private void removeBiome(BiomeGenBase desert) {
		
	}

	private void addNewBiome(BiomeGenBase hell) {
		
	}

	
}