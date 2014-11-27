/* Class241_Sub5_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CsDelta_SetVarLong extends CsDeltaNode
{
    ClanSettingsDelta this$0;
    long varValue;//aLong10984
    int varKey;//anInt10985
    
    void method14868(ClanSettings class374) {
	class374.setVarValueLong((1058539137
			     * varKey),
			    (418801298994427047L
			     * varValue));
    }
    
    void decode(RSByteBuffer buffer, byte i) {
		varKey = buffer.readInt((byte) 4) * -160286335;
		varValue = buffer.readLong((short) 28304) * -4465163900802993385L;
    }
    
    void applyToClanSettings(ClanSettings settings, byte i) {
		settings.setVarValueLong((1058539137 * varKey),
				(418801298994427047L * varValue));
    }
    
    void method14869(RSByteBuffer class241_sub3) {
	varKey
	    = class241_sub3.readInt((byte) 116) * -160286335;
	varValue
	    = class241_sub3.readLong((short) 21586) * -4465163900802993385L;
    }
    
    void method14870(ClanSettings class374) {
	class374.setVarValueLong((1058539137
			     * varKey),
			    (418801298994427047L
			     * varValue));
    }
    
    void method14865(RSByteBuffer class241_sub3) {
	varKey
	    = class241_sub3.readInt((byte) 80) * -160286335;
	varValue
	    = class241_sub3.readLong((short) 16501) * -4465163900802993385L;
    }
    
    CsDelta_SetVarLong(ClanSettingsDelta delta) {
		this$0 = delta;
    }
}
