/* Class273 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class273
{
    float[] aFloatArray4372;
    Class287[] aClass287Array4373 = new Class287[4];
    float aFloat4374;
    
    void method5320() {
	int i = 20;
	double[] ds = method5324(0.0F);
	float f = 0.0F;
	Class287 class287 = Class287.method5560();
	for (int i_0_ = 1; i_0_ <= i; i_0_++) {
	    double[] ds_1_ = method5324((float) i_0_ / (float) i);
	    class287.aFloat4477 = (float) (ds_1_[0] - ds[0]);
	    class287.aFloat4474 = (float) (ds_1_[1] - ds[1]);
	    class287.aFloat4479 = (float) (ds_1_[2] - ds[2]);
	    f += class287.method5559();
	    ds = ds_1_;
	}
	int i_2_ = (int) (f / 20.0F);
	if (i_2_ < i)
	    i_2_ = i;
	((Class273) this).aFloatArray4372 = new float[i_2_];
	ds = method5324(0.0F);
	float f_3_ = 0.0F;
	for (int i_4_ = 1; i_4_ <= i_2_; i_4_++) {
	    double[] ds_5_ = method5324((float) i_4_ / (float) i_2_);
	    class287.aFloat4477 = (float) (ds_5_[0] - ds[0]);
	    class287.aFloat4474 = (float) (ds_5_[1] - ds[1]);
	    class287.aFloat4479 = (float) (ds_5_[2] - ds[2]);
	    float f_6_ = class287.method5559();
	    f_3_ += f_6_;
	    ((Class273) this).aFloatArray4372[i_4_ - 1] = f_6_;
	    ds = ds_5_;
	}
	((Class273) this).aFloat4374 = f_3_;
    }
    
    void method5321() {
	((Class273) this).aFloat4374 = -1.0F;
	((Class273) this).aFloatArray4372 = null;
    }
    
    float method5322() {
	if (((Class273) this).aFloat4374 == -1.0F)
	    method5320();
	return ((Class273) this).aFloat4374;
    }
    
    double[] method5323(float f) {
	double[] ds = new double[3];
	float f_7_ = f * f;
	float f_8_ = f_7_ * f;
	double d
	    = (double) (3.0F
			* (((Class273) this).aClass287Array4373[1].aFloat4477
			   - (((Class273) this).aClass287Array4373[0]
			      .aFloat4477)));
	double d_9_
	    = ((double) (3.0F
			 * (((Class273) this).aClass287Array4373[2].aFloat4477
			    - (((Class273) this).aClass287Array4373[1]
			       .aFloat4477)))
	       - d);
	double d_10_
	    = ((double) (((Class273) this).aClass287Array4373[3].aFloat4477
			 - ((Class273) this).aClass287Array4373[0].aFloat4477)
	       - d - d_9_);
	ds[0]
	    = (d_10_ * (double) f_8_ + d_9_ * (double) f_7_ + d * (double) f
	       + (double) ((Class273) this).aClass287Array4373[0].aFloat4477);
	d = (double) (3.0F
		      * (((Class273) this).aClass287Array4373[1].aFloat4474
			 - (((Class273) this).aClass287Array4373[0]
			    .aFloat4474)));
	d_9_ = (double) (3.0F
			 * (((Class273) this).aClass287Array4373[2].aFloat4474
			    - (((Class273) this).aClass287Array4373[1]
			       .aFloat4474))) - d;
	d_10_
	    = ((double) (((Class273) this).aClass287Array4373[3].aFloat4474
			 - ((Class273) this).aClass287Array4373[0].aFloat4474)
	       - d - d_9_);
	ds[1]
	    = (d_10_ * (double) f_8_ + d_9_ * (double) f_7_ + d * (double) f
	       + (double) ((Class273) this).aClass287Array4373[0].aFloat4474);
	d = (double) (3.0F
		      * (((Class273) this).aClass287Array4373[1].aFloat4479
			 - (((Class273) this).aClass287Array4373[0]
			    .aFloat4479)));
	d_9_ = (double) (3.0F
			 * (((Class273) this).aClass287Array4373[2].aFloat4479
			    - (((Class273) this).aClass287Array4373[1]
			       .aFloat4479))) - d;
	d_10_
	    = ((double) (((Class273) this).aClass287Array4373[3].aFloat4479
			 - ((Class273) this).aClass287Array4373[0].aFloat4479)
	       - d - d_9_);
	ds[2]
	    = (d_10_ * (double) f_8_ + d_9_ * (double) f_7_ + d * (double) f
	       + (double) ((Class273) this).aClass287Array4373[0].aFloat4479);
	return ds;
    }
    
    double[] method5324(float f) {
	double[] ds = new double[3];
	float f_11_ = f * f;
	float f_12_ = f_11_ * f;
	double d
	    = (double) (3.0F
			* (((Class273) this).aClass287Array4373[1].aFloat4477
			   - (((Class273) this).aClass287Array4373[0]
			      .aFloat4477)));
	double d_13_
	    = ((double) (3.0F
			 * (((Class273) this).aClass287Array4373[2].aFloat4477
			    - (((Class273) this).aClass287Array4373[1]
			       .aFloat4477)))
	       - d);
	double d_14_
	    = ((double) (((Class273) this).aClass287Array4373[3].aFloat4477
			 - ((Class273) this).aClass287Array4373[0].aFloat4477)
	       - d - d_13_);
	ds[0]
	    = (d_14_ * (double) f_12_ + d_13_ * (double) f_11_ + d * (double) f
	       + (double) ((Class273) this).aClass287Array4373[0].aFloat4477);
	d = (double) (3.0F
		      * (((Class273) this).aClass287Array4373[1].aFloat4474
			 - (((Class273) this).aClass287Array4373[0]
			    .aFloat4474)));
	d_13_ = (double) (3.0F
			  * (((Class273) this).aClass287Array4373[2].aFloat4474
			     - (((Class273) this).aClass287Array4373[1]
				.aFloat4474))) - d;
	d_14_
	    = ((double) (((Class273) this).aClass287Array4373[3].aFloat4474
			 - ((Class273) this).aClass287Array4373[0].aFloat4474)
	       - d - d_13_);
	ds[1]
	    = (d_14_ * (double) f_12_ + d_13_ * (double) f_11_ + d * (double) f
	       + (double) ((Class273) this).aClass287Array4373[0].aFloat4474);
	d = (double) (3.0F
		      * (((Class273) this).aClass287Array4373[1].aFloat4479
			 - (((Class273) this).aClass287Array4373[0]
			    .aFloat4479)));
	d_13_ = (double) (3.0F
			  * (((Class273) this).aClass287Array4373[2].aFloat4479
			     - (((Class273) this).aClass287Array4373[1]
				.aFloat4479))) - d;
	d_14_
	    = ((double) (((Class273) this).aClass287Array4373[3].aFloat4479
			 - ((Class273) this).aClass287Array4373[0].aFloat4479)
	       - d - d_13_);
	ds[2]
	    = (d_14_ * (double) f_12_ + d_13_ * (double) f_11_ + d * (double) f
	       + (double) ((Class273) this).aClass287Array4373[0].aFloat4479);
	return ds;
    }
    
    float method5325() {
	if (((Class273) this).aFloat4374 == -1.0F)
	    method5320();
	return ((Class273) this).aFloat4374;
    }
    
    float method5326(float f) {
	if (((Class273) this).aFloat4374 == -1.0F)
	    method5320();
	if (f <= 0.0F)
	    return 0.0F;
	if (f >= ((Class273) this).aFloat4374)
	    return 1.0F;
	float f_15_ = 0.0F;
	float f_16_ = ((Class273) this).aFloatArray4372[0];
	for (int i = 1; i < ((Class273) this).aFloatArray4372.length; i++) {
	    if (f < f_16_) {
		float f_17_ = (f - f_15_) / (f_16_ - f_15_);
		float f_18_
		    = ((float) (i - 1)
		       / (float) ((Class273) this).aFloatArray4372.length);
		float f_19_
		    = ((float) i
		       / (float) ((Class273) this).aFloatArray4372.length);
		return f_18_ + (f_19_ - f_18_) * f_17_;
	    }
	    f_15_ = f_16_;
	    f_16_ += ((Class273) this).aFloatArray4372[i];
	}
	float f_20_ = (f - f_15_) / (f_16_ - f_15_);
	float f_21_ = ((float) (((Class273) this).aFloatArray4372.length - 1)
		       / (float) ((Class273) this).aFloatArray4372.length);
	return f_21_ + (1.0F - f_21_) * f_20_;
    }
    
    Class273() {
	for (int i = 0; i < 4; i++)
	    ((Class273) this).aClass287Array4373[i] = new Class287();
	method5321();
    }
    
    void method5327(int i, Class287 class287) {
	((Class273) this).aClass287Array4373[i].method5655(class287);
	method5321();
    }
    
    void method5328(int i, Class287 class287) {
	((Class273) this).aClass287Array4373[i].method5655(class287);
	method5321();
    }
    
    void method5329(int i, Class287 class287) {
	((Class273) this).aClass287Array4373[i].method5655(class287);
	method5321();
    }
    
    Class287 method5330(int i) {
	return ((Class273) this).aClass287Array4373[i];
    }
    
    Class287 method5331(int i) {
	return ((Class273) this).aClass287Array4373[i];
    }
    
    float method5332() {
	if (((Class273) this).aFloat4374 == -1.0F)
	    method5320();
	return ((Class273) this).aFloat4374;
    }
    
    float method5333() {
	if (((Class273) this).aFloat4374 == -1.0F)
	    method5320();
	return ((Class273) this).aFloat4374;
    }
    
    float method5334(float f) {
	if (((Class273) this).aFloat4374 == -1.0F)
	    method5320();
	if (f <= 0.0F)
	    return 0.0F;
	if (f >= ((Class273) this).aFloat4374)
	    return 1.0F;
	float f_22_ = 0.0F;
	float f_23_ = ((Class273) this).aFloatArray4372[0];
	for (int i = 1; i < ((Class273) this).aFloatArray4372.length; i++) {
	    if (f < f_23_) {
		float f_24_ = (f - f_22_) / (f_23_ - f_22_);
		float f_25_
		    = ((float) (i - 1)
		       / (float) ((Class273) this).aFloatArray4372.length);
		float f_26_
		    = ((float) i
		       / (float) ((Class273) this).aFloatArray4372.length);
		return f_25_ + (f_26_ - f_25_) * f_24_;
	    }
	    f_22_ = f_23_;
	    f_23_ += ((Class273) this).aFloatArray4372[i];
	}
	float f_27_ = (f - f_22_) / (f_23_ - f_22_);
	float f_28_ = ((float) (((Class273) this).aFloatArray4372.length - 1)
		       / (float) ((Class273) this).aFloatArray4372.length);
	return f_28_ + (1.0F - f_28_) * f_27_;
    }
    
    float method5335(float f) {
	if (((Class273) this).aFloat4374 == -1.0F)
	    method5320();
	if (f <= 0.0F)
	    return 0.0F;
	if (f >= ((Class273) this).aFloat4374)
	    return 1.0F;
	float f_29_ = 0.0F;
	float f_30_ = ((Class273) this).aFloatArray4372[0];
	for (int i = 1; i < ((Class273) this).aFloatArray4372.length; i++) {
	    if (f < f_30_) {
		float f_31_ = (f - f_29_) / (f_30_ - f_29_);
		float f_32_
		    = ((float) (i - 1)
		       / (float) ((Class273) this).aFloatArray4372.length);
		float f_33_
		    = ((float) i
		       / (float) ((Class273) this).aFloatArray4372.length);
		return f_32_ + (f_33_ - f_32_) * f_31_;
	    }
	    f_29_ = f_30_;
	    f_30_ += ((Class273) this).aFloatArray4372[i];
	}
	float f_34_ = (f - f_29_) / (f_30_ - f_29_);
	float f_35_ = ((float) (((Class273) this).aFloatArray4372.length - 1)
		       / (float) ((Class273) this).aFloatArray4372.length);
	return f_35_ + (1.0F - f_35_) * f_34_;
    }
    
    void method5336() {
	int i = 20;
	double[] ds = method5324(0.0F);
	float f = 0.0F;
	Class287 class287 = Class287.method5560();
	for (int i_36_ = 1; i_36_ <= i; i_36_++) {
	    double[] ds_37_ = method5324((float) i_36_ / (float) i);
	    class287.aFloat4477 = (float) (ds_37_[0] - ds[0]);
	    class287.aFloat4474 = (float) (ds_37_[1] - ds[1]);
	    class287.aFloat4479 = (float) (ds_37_[2] - ds[2]);
	    f += class287.method5559();
	    ds = ds_37_;
	}
	int i_38_ = (int) (f / 20.0F);
	if (i_38_ < i)
	    i_38_ = i;
	((Class273) this).aFloatArray4372 = new float[i_38_];
	ds = method5324(0.0F);
	float f_39_ = 0.0F;
	for (int i_40_ = 1; i_40_ <= i_38_; i_40_++) {
	    double[] ds_41_ = method5324((float) i_40_ / (float) i_38_);
	    class287.aFloat4477 = (float) (ds_41_[0] - ds[0]);
	    class287.aFloat4474 = (float) (ds_41_[1] - ds[1]);
	    class287.aFloat4479 = (float) (ds_41_[2] - ds[2]);
	    float f_42_ = class287.method5559();
	    f_39_ += f_42_;
	    ((Class273) this).aFloatArray4372[i_40_ - 1] = f_42_;
	    ds = ds_41_;
	}
	((Class273) this).aFloat4374 = f_39_;
    }
    
    void method5337() {
	int i = 20;
	double[] ds = method5324(0.0F);
	float f = 0.0F;
	Class287 class287 = Class287.method5560();
	for (int i_43_ = 1; i_43_ <= i; i_43_++) {
	    double[] ds_44_ = method5324((float) i_43_ / (float) i);
	    class287.aFloat4477 = (float) (ds_44_[0] - ds[0]);
	    class287.aFloat4474 = (float) (ds_44_[1] - ds[1]);
	    class287.aFloat4479 = (float) (ds_44_[2] - ds[2]);
	    f += class287.method5559();
	    ds = ds_44_;
	}
	int i_45_ = (int) (f / 20.0F);
	if (i_45_ < i)
	    i_45_ = i;
	((Class273) this).aFloatArray4372 = new float[i_45_];
	ds = method5324(0.0F);
	float f_46_ = 0.0F;
	for (int i_47_ = 1; i_47_ <= i_45_; i_47_++) {
	    double[] ds_48_ = method5324((float) i_47_ / (float) i_45_);
	    class287.aFloat4477 = (float) (ds_48_[0] - ds[0]);
	    class287.aFloat4474 = (float) (ds_48_[1] - ds[1]);
	    class287.aFloat4479 = (float) (ds_48_[2] - ds[2]);
	    float f_49_ = class287.method5559();
	    f_46_ += f_49_;
	    ((Class273) this).aFloatArray4372[i_47_ - 1] = f_49_;
	    ds = ds_48_;
	}
	((Class273) this).aFloat4374 = f_46_;
    }
}
