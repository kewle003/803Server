/* Class241_Sub5_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CsDelta_SetName extends CsDeltaNode
{
    String clanName;//aString11051
    ClanSettingsDelta this$0;
    
    void method14870(ClanSettings class374) {
	class374.clanName = clanName;
    }
    
    void decode(RSByteBuffer buffer, byte i) {
		clanName = buffer.readString(-740204262);
		buffer.readInt((byte) 28);
    }
    
    CsDelta_SetName(ClanSettingsDelta delta) {
		this$0 = delta;
    }
    
    void applyToClanSettings(ClanSettings settings, byte i) {
		settings.clanName = clanName;
    }
    
    void method14869(RSByteBuffer class241_sub3) {
	clanName
	    = class241_sub3.readString(-1360075983);
	class241_sub3.readInt((byte) 50);
    }
    
    void method14868(ClanSettings class374) {
	class374.clanName = clanName;
    }
    
    void method14865(RSByteBuffer class241_sub3) {
	clanName
	    = class241_sub3.readString(-780606915);
	class241_sub3.readInt((byte) 67);
    }
    
    static final void method17448(String string, int i) {
	System.out.println(new StringBuilder().append("Error: ").append
			       (Class434_Sub3_Sub2.method17023(string, "%0a",
							       "\n",
							       -1952206973))
			       .toString());
    }
}
