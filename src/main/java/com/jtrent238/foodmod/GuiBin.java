package com.jtrent238.foodmod;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiBin extends GuiContainer
{
		/*
	public GuiBin(Container p_i1072_1_) {
		super(p_i1072_1_);
	}
		 */
	public GuiBin(InventoryPlayer inventory, TileEntityBin tile_entity, int x, int y, int z, Container p_i1072_1_) {
		super(p_i1072_1_);
	}

	
	private static final ResourceLocation gui = new ResourceLocation("foodmod:textures/gui/bin.png");
	private GuiButton button_empty;
	private int tileX, tileY, tileZ;

	public GuiBin(IInventory playerInventory, IInventory binInventory, int tileX, int tileY, int tileZ)
	{
		super(new ContainerBin(playerInventory, binInventory));
		this.tileX = tileX;
		this.tileY = tileY;
		this.tileZ = tileZ;
		this.xSize = 176;
		this.ySize = 197;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		this.fontRendererObj.drawString("Inventory", 8, this.ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(gui);
		int l = (width - xSize) / 2;
		int i1 = (height - ySize) / 2;
		this.drawTexturedModalRect(l, i1, 0, 0, xSize, ySize);
	}

	@Override
	public void initGui()
	{
		super.initGui();
		Keyboard.enableRepeatEvents(false);
		buttonList.clear();
		int posX = width / 2;
		int posY = height / 2;
		button_empty = new GuiButton(0, posX + 40, posY - 50, 40, 20, "Empty");
		button_empty.enabled = true;
		buttonList.add(button_empty);
	}

	@Override
	protected void actionPerformed(GuiButton guibutton)
	{
		if (!guibutton.enabled)
		{
			return;
		}
		if (guibutton.id == 0)
		{
			this.emptyBin();
		}
	}
	
/*
	@Override
	protected void mouseClicked(int i, int j, int k)
	{
		try
		{
			super.mouseClicked(i, j, k);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
*/
	protected void emptyBin()
	{
		//PacketHandler.instance.sendToServer(new MessageEmptyBin(tileX, tileY, tileZ));
	}
/*
	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
		
	}
*/
}
