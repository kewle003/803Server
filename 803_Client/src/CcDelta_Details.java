/* Class241_Sub25_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CcDelta_Details extends CcDeltaNode
{
    byte minTalkReq;//aByte10972
    byte minKickReq;//aByte10973
    String channelName;//aString10974
    ClanChannelDelta this$0;
    
    void method15092(ClanChannel class241_sub6) {
	class241_sub6.channelName = channelName;
	if (null != channelName) {
	    class241_sub6.minTalkReq = minTalkReq;
	    class241_sub6.minKickReq = minKickReq;
	}
    }
    
    void method15088(ClanChannel class241_sub6) {
	class241_sub6.channelName = channelName;
	if (null != channelName) {
	    class241_sub6.minTalkReq = minTalkReq;
	    class241_sub6.minKickReq = minKickReq;
	}
    }
    
    void applyToClanChannel(ClanChannel channel, byte i) {
		channel.channelName = channelName;
		if (null != channelName) {
			channel.minTalkReq = minTalkReq;
			channel.minKickReq = minKickReq;
		}
    }
    
    void method15093(RSByteBuffer class241_sub3) {
	channelName
	    = class241_sub3.readNullString(-365993845);
	if (null != channelName) {
	    class241_sub3.readUnsignedByte((byte) -44);
	    minTalkReq
		= class241_sub3.getByte(-710368434);
	    minKickReq
		= class241_sub3.getByte(-1338360492);
	}
    }
    
    void method15091(ClanChannel class241_sub6) {
	class241_sub6.channelName = channelName;
	if (null != channelName) {
	    class241_sub6.minTalkReq = minTalkReq;
	    class241_sub6.minKickReq = minKickReq;
	}
    }
    
    void method15094(ClanChannel class241_sub6) {
	class241_sub6.channelName = channelName;
	if (null != channelName) {
	    class241_sub6.minTalkReq = minTalkReq;
	    class241_sub6.minKickReq = minKickReq;
	}
    }
    
    void decode(RSByteBuffer buffer, byte i) {
		channelName = buffer.readNullString(-1323059735);
		if (null != channelName) {
			buffer.readUnsignedByte((byte) 24);
			minTalkReq = buffer.getByte(795440464);
			minKickReq = buffer.getByte(-429710065);
		}
    }
    
    CcDelta_Details(ClanChannelDelta delta) {
		this$0 = delta;
    }
}
