/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class2
{
    int anInt12;
    int anInt13;
    
    Class2() {
	/* empty */
    }
    
    static final void method455(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class58.anInt894 * -145726829;
    }
    
    static final void method456(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub15_8851,
	     i_0_, (byte) 2);
	Class167.method3600((short) -10195);
	client.aBool8297 = false;
    }
    
    static final void method457(ClientScriptData class454, int i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Character.toLowerCase((char) i_1_);
    }
    
    static void method458(int i) {
	if (Class470.aClass470_6339 != Class416.aClass470_6012)
	    JSFunction.aClass348_5365.method6212((byte) 0);
    }
    
    public static Class241_Sub16 method459(int i, int i_2_, int i_3_, int i_4_,
					   byte i_5_) {
	synchronized (Class241_Sub16.aClass241_Sub16Array8981) {
	    if (0 == -1956990347 * Class241_Sub16.anInt8980) {
		Class241_Sub16 class241_sub16
		    = new Class241_Sub16(i, i_2_, i_3_, i_4_);
		return class241_sub16;
	    }
	    Class241_Sub16.aClass241_Sub16Array8981
		[(Class241_Sub16.anInt8980 -= -1131147811) * -1956990347]
		.method15016(i, i_2_, i_3_, i_4_, -1331052719);
	    Class241_Sub16 class241_sub16
		= (Class241_Sub16.aClass241_Sub16Array8981
		   [Class241_Sub16.anInt8980 * -1956990347]);
	    return class241_sub16;
	}
    }
}
