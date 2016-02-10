package com.jtrent238.foodmod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeCandyLand extends ModBiomes{


	public static int treesPerChunk;

    protected BiomeDecoratorMod decorator;


    public BiomeCandyLand(int biomeId) {
        super(biomeId);
        this.setTemperatureRainfall(0.8F, 0.4F);
        this.setHeight(height_Default);
        BiomeCandyLand.treesPerChunk = 2;
        this.theBiomeDecorator.treesPerChunk = -999;
        this.theBiomeDecorator.flowersPerChunk = 4;
        this.topBlock = BlockLoader.blockcandygrass;
        this.fillerBlock = BlockLoader.blockcandydirt;
        //Creatures
        this.spawnableCreatureList.clear();
        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityCandyPig.class, 5, 2, 6));//Spawns Candy Pig In CandyLand
        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityCandyGolem.class, 5, 2, 6));//Spawns Candy Golem In CandyLand
        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityCandyStealer.class, 5, 2, 6));//Spawns Candy Stealer In CandyLand
        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityFrostedVilliger.class, 5, 2, 6));//Spawns Candy Villager In CandyLand
        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityCandyStalker.class, 5, 2, 6));//Spawns Candy Stalker In CandyLand
        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityCandyCreeper.class, 5, 2, 6));//Spawns Candy Creeper In CandyLand
        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityCandyChicken.class, 5, 2, 6));//Spawns Candy Chicken In CandyLand
        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityCandyCow.class, 5, 2, 6));//Spawns Candy Cow In CandyLand
        //Water Creatures
        this.spawnableWaterCreatureList.clear();
        //Monsters
        this.spawnableMonsterList.clear();
        this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityCandySpider.class, 5, 2, 6));//Spawns Candy Spider In CandyLand
        this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityCandySlime.class, 5, 2, 6));//Spawns Candy Slime In CandyLand
        this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityCandyCreeperBlue.class, 5, 2, 6));//Spawns Blue Candy Creeper In CandyLand
        this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityCandyGhast.class, 5, 2, 6));//Spawns Candy Ghast In CandyLand
        this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityGingerBreadMan.class, 5, 2, 6));//Spawns GingerBread Man In CandyLand
        this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityCandyStalker.class, 5, 2, 6));//Spawns Candy Stalker In CandyLand
        this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityCandyCreeper.class, 5, 2, 6));//Spawns Candy Creeper In CandyLand
        this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityCandyStealer.class, 5, 2, 6));//Spawns Candy Stealer In CandyLand
        //Cave Creatures
        this.spawnableCaveCreatureList.clear();
        this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityCandyBat.class, 5, 2, 6));//Spawns Candy Bat In CandyLand
        this.flowers.clear();
        this.addFlower(Blocks.red_flower,    biomeId,  biomeId);
        this.addFlower(Blocks.yellow_flower, biomeId, biomeId);
    }

    /**
     * Gets a WorldGen appropriate for this biome.
     */
    public WorldGenerator getRandomWorldGenForGrass(Random random){
        return random.nextInt(2) == 0 ? new WorldGenTallGrass(Blocks.tallgrass, 1) : new WorldGenTallGrass(Blocks.tallgrass, 2);
    }

    /**
     * Remove this to remove vines from dimension
     */
    public void decorate(World world, Random random, int par3, int par4) {
        super.decorate(world, random, par3, par4);
//        WorldGenVines worldgenvines = new WorldGenVines();
//
//        for (int k = 0; k < 50; ++k) {
//            int l = par3 + random.nextInt(16) + 8;
//            byte b0 = 64;
//            int i1 = par4 + random.nextInt(16) + 8;
//            worldgenvines.generate(world, random, l, b0, i1);
//        }
    }
}
