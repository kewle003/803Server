/* Class364 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class364
{
    int anInt5535;
    Class166_Sub1 aClass166_Sub1_5536;
    int anInt5537;
    Class103_Sub3 aClass103_Sub3_5538;
    byte[] aByteArray5539;
    int anInt5540;
    int anInt5541;
    int anInt5542;
    Class392[][] aClass392ArrayArray5543;
    
    boolean method6531(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
		       int i_0_) {
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1
	    = (Class241_Sub39_Sub17_Sub1) class241_sub39_sub17;
	i += (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
	      .anInt11291) + 1;
	i_0_ += (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		 .anInt11290) + 1;
	int i_1_ = i + i_0_ * ((Class364) this).anInt5537;
	int i_2_ = (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		    .anInt11288);
	int i_3_ = (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		    .anInt11287);
	int i_4_ = ((Class364) this).anInt5537 - i_3_;
	if (i_0_ <= 0) {
	    int i_5_ = 1 - i_0_;
	    i_2_ -= i_5_;
	    i_1_ += i_5_ * ((Class364) this).anInt5537;
	    i_0_ = 1;
	}
	if (i_0_ + i_2_ >= ((Class364) this).anInt5542) {
	    int i_6_ = i_0_ + i_2_ + 1 - ((Class364) this).anInt5542;
	    i_2_ -= i_6_;
	}
	if (i <= 0) {
	    int i_7_ = 1 - i;
	    i_3_ -= i_7_;
	    i_1_ += i_7_;
	    i_4_ += i_7_;
	    i = 1;
	}
	if (i + i_3_ >= ((Class364) this).anInt5537) {
	    int i_8_ = i + i_3_ + 1 - ((Class364) this).anInt5537;
	    i_3_ -= i_8_;
	    i_4_ += i_8_;
	}
	if (i_3_ <= 0 || i_2_ <= 0)
	    return false;
	int i_9_ = 8;
	i_4_ += (i_9_ - 1) * ((Class364) this).anInt5537;
	return method6554(((Class364) this).aByteArray5539, i_1_, i_3_, i_2_,
			  i_4_, i_9_);
    }
    
    void method6532() {
	((Class364) this).aClass392ArrayArray5543
	    = (new Class392[((Class364) this).anInt5540]
	       [((Class364) this).anInt5541]);
	for (int i = 0; i < ((Class364) this).anInt5541; i++) {
	    for (int i_10_ = 0; i_10_ < ((Class364) this).anInt5540; i_10_++) {
		((Class364) this).aClass392ArrayArray5543[i_10_][i]
		    = new Class392(((Class364) this).aClass103_Sub3_5538, this,
				   ((Class364) this).aClass166_Sub1_5536,
				   i_10_, i, ((Class364) this).anInt5535,
				   i_10_ * 128 + 1, i * 128 + 1);
		if (((Class392) (((Class364) this).aClass392ArrayArray5543
				 [i_10_][i])).anInt5759
		    == 0)
		    ((Class364) this).aClass392ArrayArray5543[i_10_][i] = null;
	    }
	}
    }
    
    void method6533(Class361 class361, int i, int i_11_, int i_12_,
		    boolean[][] bools, boolean bool) {
	((Class364) this).aClass103_Sub3_5538.method2308(false);
	float f
	    = 1.0F / (float) (((Class103_Sub3)
			       ((Class364) this).aClass103_Sub3_5538).anInt9572
			      * 128);
	if (bool) {
	    for (int i_13_ = 0; i_13_ < ((Class364) this).anInt5541; i_13_++) {
		int i_14_ = i_13_ << ((Class364) this).anInt5535;
		int i_15_ = i_13_ + 1 << ((Class364) this).anInt5535;
		for (int i_16_ = 0; i_16_ < ((Class364) this).anInt5540;
		     i_16_++) {
		    if (((Class364) this).aClass392ArrayArray5543[i_16_][i_13_]
			!= null) {
			int i_17_ = i_16_ << ((Class364) this).anInt5535;
			int i_18_ = i_16_ + 1 << ((Class364) this).anInt5535;
		    while_96_:
			for (int i_19_ = i_17_; i_19_ < i_18_; i_19_++) {
			    if (i_19_ - i >= -i_12_ && i_19_ - i <= i_12_) {
				for (int i_20_ = i_14_; i_20_ < i_15_;
				     i_20_++) {
				    if (i_20_ - i_11_ >= -i_12_
					&& i_20_ - i_11_ <= i_12_
					&& (bools[i_19_ - i + i_12_]
					    [i_20_ - i_11_ + i_12_])) {
					class361.aClass268_5510
					    .method5206(f, f, 1.0F, 1.0F);
					class361.aClass268_5510
					    .aFloatArray4353[12]
					    = (float) -i_16_;
					class361.aClass268_5510
					    .aFloatArray4353[13]
					    = (float) -i_13_;
					((Class364) this)
					    .aClass392ArrayArray5543[i_16_]
					    [i_13_].method7015(class361);
					break while_96_;
				    }
				}
			    }
			}
		    }
		}
	    }
	} else {
	    int[] is = new int[(((Class364) this).anInt5541
				* ((Class364) this).anInt5540)];
	    ByteBuffer bytebuffer
		= ((Class364) this).aClass103_Sub3_5538.aByteBuffer9490;
	    bytebuffer.clear();
	    int i_21_ = 0;
	    for (int i_22_ = 0; i_22_ < ((Class364) this).anInt5541; i_22_++) {
		int i_23_ = i_22_ << ((Class364) this).anInt5535;
		int i_24_ = i_22_ + 1 << ((Class364) this).anInt5535;
		for (int i_25_ = 0; i_25_ < ((Class364) this).anInt5540;
		     i_25_++) {
		    Class392 class392
			= (((Class364) this).aClass392ArrayArray5543[i_25_]
			   [i_22_]);
		    int i_26_ = 0;
		    if (class392 != null) {
			int i_27_ = i_25_ << ((Class364) this).anInt5535;
			int i_28_ = i_25_ + 1 << ((Class364) this).anInt5535;
			for (int i_29_ = i_23_; i_29_ < i_24_; i_29_++) {
			    if (i_29_ - i_11_ >= -i_12_
				&& i_29_ - i_11_ <= i_12_) {
				int i_30_
				    = i_29_ * ((((Class364) this)
						.aClass166_Sub1_5536.anInt2055)
					       * 266270313) + i_27_;
				for (int i_31_ = i_27_; i_31_ < i_28_;
				     i_31_++) {
				    if (i_31_ - i >= -i_12_
					&& i_31_ - i <= i_12_
					&& (bools[i_31_ - i + i_12_]
					    [i_29_ - i_11_ + i_12_])) {
					short[] is_32_
					    = (((Class166_Sub1)
						(((Class364) this)
						 .aClass166_Sub1_5536))
					       .aShortArrayArray9791[i_30_]);
					if (is_32_ != null) {
					    for (int i_33_ = 0;
						 i_33_ < is_32_.length;
						 i_33_++) {
						bytebuffer
						    .putShort(is_32_[i_33_]);
						i_26_++;
					    }
					}
				    }
				    i_30_++;
				}
			    }
			}
		    }
		    is[i_21_] = i_26_;
		    i_21_++;
		}
	    }
	    if (bytebuffer.position() != 0) {
		int i_34_ = bytebuffer.position();
		Interface33 interface33 = ((Class364) this)
					      .aClass103_Sub3_5538
					      .method15630(i_34_ / 2);
		interface33.method268(0, i_34_,
				      (((Class364) this).aClass103_Sub3_5538
				       .aLong9491));
		int i_35_ = 0;
		i_21_ = 0;
		for (int i_36_ = 0; i_36_ < ((Class364) this).anInt5541;
		     i_36_++) {
		    for (int i_37_ = 0; i_37_ < ((Class364) this).anInt5540;
			 i_37_++) {
			if (is[i_21_] != 0) {
			    class361.aClass268_5510.method5206(f, f, 1.0F,
							       1.0F);
			    class361.aClass268_5510.aFloatArray4353[12]
				= (float) -i_37_;
			    class361.aClass268_5510.aFloatArray4353[13]
				= (float) -i_36_;
			    ((Class364) this).aClass392ArrayArray5543
				[i_37_][i_36_].method7020
				(class361, interface33, i_35_, is[i_21_] / 3);
			    i_35_ += is[i_21_];
			}
			i_21_++;
		    }
		}
	    }
	}
	((Class364) this).aClass103_Sub3_5538.method2308(true);
    }
    
    void method6534(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
		    int i_38_) {
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1
	    = (Class241_Sub39_Sub17_Sub1) class241_sub39_sub17;
	i += (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
	      .anInt11291) + 1;
	i_38_ += (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		  .anInt11290) + 1;
	int i_39_ = i + i_38_ * ((Class364) this).anInt5537;
	int i_40_ = 0;
	int i_41_ = (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		     .anInt11288);
	int i_42_ = (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		     .anInt11287);
	int i_43_ = ((Class364) this).anInt5537 - i_42_;
	int i_44_ = 0;
	if (i_38_ <= 0) {
	    int i_45_ = 1 - i_38_;
	    i_41_ -= i_45_;
	    i_40_ += i_45_ * i_42_;
	    i_39_ += i_45_ * ((Class364) this).anInt5537;
	    i_38_ = 1;
	}
	if (i_38_ + i_41_ >= ((Class364) this).anInt5542) {
	    int i_46_ = i_38_ + i_41_ + 1 - ((Class364) this).anInt5542;
	    i_41_ -= i_46_;
	}
	if (i <= 0) {
	    int i_47_ = 1 - i;
	    i_42_ -= i_47_;
	    i_40_ += i_47_;
	    i_39_ += i_47_;
	    i_44_ += i_47_;
	    i_43_ += i_47_;
	    i = 1;
	}
	if (i + i_42_ >= ((Class364) this).anInt5537) {
	    int i_48_ = i + i_42_ + 1 - ((Class364) this).anInt5537;
	    i_42_ -= i_48_;
	    i_44_ += i_48_;
	    i_43_ += i_48_;
	}
	if (i_42_ > 0 && i_41_ > 0) {
	    method6553(((Class364) this).aByteArray5539,
		       (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
			.aByteArray11289),
		       i_40_, i_39_, i_42_, i_41_, i_43_, i_44_);
	    method6537(i, i_38_, i_42_, i_41_);
	}
    }
    
    void method6535(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
		    int i_49_) {
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1
	    = (Class241_Sub39_Sub17_Sub1) class241_sub39_sub17;
	i += (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
	      .anInt11291) + 1;
	i_49_ += (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		  .anInt11290) + 1;
	int i_50_ = i + i_49_ * ((Class364) this).anInt5537;
	int i_51_ = 0;
	int i_52_ = (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		     .anInt11288);
	int i_53_ = (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		     .anInt11287);
	int i_54_ = ((Class364) this).anInt5537 - i_53_;
	int i_55_ = 0;
	if (i_49_ <= 0) {
	    int i_56_ = 1 - i_49_;
	    i_52_ -= i_56_;
	    i_51_ += i_56_ * i_53_;
	    i_50_ += i_56_ * ((Class364) this).anInt5537;
	    i_49_ = 1;
	}
	if (i_49_ + i_52_ >= ((Class364) this).anInt5542) {
	    int i_57_ = i_49_ + i_52_ + 1 - ((Class364) this).anInt5542;
	    i_52_ -= i_57_;
	}
	if (i <= 0) {
	    int i_58_ = 1 - i;
	    i_53_ -= i_58_;
	    i_51_ += i_58_;
	    i_50_ += i_58_;
	    i_55_ += i_58_;
	    i_54_ += i_58_;
	    i = 1;
	}
	if (i + i_53_ >= ((Class364) this).anInt5537) {
	    int i_59_ = i + i_53_ + 1 - ((Class364) this).anInt5537;
	    i_53_ -= i_59_;
	    i_55_ += i_59_;
	    i_54_ += i_59_;
	}
	if (i_53_ > 0 && i_52_ > 0) {
	    method6539(((Class364) this).aByteArray5539,
		       (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
			.aByteArray11289),
		       i_51_, i_50_, i_53_, i_52_, i_54_, i_55_);
	    method6537(i, i_49_, i_53_, i_52_);
	}
    }
    
    boolean method6536(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
		       int i_60_) {
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1
	    = (Class241_Sub39_Sub17_Sub1) class241_sub39_sub17;
	i += (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
	      .anInt11291) + 1;
	i_60_ += (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		  .anInt11290) + 1;
	int i_61_ = i + i_60_ * ((Class364) this).anInt5537;
	int i_62_ = (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		     .anInt11288);
	int i_63_ = (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		     .anInt11287);
	int i_64_ = ((Class364) this).anInt5537 - i_63_;
	if (i_60_ <= 0) {
	    int i_65_ = 1 - i_60_;
	    i_62_ -= i_65_;
	    i_61_ += i_65_ * ((Class364) this).anInt5537;
	    i_60_ = 1;
	}
	if (i_60_ + i_62_ >= ((Class364) this).anInt5542) {
	    int i_66_ = i_60_ + i_62_ + 1 - ((Class364) this).anInt5542;
	    i_62_ -= i_66_;
	}
	if (i <= 0) {
	    int i_67_ = 1 - i;
	    i_63_ -= i_67_;
	    i_61_ += i_67_;
	    i_64_ += i_67_;
	    i = 1;
	}
	if (i + i_63_ >= ((Class364) this).anInt5537) {
	    int i_68_ = i + i_63_ + 1 - ((Class364) this).anInt5537;
	    i_63_ -= i_68_;
	    i_64_ += i_68_;
	}
	if (i_63_ <= 0 || i_62_ <= 0)
	    return false;
	int i_69_ = 8;
	i_64_ += (i_69_ - 1) * ((Class364) this).anInt5537;
	return method6554(((Class364) this).aByteArray5539, i_61_, i_63_,
			  i_62_, i_64_, i_69_);
    }
    
    void method6537(int i, int i_70_, int i_71_, int i_72_) {
	if (((Class364) this).aClass392ArrayArray5543 != null) {
	    int i_73_ = i - 1 >> 7;
	    int i_74_ = i - 1 + i_71_ - 1 >> 7;
	    int i_75_ = i_70_ - 1 >> 7;
	    int i_76_ = i_70_ - 1 + i_72_ - 1 >> 7;
	    for (int i_77_ = i_73_; i_77_ <= i_74_; i_77_++) {
		Class392[] class392s
		    = ((Class364) this).aClass392ArrayArray5543[i_77_];
		for (int i_78_ = i_75_; i_78_ <= i_76_; i_78_++) {
		    if (class392s[i_78_] != null)
			((Class392) class392s[i_78_]).aBool5757 = true;
		}
	    }
	}
    }
    
    void method6538(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
		    int i_79_) {
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1
	    = (Class241_Sub39_Sub17_Sub1) class241_sub39_sub17;
	i += (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
	      .anInt11291) + 1;
	i_79_ += (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		  .anInt11290) + 1;
	int i_80_ = i + i_79_ * ((Class364) this).anInt5537;
	int i_81_ = 0;
	int i_82_ = (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		     .anInt11288);
	int i_83_ = (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		     .anInt11287);
	int i_84_ = ((Class364) this).anInt5537 - i_83_;
	int i_85_ = 0;
	if (i_79_ <= 0) {
	    int i_86_ = 1 - i_79_;
	    i_82_ -= i_86_;
	    i_81_ += i_86_ * i_83_;
	    i_80_ += i_86_ * ((Class364) this).anInt5537;
	    i_79_ = 1;
	}
	if (i_79_ + i_82_ >= ((Class364) this).anInt5542) {
	    int i_87_ = i_79_ + i_82_ + 1 - ((Class364) this).anInt5542;
	    i_82_ -= i_87_;
	}
	if (i <= 0) {
	    int i_88_ = 1 - i;
	    i_83_ -= i_88_;
	    i_81_ += i_88_;
	    i_80_ += i_88_;
	    i_85_ += i_88_;
	    i_84_ += i_88_;
	    i = 1;
	}
	if (i + i_83_ >= ((Class364) this).anInt5537) {
	    int i_89_ = i + i_83_ + 1 - ((Class364) this).anInt5537;
	    i_83_ -= i_89_;
	    i_85_ += i_89_;
	    i_84_ += i_89_;
	}
	if (i_83_ > 0 && i_82_ > 0) {
	    method6553(((Class364) this).aByteArray5539,
		       (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
			.aByteArray11289),
		       i_81_, i_80_, i_83_, i_82_, i_84_, i_85_);
	    method6537(i, i_79_, i_83_, i_82_);
	}
    }
    
    static final void method6539(byte[] is, byte[] is_90_, int i, int i_91_,
				 int i_92_, int i_93_, int i_94_, int i_95_) {
	int i_96_ = -(i_92_ >> 2);
	i_92_ = -(i_92_ & 0x3);
	for (int i_97_ = -i_93_; i_97_ < 0; i_97_++) {
	    for (int i_98_ = i_96_; i_98_ < 0; i_98_++) {
		is[i_91_++] -= is_90_[i++];
		is[i_91_++] -= is_90_[i++];
		is[i_91_++] -= is_90_[i++];
		is[i_91_++] -= is_90_[i++];
	    }
	    for (int i_99_ = i_92_; i_99_ < 0; i_99_++)
		is[i_91_++] -= is_90_[i++];
	    i_91_ += i_94_;
	    i += i_95_;
	}
    }
    
    void method6540(Class361 class361, int i, int i_100_, int i_101_,
		    boolean[][] bools, boolean bool) {
	((Class364) this).aClass103_Sub3_5538.method2308(false);
	float f
	    = 1.0F / (float) (((Class103_Sub3)
			       ((Class364) this).aClass103_Sub3_5538).anInt9572
			      * 128);
	if (bool) {
	    for (int i_102_ = 0; i_102_ < ((Class364) this).anInt5541;
		 i_102_++) {
		int i_103_ = i_102_ << ((Class364) this).anInt5535;
		int i_104_ = i_102_ + 1 << ((Class364) this).anInt5535;
		for (int i_105_ = 0; i_105_ < ((Class364) this).anInt5540;
		     i_105_++) {
		    if ((((Class364) this).aClass392ArrayArray5543[i_105_]
			 [i_102_])
			!= null) {
			int i_106_ = i_105_ << ((Class364) this).anInt5535;
			int i_107_ = i_105_ + 1 << ((Class364) this).anInt5535;
		    while_97_:
			for (int i_108_ = i_106_; i_108_ < i_107_; i_108_++) {
			    if (i_108_ - i >= -i_101_
				&& i_108_ - i <= i_101_) {
				for (int i_109_ = i_103_; i_109_ < i_104_;
				     i_109_++) {
				    if (i_109_ - i_100_ >= -i_101_
					&& i_109_ - i_100_ <= i_101_
					&& (bools[i_108_ - i + i_101_]
					    [i_109_ - i_100_ + i_101_])) {
					class361.aClass268_5510
					    .method5206(f, f, 1.0F, 1.0F);
					class361.aClass268_5510
					    .aFloatArray4353[12]
					    = (float) -i_105_;
					class361.aClass268_5510
					    .aFloatArray4353[13]
					    = (float) -i_102_;
					((Class364) this)
					    .aClass392ArrayArray5543[i_105_]
					    [i_102_].method7015(class361);
					break while_97_;
				    }
				}
			    }
			}
		    }
		}
	    }
	} else {
	    int[] is = new int[(((Class364) this).anInt5541
				* ((Class364) this).anInt5540)];
	    ByteBuffer bytebuffer
		= ((Class364) this).aClass103_Sub3_5538.aByteBuffer9490;
	    bytebuffer.clear();
	    int i_110_ = 0;
	    for (int i_111_ = 0; i_111_ < ((Class364) this).anInt5541;
		 i_111_++) {
		int i_112_ = i_111_ << ((Class364) this).anInt5535;
		int i_113_ = i_111_ + 1 << ((Class364) this).anInt5535;
		for (int i_114_ = 0; i_114_ < ((Class364) this).anInt5540;
		     i_114_++) {
		    Class392 class392
			= (((Class364) this).aClass392ArrayArray5543[i_114_]
			   [i_111_]);
		    int i_115_ = 0;
		    if (class392 != null) {
			int i_116_ = i_114_ << ((Class364) this).anInt5535;
			int i_117_ = i_114_ + 1 << ((Class364) this).anInt5535;
			for (int i_118_ = i_112_; i_118_ < i_113_; i_118_++) {
			    if (i_118_ - i_100_ >= -i_101_
				&& i_118_ - i_100_ <= i_101_) {
				int i_119_ = (i_118_ * ((((Class364) this)
							 .aClass166_Sub1_5536
							 .anInt2055)
							* 266270313)
					      + i_116_);
				for (int i_120_ = i_116_; i_120_ < i_117_;
				     i_120_++) {
				    if (i_120_ - i >= -i_101_
					&& i_120_ - i <= i_101_
					&& (bools[i_120_ - i + i_101_]
					    [i_118_ - i_100_ + i_101_])) {
					short[] is_121_
					    = (((Class166_Sub1)
						(((Class364) this)
						 .aClass166_Sub1_5536))
					       .aShortArrayArray9791[i_119_]);
					if (is_121_ != null) {
					    for (int i_122_ = 0;
						 i_122_ < is_121_.length;
						 i_122_++) {
						bytebuffer
						    .putShort(is_121_[i_122_]);
						i_115_++;
					    }
					}
				    }
				    i_119_++;
				}
			    }
			}
		    }
		    is[i_110_] = i_115_;
		    i_110_++;
		}
	    }
	    if (bytebuffer.position() != 0) {
		int i_123_ = bytebuffer.position();
		Interface33 interface33 = ((Class364) this)
					      .aClass103_Sub3_5538
					      .method15630(i_123_ / 2);
		interface33.method268(0, i_123_,
				      (((Class364) this).aClass103_Sub3_5538
				       .aLong9491));
		int i_124_ = 0;
		i_110_ = 0;
		for (int i_125_ = 0; i_125_ < ((Class364) this).anInt5541;
		     i_125_++) {
		    for (int i_126_ = 0; i_126_ < ((Class364) this).anInt5540;
			 i_126_++) {
			if (is[i_110_] != 0) {
			    class361.aClass268_5510.method5206(f, f, 1.0F,
							       1.0F);
			    class361.aClass268_5510.aFloatArray4353[12]
				= (float) -i_126_;
			    class361.aClass268_5510.aFloatArray4353[13]
				= (float) -i_125_;
			    ((Class364) this).aClass392ArrayArray5543
				[i_126_][i_125_].method7020
				(class361, interface33, i_124_,
				 is[i_110_] / 3);
			    i_124_ += is[i_110_];
			}
			i_110_++;
		    }
		}
	    }
	}
	((Class364) this).aClass103_Sub3_5538.method2308(true);
    }
    
    Class364(Class103_Sub3 class103_sub3, Class166_Sub1 class166_sub1) {
	((Class364) this).aClass103_Sub3_5538 = class103_sub3;
	((Class364) this).aClass166_Sub1_5536 = class166_sub1;
	((Class364) this).anInt5537
	    = 2 + ((((Class364) this).aClass166_Sub1_5536.anInt2055 * 266270313
		    * (((Class364) this).aClass166_Sub1_5536.anInt2053
		       * 2039042417))
		   >> (((Class103_Sub3) ((Class364) this).aClass103_Sub3_5538)
		       .anInt9489));
	((Class364) this).anInt5542
	    = 2 + ((((Class364) this).aClass166_Sub1_5536.anInt2052 * -14610189
		    * (((Class364) this).aClass166_Sub1_5536.anInt2053
		       * 2039042417))
		   >> (((Class103_Sub3) ((Class364) this).aClass103_Sub3_5538)
		       .anInt9489));
	((Class364) this).aByteArray5539
	    = (new byte
	       [((Class364) this).anInt5537 * ((Class364) this).anInt5542]);
	((Class364) this).anInt5535
	    = (7
	       + (((Class103_Sub3) ((Class364) this).aClass103_Sub3_5538)
		  .anInt9489)
	       - ((Class364) this).aClass166_Sub1_5536.anInt2054 * -122333825);
	((Class364) this).anInt5540
	    = (((Class364) this).aClass166_Sub1_5536.anInt2055 * 266270313
	       >> ((Class364) this).anInt5535);
	((Class364) this).anInt5541
	    = (((Class364) this).aClass166_Sub1_5536.anInt2052 * -14610189
	       >> ((Class364) this).anInt5535);
    }
    
    void method6541() {
	((Class364) this).aClass392ArrayArray5543
	    = (new Class392[((Class364) this).anInt5540]
	       [((Class364) this).anInt5541]);
	for (int i = 0; i < ((Class364) this).anInt5541; i++) {
	    for (int i_127_ = 0; i_127_ < ((Class364) this).anInt5540;
		 i_127_++) {
		((Class364) this).aClass392ArrayArray5543[i_127_][i]
		    = new Class392(((Class364) this).aClass103_Sub3_5538, this,
				   ((Class364) this).aClass166_Sub1_5536,
				   i_127_, i, ((Class364) this).anInt5535,
				   i_127_ * 128 + 1, i * 128 + 1);
		if (((Class392) (((Class364) this).aClass392ArrayArray5543
				 [i_127_][i])).anInt5759
		    == 0)
		    ((Class364) this).aClass392ArrayArray5543[i_127_][i]
			= null;
	    }
	}
    }
    
    void method6542() {
	((Class364) this).aClass392ArrayArray5543
	    = (new Class392[((Class364) this).anInt5540]
	       [((Class364) this).anInt5541]);
	for (int i = 0; i < ((Class364) this).anInt5541; i++) {
	    for (int i_128_ = 0; i_128_ < ((Class364) this).anInt5540;
		 i_128_++) {
		((Class364) this).aClass392ArrayArray5543[i_128_][i]
		    = new Class392(((Class364) this).aClass103_Sub3_5538, this,
				   ((Class364) this).aClass166_Sub1_5536,
				   i_128_, i, ((Class364) this).anInt5535,
				   i_128_ * 128 + 1, i * 128 + 1);
		if (((Class392) (((Class364) this).aClass392ArrayArray5543
				 [i_128_][i])).anInt5759
		    == 0)
		    ((Class364) this).aClass392ArrayArray5543[i_128_][i]
			= null;
	    }
	}
    }
    
    void method6543(int i, int i_129_, int i_130_, int i_131_) {
	if (((Class364) this).aClass392ArrayArray5543 != null) {
	    int i_132_ = i - 1 >> 7;
	    int i_133_ = i - 1 + i_130_ - 1 >> 7;
	    int i_134_ = i_129_ - 1 >> 7;
	    int i_135_ = i_129_ - 1 + i_131_ - 1 >> 7;
	    for (int i_136_ = i_132_; i_136_ <= i_133_; i_136_++) {
		Class392[] class392s
		    = ((Class364) this).aClass392ArrayArray5543[i_136_];
		for (int i_137_ = i_134_; i_137_ <= i_135_; i_137_++) {
		    if (class392s[i_137_] != null)
			((Class392) class392s[i_137_]).aBool5757 = true;
		}
	    }
	}
    }
    
    void method6544(Class361 class361, int i, int i_138_, int i_139_,
		    boolean[][] bools, boolean bool) {
	((Class364) this).aClass103_Sub3_5538.method2308(false);
	float f
	    = 1.0F / (float) (((Class103_Sub3)
			       ((Class364) this).aClass103_Sub3_5538).anInt9572
			      * 128);
	if (bool) {
	    for (int i_140_ = 0; i_140_ < ((Class364) this).anInt5541;
		 i_140_++) {
		int i_141_ = i_140_ << ((Class364) this).anInt5535;
		int i_142_ = i_140_ + 1 << ((Class364) this).anInt5535;
		for (int i_143_ = 0; i_143_ < ((Class364) this).anInt5540;
		     i_143_++) {
		    if ((((Class364) this).aClass392ArrayArray5543[i_143_]
			 [i_140_])
			!= null) {
			int i_144_ = i_143_ << ((Class364) this).anInt5535;
			int i_145_ = i_143_ + 1 << ((Class364) this).anInt5535;
		    while_98_:
			for (int i_146_ = i_144_; i_146_ < i_145_; i_146_++) {
			    if (i_146_ - i >= -i_139_
				&& i_146_ - i <= i_139_) {
				for (int i_147_ = i_141_; i_147_ < i_142_;
				     i_147_++) {
				    if (i_147_ - i_138_ >= -i_139_
					&& i_147_ - i_138_ <= i_139_
					&& (bools[i_146_ - i + i_139_]
					    [i_147_ - i_138_ + i_139_])) {
					class361.aClass268_5510
					    .method5206(f, f, 1.0F, 1.0F);
					class361.aClass268_5510
					    .aFloatArray4353[12]
					    = (float) -i_143_;
					class361.aClass268_5510
					    .aFloatArray4353[13]
					    = (float) -i_140_;
					((Class364) this)
					    .aClass392ArrayArray5543[i_143_]
					    [i_140_].method7015(class361);
					break while_98_;
				    }
				}
			    }
			}
		    }
		}
	    }
	} else {
	    int[] is = new int[(((Class364) this).anInt5541
				* ((Class364) this).anInt5540)];
	    ByteBuffer bytebuffer
		= ((Class364) this).aClass103_Sub3_5538.aByteBuffer9490;
	    bytebuffer.clear();
	    int i_148_ = 0;
	    for (int i_149_ = 0; i_149_ < ((Class364) this).anInt5541;
		 i_149_++) {
		int i_150_ = i_149_ << ((Class364) this).anInt5535;
		int i_151_ = i_149_ + 1 << ((Class364) this).anInt5535;
		for (int i_152_ = 0; i_152_ < ((Class364) this).anInt5540;
		     i_152_++) {
		    Class392 class392
			= (((Class364) this).aClass392ArrayArray5543[i_152_]
			   [i_149_]);
		    int i_153_ = 0;
		    if (class392 != null) {
			int i_154_ = i_152_ << ((Class364) this).anInt5535;
			int i_155_ = i_152_ + 1 << ((Class364) this).anInt5535;
			for (int i_156_ = i_150_; i_156_ < i_151_; i_156_++) {
			    if (i_156_ - i_138_ >= -i_139_
				&& i_156_ - i_138_ <= i_139_) {
				int i_157_ = (i_156_ * ((((Class364) this)
							 .aClass166_Sub1_5536
							 .anInt2055)
							* 266270313)
					      + i_154_);
				for (int i_158_ = i_154_; i_158_ < i_155_;
				     i_158_++) {
				    if (i_158_ - i >= -i_139_
					&& i_158_ - i <= i_139_
					&& (bools[i_158_ - i + i_139_]
					    [i_156_ - i_138_ + i_139_])) {
					short[] is_159_
					    = (((Class166_Sub1)
						(((Class364) this)
						 .aClass166_Sub1_5536))
					       .aShortArrayArray9791[i_157_]);
					if (is_159_ != null) {
					    for (int i_160_ = 0;
						 i_160_ < is_159_.length;
						 i_160_++) {
						bytebuffer
						    .putShort(is_159_[i_160_]);
						i_153_++;
					    }
					}
				    }
				    i_157_++;
				}
			    }
			}
		    }
		    is[i_148_] = i_153_;
		    i_148_++;
		}
	    }
	    if (bytebuffer.position() != 0) {
		int i_161_ = bytebuffer.position();
		Interface33 interface33 = ((Class364) this)
					      .aClass103_Sub3_5538
					      .method15630(i_161_ / 2);
		interface33.method268(0, i_161_,
				      (((Class364) this).aClass103_Sub3_5538
				       .aLong9491));
		int i_162_ = 0;
		i_148_ = 0;
		for (int i_163_ = 0; i_163_ < ((Class364) this).anInt5541;
		     i_163_++) {
		    for (int i_164_ = 0; i_164_ < ((Class364) this).anInt5540;
			 i_164_++) {
			if (is[i_148_] != 0) {
			    class361.aClass268_5510.method5206(f, f, 1.0F,
							       1.0F);
			    class361.aClass268_5510.aFloatArray4353[12]
				= (float) -i_164_;
			    class361.aClass268_5510.aFloatArray4353[13]
				= (float) -i_163_;
			    ((Class364) this).aClass392ArrayArray5543
				[i_164_][i_163_].method7020
				(class361, interface33, i_162_,
				 is[i_148_] / 3);
			    i_162_ += is[i_148_];
			}
			i_148_++;
		    }
		}
	    }
	}
	((Class364) this).aClass103_Sub3_5538.method2308(true);
    }
    
    void method6545(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
		    int i_165_) {
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1
	    = (Class241_Sub39_Sub17_Sub1) class241_sub39_sub17;
	i += (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
	      .anInt11291) + 1;
	i_165_ += (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		   .anInt11290) + 1;
	int i_166_ = i + i_165_ * ((Class364) this).anInt5537;
	int i_167_ = 0;
	int i_168_ = (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		      .anInt11288);
	int i_169_ = (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		      .anInt11287);
	int i_170_ = ((Class364) this).anInt5537 - i_169_;
	int i_171_ = 0;
	if (i_165_ <= 0) {
	    int i_172_ = 1 - i_165_;
	    i_168_ -= i_172_;
	    i_167_ += i_172_ * i_169_;
	    i_166_ += i_172_ * ((Class364) this).anInt5537;
	    i_165_ = 1;
	}
	if (i_165_ + i_168_ >= ((Class364) this).anInt5542) {
	    int i_173_ = i_165_ + i_168_ + 1 - ((Class364) this).anInt5542;
	    i_168_ -= i_173_;
	}
	if (i <= 0) {
	    int i_174_ = 1 - i;
	    i_169_ -= i_174_;
	    i_167_ += i_174_;
	    i_166_ += i_174_;
	    i_171_ += i_174_;
	    i_170_ += i_174_;
	    i = 1;
	}
	if (i + i_169_ >= ((Class364) this).anInt5537) {
	    int i_175_ = i + i_169_ + 1 - ((Class364) this).anInt5537;
	    i_169_ -= i_175_;
	    i_171_ += i_175_;
	    i_170_ += i_175_;
	}
	if (i_169_ > 0 && i_168_ > 0) {
	    method6553(((Class364) this).aByteArray5539,
		       (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
			.aByteArray11289),
		       i_167_, i_166_, i_169_, i_168_, i_170_, i_171_);
	    method6537(i, i_165_, i_169_, i_168_);
	}
    }
    
    void method6546(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
		    int i_176_) {
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1
	    = (Class241_Sub39_Sub17_Sub1) class241_sub39_sub17;
	i += (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
	      .anInt11291) + 1;
	i_176_ += (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		   .anInt11290) + 1;
	int i_177_ = i + i_176_ * ((Class364) this).anInt5537;
	int i_178_ = 0;
	int i_179_ = (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		      .anInt11288);
	int i_180_ = (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		      .anInt11287);
	int i_181_ = ((Class364) this).anInt5537 - i_180_;
	int i_182_ = 0;
	if (i_176_ <= 0) {
	    int i_183_ = 1 - i_176_;
	    i_179_ -= i_183_;
	    i_178_ += i_183_ * i_180_;
	    i_177_ += i_183_ * ((Class364) this).anInt5537;
	    i_176_ = 1;
	}
	if (i_176_ + i_179_ >= ((Class364) this).anInt5542) {
	    int i_184_ = i_176_ + i_179_ + 1 - ((Class364) this).anInt5542;
	    i_179_ -= i_184_;
	}
	if (i <= 0) {
	    int i_185_ = 1 - i;
	    i_180_ -= i_185_;
	    i_178_ += i_185_;
	    i_177_ += i_185_;
	    i_182_ += i_185_;
	    i_181_ += i_185_;
	    i = 1;
	}
	if (i + i_180_ >= ((Class364) this).anInt5537) {
	    int i_186_ = i + i_180_ + 1 - ((Class364) this).anInt5537;
	    i_180_ -= i_186_;
	    i_182_ += i_186_;
	    i_181_ += i_186_;
	}
	if (i_180_ > 0 && i_179_ > 0) {
	    method6553(((Class364) this).aByteArray5539,
		       (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
			.aByteArray11289),
		       i_178_, i_177_, i_180_, i_179_, i_181_, i_182_);
	    method6537(i, i_176_, i_180_, i_179_);
	}
    }
    
    void method6547(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
		    int i_187_) {
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1
	    = (Class241_Sub39_Sub17_Sub1) class241_sub39_sub17;
	i += (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
	      .anInt11291) + 1;
	i_187_ += (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		   .anInt11290) + 1;
	int i_188_ = i + i_187_ * ((Class364) this).anInt5537;
	int i_189_ = 0;
	int i_190_ = (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		      .anInt11288);
	int i_191_ = (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		      .anInt11287);
	int i_192_ = ((Class364) this).anInt5537 - i_191_;
	int i_193_ = 0;
	if (i_187_ <= 0) {
	    int i_194_ = 1 - i_187_;
	    i_190_ -= i_194_;
	    i_189_ += i_194_ * i_191_;
	    i_188_ += i_194_ * ((Class364) this).anInt5537;
	    i_187_ = 1;
	}
	if (i_187_ + i_190_ >= ((Class364) this).anInt5542) {
	    int i_195_ = i_187_ + i_190_ + 1 - ((Class364) this).anInt5542;
	    i_190_ -= i_195_;
	}
	if (i <= 0) {
	    int i_196_ = 1 - i;
	    i_191_ -= i_196_;
	    i_189_ += i_196_;
	    i_188_ += i_196_;
	    i_193_ += i_196_;
	    i_192_ += i_196_;
	    i = 1;
	}
	if (i + i_191_ >= ((Class364) this).anInt5537) {
	    int i_197_ = i + i_191_ + 1 - ((Class364) this).anInt5537;
	    i_191_ -= i_197_;
	    i_193_ += i_197_;
	    i_192_ += i_197_;
	}
	if (i_191_ > 0 && i_190_ > 0) {
	    method6553(((Class364) this).aByteArray5539,
		       (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
			.aByteArray11289),
		       i_189_, i_188_, i_191_, i_190_, i_192_, i_193_);
	    method6537(i, i_187_, i_191_, i_190_);
	}
    }
    
    static final void method6548(byte[] is, byte[] is_198_, int i, int i_199_,
				 int i_200_, int i_201_, int i_202_,
				 int i_203_) {
	int i_204_ = -(i_200_ >> 2);
	i_200_ = -(i_200_ & 0x3);
	for (int i_205_ = -i_201_; i_205_ < 0; i_205_++) {
	    for (int i_206_ = i_204_; i_206_ < 0; i_206_++) {
		is[i_199_++] -= is_198_[i++];
		is[i_199_++] -= is_198_[i++];
		is[i_199_++] -= is_198_[i++];
		is[i_199_++] -= is_198_[i++];
	    }
	    for (int i_207_ = i_200_; i_207_ < 0; i_207_++)
		is[i_199_++] -= is_198_[i++];
	    i_199_ += i_202_;
	    i += i_203_;
	}
    }
    
    void method6549(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
		    int i_208_) {
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1
	    = (Class241_Sub39_Sub17_Sub1) class241_sub39_sub17;
	i += (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
	      .anInt11291) + 1;
	i_208_ += (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		   .anInt11290) + 1;
	int i_209_ = i + i_208_ * ((Class364) this).anInt5537;
	int i_210_ = 0;
	int i_211_ = (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		      .anInt11288);
	int i_212_ = (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
		      .anInt11287);
	int i_213_ = ((Class364) this).anInt5537 - i_212_;
	int i_214_ = 0;
	if (i_208_ <= 0) {
	    int i_215_ = 1 - i_208_;
	    i_211_ -= i_215_;
	    i_210_ += i_215_ * i_212_;
	    i_209_ += i_215_ * ((Class364) this).anInt5537;
	    i_208_ = 1;
	}
	if (i_208_ + i_211_ >= ((Class364) this).anInt5542) {
	    int i_216_ = i_208_ + i_211_ + 1 - ((Class364) this).anInt5542;
	    i_211_ -= i_216_;
	}
	if (i <= 0) {
	    int i_217_ = 1 - i;
	    i_212_ -= i_217_;
	    i_210_ += i_217_;
	    i_209_ += i_217_;
	    i_214_ += i_217_;
	    i_213_ += i_217_;
	    i = 1;
	}
	if (i + i_212_ >= ((Class364) this).anInt5537) {
	    int i_218_ = i + i_212_ + 1 - ((Class364) this).anInt5537;
	    i_212_ -= i_218_;
	    i_214_ += i_218_;
	    i_213_ += i_218_;
	}
	if (i_212_ > 0 && i_211_ > 0) {
	    method6539(((Class364) this).aByteArray5539,
		       (((Class241_Sub39_Sub17_Sub1) class241_sub39_sub17_sub1)
			.aByteArray11289),
		       i_210_, i_209_, i_212_, i_211_, i_213_, i_214_);
	    method6537(i, i_208_, i_212_, i_211_);
	}
    }
    
    void method6550() {
	((Class364) this).aClass392ArrayArray5543
	    = (new Class392[((Class364) this).anInt5540]
	       [((Class364) this).anInt5541]);
	for (int i = 0; i < ((Class364) this).anInt5541; i++) {
	    for (int i_219_ = 0; i_219_ < ((Class364) this).anInt5540;
		 i_219_++) {
		((Class364) this).aClass392ArrayArray5543[i_219_][i]
		    = new Class392(((Class364) this).aClass103_Sub3_5538, this,
				   ((Class364) this).aClass166_Sub1_5536,
				   i_219_, i, ((Class364) this).anInt5535,
				   i_219_ * 128 + 1, i * 128 + 1);
		if (((Class392) (((Class364) this).aClass392ArrayArray5543
				 [i_219_][i])).anInt5759
		    == 0)
		    ((Class364) this).aClass392ArrayArray5543[i_219_][i]
			= null;
	    }
	}
    }
    
    void method6551(int i, int i_220_, int i_221_, int i_222_) {
	if (((Class364) this).aClass392ArrayArray5543 != null) {
	    int i_223_ = i - 1 >> 7;
	    int i_224_ = i - 1 + i_221_ - 1 >> 7;
	    int i_225_ = i_220_ - 1 >> 7;
	    int i_226_ = i_220_ - 1 + i_222_ - 1 >> 7;
	    for (int i_227_ = i_223_; i_227_ <= i_224_; i_227_++) {
		Class392[] class392s
		    = ((Class364) this).aClass392ArrayArray5543[i_227_];
		for (int i_228_ = i_225_; i_228_ <= i_226_; i_228_++) {
		    if (class392s[i_228_] != null)
			((Class392) class392s[i_228_]).aBool5757 = true;
		}
	    }
	}
    }
    
    static final void method6552(byte[] is, byte[] is_229_, int i, int i_230_,
				 int i_231_, int i_232_, int i_233_,
				 int i_234_) {
	int i_235_ = -(i_231_ >> 2);
	i_231_ = -(i_231_ & 0x3);
	for (int i_236_ = -i_232_; i_236_ < 0; i_236_++) {
	    for (int i_237_ = i_235_; i_237_ < 0; i_237_++) {
		is[i_230_++] += is_229_[i++];
		is[i_230_++] += is_229_[i++];
		is[i_230_++] += is_229_[i++];
		is[i_230_++] += is_229_[i++];
	    }
	    for (int i_238_ = i_231_; i_238_ < 0; i_238_++)
		is[i_230_++] += is_229_[i++];
	    i_230_ += i_233_;
	    i += i_234_;
	}
    }
    
    static final void method6553(byte[] is, byte[] is_239_, int i, int i_240_,
				 int i_241_, int i_242_, int i_243_,
				 int i_244_) {
	int i_245_ = -(i_241_ >> 2);
	i_241_ = -(i_241_ & 0x3);
	for (int i_246_ = -i_242_; i_246_ < 0; i_246_++) {
	    for (int i_247_ = i_245_; i_247_ < 0; i_247_++) {
		is[i_240_++] += is_239_[i++];
		is[i_240_++] += is_239_[i++];
		is[i_240_++] += is_239_[i++];
		is[i_240_++] += is_239_[i++];
	    }
	    for (int i_248_ = i_241_; i_248_ < 0; i_248_++)
		is[i_240_++] += is_239_[i++];
	    i_240_ += i_243_;
	    i += i_244_;
	}
    }
    
    static final boolean method6554(byte[] is, int i, int i_249_, int i_250_,
				    int i_251_, int i_252_) {
	int i_253_ = i_249_ % i_252_;
	int i_254_;
	if (i_253_ != 0)
	    i_254_ = i_252_ - i_253_;
	else
	    i_254_ = 0;
	int i_255_ = -((i_250_ + i_252_ - 1) / i_252_);
	int i_256_ = -((i_249_ + i_252_ - 1) / i_252_);
	for (int i_257_ = i_255_; i_257_ < 0; i_257_++) {
	    for (int i_258_ = i_256_; i_258_ < 0; i_258_++) {
		if (is[i] == 0)
		    return true;
		i += i_252_;
	    }
	    i -= i_254_;
	    if (is[i - 1] == 0)
		return true;
	    i += i_251_;
	}
	return false;
    }
    
    static final boolean method6555(byte[] is, int i, int i_259_, int i_260_,
				    int i_261_, int i_262_) {
	int i_263_ = i_259_ % i_262_;
	int i_264_;
	if (i_263_ != 0)
	    i_264_ = i_262_ - i_263_;
	else
	    i_264_ = 0;
	int i_265_ = -((i_260_ + i_262_ - 1) / i_262_);
	int i_266_ = -((i_259_ + i_262_ - 1) / i_262_);
	for (int i_267_ = i_265_; i_267_ < 0; i_267_++) {
	    for (int i_268_ = i_266_; i_268_ < 0; i_268_++) {
		if (is[i] == 0)
		    return true;
		i += i_262_;
	    }
	    i -= i_264_;
	    if (is[i - 1] == 0)
		return true;
	    i += i_261_;
	}
	return false;
    }
    
    static final boolean method6556(byte[] is, int i, int i_269_, int i_270_,
				    int i_271_, int i_272_) {
	int i_273_ = i_269_ % i_272_;
	int i_274_;
	if (i_273_ != 0)
	    i_274_ = i_272_ - i_273_;
	else
	    i_274_ = 0;
	int i_275_ = -((i_270_ + i_272_ - 1) / i_272_);
	int i_276_ = -((i_269_ + i_272_ - 1) / i_272_);
	for (int i_277_ = i_275_; i_277_ < 0; i_277_++) {
	    for (int i_278_ = i_276_; i_278_ < 0; i_278_++) {
		if (is[i] == 0)
		    return true;
		i += i_272_;
	    }
	    i -= i_274_;
	    if (is[i - 1] == 0)
		return true;
	    i += i_271_;
	}
	return false;
    }
}
