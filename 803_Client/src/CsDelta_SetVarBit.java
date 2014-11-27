/* Class241_Sub5_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CsDelta_SetVarBit extends CsDeltaNode
{
    ClanSettingsDelta this$0;
    int varKey;//anInt10993
    int endBit;//anInt10994
    int varValue;//anInt10995
    int startBit;//anInt10996
    
    void method14865(RSByteBuffer class241_sub3) {
	varKey
	    = class241_sub3.readInt((byte) 52) * 801851911;
	varValue
	    = class241_sub3.readInt((byte) 83) * 1314282039;
	startBit
	    = class241_sub3.readUnsignedByte((byte) -86) * -1823999;
	endBit
	    = class241_sub3.readUnsignedByte((byte) 72) * 421841875;
    }
    
    void method14869(RSByteBuffer class241_sub3) {
	varKey
	    = class241_sub3.readInt((byte) 84) * 801851911;
	varValue
	    = class241_sub3.readInt((byte) 4) * 1314282039;
	startBit
	    = class241_sub3.readUnsignedByte((byte) -20) * -1823999;
	endBit
	    = class241_sub3.readUnsignedByte((byte) -31) * 421841875;
    }
    
    void applyToClanSettings(ClanSettings settings, byte i) {
		settings.setVarBitValue(967836599 * varKey,
				(varValue * 1590852487),
			    startBit * 206886145, (endBit * -135609253), 486825310);
    }
    
    void decode(RSByteBuffer buffer, byte i) {
		varKey = buffer.readInt((byte) 115) * 801851911;
		varValue = buffer.readInt((byte) 34) * 1314282039;
		startBit = buffer.readUnsignedByte((byte) 36) * -1823999;
		endBit = buffer.readUnsignedByte((byte) 62) * 421841875;
    }
    
    CsDelta_SetVarBit(ClanSettingsDelta delta) {
		this$0 = delta;
    }
    
    void method14868(ClanSettings class374) {
	class374.setVarBitValue(967836599 * varKey,
			    (varValue
			     * 1590852487),
			    startBit * 206886145,
			    (endBit
			     * -135609253),
			    1155730241);
    }
    
    void method14870(ClanSettings class374) {
	class374.setVarBitValue(967836599 * varKey,
			    (varValue
			     * 1590852487),
			    startBit * 206886145,
			    (endBit
			     * -135609253),
			    49829726);
    }
}
