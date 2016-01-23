package com.jtrent238.foodmod;


import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelIronGolem;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.model.ModelWitch;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.stats.Achievement;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenPlains;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid="foodmod", name="jtrent238's Food Mod", version="1.0.0.1")
public class FoodMod
{


	



	@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {

	}
	
	public static double rand;

	private static int p_i1986_1_;
	
	//Biomes
	BiomeGenBase[] allBiomes = Iterators.toArray(Iterators.filter(Iterators.forArray(BiomeGenBase.getBiomeGenArray()), Predicates.notNull()), BiomeGenBase.class);

	private int elec;
	
		//CandyLand Biome
	protected static final BiomeGenBase.Height height_candyland = new BiomeGenBase.Height(0.1F, 0.2F);
	public static final BiomeGenBase candyland = (new BiomeGenCandyLand(p_i1986_1_)).setColor(9286496).setBiomeName("CandyLand");
	
	//Items
		//Food
	public static Item itemcheese;
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
	public static Item itemflesh;
	public static Item itemcookedflesh;
	public static Item itembacon;
	public static Item itemcheesecake;
	public static Item itemcarrotcake;
	public static Item itemBakersyeast;
	public static Item itemBarkbread;
	public static Item itemKubdari;
	public static Item itemKisra;
	public static Item itemSimit;
	public static Item itemRicebread;
	public static Item itemtoast;
	public static Item itemČesnica;
	public static Item itemSlicedbread;
	public static Item itemchocolatebar;
	public static Item itemchocolatemilk;
	public static Item itempizza;
	public static Item itemicecream;
	public static Item itemcorndog;
	public static Item itemcorndog_mustard;
	public static Item itemcorndog_ketchup;
	public static Item itemhotdog;
	public static Item itemcottoncandy;
	public static Item itemcandyapple;
	public static Item itemsugarcookie;
	public static Item itemoreo;
	public static Item item_mms;
	public static Item itemlemonade;
	public static Item itemlemon;
	public static Item itemmeatball;
	public static Item itemmeatballraw;
	public static Item itempasta;
	public static Item itemchickenwings;
	public static Item itemchickenwingsraw;
	public static Item itemchicken_nuggets;
	public static Item itemchicken_nuggetsraw;
	public static Item itempeanut;
	public static Item itempeanutseeds;
	public static Item itempeanutPlant;
	public static Item itembean;
	public static Item itemgoatmilk;
	public static Item itemfishsticks;
	public static Item itemfishsticksraw;
	public static Item itempie;
	public static Item itemmutton;
	public static Item itemmuttonraw;
	public static Item itemlamb;
	public static Item itemlambraw;
	public static Item itemCheesecakeStuffedStrawberries;
	public static Item itemstrawberry;
	public static Item itemblueberry;
	public static Item itemblackberry;
	public static Item itemcherry;
	public static Item itemsoup;
	public static Item itemfrenchfry;
	public static Item itemlemonpie;
	public static Item itemapplepie;
	public static Item itemasparagus;
	public static Item itembasil;
	public static Item itemcilantro;
	public static Item itembroccoli;
	public static Item itemorange;
	public static Item itemkiwi;
	public static Item itemredpepper;
	public static Item itemtomato;
	public static Item itemavocado;
	public static Item itemgreenpepper;
	public static Item itemraspberries;
	public static Item itempear;
	public static Item itempeach;
	public static Item itemonions;
	public static Item itemgarlic;
	public static Item itemginger;
	public static Item itemadzukibeans;
	public static Item itemblackbeans;
	public static Item itemblackeyepeas;
	public static Item itemgarbanzobeans;
	public static Item itemkidneybeans;
	public static Item itemlentils;
	public static Item itempintobeans;
	public static Item itemwhitebeans;
	public static Item itembeetroot;
	public static Item itemcreamcheese;
	public static Item itemchedderchesse;
	public static Item itemchocolateicecream;
	public static Item itemcream;
	public static Item itemwhipcream;
	public static Item itemcoolwhip;
	public static Item itembanana;
	public static Item itemgrits;
	public static Item itempopcorn;
	public static Item itemcorn;
	public static Item itemlettuce;
	public static Item itemgreen_tomato;
	public static Item itemlime;
	public static Item itemgrape;
	public static Item itembutter;
	public static Item itemice;
	public static Item itempufferfish_cooked;
	public static Item itemclownfish_cooked;
	public static Item itemmilkbottle;
	public static Item itemchocolatecake;
	public static Item itemapplecake;
	public static Item itemmagiccake;
	public static Item itemcaramelcake;
	public static Item itemchickensoup;
	public static Item itemchickenlegraw;
	public static Item itemchickenleg;
	public static Item itemcabbage;
	public static Item itembun;
	public static Item itempickle;
	public static Item itemcucumber;
	public static Item itemsquash;
	public static Item itemsugarcube;
	public static Item itemflour;
	public static Item itemlemonjuice;
	public static Item itemmashedbananas;
	public static Item itemchoppednuts;
	public static Item itemchoppedgrass;
	public static Item itembakingpowder;
	public static Item itemcinnamon;
	public static Item itemgroundginger;
	public static Item itemalmonds;
	public static Item itemgroundalmonds;
	public static Item itemhoney;
	public static Item itemsesameseeds;
	public static Item itemshortening;
	public static Item itembrownsugar;
	public static Item itemmeltedbutter;
	public static Item itembayleaf;
	public static Item itemhamburger;
	public static Item itembeefbroth;
	public static Item itemjalapenopeppers;
	public static Item itemmintleaves;
	public static Item itemcocacolabottle_empty;
	public static Item itembuttercandy;
	public static Item itemhorsemeat;
	public static Item itemhorsemeat_raw;
	public static Item itemluckycandy;
	
		//Drinks
	public static Item itemtea;
	
		//Sauces
	public static Item itemsteaksause;
	public static Item itemmustard;
	public static Item itemketchup;
	public static Item itemmayo;
	public static Item itemhoneymustard;
	public static Item itemranch;
	public static Item itemA1;
	
	
	public static Item itemsalt;
	public static Item itempepper;

	
	
		//Kitchen Utensils
	public static Item itemknife;
	public static Item itemfork;
	public static Item itemspoon;
	public static Item itemplate;
	public static Item itembowl;
	public static Item itemtowel;
	public static Item itemnapkin;

	
	
	
		//Seeds
	public static Item itemappleseed;
	
		//saplings
	public static Block itemapplesapling;
	public static Block itemlemonsapling;

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
	
	public static Fluid fluidoil;
	public static Fluid fluidcookingoil;
	
	public static Entity TestEntity;
	public static Entity candy_cake_creeper;
	public static Entity entitycandypig;

	public static Teleporter teleportercandyland;
	
	public static Blockcandyportal portal;
  //public static ModTrigger block;

@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	
	FoodModBlocks.init();
    FoodModItems.init();
	
    
  //Achievements
    foodmodAchievements.loadAchievements();
    foodmodAchievements.registerPage();
    
