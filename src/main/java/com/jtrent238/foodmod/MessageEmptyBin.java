package com.jtrent238.foodmod;

import io.netty.buffer.ByteBuf;
import net.minecraft.tileentity.TileEntity;

//Server Packet
public class MessageEmptyBin //implements IMessage, IMessageHandler<MessageEmptyBin, IMessage>
{

	private int x, y, z;

	public MessageEmptyBin()
	{
	}

	public MessageEmptyBin(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void fromBytes(ByteBuf buf)
	{
		this.x = buf.readInt();
		this.y = buf.readInt();
		this.z = buf.readInt();
	}

	public void toBytes(ByteBuf buf)
	{
		buf.writeInt(x);
		buf.writeInt(y);
		buf.writeInt(z);
	}
/*
	@Override
	public IMessage onMessage(MessageEmptyBin message, MessageContext ctx)
	{
		TileEntity tile_entity = ctx.getServerHandler().playerEntity.worldObj.getTileEntity(new BlockPos(message.x, message.y, message.z));
		if (tile_entity instanceof TileEntityBin)
		{
			TileEntityBin tileEntityBin = (TileEntityBin) tile_entity;
			tileEntityBin.clear();
		}
		ctx.getServerHandler().playerEntity.worldObj.markBlockForUpdate(new BlockPos(message.x, message.y, message.z));
		return null;
	}
	*/
}
