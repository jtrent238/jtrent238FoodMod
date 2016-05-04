package com.jtrent238.foodmod;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class GuiFreezer extends GuiContainer
{
	private TileEntityFreezer FreezerInventory;
	private static final ResourceLocation gui = new ResourceLocation("cfm:textures/gui/freezer.png");

	public GuiFreezer(InventoryPlayer playerInventory, TileEntityFreezer freezerInventory)
	{
		super(new ContainerFreezer(playerInventory, freezerInventory));
		this.FreezerInventory = freezerInventory;
	}

	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		this.fontRendererObj.drawString("Freezer", 8, 6, 4210752);
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

		if (this.FreezerInventory.isFreezing())
		{
			var7 = this.FreezerInventory.getFreezeTimeRemainingScaled(12);
			drawTexturedModalRect(l + 15, (i1 + 40) - var7, 176, 12 - var7, 14, var7 + 2);
		}
		var7 = this.FreezerInventory.getCoolProgressScaled(24);
		drawTexturedModalRect(l + 86, i1 + 27, 176, 14, var7 + 1, 16);
	}
}
