package com.jtrent238.weaponmod;

import java.util.Random;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.item.*;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public class blockcreeperinajar{

	public static Block blockcreeperinajar;
	
	public static Object instance;

	private CreativeTabs tabWeaponMod;public int addFuel(ItemStack fuel){return 0;}
	public void serverLoad(FMLServerStartingEvent event){}
	public void preInit(FMLPreInitializationEvent event){
	
		blockcreeperinajar = blockcreeperinajar(Material.wood).setBlockName("blockcreeperinajar").setBlockTextureName("weaponmod:blockcreeperinajar").setCreativeTab(tabWeaponMod);

		GameRegistry.registerBlock(blockcreeperinajar, "Creeper");
		System.out.println(blockcreeperinajar.getUnlocalizedName().substring(5));}
	private Block blockcreeperinajar(Material wood) {

		return null;
	}
	public void registerRenderers(){}
	public void load(){
	}
	
public blockcreeperinajar(){}


public blockcreeperinajar(Material ground) {

}

static class ItemcreeperInAJar extends Block{


	int a1 = 0,a2 = 0,a3 = 0,a4 = 0,a5 = 0,a6 = 0;

	IIcon gor = null, dol = null, st1 = null, st2 = null, st3 = null, st4 = null;

	boolean red = false;
	
protected ItemcreeperInAJar(Material material) {
		super(material);

	}

public void onBlockAdded(World world, int i, int j, int k){
EntityPlayer entity = Minecraft.getMinecraft().thePlayer;
if(entity!=null&&world!=null){
int le = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
world.setBlockMetadataWithNotify(i, j, k, le, 2);
}

world.scheduleBlockUpdate(i, j, k, this, this.tickRate(world));

}
public int isProvidingStrongPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5){
return red?1:0;
}
public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entity, int l, float m, float n, float o){

if(true){
boolean place = true;

if(place){
world.setBlock(i+0, j+0, k+0, Block.getBlockById(20), 0, 2);
world.setBlock(i+1, j+0, k+0, Block.getBlockById(20), 0, 2);
world.setBlock(i+2, j+0, k+0, Block.getBlockById(20), 0, 2);
world.setBlock(i+3, j+0, k+0, Block.getBlockById(20), 0, 2);
world.setBlock(i+0, j+0, k+1, Block.getBlockById(20), 0, 2);
world.setBlock(i+1, j+0, k+1, Block.getBlockById(2), 0, 2);
world.setBlock(i+2, j+0, k+1, Block.getBlockById(2), 0, 2);
world.setBlock(i+3, j+0, k+1, Block.getBlockById(20), 0, 2);
world.setBlock(i+0, j+0, k+2, Block.getBlockById(20), 0, 2);
world.setBlock(i+1, j+0, k+2, Block.getBlockById(2), 0, 2);
world.setBlock(i+2, j+0, k+2, Block.getBlockById(2), 0, 2);
world.setBlock(i+3, j+0, k+2, Block.getBlockById(20), 0, 2);
world.setBlock(i+0, j+0, k+3, Block.getBlockById(20), 0, 2);
world.setBlock(i+1, j+0, k+3, Block.getBlockById(20), 0, 2);
world.setBlock(i+2, j+0, k+3, Block.getBlockById(20), 0, 2);
world.setBlock(i+3, j+0, k+3, Block.getBlockById(20), 0, 2);
world.setBlock(i+0, j+1, k+0, Block.getBlockById(20), 0, 2);
world.setBlock(i+1, j+1, k+0, Block.getBlockById(20), 0, 2);
world.setBlock(i+2, j+1, k+0, Block.getBlockById(20), 0, 2);
world.setBlock(i+3, j+1, k+0, Block.getBlockById(20), 0, 2);
world.setBlock(i+0, j+1, k+1, Block.getBlockById(20), 0, 2);
world.setBlock(i+1, j+1, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+2, j+1, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+3, j+1, k+1, Block.getBlockById(20), 0, 2);
world.setBlock(i+0, j+1, k+2, Block.getBlockById(20), 0, 2);
world.setBlock(i+1, j+1, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+2, j+1, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+3, j+1, k+2, Block.getBlockById(20), 0, 2);
world.setBlock(i+0, j+1, k+3, Block.getBlockById(20), 0, 2);
world.setBlock(i+1, j+1, k+3, Block.getBlockById(20), 0, 2);
world.setBlock(i+2, j+1, k+3, Block.getBlockById(20), 0, 2);
world.setBlock(i+3, j+1, k+3, Block.getBlockById(20), 0, 2);
world.setBlock(i+0, j+2, k+0, Block.getBlockById(20), 0, 2);
world.setBlock(i+1, j+2, k+0, Block.getBlockById(20), 0, 2);
world.setBlock(i+2, j+2, k+0, Block.getBlockById(20), 0, 2);
world.setBlock(i+3, j+2, k+0, Block.getBlockById(20), 0, 2);
world.setBlock(i+0, j+2, k+1, Block.getBlockById(20), 0, 2);
world.setBlock(i+1, j+2, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+2, j+2, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+3, j+2, k+1, Block.getBlockById(20), 0, 2);
world.setBlock(i+0, j+2, k+2, Block.getBlockById(20), 0, 2);
world.setBlock(i+1, j+2, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+2, j+2, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+3, j+2, k+2, Block.getBlockById(20), 0, 2);
world.setBlock(i+0, j+2, k+3, Block.getBlockById(20), 0, 2);
world.setBlock(i+1, j+2, k+3, Block.getBlockById(20), 0, 2);
world.setBlock(i+2, j+2, k+3, Block.getBlockById(20), 0, 2);
world.setBlock(i+3, j+2, k+3, Block.getBlockById(20), 0, 2);
world.setBlock(i+0, j+3, k+0, Block.getBlockById(20), 0, 2);
world.setBlock(i+1, j+3, k+0, Block.getBlockById(20), 0, 2);
world.setBlock(i+2, j+3, k+0, Block.getBlockById(20), 0, 2);
world.setBlock(i+3, j+3, k+0, Block.getBlockById(20), 0, 2);
world.setBlock(i+0, j+3, k+1, Block.getBlockById(20), 0, 2);
world.setBlock(i+1, j+3, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+2, j+3, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+3, j+3, k+1, Block.getBlockById(20), 0, 2);
world.setBlock(i+0, j+3, k+2, Block.getBlockById(20), 0, 2);
world.setBlock(i+1, j+3, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+2, j+3, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+3, j+3, k+2, Block.getBlockById(20), 0, 2);
world.setBlock(i+0, j+3, k+3, Block.getBlockById(20), 0, 2);
world.setBlock(i+1, j+3, k+3, Block.getBlockById(20), 0, 2);
world.setBlock(i+2, j+3, k+3, Block.getBlockById(20), 0, 2);
world.setBlock(i+3, j+3, k+3, Block.getBlockById(20), 0, 2);
world.setBlock(i+0, j+4, k+0, Block.getBlockById(20), 0, 2);
world.setBlock(i+1, j+4, k+0, Block.getBlockById(20), 0, 2);
world.setBlock(i+2, j+4, k+0, Block.getBlockById(20), 0, 2);
world.setBlock(i+3, j+4, k+0, Block.getBlockById(20), 0, 2);
world.setBlock(i+0, j+4, k+1, Block.getBlockById(20), 0, 2);
world.setBlock(i+1, j+4, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+2, j+4, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+3, j+4, k+1, Block.getBlockById(20), 0, 2);
world.setBlock(i+0, j+4, k+2, Block.getBlockById(20), 0, 2);
world.setBlock(i+1, j+4, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+2, j+4, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+3, j+4, k+2, Block.getBlockById(20), 0, 2);
world.setBlock(i+0, j+4, k+3, Block.getBlockById(20), 0, 2);
world.setBlock(i+1, j+4, k+3, Block.getBlockById(20), 0, 2);
world.setBlock(i+2, j+4, k+3, Block.getBlockById(20), 0, 2);
world.setBlock(i+3, j+4, k+3, Block.getBlockById(20), 0, 2);
world.setBlock(i+0, j+5, k+0, Block.getBlockById(5), 0, 2);
world.setBlock(i+1, j+5, k+0, Block.getBlockById(5), 0, 2);
world.setBlock(i+2, j+5, k+0, Block.getBlockById(5), 0, 2);
world.setBlock(i+3, j+5, k+0, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+5, k+1, Block.getBlockById(5), 0, 2);
world.setBlock(i+1, j+5, k+1, Block.getBlockById(5), 0, 2);
world.setBlock(i+2, j+5, k+1, Block.getBlockById(5), 0, 2);
world.setBlock(i+3, j+5, k+1, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+5, k+2, Block.getBlockById(5), 0, 2);
world.setBlock(i+1, j+5, k+2, Block.getBlockById(5), 0, 2);
world.setBlock(i+2, j+5, k+2, Block.getBlockById(5), 0, 2);
world.setBlock(i+3, j+5, k+2, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+5, k+3, Block.getBlockById(5), 0, 2);
world.setBlock(i+1, j+5, k+3, Block.getBlockById(5), 0, 2);
world.setBlock(i+2, j+5, k+3, Block.getBlockById(5), 0, 2);
world.setBlock(i+3, j+5, k+3, Block.getBlockById(5), 0, 2);
Entity sentity0=EntityList.createEntityByName("Creeper",world);
if (sentity0!=null){
sentity0.setLocationAndAngles(i+2.0,j+1.0,k+2.0,world.rand.nextFloat()*360F,0);
world.spawnEntityInWorld(sentity0);
}
}
}

return true;}
@SideOnly(Side.CLIENT)
@Override
public IIcon getIcon(int i, int par2){

if (i == 0)
return gor;

else if (i == 1)
return dol;

else if (i == 2)
return st1;

else if (i == 3)
return st2;

else if (i == 4)
return st4;

else if (i == 5)
return st3;

else
return gor;

}

@SideOnly(Side.CLIENT)
@Override
public void registerBlockIcons(IIconRegister reg){
this.gor = reg.registerIcon("blockcreeperinajar");
this.dol = reg.registerIcon("0");
this.st1 = reg.registerIcon("0");
this.st2 = reg.registerIcon("0");
this.st3 = reg.registerIcon("0");
this.st4 = reg.registerIcon("0");
}
public int getRenderType(){
return 0;
}
@Override
public int tickRate(World world)
{
    return 10;
}

public int quantityDropped(Random par1Random){
return 1;
}

}



public blockcreeperinajar setBlockName() {

	return null;
}}
