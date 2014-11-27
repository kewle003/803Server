/* Class241_Sub5_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CsDelta_Add extends CsDeltaNode
{
    ClanSettingsDelta this$0;
    long memberHash;//aLong10990
    String displayName;//aString10991
    
    void method14865(RSByteBuffer class241_sub3) {
	if (class241_sub3.readUnsignedByte((byte) 79) != 255) {
	    class241_sub3.pointer -= -681042949;
	    memberHash
		= (class241_sub3.readLong((short) 9250)
		   * -3116137686471304925L);
	}
	displayName
	    = class241_sub3.readNullString(-389323689);
    }
    
    void decode(RSByteBuffer buffer, byte i) {
		if (buffer.readUnsignedByte((byte) -35) != 255) {
			buffer.pointer -= -681042949;
			memberHash = (buffer.readLong((short) 14598) * -3116137686471304925L);
		}
		displayName = buffer.readNullString(-890984055);
    }
    
    void applyToClanSettings(ClanSettings settings, byte i) {
		settings.doAddMember((-604402613062771061L * memberHash),
				displayName, 0, 889562053);
    }
    
    CsDelta_Add(ClanSettingsDelta delta) {
		this$0 = delta;
		memberHash = 3116137686471304925L;
		displayName = null;
    }
    
    void method14869(RSByteBuffer class241_sub3) {
	if (class241_sub3.readUnsignedByte((byte) -19) != 255) {
	    class241_sub3.pointer -= -681042949;
	    memberHash
		= (class241_sub3.readLong((short) 25363)
		   * -3116137686471304925L);
	}
	displayName
	    = class241_sub3.readNullString(1570872896);
    }
    
    void method14868(ClanSettings class374) {
	class374.doAddMember((-604402613062771061L
			     * memberHash),
			    displayName, 0,
			    889562053);
    }
    
    void method14870(ClanSettings class374) {
	class374.doAddMember((-604402613062771061L
			     * memberHash),
			    displayName, 0,
			    889562053);
    }
    
    public static int method17423(int i, int i_0_, int i_1_, int i_2_) {
	int i_3_ = 255 - i_1_;
	i_0_ = (i_1_ * (i_0_ & 0xff00ff) & ~0xff00ff
		| i_1_ * (i_0_ & 0xff00) & 0xff0000) >>> 8;
	return (((i_3_ * (i & 0xff00ff) & ~0xff00ff
		  | (i & 0xff00) * i_3_ & 0xff0000)
		 >>> 8)
		+ i_0_);
    }
}
