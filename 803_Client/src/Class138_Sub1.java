/* Class138_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class138_Sub1 extends Class138
{
    static float[] aFloatArray9876 = { 0.0F, 0.0F, 0.0F, 0.0F };
    static final char aChar9877 = '\001';
    static final char aChar9878 = '\0';
    Class137 aClass137_9879;
    Class142_Sub1 aClass142_Sub1_9880;
    Class144 aClass144_9881;
    
    void method3134(int i, int i_0_) {
	if ((i & 0x1) == 1) {
	    if (((Class144) ((Class138_Sub1) this).aClass144_9881).aBool1679) {
		((Class138_Sub1) this).aClass103_Sub1_1621.method15177
		    (((Class144) ((Class138_Sub1) this).aClass144_9881)
		     .aClass142_Sub3_1684);
		aFloatArray9876[0] = 0.0F;
		aFloatArray9876[1] = 0.0F;
		aFloatArray9876[2] = 0.0F;
		aFloatArray9876[3]
		    = (float) ((((Class103_Sub1)
				 ((Class138_Sub1) this).aClass103_Sub1_1621)
				.anInt9091)
			       % 4000) / 4000.0F;
		OpenGL.glTexGenfv(8194, 9473, aFloatArray9876, 0);
	    } else {
		int i_1_ = (((Class103_Sub1) (((Class138_Sub1) this)
					      .aClass103_Sub1_1621)).anInt9091
			    % 4000 * 16 / 4000);
		((Class138_Sub1) this).aClass103_Sub1_1621.method15177
		    (((Class144) ((Class138_Sub1) this).aClass144_9881)
		     .aClass142_Sub4Array1680[i_1_]);
	    }
	} else if (((Class144) ((Class138_Sub1) this).aClass144_9881)
		   .aBool1679) {
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub1) this).aClass144_9881)
		 .aClass142_Sub3_1684);
	    aFloatArray9876[0] = 0.0F;
	    aFloatArray9876[1] = 0.0F;
	    aFloatArray9876[2] = 0.0F;
	    aFloatArray9876[3] = 0.0F;
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray9876, 0);
	} else
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub1) this).aClass144_9881)
		 .aClass142_Sub4Array1680[0]);
    }
    
    boolean method3119() {
	return true;
    }
    
    boolean method3125() {
	return true;
    }
    
    void method3121(boolean bool) {
	((Class138_Sub1) this).aClass103_Sub1_1621.method15180(260, 8448);
    }
    
    void method3135() {
	((Class138_Sub1) this).aClass137_9879.method3113('\001');
	if ((((Class103_Sub1) ((Class138_Sub1) this).aClass103_Sub1_1621)
	     .anInt9172)
	    > 0) {
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15154(1.0F, 0.0F);
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15225(0);
	}
	((Class138_Sub1) this).aClass103_Sub1_1621.method15180(8448, 8448);
	OpenGL.glMatrixMode(5890);
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
    }
    
    void method3123(int i, int i_2_) {
	if ((i & 0x1) == 1) {
	    if (((Class144) ((Class138_Sub1) this).aClass144_9881).aBool1679) {
		((Class138_Sub1) this).aClass103_Sub1_1621.method15177
		    (((Class144) ((Class138_Sub1) this).aClass144_9881)
		     .aClass142_Sub3_1684);
		aFloatArray9876[0] = 0.0F;
		aFloatArray9876[1] = 0.0F;
		aFloatArray9876[2] = 0.0F;
		aFloatArray9876[3]
		    = (float) ((((Class103_Sub1)
				 ((Class138_Sub1) this).aClass103_Sub1_1621)
				.anInt9091)
			       % 4000) / 4000.0F;
		OpenGL.glTexGenfv(8194, 9473, aFloatArray9876, 0);
	    } else {
		int i_3_ = (((Class103_Sub1) (((Class138_Sub1) this)
					      .aClass103_Sub1_1621)).anInt9091
			    % 4000 * 16 / 4000);
		((Class138_Sub1) this).aClass103_Sub1_1621.method15177
		    (((Class144) ((Class138_Sub1) this).aClass144_9881)
		     .aClass142_Sub4Array1680[i_3_]);
	    }
	} else if (((Class144) ((Class138_Sub1) this).aClass144_9881)
		   .aBool1679) {
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub1) this).aClass144_9881)
		 .aClass142_Sub3_1684);
	    aFloatArray9876[0] = 0.0F;
	    aFloatArray9876[1] = 0.0F;
	    aFloatArray9876[2] = 0.0F;
	    aFloatArray9876[3] = 0.0F;
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray9876, 0);
	} else
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub1) this).aClass144_9881)
		 .aClass142_Sub4Array1680[0]);
    }
    
    void method3118(Class142 class142, int i) {
	/* empty */
    }
    
    void method3137(Class142 class142, int i) {
	/* empty */
    }
    
    Class138_Sub1(Class103_Sub1 class103_sub1, Class144 class144) {
	super(class103_sub1);
	((Class138_Sub1) this).aClass144_9881 = class144;
	method16207();
	((Class138_Sub1) this).aClass142_Sub1_9880
	    = new Class142_Sub1(((Class138_Sub1) this).aClass103_Sub1_1621,
				Class175.aClass175_2112,
				Class102.aClass102_1440, 2,
				new byte[] { 0, -1 }, Class175.aClass175_2112);
	((Class138_Sub1) this).aClass142_Sub1_9880.method16272(false);
    }
    
    void method3124(boolean bool) {
	if ((((Class103_Sub1) ((Class138_Sub1) this).aClass103_Sub1_1621)
	     .anInt9172)
	    > 0) {
	    float f = -0.5F / (float) (((Class103_Sub1) (((Class138_Sub1) this)
							 .aClass103_Sub1_1621))
				       .anInt9172);
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15225(1);
	    aFloatArray9876[0] = 0.0F;
	    aFloatArray9876[1] = 0.0F;
	    aFloatArray9876[2] = f;
	    aFloatArray9876[3]
		= (((Class103_Sub1) ((Class138_Sub1) this).aClass103_Sub1_1621)
		   .aFloat9174) * f + 0.25F;
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glTexGenfv(8192, 9474, aFloatArray9876, 0);
	    OpenGL.glPopMatrix();
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15154
		(0.5F,
		 (float) ((Class103_Sub1) (((Class138_Sub1) this)
					   .aClass103_Sub1_1621)).anInt9172);
	    ((Class138_Sub1) this).aClass103_Sub1_1621
		.method15177(((Class138_Sub1) this).aClass142_Sub1_9880);
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15225(0);
	}
	((Class138_Sub1) this).aClass137_9879.method3113('\0');
	OpenGL.glMatrixMode(5890);
	OpenGL.glPushMatrix();
	OpenGL.glScalef(0.25F, 0.25F, 1.0F);
	OpenGL.glMatrixMode(5888);
    }
    
    void method3131() {
	((Class138_Sub1) this).aClass137_9879.method3113('\001');
	if ((((Class103_Sub1) ((Class138_Sub1) this).aClass103_Sub1_1621)
	     .anInt9172)
	    > 0) {
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15154(1.0F, 0.0F);
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15225(0);
	}
	((Class138_Sub1) this).aClass103_Sub1_1621.method15180(8448, 8448);
	OpenGL.glMatrixMode(5890);
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
    }
    
    boolean method3127() {
	return true;
    }
    
    boolean method3128() {
	return true;
    }
    
    void method3129(boolean bool) {
	if ((((Class103_Sub1) ((Class138_Sub1) this).aClass103_Sub1_1621)
	     .anInt9172)
	    > 0) {
	    float f = -0.5F / (float) (((Class103_Sub1) (((Class138_Sub1) this)
							 .aClass103_Sub1_1621))
				       .anInt9172);
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15225(1);
	    aFloatArray9876[0] = 0.0F;
	    aFloatArray9876[1] = 0.0F;
	    aFloatArray9876[2] = f;
	    aFloatArray9876[3]
		= (((Class103_Sub1) ((Class138_Sub1) this).aClass103_Sub1_1621)
		   .aFloat9174) * f + 0.25F;
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glTexGenfv(8192, 9474, aFloatArray9876, 0);
	    OpenGL.glPopMatrix();
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15154
		(0.5F,
		 (float) ((Class103_Sub1) (((Class138_Sub1) this)
					   .aClass103_Sub1_1621)).anInt9172);
	    ((Class138_Sub1) this).aClass103_Sub1_1621
		.method15177(((Class138_Sub1) this).aClass142_Sub1_9880);
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15225(0);
	}
	((Class138_Sub1) this).aClass137_9879.method3113('\0');
	OpenGL.glMatrixMode(5890);
	OpenGL.glPushMatrix();
	OpenGL.glScalef(0.25F, 0.25F, 1.0F);
	OpenGL.glMatrixMode(5888);
    }
    
    void method3132(boolean bool) {
	((Class138_Sub1) this).aClass103_Sub1_1621.method15180(260, 8448);
    }
    
    void method3133(int i, int i_4_) {
	if ((i & 0x1) == 1) {
	    if (((Class144) ((Class138_Sub1) this).aClass144_9881).aBool1679) {
		((Class138_Sub1) this).aClass103_Sub1_1621.method15177
		    (((Class144) ((Class138_Sub1) this).aClass144_9881)
		     .aClass142_Sub3_1684);
		aFloatArray9876[0] = 0.0F;
		aFloatArray9876[1] = 0.0F;
		aFloatArray9876[2] = 0.0F;
		aFloatArray9876[3]
		    = (float) ((((Class103_Sub1)
				 ((Class138_Sub1) this).aClass103_Sub1_1621)
				.anInt9091)
			       % 4000) / 4000.0F;
		OpenGL.glTexGenfv(8194, 9473, aFloatArray9876, 0);
	    } else {
		int i_5_ = (((Class103_Sub1) (((Class138_Sub1) this)
					      .aClass103_Sub1_1621)).anInt9091
			    % 4000 * 16 / 4000);
		((Class138_Sub1) this).aClass103_Sub1_1621.method15177
		    (((Class144) ((Class138_Sub1) this).aClass144_9881)
		     .aClass142_Sub4Array1680[i_5_]);
	    }
	} else if (((Class144) ((Class138_Sub1) this).aClass144_9881)
		   .aBool1679) {
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub1) this).aClass144_9881)
		 .aClass142_Sub3_1684);
	    aFloatArray9876[0] = 0.0F;
	    aFloatArray9876[1] = 0.0F;
	    aFloatArray9876[2] = 0.0F;
	    aFloatArray9876[3] = 0.0F;
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray9876, 0);
	} else
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub1) this).aClass144_9881)
		 .aClass142_Sub4Array1680[0]);
    }
    
    void method3136() {
	((Class138_Sub1) this).aClass137_9879.method3113('\001');
	if ((((Class103_Sub1) ((Class138_Sub1) this).aClass103_Sub1_1621)
	     .anInt9172)
	    > 0) {
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15154(1.0F, 0.0F);
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15225(0);
	}
	((Class138_Sub1) this).aClass103_Sub1_1621.method15180(8448, 8448);
	OpenGL.glMatrixMode(5890);
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
    }
    
    void method3122(int i, int i_6_) {
	if ((i & 0x1) == 1) {
	    if (((Class144) ((Class138_Sub1) this).aClass144_9881).aBool1679) {
		((Class138_Sub1) this).aClass103_Sub1_1621.method15177
		    (((Class144) ((Class138_Sub1) this).aClass144_9881)
		     .aClass142_Sub3_1684);
		aFloatArray9876[0] = 0.0F;
		aFloatArray9876[1] = 0.0F;
		aFloatArray9876[2] = 0.0F;
		aFloatArray9876[3]
		    = (float) ((((Class103_Sub1)
				 ((Class138_Sub1) this).aClass103_Sub1_1621)
				.anInt9091)
			       % 4000) / 4000.0F;
		OpenGL.glTexGenfv(8194, 9473, aFloatArray9876, 0);
	    } else {
		int i_7_ = (((Class103_Sub1) (((Class138_Sub1) this)
					      .aClass103_Sub1_1621)).anInt9091
			    % 4000 * 16 / 4000);
		((Class138_Sub1) this).aClass103_Sub1_1621.method15177
		    (((Class144) ((Class138_Sub1) this).aClass144_9881)
		     .aClass142_Sub4Array1680[i_7_]);
	    }
	} else if (((Class144) ((Class138_Sub1) this).aClass144_9881)
		   .aBool1679) {
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub1) this).aClass144_9881)
		 .aClass142_Sub3_1684);
	    aFloatArray9876[0] = 0.0F;
	    aFloatArray9876[1] = 0.0F;
	    aFloatArray9876[2] = 0.0F;
	    aFloatArray9876[3] = 0.0F;
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray9876, 0);
	} else
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub1) this).aClass144_9881)
		 .aClass142_Sub4Array1680[0]);
    }
    
    void method16207() {
	((Class138_Sub1) this).aClass137_9879
	    = new Class137(((Class138_Sub1) this).aClass103_Sub1_1621, 2);
	((Class138_Sub1) this).aClass137_9879.method3112(0);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15225(1);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15180(7681, 260);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15181(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glEnable(3168);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15225(0);
	OpenGL.glTexEnvf(8960, 34163, 2.0F);
	if (((Class144) ((Class138_Sub1) this).aClass144_9881).aBool1679) {
	    OpenGL.glTexGeni(8194, 9472, 9217);
	    OpenGL.glTexGeni(8195, 9472, 9217);
	    OpenGL.glTexGenfv(8195, 9473,
			      new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
	    OpenGL.glEnable(3170);
	    OpenGL.glEnable(3171);
	}
	((Class138_Sub1) this).aClass137_9879.method3114();
	((Class138_Sub1) this).aClass137_9879.method3112(1);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15225(1);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15180(8448, 8448);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15181(0, 5890, 768);
	OpenGL.glDisable(3168);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15225(0);
	OpenGL.glTexEnvf(8960, 34163, 1.0F);
	if (((Class144) ((Class138_Sub1) this).aClass144_9881).aBool1679) {
	    OpenGL.glDisable(3170);
	    OpenGL.glDisable(3171);
	}
	((Class138_Sub1) this).aClass137_9879.method3114();
    }
    
    boolean method3126() {
	return true;
    }
    
    void method3130(int i, int i_8_) {
	if ((i & 0x1) == 1) {
	    if (((Class144) ((Class138_Sub1) this).aClass144_9881).aBool1679) {
		((Class138_Sub1) this).aClass103_Sub1_1621.method15177
		    (((Class144) ((Class138_Sub1) this).aClass144_9881)
		     .aClass142_Sub3_1684);
		aFloatArray9876[0] = 0.0F;
		aFloatArray9876[1] = 0.0F;
		aFloatArray9876[2] = 0.0F;
		aFloatArray9876[3]
		    = (float) ((((Class103_Sub1)
				 ((Class138_Sub1) this).aClass103_Sub1_1621)
				.anInt9091)
			       % 4000) / 4000.0F;
		OpenGL.glTexGenfv(8194, 9473, aFloatArray9876, 0);
	    } else {
		int i_9_ = (((Class103_Sub1) (((Class138_Sub1) this)
					      .aClass103_Sub1_1621)).anInt9091
			    % 4000 * 16 / 4000);
		((Class138_Sub1) this).aClass103_Sub1_1621.method15177
		    (((Class144) ((Class138_Sub1) this).aClass144_9881)
		     .aClass142_Sub4Array1680[i_9_]);
	    }
	} else if (((Class144) ((Class138_Sub1) this).aClass144_9881)
		   .aBool1679) {
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub1) this).aClass144_9881)
		 .aClass142_Sub3_1684);
	    aFloatArray9876[0] = 0.0F;
	    aFloatArray9876[1] = 0.0F;
	    aFloatArray9876[2] = 0.0F;
	    aFloatArray9876[3] = 0.0F;
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray9876, 0);
	} else
	    ((Class138_Sub1) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub1) this).aClass144_9881)
		 .aClass142_Sub4Array1680[0]);
    }
    
    void method3120(Class142 class142, int i) {
	/* empty */
    }
    
    void method16208() {
	((Class138_Sub1) this).aClass137_9879
	    = new Class137(((Class138_Sub1) this).aClass103_Sub1_1621, 2);
	((Class138_Sub1) this).aClass137_9879.method3112(0);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15225(1);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15180(7681, 260);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15181(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glEnable(3168);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15225(0);
	OpenGL.glTexEnvf(8960, 34163, 2.0F);
	if (((Class144) ((Class138_Sub1) this).aClass144_9881).aBool1679) {
	    OpenGL.glTexGeni(8194, 9472, 9217);
	    OpenGL.glTexGeni(8195, 9472, 9217);
	    OpenGL.glTexGenfv(8195, 9473,
			      new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
	    OpenGL.glEnable(3170);
	    OpenGL.glEnable(3171);
	}
	((Class138_Sub1) this).aClass137_9879.method3114();
	((Class138_Sub1) this).aClass137_9879.method3112(1);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15225(1);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15180(8448, 8448);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15181(0, 5890, 768);
	OpenGL.glDisable(3168);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15225(0);
	OpenGL.glTexEnvf(8960, 34163, 1.0F);
	if (((Class144) ((Class138_Sub1) this).aClass144_9881).aBool1679) {
	    OpenGL.glDisable(3170);
	    OpenGL.glDisable(3171);
	}
	((Class138_Sub1) this).aClass137_9879.method3114();
    }
    
    void method3138(Class142 class142, int i) {
	/* empty */
    }
    
    void method3139(Class142 class142, int i) {
	/* empty */
    }
    
    void method16209() {
	((Class138_Sub1) this).aClass137_9879
	    = new Class137(((Class138_Sub1) this).aClass103_Sub1_1621, 2);
	((Class138_Sub1) this).aClass137_9879.method3112(0);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15225(1);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15180(7681, 260);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15181(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glEnable(3168);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15225(0);
	OpenGL.glTexEnvf(8960, 34163, 2.0F);
	if (((Class144) ((Class138_Sub1) this).aClass144_9881).aBool1679) {
	    OpenGL.glTexGeni(8194, 9472, 9217);
	    OpenGL.glTexGeni(8195, 9472, 9217);
	    OpenGL.glTexGenfv(8195, 9473,
			      new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
	    OpenGL.glEnable(3170);
	    OpenGL.glEnable(3171);
	}
	((Class138_Sub1) this).aClass137_9879.method3114();
	((Class138_Sub1) this).aClass137_9879.method3112(1);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15225(1);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15180(8448, 8448);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15181(0, 5890, 768);
	OpenGL.glDisable(3168);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15225(0);
	OpenGL.glTexEnvf(8960, 34163, 1.0F);
	if (((Class144) ((Class138_Sub1) this).aClass144_9881).aBool1679) {
	    OpenGL.glDisable(3170);
	    OpenGL.glDisable(3171);
	}
	((Class138_Sub1) this).aClass137_9879.method3114();
    }
    
    void method16210() {
	((Class138_Sub1) this).aClass137_9879
	    = new Class137(((Class138_Sub1) this).aClass103_Sub1_1621, 2);
	((Class138_Sub1) this).aClass137_9879.method3112(0);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15225(1);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15180(7681, 260);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15181(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glEnable(3168);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15225(0);
	OpenGL.glTexEnvf(8960, 34163, 2.0F);
	if (((Class144) ((Class138_Sub1) this).aClass144_9881).aBool1679) {
	    OpenGL.glTexGeni(8194, 9472, 9217);
	    OpenGL.glTexGeni(8195, 9472, 9217);
	    OpenGL.glTexGenfv(8195, 9473,
			      new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
	    OpenGL.glEnable(3170);
	    OpenGL.glEnable(3171);
	}
	((Class138_Sub1) this).aClass137_9879.method3114();
	((Class138_Sub1) this).aClass137_9879.method3112(1);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15225(1);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15180(8448, 8448);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15181(0, 5890, 768);
	OpenGL.glDisable(3168);
	((Class138_Sub1) this).aClass103_Sub1_1621.method15225(0);
	OpenGL.glTexEnvf(8960, 34163, 1.0F);
	if (((Class144) ((Class138_Sub1) this).aClass144_9881).aBool1679) {
	    OpenGL.glDisable(3170);
	    OpenGL.glDisable(3171);
	}
	((Class138_Sub1) this).aClass137_9879.method3114();
    }
}
