/* Class138_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class138_Sub9 extends Class138
{
    static final char aChar10026 = '\0';
    static final char aChar10027 = '\001';
    Class137 aClass137_10028;
    boolean aBool10029 = false;
    
    void method3118(Class142 class142, int i) {
	((Class138_Sub9) this).aClass103_Sub1_1621.method15177(class142);
	((Class138_Sub9) this).aClass103_Sub1_1621.method15178(i);
    }
    
    boolean method3119() {
	return true;
    }
    
    void method3124(boolean bool) {
	Class142_Sub2 class142_sub2
	    = ((Class138_Sub9) this).aClass103_Sub1_1621.method15307();
	if (((Class138_Sub9) this).aClass137_10028 != null
	    && class142_sub2 != null && bool) {
	    ((Class138_Sub9) this).aClass137_10028.method3113('\0');
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub9) this).aClass103_Sub1_1621
		.method15177(class142_sub2);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf((((Class103_Sub1)
				   ((Class138_Sub9) this).aClass103_Sub1_1621)
				      .aClass268_9121.method5227
				  (((Class103_Sub1)
				    ((Class138_Sub9) this).aClass103_Sub1_1621)
				   .aFloatArray9138)),
				 0);
	    OpenGL.glScalef(1.0F, -1.0F, -1.0F);
	    OpenGL.glMatrixMode(5888);
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15225(0);
	    ((Class138_Sub9) this).aBool10029 = true;
	} else
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15352(0, 34168,
								   770);
    }
    
    boolean method3126() {
	return true;
    }
    
    void method3135() {
	if (((Class138_Sub9) this).aBool10029) {
	    ((Class138_Sub9) this).aClass137_10028.method3113('\001');
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15225(0);
	} else
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15352(0, 5890,
								   770);
	((Class138_Sub9) this).aClass103_Sub1_1621.method15180(8448, 8448);
	((Class138_Sub9) this).aBool10029 = false;
    }
    
    void method3123(int i, int i_0_) {
	/* empty */
    }
    
    void method3120(Class142 class142, int i) {
	((Class138_Sub9) this).aClass103_Sub1_1621.method15177(class142);
	((Class138_Sub9) this).aClass103_Sub1_1621.method15178(i);
    }
    
    void method3130(int i, int i_1_) {
	/* empty */
    }
    
    void method3138(Class142 class142, int i) {
	((Class138_Sub9) this).aClass103_Sub1_1621.method15177(class142);
	((Class138_Sub9) this).aClass103_Sub1_1621.method15178(i);
    }
    
    boolean method3127() {
	return true;
    }
    
    boolean method3128() {
	return true;
    }
    
    void method3129(boolean bool) {
	Class142_Sub2 class142_sub2
	    = ((Class138_Sub9) this).aClass103_Sub1_1621.method15307();
	if (((Class138_Sub9) this).aClass137_10028 != null
	    && class142_sub2 != null && bool) {
	    ((Class138_Sub9) this).aClass137_10028.method3113('\0');
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub9) this).aClass103_Sub1_1621
		.method15177(class142_sub2);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf((((Class103_Sub1)
				   ((Class138_Sub9) this).aClass103_Sub1_1621)
				      .aClass268_9121.method5227
				  (((Class103_Sub1)
				    ((Class138_Sub9) this).aClass103_Sub1_1621)
				   .aFloatArray9138)),
				 0);
	    OpenGL.glScalef(1.0F, -1.0F, -1.0F);
	    OpenGL.glMatrixMode(5888);
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15225(0);
	    ((Class138_Sub9) this).aBool10029 = true;
	} else
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15352(0, 34168,
								   770);
    }
    
    void method3132(boolean bool) {
	((Class138_Sub9) this).aClass103_Sub1_1621.method15180(8448, 7681);
    }
    
    Class138_Sub9(Class103_Sub1 class103_sub1) {
	super(class103_sub1);
	if (((Class103_Sub1) class103_sub1).aBool9209) {
	    ((Class138_Sub9) this).aClass137_10028
		= new Class137(class103_sub1, 2);
	    ((Class138_Sub9) this).aClass137_10028.method3112(0);
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15180(34165,
								   7681);
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15181(2, 34168,
								   770);
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15352(0, 34167,
								   770);
	    OpenGL.glTexGeni(8192, 9472, 34066);
	    OpenGL.glTexGeni(8193, 9472, 34066);
	    OpenGL.glTexGeni(8194, 9472, 34066);
	    OpenGL.glEnable(3168);
	    OpenGL.glEnable(3169);
	    OpenGL.glEnable(3170);
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15225(0);
	    ((Class138_Sub9) this).aClass137_10028.method3114();
	    ((Class138_Sub9) this).aClass137_10028.method3112(1);
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15180(8448, 8448);
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15181(2, 34166,
								   770);
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15352(0, 5890,
								   770);
	    OpenGL.glDisable(3168);
	    OpenGL.glDisable(3169);
	    OpenGL.glDisable(3170);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadIdentity();
	    OpenGL.glMatrixMode(5888);
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15225(0);
	    ((Class138_Sub9) this).aClass137_10028.method3114();
	}
    }
    
    void method3131() {
	if (((Class138_Sub9) this).aBool10029) {
	    ((Class138_Sub9) this).aClass137_10028.method3113('\001');
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15225(0);
	} else
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15352(0, 5890,
								   770);
	((Class138_Sub9) this).aClass103_Sub1_1621.method15180(8448, 8448);
	((Class138_Sub9) this).aBool10029 = false;
    }
    
    void method3122(int i, int i_2_) {
	/* empty */
    }
    
    void method3133(int i, int i_3_) {
	/* empty */
    }
    
    void method3134(int i, int i_4_) {
	/* empty */
    }
    
    void method3121(boolean bool) {
	((Class138_Sub9) this).aClass103_Sub1_1621.method15180(8448, 7681);
    }
    
    void method3136() {
	if (((Class138_Sub9) this).aBool10029) {
	    ((Class138_Sub9) this).aClass137_10028.method3113('\001');
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15225(0);
	} else
	    ((Class138_Sub9) this).aClass103_Sub1_1621.method15352(0, 5890,
								   770);
	((Class138_Sub9) this).aClass103_Sub1_1621.method15180(8448, 8448);
	((Class138_Sub9) this).aBool10029 = false;
    }
    
    void method3137(Class142 class142, int i) {
	((Class138_Sub9) this).aClass103_Sub1_1621.method15177(class142);
	((Class138_Sub9) this).aClass103_Sub1_1621.method15178(i);
    }
    
    boolean method3125() {
	return true;
    }
    
    void method3139(Class142 class142, int i) {
	((Class138_Sub9) this).aClass103_Sub1_1621.method15177(class142);
	((Class138_Sub9) this).aClass103_Sub1_1621.method15178(i);
    }
}
