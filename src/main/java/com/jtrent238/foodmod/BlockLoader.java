package com.jtrent238.foodmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLoader {
	//Blocks
		public static Block blockstove;
		public static Block blockmicrowave;
		public static Block blockfridge;
		public static Block blockchocolate;
		public static Block blockcaramel;
		public static Block blocksugarore;
		public static Block blocksugar;
		public static Block blocksugarbricks;
		public static Block blockchocolatebricks;
		public static Block blockfoodtnt;
		public static Block blocklight;
		public static Block blocktestportal;
		public static Block blockfoodchest;
		public static Block cakechest;
		public static Block blockpeppermintlog;
		public static Block jtrent238skull;
		public static Block BlockOven;
		public static Block Cherryleaves;
		public static Block blockbuttercandyore;
		public static Block blockcherryworkbench;
		public static Block blockcherryplanks;
		public static Block blockcandystone;
		public static Block blockcandygrass;
		public static Block blockcandydirt;
		public static Block blockcandyportal;
		public static Block blockcandyrail;
		public static Block blockfrozenpumpkin;
		
		public static Block blockdeepdishpizza;

		public static Block BlockGrinder;
		public static Block test_block;
		public static Block blockgourd;
		
			//Cakes
		public static Block blockbluecake;
		public static Block blockgoldcake;
		public static Block blocktestcake;
		public static Block blockchocolatecake;
		public static Block blockmagentacake;
		public static Block blockblackcake;
		public static Block blockposioncake;
		public static Block blockcreepercakeblue;
		public static Block blockcreepercakegreen;
		public static Block blockredvelvetcake;
		
			//Plants
		public static Block plantpeanut;
		public static Block BlockOvenActive;
		public static Block BlockCandyFire;
		
		public final static Block liquidMilkFlowing = new liquidMilkFlowing(500).setBlockName("liquidMilkFlowing");
        public final static Block liquidMilkStill = new liquidMilkStill(501).setBlockName("liquidMilkStill");
		/**
		 * Load Blocks.
		 */
		public static void loadBlocks(){
			blockbluecake = new Blockbluecake(Material.cake).setBlockName("blockbluecake").setBlockTextureName("foodmod:blockbluecake").setHardness(0.5F).setStepSound(Block.soundTypeCloth).setCreativeTab(FoodMod.FoodMod);
			blockchocolatecake = new Blockchocolatecake(Material.cake).setBlockName("blockchocolatecake").setBlockTextureName("foodmod:blockchocolatecake").setHardness(0.5F).setStepSound(Block.soundTypeCloth).setCreativeTab(FoodMod.FoodMod);
			blockgoldcake = new Blockgoldcake(Material.cake).setBlockName("blockgoldcake").setBlockTextureName("foodmod:blockgoldcake").setHardness(0.5F).setStepSound(Block.soundTypeCloth).setCreativeTab(FoodMod.FoodMod);
			blockmagentacake = new Blockmagentacake(Material.cake).setBlockName("blockmagentacake").setBlockTextureName("foodmod:blockmagentacake").setHardness(0.5F).setStepSound(Block.soundTypeCloth).setCreativeTab(FoodMod.FoodMod);
			blockblackcake = new Blockblackcake(Material.cake).setBlockName("blockblackcake").setBlockTextureName("foodmod:blockblackcake").setHardness(0.5F).setStepSound(Block.soundTypeCloth).setCreativeTab(FoodMod.FoodMod);
			blockposioncake = new Blockposioncake(Material.cake).setBlockName("blockposioncake").setBlockTextureName("foodmod:blockposioncake").setHardness(0.5F).setStepSound(Block.soundTypeCloth).setCreativeTab(FoodMod.FoodMod);
			blockcreepercakeblue = new Blockcreepercakeblue(Material.cake).setBlockName("blockcreepercakeblue").setBlockTextureName("foodmod:blockcreepercakeblue").setHardness(0.5F).setStepSound(Block.soundTypeCloth).setCreativeTab(FoodMod.FoodMod);
			blockcreepercakegreen = new Blockcreepercakegreen(Material.cake).setBlockName("blockcreepercakegreen").setBlockTextureName("foodmod:blockcreepercakegreen").setHardness(0.5F).setStepSound(Block.soundTypeCloth).setCreativeTab(FoodMod.FoodMod);
			blockredvelvetcake = new Blockredvelvetcake(Material.cake).setBlockName("blockredvelvetcake").setBlockTextureName("foodmod:blockredvelvetcake").setHardness(0.5F).setStepSound(Block.soundTypeCloth).setCreativeTab(FoodMod.FoodMod);
			blockdeepdishpizza = new Blockdeepdishpizza(Material.cake).setBlockName("blockdeepdishpizza").setBlockTextureName("foodmod:blockdeepdishpizza").setHardness(0.5F).setStepSound(Block.soundTypeCloth).setCreativeTab(FoodMod.FoodMod);
			blockstove = new Blockstove(Material.anvil).setBlockName("blockstove").setBlockTextureName("foodmod:blockstove").setCreativeTab(FoodMod.FoodMod);
			blockmicrowave = new Blockmicrowave(Material.iron).setBlockName("blockmicrowave").setBlockTextureName("foodmod:blockmicrowave").setCreativeTab(FoodMod.FoodMod);
			blocksugarore = new Blocksugarore(Material.ground).setBlockName("blocksugarore").setBlockTextureName("foodmod:blocksugarore").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(FoodMod.FoodMod);
			blocksugarbricks = new Blocksugarbricks(Material.ground).setBlockName("blocksugarbricks").setBlockTextureName("foodmod:blocksugarbricks").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(FoodMod.FoodMod);
			blocksugar = new Blocksugar(Material.ground).setBlockName("blocksugar").setBlockTextureName("foodmod:blocksugar").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(FoodMod.FoodMod);
		    blockfoodtnt = new Blockfoodtnt(Material.ground).setStepSound(Block.soundTypeGravel).setBlockName("blockfoodtnt").setBlockTextureName("foodmod:blockfoodtnt").setCreativeTab(FoodMod.FoodMod);
		    blocklight = new Blocklight(Material.ground).setBlockName("blocklight").setBlockTextureName("foodmod:blocklight").setCreativeTab(FoodMod.FoodMod);
		    blocktestportal = new Blocktestportal(Material.portal).setBlockName("blocktestportal").setBlockTextureName("foodmod:blocktestportal");
		    blockpeppermintlog = new Blockpeppermintlog(Material.wood).setBlockName("blockpeppermintlog").setBlockTextureName("foodmod:blockpeppermintlog").setCreativeTab(FoodMod.FoodMod);
		    Cherryleaves = new Cherryleaves(Material.leaves).setBlockName("Cherryleaves").setHardness(0.2F).setStepSound(Block.soundTypeGrass).setBlockTextureName("foodmod:leaves_cherry").setCreativeTab(FoodMod.FoodMod);
		    jtrent238skull = new jtrent238skull(Material.ground).setBlockName("jtrent238skull").setBlockTextureName("foodmod:jtrent238skull").setCreativeTab(FoodMod.FoodMod);
		    BlockOven = new BlockOven(Material.anvil).setBlockName("BlockOven").setBlockTextureName("foodmod:BlockOven").setCreativeTab(FoodMod.FoodMod);
		    BlockOvenActive = new BlockOvenActive(Material.anvil).setBlockName("BlockOvenActive").setBlockTextureName("foodmod:BlockOvenActive").setCreativeTab(FoodMod.FoodMod);
		    blockcherryworkbench = new Blockcherryworkbench(Material.wood).setBlockName("blockcherryworkbench").setHardness(2.5F).setStepSound(Block.soundTypeWood).setBlockTextureName("foodmod:cherryworkbench").setCreativeTab(FoodMod.FoodMod);
		    blockcherryplanks = new Blockcherryplanks(Material.wood).setBlockName("blockcherryplanks").setHardness(2F).setStepSound(Block.soundTypeWood).setBlockTextureName("foodmod:blockcherryplanks").setCreativeTab(FoodMod.FoodMod);
		    blockcandystone = new Blockcandystone(Material.ground).setBlockName("blockcandystone").setHardness(1.5F).setStepSound(Block.soundTypeStone).setBlockTextureName("foodmod:blockcandystone").setCreativeTab(FoodMod.FoodMod);
		    blockcandydirt = new blockcandydirt(Material.grass).setBlockName("blockcandydirt").setHardness(0.5F).setStepSound(Block.soundTypeGravel).setBlockTextureName("foodmod:blockcandydirt").setCreativeTab(FoodMod.FoodMod);
		    blockcandygrass = new blockcandygrass(Material.grass).setBlockName("blockcandygrass").setHardness(0.6F).setStepSound(Block.soundTypeGrass).setBlockTextureName("foodmod:blockcandygrass").setCreativeTab(FoodMod.FoodMod);
		    blockcandyportal = new Blockcandyportal("blockcandyportal").setHardness(100F).setBlockTextureName("foodmod:blockcandyportal").setCreativeTab(FoodMod.FoodMod);
		    blockcandyrail = new Blockcandyrail("blockcandyrail").setBlockTextureName("foodmod:blockcandyrail").setCreativeTab(FoodMod.FoodMod);
		    blockfrozenpumpkin = new Blockfrozenpumpkin(true).setBlockTextureName("foodmod:blockfrozenpumpkin").setCreativeTab(FoodMod.FoodMod);
		    
			
			registerBlocks();
		}

		/**
		 * Register Blocks.
		 */
		private static void registerBlocks(){
			GameRegistry.registerBlock(blockchocolatecake, "blockbluecake");
			GameRegistry.registerBlock(blockbluecake, "blockchocolatecake");
			GameRegistry.registerBlock(blockgoldcake, "blockgoldcake");
			GameRegistry.registerBlock(blockmagentacake, "blockmagentacake");
			GameRegistry.registerBlock(blockblackcake, "blockblackcake");
			GameRegistry.registerBlock(blockposioncake, "blockposioncake");
			GameRegistry.registerBlock(blockcreepercakeblue, "blockcreepercakeblue");
			GameRegistry.registerBlock(blockcreepercakegreen, "blockcreepercakegreen");
			GameRegistry.registerBlock(blockredvelvetcake, "blockredvelvetcake");
			GameRegistry.registerBlock(blockdeepdishpizza, "blockdeepdishpizza");
			GameRegistry.registerBlock(blockstove, "blockstove");
			GameRegistry.registerBlock(blockmicrowave, "blockmicrowave");
			GameRegistry.registerBlock(blocksugarore, "blocksugarore");
			GameRegistry.registerBlock(blocksugarbricks, "blocksugarbricks");
			GameRegistry.registerBlock(blocksugar, "blocksugar");
			GameRegistry.registerBlock(blockfoodtnt, "blockfoodtnt");
			GameRegistry.registerBlock(blocklight, "blocklight");
			GameRegistry.registerBlock(blocktestportal, "blocktestportal");
			GameRegistry.registerBlock(blockpeppermintlog, "blockpeppermintlog");
			GameRegistry.registerBlock(Cherryleaves, "Cherryleaves");
			GameRegistry.registerBlock(jtrent238skull, "jtrent238skull");
			GameRegistry.registerBlock(BlockOven, "BlockOven");
			GameRegistry.registerBlock(blockcherryworkbench, "blockcherryworkbench");
			GameRegistry.registerBlock(blockcherryplanks, "blockcherryplanks");
			GameRegistry.registerBlock(blockcandystone, "blockcandystone");
			GameRegistry.registerBlock(blockcandydirt, "blockcandydirt");
			GameRegistry.registerBlock(blockcandygrass, "blockcandygrass");
			GameRegistry.registerBlock(blockcandyportal, "blockcandyportal");
			GameRegistry.registerBlock(blockcandyrail, "blockcandyrail");
			GameRegistry.registerBlock(blockfrozenpumpkin, "blockfrozenpumpkin");
			GameRegistry.registerBlock(liquidMilkStill, "liquidMilkStill");
            GameRegistry.registerBlock(liquidMilkFlowing, "liquidMilkFlowing");
			
		}
	}


