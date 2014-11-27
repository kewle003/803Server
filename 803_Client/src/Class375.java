/* Class375 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class375
{
    static final int anInt5620 = 128;
    static final int anInt5621 = 128;
    static Object anObject5622;
    Class103_Sub3 aClass103_Sub3_5623;
    public static final int anInt5624 = 16;
    Interface41[] anInterface41Array5625 = null;
    Interface38 anInterface38_5626 = null;
    public boolean aBool5627;
    public Interface38 anInterface38_5628;
    public Interface38 anInterface38_5629;
    public Interface41[] anInterface41Array5630 = null;
    static Object anObject5631;
    static Object anObject5632;
    
    static void method6720() {
	if (anObject5622 == null) {
	    Class347_Sub2_Sub2 class347_sub2_sub2 = new Class347_Sub2_Sub2();
	    byte[] is = class347_sub2_sub2.method17450(128, 128, 16);
	    anObject5622
		= ChatLine.method17107(is, false, -1234158323);
	}
	if (anObject5631 == null) {
	    Class347_Sub1_Sub1 class347_sub1_sub1 = new Class347_Sub1_Sub1();
	    byte[] is = class347_sub1_sub1.method17440(128, 128, 16);
	    anObject5631
		= ChatLine.method17107(is, false, -1353581163);
	}
    }
    
    public boolean method6721() {
	return (aBool5627 ? ((Class375) this).anInterface38_5626 != null
		: ((Class375) this).anInterface41Array5625 != null);
    }
    
    static void method6722() {
	if (anObject5622 == null) {
	    Class347_Sub2_Sub2 class347_sub2_sub2 = new Class347_Sub2_Sub2();
	    byte[] is = class347_sub2_sub2.method17450(128, 128, 16);
	    anObject5622
		= ChatLine.method17107(is, false, -1510801418);
	}
	if (anObject5631 == null) {
	    Class347_Sub1_Sub1 class347_sub1_sub1 = new Class347_Sub1_Sub1();
	    byte[] is = class347_sub1_sub1.method17440(128, 128, 16);
	    anObject5631
		= ChatLine.method17107(is, false, -960797862);
	}
    }
    
    public boolean method6723() {
	if (!((Class375) this).aClass103_Sub3_5623.aBool9636)
	    return false;
	if (anInterface38_5629 == null) {
	    if (anObject5632 == null) {
		byte[] is
		    = Class587.method12858(128, 128, 16, 8,
					   new Class586_Sub1(419684), 4.0F,
					   4.0F, 16.0F, 0.5F, 0.6F);
		anObject5632
		    = ChatLine.method17107(is, false, -1349530827);
	    }
	    byte[] is = Class445.method7894(anObject5632, false, -284932600);
	    byte[] is_0_ = new byte[is.length * 4];
	    int i = 0;
	    for (int i_1_ = 0; i_1_ < 16; i_1_++) {
		int i_2_ = i_1_ * 16384;
		int i_3_ = i_2_;
		for (int i_4_ = 0; i_4_ < 128; i_4_++) {
		    int i_5_ = i_3_ + i_4_ * 128;
		    int i_6_ = i_3_ + (i_4_ - 1 & 0x7f) * 128;
		    int i_7_ = i_3_ + (i_4_ + 1 & 0x7f) * 128;
		    for (int i_8_ = 0; i_8_ < 128; i_8_++) {
			float f = (float) ((is[i_6_ + i_8_] & 0xff)
					   - (is[i_7_ + i_8_] & 0xff));
			float f_9_
			    = (float) ((is[i_5_ + (i_8_ - 1 & 0x7f)] & 0xff)
				       - (is[i_5_ + (i_8_ + 1 & 0x7f)]
					  & 0xff));
			float f_10_
			    = (float) (128.0 / Math.sqrt((double) (f_9_ * f_9_
								   + 16384.0F
								   + f * f)));
			is_0_[i++] = (byte) (int) (f_9_ * f_10_ + 127.0F);
			is_0_[i++] = (byte) (int) (128.0F * f_10_ + 127.0F);
			is_0_[i++] = (byte) (int) (f * f_10_ + 127.0F);
			is_0_[i++] = is[i_2_++];
		    }
		}
	    }
	    anInterface38_5629
		= (((Class375) this).aClass103_Sub3_5623.method15990
		   (Class175.aClass175_2110, 128, 128, 16, true, is_0_));
	}
	return anInterface38_5629 != null;
    }
    
    Class375(Class103_Sub3 class103_sub3) {
	anInterface38_5628 = null;
	anInterface38_5629 = null;
	((Class375) this).aClass103_Sub3_5623 = class103_sub3;
	aBool5627 = ((Class375) this).aClass103_Sub3_5623.aBool9636;
	if (aBool5627 && !((Class375) this).aClass103_Sub3_5623.aBool9637)
	    aBool5627 = false;
	if (aBool5627 && !(((Class375) this).aClass103_Sub3_5623.method15708
			   (Class175.aClass175_2114, Class102.aClass102_1440)))
	    aBool5627 = false;
	if (aBool5627
	    || (((Class375) this).aClass103_Sub3_5623.method15675
		(Class175.aClass175_2114, Class102.aClass102_1440))) {
	    method6722();
	    if (!aBool5627) {
		((Class375) this).anInterface41Array5625 = new Interface41[16];
		for (int i = 0; i < 16; i++) {
		    byte[] is = Class380.method6881(anObject5622, i * 32768,
						    32768, 1679943959);
		    ((Class375) this).anInterface41Array5625[i]
			= (((Class375) this).aClass103_Sub3_5623.method15849
			   (Class175.aClass175_2114, 128, 128, true, is));
		}
		anInterface41Array5630 = new Interface41[16];
		for (int i = 0; i < 16; i++) {
		    byte[] is = Class380.method6881(anObject5631, i * 32768,
						    32768, 1679943959);
		    anInterface41Array5630[i]
			= (((Class375) this).aClass103_Sub3_5623.method15849
			   (Class175.aClass175_2114, 128, 128, true, is));
		}
	    } else {
		byte[] is
		    = Class445.method7894(anObject5622, false, -284932600);
		((Class375) this).anInterface38_5626
		    = (((Class375) this).aClass103_Sub3_5623.method15990
		       (Class175.aClass175_2114, 128, 128, 16, true, is));
		is = Class445.method7894(anObject5631, false, -284932600);
		anInterface38_5628
		    = (((Class375) this).aClass103_Sub3_5623.method15990
		       (Class175.aClass175_2114, 128, 128, 16, true, is));
	    }
	}
    }
    
    static void method6724() {
	if (anObject5622 == null) {
	    Class347_Sub2_Sub2 class347_sub2_sub2 = new Class347_Sub2_Sub2();
	    byte[] is = class347_sub2_sub2.method17450(128, 128, 16);
	    anObject5622
		= ChatLine.method17107(is, false, -1246191600);
	}
	if (anObject5631 == null) {
	    Class347_Sub1_Sub1 class347_sub1_sub1 = new Class347_Sub1_Sub1();
	    byte[] is = class347_sub1_sub1.method17440(128, 128, 16);
	    anObject5631
		= ChatLine.method17107(is, false, -730171677);
	}
    }
    
    public boolean method6725() {
	return (aBool5627 ? ((Class375) this).anInterface38_5626 != null
		: ((Class375) this).anInterface41Array5625 != null);
    }
    
    public boolean method6726() {
	return (aBool5627 ? ((Class375) this).anInterface38_5626 != null
		: ((Class375) this).anInterface41Array5625 != null);
    }
}
