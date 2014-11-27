/* Class296 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class296
{
    static Class296 aClass296_4506;
    static Class296 aClass296_4507;
    int anInt4508;
    static Class296 aClass296_4509;
    static Class296 aClass296_4510 = new Class296(2);
    static Class296 aClass296_4511;
    static Class296 aClass296_4512;
    public static int anInt4513;
    
    static {
	aClass296_4507 = new Class296(3);
	aClass296_4512 = new Class296(4);
	aClass296_4509 = new Class296(1);
	aClass296_4506 = new Class296(0);
	aClass296_4511 = new Class296(5);
    }
    
    Class296(int i) {
	((Class296) this).anInt4508 = -1347216017 * i;
    }
    
    public static boolean method5722(byte[] is, byte i) {
	RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	int i_0_ = class241_sub3.readUnsignedByte((byte) -96);
	if (i_0_ != 2)
	    return false;
	boolean bool = class241_sub3.readUnsignedByte((byte) 43) == 1;
	if (bool)
	    SkillData.method11326(class241_sub3, (short) -17719);
	Class52.method1289(class241_sub3, (byte) -22);
	return true;
    }
    
    static final void method5723(ClientScriptData class454, int i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_1_, (byte) -59);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_1_ >> 16];
	GameScene.method11720(class58, class35, class454, -6560082);
    }
    
    static final void method5724(ClientScriptData class454, byte i) {
	int i_2_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub46.method16585((char) i_2_, 242843484) ? 1 : 0;
    }
    
    static final void method5725(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub8_8856
		  .method14165(793958678);
    }
    
    static final void method5726(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class120_Sub18.aClass585_10604.method12840("jagtheora",
							 (byte) 0) ? 1 : 0;
    }
    
    public static String method5727(Object[] objects, int offset, int length, int i_4_) {
		if (length == 0) {
			return "";
		}
		if (length == 1) {
			CharSequence charsequence = (CharSequence) objects[offset];
			if (null == charsequence) {
				return "null";
			}
			return charsequence.toString();
		}
		int endpoint = offset + length;
		int stringLength = 0;
		for (int index = offset; index < endpoint; index++) {
			CharSequence charsequence = (CharSequence) objects[index];
			if (charsequence == null) {
				stringLength += 4;
			} else {
				stringLength += charsequence.length();
			}
		}
		StringBuilder stringbuilder = new StringBuilder(stringLength);
		for (int index = offset; index < endpoint; index++) {
			CharSequence charsequence = (CharSequence) objects[index];
			if (charsequence == null) {
				stringbuilder.append("null");
			} else {
				stringbuilder.append(charsequence);
			}
		}
		return stringbuilder.toString();
    }
}
