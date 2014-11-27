/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Map;

public class Class44
{
    static HashTable aClass407_609;
    static Map<Integer, Class41> aMap610 = new HashMap<Integer, Class41>();
    static Class410 aClass410_611;
    static int anInt612;
    
    static {
	aClass407_609 = new HashTable(1024);
	aClass410_611 = new Class410();
	anInt612 = 0;
    }
    
    public static ChatLine method1078(int i, int i_0_) {
	Class41 class41 = (Class41) aMap610.get(Integer.valueOf(i));
	return class41.method1053(i_0_, -1682575931);
    }
    
    public static int method1079(int i) {
	ChatLine class241_sub39_sub4
	    = (ChatLine) aClass407_609.get((long) i);
	if (class241_sub39_sub4 == null)
	    return -1;
	if (class241_sub39_sub4.aClass241_Sub39_10148
	    == aClass410_611.aClass241_Sub39_5934)
	    return -1;
	return (608603855
		* ((ChatLine)
		   class241_sub39_sub4.aClass241_Sub39_10148).anInt10834);
    }
    
    static int method1080() {
	return (anInt612 += 2009106375) * 1909524983 - 1;
    }
    
    static int method1081() {
	return (anInt612 += 2009106375) * 1909524983 - 1;
    }
    
    public static void method1082(String string) {
	Class318.appendChatboxMessage(0, 0, "", "", "", string, -2056949895);
    }
    
    public static void method1083(int i, String string) {
	Class318.appendChatboxMessage(i, 0, "", "", "", string, -1965425447);
    }
    
    public static void method1084(int i, int i_1_, String string,
				  String string_2_, String string_3_,
				  String string_4_) {
	Class337.showChatMessage(i, i_1_, string, string_2_, string_3_, string_4_,
			    null, -1, (byte) 1);
    }
    
    public static void method1085(int i, int i_5_, String string,
				  String string_6_, String string_7_,
				  String string_8_) {
	Class337.showChatMessage(i, i_5_, string, string_6_, string_7_, string_8_,
			    null, -1, (byte) 1);
    }
    
    public static void method1086(int i, int i_9_, String string,
				  String string_10_, String string_11_,
				  String string_12_) {
	Class337.showChatMessage(i, i_9_, string, string_10_, string_11_,
			    string_12_, null, -1, (byte) 1);
    }
    
    public static void method1087
	(int i, int i_13_, String string, String string_14_, String string_15_,
	 String string_16_, String string_17_, int i_18_) {
	Class41 class41 = (Class41) aMap610.get(Integer.valueOf(i));
	if (null == class41) {
	    class41 = new Class41();
	    aMap610.put(Integer.valueOf(i), class41);
	}
	ChatLine class241_sub39_sub4
	    = class41.method1052(i, i_13_, string, string_14_, string_15_,
				 string_16_, string_17_, i_18_, (byte) 122);
	aClass407_609.put(class241_sub39_sub4,
				 (long) (class241_sub39_sub4.anInt10834
					 * 608603855));
	aClass410_611.method7431(class241_sub39_sub4, (byte) -106);
	client.lastChatUpdate = client.anInt8494 * -531694491;
    }
    
    public static void method1088() {
	aMap610.clear();
	aClass407_609.method7293(398099221);
	aClass410_611.method7434(-704688817);
	anInt612 = 0;
    }
    
    public static ChatLine method1089(int i) {
	return (ChatLine) aClass407_609.get((long) i);
    }
    
    public static ChatLine method1090(int i) {
	return (ChatLine) aClass407_609.get((long) i);
    }
    
    public static int method1091(int i) {
	Class41 class41 = (Class41) aMap610.get(Integer.valueOf(i));
	if (class41 == null)
	    return 0;
	return class41.method1054(1654538594);
    }
    
    public static int method1092(int i) {
	Class41 class41 = (Class41) aMap610.get(Integer.valueOf(i));
	if (class41 == null)
	    return 0;
	return class41.method1054(1627732123);
    }
    
