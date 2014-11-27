/* Class241_Sub25_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CcDelta_Add extends CcDeltaNode
{
    byte rank;//aByte10914
    String displayName;//aString10915
    int nodeID;//anInt10916
    ClanChannelDelta this$0;
    
    void method15091(ClanChannel class241_sub6) {
	ClanChannelUser class373 = new ClanChannelUser();
	class373.displayName = displayName;
	class373.nodeID
	    = 1192368473 * nodeID;
	class373.rank = rank;
	class241_sub6.doAddMember(class373, (short) 1027);
    }
    
	@Override
    void decode(RSByteBuffer buffer, byte i) {
		if (buffer.readUnsignedByte((byte) 90) != 255) {
			buffer.pointer -= -681042949;
			buffer.readLong((short) 23641);
		}
		displayName = buffer.readNullString(-2145016633);
		nodeID = buffer.readUnsignedShort(1162222719) * 727376081;
		rank = buffer.getByte(-964825901);
		buffer.readLong((short) 30813);
    }
    
    CcDelta_Add(ClanChannelDelta delta) {
		this$0 = delta;
		displayName = null;
    }
    
    void method15093(RSByteBuffer class241_sub3) {
	if (class241_sub3.readUnsignedByte((byte) -81) != 255) {
	    class241_sub3.pointer -= -681042949;
	    class241_sub3.readLong((short) 32266);
	}
	displayName
	    = class241_sub3.readNullString(-955928021);
	nodeID
	    = class241_sub3.readUnsignedShort(1162222719) * 727376081;
	rank
	    = class241_sub3.getByte(869024119);
	class241_sub3.readLong((short) 8074);
    }
    
    void method15088(ClanChannel class241_sub6) {
	ClanChannelUser class373 = new ClanChannelUser();
	class373.displayName = displayName;
	class373.nodeID
	    = 1192368473 * nodeID;
	class373.rank = rank;
	class241_sub6.doAddMember(class373, (short) 1027);
    }
    
    void method15092(ClanChannel class241_sub6) {
		ClanChannelUser class373 = new ClanChannelUser();
		class373.displayName = displayName;
		class373.nodeID
		    = 1192368473 * nodeID;
		class373.rank = rank;
	class241_sub6.doAddMember(class373, (short) 1027);
    }
    
	@Override
    void applyToClanChannel(ClanChannel channel, byte i) {
		ClanChannelUser ccUser = new ClanChannelUser();
		ccUser.displayName = displayName;
		ccUser.nodeID = 1192368473 * nodeID;
		ccUser.rank = rank;
		channel.doAddMember(ccUser, (short) 1027);
    }
    
    void method15094(ClanChannel class241_sub6) {
		ClanChannelUser class373 = new ClanChannelUser();
		class373.displayName = displayName;
		class373.nodeID
		    = 1192368473 * nodeID;
		class373.rank = rank;
		class241_sub6.doAddMember(class373, (short) 1027);
    }
}
