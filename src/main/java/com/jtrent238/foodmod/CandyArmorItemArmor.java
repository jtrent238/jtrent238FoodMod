package com.jtrent238.foodmod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;
import cpw.mods.fml.common.registry.GameRegistry;
 
public class CandyArmorItemArmor extends ItemArmor
{    

    private String name = "CandyArmor";   
    public final int armorType;
    public final int damageReduceAmount;
    public final int renderIndex;    
    private final ArmorMaterial material;
 
    public CandyArmorItemArmor(ArmorMaterial material, int renderIndex, int armorType)
    {
    	  super(material, armorType, armorType);
        this.material = material;
        this.armorType = armorType;
        this.renderIndex = renderIndex;
        this.damageReduceAmount = material.getDamageReductionAmount(armorType);
        this.setMaxDamage(material.getDurability(armorType));
        
		    setUnlocalizedName(name + armorType);
		    GameRegistry.registerItem(this, name + armorType);        
        this.setCreativeTab(FoodMod.FoodMod);
    } 
 
}