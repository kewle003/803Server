/* Class262 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262
{
    public static final int anInt4276 = 40;
    public static final int anInt4277 = 35;
    public static final int anInt4278 = 17;
    public static final int anInt4279 = 10;
    public static final int anInt4280 = 6;
    public static final int anInt4281 = 9;
    public static final int anInt4282 = 29;
    public static final int anInt4283 = 3;
    public static final int anInt4284 = 15;
    public static final int anInt4285 = 41;
    public static final int anInt4286 = 39;
    public static final int anInt4287 = 25;
    public static final int anInt4288 = 28;
    static final int anInt4289 = 13;
    public static final int anInt4290 = 7;
    public static final int anInt4291 = 11;
    public static final int anInt4292 = 32;
    public static final int anInt4293 = 42;
    public static final int anInt4294 = 20;
    public static final int anInt4295 = 4;
    public static final int anInt4296 = 2;
    public static final int anInt4297 = 5;
    public static final int anInt4298 = 21;
    public static final int anInt4299 = 8;
    public static final int anInt4300 = 24;
    public static final int anInt4301 = 14;
    public static final int anInt4302 = 36;
    public static final int anInt4303 = 26;
    public static final int anInt4304 = 37;
    public static final int anInt4305 = 31;
    public static final int anInt4306 = 18;
    public static final int anInt4307 = 22;
    public static final int anInt4308 = 1;
    public static final int anInt4309 = 34;
    public static final int anInt4310 = 38;
    public static final int anInt4311 = 30;
    public static final int anInt4312 = 12;
    public static final int anInt4313 = 23;
    public static final int anInt4314 = 27;
    public static final int anInt4315 = 16;
    public static final int anInt4316 = 33;
    public static int anInt4317;
    
    Class262() throws Throwable {
	throw new Error();
    }
    
    public static GameShell3.Environment getEnvironment/*method5094*/(int i) {
    	return GameShell3.environment;
    }
    
    static final void method5095(ClientScriptData class454, short i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class241_Sub39_Sub12 class241_sub39_sub12
	    = Class573.method12651(i_0_ >> 14 & 0x3fff, i_0_ & 0x3fff);
	if (class241_sub39_sub12 == null)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class241_sub39_sub12.anInt10925 * 1100684019;
    }
    
    static void method5096(int i) {
	Class493.method11268(-1781729322);
	Class573_Sub1.aClass241_Sub39_Sub12_7405 = null;
	Class423.aClass241_Sub39_Sub12_6067 = null;
	Class573_Sub1.aClass407_8782.method7293(269921223);
	Class573_Sub1.aClass407_8788.method7293(860624201);
	for (int i_1_ = 0; i_1_ < 3; i_1_++) {
	    for (int i_2_ = 0; i_2_ < 5; i_2_++) {
		Class573_Sub1.aClass96ArrayArray8795[i_1_][i_2_] = null;
		Class573_Sub1.aClass639ArrayArray8784[i_1_][i_2_] = null;
	    }
	}
    }
    
    static final void method5097(ClientScriptData class454, byte i) {
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_3_, (byte) -57);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_3_ >> 16];
	Class122.method2982(class58, class35, class454, -1638489093);
    }
}
