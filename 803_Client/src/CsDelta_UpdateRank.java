/* Class241_Sub5_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CsDelta_UpdateRank extends CsDeltaNode
{
    ClanSettingsDelta this$0;
    int memberIndex;//anInt11004
    byte rank;//aByte11005
    
    void decode(RSByteBuffer buffer, byte i) {
		memberIndex = buffer.readUnsignedShort(1162222719) * 158573693;
		rank = buffer.getByte(1470854658);
    }
    
    void method14868(ClanSettings class374) {
	class374.doUpdateRank((-1495927595
			     * memberIndex),
			    rank, (byte) 16);
    }
    
    void applyToClanSettings(ClanSettings settings, byte i) {
		settings.doUpdateRank((-1495927595 * memberIndex),
				rank, (byte) 16);
    }
    
    void method14865(RSByteBuffer class241_sub3) {
	memberIndex
	    = class241_sub3.readUnsignedShort(1162222719) * 158573693;
	rank
	    = class241_sub3.getByte(1365301545);
    }
    
    CsDelta_UpdateRank(ClanSettingsDelta delta) {
		this$0 = delta;
		memberIndex = -158573693;
    }
    
    void method14869(RSByteBuffer class241_sub3) {
	memberIndex
	    = class241_sub3.readUnsignedShort(1162222719) * 158573693;
	rank
	    = class241_sub3.getByte(-1630858253);
    }
    
    void method14870(ClanSettings class374) {
	class374.doUpdateRank((-1495927595
			     * memberIndex),
			    rank, (byte) 16);
    }
}
