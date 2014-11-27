/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class80
{
    HashTable aClass407_1139;
    Class241_Sub23[] aClass241_Sub23Array1140;
    Interface2 anInterface2_1141;
    
    public void method1788(int i, String string,
			   Class241_Sub23 class241_sub23) {
	Class241_Sub23 class241_sub23_0_ = method1790(string, (byte) -44);
	if (null != class241_sub23_0_
	    && i != 469498037 * ((Class241_Sub23) class241_sub23_0_).anInt9013)
	    throw new IllegalArgumentException(string);
	method1789(i, -557428999);
	if (i >= ((Class80) this).aClass241_Sub23Array1140.length) {
	    int i_1_;
	    for (i_1_ = ((Class80) this).aClass241_Sub23Array1140.length;
		 i >= i_1_; i_1_ += i_1_) {
		/* empty */
	    }
	    ((Class80) this).aClass407_1139 = new HashTable(i_1_);
	    for (int i_2_ = 0;
		 i_2_ < ((Class80) this).aClass241_Sub23Array1140.length;
		 i_2_++) {
		Class241_Sub23 class241_sub23_3_
		    = ((Class80) this).aClass241_Sub23Array1140[i_2_];
		if (null != class241_sub23_3_)
		    ((Class80) this).aClass407_1139.put
			(class241_sub23_3_,
			 4356572401218184725L * class241_sub23_3_.hashCode);
	    }
	    Class241_Sub23[] class241_sub23s = new Class241_Sub23[i_1_];
	    for (int i_4_ = 0;
		 i_4_ < ((Class80) this).aClass241_Sub23Array1140.length;
		 i_4_++)
		class241_sub23s[i_4_]
		    = ((Class80) this).aClass241_Sub23Array1140[i_4_];
	    ((Class80) this).aClass241_Sub23Array1140 = class241_sub23s;
	}
	((Class241_Sub23) class241_sub23).anInt9013 = 1877947805 * i;
	((Class241_Sub23) class241_sub23).aString9012 = string;
	((Class80) this).aClass407_1139.put
	    (class241_sub23,
	     ((Class80) this).anInterface2_1141.method22(string, 1321159592));
	((Class80) this).aClass241_Sub23Array1140[i] = class241_sub23;
    }
    
    void method1789(int i, int i_5_) {
	Class241_Sub23 class241_sub23 = method1794(i, -173689172);
	if (class241_sub23 != null) {
	    class241_sub23.remove((byte) 36);
	    ((Class80) this).aClass241_Sub23Array1140
		[469498037 * ((Class241_Sub23) class241_sub23).anInt9013]
		= null;
	}
    }
    
    public Class241_Sub23 method1790(String string, byte i) {
	long l
	    = ((Class80) this).anInterface2_1141.method22(string, 2073895926);
	for (Class241_Sub23 class241_sub23
		 = ((Class241_Sub23)
		    ((Class80) this).aClass407_1139.get(l));
	     null != class241_sub23;
	     class241_sub23 = (Class241_Sub23) ((Class80) this)
						   .aClass407_1139
						   .method7289((byte) 34)) {
	    if (((Class241_Sub23) class241_sub23).aString9012.equals(string))
		return class241_sub23;
	}
	return null;
    }
    
    void method1791(int i) {
	Class241_Sub23 class241_sub23 = method1794(i, 174068818);
	if (class241_sub23 != null) {
	    class241_sub23.remove((byte) 36);
	    ((Class80) this).aClass241_Sub23Array1140
		[469498037 * ((Class241_Sub23) class241_sub23).anInt9013]
		= null;
	}
    }
    
    void method1792(int i) {
	Class241_Sub23 class241_sub23 = method1794(i, 1185496333);
	if (class241_sub23 != null) {
	    class241_sub23.remove((byte) 36);
	    ((Class80) this).aClass241_Sub23Array1140
		[469498037 * ((Class241_Sub23) class241_sub23).anInt9013]
		= null;
	}
    }
    
    public Class241_Sub23 method1793(int i) {
	if (i >= ((Class80) this).aClass241_Sub23Array1140.length)
	    return null;
	return ((Class80) this).aClass241_Sub23Array1140[i];
    }
    
    public Class241_Sub23 method1794(int i, int i_6_) {
	if (i >= ((Class80) this).aClass241_Sub23Array1140.length)
	    return null;
	return ((Class80) this).aClass241_Sub23Array1140[i];
    }
    
    public Class241_Sub23 method1795(String string) {
	long l
	    = ((Class80) this).anInterface2_1141.method22(string, 648845770);
	for (Class241_Sub23 class241_sub23
		 = ((Class241_Sub23)
		    ((Class80) this).aClass407_1139.get(l));
	     null != class241_sub23;
	     class241_sub23 = (Class241_Sub23) ((Class80) this)
						   .aClass407_1139
						   .method7289((byte) -61)) {
	    if (((Class241_Sub23) class241_sub23).aString9012.equals(string))
		return class241_sub23;
	}
	return null;
    }
    
    public void method1796(int i, String string, Class241_Sub23 class241_sub23,
			   byte i_7_) {
	Class241_Sub23 class241_sub23_8_ = method1790(string, (byte) -44);
	if (null != class241_sub23_8_
	    && i != 469498037 * ((Class241_Sub23) class241_sub23_8_).anInt9013)
	    throw new IllegalArgumentException(string);
	method1789(i, -557428999);
	if (i >= ((Class80) this).aClass241_Sub23Array1140.length) {
	    int i_9_;
	    for (i_9_ = ((Class80) this).aClass241_Sub23Array1140.length;
		 i >= i_9_; i_9_ += i_9_) {
		/* empty */
	    }
	    ((Class80) this).aClass407_1139 = new HashTable(i_9_);
	    for (int i_10_ = 0;
		 i_10_ < ((Class80) this).aClass241_Sub23Array1140.length;
		 i_10_++) {
		Class241_Sub23 class241_sub23_11_
		    = ((Class80) this).aClass241_Sub23Array1140[i_10_];
		if (null != class241_sub23_11_)
		    ((Class80) this).aClass407_1139.put
			(class241_sub23_11_,
			 4356572401218184725L * class241_sub23_11_.hashCode);
	    }
	    Class241_Sub23[] class241_sub23s = new Class241_Sub23[i_9_];
	    for (int i_12_ = 0;
		 i_12_ < ((Class80) this).aClass241_Sub23Array1140.length;
		 i_12_++)
		class241_sub23s[i_12_]
		    = ((Class80) this).aClass241_Sub23Array1140[i_12_];
	    ((Class80) this).aClass241_Sub23Array1140 = class241_sub23s;
	}
	((Class241_Sub23) class241_sub23).anInt9013 = 1877947805 * i;
	((Class241_Sub23) class241_sub23).aString9012 = string;
	((Class80) this).aClass407_1139.put
	    (class241_sub23,
	     ((Class80) this).anInterface2_1141.method22(string, 391284443));
	((Class80) this).aClass241_Sub23Array1140[i] = class241_sub23;
    }
    
    void method1797(int i) {
	Class241_Sub23 class241_sub23 = method1794(i, -374611998);
	if (class241_sub23 != null) {
	    class241_sub23.remove((byte) 36);
	    ((Class80) this).aClass241_Sub23Array1140
		[469498037 * ((Class241_Sub23) class241_sub23).anInt9013]
		= null;
	}
    }
    
    void method1798(int i) {
	Class241_Sub23 class241_sub23 = method1794(i, 130904514);
	if (class241_sub23 != null) {
	    class241_sub23.remove((byte) 36);
	    ((Class80) this).aClass241_Sub23Array1140
		[469498037 * ((Class241_Sub23) class241_sub23).anInt9013]
		= null;
	}
    }
    
    public Class241_Sub23 method1799(String string) {
	long l
	    = ((Class80) this).anInterface2_1141.method22(string, 2024183305);
	for (Class241_Sub23 class241_sub23
		 = ((Class241_Sub23)
		    ((Class80) this).aClass407_1139.get(l));
	     null != class241_sub23;
	     class241_sub23 = (Class241_Sub23) ((Class80) this)
						   .aClass407_1139
						   .method7289((byte) -89)) {
	    if (((Class241_Sub23) class241_sub23).aString9012.equals(string))
		return class241_sub23;
	}
	return null;
    }
    
    public Class80(int i, Interface2 interface2) {
	int i_13_;
	for (i_13_ = 1; i_13_ < i; i_13_ += i_13_) {
	    /* empty */
	}
	((Class80) this).aClass407_1139 = new HashTable(i_13_);
	((Class80) this).aClass241_Sub23Array1140 = new Class241_Sub23[i_13_];
	((Class80) this).anInterface2_1141 = interface2;
    }
    
    public void method1800(int i, String string,
			   Class241_Sub23 class241_sub23) {
	Class241_Sub23 class241_sub23_14_ = method1790(string, (byte) 17);
	if (null != class241_sub23_14_
	    && i != (469498037
		     * ((Class241_Sub23) class241_sub23_14_).anInt9013))
	    throw new IllegalArgumentException(string);
	method1789(i, -557428999);
	if (i >= ((Class80) this).aClass241_Sub23Array1140.length) {
	    int i_15_;
	    for (i_15_ = ((Class80) this).aClass241_Sub23Array1140.length;
		 i >= i_15_; i_15_ += i_15_) {
		/* empty */
	    }
	    ((Class80) this).aClass407_1139 = new HashTable(i_15_);
	    for (int i_16_ = 0;
		 i_16_ < ((Class80) this).aClass241_Sub23Array1140.length;
		 i_16_++) {
		Class241_Sub23 class241_sub23_17_
		    = ((Class80) this).aClass241_Sub23Array1140[i_16_];
		if (null != class241_sub23_17_)
		    ((Class80) this).aClass407_1139.put
			(class241_sub23_17_,
			 4356572401218184725L * class241_sub23_17_.hashCode);
	    }
	    Class241_Sub23[] class241_sub23s = new Class241_Sub23[i_15_];
	    for (int i_18_ = 0;
		 i_18_ < ((Class80) this).aClass241_Sub23Array1140.length;
		 i_18_++)
		class241_sub23s[i_18_]
		    = ((Class80) this).aClass241_Sub23Array1140[i_18_];
	    ((Class80) this).aClass241_Sub23Array1140 = class241_sub23s;
	}
	((Class241_Sub23) class241_sub23).anInt9013 = 1877947805 * i;
	((Class241_Sub23) class241_sub23).aString9012 = string;
	((Class80) this).aClass407_1139.put
	    (class241_sub23,
	     ((Class80) this).anInterface2_1141.method22(string, 2071914244));
	((Class80) this).aClass241_Sub23Array1140[i] = class241_sub23;
    }
    
    public Class241_Sub23 method1801(int i) {
	if (i >= ((Class80) this).aClass241_Sub23Array1140.length)
	    return null;
	return ((Class80) this).aClass241_Sub23Array1140[i];
    }
    
    public void method1802(int i, String string,
			   Class241_Sub23 class241_sub23) {
	Class241_Sub23 class241_sub23_19_ = method1790(string, (byte) 1);
	if (null != class241_sub23_19_
	    && i != (469498037
		     * ((Class241_Sub23) class241_sub23_19_).anInt9013))
	    throw new IllegalArgumentException(string);
	method1789(i, -557428999);
	if (i >= ((Class80) this).aClass241_Sub23Array1140.length) {
	    int i_20_;
	    for (i_20_ = ((Class80) this).aClass241_Sub23Array1140.length;
		 i >= i_20_; i_20_ += i_20_) {
		/* empty */
	    }
	    ((Class80) this).aClass407_1139 = new HashTable(i_20_);
	    for (int i_21_ = 0;
		 i_21_ < ((Class80) this).aClass241_Sub23Array1140.length;
		 i_21_++) {
		Class241_Sub23 class241_sub23_22_
		    = ((Class80) this).aClass241_Sub23Array1140[i_21_];
		if (null != class241_sub23_22_)
		    ((Class80) this).aClass407_1139.put
			(class241_sub23_22_,
			 4356572401218184725L * class241_sub23_22_.hashCode);
	    }
	    Class241_Sub23[] class241_sub23s = new Class241_Sub23[i_20_];
	    for (int i_23_ = 0;
		 i_23_ < ((Class80) this).aClass241_Sub23Array1140.length;
		 i_23_++)
		class241_sub23s[i_23_]
		    = ((Class80) this).aClass241_Sub23Array1140[i_23_];
	    ((Class80) this).aClass241_Sub23Array1140 = class241_sub23s;
	}
	((Class241_Sub23) class241_sub23).anInt9013 = 1877947805 * i;
	((Class241_Sub23) class241_sub23).aString9012 = string;
	((Class80) this).aClass407_1139.put
	    (class241_sub23,
	     ((Class80) this).anInterface2_1141.method22(string, 583413581));
	((Class80) this).aClass241_Sub23Array1140[i] = class241_sub23;
    }
    
    static void method1803(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [((ClientScriptData) class454).intStackPointer * 1482319719 - 1]
	    = (Class326_Sub3.aClass482_10288.method11010
	       ((((ClientScriptData) class454).integerStack
		 [((ClientScriptData) class454).intStackPointer * 1482319719 - 1]),
		(short) -20071)
	       .anInt6428) * 1271292021;
    }
    
    static final void skipSteps/*method1804*/(ClientScriptData scriptData, int i) {
    	scriptData.step
	    	+= 1924545709 * scriptData.integerConstants[1938982693 * scriptData.step];
    }
    
    static final void setVarcompColour/*method1805*/(ClientScriptData scriptData, int i) {
		Class455 class455 = (scriptData.aBool6246 ? scriptData.aClass455_6230 : scriptData.aClass455_6229);
		InterfaceComponent component = ((Class455) class455).aClass58_6248;
		InterfaceDefinition iFace = ((Class455) class455).aClass35_6249;
		Class219.setComponentColour(component, iFace, scriptData, 1850102348);
    }
    
    static final void method1806(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	class58.flipVertically
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       == 1);
	WorldType.refreshComponent(class58, 1454155426);
    }
    
    static final void method1807(ClientScriptData class454, int i) {
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = new StringBuilder().append
		  (Class439.method7825
		   ((long) (((ClientScriptData) class454).integerStack
			    [((((ClientScriptData) class454).intStackPointer -= 1736754263)
			      * 1482319719)]) * 60000L,
		    VarPlayerDomain.currentLocale.getId((byte) 0), true,
		    -1539407924))
		  .append
		  (" UTC").toString();
    }
    
    static final void method1808(ClientScriptData class454, int i) {
	Class432.method7745((((ClientScriptData) class454)
			     .aClass475_Sub1_Sub2_Sub1_6223),
			    (((ClientScriptData) class454).integerStack
			     [((((ClientScriptData) class454).intStackPointer -= 1736754263)
			       * 1482319719)]),
			    true, 96094995);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (int) client.aFloatArray8336[0];
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (int) client.aFloatArray8336[1];
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (int) client.aFloatArray8336[2];
    }
    
    public static char method1809(byte i, int i_24_) {
		int i_25_ = i & 0xff;
		if (i_25_ == 0) {
		    throw new IllegalArgumentException(new StringBuilder().append("")
		    		.append(Integer.toString(i_25_, 16)).toString());
		}
		if (i_25_ >= 128 && i_25_ < 160) {
		    int i_26_ = Class462.shiftCharacters[i_25_ - 128];
		    if (0 == i_26_) {
		    	i_26_ = 63;
		    }
		    i_25_ = i_26_;
		}
		return (char) i_25_;
    }
}
