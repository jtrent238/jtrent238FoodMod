package com.jtrent238.foodmod;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
 
public class itemcherry extends Item{
       
        public itemcherry(int par1){
               
                super();
                this.setCreativeTab(CreativeTabs.tabFood);
               
               
               
        }
        public itemcherry() {
		}
		public String getTextureFile()
        {
                return "foodmod:itemcherry.png";
        }
}