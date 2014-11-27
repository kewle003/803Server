/* Class241_Sub5_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CsDelta_DeleteBan extends CsDeltaNode
{
    ClanSettingsDelta this$0;
    static int anInt11056;
    int banIndex;//anInt11057
    
    void method14869(RSByteBuffer class241_sub3) {
	banIndex
	    = class241_sub3.readUnsignedShort(1162222719) * -621711025;
    }
    
    void decode(RSByteBuffer buffer, byte i) {
		banIndex = buffer.readUnsignedShort(1162222719) * -621711025;
    }
    
    void method14865(RSByteBuffer class241_sub3) {
	banIndex
	    = class241_sub3.readUnsignedShort(1162222719) * -621711025;
    }
    
    void applyToClanSettings(ClanSettings settings, byte i) {
		settings.doDeleteBan((banIndex * -2060253777), -1436062678);
    }
    
    void method14868(ClanSettings class374) {
	class374.doDeleteBan((banIndex
			     * -2060253777),
			    -1244046477);
    }
    
    CsDelta_DeleteBan(ClanSettingsDelta delta) {
		this$0 = delta;
		banIndex = 621711025;
    }
    
    void method14870(ClanSettings class374) {
	class374.doDeleteBan((banIndex
			     * -2060253777),
			    -1894340461);
    }
}
