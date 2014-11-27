/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class117
{
    public String aString1547;
    public String aString1548;
    public Class46[] aClass46Array1549;
    public Class46[] aClass46Array1550;
    public String aString1551;
    public static Class209 aClass209_1552;
    public static JS5 GENERAL_MAPS_ARCHIVE;//aClass210_1553
    static Class168 aClass168_1554;
    
    void method2925(Class54 class54) {
	aString1551 = class54.method1298(-1792484346);
	aString1548 = class54.method1298(-1871869579);
	aString1547 = class54.method1298(-1958105401);
	int i = class54.method1300(1673290333);
	int i_0_ = class54.method1300(1627824122);
	aClass46Array1550 = i == 0 ? null : new Class46[i];
	aClass46Array1549 = 0 == i_0_ ? null : new Class46[i_0_];
	for (int i_1_ = 0; i_1_ < i; i_1_++) {
	    aClass46Array1550[i_1_] = new Class46();
	    aClass46Array1550[i_1_].method1121(class54, -2114591742);
	}
	for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
	    aClass46Array1549[i_2_] = new Class46();
	    aClass46Array1549[i_2_].method1121(class54, -1932806541);
	}
    }
    
    void method2926(Class54 class54, int i) {
	aString1551 = class54.method1298(700004489);
	aString1548 = class54.method1298(-346665704);
	aString1547 = class54.method1298(-1504285739);
	int i_3_ = class54.method1300(2066507912);
	int i_4_ = class54.method1300(2116059651);
	aClass46Array1550 = i_3_ == 0 ? null : new Class46[i_3_];
	aClass46Array1549 = 0 == i_4_ ? null : new Class46[i_4_];
	for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
	    aClass46Array1550[i_5_] = new Class46();
	    aClass46Array1550[i_5_].method1121(class54, -2080056985);
	}
	for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
	    aClass46Array1549[i_6_] = new Class46();
	    aClass46Array1549[i_6_].method1121(class54, -2032301154);
	}
    }
    
    Class117() {
	/* empty */
    }
    
    void method2927(Class54 class54) {
	aString1551 = class54.method1298(-1881521368);
	aString1548 = class54.method1298(-276832589);
	aString1547 = class54.method1298(-1969941041);
	int i = class54.method1300(1817857616);
	int i_7_ = class54.method1300(1610278142);
	aClass46Array1550 = i == 0 ? null : new Class46[i];
	aClass46Array1549 = 0 == i_7_ ? null : new Class46[i_7_];
	for (int i_8_ = 0; i_8_ < i; i_8_++) {
	    aClass46Array1550[i_8_] = new Class46();
	    aClass46Array1550[i_8_].method1121(class54, -1972399238);
	}
	for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
	    aClass46Array1549[i_9_] = new Class46();
	    aClass46Array1549[i_9_].method1121(class54, -2115046719);
	}
    }
    
    public static void method2928
	(float f, Class287 class287, Class278 class278, Class287 class287_10_,
	 Class287 class287_11_, Class287 class287_12_, Class287 class287_13_,
	 float f_14_, float f_15_, float f_16_, float f_17_, byte i) {
	if (!class287_10_.method5601(class287)) {
	    Class287 class287_18_ = Class287.method5561(0.0F, 0.0F, 0.0F);
	    Class287 class287_19_
		= Class287.method5562(Class287.method5578(class287_10_,
							  class287));
	    class287_19_.method5592(class278);
	    Class287 class287_20_
		= Class287.method5578(class287_19_, class287_18_);
	    float f_21_ = class287_20_.method5559();
	    if (f_14_ > 0.0F) {
		class287_12_ = Class287.method5562(class287_12_);
		class287_12_.method5587(f_15_ * (f_21_ / f_14_));
	    }
	    if (class287_12_.aFloat4477 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class287.aFloat4477) || f_21_ > f_16_
		|| f_21_ < f_17_) {
		class287.method5655(class287_10_);
		class287_11_.method5645();
	    } else {
		class278.method5390();
		Class287 class287_22_ = Class287.method5561(1.0F, 0.0F, 0.0F);
		Class287 class287_23_ = Class287.method5561(0.0F, 1.0F, 0.0F);
		Class287 class287_24_ = Class287.method5561(0.0F, 0.0F, 1.0F);
		class287_22_.method5592(class278);
		class287_23_.method5592(class278);
		class287_24_.method5592(class278);
		Class287 class287_25_
		    = Class287.method5561(Class287.method5580(class287_22_,
							      class287_11_),
					  Class287.method5580(class287_23_,
							      class287_11_),
					  Class287.method5580(class287_24_,
							      class287_11_));
		Class287 class287_26_ = Class287.method5562(class287_25_);
		class287_26_.method5584();
		Class287 class287_27_
		    = Class287.method5589(Class287.method5586(class287_26_,
							      class287_26_),
					  Class287.method5591(class287_12_,
							      2.0F));
		Class287 class287_28_ = Class287.method5562(class287_20_);
		class287_28_.method5584();
		Class287 class287_29_ = Class287.method5562(class287_25_);
		if (class287_27_.aFloat4477 > class287_28_.aFloat4477) {
		    if (class287_20_.aFloat4477 < 0.0F) {
			class287_29_.aFloat4477 += class287_12_.aFloat4477 * f;
			if (class287_29_.aFloat4477 > 0.0F)
			    class287_29_.aFloat4477 = 0.0F;
		    } else {
			class287_29_.aFloat4477 -= f * class287_12_.aFloat4477;
			if (class287_29_.aFloat4477 < 0.0F)
			    class287_29_.aFloat4477 = 0.0F;
		    }
		} else if (class287_26_.aFloat4477 < class287_13_.aFloat4477) {
		    if (class287_20_.aFloat4477 < 0.0F) {
			class287_29_.aFloat4477 -= class287_12_.aFloat4477 * f;
			if (class287_29_.aFloat4477 < -class287_13_.aFloat4477)
			    class287_29_.aFloat4477 = -class287_13_.aFloat4477;
		    } else {
			class287_29_.aFloat4477 += f * class287_12_.aFloat4477;
			if (class287_29_.aFloat4477 > class287_13_.aFloat4477)
			    class287_29_.aFloat4477 = class287_13_.aFloat4477;
		    }
		}
		if (class287_27_.aFloat4474 > class287_28_.aFloat4474) {
		    if (class287_20_.aFloat4474 < 0.0F) {
			class287_29_.aFloat4474 += f * class287_12_.aFloat4474;
			if (class287_29_.aFloat4474 > 0.0F)
			    class287_29_.aFloat4474 = 0.0F;
		    } else {
			class287_29_.aFloat4474 -= f * class287_12_.aFloat4474;
			if (class287_29_.aFloat4474 < 0.0F)
			    class287_29_.aFloat4474 = 0.0F;
		    }
		} else if (class287_26_.aFloat4474 < class287_13_.aFloat4474) {
		    if (class287_20_.aFloat4474 < 0.0F) {
			class287_29_.aFloat4474 -= class287_12_.aFloat4474 * f;
			if (class287_29_.aFloat4474 < -class287_13_.aFloat4474)
			    class287_29_.aFloat4474 = -class287_13_.aFloat4474;
		    } else {
			class287_29_.aFloat4474 += f * class287_12_.aFloat4474;
			if (class287_29_.aFloat4474 > class287_13_.aFloat4474)
			    class287_29_.aFloat4474 = class287_13_.aFloat4474;
		    }
		}
		if (class287_27_.aFloat4479 > class287_28_.aFloat4479) {
		    if (class287_20_.aFloat4479 < 0.0F) {
			class287_29_.aFloat4479 += class287_12_.aFloat4479 * f;
			if (class287_29_.aFloat4479 > 0.0F)
			    class287_29_.aFloat4479 = 0.0F;
		    } else {
			class287_29_.aFloat4479 -= f * class287_12_.aFloat4479;
			if (class287_29_.aFloat4479 < 0.0F)
			    class287_29_.aFloat4479 = 0.0F;
		    }
		} else if (class287_26_.aFloat4479 < class287_13_.aFloat4479) {
		    if (class287_20_.aFloat4479 < 0.0F) {
			class287_29_.aFloat4479 -= class287_12_.aFloat4479 * f;
			if (class287_29_.aFloat4479 < -class287_13_.aFloat4479)
			    class287_29_.aFloat4479 = -class287_13_.aFloat4479;
		    } else {
			class287_29_.aFloat4479 += f * class287_12_.aFloat4479;
			if (class287_29_.aFloat4479 > class287_13_.aFloat4479)
			    class287_29_.aFloat4479 = class287_13_.aFloat4479;
		    }
		}
		Class287 class287_30_
		    = Class287.method5591(class287_22_,
					  class287_29_.aFloat4477);
		class287_30_.method5651(class287_23_, class287_29_.aFloat4474);
		class287_30_.method5651(class287_24_, class287_29_.aFloat4479);
		class287_11_.method5595(class287_30_, 0.8F);
		class287.method5574(Class287.method5591(class287_11_, f));
		class287_26_.method5564();
		class287_29_.method5564();
		class287_28_.method5564();
	    }
	}
    }
    
    static Class613[] method2929(int i) {
	return (new Class613[]
		{ Class613.aClass613_7781, Class613.aClass613_7797,
		  Class613.aClass613_7785, Class613.aClass613_7793,
		  Class613.aClass613_7782, Class613.aClass613_7776,
		  Class613.aClass613_7772, Class613.aClass613_7777,
		  Class613.aClass613_7779, Class613.aClass613_7791,
		  Class613.aClass613_7794, Class613.aClass613_7795,
		  Class613.aClass613_7786, Class613.aClass613_7787,
		  Class613.aClass613_7801, Class613.aClass613_7780,
		  Class613.aClass613_7796, Class613.aClass613_7774,
		  Class613.aClass613_7783, Class613.aClass613_7788,
		  Class613.aClass613_7789, Class613.aClass613_7784,
		  Class613.aClass613_7790, Class613.aClass613_7798,
		  Class613.aClass613_7799, Class613.aClass613_7792,
		  Class613.aClass613_7773, Class613.aClass613_7775,
		  Class613.aClass613_7771, Class613.aClass613_7778,
		  Class613.aClass613_7800 });
    }
    
    static final void method2930(int i, int i_31_) {
	int i_32_ = client.anInt8296 - -397296623 * client.anInt8543;
	if (i_32_ >= 100) {
	    Class296.anInt4513 = Class520.method11690(-526024106) * 1415978969;
	    Class254.anInt4134 = -162819257;
	    Class245.anInt3961 = -1540801703;
	} else {
	    float f = 1.0F - ((float) ((100 - i_32_)
				       * ((100 - i_32_) * (100 - i_32_)))
			      / 1000000.0F);
	    int i_33_;
	    if (Class520.method11690(-96060083) == 4) {
		Class241_Sub16 class241_sub16
		    = Class445_Sub16.aClass351_Sub1_8660.method6283
			  (2025171607).method6857(-964807635);
		GameScene class522 = client.aClass238_8477.method4806((byte) 1);
		Class496.anInt6527
		    = ((int) ((double) Class445_Sub16.aClass351_Sub1_8660
					   .method6291((byte) 2)
			      * 2607.5945876176133)
		       & 0x3fff) * 709117373;
		Class322.anInt4909
		    = ((int) ((double) Class445_Sub16.aClass351_Sub1_8660
					   .method6292((byte) 76)
			      * -2607.5945876176133)
		       & 0x3fff) * 2118136689;
		Class120_Sub18.anInt10605 = 0;
		client.anInt8398
		    = (int) ((float) (-859437201 * Class254.anInt4133)
			     + (float) ((int) ((double) (client.anInt8561
							 * 1045658563)
					       / (4.0
						  * (Math.tan
						     ((double) ((Class445_Sub16
								     .aClass351_Sub1_8660
								     .method6302
								 ((byte) 31))
								/ 2.0F)))))
					- (Class254.anInt4133
					   * -859437201)) * f) * -435554359;
		Class462.anInt6284
		    = (1680747237
		       * (int) (f * (float) ((class241_sub16.anInt8982
					      * 576500115)
					     - 947401216 * class522.baseX
					     - (Class195.anInt2361
						* -2010331041))
				+ (float) (-2010331041 * Class195.anInt2361)));
		Class175.anInt2123
		    = (int) ((float) (-162776005 * Class200.anInt2400)
			     + f * (float) (-(class241_sub16.anInt8983
					      * 666561047)
					    - (Class200.anInt2400
					       * -162776005))) * -1365297795;
		Class636.anInt8248
		    = (-1181860511
		       * (int) (f * (float) ((class241_sub16.anInt8984
					      * -989675525)
					     - class522.baseY * -616117760
					     - (1588828683
						* Class120_Sub7.anInt10496))
				+ (float) (1588828683
					   * Class120_Sub7.anInt10496)));
		i_33_ = (-(Class322.anInt4909 * -2112344687)
			 - -1015355577 * Class450.anInt6207) & 0x3fff;
		if (i_33_ > 8192)
		    i_33_ -= 16384;
		else if (i_33_ < -8192)
		    i_33_ += 16384;
	    } else {
		int i_34_ = (int) client.aFloat8406;
		if (56985941 * client.anInt8542 >> 8 > i_34_)
		    i_34_ = client.anInt8542 * 56985941 >> 8;
		if (client.aBoolArray8517[4]
		    && client.anIntArray8413[4] + 128 > i_34_)
		    i_34_ = client.anIntArray8413[4] + 128;
		int i_35_
		    = (client.anInt8521 * 1832425067 + (int) client.aFloat8581
		       & 0x3fff);
		Class287 class287
		    = (Class21.myPlayer.method10874()
		       .aClass287_4386);
		Class120_Sub19.method16844
		    (Class291.anInt4488 * 97141979,
		     (Class96_Sub5.method16046((int) class287.aFloat4477,
					       (int) class287.aFloat4479,
					       (993680393
						* Class357_Sub1.anInt10357),
					       445026273)
		      - client.anInt8385 * 1957253445),
		     970310639 * Class354_Sub2.anInt10492, i_34_, i_35_,
		     600 + (i_34_ >> 3) * 3 << 2, i, 1942156282);
		Class462.anInt6284
		    = (1680747237
		       * (int) (f * (float) (Class462.anInt6284 * 133333741
					     - (Class195.anInt2361
						* -2010331041))
				+ (float) (-2010331041 * Class195.anInt2361)));
		Class175.anInt2123
		    = ((int) ((float) (-781800491 * Class175.anInt2123
				       - -162776005 * Class200.anInt2400) * f
			      + (float) (-162776005 * Class200.anInt2400))
		       * -1365297795);
		Class636.anInt8248
		    = (-1181860511
		       * (int) (f * (float) (Class636.anInt8248 * -271636831
					     - (1588828683
						* Class120_Sub7.anInt10496))
				+ (float) (1588828683
					   * Class120_Sub7.anInt10496)));
		Class496.anInt6527
		    = (709117373
		       * (int) (f * (float) (-1323229803 * Class496.anInt6527
					     - Class507.anInt6670 * 1143039205)
				+ (float) (1143039205 * Class507.anInt6670)));
		i_33_ = (-2112344687 * Class322.anInt4909
			 - -1015355577 * Class450.anInt6207);
		if (i_33_ > 8192)
		    i_33_ -= 16384;
		else if (i_33_ < -8192)
		    i_33_ += 16384;
	    }
	    Class322.anInt4909
		= ((int) ((float) i_33_ * f
			  + (float) (-1015355577 * Class450.anInt6207))
		   * 2118136689);
	    Class322.anInt4909
		= 2118136689 * (-2112344687 * Class322.anInt4909 & 0x3fff);
	    client.anInt8398
		= (-435554359
		   * (int) ((float) (-859437201 * Class254.anInt4133)
			    + f * (float) (424661625 * client.anInt8398
					   - (Class254.anInt4133
					      * -859437201))));
	}
    }
    
    public static final void method2931(Class89 class89, Class409 class409,
					Class409 class409_36_, int i) {
	if (class409.method7367(-1073933157)
	    && class409_36_.method7367(1169662187)) {
	    AnimationDefinition class549 = ((Class409) class409).aClass549_5922;
	    AnimationDefinition class549_37_ = ((Class409) class409_36_).aClass549_5922;
	    class89.method1881
		((((Class444) ((Class409) class409).aClass444_5917)
		  .aClass241_Sub39_Sub2_6171),
		 (((Class444) ((Class409) class409).aClass444_5917).anInt6167
		  * 1417332431),
		 (((Class444) ((Class409) class409).aClass444_5917)
		  .aClass241_Sub39_Sub2_6170),
		 -1124323391 * ((Class444) (((Class409) class409)
					    .aClass444_5917)).anInt6168,
		 604859731 * ((Class409) class409).anInt5921,
		 (class549.frameDurations
		  [-105753621 * ((Class409) class409).anInt5929]),
		 (((Class444) ((Class409) class409_36_).aClass444_5917)
		  .aClass241_Sub39_Sub2_6171),
		 (((Class444) ((Class409) class409_36_).aClass444_5917)
		  .anInt6167) * 1417332431,
		 (((Class444) ((Class409) class409_36_).aClass444_5917)
		  .aClass241_Sub39_Sub2_6170),
		 -1124323391 * ((Class444) (((Class409) class409_36_)
					    .aClass444_5917)).anInt6168,
		 604859731 * ((Class409) class409_36_).anInt5921,
		 (class549_37_.frameDurations
		  [-105753621 * ((Class409) class409_36_).anInt5929]),
		 (class549.config != null
		  ? class549.config.aBoolArray7014 : null),
		 class549.aBool7083 | class549_37_.aBool7083);
	}
    }
}
