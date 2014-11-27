/* Class475_Sub1_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class475_Sub1_Sub4_Sub2 extends Class475_Sub1_Sub4
    implements Interface24
{
    boolean aBool11363 = true;
    boolean aBool11364;
    Class535 aClass535_11365;
    public Class248 aClass248_11366;
    
    public int method11() {
	return ((Class248) aClass248_11366).anInt3983 * 1815958437;
    }
    
    boolean method14469(byte i) {
	return false;
    }
    
    public boolean method156() {
	return true;
    }
    
    public void method141(Class103 class103) {
	aClass248_11366.method4962(class103, (byte) -32);
    }
    
    public int method14468(byte i) {
	return aClass248_11366.method4955(1050475886);
    }
    
    public void method145(Class103 class103, byte i) {
	aClass248_11366.method4963(class103, 182412043);
    }
    
    Class542 method14455(Class103 class103, int i) {
	Class89 class89 = aClass248_11366.method4975(class103, 2048, false,
						     true, -2055313836);
	if (null == class89)
	    return null;
	Class266 class266 = method10893();
	Class276 class276 = method10874();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub4_Sub2) this).aBool11364,
				  -2130131805);
	int i_0_ = (int) class276.aClass287_4386.aFloat4477 >> 9;
	int i_1_ = (int) class276.aClass287_4386.aFloat4479 >> 9;
	aClass248_11366.method4960(class103, class89, class266, i_0_, i_0_,
				   i_1_, i_1_, true, (byte) 1);
	ObjectDefinition class526 = aClass248_11366.method4958(-1190642159);
	if (null != class526.aClass272_6905) {
	    class89.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0],
				class526.aClass272_6905);
	} else
	    class89.method1890(class266, aClass97Array8748[0], 0);
	if (null != ((Class248) aClass248_11366).aClass489_3991) {
	    Class98 class98
		= ((Class248) aClass248_11366).aClass489_3991.method11164();
	    class103.method2305(class98);
	}
	((Class475_Sub1_Sub4_Sub2) this).aBool11363
	    = (class89.method2052()
	       || ((Class248) aClass248_11366).aClass489_3991 != null);
	if (null == ((Class475_Sub1_Sub4_Sub2) this).aClass535_11365)
	    ((Class475_Sub1_Sub4_Sub2) this).aClass535_11365
		= Class109.method2768((int) class276.aClass287_4386.aFloat4477,
				      (int) class276.aClass287_4386.aFloat4474,
				      (int) class276.aClass287_4386.aFloat4479,
				      class89, 516487044);
	else
	    Class122.method2986((((Class475_Sub1_Sub4_Sub2) this)
				 .aClass535_11365),
				(int) class276.aClass287_4386.aFloat4477,
				(int) class276.aClass287_4386.aFloat4474,
				(int) class276.aClass287_4386.aFloat4479,
				class89, 1673966361);
	return class542;
    }
    
    public int method14464(int i) {
	return aClass248_11366.method4957((short) 7398);
    }
    
    boolean method14448(Class103 class103, int i, int i_2_, int i_3_) {
	ObjectDefinition class526 = aClass248_11366.method4958(650040984);
	if (class526.aClass272_6905 != null)
	    return class103.method2280(i, i_2_, method10893(),
				       class526.aClass272_6905, (byte) -96);
	Class89 class89 = aClass248_11366.method4975(class103, 131072, false,
						     false, 500253916);
	if (class89 == null)
	    return false;
	return class89.method1891(i, i_2_, method10893(), false, 0);
    }
    
    final boolean method14450(int i) {
	return false;
    }
    
    final void method14453(Class103 class103, Class475_Sub1 class475_sub1,
			   int i, int i_4_, int i_5_, boolean bool, int i_6_) {
	throw new IllegalStateException();
    }
    
    public int method9() {
	return -756151697 * ((Class248) aClass248_11366).anInt3973;
    }
    
    public int method146(byte i) {
	return -756151697 * ((Class248) aClass248_11366).anInt3973;
    }
    
    public int method139(int i) {
	return ((Class248) aClass248_11366).anInt3983 * 1815958437;
    }
    
    final void method14483() {
	throw new IllegalStateException();
    }
    
    final void method14478() {
	throw new IllegalStateException();
    }
    
    public void method143(int i) {
	/* empty */
    }
    
    public boolean method157(byte i) {
	return true;
    }
    
    public boolean method142(int i) {
	return aClass248_11366.method4961((byte) 0);
    }
    
    public void method144(Class103 class103, int i) {
	aClass248_11366.method4962(class103, (byte) -48);
    }
    
    boolean method14488(Class103 class103, int i, int i_7_) {
	ObjectDefinition class526 = aClass248_11366.method4958(1462439073);
	if (class526.aClass272_6905 != null)
	    return class103.method2280(i, i_7_, method10893(),
				       class526.aClass272_6905, (byte) 46);
	Class89 class89 = aClass248_11366.method4975(class103, 131072, false,
						     false, 521114295);
	if (class89 == null)
	    return false;
	return class89.method1891(i, i_7_, method10893(), false, 0);
    }
    
    public Class475_Sub1_Sub4_Sub2
	(Class552 class552, Class103 class103, ObjectDefinitionLoader class532,
	 ObjectDefinition class526, int i, int i_8_, int i_9_, int i_10_, int i_11_,
	 boolean bool, int i_12_, int i_13_, int i_14_) {
	super(class552, i_9_, i_10_, i_11_, i, i_8_,
	      class526.anInt6883 * 1713647885);
	aClass248_11366
	    = new Class248(class103, class532, class526,
			   Class527.aClass527_6917.anInt6931 * -2030829961,
			   i_12_, i_8_, this, bool, i_13_, i_14_);
	((Class475_Sub1_Sub4_Sub2) this).aBool11364
	    = 0 != -1389471035 * class526.anInt6848 && !bool;
	method14465(1, -115043087);
    }
    
    void method14493(Class103 class103, byte i) {
	Class89 class89 = aClass248_11366.method4975(class103, 262144, true,
						     true, -1828801688);
	if (class89 != null) {
	    Class287 class287 = method10874().aClass287_4386;
	    int i_15_ = (int) class287.aFloat4477 >> 9;
	    int i_16_ = (int) class287.aFloat4479 >> 9;
	    aClass248_11366.method4960(class103, class89, method10893(), i_15_,
				       i_15_, i_16_, i_16_, false, (byte) 1);
	}
    }
    
    public void method17758(Class536 class536, int i) {
	aClass248_11366.method4956(class536, -1990884324);
    }
    
    public int method147() {
	return ((Class248) aClass248_11366).anInt3987 * 592978681;
    }
    
    public void method148() {
	/* empty */
    }
    
    public void method149() {
	/* empty */
    }
    
    public boolean method150() {
	return aClass248_11366.method4961((byte) 0);
    }
    
    public boolean method151() {
	return aClass248_11366.method4961((byte) 0);
    }
    
    public Class535 method14470(Class103 class103) {
	return ((Class475_Sub1_Sub4_Sub2) this).aClass535_11365;
    }
    
    public boolean method153() {
	return aClass248_11366.method4961((byte) 0);
    }
    
    boolean method14452(byte i) {
	return ((Class475_Sub1_Sub4_Sub2) this).aBool11363;
    }
    
    public boolean method138() {
	return true;
    }
    
    public boolean method152() {
	return true;
    }
    
    public int method10() {
	return ((Class248) aClass248_11366).anInt3983 * 1815958437;
    }
    
    public void method160(Class103 class103) {
	aClass248_11366.method4963(class103, 1380977924);
    }
    
    boolean method14466() {
	return false;
    }
    
    public void method159(Class103 class103) {
	aClass248_11366.method4962(class103, (byte) 61);
    }
    
    public boolean method154() {
	return true;
    }
    
    boolean method14467() {
	return ((Class475_Sub1_Sub4_Sub2) this).aBool11363;
    }
    
    boolean method14451() {
	return ((Class475_Sub1_Sub4_Sub2) this).aBool11363;
    }
    
    public int method14492() {
	return aClass248_11366.method4955(1448875905);
    }
    
    public boolean method155() {
	return aClass248_11366.method4961((byte) 0);
    }
    
    public int method14471() {
	return aClass248_11366.method4957((short) 21805);
    }
    
    Class542 method14472(Class103 class103) {
	Class89 class89 = aClass248_11366.method4975(class103, 2048, false,
						     true, -1957880578);
	if (null == class89)
	    return null;
	Class266 class266 = method10893();
	Class276 class276 = method10874();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub4_Sub2) this).aBool11364,
				  -2090703100);
	int i = (int) class276.aClass287_4386.aFloat4477 >> 9;
	int i_17_ = (int) class276.aClass287_4386.aFloat4479 >> 9;
	aClass248_11366.method4960(class103, class89, class266, i, i, i_17_,
				   i_17_, true, (byte) 1);
	ObjectDefinition class526 = aClass248_11366.method4958(-849093251);
	if (null != class526.aClass272_6905) {
	    class89.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0],
				class526.aClass272_6905);
	} else
	    class89.method1890(class266, aClass97Array8748[0], 0);
	if (null != ((Class248) aClass248_11366).aClass489_3991) {
	    Class98 class98
		= ((Class248) aClass248_11366).aClass489_3991.method11164();
	    class103.method2305(class98);
	}
	((Class475_Sub1_Sub4_Sub2) this).aBool11363
	    = (class89.method2052()
	       || ((Class248) aClass248_11366).aClass489_3991 != null);
	if (null == ((Class475_Sub1_Sub4_Sub2) this).aClass535_11365)
	    ((Class475_Sub1_Sub4_Sub2) this).aClass535_11365
		= Class109.method2768((int) class276.aClass287_4386.aFloat4477,
				      (int) class276.aClass287_4386.aFloat4474,
				      (int) class276.aClass287_4386.aFloat4479,
				      class89, 618006282);
	else
	    Class122.method2986((((Class475_Sub1_Sub4_Sub2) this)
				 .aClass535_11365),
				(int) class276.aClass287_4386.aFloat4477,
				(int) class276.aClass287_4386.aFloat4474,
				(int) class276.aClass287_4386.aFloat4479,
				class89, 1094649020);
	return class542;
    }
    
    Class542 method14473(Class103 class103) {
	Class89 class89 = aClass248_11366.method4975(class103, 2048, false,
						     true, 1857156269);
	if (null == class89)
	    return null;
	Class266 class266 = method10893();
	Class276 class276 = method10874();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub4_Sub2) this).aBool11364,
				  -2088451328);
	int i = (int) class276.aClass287_4386.aFloat4477 >> 9;
	int i_18_ = (int) class276.aClass287_4386.aFloat4479 >> 9;
	aClass248_11366.method4960(class103, class89, class266, i, i, i_18_,
				   i_18_, true, (byte) 1);
	ObjectDefinition class526 = aClass248_11366.method4958(201502037);
	if (null != class526.aClass272_6905) {
	    class89.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0],
				class526.aClass272_6905);
	} else
	    class89.method1890(class266, aClass97Array8748[0], 0);
	if (null != ((Class248) aClass248_11366).aClass489_3991) {
	    Class98 class98
		= ((Class248) aClass248_11366).aClass489_3991.method11164();
	    class103.method2305(class98);
	}
	((Class475_Sub1_Sub4_Sub2) this).aBool11363
	    = (class89.method2052()
	       || ((Class248) aClass248_11366).aClass489_3991 != null);
	if (null == ((Class475_Sub1_Sub4_Sub2) this).aClass535_11365)
	    ((Class475_Sub1_Sub4_Sub2) this).aClass535_11365
		= Class109.method2768((int) class276.aClass287_4386.aFloat4477,
				      (int) class276.aClass287_4386.aFloat4474,
				      (int) class276.aClass287_4386.aFloat4479,
				      class89, 1122145290);
	else
	    Class122.method2986((((Class475_Sub1_Sub4_Sub2) this)
				 .aClass535_11365),
				(int) class276.aClass287_4386.aFloat4477,
				(int) class276.aClass287_4386.aFloat4474,
				(int) class276.aClass287_4386.aFloat4479,
				class89, 2072251395);
	return class542;
    }
    
    Class542 method14474(Class103 class103) {
	Class89 class89 = aClass248_11366.method4975(class103, 2048, false,
						     true, -1889399221);
	if (null == class89)
	    return null;
	Class266 class266 = method10893();
	Class276 class276 = method10874();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub4_Sub2) this).aBool11364,
				  -2115040053);
	int i = (int) class276.aClass287_4386.aFloat4477 >> 9;
	int i_19_ = (int) class276.aClass287_4386.aFloat4479 >> 9;
	aClass248_11366.method4960(class103, class89, class266, i, i, i_19_,
				   i_19_, true, (byte) 1);
	ObjectDefinition class526 = aClass248_11366.method4958(1260699366);
	if (null != class526.aClass272_6905) {
	    class89.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0],
				class526.aClass272_6905);
	} else
	    class89.method1890(class266, aClass97Array8748[0], 0);
	if (null != ((Class248) aClass248_11366).aClass489_3991) {
	    Class98 class98
		= ((Class248) aClass248_11366).aClass489_3991.method11164();
	    class103.method2305(class98);
	}
	((Class475_Sub1_Sub4_Sub2) this).aBool11363
	    = (class89.method2052()
	       || ((Class248) aClass248_11366).aClass489_3991 != null);
	if (null == ((Class475_Sub1_Sub4_Sub2) this).aClass535_11365)
	    ((Class475_Sub1_Sub4_Sub2) this).aClass535_11365
		= Class109.method2768((int) class276.aClass287_4386.aFloat4477,
				      (int) class276.aClass287_4386.aFloat4474,
				      (int) class276.aClass287_4386.aFloat4479,
				      class89, 1498869138);
	else
	    Class122.method2986((((Class475_Sub1_Sub4_Sub2) this)
				 .aClass535_11365),
				(int) class276.aClass287_4386.aFloat4477,
				(int) class276.aClass287_4386.aFloat4474,
				(int) class276.aClass287_4386.aFloat4479,
				class89, 1337821510);
	return class542;
    }
    
    Class542 method14475(Class103 class103) {
	Class89 class89 = aClass248_11366.method4975(class103, 2048, false,
						     true, -1098430197);
	if (null == class89)
	    return null;
	Class266 class266 = method10893();
	Class276 class276 = method10874();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub4_Sub2) this).aBool11364,
				  -2133142727);
	int i = (int) class276.aClass287_4386.aFloat4477 >> 9;
	int i_20_ = (int) class276.aClass287_4386.aFloat4479 >> 9;
	aClass248_11366.method4960(class103, class89, class266, i, i, i_20_,
				   i_20_, true, (byte) 1);
	ObjectDefinition class526 = aClass248_11366.method4958(704750273);
	if (null != class526.aClass272_6905) {
	    class89.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0],
				class526.aClass272_6905);
	} else
	    class89.method1890(class266, aClass97Array8748[0], 0);
	if (null != ((Class248) aClass248_11366).aClass489_3991) {
	    Class98 class98
		= ((Class248) aClass248_11366).aClass489_3991.method11164();
	    class103.method2305(class98);
	}
	((Class475_Sub1_Sub4_Sub2) this).aBool11363
	    = (class89.method2052()
	       || ((Class248) aClass248_11366).aClass489_3991 != null);
	if (null == ((Class475_Sub1_Sub4_Sub2) this).aClass535_11365)
	    ((Class475_Sub1_Sub4_Sub2) this).aClass535_11365
		= Class109.method2768((int) class276.aClass287_4386.aFloat4477,
				      (int) class276.aClass287_4386.aFloat4474,
				      (int) class276.aClass287_4386.aFloat4479,
				      class89, 1816761256);
	else
	    Class122.method2986((((Class475_Sub1_Sub4_Sub2) this)
				 .aClass535_11365),
				(int) class276.aClass287_4386.aFloat4477,
				(int) class276.aClass287_4386.aFloat4474,
				(int) class276.aClass287_4386.aFloat4479,
				class89, 1806817739);
	return class542;
    }
    
    void method14476(Class103 class103) {
	Class89 class89 = aClass248_11366.method4975(class103, 262144, true,
						     true, 532209319);
	if (class89 != null) {
	    Class287 class287 = method10874().aClass287_4386;
	    int i = (int) class287.aFloat4477 >> 9;
	    int i_21_ = (int) class287.aFloat4479 >> 9;
	    aClass248_11366.method4960(class103, class89, method10893(), i, i,
				       i_21_, i_21_, false, (byte) 1);
	}
    }
    
    final boolean method14477() {
	return false;
    }
    
    final boolean method14456() {
	return false;
    }
    
    final boolean method14479() {
	return false;
    }
    
    final void method14480(Class103 class103, Class475_Sub1 class475_sub1,
			   int i, int i_22_, int i_23_, boolean bool) {
	throw new IllegalStateException();
    }
    
    final void method14481(Class103 class103, Class475_Sub1 class475_sub1,
			   int i, int i_24_, int i_25_, boolean bool) {
	throw new IllegalStateException();
    }
    
    final void method14482(Class103 class103, Class475_Sub1 class475_sub1,
			   int i, int i_26_, int i_27_, boolean bool) {
	throw new IllegalStateException();
    }
    
    public void method158(Class103 class103) {
	aClass248_11366.method4962(class103, (byte) -17);
    }
    
    public Class535 method14457(Class103 class103, int i) {
	return ((Class475_Sub1_Sub4_Sub2) this).aClass535_11365;
    }
    
    public int method140(int i) {
	return ((Class248) aClass248_11366).anInt3987 * 592978681;
    }
    
    public void method17759(Class536 class536) {
	aClass248_11366.method4956(class536, 1376801427);
    }
    
    public void method17760(Class536 class536) {
	aClass248_11366.method4956(class536, -1426948074);
    }
    
    final void method14454(byte i) {
	throw new IllegalStateException();
    }
    
    public static String method17761(Class241_Sub39_Sub11 class241_sub39_sub11,
				     int i) {
	if (Class16.aBool141 || null == class241_sub39_sub11)
	    return "";
	int[] is = Class213.method4309(class241_sub39_sub11, -1248545268);
	if (null == is)
	    return "";
	return Class221.method4476(is, (byte) -36);
    }
}
