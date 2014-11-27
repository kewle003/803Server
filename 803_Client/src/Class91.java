/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91
{
    static Class91 aClass91_1313;
    static Class91 aClass91_1314;
    static Class91 aClass91_1315;
    int anInt1316;
    static Class91 aClass91_1317 = new Class91(0);
    static Class91 aClass91_1318;
    static Class91 aClass91_1319;
    
    int method2062(int i) {
	if (aClass91_1317 == this)
	    return -1;
	return 0x1000000 | ((Class91) this).anInt1316 * 1930882045;
    }
    
    Class91(int i) {
	((Class91) this).anInt1316 = i * -2069706411;
    }
    
    static {
	aClass91_1314 = new Class91(3);
	aClass91_1315 = new Class91(5);
	aClass91_1319 = new Class91(4);
	aClass91_1313 = new Class91(1);
	aClass91_1318 = new Class91(2);
    }
    
    int method2063() {
	if (aClass91_1317 == this)
	    return -1;
	return 0x1000000 | ((Class91) this).anInt1316 * 1930882045;
    }
    
    int method2064() {
	if (aClass91_1317 == this)
	    return -1;
	return 0x1000000 | ((Class91) this).anInt1316 * 1930882045;
    }
    
    public static int method2065(int i, int i_0_, int i_1_, int i_2_) {
	i_1_ &= 0x3;
	if (i_1_ == 0)
	    return i_0_;
	if (1 == i_1_)
	    return 7 - i;
	if (2 == i_1_)
	    return 7 - i_0_;
	return i;
    }
    
    static final void method2066(ClientScriptData class454, int i) {
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_3_, (byte) -120);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 908888989 * class58.fontID;
    }
    
    static final void method2067(ClientScriptData class454, int i) {
	Class520.method11688(-2108287636);
    }
    
    static final void method2068(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 1583363705 * Class187.anInt2205;
    }
}
