package com.jtrent238.foodmod;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class GuiOven extends GuiContainer
{
	public static Object instance;

	/*
	public GuiOven(Container p_i1072_1_) {
		super(p_i1072_1_);
	}
	*/
	public GuiOven(InventoryPlayer inventory, TileEntityOven tile_entity, Container oven) {
		super(oven);
	}
	private TileEntityOven OvenInventory;
	private static final ResourceLocation gui = new ResourceLocation("foodmod:textures/gui/oven.png");

	public GuiOven(InventoryPlayer inventoryplayer, TileEntityOven tileEntityOven)
	{
		super(new ContainerOven(inventoryplayer, tileEntityOven));
		this.OvenInventory = tileEntityOven;
	}

	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		this.fontRendererObj.drawString("Oven", 75, 6, 4210752);
		this.fontRendererObj.drawString("Inventory", 8, (ySize - 96) + 2, 4210752);
	}

	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(gui);
		int l = (width - xSize) / 2;
		int i1 = (height - ySize) / 2;
		this.drawTexturedModalRect(l, i1, 0, 0, xSize, ySize);
		int var7;

		var7 = this.OvenInventory.getCookProgressScaled(24);
		drawTexturedModalRect(l + 75, i1 + 20, 176, 14, var7 + 1, 16);
		drawTexturedModalRect(l + 66, (i1 + 40), 176, 0, 14, 14);
		drawTexturedModalRect(l + 81, (i1 + 40), 176, 0, 14, 14);
		drawTexturedModalRect(l + 96, (i1 + 40), 176, 0, 14, 14);
	}
	/*
@Override
protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
	
}
	*/
}
