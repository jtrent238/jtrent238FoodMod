package com.jtrent238.foodmod;

import cpw.mods.fml.common.network.IGuiHandler;
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
