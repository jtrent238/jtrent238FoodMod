package com.jtrent238.foodmod;

import net.minecraft.util.ChatComponentText;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

public class FoodModEvent {
	
	
    @SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {

    	event.player.addChatComponentMessage(new ChatComponentText("§b§lHello" + "" + "§e§l" + event.player.getDisplayName() + "§b§l!"));
    	event.player.addChatComponentMessage(new ChatComponentText(/*/event.player.getDisplayName() + /*/"§a§lFoodMod §2§lMade By:jtrent238"));
    	event.player.addChatComponentMessage(new ChatComponentText(/*/event.player.getDisplayName() + /*/"§6§lYou are running {$MODVERSION} of FoodMod!"));
        event.getListenerList();
    }
    public void init(){
    	NetworkRegistry.INSTANCE.registerGuiHandler(GuiOven.instance, new GuiHandler());
    }
	
}