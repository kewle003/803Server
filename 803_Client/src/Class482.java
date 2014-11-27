/* Class482 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class482
{
    Class480[] aClass480Array6457;
    JS5 aClass210_6458;
    int anInt6459;
    static long aLong6460;
    
    public Class482(GameDefinition class471, Language class437, JS5 class210,
		    boolean bool) {
	((Class482) this).aClass210_6458 = class210;
	if (((Class482) this).aClass210_6458 != null)
	    ((Class482) this).anInt6459
		= ((((Class482) this).aClass210_6458.getContainerCount
		    (-1379677837 * Js5ConfigGroup.aClass37_418.id, (byte) -18))
		   * -1019379799);
	else
	    ((Class482) this).anInt6459 = 0;
	if (bool) {
	    ((Class482) this).aClass480Array6457
		= new Class480[((Class482) this).anInt6459 * -1987472231];
	    for (int i = 0; i < ((Class482) this).anInt6459 * -1987472231;
		 i++) {
		byte[] is;
		synchronized (((Class482) this).aClass210_6458) {
		    is = (((Class482) this).aClass210_6458.getfile
			  (Js5ConfigGroup.aClass37_418.id * -1379677837, i,
			   1822541276));
		}
		Class480 class480 = new Class480();
		if (is != null)
		    class480.method10978(new RSByteBuffer(is), (byte) 23);
		class480.method10962(392730774);
		((Class482) this).aClass480Array6457[i] = class480;
		((Class480) ((Class482) this).aClass480Array6457[i])
		    .aClass482_6426
		    = this;
	    }
	}
    }
    
    public Class480 method11010(int i, short i_0_) {
	return ((Class482) this).aClass480Array6457[i];
    }
    
    public Class480 method11011(int i) {
	return ((Class482) this).aClass480Array6457[i];
    }
    
    public Class480 method11012(int i) {
	return ((Class482) this).aClass480Array6457[i];
    }
    
    int method11013(Interface11 interface11, int i) {
	int i_1_ = 0;
	for (int i_2_ = 0; i_2_ < -1987472231 * ((Class482) this).anInt6459;
	     i_2_++) {
	    Class480 class480 = method11010(i_2_, (short) 20720);
	    if (class480.method10966(interface11, 1774384588))
		i_1_ += 1271292021 * class480.anInt6428;
	}
	return i_1_;
    }
    
    int method11014(Interface11 interface11) {
	int i = 0;
	for (int i_3_ = 0; i_3_ < -1987472231 * ((Class482) this).anInt6459;
	     i_3_++) {
	    Class480 class480 = method11010(i_3_, (short) -14467);
	    if (class480.method10966(interface11, 2018470966))
		i += 1271292021 * class480.anInt6428;
	}
	return i;
    }
    
    public Class480 method11015(int i) {
	return ((Class482) this).aClass480Array6457[i];
    }
    
    int method11016(Interface11 interface11) {
	int i = 0;
	for (int i_4_ = 0; i_4_ < -1987472231 * ((Class482) this).anInt6459;
	     i_4_++) {
	    Class480 class480 = method11010(i_4_, (short) -7891);
	    if (class480.method10966(interface11, 199485837))
		i += 1271292021 * class480.anInt6428;
	}
	return i;
    }
    
    public Class480 method11017(int i) {
	return ((Class482) this).aClass480Array6457[i];
    }
    
    int method11018(Interface11 interface11) {
	int i = 0;
	for (int i_5_ = 0; i_5_ < -1987472231 * ((Class482) this).anInt6459;
	     i_5_++) {
	    Class480 class480 = method11010(i_5_, (short) 12352);
	    if (class480.method10966(interface11, 1381982884))
		i += 1271292021 * class480.anInt6428;
	}
	return i;
    }
    
    int method11019(Interface11 interface11) {
	int i = 0;
	for (int i_6_ = 0; i_6_ < -1987472231 * ((Class482) this).anInt6459;
	     i_6_++) {
	    Class480 class480 = method11010(i_6_, (short) 21393);
	    if (class480.method10966(interface11, -727361012))
		i += 1271292021 * class480.anInt6428;
	}
	return i;
    }
    
    static final void method11020(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, byte i) {
	class58.aBool871
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       == 1);
	WorldType.refreshComponent(class58, 1522699428);
    }
    
    static final void method11021(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 1032303763 * class58.spriteID;
    }
    
    static final void method11022(ClientScriptData class454, int i) {
	NPC class475_sub1_sub1_sub3_sub2
	    = ((NPC)
	       ((ClientScriptData) class454).varEntity);
	String string = class475_sub1_sub1_sub3_sub2.npcName;
	NPCDefinition class401 = class475_sub1_sub1_sub3_sub2.definition;
	if (null != class401.transformTo) {
	    class401 = class401.method7176(Class1.aClass19_11,
					   Class1.aClass19_11, (byte) 94);
	    if (class401 == null)
		string = "";
	    else
		string = class401.name;
	}
	if (string == null)
	    string = "";
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = string;
    }
    
    public static String formatStringForProtocol/*method11023*/(CharSequence charsequence,
				     Class600 type, byte i) {
		if (charsequence == null)
		    return null;
		int start = 0;
		int end;
		for (end = charsequence.length();
		     (start < end
		      && Class494.isSeperator(charsequence.charAt(start), 170297199));
				start++) {
		    /* empty */
		}
		for (/**/;
				end > start && Class494.isSeperator(charsequence.charAt(end - 1), 170297199);
				end--) {
		    /* empty */
		}
		int length = end - start;
		if (length < 1 || length > Class324.getMaxLength(type, (short) 1143)) {
		    return null;
		}
		StringBuilder stringbuilder = new StringBuilder(length);
		for (int index = start; index < end; index++) {
		    char c = charsequence.charAt(index);
		    if (Class395.isValidCharacter(c, -1064837026)) {
				char c_11_ = Class565.encodeCharacter(c, (byte) 1);
				if ('\0' != c_11_) {
				    stringbuilder.append(c_11_);
				}
		    }
		}
		if (stringbuilder.length() == 0)
		    return null;
		return stringbuilder.toString();
    }
    
    static boolean method11024(Interface54 interface54,
			       Class241_Sub24 class241_sub24, int i) {
	return (null != interface54
		&& interface54.method423(class241_sub24,
					 client.anInterface58Array8318,
					 client.anInt8317 * 802559093,
					 Class119.aClass578_1564, 33228826));
    }
    
    public static void method11025(String[] strings, short[] is, byte i) {
	Class65.method1636(strings, is, 0, strings.length - 1, -558893018);
    }
    
    public static Class639 method11026(JS5 class210, int i, int i_12_) {
	byte[] is = class210.method4194(i, -751879396);
	if (null == is)
	    return null;
	return new Class639(is);
    }
}
