/* Class545 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class545
{
    static int anInt7050;
    
    public static void method11986
	(float f, Class287 class287, Class287 class287_0_,
	 Class287 class287_1_, Class287 class287_2_, Class287 class287_3_,
	 float f_4_, float f_5_, float f_6_, float f_7_) {
	if (!class287_0_.method5601(class287)) {
	    Class287 class287_8_ = Class287.method5578(class287_0_, class287);
	    float f_9_ = class287_8_.method5559();
	    if (f_4_ > 0.0F) {
		class287_2_ = Class287.method5562(class287_2_);
		class287_2_.method5587(f_9_ / f_4_ * f_5_);
	    }
	    if (class287_2_.aFloat4477 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class287.aFloat4477) || f_9_ > f_6_) {
		class287.method5655(class287_0_);
		class287_1_.method5645();
	    } else {
		Class287 class287_10_ = Class287.method5562(class287_1_);
		class287_10_.method5584();
		Class287 class287_11_
		    = Class287.method5589(class287_10_, class287_2_);
		Class287 class287_12_
		    = Class287.method5586(class287_10_, class287_11_);
		class287_12_.method5587(0.5F);
		Class287 class287_13_ = Class287.method5562(class287_1_);
		Class287 class287_14_ = Class287.method5562(class287_8_);
		class287_14_.method5584();
		if (class287_12_.aFloat4477 > class287_14_.aFloat4477) {
		    if (class287_8_.aFloat4477 < 0.0F) {
			class287_13_.aFloat4477 += f * class287_2_.aFloat4477;
			if (class287_13_.aFloat4477 > 0.0F)
			    class287_13_.aFloat4477 = 0.0F;
		    } else {
			class287_13_.aFloat4477 -= class287_2_.aFloat4477 * f;
			if (class287_13_.aFloat4477 < 0.0F)
			    class287_13_.aFloat4477 = 0.0F;
		    }
		} else if (class287_10_.aFloat4477 < class287_3_.aFloat4477) {
		    if (class287_8_.aFloat4477 < 0.0F) {
			class287_13_.aFloat4477 -= f * class287_2_.aFloat4477;
			if (class287_13_.aFloat4477 < -class287_3_.aFloat4477)
			    class287_13_.aFloat4477 = -class287_3_.aFloat4477;
		    } else {
			class287_13_.aFloat4477 += class287_2_.aFloat4477 * f;
			if (class287_13_.aFloat4477 > class287_3_.aFloat4477)
			    class287_13_.aFloat4477 = class287_3_.aFloat4477;
		    }
		}
		if (class287_12_.aFloat4474 > class287_14_.aFloat4474) {
		    if (class287_8_.aFloat4474 < 0.0F) {
			class287_13_.aFloat4474 += class287_2_.aFloat4474 * f;
			if (class287_13_.aFloat4474 > 0.0F)
			    class287_13_.aFloat4474 = 0.0F;
		    } else {
			class287_13_.aFloat4474 -= f * class287_2_.aFloat4474;
			if (class287_13_.aFloat4474 < 0.0F)
			    class287_13_.aFloat4474 = 0.0F;
		    }
		} else if (class287_10_.aFloat4474 < class287_3_.aFloat4474) {
		    if (class287_8_.aFloat4474 < 0.0F) {
			class287_13_.aFloat4474 -= class287_2_.aFloat4474 * f;
			if (class287_13_.aFloat4474 < -class287_3_.aFloat4474)
			    class287_13_.aFloat4474 = -class287_3_.aFloat4474;
		    } else {
			class287_13_.aFloat4474 += f * class287_2_.aFloat4474;
			if (class287_13_.aFloat4474 > class287_3_.aFloat4474)
			    class287_13_.aFloat4474 = class287_3_.aFloat4474;
		    }
		}
		if (class287_12_.aFloat4479 > class287_14_.aFloat4479) {
		    if (class287_8_.aFloat4479 < 0.0F) {
			class287_13_.aFloat4479 += class287_2_.aFloat4479 * f;
			if (class287_13_.aFloat4479 > 0.0F)
			    class287_13_.aFloat4479 = 0.0F;
		    } else {
			class287_13_.aFloat4479 -= f * class287_2_.aFloat4479;
			if (class287_13_.aFloat4479 < 0.0F)
			    class287_13_.aFloat4479 = 0.0F;
		    }
		} else if (class287_10_.aFloat4479 < class287_3_.aFloat4479) {
		    if (class287_8_.aFloat4479 < 0.0F) {
			class287_13_.aFloat4479 -= f * class287_2_.aFloat4479;
			if (class287_13_.aFloat4479 < -class287_3_.aFloat4479)
			    class287_13_.aFloat4479 = -class287_3_.aFloat4479;
		    } else {
			class287_13_.aFloat4479 += class287_2_.aFloat4479 * f;
			if (class287_13_.aFloat4479 > class287_3_.aFloat4479)
			    class287_13_.aFloat4479 = class287_3_.aFloat4479;
		    }
		}
		class287_1_.method5595(class287_13_, 0.8F);
		if (f_9_ < f_7_ && class287_1_.method5559() < f_7_) {
		    class287.method5655(class287_0_);
		    class287_1_.method5645();
		} else
		    class287.method5574(Class287.method5591(class287_1_, f));
		class287_10_.method5564();
		class287_13_.method5564();
		class287_14_.method5564();
	    }
	}
    }
    
    Class545() throws Throwable {
	throw new Error();
    }
    
    public static void method11987
	(float f, Class287 class287, Class287 class287_15_,
	 Class287 class287_16_, Class287 class287_17_, Class287 class287_18_,
	 float f_19_, float f_20_, float f_21_, float f_22_) {
	if (!class287_15_.method5601(class287)) {
	    Class287 class287_23_
		= Class287.method5578(class287_15_, class287);
	    float f_24_ = class287_23_.method5559();
	    if (f_19_ > 0.0F) {
		class287_17_ = Class287.method5562(class287_17_);
		class287_17_.method5587(f_24_ / f_19_ * f_20_);
	    }
	    if (class287_17_.aFloat4477 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class287.aFloat4477) || f_24_ > f_21_) {
		class287.method5655(class287_15_);
		class287_16_.method5645();
	    } else {
		Class287 class287_25_ = Class287.method5562(class287_16_);
		class287_25_.method5584();
		Class287 class287_26_
		    = Class287.method5589(class287_25_, class287_17_);
		Class287 class287_27_
		    = Class287.method5586(class287_25_, class287_26_);
		class287_27_.method5587(0.5F);
		Class287 class287_28_ = Class287.method5562(class287_16_);
		Class287 class287_29_ = Class287.method5562(class287_23_);
		class287_29_.method5584();
		if (class287_27_.aFloat4477 > class287_29_.aFloat4477) {
		    if (class287_23_.aFloat4477 < 0.0F) {
			class287_28_.aFloat4477 += f * class287_17_.aFloat4477;
			if (class287_28_.aFloat4477 > 0.0F)
			    class287_28_.aFloat4477 = 0.0F;
		    } else {
			class287_28_.aFloat4477 -= class287_17_.aFloat4477 * f;
			if (class287_28_.aFloat4477 < 0.0F)
			    class287_28_.aFloat4477 = 0.0F;
		    }
		} else if (class287_25_.aFloat4477 < class287_18_.aFloat4477) {
		    if (class287_23_.aFloat4477 < 0.0F) {
			class287_28_.aFloat4477 -= f * class287_17_.aFloat4477;
			if (class287_28_.aFloat4477 < -class287_18_.aFloat4477)
			    class287_28_.aFloat4477 = -class287_18_.aFloat4477;
		    } else {
			class287_28_.aFloat4477 += class287_17_.aFloat4477 * f;
			if (class287_28_.aFloat4477 > class287_18_.aFloat4477)
			    class287_28_.aFloat4477 = class287_18_.aFloat4477;
		    }
		}
		if (class287_27_.aFloat4474 > class287_29_.aFloat4474) {
		    if (class287_23_.aFloat4474 < 0.0F) {
			class287_28_.aFloat4474 += class287_17_.aFloat4474 * f;
			if (class287_28_.aFloat4474 > 0.0F)
			    class287_28_.aFloat4474 = 0.0F;
		    } else {
			class287_28_.aFloat4474 -= f * class287_17_.aFloat4474;
			if (class287_28_.aFloat4474 < 0.0F)
			    class287_28_.aFloat4474 = 0.0F;
		    }
		} else if (class287_25_.aFloat4474 < class287_18_.aFloat4474) {
		    if (class287_23_.aFloat4474 < 0.0F) {
			class287_28_.aFloat4474 -= class287_17_.aFloat4474 * f;
			if (class287_28_.aFloat4474 < -class287_18_.aFloat4474)
			    class287_28_.aFloat4474 = -class287_18_.aFloat4474;
		    } else {
			class287_28_.aFloat4474 += f * class287_17_.aFloat4474;
			if (class287_28_.aFloat4474 > class287_18_.aFloat4474)
			    class287_28_.aFloat4474 = class287_18_.aFloat4474;
		    }
		}
		if (class287_27_.aFloat4479 > class287_29_.aFloat4479) {
		    if (class287_23_.aFloat4479 < 0.0F) {
			class287_28_.aFloat4479 += class287_17_.aFloat4479 * f;
			if (class287_28_.aFloat4479 > 0.0F)
			    class287_28_.aFloat4479 = 0.0F;
		    } else {
			class287_28_.aFloat4479 -= f * class287_17_.aFloat4479;
			if (class287_28_.aFloat4479 < 0.0F)
			    class287_28_.aFloat4479 = 0.0F;
		    }
		} else if (class287_25_.aFloat4479 < class287_18_.aFloat4479) {
		    if (class287_23_.aFloat4479 < 0.0F) {
			class287_28_.aFloat4479 -= f * class287_17_.aFloat4479;
			if (class287_28_.aFloat4479 < -class287_18_.aFloat4479)
			    class287_28_.aFloat4479 = -class287_18_.aFloat4479;
		    } else {
			class287_28_.aFloat4479 += class287_17_.aFloat4479 * f;
			if (class287_28_.aFloat4479 > class287_18_.aFloat4479)
			    class287_28_.aFloat4479 = class287_18_.aFloat4479;
		    }
		}
		class287_16_.method5595(class287_28_, 0.8F);
		if (f_24_ < f_22_ && class287_16_.method5559() < f_22_) {
		    class287.method5655(class287_15_);
		    class287_16_.method5645();
		} else
		    class287.method5574(Class287.method5591(class287_16_, f));
		class287_25_.method5564();
		class287_28_.method5564();
		class287_29_.method5564();
	    }
	}
    }
    
    static final void method11988(ClientScriptData class454, int i) {
	if (null == Class66_Sub2.aShortArray10479
	    || (-908664087 * Class72.anInt1099
		>= 678860917 * Class120_Sub16.anInt10563))
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= ((Class66_Sub2.aShortArray10479
		    [(Class72.anInt1099 += 1031673177) * -908664087 - 1])
		   & 0xffff);
    }
    
    static final void method11989(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class445_Sub24.method14342(679824551).getId((byte) 0);
    }
    
    static void method11990(int i, int i_30_) {
	Class24.anInt209 = i * 1277831871;
	synchronized (Class24.aClass129_210) {
	    Class24.aClass129_210.reset(-1527840019);
	}
    }
    
    static void method11991(Class241_Sub39_Sub10 class241_sub39_sub10, int i,
			    byte i_31_) {
	if (Class16.aBool141) {
	    Class639 class639 = OnlineStatus.method7519(2130328330);
	    int i_32_ = 0;
	    for (Class241_Sub39_Sub11 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			((Class241_Sub39_Sub10) class241_sub39_sub10)
			    .aClass410_10866.method7440(-1397088259));
		 class241_sub39_sub11 != null;
		 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			((Class241_Sub39_Sub10) class241_sub39_sub10)
			    .aClass410_10866.method7435((byte) -1))) {
		int i_33_ = Class277.method5374(class241_sub39_sub11, class639,
						(byte) -67);
		if (i_33_ > i_32_)
		    i_32_ = i_33_;
	    }
	    i_32_ += 8;
	    int i_34_ = 21 + (Class16.anInt164 * 1149989507
			      * ((((Class241_Sub39_Sub10) class241_sub39_sub10)
				  .anInt10867)
				 * 1633676605));
	    Class395.anInt5784
		= 1287538017 * ((Class16.aBool168 ? 26 : 22)
				+ (1149989507 * Class16.anInt164
				   * (1633676605
				      * ((Class241_Sub39_Sub10)
					 class241_sub39_sub10).anInt10867)));
	    int i_35_ = (Class16.anInt156 * 1011088115
			 + Class593.anInt7631 * 1139603851);
	    if (i_35_ + i_32_ > Class494.canvasWid * -1080559003)
		i_35_ = Class16.anInt156 * 1011088115 - i_32_;
	    if (i_35_ < 0)
		i_35_ = 0;
	    int i_36_ = (Class16.aBool168
			 ? -351886683 * class639.anInt8258 + 20 + 1 : 31);
	    int i_37_ = 1 + (class639.anInt8258 * -351886683 + (i - i_36_));
	    if (i_34_ + i_37_ > Class67.canvasHei * 963058943)
		i_37_ = 963058943 * Class67.canvasHei - i_34_;
	    if (i_37_ < 0)
		i_37_ = 0;
	    Class193.anInt2298 = -985825747 * i_35_;
	    Class4.anInt16 = i_37_ * -219396349;
	    Class16.anInt147 = 838688821 * i_32_;
	    Class16.aClass241_Sub39_Sub10_143 = class241_sub39_sub10;
	}
    }
}
