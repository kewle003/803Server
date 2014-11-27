/* Class478 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class478
{
    static Class241_Sub39_Sub11 aClass241_Sub39_Sub11_6402;
    
    public static void method10926(int[] is, int[] is_0_, int i, int i_1_) {
	if (i < i_1_) {
	    int i_2_ = (i + i_1_) / 2;
	    int i_3_ = i;
	    int i_4_ = is[i_2_];
	    is[i_2_] = is[i_1_];
	    is[i_1_] = i_4_;
	    int i_5_ = is_0_[i_2_];
	    is_0_[i_2_] = is_0_[i_1_];
	    is_0_[i_1_] = i_5_;
	    int i_6_ = i_4_ == 2147483647 ? 0 : 1;
	    for (int i_7_ = i; i_7_ < i_1_; i_7_++) {
		if (is[i_7_] < (i_7_ & i_6_) + i_4_) {
		    int i_8_ = is[i_7_];
		    is[i_7_] = is[i_3_];
		    is[i_3_] = i_8_;
		    int i_9_ = is_0_[i_7_];
		    is_0_[i_7_] = is_0_[i_3_];
		    is_0_[i_3_++] = i_9_;
		}
	    }
	    is[i_1_] = is[i_3_];
	    is[i_3_] = i_4_;
	    is_0_[i_1_] = is_0_[i_3_];
	    is_0_[i_3_] = i_5_;
	    Class495.method11284(is, is_0_, i, i_3_ - 1, 1171501690);
	    Class495.method11284(is, is_0_, i_3_ + 1, i_1_, -897321689);
	}
    }
    
    static void method10927(long[] ls, Object[] objects, int i, int i_10_) {
	if (i < i_10_) {
	    int i_11_ = (i_10_ + i) / 2;
	    int i_12_ = i;
	    long l = ls[i_11_];
	    ls[i_11_] = ls[i_10_];
	    ls[i_10_] = l;
	    Object object = objects[i_11_];
	    objects[i_11_] = objects[i_10_];
	    objects[i_10_] = object;
	    int i_13_ = 9223372036854775807L == l ? 0 : 1;
	    for (int i_14_ = i; i_14_ < i_10_; i_14_++) {
		if (ls[i_14_] < l + (long) (i_14_ & i_13_)) {
		    long l_15_ = ls[i_14_];
		    ls[i_14_] = ls[i_12_];
		    ls[i_12_] = l_15_;
		    Object object_16_ = objects[i_14_];
		    objects[i_14_] = objects[i_12_];
		    objects[i_12_++] = object_16_;
		}
	    }
	    ls[i_10_] = ls[i_12_];
	    ls[i_12_] = l;
	    objects[i_10_] = objects[i_12_];
	    objects[i_12_] = object;
	    Class384.method6950(ls, objects, i, i_12_ - 1, -197770634);
	    Class384.method6950(ls, objects, 1 + i_12_, i_10_, -1516949013);
	}
    }
    
    public static void method10928(String[] strings, short[] is) {
	Class65.method1636(strings, is, 0, strings.length - 1, -1997207766);
    }
    
    static void method10929(long[] ls, int[] is, int i, int i_17_) {
	if (i < i_17_) {
	    int i_18_ = (i + i_17_) / 2;
	    int i_19_ = i;
	    long l = ls[i_18_];
	    ls[i_18_] = ls[i_17_];
	    ls[i_17_] = l;
	    int i_20_ = is[i_18_];
	    is[i_18_] = is[i_17_];
	    is[i_17_] = i_20_;
	    int i_21_ = l == 9223372036854775807L ? 0 : 1;
	    for (int i_22_ = i; i_22_ < i_17_; i_22_++) {
		if (ls[i_22_] < l + (long) (i_22_ & i_21_)) {
		    long l_23_ = ls[i_22_];
		    ls[i_22_] = ls[i_19_];
		    ls[i_19_] = l_23_;
		    int i_24_ = is[i_22_];
		    is[i_22_] = is[i_19_];
		    is[i_19_++] = i_24_;
		}
	    }
	    ls[i_17_] = ls[i_19_];
	    ls[i_19_] = l;
	    is[i_17_] = is[i_19_];
	    is[i_19_] = i_20_;
	    Class241_Sub38.method16440(ls, is, i, i_19_ - 1, (byte) 19);
	    Class241_Sub38.method16440(ls, is, 1 + i_19_, i_17_, (byte) 53);
	}
    }
    
    static void method10930(String[] strings, int[] is, int i, int i_25_) {
	if (i < i_25_) {
	    int i_26_ = (i_25_ + i) / 2;
	    int i_27_ = i;
	    String string = strings[i_26_];
	    strings[i_26_] = strings[i_25_];
	    strings[i_25_] = string;
	    int i_28_ = is[i_26_];
	    is[i_26_] = is[i_25_];
	    is[i_25_] = i_28_;
	    for (int i_29_ = i; i_29_ < i_25_; i_29_++) {
		if (string == null
		    || (strings[i_29_] != null
			&& strings[i_29_].compareTo(string) < (i_29_ & 0x1))) {
		    String string_30_ = strings[i_29_];
		    strings[i_29_] = strings[i_27_];
		    strings[i_27_] = string_30_;
		    int i_31_ = is[i_29_];
		    is[i_29_] = is[i_27_];
		    is[i_27_++] = i_31_;
		}
	    }
	    strings[i_25_] = strings[i_27_];
	    strings[i_27_] = string;
	    is[i_25_] = is[i_27_];
	    is[i_27_] = i_28_;
	    Class501.method11444(strings, is, i, i_27_ - 1, -505057213);
	    Class501.method11444(strings, is, i_27_ + 1, i_25_, -507008443);
	}
    }
    
    Class478() throws Throwable {
	throw new Error();
    }
    
    public static void method10931(long[] ls, int[] is) {
	Class241_Sub38.method16440(ls, is, 0, ls.length - 1, (byte) 103);
    }
    
    public static void method10932(long[] ls, int[] is) {
	Class241_Sub38.method16440(ls, is, 0, ls.length - 1, (byte) 84);
    }
    
    static void method10933(long[] ls, int[] is, int i, int i_32_) {
	if (i < i_32_) {
	    int i_33_ = (i + i_32_) / 2;
	    int i_34_ = i;
	    long l = ls[i_33_];
	    ls[i_33_] = ls[i_32_];
	    ls[i_32_] = l;
	    int i_35_ = is[i_33_];
	    is[i_33_] = is[i_32_];
	    is[i_32_] = i_35_;
	    int i_36_ = l == 9223372036854775807L ? 0 : 1;
	    for (int i_37_ = i; i_37_ < i_32_; i_37_++) {
		if (ls[i_37_] < l + (long) (i_37_ & i_36_)) {
		    long l_38_ = ls[i_37_];
		    ls[i_37_] = ls[i_34_];
		    ls[i_34_] = l_38_;
		    int i_39_ = is[i_37_];
		    is[i_37_] = is[i_34_];
		    is[i_34_++] = i_39_;
		}
	    }
	    ls[i_32_] = ls[i_34_];
	    ls[i_34_] = l;
	    is[i_32_] = is[i_34_];
	    is[i_34_] = i_35_;
	    Class241_Sub38.method16440(ls, is, i, i_34_ - 1, (byte) 93);
	    Class241_Sub38.method16440(ls, is, 1 + i_34_, i_32_, (byte) 37);
	}
    }
    
    public static void method10934(String[] strings, short[] is) {
	Class65.method1636(strings, is, 0, strings.length - 1, -331445392);
    }
    
    static void method10935(long[] ls, int[] is, int i, int i_40_) {
	if (i < i_40_) {
	    int i_41_ = (i + i_40_) / 2;
	    int i_42_ = i;
	    long l = ls[i_41_];
	    ls[i_41_] = ls[i_40_];
	    ls[i_40_] = l;
	    int i_43_ = is[i_41_];
	    is[i_41_] = is[i_40_];
	    is[i_40_] = i_43_;
	    int i_44_ = l == 9223372036854775807L ? 0 : 1;
	    for (int i_45_ = i; i_45_ < i_40_; i_45_++) {
		if (ls[i_45_] < l + (long) (i_45_ & i_44_)) {
		    long l_46_ = ls[i_45_];
		    ls[i_45_] = ls[i_42_];
		    ls[i_42_] = l_46_;
		    int i_47_ = is[i_45_];
		    is[i_45_] = is[i_42_];
		    is[i_42_++] = i_47_;
		}
	    }
	    ls[i_40_] = ls[i_42_];
	    ls[i_42_] = l;
	    is[i_40_] = is[i_42_];
	    is[i_42_] = i_43_;
	    Class241_Sub38.method16440(ls, is, i, i_42_ - 1, (byte) 110);
	    Class241_Sub38.method16440(ls, is, 1 + i_42_, i_40_, (byte) 43);
	}
    }
    
    static void method10936(long[] ls, int[] is, int i, int i_48_) {
	if (i < i_48_) {
	    int i_49_ = (i + i_48_) / 2;
	    int i_50_ = i;
	    long l = ls[i_49_];
	    ls[i_49_] = ls[i_48_];
	    ls[i_48_] = l;
	    int i_51_ = is[i_49_];
	    is[i_49_] = is[i_48_];
	    is[i_48_] = i_51_;
	    int i_52_ = l == 9223372036854775807L ? 0 : 1;
	    for (int i_53_ = i; i_53_ < i_48_; i_53_++) {
		if (ls[i_53_] < l + (long) (i_53_ & i_52_)) {
		    long l_54_ = ls[i_53_];
		    ls[i_53_] = ls[i_50_];
		    ls[i_50_] = l_54_;
		    int i_55_ = is[i_53_];
		    is[i_53_] = is[i_50_];
		    is[i_50_++] = i_55_;
		}
	    }
	    ls[i_48_] = ls[i_50_];
	    ls[i_50_] = l;
	    is[i_48_] = is[i_50_];
	    is[i_50_] = i_51_;
	    Class241_Sub38.method16440(ls, is, i, i_50_ - 1, (byte) 100);
	    Class241_Sub38.method16440(ls, is, 1 + i_50_, i_48_, (byte) 43);
	}
    }
    
    public static void method10937(float[] fs, int[] is, int i, int i_56_) {
	if (i < i_56_) {
	    int i_57_ = (i + i_56_) / 2;
	    int i_58_ = i;
	    float f = fs[i_57_];
	    fs[i_57_] = fs[i_56_];
	    fs[i_56_] = f;
	    int i_59_ = is[i_57_];
	    is[i_57_] = is[i_56_];
	    is[i_56_] = i_59_;
	    for (int i_60_ = i; i_60_ < i_56_; i_60_++) {
		if (fs[i_60_] > f) {
		    float f_61_ = fs[i_60_];
		    fs[i_60_] = fs[i_58_];
		    fs[i_58_] = f_61_;
		    int i_62_ = is[i_60_];
		    is[i_60_] = is[i_58_];
		    is[i_58_++] = i_62_;
		}
	    }
	    fs[i_56_] = fs[i_58_];
	    fs[i_58_] = f;
	    is[i_56_] = is[i_58_];
	    is[i_58_] = i_59_;
	    Class76.method1769(fs, is, i, i_58_ - 1, 187705312);
	    Class76.method1769(fs, is, i_58_ + 1, i_56_, 101020395);
	}
    }
    
    public static void method10938(int[] is, float[] fs, float[] fs_63_) {
	Class225.method4628(is, fs, fs_63_, 0, is.length - 1, 1153304405);
    }
    
    public static void method10939(float[] fs, int[] is, int i, int i_64_) {
	if (i < i_64_) {
	    int i_65_ = (i + i_64_) / 2;
	    int i_66_ = i;
	    float f = fs[i_65_];
	    fs[i_65_] = fs[i_64_];
	    fs[i_64_] = f;
	    int i_67_ = is[i_65_];
	    is[i_65_] = is[i_64_];
	    is[i_64_] = i_67_;
	    for (int i_68_ = i; i_68_ < i_64_; i_68_++) {
		if (fs[i_68_] > f) {
		    float f_69_ = fs[i_68_];
		    fs[i_68_] = fs[i_66_];
		    fs[i_66_] = f_69_;
		    int i_70_ = is[i_68_];
		    is[i_68_] = is[i_66_];
		    is[i_66_++] = i_70_;
		}
	    }
	    fs[i_64_] = fs[i_66_];
	    fs[i_66_] = f;
	    is[i_64_] = is[i_66_];
	    is[i_66_] = i_67_;
	    Class76.method1769(fs, is, i, i_66_ - 1, 672571630);
	    Class76.method1769(fs, is, i_66_ + 1, i_64_, -326679643);
	}
    }
    
    public static void method10940(int[] is, float[] fs, float[] fs_71_) {
	Class225.method4628(is, fs, fs_71_, 0, is.length - 1, 1475456305);
    }
    
    public static void method10941(String[] strings, int[] is) {
	Class501.method11444(strings, is, 0, strings.length - 1, -1116087330);
    }
    
    public static void method10942(int[] is, float[] fs, float[] fs_72_) {
	Class225.method4628(is, fs, fs_72_, 0, is.length - 1, 952257612);
    }
    
    public static void method10943(int[] is, float[] fs, float[] fs_73_) {
	Class225.method4628(is, fs, fs_73_, 0, is.length - 1, 1136107767);
    }
    
    static void method10944(int[] is, float[] fs, float[] fs_74_, int i,
			    int i_75_) {
	if (i < i_75_) {
	    int i_76_ = (i + i_75_) / 2;
	    int i_77_ = i;
	    int i_78_ = is[i_76_];
	    is[i_76_] = is[i_75_];
	    is[i_75_] = i_78_;
	    float f = fs[i_76_];
	    fs[i_76_] = fs[i_75_];
	    fs[i_75_] = f;
	    float f_79_ = fs_74_[i_76_];
	    fs_74_[i_76_] = fs_74_[i_75_];
	    fs_74_[i_75_] = f_79_;
	    int i_80_ = 9223372036854775807L == (long) i_78_ ? 0 : 1;
	    for (int i_81_ = i; i_81_ < i_75_; i_81_++) {
		if (is[i_81_] < i_78_ + (i_81_ & i_80_)) {
		    int i_82_ = is[i_81_];
		    is[i_81_] = is[i_77_];
		    is[i_77_] = i_82_;
		    float f_83_ = fs[i_81_];
		    fs[i_81_] = fs[i_77_];
		    fs[i_77_] = f_83_;
		    float f_84_ = fs_74_[i_81_];
		    fs_74_[i_81_] = fs_74_[i_77_];
		    fs_74_[i_77_] = f_84_;
		    i_77_++;
		}
	    }
	    is[i_75_] = is[i_77_];
	    is[i_77_] = i_78_;
	    fs[i_75_] = fs[i_77_];
	    fs[i_77_] = f;
	    fs_74_[i_75_] = fs_74_[i_77_];
	    fs_74_[i_77_] = f_79_;
	    Class225.method4628(is, fs, fs_74_, i, i_77_ - 1, -1452825269);
	    Class225.method4628(is, fs, fs_74_, 1 + i_77_, i_75_, 2000372966);
	}
    }
    
    static void method10945(int[] is, float[] fs, float[] fs_85_, int i,
			    int i_86_) {
	if (i < i_86_) {
	    int i_87_ = (i + i_86_) / 2;
	    int i_88_ = i;
	    int i_89_ = is[i_87_];
	    is[i_87_] = is[i_86_];
	    is[i_86_] = i_89_;
	    float f = fs[i_87_];
	    fs[i_87_] = fs[i_86_];
	    fs[i_86_] = f;
	    float f_90_ = fs_85_[i_87_];
	    fs_85_[i_87_] = fs_85_[i_86_];
	    fs_85_[i_86_] = f_90_;
	    int i_91_ = 9223372036854775807L == (long) i_89_ ? 0 : 1;
	    for (int i_92_ = i; i_92_ < i_86_; i_92_++) {
		if (is[i_92_] < i_89_ + (i_92_ & i_91_)) {
		    int i_93_ = is[i_92_];
		    is[i_92_] = is[i_88_];
		    is[i_88_] = i_93_;
		    float f_94_ = fs[i_92_];
		    fs[i_92_] = fs[i_88_];
		    fs[i_88_] = f_94_;
		    float f_95_ = fs_85_[i_92_];
		    fs_85_[i_92_] = fs_85_[i_88_];
		    fs_85_[i_88_] = f_95_;
		    i_88_++;
		}
	    }
	    is[i_86_] = is[i_88_];
	    is[i_88_] = i_89_;
	    fs[i_86_] = fs[i_88_];
	    fs[i_88_] = f;
	    fs_85_[i_86_] = fs_85_[i_88_];
	    fs_85_[i_88_] = f_90_;
	    Class225.method4628(is, fs, fs_85_, i, i_88_ - 1, 295964919);
	    Class225.method4628(is, fs, fs_85_, 1 + i_88_, i_86_, -2096810595);
	}
    }
    
    public static void method10946(int[] is, Object[] objects) {
	Class487.method11145(is, objects, 0, is.length - 1, -530253391);
    }
    
    public static void method10947(int[] is, Object[] objects) {
	Class487.method11145(is, objects, 0, is.length - 1, -530253391);
    }
    
    public static void method10948(float[] fs, int[] is, int i, int i_96_) {
	if (i < i_96_) {
	    int i_97_ = (i + i_96_) / 2;
	    int i_98_ = i;
	    float f = fs[i_97_];
	    fs[i_97_] = fs[i_96_];
	    fs[i_96_] = f;
	    int i_99_ = is[i_97_];
	    is[i_97_] = is[i_96_];
	    is[i_96_] = i_99_;
	    for (int i_100_ = i; i_100_ < i_96_; i_100_++) {
		if (fs[i_100_] > f) {
		    float f_101_ = fs[i_100_];
		    fs[i_100_] = fs[i_98_];
		    fs[i_98_] = f_101_;
		    int i_102_ = is[i_100_];
		    is[i_100_] = is[i_98_];
		    is[i_98_++] = i_102_;
		}
	    }
	    fs[i_96_] = fs[i_98_];
	    fs[i_98_] = f;
	    is[i_96_] = is[i_98_];
	    is[i_98_] = i_99_;
	    Class76.method1769(fs, is, i, i_98_ - 1, 658524993);
	    Class76.method1769(fs, is, i_98_ + 1, i_96_, -348456375);
	}
    }
    
    public static void method10949(long[] ls, Object[] objects) {
	Class384.method6950(ls, objects, 0, ls.length - 1, -940336494);
    }
    
    public static void method10950(int[] is, Object[] objects, int i,
				   int i_103_) {
	if (i < i_103_) {
	    int i_104_ = (i_103_ + i) / 2;
	    int i_105_ = i;
	    int i_106_ = is[i_104_];
	    is[i_104_] = is[i_103_];
	    is[i_103_] = i_106_;
	    Object object = objects[i_104_];
	    objects[i_104_] = objects[i_103_];
	    objects[i_103_] = object;
	    int i_107_ = 2147483647 == i_106_ ? 0 : 1;
	    for (int i_108_ = i; i_108_ < i_103_; i_108_++) {
		if (is[i_108_] < i_106_ + (i_108_ & i_107_)) {
		    int i_109_ = is[i_108_];
		    is[i_108_] = is[i_105_];
		    is[i_105_] = i_109_;
		    Object object_110_ = objects[i_108_];
		    objects[i_108_] = objects[i_105_];
		    objects[i_105_++] = object_110_;
		}
	    }
	    is[i_103_] = is[i_105_];
	    is[i_105_] = i_106_;
	    objects[i_103_] = objects[i_105_];
	    objects[i_105_] = object;
	    Class487.method11145(is, objects, i, i_105_ - 1, -530253391);
	    Class487.method11145(is, objects, 1 + i_105_, i_103_, -530253391);
	}
    }
    
    public static void method10951(long[] ls, Object[] objects) {
	Class384.method6950(ls, objects, 0, ls.length - 1, -1220107515);
    }
    
    public static void method10952(long[] ls, Object[] objects) {
	Class384.method6950(ls, objects, 0, ls.length - 1, -674520432);
    }
    
    static final void method10953(ClientScriptData class454, byte i) {
	int i_111_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_111_, (byte) -4);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_111_ >> 16];
	Class496.method11289(class58, class35, class454, (byte) 48);
    }
    
    static final void method10954(ClientScriptData class454, int i) {
	int i_112_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_112_, (byte) -106);
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = class58.text;
    }
    
    static final void method10955(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	Class402.soundManager.method1169
	    ((((ClientScriptData) class454).integerStack
	      [1482319719 * ((ClientScriptData) class454).intStackPointer]),
	     (((ClientScriptData) class454).integerStack
	      [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]),
	     -1571569323);
    }
    
    static final void method10956(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub6_8888
		  .method14143(1970107779);
    }
    
    static void method10957(byte[] data, int i) {
		RSByteBuffer buffer = new RSByteBuffer(data);
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) 77);
		    if (0 == opcode) {
		    	break;
		    }
		    if (opcode == 1) {
				int i_114_ = buffer.readUnsignedShort(1162222719);
				Class402.soundManager.method1165(i_114_, (byte) -6);
		    }
		}
    }
}
