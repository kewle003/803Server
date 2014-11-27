/* Class584 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class584
{
    static final int anInt7584 = 8;
    static final int anInt7585 = 2;
    static final int anInt7586 = 1;
    static final int anInt7587 = 16;
    static final int anInt7588 = 62;
    static final int anInt7589 = 63;
    
    Class584() throws Throwable {
	throw new Error();
    }
    
    public static void method12831(Class628_Sub1 class628_sub1, int i) {
	Class223.method4490(class628_sub1, -2145344553);
    }
    
    static final void method12832(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 645192277 * class58.anInt885;
    }
    
    static final void method12833(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [1482319719 * ((ClientScriptData) class454).intStackPointer - 1]
	    = (((ClientScriptData) class454).clanSettings.method6695(-1932203828)
	       [(((ClientScriptData) class454).integerStack
		 [1482319719 * ((ClientScriptData) class454).intStackPointer - 1])]);
    }
    
    static final void method12834(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	int i_1_ = Class241_Sub5_Sub9.aClass241_Sub9_11043
		       .aClass445_Sub6_8868.method14143(1857973454);
	if (i_0_ != i_1_) {
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub6_8868,
		 i_0_, (byte) 2);
	    Class167.method3600((short) -5445);
	    client.aBool8297 = false;
	}
    }
    
    static Class241_Sub34 method12835(int i, boolean bool, int i_2_) {
	long l = (long) (i | (bool ? -2147483648 : 0));
	return (Class241_Sub34) Class241_Sub34.aClass407_10083.get(l);
    }
}
