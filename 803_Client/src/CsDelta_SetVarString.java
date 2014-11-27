/* Class241_Sub5_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CsDelta_SetVarString extends CsDeltaNode
{
    ClanSettingsDelta this$0;
    String varValue;//aString10988
    int varKey;//anInt10989
    
    void method14865(RSByteBuffer class241_sub3) {
	varKey
	    = class241_sub3.readInt((byte) 56) * -504737865;
	varValue
	    = class241_sub3.readString(1172064362);
    }
    
    void decode(RSByteBuffer buffer, byte i) {
		varKey = buffer.readInt((byte) 22) * -504737865;
		varValue = buffer.readString(-1166080457);
    }
    
    void applyToClanSettings(ClanSettings settings, byte i) {
		settings.setVarValueString(335724039 * varKey, 
				varValue, 1096909856);
    }
    
    void method14869(RSByteBuffer class241_sub3) {
	varKey
	    = class241_sub3.readInt((byte) 39) * -504737865;
	varValue
	    = class241_sub3.readString(1109976071);
    }
    
    CsDelta_SetVarString(ClanSettingsDelta delta) {
		this$0 = delta;
    }
    
    void method14868(ClanSettings class374) {
	class374.setVarValueString(335724039 * varKey,
			    varValue,
			    1159786325);
    }
    
    void method14870(ClanSettings class374) {
	class374.setVarValueString(335724039 * varKey,
			    varValue,
			    81722857);
    }
}
