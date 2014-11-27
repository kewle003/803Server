/* Class241_Sub39_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class241_Sub39_Sub18 extends Class241_Sub39 implements Interface9
{
    Class103_Sub1 aClass103_Sub1_11216;
    int anInt11217;
    int anInt11218;
    static int[] anIntArray11219 = new int[1];
    Class102 aClass102_11220;
    Class175 aClass175_11221;
    int anInt11222;
    int anInt11223;
    
    public void method63(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161,
					    (((Class241_Sub39_Sub18) this)
					     .anInt11217));
    }
    
    Class241_Sub39_Sub18(Class103_Sub1 class103_sub1, Class175 class175,
			 Class102 class102, int i, int i_0_, int i_1_) {
	((Class241_Sub39_Sub18) this).aClass103_Sub1_11216 = class103_sub1;
	((Class241_Sub39_Sub18) this).anInt11218 = i;
	((Class241_Sub39_Sub18) this).anInt11223 = i_0_;
	((Class241_Sub39_Sub18) this).aClass175_11221 = class175;
	((Class241_Sub39_Sub18) this).aClass102_11220 = class102;
	OpenGL.glGenRenderbuffersEXT(1, anIntArray11219, 0);
	((Class241_Sub39_Sub18) this).anInt11217 = anIntArray11219[0];
	OpenGL.glBindRenderbufferEXT(36161,
				     ((Class241_Sub39_Sub18) this).anInt11217);
	OpenGL.glRenderbufferStorageMultisampleEXT
	    (36161, i_1_,
	     Class103_Sub1.method15203((((Class241_Sub39_Sub18) this)
					.aClass175_11221),
				       (((Class241_Sub39_Sub18) this)
					.aClass102_11220)),
	     ((Class241_Sub39_Sub18) this).anInt11218,
	     ((Class241_Sub39_Sub18) this).anInt11223);
	((Class241_Sub39_Sub18) this).anInt11222
	    = (((Class241_Sub39_Sub18) this).anInt11218
	       * ((Class241_Sub39_Sub18) this).anInt11223
	       * (((Class241_Sub39_Sub18) this).aClass175_11221.anInt2121
		  * 1893442799)
	       * (((Class241_Sub39_Sub18) this).aClass102_11220.anInt1447
		  * -387243519));
    }
    
    public int method55() {
	return ((Class241_Sub39_Sub18) this).anInt11218;
    }
    
    public int method49() {
	return ((Class241_Sub39_Sub18) this).anInt11223;
    }
    
    public void method59(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161,
					    (((Class241_Sub39_Sub18) this)
					     .anInt11217));
    }
    
    public void method28() {
	if (((Class241_Sub39_Sub18) this).anInt11217 != 0) {
	    int[] is = new int[1];
	    is[0] = ((Class241_Sub39_Sub18) this).anInt11217;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    ((Class241_Sub39_Sub18) this).anInt11217 = 0;
	}
    }
    
    public int method54() {
	return ((Class241_Sub39_Sub18) this).anInt11223;
    }
    
    void method17602() throws Throwable {
	method17606();
	super.finalize();
    }
    
    public int method64() {
	return ((Class241_Sub39_Sub18) this).anInt11218;
    }
    
    public int method52() {
	return ((Class241_Sub39_Sub18) this).anInt11218;
    }
    
    public int method53() {
	return ((Class241_Sub39_Sub18) this).anInt11218;
    }
    
    public void method60(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161,
					    (((Class241_Sub39_Sub18) this)
					     .anInt11217));
    }
    
    public void finalize() throws Throwable {
	method17606();
	super.finalize();
    }
    
    public void method29() {
	if (((Class241_Sub39_Sub18) this).anInt11217 != 0) {
	    int[] is = new int[1];
	    is[0] = ((Class241_Sub39_Sub18) this).anInt11217;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    ((Class241_Sub39_Sub18) this).anInt11217 = 0;
	}
    }
    
    Class241_Sub39_Sub18(Class103_Sub1 class103_sub1, Class175 class175,
			 Class102 class102, int i, int i_2_) {
	((Class241_Sub39_Sub18) this).aClass103_Sub1_11216 = class103_sub1;
	((Class241_Sub39_Sub18) this).anInt11218 = i;
	((Class241_Sub39_Sub18) this).anInt11223 = i_2_;
	((Class241_Sub39_Sub18) this).aClass175_11221 = class175;
	((Class241_Sub39_Sub18) this).aClass102_11220 = class102;
	OpenGL.glGenRenderbuffersEXT(1, anIntArray11219, 0);
	((Class241_Sub39_Sub18) this).anInt11217 = anIntArray11219[0];
	OpenGL.glBindRenderbufferEXT(36161,
				     ((Class241_Sub39_Sub18) this).anInt11217);
	OpenGL.glRenderbufferStorageEXT
	    (36161,
	     Class103_Sub1.method15203((((Class241_Sub39_Sub18) this)
					.aClass175_11221),
				       (((Class241_Sub39_Sub18) this)
					.aClass102_11220)),
	     ((Class241_Sub39_Sub18) this).anInt11218,
	     ((Class241_Sub39_Sub18) this).anInt11223);
	((Class241_Sub39_Sub18) this).anInt11222
	    = (((Class241_Sub39_Sub18) this).anInt11218
	       * ((Class241_Sub39_Sub18) this).anInt11223
	       * (((Class241_Sub39_Sub18) this).aClass175_11221.anInt2121
		  * 1893442799)
	       * (((Class241_Sub39_Sub18) this).aClass102_11220.anInt1447
		  * -387243519));
    }
    
    void method17603() throws Throwable {
	method17606();
	super.finalize();
    }
    
    void method17604() throws Throwable {
	method17606();
	super.finalize();
    }
    
    void method17605() throws Throwable {
	method17606();
	super.finalize();
    }
    
    public void method27() {
	if (((Class241_Sub39_Sub18) this).anInt11217 != 0) {
	    int[] is = new int[1];
	    is[0] = ((Class241_Sub39_Sub18) this).anInt11217;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    ((Class241_Sub39_Sub18) this).anInt11217 = 0;
	}
    }
    
    void method17606() {
	if (((Class241_Sub39_Sub18) this).anInt11217 != 0) {
	    ((Class241_Sub39_Sub18) this).aClass103_Sub1_11216.method15216
		(((Class241_Sub39_Sub18) this).anInt11217,
		 ((Class241_Sub39_Sub18) this).anInt11222);
	    ((Class241_Sub39_Sub18) this).anInt11217 = 0;
	}
    }
    
    public void method61(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161,
					    (((Class241_Sub39_Sub18) this)
					     .anInt11217));
    }
    
    public void method62(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161,
					    (((Class241_Sub39_Sub18) this)
					     .anInt11217));
    }
    
    void method17607() {
	if (((Class241_Sub39_Sub18) this).anInt11217 != 0) {
	    ((Class241_Sub39_Sub18) this).aClass103_Sub1_11216.method15216
		(((Class241_Sub39_Sub18) this).anInt11217,
		 ((Class241_Sub39_Sub18) this).anInt11222);
	    ((Class241_Sub39_Sub18) this).anInt11217 = 0;
	}
    }
    
    void method17608() {
	if (((Class241_Sub39_Sub18) this).anInt11217 != 0) {
	    ((Class241_Sub39_Sub18) this).aClass103_Sub1_11216.method15216
		(((Class241_Sub39_Sub18) this).anInt11217,
		 ((Class241_Sub39_Sub18) this).anInt11222);
	    ((Class241_Sub39_Sub18) this).anInt11217 = 0;
	}
    }
}
