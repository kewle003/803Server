/* Class241_Sub5_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CsDelta_SetVarInt extends CsDeltaNode
{
    ClanSettingsDelta this$0;
    int varValue;//anInt11069
    int varKey;//anInt11070
    
    void method14869(RSByteBuffer class241_sub3) {
	varKey
	    = class241_sub3.readInt((byte) 27) * -752223015;
	varValue
	    = class241_sub3.readInt((byte) 101) * 214601347;
    }
    
    void decode(RSByteBuffer buffer, byte i) {
		varKey = buffer.readInt((byte) 106) * -752223015;
		varValue = buffer.readInt((byte) 86) * 214601347;
    }
    
    CsDelta_SetVarInt(ClanSettingsDelta delta) {
		this$0 = delta;
    }
    
    void applyToClanSettings(ClanSettings settings, byte i) {
		settings.setVarValueInt((-992033943 * varKey),
				(-2013220821 * varValue), -445202250);
    }
    
    void method14865(RSByteBuffer class241_sub3) {
	varKey
	    = class241_sub3.readInt((byte) 95) * -752223015;
	varValue
	    = class241_sub3.readInt((byte) 127) * 214601347;
    }
    
    void method14868(ClanSettings class374) {
	class374.setVarValueInt((-992033943
			     * varKey),
			    (-2013220821
			     * varValue),
			    -445202250);
    }
    
    void method14870(ClanSettings class374) {
	class374.setVarValueInt((-992033943
			     * varKey),
			    (-2013220821
			     * varValue),
			    -445202250);
    }
    
    public static SubIncommingOpcode[] method17454(int i) {
	return (new SubIncommingOpcode[]
		{ SubIncommingOpcode.aClass341_5303, SubIncommingOpcode.aClass341_5310,
		  SubIncommingOpcode.aClass341_5301, SubIncommingOpcode.aClass341_5302,
		  SubIncommingOpcode.aClass341_5306, SubIncommingOpcode.aClass341_5299,
		  SubIncommingOpcode.REMOVE_GROUND_ITEM, SubIncommingOpcode.PROJECTILE,
		  SubIncommingOpcode.aClass341_5307, SubIncommingOpcode.DESTROY_OBJECT,
		  SubIncommingOpcode.aClass341_5300, SubIncommingOpcode.aClass341_5308,
		  SubIncommingOpcode.SPAWN_OBJECT, SubIncommingOpcode.ADD_GROUND_ITEM,
		  SubIncommingOpcode.TILE_MESSAGE });
    }
}
