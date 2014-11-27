/* Class241_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub34 extends Node
{
    static HashTable aClass407_10083 = new HashTable(32);
    static Class129 aClass129_10084 = new Class129(11);
    int[] anIntArray10085 = { -1 };
    int[] anIntArray10086 = { 0 };
    static JS5 aClass210_10087;
    
    public static int method16344(int i, int i_0_, boolean bool) {
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool, 750089042);
	if (null == class241_sub34)
	    return -1;
	if (i_0_ < 0 || i_0_ >= (((Class241_Sub34) class241_sub34)
				 .anIntArray10085).length)
	    return -1;
	return ((Class241_Sub34) class241_sub34).anIntArray10085[i_0_];
    }
    
    long method16345(int[] is, int i, int[] is_1_, boolean bool, byte i_2_) {
	long[] ls = RSByteBuffer.aLongArray8800;
	long l = -1L;
	l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
	l = l >>> 8 ^ ls[(int) ((l ^ (long) i) & 0xffL)];
	for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_3_] >> 24)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_3_] >> 16)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_3_] >> 8)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) is[i_3_]) & 0xffL)];
	}
	if (is_1_ != null) {
	    for (int i_4_ = 0; i_4_ < 5; i_4_++)
		l = l >>> 8 ^ ls[(int) ((l ^ (long) is_1_[i_4_]) & 0xffL)];
	}
	l = l >>> 8 ^ ls[(int) ((l ^ (long) (bool ? 1 : 0)) & 0xffL)];
	return l;
    }
    
    final Class89 method16346(Class103 class103, int i, Class409 class409,
			      int i_5_, boolean bool, Class490 class490,
			      int i_6_) {
	Class89 class89 = null;
	int i_7_ = i;
	Class554 class554 = null;
	if (-1 != i_5_)
	    class554 = Class79.aClass539_1138.method11908(i_5_, -733067424);
	int[] is = ((Class241_Sub34) this).anIntArray10085;
	if (class554 != null && class554.anIntArray7209 != null) {
	    is = new int[class554.anIntArray7209.length];
	    for (int i_8_ = 0; i_8_ < class554.anIntArray7209.length; i_8_++) {
		int i_9_ = class554.anIntArray7209[i_8_];
		if (i_9_ >= 0
		    && i_9_ < ((Class241_Sub34) this).anIntArray10085.length)
		    is[i_8_] = ((Class241_Sub34) this).anIntArray10085[i_9_];
		else
		    is[i_8_] = -1;
	    }
	}
	if (null != class409)
	    i_7_ |= class409.method7356(534229394);
	long l = method16345(is, i_5_,
			     null != class490 ? class490.anIntArray6501 : null,
			     bool, (byte) 70);
	if (null != aClass129_10084)
	    class89 = (Class89) aClass129_10084.get(l);
	if (null == class89
	    || class103.method2301(class89.method1866(), i_7_) != 0) {
	    if (null != class89)
		i_7_ = class103.method2302(i_7_, class89.method1866());
	    int i_10_ = i_7_;
	    boolean bool_11_ = false;
	    for (int i_12_ = 0; i_12_ < is.length; i_12_++) {
		if (-1 != is[i_12_] && !JS5.itemDefLoader.list
					    (is[i_12_], (short) 3341)
					    .method13374(bool, null, (byte) 1))
		    bool_11_ = true;
	    }
	    if (bool_11_)
		return null;
	    Class161[] class161s = new Class161[is.length];
	    for (int i_13_ = 0; i_13_ < is.length; i_13_++) {
		if (is[i_13_] != -1)
		    class161s[i_13_]
			= JS5.itemDefLoader.list
			      (is[i_13_], (short) 6881)
			      .method13375(bool, null, -1466654145);
	    }
	    if (class554 != null && null != class554.anIntArrayArray7231) {
		for (int i_14_ = 0;
		     i_14_ < class554.anIntArrayArray7231.length; i_14_++) {
		    if (null != class554.anIntArrayArray7231[i_14_]
			&& null != class161s[i_14_]) {
			int i_15_ = class554.anIntArrayArray7231[i_14_][0];
			int i_16_ = class554.anIntArrayArray7231[i_14_][1];
			int i_17_ = class554.anIntArrayArray7231[i_14_][2];
			int i_18_ = class554.anIntArrayArray7231[i_14_][3];
			int i_19_ = class554.anIntArrayArray7231[i_14_][4];
			int i_20_ = class554.anIntArrayArray7231[i_14_][5];
			if (0 != i_18_ || i_19_ != 0 || i_20_ != 0)
			    class161s[i_14_].method3489(i_18_, i_19_, i_20_);
			if (0 != i_15_ || 0 != i_16_ || 0 != i_17_)
			    class161s[i_14_].method3459(i_15_, i_16_, i_17_);
		    }
		}
	    }
	    Class161 class161 = new Class161(class161s, class161s.length);
	    if (null != class490)
		i_10_ |= 0x4000;
	    class89
		= class103.method2356(class161, i_10_,
				      598746947 * Class63.anInt1032, 66, 855);
	    if (null != class490) {
		for (int i_21_ = 0; i_21_ < 10; i_21_++) {
		    for (int i_22_ = 0;
			 i_22_ < Class558.aShortArrayArray7261[i_21_].length;
			 i_22_++) {
			if (class490.anIntArray6501[i_21_]
			    < (Class561.aShortArrayArrayArray7298[i_21_]
			       [i_22_]).length)
			    class89.method1908
				(Class558.aShortArrayArray7261[i_21_][i_22_],
				 (Class561.aShortArrayArrayArray7298[i_21_]
				  [i_22_][class490.anIntArray6501[i_21_]]));
		    }
		}
	    }
	    if (null != aClass129_10084) {
		class89.method1928(i_7_);
		aClass129_10084.put(class89, l);
	    }
	}
	if (class409 == null)
	    return class89;
	Class89 class89_23_ = class89.method2019((byte) 1, i_7_, true);
	class409.method7357(class89_23_, 0, (byte) -42);
	return class89_23_;
    }
    
    public static int method16347(int i, int i_24_, boolean bool) {
	int i_25_ = 0;
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool, 1517328715);
	if (null == class241_sub34)
	    return 0;
	for (int i_26_ = 0;
	     i_26_ < ((Class241_Sub34) class241_sub34).anIntArray10085.length;
	     i_26_++) {
	    if (((Class241_Sub34) class241_sub34).anIntArray10085[i_26_] >= 0
		&& (JS5.itemDefLoader.list
		    (((Class241_Sub34) class241_sub34).anIntArray10085[i_26_],
		     (short) -7253)
		    .anInt7887) * 33836131 == i_24_)
		i_25_ += Class568.method12477(i, i_26_, bool, -766691635);
	}
	return i_25_;
    }
    
    public static int method16348(int i, int i_27_, boolean bool) {
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool, -707431771);
	if (null == class241_sub34)
	    return -1;
	if (i_27_ < 0 || i_27_ >= (((Class241_Sub34) class241_sub34)
				   .anIntArray10085).length)
	    return -1;
	return ((Class241_Sub34) class241_sub34).anIntArray10085[i_27_];
    }
    
    final Class89 method16349(Class103 class103, int i, Class409 class409,
			      int i_28_, boolean bool, Class490 class490) {
	Class89 class89 = null;
	int i_29_ = i;
	Class554 class554 = null;
	if (-1 != i_28_)
	    class554 = Class79.aClass539_1138.method11908(i_28_, -344619268);
	int[] is = ((Class241_Sub34) this).anIntArray10085;
	if (class554 != null && class554.anIntArray7209 != null) {
	    is = new int[class554.anIntArray7209.length];
	    for (int i_30_ = 0; i_30_ < class554.anIntArray7209.length;
		 i_30_++) {
		int i_31_ = class554.anIntArray7209[i_30_];
		if (i_31_ >= 0
		    && i_31_ < ((Class241_Sub34) this).anIntArray10085.length)
		    is[i_30_] = ((Class241_Sub34) this).anIntArray10085[i_31_];
		else
		    is[i_30_] = -1;
	    }
	}
	if (null != class409)
	    i_29_ |= class409.method7356(715449262);
	long l = method16345(is, i_28_,
			     null != class490 ? class490.anIntArray6501 : null,
			     bool, (byte) 102);
	if (null != aClass129_10084)
	    class89 = (Class89) aClass129_10084.get(l);
	if (null == class89
	    || class103.method2301(class89.method1866(), i_29_) != 0) {
	    if (null != class89)
		i_29_ = class103.method2302(i_29_, class89.method1866());
	    int i_32_ = i_29_;
	    boolean bool_33_ = false;
	    for (int i_34_ = 0; i_34_ < is.length; i_34_++) {
		if (-1 != is[i_34_] && !JS5.itemDefLoader.list
					    (is[i_34_], (short) 13410)
					    .method13374(bool, null, (byte) 1))
		    bool_33_ = true;
	    }
	    if (bool_33_)
		return null;
	    Class161[] class161s = new Class161[is.length];
	    for (int i_35_ = 0; i_35_ < is.length; i_35_++) {
		if (is[i_35_] != -1)
		    class161s[i_35_]
			= JS5.itemDefLoader.list
			      (is[i_35_], (short) 7596)
			      .method13375(bool, null, -1314313511);
	    }
	    if (class554 != null && null != class554.anIntArrayArray7231) {
		for (int i_36_ = 0;
		     i_36_ < class554.anIntArrayArray7231.length; i_36_++) {
		    if (null != class554.anIntArrayArray7231[i_36_]
			&& null != class161s[i_36_]) {
			int i_37_ = class554.anIntArrayArray7231[i_36_][0];
			int i_38_ = class554.anIntArrayArray7231[i_36_][1];
			int i_39_ = class554.anIntArrayArray7231[i_36_][2];
			int i_40_ = class554.anIntArrayArray7231[i_36_][3];
			int i_41_ = class554.anIntArrayArray7231[i_36_][4];
			int i_42_ = class554.anIntArrayArray7231[i_36_][5];
			if (0 != i_40_ || i_41_ != 0 || i_42_ != 0)
			    class161s[i_36_].method3489(i_40_, i_41_, i_42_);
			if (0 != i_37_ || 0 != i_38_ || 0 != i_39_)
			    class161s[i_36_].method3459(i_37_, i_38_, i_39_);
		    }
		}
	    }
	    Class161 class161 = new Class161(class161s, class161s.length);
	    if (null != class490)
		i_32_ |= 0x4000;
	    class89
		= class103.method2356(class161, i_32_,
				      598746947 * Class63.anInt1032, 66, 855);
	    if (null != class490) {
		for (int i_43_ = 0; i_43_ < 10; i_43_++) {
		    for (int i_44_ = 0;
			 i_44_ < Class558.aShortArrayArray7261[i_43_].length;
			 i_44_++) {
			if (class490.anIntArray6501[i_43_]
			    < (Class561.aShortArrayArrayArray7298[i_43_]
			       [i_44_]).length)
			    class89.method1908
				(Class558.aShortArrayArray7261[i_43_][i_44_],
				 (Class561.aShortArrayArrayArray7298[i_43_]
				  [i_44_][class490.anIntArray6501[i_43_]]));
		    }
		}
	    }
	    if (null != aClass129_10084) {
		class89.method1928(i_29_);
		aClass129_10084.put(class89, l);
	    }
	}
	if (class409 == null)
	    return class89;
	Class89 class89_45_ = class89.method2019((byte) 1, i_29_, true);
	class409.method7357(class89_45_, 0, (byte) -57);
	return class89_45_;
    }
    
    public static int method16350(int i, int i_46_, boolean bool) {
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool, -822178888);
	if (null == class241_sub34)
	    return 0;
	if (i_46_ < 0 || i_46_ >= (((Class241_Sub34) class241_sub34)
				   .anIntArray10086).length)
	    return 0;
	return ((Class241_Sub34) class241_sub34).anIntArray10086[i_46_];
    }
    
    public static int method16351(int i, int i_47_, boolean bool) {
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool, -286715401);
	if (null == class241_sub34)
	    return 0;
	if (i_47_ == -1)
	    return 0;
	int i_48_ = 0;
	for (int i_49_ = 0;
	     i_49_ < ((Class241_Sub34) class241_sub34).anIntArray10086.length;
	     i_49_++) {
	    if (((Class241_Sub34) class241_sub34).anIntArray10085[i_49_]
		== i_47_)
		i_48_ += (((Class241_Sub34) class241_sub34).anIntArray10086
			  [i_49_]);
	}
	return i_48_;
    }
    
    public static int method16352(int i, int i_50_, boolean bool) {
	int i_51_ = 0;
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool, 1570722180);
	if (null == class241_sub34)
	    return 0;
	for (int i_52_ = 0;
	     i_52_ < ((Class241_Sub34) class241_sub34).anIntArray10085.length;
	     i_52_++) {
	    if (((Class241_Sub34) class241_sub34).anIntArray10085[i_52_] >= 0
		&& (JS5.itemDefLoader.list
		    (((Class241_Sub34) class241_sub34).anIntArray10085[i_52_],
		     (short) -23331)
		    .anInt7887) * 33836131 == i_50_)
		i_51_ += Class568.method12477(i, i_52_, bool, -753124933);
	}
	return i_51_;
    }
    
    public static int method16353(int i, int i_53_, boolean bool) {
	int i_54_ = 0;
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool, -1020553908);
	if (null == class241_sub34)
	    return 0;
	for (int i_55_ = 0;
	     i_55_ < ((Class241_Sub34) class241_sub34).anIntArray10085.length;
	     i_55_++) {
	    if (((Class241_Sub34) class241_sub34).anIntArray10085[i_55_] >= 0
		&& (JS5.itemDefLoader.list
		    (((Class241_Sub34) class241_sub34).anIntArray10085[i_55_],
		     (short) -5360)
		    .anInt7887) * 33836131 == i_53_)
		i_54_ += Class568.method12477(i, i_55_, bool, -2135192464);
	}
	return i_54_;
    }
    
    Class241_Sub34() {
	/* empty */
    }
    
    public static int method16354(int i, int i_56_, boolean bool,
				  boolean bool_57_) {
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool_57_, -1850730726);
	if (null == class241_sub34)
	    return 0;
	int i_58_ = 0;
	for (int i_59_ = 0;
	     i_59_ < ((Class241_Sub34) class241_sub34).anIntArray10085.length;
	     i_59_++) {
	    if (((Class241_Sub34) class241_sub34).anIntArray10085[i_59_] >= 0
		&& (((Class241_Sub34) class241_sub34).anIntArray10085[i_59_]
		    < -345685855 * JS5.itemDefLoader.num)) {
		ItemDefinition class623
		    = JS5.itemDefLoader.list((((Class241_Sub34)
							    class241_sub34)
							   .anIntArray10085
							   [i_59_]),
							  (short) 13382);
		int i_60_
		    = class623.getParam(i_56_,
					   (Class621.paramTypeList.list
					    (i_56_, 1138942831)
					    .defaultint) * 2015998927,
					   1901010234);
		if (bool)
		    i_58_ += (((Class241_Sub34) class241_sub34).anIntArray10086
			      [i_59_]) * i_60_;
		else
		    i_58_ += i_60_;
	    }
	}
	return i_58_;
    }
    
    static void method16355() {
	aClass129_10084.reset(-1276456074);
    }
    
    public static int method16356(int i, boolean bool) {
	if (bool)
	    return 0;
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool, -1665743035);
	if (class241_sub34 == null)
	    return ((Class409.aClass617_5932.list(i, (byte) 123)
		     .size)
		    * 295370337);
	int i_61_ = 0;
	for (int i_62_ = 0;
	     i_62_ < ((Class241_Sub34) class241_sub34).anIntArray10085.length;
	     i_62_++) {
	    if (-1 == ((Class241_Sub34) class241_sub34).anIntArray10085[i_62_])
		i_61_++;
	}
	i_61_ += ((Class409.aClass617_5932.list(i, (byte) 43).size
		   * 295370337)
		  - ((Class241_Sub34) class241_sub34).anIntArray10085.length);
	return i_61_;
    }
    
    static Class241_Sub34 method16357(int i, boolean bool) {
	long l = (long) (i | (bool ? -2147483648 : 0));
	return (Class241_Sub34) aClass407_10083.get(l);
    }
    
    public static int method16358(int i, boolean bool) {
	if (bool)
	    return 0;
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool, -1820853347);
	if (class241_sub34 == null)
	    return ((Class409.aClass617_5932.list(i, (byte) 105)
		     .size)
		    * 295370337);
	int i_63_ = 0;
	for (int i_64_ = 0;
	     i_64_ < ((Class241_Sub34) class241_sub34).anIntArray10085.length;
	     i_64_++) {
	    if (-1 == ((Class241_Sub34) class241_sub34).anIntArray10085[i_64_])
		i_63_++;
	}
	i_63_
	    += ((Class409.aClass617_5932.list(i, (byte) 125).size
		 * 295370337)
		- ((Class241_Sub34) class241_sub34).anIntArray10085.length);
	return i_63_;
    }
    
    static Class241_Sub34 method16359(int i, boolean bool) {
	long l = (long) (i | (bool ? -2147483648 : 0));
	return (Class241_Sub34) aClass407_10083.get(l);
    }
    
    public static int method16360(int i, int i_65_, boolean bool,
				  boolean bool_66_) {
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool_66_, 495943828);
	if (null == class241_sub34)
	    return 0;
	int i_67_ = 0;
	for (int i_68_ = 0;
	     i_68_ < ((Class241_Sub34) class241_sub34).anIntArray10085.length;
	     i_68_++) {
	    if (((Class241_Sub34) class241_sub34).anIntArray10085[i_68_] >= 0
		&& (((Class241_Sub34) class241_sub34).anIntArray10085[i_68_]
		    < -345685855 * JS5.itemDefLoader.num)) {
		ItemDefinition class623
		    = JS5.itemDefLoader.list((((Class241_Sub34)
							    class241_sub34)
							   .anIntArray10085
							   [i_68_]),
							  (short) 3310);
		int i_69_
		    = class623.getParam(i_65_,
					   (Class621.paramTypeList.list
					    (i_65_, 177636633)
					    .defaultint) * 2015998927,
					   300581620);
		if (bool)
		    i_67_ += (((Class241_Sub34) class241_sub34).anIntArray10086
			      [i_68_]) * i_69_;
		else
		    i_67_ += i_69_;
	    }
	}
	return i_67_;
    }
    
    static void method16361(int i, int i_70_, int i_71_, int i_72_,
			    boolean bool) {
	long l = (long) (i | (bool ? -2147483648 : 0));
	Class241_Sub34 class241_sub34
	    = (Class241_Sub34) aClass407_10083.get(l);
	if (class241_sub34 == null) {
	    class241_sub34 = new Class241_Sub34();
	    aClass407_10083.put(class241_sub34, l);
	}
	if (((Class241_Sub34) class241_sub34).anIntArray10085.length
	    <= i_70_) {
	    int[] is = new int[1 + i_70_];
	    int[] is_73_ = new int[1 + i_70_];
	    for (int i_74_ = 0;
		 (i_74_
		  < ((Class241_Sub34) class241_sub34).anIntArray10085.length);
		 i_74_++) {
		is[i_74_]
		    = ((Class241_Sub34) class241_sub34).anIntArray10085[i_74_];
		is_73_[i_74_]
		    = ((Class241_Sub34) class241_sub34).anIntArray10086[i_74_];
	    }
	    for (int i_75_ = (((Class241_Sub34) class241_sub34)
			      .anIntArray10085).length;
		 i_75_ < i_70_; i_75_++) {
		is[i_75_] = -1;
		is_73_[i_75_] = 0;
	    }
	    ((Class241_Sub34) class241_sub34).anIntArray10085 = is;
	    ((Class241_Sub34) class241_sub34).anIntArray10086 = is_73_;
	}
	((Class241_Sub34) class241_sub34).anIntArray10085[i_70_] = i_71_;
	((Class241_Sub34) class241_sub34).anIntArray10086[i_70_] = i_72_;
    }
    
    static void method16362(int i, int i_76_, int i_77_, int i_78_,
			    boolean bool) {
	long l = (long) (i | (bool ? -2147483648 : 0));
	Class241_Sub34 class241_sub34
	    = (Class241_Sub34) aClass407_10083.get(l);
	if (class241_sub34 == null) {
	    class241_sub34 = new Class241_Sub34();
	    aClass407_10083.put(class241_sub34, l);
	}
	if (((Class241_Sub34) class241_sub34).anIntArray10085.length
	    <= i_76_) {
	    int[] is = new int[1 + i_76_];
	    int[] is_79_ = new int[1 + i_76_];
	    for (int i_80_ = 0;
		 (i_80_
		  < ((Class241_Sub34) class241_sub34).anIntArray10085.length);
		 i_80_++) {
		is[i_80_]
		    = ((Class241_Sub34) class241_sub34).anIntArray10085[i_80_];
		is_79_[i_80_]
		    = ((Class241_Sub34) class241_sub34).anIntArray10086[i_80_];
	    }
	    for (int i_81_ = (((Class241_Sub34) class241_sub34)
			      .anIntArray10085).length;
		 i_81_ < i_76_; i_81_++) {
		is[i_81_] = -1;
		is_79_[i_81_] = 0;
	    }
	    ((Class241_Sub34) class241_sub34).anIntArray10085 = is;
	    ((Class241_Sub34) class241_sub34).anIntArray10086 = is_79_;
	}
	((Class241_Sub34) class241_sub34).anIntArray10085[i_76_] = i_77_;
	((Class241_Sub34) class241_sub34).anIntArray10086[i_76_] = i_78_;
    }
    
    static void method16363(int i, boolean bool) {
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool, 1580030360);
	if (class241_sub34 != null) {
	    for (int i_82_ = 0;
		 (i_82_
		  < ((Class241_Sub34) class241_sub34).anIntArray10085.length);
		 i_82_++) {
		((Class241_Sub34) class241_sub34).anIntArray10085[i_82_] = -1;
		((Class241_Sub34) class241_sub34).anIntArray10086[i_82_] = 0;
	    }
	}
    }
    
    static void method16364(int i, boolean bool) {
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool, -937416415);
	if (class241_sub34 != null)
	    class241_sub34.remove((byte) 36);
    }
    
    static void method16365(int i, boolean bool) {
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool, 1603978948);
	if (class241_sub34 != null)
	    class241_sub34.remove((byte) 36);
    }
    
    static void method16366(int i, boolean bool) {
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool, -1529516962);
	if (class241_sub34 != null)
	    class241_sub34.remove((byte) 36);
    }
    
    final Class89 method16367(Class103 class103, int i, Class409 class409,
			      int i_83_, boolean bool, Class490 class490) {
	Class89 class89 = null;
	int i_84_ = i;
	Class554 class554 = null;
	if (-1 != i_83_)
	    class554 = Class79.aClass539_1138.method11908(i_83_, -2077373978);
	int[] is = ((Class241_Sub34) this).anIntArray10085;
	if (class554 != null && class554.anIntArray7209 != null) {
	    is = new int[class554.anIntArray7209.length];
	    for (int i_85_ = 0; i_85_ < class554.anIntArray7209.length;
		 i_85_++) {
		int i_86_ = class554.anIntArray7209[i_85_];
		if (i_86_ >= 0
		    && i_86_ < ((Class241_Sub34) this).anIntArray10085.length)
		    is[i_85_] = ((Class241_Sub34) this).anIntArray10085[i_86_];
		else
		    is[i_85_] = -1;
	    }
	}
	if (null != class409)
	    i_84_ |= class409.method7356(1938220808);
	long l = method16345(is, i_83_,
			     null != class490 ? class490.anIntArray6501 : null,
			     bool, (byte) 108);
	if (null != aClass129_10084)
	    class89 = (Class89) aClass129_10084.get(l);
	if (null == class89
	    || class103.method2301(class89.method1866(), i_84_) != 0) {
	    if (null != class89)
		i_84_ = class103.method2302(i_84_, class89.method1866());
	    int i_87_ = i_84_;
	    boolean bool_88_ = false;
	    for (int i_89_ = 0; i_89_ < is.length; i_89_++) {
		if (-1 != is[i_89_] && !JS5.itemDefLoader.list
					    (is[i_89_], (short) -13527)
					    .method13374(bool, null, (byte) 1))
		    bool_88_ = true;
	    }
	    if (bool_88_)
		return null;
	    Class161[] class161s = new Class161[is.length];
	    for (int i_90_ = 0; i_90_ < is.length; i_90_++) {
		if (is[i_90_] != -1)
		    class161s[i_90_] = JS5.itemDefLoader.list
					   (is[i_90_], (short) -21320)
					   .method13375(bool, null, 312055582);
	    }
	    if (class554 != null && null != class554.anIntArrayArray7231) {
		for (int i_91_ = 0;
		     i_91_ < class554.anIntArrayArray7231.length; i_91_++) {
		    if (null != class554.anIntArrayArray7231[i_91_]
			&& null != class161s[i_91_]) {
			int i_92_ = class554.anIntArrayArray7231[i_91_][0];
			int i_93_ = class554.anIntArrayArray7231[i_91_][1];
			int i_94_ = class554.anIntArrayArray7231[i_91_][2];
			int i_95_ = class554.anIntArrayArray7231[i_91_][3];
			int i_96_ = class554.anIntArrayArray7231[i_91_][4];
			int i_97_ = class554.anIntArrayArray7231[i_91_][5];
			if (0 != i_95_ || i_96_ != 0 || i_97_ != 0)
			    class161s[i_91_].method3489(i_95_, i_96_, i_97_);
			if (0 != i_92_ || 0 != i_93_ || 0 != i_94_)
			    class161s[i_91_].method3459(i_92_, i_93_, i_94_);
		    }
		}
	    }
	    Class161 class161 = new Class161(class161s, class161s.length);
	    if (null != class490)
		i_87_ |= 0x4000;
	    class89
		= class103.method2356(class161, i_87_,
				      598746947 * Class63.anInt1032, 66, 855);
	    if (null != class490) {
		for (int i_98_ = 0; i_98_ < 10; i_98_++) {
		    for (int i_99_ = 0;
			 i_99_ < Class558.aShortArrayArray7261[i_98_].length;
			 i_99_++) {
			if (class490.anIntArray6501[i_98_]
			    < (Class561.aShortArrayArrayArray7298[i_98_]
			       [i_99_]).length)
			    class89.method1908
				(Class558.aShortArrayArray7261[i_98_][i_99_],
				 (Class561.aShortArrayArrayArray7298[i_98_]
				  [i_99_][class490.anIntArray6501[i_98_]]));
		    }
		}
	    }
	    if (null != aClass129_10084) {
		class89.method1928(i_84_);
		aClass129_10084.put(class89, l);
	    }
	}
	if (class409 == null)
	    return class89;
	Class89 class89_100_ = class89.method2019((byte) 1, i_84_, true);
	class409.method7357(class89_100_, 0, (byte) -113);
	return class89_100_;
    }
    
    static void method16368() {
	aClass129_10084.reset(58576801);
    }
    
    static void method16369(int i) {
	Class63.anInt1032 = -1676731029 * i;
	aClass129_10084.reset(-704231979);
    }
    
    public static int method16370(int i, int i_101_, boolean bool,
				  boolean bool_102_) {
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool_102_, -1578637167);
	if (null == class241_sub34)
	    return 0;
	int i_103_ = 0;
	for (int i_104_ = 0;
	     i_104_ < ((Class241_Sub34) class241_sub34).anIntArray10085.length;
	     i_104_++) {
	    if (((Class241_Sub34) class241_sub34).anIntArray10085[i_104_] >= 0
		&& (((Class241_Sub34) class241_sub34).anIntArray10085[i_104_]
		    < -345685855 * JS5.itemDefLoader.num)) {
		ItemDefinition class623
		    = JS5.itemDefLoader.list((((Class241_Sub34)
							    class241_sub34)
							   .anIntArray10085
							   [i_104_]),
							  (short) -1717);
		int i_105_
		    = class623.getParam(i_101_,
					   (Class621.paramTypeList.list
					    (i_101_, 1162602875)
					    .defaultint) * 2015998927,
					   1940652969);
		if (bool)
		    i_103_ += (((Class241_Sub34) class241_sub34)
			       .anIntArray10086[i_104_]) * i_105_;
		else
		    i_103_ += i_105_;
	    }
	}
	return i_103_;
    }
    
    static void method16371() {
	aClass129_10084.reset(-1877280193);
    }
    
    public static int method16372(int i, int i_106_, boolean bool) {
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool, 1180510209);
	if (null == class241_sub34)
	    return -1;
	if (i_106_ < 0 || i_106_ >= (((Class241_Sub34) class241_sub34)
				     .anIntArray10085).length)
	    return -1;
	return ((Class241_Sub34) class241_sub34).anIntArray10085[i_106_];
    }
}
