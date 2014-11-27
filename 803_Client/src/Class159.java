/* Class159 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class159
{
    int anInt1774;
    Class166_Sub2 aClass166_Sub2_1775;
    int anInt1776;
    int anInt1777;
    byte[] aByteArray1778;
    int anInt1779;
    Class103_Sub1 aClass103_Sub1_1780;
    int anInt1781;
    Class184[][] aClass184ArrayArray1782;
    
    static final void method3408(byte[] is, byte[] is_0_, int i, int i_1_,
				 int i_2_, int i_3_, int i_4_, int i_5_) {
	int i_6_ = -(i_2_ >> 2);
	i_2_ = -(i_2_ & 0x3);
	for (int i_7_ = -i_3_; i_7_ < 0; i_7_++) {
	    for (int i_8_ = i_6_; i_8_ < 0; i_8_++) {
		is[i_1_++] -= is_0_[i++];
		is[i_1_++] -= is_0_[i++];
		is[i_1_++] -= is_0_[i++];
		is[i_1_++] -= is_0_[i++];
	    }
	    for (int i_9_ = i_2_; i_9_ < 0; i_9_++)
		is[i_1_++] -= is_0_[i++];
	    i_1_ += i_4_;
	    i += i_5_;
	}
    }
    
    static final void method3409(byte[] is, byte[] is_10_, int i, int i_11_,
				 int i_12_, int i_13_, int i_14_, int i_15_) {
	int i_16_ = -(i_12_ >> 2);
	i_12_ = -(i_12_ & 0x3);
	for (int i_17_ = -i_13_; i_17_ < 0; i_17_++) {
	    for (int i_18_ = i_16_; i_18_ < 0; i_18_++) {
		is[i_11_++] += is_10_[i++];
		is[i_11_++] += is_10_[i++];
		is[i_11_++] += is_10_[i++];
		is[i_11_++] += is_10_[i++];
	    }
	    for (int i_19_ = i_12_; i_19_ < 0; i_19_++)
		is[i_11_++] += is_10_[i++];
	    i_11_ += i_14_;
	    i += i_15_;
	}
    }
    
    void method3410(int i, int i_20_, int i_21_, boolean[][] bools,
		    boolean bool) {
	((Class159) this).aClass103_Sub1_1780.method15186(false);
	((Class159) this).aClass103_Sub1_1780.method15190(false);
	((Class159) this).aClass103_Sub1_1780.method15173(-2);
	((Class159) this).aClass103_Sub1_1780.method15178(1);
	((Class159) this).aClass103_Sub1_1780.method15192(1);
	float f
	    = 1.0F / (float) (((Class103_Sub1)
			       ((Class159) this).aClass103_Sub1_1780).anInt9154
			      * 128);
	if (bool) {
	    for (int i_22_ = 0; i_22_ < ((Class159) this).anInt1776; i_22_++) {
		int i_23_ = i_22_ << ((Class159) this).anInt1781;
		int i_24_ = i_22_ + 1 << ((Class159) this).anInt1781;
		for (int i_25_ = 0; i_25_ < ((Class159) this).anInt1774;
		     i_25_++) {
		    int i_26_ = i_25_ << ((Class159) this).anInt1781;
		    int i_27_ = i_25_ + 1 << ((Class159) this).anInt1781;
		while_86_:
		    for (int i_28_ = i_26_; i_28_ < i_27_; i_28_++) {
			if (i_28_ - i >= -i_21_ && i_28_ - i <= i_21_) {
			    for (int i_29_ = i_23_; i_29_ < i_24_; i_29_++) {
				if (i_29_ - i_20_ >= -i_21_
				    && i_29_ - i_20_ <= i_21_
				    && (bools[i_28_ - i + i_21_]
					[i_29_ - i_20_ + i_21_])) {
				    OpenGL.glMatrixMode(5890);
				    OpenGL.glLoadIdentity();
				    OpenGL.glScalef(f, f, 1.0F);
				    OpenGL.glTranslatef((float) -i_25_ / f,
							(float) -i_22_ / f,
							1.0F);
				    OpenGL.glMatrixMode(5888);
				    ((Class159) this)
					.aClass184ArrayArray1782[i_25_][i_22_]
					.method3810();
				    break while_86_;
				}
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_30_ = 0; i_30_ < ((Class159) this).anInt1776; i_30_++) {
		int i_31_ = i_30_ << ((Class159) this).anInt1781;
		int i_32_ = i_30_ + 1 << ((Class159) this).anInt1781;
		for (int i_33_ = 0; i_33_ < ((Class159) this).anInt1774;
		     i_33_++) {
		    int i_34_ = 0;
		    int i_35_ = i_33_ << ((Class159) this).anInt1781;
		    int i_36_ = i_33_ + 1 << ((Class159) this).anInt1781;
		    Class241_Sub3_Sub2 class241_sub3_sub2
			= (((Class103_Sub1)
			    ((Class159) this).aClass103_Sub1_1780)
			   .aClass241_Sub3_Sub2_9231);
		    class241_sub3_sub2.pointer = 0;
		    for (int i_37_ = i_31_; i_37_ < i_32_; i_37_++) {
			if (i_37_ - i_20_ >= -i_21_
			    && i_37_ - i_20_ <= i_21_) {
			    int i_38_
				= (i_37_ * ((((Class159) this)
					     .aClass166_Sub2_1775.anInt2055)
					    * 266270313)
				   + i_35_);
			    for (int i_39_ = i_35_; i_39_ < i_36_; i_39_++) {
				if (i_39_ - i >= -i_21_ && i_39_ - i <= i_21_
				    && (bools[i_39_ - i + i_21_]
					[i_37_ - i_20_ + i_21_])) {
				    short[] is
					= (((Class166_Sub2)
					    (((Class159) this)
					     .aClass166_Sub2_1775))
					   .aShortArrayArray9829[i_38_]);
				    if (is != null) {
					if (((Class103_Sub1)
					     (((Class159) this)
					      .aClass103_Sub1_1780))
					    .aBool9144) {
					    for (int i_40_ = 0;
						 i_40_ < is.length; i_40_++) {
						class241_sub3_sub2.writeShort
						    (is[i_40_] & 0xffff,
						     -484048531);
						i_34_++;
					    }
					} else {
					    for (int i_41_ = 0;
						 i_41_ < is.length; i_41_++) {
						class241_sub3_sub2.method14621
						    (is[i_41_] & 0xffff,
						     (byte) -56);
						i_34_++;
					    }
					}
				    }
				}
				i_38_++;
			    }
			}
		    }
		    if (i_34_ > 0) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glScalef(f, f, 1.0F);
			OpenGL.glTranslatef((float) -i_33_ / f,
					    (float) -i_30_ / f, 1.0F);
			OpenGL.glMatrixMode(5888);
			((Class159) this).aClass184ArrayArray1782[i_33_]
			    [i_30_].method3800
			    (class241_sub3_sub2.payload, i_34_);
		    }
		}
	    }
	}
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    void method3411(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
		    int i_42_) {
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2
	    = (Class241_Sub39_Sub17_Sub2) class241_sub39_sub17;
	i += (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
	      .anInt11479) + 1;
	i_42_ += (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		  .anInt11476) + 1;
	int i_43_ = i + i_42_ * ((Class159) this).anInt1779;
	int i_44_ = 0;
	int i_45_ = (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		     .anInt11478);
	int i_46_ = (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		     .anInt11477);
	int i_47_ = ((Class159) this).anInt1779 - i_46_;
	int i_48_ = 0;
	if (i_42_ <= 0) {
	    int i_49_ = 1 - i_42_;
	    i_45_ -= i_49_;
	    i_44_ += i_49_ * i_46_;
	    i_43_ += i_49_ * ((Class159) this).anInt1779;
	    i_42_ = 1;
	}
	if (i_42_ + i_45_ >= ((Class159) this).anInt1777) {
	    int i_50_ = i_42_ + i_45_ + 1 - ((Class159) this).anInt1777;
	    i_45_ -= i_50_;
	}
	if (i <= 0) {
	    int i_51_ = 1 - i;
	    i_46_ -= i_51_;
	    i_44_ += i_51_;
	    i_43_ += i_51_;
	    i_48_ += i_51_;
	    i_47_ += i_51_;
	    i = 1;
	}
	if (i + i_46_ >= ((Class159) this).anInt1779) {
	    int i_52_ = i + i_46_ + 1 - ((Class159) this).anInt1779;
	    i_46_ -= i_52_;
	    i_48_ += i_52_;
	    i_47_ += i_52_;
	}
	if (i_46_ > 0 && i_45_ > 0) {
	    method3430(((Class159) this).aByteArray1778,
		       (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
			.aByteArray11480),
		       i_44_, i_43_, i_46_, i_45_, i_47_, i_48_);
	    method3416(i, i_42_, i_46_, i_45_);
	}
    }
    
    void method3412(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
		    int i_53_) {
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2
	    = (Class241_Sub39_Sub17_Sub2) class241_sub39_sub17;
	i += (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
	      .anInt11479) + 1;
	i_53_ += (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		  .anInt11476) + 1;
	int i_54_ = i + i_53_ * ((Class159) this).anInt1779;
	int i_55_ = 0;
	int i_56_ = (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		     .anInt11478);
	int i_57_ = (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		     .anInt11477);
	int i_58_ = ((Class159) this).anInt1779 - i_57_;
	int i_59_ = 0;
	if (i_53_ <= 0) {
	    int i_60_ = 1 - i_53_;
	    i_56_ -= i_60_;
	    i_55_ += i_60_ * i_57_;
	    i_54_ += i_60_ * ((Class159) this).anInt1779;
	    i_53_ = 1;
	}
	if (i_53_ + i_56_ >= ((Class159) this).anInt1777) {
	    int i_61_ = i_53_ + i_56_ + 1 - ((Class159) this).anInt1777;
	    i_56_ -= i_61_;
	}
	if (i <= 0) {
	    int i_62_ = 1 - i;
	    i_57_ -= i_62_;
	    i_55_ += i_62_;
	    i_54_ += i_62_;
	    i_59_ += i_62_;
	    i_58_ += i_62_;
	    i = 1;
	}
	if (i + i_57_ >= ((Class159) this).anInt1779) {
	    int i_63_ = i + i_57_ + 1 - ((Class159) this).anInt1779;
	    i_57_ -= i_63_;
	    i_59_ += i_63_;
	    i_58_ += i_63_;
	}
	if (i_57_ > 0 && i_56_ > 0) {
	    method3408(((Class159) this).aByteArray1778,
		       (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
			.aByteArray11480),
		       i_55_, i_54_, i_57_, i_56_, i_58_, i_59_);
	    method3416(i, i_53_, i_57_, i_56_);
	}
    }
    
    void method3413(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
		    int i_64_) {
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2
	    = (Class241_Sub39_Sub17_Sub2) class241_sub39_sub17;
	i += (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
	      .anInt11479) + 1;
	i_64_ += (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		  .anInt11476) + 1;
	int i_65_ = i + i_64_ * ((Class159) this).anInt1779;
	int i_66_ = 0;
	int i_67_ = (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		     .anInt11478);
	int i_68_ = (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		     .anInt11477);
	int i_69_ = ((Class159) this).anInt1779 - i_68_;
	int i_70_ = 0;
	if (i_64_ <= 0) {
	    int i_71_ = 1 - i_64_;
	    i_67_ -= i_71_;
	    i_66_ += i_71_ * i_68_;
	    i_65_ += i_71_ * ((Class159) this).anInt1779;
	    i_64_ = 1;
	}
	if (i_64_ + i_67_ >= ((Class159) this).anInt1777) {
	    int i_72_ = i_64_ + i_67_ + 1 - ((Class159) this).anInt1777;
	    i_67_ -= i_72_;
	}
	if (i <= 0) {
	    int i_73_ = 1 - i;
	    i_68_ -= i_73_;
	    i_66_ += i_73_;
	    i_65_ += i_73_;
	    i_70_ += i_73_;
	    i_69_ += i_73_;
	    i = 1;
	}
	if (i + i_68_ >= ((Class159) this).anInt1779) {
	    int i_74_ = i + i_68_ + 1 - ((Class159) this).anInt1779;
	    i_68_ -= i_74_;
	    i_70_ += i_74_;
	    i_69_ += i_74_;
	}
	if (i_68_ > 0 && i_67_ > 0) {
	    method3430(((Class159) this).aByteArray1778,
		       (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
			.aByteArray11480),
		       i_66_, i_65_, i_68_, i_67_, i_69_, i_70_);
	    method3416(i, i_64_, i_68_, i_67_);
	}
    }
    
    void method3414(int i, int i_75_, int i_76_, boolean[][] bools,
		    boolean bool) {
	((Class159) this).aClass103_Sub1_1780.method15186(false);
	((Class159) this).aClass103_Sub1_1780.method15190(false);
	((Class159) this).aClass103_Sub1_1780.method15173(-2);
	((Class159) this).aClass103_Sub1_1780.method15178(1);
	((Class159) this).aClass103_Sub1_1780.method15192(1);
	float f
	    = 1.0F / (float) (((Class103_Sub1)
			       ((Class159) this).aClass103_Sub1_1780).anInt9154
			      * 128);
	if (bool) {
	    for (int i_77_ = 0; i_77_ < ((Class159) this).anInt1776; i_77_++) {
		int i_78_ = i_77_ << ((Class159) this).anInt1781;
		int i_79_ = i_77_ + 1 << ((Class159) this).anInt1781;
		for (int i_80_ = 0; i_80_ < ((Class159) this).anInt1774;
		     i_80_++) {
		    int i_81_ = i_80_ << ((Class159) this).anInt1781;
		    int i_82_ = i_80_ + 1 << ((Class159) this).anInt1781;
		while_87_:
		    for (int i_83_ = i_81_; i_83_ < i_82_; i_83_++) {
			if (i_83_ - i >= -i_76_ && i_83_ - i <= i_76_) {
			    for (int i_84_ = i_78_; i_84_ < i_79_; i_84_++) {
				if (i_84_ - i_75_ >= -i_76_
				    && i_84_ - i_75_ <= i_76_
				    && (bools[i_83_ - i + i_76_]
					[i_84_ - i_75_ + i_76_])) {
				    OpenGL.glMatrixMode(5890);
				    OpenGL.glLoadIdentity();
				    OpenGL.glScalef(f, f, 1.0F);
				    OpenGL.glTranslatef((float) -i_80_ / f,
							(float) -i_77_ / f,
							1.0F);
				    OpenGL.glMatrixMode(5888);
				    ((Class159) this)
					.aClass184ArrayArray1782[i_80_][i_77_]
					.method3810();
				    break while_87_;
				}
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_85_ = 0; i_85_ < ((Class159) this).anInt1776; i_85_++) {
		int i_86_ = i_85_ << ((Class159) this).anInt1781;
		int i_87_ = i_85_ + 1 << ((Class159) this).anInt1781;
		for (int i_88_ = 0; i_88_ < ((Class159) this).anInt1774;
		     i_88_++) {
		    int i_89_ = 0;
		    int i_90_ = i_88_ << ((Class159) this).anInt1781;
		    int i_91_ = i_88_ + 1 << ((Class159) this).anInt1781;
		    Class241_Sub3_Sub2 class241_sub3_sub2
			= (((Class103_Sub1)
			    ((Class159) this).aClass103_Sub1_1780)
			   .aClass241_Sub3_Sub2_9231);
		    class241_sub3_sub2.pointer = 0;
		    for (int i_92_ = i_86_; i_92_ < i_87_; i_92_++) {
			if (i_92_ - i_75_ >= -i_76_
			    && i_92_ - i_75_ <= i_76_) {
			    int i_93_
				= (i_92_ * ((((Class159) this)
					     .aClass166_Sub2_1775.anInt2055)
					    * 266270313)
				   + i_90_);
			    for (int i_94_ = i_90_; i_94_ < i_91_; i_94_++) {
				if (i_94_ - i >= -i_76_ && i_94_ - i <= i_76_
				    && (bools[i_94_ - i + i_76_]
					[i_92_ - i_75_ + i_76_])) {
				    short[] is
					= (((Class166_Sub2)
					    (((Class159) this)
					     .aClass166_Sub2_1775))
					   .aShortArrayArray9829[i_93_]);
				    if (is != null) {
					if (((Class103_Sub1)
					     (((Class159) this)
					      .aClass103_Sub1_1780))
					    .aBool9144) {
					    for (int i_95_ = 0;
						 i_95_ < is.length; i_95_++) {
						class241_sub3_sub2.writeShort
						    (is[i_95_] & 0xffff,
						     -484048531);
						i_89_++;
					    }
					} else {
					    for (int i_96_ = 0;
						 i_96_ < is.length; i_96_++) {
						class241_sub3_sub2.method14621
						    (is[i_96_] & 0xffff,
						     (byte) 52);
						i_89_++;
					    }
					}
				    }
				}
				i_93_++;
			    }
			}
		    }
		    if (i_89_ > 0) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glScalef(f, f, 1.0F);
			OpenGL.glTranslatef((float) -i_88_ / f,
					    (float) -i_85_ / f, 1.0F);
			OpenGL.glMatrixMode(5888);
			((Class159) this).aClass184ArrayArray1782[i_88_]
			    [i_85_].method3800
			    (class241_sub3_sub2.payload, i_89_);
		    }
		}
	    }
	}
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    boolean method3415(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
		       int i_97_) {
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2
	    = (Class241_Sub39_Sub17_Sub2) class241_sub39_sub17;
	i += (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
	      .anInt11479) + 1;
	i_97_ += (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		  .anInt11476) + 1;
	int i_98_ = i + i_97_ * ((Class159) this).anInt1779;
	int i_99_ = (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		     .anInt11478);
	int i_100_ = (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		      .anInt11477);
	int i_101_ = ((Class159) this).anInt1779 - i_100_;
	if (i_97_ <= 0) {
	    int i_102_ = 1 - i_97_;
	    i_99_ -= i_102_;
	    i_98_ += i_102_ * ((Class159) this).anInt1779;
	    i_97_ = 1;
	}
	if (i_97_ + i_99_ >= ((Class159) this).anInt1777) {
	    int i_103_ = i_97_ + i_99_ + 1 - ((Class159) this).anInt1777;
	    i_99_ -= i_103_;
	}
	if (i <= 0) {
	    int i_104_ = 1 - i;
	    i_100_ -= i_104_;
	    i_98_ += i_104_;
	    i_101_ += i_104_;
	    i = 1;
	}
	if (i + i_100_ >= ((Class159) this).anInt1779) {
	    int i_105_ = i + i_100_ + 1 - ((Class159) this).anInt1779;
	    i_100_ -= i_105_;
	    i_101_ += i_105_;
	}
	if (i_100_ <= 0 || i_99_ <= 0)
	    return false;
	int i_106_ = 8;
	i_101_ += (i_106_ - 1) * ((Class159) this).anInt1779;
	return method3417(((Class159) this).aByteArray1778, i_98_, i_100_,
			  i_99_, i_101_, i_106_);
    }
    
    void method3416(int i, int i_107_, int i_108_, int i_109_) {
	if (((Class159) this).aClass184ArrayArray1782 != null) {
	    int i_110_ = i - 1 >> 7;
	    int i_111_ = i - 1 + i_108_ - 1 >> 7;
	    int i_112_ = i_107_ - 1 >> 7;
	    int i_113_ = i_107_ - 1 + i_109_ - 1 >> 7;
	    for (int i_114_ = i_110_; i_114_ <= i_111_; i_114_++) {
		Class184[] class184s
		    = ((Class159) this).aClass184ArrayArray1782[i_114_];
		for (int i_115_ = i_112_; i_115_ <= i_113_; i_115_++)
		    ((Class184) class184s[i_115_]).aBool2170 = true;
	    }
	}
    }
    
    static final boolean method3417(byte[] is, int i, int i_116_, int i_117_,
				    int i_118_, int i_119_) {
	int i_120_ = i_116_ % i_119_;
	int i_121_;
	if (i_120_ != 0)
	    i_121_ = i_119_ - i_120_;
	else
	    i_121_ = 0;
	int i_122_ = -((i_117_ + i_119_ - 1) / i_119_);
	int i_123_ = -((i_116_ + i_119_ - 1) / i_119_);
	for (int i_124_ = i_122_; i_124_ < 0; i_124_++) {
	    for (int i_125_ = i_123_; i_125_ < 0; i_125_++) {
		if (is[i] == 0)
		    return true;
		i += i_119_;
	    }
	    i -= i_121_;
	    if (is[i - 1] == 0)
		return true;
	    i += i_118_;
	}
	return false;
    }
    
    Class159(Class103_Sub1 class103_sub1, Class166_Sub2 class166_sub2) {
	((Class159) this).aClass103_Sub1_1780 = class103_sub1;
	((Class159) this).aClass166_Sub2_1775 = class166_sub2;
	((Class159) this).anInt1779
	    = 2 + ((((Class159) this).aClass166_Sub2_1775.anInt2055 * 266270313
		    * (((Class159) this).aClass166_Sub2_1775.anInt2053
		       * 2039042417))
		   >> (((Class103_Sub1) ((Class159) this).aClass103_Sub1_1780)
		       .anInt9093));
	((Class159) this).anInt1777
	    = 2 + ((((Class159) this).aClass166_Sub2_1775.anInt2052 * -14610189
		    * (((Class159) this).aClass166_Sub2_1775.anInt2053
		       * 2039042417))
		   >> (((Class103_Sub1) ((Class159) this).aClass103_Sub1_1780)
		       .anInt9093));
	((Class159) this).aByteArray1778
	    = (new byte
	       [((Class159) this).anInt1779 * ((Class159) this).anInt1777]);
	((Class159) this).anInt1781
	    = (7
	       + (((Class103_Sub1) ((Class159) this).aClass103_Sub1_1780)
		  .anInt9093)
	       - ((Class159) this).aClass166_Sub2_1775.anInt2054 * -122333825);
	((Class159) this).anInt1774
	    = (((Class159) this).aClass166_Sub2_1775.anInt2055 * 266270313
	       >> ((Class159) this).anInt1781);
	((Class159) this).anInt1776
	    = (((Class159) this).aClass166_Sub2_1775.anInt2052 * -14610189
	       >> ((Class159) this).anInt1781);
    }
    
    void method3418(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
		    int i_126_) {
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2
	    = (Class241_Sub39_Sub17_Sub2) class241_sub39_sub17;
	i += (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
	      .anInt11479) + 1;
	i_126_ += (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		   .anInt11476) + 1;
	int i_127_ = i + i_126_ * ((Class159) this).anInt1779;
	int i_128_ = 0;
	int i_129_ = (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		      .anInt11478);
	int i_130_ = (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		      .anInt11477);
	int i_131_ = ((Class159) this).anInt1779 - i_130_;
	int i_132_ = 0;
	if (i_126_ <= 0) {
	    int i_133_ = 1 - i_126_;
	    i_129_ -= i_133_;
	    i_128_ += i_133_ * i_130_;
	    i_127_ += i_133_ * ((Class159) this).anInt1779;
	    i_126_ = 1;
	}
	if (i_126_ + i_129_ >= ((Class159) this).anInt1777) {
	    int i_134_ = i_126_ + i_129_ + 1 - ((Class159) this).anInt1777;
	    i_129_ -= i_134_;
	}
	if (i <= 0) {
	    int i_135_ = 1 - i;
	    i_130_ -= i_135_;
	    i_128_ += i_135_;
	    i_127_ += i_135_;
	    i_132_ += i_135_;
	    i_131_ += i_135_;
	    i = 1;
	}
	if (i + i_130_ >= ((Class159) this).anInt1779) {
	    int i_136_ = i + i_130_ + 1 - ((Class159) this).anInt1779;
	    i_130_ -= i_136_;
	    i_132_ += i_136_;
	    i_131_ += i_136_;
	}
	if (i_130_ > 0 && i_129_ > 0) {
	    method3430(((Class159) this).aByteArray1778,
		       (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
			.aByteArray11480),
		       i_128_, i_127_, i_130_, i_129_, i_131_, i_132_);
	    method3416(i, i_126_, i_130_, i_129_);
	}
    }
    
    static final void method3419(byte[] is, byte[] is_137_, int i, int i_138_,
				 int i_139_, int i_140_, int i_141_,
				 int i_142_) {
	int i_143_ = -(i_139_ >> 2);
	i_139_ = -(i_139_ & 0x3);
	for (int i_144_ = -i_140_; i_144_ < 0; i_144_++) {
	    for (int i_145_ = i_143_; i_145_ < 0; i_145_++) {
		is[i_138_++] += is_137_[i++];
		is[i_138_++] += is_137_[i++];
		is[i_138_++] += is_137_[i++];
		is[i_138_++] += is_137_[i++];
	    }
	    for (int i_146_ = i_139_; i_146_ < 0; i_146_++)
		is[i_138_++] += is_137_[i++];
	    i_138_ += i_141_;
	    i += i_142_;
	}
    }
    
    void method3420(int i, int i_147_, int i_148_, boolean[][] bools,
		    boolean bool) {
	((Class159) this).aClass103_Sub1_1780.method15186(false);
	((Class159) this).aClass103_Sub1_1780.method15190(false);
	((Class159) this).aClass103_Sub1_1780.method15173(-2);
	((Class159) this).aClass103_Sub1_1780.method15178(1);
	((Class159) this).aClass103_Sub1_1780.method15192(1);
	float f
	    = 1.0F / (float) (((Class103_Sub1)
			       ((Class159) this).aClass103_Sub1_1780).anInt9154
			      * 128);
	if (bool) {
	    for (int i_149_ = 0; i_149_ < ((Class159) this).anInt1776;
		 i_149_++) {
		int i_150_ = i_149_ << ((Class159) this).anInt1781;
		int i_151_ = i_149_ + 1 << ((Class159) this).anInt1781;
		for (int i_152_ = 0; i_152_ < ((Class159) this).anInt1774;
		     i_152_++) {
		    int i_153_ = i_152_ << ((Class159) this).anInt1781;
		    int i_154_ = i_152_ + 1 << ((Class159) this).anInt1781;
		while_88_:
		    for (int i_155_ = i_153_; i_155_ < i_154_; i_155_++) {
			if (i_155_ - i >= -i_148_ && i_155_ - i <= i_148_) {
			    for (int i_156_ = i_150_; i_156_ < i_151_;
				 i_156_++) {
				if (i_156_ - i_147_ >= -i_148_
				    && i_156_ - i_147_ <= i_148_
				    && (bools[i_155_ - i + i_148_]
					[i_156_ - i_147_ + i_148_])) {
				    OpenGL.glMatrixMode(5890);
				    OpenGL.glLoadIdentity();
				    OpenGL.glScalef(f, f, 1.0F);
				    OpenGL.glTranslatef((float) -i_152_ / f,
							(float) -i_149_ / f,
							1.0F);
				    OpenGL.glMatrixMode(5888);
				    ((Class159) this)
					.aClass184ArrayArray1782[i_152_]
					[i_149_].method3810();
				    break while_88_;
				}
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_157_ = 0; i_157_ < ((Class159) this).anInt1776;
		 i_157_++) {
		int i_158_ = i_157_ << ((Class159) this).anInt1781;
		int i_159_ = i_157_ + 1 << ((Class159) this).anInt1781;
		for (int i_160_ = 0; i_160_ < ((Class159) this).anInt1774;
		     i_160_++) {
		    int i_161_ = 0;
		    int i_162_ = i_160_ << ((Class159) this).anInt1781;
		    int i_163_ = i_160_ + 1 << ((Class159) this).anInt1781;
		    Class241_Sub3_Sub2 class241_sub3_sub2
			= (((Class103_Sub1)
			    ((Class159) this).aClass103_Sub1_1780)
			   .aClass241_Sub3_Sub2_9231);
		    class241_sub3_sub2.pointer = 0;
		    for (int i_164_ = i_158_; i_164_ < i_159_; i_164_++) {
			if (i_164_ - i_147_ >= -i_148_
			    && i_164_ - i_147_ <= i_148_) {
			    int i_165_
				= (i_164_ * ((((Class159) this)
					      .aClass166_Sub2_1775.anInt2055)
					     * 266270313)
				   + i_162_);
			    for (int i_166_ = i_162_; i_166_ < i_163_;
				 i_166_++) {
				if (i_166_ - i >= -i_148_
				    && i_166_ - i <= i_148_
				    && (bools[i_166_ - i + i_148_]
					[i_164_ - i_147_ + i_148_])) {
				    short[] is
					= (((Class166_Sub2)
					    (((Class159) this)
					     .aClass166_Sub2_1775))
					   .aShortArrayArray9829[i_165_]);
				    if (is != null) {
					if (((Class103_Sub1)
					     (((Class159) this)
					      .aClass103_Sub1_1780))
					    .aBool9144) {
					    for (int i_167_ = 0;
						 i_167_ < is.length;
						 i_167_++) {
						class241_sub3_sub2.writeShort
						    (is[i_167_] & 0xffff,
						     -484048531);
						i_161_++;
					    }
					} else {
					    for (int i_168_ = 0;
						 i_168_ < is.length;
						 i_168_++) {
						class241_sub3_sub2.method14621
						    (is[i_168_] & 0xffff,
						     (byte) 15);
						i_161_++;
					    }
					}
				    }
				}
				i_165_++;
			    }
			}
		    }
		    if (i_161_ > 0) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glScalef(f, f, 1.0F);
			OpenGL.glTranslatef((float) -i_160_ / f,
					    (float) -i_157_ / f, 1.0F);
			OpenGL.glMatrixMode(5888);
			((Class159) this).aClass184ArrayArray1782[i_160_]
			    [i_157_].method3800
			    (class241_sub3_sub2.payload, i_161_);
		    }
		}
	    }
	}
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    void method3421(int i, int i_169_, int i_170_, boolean[][] bools,
		    boolean bool) {
	((Class159) this).aClass103_Sub1_1780.method15186(false);
	((Class159) this).aClass103_Sub1_1780.method15190(false);
	((Class159) this).aClass103_Sub1_1780.method15173(-2);
	((Class159) this).aClass103_Sub1_1780.method15178(1);
	((Class159) this).aClass103_Sub1_1780.method15192(1);
	float f
	    = 1.0F / (float) (((Class103_Sub1)
			       ((Class159) this).aClass103_Sub1_1780).anInt9154
			      * 128);
	if (bool) {
	    for (int i_171_ = 0; i_171_ < ((Class159) this).anInt1776;
		 i_171_++) {
		int i_172_ = i_171_ << ((Class159) this).anInt1781;
		int i_173_ = i_171_ + 1 << ((Class159) this).anInt1781;
		for (int i_174_ = 0; i_174_ < ((Class159) this).anInt1774;
		     i_174_++) {
		    int i_175_ = i_174_ << ((Class159) this).anInt1781;
		    int i_176_ = i_174_ + 1 << ((Class159) this).anInt1781;
		while_89_:
		    for (int i_177_ = i_175_; i_177_ < i_176_; i_177_++) {
			if (i_177_ - i >= -i_170_ && i_177_ - i <= i_170_) {
			    for (int i_178_ = i_172_; i_178_ < i_173_;
				 i_178_++) {
				if (i_178_ - i_169_ >= -i_170_
				    && i_178_ - i_169_ <= i_170_
				    && (bools[i_177_ - i + i_170_]
					[i_178_ - i_169_ + i_170_])) {
				    OpenGL.glMatrixMode(5890);
				    OpenGL.glLoadIdentity();
				    OpenGL.glScalef(f, f, 1.0F);
				    OpenGL.glTranslatef((float) -i_174_ / f,
							(float) -i_171_ / f,
							1.0F);
				    OpenGL.glMatrixMode(5888);
				    ((Class159) this)
					.aClass184ArrayArray1782[i_174_]
					[i_171_].method3810();
				    break while_89_;
				}
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_179_ = 0; i_179_ < ((Class159) this).anInt1776;
		 i_179_++) {
		int i_180_ = i_179_ << ((Class159) this).anInt1781;
		int i_181_ = i_179_ + 1 << ((Class159) this).anInt1781;
		for (int i_182_ = 0; i_182_ < ((Class159) this).anInt1774;
		     i_182_++) {
		    int i_183_ = 0;
		    int i_184_ = i_182_ << ((Class159) this).anInt1781;
		    int i_185_ = i_182_ + 1 << ((Class159) this).anInt1781;
		    Class241_Sub3_Sub2 class241_sub3_sub2
			= (((Class103_Sub1)
			    ((Class159) this).aClass103_Sub1_1780)
			   .aClass241_Sub3_Sub2_9231);
		    class241_sub3_sub2.pointer = 0;
		    for (int i_186_ = i_180_; i_186_ < i_181_; i_186_++) {
			if (i_186_ - i_169_ >= -i_170_
			    && i_186_ - i_169_ <= i_170_) {
			    int i_187_
				= (i_186_ * ((((Class159) this)
					      .aClass166_Sub2_1775.anInt2055)
					     * 266270313)
				   + i_184_);
			    for (int i_188_ = i_184_; i_188_ < i_185_;
				 i_188_++) {
				if (i_188_ - i >= -i_170_
				    && i_188_ - i <= i_170_
				    && (bools[i_188_ - i + i_170_]
					[i_186_ - i_169_ + i_170_])) {
				    short[] is
					= (((Class166_Sub2)
					    (((Class159) this)
					     .aClass166_Sub2_1775))
					   .aShortArrayArray9829[i_187_]);
				    if (is != null) {
					if (((Class103_Sub1)
					     (((Class159) this)
					      .aClass103_Sub1_1780))
					    .aBool9144) {
					    for (int i_189_ = 0;
						 i_189_ < is.length;
						 i_189_++) {
						class241_sub3_sub2.writeShort
						    (is[i_189_] & 0xffff,
						     -484048531);
						i_183_++;
					    }
					} else {
					    for (int i_190_ = 0;
						 i_190_ < is.length;
						 i_190_++) {
						class241_sub3_sub2.method14621
						    (is[i_190_] & 0xffff,
						     (byte) -70);
						i_183_++;
					    }
					}
				    }
				}
				i_187_++;
			    }
			}
		    }
		    if (i_183_ > 0) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glScalef(f, f, 1.0F);
			OpenGL.glTranslatef((float) -i_182_ / f,
					    (float) -i_179_ / f, 1.0F);
			OpenGL.glMatrixMode(5888);
			((Class159) this).aClass184ArrayArray1782[i_182_]
			    [i_179_].method3800
			    (class241_sub3_sub2.payload, i_183_);
		    }
		}
	    }
	}
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    void method3422(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
		    int i_191_) {
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2
	    = (Class241_Sub39_Sub17_Sub2) class241_sub39_sub17;
	i += (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
	      .anInt11479) + 1;
	i_191_ += (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		   .anInt11476) + 1;
	int i_192_ = i + i_191_ * ((Class159) this).anInt1779;
	int i_193_ = 0;
	int i_194_ = (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		      .anInt11478);
	int i_195_ = (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		      .anInt11477);
	int i_196_ = ((Class159) this).anInt1779 - i_195_;
	int i_197_ = 0;
	if (i_191_ <= 0) {
	    int i_198_ = 1 - i_191_;
	    i_194_ -= i_198_;
	    i_193_ += i_198_ * i_195_;
	    i_192_ += i_198_ * ((Class159) this).anInt1779;
	    i_191_ = 1;
	}
	if (i_191_ + i_194_ >= ((Class159) this).anInt1777) {
	    int i_199_ = i_191_ + i_194_ + 1 - ((Class159) this).anInt1777;
	    i_194_ -= i_199_;
	}
	if (i <= 0) {
	    int i_200_ = 1 - i;
	    i_195_ -= i_200_;
	    i_193_ += i_200_;
	    i_192_ += i_200_;
	    i_197_ += i_200_;
	    i_196_ += i_200_;
	    i = 1;
	}
	if (i + i_195_ >= ((Class159) this).anInt1779) {
	    int i_201_ = i + i_195_ + 1 - ((Class159) this).anInt1779;
	    i_195_ -= i_201_;
	    i_197_ += i_201_;
	    i_196_ += i_201_;
	}
	if (i_195_ > 0 && i_194_ > 0) {
	    method3408(((Class159) this).aByteArray1778,
		       (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
			.aByteArray11480),
		       i_193_, i_192_, i_195_, i_194_, i_196_, i_197_);
	    method3416(i, i_191_, i_195_, i_194_);
	}
    }
    
    void method3423() {
	((Class159) this).aClass184ArrayArray1782
	    = (new Class184[((Class159) this).anInt1774]
	       [((Class159) this).anInt1776]);
	for (int i = 0; i < ((Class159) this).anInt1776; i++) {
	    for (int i_202_ = 0; i_202_ < ((Class159) this).anInt1774;
		 i_202_++)
		((Class159) this).aClass184ArrayArray1782[i_202_][i]
		    = new Class184(((Class159) this).aClass103_Sub1_1780, this,
				   ((Class159) this).aClass166_Sub2_1775,
				   i_202_, i, ((Class159) this).anInt1781,
				   i_202_ * 128 + 1, i * 128 + 1);
	}
    }
    
    void method3424(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
		    int i_203_) {
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2
	    = (Class241_Sub39_Sub17_Sub2) class241_sub39_sub17;
	i += (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
	      .anInt11479) + 1;
	i_203_ += (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		   .anInt11476) + 1;
	int i_204_ = i + i_203_ * ((Class159) this).anInt1779;
	int i_205_ = 0;
	int i_206_ = (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		      .anInt11478);
	int i_207_ = (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		      .anInt11477);
	int i_208_ = ((Class159) this).anInt1779 - i_207_;
	int i_209_ = 0;
	if (i_203_ <= 0) {
	    int i_210_ = 1 - i_203_;
	    i_206_ -= i_210_;
	    i_205_ += i_210_ * i_207_;
	    i_204_ += i_210_ * ((Class159) this).anInt1779;
	    i_203_ = 1;
	}
	if (i_203_ + i_206_ >= ((Class159) this).anInt1777) {
	    int i_211_ = i_203_ + i_206_ + 1 - ((Class159) this).anInt1777;
	    i_206_ -= i_211_;
	}
	if (i <= 0) {
	    int i_212_ = 1 - i;
	    i_207_ -= i_212_;
	    i_205_ += i_212_;
	    i_204_ += i_212_;
	    i_209_ += i_212_;
	    i_208_ += i_212_;
	    i = 1;
	}
	if (i + i_207_ >= ((Class159) this).anInt1779) {
	    int i_213_ = i + i_207_ + 1 - ((Class159) this).anInt1779;
	    i_207_ -= i_213_;
	    i_209_ += i_213_;
	    i_208_ += i_213_;
	}
	if (i_207_ > 0 && i_206_ > 0) {
	    method3430(((Class159) this).aByteArray1778,
		       (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
			.aByteArray11480),
		       i_205_, i_204_, i_207_, i_206_, i_208_, i_209_);
	    method3416(i, i_203_, i_207_, i_206_);
	}
    }
    
    void method3425() {
	((Class159) this).aClass184ArrayArray1782
	    = (new Class184[((Class159) this).anInt1774]
	       [((Class159) this).anInt1776]);
	for (int i = 0; i < ((Class159) this).anInt1776; i++) {
	    for (int i_214_ = 0; i_214_ < ((Class159) this).anInt1774;
		 i_214_++)
		((Class159) this).aClass184ArrayArray1782[i_214_][i]
		    = new Class184(((Class159) this).aClass103_Sub1_1780, this,
				   ((Class159) this).aClass166_Sub2_1775,
				   i_214_, i, ((Class159) this).anInt1781,
				   i_214_ * 128 + 1, i * 128 + 1);
	}
    }
    
    boolean method3426(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
		       int i_215_) {
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2
	    = (Class241_Sub39_Sub17_Sub2) class241_sub39_sub17;
	i += (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
	      .anInt11479) + 1;
	i_215_ += (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		   .anInt11476) + 1;
	int i_216_ = i + i_215_ * ((Class159) this).anInt1779;
	int i_217_ = (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		      .anInt11478);
	int i_218_ = (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		      .anInt11477);
	int i_219_ = ((Class159) this).anInt1779 - i_218_;
	if (i_215_ <= 0) {
	    int i_220_ = 1 - i_215_;
	    i_217_ -= i_220_;
	    i_216_ += i_220_ * ((Class159) this).anInt1779;
	    i_215_ = 1;
	}
	if (i_215_ + i_217_ >= ((Class159) this).anInt1777) {
	    int i_221_ = i_215_ + i_217_ + 1 - ((Class159) this).anInt1777;
	    i_217_ -= i_221_;
	}
	if (i <= 0) {
	    int i_222_ = 1 - i;
	    i_218_ -= i_222_;
	    i_216_ += i_222_;
	    i_219_ += i_222_;
	    i = 1;
	}
	if (i + i_218_ >= ((Class159) this).anInt1779) {
	    int i_223_ = i + i_218_ + 1 - ((Class159) this).anInt1779;
	    i_218_ -= i_223_;
	    i_219_ += i_223_;
	}
	if (i_218_ <= 0 || i_217_ <= 0)
	    return false;
	int i_224_ = 8;
	i_219_ += (i_224_ - 1) * ((Class159) this).anInt1779;
	return method3417(((Class159) this).aByteArray1778, i_216_, i_218_,
			  i_217_, i_219_, i_224_);
    }
    
    boolean method3427(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
		       int i_225_) {
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2
	    = (Class241_Sub39_Sub17_Sub2) class241_sub39_sub17;
	i += (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
	      .anInt11479) + 1;
	i_225_ += (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		   .anInt11476) + 1;
	int i_226_ = i + i_225_ * ((Class159) this).anInt1779;
	int i_227_ = (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		      .anInt11478);
	int i_228_ = (((Class241_Sub39_Sub17_Sub2) class241_sub39_sub17_sub2)
		      .anInt11477);
	int i_229_ = ((Class159) this).anInt1779 - i_228_;
	if (i_225_ <= 0) {
	    int i_230_ = 1 - i_225_;
	    i_227_ -= i_230_;
	    i_226_ += i_230_ * ((Class159) this).anInt1779;
	    i_225_ = 1;
	}
	if (i_225_ + i_227_ >= ((Class159) this).anInt1777) {
	    int i_231_ = i_225_ + i_227_ + 1 - ((Class159) this).anInt1777;
	    i_227_ -= i_231_;
	}
	if (i <= 0) {
	    int i_232_ = 1 - i;
	    i_228_ -= i_232_;
	    i_226_ += i_232_;
	    i_229_ += i_232_;
	    i = 1;
	}
	if (i + i_228_ >= ((Class159) this).anInt1779) {
	    int i_233_ = i + i_228_ + 1 - ((Class159) this).anInt1779;
	    i_228_ -= i_233_;
	    i_229_ += i_233_;
	}
	if (i_228_ <= 0 || i_227_ <= 0)
	    return false;
	int i_234_ = 8;
	i_229_ += (i_234_ - 1) * ((Class159) this).anInt1779;
	return method3417(((Class159) this).aByteArray1778, i_226_, i_228_,
			  i_227_, i_229_, i_234_);
    }
    
    void method3428(int i, int i_235_, int i_236_, int i_237_) {
	if (((Class159) this).aClass184ArrayArray1782 != null) {
	    int i_238_ = i - 1 >> 7;
	    int i_239_ = i - 1 + i_236_ - 1 >> 7;
	    int i_240_ = i_235_ - 1 >> 7;
	    int i_241_ = i_235_ - 1 + i_237_ - 1 >> 7;
	    for (int i_242_ = i_238_; i_242_ <= i_239_; i_242_++) {
		Class184[] class184s
		    = ((Class159) this).aClass184ArrayArray1782[i_242_];
		for (int i_243_ = i_240_; i_243_ <= i_241_; i_243_++)
		    ((Class184) class184s[i_243_]).aBool2170 = true;
	    }
	}
    }
    
    static final void method3429(byte[] is, byte[] is_244_, int i, int i_245_,
				 int i_246_, int i_247_, int i_248_,
				 int i_249_) {
	int i_250_ = -(i_246_ >> 2);
	i_246_ = -(i_246_ & 0x3);
	for (int i_251_ = -i_247_; i_251_ < 0; i_251_++) {
	    for (int i_252_ = i_250_; i_252_ < 0; i_252_++) {
		is[i_245_++] += is_244_[i++];
		is[i_245_++] += is_244_[i++];
		is[i_245_++] += is_244_[i++];
		is[i_245_++] += is_244_[i++];
	    }
	    for (int i_253_ = i_246_; i_253_ < 0; i_253_++)
		is[i_245_++] += is_244_[i++];
	    i_245_ += i_248_;
	    i += i_249_;
	}
    }
    
    static final void method3430(byte[] is, byte[] is_254_, int i, int i_255_,
				 int i_256_, int i_257_, int i_258_,
				 int i_259_) {
	int i_260_ = -(i_256_ >> 2);
	i_256_ = -(i_256_ & 0x3);
	for (int i_261_ = -i_257_; i_261_ < 0; i_261_++) {
	    for (int i_262_ = i_260_; i_262_ < 0; i_262_++) {
		is[i_255_++] += is_254_[i++];
		is[i_255_++] += is_254_[i++];
		is[i_255_++] += is_254_[i++];
		is[i_255_++] += is_254_[i++];
	    }
	    for (int i_263_ = i_256_; i_263_ < 0; i_263_++)
		is[i_255_++] += is_254_[i++];
	    i_255_ += i_258_;
	    i += i_259_;
	}
    }
    
    void method3431() {
	((Class159) this).aClass184ArrayArray1782
	    = (new Class184[((Class159) this).anInt1774]
	       [((Class159) this).anInt1776]);
	for (int i = 0; i < ((Class159) this).anInt1776; i++) {
	    for (int i_264_ = 0; i_264_ < ((Class159) this).anInt1774;
		 i_264_++)
		((Class159) this).aClass184ArrayArray1782[i_264_][i]
		    = new Class184(((Class159) this).aClass103_Sub1_1780, this,
				   ((Class159) this).aClass166_Sub2_1775,
				   i_264_, i, ((Class159) this).anInt1781,
				   i_264_ * 128 + 1, i * 128 + 1);
	}
    }
    
    static final void method3432(byte[] is, byte[] is_265_, int i, int i_266_,
				 int i_267_, int i_268_, int i_269_,
				 int i_270_) {
	int i_271_ = -(i_267_ >> 2);
	i_267_ = -(i_267_ & 0x3);
	for (int i_272_ = -i_268_; i_272_ < 0; i_272_++) {
	    for (int i_273_ = i_271_; i_273_ < 0; i_273_++) {
		is[i_266_++] += is_265_[i++];
		is[i_266_++] += is_265_[i++];
		is[i_266_++] += is_265_[i++];
		is[i_266_++] += is_265_[i++];
	    }
	    for (int i_274_ = i_267_; i_274_ < 0; i_274_++)
		is[i_266_++] += is_265_[i++];
	    i_266_ += i_269_;
	    i += i_270_;
	}
    }
    
    static final void method3433(byte[] is, byte[] is_275_, int i, int i_276_,
				 int i_277_, int i_278_, int i_279_,
				 int i_280_) {
	int i_281_ = -(i_277_ >> 2);
	i_277_ = -(i_277_ & 0x3);
	for (int i_282_ = -i_278_; i_282_ < 0; i_282_++) {
	    for (int i_283_ = i_281_; i_283_ < 0; i_283_++) {
		is[i_276_++] += is_275_[i++];
		is[i_276_++] += is_275_[i++];
		is[i_276_++] += is_275_[i++];
		is[i_276_++] += is_275_[i++];
	    }
	    for (int i_284_ = i_277_; i_284_ < 0; i_284_++)
		is[i_276_++] += is_275_[i++];
	    i_276_ += i_279_;
	    i += i_280_;
	}
    }
    
    static final void method3434(byte[] is, byte[] is_285_, int i, int i_286_,
				 int i_287_, int i_288_, int i_289_,
				 int i_290_) {
	int i_291_ = -(i_287_ >> 2);
	i_287_ = -(i_287_ & 0x3);
	for (int i_292_ = -i_288_; i_292_ < 0; i_292_++) {
	    for (int i_293_ = i_291_; i_293_ < 0; i_293_++) {
		is[i_286_++] -= is_285_[i++];
		is[i_286_++] -= is_285_[i++];
		is[i_286_++] -= is_285_[i++];
		is[i_286_++] -= is_285_[i++];
	    }
	    for (int i_294_ = i_287_; i_294_ < 0; i_294_++)
		is[i_286_++] -= is_285_[i++];
	    i_286_ += i_289_;
	    i += i_290_;
	}
    }
    
    static final void method3435(byte[] is, byte[] is_295_, int i, int i_296_,
				 int i_297_, int i_298_, int i_299_,
				 int i_300_) {
	int i_301_ = -(i_297_ >> 2);
	i_297_ = -(i_297_ & 0x3);
	for (int i_302_ = -i_298_; i_302_ < 0; i_302_++) {
	    for (int i_303_ = i_301_; i_303_ < 0; i_303_++) {
		is[i_296_++] -= is_295_[i++];
		is[i_296_++] -= is_295_[i++];
		is[i_296_++] -= is_295_[i++];
		is[i_296_++] -= is_295_[i++];
	    }
	    for (int i_304_ = i_297_; i_304_ < 0; i_304_++)
		is[i_296_++] -= is_295_[i++];
	    i_296_ += i_299_;
	    i += i_300_;
	}
    }
}