    public static int method1093(int i) {
	Class41 class41 = (Class41) aMap610.get(Integer.valueOf(i));
	if (class41 == null)
	    return 0;
	return class41.method1054(1917745088);
    }
    
    public static int method1094(int i) {
	ChatLine class241_sub39_sub4
	    = (ChatLine) aClass407_609.get((long) i);
	if (class241_sub39_sub4 == null)
	    return -1;
	if (class241_sub39_sub4.aClass241_Sub39_10148
	    == aClass410_611.aClass241_Sub39_5934)
	    return -1;
	return (608603855
		* ((ChatLine)
		   class241_sub39_sub4.aClass241_Sub39_10148).anInt10834);
    }
    
    Class44() throws Throwable {
	throw new Error();
    }
    
    public static void method1095() {
	aMap610.clear();
	aClass407_609.method7293(-1287286682);
	aClass410_611.method7434(-1479482664);
	anInt612 = 0;
    }
    
    static int method1096() {
	return (anInt612 += 2009106375) * 1909524983 - 1;
    }
    
    public static int method1097(int i) {
	ChatLine class241_sub39_sub4
	    = (ChatLine) aClass407_609.get((long) i);
	if (class241_sub39_sub4 == null)
	    return -1;
	if (class241_sub39_sub4.aClass241_Sub39_10148
	    == aClass410_611.aClass241_Sub39_5934)
	    return -1;
	return (608603855
		* ((ChatLine)
		   class241_sub39_sub4.aClass241_Sub39_10148).anInt10834);
    }
    
    public static int method1098(int i) {
	Class41 class41 = (Class41) aMap610.get(Integer.valueOf(i));
	if (class41 == null)
	    return 0;
	return class41.method1054(2006576229);
    }
    
    public static int method1099(int i) {
	ChatLine class241_sub39_sub4
	    = (ChatLine) aClass407_609.get((long) i);
	if (class241_sub39_sub4 == null)
	    return -1;
	if (class241_sub39_sub4.aClass241_Sub39_10148
	    == aClass410_611.aClass241_Sub39_5934)
	    return -1;
	return (608603855
		* ((ChatLine)
		   class241_sub39_sub4.aClass241_Sub39_10148).anInt10834);
    }
    
