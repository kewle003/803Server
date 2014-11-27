/* Class475_Sub1_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class475_Sub1_Sub4_Sub1 extends Class475_Sub1_Sub4
    implements Interface24
{
    boolean aBool11304;
    boolean aBool11305;
    Class241_Sub39_Sub17 aClass241_Sub39_Sub17_11306;
    Class535 aClass535_11307;
    int anInt11308;
    ObjectDefinitionLoader aClass532_11309;
    boolean aBool11310;
    boolean aBool11311;
    Class89 aClass89_11312;
    byte aByte11313;
    
    public boolean method153() {
	return ((Class475_Sub1_Sub4_Sub1) this).aBool11305;
    }
    
    boolean method14469(byte i) {
	if (((Class475_Sub1_Sub4_Sub1) this).aClass89_11312 != null)
	    return !((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
			.method1914();
	return true;
    }
    
    Class399 method17708(Class103 class103, int i, boolean bool) {
	ObjectDefinition class526
	    = (((Class475_Sub1_Sub4_Sub1) this).aClass532_11309.getObjectDefinition
	       (1875003195 * ((Class475_Sub1_Sub4_Sub1) this).anInt11308,
		577892407));
	Class166 class166;
	Class166 class166_0_;
	if (((Class475_Sub1_Sub4_Sub1) this).aBool11310) {
	    class166 = aClass552_8744.aClass166Array7140[aByte8745];
	    class166_0_ = aClass552_8744.aClass166Array7179[0];
	} else {
	    class166 = aClass552_8744.aClass166Array7179[aByte8745];
	    if (aByte8745 < 3)
		class166_0_ = aClass552_8744.aClass166Array7179[1 + aByte8745];
	    else
		class166_0_ = null;
	}
	Class287 class287 = method10874().aClass287_4386;
	return (class526.method11765
		(class103, i, Class527.aClass527_6917.anInt6931 * -2030829961,
		 ((Class475_Sub1_Sub4_Sub1) this).aByte11313, class166,
		 class166_0_, (int) class287.aFloat4477,
		 (int) class287.aFloat4474, (int) class287.aFloat4479, bool,
		 null, -1219737013));
    }
    
    public int method146(byte i) {
	return ((Class475_Sub1_Sub4_Sub1) this).anInt11308 * 1875003195;
    }
    
    Class89 method17709(Class103 class103, int i, int i_1_) {
	if (null != ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
	    && class103.method2301(((Class475_Sub1_Sub4_Sub1) this)
				       .aClass89_11312.method1866(),
				   i) == 0)
	    return ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312;
	Class399 class399 = method17711(class103, i, false, 1409403290);
	if (class399 != null)
	    return (Class89) class399.anObject5795;
	return null;
    }
    
    boolean method14452(byte i) {
	if (((Class475_Sub1_Sub4_Sub1) this).aClass89_11312 != null)
	    return ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
		       .method2052();
	return false;
    }
    
    public Class535 method14457(Class103 class103, int i) {
	Class287 class287 = method10874().aClass287_4386;
	if (((Class475_Sub1_Sub4_Sub1) this).aClass535_11307 == null)
	    ((Class475_Sub1_Sub4_Sub1) this).aClass535_11307
		= Class109.method2768((int) class287.aFloat4477,
				      (int) class287.aFloat4474,
				      (int) class287.aFloat4479,
				      method17709(class103, 0, -1829706083),
				      514058688);
	return ((Class475_Sub1_Sub4_Sub1) this).aClass535_11307;
    }
    
    Class542 method14455(Class103 class103, int i) {
	if (null == ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312)
	    return null;
	Class266 class266 = method10893();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub4_Sub1) this).aBool11311,
				  -2108525842);
	Class272 class272
	    = (((Class475_Sub1_Sub4_Sub1) this).aClass532_11309.getObjectDefinition
	       (((Class475_Sub1_Sub4_Sub1) this).anInt11308 * 1875003195,
		577892407)
	       .aClass272_6905);
	if (null != class272) {
	    ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
		.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0], class272);
	} else
	    ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
		.method1890(class266, aClass97Array8748[0], 0);
	return class542;
    }
    
    public int method11() {
	return Class527.aClass527_6917.anInt6931 * -2030829961;
    }
    
    boolean method14448(Class103 class103, int i, int i_2_, int i_3_) {
	Class272 class272
	    = (((Class475_Sub1_Sub4_Sub1) this).aClass532_11309.getObjectDefinition
	       (1875003195 * ((Class475_Sub1_Sub4_Sub1) this).anInt11308,
		577892407)
	       .aClass272_6905);
	if (null != class272)
	    return class103.method2280(i, i_2_, method10893(), class272,
				       (byte) -13);
	Class89 class89 = method17709(class103, 131072, -1309216126);
	if (class89 != null) {
	    Class266 class266 = method10893();
	    return class89.method1891(i, i_2_, class266, false, 0);
	}
	return false;
    }
    
    void method14453(Class103 class103, Class475_Sub1 class475_sub1, int i,
		     int i_4_, int i_5_, boolean bool, int i_6_) {
	if (class475_sub1 instanceof Class475_Sub1_Sub4_Sub1) {
	    Class475_Sub1_Sub4_Sub1 class475_sub1_sub4_sub1_7_
		= (Class475_Sub1_Sub4_Sub1) class475_sub1;
	    if (null != ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
		&& null != ((Class475_Sub1_Sub4_Sub1)
			    class475_sub1_sub4_sub1_7_).aClass89_11312)
		((Class475_Sub1_Sub4_Sub1) this).aClass89_11312.method1920
		    ((((Class475_Sub1_Sub4_Sub1) class475_sub1_sub4_sub1_7_)
		      .aClass89_11312),
		     i, i_4_, i_5_, bool);
	}
    }
    
    Class89 method17710(Class103 class103, int i) {
	if (null != ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
	    && class103.method2301(((Class475_Sub1_Sub4_Sub1) this)
				       .aClass89_11312.method1866(),
				   i) == 0)
	    return ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312;
	Class399 class399 = method17711(class103, i, false, -722720128);
	if (class399 != null)
	    return (Class89) class399.anObject5795;
	return null;
    }
    
    void method14454(byte i) {
	((Class475_Sub1_Sub4_Sub1) this).aBool11304 = false;
	if (null != ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312)
	    ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312.method1928
		(((Class475_Sub1_Sub4_Sub1) this).aClass89_11312.method1866()
		 & ~0x10000);
    }
    
    public boolean method157(byte i) {
	return true;
    }
    
    public int method139(int i) {
	return Class527.aClass527_6917.anInt6931 * -2030829961;
    }
    
    public int method140(int i) {
	return ((Class475_Sub1_Sub4_Sub1) this).aByte11313;
    }
    
    public void method143(int i) {
	if (((Class475_Sub1_Sub4_Sub1) this).aClass89_11312 != null)
	    ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312.method1867();
    }
    
    public void method141(Class103 class103) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((null
	     == ((Class475_Sub1_Sub4_Sub1) this).aClass241_Sub39_Sub17_11306)
	    && ((Class475_Sub1_Sub4_Sub1) this).aBool11305) {
	    Class399 class399 = method17711(class103, 262144, true, 392731880);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (null != class399
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub4_Sub1) this).aClass241_Sub39_Sub17_11306;
	    ((Class475_Sub1_Sub4_Sub1) this).aClass241_Sub39_Sub17_11306
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (class241_sub39_sub17 != null)
	    aClass552_8744.method12205(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -1951934173);
    }
    
    public boolean method142(int i) {
	return ((Class475_Sub1_Sub4_Sub1) this).aBool11305;
    }
    
    public void method144(Class103 class103, int i) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((null
	     == ((Class475_Sub1_Sub4_Sub1) this).aClass241_Sub39_Sub17_11306)
	    && ((Class475_Sub1_Sub4_Sub1) this).aBool11305) {
	    Class399 class399
		= method17711(class103, 262144, true, 1549504047);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (null != class399
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub4_Sub1) this).aClass241_Sub39_Sub17_11306;
	    ((Class475_Sub1_Sub4_Sub1) this).aClass241_Sub39_Sub17_11306
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (class241_sub39_sub17 != null)
	    aClass552_8744.method12205(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -733037395);
    }
    
    public void method145(Class103 class103, byte i) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((((Class475_Sub1_Sub4_Sub1) this).aClass241_Sub39_Sub17_11306
	     == null)
	    && ((Class475_Sub1_Sub4_Sub1) this).aBool11305) {
	    Class399 class399
		= method17711(class103, 262144, true, 2036337529);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (null != class399
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub4_Sub1) this).aClass241_Sub39_Sub17_11306;
	    ((Class475_Sub1_Sub4_Sub1) this).aClass241_Sub39_Sub17_11306
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (null != class241_sub39_sub17)
	    aClass552_8744.method12150(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -1985671672);
    }
    
    public int method9() {
	return ((Class475_Sub1_Sub4_Sub1) this).anInt11308 * 1875003195;
    }
    
    void method14476(Class103 class103) {
	/* empty */
    }
    
    public int method10() {
	return Class527.aClass527_6917.anInt6931 * -2030829961;
    }
    
    public int method147() {
	return ((Class475_Sub1_Sub4_Sub1) this).aByte11313;
    }
    
    public void method148() {
	if (((Class475_Sub1_Sub4_Sub1) this).aClass89_11312 != null)
	    ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312.method1867();
    }
    
    public void method149() {
	if (((Class475_Sub1_Sub4_Sub1) this).aClass89_11312 != null)
	    ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312.method1867();
    }
    
    public boolean method150() {
	return ((Class475_Sub1_Sub4_Sub1) this).aBool11305;
    }
    
    Class542 method14472(Class103 class103) {
	if (null == ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312)
	    return null;
	Class266 class266 = method10893();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub4_Sub1) this).aBool11311,
				  -2142428033);
	Class272 class272
	    = (((Class475_Sub1_Sub4_Sub1) this).aClass532_11309.getObjectDefinition
	       (((Class475_Sub1_Sub4_Sub1) this).anInt11308 * 1875003195,
		577892407)
	       .aClass272_6905);
	if (null != class272) {
	    ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
		.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0], class272);
	} else
	    ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
		.method1890(class266, aClass97Array8748[0], 0);
	return class542;
    }
    
    public boolean method155() {
	return ((Class475_Sub1_Sub4_Sub1) this).aBool11305;
    }
    
    public boolean method154() {
	return true;
    }
    
    public Class535 method14470(Class103 class103) {
	Class287 class287 = method10874().aClass287_4386;
	if (((Class475_Sub1_Sub4_Sub1) this).aClass535_11307 == null)
	    ((Class475_Sub1_Sub4_Sub1) this).aClass535_11307
		= Class109.method2768((int) class287.aFloat4477,
				      (int) class287.aFloat4474,
				      (int) class287.aFloat4479,
				      method17709(class103, 0, -1578136275),
				      1218997547);
	return ((Class475_Sub1_Sub4_Sub1) this).aClass535_11307;
    }
    
    public boolean method138() {
	return true;
    }
    
    public boolean method152() {
	return true;
    }
    
    void method14493(Class103 class103, byte i) {
	/* empty */
    }
    
    public Class475_Sub1_Sub4_Sub1(Class552 class552, Class103 class103,
				   ObjectDefinitionLoader class532, ObjectDefinition class526, int i,
				   int i_8_, int i_9_, int i_10_, int i_11_,
				   boolean bool, int i_12_, boolean bool_13_) {
	super(class552, i_9_, i_10_, i_11_, i, i_8_,
	      1713647885 * class526.anInt6883);
	((Class475_Sub1_Sub4_Sub1) this).aClass532_11309 = class532;
	((Class475_Sub1_Sub4_Sub1) this).anInt11308
	    = 982669387 * class526.objectID;
	((Class475_Sub1_Sub4_Sub1) this).aBool11310 = bool;
	((Class475_Sub1_Sub4_Sub1) this).aByte11313 = (byte) i_12_;
	((Class475_Sub1_Sub4_Sub1) this).aBool11311
	    = class526.anInt6848 * -1389471035 != 0 && !bool;
	((Class475_Sub1_Sub4_Sub1) this).aBool11304 = bool_13_;
	((Class475_Sub1_Sub4_Sub1) this).aBool11305
	    = (class103.method2382() && class526.aBool6895
	       && !((Class475_Sub1_Sub4_Sub1) this).aBool11310
	       && Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .aClass445_Sub7_8865.method14150(93214465) != 0);
	int i_14_ = 2048;
	if (((Class475_Sub1_Sub4_Sub1) this).aBool11304)
	    i_14_ |= 0x10000;
	if (class526.bloom)
	    i_14_ |= 0x80000;
	Class399 class399
	    = method17711(class103, i_14_,
			  ((Class475_Sub1_Sub4_Sub1) this).aBool11305,
			  -1630205570);
	if (null != class399) {
	    ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
		= (Class89) class399.anObject5795;
	    ((Class475_Sub1_Sub4_Sub1) this).aClass241_Sub39_Sub17_11306
		= (Class241_Sub39_Sub17) class399.anObject5794;
	    if (((Class475_Sub1_Sub4_Sub1) this).aBool11304
		|| class526.bloom) {
		((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
		    = ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
			  .method2019((byte) 0, i_14_, false);
		if (class526.bloom) {
		    Class230 class230
			= client.aClass238_8477.method4787((byte) -6);
		    ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312.method1911
			(class230.anInt2681 * 2009560023,
			 class230.anInt2682 * -801178581,
			 1773755899 * class230.anInt2683,
			 class230.anInt2684 * -1710320751);
		}
	    }
	}
	method14465(1, 240379087);
    }
    
    boolean method14456() {
	return ((Class475_Sub1_Sub4_Sub1) this).aBool11304;
    }
    
    public void method159(Class103 class103) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((null
	     == ((Class475_Sub1_Sub4_Sub1) this).aClass241_Sub39_Sub17_11306)
	    && ((Class475_Sub1_Sub4_Sub1) this).aBool11305) {
	    Class399 class399
		= method17711(class103, 262144, true, -978176905);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (null != class399
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub4_Sub1) this).aClass241_Sub39_Sub17_11306;
	    ((Class475_Sub1_Sub4_Sub1) this).aClass241_Sub39_Sub17_11306
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (class241_sub39_sub17 != null)
	    aClass552_8744.method12205(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -902967860);
    }
    
    boolean method14466() {
	if (((Class475_Sub1_Sub4_Sub1) this).aClass89_11312 != null)
	    return !((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
			.method1914();
	return true;
    }
    
    Class399 method17711(Class103 class103, int i, boolean bool, int i_15_) {
	ObjectDefinition class526
	    = (((Class475_Sub1_Sub4_Sub1) this).aClass532_11309.getObjectDefinition
	       (1875003195 * ((Class475_Sub1_Sub4_Sub1) this).anInt11308,
		577892407));
	Class166 class166;
	Class166 class166_16_;
	if (((Class475_Sub1_Sub4_Sub1) this).aBool11310) {
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
		(class103, i, Class527.aClass527_6917.anInt6931 * -2030829961,
		 ((Class475_Sub1_Sub4_Sub1) this).aByte11313, class166,
		 class166_16_, (int) class287.aFloat4477,
		 (int) class287.aFloat4474, (int) class287.aFloat4479, bool,
		 null, -1219737013));
    }
    
    boolean method14451() {
	if (((Class475_Sub1_Sub4_Sub1) this).aClass89_11312 != null)
	    return ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
		       .method2052();
	return false;
    }
    
    public int method14492() {
	return (((Class475_Sub1_Sub4_Sub1) this).aClass89_11312 != null
		? ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312.method1902()
		: 0);
    }
    
    boolean method14467() {
	if (((Class475_Sub1_Sub4_Sub1) this).aClass89_11312 != null)
	    return ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
		       .method2052();
	return false;
    }
    
    public boolean method156() {
	return true;
    }
    
    Class542 method14473(Class103 class103) {
	if (null == ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312)
	    return null;
	Class266 class266 = method10893();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub4_Sub1) this).aBool11311,
				  -2063830021);
	Class272 class272
	    = (((Class475_Sub1_Sub4_Sub1) this).aClass532_11309.getObjectDefinition
	       (((Class475_Sub1_Sub4_Sub1) this).anInt11308 * 1875003195,
		577892407)
	       .aClass272_6905);
	if (null != class272) {
	    ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
		.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0], class272);
	} else
	    ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
		.method1890(class266, aClass97Array8748[0], 0);
	return class542;
    }
    
    Class542 method14474(Class103 class103) {
	if (null == ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312)
	    return null;
	Class266 class266 = method10893();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub4_Sub1) this).aBool11311,
				  -2117977798);
	Class272 class272
	    = (((Class475_Sub1_Sub4_Sub1) this).aClass532_11309.getObjectDefinition
	       (((Class475_Sub1_Sub4_Sub1) this).anInt11308 * 1875003195,
		577892407)
	       .aClass272_6905);
	if (null != class272) {
	    ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
		.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0], class272);
	} else
	    ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
		.method1890(class266, aClass97Array8748[0], 0);
	return class542;
    }
    
    Class542 method14475(Class103 class103) {
	if (null == ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312)
	    return null;
	Class266 class266 = method10893();
	Class542 class542
	    = Class128.method3016(((Class475_Sub1_Sub4_Sub1) this).aBool11311,
				  -2096859440);
	Class272 class272
	    = (((Class475_Sub1_Sub4_Sub1) this).aClass532_11309.getObjectDefinition
	       (((Class475_Sub1_Sub4_Sub1) this).anInt11308 * 1875003195,
		577892407)
	       .aClass272_6905);
	if (null != class272) {
	    ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
		.method1890(class266, null, 0);
	    class103.method2282(class266, aClass97Array8748[0], class272);
	} else
	    ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
		.method1890(class266, aClass97Array8748[0], 0);
	return class542;
    }
    
    boolean method14477() {
	return ((Class475_Sub1_Sub4_Sub1) this).aBool11304;
    }
    
    public boolean method151() {
	return ((Class475_Sub1_Sub4_Sub1) this).aBool11305;
    }
    
    public void method158(Class103 class103) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((null
	     == ((Class475_Sub1_Sub4_Sub1) this).aClass241_Sub39_Sub17_11306)
	    && ((Class475_Sub1_Sub4_Sub1) this).aBool11305) {
	    Class399 class399 = method17711(class103, 262144, true, 107716621);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (null != class399
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub4_Sub1) this).aClass241_Sub39_Sub17_11306;
	    ((Class475_Sub1_Sub4_Sub1) this).aClass241_Sub39_Sub17_11306
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (class241_sub39_sub17 != null)
	    aClass552_8744.method12205(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -1676566116);
    }
    
    boolean method14479() {
	return ((Class475_Sub1_Sub4_Sub1) this).aBool11304;
    }
    
    void method14480(Class103 class103, Class475_Sub1 class475_sub1, int i,
		     int i_17_, int i_18_, boolean bool) {
	if (class475_sub1 instanceof Class475_Sub1_Sub4_Sub1) {
	    Class475_Sub1_Sub4_Sub1 class475_sub1_sub4_sub1_19_
		= (Class475_Sub1_Sub4_Sub1) class475_sub1;
	    if (null != ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
		&& null != ((Class475_Sub1_Sub4_Sub1)
			    class475_sub1_sub4_sub1_19_).aClass89_11312)
		((Class475_Sub1_Sub4_Sub1) this).aClass89_11312.method1920
		    ((((Class475_Sub1_Sub4_Sub1) class475_sub1_sub4_sub1_19_)
		      .aClass89_11312),
		     i, i_17_, i_18_, bool);
	}
    }
    
    void method14481(Class103 class103, Class475_Sub1 class475_sub1, int i,
		     int i_20_, int i_21_, boolean bool) {
	if (class475_sub1 instanceof Class475_Sub1_Sub4_Sub1) {
	    Class475_Sub1_Sub4_Sub1 class475_sub1_sub4_sub1_22_
		= (Class475_Sub1_Sub4_Sub1) class475_sub1;
	    if (null != ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
		&& null != ((Class475_Sub1_Sub4_Sub1)
			    class475_sub1_sub4_sub1_22_).aClass89_11312)
		((Class475_Sub1_Sub4_Sub1) this).aClass89_11312.method1920
		    ((((Class475_Sub1_Sub4_Sub1) class475_sub1_sub4_sub1_22_)
		      .aClass89_11312),
		     i, i_20_, i_21_, bool);
	}
    }
    
    void method14482(Class103 class103, Class475_Sub1 class475_sub1, int i,
		     int i_23_, int i_24_, boolean bool) {
	if (class475_sub1 instanceof Class475_Sub1_Sub4_Sub1) {
	    Class475_Sub1_Sub4_Sub1 class475_sub1_sub4_sub1_25_
		= (Class475_Sub1_Sub4_Sub1) class475_sub1;
	    if (null != ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
		&& null != ((Class475_Sub1_Sub4_Sub1)
			    class475_sub1_sub4_sub1_25_).aClass89_11312)
		((Class475_Sub1_Sub4_Sub1) this).aClass89_11312.method1920
		    ((((Class475_Sub1_Sub4_Sub1) class475_sub1_sub4_sub1_25_)
		      .aClass89_11312),
		     i, i_23_, i_24_, bool);
	}
    }
    
    void method14483() {
	((Class475_Sub1_Sub4_Sub1) this).aBool11304 = false;
	if (null != ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312)
	    ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312.method1928
		(((Class475_Sub1_Sub4_Sub1) this).aClass89_11312.method1866()
		 & ~0x10000);
    }
    
    void method14478() {
	((Class475_Sub1_Sub4_Sub1) this).aBool11304 = false;
	if (null != ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312)
	    ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312.method1928
		(((Class475_Sub1_Sub4_Sub1) this).aClass89_11312.method1866()
		 & ~0x10000);
    }
    
    public void method160(Class103 class103) {
	Object object = null;
	Class241_Sub39_Sub17 class241_sub39_sub17;
	if ((((Class475_Sub1_Sub4_Sub1) this).aClass241_Sub39_Sub17_11306
	     == null)
	    && ((Class475_Sub1_Sub4_Sub1) this).aBool11305) {
	    Class399 class399 = method17711(class103, 262144, true, 117798919);
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) (null != class399
					  ? class399.anObject5794 : null);
	} else {
	    class241_sub39_sub17
		= ((Class475_Sub1_Sub4_Sub1) this).aClass241_Sub39_Sub17_11306;
	    ((Class475_Sub1_Sub4_Sub1) this).aClass241_Sub39_Sub17_11306
		= null;
	}
	Class287 class287 = method10874().aClass287_4386;
	if (null != class241_sub39_sub17)
	    aClass552_8744.method12150(class241_sub39_sub17, aByte8745,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4479, null,
				       -2082799944);
    }
    
    boolean method14450(int i) {
	return ((Class475_Sub1_Sub4_Sub1) this).aBool11304;
    }
    
    public int method14468(byte i) {
	return (((Class475_Sub1_Sub4_Sub1) this).aClass89_11312 != null
		? ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312.method1902()
		: 0);
    }
    
    Class89 method17712(Class103 class103, int i) {
	if (null != ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312
	    && class103.method2301(((Class475_Sub1_Sub4_Sub1) this)
				       .aClass89_11312.method1866(),
				   i) == 0)
	    return ((Class475_Sub1_Sub4_Sub1) this).aClass89_11312;
	Class399 class399 = method17711(class103, i, false, -624778273);
	if (class399 != null)
	    return (Class89) class399.anObject5795;
	return null;
    }
    
    Class399 method17713(Class103 class103, int i, boolean bool) {
	ObjectDefinition class526
	    = (((Class475_Sub1_Sub4_Sub1) this).aClass532_11309.getObjectDefinition
	       (1875003195 * ((Class475_Sub1_Sub4_Sub1) this).anInt11308,
		577892407));
	Class166 class166;
	Class166 class166_26_;
	if (((Class475_Sub1_Sub4_Sub1) this).aBool11310) {
	    class166 = aClass552_8744.aClass166Array7140[aByte8745];
	    class166_26_ = aClass552_8744.aClass166Array7179[0];
	} else {
	    class166 = aClass552_8744.aClass166Array7179[aByte8745];
	    if (aByte8745 < 3)
		class166_26_
		    = aClass552_8744.aClass166Array7179[1 + aByte8745];
	    else
		class166_26_ = null;
	}
	Class287 class287 = method10874().aClass287_4386;
	return (class526.method11765
		(class103, i, Class527.aClass527_6917.anInt6931 * -2030829961,
		 ((Class475_Sub1_Sub4_Sub1) this).aByte11313, class166,
		 class166_26_, (int) class287.aFloat4477,
		 (int) class287.aFloat4474, (int) class287.aFloat4479, bool,
		 null, -1219737013));
    }
    
    boolean method14488(Class103 class103, int i, int i_27_) {
	Class272 class272
	    = (((Class475_Sub1_Sub4_Sub1) this).aClass532_11309.getObjectDefinition
	       (1875003195 * ((Class475_Sub1_Sub4_Sub1) this).anInt11308,
		577892407)
	       .aClass272_6905);
	if (null != class272)
	    return class103.method2280(i, i_27_, method10893(), class272,
				       (byte) 8);
	Class89 class89 = method17709(class103, 131072, -900423707);
	if (class89 != null) {
	    Class266 class266 = method10893();
	    return class89.method1891(i, i_27_, class266, false, 0);
	}
	return false;
    }
    
    Class399 method17714(Class103 class103, int i, boolean bool) {
	ObjectDefinition class526
	    = (((Class475_Sub1_Sub4_Sub1) this).aClass532_11309.getObjectDefinition
	       (1875003195 * ((Class475_Sub1_Sub4_Sub1) this).anInt11308,
		577892407));
	Class166 class166;
	Class166 class166_28_;
	if (((Class475_Sub1_Sub4_Sub1) this).aBool11310) {
	    class166 = aClass552_8744.aClass166Array7140[aByte8745];
	    class166_28_ = aClass552_8744.aClass166Array7179[0];
	} else {
	    class166 = aClass552_8744.aClass166Array7179[aByte8745];
	    if (aByte8745 < 3)
		class166_28_
		    = aClass552_8744.aClass166Array7179[1 + aByte8745];
	    else
		class166_28_ = null;
	}
	Class287 class287 = method10874().aClass287_4386;
	return (class526.method11765
		(class103, i, Class527.aClass527_6917.anInt6931 * -2030829961,
		 ((Class475_Sub1_Sub4_Sub1) this).aByte11313, class166,
		 class166_28_, (int) class287.aFloat4477,
		 (int) class287.aFloat4474, (int) class287.aFloat4479, bool,
		 null, -1219737013));
    }
    
    static final void method17715(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	CsDeltaNode.method14872(class58, class35, class454, 53376822);
    }
    
    static final void method17716(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class106.aClass580_1503.method12718(1792810205);
    }
    
    static final void method17717(ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = Class240.stripCode(string, 417256845);
    }
}
