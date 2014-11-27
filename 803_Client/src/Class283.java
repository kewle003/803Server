/* Class283 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class283
{
    float[] aFloatArray4447;
    Class273[] aClass273Array4448 = new Class273[1];
    
    public float method5494() {
	float f = 0.0F;
	for (int i = 0; i < ((Class283) this).aClass273Array4448.length; i++)
	    f += ((Class283) this).aClass273Array4448[i].method5325();
	return f;
    }
    
    public float method5495() {
	float f = 0.0F;
	for (int i = 0; i < ((Class283) this).aClass273Array4448.length; i++)
	    f += ((Class283) this).aClass273Array4448[i].method5325();
	return f;
    }
    
    public float method5496(float f) {
	int i = (int) f;
	if (i + 1 < ((Class283) this).aFloatArray4447.length) {
	    float f_0_ = ((Class283) this).aFloatArray4447[i];
	    float f_1_ = ((Class283) this).aFloatArray4447[i + 1];
	    float f_2_ = f - (float) i;
	    return (1.0F - f_2_) * f_0_ + f_2_ * f_1_;
	}
	return (((Class283) this).aFloatArray4447
		[((Class283) this).aFloatArray4447.length - 1]);
    }
    
    public double[] method5497(float f) {
	float f_3_ = 0.0F;
	float f_4_ = 0.0F;
	for (int i = 0; i < ((Class283) this).aClass273Array4448.length; i++) {
	    f_4_ += ((Class283) this).aClass273Array4448[i].method5325();
	    if (f < f_4_) {
		float f_5_ = ((Class283) this).aClass273Array4448[i]
				 .method5326(f - f_3_);
		return ((Class283) this).aClass273Array4448[i]
			   .method5324(f_5_);
	    }
	    f_3_ = f_4_;
	}
	return ((Class283) this).aClass273Array4448
		   [((Class283) this).aClass273Array4448.length - 1]
		   .method5324(1.0F);
    }
    
    public float method5498() {
	float f = 0.0F;
	for (int i = 0; i < ((Class283) this).aClass273Array4448.length; i++)
	    f += ((Class283) this).aClass273Array4448[i].method5325();
	return f;
    }
    
    public double[] method5499(float f) {
	int i = (int) f;
	if (i < ((Class283) this).aClass273Array4448.length)
	    return ((Class283) this).aClass273Array4448[i]
		       .method5324(f - (float) i);
	return ((Class283) this).aClass273Array4448
		   [((Class283) this).aClass273Array4448.length - 1]
		   .method5324(1.0F);
    }
    
    public float method5500(float f) {
	return method5501(method5515(f));
    }
    
    public float method5501(float f) {
	int i = (int) f;
	if (i + 1 < ((Class283) this).aFloatArray4447.length) {
	    float f_6_ = ((Class283) this).aFloatArray4447[i];
	    float f_7_ = ((Class283) this).aFloatArray4447[i + 1];
	    float f_8_ = f - (float) i;
	    return (1.0F - f_8_) * f_6_ + f_8_ * f_7_;
	}
	return (((Class283) this).aFloatArray4447
		[((Class283) this).aFloatArray4447.length - 1]);
    }
    
    public Class283(RSByteBuffer class241_sub3) {
	((Class283) this).aFloatArray4447 = new float[2];
	int i = class241_sub3.readSmart((short) -218);
	((Class283) this).aClass273Array4448[0] = new Class273();
	((Class283) this).aClass273Array4448[0]
	    .method5329(0, Class287.method5563(class241_sub3));
	((Class283) this).aClass273Array4448[0]
	    .method5329(1, Class287.method5563(class241_sub3));
	((Class283) this).aFloatArray4447[0]
	    = class241_sub3.method14650(-2079680537);
	Class287 class287 = Class287.method5563(class241_sub3);
	Class287 class287_9_ = Class287.method5563(class241_sub3);
	Class287 class287_10_ = Class287.method5578(class287, class287_9_);
	class287_9_.method5564();
	class287_9_ = class287_10_;
	class287_9_.method5574(class287);
	((Class283) this).aClass273Array4448[0].method5329(3, class287);
	((Class283) this).aClass273Array4448[0].method5329(2, class287_9_);
	((Class283) this).aFloatArray4447[1]
	    = class241_sub3.method14650(-1320014108);
	for (int i_11_ = 2; i_11_ < i; i_11_++) {
	    Class287 class287_12_ = Class287.method5563(class241_sub3);
	    Class287 class287_13_ = Class287.method5563(class241_sub3);
	    Class287 class287_14_
		= Class287.method5578(class287_12_, class287_13_);
	    class287_13_.method5564();
	    class287_13_ = class287_14_;
	    class287_13_.method5574(class287_12_);
	    method5504(class287_12_, class287_13_,
		       class241_sub3.method14650(-1909207396));
	}
    }
    
    public float method5502(float f) {
	return method5501(method5515(f));
    }
    
    public int method5503() {
	return ((Class283) this).aClass273Array4448.length;
    }
    
    void method5504(Class287 class287, Class287 class287_15_, float f) {
	Class273[] class273s
	    = new Class273[((Class283) this).aClass273Array4448.length + 1];
	System.arraycopy(((Class283) this).aClass273Array4448, 0, class273s, 0,
			 ((Class283) this).aClass273Array4448.length);
	Class273 class273 = new Class273();
	Class273 class273_16_
	    = (((Class283) this).aClass273Array4448
	       [((Class283) this).aClass273Array4448.length - 1]);
	class273.method5329(0, class273_16_.method5331(3));
	Class287 class287_17_
	    = Class287.method5578(class273_16_.method5331(3),
				  class273_16_.method5331(2));
	class273.method5329(1, Class287.method5576(class273_16_.method5331(3),
						   class287_17_));
	class273.method5329(3, class287);
	class273.method5329(2, class287_15_);
	class273s[class273s.length - 1] = class273;
	((Class283) this).aClass273Array4448 = class273s;
	float[] fs = new float[((Class283) this).aFloatArray4447.length + 1];
	System.arraycopy(((Class283) this).aFloatArray4447, 0, fs, 0,
			 ((Class283) this).aFloatArray4447.length);
	fs[fs.length - 1] = f;
	((Class283) this).aFloatArray4447 = fs;
    }
    
    public int method5505() {
	return ((Class283) this).aClass273Array4448.length;
    }
    
    public int method5506() {
	return ((Class283) this).aClass273Array4448.length;
    }
    
    public float method5507() {
	float f = 0.0F;
	for (int i = 0; i < ((Class283) this).aClass273Array4448.length; i++)
	    f += ((Class283) this).aClass273Array4448[i].method5325();
	return f;
    }
    
    public float method5508() {
	float f = 0.0F;
	for (int i = 0; i < ((Class283) this).aClass273Array4448.length; i++)
	    f += ((Class283) this).aClass273Array4448[i].method5325();
	return f;
    }
    
    public double[] method5509(float f) {
	float f_18_ = 0.0F;
	float f_19_ = 0.0F;
	for (int i = 0; i < ((Class283) this).aClass273Array4448.length; i++) {
	    f_19_ += ((Class283) this).aClass273Array4448[i].method5325();
	    if (f < f_19_) {
		float f_20_ = ((Class283) this).aClass273Array4448[i]
				  .method5326(f - f_18_);
		return ((Class283) this).aClass273Array4448[i]
			   .method5324(f_20_);
	    }
	    f_18_ = f_19_;
	}
	return ((Class283) this).aClass273Array4448
		   [((Class283) this).aClass273Array4448.length - 1]
		   .method5324(1.0F);
    }
    
    public double[] method5510(float f) {
	float f_21_ = 0.0F;
	float f_22_ = 0.0F;
	for (int i = 0; i < ((Class283) this).aClass273Array4448.length; i++) {
	    f_22_ += ((Class283) this).aClass273Array4448[i].method5325();
	    if (f < f_22_) {
		float f_23_ = ((Class283) this).aClass273Array4448[i]
				  .method5326(f - f_21_);
		return ((Class283) this).aClass273Array4448[i]
			   .method5324(f_23_);
	    }
	    f_21_ = f_22_;
	}
	return ((Class283) this).aClass273Array4448
		   [((Class283) this).aClass273Array4448.length - 1]
		   .method5324(1.0F);
    }
    
    public double[] method5511(float f) {
	int i = (int) f;
	if (i < ((Class283) this).aClass273Array4448.length)
	    return ((Class283) this).aClass273Array4448[i]
		       .method5324(f - (float) i);
	return ((Class283) this).aClass273Array4448
		   [((Class283) this).aClass273Array4448.length - 1]
		   .method5324(1.0F);
    }
    
    public float method5512(float f) {
	float f_24_ = 0.0F;
	float f_25_ = 0.0F;
	for (int i = 0; i < ((Class283) this).aClass273Array4448.length; i++) {
	    f_25_ += ((Class283) this).aClass273Array4448[i].method5325();
	    if (f < f_25_)
		return (((Class283) this).aClass273Array4448[i]
			    .method5326(f - f_24_)
			+ (float) i);
	    f_24_ = f_25_;
	}
	return (float) ((Class283) this).aClass273Array4448.length;
    }
    
    public float method5513(float f) {
	float f_26_ = 0.0F;
	float f_27_ = 0.0F;
	for (int i = 0; i < ((Class283) this).aClass273Array4448.length; i++) {
	    f_27_ += ((Class283) this).aClass273Array4448[i].method5325();
	    if (f < f_27_)
		return (((Class283) this).aClass273Array4448[i]
			    .method5326(f - f_26_)
			+ (float) i);
	    f_26_ = f_27_;
	}
	return (float) ((Class283) this).aClass273Array4448.length;
    }
    
    public double[] method5514(float f) {
	int i = (int) f;
	if (i < ((Class283) this).aClass273Array4448.length)
	    return ((Class283) this).aClass273Array4448[i]
		       .method5324(f - (float) i);
	return ((Class283) this).aClass273Array4448
		   [((Class283) this).aClass273Array4448.length - 1]
		   .method5324(1.0F);
    }
    
    public float method5515(float f) {
	float f_28_ = 0.0F;
	float f_29_ = 0.0F;
	for (int i = 0; i < ((Class283) this).aClass273Array4448.length; i++) {
	    f_29_ += ((Class283) this).aClass273Array4448[i].method5325();
	    if (f < f_29_)
		return (((Class283) this).aClass273Array4448[i]
			    .method5326(f - f_28_)
			+ (float) i);
	    f_28_ = f_29_;
	}
	return (float) ((Class283) this).aClass273Array4448.length;
    }
    
    public double[] method5516(float f) {
	float f_30_ = 0.0F;
	float f_31_ = 0.0F;
	for (int i = 0; i < ((Class283) this).aClass273Array4448.length; i++) {
	    f_31_ += ((Class283) this).aClass273Array4448[i].method5325();
	    if (f < f_31_) {
		float f_32_ = ((Class283) this).aClass273Array4448[i]
				  .method5326(f - f_30_);
		return ((Class283) this).aClass273Array4448[i]
			   .method5324(f_32_);
	    }
	    f_30_ = f_31_;
	}
	return ((Class283) this).aClass273Array4448
		   [((Class283) this).aClass273Array4448.length - 1]
		   .method5324(1.0F);
    }
    
    public int method5517() {
	return ((Class283) this).aClass273Array4448.length;
    }
    
    public float method5518(float f) {
	int i = (int) f;
	if (i + 1 < ((Class283) this).aFloatArray4447.length) {
	    float f_33_ = ((Class283) this).aFloatArray4447[i];
	    float f_34_ = ((Class283) this).aFloatArray4447[i + 1];
	    float f_35_ = f - (float) i;
	    return (1.0F - f_35_) * f_33_ + f_35_ * f_34_;
	}
	return (((Class283) this).aFloatArray4447
		[((Class283) this).aFloatArray4447.length - 1]);
    }
}
