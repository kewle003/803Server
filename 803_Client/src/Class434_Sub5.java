/* Class434_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class434_Sub5 extends Class434
{
    Class287 aClass287_8630;
    Class287 aClass287_8631 = new Class287();
    Interface1 anInterface1_8632;
    Class287 aClass287_8633 = new Class287(Float.NaN, Float.NaN, Float.NaN);
    Class287 aClass287_8634;
    boolean aBool8635;
    
    public void method7764(RSByteBuffer class241_sub3) {
	Class67 class67
	    = Class323.method5962(class241_sub3.readUnsignedByte((byte) 62),
				  -1228333582);
	int i = class241_sub3.readUnsignedShort(1162222719);
	((Class434_Sub5) this).anInterface1_8632
	    = ((Class434_Sub5) this).aClass351_6119.method6382(1152251541)
		  .method23(class67, i, -290357331);
	((Class434_Sub5) this).aClass287_8631.method5602(class241_sub3);
	if (class241_sub3.readUnsignedByte((byte) -46) == 1)
	    ((Class434_Sub5) this).aBool8635 = true;
	else
	    ((Class434_Sub5) this).aBool8635 = false;
    }
    
    public void method7760(Class79 class79, Class266 class266, int i, int i_0_,
			   float f) {
	Class287 class287
	    = Class287.method5562(((Class434_Sub5) this).aClass351_6119
				      .method6288(1363205049));
	class287.aFloat4477 -= (float) i;
	class287.aFloat4479 -= (float) i_0_;
	class287.aFloat4474 *= -1.0F;
	Class287 class287_1_ = method7753((short) 128);
	class287_1_.aFloat4477 -= (float) i;
	class287_1_.aFloat4479 -= (float) i_0_;
	class287_1_.aFloat4474 *= -1.0F;
	class266.method5117((double) class287.aFloat4477,
			    (double) class287.aFloat4474,
			    (double) class287.aFloat4479,
			    (double) class287_1_.aFloat4477,
			    (double) class287_1_.aFloat4474,
			    (double) class287_1_.aFloat4479, 0.0F, 1.0F, 0.0F);
	class287.method5564();
	class287_1_.method5564();
    }
    
    public boolean method7762(int i) {
	return !Float.isNaN(((Class434_Sub5) this).aClass287_8633.aFloat4477);
    }
    
    public void method7751(float f, byte i) {
	if (null != ((Class434_Sub5) this).anInterface1_8632) {
	    ((Class434_Sub5) this).aClass287_8630.method5655
		(((Class434_Sub5) this).anInterface1_8632.method3
		     (1600048015).method14991((byte) -116));
	    ((Class434_Sub5) this).aClass351_6119.method6256
		(false, f, ((Class434_Sub5) this).aClass287_8633,
		 ((Class434_Sub5) this).aClass351_6119.method6294((byte) -85),
		 ((Class434_Sub5) this).aClass287_8630,
		 ((Class434_Sub5) this).aClass287_8634, (short) -8406);
	}
    }
    
    public Class287 method7752() {
	Class287 class287
	    = Class287.method5562(((Class434_Sub5) this).aClass287_8630);
	Class287 class287_2_
	    = Class287.method5562(((Class434_Sub5) this).aClass287_8631);
	if (((Class434_Sub5) this).aBool8635)
	    class287_2_.method5592(((Class434_Sub5) this).anInterface1_8632
				       .method13(-552291952));
	class287.method5574(class287_2_);
	class287_2_.method5564();
	return class287;
    }
    
    public void method7754(Class79 class79, Class266 class266, int i, int i_3_,
			   float f, int i_4_) {
	Class287 class287
	    = Class287.method5562(((Class434_Sub5) this).aClass351_6119
				      .method6288(1240889589));
	class287.aFloat4477 -= (float) i;
	class287.aFloat4479 -= (float) i_3_;
	class287.aFloat4474 *= -1.0F;
	Class287 class287_5_ = method7753((short) 128);
	class287_5_.aFloat4477 -= (float) i;
	class287_5_.aFloat4479 -= (float) i_3_;
	class287_5_.aFloat4474 *= -1.0F;
	class266.method5117((double) class287.aFloat4477,
			    (double) class287.aFloat4474,
			    (double) class287.aFloat4479,
			    (double) class287_5_.aFloat4477,
			    (double) class287_5_.aFloat4474,
			    (double) class287_5_.aFloat4479, 0.0F, 1.0F, 0.0F);
	class287.method5564();
	class287_5_.method5564();
    }
    
    public Class287 method7753(short i) {
	Class287 class287
	    = Class287.method5562(((Class434_Sub5) this).aClass287_8633);
	Class287 class287_6_
	    = Class287.method5562(((Class434_Sub5) this).aClass287_8631);
	if (((Class434_Sub5) this).aBool8635)
	    class287_6_.method5592(((Class434_Sub5) this).anInterface1_8632
				       .method13(-599694535));
	class287.method5574(class287_6_);
	class287_6_.method5564();
	return class287;
    }
    
    public Class287 method7767(byte i) {
	Class287 class287
	    = Class287.method5562(((Class434_Sub5) this).aClass287_8630);
	Class287 class287_7_
	    = Class287.method5562(((Class434_Sub5) this).aClass287_8631);
	if (((Class434_Sub5) this).aBool8635)
	    class287_7_.method5592(((Class434_Sub5) this).anInterface1_8632
				       .method13(408144079));
	class287.method5574(class287_7_);
	class287_7_.method5564();
	return class287;
    }
    
    public Class287 method14128(byte i) {
	return ((Class434_Sub5) this).aClass287_8633;
    }
    
    public void method7755(RSByteBuffer class241_sub3, int i) {
	Class67 class67
	    = Class323.method5962(class241_sub3.readUnsignedByte((byte) -25),
				  -1607270164);
	int i_8_ = class241_sub3.readUnsignedShort(1162222719);
	((Class434_Sub5) this).anInterface1_8632
	    = ((Class434_Sub5) this).aClass351_6119.method6382(750327184)
		  .method23(class67, i_8_, -290357331);
	((Class434_Sub5) this).aClass287_8631.method5602(class241_sub3);
	if (class241_sub3.readUnsignedByte((byte) -2) == 1)
	    ((Class434_Sub5) this).aBool8635 = true;
	else
	    ((Class434_Sub5) this).aBool8635 = false;
    }
    
    public void method14129() {
	if (((Class434_Sub5) this).anInterface1_8632 != null)
	    ((Class434_Sub5) this).anInterface1_8632
		= (((Class434_Sub5) this).aClass351_6119.method6382
		       (1498948340).method23
		   (((Class434_Sub5) this).anInterface1_8632
			.method14(1445501059),
		    ((Class434_Sub5) this).anInterface1_8632
			.method2((byte) 18),
		    -290357331));
    }
    
    public void method7757(float f) {
	if (null != ((Class434_Sub5) this).anInterface1_8632) {
	    ((Class434_Sub5) this).aClass287_8630.method5655
		(((Class434_Sub5) this).anInterface1_8632.method3
		     (-1160849300).method14991((byte) -89));
	    ((Class434_Sub5) this).aClass351_6119.method6256
		(false, f, ((Class434_Sub5) this).aClass287_8633,
		 ((Class434_Sub5) this).aClass351_6119.method6294((byte) 7),
		 ((Class434_Sub5) this).aClass287_8630,
		 ((Class434_Sub5) this).aClass287_8634, (short) -26095);
	}
    }
    
    public boolean method7758() {
	return !Float.isNaN(((Class434_Sub5) this).aClass287_8633.aFloat4477);
    }
    
    public Class287 method14130() {
	return ((Class434_Sub5) this).aClass287_8633;
    }
    
    public void method14131(byte i) {
	if (((Class434_Sub5) this).anInterface1_8632 != null)
	    ((Class434_Sub5) this).anInterface1_8632
		= (((Class434_Sub5) this).aClass351_6119.method6382
		       (-1479167805).method23
		   (((Class434_Sub5) this).anInterface1_8632
			.method14(-692775618),
		    ((Class434_Sub5) this).anInterface1_8632
			.method2((byte) -19),
		    -290357331));
    }
    
    public void method7750(Class79 class79, Class266 class266, int i, int i_9_,
			   float f) {
	Class287 class287
	    = Class287.method5562(((Class434_Sub5) this).aClass351_6119
				      .method6288(573800742));
	class287.aFloat4477 -= (float) i;
	class287.aFloat4479 -= (float) i_9_;
	class287.aFloat4474 *= -1.0F;
	Class287 class287_10_ = method7753((short) 128);
	class287_10_.aFloat4477 -= (float) i;
	class287_10_.aFloat4479 -= (float) i_9_;
	class287_10_.aFloat4474 *= -1.0F;
	class266.method5117((double) class287.aFloat4477,
			    (double) class287.aFloat4474,
			    (double) class287.aFloat4479,
			    (double) class287_10_.aFloat4477,
			    (double) class287_10_.aFloat4474,
			    (double) class287_10_.aFloat4479, 0.0F, 1.0F,
			    0.0F);
	class287.method5564();
	class287_10_.method5564();
    }
    
    public void method14132(Interface1 interface1, Class287 class287,
			    boolean bool) {
	((Class434_Sub5) this).anInterface1_8632 = interface1;
	((Class434_Sub5) this).aClass287_8631.method5655(class287);
	((Class434_Sub5) this).aBool8635 = bool;
	interface1.method3(-550993934);
    }
    
    public Class287 method7763() {
	Class287 class287
	    = Class287.method5562(((Class434_Sub5) this).aClass287_8630);
	Class287 class287_11_
	    = Class287.method5562(((Class434_Sub5) this).aClass287_8631);
	if (((Class434_Sub5) this).aBool8635)
	    class287_11_.method5592(((Class434_Sub5) this)
					.anInterface1_8632
					.method13(-62639204));
	class287.method5574(class287_11_);
	class287_11_.method5564();
	return class287;
    }
    
    public void method7761(float f) {
	if (null != ((Class434_Sub5) this).anInterface1_8632) {
	    ((Class434_Sub5) this).aClass287_8630.method5655
		(((Class434_Sub5) this).anInterface1_8632.method3
		     (-1304418845).method14991((byte) -93));
	    ((Class434_Sub5) this).aClass351_6119.method6256
		(false, f, ((Class434_Sub5) this).aClass287_8633,
		 ((Class434_Sub5) this).aClass351_6119.method6294((byte) -51),
		 ((Class434_Sub5) this).aClass287_8630,
		 ((Class434_Sub5) this).aClass287_8634, (short) -19931);
	}
    }
    
    public boolean method7759() {
	return !Float.isNaN(((Class434_Sub5) this).aClass287_8633.aFloat4477);
    }
    
    public void method14133(Interface1 interface1, Class287 class287,
			    boolean bool, int i) {
	((Class434_Sub5) this).anInterface1_8632 = interface1;
	((Class434_Sub5) this).aClass287_8631.method5655(class287);
	((Class434_Sub5) this).aBool8635 = bool;
	interface1.method3(-1696365114);
    }
    
    public Class287 method7765() {
	Class287 class287
	    = Class287.method5562(((Class434_Sub5) this).aClass287_8633);
	Class287 class287_12_
	    = Class287.method5562(((Class434_Sub5) this).aClass287_8631);
	if (((Class434_Sub5) this).aBool8635)
	    class287_12_.method5592(((Class434_Sub5) this)
					.anInterface1_8632
					.method13(621811905));
	class287.method5574(class287_12_);
	class287_12_.method5564();
	return class287;
    }
    
    public Class287 method7768() {
	Class287 class287
	    = Class287.method5562(((Class434_Sub5) this).aClass287_8633);
	Class287 class287_13_
	    = Class287.method5562(((Class434_Sub5) this).aClass287_8631);
	if (((Class434_Sub5) this).aBool8635)
	    class287_13_.method5592(((Class434_Sub5) this)
					.anInterface1_8632
					.method13(-1833956233));
	class287.method5574(class287_13_);
	class287_13_.method5564();
	return class287;
    }
    
    public Class287 method7769() {
	Class287 class287
	    = Class287.method5562(((Class434_Sub5) this).aClass287_8633);
	Class287 class287_14_
	    = Class287.method5562(((Class434_Sub5) this).aClass287_8631);
	if (((Class434_Sub5) this).aBool8635)
	    class287_14_.method5592(((Class434_Sub5) this)
					.anInterface1_8632
					.method13(-2053944292));
	class287.method5574(class287_14_);
	class287_14_.method5564();
	return class287;
    }
    
    public void method14134(Interface1 interface1, Class287 class287,
			    boolean bool) {
	((Class434_Sub5) this).anInterface1_8632 = interface1;
	((Class434_Sub5) this).aClass287_8631.method5655(class287);
	((Class434_Sub5) this).aBool8635 = bool;
	interface1.method3(1548042054);
    }
    
    public void method7756(RSByteBuffer class241_sub3) {
	Class67 class67
	    = Class323.method5962(class241_sub3.readUnsignedByte((byte) -62),
				  1179166482);
	int i = class241_sub3.readUnsignedShort(1162222719);
	((Class434_Sub5) this).anInterface1_8632
	    = ((Class434_Sub5) this).aClass351_6119.method6382(-249181061)
		  .method23(class67, i, -290357331);
	((Class434_Sub5) this).aClass287_8631.method5602(class241_sub3);
	if (class241_sub3.readUnsignedByte((byte) 20) == 1)
	    ((Class434_Sub5) this).aBool8635 = true;
	else
	    ((Class434_Sub5) this).aBool8635 = false;
    }
    
    public Class287 method7766() {
	Class287 class287
	    = Class287.method5562(((Class434_Sub5) this).aClass287_8633);
	Class287 class287_15_
	    = Class287.method5562(((Class434_Sub5) this).aClass287_8631);
	if (((Class434_Sub5) this).aBool8635)
	    class287_15_.method5592(((Class434_Sub5) this)
					.anInterface1_8632
					.method13(-1508385634));
	class287.method5574(class287_15_);
	class287_15_.method5564();
	return class287;
    }
    
    public void method14135() {
	if (((Class434_Sub5) this).anInterface1_8632 != null)
	    ((Class434_Sub5) this).anInterface1_8632
		= (((Class434_Sub5) this).aClass351_6119.method6382
		       (59340156).method23
		   (((Class434_Sub5) this).anInterface1_8632
			.method14(-2131123068),
		    ((Class434_Sub5) this).anInterface1_8632
			.method2((byte) -5),
		    -290357331));
    }
    
    public void method14136(Interface1 interface1, Class287 class287,
			    boolean bool) {
	((Class434_Sub5) this).anInterface1_8632 = interface1;
	((Class434_Sub5) this).aClass287_8631.method5655(class287);
	((Class434_Sub5) this).aBool8635 = bool;
	interface1.method3(1427898964);
    }
    
    public void method14137() {
	if (((Class434_Sub5) this).anInterface1_8632 != null)
	    ((Class434_Sub5) this).anInterface1_8632
		= (((Class434_Sub5) this).aClass351_6119.method6382
		       (26106317).method23
		   (((Class434_Sub5) this).anInterface1_8632
			.method14(-798046914),
		    ((Class434_Sub5) this).anInterface1_8632
			.method2((byte) 33),
		    -290357331));
    }
    
    public Class287 method14138() {
	return ((Class434_Sub5) this).aClass287_8633;
    }
    
    public Class287 method14139() {
	return ((Class434_Sub5) this).aClass287_8633;
    }
    
    public Class434_Sub5(Class351 class351) {
	super(class351);
	((Class434_Sub5) this).aClass287_8630
	    = new Class287(Float.NaN, Float.NaN, Float.NaN);
	((Class434_Sub5) this).aClass287_8634 = new Class287();
    }
    
    public Class287 method14140() {
	return ((Class434_Sub5) this).aClass287_8633;
    }
    
    public static void method14141(String string, boolean bool,
				   Class103 class103, Class96 class96,
				   Class639 class639, int i) {
	boolean bool_16_
	    = !Class349.aBool5382 || NodeCollection.method7698(1125904750);
	if (bool_16_) {
	    if (Class349.aBool5382 && bool_16_) {
		class639 = Class191.aClass639_2283;
		class96 = class103.method2296(class639,
					      Class563.aClass108_Sub2Array7305,
					      true);
		int i_17_
		    = class639.method13567(string, 250, null, -1347444628);
		int i_18_
		    = class639.method13596(string, 250,
					   1118868451 * class639.anInt8259,
					   null, -1918263062);
		int i_19_ = Class450.aClass108_6208.method2698();
		int i_20_ = i_19_ + 4;
		i_17_ += i_20_ * 2;
		i_18_ += i_20_ * 2;
		if (i_17_ < Class191.anInt2281 * -377202843)
		    i_17_ = -377202843 * Class191.anInt2281;
		if (i_18_ < -1517760349 * Class191.anInt2282)
		    i_18_ = Class191.anInt2282 * -1517760349;
		int i_21_
		    = (Class191.aClass330_2279.method6031(i_17_,
							  (-2047397293
							   * client.anInt8432),
							  967709419)
		       + Class191.anInt2278 * 1756667335);
		int i_22_
		    = (Class191.aClass324_2277.method5965(i_18_,
							  (client.anInt8433
							   * -533394329),
							  1885157625)
		       + 1682684675 * Class191.anInt2280);
		class103.method2289(Class65.aClass108_1047, false).method3618
		    (i_21_ + Class452.aClass108_6211.method2698(),
		     i_22_ + Class452.aClass108_6211.method2694(),
		     i_17_ - Class452.aClass108_6211.method2698() * 2,
		     i_18_ - Class452.aClass108_6211.method2694() * 2, 1, -1,
		     0);
		class103.method2289(Class452.aClass108_6211, true)
		    .method3646(i_21_, i_22_);
		Class452.aClass108_6211.method2705();
		class103.method2289(Class452.aClass108_6211, true)
		    .method3646(i_21_ + i_17_ - i_19_, i_22_);
		Class452.aClass108_6211.method2747();
		class103.method2289(Class452.aClass108_6211, true)
		    .method3646(i_21_ + i_17_ - i_19_, i_18_ + i_22_ - i_19_);
		Class452.aClass108_6211.method2705();
		class103.method2289(Class452.aClass108_6211, true)
		    .method3646(i_21_, i_18_ + i_22_ - i_19_);
		Class452.aClass108_6211.method2747();
		class103.method2289(Class450.aClass108_6208, true).method3603
		    (i_21_, i_22_ + Class452.aClass108_6211.method2694(),
		     i_19_, i_18_ - Class452.aClass108_6211.method2694() * 2);
		Class450.aClass108_6208.method2706();
		class103.method2289(Class450.aClass108_6208, true).method3603
		    (i_21_ + Class452.aClass108_6211.method2698(), i_22_,
		     i_17_ - Class452.aClass108_6211.method2698() * 2, i_19_);
		Class450.aClass108_6208.method2706();
		class103.method2289(Class450.aClass108_6208, true).method3603
		    (i_21_ + i_17_ - i_19_,
		     i_22_ + Class452.aClass108_6211.method2694(), i_19_,
		     i_18_ - Class452.aClass108_6211.method2694() * 2);
		Class450.aClass108_6208.method2706();
		class103.method2289(Class450.aClass108_6208, true).method3603
		    (i_21_ + Class452.aClass108_6211.method2698(),
		     i_22_ + i_18_ - i_19_,
		     i_17_ - Class452.aClass108_6211.method2698() * 2, i_19_);
		Class450.aClass108_6208.method2706();
		class96.method2114(string, i_20_ + i_21_, i_22_ + i_20_,
				   i_17_ - i_20_ * 2, i_18_ - 2 * i_20_,
				   Class222.anInt2592 * 2028180543 | ~0xffffff,
				   -1, 1, 1, 0, null, null, null, 0, 0,
				   -1452175615);
		Class579.method12709(i_21_, i_22_, i_17_, i_18_, (byte) -5);
	    } else {
		int i_23_ = class639.method13567(string, 250, null, 328429190);
		int i_24_
		    = (class639.method13568(string, 250, null, -1039915791)
		       * 13);
		int i_25_ = 4;
		int i_26_ = 6 + i_25_;
		int i_27_ = i_25_ + 6;
		class103.method2396(i_26_ - i_25_, i_27_ - i_25_,
				    i_23_ + i_25_ + i_25_,
				    i_25_ + (i_25_ + i_24_), -16777216, 0);
		class103.method2268(i_26_ - i_25_, i_27_ - i_25_,
				    i_25_ + i_23_ + i_25_,
				    i_25_ + i_24_ + i_25_, -1, 0);
		class96.method2114(string, i_26_, i_27_, i_23_, i_24_, -1, -1,
				   1, 1, 0, null, null, null, 0, 0, 795226280);
		Class579.method12709(i_26_ - i_25_, i_27_ - i_25_,
				     i_23_ + i_25_ + i_25_,
				     i_25_ + (i_24_ + i_25_), (byte) 86);
	    }
	    if (bool) {
		try {
		    class103.method2291();
		    class103.method2217((byte) 25);
		} catch (Exception_Sub2 exception_sub2) {
		    /* empty */
		}
	    }
	}
    }
}
