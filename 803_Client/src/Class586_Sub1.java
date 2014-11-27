/* Class586_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class586_Sub1 extends Class586
{
    int[] anIntArray8733 = new int[512];
    static float[][] aFloatArrayArray8734
	= { { -0.333333F, -0.333333F, -0.333333F },
	    { 0.333333F, -0.333333F, -0.333333F },
	    { -0.333333F, 0.333333F, -0.333333F },
	    { 0.333333F, 0.333333F, -0.333333F },
	    { -0.333333F, -0.333333F, 0.333333F },
	    { 0.333333F, -0.333333F, 0.333333F },
	    { -0.333333F, 0.333333F, 0.333333F },
	    { 0.333333F, 0.333333F, 0.333333F } };
    
    static final float method14421(float f, float f_0_, float f_1_) {
	return f + (f_0_ - f) * f_1_;
    }
    
    static final float method14422(float f, float f_2_, float f_3_) {
	return f + (f_2_ - f) * f_3_;
    }
    
    static final float method14423(int i, float f, float f_4_, float f_5_) {
	float[] fs = aFloatArrayArray8734[i];
	return fs[0] * f + fs[1] * f_4_ + fs[2] * f_5_;
    }
    
    static final float method14424(float f, float f_6_, float f_7_) {
	return f + (f_6_ - f) * f_7_;
    }
    
    void method12853(int i, int i_8_, int i_9_, int i_10_, float f,
		     float f_11_, float f_12_, float f_13_, float[] fs,
		     int i_14_) {
	int i_15_ = (int) ((float) i_8_ * f - 1.0F);
	i_15_ &= 0xff;
	int i_16_ = (int) ((float) i_9_ * f_11_ - 1.0F);
	i_16_ &= 0xff;
	int i_17_ = (int) ((float) i_10_ * f_12_ - 1.0F);
	i_17_ &= 0xff;
	float f_18_ = (float) i * f_12_;
	int i_19_ = (int) f_18_;
	int i_20_ = i_19_ + 1;
	float f_21_ = f_18_ - (float) i_19_;
	float f_22_ = 1.0F - f_21_;
	float f_23_ = method14428(f_21_);
	i_19_ &= i_17_;
	i_20_ &= i_17_;
	int i_24_ = ((Class586_Sub1) this).anIntArray8733[i_19_];
	int i_25_ = ((Class586_Sub1) this).anIntArray8733[i_20_];
	for (int i_26_ = 0; i_26_ < i_9_; i_26_++) {
	    float f_27_ = (float) i_26_ * f_11_;
	    int i_28_ = (int) f_27_;
	    int i_29_ = i_28_ + 1;
	    float f_30_ = f_27_ - (float) i_28_;
	    float f_31_ = 1.0F - f_30_;
	    float f_32_ = method14428(f_30_);
	    i_28_ &= i_16_;
	    i_29_ &= i_16_;
	    int i_33_ = ((Class586_Sub1) this).anIntArray8733[i_28_ + i_24_];
	    int i_34_ = ((Class586_Sub1) this).anIntArray8733[i_29_ + i_24_];
	    int i_35_ = ((Class586_Sub1) this).anIntArray8733[i_28_ + i_25_];
	    int i_36_ = ((Class586_Sub1) this).anIntArray8733[i_29_ + i_25_];
	    for (int i_37_ = 0; i_37_ < i_8_; i_37_++) {
		float f_38_ = (float) i_37_ * f;
		int i_39_ = (int) f_38_;
		int i_40_ = i_39_ + 1;
		float f_41_ = f_38_ - (float) i_39_;
		float f_42_ = 1.0F - f_41_;
		float f_43_ = method14428(f_41_);
		i_39_ &= i_15_;
		i_40_ &= i_15_;
		fs[i_14_++]
		    = (f_13_
		       * (method14422
			  ((method14422
			    (method14422(method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_39_ + i_33_]) & 0x7,
						     f_42_, f_31_, f_22_),
					 method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_40_ + i_33_]) & 0x7,
						     f_41_, f_31_, f_22_),
					 f_43_),
			     method14422(method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_39_ + i_34_]) & 0x7,
						     f_42_, f_30_, f_22_),
					 method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_40_ + i_34_]) & 0x7,
						     f_41_, f_30_, f_22_),
					 f_43_),
			     f_32_)),
			   (method14422
			    (method14422(method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_39_ + i_35_]) & 0x7,
						     f_42_, f_31_, f_21_),
					 method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_40_ + i_35_]) & 0x7,
						     f_41_, f_31_, f_21_),
					 f_43_),
			     method14422(method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_39_ + i_36_]) & 0x7,
						     f_42_, f_30_, f_21_),
					 method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_40_ + i_36_]) & 0x7,
						     f_41_, f_30_, f_21_),
					 f_43_),
			     f_32_)),
			   f_23_)));
	    }
	}
    }
    
    void method12854(int i, int i_44_, int i_45_, int i_46_, float f,
		     float f_47_, float f_48_, float f_49_, float[] fs,
		     int i_50_) {
	int i_51_ = (int) ((float) i_44_ * f - 1.0F);
	i_51_ &= 0xff;
	int i_52_ = (int) ((float) i_45_ * f_47_ - 1.0F);
	i_52_ &= 0xff;
	int i_53_ = (int) ((float) i_46_ * f_48_ - 1.0F);
	i_53_ &= 0xff;
	float f_54_ = (float) i * f_48_;
	int i_55_ = (int) f_54_;
	int i_56_ = i_55_ + 1;
	float f_57_ = f_54_ - (float) i_55_;
	float f_58_ = 1.0F - f_57_;
	float f_59_ = method14428(f_57_);
	i_55_ &= i_53_;
	i_56_ &= i_53_;
	int i_60_ = ((Class586_Sub1) this).anIntArray8733[i_55_];
	int i_61_ = ((Class586_Sub1) this).anIntArray8733[i_56_];
	for (int i_62_ = 0; i_62_ < i_45_; i_62_++) {
	    float f_63_ = (float) i_62_ * f_47_;
	    int i_64_ = (int) f_63_;
	    int i_65_ = i_64_ + 1;
	    float f_66_ = f_63_ - (float) i_64_;
	    float f_67_ = 1.0F - f_66_;
	    float f_68_ = method14428(f_66_);
	    i_64_ &= i_52_;
	    i_65_ &= i_52_;
	    int i_69_ = ((Class586_Sub1) this).anIntArray8733[i_64_ + i_60_];
	    int i_70_ = ((Class586_Sub1) this).anIntArray8733[i_65_ + i_60_];
	    int i_71_ = ((Class586_Sub1) this).anIntArray8733[i_64_ + i_61_];
	    int i_72_ = ((Class586_Sub1) this).anIntArray8733[i_65_ + i_61_];
	    for (int i_73_ = 0; i_73_ < i_44_; i_73_++) {
		float f_74_ = (float) i_73_ * f;
		int i_75_ = (int) f_74_;
		int i_76_ = i_75_ + 1;
		float f_77_ = f_74_ - (float) i_75_;
		float f_78_ = 1.0F - f_77_;
		float f_79_ = method14428(f_77_);
		i_75_ &= i_51_;
		i_76_ &= i_51_;
		fs[i_50_++]
		    = (f_49_
		       * (method14422
			  ((method14422
			    (method14422(method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_75_ + i_69_]) & 0x7,
						     f_78_, f_67_, f_58_),
					 method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_76_ + i_69_]) & 0x7,
						     f_77_, f_67_, f_58_),
					 f_79_),
			     method14422(method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_75_ + i_70_]) & 0x7,
						     f_78_, f_66_, f_58_),
					 method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_76_ + i_70_]) & 0x7,
						     f_77_, f_66_, f_58_),
					 f_79_),
			     f_68_)),
			   (method14422
			    (method14422(method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_75_ + i_71_]) & 0x7,
						     f_78_, f_67_, f_57_),
					 method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_76_ + i_71_]) & 0x7,
						     f_77_, f_67_, f_57_),
					 f_79_),
			     method14422(method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_75_ + i_72_]) & 0x7,
						     f_78_, f_66_, f_57_),
					 method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_76_ + i_72_]) & 0x7,
						     f_77_, f_66_, f_57_),
					 f_79_),
			     f_68_)),
			   f_59_)));
	    }
	}
    }
    
    static final float method14425(float f) {
	return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
    }
    
    static final float method14426(float f) {
	return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
    }
    
    static final float method14427(float f) {
	return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
    }
    
    public Class586_Sub1(int i) {
	Random random = new Random((long) i);
	for (int i_80_ = 0; i_80_ < 256; i_80_++)
	    ((Class586_Sub1) this).anIntArray8733[i_80_]
		= ((Class586_Sub1) this).anIntArray8733[i_80_ + 256] = i_80_;
	for (int i_81_ = 0; i_81_ < 256; i_81_++) {
	    int i_82_ = random.nextInt() & 0xff;
	    int i_83_ = ((Class586_Sub1) this).anIntArray8733[i_82_];
	    ((Class586_Sub1) this).anIntArray8733[i_82_]
		= ((Class586_Sub1) this).anIntArray8733[i_82_ + 256]
		= ((Class586_Sub1) this).anIntArray8733[i_81_];
	    ((Class586_Sub1) this).anIntArray8733[i_81_]
		= ((Class586_Sub1) this).anIntArray8733[i_81_ + 256] = i_83_;
	}
    }
    
    static final float method14428(float f) {
	return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
    }
    
    static final float method14429(int i, float f, float f_84_, float f_85_) {
	float[] fs = aFloatArrayArray8734[i];
	return fs[0] * f + fs[1] * f_84_ + fs[2] * f_85_;
    }
    
    void method12852(int i, int i_86_, int i_87_, int i_88_, float f,
		     float f_89_, float f_90_, float f_91_, float[] fs,
		     int i_92_) {
	int i_93_ = (int) ((float) i_86_ * f - 1.0F);
	i_93_ &= 0xff;
	int i_94_ = (int) ((float) i_87_ * f_89_ - 1.0F);
	i_94_ &= 0xff;
	int i_95_ = (int) ((float) i_88_ * f_90_ - 1.0F);
	i_95_ &= 0xff;
	float f_96_ = (float) i * f_90_;
	int i_97_ = (int) f_96_;
	int i_98_ = i_97_ + 1;
	float f_99_ = f_96_ - (float) i_97_;
	float f_100_ = 1.0F - f_99_;
	float f_101_ = method14428(f_99_);
	i_97_ &= i_95_;
	i_98_ &= i_95_;
	int i_102_ = ((Class586_Sub1) this).anIntArray8733[i_97_];
	int i_103_ = ((Class586_Sub1) this).anIntArray8733[i_98_];
	for (int i_104_ = 0; i_104_ < i_87_; i_104_++) {
	    float f_105_ = (float) i_104_ * f_89_;
	    int i_106_ = (int) f_105_;
	    int i_107_ = i_106_ + 1;
	    float f_108_ = f_105_ - (float) i_106_;
	    float f_109_ = 1.0F - f_108_;
	    float f_110_ = method14428(f_108_);
	    i_106_ &= i_94_;
	    i_107_ &= i_94_;
	    int i_111_
		= ((Class586_Sub1) this).anIntArray8733[i_106_ + i_102_];
	    int i_112_
		= ((Class586_Sub1) this).anIntArray8733[i_107_ + i_102_];
	    int i_113_
		= ((Class586_Sub1) this).anIntArray8733[i_106_ + i_103_];
	    int i_114_
		= ((Class586_Sub1) this).anIntArray8733[i_107_ + i_103_];
	    for (int i_115_ = 0; i_115_ < i_86_; i_115_++) {
		float f_116_ = (float) i_115_ * f;
		int i_117_ = (int) f_116_;
		int i_118_ = i_117_ + 1;
		float f_119_ = f_116_ - (float) i_117_;
		float f_120_ = 1.0F - f_119_;
		float f_121_ = method14428(f_119_);
		i_117_ &= i_93_;
		i_118_ &= i_93_;
		fs[i_92_++]
		    = (f_91_
		       * (method14422
			  ((method14422
			    (method14422(method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_117_ + i_111_]) & 0x7,
						     f_120_, f_109_, f_100_),
					 method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_118_ + i_111_]) & 0x7,
						     f_119_, f_109_, f_100_),
					 f_121_),
			     method14422(method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_117_ + i_112_]) & 0x7,
						     f_120_, f_108_, f_100_),
					 method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_118_ + i_112_]) & 0x7,
						     f_119_, f_108_, f_100_),
					 f_121_),
			     f_110_)),
			   (method14422
			    (method14422(method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_117_ + i_113_]) & 0x7,
						     f_120_, f_109_, f_99_),
					 method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_118_ + i_113_]) & 0x7,
						     f_119_, f_109_, f_99_),
					 f_121_),
			     method14422(method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_117_ + i_114_]) & 0x7,
						     f_120_, f_108_, f_99_),
					 method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_118_ + i_114_]) & 0x7,
						     f_119_, f_108_, f_99_),
					 f_121_),
			     f_110_)),
			   f_101_)));
	    }
	}
    }
    
    void method12855(int i, int i_122_, int i_123_, int i_124_, float f,
		     float f_125_, float f_126_, float f_127_, float[] fs,
		     int i_128_) {
	int i_129_ = (int) ((float) i_122_ * f - 1.0F);
	i_129_ &= 0xff;
	int i_130_ = (int) ((float) i_123_ * f_125_ - 1.0F);
	i_130_ &= 0xff;
	int i_131_ = (int) ((float) i_124_ * f_126_ - 1.0F);
	i_131_ &= 0xff;
	float f_132_ = (float) i * f_126_;
	int i_133_ = (int) f_132_;
	int i_134_ = i_133_ + 1;
	float f_135_ = f_132_ - (float) i_133_;
	float f_136_ = 1.0F - f_135_;
	float f_137_ = method14428(f_135_);
	i_133_ &= i_131_;
	i_134_ &= i_131_;
	int i_138_ = ((Class586_Sub1) this).anIntArray8733[i_133_];
	int i_139_ = ((Class586_Sub1) this).anIntArray8733[i_134_];
	for (int i_140_ = 0; i_140_ < i_123_; i_140_++) {
	    float f_141_ = (float) i_140_ * f_125_;
	    int i_142_ = (int) f_141_;
	    int i_143_ = i_142_ + 1;
	    float f_144_ = f_141_ - (float) i_142_;
	    float f_145_ = 1.0F - f_144_;
	    float f_146_ = method14428(f_144_);
	    i_142_ &= i_130_;
	    i_143_ &= i_130_;
	    int i_147_
		= ((Class586_Sub1) this).anIntArray8733[i_142_ + i_138_];
	    int i_148_
		= ((Class586_Sub1) this).anIntArray8733[i_143_ + i_138_];
	    int i_149_
		= ((Class586_Sub1) this).anIntArray8733[i_142_ + i_139_];
	    int i_150_
		= ((Class586_Sub1) this).anIntArray8733[i_143_ + i_139_];
	    for (int i_151_ = 0; i_151_ < i_122_; i_151_++) {
		float f_152_ = (float) i_151_ * f;
		int i_153_ = (int) f_152_;
		int i_154_ = i_153_ + 1;
		float f_155_ = f_152_ - (float) i_153_;
		float f_156_ = 1.0F - f_155_;
		float f_157_ = method14428(f_155_);
		i_153_ &= i_129_;
		i_154_ &= i_129_;
		fs[i_128_++]
		    = (f_127_
		       * (method14422
			  ((method14422
			    (method14422(method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_153_ + i_147_]) & 0x7,
						     f_156_, f_145_, f_136_),
					 method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_154_ + i_147_]) & 0x7,
						     f_155_, f_145_, f_136_),
					 f_157_),
			     method14422(method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_153_ + i_148_]) & 0x7,
						     f_156_, f_144_, f_136_),
					 method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_154_ + i_148_]) & 0x7,
						     f_155_, f_144_, f_136_),
					 f_157_),
			     f_146_)),
			   (method14422
			    (method14422(method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_153_ + i_149_]) & 0x7,
						     f_156_, f_145_, f_135_),
					 method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_154_ + i_149_]) & 0x7,
						     f_155_, f_145_, f_135_),
					 f_157_),
			     method14422(method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_153_ + i_150_]) & 0x7,
						     f_156_, f_144_, f_135_),
					 method14423((((Class586_Sub1) this)
						      .anIntArray8733
						      [i_154_ + i_150_]) & 0x7,
						     f_155_, f_144_, f_135_),
					 f_157_),
			     f_146_)),
			   f_137_)));
	    }
	}
    }
}
