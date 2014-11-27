/* Class290 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class290
{
    public static void method5662(Class287 class287, Class287 class287_0_,
				  Class287 class287_1_, float f,
				  Class287[] class287s) {
	Class287 class287_2_ = Class287.method5578(class287, class287_1_);
	float f_3_ = Class287.method5580(class287_2_, class287_2_) - f * f;
	float f_4_ = Class287.method5580(class287_0_, class287_2_);
	float f_5_ = f_4_ * f_4_ - f_3_;
	if (f_5_ < 0.0F) {
	    Class287[] class287s_6_ = class287s;
	    class287s[1] = null;
	    class287s_6_[0] = null;
	} else if (f_5_ >= 9.765625E-4F) {
	    float f_7_ = (float) Math.sqrt((double) f_5_);
	    class287s[0] = Class287.method5560();
	    class287s[0].method5655(class287);
	    class287s[0].method5574
		(Class287.method5591(Class287.method5562(class287_0_),
				     -f_4_ - f_7_));
	    class287s[1] = Class287.method5560();
	    class287s[1].method5655(class287);
	    class287s[1].method5574
		(Class287.method5591(Class287.method5562(class287_0_),
				     -f_4_ + f_7_));
	} else {
	    class287s[0] = Class287.method5560();
	    class287s[0].method5655(class287);
	    class287s[0].method5574
		(Class287.method5591(Class287.method5562(class287_0_), -f_4_));
	    class287s[1] = null;
	}
    }
    
    public static void method5663(Class287 class287, Class287 class287_8_,
				  Class287 class287_9_, float f,
				  Class287[] class287s) {
	Class287 class287_10_ = Class287.method5578(class287, class287_9_);
	float f_11_ = Class287.method5580(class287_10_, class287_10_) - f * f;
	float f_12_ = Class287.method5580(class287_8_, class287_10_);
	float f_13_ = f_12_ * f_12_ - f_11_;
	if (f_13_ < 0.0F) {
	    Class287[] class287s_14_ = class287s;
	    class287s[1] = null;
	    class287s_14_[0] = null;
	} else if (f_13_ >= 9.765625E-4F) {
	    float f_15_ = (float) Math.sqrt((double) f_13_);
	    class287s[0] = Class287.method5560();
	    class287s[0].method5655(class287);
	    class287s[0].method5574
		(Class287.method5591(Class287.method5562(class287_8_),
				     -f_12_ - f_15_));
	    class287s[1] = Class287.method5560();
	    class287s[1].method5655(class287);
	    class287s[1].method5574
		(Class287.method5591(Class287.method5562(class287_8_),
				     -f_12_ + f_15_));
	} else {
	    class287s[0] = Class287.method5560();
	    class287s[0].method5655(class287);
	    class287s[0].method5574
		(Class287.method5591(Class287.method5562(class287_8_),
				     -f_12_));
	    class287s[1] = null;
	}
    }
    
    Class290() throws Throwable {
	throw new Error();
    }
    
    public static void method5664(Class287 class287, Class287 class287_16_,
				  Class287 class287_17_, float f,
				  Class287[] class287s) {
	Class287 class287_18_ = Class287.method5578(class287, class287_17_);
	float f_19_ = Class287.method5580(class287_18_, class287_18_) - f * f;
	float f_20_ = Class287.method5580(class287_16_, class287_18_);
	float f_21_ = f_20_ * f_20_ - f_19_;
	if (f_21_ < 0.0F) {
	    Class287[] class287s_22_ = class287s;
	    class287s[1] = null;
	    class287s_22_[0] = null;
	} else if (f_21_ >= 9.765625E-4F) {
	    float f_23_ = (float) Math.sqrt((double) f_21_);
	    class287s[0] = Class287.method5560();
	    class287s[0].method5655(class287);
	    class287s[0].method5574
		(Class287.method5591(Class287.method5562(class287_16_),
				     -f_20_ - f_23_));
	    class287s[1] = Class287.method5560();
	    class287s[1].method5655(class287);
	    class287s[1].method5574
		(Class287.method5591(Class287.method5562(class287_16_),
				     -f_20_ + f_23_));
	} else {
	    class287s[0] = Class287.method5560();
	    class287s[0].method5655(class287);
	    class287s[0].method5574
		(Class287.method5591(Class287.method5562(class287_16_),
				     -f_20_));
	    class287s[1] = null;
	}
    }
}
