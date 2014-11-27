/* Class475_Sub1_Sub5_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class475_Sub1_Sub5_Sub2 extends Class475_Sub1_Sub5
    implements Interface24
{
    boolean aBool11330;
    ObjectDefinitionLoader aClass532_11331;
    Class241_Sub39_Sub17 aClass241_Sub39_Sub17_11332;
    Class535 aClass535_11333;
    int anInt11334;
    Class89 aClass89_11335;
    byte aByte11336;
    byte aByte11337;
    boolean aBool11338;
    boolean aBool11339;
    
    Class542 method14473(Class103 class103) {
	if (null == ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335)
	    return null;
	Class266 class266 = class103.method2595();
	class266.method5175(method10893());
	class266.method5133((float) aShort10749, 0.0F, (float) aShort10748);
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub5_Sub2) this).aBool11338,
				  -2085048285);
	Class272 class272
	    = (((Class475_Sub1_Sub5_Sub2) this).aClass532_11331.getObjectDefinition
	       (((Class475_Sub1_Sub5_Sub2) this).anInt11334 * -810177987,
		577892407)
	       .aClass272_6905);
	if (class272 != null) {
	    ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335
		.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0], class272);
	} else
	    ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335
		.method1890(class266, aClass97Array8748[0], 0);
	return class542;
    }
    
    boolean method14469(byte i) {
	if (((Class475_Sub1_Sub5_Sub2) this).aClass89_11335 != null)
	    return !((Class475_Sub1_Sub5_Sub2) this).aClass89_11335
			.method1914();
	return true;
    }
    
    boolean method14452(byte i) {
	if (((Class475_Sub1_Sub5_Sub2) this).aClass89_11335 != null)
	    return ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335
		       .method2052();
	return false;
    }
    
    public int method14468(byte i) {
	return (((Class475_Sub1_Sub5_Sub2) this).aClass89_11335 != null
		? ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335.method1902()
		: 0);
    }
    
    public boolean method156() {
	return true;
    }
    
    Class399 method17738(Class103 class103, int i, boolean bool, int i_0_) {
	ObjectDefinition class526
	    = (((Class475_Sub1_Sub5_Sub2) this).aClass532_11331.getObjectDefinition
	       (((Class475_Sub1_Sub5_Sub2) this).anInt11334 * -810177987,
		577892407));
	Class166 class166;
	Class166 class166_1_;
	if (((Class475_Sub1_Sub5_Sub2) this).aBool11330) {
	    class166 = aClass552_8744.aClass166Array7140[aByte8745];
	    class166_1_ = aClass552_8744.aClass166Array7179[0];
	} else {
	    class166 = aClass552_8744.aClass166Array7179[aByte8745];
	    if (aByte8745 < 3)
		class166_1_ = aClass552_8744.aClass166Array7179[1 + aByte8745];
	    else
		class166_1_ = null;
	}
	Class287 class287 = method10874().aClass287_4386;
	return (class526.method11765
		(class103, i, ((Class475_Sub1_Sub5_Sub2) this).aByte11337,
		 ((Class475_Sub1_Sub5_Sub2) this).aByte11336, class166,
		 class166_1_, (int) class287.aFloat4477,
		 (int) class287.aFloat4474, (int) class287.aFloat4479, bool,
		 null, -1219737013));
    }
    
    public Class535 method14457(Class103 class103, int i) {
	Class287 class287 = method10874().aClass287_4386;
	if (null == ((Class475_Sub1_Sub5_Sub2) this).aClass535_11333)
	    ((Class475_Sub1_Sub5_Sub2) this).aClass535_11333
		= Class109.method2768((int) class287.aFloat4477,
				      (int) class287.aFloat4474,
				      (int) class287.aFloat4479,
				      method17739(class103, 0, -2002117980),
				      1618031005);
	return ((Class475_Sub1_Sub5_Sub2) this).aClass535_11333;
    }
    
    Class542 method14455(Class103 class103, int i) {
	if (null == ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335)
	    return null;
	Class266 class266 = class103.method2595();
	class266.method5175(method10893());
	class266.method5133((float) aShort10749, 0.0F, (float) aShort10748);
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub5_Sub2) this).aBool11338,
				  -2079875359);
	Class272 class272
	    = (((Class475_Sub1_Sub5_Sub2) this).aClass532_11331.getObjectDefinition
	       (((Class475_Sub1_Sub5_Sub2) this).anInt11334 * -810177987,
		577892407)
	       .aClass272_6905);
	if (class272 != null) {
	    ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335
		.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0], class272);
	} else
	    ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335
		.method1890(class266, aClass97Array8748[0], 0);
	return class542;
    }
    
    void method14493(Class103 class103, byte i) {
	/* empty */
    }
    
    boolean method14448(Class103 class103, int i, int i_2_, int i_3_) {
	Class272 class272
	    = (((Class475_Sub1_Sub5_Sub2) this).aClass532_11331.getObjectDefinition
	       (-810177987 * ((Class475_Sub1_Sub5_Sub2) this).anInt11334,
		577892407)
	       .aClass272_6905);
	if (class272 != null)
	    return class103.method2280(i, i_2_, method10893(), class272,
				       (byte) -14);
	Class89 class89 = method17739(class103, 131072, -2031893430);
	if (null != class89) {
	    Class266 class266 = method10893();
	    return class89.method1891(i, i_2_, class266, false, 0);
	}
	return false;
    }
    
    public int method146(byte i) {
	return ((Class475_Sub1_Sub5_Sub2) this).anInt11334 * -810177987;
    }
    
    public int method139(int i) {
	return ((Class475_Sub1_Sub5_Sub2) this).aByte11337;
    }
    
    public int method140(int i) {
	return ((Class475_Sub1_Sub5_Sub2) this).aByte11336;
    }
    
    public void method148() {
	if (null != ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335)
	    ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335.method1867();
    }
    
    public boolean method157(byte i) {
	return true;
    }
    
    public boolean method153() {
	return ((Class475_Sub1_Sub5_Sub2) this).aBool11339;
    }
    
    public boolean method138() {
	return true;
    }
    
    public int method10() {
	return ((Class475_Sub1_Sub5_Sub2) this).aByte11337;
    }
    
    boolean method14488(Class103 class103, int i, int i_4_) {
	Class272 class272
	    = (((Class475_Sub1_Sub5_Sub2) this).aClass532_11331.getObjectDefinition
	       (-810177987 * ((Class475_Sub1_Sub5_Sub2) this).anInt11334,
		577892407)
	       .aClass272_6905);
	if (class272 != null)
	    return class103.method2280(i, i_4_, method10893(), class272,
				       (byte) 62);
	Class89 class89 = method17739(class103, 131072, -1908525549);
	if (null != class89) {
	    Class266 class266 = method10893();
	    return class89.method1891(i, i_4_, class266, false, 0);
	}
	return false;
    }
    
    public Class475_Sub1_Sub5_Sub2
	(Class552 class552, Class103 class103, ObjectDefinitionLoader class532,
	 ObjectDefinition class526, int i, int i_5_, int i_6_, int i_7_, int i_8_,
	 boolean bool, int i_9_, int i_10_, int i_11_, int i_12_) {
	super(class552, i_6_, i_7_, i_8_, i, i_5_, i_9_, i_10_);
	((Class475_Sub1_Sub5_Sub2) this).aClass532_11331 = class532;
	((Class475_Sub1_Sub5_Sub2) this).anInt11334
	    = -1105590019 * class526.objectID;
	((Class475_Sub1_Sub5_Sub2) this).aBool11330 = bool;
	((Class475_Sub1_Sub5_Sub2) this).aByte11336 = (byte) i_12_;
	((Class475_Sub1_Sub5_Sub2) this).aByte11337 = (byte) i_11_;
	((Class475_Sub1_Sub5_Sub2) this).aBool11338
	    = 0 != -1389471035 * class526.anInt6848 && !bool;
	((Class475_Sub1_Sub5_Sub2) this).aBool11339
	    = (class103.method2382() && class526.aBool6895
	       && !((Class475_Sub1_Sub5_Sub2) this).aBool11330
	       && Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .aClass445_Sub7_8865.method14150(-117967496) != 0);
	int i_13_ = 2048;
	if (class526.bloom)
	    i_13_ |= 0x80000;
	Class399 class399
	    = method17738(class103, i_13_,
			  ((Class475_Sub1_Sub5_Sub2) this).aBool11339,
			  -660440435);
	if (null != class399) {
	    ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335
		= (Class89) class399.anObject5795;
	    ((Class475_Sub1_Sub5_Sub2) this).aClass241_Sub39_Sub17_11332
		= (Class241_Sub39_Sub17) class399.anObject5794;
	    if (class526.bloom) {
		((Class475_Sub1_Sub5_Sub2) this).aClass89_11335
		    = ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335
			  .method2019((byte) 0, i_13_, false);
		if (class526.bloom) {
		    Class230 class230
			= client.aClass238_8477.method4787((byte) 87);
		    ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335.method1911
			(2009560023 * class230.anInt2681,
			 -801178581 * class230.anInt2682,
			 class230.anInt2683 * 1773755899,
			 -1710320751 * class230.anInt2684);
		}
	    }
	}
	method14465(1, 401661315);
    }
    
    public int method11() {
	return ((Class475_Sub1_Sub5_Sub2) this).aByte11337;
    }
    
    public int method147() {
	return ((Class475_Sub1_Sub5_Sub2) this).aByte11336;
    }
    
    public void method144(Class103 class103, int i) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((null
	     == ((Class475_Sub1_Sub5_Sub2) this).aClass241_Sub39_Sub17_11332)
	    && ((Class475_Sub1_Sub5_Sub2) this).aBool11339) {
	    Class399 class399 = method17738(class103, 262144, true, -10174168);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (class399 != null
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub5_Sub2) this).aClass241_Sub39_Sub17_11332;
	    ((Class475_Sub1_Sub5_Sub2) this).aClass241_Sub39_Sub17_11332
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (null != class241_sub39_sub17)
	    aClass552_8744.method12205(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -1801545884);
    }
    
    public void method149() {
	if (null != ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335)
	    ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335.method1867();
    }
    
    public boolean method150() {
	return ((Class475_Sub1_Sub5_Sub2) this).aBool11339;
    }
    
    public boolean method151() {
	return ((Class475_Sub1_Sub5_Sub2) this).aBool11339;
    }
    
    public boolean method155() {
	return ((Class475_Sub1_Sub5_Sub2) this).aBool11339;
    }
    
    public int method9() {
	return ((Class475_Sub1_Sub5_Sub2) this).anInt11334 * -810177987;
    }
    
    public boolean method154() {
	return true;
    }
    
    public Class535 method14470(Class103 class103) {
	Class287 class287 = method10874().aClass287_4386;
	if (null == ((Class475_Sub1_Sub5_Sub2) this).aClass535_11333)
	    ((Class475_Sub1_Sub5_Sub2) this).aClass535_11333
		= Class109.method2768((int) class287.aFloat4477,
				      (int) class287.aFloat4474,
				      (int) class287.aFloat4479,
				      method17739(class103, 0, -1804803629),
				      1578285200);
	return ((Class475_Sub1_Sub5_Sub2) this).aClass535_11333;
    }
    
    public boolean method152() {
	return true;
    }
    
    public void method141(Class103 class103) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((null
	     == ((Class475_Sub1_Sub5_Sub2) this).aClass241_Sub39_Sub17_11332)
	    && ((Class475_Sub1_Sub5_Sub2) this).aBool11339) {
	    Class399 class399
		= method17738(class103, 262144, true, -1332559839);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (class399 != null
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub5_Sub2) this).aClass241_Sub39_Sub17_11332;
	    ((Class475_Sub1_Sub5_Sub2) this).aClass241_Sub39_Sub17_11332
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (null != class241_sub39_sub17)
	    aClass552_8744.method12205(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -466273150);
    }
    
    public void method145(Class103 class103, byte i) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((null
	     == ((Class475_Sub1_Sub5_Sub2) this).aClass241_Sub39_Sub17_11332)
	    && ((Class475_Sub1_Sub5_Sub2) this).aBool11339) {
	    Class399 class399 = method17738(class103, 262144, true, 678452852);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (null != class399
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub5_Sub2) this).aClass241_Sub39_Sub17_11332;
	    ((Class475_Sub1_Sub5_Sub2) this).aClass241_Sub39_Sub17_11332
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (class241_sub39_sub17 != null)
	    aClass552_8744.method12150(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -2074974508);
    }
    
    public void method158(Class103 class103) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((null
	     == ((Class475_Sub1_Sub5_Sub2) this).aClass241_Sub39_Sub17_11332)
	    && ((Class475_Sub1_Sub5_Sub2) this).aBool11339) {
	    Class399 class399
		= method17738(class103, 262144, true, -949162410);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (class399 != null
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub5_Sub2) this).aClass241_Sub39_Sub17_11332;
	    ((Class475_Sub1_Sub5_Sub2) this).aClass241_Sub39_Sub17_11332
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (null != class241_sub39_sub17)
	    aClass552_8744.method12205(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -1601551571);
    }
    
    Class89 method17739(Class103 class103, int i, int i_14_) {
	if (null != ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335
	    && class103.method2301(((Class475_Sub1_Sub5_Sub2) this)
				       .aClass89_11335.method1866(),
				   i) == 0)
	    return ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335;
	Class399 class399 = method17738(class103, i, false, 1521412619);
	if (class399 != null)
	    return (Class89) class399.anObject5795;
	return null;
    }
    
    boolean method14466() {
	if (((Class475_Sub1_Sub5_Sub2) this).aClass89_11335 != null)
	    return !((Class475_Sub1_Sub5_Sub2) this).aClass89_11335
			.method1914();
	return true;
    }
    
    boolean method14467() {
	if (((Class475_Sub1_Sub5_Sub2) this).aClass89_11335 != null)
	    return ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335
		       .method2052();
	return false;
    }
    
    boolean method14451() {
	if (((Class475_Sub1_Sub5_Sub2) this).aClass89_11335 != null)
	    return ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335
		       .method2052();
	return false;
    }
    
    public int method14492() {
	return (((Class475_Sub1_Sub5_Sub2) this).aClass89_11335 != null
		? ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335.method1902()
		: 0);
    }
    
    public void method143(int i) {
	if (null != ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335)
	    ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335.method1867();
    }
    
    Class542 method14472(Class103 class103) {
	if (null == ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335)
	    return null;
	Class266 class266 = class103.method2595();
	class266.method5175(method10893());
	class266.method5133((float) aShort10749, 0.0F, (float) aShort10748);
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub5_Sub2) this).aBool11338,
				  -2143218073);
	Class272 class272
	    = (((Class475_Sub1_Sub5_Sub2) this).aClass532_11331.getObjectDefinition
	       (((Class475_Sub1_Sub5_Sub2) this).anInt11334 * -810177987,
		577892407)
	       .aClass272_6905);
	if (class272 != null) {
	    ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335
		.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0], class272);
	} else
	    ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335
		.method1890(class266, aClass97Array8748[0], 0);
	return class542;
    }
    
    public void method159(Class103 class103) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((null
	     == ((Class475_Sub1_Sub5_Sub2) this).aClass241_Sub39_Sub17_11332)
	    && ((Class475_Sub1_Sub5_Sub2) this).aBool11339) {
	    Class399 class399
		= method17738(class103, 262144, true, -1329229424);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (class399 != null
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub5_Sub2) this).aClass241_Sub39_Sub17_11332;
	    ((Class475_Sub1_Sub5_Sub2) this).aClass241_Sub39_Sub17_11332
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (null != class241_sub39_sub17)
	    aClass552_8744.method12205(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -1202540063);
    }
    
    Class542 method14474(Class103 class103) {
	if (null == ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335)
	    return null;
	Class266 class266 = class103.method2595();
	class266.method5175(method10893());
	class266.method5133((float) aShort10749, 0.0F, (float) aShort10748);
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub5_Sub2) this).aBool11338,
				  -2122072383);
	Class272 class272
	    = (((Class475_Sub1_Sub5_Sub2) this).aClass532_11331.getObjectDefinition
	       (((Class475_Sub1_Sub5_Sub2) this).anInt11334 * -810177987,
		577892407)
	       .aClass272_6905);
	if (class272 != null) {
	    ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335
		.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0], class272);
	} else
	    ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335
		.method1890(class266, aClass97Array8748[0], 0);
	return class542;
    }
    
    Class542 method14475(Class103 class103) {
	if (null == ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335)
	    return null;
	Class266 class266 = class103.method2595();
	class266.method5175(method10893());
	class266.method5133((float) aShort10749, 0.0F, (float) aShort10748);
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub5_Sub2) this).aBool11338,
				  -2117127062);
	Class272 class272
	    = (((Class475_Sub1_Sub5_Sub2) this).aClass532_11331.getObjectDefinition
	       (((Class475_Sub1_Sub5_Sub2) this).anInt11334 * -810177987,
		577892407)
	       .aClass272_6905);
	if (class272 != null) {
	    ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335
		.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0], class272);
	} else
	    ((Class475_Sub1_Sub5_Sub2) this).aClass89_11335
		.method1890(class266, aClass97Array8748[0], 0);
	return class542;
    }
    
    void method14476(Class103 class103) {
	/* empty */
    }
    
    public void method160(Class103 class103) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((null
	     == ((Class475_Sub1_Sub5_Sub2) this).aClass241_Sub39_Sub17_11332)
	    && ((Class475_Sub1_Sub5_Sub2) this).aBool11339) {
	    Class399 class399 = method17738(class103, 262144, true, 774071607);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (null != class399
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub5_Sub2) this).aClass241_Sub39_Sub17_11332;
	    ((Class475_Sub1_Sub5_Sub2) this).aClass241_Sub39_Sub17_11332
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (class241_sub39_sub17 != null)
	    aClass552_8744.method12150(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -2134690247);
    }
    
    public boolean method142(int i) {
	return ((Class475_Sub1_Sub5_Sub2) this).aBool11339;
    }
    
    Class399 method17740(Class103 class103, int i, boolean bool) {
	ObjectDefinition class526
	    = (((Class475_Sub1_Sub5_Sub2) this).aClass532_11331.getObjectDefinition
	       (((Class475_Sub1_Sub5_Sub2) this).anInt11334 * -810177987,
		577892407));
	Class166 class166;
	Class166 class166_15_;
	if (((Class475_Sub1_Sub5_Sub2) this).aBool11330) {
	    class166 = aClass552_8744.aClass166Array7140[aByte8745];
	    class166_15_ = aClass552_8744.aClass166Array7179[0];
	} else {
	    class166 = aClass552_8744.aClass166Array7179[aByte8745];
	    if (aByte8745 < 3)
		class166_15_
		    = aClass552_8744.aClass166Array7179[1 + aByte8745];
	    else
		class166_15_ = null;
	}
	Class287 class287 = method10874().aClass287_4386;
	return (class526.method11765
		(class103, i, ((Class475_Sub1_Sub5_Sub2) this).aByte11337,
		 ((Class475_Sub1_Sub5_Sub2) this).aByte11336, class166,
		 class166_15_, (int) class287.aFloat4477,
		 (int) class287.aFloat4474, (int) class287.aFloat4479, bool,
		 null, -1219737013));
    }
    
    Class399 method17741(Class103 class103, int i, boolean bool) {
	ObjectDefinition class526
	    = (((Class475_Sub1_Sub5_Sub2) this).aClass532_11331.getObjectDefinition
	       (((Class475_Sub1_Sub5_Sub2) this).anInt11334 * -810177987,
		577892407));
	Class166 class166;
	Class166 class166_16_;
	if (((Class475_Sub1_Sub5_Sub2) this).aBool11330) {
	    class166 = aClass552_8744.aClass166Array7140[aByte8745];
	    class166_16_ = aClass552_8744.aClass166Array7179[0];
	} else {
	    class166 = aClass552_8744.aClass166Array7179[aByte8745];
	    if (aByte8745 < 3)
		class166_16_
		    = aClass552_8744.aClass166Array7179[1 + aByte8745];
	    else
		class166_16_ = null;
	}
	Class287 class287 = method10874().aClass287_4386;
	return (class526.method11765
		(class103, i, ((Class475_Sub1_Sub5_Sub2) this).aByte11337,
		 ((Class475_Sub1_Sub5_Sub2) this).aByte11336, class166,
		 class166_16_, (int) class287.aFloat4477,
		 (int) class287.aFloat4474, (int) class287.aFloat4479, bool,
		 null, -1219737013));
    }
}
