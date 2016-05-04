package com.jtrent238.foodmod;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;

public class foodmodcommand implements ICommand
{
	  private List aliases;
	  public foodmodcommand()
	  {
	    this.aliases = new ArrayList();
	    this.aliases.add("foodmod");
	    this.aliases.add("fm");
	  }

	  @Override
	  public String getCommandName()
	  {
	    return "foodmodcommand";
	  }

	  @Override
	  public String getCommandUsage(ICommandSender icommandsender)
	  {
	    return "foodmod <text>";
	  }

	  @Override
	  public List getCommandAliases()
	  {
	    return this.aliases;
	  }

	  @Override
	  public void processCommand(ICommandSender icommandsender, String[] astring)
	  {
	    if(astring.length == 0)
	    {
	      icommandsender.addChatMessage(null);
	      return;
	    }
	    
	    icommandsender.addChatMessage(null);
	    
	  }

	  @Override
	  public boolean canCommandSenderUseCommand(ICommandSender icommandsender)
	  {
	    return true;
	  }

	  @Override
	  public List addTabCompletionOptions(ICommandSender icommandsender,
	      String[] astring)
	  {
	    return null;
	  }

	  @Override
	  public boolean isUsernameIndex(String[] astring, int i)
	  {
	    return false;
	  }

	  @Override
	  public int compareTo(Object o)
	  {
	    return 0;
	  }
	}