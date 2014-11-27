/* Class241_Sub25_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CcDelta_Delete extends CcDeltaNode
{
    int memberIndex;//anInt11044
    ClanChannelDelta this$0;
    
    CcDelta_Delete(ClanChannelDelta class383) {
		this$0 = class383;
		memberIndex = 2141957959;
    }
    
    void method15094(ClanChannel class241_sub6) {
	class241_sub6.doDeleteMember((-247548535
				   * memberIndex),
				  -1298038849);
    }
    
	@Override
    void applyToClanChannel(ClanChannel channel, byte i) {
		channel.doDeleteMember((-247548535 * memberIndex), -1156522267);
    }
    
	@Override
    void decode(RSByteBuffer buffer, byte i) {
		memberIndex = buffer.readUnsignedShort(1162222719) * -2141957959;
		buffer.readUnsignedByte((byte) -56);
		if (buffer.readUnsignedByte((byte) 84) != 255) {
			buffer.pointer -= -681042949;
			buffer.readLong((short) 22332);
		}
    }
    
    void method15093(RSByteBuffer class241_sub3) {
	memberIndex
	    = class241_sub3.readUnsignedShort(1162222719) * -2141957959;
	class241_sub3.readUnsignedByte((byte) -60);
	if (class241_sub3.readUnsignedByte((byte) -15) != 255) {
	    class241_sub3.pointer -= -681042949;
	    class241_sub3.readLong((short) 30018);
	}
    }
    
    void method15092(ClanChannel class241_sub6) {
	class241_sub6.doDeleteMember((-247548535
				   * memberIndex),
				  -1194376539);
    }
    
    void method15088(ClanChannel class241_sub6) {
	class241_sub6.doDeleteMember((-247548535
				   * memberIndex),
				  -1513363541);
    }
    
    void method15091(ClanChannel class241_sub6) {
	class241_sub6.doDeleteMember((-247548535
				   * memberIndex),
				  -1548212311);
    }
    
    static void method17439(int i, int i_0_) {
	Class241_Sub24_Sub2.anInt10899 = i * -1786395627;
	Class241_Sub24_Sub2.aClass241_Sub24_Sub2Array10898
	    = new Class241_Sub24_Sub2[i];
	HashTable.anInt5913 = 0;
    }
}