    //CandyPig
    entitycandypig = new EntityCandyPig(null);
    
	//Diamond Apple
    itemdiamondapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemdiamondapple").setTextureName("foodmod:itemdiamondapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemdiamondapple, itemdiamondapple.getUnlocalizedName().substring(5));
    
    //Coal Apple
    itemcoalapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemcoalapple").setTextureName("foodmod:itemcoalapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcoalapple, itemcoalapple.getUnlocalizedName().substring(5));
    
    //Gold Apple
    itemgoldapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemgoldapple").setTextureName("foodmod:itemgoldapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemgoldapple, itemgoldapple.getUnlocalizedName().substring(5));
    
    //Redstone Apple
    itemredstoneapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemredstoneapple").setTextureName("foodmod:itemredstoneapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemredstoneapple, itemredstoneapple.getUnlocalizedName().substring(5));
    
    //Emerald Apple
    itememeraldapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itememeraldapple").setTextureName("foodmod:itememeraldapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itememeraldapple, itememeraldapple.getUnlocalizedName().substring(5));
    
    //Lapiz Apple
    itemlapizapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemlapizapple").setTextureName("foodmod:itemlapizapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemlapizapple, itemlapizapple.getUnlocalizedName().substring(5));
    
    //Iron Apple
    itemironapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemironapple").setTextureName("foodmod:itemironapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemironapple, itemironapple.getUnlocalizedName().substring(5));
    
    //NetherStar Apple
    itemnetherstarapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemnetherstarapple").setTextureName("foodmod:itemnetherstarapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemnetherstarapple, itemnetherstarapple.getUnlocalizedName().substring(5));
   
    //DragonEgg Apple
    itemdragoneggapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemdragoneggapple").setTextureName("foodmod:itemdragoneggapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemdragoneggapple, itemdragoneggapple.getUnlocalizedName().substring(5));
    
    //Cheese
    itemcheese = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcheese").setTextureName("foodmod:itemgrilledcheese").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcheese, itemcheese.getUnlocalizedName().substring(5));
    
    //Grilled Cheese
    itemgrilledcheese = new ItemFood(6, 0.2F, false).setUnlocalizedName("itemgrilledcheese").setTextureName("foodmod:itemgrilledcheese").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemgrilledcheese, itemgrilledcheese.getUnlocalizedName().substring(5));
 
    //Flesh
    itemflesh = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemflesh").setTextureName("foodmod:itemflesh").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemflesh, itemflesh.getUnlocalizedName().substring(5));
    
    //Cooked Flesh
    itemcookedflesh = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemcookedflesh").setTextureName("foodmod:itemcookedflesh").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcookedflesh, itemcookedflesh.getUnlocalizedName().substring(5));
    
    //Bacon
    itembacon = new ItemFood(3, 0.2F, false).setUnlocalizedName("itembacon").setTextureName("foodmod:itembacon").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itembacon, itembacon.getUnlocalizedName().substring(5));
  
    //Cheese Cake
    itemcheesecake = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcheesecake").setTextureName("foodmod:itemcheesecake").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcheesecake, itemcheesecake.getUnlocalizedName().substring(5));
 
    //Carrot Cake
    itemcarrotcake = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcarrotcake").setTextureName("foodmod:itemcarrotcake").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcarrotcake, itemcarrotcake.getUnlocalizedName().substring(5));
 
    //Bark Bread
    itemBarkbread = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemBarkbread").setTextureName("foodmod:itemBarkbread").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemBarkbread, itemBarkbread.getUnlocalizedName().substring(5));

    //Kubdari
    itemKubdari = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemKubdari").setTextureName("foodmod:itemKubdari").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemKubdari, itemKubdari.getUnlocalizedName().substring(5));

    //Rice Bread
    itemRicebread = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemRicebread").setTextureName("foodmod:itemRicebread").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemRicebread, itemRicebread.getUnlocalizedName().substring(5));
    
    //Toast
    itemtoast = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemtoast").setTextureName("foodmod:itemtoast").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemtoast, itemtoast.getUnlocalizedName().substring(5));
    
    //Česnica
    itemČesnica = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemČesnica").setTextureName("foodmod:itemČesnica").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemČesnica, itemČesnica.getUnlocalizedName().substring(5));
    
    //Slicedbread
    itemSlicedbread = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemSlicedbread").setTextureName("foodmod:itemSlicedbread").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemSlicedbread, itemSlicedbread.getUnlocalizedName().substring(5));
    
    //Chocolate Bar
    itemchocolatebar = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemchocolatebar").setTextureName("foodmod:itemchocolatebar").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemchocolatebar, itemchocolatebar.getUnlocalizedName().substring(5));
    
    //Chocolate Milk
    itemchocolatemilk = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemchocolatemilk").setTextureName("foodmod:itemchocolatemilk").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemchocolatemilk, itemchocolatemilk.getUnlocalizedName().substring(5));
    
    //Pizza
    itempizza = new ItemFood(3, 0.2F, false).setUnlocalizedName("itempizza").setTextureName("foodmod:itempizza").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itempizza, itempizza.getUnlocalizedName().substring(5));
    
    //Ice Cream
    itemicecream = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemicecream").setTextureName("foodmod:itemicecream").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemicecream, itemicecream.getUnlocalizedName().substring(5));
    
    //Corn Dog
    itemcorndog = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcorndog").setTextureName("foodmod:itemcorndog").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcorndog, itemcorndog.getUnlocalizedName().substring(5));
    
    //Corn Dog With Ketchup
    itemcorndog_ketchup = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcorndog_ketchup").setTextureName("foodmod:itemcorndog_ketchup").setCreativeTab(FoodMod);
    GameRegistry.registerItem( itemcorndog_ketchup,  itemcorndog_ketchup.getUnlocalizedName().substring(5));
    
    //Corn Dog With Ketchup
    itemcorndog_mustard = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcorndog_mustard").setTextureName("foodmod:itemcorndog_mustard").setCreativeTab(FoodMod);
    GameRegistry.registerItem( itemcorndog_mustard,  itemcorndog_mustard.getUnlocalizedName().substring(5));
    
    //Hot Dog
    itemhotdog = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemhotdog").setTextureName("foodmod:itemhotdog").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemhotdog, itemhotdog.getUnlocalizedName().substring(5));
    
    //Cotton Candy
    itemcottoncandy = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcottoncandy").setTextureName("foodmod:itemcottoncandy").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcottoncandy, itemcottoncandy.getUnlocalizedName().substring(5));
    
    //Apple Pie
    itemapplepie = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemapplepie").setTextureName("foodmod:itemapplepie").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemapplepie, itemapplepie.getUnlocalizedName().substring(5));
    
    //Candy Apple
    itemcandyapple = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcandyapple").setTextureName("foodmod:itemcandyapple").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcandyapple, itemcandyapple.getUnlocalizedName().substring(5));
    
    //Sugar Cookie
    itemsugarcookie = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemsugarcookie").setTextureName("foodmod:itemsugarcookie").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemsugarcookie, itemsugarcookie.getUnlocalizedName().substring(5));
    
    //Oreo
    itemoreo = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemoreo").setTextureName("foodmod:itemoreo").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemoreo, itemoreo.getUnlocalizedName().substring(5));
    
    //M&M's
    item_mms = new ItemFood(3, 0.2F, false).setUnlocalizedName("item_mms").setTextureName("foodmod:item_mms").setCreativeTab(FoodMod);
    GameRegistry.registerItem(item_mms, item_mms.getUnlocalizedName().substring(5));
    
    //Lemonade
    itemlemonade = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemlemonade").setTextureName("foodmod:itemlemonade").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemlemonade, itemlemonade.getUnlocalizedName().substring(5));
    
    //Lemon
    itemlemon = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemlemon").setTextureName("foodmod:itemlemon").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemlemon, itemlemon.getUnlocalizedName().substring(5));
    
    //Meatball
    itemmeatball = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemmeatball").setTextureName("foodmod:itemmeatball").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemmeatball, itemmeatball.getUnlocalizedName().substring(5));
    
    //Raw Meatball
    itemmeatballraw = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemmeatballraw").setTextureName("foodmod:itemmeatballraw").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemmeatballraw, itemmeatballraw.getUnlocalizedName().substring(5));
    
    //Pasta
    itempasta = new ItemFood(3, 0.2F, false).setUnlocalizedName("itempasta").setTextureName("foodmod:itempasta").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itempasta, itempasta.getUnlocalizedName().substring(5));
    
    //Peanut
    itempeanut = new ItemFood(3, 0.2F, false).setUnlocalizedName("itempeanut").setTextureName("foodmod:itempeanut").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itempeanut, itempeanut.getUnlocalizedName().substring(5));
    
    //Bean
    itembean = new ItemFood(3, 0.2F, false).setUnlocalizedName("itembean").setTextureName("foodmod:itembean").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itembean, itembean.getUnlocalizedName().substring(5));
    
    //Goat Milk
    itemgoatmilk = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemgoatmilk").setTextureName("foodmod:itemgoatmilk").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemgoatmilk, itemgoatmilk.getUnlocalizedName().substring(5));
    
    //Fishsticks
    itemfishsticks = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemfishsticks").setTextureName("foodmod:itemfishsticks").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemfishsticks, itemfishsticks.getUnlocalizedName().substring(5));
    
    //Raw Fishsticks
    itemfishsticksraw = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemfishsticksraw").setTextureName("foodmod:itemfishsticksraw").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemfishsticksraw, itemfishsticksraw.getUnlocalizedName().substring(5));
    
    //Pie
    itempie = new ItemFood(3, 0.2F, false).setUnlocalizedName("itempie").setTextureName("foodmod:itempie").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itempie, itempie.getUnlocalizedName().substring(5));
    
    //Mutton
    itemmutton = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemmutton").setTextureName("foodmod:itemmutton").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemmutton, itemmutton.getUnlocalizedName().substring(5));
    
    //Raw Mutton
    itemmuttonraw = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemmuttonraw").setTextureName("foodmod:itemmuttonraw").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemmuttonraw, itemmuttonraw.getUnlocalizedName().substring(5));
    
    //Lamb
    itemlamb = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemlamb").setTextureName("foodmod:itemlamb").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemlamb, itemlamb.getUnlocalizedName().substring(5));
    
    //Cooked Lamb
    itemlambraw = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemlambraw").setTextureName("foodmod:itemlambraw").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemlambraw, itemlambraw.getUnlocalizedName().substring(5));
    
    //Cheesecake Stuffed Strawberries
    itemCheesecakeStuffedStrawberries = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemCheesecakeStuffedStrawberries").setTextureName("foodmod:itemCheesecakeStuffedStrawberries").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemCheesecakeStuffedStrawberries, itemCheesecakeStuffedStrawberries.getUnlocalizedName().substring(5));
    
    //Strawberry 
    itemstrawberry = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemstrawberry").setTextureName("foodmod:itemstrawberry").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemstrawberry, itemstrawberry.getUnlocalizedName().substring(5));
    
    //Blueberry
    itemblueberry = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemblueberry").setTextureName("foodmod:itemblueberry").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemblueberry, itemblueberry.getUnlocalizedName().substring(5));
    
    //Blackberry
    itemblackberry = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemblackberry").setTextureName("foodmod:itemblackberry").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemblackberry, itemblackberry.getUnlocalizedName().substring(5));
    
    //Cherry
   //GameRegistry.registerItem(itemcherry, "itemcherry");
   itemcherry = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcherry").setTextureName("foodmod:itemcherry").setCreativeTab(FoodMod);
   GameRegistry.registerItem(itemcherry, itemcherry.getUnlocalizedName().substring(5));
    
    //Soup
    itemsoup = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemsoup").setTextureName("foodmod:itemsoup").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemsoup, itemsoup.getUnlocalizedName().substring(5));
    
    //French Fry
    itemfrenchfry = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemfrenchfry").setTextureName("foodmod:itemfrenchfry").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemfrenchfry, itemfrenchfry.getUnlocalizedName().substring(5));
    
    //Lemon Pie
    itemlemonpie = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemlemonpie").setTextureName("foodmod:itemlemonpie").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemlemonpie, itemlemonpie.getUnlocalizedName().substring(5));
    
    //Asparagus
    itemasparagus = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemasparagus").setTextureName("foodmod:itemasparagus").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemasparagus, itemasparagus.getUnlocalizedName().substring(5));
    
    //Basil
    itembasil = new ItemFood(3, 0.2F, false).setUnlocalizedName("itembasil").setTextureName("foodmod:itembasil").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itembasil, itembasil.getUnlocalizedName().substring(5));
    
    //Cilantro
    itemcilantro = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcilantro").setTextureName("foodmod:itemcilantro").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcilantro, itemcilantro.getUnlocalizedName().substring(5));
    
    //Broccoli
    itembroccoli = new ItemFood(3, 0.2F, false).setUnlocalizedName("itembroccoli").setTextureName("foodmod:itembroccoli").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itembroccoli, itembroccoli.getUnlocalizedName().substring(5));
    
    //Orange
    itemorange = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemorange").setTextureName("foodmod:itemorange").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemorange, itemorange.getUnlocalizedName().substring(5));
    
    //Kiwi
    itemkiwi = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemkiwi").setTextureName("foodmod:itemkiwi").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemkiwi, itemkiwi.getUnlocalizedName().substring(5));
    
    //Red Pepper
    itemredpepper = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemredpepper").setTextureName("foodmod:itemredpepper").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemredpepper, itemredpepper.getUnlocalizedName().substring(5));
    
    //Tomato
    itemtomato = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemtomato").setTextureName("foodmod:itemtomato").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemtomato, itemtomato.getUnlocalizedName().substring(5));
    
    //Avocado
    itemavocado = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemavocado").setTextureName("foodmod:itemavocado").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemavocado, itemavocado.getUnlocalizedName().substring(5));
    
    //Green Pepper
    itemgreenpepper = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemgreenpepper").setTextureName("foodmod:itemgreenpepper").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemgreenpepper, itemgreenpepper.getUnlocalizedName().substring(5));
    
    //Raspberries
    itemraspberries = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemraspberries").setTextureName("foodmod:itemraspberries").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemraspberries, itemraspberries.getUnlocalizedName().substring(5));
    
    //Pear
    itempear = new ItemFood(3, 0.2F, false).setUnlocalizedName("itempear").setTextureName("foodmod:itempear").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itempear, itempear.getUnlocalizedName().substring(5));
    
    //Peach
    itempeach = new ItemFood(3, 0.2F, false).setUnlocalizedName("itempeach").setTextureName("foodmod:itempeach").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itempeach, itempeach.getUnlocalizedName().substring(5));
    
    //Onions
    itemonions = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemonions").setTextureName("foodmod:itemonions").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemonions, itemonions.getUnlocalizedName().substring(5));
    
    //Garlic
    itemgarlic = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemgarlic").setTextureName("foodmod:itemgarlic").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemgarlic, itemgarlic.getUnlocalizedName().substring(5));
    
    //Ginger
    itemginger = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemginger").setTextureName("foodmod:itemginger").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemginger, itemginger.getUnlocalizedName().substring(5));
    
    //Adzuki Beans
    itemadzukibeans = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemadzukibeans").setTextureName("foodmod:itemadzukibeans").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemadzukibeans, itemadzukibeans.getUnlocalizedName().substring(5));
    
    //Black Beans
    itemblackbeans = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemblackbeans").setTextureName("foodmod:itemblackbeans").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemblackbeans, itemblackbeans.getUnlocalizedName().substring(5));
    
    //Black Eye Peas
    itemblackeyepeas = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemblackeyepeas").setTextureName("foodmod:itemblackeyepeas").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemblackeyepeas, itemblackeyepeas.getUnlocalizedName().substring(5));
    
    //Garbanzo Beans
    itemgarbanzobeans = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemgarbanzobeans").setTextureName("foodmod:itemgarbanzobeans").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemgarbanzobeans, itemgarbanzobeans.getUnlocalizedName().substring(5));
    
    //Kidney Beans
    itemkidneybeans = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemkidneybeans").setTextureName("foodmod:itemkidneybeans").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemkidneybeans, itemkidneybeans.getUnlocalizedName().substring(5));
    
    //Lentils
    itemlentils = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemlentils").setTextureName("foodmod:itemlentils").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemlentils, itemlentils.getUnlocalizedName().substring(5));
    
    //Pinto Beans
    itempintobeans = new ItemFood(3, 0.2F, false).setUnlocalizedName("itempintobeans").setTextureName("foodmod:itempintobeans").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itempintobeans, itempintobeans.getUnlocalizedName().substring(5));
    
    //White Beans
    itemwhitebeans = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemwhitebeans").setTextureName("foodmod:itemwhitebeans").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemwhitebeans, itemwhitebeans.getUnlocalizedName().substring(5));
    
    //Beetroot
    itembeetroot = new ItemFood(3, 0.2F, false).setUnlocalizedName("itembeetroot").setTextureName("foodmod:itembeetroot").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itembeetroot, itembeetroot.getUnlocalizedName().substring(5));
    
    //Mustard
    itemmustard = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemmustard").setTextureName("foodmod:itemmustard").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemmustard, itemmustard.getUnlocalizedName().substring(5));
    
    //Ketchup
    itemketchup = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemketchup").setTextureName("foodmod:itemketchup").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemketchup, itemketchup.getUnlocalizedName().substring(5));
    
    //Mayo
    itemmayo = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemmayo").setTextureName("foodmod:itemmayo").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemmayo, itemmayo.getUnlocalizedName().substring(5));
    
    //Honey Mustard
    itemhoneymustard = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemhoneymustard").setTextureName("foodmod:itemhoneymustard").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemhoneymustard, itemhoneymustard.getUnlocalizedName().substring(5));
    
    //Ranch
    itemranch = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemranch").setTextureName("foodmod:itemranch").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemranch, itemranch.getUnlocalizedName().substring(5));

    //Banana
    itembanana = new ItemFood(3, 0.2F, false).setUnlocalizedName("itembanana").setTextureName("foodmod:itembanana").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itembanana, itembanana.getUnlocalizedName().substring(5));
    
    //Grits
    itemgrits = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemgrits").setTextureName("foodmod:itemgrits").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemgrits, itemgrits.getUnlocalizedName().substring(5));
    
    
    //PopCorn
    itempopcorn = new ItemFood(3, 0.2F, false).setUnlocalizedName("itempopcorn").setTextureName("foodmod:itempopcorn").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itempopcorn, itempopcorn.getUnlocalizedName().substring(5));
    
    //Corn
    itemcorn = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcorn").setTextureName("foodmod:itemcorn").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcorn, itemcorn.getUnlocalizedName().substring(5));
    
    //Lettuce
    itemlettuce = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemlettuce").setTextureName("foodmod:itemlettuce").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemlettuce, itemlettuce.getUnlocalizedName().substring(5));
    
    
     //Green Tomato
    itemgreen_tomato = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemgreen_tomato").setTextureName("foodmod:itemgreen_tomato").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemgreen_tomato, itemgreen_tomato.getUnlocalizedName().substring(5));
    
     //Lime
    itemlime = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemlime").setTextureName("foodmod:itemlime").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemlime, itemlime.getUnlocalizedName().substring(5));
    
     //Grape
    itemgrape = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemgrape").setTextureName("foodmod:itemgrape").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemgrape, itemgrape.getUnlocalizedName().substring(5));
    
    //Cream
    itemcream = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcream").setTextureName("foodmod:itemcream").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcream, itemcream.getUnlocalizedName().substring(5));
    
    //Butter
    itembutter = new ItemFood(3, 0.2F, false).setUnlocalizedName("itembutter").setTextureName("foodmod:itembutter").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itembutter, itembutter.getUnlocalizedName().substring(5));
    
    //Ice
    itemice = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemice").setTextureName("foodmod:itemice").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemice, itemice.getUnlocalizedName().substring(5));
    
    //Cooked PufferFish
    itempufferfish_cooked = new ItemFood(3, 0.2F, false).setUnlocalizedName("itempufferfish_cooked").setTextureName("foodmod:itempufferfish_cooked").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itempufferfish_cooked, itempufferfish_cooked.getUnlocalizedName().substring(5));
    
    //Cooked Clownfish
    itemclownfish_cooked = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemclownfish_cooked").setTextureName("foodmod:itemclownfish_cooked").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemclownfish_cooked, itemclownfish_cooked.getUnlocalizedName().substring(5));
    
    //Chicken Soup
    itemchickensoup = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemchickensoup").setTextureName("foodmod:itemchickensoup").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemchickensoup, itemchickensoup.getUnlocalizedName().substring(5));
    
    //Chicken Wing
    itemchickenwings = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemchickenwings").setTextureName("foodmod:itemchickenwing").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemchickenwings, itemchickenwings.getUnlocalizedName().substring(5));
    
    //Raw Chicken Wing
    itemchickenwingsraw = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemchickenwingsraw").setTextureName("foodmod:itemchickenwing_raw").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemchickenwingsraw, itemchickenwingsraw.getUnlocalizedName().substring(5));
    
    //Chicken Leg
    itemchickenleg = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemchickenleg").setTextureName("foodmod:itemchickenleg").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemchickenleg, itemchickenleg.getUnlocalizedName().substring(5));
    
    //Raw Chicken Leg
    itemchickenlegraw = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemchickenlegraw").setTextureName("foodmod:itemchickenleg_raw").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemchickenlegraw, itemchickenlegraw.getUnlocalizedName().substring(5));
    
    
    //Chicken Nuggets
    itemchicken_nuggets = new ItemFood(5, 0.2F, true).setUnlocalizedName("itemchicken_nuggets").setTextureName("foodmod:itemchicken_nuggets").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemchicken_nuggets, itemchicken_nuggets.getUnlocalizedName().substring(5));
    
    //Raw Chicken Nuggets
    itemchicken_nuggetsraw = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemchicken_nuggetsraw").setTextureName("foodmod:itemchicken_nuggetsraw").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemchicken_nuggetsraw, itemchicken_nuggetsraw.getUnlocalizedName().substring(5));
    
    //Cabbage
    itemcabbage = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcabbage").setTextureName("foodmod:itemcabbage").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcabbage, itemcabbage.getUnlocalizedName().substring(5));
    
    //Bun
    itembun = new ItemFood(3, 0.2F, true).setUnlocalizedName("itembun").setTextureName("foodmod:itembun").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itembun, itembun.getUnlocalizedName().substring(5));
    
    //Pickle
    itempickle = new ItemFood(3, 0.2F, false).setUnlocalizedName("itempickle").setTextureName("foodmod:itempickle").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itempickle, itempickle.getUnlocalizedName().substring(5));
    
    //Cucumber
    itemcucumber = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcucumber").setTextureName("foodmod:itemcucumber").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcucumber, itemcucumber.getUnlocalizedName().substring(5));
    
    //Squash
    itemsquash = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemsquash").setTextureName("foodmod:itemsquash").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemsquash, itemsquash.getUnlocalizedName().substring(5));
    
    //lemon juice
    itemlemonjuice = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemlemonjuice").setTextureName("foodmod:itemlemonjuice").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemlemonjuice, itemlemonjuice.getUnlocalizedName().substring(5));
   
    //mashed bananas
    itemmashedbananas = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemmashedbananas").setTextureName("foodmod:itemmashedbananas").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemmashedbananas, itemmashedbananas.getUnlocalizedName().substring(5));
  
    //chopped nuts
    itemchoppednuts = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemchoppednuts").setTextureName("foodmod:itemchoppednuts").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemchoppednuts, itemchoppednuts.getUnlocalizedName().substring(5));
  
    //chopped grass
    itemchoppedgrass = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemchoppedgrass").setTextureName("foodmod:itemchoppedgrass").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemchoppedgrass, itemchoppedgrass.getUnlocalizedName().substring(5));
   
    //baking powder
    itembakingpowder = new ItemFood(3, 0.2F, false).setUnlocalizedName("itembakingpowder").setTextureName("foodmod:itembakingpowder").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itembakingpowder, itembakingpowder.getUnlocalizedName().substring(5));
   
    //cinnamon
    itemcinnamon = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcinnamon").setTextureName("foodmod:itemcinnamon").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemcinnamon, itemcinnamon.getUnlocalizedName().substring(5));
   
    //ground ginger
    itemgroundginger = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemgroundginger").setTextureName("foodmod:itemgroundginger").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemgroundginger, itemgroundginger.getUnlocalizedName().substring(5));
    
    //almonds
    itemalmonds = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemalmonds").setTextureName("foodmod:itemalmonds").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemalmonds, itemalmonds.getUnlocalizedName().substring(5));
    
    //Ground Almonds
    itemgroundalmonds = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemgroundalmonds").setTextureName("foodmod:itemgroundalmonds").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemgroundalmonds, itemgroundalmonds.getUnlocalizedName().substring(5));
    
    //honey
    itemhoney = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemhoney").setTextureName("foodmod:itemhoney").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemhoney, itemhoney.getUnlocalizedName().substring(5));
    
    //sesame seeds
    itemsesameseeds = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemsesameseeds").setTextureName("foodmod:itemsesameseeds").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemsesameseeds, itemsesameseeds.getUnlocalizedName().substring(5));
   
    //shortening
    itemshortening = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemshortening").setTextureName("foodmod:itemshortening").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemshortening, itemshortening.getUnlocalizedName().substring(5));
   
    //brown sugar
    itembrownsugar = new ItemFood(3, 0.2F, false).setUnlocalizedName("itembrownsugar").setTextureName("foodmod:itembrownsugar").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itembrownsugar, itembrownsugar.getUnlocalizedName().substring(5));
   
    //melted butter
    itemmeltedbutter = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemmeltedbutter").setTextureName("foodmod:itemmeltedbutter").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemmeltedbutter, itemmeltedbutter.getUnlocalizedName().substring(5));
   
    //bay leaf
    itembayleaf = new ItemFood(3, 0.2F, false).setUnlocalizedName("itembayleaf").setTextureName("foodmod:itembayleaf").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itembayleaf, itembayleaf.getUnlocalizedName().substring(5));
    
    //hamburger                    
    itemhamburger = new ItemFood(10, 0.2F, true).setUnlocalizedName("itemhamburger").setTextureName("foodmod:itemhamburger").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemhamburger, itemhamburger.getUnlocalizedName().substring(5));
  
    //beef broth
    itembeefbroth = new ItemFood(3, 0.2F, true).setUnlocalizedName("itembeefbroth").setTextureName("foodmod:itembeefbroth").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itembeefbroth, itembeefbroth.getUnlocalizedName().substring(5));
  
    //jalapeno peppers
    itemjalapenopeppers = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemjalapenopeppers").setTextureName("foodmod:itemjalapenopeppers").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemjalapenopeppers, itemjalapenopeppers.getUnlocalizedName().substring(5));
 
    //mint leaves
    itemmintleaves = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemmintleaves").setTextureName("foodmod:itemmintleaves").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemmintleaves, itemmintleaves.getUnlocalizedName().substring(5));

    //Butter Candy
    itembuttercandy = new ItemFood(2, 0.2F, false).setUnlocalizedName("itembuttercandy").setTextureName("foodmod:itembuttercandy").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itembuttercandy, itembuttercandy.getUnlocalizedName().substring(5));

    //Horse Meat
    itemhorsemeat = new ItemFood(8, 0.2F, true).setUnlocalizedName("itemhorsemeat").setTextureName("foodmod:itemhorsemeat").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemhorsemeat, itemhorsemeat.getUnlocalizedName().substring(5));

    
    //Raw Horse Meat
    itemhorsemeat_raw = new ItemFood(3, 0.2F, true).setUnlocalizedName("itemhorsemeat_raw").setTextureName("foodmod:itemhorsemeat_raw").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemhorsemeat_raw, itemhorsemeat_raw.getUnlocalizedName().substring(5));

    //lucky candy
    itemluckycandy = new ItemFood(6, 0.2F, false).setUnlocalizedName("itemluckycandy").setTextureName("foodmod:itemluckycandy").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemluckycandy, itemluckycandy.getUnlocalizedName().substring(5));
    
    
    //Sugar Cube
    itemsugarcube = new Itemsugarcube().setUnlocalizedName("itemsugarcube").setTextureName("foodmod:itemsugarcube").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemsugarcube, itemsugarcube.getUnlocalizedName().substring(5));
    
    //Flour
    itemflour = new Itemflour().setUnlocalizedName("itemflour").setTextureName("foodmod:itemsugarcube").setCreativeTab(FoodMod);
    GameRegistry.registerItem(itemflour, itemflour.getUnlocalizedName().substring(5));
    
    //Gourd
    
    //Blue Cake
    blockbluecake = new Blockbluecake(Material.cake).setBlockName("blockbluecake").setBlockTextureName("foodmod:blockbluecake").setHardness(0.5F).setStepSound(Block.soundTypeCloth).setCreativeTab(FoodMod);
    GameRegistry.registerBlock(blockbluecake, blockbluecake.getUnlocalizedName().substring(5));
    System.out.println(blockbluecake.getUnlocalizedName().substring(5));
    
    //Chocolate Cake
    blockchocolatecake = new Blockchocolatecake(Material.cake).setBlockName("blockchocolatecake").setBlockTextureName("foodmod:blockchocolatecake").setHardness(0.5F).setStepSound(Block.soundTypeCloth).setCreativeTab(FoodMod);
    GameRegistry.registerBlock(blockchocolatecake, blockchocolatecake.getUnlocalizedName().substring(5));
    System.out.println(blockchocolatecake.getUnlocalizedName().substring(5));
    
    //Gold Cake
    blockgoldcake = new Blockgoldcake(Material.cake).setBlockName("blockgoldcake").setBlockTextureName("foodmod:blockgoldcake").setHardness(0.5F).setStepSound(Block.soundTypeCloth).setCreativeTab(FoodMod);
    GameRegistry.registerBlock(blockgoldcake, blockgoldcake.getUnlocalizedName().substring(5));
    System.out.println(blockgoldcake.getUnlocalizedName().substring(5));

    //Gold Cake
    blockmagentacake = new Blockmagentacake(Material.cake).setBlockName("blockmagentacake").setBlockTextureName("foodmod:blockmagentacake").setHardness(0.5F).setStepSound(Block.soundTypeCloth).setCreativeTab(FoodMod);
    GameRegistry.registerBlock(blockmagentacake, blockmagentacake.getUnlocalizedName().substring(5));
    System.out.println(blockmagentacake.getUnlocalizedName().substring(5));
    
    //Black Cake
    blockblackcake = new Blockblackcake(Material.cake).setBlockName("blockblackcake").setBlockTextureName("foodmod:blockblackcake").setHardness(0.5F).setStepSound(Block.soundTypeCloth).setCreativeTab(FoodMod);
    GameRegistry.registerBlock(blockblackcake, blockblackcake.getUnlocalizedName().substring(5));
    System.out.println(blockblackcake.getUnlocalizedName().substring(5));
    
    //Posion Cake
    blockposioncake = new Blockposioncake(Material.cake).setBlockName("blockposioncake").setBlockTextureName("foodmod:blockposioncake").setHardness(0.5F).setStepSound(Block.soundTypeCloth).setCreativeTab(FoodMod);
    GameRegistry.registerBlock(blockposioncake, blockposioncake.getUnlocalizedName().substring(5));
    System.out.println(blockposioncake.getUnlocalizedName().substring(5));
    
    //Creeper Cake Blue
    blockcreepercakeblue = new Blockcreepercakeblue(Material.cake).setBlockName("blockcreepercakeblue").setBlockTextureName("foodmod:blockcreepercakeblue").setHardness(0.5F).setStepSound(Block.soundTypeCloth).setCreativeTab(FoodMod);
    GameRegistry.registerBlock(blockcreepercakeblue, blockcreepercakeblue.getUnlocalizedName().substring(5));
    System.out.println(blockcreepercakeblue.getUnlocalizedName().substring(5));
    
    //Creeper Cake Green
    blockcreepercakegreen = new Blockcreepercakegreen(Material.cake).setBlockName("blockcreepercakegreen").setBlockTextureName("foodmod:blockcreepercakegreen").setHardness(0.5F).setStepSound(Block.soundTypeCloth).setCreativeTab(FoodMod);
    GameRegistry.registerBlock(blockcreepercakegreen, blockcreepercakegreen.getUnlocalizedName().substring(5));
    System.out.println(blockcreepercakegreen.getUnlocalizedName().substring(5));
    
    //Red Velvet Cake
    blockredvelvetcake = new Blockredvelvetcake(Material.cake).setBlockName("blockredvelvetcake").setBlockTextureName("foodmod:blockredvelvetcake").setHardness(0.5F).setStepSound(Block.soundTypeCloth).setCreativeTab(FoodMod);
    GameRegistry.registerBlock(blockredvelvetcake, blockredvelvetcake.getUnlocalizedName().substring(5));
    System.out.println(blockredvelvetcake.getUnlocalizedName().substring(5));
    
    //DeepDishPizza (CakeBlock)
    blockdeepdishpizza = new Blockdeepdishpizza(Material.cake).setBlockName("blockdeepdishpizza").setBlockTextureName("foodmod:blockdeepdishpizza").setHardness(0.5F).setStepSound(Block.soundTypeCloth).setCreativeTab(FoodMod);
    GameRegistry.registerBlock(blockdeepdishpizza, blockdeepdishpizza.getUnlocalizedName().substring(5));
    System.out.println(blockdeepdishpizza.getUnlocalizedName().substring(5));
    
   //Blocks
    //Stove
    blockstove = new Blockstove(Material.anvil).setBlockName("blockstove").setBlockTextureName("foodmod:blockstove").setCreativeTab(FoodMod);
    GameRegistry.registerBlock(blockstove, blockstove.getUnlocalizedName().substring(5));
    System.out.println(blockstove.getUnlocalizedName().substring(5));
    
    //Microwave
    blockmicrowave = new Blockmicrowave(Material.iron).setBlockName("blockmicrowave").setBlockTextureName("foodmod:blockmicrowave").setCreativeTab(FoodMod);
    GameRegistry.registerBlock(blockmicrowave, blockmicrowave.getUnlocalizedName().substring(5));
    System.out.println(blockmicrowave.getUnlocalizedName().substring(5));
    
   
    //Fridge
    
    
    //Sugar Ore
    blocksugarore = new Blocksugarore(Material.ground).setBlockName("blocksugarore").setBlockTextureName("foodmod:blocksugarore").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(FoodMod);
    setHarvestLevel("pickaxe",1);
    GameRegistry.registerBlock(blocksugarore, blocksugarore.getUnlocalizedName().substring(5));
    
    System.out.println(blocksugarore.getUnlocalizedName().substring(5));
    
    //Sugar Bricks
    blocksugarbricks = new Blocksugarbricks(Material.ground).setBlockName("blocksugarbricks").setBlockTextureName("foodmod:blocksugarbricks").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(FoodMod);
    GameRegistry.registerBlock(blocksugarbricks, blocksugarbricks.getUnlocalizedName().substring(5));
    setHarvestLevel("pickaxe",1);
    System.out.println(blocksugarbricks.getUnlocalizedName().substring(5));
    
    //Sugar Block
    blocksugar = new Blocksugar(Material.ground).setBlockName("blocksugar").setBlockTextureName("foodmod:blocksugar").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(FoodMod);
    GameRegistry.registerBlock(blocksugar, blocksugar.getUnlocalizedName().substring(5));
    setHarvestLevel("pickaxe",1);
    System.out.println(blocksugar.getUnlocalizedName().substring(5));
    
    //Food TNT
    blockfoodtnt = new Blockfoodtnt(Material.ground).setStepSound(Block.soundTypeGravel).setBlockName("blockfoodtnt").setBlockTextureName("foodmod:blockfoodtnt").setCreativeTab(FoodMod);
    GameRegistry.registerBlock(blockfoodtnt, blockfoodtnt.getUnlocalizedName().substring(5));
    System.out.println(blockfoodtnt.getUnlocalizedName().substring(5));
    
    //Light Block
    blocklight = new Blocklight(Material.ground).setBlockName("blocklight").setBlockTextureName("foodmod:blocklight").setCreativeTab(FoodMod);
    GameRegistry.registerBlock(blocklight, blocklight.getUnlocalizedName().substring(5));
    System.out.println(blocklight.getUnlocalizedName().substring(5));
    
    //Test Portal
    blocktestportal = new Blocktestportal(Material.portal).setBlockName("blocktestportal").setBlockTextureName("foodmod:blocktestportal");
    GameRegistry.registerBlock(blocktestportal, blocktestportal.getUnlocalizedName().substring(5));
    System.out.println(blocktestportal.getUnlocalizedName().substring(5));
    
    //Peppermint Log
    blockpeppermintlog = new Blockpeppermintlog(Material.wood).setBlockName("blockpeppermintlog").setBlockTextureName("foodmod:blockpeppermintlog").setCreativeTab(FoodMod);
    GameRegistry.registerBlock(blockpeppermintlog, blockpeppermintlog.getUnlocalizedName().substring(5));
    System.out.println(blockpeppermintlog.getUnlocalizedName().substring(5));
    
    //Cherry leaves
    Cherryleaves = new Cherryleaves(Material.leaves).setBlockName("Cherryleaves").setHardness(0.2F).setStepSound(Block.soundTypeGrass).setBlockTextureName("foodmod:leaves_cherry").setCreativeTab(FoodMod);
    GameRegistry.registerBlock(Cherryleaves, Cherryleaves.getUnlocalizedName().substring(5));
    System.out.println(Cherryleaves.getUnlocalizedName().substring(5));
    
    
    //jtrent238 Head
     jtrent238skull = new jtrent238skull(Material.ground).setBlockName("jtrent238skull").setBlockTextureName("foodmod:jtrent238skull").setCreativeTab(FoodMod);
     GameRegistry.registerBlock(jtrent238skull, jtrent238skull.getUnlocalizedName().substring(5));
     System.out.println(jtrent238skull.getUnlocalizedName().substring(5));
     
     //Oven
     BlockOven = new BlockOven(Material.anvil).setBlockName("BlockOven").setBlockTextureName("foodmod:BlockOven").setCreativeTab(FoodMod);
     GameRegistry.registerBlock(BlockOven, BlockOven.getUnlocalizedName().substring(5));
     System.out.println(BlockOven.getUnlocalizedName().substring(5));
     
     //Cherry Workbench
     blockcherryworkbench = new Blockcherryworkbench(Material.wood).setBlockName("blockcherryworkbench").setHardness(2.5F).setStepSound(Block.soundTypeWood).setBlockTextureName("foodmod:blockcherryworkbench").setCreativeTab(FoodMod);
     GameRegistry.registerBlock(blockcherryworkbench, blockcherryworkbench.getUnlocalizedName().substring(5));
     System.out.println(blockcherryworkbench.getUnlocalizedName().substring(5));
     
     //Cherry Planks
     blockcherryplanks = new Blockcherryplanks(Material.wood).setBlockName("blockcherryplanks").setHardness(2F).setStepSound(Block.soundTypeWood).setBlockTextureName("foodmod:blockcherryplanks").setCreativeTab(FoodMod);
     GameRegistry.registerBlock(blockcherryplanks, blockcherryplanks.getUnlocalizedName().substring(5));
     System.out.println(blockcherryplanks.getUnlocalizedName().substring(5));
     
     //Candy Stone
     blockcandystone = new Blockcandystone(Material.ground).setBlockName("blockcandystone").setHardness(1.5F).setStepSound(Block.soundTypeStone).setBlockTextureName("foodmod:blockcandystone").setCreativeTab(FoodMod);
     GameRegistry.registerBlock(blockcandystone, blockcandystone.getUnlocalizedName().substring(5));
     System.out.println(blockcandystone.getUnlocalizedName().substring(5));
     
     //Candy Dirt
     blockcandydirt = new blockcandydirt(Material.grass).setBlockName("blockcandydirt").setHardness(0.5F).setStepSound(Block.soundTypeGravel).setBlockTextureName("foodmod:blockcandydirt").setCreativeTab(FoodMod);
     GameRegistry.registerBlock(blockcandydirt, blockcandydirt.getUnlocalizedName().substring(5));
     System.out.println(blockcandydirt.getUnlocalizedName().substring(5));
     
     //Candy Grass
     blockcandygrass = new blockcandygrass(Material.grass).setBlockName("blockcandygrass").setHardness(0.6F).setStepSound(Block.soundTypeGrass).setBlockTextureName("foodmod:blockcandygrass").setCreativeTab(FoodMod);
     GameRegistry.registerBlock(blockcandygrass, blockcandygrass.getUnlocalizedName().substring(5));
     System.out.println(blockcandygrass.getUnlocalizedName().substring(5));
     
     //Candy Portal
    // blockcandyportal = new Blockcandyportal(Material.portal).setBlockName("blockcandyportal").setHardness(100F).setBlockTextureName("foodmod:blockcandyportal").setCreativeTab(FoodMod);
    // GameRegistry.registerBlock(blockcandyportal, blockcandyportal.getUnlocalizedName().substring(5));
    // System.out.println(blockcandyportal.getUnlocalizedName().substring(5));
     
   
    //Peanut Seeds
    itempeanutSeeds = new itempeanutSeeds(FoodModBlocks.itempeanut, Blocks.farmland);
    

    //Oil
    
    		
    //Test Entity
    TestEntity = new TestEntity(TestEntityMob.TestEntity);
    
    //CandyLand

}





