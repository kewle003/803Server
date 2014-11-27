/* Class231 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class231 implements Interface21
{
    Class226_Sub3 aClass226_Sub3_2685;
    int anInt2686;
    
    public int method53() {
	return ((Class231) this).aClass226_Sub3_2685.method55();
    }
    
    public int method55() {
	return ((Class231) this).aClass226_Sub3_2685.method55();
    }
    
    public int method49() {
	return ((Class231) this).aClass226_Sub3_2685.method49();
    }
    
    public void method59(int i) {
	OpenGL.glFramebufferTexture2DEXT
	    (36160, i,
	     ((Class226_Sub3) ((Class231) this).aClass226_Sub3_2685).anInt2660,
	     ((Class226_Sub3) ((Class231) this).aClass226_Sub3_2685).anInt2661,
	     ((Class231) this).anInt2686);
    }
    
    public void method28() {
	/* empty */
    }
    
    public int method64() {
	return ((Class231) this).aClass226_Sub3_2685.method55();
    }
    
    public int method54() {
	return ((Class231) this).aClass226_Sub3_2685.method49();
    }
    
    public int method52() {
	return ((Class231) this).aClass226_Sub3_2685.method55();
    }
    
    Class231(Class226_Sub3 class226_sub3, int i) {
	((Class231) this).anInt2686 = i;
	((Class231) this).aClass226_Sub3_2685 = class226_sub3;
    }
    
    public void method27() {
	/* empty */
    }
    
    public void method29() {
	/* empty */
    }
    
    public void method60(int i) {
	OpenGL.glFramebufferTexture2DEXT
	    (36160, i,
	     ((Class226_Sub3) ((Class231) this).aClass226_Sub3_2685).anInt2660,
	     ((Class226_Sub3) ((Class231) this).aClass226_Sub3_2685).anInt2661,
	     ((Class231) this).anInt2686);
    }
}
