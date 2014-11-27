/* Class475_Sub1_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class475_Sub1_Sub5_Sub1 extends Class475_Sub1_Sub5
    implements Interface24
{
    public Class248 aClass248_11314;
    boolean aBool11315;
    Class535 aClass535_11316;
    boolean aBool11317 = true;
    
    public Class535 method14470(Class103 class103) {
	return ((Class475_Sub1_Sub5_Sub1) this).aClass535_11316;
    }
    
    public void method149() {
	/* empty */
    }
    
    boolean method14452(byte i) {
	return ((Class475_Sub1_Sub5_Sub1) this).aBool11317;
    }
    
    public Class535 method14457(Class103 class103, int i) {
	return ((Class475_Sub1_Sub5_Sub1) this).aClass535_11316;
    }
    
    public void method160(Class103 class103) {
	aClass248_11314.method4963(class103, 2103299949);
    }
    
    public int method14468(byte i) {
	return aClass248_11314.method4955(923991666);
    }
    
    public void method17718(Class536 class536, byte i) {
	aClass248_11314.method4956(class536, 718174500);
    }
    
    public int method14464(int i) {
	return aClass248_11314.method4957((short) 10688);
    }
    
    void method14493(Class103 class103, byte i) {
	Class89 class89 = aClass248_11314.method4975(class103, 262144, false,
						     true, 1189468865);
	if (class89 != null) {
	    Class266 class266 = method10893();
	    Class276 class276 = method10874();
	    int i_0_ = (int) class276.aClass287_4386.aFloat4477 >> 9;
	    int i_1_ = (int) class276.aClass287_4386.aFloat4479 >> 9;
	    aClass248_11314.method4960(class103, class89, class266, i_0_, i_0_,
				       i_1_, i_1_, false, (byte) 1);
	}
    }
    
    boolean method14448(Class103 class103, int i, int i_2_, int i_3_) {
	ObjectDefinition class526 = aClass248_11314.method4958(2032741381);
	if (null != class526.aClass272_6905)
	    return class103.method2280(i, i_2_, method10893(),
				       class526.aClass272_6905, (byte) 104);
	Class89 class89 = aClass248_11314.method4975(class103, 131072, false,
						     false, 2019130523);
	if (null == class89)
	    return false;
	return class89.method1891(i, i_2_, method10893(), false, 0);
    }
    
    public int method146(byte i) {
	return ((Class248) aClass248_11314).anInt3973 * -756151697;
    }
    
    public Class475_Sub1_Sub5_Sub1(Class552 class552, Class103 class103,
				   ObjectDefinitionLoader class532, ObjectDefinition class526, int i,
				   int i_4_, int i_5_, int i_6_, int i_7_,
				   boolean bool, int i_8_, int i_9_, int i_10_,
				   int i_11_, int i_12_, int i_13_) {
	super(class552, i_5_, i_6_, i_7_, i, i_4_, i_8_, i_9_);
	aClass248_11314 = new Class248(class103, class532, class526, i_10_,
				       i_11_, i_4_, this, bool, i_12_, i_13_);
	((Class475_Sub1_Sub5_Sub1) this).aBool11315
	    = class526.anInt6848 * -1389471035 != 0 && !bool;
	method14465(1, 535838374);
    }
    
    public int method140(int i) {
	return 592978681 * ((Class248) aClass248_11314).anInt3987;
    }
    
    public void method143(int i) {
	/* empty */
    }
    
    public boolean method157(byte i) {
	return true;
    }
    
    public boolean method142(int i) {
	return aClass248_11314.method4961((byte) 0);
    }
    
    Class542 method14474(Class103 class103) {
	Class89 class89 = aClass248_11314.method4975(class103, 2048, false,
						     true, -518496375);
	if (class89 == null)
	    return null;
	Class266 class266 = class103.method2595();
	class266.method5175(method10893());
	class266.method5133((float) aShort10749, 0.0F, (float) aShort10748);
	Class276 class276 = method10874();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub5_Sub1) this).aBool11315,
				  -2102975280);
	int i = (int) class276.aClass287_4386.aFloat4477 >> 9;
	int i_14_ = (int) class276.aClass287_4386.aFloat4479 >> 9;
	aClass248_11314.method4960(class103, class89, class266, i, i, i_14_,
				   i_14_, true, (byte) 1);
	ObjectDefinition class526 = aClass248_11314.method4958(-1323216863);
	if (class526.aClass272_6905 != null) {
	    class89.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0],
				class526.aClass272_6905);
	} else
	    class89.method1890(class266, aClass97Array8748[0], 0);
	if (((Class248) aClass248_11314).aClass489_3991 != null) {
	    Class98 class98
		= ((Class248) aClass248_11314).aClass489_3991.method11164();
	    class103.method2305(class98);
	}
	((Class475_Sub1_Sub5_Sub1) this).aBool11317
	    = (class89.method2052()
	       || ((Class248) aClass248_11314).aClass489_3991 != null);
	if (((Class475_Sub1_Sub5_Sub1) this).aClass535_11316 == null)
	    ((Class475_Sub1_Sub5_Sub1) this).aClass535_11316
		= Class109.method2768((int) class276.aClass287_4386.aFloat4477,
				      (int) class276.aClass287_4386.aFloat4474,
				      (int) class276.aClass287_4386.aFloat4479,
				      class89, 1882098218);
	else
	    Class122.method2986((((Class475_Sub1_Sub5_Sub1) this)
				 .aClass535_11316),
				(int) class276.aClass287_4386.aFloat4477,
				(int) class276.aClass287_4386.aFloat4474,
				(int) class276.aClass287_4386.aFloat4479,
				class89, 1856728403);
	return class542;
    }
    
    public void method17719(Class536 class536) {
	aClass248_11314.method4956(class536, 1551767356);
    }
    
    public int method9() {
	return ((Class248) aClass248_11314).anInt3973 * -756151697;
    }
    
    public int method10() {
	return 1815958437 * ((Class248) aClass248_11314).anInt3983;
    }
    
    public int method11() {
	return 1815958437 * ((Class248) aClass248_11314).anInt3983;
    }
    
    public void method144(Class103 class103, int i) {
	aClass248_11314.method4962(class103, (byte) 59);
    }
    
    public void method148() {
	/* empty */
    }
    
    void method14476(Class103 class103) {
	Class89 class89 = aClass248_11314.method4975(class103, 262144, false,
						     true, 237719350);
	if (class89 != null) {
	    Class266 class266 = method10893();
	    Class276 class276 = method10874();
	    int i = (int) class276.aClass287_4386.aFloat4477 >> 9;
	    int i_15_ = (int) class276.aClass287_4386.aFloat4479 >> 9;
	    aClass248_11314.method4960(class103, class89, class266, i, i,
				       i_15_, i_15_, false, (byte) 1);
	}
    }
    
    public boolean method138() {
	return true;
    }
    
    public boolean method151() {
	return aClass248_11314.method4961((byte) 0);
    }
    
    public boolean method155() {
	return aClass248_11314.method4961((byte) 0);
    }
    
    public boolean method153() {
	return aClass248_11314.method4961((byte) 0);
    }
    
    public boolean method154() {
	return true;
    }
    
    public boolean method152() {
	return true;
    }
    
    public boolean method150() {
	return aClass248_11314.method4961((byte) 0);
    }
    
    public boolean method156() {
	return true;
    }
    
    boolean method14467() {
	return ((Class475_Sub1_Sub5_Sub1) this).aBool11317;
    }
    
    public void method158(Class103 class103) {
	aClass248_11314.method4962(class103, (byte) 72);
    }
    
    public void method159(Class103 class103) {
	aClass248_11314.method4962(class103, (byte) 68);
    }
    
    boolean method14466() {
	return false;
    }
    
    public int method14492() {
	return aClass248_11314.method4955(1555299061);
    }
    
    boolean method14451() {
	return ((Class475_Sub1_Sub5_Sub1) this).aBool11317;
    }
    
    boolean method14469(byte i) {
	return false;
    }
    
    public void method141(Class103 class103) {
	aClass248_11314.method4962(class103, (byte) -46);
    }
    
    public int method14471() {
	return aClass248_11314.method4957((short) 10209);
    }
    
    Class542 method14472(Class103 class103) {
	Class89 class89 = aClass248_11314.method4975(class103, 2048, false,
						     true, 1072560724);
	if (class89 == null)
	    return null;
	Class266 class266 = class103.method2595();
	class266.method5175(method10893());
	class266.method5133((float) aShort10749, 0.0F, (float) aShort10748);
	Class276 class276 = method10874();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub5_Sub1) this).aBool11315,
				  -2106093563);
	int i = (int) class276.aClass287_4386.aFloat4477 >> 9;
	int i_16_ = (int) class276.aClass287_4386.aFloat4479 >> 9;
	aClass248_11314.method4960(class103, class89, class266, i, i, i_16_,
				   i_16_, true, (byte) 1);
	ObjectDefinition class526 = aClass248_11314.method4958(1658830885);
	if (class526.aClass272_6905 != null) {
	    class89.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0],
				class526.aClass272_6905);
	} else
	    class89.method1890(class266, aClass97Array8748[0], 0);
	if (((Class248) aClass248_11314).aClass489_3991 != null) {
	    Class98 class98
		= ((Class248) aClass248_11314).aClass489_3991.method11164();
	    class103.method2305(class98);
	}
	((Class475_Sub1_Sub5_Sub1) this).aBool11317
	    = (class89.method2052()
	       || ((Class248) aClass248_11314).aClass489_3991 != null);
	if (((Class475_Sub1_Sub5_Sub1) this).aClass535_11316 == null)
	    ((Class475_Sub1_Sub5_Sub1) this).aClass535_11316
		= Class109.method2768((int) class276.aClass287_4386.aFloat4477,
				      (int) class276.aClass287_4386.aFloat4474,
				      (int) class276.aClass287_4386.aFloat4479,
				      class89, 1556368208);
	else
	    Class122.method2986((((Class475_Sub1_Sub5_Sub1) this)
				 .aClass535_11316),
				(int) class276.aClass287_4386.aFloat4477,
				(int) class276.aClass287_4386.aFloat4474,
				(int) class276.aClass287_4386.aFloat4479,
				class89, 1796803665);
	return class542;
    }
    
    Class542 method14473(Class103 class103) {
	Class89 class89 = aClass248_11314.method4975(class103, 2048, false,
						     true, 939548285);
	if (class89 == null)
	    return null;
	Class266 class266 = class103.method2595();
	class266.method5175(method10893());
	class266.method5133((float) aShort10749, 0.0F, (float) aShort10748);
	Class276 class276 = method10874();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub5_Sub1) this).aBool11315,
				  -2141295889);
	int i = (int) class276.aClass287_4386.aFloat4477 >> 9;
	int i_17_ = (int) class276.aClass287_4386.aFloat4479 >> 9;
	aClass248_11314.method4960(class103, class89, class266, i, i, i_17_,
				   i_17_, true, (byte) 1);
	ObjectDefinition class526 = aClass248_11314.method4958(-1331111362);
	if (class526.aClass272_6905 != null) {
	    class89.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0],
				class526.aClass272_6905);
	} else
	    class89.method1890(class266, aClass97Array8748[0], 0);
	if (((Class248) aClass248_11314).aClass489_3991 != null) {
	    Class98 class98
		= ((Class248) aClass248_11314).aClass489_3991.method11164();
	    class103.method2305(class98);
	}
	((Class475_Sub1_Sub5_Sub1) this).aBool11317
	    = (class89.method2052()
	       || ((Class248) aClass248_11314).aClass489_3991 != null);
	if (((Class475_Sub1_Sub5_Sub1) this).aClass535_11316 == null)
	    ((Class475_Sub1_Sub5_Sub1) this).aClass535_11316
		= Class109.method2768((int) class276.aClass287_4386.aFloat4477,
				      (int) class276.aClass287_4386.aFloat4474,
				      (int) class276.aClass287_4386.aFloat4479,
				      class89, 631330577);
	else
	    Class122.method2986((((Class475_Sub1_Sub5_Sub1) this)
				 .aClass535_11316),
				(int) class276.aClass287_4386.aFloat4477,
				(int) class276.aClass287_4386.aFloat4474,
				(int) class276.aClass287_4386.aFloat4479,
				class89, 1587764897);
	return class542;
    }
    
    public void method17720(Class536 class536) {
	aClass248_11314.method4956(class536, 885746026);
    }
    
    Class542 method14475(Class103 class103) {
	Class89 class89 = aClass248_11314.method4975(class103, 2048, false,
						     true, 149095848);
	if (class89 == null)
	    return null;
	Class266 class266 = class103.method2595();
	class266.method5175(method10893());
	class266.method5133((float) aShort10749, 0.0F, (float) aShort10748);
	Class276 class276 = method10874();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub5_Sub1) this).aBool11315,
				  -2102153726);
	int i = (int) class276.aClass287_4386.aFloat4477 >> 9;
	int i_18_ = (int) class276.aClass287_4386.aFloat4479 >> 9;
	aClass248_11314.method4960(class103, class89, class266, i, i, i_18_,
				   i_18_, true, (byte) 1);
	ObjectDefinition class526 = aClass248_11314.method4958(-1323820947);
	if (class526.aClass272_6905 != null) {
	    class89.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0],
				class526.aClass272_6905);
	} else
	    class89.method1890(class266, aClass97Array8748[0], 0);
	if (((Class248) aClass248_11314).aClass489_3991 != null) {
	    Class98 class98
		= ((Class248) aClass248_11314).aClass489_3991.method11164();
	    class103.method2305(class98);
	}
	((Class475_Sub1_Sub5_Sub1) this).aBool11317
	    = (class89.method2052()
	       || ((Class248) aClass248_11314).aClass489_3991 != null);
	if (((Class475_Sub1_Sub5_Sub1) this).aClass535_11316 == null)
	    ((Class475_Sub1_Sub5_Sub1) this).aClass535_11316
		= Class109.method2768((int) class276.aClass287_4386.aFloat4477,
				      (int) class276.aClass287_4386.aFloat4474,
				      (int) class276.aClass287_4386.aFloat4479,
				      class89, 684114002);
	else
	    Class122.method2986((((Class475_Sub1_Sub5_Sub1) this)
				 .aClass535_11316),
				(int) class276.aClass287_4386.aFloat4477,
				(int) class276.aClass287_4386.aFloat4474,
				(int) class276.aClass287_4386.aFloat4479,
				class89, 1192652515);
	return class542;
    }
    
    public int method147() {
	return 592978681 * ((Class248) aClass248_11314).anInt3987;
    }
    
    public int method139(int i) {
	return 1815958437 * ((Class248) aClass248_11314).anInt3983;
    }
    
    boolean method14488(Class103 class103, int i, int i_19_) {
	ObjectDefinition class526 = aClass248_11314.method4958(964081447);
	if (null != class526.aClass272_6905)
	    return class103.method2280(i, i_19_, method10893(),
				       class526.aClass272_6905, (byte) -34);
	Class89 class89 = aClass248_11314.method4975(class103, 131072, false,
						     false, 1014106090);
	if (null == class89)
	    return false;
	return class89.method1891(i, i_19_, method10893(), false, 0);
    }
    
    public void method17721(Class536 class536) {
	aClass248_11314.method4956(class536, -404336264);
    }
    
    Class542 method14455(Class103 class103, int i) {
	Class89 class89 = aClass248_11314.method4975(class103, 2048, false,
						     true, -2122956880);
	if (class89 == null)
	    return null;
	Class266 class266 = class103.method2595();
	class266.method5175(method10893());
	class266.method5133((float) aShort10749, 0.0F, (float) aShort10748);
	Class276 class276 = method10874();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub5_Sub1) this).aBool11315,
				  -2090670455);
	int i_20_ = (int) class276.aClass287_4386.aFloat4477 >> 9;
	int i_21_ = (int) class276.aClass287_4386.aFloat4479 >> 9;
	aClass248_11314.method4960(class103, class89, class266, i_20_, i_20_,
				   i_21_, i_21_, true, (byte) 1);
	ObjectDefinition class526 = aClass248_11314.method4958(1892313506);
	if (class526.aClass272_6905 != null) {
	    class89.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0],
				class526.aClass272_6905);
	} else
	    class89.method1890(class266, aClass97Array8748[0], 0);
	if (((Class248) aClass248_11314).aClass489_3991 != null) {
	    Class98 class98
		= ((Class248) aClass248_11314).aClass489_3991.method11164();
	    class103.method2305(class98);
	}
	((Class475_Sub1_Sub5_Sub1) this).aBool11317
	    = (class89.method2052()
	       || ((Class248) aClass248_11314).aClass489_3991 != null);
	if (((Class475_Sub1_Sub5_Sub1) this).aClass535_11316 == null)
	    ((Class475_Sub1_Sub5_Sub1) this).aClass535_11316
		= Class109.method2768((int) class276.aClass287_4386.aFloat4477,
				      (int) class276.aClass287_4386.aFloat4474,
				      (int) class276.aClass287_4386.aFloat4479,
				      class89, 2017237509);
	else
	    Class122.method2986((((Class475_Sub1_Sub5_Sub1) this)
				 .aClass535_11316),
				(int) class276.aClass287_4386.aFloat4477,
				(int) class276.aClass287_4386.aFloat4474,
				(int) class276.aClass287_4386.aFloat4479,
				class89, 1977298333);
	return class542;
    }
    
    public void method17722(Class536 class536) {
	aClass248_11314.method4956(class536, 1364462235);
    }
    
    public void method145(Class103 class103, byte i) {
	aClass248_11314.method4963(class103, 53093767);
    }
    
    static final void method17723(InterfaceComponent class58, int i, ClientScriptData class454,
				  int i_22_) {
	if (class58.aByteArrayArray869 == null)
	    throw new RuntimeException();
	if (class58.anIntArray914 == null)
	    class58.anIntArray914 = new int[class58.aByteArrayArray869.length];
	class58.anIntArray914[i] = 2147483647;
    }
    
    public static String method17724(int i, int i_23_) {
    	return new StringBuilder().append("<img=").append(i).append(">").toString();
    }
}
