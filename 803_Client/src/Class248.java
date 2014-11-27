/* Class248 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class248
{
    int anInt3973;
    int anInt3974;
    Class475_Sub1 aClass475_Sub1_3975;
    byte aByte3976;
    boolean[] aBoolArray3977;
    Class409 aClass409_3978;
    boolean aBool3979 = false;
    Class89 aClass89_3980;
    boolean aBool3981;
    ObjectDefinitionLoader aClass532_3982;
    int anInt3983;
    int anInt3984 = 523772447;
    int anInt3985 = 0;
    boolean aBool3986 = false;
    int anInt3987;
    Class241_Sub39_Sub17 aClass241_Sub39_Sub17_3988;
    boolean aBool3989 = false;
    Class409 aClass409_3990;
    Class489 aClass489_3991;
    Class536 aClass536_3992;
    
    boolean method4953() {
	return ((Class248) this).aBool3981;
    }
    
    void method4954(Class103 class103, Class89 class89, Class266 class266,
		    int i, int i_0_, int i_1_, int i_2_, boolean bool) {
	Class106[] class106s = class89.method2051();
	Class167[] class167s = class89.method1917();
	if ((((Class248) this).aClass489_3991 == null
	     || ((Class248) this).aClass489_3991.aBool6487)
	    && (null != class106s || null != class167s)) {
	    ObjectDefinition class526
		= (((Class248) this).aClass532_3982.getObjectDefinition
		   (-756151697 * ((Class248) this).anInt3973, 577892407));
	    if (null != class526.toObjectIDs)
		class526 = (class526.method11768
			    (Class1.aClass19_11,
			     (4 == -831877317 * client.anInt8266
			      ? (Interface11) Class104.anInterface11_1485
			      : Class1.aClass19_11),
			     -1846006566));
	    if (class526 != null)
		((Class248) this).aClass489_3991
		    = Class489.method11182(client.anInt8296, true);
	}
	if (null != ((Class248) this).aClass489_3991) {
	    class89.method1915(class266);
	    if (bool)
		((Class248) this).aClass489_3991.method11158
		    (class103, (long) client.anInt8296, class106s, class167s,
		     false);
	    else
		((Class248) this).aClass489_3991
		    .method11157((long) client.anInt8296);
	    ((Class248) this).aClass489_3991
		.method11162(((Class248) this).aByte3976, i, i_0_, i_1_, i_2_);
	}
    }
    
    int method4955(int i) {
	return ((Class248) this).anInt3985 * -945241921;
    }
    
    void method4956(Class536 class536, int i) {
	((Class248) this).aClass536_3992 = class536;
	((Class248) this).aClass89_3980 = null;
    }
    
    int method4957(short i) {
	return -method4955(605709380);
    }
    
    ObjectDefinition method4958(int i) {
	return (((Class248) this).aClass532_3982.getObjectDefinition
		(-756151697 * ((Class248) this).anInt3973, 577892407));
    }
    
    final Class89 method4959(Class103 class103, int i, boolean bool,
			     boolean bool_3_) {
	ObjectDefinition class526
	    = ((Class248) this).aClass532_3982.getObjectDefinition(((((Class248) this)
							     .anInt3973)
							    * -756151697),
							   577892407);
	if (class526.toObjectIDs != null)
	    class526
		= class526.method11768(Class1.aClass19_11,
				       (client.anInt8266 * -831877317 == 4
					? (Interface11) (Class104
							 .anInterface11_1485)
					: Class1.aClass19_11),
				       -412849372);
	if (class526 == null) {
	    method4963(class103, 487253369);
	    ((Class248) this).anInt3984 = 523772447;
	    return null;
	}
	if (!((Class248) this).aBool3986
	    && (class526.objectID * -2079513015
		!= 854402593 * ((Class248) this).anInt3984)) {
	    method4965(true, -1, 0, 0, -1974234105);
	    ((Class248) this).aBool3989 = false;
	    ((Class248) this).aClass89_3980 = null;
	}
	method4964(((Class248) this).aClass475_Sub1_3975, (byte) -42);
	if (bool_3_)
	    bool_3_ = bool_3_ & (((Class248) this).aBool3981
				 & !((Class248) this).aBool3989
				 & Class241_Sub5_Sub9.aClass241_Sub9_11043
				       .aClass445_Sub7_8865
				       .method14150(176412978) != 0);
	if (bool && !bool_3_) {
	    ((Class248) this).anInt3984 = 207268649 * class526.objectID;
	    return null;
	}
	Class287 class287 = (((Class248) this).aClass475_Sub1_3975.method10874
			     ().aClass287_4386);
	Class552 class552 = client.aClass238_8477.method4751(-1329126521);
	if (bool_3_) {
	    class552.method12150(((Class248) this).aClass241_Sub39_Sub17_3988,
				 ((Class248) this).aByte3976,
				 (int) class287.aFloat4477,
				 (int) class287.aFloat4479,
				 ((Class248) this).aBoolArray3977,
				 -1876450534);
	    ((Class248) this).aBool3989 = false;
	}
	Class166 class166
	    = class552.aClass166Array7184[((Class248) this).aByte3976];
	Class166 class166_4_;
	if (((Class248) this).aBool3979)
	    class166_4_ = class552.aClass166Array7179[0];
	else
	    class166_4_ = (((Class248) this).aByte3976 < 3
			   ? (class552.aClass166Array7184
			      [1 + ((Class248) this).aByte3976])
			   : null);
	Class89 class89 = null;
	if (((Class248) this).aClass409_3978.method7364(-1126231044)) {
	    if (bool_3_)
		i |= 0x40000;
	    class89 = (class526.method11788
		       (class103, i,
			(11 != ((Class248) this).anInt3983 * 1815958437
			 ? ((Class248) this).anInt3983 * 1815958437 : 10),
			(11 == 1815958437 * ((Class248) this).anInt3983
			 ? 4 + ((Class248) this).anInt3987 * 592978681
			 : 592978681 * ((Class248) this).anInt3987),
			class166, class166_4_, (int) class287.aFloat4477,
			class166.method3574((int) class287.aFloat4477,
					    (int) class287.aFloat4479,
					    -1056522832),
			(int) class287.aFloat4479,
			((Class248) this).aClass409_3978,
			((Class248) this).aClass536_3992, -2031006886));
	    if (class89 != null) {
		if (bool_3_) {
		    if (null == ((Class248) this).aBoolArray3977)
			((Class248) this).aBoolArray3977 = new boolean[4];
		    ((Class248) this).aClass241_Sub39_Sub17_3988
			= class89.method1892(((Class248) this)
					     .aClass241_Sub39_Sub17_3988);
		    class552.method12205((((Class248) this)
					  .aClass241_Sub39_Sub17_3988),
					 ((Class248) this).aByte3976,
					 (int) class287.aFloat4477,
					 (int) class287.aFloat4479,
					 ((Class248) this).aBoolArray3977,
					 -1789900790);
		    ((Class248) this).aBool3989 = true;
		}
		((Class248) this).anInt3985
		    = class89.method1902() * 1439346495;
		class89.method1894();
	    } else {
		((Class248) this).aBoolArray3977 = null;
		((Class248) this).aClass241_Sub39_Sub17_3988 = null;
		((Class248) this).anInt3985 = 0;
	    }
	    ((Class248) this).aClass89_3980 = null;
	} else if (((Class248) this).aClass89_3980 == null
		   || (((Class248) this).aClass89_3980.method1866() & i) != i
		   || (class526.objectID * -2079513015
		       != ((Class248) this).anInt3984 * 854402593)) {
	    if (((Class248) this).aClass89_3980 != null)
		i |= ((Class248) this).aClass89_3980.method1866();
	    Class399 class399
		= (class526.method11765
		   (class103, i,
		    (((Class248) this).anInt3983 * 1815958437 != 11
		     ? 1815958437 * ((Class248) this).anInt3983 : 10),
		    (11 == ((Class248) this).anInt3983 * 1815958437
		     ? 4 + ((Class248) this).anInt3987 * 592978681
		     : 592978681 * ((Class248) this).anInt3987),
		    class166, class166_4_, (int) class287.aFloat4477,
		    class166.method3574((int) class287.aFloat4477,
					(int) class287.aFloat4479, 828887874),
		    (int) class287.aFloat4479, bool_3_,
		    ((Class248) this).aClass536_3992, -1219737013));
	    if (null != class399) {
		((Class248) this).aClass89_3980 = class89
		    = (Class89) class399.anObject5795;
		if (bool_3_) {
		    ((Class248) this).aClass241_Sub39_Sub17_3988
			= (Class241_Sub39_Sub17) class399.anObject5794;
		    ((Class248) this).aBoolArray3977 = null;
		    class552.method12205((((Class248) this)
					  .aClass241_Sub39_Sub17_3988),
					 ((Class248) this).aByte3976,
					 (int) class287.aFloat4477,
					 (int) class287.aFloat4479, null,
					 -1583056052);
		    ((Class248) this).aBool3989 = true;
		}
		((Class248) this).anInt3985
		    = class89.method1902() * 1439346495;
		class89.method1894();
	    } else {
		((Class248) this).aBoolArray3977 = null;
		((Class248) this).aClass241_Sub39_Sub17_3988 = null;
		((Class248) this).aClass89_3980 = null;
		((Class248) this).anInt3985 = 0;
	    }
	} else
	    class89 = ((Class248) this).aClass89_3980;
	((Class248) this).anInt3984 = 207268649 * class526.objectID;
	return class89;
    }
    
    void method4960(Class103 class103, Class89 class89, Class266 class266,
		    int i, int i_5_, int i_6_, int i_7_, boolean bool,
		    byte i_8_) {
	Class106[] class106s = class89.method2051();
	Class167[] class167s = class89.method1917();
	if ((((Class248) this).aClass489_3991 == null
	     || ((Class248) this).aClass489_3991.aBool6487)
	    && (null != class106s || null != class167s)) {
	    ObjectDefinition class526
		= (((Class248) this).aClass532_3982.getObjectDefinition
		   (-756151697 * ((Class248) this).anInt3973, 577892407));
	    if (null != class526.toObjectIDs)
		class526 = (class526.method11768
			    (Class1.aClass19_11,
			     (4 == -831877317 * client.anInt8266
			      ? (Interface11) Class104.anInterface11_1485
			      : Class1.aClass19_11),
			     -409076304));
	    if (class526 != null)
		((Class248) this).aClass489_3991
		    = Class489.method11182(client.anInt8296, true);
	}
	if (null != ((Class248) this).aClass489_3991) {
	    class89.method1915(class266);
	    if (bool)
		((Class248) this).aClass489_3991.method11158
		    (class103, (long) client.anInt8296, class106s, class167s,
		     false);
	    else
		((Class248) this).aClass489_3991
		    .method11157((long) client.anInt8296);
	    ((Class248) this).aClass489_3991
		.method11162(((Class248) this).aByte3976, i, i_5_, i_6_, i_7_);
	}
    }
    
    boolean method4961(byte i) {
	return ((Class248) this).aBool3981;
    }
    
    void method4962(Class103 class103, byte i) {
	method4975(class103, 262144, true, true, 1766152131);
    }
    
    void method4963(Class103 class103, int i) {
	if (null != ((Class248) this).aClass241_Sub39_Sub17_3988) {
	    Class287 class287
		= (((Class248) this).aClass475_Sub1_3975.method10874()
		   .aClass287_4386);
	    client.aClass238_8477.method4751(-1448894220).method12150
		(((Class248) this).aClass241_Sub39_Sub17_3988,
		 ((Class248) this).aByte3976, (int) class287.aFloat4477,
		 (int) class287.aFloat4479, ((Class248) this).aBoolArray3977,
		 -1941141374);
	    ((Class248) this).aBoolArray3977 = null;
	    ((Class248) this).aClass241_Sub39_Sub17_3988 = null;
	}
    }
    
    void method4964(Class475_Sub1 class475_sub1, byte i) {
	if (((Class248) this).aClass409_3990 != null
	    && ((Class248) this).aClass409_3990.method7364(-463074397)) {
	    ((Class248) this).aClass409_3990.method7411
		(client.anInt8296 - 934776393 * ((Class248) this).anInt3974,
		 (byte) 1);
	    if (!((Class248) this).aClass409_3990.method7349(-572804904)) {
		((Class248) this).aClass409_3978
		    = ((Class248) this).aClass409_3990;
		((Class248) this).aBool3986 = true;
		((Class248) this).anInt3974 = client.anInt8296 * 678282233;
		return;
	    }
	}
	if (((Class248) this).aClass409_3978.method7364(-244412571)) {
	    if (((Class248) this).aClass409_3978.method7411
		(client.anInt8296 - 934776393 * ((Class248) this).anInt3974,
		 (byte) 1)) {
		if (Class241_Sub5_Sub9.aClass241_Sub9_11043
			.aClass445_Sub7_8865.method14150(1821107469)
		    == 2)
		    ((Class248) this).aBool3989 = false;
		if (((Class248) this).aClass409_3978.method7419((byte) 35)) {
		    ((Class248) this).aClass409_3978.method7347(-1,
								-1722498345);
		    ((Class248) this).aBool3986 = false;
		    method4965(false, -1, 0, 0, 1789646226);
		}
	    }
	} else
	    method4965(false, -1, 0, 0, 329479354);
	((Class248) this).anInt3974 = 678282233 * client.anInt8296;
    }
    
    void method4965(boolean bool, int i, int i_9_, int i_10_, int i_11_) {
	int i_12_ = i;
	boolean bool_13_ = false;
	if (-1 == i_12_) {
	    ObjectDefinition class526
		= (((Class248) this).aClass532_3982.getObjectDefinition
		   (-756151697 * ((Class248) this).anInt3973, 577892407));
	    ObjectDefinition class526_14_ = class526;
	    if (null != class526.toObjectIDs)
		class526 = (class526.method11768
			    (Class1.aClass19_11,
			     (client.anInt8266 * -831877317 == 4
			      ? (Interface11) Class104.anInterface11_1485
			      : Class1.aClass19_11),
			     -719316164));
	    if (null == class526)
		return;
	    if (class526 == class526_14_)
		class526_14_ = null;
	    if (class526.method11772(2123962750)) {
		if (!class526.aBool6875
		    || Class241_Sub5_Sub9.aClass241_Sub9_11043
			   .aClass445_Sub4_8850.method14107(-941318582) == 1) {
		    if (bool
			&& ((Class248) this).aClass409_3978
			       .method7364(1642617194)
			&& class526.method11792(((Class248) this)
						    .aClass409_3978
						    .method7346(-996379907),
						-1189046478))
			return;
		    if (class526.objectID * -2079513015
			!= ((Class248) this).anInt3984 * 854402593)
			bool_13_ = class526.aBool6840;
		    i_12_ = class526.method11759((byte) 118);
		    if (class526.method11776(98626595))
			i_9_ = 0;
		    else
			i_9_ = 1;
		}
	    } else if (class526_14_ != null
		       && class526_14_.method11772(2136480673)
		       && (!class526_14_.aBool6875
			   || (Class241_Sub5_Sub9.aClass241_Sub9_11043
				   .aClass445_Sub4_8850.method14107(-941318582)
			       == 1))) {
		if (bool
		    && ((Class248) this).aClass409_3978.method7364(756835789)
		    && class526_14_.method11792(((Class248) this)
						    .aClass409_3978
						    .method7346(-943476494),
						-820958730))
		    return;
		if (854402593 * ((Class248) this).anInt3984
		    != class526.objectID * -2079513015)
		    bool_13_ = class526_14_.aBool6840;
		i_12_ = class526_14_.method11759((byte) 29);
		if (class526_14_.method11776(-1520429563))
		    i_9_ = 0;
		else
		    i_9_ = 1;
	    }
	}
	if (i_12_ == -1)
	    ((Class248) this).aClass409_3978.method7416(-1, false, (byte) 62);
	else {
	    ((Class248) this).aClass409_3978.method7351(i_12_, i_10_, i_9_,
							bool_13_, -1302211377);
	    ((Class248) this).anInt3974 = 678282233 * client.anInt8296;
	    ((Class248) this).aBool3989 = false;
	    ((Class248) this).aClass89_3980 = null;
	}
    }
    
    void method4966(Class475_Sub1 class475_sub1) {
	if (((Class248) this).aClass409_3990 != null
	    && ((Class248) this).aClass409_3990.method7364(1289187678)) {
	    ((Class248) this).aClass409_3990.method7411
		(client.anInt8296 - 934776393 * ((Class248) this).anInt3974,
		 (byte) 1);
	    if (!((Class248) this).aClass409_3990.method7349(-37933331)) {
		((Class248) this).aClass409_3978
		    = ((Class248) this).aClass409_3990;
		((Class248) this).aBool3986 = true;
		((Class248) this).anInt3974 = client.anInt8296 * 678282233;
		return;
	    }
	}
	if (((Class248) this).aClass409_3978.method7364(1489198750)) {
	    if (((Class248) this).aClass409_3978.method7411
		(client.anInt8296 - 934776393 * ((Class248) this).anInt3974,
		 (byte) 1)) {
		if (Class241_Sub5_Sub9.aClass241_Sub9_11043
			.aClass445_Sub7_8865.method14150(1508542352)
		    == 2)
		    ((Class248) this).aBool3989 = false;
		if (((Class248) this).aClass409_3978.method7419((byte) 59)) {
		    ((Class248) this).aClass409_3978.method7347(-1,
								-1604649449);
		    ((Class248) this).aBool3986 = false;
		    method4965(false, -1, 0, 0, 753516130);
		}
	    }
	} else
	    method4965(false, -1, 0, 0, 1261934219);
	((Class248) this).anInt3974 = 678282233 * client.anInt8296;
    }
    
    Class248(Class103 class103, ObjectDefinitionLoader class532, ObjectDefinition class526, int i,
	     int i_15_, int i_16_, Class475_Sub1 class475_sub1, boolean bool,
	     int i_17_, int i_18_) {
	((Class248) this).aClass532_3982 = class532;
	((Class248) this).anInt3973 = -2038786361 * class526.objectID;
	((Class248) this).anInt3983 = i * -969581523;
	((Class248) this).anInt3987 = 1665728329 * i_15_;
	((Class248) this).aClass475_Sub1_3975 = class475_sub1;
	((Class248) this).aBool3986 = -1 != i_17_;
	((Class248) this).aByte3976 = (byte) i_16_;
	((Class248) this).aBool3979 = bool;
	((Class248) this).aBool3981
	    = (class103.method2382() && class526.aBool6895
	       && !((Class248) this).aBool3979);
	((Class248) this).aClass409_3978
	    = new Class409_Sub3(class475_sub1, false);
	method4965(false, i_17_, 1, ((Class248) this).aBool3986 ? i_18_ : 0,
		   -383652365);
    }
    
    int method4967() {
	return -method4955(1884385374);
    }
    
    int method4968() {
	return -method4955(1023260703);
    }
    
    public void method4969(int i, int i_19_, int i_20_) {
	((Class248) this).aClass409_3990 = null;
	if (i_19_ > 0) {
	    ((Class248) this).aClass409_3990
		= new Class409_Sub3(((Class248) this).aClass475_Sub1_3975,
				    false);
	    ((Class248) this).aClass409_3990.method7351(i, i_19_, 1, false,
							-1302211377);
	} else {
	    ((Class248) this).aBool3986 = true;
	    method4965(false, i, 1, 0, -295653866);
	}
    }
    
    int method4970() {
	return -method4955(1402310919);
    }
    
    boolean method4971() {
	return ((Class248) this).aBool3981;
    }
    
    public void method4972(int i, int i_21_) {
	((Class248) this).aClass409_3990 = null;
	if (i_21_ > 0) {
	    ((Class248) this).aClass409_3990
		= new Class409_Sub3(((Class248) this).aClass475_Sub1_3975,
				    false);
	    ((Class248) this).aClass409_3990.method7351(i, i_21_, 1, false,
							-1302211377);
	} else {
	    ((Class248) this).aBool3986 = true;
	    method4965(false, i, 1, 0, 26514586);
	}
    }
    
    final Class89 method4973(Class103 class103, int i, boolean bool,
			     boolean bool_22_) {
	ObjectDefinition class526
	    = ((Class248) this).aClass532_3982.getObjectDefinition(((((Class248) this)
							     .anInt3973)
							    * -756151697),
							   577892407);
	if (class526.toObjectIDs != null)
	    class526
		= class526.method11768(Class1.aClass19_11,
				       (client.anInt8266 * -831877317 == 4
					? (Interface11) (Class104
							 .anInterface11_1485)
					: Class1.aClass19_11),
				       -1409970040);
	if (class526 == null) {
	    method4963(class103, -1991399831);
	    ((Class248) this).anInt3984 = 523772447;
	    return null;
	}
	if (!((Class248) this).aBool3986
	    && (class526.objectID * -2079513015
		!= 854402593 * ((Class248) this).anInt3984)) {
	    method4965(true, -1, 0, 0, -1518743885);
	    ((Class248) this).aBool3989 = false;
	    ((Class248) this).aClass89_3980 = null;
	}
	method4964(((Class248) this).aClass475_Sub1_3975, (byte) 100);
	if (bool_22_)
	    bool_22_ = bool_22_ & (((Class248) this).aBool3981
				   & !((Class248) this).aBool3989
				   & Class241_Sub5_Sub9
					 .aClass241_Sub9_11043
					 .aClass445_Sub7_8865
					 .method14150(1367495738) != 0);
	if (bool && !bool_22_) {
	    ((Class248) this).anInt3984 = 207268649 * class526.objectID;
	    return null;
	}
	Class287 class287 = (((Class248) this).aClass475_Sub1_3975.method10874
			     ().aClass287_4386);
	Class552 class552 = client.aClass238_8477.method4751(-1111662244);
	if (bool_22_) {
	    class552.method12150(((Class248) this).aClass241_Sub39_Sub17_3988,
				 ((Class248) this).aByte3976,
				 (int) class287.aFloat4477,
				 (int) class287.aFloat4479,
				 ((Class248) this).aBoolArray3977,
				 -1930203501);
	    ((Class248) this).aBool3989 = false;
	}
	Class166 class166
	    = class552.aClass166Array7184[((Class248) this).aByte3976];
	Class166 class166_23_;
	if (((Class248) this).aBool3979)
	    class166_23_ = class552.aClass166Array7179[0];
	else
	    class166_23_ = (((Class248) this).aByte3976 < 3
			    ? (class552.aClass166Array7184
			       [1 + ((Class248) this).aByte3976])
			    : null);
	Class89 class89 = null;
	if (((Class248) this).aClass409_3978.method7364(1406872255)) {
	    if (bool_22_)
		i |= 0x40000;
	    class89 = (class526.method11788
		       (class103, i,
			(11 != ((Class248) this).anInt3983 * 1815958437
			 ? ((Class248) this).anInt3983 * 1815958437 : 10),
			(11 == 1815958437 * ((Class248) this).anInt3983
			 ? 4 + ((Class248) this).anInt3987 * 592978681
			 : 592978681 * ((Class248) this).anInt3987),
			class166, class166_23_, (int) class287.aFloat4477,
			class166.method3574((int) class287.aFloat4477,
					    (int) class287.aFloat4479,
					    -1890588820),
			(int) class287.aFloat4479,
			((Class248) this).aClass409_3978,
			((Class248) this).aClass536_3992, -55000067));
	    if (class89 != null) {
		if (bool_22_) {
		    if (null == ((Class248) this).aBoolArray3977)
			((Class248) this).aBoolArray3977 = new boolean[4];
		    ((Class248) this).aClass241_Sub39_Sub17_3988
			= class89.method1892(((Class248) this)
					     .aClass241_Sub39_Sub17_3988);
		    class552.method12205((((Class248) this)
					  .aClass241_Sub39_Sub17_3988),
					 ((Class248) this).aByte3976,
					 (int) class287.aFloat4477,
					 (int) class287.aFloat4479,
					 ((Class248) this).aBoolArray3977,
					 -1574184088);
		    ((Class248) this).aBool3989 = true;
		}
		((Class248) this).anInt3985
		    = class89.method1902() * 1439346495;
		class89.method1894();
	    } else {
		((Class248) this).aBoolArray3977 = null;
		((Class248) this).aClass241_Sub39_Sub17_3988 = null;
		((Class248) this).anInt3985 = 0;
	    }
	    ((Class248) this).aClass89_3980 = null;
	} else if (((Class248) this).aClass89_3980 == null
		   || (((Class248) this).aClass89_3980.method1866() & i) != i
		   || (class526.objectID * -2079513015
		       != ((Class248) this).anInt3984 * 854402593)) {
	    if (((Class248) this).aClass89_3980 != null)
		i |= ((Class248) this).aClass89_3980.method1866();
	    Class399 class399
		= (class526.method11765
		   (class103, i,
		    (((Class248) this).anInt3983 * 1815958437 != 11
		     ? 1815958437 * ((Class248) this).anInt3983 : 10),
		    (11 == ((Class248) this).anInt3983 * 1815958437
		     ? 4 + ((Class248) this).anInt3987 * 592978681
		     : 592978681 * ((Class248) this).anInt3987),
		    class166, class166_23_, (int) class287.aFloat4477,
		    class166.method3574((int) class287.aFloat4477,
					(int) class287.aFloat4479,
					-1042159456),
		    (int) class287.aFloat4479, bool_22_,
		    ((Class248) this).aClass536_3992, -1219737013));
	    if (null != class399) {
		((Class248) this).aClass89_3980 = class89
		    = (Class89) class399.anObject5795;
		if (bool_22_) {
		    ((Class248) this).aClass241_Sub39_Sub17_3988
			= (Class241_Sub39_Sub17) class399.anObject5794;
		    ((Class248) this).aBoolArray3977 = null;
		    class552.method12205((((Class248) this)
					  .aClass241_Sub39_Sub17_3988),
					 ((Class248) this).aByte3976,
					 (int) class287.aFloat4477,
					 (int) class287.aFloat4479, null,
					 -1576121505);
		    ((Class248) this).aBool3989 = true;
		}
		((Class248) this).anInt3985
		    = class89.method1902() * 1439346495;
		class89.method1894();
	    } else {
		((Class248) this).aBoolArray3977 = null;
		((Class248) this).aClass241_Sub39_Sub17_3988 = null;
		((Class248) this).aClass89_3980 = null;
		((Class248) this).anInt3985 = 0;
	    }
	} else
	    class89 = ((Class248) this).aClass89_3980;
	((Class248) this).anInt3984 = 207268649 * class526.objectID;
	return class89;
    }
    
    final Class89 method4974(Class103 class103, int i, boolean bool,
			     boolean bool_24_) {
	ObjectDefinition class526
	    = ((Class248) this).aClass532_3982.getObjectDefinition(((((Class248) this)
							     .anInt3973)
							    * -756151697),
							   577892407);
	if (class526.toObjectIDs != null)
	    class526
		= class526.method11768(Class1.aClass19_11,
				       (client.anInt8266 * -831877317 == 4
					? (Interface11) (Class104
							 .anInterface11_1485)
					: Class1.aClass19_11),
				       -1641039984);
	if (class526 == null) {
	    method4963(class103, -830963939);
	    ((Class248) this).anInt3984 = 523772447;
	    return null;
	}
	if (!((Class248) this).aBool3986
	    && (class526.objectID * -2079513015
		!= 854402593 * ((Class248) this).anInt3984)) {
	    method4965(true, -1, 0, 0, 1327871618);
	    ((Class248) this).aBool3989 = false;
	    ((Class248) this).aClass89_3980 = null;
	}
	method4964(((Class248) this).aClass475_Sub1_3975, (byte) -67);
	if (bool_24_)
	    bool_24_ = bool_24_ & (((Class248) this).aBool3981
				   & !((Class248) this).aBool3989
				   & Class241_Sub5_Sub9
					 .aClass241_Sub9_11043
					 .aClass445_Sub7_8865
					 .method14150(21070132) != 0);
	if (bool && !bool_24_) {
	    ((Class248) this).anInt3984 = 207268649 * class526.objectID;
	    return null;
	}
	Class287 class287 = (((Class248) this).aClass475_Sub1_3975.method10874
			     ().aClass287_4386);
	Class552 class552 = client.aClass238_8477.method4751(-1570195413);
	if (bool_24_) {
	    class552.method12150(((Class248) this).aClass241_Sub39_Sub17_3988,
				 ((Class248) this).aByte3976,
				 (int) class287.aFloat4477,
				 (int) class287.aFloat4479,
				 ((Class248) this).aBoolArray3977,
				 -2114568413);
	    ((Class248) this).aBool3989 = false;
	}
	Class166 class166
	    = class552.aClass166Array7184[((Class248) this).aByte3976];
	Class166 class166_25_;
	if (((Class248) this).aBool3979)
	    class166_25_ = class552.aClass166Array7179[0];
	else
	    class166_25_ = (((Class248) this).aByte3976 < 3
			    ? (class552.aClass166Array7184
			       [1 + ((Class248) this).aByte3976])
			    : null);
	Class89 class89 = null;
	if (((Class248) this).aClass409_3978.method7364(-345961829)) {
	    if (bool_24_)
		i |= 0x40000;
	    class89
		= (class526.method11788
		   (class103, i,
		    (11 != ((Class248) this).anInt3983 * 1815958437
		     ? ((Class248) this).anInt3983 * 1815958437 : 10),
		    (11 == 1815958437 * ((Class248) this).anInt3983
		     ? 4 + ((Class248) this).anInt3987 * 592978681
		     : 592978681 * ((Class248) this).anInt3987),
		    class166, class166_25_, (int) class287.aFloat4477,
		    class166.method3574((int) class287.aFloat4477,
					(int) class287.aFloat4479, 1746391594),
		    (int) class287.aFloat4479,
		    ((Class248) this).aClass409_3978,
		    ((Class248) this).aClass536_3992, 1735208197));
	    if (class89 != null) {
		if (bool_24_) {
		    if (null == ((Class248) this).aBoolArray3977)
			((Class248) this).aBoolArray3977 = new boolean[4];
		    ((Class248) this).aClass241_Sub39_Sub17_3988
			= class89.method1892(((Class248) this)
					     .aClass241_Sub39_Sub17_3988);
		    class552.method12205((((Class248) this)
					  .aClass241_Sub39_Sub17_3988),
					 ((Class248) this).aByte3976,
					 (int) class287.aFloat4477,
					 (int) class287.aFloat4479,
					 ((Class248) this).aBoolArray3977,
					 -1564094044);
		    ((Class248) this).aBool3989 = true;
		}
		((Class248) this).anInt3985
		    = class89.method1902() * 1439346495;
		class89.method1894();
	    } else {
		((Class248) this).aBoolArray3977 = null;
		((Class248) this).aClass241_Sub39_Sub17_3988 = null;
		((Class248) this).anInt3985 = 0;
	    }
	    ((Class248) this).aClass89_3980 = null;
	} else if (((Class248) this).aClass89_3980 == null
		   || (((Class248) this).aClass89_3980.method1866() & i) != i
		   || (class526.objectID * -2079513015
		       != ((Class248) this).anInt3984 * 854402593)) {
	    if (((Class248) this).aClass89_3980 != null)
		i |= ((Class248) this).aClass89_3980.method1866();
	    Class399 class399
		= (class526.method11765
		   (class103, i,
		    (((Class248) this).anInt3983 * 1815958437 != 11
		     ? 1815958437 * ((Class248) this).anInt3983 : 10),
		    (11 == ((Class248) this).anInt3983 * 1815958437
		     ? 4 + ((Class248) this).anInt3987 * 592978681
		     : 592978681 * ((Class248) this).anInt3987),
		    class166, class166_25_, (int) class287.aFloat4477,
		    class166.method3574((int) class287.aFloat4477,
					(int) class287.aFloat4479,
					-1963553317),
		    (int) class287.aFloat4479, bool_24_,
		    ((Class248) this).aClass536_3992, -1219737013));
	    if (null != class399) {
		((Class248) this).aClass89_3980 = class89
		    = (Class89) class399.anObject5795;
		if (bool_24_) {
		    ((Class248) this).aClass241_Sub39_Sub17_3988
			= (Class241_Sub39_Sub17) class399.anObject5794;
		    ((Class248) this).aBoolArray3977 = null;
		    class552.method12205((((Class248) this)
					  .aClass241_Sub39_Sub17_3988),
					 ((Class248) this).aByte3976,
					 (int) class287.aFloat4477,
					 (int) class287.aFloat4479, null,
					 -1537471958);
		    ((Class248) this).aBool3989 = true;
		}
		((Class248) this).anInt3985
		    = class89.method1902() * 1439346495;
		class89.method1894();
	    } else {
		((Class248) this).aBoolArray3977 = null;
		((Class248) this).aClass241_Sub39_Sub17_3988 = null;
		((Class248) this).aClass89_3980 = null;
		((Class248) this).anInt3985 = 0;
	    }
	} else
	    class89 = ((Class248) this).aClass89_3980;
	((Class248) this).anInt3984 = 207268649 * class526.objectID;
	return class89;
    }
    
    final Class89 method4975(Class103 class103, int i, boolean bool,
			     boolean bool_26_, int i_27_) {
	ObjectDefinition class526
	    = ((Class248) this).aClass532_3982.getObjectDefinition(((((Class248) this)
							     .anInt3973)
							    * -756151697),
							   577892407);
	if (class526.toObjectIDs != null)
	    class526
		= class526.method11768(Class1.aClass19_11,
				       (client.anInt8266 * -831877317 == 4
					? (Interface11) (Class104
							 .anInterface11_1485)
					: Class1.aClass19_11),
				       -1078624272);
	if (class526 == null) {
	    method4963(class103, 2028271299);
	    ((Class248) this).anInt3984 = 523772447;
	    return null;
	}
	if (!((Class248) this).aBool3986
	    && (class526.objectID * -2079513015
		!= 854402593 * ((Class248) this).anInt3984)) {
	    method4965(true, -1, 0, 0, 1467170349);
	    ((Class248) this).aBool3989 = false;
	    ((Class248) this).aClass89_3980 = null;
	}
	method4964(((Class248) this).aClass475_Sub1_3975, (byte) 40);
	if (bool_26_)
	    bool_26_ = bool_26_ & (((Class248) this).aBool3981
				   & !((Class248) this).aBool3989
				   & Class241_Sub5_Sub9
					 .aClass241_Sub9_11043
					 .aClass445_Sub7_8865
					 .method14150(1880979305) != 0);
	if (bool && !bool_26_) {
	    ((Class248) this).anInt3984 = 207268649 * class526.objectID;
	    return null;
	}
	Class287 class287 = (((Class248) this).aClass475_Sub1_3975.method10874
			     ().aClass287_4386);
	Class552 class552 = client.aClass238_8477.method4751(-1692928277);
	if (bool_26_) {
	    class552.method12150(((Class248) this).aClass241_Sub39_Sub17_3988,
				 ((Class248) this).aByte3976,
				 (int) class287.aFloat4477,
				 (int) class287.aFloat4479,
				 ((Class248) this).aBoolArray3977,
				 -2046919539);
	    ((Class248) this).aBool3989 = false;
	}
	Class166 class166
	    = class552.aClass166Array7184[((Class248) this).aByte3976];
	Class166 class166_28_;
	if (((Class248) this).aBool3979)
	    class166_28_ = class552.aClass166Array7179[0];
	else
	    class166_28_ = (((Class248) this).aByte3976 < 3
			    ? (class552.aClass166Array7184
			       [1 + ((Class248) this).aByte3976])
			    : null);
	Class89 class89 = null;
	if (((Class248) this).aClass409_3978.method7364(1722837140)) {
	    if (bool_26_)
		i |= 0x40000;
	    class89 = (class526.method11788
		       (class103, i,
			(11 != ((Class248) this).anInt3983 * 1815958437
			 ? ((Class248) this).anInt3983 * 1815958437 : 10),
			(11 == 1815958437 * ((Class248) this).anInt3983
			 ? 4 + ((Class248) this).anInt3987 * 592978681
			 : 592978681 * ((Class248) this).anInt3987),
			class166, class166_28_, (int) class287.aFloat4477,
			class166.method3574((int) class287.aFloat4477,
					    (int) class287.aFloat4479,
					    -1157716354),
			(int) class287.aFloat4479,
			((Class248) this).aClass409_3978,
			((Class248) this).aClass536_3992, -1387966307));
	    if (class89 != null) {
		if (bool_26_) {
		    if (null == ((Class248) this).aBoolArray3977)
			((Class248) this).aBoolArray3977 = new boolean[4];
		    ((Class248) this).aClass241_Sub39_Sub17_3988
			= class89.method1892(((Class248) this)
					     .aClass241_Sub39_Sub17_3988);
		    class552.method12205((((Class248) this)
					  .aClass241_Sub39_Sub17_3988),
					 ((Class248) this).aByte3976,
					 (int) class287.aFloat4477,
					 (int) class287.aFloat4479,
					 ((Class248) this).aBoolArray3977,
					 -678810842);
		    ((Class248) this).aBool3989 = true;
		}
		((Class248) this).anInt3985
		    = class89.method1902() * 1439346495;
		class89.method1894();
	    } else {
		((Class248) this).aBoolArray3977 = null;
		((Class248) this).aClass241_Sub39_Sub17_3988 = null;
		((Class248) this).anInt3985 = 0;
	    }
	    ((Class248) this).aClass89_3980 = null;
	} else if (((Class248) this).aClass89_3980 == null
		   || (((Class248) this).aClass89_3980.method1866() & i) != i
		   || (class526.objectID * -2079513015
		       != ((Class248) this).anInt3984 * 854402593)) {
	    if (((Class248) this).aClass89_3980 != null)
		i |= ((Class248) this).aClass89_3980.method1866();
	    Class399 class399
		= (class526.method11765
		   (class103, i,
		    (((Class248) this).anInt3983 * 1815958437 != 11
		     ? 1815958437 * ((Class248) this).anInt3983 : 10),
		    (11 == ((Class248) this).anInt3983 * 1815958437
		     ? 4 + ((Class248) this).anInt3987 * 592978681
		     : 592978681 * ((Class248) this).anInt3987),
		    class166, class166_28_, (int) class287.aFloat4477,
		    class166.method3574((int) class287.aFloat4477,
					(int) class287.aFloat4479, 1413700012),
		    (int) class287.aFloat4479, bool_26_,
		    ((Class248) this).aClass536_3992, -1219737013));
	    if (null != class399) {
		((Class248) this).aClass89_3980 = class89
		    = (Class89) class399.anObject5795;
		if (bool_26_) {
		    ((Class248) this).aClass241_Sub39_Sub17_3988
			= (Class241_Sub39_Sub17) class399.anObject5794;
		    ((Class248) this).aBoolArray3977 = null;
		    class552.method12205((((Class248) this)
					  .aClass241_Sub39_Sub17_3988),
					 ((Class248) this).aByte3976,
					 (int) class287.aFloat4477,
					 (int) class287.aFloat4479, null,
					 -368076969);
		    ((Class248) this).aBool3989 = true;
		}
		((Class248) this).anInt3985
		    = class89.method1902() * 1439346495;
		class89.method1894();
	    } else {
		((Class248) this).aBoolArray3977 = null;
		((Class248) this).aClass241_Sub39_Sub17_3988 = null;
		((Class248) this).aClass89_3980 = null;
		((Class248) this).anInt3985 = 0;
	    }
	} else
	    class89 = ((Class248) this).aClass89_3980;
	((Class248) this).anInt3984 = 207268649 * class526.objectID;
	return class89;
    }
    
    final Class89 method4976(Class103 class103, int i, boolean bool,
			     boolean bool_29_) {
	ObjectDefinition class526
	    = ((Class248) this).aClass532_3982.getObjectDefinition(((((Class248) this)
							     .anInt3973)
							    * -756151697),
							   577892407);
	if (class526.toObjectIDs != null)
	    class526
		= class526.method11768(Class1.aClass19_11,
				       (client.anInt8266 * -831877317 == 4
					? (Interface11) (Class104
							 .anInterface11_1485)
					: Class1.aClass19_11),
				       -1732977320);
	if (class526 == null) {
	    method4963(class103, 692851764);
	    ((Class248) this).anInt3984 = 523772447;
	    return null;
	}
	if (!((Class248) this).aBool3986
	    && (class526.objectID * -2079513015
		!= 854402593 * ((Class248) this).anInt3984)) {
	    method4965(true, -1, 0, 0, 1317877542);
	    ((Class248) this).aBool3989 = false;
	    ((Class248) this).aClass89_3980 = null;
	}
	method4964(((Class248) this).aClass475_Sub1_3975, (byte) -6);
	if (bool_29_)
	    bool_29_ = bool_29_ & (((Class248) this).aBool3981
				   & !((Class248) this).aBool3989
				   & Class241_Sub5_Sub9
					 .aClass241_Sub9_11043
					 .aClass445_Sub7_8865
					 .method14150(361002811) != 0);
	if (bool && !bool_29_) {
	    ((Class248) this).anInt3984 = 207268649 * class526.objectID;
	    return null;
	}
	Class287 class287 = (((Class248) this).aClass475_Sub1_3975.method10874
			     ().aClass287_4386);
	Class552 class552 = client.aClass238_8477.method4751(-2115638548);
	if (bool_29_) {
	    class552.method12150(((Class248) this).aClass241_Sub39_Sub17_3988,
				 ((Class248) this).aByte3976,
				 (int) class287.aFloat4477,
				 (int) class287.aFloat4479,
				 ((Class248) this).aBoolArray3977,
				 -2106119753);
	    ((Class248) this).aBool3989 = false;
	}
	Class166 class166
	    = class552.aClass166Array7184[((Class248) this).aByte3976];
	Class166 class166_30_;
	if (((Class248) this).aBool3979)
	    class166_30_ = class552.aClass166Array7179[0];
	else
	    class166_30_ = (((Class248) this).aByte3976 < 3
			    ? (class552.aClass166Array7184
			       [1 + ((Class248) this).aByte3976])
			    : null);
	Class89 class89 = null;
	if (((Class248) this).aClass409_3978.method7364(515237126)) {
	    if (bool_29_)
		i |= 0x40000;
	    class89 = (class526.method11788
		       (class103, i,
			(11 != ((Class248) this).anInt3983 * 1815958437
			 ? ((Class248) this).anInt3983 * 1815958437 : 10),
			(11 == 1815958437 * ((Class248) this).anInt3983
			 ? 4 + ((Class248) this).anInt3987 * 592978681
			 : 592978681 * ((Class248) this).anInt3987),
			class166, class166_30_, (int) class287.aFloat4477,
			class166.method3574((int) class287.aFloat4477,
					    (int) class287.aFloat4479,
					    -1701455702),
			(int) class287.aFloat4479,
			((Class248) this).aClass409_3978,
			((Class248) this).aClass536_3992, 1794497132));
	    if (class89 != null) {
		if (bool_29_) {
		    if (null == ((Class248) this).aBoolArray3977)
			((Class248) this).aBoolArray3977 = new boolean[4];
		    ((Class248) this).aClass241_Sub39_Sub17_3988
			= class89.method1892(((Class248) this)
					     .aClass241_Sub39_Sub17_3988);
		    class552.method12205((((Class248) this)
					  .aClass241_Sub39_Sub17_3988),
					 ((Class248) this).aByte3976,
					 (int) class287.aFloat4477,
					 (int) class287.aFloat4479,
					 ((Class248) this).aBoolArray3977,
					 -1088302083);
		    ((Class248) this).aBool3989 = true;
		}
		((Class248) this).anInt3985
		    = class89.method1902() * 1439346495;
		class89.method1894();
	    } else {
		((Class248) this).aBoolArray3977 = null;
		((Class248) this).aClass241_Sub39_Sub17_3988 = null;
		((Class248) this).anInt3985 = 0;
	    }
	    ((Class248) this).aClass89_3980 = null;
	} else if (((Class248) this).aClass89_3980 == null
		   || (((Class248) this).aClass89_3980.method1866() & i) != i
		   || (class526.objectID * -2079513015
		       != ((Class248) this).anInt3984 * 854402593)) {
	    if (((Class248) this).aClass89_3980 != null)
		i |= ((Class248) this).aClass89_3980.method1866();
	    Class399 class399
		= (class526.method11765
		   (class103, i,
		    (((Class248) this).anInt3983 * 1815958437 != 11
		     ? 1815958437 * ((Class248) this).anInt3983 : 10),
		    (11 == ((Class248) this).anInt3983 * 1815958437
		     ? 4 + ((Class248) this).anInt3987 * 592978681
		     : 592978681 * ((Class248) this).anInt3987),
		    class166, class166_30_, (int) class287.aFloat4477,
		    class166.method3574((int) class287.aFloat4477,
					(int) class287.aFloat4479, 1438354427),
		    (int) class287.aFloat4479, bool_29_,
		    ((Class248) this).aClass536_3992, -1219737013));
	    if (null != class399) {
		((Class248) this).aClass89_3980 = class89
		    = (Class89) class399.anObject5795;
		if (bool_29_) {
		    ((Class248) this).aClass241_Sub39_Sub17_3988
			= (Class241_Sub39_Sub17) class399.anObject5794;
		    ((Class248) this).aBoolArray3977 = null;
		    class552.method12205((((Class248) this)
					  .aClass241_Sub39_Sub17_3988),
					 ((Class248) this).aByte3976,
					 (int) class287.aFloat4477,
					 (int) class287.aFloat4479, null,
					 -1894844604);
		    ((Class248) this).aBool3989 = true;
		}
		((Class248) this).anInt3985
		    = class89.method1902() * 1439346495;
		class89.method1894();
	    } else {
		((Class248) this).aBoolArray3977 = null;
		((Class248) this).aClass241_Sub39_Sub17_3988 = null;
		((Class248) this).aClass89_3980 = null;
		((Class248) this).anInt3985 = 0;
	    }
	} else
	    class89 = ((Class248) this).aClass89_3980;
	((Class248) this).anInt3984 = 207268649 * class526.objectID;
	return class89;
    }
    
    final Class89 method4977(Class103 class103, int i, boolean bool,
			     boolean bool_31_) {
	ObjectDefinition class526
	    = ((Class248) this).aClass532_3982.getObjectDefinition(((((Class248) this)
							     .anInt3973)
							    * -756151697),
							   577892407);
	if (class526.toObjectIDs != null)
	    class526
		= class526.method11768(Class1.aClass19_11,
				       (client.anInt8266 * -831877317 == 4
					? (Interface11) (Class104
							 .anInterface11_1485)
					: Class1.aClass19_11),
				       -2097312731);
	if (class526 == null) {
	    method4963(class103, -1168768954);
	    ((Class248) this).anInt3984 = 523772447;
	    return null;
	}
	if (!((Class248) this).aBool3986
	    && (class526.objectID * -2079513015
		!= 854402593 * ((Class248) this).anInt3984)) {
	    method4965(true, -1, 0, 0, 1546921124);
	    ((Class248) this).aBool3989 = false;
	    ((Class248) this).aClass89_3980 = null;
	}
	method4964(((Class248) this).aClass475_Sub1_3975, (byte) 60);
	if (bool_31_)
	    bool_31_ = bool_31_ & (((Class248) this).aBool3981
				   & !((Class248) this).aBool3989
				   & Class241_Sub5_Sub9
					 .aClass241_Sub9_11043
					 .aClass445_Sub7_8865
					 .method14150(1557439161) != 0);
	if (bool && !bool_31_) {
	    ((Class248) this).anInt3984 = 207268649 * class526.objectID;
	    return null;
	}
	Class287 class287 = (((Class248) this).aClass475_Sub1_3975.method10874
			     ().aClass287_4386);
	Class552 class552 = client.aClass238_8477.method4751(-533915474);
	if (bool_31_) {
	    class552.method12150(((Class248) this).aClass241_Sub39_Sub17_3988,
				 ((Class248) this).aByte3976,
				 (int) class287.aFloat4477,
				 (int) class287.aFloat4479,
				 ((Class248) this).aBoolArray3977,
				 -1935623287);
	    ((Class248) this).aBool3989 = false;
	}
	Class166 class166
	    = class552.aClass166Array7184[((Class248) this).aByte3976];
	Class166 class166_32_;
	if (((Class248) this).aBool3979)
	    class166_32_ = class552.aClass166Array7179[0];
	else
	    class166_32_ = (((Class248) this).aByte3976 < 3
			    ? (class552.aClass166Array7184
			       [1 + ((Class248) this).aByte3976])
			    : null);
	Class89 class89 = null;
	if (((Class248) this).aClass409_3978.method7364(-1432162832)) {
	    if (bool_31_)
		i |= 0x40000;
	    class89
		= (class526.method11788
		   (class103, i,
		    (11 != ((Class248) this).anInt3983 * 1815958437
		     ? ((Class248) this).anInt3983 * 1815958437 : 10),
		    (11 == 1815958437 * ((Class248) this).anInt3983
		     ? 4 + ((Class248) this).anInt3987 * 592978681
		     : 592978681 * ((Class248) this).anInt3987),
		    class166, class166_32_, (int) class287.aFloat4477,
		    class166.method3574((int) class287.aFloat4477,
					(int) class287.aFloat4479, -38128597),
		    (int) class287.aFloat4479,
		    ((Class248) this).aClass409_3978,
		    ((Class248) this).aClass536_3992, 1874364484));
	    if (class89 != null) {
		if (bool_31_) {
		    if (null == ((Class248) this).aBoolArray3977)
			((Class248) this).aBoolArray3977 = new boolean[4];
		    ((Class248) this).aClass241_Sub39_Sub17_3988
			= class89.method1892(((Class248) this)
					     .aClass241_Sub39_Sub17_3988);
		    class552.method12205((((Class248) this)
					  .aClass241_Sub39_Sub17_3988),
					 ((Class248) this).aByte3976,
					 (int) class287.aFloat4477,
					 (int) class287.aFloat4479,
					 ((Class248) this).aBoolArray3977,
					 -1182892132);
		    ((Class248) this).aBool3989 = true;
		}
		((Class248) this).anInt3985
		    = class89.method1902() * 1439346495;
		class89.method1894();
	    } else {
		((Class248) this).aBoolArray3977 = null;
		((Class248) this).aClass241_Sub39_Sub17_3988 = null;
		((Class248) this).anInt3985 = 0;
	    }
	    ((Class248) this).aClass89_3980 = null;
	} else if (((Class248) this).aClass89_3980 == null
		   || (((Class248) this).aClass89_3980.method1866() & i) != i
		   || (class526.objectID * -2079513015
		       != ((Class248) this).anInt3984 * 854402593)) {
	    if (((Class248) this).aClass89_3980 != null)
		i |= ((Class248) this).aClass89_3980.method1866();
	    Class399 class399
		= (class526.method11765
		   (class103, i,
		    (((Class248) this).anInt3983 * 1815958437 != 11
		     ? 1815958437 * ((Class248) this).anInt3983 : 10),
		    (11 == ((Class248) this).anInt3983 * 1815958437
		     ? 4 + ((Class248) this).anInt3987 * 592978681
		     : 592978681 * ((Class248) this).anInt3987),
		    class166, class166_32_, (int) class287.aFloat4477,
		    class166.method3574((int) class287.aFloat4477,
					(int) class287.aFloat4479,
					-1486158366),
		    (int) class287.aFloat4479, bool_31_,
		    ((Class248) this).aClass536_3992, -1219737013));
	    if (null != class399) {
		((Class248) this).aClass89_3980 = class89
		    = (Class89) class399.anObject5795;
		if (bool_31_) {
		    ((Class248) this).aClass241_Sub39_Sub17_3988
			= (Class241_Sub39_Sub17) class399.anObject5794;
		    ((Class248) this).aBoolArray3977 = null;
		    class552.method12205((((Class248) this)
					  .aClass241_Sub39_Sub17_3988),
					 ((Class248) this).aByte3976,
					 (int) class287.aFloat4477,
					 (int) class287.aFloat4479, null,
					 -1452940698);
		    ((Class248) this).aBool3989 = true;
		}
		((Class248) this).anInt3985
		    = class89.method1902() * 1439346495;
		class89.method1894();
	    } else {
		((Class248) this).aBoolArray3977 = null;
		((Class248) this).aClass241_Sub39_Sub17_3988 = null;
		((Class248) this).aClass89_3980 = null;
		((Class248) this).anInt3985 = 0;
	    }
	} else
	    class89 = ((Class248) this).aClass89_3980;
	((Class248) this).anInt3984 = 207268649 * class526.objectID;
	return class89;
    }
    
    void method4978(Class103 class103, Class89 class89, Class266 class266,
		    int i, int i_33_, int i_34_, int i_35_, boolean bool) {
	Class106[] class106s = class89.method2051();
	Class167[] class167s = class89.method1917();
	if ((((Class248) this).aClass489_3991 == null
	     || ((Class248) this).aClass489_3991.aBool6487)
	    && (null != class106s || null != class167s)) {
	    ObjectDefinition class526
		= (((Class248) this).aClass532_3982.getObjectDefinition
		   (-756151697 * ((Class248) this).anInt3973, 577892407));
	    if (null != class526.toObjectIDs)
		class526 = (class526.method11768
			    (Class1.aClass19_11,
			     (4 == -831877317 * client.anInt8266
			      ? (Interface11) Class104.anInterface11_1485
			      : Class1.aClass19_11),
			     -337420984));
	    if (class526 != null)
		((Class248) this).aClass489_3991
		    = Class489.method11182(client.anInt8296, true);
	}
	if (null != ((Class248) this).aClass489_3991) {
	    class89.method1915(class266);
	    if (bool)
		((Class248) this).aClass489_3991.method11158
		    (class103, (long) client.anInt8296, class106s, class167s,
		     false);
	    else
		((Class248) this).aClass489_3991
		    .method11157((long) client.anInt8296);
	    ((Class248) this).aClass489_3991.method11162((((Class248) this)
							  .aByte3976),
							 i, i_33_, i_34_,
							 i_35_);
	}
    }
    
    int method4979() {
	return -method4955(1395868106);
    }
    
    void method4980(Class103 class103, Class89 class89, Class266 class266,
		    int i, int i_36_, int i_37_, int i_38_, boolean bool) {
	Class106[] class106s = class89.method2051();
	Class167[] class167s = class89.method1917();
	if ((((Class248) this).aClass489_3991 == null
	     || ((Class248) this).aClass489_3991.aBool6487)
	    && (null != class106s || null != class167s)) {
	    ObjectDefinition class526
		= (((Class248) this).aClass532_3982.getObjectDefinition
		   (-756151697 * ((Class248) this).anInt3973, 577892407));
	    if (null != class526.toObjectIDs)
		class526 = (class526.method11768
			    (Class1.aClass19_11,
			     (4 == -831877317 * client.anInt8266
			      ? (Interface11) Class104.anInterface11_1485
			      : Class1.aClass19_11),
			     -1767138213));
	    if (class526 != null)
		((Class248) this).aClass489_3991
		    = Class489.method11182(client.anInt8296, true);
	}
	if (null != ((Class248) this).aClass489_3991) {
	    class89.method1915(class266);
	    if (bool)
		((Class248) this).aClass489_3991.method11158
		    (class103, (long) client.anInt8296, class106s, class167s,
		     false);
	    else
		((Class248) this).aClass489_3991
		    .method11157((long) client.anInt8296);
	    ((Class248) this).aClass489_3991.method11162((((Class248) this)
							  .aByte3976),
							 i, i_36_, i_37_,
							 i_38_);
	}
    }
    
    void method4981(Class103 class103) {
	method4975(class103, 262144, true, true, 512729464);
    }
    
    void method4982(Class103 class103) {
	method4975(class103, 262144, true, true, -1636698552);
    }
    
    public void method4983(int i, int i_39_) {
	((Class248) this).aClass409_3990 = null;
	if (i_39_ > 0) {
	    ((Class248) this).aClass409_3990
		= new Class409_Sub3(((Class248) this).aClass475_Sub1_3975,
				    false);
	    ((Class248) this).aClass409_3990.method7351(i, i_39_, 1, false,
							-1302211377);
	} else {
	    ((Class248) this).aBool3986 = true;
	    method4965(false, i, 1, 0, -426300025);
	}
    }
    
    void method4984(Class103 class103) {
	if (null != ((Class248) this).aClass241_Sub39_Sub17_3988) {
	    Class287 class287
		= (((Class248) this).aClass475_Sub1_3975.method10874()
		   .aClass287_4386);
	    client.aClass238_8477.method4751(-1517180403).method12150
		(((Class248) this).aClass241_Sub39_Sub17_3988,
		 ((Class248) this).aByte3976, (int) class287.aFloat4477,
		 (int) class287.aFloat4479, ((Class248) this).aBoolArray3977,
		 -1944341803);
	    ((Class248) this).aBoolArray3977 = null;
	    ((Class248) this).aClass241_Sub39_Sub17_3988 = null;
	}
    }
    
    void method4985(Class475_Sub1 class475_sub1) {
	if (((Class248) this).aClass409_3990 != null
	    && ((Class248) this).aClass409_3990.method7364(1982197392)) {
	    ((Class248) this).aClass409_3990.method7411
		(client.anInt8296 - 934776393 * ((Class248) this).anInt3974,
		 (byte) 1);
	    if (!((Class248) this).aClass409_3990.method7349(-1626761020)) {
		((Class248) this).aClass409_3978
		    = ((Class248) this).aClass409_3990;
		((Class248) this).aBool3986 = true;
		((Class248) this).anInt3974 = client.anInt8296 * 678282233;
		return;
	    }
	}
	if (((Class248) this).aClass409_3978.method7364(1970782248)) {
	    if (((Class248) this).aClass409_3978.method7411
		(client.anInt8296 - 934776393 * ((Class248) this).anInt3974,
		 (byte) 1)) {
		if (Class241_Sub5_Sub9.aClass241_Sub9_11043
			.aClass445_Sub7_8865.method14150(15831034)
		    == 2)
		    ((Class248) this).aBool3989 = false;
		if (((Class248) this).aClass409_3978.method7419((byte) 75)) {
		    ((Class248) this).aClass409_3978.method7347(-1,
								-193440377);
		    ((Class248) this).aBool3986 = false;
		    method4965(false, -1, 0, 0, 879451531);
		}
	    }
	} else
	    method4965(false, -1, 0, 0, -1800032405);
	((Class248) this).anInt3974 = 678282233 * client.anInt8296;
    }
    
    static final void method4986(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).anInt6231 -= 1421070234;
	if ((((ClientScriptData) class454).longStack
	     [-735224571 * ((ClientScriptData) class454).anInt6231])
	    >= (((ClientScriptData) class454).longStack
		[1 + -735224571 * ((ClientScriptData) class454).anInt6231]))
	    ((ClientScriptData) class454).step
		+= ((((ClientScriptData) class454).integerConstants
		     [1938982693 * ((ClientScriptData) class454).step])
		    * 1924545709);
    }
    
    static boolean method4987(CharSequence charsequence, int i, boolean bool,
			      int i_40_) {
	if (i < 2 || i > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i).toString());
	boolean bool_41_ = false;
	boolean bool_42_ = false;
	int i_43_ = 0;
	int i_44_ = charsequence.length();
	for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
	    int i_46_ = charsequence.charAt(i_45_);
	    if (i_45_ == 0) {
		if (45 == i_46_) {
		    bool_41_ = true;
		    continue;
		}
		if (43 == i_46_ && bool)
		    continue;
	    }
	    if (i_46_ >= 48 && i_46_ <= 57)
		i_46_ -= 48;
	    else if (i_46_ >= 65 && i_46_ <= 90)
		i_46_ -= 55;
	    else if (i_46_ >= 97 && i_46_ <= 122)
		i_46_ -= 87;
	    else
		return false;
	    if (i_46_ >= i)
		return false;
	    if (bool_41_)
		i_46_ = -i_46_;
	    int i_47_ = i_46_ + i_43_ * i;
	    if (i_43_ != i_47_ / i)
		return false;
	    i_43_ = i_47_;
	    bool_42_ = true;
	}
	return bool_42_;
    }
    
    public static String method4988(int i) {
	return Class589.method12904("www", false, -1852374183);
    }
    
    static final void method4989(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub24_8871
		  .method14334((byte) 80);
    }
}
