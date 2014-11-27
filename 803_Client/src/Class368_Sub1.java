/* Class368_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class368_Sub1 extends Class368
{
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10343;
    public static float aFloat10344;
    public static float aFloat10345;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10346;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10347;
    Class55 aClass55_10348;
    Class116 aClass116_10349;
    public static float aFloat10350 = 1.0F;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10351;
    public static float aFloat10352;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10353;
    public static float aFloat10354;
    boolean aBool10355;
    
    int method6566() {
	return 1;
    }
    
    void method6590(int i, int i_0_) {
	/* empty */
    }
    
    boolean method6565() {
	return ((Class368_Sub1) this).aBool10355;
    }
    
    int method6584() {
	return 0;
    }
    
    void method6568() {
	/* empty */
    }
    
    void method6564() {
	/* empty */
    }
    
    int method6587() {
	return 1;
    }
    
    int method6569() {
	return 1;
    }
    
    void method6561(int i) {
	((Class368_Sub1) this).aClass116_10349.method2911();
    }
    
    int method6570() {
	return 0;
    }
    
    void method6578(int i, Class105_Sub2 class105_sub2,
		    Interface41 interface41, Interface5 interface5,
		    Interface41 interface41_1_, boolean bool) {
	float f = aClass103_Sub3_5565.method15622();
	float f_2_ = (float) class105_sub2.method2655();
	float f_3_ = (float) class105_sub2.method2654();
	float f_4_ = f * 2.0F / f_2_;
	float f_5_ = -f * 2.0F / f_3_;
	float[] fs = { -1.0F + f_4_, 1.0F + f_5_, 0.0F, 0.0F, -1.0F + f_4_,
		       -3.0F + f_5_, 0.0F, 2.0F, 3.0F + f_4_, 1.0F + f_5_,
		       2.0F, 0.0F };
	int i_6_ = (int) f_2_;
	int i_7_ = (int) f_3_;
	int i_8_
	    = (bool ? aClass103_Sub3_5565.method2571(-2040982002).method2655()
	       : i_6_);
	int i_9_
	    = (bool ? aClass103_Sub3_5565.method2571(-1049859479).method2654()
	       : i_7_);
	((Class368_Sub1) this).aClass116_10349
	    .method2895(((Class368_Sub1) this).aClass55_10348);
	((Class368_Sub1) this).aClass116_10349.method2805();
	float f_10_ = (float) i_6_ / f_2_;
	float f_11_ = (float) i_7_ / f_3_;
	float f_12_ = (float) i_8_ / f_2_;
	float f_13_ = (float) i_9_ / f_3_;
	fs[8] = (fs[8] + 1.0F) * f_10_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_11_ + 1.0F;
	fs[10] *= f_12_;
	fs[7] *= f_13_;
	((Class368_Sub1) this).aClass116_10349.method2910
	    (((Class368_Sub1) this).aClass241_Sub23_Sub1_10351, fs,
	     (byte) -102);
	((Class368_Sub1) this).aClass116_10349.method2828
	    (((Class368_Sub1) this).aClass241_Sub23_Sub1_10343, 0, interface41,
	     1966589841);
	((Class368_Sub1) this).aClass116_10349.method2818
	    (((Class368_Sub1) this).aClass241_Sub23_Sub1_10346, aFloat10350,
	     (byte) -42);
	((Class368_Sub1) this).aClass116_10349.method2821
	    (((Class368_Sub1) this).aClass241_Sub23_Sub1_10347, aFloat10345,
	     aFloat10352, aFloat10344, aFloat10354, (short) -22838);
	((Class368_Sub1) this).aClass116_10349.method2821
	    (((Class368_Sub1) this).aClass241_Sub23_Sub1_10353, 0.0F, 0.0F,
	     0.0F, 0.0F, (short) -14728);
	aClass103_Sub3_5565.method2254(0, 0, i_6_, i_7_);
	aClass103_Sub3_5565.method2445(0, 0, i_6_, i_7_);
    }
    
    boolean method6573() {
	return (aFloat10350 == 1.0F && aFloat10345 == 0.0F
		&& aFloat10352 == 1.0F && aFloat10344 == 0.0F
		&& aFloat10354 == 1.0F);
    }
    
    boolean method6571() {
	if (method16659()) {
	    ((Class368_Sub1) this).aClass116_10349
		= aClass103_Sub3_5565.method15784("FilterLevels");
	    if (((Class368_Sub1) this).aClass116_10349 == null)
		return false;
	    try {
		((Class368_Sub1) this).aClass241_Sub23_Sub1_10343
		    = ((Class368_Sub1) this).aClass116_10349
			  .method2815("sceneTex", (byte) -23);
		((Class368_Sub1) this).aClass241_Sub23_Sub1_10346
		    = ((Class368_Sub1) this).aClass116_10349
			  .method2815("paramsGamma", (byte) -74);
		((Class368_Sub1) this).aClass241_Sub23_Sub1_10347
		    = ((Class368_Sub1) this).aClass116_10349
			  .method2815("paramsRanges", (byte) -30);
		((Class368_Sub1) this).aClass241_Sub23_Sub1_10353
		    = ((Class368_Sub1) this).aClass116_10349
			  .method2815("pixelOffset", (byte) -86);
		((Class368_Sub1) this).aClass241_Sub23_Sub1_10351
		    = ((Class368_Sub1) this).aClass116_10349
			  .method2815("PosAndTexCoords", (byte) -39);
		((Class368_Sub1) this).aClass55_10348
		    = ((Class368_Sub1) this).aClass116_10349
			  .method2810("techAdjust", (byte) 1);
	    } catch (Exception_Sub7_Sub2 exception_sub7_sub2) {
		return false;
	    } catch (Exception_Sub7_Sub1 exception_sub7_sub1) {
		return false;
	    }
	    if (!((Class368_Sub1) this).aClass55_10348.method1311())
		return false;
	    ((Class368_Sub1) this).aBool10355 = true;
	    return true;
	}
	return false;
    }
    
    boolean method6574() {
	return ((Class368_Sub1) this).aBool10355;
    }
    
    boolean method6575() {
	if (method16659()) {
	    ((Class368_Sub1) this).aClass116_10349
		= aClass103_Sub3_5565.method15784("FilterLevels");
	    if (((Class368_Sub1) this).aClass116_10349 == null)
		return false;
	    try {
		((Class368_Sub1) this).aClass241_Sub23_Sub1_10343
		    = ((Class368_Sub1) this).aClass116_10349
			  .method2815("sceneTex", (byte) -55);
		((Class368_Sub1) this).aClass241_Sub23_Sub1_10346
		    = ((Class368_Sub1) this).aClass116_10349
			  .method2815("paramsGamma", (byte) -53);
		((Class368_Sub1) this).aClass241_Sub23_Sub1_10347
		    = ((Class368_Sub1) this).aClass116_10349
			  .method2815("paramsRanges", (byte) -38);
		((Class368_Sub1) this).aClass241_Sub23_Sub1_10353
		    = ((Class368_Sub1) this).aClass116_10349
			  .method2815("pixelOffset", (byte) -73);
		((Class368_Sub1) this).aClass241_Sub23_Sub1_10351
		    = ((Class368_Sub1) this).aClass116_10349
			  .method2815("PosAndTexCoords", (byte) -36);
		((Class368_Sub1) this).aClass55_10348
		    = ((Class368_Sub1) this).aClass116_10349
			  .method2810("techAdjust", (byte) 1);
	    } catch (Exception_Sub7_Sub2 exception_sub7_sub2) {
		return false;
	    } catch (Exception_Sub7_Sub1 exception_sub7_sub1) {
		return false;
	    }
	    if (!((Class368_Sub1) this).aClass55_10348.method1311())
		return false;
	    ((Class368_Sub1) this).aBool10355 = true;
	    return true;
	}
	return false;
    }
    
    boolean method6576() {
	if (method16659()) {
	    ((Class368_Sub1) this).aClass116_10349
		= aClass103_Sub3_5565.method15784("FilterLevels");
	    if (((Class368_Sub1) this).aClass116_10349 == null)
		return false;
	    try {
		((Class368_Sub1) this).aClass241_Sub23_Sub1_10343
		    = ((Class368_Sub1) this).aClass116_10349
			  .method2815("sceneTex", (byte) -63);
		((Class368_Sub1) this).aClass241_Sub23_Sub1_10346
		    = ((Class368_Sub1) this).aClass116_10349
			  .method2815("paramsGamma", (byte) -106);
		((Class368_Sub1) this).aClass241_Sub23_Sub1_10347
		    = ((Class368_Sub1) this).aClass116_10349
			  .method2815("paramsRanges", (byte) -98);
		((Class368_Sub1) this).aClass241_Sub23_Sub1_10353
		    = ((Class368_Sub1) this).aClass116_10349
			  .method2815("pixelOffset", (byte) -2);
		((Class368_Sub1) this).aClass241_Sub23_Sub1_10351
		    = ((Class368_Sub1) this).aClass116_10349
			  .method2815("PosAndTexCoords", (byte) -103);
		((Class368_Sub1) this).aClass55_10348
		    = ((Class368_Sub1) this).aClass116_10349
			  .method2810("techAdjust", (byte) 1);
	    } catch (Exception_Sub7_Sub2 exception_sub7_sub2) {
		return false;
	    } catch (Exception_Sub7_Sub1 exception_sub7_sub1) {
		return false;
	    }
	    if (!((Class368_Sub1) this).aClass55_10348.method1311())
		return false;
	    ((Class368_Sub1) this).aBool10355 = true;
	    return true;
	}
	return false;
    }
    
    static {
	aFloat10345 = 0.0F;
	aFloat10352 = 1.0F;
	aFloat10344 = 0.0F;
	aFloat10354 = 1.0F;
    }
    
    void method6579() {
	/* empty */
    }
    
    void method6591(int i, int i_14_) {
	/* empty */
    }
    
    void method6581(int i) {
	((Class368_Sub1) this).aClass116_10349.method2911();
    }
    
    int method6562() {
	return 1;
    }
    
    int method6583() {
	return 1;
    }
    
    int method6586() {
	return 0;
    }
    
    int method6585() {
	return 1;
    }
    
    boolean method16658() {
	return (aClass103_Sub3_5565.aBool9549
		&& aClass103_Sub3_5565.method15606());
    }
    
    void method6567(int i, Class105_Sub2 class105_sub2,
		    Interface41 interface41, Interface5 interface5,
		    Interface41 interface41_15_, boolean bool) {
	float f = aClass103_Sub3_5565.method15622();
	float f_16_ = (float) class105_sub2.method2655();
	float f_17_ = (float) class105_sub2.method2654();
	float f_18_ = f * 2.0F / f_16_;
	float f_19_ = -f * 2.0F / f_17_;
	float[] fs = { -1.0F + f_18_, 1.0F + f_19_, 0.0F, 0.0F, -1.0F + f_18_,
		       -3.0F + f_19_, 0.0F, 2.0F, 3.0F + f_18_, 1.0F + f_19_,
		       2.0F, 0.0F };
	int i_20_ = (int) f_16_;
	int i_21_ = (int) f_17_;
	int i_22_
	    = (bool ? aClass103_Sub3_5565.method2571(-1945857682).method2655()
	       : i_20_);
	int i_23_
	    = (bool ? aClass103_Sub3_5565.method2571(-1559056787).method2654()
	       : i_21_);
	((Class368_Sub1) this).aClass116_10349
	    .method2895(((Class368_Sub1) this).aClass55_10348);
	((Class368_Sub1) this).aClass116_10349.method2805();
	float f_24_ = (float) i_20_ / f_16_;
	float f_25_ = (float) i_21_ / f_17_;
	float f_26_ = (float) i_22_ / f_16_;
	float f_27_ = (float) i_23_ / f_17_;
	fs[8] = (fs[8] + 1.0F) * f_24_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_25_ + 1.0F;
	fs[10] *= f_26_;
	fs[7] *= f_27_;
	((Class368_Sub1) this).aClass116_10349.method2910
	    (((Class368_Sub1) this).aClass241_Sub23_Sub1_10351, fs,
	     (byte) -26);
	((Class368_Sub1) this).aClass116_10349.method2828
	    (((Class368_Sub1) this).aClass241_Sub23_Sub1_10343, 0, interface41,
	     1332817273);
	((Class368_Sub1) this).aClass116_10349.method2818
	    (((Class368_Sub1) this).aClass241_Sub23_Sub1_10346, aFloat10350,
	     (byte) -128);
	((Class368_Sub1) this).aClass116_10349.method2821
	    (((Class368_Sub1) this).aClass241_Sub23_Sub1_10347, aFloat10345,
	     aFloat10352, aFloat10344, aFloat10354, (short) -1766);
	((Class368_Sub1) this).aClass116_10349.method2821
	    (((Class368_Sub1) this).aClass241_Sub23_Sub1_10353, 0.0F, 0.0F,
	     0.0F, 0.0F, (short) -19685);
	aClass103_Sub3_5565.method2254(0, 0, i_20_, i_21_);
	aClass103_Sub3_5565.method2445(0, 0, i_20_, i_21_);
    }
    
    boolean method6580() {
	return (aFloat10350 == 1.0F && aFloat10345 == 0.0F
		&& aFloat10352 == 1.0F && aFloat10344 == 0.0F
		&& aFloat10354 == 1.0F);
    }
    
    public Class368_Sub1(Class103_Sub3 class103_sub3) {
	super(class103_sub3);
    }
    
    boolean method16659() {
	return (aClass103_Sub3_5565.aBool9549
		&& aClass103_Sub3_5565.method15606());
    }
}
