/* Class582 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class582
{
    static Class133 aClass133_7565;
    
    public static byte[][][] method12763(int i) {
	byte[][][] is = new byte[8][4][];
	int i_0_ = i;
	int i_1_ = i;
	byte[] is_2_ = new byte[i_1_ * i_0_];
	int i_3_ = 0;
	for (int i_4_ = 0; i_4_ < i_1_; i_4_++) {
	    for (int i_5_ = 0; i_5_ < i_0_; i_5_++) {
		if (i_5_ <= i_4_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[0][0] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_6_ = i_1_ - 1; i_6_ >= 0; i_6_--) {
	    for (int i_7_ = 0; i_7_ < i_1_; i_7_++) {
		if (i_7_ <= i_6_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[0][1] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
	    for (int i_9_ = 0; i_9_ < i_0_; i_9_++) {
		if (i_9_ >= i_8_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[0][2] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_10_ = i_1_ - 1; i_10_ >= 0; i_10_--) {
	    for (int i_11_ = 0; i_11_ < i_0_; i_11_++) {
		if (i_11_ >= i_10_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[0][3] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_12_ = i_1_ - 1; i_12_ >= 0; i_12_--) {
	    for (int i_13_ = 0; i_13_ < i_0_; i_13_++) {
		if (i_13_ <= i_12_ >> 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[1][0] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_14_ = 0; i_14_ < i_1_; i_14_++) {
	    for (int i_15_ = 0; i_15_ < i_0_; i_15_++) {
		if (i_3_ < 0 || i_3_ >= is_2_.length)
		    i_3_++;
		else {
		    if (i_15_ >= i_14_ << 1)
			is_2_[i_3_] = (byte) -1;
		    i_3_++;
		}
	    }
	}
	is[1][1] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_16_ = 0; i_16_ < i_1_; i_16_++) {
	    for (int i_17_ = i_0_ - 1; i_17_ >= 0; i_17_--) {
		if (i_17_ <= i_16_ >> 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[1][2] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_18_ = i_1_ - 1; i_18_ >= 0; i_18_--) {
	    for (int i_19_ = i_0_ - 1; i_19_ >= 0; i_19_--) {
		if (i_19_ >= i_18_ << 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[1][3] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_20_ = i_1_ - 1; i_20_ >= 0; i_20_--) {
	    for (int i_21_ = i_0_ - 1; i_21_ >= 0; i_21_--) {
		if (i_21_ <= i_20_ >> 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[2][0] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_22_ = i_1_ - 1; i_22_ >= 0; i_22_--) {
	    for (int i_23_ = 0; i_23_ < i_0_; i_23_++) {
		if (i_23_ >= i_22_ << 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[2][1] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_24_ = 0; i_24_ < i_1_; i_24_++) {
	    for (int i_25_ = 0; i_25_ < i_0_; i_25_++) {
		if (i_25_ <= i_24_ >> 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[2][2] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_26_ = 0; i_26_ < i_1_; i_26_++) {
	    for (int i_27_ = i_0_ - 1; i_27_ >= 0; i_27_--) {
		if (i_27_ >= i_26_ << 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[2][3] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_28_ = i_1_ - 1; i_28_ >= 0; i_28_--) {
	    for (int i_29_ = 0; i_29_ < i_0_; i_29_++) {
		if (i_29_ >= i_28_ >> 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[3][0] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_30_ = 0; i_30_ < i_1_; i_30_++) {
	    for (int i_31_ = 0; i_31_ < i_0_; i_31_++) {
		if (i_31_ <= i_30_ << 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[3][1] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_32_ = 0; i_32_ < i_1_; i_32_++) {
	    for (int i_33_ = i_0_ - 1; i_33_ >= 0; i_33_--) {
		if (i_33_ >= i_32_ >> 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[3][2] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_34_ = i_1_ - 1; i_34_ >= 0; i_34_--) {
	    for (int i_35_ = i_0_ - 1; i_35_ >= 0; i_35_--) {
		if (i_35_ <= i_34_ << 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[3][3] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_36_ = i_1_ - 1; i_36_ >= 0; i_36_--) {
	    for (int i_37_ = i_0_ - 1; i_37_ >= 0; i_37_--) {
		if (i_37_ >= i_36_ >> 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[4][0] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_38_ = i_1_ - 1; i_38_ >= 0; i_38_--) {
	    for (int i_39_ = 0; i_39_ < i_0_; i_39_++) {
		if (i_39_ <= i_38_ << 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[4][1] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_40_ = 0; i_40_ < i_1_; i_40_++) {
	    for (int i_41_ = 0; i_41_ < i_0_; i_41_++) {
		if (i_41_ >= i_40_ >> 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[4][2] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_42_ = 0; i_42_ < i_1_; i_42_++) {
	    for (int i_43_ = i_0_ - 1; i_43_ >= 0; i_43_--) {
		if (i_43_ <= i_42_ << 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[4][3] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_44_ = 0; i_44_ < i_1_; i_44_++) {
	    for (int i_45_ = 0; i_45_ < i_0_; i_45_++) {
		if (i_45_ <= i_0_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[5][0] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_46_ = 0; i_46_ < i_1_; i_46_++) {
	    for (int i_47_ = 0; i_47_ < i_0_; i_47_++) {
		if (i_46_ <= i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[5][1] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_48_ = 0; i_48_ < i_1_; i_48_++) {
	    for (int i_49_ = 0; i_49_ < i_0_; i_49_++) {
		if (i_49_ >= i_0_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[5][2] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_50_ = 0; i_50_ < i_1_; i_50_++) {
	    for (int i_51_ = 0; i_51_ < i_0_; i_51_++) {
		if (i_50_ >= i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[5][3] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_52_ = 0; i_52_ < i_1_; i_52_++) {
	    for (int i_53_ = 0; i_53_ < i_0_; i_53_++) {
		if (i_53_ <= i_52_ - i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[6][0] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_54_ = i_1_ - 1; i_54_ >= 0; i_54_--) {
	    for (int i_55_ = 0; i_55_ < i_0_; i_55_++) {
		if (i_55_ <= i_54_ - i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[6][1] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_56_ = i_1_ - 1; i_56_ >= 0; i_56_--) {
	    for (int i_57_ = i_0_ - 1; i_57_ >= 0; i_57_--) {
		if (i_57_ <= i_56_ - i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[6][2] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_58_ = 0; i_58_ < i_1_; i_58_++) {
	    for (int i_59_ = i_0_ - 1; i_59_ >= 0; i_59_--) {
		if (i_59_ <= i_58_ - i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[6][3] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_60_ = 0; i_60_ < i_1_; i_60_++) {
	    for (int i_61_ = 0; i_61_ < i_0_; i_61_++) {
		if (i_61_ >= i_60_ - i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[7][0] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_62_ = i_1_ - 1; i_62_ >= 0; i_62_--) {
	    for (int i_63_ = 0; i_63_ < i_0_; i_63_++) {
		if (i_63_ >= i_62_ - i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[7][1] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_64_ = i_1_ - 1; i_64_ >= 0; i_64_--) {
	    for (int i_65_ = i_0_ - 1; i_65_ >= 0; i_65_--) {
		if (i_65_ >= i_64_ - i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[7][2] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_66_ = 0; i_66_ < i_1_; i_66_++) {
	    for (int i_67_ = i_0_ - 1; i_67_ >= 0; i_67_--) {
		if (i_67_ >= i_66_ - i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[7][3] = is_2_;
	return is;
    }
    
    Class582() throws Throwable {
	throw new Error();
    }
    
    static int method12764(int i, int i_68_) {
	if (9 == i_68_)
	    i = i + 1 & 0x3;
	if (10 == i_68_)
	    i = 3 + i & 0x3;
	if (11 == i_68_)
	    i = 3 + i & 0x3;
	return i;
    }
    
    static int method12765(int i, int i_69_) {
	if (9 == i_69_)
	    i = i + 1 & 0x3;
	if (10 == i_69_)
	    i = 3 + i & 0x3;
	if (11 == i_69_)
	    i = 3 + i & 0x3;
	return i;
    }
    
    static int method12766(int i) {
	if (i == 9 || i == 10)
	    return 1;
	if (i == 11)
	    return 8;
	return i;
    }
    
    static int method12767(int i, int i_70_) {
	if (9 == i_70_)
	    i = i + 1 & 0x3;
	if (10 == i_70_)
	    i = 3 + i & 0x3;
	if (11 == i_70_)
	    i = 3 + i & 0x3;
	return i;
    }
    
    public static byte[][][] method12768(int i) {
	byte[][][] is = new byte[8][4][];
	int i_71_ = i;
	int i_72_ = i;
	byte[] is_73_ = new byte[i_72_ * i_71_];
	int i_74_ = 0;
	for (int i_75_ = 0; i_75_ < i_72_; i_75_++) {
	    for (int i_76_ = 0; i_76_ < i_71_; i_76_++) {
		if (i_76_ <= i_75_)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[0][0] = is_73_;
	is_73_ = new byte[i_72_ * i_71_];
	i_74_ = 0;
	for (int i_77_ = i_72_ - 1; i_77_ >= 0; i_77_--) {
	    for (int i_78_ = 0; i_78_ < i_72_; i_78_++) {
		if (i_78_ <= i_77_)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[0][1] = is_73_;
	is_73_ = new byte[i_71_ * i_72_];
	i_74_ = 0;
	for (int i_79_ = 0; i_79_ < i_72_; i_79_++) {
	    for (int i_80_ = 0; i_80_ < i_71_; i_80_++) {
		if (i_80_ >= i_79_)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[0][2] = is_73_;
	is_73_ = new byte[i_72_ * i_71_];
	i_74_ = 0;
	for (int i_81_ = i_72_ - 1; i_81_ >= 0; i_81_--) {
	    for (int i_82_ = 0; i_82_ < i_71_; i_82_++) {
		if (i_82_ >= i_81_)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[0][3] = is_73_;
	is_73_ = new byte[i_72_ * i_71_];
	i_74_ = 0;
	for (int i_83_ = i_72_ - 1; i_83_ >= 0; i_83_--) {
	    for (int i_84_ = 0; i_84_ < i_71_; i_84_++) {
		if (i_84_ <= i_83_ >> 1)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[1][0] = is_73_;
	is_73_ = new byte[i_72_ * i_71_];
	i_74_ = 0;
	for (int i_85_ = 0; i_85_ < i_72_; i_85_++) {
	    for (int i_86_ = 0; i_86_ < i_71_; i_86_++) {
		if (i_74_ < 0 || i_74_ >= is_73_.length)
		    i_74_++;
		else {
		    if (i_86_ >= i_85_ << 1)
			is_73_[i_74_] = (byte) -1;
		    i_74_++;
		}
	    }
	}
	is[1][1] = is_73_;
	is_73_ = new byte[i_71_ * i_72_];
	i_74_ = 0;
	for (int i_87_ = 0; i_87_ < i_72_; i_87_++) {
	    for (int i_88_ = i_71_ - 1; i_88_ >= 0; i_88_--) {
		if (i_88_ <= i_87_ >> 1)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[1][2] = is_73_;
	is_73_ = new byte[i_71_ * i_72_];
	i_74_ = 0;
	for (int i_89_ = i_72_ - 1; i_89_ >= 0; i_89_--) {
	    for (int i_90_ = i_71_ - 1; i_90_ >= 0; i_90_--) {
		if (i_90_ >= i_89_ << 1)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[1][3] = is_73_;
	is_73_ = new byte[i_72_ * i_71_];
	i_74_ = 0;
	for (int i_91_ = i_72_ - 1; i_91_ >= 0; i_91_--) {
	    for (int i_92_ = i_71_ - 1; i_92_ >= 0; i_92_--) {
		if (i_92_ <= i_91_ >> 1)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[2][0] = is_73_;
	is_73_ = new byte[i_71_ * i_72_];
	i_74_ = 0;
	for (int i_93_ = i_72_ - 1; i_93_ >= 0; i_93_--) {
	    for (int i_94_ = 0; i_94_ < i_71_; i_94_++) {
		if (i_94_ >= i_93_ << 1)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[2][1] = is_73_;
	is_73_ = new byte[i_72_ * i_71_];
	i_74_ = 0;
	for (int i_95_ = 0; i_95_ < i_72_; i_95_++) {
	    for (int i_96_ = 0; i_96_ < i_71_; i_96_++) {
		if (i_96_ <= i_95_ >> 1)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[2][2] = is_73_;
	is_73_ = new byte[i_72_ * i_71_];
	i_74_ = 0;
	for (int i_97_ = 0; i_97_ < i_72_; i_97_++) {
	    for (int i_98_ = i_71_ - 1; i_98_ >= 0; i_98_--) {
		if (i_98_ >= i_97_ << 1)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[2][3] = is_73_;
	is_73_ = new byte[i_71_ * i_72_];
	i_74_ = 0;
	for (int i_99_ = i_72_ - 1; i_99_ >= 0; i_99_--) {
	    for (int i_100_ = 0; i_100_ < i_71_; i_100_++) {
		if (i_100_ >= i_99_ >> 1)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[3][0] = is_73_;
	is_73_ = new byte[i_71_ * i_72_];
	i_74_ = 0;
	for (int i_101_ = 0; i_101_ < i_72_; i_101_++) {
	    for (int i_102_ = 0; i_102_ < i_71_; i_102_++) {
		if (i_102_ <= i_101_ << 1)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[3][1] = is_73_;
	is_73_ = new byte[i_72_ * i_71_];
	i_74_ = 0;
	for (int i_103_ = 0; i_103_ < i_72_; i_103_++) {
	    for (int i_104_ = i_71_ - 1; i_104_ >= 0; i_104_--) {
		if (i_104_ >= i_103_ >> 1)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[3][2] = is_73_;
	is_73_ = new byte[i_71_ * i_72_];
	i_74_ = 0;
	for (int i_105_ = i_72_ - 1; i_105_ >= 0; i_105_--) {
	    for (int i_106_ = i_71_ - 1; i_106_ >= 0; i_106_--) {
		if (i_106_ <= i_105_ << 1)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[3][3] = is_73_;
	is_73_ = new byte[i_71_ * i_72_];
	i_74_ = 0;
	for (int i_107_ = i_72_ - 1; i_107_ >= 0; i_107_--) {
	    for (int i_108_ = i_71_ - 1; i_108_ >= 0; i_108_--) {
		if (i_108_ >= i_107_ >> 1)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[4][0] = is_73_;
	is_73_ = new byte[i_71_ * i_72_];
	i_74_ = 0;
	for (int i_109_ = i_72_ - 1; i_109_ >= 0; i_109_--) {
	    for (int i_110_ = 0; i_110_ < i_71_; i_110_++) {
		if (i_110_ <= i_109_ << 1)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[4][1] = is_73_;
	is_73_ = new byte[i_71_ * i_72_];
	i_74_ = 0;
	for (int i_111_ = 0; i_111_ < i_72_; i_111_++) {
	    for (int i_112_ = 0; i_112_ < i_71_; i_112_++) {
		if (i_112_ >= i_111_ >> 1)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[4][2] = is_73_;
	is_73_ = new byte[i_71_ * i_72_];
	i_74_ = 0;
	for (int i_113_ = 0; i_113_ < i_72_; i_113_++) {
	    for (int i_114_ = i_71_ - 1; i_114_ >= 0; i_114_--) {
		if (i_114_ <= i_113_ << 1)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[4][3] = is_73_;
	is_73_ = new byte[i_71_ * i_72_];
	i_74_ = 0;
	for (int i_115_ = 0; i_115_ < i_72_; i_115_++) {
	    for (int i_116_ = 0; i_116_ < i_71_; i_116_++) {
		if (i_116_ <= i_71_ / 2)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[5][0] = is_73_;
	is_73_ = new byte[i_71_ * i_72_];
	i_74_ = 0;
	for (int i_117_ = 0; i_117_ < i_72_; i_117_++) {
	    for (int i_118_ = 0; i_118_ < i_71_; i_118_++) {
		if (i_117_ <= i_72_ / 2)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[5][1] = is_73_;
	is_73_ = new byte[i_72_ * i_71_];
	i_74_ = 0;
	for (int i_119_ = 0; i_119_ < i_72_; i_119_++) {
	    for (int i_120_ = 0; i_120_ < i_71_; i_120_++) {
		if (i_120_ >= i_71_ / 2)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[5][2] = is_73_;
	is_73_ = new byte[i_72_ * i_71_];
	i_74_ = 0;
	for (int i_121_ = 0; i_121_ < i_72_; i_121_++) {
	    for (int i_122_ = 0; i_122_ < i_71_; i_122_++) {
		if (i_121_ >= i_72_ / 2)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[5][3] = is_73_;
	is_73_ = new byte[i_71_ * i_72_];
	i_74_ = 0;
	for (int i_123_ = 0; i_123_ < i_72_; i_123_++) {
	    for (int i_124_ = 0; i_124_ < i_71_; i_124_++) {
		if (i_124_ <= i_123_ - i_72_ / 2)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[6][0] = is_73_;
	is_73_ = new byte[i_72_ * i_71_];
	i_74_ = 0;
	for (int i_125_ = i_72_ - 1; i_125_ >= 0; i_125_--) {
	    for (int i_126_ = 0; i_126_ < i_71_; i_126_++) {
		if (i_126_ <= i_125_ - i_72_ / 2)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[6][1] = is_73_;
	is_73_ = new byte[i_71_ * i_72_];
	i_74_ = 0;
	for (int i_127_ = i_72_ - 1; i_127_ >= 0; i_127_--) {
	    for (int i_128_ = i_71_ - 1; i_128_ >= 0; i_128_--) {
		if (i_128_ <= i_127_ - i_72_ / 2)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[6][2] = is_73_;
	is_73_ = new byte[i_72_ * i_71_];
	i_74_ = 0;
	for (int i_129_ = 0; i_129_ < i_72_; i_129_++) {
	    for (int i_130_ = i_71_ - 1; i_130_ >= 0; i_130_--) {
		if (i_130_ <= i_129_ - i_72_ / 2)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[6][3] = is_73_;
	is_73_ = new byte[i_71_ * i_72_];
	i_74_ = 0;
	for (int i_131_ = 0; i_131_ < i_72_; i_131_++) {
	    for (int i_132_ = 0; i_132_ < i_71_; i_132_++) {
		if (i_132_ >= i_131_ - i_72_ / 2)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[7][0] = is_73_;
	is_73_ = new byte[i_72_ * i_71_];
	i_74_ = 0;
	for (int i_133_ = i_72_ - 1; i_133_ >= 0; i_133_--) {
	    for (int i_134_ = 0; i_134_ < i_71_; i_134_++) {
		if (i_134_ >= i_133_ - i_72_ / 2)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[7][1] = is_73_;
	is_73_ = new byte[i_71_ * i_72_];
	i_74_ = 0;
	for (int i_135_ = i_72_ - 1; i_135_ >= 0; i_135_--) {
	    for (int i_136_ = i_71_ - 1; i_136_ >= 0; i_136_--) {
		if (i_136_ >= i_135_ - i_72_ / 2)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[7][2] = is_73_;
	is_73_ = new byte[i_71_ * i_72_];
	i_74_ = 0;
	for (int i_137_ = 0; i_137_ < i_72_; i_137_++) {
	    for (int i_138_ = i_71_ - 1; i_138_ >= 0; i_138_--) {
		if (i_138_ >= i_137_ - i_72_ / 2)
		    is_73_[i_74_] = (byte) -1;
		i_74_++;
	    }
	}
	is[7][3] = is_73_;
	return is;
    }
    
    static final void method12769(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class162.method3518(class58, class35, class454, 766495804);
    }
    
    static final void method12770(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, byte i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	int[] is = Class8.extractVarWatchKeys(string, class454, (byte) -99);
	if (null != is)
	    string = string.substring(0, string.length() - 1);
	class58.onVarcstrChangeScript
	    = Class299.extractCs2Params(string, class454, -1960499270);
	class58.varcstrChangeWatch = is;
	class58.hasClientScript = true;
    }
    
    static final void method12771(ClientScriptData class454, byte i) {
	int i_139_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_139_, (byte) -79);
	Class120_Sub6.method16770(class58, class454, 2017551427);
    }
    
    static final void method12772(ClientScriptData class454, int i) {
	int i_140_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class323.method5961((char) i_140_, 1905057057) ? 1 : 0;
    }
    
    static final void method12773(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class13.anInt123 * -371540175;
    }
    
    public static String method12774(CharSequence charsequence, int i) {
	int i_141_ = charsequence.length();
	StringBuilder stringbuilder = new StringBuilder(i_141_);
	for (int i_142_ = 0; i_142_ < i_141_; i_142_++) {
	    char c = charsequence.charAt(i_142_);
	    if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'
		|| c >= '0' && c <= '9' || '.' == c || '-' == c || '*' == c
		|| c == '_')
		stringbuilder.append(c);
	    else if (c == ' ')
		stringbuilder.append('+');
	    else {
		int i_143_ = Class76.method1773(c, 533567879);
		stringbuilder.append('%');
		int i_144_ = i_143_ >> 4 & 0xf;
		if (i_144_ >= 10)
		    stringbuilder.append((char) (55 + i_144_));
		else
		    stringbuilder.append((char) (48 + i_144_));
		i_144_ = i_143_ & 0xf;
		if (i_144_ >= 10)
		    stringbuilder.append((char) (i_144_ + 55));
		else
		    stringbuilder.append((char) (48 + i_144_));
	    }
	}
	return stringbuilder.toString();
    }
    
    static final void method12775(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, byte i) {
	class58.modelType = -1523080562;
	class58.aClass404_1014 = null;
	class58.anInt879
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       * 2003393911);
	if (-1 == class58.slot1 * -389932081 && !class35.aBool374)
	    Class120_Sub7.method16774(445907013 * class58.componentHash,
				      -132895847);
    }
    
    static final void method12776(ClientScriptData class454, byte i) {
	Class72.anInt1099 = 0;
    }
}
