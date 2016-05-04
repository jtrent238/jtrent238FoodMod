package com.jtrent238.foodmod;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler
{
	private Container oven;

	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tile_entity = world.getTileEntity(x, y, z);
		if (tile_entity instanceof TileEntityFridge)
		{
			return new ContainerFridge(player.inventory, (TileEntityFridge) tile_entity);
		}
		if (tile_entity instanceof TileEntityFreezer)
		{
			return new ContainerFreezer(player.inventory, (TileEntityFreezer) tile_entity);
		}
		if (tile_entity instanceof TileEntityOven)
		{
			return new ContainerOven(player.inventory, (TileEntityOven) tile_entity);
		}
		if (tile_entity instanceof TileEntityBin)
		{
			return new ContainerBin(player.inventory, (TileEntityBin) tile_entity);
		}
		if (tile_entity instanceof TileEntityMicrowave)
		{
			return new ContainerMicrowave(player.inventory, (TileEntityMicrowave) tile_entity);
		}
		return null;
	}

	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tile_entity = world.getTileEntity(x, y, z);
		if (tile_entity instanceof TileEntityFridge)
		{
			return new GuiFridge(player.inventory, (TileEntityFridge) tile_entity);
		}
		if (tile_entity instanceof TileEntityFreezer)
		{
			return new GuiFreezer(player.inventory, (TileEntityFreezer) tile_entity);
		}
		if (tile_entity instanceof TileEntityOven)
		{
			return new GuiOven(player.inventory, (TileEntityOven) tile_entity, oven);
		}
		if (tile_entity instanceof TileEntityBin)
		{
			return new GuiBin(player.inventory, (TileEntityBin) tile_entity, x, y, z);
		}
		if (tile_entity instanceof TileEntityMicrowave)
		{
			return new GuiMicrowave(player.inventory, (TileEntityMicrowave) tile_entity);
		}
		ItemStack mail = null;
		if (player.getCurrentEquippedItem() != null)
		{
			mail = player.getCurrentEquippedItem();
		}
		return null;
	}
}