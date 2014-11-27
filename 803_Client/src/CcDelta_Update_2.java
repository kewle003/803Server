/* Class241_Sub25_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CcDelta_Update_2 extends CcDeltaNode
{
    String displayName;//aString10917
    byte rank;//aByte10918
    int memberIndex;//anInt10919
    int nodeID;//anInt10920
    ClanChannelDelta this$0;
    
    void method15094(ClanChannel class241_sub6) {
	ClanChannelUser class373
	    = (class241_sub6.channelUsers
	       [memberIndex * 59134669]);
	class373.rank = rank;
	class373.nodeID
	    = 193104717 * nodeID;
	class373.displayName = displayName;
    }
    
	@Override
    void decode(RSByteBuffer buffer, byte i) {
		buffer.readUnsignedByte((byte) -27);
		memberIndex = buffer.readUnsignedShort(1162222719) * -1955206651;
		rank = buffer.getByte(612165198);
		nodeID = buffer.readUnsignedShort(1162222719) * -414934579;
		buffer.readLong((short) 16542);
		displayName = buffer.readString(-728079508);
		buffer.readUnsignedByte((byte) 22);
    }
    
    void method15091(ClanChannel class241_sub6) {
	ClanChannelUser class373
	    = (class241_sub6.channelUsers
	       [memberIndex * 59134669]);
	class373.rank = rank;
	class373.nodeID
	    = 193104717 * nodeID;
	class373.displayName = displayName;
    }
    
    void method15093(RSByteBuffer class241_sub3) {
	class241_sub3.readUnsignedByte((byte) 10);
	memberIndex
	    = class241_sub3.readUnsignedShort(1162222719) * -1955206651;
	rank
	    = class241_sub3.getByte(1045297679);
	nodeID
	    = class241_sub3.readUnsignedShort(1162222719) * -414934579;
	class241_sub3.readLong((short) 31670);
	displayName
	    = class241_sub3.readString(1628889325);
	class241_sub3.readUnsignedByte((byte) 72);
    }
    
    CcDelta_Update_2(ClanChannelDelta delta) {
		this$0 = delta;
		memberIndex = 1955206651;
    }
    
    void method15092(ClanChannel class241_sub6) {
	ClanChannelUser class373
	    = (class241_sub6.channelUsers
	       [memberIndex * 59134669]);
	class373.rank = rank;
	class373.nodeID
	    = 193104717 * nodeID;
	class373.displayName = displayName;
    }
    
    void method15088(ClanChannel class241_sub6) {
	ClanChannelUser class373
	    = (class241_sub6.channelUsers
	       [memberIndex * 59134669]);
	class373.rank = rank;
	class373.nodeID
	    = 193104717 * nodeID;
	class373.displayName = displayName;
    }
    
	@Override
    void applyToClanChannel(ClanChannel channel, byte i) {
		ClanChannelUser ccUser = channel.channelUsers[memberIndex * 59134669];
		ccUser.rank = rank;
		ccUser.nodeID = 193104717 * nodeID;
		ccUser.displayName = displayName;
    }
    
    static final void method17252(ClientScriptData class454, byte i) {
	boolean bool = true;
	if (client.aBool8267) {
	    try {
		Object object = JSFunction.aClass348_5377.method6210(2142109045);
		if (null != object)
		    bool = ((Boolean) object).booleanValue();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = bool ? 1 : 0;
    }
}
