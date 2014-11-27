/* Class55_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

@SuppressWarnings("restriction")
public final class Class55_Sub1 extends Class55
{
    float[][] aFloatArrayArray9838;
    Class103_Sub3_Sub1 aClass103_Sub3_Sub1_9839;
    static final int anInt9840 = 1;
    boolean aBool9841 = false;
    long aLong9842;
    static float[] aFloatArray9843 = new float[16];
    byte[] aByteArray9844;
    byte[] aByteArray9845;
    static final int anInt9846 = 0;
    boolean[] aBoolArray9847;
    long aLong9848;
    Class116_Sub2 aClass116_Sub2_9849;
    
    final void method16163(int i, float[] fs, int i_0_) {
	Class430.method7734(fs, 0,
			    ((Class55_Sub1) this).aFloatArrayArray9838[0],
			    i * 4, i_0_);
	((Class55_Sub1) this).aBoolArray9847[0] = true;
    }
    
    void method1350(Class241_Sub23_Sub1 class241_sub23_sub1, float[] fs,
		    int i) {
	int i_1_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_2_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(1860344141)
	    != Class38.aClass38_460)
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i_1_ >= 0)
	    method16164(i_1_, fs, i);
	if (i_2_ >= 0)
	    method16165(i_2_, fs, i);
    }
    
    public boolean method1311() {
	if (((Class55_Sub1) this).aBool9841)
	    return true;
	((Class55_Sub1) this).aLong9848
	    = (((Class55_Sub1) this).aByteArray9844 == null ? 0L
	       : (IDirect3DDevice.CreateVertexShader
		  (((Class103_Sub3_Sub1)
		    ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839).aLong11097,
		   ((Class55_Sub1) this).aByteArray9844)));
	((Class55_Sub1) this).aLong9842
	    = (((Class55_Sub1) this).aByteArray9845 == null ? 0L
	       : (IDirect3DDevice.CreatePixelShader
		  (((Class103_Sub3_Sub1)
		    ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839).aLong11097,
		   ((Class55_Sub1) this).aByteArray9845)));
	if (((Class55_Sub1) this).aLong9848 == 0L
	    && ((Class55_Sub1) this).aLong9842 == 0L)
	    return false;
	int i = -1;
	for (int i_3_ = 0; i_3_ < ((Class55_Sub1) this).aClass116_Sub2_9849
				      .method2806(2138523055); i_3_++) {
	    if (((Class55_Sub1) this).aClass116_Sub2_9849.method2898(i_3_,
								     916424585)
		== this) {
		i = i_3_;
		break;
	    }
	}
	int i_4_ = ((Class55_Sub1) this).aClass116_Sub2_9849
		       .method2809(-1105855140);
	int i_5_
	    = ((Class55_Sub1) this).aClass116_Sub2_9849.method2909(-525266383);
	for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
	    Class241_Sub23_Sub1 class241_sub23_sub1
		= ((Class55_Sub1) this).aClass116_Sub2_9849
		      .method2842(i_6_, -1190816765);
	    class241_sub23_sub1.method17403(i);
	}
	for (int i_7_ = 0; i_7_ < i_5_; i_7_++) {
	    Class241_Sub23_Sub1 class241_sub23_sub1
		= ((Class55_Sub1) this).aClass116_Sub2_9849
		      .method2839(i_7_, -1966406248);
	    class241_sub23_sub1.method17403(i);
	}
	int i_8_ = 0;
	int i_9_ = 0;
	int i_10_ = ((Class55_Sub1) this).aClass116_Sub2_9849
			.method2813(this, (byte) -122);
	for (int i_11_ = 0; i_11_ < i_4_ + i_5_; i_11_++) {
	    Class241_Sub23_Sub1_Sub1 class241_sub23_sub1_sub1
		= ((Class241_Sub23_Sub1_Sub1)
		   (i_11_ < i_4_
		    ? ((Class55_Sub1) this).aClass116_Sub2_9849
			  .method2842(i_11_, 2060429070)
		    : ((Class55_Sub1) this).aClass116_Sub2_9849
			  .method2839(i_11_ - i_4_, 1477291846)));
	    Class38 class38
		= class241_sub23_sub1_sub1.method17405(-1472046548);
	    int i_12_ = 1;
	    if (class38 == Class38.aClass38_460) {
		class38 = class241_sub23_sub1_sub1.method17411(-1947176057);
		i_12_ = class241_sub23_sub1_sub1.method17407(151353172);
	    }
	    switch (class38.anInt479 * 1413800313) {
	    default:
		i_12_ = 0;
		break;
	    case 1:
	    case 20:
	    case 56:
	    case 65:
		i_12_ *= 3;
		break;
	    case 13:
	    case 24:
	    case 60:
	    case 103:
		i_12_ *= 4;
		break;
	    case 17:
	    case 32:
	    case 67:
	    case 77:
	    case 99:
		break;
	    case 94:
	    case 104:
	    case 112:
	    case 121:
		i_12_ *= 2;
	    }
	    if ((((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1_sub1)
		 .anIntArray11284[i_10_])
		>= 0) {
		int i_13_
		    = ((((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1_sub1)
			.anIntArray11284[i_10_])
		       + i_12_);
		if (i_8_ < i_13_)
		    i_8_ = i_13_;
	    }
	    if ((((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1_sub1)
		 .anIntArray11283[i_10_])
		>= 0) {
		int i_14_
		    = ((((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1_sub1)
			.anIntArray11283[i_10_])
		       + i_12_);
		if (i_9_ < i_14_)
		    i_9_ = i_14_;
	    }
	}
	((Class55_Sub1) this).aFloatArrayArray9838[0] = new float[i_8_ * 4];
	((Class55_Sub1) this).aFloatArrayArray9838[1] = new float[i_9_ * 4];
	((Class55_Sub1) this).aBool9841 = true;
	return true;
    }
    
    void method1323(int i, Class268 class268) {
	int i_15_ = i >> 16;
	int i_16_ = (i & 0xffff) * 4;
	System.arraycopy(class268.method5282(aFloatArray9843), 0,
			 ((Class55_Sub1) this).aFloatArrayArray9838[i_15_],
			 i_16_, 12);
	((Class55_Sub1) this).aBoolArray9847[i_15_] = true;
    }
    
    void method1340(Class241_Sub23_Sub1 class241_sub23_sub1, float f,
		    float f_17_) {
	int i = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_18_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(-623599013)
	    != Class38.aClass38_483)
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 0] = f;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 1] = f_17_;
	    ((Class55_Sub1) this).aBoolArray9847[0] = true;
	}
	if (i_18_ >= 0) {
	    i_18_ *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_18_ + 0] = f;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_18_ + 1] = f_17_;
	    ((Class55_Sub1) this).aBoolArray9847[1] = true;
	}
    }
    
    void method1325(Class241_Sub23_Sub1 class241_sub23_sub1, float f,
		    float f_19_, float f_20_) {
	int i = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_21_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(1019463524)
	    != Class38.aClass38_575)
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 0] = f;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 1] = f_19_;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 2] = f_20_;
	    ((Class55_Sub1) this).aBoolArray9847[0] = true;
	}
	if (i_21_ >= 0) {
	    i_21_ *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_21_ + 0] = f;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_21_ + 1] = f_19_;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_21_ + 2] = f_20_;
	    ((Class55_Sub1) this).aBoolArray9847[1] = true;
	}
    }
    
    void method1349(Class241_Sub23_Sub1 class241_sub23_sub1, float f,
		    float f_22_, float f_23_, float f_24_) {
	int i = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_25_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(-653920964)
	    != Class38.aClass38_485)
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 0] = f;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 1] = f_22_;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 2] = f_23_;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 3] = f_24_;
	    ((Class55_Sub1) this).aBoolArray9847[0] = true;
	}
	if (i_25_ >= 0) {
	    i_25_ *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_25_ + 0] = f;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_25_ + 1] = f_22_;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_25_ + 2] = f_23_;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_25_ + 3] = f_24_;
	    ((Class55_Sub1) this).aBoolArray9847[1] = true;
	}
    }
    
    void method1330(Class241_Sub23_Sub1 class241_sub23_sub1,
		    Class268 class268) {
	int i = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_26_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(-207571820)
	    != Class38.aClass38_499)
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i >= 0)
	    method16164(i, class268.method5230(aFloatArray9843), 8);
	if (i_26_ >= 0)
	    method16165(i_26_, class268.method5230(aFloatArray9843), 8);
    }
    
    void method1321(Class241_Sub23_Sub1 class241_sub23_sub1, int i,
		    Interface31 interface31) {
	((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.method15686(i);
	((Class55_Sub1) this).aClass103_Sub3_Sub1_9839
	    .method15856(interface31);
    }
    
    void method1366(int i, Class268 class268) {
	int i_27_ = i >> 16;
	int i_28_ = (i & 0xffff) * 4;
	System.arraycopy(class268.method5282(aFloatArray9843), 0,
			 ((Class55_Sub1) this).aFloatArrayArray9838[i_27_],
			 i_28_, 16);
	((Class55_Sub1) this).aBoolArray9847[i_27_] = true;
    }
    
    void method1319(Class241_Sub23_Sub1 class241_sub23_sub1, int i,
		    Interface31 interface31) {
	((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.method15686(i);
	((Class55_Sub1) this).aClass103_Sub3_Sub1_9839
	    .method15856(interface31);
    }
    
    Class55_Sub1(Class103_Sub3_Sub1 class103_sub3_sub1, Class117 class117) {
	((Class55_Sub1) this).aFloatArrayArray9838 = new float[2][];
	((Class55_Sub1) this).aBoolArray9847 = new boolean[2];
	aString697 = class117.aString1551;
	if (class117.aString1548 != null) {
	    aString695 = class117.aString1548;
	    ((Class55_Sub1) this).aByteArray9844
		= class103_sub3_sub1.method17470(aString695);
	}
	if (class117.aString1547 != null) {
	    aString696 = class117.aString1547;
	    ((Class55_Sub1) this).aByteArray9845
		= class103_sub3_sub1.method17470(aString696);
	}
	class103_sub3_sub1.method16005(this);
    }
    
    void method1347(Class241_Sub23_Sub1 class241_sub23_sub1, int i,
		    Interface31 interface31) {
	((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.method15686(i);
	((Class55_Sub1) this).aClass103_Sub3_Sub1_9839
	    .method15856(interface31);
    }
    
    void method1362(int i, float[] fs, int i_29_) {
	int i_30_ = i >> 16;
	int i_31_ = (i & 0xffff) * 4;
	System.arraycopy(fs, 0,
			 ((Class55_Sub1) this).aFloatArrayArray9838[i_30_],
			 i_31_, i_29_);
	((Class55_Sub1) this).aBoolArray9847[i_30_] = true;
    }
    
    void method1353(int i, float f, float f_32_, float f_33_, float f_34_) {
	int i_35_ = i >> 16;
	int i_36_ = (i & 0xffff) * 4;
	((Class55_Sub1) this).aFloatArrayArray9838[i_35_][i_36_] = f;
	((Class55_Sub1) this).aFloatArrayArray9838[i_35_][i_36_ + 1] = f_32_;
	((Class55_Sub1) this).aFloatArrayArray9838[i_35_][i_36_ + 2] = f_33_;
	((Class55_Sub1) this).aFloatArrayArray9838[i_35_][i_36_ + 3] = f_34_;
	((Class55_Sub1) this).aBoolArray9847[i_35_] = true;
    }
    
    void method1322(int i, float[] fs, int i_37_) {
	int i_38_ = i >> 16;
	int i_39_ = (i & 0xffff) * 4;
	System.arraycopy(fs, 0,
			 ((Class55_Sub1) this).aFloatArrayArray9838[i_38_],
			 i_39_, i_37_);
	((Class55_Sub1) this).aBoolArray9847[i_38_] = true;
    }
    
    final void method16164(int i, float[] fs, int i_40_) {
	Class430.method7734(fs, 0,
			    ((Class55_Sub1) this).aFloatArrayArray9838[0],
			    i * 4, i_40_);
	((Class55_Sub1) this).aBoolArray9847[0] = true;
    }
    
    final void method16165(int i, float[] fs, int i_41_) {
	Class430.method7734(fs, 0,
			    ((Class55_Sub1) this).aFloatArrayArray9838[1],
			    i * 4, i_41_);
	((Class55_Sub1) this).aBoolArray9847[1] = true;
    }
    
    void method1339(int i, int i_42_, Interface31 interface31) {
	((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.method15686(i_42_);
	((Class55_Sub1) this).aClass103_Sub3_Sub1_9839
	    .method15856(interface31);
    }
    
    void method1334(Class241_Sub23_Sub1 class241_sub23_sub1, float f,
		    float f_43_) {
	int i = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_44_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(-1323412228)
	    != Class38.aClass38_483)
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 0] = f;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 1] = f_43_;
	    ((Class55_Sub1) this).aBoolArray9847[0] = true;
	}
	if (i_44_ >= 0) {
	    i_44_ *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_44_ + 0] = f;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_44_ + 1] = f_43_;
	    ((Class55_Sub1) this).aBoolArray9847[1] = true;
	}
    }
    
    public void method28() {
	if (((Class55_Sub1) this).aLong9848 != 0L) {
	    IUnknown.Release(((Class55_Sub1) this).aLong9848);
	    ((Class55_Sub1) this).aLong9848 = 0L;
	}
	if (((Class55_Sub1) this).aLong9842 != 0L) {
	    IUnknown.Release(((Class55_Sub1) this).aLong9842);
	    ((Class55_Sub1) this).aLong9842 = 0L;
	}
	((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.method15617(this);
    }
    
    void method1312(int i, int i_45_, Interface31 interface31) {
	((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.method15686(i_45_);
	((Class55_Sub1) this).aClass103_Sub3_Sub1_9839
	    .method15856(interface31);
    }
    
    void method1338(int i, Class268 class268) {
	int i_46_ = i >> 16;
	int i_47_ = (i & 0xffff) * 4;
	System.arraycopy(class268.method5230(aFloatArray9843), 0,
			 ((Class55_Sub1) this).aFloatArrayArray9838[i_46_],
			 i_47_, 8);
	((Class55_Sub1) this).aBoolArray9847[i_46_] = true;
    }
    
    void method1348(Class241_Sub23_Sub1 class241_sub23_sub1, int i,
		    Interface31 interface31) {
	((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.method15686(i);
	((Class55_Sub1) this).aClass103_Sub3_Sub1_9839
	    .method15856(interface31);
    }
    
    public void method27() {
	if (((Class55_Sub1) this).aLong9848 != 0L) {
	    IUnknown.Release(((Class55_Sub1) this).aLong9848);
	    ((Class55_Sub1) this).aLong9848 = 0L;
	}
	if (((Class55_Sub1) this).aLong9842 != 0L) {
	    IUnknown.Release(((Class55_Sub1) this).aLong9842);
	    ((Class55_Sub1) this).aLong9842 = 0L;
	}
	((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.method15617(this);
    }
    
    public void method29() {
	if (((Class55_Sub1) this).aLong9848 != 0L) {
	    IUnknown.Release(((Class55_Sub1) this).aLong9848);
	    ((Class55_Sub1) this).aLong9848 = 0L;
	}
	if (((Class55_Sub1) this).aLong9842 != 0L) {
	    IUnknown.Release(((Class55_Sub1) this).aLong9842);
	    ((Class55_Sub1) this).aLong9842 = 0L;
	}
	((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.method15617(this);
    }
    
    void method16166() {
	method16170();
    }
    
    void method16167() {
	method16170();
    }
    
    void method16168() {
	method16170();
    }
    
    void method16169() {
	method16170();
    }
    
    public boolean method1328() {
	if (((Class55_Sub1) this).aBool9841)
	    return true;
	((Class55_Sub1) this).aLong9848
	    = (((Class55_Sub1) this).aByteArray9844 == null ? 0L
	       : (IDirect3DDevice.CreateVertexShader
		  (((Class103_Sub3_Sub1)
		    ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839).aLong11097,
		   ((Class55_Sub1) this).aByteArray9844)));
	((Class55_Sub1) this).aLong9842
	    = (((Class55_Sub1) this).aByteArray9845 == null ? 0L
	       : (IDirect3DDevice.CreatePixelShader
		  (((Class103_Sub3_Sub1)
		    ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839).aLong11097,
		   ((Class55_Sub1) this).aByteArray9845)));
	if (((Class55_Sub1) this).aLong9848 == 0L
	    && ((Class55_Sub1) this).aLong9842 == 0L)
	    return false;
	int i = -1;
	for (int i_48_ = 0; i_48_ < ((Class55_Sub1) this)
					.aClass116_Sub2_9849
					.method2806(-1764220575); i_48_++) {
	    if (((Class55_Sub1) this).aClass116_Sub2_9849
		    .method2898(i_48_, 1403138990)
		== this) {
		i = i_48_;
		break;
	    }
	}
	int i_49_
	    = ((Class55_Sub1) this).aClass116_Sub2_9849.method2809(988942589);
	int i_50_
	    = ((Class55_Sub1) this).aClass116_Sub2_9849.method2909(1026355285);
	for (int i_51_ = 0; i_51_ < i_49_; i_51_++) {
	    Class241_Sub23_Sub1 class241_sub23_sub1
		= ((Class55_Sub1) this).aClass116_Sub2_9849
		      .method2842(i_51_, -293844620);
	    class241_sub23_sub1.method17403(i);
	}
	for (int i_52_ = 0; i_52_ < i_50_; i_52_++) {
	    Class241_Sub23_Sub1 class241_sub23_sub1
		= ((Class55_Sub1) this).aClass116_Sub2_9849
		      .method2839(i_52_, -169984694);
	    class241_sub23_sub1.method17403(i);
	}
	int i_53_ = 0;
	int i_54_ = 0;
	int i_55_ = ((Class55_Sub1) this).aClass116_Sub2_9849
			.method2813(this, (byte) -123);
	for (int i_56_ = 0; i_56_ < i_49_ + i_50_; i_56_++) {
	    Class241_Sub23_Sub1_Sub1 class241_sub23_sub1_sub1
		= ((Class241_Sub23_Sub1_Sub1)
		   (i_56_ < i_49_
		    ? ((Class55_Sub1) this).aClass116_Sub2_9849
			  .method2842(i_56_, 174836934)
		    : ((Class55_Sub1) this).aClass116_Sub2_9849
			  .method2839(i_56_ - i_49_, -498316830)));
	    Class38 class38 = class241_sub23_sub1_sub1.method17405(50012798);
	    int i_57_ = 1;
	    if (class38 == Class38.aClass38_460) {
		class38 = class241_sub23_sub1_sub1.method17411(-1947176057);
		i_57_ = class241_sub23_sub1_sub1.method17407(133562152);
	    }
	    switch (class38.anInt479 * 1413800313) {
	    default:
		i_57_ = 0;
		break;
	    case 1:
	    case 20:
	    case 56:
	    case 65:
		i_57_ *= 3;
		break;
	    case 13:
	    case 24:
	    case 60:
	    case 103:
		i_57_ *= 4;
		break;
	    case 17:
	    case 32:
	    case 67:
	    case 77:
	    case 99:
		break;
	    case 94:
	    case 104:
	    case 112:
	    case 121:
		i_57_ *= 2;
	    }
	    if ((((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1_sub1)
		 .anIntArray11284[i_55_])
		>= 0) {
		int i_58_
		    = ((((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1_sub1)
			.anIntArray11284[i_55_])
		       + i_57_);
		if (i_53_ < i_58_)
		    i_53_ = i_58_;
	    }
	    if ((((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1_sub1)
		 .anIntArray11283[i_55_])
		>= 0) {
		int i_59_
		    = ((((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1_sub1)
			.anIntArray11283[i_55_])
		       + i_57_);
		if (i_54_ < i_59_)
		    i_54_ = i_59_;
	    }
	}
	((Class55_Sub1) this).aFloatArrayArray9838[0] = new float[i_53_ * 4];
	((Class55_Sub1) this).aFloatArrayArray9838[1] = new float[i_54_ * 4];
	((Class55_Sub1) this).aBool9841 = true;
	return true;
    }
    
    public boolean method1318() {
	if (((Class55_Sub1) this).aBool9841)
	    return true;
	((Class55_Sub1) this).aLong9848
	    = (((Class55_Sub1) this).aByteArray9844 == null ? 0L
	       : (IDirect3DDevice.CreateVertexShader
		  (((Class103_Sub3_Sub1)
		    ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839).aLong11097,
		   ((Class55_Sub1) this).aByteArray9844)));
	((Class55_Sub1) this).aLong9842
	    = (((Class55_Sub1) this).aByteArray9845 == null ? 0L
	       : (IDirect3DDevice.CreatePixelShader
		  (((Class103_Sub3_Sub1)
		    ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839).aLong11097,
		   ((Class55_Sub1) this).aByteArray9845)));
	if (((Class55_Sub1) this).aLong9848 == 0L
	    && ((Class55_Sub1) this).aLong9842 == 0L)
	    return false;
	int i = -1;
	for (int i_60_ = 0; i_60_ < ((Class55_Sub1) this)
					.aClass116_Sub2_9849
					.method2806(-1812266957); i_60_++) {
	    if (((Class55_Sub1) this).aClass116_Sub2_9849.method2898(i_60_,
								     340187082)
		== this) {
		i = i_60_;
		break;
	    }
	}
	int i_61_ = ((Class55_Sub1) this).aClass116_Sub2_9849
			.method2809(-1943094391);
	int i_62_
	    = ((Class55_Sub1) this).aClass116_Sub2_9849.method2909(1373442193);
	for (int i_63_ = 0; i_63_ < i_61_; i_63_++) {
	    Class241_Sub23_Sub1 class241_sub23_sub1
		= ((Class55_Sub1) this).aClass116_Sub2_9849
		      .method2842(i_63_, 165492300);
	    class241_sub23_sub1.method17403(i);
	}
	for (int i_64_ = 0; i_64_ < i_62_; i_64_++) {
	    Class241_Sub23_Sub1 class241_sub23_sub1
		= ((Class55_Sub1) this).aClass116_Sub2_9849
		      .method2839(i_64_, -1002619044);
	    class241_sub23_sub1.method17403(i);
	}
	int i_65_ = 0;
	int i_66_ = 0;
	int i_67_ = ((Class55_Sub1) this).aClass116_Sub2_9849
			.method2813(this, (byte) -112);
	for (int i_68_ = 0; i_68_ < i_61_ + i_62_; i_68_++) {
	    Class241_Sub23_Sub1_Sub1 class241_sub23_sub1_sub1
		= ((Class241_Sub23_Sub1_Sub1)
		   (i_68_ < i_61_
		    ? ((Class55_Sub1) this).aClass116_Sub2_9849
			  .method2842(i_68_, -310240791)
		    : ((Class55_Sub1) this).aClass116_Sub2_9849
			  .method2839(i_68_ - i_61_, 888637196)));
	    Class38 class38
		= class241_sub23_sub1_sub1.method17405(-1872082166);
	    int i_69_ = 1;
	    if (class38 == Class38.aClass38_460) {
		class38 = class241_sub23_sub1_sub1.method17411(-1947176057);
		i_69_ = class241_sub23_sub1_sub1.method17407(1280430983);
	    }
	    switch (class38.anInt479 * 1413800313) {
	    default:
		i_69_ = 0;
		break;
	    case 1:
	    case 20:
	    case 56:
	    case 65:
		i_69_ *= 3;
		break;
	    case 13:
	    case 24:
	    case 60:
	    case 103:
		i_69_ *= 4;
		break;
	    case 17:
	    case 32:
	    case 67:
	    case 77:
	    case 99:
		break;
	    case 94:
	    case 104:
	    case 112:
	    case 121:
		i_69_ *= 2;
	    }
	    if ((((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1_sub1)
		 .anIntArray11284[i_67_])
		>= 0) {
		int i_70_
		    = ((((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1_sub1)
			.anIntArray11284[i_67_])
		       + i_69_);
		if (i_65_ < i_70_)
		    i_65_ = i_70_;
	    }
	    if ((((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1_sub1)
		 .anIntArray11283[i_67_])
		>= 0) {
		int i_71_
		    = ((((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1_sub1)
			.anIntArray11283[i_67_])
		       + i_69_);
		if (i_66_ < i_71_)
		    i_66_ = i_71_;
	    }
	}
	((Class55_Sub1) this).aFloatArrayArray9838[0] = new float[i_65_ * 4];
	((Class55_Sub1) this).aFloatArrayArray9838[1] = new float[i_66_ * 4];
	((Class55_Sub1) this).aBool9841 = true;
	return true;
    }
    
    Class55_Sub1(Class103_Sub3_Sub1 class103_sub3_sub1,
		 Class116_Sub2 class116_sub2, Class117 class117) {
	this(class103_sub3_sub1, class117);
	((Class55_Sub1) this).aClass103_Sub3_Sub1_9839 = class103_sub3_sub1;
	((Class55_Sub1) this).aClass116_Sub2_9849 = class116_sub2;
    }
    
    public boolean method1331() {
	if (((Class55_Sub1) this).aBool9841)
	    return true;
	((Class55_Sub1) this).aLong9848
	    = (((Class55_Sub1) this).aByteArray9844 == null ? 0L
	       : (IDirect3DDevice.CreateVertexShader
		  (((Class103_Sub3_Sub1)
		    ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839).aLong11097,
		   ((Class55_Sub1) this).aByteArray9844)));
	((Class55_Sub1) this).aLong9842
	    = (((Class55_Sub1) this).aByteArray9845 == null ? 0L
	       : (IDirect3DDevice.CreatePixelShader
		  (((Class103_Sub3_Sub1)
		    ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839).aLong11097,
		   ((Class55_Sub1) this).aByteArray9845)));
	if (((Class55_Sub1) this).aLong9848 == 0L
	    && ((Class55_Sub1) this).aLong9842 == 0L)
	    return false;
	int i = -1;
	for (int i_72_ = 0; i_72_ < ((Class55_Sub1) this)
					.aClass116_Sub2_9849
					.method2806(1967824876); i_72_++) {
	    if (((Class55_Sub1) this).aClass116_Sub2_9849
		    .method2898(i_72_, 1256345196)
		== this) {
		i = i_72_;
		break;
	    }
	}
	int i_73_
	    = ((Class55_Sub1) this).aClass116_Sub2_9849.method2809(857808346);
	int i_74_ = ((Class55_Sub1) this).aClass116_Sub2_9849
			.method2909(-1931067954);
	for (int i_75_ = 0; i_75_ < i_73_; i_75_++) {
	    Class241_Sub23_Sub1 class241_sub23_sub1
		= ((Class55_Sub1) this).aClass116_Sub2_9849
		      .method2842(i_75_, 1221997098);
	    class241_sub23_sub1.method17403(i);
	}
	for (int i_76_ = 0; i_76_ < i_74_; i_76_++) {
	    Class241_Sub23_Sub1 class241_sub23_sub1
		= ((Class55_Sub1) this).aClass116_Sub2_9849
		      .method2839(i_76_, -191009999);
	    class241_sub23_sub1.method17403(i);
	}
	int i_77_ = 0;
	int i_78_ = 0;
	int i_79_
	    = ((Class55_Sub1) this).aClass116_Sub2_9849.method2813(this,
								   (byte) -77);
	for (int i_80_ = 0; i_80_ < i_73_ + i_74_; i_80_++) {
	    Class241_Sub23_Sub1_Sub1 class241_sub23_sub1_sub1
		= ((Class241_Sub23_Sub1_Sub1)
		   (i_80_ < i_73_
		    ? ((Class55_Sub1) this).aClass116_Sub2_9849
			  .method2842(i_80_, 806857563)
		    : ((Class55_Sub1) this).aClass116_Sub2_9849
			  .method2839(i_80_ - i_73_, -1446916428)));
	    Class38 class38
		= class241_sub23_sub1_sub1.method17405(-1877806917);
	    int i_81_ = 1;
	    if (class38 == Class38.aClass38_460) {
		class38 = class241_sub23_sub1_sub1.method17411(-1947176057);
		i_81_ = class241_sub23_sub1_sub1.method17407(1643316577);
	    }
	    switch (class38.anInt479 * 1413800313) {
	    default:
		i_81_ = 0;
		break;
	    case 1:
	    case 20:
	    case 56:
	    case 65:
		i_81_ *= 3;
		break;
	    case 13:
	    case 24:
	    case 60:
	    case 103:
		i_81_ *= 4;
		break;
	    case 17:
	    case 32:
	    case 67:
	    case 77:
	    case 99:
		break;
	    case 94:
	    case 104:
	    case 112:
	    case 121:
		i_81_ *= 2;
	    }
	    if ((((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1_sub1)
		 .anIntArray11284[i_79_])
		>= 0) {
		int i_82_
		    = ((((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1_sub1)
			.anIntArray11284[i_79_])
		       + i_81_);
		if (i_77_ < i_82_)
		    i_77_ = i_82_;
	    }
	    if ((((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1_sub1)
		 .anIntArray11283[i_79_])
		>= 0) {
		int i_83_
		    = ((((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1_sub1)
			.anIntArray11283[i_79_])
		       + i_81_);
		if (i_78_ < i_83_)
		    i_78_ = i_83_;
	    }
	}
	((Class55_Sub1) this).aFloatArrayArray9838[0] = new float[i_77_ * 4];
	((Class55_Sub1) this).aFloatArrayArray9838[1] = new float[i_78_ * 4];
	((Class55_Sub1) this).aBool9841 = true;
	return true;
    }
    
    void method1332(Class241_Sub23_Sub1 class241_sub23_sub1, float f) {
	int i = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_84_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(1844047179) != Class38.aClass38_482
	    && (class241_sub23_sub1.method17405(-1937872776)
		!= Class38.aClass38_528))
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i] = f;
	    ((Class55_Sub1) this).aBoolArray9847[0] = true;
	}
	if (i_84_ >= 0) {
	    i_84_ *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_84_] = f;
	    ((Class55_Sub1) this).aBoolArray9847[1] = true;
	}
    }
    
    void method1326(int i, float f, float f_85_, float f_86_) {
	int i_87_ = i >> 16;
	int i_88_ = (i & 0xffff) * 4;
	((Class55_Sub1) this).aFloatArrayArray9838[i_87_][i_88_] = f;
	((Class55_Sub1) this).aFloatArrayArray9838[i_87_][i_88_ + 1] = f_85_;
	((Class55_Sub1) this).aFloatArrayArray9838[i_87_][i_88_ + 2] = f_86_;
	((Class55_Sub1) this).aBoolArray9847[i_87_] = true;
    }
    
    void method16170() {
	if (((Class55_Sub1) this).aLong9848 != 0L) {
	    ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839
		.method17463(((Class55_Sub1) this).aLong9848);
	    ((Class55_Sub1) this).aLong9848 = 0L;
	}
	if (((Class55_Sub1) this).aLong9842 != 0L) {
	    ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839
		.method17463(((Class55_Sub1) this).aLong9842);
	    ((Class55_Sub1) this).aLong9842 = 0L;
	}
    }
    
    void method1335(Class241_Sub23_Sub1 class241_sub23_sub1, float f,
		    float f_89_, float f_90_) {
	int i = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_91_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(786440944) != Class38.aClass38_575)
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 0] = f;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 1] = f_89_;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 2] = f_90_;
	    ((Class55_Sub1) this).aBoolArray9847[0] = true;
	}
	if (i_91_ >= 0) {
	    i_91_ *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_91_ + 0] = f;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_91_ + 1] = f_89_;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_91_ + 2] = f_90_;
	    ((Class55_Sub1) this).aBoolArray9847[1] = true;
	}
    }
    
    void method1336(Class241_Sub23_Sub1 class241_sub23_sub1, float f,
		    float f_92_, float f_93_) {
	int i = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_94_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(-616874433)
	    != Class38.aClass38_575)
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 0] = f;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 1] = f_92_;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 2] = f_93_;
	    ((Class55_Sub1) this).aBoolArray9847[0] = true;
	}
	if (i_94_ >= 0) {
	    i_94_ *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_94_ + 0] = f;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_94_ + 1] = f_92_;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_94_ + 2] = f_93_;
	    ((Class55_Sub1) this).aBoolArray9847[1] = true;
	}
    }
    
    void method1337(Class241_Sub23_Sub1 class241_sub23_sub1, float f,
		    float f_95_, float f_96_) {
	int i = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_97_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(-737199937)
	    != Class38.aClass38_575)
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 0] = f;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 1] = f_95_;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 2] = f_96_;
	    ((Class55_Sub1) this).aBoolArray9847[0] = true;
	}
	if (i_97_ >= 0) {
	    i_97_ *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_97_ + 0] = f;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_97_ + 1] = f_95_;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_97_ + 2] = f_96_;
	    ((Class55_Sub1) this).aBoolArray9847[1] = true;
	}
    }
    
    void method1310(Class241_Sub23_Sub1 class241_sub23_sub1, float f,
		    float f_98_, float f_99_, float f_100_) {
	int i = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_101_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(1530858492)
	    != Class38.aClass38_485)
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 0] = f;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 1] = f_98_;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 2] = f_99_;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 3] = f_100_;
	    ((Class55_Sub1) this).aBoolArray9847[0] = true;
	}
	if (i_101_ >= 0) {
	    i_101_ *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_101_ + 0] = f;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_101_ + 1] = f_98_;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_101_ + 2] = f_99_;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_101_ + 3] = f_100_;
	    ((Class55_Sub1) this).aBoolArray9847[1] = true;
	}
    }
    
    void method1315(Class241_Sub23_Sub1 class241_sub23_sub1, float[] fs,
		    int i) {
	int i_102_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_103_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(-1095352889)
	    != Class38.aClass38_460)
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i_102_ >= 0)
	    method16164(i_102_, fs, i);
	if (i_103_ >= 0)
	    method16165(i_103_, fs, i);
    }
    
    void method16171() {
	if (((Class55_Sub1) this).aBoolArray9847[0]) {
	    for (int i = 0;
		 i < ((Class55_Sub1) this).aFloatArrayArray9838[0].length; i++)
		((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.anUnsafe9493
		    .putFloat
		    ((((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.aLong9491
		      + (long) (i * 4)),
		     ((Class55_Sub1) this).aFloatArrayArray9838[0][i]);
	    IDirect3DDevice.SetVertexShaderConstantF
		(((Class103_Sub3_Sub1)
		  ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839).aLong11097,
		 0, ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.aLong9491,
		 ((Class55_Sub1) this).aFloatArrayArray9838[0].length / 4);
	    ((Class55_Sub1) this).aBoolArray9847[0] = false;
	}
	if (((Class55_Sub1) this).aBoolArray9847[1]) {
	    for (int i = 0;
		 i < ((Class55_Sub1) this).aFloatArrayArray9838[1].length; i++)
		((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.anUnsafe9493
		    .putFloat
		    ((((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.aLong9491
		      + (long) (i * 4)),
		     ((Class55_Sub1) this).aFloatArrayArray9838[1][i]);
	    IDirect3DDevice.SetPixelShaderConstantF
		(((Class103_Sub3_Sub1)
		  ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839).aLong11097,
		 0, ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.aLong9491,
		 ((Class55_Sub1) this).aFloatArrayArray9838[1].length / 4);
	    ((Class55_Sub1) this).aBoolArray9847[1] = false;
	}
    }
    
    void method1341(Class241_Sub23_Sub1 class241_sub23_sub1, float[] fs,
		    int i) {
	int i_104_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_105_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(843840083) != Class38.aClass38_460)
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i_104_ >= 0)
	    method16164(i_104_, fs, i);
	if (i_105_ >= 0)
	    method16165(i_105_, fs, i);
    }
    
    void method1342(Class241_Sub23_Sub1 class241_sub23_sub1, float[] fs,
		    int i) {
	int i_106_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_107_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(-1799950028)
	    != Class38.aClass38_460)
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i_106_ >= 0)
	    method16164(i_106_, fs, i);
	if (i_107_ >= 0)
	    method16165(i_107_, fs, i);
    }
    
    void method1361(int i, float[] fs, int i_108_) {
	int i_109_ = i >> 16;
	int i_110_ = (i & 0xffff) * 4;
	System.arraycopy(fs, 0,
			 ((Class55_Sub1) this).aFloatArrayArray9838[i_109_],
			 i_110_, i_108_);
	((Class55_Sub1) this).aBoolArray9847[i_109_] = true;
    }
    
    void method1320(Class241_Sub23_Sub1 class241_sub23_sub1,
		    Class268 class268) {
	int i = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_111_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(1585169447)
	    != Class38.aClass38_501)
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i >= 0)
	    method16164(i, class268.method5282(aFloatArray9843), 16);
	if (i_111_ >= 0)
	    method16165(i_111_, class268.method5282(aFloatArray9843), 16);
    }
    
    void method1345(Class241_Sub23_Sub1 class241_sub23_sub1,
		    Class268 class268) {
	int i = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_112_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(-339585531)
	    != Class38.aClass38_501)
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i >= 0)
	    method16164(i, class268.method5282(aFloatArray9843), 16);
	if (i_112_ >= 0)
	    method16165(i_112_, class268.method5282(aFloatArray9843), 16);
    }
    
    void method1346(Class241_Sub23_Sub1 class241_sub23_sub1, int i,
		    Interface31 interface31) {
	((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.method15686(i);
	((Class55_Sub1) this).aClass103_Sub3_Sub1_9839
	    .method15856(interface31);
    }
    
    final void method16172(int i, float[] fs, int i_113_) {
	Class430.method7734(fs, 0,
			    ((Class55_Sub1) this).aFloatArrayArray9838[1],
			    i * 4, i_113_);
	((Class55_Sub1) this).aBoolArray9847[1] = true;
    }
    
    public boolean method1317() {
	if (((Class55_Sub1) this).aBool9841)
	    return true;
	((Class55_Sub1) this).aLong9848
	    = (((Class55_Sub1) this).aByteArray9844 == null ? 0L
	       : (IDirect3DDevice.CreateVertexShader
		  (((Class103_Sub3_Sub1)
		    ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839).aLong11097,
		   ((Class55_Sub1) this).aByteArray9844)));
	((Class55_Sub1) this).aLong9842
	    = (((Class55_Sub1) this).aByteArray9845 == null ? 0L
	       : (IDirect3DDevice.CreatePixelShader
		  (((Class103_Sub3_Sub1)
		    ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839).aLong11097,
		   ((Class55_Sub1) this).aByteArray9845)));
	if (((Class55_Sub1) this).aLong9848 == 0L
	    && ((Class55_Sub1) this).aLong9842 == 0L)
	    return false;
	int i = -1;
	for (int i_114_ = 0; i_114_ < ((Class55_Sub1) this)
					  .aClass116_Sub2_9849
					  .method2806(-439820743); i_114_++) {
	    if (((Class55_Sub1) this).aClass116_Sub2_9849
		    .method2898(i_114_, 1133181081)
		== this) {
		i = i_114_;
		break;
	    }
	}
	int i_115_
	    = ((Class55_Sub1) this).aClass116_Sub2_9849.method2809(-814863295);
	int i_116_
	    = ((Class55_Sub1) this).aClass116_Sub2_9849.method2909(-786132439);
	for (int i_117_ = 0; i_117_ < i_115_; i_117_++) {
	    Class241_Sub23_Sub1 class241_sub23_sub1
		= ((Class55_Sub1) this).aClass116_Sub2_9849
		      .method2842(i_117_, -1683955553);
	    class241_sub23_sub1.method17403(i);
	}
	for (int i_118_ = 0; i_118_ < i_116_; i_118_++) {
	    Class241_Sub23_Sub1 class241_sub23_sub1
		= ((Class55_Sub1) this).aClass116_Sub2_9849
		      .method2839(i_118_, 1606310035);
	    class241_sub23_sub1.method17403(i);
	}
	int i_119_ = 0;
	int i_120_ = 0;
	int i_121_
	    = ((Class55_Sub1) this).aClass116_Sub2_9849.method2813(this,
								   (byte) -2);
	for (int i_122_ = 0; i_122_ < i_115_ + i_116_; i_122_++) {
	    Class241_Sub23_Sub1_Sub1 class241_sub23_sub1_sub1
		= ((Class241_Sub23_Sub1_Sub1)
		   (i_122_ < i_115_
		    ? ((Class55_Sub1) this).aClass116_Sub2_9849
			  .method2842(i_122_, 592728094)
		    : ((Class55_Sub1) this).aClass116_Sub2_9849
			  .method2839(i_122_ - i_115_, 1141019549)));
	    Class38 class38 = class241_sub23_sub1_sub1.method17405(919622951);
	    int i_123_ = 1;
	    if (class38 == Class38.aClass38_460) {
		class38 = class241_sub23_sub1_sub1.method17411(-1947176057);
		i_123_ = class241_sub23_sub1_sub1.method17407(436702533);
	    }
	    switch (class38.anInt479 * 1413800313) {
	    default:
		i_123_ = 0;
		break;
	    case 1:
	    case 20:
	    case 56:
	    case 65:
		i_123_ *= 3;
		break;
	    case 13:
	    case 24:
	    case 60:
	    case 103:
		i_123_ *= 4;
		break;
	    case 17:
	    case 32:
	    case 67:
	    case 77:
	    case 99:
		break;
	    case 94:
	    case 104:
	    case 112:
	    case 121:
		i_123_ *= 2;
	    }
	    if ((((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1_sub1)
		 .anIntArray11284[i_121_])
		>= 0) {
		int i_124_
		    = ((((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1_sub1)
			.anIntArray11284[i_121_])
		       + i_123_);
		if (i_119_ < i_124_)
		    i_119_ = i_124_;
	    }
	    if ((((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1_sub1)
		 .anIntArray11283[i_121_])
		>= 0) {
		int i_125_
		    = ((((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1_sub1)
			.anIntArray11283[i_121_])
		       + i_123_);
		if (i_120_ < i_125_)
		    i_120_ = i_125_;
	    }
	}
	((Class55_Sub1) this).aFloatArrayArray9838[0] = new float[i_119_ * 4];
	((Class55_Sub1) this).aFloatArrayArray9838[1] = new float[i_120_ * 4];
	((Class55_Sub1) this).aBool9841 = true;
	return true;
    }
    
    void method1359(Class241_Sub23_Sub1 class241_sub23_sub1, float f) {
	int i = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_126_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(282915655) != Class38.aClass38_482
	    && (class241_sub23_sub1.method17405(89615686)
		!= Class38.aClass38_528))
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i] = f;
	    ((Class55_Sub1) this).aBoolArray9847[0] = true;
	}
	if (i_126_ >= 0) {
	    i_126_ *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_126_] = f;
	    ((Class55_Sub1) this).aBoolArray9847[1] = true;
	}
    }
    
    void method1351(int i, float f, float f_127_, float f_128_) {
	int i_129_ = i >> 16;
	int i_130_ = (i & 0xffff) * 4;
	((Class55_Sub1) this).aFloatArrayArray9838[i_129_][i_130_] = f;
	((Class55_Sub1) this).aFloatArrayArray9838[i_129_][i_130_ + 1]
	    = f_127_;
	((Class55_Sub1) this).aFloatArrayArray9838[i_129_][i_130_ + 2]
	    = f_128_;
	((Class55_Sub1) this).aBoolArray9847[i_129_] = true;
    }
    
    void method1343(Class241_Sub23_Sub1 class241_sub23_sub1,
		    Class268 class268) {
	int i = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_131_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(1211234111)
	    != Class38.aClass38_499)
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i >= 0)
	    method16164(i, class268.method5230(aFloatArray9843), 8);
	if (i_131_ >= 0)
	    method16165(i_131_, class268.method5230(aFloatArray9843), 8);
    }
    
    void method1352(int i, float f, float f_132_, float f_133_, float f_134_) {
	int i_135_ = i >> 16;
	int i_136_ = (i & 0xffff) * 4;
	((Class55_Sub1) this).aFloatArrayArray9838[i_135_][i_136_] = f;
	((Class55_Sub1) this).aFloatArrayArray9838[i_135_][i_136_ + 1]
	    = f_132_;
	((Class55_Sub1) this).aFloatArrayArray9838[i_135_][i_136_ + 2]
	    = f_133_;
	((Class55_Sub1) this).aFloatArrayArray9838[i_135_][i_136_ + 3]
	    = f_134_;
	((Class55_Sub1) this).aBoolArray9847[i_135_] = true;
    }
    
    void method1344(Class241_Sub23_Sub1 class241_sub23_sub1,
		    Class268 class268) {
	int i = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_137_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(920631788) != Class38.aClass38_501)
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i >= 0)
	    method16164(i, class268.method5282(aFloatArray9843), 16);
	if (i_137_ >= 0)
	    method16165(i_137_, class268.method5282(aFloatArray9843), 16);
    }
    
    void method1363(int i, float[] fs, int i_138_) {
	int i_139_ = i >> 16;
	int i_140_ = (i & 0xffff) * 4;
	System.arraycopy(fs, 0,
			 ((Class55_Sub1) this).aFloatArrayArray9838[i_139_],
			 i_140_, i_138_);
	((Class55_Sub1) this).aBoolArray9847[i_139_] = true;
    }
    
    void method1316(Class241_Sub23_Sub1 class241_sub23_sub1, float[] fs,
		    int i) {
	int i_141_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_142_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(41076817) != Class38.aClass38_460)
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i_141_ >= 0)
	    method16164(i_141_, fs, i);
	if (i_142_ >= 0)
	    method16165(i_142_, fs, i);
    }
    
    void method1356(int i, Class268 class268) {
	int i_143_ = i >> 16;
	int i_144_ = (i & 0xffff) * 4;
	System.arraycopy(class268.method5282(aFloatArray9843), 0,
			 ((Class55_Sub1) this).aFloatArrayArray9838[i_143_],
			 i_144_, 12);
	((Class55_Sub1) this).aBoolArray9847[i_143_] = true;
    }
    
    void method1357(int i, Class268 class268) {
	int i_145_ = i >> 16;
	int i_146_ = (i & 0xffff) * 4;
	System.arraycopy(class268.method5230(aFloatArray9843), 0,
			 ((Class55_Sub1) this).aFloatArrayArray9838[i_145_],
			 i_146_, 8);
	((Class55_Sub1) this).aBoolArray9847[i_145_] = true;
    }
    
    void method1358(int i, Class268 class268) {
	int i_147_ = i >> 16;
	int i_148_ = (i & 0xffff) * 4;
	System.arraycopy(class268.method5230(aFloatArray9843), 0,
			 ((Class55_Sub1) this).aFloatArrayArray9838[i_147_],
			 i_148_, 8);
	((Class55_Sub1) this).aBoolArray9847[i_147_] = true;
    }
    
    void method1309(int i, Class268 class268) {
	int i_149_ = i >> 16;
	int i_150_ = (i & 0xffff) * 4;
	System.arraycopy(class268.method5230(aFloatArray9843), 0,
			 ((Class55_Sub1) this).aFloatArrayArray9838[i_149_],
			 i_150_, 8);
	((Class55_Sub1) this).aBoolArray9847[i_149_] = true;
    }
    
    void method1355(int i, float f, float f_151_, float f_152_, float f_153_) {
	int i_154_ = i >> 16;
	int i_155_ = (i & 0xffff) * 4;
	((Class55_Sub1) this).aFloatArrayArray9838[i_154_][i_155_] = f;
	((Class55_Sub1) this).aFloatArrayArray9838[i_154_][i_155_ + 1]
	    = f_151_;
	((Class55_Sub1) this).aFloatArrayArray9838[i_154_][i_155_ + 2]
	    = f_152_;
	((Class55_Sub1) this).aFloatArrayArray9838[i_154_][i_155_ + 3]
	    = f_153_;
	((Class55_Sub1) this).aBoolArray9847[i_154_] = true;
    }
    
    void method1324(int i, Class268 class268) {
	int i_156_ = i >> 16;
	int i_157_ = (i & 0xffff) * 4;
	System.arraycopy(class268.method5282(aFloatArray9843), 0,
			 ((Class55_Sub1) this).aFloatArrayArray9838[i_156_],
			 i_157_, 16);
	((Class55_Sub1) this).aBoolArray9847[i_156_] = true;
    }
    
    void method1329(int i, float f, float f_158_, float f_159_, float f_160_) {
	int i_161_ = i >> 16;
	int i_162_ = (i & 0xffff) * 4;
	((Class55_Sub1) this).aFloatArrayArray9838[i_161_][i_162_] = f;
	((Class55_Sub1) this).aFloatArrayArray9838[i_161_][i_162_ + 1]
	    = f_158_;
	((Class55_Sub1) this).aFloatArrayArray9838[i_161_][i_162_ + 2]
	    = f_159_;
	((Class55_Sub1) this).aFloatArrayArray9838[i_161_][i_162_ + 3]
	    = f_160_;
	((Class55_Sub1) this).aBoolArray9847[i_161_] = true;
    }
    
    void method1333(Class241_Sub23_Sub1 class241_sub23_sub1, float f,
		    float f_163_) {
	int i = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17663();
	int i_164_
	    = ((Class241_Sub23_Sub1_Sub1) class241_sub23_sub1).method17667();
	if (class241_sub23_sub1.method17405(-873103982)
	    != Class38.aClass38_483)
	    throw new IllegalArgumentException_Sub1(class241_sub23_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 0] = f;
	    ((Class55_Sub1) this).aFloatArrayArray9838[0][i + 1] = f_163_;
	    ((Class55_Sub1) this).aBoolArray9847[0] = true;
	}
	if (i_164_ >= 0) {
	    i_164_ *= 4;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_164_ + 0] = f;
	    ((Class55_Sub1) this).aFloatArrayArray9838[1][i_164_ + 1] = f_163_;
	    ((Class55_Sub1) this).aBoolArray9847[1] = true;
	}
    }
    
    void method1354(int i, float f, float f_165_, float f_166_, float f_167_) {
	int i_168_ = i >> 16;
	int i_169_ = (i & 0xffff) * 4;
	((Class55_Sub1) this).aFloatArrayArray9838[i_168_][i_169_] = f;
	((Class55_Sub1) this).aFloatArrayArray9838[i_168_][i_169_ + 1]
	    = f_165_;
	((Class55_Sub1) this).aFloatArrayArray9838[i_168_][i_169_ + 2]
	    = f_166_;
	((Class55_Sub1) this).aFloatArrayArray9838[i_168_][i_169_ + 3]
	    = f_167_;
	((Class55_Sub1) this).aBoolArray9847[i_168_] = true;
    }
    
    void method1360(int i, float f, float f_170_, float f_171_) {
	int i_172_ = i >> 16;
	int i_173_ = (i & 0xffff) * 4;
	((Class55_Sub1) this).aFloatArrayArray9838[i_172_][i_173_] = f;
	((Class55_Sub1) this).aFloatArrayArray9838[i_172_][i_173_ + 1]
	    = f_170_;
	((Class55_Sub1) this).aFloatArrayArray9838[i_172_][i_173_ + 2]
	    = f_171_;
	((Class55_Sub1) this).aBoolArray9847[i_172_] = true;
    }
    
    void method16173() {
	if (((Class55_Sub1) this).aBoolArray9847[0]) {
	    for (int i = 0;
		 i < ((Class55_Sub1) this).aFloatArrayArray9838[0].length; i++)
		((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.anUnsafe9493
		    .putFloat
		    ((((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.aLong9491
		      + (long) (i * 4)),
		     ((Class55_Sub1) this).aFloatArrayArray9838[0][i]);
	    IDirect3DDevice.SetVertexShaderConstantF
		(((Class103_Sub3_Sub1)
		  ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839).aLong11097,
		 0, ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.aLong9491,
		 ((Class55_Sub1) this).aFloatArrayArray9838[0].length / 4);
	    ((Class55_Sub1) this).aBoolArray9847[0] = false;
	}
	if (((Class55_Sub1) this).aBoolArray9847[1]) {
	    for (int i = 0;
		 i < ((Class55_Sub1) this).aFloatArrayArray9838[1].length; i++)
		((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.anUnsafe9493
		    .putFloat
		    ((((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.aLong9491
		      + (long) (i * 4)),
		     ((Class55_Sub1) this).aFloatArrayArray9838[1][i]);
	    IDirect3DDevice.SetPixelShaderConstantF
		(((Class103_Sub3_Sub1)
		  ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839).aLong11097,
		 0, ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.aLong9491,
		 ((Class55_Sub1) this).aFloatArrayArray9838[1].length / 4);
	    ((Class55_Sub1) this).aBoolArray9847[1] = false;
	}
    }
    
    void method16174() {
	if (((Class55_Sub1) this).aBoolArray9847[0]) {
	    for (int i = 0;
		 i < ((Class55_Sub1) this).aFloatArrayArray9838[0].length; i++)
		((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.anUnsafe9493
		    .putFloat
		    ((((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.aLong9491
		      + (long) (i * 4)),
		     ((Class55_Sub1) this).aFloatArrayArray9838[0][i]);
	    IDirect3DDevice.SetVertexShaderConstantF
		(((Class103_Sub3_Sub1)
		  ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839).aLong11097,
		 0, ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.aLong9491,
		 ((Class55_Sub1) this).aFloatArrayArray9838[0].length / 4);
	    ((Class55_Sub1) this).aBoolArray9847[0] = false;
	}
	if (((Class55_Sub1) this).aBoolArray9847[1]) {
	    for (int i = 0;
		 i < ((Class55_Sub1) this).aFloatArrayArray9838[1].length; i++)
		((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.anUnsafe9493
		    .putFloat
		    ((((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.aLong9491
		      + (long) (i * 4)),
		     ((Class55_Sub1) this).aFloatArrayArray9838[1][i]);
	    IDirect3DDevice.SetPixelShaderConstantF
		(((Class103_Sub3_Sub1)
		  ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839).aLong11097,
		 0, ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.aLong9491,
		 ((Class55_Sub1) this).aFloatArrayArray9838[1].length / 4);
	    ((Class55_Sub1) this).aBoolArray9847[1] = false;
	}
    }
    
    void method16175() {
	if (((Class55_Sub1) this).aBoolArray9847[0]) {
	    for (int i = 0;
		 i < ((Class55_Sub1) this).aFloatArrayArray9838[0].length; i++)
		((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.anUnsafe9493
		    .putFloat
		    ((((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.aLong9491
		      + (long) (i * 4)),
		     ((Class55_Sub1) this).aFloatArrayArray9838[0][i]);
	    IDirect3DDevice.SetVertexShaderConstantF
		(((Class103_Sub3_Sub1)
		  ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839).aLong11097,
		 0, ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.aLong9491,
		 ((Class55_Sub1) this).aFloatArrayArray9838[0].length / 4);
	    ((Class55_Sub1) this).aBoolArray9847[0] = false;
	}
	if (((Class55_Sub1) this).aBoolArray9847[1]) {
	    for (int i = 0;
		 i < ((Class55_Sub1) this).aFloatArrayArray9838[1].length; i++)
		((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.anUnsafe9493
		    .putFloat
		    ((((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.aLong9491
		      + (long) (i * 4)),
		     ((Class55_Sub1) this).aFloatArrayArray9838[1][i]);
	    IDirect3DDevice.SetPixelShaderConstantF
		(((Class103_Sub3_Sub1)
		  ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839).aLong11097,
		 0, ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839.aLong9491,
		 ((Class55_Sub1) this).aFloatArrayArray9838[1].length / 4);
	    ((Class55_Sub1) this).aBoolArray9847[1] = false;
	}
    }
    
    void method16176() {
	if (((Class55_Sub1) this).aLong9848 != 0L) {
	    ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839
		.method17463(((Class55_Sub1) this).aLong9848);
	    ((Class55_Sub1) this).aLong9848 = 0L;
	}
	if (((Class55_Sub1) this).aLong9842 != 0L) {
	    ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839
		.method17463(((Class55_Sub1) this).aLong9842);
	    ((Class55_Sub1) this).aLong9842 = 0L;
	}
    }
    
    void method16177() {
	if (((Class55_Sub1) this).aLong9848 != 0L) {
	    ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839
		.method17463(((Class55_Sub1) this).aLong9848);
	    ((Class55_Sub1) this).aLong9848 = 0L;
	}
	if (((Class55_Sub1) this).aLong9842 != 0L) {
	    ((Class55_Sub1) this).aClass103_Sub3_Sub1_9839
		.method17463(((Class55_Sub1) this).aLong9842);
	    ((Class55_Sub1) this).aLong9842 = 0L;
	}
    }
    
    void method1364(int i, Class268 class268) {
	int i_174_ = i >> 16;
	int i_175_ = (i & 0xffff) * 4;
	System.arraycopy(class268.method5282(aFloatArray9843), 0,
			 ((Class55_Sub1) this).aFloatArrayArray9838[i_174_],
			 i_175_, 16);
	((Class55_Sub1) this).aBoolArray9847[i_174_] = true;
    }
    
    void method1365(int i, Class268 class268) {
	int i_176_ = i >> 16;
	int i_177_ = (i & 0xffff) * 4;
	System.arraycopy(class268.method5282(aFloatArray9843), 0,
			 ((Class55_Sub1) this).aFloatArrayArray9838[i_176_],
			 i_177_, 16);
	((Class55_Sub1) this).aBoolArray9847[i_176_] = true;
    }
    
    public void finalize() {
	method16170();
    }
}
