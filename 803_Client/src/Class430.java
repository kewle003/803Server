/* Class430 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class430
{
    static void method7699(char[] cs, int i, char[] cs_0_, int i_1_,
			   int i_2_) {
	if (cs == cs_0_) {
	    if (i == i_1_)
		return;
	    if (i_1_ > i && i_1_ < i + i_2_) {
		i_2_--;
		i += i_2_;
		i_1_ += i_2_;
		i_2_ = i - i_2_;
		i_2_ += 7;
		while (i >= i_2_) {
		    cs_0_[i_1_--] = cs[i--];
		    cs_0_[i_1_--] = cs[i--];
		    cs_0_[i_1_--] = cs[i--];
		    cs_0_[i_1_--] = cs[i--];
		    cs_0_[i_1_--] = cs[i--];
		    cs_0_[i_1_--] = cs[i--];
		    cs_0_[i_1_--] = cs[i--];
		    cs_0_[i_1_--] = cs[i--];
		}
		i_2_ -= 7;
		while (i >= i_2_)
		    cs_0_[i_1_--] = cs[i--];
		return;
	    }
	}
	i_2_ += i;
	i_2_ -= 7;
	while (i < i_2_) {
	    cs_0_[i_1_++] = cs[i++];
	    cs_0_[i_1_++] = cs[i++];
	    cs_0_[i_1_++] = cs[i++];
	    cs_0_[i_1_++] = cs[i++];
	    cs_0_[i_1_++] = cs[i++];
	    cs_0_[i_1_++] = cs[i++];
	    cs_0_[i_1_++] = cs[i++];
	    cs_0_[i_1_++] = cs[i++];
	}
	i_2_ += 7;
	while (i < i_2_)
	    cs_0_[i_1_++] = cs[i++];
    }
    
    static void method7700(long[] ls, int i, long[] ls_3_, int i_4_,
			   int i_5_) {
	if (ls == ls_3_) {
	    if (i == i_4_)
		return;
	    if (i_4_ > i && i_4_ < i + i_5_) {
		i_5_--;
		i += i_5_;
		i_4_ += i_5_;
		i_5_ = i - i_5_;
		i_5_ += 3;
		while (i >= i_5_) {
		    ls_3_[i_4_--] = ls[i--];
		    ls_3_[i_4_--] = ls[i--];
		    ls_3_[i_4_--] = ls[i--];
		    ls_3_[i_4_--] = ls[i--];
		}
		i_5_ -= 3;
		while (i >= i_5_)
		    ls_3_[i_4_--] = ls[i--];
		return;
	    }
	}
	i_5_ += i;
	i_5_ -= 3;
	while (i < i_5_) {
	    ls_3_[i_4_++] = ls[i++];
	    ls_3_[i_4_++] = ls[i++];
	    ls_3_[i_4_++] = ls[i++];
	    ls_3_[i_4_++] = ls[i++];
	}
	i_5_ += 3;
	while (i < i_5_)
	    ls_3_[i_4_++] = ls[i++];
    }
    
    static void method7701(byte[] is, int i, byte[] is_6_, int i_7_,
			   int i_8_) {
	if (is == is_6_) {
	    if (i == i_7_)
		return;
	    if (i_7_ > i && i_7_ < i + i_8_) {
		i_8_--;
		i += i_8_;
		i_7_ += i_8_;
		i_8_ = i - i_8_;
		i_8_ += 7;
		while (i >= i_8_) {
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		}
		i_8_ -= 7;
		while (i >= i_8_)
		    is_6_[i_7_--] = is[i--];
		return;
	    }
	}
	i_8_ += i;
	i_8_ -= 7;
	while (i < i_8_) {
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	}
	i_8_ += 7;
	while (i < i_8_)
	    is_6_[i_7_++] = is[i++];
    }
    
    public static void method7702(int[] is, int i, int i_9_, int i_10_) {
	i_9_ = i + i_9_ - 7;
	while (i < i_9_) {
	    is[i++] = i_10_;
	    is[i++] = i_10_;
	    is[i++] = i_10_;
	    is[i++] = i_10_;
	    is[i++] = i_10_;
	    is[i++] = i_10_;
	    is[i++] = i_10_;
	    is[i++] = i_10_;
	}
	i_9_ += 7;
	while (i < i_9_)
	    is[i++] = i_10_;
    }
    
    public static void method7703(int[] is, int i, int[] is_11_, int i_12_,
				  int i_13_) {
	if (is == is_11_) {
	    if (i == i_12_)
		return;
	    if (i_12_ > i && i_12_ < i + i_13_) {
		i_13_--;
		i += i_13_;
		i_12_ += i_13_;
		i_13_ = i - i_13_;
		i_13_ += 7;
		while (i >= i_13_) {
		    is_11_[i_12_--] = is[i--];
		    is_11_[i_12_--] = is[i--];
		    is_11_[i_12_--] = is[i--];
		    is_11_[i_12_--] = is[i--];
		    is_11_[i_12_--] = is[i--];
		    is_11_[i_12_--] = is[i--];
		    is_11_[i_12_--] = is[i--];
		    is_11_[i_12_--] = is[i--];
		}
		i_13_ -= 7;
		while (i >= i_13_)
		    is_11_[i_12_--] = is[i--];
		return;
	    }
	}
	i_13_ += i;
	i_13_ -= 7;
	while (i < i_13_) {
	    is_11_[i_12_++] = is[i++];
	    is_11_[i_12_++] = is[i++];
	    is_11_[i_12_++] = is[i++];
	    is_11_[i_12_++] = is[i++];
	    is_11_[i_12_++] = is[i++];
	    is_11_[i_12_++] = is[i++];
	    is_11_[i_12_++] = is[i++];
	    is_11_[i_12_++] = is[i++];
	}
	i_13_ += 7;
	while (i < i_13_)
	    is_11_[i_12_++] = is[i++];
    }
    
    static void method7704(long[] ls, int i, long[] ls_14_, int i_15_,
			   int i_16_) {
	if (ls == ls_14_) {
	    if (i == i_15_)
		return;
	    if (i_15_ > i && i_15_ < i + i_16_) {
		i_16_--;
		i += i_16_;
		i_15_ += i_16_;
		i_16_ = i - i_16_;
		i_16_ += 3;
		while (i >= i_16_) {
		    ls_14_[i_15_--] = ls[i--];
		    ls_14_[i_15_--] = ls[i--];
		    ls_14_[i_15_--] = ls[i--];
		    ls_14_[i_15_--] = ls[i--];
		}
		i_16_ -= 3;
		while (i >= i_16_)
		    ls_14_[i_15_--] = ls[i--];
		return;
	    }
	}
	i_16_ += i;
	i_16_ -= 3;
	while (i < i_16_) {
	    ls_14_[i_15_++] = ls[i++];
	    ls_14_[i_15_++] = ls[i++];
	    ls_14_[i_15_++] = ls[i++];
	    ls_14_[i_15_++] = ls[i++];
	}
	i_16_ += 3;
	while (i < i_16_)
	    ls_14_[i_15_++] = ls[i++];
    }
    
    Class430() throws Throwable {
	throw new Error();
    }
    
    static void method7705(char[] cs, int i, char[] cs_17_, int i_18_,
			   int i_19_) {
	if (cs == cs_17_) {
	    if (i == i_18_)
		return;
	    if (i_18_ > i && i_18_ < i + i_19_) {
		i_19_--;
		i += i_19_;
		i_18_ += i_19_;
		i_19_ = i - i_19_;
		i_19_ += 7;
		while (i >= i_19_) {
		    cs_17_[i_18_--] = cs[i--];
		    cs_17_[i_18_--] = cs[i--];
		    cs_17_[i_18_--] = cs[i--];
		    cs_17_[i_18_--] = cs[i--];
		    cs_17_[i_18_--] = cs[i--];
		    cs_17_[i_18_--] = cs[i--];
		    cs_17_[i_18_--] = cs[i--];
		    cs_17_[i_18_--] = cs[i--];
		}
		i_19_ -= 7;
		while (i >= i_19_)
		    cs_17_[i_18_--] = cs[i--];
		return;
	    }
	}
	i_19_ += i;
	i_19_ -= 7;
	while (i < i_19_) {
	    cs_17_[i_18_++] = cs[i++];
	    cs_17_[i_18_++] = cs[i++];
	    cs_17_[i_18_++] = cs[i++];
	    cs_17_[i_18_++] = cs[i++];
	    cs_17_[i_18_++] = cs[i++];
	    cs_17_[i_18_++] = cs[i++];
	    cs_17_[i_18_++] = cs[i++];
	    cs_17_[i_18_++] = cs[i++];
	}
	i_19_ += 7;
	while (i < i_19_)
	    cs_17_[i_18_++] = cs[i++];
    }
    
    public static void method7706(float[] fs, int i, float[] fs_20_, int i_21_,
				  int i_22_) {
	if (fs == fs_20_) {
	    if (i == i_21_)
		return;
	    if (i_21_ > i && i_21_ < i + i_22_) {
		i_22_--;
		i += i_22_;
		i_21_ += i_22_;
		i_22_ = i - i_22_;
		i_22_ += 7;
		while (i >= i_22_) {
		    fs_20_[i_21_--] = fs[i--];
		    fs_20_[i_21_--] = fs[i--];
		    fs_20_[i_21_--] = fs[i--];
		    fs_20_[i_21_--] = fs[i--];
		    fs_20_[i_21_--] = fs[i--];
		    fs_20_[i_21_--] = fs[i--];
		    fs_20_[i_21_--] = fs[i--];
		    fs_20_[i_21_--] = fs[i--];
		}
		i_22_ -= 7;
		while (i >= i_22_)
		    fs_20_[i_21_--] = fs[i--];
		return;
	    }
	}
	i_22_ += i;
	i_22_ -= 7;
	while (i < i_22_) {
	    fs_20_[i_21_++] = fs[i++];
	    fs_20_[i_21_++] = fs[i++];
	    fs_20_[i_21_++] = fs[i++];
	    fs_20_[i_21_++] = fs[i++];
	    fs_20_[i_21_++] = fs[i++];
	    fs_20_[i_21_++] = fs[i++];
	    fs_20_[i_21_++] = fs[i++];
	    fs_20_[i_21_++] = fs[i++];
	}
	i_22_ += 7;
	while (i < i_22_)
	    fs_20_[i_21_++] = fs[i++];
    }
    
    public static void method7707(Object[] objects, int i,
				  Object[] objects_23_, int i_24_, int i_25_) {
	if (objects == objects_23_) {
	    if (i == i_24_)
		return;
	    if (i_24_ > i && i_24_ < i + i_25_) {
		i_25_--;
		i += i_25_;
		i_24_ += i_25_;
		i_25_ = i - i_25_;
		i_25_ += 7;
		while (i >= i_25_) {
		    objects_23_[i_24_--] = objects[i--];
		    objects_23_[i_24_--] = objects[i--];
		    objects_23_[i_24_--] = objects[i--];
		    objects_23_[i_24_--] = objects[i--];
		    objects_23_[i_24_--] = objects[i--];
		    objects_23_[i_24_--] = objects[i--];
		    objects_23_[i_24_--] = objects[i--];
		    objects_23_[i_24_--] = objects[i--];
		}
		i_25_ -= 7;
		while (i >= i_25_)
		    objects_23_[i_24_--] = objects[i--];
		return;
	    }
	}
	i_25_ += i;
	i_25_ -= 7;
	while (i < i_25_) {
	    objects_23_[i_24_++] = objects[i++];
	    objects_23_[i_24_++] = objects[i++];
	    objects_23_[i_24_++] = objects[i++];
	    objects_23_[i_24_++] = objects[i++];
	    objects_23_[i_24_++] = objects[i++];
	    objects_23_[i_24_++] = objects[i++];
	    objects_23_[i_24_++] = objects[i++];
	    objects_23_[i_24_++] = objects[i++];
	}
	i_25_ += 7;
	while (i < i_25_)
	    objects_23_[i_24_++] = objects[i++];
    }
    
    static void method7708(char[] cs, int i, char[] cs_26_, int i_27_,
			   int i_28_) {
	if (cs == cs_26_) {
	    if (i == i_27_)
		return;
	    if (i_27_ > i && i_27_ < i + i_28_) {
		i_28_--;
		i += i_28_;
		i_27_ += i_28_;
		i_28_ = i - i_28_;
		i_28_ += 7;
		while (i >= i_28_) {
		    cs_26_[i_27_--] = cs[i--];
		    cs_26_[i_27_--] = cs[i--];
		    cs_26_[i_27_--] = cs[i--];
		    cs_26_[i_27_--] = cs[i--];
		    cs_26_[i_27_--] = cs[i--];
		    cs_26_[i_27_--] = cs[i--];
		    cs_26_[i_27_--] = cs[i--];
		    cs_26_[i_27_--] = cs[i--];
		}
		i_28_ -= 7;
		while (i >= i_28_)
		    cs_26_[i_27_--] = cs[i--];
		return;
	    }
	}
	i_28_ += i;
	i_28_ -= 7;
	while (i < i_28_) {
	    cs_26_[i_27_++] = cs[i++];
	    cs_26_[i_27_++] = cs[i++];
	    cs_26_[i_27_++] = cs[i++];
	    cs_26_[i_27_++] = cs[i++];
	    cs_26_[i_27_++] = cs[i++];
	    cs_26_[i_27_++] = cs[i++];
	    cs_26_[i_27_++] = cs[i++];
	    cs_26_[i_27_++] = cs[i++];
	}
	i_28_ += 7;
	while (i < i_28_)
	    cs_26_[i_27_++] = cs[i++];
    }
    
    static void method7709(long[] ls, int i, long[] ls_29_, int i_30_,
			   int i_31_) {
	if (ls == ls_29_) {
	    if (i == i_30_)
		return;
	    if (i_30_ > i && i_30_ < i + i_31_) {
		i_31_--;
		i += i_31_;
		i_30_ += i_31_;
		i_31_ = i - i_31_;
		i_31_ += 3;
		while (i >= i_31_) {
		    ls_29_[i_30_--] = ls[i--];
		    ls_29_[i_30_--] = ls[i--];
		    ls_29_[i_30_--] = ls[i--];
		    ls_29_[i_30_--] = ls[i--];
		}
		i_31_ -= 3;
		while (i >= i_31_)
		    ls_29_[i_30_--] = ls[i--];
		return;
	    }
	}
	i_31_ += i;
	i_31_ -= 3;
	while (i < i_31_) {
	    ls_29_[i_30_++] = ls[i++];
	    ls_29_[i_30_++] = ls[i++];
	    ls_29_[i_30_++] = ls[i++];
	    ls_29_[i_30_++] = ls[i++];
	}
	i_31_ += 3;
	while (i < i_31_)
	    ls_29_[i_30_++] = ls[i++];
    }
    
    static void method7710(short[] is, int i, short[] is_32_, int i_33_,
			   int i_34_) {
	if (is == is_32_) {
	    if (i == i_33_)
		return;
	    if (i_33_ > i && i_33_ < i + i_34_) {
		i_34_--;
		i += i_34_;
		i_33_ += i_34_;
		i_34_ = i - i_34_;
		i_34_ += 7;
		while (i >= i_34_) {
		    is_32_[i_33_--] = is[i--];
		    is_32_[i_33_--] = is[i--];
		    is_32_[i_33_--] = is[i--];
		    is_32_[i_33_--] = is[i--];
		    is_32_[i_33_--] = is[i--];
		    is_32_[i_33_--] = is[i--];
		    is_32_[i_33_--] = is[i--];
		    is_32_[i_33_--] = is[i--];
		}
		i_34_ -= 7;
		while (i >= i_34_)
		    is_32_[i_33_--] = is[i--];
		return;
	    }
	}
	i_34_ += i;
	i_34_ -= 7;
	while (i < i_34_) {
	    is_32_[i_33_++] = is[i++];
	    is_32_[i_33_++] = is[i++];
	    is_32_[i_33_++] = is[i++];
	    is_32_[i_33_++] = is[i++];
	    is_32_[i_33_++] = is[i++];
	    is_32_[i_33_++] = is[i++];
	    is_32_[i_33_++] = is[i++];
	    is_32_[i_33_++] = is[i++];
	}
	i_34_ += 7;
	while (i < i_34_)
	    is_32_[i_33_++] = is[i++];
    }
    
    static void method7711(short[] is, int i, short[] is_35_, int i_36_,
			   int i_37_) {
	if (is == is_35_) {
	    if (i == i_36_)
		return;
	    if (i_36_ > i && i_36_ < i + i_37_) {
		i_37_--;
		i += i_37_;
		i_36_ += i_37_;
		i_37_ = i - i_37_;
		i_37_ += 7;
		while (i >= i_37_) {
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		}
		i_37_ -= 7;
		while (i >= i_37_)
		    is_35_[i_36_--] = is[i--];
		return;
	    }
	}
	i_37_ += i;
	i_37_ -= 7;
	while (i < i_37_) {
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	}
	i_37_ += 7;
	while (i < i_37_)
	    is_35_[i_36_++] = is[i++];
    }
    
    static void method7712(short[] is, int i, short[] is_38_, int i_39_,
			   int i_40_) {
	if (is == is_38_) {
	    if (i == i_39_)
		return;
	    if (i_39_ > i && i_39_ < i + i_40_) {
		i_40_--;
		i += i_40_;
		i_39_ += i_40_;
		i_40_ = i - i_40_;
		i_40_ += 7;
		while (i >= i_40_) {
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		}
		i_40_ -= 7;
		while (i >= i_40_)
		    is_38_[i_39_--] = is[i--];
		return;
	    }
	}
	i_40_ += i;
	i_40_ -= 7;
	while (i < i_40_) {
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	}
	i_40_ += 7;
	while (i < i_40_)
	    is_38_[i_39_++] = is[i++];
    }
    
    static void method7713(short[] is, int i, short[] is_41_, int i_42_,
			   int i_43_) {
	if (is == is_41_) {
	    if (i == i_42_)
		return;
	    if (i_42_ > i && i_42_ < i + i_43_) {
		i_43_--;
		i += i_43_;
		i_42_ += i_43_;
		i_43_ = i - i_43_;
		i_43_ += 7;
		while (i >= i_43_) {
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		}
		i_43_ -= 7;
		while (i >= i_43_)
		    is_41_[i_42_--] = is[i--];
		return;
	    }
	}
	i_43_ += i;
	i_43_ -= 7;
	while (i < i_43_) {
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	}
	i_43_ += 7;
	while (i < i_43_)
	    is_41_[i_42_++] = is[i++];
    }
    
    static void method7714(double[] ds, int i, double[] ds_44_, int i_45_,
			   int i_46_) {
	if (ds == ds_44_) {
	    if (i == i_45_)
		return;
	    if (i_45_ > i && i_45_ < i + i_46_) {
		i_46_--;
		i += i_46_;
		i_45_ += i_46_;
		i_46_ = i - i_46_;
		i_46_ += 3;
		while (i >= i_46_) {
		    ds_44_[i_45_--] = ds[i--];
		    ds_44_[i_45_--] = ds[i--];
		    ds_44_[i_45_--] = ds[i--];
		    ds_44_[i_45_--] = ds[i--];
		}
		i_46_ -= 3;
		while (i >= i_46_)
		    ds_44_[i_45_--] = ds[i--];
		return;
	    }
	}
	i_46_ += i;
	i_46_ -= 3;
	while (i < i_46_) {
	    ds_44_[i_45_++] = ds[i++];
	    ds_44_[i_45_++] = ds[i++];
	    ds_44_[i_45_++] = ds[i++];
	    ds_44_[i_45_++] = ds[i++];
	}
	i_46_ += 3;
	while (i < i_46_)
	    ds_44_[i_45_++] = ds[i++];
    }
    
    public static void method7715(int[] is, int i, int[] is_47_, int i_48_,
				  int i_49_) {
	if (is == is_47_) {
	    if (i == i_48_)
		return;
	    if (i_48_ > i && i_48_ < i + i_49_) {
		i_49_--;
		i += i_49_;
		i_48_ += i_49_;
		i_49_ = i - i_49_;
		i_49_ += 7;
		while (i >= i_49_) {
		    is_47_[i_48_--] = is[i--];
		    is_47_[i_48_--] = is[i--];
		    is_47_[i_48_--] = is[i--];
		    is_47_[i_48_--] = is[i--];
		    is_47_[i_48_--] = is[i--];
		    is_47_[i_48_--] = is[i--];
		    is_47_[i_48_--] = is[i--];
		    is_47_[i_48_--] = is[i--];
		}
		i_49_ -= 7;
		while (i >= i_49_)
		    is_47_[i_48_--] = is[i--];
		return;
	    }
	}
	i_49_ += i;
	i_49_ -= 7;
	while (i < i_49_) {
	    is_47_[i_48_++] = is[i++];
	    is_47_[i_48_++] = is[i++];
	    is_47_[i_48_++] = is[i++];
	    is_47_[i_48_++] = is[i++];
	    is_47_[i_48_++] = is[i++];
	    is_47_[i_48_++] = is[i++];
	    is_47_[i_48_++] = is[i++];
	    is_47_[i_48_++] = is[i++];
	}
	i_49_ += 7;
	while (i < i_49_)
	    is_47_[i_48_++] = is[i++];
    }
    
    public static void method7716(int[] is, int i, int[] is_50_, int i_51_,
				  int i_52_) {
	if (is == is_50_) {
	    if (i == i_51_)
		return;
	    if (i_51_ > i && i_51_ < i + i_52_) {
		i_52_--;
		i += i_52_;
		i_51_ += i_52_;
		i_52_ = i - i_52_;
		i_52_ += 7;
		while (i >= i_52_) {
		    is_50_[i_51_--] = is[i--];
		    is_50_[i_51_--] = is[i--];
		    is_50_[i_51_--] = is[i--];
		    is_50_[i_51_--] = is[i--];
		    is_50_[i_51_--] = is[i--];
		    is_50_[i_51_--] = is[i--];
		    is_50_[i_51_--] = is[i--];
		    is_50_[i_51_--] = is[i--];
		}
		i_52_ -= 7;
		while (i >= i_52_)
		    is_50_[i_51_--] = is[i--];
		return;
	    }
	}
	i_52_ += i;
	i_52_ -= 7;
	while (i < i_52_) {
	    is_50_[i_51_++] = is[i++];
	    is_50_[i_51_++] = is[i++];
	    is_50_[i_51_++] = is[i++];
	    is_50_[i_51_++] = is[i++];
	    is_50_[i_51_++] = is[i++];
	    is_50_[i_51_++] = is[i++];
	    is_50_[i_51_++] = is[i++];
	    is_50_[i_51_++] = is[i++];
	}
	i_52_ += 7;
	while (i < i_52_)
	    is_50_[i_51_++] = is[i++];
    }
    
    static void method7717(short[] is, int i, short[] is_53_, int i_54_,
			   int i_55_) {
	if (is == is_53_) {
	    if (i == i_54_)
		return;
	    if (i_54_ > i && i_54_ < i + i_55_) {
		i_55_--;
		i += i_55_;
		i_54_ += i_55_;
		i_55_ = i - i_55_;
		i_55_ += 7;
		while (i >= i_55_) {
		    is_53_[i_54_--] = is[i--];
		    is_53_[i_54_--] = is[i--];
		    is_53_[i_54_--] = is[i--];
		    is_53_[i_54_--] = is[i--];
		    is_53_[i_54_--] = is[i--];
		    is_53_[i_54_--] = is[i--];
		    is_53_[i_54_--] = is[i--];
		    is_53_[i_54_--] = is[i--];
		}
		i_55_ -= 7;
		while (i >= i_55_)
		    is_53_[i_54_--] = is[i--];
		return;
	    }
	}
	i_55_ += i;
	i_55_ -= 7;
	while (i < i_55_) {
	    is_53_[i_54_++] = is[i++];
	    is_53_[i_54_++] = is[i++];
	    is_53_[i_54_++] = is[i++];
	    is_53_[i_54_++] = is[i++];
	    is_53_[i_54_++] = is[i++];
	    is_53_[i_54_++] = is[i++];
	    is_53_[i_54_++] = is[i++];
	    is_53_[i_54_++] = is[i++];
	}
	i_55_ += 7;
	while (i < i_55_)
	    is_53_[i_54_++] = is[i++];
    }
    
    public static void method7718(int[] is, int i, int[] is_56_, int i_57_,
				  int i_58_) {
	if (is == is_56_) {
	    if (i == i_57_)
		return;
	    if (i_57_ > i && i_57_ < i + i_58_) {
		i_58_--;
		i += i_58_;
		i_57_ += i_58_;
		i_58_ = i - i_58_;
		i_58_ += 7;
		while (i >= i_58_) {
		    is_56_[i_57_--] = is[i--];
		    is_56_[i_57_--] = is[i--];
		    is_56_[i_57_--] = is[i--];
		    is_56_[i_57_--] = is[i--];
		    is_56_[i_57_--] = is[i--];
		    is_56_[i_57_--] = is[i--];
		    is_56_[i_57_--] = is[i--];
		    is_56_[i_57_--] = is[i--];
		}
		i_58_ -= 7;
		while (i >= i_58_)
		    is_56_[i_57_--] = is[i--];
		return;
	    }
	}
	i_58_ += i;
	i_58_ -= 7;
	while (i < i_58_) {
	    is_56_[i_57_++] = is[i++];
	    is_56_[i_57_++] = is[i++];
	    is_56_[i_57_++] = is[i++];
	    is_56_[i_57_++] = is[i++];
	    is_56_[i_57_++] = is[i++];
	    is_56_[i_57_++] = is[i++];
	    is_56_[i_57_++] = is[i++];
	    is_56_[i_57_++] = is[i++];
	}
	i_58_ += 7;
	while (i < i_58_)
	    is_56_[i_57_++] = is[i++];
    }
    
    public static void method7719(int[] is, int i, int[] is_59_, int i_60_,
				  int i_61_) {
	if (is == is_59_) {
	    if (i == i_60_)
		return;
	    if (i_60_ > i && i_60_ < i + i_61_) {
		i_61_--;
		i += i_61_;
		i_60_ += i_61_;
		i_61_ = i - i_61_;
		i_61_ += 7;
		while (i >= i_61_) {
		    is_59_[i_60_--] = is[i--];
		    is_59_[i_60_--] = is[i--];
		    is_59_[i_60_--] = is[i--];
		    is_59_[i_60_--] = is[i--];
		    is_59_[i_60_--] = is[i--];
		    is_59_[i_60_--] = is[i--];
		    is_59_[i_60_--] = is[i--];
		    is_59_[i_60_--] = is[i--];
		}
		i_61_ -= 7;
		while (i >= i_61_)
		    is_59_[i_60_--] = is[i--];
		return;
	    }
	}
	i_61_ += i;
	i_61_ -= 7;
	while (i < i_61_) {
	    is_59_[i_60_++] = is[i++];
	    is_59_[i_60_++] = is[i++];
	    is_59_[i_60_++] = is[i++];
	    is_59_[i_60_++] = is[i++];
	    is_59_[i_60_++] = is[i++];
	    is_59_[i_60_++] = is[i++];
	    is_59_[i_60_++] = is[i++];
	    is_59_[i_60_++] = is[i++];
	}
	i_61_ += 7;
	while (i < i_61_)
	    is_59_[i_60_++] = is[i++];
    }
    
    static void method7720(boolean[] bools, int i, boolean[] bools_62_,
			   int i_63_, int i_64_) {
	if (bools == bools_62_) {
	    if (i == i_63_)
		return;
	    if (i_63_ > i && i_63_ < i + i_64_) {
		i_64_--;
		i += i_64_;
		i_63_ += i_64_;
		i_64_ = i - i_64_;
		i_64_ += 7;
		while (i >= i_64_) {
		    bools_62_[i_63_--] = bools[i--];
		    bools_62_[i_63_--] = bools[i--];
		    bools_62_[i_63_--] = bools[i--];
		    bools_62_[i_63_--] = bools[i--];
		    bools_62_[i_63_--] = bools[i--];
		    bools_62_[i_63_--] = bools[i--];
		    bools_62_[i_63_--] = bools[i--];
		    bools_62_[i_63_--] = bools[i--];
		}
		i_64_ -= 7;
		while (i >= i_64_)
		    bools_62_[i_63_--] = bools[i--];
		return;
	    }
	}
	i_64_ += i;
	i_64_ -= 7;
	while (i < i_64_) {
	    bools_62_[i_63_++] = bools[i++];
	    bools_62_[i_63_++] = bools[i++];
	    bools_62_[i_63_++] = bools[i++];
	    bools_62_[i_63_++] = bools[i++];
	    bools_62_[i_63_++] = bools[i++];
	    bools_62_[i_63_++] = bools[i++];
	    bools_62_[i_63_++] = bools[i++];
	    bools_62_[i_63_++] = bools[i++];
	}
	i_64_ += 7;
	while (i < i_64_)
	    bools_62_[i_63_++] = bools[i++];
    }
    
    static void method7721(byte[] is, int i, byte[] is_65_, int i_66_,
			   int i_67_) {
	if (is == is_65_) {
	    if (i == i_66_)
		return;
	    if (i_66_ > i && i_66_ < i + i_67_) {
		i_67_--;
		i += i_67_;
		i_66_ += i_67_;
		i_67_ = i - i_67_;
		i_67_ += 7;
		while (i >= i_67_) {
		    is_65_[i_66_--] = is[i--];
		    is_65_[i_66_--] = is[i--];
		    is_65_[i_66_--] = is[i--];
		    is_65_[i_66_--] = is[i--];
		    is_65_[i_66_--] = is[i--];
		    is_65_[i_66_--] = is[i--];
		    is_65_[i_66_--] = is[i--];
		    is_65_[i_66_--] = is[i--];
		}
		i_67_ -= 7;
		while (i >= i_67_)
		    is_65_[i_66_--] = is[i--];
		return;
	    }
	}
	i_67_ += i;
	i_67_ -= 7;
	while (i < i_67_) {
	    is_65_[i_66_++] = is[i++];
	    is_65_[i_66_++] = is[i++];
	    is_65_[i_66_++] = is[i++];
	    is_65_[i_66_++] = is[i++];
	    is_65_[i_66_++] = is[i++];
	    is_65_[i_66_++] = is[i++];
	    is_65_[i_66_++] = is[i++];
	    is_65_[i_66_++] = is[i++];
	}
	i_67_ += 7;
	while (i < i_67_)
	    is_65_[i_66_++] = is[i++];
    }
    
    static void method7722(long[] ls, int i, long[] ls_68_, int i_69_,
			   int i_70_) {
	if (ls == ls_68_) {
	    if (i == i_69_)
		return;
	    if (i_69_ > i && i_69_ < i + i_70_) {
		i_70_--;
		i += i_70_;
		i_69_ += i_70_;
		i_70_ = i - i_70_;
		i_70_ += 3;
		while (i >= i_70_) {
		    ls_68_[i_69_--] = ls[i--];
		    ls_68_[i_69_--] = ls[i--];
		    ls_68_[i_69_--] = ls[i--];
		    ls_68_[i_69_--] = ls[i--];
		}
		i_70_ -= 3;
		while (i >= i_70_)
		    ls_68_[i_69_--] = ls[i--];
		return;
	    }
	}
	i_70_ += i;
	i_70_ -= 3;
	while (i < i_70_) {
	    ls_68_[i_69_++] = ls[i++];
	    ls_68_[i_69_++] = ls[i++];
	    ls_68_[i_69_++] = ls[i++];
	    ls_68_[i_69_++] = ls[i++];
	}
	i_70_ += 3;
	while (i < i_70_)
	    ls_68_[i_69_++] = ls[i++];
    }
    
    public static void method7723(float[] fs, int i, float[] fs_71_, int i_72_,
				  int i_73_) {
	if (fs == fs_71_) {
	    if (i == i_72_)
		return;
	    if (i_72_ > i && i_72_ < i + i_73_) {
		i_73_--;
		i += i_73_;
		i_72_ += i_73_;
		i_73_ = i - i_73_;
		i_73_ += 7;
		while (i >= i_73_) {
		    fs_71_[i_72_--] = fs[i--];
		    fs_71_[i_72_--] = fs[i--];
		    fs_71_[i_72_--] = fs[i--];
		    fs_71_[i_72_--] = fs[i--];
		    fs_71_[i_72_--] = fs[i--];
		    fs_71_[i_72_--] = fs[i--];
		    fs_71_[i_72_--] = fs[i--];
		    fs_71_[i_72_--] = fs[i--];
		}
		i_73_ -= 7;
		while (i >= i_73_)
		    fs_71_[i_72_--] = fs[i--];
		return;
	    }
	}
	i_73_ += i;
	i_73_ -= 7;
	while (i < i_73_) {
	    fs_71_[i_72_++] = fs[i++];
	    fs_71_[i_72_++] = fs[i++];
	    fs_71_[i_72_++] = fs[i++];
	    fs_71_[i_72_++] = fs[i++];
	    fs_71_[i_72_++] = fs[i++];
	    fs_71_[i_72_++] = fs[i++];
	    fs_71_[i_72_++] = fs[i++];
	    fs_71_[i_72_++] = fs[i++];
	}
	i_73_ += 7;
	while (i < i_73_)
	    fs_71_[i_72_++] = fs[i++];
    }
    
    public static void method7724(float[] fs, int i, float[] fs_74_, int i_75_,
				  int i_76_) {
	if (fs == fs_74_) {
	    if (i == i_75_)
		return;
	    if (i_75_ > i && i_75_ < i + i_76_) {
		i_76_--;
		i += i_76_;
		i_75_ += i_76_;
		i_76_ = i - i_76_;
		i_76_ += 7;
		while (i >= i_76_) {
		    fs_74_[i_75_--] = fs[i--];
		    fs_74_[i_75_--] = fs[i--];
		    fs_74_[i_75_--] = fs[i--];
		    fs_74_[i_75_--] = fs[i--];
		    fs_74_[i_75_--] = fs[i--];
		    fs_74_[i_75_--] = fs[i--];
		    fs_74_[i_75_--] = fs[i--];
		    fs_74_[i_75_--] = fs[i--];
		}
		i_76_ -= 7;
		while (i >= i_76_)
		    fs_74_[i_75_--] = fs[i--];
		return;
	    }
	}
	i_76_ += i;
	i_76_ -= 7;
	while (i < i_76_) {
	    fs_74_[i_75_++] = fs[i++];
	    fs_74_[i_75_++] = fs[i++];
	    fs_74_[i_75_++] = fs[i++];
	    fs_74_[i_75_++] = fs[i++];
	    fs_74_[i_75_++] = fs[i++];
	    fs_74_[i_75_++] = fs[i++];
	    fs_74_[i_75_++] = fs[i++];
	    fs_74_[i_75_++] = fs[i++];
	}
	i_76_ += 7;
	while (i < i_76_)
	    fs_74_[i_75_++] = fs[i++];
    }
    
    public static void method7725(int[] is, int i, int i_77_, int i_78_) {
	i_77_ = i + i_77_ - 7;
	while (i < i_77_) {
	    is[i++] = i_78_;
	    is[i++] = i_78_;
	    is[i++] = i_78_;
	    is[i++] = i_78_;
	    is[i++] = i_78_;
	    is[i++] = i_78_;
	    is[i++] = i_78_;
	    is[i++] = i_78_;
	}
	i_77_ += 7;
	while (i < i_77_)
	    is[i++] = i_78_;
    }
    
    static void method7726(double[] ds, int i, double[] ds_79_, int i_80_,
			   int i_81_) {
	if (ds == ds_79_) {
	    if (i == i_80_)
		return;
	    if (i_80_ > i && i_80_ < i + i_81_) {
		i_81_--;
		i += i_81_;
		i_80_ += i_81_;
		i_81_ = i - i_81_;
		i_81_ += 3;
		while (i >= i_81_) {
		    ds_79_[i_80_--] = ds[i--];
		    ds_79_[i_80_--] = ds[i--];
		    ds_79_[i_80_--] = ds[i--];
		    ds_79_[i_80_--] = ds[i--];
		}
		i_81_ -= 3;
		while (i >= i_81_)
		    ds_79_[i_80_--] = ds[i--];
		return;
	    }
	}
	i_81_ += i;
	i_81_ -= 3;
	while (i < i_81_) {
	    ds_79_[i_80_++] = ds[i++];
	    ds_79_[i_80_++] = ds[i++];
	    ds_79_[i_80_++] = ds[i++];
	    ds_79_[i_80_++] = ds[i++];
	}
	i_81_ += 3;
	while (i < i_81_)
	    ds_79_[i_80_++] = ds[i++];
    }
    
    static void method7727(double[] ds, int i, double[] ds_82_, int i_83_,
			   int i_84_) {
	if (ds == ds_82_) {
	    if (i == i_83_)
		return;
	    if (i_83_ > i && i_83_ < i + i_84_) {
		i_84_--;
		i += i_84_;
		i_83_ += i_84_;
		i_84_ = i - i_84_;
		i_84_ += 3;
		while (i >= i_84_) {
		    ds_82_[i_83_--] = ds[i--];
		    ds_82_[i_83_--] = ds[i--];
		    ds_82_[i_83_--] = ds[i--];
		    ds_82_[i_83_--] = ds[i--];
		}
		i_84_ -= 3;
		while (i >= i_84_)
		    ds_82_[i_83_--] = ds[i--];
		return;
	    }
	}
	i_84_ += i;
	i_84_ -= 3;
	while (i < i_84_) {
	    ds_82_[i_83_++] = ds[i++];
	    ds_82_[i_83_++] = ds[i++];
	    ds_82_[i_83_++] = ds[i++];
	    ds_82_[i_83_++] = ds[i++];
	}
	i_84_ += 3;
	while (i < i_84_)
	    ds_82_[i_83_++] = ds[i++];
    }
    
    static void method7728(boolean[] bools, int i, boolean[] bools_85_,
			   int i_86_, int i_87_) {
	if (bools == bools_85_) {
	    if (i == i_86_)
		return;
	    if (i_86_ > i && i_86_ < i + i_87_) {
		i_87_--;
		i += i_87_;
		i_86_ += i_87_;
		i_87_ = i - i_87_;
		i_87_ += 7;
		while (i >= i_87_) {
		    bools_85_[i_86_--] = bools[i--];
		    bools_85_[i_86_--] = bools[i--];
		    bools_85_[i_86_--] = bools[i--];
		    bools_85_[i_86_--] = bools[i--];
		    bools_85_[i_86_--] = bools[i--];
		    bools_85_[i_86_--] = bools[i--];
		    bools_85_[i_86_--] = bools[i--];
		    bools_85_[i_86_--] = bools[i--];
		}
		i_87_ -= 7;
		while (i >= i_87_)
		    bools_85_[i_86_--] = bools[i--];
		return;
	    }
	}
	i_87_ += i;
	i_87_ -= 7;
	while (i < i_87_) {
	    bools_85_[i_86_++] = bools[i++];
	    bools_85_[i_86_++] = bools[i++];
	    bools_85_[i_86_++] = bools[i++];
	    bools_85_[i_86_++] = bools[i++];
	    bools_85_[i_86_++] = bools[i++];
	    bools_85_[i_86_++] = bools[i++];
	    bools_85_[i_86_++] = bools[i++];
	    bools_85_[i_86_++] = bools[i++];
	}
	i_87_ += 7;
	while (i < i_87_)
	    bools_85_[i_86_++] = bools[i++];
    }
    
    static void method7729(boolean[] bools, int i, boolean[] bools_88_,
			   int i_89_, int i_90_) {
	if (bools == bools_88_) {
	    if (i == i_89_)
		return;
	    if (i_89_ > i && i_89_ < i + i_90_) {
		i_90_--;
		i += i_90_;
		i_89_ += i_90_;
		i_90_ = i - i_90_;
		i_90_ += 7;
		while (i >= i_90_) {
		    bools_88_[i_89_--] = bools[i--];
		    bools_88_[i_89_--] = bools[i--];
		    bools_88_[i_89_--] = bools[i--];
		    bools_88_[i_89_--] = bools[i--];
		    bools_88_[i_89_--] = bools[i--];
		    bools_88_[i_89_--] = bools[i--];
		    bools_88_[i_89_--] = bools[i--];
		    bools_88_[i_89_--] = bools[i--];
		}
		i_90_ -= 7;
		while (i >= i_90_)
		    bools_88_[i_89_--] = bools[i--];
		return;
	    }
	}
	i_90_ += i;
	i_90_ -= 7;
	while (i < i_90_) {
	    bools_88_[i_89_++] = bools[i++];
	    bools_88_[i_89_++] = bools[i++];
	    bools_88_[i_89_++] = bools[i++];
	    bools_88_[i_89_++] = bools[i++];
	    bools_88_[i_89_++] = bools[i++];
	    bools_88_[i_89_++] = bools[i++];
	    bools_88_[i_89_++] = bools[i++];
	    bools_88_[i_89_++] = bools[i++];
	}
	i_90_ += 7;
	while (i < i_90_)
	    bools_88_[i_89_++] = bools[i++];
    }
    
    public static void method7730(Object[] objects, int i,
				  Object[] objects_91_, int i_92_, int i_93_) {
	if (objects == objects_91_) {
	    if (i == i_92_)
		return;
	    if (i_92_ > i && i_92_ < i + i_93_) {
		i_93_--;
		i += i_93_;
		i_92_ += i_93_;
		i_93_ = i - i_93_;
		i_93_ += 7;
		while (i >= i_93_) {
		    objects_91_[i_92_--] = objects[i--];
		    objects_91_[i_92_--] = objects[i--];
		    objects_91_[i_92_--] = objects[i--];
		    objects_91_[i_92_--] = objects[i--];
		    objects_91_[i_92_--] = objects[i--];
		    objects_91_[i_92_--] = objects[i--];
		    objects_91_[i_92_--] = objects[i--];
		    objects_91_[i_92_--] = objects[i--];
		}
		i_93_ -= 7;
		while (i >= i_93_)
		    objects_91_[i_92_--] = objects[i--];
		return;
	    }
	}
	i_93_ += i;
	i_93_ -= 7;
	while (i < i_93_) {
	    objects_91_[i_92_++] = objects[i++];
	    objects_91_[i_92_++] = objects[i++];
	    objects_91_[i_92_++] = objects[i++];
	    objects_91_[i_92_++] = objects[i++];
	    objects_91_[i_92_++] = objects[i++];
	    objects_91_[i_92_++] = objects[i++];
	    objects_91_[i_92_++] = objects[i++];
	    objects_91_[i_92_++] = objects[i++];
	}
	i_93_ += 7;
	while (i < i_93_)
	    objects_91_[i_92_++] = objects[i++];
    }
    
    public static void method7731(Object[] objects, int i,
				  Object[] objects_94_, int i_95_, int i_96_) {
	if (objects == objects_94_) {
	    if (i == i_95_)
		return;
	    if (i_95_ > i && i_95_ < i + i_96_) {
		i_96_--;
		i += i_96_;
		i_95_ += i_96_;
		i_96_ = i - i_96_;
		i_96_ += 7;
		while (i >= i_96_) {
		    objects_94_[i_95_--] = objects[i--];
		    objects_94_[i_95_--] = objects[i--];
		    objects_94_[i_95_--] = objects[i--];
		    objects_94_[i_95_--] = objects[i--];
		    objects_94_[i_95_--] = objects[i--];
		    objects_94_[i_95_--] = objects[i--];
		    objects_94_[i_95_--] = objects[i--];
		    objects_94_[i_95_--] = objects[i--];
		}
		i_96_ -= 7;
		while (i >= i_96_)
		    objects_94_[i_95_--] = objects[i--];
		return;
	    }
	}
	i_96_ += i;
	i_96_ -= 7;
	while (i < i_96_) {
	    objects_94_[i_95_++] = objects[i++];
	    objects_94_[i_95_++] = objects[i++];
	    objects_94_[i_95_++] = objects[i++];
	    objects_94_[i_95_++] = objects[i++];
	    objects_94_[i_95_++] = objects[i++];
	    objects_94_[i_95_++] = objects[i++];
	    objects_94_[i_95_++] = objects[i++];
	    objects_94_[i_95_++] = objects[i++];
	}
	i_96_ += 7;
	while (i < i_96_)
	    objects_94_[i_95_++] = objects[i++];
    }
    
    public static void method7732(int[] is, int i, int i_97_, int i_98_) {
	i_97_ = i + i_97_ - 7;
	while (i < i_97_) {
	    is[i++] = i_98_;
	    is[i++] = i_98_;
	    is[i++] = i_98_;
	    is[i++] = i_98_;
	    is[i++] = i_98_;
	    is[i++] = i_98_;
	    is[i++] = i_98_;
	    is[i++] = i_98_;
	}
	i_97_ += 7;
	while (i < i_97_)
	    is[i++] = i_98_;
    }
    
    public static void method7733(int[] is, int i, int i_99_, int i_100_) {
	i_99_ = i + i_99_ - 7;
	while (i < i_99_) {
	    is[i++] = i_100_;
	    is[i++] = i_100_;
	    is[i++] = i_100_;
	    is[i++] = i_100_;
	    is[i++] = i_100_;
	    is[i++] = i_100_;
	    is[i++] = i_100_;
	    is[i++] = i_100_;
	}
	i_99_ += 7;
	while (i < i_99_)
	    is[i++] = i_100_;
    }
    
    public static void method7734(float[] fs, int i, float[] fs_101_,
				  int i_102_, int i_103_) {
	if (fs == fs_101_) {
	    if (i == i_102_)
		return;
	    if (i_102_ > i && i_102_ < i + i_103_) {
		i_103_--;
		i += i_103_;
		i_102_ += i_103_;
		i_103_ = i - i_103_;
		i_103_ += 7;
		while (i >= i_103_) {
		    fs_101_[i_102_--] = fs[i--];
		    fs_101_[i_102_--] = fs[i--];
		    fs_101_[i_102_--] = fs[i--];
		    fs_101_[i_102_--] = fs[i--];
		    fs_101_[i_102_--] = fs[i--];
		    fs_101_[i_102_--] = fs[i--];
		    fs_101_[i_102_--] = fs[i--];
		    fs_101_[i_102_--] = fs[i--];
		}
		i_103_ -= 7;
		while (i >= i_103_)
		    fs_101_[i_102_--] = fs[i--];
		return;
	    }
	}
	i_103_ += i;
	i_103_ -= 7;
	while (i < i_103_) {
	    fs_101_[i_102_++] = fs[i++];
	    fs_101_[i_102_++] = fs[i++];
	    fs_101_[i_102_++] = fs[i++];
	    fs_101_[i_102_++] = fs[i++];
	    fs_101_[i_102_++] = fs[i++];
	    fs_101_[i_102_++] = fs[i++];
	    fs_101_[i_102_++] = fs[i++];
	    fs_101_[i_102_++] = fs[i++];
	}
	i_103_ += 7;
	while (i < i_103_)
	    fs_101_[i_102_++] = fs[i++];
    }
}
