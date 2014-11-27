/* Class241_Sub5_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub5_Sub9 extends CsDeltaNode
{
    boolean aBool11041;
    ClanSettingsDelta this$0;
    int anInt11042;
    public static Class241_Sub9 aClass241_Sub9_11043;
    
    void applyToClanSettings(ClanSettings settings, byte i) {
		settings.method6678((anInt11042 * -870527053),
				aBool11041, 1617273027);
    }
    
    void decode(RSByteBuffer buffer, byte i) {
		anInt11042 = buffer.readUnsignedShort(1162222719) * -1577814149;
		aBool11041 = buffer.readUnsignedByte((byte) 0) == 1;
    }
    
    void method14870(ClanSettings class374) {
	class374.method6678((anInt11042
			     * -870527053),
			    aBool11041, 724171248);
    }
    
    void method14869(RSByteBuffer class241_sub3) {
	anInt11042
	    = class241_sub3.readUnsignedShort(1162222719) * -1577814149;
	aBool11041
	    = class241_sub3.readUnsignedByte((byte) -14) == 1;
    }
    
    void method14865(RSByteBuffer class241_sub3) {
	anInt11042
	    = class241_sub3.readUnsignedShort(1162222719) * -1577814149;
	aBool11041
	    = class241_sub3.readUnsignedByte((byte) -12) == 1;
    }
    
    void method14868(ClanSettings class374) {
	class374.method6678((anInt11042
			     * -870527053),
			    aBool11041,
			    1204882404);
    }
    
    Class241_Sub5_Sub9(ClanSettingsDelta delta) {
		this$0 = delta;
		anInt11042 = 1577814149;
    }
}
