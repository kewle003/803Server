/* Class368_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class368_Sub3 extends Class368
{
    public static float aFloat10452;
    public static float aFloat10453 = 0.25F;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10454;
    public static float aFloat10455;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10456;
    Class116 aClass116_10457;
    public static float aFloat10458;
    Class55 aClass55_10459;
    Class55 aClass55_10460;
    Class55 aClass55_10461;
    Class55 aClass55_10462;
    boolean aBool10463;
    Class55 aClass55_10464;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10465;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10466;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10467;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10468;
    static final int anInt10469 = 256;
    
    boolean method16758() {
	return (aClass103_Sub3_5565.aBool9549
		&& aClass103_Sub3_5565.method15606());
    }
    
    boolean method16759() {
	return (aClass103_Sub3_5565.aBool9549
		&& aClass103_Sub3_5565.method15606());
    }
    
    boolean method6565() {
	return ((Class368_Sub3) this).aBool10463;
    }
    
    boolean method6571() {
	if (method16759()) {
	    ((Class368_Sub3) this).aClass116_10457
		= aClass103_Sub3_5565.method15784("FilterBloom");
	    if (((Class368_Sub3) this).aClass116_10457 == null)
		return false;
	    try {
		((Class368_Sub3) this).aClass241_Sub23_Sub1_10468
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2815("sceneTex", (byte) -55);
		((Class368_Sub3) this).aClass241_Sub23_Sub1_10454
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2815("bloomTex1", (byte) -97);
		((Class368_Sub3) this).aClass241_Sub23_Sub1_10465
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2815("params", (byte) -5);
		((Class368_Sub3) this).aClass241_Sub23_Sub1_10466
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2815("sampleSize", (byte) -105);
		((Class368_Sub3) this).aClass241_Sub23_Sub1_10467
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2815("pixelOffsetAndBloomScale", (byte) -16);
		((Class368_Sub3) this).aClass241_Sub23_Sub1_10456
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2815("PosAndTexCoords", (byte) -56);
		((Class368_Sub3) this).aClass116_10457.method2810("test",
								  (byte) 1);
		((Class368_Sub3) this).aClass55_10462
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2810("techFullscreenTri", (byte) 1);
		((Class368_Sub3) this).aClass55_10459
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2810("brightpass", (byte) 1);
		((Class368_Sub3) this).aClass55_10460
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2810("blur", (byte) 1);
		((Class368_Sub3) this).aClass55_10461
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2810("composite", (byte) 1);
		((Class368_Sub3) this).aClass55_10464
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2810("techDefault", (byte) 1);
	    } catch (Exception_Sub7_Sub2 exception_sub7_sub2) {
		return false;
	    } catch (Exception_Sub7_Sub1 exception_sub7_sub1) {
		return false;
	    }
	    if (!((Class368_Sub3) this).aClass55_10462.method1311())
		return false;
	    if (!((Class368_Sub3) this).aClass55_10459.method1311())
		return false;
	    if (!((Class368_Sub3) this).aClass55_10460.method1311())
		return false;
	    if (!((Class368_Sub3) this).aClass55_10461.method1311())
		return false;
	    if (!((Class368_Sub3) this).aClass55_10464.method1311())
		return false;
	    ((Class368_Sub3) this).aBool10463 = true;
	    return true;
	}
	return false;
    }
    
    void method6590(int i, int i_0_) {
	/* empty */
    }
    
    public Class368_Sub3(Class103_Sub3 class103_sub3) {
	super(class103_sub3);
    }
    
    int method6587() {
	return 4;
    }
    
    void method6578(int i, Class105_Sub2 class105_sub2,
		    Interface41 interface41, Interface5 interface5,
		    Interface41 interface41_1_, boolean bool) {
	float f = aClass103_Sub3_5565.method15622();
	float f_2_ = (float) class105_sub2.method2655();
	float f_3_ = (float) class105_sub2.method2654();
	Interface41 interface41_4_ = interface41;
	float f_5_ = f * 2.0F / f_2_;
	float f_6_ = -f * 2.0F / f_3_;
	float[] fs = { -1.0F + f_5_, 1.0F + f_6_, 0.0F, 0.0F, -1.0F + f_5_,
		       -3.0F + f_6_, 0.0F, 2.0F, 3.0F + f_5_, 1.0F + f_6_,
		       2.0F, 0.0F };
	int i_7_ = (int) f_2_;
	int i_8_ = (int) f_3_;
	int i_9_
	    = (bool ? aClass103_Sub3_5565.method2571(-1917551815).method2655()
	       : i_7_);
	int i_10_
	    = (bool ? aClass103_Sub3_5565.method2571(-290059056).method2654()
	       : i_8_);
	if (i == 0) {
	    i_7_ = 256;
	    i_8_ = 256;
	    ((Class368_Sub3) this).aClass116_10457
		.method2895(((Class368_Sub3) this).aClass55_10459);
	    ((Class368_Sub3) this).aClass116_10457.method2805();
	} else if (i == 1) {
	    i_7_ = 256;
	    i_8_ = 256;
	    i_9_ = i_7_;
	    i_10_ = i_8_;
	    ((Class368_Sub3) this).aClass116_10457
		.method2895(((Class368_Sub3) this).aClass55_10460);
	    ((Class368_Sub3) this).aClass116_10457.method2805();
	    ((Class368_Sub3) this).aClass116_10457.method2819
		(((Class368_Sub3) this).aClass241_Sub23_Sub1_10466,
		 aFloat10458 / f_2_, 0.0F, -679946765);
	} else if (i == 2) {
	    i_7_ = 256;
	    i_8_ = 256;
	    i_9_ = i_7_;
	    i_10_ = i_8_;
	    ((Class368_Sub3) this).aClass116_10457
		.method2895(((Class368_Sub3) this).aClass55_10460);
	    ((Class368_Sub3) this).aClass116_10457.method2805();
	    ((Class368_Sub3) this).aClass116_10457.method2819
		(((Class368_Sub3) this).aClass241_Sub23_Sub1_10466, 0.0F,
		 aFloat10458 / f_3_, -679946765);
	} else if (i == 3) {
	    ((Class368_Sub3) this).aClass116_10457
		.method2895(((Class368_Sub3) this).aClass55_10461);
	    interface41_4_ = interface41_1_;
	    ((Class368_Sub3) this).aClass116_10457.method2828
		(((Class368_Sub3) this).aClass241_Sub23_Sub1_10454, 1,
		 interface41, 1333979212);
	    ((Class368_Sub3) this).aClass116_10457.method2805();
	}
	float f_11_ = (float) i_7_ / f_2_;
	float f_12_ = (float) i_8_ / f_3_;
	float f_13_ = (float) i_9_ / f_2_;
	float f_14_ = (float) i_10_ / f_3_;
	fs[8] = (fs[8] + 1.0F) * f_11_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_12_ + 1.0F;
	fs[10] *= f_13_;
	fs[7] *= f_14_;
	((Class368_Sub3) this).aClass116_10457.method2910
	    (((Class368_Sub3) this).aClass241_Sub23_Sub1_10456, fs,
	     (byte) -112);
	((Class368_Sub3) this).aClass116_10457.method2828
	    (((Class368_Sub3) this).aClass241_Sub23_Sub1_10468, 0,
	     interface41_4_, -677223548);
	((Class368_Sub3) this).aClass116_10457.method2821
	    (((Class368_Sub3) this).aClass241_Sub23_Sub1_10465, aFloat10455,
	     aFloat10453, aFloat10452, 0.0F, (short) -13306);
	((Class368_Sub3) this).aClass116_10457.method2821
	    (((Class368_Sub3) this).aClass241_Sub23_Sub1_10467, 0.0F, 0.0F,
	     256.0F / f_2_, 256.0F / f_3_, (short) -17561);
	aClass103_Sub3_5565.method2254(0, 0, i_7_, i_8_);
	aClass103_Sub3_5565.method2445(0, 0, i_7_, i_8_);
    }
    
    void method6561(int i) {
	((Class368_Sub3) this).aClass116_10457.method2911();
    }
    
    int method6570() {
	return 1;
    }
    
    int method6569() {
	return 0;
    }
    
    static {
	aFloat10452 = 1.0F;
	aFloat10455 = 1.0F;
	aFloat10458 = 1.0F;
    }
    
    boolean method16760() {
	return (aClass103_Sub3_5565.aBool9549
		&& aClass103_Sub3_5565.method15606());
    }
    
    boolean method6574() {
	return ((Class368_Sub3) this).aBool10463;
    }
    
    boolean method6576() {
	if (method16759()) {
	    ((Class368_Sub3) this).aClass116_10457
		= aClass103_Sub3_5565.method15784("FilterBloom");
	    if (((Class368_Sub3) this).aClass116_10457 == null)
		return false;
	    try {
		((Class368_Sub3) this).aClass241_Sub23_Sub1_10468
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2815("sceneTex", (byte) -3);
		((Class368_Sub3) this).aClass241_Sub23_Sub1_10454
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2815("bloomTex1", (byte) -126);
		((Class368_Sub3) this).aClass241_Sub23_Sub1_10465
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2815("params", (byte) -43);
		((Class368_Sub3) this).aClass241_Sub23_Sub1_10466
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2815("sampleSize", (byte) -116);
		((Class368_Sub3) this).aClass241_Sub23_Sub1_10467
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2815("pixelOffsetAndBloomScale", (byte) -107);
		((Class368_Sub3) this).aClass241_Sub23_Sub1_10456
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2815("PosAndTexCoords", (byte) -27);
		((Class368_Sub3) this).aClass116_10457.method2810("test",
								  (byte) 1);
		((Class368_Sub3) this).aClass55_10462
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2810("techFullscreenTri", (byte) 1);
		((Class368_Sub3) this).aClass55_10459
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2810("brightpass", (byte) 1);
		((Class368_Sub3) this).aClass55_10460
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2810("blur", (byte) 1);
		((Class368_Sub3) this).aClass55_10461
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2810("composite", (byte) 1);
		((Class368_Sub3) this).aClass55_10464
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2810("techDefault", (byte) 1);
	    } catch (Exception_Sub7_Sub2 exception_sub7_sub2) {
		return false;
	    } catch (Exception_Sub7_Sub1 exception_sub7_sub1) {
		return false;
	    }
	    if (!((Class368_Sub3) this).aClass55_10462.method1311())
		return false;
	    if (!((Class368_Sub3) this).aClass55_10459.method1311())
		return false;
	    if (!((Class368_Sub3) this).aClass55_10460.method1311())
		return false;
	    if (!((Class368_Sub3) this).aClass55_10461.method1311())
		return false;
	    if (!((Class368_Sub3) this).aClass55_10464.method1311())
		return false;
	    ((Class368_Sub3) this).aBool10463 = true;
	    return true;
	}
	return false;
    }
    
    void method6567(int i, Class105_Sub2 class105_sub2,
		    Interface41 interface41, Interface5 interface5,
		    Interface41 interface41_15_, boolean bool) {
	float f = aClass103_Sub3_5565.method15622();
	float f_16_ = (float) class105_sub2.method2655();
	float f_17_ = (float) class105_sub2.method2654();
	Interface41 interface41_18_ = interface41;
	float f_19_ = f * 2.0F / f_16_;
	float f_20_ = -f * 2.0F / f_17_;
	float[] fs = { -1.0F + f_19_, 1.0F + f_20_, 0.0F, 0.0F, -1.0F + f_19_,
		       -3.0F + f_20_, 0.0F, 2.0F, 3.0F + f_19_, 1.0F + f_20_,
		       2.0F, 0.0F };
	int i_21_ = (int) f_16_;
	int i_22_ = (int) f_17_;
	int i_23_
	    = (bool ? aClass103_Sub3_5565.method2571(-1612433904).method2655()
	       : i_21_);
	int i_24_
	    = (bool ? aClass103_Sub3_5565.method2571(-570641280).method2654()
	       : i_22_);
	if (i == 0) {
	    i_21_ = 256;
	    i_22_ = 256;
	    ((Class368_Sub3) this).aClass116_10457
		.method2895(((Class368_Sub3) this).aClass55_10459);
	    ((Class368_Sub3) this).aClass116_10457.method2805();
	} else if (i == 1) {
	    i_21_ = 256;
	    i_22_ = 256;
	    i_23_ = i_21_;
	    i_24_ = i_22_;
	    ((Class368_Sub3) this).aClass116_10457
		.method2895(((Class368_Sub3) this).aClass55_10460);
	    ((Class368_Sub3) this).aClass116_10457.method2805();
	    ((Class368_Sub3) this).aClass116_10457.method2819
		(((Class368_Sub3) this).aClass241_Sub23_Sub1_10466,
		 aFloat10458 / f_16_, 0.0F, -679946765);
	} else if (i == 2) {
	    i_21_ = 256;
	    i_22_ = 256;
	    i_23_ = i_21_;
	    i_24_ = i_22_;
	    ((Class368_Sub3) this).aClass116_10457
		.method2895(((Class368_Sub3) this).aClass55_10460);
	    ((Class368_Sub3) this).aClass116_10457.method2805();
	    ((Class368_Sub3) this).aClass116_10457.method2819
		(((Class368_Sub3) this).aClass241_Sub23_Sub1_10466, 0.0F,
		 aFloat10458 / f_17_, -679946765);
	} else if (i == 3) {
	    ((Class368_Sub3) this).aClass116_10457
		.method2895(((Class368_Sub3) this).aClass55_10461);
	    interface41_18_ = interface41_15_;
	    ((Class368_Sub3) this).aClass116_10457.method2828
		(((Class368_Sub3) this).aClass241_Sub23_Sub1_10454, 1,
		 interface41, 788066233);
	    ((Class368_Sub3) this).aClass116_10457.method2805();
	}
	float f_25_ = (float) i_21_ / f_16_;
	float f_26_ = (float) i_22_ / f_17_;
	float f_27_ = (float) i_23_ / f_16_;
	float f_28_ = (float) i_24_ / f_17_;
	fs[8] = (fs[8] + 1.0F) * f_25_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_26_ + 1.0F;
	fs[10] *= f_27_;
	fs[7] *= f_28_;
	((Class368_Sub3) this).aClass116_10457.method2910
	    (((Class368_Sub3) this).aClass241_Sub23_Sub1_10456, fs,
	     (byte) -30);
	((Class368_Sub3) this).aClass116_10457.method2828
	    (((Class368_Sub3) this).aClass241_Sub23_Sub1_10468, 0,
	     interface41_18_, 2068214446);
	((Class368_Sub3) this).aClass116_10457.method2821
	    (((Class368_Sub3) this).aClass241_Sub23_Sub1_10465, aFloat10455,
	     aFloat10453, aFloat10452, 0.0F, (short) 45);
	((Class368_Sub3) this).aClass116_10457.method2821
	    (((Class368_Sub3) this).aClass241_Sub23_Sub1_10467, 0.0F, 0.0F,
	     256.0F / f_16_, 256.0F / f_17_, (short) -27590);
	aClass103_Sub3_5565.method2254(0, 0, i_21_, i_22_);
	aClass103_Sub3_5565.method2445(0, 0, i_21_, i_22_);
    }
    
    int method6566() {
	return 0;
    }
    
    void method6579() {
	/* empty */
    }
    
    void method6591(int i, int i_29_) {
	/* empty */
    }
    
    void method6581(int i) {
	((Class368_Sub3) this).aClass116_10457.method2911();
    }
    
    int method6562() {
	return 4;
    }
    
    int method6583() {
	return 0;
    }
    
    boolean method6573() {
	return false;
    }
    
    int method6585() {
	return 0;
    }
    
    boolean method6575() {
	if (method16759()) {
	    ((Class368_Sub3) this).aClass116_10457
		= aClass103_Sub3_5565.method15784("FilterBloom");
	    if (((Class368_Sub3) this).aClass116_10457 == null)
		return false;
	    try {
		((Class368_Sub3) this).aClass241_Sub23_Sub1_10468
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2815("sceneTex", (byte) -18);
		((Class368_Sub3) this).aClass241_Sub23_Sub1_10454
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2815("bloomTex1", (byte) -61);
		((Class368_Sub3) this).aClass241_Sub23_Sub1_10465
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2815("params", (byte) -3);
		((Class368_Sub3) this).aClass241_Sub23_Sub1_10466
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2815("sampleSize", (byte) -63);
		((Class368_Sub3) this).aClass241_Sub23_Sub1_10467
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2815("pixelOffsetAndBloomScale", (byte) -80);
		((Class368_Sub3) this).aClass241_Sub23_Sub1_10456
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2815("PosAndTexCoords", (byte) -1);
		((Class368_Sub3) this).aClass116_10457.method2810("test",
								  (byte) 1);
		((Class368_Sub3) this).aClass55_10462
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2810("techFullscreenTri", (byte) 1);
		((Class368_Sub3) this).aClass55_10459
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2810("brightpass", (byte) 1);
		((Class368_Sub3) this).aClass55_10460
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2810("blur", (byte) 1);
		((Class368_Sub3) this).aClass55_10461
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2810("composite", (byte) 1);
		((Class368_Sub3) this).aClass55_10464
		    = ((Class368_Sub3) this).aClass116_10457
			  .method2810("techDefault", (byte) 1);
	    } catch (Exception_Sub7_Sub2 exception_sub7_sub2) {
		return false;
	    } catch (Exception_Sub7_Sub1 exception_sub7_sub1) {
		return false;
	    }
	    if (!((Class368_Sub3) this).aClass55_10462.method1311())
		return false;
	    if (!((Class368_Sub3) this).aClass55_10459.method1311())
		return false;
	    if (!((Class368_Sub3) this).aClass55_10460.method1311())
		return false;
	    if (!((Class368_Sub3) this).aClass55_10461.method1311())
		return false;
	    if (!((Class368_Sub3) this).aClass55_10464.method1311())
		return false;
	    ((Class368_Sub3) this).aBool10463 = true;
	    return true;
	}
	return false;
    }
    
    boolean method16761() {
	return (aClass103_Sub3_5565.aBool9549
		&& aClass103_Sub3_5565.method15606());
    }
    
    int method6586() {
	return 1;
    }
    
    void method6568() {
	/* empty */
    }
    
    int method6584() {
	return 1;
    }
    
    boolean method6580() {
	return false;
    }
    
    boolean method16762() {
	return (aClass103_Sub3_5565.aBool9549
		&& aClass103_Sub3_5565.method15606());
    }
    
    void method6564() {
	/* empty */
    }
}
