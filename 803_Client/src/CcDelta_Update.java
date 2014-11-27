/* Class241_Sub25_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CcDelta_Update extends CcDeltaNode
{
    ClanChannelDelta this$0;
    byte rank;//aByte11052
    int nodeID;//anInt11053
    String displayName;//aString11054
    int memberIndex;//anInt11055
    
    void method15092(ClanChannel class241_sub6) {
	ClanChannelUser class373
	    = (class241_sub6.channelUsers
	       [memberIndex * 1398897437]);
	class373.rank = rank;
	class373.nodeID
	    = nodeID * -1404586945;
	class373.displayName = displayName;
    }
    
	@Override
    void decode(RSByteBuffer buffer, byte i) {
		memberIndex = buffer.readUnsignedShort(1162222719) * -1388503243;
		rank = buffer.getByte(1138981363);
		nodeID = buffer.readUnsignedShort(1162222719) * 828022807;
		buffer.readLong((short) 31233);
		displayName = buffer.readString(-1650611453);
    }
    
    void method15094(ClanChannel class241_sub6) {
	ClanChannelUser class373
	    = (class241_sub6.channelUsers
	       [memberIndex * 1398897437]);
	class373.rank = rank;
	class373.nodeID
	    = nodeID * -1404586945;
	class373.displayName = displayName;
    }
    
    void method15093(RSByteBuffer class241_sub3) {
	memberIndex
	    = class241_sub3.readUnsignedShort(1162222719) * -1388503243;
	rank
	    = class241_sub3.getByte(-1727875498);
	nodeID
	    = class241_sub3.readUnsignedShort(1162222719) * 828022807;
	class241_sub3.readLong((short) 7451);
	displayName
	    = class241_sub3.readString(-108582120);
    }
    
    void method15091(ClanChannel class241_sub6) {
	ClanChannelUser class373
	    = (class241_sub6.channelUsers
	       [memberIndex * 1398897437]);
	class373.rank = rank;
	class373.nodeID
	    = nodeID * -1404586945;
	class373.displayName = displayName;
    }
    
    CcDelta_Update(ClanChannelDelta delta) {
		this$0 = delta;
		memberIndex = 1388503243;
    }
    
    void method15088(ClanChannel class241_sub6) {
	ClanChannelUser class373
	    = (class241_sub6.channelUsers
	       [memberIndex * 1398897437]);
	class373.rank = rank;
	class373.nodeID
	    = nodeID * -1404586945;
	class373.displayName = displayName;
    }
    
	@Override
    void applyToClanChannel(ClanChannel channel, byte i) {
		ClanChannelUser ccUser = (channel.channelUsers[memberIndex * 1398897437]);
		ccUser.rank = rank;
		ccUser.nodeID = nodeID * -1404586945;
		ccUser.displayName = displayName;
    }
}
