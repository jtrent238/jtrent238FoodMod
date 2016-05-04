package com.jtrent238.foodmod;

import cofh.core.item.tool.ItemBowAdv;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class ItemCandyBow extends ItemBowAdv
{
    public static final String[] bowPullIconNameArray = new String[] {"pulling_0", "pulling_1", "pulling_2"};
    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;
    private static final String __OBFID = "CL_00001777";
	
	public ItemCandyBow(ToolMaterial IRON) {
		super(IRON);
		this.setCreativeTab(FoodMod.FoodMod);
		this.setFull3D();
		this.setUnlocalizedName("itemcandybow");
		
	}
	/*
	 public void registerIcons(IIconRegister p_94581_1_)
	    {
	        this.itemIcon = p_94581_1_.registerIcon(this.getIconString() + "_standby");
	        this.iconArray = new IIcon[bowPullIconNameArray.length];

	        for (int i = 0; i < this.iconArray.length; ++i)
	        {
	            this.iconArray[i] = p_94581_1_.registerIcon(this.getIconString() + "_" + bowPullIconNameArray[i]);
	        }
	    }
	    */
	 /**
	     * used to cycle through icons based on their used duration, i.e. for the bow
	     */
	    @SideOnly(Side.CLIENT)
	    public IIcon getItemIconForUseDuration(int p_94599_1_)
	    {
	        return this.iconArray[p_94599_1_];
	    }
    }