    static void method1100(Class103 class103, int i) {
	class103.method2445(0, 0, -1080559003 * Class494.canvasWid, 350);
	class103.method2396(0, 0, -1080559003 * Class494.canvasWid, 350,
			    -1737125585 * Class185.anInt2176 << 24 | 0xff0000,
			    1);
	int i_19_ = 350 / (1090468407 * Class185.anInt2183);
	if (Class185.anInt2179 * 310017649 > 0) {
	    int i_20_ = 346 - 1090468407 * Class185.anInt2183 - 4;
	    int i_21_
		= i_20_ * i_19_ / (310017649 * Class185.anInt2179 + i_19_ - 1);
	    int i_22_ = 4;
	    if (310017649 * Class185.anInt2179 > 1)
		i_22_ += ((i_20_ - i_21_)
			  * (Class185.anInt2179 * 310017649 - 1
			     - -1770035745 * Class185.anInt2184)
			  / (310017649 * Class185.anInt2179 - 1));
	    class103.method2396(Class494.canvasWid * -1080559003 - 16, i_22_,
				12, i_21_,
				(Class185.anInt2176 * -1737125585 << 24
				 | 0xff0000),
				2);
	    for (int i_23_ = Class185.anInt2184 * -1770035745;
		 (i_23_ < Class185.anInt2184 * -1770035745 + i_19_
		  && i_23_ < 310017649 * Class185.anInt2179);
		 i_23_++) {
		String[] strings
		    = Class225.method4625((Exception_Sub3.aStringArray10694
					   [i_23_]),
					  '\010', 374665614);
		int i_24_ = ((Class494.canvasWid * -1080559003 - 8 - 16)
			     / strings.length);
		for (int i_25_ = 0; i_25_ < strings.length; i_25_++) {
		    int i_26_ = i_24_ * i_25_ + 8;
		    class103.method2445(i_26_, 0, i_24_ + i_26_ - 8, 350);
		    Class5.aClass96_26.method2128
			(Class639.method13608(strings[i_25_], -715151247),
			 i_26_,
			 (350 - 131516167 * Class185.anInt2177 - 2
			  - 326424439 * Class5.aClass639_25.anInt8260
			  - ((i_23_ - -1770035745 * Class185.anInt2184)
			     * (1090468407 * Class185.anInt2183))),
			 -1, -16777216, 1841717961);
		}
	    }
	}
	Class247_Sub2.aClass96_10073.method2112("RuneLove Build: 1",
						(Class494.canvasWid
						 * -1080559003) - 25,
						330, -1, -16777216,
						-1622755670);
	class103.method2445(0, 0, -1080559003 * Class494.canvasWid, 350);
	class103.method2265(0, 350 - 131516167 * Class185.anInt2177,
			    -1080559003 * Class494.canvasWid, -1, -299627872);
	Class81.aClass96_1149.method2128
	    (new StringBuilder().append("--> ").append
		 (Class639.method13608(Class185.aString2181, -1742279191))
		 .toString(),
	     10, 350 - 326424439 * Class5.aClass639_19.anInt8260 - 1, -1,
	     -16777216, 1841717961);
	if (Class47.isWindowFocused) {
	    int i_27_ = -1;
	    if (client.anInt8296 % 30 > 15)
		i_27_ = 16777215;
	    class103.method2241
		(10 + (Class5.aClass639_19.method13562
		       (new StringBuilder().append("--> ").append
			    (Class639.method13608
				 (Class185.aString2181, -657228699)
				 .substring(0, Class185.anInt2182 * 586767557))
			    .toString(),
			(byte) 53)),
		 350 - Class5.aClass639_19.anInt8260 * 326424439 - 11, 12,
		 i_27_, -517857856);
	}
	class103.method2572();
	Class619.method13329(1134879147);
    }
    
    static final void method1101(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class463.method10678(class58, class35, class454, 1863429513);
    }
    
    static final void method1102(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_28_ = 10;
	byte[] is = { (byte) ((ClientScriptData) class454).integerStack
			     [1482319719 * ((ClientScriptData) class454).intStackPointer] };
	byte[] is_29_
	    = { (byte) ((ClientScriptData) class454).integerStack
		       [((ClientScriptData) class454).intStackPointer * 1482319719 + 1] };
	Class120_Sub21.method16849(class58, i_28_, is, is_29_, class454,
				   1731851693);
    }
    
