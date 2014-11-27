/* Class475_Sub1_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class475_Sub1_Sub3_Sub2 extends Class475_Sub1_Sub3
    implements Interface24
{
    boolean aBool11350;
    static int[] anIntArray11351;
    ObjectDefinitionLoader aClass532_11352;
    Class89 aClass89_11353;
    boolean aBool11354;
    Class535 aClass535_11355;
    int anInt11356;
    byte aByte11357;
    boolean aBool11358;
    Class241_Sub39_Sub17 aClass241_Sub39_Sub17_11359;
    byte aByte11360;
    boolean aBool11361;
    static int[] anIntArray11362 = { 1, 2, 4, 8 };
    
    Class399 method17747(Class103 class103, int i, boolean bool, int i_0_) {
	ObjectDefinition class526
	    = (((Class475_Sub1_Sub3_Sub2) this).aClass532_11352.getObjectDefinition
	       (((Class475_Sub1_Sub3_Sub2) this).anInt11356 * 888338857,
		577892407));
	Class166 class166;
	Class166 class166_1_;
	if (((Class475_Sub1_Sub3_Sub2) this).aBool11358) {
	    class166 = aClass552_8744.aClass166Array7140[aByte8745];
	    class166_1_ = aClass552_8744.aClass166Array7179[0];
	} else {
	    class166 = aClass552_8744.aClass166Array7179[aByte8745];
	    if (aByte8745 < 3)
		class166_1_ = aClass552_8744.aClass166Array7179[aByte8745 + 1];
	    else
		class166_1_ = null;
	}
	Class287 class287 = method10874().aClass287_4386;
	return (class526.method11765
		(class103, i, ((Class475_Sub1_Sub3_Sub2) this).aByte11360,
		 ((Class475_Sub1_Sub3_Sub2) this).aByte11357, class166,
		 class166_1_, (int) class287.aFloat4477,
		 (int) class287.aFloat4474, (int) class287.aFloat4479, bool,
		 null, -1219737013));
    }
    
    boolean method14469(byte i) {
	if (null != ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353)
	    return !((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
			.method1914();
	return true;
    }
    
    boolean method14452(byte i) {
	if (((Class475_Sub1_Sub3_Sub2) this).aClass89_11353 != null)
	    return ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		       .method2052();
	return false;
    }
    
    public int method14468(byte i) {
	return (null != ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		? ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353.method1902()
		: 0);
    }
    
    Class89 method17748(Class103 class103, int i, byte i_2_) {
	if (((Class475_Sub1_Sub3_Sub2) this).aClass89_11353 != null
	    && class103.method2301(((Class475_Sub1_Sub3_Sub2) this)
				       .aClass89_11353.method1866(),
				   i) == 0)
	    return ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353;
	Class399 class399 = method17747(class103, i, false, -1662724916);
	if (null != class399)
	    return (Class89) class399.anObject5795;
	return null;
    }
    
    Class542 method14474(Class103 class103) {
	if (null == ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353)
	    return null;
	Class266 class266 = method10893();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub3_Sub2) this).aBool11354,
				  -2072139653);
	Class272 class272
	    = (((Class475_Sub1_Sub3_Sub2) this).aClass532_11352.getObjectDefinition
	       (888338857 * ((Class475_Sub1_Sub3_Sub2) this).anInt11356,
		577892407)
	       .aClass272_6905);
	if (null != class272) {
	    ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0], class272);
	} else
	    ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		.method1890(class266, aClass97Array8748[0], 0);
	return class542;
    }
    
    public Class535 method14457(Class103 class103, int i) {
	Class287 class287 = method10874().aClass287_4386;
	if (((Class475_Sub1_Sub3_Sub2) this).aClass535_11355 == null)
	    ((Class475_Sub1_Sub3_Sub2) this).aClass535_11355
		= Class109.method2768((int) class287.aFloat4477,
				      (int) class287.aFloat4474,
				      (int) class287.aFloat4479,
				      method17748(class103, 0, (byte) -30),
				      1781937905);
	return ((Class475_Sub1_Sub3_Sub2) this).aClass535_11355;
    }
    
    Class542 method14455(Class103 class103, int i) {
	if (null == ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353)
	    return null;
	Class266 class266 = method10893();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub3_Sub2) this).aBool11354,
				  -2137480944);
	Class272 class272
	    = (((Class475_Sub1_Sub3_Sub2) this).aClass532_11352.getObjectDefinition
	       (888338857 * ((Class475_Sub1_Sub3_Sub2) this).anInt11356,
		577892407)
	       .aClass272_6905);
	if (null != class272) {
	    ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0], class272);
	} else
	    ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		.method1890(class266, aClass97Array8748[0], 0);
	return class542;
    }
    
    void method14493(Class103 class103, byte i) {
	/* empty */
    }
    
    boolean method14448(Class103 class103, int i, int i_3_, int i_4_) {
	Class272 class272
	    = (((Class475_Sub1_Sub3_Sub2) this).aClass532_11352.getObjectDefinition
	       (888338857 * ((Class475_Sub1_Sub3_Sub2) this).anInt11356,
		577892407)
	       .aClass272_6905);
	if (null != class272)
	    return class103.method2280(i, i_3_, method10893(), class272,
				       (byte) 93);
	Class89 class89 = method17748(class103, 131072, (byte) -9);
	if (class89 != null) {
	    Class266 class266 = method10893();
	    return class89.method1891(i, i_3_, class266, false, 0);
	}
	return false;
    }
    
    boolean method14450(int i) {
	return ((Class475_Sub1_Sub3_Sub2) this).aBool11350;
    }
    
    void method14453(Class103 class103, Class475_Sub1 class475_sub1, int i,
		     int i_5_, int i_6_, boolean bool, int i_7_) {
	if (class475_sub1 instanceof Class475_Sub1_Sub3_Sub2) {
	    Class475_Sub1_Sub3_Sub2 class475_sub1_sub3_sub2_8_
		= (Class475_Sub1_Sub3_Sub2) class475_sub1;
	    if (null != ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		&& null != ((Class475_Sub1_Sub3_Sub2)
			    class475_sub1_sub3_sub2_8_).aClass89_11353)
		((Class475_Sub1_Sub3_Sub2) this).aClass89_11353.method1920
		    ((((Class475_Sub1_Sub3_Sub2) class475_sub1_sub3_sub2_8_)
		      .aClass89_11353),
		     i, i_5_, i_6_, bool);
	} else if (class475_sub1 instanceof Class475_Sub1_Sub1_Sub1) {
	    Class475_Sub1_Sub1_Sub1 class475_sub1_sub1_sub1
		= (Class475_Sub1_Sub1_Sub1) class475_sub1;
	    if (null != ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		&& null != (((Class475_Sub1_Sub1_Sub1) class475_sub1_sub1_sub1)
			    .aClass89_11319))
		((Class475_Sub1_Sub3_Sub2) this).aClass89_11353.method1920
		    ((((Class475_Sub1_Sub1_Sub1) class475_sub1_sub1_sub1)
		      .aClass89_11319),
		     i, i_5_, i_6_, bool);
	}
    }
    
    public int method9() {
	return ((Class475_Sub1_Sub3_Sub2) this).anInt11356 * 888338857;
    }
    
    public int method146(byte i) {
	return ((Class475_Sub1_Sub3_Sub2) this).anInt11356 * 888338857;
    }
    
    boolean method14451() {
	if (((Class475_Sub1_Sub3_Sub2) this).aClass89_11353 != null)
	    return ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		       .method2052();
	return false;
    }
    
    public int method140(int i) {
	return ((Class475_Sub1_Sub3_Sub2) this).aByte11357;
    }
    
    public void method143(int i) {
	if (null != ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353)
	    ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353.method1867();
    }
    
    public boolean method157(byte i) {
	return true;
    }
    
    public boolean method142(int i) {
	return ((Class475_Sub1_Sub3_Sub2) this).aBool11361;
    }
    
    public void method144(Class103 class103, int i) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((null
	     == ((Class475_Sub1_Sub3_Sub2) this).aClass241_Sub39_Sub17_11359)
	    && ((Class475_Sub1_Sub3_Sub2) this).aBool11361) {
	    Class399 class399
		= method17747(class103, 262144, true, -1012716266);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (class399 != null
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub3_Sub2) this).aClass241_Sub39_Sub17_11359;
	    ((Class475_Sub1_Sub3_Sub2) this).aClass241_Sub39_Sub17_11359
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (null != class241_sub39_sub17)
	    aClass552_8744.method12205(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -1645397261);
    }
    
    public void method145(Class103 class103, byte i) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((null
	     == ((Class475_Sub1_Sub3_Sub2) this).aClass241_Sub39_Sub17_11359)
	    && ((Class475_Sub1_Sub3_Sub2) this).aBool11361) {
	    Class399 class399
		= method17747(class103, 262144, true, -763024804);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (null != class399
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub3_Sub2) this).aClass241_Sub39_Sub17_11359;
	    ((Class475_Sub1_Sub3_Sub2) this).aClass241_Sub39_Sub17_11359
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (class241_sub39_sub17 != null)
	    aClass552_8744.method12150(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -1905405359);
    }
    
    static {
	anIntArray11351 = new int[] { 16, 32, 64, 128 };
    }
    
    public boolean method151() {
	return ((Class475_Sub1_Sub3_Sub2) this).aBool11361;
    }
    
    public int method10() {
	return ((Class475_Sub1_Sub3_Sub2) this).aByte11360;
    }
    
    public int method11() {
	return ((Class475_Sub1_Sub3_Sub2) this).aByte11360;
    }
    
    void method14481(Class103 class103, Class475_Sub1 class475_sub1, int i,
		     int i_9_, int i_10_, boolean bool) {
	if (class475_sub1 instanceof Class475_Sub1_Sub3_Sub2) {
	    Class475_Sub1_Sub3_Sub2 class475_sub1_sub3_sub2_11_
		= (Class475_Sub1_Sub3_Sub2) class475_sub1;
	    if (null != ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		&& null != ((Class475_Sub1_Sub3_Sub2)
			    class475_sub1_sub3_sub2_11_).aClass89_11353)
		((Class475_Sub1_Sub3_Sub2) this).aClass89_11353.method1920
		    ((((Class475_Sub1_Sub3_Sub2) class475_sub1_sub3_sub2_11_)
		      .aClass89_11353),
		     i, i_9_, i_10_, bool);
	} else if (class475_sub1 instanceof Class475_Sub1_Sub1_Sub1) {
	    Class475_Sub1_Sub1_Sub1 class475_sub1_sub1_sub1
		= (Class475_Sub1_Sub1_Sub1) class475_sub1;
	    if (null != ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		&& null != (((Class475_Sub1_Sub1_Sub1) class475_sub1_sub1_sub1)
			    .aClass89_11319))
		((Class475_Sub1_Sub3_Sub2) this).aClass89_11353.method1920
		    ((((Class475_Sub1_Sub1_Sub1) class475_sub1_sub1_sub1)
		      .aClass89_11319),
		     i, i_9_, i_10_, bool);
	}
    }
    
    void method14454(byte i) {
	((Class475_Sub1_Sub3_Sub2) this).aBool11350 = false;
	if (((Class475_Sub1_Sub3_Sub2) this).aClass89_11353 != null)
	    ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353.method1928
		(((Class475_Sub1_Sub3_Sub2) this).aClass89_11353.method1866()
		 & ~0x10000);
    }
    
    public void method149() {
	if (null != ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353)
	    ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353.method1867();
    }
    
    public int method147() {
	return ((Class475_Sub1_Sub3_Sub2) this).aByte11357;
    }
    
    public int method139(int i) {
	return ((Class475_Sub1_Sub3_Sub2) this).aByte11360;
    }
    
    void method14476(Class103 class103) {
	/* empty */
    }
    
    public boolean method153() {
	return ((Class475_Sub1_Sub3_Sub2) this).aBool11361;
    }
    
    public boolean method154() {
	return true;
    }
    
    Class399 method17749(Class103 class103, int i, boolean bool) {
	ObjectDefinition class526
	    = (((Class475_Sub1_Sub3_Sub2) this).aClass532_11352.getObjectDefinition
	       (((Class475_Sub1_Sub3_Sub2) this).anInt11356 * 888338857,
		577892407));
	Class166 class166;
	Class166 class166_12_;
	if (((Class475_Sub1_Sub3_Sub2) this).aBool11358) {
	    class166 = aClass552_8744.aClass166Array7140[aByte8745];
	    class166_12_ = aClass552_8744.aClass166Array7179[0];
	} else {
	    class166 = aClass552_8744.aClass166Array7179[aByte8745];
	    if (aByte8745 < 3)
		class166_12_
		    = aClass552_8744.aClass166Array7179[aByte8745 + 1];
	    else
		class166_12_ = null;
	}
	Class287 class287 = method10874().aClass287_4386;
	return (class526.method11765
		(class103, i, ((Class475_Sub1_Sub3_Sub2) this).aByte11360,
		 ((Class475_Sub1_Sub3_Sub2) this).aByte11357, class166,
		 class166_12_, (int) class287.aFloat4477,
		 (int) class287.aFloat4474, (int) class287.aFloat4479, bool,
		 null, -1219737013));
    }
    
    boolean method14467() {
	if (((Class475_Sub1_Sub3_Sub2) this).aClass89_11353 != null)
	    return ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		       .method2052();
	return false;
    }
    
    public boolean method156() {
	return true;
    }
    
    public boolean method150() {
	return ((Class475_Sub1_Sub3_Sub2) this).aBool11361;
    }
    
    public void method158(Class103 class103) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((null
	     == ((Class475_Sub1_Sub3_Sub2) this).aClass241_Sub39_Sub17_11359)
	    && ((Class475_Sub1_Sub3_Sub2) this).aBool11361) {
	    Class399 class399
		= method17747(class103, 262144, true, -919393566);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (class399 != null
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub3_Sub2) this).aClass241_Sub39_Sub17_11359;
	    ((Class475_Sub1_Sub3_Sub2) this).aClass241_Sub39_Sub17_11359
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (null != class241_sub39_sub17)
	    aClass552_8744.method12205(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -800222169);
    }
    
    public Class475_Sub1_Sub3_Sub2
	(Class552 class552, Class103 class103, ObjectDefinitionLoader class532,
	 ObjectDefinition class526, int i, int i_13_, int i_14_, int i_15_, int i_16_,
	 boolean bool, int i_17_, int i_18_, boolean bool_19_) {
	super(class552, i_14_, i_15_, i_16_, i, i_13_,
	      Class120_Sub2.method15460(i_17_, i_18_, 227575873));
	((Class475_Sub1_Sub3_Sub2) this).aClass532_11352 = class532;
	((Class475_Sub1_Sub3_Sub2) this).anInt11356
	    = class526.objectID * -175051871;
	((Class475_Sub1_Sub3_Sub2) this).aBool11358 = bool;
	((Class475_Sub1_Sub3_Sub2) this).aByte11360 = (byte) i_17_;
	((Class475_Sub1_Sub3_Sub2) this).aByte11357 = (byte) i_18_;
	((Class475_Sub1_Sub3_Sub2) this).aBool11354
	    = class526.anInt6848 * -1389471035 != 0 && !bool;
	((Class475_Sub1_Sub3_Sub2) this).aBool11350 = bool_19_;
	((Class475_Sub1_Sub3_Sub2) this).aBool11361
	    = (class103.method2382() && class526.aBool6895
	       && !((Class475_Sub1_Sub3_Sub2) this).aBool11358
	       && Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .aClass445_Sub7_8865.method14150(1217080701) != 0);
	int i_20_ = 2048;
	if (((Class475_Sub1_Sub3_Sub2) this).aBool11350)
	    i_20_ |= 0x10000;
	if (class526.bloom)
	    i_20_ |= 0x80000;
	Class399 class399
	    = method17747(class103, i_20_,
			  ((Class475_Sub1_Sub3_Sub2) this).aBool11361,
			  518261549);
	if (null != class399) {
	    ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		= (Class89) class399.anObject5795;
	    ((Class475_Sub1_Sub3_Sub2) this).aClass241_Sub39_Sub17_11359
		= (Class241_Sub39_Sub17) class399.anObject5794;
	    if (((Class475_Sub1_Sub3_Sub2) this).aBool11350
		|| class526.bloom) {
		((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		    = ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
			  .method2019((byte) 0, i_20_, false);
		if (class526.bloom) {
		    Class230 class230
			= client.aClass238_8477.method4787((byte) -63);
		    ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353.method1911
			(class230.anInt2681 * 2009560023,
			 class230.anInt2682 * -801178581,
			 1773755899 * class230.anInt2683,
			 -1710320751 * class230.anInt2684);
		}
	    }
	}
	method14465(1, 1020882807);
    }
    
    boolean method14488(Class103 class103, int i, int i_21_) {
	Class272 class272
	    = (((Class475_Sub1_Sub3_Sub2) this).aClass532_11352.getObjectDefinition
	       (888338857 * ((Class475_Sub1_Sub3_Sub2) this).anInt11356,
		577892407)
	       .aClass272_6905);
	if (null != class272)
	    return class103.method2280(i, i_21_, method10893(), class272,
				       (byte) 6);
	Class89 class89 = method17748(class103, 131072, (byte) 0);
	if (class89 != null) {
	    Class266 class266 = method10893();
	    return class89.method1891(i, i_21_, class266, false, 0);
	}
	return false;
    }
    
    public void method141(Class103 class103) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((null
	     == ((Class475_Sub1_Sub3_Sub2) this).aClass241_Sub39_Sub17_11359)
	    && ((Class475_Sub1_Sub3_Sub2) this).aBool11361) {
	    Class399 class399
		= method17747(class103, 262144, true, 1527897579);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (class399 != null
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub3_Sub2) this).aClass241_Sub39_Sub17_11359;
	    ((Class475_Sub1_Sub3_Sub2) this).aClass241_Sub39_Sub17_11359
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (null != class241_sub39_sub17)
	    aClass552_8744.method12205(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -1796368556);
    }
    
    Class399 method17750(Class103 class103, int i, boolean bool) {
	ObjectDefinition class526
	    = (((Class475_Sub1_Sub3_Sub2) this).aClass532_11352.getObjectDefinition
	       (((Class475_Sub1_Sub3_Sub2) this).anInt11356 * 888338857,
		577892407));
	Class166 class166;
	Class166 class166_22_;
	if (((Class475_Sub1_Sub3_Sub2) this).aBool11358) {
	    class166 = aClass552_8744.aClass166Array7140[aByte8745];
	    class166_22_ = aClass552_8744.aClass166Array7179[0];
	} else {
	    class166 = aClass552_8744.aClass166Array7179[aByte8745];
	    if (aByte8745 < 3)
		class166_22_
		    = aClass552_8744.aClass166Array7179[aByte8745 + 1];
	    else
		class166_22_ = null;
	}
	Class287 class287 = method10874().aClass287_4386;
	return (class526.method11765
		(class103, i, ((Class475_Sub1_Sub3_Sub2) this).aByte11360,
		 ((Class475_Sub1_Sub3_Sub2) this).aByte11357, class166,
		 class166_22_, (int) class287.aFloat4477,
		 (int) class287.aFloat4474, (int) class287.aFloat4479, bool,
		 null, -1219737013));
    }
    
    public int method14492() {
	return (null != ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		? ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353.method1902()
		: 0);
    }
    
    public Class535 method14470(Class103 class103) {
	Class287 class287 = method10874().aClass287_4386;
	if (((Class475_Sub1_Sub3_Sub2) this).aClass535_11355 == null)
	    ((Class475_Sub1_Sub3_Sub2) this).aClass535_11355
		= Class109.method2768((int) class287.aFloat4477,
				      (int) class287.aFloat4474,
				      (int) class287.aFloat4479,
				      method17748(class103, 0, (byte) -39),
				      1868657646);
	return ((Class475_Sub1_Sub3_Sub2) this).aClass535_11355;
    }
    
    Class542 method14472(Class103 class103) {
	if (null == ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353)
	    return null;
	Class266 class266 = method10893();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub3_Sub2) this).aBool11354,
				  -2104249856);
	Class272 class272
	    = (((Class475_Sub1_Sub3_Sub2) this).aClass532_11352.getObjectDefinition
	       (888338857 * ((Class475_Sub1_Sub3_Sub2) this).anInt11356,
		577892407)
	       .aClass272_6905);
	if (null != class272) {
	    ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0], class272);
	} else
	    ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		.method1890(class266, aClass97Array8748[0], 0);
	return class542;
    }
    
    Class542 method14473(Class103 class103) {
	if (null == ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353)
	    return null;
	Class266 class266 = method10893();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub3_Sub2) this).aBool11354,
				  -2134045462);
	Class272 class272
	    = (((Class475_Sub1_Sub3_Sub2) this).aClass532_11352.getObjectDefinition
	       (888338857 * ((Class475_Sub1_Sub3_Sub2) this).anInt11356,
		577892407)
	       .aClass272_6905);
	if (null != class272) {
	    ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0], class272);
	} else
	    ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		.method1890(class266, aClass97Array8748[0], 0);
	return class542;
    }
    
    public void method159(Class103 class103) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((null
	     == ((Class475_Sub1_Sub3_Sub2) this).aClass241_Sub39_Sub17_11359)
	    && ((Class475_Sub1_Sub3_Sub2) this).aBool11361) {
	    Class399 class399
		= method17747(class103, 262144, true, -766824357);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (class399 != null
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub3_Sub2) this).aClass241_Sub39_Sub17_11359;
	    ((Class475_Sub1_Sub3_Sub2) this).aClass241_Sub39_Sub17_11359
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (null != class241_sub39_sub17)
	    aClass552_8744.method12205(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -679173393);
    }
    
    Class542 method14475(Class103 class103) {
	if (null == ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353)
	    return null;
	Class266 class266 = method10893();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub3_Sub2) this).aBool11354,
				  -2109356729);
	Class272 class272
	    = (((Class475_Sub1_Sub3_Sub2) this).aClass532_11352.getObjectDefinition
	       (888338857 * ((Class475_Sub1_Sub3_Sub2) this).anInt11356,
		577892407)
	       .aClass272_6905);
	if (null != class272) {
	    ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0], class272);
	} else
	    ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		.method1890(class266, aClass97Array8748[0], 0);
	return class542;
    }
    
    public boolean method155() {
	return ((Class475_Sub1_Sub3_Sub2) this).aBool11361;
    }
    
    boolean method14477() {
	return ((Class475_Sub1_Sub3_Sub2) this).aBool11350;
    }
    
    boolean method14456() {
	return ((Class475_Sub1_Sub3_Sub2) this).aBool11350;
    }
    
    boolean method14479() {
	return ((Class475_Sub1_Sub3_Sub2) this).aBool11350;
    }
    
    void method14480(Class103 class103, Class475_Sub1 class475_sub1, int i,
		     int i_23_, int i_24_, boolean bool) {
	if (class475_sub1 instanceof Class475_Sub1_Sub3_Sub2) {
	    Class475_Sub1_Sub3_Sub2 class475_sub1_sub3_sub2_25_
		= (Class475_Sub1_Sub3_Sub2) class475_sub1;
	    if (null != ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		&& null != ((Class475_Sub1_Sub3_Sub2)
			    class475_sub1_sub3_sub2_25_).aClass89_11353)
		((Class475_Sub1_Sub3_Sub2) this).aClass89_11353.method1920
		    ((((Class475_Sub1_Sub3_Sub2) class475_sub1_sub3_sub2_25_)
		      .aClass89_11353),
		     i, i_23_, i_24_, bool);
	} else if (class475_sub1 instanceof Class475_Sub1_Sub1_Sub1) {
	    Class475_Sub1_Sub1_Sub1 class475_sub1_sub1_sub1
		= (Class475_Sub1_Sub1_Sub1) class475_sub1;
	    if (null != ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		&& null != (((Class475_Sub1_Sub1_Sub1) class475_sub1_sub1_sub1)
			    .aClass89_11319))
		((Class475_Sub1_Sub3_Sub2) this).aClass89_11353.method1920
		    ((((Class475_Sub1_Sub1_Sub1) class475_sub1_sub1_sub1)
		      .aClass89_11319),
		     i, i_23_, i_24_, bool);
	}
    }
    
    public void method148() {
	if (null != ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353)
	    ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353.method1867();
    }
    
    public boolean method152() {
	return true;
    }
    
    void method14483() {
	((Class475_Sub1_Sub3_Sub2) this).aBool11350 = false;
	if (((Class475_Sub1_Sub3_Sub2) this).aClass89_11353 != null)
	    ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353.method1928
		(((Class475_Sub1_Sub3_Sub2) this).aClass89_11353.method1866()
		 & ~0x10000);
    }
    
    void method14478() {
	((Class475_Sub1_Sub3_Sub2) this).aBool11350 = false;
	if (((Class475_Sub1_Sub3_Sub2) this).aClass89_11353 != null)
	    ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353.method1928
		(((Class475_Sub1_Sub3_Sub2) this).aClass89_11353.method1866()
		 & ~0x10000);
    }
    
    public void method160(Class103 class103) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((null
	     == ((Class475_Sub1_Sub3_Sub2) this).aClass241_Sub39_Sub17_11359)
	    && ((Class475_Sub1_Sub3_Sub2) this).aBool11361) {
	    Class399 class399 = method17747(class103, 262144, true, 609380612);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (null != class399
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub3_Sub2) this).aClass241_Sub39_Sub17_11359;
	    ((Class475_Sub1_Sub3_Sub2) this).aClass241_Sub39_Sub17_11359
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (class241_sub39_sub17 != null)
	    aClass552_8744.method12150(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -1829609954);
    }
    
    boolean method14466() {
	if (null != ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353)
	    return !((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
			.method1914();
	return true;
    }
    
    static int method17751(int i, int i_26_) {
	if (i == -2030829961 * Class527.aClass527_6920.anInt6931
	    || -2030829961 * Class527.aClass527_6916.anInt6931 == i)
	    return anIntArray11351[i_26_ & 0x3];
	return anIntArray11362[i_26_ & 0x3];
    }
    
    void method14482(Class103 class103, Class475_Sub1 class475_sub1, int i,
		     int i_27_, int i_28_, boolean bool) {
	if (class475_sub1 instanceof Class475_Sub1_Sub3_Sub2) {
	    Class475_Sub1_Sub3_Sub2 class475_sub1_sub3_sub2_29_
		= (Class475_Sub1_Sub3_Sub2) class475_sub1;
	    if (null != ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		&& null != ((Class475_Sub1_Sub3_Sub2)
			    class475_sub1_sub3_sub2_29_).aClass89_11353)
		((Class475_Sub1_Sub3_Sub2) this).aClass89_11353.method1920
		    ((((Class475_Sub1_Sub3_Sub2) class475_sub1_sub3_sub2_29_)
		      .aClass89_11353),
		     i, i_27_, i_28_, bool);
	} else if (class475_sub1 instanceof Class475_Sub1_Sub1_Sub1) {
	    Class475_Sub1_Sub1_Sub1 class475_sub1_sub1_sub1
		= (Class475_Sub1_Sub1_Sub1) class475_sub1;
	    if (null != ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353
		&& null != (((Class475_Sub1_Sub1_Sub1) class475_sub1_sub1_sub1)
			    .aClass89_11319))
		((Class475_Sub1_Sub3_Sub2) this).aClass89_11353.method1920
		    ((((Class475_Sub1_Sub1_Sub1) class475_sub1_sub1_sub1)
		      .aClass89_11319),
		     i, i_27_, i_28_, bool);
	}
    }
    
    Class89 method17752(Class103 class103, int i) {
	if (((Class475_Sub1_Sub3_Sub2) this).aClass89_11353 != null
	    && class103.method2301(((Class475_Sub1_Sub3_Sub2) this)
				       .aClass89_11353.method1866(),
				   i) == 0)
	    return ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353;
	Class399 class399 = method17747(class103, i, false, 1260306260);
	if (null != class399)
	    return (Class89) class399.anObject5795;
	return null;
    }
    
    Class89 method17753(Class103 class103, int i) {
	if (((Class475_Sub1_Sub3_Sub2) this).aClass89_11353 != null
	    && class103.method2301(((Class475_Sub1_Sub3_Sub2) this)
				       .aClass89_11353.method1866(),
				   i) == 0)
	    return ((Class475_Sub1_Sub3_Sub2) this).aClass89_11353;
	Class399 class399 = method17747(class103, i, false, 763673196);
	if (null != class399)
	    return (Class89) class399.anObject5795;
	return null;
    }
    
    public boolean method138() {
	return true;
    }
    
    static int method17754(int i, int i_30_) {
	if (i == -2030829961 * Class527.aClass527_6920.anInt6931
	    || -2030829961 * Class527.aClass527_6916.anInt6931 == i)
	    return anIntArray11351[i_30_ & 0x3];
	return anIntArray11362[i_30_ & 0x3];
    }
    
    static final void method17755(ClientScriptData class454, int i) {
	int i_31_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_31_, (byte) -116);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_31_ >> 16];
	Class541.method11942(class58, class35, class454, (byte) 74);
    }
    
    static final void setMinimapFlag/*method17756*/(int localX, int localY, int i_33_) {
		Class194.minimapFlagX = localX * -980260023;
		Class194.minimapFlagY = localY * -1262506991;
		Class194.aBool2302 = false;
		Class41.method1064(258026699);
    }
    
    static final void method17757(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub20_8854
		   .method14284(1929090980)
	       && Class236.aClass103_2713.method2361()) ? 1 : 0;
    }
}
