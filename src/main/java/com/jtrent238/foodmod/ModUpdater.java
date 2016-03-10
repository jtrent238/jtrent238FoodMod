package com.jtrent238.foodmod;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.event.ClickEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;

public class ModUpdater {
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public void onEvent(PlayerTickEvent event)
	{
	  
	    if (!FoodMod.haveWarnedVersionOutOfDate && event.player.worldObj.isRemote 
	          && !FoodMod.versionChecker.isLatestVersion())
	    {
	        ClickEvent versionCheckChatClickEvent = new ClickEvent(ClickEvent.Action.OPEN_URL, 
	              "http://jabelarminecraft.blogspot.com");
	        ChatStyle clickableChatStyle = new ChatStyle().setChatClickEvent(versionCheckChatClickEvent);
	        ChatComponentText versionWarningChatComponent = 
	              new ChatComponentText("Your Food Mod is not latest version!  Click here to update.");
	        versionWarningChatComponent.setChatStyle(clickableChatStyle);
	        event.player.addChatMessage(versionWarningChatComponent);
	        FoodMod.haveWarnedVersionOutOfDate = true;
	    }
	  
	}
}
