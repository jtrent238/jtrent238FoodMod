package com.jtrent238.foodmod;


import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;

import com.jtrent238.foodmod.Entilyjtrent238.Entityjtrent238;
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
import net.minecraft.client.model.ModelIronGolem;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.model.ModelQuadruped;
import net.minecraft.client.model.ModelSlime;
import net.minecraft.client.model.ModelSpider;
import net.minecraft.client.model.ModelVillager;
import net.minecraft.client.model.ModelWitch;
import net.minecraft.client.model.ModelWither;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.creativetab.CreativeTabs;
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
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.BiomeCache;
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

@Mod(modid="foodmod", name="jtrent238's Food Mod", version="1.0.0.4")
public class FoodMod
{

	private static final String MODID = "foodmod";
	
    
	
	@Instance(MODID)
    public static FoodMod instance;



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
	//public static final BiomeGenBase candyland = (new BiomeGenCandyLand(p_i1986_1_)).setColor(9286496).setBiomeName("CandyLand");
	public static final BiomeGenBase plains = (new BiomeGenPlains(1)).setColor(9286496).setBiomeName("Plains");
    
	
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
	
	
    

@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	
	FoodModBlocks.init();
    FoodModItems.init();

    //ClientProxyFoodMod.registerRenderers(this);
    
  //Achievements
    foodmodAchievements.loadAchievements();
    foodmodAchievements.registerPage();
     
    //CandyPig
    entitycandypig = new EntityCandyPig(null);
     
    //Gourd
    
    //Peanut Seeds
    itempeanutSeeds = new itempeanutSeeds(FoodModBlocks.itempeanut, Blocks.farmland);
    

    //Oil  
    //CandyLand
      
    //TileEntity Registry
    GameRegistry.registerTileEntity(TileEntityBlockOven.class, "Oven");
}


private void setHarvestLevel(String string, int i) {

	
}

