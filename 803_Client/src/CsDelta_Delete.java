/* Class241_Sub5_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CsDelta_Delete extends CsDeltaNode
{
    ClanSettingsDelta this$0;
    int memberIndex;//anInt11006
    
    void method14870(ClanSettings class374) {
	class374.doDeleteMember((-2033568489
			     * memberIndex),
			    (byte) -50);
    }
    
    void decode(RSByteBuffer buffer, byte i) {
		memberIndex = buffer.readUnsignedShort(1162222719) * 1431982759;
    }
    
    void method14869(RSByteBuffer class241_sub3) {
	memberIndex
	    = class241_sub3.readUnsignedShort(1162222719) * 1431982759;
    }
    
    CsDelta_Delete(ClanSettingsDelta delta) {
		this$0 = delta;
		memberIndex = -1431982759;
    }
    
    void method14865(RSByteBuffer class241_sub3) {
	memberIndex
	    = class241_sub3.readUnsignedShort(1162222719) * 1431982759;
    }
    
    void method14868(ClanSettings class374) {
	class374.doDeleteMember((-2033568489
			     * memberIndex),
			    (byte) -87);
    }
    
    void applyToClanSettings(ClanSettings settings, byte i) {
		settings.doDeleteMember((-2033568489 * memberIndex), (byte) -79);
    }
}