private void setHarvestLevel(String string, int i) {

	
}





@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
    //•//Crafting Recipes//•//   
	 //END/•//Crafting Recipes//•/END//
    
    //•//Smelting Recipes//•// 
		//Lamb Furnace Recipe
    GameRegistry.addSmelting(itemlambraw, new ItemStack (itemlamb, 1), 0.2F );
    	//Mutton Furnace Recipe
    GameRegistry.addSmelting(itemmuttonraw, new ItemStack (itemmutton, 1), 0.2F );
    	//Fishsticks Furnace Recipe
    GameRegistry.addSmelting(itemfishsticks, new ItemStack (itemfishsticks, 1), 0.2F );
    	//Chicken Nuggets Furnace Recipe
    GameRegistry.addSmelting(itemchicken_nuggetsraw, new ItemStack (itemchicken_nuggets, 1), 0.2F );
    	//Chicken Wings Furnace Recipe
    GameRegistry.addSmelting(itemchickenwingsraw, new ItemStack (itemchickenwings, 1), 0.2F );
    	//Meatball Furnace Recipe
    GameRegistry.addSmelting(itemmeatballraw, new ItemStack (itemmeatball, 1), 0.2F );
    	//Flesh Furnace Recipe
    GameRegistry.addSmelting(itemflesh, new ItemStack (itemcookedflesh, 1), 0.2F );
    	//Fishsticks Furnace Recipe
    GameRegistry.addSmelting(itemfishsticksraw, new ItemStack (itemfishsticks, 1), 0.2F);
		//Horsemeat Furnace Recipe
    GameRegistry.addSmelting(itemhorsemeat_raw, new ItemStack (itemhorsemeat, 1), 0.2F);
    	//Chickenleg Furnace Recipe
    GameRegistry.addSmelting(itemchickenlegraw, new ItemStack (itemchickenleg, 1), 0.2F);
    //END/•//Smelting Recipes//•/END//
    
  NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
  //Not Implemented Yet//NetworkRegistry.INSTANCE.registerGuiHandler(FridgeGUI.instance, new GuiHandler());
}


