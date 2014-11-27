/* Class475_Sub1_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Entity extends Class475_Sub1_Sub1 implements Interface1 {
    public int[] anIntArray11372;
    static final int anInt11373 = 5;
    public int entityIndex = -1641239953;//anInt11374
    public Class409 aClass409_11375;
    public int anInt11376;
    int anInt11377;
    int anInt11378;
    public boolean aBool11379;
    public int anInt11380;
    public int anInt11381;
    public int anInt11382;
    int anInt11383;
    int anInt11384;
    int anInt11385;
    public int anInt11386;
    Class249 aClass249_11387;
    byte aByte11388;
    public int anInt11389;
    public int anInt11390;
    public int[] anIntArray11391;
    public int[] anIntArray11392;
    public int[] anIntArray11393;
    public Class421 aClass421_11394;
    public byte aByte11395;
    public byte[] moveTypeQueue;//aByteArray11396
    public int[] anIntArray11397;
    static final int anInt11398 = 20;
    int anInt11399;
    public int anInt11400;
    public int anInt11401;
    public int anInt11402;
    public int anInt11403;
    public RSGraphics[] aClass244Array11404;
    public Class409_Sub1 aClass409_Sub1_11405;
    public Class8 aClass8_11406;
    public int anInt11407;
    public int anInt11408;
    public Interface46 anInterface46_11409;
    public int anInt11410;
    public int facingEntity;//anInt11411
    public byte aByte11412;
    public byte aByte11413;
    int anInt11414;
    public int[] anIntArray11415;
    public byte aByte11416;
    public Class409_Sub3_Sub1[] aClass409_Sub3_Sub1Array11417;
    public int[] anIntArray11418;
    public int[] anIntArray11419;
    Class489 aClass489_11420;
    public int anInt11421;
    public int anInt11422;
    public Class8 aClass8_11423;
    public Class8 aClass8_11424;
    public int queuedStepCount;//anInt11425
    public int[] scenePositionXQueue;//anIntArray11426
    public int[] scenePositionYQueue;//anIntArray11427
    public int anInt11428;
    public int anInt11429;
    public int anInt11430;
    public int anInt11431;
    boolean aBool11432;
    boolean aBool11433;
    int anInt11434 = -2135229253;
    public Class89[] aClass89Array11435;
    public int anInt11436;
    public InterfaceDefinition aClass35_11437;
    int anInt11438;
    int anInt11439;
    public VarDomain anInterface12_11440;
    
    void method17768() {
	if (null != aClass489_11420)
	    aClass489_11420.method11154();
    }
    
    Entity(Class552 class552, VarTypeList class199_sub2) {
	this(class552, 10, class199_sub2);
    }
    
    public void method17769(String string, int i, int i_0_, int i_1_,
			    int i_2_) {
	if (aClass249_11387 == null)
	    aClass249_11387 = new Class249();
	((Class249) aClass249_11387)
	    .aString3993
	    = string;
	((Class249) aClass249_11387).anInt3994
	    = i * -1989191185;
	((Class249) aClass249_11387).anInt3997
	    = -2030408275 * i_0_;
	((Class249) aClass249_11387).anInt3995
	    = (((Class249) aClass249_11387)
		   .anInt3996
	       = i_1_ * 51539173) * -2137161139;
    }
    
    boolean method14469(byte i) {
	return false;
    }
    
    boolean method14452(byte i) {
	return aBool11432;
    }
    
    public abstract boolean method17770();
    
    public void setDirection/*method17771*/(int i, boolean bool, byte i_3_) {
		Class554 class554 = method17787(-1646396551);
		if (bool || 0 != 1200428141 * class554.anInt7236
		    || -683062517 * anInt11400 != 0) {
		    anInt11421 = (i & 0x3fff) * -864231;
		    aClass8_11406.method513(anInt11421 * 950504489, 1872259450);
		}
    }
    
    public int method17772(int i) {
		Class554 class554 = method17787(-287915602);
		int i_4_ = -267726731 * aClass8_11406.anInt44;
		boolean bool;
		if (class554.anInt7236 * 1200428141 != 0)
		    bool = aClass8_11406.method512(950504489 * anInt11421,
						   class554.anInt7236 * 1200428141,
						   -2026780165 * class554.anInt7245,
						   (byte) 0);
		else
		    bool = aClass8_11406.method512(950504489 * anInt11421,
						   -683062517 * anInt11400,
						   anInt11400 * -683062517, (byte) 0);
		int i_5_ = -267726731 * aClass8_11406.anInt44 - i_4_;
		if (i_5_ != 0)
		    anInt11436 += 1840011673;
		else {
		    anInt11436 = 0;
		    aClass8_11406.method513(anInt11421 * 950504489, 1899327717);
		}
		if (bool) {
		    if (0 != 1613091999 * class554.anInt7238) {
			if (i_5_ > 0)
			    aClass8_11423.method512(-1037683113 * class554.anInt7240,
						    1613091999 * class554.anInt7238,
						    class554.anInt7239 * 1310754067,
						    (byte) 0);
			else
			    aClass8_11423.method512(-(class554.anInt7240
						      * -1037683113),
						    1613091999 * class554.anInt7238,
						    class554.anInt7239 * 1310754067,
						    (byte) 0);
		    }
		    if (class554.anInt7241 * -1341383275 != 0)
			aClass8_11424.method512(class554.anInt7202 * -1595752353,
						-1341383275 * class554.anInt7241,
						-1704966055 * class554.anInt7242,
						(byte) 0);
		} else {
		    if (0 != class554.anInt7238 * 1613091999)
			aClass8_11423.method512(0, class554.anInt7238 * 1613091999,
						1310754067 * class554.anInt7239,
						(byte) 0);
		    else
			aClass8_11423.method513(0, 2030517099);
		    if (0 != -1341383275 * class554.anInt7241)
			aClass8_11424.method512(0, -1341383275 * class554.anInt7241,
						-1704966055 * class554.anInt7242,
						(byte) 0);
		    else
			aClass8_11424.method513(0, 1961669490);
		}
		return i_5_;
    }
    
    public void method17773(int[] is, int[] is_6_, int i) {
	if (anIntArray11415 == null && null != is)
	    anIntArray11415
		= new int[Class506.aClass504_6662.anIntArray6629.length];
	else if (null == is) {
	    anIntArray11415 = null;
	    return;
	}
	for (int i_7_ = 0; i_7_ < anIntArray11415.length; i_7_++)
	    anIntArray11415[i_7_] = -1;
	for (int i_8_ = 0; i_8_ < is.length; i_8_++) {
	    int i_9_ = is_6_[i_8_];
	    int i_10_ = 0;
	    while (i_10_ < anIntArray11415.length) {
		if ((i_9_ & 0x1) != 0)
		    anIntArray11415[i_10_] = is[i_8_];
		i_10_++;
		i_9_ >>= 1;
	    }
	}
    }
    
    public boolean method17774(int i, int i_11_, int i_12_) {
	if (anIntArray11418 == null) {
	    if (-1 == i_11_)
		return true;
	    anIntArray11418
		= new int[Class506.aClass504_6662.anIntArray6629.length];
	    for (int i_13_ = 0;
		 i_13_ < Class506.aClass504_6662.anIntArray6629.length;
		 i_13_++)
		anIntArray11418[i_13_] = -1;
	}
	Class554 class554 = method17787(-105218740);
	int i_14_ = 256;
	if (null != class554.anIntArray7234 && class554.anIntArray7234[i] > 0)
	    i_14_ = class554.anIntArray7234[i];
	if (-1 == i_11_) {
	    if (anIntArray11418[i] == -1)
		return true;
	    int i_15_ = aClass8_11406.method514((byte) 6);
	    int i_16_ = anIntArray11418[i];
	    int i_17_ = i_15_ - i_16_;
	    if (i_17_ >= -i_14_ && i_17_ <= i_14_) {
		anIntArray11418[i] = -1;
		for (int i_18_ = 0;
		     i_18_ < Class506.aClass504_6662.anIntArray6629.length;
		     i_18_++) {
		    if (-1 != anIntArray11418[i_18_])
			return true;
		}
		anIntArray11418 = null;
		return true;
	    }
	    if (i_17_ > 0 && i_17_ <= 8192 || i_17_ <= -8192)
		anIntArray11418[i] = i_16_ + i_14_ & 0x3fff;
	    else
		anIntArray11418[i] = i_16_ - i_14_ & 0x3fff;
	    return false;
	}
	if (anIntArray11418[i] == -1)
	    anIntArray11418[i] = aClass8_11406.method514((byte) -27);
	int i_19_ = anIntArray11418[i];
	int i_20_ = i_11_ - i_19_;
	if (i_20_ >= -i_14_ && i_20_ <= i_14_) {
	    anIntArray11418[i] = i_11_;
	    return true;
	}
	if (i_20_ > 0 && i_20_ <= 8192 || i_20_ <= -8192)
	    anIntArray11418[i] = i_14_ + i_19_ & 0x3fff;
	else
	    anIntArray11418[i] = i_19_ - i_14_ & 0x3fff;
	return false;
    }
    
    void method17775(Class103 class103, Class89[] class89s, Class266 class266,
		     boolean bool, int i) {
	if (!bool) {
	    int i_21_ = 0;
	    int i_22_ = 0;
	    int i_23_ = 0;
	    int i_24_ = 0;
	    int i_25_ = -1;
	    int i_26_ = -1;
	    Class106[][] class106s = new Class106[class89s.length][];
	    Class167[][] class167s = new Class167[class89s.length][];
	    for (int i_27_ = 0; i_27_ < class89s.length; i_27_++) {
		if (class89s[i_27_] != null) {
		    class89s[i_27_].method1915(class266);
		    class106s[i_27_] = class89s[i_27_].method2051();
		    class167s[i_27_] = class89s[i_27_].method1917();
		    if (null != class106s[i_27_]) {
			i_25_ = i_27_;
			i_22_++;
			i_21_ += class106s[i_27_].length;
		    }
		    if (class167s[i_27_] != null) {
			i_26_ = i_27_;
			i_24_++;
			i_23_ += class167s[i_27_].length;
		    }
		}
	    }
	    if ((null == aClass489_11420
		 || aClass489_11420.aBool6487)
		&& (i_22_ > 0 || i_24_ > 0))
		aClass489_11420
		    = Class489.method11182(client.anInt8296, true);
	    if (aClass489_11420 != null) {
		Object object = null;
		Class106[] class106s_28_;
		if (i_22_ == 1)
		    class106s_28_ = class106s[i_25_];
		else {
		    class106s_28_ = new Class106[i_21_];
		    int i_29_ = 0;
		    for (int i_30_ = 0; i_30_ < class89s.length; i_30_++) {
			if (class106s[i_30_] != null) {
			    System.arraycopy(class106s[i_30_], 0,
					     class106s_28_, i_29_,
					     class106s[i_30_].length);
			    i_29_ += class106s[i_30_].length;
			}
		    }
		}
		Object object_31_ = null;
		Class167[] class167s_32_;
		if (1 == i_24_)
		    class167s_32_ = class167s[i_26_];
		else {
		    class167s_32_ = new Class167[i_23_];
		    int i_33_ = 0;
		    for (int i_34_ = 0; i_34_ < class89s.length; i_34_++) {
			if (null != class167s[i_34_]) {
			    System.arraycopy(class167s[i_34_], 0,
					     class167s_32_, i_33_,
					     class167s[i_34_].length);
			    i_33_ += class167s[i_34_].length;
			}
		    }
		}
		aClass489_11420.method11158
		    (class103, (long) client.anInt8296, class106s_28_,
		     class167s_32_, false);
		aBool11433 = true;
	    }
	} else if (aClass489_11420 != null)
	    aClass489_11420
		.method11157((long) client.anInt8296);
	if (null != aClass489_11420)
	    aClass489_11420.method11162
		(nodePlane, aShort10717, aShort10716, aShort10718,
		 aShort10719);
    }
    
    void method17776(Class103 class103, Class89[] class89s, Class266 class266,
		     boolean bool) {
	if (!bool) {
	    int i = 0;
	    int i_35_ = 0;
	    int i_36_ = 0;
	    int i_37_ = 0;
	    int i_38_ = -1;
	    int i_39_ = -1;
	    Class106[][] class106s = new Class106[class89s.length][];
	    Class167[][] class167s = new Class167[class89s.length][];
	    for (int i_40_ = 0; i_40_ < class89s.length; i_40_++) {
		if (class89s[i_40_] != null) {
		    class89s[i_40_].method1915(class266);
		    class106s[i_40_] = class89s[i_40_].method2051();
		    class167s[i_40_] = class89s[i_40_].method1917();
		    if (null != class106s[i_40_]) {
			i_38_ = i_40_;
			i_35_++;
			i += class106s[i_40_].length;
		    }
		    if (class167s[i_40_] != null) {
			i_39_ = i_40_;
			i_37_++;
			i_36_ += class167s[i_40_].length;
		    }
		}
	    }
	    if ((null == aClass489_11420
		 || aClass489_11420.aBool6487)
		&& (i_35_ > 0 || i_37_ > 0))
		aClass489_11420
		    = Class489.method11182(client.anInt8296, true);
	    if (aClass489_11420 != null) {
		Object object = null;
		Class106[] class106s_41_;
		if (i_35_ == 1)
		    class106s_41_ = class106s[i_38_];
		else {
		    class106s_41_ = new Class106[i];
		    int i_42_ = 0;
		    for (int i_43_ = 0; i_43_ < class89s.length; i_43_++) {
			if (class106s[i_43_] != null) {
			    System.arraycopy(class106s[i_43_], 0,
					     class106s_41_, i_42_,
					     class106s[i_43_].length);
			    i_42_ += class106s[i_43_].length;
			}
		    }
		}
		Object object_44_ = null;
		Class167[] class167s_45_;
		if (1 == i_37_)
		    class167s_45_ = class167s[i_39_];
		else {
		    class167s_45_ = new Class167[i_36_];
		    int i_46_ = 0;
		    for (int i_47_ = 0; i_47_ < class89s.length; i_47_++) {
			if (null != class167s[i_47_]) {
			    System.arraycopy(class167s[i_47_], 0,
					     class167s_45_, i_46_,
					     class167s[i_47_].length);
			    i_46_ += class167s[i_47_].length;
			}
		    }
		}
		aClass489_11420.method11158
		    (class103, (long) client.anInt8296, class106s_41_,
		     class167s_45_, false);
		aBool11433 = true;
	    }
	} else if (aClass489_11420 != null)
	    aClass489_11420
		.method11157((long) client.anInt8296);
	if (null != aClass489_11420)
	    aClass489_11420.method11162
		(nodePlane, aShort10717, aShort10716, aShort10718,
		 aShort10719);
    }
    
    public final void method17777(short i) {
	queuedStepCount = 0;
	anInt11430 = 0;
    }
    
    boolean method17778(int i) {
	if (i == 673303253 * anInt11390)
	    return true;
	aClass35_11437 = Class551.method12094(i, null, null, true, (byte) -78);
	if (null == aClass35_11437)
	    return false;
	anInt11390 = 1917787773 * i;
	Class64.method1626(aClass35_11437.components, 503125623);
	return true;
    }
    
    public void method17779(int i, int i_48_, int i_49_, int i_50_, int i_51_,
			    int i_52_, int i_53_, int i_54_, byte i_55_) {
	if (method17795((byte) 78))
	    client.method13623(aClass35_11437,
			       aClass35_11437.method995(932432394), -1, i,
			       i_48_, i_49_, i_50_, i_51_, i_52_, i_53_,
			       i_54_);
    }
    
    public final void method17780(int i, int i_56_) {
	Class570 class570 = IncommingOpcode.aClass581_5298.method12748(i, -324042989);
	for (Class247_Sub4 class247_sub4
		 = (Class247_Sub4) aClass421_11394.method7525(1666158440);
	     null != class247_sub4;
	     class247_sub4
		 = (Class247_Sub4) aClass421_11394.method7526(-521936658)) {
	    if (class247_sub4.aClass570_10180 == class570) {
		class247_sub4.method4944((byte) 122);
		break;
	    }
	}
    }
    
    public int method14464(int i) {
	Class554 class554 = method17787(-1218710405);
	int i_57_;
	if (-1 != 578957175 * class554.anInt7218)
	    i_57_ = 578957175 * class554.anInt7218;
	else if (453255417 * anInt11378
		 == -32768)
	    i_57_ = 200;
	else
	    i_57_ = -(anInt11378 * 453255417);
	Class276 class276 = method10874();
	int i_58_ = (int) class276.aClass287_4386.aFloat4477 >> 9;
	int i_59_ = (int) class276.aClass287_4386.aFloat4479 >> 9;
	if (null != aClass552_8744 && i_58_ >= 1 && i_59_ >= 1
	    && i_58_ <= client.aClass238_8477.method4744(-2032793986) - 1
	    && i_59_ <= client.aClass238_8477.method4745(-131252951) - 1) {
	    Class548 class548 = (aClass552_8744.aClass548ArrayArrayArray7169
				 [nodePlane][i_58_][i_59_]);
	    if (class548 != null && class548.aClass475_Sub1_Sub4_7058 != null)
		return class548.aClass475_Sub1_Sub4_7058.aShort10742 + i_57_;
	}
	return i_57_;
    }
    
    public void method17781(int i, byte i_60_) {
	anInt11434 = -2135229253 * i;
    }
    
    public int method17782(int i) {
	return 150333555 * anInt11434;
    }
    
    public void method17783(byte i) {
	if (null != aClass249_11387
	    && null != ((Class249) (((Entity) this)
				    .aClass249_11387)).aString3993) {
	    ((Class249) aClass249_11387)
		.anInt3995
		-= -1874326815;
	    if (0 == ((Class249) (((Entity) this)
				  .aClass249_11387)).anInt3995 * -1139099359)
		((Class249) aClass249_11387)
		    .aString3993
		    = null;
	}
    }
    
    void method17784(Class89 class89, int i) {
	int i_61_ = aClass8_11423.anInt44 * -267726731;
	int i_62_ = aClass8_11424.anInt44 * -267726731;
	if (0 != i_61_ || 0 != i_62_) {
	    int i_63_ = class89.method1902() / 2;
	    class89.method1927(0, -i_63_, 0);
	    class89.method1980(i_61_ & 0x3fff);
	    class89.method1870(i_62_ & 0x3fff);
	    class89.method1927(0, i_63_, 0);
	}
    }
    
    void method17785(Class103 class103, Class554 class554, int i, int i_64_,
		     int i_65_, int i_66_, int i_67_) {
	for (int i_68_ = 0; i_68_ < aClass244Array11404.length; i_68_++) {
	    byte i_69_ = 0;
	    if (i_68_ == 0)
		i_69_ = (byte) 2;
	    else if (i_68_ == 1)
		i_69_ = (byte) 5;
	    else if (2 == i_68_)
		i_69_ = (byte) 1;
	    else if (3 == i_68_)
		i_69_ = (byte) 7;
	    else if (i_68_ == 4)
		i_69_ = (byte) 8;
	    RSGraphics class244 = aClass244Array11404[i_68_];
	    if (-1 != class244.graphicsID * 1967872619
		&& !class244.aClass409_3935.method7349(72338195)) {
		GraphicsDefinition class460
		    = Class240.graphicsDefLoader.getGraphicsDefinition((1967872619
							   * (class244
							      .graphicsID)),
							  1232200923);
		int i_70_ = i;
		if (class244.anInt3937 * 1689379261 != 0)
		    i_70_ |= 0x5;
		if (1354070187 * class244.height != 0)
		    i_70_ |= 0x2;
		if (class244.anInt3938 * 1812913109 >= 0)
		    i_70_ |= 0x7;
		if (class244.anInt3938 * 1812913109 >= 0
		    && class554.anIntArrayArray7231 != null
		    && null != (class554.anIntArrayArray7231
				[class244.anInt3938 * 1812913109])) {
		    Class89 class89
			= (aClass89Array11435[i_68_ + 1]
			   = class460.method10624(class103, i_70_,
						  class244.aClass409_3935,
						  i_69_, (byte) -88));
		    if (null != class89) {
			int i_71_ = 0;
			int i_72_ = 0;
			int i_73_ = 0;
			if (class554.anIntArrayArray7231 != null
			    && (class554.anIntArrayArray7231
				[1812913109 * class244.anInt3938]) != null) {
			    i_71_ += (class554.anIntArrayArray7231
				      [1812913109 * class244.anInt3938][0]);
			    i_72_ += (class554.anIntArrayArray7231
				      [class244.anInt3938 * 1812913109][1]);
			    i_73_ += (class554.anIntArrayArray7231
				      [class244.anInt3938 * 1812913109][2]);
			}
			if (class554.anIntArrayArray7203 != null
			    && (class554.anIntArrayArray7203
				[class244.anInt3938 * 1812913109]) != null) {
			    i_71_ += (class554.anIntArrayArray7203
				      [class244.anInt3938 * 1812913109][0]);
			    i_72_ += (class554.anIntArrayArray7203
				      [1812913109 * class244.anInt3938][1]);
			    i_73_ += (class554.anIntArrayArray7203
				      [1812913109 * class244.anInt3938][2]);
			}
			if (0 != i_73_ || 0 != i_71_) {
			    int i_74_ = i_66_;
			    if (null != anIntArray11418
				&& -1 != (anIntArray11418
					  [1812913109 * class244.anInt3938]))
				i_74_ = (anIntArray11418
					 [1812913109 * class244.anInt3938]);
			    int i_75_
				= ((i_74_ + class244.anInt3937 * -1894914048
				    - i_66_)
				   & 0x3fff);
			    if (0 != i_75_)
				class89.method1868(i_75_);
			    int i_76_ = Class282.anIntArray4430[i_75_];
			    int i_77_ = Class282.anIntArray4441[i_75_];
			    int i_78_ = i_73_ * i_76_ + i_77_ * i_71_ >> 14;
			    i_73_ = i_73_ * i_77_ - i_71_ * i_76_ >> 14;
			    i_71_ = i_78_;
			}
			class89.method1927(i_71_, i_72_, i_73_);
			if (0 != class244.height * 1354070187)
			    class89.method1927(0,
					       -(1354070187
						 * class244.height) << 2,
					       0);
		    }
		} else {
		    Class89 class89
			= (aClass89Array11435[1 + i_68_]
			   = (class460.method10610
			      (class103, i_70_,
			       -1894914048 * class244.anInt3937,
			       (-195854529
				* anInt11383),
			       (-192864185
				* anInt11384),
			       (anInt11385
				* -389722201),
			       class244.aClass409_3935, i_69_, (byte) 111)));
		    if (null != class89
			&& 0 != 1354070187 * class244.height)
			class89.method1927(0, -(1354070187
						* class244.height) << 2, 0);
		}
	    } else
		aClass89Array11435[1 + i_68_] = null;
	}
    }
    
    void method17786(int i, int i_79_, int i_80_, int i_81_, int i_82_,
		     int i_83_) {
	Class287 class287 = method10874().aClass287_4386;
	int i_84_ = aShort10717 + aShort10716 >> 1;
	int i_85_ = aShort10719 + aShort10718 >> 1;
	int i_86_ = Class282.anIntArray4430[i];
	int i_87_ = Class282.anIntArray4441[i];
	int i_88_ = -i_79_ / 2;
	int i_89_ = -i_80_ / 2;
	int i_90_ = i_86_ * i_89_ + i_87_ * i_88_ >> 14;
	int i_91_ = i_87_ * i_89_ - i_88_ * i_86_ >> 14;
	int i_92_ = Class9.method575(i_90_ + (int) class287.aFloat4477,
				     i_91_ + (int) class287.aFloat4479, i_84_,
				     i_85_, nodePlane, 2124644265);
	int i_93_ = i_79_ / 2;
	int i_94_ = -i_80_ / 2;
	int i_95_ = i_87_ * i_93_ + i_86_ * i_94_ >> 14;
	int i_96_ = i_94_ * i_87_ - i_93_ * i_86_ >> 14;
	int i_97_ = Class9.method575(i_95_ + (int) class287.aFloat4477,
				     (int) class287.aFloat4479 + i_96_, i_84_,
				     i_85_, nodePlane, 1906835568);
	int i_98_ = -i_79_ / 2;
	int i_99_ = i_80_ / 2;
	int i_100_ = i_99_ * i_86_ + i_87_ * i_98_ >> 14;
	int i_101_ = i_99_ * i_87_ - i_86_ * i_98_ >> 14;
	int i_102_ = Class9.method575(i_100_ + (int) class287.aFloat4477,
				      i_101_ + (int) class287.aFloat4479,
				      i_84_, i_85_, nodePlane, 2109690980);
	int i_103_ = i_79_ / 2;
	int i_104_ = i_80_ / 2;
	int i_105_ = i_86_ * i_104_ + i_87_ * i_103_ >> 14;
	int i_106_ = i_104_ * i_87_ - i_103_ * i_86_ >> 14;
	int i_107_ = Class9.method575((int) class287.aFloat4477 + i_105_,
				      i_106_ + (int) class287.aFloat4479,
				      i_84_, i_85_, nodePlane, 1899177294);
	int i_108_ = i_92_ < i_97_ ? i_92_ : i_97_;
	int i_109_ = i_102_ < i_107_ ? i_102_ : i_107_;
	int i_110_ = i_97_ < i_107_ ? i_97_ : i_107_;
	int i_111_ = i_92_ < i_102_ ? i_92_ : i_102_;
	anInt11383
	    = ((int) (Math.atan2((double) (i_108_ - i_109_), (double) i_80_)
		      * 2607.5945876176133)
	       & 0x3fff) * -799543105;
	anInt11384
	    = ((int) (Math.atan2((double) (i_111_ - i_110_), (double) i_79_)
		      * 2607.5945876176133)
	       & 0x3fff) * 44861815;
	if (0 != anInt11383 * -195854529
	    && 0 != i_81_) {
	    int i_112_ = 16384 - i_81_;
	    if (anInt11383 * -195854529
		> 8192) {
		if (-195854529 * anInt11383
		    < i_112_)
		    anInt11383
			= -799543105 * i_112_;
	    } else if (-195854529 * anInt11383
		       > i_81_)
		anInt11383
		    = -799543105 * i_81_;
	}
	if (0 != -192864185 * anInt11384
	    && i_82_ != 0) {
	    int i_113_ = 16384 - i_82_;
	    if (-192864185 * anInt11384
		> 8192) {
		if (-192864185 * anInt11384
		    < i_113_)
		    anInt11384
			= 44861815 * i_113_;
	    } else if (-192864185 * anInt11384
		       > i_82_)
		anInt11384 = i_82_ * 44861815;
	}
	anInt11385
	    = 1879468055 * (i_107_ + i_92_);
	if (i_97_ + i_102_
	    < anInt11385 * -389722201)
	    anInt11385
		= 1879468055 * (i_102_ + i_97_);
	anInt11385
	    = (1879468055
	       * ((anInt11385 * -389722201
		   >> 1)
		  - (int) class287.aFloat4474));
    }
    
    public Class554 method17787(int i) {
	int i_114_ = method17860((short) 9098);
	if (i_114_ == -1)
	    return Class539.aClass554_7000;
	return Class79.aClass539_1138.method11908(i_114_, -1187419179);
    }
    
    public final void method17788(int newGfxID, int settingsHash, int i_116_, int i_117_,
				  boolean bool, int typeID, int i_119_) {
		RSGraphics class244 = aClass244Array11404[typeID];
		int oldGfxID = 1967872619 * class244.graphicsID;
		if (-1 != newGfxID && oldGfxID != -1) {
		    if (oldGfxID == newGfxID) {
				GraphicsDefinition gfx = Class240.graphicsDefLoader.getGraphicsDefinition(newGfxID, 1232200923);
				if (gfx.aBool6277 && gfx.anInt6267 * 850723107 != -1) {
				    AnimationDefinition animation = Class394.animationDefLoader
				    		.getAnimationDefinition((gfx.anInt6267 * 850723107), (byte) -37);
				    int i_121_ = 1834456867 * animation.anInt7078;
				    if (0 == i_121_) {
				    	return;
				    }
				    if (i_121_ == 2) {
						class244.aClass409_3935.method7361((byte) 104);
						return;
				    }
				}
		    } else {
				GraphicsDefinition newGfx = Class240.graphicsDefLoader.getGraphicsDefinition(newGfxID, 1232200923);
				GraphicsDefinition oldGfx = Class240.graphicsDefLoader.getGraphicsDefinition(oldGfxID, 1232200923);
				if (-1 != 850723107 * newGfx.anInt6267 && -1 != oldGfx.anInt6267 * 850723107) {
				    AnimationDefinition newAnim
						= Class394.animationDefLoader.getAnimationDefinition((850723107 * newGfx.anInt6267), (byte) -67);
				    AnimationDefinition oldAnim
						= Class394.animationDefLoader.getAnimationDefinition((850723107 * oldGfx.anInt6267), (byte) -18);
				    if (-397642129 * newAnim.anInt7076 < -397642129 * oldAnim.anInt7076) {
				    	return;
				    }
				}
		    }
		}
		int i_124_ = 0;
		if (-1 != newGfxID && !Class240.graphicsDefLoader.getGraphicsDefinition(newGfxID, 1232200923).aBool6277) {
		    i_124_ = 2;
		}
		if (newGfxID != -1 && bool) {
		    i_124_ = 1;
		}
		class244.graphicsID = -1386773949 * newGfxID;
		class244.anInt3938 = i_117_ * -471497347;
		class244.height = -179650045 * (settingsHash >> 16);
		class244.anInt3937 = i_116_ * 1528521109;
		class244.aClass409_3935.method7351(-1 != newGfxID ? 
				(Class240.graphicsDefLoader.getGraphicsDefinition(newGfxID, 1232200923).anInt6267 * 850723107) 
				: -1,
				settingsHash & 0xffff, i_124_, false, -1302211377);
    }
    
    public final void setHitMark/*method17789*/(int hitMarkID, int damage, int soakingMark, int soakingDamange,
				  int i_128_, int delay, int i_130_) {
		boolean bool = true;
		boolean bool_131_ = true;
		for (int i_132_ = 0; i_132_ < 941792245 * Class128.aClass513_1589.maxhitmarks; i_132_++) {
		    if (anIntArray11391[i_132_] > i_128_) {
		    	bool = false;
		    } else {
		    	bool_131_ = false;
		    }
		}
		int i_133_ = -1;
		int i_134_ = -1;
		int i_135_ = 0;
		if (hitMarkID >= 0) {
		    HitMarkType markType = Class633.hitMarkTypeList.list(hitMarkID, -1744861789);
		    i_134_ = 2105063269 * markType.anInt7285;
		    i_135_ = markType.anInt7292 * 699273815;
		}
		if (bool_131_) {
		    if (i_134_ == -1) {
		    	return;
		    }
		    i_133_ = 0;
		    int i_136_ = 0;
		    if (0 == i_134_) {
		    	i_136_ = anIntArray11391[0];
		    } else if (1 == i_134_) {
		    	i_136_ = anIntArray11372[0];
		    }
		    for (int i_137_ = 1; i_137_ < 941792245 * Class128.aClass513_1589.maxhitmarks; i_137_++) {
				if (0 == i_134_) {
				    if (anIntArray11391[i_137_] < i_136_) {
						i_133_ = i_137_;
						i_136_ = anIntArray11391[i_137_];
				    }
				} else if (1 == i_134_ && anIntArray11372[i_137_] < i_136_) {
				    i_133_ = i_137_;
				    i_136_ = anIntArray11372[i_137_];
				}
		    }
		    if (1 == i_134_ && i_136_ >= damage) {
		    	return;
		    }
		} else {
		    if (bool) {
		    	aByte11388 = (byte) 0;
		    }
		    for (int i_138_ = 0; i_138_ < Class128.aClass513_1589.maxhitmarks * 941792245; i_138_++) {
				int i_139_ = aByte11388;
				aByte11388 = (byte) ((1 + aByte11388)
					      % (Class128.aClass513_1589.maxhitmarks * 941792245));
				if (anIntArray11391[i_139_] <= i_128_) {
				    i_133_ = i_139_;
				    break;
				}
		    }
		}
		if (i_133_ >= 0) {
		    anIntArray11419[i_133_] = hitMarkID;
		    anIntArray11372[i_133_] = damage;
		    anIntArray11392[i_133_] = soakingMark;
		    anIntArray11393[i_133_] = soakingDamange;
		    anIntArray11391[i_133_] = i_128_ + i_135_ + delay;
		}
    }
    
    public int method17790() {
	return 150333555 * anInt11434;
    }
    
    public final void method17791(int i, int i_140_, int i_141_, int i_142_,
				  int i_143_, int i_144_, byte i_145_) {
	Class570 class570 = IncommingOpcode.aClass581_5298.method12748(i, -185165816);
	Class247_Sub4 class247_sub4 = null;
	Class247_Sub4 class247_sub4_146_ = null;
	int i_147_ = class570.anInt7351 * 1547033475;
	int i_148_ = 0;
	for (Class247_Sub4 class247_sub4_149_
		 = (Class247_Sub4) aClass421_11394.method7525(-524910266);
	     class247_sub4_149_ != null;
	     class247_sub4_149_
		 = (Class247_Sub4) aClass421_11394.method7526(461382093)) {
	    i_148_++;
	    if (class570 == class247_sub4_149_.aClass570_10180) {
		class247_sub4_149_.method16472(i_142_ + i_140_, i_143_, i_144_,
					       i_141_, 2145187891);
		return;
	    }
	    if (794040447 * class247_sub4_149_.aClass570_10180.anInt7357
		<= 794040447 * class570.anInt7357)
		class247_sub4 = class247_sub4_149_;
	    if (1547033475 * class247_sub4_149_.aClass570_10180.anInt7351
		> i_147_) {
		class247_sub4_146_ = class247_sub4_149_;
		i_147_ = (1547033475
			  * class247_sub4_149_.aClass570_10180.anInt7351);
	    }
	}
	if (null != class247_sub4_146_
	    || i_148_ < -22384479 * Class128.aClass513_1589.anInt6708) {
	    Class247_Sub4 class247_sub4_150_ = new Class247_Sub4(class570);
	    if (null == class247_sub4)
		aClass421_11394.method7520(class247_sub4_150_, 1268787635);
	    else
		Class615.method13260(class247_sub4_150_, class247_sub4,
				     205022612);
	    class247_sub4_150_.method16472(i_140_ + i_142_, i_143_, i_144_,
					   i_141_, 2112182585);
	    if (i_148_ >= -22384479 * Class128.aClass513_1589.anInt6708)
		class247_sub4_146_.method4944((byte) -39);
	}
    }
    
    public abstract Class249 method17792(int i);
    
    void method17793(Class103 class103, Class89[] class89s, Class266 class266,
		     boolean bool) {
	if (!bool) {
	    int i = 0;
	    int i_151_ = 0;
	    int i_152_ = 0;
	    int i_153_ = 0;
	    int i_154_ = -1;
	    int i_155_ = -1;
	    Class106[][] class106s = new Class106[class89s.length][];
	    Class167[][] class167s = new Class167[class89s.length][];
	    for (int i_156_ = 0; i_156_ < class89s.length; i_156_++) {
		if (class89s[i_156_] != null) {
		    class89s[i_156_].method1915(class266);
		    class106s[i_156_] = class89s[i_156_].method2051();
		    class167s[i_156_] = class89s[i_156_].method1917();
		    if (null != class106s[i_156_]) {
			i_154_ = i_156_;
			i_151_++;
			i += class106s[i_156_].length;
		    }
		    if (class167s[i_156_] != null) {
			i_155_ = i_156_;
			i_153_++;
			i_152_ += class167s[i_156_].length;
		    }
		}
	    }
	    if ((null == aClass489_11420
		 || aClass489_11420.aBool6487)
		&& (i_151_ > 0 || i_153_ > 0))
		aClass489_11420
		    = Class489.method11182(client.anInt8296, true);
	    if (aClass489_11420 != null) {
		Object object = null;
		Class106[] class106s_157_;
		if (i_151_ == 1)
		    class106s_157_ = class106s[i_154_];
		else {
		    class106s_157_ = new Class106[i];
		    int i_158_ = 0;
		    for (int i_159_ = 0; i_159_ < class89s.length; i_159_++) {
			if (class106s[i_159_] != null) {
			    System.arraycopy(class106s[i_159_], 0,
					     class106s_157_, i_158_,
					     class106s[i_159_].length);
			    i_158_ += class106s[i_159_].length;
			}
		    }
		}
		Object object_160_ = null;
		Class167[] class167s_161_;
		if (1 == i_153_)
		    class167s_161_ = class167s[i_155_];
		else {
		    class167s_161_ = new Class167[i_152_];
		    int i_162_ = 0;
		    for (int i_163_ = 0; i_163_ < class89s.length; i_163_++) {
			if (null != class167s[i_163_]) {
			    System.arraycopy(class167s[i_163_], 0,
					     class167s_161_, i_162_,
					     class167s[i_163_].length);
			    i_162_ += class167s[i_163_].length;
			}
		    }
		}
		aClass489_11420.method11158
		    (class103, (long) client.anInt8296, class106s_157_,
		     class167s_161_, false);
		aBool11433 = true;
	    }
	} else if (aClass489_11420 != null)
	    aClass489_11420
		.method11157((long) client.anInt8296);
	if (null != aClass489_11420)
	    aClass489_11420.method11162
		(nodePlane, aShort10717, aShort10716, aShort10718,
		 aShort10719);
    }
    
    public void method17794(int i, int i_164_) {
	if (480043659 * anInt11439
	    != anInt11390 * 673303253)
	    method17797(-288700755);
	anInt11439 = i * -486869725;
    }
    
    boolean method17795(byte i) {
	if (anInt11439 * 480043659 == -1)
	    return false;
	return method17796((480043659
			    * anInt11439),
			   -1176917509);
    }
    
    boolean method17796(int i, int i_165_) {
	if (i == 673303253 * anInt11390)
	    return true;
	aClass35_11437 = Class551.method12094(i, null, null, true, (byte) -16);
	if (null == aClass35_11437)
	    return false;
	anInt11390 = 1917787773 * i;
	Class64.method1626(aClass35_11437.components, 503125623);
	return true;
    }
    
    void method17797(int i) {
	if (anInt11390 * 673303253 != -1) {
	    IsaacCipher.method7509(anInt11390 * 673303253, 1622204384);
	    aClass35_11437 = null;
	    anInt11390 = -1917787773;
	}
    }
    
    boolean method14467() {
	return aBool11432;
    }
    
    public void method17798(int i, int i_166_, int i_167_, int i_168_,
			    int i_169_, int i_170_, int i_171_, int i_172_) {
	if (!method17795((byte) 127)) {
	    if (i != -1)
		client.aBoolArray8523[i] = true;
	    else {
		for (int i_173_ = 0; i_173_ < 108; i_173_++)
		    client.aBoolArray8523[i_173_] = true;
	    }
	} else
	    Class64.method1632(aClass35_11437.method995(-2108231844), -1,
			       i_166_, i_167_, i_168_, i_169_, i_170_, i_171_,
			       i, false, -2081228824);
    }
    
    public abstract int method17799(int i);
    
    public abstract boolean method17800();
    
    public GameScene method17801(int i) {
	Class287 class287 = method10874().aClass287_4386;
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	int i_174_ = (class522.baseX * 127679513
		      + ((int) class287.aFloat4477 >> 9));
	int i_175_ = (468558693 * class522.baseY
		      + ((int) class287.aFloat4479 >> 9));
	return new GameScene(nodePlane, i_174_, i_175_);
    }
    
    public abstract boolean method17802();
    
    Entity(Class552 class552, int maxSteps,
			    VarTypeList class199_sub2) {
	super(class552, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
	anInt11377 = 1927053312;
	anInt11378 = -1352957952;
	aBool11379 = true;
	anInt11380 = 0;
	anInt11381 = -300578563;
	anInt11382 = 0;
	anInt11399 = 0;
	aByte11388 = (byte) 0;
	anIntArray11419 = new int[941792245 * Class128.aClass513_1589.maxhitmarks];
	anIntArray11372 = new int[941792245 * Class128.aClass513_1589.maxhitmarks];
	anIntArray11391 = new int[941792245 * Class128.aClass513_1589.maxhitmarks];
	anIntArray11392 = new int[Class128.aClass513_1589.maxhitmarks * 941792245];
	anIntArray11393 = new int[941792245 * Class128.aClass513_1589.maxhitmarks];
	aClass421_11394 = new Class421();
	facingEntity = -1027225177;
	anIntArray11397 = null;
	aClass409_Sub1_11405 = new Class409_Sub1(this, false);
	aClass409_11375 = new Class409_Sub3(this, false);
	anInt11408 = 1558068143;
	anInt11389 = 960497231;
	aByte11413 = (byte) 0;
	anInt11414 = -101552021;
	anInt11438 = 0;
	anInt11410 = 0;
	anInt11436 = 0;
	anInt11400 = 44606208;
	aClass8_11406 = new Class8();
	aClass8_11423 = new Class8();
	aClass8_11424 = new Class8();
	queuedStepCount = 0;
	anInt11429 = 0;
	anInt11430 = 0;
	anInt11431 = 0;
	aBool11433 = false;
	aBool11432 = false;
	anInt11390 = -1917787773;
	anInt11439 = 486869725;
	anInterface12_11440 = new Class590(this);
	scenePositionXQueue = new int[maxSteps];
	scenePositionYQueue = new int[maxSteps];
	moveTypeQueue = new byte[maxSteps];
	aClass89Array11435 = new Class89[6];
	aClass244Array11404 = new RSGraphics[5];
	for (int i_176_ = 0; i_176_ < 5; i_176_++)
	    aClass244Array11404[i_176_] = new RSGraphics(this);
	aClass409_Sub3_Sub1Array11417
	    = (new Class409_Sub3_Sub1
	       [Class506.aClass504_6662.anIntArray6629.length]);
	anInterface46_11409 = new Class416(class199_sub2);
    }
    
    public Class554 method17803() {
	int i = method17860((short) 5694);
	if (i == -1)
	    return Class539.aClass554_7000;
	return Class79.aClass539_1138.method11908(i, -103425008);
    }
    
    public void method17804(int i, int i_177_) {
	Class554 class554 = method17787(375440662);
	if (0 != class554.anInt7236 * 1200428141
	    || 0 != -683062517 * anInt11400) {
	    aClass8_11406.method511(-729721480);
	    int i_178_ = i - -267726731 * aClass8_11406.anInt44 & 0x3fff;
	    if (i_178_ > 8192)
		anInt11421 = (-267726731 * aClass8_11406.anInt44
			      - (16384 - i_178_)) * -864231;
	    else
		anInt11421
		    = (aClass8_11406.anInt44 * -267726731 + i_178_) * -864231;
	}
    }
    
    void method17805() {
	if (null != aClass489_11420)
	    aClass489_11420.method11154();
    }
    
    void method17806() {
	if (null != aClass489_11420)
	    aClass489_11420.method11154();
    }
    
    public void method17807(int i) {
	if (480043659 * anInt11439
	    != anInt11390 * 673303253)
	    method17797(-950201465);
	anInt11439 = i * -486869725;
    }
    
    void method17808() {
	if (anInt11390 * 673303253 != -1) {
	    IsaacCipher.method7509(anInt11390 * 673303253, 855244558);
	    aClass35_11437 = null;
	    anInt11390 = -1917787773;
	}
    }
    
    boolean method14451() {
	return aBool11432;
    }
    
    public int method14492() {
	if (127430519 * anInt11377 == -32768)
	    return 0;
	return anInt11377 * 127430519;
    }
    
    public int method14471() {
	Class554 class554 = method17787(-1801490083);
	int i;
	if (-1 != 578957175 * class554.anInt7218)
	    i = 578957175 * class554.anInt7218;
	else if (453255417 * anInt11378
		 == -32768)
	    i = 200;
	else
	    i = -(anInt11378 * 453255417);
	Class276 class276 = method10874();
	int i_179_ = (int) class276.aClass287_4386.aFloat4477 >> 9;
	int i_180_ = (int) class276.aClass287_4386.aFloat4479 >> 9;
	if (null != aClass552_8744 && i_179_ >= 1 && i_180_ >= 1
	    && i_179_ <= client.aClass238_8477.method4744(-1627358491) - 1
	    && i_180_ <= client.aClass238_8477.method4745(284022043) - 1) {
	    Class548 class548 = (aClass552_8744.aClass548ArrayArrayArray7169
				 [nodePlane][i_179_][i_180_]);
	    if (class548 != null && class548.aClass475_Sub1_Sub4_7058 != null)
		return class548.aClass475_Sub1_Sub4_7058.aShort10742 + i;
	}
	return i;
    }
    
    public void method17809(int i) {
	Class554 class554 = method17787(-1404793207);
	if (0 != class554.anInt7236 * 1200428141
	    || 0 != -683062517 * anInt11400) {
	    aClass8_11406.method511(-789548733);
	    int i_181_ = i - -267726731 * aClass8_11406.anInt44 & 0x3fff;
	    if (i_181_ > 8192)
		anInt11421 = (-267726731 * aClass8_11406.anInt44
			      - (16384 - i_181_)) * -864231;
	    else
		anInt11421
		    = (aClass8_11406.anInt44 * -267726731 + i_181_) * -864231;
	}
    }
    
    public void method17810(int i) {
	Class554 class554 = method17787(-1182496874);
	if (0 != class554.anInt7236 * 1200428141
	    || 0 != -683062517 * anInt11400) {
	    aClass8_11406.method511(396972831);
	    int i_182_ = i - -267726731 * aClass8_11406.anInt44 & 0x3fff;
	    if (i_182_ > 8192)
		anInt11421 = (-267726731 * aClass8_11406.anInt44
			      - (16384 - i_182_)) * -864231;
	    else
		anInt11421
		    = (aClass8_11406.anInt44 * -267726731 + i_182_) * -864231;
	}
    }
    
    public void method17811(int i) {
	Class554 class554 = method17787(2031499384);
	if (0 != class554.anInt7236 * 1200428141
	    || 0 != -683062517 * anInt11400) {
	    aClass8_11406.method511(-192444759);
	    int i_183_ = i - -267726731 * aClass8_11406.anInt44 & 0x3fff;
	    if (i_183_ > 8192)
		anInt11421 = (-267726731 * aClass8_11406.anInt44
			      - (16384 - i_183_)) * -864231;
	    else
		anInt11421
		    = (aClass8_11406.anInt44 * -267726731 + i_183_) * -864231;
	}
    }
    
    public void method17001() {
	int i = ((150333555 * anInt11434 - 1
		  << 8)
		 + 240);
	Class287 class287 = method10874().aClass287_4386;
	aShort10717 = (short) ((int) class287.aFloat4477 - i >> 9);
	aShort10718 = (short) ((int) class287.aFloat4479 - i >> 9);
	aShort10716 = (short) ((int) class287.aFloat4477 + i >> 9);
	aShort10719 = (short) (i + (int) class287.aFloat4479 >> 9);
    }
    
    public void method17812(int i, boolean bool) {
	Class554 class554 = method17787(-1448644493);
	if (bool || 0 != 1200428141 * class554.anInt7236
	    || -683062517 * anInt11400 != 0) {
	    anInt11421 = (i & 0x3fff) * -864231;
	    aClass8_11406.method513(anInt11421 * 950504489, 1907433328);
	}
    }
    
    public int method17813() {
	Class554 class554 = method17787(236416887);
	int i = -267726731 * aClass8_11406.anInt44;
	boolean bool;
	if (class554.anInt7236 * 1200428141 != 0)
	    bool = aClass8_11406.method512(950504489 * anInt11421,
					   class554.anInt7236 * 1200428141,
					   -2026780165 * class554.anInt7245,
					   (byte) 0);
	else
	    bool = aClass8_11406.method512(950504489 * anInt11421,
					   -683062517 * anInt11400,
					   anInt11400 * -683062517, (byte) 0);
	int i_184_ = -267726731 * aClass8_11406.anInt44 - i;
	if (i_184_ != 0)
	    anInt11436 += 1840011673;
	else {
	    anInt11436 = 0;
	    aClass8_11406.method513(anInt11421 * 950504489, 1828510380);
	}
	if (bool) {
	    if (0 != 1613091999 * class554.anInt7238) {
		if (i_184_ > 0)
		    aClass8_11423.method512(-1037683113 * class554.anInt7240,
					    1613091999 * class554.anInt7238,
					    class554.anInt7239 * 1310754067,
					    (byte) 0);
		else
		    aClass8_11423.method512(-(class554.anInt7240
					      * -1037683113),
					    1613091999 * class554.anInt7238,
					    class554.anInt7239 * 1310754067,
					    (byte) 0);
	    }
	    if (class554.anInt7241 * -1341383275 != 0)
		aClass8_11424.method512(class554.anInt7202 * -1595752353,
					-1341383275 * class554.anInt7241,
					-1704966055 * class554.anInt7242,
					(byte) 0);
	} else {
	    if (0 != class554.anInt7238 * 1613091999)
		aClass8_11423.method512(0, class554.anInt7238 * 1613091999,
					1310754067 * class554.anInt7239,
					(byte) 0);
	    else
		aClass8_11423.method513(0, 1869271978);
	    if (0 != -1341383275 * class554.anInt7241)
		aClass8_11424.method512(0, -1341383275 * class554.anInt7241,
					-1704966055 * class554.anInt7242,
					(byte) 0);
	    else
		aClass8_11424.method513(0, 2082092934);
	}
	return i_184_;
    }
    
    public int method17814() {
	Class554 class554 = method17787(-732966879);
	int i = -267726731 * aClass8_11406.anInt44;
	boolean bool;
	if (class554.anInt7236 * 1200428141 != 0)
	    bool = aClass8_11406.method512(950504489 * anInt11421,
					   class554.anInt7236 * 1200428141,
					   -2026780165 * class554.anInt7245,
					   (byte) 0);
	else
	    bool = aClass8_11406.method512(950504489 * anInt11421,
					   -683062517 * anInt11400,
					   anInt11400 * -683062517, (byte) 0);
	int i_185_ = -267726731 * aClass8_11406.anInt44 - i;
	if (i_185_ != 0)
	    anInt11436 += 1840011673;
	else {
	    anInt11436 = 0;
	    aClass8_11406.method513(anInt11421 * 950504489, 1912798536);
	}
	if (bool) {
	    if (0 != 1613091999 * class554.anInt7238) {
		if (i_185_ > 0)
		    aClass8_11423.method512(-1037683113 * class554.anInt7240,
					    1613091999 * class554.anInt7238,
					    class554.anInt7239 * 1310754067,
					    (byte) 0);
		else
		    aClass8_11423.method512(-(class554.anInt7240
					      * -1037683113),
					    1613091999 * class554.anInt7238,
					    class554.anInt7239 * 1310754067,
					    (byte) 0);
	    }
	    if (class554.anInt7241 * -1341383275 != 0)
		aClass8_11424.method512(class554.anInt7202 * -1595752353,
					-1341383275 * class554.anInt7241,
					-1704966055 * class554.anInt7242,
					(byte) 0);
	} else {
	    if (0 != class554.anInt7238 * 1613091999)
		aClass8_11423.method512(0, class554.anInt7238 * 1613091999,
					1310754067 * class554.anInt7239,
					(byte) 0);
	    else
		aClass8_11423.method513(0, 2017143710);
	    if (0 != -1341383275 * class554.anInt7241)
		aClass8_11424.method512(0, -1341383275 * class554.anInt7241,
					-1704966055 * class554.anInt7242,
					(byte) 0);
	    else
		aClass8_11424.method513(0, 2124823205);
	}
	return i_185_;
    }
    
    public void method17815(int[] is, int[] is_186_) {
	if (anIntArray11415 == null && null != is)
	    anIntArray11415
		= new int[Class506.aClass504_6662.anIntArray6629.length];
	else if (null == is) {
	    anIntArray11415 = null;
	    return;
	}
	for (int i = 0; i < anIntArray11415.length; i++)
	    anIntArray11415[i] = -1;
	for (int i = 0; i < is.length; i++) {
	    int i_187_ = is_186_[i];
	    int i_188_ = 0;
	    while (i_188_ < anIntArray11415.length) {
		if ((i_187_ & 0x1) != 0)
		    anIntArray11415[i_188_] = is[i];
		i_188_++;
		i_187_ >>= 1;
	    }
	}
    }
    
    public abstract Class249 method17816();
    
    public boolean method17817(int i, int i_189_) {
	if (anIntArray11418 == null) {
	    if (-1 == i_189_)
		return true;
	    anIntArray11418
		= new int[Class506.aClass504_6662.anIntArray6629.length];
	    for (int i_190_ = 0;
		 i_190_ < Class506.aClass504_6662.anIntArray6629.length;
		 i_190_++)
		anIntArray11418[i_190_] = -1;
	}
	Class554 class554 = method17787(-1154098886);
	int i_191_ = 256;
	if (null != class554.anIntArray7234 && class554.anIntArray7234[i] > 0)
	    i_191_ = class554.anIntArray7234[i];
	if (-1 == i_189_) {
	    if (anIntArray11418[i] == -1)
		return true;
	    int i_192_ = aClass8_11406.method514((byte) -104);
	    int i_193_ = anIntArray11418[i];
	    int i_194_ = i_192_ - i_193_;
	    if (i_194_ >= -i_191_ && i_194_ <= i_191_) {
		anIntArray11418[i] = -1;
		for (int i_195_ = 0;
		     i_195_ < Class506.aClass504_6662.anIntArray6629.length;
		     i_195_++) {
		    if (-1 != anIntArray11418[i_195_])
			return true;
		}
		anIntArray11418 = null;
		return true;
	    }
	    if (i_194_ > 0 && i_194_ <= 8192 || i_194_ <= -8192)
		anIntArray11418[i] = i_193_ + i_191_ & 0x3fff;
	    else
		anIntArray11418[i] = i_193_ - i_191_ & 0x3fff;
	    return false;
	}
	if (anIntArray11418[i] == -1)
	    anIntArray11418[i] = aClass8_11406.method514((byte) -2);
	int i_196_ = anIntArray11418[i];
	int i_197_ = i_189_ - i_196_;
	if (i_197_ >= -i_191_ && i_197_ <= i_191_) {
	    anIntArray11418[i] = i_189_;
	    return true;
	}
	if (i_197_ > 0 && i_197_ <= 8192 || i_197_ <= -8192)
	    anIntArray11418[i] = i_191_ + i_196_ & 0x3fff;
	else
	    anIntArray11418[i] = i_196_ - i_191_ & 0x3fff;
	return false;
    }
    
    public boolean method17818(int i, int i_198_) {
	if (anIntArray11418 == null) {
	    if (-1 == i_198_)
		return true;
	    anIntArray11418
		= new int[Class506.aClass504_6662.anIntArray6629.length];
	    for (int i_199_ = 0;
		 i_199_ < Class506.aClass504_6662.anIntArray6629.length;
		 i_199_++)
		anIntArray11418[i_199_] = -1;
	}
	Class554 class554 = method17787(-548360548);
	int i_200_ = 256;
	if (null != class554.anIntArray7234 && class554.anIntArray7234[i] > 0)
	    i_200_ = class554.anIntArray7234[i];
	if (-1 == i_198_) {
	    if (anIntArray11418[i] == -1)
		return true;
	    int i_201_ = aClass8_11406.method514((byte) 1);
	    int i_202_ = anIntArray11418[i];
	    int i_203_ = i_201_ - i_202_;
	    if (i_203_ >= -i_200_ && i_203_ <= i_200_) {
		anIntArray11418[i] = -1;
		for (int i_204_ = 0;
		     i_204_ < Class506.aClass504_6662.anIntArray6629.length;
		     i_204_++) {
		    if (-1 != anIntArray11418[i_204_])
			return true;
		}
		anIntArray11418 = null;
		return true;
	    }
	    if (i_203_ > 0 && i_203_ <= 8192 || i_203_ <= -8192)
		anIntArray11418[i] = i_202_ + i_200_ & 0x3fff;
	    else
		anIntArray11418[i] = i_202_ - i_200_ & 0x3fff;
	    return false;
	}
	if (anIntArray11418[i] == -1)
	    anIntArray11418[i] = aClass8_11406.method514((byte) -26);
	int i_205_ = anIntArray11418[i];
	int i_206_ = i_198_ - i_205_;
	if (i_206_ >= -i_200_ && i_206_ <= i_200_) {
	    anIntArray11418[i] = i_198_;
	    return true;
	}
	if (i_206_ > 0 && i_206_ <= 8192 || i_206_ <= -8192)
	    anIntArray11418[i] = i_200_ + i_205_ & 0x3fff;
	else
	    anIntArray11418[i] = i_205_ - i_200_ & 0x3fff;
	return false;
    }
    
    public int method14468(byte i) {
	if (127430519 * anInt11377 == -32768)
	    return 0;
	return anInt11377 * 127430519;
    }
    
    void method17819(Class103 class103, Class89[] class89s, Class266 class266,
		     boolean bool) {
	if (!bool) {
	    int i = 0;
	    int i_207_ = 0;
	    int i_208_ = 0;
	    int i_209_ = 0;
	    int i_210_ = -1;
	    int i_211_ = -1;
	    Class106[][] class106s = new Class106[class89s.length][];
	    Class167[][] class167s = new Class167[class89s.length][];
	    for (int i_212_ = 0; i_212_ < class89s.length; i_212_++) {
		if (class89s[i_212_] != null) {
		    class89s[i_212_].method1915(class266);
		    class106s[i_212_] = class89s[i_212_].method2051();
		    class167s[i_212_] = class89s[i_212_].method1917();
		    if (null != class106s[i_212_]) {
			i_210_ = i_212_;
			i_207_++;
			i += class106s[i_212_].length;
		    }
		    if (class167s[i_212_] != null) {
			i_211_ = i_212_;
			i_209_++;
			i_208_ += class167s[i_212_].length;
		    }
		}
	    }
	    if ((null == aClass489_11420
		 || aClass489_11420.aBool6487)
		&& (i_207_ > 0 || i_209_ > 0))
		aClass489_11420
		    = Class489.method11182(client.anInt8296, true);
	    if (aClass489_11420 != null) {
		Object object = null;
		Class106[] class106s_213_;
		if (i_207_ == 1)
		    class106s_213_ = class106s[i_210_];
		else {
		    class106s_213_ = new Class106[i];
		    int i_214_ = 0;
		    for (int i_215_ = 0; i_215_ < class89s.length; i_215_++) {
			if (class106s[i_215_] != null) {
			    System.arraycopy(class106s[i_215_], 0,
					     class106s_213_, i_214_,
					     class106s[i_215_].length);
			    i_214_ += class106s[i_215_].length;
			}
		    }
		}
		Object object_216_ = null;
		Class167[] class167s_217_;
		if (1 == i_209_)
		    class167s_217_ = class167s[i_211_];
		else {
		    class167s_217_ = new Class167[i_208_];
		    int i_218_ = 0;
		    for (int i_219_ = 0; i_219_ < class89s.length; i_219_++) {
			if (null != class167s[i_219_]) {
			    System.arraycopy(class167s[i_219_], 0,
					     class167s_217_, i_218_,
					     class167s[i_219_].length);
			    i_218_ += class167s[i_219_].length;
			}
		    }
		}
		aClass489_11420.method11158
		    (class103, (long) client.anInt8296, class106s_213_,
		     class167s_217_, false);
		aBool11433 = true;
	    }
	} else if (aClass489_11420 != null)
	    aClass489_11420
		.method11157((long) client.anInt8296);
	if (null != aClass489_11420)
	    aClass489_11420.method11162
		(nodePlane, aShort10717, aShort10716, aShort10718,
		 aShort10719);
    }
    
    public void method16999(int i) {
	int i_220_
	    = ((150333555 * anInt11434 - 1
		<< 8)
	       + 240);
	Class287 class287 = method10874().aClass287_4386;
	aShort10717 = (short) ((int) class287.aFloat4477 - i_220_ >> 9);
	aShort10718 = (short) ((int) class287.aFloat4479 - i_220_ >> 9);
	aShort10716 = (short) ((int) class287.aFloat4477 + i_220_ >> 9);
	aShort10719 = (short) (i_220_ + (int) class287.aFloat4479 >> 9);
    }
    
    public void method17002() {
	int i = ((150333555 * anInt11434 - 1
		  << 8)
		 + 240);
	Class287 class287 = method10874().aClass287_4386;
	aShort10717 = (short) ((int) class287.aFloat4477 - i >> 9);
	aShort10718 = (short) ((int) class287.aFloat4479 - i >> 9);
	aShort10716 = (short) ((int) class287.aFloat4477 + i >> 9);
	aShort10719 = (short) (i + (int) class287.aFloat4479 >> 9);
    }
    
    public final void method17820(int i, int i_221_, int i_222_, int i_223_,
				  boolean bool, int i_224_) {
	RSGraphics class244 = aClass244Array11404[i_224_];
	int i_225_ = 1967872619 * class244.graphicsID;
	if (-1 != i && i_225_ != -1) {
	    if (i_225_ == i) {
		GraphicsDefinition class460
		    = Class240.graphicsDefLoader.getGraphicsDefinition(i, 1232200923);
		if (class460.aBool6277
		    && class460.anInt6267 * 850723107 != -1) {
		    AnimationDefinition class549
			= Class394.animationDefLoader.getAnimationDefinition(((class460
								.anInt6267)
							       * 850723107),
							      (byte) -110);
		    int i_226_ = 1834456867 * class549.anInt7078;
		    if (0 == i_226_)
			return;
		    if (i_226_ == 2) {
			class244.aClass409_3935.method7361((byte) 115);
			return;
		    }
		}
	    } else {
		GraphicsDefinition class460
		    = Class240.graphicsDefLoader.getGraphicsDefinition(i, 1232200923);
		GraphicsDefinition class460_227_
		    = Class240.graphicsDefLoader.getGraphicsDefinition(i_225_, 1232200923);
		if (-1 != 850723107 * class460.anInt6267
		    && -1 != class460_227_.anInt6267 * 850723107) {
		    AnimationDefinition class549
			= Class394.animationDefLoader.getAnimationDefinition((850723107
							       * (class460
								  .anInt6267)),
							      (byte) -49);
		    AnimationDefinition class549_228_
			= Class394.animationDefLoader.getAnimationDefinition((850723107
							       * (class460_227_
								  .anInt6267)),
							      (byte) -54);
		    if (-397642129 * class549.anInt7076
			< -397642129 * class549_228_.anInt7076)
			return;
		}
	    }
	}
	int i_229_ = 0;
	if (-1 != i
	    && !Class240.graphicsDefLoader.getGraphicsDefinition(i, 1232200923).aBool6277)
	    i_229_ = 2;
	if (i != -1 && bool)
	    i_229_ = 1;
	class244.graphicsID = -1386773949 * i;
	class244.anInt3938 = i_223_ * -471497347;
	class244.height = -179650045 * (i_221_ >> 16);
	class244.anInt3937 = i_222_ * 1528521109;
	class244.aClass409_3935.method7351(-1 != i ? ((Class240
							   .graphicsDefLoader
							   .getGraphicsDefinition
						       (i, 1232200923)
						       .anInt6267)
						      * 850723107) : -1,
					   i_221_ & 0xffff, i_229_, false,
					   -1302211377);
    }
    
    public final void method17821() {
	queuedStepCount = 0;
	anInt11430 = 0;
    }
    
    void method17822() {
	if (null != aClass489_11420)
	    aClass489_11420.method11154();
    }
    
    public final void method17823(int i, int i_230_, int i_231_, int i_232_,
				  int i_233_, int i_234_) {
	boolean bool = true;
	boolean bool_235_ = true;
	for (int i_236_ = 0;
	     i_236_ < 941792245 * Class128.aClass513_1589.maxhitmarks;
	     i_236_++) {
	    if (anIntArray11391[i_236_] > i_233_)
		bool = false;
	    else
		bool_235_ = false;
	}
	int i_237_ = -1;
	int i_238_ = -1;
	int i_239_ = 0;
	if (i >= 0) {
	    HitMarkType class560
		= Class633.hitMarkTypeList.list(i, -1804089451);
	    i_238_ = 2105063269 * class560.anInt7285;
	    i_239_ = class560.anInt7292 * 699273815;
	}
	if (bool_235_) {
	    if (i_238_ == -1)
		return;
	    i_237_ = 0;
	    int i_240_ = 0;
	    if (0 == i_238_)
		i_240_ = anIntArray11391[0];
	    else if (1 == i_238_)
		i_240_ = anIntArray11372[0];
	    for (int i_241_ = 1;
		 i_241_ < 941792245 * Class128.aClass513_1589.maxhitmarks;
		 i_241_++) {
		if (0 == i_238_) {
		    if (anIntArray11391[i_241_] < i_240_) {
			i_237_ = i_241_;
			i_240_ = anIntArray11391[i_241_];
		    }
		} else if (1 == i_238_ && anIntArray11372[i_241_] < i_240_) {
		    i_237_ = i_241_;
		    i_240_ = anIntArray11372[i_241_];
		}
	    }
	    if (1 == i_238_ && i_240_ >= i_230_)
		return;
	} else {
	    if (bool)
		aByte11388 = (byte) 0;
	    for (int i_242_ = 0;
		 i_242_ < Class128.aClass513_1589.maxhitmarks * 941792245;
		 i_242_++) {
		int i_243_ = aByte11388;
		aByte11388
		    = (byte) ((1 + aByte11388)
			      % (Class128.aClass513_1589.maxhitmarks
				 * 941792245));
		if (anIntArray11391[i_243_] <= i_233_) {
		    i_237_ = i_243_;
		    break;
		}
	    }
	}
	if (i_237_ >= 0) {
	    anIntArray11419[i_237_] = i;
	    anIntArray11372[i_237_] = i_230_;
	    anIntArray11392[i_237_] = i_231_;
	    anIntArray11393[i_237_] = i_232_;
	    anIntArray11391[i_237_] = i_233_ + i_239_ + i_234_;
	}
    }
    
    public void method17824(int i, boolean bool) {
	Class554 class554 = method17787(1466235682);
	if (bool || 0 != 1200428141 * class554.anInt7236
	    || -683062517 * anInt11400 != 0) {
	    anInt11421 = (i & 0x3fff) * -864231;
	    aClass8_11406.method513(anInt11421 * 950504489, 1947637592);
	}
    }
    
    void method17825(Class89 class89) {
	int i = aClass8_11423.anInt44 * -267726731;
	int i_244_ = aClass8_11424.anInt44 * -267726731;
	if (0 != i || 0 != i_244_) {
	    int i_245_ = class89.method1902() / 2;
	    class89.method1927(0, -i_245_, 0);
	    class89.method1980(i & 0x3fff);
	    class89.method1870(i_244_ & 0x3fff);
	    class89.method1927(0, i_245_, 0);
	}
    }
    
    public final void method17826(int i) {
	Class570 class570
	    = IncommingOpcode.aClass581_5298.method12748(i, -1435017008);
	for (Class247_Sub4 class247_sub4
		 = (Class247_Sub4) aClass421_11394.method7525(-466729793);
	     null != class247_sub4;
	     class247_sub4
		 = (Class247_Sub4) aClass421_11394.method7526(-1415343689)) {
	    if (class247_sub4.aClass570_10180 == class570) {
		class247_sub4.method4944((byte) 33);
		break;
	    }
	}
    }
    
    public final void method17827(int i) {
	Class570 class570
	    = IncommingOpcode.aClass581_5298.method12748(i, -1793085717);
	for (Class247_Sub4 class247_sub4
		 = (Class247_Sub4) aClass421_11394.method7525(-1248489851);
	     null != class247_sub4;
	     class247_sub4
		 = (Class247_Sub4) aClass421_11394.method7526(-2124362680)) {
	    if (class247_sub4.aClass570_10180 == class570) {
		class247_sub4.method4944((byte) 24);
		break;
	    }
	}
    }
    
    public void method17828(int i) {
	anInt11434 = -2135229253 * i;
    }
    
    public int method17829() {
	return 150333555 * anInt11434;
    }
    
    public void method17830(int[] is, int[] is_246_) {
	if (anIntArray11415 == null && null != is)
	    anIntArray11415
		= new int[Class506.aClass504_6662.anIntArray6629.length];
	else if (null == is) {
	    anIntArray11415 = null;
	    return;
	}
	for (int i = 0; i < anIntArray11415.length; i++)
	    anIntArray11415[i] = -1;
	for (int i = 0; i < is.length; i++) {
	    int i_247_ = is_246_[i];
	    int i_248_ = 0;
	    while (i_248_ < anIntArray11415.length) {
		if ((i_247_ & 0x1) != 0)
		    anIntArray11415[i_248_] = is[i];
		i_248_++;
		i_247_ >>= 1;
	    }
	}
    }
    
    public void method17000() {
	int i = ((150333555 * anInt11434 - 1
		  << 8)
		 + 240);
	Class287 class287 = method10874().aClass287_4386;
	aShort10717 = (short) ((int) class287.aFloat4477 - i >> 9);
	aShort10718 = (short) ((int) class287.aFloat4479 - i >> 9);
	aShort10716 = (short) ((int) class287.aFloat4477 + i >> 9);
	aShort10719 = (short) (i + (int) class287.aFloat4479 >> 9);
    }
    
    public void method17831(int i, int i_249_, boolean bool, int i_250_) {
	if (method17795((byte) 100))
	    Class164.method3537(aClass35_11437.components, -1, i, i_249_,
				bool, -1846746862);
    }
    
    public abstract int method17832(int i);
    
    public final void method17833(int i, int i_251_, int i_252_, int i_253_,
				  int i_254_, int i_255_) {
	Class570 class570 = IncommingOpcode.aClass581_5298.method12748(i, -957109096);
	Class247_Sub4 class247_sub4 = null;
	Class247_Sub4 class247_sub4_256_ = null;
	int i_257_ = class570.anInt7351 * 1547033475;
	int i_258_ = 0;
	for (Class247_Sub4 class247_sub4_259_
		 = (Class247_Sub4) aClass421_11394.method7525(-230138113);
	     class247_sub4_259_ != null;
	     class247_sub4_259_
		 = (Class247_Sub4) aClass421_11394.method7526(1501245655)) {
	    i_258_++;
	    if (class570 == class247_sub4_259_.aClass570_10180) {
		class247_sub4_259_.method16472(i_253_ + i_251_, i_254_, i_255_,
					       i_252_, 2092998320);
		return;
	    }
	    if (794040447 * class247_sub4_259_.aClass570_10180.anInt7357
		<= 794040447 * class570.anInt7357)
		class247_sub4 = class247_sub4_259_;
	    if (1547033475 * class247_sub4_259_.aClass570_10180.anInt7351
		> i_257_) {
		class247_sub4_256_ = class247_sub4_259_;
		i_257_ = (1547033475
			  * class247_sub4_259_.aClass570_10180.anInt7351);
	    }
	}
	if (null != class247_sub4_256_
	    || i_258_ < -22384479 * Class128.aClass513_1589.anInt6708) {
	    Class247_Sub4 class247_sub4_260_ = new Class247_Sub4(class570);
	    if (null == class247_sub4)
		aClass421_11394.method7520(class247_sub4_260_, 1268787635);
	    else
		Class615.method13260(class247_sub4_260_, class247_sub4,
				     -1823135006);
	    class247_sub4_260_.method16472(i_251_ + i_253_, i_254_, i_255_,
					   i_252_, 2108012201);
	    if (i_258_ >= -22384479 * Class128.aClass513_1589.anInt6708)
		class247_sub4_256_.method4944((byte) 107);
	}
    }
    
    public final void method17834(int i, int i_261_, int i_262_, int i_263_,
				  int i_264_, int i_265_) {
	Class570 class570 = IncommingOpcode.aClass581_5298.method12748(i, -516086785);
	Class247_Sub4 class247_sub4 = null;
	Class247_Sub4 class247_sub4_266_ = null;
	int i_267_ = class570.anInt7351 * 1547033475;
	int i_268_ = 0;
	for (Class247_Sub4 class247_sub4_269_
		 = (Class247_Sub4) aClass421_11394.method7525(1543297538);
	     class247_sub4_269_ != null;
	     class247_sub4_269_
		 = (Class247_Sub4) aClass421_11394.method7526(1987111824)) {
	    i_268_++;
	    if (class570 == class247_sub4_269_.aClass570_10180) {
		class247_sub4_269_.method16472(i_263_ + i_261_, i_264_, i_265_,
					       i_262_, 2094262048);
		return;
	    }
	    if (794040447 * class247_sub4_269_.aClass570_10180.anInt7357
		<= 794040447 * class570.anInt7357)
		class247_sub4 = class247_sub4_269_;
	    if (1547033475 * class247_sub4_269_.aClass570_10180.anInt7351
		> i_267_) {
		class247_sub4_266_ = class247_sub4_269_;
		i_267_ = (1547033475
			  * class247_sub4_269_.aClass570_10180.anInt7351);
	    }
	}
	if (null != class247_sub4_266_
	    || i_268_ < -22384479 * Class128.aClass513_1589.anInt6708) {
	    Class247_Sub4 class247_sub4_270_ = new Class247_Sub4(class570);
	    if (null == class247_sub4)
		aClass421_11394.method7520(class247_sub4_270_, 1268787635);
	    else
		Class615.method13260(class247_sub4_270_, class247_sub4,
				     -1033798903);
	    class247_sub4_270_.method16472(i_261_ + i_263_, i_264_, i_265_,
					   i_262_, 2133582226);
	    if (i_268_ >= -22384479 * Class128.aClass513_1589.anInt6708)
		class247_sub4_266_.method4944((byte) -70);
	}
    }
    
    void method17835(Class89 class89) {
	int i = aClass8_11423.anInt44 * -267726731;
	int i_271_ = aClass8_11424.anInt44 * -267726731;
	if (0 != i || 0 != i_271_) {
	    int i_272_ = class89.method1902() / 2;
	    class89.method1927(0, -i_272_, 0);
	    class89.method1980(i & 0x3fff);
	    class89.method1870(i_271_ & 0x3fff);
	    class89.method1927(0, i_272_, 0);
	}
    }
    
    void method17836(Class103 class103, Class554 class554, int i, int i_273_,
		     int i_274_, int i_275_) {
	for (int i_276_ = 0; i_276_ < aClass244Array11404.length; i_276_++) {
	    byte i_277_ = 0;
	    if (i_276_ == 0)
		i_277_ = (byte) 2;
	    else if (i_276_ == 1)
		i_277_ = (byte) 5;
	    else if (2 == i_276_)
		i_277_ = (byte) 1;
	    else if (3 == i_276_)
		i_277_ = (byte) 7;
	    else if (i_276_ == 4)
		i_277_ = (byte) 8;
	    RSGraphics class244 = aClass244Array11404[i_276_];
	    if (-1 != class244.graphicsID * 1967872619
		&& !class244.aClass409_3935.method7349(-2019329204)) {
		GraphicsDefinition class460
		    = Class240.graphicsDefLoader.getGraphicsDefinition((1967872619
							   * (class244
							      .graphicsID)),
							  1232200923);
		int i_278_ = i;
		if (class244.anInt3937 * 1689379261 != 0)
		    i_278_ |= 0x5;
		if (1354070187 * class244.height != 0)
		    i_278_ |= 0x2;
		if (class244.anInt3938 * 1812913109 >= 0)
		    i_278_ |= 0x7;
		if (class244.anInt3938 * 1812913109 >= 0
		    && class554.anIntArrayArray7231 != null
		    && null != (class554.anIntArrayArray7231
				[class244.anInt3938 * 1812913109])) {
		    Class89 class89
			= (aClass89Array11435[i_276_ + 1]
			   = class460.method10624(class103, i_278_,
						  class244.aClass409_3935,
						  i_277_, (byte) -102));
		    if (null != class89) {
			int i_279_ = 0;
			int i_280_ = 0;
			int i_281_ = 0;
			if (class554.anIntArrayArray7231 != null
			    && (class554.anIntArrayArray7231
				[1812913109 * class244.anInt3938]) != null) {
			    i_279_ += (class554.anIntArrayArray7231
				       [1812913109 * class244.anInt3938][0]);
			    i_280_ += (class554.anIntArrayArray7231
				       [class244.anInt3938 * 1812913109][1]);
			    i_281_ += (class554.anIntArrayArray7231
				       [class244.anInt3938 * 1812913109][2]);
			}
			if (class554.anIntArrayArray7203 != null
			    && (class554.anIntArrayArray7203
				[class244.anInt3938 * 1812913109]) != null) {
			    i_279_ += (class554.anIntArrayArray7203
				       [class244.anInt3938 * 1812913109][0]);
			    i_280_ += (class554.anIntArrayArray7203
				       [1812913109 * class244.anInt3938][1]);
			    i_281_ += (class554.anIntArrayArray7203
				       [1812913109 * class244.anInt3938][2]);
			}
			if (0 != i_281_ || 0 != i_279_) {
			    int i_282_ = i_275_;
			    if (null != anIntArray11418
				&& -1 != (anIntArray11418
					  [1812913109 * class244.anInt3938]))
				i_282_ = (anIntArray11418
					  [1812913109 * class244.anInt3938]);
			    int i_283_
				= ((i_282_ + class244.anInt3937 * -1894914048
				    - i_275_)
				   & 0x3fff);
			    if (0 != i_283_)
				class89.method1868(i_283_);
			    int i_284_ = Class282.anIntArray4430[i_283_];
			    int i_285_ = Class282.anIntArray4441[i_283_];
			    int i_286_
				= i_281_ * i_284_ + i_285_ * i_279_ >> 14;
			    i_281_ = i_281_ * i_285_ - i_279_ * i_284_ >> 14;
			    i_279_ = i_286_;
			}
			class89.method1927(i_279_, i_280_, i_281_);
			if (0 != class244.height * 1354070187)
			    class89.method1927(0,
					       -(1354070187
						 * class244.height) << 2,
					       0);
		    }
		} else {
		    Class89 class89
			= (aClass89Array11435[1 + i_276_]
			   = (class460.method10610
			      (class103, i_278_,
			       -1894914048 * class244.anInt3937,
			       (-195854529
				* anInt11383),
			       (-192864185
				* anInt11384),
			       (anInt11385
				* -389722201),
			       class244.aClass409_3935, i_277_, (byte) 79)));
		    if (null != class89
			&& 0 != 1354070187 * class244.height)
			class89.method1927(0, -(1354070187
						* class244.height) << 2, 0);
		}
	    } else
		aClass89Array11435[1 + i_276_] = null;
	}
    }
    
    void method17837(Class103 class103, Class554 class554, int i, int i_287_,
		     int i_288_, int i_289_) {
	for (int i_290_ = 0; i_290_ < aClass244Array11404.length; i_290_++) {
	    byte i_291_ = 0;
	    if (i_290_ == 0)
		i_291_ = (byte) 2;
	    else if (i_290_ == 1)
		i_291_ = (byte) 5;
	    else if (2 == i_290_)
		i_291_ = (byte) 1;
	    else if (3 == i_290_)
		i_291_ = (byte) 7;
	    else if (i_290_ == 4)
		i_291_ = (byte) 8;
	    RSGraphics class244 = aClass244Array11404[i_290_];
	    if (-1 != class244.graphicsID * 1967872619
		&& !class244.aClass409_3935.method7349(-724058562)) {
		GraphicsDefinition class460
		    = Class240.graphicsDefLoader.getGraphicsDefinition((1967872619
							   * (class244
							      .graphicsID)),
							  1232200923);
		int i_292_ = i;
		if (class244.anInt3937 * 1689379261 != 0)
		    i_292_ |= 0x5;
		if (1354070187 * class244.height != 0)
		    i_292_ |= 0x2;
		if (class244.anInt3938 * 1812913109 >= 0)
		    i_292_ |= 0x7;
		if (class244.anInt3938 * 1812913109 >= 0
		    && class554.anIntArrayArray7231 != null
		    && null != (class554.anIntArrayArray7231
				[class244.anInt3938 * 1812913109])) {
		    Class89 class89
			= (aClass89Array11435[i_290_ + 1]
			   = class460.method10624(class103, i_292_,
						  class244.aClass409_3935,
						  i_291_, (byte) -123));
		    if (null != class89) {
			int i_293_ = 0;
			int i_294_ = 0;
			int i_295_ = 0;
			if (class554.anIntArrayArray7231 != null
			    && (class554.anIntArrayArray7231
				[1812913109 * class244.anInt3938]) != null) {
			    i_293_ += (class554.anIntArrayArray7231
				       [1812913109 * class244.anInt3938][0]);
			    i_294_ += (class554.anIntArrayArray7231
				       [class244.anInt3938 * 1812913109][1]);
			    i_295_ += (class554.anIntArrayArray7231
				       [class244.anInt3938 * 1812913109][2]);
			}
			if (class554.anIntArrayArray7203 != null
			    && (class554.anIntArrayArray7203
				[class244.anInt3938 * 1812913109]) != null) {
			    i_293_ += (class554.anIntArrayArray7203
				       [class244.anInt3938 * 1812913109][0]);
			    i_294_ += (class554.anIntArrayArray7203
				       [1812913109 * class244.anInt3938][1]);
			    i_295_ += (class554.anIntArrayArray7203
				       [1812913109 * class244.anInt3938][2]);
			}
			if (0 != i_295_ || 0 != i_293_) {
			    int i_296_ = i_289_;
			    if (null != anIntArray11418
				&& -1 != (anIntArray11418
					  [1812913109 * class244.anInt3938]))
				i_296_ = (anIntArray11418
					  [1812913109 * class244.anInt3938]);
			    int i_297_
				= ((i_296_ + class244.anInt3937 * -1894914048
				    - i_289_)
				   & 0x3fff);
			    if (0 != i_297_)
				class89.method1868(i_297_);
			    int i_298_ = Class282.anIntArray4430[i_297_];
			    int i_299_ = Class282.anIntArray4441[i_297_];
			    int i_300_
				= i_295_ * i_298_ + i_299_ * i_293_ >> 14;
			    i_295_ = i_295_ * i_299_ - i_293_ * i_298_ >> 14;
			    i_293_ = i_300_;
			}
			class89.method1927(i_293_, i_294_, i_295_);
			if (0 != class244.height * 1354070187)
			    class89.method1927(0,
					       -(1354070187
						 * class244.height) << 2,
					       0);
		    }
		} else {
		    Class89 class89
			= (aClass89Array11435[1 + i_290_]
			   = (class460.method10610
			      (class103, i_292_,
			       -1894914048 * class244.anInt3937,
			       (-195854529
				* anInt11383),
			       (-192864185
				* anInt11384),
			       (anInt11385
				* -389722201),
			       class244.aClass409_3935, i_291_, (byte) 91)));
		    if (null != class89
			&& 0 != 1354070187 * class244.height)
			class89.method1927(0, -(1354070187
						* class244.height) << 2, 0);
		}
	    } else
		aClass89Array11435[1 + i_290_] = null;
	}
    }
    
    void method17838(Class103 class103, Class554 class554, int i, int i_301_,
		     int i_302_, int i_303_) {
	for (int i_304_ = 0; i_304_ < aClass244Array11404.length; i_304_++) {
	    byte i_305_ = 0;
	    if (i_304_ == 0)
		i_305_ = (byte) 2;
	    else if (i_304_ == 1)
		i_305_ = (byte) 5;
	    else if (2 == i_304_)
		i_305_ = (byte) 1;
	    else if (3 == i_304_)
		i_305_ = (byte) 7;
	    else if (i_304_ == 4)
		i_305_ = (byte) 8;
	    RSGraphics class244 = aClass244Array11404[i_304_];
	    if (-1 != class244.graphicsID * 1967872619
		&& !class244.aClass409_3935.method7349(-732125079)) {
		GraphicsDefinition class460
		    = Class240.graphicsDefLoader.getGraphicsDefinition((1967872619
							   * (class244
							      .graphicsID)),
							  1232200923);
		int i_306_ = i;
		if (class244.anInt3937 * 1689379261 != 0)
		    i_306_ |= 0x5;
		if (1354070187 * class244.height != 0)
		    i_306_ |= 0x2;
		if (class244.anInt3938 * 1812913109 >= 0)
		    i_306_ |= 0x7;
		if (class244.anInt3938 * 1812913109 >= 0
		    && class554.anIntArrayArray7231 != null
		    && null != (class554.anIntArrayArray7231
				[class244.anInt3938 * 1812913109])) {
		    Class89 class89
			= (aClass89Array11435[i_304_ + 1]
			   = class460.method10624(class103, i_306_,
						  class244.aClass409_3935,
						  i_305_, (byte) -66));
		    if (null != class89) {
			int i_307_ = 0;
			int i_308_ = 0;
			int i_309_ = 0;
			if (class554.anIntArrayArray7231 != null
			    && (class554.anIntArrayArray7231
				[1812913109 * class244.anInt3938]) != null) {
			    i_307_ += (class554.anIntArrayArray7231
				       [1812913109 * class244.anInt3938][0]);
			    i_308_ += (class554.anIntArrayArray7231
				       [class244.anInt3938 * 1812913109][1]);
			    i_309_ += (class554.anIntArrayArray7231
				       [class244.anInt3938 * 1812913109][2]);
			}
			if (class554.anIntArrayArray7203 != null
			    && (class554.anIntArrayArray7203
				[class244.anInt3938 * 1812913109]) != null) {
			    i_307_ += (class554.anIntArrayArray7203
				       [class244.anInt3938 * 1812913109][0]);
			    i_308_ += (class554.anIntArrayArray7203
				       [1812913109 * class244.anInt3938][1]);
			    i_309_ += (class554.anIntArrayArray7203
				       [1812913109 * class244.anInt3938][2]);
			}
			if (0 != i_309_ || 0 != i_307_) {
			    int i_310_ = i_303_;
			    if (null != anIntArray11418
				&& -1 != (anIntArray11418
					  [1812913109 * class244.anInt3938]))
				i_310_ = (anIntArray11418
					  [1812913109 * class244.anInt3938]);
			    int i_311_
				= ((i_310_ + class244.anInt3937 * -1894914048
				    - i_303_)
				   & 0x3fff);
			    if (0 != i_311_)
				class89.method1868(i_311_);
			    int i_312_ = Class282.anIntArray4430[i_311_];
			    int i_313_ = Class282.anIntArray4441[i_311_];
			    int i_314_
				= i_309_ * i_312_ + i_313_ * i_307_ >> 14;
			    i_309_ = i_309_ * i_313_ - i_307_ * i_312_ >> 14;
			    i_307_ = i_314_;
			}
			class89.method1927(i_307_, i_308_, i_309_);
			if (0 != class244.height * 1354070187)
			    class89.method1927(0,
					       -(1354070187
						 * class244.height) << 2,
					       0);
		    }
		} else {
		    Class89 class89
			= (aClass89Array11435[1 + i_304_]
			   = (class460.method10610
			      (class103, i_306_,
			       -1894914048 * class244.anInt3937,
			       (-195854529
				* anInt11383),
			       (-192864185
				* anInt11384),
			       (anInt11385
				* -389722201),
			       class244.aClass409_3935, i_305_, (byte) 33)));
		    if (null != class89
			&& 0 != 1354070187 * class244.height)
			class89.method1927(0, -(1354070187
						* class244.height) << 2, 0);
		}
	    } else
		aClass89Array11435[1 + i_304_] = null;
	}
    }
    
    public Class241_Sub16 method17839(byte i) {
	Class287 class287 = method10874().aClass287_4386;
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	int i_315_
	    = (int) class287.aFloat4477 + class522.baseX * 947401216;
	int i_316_ = (int) class287.aFloat4474;
	int i_317_
	    = class522.baseY * -616117760 + (int) class287.aFloat4479;
	return new Class241_Sub16(nodePlane, i_315_, i_316_, i_317_);
    }
    
    public Class554 method17840() {
	int i = method17860((short) 27112);
	if (i == -1)
	    return Class539.aClass554_7000;
	return Class79.aClass539_1138.method11908(i, -592348873);
    }
    
    void method17841(int i, int i_318_, int i_319_, int i_320_, int i_321_) {
	Class287 class287 = method10874().aClass287_4386;
	int i_322_ = aShort10717 + aShort10716 >> 1;
	int i_323_ = aShort10719 + aShort10718 >> 1;
	int i_324_ = Class282.anIntArray4430[i];
	int i_325_ = Class282.anIntArray4441[i];
	int i_326_ = -i_318_ / 2;
	int i_327_ = -i_319_ / 2;
	int i_328_ = i_324_ * i_327_ + i_325_ * i_326_ >> 14;
	int i_329_ = i_325_ * i_327_ - i_326_ * i_324_ >> 14;
	int i_330_ = Class9.method575(i_328_ + (int) class287.aFloat4477,
				      i_329_ + (int) class287.aFloat4479,
				      i_322_, i_323_, nodePlane, 1907689401);
	int i_331_ = i_318_ / 2;
	int i_332_ = -i_319_ / 2;
	int i_333_ = i_325_ * i_331_ + i_324_ * i_332_ >> 14;
	int i_334_ = i_332_ * i_325_ - i_331_ * i_324_ >> 14;
	int i_335_ = Class9.method575(i_333_ + (int) class287.aFloat4477,
				      (int) class287.aFloat4479 + i_334_,
				      i_322_, i_323_, nodePlane, 2005238103);
	int i_336_ = -i_318_ / 2;
	int i_337_ = i_319_ / 2;
	int i_338_ = i_337_ * i_324_ + i_325_ * i_336_ >> 14;
	int i_339_ = i_337_ * i_325_ - i_324_ * i_336_ >> 14;
	int i_340_ = Class9.method575(i_338_ + (int) class287.aFloat4477,
				      i_339_ + (int) class287.aFloat4479,
				      i_322_, i_323_, nodePlane, 1852920337);
	int i_341_ = i_318_ / 2;
	int i_342_ = i_319_ / 2;
	int i_343_ = i_324_ * i_342_ + i_325_ * i_341_ >> 14;
	int i_344_ = i_342_ * i_325_ - i_341_ * i_324_ >> 14;
	int i_345_ = Class9.method575((int) class287.aFloat4477 + i_343_,
				      i_344_ + (int) class287.aFloat4479,
				      i_322_, i_323_, nodePlane, 2082115369);
	int i_346_ = i_330_ < i_335_ ? i_330_ : i_335_;
	int i_347_ = i_340_ < i_345_ ? i_340_ : i_345_;
	int i_348_ = i_335_ < i_345_ ? i_335_ : i_345_;
	int i_349_ = i_330_ < i_340_ ? i_330_ : i_340_;
	anInt11383
	    = ((int) (Math.atan2((double) (i_346_ - i_347_), (double) i_319_)
		      * 2607.5945876176133)
	       & 0x3fff) * -799543105;
	anInt11384
	    = ((int) (Math.atan2((double) (i_349_ - i_348_), (double) i_318_)
		      * 2607.5945876176133)
	       & 0x3fff) * 44861815;
	if (0 != anInt11383 * -195854529
	    && 0 != i_320_) {
	    int i_350_ = 16384 - i_320_;
	    if (anInt11383 * -195854529
		> 8192) {
		if (-195854529 * anInt11383
		    < i_350_)
		    anInt11383
			= -799543105 * i_350_;
	    } else if (-195854529 * anInt11383
		       > i_320_)
		anInt11383
		    = -799543105 * i_320_;
	}
	if (0 != -192864185 * anInt11384
	    && i_321_ != 0) {
	    int i_351_ = 16384 - i_321_;
	    if (-192864185 * anInt11384
		> 8192) {
		if (-192864185 * anInt11384
		    < i_351_)
		    anInt11384
			= 44861815 * i_351_;
	    } else if (-192864185 * anInt11384
		       > i_321_)
		anInt11384
		    = i_321_ * 44861815;
	}
	anInt11385
	    = 1879468055 * (i_345_ + i_330_);
	if (i_335_ + i_340_
	    < anInt11385 * -389722201)
	    anInt11385
		= 1879468055 * (i_340_ + i_335_);
	anInt11385
	    = (1879468055
	       * ((anInt11385 * -389722201
		   >> 1)
		  - (int) class287.aFloat4474));
    }
    
    public Class554 method17842() {
	int i = method17860((short) 21853);
	if (i == -1)
	    return Class539.aClass554_7000;
	return Class79.aClass539_1138.method11908(i, -939709751);
    }
    
    abstract int method17843();
    
    abstract int method17844();
    
    abstract int method17845();
    
    public void method17846() {
	if (null != aClass249_11387
	    && null != ((Class249) (((Entity) this)
				    .aClass249_11387)).aString3993) {
	    ((Class249) aClass249_11387)
		.anInt3995
		-= -1874326815;
	    if (0 == ((Class249) (((Entity) this)
				  .aClass249_11387)).anInt3995 * -1139099359)
		((Class249) aClass249_11387)
		    .aString3993
		    = null;
	}
    }
    
    public void method17847() {
	if (null != aClass249_11387
	    && null != ((Class249) (((Entity) this)
				    .aClass249_11387)).aString3993) {
	    ((Class249) aClass249_11387)
		.anInt3995
		-= -1874326815;
	    if (0 == ((Class249) (((Entity) this)
				  .aClass249_11387)).anInt3995 * -1139099359)
		((Class249) aClass249_11387)
		    .aString3993
		    = null;
	}
    }
    
    public void finalize() {
	if (null != aClass489_11420)
	    aClass489_11420.method11154();
    }
    
    boolean method14466() {
	return false;
    }
    
    public void method17848(int i) {
	if (480043659 * anInt11439
	    != anInt11390 * 673303253)
	    method17797(-1879143207);
	anInt11439 = i * -486869725;
    }
    
    public void method17849(String string, int i, int i_352_, int i_353_) {
	if (aClass249_11387 == null)
	    aClass249_11387 = new Class249();
	((Class249) aClass249_11387)
	    .aString3993
	    = string;
	((Class249) aClass249_11387).anInt3994
	    = i * -1989191185;
	((Class249) aClass249_11387).anInt3997
	    = -2030408275 * i_352_;
	((Class249) aClass249_11387).anInt3995
	    = (((Class249) aClass249_11387)
		   .anInt3996
	       = i_353_ * 51539173) * -2137161139;
    }
    
    public void method17850(String string, int i, int i_354_, int i_355_) {
	if (aClass249_11387 == null)
	    aClass249_11387 = new Class249();
	((Class249) aClass249_11387)
	    .aString3993
	    = string;
	((Class249) aClass249_11387).anInt3994
	    = i * -1989191185;
	((Class249) aClass249_11387).anInt3997
	    = -2030408275 * i_354_;
	((Class249) aClass249_11387).anInt3995
	    = (((Class249) aClass249_11387)
		   .anInt3996
	       = i_355_ * 51539173) * -2137161139;
    }
    
    public void method17851(String string, int i, int i_356_, int i_357_) {
	if (aClass249_11387 == null)
	    aClass249_11387 = new Class249();
	((Class249) aClass249_11387)
	    .aString3993
	    = string;
	((Class249) aClass249_11387).anInt3994
	    = i * -1989191185;
	((Class249) aClass249_11387).anInt3997
	    = -2030408275 * i_356_;
	((Class249) aClass249_11387).anInt3995
	    = (((Class249) aClass249_11387)
		   .anInt3996
	       = i_357_ * 51539173) * -2137161139;
    }
    
    public final void method17852(int i, int i_358_, int i_359_, int i_360_,
				  int i_361_, int i_362_) {
	boolean bool = true;
	boolean bool_363_ = true;
	for (int i_364_ = 0;
	     i_364_ < 941792245 * Class128.aClass513_1589.maxhitmarks;
	     i_364_++) {
	    if (anIntArray11391[i_364_] > i_361_)
		bool = false;
	    else
		bool_363_ = false;
	}
	int i_365_ = -1;
	int i_366_ = -1;
	int i_367_ = 0;
	if (i >= 0) {
	    HitMarkType class560
		= Class633.hitMarkTypeList.list(i, -1961215815);
	    i_366_ = 2105063269 * class560.anInt7285;
	    i_367_ = class560.anInt7292 * 699273815;
	}
	if (bool_363_) {
	    if (i_366_ == -1)
		return;
	    i_365_ = 0;
	    int i_368_ = 0;
	    if (0 == i_366_)
		i_368_ = anIntArray11391[0];
	    else if (1 == i_366_)
		i_368_ = anIntArray11372[0];
	    for (int i_369_ = 1;
		 i_369_ < 941792245 * Class128.aClass513_1589.maxhitmarks;
		 i_369_++) {
		if (0 == i_366_) {
		    if (anIntArray11391[i_369_] < i_368_) {
			i_365_ = i_369_;
			i_368_ = anIntArray11391[i_369_];
		    }
		} else if (1 == i_366_ && anIntArray11372[i_369_] < i_368_) {
		    i_365_ = i_369_;
		    i_368_ = anIntArray11372[i_369_];
		}
	    }
	    if (1 == i_366_ && i_368_ >= i_358_)
		return;
	} else {
	    if (bool)
		aByte11388 = (byte) 0;
	    for (int i_370_ = 0;
		 i_370_ < Class128.aClass513_1589.maxhitmarks * 941792245;
		 i_370_++) {
		int i_371_ = aByte11388;
		aByte11388
		    = (byte) ((1 + aByte11388)
			      % (Class128.aClass513_1589.maxhitmarks
				 * 941792245));
		if (anIntArray11391[i_371_] <= i_361_) {
		    i_365_ = i_371_;
		    break;
		}
	    }
	}
	if (i_365_ >= 0) {
	    anIntArray11419[i_365_] = i;
	    anIntArray11372[i_365_] = i_358_;
	    anIntArray11392[i_365_] = i_359_;
	    anIntArray11393[i_365_] = i_360_;
	    anIntArray11391[i_365_] = i_361_ + i_367_ + i_362_;
	}
    }
    
    public abstract boolean method17853(short i);
    
    boolean method17854() {
	if (anInt11439 * 480043659 == -1)
	    return false;
	return method17796((480043659
			    * anInt11439),
			   -521297671);
    }
    
    boolean method17855() {
	if (anInt11439 * 480043659 == -1)
	    return false;
	return method17796((480043659
			    * anInt11439),
			   -742372966);
    }
    
    boolean method17856() {
	if (anInt11439 * 480043659 == -1)
	    return false;
	return method17796((480043659
			    * anInt11439),
			   1702075476);
    }
    
    public void method17003() {
	int i = ((150333555 * anInt11434 - 1
		  << 8)
		 + 240);
	Class287 class287 = method10874().aClass287_4386;
	aShort10717 = (short) ((int) class287.aFloat4477 - i >> 9);
	aShort10718 = (short) ((int) class287.aFloat4479 - i >> 9);
	aShort10716 = (short) ((int) class287.aFloat4477 + i >> 9);
	aShort10719 = (short) (i + (int) class287.aFloat4479 >> 9);
    }
    
    boolean method17857(int i) {
	if (i == 673303253 * anInt11390)
	    return true;
	aClass35_11437 = Class551.method12094(i, null, null, true, (byte) -91);
	if (null == aClass35_11437)
	    return false;
	anInt11390 = 1917787773 * i;
	Class64.method1626(aClass35_11437.components, 503125623);
	return true;
    }
    
    void method17858() {
	if (anInt11390 * 673303253 != -1) {
	    IsaacCipher.method7509(anInt11390 * 673303253, 487924217);
	    aClass35_11437 = null;
	    anInt11390 = -1917787773;
	}
    }
    
    void method17859() {
	if (anInt11390 * 673303253 != -1) {
	    IsaacCipher.method7509(anInt11390 * 673303253, 1205066322);
	    aClass35_11437 = null;
	    anInt11390 = -1917787773;
	}
    }
    
    abstract int method17860(short i);
    
    void method17861() {
	if (anInt11390 * 673303253 != -1) {
	    IsaacCipher.method7509(anInt11390 * 673303253, 1167158366);
	    aClass35_11437 = null;
	    anInt11390 = -1917787773;
	}
    }
    
    public void method17862(int i, int i_372_, int i_373_, int i_374_,
			    int i_375_, int i_376_, int i_377_, int i_378_) {
	if (method17795((byte) 18))
	    client.method13623(aClass35_11437,
			       aClass35_11437.method995(346355450), -1, i,
			       i_372_, i_373_, i_374_, i_375_, i_376_, i_377_,
			       i_378_);
    }
    
    public void method17863(int i, int i_379_, int i_380_, int i_381_,
			    int i_382_, int i_383_, int i_384_) {
	if (!method17795((byte) 101)) {
	    if (i != -1)
		client.aBoolArray8523[i] = true;
	    else {
		for (int i_385_ = 0; i_385_ < 108; i_385_++)
		    client.aBoolArray8523[i_385_] = true;
	    }
	} else
	    Class64.method1632(aClass35_11437.method995(-1326604575), -1,
			       i_379_, i_380_, i_381_, i_382_, i_383_, i_384_,
			       i, false, -1579181196);
    }
    
    public void method17864(int i, int i_386_, boolean bool) {
	if (method17795((byte) 113))
	    Class164.method3537(aClass35_11437.components, -1, i, i_386_,
				bool, -1163229523);
    }
    
    public abstract int method17865();
    
    public Class241_Sub16 method17866() {
	Class287 class287 = method10874().aClass287_4386;
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	int i = (int) class287.aFloat4477 + class522.baseX * 947401216;
	int i_387_ = (int) class287.aFloat4474;
	int i_388_
	    = class522.baseY * -616117760 + (int) class287.aFloat4479;
	return new Class241_Sub16(nodePlane, i, i_387_, i_388_);
    }
    
    public abstract int method17867();
    
    public abstract Class249 method17868();
    
    void method17869(Class103 class103, Class89[] class89s, Class266 class266,
		     boolean bool) {
	if (!bool) {
	    int i = 0;
	    int i_389_ = 0;
	    int i_390_ = 0;
	    int i_391_ = 0;
	    int i_392_ = -1;
	    int i_393_ = -1;
	    Class106[][] class106s = new Class106[class89s.length][];
	    Class167[][] class167s = new Class167[class89s.length][];
	    for (int i_394_ = 0; i_394_ < class89s.length; i_394_++) {
		if (class89s[i_394_] != null) {
		    class89s[i_394_].method1915(class266);
		    class106s[i_394_] = class89s[i_394_].method2051();
		    class167s[i_394_] = class89s[i_394_].method1917();
		    if (null != class106s[i_394_]) {
			i_392_ = i_394_;
			i_389_++;
			i += class106s[i_394_].length;
		    }
		    if (class167s[i_394_] != null) {
			i_393_ = i_394_;
			i_391_++;
			i_390_ += class167s[i_394_].length;
		    }
		}
	    }
	    if ((null == aClass489_11420
		 || aClass489_11420.aBool6487)
		&& (i_389_ > 0 || i_391_ > 0))
		aClass489_11420
		    = Class489.method11182(client.anInt8296, true);
	    if (aClass489_11420 != null) {
		Object object = null;
		Class106[] class106s_395_;
		if (i_389_ == 1)
		    class106s_395_ = class106s[i_392_];
		else {
		    class106s_395_ = new Class106[i];
		    int i_396_ = 0;
		    for (int i_397_ = 0; i_397_ < class89s.length; i_397_++) {
			if (class106s[i_397_] != null) {
			    System.arraycopy(class106s[i_397_], 0,
					     class106s_395_, i_396_,
					     class106s[i_397_].length);
			    i_396_ += class106s[i_397_].length;
			}
		    }
		}
		Object object_398_ = null;
		Class167[] class167s_399_;
		if (1 == i_391_)
		    class167s_399_ = class167s[i_393_];
		else {
		    class167s_399_ = new Class167[i_390_];
		    int i_400_ = 0;
		    for (int i_401_ = 0; i_401_ < class89s.length; i_401_++) {
			if (null != class167s[i_401_]) {
			    System.arraycopy(class167s[i_401_], 0,
					     class167s_399_, i_400_,
					     class167s[i_401_].length);
			    i_400_ += class167s[i_401_].length;
			}
		    }
		}
		aClass489_11420.method11158
		    (class103, (long) client.anInt8296, class106s_395_,
		     class167s_399_, false);
		aBool11433 = true;
	    }
	} else if (aClass489_11420 != null)
	    aClass489_11420
		.method11157((long) client.anInt8296);
	if (null != aClass489_11420)
	    aClass489_11420.method11162
		(nodePlane, aShort10717, aShort10716, aShort10718,
		 aShort10719);
    }
    
    public static void method17870(Interface49 interface49, int i) {
	if (null == IcmpService_Sub1.anIcmpService_Sub1_8806)
	    throw new IllegalStateException("");
	((IcmpService_Sub1) IcmpService_Sub1.anIcmpService_Sub1_8806)
	    .aList8805.add(interface49);
    }
    
    static void setVarcString/*method17871*/(int id, String string, int i_402_) {
		Class241_Sub39_Sub13 class241_sub39_sub13 = NPC.method18030(2, (long) id);
		class241_sub39_sub13.method17279((byte) 0);
		((Class241_Sub39_Sub13) class241_sub39_sub13).aString10956 = string;
    }
}
