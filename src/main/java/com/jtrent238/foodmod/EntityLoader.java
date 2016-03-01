package com.jtrent238.foodmod;

import com.jtrent238.foodmod.Entilyjtrent238.Entityjtrent238;
import com.jtrent238.foodmod.Entilytatapatt.Entitytatapatt;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.client.model.ModelBat;
import net.minecraft.client.model.ModelBiped;
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
import net.minecraft.client.model.ModelVillager;
import net.minecraft.client.model.ModelWitch;
import net.minecraft.client.model.ModelWither;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class EntityLoader {
	
	private static int elec;

	public static void LoadEntitys() {
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
	
	//Candy Horse Registry
		EntityRegistry.registerGlobalEntityID(EntityCandyHorse.class, "EntityCandyHorse",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityCandyHorse.colorBase, com.jtrent238.foodmod.EntityCandyHorse.colorSpots);
		RenderingRegistry.registerEntityRenderingHandler(EntityCandyHorse.class, new RenderLiving(new ModelHorse(), elec){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandyHorse.png");}});//Sets CandyCreeperBlue Texture
	
	//GummyBear Registry
		EntityRegistry.registerGlobalEntityID(EntityGummyBear.class, "EntityGummyBear",EntityRegistry.findGlobalUniqueEntityId());
		RenderingRegistry.registerEntityRenderingHandler(EntityGummyBear.class, new RenderLiving(new ModelGummyBear(), elec){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityGummyBear.png");}});//Sets GummyBear Texture
	
	//Candy Zombie Pigman
	EntityRegistry.registerGlobalEntityID(EntityCandyzombie_pigman.class, "EntityCandyzombie_pigman",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityCandyzombie_pigman.colorBase, com.jtrent238.foodmod.EntityCandyzombie_pigman.colorSpots);
	RenderingRegistry.registerEntityRenderingHandler(EntityCandyzombie_pigman.class, new RenderLiving(new ModelZombie(), elec){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandyzombie_pigman.png");}});//Sets Candy Zombie Pigman Texture
	
	//Candy Skeleton Registry
	EntityRegistry.registerGlobalEntityID(EntityCandySkeleton.class, "EntityCandySkeleton",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityCandySkeleton.colorBase, com.jtrent238.foodmod.EntityCandySkeleton.colorSpots);
	RenderingRegistry.registerEntityRenderingHandler(EntityCandySkeleton.class, new RenderLiving(new ModelSkeleton(), elec){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandySkeleton.png");}});//Sets Candy Zombie Pigman Texture
	
		
	//jtrent238 Entity Registry
		EntityRegistry.registerGlobalEntityID(Entityjtrent238.class, "Entityjtrent238",EntityRegistry.findGlobalUniqueEntityId());
		RenderingRegistry.registerEntityRenderingHandler(Entityjtrent238.class, new RenderLiving(new ModelBiped(elec), 0){protected ResourceLocation getEntityTexture(Entity Entityjtrent238){return new ResourceLocation("Entityjtrent238.png");}});//Sets jtrent238 Texture
	
	//tatapatt Entity Registry
		EntityRegistry.registerGlobalEntityID(Entitytatapatt.class, "Entitytatapatt",EntityRegistry.findGlobalUniqueEntityId());
		RenderingRegistry.registerEntityRenderingHandler(Entitytatapatt.class, new RenderLiving(new ModelBiped(elec), 0){protected ResourceLocation getEntityTexture(Entity Entitytatapatt){return new ResourceLocation("Entitytatapatt.png");}});//Sets tatapatt Texture
	
		/*
	//CandyXPOrb
		EntityRegistry.registerGlobalEntityID(EntityCandyXPOrb.class, "EntityCandyXPOrb",EntityRegistry.findGlobalUniqueEntityId());
		*/
		/*
	//Candy Boat Registry
		EntityRegistry.registerGlobalEntityID(EntityCandyBoat.class, "EntityCandyBoat",EntityRegistry.findGlobalUniqueEntityId(), com.jtrent238.foodmod.EntityCandyCreeperBlue.colorBase, com.jtrent238.foodmod.EntityCandyCreeperBlue.colorSpots);
		RenderingRegistry.registerEntityRenderingHandler(EntityCandyBoat.class, new RenderLiving(new ModelBoat(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("EntityCandyBoat.png");}});//Sets CandyBoat Texture
		*/	

	}

}
