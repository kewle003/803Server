/* Class266 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class266
{
    float aFloat4334;
    float aFloat4335;
    float aFloat4336;
    float aFloat4337;
    float aFloat4338;
    float aFloat4339;
    float aFloat4340;
    float aFloat4341;
    public static Class266 aClass266_4342 = new Class266();
    float aFloat4343;
    float aFloat4344;
    float aFloat4345;
    float aFloat4346;
    
    public void method5115(Class266 class266_0_) {
	if (class266_0_ == this)
	    method5124();
	else {
	    ((Class266) this).aFloat4335 = ((Class266) class266_0_).aFloat4335;
	    ((Class266) this).aFloat4343 = ((Class266) class266_0_).aFloat4336;
	    ((Class266) this).aFloat4341 = ((Class266) class266_0_).aFloat4344;
	    ((Class266) this).aFloat4336 = ((Class266) class266_0_).aFloat4343;
	    ((Class266) this).aFloat4339 = ((Class266) class266_0_).aFloat4339;
	    ((Class266) this).aFloat4338 = ((Class266) class266_0_).aFloat4340;
	    ((Class266) this).aFloat4344 = ((Class266) class266_0_).aFloat4341;
	    ((Class266) this).aFloat4340 = ((Class266) class266_0_).aFloat4338;
	    ((Class266) this).aFloat4337 = ((Class266) class266_0_).aFloat4337;
	    ((Class266) this).aFloat4334
		= -((((Class266) class266_0_).aFloat4334
		     * ((Class266) this).aFloat4335)
		    + (((Class266) class266_0_).aFloat4345
		       * ((Class266) this).aFloat4343)
		    + (((Class266) class266_0_).aFloat4346
		       * ((Class266) this).aFloat4341));
	    ((Class266) this).aFloat4345
		= -((((Class266) class266_0_).aFloat4334
		     * ((Class266) this).aFloat4336)
		    + (((Class266) class266_0_).aFloat4345
		       * ((Class266) this).aFloat4339)
		    + (((Class266) class266_0_).aFloat4346
		       * ((Class266) this).aFloat4338));
	    ((Class266) this).aFloat4346
		= -((((Class266) class266_0_).aFloat4334
		     * ((Class266) this).aFloat4344)
		    + (((Class266) class266_0_).aFloat4345
		       * ((Class266) this).aFloat4340)
		    + (((Class266) class266_0_).aFloat4346
		       * ((Class266) this).aFloat4337));
	}
    }
    
    public Class266(Class266 class266_1_) {
	method5175(class266_1_);
    }
    
    public void method5116(Class266 class266_2_) {
	if (class266_2_ == this)
	    method5124();
	else {
	    ((Class266) this).aFloat4335 = ((Class266) class266_2_).aFloat4335;
	    ((Class266) this).aFloat4343 = ((Class266) class266_2_).aFloat4336;
	    ((Class266) this).aFloat4341 = ((Class266) class266_2_).aFloat4344;
	    ((Class266) this).aFloat4336 = ((Class266) class266_2_).aFloat4343;
	    ((Class266) this).aFloat4339 = ((Class266) class266_2_).aFloat4339;
	    ((Class266) this).aFloat4338 = ((Class266) class266_2_).aFloat4340;
	    ((Class266) this).aFloat4344 = ((Class266) class266_2_).aFloat4341;
	    ((Class266) this).aFloat4340 = ((Class266) class266_2_).aFloat4338;
	    ((Class266) this).aFloat4337 = ((Class266) class266_2_).aFloat4337;
	    ((Class266) this).aFloat4334
		= -((((Class266) class266_2_).aFloat4334
		     * ((Class266) this).aFloat4335)
		    + (((Class266) class266_2_).aFloat4345
		       * ((Class266) this).aFloat4343)
		    + (((Class266) class266_2_).aFloat4346
		       * ((Class266) this).aFloat4341));
	    ((Class266) this).aFloat4345
		= -((((Class266) class266_2_).aFloat4334
		     * ((Class266) this).aFloat4336)
		    + (((Class266) class266_2_).aFloat4345
		       * ((Class266) this).aFloat4339)
		    + (((Class266) class266_2_).aFloat4346
		       * ((Class266) this).aFloat4338));
	    ((Class266) this).aFloat4346
		= -((((Class266) class266_2_).aFloat4334
		     * ((Class266) this).aFloat4344)
		    + (((Class266) class266_2_).aFloat4345
		       * ((Class266) this).aFloat4340)
		    + (((Class266) class266_2_).aFloat4346
		       * ((Class266) this).aFloat4337));
	}
    }
    
    public void method5117(double d, double d_3_, double d_4_, double d_5_,
			   double d_6_, double d_7_, float f, float f_8_,
			   float f_9_) {
	float f_10_ = (float) (d_5_ - d);
	float f_11_ = (float) (d_6_ - d_3_);
	float f_12_ = (float) (d_7_ - d_4_);
	float f_13_ = f_8_ * f_12_ - f_9_ * f_11_;
	float f_14_ = f_9_ * f_10_ - f * f_12_;
	float f_15_ = f * f_11_ - f_8_ * f_10_;
	float f_16_
	    = (float) (1.0 / Math.sqrt((double) (f_13_ * f_13_ + f_14_ * f_14_
						 + f_15_ * f_15_)));
	float f_17_
	    = (float) (1.0 / Math.sqrt((double) (f_10_ * f_10_ + f_11_ * f_11_
						 + f_12_ * f_12_)));
	((Class266) this).aFloat4335 = f_13_ * f_16_;
	((Class266) this).aFloat4343 = f_14_ * f_16_;
	((Class266) this).aFloat4341 = f_15_ * f_16_;
	((Class266) this).aFloat4344 = f_10_ * f_17_;
	((Class266) this).aFloat4340 = f_11_ * f_17_;
	((Class266) this).aFloat4337 = f_12_ * f_17_;
	((Class266) this).aFloat4336
	    = (((Class266) this).aFloat4340 * ((Class266) this).aFloat4341
	       - ((Class266) this).aFloat4337 * ((Class266) this).aFloat4343);
	((Class266) this).aFloat4339
	    = (((Class266) this).aFloat4337 * ((Class266) this).aFloat4335
	       - ((Class266) this).aFloat4344 * ((Class266) this).aFloat4341);
	((Class266) this).aFloat4338
	    = (((Class266) this).aFloat4344 * ((Class266) this).aFloat4343
	       - ((Class266) this).aFloat4340 * ((Class266) this).aFloat4335);
	((Class266) this).aFloat4334
	    = -(float) (d * (double) ((Class266) this).aFloat4335
			+ d_3_ * (double) ((Class266) this).aFloat4343
			+ d_4_ * (double) ((Class266) this).aFloat4341);
	((Class266) this).aFloat4345
	    = -(float) (d * (double) ((Class266) this).aFloat4336
			+ d_3_ * (double) ((Class266) this).aFloat4339
			+ d_4_ * (double) ((Class266) this).aFloat4338);
	((Class266) this).aFloat4346
	    = -(float) (d * (double) ((Class266) this).aFloat4344
			+ d_3_ * (double) ((Class266) this).aFloat4340
			+ d_4_ * (double) ((Class266) this).aFloat4337);
    }
    
    public void method5118(Class276 class276) {
	float f = (class276.aClass278_4385.aFloat4396
		   * class276.aClass278_4385.aFloat4396);
	float f_18_ = (class276.aClass278_4385.aFloat4396
		       * class276.aClass278_4385.aFloat4393);
	float f_19_ = (class276.aClass278_4385.aFloat4396
		       * class276.aClass278_4385.aFloat4390);
	float f_20_ = (class276.aClass278_4385.aFloat4396
		       * class276.aClass278_4385.aFloat4391);
	float f_21_ = (class276.aClass278_4385.aFloat4393
		       * class276.aClass278_4385.aFloat4393);
	float f_22_ = (class276.aClass278_4385.aFloat4393
		       * class276.aClass278_4385.aFloat4390);
	float f_23_ = (class276.aClass278_4385.aFloat4393
		       * class276.aClass278_4385.aFloat4391);
	float f_24_ = (class276.aClass278_4385.aFloat4390
		       * class276.aClass278_4385.aFloat4390);
	float f_25_ = (class276.aClass278_4385.aFloat4390
		       * class276.aClass278_4385.aFloat4391);
	float f_26_ = (class276.aClass278_4385.aFloat4391
		       * class276.aClass278_4385.aFloat4391);
	((Class266) this).aFloat4335 = f_21_ + f - f_26_ - f_24_;
	((Class266) this).aFloat4336 = f_22_ + f_20_ + f_22_ + f_20_;
	((Class266) this).aFloat4344 = f_23_ - f_19_ - f_19_ + f_23_;
	((Class266) this).aFloat4343 = f_22_ - f_20_ - f_20_ + f_22_;
	((Class266) this).aFloat4339 = f_24_ + f - f_21_ - f_26_;
	((Class266) this).aFloat4340 = f_25_ + f_18_ + f_25_ + f_18_;
	((Class266) this).aFloat4341 = f_23_ + f_19_ + f_23_ + f_19_;
	((Class266) this).aFloat4338 = f_25_ - f_18_ - f_18_ + f_25_;
	((Class266) this).aFloat4337 = f_26_ + f - f_24_ - f_21_;
	((Class266) this).aFloat4334 = class276.aClass287_4386.aFloat4477;
	((Class266) this).aFloat4345 = class276.aClass287_4386.aFloat4474;
	((Class266) this).aFloat4346 = class276.aClass287_4386.aFloat4479;
    }
    
    public void method5119(float f, float f_27_, float f_28_, float[] fs) {
	fs[0] = (((Class266) this).aFloat4335 * f
		 + ((Class266) this).aFloat4343 * f_27_
		 + ((Class266) this).aFloat4341 * f_28_
		 + ((Class266) this).aFloat4334);
	fs[1] = (((Class266) this).aFloat4336 * f
		 + ((Class266) this).aFloat4339 * f_27_
		 + ((Class266) this).aFloat4338 * f_28_
		 + ((Class266) this).aFloat4345);
	fs[2] = (((Class266) this).aFloat4344 * f
		 + ((Class266) this).aFloat4340 * f_27_
		 + ((Class266) this).aFloat4337 * f_28_
		 + ((Class266) this).aFloat4346);
    }
    
    public void method5120(float f, float f_29_, float f_30_) {
	((Class266) this).aFloat4335 = f;
	((Class266) this).aFloat4343 = 0.0F;
	((Class266) this).aFloat4341 = 0.0F;
	((Class266) this).aFloat4334 = 0.0F;
	((Class266) this).aFloat4336 = 0.0F;
	((Class266) this).aFloat4339 = f_29_;
	((Class266) this).aFloat4338 = 0.0F;
	((Class266) this).aFloat4345 = 0.0F;
	((Class266) this).aFloat4344 = 0.0F;
	((Class266) this).aFloat4340 = 0.0F;
	((Class266) this).aFloat4337 = f_30_;
	((Class266) this).aFloat4346 = 0.0F;
    }
    
    public void method5121(int i, int i_31_, int i_32_, float f, float f_33_,
			   float f_34_) {
	if (i != 0) {
	    float f_35_ = Class269.aFloatArray4355[i & 0x3fff];
	    float f_36_ = Class269.aFloatArray4356[i & 0x3fff];
	    ((Class266) this).aFloat4337 = 1.0F;
	    ((Class266) this).aFloat4338 = 0.0F;
	    ((Class266) this).aFloat4341 = 0.0F;
	    ((Class266) this).aFloat4340 = 0.0F;
	    ((Class266) this).aFloat4344 = 0.0F;
	    ((Class266) this).aFloat4335 = 2.0F * f_35_ * (float) i_31_;
	    ((Class266) this).aFloat4339 = 2.0F * f_35_ * (float) i_32_;
	    ((Class266) this).aFloat4336 = 2.0F * f_36_ * (float) i_31_;
	    ((Class266) this).aFloat4343 = -2.0F * f_36_ * (float) i_32_;
	    ((Class266) this).aFloat4334
		= (float) (2 * i_31_) * (0.5F * f_36_ - 0.5F * f_35_) + f;
	    ((Class266) this).aFloat4345
		= (float) (2 * i_32_) * (-0.5F * f_36_ - 0.5F * f_35_) + f_33_;
	    ((Class266) this).aFloat4346 = f_34_;
	} else {
	    ((Class266) this).aFloat4338 = 0.0F;
	    ((Class266) this).aFloat4341 = 0.0F;
	    ((Class266) this).aFloat4340 = 0.0F;
	    ((Class266) this).aFloat4343 = 0.0F;
	    ((Class266) this).aFloat4344 = 0.0F;
	    ((Class266) this).aFloat4336 = 0.0F;
	    ((Class266) this).aFloat4335 = (float) (2 * i_31_);
	    ((Class266) this).aFloat4339 = (float) (2 * i_32_);
	    ((Class266) this).aFloat4337 = 1.0F;
	    ((Class266) this).aFloat4334 = f - (float) i_31_;
	    ((Class266) this).aFloat4345 = f_33_ - (float) i_32_;
	    ((Class266) this).aFloat4346 = f_34_;
	}
    }
    
    public void method5122(float f, float f_37_, float f_38_, float f_39_,
			   float f_40_, float f_41_, float f_42_, float f_43_,
			   float f_44_) {
	((Class266) this).aFloat4335 = f;
	((Class266) this).aFloat4343 = f_39_;
	((Class266) this).aFloat4341 = f_42_;
	((Class266) this).aFloat4334 = 0.0F;
	((Class266) this).aFloat4336 = f_37_;
	((Class266) this).aFloat4339 = f_40_;
	((Class266) this).aFloat4338 = f_43_;
	((Class266) this).aFloat4345 = 0.0F;
	((Class266) this).aFloat4344 = f_38_;
	((Class266) this).aFloat4340 = f_41_;
	((Class266) this).aFloat4337 = f_44_;
	((Class266) this).aFloat4346 = 0.0F;
    }
    
    public void method5123(float f, float f_45_, float f_46_) {
	((Class266) this).aFloat4334 += f;
	((Class266) this).aFloat4345 += f_45_;
	((Class266) this).aFloat4346 += f_46_;
    }
    
    public void method5124() {
	float f = ((Class266) this).aFloat4334;
	float f_47_ = ((Class266) this).aFloat4345;
	float f_48_ = ((Class266) this).aFloat4343;
	((Class266) this).aFloat4343 = ((Class266) this).aFloat4336;
	((Class266) this).aFloat4336 = f_48_;
	float f_49_ = ((Class266) this).aFloat4341;
	((Class266) this).aFloat4341 = ((Class266) this).aFloat4344;
	((Class266) this).aFloat4344 = f_49_;
	float f_50_ = ((Class266) this).aFloat4338;
	((Class266) this).aFloat4338 = ((Class266) this).aFloat4340;
	((Class266) this).aFloat4340 = f_50_;
	((Class266) this).aFloat4334
	    = -(f * ((Class266) this).aFloat4335
		+ f_47_ * ((Class266) this).aFloat4343
		+ ((Class266) this).aFloat4346 * ((Class266) this).aFloat4341);
	((Class266) this).aFloat4345
	    = -(f * ((Class266) this).aFloat4336
		+ f_47_ * ((Class266) this).aFloat4339
		+ ((Class266) this).aFloat4346 * ((Class266) this).aFloat4338);
	((Class266) this).aFloat4346
	    = -(f * ((Class266) this).aFloat4344
		+ f_47_ * ((Class266) this).aFloat4340
		+ ((Class266) this).aFloat4346 * ((Class266) this).aFloat4337);
    }
    
    public void method5125(float f, float f_51_, float f_52_, float f_53_) {
	float f_54_ = (float) Math.cos((double) f_53_);
	float f_55_ = (float) Math.sin((double) f_53_);
	((Class266) this).aFloat4335 = f_54_ + f * f * (1.0F - f_54_);
	((Class266) this).aFloat4336
	    = f_52_ * f_55_ + f_51_ * f * (1.0F - f_54_);
	((Class266) this).aFloat4344
	    = -f_51_ * f_55_ + f_52_ * f * (1.0F - f_54_);
	((Class266) this).aFloat4343
	    = -f_52_ * f_55_ + f * f_51_ * (1.0F - f_54_);
	((Class266) this).aFloat4339 = f_54_ + f_51_ * f_51_ * (1.0F - f_54_);
	((Class266) this).aFloat4340
	    = f * f_55_ + f_52_ * f_51_ * (1.0F - f_54_);
	((Class266) this).aFloat4341
	    = f_51_ * f_55_ + f * f_52_ * (1.0F - f_54_);
	((Class266) this).aFloat4338
	    = -f * f_55_ + f_51_ * f_52_ * (1.0F - f_54_);
	((Class266) this).aFloat4337 = f_54_ + f_52_ * f_52_ * (1.0F - f_54_);
	((Class266) this).aFloat4346 = 0.0F;
	((Class266) this).aFloat4345 = 0.0F;
	((Class266) this).aFloat4334 = 0.0F;
    }
    
    public void method5126(Class278 class278) {
	method5158(class278.aFloat4393, class278.aFloat4390,
		   class278.aFloat4391, class278.aFloat4396);
    }
    
    public void method5127(float[] fs) {
	float f = fs[0] - ((Class266) this).aFloat4334;
	float f_56_ = fs[1] - ((Class266) this).aFloat4345;
	float f_57_ = fs[2] - ((Class266) this).aFloat4346;
	fs[0] = (float) (int) (((Class266) this).aFloat4335 * f
			       + ((Class266) this).aFloat4336 * f_56_
			       + ((Class266) this).aFloat4344 * f_57_);
	fs[1] = (float) (int) (((Class266) this).aFloat4343 * f
			       + ((Class266) this).aFloat4339 * f_56_
			       + ((Class266) this).aFloat4340 * f_57_);
	fs[2] = (float) (int) (((Class266) this).aFloat4341 * f
			       + ((Class266) this).aFloat4338 * f_56_
			       + ((Class266) this).aFloat4337 * f_57_);
    }
    
    public void method5128(float f, float f_58_, float f_59_, float f_60_) {
	float f_61_ = (float) Math.cos((double) f_60_);
	float f_62_ = (float) Math.sin((double) f_60_);
	float f_63_ = f_61_ + f * f * (1.0F - f_61_);
	float f_64_ = f_59_ * f_62_ + f_58_ * f * (1.0F - f_61_);
	float f_65_ = -f_58_ * f_62_ + f_59_ * f * (1.0F - f_61_);
	float f_66_ = -f_59_ * f_62_ + f * f_58_ * (1.0F - f_61_);
	float f_67_ = f_61_ + f_58_ * f_58_ * (1.0F - f_61_);
	float f_68_ = f * f_62_ + f_59_ * f_58_ * (1.0F - f_61_);
	float f_69_ = f_58_ * f_62_ + f * f_59_ * (1.0F - f_61_);
	float f_70_ = -f * f_62_ + f_58_ * f_59_ * (1.0F - f_61_);
	float f_71_ = f_61_ + f_59_ * f_59_ * (1.0F - f_61_);
	float f_72_ = ((Class266) this).aFloat4335;
	float f_73_ = ((Class266) this).aFloat4336;
	float f_74_ = ((Class266) this).aFloat4343;
	float f_75_ = ((Class266) this).aFloat4339;
	float f_76_ = ((Class266) this).aFloat4341;
	float f_77_ = ((Class266) this).aFloat4338;
	float f_78_ = ((Class266) this).aFloat4334;
	float f_79_ = ((Class266) this).aFloat4345;
	((Class266) this).aFloat4335
	    = (f_72_ * f_63_ + f_73_ * f_66_
	       + ((Class266) this).aFloat4344 * f_69_);
	((Class266) this).aFloat4336
	    = (f_72_ * f_64_ + f_73_ * f_67_
	       + ((Class266) this).aFloat4344 * f_70_);
	((Class266) this).aFloat4344
	    = (f_72_ * f_65_ + f_73_ * f_68_
	       + ((Class266) this).aFloat4344 * f_71_);
	((Class266) this).aFloat4343
	    = (f_74_ * f_63_ + f_75_ * f_66_
	       + ((Class266) this).aFloat4340 * f_69_);
	((Class266) this).aFloat4339
	    = (f_74_ * f_64_ + f_75_ * f_67_
	       + ((Class266) this).aFloat4340 * f_70_);
	((Class266) this).aFloat4340
	    = (f_74_ * f_65_ + f_75_ * f_68_
	       + ((Class266) this).aFloat4340 * f_71_);
	((Class266) this).aFloat4341
	    = (f_76_ * f_63_ + f_77_ * f_66_
	       + ((Class266) this).aFloat4337 * f_69_);
	((Class266) this).aFloat4338
	    = (f_76_ * f_64_ + f_77_ * f_67_
	       + ((Class266) this).aFloat4337 * f_70_);
	((Class266) this).aFloat4337
	    = (f_76_ * f_65_ + f_77_ * f_68_
	       + ((Class266) this).aFloat4337 * f_71_);
	((Class266) this).aFloat4334
	    = (f_78_ * f_63_ + f_79_ * f_66_
	       + ((Class266) this).aFloat4346 * f_69_);
	((Class266) this).aFloat4345
	    = (f_78_ * f_64_ + f_79_ * f_67_
	       + ((Class266) this).aFloat4346 * f_70_);
	((Class266) this).aFloat4346
	    = (f_78_ * f_65_ + f_79_ * f_68_
	       + ((Class266) this).aFloat4346 * f_71_);
    }
    
    public void method5129(float f, float f_80_, float f_81_) {
	((Class266) this).aFloat4334 += f;
	((Class266) this).aFloat4345 += f_80_;
	((Class266) this).aFloat4346 += f_81_;
    }
    
    public void method5130(float f, float f_82_, float f_83_) {
	((Class266) this).aFloat4335 *= f;
	((Class266) this).aFloat4343 *= f;
	((Class266) this).aFloat4341 *= f;
	((Class266) this).aFloat4334 *= f;
	((Class266) this).aFloat4336 *= f_82_;
	((Class266) this).aFloat4339 *= f_82_;
	((Class266) this).aFloat4338 *= f_82_;
	((Class266) this).aFloat4345 *= f_82_;
	((Class266) this).aFloat4344 *= f_83_;
	((Class266) this).aFloat4340 *= f_83_;
	((Class266) this).aFloat4337 *= f_83_;
	((Class266) this).aFloat4346 *= f_83_;
    }
    
    public void method5131(float f, float f_84_, float f_85_) {
	((Class266) this).aFloat4338 = 0.0F;
	((Class266) this).aFloat4341 = 0.0F;
	((Class266) this).aFloat4340 = 0.0F;
	((Class266) this).aFloat4343 = 0.0F;
	((Class266) this).aFloat4344 = 0.0F;
	((Class266) this).aFloat4336 = 0.0F;
	((Class266) this).aFloat4337 = 1.0F;
	((Class266) this).aFloat4339 = 1.0F;
	((Class266) this).aFloat4335 = 1.0F;
	((Class266) this).aFloat4334 = f;
	((Class266) this).aFloat4345 = f_84_;
	((Class266) this).aFloat4346 = f_85_;
    }
    
    public void method5132(Class287 class287) {
	method5133(class287.aFloat4477, class287.aFloat4474,
		   class287.aFloat4479);
    }
    
    public void method5133(float f, float f_86_, float f_87_) {
	((Class266) this).aFloat4334 += f;
	((Class266) this).aFloat4345 += f_86_;
	((Class266) this).aFloat4346 += f_87_;
    }
    
    public void method5134(Class266 class266_88_) {
	float f = ((Class266) this).aFloat4335;
	float f_89_ = ((Class266) this).aFloat4336;
	float f_90_ = ((Class266) this).aFloat4343;
	float f_91_ = ((Class266) this).aFloat4339;
	float f_92_ = ((Class266) this).aFloat4341;
	float f_93_ = ((Class266) this).aFloat4338;
	float f_94_ = ((Class266) this).aFloat4334;
	float f_95_ = ((Class266) this).aFloat4345;
	float f_96_ = ((Class266) this).aFloat4344;
	float f_97_ = ((Class266) this).aFloat4340;
	float f_98_ = ((Class266) this).aFloat4337;
	float f_99_ = ((Class266) this).aFloat4346;
	((Class266) this).aFloat4335
	    = (f * ((Class266) class266_88_).aFloat4335
	       + f_89_ * ((Class266) class266_88_).aFloat4343
	       + f_96_ * ((Class266) class266_88_).aFloat4341);
	((Class266) this).aFloat4336
	    = (f * ((Class266) class266_88_).aFloat4336
	       + f_89_ * ((Class266) class266_88_).aFloat4339
	       + f_96_ * ((Class266) class266_88_).aFloat4338);
	((Class266) this).aFloat4344
	    = (f * ((Class266) class266_88_).aFloat4344
	       + f_89_ * ((Class266) class266_88_).aFloat4340
	       + f_96_ * ((Class266) class266_88_).aFloat4337);
	((Class266) this).aFloat4343
	    = (f_90_ * ((Class266) class266_88_).aFloat4335
	       + f_91_ * ((Class266) class266_88_).aFloat4343
	       + f_97_ * ((Class266) class266_88_).aFloat4341);
	((Class266) this).aFloat4339
	    = (f_90_ * ((Class266) class266_88_).aFloat4336
	       + f_91_ * ((Class266) class266_88_).aFloat4339
	       + f_97_ * ((Class266) class266_88_).aFloat4338);
	((Class266) this).aFloat4340
	    = (f_90_ * ((Class266) class266_88_).aFloat4344
	       + f_91_ * ((Class266) class266_88_).aFloat4340
	       + f_97_ * ((Class266) class266_88_).aFloat4337);
	((Class266) this).aFloat4341
	    = (f_92_ * ((Class266) class266_88_).aFloat4335
	       + f_93_ * ((Class266) class266_88_).aFloat4343
	       + f_98_ * ((Class266) class266_88_).aFloat4341);
	((Class266) this).aFloat4338
	    = (f_92_ * ((Class266) class266_88_).aFloat4336
	       + f_93_ * ((Class266) class266_88_).aFloat4339
	       + f_98_ * ((Class266) class266_88_).aFloat4338);
	((Class266) this).aFloat4337
	    = (f_92_ * ((Class266) class266_88_).aFloat4344
	       + f_93_ * ((Class266) class266_88_).aFloat4340
	       + f_98_ * ((Class266) class266_88_).aFloat4337);
	((Class266) this).aFloat4334
	    = (f_94_ * ((Class266) class266_88_).aFloat4335
	       + f_95_ * ((Class266) class266_88_).aFloat4343
	       + f_99_ * ((Class266) class266_88_).aFloat4341
	       + ((Class266) class266_88_).aFloat4334);
	((Class266) this).aFloat4345
	    = (f_94_ * ((Class266) class266_88_).aFloat4336
	       + f_95_ * ((Class266) class266_88_).aFloat4339
	       + f_99_ * ((Class266) class266_88_).aFloat4338
	       + ((Class266) class266_88_).aFloat4345);
	((Class266) this).aFloat4346
	    = (f_94_ * ((Class266) class266_88_).aFloat4344
	       + f_95_ * ((Class266) class266_88_).aFloat4340
	       + f_99_ * ((Class266) class266_88_).aFloat4337
	       + ((Class266) class266_88_).aFloat4346);
    }
    
    public void method5135(Class266 class266_100_, Class266 class266_101_) {
	((Class266) this).aFloat4335
	    = ((((Class266) class266_100_).aFloat4335
		* ((Class266) class266_101_).aFloat4335)
	       + (((Class266) class266_100_).aFloat4336
		  * ((Class266) class266_101_).aFloat4343)
	       + (((Class266) class266_100_).aFloat4344
		  * ((Class266) class266_101_).aFloat4341));
	((Class266) this).aFloat4336
	    = ((((Class266) class266_100_).aFloat4335
		* ((Class266) class266_101_).aFloat4336)
	       + (((Class266) class266_100_).aFloat4336
		  * ((Class266) class266_101_).aFloat4339)
	       + (((Class266) class266_100_).aFloat4344
		  * ((Class266) class266_101_).aFloat4338));
	((Class266) this).aFloat4344
	    = ((((Class266) class266_100_).aFloat4335
		* ((Class266) class266_101_).aFloat4344)
	       + (((Class266) class266_100_).aFloat4336
		  * ((Class266) class266_101_).aFloat4340)
	       + (((Class266) class266_100_).aFloat4344
		  * ((Class266) class266_101_).aFloat4337));
	((Class266) this).aFloat4343
	    = ((((Class266) class266_100_).aFloat4343
		* ((Class266) class266_101_).aFloat4335)
	       + (((Class266) class266_100_).aFloat4339
		  * ((Class266) class266_101_).aFloat4343)
	       + (((Class266) class266_100_).aFloat4340
		  * ((Class266) class266_101_).aFloat4341));
	((Class266) this).aFloat4339
	    = ((((Class266) class266_100_).aFloat4343
		* ((Class266) class266_101_).aFloat4336)
	       + (((Class266) class266_100_).aFloat4339
		  * ((Class266) class266_101_).aFloat4339)
	       + (((Class266) class266_100_).aFloat4340
		  * ((Class266) class266_101_).aFloat4338));
	((Class266) this).aFloat4340
	    = ((((Class266) class266_100_).aFloat4343
		* ((Class266) class266_101_).aFloat4344)
	       + (((Class266) class266_100_).aFloat4339
		  * ((Class266) class266_101_).aFloat4340)
	       + (((Class266) class266_100_).aFloat4340
		  * ((Class266) class266_101_).aFloat4337));
	((Class266) this).aFloat4341
	    = ((((Class266) class266_100_).aFloat4341
		* ((Class266) class266_101_).aFloat4335)
	       + (((Class266) class266_100_).aFloat4338
		  * ((Class266) class266_101_).aFloat4343)
	       + (((Class266) class266_100_).aFloat4337
		  * ((Class266) class266_101_).aFloat4341));
	((Class266) this).aFloat4338
	    = ((((Class266) class266_100_).aFloat4341
		* ((Class266) class266_101_).aFloat4336)
	       + (((Class266) class266_100_).aFloat4338
		  * ((Class266) class266_101_).aFloat4339)
	       + (((Class266) class266_100_).aFloat4337
		  * ((Class266) class266_101_).aFloat4338));
	((Class266) this).aFloat4337
	    = ((((Class266) class266_100_).aFloat4341
		* ((Class266) class266_101_).aFloat4344)
	       + (((Class266) class266_100_).aFloat4338
		  * ((Class266) class266_101_).aFloat4340)
	       + (((Class266) class266_100_).aFloat4337
		  * ((Class266) class266_101_).aFloat4337));
	((Class266) this).aFloat4334
	    = ((((Class266) class266_100_).aFloat4334
		* ((Class266) class266_101_).aFloat4335)
	       + (((Class266) class266_100_).aFloat4345
		  * ((Class266) class266_101_).aFloat4343)
	       + (((Class266) class266_100_).aFloat4346
		  * ((Class266) class266_101_).aFloat4341)
	       + ((Class266) class266_101_).aFloat4334);
	((Class266) this).aFloat4345
	    = ((((Class266) class266_100_).aFloat4334
		* ((Class266) class266_101_).aFloat4336)
	       + (((Class266) class266_100_).aFloat4345
		  * ((Class266) class266_101_).aFloat4339)
	       + (((Class266) class266_100_).aFloat4346
		  * ((Class266) class266_101_).aFloat4338)
	       + ((Class266) class266_101_).aFloat4345);
	((Class266) this).aFloat4346
	    = ((((Class266) class266_100_).aFloat4334
		* ((Class266) class266_101_).aFloat4344)
	       + (((Class266) class266_100_).aFloat4345
		  * ((Class266) class266_101_).aFloat4340)
	       + (((Class266) class266_100_).aFloat4346
		  * ((Class266) class266_101_).aFloat4337)
	       + ((Class266) class266_101_).aFloat4346);
    }
    
    public void method5136(Class276 class276) {
	method5126(class276.aClass278_4385);
	method5132(class276.aClass287_4386);
    }
    
    public void method5137(float f, float f_102_, float f_103_) {
	((Class266) this).aFloat4338 = 0.0F;
	((Class266) this).aFloat4341 = 0.0F;
	((Class266) this).aFloat4340 = 0.0F;
	((Class266) this).aFloat4343 = 0.0F;
	((Class266) this).aFloat4344 = 0.0F;
	((Class266) this).aFloat4336 = 0.0F;
	((Class266) this).aFloat4337 = 1.0F;
	((Class266) this).aFloat4339 = 1.0F;
	((Class266) this).aFloat4335 = 1.0F;
	((Class266) this).aFloat4334 = f;
	((Class266) this).aFloat4345 = f_102_;
	((Class266) this).aFloat4346 = f_103_;
    }
    
    public void method5138(float[] fs) {
	float f = fs[0] - ((Class266) this).aFloat4334;
	float f_104_ = fs[1] - ((Class266) this).aFloat4345;
	float f_105_ = fs[2] - ((Class266) this).aFloat4346;
	fs[0] = (float) (int) (((Class266) this).aFloat4335 * f
			       + ((Class266) this).aFloat4336 * f_104_
			       + ((Class266) this).aFloat4344 * f_105_);
	fs[1] = (float) (int) (((Class266) this).aFloat4343 * f
			       + ((Class266) this).aFloat4339 * f_104_
			       + ((Class266) this).aFloat4340 * f_105_);
	fs[2] = (float) (int) (((Class266) this).aFloat4341 * f
			       + ((Class266) this).aFloat4338 * f_104_
			       + ((Class266) this).aFloat4337 * f_105_);
    }
    
    public void method5139(float f, float f_106_, float f_107_) {
	((Class266) this).aFloat4335 *= f;
	((Class266) this).aFloat4343 *= f;
	((Class266) this).aFloat4341 *= f;
	((Class266) this).aFloat4334 *= f;
	((Class266) this).aFloat4336 *= f_106_;
	((Class266) this).aFloat4339 *= f_106_;
	((Class266) this).aFloat4338 *= f_106_;
	((Class266) this).aFloat4345 *= f_106_;
	((Class266) this).aFloat4344 *= f_107_;
	((Class266) this).aFloat4340 *= f_107_;
	((Class266) this).aFloat4337 *= f_107_;
	((Class266) this).aFloat4346 *= f_107_;
    }
    
    public float[] method5140(float[] fs) {
	fs[0] = ((Class266) this).aFloat4334;
	fs[1] = ((Class266) this).aFloat4345;
	fs[2] = ((Class266) this).aFloat4346;
	return fs;
    }
    
    public String toString() {
	return new StringBuilder().append(((Class266) this).aFloat4335).append
		   (",").append
		   (((Class266) this).aFloat4343).append
		   (",").append
		   (((Class266) this).aFloat4341).append
		   (",").append
		   (((Class266) this).aFloat4334).append
		   (" - ").append
		   (((Class266) this).aFloat4336).append
		   (",").append
		   (((Class266) this).aFloat4339).append
		   (",").append
		   (((Class266) this).aFloat4338).append
		   (",").append
		   (((Class266) this).aFloat4345).append
		   (" - ").append
		   (((Class266) this).aFloat4344).append
		   (",").append
		   (((Class266) this).aFloat4340).append
		   (",").append
		   (((Class266) this).aFloat4337).append
		   (",").append
		   (((Class266) this).aFloat4346).toString();
    }
    
    public String method5141() {
	return new StringBuilder().append(((Class266) this).aFloat4335).append
		   (",").append
		   (((Class266) this).aFloat4343).append
		   (",").append
		   (((Class266) this).aFloat4341).append
		   (",").append
		   (((Class266) this).aFloat4334).append
		   (" - ").append
		   (((Class266) this).aFloat4336).append
		   (",").append
		   (((Class266) this).aFloat4339).append
		   (",").append
		   (((Class266) this).aFloat4338).append
		   (",").append
		   (((Class266) this).aFloat4345).append
		   (" - ").append
		   (((Class266) this).aFloat4344).append
		   (",").append
		   (((Class266) this).aFloat4340).append
		   (",").append
		   (((Class266) this).aFloat4337).append
		   (",").append
		   (((Class266) this).aFloat4346).toString();
    }
    
    public String method5142() {
	return new StringBuilder().append(((Class266) this).aFloat4335).append
		   (",").append
		   (((Class266) this).aFloat4343).append
		   (",").append
		   (((Class266) this).aFloat4341).append
		   (",").append
		   (((Class266) this).aFloat4334).append
		   (" - ").append
		   (((Class266) this).aFloat4336).append
		   (",").append
		   (((Class266) this).aFloat4339).append
		   (",").append
		   (((Class266) this).aFloat4338).append
		   (",").append
		   (((Class266) this).aFloat4345).append
		   (" - ").append
		   (((Class266) this).aFloat4344).append
		   (",").append
		   (((Class266) this).aFloat4340).append
		   (",").append
		   (((Class266) this).aFloat4337).append
		   (",").append
		   (((Class266) this).aFloat4346).toString();
    }
    
    public String method5143() {
	return new StringBuilder().append(((Class266) this).aFloat4335).append
		   (",").append
		   (((Class266) this).aFloat4343).append
		   (",").append
		   (((Class266) this).aFloat4341).append
		   (",").append
		   (((Class266) this).aFloat4334).append
		   (" - ").append
		   (((Class266) this).aFloat4336).append
		   (",").append
		   (((Class266) this).aFloat4339).append
		   (",").append
		   (((Class266) this).aFloat4338).append
		   (",").append
		   (((Class266) this).aFloat4345).append
		   (" - ").append
		   (((Class266) this).aFloat4344).append
		   (",").append
		   (((Class266) this).aFloat4340).append
		   (",").append
		   (((Class266) this).aFloat4337).append
		   (",").append
		   (((Class266) this).aFloat4346).toString();
    }
    
    void method5144(float f, float f_108_, float f_109_, float f_110_) {
	float f_111_ = f * f;
	float f_112_ = f * f_108_;
	float f_113_ = f * f_109_;
	float f_114_ = f * f_110_;
	float f_115_ = f_108_ * f_108_;
	float f_116_ = f_108_ * f_109_;
	float f_117_ = f_108_ * f_110_;
	float f_118_ = f_109_ * f_109_;
	float f_119_ = f_109_ * f_110_;
	((Class266) this).aFloat4335 = 1.0F - 2.0F * (f_115_ + f_118_);
	((Class266) this).aFloat4343 = 2.0F * (f_112_ - f_119_);
	((Class266) this).aFloat4341 = 2.0F * (f_113_ + f_117_);
	((Class266) this).aFloat4336 = 2.0F * (f_112_ + f_119_);
	((Class266) this).aFloat4339 = 1.0F - 2.0F * (f_111_ + f_118_);
	((Class266) this).aFloat4338 = 2.0F * (f_116_ - f_114_);
	((Class266) this).aFloat4344 = 2.0F * (f_113_ - f_117_);
	((Class266) this).aFloat4340 = 2.0F * (f_116_ + f_114_);
	((Class266) this).aFloat4337 = 1.0F - 2.0F * (f_111_ + f_115_);
	((Class266) this).aFloat4346 = 0.0F;
	((Class266) this).aFloat4345 = 0.0F;
	((Class266) this).aFloat4334 = 0.0F;
    }
    
    public void method5145(Class266 class266_120_) {
	((Class266) this).aFloat4335 = ((Class266) class266_120_).aFloat4335;
	((Class266) this).aFloat4343 = ((Class266) class266_120_).aFloat4343;
	((Class266) this).aFloat4341 = ((Class266) class266_120_).aFloat4341;
	((Class266) this).aFloat4334 = ((Class266) class266_120_).aFloat4334;
	((Class266) this).aFloat4336 = ((Class266) class266_120_).aFloat4336;
	((Class266) this).aFloat4339 = ((Class266) class266_120_).aFloat4339;
	((Class266) this).aFloat4338 = ((Class266) class266_120_).aFloat4338;
	((Class266) this).aFloat4345 = ((Class266) class266_120_).aFloat4345;
	((Class266) this).aFloat4344 = ((Class266) class266_120_).aFloat4344;
	((Class266) this).aFloat4340 = ((Class266) class266_120_).aFloat4340;
	((Class266) this).aFloat4337 = ((Class266) class266_120_).aFloat4337;
	((Class266) this).aFloat4346 = ((Class266) class266_120_).aFloat4346;
    }
    
    public void method5146(float[] fs) {
	float f = fs[0];
	float f_121_ = fs[1];
	float f_122_ = fs[2];
	fs[0] = (((Class266) this).aFloat4335 * f
		 + ((Class266) this).aFloat4336 * f_121_
		 + ((Class266) this).aFloat4344 * f_122_);
	fs[1] = (((Class266) this).aFloat4343 * f
		 + ((Class266) this).aFloat4339 * f_121_
		 + ((Class266) this).aFloat4340 * f_122_);
	fs[2] = (((Class266) this).aFloat4341 * f
		 + ((Class266) this).aFloat4338 * f_121_
		 + ((Class266) this).aFloat4337 * f_122_);
    }
    
    public void method5147(Class276 class276) {
	method5126(class276.aClass278_4385);
	method5132(class276.aClass287_4386);
    }
    
    public void method5148(Class276 class276) {
	method5126(class276.aClass278_4385);
	method5132(class276.aClass287_4386);
    }
    
    public void method5149() {
	((Class266) this).aFloat4346 = 0.0F;
	((Class266) this).aFloat4345 = 0.0F;
	((Class266) this).aFloat4334 = 0.0F;
	((Class266) this).aFloat4338 = 0.0F;
	((Class266) this).aFloat4341 = 0.0F;
	((Class266) this).aFloat4340 = 0.0F;
	((Class266) this).aFloat4343 = 0.0F;
	((Class266) this).aFloat4344 = 0.0F;
	((Class266) this).aFloat4336 = 0.0F;
	((Class266) this).aFloat4337 = 1.0F;
	((Class266) this).aFloat4339 = 1.0F;
	((Class266) this).aFloat4335 = 1.0F;
    }
    
    public void method5150(int i, int i_123_, int i_124_, float f,
			   float f_125_, float f_126_) {
	if (i != 0) {
	    float f_127_ = Class269.aFloatArray4355[i & 0x3fff];
	    float f_128_ = Class269.aFloatArray4356[i & 0x3fff];
	    ((Class266) this).aFloat4337 = 1.0F;
	    ((Class266) this).aFloat4338 = 0.0F;
	    ((Class266) this).aFloat4341 = 0.0F;
	    ((Class266) this).aFloat4340 = 0.0F;
	    ((Class266) this).aFloat4344 = 0.0F;
	    ((Class266) this).aFloat4335 = 2.0F * f_127_ * (float) i_123_;
	    ((Class266) this).aFloat4339 = 2.0F * f_127_ * (float) i_124_;
	    ((Class266) this).aFloat4336 = 2.0F * f_128_ * (float) i_123_;
	    ((Class266) this).aFloat4343 = -2.0F * f_128_ * (float) i_124_;
	    ((Class266) this).aFloat4334
		= (float) (2 * i_123_) * (0.5F * f_128_ - 0.5F * f_127_) + f;
	    ((Class266) this).aFloat4345
		= ((float) (2 * i_124_) * (-0.5F * f_128_ - 0.5F * f_127_)
		   + f_125_);
	    ((Class266) this).aFloat4346 = f_126_;
	} else {
	    ((Class266) this).aFloat4338 = 0.0F;
	    ((Class266) this).aFloat4341 = 0.0F;
	    ((Class266) this).aFloat4340 = 0.0F;
	    ((Class266) this).aFloat4343 = 0.0F;
	    ((Class266) this).aFloat4344 = 0.0F;
	    ((Class266) this).aFloat4336 = 0.0F;
	    ((Class266) this).aFloat4335 = (float) (2 * i_123_);
	    ((Class266) this).aFloat4339 = (float) (2 * i_124_);
	    ((Class266) this).aFloat4337 = 1.0F;
	    ((Class266) this).aFloat4334 = f - (float) i_123_;
	    ((Class266) this).aFloat4345 = f_125_ - (float) i_124_;
	    ((Class266) this).aFloat4346 = f_126_;
	}
    }
    
    public void method5151(float f, float f_129_, float f_130_, float f_131_,
			   float f_132_, float f_133_, float f_134_,
			   float f_135_, float f_136_) {
	((Class266) this).aFloat4335 = f;
	((Class266) this).aFloat4343 = f_131_;
	((Class266) this).aFloat4341 = f_134_;
	((Class266) this).aFloat4334 = 0.0F;
	((Class266) this).aFloat4336 = f_129_;
	((Class266) this).aFloat4339 = f_132_;
	((Class266) this).aFloat4338 = f_135_;
	((Class266) this).aFloat4345 = 0.0F;
	((Class266) this).aFloat4344 = f_130_;
	((Class266) this).aFloat4340 = f_133_;
	((Class266) this).aFloat4337 = f_136_;
	((Class266) this).aFloat4346 = 0.0F;
    }
    
    public void method5152() {
	((Class266) this).aFloat4346 = 0.0F;
	((Class266) this).aFloat4345 = 0.0F;
	((Class266) this).aFloat4334 = 0.0F;
	((Class266) this).aFloat4338 = 0.0F;
	((Class266) this).aFloat4341 = 0.0F;
	((Class266) this).aFloat4340 = 0.0F;
	((Class266) this).aFloat4343 = 0.0F;
	((Class266) this).aFloat4344 = 0.0F;
	((Class266) this).aFloat4336 = 0.0F;
	((Class266) this).aFloat4337 = 1.0F;
	((Class266) this).aFloat4339 = 1.0F;
	((Class266) this).aFloat4335 = 1.0F;
    }
    
    public void method5153(Class266 class266_137_) {
	if (class266_137_ == this)
	    method5124();
	else {
	    ((Class266) this).aFloat4335
		= ((Class266) class266_137_).aFloat4335;
	    ((Class266) this).aFloat4343
		= ((Class266) class266_137_).aFloat4336;
	    ((Class266) this).aFloat4341
		= ((Class266) class266_137_).aFloat4344;
	    ((Class266) this).aFloat4336
		= ((Class266) class266_137_).aFloat4343;
	    ((Class266) this).aFloat4339
		= ((Class266) class266_137_).aFloat4339;
	    ((Class266) this).aFloat4338
		= ((Class266) class266_137_).aFloat4340;
	    ((Class266) this).aFloat4344
		= ((Class266) class266_137_).aFloat4341;
	    ((Class266) this).aFloat4340
		= ((Class266) class266_137_).aFloat4338;
	    ((Class266) this).aFloat4337
		= ((Class266) class266_137_).aFloat4337;
	    ((Class266) this).aFloat4334
		= -((((Class266) class266_137_).aFloat4334
		     * ((Class266) this).aFloat4335)
		    + (((Class266) class266_137_).aFloat4345
		       * ((Class266) this).aFloat4343)
		    + (((Class266) class266_137_).aFloat4346
		       * ((Class266) this).aFloat4341));
	    ((Class266) this).aFloat4345
		= -((((Class266) class266_137_).aFloat4334
		     * ((Class266) this).aFloat4336)
		    + (((Class266) class266_137_).aFloat4345
		       * ((Class266) this).aFloat4339)
		    + (((Class266) class266_137_).aFloat4346
		       * ((Class266) this).aFloat4338));
	    ((Class266) this).aFloat4346
		= -((((Class266) class266_137_).aFloat4334
		     * ((Class266) this).aFloat4344)
		    + (((Class266) class266_137_).aFloat4345
		       * ((Class266) this).aFloat4340)
		    + (((Class266) class266_137_).aFloat4346
		       * ((Class266) this).aFloat4337));
	}
    }
    
    public void method5154(int i, int i_138_, int i_139_, float f,
			   float f_140_, float f_141_) {
	if (i != 0) {
	    float f_142_ = Class269.aFloatArray4355[i & 0x3fff];
	    float f_143_ = Class269.aFloatArray4356[i & 0x3fff];
	    ((Class266) this).aFloat4337 = 1.0F;
	    ((Class266) this).aFloat4338 = 0.0F;
	    ((Class266) this).aFloat4341 = 0.0F;
	    ((Class266) this).aFloat4340 = 0.0F;
	    ((Class266) this).aFloat4344 = 0.0F;
	    ((Class266) this).aFloat4335 = 2.0F * f_142_ * (float) i_138_;
	    ((Class266) this).aFloat4339 = 2.0F * f_142_ * (float) i_139_;
	    ((Class266) this).aFloat4336 = 2.0F * f_143_ * (float) i_138_;
	    ((Class266) this).aFloat4343 = -2.0F * f_143_ * (float) i_139_;
	    ((Class266) this).aFloat4334
		= (float) (2 * i_138_) * (0.5F * f_143_ - 0.5F * f_142_) + f;
	    ((Class266) this).aFloat4345
		= ((float) (2 * i_139_) * (-0.5F * f_143_ - 0.5F * f_142_)
		   + f_140_);
	    ((Class266) this).aFloat4346 = f_141_;
	} else {
	    ((Class266) this).aFloat4338 = 0.0F;
	    ((Class266) this).aFloat4341 = 0.0F;
	    ((Class266) this).aFloat4340 = 0.0F;
	    ((Class266) this).aFloat4343 = 0.0F;
	    ((Class266) this).aFloat4344 = 0.0F;
	    ((Class266) this).aFloat4336 = 0.0F;
	    ((Class266) this).aFloat4335 = (float) (2 * i_138_);
	    ((Class266) this).aFloat4339 = (float) (2 * i_139_);
	    ((Class266) this).aFloat4337 = 1.0F;
	    ((Class266) this).aFloat4334 = f - (float) i_138_;
	    ((Class266) this).aFloat4345 = f_140_ - (float) i_139_;
	    ((Class266) this).aFloat4346 = f_141_;
	}
    }
    
    public void method5155(float f, float f_144_, float f_145_, float f_146_,
			   float f_147_, float f_148_, float f_149_,
			   float f_150_, float f_151_) {
	((Class266) this).aFloat4335 = f;
	((Class266) this).aFloat4343 = f_146_;
	((Class266) this).aFloat4341 = f_149_;
	((Class266) this).aFloat4334 = 0.0F;
	((Class266) this).aFloat4336 = f_144_;
	((Class266) this).aFloat4339 = f_147_;
	((Class266) this).aFloat4338 = f_150_;
	((Class266) this).aFloat4345 = 0.0F;
	((Class266) this).aFloat4344 = f_145_;
	((Class266) this).aFloat4340 = f_148_;
	((Class266) this).aFloat4337 = f_151_;
	((Class266) this).aFloat4346 = 0.0F;
    }
    
    public void method5156(float f, float f_152_, float f_153_, float f_154_,
			   float f_155_, float f_156_, float f_157_,
			   float f_158_, float f_159_) {
	((Class266) this).aFloat4335 = f;
	((Class266) this).aFloat4343 = f_154_;
	((Class266) this).aFloat4341 = f_157_;
	((Class266) this).aFloat4334 = 0.0F;
	((Class266) this).aFloat4336 = f_152_;
	((Class266) this).aFloat4339 = f_155_;
	((Class266) this).aFloat4338 = f_158_;
	((Class266) this).aFloat4345 = 0.0F;
	((Class266) this).aFloat4344 = f_153_;
	((Class266) this).aFloat4340 = f_156_;
	((Class266) this).aFloat4337 = f_159_;
	((Class266) this).aFloat4346 = 0.0F;
    }
    
    public void method5157(Class266 class266_160_) {
	if (class266_160_ == this)
	    method5124();
	else {
	    ((Class266) this).aFloat4335
		= ((Class266) class266_160_).aFloat4335;
	    ((Class266) this).aFloat4343
		= ((Class266) class266_160_).aFloat4336;
	    ((Class266) this).aFloat4341
		= ((Class266) class266_160_).aFloat4344;
	    ((Class266) this).aFloat4336
		= ((Class266) class266_160_).aFloat4343;
	    ((Class266) this).aFloat4339
		= ((Class266) class266_160_).aFloat4339;
	    ((Class266) this).aFloat4338
		= ((Class266) class266_160_).aFloat4340;
	    ((Class266) this).aFloat4344
		= ((Class266) class266_160_).aFloat4341;
	    ((Class266) this).aFloat4340
		= ((Class266) class266_160_).aFloat4338;
	    ((Class266) this).aFloat4337
		= ((Class266) class266_160_).aFloat4337;
	    ((Class266) this).aFloat4334
		= -((((Class266) class266_160_).aFloat4334
		     * ((Class266) this).aFloat4335)
		    + (((Class266) class266_160_).aFloat4345
		       * ((Class266) this).aFloat4343)
		    + (((Class266) class266_160_).aFloat4346
		       * ((Class266) this).aFloat4341));
	    ((Class266) this).aFloat4345
		= -((((Class266) class266_160_).aFloat4334
		     * ((Class266) this).aFloat4336)
		    + (((Class266) class266_160_).aFloat4345
		       * ((Class266) this).aFloat4339)
		    + (((Class266) class266_160_).aFloat4346
		       * ((Class266) this).aFloat4338));
	    ((Class266) this).aFloat4346
		= -((((Class266) class266_160_).aFloat4334
		     * ((Class266) this).aFloat4344)
		    + (((Class266) class266_160_).aFloat4345
		       * ((Class266) this).aFloat4340)
		    + (((Class266) class266_160_).aFloat4346
		       * ((Class266) this).aFloat4337));
	}
    }
    
    public Class266() {
	method5165();
    }
    
    void method5158(float f, float f_161_, float f_162_, float f_163_) {
	float f_164_ = f * f;
	float f_165_ = f * f_161_;
	float f_166_ = f * f_162_;
	float f_167_ = f * f_163_;
	float f_168_ = f_161_ * f_161_;
	float f_169_ = f_161_ * f_162_;
	float f_170_ = f_161_ * f_163_;
	float f_171_ = f_162_ * f_162_;
	float f_172_ = f_162_ * f_163_;
	((Class266) this).aFloat4335 = 1.0F - 2.0F * (f_168_ + f_171_);
	((Class266) this).aFloat4343 = 2.0F * (f_165_ - f_172_);
	((Class266) this).aFloat4341 = 2.0F * (f_166_ + f_170_);
	((Class266) this).aFloat4336 = 2.0F * (f_165_ + f_172_);
	((Class266) this).aFloat4339 = 1.0F - 2.0F * (f_164_ + f_171_);
	((Class266) this).aFloat4338 = 2.0F * (f_169_ - f_167_);
	((Class266) this).aFloat4344 = 2.0F * (f_166_ - f_170_);
	((Class266) this).aFloat4340 = 2.0F * (f_169_ + f_167_);
	((Class266) this).aFloat4337 = 1.0F - 2.0F * (f_164_ + f_168_);
	((Class266) this).aFloat4346 = 0.0F;
	((Class266) this).aFloat4345 = 0.0F;
	((Class266) this).aFloat4334 = 0.0F;
    }
    
    public void method5159() {
	float f = ((Class266) this).aFloat4334;
	float f_173_ = ((Class266) this).aFloat4345;
	float f_174_ = ((Class266) this).aFloat4343;
	((Class266) this).aFloat4343 = ((Class266) this).aFloat4336;
	((Class266) this).aFloat4336 = f_174_;
	float f_175_ = ((Class266) this).aFloat4341;
	((Class266) this).aFloat4341 = ((Class266) this).aFloat4344;
	((Class266) this).aFloat4344 = f_175_;
	float f_176_ = ((Class266) this).aFloat4338;
	((Class266) this).aFloat4338 = ((Class266) this).aFloat4340;
	((Class266) this).aFloat4340 = f_176_;
	((Class266) this).aFloat4334
	    = -(f * ((Class266) this).aFloat4335
		+ f_173_ * ((Class266) this).aFloat4343
		+ ((Class266) this).aFloat4346 * ((Class266) this).aFloat4341);
	((Class266) this).aFloat4345
	    = -(f * ((Class266) this).aFloat4336
		+ f_173_ * ((Class266) this).aFloat4339
		+ ((Class266) this).aFloat4346 * ((Class266) this).aFloat4338);
	((Class266) this).aFloat4346
	    = -(f * ((Class266) this).aFloat4344
		+ f_173_ * ((Class266) this).aFloat4340
		+ ((Class266) this).aFloat4346 * ((Class266) this).aFloat4337);
    }
    
    public void method5160() {
	float f = ((Class266) this).aFloat4334;
	float f_177_ = ((Class266) this).aFloat4345;
	float f_178_ = ((Class266) this).aFloat4343;
	((Class266) this).aFloat4343 = ((Class266) this).aFloat4336;
	((Class266) this).aFloat4336 = f_178_;
	float f_179_ = ((Class266) this).aFloat4341;
	((Class266) this).aFloat4341 = ((Class266) this).aFloat4344;
	((Class266) this).aFloat4344 = f_179_;
	float f_180_ = ((Class266) this).aFloat4338;
	((Class266) this).aFloat4338 = ((Class266) this).aFloat4340;
	((Class266) this).aFloat4340 = f_180_;
	((Class266) this).aFloat4334
	    = -(f * ((Class266) this).aFloat4335
		+ f_177_ * ((Class266) this).aFloat4343
		+ ((Class266) this).aFloat4346 * ((Class266) this).aFloat4341);
	((Class266) this).aFloat4345
	    = -(f * ((Class266) this).aFloat4336
		+ f_177_ * ((Class266) this).aFloat4339
		+ ((Class266) this).aFloat4346 * ((Class266) this).aFloat4338);
	((Class266) this).aFloat4346
	    = -(f * ((Class266) this).aFloat4344
		+ f_177_ * ((Class266) this).aFloat4340
		+ ((Class266) this).aFloat4346 * ((Class266) this).aFloat4337);
    }
    
    public void method5161(float f, float f_181_, float f_182_, float f_183_) {
	float f_184_ = (float) Math.cos((double) f_183_);
	float f_185_ = (float) Math.sin((double) f_183_);
	((Class266) this).aFloat4335 = f_184_ + f * f * (1.0F - f_184_);
	((Class266) this).aFloat4336
	    = f_182_ * f_185_ + f_181_ * f * (1.0F - f_184_);
	((Class266) this).aFloat4344
	    = -f_181_ * f_185_ + f_182_ * f * (1.0F - f_184_);
	((Class266) this).aFloat4343
	    = -f_182_ * f_185_ + f * f_181_ * (1.0F - f_184_);
	((Class266) this).aFloat4339
	    = f_184_ + f_181_ * f_181_ * (1.0F - f_184_);
	((Class266) this).aFloat4340
	    = f * f_185_ + f_182_ * f_181_ * (1.0F - f_184_);
	((Class266) this).aFloat4341
	    = f_181_ * f_185_ + f * f_182_ * (1.0F - f_184_);
	((Class266) this).aFloat4338
	    = -f * f_185_ + f_181_ * f_182_ * (1.0F - f_184_);
	((Class266) this).aFloat4337
	    = f_184_ + f_182_ * f_182_ * (1.0F - f_184_);
	((Class266) this).aFloat4346 = 0.0F;
	((Class266) this).aFloat4345 = 0.0F;
	((Class266) this).aFloat4334 = 0.0F;
    }
    
    public void method5162(float f, float f_186_, float f_187_, float f_188_) {
	float f_189_ = (float) Math.cos((double) f_188_);
	float f_190_ = (float) Math.sin((double) f_188_);
	((Class266) this).aFloat4335 = f_189_ + f * f * (1.0F - f_189_);
	((Class266) this).aFloat4336
	    = f_187_ * f_190_ + f_186_ * f * (1.0F - f_189_);
	((Class266) this).aFloat4344
	    = -f_186_ * f_190_ + f_187_ * f * (1.0F - f_189_);
	((Class266) this).aFloat4343
	    = -f_187_ * f_190_ + f * f_186_ * (1.0F - f_189_);
	((Class266) this).aFloat4339
	    = f_189_ + f_186_ * f_186_ * (1.0F - f_189_);
	((Class266) this).aFloat4340
	    = f * f_190_ + f_187_ * f_186_ * (1.0F - f_189_);
	((Class266) this).aFloat4341
	    = f_186_ * f_190_ + f * f_187_ * (1.0F - f_189_);
	((Class266) this).aFloat4338
	    = -f * f_190_ + f_186_ * f_187_ * (1.0F - f_189_);
	((Class266) this).aFloat4337
	    = f_189_ + f_187_ * f_187_ * (1.0F - f_189_);
	((Class266) this).aFloat4346 = 0.0F;
	((Class266) this).aFloat4345 = 0.0F;
	((Class266) this).aFloat4334 = 0.0F;
    }
    
    public void method5163(float f, float f_191_, float f_192_, float f_193_) {
	float f_194_ = (float) Math.cos((double) f_193_);
	float f_195_ = (float) Math.sin((double) f_193_);
	((Class266) this).aFloat4335 = f_194_ + f * f * (1.0F - f_194_);
	((Class266) this).aFloat4336
	    = f_192_ * f_195_ + f_191_ * f * (1.0F - f_194_);
	((Class266) this).aFloat4344
	    = -f_191_ * f_195_ + f_192_ * f * (1.0F - f_194_);
	((Class266) this).aFloat4343
	    = -f_192_ * f_195_ + f * f_191_ * (1.0F - f_194_);
	((Class266) this).aFloat4339
	    = f_194_ + f_191_ * f_191_ * (1.0F - f_194_);
	((Class266) this).aFloat4340
	    = f * f_195_ + f_192_ * f_191_ * (1.0F - f_194_);
	((Class266) this).aFloat4341
	    = f_191_ * f_195_ + f * f_192_ * (1.0F - f_194_);
	((Class266) this).aFloat4338
	    = -f * f_195_ + f_191_ * f_192_ * (1.0F - f_194_);
	((Class266) this).aFloat4337
	    = f_194_ + f_192_ * f_192_ * (1.0F - f_194_);
	((Class266) this).aFloat4346 = 0.0F;
	((Class266) this).aFloat4345 = 0.0F;
	((Class266) this).aFloat4334 = 0.0F;
    }
    
    public void method5164(Class278 class278) {
	method5158(class278.aFloat4393, class278.aFloat4390,
		   class278.aFloat4391, class278.aFloat4396);
    }
    
    public void method5165() {
	((Class266) this).aFloat4346 = 0.0F;
	((Class266) this).aFloat4345 = 0.0F;
	((Class266) this).aFloat4334 = 0.0F;
	((Class266) this).aFloat4338 = 0.0F;
	((Class266) this).aFloat4341 = 0.0F;
	((Class266) this).aFloat4340 = 0.0F;
	((Class266) this).aFloat4343 = 0.0F;
	((Class266) this).aFloat4344 = 0.0F;
	((Class266) this).aFloat4336 = 0.0F;
	((Class266) this).aFloat4337 = 1.0F;
	((Class266) this).aFloat4339 = 1.0F;
	((Class266) this).aFloat4335 = 1.0F;
    }
    
    public void method5166(Class266 class266_196_) {
	((Class266) this).aFloat4335 = ((Class266) class266_196_).aFloat4335;
	((Class266) this).aFloat4343 = ((Class266) class266_196_).aFloat4343;
	((Class266) this).aFloat4341 = ((Class266) class266_196_).aFloat4341;
	((Class266) this).aFloat4334 = ((Class266) class266_196_).aFloat4334;
	((Class266) this).aFloat4336 = ((Class266) class266_196_).aFloat4336;
	((Class266) this).aFloat4339 = ((Class266) class266_196_).aFloat4339;
	((Class266) this).aFloat4338 = ((Class266) class266_196_).aFloat4338;
	((Class266) this).aFloat4345 = ((Class266) class266_196_).aFloat4345;
	((Class266) this).aFloat4344 = ((Class266) class266_196_).aFloat4344;
	((Class266) this).aFloat4340 = ((Class266) class266_196_).aFloat4340;
	((Class266) this).aFloat4337 = ((Class266) class266_196_).aFloat4337;
	((Class266) this).aFloat4346 = ((Class266) class266_196_).aFloat4346;
    }
    
    public void method5167(float f, float f_197_, float f_198_) {
	((Class266) this).aFloat4335 = f;
	((Class266) this).aFloat4343 = 0.0F;
	((Class266) this).aFloat4341 = 0.0F;
	((Class266) this).aFloat4334 = 0.0F;
	((Class266) this).aFloat4336 = 0.0F;
	((Class266) this).aFloat4339 = f_197_;
	((Class266) this).aFloat4338 = 0.0F;
	((Class266) this).aFloat4345 = 0.0F;
	((Class266) this).aFloat4344 = 0.0F;
	((Class266) this).aFloat4340 = 0.0F;
	((Class266) this).aFloat4337 = f_198_;
	((Class266) this).aFloat4346 = 0.0F;
    }
    
    public void method5168(Class276 class276) {
	float f = (class276.aClass278_4385.aFloat4396
		   * class276.aClass278_4385.aFloat4396);
	float f_199_ = (class276.aClass278_4385.aFloat4396
			* class276.aClass278_4385.aFloat4393);
	float f_200_ = (class276.aClass278_4385.aFloat4396
			* class276.aClass278_4385.aFloat4390);
	float f_201_ = (class276.aClass278_4385.aFloat4396
			* class276.aClass278_4385.aFloat4391);
	float f_202_ = (class276.aClass278_4385.aFloat4393
			* class276.aClass278_4385.aFloat4393);
	float f_203_ = (class276.aClass278_4385.aFloat4393
			* class276.aClass278_4385.aFloat4390);
	float f_204_ = (class276.aClass278_4385.aFloat4393
			* class276.aClass278_4385.aFloat4391);
	float f_205_ = (class276.aClass278_4385.aFloat4390
			* class276.aClass278_4385.aFloat4390);
	float f_206_ = (class276.aClass278_4385.aFloat4390
			* class276.aClass278_4385.aFloat4391);
	float f_207_ = (class276.aClass278_4385.aFloat4391
			* class276.aClass278_4385.aFloat4391);
	((Class266) this).aFloat4335 = f_202_ + f - f_207_ - f_205_;
	((Class266) this).aFloat4336 = f_203_ + f_201_ + f_203_ + f_201_;
	((Class266) this).aFloat4344 = f_204_ - f_200_ - f_200_ + f_204_;
	((Class266) this).aFloat4343 = f_203_ - f_201_ - f_201_ + f_203_;
	((Class266) this).aFloat4339 = f_205_ + f - f_202_ - f_207_;
	((Class266) this).aFloat4340 = f_206_ + f_199_ + f_206_ + f_199_;
	((Class266) this).aFloat4341 = f_204_ + f_200_ + f_204_ + f_200_;
	((Class266) this).aFloat4338 = f_206_ - f_199_ - f_199_ + f_206_;
	((Class266) this).aFloat4337 = f_207_ + f - f_205_ - f_202_;
	((Class266) this).aFloat4334 = class276.aClass287_4386.aFloat4477;
	((Class266) this).aFloat4345 = class276.aClass287_4386.aFloat4474;
	((Class266) this).aFloat4346 = class276.aClass287_4386.aFloat4479;
    }
    
    public void method5169(Class266 class266_208_) {
	float f = ((Class266) this).aFloat4335;
	float f_209_ = ((Class266) this).aFloat4336;
	float f_210_ = ((Class266) this).aFloat4343;
	float f_211_ = ((Class266) this).aFloat4339;
	float f_212_ = ((Class266) this).aFloat4341;
	float f_213_ = ((Class266) this).aFloat4338;
	float f_214_ = ((Class266) this).aFloat4334;
	float f_215_ = ((Class266) this).aFloat4345;
	float f_216_ = ((Class266) this).aFloat4344;
	float f_217_ = ((Class266) this).aFloat4340;
	float f_218_ = ((Class266) this).aFloat4337;
	float f_219_ = ((Class266) this).aFloat4346;
	((Class266) this).aFloat4335
	    = (f * ((Class266) class266_208_).aFloat4335
	       + f_209_ * ((Class266) class266_208_).aFloat4343
	       + f_216_ * ((Class266) class266_208_).aFloat4341);
	((Class266) this).aFloat4336
	    = (f * ((Class266) class266_208_).aFloat4336
	       + f_209_ * ((Class266) class266_208_).aFloat4339
	       + f_216_ * ((Class266) class266_208_).aFloat4338);
	((Class266) this).aFloat4344
	    = (f * ((Class266) class266_208_).aFloat4344
	       + f_209_ * ((Class266) class266_208_).aFloat4340
	       + f_216_ * ((Class266) class266_208_).aFloat4337);
	((Class266) this).aFloat4343
	    = (f_210_ * ((Class266) class266_208_).aFloat4335
	       + f_211_ * ((Class266) class266_208_).aFloat4343
	       + f_217_ * ((Class266) class266_208_).aFloat4341);
	((Class266) this).aFloat4339
	    = (f_210_ * ((Class266) class266_208_).aFloat4336
	       + f_211_ * ((Class266) class266_208_).aFloat4339
	       + f_217_ * ((Class266) class266_208_).aFloat4338);
	((Class266) this).aFloat4340
	    = (f_210_ * ((Class266) class266_208_).aFloat4344
	       + f_211_ * ((Class266) class266_208_).aFloat4340
	       + f_217_ * ((Class266) class266_208_).aFloat4337);
	((Class266) this).aFloat4341
	    = (f_212_ * ((Class266) class266_208_).aFloat4335
	       + f_213_ * ((Class266) class266_208_).aFloat4343
	       + f_218_ * ((Class266) class266_208_).aFloat4341);
	((Class266) this).aFloat4338
	    = (f_212_ * ((Class266) class266_208_).aFloat4336
	       + f_213_ * ((Class266) class266_208_).aFloat4339
	       + f_218_ * ((Class266) class266_208_).aFloat4338);
	((Class266) this).aFloat4337
	    = (f_212_ * ((Class266) class266_208_).aFloat4344
	       + f_213_ * ((Class266) class266_208_).aFloat4340
	       + f_218_ * ((Class266) class266_208_).aFloat4337);
	((Class266) this).aFloat4334
	    = (f_214_ * ((Class266) class266_208_).aFloat4335
	       + f_215_ * ((Class266) class266_208_).aFloat4343
	       + f_219_ * ((Class266) class266_208_).aFloat4341
	       + ((Class266) class266_208_).aFloat4334);
	((Class266) this).aFloat4345
	    = (f_214_ * ((Class266) class266_208_).aFloat4336
	       + f_215_ * ((Class266) class266_208_).aFloat4339
	       + f_219_ * ((Class266) class266_208_).aFloat4338
	       + ((Class266) class266_208_).aFloat4345);
	((Class266) this).aFloat4346
	    = (f_214_ * ((Class266) class266_208_).aFloat4344
	       + f_215_ * ((Class266) class266_208_).aFloat4340
	       + f_219_ * ((Class266) class266_208_).aFloat4337
	       + ((Class266) class266_208_).aFloat4346);
    }
    
    public void method5170(float f, float f_220_, float f_221_) {
	((Class266) this).aFloat4334 += f;
	((Class266) this).aFloat4345 += f_220_;
	((Class266) this).aFloat4346 += f_221_;
    }
    
    public void method5171(float f, float f_222_, float f_223_) {
	((Class266) this).aFloat4335 *= f;
	((Class266) this).aFloat4343 *= f;
	((Class266) this).aFloat4341 *= f;
	((Class266) this).aFloat4334 *= f;
	((Class266) this).aFloat4336 *= f_222_;
	((Class266) this).aFloat4339 *= f_222_;
	((Class266) this).aFloat4338 *= f_222_;
	((Class266) this).aFloat4345 *= f_222_;
	((Class266) this).aFloat4344 *= f_223_;
	((Class266) this).aFloat4340 *= f_223_;
	((Class266) this).aFloat4337 *= f_223_;
	((Class266) this).aFloat4346 *= f_223_;
    }
    
    public void method5172(float f, float f_224_, float f_225_) {
	((Class266) this).aFloat4338 = 0.0F;
	((Class266) this).aFloat4341 = 0.0F;
	((Class266) this).aFloat4340 = 0.0F;
	((Class266) this).aFloat4343 = 0.0F;
	((Class266) this).aFloat4344 = 0.0F;
	((Class266) this).aFloat4336 = 0.0F;
	((Class266) this).aFloat4337 = 1.0F;
	((Class266) this).aFloat4339 = 1.0F;
	((Class266) this).aFloat4335 = 1.0F;
	((Class266) this).aFloat4334 = f;
	((Class266) this).aFloat4345 = f_224_;
	((Class266) this).aFloat4346 = f_225_;
    }
    
    public void method5173(float f, float f_226_, float f_227_, float[] fs) {
	f -= ((Class266) this).aFloat4334;
	f_226_ -= ((Class266) this).aFloat4345;
	f_227_ -= ((Class266) this).aFloat4346;
	fs[0] = (float) (int) (((Class266) this).aFloat4335 * f
			       + ((Class266) this).aFloat4336 * f_226_
			       + ((Class266) this).aFloat4344 * f_227_);
	fs[1] = (float) (int) (((Class266) this).aFloat4343 * f
			       + ((Class266) this).aFloat4339 * f_226_
			       + ((Class266) this).aFloat4340 * f_227_);
	fs[2] = (float) (int) (((Class266) this).aFloat4341 * f
			       + ((Class266) this).aFloat4338 * f_226_
			       + ((Class266) this).aFloat4337 * f_227_);
    }
    
    public void method5174(float f, float f_228_, float f_229_) {
	((Class266) this).aFloat4338 = 0.0F;
	((Class266) this).aFloat4341 = 0.0F;
	((Class266) this).aFloat4340 = 0.0F;
	((Class266) this).aFloat4343 = 0.0F;
	((Class266) this).aFloat4344 = 0.0F;
	((Class266) this).aFloat4336 = 0.0F;
	((Class266) this).aFloat4337 = 1.0F;
	((Class266) this).aFloat4339 = 1.0F;
	((Class266) this).aFloat4335 = 1.0F;
	((Class266) this).aFloat4334 = f;
	((Class266) this).aFloat4345 = f_228_;
	((Class266) this).aFloat4346 = f_229_;
    }
    
    public void method5175(Class266 class266_230_) {
	((Class266) this).aFloat4335 = ((Class266) class266_230_).aFloat4335;
	((Class266) this).aFloat4343 = ((Class266) class266_230_).aFloat4343;
	((Class266) this).aFloat4341 = ((Class266) class266_230_).aFloat4341;
	((Class266) this).aFloat4334 = ((Class266) class266_230_).aFloat4334;
	((Class266) this).aFloat4336 = ((Class266) class266_230_).aFloat4336;
	((Class266) this).aFloat4339 = ((Class266) class266_230_).aFloat4339;
	((Class266) this).aFloat4338 = ((Class266) class266_230_).aFloat4338;
	((Class266) this).aFloat4345 = ((Class266) class266_230_).aFloat4345;
	((Class266) this).aFloat4344 = ((Class266) class266_230_).aFloat4344;
	((Class266) this).aFloat4340 = ((Class266) class266_230_).aFloat4340;
	((Class266) this).aFloat4337 = ((Class266) class266_230_).aFloat4337;
	((Class266) this).aFloat4346 = ((Class266) class266_230_).aFloat4346;
    }
    
    public void method5176(float[] fs) {
	float f = fs[0] - ((Class266) this).aFloat4334;
	float f_231_ = fs[1] - ((Class266) this).aFloat4345;
	float f_232_ = fs[2] - ((Class266) this).aFloat4346;
	fs[0] = (float) (int) (((Class266) this).aFloat4335 * f
			       + ((Class266) this).aFloat4336 * f_231_
			       + ((Class266) this).aFloat4344 * f_232_);
	fs[1] = (float) (int) (((Class266) this).aFloat4343 * f
			       + ((Class266) this).aFloat4339 * f_231_
			       + ((Class266) this).aFloat4340 * f_232_);
	fs[2] = (float) (int) (((Class266) this).aFloat4341 * f
			       + ((Class266) this).aFloat4338 * f_231_
			       + ((Class266) this).aFloat4337 * f_232_);
    }
    
    public void method5177(Class287 class287) {
	method5133(class287.aFloat4477, class287.aFloat4474,
		   class287.aFloat4479);
    }
    
    public void method5178(float f, float f_233_, float f_234_) {
	((Class266) this).aFloat4335 *= f;
	((Class266) this).aFloat4343 *= f;
	((Class266) this).aFloat4341 *= f;
	((Class266) this).aFloat4334 *= f;
	((Class266) this).aFloat4336 *= f_233_;
	((Class266) this).aFloat4339 *= f_233_;
	((Class266) this).aFloat4338 *= f_233_;
	((Class266) this).aFloat4345 *= f_233_;
	((Class266) this).aFloat4344 *= f_234_;
	((Class266) this).aFloat4340 *= f_234_;
	((Class266) this).aFloat4337 *= f_234_;
	((Class266) this).aFloat4346 *= f_234_;
    }
    
    public void method5179(Class266 class266_235_) {
	float f = ((Class266) this).aFloat4335;
	float f_236_ = ((Class266) this).aFloat4336;
	float f_237_ = ((Class266) this).aFloat4343;
	float f_238_ = ((Class266) this).aFloat4339;
	float f_239_ = ((Class266) this).aFloat4341;
	float f_240_ = ((Class266) this).aFloat4338;
	float f_241_ = ((Class266) this).aFloat4334;
	float f_242_ = ((Class266) this).aFloat4345;
	float f_243_ = ((Class266) this).aFloat4344;
	float f_244_ = ((Class266) this).aFloat4340;
	float f_245_ = ((Class266) this).aFloat4337;
	float f_246_ = ((Class266) this).aFloat4346;
	((Class266) this).aFloat4335
	    = (f * ((Class266) class266_235_).aFloat4335
	       + f_236_ * ((Class266) class266_235_).aFloat4343
	       + f_243_ * ((Class266) class266_235_).aFloat4341);
	((Class266) this).aFloat4336
	    = (f * ((Class266) class266_235_).aFloat4336
	       + f_236_ * ((Class266) class266_235_).aFloat4339
	       + f_243_ * ((Class266) class266_235_).aFloat4338);
	((Class266) this).aFloat4344
	    = (f * ((Class266) class266_235_).aFloat4344
	       + f_236_ * ((Class266) class266_235_).aFloat4340
	       + f_243_ * ((Class266) class266_235_).aFloat4337);
	((Class266) this).aFloat4343
	    = (f_237_ * ((Class266) class266_235_).aFloat4335
	       + f_238_ * ((Class266) class266_235_).aFloat4343
	       + f_244_ * ((Class266) class266_235_).aFloat4341);
	((Class266) this).aFloat4339
	    = (f_237_ * ((Class266) class266_235_).aFloat4336
	       + f_238_ * ((Class266) class266_235_).aFloat4339
	       + f_244_ * ((Class266) class266_235_).aFloat4338);
	((Class266) this).aFloat4340
	    = (f_237_ * ((Class266) class266_235_).aFloat4344
	       + f_238_ * ((Class266) class266_235_).aFloat4340
	       + f_244_ * ((Class266) class266_235_).aFloat4337);
	((Class266) this).aFloat4341
	    = (f_239_ * ((Class266) class266_235_).aFloat4335
	       + f_240_ * ((Class266) class266_235_).aFloat4343
	       + f_245_ * ((Class266) class266_235_).aFloat4341);
	((Class266) this).aFloat4338
	    = (f_239_ * ((Class266) class266_235_).aFloat4336
	       + f_240_ * ((Class266) class266_235_).aFloat4339
	       + f_245_ * ((Class266) class266_235_).aFloat4338);
	((Class266) this).aFloat4337
	    = (f_239_ * ((Class266) class266_235_).aFloat4344
	       + f_240_ * ((Class266) class266_235_).aFloat4340
	       + f_245_ * ((Class266) class266_235_).aFloat4337);
	((Class266) this).aFloat4334
	    = (f_241_ * ((Class266) class266_235_).aFloat4335
	       + f_242_ * ((Class266) class266_235_).aFloat4343
	       + f_246_ * ((Class266) class266_235_).aFloat4341
	       + ((Class266) class266_235_).aFloat4334);
	((Class266) this).aFloat4345
	    = (f_241_ * ((Class266) class266_235_).aFloat4336
	       + f_242_ * ((Class266) class266_235_).aFloat4339
	       + f_246_ * ((Class266) class266_235_).aFloat4338
	       + ((Class266) class266_235_).aFloat4345);
	((Class266) this).aFloat4346
	    = (f_241_ * ((Class266) class266_235_).aFloat4344
	       + f_242_ * ((Class266) class266_235_).aFloat4340
	       + f_246_ * ((Class266) class266_235_).aFloat4337
	       + ((Class266) class266_235_).aFloat4346);
    }
    
    public void method5180(Class266 class266_247_) {
	float f = ((Class266) this).aFloat4335;
	float f_248_ = ((Class266) this).aFloat4336;
	float f_249_ = ((Class266) this).aFloat4343;
	float f_250_ = ((Class266) this).aFloat4339;
	float f_251_ = ((Class266) this).aFloat4341;
	float f_252_ = ((Class266) this).aFloat4338;
	float f_253_ = ((Class266) this).aFloat4334;
	float f_254_ = ((Class266) this).aFloat4345;
	float f_255_ = ((Class266) this).aFloat4344;
	float f_256_ = ((Class266) this).aFloat4340;
	float f_257_ = ((Class266) this).aFloat4337;
	float f_258_ = ((Class266) this).aFloat4346;
	((Class266) this).aFloat4335
	    = (f * ((Class266) class266_247_).aFloat4335
	       + f_248_ * ((Class266) class266_247_).aFloat4343
	       + f_255_ * ((Class266) class266_247_).aFloat4341);
	((Class266) this).aFloat4336
	    = (f * ((Class266) class266_247_).aFloat4336
	       + f_248_ * ((Class266) class266_247_).aFloat4339
	       + f_255_ * ((Class266) class266_247_).aFloat4338);
	((Class266) this).aFloat4344
	    = (f * ((Class266) class266_247_).aFloat4344
	       + f_248_ * ((Class266) class266_247_).aFloat4340
	       + f_255_ * ((Class266) class266_247_).aFloat4337);
	((Class266) this).aFloat4343
	    = (f_249_ * ((Class266) class266_247_).aFloat4335
	       + f_250_ * ((Class266) class266_247_).aFloat4343
	       + f_256_ * ((Class266) class266_247_).aFloat4341);
	((Class266) this).aFloat4339
	    = (f_249_ * ((Class266) class266_247_).aFloat4336
	       + f_250_ * ((Class266) class266_247_).aFloat4339
	       + f_256_ * ((Class266) class266_247_).aFloat4338);
	((Class266) this).aFloat4340
	    = (f_249_ * ((Class266) class266_247_).aFloat4344
	       + f_250_ * ((Class266) class266_247_).aFloat4340
	       + f_256_ * ((Class266) class266_247_).aFloat4337);
	((Class266) this).aFloat4341
	    = (f_251_ * ((Class266) class266_247_).aFloat4335
	       + f_252_ * ((Class266) class266_247_).aFloat4343
	       + f_257_ * ((Class266) class266_247_).aFloat4341);
	((Class266) this).aFloat4338
	    = (f_251_ * ((Class266) class266_247_).aFloat4336
	       + f_252_ * ((Class266) class266_247_).aFloat4339
	       + f_257_ * ((Class266) class266_247_).aFloat4338);
	((Class266) this).aFloat4337
	    = (f_251_ * ((Class266) class266_247_).aFloat4344
	       + f_252_ * ((Class266) class266_247_).aFloat4340
	       + f_257_ * ((Class266) class266_247_).aFloat4337);
	((Class266) this).aFloat4334
	    = (f_253_ * ((Class266) class266_247_).aFloat4335
	       + f_254_ * ((Class266) class266_247_).aFloat4343
	       + f_258_ * ((Class266) class266_247_).aFloat4341
	       + ((Class266) class266_247_).aFloat4334);
	((Class266) this).aFloat4345
	    = (f_253_ * ((Class266) class266_247_).aFloat4336
	       + f_254_ * ((Class266) class266_247_).aFloat4339
	       + f_258_ * ((Class266) class266_247_).aFloat4338
	       + ((Class266) class266_247_).aFloat4345);
	((Class266) this).aFloat4346
	    = (f_253_ * ((Class266) class266_247_).aFloat4344
	       + f_254_ * ((Class266) class266_247_).aFloat4340
	       + f_258_ * ((Class266) class266_247_).aFloat4337
	       + ((Class266) class266_247_).aFloat4346);
    }
    
    public void method5181(float f, float f_259_, float f_260_, float f_261_) {
	float f_262_ = (float) Math.cos((double) f_261_);
	float f_263_ = (float) Math.sin((double) f_261_);
	float f_264_ = f_262_ + f * f * (1.0F - f_262_);
	float f_265_ = f_260_ * f_263_ + f_259_ * f * (1.0F - f_262_);
	float f_266_ = -f_259_ * f_263_ + f_260_ * f * (1.0F - f_262_);
	float f_267_ = -f_260_ * f_263_ + f * f_259_ * (1.0F - f_262_);
	float f_268_ = f_262_ + f_259_ * f_259_ * (1.0F - f_262_);
	float f_269_ = f * f_263_ + f_260_ * f_259_ * (1.0F - f_262_);
	float f_270_ = f_259_ * f_263_ + f * f_260_ * (1.0F - f_262_);
	float f_271_ = -f * f_263_ + f_259_ * f_260_ * (1.0F - f_262_);
	float f_272_ = f_262_ + f_260_ * f_260_ * (1.0F - f_262_);
	float f_273_ = ((Class266) this).aFloat4335;
	float f_274_ = ((Class266) this).aFloat4336;
	float f_275_ = ((Class266) this).aFloat4343;
	float f_276_ = ((Class266) this).aFloat4339;
	float f_277_ = ((Class266) this).aFloat4341;
	float f_278_ = ((Class266) this).aFloat4338;
	float f_279_ = ((Class266) this).aFloat4334;
	float f_280_ = ((Class266) this).aFloat4345;
	((Class266) this).aFloat4335
	    = (f_273_ * f_264_ + f_274_ * f_267_
	       + ((Class266) this).aFloat4344 * f_270_);
	((Class266) this).aFloat4336
	    = (f_273_ * f_265_ + f_274_ * f_268_
	       + ((Class266) this).aFloat4344 * f_271_);
	((Class266) this).aFloat4344
	    = (f_273_ * f_266_ + f_274_ * f_269_
	       + ((Class266) this).aFloat4344 * f_272_);
	((Class266) this).aFloat4343
	    = (f_275_ * f_264_ + f_276_ * f_267_
	       + ((Class266) this).aFloat4340 * f_270_);
	((Class266) this).aFloat4339
	    = (f_275_ * f_265_ + f_276_ * f_268_
	       + ((Class266) this).aFloat4340 * f_271_);
	((Class266) this).aFloat4340
	    = (f_275_ * f_266_ + f_276_ * f_269_
	       + ((Class266) this).aFloat4340 * f_272_);
	((Class266) this).aFloat4341
	    = (f_277_ * f_264_ + f_278_ * f_267_
	       + ((Class266) this).aFloat4337 * f_270_);
	((Class266) this).aFloat4338
	    = (f_277_ * f_265_ + f_278_ * f_268_
	       + ((Class266) this).aFloat4337 * f_271_);
	((Class266) this).aFloat4337
	    = (f_277_ * f_266_ + f_278_ * f_269_
	       + ((Class266) this).aFloat4337 * f_272_);
	((Class266) this).aFloat4334
	    = (f_279_ * f_264_ + f_280_ * f_267_
	       + ((Class266) this).aFloat4346 * f_270_);
	((Class266) this).aFloat4345
	    = (f_279_ * f_265_ + f_280_ * f_268_
	       + ((Class266) this).aFloat4346 * f_271_);
	((Class266) this).aFloat4346
	    = (f_279_ * f_266_ + f_280_ * f_269_
	       + ((Class266) this).aFloat4346 * f_272_);
    }
    
    public void method5182(float f, float f_281_, float f_282_, float[] fs) {
	fs[0] = (((Class266) this).aFloat4335 * f
		 + ((Class266) this).aFloat4343 * f_281_
		 + ((Class266) this).aFloat4341 * f_282_
		 + ((Class266) this).aFloat4334);
	fs[1] = (((Class266) this).aFloat4336 * f
		 + ((Class266) this).aFloat4339 * f_281_
		 + ((Class266) this).aFloat4338 * f_282_
		 + ((Class266) this).aFloat4345);
	fs[2] = (((Class266) this).aFloat4344 * f
		 + ((Class266) this).aFloat4340 * f_281_
		 + ((Class266) this).aFloat4337 * f_282_
		 + ((Class266) this).aFloat4346);
    }
    
    public void method5183(float f, float f_283_, float f_284_, float[] fs) {
	f -= ((Class266) this).aFloat4334;
	f_283_ -= ((Class266) this).aFloat4345;
	f_284_ -= ((Class266) this).aFloat4346;
	fs[0] = (float) (int) (((Class266) this).aFloat4335 * f
			       + ((Class266) this).aFloat4336 * f_283_
			       + ((Class266) this).aFloat4344 * f_284_);
	fs[1] = (float) (int) (((Class266) this).aFloat4343 * f
			       + ((Class266) this).aFloat4339 * f_283_
			       + ((Class266) this).aFloat4340 * f_284_);
	fs[2] = (float) (int) (((Class266) this).aFloat4341 * f
			       + ((Class266) this).aFloat4338 * f_283_
			       + ((Class266) this).aFloat4337 * f_284_);
    }
    
    public void method5184(float f, float f_285_, float f_286_, float[] fs) {
	f -= ((Class266) this).aFloat4334;
	f_285_ -= ((Class266) this).aFloat4345;
	f_286_ -= ((Class266) this).aFloat4346;
	fs[0] = (float) (int) (((Class266) this).aFloat4335 * f
			       + ((Class266) this).aFloat4336 * f_285_
			       + ((Class266) this).aFloat4344 * f_286_);
	fs[1] = (float) (int) (((Class266) this).aFloat4343 * f
			       + ((Class266) this).aFloat4339 * f_285_
			       + ((Class266) this).aFloat4340 * f_286_);
	fs[2] = (float) (int) (((Class266) this).aFloat4341 * f
			       + ((Class266) this).aFloat4338 * f_285_
			       + ((Class266) this).aFloat4337 * f_286_);
    }
    
    public void method5185(float f, float f_287_, float f_288_, float[] fs) {
	f -= ((Class266) this).aFloat4334;
	f_287_ -= ((Class266) this).aFloat4345;
	f_288_ -= ((Class266) this).aFloat4346;
	fs[0] = (float) (int) (((Class266) this).aFloat4335 * f
			       + ((Class266) this).aFloat4336 * f_287_
			       + ((Class266) this).aFloat4344 * f_288_);
	fs[1] = (float) (int) (((Class266) this).aFloat4343 * f
			       + ((Class266) this).aFloat4339 * f_287_
			       + ((Class266) this).aFloat4340 * f_288_);
	fs[2] = (float) (int) (((Class266) this).aFloat4341 * f
			       + ((Class266) this).aFloat4338 * f_287_
			       + ((Class266) this).aFloat4337 * f_288_);
    }
    
    public void method5186(Class276 class276) {
	method5126(class276.aClass278_4385);
	method5132(class276.aClass287_4386);
    }
    
    public float[] method5187(float[] fs) {
	fs[0] = ((Class266) this).aFloat4334;
	fs[1] = ((Class266) this).aFloat4345;
	fs[2] = ((Class266) this).aFloat4346;
	return fs;
    }
    
    public float[] method5188(float[] fs) {
	fs[0] = ((Class266) this).aFloat4334;
	fs[1] = ((Class266) this).aFloat4345;
	fs[2] = ((Class266) this).aFloat4346;
	return fs;
    }
    
    public void method5189(float f, float f_289_, float f_290_) {
	((Class266) this).aFloat4335 *= f;
	((Class266) this).aFloat4343 *= f;
	((Class266) this).aFloat4341 *= f;
	((Class266) this).aFloat4334 *= f;
	((Class266) this).aFloat4336 *= f_289_;
	((Class266) this).aFloat4339 *= f_289_;
	((Class266) this).aFloat4338 *= f_289_;
	((Class266) this).aFloat4345 *= f_289_;
	((Class266) this).aFloat4344 *= f_290_;
	((Class266) this).aFloat4340 *= f_290_;
	((Class266) this).aFloat4337 *= f_290_;
	((Class266) this).aFloat4346 *= f_290_;
    }
}
