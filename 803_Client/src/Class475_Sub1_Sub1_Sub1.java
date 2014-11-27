/* Class475_Sub1_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class475_Sub1_Sub1_Sub1 extends Class475_Sub1_Sub1
    implements Interface24
{
    Class535 aClass535_11318;
    Class89 aClass89_11319;
    Class241_Sub39_Sub17 aClass241_Sub39_Sub17_11320;
    int anInt11321;
    byte aByte11322;
    ObjectDefinitionLoader aClass532_11323;
    byte aByte11324;
    boolean aBool11325;
    boolean aBool11326;
    boolean aBool11327;
    boolean aBool11328;
    boolean aBool11329;
    
    public boolean method142(int i) {
	return ((Class475_Sub1_Sub1_Sub1) this).aBool11328;
    }
    
    static byte method17725(int i, int i_0_) {
	if (Class527.aClass527_6912.anInt6931 * -2030829961 != i)
	    return (byte) 0;
	if (0 == (i_0_ & 0x1))
	    return (byte) 1;
	return (byte) 2;
    }
    
    boolean method14452(byte i) {
	if (((Class475_Sub1_Sub1_Sub1) this).aClass89_11319 != null)
	    return ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		       .method2052();
	return false;
    }
    
    void method14493(Class103 class103, byte i) {
	/* empty */
    }
    
    Class89 method17726(Class103 class103, int i, byte i_1_) {
	if (null != ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
	    && class103.method2301(((Class475_Sub1_Sub1_Sub1) this)
				       .aClass89_11319.method1866(),
				   i) == 0)
	    return ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319;
	Class399 class399 = method17727(class103, i, false, -1997648290);
	if (null != class399)
	    return (Class89) class399.anObject5795;
	return null;
    }
    
    Class399 method17727(Class103 class103, int i, boolean bool, int i_2_) {
	ObjectDefinition class526
	    = (((Class475_Sub1_Sub1_Sub1) this).aClass532_11323.getObjectDefinition
	       (((Class475_Sub1_Sub1_Sub1) this).anInt11321 * -682508355,
		577892407));
	Class166 class166;
	Class166 class166_3_;
	if (((Class475_Sub1_Sub1_Sub1) this).aBool11325) {
	    class166 = aClass552_8744.aClass166Array7140[aByte8745];
	    class166_3_ = aClass552_8744.aClass166Array7179[0];
	} else {
	    class166 = aClass552_8744.aClass166Array7179[aByte8745];
	    if (aByte8745 < 3)
		class166_3_ = aClass552_8744.aClass166Array7179[aByte8745 + 1];
	    else
		class166_3_ = null;
	}
	Class287 class287 = method10874().aClass287_4386;
	return (class526.method11765
		(class103, i,
		 ((((Class475_Sub1_Sub1_Sub1) this).aByte11322
		   != Class527.aClass527_6909.anInt6931 * -2030829961)
		  ? (int) ((Class475_Sub1_Sub1_Sub1) this).aByte11322
		  : -2030829961 * Class527.aClass527_6928.anInt6931),
		 ((((Class475_Sub1_Sub1_Sub1) this).aByte11322
		   == -2030829961 * Class527.aClass527_6909.anInt6931)
		  ? (int) (((Class475_Sub1_Sub1_Sub1) this).aByte11324 + 4)
		  : ((Class475_Sub1_Sub1_Sub1) this).aByte11324),
		 class166, class166_3_, (int) class287.aFloat4477,
		 (int) class287.aFloat4474, (int) class287.aFloat4479, bool,
		 null, -1219737013));
    }
    
    void method14453(Class103 class103, Class475_Sub1 class475_sub1, int i,
		     int i_4_, int i_5_, boolean bool, int i_6_) {
	if (class475_sub1 instanceof Class475_Sub1_Sub3_Sub2) {
	    Class475_Sub1_Sub3_Sub2 class475_sub1_sub3_sub2
		= (Class475_Sub1_Sub3_Sub2) class475_sub1;
	    if (((Class475_Sub1_Sub1_Sub1) this).aClass89_11319 != null
		&& (((Class475_Sub1_Sub3_Sub2) class475_sub1_sub3_sub2)
		    .aClass89_11353) != null)
		((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1920
		    ((((Class475_Sub1_Sub3_Sub2) class475_sub1_sub3_sub2)
		      .aClass89_11353),
		     i, i_4_, i_5_, bool);
	} else if (class475_sub1 instanceof Class475_Sub1_Sub1_Sub1) {
	    Class475_Sub1_Sub1_Sub1 class475_sub1_sub1_sub1_7_
		= (Class475_Sub1_Sub1_Sub1) class475_sub1;
	    if (((Class475_Sub1_Sub1_Sub1) this).aClass89_11319 != null
		&& null != ((Class475_Sub1_Sub1_Sub1)
			    class475_sub1_sub1_sub1_7_).aClass89_11319)
		((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1920
		    ((((Class475_Sub1_Sub1_Sub1) class475_sub1_sub1_sub1_7_)
		      .aClass89_11319),
		     i, i_4_, i_5_, bool);
	}
    }
    
    public boolean method150() {
	return ((Class475_Sub1_Sub1_Sub1) this).aBool11328;
    }
    
    public boolean method153() {
	return ((Class475_Sub1_Sub1_Sub1) this).aBool11328;
    }
    
    boolean method14448(Class103 class103, int i, int i_8_, int i_9_) {
	Class272 class272
	    = (((Class475_Sub1_Sub1_Sub1) this).aClass532_11323.getObjectDefinition
	       (-682508355 * ((Class475_Sub1_Sub1_Sub1) this).anInt11321,
		577892407)
	       .aClass272_6905);
	if (class272 != null)
	    return class103.method2280(i, i_8_, method10893(), class272,
				       (byte) -55);
	Class89 class89 = method17726(class103, 131072, (byte) 70);
	if (null != class89) {
	    Class266 class266 = method10893();
	    return class89.method1891(i, i_8_, class266, false, 0);
	}
	return false;
    }
    
    public int method10() {
	return ((Class475_Sub1_Sub1_Sub1) this).aByte11322;
    }
    
    void method14476(Class103 class103) {
	/* empty */
    }
    
    void method14454(byte i) {
	((Class475_Sub1_Sub1_Sub1) this).aBool11327 = false;
	if (null != ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319)
	    ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1928
		(((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1866()
		 & ~0x10000);
    }
    
    public int method146(byte i) {
	return ((Class475_Sub1_Sub1_Sub1) this).anInt11321 * -682508355;
    }
    
    public int method139(int i) {
	return ((Class475_Sub1_Sub1_Sub1) this).aByte11322;
    }
    
    public int method140(int i) {
	return ((Class475_Sub1_Sub1_Sub1) this).aByte11324;
    }
    
    public void method143(int i) {
	if (((Class475_Sub1_Sub1_Sub1) this).aClass89_11319 != null)
	    ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1867();
    }
    
    public boolean method157(byte i) {
	return ((Class475_Sub1_Sub1_Sub1) this).aBool11329;
    }
    
    Class542 method14472(Class103 class103) {
	if (null == ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319)
	    return null;
	Class266 class266 = method10893();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub1_Sub1) this).aBool11326,
				  -2140506334);
	Class272 class272
	    = (((Class475_Sub1_Sub1_Sub1) this).aClass532_11323.getObjectDefinition
	       (-682508355 * ((Class475_Sub1_Sub1_Sub1) this).anInt11321,
		577892407)
	       .aClass272_6905);
	if (null != class272) {
	    ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0], class272);
	} else
	    ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		.method1890(class266, aClass97Array8748[0], 0);
	return class542;
    }
    
    public void method144(Class103 class103, int i) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((((Class475_Sub1_Sub1_Sub1) this).aClass241_Sub39_Sub17_11320
	     == null)
	    && ((Class475_Sub1_Sub1_Sub1) this).aBool11328) {
	    Class399 class399
		= method17727(class103, 262144, true, -2127219939);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (null != class399
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub1_Sub1) this).aClass241_Sub39_Sub17_11320;
	    ((Class475_Sub1_Sub1_Sub1) this).aClass241_Sub39_Sub17_11320
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (null != class241_sub39_sub17)
	    aClass552_8744.method12205(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -528237258);
    }
    
    void method14482(Class103 class103, Class475_Sub1 class475_sub1, int i,
		     int i_10_, int i_11_, boolean bool) {
	if (class475_sub1 instanceof Class475_Sub1_Sub3_Sub2) {
	    Class475_Sub1_Sub3_Sub2 class475_sub1_sub3_sub2
		= (Class475_Sub1_Sub3_Sub2) class475_sub1;
	    if (((Class475_Sub1_Sub1_Sub1) this).aClass89_11319 != null
		&& (((Class475_Sub1_Sub3_Sub2) class475_sub1_sub3_sub2)
		    .aClass89_11353) != null)
		((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1920
		    ((((Class475_Sub1_Sub3_Sub2) class475_sub1_sub3_sub2)
		      .aClass89_11353),
		     i, i_10_, i_11_, bool);
	} else if (class475_sub1 instanceof Class475_Sub1_Sub1_Sub1) {
	    Class475_Sub1_Sub1_Sub1 class475_sub1_sub1_sub1_12_
		= (Class475_Sub1_Sub1_Sub1) class475_sub1;
	    if (((Class475_Sub1_Sub1_Sub1) this).aClass89_11319 != null
		&& null != ((Class475_Sub1_Sub1_Sub1)
			    class475_sub1_sub1_sub1_12_).aClass89_11319)
		((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1920
		    ((((Class475_Sub1_Sub1_Sub1) class475_sub1_sub1_sub1_12_)
		      .aClass89_11319),
		     i, i_10_, i_11_, bool);
	}
    }
    
    public int method17728(byte i) {
	return (null != ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		? (((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1893()
		   / 4)
		: 15);
    }
    
    public int method9() {
	return ((Class475_Sub1_Sub1_Sub1) this).anInt11321 * -682508355;
    }
    
    public void method149() {
	if (((Class475_Sub1_Sub1_Sub1) this).aClass89_11319 != null)
	    ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1867();
    }
    
    public int method11() {
	return ((Class475_Sub1_Sub1_Sub1) this).aByte11322;
    }
    
    public int method147() {
	return ((Class475_Sub1_Sub1_Sub1) this).aByte11324;
    }
    
    public int method14492() {
	return (null != ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		? ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1902()
		: 0);
    }
    
    public Class535 method14457(Class103 class103, int i) {
	Class287 class287 = method10874().aClass287_4386;
	if (((Class475_Sub1_Sub1_Sub1) this).aClass535_11318 == null)
	    ((Class475_Sub1_Sub1_Sub1) this).aClass535_11318
		= Class109.method2768((int) class287.aFloat4477,
				      (int) class287.aFloat4474,
				      (int) class287.aFloat4479,
				      method17726(class103, 0, (byte) 78),
				      1137721929);
	return ((Class475_Sub1_Sub1_Sub1) this).aClass535_11318;
    }
    
    Class399 method17729(Class103 class103, int i, boolean bool) {
	ObjectDefinition class526
	    = (((Class475_Sub1_Sub1_Sub1) this).aClass532_11323.getObjectDefinition
	       (((Class475_Sub1_Sub1_Sub1) this).anInt11321 * -682508355,
		577892407));
	Class166 class166;
	Class166 class166_13_;
	if (((Class475_Sub1_Sub1_Sub1) this).aBool11325) {
	    class166 = aClass552_8744.aClass166Array7140[aByte8745];
	    class166_13_ = aClass552_8744.aClass166Array7179[0];
	} else {
	    class166 = aClass552_8744.aClass166Array7179[aByte8745];
	    if (aByte8745 < 3)
		class166_13_
		    = aClass552_8744.aClass166Array7179[aByte8745 + 1];
	    else
		class166_13_ = null;
	}
	Class287 class287 = method10874().aClass287_4386;
	return (class526.method11765
		(class103, i,
		 ((((Class475_Sub1_Sub1_Sub1) this).aByte11322
		   != Class527.aClass527_6909.anInt6931 * -2030829961)
		  ? (int) ((Class475_Sub1_Sub1_Sub1) this).aByte11322
		  : -2030829961 * Class527.aClass527_6928.anInt6931),
		 ((((Class475_Sub1_Sub1_Sub1) this).aByte11322
		   == -2030829961 * Class527.aClass527_6909.anInt6931)
		  ? (int) (((Class475_Sub1_Sub1_Sub1) this).aByte11324 + 4)
		  : ((Class475_Sub1_Sub1_Sub1) this).aByte11324),
		 class166, class166_13_, (int) class287.aFloat4477,
		 (int) class287.aFloat4474, (int) class287.aFloat4479, bool,
		 null, -1219737013));
    }
    
    public boolean method151() {
	return ((Class475_Sub1_Sub1_Sub1) this).aBool11328;
    }
    
    public boolean method155() {
	return ((Class475_Sub1_Sub1_Sub1) this).aBool11328;
    }
    
    boolean method14450(int i) {
	return ((Class475_Sub1_Sub1_Sub1) this).aBool11327;
    }
    
    public boolean method154() {
	return ((Class475_Sub1_Sub1_Sub1) this).aBool11329;
    }
    
    public boolean method138() {
	return ((Class475_Sub1_Sub1_Sub1) this).aBool11329;
    }
    
    public boolean method152() {
	return ((Class475_Sub1_Sub1_Sub1) this).aBool11329;
    }
    
    public boolean method156() {
	return ((Class475_Sub1_Sub1_Sub1) this).aBool11329;
    }
    
    public void method141(Class103 class103) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((((Class475_Sub1_Sub1_Sub1) this).aClass241_Sub39_Sub17_11320
	     == null)
	    && ((Class475_Sub1_Sub1_Sub1) this).aBool11328) {
	    Class399 class399
		= method17727(class103, 262144, true, -2104139492);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (null != class399
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub1_Sub1) this).aClass241_Sub39_Sub17_11320;
	    ((Class475_Sub1_Sub1_Sub1) this).aClass241_Sub39_Sub17_11320
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (null != class241_sub39_sub17)
	    aClass552_8744.method12205(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -1446501489);
    }
    
    public void method158(Class103 class103) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((((Class475_Sub1_Sub1_Sub1) this).aClass241_Sub39_Sub17_11320
	     == null)
	    && ((Class475_Sub1_Sub1_Sub1) this).aBool11328) {
	    Class399 class399
		= method17727(class103, 262144, true, -1974663358);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (null != class399
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub1_Sub1) this).aClass241_Sub39_Sub17_11320;
	    ((Class475_Sub1_Sub1_Sub1) this).aClass241_Sub39_Sub17_11320
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (null != class241_sub39_sub17)
	    aClass552_8744.method12205(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -1711476220);
    }
    
    public int method17730() {
	return (null != ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		? (((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1893()
		   / 4)
		: 15);
    }
    
    boolean method14466() {
	if (((Class475_Sub1_Sub1_Sub1) this).aClass89_11319 != null)
	    return !((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
			.method1914();
	return true;
    }
    
    boolean method14467() {
	if (((Class475_Sub1_Sub1_Sub1) this).aClass89_11319 != null)
	    return ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		       .method2052();
	return false;
    }
    
    boolean method14469(byte i) {
	if (((Class475_Sub1_Sub1_Sub1) this).aClass89_11319 != null)
	    return !((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
			.method1914();
	return true;
    }
    
    Class399 method17731(Class103 class103, int i, boolean bool) {
	ObjectDefinition class526
	    = (((Class475_Sub1_Sub1_Sub1) this).aClass532_11323.getObjectDefinition
	       (((Class475_Sub1_Sub1_Sub1) this).anInt11321 * -682508355,
		577892407));
	Class166 class166;
	Class166 class166_14_;
	if (((Class475_Sub1_Sub1_Sub1) this).aBool11325) {
	    class166 = aClass552_8744.aClass166Array7140[aByte8745];
	    class166_14_ = aClass552_8744.aClass166Array7179[0];
	} else {
	    class166 = aClass552_8744.aClass166Array7179[aByte8745];
	    if (aByte8745 < 3)
		class166_14_
		    = aClass552_8744.aClass166Array7179[aByte8745 + 1];
	    else
		class166_14_ = null;
	}
	Class287 class287 = method10874().aClass287_4386;
	return (class526.method11765
		(class103, i,
		 ((((Class475_Sub1_Sub1_Sub1) this).aByte11322
		   != Class527.aClass527_6909.anInt6931 * -2030829961)
		  ? (int) ((Class475_Sub1_Sub1_Sub1) this).aByte11322
		  : -2030829961 * Class527.aClass527_6928.anInt6931),
		 ((((Class475_Sub1_Sub1_Sub1) this).aByte11322
		   == -2030829961 * Class527.aClass527_6909.anInt6931)
		  ? (int) (((Class475_Sub1_Sub1_Sub1) this).aByte11324 + 4)
		  : ((Class475_Sub1_Sub1_Sub1) this).aByte11324),
		 class166, class166_14_, (int) class287.aFloat4477,
		 (int) class287.aFloat4474, (int) class287.aFloat4479, bool,
		 null, -1219737013));
    }
    
    public Class535 method14470(Class103 class103) {
	Class287 class287 = method10874().aClass287_4386;
	if (((Class475_Sub1_Sub1_Sub1) this).aClass535_11318 == null)
	    ((Class475_Sub1_Sub1_Sub1) this).aClass535_11318
		= Class109.method2768((int) class287.aFloat4477,
				      (int) class287.aFloat4474,
				      (int) class287.aFloat4479,
				      method17726(class103, 0, (byte) 118),
				      1492600692);
	return ((Class475_Sub1_Sub1_Sub1) this).aClass535_11318;
    }
    
    boolean method14456() {
	return ((Class475_Sub1_Sub1_Sub1) this).aBool11327;
    }
    
    Class542 method14473(Class103 class103) {
	if (null == ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319)
	    return null;
	Class266 class266 = method10893();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub1_Sub1) this).aBool11326,
				  -2070299574);
	Class272 class272
	    = (((Class475_Sub1_Sub1_Sub1) this).aClass532_11323.getObjectDefinition
	       (-682508355 * ((Class475_Sub1_Sub1_Sub1) this).anInt11321,
		577892407)
	       .aClass272_6905);
	if (null != class272) {
	    ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0], class272);
	} else
	    ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		.method1890(class266, aClass97Array8748[0], 0);
	return class542;
    }
    
    Class542 method14474(Class103 class103) {
	if (null == ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319)
	    return null;
	Class266 class266 = method10893();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub1_Sub1) this).aBool11326,
				  -2085118712);
	Class272 class272
	    = (((Class475_Sub1_Sub1_Sub1) this).aClass532_11323.getObjectDefinition
	       (-682508355 * ((Class475_Sub1_Sub1_Sub1) this).anInt11321,
		577892407)
	       .aClass272_6905);
	if (null != class272) {
	    ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0], class272);
	} else
	    ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		.method1890(class266, aClass97Array8748[0], 0);
	return class542;
    }
    
    Class542 method14475(Class103 class103) {
	if (null == ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319)
	    return null;
	Class266 class266 = method10893();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub1_Sub1) this).aBool11326,
				  -2144113325);
	Class272 class272
	    = (((Class475_Sub1_Sub1_Sub1) this).aClass532_11323.getObjectDefinition
	       (-682508355 * ((Class475_Sub1_Sub1_Sub1) this).anInt11321,
		577892407)
	       .aClass272_6905);
	if (null != class272) {
	    ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0], class272);
	} else
	    ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		.method1890(class266, aClass97Array8748[0], 0);
	return class542;
    }
    
    public void method148() {
	if (((Class475_Sub1_Sub1_Sub1) this).aClass89_11319 != null)
	    ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1867();
    }
    
    boolean method14477() {
	return ((Class475_Sub1_Sub1_Sub1) this).aBool11327;
    }
    
    static byte method17732(int i, int i_15_) {
	if (Class527.aClass527_6912.anInt6931 * -2030829961 != i)
	    return (byte) 0;
	if (0 == (i_15_ & 0x1))
	    return (byte) 1;
	return (byte) 2;
    }
    
    boolean method14451() {
	if (((Class475_Sub1_Sub1_Sub1) this).aClass89_11319 != null)
	    return ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		       .method2052();
	return false;
    }
    
    void method14480(Class103 class103, Class475_Sub1 class475_sub1, int i,
		     int i_16_, int i_17_, boolean bool) {
	if (class475_sub1 instanceof Class475_Sub1_Sub3_Sub2) {
	    Class475_Sub1_Sub3_Sub2 class475_sub1_sub3_sub2
		= (Class475_Sub1_Sub3_Sub2) class475_sub1;
	    if (((Class475_Sub1_Sub1_Sub1) this).aClass89_11319 != null
		&& (((Class475_Sub1_Sub3_Sub2) class475_sub1_sub3_sub2)
		    .aClass89_11353) != null)
		((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1920
		    ((((Class475_Sub1_Sub3_Sub2) class475_sub1_sub3_sub2)
		      .aClass89_11353),
		     i, i_16_, i_17_, bool);
	} else if (class475_sub1 instanceof Class475_Sub1_Sub1_Sub1) {
	    Class475_Sub1_Sub1_Sub1 class475_sub1_sub1_sub1_18_
		= (Class475_Sub1_Sub1_Sub1) class475_sub1;
	    if (((Class475_Sub1_Sub1_Sub1) this).aClass89_11319 != null
		&& null != ((Class475_Sub1_Sub1_Sub1)
			    class475_sub1_sub1_sub1_18_).aClass89_11319)
		((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1920
		    ((((Class475_Sub1_Sub1_Sub1) class475_sub1_sub1_sub1_18_)
		      .aClass89_11319),
		     i, i_16_, i_17_, bool);
	}
    }
    
    void method14481(Class103 class103, Class475_Sub1 class475_sub1, int i,
		     int i_19_, int i_20_, boolean bool) {
	if (class475_sub1 instanceof Class475_Sub1_Sub3_Sub2) {
	    Class475_Sub1_Sub3_Sub2 class475_sub1_sub3_sub2
		= (Class475_Sub1_Sub3_Sub2) class475_sub1;
	    if (((Class475_Sub1_Sub1_Sub1) this).aClass89_11319 != null
		&& (((Class475_Sub1_Sub3_Sub2) class475_sub1_sub3_sub2)
		    .aClass89_11353) != null)
		((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1920
		    ((((Class475_Sub1_Sub3_Sub2) class475_sub1_sub3_sub2)
		      .aClass89_11353),
		     i, i_19_, i_20_, bool);
	} else if (class475_sub1 instanceof Class475_Sub1_Sub1_Sub1) {
	    Class475_Sub1_Sub1_Sub1 class475_sub1_sub1_sub1_21_
		= (Class475_Sub1_Sub1_Sub1) class475_sub1;
	    if (((Class475_Sub1_Sub1_Sub1) this).aClass89_11319 != null
		&& null != ((Class475_Sub1_Sub1_Sub1)
			    class475_sub1_sub1_sub1_21_).aClass89_11319)
		((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1920
		    ((((Class475_Sub1_Sub1_Sub1) class475_sub1_sub1_sub1_21_)
		      .aClass89_11319),
		     i, i_19_, i_20_, bool);
	}
    }
    
    Class542 method14455(Class103 class103, int i) {
	if (null == ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319)
	    return null;
	Class266 class266 = method10893();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub1_Sub1) this).aBool11326,
				  -2143656005);
	Class272 class272
	    = (((Class475_Sub1_Sub1_Sub1) this).aClass532_11323.getObjectDefinition
	       (-682508355 * ((Class475_Sub1_Sub1_Sub1) this).anInt11321,
		577892407)
	       .aClass272_6905);
	if (null != class272) {
	    ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0], class272);
	} else
	    ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		.method1890(class266, aClass97Array8748[0], 0);
	return class542;
    }
    
    void method14483() {
	((Class475_Sub1_Sub1_Sub1) this).aBool11327 = false;
	if (null != ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319)
	    ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1928
		(((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1866()
		 & ~0x10000);
    }
    
    void method14478() {
	((Class475_Sub1_Sub1_Sub1) this).aBool11327 = false;
	if (null != ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319)
	    ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1928
		(((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1866()
		 & ~0x10000);
    }
    
    public void method160(Class103 class103) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((((Class475_Sub1_Sub1_Sub1) this).aClass241_Sub39_Sub17_11320
	     == null)
	    && ((Class475_Sub1_Sub1_Sub1) this).aBool11328) {
	    Class399 class399
		= method17727(class103, 262144, true, -2089023837);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (null != class399
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub1_Sub1) this).aClass241_Sub39_Sub17_11320;
	    ((Class475_Sub1_Sub1_Sub1) this).aClass241_Sub39_Sub17_11320
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (class241_sub39_sub17 != null)
	    aClass552_8744.method12150(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -2053709654);
    }
    
    boolean method14488(Class103 class103, int i, int i_22_) {
	Class272 class272
	    = (((Class475_Sub1_Sub1_Sub1) this).aClass532_11323.getObjectDefinition
	       (-682508355 * ((Class475_Sub1_Sub1_Sub1) this).anInt11321,
		577892407)
	       .aClass272_6905);
	if (class272 != null)
	    return class103.method2280(i, i_22_, method10893(), class272,
				       (byte) 51);
	Class89 class89 = method17726(class103, 131072, (byte) 20);
	if (null != class89) {
	    Class266 class266 = method10893();
	    return class89.method1891(i, i_22_, class266, false, 0);
	}
	return false;
    }
    
    static byte method17733(int i, int i_23_) {
	if (Class527.aClass527_6912.anInt6931 * -2030829961 != i)
	    return (byte) 0;
	if (0 == (i_23_ & 0x1))
	    return (byte) 1;
	return (byte) 2;
    }
    
    public Class475_Sub1_Sub1_Sub1
	(Class552 class552, Class103 class103, ObjectDefinitionLoader class532,
	 ObjectDefinition class526, int i, int i_24_, int i_25_, int i_26_, int i_27_,
	 boolean bool, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_,
	 int i_33_, boolean bool_34_, boolean bool_35_) {
	super(class552, i, i_24_, i_25_, i_26_, i_27_, i_28_, i_29_, i_30_,
	      i_31_, -309513503 * class526.anInt6881 == 1,
	      Class456.method10577(i_32_, i_33_, -1395910913));
	((Class475_Sub1_Sub1_Sub1) this).aClass532_11323 = class532;
	((Class475_Sub1_Sub1_Sub1) this).anInt11321
	    = class526.objectID * -1069706371;
	aByte8745 = (byte) i_24_;
	((Class475_Sub1_Sub1_Sub1) this).aBool11325 = bool;
	((Class475_Sub1_Sub1_Sub1) this).aByte11322 = (byte) i_32_;
	((Class475_Sub1_Sub1_Sub1) this).aByte11324 = (byte) i_33_;
	((Class475_Sub1_Sub1_Sub1) this).aBool11326
	    = 0 != -1389471035 * class526.anInt6848 && !bool;
	((Class475_Sub1_Sub1_Sub1) this).aBool11327 = bool_34_;
	((Class475_Sub1_Sub1_Sub1) this).aBool11328
	    = (class103.method2382() && class526.aBool6895
	       && !((Class475_Sub1_Sub1_Sub1) this).aBool11325
	       && Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .aClass445_Sub7_8865.method14150(281090878) != 0);
	((Class475_Sub1_Sub1_Sub1) this).aBool11329 = bool_35_;
	int i_36_ = 2048;
	if (((Class475_Sub1_Sub1_Sub1) this).aBool11327)
	    i_36_ |= 0x10000;
	if (class526.bloom)
	    i_36_ |= 0x80000;
	Class399 class399
	    = method17727(class103, i_36_,
			  ((Class475_Sub1_Sub1_Sub1) this).aBool11328,
			  -2083579536);
	if (null != class399) {
	    ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		= (Class89) class399.anObject5795;
	    ((Class475_Sub1_Sub1_Sub1) this).aClass241_Sub39_Sub17_11320
		= (Class241_Sub39_Sub17) class399.anObject5794;
	    if (((Class475_Sub1_Sub1_Sub1) this).aBool11327
		|| class526.bloom) {
		((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		    = ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
			  .method2019((byte) 0, i_36_, false);
		if (class526.bloom) {
		    Class230 class230
			= client.aClass238_8477.method4787((byte) 86);
		    ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1911
			(2009560023 * class230.anInt2681,
			 class230.anInt2682 * -801178581,
			 class230.anInt2683 * 1773755899,
			 -1710320751 * class230.anInt2684);
		}
	    }
	}
	method14465(1, 183040591);
    }
    
    public int method14468(byte i) {
	return (null != ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		? ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1902()
		: 0);
    }
    
    Class89 method17734(Class103 class103, int i) {
	if (null != ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
	    && class103.method2301(((Class475_Sub1_Sub1_Sub1) this)
				       .aClass89_11319.method1866(),
				   i) == 0)
	    return ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319;
	Class399 class399 = method17727(class103, i, false, -2049278669);
	if (null != class399)
	    return (Class89) class399.anObject5795;
	return null;
    }
    
    Class399 method17735(Class103 class103, int i, boolean bool) {
	ObjectDefinition class526
	    = (((Class475_Sub1_Sub1_Sub1) this).aClass532_11323.getObjectDefinition
	       (((Class475_Sub1_Sub1_Sub1) this).anInt11321 * -682508355,
		577892407));
	Class166 class166;
	Class166 class166_37_;
	if (((Class475_Sub1_Sub1_Sub1) this).aBool11325) {
	    class166 = aClass552_8744.aClass166Array7140[aByte8745];
	    class166_37_ = aClass552_8744.aClass166Array7179[0];
	} else {
	    class166 = aClass552_8744.aClass166Array7179[aByte8745];
	    if (aByte8745 < 3)
		class166_37_
		    = aClass552_8744.aClass166Array7179[aByte8745 + 1];
	    else
		class166_37_ = null;
	}
	Class287 class287 = method10874().aClass287_4386;
	return (class526.method11765
		(class103, i,
		 ((((Class475_Sub1_Sub1_Sub1) this).aByte11322
		   != Class527.aClass527_6909.anInt6931 * -2030829961)
		  ? (int) ((Class475_Sub1_Sub1_Sub1) this).aByte11322
		  : -2030829961 * Class527.aClass527_6928.anInt6931),
		 ((((Class475_Sub1_Sub1_Sub1) this).aByte11322
		   == -2030829961 * Class527.aClass527_6909.anInt6931)
		  ? (int) (((Class475_Sub1_Sub1_Sub1) this).aByte11324 + 4)
		  : ((Class475_Sub1_Sub1_Sub1) this).aByte11324),
		 class166, class166_37_, (int) class287.aFloat4477,
		 (int) class287.aFloat4474, (int) class287.aFloat4479, bool,
		 null, -1219737013));
    }
    
    boolean method14479() {
	return ((Class475_Sub1_Sub1_Sub1) this).aBool11327;
    }
    
    public void method145(Class103 class103, byte i) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((((Class475_Sub1_Sub1_Sub1) this).aClass241_Sub39_Sub17_11320
	     == null)
	    && ((Class475_Sub1_Sub1_Sub1) this).aBool11328) {
	    Class399 class399
		= method17727(class103, 262144, true, -1967630699);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (null != class399
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub1_Sub1) this).aClass241_Sub39_Sub17_11320;
	    ((Class475_Sub1_Sub1_Sub1) this).aClass241_Sub39_Sub17_11320
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (class241_sub39_sub17 != null)
	    aClass552_8744.method12150(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -1868311850);
    }
    
    public int method17736() {
	return (null != ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		? (((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1893()
		   / 4)
		: 15);
    }
    
    public void method159(Class103 class103) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((((Class475_Sub1_Sub1_Sub1) this).aClass241_Sub39_Sub17_11320
	     == null)
	    && ((Class475_Sub1_Sub1_Sub1) this).aBool11328) {
	    Class399 class399
		= method17727(class103, 262144, true, -2127940179);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (null != class399
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub1_Sub1) this).aClass241_Sub39_Sub17_11320;
	    ((Class475_Sub1_Sub1_Sub1) this).aClass241_Sub39_Sub17_11320
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (null != class241_sub39_sub17)
	    aClass552_8744.method12205(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -1515056284);
    }
    
    public int method17737() {
	return (null != ((Class475_Sub1_Sub1_Sub1) this).aClass89_11319
		? (((Class475_Sub1_Sub1_Sub1) this).aClass89_11319.method1893()
		   / 4)
		: 15);
    }
}
