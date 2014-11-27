/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public abstract class Class96
{
    static int anInt1333;
    Class103 aClass103_1334;
    public static final int anInt1335 = 0;
    public static final int anInt1336 = 1;
    static int anInt1337 = -515829347;
    public static final int anInt1338 = 0;
    static int anInt1339;
    static int anInt1340 = 204608195;
    static int anInt1341;
    static int anInt1342;
    static String[] aStringArray1343;
    static int anInt1344;
    static int anInt1345;
    Class639 aClass639_1346;
    
    public void method2110(String string, int i, int i_0_, int i_1_, int i_2_,
			   int i_3_) {
	if (null != string) {
	    method2121(i_1_, i_2_, -295974940);
	    int i_4_ = string.length();
	    int[] is = new int[i_4_];
	    int[] is_5_ = new int[i_4_];
	    for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
		is[i_6_] = (int) (Math.sin((double) i_3_ / 5.0
					   + (double) i_6_ / 5.0)
				  * 5.0);
		is_5_[i_6_] = (int) (Math.sin((double) i_3_ / 5.0
					      + (double) i_6_ / 3.0)
				     * 5.0);
	    }
	    method2155(string,
		       i - ((Class96) this).aClass639_1346
			       .method13562(string, (byte) 27) / 2,
		       i_0_, null, null, is, is_5_, (byte) -23);
	}
    }
    
    public int method2111(String string, int i, int i_7_, int i_8_, int i_9_,
			  Random random, int i_10_, Class168[] class168s,
			  int[] is) {
	if (null == string)
	    return 0;
	random.setSeed((long) i_10_);
	int i_11_ = 192 + (random.nextInt() & 0x1f);
	method2121(i_11_ << 24 | i_8_ & 0xffffff,
		   i_11_ << 24 | i_9_ & 0xffffff, -295974940);
	int i_12_ = string.length();
	int[] is_13_ = new int[i_12_];
	int i_14_ = 0;
	for (int i_15_ = 0; i_15_ < i_12_; i_15_++) {
	    is_13_[i_15_] = i_14_;
	    if ((random.nextInt() & 0x3) == 0)
		i_14_++;
	}
	method2155(string, i, i_7_, class168s, is, is_13_, null, (byte) -45);
	return i_14_;
    }
    
    public void method2112(String string, int i, int i_16_, int i_17_,
			   int i_18_, int i_19_) {
	if (null != string) {
	    method2121(i_17_, i_18_, -295974940);
	    method2127(string,
		       i - ((Class96) this).aClass639_1346
			       .method13562(string, (byte) 85),
		       i_16_, null, null, null, 0, 0, -427492209);
	}
    }
    
    public void method2113(String string, int i, int i_20_, int i_21_,
			   int i_22_, int i_23_) {
	if (null != string) {
	    method2121(i_21_, i_22_, -295974940);
	    method2127(string,
		       i - ((Class96) this).aClass639_1346
			       .method13562(string, (byte) 7) / 2,
		       i_20_, null, null, null, 0, 0, -1095040425);
	}
    }
    
    public int method2114(String string, int i, int i_24_, int i_25_,
			  int i_26_, int i_27_, int i_28_, int i_29_,
			  int i_30_, int i_31_, Class168[] class168s, int[] is,
			  Class135 class135, int i_32_, int i_33_, int i_34_) {
	return method2115(string, i, i_24_, i_25_, i_26_, i_27_, i_28_, i_29_,
			  i_30_, i_31_, 0, class168s, is, class135, i_32_,
			  i_33_, (byte) 1);
    }
    
    public int method2115(String string, int i, int i_35_, int i_36_,
			  int i_37_, int i_38_, int i_39_, int i_40_,
			  int i_41_, int i_42_, int i_43_,
			  Class168[] class168s, int[] is, Class135 class135,
			  int i_44_, int i_45_, byte i_46_) {
	if (string == null)
	    return 0;
	method2121(i_38_, i_39_, -295974940);
	if (0 == i_42_)
	    i_42_ = ((Class96) this).aClass639_1346.anInt8259 * 1118868451;
	int[] is_47_;
	if ((i_37_
	     < (i_42_
		+ (326424439 * ((Class96) this).aClass639_1346.anInt8260
		   + -351886683 * ((Class96) this).aClass639_1346.anInt8258)))
	    && i_37_ < i_42_ + i_42_)
	    is_47_ = null;
	else
	    is_47_ = new int[] { i_36_ };
	int i_48_
	    = ((Class96) this).aClass639_1346.method13565(string, is_47_,
							  aStringArray1343,
							  class168s,
							  (byte) 25);
	if (i_43_ == -1) {
	    i_43_ = i_37_ / i_42_;
	    if (i_43_ <= 0)
		i_43_ = 1;
	}
	if (i_43_ > 0 && i_48_ >= i_43_) {
	    aStringArray1343[i_43_ - 1]
		= ((Class96) this).aClass639_1346.method13564((aStringArray1343
							       [i_43_ - 1]),
							      i_36_, class168s,
							      -1676840675);
	    i_48_ = i_43_;
	}
	if (3 == i_41_ && 1 == i_48_)
	    i_41_ = 1;
	int i_49_;
	if (0 == i_41_)
	    i_49_ = (i_35_
		     + -351886683 * ((Class96) this).aClass639_1346.anInt8258);
	else if (i_41_ == 1)
	    i_49_ = ((i_37_
		      - ((Class96) this).aClass639_1346.anInt8258 * -351886683
		      - 326424439 * ((Class96) this).aClass639_1346.anInt8260
		      - (i_48_ - 1) * i_42_) / 2
		     + (i_35_ + (((Class96) this).aClass639_1346.anInt8258
				 * -351886683)));
	else if (i_41_ == 2)
	    i_49_ = (i_37_ + i_35_
		     - 326424439 * ((Class96) this).aClass639_1346.anInt8260
		     - i_42_ * (i_48_ - 1));
	else {
	    int i_50_
		= ((i_37_
		    - ((Class96) this).aClass639_1346.anInt8258 * -351886683
		    - 326424439 * ((Class96) this).aClass639_1346.anInt8260
		    - i_42_ * (i_48_ - 1))
		   / (i_48_ + 1));
	    if (i_50_ < 0)
		i_50_ = 0;
	    i_49_ = i_50_ + (i_35_ + -351886683 * (((Class96) this)
						   .aClass639_1346.anInt8258));
	    i_42_ += i_50_;
	}
	for (int i_51_ = 0; i_51_ < i_48_; i_51_++) {
	    if (i_40_ == 0)
		method2127(aStringArray1343[i_51_], i, i_49_, class168s, is,
			   class135, i_44_, i_45_, -513982450);
	    else if (1 == i_40_)
		method2127(aStringArray1343[i_51_],
			   i + (i_36_
				- (((Class96) this).aClass639_1346.method13562
				   (aStringArray1343[i_51_], (byte) 59))) / 2,
			   i_49_, class168s, is, class135, i_44_, i_45_,
			   -26199020);
	    else if (i_40_ == 2)
		method2127(aStringArray1343[i_51_],
			   i + i_36_ - (((Class96) this).aClass639_1346
					    .method13562
					(aStringArray1343[i_51_], (byte) 67)),
			   i_49_, class168s, is, class135, i_44_, i_45_,
			   1311641986);
	    else if (i_48_ - 1 == i_51_)
		method2127(aStringArray1343[i_51_], i, i_49_, class168s, is,
			   class135, i_44_, i_45_, 815312882);
	    else {
		method2164(aStringArray1343[i_51_], i_36_, 1701138638);
		method2127(aStringArray1343[i_51_], i, i_49_, class168s, is,
			   class135, i_44_, i_45_, 96118580);
		anInt1344 = 0;
	    }
	    i_49_ += i_42_;
	}
	return i_48_;
    }
    
    public void method2116(String string, int i, int i_52_, int i_53_,
			   int i_54_, int i_55_, int i_56_) {
	if (null != string) {
	    method2121(i_53_, i_54_, -295974940);
	    int i_57_ = string.length();
	    int[] is = new int[i_57_];
	    for (int i_58_ = 0; i_58_ < i_57_; i_58_++)
		is[i_58_] = (int) (Math.sin((double) i_55_ / 5.0
					    + (double) i_58_ / 2.0)
				   * 5.0);
	    method2155(string,
		       i - ((Class96) this).aClass639_1346
			       .method13562(string, (byte) 86) / 2,
		       i_52_, null, null, null, is, (byte) -97);
	}
    }
    
    public void method2117(String string, int i, int i_59_, int i_60_,
			   int i_61_, int i_62_, int i_63_) {
	if (null != string) {
	    method2121(i_60_, i_61_, -295974940);
	    int i_64_ = string.length();
	    int[] is = new int[i_64_];
	    int[] is_65_ = new int[i_64_];
	    for (int i_66_ = 0; i_66_ < i_64_; i_66_++) {
		is[i_66_] = (int) (Math.sin((double) i_62_ / 5.0
					    + (double) i_66_ / 5.0)
				   * 5.0);
		is_65_[i_66_] = (int) (Math.sin((double) i_62_ / 5.0
						+ (double) i_66_ / 3.0)
				       * 5.0);
	    }
	    method2155(string,
		       i - ((Class96) this).aClass639_1346
			       .method13562(string, (byte) 22) / 2,
		       i_59_, null, null, is, is_65_, (byte) -32);
	}
    }
    
    void method2118(String string) {
	try {
	    if (string.startsWith("col="))
		anInt1341 = ((anInt1341 * -1072394107 & ~0xffffff
			      | Class200.method4072(string.substring(4), 16,
						    -1921082860) & 0xffffff)
			     * 519628877);
	    else if (string.equals("/col"))
		anInt1341 = 519628877 * (anInt1341 * -1072394107 & ~0xffffff
					 | anInt1333 * 283909187 & 0xffffff);
	    if (string.startsWith("argb="))
		anInt1341 = Class200.method4072(string.substring(5), 16,
						1144403917) * 519628877;
	    else if (string.equals("/argb"))
		anInt1341 = 1267284007 * anInt1333;
	    else if (string.startsWith("str="))
		anInt1337 = (-1072394107 * anInt1341 & ~0xffffff
			     | Class200.method4072(string.substring(4), 16,
						   -482941496)) * 515829347;
	    else if (string.equals("str"))
		anInt1337 = 515829347 * (-1072394107 * anInt1341 & ~0xffffff
					 | 0x800000);
	    else if (string.equals("/str"))
		anInt1337 = -515829347;
	    else if (string.startsWith("u="))
		anInt1340 = (-1072394107 * anInt1341 & ~0xffffff
			     | Class200.method4072(string.substring(2), 16,
						   -1343597487)) * -204608195;
	    else if (string.equals("u"))
		anInt1340 = (anInt1341 * -1072394107 & ~0xffffff) * -204608195;
	    else if (string.equals("/u"))
		anInt1340 = 204608195;
	    else if (string.equalsIgnoreCase("shad=-1"))
		anInt1339 = 0;
	    else if (string.startsWith("shad="))
		anInt1339 = (anInt1341 * -1072394107 & ~0xffffff
			     | Class200.method4072(string.substring(5), 16,
						   -1976728869)) * 2129202551;
	    else if (string.equals("shad"))
		anInt1339 = 2129202551 * (-1072394107 * anInt1341 & ~0xffffff);
	    else if (string.equals("/shad"))
		anInt1339 = 16418621 * anInt1342;
	    else if (string.equals("br"))
		method2121(283909187 * anInt1333, 1376579051 * anInt1342,
			   -295974940);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public int method2119(String string, int i, int i_67_, int i_68_,
			  int i_69_, Random random, int i_70_,
			  Class168[] class168s, int[] is, int i_71_) {
	if (null == string)
	    return 0;
	random.setSeed((long) i_70_);
	int i_72_ = 192 + (random.nextInt() & 0x1f);
	method2121(i_72_ << 24 | i_68_ & 0xffffff,
		   i_72_ << 24 | i_69_ & 0xffffff, -295974940);
	int i_73_ = string.length();
	int[] is_74_ = new int[i_73_];
	int i_75_ = 0;
	for (int i_76_ = 0; i_76_ < i_73_; i_76_++) {
	    is_74_[i_76_] = i_75_;
	    if ((random.nextInt() & 0x3) == 0)
		i_75_++;
	}
	method2155(string, i, i_67_, class168s, is, is_74_, null, (byte) -7);
	return i_75_;
    }
    
    public int method2120(String string, int i, int i_77_, int i_78_,
			  int i_79_, int i_80_, int i_81_, int i_82_,
			  int i_83_, Random random, int i_84_, int[] is,
			  Class168[] class168s, int[] is_85_, byte i_86_) {
	if (null == string)
	    return 0;
	random.setSeed((long) i_84_);
	int i_87_ = 192 + (random.nextInt() & 0x1f);
	method2121(i_87_ << 24 | i_80_ & 0xffffff,
		   -1 == i_81_ ? 0 : i_87_ << 24 | i_81_ & 0xffffff,
		   -295974940);
	int i_88_ = string.length();
	int[] is_89_ = new int[i_88_];
	int i_90_ = 0;
	for (int i_91_ = 0; i_91_ < i_88_; i_91_++) {
	    is_89_[i_91_] = i_90_;
	    if ((random.nextInt() & 0x3) == 0)
		i_90_++;
	}
	int i_92_ = i;
	int i_93_
	    = ((Class96) this).aClass639_1346.anInt8258 * -351886683 + i_77_;
	int i_94_ = -1;
	if (i_83_ == 1)
	    i_93_ += ((i_79_
		       - -351886683 * ((Class96) this).aClass639_1346.anInt8258
		       - ((Class96) this).aClass639_1346.anInt8260 * 326424439)
		      / 2);
	else if (i_83_ == 2)
	    i_93_ = (i_77_ + i_79_
		     - ((Class96) this).aClass639_1346.anInt8260 * 326424439);
	if (i_82_ == 1) {
	    i_94_ = (((Class96) this).aClass639_1346.method13562(string,
								 (byte) 105)
		     + i_90_);
	    i_92_ += (i_78_ - i_94_) / 2;
	} else if (2 == i_82_) {
	    i_94_ = (((Class96) this).aClass639_1346.method13562(string,
								 (byte) 67)
		     + i_90_);
	    i_92_ += i_78_ - i_94_;
	}
	method2155(string, i_92_, i_93_, class168s, is_85_, is_89_, null,
		   (byte) -82);
	if (is != null) {
	    if (i_94_ == -1)
		i_94_ = (((Class96) this).aClass639_1346.method13562(string,
								     (byte) 31)
			 + i_90_);
	    is[0] = i_92_;
	    is[1] = (i_93_
		     - -351886683 * ((Class96) this).aClass639_1346.anInt8258);
	    is[2] = i_94_;
	    is[3] = (-351886683 * ((Class96) this).aClass639_1346.anInt8258
		     + ((Class96) this).aClass639_1346.anInt8260 * 326424439);
	}
	return i_90_;
    }
    
    void method2121(int i, int i_95_, int i_96_) {
	anInt1337 = -515829347;
	anInt1340 = 204608195;
	anInt1341 = (anInt1333 = -209448853 * i) * 1267284007;
	anInt1344 = 0;
	anInt1345 = 0;
	if (-1 == i_95_)
	    i_95_ = 0;
	anInt1339 = (anInt1342 = 603247299 * i_95_) * 16418621;
    }
    
    void method2122(String string, int i) {
	try {
	    if (string.startsWith("col="))
		anInt1341 = ((anInt1341 * -1072394107 & ~0xffffff
			      | Class200.method4072(string.substring(4), 16,
						    186996200) & 0xffffff)
			     * 519628877);
	    else if (string.equals("/col"))
		anInt1341 = 519628877 * (anInt1341 * -1072394107 & ~0xffffff
					 | anInt1333 * 283909187 & 0xffffff);
	    if (string.startsWith("argb="))
		anInt1341 = Class200.method4072(string.substring(5), 16,
						1586288316) * 519628877;
	    else if (string.equals("/argb"))
		anInt1341 = 1267284007 * anInt1333;
	    else if (string.startsWith("str="))
		anInt1337 = (-1072394107 * anInt1341 & ~0xffffff
			     | Class200.method4072(string.substring(4), 16,
						   -301219015)) * 515829347;
	    else if (string.equals("str"))
		anInt1337 = 515829347 * (-1072394107 * anInt1341 & ~0xffffff
					 | 0x800000);
	    else if (string.equals("/str"))
		anInt1337 = -515829347;
	    else if (string.startsWith("u="))
		anInt1340 = (-1072394107 * anInt1341 & ~0xffffff
			     | Class200.method4072(string.substring(2), 16,
						   1645714142)) * -204608195;
	    else if (string.equals("u"))
		anInt1340 = (anInt1341 * -1072394107 & ~0xffffff) * -204608195;
	    else if (string.equals("/u"))
		anInt1340 = 204608195;
	    else if (string.equalsIgnoreCase("shad=-1"))
		anInt1339 = 0;
	    else if (string.startsWith("shad="))
		anInt1339 = (anInt1341 * -1072394107 & ~0xffffff
			     | Class200.method4072(string.substring(5), 16,
						   988509264)) * 2129202551;
	    else if (string.equals("shad"))
		anInt1339 = 2129202551 * (-1072394107 * anInt1341 & ~0xffffff);
	    else if (string.equals("/shad"))
		anInt1339 = 16418621 * anInt1342;
	    else if (string.equals("br"))
		method2121(283909187 * anInt1333, 1376579051 * anInt1342,
			   -295974940);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    abstract void method2123(char c, int i, int i_97_, int i_98_,
			     boolean bool);
    
    public void method2124(String string, int i, int i_99_, int i_100_,
			   int i_101_, int i_102_, int i_103_) {
	if (null != string) {
	    method2121(i_100_, i_101_, -295974940);
	    double d = 7.0 - (double) i_103_ / 8.0;
	    if (d < 0.0)
		d = 0.0;
	    int i_104_ = string.length();
	    int[] is = new int[i_104_];
	    for (int i_105_ = 0; i_105_ < i_104_; i_105_++)
		is[i_105_] = (int) (Math.sin((double) i_105_ / 1.5
					     + (double) i_102_ / 1.0)
				    * d);
	    method2155(string,
		       i - ((Class96) this).aClass639_1346
			       .method13562(string, (byte) 19) / 2,
		       i_99_, null, null, null, is, (byte) -90);
	}
    }
    
    public int method2125(String string, int i, int i_106_, int i_107_,
			  int i_108_, Random random, int i_109_,
			  Class168[] class168s, int[] is) {
	if (null == string)
	    return 0;
	random.setSeed((long) i_109_);
	int i_110_ = 192 + (random.nextInt() & 0x1f);
	method2121(i_110_ << 24 | i_107_ & 0xffffff,
		   i_110_ << 24 | i_108_ & 0xffffff, -295974940);
	int i_111_ = string.length();
	int[] is_112_ = new int[i_111_];
	int i_113_ = 0;
	for (int i_114_ = 0; i_114_ < i_111_; i_114_++) {
	    is_112_[i_114_] = i_113_;
	    if ((random.nextInt() & 0x3) == 0)
		i_113_++;
	}
	method2155(string, i, i_106_, class168s, is, is_112_, null,
		   (byte) -79);
	return i_113_;
    }
    
    abstract void method2126(char c, int i, int i_115_, int i_116_,
			     boolean bool);
    
    void method2127(String string, int i, int i_117_, Class168[] class168s,
		    int[] is, Class135 class135, int i_118_, int i_119_,
		    int i_120_) {
	i_117_ -= ((Class96) this).aClass639_1346.anInt8259 * 1118868451;
	int i_121_ = -1;
	int i_122_ = -1;
	int i_123_ = string.length();
	for (int i_124_ = 0; i_124_ < i_123_; i_124_++) {
	    char c
		= (char) (Class76.method1773(string.charAt(i_124_), 1203607956)
			  & 0xff);
	    if (60 == c)
		i_121_ = i_124_;
	    else {
		if (62 == c && -1 != i_121_) {
		    String string_125_ = string.substring(i_121_ + 1, i_124_);
		    i_121_ = -1;
		    if (string_125_.equals("lt"))
			c = '<';
		    else if (string_125_.equals("gt"))
			c = '>';
		    else if (string_125_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_125_.equals("shy"))
			c = '\u00ad';
		    else if (string_125_.equals("times"))
			c = '\u00d7';
		    else if (string_125_.equals("euro"))
			c = '\u20ac';
		    else if (string_125_.equals("copy"))
			c = '\u00a9';
		    else if (string_125_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_125_.startsWith("img=")) {
			    try {
				int i_126_
				    = Class324.method5975(string_125_
							      .substring(4),
							  -952789660);
				Class168 class168 = class168s[i_126_];
				int i_127_ = (null != is ? is[i_126_]
					      : class168.method3616());
				if (-16777216
				    == (anInt1341 * -1072394107 & ~0xffffff))
				    class168.method3666(i,
							(((((Class96) this)
							   .aClass639_1346
							   .anInt8259)
							  * 1118868451)
							 + i_117_ - i_127_),
							1, -1, 1);
				else
				    class168.method3666
					(i,
					 i_117_ + ((((Class96) this)
						    .aClass639_1346.anInt8259)
						   * 1118868451) - i_127_,
					 0,
					 (-1072394107 * anInt1341 & ~0xffffff
					  | 0xffffff),
					 1);
				i += class168s[i_126_].method64();
				i_122_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else
			    method2122(string_125_, 1328799225);
			continue;
		    }
		}
		if (-1 == i_121_) {
		    if (i_122_ != -1)
			i += ((Class96) this).aClass639_1346
				 .method13560(i_122_, c, -1912008558);
		    if (32 != c) {
			if (null == class135) {
			    if ((anInt1339 * -1890722745 & ~0xffffff) != 0)
				method2126(c, 1 + i, 1 + i_117_,
					   -1890722745 * anInt1339, true);
			    method2126(c, i, i_117_, anInt1341 * -1072394107,
				       false);
			} else {
			    if ((-1890722745 * anInt1339 & ~0xffffff) != 0)
				method2140(c, 1 + i, 1 + i_117_,
					   anInt1339 * -1890722745, true,
					   class135, i_118_, i_119_);
			    method2140(c, i, i_117_, anInt1341 * -1072394107,
				       false, class135, i_118_, i_119_);
			}
		    } else if (-389911781 * anInt1344 > 0) {
			anInt1345 += anInt1344 * 2012874999;
			i += -1199035907 * anInt1345 >> 8;
			anInt1345
			    = (-1199035907 * anInt1345 & 0xff) * 114031445;
		    }
		    int i_128_ = ((Class96) this).aClass639_1346
				     .method13561(c, 1997987460);
		    if (-1 != anInt1337 * 1849099083)
			((Class96) this).aClass103_1334.method2265
			    (i,
			     i_117_ + (int) ((double) (1118868451
						       * (((Class96) this)
							  .aClass639_1346
							  .anInt8259))
					     * 0.7),
			     i_128_, 1849099083 * anInt1337, -1028368571);
		    if (anInt1340 * 1886802453 != -1)
			((Class96) this).aClass103_1334.method2265
			    (i,
			     i_117_ + (((Class96) this).aClass639_1346
				       .anInt8259) * 1118868451 + 1,
			     i_128_, 1886802453 * anInt1340, -1845830401);
		    i += i_128_;
		    i_122_ = c;
		}
	    }
	}
    }
    
    static {
	anInt1333 = 0;
	anInt1341 = 0;
	anInt1342 = 0;
	anInt1339 = 0;
	anInt1344 = 0;
	anInt1345 = 0;
	aStringArray1343 = new String[100];
    }
    
    public void method2128(String string, int i, int i_129_, int i_130_,
			   int i_131_, int i_132_) {
	if (string != null) {
	    method2121(i_130_, i_131_, -295974940);
	    method2127(string, i, i_129_, null, null, null, 0, 0, 960991691);
	}
    }
    
    abstract void method2129(char c, int i, int i_133_, int i_134_,
			     boolean bool);
    
    void method2130(String string, int i, int i_135_, Class168[] class168s,
		    int[] is, int[] is_136_, int[] is_137_) {
	i_135_ -= 1118868451 * ((Class96) this).aClass639_1346.anInt8259;
	int i_138_ = -1;
	int i_139_ = -1;
	int i_140_ = 0;
	int i_141_ = string.length();
	for (int i_142_ = 0; i_142_ < i_141_; i_142_++) {
	    char c
		= (char) (Class76.method1773(string.charAt(i_142_), 1251359578)
			  & 0xff);
	    if (c == 60)
		i_138_ = i_142_;
	    else {
		if (c == 62 && i_138_ != -1) {
		    String string_143_ = string.substring(1 + i_138_, i_142_);
		    i_138_ = -1;
		    if (string_143_.equals("lt"))
			c = '<';
		    else if (string_143_.equals("gt"))
			c = '>';
		    else if (string_143_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_143_.equals("shy"))
			c = '\u00ad';
		    else if (string_143_.equals("times"))
			c = '\u00d7';
		    else if (string_143_.equals("euro"))
			c = '\u20ac';
		    else if (string_143_.equals("copy"))
			c = '\u00a9';
		    else if (string_143_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_143_.startsWith("img=")) {
			    try {
				int i_144_;
				if (null != is_136_)
				    i_144_ = is_136_[i_140_];
				else
				    i_144_ = 0;
				int i_145_;
				if (null != is_137_)
				    i_145_ = is_137_[i_140_];
				else
				    i_145_ = 0;
				i_140_++;
				int i_146_
				    = Class324.method5975(string_143_
							      .substring(4),
							  -952789660);
				Class168 class168 = class168s[i_146_];
				int i_147_ = (is != null ? is[i_146_]
					      : class168.method3616());
				class168.method3666(i + i_144_,
						    (i_135_
						     + (1118868451
							* (((Class96) this)
							   .aClass639_1346
							   .anInt8259))
						     - i_147_ + i_145_),
						    1, -1, 1);
				i += class168s[i_146_].method64();
				i_139_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else
			    method2122(string_143_, 1459580001);
			continue;
		    }
		}
		if (-1 == i_138_) {
		    if (i_139_ != -1)
			i += ((Class96) this).aClass639_1346
				 .method13560(i_139_, c, -1912008558);
		    int i_148_;
		    if (is_136_ != null)
			i_148_ = is_136_[i_140_];
		    else
			i_148_ = 0;
		    int i_149_;
		    if (is_137_ != null)
			i_149_ = is_137_[i_140_];
		    else
			i_149_ = 0;
		    i_140_++;
		    if (32 != c) {
			if (0 != (anInt1339 * -1890722745 & ~0xffffff))
			    method2126(c, i_148_ + (i + 1),
				       i_149_ + (1 + i_135_),
				       anInt1339 * -1890722745, true);
			method2126(c, i_148_ + i, i_135_ + i_149_,
				   anInt1341 * -1072394107, false);
		    } else if (anInt1344 * -389911781 > 0) {
			anInt1345 += anInt1344 * 2012874999;
			i += anInt1345 * -1199035907 >> 8;
			anInt1345
			    = 114031445 * (-1199035907 * anInt1345 & 0xff);
		    }
		    int i_150_ = ((Class96) this).aClass639_1346
				     .method13561(c, 2061654522);
		    if (-1 != anInt1337 * 1849099083)
			((Class96) this).aClass103_1334.method2265
			    (i,
			     (int) ((double) ((((Class96) this).aClass639_1346
					       .anInt8259)
					      * 1118868451)
				    * 0.7) + i_135_,
			     i_150_, 1849099083 * anInt1337, -873400019);
		    if (-1 != 1886802453 * anInt1340)
			((Class96) this).aClass103_1334.method2265
			    (i,
			     i_135_ + 1118868451 * (((Class96) this)
						    .aClass639_1346.anInt8259),
			     i_150_, 1886802453 * anInt1340, -1852892912);
		    i += i_150_;
		    i_139_ = c;
		}
	    }
	}
    }
    
    Class96(Class103 class103, Class639 class639) {
	((Class96) this).aClass103_1334 = class103;
	((Class96) this).aClass639_1346 = class639;
    }
    
    abstract void method2131(char c, int i, int i_151_, int i_152_,
			     boolean bool, Class135 class135, int i_153_,
			     int i_154_);
    
    public int method2132(String string, int i, int i_155_, int i_156_,
			  int i_157_, int i_158_, int i_159_, int i_160_,
			  int i_161_, int i_162_, int i_163_,
			  Class168[] class168s, int[] is, Class135 class135,
			  int i_164_, int i_165_) {
	if (string == null)
	    return 0;
	method2121(i_158_, i_159_, -295974940);
	if (0 == i_162_)
	    i_162_ = ((Class96) this).aClass639_1346.anInt8259 * 1118868451;
	int[] is_166_;
	if ((i_157_
	     < (i_162_
		+ (326424439 * ((Class96) this).aClass639_1346.anInt8260
		   + -351886683 * ((Class96) this).aClass639_1346.anInt8258)))
	    && i_157_ < i_162_ + i_162_)
	    is_166_ = null;
	else
	    is_166_ = new int[] { i_156_ };
	int i_167_
	    = ((Class96) this).aClass639_1346.method13565(string, is_166_,
							  aStringArray1343,
							  class168s,
							  (byte) 25);
	if (i_163_ == -1) {
	    i_163_ = i_157_ / i_162_;
	    if (i_163_ <= 0)
		i_163_ = 1;
	}
	if (i_163_ > 0 && i_167_ >= i_163_) {
	    aStringArray1343[i_163_ - 1]
		= ((Class96) this).aClass639_1346.method13564((aStringArray1343
							       [i_163_ - 1]),
							      i_156_,
							      class168s,
							      -1563287278);
	    i_167_ = i_163_;
	}
	if (3 == i_161_ && 1 == i_167_)
	    i_161_ = 1;
	int i_168_;
	if (0 == i_161_)
	    i_168_ = i_155_ + (-351886683
			       * ((Class96) this).aClass639_1346.anInt8258);
	else if (i_161_ == 1)
	    i_168_ = ((i_157_
		       - ((Class96) this).aClass639_1346.anInt8258 * -351886683
		       - 326424439 * ((Class96) this).aClass639_1346.anInt8260
		       - (i_167_ - 1) * i_162_) / 2
		      + (i_155_ + (((Class96) this).aClass639_1346.anInt8258
				   * -351886683)));
	else if (i_161_ == 2)
	    i_168_ = (i_157_ + i_155_
		      - 326424439 * ((Class96) this).aClass639_1346.anInt8260
		      - i_162_ * (i_167_ - 1));
	else {
	    int i_169_
		= ((i_157_
		    - ((Class96) this).aClass639_1346.anInt8258 * -351886683
		    - 326424439 * ((Class96) this).aClass639_1346.anInt8260
		    - i_162_ * (i_167_ - 1))
		   / (i_167_ + 1));
	    if (i_169_ < 0)
		i_169_ = 0;
	    i_168_
		= i_169_ + (i_155_ + -351886683 * (((Class96) this)
						   .aClass639_1346.anInt8258));
	    i_162_ += i_169_;
	}
	for (int i_170_ = 0; i_170_ < i_167_; i_170_++) {
	    if (i_160_ == 0)
		method2127(aStringArray1343[i_170_], i, i_168_, class168s, is,
			   class135, i_164_, i_165_, 975678149);
	    else if (1 == i_160_)
		method2127(aStringArray1343[i_170_],
			   i + (i_156_
				- (((Class96) this).aClass639_1346.method13562
				   (aStringArray1343[i_170_], (byte) 4))) / 2,
			   i_168_, class168s, is, class135, i_164_, i_165_,
			   -618015106);
	    else if (i_160_ == 2)
		method2127(aStringArray1343[i_170_],
			   (i + i_156_
			    - (((Class96) this).aClass639_1346.method13562
			       (aStringArray1343[i_170_], (byte) 98))),
			   i_168_, class168s, is, class135, i_164_, i_165_,
			   2029757266);
	    else if (i_167_ - 1 == i_170_)
		method2127(aStringArray1343[i_170_], i, i_168_, class168s, is,
			   class135, i_164_, i_165_, -301342049);
	    else {
		method2164(aStringArray1343[i_170_], i_156_, 1558701100);
		method2127(aStringArray1343[i_170_], i, i_168_, class168s, is,
			   class135, i_164_, i_165_, 1869262173);
		anInt1344 = 0;
	    }
	    i_168_ += i_162_;
	}
	return i_167_;
    }
    
    public void method2133(String string, int i, int i_171_, int i_172_,
			   int i_173_) {
	if (string != null) {
	    method2121(i_172_, i_173_, -295974940);
	    method2127(string, i, i_171_, null, null, null, 0, 0, 988094587);
	}
    }
    
    public void method2134(String string, int i, int i_174_, int i_175_,
			   int i_176_) {
	if (string != null) {
	    method2121(i_175_, i_176_, -295974940);
	    method2127(string, i, i_174_, null, null, null, 0, 0, 877959379);
	}
    }
    
    public void method2135(String string, int i, int i_177_, int i_178_,
			   int i_179_) {
	if (null != string) {
	    method2121(i_178_, i_179_, -295974940);
	    method2127(string,
		       i - ((Class96) this).aClass639_1346
			       .method13562(string, (byte) 114),
		       i_177_, null, null, null, 0, 0, 1894570237);
	}
    }
    
    public void method2136(String string, int i, int i_180_, int i_181_,
			   int i_182_) {
	if (null != string) {
	    method2121(i_181_, i_182_, -295974940);
	    method2127(string,
		       i - ((Class96) this).aClass639_1346
			       .method13562(string, (byte) 99),
		       i_180_, null, null, null, 0, 0, 1935672888);
	}
    }
    
    public void method2137(String string, int i, int i_183_, int i_184_,
			   int i_185_) {
	if (null != string) {
	    method2121(i_184_, i_185_, -295974940);
	    method2127(string,
		       i - ((Class96) this).aClass639_1346
			       .method13562(string, (byte) 78),
		       i_183_, null, null, null, 0, 0, -401697188);
	}
    }
    
    public void method2138(String string, int i, int i_186_, int i_187_,
			   int i_188_) {
	if (null != string) {
	    method2121(i_187_, i_188_, -295974940);
	    method2127(string,
		       i - ((Class96) this).aClass639_1346
			       .method13562(string, (byte) 93) / 2,
		       i_186_, null, null, null, 0, 0, -950519718);
	}
    }
    
    public int method2139
	(String string, int i, int i_189_, int i_190_, int i_191_, int i_192_,
	 int i_193_, int i_194_, int i_195_, int i_196_, Class168[] class168s,
	 int[] is, Class135 class135, int i_197_, int i_198_) {
	return method2115(string, i, i_189_, i_190_, i_191_, i_192_, i_193_,
			  i_194_, i_195_, i_196_, 0, class168s, is, class135,
			  i_197_, i_198_, (byte) 1);
    }
    
    abstract void method2140(char c, int i, int i_199_, int i_200_,
			     boolean bool, Class135 class135, int i_201_,
			     int i_202_);
    
    public void method2141(String string, int i, int i_203_, int i_204_,
			   int i_205_, int i_206_, int i_207_, int i_208_) {
	if (null != string) {
	    method2121(i_204_, i_205_, -295974940);
	    double d = 7.0 - (double) i_207_ / 8.0;
	    if (d < 0.0)
		d = 0.0;
	    int i_209_ = string.length();
	    int[] is = new int[i_209_];
	    for (int i_210_ = 0; i_210_ < i_209_; i_210_++)
		is[i_210_] = (int) (Math.sin((double) i_210_ / 1.5
					     + (double) i_206_ / 1.0)
				    * d);
	    method2155(string,
		       i - ((Class96) this).aClass639_1346
			       .method13562(string, (byte) 39) / 2,
		       i_203_, null, null, null, is, (byte) -25);
	}
    }
    
    public int method2142(String string, int i, int i_211_, int i_212_,
			  int i_213_, int i_214_, int i_215_, int i_216_,
			  int i_217_, int i_218_, int i_219_,
			  Class168[] class168s, int[] is, Class135 class135,
			  int i_220_, int i_221_) {
	if (string == null)
	    return 0;
	method2121(i_214_, i_215_, -295974940);
	if (0 == i_218_)
	    i_218_ = ((Class96) this).aClass639_1346.anInt8259 * 1118868451;
	int[] is_222_;
	if ((i_213_
	     < (i_218_
		+ (326424439 * ((Class96) this).aClass639_1346.anInt8260
		   + -351886683 * ((Class96) this).aClass639_1346.anInt8258)))
	    && i_213_ < i_218_ + i_218_)
	    is_222_ = null;
	else
	    is_222_ = new int[] { i_212_ };
	int i_223_
	    = ((Class96) this).aClass639_1346.method13565(string, is_222_,
							  aStringArray1343,
							  class168s,
							  (byte) 25);
	if (i_219_ == -1) {
	    i_219_ = i_213_ / i_218_;
	    if (i_219_ <= 0)
		i_219_ = 1;
	}
	if (i_219_ > 0 && i_223_ >= i_219_) {
	    aStringArray1343[i_219_ - 1]
		= ((Class96) this).aClass639_1346.method13564((aStringArray1343
							       [i_219_ - 1]),
							      i_212_,
							      class168s,
							      -1534630405);
	    i_223_ = i_219_;
	}
	if (3 == i_217_ && 1 == i_223_)
	    i_217_ = 1;
	int i_224_;
	if (0 == i_217_)
	    i_224_ = i_211_ + (-351886683
			       * ((Class96) this).aClass639_1346.anInt8258);
	else if (i_217_ == 1)
	    i_224_ = ((i_213_
		       - ((Class96) this).aClass639_1346.anInt8258 * -351886683
		       - 326424439 * ((Class96) this).aClass639_1346.anInt8260
		       - (i_223_ - 1) * i_218_) / 2
		      + (i_211_ + (((Class96) this).aClass639_1346.anInt8258
				   * -351886683)));
	else if (i_217_ == 2)
	    i_224_ = (i_213_ + i_211_
		      - 326424439 * ((Class96) this).aClass639_1346.anInt8260
		      - i_218_ * (i_223_ - 1));
	else {
	    int i_225_
		= ((i_213_
		    - ((Class96) this).aClass639_1346.anInt8258 * -351886683
		    - 326424439 * ((Class96) this).aClass639_1346.anInt8260
		    - i_218_ * (i_223_ - 1))
		   / (i_223_ + 1));
	    if (i_225_ < 0)
		i_225_ = 0;
	    i_224_
		= i_225_ + (i_211_ + -351886683 * (((Class96) this)
						   .aClass639_1346.anInt8258));
	    i_218_ += i_225_;
	}
	for (int i_226_ = 0; i_226_ < i_223_; i_226_++) {
	    if (i_216_ == 0)
		method2127(aStringArray1343[i_226_], i, i_224_, class168s, is,
			   class135, i_220_, i_221_, -612266336);
	    else if (1 == i_216_)
		method2127(aStringArray1343[i_226_],
			   i + (i_212_
				- (((Class96) this).aClass639_1346.method13562
				   (aStringArray1343[i_226_], (byte) 29))) / 2,
			   i_224_, class168s, is, class135, i_220_, i_221_,
			   1653914403);
	    else if (i_216_ == 2)
		method2127(aStringArray1343[i_226_],
			   (i + i_212_
			    - (((Class96) this).aClass639_1346.method13562
			       (aStringArray1343[i_226_], (byte) 14))),
			   i_224_, class168s, is, class135, i_220_, i_221_,
			   -307165312);
	    else if (i_223_ - 1 == i_226_)
		method2127(aStringArray1343[i_226_], i, i_224_, class168s, is,
			   class135, i_220_, i_221_, -1280872536);
	    else {
		method2164(aStringArray1343[i_226_], i_212_, 1708619057);
		method2127(aStringArray1343[i_226_], i, i_224_, class168s, is,
			   class135, i_220_, i_221_, 514128191);
		anInt1344 = 0;
	    }
	    i_224_ += i_218_;
	}
	return i_223_;
    }
    
    public int method2143(String string, int i, int i_227_, int i_228_,
			  int i_229_, int i_230_, int i_231_, int i_232_,
			  int i_233_, int i_234_, int i_235_,
			  Class168[] class168s, int[] is, Class135 class135,
			  int i_236_, int i_237_) {
	if (string == null)
	    return 0;
	method2121(i_230_, i_231_, -295974940);
	if (0 == i_234_)
	    i_234_ = ((Class96) this).aClass639_1346.anInt8259 * 1118868451;
	int[] is_238_;
	if ((i_229_
	     < (i_234_
		+ (326424439 * ((Class96) this).aClass639_1346.anInt8260
		   + -351886683 * ((Class96) this).aClass639_1346.anInt8258)))
	    && i_229_ < i_234_ + i_234_)
	    is_238_ = null;
	else
	    is_238_ = new int[] { i_228_ };
	int i_239_
	    = ((Class96) this).aClass639_1346.method13565(string, is_238_,
							  aStringArray1343,
							  class168s,
							  (byte) 25);
	if (i_235_ == -1) {
	    i_235_ = i_229_ / i_234_;
	    if (i_235_ <= 0)
		i_235_ = 1;
	}
	if (i_235_ > 0 && i_239_ >= i_235_) {
	    aStringArray1343[i_235_ - 1]
		= ((Class96) this).aClass639_1346.method13564((aStringArray1343
							       [i_235_ - 1]),
							      i_228_,
							      class168s,
							      -1369419990);
	    i_239_ = i_235_;
	}
	if (3 == i_233_ && 1 == i_239_)
	    i_233_ = 1;
	int i_240_;
	if (0 == i_233_)
	    i_240_ = i_227_ + (-351886683
			       * ((Class96) this).aClass639_1346.anInt8258);
	else if (i_233_ == 1)
	    i_240_ = ((i_229_
		       - ((Class96) this).aClass639_1346.anInt8258 * -351886683
		       - 326424439 * ((Class96) this).aClass639_1346.anInt8260
		       - (i_239_ - 1) * i_234_) / 2
		      + (i_227_ + (((Class96) this).aClass639_1346.anInt8258
				   * -351886683)));
	else if (i_233_ == 2)
	    i_240_ = (i_229_ + i_227_
		      - 326424439 * ((Class96) this).aClass639_1346.anInt8260
		      - i_234_ * (i_239_ - 1));
	else {
	    int i_241_
		= ((i_229_
		    - ((Class96) this).aClass639_1346.anInt8258 * -351886683
		    - 326424439 * ((Class96) this).aClass639_1346.anInt8260
		    - i_234_ * (i_239_ - 1))
		   / (i_239_ + 1));
	    if (i_241_ < 0)
		i_241_ = 0;
	    i_240_
		= i_241_ + (i_227_ + -351886683 * (((Class96) this)
						   .aClass639_1346.anInt8258));
	    i_234_ += i_241_;
	}
	for (int i_242_ = 0; i_242_ < i_239_; i_242_++) {
	    if (i_232_ == 0)
		method2127(aStringArray1343[i_242_], i, i_240_, class168s, is,
			   class135, i_236_, i_237_, -991952184);
	    else if (1 == i_232_)
		method2127(aStringArray1343[i_242_],
			   i + (i_228_
				- (((Class96) this).aClass639_1346.method13562
				   (aStringArray1343[i_242_], (byte) 63))) / 2,
			   i_240_, class168s, is, class135, i_236_, i_237_,
			   -673550546);
	    else if (i_232_ == 2)
		method2127(aStringArray1343[i_242_],
			   (i + i_228_
			    - (((Class96) this).aClass639_1346.method13562
			       (aStringArray1343[i_242_], (byte) 45))),
			   i_240_, class168s, is, class135, i_236_, i_237_,
			   1635460313);
	    else if (i_239_ - 1 == i_242_)
		method2127(aStringArray1343[i_242_], i, i_240_, class168s, is,
			   class135, i_236_, i_237_, 332611160);
	    else {
		method2164(aStringArray1343[i_242_], i_228_, 1772499500);
		method2127(aStringArray1343[i_242_], i, i_240_, class168s, is,
			   class135, i_236_, i_237_, -1087432673);
		anInt1344 = 0;
	    }
	    i_240_ += i_234_;
	}
	return i_239_;
    }
    
    public int method2144
	(String string, int i, int i_243_, int i_244_, int i_245_, int i_246_,
	 int i_247_, int i_248_, int i_249_, int i_250_, Class168[] class168s,
	 int[] is, Class135 class135, int i_251_, int i_252_) {
	return method2115(string, i, i_243_, i_244_, i_245_, i_246_, i_247_,
			  i_248_, i_249_, i_250_, 0, class168s, is, class135,
			  i_251_, i_252_, (byte) 1);
    }
    
    public void method2145(String string, int i, int i_253_, int i_254_,
			   int i_255_, int i_256_) {
	if (null != string) {
	    method2121(i_254_, i_255_, -295974940);
	    int i_257_ = string.length();
	    int[] is = new int[i_257_];
	    for (int i_258_ = 0; i_258_ < i_257_; i_258_++)
		is[i_258_] = (int) (Math.sin((double) i_256_ / 5.0
					     + (double) i_258_ / 2.0)
				    * 5.0);
	    method2155(string,
		       i - ((Class96) this).aClass639_1346
			       .method13562(string, (byte) 107) / 2,
		       i_253_, null, null, null, is, (byte) -84);
	}
    }
    
    public void method2146(String string, int i, int i_259_, int i_260_,
			   int i_261_, int i_262_) {
	if (null != string) {
	    method2121(i_260_, i_261_, -295974940);
	    int i_263_ = string.length();
	    int[] is = new int[i_263_];
	    int[] is_264_ = new int[i_263_];
	    for (int i_265_ = 0; i_265_ < i_263_; i_265_++) {
		is[i_265_] = (int) (Math.sin((double) i_262_ / 5.0
					     + (double) i_265_ / 5.0)
				    * 5.0);
		is_264_[i_265_] = (int) (Math.sin((double) i_262_ / 5.0
						  + (double) i_265_ / 3.0)
					 * 5.0);
	    }
	    method2155(string,
		       i - ((Class96) this).aClass639_1346
			       .method13562(string, (byte) 25) / 2,
		       i_259_, null, null, is, is_264_, (byte) -120);
	}
    }
    
    void method2147(String string, int i) {
	int i_266_ = 0;
	boolean bool = false;
	for (int i_267_ = 0; i_267_ < string.length(); i_267_++) {
	    char c = string.charAt(i_267_);
	    if (c == '<')
		bool = true;
	    else if (c == '>')
		bool = false;
	    else if (!bool && c == ' ')
		i_266_++;
	}
	if (i_266_ > 0)
	    anInt1344
		= (i - ((Class96) this).aClass639_1346.method13562(string,
								   (byte) 17)
		   << 8) / i_266_ * -1654524141;
    }
    
    public int method2148(String string, int i, int i_268_, int i_269_,
			  int i_270_, int i_271_, int i_272_, int i_273_,
			  int i_274_, Random random, int i_275_, int[] is,
			  Class168[] class168s, int[] is_276_) {
	if (null == string)
	    return 0;
	random.setSeed((long) i_275_);
	int i_277_ = 192 + (random.nextInt() & 0x1f);
	method2121(i_277_ << 24 | i_271_ & 0xffffff,
		   -1 == i_272_ ? 0 : i_277_ << 24 | i_272_ & 0xffffff,
		   -295974940);
	int i_278_ = string.length();
	int[] is_279_ = new int[i_278_];
	int i_280_ = 0;
	for (int i_281_ = 0; i_281_ < i_278_; i_281_++) {
	    is_279_[i_281_] = i_280_;
	    if ((random.nextInt() & 0x3) == 0)
		i_280_++;
	}
	int i_282_ = i;
	int i_283_
	    = ((Class96) this).aClass639_1346.anInt8258 * -351886683 + i_268_;
	int i_284_ = -1;
	if (i_274_ == 1)
	    i_283_
		+= ((i_270_
		     - -351886683 * ((Class96) this).aClass639_1346.anInt8258
		     - ((Class96) this).aClass639_1346.anInt8260 * 326424439)
		    / 2);
	else if (i_274_ == 2)
	    i_283_ = (i_268_ + i_270_
		      - ((Class96) this).aClass639_1346.anInt8260 * 326424439);
	if (i_273_ == 1) {
	    i_284_ = (((Class96) this).aClass639_1346.method13562(string,
								  (byte) 77)
		      + i_280_);
	    i_282_ += (i_269_ - i_284_) / 2;
	} else if (2 == i_273_) {
	    i_284_ = (((Class96) this).aClass639_1346.method13562(string,
								  (byte) 50)
		      + i_280_);
	    i_282_ += i_269_ - i_284_;
	}
	method2155(string, i_282_, i_283_, class168s, is_276_, is_279_, null,
		   (byte) -63);
	if (is != null) {
	    if (i_284_ == -1)
		i_284_ = ((Class96) this).aClass639_1346
			     .method13562(string, (byte) 117) + i_280_;
	    is[0] = i_282_;
	    is[1] = (i_283_
		     - -351886683 * ((Class96) this).aClass639_1346.anInt8258);
	    is[2] = i_284_;
	    is[3] = (-351886683 * ((Class96) this).aClass639_1346.anInt8258
		     + ((Class96) this).aClass639_1346.anInt8260 * 326424439);
	}
	return i_280_;
    }
    
    public void method2149(String string, int i, int i_285_, int i_286_,
			   int i_287_, int i_288_) {
	if (null != string) {
	    method2121(i_286_, i_287_, -295974940);
	    int i_289_ = string.length();
	    int[] is = new int[i_289_];
	    int[] is_290_ = new int[i_289_];
	    for (int i_291_ = 0; i_291_ < i_289_; i_291_++) {
		is[i_291_] = (int) (Math.sin((double) i_288_ / 5.0
					     + (double) i_291_ / 5.0)
				    * 5.0);
		is_290_[i_291_] = (int) (Math.sin((double) i_288_ / 5.0
						  + (double) i_291_ / 3.0)
					 * 5.0);
	    }
	    method2155(string,
		       i - ((Class96) this).aClass639_1346
			       .method13562(string, (byte) 101) / 2,
		       i_285_, null, null, is, is_290_, (byte) -44);
	}
    }
    
    void method2150(String string, int i, int i_292_, Class168[] class168s,
		    int[] is, int[] is_293_, int[] is_294_) {
	i_292_ -= 1118868451 * ((Class96) this).aClass639_1346.anInt8259;
	int i_295_ = -1;
	int i_296_ = -1;
	int i_297_ = 0;
	int i_298_ = string.length();
	for (int i_299_ = 0; i_299_ < i_298_; i_299_++) {
	    char c
		= (char) (Class76.method1773(string.charAt(i_299_), 606361826)
			  & 0xff);
	    if (c == 60)
		i_295_ = i_299_;
	    else {
		if (c == 62 && i_295_ != -1) {
		    String string_300_ = string.substring(1 + i_295_, i_299_);
		    i_295_ = -1;
		    if (string_300_.equals("lt"))
			c = '<';
		    else if (string_300_.equals("gt"))
			c = '>';
		    else if (string_300_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_300_.equals("shy"))
			c = '\u00ad';
		    else if (string_300_.equals("times"))
			c = '\u00d7';
		    else if (string_300_.equals("euro"))
			c = '\u20ac';
		    else if (string_300_.equals("copy"))
			c = '\u00a9';
		    else if (string_300_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_300_.startsWith("img=")) {
			    try {
				int i_301_;
				if (null != is_293_)
				    i_301_ = is_293_[i_297_];
				else
				    i_301_ = 0;
				int i_302_;
				if (null != is_294_)
				    i_302_ = is_294_[i_297_];
				else
				    i_302_ = 0;
				i_297_++;
				int i_303_
				    = Class324.method5975(string_300_
							      .substring(4),
							  -952789660);
				Class168 class168 = class168s[i_303_];
				int i_304_ = (is != null ? is[i_303_]
					      : class168.method3616());
				class168.method3666(i + i_301_,
						    (i_292_
						     + (1118868451
							* (((Class96) this)
							   .aClass639_1346
							   .anInt8259))
						     - i_304_ + i_302_),
						    1, -1, 1);
				i += class168s[i_303_].method64();
				i_296_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else
			    method2122(string_300_, 2066980415);
			continue;
		    }
		}
		if (-1 == i_295_) {
		    if (i_296_ != -1)
			i += ((Class96) this).aClass639_1346
				 .method13560(i_296_, c, -1912008558);
		    int i_305_;
		    if (is_293_ != null)
			i_305_ = is_293_[i_297_];
		    else
			i_305_ = 0;
		    int i_306_;
		    if (is_294_ != null)
			i_306_ = is_294_[i_297_];
		    else
			i_306_ = 0;
		    i_297_++;
		    if (32 != c) {
			if (0 != (anInt1339 * -1890722745 & ~0xffffff))
			    method2126(c, i_305_ + (i + 1),
				       i_306_ + (1 + i_292_),
				       anInt1339 * -1890722745, true);
			method2126(c, i_305_ + i, i_292_ + i_306_,
				   anInt1341 * -1072394107, false);
		    } else if (anInt1344 * -389911781 > 0) {
			anInt1345 += anInt1344 * 2012874999;
			i += anInt1345 * -1199035907 >> 8;
			anInt1345
			    = 114031445 * (-1199035907 * anInt1345 & 0xff);
		    }
		    int i_307_ = ((Class96) this).aClass639_1346
				     .method13561(c, 1175929846);
		    if (-1 != anInt1337 * 1849099083)
			((Class96) this).aClass103_1334.method2265
			    (i,
			     (int) ((double) ((((Class96) this).aClass639_1346
					       .anInt8259)
					      * 1118868451)
				    * 0.7) + i_292_,
			     i_307_, 1849099083 * anInt1337, -2083774800);
		    if (-1 != 1886802453 * anInt1340)
			((Class96) this).aClass103_1334.method2265
			    (i,
			     i_292_ + 1118868451 * (((Class96) this)
						    .aClass639_1346.anInt8259),
			     i_307_, 1886802453 * anInt1340, 1767225276);
		    i += i_307_;
		    i_296_ = c;
		}
	    }
	}
    }
    
    abstract void method2151(char c, int i, int i_308_, int i_309_,
			     boolean bool, Class135 class135, int i_310_,
			     int i_311_);
    
    public void method2152(String string, int i, int i_312_, int i_313_,
			   int i_314_, int i_315_, int i_316_) {
	if (null != string) {
	    method2121(i_313_, i_314_, -295974940);
	    double d = 7.0 - (double) i_316_ / 8.0;
	    if (d < 0.0)
		d = 0.0;
	    int i_317_ = string.length();
	    int[] is = new int[i_317_];
	    for (int i_318_ = 0; i_318_ < i_317_; i_318_++)
		is[i_318_] = (int) (Math.sin((double) i_318_ / 1.5
					     + (double) i_315_ / 1.0)
				    * d);
	    method2155(string,
		       i - ((Class96) this).aClass639_1346
			       .method13562(string, (byte) 16) / 2,
		       i_312_, null, null, null, is, (byte) -67);
	}
    }
    
    abstract void method2153(char c, int i, int i_319_, int i_320_,
			     boolean bool);
    
    abstract void method2154(char c, int i, int i_321_, int i_322_,
			     boolean bool);
    
    void method2155(String string, int i, int i_323_, Class168[] class168s,
		    int[] is, int[] is_324_, int[] is_325_, byte i_326_) {
	i_323_ -= 1118868451 * ((Class96) this).aClass639_1346.anInt8259;
	int i_327_ = -1;
	int i_328_ = -1;
	int i_329_ = 0;
	int i_330_ = string.length();
	for (int i_331_ = 0; i_331_ < i_330_; i_331_++) {
	    char c
		= (char) (Class76.method1773(string.charAt(i_331_), 1191130524)
			  & 0xff);
	    if (c == 60)
		i_327_ = i_331_;
	    else {
		if (c == 62 && i_327_ != -1) {
		    String string_332_ = string.substring(1 + i_327_, i_331_);
		    i_327_ = -1;
		    if (string_332_.equals("lt"))
			c = '<';
		    else if (string_332_.equals("gt"))
			c = '>';
		    else if (string_332_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_332_.equals("shy"))
			c = '\u00ad';
		    else if (string_332_.equals("times"))
			c = '\u00d7';
		    else if (string_332_.equals("euro"))
			c = '\u20ac';
		    else if (string_332_.equals("copy"))
			c = '\u00a9';
		    else if (string_332_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_332_.startsWith("img=")) {
			    try {
				int i_333_;
				if (null != is_324_)
				    i_333_ = is_324_[i_329_];
				else
				    i_333_ = 0;
				int i_334_;
				if (null != is_325_)
				    i_334_ = is_325_[i_329_];
				else
				    i_334_ = 0;
				i_329_++;
				int i_335_
				    = Class324.method5975(string_332_
							      .substring(4),
							  -952789660);
				Class168 class168 = class168s[i_335_];
				int i_336_ = (is != null ? is[i_335_]
					      : class168.method3616());
				class168.method3666(i + i_333_,
						    (i_323_
						     + (1118868451
							* (((Class96) this)
							   .aClass639_1346
							   .anInt8259))
						     - i_336_ + i_334_),
						    1, -1, 1);
				i += class168s[i_335_].method64();
				i_328_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else
			    method2122(string_332_, -1702209888);
			continue;
		    }
		}
		if (-1 == i_327_) {
		    if (i_328_ != -1)
			i += ((Class96) this).aClass639_1346
				 .method13560(i_328_, c, -1912008558);
		    int i_337_;
		    if (is_324_ != null)
			i_337_ = is_324_[i_329_];
		    else
			i_337_ = 0;
		    int i_338_;
		    if (is_325_ != null)
			i_338_ = is_325_[i_329_];
		    else
			i_338_ = 0;
		    i_329_++;
		    if (32 != c) {
			if (0 != (anInt1339 * -1890722745 & ~0xffffff))
			    method2126(c, i_337_ + (i + 1),
				       i_338_ + (1 + i_323_),
				       anInt1339 * -1890722745, true);
			method2126(c, i_337_ + i, i_323_ + i_338_,
				   anInt1341 * -1072394107, false);
		    } else if (anInt1344 * -389911781 > 0) {
			anInt1345 += anInt1344 * 2012874999;
			i += anInt1345 * -1199035907 >> 8;
			anInt1345
			    = 114031445 * (-1199035907 * anInt1345 & 0xff);
		    }
		    int i_339_ = ((Class96) this).aClass639_1346
				     .method13561(c, 1720362680);
		    if (-1 != anInt1337 * 1849099083)
			((Class96) this).aClass103_1334.method2265
			    (i,
			     (int) ((double) ((((Class96) this).aClass639_1346
					       .anInt8259)
					      * 1118868451)
				    * 0.7) + i_323_,
			     i_339_, 1849099083 * anInt1337, -781039331);
		    if (-1 != 1886802453 * anInt1340)
			((Class96) this).aClass103_1334.method2265
			    (i,
			     i_323_ + 1118868451 * (((Class96) this)
						    .aClass639_1346.anInt8259),
			     i_339_, 1886802453 * anInt1340, 2076369353);
		    i += i_339_;
		    i_328_ = c;
		}
	    }
	}
    }
    
    void method2156(String string) {
	try {
	    if (string.startsWith("col="))
		anInt1341 = ((anInt1341 * -1072394107 & ~0xffffff
			      | Class200.method4072(string.substring(4), 16,
						    -1305295665) & 0xffffff)
			     * 519628877);
	    else if (string.equals("/col"))
		anInt1341 = 519628877 * (anInt1341 * -1072394107 & ~0xffffff
					 | anInt1333 * 283909187 & 0xffffff);
	    if (string.startsWith("argb="))
		anInt1341 = Class200.method4072(string.substring(5), 16,
						2098193828) * 519628877;
	    else if (string.equals("/argb"))
		anInt1341 = 1267284007 * anInt1333;
	    else if (string.startsWith("str="))
		anInt1337 = (-1072394107 * anInt1341 & ~0xffffff
			     | Class200.method4072(string.substring(4), 16,
						   -189855072)) * 515829347;
	    else if (string.equals("str"))
		anInt1337 = 515829347 * (-1072394107 * anInt1341 & ~0xffffff
					 | 0x800000);
	    else if (string.equals("/str"))
		anInt1337 = -515829347;
	    else if (string.startsWith("u="))
		anInt1340 = (-1072394107 * anInt1341 & ~0xffffff
			     | Class200.method4072(string.substring(2), 16,
						   1113481682)) * -204608195;
	    else if (string.equals("u"))
		anInt1340 = (anInt1341 * -1072394107 & ~0xffffff) * -204608195;
	    else if (string.equals("/u"))
		anInt1340 = 204608195;
	    else if (string.equalsIgnoreCase("shad=-1"))
		anInt1339 = 0;
	    else if (string.startsWith("shad="))
		anInt1339 = (anInt1341 * -1072394107 & ~0xffffff
			     | Class200.method4072(string.substring(5), 16,
						   878715278)) * 2129202551;
	    else if (string.equals("shad"))
		anInt1339 = 2129202551 * (-1072394107 * anInt1341 & ~0xffffff);
	    else if (string.equals("/shad"))
		anInt1339 = 16418621 * anInt1342;
	    else if (string.equals("br"))
		method2121(283909187 * anInt1333, 1376579051 * anInt1342,
			   -295974940);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    void method2157(String string) {
	try {
	    if (string.startsWith("col="))
		anInt1341 = ((anInt1341 * -1072394107 & ~0xffffff
			      | Class200.method4072(string.substring(4), 16,
						    -103899413) & 0xffffff)
			     * 519628877);
	    else if (string.equals("/col"))
		anInt1341 = 519628877 * (anInt1341 * -1072394107 & ~0xffffff
					 | anInt1333 * 283909187 & 0xffffff);
	    if (string.startsWith("argb="))
		anInt1341 = Class200.method4072(string.substring(5), 16,
						347759570) * 519628877;
	    else if (string.equals("/argb"))
		anInt1341 = 1267284007 * anInt1333;
	    else if (string.startsWith("str="))
		anInt1337 = (-1072394107 * anInt1341 & ~0xffffff
			     | Class200.method4072(string.substring(4), 16,
						   -1248993083)) * 515829347;
	    else if (string.equals("str"))
		anInt1337 = 515829347 * (-1072394107 * anInt1341 & ~0xffffff
					 | 0x800000);
	    else if (string.equals("/str"))
		anInt1337 = -515829347;
	    else if (string.startsWith("u="))
		anInt1340 = (-1072394107 * anInt1341 & ~0xffffff
			     | Class200.method4072(string.substring(2), 16,
						   -275577998)) * -204608195;
	    else if (string.equals("u"))
		anInt1340 = (anInt1341 * -1072394107 & ~0xffffff) * -204608195;
	    else if (string.equals("/u"))
		anInt1340 = 204608195;
	    else if (string.equalsIgnoreCase("shad=-1"))
		anInt1339 = 0;
	    else if (string.startsWith("shad="))
		anInt1339 = (anInt1341 * -1072394107 & ~0xffffff
			     | Class200.method4072(string.substring(5), 16,
						   785379403)) * 2129202551;
	    else if (string.equals("shad"))
		anInt1339 = 2129202551 * (-1072394107 * anInt1341 & ~0xffffff);
	    else if (string.equals("/shad"))
		anInt1339 = 16418621 * anInt1342;
	    else if (string.equals("br"))
		method2121(283909187 * anInt1333, 1376579051 * anInt1342,
			   -295974940);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public void method2158(String string, int i, int i_340_, int i_341_,
			   int i_342_, int i_343_) {
	if (null != string) {
	    method2121(i_341_, i_342_, -295974940);
	    int i_344_ = string.length();
	    int[] is = new int[i_344_];
	    int[] is_345_ = new int[i_344_];
	    for (int i_346_ = 0; i_346_ < i_344_; i_346_++) {
		is[i_346_] = (int) (Math.sin((double) i_343_ / 5.0
					     + (double) i_346_ / 5.0)
				    * 5.0);
		is_345_[i_346_] = (int) (Math.sin((double) i_343_ / 5.0
						  + (double) i_346_ / 3.0)
					 * 5.0);
	    }
	    method2155(string,
		       i - ((Class96) this).aClass639_1346
			       .method13562(string, (byte) 70) / 2,
		       i_340_, null, null, is, is_345_, (byte) -15);
	}
    }
    
    void method2159(String string) {
	try {
	    if (string.startsWith("col="))
		anInt1341 = ((anInt1341 * -1072394107 & ~0xffffff
			      | Class200.method4072(string.substring(4), 16,
						    621702114) & 0xffffff)
			     * 519628877);
	    else if (string.equals("/col"))
		anInt1341 = 519628877 * (anInt1341 * -1072394107 & ~0xffffff
					 | anInt1333 * 283909187 & 0xffffff);
	    if (string.startsWith("argb="))
		anInt1341 = Class200.method4072(string.substring(5), 16,
						-721522008) * 519628877;
	    else if (string.equals("/argb"))
		anInt1341 = 1267284007 * anInt1333;
	    else if (string.startsWith("str="))
		anInt1337 = (-1072394107 * anInt1341 & ~0xffffff
			     | Class200.method4072(string.substring(4), 16,
						   -101017378)) * 515829347;
	    else if (string.equals("str"))
		anInt1337 = 515829347 * (-1072394107 * anInt1341 & ~0xffffff
					 | 0x800000);
	    else if (string.equals("/str"))
		anInt1337 = -515829347;
	    else if (string.startsWith("u="))
		anInt1340 = (-1072394107 * anInt1341 & ~0xffffff
			     | Class200.method4072(string.substring(2), 16,
						   -2033041561)) * -204608195;
	    else if (string.equals("u"))
		anInt1340 = (anInt1341 * -1072394107 & ~0xffffff) * -204608195;
	    else if (string.equals("/u"))
		anInt1340 = 204608195;
	    else if (string.equalsIgnoreCase("shad=-1"))
		anInt1339 = 0;
	    else if (string.startsWith("shad="))
		anInt1339 = (anInt1341 * -1072394107 & ~0xffffff
			     | Class200.method4072(string.substring(5), 16,
						   -488392117)) * 2129202551;
	    else if (string.equals("shad"))
		anInt1339 = 2129202551 * (-1072394107 * anInt1341 & ~0xffffff);
	    else if (string.equals("/shad"))
		anInt1339 = 16418621 * anInt1342;
	    else if (string.equals("br"))
		method2121(283909187 * anInt1333, 1376579051 * anInt1342,
			   -295974940);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public void method2160(String string, int i, int i_347_, int i_348_,
			   int i_349_, int i_350_) {
	if (null != string) {
	    method2121(i_348_, i_349_, -295974940);
	    int i_351_ = string.length();
	    int[] is = new int[i_351_];
	    for (int i_352_ = 0; i_352_ < i_351_; i_352_++)
		is[i_352_] = (int) (Math.sin((double) i_350_ / 5.0
					     + (double) i_352_ / 2.0)
				    * 5.0);
	    method2155(string,
		       i - ((Class96) this).aClass639_1346
			       .method13562(string, (byte) 33) / 2,
		       i_347_, null, null, null, is, (byte) -61);
	}
    }
    
    void method2161(String string, int i, int i_353_, Class168[] class168s,
		    int[] is, Class135 class135, int i_354_, int i_355_) {
	i_353_ -= ((Class96) this).aClass639_1346.anInt8259 * 1118868451;
	int i_356_ = -1;
	int i_357_ = -1;
	int i_358_ = string.length();
	for (int i_359_ = 0; i_359_ < i_358_; i_359_++) {
	    char c
		= (char) (Class76.method1773(string.charAt(i_359_), 1814675056)
			  & 0xff);
	    if (60 == c)
		i_356_ = i_359_;
	    else {
		if (62 == c && -1 != i_356_) {
		    String string_360_ = string.substring(i_356_ + 1, i_359_);
		    i_356_ = -1;
		    if (string_360_.equals("lt"))
			c = '<';
		    else if (string_360_.equals("gt"))
			c = '>';
		    else if (string_360_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_360_.equals("shy"))
			c = '\u00ad';
		    else if (string_360_.equals("times"))
			c = '\u00d7';
		    else if (string_360_.equals("euro"))
			c = '\u20ac';
		    else if (string_360_.equals("copy"))
			c = '\u00a9';
		    else if (string_360_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_360_.startsWith("img=")) {
			    try {
				int i_361_
				    = Class324.method5975(string_360_
							      .substring(4),
							  -952789660);
				Class168 class168 = class168s[i_361_];
				int i_362_ = (null != is ? is[i_361_]
					      : class168.method3616());
				if (-16777216
				    == (anInt1341 * -1072394107 & ~0xffffff))
				    class168.method3666(i,
							(((((Class96) this)
							   .aClass639_1346
							   .anInt8259)
							  * 1118868451)
							 + i_353_ - i_362_),
							1, -1, 1);
				else
				    class168.method3666
					(i,
					 i_353_ + ((((Class96) this)
						    .aClass639_1346.anInt8259)
						   * 1118868451) - i_362_,
					 0,
					 (-1072394107 * anInt1341 & ~0xffffff
					  | 0xffffff),
					 1);
				i += class168s[i_361_].method64();
				i_357_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else
			    method2122(string_360_, -1331308640);
			continue;
		    }
		}
		if (-1 == i_356_) {
		    if (i_357_ != -1)
			i += ((Class96) this).aClass639_1346
				 .method13560(i_357_, c, -1912008558);
		    if (32 != c) {
			if (null == class135) {
			    if ((anInt1339 * -1890722745 & ~0xffffff) != 0)
				method2126(c, 1 + i, 1 + i_353_,
					   -1890722745 * anInt1339, true);
			    method2126(c, i, i_353_, anInt1341 * -1072394107,
				       false);
			} else {
			    if ((-1890722745 * anInt1339 & ~0xffffff) != 0)
				method2140(c, 1 + i, 1 + i_353_,
					   anInt1339 * -1890722745, true,
					   class135, i_354_, i_355_);
			    method2140(c, i, i_353_, anInt1341 * -1072394107,
				       false, class135, i_354_, i_355_);
			}
		    } else if (-389911781 * anInt1344 > 0) {
			anInt1345 += anInt1344 * 2012874999;
			i += -1199035907 * anInt1345 >> 8;
			anInt1345
			    = (-1199035907 * anInt1345 & 0xff) * 114031445;
		    }
		    int i_363_ = ((Class96) this).aClass639_1346
				     .method13561(c, 2106204454);
		    if (-1 != anInt1337 * 1849099083)
			((Class96) this).aClass103_1334.method2265
			    (i,
			     i_353_ + (int) ((double) (1118868451
						       * (((Class96) this)
							  .aClass639_1346
							  .anInt8259))
					     * 0.7),
			     i_363_, 1849099083 * anInt1337, -108593765);
		    if (anInt1340 * 1886802453 != -1)
			((Class96) this).aClass103_1334.method2265
			    (i,
			     i_353_ + (((Class96) this).aClass639_1346
				       .anInt8259) * 1118868451 + 1,
			     i_363_, 1886802453 * anInt1340, 1969987382);
		    i += i_363_;
		    i_357_ = c;
		}
	    }
	}
    }
    
    void method2162(String string, int i, int i_364_, Class168[] class168s,
		    int[] is, Class135 class135, int i_365_, int i_366_) {
	i_364_ -= ((Class96) this).aClass639_1346.anInt8259 * 1118868451;
	int i_367_ = -1;
	int i_368_ = -1;
	int i_369_ = string.length();
	for (int i_370_ = 0; i_370_ < i_369_; i_370_++) {
	    char c
		= (char) (Class76.method1773(string.charAt(i_370_), 1953447504)
			  & 0xff);
	    if (60 == c)
		i_367_ = i_370_;
	    else {
		if (62 == c && -1 != i_367_) {
		    String string_371_ = string.substring(i_367_ + 1, i_370_);
		    i_367_ = -1;
		    if (string_371_.equals("lt"))
			c = '<';
		    else if (string_371_.equals("gt"))
			c = '>';
		    else if (string_371_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_371_.equals("shy"))
			c = '\u00ad';
		    else if (string_371_.equals("times"))
			c = '\u00d7';
		    else if (string_371_.equals("euro"))
			c = '\u20ac';
		    else if (string_371_.equals("copy"))
			c = '\u00a9';
		    else if (string_371_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_371_.startsWith("img=")) {
			    try {
				int i_372_
				    = Class324.method5975(string_371_
							      .substring(4),
							  -952789660);
				Class168 class168 = class168s[i_372_];
				int i_373_ = (null != is ? is[i_372_]
					      : class168.method3616());
				if (-16777216
				    == (anInt1341 * -1072394107 & ~0xffffff))
				    class168.method3666(i,
							(((((Class96) this)
							   .aClass639_1346
							   .anInt8259)
							  * 1118868451)
							 + i_364_ - i_373_),
							1, -1, 1);
				else
				    class168.method3666
					(i,
					 i_364_ + ((((Class96) this)
						    .aClass639_1346.anInt8259)
						   * 1118868451) - i_373_,
					 0,
					 (-1072394107 * anInt1341 & ~0xffffff
					  | 0xffffff),
					 1);
				i += class168s[i_372_].method64();
				i_368_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else
			    method2122(string_371_, -1688811520);
			continue;
		    }
		}
		if (-1 == i_367_) {
		    if (i_368_ != -1)
			i += ((Class96) this).aClass639_1346
				 .method13560(i_368_, c, -1912008558);
		    if (32 != c) {
			if (null == class135) {
			    if ((anInt1339 * -1890722745 & ~0xffffff) != 0)
				method2126(c, 1 + i, 1 + i_364_,
					   -1890722745 * anInt1339, true);
			    method2126(c, i, i_364_, anInt1341 * -1072394107,
				       false);
			} else {
			    if ((-1890722745 * anInt1339 & ~0xffffff) != 0)
				method2140(c, 1 + i, 1 + i_364_,
					   anInt1339 * -1890722745, true,
					   class135, i_365_, i_366_);
			    method2140(c, i, i_364_, anInt1341 * -1072394107,
				       false, class135, i_365_, i_366_);
			}
		    } else if (-389911781 * anInt1344 > 0) {
			anInt1345 += anInt1344 * 2012874999;
			i += -1199035907 * anInt1345 >> 8;
			anInt1345
			    = (-1199035907 * anInt1345 & 0xff) * 114031445;
		    }
		    int i_374_ = ((Class96) this).aClass639_1346
				     .method13561(c, 1195847633);
		    if (-1 != anInt1337 * 1849099083)
			((Class96) this).aClass103_1334.method2265
			    (i,
			     i_364_ + (int) ((double) (1118868451
						       * (((Class96) this)
							  .aClass639_1346
							  .anInt8259))
					     * 0.7),
			     i_374_, 1849099083 * anInt1337, -1223352088);
		    if (anInt1340 * 1886802453 != -1)
			((Class96) this).aClass103_1334.method2265
			    (i,
			     i_364_ + (((Class96) this).aClass639_1346
				       .anInt8259) * 1118868451 + 1,
			     i_374_, 1886802453 * anInt1340, 848121020);
		    i += i_374_;
		    i_368_ = c;
		}
	    }
	}
    }
    
    public int method2163(String string, int i, int i_375_, int i_376_,
			  int i_377_, Random random, int i_378_,
			  Class168[] class168s, int[] is) {
	if (null == string)
	    return 0;
	random.setSeed((long) i_378_);
	int i_379_ = 192 + (random.nextInt() & 0x1f);
	method2121(i_379_ << 24 | i_376_ & 0xffffff,
		   i_379_ << 24 | i_377_ & 0xffffff, -295974940);
	int i_380_ = string.length();
	int[] is_381_ = new int[i_380_];
	int i_382_ = 0;
	for (int i_383_ = 0; i_383_ < i_380_; i_383_++) {
	    is_381_[i_383_] = i_382_;
	    if ((random.nextInt() & 0x3) == 0)
		i_382_++;
	}
	method2155(string, i, i_375_, class168s, is, is_381_, null,
		   (byte) -122);
	return i_382_;
    }
    
    void method2164(String string, int i, int i_384_) {
	int i_385_ = 0;
	boolean bool = false;
	for (int i_386_ = 0; i_386_ < string.length(); i_386_++) {
	    char c = string.charAt(i_386_);
	    if (c == '<')
		bool = true;
	    else if (c == '>')
		bool = false;
	    else if (!bool && c == ' ')
		i_385_++;
	}
	if (i_385_ > 0)
	    anInt1344
		= (i - ((Class96) this).aClass639_1346.method13562(string,
								   (byte) 100)
		   << 8) / i_385_ * -1654524141;
    }
    
    void method2165(String string, int i, int i_387_, Class168[] class168s,
		    int[] is, int[] is_388_, int[] is_389_) {
	i_387_ -= 1118868451 * ((Class96) this).aClass639_1346.anInt8259;
	int i_390_ = -1;
	int i_391_ = -1;
	int i_392_ = 0;
	int i_393_ = string.length();
	for (int i_394_ = 0; i_394_ < i_393_; i_394_++) {
	    char c
		= (char) (Class76.method1773(string.charAt(i_394_), 478989502)
			  & 0xff);
	    if (c == 60)
		i_390_ = i_394_;
	    else {
		if (c == 62 && i_390_ != -1) {
		    String string_395_ = string.substring(1 + i_390_, i_394_);
		    i_390_ = -1;
		    if (string_395_.equals("lt"))
			c = '<';
		    else if (string_395_.equals("gt"))
			c = '>';
		    else if (string_395_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_395_.equals("shy"))
			c = '\u00ad';
		    else if (string_395_.equals("times"))
			c = '\u00d7';
		    else if (string_395_.equals("euro"))
			c = '\u20ac';
		    else if (string_395_.equals("copy"))
			c = '\u00a9';
		    else if (string_395_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_395_.startsWith("img=")) {
			    try {
				int i_396_;
				if (null != is_388_)
				    i_396_ = is_388_[i_392_];
				else
				    i_396_ = 0;
				int i_397_;
				if (null != is_389_)
				    i_397_ = is_389_[i_392_];
				else
				    i_397_ = 0;
				i_392_++;
				int i_398_
				    = Class324.method5975(string_395_
							      .substring(4),
							  -952789660);
				Class168 class168 = class168s[i_398_];
				int i_399_ = (is != null ? is[i_398_]
					      : class168.method3616());
				class168.method3666(i + i_396_,
						    (i_387_
						     + (1118868451
							* (((Class96) this)
							   .aClass639_1346
							   .anInt8259))
						     - i_399_ + i_397_),
						    1, -1, 1);
				i += class168s[i_398_].method64();
				i_391_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else
			    method2122(string_395_, -48057560);
			continue;
		    }
		}
		if (-1 == i_390_) {
		    if (i_391_ != -1)
			i += ((Class96) this).aClass639_1346
				 .method13560(i_391_, c, -1912008558);
		    int i_400_;
		    if (is_388_ != null)
			i_400_ = is_388_[i_392_];
		    else
			i_400_ = 0;
		    int i_401_;
		    if (is_389_ != null)
			i_401_ = is_389_[i_392_];
		    else
			i_401_ = 0;
		    i_392_++;
		    if (32 != c) {
			if (0 != (anInt1339 * -1890722745 & ~0xffffff))
			    method2126(c, i_400_ + (i + 1),
				       i_401_ + (1 + i_387_),
				       anInt1339 * -1890722745, true);
			method2126(c, i_400_ + i, i_387_ + i_401_,
				   anInt1341 * -1072394107, false);
		    } else if (anInt1344 * -389911781 > 0) {
			anInt1345 += anInt1344 * 2012874999;
			i += anInt1345 * -1199035907 >> 8;
			anInt1345
			    = 114031445 * (-1199035907 * anInt1345 & 0xff);
		    }
		    int i_402_ = ((Class96) this).aClass639_1346
				     .method13561(c, 1918142640);
		    if (-1 != anInt1337 * 1849099083)
			((Class96) this).aClass103_1334.method2265
			    (i,
			     (int) ((double) ((((Class96) this).aClass639_1346
					       .anInt8259)
					      * 1118868451)
				    * 0.7) + i_387_,
			     i_402_, 1849099083 * anInt1337, -494698182);
		    if (-1 != 1886802453 * anInt1340)
			((Class96) this).aClass103_1334.method2265
			    (i,
			     i_387_ + 1118868451 * (((Class96) this)
						    .aClass639_1346.anInt8259),
			     i_402_, 1886802453 * anInt1340, -1038830694);
		    i += i_402_;
		    i_391_ = c;
		}
	    }
	}
    }
    
    static final void method2166(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 1736754263;
	int i_403_ = (((ClientScriptData) class454).integerStack
		      [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	ChatLine class241_sub39_sub4
	    = Class199.method4039(i_403_, (byte) 68);
	if (class241_sub39_sub4 != null) {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1)]
		= class241_sub39_sub4.type * 1522925273;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1)]
		= class241_sub39_sub4.time * -1719033875;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1)]
		= 978963203 * class241_sub39_sub4.flags;
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1)]
		= (class241_sub39_sub4.name != null
		   ? class241_sub39_sub4.name : "");
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1)]
		= (null != class241_sub39_sub4.nameUnfiltered
		   ? class241_sub39_sub4.nameUnfiltered : "");
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1)]
		= (class241_sub39_sub4.nameSimple != null
		   ? class241_sub39_sub4.nameSimple : "");
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= (class241_sub39_sub4.clan != null
		   ? class241_sub39_sub4.clan : "");
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 208492299 * class241_sub39_sub4.anInt10836;
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= (null != class241_sub39_sub4.message
		   ? class241_sub39_sub4.message : "");
	} else {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	}
    }
    
    static final void method2167(ClientScriptData class454, int i)
	throws Exception_Sub5 {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	Class445_Sub16.aClass351_Sub1_8660.method6337
	    ((float) (((ClientScriptData) class454).integerStack
		      [1482319719 * ((ClientScriptData) class454).intStackPointer]),
	     (float) (((ClientScriptData) class454).integerStack
		      [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]),
	     (float) (((ClientScriptData) class454).integerStack
		      [((ClientScriptData) class454).intStackPointer * 1482319719 + 2]),
	     (byte) -114);
    }
    
    static void method2168(int i, String string, boolean bool, int i_404_) {
	RSGraphics.method4916((byte) 8);
	Class579.method12712((byte) 92);
	Class469.method10757(1989249705);
	HitMarkTypeList.method12292(i, string, bool, 1394534025);
	Class425.aClass344_6080.method6136(1333460571);
	Class425.aClass344_6080.method6135(client.anInterface26_8552,
					   1650945080);
	Class446.method7897(Class236.aClass103_2713, 1884166650);
	LoadingScreenDef.method6481(Class236.aClass103_2713, Class284.SPRITES_ARCHIVE,
			    2147483647);
	Class590.method12911(-583580992);
	Class384.method6947(Class445_Sub9.aClass168Array8642, 1543190687);
	Class69.method1683((byte) 14);
	Class561.method12369(262144);
	if (1766317249 * client.anInt8288 == 17)
	    Class496.setClientStage(13, (byte) -74);
	else if (1766317249 * client.anInt8288 == 2)
	    Class496.setClientStage(1, (byte) -18);
	else if (1766317249 * client.anInt8288 == 16)
	    Class496.setClientStage(14, (byte) -14);
	else if (19 == client.anInt8288 * 1766317249)
	    Class496.setClientStage(9, (byte) -14);
	else if (18 == client.anInt8288 * 1766317249
		 || 15 == client.anInt8288 * 1766317249)
	    Class249.method5004(127123796);
	else if (1766317249 * client.anInt8288 == 8)
	    Class496.setClientStage(3, (byte) -59);
	else if (9 == 1766317249 * client.anInt8288)
	    Class19.method881(false, 848263090);
    }
    
    static final void method2169(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_405_ = (((ClientScriptData) class454).integerStack
		      [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_406_ = (((ClientScriptData) class454).integerStack
		      [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	if (i_405_ == 0)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= (int) Math.pow((double) i_405_, (double) i_406_);
    }
}
