/* Class335 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class335 implements Interface47
{
    static Class335 aClass335_5063;
    static Class335 aClass335_5064;
    static Class335 aClass335_5065;
    static Class335 aClass335_5066;
    static Class335 aClass335_5067;
    static Class335 aClass335_5068;
    static Class335 aClass335_5069;
    static Class335 aClass335_5070;
    static Class335 aClass335_5071;
    static Class335 aClass335_5072;
    static Class335 aClass335_5073 = new Class335(1, 1);
    static Class335 aClass335_5074;
    static Class335 aClass335_5075;
    int anInt5076;
    int anInt5077;
    
    static Class335[] method6071() {
	return new Class335[] { aClass335_5069, aClass335_5063, aClass335_5073,
				aClass335_5071, aClass335_5066, aClass335_5074,
				aClass335_5067, aClass335_5068, aClass335_5075,
				aClass335_5065, aClass335_5064, aClass335_5072,
				aClass335_5070 };
    }
    
    public int method10() {
	return ((Class335) this).anInt5077 * -912083617;
    }
    
    public int getId(byte i) {
	return ((Class335) this).anInt5077 * -912083617;
    }
    
    public int method9() {
	return ((Class335) this).anInt5077 * -912083617;
    }
    
    Class335(int i, int i_0_) {
	((Class335) this).anInt5076 = i * -942721845;
	((Class335) this).anInt5077 = i_0_ * -1111300449;
    }
    
    public int method11() {
	return ((Class335) this).anInt5077 * -912083617;
    }
    
    public int method147() {
	return ((Class335) this).anInt5077 * -912083617;
    }
    
    static Class335[] method6072() {
	return new Class335[] { aClass335_5069, aClass335_5063, aClass335_5073,
				aClass335_5071, aClass335_5066, aClass335_5074,
				aClass335_5067, aClass335_5068, aClass335_5075,
				aClass335_5065, aClass335_5064, aClass335_5072,
				aClass335_5070 };
    }
    
    static {
		aClass335_5064 = new Class335(10, 2);
		aClass335_5065 = new Class335(7, 3);
		aClass335_5066 = new Class335(3, 4);
		aClass335_5067 = new Class335(4, 5);
		aClass335_5063 = new Class335(2, 6);
		aClass335_5069 = new Class335(6, 7);
		aClass335_5070 = new Class335(12, 8);
		aClass335_5072 = new Class335(0, 9);
		aClass335_5068 = new Class335(9, 10);
		aClass335_5071 = new Class335(8, 11);
		aClass335_5074 = new Class335(5, 12);
		aClass335_5075 = new Class335(11, 13);
    }
    
    public static void method6073
	(float f, Class287 class287, Class287 class287_1_,
	 Class287 class287_2_, Class287 class287_3_, Class287 class287_4_,
	 float f_5_, float f_6_, float f_7_, float f_8_, byte i) {
	if (!class287_1_.method5601(class287)) {
	    Class287 class287_9_ = Class287.method5578(class287_1_, class287);
	    float f_10_ = class287_9_.method5559();
	    if (f_5_ > 0.0F) {
		class287_3_ = Class287.method5562(class287_3_);
		class287_3_.method5587(f_10_ / f_5_ * f_6_);
	    }
	    if (class287_3_.aFloat4477 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class287.aFloat4477) || f_10_ > f_7_) {
		class287.method5655(class287_1_);
		class287_2_.method5645();
	    } else {
		Class287 class287_11_ = Class287.method5562(class287_2_);
		class287_11_.method5584();
		Class287 class287_12_
		    = Class287.method5589(class287_11_, class287_3_);
		Class287 class287_13_
		    = Class287.method5586(class287_11_, class287_12_);
		class287_13_.method5587(0.5F);
		Class287 class287_14_ = Class287.method5562(class287_2_);
		Class287 class287_15_ = Class287.method5562(class287_9_);
		class287_15_.method5584();
		if (class287_13_.aFloat4477 > class287_15_.aFloat4477) {
		    if (class287_9_.aFloat4477 < 0.0F) {
			class287_14_.aFloat4477 += f * class287_3_.aFloat4477;
			if (class287_14_.aFloat4477 > 0.0F)
			    class287_14_.aFloat4477 = 0.0F;
		    } else {
			class287_14_.aFloat4477 -= class287_3_.aFloat4477 * f;
			if (class287_14_.aFloat4477 < 0.0F)
			    class287_14_.aFloat4477 = 0.0F;
		    }
		} else if (class287_11_.aFloat4477 < class287_4_.aFloat4477) {
		    if (class287_9_.aFloat4477 < 0.0F) {
			class287_14_.aFloat4477 -= f * class287_3_.aFloat4477;
			if (class287_14_.aFloat4477 < -class287_4_.aFloat4477)
			    class287_14_.aFloat4477 = -class287_4_.aFloat4477;
		    } else {
			class287_14_.aFloat4477 += class287_3_.aFloat4477 * f;
			if (class287_14_.aFloat4477 > class287_4_.aFloat4477)
			    class287_14_.aFloat4477 = class287_4_.aFloat4477;
		    }
		}
		if (class287_13_.aFloat4474 > class287_15_.aFloat4474) {
		    if (class287_9_.aFloat4474 < 0.0F) {
			class287_14_.aFloat4474 += class287_3_.aFloat4474 * f;
			if (class287_14_.aFloat4474 > 0.0F)
			    class287_14_.aFloat4474 = 0.0F;
		    } else {
			class287_14_.aFloat4474 -= f * class287_3_.aFloat4474;
			if (class287_14_.aFloat4474 < 0.0F)
			    class287_14_.aFloat4474 = 0.0F;
		    }
		} else if (class287_11_.aFloat4474 < class287_4_.aFloat4474) {
		    if (class287_9_.aFloat4474 < 0.0F) {
			class287_14_.aFloat4474 -= class287_3_.aFloat4474 * f;
			if (class287_14_.aFloat4474 < -class287_4_.aFloat4474)
			    class287_14_.aFloat4474 = -class287_4_.aFloat4474;
		    } else {
			class287_14_.aFloat4474 += f * class287_3_.aFloat4474;
			if (class287_14_.aFloat4474 > class287_4_.aFloat4474)
			    class287_14_.aFloat4474 = class287_4_.aFloat4474;
		    }
		}
		if (class287_13_.aFloat4479 > class287_15_.aFloat4479) {
		    if (class287_9_.aFloat4479 < 0.0F) {
			class287_14_.aFloat4479 += class287_3_.aFloat4479 * f;
			if (class287_14_.aFloat4479 > 0.0F)
			    class287_14_.aFloat4479 = 0.0F;
		    } else {
			class287_14_.aFloat4479 -= f * class287_3_.aFloat4479;
			if (class287_14_.aFloat4479 < 0.0F)
			    class287_14_.aFloat4479 = 0.0F;
		    }
		} else if (class287_11_.aFloat4479 < class287_4_.aFloat4479) {
		    if (class287_9_.aFloat4479 < 0.0F) {
			class287_14_.aFloat4479 -= f * class287_3_.aFloat4479;
			if (class287_14_.aFloat4479 < -class287_4_.aFloat4479)
			    class287_14_.aFloat4479 = -class287_4_.aFloat4479;
		    } else {
			class287_14_.aFloat4479 += class287_3_.aFloat4479 * f;
			if (class287_14_.aFloat4479 > class287_4_.aFloat4479)
			    class287_14_.aFloat4479 = class287_4_.aFloat4479;
		    }
		}
		class287_2_.method5595(class287_14_, 0.8F);
		if (f_10_ < f_8_ && class287_2_.method5559() < f_8_) {
		    class287.method5655(class287_1_);
		    class287_2_.method5645();
		} else
		    class287.method5574(Class287.method5591(class287_2_, f));
		class287_11_.method5564();
		class287_14_.method5564();
		class287_15_.method5564();
	    }
	}
    }
    
    static final void method6074(ClientScriptData class454, byte i) {
	throw new RuntimeException("");
    }
    
    static final void method6075(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_16_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	float f = Class282.method5490(((ClientScriptData) class454).integerStack
				      [1 + (((ClientScriptData) class454).intStackPointer
					    * 1482319719)]);
	Class241_Sub39_Sub6 class241_sub39_sub6
	    = Class445_Sub16.aClass351_Sub1_8660.method6287(i_16_,
							    -2057625155);
	if (class241_sub39_sub6 == null)
	    throw new RuntimeException("");
	if (!(class241_sub39_sub6 instanceof Class241_Sub39_Sub6_Sub2))
	    throw new RuntimeException("");
	((Class241_Sub39_Sub6_Sub2) class241_sub39_sub6)
	    .method17883(f, -321739787);
    }
    
    static final void method6076(ClientScriptData class454, int i) {
	Class507_Sub1 class507_sub1 = Class510.method11528(1912420869);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = null == class507_sub1 ? 0 : 2058706651 * class507_sub1.anInt6664;
    }
    
    static final void method6077(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_17_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_18_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	int i_19_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer + 2]);
	Class581.processActionButton(2, i_17_ << 16 | i_18_, i_19_, "", -117627486);
    }
}
