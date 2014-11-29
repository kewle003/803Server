package org.virtue.network.protocol.packet.encoder.impl.chat;

import org.virtue.game.config.OutgoingOpcodes;
import org.virtue.game.logic.social.messages.FriendsPacket;
import org.virtue.network.protocol.packet.RS3PacketBuilder;
import org.virtue.network.protocol.packet.encoder.PacketEncoder;

/**
  * @author Virtue Development Team 2014 (c).
  */
public class FriendEncoder implements PacketEncoder<FriendsPacket> {

	@Override
	public RS3PacketBuilder buildPacket(FriendsPacket node) {
		RS3PacketBuilder buffer = new RS3PacketBuilder();
		buffer.putPacketVarShort(OutgoingOpcodes.FRIENDS_PACKET);
		if (node.isFullUpdate()) {
			for (FriendsPacket.Entry f : node.getFriends()) {
				packFriend(buffer, f, false);
			}
		} else {
			packFriend(buffer, node.getFriends()[0], node.isNameChange());
		}
		buffer.endPacketVarShort();
		return buffer;
	}
	
	private void packFriend (RS3PacketBuilder buffer, FriendsPacket.Entry f, boolean isNameChange) {
		boolean putOnline = (f.worldNodeID != 0);
		int flags = 0;
		/*if (friend.isRecruited()) {
			flags |= 0x1;
		}*/
		if (f.isReferred) {
			flags |= 0x2;
		}
		buffer.put(isNameChange ? 1 : 0);//Is this a notification of a friend name change
		buffer.putString(f.currentName);//Current display name
		buffer.putString(f.previousName == null ? "" : f.previousName);//Previous display name, or empty string if null
		buffer.putShort(putOnline ? f.worldNodeID : 0);//NodeID (world ID) of friend, or 0 if offline
		buffer.put(f.friendsChatRank.getID());//Rank in player's friends chat
		buffer.put(flags);//Flags (0x2=referred, 0x1=recruited)
		if (putOnline) {
			buffer.putString(f.worldName);//Friend world name
			buffer.put(0);//This always seems to be zero. Possibly physical server location? More info is needed.
			buffer.putInt(f.worldFlags);//Friend server flags
		}
		buffer.putString(f.note);//Note
	}

}
