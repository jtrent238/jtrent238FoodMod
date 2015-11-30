package com.jtrent238.weaponmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.world.World;

@Mod(modid = "weaponmod", name = "jtrent238's Weapon Mod", version = "1.0")
public class WeaponMod {
	
	//Items
	  public static Item itemdiamondFragment;
	  public static Item itemgoldFragment;
	  public static Item itememerldFragment;
	  public static Item itemironFragment;
	  public static Item itemcoalFragment;
	  public static Item itemlapizFragment;
	  public static Item itemredstoneFragment;
	  public static Item itemlightingwand;
	  public static Item itemLightingShard;
	  public static Item itemruby;
	  public static Item itemrubyfragment;
	  public static Item itemrubysword;
	  public static Item itemrubyaxe;
	  public static Item itemrubypickaxe;
	  public static Item itemrubyhoe;
	  public static Item itemrubyshovel;
	  public static Item itemrubyknife;
	  public static Item itemdiamondknife;
	  public static Item itemgoldknife;
	  public static Item itemwoodknife;
	  public static Item itemstoneknife;
	  public static Item itemironknife;
	  public static Item itemcheeseknife;
	  public static Item itembigdiamondsword;
	  public static Item itembiggoldsword;
	  public static Item itembigstonesword;
	  public static Item itembigwoodsword;
	  public static Item itembigironsword;
	  public static Item itembigcheesesword;
	  public static Item itembigrubysword;
	  public static Item itemgodsword;
	  public static Item itembonesword;
	  public static Item itemrocksword;
	  public static Item itemcheese;
	  public static Item itemcheesesword;
	  public static Item itemcheeseaxe;
	  public static Item itemchessepickaxe;
	  public static Item itemcheesehoe;
	  public static Item itemcheeseshovel;
	  public static Item itemgrilledcheese;
	  public static Item itemgrilledcheesesandwhich;
	  public static Item itemdiamondapple;
	  public static Item itemcoalapple;
	  public static Item itemredstoneapple;
	  public static Item itemgoldapple;
	  public static Item itememeraldapple;
	  public static Item itemlapizapple;
	  public static Item itemironapple;
	  public static Item itemnetherstarapple;
	  public static Item itemdragoneggapple;

	  
	
	  
	  //Blocks
	  public static Block blockLightingShard;
	  public static Block blockruby;
	  public static Block blockrubyore;
	  public static Block blockdragonegg;
	  public static Block blocknetherstar;
	  public static Block blockarmorcrafter;
	  
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Item/Block init
		//Config handling
		
		//** Achievement Registering *//
		weaponmodAchievements.loadAchievements();
		weaponmodAchievements.registerPage();
	
		
			//Diamond Fragment
		itemdiamondFragment = new ItemdiamondFragment().setUnlocalizedName("itemdiamondFragment").setTextureName("weaponmod:itemdiamondFragment").setCreativeTab(tabWeaponMod);; //item.itemdiamondFragment
			GameRegistry.registerItem(itemdiamondFragment, itemdiamondFragment.getUnlocalizedName().substring(5));
			GameRegistry.addRecipe(new ItemStack(itemdiamondFragment, 4), new Object[]{
					"6XX", "XXX", "XXX", Character.valueOf('6'), new ItemStack(Items.diamond, 4), 
				});
			
			//Gold Fragment
		itemgoldFragment = new itemgoldFragment().setUnlocalizedName("itemgoldFragment").setTextureName("weaponmod:itemgoldFragment").setCreativeTab(tabWeaponMod);; //item.itemgoldFragment
			GameRegistry.registerItem(itemgoldFragment, itemgoldFragment.getUnlocalizedName().substring(5));
			GameRegistry.addRecipe(new ItemStack(itemgoldFragment, 4), new Object[]{
					"6XX", "XXX", "XXX", Character.valueOf('6'), new ItemStack(Items.gold_ingot, 4), 
				});
			
