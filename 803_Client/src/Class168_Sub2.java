/* Class168_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class168_Sub2 extends Class168
{
    Class103_Sub2 aClass103_Sub2_9904;
    int anInt9905;
    static int anInt9906;
    int anInt9907;
    static int anInt9908;
    int anInt9909;
    int anInt9910;
    int[] anIntArray9911;
    static final int anInt9912 = 4;
    static int anInt9913;
    static final int anInt9914 = 12;
    static int anInt9915;
    int anInt9916;
    static int anInt9917;
    static int anInt9918;
    static int anInt9919;
    int anInt9920;
    static int anInt9921;
    static int anInt9922;
    static int anInt9923;
    static final int anInt9924 = 8;
    static int anInt9925;
    static int anInt9926;
    static int anInt9927;
    static int anInt9928;
    static int anInt9929;
    static int anInt9930;
    static int anInt9931;
    static int anInt9932 = 0;
    static int anInt9933;
    static int anInt9934;
    static int anInt9935;
    static int anInt9936;
    static int anInt9937 = 0;
    static int anInt9938;
    static int anInt9939;
    
    public int method397() {
	return (((Class168_Sub2) this).anInt9907
		+ ((Class168_Sub2) this).anInt9920
		+ ((Class168_Sub2) this).anInt9909);
    }
    
    public void method3602(int i, int i_0_, int i_1_, int i_2_) {
	((Class168_Sub2) this).anInt9907 = i;
	((Class168_Sub2) this).anInt9905 = i_0_;
	((Class168_Sub2) this).anInt9909 = i_1_;
	((Class168_Sub2) this).anInt9910 = i_2_;
    }
    
    public void method3612(int[] is) {
	is[0] = ((Class168_Sub2) this).anInt9907;
	is[1] = ((Class168_Sub2) this).anInt9905;
	is[2] = ((Class168_Sub2) this).anInt9909;
	is[3] = ((Class168_Sub2) this).anInt9910;
    }
    
    public int method3631() {
	return ((Class168_Sub2) this).anInt9920;
    }
    
    public abstract void method3607(int i, int i_3_, Class135 class135,
				    int i_4_, int i_5_);
    
    public int method64() {
	return (((Class168_Sub2) this).anInt9907
		+ ((Class168_Sub2) this).anInt9920
		+ ((Class168_Sub2) this).anInt9909);
    }
    
    public int method3616() {
	return (((Class168_Sub2) this).anInt9905
		+ ((Class168_Sub2) this).anInt9916
		+ ((Class168_Sub2) this).anInt9910);
    }
    
    public int method3606() {
	return ((Class168_Sub2) this).anInt9916;
    }
    
    public abstract void method3679(int i, int i_6_, Class135 class135,
				    int i_7_, int i_8_);
    
    abstract void method3640(int i, int i_9_, int i_10_, int i_11_, int i_12_,
			     int i_13_, int i_14_, int i_15_);
    
    public abstract void method3637(int i, int i_16_, Class135 class135,
				    int i_17_, int i_18_);
    
    public void method3618(int i, int i_19_, int i_20_, int i_21_, int i_22_,
			   int i_23_, int i_24_) {
	if (((Class168_Sub2) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	if (((Class168_Sub2) this).anIntArray9911 == null)
	    ((Class168_Sub2) this).anIntArray9911 = new int[4];
	((Class168_Sub2) this).aClass103_Sub2_9904
	    .method2260(((Class168_Sub2) this).anIntArray9911);
	((Class168_Sub2) this).aClass103_Sub2_9904.method2258
	    ((((Class103_Sub2) ((Class168_Sub2) this).aClass103_Sub2_9904)
	      .anInt9249) * 1298750001,
	     (((Class103_Sub2) ((Class168_Sub2) this).aClass103_Sub2_9904)
	      .anInt9254) * -788450385,
	     i + i_20_, i_19_ + i_21_);
	int i_25_ = method64();
	int i_26_ = method3616();
	int i_27_ = (i_20_ + i_25_ - 1) / i_25_;
	int i_28_ = (i_21_ + i_26_ - 1) / i_26_;
	for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
	    int i_30_ = i_29_ * i_26_;
	    for (int i_31_ = 0; i_31_ < i_27_; i_31_++)
		method3666(i + i_31_ * i_25_, i_19_ + i_30_, i_22_, i_23_,
			   i_24_);
	}
	((Class168_Sub2) this).aClass103_Sub2_9904.method2445
	    (((Class168_Sub2) this).anIntArray9911[0],
	     ((Class168_Sub2) this).anIntArray9911[1],
	     ((Class168_Sub2) this).anIntArray9911[2],
	     ((Class168_Sub2) this).anIntArray9911[3]);
    }
    
    boolean method16215(float f, float f_32_, float f_33_, float f_34_,
			float f_35_, float f_36_) {
	int i = (((Class168_Sub2) this).anInt9907
		 + ((Class168_Sub2) this).anInt9920
		 + ((Class168_Sub2) this).anInt9909);
	int i_37_ = (((Class168_Sub2) this).anInt9905
		     + ((Class168_Sub2) this).anInt9916
		     + ((Class168_Sub2) this).anInt9910);
	if (i != ((Class168_Sub2) this).anInt9920
	    || i_37_ != ((Class168_Sub2) this).anInt9916) {
	    float f_38_ = (f_33_ - f) / (float) i;
	    float f_39_ = (f_34_ - f_32_) / (float) i;
	    float f_40_ = (f_35_ - f) / (float) i_37_;
	    float f_41_ = (f_36_ - f_32_) / (float) i_37_;
	    float f_42_ = f_40_ * (float) ((Class168_Sub2) this).anInt9905;
	    float f_43_ = f_41_ * (float) ((Class168_Sub2) this).anInt9905;
	    float f_44_ = f_38_ * (float) ((Class168_Sub2) this).anInt9907;
	    float f_45_ = f_39_ * (float) ((Class168_Sub2) this).anInt9907;
	    float f_46_ = -f_38_ * (float) ((Class168_Sub2) this).anInt9909;
	    float f_47_ = -f_39_ * (float) ((Class168_Sub2) this).anInt9909;
	    float f_48_ = -f_40_ * (float) ((Class168_Sub2) this).anInt9910;
	    float f_49_ = -f_41_ * (float) ((Class168_Sub2) this).anInt9910;
	    f += f_44_ + f_42_;
	    f_32_ += f_45_ + f_43_;
	    f_33_ += f_46_ + f_42_;
	    f_34_ += f_47_ + f_43_;
	    f_35_ += f_44_ + f_48_;
	    f_36_ += f_45_ + f_49_;
	}
	float f_50_ = f_35_ + (f_33_ - f);
	float f_51_ = f_34_ + (f_36_ - f_32_);
	float f_52_;
	float f_53_;
	if (f < f_33_) {
	    f_52_ = f;
	    f_53_ = f_33_;
	} else {
	    f_52_ = f_33_;
	    f_53_ = f;
	}
	if (f_35_ < f_52_)
	    f_52_ = f_35_;
	if (f_50_ < f_52_)
	    f_52_ = f_50_;
	if (f_35_ > f_53_)
	    f_53_ = f_35_;
	if (f_50_ > f_53_)
	    f_53_ = f_50_;
	float f_54_;
	float f_55_;
	if (f_32_ < f_34_) {
	    f_54_ = f_32_;
	    f_55_ = f_34_;
	} else {
	    f_54_ = f_34_;
	    f_55_ = f_32_;
	}
	if (f_36_ < f_54_)
	    f_54_ = f_36_;
	if (f_51_ < f_54_)
	    f_54_ = f_51_;
	if (f_36_ > f_55_)
	    f_55_ = f_36_;
	if (f_51_ > f_55_)
	    f_55_ = f_51_;
	if (f_52_ < (float) (((Class103_Sub2) (((Class168_Sub2) this)
					       .aClass103_Sub2_9904)).anInt9249
			     * 1298750001))
	    f_52_ = (float) (((Class103_Sub2) (((Class168_Sub2) this)
					       .aClass103_Sub2_9904)).anInt9249
			     * 1298750001);
	if (f_53_ > (float) (((Class103_Sub2) (((Class168_Sub2) this)
					       .aClass103_Sub2_9904)).anInt9250
			     * 325436811))
	    f_53_ = (float) (((Class103_Sub2) (((Class168_Sub2) this)
					       .aClass103_Sub2_9904)).anInt9250
			     * 325436811);
	if (f_54_ < (float) (((Class103_Sub2) (((Class168_Sub2) this)
					       .aClass103_Sub2_9904)).anInt9254
			     * -788450385))
	    f_54_ = (float) (((Class103_Sub2) (((Class168_Sub2) this)
					       .aClass103_Sub2_9904)).anInt9254
			     * -788450385);
	if (f_55_ > (float) (((Class103_Sub2) (((Class168_Sub2) this)
					       .aClass103_Sub2_9904)).anInt9252
			     * 1546170165))
	    f_55_ = (float) (((Class103_Sub2) (((Class168_Sub2) this)
					       .aClass103_Sub2_9904)).anInt9252
			     * 1546170165);
	f_53_ = f_52_ - f_53_;
	if (f_53_ >= 0.0F)
	    return false;
	f_55_ = f_54_ - f_55_;
	if (f_55_ >= 0.0F)
	    return false;
	anInt9935
	    = (((Class103_Sub2) ((Class168_Sub2) this).aClass103_Sub2_9904)
	       .anInt9260) * -1826993761;
	anInt9925 = (int) ((float) ((int) f_54_ * anInt9935) + f_52_);
	float f_56_
	    = (f_33_ - f) * (f_36_ - f_32_) - (f_34_ - f_32_) * (f_35_ - f);
	float f_57_
	    = (f_35_ - f) * (f_34_ - f_32_) - (f_36_ - f_32_) * (f_33_ - f);
	anInt9921 = (int) ((f_36_ - f_32_) * 4096.0F
			   * (float) ((Class168_Sub2) this).anInt9920 / f_56_);
	anInt9922 = (int) ((f_34_ - f_32_) * 4096.0F
			   * (float) ((Class168_Sub2) this).anInt9916 / f_57_);
	anInt9923 = (int) ((f_35_ - f) * 4096.0F
			   * (float) ((Class168_Sub2) this).anInt9920 / f_57_);
	anInt9908 = (int) ((f_33_ - f) * 4096.0F
			   * (float) ((Class168_Sub2) this).anInt9916 / f_56_);
	anInt9933 = (int) (f_52_ * 16.0F + 8.0F
			   - (f + f_33_ + f_35_ + f_50_) / 4.0F * 16.0F);
	anInt9918 = (int) (f_54_ * 16.0F + 8.0F
			   - (f_32_ + f_34_ + f_36_ + f_51_) / 4.0F * 16.0F);
	anInt9927 = ((((Class168_Sub2) this).anInt9920 >> 1 << 12)
		     + (anInt9918 * anInt9923 >> 4));
	anInt9928 = ((((Class168_Sub2) this).anInt9916 >> 1 << 12)
		     + (anInt9918 * anInt9908 >> 4));
	anInt9929 = anInt9933 * anInt9921 >> 4;
	anInt9930 = anInt9933 * anInt9922 >> 4;
	anInt9915 = (int) f_52_;
	anInt9906 = (int) f_53_;
	anInt9917 = (int) f_54_;
	anInt9919 = (int) f_55_;
	return true;
    }
    
    void method3627(float f, float f_58_, float f_59_, float f_60_,
		    float f_61_, float f_62_, int i, int i_63_, int i_64_,
		    int i_65_) {
	if (((Class168_Sub2) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	if (method16215(f, f_58_, f_59_, f_60_, f_61_, f_62_)) {
	    anInt9931 = i_63_;
	    if (i != 1) {
		anInt9932 = i_63_ >>> 24;
		anInt9937 = 256 - anInt9932;
		if (i == 0) {
		    anInt9934 = (i_63_ & 0xff0000) >> 16;
		    anInt9913 = (i_63_ & 0xff00) >> 8;
		    anInt9936 = i_63_ & 0xff;
		} else if (i == 2) {
		    anInt9926 = i_63_ >>> 24;
		    anInt9938 = 256 - anInt9926;
		    int i_66_ = (i_63_ & 0xff00ff) * anInt9938 & ~0xff00ff;
		    int i_67_ = (i_63_ & 0xff00) * anInt9938 & 0xff0000;
		    anInt9939 = (i_66_ | i_67_) >>> 8;
		}
	    }
	    method16216(i, i_64_);
	}
    }
    
    abstract void method16216(int i, int i_68_);
    
    void method3647(float f, float f_69_, float f_70_, float f_71_,
		    float f_72_, float f_73_, int i, Class135 class135,
		    int i_74_, int i_75_) {
	if (((Class168_Sub2) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	if (method16215(f, f_69_, f_70_, f_71_, f_72_, f_73_)) {
	    Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	    method16217(((Class135_Sub1) class135_sub1).anIntArray9874,
			((Class135_Sub1) class135_sub1).anIntArray9873,
			anInt9915 - i_74_, -i_75_ - (anInt9919 - anInt9917));
	}
    }
    
    abstract void method16217(int[] is, int[] is_76_, int i, int i_77_);
    
    static {
	anInt9934 = 0;
	anInt9913 = 0;
	anInt9936 = 0;
	anInt9926 = 0;
	anInt9938 = 0;
	anInt9939 = 0;
    }
    
    public abstract void method3635(int i, int i_78_, int i_79_, int i_80_,
				    int i_81_);
    
    boolean method16218(float f, float f_82_, float f_83_, float f_84_,
			float f_85_, float f_86_) {
	int i = (((Class168_Sub2) this).anInt9907
		 + ((Class168_Sub2) this).anInt9920
		 + ((Class168_Sub2) this).anInt9909);
	int i_87_ = (((Class168_Sub2) this).anInt9905
		     + ((Class168_Sub2) this).anInt9916
		     + ((Class168_Sub2) this).anInt9910);
	if (i != ((Class168_Sub2) this).anInt9920
	    || i_87_ != ((Class168_Sub2) this).anInt9916) {
	    float f_88_ = (f_83_ - f) / (float) i;
	    float f_89_ = (f_84_ - f_82_) / (float) i;
	    float f_90_ = (f_85_ - f) / (float) i_87_;
	    float f_91_ = (f_86_ - f_82_) / (float) i_87_;
	    float f_92_ = f_90_ * (float) ((Class168_Sub2) this).anInt9905;
	    float f_93_ = f_91_ * (float) ((Class168_Sub2) this).anInt9905;
	    float f_94_ = f_88_ * (float) ((Class168_Sub2) this).anInt9907;
	    float f_95_ = f_89_ * (float) ((Class168_Sub2) this).anInt9907;
	    float f_96_ = -f_88_ * (float) ((Class168_Sub2) this).anInt9909;
	    float f_97_ = -f_89_ * (float) ((Class168_Sub2) this).anInt9909;
	    float f_98_ = -f_90_ * (float) ((Class168_Sub2) this).anInt9910;
	    float f_99_ = -f_91_ * (float) ((Class168_Sub2) this).anInt9910;
	    f += f_94_ + f_92_;
	    f_82_ += f_95_ + f_93_;
	    f_83_ += f_96_ + f_92_;
	    f_84_ += f_97_ + f_93_;
	    f_85_ += f_94_ + f_98_;
	    f_86_ += f_95_ + f_99_;
	}
	float f_100_ = f_85_ + (f_83_ - f);
	float f_101_ = f_84_ + (f_86_ - f_82_);
	float f_102_;
	float f_103_;
	if (f < f_83_) {
	    f_102_ = f;
	    f_103_ = f_83_;
	} else {
	    f_102_ = f_83_;
	    f_103_ = f;
	}
	if (f_85_ < f_102_)
	    f_102_ = f_85_;
	if (f_100_ < f_102_)
	    f_102_ = f_100_;
	if (f_85_ > f_103_)
	    f_103_ = f_85_;
	if (f_100_ > f_103_)
	    f_103_ = f_100_;
	float f_104_;
	float f_105_;
	if (f_82_ < f_84_) {
	    f_104_ = f_82_;
	    f_105_ = f_84_;
	} else {
	    f_104_ = f_84_;
	    f_105_ = f_82_;
	}
	if (f_86_ < f_104_)
	    f_104_ = f_86_;
	if (f_101_ < f_104_)
	    f_104_ = f_101_;
	if (f_86_ > f_105_)
	    f_105_ = f_86_;
	if (f_101_ > f_105_)
	    f_105_ = f_101_;
	if (f_102_
	    < (float) (((Class103_Sub2)
			((Class168_Sub2) this).aClass103_Sub2_9904).anInt9249
		       * 1298750001))
	    f_102_
		= (float) (((Class103_Sub2) (((Class168_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9249
			   * 1298750001);
	if (f_103_
	    > (float) (((Class103_Sub2)
			((Class168_Sub2) this).aClass103_Sub2_9904).anInt9250
		       * 325436811))
	    f_103_
		= (float) (((Class103_Sub2) (((Class168_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9250
			   * 325436811);
	if (f_104_
	    < (float) (((Class103_Sub2)
			((Class168_Sub2) this).aClass103_Sub2_9904).anInt9254
		       * -788450385))
	    f_104_
		= (float) (((Class103_Sub2) (((Class168_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385);
	if (f_105_
	    > (float) (((Class103_Sub2)
			((Class168_Sub2) this).aClass103_Sub2_9904).anInt9252
		       * 1546170165))
	    f_105_
		= (float) (((Class103_Sub2) (((Class168_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9252
			   * 1546170165);
	f_103_ = f_102_ - f_103_;
	if (f_103_ >= 0.0F)
	    return false;
	f_105_ = f_104_ - f_105_;
	if (f_105_ >= 0.0F)
	    return false;
	anInt9935
	    = (((Class103_Sub2) ((Class168_Sub2) this).aClass103_Sub2_9904)
	       .anInt9260) * -1826993761;
	anInt9925 = (int) ((float) ((int) f_104_ * anInt9935) + f_102_);
	float f_106_
	    = (f_83_ - f) * (f_86_ - f_82_) - (f_84_ - f_82_) * (f_85_ - f);
	float f_107_
	    = (f_85_ - f) * (f_84_ - f_82_) - (f_86_ - f_82_) * (f_83_ - f);
	anInt9921
	    = (int) ((f_86_ - f_82_) * 4096.0F
		     * (float) ((Class168_Sub2) this).anInt9920 / f_106_);
	anInt9922
	    = (int) ((f_84_ - f_82_) * 4096.0F
		     * (float) ((Class168_Sub2) this).anInt9916 / f_107_);
	anInt9923
	    = (int) ((f_85_ - f) * 4096.0F
		     * (float) ((Class168_Sub2) this).anInt9920 / f_107_);
	anInt9908
	    = (int) ((f_83_ - f) * 4096.0F
		     * (float) ((Class168_Sub2) this).anInt9916 / f_106_);
	anInt9933 = (int) (f_102_ * 16.0F + 8.0F
			   - (f + f_83_ + f_85_ + f_100_) / 4.0F * 16.0F);
	anInt9918 = (int) (f_104_ * 16.0F + 8.0F
			   - (f_82_ + f_84_ + f_86_ + f_101_) / 4.0F * 16.0F);
	anInt9927 = ((((Class168_Sub2) this).anInt9920 >> 1 << 12)
		     + (anInt9918 * anInt9923 >> 4));
	anInt9928 = ((((Class168_Sub2) this).anInt9916 >> 1 << 12)
		     + (anInt9918 * anInt9908 >> 4));
	anInt9929 = anInt9933 * anInt9921 >> 4;
	anInt9930 = anInt9933 * anInt9922 >> 4;
	anInt9915 = (int) f_102_;
	anInt9906 = (int) f_103_;
	anInt9917 = (int) f_104_;
	anInt9919 = (int) f_105_;
	return true;
    }
    
    abstract void method16219(int i, int i_108_);
    
    public abstract void method3638(int i, int i_109_, Class135 class135,
				    int i_110_, int i_111_);
    
    abstract void method16220(boolean bool, boolean bool_112_,
			      boolean bool_113_, int i, int i_114_, float f,
			      int i_115_, int i_116_, int i_117_, int i_118_,
			      int i_119_, int i_120_, boolean bool_121_);
    
    abstract void method16221(boolean bool, boolean bool_122_,
			      boolean bool_123_, int i, int i_124_, float f,
			      int i_125_, int i_126_, int i_127_, int i_128_,
			      int i_129_, int i_130_, boolean bool_131_);
    
    abstract void method3641(int i, int i_132_, int i_133_, int i_134_,
			     int i_135_, int i_136_, int i_137_, int i_138_);
    
    abstract void method16222(int i, int i_139_);
    
    public int method445() {
	return (((Class168_Sub2) this).anInt9907
		+ ((Class168_Sub2) this).anInt9920
		+ ((Class168_Sub2) this).anInt9909);
    }
    
    abstract void method16223(int i, int i_140_);
    
    public int method3655() {
	return ((Class168_Sub2) this).anInt9916;
    }
    
    public abstract void method3666(int i, int i_141_, int i_142_, int i_143_,
				    int i_144_);
    
    public abstract void method3658(int i, int i_145_, int i_146_, int i_147_,
				    int i_148_);
    
    abstract void method16224(boolean bool, boolean bool_149_,
			      boolean bool_150_, int i, int i_151_, float f,
			      int i_152_, int i_153_, int i_154_, int i_155_,
			      int i_156_, int i_157_, boolean bool_158_);
    
    abstract void method16225(boolean bool, boolean bool_159_,
			      boolean bool_160_, int i, int i_161_, float f,
			      int i_162_, int i_163_, int i_164_, int i_165_,
			      int i_166_, int i_167_, boolean bool_168_);
    
    abstract void method16226(boolean bool, boolean bool_169_,
			      boolean bool_170_, int i, int i_171_, float f,
			      int i_172_, int i_173_, int i_174_, int i_175_,
			      int i_176_, int i_177_, boolean bool_178_);
    
    abstract void method16227(boolean bool, boolean bool_179_,
			      boolean bool_180_, int i, int i_181_, float f,
			      int i_182_, int i_183_, int i_184_, int i_185_,
			      int i_186_, int i_187_, boolean bool_188_);
    
    public void method3656(int i, int i_189_, int i_190_, int i_191_) {
	((Class168_Sub2) this).anInt9907 = i;
	((Class168_Sub2) this).anInt9905 = i_189_;
	((Class168_Sub2) this).anInt9909 = i_190_;
	((Class168_Sub2) this).anInt9910 = i_191_;
    }
    
    public void method3643(int[] is) {
	is[0] = ((Class168_Sub2) this).anInt9907;
	is[1] = ((Class168_Sub2) this).anInt9905;
	is[2] = ((Class168_Sub2) this).anInt9909;
	is[3] = ((Class168_Sub2) this).anInt9910;
    }
    
    abstract void method3670(int i, int i_192_, int i_193_, int i_194_,
			     int i_195_, int i_196_, int i_197_, int i_198_);
    
    Class168_Sub2(Class103_Sub2 class103_sub2, int i, int i_199_) {
	((Class168_Sub2) this).aClass103_Sub2_9904 = class103_sub2;
	((Class168_Sub2) this).anInt9920 = i;
	((Class168_Sub2) this).anInt9916 = i_199_;
    }
    
    abstract void method16228(int[] is, int[] is_200_, int i, int i_201_);
    
    public int method3652() {
	return ((Class168_Sub2) this).anInt9920;
    }
    
    public void method3613(int i, int i_202_, int i_203_, int i_204_,
			   int i_205_, int i_206_, int i_207_) {
	if (((Class168_Sub2) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	if (((Class168_Sub2) this).anIntArray9911 == null)
	    ((Class168_Sub2) this).anIntArray9911 = new int[4];
	((Class168_Sub2) this).aClass103_Sub2_9904
	    .method2260(((Class168_Sub2) this).anIntArray9911);
	((Class168_Sub2) this).aClass103_Sub2_9904.method2258
	    ((((Class103_Sub2) ((Class168_Sub2) this).aClass103_Sub2_9904)
	      .anInt9249) * 1298750001,
	     (((Class103_Sub2) ((Class168_Sub2) this).aClass103_Sub2_9904)
	      .anInt9254) * -788450385,
	     i + i_203_, i_202_ + i_204_);
	int i_208_ = method64();
	int i_209_ = method3616();
	int i_210_ = (i_203_ + i_208_ - 1) / i_208_;
	int i_211_ = (i_204_ + i_209_ - 1) / i_209_;
	for (int i_212_ = 0; i_212_ < i_211_; i_212_++) {
	    int i_213_ = i_212_ * i_209_;
	    for (int i_214_ = 0; i_214_ < i_210_; i_214_++)
		method3666(i + i_214_ * i_208_, i_202_ + i_213_, i_205_,
			   i_206_, i_207_);
	}
	((Class168_Sub2) this).aClass103_Sub2_9904.method2445
	    (((Class168_Sub2) this).anIntArray9911[0],
	     ((Class168_Sub2) this).anIntArray9911[1],
	     ((Class168_Sub2) this).anIntArray9911[2],
	     ((Class168_Sub2) this).anIntArray9911[3]);
    }
    
    boolean method16229(float f, float f_215_, float f_216_, float f_217_,
			float f_218_, float f_219_) {
	int i = (((Class168_Sub2) this).anInt9907
		 + ((Class168_Sub2) this).anInt9920
		 + ((Class168_Sub2) this).anInt9909);
	int i_220_ = (((Class168_Sub2) this).anInt9905
		      + ((Class168_Sub2) this).anInt9916
		      + ((Class168_Sub2) this).anInt9910);
	if (i != ((Class168_Sub2) this).anInt9920
	    || i_220_ != ((Class168_Sub2) this).anInt9916) {
	    float f_221_ = (f_216_ - f) / (float) i;
	    float f_222_ = (f_217_ - f_215_) / (float) i;
	    float f_223_ = (f_218_ - f) / (float) i_220_;
	    float f_224_ = (f_219_ - f_215_) / (float) i_220_;
	    float f_225_ = f_223_ * (float) ((Class168_Sub2) this).anInt9905;
	    float f_226_ = f_224_ * (float) ((Class168_Sub2) this).anInt9905;
	    float f_227_ = f_221_ * (float) ((Class168_Sub2) this).anInt9907;
	    float f_228_ = f_222_ * (float) ((Class168_Sub2) this).anInt9907;
	    float f_229_ = -f_221_ * (float) ((Class168_Sub2) this).anInt9909;
	    float f_230_ = -f_222_ * (float) ((Class168_Sub2) this).anInt9909;
	    float f_231_ = -f_223_ * (float) ((Class168_Sub2) this).anInt9910;
	    float f_232_ = -f_224_ * (float) ((Class168_Sub2) this).anInt9910;
	    f += f_227_ + f_225_;
	    f_215_ += f_228_ + f_226_;
	    f_216_ += f_229_ + f_225_;
	    f_217_ += f_230_ + f_226_;
	    f_218_ += f_227_ + f_231_;
	    f_219_ += f_228_ + f_232_;
	}
	float f_233_ = f_218_ + (f_216_ - f);
	float f_234_ = f_217_ + (f_219_ - f_215_);
	float f_235_;
	float f_236_;
	if (f < f_216_) {
	    f_235_ = f;
	    f_236_ = f_216_;
	} else {
	    f_235_ = f_216_;
	    f_236_ = f;
	}
	if (f_218_ < f_235_)
	    f_235_ = f_218_;
	if (f_233_ < f_235_)
	    f_235_ = f_233_;
	if (f_218_ > f_236_)
	    f_236_ = f_218_;
	if (f_233_ > f_236_)
	    f_236_ = f_233_;
	float f_237_;
	float f_238_;
	if (f_215_ < f_217_) {
	    f_237_ = f_215_;
	    f_238_ = f_217_;
	} else {
	    f_237_ = f_217_;
	    f_238_ = f_215_;
	}
	if (f_219_ < f_237_)
	    f_237_ = f_219_;
	if (f_234_ < f_237_)
	    f_237_ = f_234_;
	if (f_219_ > f_238_)
	    f_238_ = f_219_;
	if (f_234_ > f_238_)
	    f_238_ = f_234_;
	if (f_235_
	    < (float) (((Class103_Sub2)
			((Class168_Sub2) this).aClass103_Sub2_9904).anInt9249
		       * 1298750001))
	    f_235_
		= (float) (((Class103_Sub2) (((Class168_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9249
			   * 1298750001);
	if (f_236_
	    > (float) (((Class103_Sub2)
			((Class168_Sub2) this).aClass103_Sub2_9904).anInt9250
		       * 325436811))
	    f_236_
		= (float) (((Class103_Sub2) (((Class168_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9250
			   * 325436811);
	if (f_237_
	    < (float) (((Class103_Sub2)
			((Class168_Sub2) this).aClass103_Sub2_9904).anInt9254
		       * -788450385))
	    f_237_
		= (float) (((Class103_Sub2) (((Class168_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385);
	if (f_238_
	    > (float) (((Class103_Sub2)
			((Class168_Sub2) this).aClass103_Sub2_9904).anInt9252
		       * 1546170165))
	    f_238_
		= (float) (((Class103_Sub2) (((Class168_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9252
			   * 1546170165);
	f_236_ = f_235_ - f_236_;
	if (f_236_ >= 0.0F)
	    return false;
	f_238_ = f_237_ - f_238_;
	if (f_238_ >= 0.0F)
	    return false;
	anInt9935
	    = (((Class103_Sub2) ((Class168_Sub2) this).aClass103_Sub2_9904)
	       .anInt9260) * -1826993761;
	anInt9925 = (int) ((float) ((int) f_237_ * anInt9935) + f_235_);
	float f_239_ = ((f_216_ - f) * (f_219_ - f_215_)
			- (f_217_ - f_215_) * (f_218_ - f));
	float f_240_ = ((f_218_ - f) * (f_217_ - f_215_)
			- (f_219_ - f_215_) * (f_216_ - f));
	anInt9921
	    = (int) ((f_219_ - f_215_) * 4096.0F
		     * (float) ((Class168_Sub2) this).anInt9920 / f_239_);
	anInt9922
	    = (int) ((f_217_ - f_215_) * 4096.0F
		     * (float) ((Class168_Sub2) this).anInt9916 / f_240_);
	anInt9923
	    = (int) ((f_218_ - f) * 4096.0F
		     * (float) ((Class168_Sub2) this).anInt9920 / f_240_);
	anInt9908
	    = (int) ((f_216_ - f) * 4096.0F
		     * (float) ((Class168_Sub2) this).anInt9916 / f_239_);
	anInt9933 = (int) (f_235_ * 16.0F + 8.0F
			   - (f + f_216_ + f_218_ + f_233_) / 4.0F * 16.0F);
	anInt9918
	    = (int) (f_237_ * 16.0F + 8.0F
		     - (f_215_ + f_217_ + f_219_ + f_234_) / 4.0F * 16.0F);
	anInt9927 = ((((Class168_Sub2) this).anInt9920 >> 1 << 12)
		     + (anInt9918 * anInt9923 >> 4));
	anInt9928 = ((((Class168_Sub2) this).anInt9916 >> 1 << 12)
		     + (anInt9918 * anInt9908 >> 4));
	anInt9929 = anInt9933 * anInt9921 >> 4;
	anInt9930 = anInt9933 * anInt9922 >> 4;
	anInt9915 = (int) f_235_;
	anInt9906 = (int) f_236_;
	anInt9917 = (int) f_237_;
	anInt9919 = (int) f_238_;
	return true;
    }
    
    abstract void method16230(int[] is, int[] is_241_, int i, int i_242_);
    
    void method3611(float f, float f_243_, float f_244_, float f_245_,
		    float f_246_, float f_247_, int i, int i_248_, int i_249_,
		    int i_250_) {
	if (((Class168_Sub2) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	if (method16215(f, f_243_, f_244_, f_245_, f_246_, f_247_)) {
	    anInt9931 = i_248_;
	    if (i != 1) {
		anInt9932 = i_248_ >>> 24;
		anInt9937 = 256 - anInt9932;
		if (i == 0) {
		    anInt9934 = (i_248_ & 0xff0000) >> 16;
		    anInt9913 = (i_248_ & 0xff00) >> 8;
		    anInt9936 = i_248_ & 0xff;
		} else if (i == 2) {
		    anInt9926 = i_248_ >>> 24;
		    anInt9938 = 256 - anInt9926;
		    int i_251_ = (i_248_ & 0xff00ff) * anInt9938 & ~0xff00ff;
		    int i_252_ = (i_248_ & 0xff00) * anInt9938 & 0xff0000;
		    anInt9939 = (i_251_ | i_252_) >>> 8;
		}
	    }
	    method16216(i, i_249_);
	}
    }
    
    void method3648(float f, float f_253_, float f_254_, float f_255_,
		    float f_256_, float f_257_, int i, int i_258_, int i_259_,
		    int i_260_) {
	if (((Class168_Sub2) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	if (method16215(f, f_253_, f_254_, f_255_, f_256_, f_257_)) {
	    anInt9931 = i_258_;
	    if (i != 1) {
		anInt9932 = i_258_ >>> 24;
		anInt9937 = 256 - anInt9932;
		if (i == 0) {
		    anInt9934 = (i_258_ & 0xff0000) >> 16;
		    anInt9913 = (i_258_ & 0xff00) >> 8;
		    anInt9936 = i_258_ & 0xff;
		} else if (i == 2) {
		    anInt9926 = i_258_ >>> 24;
		    anInt9938 = 256 - anInt9926;
		    int i_261_ = (i_258_ & 0xff00ff) * anInt9938 & ~0xff00ff;
		    int i_262_ = (i_258_ & 0xff00) * anInt9938 & 0xff0000;
		    anInt9939 = (i_261_ | i_262_) >>> 8;
		}
	    }
	    method16216(i, i_259_);
	}
    }
    
    void method3649(float f, float f_263_, float f_264_, float f_265_,
		    float f_266_, float f_267_, int i, Class135 class135,
		    int i_268_, int i_269_) {
	if (((Class168_Sub2) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	if (method16215(f, f_263_, f_264_, f_265_, f_266_, f_267_)) {
	    Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	    method16217(((Class135_Sub1) class135_sub1).anIntArray9874,
			((Class135_Sub1) class135_sub1).anIntArray9873,
			anInt9915 - i_268_, -i_269_ - (anInt9919 - anInt9917));
	}
    }
    
    void method3650(float f, float f_270_, float f_271_, float f_272_,
		    float f_273_, float f_274_, int i, Class135 class135,
		    int i_275_, int i_276_) {
	if (((Class168_Sub2) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	if (method16215(f, f_270_, f_271_, f_272_, f_273_, f_274_)) {
	    Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	    method16217(((Class135_Sub1) class135_sub1).anIntArray9874,
			((Class135_Sub1) class135_sub1).anIntArray9873,
			anInt9915 - i_275_, -i_276_ - (anInt9919 - anInt9917));
	}
    }
    
    void method3651(float f, float f_277_, float f_278_, float f_279_,
		    float f_280_, float f_281_, int i, Class135 class135,
		    int i_282_, int i_283_) {
	if (((Class168_Sub2) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	if (method16215(f, f_277_, f_278_, f_279_, f_280_, f_281_)) {
	    Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	    method16217(((Class135_Sub1) class135_sub1).anIntArray9874,
			((Class135_Sub1) class135_sub1).anIntArray9873,
			anInt9915 - i_282_, -i_283_ - (anInt9919 - anInt9917));
	}
    }
    
    public int method3645() {
	return (((Class168_Sub2) this).anInt9905
		+ ((Class168_Sub2) this).anInt9916
		+ ((Class168_Sub2) this).anInt9910);
    }
    
    public int method3601() {
	return ((Class168_Sub2) this).anInt9920;
    }
    
    public int method3642() {
	return ((Class168_Sub2) this).anInt9916;
    }
    
    public int method444() {
	return (((Class168_Sub2) this).anInt9907
		+ ((Class168_Sub2) this).anInt9920
		+ ((Class168_Sub2) this).anInt9909);
    }
    
    public int method3604() {
	return ((Class168_Sub2) this).anInt9916;
    }
    
    public int method3657() {
	return ((Class168_Sub2) this).anInt9916;
    }
}
