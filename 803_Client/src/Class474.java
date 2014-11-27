/* Class474 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class474
{
    public static int[] anIntArray6380;
    static int anInt6381;
    public static int[] anIntArray6382;
    public static int[] anIntArray6383;
    static int anInt6384 = 0;
    public static boolean aBool6385;
    static int anInt6386;
    
    static void method10840() {
	if (null == anIntArray6382)
	    anIntArray6382 = new int[65536];
	else
	    return;
	double d = 0.7 + (Math.random() * 0.03 - 0.015);
	int i = 0;
	for (int i_0_ = 0; i_0_ < 512; i_0_++) {
	    float f = (0.0078125F + (float) (i_0_ >> 3) / 64.0F) * 360.0F;
	    float f_1_ = 0.0625F + (float) (i_0_ & 0x7) / 8.0F;
	    for (int i_2_ = 0; i_2_ < 128; i_2_++) {
		float f_3_ = (float) i_2_ / 128.0F;
		float f_4_ = 0.0F;
		float f_5_ = 0.0F;
		float f_6_ = 0.0F;
		float f_7_ = f / 60.0F;
		int i_8_ = (int) f_7_;
		int i_9_ = i_8_ % 6;
		float f_10_ = f_7_ - (float) i_8_;
		float f_11_ = f_3_ * (1.0F - f_1_);
		float f_12_ = (1.0F - f_1_ * f_10_) * f_3_;
		float f_13_ = (1.0F - (1.0F - f_10_) * f_1_) * f_3_;
		if (0 == i_9_) {
		    f_4_ = f_3_;
		    f_5_ = f_13_;
		    f_6_ = f_11_;
		} else if (i_9_ == 1) {
		    f_4_ = f_12_;
		    f_5_ = f_3_;
		    f_6_ = f_11_;
		} else if (2 == i_9_) {
		    f_4_ = f_11_;
		    f_5_ = f_3_;
		    f_6_ = f_13_;
		} else if (3 == i_9_) {
		    f_4_ = f_11_;
		    f_5_ = f_12_;
		    f_6_ = f_3_;
		} else if (4 == i_9_) {
		    f_4_ = f_13_;
		    f_5_ = f_11_;
		    f_6_ = f_3_;
		} else if (5 == i_9_) {
		    f_4_ = f_3_;
		    f_5_ = f_11_;
		    f_6_ = f_12_;
		}
		f_4_ = (float) Math.pow((double) f_4_, d);
		f_5_ = (float) Math.pow((double) f_5_, d);
		f_6_ = (float) Math.pow((double) f_6_, d);
		int i_14_ = (int) (f_4_ * 256.0F);
		int i_15_ = (int) (256.0F * f_5_);
		int i_16_ = (int) (f_6_ * 256.0F);
		int i_17_ = (i_15_ << 8) + ((i_14_ << 16) + -16777216) + i_16_;
		anIntArray6382[i++] = i_17_;
	    }
	}
    }
    
    static {
	anInt6381 = 0;
    }
    
    public static void method10841(boolean bool, boolean bool_18_) {
	if (bool) {
	    anInt6384 += -2094050269;
	    SparseVarDomain.method3105((byte) 4);
	}
	if (bool_18_) {
	    anInt6381 += -1311077067;
	    Class241_Sub7.method14894(1270249717);
	}
    }
    
    public static int method10842(int i, int i_19_) {
	i_19_ = (i & 0x7f) * i_19_ >> 7;
	if (i_19_ < 2)
	    i_19_ = 2;
	else if (i_19_ > 126)
	    i_19_ = 126;
	return i_19_ + (i & 0xff80);
    }
    
    public static int method10843(int i, int i_20_, int i_21_) {
	int i_22_ = 255 - i_21_;
	i_20_ = (i_21_ * (i_20_ & 0xff00ff) & ~0xff00ff
		 | i_21_ * (i_20_ & 0xff00) & 0xff0000) >>> 8;
	return (((i_22_ * (i & 0xff00ff) & ~0xff00ff
		  | (i & 0xff00) * i_22_ & 0xff0000)
		 >>> 8)
		+ i_20_);
    }
    
    public static void method10844(boolean bool, boolean bool_23_) {
	if (bool) {
	    anInt6384 -= -2094050269;
	    if (anInt6384 * -463078517 == 0)
		anIntArray6382 = null;
	}
	if (bool_23_) {
	    anInt6381 -= -1311077067;
	    if (anInt6381 * -501015267 == 0)
		anIntArray6383 = null;
	}
    }
    
    public static void method10845(boolean bool, boolean bool_24_) {
	if (bool) {
	    anInt6384 -= -2094050269;
	    if (anInt6384 * -463078517 == 0)
		anIntArray6382 = null;
	}
	if (bool_24_) {
	    anInt6381 -= -1311077067;
	    if (anInt6381 * -501015267 == 0)
		anIntArray6383 = null;
	}
    }
    
    public static void method10846(boolean bool, boolean bool_25_) {
	if (bool) {
	    anInt6384 -= -2094050269;
	    if (anInt6384 * -463078517 == 0)
		anIntArray6382 = null;
	}
	if (bool_25_) {
	    anInt6381 -= -1311077067;
	    if (anInt6381 * -501015267 == 0)
		anIntArray6383 = null;
	}
    }
    
    public static void method10847(boolean bool, boolean bool_26_) {
	if (bool) {
	    anInt6384 -= -2094050269;
	    if (anInt6384 * -463078517 == 0)
		anIntArray6382 = null;
	}
	if (bool_26_) {
	    anInt6381 -= -1311077067;
	    if (anInt6381 * -501015267 == 0)
		anIntArray6383 = null;
	}
    }
    
    static void method10848() {
	if (null == anIntArray6382)
	    anIntArray6382 = new int[65536];
	else
	    return;
	double d = 0.7 + (Math.random() * 0.03 - 0.015);
	int i = 0;
	for (int i_27_ = 0; i_27_ < 512; i_27_++) {
	    float f = (0.0078125F + (float) (i_27_ >> 3) / 64.0F) * 360.0F;
	    float f_28_ = 0.0625F + (float) (i_27_ & 0x7) / 8.0F;
	    for (int i_29_ = 0; i_29_ < 128; i_29_++) {
		float f_30_ = (float) i_29_ / 128.0F;
		float f_31_ = 0.0F;
		float f_32_ = 0.0F;
		float f_33_ = 0.0F;
		float f_34_ = f / 60.0F;
		int i_35_ = (int) f_34_;
		int i_36_ = i_35_ % 6;
		float f_37_ = f_34_ - (float) i_35_;
		float f_38_ = f_30_ * (1.0F - f_28_);
		float f_39_ = (1.0F - f_28_ * f_37_) * f_30_;
		float f_40_ = (1.0F - (1.0F - f_37_) * f_28_) * f_30_;
		if (0 == i_36_) {
		    f_31_ = f_30_;
		    f_32_ = f_40_;
		    f_33_ = f_38_;
		} else if (i_36_ == 1) {
		    f_31_ = f_39_;
		    f_32_ = f_30_;
		    f_33_ = f_38_;
		} else if (2 == i_36_) {
		    f_31_ = f_38_;
		    f_32_ = f_30_;
		    f_33_ = f_40_;
		} else if (3 == i_36_) {
		    f_31_ = f_38_;
		    f_32_ = f_39_;
		    f_33_ = f_30_;
		} else if (4 == i_36_) {
		    f_31_ = f_40_;
		    f_32_ = f_38_;
		    f_33_ = f_30_;
		} else if (5 == i_36_) {
		    f_31_ = f_30_;
		    f_32_ = f_38_;
		    f_33_ = f_39_;
		}
		f_31_ = (float) Math.pow((double) f_31_, d);
		f_32_ = (float) Math.pow((double) f_32_, d);
		f_33_ = (float) Math.pow((double) f_33_, d);
		int i_41_ = (int) (f_31_ * 256.0F);
		int i_42_ = (int) (256.0F * f_32_);
		int i_43_ = (int) (f_33_ * 256.0F);
		int i_44_ = (i_42_ << 8) + ((i_41_ << 16) + -16777216) + i_43_;
		anIntArray6382[i++] = i_44_;
	    }
	}
    }
    
    public static short method10849(int i) {
	int i_45_ = i >> 10 & 0x3f;
	int i_46_ = i >> 3 & 0x70;
	int i_47_ = i & 0x7f;
	i_46_ = i_47_ <= 64 ? i_47_ * i_46_ >> 7 : i_46_ * (127 - i_47_) >> 7;
	int i_48_ = i_47_ + i_46_;
	int i_49_;
	if (i_48_ != 0)
	    i_49_ = (i_46_ << 8) / i_48_;
	else
	    i_49_ = i_46_ << 1;
	int i_50_ = i_48_;
	return (short) (i_45_ << 10 | i_49_ >> 4 << 7 | i_50_);
    }
    
    public static int method10850(int i, int i_51_, int i_52_) {
	int i_53_ = 255 - i_52_;
	i_51_ = (i_52_ * (i_51_ & 0xff00ff) & ~0xff00ff
		 | i_52_ * (i_51_ & 0xff00) & 0xff0000) >>> 8;
	return (((i_53_ * (i & 0xff00ff) & ~0xff00ff
		  | (i & 0xff00) * i_53_ & 0xff0000)
		 >>> 8)
		+ i_51_);
    }
    
    static void method10851() {
	if (anIntArray6383 == null) {
	    anIntArray6383 = new int[65536];
	    anIntArray6380 = new int[65536];
	    double d = 0.7 + (Math.random() * 0.03 - 0.015);
	    for (int i = 0; i < 65536; i++) {
		double d_54_ = 0.0078125 + (double) (i >> 10 & 0x3f) / 64.0;
		double d_55_ = 0.0625 + (double) (i >> 7 & 0x7) / 8.0;
		double d_56_ = (double) (i & 0x7f) / 128.0;
		double d_57_ = d_56_;
		double d_58_ = d_56_;
		double d_59_ = d_56_;
		if (d_55_ != 0.0) {
		    double d_60_;
		    if (d_56_ < 0.5)
			d_60_ = d_56_ * (d_55_ + 1.0);
		    else
			d_60_ = d_56_ + d_55_ - d_55_ * d_56_;
		    double d_61_ = d_56_ * 2.0 - d_60_;
		    double d_62_ = d_54_ + 0.3333333333333333;
		    if (d_62_ > 1.0)
			d_62_--;
		    double d_63_ = d_54_;
		    double d_64_ = d_54_ - 0.3333333333333333;
		    if (d_64_ < 0.0)
			d_64_++;
		    if (d_62_ * 6.0 < 1.0)
			d_57_ = d_62_ * (6.0 * (d_60_ - d_61_)) + d_61_;
		    else if (d_62_ * 2.0 < 1.0)
			d_57_ = d_60_;
		    else if (3.0 * d_62_ < 2.0)
			d_57_ = ((d_60_ - d_61_) * (0.6666666666666666 - d_62_)
				 * 6.0) + d_61_;
		    else
			d_57_ = d_61_;
		    if (d_63_ * 6.0 < 1.0)
			d_58_ = d_63_ * ((d_60_ - d_61_) * 6.0) + d_61_;
		    else if (d_63_ * 2.0 < 1.0)
			d_58_ = d_60_;
		    else if (d_63_ * 3.0 < 2.0)
			d_58_ = d_61_ + 6.0 * ((d_60_ - d_61_)
					       * (0.6666666666666666 - d_63_));
		    else
			d_58_ = d_61_;
		    if (6.0 * d_64_ < 1.0)
			d_59_ = d_61_ + d_64_ * (6.0 * (d_60_ - d_61_));
		    else if (2.0 * d_64_ < 1.0)
			d_59_ = d_60_;
		    else if (d_64_ * 3.0 < 2.0)
			d_59_ = d_61_ + ((0.6666666666666666 - d_64_)
					 * (d_60_ - d_61_) * 6.0);
		    else
			d_59_ = d_61_;
		}
		d_57_ = Math.pow(d_57_, d);
		d_58_ = Math.pow(d_58_, d);
		d_59_ = Math.pow(d_59_, d);
		int i_65_ = (int) (d_57_ * 256.0);
		int i_66_ = (int) (d_58_ * 256.0);
		int i_67_ = (int) (d_59_ * 256.0);
		int i_68_ = i_67_ + ((i_65_ << 16) + (i_66_ << 8));
		anIntArray6383[i] = i_68_ & 0xffffff;
		int i_69_ = (i_66_ << 8) + (i_67_ << 16) + i_65_;
		anIntArray6380[i] = i_69_;
	    }
	}
    }
    
    static void method10852() {
	if (anIntArray6383 == null) {
	    anIntArray6383 = new int[65536];
	    anIntArray6380 = new int[65536];
	    double d = 0.7 + (Math.random() * 0.03 - 0.015);
	    for (int i = 0; i < 65536; i++) {
		double d_70_ = 0.0078125 + (double) (i >> 10 & 0x3f) / 64.0;
		double d_71_ = 0.0625 + (double) (i >> 7 & 0x7) / 8.0;
		double d_72_ = (double) (i & 0x7f) / 128.0;
		double d_73_ = d_72_;
		double d_74_ = d_72_;
		double d_75_ = d_72_;
		if (d_71_ != 0.0) {
		    double d_76_;
		    if (d_72_ < 0.5)
			d_76_ = d_72_ * (d_71_ + 1.0);
		    else
			d_76_ = d_72_ + d_71_ - d_71_ * d_72_;
		    double d_77_ = d_72_ * 2.0 - d_76_;
		    double d_78_ = d_70_ + 0.3333333333333333;
		    if (d_78_ > 1.0)
			d_78_--;
		    double d_79_ = d_70_;
		    double d_80_ = d_70_ - 0.3333333333333333;
		    if (d_80_ < 0.0)
			d_80_++;
		    if (d_78_ * 6.0 < 1.0)
			d_73_ = d_78_ * (6.0 * (d_76_ - d_77_)) + d_77_;
		    else if (d_78_ * 2.0 < 1.0)
			d_73_ = d_76_;
		    else if (3.0 * d_78_ < 2.0)
			d_73_ = ((d_76_ - d_77_) * (0.6666666666666666 - d_78_)
				 * 6.0) + d_77_;
		    else
			d_73_ = d_77_;
		    if (d_79_ * 6.0 < 1.0)
			d_74_ = d_79_ * ((d_76_ - d_77_) * 6.0) + d_77_;
		    else if (d_79_ * 2.0 < 1.0)
			d_74_ = d_76_;
		    else if (d_79_ * 3.0 < 2.0)
			d_74_ = d_77_ + 6.0 * ((d_76_ - d_77_)
					       * (0.6666666666666666 - d_79_));
		    else
			d_74_ = d_77_;
		    if (6.0 * d_80_ < 1.0)
			d_75_ = d_77_ + d_80_ * (6.0 * (d_76_ - d_77_));
		    else if (2.0 * d_80_ < 1.0)
			d_75_ = d_76_;
		    else if (d_80_ * 3.0 < 2.0)
			d_75_ = d_77_ + ((0.6666666666666666 - d_80_)
					 * (d_76_ - d_77_) * 6.0);
		    else
			d_75_ = d_77_;
		}
		d_73_ = Math.pow(d_73_, d);
		d_74_ = Math.pow(d_74_, d);
		d_75_ = Math.pow(d_75_, d);
		int i_81_ = (int) (d_73_ * 256.0);
		int i_82_ = (int) (d_74_ * 256.0);
		int i_83_ = (int) (d_75_ * 256.0);
		int i_84_ = i_83_ + ((i_81_ << 16) + (i_82_ << 8));
		anIntArray6383[i] = i_84_ & 0xffffff;
		int i_85_ = (i_82_ << 8) + (i_83_ << 16) + i_81_;
		anIntArray6380[i] = i_85_;
	    }
	}
    }
    
    public static int method10853(int i, int i_86_) {
	i_86_ = (i & 0x7f) * i_86_ >> 7;
	if (i_86_ < 2)
	    i_86_ = 2;
	else if (i_86_ > 126)
	    i_86_ = 126;
	return i_86_ + (i & 0xff80);
    }
    
    public static short method10854(int i) {
	int i_87_ = i >> 10 & 0x3f;
	int i_88_ = i >> 3 & 0x70;
	int i_89_ = i & 0x7f;
	i_88_ = i_89_ <= 64 ? i_89_ * i_88_ >> 7 : i_88_ * (127 - i_89_) >> 7;
	int i_90_ = i_89_ + i_88_;
	int i_91_;
	if (i_90_ != 0)
	    i_91_ = (i_88_ << 8) / i_90_;
	else
	    i_91_ = i_88_ << 1;
	int i_92_ = i_90_;
	return (short) (i_87_ << 10 | i_91_ >> 4 << 7 | i_92_);
    }
    
    static void method10855() {
	if (null == anIntArray6382)
	    anIntArray6382 = new int[65536];
	else
	    return;
	double d = 0.7 + (Math.random() * 0.03 - 0.015);
	int i = 0;
	for (int i_93_ = 0; i_93_ < 512; i_93_++) {
	    float f = (0.0078125F + (float) (i_93_ >> 3) / 64.0F) * 360.0F;
	    float f_94_ = 0.0625F + (float) (i_93_ & 0x7) / 8.0F;
	    for (int i_95_ = 0; i_95_ < 128; i_95_++) {
		float f_96_ = (float) i_95_ / 128.0F;
		float f_97_ = 0.0F;
		float f_98_ = 0.0F;
		float f_99_ = 0.0F;
		float f_100_ = f / 60.0F;
		int i_101_ = (int) f_100_;
		int i_102_ = i_101_ % 6;
		float f_103_ = f_100_ - (float) i_101_;
		float f_104_ = f_96_ * (1.0F - f_94_);
		float f_105_ = (1.0F - f_94_ * f_103_) * f_96_;
		float f_106_ = (1.0F - (1.0F - f_103_) * f_94_) * f_96_;
		if (0 == i_102_) {
		    f_97_ = f_96_;
		    f_98_ = f_106_;
		    f_99_ = f_104_;
		} else if (i_102_ == 1) {
		    f_97_ = f_105_;
		    f_98_ = f_96_;
		    f_99_ = f_104_;
		} else if (2 == i_102_) {
		    f_97_ = f_104_;
		    f_98_ = f_96_;
		    f_99_ = f_106_;
		} else if (3 == i_102_) {
		    f_97_ = f_104_;
		    f_98_ = f_105_;
		    f_99_ = f_96_;
		} else if (4 == i_102_) {
		    f_97_ = f_106_;
		    f_98_ = f_104_;
		    f_99_ = f_96_;
		} else if (5 == i_102_) {
		    f_97_ = f_96_;
		    f_98_ = f_104_;
		    f_99_ = f_105_;
		}
		f_97_ = (float) Math.pow((double) f_97_, d);
		f_98_ = (float) Math.pow((double) f_98_, d);
		f_99_ = (float) Math.pow((double) f_99_, d);
		int i_107_ = (int) (f_97_ * 256.0F);
		int i_108_ = (int) (256.0F * f_98_);
		int i_109_ = (int) (f_99_ * 256.0F);
		int i_110_
		    = (i_108_ << 8) + ((i_107_ << 16) + -16777216) + i_109_;
		anIntArray6382[i++] = i_110_;
	    }
	}
    }
    
    public static int method10856(int i, int i_111_) {
	int i_112_ = i_111_ >>> 24;
	int i_113_ = 255 - i_112_;
	i_111_ = ((i_111_ & 0xff00ff) * i_112_ & ~0xff00ff
		  | i_112_ * (i_111_ & 0xff00) & 0xff0000) >>> 8;
	return i_111_ + (((i & 0xff00ff) * i_113_ & ~0xff00ff
			  | (i & 0xff00) * i_113_ & 0xff0000)
			 >>> 8);
    }
    
    public static int method10857(int i, int i_114_, float f) {
	return CsDelta_Add.method17423(i, i_114_, (int) f, -122370691);
    }
    
    Class474() throws Throwable {
	throw new Error();
    }
    
    public static int method10858(int i, int i_115_) {
	int i_116_ = i_115_ >>> 24;
	int i_117_ = 255 - i_116_;
	i_115_ = ((i_115_ & 0xff00ff) * i_116_ & ~0xff00ff
		  | i_116_ * (i_115_ & 0xff00) & 0xff0000) >>> 8;
	return i_115_ + (((i & 0xff00ff) * i_117_ & ~0xff00ff
			  | (i & 0xff00) * i_117_ & 0xff0000)
			 >>> 8);
    }
    
    public static void method10859(boolean bool, boolean bool_118_) {
	if (bool) {
	    anInt6384 += -2094050269;
	    SparseVarDomain.method3105((byte) 92);
	}
	if (bool_118_) {
	    anInt6381 += -1311077067;
	    Class241_Sub7.method14894(2001174175);
	}
    }
    
    public static int method10860(int i, int i_119_, float f) {
	return CsDelta_Add.method17423(i, i_119_, (int) f, -1069698744);
    }
    
    public static int method10861(int i, int i_120_, float f) {
	return CsDelta_Add.method17423(i, i_120_, (int) f, -951190824);
    }
    
    public static void method10862(boolean bool, boolean bool_121_) {
	if (bool) {
	    anInt6384 += -2094050269;
	    SparseVarDomain.method3105((byte) 103);
	}
	if (bool_121_) {
	    anInt6381 += -1311077067;
	    Class241_Sub7.method14894(1378522314);
	}
    }
    
    public static final int method10863(int i, int i_122_) {
	if (-2 == i)
	    return 12345678;
	if (i == -1) {
	    if (i_122_ < 2)
		i_122_ = 2;
	    else if (i_122_ > 126)
		i_122_ = 126;
	    return i_122_;
	}
	i_122_ = i_122_ * (i & 0x7f) >> 7;
	if (i_122_ < 2)
	    i_122_ = 2;
	else if (i_122_ > 126)
	    i_122_ = 126;
	return (i & 0xff80) + i_122_;
    }
    
    public static final int method10864(int i, int i_123_, int i_124_) {
	if (i_124_ > 243)
	    i_123_ >>= 4;
	else if (i_124_ > 217)
	    i_123_ >>= 3;
	else if (i_124_ > 192)
	    i_123_ >>= 2;
	else if (i_124_ > 179)
	    i_123_ >>= 1;
	return (i_124_ >> 1) + (((i & 0xff) >> 2 << 10) + (i_123_ >> 5 << 7));
    }
    
    public static final int method10865(int i, int i_125_, int i_126_) {
	if (i_126_ > 243)
	    i_125_ >>= 4;
	else if (i_126_ > 217)
	    i_125_ >>= 3;
	else if (i_126_ > 192)
	    i_125_ >>= 2;
	else if (i_126_ > 179)
	    i_125_ >>= 1;
	return (i_126_ >> 1) + (((i & 0xff) >> 2 << 10) + (i_125_ >> 5 << 7));
    }
    
    static final void method10866(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class44.method1107(class58, class35, class454, 84503750);
    }
    
    static final void method10867(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_127_ = (((ClientScriptData) class454).integerStack
		      [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_128_ = (((ClientScriptData) class454).integerStack
		      [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	ParamType class603
	    = Class621.paramTypeList.list(i_128_, 552399698);
	if (class603.method13186(494307399))
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= JS5.itemDefLoader.list
		      (i_127_, (short) -11687)
		      .method13387(i_128_, class603.defaultstr, 8616967);
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= (JS5.itemDefLoader.list
		       (i_127_, (short) 3980).getParam
		   (i_128_, 2015998927 * class603.defaultint, 292992397));
    }
    
    public static int getDisplayMode/*method10868*/(int i) {
		if (Class442.aBool6160 && Class228.aFrame2674 != null)
		    return 3;
		return client.aBool8372 ? 2 : 1;
    }
    
    static final void method10869(int i, int[] is, byte i_129_) {
	if (Class54.method1301(i, is, (byte) -5)) {
	    InterfaceComponent[] class58s
		= Class187.aClass35Array2203[i].components;
	    for (int i_130_ = 0; i_130_ < class58s.length; i_130_++) {
		InterfaceComponent class58 = class58s[i_130_];
		if (class58 != null && class58.aClass409_998 != null)
		    class58.aClass409_998.method7379(487641031);
	    }
	}
    }
    
    static final void method10870(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_131_ = (((ClientScriptData) class454).integerStack
		      [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_132_ = (((ClientScriptData) class454).integerStack
		      [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	if (i_131_ == 0)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	else if (i_132_ == 0)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 2147483647;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= (int) Math.pow((double) i_131_, 1.0 / (double) i_132_);
    }
    
    public static RuntimeException_Sub3 method10871(Throwable throwable,
						    String string) {
	RuntimeException_Sub3 runtimeexception_sub3;
	if (throwable instanceof RuntimeException_Sub3) {
	    runtimeexception_sub3 = (RuntimeException_Sub3) throwable;
	    StringBuilder stringbuilder = new StringBuilder();
	    RuntimeException_Sub3 runtimeexception_sub3_133_
		= runtimeexception_sub3;
	    ((RuntimeException_Sub3) runtimeexception_sub3_133_).aString11296
		= stringbuilder.append
		      (((RuntimeException_Sub3) runtimeexception_sub3_133_)
		       .aString11296)
		      .append
		      (' ').append
		      (string).toString();
	} else
	    runtimeexception_sub3
		= new RuntimeException_Sub3(throwable, string);
	return runtimeexception_sub3;
    }
}
