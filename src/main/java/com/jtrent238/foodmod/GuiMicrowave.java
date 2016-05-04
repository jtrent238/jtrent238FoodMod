package com.jtrent238.foodmod;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class GuiMicrowave extends GuiContainer
{
	private static final ResourceLocation gui = new ResourceLocation("cfm:textures/gui/microwave.png");
	private TileEntityMicrowave tileEntityMicrowave;

	private GuiButton button_start;

	public GuiMicrowave(InventoryPlayer inventoryPlayer, TileEntityMicrowave tileEntityMicrowave)
	{
		super(new ContainerMicrowave(inventoryPlayer, tileEntityMicrowave));
		this.tileEntityMicrowave = tileEntityMicrowave;
		this.xSize = 176;
		this.ySize = 174;
	}

	@Override
	public void initGui()
	{
		super.initGui();
		Keyboard.enableRepeatEvents(false);
		buttonList.clear();

		int posX = width / 2;
		int posY = height / 2;

		button_start = new GuiButton(0, posX + 30, posY - 48, 32, 20, "Start");
		buttonList.add(button_start);
	}
/*
	@Override
	protected void actionPerformed(GuiButton guibutton)
	{
		if (!guibutton.enabled)
		{
			return;
		}

		if (guibutton.id == 0)
		{
			if (!tileEntityMicrowave.isCooking())
			{
				PacketHandler.INSTANCE.sendToServer(new MessageMicrowave(0, tileEntityMicrowave.getPos().getX(), tileEntityMicrowave.getPos().getY(), tileEntityMicrowave.getPos().getZ()));
			}
			else
			{
				PacketHandler.INSTANCE.sendToServer(new MessageMicrowave(1, tileEntityMicrowave.getPos().getX(), tileEntityMicrowave.getPos().getY(), tileEntityMicrowave.getPos().getZ()));
			}
		}
	}
*/
	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		this.fontRendererObj.drawString("Inventory", 8, 80, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(gui);
		int l = (width - xSize) / 2;
		int i1 = (height - ySize) / 2;
		this.drawTexturedModalRect(l, i1, 0, 0, xSize, ySize);

		int percent = tileEntityMicrowave.progress * 27 / 40;
		drawTexturedModalRect(l + 120, i1 + 26, 176, 0, percent, 5);

		if (tileEntityMicrowave.isCooking())
		{
			button_start.displayString = "Stop";
		}
		else
		{
			button_start.displayString = "Start";
		}
	}

}
