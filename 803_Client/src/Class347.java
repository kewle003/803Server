/* Class347 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public abstract class Class347
{
    int anInt5352;
    static final int anInt5353 = 4096;
    int anInt5354;
    short[] aShortArray5355;
    short[] aShortArray5356 = new short[512];
    int anInt5357;
    int anInt5358;
    static final int anInt5359 = 4095;
    static final int anInt5360 = 12;
    int anInt5361;
    public static int[] anIntArray5362 = new int[4096];
    
    abstract void method6182();
    
    void method6183(int i, int i_0_, int i_1_) {
	int[] is = new int[i];
	int[] is_2_ = new int[i_0_];
	int[] is_3_ = new int[i_1_];
	for (int i_4_ = 0; i_4_ < i; i_4_++)
	    is[i_4_] = (i_4_ << 12) / i;
	for (int i_5_ = 0; i_5_ < i_0_; i_5_++)
	    is_2_[i_5_] = (i_5_ << 12) / i_0_;
	for (int i_6_ = 0; i_6_ < i_1_; i_6_++)
	    is_3_[i_6_] = (i_6_ << 12) / i_1_;
	method6182();
	for (int i_7_ = 0; i_7_ < i_1_; i_7_++) {
	    for (int i_8_ = 0; i_8_ < i_0_; i_8_++) {
		for (int i_9_ = 0; i_9_ < i; i_9_++) {
		    for (int i_10_ = 0; i_10_ < ((Class347) this).anInt5357;
			 i_10_++) {
			int i_11_
			    = ((Class347) this).aShortArray5355[i_10_] << 12;
			int i_12_ = ((Class347) this).anInt5358 * i_11_ >> 12;
			int i_13_ = ((Class347) this).anInt5352 * i_11_ >> 12;
			int i_14_ = ((Class347) this).anInt5361 * i_11_ >> 12;
			int i_15_ = is[i_9_] * i_11_ >> 12;
			int i_16_ = is_2_[i_8_] * i_11_ >> 12;
			int i_17_ = is_3_[i_7_] * i_11_ >> 12;
			i_15_ *= ((Class347) this).anInt5358;
			i_16_ *= ((Class347) this).anInt5352;
			i_17_ *= ((Class347) this).anInt5361;
			int i_18_ = i_15_ >> 12;
			int i_19_ = i_18_ + 1;
			i_18_ &= 0xff;
			int i_20_ = i_16_ >> 12;
			int i_21_ = i_20_ + 1;
			i_20_ &= 0xff;
			int i_22_ = i_17_ >> 12;
			int i_23_ = i_22_ + 1;
			i_22_ &= 0xff;
			if (i_19_ >= i_12_)
			    i_19_ = 0;
			else
			    i_19_ &= 0xff;
			if (i_21_ >= i_13_)
			    i_21_ = 0;
			else
			    i_21_ &= 0xff;
			if (i_23_ >= i_14_)
			    i_23_ = 0;
			else
			    i_23_ &= 0xff;
			i_15_ &= 0xfff;
			i_16_ &= 0xfff;
			i_17_ &= 0xfff;
			int i_24_ = anIntArray5362[i_15_];
			int i_25_ = anIntArray5362[i_16_];
			int i_26_ = anIntArray5362[i_17_];
			int i_27_ = i_15_ - 4096;
			int i_28_ = i_16_ - 4096;
			int i_29_ = i_17_ - 4096;
			int i_30_ = ((Class347) this).aShortArray5356[i_22_];
			int i_31_ = ((Class347) this).aShortArray5356[i_23_];
			int i_32_
			    = ((Class347) this).aShortArray5356[i_20_ + i_30_];
			int i_33_
			    = ((Class347) this).aShortArray5356[i_21_ + i_30_];
			int i_34_
			    = ((Class347) this).aShortArray5356[i_20_ + i_31_];
			int i_35_
			    = ((Class347) this).aShortArray5356[i_21_ + i_31_];
			int i_36_
			    = method6187((((Class347) this).aShortArray5356
					  [i_18_ + i_32_]),
					 i_15_, i_16_, i_17_);
			int i_37_
			    = method6187((((Class347) this).aShortArray5356
					  [i_19_ + i_32_]),
					 i_27_, i_16_, i_17_);
			int i_38_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
			i_36_ = method6187((((Class347) this).aShortArray5356
					    [i_18_ + i_33_]),
					   i_15_, i_28_, i_17_);
			i_37_ = method6187((((Class347) this).aShortArray5356
					    [i_19_ + i_33_]),
					   i_27_, i_28_, i_17_);
			int i_39_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
			int i_40_ = i_38_ + (i_25_ * (i_39_ - i_38_) >> 12);
			i_36_ = method6187((((Class347) this).aShortArray5356
					    [i_18_ + i_34_]),
					   i_15_, i_16_, i_29_);
			i_37_ = method6187((((Class347) this).aShortArray5356
					    [i_19_ + i_34_]),
					   i_27_, i_16_, i_29_);
			i_38_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
			i_36_ = method6187((((Class347) this).aShortArray5356
					    [i_18_ + i_35_]),
					   i_15_, i_28_, i_29_);
			i_37_ = method6187((((Class347) this).aShortArray5356
					    [i_19_ + i_35_]),
					   i_27_, i_28_, i_29_);
			i_39_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
			int i_41_ = i_38_ + (i_25_ * (i_39_ - i_38_) >> 12);
			method6184(i_10_,
				   i_40_ + (i_26_ * (i_41_ - i_40_) >> 12));
		    }
		    method6185();
		}
	    }
	}
    }
    
    abstract void method6184(int i, int i_42_);
    
    abstract void method6185();
    
    Class347(int i, int i_43_, int i_44_, int i_45_, int i_46_) {
	((Class347) this).anInt5354 = 0;
	((Class347) this).anInt5358 = 4;
	((Class347) this).anInt5352 = 4;
	((Class347) this).anInt5361 = 4;
	((Class347) this).anInt5357 = 4;
	((Class347) this).anInt5354 = i;
	((Class347) this).anInt5358 = i_44_;
	((Class347) this).anInt5352 = i_45_;
	((Class347) this).anInt5361 = i_46_;
	((Class347) this).anInt5357 = i_43_;
	method6203();
	method6188();
    }
    
    void method6186(int i, int i_47_, int i_48_) {
	int[] is = new int[i];
	int[] is_49_ = new int[i_47_];
	int[] is_50_ = new int[i_48_];
	for (int i_51_ = 0; i_51_ < i; i_51_++)
	    is[i_51_] = (i_51_ << 12) / i;
	for (int i_52_ = 0; i_52_ < i_47_; i_52_++)
	    is_49_[i_52_] = (i_52_ << 12) / i_47_;
	for (int i_53_ = 0; i_53_ < i_48_; i_53_++)
	    is_50_[i_53_] = (i_53_ << 12) / i_48_;
	method6182();
	for (int i_54_ = 0; i_54_ < i_48_; i_54_++) {
	    for (int i_55_ = 0; i_55_ < i_47_; i_55_++) {
		for (int i_56_ = 0; i_56_ < i; i_56_++) {
		    for (int i_57_ = 0; i_57_ < ((Class347) this).anInt5357;
			 i_57_++) {
			int i_58_
			    = ((Class347) this).aShortArray5355[i_57_] << 12;
			int i_59_ = ((Class347) this).anInt5358 * i_58_ >> 12;
			int i_60_ = ((Class347) this).anInt5352 * i_58_ >> 12;
			int i_61_ = ((Class347) this).anInt5361 * i_58_ >> 12;
			int i_62_ = is[i_56_] * i_58_ >> 12;
			int i_63_ = is_49_[i_55_] * i_58_ >> 12;
			int i_64_ = is_50_[i_54_] * i_58_ >> 12;
			i_62_ *= ((Class347) this).anInt5358;
			i_63_ *= ((Class347) this).anInt5352;
			i_64_ *= ((Class347) this).anInt5361;
			int i_65_ = i_62_ >> 12;
			int i_66_ = i_65_ + 1;
			i_65_ &= 0xff;
			int i_67_ = i_63_ >> 12;
			int i_68_ = i_67_ + 1;
			i_67_ &= 0xff;
			int i_69_ = i_64_ >> 12;
			int i_70_ = i_69_ + 1;
			i_69_ &= 0xff;
			if (i_66_ >= i_59_)
			    i_66_ = 0;
			else
			    i_66_ &= 0xff;
			if (i_68_ >= i_60_)
			    i_68_ = 0;
			else
			    i_68_ &= 0xff;
			if (i_70_ >= i_61_)
			    i_70_ = 0;
			else
			    i_70_ &= 0xff;
			i_62_ &= 0xfff;
			i_63_ &= 0xfff;
			i_64_ &= 0xfff;
			int i_71_ = anIntArray5362[i_62_];
			int i_72_ = anIntArray5362[i_63_];
			int i_73_ = anIntArray5362[i_64_];
			int i_74_ = i_62_ - 4096;
			int i_75_ = i_63_ - 4096;
			int i_76_ = i_64_ - 4096;
			int i_77_ = ((Class347) this).aShortArray5356[i_69_];
			int i_78_ = ((Class347) this).aShortArray5356[i_70_];
			int i_79_
			    = ((Class347) this).aShortArray5356[i_67_ + i_77_];
			int i_80_
			    = ((Class347) this).aShortArray5356[i_68_ + i_77_];
			int i_81_
			    = ((Class347) this).aShortArray5356[i_67_ + i_78_];
			int i_82_
			    = ((Class347) this).aShortArray5356[i_68_ + i_78_];
			int i_83_
			    = method6187((((Class347) this).aShortArray5356
					  [i_65_ + i_79_]),
					 i_62_, i_63_, i_64_);
			int i_84_
			    = method6187((((Class347) this).aShortArray5356
					  [i_66_ + i_79_]),
					 i_74_, i_63_, i_64_);
			int i_85_ = i_83_ + (i_71_ * (i_84_ - i_83_) >> 12);
			i_83_ = method6187((((Class347) this).aShortArray5356
					    [i_65_ + i_80_]),
					   i_62_, i_75_, i_64_);
			i_84_ = method6187((((Class347) this).aShortArray5356
					    [i_66_ + i_80_]),
					   i_74_, i_75_, i_64_);
			int i_86_ = i_83_ + (i_71_ * (i_84_ - i_83_) >> 12);
			int i_87_ = i_85_ + (i_72_ * (i_86_ - i_85_) >> 12);
			i_83_ = method6187((((Class347) this).aShortArray5356
					    [i_65_ + i_81_]),
					   i_62_, i_63_, i_76_);
			i_84_ = method6187((((Class347) this).aShortArray5356
					    [i_66_ + i_81_]),
					   i_74_, i_63_, i_76_);
			i_85_ = i_83_ + (i_71_ * (i_84_ - i_83_) >> 12);
			i_83_ = method6187((((Class347) this).aShortArray5356
					    [i_65_ + i_82_]),
					   i_62_, i_75_, i_76_);
			i_84_ = method6187((((Class347) this).aShortArray5356
					    [i_66_ + i_82_]),
					   i_74_, i_75_, i_76_);
			i_86_ = i_83_ + (i_71_ * (i_84_ - i_83_) >> 12);
			int i_88_ = i_85_ + (i_72_ * (i_86_ - i_85_) >> 12);
			method6184(i_57_,
				   i_87_ + (i_73_ * (i_88_ - i_87_) >> 12));
		    }
		    method6185();
		}
	    }
	}
    }
    
    static int method6187(int i, int i_89_, int i_90_, int i_91_) {
	int i_92_ = i & 0xf;
	int i_93_ = i_92_ < 8 ? i_89_ : i_90_;
	int i_94_
	    = i_92_ < 4 ? i_90_ : i_92_ == 12 || i_92_ == 14 ? i_89_ : i_91_;
	return (((i_92_ & 0x1) == 0 ? i_93_ : -i_93_)
		+ ((i_92_ & 0x2) == 0 ? i_94_ : -i_94_));
    }
    
    void method6188() {
	Random random = new Random((long) ((Class347) this).anInt5354);
	for (int i = 0; i < 255; i++)
	    ((Class347) this).aShortArray5356[i] = (short) i;
	for (int i = 0; i < 255; i++) {
	    int i_95_ = 255 - i;
	    int i_96_ = Class194.method3997(random, i_95_, (byte) -105);
	    short i_97_ = ((Class347) this).aShortArray5356[i_96_];
	    ((Class347) this).aShortArray5356[i_96_]
		= ((Class347) this).aShortArray5356[i_95_];
	    ((Class347) this).aShortArray5356[i_95_]
		= ((Class347) this).aShortArray5356[i_95_ + 256] = i_97_;
	}
    }
    
    static final int method6189(int i) {
	int i_98_ = i * (i * i >> 12) >> 12;
	int i_99_ = i * 6 - 61440;
	int i_100_ = 40960 + (i_99_ * i >> 12);
	return i_100_ * i_98_ >> 12;
    }
    
    void method6190() {
	Random random = new Random((long) ((Class347) this).anInt5354);
	for (int i = 0; i < 255; i++)
	    ((Class347) this).aShortArray5356[i] = (short) i;
	for (int i = 0; i < 255; i++) {
	    int i_101_ = 255 - i;
	    int i_102_ = Class194.method3997(random, i_101_, (byte) -112);
	    short i_103_ = ((Class347) this).aShortArray5356[i_102_];
	    ((Class347) this).aShortArray5356[i_102_]
		= ((Class347) this).aShortArray5356[i_101_];
	    ((Class347) this).aShortArray5356[i_101_]
		= ((Class347) this).aShortArray5356[i_101_ + 256] = i_103_;
	}
    }
    
    void method6191(int i, int i_104_, int i_105_) {
	int[] is = new int[i];
	int[] is_106_ = new int[i_104_];
	int[] is_107_ = new int[i_105_];
	for (int i_108_ = 0; i_108_ < i; i_108_++)
	    is[i_108_] = (i_108_ << 12) / i;
	for (int i_109_ = 0; i_109_ < i_104_; i_109_++)
	    is_106_[i_109_] = (i_109_ << 12) / i_104_;
	for (int i_110_ = 0; i_110_ < i_105_; i_110_++)
	    is_107_[i_110_] = (i_110_ << 12) / i_105_;
	method6182();
	for (int i_111_ = 0; i_111_ < i_105_; i_111_++) {
	    for (int i_112_ = 0; i_112_ < i_104_; i_112_++) {
		for (int i_113_ = 0; i_113_ < i; i_113_++) {
		    for (int i_114_ = 0; i_114_ < ((Class347) this).anInt5357;
			 i_114_++) {
			int i_115_
			    = ((Class347) this).aShortArray5355[i_114_] << 12;
			int i_116_
			    = ((Class347) this).anInt5358 * i_115_ >> 12;
			int i_117_
			    = ((Class347) this).anInt5352 * i_115_ >> 12;
			int i_118_
			    = ((Class347) this).anInt5361 * i_115_ >> 12;
			int i_119_ = is[i_113_] * i_115_ >> 12;
			int i_120_ = is_106_[i_112_] * i_115_ >> 12;
			int i_121_ = is_107_[i_111_] * i_115_ >> 12;
			i_119_ *= ((Class347) this).anInt5358;
			i_120_ *= ((Class347) this).anInt5352;
			i_121_ *= ((Class347) this).anInt5361;
			int i_122_ = i_119_ >> 12;
			int i_123_ = i_122_ + 1;
			i_122_ &= 0xff;
			int i_124_ = i_120_ >> 12;
			int i_125_ = i_124_ + 1;
			i_124_ &= 0xff;
			int i_126_ = i_121_ >> 12;
			int i_127_ = i_126_ + 1;
			i_126_ &= 0xff;
			if (i_123_ >= i_116_)
			    i_123_ = 0;
			else
			    i_123_ &= 0xff;
			if (i_125_ >= i_117_)
			    i_125_ = 0;
			else
			    i_125_ &= 0xff;
			if (i_127_ >= i_118_)
			    i_127_ = 0;
			else
			    i_127_ &= 0xff;
			i_119_ &= 0xfff;
			i_120_ &= 0xfff;
			i_121_ &= 0xfff;
			int i_128_ = anIntArray5362[i_119_];
			int i_129_ = anIntArray5362[i_120_];
			int i_130_ = anIntArray5362[i_121_];
			int i_131_ = i_119_ - 4096;
			int i_132_ = i_120_ - 4096;
			int i_133_ = i_121_ - 4096;
			int i_134_ = ((Class347) this).aShortArray5356[i_126_];
			int i_135_ = ((Class347) this).aShortArray5356[i_127_];
			int i_136_ = (((Class347) this).aShortArray5356
				      [i_124_ + i_134_]);
			int i_137_ = (((Class347) this).aShortArray5356
				      [i_125_ + i_134_]);
			int i_138_ = (((Class347) this).aShortArray5356
				      [i_124_ + i_135_]);
			int i_139_ = (((Class347) this).aShortArray5356
				      [i_125_ + i_135_]);
			int i_140_
			    = method6187((((Class347) this).aShortArray5356
					  [i_122_ + i_136_]),
					 i_119_, i_120_, i_121_);
			int i_141_
			    = method6187((((Class347) this).aShortArray5356
					  [i_123_ + i_136_]),
					 i_131_, i_120_, i_121_);
			int i_142_
			    = i_140_ + (i_128_ * (i_141_ - i_140_) >> 12);
			i_140_ = method6187((((Class347) this).aShortArray5356
					     [i_122_ + i_137_]),
					    i_119_, i_132_, i_121_);
			i_141_ = method6187((((Class347) this).aShortArray5356
					     [i_123_ + i_137_]),
					    i_131_, i_132_, i_121_);
			int i_143_
			    = i_140_ + (i_128_ * (i_141_ - i_140_) >> 12);
			int i_144_
			    = i_142_ + (i_129_ * (i_143_ - i_142_) >> 12);
			i_140_ = method6187((((Class347) this).aShortArray5356
					     [i_122_ + i_138_]),
					    i_119_, i_120_, i_133_);
			i_141_ = method6187((((Class347) this).aShortArray5356
					     [i_123_ + i_138_]),
					    i_131_, i_120_, i_133_);
			i_142_ = i_140_ + (i_128_ * (i_141_ - i_140_) >> 12);
			i_140_ = method6187((((Class347) this).aShortArray5356
					     [i_122_ + i_139_]),
					    i_119_, i_132_, i_133_);
			i_141_ = method6187((((Class347) this).aShortArray5356
					     [i_123_ + i_139_]),
					    i_131_, i_132_, i_133_);
			i_143_ = i_140_ + (i_128_ * (i_141_ - i_140_) >> 12);
			int i_145_
			    = i_142_ + (i_129_ * (i_143_ - i_142_) >> 12);
			method6184(i_114_, i_144_ + (i_130_ * (i_145_ - i_144_)
						     >> 12));
		    }
		    method6185();
		}
	    }
	}
    }
    
    void method6192(int i, int i_146_, int i_147_) {
	int[] is = new int[i];
	int[] is_148_ = new int[i_146_];
	int[] is_149_ = new int[i_147_];
	for (int i_150_ = 0; i_150_ < i; i_150_++)
	    is[i_150_] = (i_150_ << 12) / i;
	for (int i_151_ = 0; i_151_ < i_146_; i_151_++)
	    is_148_[i_151_] = (i_151_ << 12) / i_146_;
	for (int i_152_ = 0; i_152_ < i_147_; i_152_++)
	    is_149_[i_152_] = (i_152_ << 12) / i_147_;
	method6182();
	for (int i_153_ = 0; i_153_ < i_147_; i_153_++) {
	    for (int i_154_ = 0; i_154_ < i_146_; i_154_++) {
		for (int i_155_ = 0; i_155_ < i; i_155_++) {
		    for (int i_156_ = 0; i_156_ < ((Class347) this).anInt5357;
			 i_156_++) {
			int i_157_
			    = ((Class347) this).aShortArray5355[i_156_] << 12;
			int i_158_
			    = ((Class347) this).anInt5358 * i_157_ >> 12;
			int i_159_
			    = ((Class347) this).anInt5352 * i_157_ >> 12;
			int i_160_
			    = ((Class347) this).anInt5361 * i_157_ >> 12;
			int i_161_ = is[i_155_] * i_157_ >> 12;
			int i_162_ = is_148_[i_154_] * i_157_ >> 12;
			int i_163_ = is_149_[i_153_] * i_157_ >> 12;
			i_161_ *= ((Class347) this).anInt5358;
			i_162_ *= ((Class347) this).anInt5352;
			i_163_ *= ((Class347) this).anInt5361;
			int i_164_ = i_161_ >> 12;
			int i_165_ = i_164_ + 1;
			i_164_ &= 0xff;
			int i_166_ = i_162_ >> 12;
			int i_167_ = i_166_ + 1;
			i_166_ &= 0xff;
			int i_168_ = i_163_ >> 12;
			int i_169_ = i_168_ + 1;
			i_168_ &= 0xff;
			if (i_165_ >= i_158_)
			    i_165_ = 0;
			else
			    i_165_ &= 0xff;
			if (i_167_ >= i_159_)
			    i_167_ = 0;
			else
			    i_167_ &= 0xff;
			if (i_169_ >= i_160_)
			    i_169_ = 0;
			else
			    i_169_ &= 0xff;
			i_161_ &= 0xfff;
			i_162_ &= 0xfff;
			i_163_ &= 0xfff;
			int i_170_ = anIntArray5362[i_161_];
			int i_171_ = anIntArray5362[i_162_];
			int i_172_ = anIntArray5362[i_163_];
			int i_173_ = i_161_ - 4096;
			int i_174_ = i_162_ - 4096;
			int i_175_ = i_163_ - 4096;
			int i_176_ = ((Class347) this).aShortArray5356[i_168_];
			int i_177_ = ((Class347) this).aShortArray5356[i_169_];
			int i_178_ = (((Class347) this).aShortArray5356
				      [i_166_ + i_176_]);
			int i_179_ = (((Class347) this).aShortArray5356
				      [i_167_ + i_176_]);
			int i_180_ = (((Class347) this).aShortArray5356
				      [i_166_ + i_177_]);
			int i_181_ = (((Class347) this).aShortArray5356
				      [i_167_ + i_177_]);
			int i_182_
			    = method6187((((Class347) this).aShortArray5356
					  [i_164_ + i_178_]),
					 i_161_, i_162_, i_163_);
			int i_183_
			    = method6187((((Class347) this).aShortArray5356
					  [i_165_ + i_178_]),
					 i_173_, i_162_, i_163_);
			int i_184_
			    = i_182_ + (i_170_ * (i_183_ - i_182_) >> 12);
			i_182_ = method6187((((Class347) this).aShortArray5356
					     [i_164_ + i_179_]),
					    i_161_, i_174_, i_163_);
			i_183_ = method6187((((Class347) this).aShortArray5356
					     [i_165_ + i_179_]),
					    i_173_, i_174_, i_163_);
			int i_185_
			    = i_182_ + (i_170_ * (i_183_ - i_182_) >> 12);
			int i_186_
			    = i_184_ + (i_171_ * (i_185_ - i_184_) >> 12);
			i_182_ = method6187((((Class347) this).aShortArray5356
					     [i_164_ + i_180_]),
					    i_161_, i_162_, i_175_);
			i_183_ = method6187((((Class347) this).aShortArray5356
					     [i_165_ + i_180_]),
					    i_173_, i_162_, i_175_);
			i_184_ = i_182_ + (i_170_ * (i_183_ - i_182_) >> 12);
			i_182_ = method6187((((Class347) this).aShortArray5356
					     [i_164_ + i_181_]),
					    i_161_, i_174_, i_175_);
			i_183_ = method6187((((Class347) this).aShortArray5356
					     [i_165_ + i_181_]),
					    i_173_, i_174_, i_175_);
			i_185_ = i_182_ + (i_170_ * (i_183_ - i_182_) >> 12);
			int i_187_
			    = i_184_ + (i_171_ * (i_185_ - i_184_) >> 12);
			method6184(i_156_, i_186_ + (i_172_ * (i_187_ - i_186_)
						     >> 12));
		    }
		    method6185();
		}
	    }
	}
    }
    
    abstract void method6193();
    
    void method6194() {
	Random random = new Random((long) ((Class347) this).anInt5354);
	for (int i = 0; i < 255; i++)
	    ((Class347) this).aShortArray5356[i] = (short) i;
	for (int i = 0; i < 255; i++) {
	    int i_188_ = 255 - i;
	    int i_189_ = Class194.method3997(random, i_188_, (byte) -97);
	    short i_190_ = ((Class347) this).aShortArray5356[i_189_];
	    ((Class347) this).aShortArray5356[i_189_]
		= ((Class347) this).aShortArray5356[i_188_];
	    ((Class347) this).aShortArray5356[i_188_]
		= ((Class347) this).aShortArray5356[i_188_ + 256] = i_190_;
	}
    }
    
    abstract void method6195();
    
    abstract void method6196();
    
    abstract void method6197();
    
    abstract void method6198();
    
    void method6199() {
	((Class347) this).aShortArray5355
	    = new short[((Class347) this).anInt5357];
	for (int i = 0; i < ((Class347) this).anInt5357; i++)
	    ((Class347) this).aShortArray5355[i]
		= (short) (int) Math.pow(2.0, (double) i);
    }
    
    abstract void method6200(int i, int i_191_);
    
    static {
	for (int i = 0; i < 4096; i++)
	    anIntArray5362[i] = method6189(i);
    }
    
    static final int method6201(int i) {
	int i_192_ = i * (i * i >> 12) >> 12;
	int i_193_ = i * 6 - 61440;
	int i_194_ = 40960 + (i_193_ * i >> 12);
	return i_194_ * i_192_ >> 12;
    }
    
    static final int method6202(int i) {
	int i_195_ = i * (i * i >> 12) >> 12;
	int i_196_ = i * 6 - 61440;
	int i_197_ = 40960 + (i_196_ * i >> 12);
	return i_197_ * i_195_ >> 12;
    }
    
    void method6203() {
	((Class347) this).aShortArray5355
	    = new short[((Class347) this).anInt5357];
	for (int i = 0; i < ((Class347) this).anInt5357; i++)
	    ((Class347) this).aShortArray5355[i]
		= (short) (int) Math.pow(2.0, (double) i);
    }
    
    abstract void method6204(int i, int i_198_);
    
    abstract void method6205(int i, int i_199_);
    
    abstract void method6206(int i, int i_200_);
}
