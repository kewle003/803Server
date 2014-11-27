/* Class330 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330
{
    static Class330 aClass330_5033 = new Class330();
    static Class330 aClass330_5034 = new Class330();
    static Class330 aClass330_5035 = new Class330();
    
    public int method6030(int i, int i_0_) {
	int i_1_ = (-1080559003 * Class494.canvasWid > i_0_
		    ? Class494.canvasWid * -1080559003 : i_0_);
	if (this == aClass330_5033)
	    return 0;
	if (this == aClass330_5035)
	    return i_1_ - i;
	if (this == aClass330_5034)
	    return (i_1_ - i) / 2;
	return 0;
    }
    
    public int method6031(int i, int i_2_, int i_3_) {
	int i_4_ = (-1080559003 * Class494.canvasWid > i_2_
		    ? Class494.canvasWid * -1080559003 : i_2_);
	if (this == aClass330_5033)
	    return 0;
	if (this == aClass330_5035)
	    return i_4_ - i;
	if (this == aClass330_5034)
	    return (i_4_ - i) / 2;
	return 0;
    }
    
    Class330() {
	/* empty */
    }
    
    public static Class330[] method6032() {
	return (new Class330[]
		{ aClass330_5033, aClass330_5034, aClass330_5035 });
    }
    
    public static Class330[] method6033() {
	return (new Class330[]
		{ aClass330_5033, aClass330_5034, aClass330_5035 });
    }
    
    public int method6034(int i, int i_5_) {
	int i_6_ = (-1080559003 * Class494.canvasWid > i_5_
		    ? Class494.canvasWid * -1080559003 : i_5_);
	if (this == aClass330_5033)
	    return 0;
	if (this == aClass330_5035)
	    return i_6_ - i;
	if (this == aClass330_5034)
	    return (i_6_ - i) / 2;
	return 0;
    }
    
    static boolean method6035(String string, int i, int i_7_) {
	return Class68.method1676(string, i, "openjs", 323901689);
    }
    
    public static void method6036(Class241_Sub24 class241_sub24, int i) {
	if (!Class120_Sub1.method15109(client.anInt8288 * 1766317249,
				       1985901933))
	    class241_sub24.method15070(-55066463);
	else
	    Class484.aClass464_Sub1_6463.method10683(class241_sub24,
						     -84456669);
    }
    
    static final void method6037(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_8_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	boolean bool
	    = 1 == (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	Class520.method11689(i_8_, bool, 1474738091);
    }
}
