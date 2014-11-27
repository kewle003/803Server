/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class34
{
    int[] anIntArray364;
    float[][] aFloatArrayArray365;
    int[] anIntArray366;
    int anInt367 = 0;
    int[] anIntArray368;
    int anInt369;
    int anInt370 = 0;
    int anInt371;
    
    float[] method976(Class57 class57) {
	return ((Class34) this).aFloatArrayArray365[method984(class57)];
    }
    
    static int method977(int i, int i_0_) {
	int i_1_ = (int) Math.pow((double) i, 1.0 / (double) i_0_) + 1;
	for (;;) {
	    int i_2_ = i_1_;
	    int i_3_ = i_0_;
	    int i_4_ = 1;
	    for (/**/; i_3_ > 1; i_3_ >>= 1) {
		if ((i_3_ & 0x1) != 0)
		    i_4_ *= i_2_;
		i_2_ *= i_2_;
	    }
	    int i_5_;
	    if (i_3_ == 1)
		i_5_ = i_2_ * i_4_;
	    else
		i_5_ = i_4_;
	    if (i_5_ <= i)
		break;
	    i_1_--;
	}
	return i_1_;
    }
    
    void method978(Class57 class57) {
	class57.method1441(((Class34) this).anInt367 * 8
			   + ((Class34) this).anInt370);
    }
    
    void method979(Class57 class57) {
	int i = class57.method1462();
	int i_6_ = class57.method1399();
	class57.method1441(24);
	((Class34) this).anInt371 = class57.method1441(16);
	((Class34) this).anInt369 = class57.method1441(24);
	if (((Class34) this).anIntArray364 == null
	    || (((Class34) this).anIntArray364.length
		!= ((Class34) this).anInt369))
	    ((Class34) this).anIntArray364
		= new int[((Class34) this).anInt369];
	boolean bool = class57.method1411() != 0;
	if (bool) {
	    int i_7_ = 0;
	    int i_8_ = class57.method1441(5) + 1;
	    while (i_7_ < ((Class34) this).anInt369) {
		int i_9_
		    = class57.method1441(Class436.method7795(((((Class34) this)
							       .anInt369)
							      - i_7_),
							     (byte) -37));
		for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
		    ((Class34) this).anIntArray364[i_7_++] = i_8_;
		i_8_++;
	    }
	} else {
	    boolean bool_11_ = class57.method1411() != 0;
	    for (int i_12_ = 0; i_12_ < ((Class34) this).anInt369; i_12_++) {
		if (bool_11_ && class57.method1411() == 0)
		    ((Class34) this).anIntArray364[i_12_] = 0;
		else
		    ((Class34) this).anIntArray364[i_12_]
			= class57.method1441(5) + 1;
	    }
	}
	method980();
	int i_13_ = class57.method1441(4);
	if (i_13_ > 0) {
	    float f = class57.method1504(class57.method1441(32));
	    float f_14_ = class57.method1504(class57.method1441(32));
	    int i_15_ = class57.method1441(4) + 1;
	    boolean bool_16_ = class57.method1411() != 0;
	    int i_17_;
	    if (i_13_ == 1)
		i_17_ = method977(((Class34) this).anInt369,
				  ((Class34) this).anInt371);
	    else
		i_17_ = ((Class34) this).anInt369 * ((Class34) this).anInt371;
	    ((Class34) this).anIntArray368 = new int[i_17_];
	    for (int i_18_ = 0; i_18_ < i_17_; i_18_++)
		((Class34) this).anIntArray368[i_18_]
		    = class57.method1441(i_15_);
	    ((Class34) this).aFloatArrayArray365
		= (new float[((Class34) this).anInt369]
		   [((Class34) this).anInt371]);
	    if (i_13_ == 1) {
		for (int i_19_ = 0; i_19_ < ((Class34) this).anInt369;
		     i_19_++) {
		    float f_20_ = 0.0F;
		    int i_21_ = 1;
		    for (int i_22_ = 0; i_22_ < ((Class34) this).anInt371;
			 i_22_++) {
			int i_23_ = i_19_ / i_21_ % i_17_;
			float f_24_
			    = (((float) ((Class34) this).anIntArray368[i_23_]
				* f_14_)
			       + f + f_20_);
			((Class34) this).aFloatArrayArray365[i_19_][i_22_]
			    = f_24_;
			if (bool_16_)
			    f_20_ = f_24_;
			i_21_ *= i_17_;
		    }
		}
	    } else {
		for (int i_25_ = 0; i_25_ < ((Class34) this).anInt369;
		     i_25_++) {
		    float f_26_ = 0.0F;
		    int i_27_ = i_25_ * ((Class34) this).anInt371;
		    for (int i_28_ = 0; i_28_ < ((Class34) this).anInt371;
			 i_28_++) {
			float f_29_
			    = (((float) ((Class34) this).anIntArray368[i_27_]
				* f_14_)
			       + f + f_26_);
			((Class34) this).aFloatArrayArray365[i_25_][i_28_]
			    = f_29_;
			if (bool_16_)
			    f_26_ = f_29_;
			i_27_++;
		    }
		}
	    }
	}
	((Class34) this).anInt370 = class57.method1462() - i;
	((Class34) this).anInt367 = class57.method1399() - i_6_;
    }
    
    Class34() {
	/* empty */
    }
    
    void method980() {
	int[] is = new int[((Class34) this).anInt369];
	int[] is_30_ = new int[33];
	for (int i = 0; i < ((Class34) this).anInt369; i++) {
	    int i_31_ = ((Class34) this).anIntArray364[i];
	    if (i_31_ != 0) {
		int i_32_ = 1 << 32 - i_31_;
		int i_33_ = is_30_[i_31_];
		is[i] = i_33_;
		int i_34_;
		if ((i_33_ & i_32_) != 0)
		    i_34_ = is_30_[i_31_ - 1];
		else {
		    i_34_ = i_33_ | i_32_;
		    for (int i_35_ = i_31_ - 1; i_35_ >= 1; i_35_--) {
			int i_36_ = is_30_[i_35_];
			if (i_36_ != i_33_)
			    break;
			int i_37_ = 1 << 32 - i_35_;
			if ((i_36_ & i_37_) != 0) {
			    is_30_[i_35_] = is_30_[i_35_ - 1];
			    break;
			}
			is_30_[i_35_] = i_36_ | i_37_;
		    }
		}
		is_30_[i_31_] = i_34_;
		for (int i_38_ = i_31_ + 1; i_38_ <= 32; i_38_++) {
		    int i_39_ = is_30_[i_38_];
		    if (i_39_ == i_33_)
			is_30_[i_38_] = i_34_;
		}
	    }
	}
	((Class34) this).anIntArray366 = new int[8];
	int i = 0;
	for (int i_40_ = 0; i_40_ < ((Class34) this).anInt369; i_40_++) {
	    int i_41_ = ((Class34) this).anIntArray364[i_40_];
	    if (i_41_ != 0) {
		int i_42_ = is[i_40_];
		int i_43_ = 0;
		for (int i_44_ = 0; i_44_ < i_41_; i_44_++) {
		    int i_45_ = -2147483648 >>> i_44_;
		    if ((i_42_ & i_45_) != 0) {
			if (((Class34) this).anIntArray366[i_43_] == 0)
			    ((Class34) this).anIntArray366[i_43_] = i;
			i_43_ = ((Class34) this).anIntArray366[i_43_];
		    } else
			i_43_++;
		    if (i_43_ >= ((Class34) this).anIntArray366.length) {
			int[] is_46_
			    = (new int
			       [((Class34) this).anIntArray366.length * 2]);
			for (int i_47_ = 0;
			     i_47_ < ((Class34) this).anIntArray366.length;
			     i_47_++)
			    is_46_[i_47_]
				= ((Class34) this).anIntArray366[i_47_];
			((Class34) this).anIntArray366 = is_46_;
		    }
		    i_45_ >>>= 1;
		}
		((Class34) this).anIntArray366[i_43_] = i_40_ ^ 0xffffffff;
		if (i_43_ >= i)
		    i = i_43_ + 1;
	    }
	}
    }
    
    void method981(Class57 class57) {
	class57.method1441(((Class34) this).anInt367 * 8
			   + ((Class34) this).anInt370);
    }
    
    static int method982(int i, int i_48_) {
	int i_49_ = (int) Math.pow((double) i, 1.0 / (double) i_48_) + 1;
	for (;;) {
	    int i_50_ = i_49_;
	    int i_51_ = i_48_;
	    int i_52_ = 1;
	    for (/**/; i_51_ > 1; i_51_ >>= 1) {
		if ((i_51_ & 0x1) != 0)
		    i_52_ *= i_50_;
		i_50_ *= i_50_;
	    }
	    int i_53_;
	    if (i_51_ == 1)
		i_53_ = i_50_ * i_52_;
	    else
		i_53_ = i_52_;
	    if (i_53_ <= i)
		break;
	    i_49_--;
	}
	return i_49_;
    }
    
    static int method983(int i, int i_54_) {
	int i_55_ = (int) Math.pow((double) i, 1.0 / (double) i_54_) + 1;
	for (;;) {
	    int i_56_ = i_55_;
	    int i_57_ = i_54_;
	    int i_58_ = 1;
	    for (/**/; i_57_ > 1; i_57_ >>= 1) {
		if ((i_57_ & 0x1) != 0)
		    i_58_ *= i_56_;
		i_56_ *= i_56_;
	    }
	    int i_59_;
	    if (i_57_ == 1)
		i_59_ = i_56_ * i_58_;
	    else
		i_59_ = i_58_;
	    if (i_59_ <= i)
		break;
	    i_55_--;
	}
	return i_55_;
    }
    
    int method984(Class57 class57) {
	int i;
	for (i = 0; ((Class34) this).anIntArray366[i] >= 0;
	     i = (class57.method1411() != 0 ? ((Class34) this).anIntArray366[i]
		  : i + 1)) {
	    /* empty */
	}
	return ((Class34) this).anIntArray366[i] ^ 0xffffffff;
    }
    
    float[] method985(Class57 class57) {
	return ((Class34) this).aFloatArrayArray365[method984(class57)];
    }
    
    void method986(Class57 class57) {
	class57.method1441(((Class34) this).anInt367 * 8
			   + ((Class34) this).anInt370);
    }
    
    void method987(Class57 class57) {
	int i = class57.method1462();
	int i_60_ = class57.method1399();
	class57.method1441(24);
	((Class34) this).anInt371 = class57.method1441(16);
	((Class34) this).anInt369 = class57.method1441(24);
	if (((Class34) this).anIntArray364 == null
	    || (((Class34) this).anIntArray364.length
		!= ((Class34) this).anInt369))
	    ((Class34) this).anIntArray364
		= new int[((Class34) this).anInt369];
	boolean bool = class57.method1411() != 0;
	if (bool) {
	    int i_61_ = 0;
	    int i_62_ = class57.method1441(5) + 1;
	    while (i_61_ < ((Class34) this).anInt369) {
		int i_63_
		    = class57.method1441(Class436.method7795(((((Class34) this)
							       .anInt369)
							      - i_61_),
							     (byte) -12));
		for (int i_64_ = 0; i_64_ < i_63_; i_64_++)
		    ((Class34) this).anIntArray364[i_61_++] = i_62_;
		i_62_++;
	    }
	} else {
	    boolean bool_65_ = class57.method1411() != 0;
	    for (int i_66_ = 0; i_66_ < ((Class34) this).anInt369; i_66_++) {
		if (bool_65_ && class57.method1411() == 0)
		    ((Class34) this).anIntArray364[i_66_] = 0;
		else
		    ((Class34) this).anIntArray364[i_66_]
			= class57.method1441(5) + 1;
	    }
	}
	method980();
	int i_67_ = class57.method1441(4);
	if (i_67_ > 0) {
	    float f = class57.method1504(class57.method1441(32));
	    float f_68_ = class57.method1504(class57.method1441(32));
	    int i_69_ = class57.method1441(4) + 1;
	    boolean bool_70_ = class57.method1411() != 0;
	    int i_71_;
	    if (i_67_ == 1)
		i_71_ = method977(((Class34) this).anInt369,
				  ((Class34) this).anInt371);
	    else
		i_71_ = ((Class34) this).anInt369 * ((Class34) this).anInt371;
	    ((Class34) this).anIntArray368 = new int[i_71_];
	    for (int i_72_ = 0; i_72_ < i_71_; i_72_++)
		((Class34) this).anIntArray368[i_72_]
		    = class57.method1441(i_69_);
	    ((Class34) this).aFloatArrayArray365
		= (new float[((Class34) this).anInt369]
		   [((Class34) this).anInt371]);
	    if (i_67_ == 1) {
		for (int i_73_ = 0; i_73_ < ((Class34) this).anInt369;
		     i_73_++) {
		    float f_74_ = 0.0F;
		    int i_75_ = 1;
		    for (int i_76_ = 0; i_76_ < ((Class34) this).anInt371;
			 i_76_++) {
			int i_77_ = i_73_ / i_75_ % i_71_;
			float f_78_
			    = (((float) ((Class34) this).anIntArray368[i_77_]
				* f_68_)
			       + f + f_74_);
			((Class34) this).aFloatArrayArray365[i_73_][i_76_]
			    = f_78_;
			if (bool_70_)
			    f_74_ = f_78_;
			i_75_ *= i_71_;
		    }
		}
	    } else {
		for (int i_79_ = 0; i_79_ < ((Class34) this).anInt369;
		     i_79_++) {
		    float f_80_ = 0.0F;
		    int i_81_ = i_79_ * ((Class34) this).anInt371;
		    for (int i_82_ = 0; i_82_ < ((Class34) this).anInt371;
			 i_82_++) {
			float f_83_
			    = (((float) ((Class34) this).anIntArray368[i_81_]
				* f_68_)
			       + f + f_80_);
			((Class34) this).aFloatArrayArray365[i_79_][i_82_]
			    = f_83_;
			if (bool_70_)
			    f_80_ = f_83_;
			i_81_++;
		    }
		}
	    }
	}
	((Class34) this).anInt370 = class57.method1462() - i;
	((Class34) this).anInt367 = class57.method1399() - i_60_;
    }
    
    void method988() {
	int[] is = new int[((Class34) this).anInt369];
	int[] is_84_ = new int[33];
	for (int i = 0; i < ((Class34) this).anInt369; i++) {
	    int i_85_ = ((Class34) this).anIntArray364[i];
	    if (i_85_ != 0) {
		int i_86_ = 1 << 32 - i_85_;
		int i_87_ = is_84_[i_85_];
		is[i] = i_87_;
		int i_88_;
		if ((i_87_ & i_86_) != 0)
		    i_88_ = is_84_[i_85_ - 1];
		else {
		    i_88_ = i_87_ | i_86_;
		    for (int i_89_ = i_85_ - 1; i_89_ >= 1; i_89_--) {
			int i_90_ = is_84_[i_89_];
			if (i_90_ != i_87_)
			    break;
			int i_91_ = 1 << 32 - i_89_;
			if ((i_90_ & i_91_) != 0) {
			    is_84_[i_89_] = is_84_[i_89_ - 1];
			    break;
			}
			is_84_[i_89_] = i_90_ | i_91_;
		    }
		}
		is_84_[i_85_] = i_88_;
		for (int i_92_ = i_85_ + 1; i_92_ <= 32; i_92_++) {
		    int i_93_ = is_84_[i_92_];
		    if (i_93_ == i_87_)
			is_84_[i_92_] = i_88_;
		}
	    }
	}
	((Class34) this).anIntArray366 = new int[8];
	int i = 0;
	for (int i_94_ = 0; i_94_ < ((Class34) this).anInt369; i_94_++) {
	    int i_95_ = ((Class34) this).anIntArray364[i_94_];
	    if (i_95_ != 0) {
		int i_96_ = is[i_94_];
		int i_97_ = 0;
		for (int i_98_ = 0; i_98_ < i_95_; i_98_++) {
		    int i_99_ = -2147483648 >>> i_98_;
		    if ((i_96_ & i_99_) != 0) {
			if (((Class34) this).anIntArray366[i_97_] == 0)
			    ((Class34) this).anIntArray366[i_97_] = i;
			i_97_ = ((Class34) this).anIntArray366[i_97_];
		    } else
			i_97_++;
		    if (i_97_ >= ((Class34) this).anIntArray366.length) {
			int[] is_100_
			    = (new int
			       [((Class34) this).anIntArray366.length * 2]);
			for (int i_101_ = 0;
			     i_101_ < ((Class34) this).anIntArray366.length;
			     i_101_++)
			    is_100_[i_101_]
				= ((Class34) this).anIntArray366[i_101_];
			((Class34) this).anIntArray366 = is_100_;
		    }
		    i_99_ >>>= 1;
		}
		((Class34) this).anIntArray366[i_97_] = i_94_ ^ 0xffffffff;
		if (i_97_ >= i)
		    i = i_97_ + 1;
	    }
	}
    }
    
    int method989(Class57 class57) {
	int i;
	for (i = 0; ((Class34) this).anIntArray366[i] >= 0;
	     i = (class57.method1411() != 0 ? ((Class34) this).anIntArray366[i]
		  : i + 1)) {
	    /* empty */
	}
	return ((Class34) this).anIntArray366[i] ^ 0xffffffff;
    }
    
    int method990(Class57 class57) {
	int i;
	for (i = 0; ((Class34) this).anIntArray366[i] >= 0;
	     i = (class57.method1411() != 0 ? ((Class34) this).anIntArray366[i]
		  : i + 1)) {
	    /* empty */
	}
	return ((Class34) this).anIntArray366[i] ^ 0xffffffff;
    }
    
    float[] method991(Class57 class57) {
	return ((Class34) this).aFloatArrayArray365[method984(class57)];
    }
    
    void method992(Class57 class57) {
	int i = class57.method1462();
	int i_102_ = class57.method1399();
	class57.method1441(24);
	((Class34) this).anInt371 = class57.method1441(16);
	((Class34) this).anInt369 = class57.method1441(24);
	if (((Class34) this).anIntArray364 == null
	    || (((Class34) this).anIntArray364.length
		!= ((Class34) this).anInt369))
	    ((Class34) this).anIntArray364
		= new int[((Class34) this).anInt369];
	boolean bool = class57.method1411() != 0;
	if (bool) {
	    int i_103_ = 0;
	    int i_104_ = class57.method1441(5) + 1;
	    while (i_103_ < ((Class34) this).anInt369) {
		int i_105_
		    = class57.method1441(Class436.method7795(((((Class34) this)
							       .anInt369)
							      - i_103_),
							     (byte) -49));
		for (int i_106_ = 0; i_106_ < i_105_; i_106_++)
		    ((Class34) this).anIntArray364[i_103_++] = i_104_;
		i_104_++;
	    }
	} else {
	    boolean bool_107_ = class57.method1411() != 0;
	    for (int i_108_ = 0; i_108_ < ((Class34) this).anInt369;
		 i_108_++) {
		if (bool_107_ && class57.method1411() == 0)
		    ((Class34) this).anIntArray364[i_108_] = 0;
		else
		    ((Class34) this).anIntArray364[i_108_]
			= class57.method1441(5) + 1;
	    }
	}
	method980();
	int i_109_ = class57.method1441(4);
	if (i_109_ > 0) {
	    float f = class57.method1504(class57.method1441(32));
	    float f_110_ = class57.method1504(class57.method1441(32));
	    int i_111_ = class57.method1441(4) + 1;
	    boolean bool_112_ = class57.method1411() != 0;
	    int i_113_;
	    if (i_109_ == 1)
		i_113_ = method977(((Class34) this).anInt369,
				   ((Class34) this).anInt371);
	    else
		i_113_ = ((Class34) this).anInt369 * ((Class34) this).anInt371;
	    ((Class34) this).anIntArray368 = new int[i_113_];
	    for (int i_114_ = 0; i_114_ < i_113_; i_114_++)
		((Class34) this).anIntArray368[i_114_]
		    = class57.method1441(i_111_);
	    ((Class34) this).aFloatArrayArray365
		= (new float[((Class34) this).anInt369]
		   [((Class34) this).anInt371]);
	    if (i_109_ == 1) {
		for (int i_115_ = 0; i_115_ < ((Class34) this).anInt369;
		     i_115_++) {
		    float f_116_ = 0.0F;
		    int i_117_ = 1;
		    for (int i_118_ = 0; i_118_ < ((Class34) this).anInt371;
			 i_118_++) {
			int i_119_ = i_115_ / i_117_ % i_113_;
			float f_120_
			    = (((float) ((Class34) this).anIntArray368[i_119_]
				* f_110_)
			       + f + f_116_);
			((Class34) this).aFloatArrayArray365[i_115_][i_118_]
			    = f_120_;
			if (bool_112_)
			    f_116_ = f_120_;
			i_117_ *= i_113_;
		    }
		}
	    } else {
		for (int i_121_ = 0; i_121_ < ((Class34) this).anInt369;
		     i_121_++) {
		    float f_122_ = 0.0F;
		    int i_123_ = i_121_ * ((Class34) this).anInt371;
		    for (int i_124_ = 0; i_124_ < ((Class34) this).anInt371;
			 i_124_++) {
			float f_125_
			    = (((float) ((Class34) this).anIntArray368[i_123_]
				* f_110_)
			       + f + f_122_);
			((Class34) this).aFloatArrayArray365[i_121_][i_124_]
			    = f_125_;
			if (bool_112_)
			    f_122_ = f_125_;
			i_123_++;
		    }
		}
	    }
	}
	((Class34) this).anInt370 = class57.method1462() - i;
	((Class34) this).anInt367 = class57.method1399() - i_102_;
    }
    
    float[] method993(Class57 class57) {
	return ((Class34) this).aFloatArrayArray365[method984(class57)];
    }
}
