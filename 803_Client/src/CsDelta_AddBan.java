/* Class241_Sub5_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CsDelta_AddBan extends CsDeltaNode
{
    String displayName;//aString10986
    long userHash;//aLong10987
    ClanSettingsDelta this$0;
    
    void method14869(RSByteBuffer class241_sub3) {
	if (class241_sub3.readUnsignedByte((byte) -8) != 255) {
	    class241_sub3.pointer -= -681042949;
	    userHash
		= (class241_sub3.readLong((short) 2020)
		   * -8227476798116553535L);
	}
	displayName
	    = class241_sub3.readNullString(-2133507648);
    }
    
    void method14868(ClanSettings class374) {
	class374.doAddBan((userHash
			     * 4576554353100321601L),
			    displayName,
			    -681042949);
    }
    
    void applyToClanSettings(ClanSettings settings, byte i) {
		settings.doAddBan((userHash * 4576554353100321601L), displayName, -681042949);
    }
    
    void method14870(ClanSettings class374) {
	class374.doAddBan((userHash
			     * 4576554353100321601L),
			    displayName,
			    -681042949);
    }
    
    void method14865(RSByteBuffer class241_sub3) {
	if (class241_sub3.readUnsignedByte((byte) 14) != 255) {
	    class241_sub3.pointer -= -681042949;
	    userHash
		= (class241_sub3.readLong((short) 19877)
		   * -8227476798116553535L);
	}
	displayName
	    = class241_sub3.readNullString(-955254548);
    }
    
    CsDelta_AddBan(ClanSettingsDelta delta) {
		this$0 = delta;
		userHash = 8227476798116553535L;
		displayName = null;
    }
    
    void decode(RSByteBuffer buffer, byte i) {
		if (buffer.readUnsignedByte((byte) 50) != 255) {
			buffer.pointer -= -681042949;
			userHash = (buffer.readLong((short) 27026) * -8227476798116553535L);
		}
		displayName = buffer.readNullString(1505409263);
    }
}
