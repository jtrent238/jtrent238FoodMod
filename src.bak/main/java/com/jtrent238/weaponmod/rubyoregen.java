package com.jtrent238.weaponmod;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class rubyoregen implements IWorldGenerator{

	public void generateSurface(World world, java.util.Random rand, int chunkX, int chunkZ){
		for(int i = 0; i < 10; i++){
		int randPosX = chunkX + rand.nextInt(16);
		int randPosY = rand.nextInt(14)+0;
		int randPosZ = chunkZ + rand.nextInt(16);
		(new WorldGenMinable(Blockrubyore.block, 16)).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {

		
	}
	}


