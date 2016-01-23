package com.jtrent238.foodmod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import cpw.mods.fml.common.IWorldGenerator;

public class BasicWorldGen implements IWorldGenerator {

    @Override
    public void generate (Random random, int chunkX, int chunkZ, World world,
            IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
    	int x = chunkX * 16;
    	int z = chunkZ * 16;
    	
        compass(random, x, z, world, chunkGenerator, chunkProvider);
        ore(random, x, z, world, chunkGenerator, chunkProvider);
    }

    private void compass (Random random, int x, int z, World world,
            IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

    }
    
    private void ore (Random random, int x, int z, World world,
    		IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
    }

}