public static CreativeTabs FoodMod = new CreativeTabs("FoodMod")
{


	public Item getTabIconItem() {

		return new ItemStack(itemmutton).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}


	}
;

	//Items
		//Seeds
		public static Item itempeanutSeeds;
	//Block
		//Plants
		public static Block blockpeanutPlant;

		
		
		//Misc Stuff
		public static Block tutBlock;
		public static Item tutItem;
		public static Block BlockOvenActive;


		
@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event) {
	{
		MinecraftForge.EVENT_BUS.register(new Guioven(Minecraft.getMinecraft()));
	    MinecraftForge.EVENT_BUS.register(new MobDropsHandler());
	    MinecraftForge.EVENT_BUS.register(new BlockRenderRegister());
	    MinecraftForge.EVENT_BUS.register(new itemnetherstarapple());
	    MinecraftForge.EVENT_BUS.register(new ItemPeanut());
	    MinecraftForge.EVENT_BUS.register(new FluidcookingOil());
	    MinecraftForge.EVENT_BUS.register(new Fuelcookingoil());
	    MinecraftForge.EVENT_BUS.register(new Reed());
	    MinecraftForge.EVENT_BUS.register(new test_gui());
	    MinecraftForge.EVENT_BUS.register(new test_block());
	    MinecraftForge.EVENT_BUS.register(new test_plant());
	    MinecraftForge.EVENT_BUS.register(new Blockbluecake());
	    MinecraftForge.EVENT_BUS.register(new BlockFlour());
	    MinecraftForge.EVENT_BUS.register(new FluidOil());
	    MinecraftForge.EVENT_BUS.register(new FuelOil());
	    MinecraftForge.EVENT_BUS.register(new Entilyjtrent238());
	    MinecraftForge.EVENT_BUS.register(new itemcherry());
	    MinecraftForge.EVENT_BUS.register(new Blockbuttercandyore());
	    MinecraftForge.EVENT_BUS.register(new WorldProviderCandyLand());
	    MinecraftForge.EVENT_BUS.register(new WorldGenCandyLand());
	    MinecraftForge.EVENT_BUS.register(new ItemLuckyCandy(6, 0.2F, false)); 
	   // MinecraftForge.EVENT_BUS.register(new TeleporterCandyLand());
	    
	//Candy Pig Registry
	    EntityRegistry.registerGlobalEntityID(EntityCandyPig.class, "EntityCandyPig",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityCandyPig.colorBase, com.jtrent238.foodmod.EntityCandyPig.colorSpots);
		EntityRegistry.addSpawn(EntityCandyPig.class, 17, 80, 4, EnumCreatureType.monster, candyland);
		RenderingRegistry.registerEntityRenderingHandler(EntityCandyPig.class, new RenderLiving(new ModelPig(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandyPig.png");}});//Sets Candy Pigs Texture
		
	//Candy Golem Registry
	    EntityRegistry.registerGlobalEntityID(EntityCandyGolem.class, "EntityCandyGolem",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityCandyGolem.colorBase, com.jtrent238.foodmod.EntityCandyGolem.colorSpots);
		EntityRegistry.addSpawn(EntityCandyGolem.class, 1, 1, 1, EnumCreatureType.monster, candyland);
		RenderingRegistry.registerEntityRenderingHandler(EntityCandyGolem.class, new RenderLiving(new ModelIronGolem(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandyGolem.png");}});//Sets Candy Golems Texture
		
	//Candy Stealer Registry
	    EntityRegistry.registerGlobalEntityID(EntityCandyStealer.class, "EntityCandyStealer",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityCandyStealer.colorBase, com.jtrent238.foodmod.EntityCandyStealer.colorSpots);
		EntityRegistry.addSpawn(EntityCandyStealer.class, 1, 1, 1, EnumCreatureType.monster, candyland);
		RenderingRegistry.registerEntityRenderingHandler(EntityCandyStealer.class, new RenderLiving(new ModelWitch(elec), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandyStealer.png");}});//Sets Candy Stealer Texture
		
		
		DimensionManager.registerDimension(2, elec);
		FMLCommonHandler playerMP;

	}
	
	
}











}
