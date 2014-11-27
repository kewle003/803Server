/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class106
{
    public int anInt1487;
    public Class106 aClass106_1488;
    public int anInt1489;
    public int anInt1490;
    public int anInt1491;
    public int anInt1492;
    byte aByte1493;
    public int anInt1494;
    public int anInt1495;
    public int anInt1496;
    public int anInt1497;
    public int anInt1498;
    public int anInt1499;
    public int anInt1500;
    public int anInt1501;
    public int anInt1502;
    public static Class580 aClass580_1503;
    
    Class106 method2664(int i, int i_0_, int i_1_, int i_2_) {
	return new Class106(357275585 * anInt1494, i, i_0_, i_1_, i_2_,
			    ((Class106) this).aByte1493);
    }
    
    Class106 method2665(int i, int i_3_, int i_4_, int i_5_) {
	return new Class106(357275585 * anInt1494, i, i_3_, i_4_, i_5_,
			    ((Class106) this).aByte1493);
    }
    
    Class106 method2666(int i, int i_6_, int i_7_, int i_8_, byte i_9_) {
	return new Class106(357275585 * anInt1494, i, i_6_, i_7_, i_8_,
			    ((Class106) this).aByte1493);
    }
    
    public Class325 method2667() {
	return Class530.method11844(anInt1494 * 357275585, 615957373);
    }
    
    Class106(int i, int i_10_, int i_11_, int i_12_, int i_13_, byte i_14_) {
	anInt1494 = i * -206800831;
	anInt1489 = -690761695 * i_10_;
	anInt1490 = 293413 * i_11_;
	anInt1491 = i_12_ * -1115318109;
	anInt1492 = -348053417 * i_13_;
	((Class106) this).aByte1493 = i_14_;
    }
    
    Class106 method2668(int i, int i_15_, int i_16_, int i_17_) {
	return new Class106(357275585 * anInt1494, i, i_15_, i_16_, i_17_,
			    ((Class106) this).aByte1493);
    }
    
    public Class325 method2669(int i) {
	return Class530.method11844(anInt1494 * 357275585, -1114106326);
    }
    
    public Class325 method2670() {
	return Class530.method11844(anInt1494 * 357275585, 2122067588);
    }
    
    static final void method2671(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class241_Sub41.method16450(class58, class35, class454, -1389083928);
    }
    
    static final void method2672(ClientScriptData class454, byte i) {
	JSFunction.aClass348_5375.method6212((byte) 0);
    }
    
    static final void method2673(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (int) client.aFloat8406 >> 3;
    }
    
    static void method2674(Class103 class103, Class135 class135,
			   InterfaceComponent class58, int i, int i_18_, int i_19_,
			   int i_20_, int i_21_, byte i_22_) {
	Class515 class515
	    = Class441.aClass524_6158.method11745(i_21_, 426501344);
	if (class515 != null && class515.aBool6744
	    && class515.method11587(Class1.aClass19_11, Class1.aClass19_11,
				    655404656)) {
	    if (null != class515.anIntArray6737) {
		int[] is = new int[class515.anIntArray6737.length];
		for (int i_23_ = 0; i_23_ < is.length / 2; i_23_++) {
		    int i_24_;
		    if (4 == 115241065 * Class296.anInt4513)
			i_24_ = ((int) ((double) Class445_Sub16
						     .aClass351_Sub1_8660
						     .method6292((byte) 61)
					* 2607.5945876176133)
				 + client.anInt8513 * 390680985) & 0x3fff;
		    else if (115241065 * Class296.anInt4513 == 5)
			i_24_ = (int) client.aFloat8581 & 0x3fff;
		    else
			i_24_ = ((int) client.aFloat8581
				 + client.anInt8513 * 390680985) & 0x3fff;
		    int i_25_ = Class282.anIntArray4430[i_24_];
		    int i_26_ = Class282.anIntArray4441[i_24_];
		    if (Class296.anInt4513 * 115241065 != 5) {
			i_25_
			    = i_25_ * 256 / (256
					     + client.anInt8377 * 1747300637);
			i_26_ = i_26_ * 256 / (1747300637 * client.anInt8377
					       + 256);
		    }
		    is[i_23_ * 2]
			= ((((i_19_ + class515.anIntArray6737[2 * i_23_] * 4)
			     * i_26_)
			    + (i_25_
			       * (4 * class515.anIntArray6737[1 + 2 * i_23_]
				  + i_20_)))
			   >> 14) + (class58.anInt850 * 439139681 / 2 + i);
		    is[2 * i_23_ + 1]
			= (i_18_ + 1463495207 * class58.scrollMinY / 2
			   - ((i_26_ * (i_20_ + (class515.anIntArray6737
						 [2 * i_23_ + 1]) * 4)
			       - (i_25_
				  * (4 * class515.anIntArray6737[i_23_ * 2]
				     + i_19_)))
			      >> 14));
		}
		Class118 class118 = class58.method1518(class103, -1704525550);
		if (null != class118)
		    Class99.method2177(class103, is,
				       1002290129 * class515.anInt6761,
				       class118.anIntArray1555,
				       class118.anIntArray1557);
		if (1183606681 * class515.anInt6762 > 0) {
		    for (int i_27_ = 0; i_27_ < is.length / 2 - 1; i_27_++) {
			int i_28_ = is[i_27_ * 2];
			int i_29_ = is[1 + 2 * i_27_];
			int i_30_ = is[2 * (i_27_ + 1)];
			int i_31_ = is[1 + 2 * (1 + i_27_)];
			if (i_30_ < i_28_) {
			    int i_32_ = i_28_;
			    int i_33_ = i_29_;
			    i_28_ = i_30_;
			    i_29_ = i_31_;
			    i_30_ = i_32_;
			    i_31_ = i_33_;
			} else if (i_30_ == i_28_ && i_31_ < i_29_) {
			    int i_34_ = i_29_;
			    i_29_ = i_31_;
			    i_31_ = i_34_;
			}
			if (class135 != null)
			    class103.method2297
				(i_28_, i_29_, i_30_, i_31_,
				 (class515.anIntArray6758
				  [class515.aByteArray6768[i_27_] & 0xff]),
				 1, class135, i, i_18_,
				 1183606681 * class515.anInt6762,
				 2024392745 * class515.anInt6763,
				 -1103664939 * class515.anInt6764);
			else
			    class103.method2276
				(i_28_, i_29_, i_30_, i_31_,
				 (class515.anIntArray6758
				  [class515.aByteArray6768[i_27_] & 0xff]),
				 1, class515.anInt6762 * 1183606681,
				 class515.anInt6763 * 2024392745,
				 -1103664939 * class515.anInt6764);
		    }
		    int i_35_ = is[is.length - 2];
		    int i_36_ = is[is.length - 1];
		    int i_37_ = is[0];
		    int i_38_ = is[1];
		    if (i_37_ < i_35_) {
			int i_39_ = i_35_;
			int i_40_ = i_36_;
			i_35_ = i_37_;
			i_36_ = i_38_;
			i_37_ = i_39_;
			i_38_ = i_40_;
		    } else if (i_35_ == i_37_ && i_38_ < i_36_) {
			int i_41_ = i_36_;
			i_36_ = i_38_;
			i_38_ = i_41_;
		    }
		    if (null != class135)
			class103.method2297(i_35_, i_36_, i_37_, i_38_,
					    (class515.anIntArray6758
					     [(class515.aByteArray6768
					       [(class515.aByteArray6768.length
						 - 1)]) & 0xff]),
					    1, class135, i, i_18_,
					    class515.anInt6762 * 1183606681,
					    2024392745 * class515.anInt6763,
					    -1103664939 * class515.anInt6764);
		    else
			class103.method2276(i_35_, i_36_, i_37_, i_38_,
					    (class515.anIntArray6758
					     [(class515.aByteArray6768
					       [(class515.aByteArray6768.length
						 - 1)]) & 0xff]),
					    1, class515.anInt6762 * 1183606681,
					    2024392745 * class515.anInt6763,
					    class515.anInt6764 * -1103664939);
		} else if (class135 != null) {
		    for (int i_42_ = 0; i_42_ < is.length / 2 - 1; i_42_++)
			class103.method2380(is[i_42_ * 2], is[2 * i_42_ + 1],
					    is[2 * (1 + i_42_)],
					    is[1 + 2 * (1 + i_42_)],
					    (class515.anIntArray6758
					     [(class515.aByteArray6768[i_42_]
					       & 0xff)]),
					    1, class135, i, i_18_);
		    class103.method2380(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class515.anIntArray6758
					 [(class515.aByteArray6768
					   [(class515.aByteArray6768.length
					     - 1)]) & 0xff]),
					1, class135, i, i_18_);
		} else {
		    for (int i_43_ = 0; i_43_ < is.length / 2 - 1; i_43_++)
			class103.method2274(is[i_43_ * 2], is[1 + i_43_ * 2],
					    is[(1 + i_43_) * 2],
					    is[(1 + i_43_) * 2 + 1],
					    (class515.anIntArray6758
					     [(class515.aByteArray6768[i_43_]
					       & 0xff)]),
					    1);
		    class103.method2274(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class515.anIntArray6758
					 [(class515.aByteArray6768
					   [(class515.aByteArray6768.length
					     - 1)]) & 0xff]),
					1);
		}
	    }
	    Class168 class168 = null;
	    if (-1 != class515.anInt6772 * -705700883) {
		class168 = class515.method11579(class103, false, (byte) 2);
		if (null != class168)
		    Class212.method4293(class58, class135, i, i_18_, i_19_,
					i_20_, class168,
					(double) (987031167
						  * (Class128.aClass513_1589
						     .anInt6717)));
	    }
	    if (class515.aString6756 != null) {
		int i_44_ = 0;
		if (class168 != null)
		    i_44_ = class168.method3606();
		Class96 class96 = Class247_Sub2.aClass96_10073;
		Class639 class639 = Class494.aClass639_6519;
		if (1 == class515.anInt6760 * 723243945) {
		    class96 = Class5.aClass96_26;
		    class639 = Class5.aClass639_25;
		}
		if (723243945 * class515.anInt6760 == 2) {
		    class96 = Class81.aClass96_1149;
		    class639 = Class5.aClass639_19;
		}
		Class344.method6174(class58, class135, i, i_18_, i_19_, i_20_,
				    i_44_, class515.aString6756, class96,
				    class639, class515.anInt6750 * 2101573455,
				    (byte) 6);
	    }
	}
    }
    
    static final void method2675(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class345.method6177((byte) 47);
    }
    
    static final void method2676(int i, int i_45_) {
	if (Class54.method1301(i, null, (byte) 96))
	    Class72.method1743(Class187.aClass35Array2203[i].components,
			       -1, (short) 512);
    }
    
    static int method2677(Class241_Sub39_Sub10 class241_sub39_sub10,
			  Class639 class639, int i) {
	String string = Class334.method6068(class241_sub39_sub10, 334116024);
	return class639.method13579(string, Class133.aClass168Array1613,
				    1190536090);
    }
    
    static final void method2678(ClientScriptData class454, int i) {
	int i_46_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_46_, (byte) -61);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = -915226675 * class58.colourAlpha;
    }
}
