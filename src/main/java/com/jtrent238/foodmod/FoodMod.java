package com.jtrent238.foodmod;


import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;

import com.jtrent238.foodmod.Entilyjtrent238.Entityjtrent238;
import com.jtrent238.foodmod.Entilytatapatt.Entitytatapatt;
import com.jtrent238.foodmod.BlockLoader;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundRegistry;
import net.minecraft.client.model.ModelBat;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBoat;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelChest;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.model.ModelGhast;
import net.minecraft.client.model.ModelHorse;
import net.minecraft.client.model.ModelIronGolem;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.model.ModelQuadruped;
import net.minecraft.client.model.ModelSkeleton;
import net.minecraft.client.model.ModelSlime;
import net.minecraft.client.model.ModelSpider;
import net.minecraft.client.model.ModelVillager;
import net.minecraft.client.model.ModelWitch;
import net.minecraft.client.model.ModelWither;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentArrowKnockback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.stats.Achievement;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldServer;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenPlains;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid="foodmod", name="jtrent238's Food Mod", version="1.0.0.5")
public class FoodMod
{

	private static final String MODID = "foodmod";
	
    
	
	@Instance(MODID)
    public static FoodMod instance;
	public static final String MODVERSION = "1.0.0.5";

	@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {

	}
	
	public static double rand;

	private static int p_i1986_1_;
	
	// Version checking instance
	public static VersionChecker versionChecker;
	public static boolean haveWarnedVersionOutOfDate = false;
	
	//Enchantments
	public static final Enchantment candy = new EnchantCandy(64, 22, 0);
	public static final Enchantment PosionProtection = new EnchantPosionProtection(65, 23, 0);
	
	
			
	//Biomes
	BiomeGenBase[] allBiomes = Iterators.toArray(Iterators.filter(Iterators.forArray(BiomeGenBase.getBiomeGenArray()), Predicates.notNull()), BiomeGenBase.class);

	private int elec;
	
		//CandyLand Biome
	protected static final BiomeGenBase.Height height_candyland = new BiomeGenBase.Height(0.1F, 0.2F);
	//public static final BiomeGenBase candyland = (new BiomeGenCandyLand(p_i1986_1_)).setColor(9286496).setBiomeName("CandyLand");
	public static final BiomeGenBase plains = (new BiomeGenPlains(1)).setColor(9286496).setBiomeName("Plains");
	public static WorldType tutorialWorld = new WorldTypeCustom(15, "CUSTOM");
	
	
		//saplings
	public static Block itemapplesapling;
	public static Block itemlemonsapling;

	
	
	public static Fluid fluidoil;
	public static Fluid fluidcookingoil;
	
		//Entity
	public static Entity entitycandypig;

	public static Teleporter teleportercandyland;
	
  //public static ModTrigger block;
	
	//public static BiomeCache candybiome;
	
	public GuiHandler guiHandler = new GuiHandler();
    

@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	
	FoodModBlocks.init();
    FoodModItems.init();
    
    //ClientProxyFoodMod.registerRenderers(this);
    
  //Achievements
    foodmodAchievements.loadAchievements();
    foodmodAchievements.registerPage();
     
    /** The Drunk Potion object. */
	//PotionDrunk = (new PotionDrunk(64, true, 64)).setPotionName("potion.potionDrunk");

    
    //CandyPig
    entitycandypig = new EntityCandyPig(null);
     
    //Gourd
    
    //Peanut Seeds
    itempeanutSeeds = new itempeanutSeeds(FoodModBlocks.itempeanut, Blocks.farmland);
    

    //Oil  
    //CandyLand
      
    //TileEntity Registry
    GameRegistry.registerTileEntity(TileEntityBlockOven.class, "Oven");
    
    //Drunk Potion
    PotionDrunk = new PotionDrunk(24, true, 64).setUnlocalizedName("PotionDrunk");
    
    MinecraftForge.EVENT_BUS.register(new PotionDrunk(24, true, 64));
}


private void setHarvestLevel(String string, int i) {

	
}

@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
	BlockLoader.loadBlocks();
	ItemLoader.LoadItems();
	EntityLoader.LoadEntitys();
	ModLoader.LoadMods();
	//SoundEvents.LoadSounds();
	ModBiomes.registerWithBiomeDictionary();
	Dimension.registerWorldProvider();
	Dimension.registerDimensions();
	WorldTypesTutorial.addCustomWorldTypes();
    Recipes.registerRecpies();
	MinecraftForge.EVENT_BUS.register(new Blockchocolatemilk());
	NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
	ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemnyanapple), 2, 5, 20));
	MinecraftForge.addGrassSeed(new ItemStack(FoodModItems.StrawberrySeeds), 5);
	//NetworkRegistry.instance().registerGuiHandler(instance, guiHandler);
	//Not Implemented Yet//NetworkRegistry.INSTANCE.registerGuiHandler(FridgeGUI.instance, new GuiHandler());
	GameRegistry.registerTileEntity(com.jtrent238.foodmod.TileEntityGrinder.class, "stringID");
	/** RecipeAPI */
	FMLInterModComms.sendMessage("cfm", "register", "com.jtrent238.foodmod.FurnitureRecipes.register");
	
}


public static CreativeTabs FoodMod = new CreativeTabs("FoodMod")
{
	public Item getTabIconItem() {

		return new ItemStack(ItemLoader.itemmutton).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}


	}
;
public static CreativeTabs TestStuff = new CreativeTabs("TestStuff")
{
	public Item getTabIconItem() {

		return new ItemStack(ItemLoader.itempeach).getItem();
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



		public static Potion PotionDrunk;


		




		
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
	  //MinecraftForge.EVENT_BUS.register(new WorldGenCandyLand());
	    MinecraftForge.EVENT_BUS.register(new CandyLand());
	    MinecraftForge.EVENT_BUS.register(new ItemLuckyCandy(6, 0.2F, false)); 
	  //MinecraftForge.EVENT_BUS.register(new TeleporterCandyLand());
	    MinecraftForge.EVENT_BUS.register(new ModUpdater()); 
	    MinecraftForge.EVENT_BUS.register(new ItemCandyBow()); 
	    MinecraftForge.EVENT_BUS.register(new Itemcandycanestructure()); 
	    MinecraftForge.EVENT_BUS.register(new FoodModEventHooks());
	    
	    Recipes.registerRecpies();
	    
		
		//DimensionManager.registerDimension(2, elec);
		FMLCommonHandler playerMP;


	}
	
	
}











}
