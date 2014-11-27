/* Class270 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class270 implements Interface64
{
    String aString4357;
    JS5 aClass210_4358;
    public static int anInt4359;
    
    Class270(JS5 class210, String string) {
	((Class270) this).aClass210_4358 = class210;
	((Class270) this).aString4357 = string;
    }
    
    public int method146(byte i) {
	if (((Class270) this).aClass210_4358
		.method4257(((Class270) this).aString4357, (byte) -22))
	    return 100;
	return 0;
    }
    
    public Class632 method449() {
	return Class632.aClass632_8055;
    }
    
    public int method447() {
	if (((Class270) this).aClass210_4358
		.method4257(((Class270) this).aString4357, (byte) -25))
	    return 100;
	return 0;
    }
    
    public Class632 method448() {
	return Class632.aClass632_8055;
    }
    
    public Class632 method446(byte i) {
	return Class632.aClass632_8055;
    }
    
    public Class632 method450() {
	return Class632.aClass632_8055;
    }
    
    public static int method5299(int i, byte i_0_) {
	ChatLine class241_sub39_sub4
	    = (ChatLine) Class44.aClass407_609.get((long) i);
	if (class241_sub39_sub4 == null)
	    return -1;
	if (class241_sub39_sub4.aClass241_Sub39_10148
	    == Class44.aClass410_611.aClass241_Sub39_5934)
	    return -1;
	return (608603855
		* ((ChatLine)
		   class241_sub39_sub4.aClass241_Sub39_10148).anInt10834);
    }
    
    static final void method5300(ClientScriptData class454, int i) {
	if (0 != -1018886827 * ((ClientScriptData) class454).anInt6227) {
	    Class466 class466 = (((ClientScriptData) class454).aClass466Array6228
				 [(((ClientScriptData) class454).anInt6227
				   -= 2140327933) * -1018886827]);
	    ((ClientScriptData) class454).script
		= ((Class466) class466).aClass241_Sub39_Sub1_6315;
	    ((ClientScriptData) class454).actions
		= (((ClientScriptData) class454).script
		   .actions);
	    ((ClientScriptData) class454).integerConstants
		= (((ClientScriptData) class454).script
		   .integerConstants);
	    ((ClientScriptData) class454).step
		= 1656665189 * ((Class466) class466).anInt6314;
	    ((ClientScriptData) class454).integerVariables
		= ((Class466) class466).anIntArray6316;
	    ((ClientScriptData) class454).objectValues
		= ((Class466) class466).anObjectArray6313;
	    ((ClientScriptData) class454).aLongArray6222
		= ((Class466) class466).aLongArray6317;
	}
    }
    
    static final void method5301(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = -650103683 * Class77.anInt1131;
    }
    
    static final void method5302(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class69.method1680(class58, class35, class454, 2114195555);
    }
    
    public static void method5303(int i, int i_1_, boolean bool, byte i_2_) {
	if (Class447.aClass407_6181.get((long) i) == null) {
	    if (!ObjectDefinition.aclient6907.aBool7647)
		Class445_Sub24.method14343(i, bool, (byte) -14);
	    else {
		Class241_Sub10 class241_sub10
		    = new Class241_Sub10(i, new Class583_Sub1(4096,
							      (SoundManager
							       .aClass210_672),
							      i), i_1_, bool);
		((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
		    .method12820
		    (VarPlayerDomain.currentLocale.method7802((byte) -70),
		     1431740522);
		Class447.aClass407_6181.put(class241_sub10, (long) i);
	    }
	}
    }
    
    static final void method5304(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, byte i) {
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (1104105953 * InterfaceComponent.anInt819 == i_3_
	    || i_3_ == 1928011005 * InterfaceComponent.anInt810
	    || 1063093221 * InterfaceComponent.anInt967 == i_3_
	    || i_3_ == InterfaceComponent.anInt812 * -116029789)
	    class58.anInt941 = -57814249 * i_3_;
    }
}