    static final void method1103(ClientScriptData class454, byte i) {
	int i_30_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_30_, (byte) -51);
	Class83.method1831(class58, class454, (byte) 17);
    }
    
    static Class628_Sub1 method1104(int i) {
	Class628_Sub1 class628_sub1 = new Class628_Sub1();
	boolean bool = false;
	boolean bool_31_ = false;
	boolean bool_32_ = false;
	if (Class83.osName.startsWith("win")) {
	    bool_31_ = true;
	    bool = true;
	    bool_32_ = true;
	} else {
	    bool = true;
	    bool_32_ = true;
	}
	if (Class200.aBool2395) {
	    class628_sub1.method14313(16, (byte) 11);
	    bool = false;
	}
	if (Class200.aBool2397) {
	    class628_sub1.method14313(32, (byte) -25);
	    bool_31_ = false;
	}
	if (Class200.aBool2392) {
	    class628_sub1.method14313(16384, (byte) -21);
	    bool_32_ = false;
	}
	if (!bool && !bool_31_) {
	    Class293.method5694(class628_sub1, (byte) -46);
	    return class628_sub1;
	}
	int i_33_ = -1;
	int i_34_ = -1;
	int i_35_ = -1;
	if (bool_31_) {
	    try {
		Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		    ((Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .aClass445_Sub25_8884),
		     3, (byte) 2);
		Class167.method3600((short) 5622);
		i_34_ = Class129.method3065(3, 1000, 35761331);
		if (Class241_Sub5_Sub9.aClass241_Sub9_11043
			.aClass445_Sub11_8893.method14197((byte) -6)
		    == 3) {
		    class628_sub1.method14313(4, (byte) 15);
		    Class174 class174 = Class236.aClass103_2713.method2623();
		    long l = (3790016697209787005L * class174.aLong2100
			      & 0xffffffffffffL);
		    switch (class174.anInt2104 * 824514313) {
		    case 4098: {
			boolean bool_36_ = l >= 60129613779L;
			bool &= bool_36_;
			if (!bool_36_)
			    class628_sub1.method14313(512, (byte) 52);
			break;
		    }
		    case 4318: {
			boolean bool_37_ = l >= 64425238954L;
			bool &= bool_37_;
			if (!bool_37_)
			    class628_sub1.method14313(256, (byte) 61);
			break;
		    }
		    }
		}
	    } catch (Exception exception) {
		class628_sub1.method14313(4096, (byte) -16);
	    }
	}
	if (bool_32_) {
	    try {
		Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		    ((Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .aClass445_Sub25_8884),
		     5, (byte) 2);
		Class167.method3600((short) 6694);
		i_35_ = Class129.method3065(5, 1000, -131069130);
		if (Class241_Sub5_Sub9.aClass241_Sub9_11043
			.aClass445_Sub11_8893.method14197((byte) 76)
		    == 5)
		    class628_sub1.method14313(8192, (byte) 117);
	    } catch (Exception exception) {
		class628_sub1.method14313(32768, (byte) -54);
	    }
	}
	if (bool) {
	    try {
		Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		    ((Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .aClass445_Sub25_8884),
		     4, (byte) 2);
		Class167.method3600((short) -3927);
		i_33_ = Class129.method3065(1, 1000, 953270839);
		if (Class241_Sub5_Sub9.aClass241_Sub9_11043
			.aClass445_Sub11_8893.method14197((byte) -2)
		    == 1)
		    class628_sub1.method14313(2, (byte) 107);
	    } catch (Exception exception) {
		class628_sub1.method14313(2048, (byte) 37);
	    }
	}
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub25_8884, 0,
	     (byte) 2);
	if (-1 == i_33_ && -1 == i_34_) {
	    Class293.method5694(class628_sub1, (byte) -120);
	    return class628_sub1;
	}
	class628_sub1.method14315(3, i_34_, 1043406246);
	class628_sub1.method14315(1, i_33_, 622081821);
	class628_sub1.method14315(5, i_35_, 620804509);
	i_34_ *= 1.3F;
	if (i_34_ > 100000 && i_33_ > 100000 || i_34_ > i_33_)
	    Class249.method5006(class628_sub1, 3, i_33_ == -1 ? i_34_ : i_33_,
				150958569);
	else
	    Class249.method5006(class628_sub1, 1, -1 == i_34_ ? i_33_ : i_34_,
				-1540857739);
	return class628_sub1;
    }
    
    static final void method1105(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (client.aClass58_8474 == null ? -1
	       : client.aClass58_8474.componentHash * 445907013);
    }
    
    static boolean method1106(int i, byte i_38_) {
	return i == 17 || 11 == i || 12 == i || 8 == i || 10 == i || 3 == i;
    }
    
    static final void method1107(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (Class8.extractVarWatchKeys(string, class454, (byte) -111) != null)
	    string = string.substring(0, string.length() - 1);
	class58.anObjectArray982
	    = Class299.extractCs2Params(string, class454, -129270230);
	class58.hasClientScript = true;
    }
    
    static final void method1108(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub14_8876
		  .method14226(-1546554467);
    }
}
