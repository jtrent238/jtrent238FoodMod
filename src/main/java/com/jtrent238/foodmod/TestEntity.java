package com.jtrent238.foodmod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class TestEntity extends Entity {

	public TestEntity(World p_i1582_1_) {
		super(p_i1582_1_);

	}


	@Override
	protected void entityInit() {
		createEntity(TestEntityMob.class, "Test Entity", 0xEC4545, 0x001EFF);

	}

	private void createEntity(Class<TestEntityMob> class1, String string, int i, int j) {

		
	}



	@Override
	protected void readEntityFromNBT(NBTTagCompound p_70037_1_) {

	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound p_70014_1_) {

	}

}
