/* Class334 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class334 implements Interface32
{
    public int anInt5062;
    
    Class334(int i) {
	anInt5062 = i * 1335938027;
    }
    
    public Class331 method183(int i) {
	return Class331.aClass331_5044;
    }
    
    public static Class334 method6065(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readBigSmart((byte) -67);
	return new Class334(i);
    }
    
    public Class331 method182() {
	return Class331.aClass331_5044;
    }
    
    public static Class334 method6066(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readBigSmart((byte) -17);
	return new Class334(i);
    }
    
    public Class331 method184() {
	return Class331.aClass331_5044;
    }
    
    static final int method6067(int i, int i_0_, int i_1_, int i_2_) {
	int i_3_ = i / i_1_;
	int i_4_ = i & i_1_ - 1;
	int i_5_ = i_0_ / i_1_;
	int i_6_ = i_0_ & i_1_ - 1;
	int i_7_ = Class572.method12550(i_3_, i_5_, 476598269);
	int i_8_ = Class572.method12550(1 + i_3_, i_5_, 476598269);
	int i_9_ = Class572.method12550(i_3_, i_5_ + 1, 476598269);
	int i_10_ = Class572.method12550(1 + i_3_, i_5_ + 1, 476598269);
	int i_11_
	    = Class120_Sub12.method16785(i_7_, i_8_, i_4_, i_1_, 1124332100);
	int i_12_
	    = Class120_Sub12.method16785(i_9_, i_10_, i_4_, i_1_, 663310043);
	return Class120_Sub12.method16785(i_11_, i_12_, i_6_, i_1_,
					  1882764720);
    }
    
    static String method6068(Class241_Sub39_Sub10 class241_sub39_sub10,
			     int i) {
	return new StringBuilder().append
		   (((Class241_Sub39_Sub10) class241_sub39_sub10).aString10865)
		   .append
		   (Class338.method6112(16777215, 503825151)).append
		   (" >").toString();
    }
    
    static final void method6069(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	Class120_Sub6.method16770(class58, class454, 1954224177);
    }
    
    static void method6070(ClientScriptData class454, int i) {
	Class480 class480 = (Class326_Sub3.aClass482_10288.method11010
			     ((((ClientScriptData) class454).integerStack
			       [(((ClientScriptData) class454).intStackPointer
				 -= 1736754263) * 1482319719]),
			      (short) 5382));
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (class480.anIntArrayArray6417 == null ? 0
	       : class480.anIntArrayArray6417.length);
    }
}
