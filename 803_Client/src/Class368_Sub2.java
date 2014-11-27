/* Class368_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class368_Sub2 extends Class368
{
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10362;
    public static float aFloat10363;
    public static int anInt10364;
    public static float[] aFloatArray10365 = { 0.0F, 0.0F, 0.0F };
    Class116 aClass116_10366;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10367;
    Class55[] aClass55Array10368 = null;
    Class241_Sub23_Sub1[] aClass241_Sub23_Sub1Array10369 = null;
    boolean aBool10370;
    public static Class180_Sub1[] aClass180_Sub1Array10371;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10372;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10373;
    
    void method6567(int i, Class105_Sub2 class105_sub2,
		    Interface41 interface41, Interface5 interface5,
		    Interface41 interface41_0_, boolean bool) {
	float f = aClass103_Sub3_5565.method15622();
	float f_1_ = (float) class105_sub2.method2655();
	float f_2_ = (float) class105_sub2.method2654();
	Interface41 interface41_3_ = interface41;
	float f_4_ = f * 2.0F / f_1_;
	float f_5_ = -f * 2.0F / f_2_;
	float[] fs = { -1.0F + f_4_, 1.0F + f_5_, 0.0F, 0.0F, -1.0F + f_4_,
		       -3.0F + f_5_, 0.0F, 2.0F, 3.0F + f_4_, 1.0F + f_5_,
		       2.0F, 0.0F };
	int i_6_ = (int) f_1_;
	int i_7_ = (int) f_2_;
	int i_8_
	    = (bool ? aClass103_Sub3_5565.method2571(-1224248259).method2655()
	       : i_6_);
	int i_9_
	    = (bool ? aClass103_Sub3_5565.method2571(-96235327).method2654()
	       : i_7_);
	Class55 class55
	    = ((Class368_Sub2) this).aClass55Array10368[anInt10364 - 1];
	((Class368_Sub2) this).aClass116_10366.method2895(class55);
	((Class368_Sub2) this).aClass116_10366.method2805();
	((Class368_Sub2) this).aClass116_10366.method2821
	    (((Class368_Sub2) this).aClass241_Sub23_Sub1_10362, aFloat10363,
	     aFloatArray10365[0], aFloatArray10365[1], aFloatArray10365[2],
	     (short) -30458);
	Object object = null;
	Object object_10_ = null;
	for (int i_11_ = 0; i_11_ < anInt10364; i_11_++) {
	    if (aClass180_Sub1Array10371[i_11_] != null) {
		Class241_Sub23_Sub1 class241_sub23_sub1
		    = (((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369
		       [i_11_]);
		Interface31 interface31
		    = aClass180_Sub1Array10371[i_11_].method15122();
		((Class368_Sub2) this).aClass116_10366.method2828
		    (class241_sub23_sub1, i_11_ + 1, interface31, -767388866);
	    }
	}
	float f_12_ = (float) i_6_ / f_1_;
	float f_13_ = (float) i_7_ / f_2_;
	float f_14_ = (float) i_8_ / f_1_;
	float f_15_ = (float) i_9_ / f_2_;
	fs[8] = (fs[8] + 1.0F) * f_12_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_13_ + 1.0F;
	fs[10] *= f_14_;
	fs[7] *= f_15_;
	((Class368_Sub2) this).aClass116_10366.method2910
	    (((Class368_Sub2) this).aClass241_Sub23_Sub1_10372, fs,
	     (byte) -68);
	((Class368_Sub2) this).aClass116_10366.method2828
	    (((Class368_Sub2) this).aClass241_Sub23_Sub1_10367, 0,
	     interface41_3_, 1484111490);
	((Class368_Sub2) this).aClass116_10366.method2821
	    (((Class368_Sub2) this).aClass241_Sub23_Sub1_10373, 0.0F, 0.0F,
	     0.0F, 0.0F, (short) -20025);
	aClass103_Sub3_5565.method2254(0, 0, i_6_, i_7_);
	aClass103_Sub3_5565.method2445(0, 0, i_6_, i_7_);
    }
    
    boolean method16666() {
	return (aClass103_Sub3_5565.aBool9549
		&& aClass103_Sub3_5565.method15606());
    }
    
    boolean method6565() {
	return ((Class368_Sub2) this).aBool10370;
    }
    
    boolean method6575() {
	if (method16666()) {
	    ((Class368_Sub2) this).aClass116_10366
		= aClass103_Sub3_5565.method15784("FilterColourRemapping");
	    if (((Class368_Sub2) this).aClass116_10366 == null)
		return false;
	    try {
		((Class368_Sub2) this).aClass241_Sub23_Sub1_10367
		    = ((Class368_Sub2) this).aClass116_10366
			  .method2815("sceneTex", (byte) -99);
		((Class368_Sub2) this).aClass55Array10368 = new Class55[3];
		((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369
		    = new Class241_Sub23_Sub1[3];
		if (aClass103_Sub3_5565.aBool9636) {
		    ((Class368_Sub2) this).aClass55Array10368[0]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2810("techRemap3D_1", (byte) 1);
		    ((Class368_Sub2) this).aClass55Array10368[1]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2810("techRemap3D_2", (byte) 1);
		    ((Class368_Sub2) this).aClass55Array10368[2]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2810("techRemap3D_3", (byte) 1);
		    ((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369[0]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2815("remapTex3D_1", (byte) -19);
		    ((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369[1]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2815("remapTex3D_2", (byte) -56);
		    ((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369[2]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2815("remapTex3D_3", (byte) -110);
		} else {
		    ((Class368_Sub2) this).aClass55Array10368[0]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2810("techRemap2D_1", (byte) 1);
		    ((Class368_Sub2) this).aClass55Array10368[1]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2810("techRemap2D_2", (byte) 1);
		    ((Class368_Sub2) this).aClass55Array10368[2]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2810("techRemap2D_3", (byte) 1);
		    ((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369[0]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2815("remapTex2D_1", (byte) -46);
		    ((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369[1]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2815("remapTex2D_2", (byte) -60);
		    ((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369[2]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2815("remapTex2D_3", (byte) 1);
		}
		((Class368_Sub2) this).aClass241_Sub23_Sub1_10362
		    = ((Class368_Sub2) this).aClass116_10366
			  .method2815("paramsWeightings", (byte) 0);
		((Class368_Sub2) this).aClass241_Sub23_Sub1_10373
		    = ((Class368_Sub2) this).aClass116_10366
			  .method2815("pixelOffset", (byte) -31);
		((Class368_Sub2) this).aClass241_Sub23_Sub1_10372
		    = ((Class368_Sub2) this).aClass116_10366
			  .method2815("PosAndTexCoords", (byte) -67);
	    } catch (Exception_Sub7_Sub2 exception_sub7_sub2) {
		return false;
	    } catch (Exception_Sub7_Sub1 exception_sub7_sub1) {
		return false;
	    }
	    if (!((Class368_Sub2) this).aClass55Array10368[0].method1311()
		|| !((Class368_Sub2) this).aClass55Array10368[1].method1311()
		|| !((Class368_Sub2) this).aClass55Array10368[2].method1311())
		return false;
	    ((Class368_Sub2) this).aBool10370 = true;
	    return true;
	}
	return false;
    }
    
    void method6590(int i, int i_16_) {
	/* empty */
    }
    
    public Class368_Sub2(Class103_Sub3 class103_sub3) {
	super(class103_sub3);
    }
    
    int method6587() {
	return 1;
    }
    
    void method6578(int i, Class105_Sub2 class105_sub2,
		    Interface41 interface41, Interface5 interface5,
		    Interface41 interface41_17_, boolean bool) {
	float f = aClass103_Sub3_5565.method15622();
	float f_18_ = (float) class105_sub2.method2655();
	float f_19_ = (float) class105_sub2.method2654();
	Interface41 interface41_20_ = interface41;
	float f_21_ = f * 2.0F / f_18_;
	float f_22_ = -f * 2.0F / f_19_;
	float[] fs = { -1.0F + f_21_, 1.0F + f_22_, 0.0F, 0.0F, -1.0F + f_21_,
		       -3.0F + f_22_, 0.0F, 2.0F, 3.0F + f_21_, 1.0F + f_22_,
		       2.0F, 0.0F };
	int i_23_ = (int) f_18_;
	int i_24_ = (int) f_19_;
	int i_25_
	    = (bool ? aClass103_Sub3_5565.method2571(-1377942674).method2655()
	       : i_23_);
	int i_26_
	    = (bool ? aClass103_Sub3_5565.method2571(-825108200).method2654()
	       : i_24_);
	Class55 class55
	    = ((Class368_Sub2) this).aClass55Array10368[anInt10364 - 1];
	((Class368_Sub2) this).aClass116_10366.method2895(class55);
	((Class368_Sub2) this).aClass116_10366.method2805();
	((Class368_Sub2) this).aClass116_10366.method2821
	    (((Class368_Sub2) this).aClass241_Sub23_Sub1_10362, aFloat10363,
	     aFloatArray10365[0], aFloatArray10365[1], aFloatArray10365[2],
	     (short) -25626);
	Object object = null;
	Object object_27_ = null;
	for (int i_28_ = 0; i_28_ < anInt10364; i_28_++) {
	    if (aClass180_Sub1Array10371[i_28_] != null) {
		Class241_Sub23_Sub1 class241_sub23_sub1
		    = (((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369
		       [i_28_]);
		Interface31 interface31
		    = aClass180_Sub1Array10371[i_28_].method15122();
		((Class368_Sub2) this).aClass116_10366.method2828
		    (class241_sub23_sub1, i_28_ + 1, interface31, -472238813);
	    }
	}
	float f_29_ = (float) i_23_ / f_18_;
	float f_30_ = (float) i_24_ / f_19_;
	float f_31_ = (float) i_25_ / f_18_;
	float f_32_ = (float) i_26_ / f_19_;
	fs[8] = (fs[8] + 1.0F) * f_29_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_30_ + 1.0F;
	fs[10] *= f_31_;
	fs[7] *= f_32_;
	((Class368_Sub2) this).aClass116_10366.method2910
	    (((Class368_Sub2) this).aClass241_Sub23_Sub1_10372, fs,
	     (byte) -102);
	((Class368_Sub2) this).aClass116_10366.method2828
	    (((Class368_Sub2) this).aClass241_Sub23_Sub1_10367, 0,
	     interface41_20_, -806956827);
	((Class368_Sub2) this).aClass116_10366.method2821
	    (((Class368_Sub2) this).aClass241_Sub23_Sub1_10373, 0.0F, 0.0F,
	     0.0F, 0.0F, (short) -17521);
	aClass103_Sub3_5565.method2254(0, 0, i_23_, i_24_);
	aClass103_Sub3_5565.method2445(0, 0, i_23_, i_24_);
    }
    
    int method6562() {
	return 1;
    }
    
    boolean method6580() {
	return (anInt10364 == 0 || aFloat10363 == 1.0F
		|| (aFloatArray10365[0] + aFloatArray10365[1]
		    + aFloatArray10365[2]) == 0.0F
		|| (aClass180_Sub1Array10371[0] == null
		    && aClass180_Sub1Array10371[1] == null
		    && aClass180_Sub1Array10371[2] == null));
    }
    
    int method6569() {
	return 2;
    }
    
    boolean method6573() {
	return (anInt10364 == 0 || aFloat10363 == 1.0F
		|| (aFloatArray10365[0] + aFloatArray10365[1]
		    + aFloatArray10365[2]) == 0.0F
		|| (aClass180_Sub1Array10371[0] == null
		    && aClass180_Sub1Array10371[1] == null
		    && aClass180_Sub1Array10371[2] == null));
    }
    
    static {
	aFloat10363 = 1.0F;
	anInt10364 = 1;
	aClass180_Sub1Array10371 = new Class180_Sub1[] { null, null, null };
    }
    
    boolean method6574() {
	return ((Class368_Sub2) this).aBool10370;
    }
    
    int method6570() {
	return 0;
    }
    
    void method6561(int i) {
	((Class368_Sub2) this).aClass116_10366.method2911();
    }
    
    void method6568() {
	/* empty */
    }
    
    void method6579() {
	/* empty */
    }
    
    void method6591(int i, int i_33_) {
	/* empty */
    }
    
    boolean method6571() {
	if (method16666()) {
	    ((Class368_Sub2) this).aClass116_10366
		= aClass103_Sub3_5565.method15784("FilterColourRemapping");
	    if (((Class368_Sub2) this).aClass116_10366 == null)
		return false;
	    try {
		((Class368_Sub2) this).aClass241_Sub23_Sub1_10367
		    = ((Class368_Sub2) this).aClass116_10366
			  .method2815("sceneTex", (byte) -73);
		((Class368_Sub2) this).aClass55Array10368 = new Class55[3];
		((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369
		    = new Class241_Sub23_Sub1[3];
		if (aClass103_Sub3_5565.aBool9636) {
		    ((Class368_Sub2) this).aClass55Array10368[0]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2810("techRemap3D_1", (byte) 1);
		    ((Class368_Sub2) this).aClass55Array10368[1]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2810("techRemap3D_2", (byte) 1);
		    ((Class368_Sub2) this).aClass55Array10368[2]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2810("techRemap3D_3", (byte) 1);
		    ((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369[0]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2815("remapTex3D_1", (byte) -72);
		    ((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369[1]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2815("remapTex3D_2", (byte) -91);
		    ((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369[2]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2815("remapTex3D_3", (byte) -12);
		} else {
		    ((Class368_Sub2) this).aClass55Array10368[0]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2810("techRemap2D_1", (byte) 1);
		    ((Class368_Sub2) this).aClass55Array10368[1]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2810("techRemap2D_2", (byte) 1);
		    ((Class368_Sub2) this).aClass55Array10368[2]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2810("techRemap2D_3", (byte) 1);
		    ((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369[0]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2815("remapTex2D_1", (byte) -67);
		    ((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369[1]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2815("remapTex2D_2", (byte) -16);
		    ((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369[2]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2815("remapTex2D_3", (byte) -126);
		}
		((Class368_Sub2) this).aClass241_Sub23_Sub1_10362
		    = ((Class368_Sub2) this).aClass116_10366
			  .method2815("paramsWeightings", (byte) -44);
		((Class368_Sub2) this).aClass241_Sub23_Sub1_10373
		    = ((Class368_Sub2) this).aClass116_10366
			  .method2815("pixelOffset", (byte) -13);
		((Class368_Sub2) this).aClass241_Sub23_Sub1_10372
		    = ((Class368_Sub2) this).aClass116_10366
			  .method2815("PosAndTexCoords", (byte) -83);
	    } catch (Exception_Sub7_Sub2 exception_sub7_sub2) {
		return false;
	    } catch (Exception_Sub7_Sub1 exception_sub7_sub1) {
		return false;
	    }
	    if (!((Class368_Sub2) this).aClass55Array10368[0].method1311()
		|| !((Class368_Sub2) this).aClass55Array10368[1].method1311()
		|| !((Class368_Sub2) this).aClass55Array10368[2].method1311())
		return false;
	    ((Class368_Sub2) this).aBool10370 = true;
	    return true;
	}
	return false;
    }
    
    boolean method6576() {
	if (method16666()) {
	    ((Class368_Sub2) this).aClass116_10366
		= aClass103_Sub3_5565.method15784("FilterColourRemapping");
	    if (((Class368_Sub2) this).aClass116_10366 == null)
		return false;
	    try {
		((Class368_Sub2) this).aClass241_Sub23_Sub1_10367
		    = ((Class368_Sub2) this).aClass116_10366
			  .method2815("sceneTex", (byte) -108);
		((Class368_Sub2) this).aClass55Array10368 = new Class55[3];
		((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369
		    = new Class241_Sub23_Sub1[3];
		if (aClass103_Sub3_5565.aBool9636) {
		    ((Class368_Sub2) this).aClass55Array10368[0]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2810("techRemap3D_1", (byte) 1);
		    ((Class368_Sub2) this).aClass55Array10368[1]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2810("techRemap3D_2", (byte) 1);
		    ((Class368_Sub2) this).aClass55Array10368[2]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2810("techRemap3D_3", (byte) 1);
		    ((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369[0]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2815("remapTex3D_1", (byte) -57);
		    ((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369[1]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2815("remapTex3D_2", (byte) -110);
		    ((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369[2]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2815("remapTex3D_3", (byte) -46);
		} else {
		    ((Class368_Sub2) this).aClass55Array10368[0]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2810("techRemap2D_1", (byte) 1);
		    ((Class368_Sub2) this).aClass55Array10368[1]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2810("techRemap2D_2", (byte) 1);
		    ((Class368_Sub2) this).aClass55Array10368[2]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2810("techRemap2D_3", (byte) 1);
		    ((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369[0]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2815("remapTex2D_1", (byte) -49);
		    ((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369[1]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2815("remapTex2D_2", (byte) -17);
		    ((Class368_Sub2) this).aClass241_Sub23_Sub1Array10369[2]
			= ((Class368_Sub2) this).aClass116_10366
			      .method2815("remapTex2D_3", (byte) -12);
		}
		((Class368_Sub2) this).aClass241_Sub23_Sub1_10362
		    = ((Class368_Sub2) this).aClass116_10366
			  .method2815("paramsWeightings", (byte) -87);
		((Class368_Sub2) this).aClass241_Sub23_Sub1_10373
		    = ((Class368_Sub2) this).aClass116_10366
			  .method2815("pixelOffset", (byte) -4);
		((Class368_Sub2) this).aClass241_Sub23_Sub1_10372
		    = ((Class368_Sub2) this).aClass116_10366
			  .method2815("PosAndTexCoords", (byte) -48);
	    } catch (Exception_Sub7_Sub2 exception_sub7_sub2) {
		return false;
	    } catch (Exception_Sub7_Sub1 exception_sub7_sub1) {
		return false;
	    }
	    if (!((Class368_Sub2) this).aClass55Array10368[0].method1311()
		|| !((Class368_Sub2) this).aClass55Array10368[1].method1311()
		|| !((Class368_Sub2) this).aClass55Array10368[2].method1311())
		return false;
	    ((Class368_Sub2) this).aBool10370 = true;
	    return true;
	}
	return false;
    }
    
    int method6583() {
	return 2;
    }
    
    int method6566() {
	return 2;
    }
    
    int method6585() {
	return 2;
    }
    
    void method6581(int i) {
	((Class368_Sub2) this).aClass116_10366.method2911();
    }
    
    int method6584() {
	return 0;
    }
    
    void method6564() {
	/* empty */
    }
    
    int method6586() {
	return 0;
    }
    
    boolean method16667() {
	return (aClass103_Sub3_5565.aBool9549
		&& aClass103_Sub3_5565.method15606());
    }
}
