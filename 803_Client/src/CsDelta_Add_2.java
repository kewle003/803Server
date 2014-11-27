/* Class241_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CsDelta_Add_2 extends CsDeltaNode
{
    ClanSettingsDelta this$0;
    long userHash;//aLong10981
    int joinDay;//anInt10982
    String displayName;//aString10983
    
    void applyToClanSettings(ClanSettings settings, byte i) {
		settings.doAddMember((8628312389577322479L * userHash),
			    displayName, (1454784711 * joinDay), 889562053);
    }
    
    CsDelta_Add_2(ClanSettingsDelta class378) {
		this$0 = class378;
		userHash = -3932148047015403279L;
		displayName = null;
		joinDay = 0;
    }
    
    void method14869(RSByteBuffer class241_sub3) {
	if (class241_sub3.readUnsignedByte((byte) 37) != 255) {
	    class241_sub3.pointer -= -681042949;
	    userHash
		= (class241_sub3.readLong((short) 12864)
		   * 3932148047015403279L);
	}
	displayName
	    = class241_sub3.readNullString(-1597272016);
	joinDay
	    = class241_sub3.readUnsignedShort(1162222719) * -535002889;
    }
    
    void method14865(RSByteBuffer class241_sub3) {
	if (class241_sub3.readUnsignedByte((byte) 49) != 255) {
	    class241_sub3.pointer -= -681042949;
	    userHash
		= (class241_sub3.readLong((short) 29415)
		   * 3932148047015403279L);
	}
	displayName
	    = class241_sub3.readNullString(870708099);
	joinDay
	    = class241_sub3.readUnsignedShort(1162222719) * -535002889;
    }
    
    void decode(RSByteBuffer buffer, byte i) {
		if (buffer.readUnsignedByte((byte) 2) != 255) {
			buffer.pointer -= -681042949;
			userHash = (buffer.readLong((short) 10980) * 3932148047015403279L);
		}
		displayName = buffer.readNullString(-279748398);
		joinDay = buffer.readUnsignedShort(1162222719) * -535002889;
    }
    
    void method14868(ClanSettings class374) {
	class374.doAddMember((8628312389577322479L
			     * userHash),
			    displayName,
			    (1454784711
			     * joinDay),
			    889562053);
    }
    
    void method14870(ClanSettings class374) {
	class374.doAddMember((8628312389577322479L
			     * userHash),
			    displayName,
			    (1454784711
			     * joinDay),
			    889562053);
    }
}
