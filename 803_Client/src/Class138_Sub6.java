/* Class138_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class138_Sub6 extends Class138
{
    Class137 aClass137_9949;
    static final float aFloat9950 = 26.0F;
    static final int anInt9951 = 128;
    static final int anInt9952 = 24;
    static final int anInt9953 = 128;
    static final float aFloat9954 = -12.0F;
    static final float aFloat9955 = 0.0F;
    static final char aChar9956 = '\0';
    boolean aBool9957 = false;
    static final char aChar9958 = '\001';
    boolean aBool9959;
    static final int anInt9960 = 5;
    Class142_Sub2[] aClass142_Sub2Array9961;
    
    void method3139(Class142 class142, int i) {
	((Class138_Sub6) this).aClass103_Sub1_1621.method15177(class142);
	((Class138_Sub6) this).aClass103_Sub1_1621.method15178(i);
    }
    
    boolean method3119() {
	return true;
    }
    
    void method16238() {
	((Class138_Sub6) this).aClass137_9949
	    = new Class137(((Class138_Sub6) this).aClass103_Sub1_1621, 2);
	((Class138_Sub6) this).aClass137_9949.method3112(0);
	((Class138_Sub6) this).aClass103_Sub1_1621.method15225(1);
	OpenGL.glTexGeni(8192, 9472, 34065);
	OpenGL.glTexGeni(8193, 9472, 34065);
	OpenGL.glTexGeni(8194, 9472, 34065);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glEnable(3170);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glRotatef(26.0F, 1.0F, 0.0F, 0.0F);
	OpenGL.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
	OpenGL.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
	OpenGL.glMatrixMode(5888);
	if (!((Class138_Sub6) this).aBool9959) {
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15180(7681, 8448);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15181(0, 34168,
								   768);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15225(2);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15180(260, 7681);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15181(0, 34168,
								   768);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15181(1, 34168,
								   770);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15352(0, 34167,
								   770);
	} else {
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15180(260, 7681);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15181(0, 5890,
								   770);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15352(0, 34167,
								   770);
	}
	((Class138_Sub6) this).aClass103_Sub1_1621.method15225(0);
	((Class138_Sub6) this).aClass137_9949.method3114();
	((Class138_Sub6) this).aClass137_9949.method3112(1);
	((Class138_Sub6) this).aClass103_Sub1_1621.method15225(1);
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	OpenGL.glDisable(3170);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	if (!((Class138_Sub6) this).aBool9959) {
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15180(8448, 8448);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15181(0, 5890,
								   768);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15225(2);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15180(8448, 8448);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15181(0, 5890,
								   768);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15181(1, 34168,
								   768);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15352(0, 5890,
								   770);
	} else {
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15180(8448, 8448);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15181(0, 5890,
								   768);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15352(0, 5890,
								   770);
	}
	((Class138_Sub6) this).aClass103_Sub1_1621.method15225(0);
	((Class138_Sub6) this).aClass137_9949.method3114();
    }
    
    Class138_Sub6(Class103_Sub1 class103_sub1) {
	super(class103_sub1);
	if (((Class103_Sub1) class103_sub1).aBool9209) {
	    byte[][] is = new byte[6][16384];
	    byte[][] is_0_ = new byte[6][16384];
	    byte[][] is_1_ = new byte[6][16384];
	    int i = 0;
	    Class287 class287 = new Class287(0.0F, -1.0F, 0.0F);
	    for (int i_2_ = 0; i_2_ < 128; i_2_++) {
		for (int i_3_ = 0; i_3_ < 128; i_3_++) {
		    float f = 2.0F * (float) i_3_ / 128.0F - 1.0F;
		    float f_4_ = 2.0F * (float) i_2_ / 128.0F - 1.0F;
		    float f_5_
			= (float) (1.0 / Math.sqrt((double) (f * f + 1.0F
							     + f_4_ * f_4_)));
		    f *= f_5_;
		    f_4_ *= f_5_;
		    for (int i_6_ = 0; i_6_ < 6; i_6_++) {
			Class287 class287_7_;
			if (i_6_ == 0)
			    class287_7_ = new Class287(-f_5_, -f, f_4_);
			else if (i_6_ == 1)
			    class287_7_ = new Class287(f_5_, f, f_4_);
			else if (i_6_ == 2)
			    class287_7_ = new Class287(-f, f_4_, -f_5_);
			else if (i_6_ == 3)
			    class287_7_ = new Class287(-f, -f_4_, f_5_);
			else if (i_6_ == 4)
			    class287_7_ = new Class287(f, f_5_, -f_4_);
			else
			    class287_7_ = new Class287(f, -f_5_, f_4_);
			float f_8_ = class287_7_.method5579(class287);
			f_8_ = Math.max(0.0F, Math.min(1.0F, f_8_));
			int i_9_;
			int i_10_;
			int i_11_;
			if (f_8_ > 0.0F) {
			    i_11_
				= Math.min(255, (int) (Math.pow((double) f_8_,
								128.0)
						       * 400.0));
			    i_10_
				= Math.min(255,
					   (int) (Math.pow((double) f_8_, 24.0)
						  * 400.0));
			    i_9_ = Math.min(255,
					    (int) (Math.pow((double) f_8_, 5.0)
						   * 400.0));
			} else {
			    i_9_ = 0;
			    i_10_ = 0;
			    i_11_ = 0;
			}
			is_0_[i_6_][i] = (byte) i_11_;
			is_1_[i_6_][i] = (byte) i_10_;
			is[i_6_][i] = (byte) i_9_;
		    }
		    i++;
		}
	    }
	    ((Class138_Sub6) this).aClass142_Sub2Array9961
		= new Class142_Sub2[3];
	    ((Class138_Sub6) this).aClass142_Sub2Array9961[0]
		= new Class142_Sub2(((Class138_Sub6) this).aClass103_Sub1_1621,
				    Class175.aClass175_2112,
				    Class102.aClass102_1440, 128, false, is_0_,
				    Class175.aClass175_2112);
	    ((Class138_Sub6) this).aClass142_Sub2Array9961[1]
		= new Class142_Sub2(((Class138_Sub6) this).aClass103_Sub1_1621,
				    Class175.aClass175_2112,
				    Class102.aClass102_1440, 128, false, is_1_,
				    Class175.aClass175_2112);
	    ((Class138_Sub6) this).aClass142_Sub2Array9961[2]
		= new Class142_Sub2(((Class138_Sub6) this).aClass103_Sub1_1621,
				    Class175.aClass175_2112,
				    Class102.aClass102_1440, 128, false, is,
				    Class175.aClass175_2112);
	    method16238();
	}
    }
    
    void method3122(int i, int i_12_) {
	if (((Class138_Sub6) this).aBool9957) {
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15177
		(((Class138_Sub6) this).aClass142_Sub2Array9961[i - 1]);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15225(0);
	}
    }
    
    void method3135() {
	if (((Class138_Sub6) this).aBool9957) {
	    if (!((Class138_Sub6) this).aBool9959) {
		((Class138_Sub6) this).aClass103_Sub1_1621.method15225(2);
		((Class138_Sub6) this).aClass103_Sub1_1621.method15177(null);
	    }
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15225(0);
	    ((Class138_Sub6) this).aClass137_9949.method3113('\001');
	    ((Class138_Sub6) this).aBool9957 = false;
	} else
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15352(0, 5890,
								   770);
	((Class138_Sub6) this).aClass103_Sub1_1621.method15180(8448, 8448);
    }
    
    void method3123(int i, int i_13_) {
	if (((Class138_Sub6) this).aBool9957) {
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15177
		(((Class138_Sub6) this).aClass142_Sub2Array9961[i - 1]);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15225(0);
	}
    }
    
    void method3121(boolean bool) {
	((Class138_Sub6) this).aClass103_Sub1_1621.method15180(8448, 7681);
    }
    
    boolean method3125() {
	return true;
    }
    
    boolean method3126() {
	return true;
    }
    
    boolean method3127() {
	return true;
    }
    
    boolean method3128() {
	return true;
    }
    
    void method3133(int i, int i_14_) {
	if (((Class138_Sub6) this).aBool9957) {
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15177
		(((Class138_Sub6) this).aClass142_Sub2Array9961[i - 1]);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15225(0);
	}
    }
    
    void method3132(boolean bool) {
	((Class138_Sub6) this).aClass103_Sub1_1621.method15180(8448, 7681);
    }
    
    void method3118(Class142 class142, int i) {
	((Class138_Sub6) this).aClass103_Sub1_1621.method15177(class142);
	((Class138_Sub6) this).aClass103_Sub1_1621.method15178(i);
    }
    
    void method3131() {
	if (((Class138_Sub6) this).aBool9957) {
	    if (!((Class138_Sub6) this).aBool9959) {
		((Class138_Sub6) this).aClass103_Sub1_1621.method15225(2);
		((Class138_Sub6) this).aClass103_Sub1_1621.method15177(null);
	    }
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15225(0);
	    ((Class138_Sub6) this).aClass137_9949.method3113('\001');
	    ((Class138_Sub6) this).aBool9957 = false;
	} else
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15352(0, 5890,
								   770);
	((Class138_Sub6) this).aClass103_Sub1_1621.method15180(8448, 8448);
    }
    
    void method3129(boolean bool) {
	if (((Class138_Sub6) this).aClass137_9949 != null && bool) {
	    if (!((Class138_Sub6) this).aBool9959) {
		((Class138_Sub6) this).aClass103_Sub1_1621.method15225(2);
		((Class138_Sub6) this).aClass103_Sub1_1621.method15177
		    (((Class103_Sub1)
		      ((Class138_Sub6) this).aClass103_Sub1_1621)
		     .aClass142_Sub4_9190);
		((Class138_Sub6) this).aClass103_Sub1_1621.method15225(0);
	    }
	    ((Class138_Sub6) this).aClass137_9949.method3113('\0');
	    ((Class138_Sub6) this).aBool9957 = true;
	} else
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15352(0, 34168,
								   770);
    }
    
    void method3136() {
	if (((Class138_Sub6) this).aBool9957) {
	    if (!((Class138_Sub6) this).aBool9959) {
		((Class138_Sub6) this).aClass103_Sub1_1621.method15225(2);
		((Class138_Sub6) this).aClass103_Sub1_1621.method15177(null);
	    }
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15225(0);
	    ((Class138_Sub6) this).aClass137_9949.method3113('\001');
	    ((Class138_Sub6) this).aBool9957 = false;
	} else
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15352(0, 5890,
								   770);
	((Class138_Sub6) this).aClass103_Sub1_1621.method15180(8448, 8448);
    }
    
    void method3134(int i, int i_15_) {
	if (((Class138_Sub6) this).aBool9957) {
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15177
		(((Class138_Sub6) this).aClass142_Sub2Array9961[i - 1]);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15225(0);
	}
    }
    
    void method3130(int i, int i_16_) {
	if (((Class138_Sub6) this).aBool9957) {
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15177
		(((Class138_Sub6) this).aClass142_Sub2Array9961[i - 1]);
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15225(0);
	}
    }
    
    void method3137(Class142 class142, int i) {
	((Class138_Sub6) this).aClass103_Sub1_1621.method15177(class142);
	((Class138_Sub6) this).aClass103_Sub1_1621.method15178(i);
    }
    
    void method3124(boolean bool) {
	if (((Class138_Sub6) this).aClass137_9949 != null && bool) {
	    if (!((Class138_Sub6) this).aBool9959) {
		((Class138_Sub6) this).aClass103_Sub1_1621.method15225(2);
		((Class138_Sub6) this).aClass103_Sub1_1621.method15177
		    (((Class103_Sub1)
		      ((Class138_Sub6) this).aClass103_Sub1_1621)
		     .aClass142_Sub4_9190);
		((Class138_Sub6) this).aClass103_Sub1_1621.method15225(0);
	    }
	    ((Class138_Sub6) this).aClass137_9949.method3113('\0');
	    ((Class138_Sub6) this).aBool9957 = true;
	} else
	    ((Class138_Sub6) this).aClass103_Sub1_1621.method15352(0, 34168,
								   770);
    }
    
    void method3138(Class142 class142, int i) {
	((Class138_Sub6) this).aClass103_Sub1_1621.method15177(class142);
	((Class138_Sub6) this).aClass103_Sub1_1621.method15178(i);
    }
    
    void method3120(Class142 class142, int i) {
	((Class138_Sub6) this).aClass103_Sub1_1621.method15177(class142);
	((Class138_Sub6) this).aClass103_Sub1_1621.method15178(i);
    }
}
