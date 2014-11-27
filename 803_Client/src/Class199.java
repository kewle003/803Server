/* Class199 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class199 implements Interface17
{
    protected int length;//anInt2384
    public static int anInt2385;
    
    Class199(GameDefinition class471, Language class437, int i) {
    	length = i * -634861149;
    }
    
    public static ChatLine method4039(int i, byte i_0_) {
    	return ((ChatLine) Class44.aClass407_609.get((long) i));
    }
    
    static void method4040(ClientScriptData class454, int i) {
	Class480 class480 = (Class326_Sub3.aClass482_10288.method11010
			     ((((ClientScriptData) class454).integerStack
			       [(((ClientScriptData) class454).intStackPointer
				 -= 1736754263) * 1482319719]),
			      (short) 13381));
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (class480.anIntArray6430 == null ? 0
	       : class480.anIntArray6430.length);
    }
    
    static final void method4041(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class92.method2070(class58, class35, class454, (byte) 1);
    }
    
    static final void method4042(ClientScriptData class454, int i) {
	if (!Class445_Sub16.aClass351_Sub1_8660.method6356(-1809403012)
		 .method1603((byte) 4))
	    throw new RuntimeException();
	Class434_Sub3 class434_sub3
	    = ((Class434_Sub3)
	       Class445_Sub16.aClass351_Sub1_8660.method6284((byte) 1));
	class434_sub3.method14081(Class43.aClass283_607, -1, 0.0F,
				  (short) 255);
	client.aBool8392 = true;
    }
    
    public static int method4043(int i, int i_1_, short i_2_) {
	int i_3_ = 0;
	for (/**/; i_1_ > 0; i_1_--) {
	    i_3_ = i_3_ << 1 | i & 0x1;
	    i >>>= 1;
	}
	return i_3_;
    }
    
    static final void dropClient/*method4044*/(int i) {
	if (Class523.method11733(client.anInt8288 * 1766317249, 1095241742)
	    || Class279_Sub1.method16640(1766317249 * client.anInt8288,
					 (byte) 101))
	    Class362_Sub1.gameLogout(false, 614223259);
	else {
	    Class120_Sub14.aClass563_10538
		= client.aClass190_8340.getIO(-1474060784);
	    client.aClass190_8340.method3886((short) 721);
	    Class496.setClientStage(4, (byte) -46);
	}
    }
    
    static void method4045(Class241_Sub16 class241_sub16, int i) {
	Class78.aClass351_Sub1_1133 = new Class351_Sub1(client.aClass25_8409);
	Class78.aClass351_Sub1_1133.method6257(Class43.aClass43_605,
					       170709369);
	try {
	    Class380_Sub1 class380_sub1
		= ((Class380_Sub1)
		   Class78.aClass351_Sub1_1133.method6267(Class39.aClass39_588,
							  false, -1519953607));
	    Class434_Sub2 class434_sub2
		= ((Class434_Sub2)
		   Class78.aClass351_Sub1_1133
		       .method6258(Class61.aClass61_1022, false, -758337122));
	    class380_sub1.method16656(class241_sub16, (byte) -34);
	    class434_sub2.method14070(new Class278(0.0F, 0.0F, 0.0F),
				      443507561);
	    Class78.aClass351_Sub1_1133.method6268
		(Class287.method5561(99999.0F, 99999.0F, 99999.0F), (byte) 3);
	    Class78.aClass351_Sub1_1133.method6264
		(Class287.method5561(Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY),
		 592420280);
	    Class78.aClass351_Sub1_1133.method6379
		(Class287.method5561(99999.0F, 99999.0F, 99999.0F),
		 (byte) 108);
	    Class78.aClass351_Sub1_1133.method6263
		(Class287.method5561(Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY),
		 (byte) -103);
	} catch (Exception_Sub5 exception_sub5) {
	    /* empty */
	}
	Class15.anInt133
	    = Class106.aClass580_1503.method12718(1678086113) * -1487514121;
	Class15.anInt134
	    = Class106.aClass580_1503.method12740((byte) -64) * 1790552107;
	Class15.aBool132 = true;
    }
}
