/* Class384 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class384 implements Interface39
{
    JS5 aClass210_5697;
    JS5 aClass210_5698;
    Class339 aClass339_5699;
    Class96 aClass96_5700;
    static Thread aThread5701;
    static int anInt5702;
    
    public boolean method107(int i) {
	boolean bool = true;
	if (!((Class384) this).aClass210_5698.method4250((-2076915363
							  * (((Class384) this)
							     .aClass339_5699
							     .anInt5116)),
							 -80783700))
	    bool = false;
	if (!((Class384) this).aClass210_5697.method4250(((((Class384) this)
							   .aClass339_5699
							   .anInt5116)
							  * -2076915363),
							 1444144747))
	    bool = false;
	return bool;
    }
    
    public void method191(int i) {
	Class639 class639
	    = Class482.method11026(((Class384) this).aClass210_5697,
				   -2076915363 * (((Class384) this)
						  .aClass339_5699.anInt5116),
				   -1996257515);
	((Class384) this).aClass96_5700
	    = (Class236.aClass103_2713.method2296
	       (class639,
		Class160.method3440(((Class384) this).aClass210_5698,
				    (((Class384) this).aClass339_5699.anInt5116
				     * -2076915363)),
		true));
    }
    
    public void method215(boolean bool, byte i) {
	if (bool) {
	    int i_0_
		= ((((Class384) this).aClass339_5699.aClass330_5107.method6031
		    (417662235 * ((Class384) this).aClass339_5699.anInt5114,
		     -2047397293 * client.anInt8432, 1606913252))
		   + ((Class384) this).aClass339_5699.anInt5111 * -201516259);
	    int i_1_
		= ((((Class384) this).aClass339_5699.aClass324_5106.method5965
		    (15015243 * ((Class384) this).aClass339_5699.anInt5115,
		     -533394329 * client.anInt8433, 2069415220))
		   + ((Class384) this).aClass339_5699.anInt5110 * 772242661);
	    ((Class384) this).aClass96_5700.method2114
		(((Class384) this).aClass339_5699.aString5113, i_0_, i_1_,
		 ((Class384) this).aClass339_5699.anInt5114 * 417662235,
		 ((Class384) this).aClass339_5699.anInt5115 * 15015243,
		 ((Class384) this).aClass339_5699.anInt5117 * -1430954941,
		 ((Class384) this).aClass339_5699.anInt5118 * -223677391,
		 353479903 * ((Class384) this).aClass339_5699.anInt5108,
		 621514609 * ((Class384) this).aClass339_5699.anInt5112,
		 -2014021565 * ((Class384) this).aClass339_5699.anInt5109,
		 null, null, null, 0, 0, 2111168541);
	}
    }
    
    Class384(JS5 class210, JS5 class210_2_, Class339 class339) {
	((Class384) this).aClass339_5699 = class339;
	((Class384) this).aClass210_5698 = class210;
	((Class384) this).aClass210_5697 = class210_2_;
    }
    
    public void method213(boolean bool) {
	if (bool) {
	    int i
		= ((((Class384) this).aClass339_5699.aClass330_5107.method6031
		    (417662235 * ((Class384) this).aClass339_5699.anInt5114,
		     -2047397293 * client.anInt8432, 2140885869))
		   + ((Class384) this).aClass339_5699.anInt5111 * -201516259);
	    int i_3_
		= ((((Class384) this).aClass339_5699.aClass324_5106.method5965
		    (15015243 * ((Class384) this).aClass339_5699.anInt5115,
		     -533394329 * client.anInt8433, 1865860339))
		   + ((Class384) this).aClass339_5699.anInt5110 * 772242661);
	    ((Class384) this).aClass96_5700.method2114
		(((Class384) this).aClass339_5699.aString5113, i, i_3_,
		 ((Class384) this).aClass339_5699.anInt5114 * 417662235,
		 ((Class384) this).aClass339_5699.anInt5115 * 15015243,
		 ((Class384) this).aClass339_5699.anInt5117 * -1430954941,
		 ((Class384) this).aClass339_5699.anInt5118 * -223677391,
		 353479903 * ((Class384) this).aClass339_5699.anInt5108,
		 621514609 * ((Class384) this).aClass339_5699.anInt5112,
		 -2014021565 * ((Class384) this).aClass339_5699.anInt5109,
		 null, null, null, 0, 0, -1772906725);
	}
    }
    
    public void method212(boolean bool) {
	if (bool) {
	    int i
		= ((((Class384) this).aClass339_5699.aClass330_5107.method6031
		    (417662235 * ((Class384) this).aClass339_5699.anInt5114,
		     -2047397293 * client.anInt8432, 430515704))
		   + ((Class384) this).aClass339_5699.anInt5111 * -201516259);
	    int i_4_
		= ((((Class384) this).aClass339_5699.aClass324_5106.method5965
		    (15015243 * ((Class384) this).aClass339_5699.anInt5115,
		     -533394329 * client.anInt8433, 1813905843))
		   + ((Class384) this).aClass339_5699.anInt5110 * 772242661);
	    ((Class384) this).aClass96_5700.method2114
		(((Class384) this).aClass339_5699.aString5113, i, i_4_,
		 ((Class384) this).aClass339_5699.anInt5114 * 417662235,
		 ((Class384) this).aClass339_5699.anInt5115 * 15015243,
		 ((Class384) this).aClass339_5699.anInt5117 * -1430954941,
		 ((Class384) this).aClass339_5699.anInt5118 * -223677391,
		 353479903 * ((Class384) this).aClass339_5699.anInt5108,
		 621514609 * ((Class384) this).aClass339_5699.anInt5112,
		 -2014021565 * ((Class384) this).aClass339_5699.anInt5109,
		 null, null, null, 0, 0, 1446343778);
	}
    }
    
    public boolean method218() {
	boolean bool = true;
	if (!((Class384) this).aClass210_5698.method4250((-2076915363
							  * (((Class384) this)
							     .aClass339_5699
							     .anInt5116)),
							 784357526))
	    bool = false;
	if (!((Class384) this).aClass210_5697.method4250(((((Class384) this)
							   .aClass339_5699
							   .anInt5116)
							  * -2076915363),
							 -1743865))
	    bool = false;
	return bool;
    }
    
    public void method216(boolean bool) {
	if (bool) {
	    int i
		= ((((Class384) this).aClass339_5699.aClass330_5107.method6031
		    (417662235 * ((Class384) this).aClass339_5699.anInt5114,
		     -2047397293 * client.anInt8432, 779834502))
		   + ((Class384) this).aClass339_5699.anInt5111 * -201516259);
	    int i_5_
		= ((((Class384) this).aClass339_5699.aClass324_5106.method5965
		    (15015243 * ((Class384) this).aClass339_5699.anInt5115,
		     -533394329 * client.anInt8433, 2088760461))
		   + ((Class384) this).aClass339_5699.anInt5110 * 772242661);
	    ((Class384) this).aClass96_5700.method2114
		(((Class384) this).aClass339_5699.aString5113, i, i_5_,
		 ((Class384) this).aClass339_5699.anInt5114 * 417662235,
		 ((Class384) this).aClass339_5699.anInt5115 * 15015243,
		 ((Class384) this).aClass339_5699.anInt5117 * -1430954941,
		 ((Class384) this).aClass339_5699.anInt5118 * -223677391,
		 353479903 * ((Class384) this).aClass339_5699.anInt5108,
		 621514609 * ((Class384) this).aClass339_5699.anInt5112,
		 -2014021565 * ((Class384) this).aClass339_5699.anInt5109,
		 null, null, null, 0, 0, 68953218);
	}
    }
    
    public void method27() {
	Class639 class639
	    = Class482.method11026(((Class384) this).aClass210_5697,
				   -2076915363 * (((Class384) this)
						  .aClass339_5699.anInt5116),
				   -1859932489);
	((Class384) this).aClass96_5700
	    = (Class236.aClass103_2713.method2296
	       (class639,
		Class160.method3440(((Class384) this).aClass210_5698,
				    (((Class384) this).aClass339_5699.anInt5116
				     * -2076915363)),
		true));
    }
    
    public void method29() {
	Class639 class639
	    = Class482.method11026(((Class384) this).aClass210_5697,
				   -2076915363 * (((Class384) this)
						  .aClass339_5699.anInt5116),
				   -1103542948);
	((Class384) this).aClass96_5700
	    = (Class236.aClass103_2713.method2296
	       (class639,
		Class160.method3440(((Class384) this).aClass210_5698,
				    (((Class384) this).aClass339_5699.anInt5116
				     * -2076915363)),
		true));
    }
    
    public void method214(boolean bool) {
	if (bool) {
	    int i
		= ((((Class384) this).aClass339_5699.aClass330_5107.method6031
		    (417662235 * ((Class384) this).aClass339_5699.anInt5114,
		     -2047397293 * client.anInt8432, -1211708276))
		   + ((Class384) this).aClass339_5699.anInt5111 * -201516259);
	    int i_6_
		= ((((Class384) this).aClass339_5699.aClass324_5106.method5965
		    (15015243 * ((Class384) this).aClass339_5699.anInt5115,
		     -533394329 * client.anInt8433, 2077837201))
		   + ((Class384) this).aClass339_5699.anInt5110 * 772242661);
	    ((Class384) this).aClass96_5700.method2114
		(((Class384) this).aClass339_5699.aString5113, i, i_6_,
		 ((Class384) this).aClass339_5699.anInt5114 * 417662235,
		 ((Class384) this).aClass339_5699.anInt5115 * 15015243,
		 ((Class384) this).aClass339_5699.anInt5117 * -1430954941,
		 ((Class384) this).aClass339_5699.anInt5118 * -223677391,
		 353479903 * ((Class384) this).aClass339_5699.anInt5108,
		 621514609 * ((Class384) this).aClass339_5699.anInt5112,
		 -2014021565 * ((Class384) this).aClass339_5699.anInt5109,
		 null, null, null, 0, 0, -2009962623);
	}
    }
    
    public boolean method117() {
	boolean bool = true;
	if (!((Class384) this).aClass210_5698.method4250((-2076915363
							  * (((Class384) this)
							     .aClass339_5699
							     .anInt5116)),
							 -133942913))
	    bool = false;
	if (!((Class384) this).aClass210_5697.method4250(((((Class384) this)
							   .aClass339_5699
							   .anInt5116)
							  * -2076915363),
							 -725102131))
	    bool = false;
	return bool;
    }
    
    public boolean method217() {
	boolean bool = true;
	if (!((Class384) this).aClass210_5698.method4250((-2076915363
							  * (((Class384) this)
							     .aClass339_5699
							     .anInt5116)),
							 21041765))
	    bool = false;
	if (!((Class384) this).aClass210_5697.method4250(((((Class384) this)
							   .aClass339_5699
							   .anInt5116)
							  * -2076915363),
							 1619326812))
	    bool = false;
	return bool;
    }
    
    public boolean method114() {
	boolean bool = true;
	if (!((Class384) this).aClass210_5698.method4250((-2076915363
							  * (((Class384) this)
							     .aClass339_5699
							     .anInt5116)),
							 119492943))
	    bool = false;
	if (!((Class384) this).aClass210_5697.method4250(((((Class384) this)
							   .aClass339_5699
							   .anInt5116)
							  * -2076915363),
							 -118174444))
	    bool = false;
	return bool;
    }
    
    static final void method6946(ClientScriptData class454, int i) {
	int i_7_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = Class338.method6112(i_7_, 1046921266);
    }
    
    public static void method6947(Class168[] class168s, int i) {
	Class214.anInt2514 = class168s.length * 864018427;
	Class133.aClass168Array1613
	    = new Class168[10 + -1959242957 * Class214.anInt2514];
	Class242.anIntArray2783
	    = new int[10 + -1959242957 * Class214.anInt2514];
	System.arraycopy(class168s, 0, Class133.aClass168Array1613, 0,
			 -1959242957 * Class214.anInt2514);
	for (int i_8_ = 0; i_8_ < Class214.anInt2514 * -1959242957; i_8_++)
	    Class242.anIntArray2783[i_8_]
		= Class133.aClass168Array1613[i_8_].method3616();
	for (int i_9_ = -1959242957 * Class214.anInt2514;
	     i_9_ < Class133.aClass168Array1613.length; i_9_++)
	    Class242.anIntArray2783[i_9_] = 12;
    }
    
    public static int method6948(JS5 class210, int i) {
	int i_10_ = 0;
	if (class210.method4250(Class496.anInt6524 * 1736353955, -572606807))
	    i_10_++;
	if (class210.method4250(Class5.anInt24 * 2016700663, -660047736))
	    i_10_++;
	if (class210.method4250(Class5.anInt18 * 2057551107, 1449046822))
	    i_10_++;
	if (class210.method4250(Class5.anInt20 * 1893255153, 971527279))
	    i_10_++;
	if (class210.method4250(1936915547 * Class94.anInt1327, 626440497))
	    i_10_++;
	if (class210.method4250(799214159 * Class5.anInt21, -576996460))
	    i_10_++;
	if (class210.method4250(1858584743 * Class47.anInt635, 1777245759))
	    i_10_++;
	if (class210.method4250(CsDelta_DeleteBan.anInt11056 * 1937038461,
				-166045397))
	    i_10_++;
	if (class210.method4250(Class5.anInt22 * -1249704839, 1804917856))
	    i_10_++;
	if (class210.method4250(2032179797 * Class5.anInt23, 614220459))
	    i_10_++;
	return i_10_;
    }
    
    static final void method6949(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	class58.anInt887
	    = 1599549605 * (((ClientScriptData) class454).integerStack
			    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	class58.anInt888
	    = (((ClientScriptData) class454).integerStack
	       [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]) * 720707841;
	WorldType.refreshComponent(class58, 653803327);
    }
    
    static void method6950(long[] ls, Object[] objects, int i, int i_11_,
			   int i_12_) {
	if (i < i_11_) {
	    int i_13_ = (i_11_ + i) / 2;
	    int i_14_ = i;
	    long l = ls[i_13_];
	    ls[i_13_] = ls[i_11_];
	    ls[i_11_] = l;
	    Object object = objects[i_13_];
	    objects[i_13_] = objects[i_11_];
	    objects[i_11_] = object;
	    int i_15_ = 9223372036854775807L == l ? 0 : 1;
	    for (int i_16_ = i; i_16_ < i_11_; i_16_++) {
		if (ls[i_16_] < l + (long) (i_16_ & i_15_)) {
		    long l_17_ = ls[i_16_];
		    ls[i_16_] = ls[i_14_];
		    ls[i_14_] = l_17_;
		    Object object_18_ = objects[i_16_];
		    objects[i_16_] = objects[i_14_];
		    objects[i_14_++] = object_18_;
		}
	    }
	    ls[i_11_] = ls[i_14_];
	    ls[i_14_] = l;
	    objects[i_11_] = objects[i_14_];
	    objects[i_14_] = object;
	    method6950(ls, objects, i, i_14_ - 1, -823445536);
	    method6950(ls, objects, 1 + i_14_, i_11_, -137359091);
	}
    }
}
