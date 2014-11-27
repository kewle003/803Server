/* Class268 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public final class Class268
{
    public float[] aFloatArray4353;
    public static Class268 aClass268_4354 = new Class268();
    
    public void method5197(float f, float f_0_, float f_1_) {
	method5211(-10000.0F / f_1_, 10000.0F / f_1_, -10000.0F / f_1_,
		   10000.0F / f_1_, f, f_0_);
    }
    
    public Class268(Class268 class268_2_) {
	aFloatArray4353 = new float[16];
	method5199(class268_2_);
    }
    
    public void method5198() {
	aFloatArray4353[0] = 1.0F;
	aFloatArray4353[1] = 0.0F;
	aFloatArray4353[2] = 0.0F;
	aFloatArray4353[3] = 0.0F;
	aFloatArray4353[4] = 0.0F;
	aFloatArray4353[5] = 1.0F;
	aFloatArray4353[6] = 0.0F;
	aFloatArray4353[7] = 0.0F;
	aFloatArray4353[8] = 0.0F;
	aFloatArray4353[9] = 0.0F;
	aFloatArray4353[10] = 1.0F;
	aFloatArray4353[11] = 0.0F;
	aFloatArray4353[12] = 0.0F;
	aFloatArray4353[13] = 0.0F;
	aFloatArray4353[14] = 0.0F;
	aFloatArray4353[15] = 1.0F;
    }
    
    public void method5199(Class268 class268_3_) {
	System.arraycopy(class268_3_.aFloatArray4353, 0, aFloatArray4353, 0,
			 16);
    }
    
    public void method5200(Class268 class268_4_) {
	System.arraycopy(class268_4_.aFloatArray4353, 0, aFloatArray4353, 0,
			 11);
	aFloatArray4353[3] = 0.0F;
	aFloatArray4353[7] = 0.0F;
	aFloatArray4353[11] = 0.0F;
	aFloatArray4353[12] = 0.0F;
	aFloatArray4353[13] = 0.0F;
	aFloatArray4353[14] = 0.0F;
	aFloatArray4353[15] = 1.0F;
    }
    
    public void method5201(Class268 class268_5_, Class268 class268_6_) {
	float f
	    = (class268_5_.aFloatArray4353[0] * class268_6_.aFloatArray4353[0]
	       + (class268_5_.aFloatArray4353[1]
		  * class268_6_.aFloatArray4353[4])
	       + (class268_5_.aFloatArray4353[2]
		  * class268_6_.aFloatArray4353[8])
	       + (class268_5_.aFloatArray4353[3]
		  * class268_6_.aFloatArray4353[12]));
	float f_7_
	    = (class268_5_.aFloatArray4353[0] * class268_6_.aFloatArray4353[1]
	       + (class268_5_.aFloatArray4353[1]
		  * class268_6_.aFloatArray4353[5])
	       + (class268_5_.aFloatArray4353[2]
		  * class268_6_.aFloatArray4353[9])
	       + (class268_5_.aFloatArray4353[3]
		  * class268_6_.aFloatArray4353[13]));
	float f_8_
	    = (class268_5_.aFloatArray4353[0] * class268_6_.aFloatArray4353[2]
	       + (class268_5_.aFloatArray4353[1]
		  * class268_6_.aFloatArray4353[6])
	       + (class268_5_.aFloatArray4353[2]
		  * class268_6_.aFloatArray4353[10])
	       + (class268_5_.aFloatArray4353[3]
		  * class268_6_.aFloatArray4353[14]));
	float f_9_
	    = (class268_5_.aFloatArray4353[0] * class268_6_.aFloatArray4353[3]
	       + (class268_5_.aFloatArray4353[1]
		  * class268_6_.aFloatArray4353[7])
	       + (class268_5_.aFloatArray4353[2]
		  * class268_6_.aFloatArray4353[11])
	       + (class268_5_.aFloatArray4353[3]
		  * class268_6_.aFloatArray4353[15]));
	float f_10_
	    = (class268_5_.aFloatArray4353[4] * class268_6_.aFloatArray4353[0]
	       + (class268_5_.aFloatArray4353[5]
		  * class268_6_.aFloatArray4353[4])
	       + (class268_5_.aFloatArray4353[6]
		  * class268_6_.aFloatArray4353[8])
	       + (class268_5_.aFloatArray4353[7]
		  * class268_6_.aFloatArray4353[12]));
	float f_11_
	    = (class268_5_.aFloatArray4353[4] * class268_6_.aFloatArray4353[1]
	       + (class268_5_.aFloatArray4353[5]
		  * class268_6_.aFloatArray4353[5])
	       + (class268_5_.aFloatArray4353[6]
		  * class268_6_.aFloatArray4353[9])
	       + (class268_5_.aFloatArray4353[7]
		  * class268_6_.aFloatArray4353[13]));
	float f_12_
	    = (class268_5_.aFloatArray4353[4] * class268_6_.aFloatArray4353[2]
	       + (class268_5_.aFloatArray4353[5]
		  * class268_6_.aFloatArray4353[6])
	       + (class268_5_.aFloatArray4353[6]
		  * class268_6_.aFloatArray4353[10])
	       + (class268_5_.aFloatArray4353[7]
		  * class268_6_.aFloatArray4353[14]));
	float f_13_
	    = (class268_5_.aFloatArray4353[4] * class268_6_.aFloatArray4353[3]
	       + (class268_5_.aFloatArray4353[5]
		  * class268_6_.aFloatArray4353[7])
	       + (class268_5_.aFloatArray4353[6]
		  * class268_6_.aFloatArray4353[11])
	       + (class268_5_.aFloatArray4353[7]
		  * class268_6_.aFloatArray4353[15]));
	float f_14_
	    = (class268_5_.aFloatArray4353[8] * class268_6_.aFloatArray4353[0]
	       + (class268_5_.aFloatArray4353[9]
		  * class268_6_.aFloatArray4353[4])
	       + (class268_5_.aFloatArray4353[10]
		  * class268_6_.aFloatArray4353[8])
	       + (class268_5_.aFloatArray4353[11]
		  * class268_6_.aFloatArray4353[12]));
	float f_15_
	    = (class268_5_.aFloatArray4353[8] * class268_6_.aFloatArray4353[1]
	       + (class268_5_.aFloatArray4353[9]
		  * class268_6_.aFloatArray4353[5])
	       + (class268_5_.aFloatArray4353[10]
		  * class268_6_.aFloatArray4353[9])
	       + (class268_5_.aFloatArray4353[11]
		  * class268_6_.aFloatArray4353[13]));
	float f_16_
	    = (class268_5_.aFloatArray4353[8] * class268_6_.aFloatArray4353[2]
	       + (class268_5_.aFloatArray4353[9]
		  * class268_6_.aFloatArray4353[6])
	       + (class268_5_.aFloatArray4353[10]
		  * class268_6_.aFloatArray4353[10])
	       + (class268_5_.aFloatArray4353[11]
		  * class268_6_.aFloatArray4353[14]));
	float f_17_
	    = (class268_5_.aFloatArray4353[8] * class268_6_.aFloatArray4353[3]
	       + (class268_5_.aFloatArray4353[9]
		  * class268_6_.aFloatArray4353[7])
	       + (class268_5_.aFloatArray4353[10]
		  * class268_6_.aFloatArray4353[11])
	       + (class268_5_.aFloatArray4353[11]
		  * class268_6_.aFloatArray4353[15]));
	float f_18_
	    = (class268_5_.aFloatArray4353[12] * class268_6_.aFloatArray4353[0]
	       + (class268_5_.aFloatArray4353[13]
		  * class268_6_.aFloatArray4353[4])
	       + (class268_5_.aFloatArray4353[14]
		  * class268_6_.aFloatArray4353[8])
	       + (class268_5_.aFloatArray4353[15]
		  * class268_6_.aFloatArray4353[12]));
	float f_19_
	    = (class268_5_.aFloatArray4353[12] * class268_6_.aFloatArray4353[1]
	       + (class268_5_.aFloatArray4353[13]
		  * class268_6_.aFloatArray4353[5])
	       + (class268_5_.aFloatArray4353[14]
		  * class268_6_.aFloatArray4353[9])
	       + (class268_5_.aFloatArray4353[15]
		  * class268_6_.aFloatArray4353[13]));
	float f_20_
	    = (class268_5_.aFloatArray4353[12] * class268_6_.aFloatArray4353[2]
	       + (class268_5_.aFloatArray4353[13]
		  * class268_6_.aFloatArray4353[6])
	       + (class268_5_.aFloatArray4353[14]
		  * class268_6_.aFloatArray4353[10])
	       + (class268_5_.aFloatArray4353[15]
		  * class268_6_.aFloatArray4353[14]));
	float f_21_
	    = (class268_5_.aFloatArray4353[12] * class268_6_.aFloatArray4353[3]
	       + (class268_5_.aFloatArray4353[13]
		  * class268_6_.aFloatArray4353[7])
	       + (class268_5_.aFloatArray4353[14]
		  * class268_6_.aFloatArray4353[11])
	       + (class268_5_.aFloatArray4353[15]
		  * class268_6_.aFloatArray4353[15]));
	aFloatArray4353[0] = f;
	aFloatArray4353[1] = f_7_;
	aFloatArray4353[2] = f_8_;
	aFloatArray4353[3] = f_9_;
	aFloatArray4353[4] = f_10_;
	aFloatArray4353[5] = f_11_;
	aFloatArray4353[6] = f_12_;
	aFloatArray4353[7] = f_13_;
	aFloatArray4353[8] = f_14_;
	aFloatArray4353[9] = f_15_;
	aFloatArray4353[10] = f_16_;
	aFloatArray4353[11] = f_17_;
	aFloatArray4353[12] = f_18_;
	aFloatArray4353[13] = f_19_;
	aFloatArray4353[14] = f_20_;
	aFloatArray4353[15] = f_21_;
    }
    
    public void method5202(Class268 class268_22_) {
	float f = (aFloatArray4353[0] * class268_22_.aFloatArray4353[0]
		   + aFloatArray4353[1] * class268_22_.aFloatArray4353[4]
		   + aFloatArray4353[2] * class268_22_.aFloatArray4353[8]
		   + aFloatArray4353[3] * class268_22_.aFloatArray4353[12]);
	float f_23_
	    = (aFloatArray4353[0] * class268_22_.aFloatArray4353[1]
	       + aFloatArray4353[1] * class268_22_.aFloatArray4353[5]
	       + aFloatArray4353[2] * class268_22_.aFloatArray4353[9]
	       + aFloatArray4353[3] * class268_22_.aFloatArray4353[13]);
	float f_24_
	    = (aFloatArray4353[0] * class268_22_.aFloatArray4353[2]
	       + aFloatArray4353[1] * class268_22_.aFloatArray4353[6]
	       + aFloatArray4353[2] * class268_22_.aFloatArray4353[10]
	       + aFloatArray4353[3] * class268_22_.aFloatArray4353[14]);
	float f_25_
	    = (aFloatArray4353[0] * class268_22_.aFloatArray4353[3]
	       + aFloatArray4353[1] * class268_22_.aFloatArray4353[7]
	       + aFloatArray4353[2] * class268_22_.aFloatArray4353[11]
	       + aFloatArray4353[3] * class268_22_.aFloatArray4353[15]);
	float f_26_
	    = (aFloatArray4353[4] * class268_22_.aFloatArray4353[0]
	       + aFloatArray4353[5] * class268_22_.aFloatArray4353[4]
	       + aFloatArray4353[6] * class268_22_.aFloatArray4353[8]
	       + aFloatArray4353[7] * class268_22_.aFloatArray4353[12]);
	float f_27_
	    = (aFloatArray4353[4] * class268_22_.aFloatArray4353[1]
	       + aFloatArray4353[5] * class268_22_.aFloatArray4353[5]
	       + aFloatArray4353[6] * class268_22_.aFloatArray4353[9]
	       + aFloatArray4353[7] * class268_22_.aFloatArray4353[13]);
	float f_28_
	    = (aFloatArray4353[4] * class268_22_.aFloatArray4353[2]
	       + aFloatArray4353[5] * class268_22_.aFloatArray4353[6]
	       + aFloatArray4353[6] * class268_22_.aFloatArray4353[10]
	       + aFloatArray4353[7] * class268_22_.aFloatArray4353[14]);
	float f_29_
	    = (aFloatArray4353[4] * class268_22_.aFloatArray4353[3]
	       + aFloatArray4353[5] * class268_22_.aFloatArray4353[7]
	       + aFloatArray4353[6] * class268_22_.aFloatArray4353[11]
	       + aFloatArray4353[7] * class268_22_.aFloatArray4353[15]);
	float f_30_
	    = (aFloatArray4353[8] * class268_22_.aFloatArray4353[0]
	       + aFloatArray4353[9] * class268_22_.aFloatArray4353[4]
	       + aFloatArray4353[10] * class268_22_.aFloatArray4353[8]
	       + aFloatArray4353[11] * class268_22_.aFloatArray4353[12]);
	float f_31_
	    = (aFloatArray4353[8] * class268_22_.aFloatArray4353[1]
	       + aFloatArray4353[9] * class268_22_.aFloatArray4353[5]
	       + aFloatArray4353[10] * class268_22_.aFloatArray4353[9]
	       + aFloatArray4353[11] * class268_22_.aFloatArray4353[13]);
	float f_32_
	    = (aFloatArray4353[8] * class268_22_.aFloatArray4353[2]
	       + aFloatArray4353[9] * class268_22_.aFloatArray4353[6]
	       + aFloatArray4353[10] * class268_22_.aFloatArray4353[10]
	       + aFloatArray4353[11] * class268_22_.aFloatArray4353[14]);
	float f_33_
	    = (aFloatArray4353[8] * class268_22_.aFloatArray4353[3]
	       + aFloatArray4353[9] * class268_22_.aFloatArray4353[7]
	       + aFloatArray4353[10] * class268_22_.aFloatArray4353[11]
	       + aFloatArray4353[11] * class268_22_.aFloatArray4353[15]);
	float f_34_
	    = (aFloatArray4353[12] * class268_22_.aFloatArray4353[0]
	       + aFloatArray4353[13] * class268_22_.aFloatArray4353[4]
	       + aFloatArray4353[14] * class268_22_.aFloatArray4353[8]
	       + aFloatArray4353[15] * class268_22_.aFloatArray4353[12]);
	float f_35_
	    = (aFloatArray4353[12] * class268_22_.aFloatArray4353[1]
	       + aFloatArray4353[13] * class268_22_.aFloatArray4353[5]
	       + aFloatArray4353[14] * class268_22_.aFloatArray4353[9]
	       + aFloatArray4353[15] * class268_22_.aFloatArray4353[13]);
	float f_36_
	    = (aFloatArray4353[12] * class268_22_.aFloatArray4353[2]
	       + aFloatArray4353[13] * class268_22_.aFloatArray4353[6]
	       + aFloatArray4353[14] * class268_22_.aFloatArray4353[10]
	       + aFloatArray4353[15] * class268_22_.aFloatArray4353[14]);
	float f_37_
	    = (aFloatArray4353[12] * class268_22_.aFloatArray4353[3]
	       + aFloatArray4353[13] * class268_22_.aFloatArray4353[7]
	       + aFloatArray4353[14] * class268_22_.aFloatArray4353[11]
	       + aFloatArray4353[15] * class268_22_.aFloatArray4353[15]);
	aFloatArray4353[0] = f;
	aFloatArray4353[1] = f_23_;
	aFloatArray4353[2] = f_24_;
	aFloatArray4353[3] = f_25_;
	aFloatArray4353[4] = f_26_;
	aFloatArray4353[5] = f_27_;
	aFloatArray4353[6] = f_28_;
	aFloatArray4353[7] = f_29_;
	aFloatArray4353[8] = f_30_;
	aFloatArray4353[9] = f_31_;
	aFloatArray4353[10] = f_32_;
	aFloatArray4353[11] = f_33_;
	aFloatArray4353[12] = f_34_;
	aFloatArray4353[13] = f_35_;
	aFloatArray4353[14] = f_36_;
	aFloatArray4353[15] = f_37_;
    }
    
    public void method5203(Class266 class266) {
	aFloatArray4353[0] = ((Class266) class266).aFloat4335;
	aFloatArray4353[1] = ((Class266) class266).aFloat4336;
	aFloatArray4353[2] = ((Class266) class266).aFloat4344;
	aFloatArray4353[3] = 0.0F;
	aFloatArray4353[4] = ((Class266) class266).aFloat4343;
	aFloatArray4353[5] = ((Class266) class266).aFloat4339;
	aFloatArray4353[6] = ((Class266) class266).aFloat4340;
	aFloatArray4353[7] = 0.0F;
	aFloatArray4353[8] = ((Class266) class266).aFloat4341;
	aFloatArray4353[9] = ((Class266) class266).aFloat4338;
	aFloatArray4353[10] = ((Class266) class266).aFloat4337;
	aFloatArray4353[11] = 0.0F;
	aFloatArray4353[12] = ((Class266) class266).aFloat4334;
	aFloatArray4353[13] = ((Class266) class266).aFloat4345;
	aFloatArray4353[14] = ((Class266) class266).aFloat4346;
	aFloatArray4353[15] = 1.0F;
    }
    
    float method5204() {
	return ((aFloatArray4353[0] * aFloatArray4353[5] * aFloatArray4353[10]
		 * aFloatArray4353[15])
		- (aFloatArray4353[0] * aFloatArray4353[5]
		   * aFloatArray4353[11] * aFloatArray4353[14])
		- (aFloatArray4353[0] * aFloatArray4353[6] * aFloatArray4353[9]
		   * aFloatArray4353[15])
		+ (aFloatArray4353[0] * aFloatArray4353[6]
		   * aFloatArray4353[11] * aFloatArray4353[13])
		+ (aFloatArray4353[0] * aFloatArray4353[7] * aFloatArray4353[9]
		   * aFloatArray4353[14])
		- (aFloatArray4353[0] * aFloatArray4353[7]
		   * aFloatArray4353[10] * aFloatArray4353[13])
		- (aFloatArray4353[1] * aFloatArray4353[4]
		   * aFloatArray4353[10] * aFloatArray4353[15])
		+ (aFloatArray4353[1] * aFloatArray4353[4]
		   * aFloatArray4353[11] * aFloatArray4353[14])
		+ (aFloatArray4353[1] * aFloatArray4353[6] * aFloatArray4353[8]
		   * aFloatArray4353[15])
		- (aFloatArray4353[1] * aFloatArray4353[6]
		   * aFloatArray4353[11] * aFloatArray4353[12])
		- (aFloatArray4353[1] * aFloatArray4353[7] * aFloatArray4353[8]
		   * aFloatArray4353[14])
		+ (aFloatArray4353[1] * aFloatArray4353[7]
		   * aFloatArray4353[10] * aFloatArray4353[12])
		+ (aFloatArray4353[2] * aFloatArray4353[4] * aFloatArray4353[9]
		   * aFloatArray4353[15])
		- (aFloatArray4353[2] * aFloatArray4353[4]
		   * aFloatArray4353[11] * aFloatArray4353[13])
		- (aFloatArray4353[2] * aFloatArray4353[5] * aFloatArray4353[8]
		   * aFloatArray4353[15])
		+ (aFloatArray4353[2] * aFloatArray4353[5]
		   * aFloatArray4353[11] * aFloatArray4353[12])
		+ (aFloatArray4353[2] * aFloatArray4353[7] * aFloatArray4353[8]
		   * aFloatArray4353[13])
		- (aFloatArray4353[2] * aFloatArray4353[7] * aFloatArray4353[9]
		   * aFloatArray4353[12])
		- (aFloatArray4353[3] * aFloatArray4353[4] * aFloatArray4353[9]
		   * aFloatArray4353[14])
		+ (aFloatArray4353[3] * aFloatArray4353[4]
		   * aFloatArray4353[10] * aFloatArray4353[13])
		+ (aFloatArray4353[3] * aFloatArray4353[5] * aFloatArray4353[8]
		   * aFloatArray4353[14])
		- (aFloatArray4353[3] * aFloatArray4353[5]
		   * aFloatArray4353[10] * aFloatArray4353[12])
		- (aFloatArray4353[3] * aFloatArray4353[6] * aFloatArray4353[8]
		   * aFloatArray4353[13])
		+ (aFloatArray4353[3] * aFloatArray4353[6] * aFloatArray4353[9]
		   * aFloatArray4353[12]));
    }
    
    public void method5205() {
	float f = 1.0F / method5204();
	float f_38_
	    = (aFloatArray4353[5] * aFloatArray4353[10] * aFloatArray4353[15]
	       - aFloatArray4353[5] * aFloatArray4353[11] * aFloatArray4353[14]
	       - aFloatArray4353[6] * aFloatArray4353[9] * aFloatArray4353[15]
	       + aFloatArray4353[6] * aFloatArray4353[11] * aFloatArray4353[13]
	       + aFloatArray4353[7] * aFloatArray4353[9] * aFloatArray4353[14]
	       - (aFloatArray4353[7] * aFloatArray4353[10]
		  * aFloatArray4353[13])) * f;
	float f_39_
	    = (-aFloatArray4353[1] * aFloatArray4353[10] * aFloatArray4353[15]
	       + aFloatArray4353[1] * aFloatArray4353[11] * aFloatArray4353[14]
	       + aFloatArray4353[2] * aFloatArray4353[9] * aFloatArray4353[15]
	       - aFloatArray4353[2] * aFloatArray4353[11] * aFloatArray4353[13]
	       - aFloatArray4353[3] * aFloatArray4353[9] * aFloatArray4353[14]
	       + (aFloatArray4353[3] * aFloatArray4353[10]
		  * aFloatArray4353[13])) * f;
	float f_40_
	    = ((aFloatArray4353[1] * aFloatArray4353[6] * aFloatArray4353[15]
		- aFloatArray4353[1] * aFloatArray4353[7] * aFloatArray4353[14]
		- aFloatArray4353[2] * aFloatArray4353[5] * aFloatArray4353[15]
		+ aFloatArray4353[2] * aFloatArray4353[7] * aFloatArray4353[13]
		+ aFloatArray4353[3] * aFloatArray4353[5] * aFloatArray4353[14]
		- (aFloatArray4353[3] * aFloatArray4353[6]
		   * aFloatArray4353[13]))
	       * f);
	float f_41_
	    = ((-aFloatArray4353[1] * aFloatArray4353[6] * aFloatArray4353[11]
		+ aFloatArray4353[1] * aFloatArray4353[7] * aFloatArray4353[10]
		+ aFloatArray4353[2] * aFloatArray4353[5] * aFloatArray4353[11]
		- aFloatArray4353[2] * aFloatArray4353[7] * aFloatArray4353[9]
		- aFloatArray4353[3] * aFloatArray4353[5] * aFloatArray4353[10]
		+ aFloatArray4353[3] * aFloatArray4353[6] * aFloatArray4353[9])
	       * f);
	float f_42_
	    = (-aFloatArray4353[4] * aFloatArray4353[10] * aFloatArray4353[15]
	       + aFloatArray4353[4] * aFloatArray4353[11] * aFloatArray4353[14]
	       + aFloatArray4353[6] * aFloatArray4353[8] * aFloatArray4353[15]
	       - aFloatArray4353[6] * aFloatArray4353[11] * aFloatArray4353[12]
	       - aFloatArray4353[7] * aFloatArray4353[8] * aFloatArray4353[14]
	       + (aFloatArray4353[7] * aFloatArray4353[10]
		  * aFloatArray4353[12])) * f;
	float f_43_
	    = (aFloatArray4353[0] * aFloatArray4353[10] * aFloatArray4353[15]
	       - aFloatArray4353[0] * aFloatArray4353[11] * aFloatArray4353[14]
	       - aFloatArray4353[2] * aFloatArray4353[8] * aFloatArray4353[15]
	       + aFloatArray4353[2] * aFloatArray4353[11] * aFloatArray4353[12]
	       + aFloatArray4353[3] * aFloatArray4353[8] * aFloatArray4353[14]
	       - (aFloatArray4353[3] * aFloatArray4353[10]
		  * aFloatArray4353[12])) * f;
	float f_44_
	    = ((-aFloatArray4353[0] * aFloatArray4353[6] * aFloatArray4353[15]
		+ aFloatArray4353[0] * aFloatArray4353[7] * aFloatArray4353[14]
		+ aFloatArray4353[2] * aFloatArray4353[4] * aFloatArray4353[15]
		- aFloatArray4353[2] * aFloatArray4353[7] * aFloatArray4353[12]
		- aFloatArray4353[3] * aFloatArray4353[4] * aFloatArray4353[14]
		+ (aFloatArray4353[3] * aFloatArray4353[6]
		   * aFloatArray4353[12]))
	       * f);
	float f_45_
	    = ((aFloatArray4353[0] * aFloatArray4353[6] * aFloatArray4353[11]
		- aFloatArray4353[0] * aFloatArray4353[7] * aFloatArray4353[10]
		- aFloatArray4353[2] * aFloatArray4353[4] * aFloatArray4353[11]
		+ aFloatArray4353[2] * aFloatArray4353[7] * aFloatArray4353[8]
		+ aFloatArray4353[3] * aFloatArray4353[4] * aFloatArray4353[10]
		- aFloatArray4353[3] * aFloatArray4353[6] * aFloatArray4353[8])
	       * f);
	float f_46_
	    = (aFloatArray4353[4] * aFloatArray4353[9] * aFloatArray4353[15]
	       - aFloatArray4353[4] * aFloatArray4353[11] * aFloatArray4353[13]
	       - aFloatArray4353[5] * aFloatArray4353[8] * aFloatArray4353[15]
	       + aFloatArray4353[5] * aFloatArray4353[11] * aFloatArray4353[12]
	       + aFloatArray4353[7] * aFloatArray4353[8] * aFloatArray4353[13]
	       - (aFloatArray4353[7] * aFloatArray4353[9]
		  * aFloatArray4353[12])) * f;
	float f_47_
	    = (-aFloatArray4353[0] * aFloatArray4353[9] * aFloatArray4353[15]
	       + aFloatArray4353[0] * aFloatArray4353[11] * aFloatArray4353[13]
	       + aFloatArray4353[1] * aFloatArray4353[8] * aFloatArray4353[15]
	       - aFloatArray4353[1] * aFloatArray4353[11] * aFloatArray4353[12]
	       - aFloatArray4353[3] * aFloatArray4353[8] * aFloatArray4353[13]
	       + (aFloatArray4353[3] * aFloatArray4353[9]
		  * aFloatArray4353[12])) * f;
	float f_48_
	    = ((aFloatArray4353[0] * aFloatArray4353[5] * aFloatArray4353[15]
		- aFloatArray4353[0] * aFloatArray4353[7] * aFloatArray4353[13]
		- aFloatArray4353[1] * aFloatArray4353[4] * aFloatArray4353[15]
		+ aFloatArray4353[1] * aFloatArray4353[7] * aFloatArray4353[12]
		+ aFloatArray4353[3] * aFloatArray4353[4] * aFloatArray4353[13]
		- (aFloatArray4353[3] * aFloatArray4353[5]
		   * aFloatArray4353[12]))
	       * f);
	float f_49_
	    = ((-aFloatArray4353[0] * aFloatArray4353[5] * aFloatArray4353[11]
		+ aFloatArray4353[0] * aFloatArray4353[7] * aFloatArray4353[9]
		+ aFloatArray4353[1] * aFloatArray4353[4] * aFloatArray4353[11]
		- aFloatArray4353[1] * aFloatArray4353[7] * aFloatArray4353[8]
		- aFloatArray4353[3] * aFloatArray4353[4] * aFloatArray4353[9]
		+ aFloatArray4353[3] * aFloatArray4353[5] * aFloatArray4353[8])
	       * f);
	float f_50_
	    = (-aFloatArray4353[4] * aFloatArray4353[9] * aFloatArray4353[14]
	       + aFloatArray4353[4] * aFloatArray4353[10] * aFloatArray4353[13]
	       + aFloatArray4353[5] * aFloatArray4353[8] * aFloatArray4353[14]
	       - aFloatArray4353[5] * aFloatArray4353[10] * aFloatArray4353[12]
	       - aFloatArray4353[6] * aFloatArray4353[8] * aFloatArray4353[13]
	       + (aFloatArray4353[6] * aFloatArray4353[9]
		  * aFloatArray4353[12])) * f;
	float f_51_
	    = (aFloatArray4353[0] * aFloatArray4353[9] * aFloatArray4353[14]
	       - aFloatArray4353[0] * aFloatArray4353[10] * aFloatArray4353[13]
	       - aFloatArray4353[1] * aFloatArray4353[8] * aFloatArray4353[14]
	       + aFloatArray4353[1] * aFloatArray4353[10] * aFloatArray4353[12]
	       + aFloatArray4353[2] * aFloatArray4353[8] * aFloatArray4353[13]
	       - (aFloatArray4353[2] * aFloatArray4353[9]
		  * aFloatArray4353[12])) * f;
	float f_52_
	    = ((-aFloatArray4353[0] * aFloatArray4353[5] * aFloatArray4353[14]
		+ aFloatArray4353[0] * aFloatArray4353[6] * aFloatArray4353[13]
		+ aFloatArray4353[1] * aFloatArray4353[4] * aFloatArray4353[14]
		- aFloatArray4353[1] * aFloatArray4353[6] * aFloatArray4353[12]
		- aFloatArray4353[2] * aFloatArray4353[4] * aFloatArray4353[13]
		+ (aFloatArray4353[2] * aFloatArray4353[5]
		   * aFloatArray4353[12]))
	       * f);
	float f_53_
	    = ((aFloatArray4353[0] * aFloatArray4353[5] * aFloatArray4353[10]
		- aFloatArray4353[0] * aFloatArray4353[6] * aFloatArray4353[9]
		- aFloatArray4353[1] * aFloatArray4353[4] * aFloatArray4353[10]
		+ aFloatArray4353[1] * aFloatArray4353[6] * aFloatArray4353[8]
		+ aFloatArray4353[2] * aFloatArray4353[4] * aFloatArray4353[9]
		- aFloatArray4353[2] * aFloatArray4353[5] * aFloatArray4353[8])
	       * f);
	aFloatArray4353[0] = f_38_;
	aFloatArray4353[1] = f_39_;
	aFloatArray4353[2] = f_40_;
	aFloatArray4353[3] = f_41_;
	aFloatArray4353[4] = f_42_;
	aFloatArray4353[5] = f_43_;
	aFloatArray4353[6] = f_44_;
	aFloatArray4353[7] = f_45_;
	aFloatArray4353[8] = f_46_;
	aFloatArray4353[9] = f_47_;
	aFloatArray4353[10] = f_48_;
	aFloatArray4353[11] = f_49_;
	aFloatArray4353[12] = f_50_;
	aFloatArray4353[13] = f_51_;
	aFloatArray4353[14] = f_52_;
	aFloatArray4353[15] = f_53_;
    }
    
    public void method5206(float f, float f_54_, float f_55_, float f_56_) {
	aFloatArray4353[0] = f;
	aFloatArray4353[1] = 0.0F;
	aFloatArray4353[2] = 0.0F;
	aFloatArray4353[3] = 0.0F;
	aFloatArray4353[4] = 0.0F;
	aFloatArray4353[5] = f_54_;
	aFloatArray4353[6] = 0.0F;
	aFloatArray4353[7] = 0.0F;
	aFloatArray4353[8] = 0.0F;
	aFloatArray4353[9] = 0.0F;
	aFloatArray4353[10] = f_55_;
	aFloatArray4353[11] = 0.0F;
	aFloatArray4353[12] = 0.0F;
	aFloatArray4353[13] = 0.0F;
	aFloatArray4353[14] = 0.0F;
	aFloatArray4353[15] = f_56_;
    }
    
    public float[] method5207(float[] fs) {
	fs[0] = aFloatArray4353[0];
	fs[1] = aFloatArray4353[1];
	fs[2] = aFloatArray4353[4];
	fs[3] = aFloatArray4353[5];
	fs[4] = aFloatArray4353[8];
	fs[5] = aFloatArray4353[9];
	fs[6] = aFloatArray4353[12];
	fs[7] = aFloatArray4353[13];
	return fs;
    }
    
    public void method5208(float f, float f_57_, float f_58_, float[] fs) {
	fs[0] = (aFloatArray4353[0] * f + aFloatArray4353[4] * f_57_
		 + aFloatArray4353[8] * f_58_ + aFloatArray4353[12]);
	fs[1] = (aFloatArray4353[1] * f + aFloatArray4353[5] * f_57_
		 + aFloatArray4353[9] * f_58_ + aFloatArray4353[13]);
	fs[2] = (aFloatArray4353[2] * f + aFloatArray4353[6] * f_57_
		 + aFloatArray4353[10] * f_58_ + aFloatArray4353[14]);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4353[3] * f + aFloatArray4353[7] * f_57_
		     + aFloatArray4353[11] * f_58_ + aFloatArray4353[15]);
    }
    
    public void method5209(float[] fs) {
	float f = fs[0];
	float f_59_ = fs[1];
	float f_60_ = fs[2];
	fs[0] = (aFloatArray4353[0] * f + aFloatArray4353[4] * f_59_
		 + aFloatArray4353[8] * f_60_ + aFloatArray4353[12]);
	fs[1] = (aFloatArray4353[1] * f + aFloatArray4353[5] * f_59_
		 + aFloatArray4353[9] * f_60_ + aFloatArray4353[13]);
	fs[2] = (aFloatArray4353[2] * f + aFloatArray4353[6] * f_59_
		 + aFloatArray4353[10] * f_60_ + aFloatArray4353[14]);
    }
    
    public void method5210(float f, float f_61_, float f_62_, float[] fs) {
	fs[0] = (aFloatArray4353[0] * f + aFloatArray4353[4] * f_61_
		 + aFloatArray4353[8] * f_62_);
	fs[1] = (aFloatArray4353[1] * f + aFloatArray4353[5] * f_61_
		 + aFloatArray4353[9] * f_62_);
	fs[2] = (aFloatArray4353[2] * f + aFloatArray4353[6] * f_61_
		 + aFloatArray4353[10] * f_62_);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4353[3] * f + aFloatArray4353[7] * f_61_
		     + aFloatArray4353[11] * f_62_);
    }
    
    public void method5211(float f, float f_63_, float f_64_, float f_65_,
			   float f_66_, float f_67_) {
	aFloatArray4353[0] = 2.0F / (f_63_ - f);
	aFloatArray4353[1] = 0.0F;
	aFloatArray4353[2] = 0.0F;
	aFloatArray4353[3] = 0.0F;
	aFloatArray4353[4] = 0.0F;
	aFloatArray4353[5] = 2.0F / (f_65_ - f_64_);
	aFloatArray4353[6] = 0.0F;
	aFloatArray4353[7] = 0.0F;
	aFloatArray4353[8] = 0.0F;
	aFloatArray4353[9] = 0.0F;
	aFloatArray4353[10] = 2.0F / (f_67_ - f_66_);
	aFloatArray4353[11] = 0.0F;
	aFloatArray4353[12] = -(f_63_ + f) / (f_63_ - f);
	aFloatArray4353[13] = -(f_65_ + f_64_) / (f_65_ - f_64_);
	aFloatArray4353[14] = -(f_67_ + f_66_) / (f_67_ - f_66_);
	aFloatArray4353[15] = 1.0F;
    }
    
    public void method5212(float f, float f_68_, float f_69_, float f_70_) {
	float f_71_ = (float) (Math.tan((double) (f_69_ / 2.0F)) * (double) f);
	float f_72_ = (float) (Math.tan((double) (f_70_ / 2.0F)) * (double) f);
	method5214(-f_71_, f_71_, -f_72_, f_72_, f, f_68_);
    }
    
    public void method5213(float f, float f_73_, float f_74_) {
	method5211(-10000.0F / f_74_, 10000.0F / f_74_, -10000.0F / f_74_,
		   10000.0F / f_74_, f, f_73_);
    }
    
    void method5214(float f, float f_75_, float f_76_, float f_77_,
		    float f_78_, float f_79_) {
	aFloatArray4353[0] = 2.0F * f_78_ / (f_75_ - f);
	aFloatArray4353[1] = 0.0F;
	aFloatArray4353[2] = 0.0F;
	aFloatArray4353[3] = 0.0F;
	aFloatArray4353[4] = 0.0F;
	aFloatArray4353[5] = 2.0F * f_78_ / (f_77_ - f_76_);
	aFloatArray4353[6] = 0.0F;
	aFloatArray4353[7] = 0.0F;
	aFloatArray4353[8] = (f_75_ + f) / (f_75_ - f);
	aFloatArray4353[9] = (f_77_ + f_76_) / (f_77_ - f_76_);
	aFloatArray4353[10] = (f_79_ + f_78_) / (f_79_ - f_78_);
	aFloatArray4353[11] = 1.0F;
	aFloatArray4353[12] = 0.0F;
	aFloatArray4353[13] = 0.0F;
	aFloatArray4353[14] = -(2.0F * f_79_ * f_78_) / (f_79_ - f_78_);
	aFloatArray4353[15] = 0.0F;
    }
    
    public boolean method5215() {
	return (aFloatArray4353[0] == 1.0F && aFloatArray4353[1] == 0.0F
		&& aFloatArray4353[2] == 0.0F && aFloatArray4353[3] == 0.0F
		&& aFloatArray4353[4] == 0.0F && aFloatArray4353[5] == 1.0F
		&& aFloatArray4353[6] == 0.0F && aFloatArray4353[7] == 0.0F
		&& aFloatArray4353[8] == 0.0F && aFloatArray4353[9] == 0.0F
		&& aFloatArray4353[10] == 1.0F && aFloatArray4353[11] == 0.0F
		&& aFloatArray4353[12] == 0.0F && aFloatArray4353[13] == 0.0F
		&& aFloatArray4353[14] == 0.0F && aFloatArray4353[15] == 1.0F);
    }
    
    public void method5216(float f, float f_80_, float f_81_, float f_82_,
			   float f_83_, float f_84_, float f_85_, float f_86_,
			   float f_87_) {
	method5211(-(f * f_87_) / f_81_, f_87_ * (f_85_ - f) / f_81_,
		   -(f_80_ * f_87_) / f_82_, f_87_ * (f_86_ - f_80_) / f_82_,
		   f_83_, f_84_);
    }
    
    public void method5217() {
	float f = aFloatArray4353[0];
	float f_88_ = aFloatArray4353[4];
	float f_89_ = aFloatArray4353[8];
	float f_90_ = aFloatArray4353[12];
	float f_91_ = aFloatArray4353[1];
	float f_92_ = aFloatArray4353[5];
	float f_93_ = aFloatArray4353[9];
	float f_94_ = aFloatArray4353[13];
	float f_95_ = aFloatArray4353[2];
	float f_96_ = aFloatArray4353[6];
	float f_97_ = aFloatArray4353[10];
	float f_98_ = aFloatArray4353[14];
	float f_99_ = aFloatArray4353[3];
	float f_100_ = aFloatArray4353[7];
	float f_101_ = aFloatArray4353[11];
	float f_102_ = aFloatArray4353[15];
	aFloatArray4353[0] = f;
	aFloatArray4353[1] = f_88_;
	aFloatArray4353[2] = f_89_;
	aFloatArray4353[3] = f_90_;
	aFloatArray4353[4] = f_91_;
	aFloatArray4353[5] = f_92_;
	aFloatArray4353[6] = f_93_;
	aFloatArray4353[7] = f_94_;
	aFloatArray4353[8] = f_95_;
	aFloatArray4353[9] = f_96_;
	aFloatArray4353[10] = f_97_;
	aFloatArray4353[11] = f_98_;
	aFloatArray4353[12] = f_99_;
	aFloatArray4353[13] = f_100_;
	aFloatArray4353[14] = f_101_;
	aFloatArray4353[15] = f_102_;
    }
    
    public float method5218() {
	return ((aFloatArray4353[14] - aFloatArray4353[15])
		/ (aFloatArray4353[11] - aFloatArray4353[10]));
    }
    
    public float[] method5219(float[] fs) {
	float f = aFloatArray4353[3] + aFloatArray4353[0];
	float f_103_ = aFloatArray4353[7] + aFloatArray4353[4];
	float f_104_ = aFloatArray4353[11] + aFloatArray4353[8];
	double d
	    = Math.sqrt((double) (f * f + f_103_ * f_103_ + f_104_ * f_104_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_103_ / d);
	fs[2] = (float) ((double) f_104_ / d);
	fs[3] = (float) ((double) (aFloatArray4353[15] + aFloatArray4353[12])
			 / d);
	return fs;
    }
    
    public void method5220() {
	float f = aFloatArray4353[0];
	float f_105_ = aFloatArray4353[4];
	float f_106_ = aFloatArray4353[8];
	float f_107_ = aFloatArray4353[12];
	float f_108_ = aFloatArray4353[1];
	float f_109_ = aFloatArray4353[5];
	float f_110_ = aFloatArray4353[9];
	float f_111_ = aFloatArray4353[13];
	float f_112_ = aFloatArray4353[2];
	float f_113_ = aFloatArray4353[6];
	float f_114_ = aFloatArray4353[10];
	float f_115_ = aFloatArray4353[14];
	float f_116_ = aFloatArray4353[3];
	float f_117_ = aFloatArray4353[7];
	float f_118_ = aFloatArray4353[11];
	float f_119_ = aFloatArray4353[15];
	aFloatArray4353[0] = f;
	aFloatArray4353[1] = f_105_;
	aFloatArray4353[2] = f_106_;
	aFloatArray4353[3] = f_107_;
	aFloatArray4353[4] = f_108_;
	aFloatArray4353[5] = f_109_;
	aFloatArray4353[6] = f_110_;
	aFloatArray4353[7] = f_111_;
	aFloatArray4353[8] = f_112_;
	aFloatArray4353[9] = f_113_;
	aFloatArray4353[10] = f_114_;
	aFloatArray4353[11] = f_115_;
	aFloatArray4353[12] = f_116_;
	aFloatArray4353[13] = f_117_;
	aFloatArray4353[14] = f_118_;
	aFloatArray4353[15] = f_119_;
    }
    
    public boolean method5221() {
	return (aFloatArray4353[0] == 1.0F && aFloatArray4353[1] == 0.0F
		&& aFloatArray4353[2] == 0.0F && aFloatArray4353[3] == 0.0F
		&& aFloatArray4353[4] == 0.0F && aFloatArray4353[5] == 1.0F
		&& aFloatArray4353[6] == 0.0F && aFloatArray4353[7] == 0.0F
		&& aFloatArray4353[8] == 0.0F && aFloatArray4353[9] == 0.0F
		&& aFloatArray4353[10] == 1.0F && aFloatArray4353[11] == 0.0F
		&& aFloatArray4353[12] == 0.0F && aFloatArray4353[13] == 0.0F
		&& aFloatArray4353[14] == 0.0F && aFloatArray4353[15] == 1.0F);
    }
    
    public float[] method5222(float[] fs) {
	float f = aFloatArray4353[3] - aFloatArray4353[1];
	float f_120_ = aFloatArray4353[7] - aFloatArray4353[5];
	float f_121_ = aFloatArray4353[11] - aFloatArray4353[9];
	double d
	    = Math.sqrt((double) (f * f + f_120_ * f_120_ + f_121_ * f_121_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_120_ / d);
	fs[2] = (float) ((double) f_121_ / d);
	fs[3] = (float) ((double) (aFloatArray4353[15] - aFloatArray4353[13])
			 / d);
	return fs;
    }
    
    public void method5223() {
	float f = aFloatArray4353[0];
	float f_122_ = aFloatArray4353[4];
	float f_123_ = aFloatArray4353[8];
	float f_124_ = aFloatArray4353[12];
	float f_125_ = aFloatArray4353[1];
	float f_126_ = aFloatArray4353[5];
	float f_127_ = aFloatArray4353[9];
	float f_128_ = aFloatArray4353[13];
	float f_129_ = aFloatArray4353[2];
	float f_130_ = aFloatArray4353[6];
	float f_131_ = aFloatArray4353[10];
	float f_132_ = aFloatArray4353[14];
	float f_133_ = aFloatArray4353[3];
	float f_134_ = aFloatArray4353[7];
	float f_135_ = aFloatArray4353[11];
	float f_136_ = aFloatArray4353[15];
	aFloatArray4353[0] = f;
	aFloatArray4353[1] = f_122_;
	aFloatArray4353[2] = f_123_;
	aFloatArray4353[3] = f_124_;
	aFloatArray4353[4] = f_125_;
	aFloatArray4353[5] = f_126_;
	aFloatArray4353[6] = f_127_;
	aFloatArray4353[7] = f_128_;
	aFloatArray4353[8] = f_129_;
	aFloatArray4353[9] = f_130_;
	aFloatArray4353[10] = f_131_;
	aFloatArray4353[11] = f_132_;
	aFloatArray4353[12] = f_133_;
	aFloatArray4353[13] = f_134_;
	aFloatArray4353[14] = f_135_;
	aFloatArray4353[15] = f_136_;
    }
    
    public float[] method5224(float[] fs) {
	float f = aFloatArray4353[3] + aFloatArray4353[0];
	float f_137_ = aFloatArray4353[7] + aFloatArray4353[4];
	float f_138_ = aFloatArray4353[11] + aFloatArray4353[8];
	double d
	    = Math.sqrt((double) (f * f + f_137_ * f_137_ + f_138_ * f_138_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_137_ / d);
	fs[2] = (float) ((double) f_138_ / d);
	fs[3] = (float) ((double) (aFloatArray4353[15] + aFloatArray4353[12])
			 / d);
	return fs;
    }
    
    public void method5225(float f, float f_139_, float f_140_, float[] fs) {
	fs[0] = (aFloatArray4353[0] * f + aFloatArray4353[4] * f_139_
		 + aFloatArray4353[8] * f_140_);
	fs[1] = (aFloatArray4353[1] * f + aFloatArray4353[5] * f_139_
		 + aFloatArray4353[9] * f_140_);
	fs[2] = (aFloatArray4353[2] * f + aFloatArray4353[6] * f_139_
		 + aFloatArray4353[10] * f_140_);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4353[3] * f + aFloatArray4353[7] * f_139_
		     + aFloatArray4353[11] * f_140_);
    }
    
    public float[] method5226(float[] fs) {
	float f = aFloatArray4353[3] - aFloatArray4353[2];
	float f_141_ = aFloatArray4353[7] - aFloatArray4353[6];
	float f_142_ = aFloatArray4353[11] - aFloatArray4353[10];
	double d
	    = Math.sqrt((double) (f * f + f_141_ * f_141_ + f_142_ * f_142_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_141_ / d);
	fs[2] = (float) ((double) f_142_ / d);
	fs[3] = (float) ((double) (aFloatArray4353[15] - aFloatArray4353[14])
			 / d);
	return fs;
    }
    
    public float[] method5227(float[] fs) {
	System.arraycopy(aFloatArray4353, 0, fs, 0, 16);
	fs[3] = 0.0F;
	fs[7] = 0.0F;
	fs[11] = 0.0F;
	fs[12] = 0.0F;
	fs[13] = 0.0F;
	fs[14] = 0.0F;
	fs[15] = 1.0F;
	return fs;
    }
    
    public float[] method5228(float[] fs) {
	fs[0] = aFloatArray4353[0];
	fs[1] = aFloatArray4353[1];
	fs[2] = aFloatArray4353[2];
	fs[3] = aFloatArray4353[4];
	fs[4] = aFloatArray4353[5];
	fs[5] = aFloatArray4353[6];
	fs[6] = aFloatArray4353[8];
	fs[7] = aFloatArray4353[9];
	fs[8] = aFloatArray4353[10];
	return fs;
    }
    
    public Class268() {
	aFloatArray4353 = new float[16];
	method5198();
    }
    
    public float[] method5229(float[] fs) {
	fs[0] = aFloatArray4353[0];
	fs[1] = aFloatArray4353[1];
	fs[2] = aFloatArray4353[2];
	fs[3] = aFloatArray4353[4];
	fs[4] = aFloatArray4353[5];
	fs[5] = aFloatArray4353[6];
	fs[6] = aFloatArray4353[8];
	fs[7] = aFloatArray4353[9];
	fs[8] = aFloatArray4353[10];
	return fs;
    }
    
    public float[] method5230(float[] fs) {
	fs[0] = aFloatArray4353[0];
	fs[1] = aFloatArray4353[4];
	fs[2] = aFloatArray4353[8];
	fs[3] = aFloatArray4353[12];
	fs[4] = aFloatArray4353[1];
	fs[5] = aFloatArray4353[5];
	fs[6] = aFloatArray4353[9];
	fs[7] = aFloatArray4353[13];
	return fs;
    }
    
    public float[] method5231(float[] fs) {
	fs[0] = aFloatArray4353[0];
	fs[1] = aFloatArray4353[1];
	fs[2] = 0.0F;
	fs[3] = 0.0F;
	fs[4] = aFloatArray4353[4];
	fs[5] = aFloatArray4353[5];
	fs[6] = 0.0F;
	fs[7] = 0.0F;
	fs[8] = aFloatArray4353[12];
	fs[9] = aFloatArray4353[13];
	fs[10] = aFloatArray4353[14];
	fs[11] = 0.0F;
	fs[12] = 0.0F;
	fs[13] = 0.0F;
	fs[14] = 0.0F;
	fs[15] = 1.0F;
	return fs;
    }
    
    public void method5232(int i, int i_143_, int i_144_, float f,
			   float f_145_, float f_146_) {
	if (i != 0) {
	    float f_147_ = Class269.aFloatArray4355[i & 0x3fff];
	    float f_148_ = Class269.aFloatArray4356[i & 0x3fff];
	    aFloatArray4353[0] = f_147_ * (float) i_143_;
	    aFloatArray4353[5] = f_147_ * (float) i_144_;
	    aFloatArray4353[1] = f_148_ * (float) i_143_;
	    aFloatArray4353[4] = -f_148_ * (float) i_144_;
	    aFloatArray4353[10] = 1.0F;
	    float[] fs = aFloatArray4353;
	    float[] fs_149_ = aFloatArray4353;
	    float[] fs_150_ = aFloatArray4353;
	    aFloatArray4353[9] = 0.0F;
	    fs_150_[8] = 0.0F;
	    fs_149_[6] = 0.0F;
	    fs[2] = 0.0F;
	} else {
	    aFloatArray4353[0] = (float) i_143_;
	    aFloatArray4353[5] = (float) i_144_;
	    aFloatArray4353[10] = 1.0F;
	    float[] fs = aFloatArray4353;
	    float[] fs_151_ = aFloatArray4353;
	    float[] fs_152_ = aFloatArray4353;
	    float[] fs_153_ = aFloatArray4353;
	    float[] fs_154_ = aFloatArray4353;
	    aFloatArray4353[9] = 0.0F;
	    fs_154_[8] = 0.0F;
	    fs_153_[6] = 0.0F;
	    fs_152_[4] = 0.0F;
	    fs_151_[2] = 0.0F;
	    fs[1] = 0.0F;
	}
	float[] fs = aFloatArray4353;
	float[] fs_155_ = aFloatArray4353;
	aFloatArray4353[11] = 0.0F;
	fs_155_[7] = 0.0F;
	fs[3] = 0.0F;
	aFloatArray4353[15] = 1.0F;
	aFloatArray4353[12] = f;
	aFloatArray4353[13] = f_145_;
	aFloatArray4353[14] = f_146_;
    }
    
    public String toString() {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i = 0; i < 4; i++) {
	    for (int i_156_ = 0; i_156_ < 4; i_156_++) {
		if (i_156_ > 0)
		    stringbuilder.append("\t");
		stringbuilder.append(aFloatArray4353[i * 4 + i_156_]);
	    }
	    stringbuilder.append("\n");
	}
	return stringbuilder.toString();
    }
    
    public int hashCode() {
	int i = 1;
	i = 31 * i + Arrays.hashCode(aFloatArray4353);
	return i;
    }
    
    public float[] method5233(float[] fs) {
	System.arraycopy(aFloatArray4353, 0, fs, 0, 16);
	return fs;
    }
    
    public float[] method5234(float[] fs) {
	fs[0] = aFloatArray4353[0];
	fs[1] = aFloatArray4353[4];
	fs[2] = aFloatArray4353[8];
	fs[3] = aFloatArray4353[12];
	fs[4] = aFloatArray4353[1];
	fs[5] = aFloatArray4353[5];
	fs[6] = aFloatArray4353[9];
	fs[7] = aFloatArray4353[13];
	return fs;
    }
    
    public boolean method5235(Object object) {
	if (!(object instanceof Class268))
	    return false;
	Class268 class268_157_ = (Class268) object;
	for (int i = 0; i < 16; i++) {
	    if (aFloatArray4353[i] != class268_157_.aFloatArray4353[i])
		return false;
	}
	return true;
    }
    
    public boolean method5236(Object object) {
	if (!(object instanceof Class268))
	    return false;
	Class268 class268_158_ = (Class268) object;
	for (int i = 0; i < 16; i++) {
	    if (aFloatArray4353[i] != class268_158_.aFloatArray4353[i])
		return false;
	}
	return true;
    }
    
    public String method5237() {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i = 0; i < 4; i++) {
	    for (int i_159_ = 0; i_159_ < 4; i_159_++) {
		if (i_159_ > 0)
		    stringbuilder.append("\t");
		stringbuilder.append(aFloatArray4353[i * 4 + i_159_]);
	    }
	    stringbuilder.append("\n");
	}
	return stringbuilder.toString();
    }
    
    public float[] method5238(float[] fs) {
	float f = aFloatArray4353[3] + aFloatArray4353[1];
	float f_160_ = aFloatArray4353[7] + aFloatArray4353[5];
	float f_161_ = aFloatArray4353[11] + aFloatArray4353[9];
	double d
	    = Math.sqrt((double) (f * f + f_160_ * f_160_ + f_161_ * f_161_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_160_ / d);
	fs[2] = (float) ((double) f_161_ / d);
	fs[3] = (float) ((double) (aFloatArray4353[15] + aFloatArray4353[13])
			 / d);
	return fs;
    }
    
    public String method5239() {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i = 0; i < 4; i++) {
	    for (int i_162_ = 0; i_162_ < 4; i_162_++) {
		if (i_162_ > 0)
		    stringbuilder.append("\t");
		stringbuilder.append(aFloatArray4353[i * 4 + i_162_]);
	    }
	    stringbuilder.append("\n");
	}
	return stringbuilder.toString();
    }
    
    public boolean equals(Object object) {
	if (!(object instanceof Class268))
	    return false;
	Class268 class268_163_ = (Class268) object;
	for (int i = 0; i < 16; i++) {
	    if (aFloatArray4353[i] != class268_163_.aFloatArray4353[i])
		return false;
	}
	return true;
    }
    
    public void method5240(float f, float f_164_, float f_165_, float f_166_,
			   float f_167_, float f_168_) {
	aFloatArray4353[0] = 2.0F / (f_164_ - f);
	aFloatArray4353[1] = 0.0F;
	aFloatArray4353[2] = 0.0F;
	aFloatArray4353[3] = 0.0F;
	aFloatArray4353[4] = 0.0F;
	aFloatArray4353[5] = 2.0F / (f_166_ - f_165_);
	aFloatArray4353[6] = 0.0F;
	aFloatArray4353[7] = 0.0F;
	aFloatArray4353[8] = 0.0F;
	aFloatArray4353[9] = 0.0F;
	aFloatArray4353[10] = 2.0F / (f_168_ - f_167_);
	aFloatArray4353[11] = 0.0F;
	aFloatArray4353[12] = -(f_164_ + f) / (f_164_ - f);
	aFloatArray4353[13] = -(f_166_ + f_165_) / (f_166_ - f_165_);
	aFloatArray4353[14] = -(f_168_ + f_167_) / (f_168_ - f_167_);
	aFloatArray4353[15] = 1.0F;
    }
    
    public void method5241(Class268 class268_169_) {
	System.arraycopy(class268_169_.aFloatArray4353, 0, aFloatArray4353, 0,
			 11);
	aFloatArray4353[3] = 0.0F;
	aFloatArray4353[7] = 0.0F;
	aFloatArray4353[11] = 0.0F;
	aFloatArray4353[12] = 0.0F;
	aFloatArray4353[13] = 0.0F;
	aFloatArray4353[14] = 0.0F;
	aFloatArray4353[15] = 1.0F;
    }
    
    public void method5242(float f, float f_170_, float f_171_, float f_172_) {
	float f_173_
	    = (float) (Math.tan((double) (f_171_ / 2.0F)) * (double) f);
	float f_174_
	    = (float) (Math.tan((double) (f_172_ / 2.0F)) * (double) f);
	method5214(-f_173_, f_173_, -f_174_, f_174_, f, f_170_);
    }
    
    public float[] method5243(float[] fs) {
	fs[0] = aFloatArray4353[0];
	fs[1] = aFloatArray4353[4];
	fs[2] = aFloatArray4353[8];
	fs[3] = aFloatArray4353[12];
	fs[4] = aFloatArray4353[1];
	fs[5] = aFloatArray4353[5];
	fs[6] = aFloatArray4353[9];
	fs[7] = aFloatArray4353[13];
	return fs;
    }
    
    public void method5244(Class268 class268_175_, Class268 class268_176_) {
	float f = ((class268_175_.aFloatArray4353[0]
		    * class268_176_.aFloatArray4353[0])
		   + (class268_175_.aFloatArray4353[1]
		      * class268_176_.aFloatArray4353[4])
		   + (class268_175_.aFloatArray4353[2]
		      * class268_176_.aFloatArray4353[8])
		   + (class268_175_.aFloatArray4353[3]
		      * class268_176_.aFloatArray4353[12]));
	float f_177_ = ((class268_175_.aFloatArray4353[0]
			 * class268_176_.aFloatArray4353[1])
			+ (class268_175_.aFloatArray4353[1]
			   * class268_176_.aFloatArray4353[5])
			+ (class268_175_.aFloatArray4353[2]
			   * class268_176_.aFloatArray4353[9])
			+ (class268_175_.aFloatArray4353[3]
			   * class268_176_.aFloatArray4353[13]));
	float f_178_ = ((class268_175_.aFloatArray4353[0]
			 * class268_176_.aFloatArray4353[2])
			+ (class268_175_.aFloatArray4353[1]
			   * class268_176_.aFloatArray4353[6])
			+ (class268_175_.aFloatArray4353[2]
			   * class268_176_.aFloatArray4353[10])
			+ (class268_175_.aFloatArray4353[3]
			   * class268_176_.aFloatArray4353[14]));
	float f_179_ = ((class268_175_.aFloatArray4353[0]
			 * class268_176_.aFloatArray4353[3])
			+ (class268_175_.aFloatArray4353[1]
			   * class268_176_.aFloatArray4353[7])
			+ (class268_175_.aFloatArray4353[2]
			   * class268_176_.aFloatArray4353[11])
			+ (class268_175_.aFloatArray4353[3]
			   * class268_176_.aFloatArray4353[15]));
	float f_180_ = ((class268_175_.aFloatArray4353[4]
			 * class268_176_.aFloatArray4353[0])
			+ (class268_175_.aFloatArray4353[5]
			   * class268_176_.aFloatArray4353[4])
			+ (class268_175_.aFloatArray4353[6]
			   * class268_176_.aFloatArray4353[8])
			+ (class268_175_.aFloatArray4353[7]
			   * class268_176_.aFloatArray4353[12]));
	float f_181_ = ((class268_175_.aFloatArray4353[4]
			 * class268_176_.aFloatArray4353[1])
			+ (class268_175_.aFloatArray4353[5]
			   * class268_176_.aFloatArray4353[5])
			+ (class268_175_.aFloatArray4353[6]
			   * class268_176_.aFloatArray4353[9])
			+ (class268_175_.aFloatArray4353[7]
			   * class268_176_.aFloatArray4353[13]));
	float f_182_ = ((class268_175_.aFloatArray4353[4]
			 * class268_176_.aFloatArray4353[2])
			+ (class268_175_.aFloatArray4353[5]
			   * class268_176_.aFloatArray4353[6])
			+ (class268_175_.aFloatArray4353[6]
			   * class268_176_.aFloatArray4353[10])
			+ (class268_175_.aFloatArray4353[7]
			   * class268_176_.aFloatArray4353[14]));
	float f_183_ = ((class268_175_.aFloatArray4353[4]
			 * class268_176_.aFloatArray4353[3])
			+ (class268_175_.aFloatArray4353[5]
			   * class268_176_.aFloatArray4353[7])
			+ (class268_175_.aFloatArray4353[6]
			   * class268_176_.aFloatArray4353[11])
			+ (class268_175_.aFloatArray4353[7]
			   * class268_176_.aFloatArray4353[15]));
	float f_184_ = ((class268_175_.aFloatArray4353[8]
			 * class268_176_.aFloatArray4353[0])
			+ (class268_175_.aFloatArray4353[9]
			   * class268_176_.aFloatArray4353[4])
			+ (class268_175_.aFloatArray4353[10]
			   * class268_176_.aFloatArray4353[8])
			+ (class268_175_.aFloatArray4353[11]
			   * class268_176_.aFloatArray4353[12]));
	float f_185_ = ((class268_175_.aFloatArray4353[8]
			 * class268_176_.aFloatArray4353[1])
			+ (class268_175_.aFloatArray4353[9]
			   * class268_176_.aFloatArray4353[5])
			+ (class268_175_.aFloatArray4353[10]
			   * class268_176_.aFloatArray4353[9])
			+ (class268_175_.aFloatArray4353[11]
			   * class268_176_.aFloatArray4353[13]));
	float f_186_ = ((class268_175_.aFloatArray4353[8]
			 * class268_176_.aFloatArray4353[2])
			+ (class268_175_.aFloatArray4353[9]
			   * class268_176_.aFloatArray4353[6])
			+ (class268_175_.aFloatArray4353[10]
			   * class268_176_.aFloatArray4353[10])
			+ (class268_175_.aFloatArray4353[11]
			   * class268_176_.aFloatArray4353[14]));
	float f_187_ = ((class268_175_.aFloatArray4353[8]
			 * class268_176_.aFloatArray4353[3])
			+ (class268_175_.aFloatArray4353[9]
			   * class268_176_.aFloatArray4353[7])
			+ (class268_175_.aFloatArray4353[10]
			   * class268_176_.aFloatArray4353[11])
			+ (class268_175_.aFloatArray4353[11]
			   * class268_176_.aFloatArray4353[15]));
	float f_188_ = ((class268_175_.aFloatArray4353[12]
			 * class268_176_.aFloatArray4353[0])
			+ (class268_175_.aFloatArray4353[13]
			   * class268_176_.aFloatArray4353[4])
			+ (class268_175_.aFloatArray4353[14]
			   * class268_176_.aFloatArray4353[8])
			+ (class268_175_.aFloatArray4353[15]
			   * class268_176_.aFloatArray4353[12]));
	float f_189_ = ((class268_175_.aFloatArray4353[12]
			 * class268_176_.aFloatArray4353[1])
			+ (class268_175_.aFloatArray4353[13]
			   * class268_176_.aFloatArray4353[5])
			+ (class268_175_.aFloatArray4353[14]
			   * class268_176_.aFloatArray4353[9])
			+ (class268_175_.aFloatArray4353[15]
			   * class268_176_.aFloatArray4353[13]));
	float f_190_ = ((class268_175_.aFloatArray4353[12]
			 * class268_176_.aFloatArray4353[2])
			+ (class268_175_.aFloatArray4353[13]
			   * class268_176_.aFloatArray4353[6])
			+ (class268_175_.aFloatArray4353[14]
			   * class268_176_.aFloatArray4353[10])
			+ (class268_175_.aFloatArray4353[15]
			   * class268_176_.aFloatArray4353[14]));
	float f_191_ = ((class268_175_.aFloatArray4353[12]
			 * class268_176_.aFloatArray4353[3])
			+ (class268_175_.aFloatArray4353[13]
			   * class268_176_.aFloatArray4353[7])
			+ (class268_175_.aFloatArray4353[14]
			   * class268_176_.aFloatArray4353[11])
			+ (class268_175_.aFloatArray4353[15]
			   * class268_176_.aFloatArray4353[15]));
	aFloatArray4353[0] = f;
	aFloatArray4353[1] = f_177_;
	aFloatArray4353[2] = f_178_;
	aFloatArray4353[3] = f_179_;
	aFloatArray4353[4] = f_180_;
	aFloatArray4353[5] = f_181_;
	aFloatArray4353[6] = f_182_;
	aFloatArray4353[7] = f_183_;
	aFloatArray4353[8] = f_184_;
	aFloatArray4353[9] = f_185_;
	aFloatArray4353[10] = f_186_;
	aFloatArray4353[11] = f_187_;
	aFloatArray4353[12] = f_188_;
	aFloatArray4353[13] = f_189_;
	aFloatArray4353[14] = f_190_;
	aFloatArray4353[15] = f_191_;
    }
    
    public void method5245(Class268 class268_192_) {
	System.arraycopy(class268_192_.aFloatArray4353, 0, aFloatArray4353, 0,
			 16);
    }
    
    float method5246() {
	return ((aFloatArray4353[0] * aFloatArray4353[5] * aFloatArray4353[10]
		 * aFloatArray4353[15])
		- (aFloatArray4353[0] * aFloatArray4353[5]
		   * aFloatArray4353[11] * aFloatArray4353[14])
		- (aFloatArray4353[0] * aFloatArray4353[6] * aFloatArray4353[9]
		   * aFloatArray4353[15])
		+ (aFloatArray4353[0] * aFloatArray4353[6]
		   * aFloatArray4353[11] * aFloatArray4353[13])
		+ (aFloatArray4353[0] * aFloatArray4353[7] * aFloatArray4353[9]
		   * aFloatArray4353[14])
		- (aFloatArray4353[0] * aFloatArray4353[7]
		   * aFloatArray4353[10] * aFloatArray4353[13])
		- (aFloatArray4353[1] * aFloatArray4353[4]
		   * aFloatArray4353[10] * aFloatArray4353[15])
		+ (aFloatArray4353[1] * aFloatArray4353[4]
		   * aFloatArray4353[11] * aFloatArray4353[14])
		+ (aFloatArray4353[1] * aFloatArray4353[6] * aFloatArray4353[8]
		   * aFloatArray4353[15])
		- (aFloatArray4353[1] * aFloatArray4353[6]
		   * aFloatArray4353[11] * aFloatArray4353[12])
		- (aFloatArray4353[1] * aFloatArray4353[7] * aFloatArray4353[8]
		   * aFloatArray4353[14])
		+ (aFloatArray4353[1] * aFloatArray4353[7]
		   * aFloatArray4353[10] * aFloatArray4353[12])
		+ (aFloatArray4353[2] * aFloatArray4353[4] * aFloatArray4353[9]
		   * aFloatArray4353[15])
		- (aFloatArray4353[2] * aFloatArray4353[4]
		   * aFloatArray4353[11] * aFloatArray4353[13])
		- (aFloatArray4353[2] * aFloatArray4353[5] * aFloatArray4353[8]
		   * aFloatArray4353[15])
		+ (aFloatArray4353[2] * aFloatArray4353[5]
		   * aFloatArray4353[11] * aFloatArray4353[12])
		+ (aFloatArray4353[2] * aFloatArray4353[7] * aFloatArray4353[8]
		   * aFloatArray4353[13])
		- (aFloatArray4353[2] * aFloatArray4353[7] * aFloatArray4353[9]
		   * aFloatArray4353[12])
		- (aFloatArray4353[3] * aFloatArray4353[4] * aFloatArray4353[9]
		   * aFloatArray4353[14])
		+ (aFloatArray4353[3] * aFloatArray4353[4]
		   * aFloatArray4353[10] * aFloatArray4353[13])
		+ (aFloatArray4353[3] * aFloatArray4353[5] * aFloatArray4353[8]
		   * aFloatArray4353[14])
		- (aFloatArray4353[3] * aFloatArray4353[5]
		   * aFloatArray4353[10] * aFloatArray4353[12])
		- (aFloatArray4353[3] * aFloatArray4353[6] * aFloatArray4353[8]
		   * aFloatArray4353[13])
		+ (aFloatArray4353[3] * aFloatArray4353[6] * aFloatArray4353[9]
		   * aFloatArray4353[12]));
    }
    
    public void method5247() {
	float f = 1.0F / method5204();
	float f_193_
	    = (aFloatArray4353[5] * aFloatArray4353[10] * aFloatArray4353[15]
	       - aFloatArray4353[5] * aFloatArray4353[11] * aFloatArray4353[14]
	       - aFloatArray4353[6] * aFloatArray4353[9] * aFloatArray4353[15]
	       + aFloatArray4353[6] * aFloatArray4353[11] * aFloatArray4353[13]
	       + aFloatArray4353[7] * aFloatArray4353[9] * aFloatArray4353[14]
	       - (aFloatArray4353[7] * aFloatArray4353[10]
		  * aFloatArray4353[13])) * f;
	float f_194_
	    = (-aFloatArray4353[1] * aFloatArray4353[10] * aFloatArray4353[15]
	       + aFloatArray4353[1] * aFloatArray4353[11] * aFloatArray4353[14]
	       + aFloatArray4353[2] * aFloatArray4353[9] * aFloatArray4353[15]
	       - aFloatArray4353[2] * aFloatArray4353[11] * aFloatArray4353[13]
	       - aFloatArray4353[3] * aFloatArray4353[9] * aFloatArray4353[14]
	       + (aFloatArray4353[3] * aFloatArray4353[10]
		  * aFloatArray4353[13])) * f;
	float f_195_
	    = ((aFloatArray4353[1] * aFloatArray4353[6] * aFloatArray4353[15]
		- aFloatArray4353[1] * aFloatArray4353[7] * aFloatArray4353[14]
		- aFloatArray4353[2] * aFloatArray4353[5] * aFloatArray4353[15]
		+ aFloatArray4353[2] * aFloatArray4353[7] * aFloatArray4353[13]
		+ aFloatArray4353[3] * aFloatArray4353[5] * aFloatArray4353[14]
		- (aFloatArray4353[3] * aFloatArray4353[6]
		   * aFloatArray4353[13]))
	       * f);
	float f_196_
	    = ((-aFloatArray4353[1] * aFloatArray4353[6] * aFloatArray4353[11]
		+ aFloatArray4353[1] * aFloatArray4353[7] * aFloatArray4353[10]
		+ aFloatArray4353[2] * aFloatArray4353[5] * aFloatArray4353[11]
		- aFloatArray4353[2] * aFloatArray4353[7] * aFloatArray4353[9]
		- aFloatArray4353[3] * aFloatArray4353[5] * aFloatArray4353[10]
		+ aFloatArray4353[3] * aFloatArray4353[6] * aFloatArray4353[9])
	       * f);
	float f_197_
	    = (-aFloatArray4353[4] * aFloatArray4353[10] * aFloatArray4353[15]
	       + aFloatArray4353[4] * aFloatArray4353[11] * aFloatArray4353[14]
	       + aFloatArray4353[6] * aFloatArray4353[8] * aFloatArray4353[15]
	       - aFloatArray4353[6] * aFloatArray4353[11] * aFloatArray4353[12]
	       - aFloatArray4353[7] * aFloatArray4353[8] * aFloatArray4353[14]
	       + (aFloatArray4353[7] * aFloatArray4353[10]
		  * aFloatArray4353[12])) * f;
	float f_198_
	    = (aFloatArray4353[0] * aFloatArray4353[10] * aFloatArray4353[15]
	       - aFloatArray4353[0] * aFloatArray4353[11] * aFloatArray4353[14]
	       - aFloatArray4353[2] * aFloatArray4353[8] * aFloatArray4353[15]
	       + aFloatArray4353[2] * aFloatArray4353[11] * aFloatArray4353[12]
	       + aFloatArray4353[3] * aFloatArray4353[8] * aFloatArray4353[14]
	       - (aFloatArray4353[3] * aFloatArray4353[10]
		  * aFloatArray4353[12])) * f;
	float f_199_
	    = ((-aFloatArray4353[0] * aFloatArray4353[6] * aFloatArray4353[15]
		+ aFloatArray4353[0] * aFloatArray4353[7] * aFloatArray4353[14]
		+ aFloatArray4353[2] * aFloatArray4353[4] * aFloatArray4353[15]
		- aFloatArray4353[2] * aFloatArray4353[7] * aFloatArray4353[12]
		- aFloatArray4353[3] * aFloatArray4353[4] * aFloatArray4353[14]
		+ (aFloatArray4353[3] * aFloatArray4353[6]
		   * aFloatArray4353[12]))
	       * f);
	float f_200_
	    = ((aFloatArray4353[0] * aFloatArray4353[6] * aFloatArray4353[11]
		- aFloatArray4353[0] * aFloatArray4353[7] * aFloatArray4353[10]
		- aFloatArray4353[2] * aFloatArray4353[4] * aFloatArray4353[11]
		+ aFloatArray4353[2] * aFloatArray4353[7] * aFloatArray4353[8]
		+ aFloatArray4353[3] * aFloatArray4353[4] * aFloatArray4353[10]
		- aFloatArray4353[3] * aFloatArray4353[6] * aFloatArray4353[8])
	       * f);
	float f_201_
	    = (aFloatArray4353[4] * aFloatArray4353[9] * aFloatArray4353[15]
	       - aFloatArray4353[4] * aFloatArray4353[11] * aFloatArray4353[13]
	       - aFloatArray4353[5] * aFloatArray4353[8] * aFloatArray4353[15]
	       + aFloatArray4353[5] * aFloatArray4353[11] * aFloatArray4353[12]
	       + aFloatArray4353[7] * aFloatArray4353[8] * aFloatArray4353[13]
	       - (aFloatArray4353[7] * aFloatArray4353[9]
		  * aFloatArray4353[12])) * f;
	float f_202_
	    = (-aFloatArray4353[0] * aFloatArray4353[9] * aFloatArray4353[15]
	       + aFloatArray4353[0] * aFloatArray4353[11] * aFloatArray4353[13]
	       + aFloatArray4353[1] * aFloatArray4353[8] * aFloatArray4353[15]
	       - aFloatArray4353[1] * aFloatArray4353[11] * aFloatArray4353[12]
	       - aFloatArray4353[3] * aFloatArray4353[8] * aFloatArray4353[13]
	       + (aFloatArray4353[3] * aFloatArray4353[9]
		  * aFloatArray4353[12])) * f;
	float f_203_
	    = ((aFloatArray4353[0] * aFloatArray4353[5] * aFloatArray4353[15]
		- aFloatArray4353[0] * aFloatArray4353[7] * aFloatArray4353[13]
		- aFloatArray4353[1] * aFloatArray4353[4] * aFloatArray4353[15]
		+ aFloatArray4353[1] * aFloatArray4353[7] * aFloatArray4353[12]
		+ aFloatArray4353[3] * aFloatArray4353[4] * aFloatArray4353[13]
		- (aFloatArray4353[3] * aFloatArray4353[5]
		   * aFloatArray4353[12]))
	       * f);
	float f_204_
	    = ((-aFloatArray4353[0] * aFloatArray4353[5] * aFloatArray4353[11]
		+ aFloatArray4353[0] * aFloatArray4353[7] * aFloatArray4353[9]
		+ aFloatArray4353[1] * aFloatArray4353[4] * aFloatArray4353[11]
		- aFloatArray4353[1] * aFloatArray4353[7] * aFloatArray4353[8]
		- aFloatArray4353[3] * aFloatArray4353[4] * aFloatArray4353[9]
		+ aFloatArray4353[3] * aFloatArray4353[5] * aFloatArray4353[8])
	       * f);
	float f_205_
	    = (-aFloatArray4353[4] * aFloatArray4353[9] * aFloatArray4353[14]
	       + aFloatArray4353[4] * aFloatArray4353[10] * aFloatArray4353[13]
	       + aFloatArray4353[5] * aFloatArray4353[8] * aFloatArray4353[14]
	       - aFloatArray4353[5] * aFloatArray4353[10] * aFloatArray4353[12]
	       - aFloatArray4353[6] * aFloatArray4353[8] * aFloatArray4353[13]
	       + (aFloatArray4353[6] * aFloatArray4353[9]
		  * aFloatArray4353[12])) * f;
	float f_206_
	    = (aFloatArray4353[0] * aFloatArray4353[9] * aFloatArray4353[14]
	       - aFloatArray4353[0] * aFloatArray4353[10] * aFloatArray4353[13]
	       - aFloatArray4353[1] * aFloatArray4353[8] * aFloatArray4353[14]
	       + aFloatArray4353[1] * aFloatArray4353[10] * aFloatArray4353[12]
	       + aFloatArray4353[2] * aFloatArray4353[8] * aFloatArray4353[13]
	       - (aFloatArray4353[2] * aFloatArray4353[9]
		  * aFloatArray4353[12])) * f;
	float f_207_
	    = ((-aFloatArray4353[0] * aFloatArray4353[5] * aFloatArray4353[14]
		+ aFloatArray4353[0] * aFloatArray4353[6] * aFloatArray4353[13]
		+ aFloatArray4353[1] * aFloatArray4353[4] * aFloatArray4353[14]
		- aFloatArray4353[1] * aFloatArray4353[6] * aFloatArray4353[12]
		- aFloatArray4353[2] * aFloatArray4353[4] * aFloatArray4353[13]
		+ (aFloatArray4353[2] * aFloatArray4353[5]
		   * aFloatArray4353[12]))
	       * f);
	float f_208_
	    = ((aFloatArray4353[0] * aFloatArray4353[5] * aFloatArray4353[10]
		- aFloatArray4353[0] * aFloatArray4353[6] * aFloatArray4353[9]
		- aFloatArray4353[1] * aFloatArray4353[4] * aFloatArray4353[10]
		+ aFloatArray4353[1] * aFloatArray4353[6] * aFloatArray4353[8]
		+ aFloatArray4353[2] * aFloatArray4353[4] * aFloatArray4353[9]
		- aFloatArray4353[2] * aFloatArray4353[5] * aFloatArray4353[8])
	       * f);
	aFloatArray4353[0] = f_193_;
	aFloatArray4353[1] = f_194_;
	aFloatArray4353[2] = f_195_;
	aFloatArray4353[3] = f_196_;
	aFloatArray4353[4] = f_197_;
	aFloatArray4353[5] = f_198_;
	aFloatArray4353[6] = f_199_;
	aFloatArray4353[7] = f_200_;
	aFloatArray4353[8] = f_201_;
	aFloatArray4353[9] = f_202_;
	aFloatArray4353[10] = f_203_;
	aFloatArray4353[11] = f_204_;
	aFloatArray4353[12] = f_205_;
	aFloatArray4353[13] = f_206_;
	aFloatArray4353[14] = f_207_;
	aFloatArray4353[15] = f_208_;
    }
    
    public void method5248(float f, float f_209_, float f_210_, float f_211_) {
	aFloatArray4353[0] = f;
	aFloatArray4353[1] = 0.0F;
	aFloatArray4353[2] = 0.0F;
	aFloatArray4353[3] = 0.0F;
	aFloatArray4353[4] = 0.0F;
	aFloatArray4353[5] = f_209_;
	aFloatArray4353[6] = 0.0F;
	aFloatArray4353[7] = 0.0F;
	aFloatArray4353[8] = 0.0F;
	aFloatArray4353[9] = 0.0F;
	aFloatArray4353[10] = f_210_;
	aFloatArray4353[11] = 0.0F;
	aFloatArray4353[12] = 0.0F;
	aFloatArray4353[13] = 0.0F;
	aFloatArray4353[14] = 0.0F;
	aFloatArray4353[15] = f_211_;
    }
    
    public boolean method5249() {
	return (aFloatArray4353[0] == 1.0F && aFloatArray4353[1] == 0.0F
		&& aFloatArray4353[2] == 0.0F && aFloatArray4353[3] == 0.0F
		&& aFloatArray4353[4] == 0.0F && aFloatArray4353[5] == 1.0F
		&& aFloatArray4353[6] == 0.0F && aFloatArray4353[7] == 0.0F
		&& aFloatArray4353[8] == 0.0F && aFloatArray4353[9] == 0.0F
		&& aFloatArray4353[10] == 1.0F && aFloatArray4353[11] == 0.0F
		&& aFloatArray4353[12] == 0.0F && aFloatArray4353[13] == 0.0F
		&& aFloatArray4353[14] == 0.0F && aFloatArray4353[15] == 1.0F);
    }
    
    public float[] method5250(float[] fs) {
	fs[0] = aFloatArray4353[0];
	fs[1] = aFloatArray4353[4];
	fs[2] = aFloatArray4353[8];
	fs[3] = aFloatArray4353[12];
	fs[4] = aFloatArray4353[1];
	fs[5] = aFloatArray4353[5];
	fs[6] = aFloatArray4353[9];
	fs[7] = aFloatArray4353[13];
	fs[8] = aFloatArray4353[2];
	fs[9] = aFloatArray4353[6];
	fs[10] = aFloatArray4353[10];
	fs[11] = aFloatArray4353[14];
	fs[12] = aFloatArray4353[3];
	fs[13] = aFloatArray4353[7];
	fs[14] = aFloatArray4353[11];
	fs[15] = aFloatArray4353[15];
	return fs;
    }
    
    public int method5251() {
	int i = 1;
	i = 31 * i + Arrays.hashCode(aFloatArray4353);
	return i;
    }
    
    public String method5252() {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i = 0; i < 4; i++) {
	    for (int i_212_ = 0; i_212_ < 4; i_212_++) {
		if (i_212_ > 0)
		    stringbuilder.append("\t");
		stringbuilder.append(aFloatArray4353[i * 4 + i_212_]);
	    }
	    stringbuilder.append("\n");
	}
	return stringbuilder.toString();
    }
    
    public float method5253() {
	return (-(aFloatArray4353[15] + aFloatArray4353[14])
		/ (aFloatArray4353[11] + aFloatArray4353[10]));
    }
    
    public void method5254(float[] fs) {
	float f = fs[0];
	float f_213_ = fs[1];
	float f_214_ = fs[2];
	fs[0] = (aFloatArray4353[0] * f + aFloatArray4353[4] * f_213_
		 + aFloatArray4353[8] * f_214_ + aFloatArray4353[12]);
	fs[1] = (aFloatArray4353[1] * f + aFloatArray4353[5] * f_213_
		 + aFloatArray4353[9] * f_214_ + aFloatArray4353[13]);
	fs[2] = (aFloatArray4353[2] * f + aFloatArray4353[6] * f_213_
		 + aFloatArray4353[10] * f_214_ + aFloatArray4353[14]);
    }
    
    public float[] method5255(float[] fs) {
	float f = aFloatArray4353[3] + aFloatArray4353[1];
	float f_215_ = aFloatArray4353[7] + aFloatArray4353[5];
	float f_216_ = aFloatArray4353[11] + aFloatArray4353[9];
	double d
	    = Math.sqrt((double) (f * f + f_215_ * f_215_ + f_216_ * f_216_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_215_ / d);
	fs[2] = (float) ((double) f_216_ / d);
	fs[3] = (float) ((double) (aFloatArray4353[15] + aFloatArray4353[13])
			 / d);
	return fs;
    }
    
    public void method5256(float f, float f_217_, float f_218_, float f_219_,
			   float f_220_, float f_221_) {
	aFloatArray4353[0] = 2.0F / (f_217_ - f);
	aFloatArray4353[1] = 0.0F;
	aFloatArray4353[2] = 0.0F;
	aFloatArray4353[3] = 0.0F;
	aFloatArray4353[4] = 0.0F;
	aFloatArray4353[5] = 2.0F / (f_219_ - f_218_);
	aFloatArray4353[6] = 0.0F;
	aFloatArray4353[7] = 0.0F;
	aFloatArray4353[8] = 0.0F;
	aFloatArray4353[9] = 0.0F;
	aFloatArray4353[10] = 2.0F / (f_221_ - f_220_);
	aFloatArray4353[11] = 0.0F;
	aFloatArray4353[12] = -(f_217_ + f) / (f_217_ - f);
	aFloatArray4353[13] = -(f_219_ + f_218_) / (f_219_ - f_218_);
	aFloatArray4353[14] = -(f_221_ + f_220_) / (f_221_ - f_220_);
	aFloatArray4353[15] = 1.0F;
    }
    
    public float[] method5257(float[] fs) {
	float f = aFloatArray4353[3] + aFloatArray4353[2];
	float f_222_ = aFloatArray4353[7] + aFloatArray4353[6];
	float f_223_ = aFloatArray4353[11] + aFloatArray4353[10];
	double d
	    = Math.sqrt((double) (f * f + f_222_ * f_222_ + f_223_ * f_223_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_222_ / d);
	fs[2] = (float) ((double) f_223_ / d);
	fs[3] = (float) ((double) (aFloatArray4353[15] + aFloatArray4353[14])
			 / d);
	return fs;
    }
    
    public void method5258(Class268 class268_224_) {
	System.arraycopy(class268_224_.aFloatArray4353, 0, aFloatArray4353, 0,
			 11);
	aFloatArray4353[3] = 0.0F;
	aFloatArray4353[7] = 0.0F;
	aFloatArray4353[11] = 0.0F;
	aFloatArray4353[12] = 0.0F;
	aFloatArray4353[13] = 0.0F;
	aFloatArray4353[14] = 0.0F;
	aFloatArray4353[15] = 1.0F;
    }
    
    public float[] method5259(float[] fs) {
	fs[0] = aFloatArray4353[0];
	fs[1] = aFloatArray4353[1];
	fs[2] = aFloatArray4353[4];
	fs[3] = aFloatArray4353[5];
	fs[4] = aFloatArray4353[8];
	fs[5] = aFloatArray4353[9];
	fs[6] = aFloatArray4353[12];
	fs[7] = aFloatArray4353[13];
	return fs;
    }
    
    public void method5260(float f, float f_225_, float f_226_) {
	method5211(-10000.0F / f_226_, 10000.0F / f_226_, -10000.0F / f_226_,
		   10000.0F / f_226_, f, f_225_);
    }
    
    public float[] method5261(float[] fs) {
	float f = aFloatArray4353[3] + aFloatArray4353[0];
	float f_227_ = aFloatArray4353[7] + aFloatArray4353[4];
	float f_228_ = aFloatArray4353[11] + aFloatArray4353[8];
	double d
	    = Math.sqrt((double) (f * f + f_227_ * f_227_ + f_228_ * f_228_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_227_ / d);
	fs[2] = (float) ((double) f_228_ / d);
	fs[3] = (float) ((double) (aFloatArray4353[15] + aFloatArray4353[12])
			 / d);
	return fs;
    }
    
    void method5262(float f, float f_229_, float f_230_, float f_231_,
		    float f_232_, float f_233_) {
	aFloatArray4353[0] = 2.0F * f_232_ / (f_229_ - f);
	aFloatArray4353[1] = 0.0F;
	aFloatArray4353[2] = 0.0F;
	aFloatArray4353[3] = 0.0F;
	aFloatArray4353[4] = 0.0F;
	aFloatArray4353[5] = 2.0F * f_232_ / (f_231_ - f_230_);
	aFloatArray4353[6] = 0.0F;
	aFloatArray4353[7] = 0.0F;
	aFloatArray4353[8] = (f_229_ + f) / (f_229_ - f);
	aFloatArray4353[9] = (f_231_ + f_230_) / (f_231_ - f_230_);
	aFloatArray4353[10] = (f_233_ + f_232_) / (f_233_ - f_232_);
	aFloatArray4353[11] = 1.0F;
	aFloatArray4353[12] = 0.0F;
	aFloatArray4353[13] = 0.0F;
	aFloatArray4353[14] = -(2.0F * f_233_ * f_232_) / (f_233_ - f_232_);
	aFloatArray4353[15] = 0.0F;
    }
    
    public float[] method5263(float[] fs) {
	System.arraycopy(aFloatArray4353, 0, fs, 0, 16);
	fs[3] = 0.0F;
	fs[7] = 0.0F;
	fs[11] = 0.0F;
	fs[12] = 0.0F;
	fs[13] = 0.0F;
	fs[14] = 0.0F;
	fs[15] = 1.0F;
	return fs;
    }
    
    public float method5264() {
	return (-(aFloatArray4353[15] + aFloatArray4353[14])
		/ (aFloatArray4353[11] + aFloatArray4353[10]));
    }
    
    public float method5265() {
	return ((aFloatArray4353[14] - aFloatArray4353[15])
		/ (aFloatArray4353[11] - aFloatArray4353[10]));
    }
    
    public float[] method5266(float[] fs) {
	fs[0] = aFloatArray4353[0];
	fs[1] = aFloatArray4353[1];
	fs[2] = aFloatArray4353[2];
	fs[3] = aFloatArray4353[4];
	fs[4] = aFloatArray4353[5];
	fs[5] = aFloatArray4353[6];
	fs[6] = aFloatArray4353[8];
	fs[7] = aFloatArray4353[9];
	fs[8] = aFloatArray4353[10];
	return fs;
    }
    
    public boolean method5267(Object object) {
	if (!(object instanceof Class268))
	    return false;
	Class268 class268_234_ = (Class268) object;
	for (int i = 0; i < 16; i++) {
	    if (aFloatArray4353[i] != class268_234_.aFloatArray4353[i])
		return false;
	}
	return true;
    }
    
    public void method5268(float f, float f_235_, float f_236_, float f_237_,
			   float f_238_, float f_239_, float f_240_,
			   float f_241_) {
	aFloatArray4353[0] = f_236_ * 2.0F / f_240_;
	aFloatArray4353[1] = 0.0F;
	aFloatArray4353[2] = 0.0F;
	aFloatArray4353[3] = 0.0F;
	aFloatArray4353[4] = 0.0F;
	aFloatArray4353[5] = f_237_ * 2.0F / f_241_;
	aFloatArray4353[6] = 0.0F;
	aFloatArray4353[7] = 0.0F;
	aFloatArray4353[8] = 2.0F * f / f_240_ - 1.0F;
	aFloatArray4353[9] = 2.0F * f_235_ / f_241_ - 1.0F;
	aFloatArray4353[10] = (f_239_ + f_238_) / (f_239_ - f_238_);
	aFloatArray4353[11] = 1.0F;
	aFloatArray4353[12] = 0.0F;
	aFloatArray4353[13] = 0.0F;
	aFloatArray4353[14] = 2.0F * f_239_ * f_238_ / (f_238_ - f_239_);
	aFloatArray4353[15] = 0.0F;
    }
    
    public float[] method5269(float[] fs) {
	float f = aFloatArray4353[3] + aFloatArray4353[0];
	float f_242_ = aFloatArray4353[7] + aFloatArray4353[4];
	float f_243_ = aFloatArray4353[11] + aFloatArray4353[8];
	double d
	    = Math.sqrt((double) (f * f + f_242_ * f_242_ + f_243_ * f_243_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_242_ / d);
	fs[2] = (float) ((double) f_243_ / d);
	fs[3] = (float) ((double) (aFloatArray4353[15] + aFloatArray4353[12])
			 / d);
	return fs;
    }
    
    public float[] method5270(float[] fs) {
	float f = aFloatArray4353[3] - aFloatArray4353[0];
	float f_244_ = aFloatArray4353[7] - aFloatArray4353[4];
	float f_245_ = aFloatArray4353[11] - aFloatArray4353[8];
	double d
	    = Math.sqrt((double) (f * f + f_244_ * f_244_ + f_245_ * f_245_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_244_ / d);
	fs[2] = (float) ((double) f_245_ / d);
	fs[3] = (float) ((double) (aFloatArray4353[15] - aFloatArray4353[12])
			 / d);
	return fs;
    }
    
    public float[] method5271(float[] fs) {
	float f = aFloatArray4353[3] - aFloatArray4353[0];
	float f_246_ = aFloatArray4353[7] - aFloatArray4353[4];
	float f_247_ = aFloatArray4353[11] - aFloatArray4353[8];
	double d
	    = Math.sqrt((double) (f * f + f_246_ * f_246_ + f_247_ * f_247_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_246_ / d);
	fs[2] = (float) ((double) f_247_ / d);
	fs[3] = (float) ((double) (aFloatArray4353[15] - aFloatArray4353[12])
			 / d);
	return fs;
    }
    
    public float[] method5272(float[] fs) {
	float f = aFloatArray4353[3] + aFloatArray4353[1];
	float f_248_ = aFloatArray4353[7] + aFloatArray4353[5];
	float f_249_ = aFloatArray4353[11] + aFloatArray4353[9];
	double d
	    = Math.sqrt((double) (f * f + f_248_ * f_248_ + f_249_ * f_249_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_248_ / d);
	fs[2] = (float) ((double) f_249_ / d);
	fs[3] = (float) ((double) (aFloatArray4353[15] + aFloatArray4353[13])
			 / d);
	return fs;
    }
    
    public boolean method5273() {
	return (aFloatArray4353[0] == 1.0F && aFloatArray4353[1] == 0.0F
		&& aFloatArray4353[2] == 0.0F && aFloatArray4353[3] == 0.0F
		&& aFloatArray4353[4] == 0.0F && aFloatArray4353[5] == 1.0F
		&& aFloatArray4353[6] == 0.0F && aFloatArray4353[7] == 0.0F
		&& aFloatArray4353[8] == 0.0F && aFloatArray4353[9] == 0.0F
		&& aFloatArray4353[10] == 1.0F && aFloatArray4353[11] == 0.0F
		&& aFloatArray4353[12] == 0.0F && aFloatArray4353[13] == 0.0F
		&& aFloatArray4353[14] == 0.0F && aFloatArray4353[15] == 1.0F);
    }
    
    public void method5274(float f, float f_250_, float f_251_, float f_252_) {
	float f_253_
	    = (float) (Math.tan((double) (f_251_ / 2.0F)) * (double) f);
	float f_254_
	    = (float) (Math.tan((double) (f_252_ / 2.0F)) * (double) f);
	method5214(-f_253_, f_253_, -f_254_, f_254_, f, f_250_);
    }
    
    public void method5275() {
	float f = aFloatArray4353[0];
	float f_255_ = aFloatArray4353[4];
	float f_256_ = aFloatArray4353[8];
	float f_257_ = aFloatArray4353[12];
	float f_258_ = aFloatArray4353[1];
	float f_259_ = aFloatArray4353[5];
	float f_260_ = aFloatArray4353[9];
	float f_261_ = aFloatArray4353[13];
	float f_262_ = aFloatArray4353[2];
	float f_263_ = aFloatArray4353[6];
	float f_264_ = aFloatArray4353[10];
	float f_265_ = aFloatArray4353[14];
	float f_266_ = aFloatArray4353[3];
	float f_267_ = aFloatArray4353[7];
	float f_268_ = aFloatArray4353[11];
	float f_269_ = aFloatArray4353[15];
	aFloatArray4353[0] = f;
	aFloatArray4353[1] = f_255_;
	aFloatArray4353[2] = f_256_;
	aFloatArray4353[3] = f_257_;
	aFloatArray4353[4] = f_258_;
	aFloatArray4353[5] = f_259_;
	aFloatArray4353[6] = f_260_;
	aFloatArray4353[7] = f_261_;
	aFloatArray4353[8] = f_262_;
	aFloatArray4353[9] = f_263_;
	aFloatArray4353[10] = f_264_;
	aFloatArray4353[11] = f_265_;
	aFloatArray4353[12] = f_266_;
	aFloatArray4353[13] = f_267_;
	aFloatArray4353[14] = f_268_;
	aFloatArray4353[15] = f_269_;
    }
    
    public float[] method5276(float[] fs) {
	System.arraycopy(aFloatArray4353, 0, fs, 0, 16);
	return fs;
    }
    
    public float[] method5277(float[] fs) {
	System.arraycopy(aFloatArray4353, 0, fs, 0, 16);
	return fs;
    }
    
    public float[] method5278(float[] fs) {
	System.arraycopy(aFloatArray4353, 0, fs, 0, 16);
	return fs;
    }
    
    public float[] method5279(float[] fs) {
	fs[0] = aFloatArray4353[0];
	fs[1] = aFloatArray4353[1];
	fs[2] = aFloatArray4353[4];
	fs[3] = aFloatArray4353[5];
	fs[4] = aFloatArray4353[8];
	fs[5] = aFloatArray4353[9];
	fs[6] = aFloatArray4353[12];
	fs[7] = aFloatArray4353[13];
	return fs;
    }
    
    public float[] method5280(float[] fs) {
	fs[0] = aFloatArray4353[0];
	fs[1] = aFloatArray4353[1];
	fs[2] = aFloatArray4353[2];
	fs[3] = aFloatArray4353[4];
	fs[4] = aFloatArray4353[5];
	fs[5] = aFloatArray4353[6];
	fs[6] = aFloatArray4353[8];
	fs[7] = aFloatArray4353[9];
	fs[8] = aFloatArray4353[10];
	return fs;
    }
    
    public float[] method5281(float[] fs) {
	fs[0] = aFloatArray4353[0];
	fs[1] = aFloatArray4353[1];
	fs[2] = 0.0F;
	fs[3] = 0.0F;
	fs[4] = aFloatArray4353[4];
	fs[5] = aFloatArray4353[5];
	fs[6] = 0.0F;
	fs[7] = 0.0F;
	fs[8] = aFloatArray4353[12];
	fs[9] = aFloatArray4353[13];
	fs[10] = aFloatArray4353[14];
	fs[11] = 0.0F;
	fs[12] = 0.0F;
	fs[13] = 0.0F;
	fs[14] = 0.0F;
	fs[15] = 1.0F;
	return fs;
    }
    
    public float[] method5282(float[] fs) {
	fs[0] = aFloatArray4353[0];
	fs[1] = aFloatArray4353[4];
	fs[2] = aFloatArray4353[8];
	fs[3] = aFloatArray4353[12];
	fs[4] = aFloatArray4353[1];
	fs[5] = aFloatArray4353[5];
	fs[6] = aFloatArray4353[9];
	fs[7] = aFloatArray4353[13];
	fs[8] = aFloatArray4353[2];
	fs[9] = aFloatArray4353[6];
	fs[10] = aFloatArray4353[10];
	fs[11] = aFloatArray4353[14];
	fs[12] = aFloatArray4353[3];
	fs[13] = aFloatArray4353[7];
	fs[14] = aFloatArray4353[11];
	fs[15] = aFloatArray4353[15];
	return fs;
    }
    
    public float[] method5283(float[] fs) {
	fs[0] = aFloatArray4353[0];
	fs[1] = aFloatArray4353[1];
	fs[2] = aFloatArray4353[2];
	fs[3] = aFloatArray4353[4];
	fs[4] = aFloatArray4353[5];
	fs[5] = aFloatArray4353[6];
	fs[6] = aFloatArray4353[8];
	fs[7] = aFloatArray4353[9];
	fs[8] = aFloatArray4353[10];
	return fs;
    }
    
    public float method5284() {
	return ((aFloatArray4353[14] - aFloatArray4353[15])
		/ (aFloatArray4353[11] - aFloatArray4353[10]));
    }
    
    public float[] method5285(float[] fs) {
	fs[0] = aFloatArray4353[0];
	fs[1] = aFloatArray4353[4];
	fs[2] = aFloatArray4353[8];
	fs[3] = aFloatArray4353[12];
	fs[4] = aFloatArray4353[1];
	fs[5] = aFloatArray4353[5];
	fs[6] = aFloatArray4353[9];
	fs[7] = aFloatArray4353[13];
	fs[8] = aFloatArray4353[2];
	fs[9] = aFloatArray4353[6];
	fs[10] = aFloatArray4353[10];
	fs[11] = aFloatArray4353[14];
	fs[12] = aFloatArray4353[3];
	fs[13] = aFloatArray4353[7];
	fs[14] = aFloatArray4353[11];
	fs[15] = aFloatArray4353[15];
	return fs;
    }
    
    public float[] method5286(float[] fs) {
	fs[0] = aFloatArray4353[0];
	fs[1] = aFloatArray4353[4];
	fs[2] = aFloatArray4353[8];
	fs[3] = aFloatArray4353[12];
	fs[4] = aFloatArray4353[1];
	fs[5] = aFloatArray4353[5];
	fs[6] = aFloatArray4353[9];
	fs[7] = aFloatArray4353[13];
	fs[8] = aFloatArray4353[2];
	fs[9] = aFloatArray4353[6];
	fs[10] = aFloatArray4353[10];
	fs[11] = aFloatArray4353[14];
	fs[12] = aFloatArray4353[3];
	fs[13] = aFloatArray4353[7];
	fs[14] = aFloatArray4353[11];
	fs[15] = aFloatArray4353[15];
	return fs;
    }
    
    public float[] method5287(float[] fs) {
	fs[0] = aFloatArray4353[0];
	fs[1] = aFloatArray4353[4];
	fs[2] = aFloatArray4353[8];
	fs[3] = aFloatArray4353[12];
	fs[4] = aFloatArray4353[1];
	fs[5] = aFloatArray4353[5];
	fs[6] = aFloatArray4353[9];
	fs[7] = aFloatArray4353[13];
	fs[8] = aFloatArray4353[2];
	fs[9] = aFloatArray4353[6];
	fs[10] = aFloatArray4353[10];
	fs[11] = aFloatArray4353[14];
	fs[12] = aFloatArray4353[3];
	fs[13] = aFloatArray4353[7];
	fs[14] = aFloatArray4353[11];
	fs[15] = aFloatArray4353[15];
	return fs;
    }
    
    public void method5288(int i, int i_270_, int i_271_, float f,
			   float f_272_, float f_273_) {
	if (i != 0) {
	    float f_274_ = Class269.aFloatArray4355[i & 0x3fff];
	    float f_275_ = Class269.aFloatArray4356[i & 0x3fff];
	    aFloatArray4353[0] = f_274_ * (float) i_270_;
	    aFloatArray4353[5] = f_274_ * (float) i_271_;
	    aFloatArray4353[1] = f_275_ * (float) i_270_;
	    aFloatArray4353[4] = -f_275_ * (float) i_271_;
	    aFloatArray4353[10] = 1.0F;
	    float[] fs = aFloatArray4353;
	    float[] fs_276_ = aFloatArray4353;
	    float[] fs_277_ = aFloatArray4353;
	    aFloatArray4353[9] = 0.0F;
	    fs_277_[8] = 0.0F;
	    fs_276_[6] = 0.0F;
	    fs[2] = 0.0F;
	} else {
	    aFloatArray4353[0] = (float) i_270_;
	    aFloatArray4353[5] = (float) i_271_;
	    aFloatArray4353[10] = 1.0F;
	    float[] fs = aFloatArray4353;
	    float[] fs_278_ = aFloatArray4353;
	    float[] fs_279_ = aFloatArray4353;
	    float[] fs_280_ = aFloatArray4353;
	    float[] fs_281_ = aFloatArray4353;
	    aFloatArray4353[9] = 0.0F;
	    fs_281_[8] = 0.0F;
	    fs_280_[6] = 0.0F;
	    fs_279_[4] = 0.0F;
	    fs_278_[2] = 0.0F;
	    fs[1] = 0.0F;
	}
	float[] fs = aFloatArray4353;
	float[] fs_282_ = aFloatArray4353;
	aFloatArray4353[11] = 0.0F;
	fs_282_[7] = 0.0F;
	fs[3] = 0.0F;
	aFloatArray4353[15] = 1.0F;
	aFloatArray4353[12] = f;
	aFloatArray4353[13] = f_272_;
	aFloatArray4353[14] = f_273_;
    }
    
    public void method5289(float f, float f_283_, float f_284_, float[] fs) {
	fs[0] = (aFloatArray4353[0] * f + aFloatArray4353[4] * f_283_
		 + aFloatArray4353[8] * f_284_ + aFloatArray4353[12]);
	fs[1] = (aFloatArray4353[1] * f + aFloatArray4353[5] * f_283_
		 + aFloatArray4353[9] * f_284_ + aFloatArray4353[13]);
	fs[2] = (aFloatArray4353[2] * f + aFloatArray4353[6] * f_283_
		 + aFloatArray4353[10] * f_284_ + aFloatArray4353[14]);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4353[3] * f + aFloatArray4353[7] * f_283_
		     + aFloatArray4353[11] * f_284_ + aFloatArray4353[15]);
    }
    
    public void method5290(float f, float f_285_, float f_286_, float f_287_,
			   float f_288_, float f_289_, float f_290_,
			   float f_291_) {
	aFloatArray4353[0] = f_286_ * 2.0F / f_290_;
	aFloatArray4353[1] = 0.0F;
	aFloatArray4353[2] = 0.0F;
	aFloatArray4353[3] = 0.0F;
	aFloatArray4353[4] = 0.0F;
	aFloatArray4353[5] = f_287_ * 2.0F / f_291_;
	aFloatArray4353[6] = 0.0F;
	aFloatArray4353[7] = 0.0F;
	aFloatArray4353[8] = 2.0F * f / f_290_ - 1.0F;
	aFloatArray4353[9] = 2.0F * f_285_ / f_291_ - 1.0F;
	aFloatArray4353[10] = (f_289_ + f_288_) / (f_289_ - f_288_);
	aFloatArray4353[11] = 1.0F;
	aFloatArray4353[12] = 0.0F;
	aFloatArray4353[13] = 0.0F;
	aFloatArray4353[14] = 2.0F * f_289_ * f_288_ / (f_288_ - f_289_);
	aFloatArray4353[15] = 0.0F;
    }
    
    public float[] method5291(float[] fs) {
	fs[0] = aFloatArray4353[0];
	fs[1] = aFloatArray4353[4];
	fs[2] = aFloatArray4353[8];
	fs[3] = aFloatArray4353[12];
	fs[4] = aFloatArray4353[1];
	fs[5] = aFloatArray4353[5];
	fs[6] = aFloatArray4353[9];
	fs[7] = aFloatArray4353[13];
	return fs;
    }
    
    public void method5292(Class268 class268_292_, Class268 class268_293_) {
	float f = ((class268_292_.aFloatArray4353[0]
		    * class268_293_.aFloatArray4353[0])
		   + (class268_292_.aFloatArray4353[1]
		      * class268_293_.aFloatArray4353[4])
		   + (class268_292_.aFloatArray4353[2]
		      * class268_293_.aFloatArray4353[8])
		   + (class268_292_.aFloatArray4353[3]
		      * class268_293_.aFloatArray4353[12]));
	float f_294_ = ((class268_292_.aFloatArray4353[0]
			 * class268_293_.aFloatArray4353[1])
			+ (class268_292_.aFloatArray4353[1]
			   * class268_293_.aFloatArray4353[5])
			+ (class268_292_.aFloatArray4353[2]
			   * class268_293_.aFloatArray4353[9])
			+ (class268_292_.aFloatArray4353[3]
			   * class268_293_.aFloatArray4353[13]));
	float f_295_ = ((class268_292_.aFloatArray4353[0]
			 * class268_293_.aFloatArray4353[2])
			+ (class268_292_.aFloatArray4353[1]
			   * class268_293_.aFloatArray4353[6])
			+ (class268_292_.aFloatArray4353[2]
			   * class268_293_.aFloatArray4353[10])
			+ (class268_292_.aFloatArray4353[3]
			   * class268_293_.aFloatArray4353[14]));
	float f_296_ = ((class268_292_.aFloatArray4353[0]
			 * class268_293_.aFloatArray4353[3])
			+ (class268_292_.aFloatArray4353[1]
			   * class268_293_.aFloatArray4353[7])
			+ (class268_292_.aFloatArray4353[2]
			   * class268_293_.aFloatArray4353[11])
			+ (class268_292_.aFloatArray4353[3]
			   * class268_293_.aFloatArray4353[15]));
	float f_297_ = ((class268_292_.aFloatArray4353[4]
			 * class268_293_.aFloatArray4353[0])
			+ (class268_292_.aFloatArray4353[5]
			   * class268_293_.aFloatArray4353[4])
			+ (class268_292_.aFloatArray4353[6]
			   * class268_293_.aFloatArray4353[8])
			+ (class268_292_.aFloatArray4353[7]
			   * class268_293_.aFloatArray4353[12]));
	float f_298_ = ((class268_292_.aFloatArray4353[4]
			 * class268_293_.aFloatArray4353[1])
			+ (class268_292_.aFloatArray4353[5]
			   * class268_293_.aFloatArray4353[5])
			+ (class268_292_.aFloatArray4353[6]
			   * class268_293_.aFloatArray4353[9])
			+ (class268_292_.aFloatArray4353[7]
			   * class268_293_.aFloatArray4353[13]));
	float f_299_ = ((class268_292_.aFloatArray4353[4]
			 * class268_293_.aFloatArray4353[2])
			+ (class268_292_.aFloatArray4353[5]
			   * class268_293_.aFloatArray4353[6])
			+ (class268_292_.aFloatArray4353[6]
			   * class268_293_.aFloatArray4353[10])
			+ (class268_292_.aFloatArray4353[7]
			   * class268_293_.aFloatArray4353[14]));
	float f_300_ = ((class268_292_.aFloatArray4353[4]
			 * class268_293_.aFloatArray4353[3])
			+ (class268_292_.aFloatArray4353[5]
			   * class268_293_.aFloatArray4353[7])
			+ (class268_292_.aFloatArray4353[6]
			   * class268_293_.aFloatArray4353[11])
			+ (class268_292_.aFloatArray4353[7]
			   * class268_293_.aFloatArray4353[15]));
	float f_301_ = ((class268_292_.aFloatArray4353[8]
			 * class268_293_.aFloatArray4353[0])
			+ (class268_292_.aFloatArray4353[9]
			   * class268_293_.aFloatArray4353[4])
			+ (class268_292_.aFloatArray4353[10]
			   * class268_293_.aFloatArray4353[8])
			+ (class268_292_.aFloatArray4353[11]
			   * class268_293_.aFloatArray4353[12]));
	float f_302_ = ((class268_292_.aFloatArray4353[8]
			 * class268_293_.aFloatArray4353[1])
			+ (class268_292_.aFloatArray4353[9]
			   * class268_293_.aFloatArray4353[5])
			+ (class268_292_.aFloatArray4353[10]
			   * class268_293_.aFloatArray4353[9])
			+ (class268_292_.aFloatArray4353[11]
			   * class268_293_.aFloatArray4353[13]));
	float f_303_ = ((class268_292_.aFloatArray4353[8]
			 * class268_293_.aFloatArray4353[2])
			+ (class268_292_.aFloatArray4353[9]
			   * class268_293_.aFloatArray4353[6])
			+ (class268_292_.aFloatArray4353[10]
			   * class268_293_.aFloatArray4353[10])
			+ (class268_292_.aFloatArray4353[11]
			   * class268_293_.aFloatArray4353[14]));
	float f_304_ = ((class268_292_.aFloatArray4353[8]
			 * class268_293_.aFloatArray4353[3])
			+ (class268_292_.aFloatArray4353[9]
			   * class268_293_.aFloatArray4353[7])
			+ (class268_292_.aFloatArray4353[10]
			   * class268_293_.aFloatArray4353[11])
			+ (class268_292_.aFloatArray4353[11]
			   * class268_293_.aFloatArray4353[15]));
	float f_305_ = ((class268_292_.aFloatArray4353[12]
			 * class268_293_.aFloatArray4353[0])
			+ (class268_292_.aFloatArray4353[13]
			   * class268_293_.aFloatArray4353[4])
			+ (class268_292_.aFloatArray4353[14]
			   * class268_293_.aFloatArray4353[8])
			+ (class268_292_.aFloatArray4353[15]
			   * class268_293_.aFloatArray4353[12]));
	float f_306_ = ((class268_292_.aFloatArray4353[12]
			 * class268_293_.aFloatArray4353[1])
			+ (class268_292_.aFloatArray4353[13]
			   * class268_293_.aFloatArray4353[5])
			+ (class268_292_.aFloatArray4353[14]
			   * class268_293_.aFloatArray4353[9])
			+ (class268_292_.aFloatArray4353[15]
			   * class268_293_.aFloatArray4353[13]));
	float f_307_ = ((class268_292_.aFloatArray4353[12]
			 * class268_293_.aFloatArray4353[2])
			+ (class268_292_.aFloatArray4353[13]
			   * class268_293_.aFloatArray4353[6])
			+ (class268_292_.aFloatArray4353[14]
			   * class268_293_.aFloatArray4353[10])
			+ (class268_292_.aFloatArray4353[15]
			   * class268_293_.aFloatArray4353[14]));
	float f_308_ = ((class268_292_.aFloatArray4353[12]
			 * class268_293_.aFloatArray4353[3])
			+ (class268_292_.aFloatArray4353[13]
			   * class268_293_.aFloatArray4353[7])
			+ (class268_292_.aFloatArray4353[14]
			   * class268_293_.aFloatArray4353[11])
			+ (class268_292_.aFloatArray4353[15]
			   * class268_293_.aFloatArray4353[15]));
	aFloatArray4353[0] = f;
	aFloatArray4353[1] = f_294_;
	aFloatArray4353[2] = f_295_;
	aFloatArray4353[3] = f_296_;
	aFloatArray4353[4] = f_297_;
	aFloatArray4353[5] = f_298_;
	aFloatArray4353[6] = f_299_;
	aFloatArray4353[7] = f_300_;
	aFloatArray4353[8] = f_301_;
	aFloatArray4353[9] = f_302_;
	aFloatArray4353[10] = f_303_;
	aFloatArray4353[11] = f_304_;
	aFloatArray4353[12] = f_305_;
	aFloatArray4353[13] = f_306_;
	aFloatArray4353[14] = f_307_;
	aFloatArray4353[15] = f_308_;
    }
    
    public void method5293(Class268 class268_309_) {
	System.arraycopy(class268_309_.aFloatArray4353, 0, aFloatArray4353, 0,
			 11);
	aFloatArray4353[3] = 0.0F;
	aFloatArray4353[7] = 0.0F;
	aFloatArray4353[11] = 0.0F;
	aFloatArray4353[12] = 0.0F;
	aFloatArray4353[13] = 0.0F;
	aFloatArray4353[14] = 0.0F;
	aFloatArray4353[15] = 1.0F;
    }
    
    public boolean method5294() {
	return (aFloatArray4353[0] == 1.0F && aFloatArray4353[1] == 0.0F
		&& aFloatArray4353[2] == 0.0F && aFloatArray4353[3] == 0.0F
		&& aFloatArray4353[4] == 0.0F && aFloatArray4353[5] == 1.0F
		&& aFloatArray4353[6] == 0.0F && aFloatArray4353[7] == 0.0F
		&& aFloatArray4353[8] == 0.0F && aFloatArray4353[9] == 0.0F
		&& aFloatArray4353[10] == 1.0F && aFloatArray4353[11] == 0.0F
		&& aFloatArray4353[12] == 0.0F && aFloatArray4353[13] == 0.0F
		&& aFloatArray4353[14] == 0.0F && aFloatArray4353[15] == 1.0F);
    }
    
    public void method5295(int i, int i_310_, int i_311_, float f,
			   float f_312_, float f_313_) {
	if (i != 0) {
	    float f_314_ = Class269.aFloatArray4355[i & 0x3fff];
	    float f_315_ = Class269.aFloatArray4356[i & 0x3fff];
	    aFloatArray4353[0] = f_314_ * (float) i_310_;
	    aFloatArray4353[5] = f_314_ * (float) i_311_;
	    aFloatArray4353[1] = f_315_ * (float) i_310_;
	    aFloatArray4353[4] = -f_315_ * (float) i_311_;
	    aFloatArray4353[10] = 1.0F;
	    float[] fs = aFloatArray4353;
	    float[] fs_316_ = aFloatArray4353;
	    float[] fs_317_ = aFloatArray4353;
	    aFloatArray4353[9] = 0.0F;
	    fs_317_[8] = 0.0F;
	    fs_316_[6] = 0.0F;
	    fs[2] = 0.0F;
	} else {
	    aFloatArray4353[0] = (float) i_310_;
	    aFloatArray4353[5] = (float) i_311_;
	    aFloatArray4353[10] = 1.0F;
	    float[] fs = aFloatArray4353;
	    float[] fs_318_ = aFloatArray4353;
	    float[] fs_319_ = aFloatArray4353;
	    float[] fs_320_ = aFloatArray4353;
	    float[] fs_321_ = aFloatArray4353;
	    aFloatArray4353[9] = 0.0F;
	    fs_321_[8] = 0.0F;
	    fs_320_[6] = 0.0F;
	    fs_319_[4] = 0.0F;
	    fs_318_[2] = 0.0F;
	    fs[1] = 0.0F;
	}
	float[] fs = aFloatArray4353;
	float[] fs_322_ = aFloatArray4353;
	aFloatArray4353[11] = 0.0F;
	fs_322_[7] = 0.0F;
	fs[3] = 0.0F;
	aFloatArray4353[15] = 1.0F;
	aFloatArray4353[12] = f;
	aFloatArray4353[13] = f_312_;
	aFloatArray4353[14] = f_313_;
    }
    
    public void method5296(int i, int i_323_, int i_324_, float f,
			   float f_325_, float f_326_) {
	if (i != 0) {
	    float f_327_ = Class269.aFloatArray4355[i & 0x3fff];
	    float f_328_ = Class269.aFloatArray4356[i & 0x3fff];
	    aFloatArray4353[0] = f_327_ * (float) i_323_;
	    aFloatArray4353[5] = f_327_ * (float) i_324_;
	    aFloatArray4353[1] = f_328_ * (float) i_323_;
	    aFloatArray4353[4] = -f_328_ * (float) i_324_;
	    aFloatArray4353[10] = 1.0F;
	    float[] fs = aFloatArray4353;
	    float[] fs_329_ = aFloatArray4353;
	    float[] fs_330_ = aFloatArray4353;
	    aFloatArray4353[9] = 0.0F;
	    fs_330_[8] = 0.0F;
	    fs_329_[6] = 0.0F;
	    fs[2] = 0.0F;
	} else {
	    aFloatArray4353[0] = (float) i_323_;
	    aFloatArray4353[5] = (float) i_324_;
	    aFloatArray4353[10] = 1.0F;
	    float[] fs = aFloatArray4353;
	    float[] fs_331_ = aFloatArray4353;
	    float[] fs_332_ = aFloatArray4353;
	    float[] fs_333_ = aFloatArray4353;
	    float[] fs_334_ = aFloatArray4353;
	    aFloatArray4353[9] = 0.0F;
	    fs_334_[8] = 0.0F;
	    fs_333_[6] = 0.0F;
	    fs_332_[4] = 0.0F;
	    fs_331_[2] = 0.0F;
	    fs[1] = 0.0F;
	}
	float[] fs = aFloatArray4353;
	float[] fs_335_ = aFloatArray4353;
	aFloatArray4353[11] = 0.0F;
	fs_335_[7] = 0.0F;
	fs[3] = 0.0F;
	aFloatArray4353[15] = 1.0F;
	aFloatArray4353[12] = f;
	aFloatArray4353[13] = f_325_;
	aFloatArray4353[14] = f_326_;
    }
    
    public void method5297(Class268 class268_336_) {
	float f = (aFloatArray4353[0] * class268_336_.aFloatArray4353[0]
		   + aFloatArray4353[1] * class268_336_.aFloatArray4353[4]
		   + aFloatArray4353[2] * class268_336_.aFloatArray4353[8]
		   + aFloatArray4353[3] * class268_336_.aFloatArray4353[12]);
	float f_337_
	    = (aFloatArray4353[0] * class268_336_.aFloatArray4353[1]
	       + aFloatArray4353[1] * class268_336_.aFloatArray4353[5]
	       + aFloatArray4353[2] * class268_336_.aFloatArray4353[9]
	       + aFloatArray4353[3] * class268_336_.aFloatArray4353[13]);
	float f_338_
	    = (aFloatArray4353[0] * class268_336_.aFloatArray4353[2]
	       + aFloatArray4353[1] * class268_336_.aFloatArray4353[6]
	       + aFloatArray4353[2] * class268_336_.aFloatArray4353[10]
	       + aFloatArray4353[3] * class268_336_.aFloatArray4353[14]);
	float f_339_
	    = (aFloatArray4353[0] * class268_336_.aFloatArray4353[3]
	       + aFloatArray4353[1] * class268_336_.aFloatArray4353[7]
	       + aFloatArray4353[2] * class268_336_.aFloatArray4353[11]
	       + aFloatArray4353[3] * class268_336_.aFloatArray4353[15]);
	float f_340_
	    = (aFloatArray4353[4] * class268_336_.aFloatArray4353[0]
	       + aFloatArray4353[5] * class268_336_.aFloatArray4353[4]
	       + aFloatArray4353[6] * class268_336_.aFloatArray4353[8]
	       + aFloatArray4353[7] * class268_336_.aFloatArray4353[12]);
	float f_341_
	    = (aFloatArray4353[4] * class268_336_.aFloatArray4353[1]
	       + aFloatArray4353[5] * class268_336_.aFloatArray4353[5]
	       + aFloatArray4353[6] * class268_336_.aFloatArray4353[9]
	       + aFloatArray4353[7] * class268_336_.aFloatArray4353[13]);
	float f_342_
	    = (aFloatArray4353[4] * class268_336_.aFloatArray4353[2]
	       + aFloatArray4353[5] * class268_336_.aFloatArray4353[6]
	       + aFloatArray4353[6] * class268_336_.aFloatArray4353[10]
	       + aFloatArray4353[7] * class268_336_.aFloatArray4353[14]);
	float f_343_
	    = (aFloatArray4353[4] * class268_336_.aFloatArray4353[3]
	       + aFloatArray4353[5] * class268_336_.aFloatArray4353[7]
	       + aFloatArray4353[6] * class268_336_.aFloatArray4353[11]
	       + aFloatArray4353[7] * class268_336_.aFloatArray4353[15]);
	float f_344_
	    = (aFloatArray4353[8] * class268_336_.aFloatArray4353[0]
	       + aFloatArray4353[9] * class268_336_.aFloatArray4353[4]
	       + aFloatArray4353[10] * class268_336_.aFloatArray4353[8]
	       + aFloatArray4353[11] * class268_336_.aFloatArray4353[12]);
	float f_345_
	    = (aFloatArray4353[8] * class268_336_.aFloatArray4353[1]
	       + aFloatArray4353[9] * class268_336_.aFloatArray4353[5]
	       + aFloatArray4353[10] * class268_336_.aFloatArray4353[9]
	       + aFloatArray4353[11] * class268_336_.aFloatArray4353[13]);
	float f_346_
	    = (aFloatArray4353[8] * class268_336_.aFloatArray4353[2]
	       + aFloatArray4353[9] * class268_336_.aFloatArray4353[6]
	       + aFloatArray4353[10] * class268_336_.aFloatArray4353[10]
	       + aFloatArray4353[11] * class268_336_.aFloatArray4353[14]);
	float f_347_
	    = (aFloatArray4353[8] * class268_336_.aFloatArray4353[3]
	       + aFloatArray4353[9] * class268_336_.aFloatArray4353[7]
	       + aFloatArray4353[10] * class268_336_.aFloatArray4353[11]
	       + aFloatArray4353[11] * class268_336_.aFloatArray4353[15]);
	float f_348_
	    = (aFloatArray4353[12] * class268_336_.aFloatArray4353[0]
	       + aFloatArray4353[13] * class268_336_.aFloatArray4353[4]
	       + aFloatArray4353[14] * class268_336_.aFloatArray4353[8]
	       + aFloatArray4353[15] * class268_336_.aFloatArray4353[12]);
	float f_349_
	    = (aFloatArray4353[12] * class268_336_.aFloatArray4353[1]
	       + aFloatArray4353[13] * class268_336_.aFloatArray4353[5]
	       + aFloatArray4353[14] * class268_336_.aFloatArray4353[9]
	       + aFloatArray4353[15] * class268_336_.aFloatArray4353[13]);
	float f_350_
	    = (aFloatArray4353[12] * class268_336_.aFloatArray4353[2]
	       + aFloatArray4353[13] * class268_336_.aFloatArray4353[6]
	       + aFloatArray4353[14] * class268_336_.aFloatArray4353[10]
	       + aFloatArray4353[15] * class268_336_.aFloatArray4353[14]);
	float f_351_
	    = (aFloatArray4353[12] * class268_336_.aFloatArray4353[3]
	       + aFloatArray4353[13] * class268_336_.aFloatArray4353[7]
	       + aFloatArray4353[14] * class268_336_.aFloatArray4353[11]
	       + aFloatArray4353[15] * class268_336_.aFloatArray4353[15]);
	aFloatArray4353[0] = f;
	aFloatArray4353[1] = f_337_;
	aFloatArray4353[2] = f_338_;
	aFloatArray4353[3] = f_339_;
	aFloatArray4353[4] = f_340_;
	aFloatArray4353[5] = f_341_;
	aFloatArray4353[6] = f_342_;
	aFloatArray4353[7] = f_343_;
	aFloatArray4353[8] = f_344_;
	aFloatArray4353[9] = f_345_;
	aFloatArray4353[10] = f_346_;
	aFloatArray4353[11] = f_347_;
	aFloatArray4353[12] = f_348_;
	aFloatArray4353[13] = f_349_;
	aFloatArray4353[14] = f_350_;
	aFloatArray4353[15] = f_351_;
    }
    
    public int method5298() {
	int i = 1;
	i = 31 * i + Arrays.hashCode(aFloatArray4353);
	return i;
    }
}
