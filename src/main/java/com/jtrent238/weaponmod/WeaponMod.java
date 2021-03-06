package com.jtrent238.weaponmod;


import com.jtrent238.coremod.ForgeSubscribe;
import com.jtrent238.foodmod.test_plant;
import com.jtrent238.weaponmod.ItemToolEmerald.EnumToolEmerald;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid="weaponmod", name="jtrent238's Weapon Mod", version="1.0.0.1")
public class WeaponMod
{
	private static final String weaponmod = null;
	private static final String MODID = weaponmod;
	
	 @ForgeSubscribe(priority = EventPriority.NORMAL)
	    public void eventHandler(RenderGameOverlayEvent event) {
	}
	    

	    
	    
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
  public static Item EmeraldAxe;
  public static Item EmeraldPickaxe;
  public static Item EmeraldSword;
  public static Item EmeraldShovel;
  public static Item EmeraldHoe;
  public static Item EmeraldArmorHelmet;
  public static Item EmeraldArmorChestplate;
  public static Item EmeraldArmorLegs;
  public static Item EmeraldArmorBoots;
  public static Item iteminfinous;
  public static Item itempolishedprismiumFragment;
  public static Item itempolishedprismium;
  public static Item eliteSword;
  public static Item eliteAxe;
  public static Item elitePickaxe;
  public static Item eliteHoe;
  public static Item eliteShovel;
  public static Item redStoneSword;
  public static Item redStoneAxe;
  public static Item redStoneHoe;
  public static Item redStoneShovel;
  public static Item redStonePickaxe;
  public static Item redstoneHelmet;
  public static Item redstoneChestplate;
  public static Item redstoneLeggings;
  public static Item redstoneBoots;

  
  //Blocks
  public static Block blockLightingShard;
  public static Block blockruby;
  public static Block blockrubyore;
  public static Block blockdragonegg;
  public static Block blocknetherstar;
  public static Block blockarmorcrafter;
  public static Block blockcreeperinajar;
  public static Block redstoneGrass;
  public static Block redstoneDirt;
  
  

  
  public static final ArmorMaterial EMERALDARMOR = EnumHelper.addArmorMaterial("EMERALDARMOR", 2000, new int[] {2,7,5,3}, 54844);
  
public static void init() {    
    
      
	

	
      //Emerald Toolset
      EmeraldAxe =	new ItemAxeEmerald(EnumToolEmerald.EMERALD);
      EmeraldPickaxe =	new ItemPickaxeEmerald(EnumToolEmerald.EMERALD);
      EmeraldSword =	new ItemSwordEmerald(EnumToolEmerald.EMERALD);
      EmeraldShovel =	new ItemShovelEmerald(EnumToolEmerald.EMERALD);
      EmeraldHoe =	new ItemHoeEmerald(EnumToolEmerald.EMERALD);
    
    //EmeraldArmor Armor Set
      EmeraldArmorHelmet		=	new EmeraldArmorItemArmor(EMERALDARMOR, 6, 0).setUnlocalizedName("emeraldarmorHelmet").setTextureName("emeraldarmorHelmet");
      EmeraldArmorChestplate		=	new EmeraldArmorItemArmor(EMERALDARMOR, 6, 1).setUnlocalizedName("emeraldarmorChestplate").setTextureName("emeraldarmorChestplate");
      EmeraldArmorLegs		=	new EmeraldArmorItemArmor(EMERALDARMOR, 6, 2).setUnlocalizedName("emeraldarmorLegs").setTextureName("emeraldarmorLegs");
      EmeraldArmorBoots		=	new EmeraldArmorItemArmor(EMERALDARMOR, 6, 3).setUnlocalizedName("emeraldarmorBoots").setTextureName("emeraldarmorBoots");
    
    }
  
  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event)
  {
	 //Achievements
    weaponmodAchievements.loadAchievements();
    weaponmodAchievements.registerPage();
    

    
    //Diamond Fragment
    itemdiamondFragment = new ItemdiamondFragment().setUnlocalizedName("itemdiamondFragment").setTextureName("weaponmod:itemdiamondFragment").setCreativeTab(tabWeaponMod);
    GameRegistry.registerItem(itemdiamondFragment, itemdiamondFragment.getUnlocalizedName().substring(5));
    GameRegistry.addRecipe(new ItemStack(itemdiamondFragment, 4), new Object[] { "6XX", "XXX", "XXX", 
      Character.valueOf('6'), new ItemStack(Items.diamond, 4) });
    
    //Gold Fragment
    itemgoldFragment = new itemgoldFragment().setUnlocalizedName("itemgoldFragment").setTextureName("weaponmod:itemgoldFragment").setCreativeTab(tabWeaponMod);
    GameRegistry.registerItem(itemgoldFragment, itemgoldFragment.getUnlocalizedName().substring(5));
    GameRegistry.addRecipe(new ItemStack(itemgoldFragment, 4), new Object[] { "6XX", "XXX", "XXX", 
      Character.valueOf('6'), new ItemStack(Items.gold_ingot, 4) });
    
    //Emerald Fragment
    itememerldFragment = new ItememerldFragment().setUnlocalizedName("itememerldFragment").setTextureName("weaponmod:itememerldFragment").setCreativeTab(tabWeaponMod);
    GameRegistry.registerItem(itememerldFragment, itememerldFragment.getUnlocalizedName().substring(5));
    GameRegistry.addRecipe(new ItemStack(itememerldFragment, 4), new Object[] { "6XX", "XXX", "XXX", 
      Character.valueOf('6'), new ItemStack(Items.emerald, 4) });
    
    //Iron Fragment
    itemironFragment = new ItemironFragment().setUnlocalizedName("itemironFragment").setTextureName("weaponmod:itemironFragment").setCreativeTab(tabWeaponMod);
    GameRegistry.registerItem(itemironFragment, itemironFragment.getUnlocalizedName().substring(5));
    GameRegistry.addRecipe(new ItemStack(itemironFragment, 4), new Object[] { "6XX", "XXX", "XXX", 
      Character.valueOf('6'), new ItemStack(Items.iron_ingot, 4) });
    
    //Coal Fragment
    itemcoalFragment = new ItemcoalFragment().setUnlocalizedName("itemcoalFragment").setTextureName("weaponmod:itemcoalFragment").setCreativeTab(tabWeaponMod);
    GameRegistry.registerItem(itemcoalFragment, itemcoalFragment.getUnlocalizedName().substring(5));
    GameRegistry.addRecipe(new ItemStack(itemcoalFragment, 4), new Object[] { "6XX", "XXX", "XXX", 
      Character.valueOf('6'), new ItemStack(Items.coal, 4) });
    
    //Lapiz Fragment
    itemlapizFragment = new ItemlapizFragment().setUnlocalizedName("itemlapizFragment").setTextureName("weaponmod:itemlapizFragment").setCreativeTab(tabWeaponMod);
    GameRegistry.registerItem(itemlapizFragment, itemlapizFragment.getUnlocalizedName().substring(5));
    GameRegistry.addRecipe(new ItemStack(itemlapizFragment, 4), new Object[] { "6XX", "XXX", "XXX", 
      Character.valueOf('6'), new ItemStack(Items.dye, 4, 4) });
    
    //Redstone Fragment
    itemredstoneFragment = new ItemredstoneFragment().setUnlocalizedName("itemredstoneFragment").setTextureName("weaponmod:itemredstoneFragment").setCreativeTab(tabWeaponMod);
    GameRegistry.registerItem(itemredstoneFragment, itemredstoneFragment.getUnlocalizedName().substring(5));
    GameRegistry.addRecipe(new ItemStack(itemredstoneFragment, 4), new Object[] { "6XX", "XXX", "XXX", 
      Character.valueOf('6'), new ItemStack(Items.redstone, 4) });
    
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
    
    //Rube Hoe
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
    blockLightingShard = new BlockLightingShard(Material.ground).setBlockName("blockLightingShard").setBlockTextureName("weaponmod:blockLightingShard").setCreativeTab(tabWeaponMod);
    GameRegistry.registerBlock(blockLightingShard, blockLightingShard.getUnlocalizedName().substring(5));
    System.out.println(blockLightingShard.getUnlocalizedName().substring(5));
    
    //Ruby Block
    blockruby = new Blockruby(Material.iron).setBlockName("blockruby").setBlockTextureName("weaponmod:blockruby").setCreativeTab(tabWeaponMod);
    GameRegistry.registerBlock(blockruby, blockruby.getUnlocalizedName().substring(5));
    System.out.println(blockruby.getUnlocalizedName().substring(5));
    
    //Ruby Ore
    blockrubyore = new Blockrubyore(Material.ground).setBlockName("blockrubyore").setBlockTextureName("weaponmod:blockrubyore").setCreativeTab(tabWeaponMod);
    GameRegistry.registerBlock(blockrubyore, blockrubyore.getUnlocalizedName().substring(5));
    System.out.println(blockrubyore.getUnlocalizedName().substring(5));
    
    //Ruby Knife
    itemrubyknife = new Itemrubyknife().setUnlocalizedName("itemrubyknife").setFull3D().setTextureName("weaponmod:itemrubyknife").setCreativeTab(tabWeaponMod);
    GameRegistry.registerItem(itemrubyknife, itemrubyknife.getUnlocalizedName().substring(5));
    
    //DiamondKnife
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
    
    //Infinous Sword
    iteminfinous = new iteminfinous().setUnlocalizedName("iteminfinous").setFull3D().setTextureName("weaponmod:iteminfinous").setCreativeTab(tabWeaponMod);
    GameRegistry.registerItem(iteminfinous, iteminfinous.getUnlocalizedName().substring(5));
    
    
    //DragonEgg Block
    blockdragonegg = new Blockdragonegg(Material.dragonEgg).setBlockName("blockdragonegg").setBlockTextureName("weaponmod:blockdragonegg").setCreativeTab(tabWeaponMod);
    GameRegistry.registerBlock(blockdragonegg, blockdragonegg.getUnlocalizedName().substring(5));
    System.out.println(blockdragonegg.getUnlocalizedName().substring(5));
    GameRegistry.addRecipe(new ItemStack(blockdragonegg, 1), new Object[] { "XXX", "XXX", "XXX", 
      Character.valueOf('X'), new ItemStack(Blocks.dragon_egg, 1) });
    
    //NetherStar Block
    blocknetherstar = new Blocknetherstar(Material.ground).setBlockName("blocknetherstar").setBlockTextureName("weaponmod:blocknetherstar").setCreativeTab(tabWeaponMod);
    GameRegistry.registerBlock(blocknetherstar, blocknetherstar.getUnlocalizedName().substring(5));
    System.out.println(blocknetherstar.getUnlocalizedName().substring(5));
    GameRegistry.addRecipe(new ItemStack(blocknetherstar, 1), new Object[] { "XXX", "XXX", "XXX", 
      Character.valueOf('X'), new ItemStack(Items.nether_star, 1) });
    
 
    //�//Crafting Recipes//�//
  //Emerald Pickaxe Recipe    
    GameRegistry.addRecipe(new ItemStack(EmeraldPickaxe, 1), new Object []{ "yyy" , " z " , " z " ,
      Character.valueOf('y'), Items.emerald
      , Character.valueOf('z'), Items.stick });
    //Emerald Shovel Recipe    
    GameRegistry.addRecipe(new ItemStack(EmeraldShovel, 1), new Object []{ " y " , " z " , " z " ,
      Character.valueOf('y'), Items.emerald
      , Character.valueOf('z'), Items.stick });
    //Emerald Axe Recipe    
    GameRegistry.addRecipe(new ItemStack(EmeraldAxe, 1), new Object []{ "yy " , "yz " , " z " ,
      Character.valueOf('y'), Items.emerald
      , Character.valueOf('z'), Items.stick });
    //Emerald Hoe Recipe    
    GameRegistry.addRecipe(new ItemStack(EmeraldHoe, 1), new Object []{ "yy " , " z " , " z " ,
      Character.valueOf('y'), Items.emerald
      , Character.valueOf('z'), Items.stick });
    //Emerald Sword Recipe    
    GameRegistry.addRecipe(new ItemStack(EmeraldSword, 1), new Object []{ " y " , " y " , " z " ,
      Character.valueOf('y'), Items.emerald
      , Character.valueOf('z'), Items.stick });
    //" . $ar_name . " Helmet Recipe
    GameRegistry.addRecipe(new ItemStack(EmeraldArmorHelmet, 1), new Object[] {"XXX", "X X","   ", 'X', Items.emerald });
    //" . $ar_name . " Chestplate Recipe
    GameRegistry.addRecipe(new ItemStack(EmeraldArmorChestplate, 1), new Object[] {"X X", "XXX","XXX", 'X', Items.emerald });
    //" . $ar_name . " Legs Recipe
    GameRegistry.addRecipe(new ItemStack(EmeraldArmorLegs, 1), new Object[] {"XXX", "X X","X X", 'X', Items.emerald });
    //" . $ar_name . " Boots Recipe
    GameRegistry.addRecipe(new ItemStack(EmeraldArmorBoots, 1), new Object[] {"   ", "X X","X X", 'X', Items.emerald });
    

    //END/�//Crafting Recipes//�/END//
    
    //�//Smelting Recipes//�//
    GameRegistry.addSmelting(Blocks.stone, new ItemStack(Blocks.stonebrick), 0.1f);
    //END/�//Smelting Recipes//�/END//
  }
  

  @Mod.EventHandler
  public void init(FMLInitializationEvent event)
  {
    NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
    MinecraftForge.EVENT_BUS.register(new ItemToolEmerald());

  }
  

  public static CreativeTabs tabWeaponMod = new CreativeTabs("tabWeaponMod")
  {


	public Item getTabIconItem() {

		return new ItemStack(Items.diamond_sword).getItem();
	}


	}
  
  ;
  
  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent event) {

  }
}
