package com.jtrent238.foodmod;


import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{

        @Override
        public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
        { 
                TileEntity tileEntity = world.getTileEntity(x, y, z);

                if(tileEntity != null)
                {
                        switch(ID)
                        {
                        //case 0: return new ContainerSmelter(player.inventory, (TileEntitySmelter)tileEntity);
                        case 1: return new ContainerChest(player.inventory, (TileEntityChest)tileEntity);
                        case 2: return new ContainerFoodProcessor(player.inventory, (TileEntityFoodProcessor)tileEntity);
                        }
                }
                if (ID == 3)
                {
                        //return new ContainerForge(player.inventory, world, x, y, z);
                }

                return null;
        }

        @Override
        public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
        {
                TileEntity tileEntity = world.getTileEntity(x, y, z);

                if (tileEntity != null)
                {
                        switch(ID)
                        {
                        //case 0: return new GuiSmelter(player.inventory, (TileEntitySmelter)tileEntity);
                        case 1: return new GuiChest(player.inventory, (TileEntityChest)tileEntity);
                        case 2: return new GuiFoodProcessor(player.inventory, (TileEntityFoodProcessor)tileEntity);
                        }
                }
                if (ID == 3)
                {
                        //return new GuiForge(player.inventory, world, x, y, z);
                }

                return null;
        }
}
/*import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler
{
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
    { 
        TileEntity te = world.getTileEntity(x, y, z);
 
        if (te != null)
        {
            if (ID == 0) //Gui ID for storage block, will add later
            {
                return new ContainerStorage((TileEntityStorage)te, player);
            }
        }
        return null;
    }
 
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity te = world.getTileEntity(x, y, z);
 
        if (te != null)
        {
            if (ID == 0) //Gui ID for storage block, will add later
            {
                return new GuiStorage((TileEntityStorage)te, player);
            }
        }
        return null;
    }
}
*/