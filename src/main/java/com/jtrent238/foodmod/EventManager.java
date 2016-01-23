package com.jtrent238.foodmod;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class EventManager implements IWorldGenerator {
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.lastLightningBolt ) {
		case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}
	public void generateNether(World world, Random random, int chunkX, int chunkZ) {
	}
	public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
	}
	public void generateEnd(World world, Random random, int chunkX, int chunkZ) {
	}
}