@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
	BlockLoader.loadBlocks();
	ItemLoader.LoadItems();
	EntityLoader.LoadEntitys();
	//SoundEvents.LoadSounds();
	ModBiomes.registerWithBiomeDictionary();
	Dimension.registerWorldProvider();
	Dimension.registerDimensions();
	WorldTypesTutorial.addCustomWorldTypes();
    Recipes.registerRecpies();
	MinecraftForge.EVENT_BUS.register(new Blockchocolatemilk());
	NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
	//Not Implemented Yet//NetworkRegistry.INSTANCE.registerGuiHandler(FridgeGUI.instance, new GuiHandler());
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
	  //MinecraftForge.EVENT_BUS.register(new WorldGenCandyLand());
	    MinecraftForge.EVENT_BUS.register(new CandyLand());
	    MinecraftForge.EVENT_BUS.register(new ItemLuckyCandy(6, 0.2F, false)); 
	  //MinecraftForge.EVENT_BUS.register(new TeleporterCandyLand());
	    
	    Recipes.registerRecpies();
	    
	//Candy Pig Registry
	    EntityRegistry.registerGlobalEntityID(EntityCandyPig.class, "EntityCandyPig",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityCandyPig.colorBase, com.jtrent238.foodmod.EntityCandyPig.colorSpots);
	    //EntityRegistry.addSpawn(EntityCandyPig.class, 17, 80, 4, EnumCreatureType.monster, ModBiomes.candyland);
		RenderingRegistry.registerEntityRenderingHandler(EntityCandyPig.class, new RenderLiving(new ModelPig(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandyPig.png");}});//Sets Candy Pigs Texture
		
	//Candy Golem Registry
	    EntityRegistry.registerGlobalEntityID(EntityCandyGolem.class, "EntityCandyGolem",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityCandyGolem.colorBase, com.jtrent238.foodmod.EntityCandyGolem.colorSpots);
		//EntityRegistry.addSpawn(EntityCandyGolem.class, 1, 1, 1, EnumCreatureType.monster, ModBiomes.candyland);
		RenderingRegistry.registerEntityRenderingHandler(EntityCandyGolem.class, new RenderLiving(new ModelIronGolem(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandyGolem.png");}});//Sets Candy Golems Texture
		
	//Candy Stealer Registry
	    EntityRegistry.registerGlobalEntityID(EntityCandyStealer.class, "EntityCandyStealer",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityCandyStealer.colorBase, com.jtrent238.foodmod.EntityCandyStealer.colorSpots);
		//EntityRegistry.addSpawn(EntityCandyStealer.class, 1, 1, 1, EnumCreatureType.monster, ModBiomes.candyland);
		RenderingRegistry.registerEntityRenderingHandler(EntityCandyStealer.class, new RenderLiving(new ModelWitch(elec), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandyStealer.png");}});//Sets Candy Stealer Texture
	
	//Frosted Villager Registry
		EntityRegistry.registerGlobalEntityID(EntityFrostedVilliger.class, "EntityFrostedVilliger",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityFrostedVilliger.colorBase, com.jtrent238.foodmod.EntityFrostedVilliger.colorSpots);
	
	//EntityRegistry.addSpawn(EntityFrostedVilliger.class, 1, 1, 1, EnumCreatureType.monster, ModBiomes.candyland);
		RenderingRegistry.registerEntityRenderingHandler(EntityFrostedVilliger.class, new RenderLiving(new ModelVillager(elec), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityFrostedVilliger.png");}});//Sets Frosted Villager Texture
	
	//Candy Dragon Registry
		EntityRegistry.registerGlobalEntityID(EntityCandyDragon.class, "EntityCandyDragon",EntityRegistry.findGlobalUniqueEntityId());
		RenderingRegistry.registerEntityRenderingHandler(EntityCandyDragon.class, new RenderLiving(new ModelVillager(elec), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandyDragon.png");}});//Sets CandyDragon Texture
	
	//CandyStalker Registry
		EntityRegistry.registerGlobalEntityID(EntityCandyStalker.class, "EntityCandyStalker",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityCandyStalker.colorBase, com.jtrent238.foodmod.EntityCandyStalker.colorSpots);
	
	//EntityRegistry.addSpawn(EntityCandyStalker.class, 1, 1, 1, EnumCreatureType.monster, ModBiomes.candyland);
		RenderingRegistry.registerEntityRenderingHandler(EntityCandyStalker.class, new RenderLiving(new ModelCandyStalker(elec), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandyStalker.png");}});//Sets CandyStalker Texture	
	
	//Candy Wither Registry
		EntityRegistry.registerGlobalEntityID(EntityCandyWitherBoss.class, "EntityCandyWitherBoss",EntityRegistry.findGlobalUniqueEntityId());
		RenderingRegistry.registerEntityRenderingHandler(EntityCandyWitherBoss.class, new RenderLiving(new ModelWither(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandyWitherBoss.png");}});//Sets CandyWither Texture
	
	//Candy Creeper Registry
		EntityRegistry.registerGlobalEntityID(EntityCandyCreeper.class, "EntityCandyCreeper",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityCandyCreeper.colorBase, com.jtrent238.foodmod.EntityCandyCreeper.colorSpots);
		RenderingRegistry.registerEntityRenderingHandler(EntityCandyCreeper.class, new RenderLiving(new ModelCreeper(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandyCreeper.png");}});//Sets CandyCreeper Texture
	
	//Candy Chicken Registry
		EntityRegistry.registerGlobalEntityID(EntityCandyChicken.class, "EntityCandyChicken",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityCandyChicken.colorBase, com.jtrent238.foodmod.EntityCandyChicken.colorSpots);
		RenderingRegistry.registerEntityRenderingHandler(EntityCandyChicken.class, new RenderLiving(new ModelChicken(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandyChicken.png");}});//Sets CandyChicken Texture
	
	//Ginger Bread Man Registry
		EntityRegistry.registerGlobalEntityID(EntityGingerBreadMan.class, "EntityGingerBreadMan",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityGingerBreadMan.colorBase, com.jtrent238.foodmod.EntityGingerBreadMan.colorSpots);
		RenderingRegistry.registerEntityRenderingHandler(EntityGingerBreadMan.class, new RenderLiving(new ModelZombie(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityGingerBreadMan.png");}});//Sets GingerBread Man Texture
	
	//Candy Ghast Registry
		EntityRegistry.registerGlobalEntityID(EntityCandyGhast.class, "EntityCandyGhast",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityCandyGhast.colorBase, com.jtrent238.foodmod.EntityCandyGhast.colorSpots);
		RenderingRegistry.registerEntityRenderingHandler(EntityCandyGhast.class, new RenderLiving(new ModelGhast(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandyGhast.png");}});//Sets CandyGhast Texture
		
	//Candy Cow Registry
		EntityRegistry.registerGlobalEntityID(EntityCandyCow.class, "EntityCandyCow",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityCandyCow.colorBase, com.jtrent238.foodmod.EntityCandyCow.colorSpots);
		RenderingRegistry.registerEntityRenderingHandler(EntityCandyCow.class, new RenderLiving(new ModelCow(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandyCow.png");}});//Sets CandyCow Texture
			
	//Candy Bat Registry
		EntityRegistry.registerGlobalEntityID(EntityCandyBat.class, "EntityCandyBat",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityCandyBat.colorBase, com.jtrent238.foodmod.EntityCandyBat.colorSpots);
		RenderingRegistry.registerEntityRenderingHandler(EntityCandyBat.class, new RenderLiving(new ModelBat(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandyBat.png");}});//Sets CandyBat Texture
		
	//Candy Spider Registry
		EntityRegistry.registerGlobalEntityID(EntityCandySpider.class, "EntityCandySpider",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityCandySpider.colorBase, com.jtrent238.foodmod.EntityCandySpider.colorSpots);
		RenderingRegistry.registerEntityRenderingHandler(EntityCandySpider.class, new RenderLiving(new ModelQuadruped(elec, elec), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandyBat.png");}});//Sets CandySpider Texture
	
	//Candy Spider Registry
		EntityRegistry.registerGlobalEntityID(EntityCandySlime.class, "EntityCandySlime",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityCandySlime.colorBase, com.jtrent238.foodmod.EntityCandySlime.colorSpots);
		RenderingRegistry.registerEntityRenderingHandler(EntityCandySlime.class, new RenderLiving(new ModelSlime(elec), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandySlime.png");}});//Sets CandySlime Texture
	
	//Candy Spider Registry
		EntityRegistry.registerGlobalEntityID(EntityCandyCreeperBlue.class, "EntityCandyCreeperBlue",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityCandyCreeperBlue.colorBase, com.jtrent238.foodmod.EntityCandyCreeperBlue.colorSpots);
		RenderingRegistry.registerEntityRenderingHandler(EntityCandyCreeperBlue.class, new RenderLiving(new ModelCreeper(elec), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandyCreeperBlue.png");}});//Sets CandyCreeperBlue Texture
	
	
	//GummyBear Registry
	EntityRegistry.registerGlobalEntityID(EntityGummyBear.class, "EntityGummyBear",EntityRegistry.findGlobalUniqueEntityId());
	RenderingRegistry.registerEntityRenderingHandler(EntityGummyBear.class, new RenderLiving(new ModelGummyBear(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityGummyBear.png");}});//Sets GummyBear Texture
	
	
		
	//jtrent238 Entity Registry
		EntityRegistry.registerGlobalEntityID(Entityjtrent238.class, "Entityjtrent238",EntityRegistry.findGlobalUniqueEntityId());
		RenderingRegistry.registerEntityRenderingHandler(Entityjtrent238.class, new RenderLiving(new ModelBiped(elec), 0){protected ResourceLocation getEntityTexture(Entity Entityjtrent238){return new ResourceLocation("Entityjtrent238.png");}});//Sets jtrent238 Texture
		
	//CandyXPOrb
		EntityRegistry.registerGlobalEntityID(EntityCandyXPOrb.class, "EntityCandyXPOrb",EntityRegistry.findGlobalUniqueEntityId());
	
	//Candy Boat Registry
		EntityRegistry.registerGlobalEntityID(EntityCandyBoat.class, "EntityCandyBoat",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityCandyCreeperBlue.colorBase, com.jtrent238.foodmod.EntityCandyCreeperBlue.colorSpots);
		RenderingRegistry.registerEntityRenderingHandler(EntityCandyBoat.class, new RenderLiving(new ModelBoat(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandyBoat.png");}});//Sets CandyBoat Texture
			

		
		
		//DimensionManager.registerDimension(2, elec);
		FMLCommonHandler playerMP;


	}
	
	
}











}
