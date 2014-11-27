/* Class435 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class435
{
    static Class412 aClass412_6121 = new Class412();
    static final int anInt6122 = 0;
    static final int anInt6123 = 16;
    static final int anInt6124 = 4096;
    static final int anInt6125 = 1;
    static final int anInt6126 = 6;
    static final int anInt6127 = 50;
    static final int anInt6128 = 23;
    
    static void method7773(Class412 class412) {
	boolean bool = false;
	boolean bool_0_ = false;
	boolean bool_1_ = false;
	boolean bool_2_ = false;
	boolean bool_3_ = false;
	boolean bool_4_ = false;
	boolean bool_5_ = false;
	boolean bool_6_ = false;
	boolean bool_7_ = false;
	boolean bool_8_ = false;
	boolean bool_9_ = false;
	boolean bool_10_ = false;
	boolean bool_11_ = false;
	boolean bool_12_ = false;
	boolean bool_13_ = false;
	boolean bool_14_ = false;
	boolean bool_15_ = false;
	boolean bool_16_ = false;
	int i = 0;
	int[] is = null;
	int[] is_17_ = null;
	int[] is_18_ = null;
	((Class412) class412).anInt5958 = -919138847;
	if (Class412.anIntArray5965 == null)
	    Class412.anIntArray5965
		= new int[((Class412) class412).anInt5958 * -1943004512];
	boolean bool_19_ = true;
	while (bool_19_) {
	    byte i_20_ = method7777(class412);
	    if (i_20_ == 23)
		break;
	    i_20_ = method7777(class412);
	    i_20_ = method7777(class412);
	    i_20_ = method7777(class412);
	    i_20_ = method7777(class412);
	    i_20_ = method7777(class412);
	    i_20_ = method7777(class412);
	    i_20_ = method7777(class412);
	    i_20_ = method7777(class412);
	    i_20_ = method7777(class412);
	    i_20_ = method7781(class412);
	    if (i_20_ == 0) {
		/* empty */
	    }
	    ((Class412) class412).anInt5957 = 0;
	    int i_21_ = method7777(class412);
	    ((Class412) class412).anInt5957
		= (((Class412) class412).anInt5957 * 2014686237 << 8
		   | i_21_ & 0xff) * 461796917;
	    i_21_ = method7777(class412);
	    ((Class412) class412).anInt5957
		= (((Class412) class412).anInt5957 * 2014686237 << 8
		   | i_21_ & 0xff) * 461796917;
	    i_21_ = method7777(class412);
	    ((Class412) class412).anInt5957
		= (((Class412) class412).anInt5957 * 2014686237 << 8
		   | i_21_ & 0xff) * 461796917;
	    for (int i_22_ = 0; i_22_ < 16; i_22_++) {
		i_20_ = method7781(class412);
		if (i_20_ == 1)
		    ((Class412) class412).aBoolArray5968[i_22_] = true;
		else
		    ((Class412) class412).aBoolArray5968[i_22_] = false;
	    }
	    for (int i_23_ = 0; i_23_ < 256; i_23_++)
		((Class412) class412).aBoolArray5967[i_23_] = false;
	    for (int i_24_ = 0; i_24_ < 16; i_24_++) {
		if (((Class412) class412).aBoolArray5968[i_24_]) {
		    for (int i_25_ = 0; i_25_ < 16; i_25_++) {
			i_20_ = method7781(class412);
			if (i_20_ == 1)
			    ((Class412) class412).aBoolArray5967[(i_24_ * 16
								  + i_25_)]
				= true;
		    }
		}
	    }
	    method7788(class412);
	    int i_26_ = ((Class412) class412).anInt5976 * 1193465459 + 2;
	    int i_27_ = method7778(3, class412);
	    int i_28_ = method7778(15, class412);
	    for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
		int i_30_ = 0;
		for (;;) {
		    i_20_ = method7781(class412);
		    if (i_20_ == 0)
			break;
		    i_30_++;
		}
		((Class412) class412).aByteArray5973[i_29_] = (byte) i_30_;
	    }
	    byte[] is_31_ = new byte[6];
	    for (byte i_32_ = 0; i_32_ < i_27_; i_32_++)
		is_31_[i_32_] = i_32_;
	    for (int i_33_ = 0; i_33_ < i_28_; i_33_++) {
		byte i_34_ = ((Class412) class412).aByteArray5973[i_33_];
		byte i_35_ = is_31_[i_34_];
		for (/**/; i_34_ > 0; i_34_--)
		    is_31_[i_34_] = is_31_[i_34_ - 1];
		is_31_[0] = i_35_;
		((Class412) class412).aByteArray5972[i_33_] = i_35_;
	    }
	    for (int i_36_ = 0; i_36_ < i_27_; i_36_++) {
		int i_37_ = method7778(5, class412);
		for (int i_38_ = 0; i_38_ < i_26_; i_38_++) {
		    for (;;) {
			i_20_ = method7781(class412);
			if (i_20_ == 0)
			    break;
			i_20_ = method7781(class412);
			if (i_20_ == 0)
			    i_37_++;
			else
			    i_37_--;
		    }
		    ((Class412) class412).aByteArrayArray5941[i_36_][i_38_]
			= (byte) i_37_;
		}
	    }
	    for (int i_39_ = 0; i_39_ < i_27_; i_39_++) {
		int i_40_ = 32;
		byte i_41_ = 0;
		for (int i_42_ = 0; i_42_ < i_26_; i_42_++) {
		    if (((Class412) class412).aByteArrayArray5941[i_39_][i_42_]
			> i_41_)
			i_41_ = (((Class412) class412).aByteArrayArray5941
				 [i_39_][i_42_]);
		    if (((Class412) class412).aByteArrayArray5941[i_39_][i_42_]
			< i_40_)
			i_40_ = (((Class412) class412).aByteArrayArray5941
				 [i_39_][i_42_]);
		}
		method7780(((Class412) class412).anIntArrayArray5974[i_39_],
			   ((Class412) class412).anIntArrayArray5947[i_39_],
			   ((Class412) class412).anIntArrayArray5977[i_39_],
			   ((Class412) class412).aByteArrayArray5941[i_39_],
			   i_40_, i_41_, i_26_);
		((Class412) class412).anIntArray5955[i_39_] = i_40_;
	    }
	    int i_43_ = ((Class412) class412).anInt5976 * 1193465459 + 1;
	    int i_44_ = -1;
	    int i_45_ = 0;
	    for (int i_46_ = 0; i_46_ <= 255; i_46_++)
		((Class412) class412).anIntArray5962[i_46_] = 0;
	    int i_47_ = 4095;
	    for (int i_48_ = 15; i_48_ >= 0; i_48_--) {
		for (int i_49_ = 15; i_49_ >= 0; i_49_--) {
		    ((Class412) class412).aByteArray5970[i_47_]
			= (byte) (i_48_ * 16 + i_49_);
		    i_47_--;
		}
		((Class412) class412).anIntArray5971[i_48_] = i_47_ + 1;
	    }
	    int i_50_ = 0;
	    if (i_45_ == 0) {
		i_44_++;
		i_45_ = 50;
		byte i_51_ = ((Class412) class412).aByteArray5972[i_44_];
		i = ((Class412) class412).anIntArray5955[i_51_];
		is = ((Class412) class412).anIntArrayArray5974[i_51_];
		is_18_ = ((Class412) class412).anIntArrayArray5977[i_51_];
		is_17_ = ((Class412) class412).anIntArrayArray5947[i_51_];
	    }
	    i_45_--;
	    int i_52_ = i;
	    int i_53_;
	    int i_54_;
	    for (i_54_ = method7778(i_52_, class412); i_54_ > is[i_52_];
		 i_54_ = i_54_ << 1 | i_53_) {
		i_52_++;
		i_53_ = method7781(class412);
	    }
	    int i_55_ = is_18_[i_54_ - is_17_[i_52_]];
	    while (i_55_ != i_43_) {
		if (i_55_ == 0 || i_55_ == 1) {
		    int i_56_ = -1;
		    int i_57_ = 1;
		    do {
			if (i_55_ == 0)
			    i_56_ += 1 * i_57_;
			else if (i_55_ == 1)
			    i_56_ += 2 * i_57_;
			i_57_ *= 2;
			if (i_45_ == 0) {
			    i_44_++;
			    i_45_ = 50;
			    byte i_58_
				= ((Class412) class412).aByteArray5972[i_44_];
			    i = ((Class412) class412).anIntArray5955[i_58_];
			    is = (((Class412) class412).anIntArrayArray5974
				  [i_58_]);
			    is_18_ = (((Class412) class412).anIntArrayArray5977
				      [i_58_]);
			    is_17_ = (((Class412) class412).anIntArrayArray5947
				      [i_58_]);
			}
			i_45_--;
			i_52_ = i;
			for (i_54_ = method7778(i_52_, class412);
			     i_54_ > is[i_52_]; i_54_ = i_54_ << 1 | i_53_) {
			    i_52_++;
			    i_53_ = method7781(class412);
			}
			i_55_ = is_18_[i_54_ - is_17_[i_52_]];
		    } while (i_55_ == 0 || i_55_ == 1);
		    i_56_++;
		    i_21_ = (((Class412) class412).aByteArray5969
			     [((((Class412) class412).aByteArray5970
				[((Class412) class412).anIntArray5971[0]])
			       & 0xff)]);
		    ((Class412) class412).anIntArray5962[i_21_ & 0xff]
			+= i_56_;
		    for (/**/; i_56_ > 0; i_56_--) {
			Class412.anIntArray5965[i_50_] = i_21_ & 0xff;
			i_50_++;
		    }
		} else {
		    int i_59_ = i_55_ - 1;
		    if (i_59_ < 16) {
			int i_60_ = ((Class412) class412).anIntArray5971[0];
			i_20_ = (((Class412) class412).aByteArray5970
				 [i_60_ + i_59_]);
			for (/**/; i_59_ > 3; i_59_ -= 4) {
			    int i_61_ = i_60_ + i_59_;
			    ((Class412) class412).aByteArray5970[i_61_]
				= (((Class412) class412).aByteArray5970
				   [i_61_ - 1]);
			    ((Class412) class412).aByteArray5970[i_61_ - 1]
				= (((Class412) class412).aByteArray5970
				   [i_61_ - 2]);
			    ((Class412) class412).aByteArray5970[i_61_ - 2]
				= (((Class412) class412).aByteArray5970
				   [i_61_ - 3]);
			    ((Class412) class412).aByteArray5970[i_61_ - 3]
				= (((Class412) class412).aByteArray5970
				   [i_61_ - 4]);
			}
			for (/**/; i_59_ > 0; i_59_--)
			    ((Class412) class412).aByteArray5970[i_60_ + i_59_]
				= (((Class412) class412).aByteArray5970
				   [i_60_ + i_59_ - 1]);
			((Class412) class412).aByteArray5970[i_60_] = i_20_;
		    } else {
			int i_62_ = i_59_ / 16;
			int i_63_ = i_59_ % 16;
			int i_64_
			    = (((Class412) class412).anIntArray5971[i_62_]
			       + i_63_);
			i_20_ = ((Class412) class412).aByteArray5970[i_64_];
			for (/**/;
			     (i_64_
			      > ((Class412) class412).anIntArray5971[i_62_]);
			     i_64_--)
			    ((Class412) class412).aByteArray5970[i_64_]
				= (((Class412) class412).aByteArray5970
				   [i_64_ - 1]);
			((Class412) class412).anIntArray5971[i_62_]++;
			for (/**/; i_62_ > 0; i_62_--) {
			    ((Class412) class412).anIntArray5971[i_62_]--;
			    ((Class412) class412).aByteArray5970
				[((Class412) class412).anIntArray5971[i_62_]]
				= (((Class412) class412).aByteArray5970
				   [(((Class412) class412).anIntArray5971
				     [i_62_ - 1]) + 16 - 1]);
			}
			((Class412) class412).anIntArray5971[0]--;
			((Class412) class412).aByteArray5970
			    [((Class412) class412).anIntArray5971[0]]
			    = i_20_;
			if (((Class412) class412).anIntArray5971[0] == 0) {
			    i_47_ = 4095;
			    for (int i_65_ = 15; i_65_ >= 0; i_65_--) {
				for (int i_66_ = 15; i_66_ >= 0; i_66_--) {
				    ((Class412) class412).aByteArray5970[i_47_]
					= (((Class412) class412).aByteArray5970
					   [(((Class412) class412)
					     .anIntArray5971[i_65_]) + i_66_]);
				    i_47_--;
				}
				((Class412) class412).anIntArray5971[i_65_]
				    = i_47_ + 1;
			    }
			}
		    }
		    ((Class412) class412).anIntArray5962
			[(((Class412) class412).aByteArray5969[i_20_ & 0xff]
			  & 0xff)]++;
		    Class412.anIntArray5965[i_50_]
			= (((Class412) class412).aByteArray5969[i_20_ & 0xff]
			   & 0xff);
		    i_50_++;
		    if (i_45_ == 0) {
			i_44_++;
			i_45_ = 50;
			byte i_67_
			    = ((Class412) class412).aByteArray5972[i_44_];
			i = ((Class412) class412).anIntArray5955[i_67_];
			is = ((Class412) class412).anIntArrayArray5974[i_67_];
			is_18_
			    = ((Class412) class412).anIntArrayArray5977[i_67_];
			is_17_
			    = ((Class412) class412).anIntArrayArray5947[i_67_];
		    }
		    i_45_--;
		    i_52_ = i;
		    for (i_54_ = method7778(i_52_, class412);
			 i_54_ > is[i_52_]; i_54_ = i_54_ << 1 | i_53_) {
			i_52_++;
			i_53_ = method7781(class412);
		    }
		    i_55_ = is_18_[i_54_ - is_17_[i_52_]];
		}
	    }
	    ((Class412) class412).anInt5975 = 0;
	    ((Class412) class412).aByte5954 = (byte) 0;
	    ((Class412) class412).anIntArray5964[0] = 0;
	    for (int i_68_ = 1; i_68_ <= 256; i_68_++)
		((Class412) class412).anIntArray5964[i_68_]
		    = ((Class412) class412).anIntArray5962[i_68_ - 1];
	    for (int i_69_ = 1; i_69_ <= 256; i_69_++)
		((Class412) class412).anIntArray5964[i_69_]
		    += ((Class412) class412).anIntArray5964[i_69_ - 1];
	    for (int i_70_ = 0; i_70_ < i_50_; i_70_++) {
		i_21_ = (byte) (Class412.anIntArray5965[i_70_] & 0xff);
		Class412.anIntArray5965[(((Class412) class412).anIntArray5964
					 [i_21_ & 0xff])]
		    |= i_70_ << 8;
		((Class412) class412).anIntArray5964[i_21_ & 0xff]++;
	    }
	    ((Class412) class412).anInt5960
		= ((Class412.anIntArray5965
		    [((Class412) class412).anInt5957 * 2014686237])
		   >> 8) * -325665473;
	    ((Class412) class412).anInt5963 = 0;
	    ((Class412) class412).anInt5960
		= Class412.anIntArray5965[(((Class412) class412).anInt5960
					   * 1078833855)] * -325665473;
	    ((Class412) class412).anInt5978
		= ((byte) (((Class412) class412).anInt5960 * 1078833855 & 0xff)
		   * 1721751347);
	    Class412 class412_71_;
	    ((Class412) (class412_71_ = class412)).anInt5960
		= ((((Class412) class412_71_).anInt5960 * 1078833855 >> 8)
		   * -325665473);
	    ((Class412) class412).anInt5963 += 1006310741;
	    ((Class412) class412).anInt5966 = i_50_ * -1553475137;
	    method7775(class412);
	    if ((((Class412) class412).anInt5963 * 875315197
		 == ((Class412) class412).anInt5966 * 1678054975 + 1)
		&& ((Class412) class412).anInt5975 * 862242051 == 0)
		bool_19_ = true;
	    else
		bool_19_ = false;
	}
    }
    
    static void method7774(Class412 class412) {
	byte i = ((Class412) class412).aByte5954;
	int i_72_ = ((Class412) class412).anInt5975 * 862242051;
	int i_73_ = ((Class412) class412).anInt5963 * 875315197;
	int i_74_ = ((Class412) class412).anInt5978 * -1919681541;
	int[] is = Class412.anIntArray5965;
	int i_75_ = ((Class412) class412).anInt5960 * 1078833855;
	byte[] is_76_ = ((Class412) class412).aByteArray5949;
	int i_77_ = ((Class412) class412).anInt5951 * -1616069371;
	int i_78_ = ((Class412) class412).anInt5952 * -1830144757;
	int i_79_ = i_78_;
	int i_80_ = ((Class412) class412).anInt5966 * 1678054975 + 1;
    while_58_:
	for (;;) {
	    if (i_72_ > 0) {
		for (;;) {
		    if (i_78_ == 0)
			break while_58_;
		    if (i_72_ == 1)
			break;
		    is_76_[i_77_] = i;
		    i_72_--;
		    i_77_++;
		    i_78_--;
		}
		if (i_78_ == 0) {
		    i_72_ = 1;
		    break;
		}
		is_76_[i_77_] = i;
		i_77_++;
		i_78_--;
	    }
	    for (;;) {
		if (i_73_ == i_80_) {
		    i_72_ = 0;
		    break while_58_;
		}
		i = (byte) i_74_;
		i_75_ = is[i_75_];
		int i_81_ = (byte) i_75_;
		i_75_ >>= 8;
		i_73_++;
		if (i_81_ != i_74_) {
		    i_74_ = i_81_;
		    if (i_78_ == 0) {
			i_72_ = 1;
			break while_58_;
		    }
		    is_76_[i_77_] = i;
		    i_77_++;
		    i_78_--;
		} else {
		    if (i_73_ != i_80_)
			break;
		    if (i_78_ == 0) {
			i_72_ = 1;
			break while_58_;
		    }
		    is_76_[i_77_] = i;
		    i_77_++;
		    i_78_--;
		}
	    }
	    i_72_ = 2;
	    i_75_ = is[i_75_];
	    int i_82_ = (byte) i_75_;
	    i_75_ >>= 8;
	    if (++i_73_ != i_80_) {
		if (i_82_ != i_74_)
		    i_74_ = i_82_;
		else {
		    i_72_ = 3;
		    i_75_ = is[i_75_];
		    i_82_ = (byte) i_75_;
		    i_75_ >>= 8;
		    if (++i_73_ != i_80_) {
			if (i_82_ != i_74_)
			    i_74_ = i_82_;
			else {
			    i_75_ = is[i_75_];
			    i_82_ = (byte) i_75_;
			    i_75_ >>= 8;
			    i_73_++;
			    i_72_ = (i_82_ & 0xff) + 4;
			    i_75_ = is[i_75_];
			    i_74_ = (byte) i_75_;
			    i_75_ >>= 8;
			    i_73_++;
			}
		    }
		}
	    }
	}
	int i_83_ = ((Class412) class412).anInt5953 * -404342401;
	((Class412) class412).anInt5953 += (i_79_ - i_78_) * -1949333889;
	if (((Class412) class412).anInt5953 * -404342401 >= i_83_) {
	    /* empty */
	}
	((Class412) class412).aByte5954 = i;
	((Class412) class412).anInt5975 = i_72_ * -1169175125;
	((Class412) class412).anInt5963 = i_73_ * 1006310741;
	((Class412) class412).anInt5978 = i_74_ * 1721751347;
	Class412.anIntArray5965 = is;
	((Class412) class412).anInt5960 = i_75_ * -325665473;
	((Class412) class412).aByteArray5949 = is_76_;
	((Class412) class412).anInt5951 = i_77_ * 1194559437;
	((Class412) class412).anInt5952 = i_78_ * -1062146397;
    }
    
    static void method7775(Class412 class412) {
	byte i = ((Class412) class412).aByte5954;
	int i_84_ = ((Class412) class412).anInt5975 * 862242051;
	int i_85_ = ((Class412) class412).anInt5963 * 875315197;
	int i_86_ = ((Class412) class412).anInt5978 * -1919681541;
	int[] is = Class412.anIntArray5965;
	int i_87_ = ((Class412) class412).anInt5960 * 1078833855;
	byte[] is_88_ = ((Class412) class412).aByteArray5949;
	int i_89_ = ((Class412) class412).anInt5951 * -1616069371;
	int i_90_ = ((Class412) class412).anInt5952 * -1830144757;
	int i_91_ = i_90_;
	int i_92_ = ((Class412) class412).anInt5966 * 1678054975 + 1;
    while_59_:
	for (;;) {
	    if (i_84_ > 0) {
		for (;;) {
		    if (i_90_ == 0)
			break while_59_;
		    if (i_84_ == 1)
			break;
		    is_88_[i_89_] = i;
		    i_84_--;
		    i_89_++;
		    i_90_--;
		}
		if (i_90_ == 0) {
		    i_84_ = 1;
		    break;
		}
		is_88_[i_89_] = i;
		i_89_++;
		i_90_--;
	    }
	    for (;;) {
		if (i_85_ == i_92_) {
		    i_84_ = 0;
		    break while_59_;
		}
		i = (byte) i_86_;
		i_87_ = is[i_87_];
		int i_93_ = (byte) i_87_;
		i_87_ >>= 8;
		i_85_++;
		if (i_93_ != i_86_) {
		    i_86_ = i_93_;
		    if (i_90_ == 0) {
			i_84_ = 1;
			break while_59_;
		    }
		    is_88_[i_89_] = i;
		    i_89_++;
		    i_90_--;
		} else {
		    if (i_85_ != i_92_)
			break;
		    if (i_90_ == 0) {
			i_84_ = 1;
			break while_59_;
		    }
		    is_88_[i_89_] = i;
		    i_89_++;
		    i_90_--;
		}
	    }
	    i_84_ = 2;
	    i_87_ = is[i_87_];
	    int i_94_ = (byte) i_87_;
	    i_87_ >>= 8;
	    if (++i_85_ != i_92_) {
		if (i_94_ != i_86_)
		    i_86_ = i_94_;
		else {
		    i_84_ = 3;
		    i_87_ = is[i_87_];
		    i_94_ = (byte) i_87_;
		    i_87_ >>= 8;
		    if (++i_85_ != i_92_) {
			if (i_94_ != i_86_)
			    i_86_ = i_94_;
			else {
			    i_87_ = is[i_87_];
			    i_94_ = (byte) i_87_;
			    i_87_ >>= 8;
			    i_85_++;
			    i_84_ = (i_94_ & 0xff) + 4;
			    i_87_ = is[i_87_];
			    i_86_ = (byte) i_87_;
			    i_87_ >>= 8;
			    i_85_++;
			}
		    }
		}
	    }
	}
	int i_95_ = ((Class412) class412).anInt5953 * -404342401;
	((Class412) class412).anInt5953 += (i_91_ - i_90_) * -1949333889;
	if (((Class412) class412).anInt5953 * -404342401 >= i_95_) {
	    /* empty */
	}
	((Class412) class412).aByte5954 = i;
	((Class412) class412).anInt5975 = i_84_ * -1169175125;
	((Class412) class412).anInt5963 = i_85_ * 1006310741;
	((Class412) class412).anInt5978 = i_86_ * 1721751347;
	Class412.anIntArray5965 = is;
	((Class412) class412).anInt5960 = i_87_ * -325665473;
	((Class412) class412).aByteArray5949 = is_88_;
	((Class412) class412).anInt5951 = i_89_ * 1194559437;
	((Class412) class412).anInt5952 = i_90_ * -1062146397;
    }
    
    static void method7776(Class412 class412) {
	boolean bool = false;
	boolean bool_96_ = false;
	boolean bool_97_ = false;
	boolean bool_98_ = false;
	boolean bool_99_ = false;
	boolean bool_100_ = false;
	boolean bool_101_ = false;
	boolean bool_102_ = false;
	boolean bool_103_ = false;
	boolean bool_104_ = false;
	boolean bool_105_ = false;
	boolean bool_106_ = false;
	boolean bool_107_ = false;
	boolean bool_108_ = false;
	boolean bool_109_ = false;
	boolean bool_110_ = false;
	boolean bool_111_ = false;
	boolean bool_112_ = false;
	int i = 0;
	int[] is = null;
	int[] is_113_ = null;
	int[] is_114_ = null;
	((Class412) class412).anInt5958 = -919138847;
	if (Class412.anIntArray5965 == null)
	    Class412.anIntArray5965
		= new int[((Class412) class412).anInt5958 * -1943004512];
	boolean bool_115_ = true;
	while (bool_115_) {
	    byte i_116_ = method7777(class412);
	    if (i_116_ == 23)
		break;
	    i_116_ = method7777(class412);
	    i_116_ = method7777(class412);
	    i_116_ = method7777(class412);
	    i_116_ = method7777(class412);
	    i_116_ = method7777(class412);
	    i_116_ = method7777(class412);
	    i_116_ = method7777(class412);
	    i_116_ = method7777(class412);
	    i_116_ = method7777(class412);
	    i_116_ = method7781(class412);
	    if (i_116_ == 0) {
		/* empty */
	    }
	    ((Class412) class412).anInt5957 = 0;
	    int i_117_ = method7777(class412);
	    ((Class412) class412).anInt5957
		= (((Class412) class412).anInt5957 * 2014686237 << 8
		   | i_117_ & 0xff) * 461796917;
	    i_117_ = method7777(class412);
	    ((Class412) class412).anInt5957
		= (((Class412) class412).anInt5957 * 2014686237 << 8
		   | i_117_ & 0xff) * 461796917;
	    i_117_ = method7777(class412);
	    ((Class412) class412).anInt5957
		= (((Class412) class412).anInt5957 * 2014686237 << 8
		   | i_117_ & 0xff) * 461796917;
	    for (int i_118_ = 0; i_118_ < 16; i_118_++) {
		i_116_ = method7781(class412);
		if (i_116_ == 1)
		    ((Class412) class412).aBoolArray5968[i_118_] = true;
		else
		    ((Class412) class412).aBoolArray5968[i_118_] = false;
	    }
	    for (int i_119_ = 0; i_119_ < 256; i_119_++)
		((Class412) class412).aBoolArray5967[i_119_] = false;
	    for (int i_120_ = 0; i_120_ < 16; i_120_++) {
		if (((Class412) class412).aBoolArray5968[i_120_]) {
		    for (int i_121_ = 0; i_121_ < 16; i_121_++) {
			i_116_ = method7781(class412);
			if (i_116_ == 1)
			    ((Class412) class412).aBoolArray5967[(i_120_ * 16
								  + i_121_)]
				= true;
		    }
		}
	    }
	    method7788(class412);
	    int i_122_ = ((Class412) class412).anInt5976 * 1193465459 + 2;
	    int i_123_ = method7778(3, class412);
	    int i_124_ = method7778(15, class412);
	    for (int i_125_ = 0; i_125_ < i_124_; i_125_++) {
		int i_126_ = 0;
		for (;;) {
		    i_116_ = method7781(class412);
		    if (i_116_ == 0)
			break;
		    i_126_++;
		}
		((Class412) class412).aByteArray5973[i_125_] = (byte) i_126_;
	    }
	    byte[] is_127_ = new byte[6];
	    for (byte i_128_ = 0; i_128_ < i_123_; i_128_++)
		is_127_[i_128_] = i_128_;
	    for (int i_129_ = 0; i_129_ < i_124_; i_129_++) {
		byte i_130_ = ((Class412) class412).aByteArray5973[i_129_];
		byte i_131_ = is_127_[i_130_];
		for (/**/; i_130_ > 0; i_130_--)
		    is_127_[i_130_] = is_127_[i_130_ - 1];
		is_127_[0] = i_131_;
		((Class412) class412).aByteArray5972[i_129_] = i_131_;
	    }
	    for (int i_132_ = 0; i_132_ < i_123_; i_132_++) {
		int i_133_ = method7778(5, class412);
		for (int i_134_ = 0; i_134_ < i_122_; i_134_++) {
		    for (;;) {
			i_116_ = method7781(class412);
			if (i_116_ == 0)
			    break;
			i_116_ = method7781(class412);
			if (i_116_ == 0)
			    i_133_++;
			else
			    i_133_--;
		    }
		    ((Class412) class412).aByteArrayArray5941[i_132_][i_134_]
			= (byte) i_133_;
		}
	    }
	    for (int i_135_ = 0; i_135_ < i_123_; i_135_++) {
		int i_136_ = 32;
		byte i_137_ = 0;
		for (int i_138_ = 0; i_138_ < i_122_; i_138_++) {
		    if ((((Class412) class412).aByteArrayArray5941[i_135_]
			 [i_138_])
			> i_137_)
			i_137_ = (((Class412) class412).aByteArrayArray5941
				  [i_135_][i_138_]);
		    if ((((Class412) class412).aByteArrayArray5941[i_135_]
			 [i_138_])
			< i_136_)
			i_136_ = (((Class412) class412).aByteArrayArray5941
				  [i_135_][i_138_]);
		}
		method7780(((Class412) class412).anIntArrayArray5974[i_135_],
			   ((Class412) class412).anIntArrayArray5947[i_135_],
			   ((Class412) class412).anIntArrayArray5977[i_135_],
			   ((Class412) class412).aByteArrayArray5941[i_135_],
			   i_136_, i_137_, i_122_);
		((Class412) class412).anIntArray5955[i_135_] = i_136_;
	    }
	    int i_139_ = ((Class412) class412).anInt5976 * 1193465459 + 1;
	    int i_140_ = -1;
	    int i_141_ = 0;
	    for (int i_142_ = 0; i_142_ <= 255; i_142_++)
		((Class412) class412).anIntArray5962[i_142_] = 0;
	    int i_143_ = 4095;
	    for (int i_144_ = 15; i_144_ >= 0; i_144_--) {
		for (int i_145_ = 15; i_145_ >= 0; i_145_--) {
		    ((Class412) class412).aByteArray5970[i_143_]
			= (byte) (i_144_ * 16 + i_145_);
		    i_143_--;
		}
		((Class412) class412).anIntArray5971[i_144_] = i_143_ + 1;
	    }
	    int i_146_ = 0;
	    if (i_141_ == 0) {
		i_140_++;
		i_141_ = 50;
		byte i_147_ = ((Class412) class412).aByteArray5972[i_140_];
		i = ((Class412) class412).anIntArray5955[i_147_];
		is = ((Class412) class412).anIntArrayArray5974[i_147_];
		is_114_ = ((Class412) class412).anIntArrayArray5977[i_147_];
		is_113_ = ((Class412) class412).anIntArrayArray5947[i_147_];
	    }
	    i_141_--;
	    int i_148_ = i;
	    int i_149_;
	    int i_150_;
	    for (i_150_ = method7778(i_148_, class412); i_150_ > is[i_148_];
		 i_150_ = i_150_ << 1 | i_149_) {
		i_148_++;
		i_149_ = method7781(class412);
	    }
	    int i_151_ = is_114_[i_150_ - is_113_[i_148_]];
	    while (i_151_ != i_139_) {
		if (i_151_ == 0 || i_151_ == 1) {
		    int i_152_ = -1;
		    int i_153_ = 1;
		    do {
			if (i_151_ == 0)
			    i_152_ += 1 * i_153_;
			else if (i_151_ == 1)
			    i_152_ += 2 * i_153_;
			i_153_ *= 2;
			if (i_141_ == 0) {
			    i_140_++;
			    i_141_ = 50;
			    byte i_154_
				= ((Class412) class412).aByteArray5972[i_140_];
			    i = ((Class412) class412).anIntArray5955[i_154_];
			    is = (((Class412) class412).anIntArrayArray5974
				  [i_154_]);
			    is_114_ = (((Class412) class412)
				       .anIntArrayArray5977[i_154_]);
			    is_113_ = (((Class412) class412)
				       .anIntArrayArray5947[i_154_]);
			}
			i_141_--;
			i_148_ = i;
			for (i_150_ = method7778(i_148_, class412);
			     i_150_ > is[i_148_];
			     i_150_ = i_150_ << 1 | i_149_) {
			    i_148_++;
			    i_149_ = method7781(class412);
			}
			i_151_ = is_114_[i_150_ - is_113_[i_148_]];
		    } while (i_151_ == 0 || i_151_ == 1);
		    i_152_++;
		    i_117_ = (((Class412) class412).aByteArray5969
			      [((((Class412) class412).aByteArray5970
				 [((Class412) class412).anIntArray5971[0]])
				& 0xff)]);
		    ((Class412) class412).anIntArray5962[i_117_ & 0xff]
			+= i_152_;
		    for (/**/; i_152_ > 0; i_152_--) {
			Class412.anIntArray5965[i_146_] = i_117_ & 0xff;
			i_146_++;
		    }
		} else {
		    int i_155_ = i_151_ - 1;
		    if (i_155_ < 16) {
			int i_156_ = ((Class412) class412).anIntArray5971[0];
			i_116_ = (((Class412) class412).aByteArray5970
				  [i_156_ + i_155_]);
			for (/**/; i_155_ > 3; i_155_ -= 4) {
			    int i_157_ = i_156_ + i_155_;
			    ((Class412) class412).aByteArray5970[i_157_]
				= (((Class412) class412).aByteArray5970
				   [i_157_ - 1]);
			    ((Class412) class412).aByteArray5970[i_157_ - 1]
				= (((Class412) class412).aByteArray5970
				   [i_157_ - 2]);
			    ((Class412) class412).aByteArray5970[i_157_ - 2]
				= (((Class412) class412).aByteArray5970
				   [i_157_ - 3]);
			    ((Class412) class412).aByteArray5970[i_157_ - 3]
				= (((Class412) class412).aByteArray5970
				   [i_157_ - 4]);
			}
			for (/**/; i_155_ > 0; i_155_--)
			    ((Class412) class412).aByteArray5970[(i_156_
								  + i_155_)]
				= (((Class412) class412).aByteArray5970
				   [i_156_ + i_155_ - 1]);
			((Class412) class412).aByteArray5970[i_156_] = i_116_;
		    } else {
			int i_158_ = i_155_ / 16;
			int i_159_ = i_155_ % 16;
			int i_160_
			    = (((Class412) class412).anIntArray5971[i_158_]
			       + i_159_);
			i_116_ = ((Class412) class412).aByteArray5970[i_160_];
			for (/**/;
			     (i_160_
			      > ((Class412) class412).anIntArray5971[i_158_]);
			     i_160_--)
			    ((Class412) class412).aByteArray5970[i_160_]
				= (((Class412) class412).aByteArray5970
				   [i_160_ - 1]);
			((Class412) class412).anIntArray5971[i_158_]++;
			for (/**/; i_158_ > 0; i_158_--) {
			    ((Class412) class412).anIntArray5971[i_158_]--;
			    ((Class412) class412).aByteArray5970
				[((Class412) class412).anIntArray5971[i_158_]]
				= (((Class412) class412).aByteArray5970
				   [(((Class412) class412).anIntArray5971
				     [i_158_ - 1]) + 16 - 1]);
			}
			((Class412) class412).anIntArray5971[0]--;
			((Class412) class412).aByteArray5970
			    [((Class412) class412).anIntArray5971[0]]
			    = i_116_;
			if (((Class412) class412).anIntArray5971[0] == 0) {
			    i_143_ = 4095;
			    for (int i_161_ = 15; i_161_ >= 0; i_161_--) {
				for (int i_162_ = 15; i_162_ >= 0; i_162_--) {
				    ((Class412) class412).aByteArray5970
					[i_143_]
					= (((Class412) class412).aByteArray5970
					   [((((Class412) class412)
					      .anIntArray5971[i_161_])
					     + i_162_)]);
				    i_143_--;
				}
				((Class412) class412).anIntArray5971[i_161_]
				    = i_143_ + 1;
			    }
			}
		    }
		    ((Class412) class412).anIntArray5962
			[(((Class412) class412).aByteArray5969[i_116_ & 0xff]
			  & 0xff)]++;
		    Class412.anIntArray5965[i_146_]
			= (((Class412) class412).aByteArray5969[i_116_ & 0xff]
			   & 0xff);
		    i_146_++;
		    if (i_141_ == 0) {
			i_140_++;
			i_141_ = 50;
			byte i_163_
			    = ((Class412) class412).aByteArray5972[i_140_];
			i = ((Class412) class412).anIntArray5955[i_163_];
			is = ((Class412) class412).anIntArrayArray5974[i_163_];
			is_114_ = (((Class412) class412).anIntArrayArray5977
				   [i_163_]);
			is_113_ = (((Class412) class412).anIntArrayArray5947
				   [i_163_]);
		    }
		    i_141_--;
		    i_148_ = i;
		    for (i_150_ = method7778(i_148_, class412);
			 i_150_ > is[i_148_]; i_150_ = i_150_ << 1 | i_149_) {
			i_148_++;
			i_149_ = method7781(class412);
		    }
		    i_151_ = is_114_[i_150_ - is_113_[i_148_]];
		}
	    }
	    ((Class412) class412).anInt5975 = 0;
	    ((Class412) class412).aByte5954 = (byte) 0;
	    ((Class412) class412).anIntArray5964[0] = 0;
	    for (int i_164_ = 1; i_164_ <= 256; i_164_++)
		((Class412) class412).anIntArray5964[i_164_]
		    = ((Class412) class412).anIntArray5962[i_164_ - 1];
	    for (int i_165_ = 1; i_165_ <= 256; i_165_++)
		((Class412) class412).anIntArray5964[i_165_]
		    += ((Class412) class412).anIntArray5964[i_165_ - 1];
	    for (int i_166_ = 0; i_166_ < i_146_; i_166_++) {
		i_117_ = (byte) (Class412.anIntArray5965[i_166_] & 0xff);
		Class412.anIntArray5965[(((Class412) class412).anIntArray5964
					 [i_117_ & 0xff])]
		    |= i_166_ << 8;
		((Class412) class412).anIntArray5964[i_117_ & 0xff]++;
	    }
	    ((Class412) class412).anInt5960
		= ((Class412.anIntArray5965
		    [((Class412) class412).anInt5957 * 2014686237])
		   >> 8) * -325665473;
	    ((Class412) class412).anInt5963 = 0;
	    ((Class412) class412).anInt5960
		= Class412.anIntArray5965[(((Class412) class412).anInt5960
					   * 1078833855)] * -325665473;
	    ((Class412) class412).anInt5978
		= ((byte) (((Class412) class412).anInt5960 * 1078833855 & 0xff)
		   * 1721751347);
	    Class412 class412_167_;
	    ((Class412) (class412_167_ = class412)).anInt5960
		= ((((Class412) class412_167_).anInt5960 * 1078833855 >> 8)
		   * -325665473);
	    ((Class412) class412).anInt5963 += 1006310741;
	    ((Class412) class412).anInt5966 = i_146_ * -1553475137;
	    method7775(class412);
	    if ((((Class412) class412).anInt5963 * 875315197
		 == ((Class412) class412).anInt5966 * 1678054975 + 1)
		&& ((Class412) class412).anInt5975 * 862242051 == 0)
		bool_115_ = true;
	    else
		bool_115_ = false;
	}
    }
    
    static byte method7777(Class412 class412) {
	return (byte) method7778(8, class412);
    }
    
    Class435() throws Throwable {
	throw new Error();
    }
    
    static int method7778(int i, Class412 class412) {
	for (;;) {
	    if (((Class412) class412).anInt5979 * -1131820017 >= i) {
		int i_168_
		    = ((((Class412) class412).anInt5956 * 967564759
			>> ((Class412) class412).anInt5979 * -1131820017 - i)
		       & (1 << i) - 1);
		((Class412) class412).anInt5979 -= i * -13131025;
		return i_168_;
	    }
	    ((Class412) class412).anInt5956
		= ((((Class412) class412).anInt5956 * 967564759 << 8
		    | (((Class412) class412).aByteArray5959
		       [((Class412) class412).anInt5948 * -2078603107]) & 0xff)
		   * 1696818663);
	    ((Class412) class412).anInt5979 += -105048200;
	    ((Class412) class412).anInt5948 += 1232321973;
	    ((Class412) class412).anInt5950 += 751742763;
	    if (((Class412) class412).anInt5950 * -172058749 == 0) {
		/* empty */
	    }
	}
    }
    
    static byte method7779(Class412 class412) {
	return (byte) method7778(8, class412);
    }
    
    static void method7780(int[] is, int[] is_169_, int[] is_170_,
			   byte[] is_171_, int i, int i_172_, int i_173_) {
	int i_174_ = 0;
	for (int i_175_ = i; i_175_ <= i_172_; i_175_++) {
	    for (int i_176_ = 0; i_176_ < i_173_; i_176_++) {
		if (is_171_[i_176_] == i_175_) {
		    is_170_[i_174_] = i_176_;
		    i_174_++;
		}
	    }
	}
	for (int i_177_ = 0; i_177_ < 23; i_177_++)
	    is_169_[i_177_] = 0;
	for (int i_178_ = 0; i_178_ < i_173_; i_178_++)
	    is_169_[is_171_[i_178_] + 1]++;
	for (int i_179_ = 1; i_179_ < 23; i_179_++)
	    is_169_[i_179_] += is_169_[i_179_ - 1];
	for (int i_180_ = 0; i_180_ < 23; i_180_++)
	    is[i_180_] = 0;
	int i_181_ = 0;
	for (int i_182_ = i; i_182_ <= i_172_; i_182_++) {
	    i_181_ += is_169_[i_182_ + 1] - is_169_[i_182_];
	    is[i_182_] = i_181_ - 1;
	    i_181_ <<= 1;
	}
	for (int i_183_ = i + 1; i_183_ <= i_172_; i_183_++)
	    is_169_[i_183_] = (is[i_183_ - 1] + 1 << 1) - is_169_[i_183_];
    }
    
    static byte method7781(Class412 class412) {
	return (byte) method7778(1, class412);
    }
    
    public static int method7782(byte[] is, int i, byte[] is_184_, int i_185_,
				 int i_186_) {
	synchronized (aClass412_6121) {
	    ((Class412) aClass412_6121).aByteArray5959 = is_184_;
	    ((Class412) aClass412_6121).anInt5948 = i_186_ * 1232321973;
	    ((Class412) aClass412_6121).aByteArray5949 = is;
	    ((Class412) aClass412_6121).anInt5951 = 0;
	    ((Class412) aClass412_6121).anInt5952 = i * -1062146397;
	    ((Class412) aClass412_6121).anInt5979 = 0;
	    ((Class412) aClass412_6121).anInt5956 = 0;
	    ((Class412) aClass412_6121).anInt5950 = 0;
	    ((Class412) aClass412_6121).anInt5953 = 0;
	    method7776(aClass412_6121);
	    i -= ((Class412) aClass412_6121).anInt5952 * -1830144757;
	    ((Class412) aClass412_6121).aByteArray5959 = null;
	    ((Class412) aClass412_6121).aByteArray5949 = null;
	    int i_187_ = i;
	    return i_187_;
	}
    }
    
    public static int method7783(byte[] is, int i, byte[] is_188_, int i_189_,
				 int i_190_) {
	synchronized (aClass412_6121) {
	    ((Class412) aClass412_6121).aByteArray5959 = is_188_;
	    ((Class412) aClass412_6121).anInt5948 = i_190_ * 1232321973;
	    ((Class412) aClass412_6121).aByteArray5949 = is;
	    ((Class412) aClass412_6121).anInt5951 = 0;
	    ((Class412) aClass412_6121).anInt5952 = i * -1062146397;
	    ((Class412) aClass412_6121).anInt5979 = 0;
	    ((Class412) aClass412_6121).anInt5956 = 0;
	    ((Class412) aClass412_6121).anInt5950 = 0;
	    ((Class412) aClass412_6121).anInt5953 = 0;
	    method7776(aClass412_6121);
	    i -= ((Class412) aClass412_6121).anInt5952 * -1830144757;
	    ((Class412) aClass412_6121).aByteArray5959 = null;
	    ((Class412) aClass412_6121).aByteArray5949 = null;
	    int i_191_ = i;
	    return i_191_;
	}
    }
    
    public static int method7784(byte[] is, int i, byte[] is_192_, int i_193_,
				 int i_194_) {
	synchronized (aClass412_6121) {
	    ((Class412) aClass412_6121).aByteArray5959 = is_192_;
	    ((Class412) aClass412_6121).anInt5948 = i_194_ * 1232321973;
	    ((Class412) aClass412_6121).aByteArray5949 = is;
	    ((Class412) aClass412_6121).anInt5951 = 0;
	    ((Class412) aClass412_6121).anInt5952 = i * -1062146397;
	    ((Class412) aClass412_6121).anInt5979 = 0;
	    ((Class412) aClass412_6121).anInt5956 = 0;
	    ((Class412) aClass412_6121).anInt5950 = 0;
	    ((Class412) aClass412_6121).anInt5953 = 0;
	    method7776(aClass412_6121);
	    i -= ((Class412) aClass412_6121).anInt5952 * -1830144757;
	    ((Class412) aClass412_6121).aByteArray5959 = null;
	    ((Class412) aClass412_6121).aByteArray5949 = null;
	    int i_195_ = i;
	    return i_195_;
	}
    }
    
    static void method7785(int[] is, int[] is_196_, int[] is_197_,
			   byte[] is_198_, int i, int i_199_, int i_200_) {
	int i_201_ = 0;
	for (int i_202_ = i; i_202_ <= i_199_; i_202_++) {
	    for (int i_203_ = 0; i_203_ < i_200_; i_203_++) {
		if (is_198_[i_203_] == i_202_) {
		    is_197_[i_201_] = i_203_;
		    i_201_++;
		}
	    }
	}
	for (int i_204_ = 0; i_204_ < 23; i_204_++)
	    is_196_[i_204_] = 0;
	for (int i_205_ = 0; i_205_ < i_200_; i_205_++)
	    is_196_[is_198_[i_205_] + 1]++;
	for (int i_206_ = 1; i_206_ < 23; i_206_++)
	    is_196_[i_206_] += is_196_[i_206_ - 1];
	for (int i_207_ = 0; i_207_ < 23; i_207_++)
	    is[i_207_] = 0;
	int i_208_ = 0;
	for (int i_209_ = i; i_209_ <= i_199_; i_209_++) {
	    i_208_ += is_196_[i_209_ + 1] - is_196_[i_209_];
	    is[i_209_] = i_208_ - 1;
	    i_208_ <<= 1;
	}
	for (int i_210_ = i + 1; i_210_ <= i_199_; i_210_++)
	    is_196_[i_210_] = (is[i_210_ - 1] + 1 << 1) - is_196_[i_210_];
    }
    
    static void method7786(Class412 class412) {
	boolean bool = false;
	boolean bool_211_ = false;
	boolean bool_212_ = false;
	boolean bool_213_ = false;
	boolean bool_214_ = false;
	boolean bool_215_ = false;
	boolean bool_216_ = false;
	boolean bool_217_ = false;
	boolean bool_218_ = false;
	boolean bool_219_ = false;
	boolean bool_220_ = false;
	boolean bool_221_ = false;
	boolean bool_222_ = false;
	boolean bool_223_ = false;
	boolean bool_224_ = false;
	boolean bool_225_ = false;
	boolean bool_226_ = false;
	boolean bool_227_ = false;
	int i = 0;
	int[] is = null;
	int[] is_228_ = null;
	int[] is_229_ = null;
	((Class412) class412).anInt5958 = -919138847;
	if (Class412.anIntArray5965 == null)
	    Class412.anIntArray5965
		= new int[((Class412) class412).anInt5958 * -1943004512];
	boolean bool_230_ = true;
	while (bool_230_) {
	    byte i_231_ = method7777(class412);
	    if (i_231_ == 23)
		break;
	    i_231_ = method7777(class412);
	    i_231_ = method7777(class412);
	    i_231_ = method7777(class412);
	    i_231_ = method7777(class412);
	    i_231_ = method7777(class412);
	    i_231_ = method7777(class412);
	    i_231_ = method7777(class412);
	    i_231_ = method7777(class412);
	    i_231_ = method7777(class412);
	    i_231_ = method7781(class412);
	    if (i_231_ == 0) {
		/* empty */
	    }
	    ((Class412) class412).anInt5957 = 0;
	    int i_232_ = method7777(class412);
	    ((Class412) class412).anInt5957
		= (((Class412) class412).anInt5957 * 2014686237 << 8
		   | i_232_ & 0xff) * 461796917;
	    i_232_ = method7777(class412);
	    ((Class412) class412).anInt5957
		= (((Class412) class412).anInt5957 * 2014686237 << 8
		   | i_232_ & 0xff) * 461796917;
	    i_232_ = method7777(class412);
	    ((Class412) class412).anInt5957
		= (((Class412) class412).anInt5957 * 2014686237 << 8
		   | i_232_ & 0xff) * 461796917;
	    for (int i_233_ = 0; i_233_ < 16; i_233_++) {
		i_231_ = method7781(class412);
		if (i_231_ == 1)
		    ((Class412) class412).aBoolArray5968[i_233_] = true;
		else
		    ((Class412) class412).aBoolArray5968[i_233_] = false;
	    }
	    for (int i_234_ = 0; i_234_ < 256; i_234_++)
		((Class412) class412).aBoolArray5967[i_234_] = false;
	    for (int i_235_ = 0; i_235_ < 16; i_235_++) {
		if (((Class412) class412).aBoolArray5968[i_235_]) {
		    for (int i_236_ = 0; i_236_ < 16; i_236_++) {
			i_231_ = method7781(class412);
			if (i_231_ == 1)
			    ((Class412) class412).aBoolArray5967[(i_235_ * 16
								  + i_236_)]
				= true;
		    }
		}
	    }
	    method7788(class412);
	    int i_237_ = ((Class412) class412).anInt5976 * 1193465459 + 2;
	    int i_238_ = method7778(3, class412);
	    int i_239_ = method7778(15, class412);
	    for (int i_240_ = 0; i_240_ < i_239_; i_240_++) {
		int i_241_ = 0;
		for (;;) {
		    i_231_ = method7781(class412);
		    if (i_231_ == 0)
			break;
		    i_241_++;
		}
		((Class412) class412).aByteArray5973[i_240_] = (byte) i_241_;
	    }
	    byte[] is_242_ = new byte[6];
	    for (byte i_243_ = 0; i_243_ < i_238_; i_243_++)
		is_242_[i_243_] = i_243_;
	    for (int i_244_ = 0; i_244_ < i_239_; i_244_++) {
		byte i_245_ = ((Class412) class412).aByteArray5973[i_244_];
		byte i_246_ = is_242_[i_245_];
		for (/**/; i_245_ > 0; i_245_--)
		    is_242_[i_245_] = is_242_[i_245_ - 1];
		is_242_[0] = i_246_;
		((Class412) class412).aByteArray5972[i_244_] = i_246_;
	    }
	    for (int i_247_ = 0; i_247_ < i_238_; i_247_++) {
		int i_248_ = method7778(5, class412);
		for (int i_249_ = 0; i_249_ < i_237_; i_249_++) {
		    for (;;) {
			i_231_ = method7781(class412);
			if (i_231_ == 0)
			    break;
			i_231_ = method7781(class412);
			if (i_231_ == 0)
			    i_248_++;
			else
			    i_248_--;
		    }
		    ((Class412) class412).aByteArrayArray5941[i_247_][i_249_]
			= (byte) i_248_;
		}
	    }
	    for (int i_250_ = 0; i_250_ < i_238_; i_250_++) {
		int i_251_ = 32;
		byte i_252_ = 0;
		for (int i_253_ = 0; i_253_ < i_237_; i_253_++) {
		    if ((((Class412) class412).aByteArrayArray5941[i_250_]
			 [i_253_])
			> i_252_)
			i_252_ = (((Class412) class412).aByteArrayArray5941
				  [i_250_][i_253_]);
		    if ((((Class412) class412).aByteArrayArray5941[i_250_]
			 [i_253_])
			< i_251_)
			i_251_ = (((Class412) class412).aByteArrayArray5941
				  [i_250_][i_253_]);
		}
		method7780(((Class412) class412).anIntArrayArray5974[i_250_],
			   ((Class412) class412).anIntArrayArray5947[i_250_],
			   ((Class412) class412).anIntArrayArray5977[i_250_],
			   ((Class412) class412).aByteArrayArray5941[i_250_],
			   i_251_, i_252_, i_237_);
		((Class412) class412).anIntArray5955[i_250_] = i_251_;
	    }
	    int i_254_ = ((Class412) class412).anInt5976 * 1193465459 + 1;
	    int i_255_ = -1;
	    int i_256_ = 0;
	    for (int i_257_ = 0; i_257_ <= 255; i_257_++)
		((Class412) class412).anIntArray5962[i_257_] = 0;
	    int i_258_ = 4095;
	    for (int i_259_ = 15; i_259_ >= 0; i_259_--) {
		for (int i_260_ = 15; i_260_ >= 0; i_260_--) {
		    ((Class412) class412).aByteArray5970[i_258_]
			= (byte) (i_259_ * 16 + i_260_);
		    i_258_--;
		}
		((Class412) class412).anIntArray5971[i_259_] = i_258_ + 1;
	    }
	    int i_261_ = 0;
	    if (i_256_ == 0) {
		i_255_++;
		i_256_ = 50;
		byte i_262_ = ((Class412) class412).aByteArray5972[i_255_];
		i = ((Class412) class412).anIntArray5955[i_262_];
		is = ((Class412) class412).anIntArrayArray5974[i_262_];
		is_229_ = ((Class412) class412).anIntArrayArray5977[i_262_];
		is_228_ = ((Class412) class412).anIntArrayArray5947[i_262_];
	    }
	    i_256_--;
	    int i_263_ = i;
	    int i_264_;
	    int i_265_;
	    for (i_265_ = method7778(i_263_, class412); i_265_ > is[i_263_];
		 i_265_ = i_265_ << 1 | i_264_) {
		i_263_++;
		i_264_ = method7781(class412);
	    }
	    int i_266_ = is_229_[i_265_ - is_228_[i_263_]];
	    while (i_266_ != i_254_) {
		if (i_266_ == 0 || i_266_ == 1) {
		    int i_267_ = -1;
		    int i_268_ = 1;
		    do {
			if (i_266_ == 0)
			    i_267_ += 1 * i_268_;
			else if (i_266_ == 1)
			    i_267_ += 2 * i_268_;
			i_268_ *= 2;
			if (i_256_ == 0) {
			    i_255_++;
			    i_256_ = 50;
			    byte i_269_
				= ((Class412) class412).aByteArray5972[i_255_];
			    i = ((Class412) class412).anIntArray5955[i_269_];
			    is = (((Class412) class412).anIntArrayArray5974
				  [i_269_]);
			    is_229_ = (((Class412) class412)
				       .anIntArrayArray5977[i_269_]);
			    is_228_ = (((Class412) class412)
				       .anIntArrayArray5947[i_269_]);
			}
			i_256_--;
			i_263_ = i;
			for (i_265_ = method7778(i_263_, class412);
			     i_265_ > is[i_263_];
			     i_265_ = i_265_ << 1 | i_264_) {
			    i_263_++;
			    i_264_ = method7781(class412);
			}
			i_266_ = is_229_[i_265_ - is_228_[i_263_]];
		    } while (i_266_ == 0 || i_266_ == 1);
		    i_267_++;
		    i_232_ = (((Class412) class412).aByteArray5969
			      [((((Class412) class412).aByteArray5970
				 [((Class412) class412).anIntArray5971[0]])
				& 0xff)]);
		    ((Class412) class412).anIntArray5962[i_232_ & 0xff]
			+= i_267_;
		    for (/**/; i_267_ > 0; i_267_--) {
			Class412.anIntArray5965[i_261_] = i_232_ & 0xff;
			i_261_++;
		    }
		} else {
		    int i_270_ = i_266_ - 1;
		    if (i_270_ < 16) {
			int i_271_ = ((Class412) class412).anIntArray5971[0];
			i_231_ = (((Class412) class412).aByteArray5970
				  [i_271_ + i_270_]);
			for (/**/; i_270_ > 3; i_270_ -= 4) {
			    int i_272_ = i_271_ + i_270_;
			    ((Class412) class412).aByteArray5970[i_272_]
				= (((Class412) class412).aByteArray5970
				   [i_272_ - 1]);
			    ((Class412) class412).aByteArray5970[i_272_ - 1]
				= (((Class412) class412).aByteArray5970
				   [i_272_ - 2]);
			    ((Class412) class412).aByteArray5970[i_272_ - 2]
				= (((Class412) class412).aByteArray5970
				   [i_272_ - 3]);
			    ((Class412) class412).aByteArray5970[i_272_ - 3]
				= (((Class412) class412).aByteArray5970
				   [i_272_ - 4]);
			}
			for (/**/; i_270_ > 0; i_270_--)
			    ((Class412) class412).aByteArray5970[(i_271_
								  + i_270_)]
				= (((Class412) class412).aByteArray5970
				   [i_271_ + i_270_ - 1]);
			((Class412) class412).aByteArray5970[i_271_] = i_231_;
		    } else {
			int i_273_ = i_270_ / 16;
			int i_274_ = i_270_ % 16;
			int i_275_
			    = (((Class412) class412).anIntArray5971[i_273_]
			       + i_274_);
			i_231_ = ((Class412) class412).aByteArray5970[i_275_];
			for (/**/;
			     (i_275_
			      > ((Class412) class412).anIntArray5971[i_273_]);
			     i_275_--)
			    ((Class412) class412).aByteArray5970[i_275_]
				= (((Class412) class412).aByteArray5970
				   [i_275_ - 1]);
			((Class412) class412).anIntArray5971[i_273_]++;
			for (/**/; i_273_ > 0; i_273_--) {
			    ((Class412) class412).anIntArray5971[i_273_]--;
			    ((Class412) class412).aByteArray5970
				[((Class412) class412).anIntArray5971[i_273_]]
				= (((Class412) class412).aByteArray5970
				   [(((Class412) class412).anIntArray5971
				     [i_273_ - 1]) + 16 - 1]);
			}
			((Class412) class412).anIntArray5971[0]--;
			((Class412) class412).aByteArray5970
			    [((Class412) class412).anIntArray5971[0]]
			    = i_231_;
			if (((Class412) class412).anIntArray5971[0] == 0) {
			    i_258_ = 4095;
			    for (int i_276_ = 15; i_276_ >= 0; i_276_--) {
				for (int i_277_ = 15; i_277_ >= 0; i_277_--) {
				    ((Class412) class412).aByteArray5970
					[i_258_]
					= (((Class412) class412).aByteArray5970
					   [((((Class412) class412)
					      .anIntArray5971[i_276_])
					     + i_277_)]);
				    i_258_--;
				}
				((Class412) class412).anIntArray5971[i_276_]
				    = i_258_ + 1;
			    }
			}
		    }
		    ((Class412) class412).anIntArray5962
			[(((Class412) class412).aByteArray5969[i_231_ & 0xff]
			  & 0xff)]++;
		    Class412.anIntArray5965[i_261_]
			= (((Class412) class412).aByteArray5969[i_231_ & 0xff]
			   & 0xff);
		    i_261_++;
		    if (i_256_ == 0) {
			i_255_++;
			i_256_ = 50;
			byte i_278_
			    = ((Class412) class412).aByteArray5972[i_255_];
			i = ((Class412) class412).anIntArray5955[i_278_];
			is = ((Class412) class412).anIntArrayArray5974[i_278_];
			is_229_ = (((Class412) class412).anIntArrayArray5977
				   [i_278_]);
			is_228_ = (((Class412) class412).anIntArrayArray5947
				   [i_278_]);
		    }
		    i_256_--;
		    i_263_ = i;
		    for (i_265_ = method7778(i_263_, class412);
			 i_265_ > is[i_263_]; i_265_ = i_265_ << 1 | i_264_) {
			i_263_++;
			i_264_ = method7781(class412);
		    }
		    i_266_ = is_229_[i_265_ - is_228_[i_263_]];
		}
	    }
	    ((Class412) class412).anInt5975 = 0;
	    ((Class412) class412).aByte5954 = (byte) 0;
	    ((Class412) class412).anIntArray5964[0] = 0;
	    for (int i_279_ = 1; i_279_ <= 256; i_279_++)
		((Class412) class412).anIntArray5964[i_279_]
		    = ((Class412) class412).anIntArray5962[i_279_ - 1];
	    for (int i_280_ = 1; i_280_ <= 256; i_280_++)
		((Class412) class412).anIntArray5964[i_280_]
		    += ((Class412) class412).anIntArray5964[i_280_ - 1];
	    for (int i_281_ = 0; i_281_ < i_261_; i_281_++) {
		i_232_ = (byte) (Class412.anIntArray5965[i_281_] & 0xff);
		Class412.anIntArray5965[(((Class412) class412).anIntArray5964
					 [i_232_ & 0xff])]
		    |= i_281_ << 8;
		((Class412) class412).anIntArray5964[i_232_ & 0xff]++;
	    }
	    ((Class412) class412).anInt5960
		= ((Class412.anIntArray5965
		    [((Class412) class412).anInt5957 * 2014686237])
		   >> 8) * -325665473;
	    ((Class412) class412).anInt5963 = 0;
	    ((Class412) class412).anInt5960
		= Class412.anIntArray5965[(((Class412) class412).anInt5960
					   * 1078833855)] * -325665473;
	    ((Class412) class412).anInt5978
		= ((byte) (((Class412) class412).anInt5960 * 1078833855 & 0xff)
		   * 1721751347);
	    Class412 class412_282_;
	    ((Class412) (class412_282_ = class412)).anInt5960
		= ((((Class412) class412_282_).anInt5960 * 1078833855 >> 8)
		   * -325665473);
	    ((Class412) class412).anInt5963 += 1006310741;
	    ((Class412) class412).anInt5966 = i_261_ * -1553475137;
	    method7775(class412);
	    if ((((Class412) class412).anInt5963 * 875315197
		 == ((Class412) class412).anInt5966 * 1678054975 + 1)
		&& ((Class412) class412).anInt5975 * 862242051 == 0)
		bool_230_ = true;
	    else
		bool_230_ = false;
	}
    }
    
    static byte method7787(Class412 class412) {
	return (byte) method7778(8, class412);
    }
    
    static void method7788(Class412 class412) {
	((Class412) class412).anInt5976 = 0;
	for (int i = 0; i < 256; i++) {
	    if (((Class412) class412).aBoolArray5967[i]) {
		((Class412) class412).aByteArray5969
		    [((Class412) class412).anInt5976 * 1193465459]
		    = (byte) i;
		((Class412) class412).anInt5976 += 453820091;
	    }
	}
    }
    
    static byte method7789(Class412 class412) {
	return (byte) method7778(1, class412);
    }
    
    static void method7790(Class412 class412) {
	boolean bool = false;
	boolean bool_283_ = false;
	boolean bool_284_ = false;
	boolean bool_285_ = false;
	boolean bool_286_ = false;
	boolean bool_287_ = false;
	boolean bool_288_ = false;
	boolean bool_289_ = false;
	boolean bool_290_ = false;
	boolean bool_291_ = false;
	boolean bool_292_ = false;
	boolean bool_293_ = false;
	boolean bool_294_ = false;
	boolean bool_295_ = false;
	boolean bool_296_ = false;
	boolean bool_297_ = false;
	boolean bool_298_ = false;
	boolean bool_299_ = false;
	int i = 0;
	int[] is = null;
	int[] is_300_ = null;
	int[] is_301_ = null;
	((Class412) class412).anInt5958 = -919138847;
	if (Class412.anIntArray5965 == null)
	    Class412.anIntArray5965
		= new int[((Class412) class412).anInt5958 * -1943004512];
	boolean bool_302_ = true;
	while (bool_302_) {
	    byte i_303_ = method7777(class412);
	    if (i_303_ == 23)
		break;
	    i_303_ = method7777(class412);
	    i_303_ = method7777(class412);
	    i_303_ = method7777(class412);
	    i_303_ = method7777(class412);
	    i_303_ = method7777(class412);
	    i_303_ = method7777(class412);
	    i_303_ = method7777(class412);
	    i_303_ = method7777(class412);
	    i_303_ = method7777(class412);
	    i_303_ = method7781(class412);
	    if (i_303_ == 0) {
		/* empty */
	    }
	    ((Class412) class412).anInt5957 = 0;
	    int i_304_ = method7777(class412);
	    ((Class412) class412).anInt5957
		= (((Class412) class412).anInt5957 * 2014686237 << 8
		   | i_304_ & 0xff) * 461796917;
	    i_304_ = method7777(class412);
	    ((Class412) class412).anInt5957
		= (((Class412) class412).anInt5957 * 2014686237 << 8
		   | i_304_ & 0xff) * 461796917;
	    i_304_ = method7777(class412);
	    ((Class412) class412).anInt5957
		= (((Class412) class412).anInt5957 * 2014686237 << 8
		   | i_304_ & 0xff) * 461796917;
	    for (int i_305_ = 0; i_305_ < 16; i_305_++) {
		i_303_ = method7781(class412);
		if (i_303_ == 1)
		    ((Class412) class412).aBoolArray5968[i_305_] = true;
		else
		    ((Class412) class412).aBoolArray5968[i_305_] = false;
	    }
	    for (int i_306_ = 0; i_306_ < 256; i_306_++)
		((Class412) class412).aBoolArray5967[i_306_] = false;
	    for (int i_307_ = 0; i_307_ < 16; i_307_++) {
		if (((Class412) class412).aBoolArray5968[i_307_]) {
		    for (int i_308_ = 0; i_308_ < 16; i_308_++) {
			i_303_ = method7781(class412);
			if (i_303_ == 1)
			    ((Class412) class412).aBoolArray5967[(i_307_ * 16
								  + i_308_)]
				= true;
		    }
		}
	    }
	    method7788(class412);
	    int i_309_ = ((Class412) class412).anInt5976 * 1193465459 + 2;
	    int i_310_ = method7778(3, class412);
	    int i_311_ = method7778(15, class412);
	    for (int i_312_ = 0; i_312_ < i_311_; i_312_++) {
		int i_313_ = 0;
		for (;;) {
		    i_303_ = method7781(class412);
		    if (i_303_ == 0)
			break;
		    i_313_++;
		}
		((Class412) class412).aByteArray5973[i_312_] = (byte) i_313_;
	    }
	    byte[] is_314_ = new byte[6];
	    for (byte i_315_ = 0; i_315_ < i_310_; i_315_++)
		is_314_[i_315_] = i_315_;
	    for (int i_316_ = 0; i_316_ < i_311_; i_316_++) {
		byte i_317_ = ((Class412) class412).aByteArray5973[i_316_];
		byte i_318_ = is_314_[i_317_];
		for (/**/; i_317_ > 0; i_317_--)
		    is_314_[i_317_] = is_314_[i_317_ - 1];
		is_314_[0] = i_318_;
		((Class412) class412).aByteArray5972[i_316_] = i_318_;
	    }
	    for (int i_319_ = 0; i_319_ < i_310_; i_319_++) {
		int i_320_ = method7778(5, class412);
		for (int i_321_ = 0; i_321_ < i_309_; i_321_++) {
		    for (;;) {
			i_303_ = method7781(class412);
			if (i_303_ == 0)
			    break;
			i_303_ = method7781(class412);
			if (i_303_ == 0)
			    i_320_++;
			else
			    i_320_--;
		    }
		    ((Class412) class412).aByteArrayArray5941[i_319_][i_321_]
			= (byte) i_320_;
		}
	    }
	    for (int i_322_ = 0; i_322_ < i_310_; i_322_++) {
		int i_323_ = 32;
		byte i_324_ = 0;
		for (int i_325_ = 0; i_325_ < i_309_; i_325_++) {
		    if ((((Class412) class412).aByteArrayArray5941[i_322_]
			 [i_325_])
			> i_324_)
			i_324_ = (((Class412) class412).aByteArrayArray5941
				  [i_322_][i_325_]);
		    if ((((Class412) class412).aByteArrayArray5941[i_322_]
			 [i_325_])
			< i_323_)
			i_323_ = (((Class412) class412).aByteArrayArray5941
				  [i_322_][i_325_]);
		}
		method7780(((Class412) class412).anIntArrayArray5974[i_322_],
			   ((Class412) class412).anIntArrayArray5947[i_322_],
			   ((Class412) class412).anIntArrayArray5977[i_322_],
			   ((Class412) class412).aByteArrayArray5941[i_322_],
			   i_323_, i_324_, i_309_);
		((Class412) class412).anIntArray5955[i_322_] = i_323_;
	    }
	    int i_326_ = ((Class412) class412).anInt5976 * 1193465459 + 1;
	    int i_327_ = -1;
	    int i_328_ = 0;
	    for (int i_329_ = 0; i_329_ <= 255; i_329_++)
		((Class412) class412).anIntArray5962[i_329_] = 0;
	    int i_330_ = 4095;
	    for (int i_331_ = 15; i_331_ >= 0; i_331_--) {
		for (int i_332_ = 15; i_332_ >= 0; i_332_--) {
		    ((Class412) class412).aByteArray5970[i_330_]
			= (byte) (i_331_ * 16 + i_332_);
		    i_330_--;
		}
		((Class412) class412).anIntArray5971[i_331_] = i_330_ + 1;
	    }
	    int i_333_ = 0;
	    if (i_328_ == 0) {
		i_327_++;
		i_328_ = 50;
		byte i_334_ = ((Class412) class412).aByteArray5972[i_327_];
		i = ((Class412) class412).anIntArray5955[i_334_];
		is = ((Class412) class412).anIntArrayArray5974[i_334_];
		is_301_ = ((Class412) class412).anIntArrayArray5977[i_334_];
		is_300_ = ((Class412) class412).anIntArrayArray5947[i_334_];
	    }
	    i_328_--;
	    int i_335_ = i;
	    int i_336_;
	    int i_337_;
	    for (i_337_ = method7778(i_335_, class412); i_337_ > is[i_335_];
		 i_337_ = i_337_ << 1 | i_336_) {
		i_335_++;
		i_336_ = method7781(class412);
	    }
	    int i_338_ = is_301_[i_337_ - is_300_[i_335_]];
	    while (i_338_ != i_326_) {
		if (i_338_ == 0 || i_338_ == 1) {
		    int i_339_ = -1;
		    int i_340_ = 1;
		    do {
			if (i_338_ == 0)
			    i_339_ += 1 * i_340_;
			else if (i_338_ == 1)
			    i_339_ += 2 * i_340_;
			i_340_ *= 2;
			if (i_328_ == 0) {
			    i_327_++;
			    i_328_ = 50;
			    byte i_341_
				= ((Class412) class412).aByteArray5972[i_327_];
			    i = ((Class412) class412).anIntArray5955[i_341_];
			    is = (((Class412) class412).anIntArrayArray5974
				  [i_341_]);
			    is_301_ = (((Class412) class412)
				       .anIntArrayArray5977[i_341_]);
			    is_300_ = (((Class412) class412)
				       .anIntArrayArray5947[i_341_]);
			}
			i_328_--;
			i_335_ = i;
			for (i_337_ = method7778(i_335_, class412);
			     i_337_ > is[i_335_];
			     i_337_ = i_337_ << 1 | i_336_) {
			    i_335_++;
			    i_336_ = method7781(class412);
			}
			i_338_ = is_301_[i_337_ - is_300_[i_335_]];
		    } while (i_338_ == 0 || i_338_ == 1);
		    i_339_++;
		    i_304_ = (((Class412) class412).aByteArray5969
			      [((((Class412) class412).aByteArray5970
				 [((Class412) class412).anIntArray5971[0]])
				& 0xff)]);
		    ((Class412) class412).anIntArray5962[i_304_ & 0xff]
			+= i_339_;
		    for (/**/; i_339_ > 0; i_339_--) {
			Class412.anIntArray5965[i_333_] = i_304_ & 0xff;
			i_333_++;
		    }
		} else {
		    int i_342_ = i_338_ - 1;
		    if (i_342_ < 16) {
			int i_343_ = ((Class412) class412).anIntArray5971[0];
			i_303_ = (((Class412) class412).aByteArray5970
				  [i_343_ + i_342_]);
			for (/**/; i_342_ > 3; i_342_ -= 4) {
			    int i_344_ = i_343_ + i_342_;
			    ((Class412) class412).aByteArray5970[i_344_]
				= (((Class412) class412).aByteArray5970
				   [i_344_ - 1]);
			    ((Class412) class412).aByteArray5970[i_344_ - 1]
				= (((Class412) class412).aByteArray5970
				   [i_344_ - 2]);
			    ((Class412) class412).aByteArray5970[i_344_ - 2]
				= (((Class412) class412).aByteArray5970
				   [i_344_ - 3]);
			    ((Class412) class412).aByteArray5970[i_344_ - 3]
				= (((Class412) class412).aByteArray5970
				   [i_344_ - 4]);
			}
			for (/**/; i_342_ > 0; i_342_--)
			    ((Class412) class412).aByteArray5970[(i_343_
								  + i_342_)]
				= (((Class412) class412).aByteArray5970
				   [i_343_ + i_342_ - 1]);
			((Class412) class412).aByteArray5970[i_343_] = i_303_;
		    } else {
			int i_345_ = i_342_ / 16;
			int i_346_ = i_342_ % 16;
			int i_347_
			    = (((Class412) class412).anIntArray5971[i_345_]
			       + i_346_);
			i_303_ = ((Class412) class412).aByteArray5970[i_347_];
			for (/**/;
			     (i_347_
			      > ((Class412) class412).anIntArray5971[i_345_]);
			     i_347_--)
			    ((Class412) class412).aByteArray5970[i_347_]
				= (((Class412) class412).aByteArray5970
				   [i_347_ - 1]);
			((Class412) class412).anIntArray5971[i_345_]++;
			for (/**/; i_345_ > 0; i_345_--) {
			    ((Class412) class412).anIntArray5971[i_345_]--;
			    ((Class412) class412).aByteArray5970
				[((Class412) class412).anIntArray5971[i_345_]]
				= (((Class412) class412).aByteArray5970
				   [(((Class412) class412).anIntArray5971
				     [i_345_ - 1]) + 16 - 1]);
			}
			((Class412) class412).anIntArray5971[0]--;
			((Class412) class412).aByteArray5970
			    [((Class412) class412).anIntArray5971[0]]
			    = i_303_;
			if (((Class412) class412).anIntArray5971[0] == 0) {
			    i_330_ = 4095;
			    for (int i_348_ = 15; i_348_ >= 0; i_348_--) {
				for (int i_349_ = 15; i_349_ >= 0; i_349_--) {
				    ((Class412) class412).aByteArray5970
					[i_330_]
					= (((Class412) class412).aByteArray5970
					   [((((Class412) class412)
					      .anIntArray5971[i_348_])
					     + i_349_)]);
				    i_330_--;
				}
				((Class412) class412).anIntArray5971[i_348_]
				    = i_330_ + 1;
			    }
			}
		    }
		    ((Class412) class412).anIntArray5962
			[(((Class412) class412).aByteArray5969[i_303_ & 0xff]
			  & 0xff)]++;
		    Class412.anIntArray5965[i_333_]
			= (((Class412) class412).aByteArray5969[i_303_ & 0xff]
			   & 0xff);
		    i_333_++;
		    if (i_328_ == 0) {
			i_327_++;
			i_328_ = 50;
			byte i_350_
			    = ((Class412) class412).aByteArray5972[i_327_];
			i = ((Class412) class412).anIntArray5955[i_350_];
			is = ((Class412) class412).anIntArrayArray5974[i_350_];
			is_301_ = (((Class412) class412).anIntArrayArray5977
				   [i_350_]);
			is_300_ = (((Class412) class412).anIntArrayArray5947
				   [i_350_]);
		    }
		    i_328_--;
		    i_335_ = i;
		    for (i_337_ = method7778(i_335_, class412);
			 i_337_ > is[i_335_]; i_337_ = i_337_ << 1 | i_336_) {
			i_335_++;
			i_336_ = method7781(class412);
		    }
		    i_338_ = is_301_[i_337_ - is_300_[i_335_]];
		}
	    }
	    ((Class412) class412).anInt5975 = 0;
	    ((Class412) class412).aByte5954 = (byte) 0;
	    ((Class412) class412).anIntArray5964[0] = 0;
	    for (int i_351_ = 1; i_351_ <= 256; i_351_++)
		((Class412) class412).anIntArray5964[i_351_]
		    = ((Class412) class412).anIntArray5962[i_351_ - 1];
	    for (int i_352_ = 1; i_352_ <= 256; i_352_++)
		((Class412) class412).anIntArray5964[i_352_]
		    += ((Class412) class412).anIntArray5964[i_352_ - 1];
	    for (int i_353_ = 0; i_353_ < i_333_; i_353_++) {
		i_304_ = (byte) (Class412.anIntArray5965[i_353_] & 0xff);
		Class412.anIntArray5965[(((Class412) class412).anIntArray5964
					 [i_304_ & 0xff])]
		    |= i_353_ << 8;
		((Class412) class412).anIntArray5964[i_304_ & 0xff]++;
	    }
	    ((Class412) class412).anInt5960
		= ((Class412.anIntArray5965
		    [((Class412) class412).anInt5957 * 2014686237])
		   >> 8) * -325665473;
	    ((Class412) class412).anInt5963 = 0;
	    ((Class412) class412).anInt5960
		= Class412.anIntArray5965[(((Class412) class412).anInt5960
					   * 1078833855)] * -325665473;
	    ((Class412) class412).anInt5978
		= ((byte) (((Class412) class412).anInt5960 * 1078833855 & 0xff)
		   * 1721751347);
	    Class412 class412_354_;
	    ((Class412) (class412_354_ = class412)).anInt5960
		= ((((Class412) class412_354_).anInt5960 * 1078833855 >> 8)
		   * -325665473);
	    ((Class412) class412).anInt5963 += 1006310741;
	    ((Class412) class412).anInt5966 = i_333_ * -1553475137;
	    method7775(class412);
	    if ((((Class412) class412).anInt5963 * 875315197
		 == ((Class412) class412).anInt5966 * 1678054975 + 1)
		&& ((Class412) class412).anInt5975 * 862242051 == 0)
		bool_302_ = true;
	    else
		bool_302_ = false;
	}
    }
    
    static void method7791(Class412 class412) {
	((Class412) class412).anInt5976 = 0;
	for (int i = 0; i < 256; i++) {
	    if (((Class412) class412).aBoolArray5967[i]) {
		((Class412) class412).aByteArray5969
		    [((Class412) class412).anInt5976 * 1193465459]
		    = (byte) i;
		((Class412) class412).anInt5976 += 453820091;
	    }
	}
    }
    
    static void method7792(Class412 class412) {
	((Class412) class412).anInt5976 = 0;
	for (int i = 0; i < 256; i++) {
	    if (((Class412) class412).aBoolArray5967[i]) {
		((Class412) class412).aByteArray5969
		    [((Class412) class412).anInt5976 * 1193465459]
		    = (byte) i;
		((Class412) class412).anInt5976 += 453820091;
	    }
	}
    }
    
    static int method7793(int i, Class412 class412) {
	for (;;) {
	    if (((Class412) class412).anInt5979 * -1131820017 >= i) {
		int i_355_
		    = ((((Class412) class412).anInt5956 * 967564759
			>> ((Class412) class412).anInt5979 * -1131820017 - i)
		       & (1 << i) - 1);
		((Class412) class412).anInt5979 -= i * -13131025;
		return i_355_;
	    }
	    ((Class412) class412).anInt5956
		= ((((Class412) class412).anInt5956 * 967564759 << 8
		    | (((Class412) class412).aByteArray5959
		       [((Class412) class412).anInt5948 * -2078603107]) & 0xff)
		   * 1696818663);
	    ((Class412) class412).anInt5979 += -105048200;
	    ((Class412) class412).anInt5948 += 1232321973;
	    ((Class412) class412).anInt5950 += 751742763;
	    if (((Class412) class412).anInt5950 * -172058749 == 0) {
		/* empty */
	    }
	}
    }
    
    static void method7794(int[] is, int[] is_356_, int[] is_357_,
			   byte[] is_358_, int i, int i_359_, int i_360_) {
	int i_361_ = 0;
	for (int i_362_ = i; i_362_ <= i_359_; i_362_++) {
	    for (int i_363_ = 0; i_363_ < i_360_; i_363_++) {
		if (is_358_[i_363_] == i_362_) {
		    is_357_[i_361_] = i_363_;
		    i_361_++;
		}
	    }
	}
	for (int i_364_ = 0; i_364_ < 23; i_364_++)
	    is_356_[i_364_] = 0;
	for (int i_365_ = 0; i_365_ < i_360_; i_365_++)
	    is_356_[is_358_[i_365_] + 1]++;
	for (int i_366_ = 1; i_366_ < 23; i_366_++)
	    is_356_[i_366_] += is_356_[i_366_ - 1];
	for (int i_367_ = 0; i_367_ < 23; i_367_++)
	    is[i_367_] = 0;
	int i_368_ = 0;
	for (int i_369_ = i; i_369_ <= i_359_; i_369_++) {
	    i_368_ += is_356_[i_369_ + 1] - is_356_[i_369_];
	    is[i_369_] = i_368_ - 1;
	    i_368_ <<= 1;
	}
	for (int i_370_ = i + 1; i_370_ <= i_359_; i_370_++)
	    is_356_[i_370_] = (is[i_370_ - 1] + 1 << 1) - is_356_[i_370_];
    }
}
