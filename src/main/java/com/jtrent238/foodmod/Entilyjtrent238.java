package com.jtrent238.foodmod;

import cpw.mods.fml.client.*;
import cpw.mods.fml.client.registry.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.asm.*;
import cpw.mods.fml.common.asm.transformers.*;
import cpw.mods.fml.common.discovery.*;
import cpw.mods.fml.common.discovery.asm.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.functions.*;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.common.toposort.*;
import cpw.mods.fml.common.versioning.*;
import cpw.mods.fml.relauncher.*;
import cpw.mods.fml.server.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.*;
import net.minecraft.client.audio.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.achievement.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.model.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.client.settings.*;
import net.minecraft.command.*;
import net.minecraft.crash.*;
import net.minecraft.creativetab.*;
import net.minecraft.dispenser.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.*;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;
import net.minecraft.nbt.*;
import net.minecraft.network.*;
import net.minecraft.network.rcon.*;
import net.minecraft.pathfinding.*;
import net.minecraft.potion.*;
import net.minecraft.profiler.*;
import net.minecraft.server.*;
import net.minecraft.server.dedicated.*;
import net.minecraft.server.gui.*;
import net.minecraft.server.integrated.*;
import net.minecraft.server.management.*;
import net.minecraft.src.*;
import net.minecraft.stats.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.village.*;
import net.minecraft.world.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.chunk.storage.*;
import net.minecraft.world.demo.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.layer.*;
import net.minecraft.world.gen.structure.*;
import net.minecraft.world.storage.*;
import net.minecraftforge.classloading.*;
import net.minecraftforge.client.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.event.sound.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.event.entity.item.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.minecart.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.event.world.*;
import net.minecraftforge.oredict.*;
import net.minecraftforge.transformers.*;
import net.minecraft.init.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class Entilyjtrent238 {
	
	static int colorBase = (264) + (52) + 241; //RGB Value "rgb(X, X, X)"
    static int colorSpots  = (312) + (45) + 245; //RGB Value "rgb(X, X, X)"
    
	public static int mobid = 0;
	public Object instance;
	private World worldObj;

    public void load(){}

    public void generateNether(World world, Random random, int chunkX, int chunkZ){}
	public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
	public int addFuel(ItemStack fuel){
		return 0;
	}
	@SideOnly(Side.CLIENT)
	public void registerRenderers(){
		RenderingRegistry.registerEntityRenderingHandler(Entilyjtrent238.Entityjtrent238.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("Entilyjtrent238.png");}

public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9){
super.doRender(par1EntityLiving, par2, par4, par6, par8, par9);
BossStatus.setBossStatus((Entityjtrent238)par1EntityLiving, true);
}

});
	}
	public void serverLoad(FMLServerStartingEvent event){}
	public void preInit(FMLPreInitializationEvent event){
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		mobid = entityID;
		EntityRegistry.registerGlobalEntityID(Entilyjtrent238.Entityjtrent238.class, "jtrent238", entityID);
		EntityRegistry.registerModEntity(Entilyjtrent238.Entityjtrent238.class, "jtrent238", entityID, instance, 64, 1, true);
		EntityRegistry.addSpawn(Entilyjtrent238.Entityjtrent238.class, 10, 1, 1, EnumCreatureType.ambient , new BiomeGenBase[]{});

        DungeonHooks.addDungeonMob("jtrent238", 180);
	}



   public static class Entityjtrent238 extends EntityGolem implements IBossDisplayData
	{
		World world = null;
		private int attackTimer;
	    public Entityjtrent238(World var1)
	    {
	        super(var1);
	        world = var1;
	        experienceValue = 5;
	        this.isImmuneToFire = true;
	        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, 1.0D, true));
	        this.tasks.addTask(2, new EntityAIMoveTowardsTarget(this, 0.9D, 32.0F));
	        this.tasks.addTask(3, new EntityAIMoveThroughVillage(this, 0.6D, true));
	        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0D));
	        this.tasks.addTask(6, new EntityAIWander(this, 0.6D));
	        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	        this.tasks.addTask(8, new EntityAILookIdle(this));
	        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
	        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, true, IMob.mobSelector));
	        addRandomArmor();
	    }
	    
	   
	    protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
	    }

	    public boolean attackEntityAsMob(Entity p_70652_1_)
	    {
	        this.attackTimer = 10;
	        this.worldObj.setEntityState(this, (byte)4);
	        boolean flag = p_70652_1_.attackEntityFrom(DamageSource.causeMobDamage(this), (float)(7 + this.rand.nextInt(15)));

	        if (flag)
	        {
	            p_70652_1_.motionY += 0.4000000059604645D;
	        }

	        this.playSound("", 1.0F, 1.0F);
	        return flag;
	    }
protected void addRandomArmor(){

}

protected void dropRareDrop(int par1){
this.dropItem(Items.nether_star, 1);
}


    	public boolean isAIEnabled()
		{
			   return true;
    	}
    	   
    	/**
         * Determines if an entity can be despawned, used on idle far away entities
         */
        protected boolean canDespawn()
        {
            return false;
        }
        
	    /**
	     * Drop items of this living's type
	     */
	    protected void dropFewItems(boolean var1, int var2)
	    {
	    	this.entityDropItem(new ItemStack(BlockLoader.jtrent238skull), 0.0F);
	        this.entityDropItem(new ItemStack(Items.diamond), 0.0F);
	        this.entityDropItem(new ItemStack(Items.apple), 0.0F);
	        this.entityDropItem(new ItemStack(Items.written_book), 0.0F);
	        this.entityDropItem(new ItemStack(Items.potionitem), 0.0F);
	    }

	    /**
	     * Returns the sound this mob makes while it's alive.
	     */
	    protected String getLivingSound()
	    {
	        return "";
	    }

	    /**
	     * Returns the sound this mob makes when it is hurt.
	     */
	    protected String getHurtSound()
	    {
	        return "mob.villager.hit";
	    }

	    /**
	     * Returns the sound this mob makes on death.
	     */
	    protected String getDeathSound()
	    {
	        return "mob.villager.death";
	    }

	    public void onStruckByLightning(EntityLightningBolt entityLightningBolt){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			Entity entity = this;
			
		}

		protected void fall(float l){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			super.fall(l);
			Entity entity = this;
			
		}

    	public void onCriticalHit(Entity entity2) {
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			Entity entity = this;
			
		}

		public void onKillEntity(EntityLiving entityLiving){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			Entity entity = this;
			
		}

		public boolean interact(EntityPlayer entity2){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			Entity entity = this;
			
			return true;
		}

		public String getEntityName(){
			return "jtrent238";
		}

	}
   /**
    * Will return how many at most can spawn in a chunk at once.
    */
   public int getMaxSpawnedInChunk()
   {
       return 4;
   }
   
   
}
