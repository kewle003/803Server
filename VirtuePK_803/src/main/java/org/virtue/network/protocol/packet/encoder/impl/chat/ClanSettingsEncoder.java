package org.virtue.network.protocol.packet.encoder.impl.chat;

import org.virtue.game.config.OutgoingOpcodes;
import org.virtue.game.logic.social.messages.ClanSettingsPacket;
import org.virtue.network.protocol.packet.RS3PacketBuilder;
import org.virtue.network.protocol.packet.encoder.PacketEncoder;

public class ClanSettingsEncoder implements PacketEncoder<ClanSettingsPacket> {

	public static int VERSION = 2;
	
	@Override
	public RS3PacketBuilder buildPacket(ClanSettingsPacket node) {
		//NOTE: User hashes are not supported in this version
		RS3PacketBuilder buffer = new RS3PacketBuilder();
		buffer.putPacketVarShort(OutgoingOpcodes.CLAN_SETTINGS_FULL);
		buffer.put(node.isGuestData() ? 0 : 1);
		
		buffer.put(VERSION);
		int flags = 0;
		flags |= 0x2;//Use display names
		buffer.put(flags);
		buffer.putInt(node.getUpdateNumber());
		buffer.putInt(0);//TODO: Find out what this does
		buffer.putShort(node.getMembers().length);
		buffer.put(node.getBans().length);
		buffer.putString(node.getClanName());
		if (VERSION >= 4) {
			buffer.putInt(0);//This isn't currently used on the client side
		}
		buffer.put(node.allowNonMembers() ? 1 : 0);
		buffer.put(node.getMinTalk().getID());
		buffer.put(node.getMinKick().getID());
		buffer.put(0);//Lootshare - Not currently available for clans
		buffer.put(0);//TODO: Find out what this does
		for (ClanSettingsPacket.Member member : node.getMembers()) {
			packMember(buffer, member);
		}
		
		for (String ban : node.getBans()) {
			buffer.putString(ban);
		}
		
		if (VERSION >= 3) {
			buffer.putShort(node.getVarClanSettings().length);
			for (ClanSettingsPacket.VarClanSetting setting : node.getVarClanSettings()) {
				packVarClanSetting(buffer, setting.getKey(), setting.getValue());
			}
		}
		
		buffer.endPacketVarShort();
		return buffer;
	}
	
	private void packVarClanSetting (RS3PacketBuilder buffer, int key, Object value) {
		int type = (value instanceof Integer) ? 0 : ((value instanceof Long) ? 1 : ((value instanceof String) ? 2 : 3));
		key &= 0x3fffffff;
		key |= type << 30;
		buffer.putInt(key);
		switch (type) {
		case 0:
			buffer.putInt((Integer) value);
			break;
		case 1:
			buffer.putLong((Long) value);
			break;
		case 2:
			buffer.putString((String) value);
			break;
		default:
			break;
		}
	}
	
	private void packMember (RS3PacketBuilder buffer, ClanSettingsPacket.Member member) {
		buffer.putString(member.getDisplayName());
		buffer.put(member.getRank().getID());
		if (VERSION >= 2) {
			buffer.putInt(member.getVarClanMember());
		}
		if (VERSION >= 5) {
			buffer.putShort(member.getJoinDay());//Recruitment day (days since 22 February 2002)
		}
		if (VERSION >= 6) {
			buffer.put(0);//TODO: Find out what this boolean does
		}
	}

}
