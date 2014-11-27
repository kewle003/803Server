/* Class361_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class361_Sub1 extends Class361
{
    static final int anInt10421 = 15;
    static final int anInt10422 = 0;
    static final int anInt10423 = 1;
    static final int anInt10424 = 2;
    static final int anInt10425 = 3;
    static final int anInt10426 = 4;
    static final int anInt10427 = 5;
    static final int anInt10428 = 19;
    Class55[] aClass55Array10429;
    static final int anInt10430 = 8;
    static final int anInt10431 = 9;
    static final int anInt10432 = 10;
    static final int anInt10433 = 7;
    static final int anInt10434 = 12;
    static final int anInt10435 = 2;
    static final int anInt10436 = 13;
    int[] anIntArray10437;
    static final int anInt10438 = 16;
    static final int anInt10439 = 17;
    static final int anInt10440 = 6;
    static final int anInt10441 = 7;
    static final int anInt10442 = 11;
    static final int anInt10443 = 14;
    static final int anInt10444 = 12;
    static final int anInt10445 = 17;
    static final int anInt10446 = 18;
    static final int anInt10447 = 1;
    Class268 aClass268_10448 = new Class268();
    Class116 aClass116_10449;
    int[][] anIntArrayArray10450;
    static final int anInt10451 = 0;
    
    public void method6500() {
	((Class361_Sub1) this).aClass116_10449
	    .method2895(((Class361_Sub1) this).aClass55Array10429[18]);
	((Class361_Sub1) this).anIntArray10437
	    = (((Class361_Sub1) this).anIntArrayArray10450
	       [((Class361_Sub1) this).aClass116_10449.method2816(978436601)]);
	((Class361_Sub1) this).aClass116_10449.method2805();
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[6],
	     aClass287_5508.aFloat4477, aClass287_5508.aFloat4474,
	     aClass287_5508.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[16], aFloat5512,
	     aFloat5513, 0.0F, 0.0F, (byte) 112);
	method16754(0, (byte) -10);
    }
    
    boolean method16746(int i) throws Exception_Sub7 {
	((Class361_Sub1) this).aClass116_10449
	    = aClass103_Sub3_5505.method15784("Model");
	Class241_Sub23_Sub1 class241_sub23_sub1
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("DiffuseSampler", (byte) -78);
	Class241_Sub23_Sub1 class241_sub23_sub1_0_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("EnvironmentSampler", (byte) -17);
	Class241_Sub23_Sub1 class241_sub23_sub1_1_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("PointLightsPosAndRadiusInv", (byte) -67);
	Class241_Sub23_Sub1 class241_sub23_sub1_2_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("PointLightsDiffuseColour", (byte) -1);
	Class241_Sub23_Sub1 class241_sub23_sub1_3_
	    = ((Class361_Sub1) this).aClass116_10449.method2815("WVPMatrix",
								(byte) -121);
	Class241_Sub23_Sub1 class241_sub23_sub1_4_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("TexCoordMatrix", (byte) -72);
	Class241_Sub23_Sub1 class241_sub23_sub1_5_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("HeightFogPlane", (byte) -45);
	Class241_Sub23_Sub1 class241_sub23_sub1_6_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("HeightFogColour", (byte) -60);
	Class241_Sub23_Sub1 class241_sub23_sub1_7_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("DistanceFogPlane", (byte) -25);
	Class241_Sub23_Sub1 class241_sub23_sub1_8_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("DistanceFogColour", (byte) -31);
	Class241_Sub23_Sub1 class241_sub23_sub1_9_
	    = ((Class361_Sub1) this).aClass116_10449.method2815("SunDir",
								(byte) -2);
	Class241_Sub23_Sub1 class241_sub23_sub1_10_
	    = ((Class361_Sub1) this).aClass116_10449.method2815("SunColour",
								(byte) -7);
	Class241_Sub23_Sub1 class241_sub23_sub1_11_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("AntiSunColour", (byte) -42);
	Class241_Sub23_Sub1 class241_sub23_sub1_12_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("AmbientColour", (byte) -12);
	Class241_Sub23_Sub1 class241_sub23_sub1_13_
	    = ((Class361_Sub1) this).aClass116_10449.method2815("EyePos",
								(byte) -50);
	Class241_Sub23_Sub1 class241_sub23_sub1_14_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("SpecularExponent", (byte) -67);
	Class241_Sub23_Sub1 class241_sub23_sub1_15_
	    = ((Class361_Sub1) this).aClass116_10449.method2815("WorldMatrix",
								(byte) -102);
	((Class361_Sub1) this).aClass55Array10429[0]
	    = ((Class361_Sub1) this).aClass116_10449.method2810("Unlit",
								(byte) 1);
	((Class361_Sub1) this).aClass55Array10429[1]
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2810("Unlit_IgnoreAlpha", (byte) 1);
	((Class361_Sub1) this).aClass55Array10429[17]
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2810("UnderwaterGround", (byte) 1);
	((Class361_Sub1) this).aClass55Array10429[18]
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2810("UnderwaterGroundSpecular", (byte) 1);
	for (int i_16_ = 0; i_16_ <= 4; i_16_++) {
	    ((Class361_Sub1) this).aClass55Array10429[2 + i_16_]
		= (((Class361_Sub1) this).aClass116_10449.method2810
		   (new StringBuilder().append("Standard_").append(i_16_)
			.append
			("PointLights").toString(),
		    (byte) 1));
	    ((Class361_Sub1) this).aClass55Array10429[7 + i_16_]
		= (((Class361_Sub1) this).aClass116_10449.method2810
		   (new StringBuilder().append("Specular_").append(i_16_)
			.append
			("PointLights").toString(),
		    (byte) 1));
	    ((Class361_Sub1) this).aClass55Array10429[i_16_ + 12]
		= (((Class361_Sub1) this).aClass116_10449.method2810
		   (new StringBuilder().append("EnvironmentalMapping_").append
			(i_16_).append
			("PointLights").toString(),
		    (byte) 1));
	}
	for (int i_17_ = 0; i_17_ < 19; i_17_++) {
	    int i_18_ = (((Class361_Sub1) this).aClass116_10449.method2813
			 (((Class361_Sub1) this).aClass55Array10429[i_17_],
			  (byte) -101));
	    ((Class361_Sub1) this).anIntArrayArray10450[i_17_][2]
		= class241_sub23_sub1.method17408(i_18_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i_17_][3]
		= class241_sub23_sub1_0_.method17408(i_18_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i_17_][1]
		= class241_sub23_sub1_1_.method17408(i_18_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i_17_][0]
		= class241_sub23_sub1_2_.method17408(i_18_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i_17_][4]
		= class241_sub23_sub1_3_.method17408(i_18_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i_17_][5]
		= class241_sub23_sub1_4_.method17408(i_18_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i_17_][7]
		= class241_sub23_sub1_5_.method17408(i_18_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i_17_][8]
		= class241_sub23_sub1_6_.method17408(i_18_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i_17_][9]
		= class241_sub23_sub1_7_.method17408(i_18_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i_17_][10]
		= class241_sub23_sub1_8_.method17408(i_18_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i_17_][11]
		= class241_sub23_sub1_9_.method17408(i_18_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i_17_][12]
		= class241_sub23_sub1_10_.method17408(i_18_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i_17_][13]
		= class241_sub23_sub1_11_.method17408(i_18_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i_17_][14]
		= class241_sub23_sub1_12_.method17408(i_18_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i_17_][6]
		= class241_sub23_sub1_13_.method17408(i_18_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i_17_][15]
		= class241_sub23_sub1_15_.method17408(i_18_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i_17_][16]
		= class241_sub23_sub1_14_.method17408(i_18_);
	}
	((Class361_Sub1) this).aClass116_10449
	    .method2895(((Class361_Sub1) this).aClass55Array10429[2]);
	return true;
    }
    
    public void method6501(Class268 class268) {
	((Class361_Sub1) this).aClass268_10448.method5199(class268);
	((Class361_Sub1) this).aClass268_10448
	    .method5202(aClass103_Sub3_5505.aClass268_9526);
    }
    
    public void method6495(boolean bool) {
	if (bool)
	    ((Class361_Sub1) this).aClass116_10449
		.method2895(((Class361_Sub1) this).aClass55Array10429[1]);
	else
	    ((Class361_Sub1) this).aClass116_10449
		.method2895(((Class361_Sub1) this).aClass55Array10429[0]);
	((Class361_Sub1) this).anIntArray10437
	    = (((Class361_Sub1) this).anIntArrayArray10450
	       [((Class361_Sub1) this).aClass116_10449
		    .method2816(-1218290282)]);
	((Class361_Sub1) this).aClass116_10449.method2805();
	((Class361_Sub1) this).aClass116_10449.method2861
	    (((Class361_Sub1) this).anIntArray10437[2], 0, anInterface41_5525,
	     -1819191417);
	((Class361_Sub1) this).aClass116_10449.method2877
	    (((Class361_Sub1) this).anIntArray10437[4],
	     ((Class361_Sub1) this).aClass268_10448, -2091297512);
	((Class361_Sub1) this).aClass116_10449.method2834
	    (((Class361_Sub1) this).anIntArray10437[5], aClass268_5510,
	     (byte) -95);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[7],
	     aClass285_5514.aFloat4454, aClass285_5514.aFloat4452,
	     aClass285_5514.aFloat4453, aClass285_5514.aFloat4451, (byte) 69);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[8],
	     aClass287_5515.aFloat4477, aClass287_5515.aFloat4474,
	     aClass287_5515.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[9],
	     aClass285_5516.aFloat4454, aClass285_5516.aFloat4452,
	     aClass285_5516.aFloat4453, aClass285_5516.aFloat4451, (byte) 84);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[10],
	     aClass287_5507.aFloat4477, aClass287_5507.aFloat4474,
	     aClass287_5507.aFloat4479, (byte) 2);
	aClass103_Sub3_5505.method15726(Class310.aClass310_4822, anInt5522,
					anInt5523, anInt5506, anInt5517);
    }
    
    public void method6507(int i) {
	((Class361_Sub1) this).aClass116_10449
	    .method2895(((Class361_Sub1) this).aClass55Array10429[i + 7]);
	((Class361_Sub1) this).anIntArray10437
	    = (((Class361_Sub1) this).anIntArrayArray10450
	       [((Class361_Sub1) this).aClass116_10449
		    .method2816(-383365644)]);
	((Class361_Sub1) this).aClass116_10449.method2805();
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[6],
	     aClass287_5508.aFloat4477, aClass287_5508.aFloat4474,
	     aClass287_5508.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[16], aFloat5512,
	     aFloat5513, 0.0F, 0.0F, (byte) 61);
	method16754(i, (byte) 62);
    }
    
    public void method6508() {
	((Class361_Sub1) this).aClass116_10449
	    .method2895(((Class361_Sub1) this).aClass55Array10429[17]);
	((Class361_Sub1) this).anIntArray10437
	    = (((Class361_Sub1) this).anIntArrayArray10450
	       [((Class361_Sub1) this).aClass116_10449
		    .method2816(1396269004)]);
	((Class361_Sub1) this).aClass116_10449.method2805();
	method16754(0, (byte) -46);
    }
    
    void method16747(int i) {
	((Class361_Sub1) this).aClass116_10449.method2861
	    (((Class361_Sub1) this).anIntArray10437[2], 0, anInterface41_5525,
	     -1826934199);
	((Class361_Sub1) this).aClass116_10449.method2877
	    (((Class361_Sub1) this).anIntArray10437[4],
	     ((Class361_Sub1) this).aClass268_10448, 187309126);
	((Class361_Sub1) this).aClass116_10449.method2834
	    (((Class361_Sub1) this).anIntArray10437[5], aClass268_5510,
	     (byte) -70);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[7],
	     aClass285_5514.aFloat4454, aClass285_5514.aFloat4452,
	     aClass285_5514.aFloat4453, aClass285_5514.aFloat4451, (byte) 65);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[8],
	     aClass287_5515.aFloat4477, aClass287_5515.aFloat4474,
	     aClass287_5515.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[9],
	     aClass285_5516.aFloat4454, aClass285_5516.aFloat4452,
	     aClass285_5516.aFloat4453, aClass285_5516.aFloat4451, (byte) 107);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[10],
	     aClass287_5507.aFloat4477, aClass287_5507.aFloat4474,
	     aClass287_5507.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2831
	    (((Class361_Sub1) this).anIntArray10437[11], aClass287_5518,
	     (byte) 76);
	((Class361_Sub1) this).aClass116_10449.method2831
	    (((Class361_Sub1) this).anIntArray10437[12], aClass287_5519,
	     (byte) 5);
	((Class361_Sub1) this).aClass116_10449.method2831
	    (((Class361_Sub1) this).anIntArray10437[13], aClass287_5520,
	     (byte) -76);
	((Class361_Sub1) this).aClass116_10449.method2831
	    (((Class361_Sub1) this).anIntArray10437[14], aClass287_5521,
	     (byte) 10);
	if (i > 0) {
	    ((Class361_Sub1) this).aClass116_10449.method2832
		(((Class361_Sub1) this).anIntArray10437[1], aFloatArray5504,
		 i * 4, -649955037);
	    ((Class361_Sub1) this).aClass116_10449.method2832
		(((Class361_Sub1) this).anIntArray10437[0], aFloatArray5524,
		 4 * i, -649955037);
	}
	aClass103_Sub3_5505.method15726(Class310.aClass310_4822, anInt5522,
					anInt5523, anInt5506, anInt5517);
    }
    
    public void method6496(int i) {
	((Class361_Sub1) this).aClass116_10449
	    .method2895(((Class361_Sub1) this).aClass55Array10429[2 + i]);
	((Class361_Sub1) this).anIntArray10437
	    = (((Class361_Sub1) this).anIntArrayArray10450
	       [((Class361_Sub1) this).aClass116_10449
		    .method2816(1115295108)]);
	((Class361_Sub1) this).aClass116_10449.method2805();
	method16754(i, (byte) -19);
    }
    
    public void method6494(Class268 class268) {
	((Class361_Sub1) this).aClass268_10448.method5199(class268);
	((Class361_Sub1) this).aClass268_10448
	    .method5202(aClass103_Sub3_5505.aClass268_9526);
    }
    
    public void method6506(int i) {
	((Class361_Sub1) this).aClass116_10449
	    .method2895(((Class361_Sub1) this).aClass55Array10429[i + 12]);
	((Class361_Sub1) this).anIntArray10437
	    = (((Class361_Sub1) this).anIntArrayArray10450
	       [((Class361_Sub1) this).aClass116_10449
		    .method2816(1512590804)]);
	((Class361_Sub1) this).aClass116_10449.method2805();
	((Class361_Sub1) this).aClass116_10449.method2833
	    (((Class361_Sub1) this).anIntArray10437[15], aClass268_5511,
	     (byte) 9);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[6],
	     aClass287_5508.aFloat4477, aClass287_5508.aFloat4474,
	     aClass287_5508.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2861
	    (((Class361_Sub1) this).anIntArray10437[3], 1, anInterface30_5509,
	     -1382492731);
	method16754(i, (byte) -68);
    }
    
    public void method6492() {
	((Class361_Sub1) this).aClass116_10449
	    .method2895(((Class361_Sub1) this).aClass55Array10429[18]);
	((Class361_Sub1) this).anIntArray10437
	    = (((Class361_Sub1) this).anIntArrayArray10450
	       [((Class361_Sub1) this).aClass116_10449
		    .method2816(-1988257011)]);
	((Class361_Sub1) this).aClass116_10449.method2805();
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[6],
	     aClass287_5508.aFloat4477, aClass287_5508.aFloat4474,
	     aClass287_5508.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[16], aFloat5512,
	     aFloat5513, 0.0F, 0.0F, (byte) 40);
	method16754(0, (byte) -84);
    }
    
    public void method6516(int i) {
	((Class361_Sub1) this).aClass116_10449
	    .method2895(((Class361_Sub1) this).aClass55Array10429[i + 12]);
	((Class361_Sub1) this).anIntArray10437
	    = (((Class361_Sub1) this).anIntArrayArray10450
	       [((Class361_Sub1) this).aClass116_10449
		    .method2816(1476400113)]);
	((Class361_Sub1) this).aClass116_10449.method2805();
	((Class361_Sub1) this).aClass116_10449.method2833
	    (((Class361_Sub1) this).anIntArray10437[15], aClass268_5511,
	     (byte) 9);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[6],
	     aClass287_5508.aFloat4477, aClass287_5508.aFloat4474,
	     aClass287_5508.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2861
	    (((Class361_Sub1) this).anIntArray10437[3], 1, anInterface30_5509,
	     -1832434258);
	method16754(i, (byte) -56);
    }
    
    public void method6498(Class268 class268) {
	((Class361_Sub1) this).aClass268_10448.method5199(class268);
	((Class361_Sub1) this).aClass268_10448
	    .method5202(aClass103_Sub3_5505.aClass268_9526);
    }
    
    public void method6510(boolean bool) {
	if (bool)
	    ((Class361_Sub1) this).aClass116_10449
		.method2895(((Class361_Sub1) this).aClass55Array10429[1]);
	else
	    ((Class361_Sub1) this).aClass116_10449
		.method2895(((Class361_Sub1) this).aClass55Array10429[0]);
	((Class361_Sub1) this).anIntArray10437
	    = (((Class361_Sub1) this).anIntArrayArray10450
	       [((Class361_Sub1) this).aClass116_10449
		    .method2816(-1458487568)]);
	((Class361_Sub1) this).aClass116_10449.method2805();
	((Class361_Sub1) this).aClass116_10449.method2861
	    (((Class361_Sub1) this).anIntArray10437[2], 0, anInterface41_5525,
	     -2002574356);
	((Class361_Sub1) this).aClass116_10449.method2877
	    (((Class361_Sub1) this).anIntArray10437[4],
	     ((Class361_Sub1) this).aClass268_10448, -491852522);
	((Class361_Sub1) this).aClass116_10449.method2834
	    (((Class361_Sub1) this).anIntArray10437[5], aClass268_5510,
	     (byte) -71);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[7],
	     aClass285_5514.aFloat4454, aClass285_5514.aFloat4452,
	     aClass285_5514.aFloat4453, aClass285_5514.aFloat4451, (byte) 63);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[8],
	     aClass287_5515.aFloat4477, aClass287_5515.aFloat4474,
	     aClass287_5515.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[9],
	     aClass285_5516.aFloat4454, aClass285_5516.aFloat4452,
	     aClass285_5516.aFloat4453, aClass285_5516.aFloat4451, (byte) 59);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[10],
	     aClass287_5507.aFloat4477, aClass287_5507.aFloat4474,
	     aClass287_5507.aFloat4479, (byte) 2);
	aClass103_Sub3_5505.method15726(Class310.aClass310_4822, anInt5522,
					anInt5523, anInt5506, anInt5517);
    }
    
    public void method6504(boolean bool) {
	if (bool)
	    ((Class361_Sub1) this).aClass116_10449
		.method2895(((Class361_Sub1) this).aClass55Array10429[1]);
	else
	    ((Class361_Sub1) this).aClass116_10449
		.method2895(((Class361_Sub1) this).aClass55Array10429[0]);
	((Class361_Sub1) this).anIntArray10437
	    = (((Class361_Sub1) this).anIntArrayArray10450
	       [((Class361_Sub1) this).aClass116_10449.method2816(96622240)]);
	((Class361_Sub1) this).aClass116_10449.method2805();
	((Class361_Sub1) this).aClass116_10449.method2861
	    (((Class361_Sub1) this).anIntArray10437[2], 0, anInterface41_5525,
	     -1932014583);
	((Class361_Sub1) this).aClass116_10449.method2877
	    (((Class361_Sub1) this).anIntArray10437[4],
	     ((Class361_Sub1) this).aClass268_10448, -209841376);
	((Class361_Sub1) this).aClass116_10449.method2834
	    (((Class361_Sub1) this).anIntArray10437[5], aClass268_5510,
	     (byte) -61);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[7],
	     aClass285_5514.aFloat4454, aClass285_5514.aFloat4452,
	     aClass285_5514.aFloat4453, aClass285_5514.aFloat4451, (byte) 124);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[8],
	     aClass287_5515.aFloat4477, aClass287_5515.aFloat4474,
	     aClass287_5515.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[9],
	     aClass285_5516.aFloat4454, aClass285_5516.aFloat4452,
	     aClass285_5516.aFloat4453, aClass285_5516.aFloat4451, (byte) 92);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[10],
	     aClass287_5507.aFloat4477, aClass287_5507.aFloat4474,
	     aClass287_5507.aFloat4479, (byte) 2);
	aClass103_Sub3_5505.method15726(Class310.aClass310_4822, anInt5522,
					anInt5523, anInt5506, anInt5517);
    }
    
    public Class361_Sub1(Class103_Sub3 class103_sub3) throws Exception_Sub7 {
	super(class103_sub3);
	((Class361_Sub1) this).aClass55Array10429 = new Class55[19];
	((Class361_Sub1) this).anIntArrayArray10450 = new int[19][17];
	method16746(-74027698);
    }
    
    public void method6503(int i) {
	((Class361_Sub1) this).aClass116_10449
	    .method2895(((Class361_Sub1) this).aClass55Array10429[2 + i]);
	((Class361_Sub1) this).anIntArray10437
	    = (((Class361_Sub1) this).anIntArrayArray10450
	       [((Class361_Sub1) this).aClass116_10449
		    .method2816(1745792151)]);
	((Class361_Sub1) this).aClass116_10449.method2805();
	method16754(i, (byte) 2);
    }
    
    public void method6502() {
	((Class361_Sub1) this).aClass116_10449
	    .method2895(((Class361_Sub1) this).aClass55Array10429[17]);
	((Class361_Sub1) this).anIntArray10437
	    = (((Class361_Sub1) this).anIntArrayArray10450
	       [((Class361_Sub1) this).aClass116_10449
		    .method2816(-870660747)]);
	((Class361_Sub1) this).aClass116_10449.method2805();
	method16754(0, (byte) -78);
    }
    
    public void method6497() {
	((Class361_Sub1) this).aClass116_10449
	    .method2895(((Class361_Sub1) this).aClass55Array10429[17]);
	((Class361_Sub1) this).anIntArray10437
	    = (((Class361_Sub1) this).anIntArrayArray10450
	       [((Class361_Sub1) this).aClass116_10449
		    .method2816(-1637243200)]);
	((Class361_Sub1) this).aClass116_10449.method2805();
	method16754(0, (byte) -47);
    }
    
    public void method6509() {
	((Class361_Sub1) this).aClass116_10449
	    .method2895(((Class361_Sub1) this).aClass55Array10429[18]);
	((Class361_Sub1) this).anIntArray10437
	    = (((Class361_Sub1) this).anIntArrayArray10450
	       [((Class361_Sub1) this).aClass116_10449
		    .method2816(1290180082)]);
	((Class361_Sub1) this).aClass116_10449.method2805();
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[6],
	     aClass287_5508.aFloat4477, aClass287_5508.aFloat4474,
	     aClass287_5508.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[16], aFloat5512,
	     aFloat5513, 0.0F, 0.0F, (byte) 65);
	method16754(0, (byte) 30);
    }
    
    boolean method16748() throws Exception_Sub7 {
	((Class361_Sub1) this).aClass116_10449
	    = aClass103_Sub3_5505.method15784("Model");
	Class241_Sub23_Sub1 class241_sub23_sub1
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("DiffuseSampler", (byte) -47);
	Class241_Sub23_Sub1 class241_sub23_sub1_19_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("EnvironmentSampler", (byte) -19);
	Class241_Sub23_Sub1 class241_sub23_sub1_20_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("PointLightsPosAndRadiusInv", (byte) -12);
	Class241_Sub23_Sub1 class241_sub23_sub1_21_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("PointLightsDiffuseColour", (byte) -27);
	Class241_Sub23_Sub1 class241_sub23_sub1_22_
	    = ((Class361_Sub1) this).aClass116_10449.method2815("WVPMatrix",
								(byte) -20);
	Class241_Sub23_Sub1 class241_sub23_sub1_23_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("TexCoordMatrix", (byte) -3);
	Class241_Sub23_Sub1 class241_sub23_sub1_24_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("HeightFogPlane", (byte) -52);
	Class241_Sub23_Sub1 class241_sub23_sub1_25_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("HeightFogColour", (byte) -52);
	Class241_Sub23_Sub1 class241_sub23_sub1_26_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("DistanceFogPlane", (byte) -115);
	Class241_Sub23_Sub1 class241_sub23_sub1_27_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("DistanceFogColour", (byte) -8);
	Class241_Sub23_Sub1 class241_sub23_sub1_28_
	    = ((Class361_Sub1) this).aClass116_10449.method2815("SunDir",
								(byte) -27);
	Class241_Sub23_Sub1 class241_sub23_sub1_29_
	    = ((Class361_Sub1) this).aClass116_10449.method2815("SunColour",
								(byte) -119);
	Class241_Sub23_Sub1 class241_sub23_sub1_30_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("AntiSunColour", (byte) -51);
	Class241_Sub23_Sub1 class241_sub23_sub1_31_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("AmbientColour", (byte) -64);
	Class241_Sub23_Sub1 class241_sub23_sub1_32_
	    = ((Class361_Sub1) this).aClass116_10449.method2815("EyePos",
								(byte) -59);
	Class241_Sub23_Sub1 class241_sub23_sub1_33_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("SpecularExponent", (byte) -36);
	Class241_Sub23_Sub1 class241_sub23_sub1_34_
	    = ((Class361_Sub1) this).aClass116_10449.method2815("WorldMatrix",
								(byte) -47);
	((Class361_Sub1) this).aClass55Array10429[0]
	    = ((Class361_Sub1) this).aClass116_10449.method2810("Unlit",
								(byte) 1);
	((Class361_Sub1) this).aClass55Array10429[1]
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2810("Unlit_IgnoreAlpha", (byte) 1);
	((Class361_Sub1) this).aClass55Array10429[17]
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2810("UnderwaterGround", (byte) 1);
	((Class361_Sub1) this).aClass55Array10429[18]
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2810("UnderwaterGroundSpecular", (byte) 1);
	for (int i = 0; i <= 4; i++) {
	    ((Class361_Sub1) this).aClass55Array10429[2 + i]
		= (((Class361_Sub1) this).aClass116_10449.method2810
		   (new StringBuilder().append("Standard_").append(i).append
			("PointLights").toString(),
		    (byte) 1));
	    ((Class361_Sub1) this).aClass55Array10429[7 + i]
		= (((Class361_Sub1) this).aClass116_10449.method2810
		   (new StringBuilder().append("Specular_").append(i).append
			("PointLights").toString(),
		    (byte) 1));
	    ((Class361_Sub1) this).aClass55Array10429[i + 12]
		= (((Class361_Sub1) this).aClass116_10449.method2810
		   (new StringBuilder().append("EnvironmentalMapping_").append
			(i).append
			("PointLights").toString(),
		    (byte) 1));
	}
	for (int i = 0; i < 19; i++) {
	    int i_35_
		= (((Class361_Sub1) this).aClass116_10449.method2813
		   (((Class361_Sub1) this).aClass55Array10429[i], (byte) -80));
	    ((Class361_Sub1) this).anIntArrayArray10450[i][2]
		= class241_sub23_sub1.method17408(i_35_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][3]
		= class241_sub23_sub1_19_.method17408(i_35_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][1]
		= class241_sub23_sub1_20_.method17408(i_35_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][0]
		= class241_sub23_sub1_21_.method17408(i_35_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][4]
		= class241_sub23_sub1_22_.method17408(i_35_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][5]
		= class241_sub23_sub1_23_.method17408(i_35_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][7]
		= class241_sub23_sub1_24_.method17408(i_35_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][8]
		= class241_sub23_sub1_25_.method17408(i_35_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][9]
		= class241_sub23_sub1_26_.method17408(i_35_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][10]
		= class241_sub23_sub1_27_.method17408(i_35_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][11]
		= class241_sub23_sub1_28_.method17408(i_35_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][12]
		= class241_sub23_sub1_29_.method17408(i_35_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][13]
		= class241_sub23_sub1_30_.method17408(i_35_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][14]
		= class241_sub23_sub1_31_.method17408(i_35_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][6]
		= class241_sub23_sub1_32_.method17408(i_35_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][15]
		= class241_sub23_sub1_34_.method17408(i_35_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][16]
		= class241_sub23_sub1_33_.method17408(i_35_);
	}
	((Class361_Sub1) this).aClass116_10449
	    .method2895(((Class361_Sub1) this).aClass55Array10429[2]);
	return true;
    }
    
    public void method6512(int i) {
	((Class361_Sub1) this).aClass116_10449
	    .method2895(((Class361_Sub1) this).aClass55Array10429[i + 7]);
	((Class361_Sub1) this).anIntArray10437
	    = (((Class361_Sub1) this).anIntArrayArray10450
	       [((Class361_Sub1) this).aClass116_10449
		    .method2816(-849756554)]);
	((Class361_Sub1) this).aClass116_10449.method2805();
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[6],
	     aClass287_5508.aFloat4477, aClass287_5508.aFloat4474,
	     aClass287_5508.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[16], aFloat5512,
	     aFloat5513, 0.0F, 0.0F, (byte) 103);
	method16754(i, (byte) -37);
    }
    
    public void method6513(int i) {
	((Class361_Sub1) this).aClass116_10449
	    .method2895(((Class361_Sub1) this).aClass55Array10429[i + 7]);
	((Class361_Sub1) this).anIntArray10437
	    = (((Class361_Sub1) this).anIntArrayArray10450
	       [((Class361_Sub1) this).aClass116_10449.method2816(315048934)]);
	((Class361_Sub1) this).aClass116_10449.method2805();
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[6],
	     aClass287_5508.aFloat4477, aClass287_5508.aFloat4474,
	     aClass287_5508.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[16], aFloat5512,
	     aFloat5513, 0.0F, 0.0F, (byte) 47);
	method16754(i, (byte) -10);
    }
    
    public void method6514(int i) {
	((Class361_Sub1) this).aClass116_10449
	    .method2895(((Class361_Sub1) this).aClass55Array10429[i + 12]);
	((Class361_Sub1) this).anIntArray10437
	    = (((Class361_Sub1) this).anIntArrayArray10450
	       [((Class361_Sub1) this).aClass116_10449.method2816(297456620)]);
	((Class361_Sub1) this).aClass116_10449.method2805();
	((Class361_Sub1) this).aClass116_10449.method2833
	    (((Class361_Sub1) this).anIntArray10437[15], aClass268_5511,
	     (byte) 9);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[6],
	     aClass287_5508.aFloat4477, aClass287_5508.aFloat4474,
	     aClass287_5508.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2861
	    (((Class361_Sub1) this).anIntArray10437[3], 1, anInterface30_5509,
	     -1508103179);
	method16754(i, (byte) 75);
    }
    
    public void method6515(int i) {
	((Class361_Sub1) this).aClass116_10449
	    .method2895(((Class361_Sub1) this).aClass55Array10429[i + 12]);
	((Class361_Sub1) this).anIntArray10437
	    = (((Class361_Sub1) this).anIntArrayArray10450
	       [((Class361_Sub1) this).aClass116_10449
		    .method2816(1355869887)]);
	((Class361_Sub1) this).aClass116_10449.method2805();
	((Class361_Sub1) this).aClass116_10449.method2833
	    (((Class361_Sub1) this).anIntArray10437[15], aClass268_5511,
	     (byte) 9);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[6],
	     aClass287_5508.aFloat4477, aClass287_5508.aFloat4474,
	     aClass287_5508.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2861
	    (((Class361_Sub1) this).anIntArray10437[3], 1, anInterface30_5509,
	     -1792139216);
	method16754(i, (byte) 90);
    }
    
    void method16749(int i) {
	((Class361_Sub1) this).aClass116_10449.method2861
	    (((Class361_Sub1) this).anIntArray10437[2], 0, anInterface41_5525,
	     -1503747606);
	((Class361_Sub1) this).aClass116_10449.method2877
	    (((Class361_Sub1) this).anIntArray10437[4],
	     ((Class361_Sub1) this).aClass268_10448, -2105162007);
	((Class361_Sub1) this).aClass116_10449.method2834
	    (((Class361_Sub1) this).anIntArray10437[5], aClass268_5510,
	     (byte) -35);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[7],
	     aClass285_5514.aFloat4454, aClass285_5514.aFloat4452,
	     aClass285_5514.aFloat4453, aClass285_5514.aFloat4451, (byte) 114);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[8],
	     aClass287_5515.aFloat4477, aClass287_5515.aFloat4474,
	     aClass287_5515.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[9],
	     aClass285_5516.aFloat4454, aClass285_5516.aFloat4452,
	     aClass285_5516.aFloat4453, aClass285_5516.aFloat4451, (byte) 45);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[10],
	     aClass287_5507.aFloat4477, aClass287_5507.aFloat4474,
	     aClass287_5507.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2831
	    (((Class361_Sub1) this).anIntArray10437[11], aClass287_5518,
	     (byte) 66);
	((Class361_Sub1) this).aClass116_10449.method2831
	    (((Class361_Sub1) this).anIntArray10437[12], aClass287_5519,
	     (byte) -23);
	((Class361_Sub1) this).aClass116_10449.method2831
	    (((Class361_Sub1) this).anIntArray10437[13], aClass287_5520,
	     (byte) -50);
	((Class361_Sub1) this).aClass116_10449.method2831
	    (((Class361_Sub1) this).anIntArray10437[14], aClass287_5521,
	     (byte) -103);
	if (i > 0) {
	    ((Class361_Sub1) this).aClass116_10449.method2832
		(((Class361_Sub1) this).anIntArray10437[1], aFloatArray5504,
		 i * 4, -649955037);
	    ((Class361_Sub1) this).aClass116_10449.method2832
		(((Class361_Sub1) this).anIntArray10437[0], aFloatArray5524,
		 4 * i, -649955037);
	}
	aClass103_Sub3_5505.method15726(Class310.aClass310_4822, anInt5522,
					anInt5523, anInt5506, anInt5517);
    }
    
    boolean method16750() throws Exception_Sub7 {
	((Class361_Sub1) this).aClass116_10449
	    = aClass103_Sub3_5505.method15784("Model");
	Class241_Sub23_Sub1 class241_sub23_sub1
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("DiffuseSampler", (byte) -111);
	Class241_Sub23_Sub1 class241_sub23_sub1_36_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("EnvironmentSampler", (byte) -97);
	Class241_Sub23_Sub1 class241_sub23_sub1_37_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("PointLightsPosAndRadiusInv", (byte) -13);
	Class241_Sub23_Sub1 class241_sub23_sub1_38_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("PointLightsDiffuseColour", (byte) -19);
	Class241_Sub23_Sub1 class241_sub23_sub1_39_
	    = ((Class361_Sub1) this).aClass116_10449.method2815("WVPMatrix",
								(byte) 0);
	Class241_Sub23_Sub1 class241_sub23_sub1_40_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("TexCoordMatrix", (byte) -88);
	Class241_Sub23_Sub1 class241_sub23_sub1_41_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("HeightFogPlane", (byte) -127);
	Class241_Sub23_Sub1 class241_sub23_sub1_42_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("HeightFogColour", (byte) -12);
	Class241_Sub23_Sub1 class241_sub23_sub1_43_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("DistanceFogPlane", (byte) -53);
	Class241_Sub23_Sub1 class241_sub23_sub1_44_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("DistanceFogColour", (byte) -125);
	Class241_Sub23_Sub1 class241_sub23_sub1_45_
	    = ((Class361_Sub1) this).aClass116_10449.method2815("SunDir",
								(byte) 0);
	Class241_Sub23_Sub1 class241_sub23_sub1_46_
	    = ((Class361_Sub1) this).aClass116_10449.method2815("SunColour",
								(byte) -109);
	Class241_Sub23_Sub1 class241_sub23_sub1_47_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("AntiSunColour", (byte) -44);
	Class241_Sub23_Sub1 class241_sub23_sub1_48_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("AmbientColour", (byte) -38);
	Class241_Sub23_Sub1 class241_sub23_sub1_49_
	    = ((Class361_Sub1) this).aClass116_10449.method2815("EyePos",
								(byte) -27);
	Class241_Sub23_Sub1 class241_sub23_sub1_50_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("SpecularExponent", (byte) -16);
	Class241_Sub23_Sub1 class241_sub23_sub1_51_
	    = ((Class361_Sub1) this).aClass116_10449.method2815("WorldMatrix",
								(byte) -11);
	((Class361_Sub1) this).aClass55Array10429[0]
	    = ((Class361_Sub1) this).aClass116_10449.method2810("Unlit",
								(byte) 1);
	((Class361_Sub1) this).aClass55Array10429[1]
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2810("Unlit_IgnoreAlpha", (byte) 1);
	((Class361_Sub1) this).aClass55Array10429[17]
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2810("UnderwaterGround", (byte) 1);
	((Class361_Sub1) this).aClass55Array10429[18]
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2810("UnderwaterGroundSpecular", (byte) 1);
	for (int i = 0; i <= 4; i++) {
	    ((Class361_Sub1) this).aClass55Array10429[2 + i]
		= (((Class361_Sub1) this).aClass116_10449.method2810
		   (new StringBuilder().append("Standard_").append(i).append
			("PointLights").toString(),
		    (byte) 1));
	    ((Class361_Sub1) this).aClass55Array10429[7 + i]
		= (((Class361_Sub1) this).aClass116_10449.method2810
		   (new StringBuilder().append("Specular_").append(i).append
			("PointLights").toString(),
		    (byte) 1));
	    ((Class361_Sub1) this).aClass55Array10429[i + 12]
		= (((Class361_Sub1) this).aClass116_10449.method2810
		   (new StringBuilder().append("EnvironmentalMapping_").append
			(i).append
			("PointLights").toString(),
		    (byte) 1));
	}
	for (int i = 0; i < 19; i++) {
	    int i_52_ = (((Class361_Sub1) this).aClass116_10449.method2813
			 (((Class361_Sub1) this).aClass55Array10429[i],
			  (byte) -122));
	    ((Class361_Sub1) this).anIntArrayArray10450[i][2]
		= class241_sub23_sub1.method17408(i_52_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][3]
		= class241_sub23_sub1_36_.method17408(i_52_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][1]
		= class241_sub23_sub1_37_.method17408(i_52_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][0]
		= class241_sub23_sub1_38_.method17408(i_52_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][4]
		= class241_sub23_sub1_39_.method17408(i_52_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][5]
		= class241_sub23_sub1_40_.method17408(i_52_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][7]
		= class241_sub23_sub1_41_.method17408(i_52_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][8]
		= class241_sub23_sub1_42_.method17408(i_52_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][9]
		= class241_sub23_sub1_43_.method17408(i_52_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][10]
		= class241_sub23_sub1_44_.method17408(i_52_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][11]
		= class241_sub23_sub1_45_.method17408(i_52_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][12]
		= class241_sub23_sub1_46_.method17408(i_52_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][13]
		= class241_sub23_sub1_47_.method17408(i_52_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][14]
		= class241_sub23_sub1_48_.method17408(i_52_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][6]
		= class241_sub23_sub1_49_.method17408(i_52_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][15]
		= class241_sub23_sub1_51_.method17408(i_52_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][16]
		= class241_sub23_sub1_50_.method17408(i_52_);
	}
	((Class361_Sub1) this).aClass116_10449
	    .method2895(((Class361_Sub1) this).aClass55Array10429[2]);
	return true;
    }
    
    public void method6511(Class268 class268) {
	((Class361_Sub1) this).aClass268_10448.method5199(class268);
	((Class361_Sub1) this).aClass268_10448
	    .method5202(aClass103_Sub3_5505.aClass268_9526);
    }
    
    boolean method16751() throws Exception_Sub7 {
	((Class361_Sub1) this).aClass116_10449
	    = aClass103_Sub3_5505.method15784("Model");
	Class241_Sub23_Sub1 class241_sub23_sub1
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("DiffuseSampler", (byte) -96);
	Class241_Sub23_Sub1 class241_sub23_sub1_53_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("EnvironmentSampler", (byte) -19);
	Class241_Sub23_Sub1 class241_sub23_sub1_54_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("PointLightsPosAndRadiusInv", (byte) -18);
	Class241_Sub23_Sub1 class241_sub23_sub1_55_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("PointLightsDiffuseColour", (byte) -105);
	Class241_Sub23_Sub1 class241_sub23_sub1_56_
	    = ((Class361_Sub1) this).aClass116_10449.method2815("WVPMatrix",
								(byte) -79);
	Class241_Sub23_Sub1 class241_sub23_sub1_57_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("TexCoordMatrix", (byte) -7);
	Class241_Sub23_Sub1 class241_sub23_sub1_58_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("HeightFogPlane", (byte) -62);
	Class241_Sub23_Sub1 class241_sub23_sub1_59_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("HeightFogColour", (byte) -12);
	Class241_Sub23_Sub1 class241_sub23_sub1_60_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("DistanceFogPlane", (byte) -125);
	Class241_Sub23_Sub1 class241_sub23_sub1_61_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("DistanceFogColour", (byte) -73);
	Class241_Sub23_Sub1 class241_sub23_sub1_62_
	    = ((Class361_Sub1) this).aClass116_10449.method2815("SunDir",
								(byte) -105);
	Class241_Sub23_Sub1 class241_sub23_sub1_63_
	    = ((Class361_Sub1) this).aClass116_10449.method2815("SunColour",
								(byte) -67);
	Class241_Sub23_Sub1 class241_sub23_sub1_64_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("AntiSunColour", (byte) -7);
	Class241_Sub23_Sub1 class241_sub23_sub1_65_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("AmbientColour", (byte) -123);
	Class241_Sub23_Sub1 class241_sub23_sub1_66_
	    = ((Class361_Sub1) this).aClass116_10449.method2815("EyePos",
								(byte) -128);
	Class241_Sub23_Sub1 class241_sub23_sub1_67_
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2815("SpecularExponent", (byte) -39);
	Class241_Sub23_Sub1 class241_sub23_sub1_68_
	    = ((Class361_Sub1) this).aClass116_10449.method2815("WorldMatrix",
								(byte) -95);
	((Class361_Sub1) this).aClass55Array10429[0]
	    = ((Class361_Sub1) this).aClass116_10449.method2810("Unlit",
								(byte) 1);
	((Class361_Sub1) this).aClass55Array10429[1]
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2810("Unlit_IgnoreAlpha", (byte) 1);
	((Class361_Sub1) this).aClass55Array10429[17]
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2810("UnderwaterGround", (byte) 1);
	((Class361_Sub1) this).aClass55Array10429[18]
	    = ((Class361_Sub1) this).aClass116_10449
		  .method2810("UnderwaterGroundSpecular", (byte) 1);
	for (int i = 0; i <= 4; i++) {
	    ((Class361_Sub1) this).aClass55Array10429[2 + i]
		= (((Class361_Sub1) this).aClass116_10449.method2810
		   (new StringBuilder().append("Standard_").append(i).append
			("PointLights").toString(),
		    (byte) 1));
	    ((Class361_Sub1) this).aClass55Array10429[7 + i]
		= (((Class361_Sub1) this).aClass116_10449.method2810
		   (new StringBuilder().append("Specular_").append(i).append
			("PointLights").toString(),
		    (byte) 1));
	    ((Class361_Sub1) this).aClass55Array10429[i + 12]
		= (((Class361_Sub1) this).aClass116_10449.method2810
		   (new StringBuilder().append("EnvironmentalMapping_").append
			(i).append
			("PointLights").toString(),
		    (byte) 1));
	}
	for (int i = 0; i < 19; i++) {
	    int i_69_ = (((Class361_Sub1) this).aClass116_10449.method2813
			 (((Class361_Sub1) this).aClass55Array10429[i],
			  (byte) -115));
	    ((Class361_Sub1) this).anIntArrayArray10450[i][2]
		= class241_sub23_sub1.method17408(i_69_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][3]
		= class241_sub23_sub1_53_.method17408(i_69_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][1]
		= class241_sub23_sub1_54_.method17408(i_69_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][0]
		= class241_sub23_sub1_55_.method17408(i_69_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][4]
		= class241_sub23_sub1_56_.method17408(i_69_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][5]
		= class241_sub23_sub1_57_.method17408(i_69_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][7]
		= class241_sub23_sub1_58_.method17408(i_69_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][8]
		= class241_sub23_sub1_59_.method17408(i_69_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][9]
		= class241_sub23_sub1_60_.method17408(i_69_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][10]
		= class241_sub23_sub1_61_.method17408(i_69_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][11]
		= class241_sub23_sub1_62_.method17408(i_69_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][12]
		= class241_sub23_sub1_63_.method17408(i_69_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][13]
		= class241_sub23_sub1_64_.method17408(i_69_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][14]
		= class241_sub23_sub1_65_.method17408(i_69_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][6]
		= class241_sub23_sub1_66_.method17408(i_69_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][15]
		= class241_sub23_sub1_68_.method17408(i_69_);
	    ((Class361_Sub1) this).anIntArrayArray10450[i][16]
		= class241_sub23_sub1_67_.method17408(i_69_);
	}
	((Class361_Sub1) this).aClass116_10449
	    .method2895(((Class361_Sub1) this).aClass55Array10429[2]);
	return true;
    }
    
    void method16752(int i) {
	((Class361_Sub1) this).aClass116_10449.method2861
	    (((Class361_Sub1) this).anIntArray10437[2], 0, anInterface41_5525,
	     -2133582384);
	((Class361_Sub1) this).aClass116_10449.method2877
	    (((Class361_Sub1) this).anIntArray10437[4],
	     ((Class361_Sub1) this).aClass268_10448, -180800694);
	((Class361_Sub1) this).aClass116_10449.method2834
	    (((Class361_Sub1) this).anIntArray10437[5], aClass268_5510,
	     (byte) -16);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[7],
	     aClass285_5514.aFloat4454, aClass285_5514.aFloat4452,
	     aClass285_5514.aFloat4453, aClass285_5514.aFloat4451, (byte) 59);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[8],
	     aClass287_5515.aFloat4477, aClass287_5515.aFloat4474,
	     aClass287_5515.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[9],
	     aClass285_5516.aFloat4454, aClass285_5516.aFloat4452,
	     aClass285_5516.aFloat4453, aClass285_5516.aFloat4451, (byte) 50);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[10],
	     aClass287_5507.aFloat4477, aClass287_5507.aFloat4474,
	     aClass287_5507.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2831
	    (((Class361_Sub1) this).anIntArray10437[11], aClass287_5518,
	     (byte) 65);
	((Class361_Sub1) this).aClass116_10449.method2831
	    (((Class361_Sub1) this).anIntArray10437[12], aClass287_5519,
	     (byte) 104);
	((Class361_Sub1) this).aClass116_10449.method2831
	    (((Class361_Sub1) this).anIntArray10437[13], aClass287_5520,
	     (byte) -58);
	((Class361_Sub1) this).aClass116_10449.method2831
	    (((Class361_Sub1) this).anIntArray10437[14], aClass287_5521,
	     (byte) -67);
	if (i > 0) {
	    ((Class361_Sub1) this).aClass116_10449.method2832
		(((Class361_Sub1) this).anIntArray10437[1], aFloatArray5504,
		 i * 4, -649955037);
	    ((Class361_Sub1) this).aClass116_10449.method2832
		(((Class361_Sub1) this).anIntArray10437[0], aFloatArray5524,
		 4 * i, -649955037);
	}
	aClass103_Sub3_5505.method15726(Class310.aClass310_4822, anInt5522,
					anInt5523, anInt5506, anInt5517);
    }
    
    public void method6505(boolean bool) {
	if (bool)
	    ((Class361_Sub1) this).aClass116_10449
		.method2895(((Class361_Sub1) this).aClass55Array10429[1]);
	else
	    ((Class361_Sub1) this).aClass116_10449
		.method2895(((Class361_Sub1) this).aClass55Array10429[0]);
	((Class361_Sub1) this).anIntArray10437
	    = (((Class361_Sub1) this).anIntArrayArray10450
	       [((Class361_Sub1) this).aClass116_10449.method2816(508012466)]);
	((Class361_Sub1) this).aClass116_10449.method2805();
	((Class361_Sub1) this).aClass116_10449.method2861
	    (((Class361_Sub1) this).anIntArray10437[2], 0, anInterface41_5525,
	     -1743253229);
	((Class361_Sub1) this).aClass116_10449.method2877
	    (((Class361_Sub1) this).anIntArray10437[4],
	     ((Class361_Sub1) this).aClass268_10448, -2143735685);
	((Class361_Sub1) this).aClass116_10449.method2834
	    (((Class361_Sub1) this).anIntArray10437[5], aClass268_5510,
	     (byte) -111);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[7],
	     aClass285_5514.aFloat4454, aClass285_5514.aFloat4452,
	     aClass285_5514.aFloat4453, aClass285_5514.aFloat4451, (byte) 69);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[8],
	     aClass287_5515.aFloat4477, aClass287_5515.aFloat4474,
	     aClass287_5515.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[9],
	     aClass285_5516.aFloat4454, aClass285_5516.aFloat4452,
	     aClass285_5516.aFloat4453, aClass285_5516.aFloat4451, (byte) 108);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[10],
	     aClass287_5507.aFloat4477, aClass287_5507.aFloat4474,
	     aClass287_5507.aFloat4479, (byte) 2);
	aClass103_Sub3_5505.method15726(Class310.aClass310_4822, anInt5522,
					anInt5523, anInt5506, anInt5517);
    }
    
    void method16753(int i) {
	((Class361_Sub1) this).aClass116_10449.method2861
	    (((Class361_Sub1) this).anIntArray10437[2], 0, anInterface41_5525,
	     -1971805521);
	((Class361_Sub1) this).aClass116_10449.method2877
	    (((Class361_Sub1) this).anIntArray10437[4],
	     ((Class361_Sub1) this).aClass268_10448, 477101845);
	((Class361_Sub1) this).aClass116_10449.method2834
	    (((Class361_Sub1) this).anIntArray10437[5], aClass268_5510,
	     (byte) -122);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[7],
	     aClass285_5514.aFloat4454, aClass285_5514.aFloat4452,
	     aClass285_5514.aFloat4453, aClass285_5514.aFloat4451, (byte) 91);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[8],
	     aClass287_5515.aFloat4477, aClass287_5515.aFloat4474,
	     aClass287_5515.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[9],
	     aClass285_5516.aFloat4454, aClass285_5516.aFloat4452,
	     aClass285_5516.aFloat4453, aClass285_5516.aFloat4451, (byte) 70);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[10],
	     aClass287_5507.aFloat4477, aClass287_5507.aFloat4474,
	     aClass287_5507.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2831
	    (((Class361_Sub1) this).anIntArray10437[11], aClass287_5518,
	     (byte) -10);
	((Class361_Sub1) this).aClass116_10449.method2831
	    (((Class361_Sub1) this).anIntArray10437[12], aClass287_5519,
	     (byte) 1);
	((Class361_Sub1) this).aClass116_10449.method2831
	    (((Class361_Sub1) this).anIntArray10437[13], aClass287_5520,
	     (byte) 102);
	((Class361_Sub1) this).aClass116_10449.method2831
	    (((Class361_Sub1) this).anIntArray10437[14], aClass287_5521,
	     (byte) 107);
	if (i > 0) {
	    ((Class361_Sub1) this).aClass116_10449.method2832
		(((Class361_Sub1) this).anIntArray10437[1], aFloatArray5504,
		 i * 4, -649955037);
	    ((Class361_Sub1) this).aClass116_10449.method2832
		(((Class361_Sub1) this).anIntArray10437[0], aFloatArray5524,
		 4 * i, -649955037);
	}
	aClass103_Sub3_5505.method15726(Class310.aClass310_4822, anInt5522,
					anInt5523, anInt5506, anInt5517);
    }
    
    void method16754(int i, byte i_70_) {
	((Class361_Sub1) this).aClass116_10449.method2861
	    (((Class361_Sub1) this).anIntArray10437[2], 0, anInterface41_5525,
	     -1717057967);
	((Class361_Sub1) this).aClass116_10449.method2877
	    (((Class361_Sub1) this).anIntArray10437[4],
	     ((Class361_Sub1) this).aClass268_10448, -2123802265);
	((Class361_Sub1) this).aClass116_10449.method2834
	    (((Class361_Sub1) this).anIntArray10437[5], aClass268_5510,
	     (byte) -81);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[7],
	     aClass285_5514.aFloat4454, aClass285_5514.aFloat4452,
	     aClass285_5514.aFloat4453, aClass285_5514.aFloat4451, (byte) 95);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[8],
	     aClass287_5515.aFloat4477, aClass287_5515.aFloat4474,
	     aClass287_5515.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2830
	    (((Class361_Sub1) this).anIntArray10437[9],
	     aClass285_5516.aFloat4454, aClass285_5516.aFloat4452,
	     aClass285_5516.aFloat4453, aClass285_5516.aFloat4451, (byte) 87);
	((Class361_Sub1) this).aClass116_10449.method2890
	    (((Class361_Sub1) this).anIntArray10437[10],
	     aClass287_5507.aFloat4477, aClass287_5507.aFloat4474,
	     aClass287_5507.aFloat4479, (byte) 2);
	((Class361_Sub1) this).aClass116_10449.method2831
	    (((Class361_Sub1) this).anIntArray10437[11], aClass287_5518,
	     (byte) 64);
	((Class361_Sub1) this).aClass116_10449.method2831
	    (((Class361_Sub1) this).anIntArray10437[12], aClass287_5519,
	     (byte) 35);
	((Class361_Sub1) this).aClass116_10449.method2831
	    (((Class361_Sub1) this).anIntArray10437[13], aClass287_5520,
	     (byte) 42);
	((Class361_Sub1) this).aClass116_10449.method2831
	    (((Class361_Sub1) this).anIntArray10437[14], aClass287_5521,
	     (byte) 38);
	if (i > 0) {
	    ((Class361_Sub1) this).aClass116_10449.method2832
		(((Class361_Sub1) this).anIntArray10437[1], aFloatArray5504,
		 i * 4, -649955037);
	    ((Class361_Sub1) this).aClass116_10449.method2832
		(((Class361_Sub1) this).anIntArray10437[0], aFloatArray5524,
		 4 * i, -649955037);
	}
	aClass103_Sub3_5505.method15726(Class310.aClass310_4822, anInt5522,
					anInt5523, anInt5506, anInt5517);
    }
    
    public static void method16755
	(Player class475_sub1_sub1_sub3_sub1, int i) {
	Class241_Sub38 class241_sub38
	    = ((Class241_Sub38)
	       (Class241_Sub38.aClass407_10118.get
		((long) (class475_sub1_sub1_sub3_sub1.entityIndex
			 * -546698383))));
	if (null != class241_sub38) {
	    if (((Class241_Sub38) class241_sub38).aClass221_10141 != null) {
		((Class241_Sub38) class241_sub38).aClass221_10141
		    .method4405(100, -748173611);
		Class402.soundManager.method1136((((Class241_Sub38)
						    class241_sub38)
						   .aClass221_10141),
						  (byte) -31);
		((Class241_Sub38) class241_sub38).aClass221_10141 = null;
	    }
	    class241_sub38.remove((byte) 36);
	}
    }
    
    public static final int method16756(long l, String string, int i) {
	Random random = new Random();
	RSByteBuffer class241_sub3 = new RSByteBuffer(128);
	RSByteBuffer class241_sub3_71_ = new RSByteBuffer(128);
	int[] is = new int[4];
	is[0] = random.nextInt();
	is[1] = random.nextInt();
	is[2] = (int) (l >> 32);
	is[3] = (int) l;
	class241_sub3.writeByte(10, 1632401599);
	for (int i_72_ = 0; i_72_ < 4; i_72_++)
	    class241_sub3.writeInt(random.nextInt(), -1700449964);
	class241_sub3.writeInt(is[0], -399286824);
	class241_sub3.writeInt(is[1], -1680311309);
	class241_sub3.method14627(l);
	class241_sub3.method14627(0L);
	for (int i_73_ = 0; i_73_ < 4; i_73_++)
	    class241_sub3.writeInt(random.nextInt(), 1519908634);
	class241_sub3.applyRSA(Class10.aBigInteger55, Class10.aBigInteger54, (byte) -1);
	class241_sub3_71_.writeByte(10, 1043157851);
	for (int i_74_ = 0; i_74_ < 3; i_74_++)
	    class241_sub3_71_.writeInt(random.nextInt(), -130891816);
	class241_sub3_71_.method14627(random.nextLong());
	class241_sub3_71_.method14745(random.nextLong());
	Class445_Sub9.method14184(class241_sub3_71_, 2028733795);
	class241_sub3_71_.method14627(random.nextLong());
	class241_sub3_71_.applyRSA(Class10.aBigInteger55,
				      Class10.aBigInteger54, (byte) -1);
	int i_75_ = Class421.getEncodedStringLength(string, -1705029329);
	if (i_75_ % 8 != 0)
	    i_75_ += 8 - i_75_ % 8;
	RSByteBuffer class241_sub3_76_ = new RSByteBuffer(i_75_);
	class241_sub3_76_.writeString(string, -2100558166);
	class241_sub3_76_.pointer = -681042949 * i_75_;
	class241_sub3_76_.method14661(is, 391555627);
	RSByteBuffer class241_sub3_77_
	    = new RSByteBuffer(421967667 * class241_sub3_76_.pointer
				+ (class241_sub3_71_.pointer * 421967667
				   + (class241_sub3.pointer * 421967667
				      + 5)));
	class241_sub3_77_.writeByte(2, 910804843);
	class241_sub3_77_.writeByte(class241_sub3.pointer * 421967667,
				      -1175258844);
	class241_sub3_77_.writeBytes(class241_sub3.payload, 0,
				      class241_sub3.pointer * 421967667,
				      752061035);
	class241_sub3_77_.writeByte(421967667 * class241_sub3_71_.pointer,
				      -1883109516);
	class241_sub3_77_.writeBytes(class241_sub3_71_.payload, 0,
				      421967667 * class241_sub3_71_.pointer,
				      752061035);
	class241_sub3_77_.writeShort(class241_sub3_76_.pointer * 421967667,
				      -484048531);
	class241_sub3_77_.writeBytes(class241_sub3_76_.payload, 0,
				      class241_sub3_76_.pointer * 421967667,
				      752061035);
	String string_78_
	    = Class102.method2211(class241_sub3_77_.payload,
				  1012097866);
	int i_79_;
	try {
	    URL url = new URL(new StringBuilder().append
				  (Class589.method12904("services", false,
							-1852374183))
				  .append
				  ("m=accountappeal/login.ws").toString());
	    URLConnection urlconnection = url.openConnection();
	    urlconnection.setDoInput(true);
	    urlconnection.setDoOutput(true);
	    urlconnection.setConnectTimeout(5000);
	    OutputStreamWriter outputstreamwriter
		= new OutputStreamWriter(urlconnection.getOutputStream());
	    outputstreamwriter.write
		(new StringBuilder().append("data2=").append
		     (Class582.method12774(string_78_, -2130991015)).append
		     ("&dest=").append
		     (Class582.method12774("passwordchoice.ws", -2016057184))
		     .toString());
	    outputstreamwriter.flush();
	    InputStream inputstream = urlconnection.getInputStream();
	    class241_sub3_77_ = new RSByteBuffer(new byte[1000]);
	    for (;;) {
		int i_80_
		    = inputstream.read(class241_sub3_77_.payload,
				       421967667 * class241_sub3_77_.pointer,
				       1000 - (421967667
					       * class241_sub3_77_.pointer));
		if (i_80_ == -1)
		    break;
		class241_sub3_77_.pointer += -681042949 * i_80_;
		if (421967667 * class241_sub3_77_.pointer >= 1000)
		    return 5;
	    }
	    outputstreamwriter.close();
	    inputstream.close();
	    String string_81_ = new String(class241_sub3_77_.payload);
	    if (string_81_.startsWith("OFFLINE"))
		return 4;
	    if (string_81_.startsWith("WRONG"))
		return 7;
	    if (string_81_.startsWith("RELOAD"))
		return 3;
	    if (string_81_
		    .startsWith("Not permitted for social network accounts."))
		return 6;
	    class241_sub3_77_.method14664(is, -2023468398);
	    for (/**/;
		 (421967667 * class241_sub3_77_.pointer > 0
		  && 0 == (class241_sub3_77_.payload
			   [class241_sub3_77_.pointer * 421967667 - 1]));
		 class241_sub3_77_.pointer -= -681042949) {
		/* empty */
	    }
	    string_81_ = new String(class241_sub3_77_.payload, 0,
				    class241_sub3_77_.pointer * 421967667);
	    if (Class40.method1049(string_81_, 649693967)) {
		Class446.method7895(string_81_, true, client.aBool8440,
				    -1815142638);
		return 2;
	    }
	    i_79_ = 5;
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    return 5;
	}
	return i_79_;
    }
    
    public static Class411 method16757(int i) {
	if (Class327.aClass411_5019 == null)
	    return Class411.aClass411_5940;
	return Class327.aClass411_5019;
    }
}