			//Emerald Fragment
		itememerldFragment = new ItememerldFragment().setUnlocalizedName("itememerldFragment").setTextureName("weaponmod:itememerldFragment").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itememerldFragment, itememerldFragment.getUnlocalizedName().substring(5));
			GameRegistry.addRecipe(new ItemStack(itememerldFragment, 4), new Object[]{
					"6XX", "XXX", "XXX", Character.valueOf('6'), new ItemStack(Items.emerald, 4), 
				});
			
			//Iron Fragment
		itemironFragment = new ItemironFragment().setUnlocalizedName("itemironFragment").setTextureName("weaponmod:itemironFragment").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemironFragment, itemironFragment.getUnlocalizedName().substring(5));
			GameRegistry.addRecipe(new ItemStack(itemironFragment, 4), new Object[]{
					"6XX", "XXX", "XXX", Character.valueOf('6'), new ItemStack(Items.iron_ingot, 4), 
				});
			
			//Coal Fragment
		itemcoalFragment = new ItemcoalFragment().setUnlocalizedName("itemcoalFragment").setTextureName("weaponmod:itemcoalFragment").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemcoalFragment, itemcoalFragment.getUnlocalizedName().substring(5));
			GameRegistry.addRecipe(new ItemStack(itemcoalFragment, 4), new Object[]{
					"6XX", "XXX", "XXX", Character.valueOf('6'), new ItemStack(Items.coal, 4), 
				});
			
			//Lapiz Fragment
		itemlapizFragment = new ItemlapizFragment().setUnlocalizedName("itemlapizFragment").setTextureName("weaponmod:itemlapizFragment").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemlapizFragment, itemlapizFragment.getUnlocalizedName().substring(5));
			GameRegistry.addRecipe(new ItemStack(itemlapizFragment, 4), new Object[]{
					"6XX", "XXX", "XXX", Character.valueOf('6'), new ItemStack(Items.dye, 4, 4), 
				});
			
			//Redstone Fragment
		itemredstoneFragment = new ItemredstoneFragment().setUnlocalizedName("itemredstoneFragment").setTextureName("weaponmod:itemredstoneFragment").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemredstoneFragment, itemredstoneFragment.getUnlocalizedName().substring(5));
			GameRegistry.addRecipe(new ItemStack(itemredstoneFragment, 4), new Object[]{
					"6XX", "XXX", "XXX", Character.valueOf('6'), new ItemStack(Items.glowstone_dust, 4), 
				});
			
			//Rainbow Fragment
		 Item itemrainbowFragment = new ItemrainbowFragment().setUnlocalizedName("itemrainbowFragment").setTextureName("weaponmod:itemrainbowFragment").setCreativeTab(tabWeaponMod);
		 	GameRegistry.registerItem(itemrainbowFragment, itemrainbowFragment.getUnlocalizedName().substring(5));
		
		 	//Ruby
			itemruby = new Itemruby().setUnlocalizedName("itemruby").setTextureName("weaponmod:itemruby").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemruby, itemruby.getUnlocalizedName().substring(5));
			
			//Ruby Sword
			itemrubysword = new Itemrubysword().setUnlocalizedName("itemrubysword").setFull3D().setTextureName("weaponmod:itemrubysword").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemrubysword, itemrubysword.getUnlocalizedName().substring(5));
			
			//Ruby Axe
			itemrubyaxe = new Itemrubyaxe().setUnlocalizedName("itemrubyaxe").setFull3D().setTextureName("weaponmod:itemrubyaxe").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemrubyaxe, itemrubyaxe.getUnlocalizedName().substring(5));
			
			//Ruby Pickaxe
			itemrubypickaxe = new Itemrubypickaxe().setUnlocalizedName("itemrubypickaxe").setFull3D().setTextureName("weaponmod:itemrubypickaxe").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemrubypickaxe, itemrubypickaxe.getUnlocalizedName().substring(5));
			
			//Ruby Hoe
			itemrubyhoe = new Itemrubyhoe().setUnlocalizedName("itemrubyhoe").setFull3D().setTextureName("weaponmod:itemrubyhoe").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemrubyhoe, itemrubyhoe.getUnlocalizedName().substring(5));
			
			//Ruby Shovel
			itemrubyshovel = new Itemrubyshovel().setUnlocalizedName("itemrubyshovel").setFull3D().setTextureName("weaponmod:itemrubyshovel").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemrubyshovel, itemrubyshovel.getUnlocalizedName().substring(5));
			
			
			//Ruby Fragment
			itemrubyfragment = new Itemrubyfragment().setUnlocalizedName("itemrubyfragment").setTextureName("weaponmod:itemrubyfragment").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemrubyfragment, itemrubyfragment.getUnlocalizedName().substring(5));
			
		 	//Lighting Wand
		 itemlightingwand = new Itemlightingwand().setUnlocalizedName("itemlightingwand").setTextureName("weaponmod:itemlightingwand").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemlightingwand, itemlightingwand.getUnlocalizedName().substring(5));
			 
			//Lighting Shard
			itemLightingShard = new ItemLightingShard().setUnlocalizedName("itemLightingShard").setTextureName("weaponmod:itemLightingShard").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemLightingShard, itemLightingShard.getUnlocalizedName().substring(5));
			
			//Lighting Shard Block
			blockLightingShard = new BlockLightingShard(Material.rock).setBlockName("blockLightingShard").setBlockTextureName("weaponmod:blockLightingShard").setCreativeTab(tabWeaponMod);
			GameRegistry.registerBlock(blockLightingShard, blockLightingShard.getUnlocalizedName().substring(5));
			System.out.println(blockLightingShard.getUnlocalizedName().substring(5));
	
			//Ruby Block
			blockruby = new Blockruby(Material.iron).setBlockName("blockruby").setBlockTextureName("weaponmod:blockruby").setCreativeTab(tabWeaponMod);
			GameRegistry.registerBlock(blockruby, blockruby.getUnlocalizedName().substring(5));
			System.out.println(blockruby.getUnlocalizedName().substring(5));
			
			//Ruby Ore
			blockrubyore = new Blockrubyore(Material.iron).setBlockName("blockrubyore").setBlockTextureName("weaponmod:blockrubyore").setCreativeTab(tabWeaponMod);
			GameRegistry.registerBlock(blockrubyore, blockrubyore.getUnlocalizedName().substring(5));
			System.out.println(blockrubyore.getUnlocalizedName().substring(5));
			
			//Ruby Knife
			itemrubyknife = new Itemrubyknife().setUnlocalizedName("itemrubyknife").setFull3D().setTextureName("weaponmod:itemrubyknife").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemrubyknife, itemrubyknife.getUnlocalizedName().substring(5));
			
			
			//Diamond Knife
			itemdiamondknife = new Itemdiamondknife().setUnlocalizedName("itemdiamondknife").setFull3D().setTextureName("weaponmod:itemdiamondknife").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemdiamondknife, itemdiamondknife.getUnlocalizedName().substring(5));
			
			//Gold Knife
			itemgoldknife = new Itemgoldknife().setUnlocalizedName("itemgoldknife").setFull3D().setTextureName("weaponmod:itemgoldknife").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemgoldknife, itemgoldknife.getUnlocalizedName().substring(5));
			
			//Wood Knife
			itemwoodknife = new Itemwoodknife().setUnlocalizedName("itemwoodknife").setFull3D().setTextureName("weaponmod:itemwoodknife").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemwoodknife, itemwoodknife.getUnlocalizedName().substring(5));
			
			//Stone Knife
			itemstoneknife = new Itemstoneknife().setUnlocalizedName("itemstoneknife").setFull3D().setTextureName("weaponmod:itemstoneknife").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemstoneknife, itemstoneknife.getUnlocalizedName().substring(5));
			
			//Iron Knife
			itemironknife = new Itemironknife().setUnlocalizedName("itemironknife").setFull3D().setTextureName("weaponmod:itemironknife").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemironknife, itemironknife.getUnlocalizedName().substring(5));
			
			//Cheese Knife
			itemcheeseknife = new Itemcheeseknife().setUnlocalizedName("itemcheeseknife").setFull3D().setTextureName("weaponmod:itemcheeseknife").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemcheeseknife, itemcheeseknife.getUnlocalizedName().substring(5));
			
			//Big Diamond Sword
			itembigdiamondsword = new Itembigdiamondsword().setUnlocalizedName("itembigdiamondsword").setFull3D().setTextureName("weaponmod:itembigdiamondsword").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itembigdiamondsword, itembigdiamondsword.getUnlocalizedName().substring(5));
			
			//Big Gold Sword
			itembiggoldsword = new Itembiggoldsword().setUnlocalizedName("itembiggoldsword").setFull3D().setTextureName("weaponmod:itembiggoldsword").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itembiggoldsword, itembiggoldsword.getUnlocalizedName().substring(5));
			
			//Big Stone Sword
			itembigstonesword = new Itembigstonesword().setUnlocalizedName("itembigstonesword").setFull3D().setTextureName("weaponmod:itembigstonesword").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itembigstonesword, itembigstonesword.getUnlocalizedName().substring(5));
			
			//Big Wood Sword
			itembigwoodsword = new Itembigwoodsword().setUnlocalizedName("itembigwoodsword").setFull3D().setTextureName("weaponmod:itembigwoodsword").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itembigwoodsword, itembigwoodsword.getUnlocalizedName().substring(5));
			
			//Big Iron Sword
			itembigironsword = new Itembigironsword().setUnlocalizedName("itembigironsword").setFull3D().setTextureName("weaponmod:itembigironsword").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itembigironsword, itembigironsword.getUnlocalizedName().substring(5));
			
			//Big Cheese Sword
			itembigcheesesword = new Itembigcheesesword().setUnlocalizedName("itembigcheesesword").setFull3D().setTextureName("weaponmod:itembigcheesesword").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itembigcheesesword, itembigcheesesword.getUnlocalizedName().substring(5));
			
			//Big Ruby Sword
			itembigrubysword = new Itembigrubysword().setUnlocalizedName("itembigrubysword").setFull3D().setTextureName("weaponmod:itembigrubysword").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itembigrubysword, itembigrubysword.getUnlocalizedName().substring(5));
			
			//God Sword
			itemgodsword = new Itemgodsword().setUnlocalizedName("itemgodsword").setFull3D().setTextureName("weaponmod:itemgodsword").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemgodsword, itemgodsword.getUnlocalizedName().substring(5));
			
			
			//Dragon Egg Block
			blockdragonegg = new Blockdragonegg(Material.dragonEgg).setBlockName("blockdragonegg").setBlockTextureName("weaponmod:blockdragonegg").setCreativeTab(tabWeaponMod);
			GameRegistry.registerBlock(blockdragonegg, blockdragonegg.getUnlocalizedName().substring(5));
			System.out.println(blockdragonegg.getUnlocalizedName().substring(5));
			GameRegistry.addRecipe(new ItemStack(blockdragonegg, 1), new Object[]{
					"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(Blocks.dragon_egg, 1), 
				});
			
			//Nether Star Block
			blocknetherstar = new Blocknetherstar(Material.iron).setBlockName("blocknetherstar").setBlockTextureName("weaponmod:blocknetherstar").setCreativeTab(tabWeaponMod);
			GameRegistry.registerBlock(blocknetherstar, blocknetherstar.getUnlocalizedName().substring(5));
			System.out.println(blocknetherstar.getUnlocalizedName().substring(5));	
			GameRegistry.addRecipe(new ItemStack(blocknetherstar, 1), new Object[]{
					"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(Items.nether_star, 1), 
				});
			
			//Diamond Apple
			itemdiamondapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemdiamondapple").setTextureName("weaponmod:itemdiamondapple").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemdiamondapple, itemdiamondapple.getUnlocalizedName().substring(5));
			
			//Coal Apple
			itemcoalapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemcoalapple").setTextureName("weaponmod:itemcoalapple").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemcoalapple, itemcoalapple.getUnlocalizedName().substring(5));
			
			//Gold Apple
			itemgoldapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemgoldapple").setTextureName("weaponmod:itemgoldapple").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemgoldapple, itemgoldapple.getUnlocalizedName().substring(5));
			
			//Redstone Apple
			itemredstoneapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemredstoneapple").setTextureName("weaponmod:itemredstoneapple").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemredstoneapple, itemredstoneapple.getUnlocalizedName().substring(5));
			
			//Emerald Apple
			itememeraldapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itememeraldapple").setTextureName("weaponmod:itememeraldapple").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itememeraldapple, itememeraldapple.getUnlocalizedName().substring(5));
			
			//Lapiz Apple
			itemlapizapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemlapizapple").setTextureName("weaponmod:itemlapizapple").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemlapizapple, itemlapizapple.getUnlocalizedName().substring(5));
		
			//Iron Apple
			itemironapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemironapple").setTextureName("weaponmod:itemironapple").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemironapple, itemironapple.getUnlocalizedName().substring(5));
		
			//Nether Star Apple
			itemnetherstarapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemnetherstarapple").setTextureName("weaponmod:itemnetherstarapple").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemnetherstarapple, itemnetherstarapple.getUnlocalizedName().substring(5));
			
			//Dragon Egg Apple
			itemdragoneggapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemdragoneggapple").setTextureName("weaponmod:itemdragoneggapple").setCreativeTab(tabWeaponMod);
			GameRegistry.registerItem(itemdragoneggapple, itemdragoneggapple.getUnlocalizedName().substring(5));
			
			//Cheese
			itemcheese = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcheese").setTextureName("weaponmod:itemgrilledcheese").setCreativeTab(tabWeaponMod);;
			GameRegistry.registerItem(itemcheese, itemcheese.getUnlocalizedName().substring(5));
			
			//Grilled Cheese
			itemgrilledcheese = new ItemFood(6, 0.2F, false).setUnlocalizedName("itemgrilledcheese").setTextureName("weaponmod:itemgrilledcheese").setCreativeTab(tabWeaponMod);;
			GameRegistry.registerItem(itemgrilledcheese, itemgrilledcheese.getUnlocalizedName().substring(5));
			

	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Proxy. TileEntity, entity, GUI and Packet Registering
		
		/** GUI Handler Registering */
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs tabWeaponMod = new CreativeTabs("tabWeaponMod"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(Items.diamond_sword).getItem();
		}
	};
}
