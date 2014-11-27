/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class99
{
    static int anInt1355;
    static int anInt1356;
    static int anInt1357;
    static int[] anIntArray1358;
    static int anInt1359;
    static int anInt1360;
    static int anInt1361;
    static int anInt1362;
    
    static boolean method2175(int i) {
	int i_0_ = anInt1362;
	int i_1_ = anInt1355;
	int i_2_ = anInt1357;
	int i_3_;
	for (/**/; i_1_ >= i_0_; i_1_ = i_3_) {
	    anInt1357 = ++i_2_;
	    if (i_2_ >= i)
		return false;
	    i_3_ = anInt1360;
	    for (/**/; i_0_ < anInt1359; i_0_ += 4) {
		int i_4_ = anIntArray1358[i_0_ + 1];
		if (i_2_ < i_4_)
		    break;
		int i_5_ = anIntArray1358[i_0_];
		int i_6_ = anIntArray1358[i_0_ + 2];
		int i_7_ = anIntArray1358[i_0_ + 3];
		int i_8_ = (i_6_ - i_5_ << 16) / (i_7_ - i_4_);
		int i_9_ = (i_5_ << 16) + 32768;
		anIntArray1358[i_0_] = i_9_;
		anIntArray1358[i_0_ + 2] = i_8_;
	    }
	    for (int i_10_ = i_3_; i_10_ < i_0_; i_10_ += 4) {
		int i_11_ = anIntArray1358[i_10_ + 3];
		if (i_2_ >= i_11_) {
		    anIntArray1358[i_10_] = anIntArray1358[i_3_];
		    anIntArray1358[i_10_ + 1] = anIntArray1358[i_3_ + 1];
		    anIntArray1358[i_10_ + 2] = anIntArray1358[i_3_ + 2];
		    anIntArray1358[i_10_ + 3] = anIntArray1358[i_3_ + 3];
		    i_3_ += 4;
		}
	    }
	    if (i_3_ == anInt1359) {
		anInt1359 = 0;
		return false;
	    }
	    method2182(i_3_, i_0_);
	    anInt1360 = i_3_;
	    anInt1362 = i_0_;
	}
	anInt1361 = anIntArray1358[i_1_] >> 16;
	anInt1356 = anIntArray1358[i_1_ + 4] >> 16;
	anIntArray1358[i_1_] += anIntArray1358[i_1_ + 2];
	anIntArray1358[i_1_ + 4] += anIntArray1358[i_1_ + 6];
	i_1_ += 8;
	anInt1355 = i_1_;
	return true;
    }
    
    public static void method2176(Class103 class103, int[] is, int i) {
	method2178(class103, is, 0, is.length, i, null, null);
    }
    
    public static void method2177(Class103 class103, int[] is, int i,
				  int[] is_12_, int[] is_13_) {
	method2178(class103, is, 0, is.length, i, is_12_, is_13_);
    }
    
    static void method2178(Class103 class103, int[] is, int i, int i_14_,
			   int i_15_, int[] is_16_, int[] is_17_) {
	int[] is_18_ = new int[4];
	class103.method2260(is_18_);
	if (is_16_ != null && is_18_[3] - is_18_[1] != is_16_.length)
	    throw new IllegalStateException();
	method2179();
	method2180(is, i, i_14_);
	method2186(is_18_[1]);
	while (method2181(is_18_[3])) {
	    int i_19_ = anInt1361;
	    int i_20_ = anInt1356;
	    int i_21_ = anInt1357;
	    if (is_16_ != null) {
		int i_22_ = i_21_ - is_18_[1];
		if (i_19_ < is_16_[i_22_] + is_18_[0])
		    i_19_ = is_16_[i_22_] + is_18_[0];
		if (i_20_ > is_16_[i_22_] + is_17_[i_22_] + is_18_[0])
		    i_20_ = is_16_[i_22_] + is_17_[i_22_] + is_18_[0];
		if (i_20_ - i_19_ <= 0)
		    continue;
	    }
	    class103.method2272(i_19_, i_21_, i_20_ - i_19_, i_15_, 1);
	}
    }
    
    static void method2179() {
	anInt1359 = 0;
    }
    
    static void method2180(int[] is, int i, int i_23_) {
	int i_24_ = anInt1359 + (i_23_ << 1);
	if (anIntArray1358 == null || anIntArray1358.length < i_24_) {
	    int[] is_25_ = new int[i_24_];
	    for (int i_26_ = 0; i_26_ < anInt1359; i_26_++)
		is_25_[i_26_] = anIntArray1358[i_26_];
	    anIntArray1358 = is_25_;
	}
	i_23_ += i;
	int i_27_ = i_23_ - 2;
	for (int i_28_ = i; i_28_ < i_23_; i_28_ += 2) {
	    int i_29_ = is[i_27_ + 1];
	    int i_30_ = is[i_28_ + 1];
	    if (i_29_ < i_30_) {
		anIntArray1358[anInt1359++] = is[i_27_];
		anIntArray1358[anInt1359++] = i_29_;
		anIntArray1358[anInt1359++] = is[i_28_];
		anIntArray1358[anInt1359++] = i_30_;
	    } else if (i_30_ < i_29_) {
		anIntArray1358[anInt1359++] = is[i_28_];
		anIntArray1358[anInt1359++] = i_30_;
		anIntArray1358[anInt1359++] = is[i_27_];
		anIntArray1358[anInt1359++] = i_29_;
	    }
	    i_27_ = i_28_;
	}
    }
    
    static boolean method2181(int i) {
	int i_31_ = anInt1362;
	int i_32_ = anInt1355;
	int i_33_ = anInt1357;
	int i_34_;
	for (/**/; i_32_ >= i_31_; i_32_ = i_34_) {
	    anInt1357 = ++i_33_;
	    if (i_33_ >= i)
		return false;
	    i_34_ = anInt1360;
	    for (/**/; i_31_ < anInt1359; i_31_ += 4) {
		int i_35_ = anIntArray1358[i_31_ + 1];
		if (i_33_ < i_35_)
		    break;
		int i_36_ = anIntArray1358[i_31_];
		int i_37_ = anIntArray1358[i_31_ + 2];
		int i_38_ = anIntArray1358[i_31_ + 3];
		int i_39_ = (i_37_ - i_36_ << 16) / (i_38_ - i_35_);
		int i_40_ = (i_36_ << 16) + 32768;
		anIntArray1358[i_31_] = i_40_;
		anIntArray1358[i_31_ + 2] = i_39_;
	    }
	    for (int i_41_ = i_34_; i_41_ < i_31_; i_41_ += 4) {
		int i_42_ = anIntArray1358[i_41_ + 3];
		if (i_33_ >= i_42_) {
		    anIntArray1358[i_41_] = anIntArray1358[i_34_];
		    anIntArray1358[i_41_ + 1] = anIntArray1358[i_34_ + 1];
		    anIntArray1358[i_41_ + 2] = anIntArray1358[i_34_ + 2];
		    anIntArray1358[i_41_ + 3] = anIntArray1358[i_34_ + 3];
		    i_34_ += 4;
		}
	    }
	    if (i_34_ == anInt1359) {
		anInt1359 = 0;
		return false;
	    }
	    method2182(i_34_, i_31_);
	    anInt1360 = i_34_;
	    anInt1362 = i_31_;
	}
	anInt1361 = anIntArray1358[i_32_] >> 16;
	anInt1356 = anIntArray1358[i_32_ + 4] >> 16;
	anIntArray1358[i_32_] += anIntArray1358[i_32_ + 2];
	anIntArray1358[i_32_ + 4] += anIntArray1358[i_32_ + 6];
	i_32_ += 8;
	anInt1355 = i_32_;
	return true;
    }
    
    Class99() throws Throwable {
	throw new Error();
    }
    
    static void method2182(int i, int i_43_) {
	for (/**/; i_43_ >= i + 8; i_43_ -= 4) {
	    boolean bool = true;
	    for (int i_44_ = i + 4; i_44_ < i_43_; i_44_ += 4) {
		int i_45_ = anIntArray1358[i_44_ - 4];
		int i_46_ = anIntArray1358[i_44_];
		if (i_45_ > i_46_) {
		    bool = false;
		    anIntArray1358[i_44_ - 4] = i_46_;
		    anIntArray1358[i_44_] = i_45_;
		    i_45_ = anIntArray1358[i_44_ - 2];
		    anIntArray1358[i_44_ - 2] = anIntArray1358[i_44_ + 2];
		    anIntArray1358[i_44_ + 2] = i_45_;
		    i_45_ = anIntArray1358[i_44_ - 1];
		    anIntArray1358[i_44_ - 1] = anIntArray1358[i_44_ + 3];
		    anIntArray1358[i_44_ + 3] = i_45_;
		}
	    }
	    if (bool)
		break;
	}
    }
    
    static void method2183(int i) {
	if (anInt1359 < 0) {
	    anInt1355 = 0;
	    anInt1362 = 0;
	    anInt1360 = 0;
	    anInt1357 = 2147483646;
	} else {
	    method2194(0, anInt1359);
	    int i_47_ = anIntArray1358[1];
	    if (i_47_ < i)
		i_47_ = i;
	    int i_48_ = 0;
	    int i_49_;
	    for (i_49_ = 0; i_49_ < anInt1359; i_49_ += 4) {
		int i_50_ = anIntArray1358[i_49_ + 1];
		if (i_47_ < i_50_)
		    break;
		int i_51_ = anIntArray1358[i_49_];
		int i_52_ = anIntArray1358[i_49_ + 2];
		int i_53_ = anIntArray1358[i_49_ + 3];
		int i_54_ = (i_52_ - i_51_ << 16) / (i_53_ - i_50_);
		int i_55_ = (i_51_ << 16) + 32768;
		anIntArray1358[i_49_] = i_55_ + (i_47_ - i_50_) * i_54_;
		anIntArray1358[i_49_ + 2] = i_54_;
	    }
	    anInt1360 = i_48_;
	    anInt1362 = i_49_;
	    anInt1355 = i_49_;
	    anInt1357 = i_47_ - 1;
	}
    }
    
    static boolean method2184(int i) {
	int i_56_ = anInt1362;
	int i_57_ = anInt1355;
	int i_58_ = anInt1357;
	int i_59_;
	for (/**/; i_57_ >= i_56_; i_57_ = i_59_) {
	    anInt1357 = ++i_58_;
	    if (i_58_ >= i)
		return false;
	    i_59_ = anInt1360;
	    for (/**/; i_56_ < anInt1359; i_56_ += 4) {
		int i_60_ = anIntArray1358[i_56_ + 1];
		if (i_58_ < i_60_)
		    break;
		int i_61_ = anIntArray1358[i_56_];
		int i_62_ = anIntArray1358[i_56_ + 2];
		int i_63_ = anIntArray1358[i_56_ + 3];
		int i_64_ = (i_62_ - i_61_ << 16) / (i_63_ - i_60_);
		int i_65_ = (i_61_ << 16) + 32768;
		anIntArray1358[i_56_] = i_65_;
		anIntArray1358[i_56_ + 2] = i_64_;
	    }
	    for (int i_66_ = i_59_; i_66_ < i_56_; i_66_ += 4) {
		int i_67_ = anIntArray1358[i_66_ + 3];
		if (i_58_ >= i_67_) {
		    anIntArray1358[i_66_] = anIntArray1358[i_59_];
		    anIntArray1358[i_66_ + 1] = anIntArray1358[i_59_ + 1];
		    anIntArray1358[i_66_ + 2] = anIntArray1358[i_59_ + 2];
		    anIntArray1358[i_66_ + 3] = anIntArray1358[i_59_ + 3];
		    i_59_ += 4;
		}
	    }
	    if (i_59_ == anInt1359) {
		anInt1359 = 0;
		return false;
	    }
	    method2182(i_59_, i_56_);
	    anInt1360 = i_59_;
	    anInt1362 = i_56_;
	}
	anInt1361 = anIntArray1358[i_57_] >> 16;
	anInt1356 = anIntArray1358[i_57_ + 4] >> 16;
	anIntArray1358[i_57_] += anIntArray1358[i_57_ + 2];
	anIntArray1358[i_57_ + 4] += anIntArray1358[i_57_ + 6];
	i_57_ += 8;
	anInt1355 = i_57_;
	return true;
    }
    
    public static void method2185(Class103 class103, int[] is, int i) {
	method2178(class103, is, 0, is.length, i, null, null);
    }
    
    static void method2186(int i) {
	if (anInt1359 < 0) {
	    anInt1355 = 0;
	    anInt1362 = 0;
	    anInt1360 = 0;
	    anInt1357 = 2147483646;
	} else {
	    method2194(0, anInt1359);
	    int i_68_ = anIntArray1358[1];
	    if (i_68_ < i)
		i_68_ = i;
	    int i_69_ = 0;
	    int i_70_;
	    for (i_70_ = 0; i_70_ < anInt1359; i_70_ += 4) {
		int i_71_ = anIntArray1358[i_70_ + 1];
		if (i_68_ < i_71_)
		    break;
		int i_72_ = anIntArray1358[i_70_];
		int i_73_ = anIntArray1358[i_70_ + 2];
		int i_74_ = anIntArray1358[i_70_ + 3];
		int i_75_ = (i_73_ - i_72_ << 16) / (i_74_ - i_71_);
		int i_76_ = (i_72_ << 16) + 32768;
		anIntArray1358[i_70_] = i_76_ + (i_68_ - i_71_) * i_75_;
		anIntArray1358[i_70_ + 2] = i_75_;
	    }
	    anInt1360 = i_69_;
	    anInt1362 = i_70_;
	    anInt1355 = i_70_;
	    anInt1357 = i_68_ - 1;
	}
    }
    
    static void method2187(Class103 class103, int[] is, int i, int i_77_,
			   int i_78_, int[] is_79_, int[] is_80_) {
	int[] is_81_ = new int[4];
	class103.method2260(is_81_);
	if (is_79_ != null && is_81_[3] - is_81_[1] != is_79_.length)
	    throw new IllegalStateException();
	method2179();
	method2180(is, i, i_77_);
	method2186(is_81_[1]);
	while (method2181(is_81_[3])) {
	    int i_82_ = anInt1361;
	    int i_83_ = anInt1356;
	    int i_84_ = anInt1357;
	    if (is_79_ != null) {
		int i_85_ = i_84_ - is_81_[1];
		if (i_82_ < is_79_[i_85_] + is_81_[0])
		    i_82_ = is_79_[i_85_] + is_81_[0];
		if (i_83_ > is_79_[i_85_] + is_80_[i_85_] + is_81_[0])
		    i_83_ = is_79_[i_85_] + is_80_[i_85_] + is_81_[0];
		if (i_83_ - i_82_ <= 0)
		    continue;
	    }
	    class103.method2272(i_82_, i_84_, i_83_ - i_82_, i_78_, 1);
	}
    }
    
    static void method2188() {
	anInt1359 = 0;
    }
    
    static void method2189() {
	anInt1359 = 0;
    }
    
    static void method2190(int[] is, int i, int i_86_) {
	int i_87_ = anInt1359 + (i_86_ << 1);
	if (anIntArray1358 == null || anIntArray1358.length < i_87_) {
	    int[] is_88_ = new int[i_87_];
	    for (int i_89_ = 0; i_89_ < anInt1359; i_89_++)
		is_88_[i_89_] = anIntArray1358[i_89_];
	    anIntArray1358 = is_88_;
	}
	i_86_ += i;
	int i_90_ = i_86_ - 2;
	for (int i_91_ = i; i_91_ < i_86_; i_91_ += 2) {
	    int i_92_ = is[i_90_ + 1];
	    int i_93_ = is[i_91_ + 1];
	    if (i_92_ < i_93_) {
		anIntArray1358[anInt1359++] = is[i_90_];
		anIntArray1358[anInt1359++] = i_92_;
		anIntArray1358[anInt1359++] = is[i_91_];
		anIntArray1358[anInt1359++] = i_93_;
	    } else if (i_93_ < i_92_) {
		anIntArray1358[anInt1359++] = is[i_91_];
		anIntArray1358[anInt1359++] = i_93_;
		anIntArray1358[anInt1359++] = is[i_90_];
		anIntArray1358[anInt1359++] = i_92_;
	    }
	    i_90_ = i_91_;
	}
    }
    
    static void method2191(int i) {
	if (anInt1359 < 0) {
	    anInt1355 = 0;
	    anInt1362 = 0;
	    anInt1360 = 0;
	    anInt1357 = 2147483646;
	} else {
	    method2194(0, anInt1359);
	    int i_94_ = anIntArray1358[1];
	    if (i_94_ < i)
		i_94_ = i;
	    int i_95_ = 0;
	    int i_96_;
	    for (i_96_ = 0; i_96_ < anInt1359; i_96_ += 4) {
		int i_97_ = anIntArray1358[i_96_ + 1];
		if (i_94_ < i_97_)
		    break;
		int i_98_ = anIntArray1358[i_96_];
		int i_99_ = anIntArray1358[i_96_ + 2];
		int i_100_ = anIntArray1358[i_96_ + 3];
		int i_101_ = (i_99_ - i_98_ << 16) / (i_100_ - i_97_);
		int i_102_ = (i_98_ << 16) + 32768;
		anIntArray1358[i_96_] = i_102_ + (i_94_ - i_97_) * i_101_;
		anIntArray1358[i_96_ + 2] = i_101_;
	    }
	    anInt1360 = i_95_;
	    anInt1362 = i_96_;
	    anInt1355 = i_96_;
	    anInt1357 = i_94_ - 1;
	}
    }
    
    static void method2192(Class103 class103, int[] is, int i, int i_103_,
			   int i_104_, int[] is_105_, int[] is_106_) {
	int[] is_107_ = new int[4];
	class103.method2260(is_107_);
	if (is_105_ != null && is_107_[3] - is_107_[1] != is_105_.length)
	    throw new IllegalStateException();
	method2179();
	method2180(is, i, i_103_);
	method2186(is_107_[1]);
	while (method2181(is_107_[3])) {
	    int i_108_ = anInt1361;
	    int i_109_ = anInt1356;
	    int i_110_ = anInt1357;
	    if (is_105_ != null) {
		int i_111_ = i_110_ - is_107_[1];
		if (i_108_ < is_105_[i_111_] + is_107_[0])
		    i_108_ = is_105_[i_111_] + is_107_[0];
		if (i_109_ > is_105_[i_111_] + is_106_[i_111_] + is_107_[0])
		    i_109_ = is_105_[i_111_] + is_106_[i_111_] + is_107_[0];
		if (i_109_ - i_108_ <= 0)
		    continue;
	    }
	    class103.method2272(i_108_, i_110_, i_109_ - i_108_, i_104_, 1);
	}
    }
    
    static void method2193(Class103 class103, int[] is, int i, int i_112_,
			   int i_113_, int[] is_114_, int[] is_115_) {
	int[] is_116_ = new int[4];
	class103.method2260(is_116_);
	if (is_114_ != null && is_116_[3] - is_116_[1] != is_114_.length)
	    throw new IllegalStateException();
	method2179();
	method2180(is, i, i_112_);
	method2186(is_116_[1]);
	while (method2181(is_116_[3])) {
	    int i_117_ = anInt1361;
	    int i_118_ = anInt1356;
	    int i_119_ = anInt1357;
	    if (is_114_ != null) {
		int i_120_ = i_119_ - is_116_[1];
		if (i_117_ < is_114_[i_120_] + is_116_[0])
		    i_117_ = is_114_[i_120_] + is_116_[0];
		if (i_118_ > is_114_[i_120_] + is_115_[i_120_] + is_116_[0])
		    i_118_ = is_114_[i_120_] + is_115_[i_120_] + is_116_[0];
		if (i_118_ - i_117_ <= 0)
		    continue;
	    }
	    class103.method2272(i_117_, i_119_, i_118_ - i_117_, i_113_, 1);
	}
    }
    
    static void method2194(int i, int i_121_) {
	if (i_121_ > i + 4) {
	    int i_122_ = i;
	    int i_123_ = anIntArray1358[i_122_];
	    int i_124_ = anIntArray1358[i_122_ + 1];
	    int i_125_ = anIntArray1358[i_122_ + 2];
	    int i_126_ = anIntArray1358[i_122_ + 3];
	    for (int i_127_ = i + 4; i_127_ < i_121_; i_127_ += 4) {
		int i_128_ = anIntArray1358[i_127_ + 1];
		if (i_128_ < i_124_) {
		    anIntArray1358[i_122_] = anIntArray1358[i_127_];
		    anIntArray1358[i_122_ + 1] = i_128_;
		    anIntArray1358[i_122_ + 2] = anIntArray1358[i_127_ + 2];
		    anIntArray1358[i_122_ + 3] = anIntArray1358[i_127_ + 3];
		    i_122_ += 4;
		    anIntArray1358[i_127_] = anIntArray1358[i_122_];
		    anIntArray1358[i_127_ + 1] = anIntArray1358[i_122_ + 1];
		    anIntArray1358[i_127_ + 2] = anIntArray1358[i_122_ + 2];
		    anIntArray1358[i_127_ + 3] = anIntArray1358[i_122_ + 3];
		}
	    }
	    anIntArray1358[i_122_] = i_123_;
	    anIntArray1358[i_122_ + 1] = i_124_;
	    anIntArray1358[i_122_ + 2] = i_125_;
	    anIntArray1358[i_122_ + 3] = i_126_;
	    method2194(i, i_122_);
	    method2194(i_122_ + 4, i_121_);
	}
    }
    
    static void method2195(int i, int i_129_) {
	if (i_129_ > i + 4) {
	    int i_130_ = i;
	    int i_131_ = anIntArray1358[i_130_];
	    int i_132_ = anIntArray1358[i_130_ + 1];
	    int i_133_ = anIntArray1358[i_130_ + 2];
	    int i_134_ = anIntArray1358[i_130_ + 3];
	    for (int i_135_ = i + 4; i_135_ < i_129_; i_135_ += 4) {
		int i_136_ = anIntArray1358[i_135_ + 1];
		if (i_136_ < i_132_) {
		    anIntArray1358[i_130_] = anIntArray1358[i_135_];
		    anIntArray1358[i_130_ + 1] = i_136_;
		    anIntArray1358[i_130_ + 2] = anIntArray1358[i_135_ + 2];
		    anIntArray1358[i_130_ + 3] = anIntArray1358[i_135_ + 3];
		    i_130_ += 4;
		    anIntArray1358[i_135_] = anIntArray1358[i_130_];
		    anIntArray1358[i_135_ + 1] = anIntArray1358[i_130_ + 1];
		    anIntArray1358[i_135_ + 2] = anIntArray1358[i_130_ + 2];
		    anIntArray1358[i_135_ + 3] = anIntArray1358[i_130_ + 3];
		}
	    }
	    anIntArray1358[i_130_] = i_131_;
	    anIntArray1358[i_130_ + 1] = i_132_;
	    anIntArray1358[i_130_ + 2] = i_133_;
	    anIntArray1358[i_130_ + 3] = i_134_;
	    method2194(i, i_130_);
	    method2194(i_130_ + 4, i_129_);
	}
    }
    
    static void method2196(int i, int i_137_) {
	if (i_137_ > i + 4) {
	    int i_138_ = i;
	    int i_139_ = anIntArray1358[i_138_];
	    int i_140_ = anIntArray1358[i_138_ + 1];
	    int i_141_ = anIntArray1358[i_138_ + 2];
	    int i_142_ = anIntArray1358[i_138_ + 3];
	    for (int i_143_ = i + 4; i_143_ < i_137_; i_143_ += 4) {
		int i_144_ = anIntArray1358[i_143_ + 1];
		if (i_144_ < i_140_) {
		    anIntArray1358[i_138_] = anIntArray1358[i_143_];
		    anIntArray1358[i_138_ + 1] = i_144_;
		    anIntArray1358[i_138_ + 2] = anIntArray1358[i_143_ + 2];
		    anIntArray1358[i_138_ + 3] = anIntArray1358[i_143_ + 3];
		    i_138_ += 4;
		    anIntArray1358[i_143_] = anIntArray1358[i_138_];
		    anIntArray1358[i_143_ + 1] = anIntArray1358[i_138_ + 1];
		    anIntArray1358[i_143_ + 2] = anIntArray1358[i_138_ + 2];
		    anIntArray1358[i_143_ + 3] = anIntArray1358[i_138_ + 3];
		}
	    }
	    anIntArray1358[i_138_] = i_139_;
	    anIntArray1358[i_138_ + 1] = i_140_;
	    anIntArray1358[i_138_ + 2] = i_141_;
	    anIntArray1358[i_138_ + 3] = i_142_;
	    method2194(i, i_138_);
	    method2194(i_138_ + 4, i_137_);
	}
    }
    
    static void method2197(int i, int i_145_) {
	if (i_145_ > i + 4) {
	    int i_146_ = i;
	    int i_147_ = anIntArray1358[i_146_];
	    int i_148_ = anIntArray1358[i_146_ + 1];
	    int i_149_ = anIntArray1358[i_146_ + 2];
	    int i_150_ = anIntArray1358[i_146_ + 3];
	    for (int i_151_ = i + 4; i_151_ < i_145_; i_151_ += 4) {
		int i_152_ = anIntArray1358[i_151_ + 1];
		if (i_152_ < i_148_) {
		    anIntArray1358[i_146_] = anIntArray1358[i_151_];
		    anIntArray1358[i_146_ + 1] = i_152_;
		    anIntArray1358[i_146_ + 2] = anIntArray1358[i_151_ + 2];
		    anIntArray1358[i_146_ + 3] = anIntArray1358[i_151_ + 3];
		    i_146_ += 4;
		    anIntArray1358[i_151_] = anIntArray1358[i_146_];
		    anIntArray1358[i_151_ + 1] = anIntArray1358[i_146_ + 1];
		    anIntArray1358[i_151_ + 2] = anIntArray1358[i_146_ + 2];
		    anIntArray1358[i_151_ + 3] = anIntArray1358[i_146_ + 3];
		}
	    }
	    anIntArray1358[i_146_] = i_147_;
	    anIntArray1358[i_146_ + 1] = i_148_;
	    anIntArray1358[i_146_ + 2] = i_149_;
	    anIntArray1358[i_146_ + 3] = i_150_;
	    method2194(i, i_146_);
	    method2194(i_146_ + 4, i_145_);
	}
    }
    
    static void method2198(int i, int i_153_) {
	for (/**/; i_153_ >= i + 8; i_153_ -= 4) {
	    boolean bool = true;
	    for (int i_154_ = i + 4; i_154_ < i_153_; i_154_ += 4) {
		int i_155_ = anIntArray1358[i_154_ - 4];
		int i_156_ = anIntArray1358[i_154_];
		if (i_155_ > i_156_) {
		    bool = false;
		    anIntArray1358[i_154_ - 4] = i_156_;
		    anIntArray1358[i_154_] = i_155_;
		    i_155_ = anIntArray1358[i_154_ - 2];
		    anIntArray1358[i_154_ - 2] = anIntArray1358[i_154_ + 2];
		    anIntArray1358[i_154_ + 2] = i_155_;
		    i_155_ = anIntArray1358[i_154_ - 1];
		    anIntArray1358[i_154_ - 1] = anIntArray1358[i_154_ + 3];
		    anIntArray1358[i_154_ + 3] = i_155_;
		}
	    }
	    if (bool)
		break;
	}
    }
    
    static void method2199(int i, int i_157_) {
	for (/**/; i_157_ >= i + 8; i_157_ -= 4) {
	    boolean bool = true;
	    for (int i_158_ = i + 4; i_158_ < i_157_; i_158_ += 4) {
		int i_159_ = anIntArray1358[i_158_ - 4];
		int i_160_ = anIntArray1358[i_158_];
		if (i_159_ > i_160_) {
		    bool = false;
		    anIntArray1358[i_158_ - 4] = i_160_;
		    anIntArray1358[i_158_] = i_159_;
		    i_159_ = anIntArray1358[i_158_ - 2];
		    anIntArray1358[i_158_ - 2] = anIntArray1358[i_158_ + 2];
		    anIntArray1358[i_158_ + 2] = i_159_;
		    i_159_ = anIntArray1358[i_158_ - 1];
		    anIntArray1358[i_158_ - 1] = anIntArray1358[i_158_ + 3];
		    anIntArray1358[i_158_ + 3] = i_159_;
		}
	    }
	    if (bool)
		break;
	}
    }
}
