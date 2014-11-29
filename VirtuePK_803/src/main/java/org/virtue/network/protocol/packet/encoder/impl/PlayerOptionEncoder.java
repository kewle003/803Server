package org.virtue.network.protocol.packet.encoder.impl;

import org.virtue.game.config.OutgoingOpcodes;
import org.virtue.network.protocol.messages.EntityOptionMessage;
import org.virtue.network.protocol.packet.RS3PacketBuilder;
import org.virtue.network.protocol.packet.encoder.PacketEncoder;

public class PlayerOptionEncoder implements PacketEncoder<EntityOptionMessage> {

	@Override
	public RS3PacketBuilder buildPacket(EntityOptionMessage node) {
		RS3PacketBuilder buffer = new RS3PacketBuilder();
		buffer.putPacketVarByte(OutgoingOpcodes.PLAYER_OPTION_PACKET);
		buffer.putByteC(node.isTop() ? 1 : 0);
		buffer.putString(node.getOption());
		buffer.putByteA(node.getSlot());
		buffer.putLEShortA(node.getCursor());
		buffer.endPacketVarByte();
		return buffer;
	}

}
