/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class89
{
    static final float aFloat1297 = 3.1415927F;
    protected boolean aBool1298 = false;
    
    public abstract void method1857(Class266 class266, int i, boolean bool);
    
    void method1858(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_,
		    float[] fs, int i_5_, float f, float[] fs_6_) {
	i -= i_2_;
	i_0_ -= i_3_;
	i_1_ -= i_4_;
	float f_7_
	    = (float) i * fs[0] + (float) i_0_ * fs[1] + (float) i_1_ * fs[2];
	float f_8_
	    = (float) i * fs[3] + (float) i_0_ * fs[4] + (float) i_1_ * fs[5];
	float f_9_
	    = (float) i * fs[6] + (float) i_0_ * fs[7] + (float) i_1_ * fs[8];
	float f_10_ = (float) Math.sqrt((double) (f_7_ * f_7_ + f_8_ * f_8_
						  + f_9_ * f_9_));
	float f_11_
	    = ((float) Math.atan2((double) f_7_, (double) f_9_) / 6.2831855F
	       + 0.5F);
	float f_12_ = ((float) Math.asin((double) (f_8_ / f_10_)) / 3.1415927F
		       + 0.5F + f);
	if (i_5_ == 1) {
	    float f_13_ = f_11_;
	    f_11_ = -f_12_;
	    f_12_ = f_13_;
	} else if (i_5_ == 2) {
	    f_11_ = -f_11_;
	    f_12_ = -f_12_;
	} else if (i_5_ == 3) {
	    float f_14_ = f_11_;
	    f_11_ = f_12_;
	    f_12_ = -f_14_;
	}
	fs_6_[0] = f_11_;
	fs_6_[1] = f_12_;
    }
    
    void method1859(int i, int i_15_, int i_16_, int i_17_, int i_18_,
		    int i_19_, float[] fs, float f, int i_20_, float f_21_,
		    float[] fs_22_) {
	i -= i_17_;
	i_15_ -= i_18_;
	i_16_ -= i_19_;
	float f_23_ = ((float) i * fs[0] + (float) i_15_ * fs[1]
		       + (float) i_16_ * fs[2]);
	float f_24_ = ((float) i * fs[3] + (float) i_15_ * fs[4]
		       + (float) i_16_ * fs[5]);
	float f_25_ = ((float) i * fs[6] + (float) i_15_ * fs[7]
		       + (float) i_16_ * fs[8]);
	float f_26_
	    = ((float) Math.atan2((double) f_23_, (double) f_25_) / 6.2831855F
	       + 0.5F);
	if (f != 1.0F)
	    f_26_ *= f;
	float f_27_ = f_24_ + 0.5F + f_21_;
	if (i_20_ == 1) {
	    float f_28_ = f_26_;
	    f_26_ = -f_27_;
	    f_27_ = f_28_;
	} else if (i_20_ == 2) {
	    f_26_ = -f_26_;
	    f_27_ = -f_27_;
	} else if (i_20_ == 3) {
	    float f_29_ = f_26_;
	    f_26_ = f_27_;
	    f_27_ = -f_29_;
	}
	fs_22_[0] = f_26_;
	fs_22_[1] = f_27_;
    }
    
    int method1860(float f, float f_30_, float f_31_) {
	float f_32_ = f < 0.0F ? -f : f;
	float f_33_ = f_30_ < 0.0F ? -f_30_ : f_30_;
	float f_34_ = f_31_ < 0.0F ? -f_31_ : f_31_;
	if (f_33_ > f_32_ && f_33_ > f_34_) {
	    if (f_30_ > 0.0F)
		return 0;
	    return 1;
	}
	if (f_34_ > f_32_ && f_34_ > f_33_) {
	    if (f_31_ > 0.0F)
		return 2;
	    return 3;
	}
	if (f > 0.0F)
	    return 4;
	return 5;
    }
    
    void method1861(int i, int i_35_, int i_36_, int i_37_, int i_38_,
		    int i_39_, int i_40_, float[] fs, int i_41_, float f,
		    float f_42_, float f_43_, float[] fs_44_) {
	i -= i_37_;
	i_35_ -= i_38_;
	i_36_ -= i_39_;
	float f_45_ = ((float) i * fs[0] + (float) i_35_ * fs[1]
		       + (float) i_36_ * fs[2]);
	float f_46_ = ((float) i * fs[3] + (float) i_35_ * fs[4]
		       + (float) i_36_ * fs[5]);
	float f_47_ = ((float) i * fs[6] + (float) i_35_ * fs[7]
		       + (float) i_36_ * fs[8]);
	float f_48_;
	float f_49_;
	if (i_40_ == 0) {
	    f_48_ = f_45_ + f + 0.5F;
	    f_49_ = -f_47_ + f_43_ + 0.5F;
	} else if (i_40_ == 1) {
	    f_48_ = f_45_ + f + 0.5F;
	    f_49_ = f_47_ + f_43_ + 0.5F;
	} else if (i_40_ == 2) {
	    f_48_ = -f_45_ + f + 0.5F;
	    f_49_ = -f_46_ + f_42_ + 0.5F;
	} else if (i_40_ == 3) {
	    f_48_ = f_45_ + f + 0.5F;
	    f_49_ = -f_46_ + f_42_ + 0.5F;
	} else if (i_40_ == 4) {
	    f_48_ = f_47_ + f_43_ + 0.5F;
	    f_49_ = -f_46_ + f_42_ + 0.5F;
	} else {
	    f_48_ = -f_47_ + f_43_ + 0.5F;
	    f_49_ = -f_46_ + f_42_ + 0.5F;
	}
	if (i_41_ == 1) {
	    float f_50_ = f_48_;
	    f_48_ = -f_49_;
	    f_49_ = f_50_;
	} else if (i_41_ == 2) {
	    f_48_ = -f_48_;
	    f_49_ = -f_49_;
	} else if (i_41_ == 3) {
	    float f_51_ = f_48_;
	    f_48_ = f_49_;
	    f_49_ = -f_51_;
	}
	fs_44_[0] = f_48_;
	fs_44_[1] = f_49_;
    }
    
    public abstract int method1862();
    
    public abstract void method1863(int i, int i_52_, int i_53_);
    
    public final void method1864(Class241_Sub39_Sub2 class241_sub39_sub2,
				 int i) {
	if (i != -1) {
	    method1877();
	    if (!method1884())
		method1878();
	    else {
		Class87 class87 = (((Class241_Sub39_Sub2) class241_sub39_sub2)
				   .aClass87Array10825[i]);
		Class241_Sub42 class241_sub42
		    = ((Class87) class87).aClass241_Sub42_1273;
		for (int i_54_ = 0; i_54_ < ((Class87) class87).anInt1259;
		     i_54_++) {
		    short i_55_ = ((Class87) class87).aShortArray1266[i_54_];
		    if (((Class241_Sub42) class241_sub42).aBoolArray10173
			[i_55_]) {
			if (((Class87) class87).aShortArray1265[i_54_] != -1)
			    method1887(0, 0, 0, 0);
			method1887((((Class241_Sub42) class241_sub42)
				    .anIntArray10171[i_55_]),
				   ((Class87) class87).aShortArray1268[i_54_],
				   ((Class87) class87).aShortArray1267[i_54_],
				   ((Class87) class87).aShortArray1269[i_54_]);
		    }
		}
		method1888();
		method1878();
	    }
	}
    }
    
    public abstract int method1865();
    
    public abstract int method1866();
    
    public abstract void method1867();
    
    public abstract void method1868(int i);
    
    public abstract void method1869(int i);
    
    public abstract void method1870(int i);
    
    void method1871(int i, int[] is, int i_56_, int i_57_, int i_58_,
		    int i_59_, boolean bool, int i_60_, int[] is_61_) {
	if (i_59_ == 1) {
	    if (i == 0 || i == 1) {
		int i_62_ = -i_56_;
		i_56_ = i_58_;
		i_58_ = i_62_;
	    } else if (i == 3) {
		int i_63_ = i_56_;
		i_56_ = i_58_;
		i_58_ = i_63_;
	    } else if (i == 2) {
		int i_64_ = i_56_;
		i_56_ = -i_58_ & 0x3fff;
		i_58_ = i_64_ & 0x3fff;
	    }
	} else if (i_59_ == 2) {
	    if (i == 0 || i == 1) {
		i_56_ = -i_56_;
		i_58_ = -i_58_;
	    } else if (i == 2) {
		i_56_ = -i_56_ & 0x3fff;
		i_58_ = -i_58_ & 0x3fff;
	    }
	} else if (i_59_ == 3) {
	    if (i == 0 || i == 1) {
		int i_65_ = i_56_;
		i_56_ = -i_58_;
		i_58_ = i_65_;
	    } else if (i == 3) {
		int i_66_ = i_56_;
		i_56_ = i_58_;
		i_58_ = i_66_;
	    } else if (i == 2) {
		int i_67_ = i_56_;
		i_56_ = i_58_ & 0x3fff;
		i_58_ = -i_67_ & 0x3fff;
	    }
	}
	if (i_60_ != 65535)
	    method1872(i, is, i_56_, i_57_, i_58_, bool, i_60_, is_61_);
	else
	    method2002(i, is, i_56_, i_57_, i_58_, i_59_, bool);
    }
    
    abstract void method1872(int i, int[] is, int i_68_, int i_69_, int i_70_,
			     boolean bool, int i_71_, int[] is_72_);
    
    public abstract void method1873();
    
    public abstract void method1874(Class266 class266);
    
    public abstract void method1875(int i, int i_73_, Class166 class166,
				    Class166 class166_74_, int i_75_,
				    int i_76_, int i_77_);
    
    abstract void method1876(int i, int i_78_, int i_79_, int i_80_);
    
    abstract void method1877();
    
    abstract void method1878();
    
    public final void method1879
	(Class241_Sub39_Sub2 class241_sub39_sub2, int i,
	 Class241_Sub39_Sub2 class241_sub39_sub2_81_, int i_82_, int i_83_,
	 int i_84_, int i_85_, boolean bool) {
	if (i != -1) {
	    method1877();
	    if (!method1884())
		method1878();
	    else {
		Class87 class87 = (((Class241_Sub39_Sub2) class241_sub39_sub2)
				   .aClass87Array10825[i]);
		Class241_Sub42 class241_sub42
		    = ((Class87) class87).aClass241_Sub42_1273;
		Class87 class87_86_ = null;
		if (class241_sub39_sub2_81_ != null) {
		    class87_86_
			= (((Class241_Sub39_Sub2) class241_sub39_sub2_81_)
			   .aClass87Array10825[i_82_]);
		    if (((Class87) class87_86_).aClass241_Sub42_1273
			!= class241_sub42)
			class87_86_ = null;
		}
		method1882(class241_sub42, class87, class87_86_, i_83_, i_84_,
			   i_85_, null, false, bool, 65535, null);
		method1888();
		method1878();
	    }
	}
    }
    
    public abstract int method1880();
    
    public final void method1881
	(Class241_Sub39_Sub2 class241_sub39_sub2, int i,
	 Class241_Sub39_Sub2 class241_sub39_sub2_87_, int i_88_, int i_89_,
	 int i_90_, Class241_Sub39_Sub2 class241_sub39_sub2_91_, int i_92_,
	 Class241_Sub39_Sub2 class241_sub39_sub2_93_, int i_94_, int i_95_,
	 int i_96_, boolean[] bools, boolean bool) {
	if (i != -1) {
	    if (bools == null || i_92_ == -1)
		method1879(class241_sub39_sub2, i, class241_sub39_sub2_87_,
			   i_88_, i_89_, i_90_, 0, bool);
	    else {
		method1877();
		if (!method1884())
		    method1878();
		else {
		    Class87 class87
			= (((Class241_Sub39_Sub2) class241_sub39_sub2)
			   .aClass87Array10825[i]);
		    Class241_Sub42 class241_sub42
			= ((Class87) class87).aClass241_Sub42_1273;
		    Class87 class87_97_ = null;
		    if (class241_sub39_sub2_87_ != null) {
			class87_97_
			    = (((Class241_Sub39_Sub2) class241_sub39_sub2_87_)
			       .aClass87Array10825[i_88_]);
			if (((Class87) class87_97_).aClass241_Sub42_1273
			    != class241_sub42)
			    class87_97_ = null;
		    }
		    method1882(class241_sub42, class87, class87_97_, i_89_,
			       i_90_, 0, bools, false, bool, 65535, null);
		    Class87 class87_98_
			= (((Class241_Sub39_Sub2) class241_sub39_sub2_91_)
			   .aClass87Array10825[i_92_]);
		    Class87 class87_99_ = null;
		    if (class241_sub39_sub2_93_ != null) {
			class87_99_
			    = (((Class241_Sub39_Sub2) class241_sub39_sub2_93_)
			       .aClass87Array10825[i_94_]);
			if (((Class87) class87_99_).aClass241_Sub42_1273
			    != class241_sub42)
			    class87_99_ = null;
		    }
		    method2002(0, new int[0], 0, 0, 0, 0, bool);
		    method1882(((Class87) class87_98_).aClass241_Sub42_1273,
			       class87_98_, class87_99_, i_95_, i_96_, 0,
			       bools, true, bool, 65535, null);
		    method1888();
		    method1878();
		}
	    }
	}
    }
    
    Class89() {
	/* empty */
    }
    
    void method1882(Class241_Sub42 class241_sub42, Class87 class87,
		    Class87 class87_100_, int i, int i_101_, int i_102_,
		    boolean[] bools, boolean bool, boolean bool_103_,
		    int i_104_, int[] is) {
	if (class87_100_ == null || i == 0) {
	    for (int i_105_ = 0; i_105_ < ((Class87) class87).anInt1259;
		 i_105_++) {
		short i_106_ = ((Class87) class87).aShortArray1266[i_105_];
		if (bools == null || bools[i_106_] == bool
		    || (((Class241_Sub42) class241_sub42).anIntArray10171
			[i_106_]) == 0) {
		    short i_107_ = ((Class87) class87).aShortArray1265[i_105_];
		    if (i_107_ != -1)
			method1883(0,
				   (((Class241_Sub42) class241_sub42)
				    .anIntArrayArray10172[i_107_]),
				   0, 0, 0, i_102_, bool_103_,
				   i_104_ & (((Class241_Sub42) class241_sub42)
					     .anIntArray10174[i_107_]),
				   is);
		    method1883((((Class241_Sub42) class241_sub42)
				.anIntArray10171[i_106_]),
			       (((Class241_Sub42) class241_sub42)
				.anIntArrayArray10172[i_106_]),
			       ((Class87) class87).aShortArray1268[i_105_],
			       ((Class87) class87).aShortArray1267[i_105_],
			       ((Class87) class87).aShortArray1269[i_105_],
			       i_102_, bool_103_,
			       i_104_ & (((Class241_Sub42) class241_sub42)
					 .anIntArray10174[i_106_]),
			       is);
		}
	    }
	} else {
	    int i_108_ = 0;
	    int i_109_ = 0;
	    for (int i_110_ = 0;
		 (i_110_
		  < ((Class241_Sub42) class241_sub42).anInt10162 * 1333411391);
		 i_110_++) {
		boolean bool_111_ = false;
		if (i_108_ < ((Class87) class87).anInt1259
		    && ((Class87) class87).aShortArray1266[i_108_] == i_110_)
		    bool_111_ = true;
		boolean bool_112_ = false;
		if (i_109_ < ((Class87) class87_100_).anInt1259
		    && (((Class87) class87_100_).aShortArray1266[i_109_]
			== i_110_))
		    bool_112_ = true;
		if (bool_111_ || bool_112_) {
		    if (bools != null && bools[i_110_] != bool
			&& (((Class241_Sub42) class241_sub42).anIntArray10171
			    [i_110_]) != 0) {
			if (bool_111_)
			    i_108_++;
			if (bool_112_)
			    i_109_++;
		    } else {
			int i_113_ = 0;
			int i_114_ = (((Class241_Sub42) class241_sub42)
				      .anIntArray10171[i_110_]);
			if (i_114_ == 3 || i_114_ == 10)
			    i_113_ = 128;
			int i_115_;
			int i_116_;
			int i_117_;
			short i_118_;
			byte i_119_;
			if (bool_111_) {
			    i_115_
				= ((Class87) class87).aShortArray1268[i_108_];
			    i_116_
				= ((Class87) class87).aShortArray1267[i_108_];
			    i_117_
				= ((Class87) class87).aShortArray1269[i_108_];
			    i_118_
				= ((Class87) class87).aShortArray1265[i_108_];
			    i_119_
				= ((Class87) class87).aByteArray1272[i_108_];
			    i_108_++;
			} else {
			    i_115_ = i_113_;
			    i_116_ = i_113_;
			    i_117_ = i_113_;
			    i_118_ = (short) -1;
			    i_119_ = (byte) 0;
			}
			int i_120_;
			int i_121_;
			int i_122_;
			short i_123_;
			byte i_124_;
			if (bool_112_) {
			    i_120_ = (((Class87) class87_100_).aShortArray1268
				      [i_109_]);
			    i_121_ = (((Class87) class87_100_).aShortArray1267
				      [i_109_]);
			    i_122_ = (((Class87) class87_100_).aShortArray1269
				      [i_109_]);
			    i_123_ = (((Class87) class87_100_).aShortArray1265
				      [i_109_]);
			    i_124_ = (((Class87) class87_100_).aByteArray1272
				      [i_109_]);
			    i_109_++;
			} else {
			    i_120_ = i_113_;
			    i_121_ = i_113_;
			    i_122_ = i_113_;
			    i_123_ = (short) -1;
			    i_124_ = (byte) 0;
			}
			int i_125_;
			int i_126_;
			int i_127_;
			if ((i_119_ & 0x2) != 0 || (i_124_ & 0x1) != 0) {
			    i_125_ = i_115_;
			    i_126_ = i_116_;
			    i_127_ = i_117_;
			} else if (i_114_ == 2) {
			    int i_128_ = i_120_ - i_115_ & 0x3fff;
			    int i_129_ = i_121_ - i_116_ & 0x3fff;
			    int i_130_ = i_122_ - i_117_ & 0x3fff;
			    if (i_128_ >= 8192)
				i_128_ -= 16384;
			    if (i_129_ >= 8192)
				i_129_ -= 16384;
			    if (i_130_ >= 8192)
				i_130_ -= 16384;
			    i_125_ = i_115_ + i_128_ * i / i_101_ & 0x3fff;
			    i_126_ = i_116_ + i_129_ * i / i_101_ & 0x3fff;
			    i_127_ = i_117_ + i_130_ * i / i_101_ & 0x3fff;
			} else if (i_114_ == 9) {
			    int i_131_ = i_120_ - i_115_ & 0x3fff;
			    if (i_131_ >= 8192)
				i_131_ -= 16384;
			    i_125_ = i_115_ + i_131_ * i / i_101_ & 0x3fff;
			    i_127_ = 0;
			    i_126_ = 0;
			} else if (i_114_ == 7) {
			    int i_132_ = i_120_ - i_115_ & 0x3f;
			    if (i_132_ >= 32)
				i_132_ -= 64;
			    i_125_ = i_115_ + i_132_ * i / i_101_ & 0x3f;
			    i_126_ = i_116_ + (i_121_ - i_116_) * i / i_101_;
			    i_127_ = i_117_ + (i_122_ - i_117_) * i / i_101_;
			} else {
			    i_125_ = i_115_ + (i_120_ - i_115_) * i / i_101_;
			    i_126_ = i_116_ + (i_121_ - i_116_) * i / i_101_;
			    i_127_ = i_117_ + (i_122_ - i_117_) * i / i_101_;
			}
			if (i_118_ != -1)
			    method1883(0,
				       (((Class241_Sub42) class241_sub42)
					.anIntArrayArray10172[i_118_]),
				       0, 0, 0, i_102_, bool_103_,
				       (i_104_
					& (((Class241_Sub42) class241_sub42)
					   .anIntArray10174[i_118_])),
				       is);
			else if (i_123_ != -1)
			    method1883(0,
				       (((Class241_Sub42) class241_sub42)
					.anIntArrayArray10172[i_123_]),
				       0, 0, 0, i_102_, bool_103_,
				       (i_104_
					& (((Class241_Sub42) class241_sub42)
					   .anIntArray10174[i_123_])),
				       is);
			method1883(i_114_,
				   (((Class241_Sub42) class241_sub42)
				    .anIntArrayArray10172[i_110_]),
				   i_125_, i_126_, i_127_, i_102_, bool_103_,
				   i_104_ & (((Class241_Sub42) class241_sub42)
					     .anIntArray10174[i_110_]),
				   is);
		    }
		}
	    }
	}
    }
    
    void method1883(int i, int[] is, int i_133_, int i_134_, int i_135_,
		    int i_136_, boolean bool, int i_137_, int[] is_138_) {
	if (i_136_ == 1) {
	    if (i == 0 || i == 1) {
		int i_139_ = -i_133_;
		i_133_ = i_135_;
		i_135_ = i_139_;
	    } else if (i == 3) {
		int i_140_ = i_133_;
		i_133_ = i_135_;
		i_135_ = i_140_;
	    } else if (i == 2) {
		int i_141_ = i_133_;
		i_133_ = -i_135_ & 0x3fff;
		i_135_ = i_141_ & 0x3fff;
	    }
	} else if (i_136_ == 2) {
	    if (i == 0 || i == 1) {
		i_133_ = -i_133_;
		i_135_ = -i_135_;
	    } else if (i == 2) {
		i_133_ = -i_133_ & 0x3fff;
		i_135_ = -i_135_ & 0x3fff;
	    }
	} else if (i_136_ == 3) {
	    if (i == 0 || i == 1) {
		int i_142_ = i_133_;
		i_133_ = -i_135_;
		i_135_ = i_142_;
	    } else if (i == 3) {
		int i_143_ = i_133_;
		i_133_ = i_135_;
		i_135_ = i_143_;
	    } else if (i == 2) {
		int i_144_ = i_133_;
		i_133_ = i_135_ & 0x3fff;
		i_135_ = -i_144_ & 0x3fff;
	    }
	}
	if (i_137_ != 65535)
	    method1872(i, is, i_133_, i_134_, i_135_, bool, i_137_, is_138_);
	else
	    method2002(i, is, i_133_, i_134_, i_135_, i_136_, bool);
    }
    
    abstract boolean method1884();
    
    public abstract void method1885(int i);
    
    public abstract Class89 method1886(byte i, int i_145_, boolean bool);
    
    abstract void method1887(int i, int i_146_, int i_147_, int i_148_);
    
    abstract void method1888();
    
    public abstract int method1889();
    
    public abstract void method1890(Class266 class266, Class97 class97, int i);
    
    public abstract boolean method1891(int i, int i_149_, Class266 class266,
				       boolean bool, int i_150_);
    
    public abstract Class241_Sub39_Sub17 method1892
	(Class241_Sub39_Sub17 class241_sub39_sub17);
    
    public abstract int method1893();
    
    public abstract int method1894();
    
    public abstract int method1895();
    
    Class100 method1896(Class161 class161, int[] is, int i) {
	int[] is_151_ = null;
	int[] is_152_ = null;
	int[] is_153_ = null;
	float[][] fs = null;
	if (class161.aShortArray1811 != null) {
	    int i_154_ = ((Class161) class161).anInt1819;
	    int[] is_155_ = new int[i_154_];
	    int[] is_156_ = new int[i_154_];
	    int[] is_157_ = new int[i_154_];
	    int[] is_158_ = new int[i_154_];
	    int[] is_159_ = new int[i_154_];
	    int[] is_160_ = new int[i_154_];
	    for (int i_161_ = 0; i_161_ < i_154_; i_161_++) {
		is_155_[i_161_] = 2147483647;
		is_156_[i_161_] = -2147483647;
		is_157_[i_161_] = 2147483647;
		is_158_[i_161_] = -2147483647;
		is_159_[i_161_] = 2147483647;
		is_160_[i_161_] = -2147483647;
	    }
	    for (int i_162_ = 0; i_162_ < i; i_162_++) {
		int i_163_ = is[i_162_];
		short i_164_ = class161.aShortArray1811[i_163_];
		if (i_164_ > -1 && i_164_ < 32766) {
		    for (int i_165_ = 0; i_165_ < 3; i_165_++) {
			short i_166_;
			if (i_165_ == 0)
			    i_166_ = class161.aShortArray1818[i_163_];
			else if (i_165_ == 1)
			    i_166_ = class161.aShortArray1796[i_163_];
			else
			    i_166_ = class161.aShortArray1804[i_163_];
			int i_167_ = class161.anIntArray1831[i_166_];
			int i_168_ = class161.anIntArray1791[i_166_];
			int i_169_ = class161.anIntArray1816[i_166_];
			if (i_167_ < is_155_[i_164_])
			    is_155_[i_164_] = i_167_;
			if (i_167_ > is_156_[i_164_])
			    is_156_[i_164_] = i_167_;
			if (i_168_ < is_157_[i_164_])
			    is_157_[i_164_] = i_168_;
			if (i_168_ > is_158_[i_164_])
			    is_158_[i_164_] = i_168_;
			if (i_169_ < is_159_[i_164_])
			    is_159_[i_164_] = i_169_;
			if (i_169_ > is_160_[i_164_])
			    is_160_[i_164_] = i_169_;
		    }
		}
	    }
	    is_151_ = new int[i_154_];
	    is_152_ = new int[i_154_];
	    is_153_ = new int[i_154_];
	    fs = new float[i_154_][];
	    for (int i_170_ = 0; i_170_ < i_154_; i_170_++) {
		byte i_171_ = class161.aByteArray1820[i_170_];
		if (i_171_ > 0) {
		    is_151_[i_170_] = (is_155_[i_170_] + is_156_[i_170_]) / 2;
		    is_152_[i_170_] = (is_157_[i_170_] + is_158_[i_170_]) / 2;
		    is_153_[i_170_] = (is_159_[i_170_] + is_160_[i_170_]) / 2;
		    float f;
		    float f_172_;
		    float f_173_;
		    if (i_171_ == 1) {
			int i_174_ = class161.anIntArray1824[i_170_];
			if (i_174_ == 0) {
			    f = 1.0F;
			    f_173_ = 1.0F;
			} else if (i_174_ > 0) {
			    f = 1.0F;
			    f_173_ = (float) i_174_ / 1024.0F;
			} else {
			    f_173_ = 1.0F;
			    f = (float) -i_174_ / 1024.0F;
			}
			f_172_
			    = 64.0F / (float) class161.anIntArray1825[i_170_];
		    } else if (i_171_ == 2) {
			f = 64.0F / (float) class161.anIntArray1824[i_170_];
			f_172_
			    = 64.0F / (float) class161.anIntArray1825[i_170_];
			f_173_
			    = 64.0F / (float) class161.anIntArray1826[i_170_];
		    } else {
			f = (float) class161.anIntArray1824[i_170_] / 1024.0F;
			f_172_ = ((float) class161.anIntArray1825[i_170_]
				  / 1024.0F);
			f_173_ = ((float) class161.anIntArray1826[i_170_]
				  / 1024.0F);
		    }
		    fs[i_170_] = method1948(class161.aShortArray1821[i_170_],
					    class161.aShortArray1822[i_170_],
					    class161.aShortArray1823[i_170_],
					    (((Class161) class161)
					     .aByteArray1830[i_170_]) & 0xff,
					    f, f_172_, f_173_);
		}
	    }
	}
	return new Class100(this, is_151_, is_152_, is_153_, fs);
    }
    
    abstract void method1897(int i, int[] is, int i_175_, int i_176_,
			     int i_177_, int i_178_, boolean bool);
    
    public abstract Class241_Sub39_Sub17 method1898
	(Class241_Sub39_Sub17 class241_sub39_sub17);
    
    public abstract int method1899();
    
    public abstract int method1900();
    
    public abstract int method1901();
    
    public abstract int method1902();
    
    public abstract void method1903(int i);
    
    public abstract Class241_Sub39_Sub17 method1904
	(Class241_Sub39_Sub17 class241_sub39_sub17);
    
    public abstract int method1905();
    
    public abstract int method1906();
    
    public abstract byte[] method1907();
    
    public abstract void method1908(short i, short i_179_);
    
    public abstract void method1909(byte i, byte[] is);
    
    public abstract void method1910();
    
    public abstract void method1911(int i, int i_180_, int i_181_, int i_182_);
    
    public abstract boolean method1912();
    
    public abstract byte[] method1913();
    
    public abstract boolean method1914();
    
    public abstract void method1915(Class266 class266);
    
    abstract void method1916(int i, int[] is, int i_183_, int i_184_,
			     int i_185_, int i_186_, boolean bool);
    
    public abstract Class167[] method1917();
    
    public final void method1918
	(Class241_Sub39_Sub2 class241_sub39_sub2, int i,
	 Class241_Sub39_Sub2 class241_sub39_sub2_187_, int i_188_, int i_189_,
	 int i_190_, int i_191_, boolean bool) {
	if (i != -1) {
	    method1877();
	    if (!method1884())
		method1878();
	    else {
		Class87 class87 = (((Class241_Sub39_Sub2) class241_sub39_sub2)
				   .aClass87Array10825[i]);
		Class241_Sub42 class241_sub42
		    = ((Class87) class87).aClass241_Sub42_1273;
		Class87 class87_192_ = null;
		if (class241_sub39_sub2_187_ != null) {
		    class87_192_
			= (((Class241_Sub39_Sub2) class241_sub39_sub2_187_)
			   .aClass87Array10825[i_188_]);
		    if (((Class87) class87_192_).aClass241_Sub42_1273
			!= class241_sub42)
			class87_192_ = null;
		}
		method1882(class241_sub42, class87, class87_192_, i_189_,
			   i_190_, i_191_, null, false, bool, 65535, null);
		method1888();
		method1878();
	    }
	}
    }
    
    public abstract int method1919();
    
    public abstract void method1920(Class89 class89_193_, int i, int i_194_,
				    int i_195_, boolean bool);
    
    public abstract void method1921(Class89 class89_196_, int i, int i_197_,
				    int i_198_, boolean bool);
    
    public abstract void method1922();
    
    public abstract Class89 method1923(byte i, int i_199_, boolean bool);
    
    public abstract int method1924();
    
    public abstract int method1925();
    
    public abstract int method1926();
    
    public abstract void method1927(int i, int i_200_, int i_201_);
    
    public abstract void method1928(int i);
    
    public abstract void method1929(int i);
    
    public abstract void method1930(int i);
    
    public abstract void method1931(int i);
    
    public abstract void method1932(byte i, byte[] is);
    
    public abstract void method1933(int i);
    
    public abstract void method1934(int i);
    
    public abstract void method1935(int i);
    
    public abstract void method1936(int i);
    
    public final void method1937(Class241_Sub39_Sub2 class241_sub39_sub2,
				 int i) {
	if (i != -1) {
	    method1877();
	    if (!method1884())
		method1878();
	    else {
		Class87 class87 = (((Class241_Sub39_Sub2) class241_sub39_sub2)
				   .aClass87Array10825[i]);
		Class241_Sub42 class241_sub42
		    = ((Class87) class87).aClass241_Sub42_1273;
		for (int i_202_ = 0; i_202_ < ((Class87) class87).anInt1259;
		     i_202_++) {
		    short i_203_ = ((Class87) class87).aShortArray1266[i_202_];
		    if (((Class241_Sub42) class241_sub42).aBoolArray10173
			[i_203_]) {
			if (((Class87) class87).aShortArray1265[i_202_] != -1)
			    method1887(0, 0, 0, 0);
			method1887((((Class241_Sub42) class241_sub42)
				    .anIntArray10171[i_203_]),
				   ((Class87) class87).aShortArray1268[i_202_],
				   ((Class87) class87).aShortArray1267[i_202_],
				   (((Class87) class87).aShortArray1269
				    [i_202_]));
		    }
		}
		method1888();
		method1878();
	    }
	}
    }
    
    public abstract void method1938(int i);
    
    public abstract void method1939(int i, int i_204_, int i_205_);
    
    public abstract int method1940();
    
    public abstract void method1941(int i, int i_206_, int i_207_);
    
    public abstract void method1942(Class89 class89_208_, int i, int i_209_,
				    int i_210_, boolean bool);
    
    public abstract void method1943(int i, int i_211_, int i_212_);
    
    public abstract void method1944(short i, short i_213_);
    
    public abstract void method1945(int i, int i_214_, int i_215_);
    
    public abstract void method1946(int i, int i_216_, int i_217_);
    
    public abstract void method1947(int i, int i_218_, Class166 class166,
				    Class166 class166_219_, int i_220_,
				    int i_221_, int i_222_);
    
    float[] method1948(int i, int i_223_, int i_224_, int i_225_, float f,
		       float f_226_, float f_227_) {
	float[] fs = new float[9];
	float[] fs_228_ = new float[9];
	float f_229_
	    = (float) Math.cos((double) ((float) i_225_ * 0.024543693F));
	float f_230_
	    = (float) Math.sin((double) ((float) i_225_ * 0.024543693F));
	float f_231_ = 1.0F - f_229_;
	fs[0] = f_229_;
	fs[1] = 0.0F;
	fs[2] = f_230_;
	fs[3] = 0.0F;
	fs[4] = 1.0F;
	fs[5] = 0.0F;
	fs[6] = -f_230_;
	fs[7] = 0.0F;
	fs[8] = f_229_;
	float[] fs_232_ = new float[9];
	float f_233_ = 1.0F;
	float f_234_ = 0.0F;
	f_229_ = (float) i_223_ / 32767.0F;
	f_230_ = -(float) Math.sqrt((double) (1.0F - f_229_ * f_229_));
	f_231_ = 1.0F - f_229_;
	float f_235_ = (float) Math.sqrt((double) (i * i + i_224_ * i_224_));
	if (f_235_ == 0.0F && f_229_ == 0.0F)
	    fs_228_ = fs;
	else {
	    if (f_235_ != 0.0F) {
		f_233_ = (float) -i_224_ / f_235_;
		f_234_ = (float) i / f_235_;
	    }
	    fs_232_[0] = f_229_ + f_233_ * f_233_ * f_231_;
	    fs_232_[1] = f_234_ * f_230_;
	    fs_232_[2] = f_234_ * f_233_ * f_231_;
	    fs_232_[3] = -f_234_ * f_230_;
	    fs_232_[4] = f_229_;
	    fs_232_[5] = f_233_ * f_230_;
	    fs_232_[6] = f_233_ * f_234_ * f_231_;
	    fs_232_[7] = -f_233_ * f_230_;
	    fs_232_[8] = f_229_ + f_234_ * f_234_ * f_231_;
	    fs_228_[0]
		= fs[0] * fs_232_[0] + fs[1] * fs_232_[3] + fs[2] * fs_232_[6];
	    fs_228_[1]
		= fs[0] * fs_232_[1] + fs[1] * fs_232_[4] + fs[2] * fs_232_[7];
	    fs_228_[2]
		= fs[0] * fs_232_[2] + fs[1] * fs_232_[5] + fs[2] * fs_232_[8];
	    fs_228_[3]
		= fs[3] * fs_232_[0] + fs[4] * fs_232_[3] + fs[5] * fs_232_[6];
	    fs_228_[4]
		= fs[3] * fs_232_[1] + fs[4] * fs_232_[4] + fs[5] * fs_232_[7];
	    fs_228_[5]
		= fs[3] * fs_232_[2] + fs[4] * fs_232_[5] + fs[5] * fs_232_[8];
	    fs_228_[6]
		= fs[6] * fs_232_[0] + fs[7] * fs_232_[3] + fs[8] * fs_232_[6];
	    fs_228_[7]
		= fs[6] * fs_232_[1] + fs[7] * fs_232_[4] + fs[8] * fs_232_[7];
	    fs_228_[8]
		= fs[6] * fs_232_[2] + fs[7] * fs_232_[5] + fs[8] * fs_232_[8];
	}
	fs_228_[0] *= f;
	fs_228_[1] *= f;
	fs_228_[2] *= f;
	fs_228_[3] *= f_226_;
	fs_228_[4] *= f_226_;
	fs_228_[5] *= f_226_;
	fs_228_[6] *= f_227_;
	fs_228_[7] *= f_227_;
	fs_228_[8] *= f_227_;
	return fs_228_;
    }
    
    public abstract void method1949();
    
    void method1950(int i, int i_236_, int i_237_, int i_238_, int i_239_,
		    int i_240_, int i_241_, float[] fs, int i_242_, float f,
		    float f_243_, float f_244_, float[] fs_245_) {
	i -= i_238_;
	i_236_ -= i_239_;
	i_237_ -= i_240_;
	float f_246_ = ((float) i * fs[0] + (float) i_236_ * fs[1]
			+ (float) i_237_ * fs[2]);
	float f_247_ = ((float) i * fs[3] + (float) i_236_ * fs[4]
			+ (float) i_237_ * fs[5]);
	float f_248_ = ((float) i * fs[6] + (float) i_236_ * fs[7]
			+ (float) i_237_ * fs[8]);
	float f_249_;
	float f_250_;
	if (i_241_ == 0) {
	    f_249_ = f_246_ + f + 0.5F;
	    f_250_ = -f_248_ + f_244_ + 0.5F;
	} else if (i_241_ == 1) {
	    f_249_ = f_246_ + f + 0.5F;
	    f_250_ = f_248_ + f_244_ + 0.5F;
	} else if (i_241_ == 2) {
	    f_249_ = -f_246_ + f + 0.5F;
	    f_250_ = -f_247_ + f_243_ + 0.5F;
	} else if (i_241_ == 3) {
	    f_249_ = f_246_ + f + 0.5F;
	    f_250_ = -f_247_ + f_243_ + 0.5F;
	} else if (i_241_ == 4) {
	    f_249_ = f_248_ + f_244_ + 0.5F;
	    f_250_ = -f_247_ + f_243_ + 0.5F;
	} else {
	    f_249_ = -f_248_ + f_244_ + 0.5F;
	    f_250_ = -f_247_ + f_243_ + 0.5F;
	}
	if (i_242_ == 1) {
	    float f_251_ = f_249_;
	    f_249_ = -f_250_;
	    f_250_ = f_251_;
	} else if (i_242_ == 2) {
	    f_249_ = -f_249_;
	    f_250_ = -f_250_;
	} else if (i_242_ == 3) {
	    float f_252_ = f_249_;
	    f_249_ = f_250_;
	    f_250_ = -f_252_;
	}
	fs_245_[0] = f_249_;
	fs_245_[1] = f_250_;
    }
    
    abstract void method1951();
    
    abstract void method1952();
    
    abstract void method1953();
    
    abstract boolean method1954();
    
    abstract void method1955(int i, int[] is, int i_253_, int i_254_,
			     int i_255_, boolean bool, int i_256_,
			     int[] is_257_);
    
    public abstract void method1956();
    
    abstract void method1957();
    
    abstract void method1958();
    
    void method1959(Class241_Sub42 class241_sub42, Class87 class87,
		    Class87 class87_258_, int i, int i_259_, int i_260_,
		    boolean[] bools, boolean bool, boolean bool_261_,
		    int i_262_, int[] is) {
	if (class87_258_ == null || i == 0) {
	    for (int i_263_ = 0; i_263_ < ((Class87) class87).anInt1259;
		 i_263_++) {
		short i_264_ = ((Class87) class87).aShortArray1266[i_263_];
		if (bools == null || bools[i_264_] == bool
		    || (((Class241_Sub42) class241_sub42).anIntArray10171
			[i_264_]) == 0) {
		    short i_265_ = ((Class87) class87).aShortArray1265[i_263_];
		    if (i_265_ != -1)
			method1883(0,
				   (((Class241_Sub42) class241_sub42)
				    .anIntArrayArray10172[i_265_]),
				   0, 0, 0, i_260_, bool_261_,
				   i_262_ & (((Class241_Sub42) class241_sub42)
					     .anIntArray10174[i_265_]),
				   is);
		    method1883((((Class241_Sub42) class241_sub42)
				.anIntArray10171[i_264_]),
			       (((Class241_Sub42) class241_sub42)
				.anIntArrayArray10172[i_264_]),
			       ((Class87) class87).aShortArray1268[i_263_],
			       ((Class87) class87).aShortArray1267[i_263_],
			       ((Class87) class87).aShortArray1269[i_263_],
			       i_260_, bool_261_,
			       i_262_ & (((Class241_Sub42) class241_sub42)
					 .anIntArray10174[i_264_]),
			       is);
		}
	    }
	} else {
	    int i_266_ = 0;
	    int i_267_ = 0;
	    for (int i_268_ = 0;
		 (i_268_
		  < ((Class241_Sub42) class241_sub42).anInt10162 * 1333411391);
		 i_268_++) {
		boolean bool_269_ = false;
		if (i_266_ < ((Class87) class87).anInt1259
		    && ((Class87) class87).aShortArray1266[i_266_] == i_268_)
		    bool_269_ = true;
		boolean bool_270_ = false;
		if (i_267_ < ((Class87) class87_258_).anInt1259
		    && (((Class87) class87_258_).aShortArray1266[i_267_]
			== i_268_))
		    bool_270_ = true;
		if (bool_269_ || bool_270_) {
		    if (bools != null && bools[i_268_] != bool
			&& (((Class241_Sub42) class241_sub42).anIntArray10171
			    [i_268_]) != 0) {
			if (bool_269_)
			    i_266_++;
			if (bool_270_)
			    i_267_++;
		    } else {
			int i_271_ = 0;
			int i_272_ = (((Class241_Sub42) class241_sub42)
				      .anIntArray10171[i_268_]);
			if (i_272_ == 3 || i_272_ == 10)
			    i_271_ = 128;
			int i_273_;
			int i_274_;
			int i_275_;
			short i_276_;
			byte i_277_;
			if (bool_269_) {
			    i_273_
				= ((Class87) class87).aShortArray1268[i_266_];
			    i_274_
				= ((Class87) class87).aShortArray1267[i_266_];
			    i_275_
				= ((Class87) class87).aShortArray1269[i_266_];
			    i_276_
				= ((Class87) class87).aShortArray1265[i_266_];
			    i_277_
				= ((Class87) class87).aByteArray1272[i_266_];
			    i_266_++;
			} else {
			    i_273_ = i_271_;
			    i_274_ = i_271_;
			    i_275_ = i_271_;
			    i_276_ = (short) -1;
			    i_277_ = (byte) 0;
			}
			int i_278_;
			int i_279_;
			int i_280_;
			short i_281_;
			byte i_282_;
			if (bool_270_) {
			    i_278_ = (((Class87) class87_258_).aShortArray1268
				      [i_267_]);
			    i_279_ = (((Class87) class87_258_).aShortArray1267
				      [i_267_]);
			    i_280_ = (((Class87) class87_258_).aShortArray1269
				      [i_267_]);
			    i_281_ = (((Class87) class87_258_).aShortArray1265
				      [i_267_]);
			    i_282_ = (((Class87) class87_258_).aByteArray1272
				      [i_267_]);
			    i_267_++;
			} else {
			    i_278_ = i_271_;
			    i_279_ = i_271_;
			    i_280_ = i_271_;
			    i_281_ = (short) -1;
			    i_282_ = (byte) 0;
			}
			int i_283_;
			int i_284_;
			int i_285_;
			if ((i_277_ & 0x2) != 0 || (i_282_ & 0x1) != 0) {
			    i_283_ = i_273_;
			    i_284_ = i_274_;
			    i_285_ = i_275_;
			} else if (i_272_ == 2) {
			    int i_286_ = i_278_ - i_273_ & 0x3fff;
			    int i_287_ = i_279_ - i_274_ & 0x3fff;
			    int i_288_ = i_280_ - i_275_ & 0x3fff;
			    if (i_286_ >= 8192)
				i_286_ -= 16384;
			    if (i_287_ >= 8192)
				i_287_ -= 16384;
			    if (i_288_ >= 8192)
				i_288_ -= 16384;
			    i_283_ = i_273_ + i_286_ * i / i_259_ & 0x3fff;
			    i_284_ = i_274_ + i_287_ * i / i_259_ & 0x3fff;
			    i_285_ = i_275_ + i_288_ * i / i_259_ & 0x3fff;
			} else if (i_272_ == 9) {
			    int i_289_ = i_278_ - i_273_ & 0x3fff;
			    if (i_289_ >= 8192)
				i_289_ -= 16384;
			    i_283_ = i_273_ + i_289_ * i / i_259_ & 0x3fff;
			    i_285_ = 0;
			    i_284_ = 0;
			} else if (i_272_ == 7) {
			    int i_290_ = i_278_ - i_273_ & 0x3f;
			    if (i_290_ >= 32)
				i_290_ -= 64;
			    i_283_ = i_273_ + i_290_ * i / i_259_ & 0x3f;
			    i_284_ = i_274_ + (i_279_ - i_274_) * i / i_259_;
			    i_285_ = i_275_ + (i_280_ - i_275_) * i / i_259_;
			} else {
			    i_283_ = i_273_ + (i_278_ - i_273_) * i / i_259_;
			    i_284_ = i_274_ + (i_279_ - i_274_) * i / i_259_;
			    i_285_ = i_275_ + (i_280_ - i_275_) * i / i_259_;
			}
			if (i_276_ != -1)
			    method1883(0,
				       (((Class241_Sub42) class241_sub42)
					.anIntArrayArray10172[i_276_]),
				       0, 0, 0, i_260_, bool_261_,
				       (i_262_
					& (((Class241_Sub42) class241_sub42)
					   .anIntArray10174[i_276_])),
				       is);
			else if (i_281_ != -1)
			    method1883(0,
				       (((Class241_Sub42) class241_sub42)
					.anIntArrayArray10172[i_281_]),
				       0, 0, 0, i_260_, bool_261_,
				       (i_262_
					& (((Class241_Sub42) class241_sub42)
					   .anIntArray10174[i_281_])),
				       is);
			method1883(i_272_,
				   (((Class241_Sub42) class241_sub42)
				    .anIntArrayArray10172[i_268_]),
				   i_283_, i_284_, i_285_, i_260_, bool_261_,
				   i_262_ & (((Class241_Sub42) class241_sub42)
					     .anIntArray10174[i_268_]),
				   is);
		    }
		}
	    }
	}
    }
    
    public abstract void method1960(int i, int i_291_, Class166 class166,
				    Class166 class166_292_, int i_293_,
				    int i_294_, int i_295_);
    
    public abstract void method1961(int i);
    
    abstract void method1962(int i, int[] is, int i_296_, int i_297_,
			     int i_298_, boolean bool, int i_299_,
			     int[] is_300_);
    
    abstract void method1963(int i, int[] is, int i_301_, int i_302_,
			     int i_303_, boolean bool, int i_304_,
			     int[] is_305_);
    
    abstract void method1964(int i, int[] is, int i_306_, int i_307_,
			     int i_308_, boolean bool, int i_309_,
			     int[] is_310_);
    
    public abstract boolean method1965();
    
    public abstract void method1966(Class266 class266, int i, boolean bool);
    
    public abstract void method1967(Class266 class266, Class97 class97, int i);
    
    public abstract boolean method1968();
    
    public abstract boolean method1969(int i, int i_311_, Class266 class266,
				       boolean bool, int i_312_);
    
    public abstract void method1970(Class266 class266);
    
    public abstract int method1971();
    
    public abstract void method1972(Class266 class266);
    
    public abstract void method1973(int i);
    
    public abstract int method1974();
    
    public final void method1975
	(Class241_Sub39_Sub2 class241_sub39_sub2, int i,
	 Class241_Sub39_Sub2 class241_sub39_sub2_313_, int i_314_, int i_315_,
	 int i_316_, Class241_Sub39_Sub2 class241_sub39_sub2_317_, int i_318_,
	 Class241_Sub39_Sub2 class241_sub39_sub2_319_, int i_320_, int i_321_,
	 int i_322_, boolean[] bools, boolean bool) {
	if (i != -1) {
	    if (bools == null || i_318_ == -1)
		method1879(class241_sub39_sub2, i, class241_sub39_sub2_313_,
			   i_314_, i_315_, i_316_, 0, bool);
	    else {
		method1877();
		if (!method1884())
		    method1878();
		else {
		    Class87 class87
			= (((Class241_Sub39_Sub2) class241_sub39_sub2)
			   .aClass87Array10825[i]);
		    Class241_Sub42 class241_sub42
			= ((Class87) class87).aClass241_Sub42_1273;
		    Class87 class87_323_ = null;
		    if (class241_sub39_sub2_313_ != null) {
			class87_323_
			    = (((Class241_Sub39_Sub2) class241_sub39_sub2_313_)
			       .aClass87Array10825[i_314_]);
			if (((Class87) class87_323_).aClass241_Sub42_1273
			    != class241_sub42)
			    class87_323_ = null;
		    }
		    method1882(class241_sub42, class87, class87_323_, i_315_,
			       i_316_, 0, bools, false, bool, 65535, null);
		    Class87 class87_324_
			= (((Class241_Sub39_Sub2) class241_sub39_sub2_317_)
			   .aClass87Array10825[i_318_]);
		    Class87 class87_325_ = null;
		    if (class241_sub39_sub2_319_ != null) {
			class87_325_
			    = (((Class241_Sub39_Sub2) class241_sub39_sub2_319_)
			       .aClass87Array10825[i_320_]);
			if (((Class87) class87_325_).aClass241_Sub42_1273
			    != class241_sub42)
			    class87_325_ = null;
		    }
		    method2002(0, new int[0], 0, 0, 0, 0, bool);
		    method1882(((Class87) class87_324_).aClass241_Sub42_1273,
			       class87_324_, class87_325_, i_321_, i_322_, 0,
			       bools, true, bool, 65535, null);
		    method1888();
		    method1878();
		}
	    }
	}
    }
    
    public abstract byte[] method1976();
    
    public abstract void method1977();
    
    public abstract int method1978();
    
    public abstract int method1979();
    
    public abstract void method1980(int i);
    
    public abstract int method1981();
    
    public abstract int method1982();
    
    public abstract int method1983();
    
    public abstract void method1984(int i);
    
    public abstract void method1985(short i, short i_326_);
    
    public abstract int method1986();
    
    public abstract int method1987();
    
    public abstract int method1988();
    
    public abstract int method1989();
    
    public abstract void method1990(int i);
    
    public abstract int method1991();
    
    public abstract int method1992();
    
    public abstract void method1993(short i, short i_327_);
    
    void method1994(Class166 class166, int i, int i_328_, int i_329_,
		    int i_330_, int i_331_, int i_332_, int i_333_) {
	boolean bool = false;
	boolean bool_334_ = false;
	boolean bool_335_ = false;
	int i_336_ = -i_330_ / 2;
	int i_337_ = -i_331_ / 2;
	int i_338_
	    = class166.method3550(i + i_336_, i_329_ + i_337_, -621360414);
	int i_339_ = i_330_ / 2;
	int i_340_ = -i_331_ / 2;
	int i_341_
	    = class166.method3550(i + i_339_, i_329_ + i_340_, -1075721352);
	int i_342_ = -i_330_ / 2;
	int i_343_ = i_331_ / 2;
	int i_344_
	    = class166.method3550(i + i_342_, i_329_ + i_343_, -1460906983);
	int i_345_ = i_330_ / 2;
	int i_346_ = i_331_ / 2;
	int i_347_
	    = class166.method3550(i + i_345_, i_329_ + i_346_, -741218138);
	int i_348_ = i_338_ < i_341_ ? i_338_ : i_341_;
	int i_349_ = i_344_ < i_347_ ? i_344_ : i_347_;
	int i_350_ = i_341_ < i_347_ ? i_341_ : i_347_;
	int i_351_ = i_338_ < i_344_ ? i_338_ : i_344_;
	if (i_331_ != 0) {
	    int i_352_ = ((int) (Math.atan2((double) (i_348_ - i_349_),
					    (double) i_331_)
				 * 2607.5945876176133)
			  & 0x3fff);
	    if (i_352_ != 0) {
		if (i_332_ != 0) {
		    if (i_352_ > 8192) {
			int i_353_ = 16384 - i_332_;
			if (i_352_ < i_353_)
			    i_352_ = i_353_;
		    } else if (i_352_ > i_332_)
			i_352_ = i_332_;
		}
		method1870(i_352_);
	    }
	}
	if (i_330_ != 0) {
	    int i_354_ = ((int) (Math.atan2((double) (i_351_ - i_350_),
					    (double) i_330_)
				 * 2607.5945876176133)
			  & 0x3fff);
	    if (i_354_ != 0) {
		if (i_333_ != 0) {
		    if (i_354_ > 8192) {
			int i_355_ = 16384 - i_333_;
			if (i_354_ < i_355_)
			    i_354_ = i_355_;
		    } else if (i_354_ > i_333_)
			i_354_ = i_333_;
		}
		method1980(i_354_);
	    }
	}
	int i_356_ = i_338_ + i_347_;
	if (i_341_ + i_344_ < i_356_)
	    i_356_ = i_341_ + i_344_;
	i_356_ = (i_356_ >> 1) - i_328_;
	if (i_356_ != 0)
	    method1927(0, i_356_, 0);
    }
    
    public abstract void method1995(int i);
    
    public abstract int method1996();
    
    public abstract void method1997(Class89 class89_357_, int i, int i_358_,
				    int i_359_, boolean bool);
    
    public abstract int method1998();
    
    public abstract int method1999();
    
    public abstract int method2000();
    
    public abstract int method2001();
    
    abstract void method2002(int i, int[] is, int i_360_, int i_361_,
			     int i_362_, int i_363_, boolean bool);
    
    public abstract int method2003();
    
    public abstract int method2004();
    
    public abstract int method2005();
    
    public abstract void method2006(Class266 class266, Class97 class97, int i);
    
    public abstract byte[] method2007();
    
    public final void method2008
	(Class241_Sub39_Sub2 class241_sub39_sub2, int i,
	 Class241_Sub39_Sub2 class241_sub39_sub2_364_, int i_365_, int i_366_,
	 int i_367_, int i_368_, int i_369_, boolean bool, int[] is) {
	if (i != -1) {
	    method1877();
	    if (!method1884())
		method1878();
	    else {
		Class87 class87 = (((Class241_Sub39_Sub2) class241_sub39_sub2)
				   .aClass87Array10825[i]);
		Class241_Sub42 class241_sub42
		    = ((Class87) class87).aClass241_Sub42_1273;
		Class87 class87_370_ = null;
		if (class241_sub39_sub2_364_ != null) {
		    class87_370_
			= (((Class241_Sub39_Sub2) class241_sub39_sub2_364_)
			   .aClass87Array10825[i_365_]);
		    if (((Class87) class87_370_).aClass241_Sub42_1273
			!= class241_sub42)
			class87_370_ = null;
		}
		method1882(class241_sub42, class87, class87_370_, i_366_,
			   i_367_, i_368_, null, false, bool, i_369_, is);
		method1888();
		method1878();
	    }
	}
    }
    
    abstract void method2009();
    
    public abstract void method2010(byte i, byte[] is);
    
    public abstract void method2011(Class266 class266);
    
    void method2012(int i, int i_371_, int i_372_, int i_373_, int i_374_,
		    int i_375_, float[] fs, int i_376_, float f,
		    float[] fs_377_) {
	i -= i_373_;
	i_371_ -= i_374_;
	i_372_ -= i_375_;
	float f_378_ = ((float) i * fs[0] + (float) i_371_ * fs[1]
			+ (float) i_372_ * fs[2]);
	float f_379_ = ((float) i * fs[3] + (float) i_371_ * fs[4]
			+ (float) i_372_ * fs[5]);
	float f_380_ = ((float) i * fs[6] + (float) i_371_ * fs[7]
			+ (float) i_372_ * fs[8]);
	float f_381_
	    = (float) Math.sqrt((double) (f_378_ * f_378_ + f_379_ * f_379_
					  + f_380_ * f_380_));
	float f_382_ = (((float) Math.atan2((double) f_378_, (double) f_380_)
			 / 6.2831855F)
			+ 0.5F);
	float f_383_
	    = ((float) Math.asin((double) (f_379_ / f_381_)) / 3.1415927F
	       + 0.5F + f);
	if (i_376_ == 1) {
	    float f_384_ = f_382_;
	    f_382_ = -f_383_;
	    f_383_ = f_384_;
	} else if (i_376_ == 2) {
	    f_382_ = -f_382_;
	    f_383_ = -f_383_;
	} else if (i_376_ == 3) {
	    float f_385_ = f_382_;
	    f_382_ = f_383_;
	    f_383_ = -f_385_;
	}
	fs_377_[0] = f_382_;
	fs_377_[1] = f_383_;
    }
    
    public abstract void method2013(int i, int i_386_, Class166 class166,
				    Class166 class166_387_, int i_388_,
				    int i_389_, int i_390_);
    
    public abstract void method2014(int i, int i_391_, int i_392_, int i_393_);
    
    public abstract Class106[] method2015();
    
    public abstract Class167[] method2016();
    
    public final void method2017
	(Class241_Sub39_Sub2 class241_sub39_sub2, int i,
	 Class241_Sub39_Sub2 class241_sub39_sub2_394_, int i_395_, int i_396_,
	 int i_397_, int i_398_, int i_399_, boolean bool, int[] is) {
	if (i != -1) {
	    method1877();
	    if (!method1884())
		method1878();
	    else {
		Class87 class87 = (((Class241_Sub39_Sub2) class241_sub39_sub2)
				   .aClass87Array10825[i]);
		Class241_Sub42 class241_sub42
		    = ((Class87) class87).aClass241_Sub42_1273;
		Class87 class87_400_ = null;
		if (class241_sub39_sub2_394_ != null) {
		    class87_400_
			= (((Class241_Sub39_Sub2) class241_sub39_sub2_394_)
			   .aClass87Array10825[i_395_]);
		    if (((Class87) class87_400_).aClass241_Sub42_1273
			!= class241_sub42)
			class87_400_ = null;
		}
		method1882(class241_sub42, class87, class87_400_, i_396_,
			   i_397_, i_398_, null, false, bool, i_399_, is);
		method1888();
		method1878();
	    }
	}
    }
    
    public abstract boolean method2018();
    
    public abstract Class89 method2019(byte i, int i_401_, boolean bool);
    
    public abstract boolean method2020();
    
    public abstract boolean method2021();
    
    public abstract boolean method2022();
    
    public abstract boolean method2023();
    
    public abstract void method2024(int i, int i_402_, int i_403_);
    
    public abstract boolean method2025();
    
    public abstract boolean method2026();
    
    public abstract boolean method2027();
    
    void method2028(int i, int i_404_, int i_405_, int i_406_, int i_407_,
		    int i_408_, float[] fs, int i_409_, float f,
		    float[] fs_410_) {
	i -= i_406_;
	i_404_ -= i_407_;
	i_405_ -= i_408_;
	float f_411_ = ((float) i * fs[0] + (float) i_404_ * fs[1]
			+ (float) i_405_ * fs[2]);
	float f_412_ = ((float) i * fs[3] + (float) i_404_ * fs[4]
			+ (float) i_405_ * fs[5]);
	float f_413_ = ((float) i * fs[6] + (float) i_404_ * fs[7]
			+ (float) i_405_ * fs[8]);
	float f_414_
	    = (float) Math.sqrt((double) (f_411_ * f_411_ + f_412_ * f_412_
					  + f_413_ * f_413_));
	float f_415_ = (((float) Math.atan2((double) f_411_, (double) f_413_)
			 / 6.2831855F)
			+ 0.5F);
	float f_416_
	    = ((float) Math.asin((double) (f_412_ / f_414_)) / 3.1415927F
	       + 0.5F + f);
	if (i_409_ == 1) {
	    float f_417_ = f_415_;
	    f_415_ = -f_416_;
	    f_416_ = f_417_;
	} else if (i_409_ == 2) {
	    f_415_ = -f_415_;
	    f_416_ = -f_416_;
	} else if (i_409_ == 3) {
	    float f_418_ = f_415_;
	    f_415_ = f_416_;
	    f_416_ = -f_418_;
	}
	fs_410_[0] = f_415_;
	fs_410_[1] = f_416_;
    }
    
    public abstract Class167[] method2029();
    
    void method2030(int i, int i_419_, int i_420_, int i_421_, int i_422_,
		    int i_423_, float[] fs, float f, int i_424_, float f_425_,
		    float[] fs_426_) {
	i -= i_421_;
	i_419_ -= i_422_;
	i_420_ -= i_423_;
	float f_427_ = ((float) i * fs[0] + (float) i_419_ * fs[1]
			+ (float) i_420_ * fs[2]);
	float f_428_ = ((float) i * fs[3] + (float) i_419_ * fs[4]
			+ (float) i_420_ * fs[5]);
	float f_429_ = ((float) i * fs[6] + (float) i_419_ * fs[7]
			+ (float) i_420_ * fs[8]);
	float f_430_ = (((float) Math.atan2((double) f_427_, (double) f_429_)
			 / 6.2831855F)
			+ 0.5F);
	if (f != 1.0F)
	    f_430_ *= f;
	float f_431_ = f_428_ + 0.5F + f_425_;
	if (i_424_ == 1) {
	    float f_432_ = f_430_;
	    f_430_ = -f_431_;
	    f_431_ = f_432_;
	} else if (i_424_ == 2) {
	    f_430_ = -f_430_;
	    f_431_ = -f_431_;
	} else if (i_424_ == 3) {
	    float f_433_ = f_430_;
	    f_430_ = f_431_;
	    f_431_ = -f_433_;
	}
	fs_426_[0] = f_430_;
	fs_426_[1] = f_431_;
    }
    
    void method2031(int i, int i_434_, int i_435_, int i_436_, int i_437_,
		    int i_438_, float[] fs, float f, int i_439_, float f_440_,
		    float[] fs_441_) {
	i -= i_436_;
	i_434_ -= i_437_;
	i_435_ -= i_438_;
	float f_442_ = ((float) i * fs[0] + (float) i_434_ * fs[1]
			+ (float) i_435_ * fs[2]);
	float f_443_ = ((float) i * fs[3] + (float) i_434_ * fs[4]
			+ (float) i_435_ * fs[5]);
	float f_444_ = ((float) i * fs[6] + (float) i_434_ * fs[7]
			+ (float) i_435_ * fs[8]);
	float f_445_ = (((float) Math.atan2((double) f_442_, (double) f_444_)
			 / 6.2831855F)
			+ 0.5F);
	if (f != 1.0F)
	    f_445_ *= f;
	float f_446_ = f_443_ + 0.5F + f_440_;
	if (i_439_ == 1) {
	    float f_447_ = f_445_;
	    f_445_ = -f_446_;
	    f_446_ = f_447_;
	} else if (i_439_ == 2) {
	    f_445_ = -f_445_;
	    f_446_ = -f_446_;
	} else if (i_439_ == 3) {
	    float f_448_ = f_445_;
	    f_445_ = f_446_;
	    f_446_ = -f_448_;
	}
	fs_441_[0] = f_445_;
	fs_441_[1] = f_446_;
    }
    
    abstract void method2032();
    
    int method2033(float f, float f_449_, float f_450_) {
	float f_451_ = f < 0.0F ? -f : f;
	float f_452_ = f_449_ < 0.0F ? -f_449_ : f_449_;
	float f_453_ = f_450_ < 0.0F ? -f_450_ : f_450_;
	if (f_452_ > f_451_ && f_452_ > f_453_) {
	    if (f_449_ > 0.0F)
		return 0;
	    return 1;
	}
	if (f_453_ > f_451_ && f_453_ > f_452_) {
	    if (f_450_ > 0.0F)
		return 2;
	    return 3;
	}
	if (f > 0.0F)
	    return 4;
	return 5;
    }
    
    public abstract void method2034();
    
    void method2035(int i, int i_454_, int i_455_, int i_456_, int i_457_,
		    int i_458_, int i_459_, float[] fs, int i_460_, float f,
		    float f_461_, float f_462_, float[] fs_463_) {
	i -= i_456_;
	i_454_ -= i_457_;
	i_455_ -= i_458_;
	float f_464_ = ((float) i * fs[0] + (float) i_454_ * fs[1]
			+ (float) i_455_ * fs[2]);
	float f_465_ = ((float) i * fs[3] + (float) i_454_ * fs[4]
			+ (float) i_455_ * fs[5]);
	float f_466_ = ((float) i * fs[6] + (float) i_454_ * fs[7]
			+ (float) i_455_ * fs[8]);
	float f_467_;
	float f_468_;
	if (i_459_ == 0) {
	    f_467_ = f_464_ + f + 0.5F;
	    f_468_ = -f_466_ + f_462_ + 0.5F;
	} else if (i_459_ == 1) {
	    f_467_ = f_464_ + f + 0.5F;
	    f_468_ = f_466_ + f_462_ + 0.5F;
	} else if (i_459_ == 2) {
	    f_467_ = -f_464_ + f + 0.5F;
	    f_468_ = -f_465_ + f_461_ + 0.5F;
	} else if (i_459_ == 3) {
	    f_467_ = f_464_ + f + 0.5F;
	    f_468_ = -f_465_ + f_461_ + 0.5F;
	} else if (i_459_ == 4) {
	    f_467_ = f_466_ + f_462_ + 0.5F;
	    f_468_ = -f_465_ + f_461_ + 0.5F;
	} else {
	    f_467_ = -f_466_ + f_462_ + 0.5F;
	    f_468_ = -f_465_ + f_461_ + 0.5F;
	}
	if (i_460_ == 1) {
	    float f_469_ = f_467_;
	    f_467_ = -f_468_;
	    f_468_ = f_469_;
	} else if (i_460_ == 2) {
	    f_467_ = -f_467_;
	    f_468_ = -f_468_;
	} else if (i_460_ == 3) {
	    float f_470_ = f_467_;
	    f_467_ = f_468_;
	    f_468_ = -f_470_;
	}
	fs_463_[0] = f_467_;
	fs_463_[1] = f_468_;
    }
    
    Class100 method2036(Class161 class161, int[] is, int i) {
	int[] is_471_ = null;
	int[] is_472_ = null;
	int[] is_473_ = null;
	float[][] fs = null;
	if (class161.aShortArray1811 != null) {
	    int i_474_ = ((Class161) class161).anInt1819;
	    int[] is_475_ = new int[i_474_];
	    int[] is_476_ = new int[i_474_];
	    int[] is_477_ = new int[i_474_];
	    int[] is_478_ = new int[i_474_];
	    int[] is_479_ = new int[i_474_];
	    int[] is_480_ = new int[i_474_];
	    for (int i_481_ = 0; i_481_ < i_474_; i_481_++) {
		is_475_[i_481_] = 2147483647;
		is_476_[i_481_] = -2147483647;
		is_477_[i_481_] = 2147483647;
		is_478_[i_481_] = -2147483647;
		is_479_[i_481_] = 2147483647;
		is_480_[i_481_] = -2147483647;
	    }
	    for (int i_482_ = 0; i_482_ < i; i_482_++) {
		int i_483_ = is[i_482_];
		short i_484_ = class161.aShortArray1811[i_483_];
		if (i_484_ > -1 && i_484_ < 32766) {
		    for (int i_485_ = 0; i_485_ < 3; i_485_++) {
			short i_486_;
			if (i_485_ == 0)
			    i_486_ = class161.aShortArray1818[i_483_];
			else if (i_485_ == 1)
			    i_486_ = class161.aShortArray1796[i_483_];
			else
			    i_486_ = class161.aShortArray1804[i_483_];
			int i_487_ = class161.anIntArray1831[i_486_];
			int i_488_ = class161.anIntArray1791[i_486_];
			int i_489_ = class161.anIntArray1816[i_486_];
			if (i_487_ < is_475_[i_484_])
			    is_475_[i_484_] = i_487_;
			if (i_487_ > is_476_[i_484_])
			    is_476_[i_484_] = i_487_;
			if (i_488_ < is_477_[i_484_])
			    is_477_[i_484_] = i_488_;
			if (i_488_ > is_478_[i_484_])
			    is_478_[i_484_] = i_488_;
			if (i_489_ < is_479_[i_484_])
			    is_479_[i_484_] = i_489_;
			if (i_489_ > is_480_[i_484_])
			    is_480_[i_484_] = i_489_;
		    }
		}
	    }
	    is_471_ = new int[i_474_];
	    is_472_ = new int[i_474_];
	    is_473_ = new int[i_474_];
	    fs = new float[i_474_][];
	    for (int i_490_ = 0; i_490_ < i_474_; i_490_++) {
		byte i_491_ = class161.aByteArray1820[i_490_];
		if (i_491_ > 0) {
		    is_471_[i_490_] = (is_475_[i_490_] + is_476_[i_490_]) / 2;
		    is_472_[i_490_] = (is_477_[i_490_] + is_478_[i_490_]) / 2;
		    is_473_[i_490_] = (is_479_[i_490_] + is_480_[i_490_]) / 2;
		    float f;
		    float f_492_;
		    float f_493_;
		    if (i_491_ == 1) {
			int i_494_ = class161.anIntArray1824[i_490_];
			if (i_494_ == 0) {
			    f = 1.0F;
			    f_493_ = 1.0F;
			} else if (i_494_ > 0) {
			    f = 1.0F;
			    f_493_ = (float) i_494_ / 1024.0F;
			} else {
			    f_493_ = 1.0F;
			    f = (float) -i_494_ / 1024.0F;
			}
			f_492_
			    = 64.0F / (float) class161.anIntArray1825[i_490_];
		    } else if (i_491_ == 2) {
			f = 64.0F / (float) class161.anIntArray1824[i_490_];
			f_492_
			    = 64.0F / (float) class161.anIntArray1825[i_490_];
			f_493_
			    = 64.0F / (float) class161.anIntArray1826[i_490_];
		    } else {
			f = (float) class161.anIntArray1824[i_490_] / 1024.0F;
			f_492_ = ((float) class161.anIntArray1825[i_490_]
				  / 1024.0F);
			f_493_ = ((float) class161.anIntArray1826[i_490_]
				  / 1024.0F);
		    }
		    fs[i_490_] = method1948(class161.aShortArray1821[i_490_],
					    class161.aShortArray1822[i_490_],
					    class161.aShortArray1823[i_490_],
					    (((Class161) class161)
					     .aByteArray1830[i_490_]) & 0xff,
					    f, f_492_, f_493_);
		}
	    }
	}
	return new Class100(this, is_471_, is_472_, is_473_, fs);
    }
    
    Class100 method2037(Class161 class161, int[] is, int i) {
	int[] is_495_ = null;
	int[] is_496_ = null;
	int[] is_497_ = null;
	float[][] fs = null;
	if (class161.aShortArray1811 != null) {
	    int i_498_ = ((Class161) class161).anInt1819;
	    int[] is_499_ = new int[i_498_];
	    int[] is_500_ = new int[i_498_];
	    int[] is_501_ = new int[i_498_];
	    int[] is_502_ = new int[i_498_];
	    int[] is_503_ = new int[i_498_];
	    int[] is_504_ = new int[i_498_];
	    for (int i_505_ = 0; i_505_ < i_498_; i_505_++) {
		is_499_[i_505_] = 2147483647;
		is_500_[i_505_] = -2147483647;
		is_501_[i_505_] = 2147483647;
		is_502_[i_505_] = -2147483647;
		is_503_[i_505_] = 2147483647;
		is_504_[i_505_] = -2147483647;
	    }
	    for (int i_506_ = 0; i_506_ < i; i_506_++) {
		int i_507_ = is[i_506_];
		short i_508_ = class161.aShortArray1811[i_507_];
		if (i_508_ > -1 && i_508_ < 32766) {
		    for (int i_509_ = 0; i_509_ < 3; i_509_++) {
			short i_510_;
			if (i_509_ == 0)
			    i_510_ = class161.aShortArray1818[i_507_];
			else if (i_509_ == 1)
			    i_510_ = class161.aShortArray1796[i_507_];
			else
			    i_510_ = class161.aShortArray1804[i_507_];
			int i_511_ = class161.anIntArray1831[i_510_];
			int i_512_ = class161.anIntArray1791[i_510_];
			int i_513_ = class161.anIntArray1816[i_510_];
			if (i_511_ < is_499_[i_508_])
			    is_499_[i_508_] = i_511_;
			if (i_511_ > is_500_[i_508_])
			    is_500_[i_508_] = i_511_;
			if (i_512_ < is_501_[i_508_])
			    is_501_[i_508_] = i_512_;
			if (i_512_ > is_502_[i_508_])
			    is_502_[i_508_] = i_512_;
			if (i_513_ < is_503_[i_508_])
			    is_503_[i_508_] = i_513_;
			if (i_513_ > is_504_[i_508_])
			    is_504_[i_508_] = i_513_;
		    }
		}
	    }
	    is_495_ = new int[i_498_];
	    is_496_ = new int[i_498_];
	    is_497_ = new int[i_498_];
	    fs = new float[i_498_][];
	    for (int i_514_ = 0; i_514_ < i_498_; i_514_++) {
		byte i_515_ = class161.aByteArray1820[i_514_];
		if (i_515_ > 0) {
		    is_495_[i_514_] = (is_499_[i_514_] + is_500_[i_514_]) / 2;
		    is_496_[i_514_] = (is_501_[i_514_] + is_502_[i_514_]) / 2;
		    is_497_[i_514_] = (is_503_[i_514_] + is_504_[i_514_]) / 2;
		    float f;
		    float f_516_;
		    float f_517_;
		    if (i_515_ == 1) {
			int i_518_ = class161.anIntArray1824[i_514_];
			if (i_518_ == 0) {
			    f = 1.0F;
			    f_517_ = 1.0F;
			} else if (i_518_ > 0) {
			    f = 1.0F;
			    f_517_ = (float) i_518_ / 1024.0F;
			} else {
			    f_517_ = 1.0F;
			    f = (float) -i_518_ / 1024.0F;
			}
			f_516_
			    = 64.0F / (float) class161.anIntArray1825[i_514_];
		    } else if (i_515_ == 2) {
			f = 64.0F / (float) class161.anIntArray1824[i_514_];
			f_516_
			    = 64.0F / (float) class161.anIntArray1825[i_514_];
			f_517_
			    = 64.0F / (float) class161.anIntArray1826[i_514_];
		    } else {
			f = (float) class161.anIntArray1824[i_514_] / 1024.0F;
			f_516_ = ((float) class161.anIntArray1825[i_514_]
				  / 1024.0F);
			f_517_ = ((float) class161.anIntArray1826[i_514_]
				  / 1024.0F);
		    }
		    fs[i_514_] = method1948(class161.aShortArray1821[i_514_],
					    class161.aShortArray1822[i_514_],
					    class161.aShortArray1823[i_514_],
					    (((Class161) class161)
					     .aByteArray1830[i_514_]) & 0xff,
					    f, f_516_, f_517_);
		}
	    }
	}
	return new Class100(this, is_495_, is_496_, is_497_, fs);
    }
    
    public abstract Class241_Sub39_Sub17 method2038
	(Class241_Sub39_Sub17 class241_sub39_sub17);
    
    float[] method2039(int i, int i_519_, int i_520_, int i_521_, float f,
		       float f_522_, float f_523_) {
	float[] fs = new float[9];
	float[] fs_524_ = new float[9];
	float f_525_
	    = (float) Math.cos((double) ((float) i_521_ * 0.024543693F));
	float f_526_
	    = (float) Math.sin((double) ((float) i_521_ * 0.024543693F));
	float f_527_ = 1.0F - f_525_;
	fs[0] = f_525_;
	fs[1] = 0.0F;
	fs[2] = f_526_;
	fs[3] = 0.0F;
	fs[4] = 1.0F;
	fs[5] = 0.0F;
	fs[6] = -f_526_;
	fs[7] = 0.0F;
	fs[8] = f_525_;
	float[] fs_528_ = new float[9];
	float f_529_ = 1.0F;
	float f_530_ = 0.0F;
	f_525_ = (float) i_519_ / 32767.0F;
	f_526_ = -(float) Math.sqrt((double) (1.0F - f_525_ * f_525_));
	f_527_ = 1.0F - f_525_;
	float f_531_ = (float) Math.sqrt((double) (i * i + i_520_ * i_520_));
	if (f_531_ == 0.0F && f_525_ == 0.0F)
	    fs_524_ = fs;
	else {
	    if (f_531_ != 0.0F) {
		f_529_ = (float) -i_520_ / f_531_;
		f_530_ = (float) i / f_531_;
	    }
	    fs_528_[0] = f_525_ + f_529_ * f_529_ * f_527_;
	    fs_528_[1] = f_530_ * f_526_;
	    fs_528_[2] = f_530_ * f_529_ * f_527_;
	    fs_528_[3] = -f_530_ * f_526_;
	    fs_528_[4] = f_525_;
	    fs_528_[5] = f_529_ * f_526_;
	    fs_528_[6] = f_529_ * f_530_ * f_527_;
	    fs_528_[7] = -f_529_ * f_526_;
	    fs_528_[8] = f_525_ + f_530_ * f_530_ * f_527_;
	    fs_524_[0]
		= fs[0] * fs_528_[0] + fs[1] * fs_528_[3] + fs[2] * fs_528_[6];
	    fs_524_[1]
		= fs[0] * fs_528_[1] + fs[1] * fs_528_[4] + fs[2] * fs_528_[7];
	    fs_524_[2]
		= fs[0] * fs_528_[2] + fs[1] * fs_528_[5] + fs[2] * fs_528_[8];
	    fs_524_[3]
		= fs[3] * fs_528_[0] + fs[4] * fs_528_[3] + fs[5] * fs_528_[6];
	    fs_524_[4]
		= fs[3] * fs_528_[1] + fs[4] * fs_528_[4] + fs[5] * fs_528_[7];
	    fs_524_[5]
		= fs[3] * fs_528_[2] + fs[4] * fs_528_[5] + fs[5] * fs_528_[8];
	    fs_524_[6]
		= fs[6] * fs_528_[0] + fs[7] * fs_528_[3] + fs[8] * fs_528_[6];
	    fs_524_[7]
		= fs[6] * fs_528_[1] + fs[7] * fs_528_[4] + fs[8] * fs_528_[7];
	    fs_524_[8]
		= fs[6] * fs_528_[2] + fs[7] * fs_528_[5] + fs[8] * fs_528_[8];
	}
	fs_524_[0] *= f;
	fs_524_[1] *= f;
	fs_524_[2] *= f;
	fs_524_[3] *= f_522_;
	fs_524_[4] *= f_522_;
	fs_524_[5] *= f_522_;
	fs_524_[6] *= f_523_;
	fs_524_[7] *= f_523_;
	fs_524_[8] *= f_523_;
	return fs_524_;
    }
    
    int method2040(float f, float f_532_, float f_533_) {
	float f_534_ = f < 0.0F ? -f : f;
	float f_535_ = f_532_ < 0.0F ? -f_532_ : f_532_;
	float f_536_ = f_533_ < 0.0F ? -f_533_ : f_533_;
	if (f_535_ > f_534_ && f_535_ > f_536_) {
	    if (f_532_ > 0.0F)
		return 0;
	    return 1;
	}
	if (f_536_ > f_534_ && f_536_ > f_535_) {
	    if (f_533_ > 0.0F)
		return 2;
	    return 3;
	}
	if (f > 0.0F)
	    return 4;
	return 5;
    }
    
    void method2041(Class166 class166, int i, int i_537_, int i_538_,
		    int i_539_, int i_540_, int i_541_, int i_542_) {
	boolean bool = false;
	boolean bool_543_ = false;
	boolean bool_544_ = false;
	int i_545_ = -i_539_ / 2;
	int i_546_ = -i_540_ / 2;
	int i_547_
	    = class166.method3550(i + i_545_, i_538_ + i_546_, -33708016);
	int i_548_ = i_539_ / 2;
	int i_549_ = -i_540_ / 2;
	int i_550_
	    = class166.method3550(i + i_548_, i_538_ + i_549_, -95568438);
	int i_551_ = -i_539_ / 2;
	int i_552_ = i_540_ / 2;
	int i_553_
	    = class166.method3550(i + i_551_, i_538_ + i_552_, -1844148378);
	int i_554_ = i_539_ / 2;
	int i_555_ = i_540_ / 2;
	int i_556_
	    = class166.method3550(i + i_554_, i_538_ + i_555_, 361821420);
	int i_557_ = i_547_ < i_550_ ? i_547_ : i_550_;
	int i_558_ = i_553_ < i_556_ ? i_553_ : i_556_;
	int i_559_ = i_550_ < i_556_ ? i_550_ : i_556_;
	int i_560_ = i_547_ < i_553_ ? i_547_ : i_553_;
	if (i_540_ != 0) {
	    int i_561_ = ((int) (Math.atan2((double) (i_557_ - i_558_),
					    (double) i_540_)
				 * 2607.5945876176133)
			  & 0x3fff);
	    if (i_561_ != 0) {
		if (i_541_ != 0) {
		    if (i_561_ > 8192) {
			int i_562_ = 16384 - i_541_;
			if (i_561_ < i_562_)
			    i_561_ = i_562_;
		    } else if (i_561_ > i_541_)
			i_561_ = i_541_;
		}
		method1870(i_561_);
	    }
	}
	if (i_539_ != 0) {
	    int i_563_ = ((int) (Math.atan2((double) (i_560_ - i_559_),
					    (double) i_539_)
				 * 2607.5945876176133)
			  & 0x3fff);
	    if (i_563_ != 0) {
		if (i_542_ != 0) {
		    if (i_563_ > 8192) {
			int i_564_ = 16384 - i_542_;
			if (i_563_ < i_564_)
			    i_563_ = i_564_;
		    } else if (i_563_ > i_542_)
			i_563_ = i_542_;
		}
		method1980(i_563_);
	    }
	}
	int i_565_ = i_547_ + i_556_;
	if (i_550_ + i_553_ < i_565_)
	    i_565_ = i_550_ + i_553_;
	i_565_ = (i_565_ >> 1) - i_537_;
	if (i_565_ != 0)
	    method1927(0, i_565_, 0);
    }
    
    public abstract void method2042(int i, int i_566_, Class166 class166,
				    Class166 class166_567_, int i_568_,
				    int i_569_, int i_570_);
    
    void method2043(Class166 class166, int i, int i_571_, int i_572_,
		    int i_573_, int i_574_, int i_575_, int i_576_) {
	boolean bool = false;
	boolean bool_577_ = false;
	boolean bool_578_ = false;
	int i_579_ = -i_573_ / 2;
	int i_580_ = -i_574_ / 2;
	int i_581_
	    = class166.method3550(i + i_579_, i_572_ + i_580_, -241193043);
	int i_582_ = i_573_ / 2;
	int i_583_ = -i_574_ / 2;
	int i_584_
	    = class166.method3550(i + i_582_, i_572_ + i_583_, -1416415001);
	int i_585_ = -i_573_ / 2;
	int i_586_ = i_574_ / 2;
	int i_587_
	    = class166.method3550(i + i_585_, i_572_ + i_586_, -1871444241);
	int i_588_ = i_573_ / 2;
	int i_589_ = i_574_ / 2;
	int i_590_
	    = class166.method3550(i + i_588_, i_572_ + i_589_, 195227912);
	int i_591_ = i_581_ < i_584_ ? i_581_ : i_584_;
	int i_592_ = i_587_ < i_590_ ? i_587_ : i_590_;
	int i_593_ = i_584_ < i_590_ ? i_584_ : i_590_;
	int i_594_ = i_581_ < i_587_ ? i_581_ : i_587_;
	if (i_574_ != 0) {
	    int i_595_ = ((int) (Math.atan2((double) (i_591_ - i_592_),
					    (double) i_574_)
				 * 2607.5945876176133)
			  & 0x3fff);
	    if (i_595_ != 0) {
		if (i_575_ != 0) {
		    if (i_595_ > 8192) {
			int i_596_ = 16384 - i_575_;
			if (i_595_ < i_596_)
			    i_595_ = i_596_;
		    } else if (i_595_ > i_575_)
			i_595_ = i_575_;
		}
		method1870(i_595_);
	    }
	}
	if (i_573_ != 0) {
	    int i_597_ = ((int) (Math.atan2((double) (i_594_ - i_593_),
					    (double) i_573_)
				 * 2607.5945876176133)
			  & 0x3fff);
	    if (i_597_ != 0) {
		if (i_576_ != 0) {
		    if (i_597_ > 8192) {
			int i_598_ = 16384 - i_576_;
			if (i_597_ < i_598_)
			    i_597_ = i_598_;
		    } else if (i_597_ > i_576_)
			i_597_ = i_576_;
		}
		method1980(i_597_);
	    }
	}
	int i_599_ = i_581_ + i_590_;
	if (i_584_ + i_587_ < i_599_)
	    i_599_ = i_584_ + i_587_;
	i_599_ = (i_599_ >> 1) - i_571_;
	if (i_599_ != 0)
	    method1927(0, i_599_, 0);
    }
    
    void method2044(Class166 class166, int i, int i_600_, int i_601_,
		    int i_602_, int i_603_, int i_604_, int i_605_) {
	boolean bool = false;
	boolean bool_606_ = false;
	boolean bool_607_ = false;
	int i_608_ = -i_602_ / 2;
	int i_609_ = -i_603_ / 2;
	int i_610_
	    = class166.method3550(i + i_608_, i_601_ + i_609_, -409846058);
	int i_611_ = i_602_ / 2;
	int i_612_ = -i_603_ / 2;
	int i_613_
	    = class166.method3550(i + i_611_, i_601_ + i_612_, -1034316240);
	int i_614_ = -i_602_ / 2;
	int i_615_ = i_603_ / 2;
	int i_616_
	    = class166.method3550(i + i_614_, i_601_ + i_615_, -213084459);
	int i_617_ = i_602_ / 2;
	int i_618_ = i_603_ / 2;
	int i_619_
	    = class166.method3550(i + i_617_, i_601_ + i_618_, -1892276945);
	int i_620_ = i_610_ < i_613_ ? i_610_ : i_613_;
	int i_621_ = i_616_ < i_619_ ? i_616_ : i_619_;
	int i_622_ = i_613_ < i_619_ ? i_613_ : i_619_;
	int i_623_ = i_610_ < i_616_ ? i_610_ : i_616_;
	if (i_603_ != 0) {
	    int i_624_ = ((int) (Math.atan2((double) (i_620_ - i_621_),
					    (double) i_603_)
				 * 2607.5945876176133)
			  & 0x3fff);
	    if (i_624_ != 0) {
		if (i_604_ != 0) {
		    if (i_624_ > 8192) {
			int i_625_ = 16384 - i_604_;
			if (i_624_ < i_625_)
			    i_624_ = i_625_;
		    } else if (i_624_ > i_604_)
			i_624_ = i_604_;
		}
		method1870(i_624_);
	    }
	}
	if (i_602_ != 0) {
	    int i_626_ = ((int) (Math.atan2((double) (i_623_ - i_622_),
					    (double) i_602_)
				 * 2607.5945876176133)
			  & 0x3fff);
	    if (i_626_ != 0) {
		if (i_605_ != 0) {
		    if (i_626_ > 8192) {
			int i_627_ = 16384 - i_605_;
			if (i_626_ < i_627_)
			    i_626_ = i_627_;
		    } else if (i_626_ > i_605_)
			i_626_ = i_605_;
		}
		method1980(i_626_);
	    }
	}
	int i_628_ = i_610_ + i_619_;
	if (i_613_ + i_616_ < i_628_)
	    i_628_ = i_613_ + i_616_;
	i_628_ = (i_628_ >> 1) - i_600_;
	if (i_628_ != 0)
	    method1927(0, i_628_, 0);
    }
    
    public abstract void method2045(short i, short i_629_);
    
    public final void method2046
	(Class241_Sub39_Sub2 class241_sub39_sub2, int i,
	 Class241_Sub39_Sub2 class241_sub39_sub2_630_, int i_631_, int i_632_,
	 int i_633_, int i_634_, boolean bool) {
	if (i != -1) {
	    method1877();
	    if (!method1884())
		method1878();
	    else {
		Class87 class87 = (((Class241_Sub39_Sub2) class241_sub39_sub2)
				   .aClass87Array10825[i]);
		Class241_Sub42 class241_sub42
		    = ((Class87) class87).aClass241_Sub42_1273;
		Class87 class87_635_ = null;
		if (class241_sub39_sub2_630_ != null) {
		    class87_635_
			= (((Class241_Sub39_Sub2) class241_sub39_sub2_630_)
			   .aClass87Array10825[i_631_]);
		    if (((Class87) class87_635_).aClass241_Sub42_1273
			!= class241_sub42)
			class87_635_ = null;
		}
		method1882(class241_sub42, class87, class87_635_, i_632_,
			   i_633_, i_634_, null, false, bool, 65535, null);
		method1888();
		method1878();
	    }
	}
    }
    
    float[] method2047(int i, int i_636_, int i_637_, int i_638_, float f,
		       float f_639_, float f_640_) {
	float[] fs = new float[9];
	float[] fs_641_ = new float[9];
	float f_642_
	    = (float) Math.cos((double) ((float) i_638_ * 0.024543693F));
	float f_643_
	    = (float) Math.sin((double) ((float) i_638_ * 0.024543693F));
	float f_644_ = 1.0F - f_642_;
	fs[0] = f_642_;
	fs[1] = 0.0F;
	fs[2] = f_643_;
	fs[3] = 0.0F;
	fs[4] = 1.0F;
	fs[5] = 0.0F;
	fs[6] = -f_643_;
	fs[7] = 0.0F;
	fs[8] = f_642_;
	float[] fs_645_ = new float[9];
	float f_646_ = 1.0F;
	float f_647_ = 0.0F;
	f_642_ = (float) i_636_ / 32767.0F;
	f_643_ = -(float) Math.sqrt((double) (1.0F - f_642_ * f_642_));
	f_644_ = 1.0F - f_642_;
	float f_648_ = (float) Math.sqrt((double) (i * i + i_637_ * i_637_));
	if (f_648_ == 0.0F && f_642_ == 0.0F)
	    fs_641_ = fs;
	else {
	    if (f_648_ != 0.0F) {
		f_646_ = (float) -i_637_ / f_648_;
		f_647_ = (float) i / f_648_;
	    }
	    fs_645_[0] = f_642_ + f_646_ * f_646_ * f_644_;
	    fs_645_[1] = f_647_ * f_643_;
	    fs_645_[2] = f_647_ * f_646_ * f_644_;
	    fs_645_[3] = -f_647_ * f_643_;
	    fs_645_[4] = f_642_;
	    fs_645_[5] = f_646_ * f_643_;
	    fs_645_[6] = f_646_ * f_647_ * f_644_;
	    fs_645_[7] = -f_646_ * f_643_;
	    fs_645_[8] = f_642_ + f_647_ * f_647_ * f_644_;
	    fs_641_[0]
		= fs[0] * fs_645_[0] + fs[1] * fs_645_[3] + fs[2] * fs_645_[6];
	    fs_641_[1]
		= fs[0] * fs_645_[1] + fs[1] * fs_645_[4] + fs[2] * fs_645_[7];
	    fs_641_[2]
		= fs[0] * fs_645_[2] + fs[1] * fs_645_[5] + fs[2] * fs_645_[8];
	    fs_641_[3]
		= fs[3] * fs_645_[0] + fs[4] * fs_645_[3] + fs[5] * fs_645_[6];
	    fs_641_[4]
		= fs[3] * fs_645_[1] + fs[4] * fs_645_[4] + fs[5] * fs_645_[7];
	    fs_641_[5]
		= fs[3] * fs_645_[2] + fs[4] * fs_645_[5] + fs[5] * fs_645_[8];
	    fs_641_[6]
		= fs[6] * fs_645_[0] + fs[7] * fs_645_[3] + fs[8] * fs_645_[6];
	    fs_641_[7]
		= fs[6] * fs_645_[1] + fs[7] * fs_645_[4] + fs[8] * fs_645_[7];
	    fs_641_[8]
		= fs[6] * fs_645_[2] + fs[7] * fs_645_[5] + fs[8] * fs_645_[8];
	}
	fs_641_[0] *= f;
	fs_641_[1] *= f;
	fs_641_[2] *= f;
	fs_641_[3] *= f_639_;
	fs_641_[4] *= f_639_;
	fs_641_[5] *= f_639_;
	fs_641_[6] *= f_640_;
	fs_641_[7] *= f_640_;
	fs_641_[8] *= f_640_;
	return fs_641_;
    }
    
    public final void method2048
	(Class241_Sub39_Sub2 class241_sub39_sub2, int i,
	 Class241_Sub39_Sub2 class241_sub39_sub2_649_, int i_650_, int i_651_,
	 int i_652_, int i_653_, int i_654_, boolean bool, int[] is) {
	if (i != -1) {
	    method1877();
	    if (!method1884())
		method1878();
	    else {
		Class87 class87 = (((Class241_Sub39_Sub2) class241_sub39_sub2)
				   .aClass87Array10825[i]);
		Class241_Sub42 class241_sub42
		    = ((Class87) class87).aClass241_Sub42_1273;
		Class87 class87_655_ = null;
		if (class241_sub39_sub2_649_ != null) {
		    class87_655_
			= (((Class241_Sub39_Sub2) class241_sub39_sub2_649_)
			   .aClass87Array10825[i_650_]);
		    if (((Class87) class87_655_).aClass241_Sub42_1273
			!= class241_sub42)
			class87_655_ = null;
		}
		method1882(class241_sub42, class87, class87_655_, i_651_,
			   i_652_, i_653_, null, false, bool, i_654_, is);
		method1888();
		method1878();
	    }
	}
    }
    
    public final void method2049
	(Class241_Sub39_Sub2 class241_sub39_sub2, int i,
	 Class241_Sub39_Sub2 class241_sub39_sub2_656_, int i_657_, int i_658_,
	 int i_659_, int i_660_, int i_661_, boolean bool, int[] is) {
	if (i != -1) {
	    method1877();
	    if (!method1884())
		method1878();
	    else {
		Class87 class87 = (((Class241_Sub39_Sub2) class241_sub39_sub2)
				   .aClass87Array10825[i]);
		Class241_Sub42 class241_sub42
		    = ((Class87) class87).aClass241_Sub42_1273;
		Class87 class87_662_ = null;
		if (class241_sub39_sub2_656_ != null) {
		    class87_662_
			= (((Class241_Sub39_Sub2) class241_sub39_sub2_656_)
			   .aClass87Array10825[i_657_]);
		    if (((Class87) class87_662_).aClass241_Sub42_1273
			!= class241_sub42)
			class87_662_ = null;
		}
		method1882(class241_sub42, class87, class87_662_, i_658_,
			   i_659_, i_660_, null, false, bool, i_661_, is);
		method1888();
		method1878();
	    }
	}
    }
    
    public final void method2050
	(Class241_Sub39_Sub2 class241_sub39_sub2, int i,
	 Class241_Sub39_Sub2 class241_sub39_sub2_663_, int i_664_, int i_665_,
	 int i_666_, Class241_Sub39_Sub2 class241_sub39_sub2_667_, int i_668_,
	 Class241_Sub39_Sub2 class241_sub39_sub2_669_, int i_670_, int i_671_,
	 int i_672_, boolean[] bools, boolean bool) {
	if (i != -1) {
	    if (bools == null || i_668_ == -1)
		method1879(class241_sub39_sub2, i, class241_sub39_sub2_663_,
			   i_664_, i_665_, i_666_, 0, bool);
	    else {
		method1877();
		if (!method1884())
		    method1878();
		else {
		    Class87 class87
			= (((Class241_Sub39_Sub2) class241_sub39_sub2)
			   .aClass87Array10825[i]);
		    Class241_Sub42 class241_sub42
			= ((Class87) class87).aClass241_Sub42_1273;
		    Class87 class87_673_ = null;
		    if (class241_sub39_sub2_663_ != null) {
			class87_673_
			    = (((Class241_Sub39_Sub2) class241_sub39_sub2_663_)
			       .aClass87Array10825[i_664_]);
			if (((Class87) class87_673_).aClass241_Sub42_1273
			    != class241_sub42)
			    class87_673_ = null;
		    }
		    method1882(class241_sub42, class87, class87_673_, i_665_,
			       i_666_, 0, bools, false, bool, 65535, null);
		    Class87 class87_674_
			= (((Class241_Sub39_Sub2) class241_sub39_sub2_667_)
			   .aClass87Array10825[i_668_]);
		    Class87 class87_675_ = null;
		    if (class241_sub39_sub2_669_ != null) {
			class87_675_
			    = (((Class241_Sub39_Sub2) class241_sub39_sub2_669_)
			       .aClass87Array10825[i_670_]);
			if (((Class87) class87_675_).aClass241_Sub42_1273
			    != class241_sub42)
			    class87_675_ = null;
		    }
		    method2002(0, new int[0], 0, 0, 0, 0, bool);
		    method1882(((Class87) class87_674_).aClass241_Sub42_1273,
			       class87_674_, class87_675_, i_671_, i_672_, 0,
			       bools, true, bool, 65535, null);
		    method1888();
		    method1878();
		}
	    }
	}
    }
    
    public abstract Class106[] method2051();
    
    public abstract boolean method2052();
    
    public final void method2053(Class241_Sub39_Sub2 class241_sub39_sub2,
				 int i) {
	if (i != -1) {
	    method1877();
	    if (!method1884())
		method1878();
	    else {
		Class87 class87 = (((Class241_Sub39_Sub2) class241_sub39_sub2)
				   .aClass87Array10825[i]);
		Class241_Sub42 class241_sub42
		    = ((Class87) class87).aClass241_Sub42_1273;
		for (int i_676_ = 0; i_676_ < ((Class87) class87).anInt1259;
		     i_676_++) {
		    short i_677_ = ((Class87) class87).aShortArray1266[i_676_];
		    if (((Class241_Sub42) class241_sub42).aBoolArray10173
			[i_677_]) {
			if (((Class87) class87).aShortArray1265[i_676_] != -1)
			    method1887(0, 0, 0, 0);
			method1887((((Class241_Sub42) class241_sub42)
				    .anIntArray10171[i_677_]),
				   ((Class87) class87).aShortArray1268[i_676_],
				   ((Class87) class87).aShortArray1267[i_676_],
				   (((Class87) class87).aShortArray1269
				    [i_676_]));
		    }
		}
		method1888();
		method1878();
	    }
	}
    }
    
    public abstract byte[] method2054();
    
    void method2055(Class241_Sub42 class241_sub42, Class87 class87,
		    Class87 class87_678_, int i, int i_679_, int i_680_,
		    boolean[] bools, boolean bool, boolean bool_681_,
		    int i_682_, int[] is) {
	if (class87_678_ == null || i == 0) {
	    for (int i_683_ = 0; i_683_ < ((Class87) class87).anInt1259;
		 i_683_++) {
		short i_684_ = ((Class87) class87).aShortArray1266[i_683_];
		if (bools == null || bools[i_684_] == bool
		    || (((Class241_Sub42) class241_sub42).anIntArray10171
			[i_684_]) == 0) {
		    short i_685_ = ((Class87) class87).aShortArray1265[i_683_];
		    if (i_685_ != -1)
			method1883(0,
				   (((Class241_Sub42) class241_sub42)
				    .anIntArrayArray10172[i_685_]),
				   0, 0, 0, i_680_, bool_681_,
				   i_682_ & (((Class241_Sub42) class241_sub42)
					     .anIntArray10174[i_685_]),
				   is);
		    method1883((((Class241_Sub42) class241_sub42)
				.anIntArray10171[i_684_]),
			       (((Class241_Sub42) class241_sub42)
				.anIntArrayArray10172[i_684_]),
			       ((Class87) class87).aShortArray1268[i_683_],
			       ((Class87) class87).aShortArray1267[i_683_],
			       ((Class87) class87).aShortArray1269[i_683_],
			       i_680_, bool_681_,
			       i_682_ & (((Class241_Sub42) class241_sub42)
					 .anIntArray10174[i_684_]),
			       is);
		}
	    }
	} else {
	    int i_686_ = 0;
	    int i_687_ = 0;
	    for (int i_688_ = 0;
		 (i_688_
		  < ((Class241_Sub42) class241_sub42).anInt10162 * 1333411391);
		 i_688_++) {
		boolean bool_689_ = false;
		if (i_686_ < ((Class87) class87).anInt1259
		    && ((Class87) class87).aShortArray1266[i_686_] == i_688_)
		    bool_689_ = true;
		boolean bool_690_ = false;
		if (i_687_ < ((Class87) class87_678_).anInt1259
		    && (((Class87) class87_678_).aShortArray1266[i_687_]
			== i_688_))
		    bool_690_ = true;
		if (bool_689_ || bool_690_) {
		    if (bools != null && bools[i_688_] != bool
			&& (((Class241_Sub42) class241_sub42).anIntArray10171
			    [i_688_]) != 0) {
			if (bool_689_)
			    i_686_++;
			if (bool_690_)
			    i_687_++;
		    } else {
			int i_691_ = 0;
			int i_692_ = (((Class241_Sub42) class241_sub42)
				      .anIntArray10171[i_688_]);
			if (i_692_ == 3 || i_692_ == 10)
			    i_691_ = 128;
			int i_693_;
			int i_694_;
			int i_695_;
			short i_696_;
			byte i_697_;
			if (bool_689_) {
			    i_693_
				= ((Class87) class87).aShortArray1268[i_686_];
			    i_694_
				= ((Class87) class87).aShortArray1267[i_686_];
			    i_695_
				= ((Class87) class87).aShortArray1269[i_686_];
			    i_696_
				= ((Class87) class87).aShortArray1265[i_686_];
			    i_697_
				= ((Class87) class87).aByteArray1272[i_686_];
			    i_686_++;
			} else {
			    i_693_ = i_691_;
			    i_694_ = i_691_;
			    i_695_ = i_691_;
			    i_696_ = (short) -1;
			    i_697_ = (byte) 0;
			}
			int i_698_;
			int i_699_;
			int i_700_;
			short i_701_;
			byte i_702_;
			if (bool_690_) {
			    i_698_ = (((Class87) class87_678_).aShortArray1268
				      [i_687_]);
			    i_699_ = (((Class87) class87_678_).aShortArray1267
				      [i_687_]);
			    i_700_ = (((Class87) class87_678_).aShortArray1269
				      [i_687_]);
			    i_701_ = (((Class87) class87_678_).aShortArray1265
				      [i_687_]);
			    i_702_ = (((Class87) class87_678_).aByteArray1272
				      [i_687_]);
			    i_687_++;
			} else {
			    i_698_ = i_691_;
			    i_699_ = i_691_;
			    i_700_ = i_691_;
			    i_701_ = (short) -1;
			    i_702_ = (byte) 0;
			}
			int i_703_;
			int i_704_;
			int i_705_;
			if ((i_697_ & 0x2) != 0 || (i_702_ & 0x1) != 0) {
			    i_703_ = i_693_;
			    i_704_ = i_694_;
			    i_705_ = i_695_;
			} else if (i_692_ == 2) {
			    int i_706_ = i_698_ - i_693_ & 0x3fff;
			    int i_707_ = i_699_ - i_694_ & 0x3fff;
			    int i_708_ = i_700_ - i_695_ & 0x3fff;
			    if (i_706_ >= 8192)
				i_706_ -= 16384;
			    if (i_707_ >= 8192)
				i_707_ -= 16384;
			    if (i_708_ >= 8192)
				i_708_ -= 16384;
			    i_703_ = i_693_ + i_706_ * i / i_679_ & 0x3fff;
			    i_704_ = i_694_ + i_707_ * i / i_679_ & 0x3fff;
			    i_705_ = i_695_ + i_708_ * i / i_679_ & 0x3fff;
			} else if (i_692_ == 9) {
			    int i_709_ = i_698_ - i_693_ & 0x3fff;
			    if (i_709_ >= 8192)
				i_709_ -= 16384;
			    i_703_ = i_693_ + i_709_ * i / i_679_ & 0x3fff;
			    i_705_ = 0;
			    i_704_ = 0;
			} else if (i_692_ == 7) {
			    int i_710_ = i_698_ - i_693_ & 0x3f;
			    if (i_710_ >= 32)
				i_710_ -= 64;
			    i_703_ = i_693_ + i_710_ * i / i_679_ & 0x3f;
			    i_704_ = i_694_ + (i_699_ - i_694_) * i / i_679_;
			    i_705_ = i_695_ + (i_700_ - i_695_) * i / i_679_;
			} else {
			    i_703_ = i_693_ + (i_698_ - i_693_) * i / i_679_;
			    i_704_ = i_694_ + (i_699_ - i_694_) * i / i_679_;
			    i_705_ = i_695_ + (i_700_ - i_695_) * i / i_679_;
			}
			if (i_696_ != -1)
			    method1883(0,
				       (((Class241_Sub42) class241_sub42)
					.anIntArrayArray10172[i_696_]),
				       0, 0, 0, i_680_, bool_681_,
				       (i_682_
					& (((Class241_Sub42) class241_sub42)
					   .anIntArray10174[i_696_])),
				       is);
			else if (i_701_ != -1)
			    method1883(0,
				       (((Class241_Sub42) class241_sub42)
					.anIntArrayArray10172[i_701_]),
				       0, 0, 0, i_680_, bool_681_,
				       (i_682_
					& (((Class241_Sub42) class241_sub42)
					   .anIntArray10174[i_701_])),
				       is);
			method1883(i_692_,
				   (((Class241_Sub42) class241_sub42)
				    .anIntArrayArray10172[i_688_]),
				   i_703_, i_704_, i_705_, i_680_, bool_681_,
				   i_682_ & (((Class241_Sub42) class241_sub42)
					     .anIntArray10174[i_688_]),
				   is);
		    }
		}
	    }
	}
    }
    
    void method2056(int i, int[] is, int i_711_, int i_712_, int i_713_,
		    int i_714_, boolean bool, int i_715_, int[] is_716_) {
	if (i_714_ == 1) {
	    if (i == 0 || i == 1) {
		int i_717_ = -i_711_;
		i_711_ = i_713_;
		i_713_ = i_717_;
	    } else if (i == 3) {
		int i_718_ = i_711_;
		i_711_ = i_713_;
		i_713_ = i_718_;
	    } else if (i == 2) {
		int i_719_ = i_711_;
		i_711_ = -i_713_ & 0x3fff;
		i_713_ = i_719_ & 0x3fff;
	    }
	} else if (i_714_ == 2) {
	    if (i == 0 || i == 1) {
		i_711_ = -i_711_;
		i_713_ = -i_713_;
	    } else if (i == 2) {
		i_711_ = -i_711_ & 0x3fff;
		i_713_ = -i_713_ & 0x3fff;
	    }
	} else if (i_714_ == 3) {
	    if (i == 0 || i == 1) {
		int i_720_ = i_711_;
		i_711_ = -i_713_;
		i_713_ = i_720_;
	    } else if (i == 3) {
		int i_721_ = i_711_;
		i_711_ = i_713_;
		i_713_ = i_721_;
	    } else if (i == 2) {
		int i_722_ = i_711_;
		i_711_ = i_713_ & 0x3fff;
		i_713_ = -i_722_ & 0x3fff;
	    }
	}
	if (i_715_ != 65535)
	    method1872(i, is, i_711_, i_712_, i_713_, bool, i_715_, is_716_);
	else
	    method2002(i, is, i_711_, i_712_, i_713_, i_714_, bool);
    }
    
    public abstract void method2057(int i);
    
    void method2058(int i, int[] is, int i_723_, int i_724_, int i_725_,
		    int i_726_, boolean bool, int i_727_, int[] is_728_) {
	if (i_726_ == 1) {
	    if (i == 0 || i == 1) {
		int i_729_ = -i_723_;
		i_723_ = i_725_;
		i_725_ = i_729_;
	    } else if (i == 3) {
		int i_730_ = i_723_;
		i_723_ = i_725_;
		i_725_ = i_730_;
	    } else if (i == 2) {
		int i_731_ = i_723_;
		i_723_ = -i_725_ & 0x3fff;
		i_725_ = i_731_ & 0x3fff;
	    }
	} else if (i_726_ == 2) {
	    if (i == 0 || i == 1) {
		i_723_ = -i_723_;
		i_725_ = -i_725_;
	    } else if (i == 2) {
		i_723_ = -i_723_ & 0x3fff;
		i_725_ = -i_725_ & 0x3fff;
	    }
	} else if (i_726_ == 3) {
	    if (i == 0 || i == 1) {
		int i_732_ = i_723_;
		i_723_ = -i_725_;
		i_725_ = i_732_;
	    } else if (i == 3) {
		int i_733_ = i_723_;
		i_723_ = i_725_;
		i_725_ = i_733_;
	    } else if (i == 2) {
		int i_734_ = i_723_;
		i_723_ = i_725_ & 0x3fff;
		i_725_ = -i_734_ & 0x3fff;
	    }
	}
	if (i_727_ != 65535)
	    method1872(i, is, i_723_, i_724_, i_725_, bool, i_727_, is_728_);
	else
	    method2002(i, is, i_723_, i_724_, i_725_, i_726_, bool);
    }
}
