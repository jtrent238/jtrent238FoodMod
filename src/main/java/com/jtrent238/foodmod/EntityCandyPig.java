package com.jtrent238.foodmod;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIControlledByPlayer;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityCandyPig extends EntityAnimal {

	/** AI task for player control. */
    private final EntityAIControlledByPlayer aiControlledByPlayer;
    private static final String __OBFID = "CL_00001647";

    static int colorBase = (255 << 16) + (153 << 8) + 153; //RGB Value "rgb(X, X, X)"
    static int colorSpots  = (255 << 16) + (51 << 8) + 102; //RGB Value "rgb(X, X, X)"
    
    public EntityCandyPig(World p_i1689_1_)
    {
        super(p_i1689_1_);
        this.setSize(0.9F, 0.9F);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
        this.tasks.addTask(2, this.aiControlledByPlayer = new EntityAIControlledByPlayer(this, 0.3F));
        this.tasks.addTask(3, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(4, new EntityAITempt(this, 1.2D, Items.carrot_on_a_stick, false));
        this.tasks.addTask(4, new EntityAITempt(this, 1.2D, Items.carrot, false));
        this.tasks.addTask(5, new EntityAIFollowParent(this, 1.1D));
        this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
    }

	/**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
    }
    
    protected void updateAITasks()
    {
        super.updateAITasks();
    }

    /**
     * returns true if all the conditions for steering the entity are met. For pigs, this is true if it is being ridden
     * by a player and the player is holding a carrot-on-a-stick
     */
    public boolean canBeSteered()
    {
        ItemStack itemstack = ((EntityPlayer)this.riddenByEntity).getHeldItem();
        return itemstack != null && itemstack.getItem() == Items.carrot_on_a_stick;
    }

    protected void entityInit()
    {
        super.entityInit();
        
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    /*public void writeEntityToNBT(NBTTagCompound p_70014_1_)
    {
        super.writeEntityToNBT(p_70014_1_);
        p_70014_1_.setBoolean("Saddle", this.getSaddled());
    }
     */
    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound p_70037_1_)
    {
        super.readEntityFromNBT(p_70037_1_);
        this.setSaddled(p_70037_1_.getBoolean("Saddle"));
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.pig.say";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.pig.say";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.pig.death";
    }

    protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
    {
        this.playSound("mob.pig.step", 0.15F, 1.0F);
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    /*public boolean interact(EntityPlayer p_70085_1_)
    {
        if (super.interact(p_70085_1_))
        {
            return true;
        }
        else if (this.getSaddled() && !this.worldObj.isRemote && (this.riddenByEntity == null || this.riddenByEntity == p_70085_1_))
        {
            p_70085_1_.mountEntity(this);
            return true;
        }
        else
        {
            return false;
        }
    }
     */
    protected Item getDropItem()
    {
        return this.isBurning() ? Items.cooked_porkchop : ItemLoader.itemcandycane;
    }

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        int j = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + p_70628_2_);

        for (int k = 0; k < j; ++k)
        {
            if (this.isBurning())
            {
                this.dropItem(Items.cooked_porkchop, 1);
            }
            else
            {
                this.dropItem(ItemLoader.itemcandycane, 4);
            }
        }
        /*
        if (this.getSaddled())
        {
            this.dropItem(Items.saddle, 1);
        }*/
    }

    /**
     * Returns true if the pig is saddled.
     */
    /*public boolean getSaddled()
    {
        return (this.dataWatcher.getWatchableObjectByte(16) & 1) != 0;
    }
     */
    /**
     * Set or remove the saddle of the pig.
     */
    public void setSaddled(boolean p_70900_1_)
    {
        if (p_70900_1_)
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)1));
        }
        else
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)0));
        }
    }

    /**
     * Called when a lightning bolt hits the entity.
     */
    public void onStruckByLightning(EntityLightningBolt p_70077_1_)
    {	
    	//Spawns Candy Zombie Pigman
        if (!this.worldObj.isRemote)
        {
        	EntityCandyzombie_pigman entityCandyzombie_pigman = new EntityCandyzombie_pigman(this.worldObj);
        	entityCandyzombie_pigman.setCurrentItemOrArmor(0, new ItemStack(Items.diamond_sword));
        	entityCandyzombie_pigman.setCurrentItemOrArmor(1, new ItemStack(Items.diamond_helmet));
        	entityCandyzombie_pigman.setCurrentItemOrArmor(2, new ItemStack(Items.diamond_chestplate));
        	entityCandyzombie_pigman.setCurrentItemOrArmor(3, new ItemStack(Items.diamond_leggings));
        	entityCandyzombie_pigman.setCurrentItemOrArmor(4, new ItemStack(Items.diamond_boots));
        	entityCandyzombie_pigman.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            this.worldObj.spawnEntityInWorld(entityCandyzombie_pigman);
            this.setDead();
        }
        
        }

    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    protected void fall(float p_70069_1_)
    {
        super.fall(p_70069_1_);

        if (p_70069_1_ > 5.0F && this.riddenByEntity instanceof EntityPlayer)
        {
            ((EntityPlayer)this.riddenByEntity).triggerAchievement(AchievementList.flyPig);
        }
    }

    public EntityCandyPig createChild(EntityAgeable p_90011_1_)
    {
        return new EntityCandyPig(this.worldObj);
    }

    /**
     * Checks if the parameter is an item which this animal can be fed to breed it (wheat, carrots or seeds depending on
     * the animal type)
     */
    public boolean isBreedingItem(ItemStack p_70877_1_)
    {
        return p_70877_1_ != null && p_70877_1_.getItem() == ItemLoader.itemcandycane;
    }

    /**
     * Return the AI task for player control.
     */
    public EntityAIControlledByPlayer getAIControlledByPlayer()
    {
        return this.aiControlledByPlayer;
    }


}
