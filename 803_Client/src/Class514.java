/* Class514 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class514
{
    public static Interface54 method11572(RSByteBuffer class241_sub3) {
	Class525 class525
	    = Class558.method12327(class241_sub3.readUnsignedByte((byte) -77),
				   (byte) 45);
	if (class525 == Class525.aClass525_6826)
	    return IncommingOpcode.method6124(class241_sub3, 855239162);
	if (class525 == Class525.aClass525_6824)
	    return JSFunction.method6226(class241_sub3, -2137006279);
	if (class525 == Class525.aClass525_6825)
	    return CS2MapList.method7513(class241_sub3, -1048133864);
	return null;
    }
    
    Class514() throws Throwable {
	throw new Error();
    }
    
    static final void method11573(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 1312476771 * ParamType.anInt7740;
    }
    
    static final void method11574(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).objectStackPointer -= 993556554;
	String string
	    = (String) (((ClientScriptData) class454).objectStack
			[-290357331 * ((ClientScriptData) class454).objectStackPointer]);
	String string_1_
	    = (String) (((ClientScriptData) class454).objectStack
			[((ClientScriptData) class454).objectStackPointer * -290357331 + 1]);
	if (string.length() <= 500 && string_1_.length() <= 500)
	    Class249.method5005(i_0_, string, string_1_, 1974095374);
    }
    
    static void method11575(ClientScriptData class454, int i) {
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = (Class326_Sub3.aClass482_10288.method11010
	       ((((ClientScriptData) class454).integerStack
		 [((ClientScriptData) class454).intStackPointer * 1482319719 - 2]),
		(short) 6390)
	       .aStringArray6433
	       [(((ClientScriptData) class454).integerStack
		 [((ClientScriptData) class454).intStackPointer * 1482319719 - 1])]);
	((ClientScriptData) class454).intStackPointer -= -821458770;
    }
    
    public static final void method11576(byte i) {
	int i_2_ = Class241_Sub5_Sub9.aClass241_Sub9_11043
		       .aClass445_Sub26_8870.method14352((byte) -40);
	if (0 == i_2_) {
	    client.aClass238_8477.method4812(null, (byte) -56);
	    Class597.method13114(0, -1515275335);
	} else if (1 == i_2_) {
	    Class620.method13339((byte) 0, -1946002540);
	    Class597.method13114(512, -1563742968);
	    if (client.aClass238_8477.method4751(-1318433392) != null)
		Class501.method11443(-1462032029);
	} else {
	    Class620.method13339((byte) (485246749 * client.anInt8407 - 4
					 & 0xff),
				 -1946002540);
	    Class597.method13114(2, -1429498526);
	}
	client.anInt8300 = Class357_Sub1.anInt10357 * 79877477;
    }
}
