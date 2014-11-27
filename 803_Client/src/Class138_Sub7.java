/* Class138_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class138_Sub7 extends Class138
{
    Class144 aClass144_9997;
    static final char aChar9998 = '\001';
    Class137 aClass137_9999;
    static final char aChar10000 = '\0';
    static float[] aFloatArray10001 = new float[4];
    
    void method3121(boolean bool) {
	/* empty */
    }
    
    boolean method3126() {
	return true;
    }
    
    void method3124(boolean bool) {
	((Class138_Sub7) this).aClass137_9999.method3113('\0');
	if (((Class144) ((Class138_Sub7) this).aClass144_9997).aBool1679) {
	    ((Class138_Sub7) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub7) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub7) this).aClass144_9997)
		 .aClass142_Sub3_1683);
	    ((Class138_Sub7) this).aClass103_Sub1_1621.method15225(0);
	}
    }
    
    void method3132(boolean bool) {
	/* empty */
    }
    
    void method3135() {
	((Class138_Sub7) this).aClass137_9999.method3113('\001');
	((Class138_Sub7) this).aClass103_Sub1_1621.method15225(1);
	((Class138_Sub7) this).aClass103_Sub1_1621.method15177(null);
	((Class138_Sub7) this).aClass103_Sub1_1621.method15225(0);
    }
    
    void method3123(int i, int i_0_) {
	float f = -5.0E-4F * (float) ((i & 0x3) + 1);
	float f_1_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
	float f_2_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	((Class138_Sub7) this).aClass103_Sub1_1621.method15225(1);
	if (bool) {
	    aFloatArray10001[0] = f_2_;
	    aFloatArray10001[1] = 0.0F;
	    aFloatArray10001[2] = 0.0F;
	    aFloatArray10001[3] = 0.0F;
	} else {
	    aFloatArray10001[0] = 0.0F;
	    aFloatArray10001[1] = 0.0F;
	    aFloatArray10001[2] = f_2_;
	    aFloatArray10001[3] = 0.0F;
	}
	OpenGL.glTexGenfv(8192, 9474, aFloatArray10001, 0);
	aFloatArray10001[0] = 0.0F;
	aFloatArray10001[1] = f_2_;
	aFloatArray10001[2] = 0.0F;
	aFloatArray10001[3] = (float) (((Class103_Sub1) (((Class138_Sub7) this)
							 .aClass103_Sub1_1621))
				       .anInt9091) * f % 1.0F;
	OpenGL.glTexGenfv(8193, 9474, aFloatArray10001, 0);
	if (!((Class144) ((Class138_Sub7) this).aClass144_9997).aBool1679) {
	    int i_3_
		= (int) (f_1_
			 * (float) (((Class103_Sub1) (((Class138_Sub7) this)
						      .aClass103_Sub1_1621))
				    .anInt9091)
			 * 16.0F);
	    ((Class138_Sub7) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub7) this).aClass144_9997)
		 .aClass142_Sub4Array1682[i_3_ % 16]);
	} else {
	    aFloatArray10001[0] = 0.0F;
	    aFloatArray10001[1] = 0.0F;
	    aFloatArray10001[2] = 0.0F;
	    aFloatArray10001[3]
		= ((float) ((Class103_Sub1) (((Class138_Sub7) this)
					     .aClass103_Sub1_1621)).anInt9091
		   * f_1_ % 1.0F);
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray10001, 0);
	}
	((Class138_Sub7) this).aClass103_Sub1_1621.method15225(0);
    }
    
    void method3118(Class142 class142, int i) {
	((Class138_Sub7) this).aClass103_Sub1_1621.method15177(class142);
	((Class138_Sub7) this).aClass103_Sub1_1621.method15178(i);
    }
    
    boolean method3119() {
	return true;
    }
    
    boolean method3125() {
	return true;
    }
    
    void method3129(boolean bool) {
	((Class138_Sub7) this).aClass137_9999.method3113('\0');
	if (((Class144) ((Class138_Sub7) this).aClass144_9997).aBool1679) {
	    ((Class138_Sub7) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub7) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub7) this).aClass144_9997)
		 .aClass142_Sub3_1683);
	    ((Class138_Sub7) this).aClass103_Sub1_1621.method15225(0);
	}
    }
    
    boolean method3127() {
	return true;
    }
    
    void method3136() {
	((Class138_Sub7) this).aClass137_9999.method3113('\001');
	((Class138_Sub7) this).aClass103_Sub1_1621.method15225(1);
	((Class138_Sub7) this).aClass103_Sub1_1621.method15177(null);
	((Class138_Sub7) this).aClass103_Sub1_1621.method15225(0);
    }
    
    boolean method3128() {
	return true;
    }
    
    void method3120(Class142 class142, int i) {
	((Class138_Sub7) this).aClass103_Sub1_1621.method15177(class142);
	((Class138_Sub7) this).aClass103_Sub1_1621.method15178(i);
    }
    
    Class138_Sub7(Class103_Sub1 class103_sub1, Class144 class144) {
	super(class103_sub1);
	((Class138_Sub7) this).aClass144_9997 = class144;
	((Class138_Sub7) this).aClass137_9999 = new Class137(class103_sub1, 2);
	((Class138_Sub7) this).aClass137_9999.method3112(0);
	((Class138_Sub7) this).aClass103_Sub1_1621.method15225(1);
	if (((Class144) ((Class138_Sub7) this).aClass144_9997).aBool1679) {
	    OpenGL.glTexGeni(8194, 9472, 9217);
	    OpenGL.glEnable(3170);
	}
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	((Class138_Sub7) this).aClass103_Sub1_1621.method15225(0);
	((Class138_Sub7) this).aClass137_9999.method3114();
	((Class138_Sub7) this).aClass137_9999.method3112(1);
	((Class138_Sub7) this).aClass103_Sub1_1621.method15225(1);
	if (((Class144) ((Class138_Sub7) this).aClass144_9997).aBool1679)
	    OpenGL.glDisable(3170);
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	((Class138_Sub7) this).aClass103_Sub1_1621.method15225(0);
	((Class138_Sub7) this).aClass137_9999.method3114();
    }
    
    void method3131() {
	((Class138_Sub7) this).aClass137_9999.method3113('\001');
	((Class138_Sub7) this).aClass103_Sub1_1621.method15225(1);
	((Class138_Sub7) this).aClass103_Sub1_1621.method15177(null);
	((Class138_Sub7) this).aClass103_Sub1_1621.method15225(0);
    }
    
    void method3122(int i, int i_4_) {
	float f = -5.0E-4F * (float) ((i & 0x3) + 1);
	float f_5_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
	float f_6_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	((Class138_Sub7) this).aClass103_Sub1_1621.method15225(1);
	if (bool) {
	    aFloatArray10001[0] = f_6_;
	    aFloatArray10001[1] = 0.0F;
	    aFloatArray10001[2] = 0.0F;
	    aFloatArray10001[3] = 0.0F;
	} else {
	    aFloatArray10001[0] = 0.0F;
	    aFloatArray10001[1] = 0.0F;
	    aFloatArray10001[2] = f_6_;
	    aFloatArray10001[3] = 0.0F;
	}
	OpenGL.glTexGenfv(8192, 9474, aFloatArray10001, 0);
	aFloatArray10001[0] = 0.0F;
	aFloatArray10001[1] = f_6_;
	aFloatArray10001[2] = 0.0F;
	aFloatArray10001[3] = (float) (((Class103_Sub1) (((Class138_Sub7) this)
							 .aClass103_Sub1_1621))
				       .anInt9091) * f % 1.0F;
	OpenGL.glTexGenfv(8193, 9474, aFloatArray10001, 0);
	if (!((Class144) ((Class138_Sub7) this).aClass144_9997).aBool1679) {
	    int i_7_
		= (int) (f_5_
			 * (float) (((Class103_Sub1) (((Class138_Sub7) this)
						      .aClass103_Sub1_1621))
				    .anInt9091)
			 * 16.0F);
	    ((Class138_Sub7) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub7) this).aClass144_9997)
		 .aClass142_Sub4Array1682[i_7_ % 16]);
	} else {
	    aFloatArray10001[0] = 0.0F;
	    aFloatArray10001[1] = 0.0F;
	    aFloatArray10001[2] = 0.0F;
	    aFloatArray10001[3]
		= ((float) ((Class103_Sub1) (((Class138_Sub7) this)
					     .aClass103_Sub1_1621)).anInt9091
		   * f_5_ % 1.0F);
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray10001, 0);
	}
	((Class138_Sub7) this).aClass103_Sub1_1621.method15225(0);
    }
    
    void method3133(int i, int i_8_) {
	float f = -5.0E-4F * (float) ((i & 0x3) + 1);
	float f_9_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
	float f_10_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	((Class138_Sub7) this).aClass103_Sub1_1621.method15225(1);
	if (bool) {
	    aFloatArray10001[0] = f_10_;
	    aFloatArray10001[1] = 0.0F;
	    aFloatArray10001[2] = 0.0F;
	    aFloatArray10001[3] = 0.0F;
	} else {
	    aFloatArray10001[0] = 0.0F;
	    aFloatArray10001[1] = 0.0F;
	    aFloatArray10001[2] = f_10_;
	    aFloatArray10001[3] = 0.0F;
	}
	OpenGL.glTexGenfv(8192, 9474, aFloatArray10001, 0);
	aFloatArray10001[0] = 0.0F;
	aFloatArray10001[1] = f_10_;
	aFloatArray10001[2] = 0.0F;
	aFloatArray10001[3] = (float) (((Class103_Sub1) (((Class138_Sub7) this)
							 .aClass103_Sub1_1621))
				       .anInt9091) * f % 1.0F;
	OpenGL.glTexGenfv(8193, 9474, aFloatArray10001, 0);
	if (!((Class144) ((Class138_Sub7) this).aClass144_9997).aBool1679) {
	    int i_11_
		= (int) (f_9_
			 * (float) (((Class103_Sub1) (((Class138_Sub7) this)
						      .aClass103_Sub1_1621))
				    .anInt9091)
			 * 16.0F);
	    ((Class138_Sub7) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub7) this).aClass144_9997)
		 .aClass142_Sub4Array1682[i_11_ % 16]);
	} else {
	    aFloatArray10001[0] = 0.0F;
	    aFloatArray10001[1] = 0.0F;
	    aFloatArray10001[2] = 0.0F;
	    aFloatArray10001[3]
		= ((float) ((Class103_Sub1) (((Class138_Sub7) this)
					     .aClass103_Sub1_1621)).anInt9091
		   * f_9_ % 1.0F);
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray10001, 0);
	}
	((Class138_Sub7) this).aClass103_Sub1_1621.method15225(0);
    }
    
    void method3134(int i, int i_12_) {
	float f = -5.0E-4F * (float) ((i & 0x3) + 1);
	float f_13_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
	float f_14_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	((Class138_Sub7) this).aClass103_Sub1_1621.method15225(1);
	if (bool) {
	    aFloatArray10001[0] = f_14_;
	    aFloatArray10001[1] = 0.0F;
	    aFloatArray10001[2] = 0.0F;
	    aFloatArray10001[3] = 0.0F;
	} else {
	    aFloatArray10001[0] = 0.0F;
	    aFloatArray10001[1] = 0.0F;
	    aFloatArray10001[2] = f_14_;
	    aFloatArray10001[3] = 0.0F;
	}
	OpenGL.glTexGenfv(8192, 9474, aFloatArray10001, 0);
	aFloatArray10001[0] = 0.0F;
	aFloatArray10001[1] = f_14_;
	aFloatArray10001[2] = 0.0F;
	aFloatArray10001[3] = (float) (((Class103_Sub1) (((Class138_Sub7) this)
							 .aClass103_Sub1_1621))
				       .anInt9091) * f % 1.0F;
	OpenGL.glTexGenfv(8193, 9474, aFloatArray10001, 0);
	if (!((Class144) ((Class138_Sub7) this).aClass144_9997).aBool1679) {
	    int i_15_
		= (int) (f_13_
			 * (float) (((Class103_Sub1) (((Class138_Sub7) this)
						      .aClass103_Sub1_1621))
				    .anInt9091)
			 * 16.0F);
	    ((Class138_Sub7) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub7) this).aClass144_9997)
		 .aClass142_Sub4Array1682[i_15_ % 16]);
	} else {
	    aFloatArray10001[0] = 0.0F;
	    aFloatArray10001[1] = 0.0F;
	    aFloatArray10001[2] = 0.0F;
	    aFloatArray10001[3]
		= ((float) ((Class103_Sub1) (((Class138_Sub7) this)
					     .aClass103_Sub1_1621)).anInt9091
		   * f_13_ % 1.0F);
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray10001, 0);
	}
	((Class138_Sub7) this).aClass103_Sub1_1621.method15225(0);
    }
    
    void method3130(int i, int i_16_) {
	float f = -5.0E-4F * (float) ((i & 0x3) + 1);
	float f_17_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
	float f_18_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	((Class138_Sub7) this).aClass103_Sub1_1621.method15225(1);
	if (bool) {
	    aFloatArray10001[0] = f_18_;
	    aFloatArray10001[1] = 0.0F;
	    aFloatArray10001[2] = 0.0F;
	    aFloatArray10001[3] = 0.0F;
	} else {
	    aFloatArray10001[0] = 0.0F;
	    aFloatArray10001[1] = 0.0F;
	    aFloatArray10001[2] = f_18_;
	    aFloatArray10001[3] = 0.0F;
	}
	OpenGL.glTexGenfv(8192, 9474, aFloatArray10001, 0);
	aFloatArray10001[0] = 0.0F;
	aFloatArray10001[1] = f_18_;
	aFloatArray10001[2] = 0.0F;
	aFloatArray10001[3] = (float) (((Class103_Sub1) (((Class138_Sub7) this)
							 .aClass103_Sub1_1621))
				       .anInt9091) * f % 1.0F;
	OpenGL.glTexGenfv(8193, 9474, aFloatArray10001, 0);
	if (!((Class144) ((Class138_Sub7) this).aClass144_9997).aBool1679) {
	    int i_19_
		= (int) (f_17_
			 * (float) (((Class103_Sub1) (((Class138_Sub7) this)
						      .aClass103_Sub1_1621))
				    .anInt9091)
			 * 16.0F);
	    ((Class138_Sub7) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub7) this).aClass144_9997)
		 .aClass142_Sub4Array1682[i_19_ % 16]);
	} else {
	    aFloatArray10001[0] = 0.0F;
	    aFloatArray10001[1] = 0.0F;
	    aFloatArray10001[2] = 0.0F;
	    aFloatArray10001[3]
		= ((float) ((Class103_Sub1) (((Class138_Sub7) this)
					     .aClass103_Sub1_1621)).anInt9091
		   * f_17_ % 1.0F);
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray10001, 0);
	}
	((Class138_Sub7) this).aClass103_Sub1_1621.method15225(0);
    }
    
    void method3137(Class142 class142, int i) {
	((Class138_Sub7) this).aClass103_Sub1_1621.method15177(class142);
	((Class138_Sub7) this).aClass103_Sub1_1621.method15178(i);
    }
    
    void method3138(Class142 class142, int i) {
	((Class138_Sub7) this).aClass103_Sub1_1621.method15177(class142);
	((Class138_Sub7) this).aClass103_Sub1_1621.method15178(i);
    }
    
    void method3139(Class142 class142, int i) {
	((Class138_Sub7) this).aClass103_Sub1_1621.method15177(class142);
	((Class138_Sub7) this).aClass103_Sub1_1621.method15178(i);
    }
}
