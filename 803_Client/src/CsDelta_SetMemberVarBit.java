/* Class241_Sub5_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CsDelta_SetMemberVarBit extends CsDeltaNode
{
    int endBit;//anInt11046
    int value;//anInt11047
    int startBit;//anInt11048
    int memberIndex;//anInt11049
    ClanSettingsDelta this$0;
    
    void method14870(ClanSettings class374) {
	class374.setVarMemberBit
	    (730398247 * memberIndex,
	     value * 853235105,
	     startBit * -556589877,
	     1175146791 * endBit,
	     -1636894100);
    }
    
    void decode(RSByteBuffer buffer, byte i) {
		memberIndex = buffer.readUnsignedShort(1162222719) * -124612201;
		value = buffer.readInt((byte) 123) * 1356713569;
		startBit = buffer.readUnsignedByte((byte) -27) * 619800803;
		endBit = buffer.readUnsignedByte((byte) -73) * 1608846999;
    }
    
    void method14865(RSByteBuffer class241_sub3) {
	memberIndex
	    = class241_sub3.readUnsignedShort(1162222719) * -124612201;
	value
	    = class241_sub3.readInt((byte) 122) * 1356713569;
	startBit
	    = class241_sub3.readUnsignedByte((byte) -7) * 619800803;
	endBit
	    = class241_sub3.readUnsignedByte((byte) -1) * 1608846999;
    }
    
    void method14869(RSByteBuffer class241_sub3) {
	memberIndex
	    = class241_sub3.readUnsignedShort(1162222719) * -124612201;
	value
	    = class241_sub3.readInt((byte) 107) * 1356713569;
	startBit
	    = class241_sub3.readUnsignedByte((byte) -7) * 619800803;
	endBit
	    = class241_sub3.readUnsignedByte((byte) 38) * 1608846999;
    }
    
    void applyToClanSettings(ClanSettings settings, byte i) {
		settings.setVarMemberBit(730398247 * memberIndex,
				value * 853235105, startBit * -556589877,
				1175146791 * endBit, -1636894100);
    }
    
    void method14868(ClanSettings class374) {
	class374.setVarMemberBit
	    (730398247 * memberIndex,
	     value * 853235105,
	     startBit * -556589877,
	     1175146791 * endBit,
	     -1636894100);
    }
    
    CsDelta_SetMemberVarBit(ClanSettingsDelta delta) {
		this$0 = delta;
		memberIndex = 124612201;
    }
    
    public static void method17443(int i, byte i_0_) {
	Class241_Sub39_Sub13 class241_sub39_sub13
	    = NPC.method18030(13, (long) i);
	class241_sub39_sub13.method17278((byte) -2);
    }
    
    static boolean method17444(int i) {
	if (null != client.aByteArray8273)
	    return Class46.method1124((byte) 46);
	if (Class13.anInt81 * 1391949991 != -1)
	    return Class322.method5953(1642286182);
	return Class565.method12433(Class13.aString112, Class13.aString113,
				    270315418);
    }
}
