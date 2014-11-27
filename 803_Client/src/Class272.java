/* Class272 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class272
{
    public float aFloat4363;
    public float aFloat4364;
    public float aFloat4365;
    public float aFloat4366;
    public float aFloat4367;
    public float aFloat4368;
    static float[] aFloatArray4369 = new float[8];
    static float[] aFloatArray4370 = new float[8];
    static float[] aFloatArray4371 = new float[8];
    
    public boolean method5316(int i, int i_0_, int i_1_, int i_2_,
			      Class268 class268, float f, float f_3_,
			      float f_4_, float f_5_) {
	boolean bool = false;
	float f_6_ = 3.4028235E38F;
	float f_7_ = -3.4028235E38F;
	float f_8_ = 3.4028235E38F;
	float f_9_ = -3.4028235E38F;
	aFloatArray4369[0] = aFloat4367;
	aFloatArray4370[0] = aFloat4363;
	aFloatArray4371[0] = aFloat4365;
	aFloatArray4369[1] = aFloat4366;
	aFloatArray4370[1] = aFloat4363;
	aFloatArray4371[1] = aFloat4365;
	aFloatArray4369[2] = aFloat4367;
	aFloatArray4370[2] = aFloat4364;
	aFloatArray4371[2] = aFloat4365;
	aFloatArray4369[3] = aFloat4366;
	aFloatArray4370[3] = aFloat4364;
	aFloatArray4371[3] = aFloat4365;
	aFloatArray4369[4] = aFloat4367;
	aFloatArray4370[4] = aFloat4363;
	aFloatArray4371[4] = aFloat4368;
	aFloatArray4369[5] = aFloat4366;
	aFloatArray4370[5] = aFloat4363;
	aFloatArray4371[5] = aFloat4368;
	aFloatArray4369[6] = aFloat4367;
	aFloatArray4370[6] = aFloat4364;
	aFloatArray4371[6] = aFloat4368;
	aFloatArray4369[7] = aFloat4366;
	aFloatArray4370[7] = aFloat4364;
	aFloatArray4371[7] = aFloat4368;
	for (int i_10_ = 0; i_10_ < 8; i_10_++) {
	    float f_11_ = aFloatArray4369[i_10_];
	    float f_12_ = aFloatArray4370[i_10_];
	    float f_13_ = aFloatArray4371[i_10_];
	    float f_14_ = (class268.aFloatArray4353[2] * f_11_
			   + class268.aFloatArray4353[6] * f_12_
			   + class268.aFloatArray4353[10] * f_13_
			   + class268.aFloatArray4353[14]);
	    float f_15_ = (class268.aFloatArray4353[3] * f_11_
			   + class268.aFloatArray4353[7] * f_12_
			   + class268.aFloatArray4353[11] * f_13_
			   + class268.aFloatArray4353[15]);
	    if (f_14_ >= -f_15_) {
		float f_16_ = (class268.aFloatArray4353[0] * f_11_
			       + class268.aFloatArray4353[4] * f_12_
			       + class268.aFloatArray4353[8] * f_13_
			       + class268.aFloatArray4353[12]);
		float f_17_ = (class268.aFloatArray4353[1] * f_11_
			       + class268.aFloatArray4353[5] * f_12_
			       + class268.aFloatArray4353[9] * f_13_
			       + class268.aFloatArray4353[13]);
		float f_18_ = f + f_4_ * f_16_ / f_15_;
		float f_19_ = f_3_ + f_5_ * f_17_ / f_15_;
		if (f_18_ < f_6_)
		    f_6_ = f_18_;
		if (f_18_ > f_7_)
		    f_7_ = f_18_;
		if (f_19_ < f_8_)
		    f_8_ = f_19_;
		if (f_19_ > f_9_)
		    f_9_ = f_19_;
		bool = true;
	    }
	}
	int i_20_ = i + i_1_;
	int i_21_ = i_0_ + i_2_;
	if (bool && (float) i_20_ > f_6_ && (float) i < f_7_
	    && (float) i_21_ > f_8_ && (float) i_0_ < f_9_)
	    return true;
	return false;
    }
    
    public boolean method5317(int i, int i_22_, int i_23_, int i_24_,
			      Class268 class268, float f, float f_25_,
			      float f_26_, float f_27_) {
	boolean bool = false;
	float f_28_ = 3.4028235E38F;
	float f_29_ = -3.4028235E38F;
	float f_30_ = 3.4028235E38F;
	float f_31_ = -3.4028235E38F;
	aFloatArray4369[0] = aFloat4367;
	aFloatArray4370[0] = aFloat4363;
	aFloatArray4371[0] = aFloat4365;
	aFloatArray4369[1] = aFloat4366;
	aFloatArray4370[1] = aFloat4363;
	aFloatArray4371[1] = aFloat4365;
	aFloatArray4369[2] = aFloat4367;
	aFloatArray4370[2] = aFloat4364;
	aFloatArray4371[2] = aFloat4365;
	aFloatArray4369[3] = aFloat4366;
	aFloatArray4370[3] = aFloat4364;
	aFloatArray4371[3] = aFloat4365;
	aFloatArray4369[4] = aFloat4367;
	aFloatArray4370[4] = aFloat4363;
	aFloatArray4371[4] = aFloat4368;
	aFloatArray4369[5] = aFloat4366;
	aFloatArray4370[5] = aFloat4363;
	aFloatArray4371[5] = aFloat4368;
	aFloatArray4369[6] = aFloat4367;
	aFloatArray4370[6] = aFloat4364;
	aFloatArray4371[6] = aFloat4368;
	aFloatArray4369[7] = aFloat4366;
	aFloatArray4370[7] = aFloat4364;
	aFloatArray4371[7] = aFloat4368;
	for (int i_32_ = 0; i_32_ < 8; i_32_++) {
	    float f_33_ = aFloatArray4369[i_32_];
	    float f_34_ = aFloatArray4370[i_32_];
	    float f_35_ = aFloatArray4371[i_32_];
	    float f_36_ = (class268.aFloatArray4353[2] * f_33_
			   + class268.aFloatArray4353[6] * f_34_
			   + class268.aFloatArray4353[10] * f_35_
			   + class268.aFloatArray4353[14]);
	    float f_37_ = (class268.aFloatArray4353[3] * f_33_
			   + class268.aFloatArray4353[7] * f_34_
			   + class268.aFloatArray4353[11] * f_35_
			   + class268.aFloatArray4353[15]);
	    if (f_36_ >= -f_37_) {
		float f_38_ = (class268.aFloatArray4353[0] * f_33_
			       + class268.aFloatArray4353[4] * f_34_
			       + class268.aFloatArray4353[8] * f_35_
			       + class268.aFloatArray4353[12]);
		float f_39_ = (class268.aFloatArray4353[1] * f_33_
			       + class268.aFloatArray4353[5] * f_34_
			       + class268.aFloatArray4353[9] * f_35_
			       + class268.aFloatArray4353[13]);
		float f_40_ = f + f_26_ * f_38_ / f_37_;
		float f_41_ = f_25_ + f_27_ * f_39_ / f_37_;
		if (f_40_ < f_28_)
		    f_28_ = f_40_;
		if (f_40_ > f_29_)
		    f_29_ = f_40_;
		if (f_41_ < f_30_)
		    f_30_ = f_41_;
		if (f_41_ > f_31_)
		    f_31_ = f_41_;
		bool = true;
	    }
	}
	int i_42_ = i + i_23_;
	int i_43_ = i_22_ + i_24_;
	if (bool && (float) i_42_ > f_28_ && (float) i < f_29_
	    && (float) i_43_ > f_30_ && (float) i_22_ < f_31_)
	    return true;
	return false;
    }
    
    public boolean method5318(int i, int i_44_, int i_45_, int i_46_,
			      Class268 class268, float f, float f_47_,
			      float f_48_, float f_49_) {
	boolean bool = false;
	float f_50_ = 3.4028235E38F;
	float f_51_ = -3.4028235E38F;
	float f_52_ = 3.4028235E38F;
	float f_53_ = -3.4028235E38F;
	aFloatArray4369[0] = aFloat4367;
	aFloatArray4370[0] = aFloat4363;
	aFloatArray4371[0] = aFloat4365;
	aFloatArray4369[1] = aFloat4366;
	aFloatArray4370[1] = aFloat4363;
	aFloatArray4371[1] = aFloat4365;
	aFloatArray4369[2] = aFloat4367;
	aFloatArray4370[2] = aFloat4364;
	aFloatArray4371[2] = aFloat4365;
	aFloatArray4369[3] = aFloat4366;
	aFloatArray4370[3] = aFloat4364;
	aFloatArray4371[3] = aFloat4365;
	aFloatArray4369[4] = aFloat4367;
	aFloatArray4370[4] = aFloat4363;
	aFloatArray4371[4] = aFloat4368;
	aFloatArray4369[5] = aFloat4366;
	aFloatArray4370[5] = aFloat4363;
	aFloatArray4371[5] = aFloat4368;
	aFloatArray4369[6] = aFloat4367;
	aFloatArray4370[6] = aFloat4364;
	aFloatArray4371[6] = aFloat4368;
	aFloatArray4369[7] = aFloat4366;
	aFloatArray4370[7] = aFloat4364;
	aFloatArray4371[7] = aFloat4368;
	for (int i_54_ = 0; i_54_ < 8; i_54_++) {
	    float f_55_ = aFloatArray4369[i_54_];
	    float f_56_ = aFloatArray4370[i_54_];
	    float f_57_ = aFloatArray4371[i_54_];
	    float f_58_ = (class268.aFloatArray4353[2] * f_55_
			   + class268.aFloatArray4353[6] * f_56_
			   + class268.aFloatArray4353[10] * f_57_
			   + class268.aFloatArray4353[14]);
	    float f_59_ = (class268.aFloatArray4353[3] * f_55_
			   + class268.aFloatArray4353[7] * f_56_
			   + class268.aFloatArray4353[11] * f_57_
			   + class268.aFloatArray4353[15]);
	    if (f_58_ >= -f_59_) {
		float f_60_ = (class268.aFloatArray4353[0] * f_55_
			       + class268.aFloatArray4353[4] * f_56_
			       + class268.aFloatArray4353[8] * f_57_
			       + class268.aFloatArray4353[12]);
		float f_61_ = (class268.aFloatArray4353[1] * f_55_
			       + class268.aFloatArray4353[5] * f_56_
			       + class268.aFloatArray4353[9] * f_57_
			       + class268.aFloatArray4353[13]);
		float f_62_ = f + f_48_ * f_60_ / f_59_;
		float f_63_ = f_47_ + f_49_ * f_61_ / f_59_;
		if (f_62_ < f_50_)
		    f_50_ = f_62_;
		if (f_62_ > f_51_)
		    f_51_ = f_62_;
		if (f_63_ < f_52_)
		    f_52_ = f_63_;
		if (f_63_ > f_53_)
		    f_53_ = f_63_;
		bool = true;
	    }
	}
	int i_64_ = i + i_45_;
	int i_65_ = i_44_ + i_46_;
	if (bool && (float) i_64_ > f_50_ && (float) i < f_51_
	    && (float) i_65_ > f_52_ && (float) i_44_ < f_53_)
	    return true;
	return false;
    }
    
    public boolean method5319(int i, int i_66_, int i_67_, int i_68_,
			      Class268 class268, float f, float f_69_,
			      float f_70_, float f_71_) {
	boolean bool = false;
	float f_72_ = 3.4028235E38F;
	float f_73_ = -3.4028235E38F;
	float f_74_ = 3.4028235E38F;
	float f_75_ = -3.4028235E38F;
	aFloatArray4369[0] = aFloat4367;
	aFloatArray4370[0] = aFloat4363;
	aFloatArray4371[0] = aFloat4365;
	aFloatArray4369[1] = aFloat4366;
	aFloatArray4370[1] = aFloat4363;
	aFloatArray4371[1] = aFloat4365;
	aFloatArray4369[2] = aFloat4367;
	aFloatArray4370[2] = aFloat4364;
	aFloatArray4371[2] = aFloat4365;
	aFloatArray4369[3] = aFloat4366;
	aFloatArray4370[3] = aFloat4364;
	aFloatArray4371[3] = aFloat4365;
	aFloatArray4369[4] = aFloat4367;
	aFloatArray4370[4] = aFloat4363;
	aFloatArray4371[4] = aFloat4368;
	aFloatArray4369[5] = aFloat4366;
	aFloatArray4370[5] = aFloat4363;
	aFloatArray4371[5] = aFloat4368;
	aFloatArray4369[6] = aFloat4367;
	aFloatArray4370[6] = aFloat4364;
	aFloatArray4371[6] = aFloat4368;
	aFloatArray4369[7] = aFloat4366;
	aFloatArray4370[7] = aFloat4364;
	aFloatArray4371[7] = aFloat4368;
	for (int i_76_ = 0; i_76_ < 8; i_76_++) {
	    float f_77_ = aFloatArray4369[i_76_];
	    float f_78_ = aFloatArray4370[i_76_];
	    float f_79_ = aFloatArray4371[i_76_];
	    float f_80_ = (class268.aFloatArray4353[2] * f_77_
			   + class268.aFloatArray4353[6] * f_78_
			   + class268.aFloatArray4353[10] * f_79_
			   + class268.aFloatArray4353[14]);
	    float f_81_ = (class268.aFloatArray4353[3] * f_77_
			   + class268.aFloatArray4353[7] * f_78_
			   + class268.aFloatArray4353[11] * f_79_
			   + class268.aFloatArray4353[15]);
	    if (f_80_ >= -f_81_) {
		float f_82_ = (class268.aFloatArray4353[0] * f_77_
			       + class268.aFloatArray4353[4] * f_78_
			       + class268.aFloatArray4353[8] * f_79_
			       + class268.aFloatArray4353[12]);
		float f_83_ = (class268.aFloatArray4353[1] * f_77_
			       + class268.aFloatArray4353[5] * f_78_
			       + class268.aFloatArray4353[9] * f_79_
			       + class268.aFloatArray4353[13]);
		float f_84_ = f + f_70_ * f_82_ / f_81_;
		float f_85_ = f_69_ + f_71_ * f_83_ / f_81_;
		if (f_84_ < f_72_)
		    f_72_ = f_84_;
		if (f_84_ > f_73_)
		    f_73_ = f_84_;
		if (f_85_ < f_74_)
		    f_74_ = f_85_;
		if (f_85_ > f_75_)
		    f_75_ = f_85_;
		bool = true;
	    }
	}
	int i_86_ = i + i_67_;
	int i_87_ = i_66_ + i_68_;
	if (bool && (float) i_86_ > f_72_ && (float) i < f_73_
	    && (float) i_87_ > f_74_ && (float) i_66_ < f_75_)
	    return true;
	return false;
    }
}
