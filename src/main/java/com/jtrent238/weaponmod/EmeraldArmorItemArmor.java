package com.jtrent238.weaponmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;

public class EmeraldArmorItemArmor extends ItemArmor
{    

    private String name = "EmeraldArmorArmor";   
    public final int armorType;
    public final int damageReduceAmount;
    public final int renderIndex;    
    private final ArmorMaterial material;
 
    public EmeraldArmorItemArmor(ArmorMaterial material, int renderIndex, int EmeraldArmorItemArmor)
    {
    	  super(material, EmeraldArmorItemArmor, EmeraldArmorItemArmor);
        this.material = material;
        this.armorType = EmeraldArmorItemArmor;
        this.renderIndex = renderIndex;
        this.damageReduceAmount = material.getDamageReductionAmount(EmeraldArmorItemArmor);
        this.setMaxDamage(material.getDurability(EmeraldArmorItemArmor));
        
		    setUnlocalizedName(name + EmeraldArmorItemArmor);
		    GameRegistry.registerItem(this, name + EmeraldArmorItemArmor);        
        this.setCreativeTab(CreativeTabs.tabCombat);
    }


 
}