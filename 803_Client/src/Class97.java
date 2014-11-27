/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class97
{
    public int anInt1347;
    public int anInt1348;
    public int anInt1349;
    public int anInt1350;
    public int anInt1351;
    public boolean aBool1352 = false;
    
    public boolean method2170(int i, int i_0_) {
	if (!aBool1352)
	    return false;
	int i_1_ = anInt1350 - anInt1349;
	int i_2_ = anInt1351 - anInt1347;
	int i_3_ = i_1_ * i_1_ + i_2_ * i_2_;
	int i_4_
	    = i * i_1_ + i_0_ * i_2_ - (anInt1349 * i_1_ + anInt1347 * i_2_);
	if (i_4_ <= 0) {
	    int i_5_ = anInt1349 - i;
	    int i_6_ = anInt1347 - i_0_;
	    return i_5_ * i_5_ + i_6_ * i_6_ < anInt1348 * anInt1348;
	}
	if (i_4_ > i_3_) {
	    int i_7_ = anInt1350 - i;
	    int i_8_ = anInt1351 - i_0_;
	    return i_7_ * i_7_ + i_8_ * i_8_ < anInt1348 * anInt1348;
	}
	int i_9_ = 10;
	if (i_4_ != (i_4_ & 0x1fffff))
	    i_9_ = 5;
	i_4_ = (i_4_ << i_9_) / i_3_;
	int i_10_ = anInt1349 + (i_1_ * i_4_ >> i_9_) - i;
	int i_11_ = anInt1347 + (i_2_ * i_4_ >> i_9_) - i_0_;
	return i_10_ * i_10_ + i_11_ * i_11_ < anInt1348 * anInt1348;
    }
    
    public boolean method2171(int i, int i_12_) {
	if (!aBool1352)
	    return false;
	int i_13_ = anInt1350 - anInt1349;
	int i_14_ = anInt1351 - anInt1347;
	int i_15_ = i_13_ * i_13_ + i_14_ * i_14_;
	int i_16_ = (i * i_13_ + i_12_ * i_14_
		     - (anInt1349 * i_13_ + anInt1347 * i_14_));
	if (i_16_ <= 0) {
	    int i_17_ = anInt1349 - i;
	    int i_18_ = anInt1347 - i_12_;
	    return i_17_ * i_17_ + i_18_ * i_18_ < anInt1348 * anInt1348;
	}
	if (i_16_ > i_15_) {
	    int i_19_ = anInt1350 - i;
	    int i_20_ = anInt1351 - i_12_;
	    return i_19_ * i_19_ + i_20_ * i_20_ < anInt1348 * anInt1348;
	}
	int i_21_ = 10;
	if (i_16_ != (i_16_ & 0x1fffff))
	    i_21_ = 5;
	i_16_ = (i_16_ << i_21_) / i_15_;
	int i_22_ = anInt1349 + (i_13_ * i_16_ >> i_21_) - i;
	int i_23_ = anInt1347 + (i_14_ * i_16_ >> i_21_) - i_12_;
	return i_22_ * i_22_ + i_23_ * i_23_ < anInt1348 * anInt1348;
    }
    
    public void method2172(Class272 class272, Class268 class268,
			   Class268 class268_24_, float f, float f_25_,
			   float f_26_, float f_27_) {
	boolean bool = false;
	aBool1352 = true;
	int i = (int) (class272.aFloat4367 + class272.aFloat4366) >> 1;
	int i_28_ = (int) (class272.aFloat4365 + class272.aFloat4368) >> 1;
	int i_29_ = i;
	int i_30_ = (int) class272.aFloat4363;
	int i_31_ = i_28_;
	float f_32_ = (class268_24_.aFloatArray4353[0] * (float) i_29_
		       + class268_24_.aFloatArray4353[4] * (float) i_30_
		       + class268_24_.aFloatArray4353[8] * (float) i_31_
		       + class268_24_.aFloatArray4353[12]);
	float f_33_ = (class268_24_.aFloatArray4353[1] * (float) i_29_
		       + class268_24_.aFloatArray4353[5] * (float) i_30_
		       + class268_24_.aFloatArray4353[9] * (float) i_31_
		       + class268_24_.aFloatArray4353[13]);
	float f_34_ = (class268_24_.aFloatArray4353[2] * (float) i_29_
		       + class268_24_.aFloatArray4353[6] * (float) i_30_
		       + class268_24_.aFloatArray4353[10] * (float) i_31_
		       + class268_24_.aFloatArray4353[14]);
	float f_35_ = (class268_24_.aFloatArray4353[3] * (float) i_29_
		       + class268_24_.aFloatArray4353[7] * (float) i_30_
		       + class268_24_.aFloatArray4353[11] * (float) i_31_
		       + class268_24_.aFloatArray4353[15]);
	if (f_34_ >= -f_35_) {
	    anInt1349 = (int) (f + f_26_ * f_32_ / f_35_);
	    anInt1347 = (int) (f_25_ + f_27_ * f_33_ / f_35_);
	} else
	    bool = true;
	i_29_ = i;
	i_30_ = (int) class272.aFloat4364;
	i_31_ = i_28_;
	float f_36_ = (class268_24_.aFloatArray4353[0] * (float) i_29_
		       + class268_24_.aFloatArray4353[4] * (float) i_30_
		       + class268_24_.aFloatArray4353[8] * (float) i_31_
		       + class268_24_.aFloatArray4353[12]);
	float f_37_ = (class268_24_.aFloatArray4353[1] * (float) i_29_
		       + class268_24_.aFloatArray4353[5] * (float) i_30_
		       + class268_24_.aFloatArray4353[9] * (float) i_31_
		       + class268_24_.aFloatArray4353[13]);
	float f_38_ = (class268_24_.aFloatArray4353[2] * (float) i_29_
		       + class268_24_.aFloatArray4353[6] * (float) i_30_
		       + class268_24_.aFloatArray4353[10] * (float) i_31_
		       + class268_24_.aFloatArray4353[14]);
	float f_39_ = (class268_24_.aFloatArray4353[3] * (float) i_29_
		       + class268_24_.aFloatArray4353[7] * (float) i_30_
		       + class268_24_.aFloatArray4353[11] * (float) i_31_
		       + class268_24_.aFloatArray4353[15]);
	if (f_38_ >= -f_39_) {
	    anInt1350 = (int) (f + f_26_ * f_36_ / f_39_);
	    anInt1351 = (int) (f_25_ + f_27_ * f_37_ / f_39_);
	} else
	    bool = true;
	if (bool) {
	    if (f_34_ < -f_35_ && f_38_ < -f_39_)
		aBool1352 = false;
	    else if (f_34_ < -f_35_) {
		float f_40_ = (f_34_ + f_35_) / (f_38_ + f_39_) - 1.0F;
		float f_41_ = f_32_ + f_40_ * (f_36_ - f_32_);
		float f_42_ = f_33_ + f_40_ * (f_37_ - f_33_);
		float f_43_ = f_35_ + f_40_ * (f_39_ - f_35_);
		anInt1349 = (int) (f + f_26_ * f_41_ / f_43_);
		anInt1347 = (int) (f_25_ + f_27_ * f_42_ / f_43_);
	    } else if (f_38_ < -f_39_) {
		float f_44_ = (f_38_ + f_39_) / (f_34_ + f_35_) - 1.0F;
		float f_45_ = f_36_ + f_44_ * (f_32_ - f_36_);
		float f_46_ = f_37_ + f_44_ * (f_33_ - f_37_);
		float f_47_ = f_39_ + f_44_ * (f_35_ - f_39_);
		anInt1350 = (int) (f + f_26_ * f_45_ / f_47_);
		anInt1351 = (int) (f_25_ + f_27_ * f_46_ / f_47_);
	    }
	}
	if (aBool1352) {
	    float f_48_
		= ((float) Math.sqrt(Math.pow((double) (class272.aFloat4366
							- class272.aFloat4367),
					      2.0)
				     + Math.pow((double) (class272.aFloat4368
							  - (class272
							     .aFloat4365)),
						2.0))
		   / 2.0F);
	    if (f_34_ / f_35_ > f_38_ / f_39_) {
		float f_49_ = (f_32_ + class268.aFloatArray4353[0] * f_48_
			       + class268.aFloatArray4353[12]);
		float f_50_ = (f_35_ + class268.aFloatArray4353[3] * f_48_
			       + class268.aFloatArray4353[15]);
		anInt1348
		    = (int) (f - (float) anInt1349 + f_26_ * f_49_ / f_50_);
	    } else {
		float f_51_ = (f_36_ + class268.aFloatArray4353[0] * f_48_
			       + class268.aFloatArray4353[12]);
		float f_52_ = (f_39_ + class268.aFloatArray4353[3] * f_48_
			       + class268.aFloatArray4353[15]);
		anInt1348
		    = (int) (f - (float) anInt1350 + f_26_ * f_51_ / f_52_);
	    }
	    aBool1352 = true;
	}
    }
}
