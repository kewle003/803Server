/* Class229 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class229 implements Interface4, Interface5, Interface21
{
    Class103_Sub3_Sub2 aClass103_Sub3_Sub2_2675;
    Class175 aClass175_2676;
    int anInt2677;
    Class102 aClass102_2678;
    int anInt2679;
    int anInt2680;
    
    public void method29() {
	if (((Class229) this).anInt2680 != 0) {
	    int[] is = new int[1];
	    is[0] = ((Class229) this).anInt2680;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    ((Class229) this).anInt2680 = 0;
	}
    }
    
    Class229(Class103_Sub3_Sub2 class103_sub3_sub2, Class175 class175,
	     Class102 class102, int i, int i_0_, int i_1_) {
	((Class229) this).aClass175_2676 = class175;
	((Class229) this).aClass102_2678 = class102;
	((Class229) this).anInt2677 = i;
	((Class229) this).anInt2679 = i_0_;
	((Class229) this).aClass103_Sub3_Sub2_2675 = class103_sub3_sub2;
	int[] is = new int[1];
	OpenGL.glGenRenderbuffersEXT(1, is, 0);
	((Class229) this).anInt2680 = is[0];
	OpenGL.glBindRenderbufferEXT(36161, ((Class229) this).anInt2680);
	OpenGL.glRenderbufferStorageMultisampleEXT
	    (36161, i_1_,
	     Class103_Sub3_Sub2.method17559(((Class229) this).aClass175_2676,
					    ((Class229) this).aClass102_2678),
	     i, i_0_);
    }
    
    public int method55() {
	return ((Class229) this).anInt2677;
    }
    
    public int method49() {
	return ((Class229) this).anInt2679;
    }
    
    public void method59(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161,
					    ((Class229) this).anInt2680);
    }
    
    public void method28() {
	if (((Class229) this).anInt2680 != 0) {
	    int[] is = new int[1];
	    is[0] = ((Class229) this).anInt2680;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    ((Class229) this).anInt2680 = 0;
	}
    }
    
    void method4659() throws Throwable {
	method4663();
	super.finalize();
    }
    
    public void finalize() throws Throwable {
	method4663();
	super.finalize();
    }
    
    public int method64() {
	return ((Class229) this).anInt2677;
    }
    
    Class229(Class103_Sub3_Sub2 class103_sub3_sub2, Class175 class175,
	     Class102 class102, int i, int i_2_) {
	((Class229) this).aClass175_2676 = class175;
	((Class229) this).aClass102_2678 = class102;
	((Class229) this).anInt2677 = i;
	((Class229) this).anInt2679 = i_2_;
	((Class229) this).aClass103_Sub3_Sub2_2675 = class103_sub3_sub2;
	int[] is = new int[1];
	OpenGL.glGenRenderbuffersEXT(1, is, 0);
	((Class229) this).anInt2680 = is[0];
	OpenGL.glBindRenderbufferEXT(36161, ((Class229) this).anInt2680);
	OpenGL.glRenderbufferStorageEXT
	    (36161,
	     Class103_Sub3_Sub2.method17559(((Class229) this).aClass175_2676,
					    ((Class229) this).aClass102_2678),
	     i, i_2_);
    }
    
    public int method53() {
	return ((Class229) this).anInt2677;
    }
    
    public int method54() {
	return ((Class229) this).anInt2679;
    }
    
    public void method27() {
	if (((Class229) this).anInt2680 != 0) {
	    int[] is = new int[1];
	    is[0] = ((Class229) this).anInt2680;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    ((Class229) this).anInt2680 = 0;
	}
    }
    
    void method4660() throws Throwable {
	method4663();
	super.finalize();
    }
    
    public int method52() {
	return ((Class229) this).anInt2677;
    }
    
    void method4661() throws Throwable {
	method4663();
	super.finalize();
    }
    
    void method4662() throws Throwable {
	method4663();
	super.finalize();
    }
    
    void method4663() {
	if (((Class229) this).anInt2680 != 0) {
	    ((Class229) this).aClass103_Sub3_Sub2_2675.method17551
		(((Class229) this).anInt2680,
		 (((Class229) this).anInt2677 * ((Class229) this).anInt2679
		  * (((Class229) this).aClass102_2678.anInt1447 * -387243519)
		  * (((Class229) this).aClass175_2676.anInt2121
		     * 1893442799)));
	    ((Class229) this).anInt2680 = 0;
	}
    }
    
    public void method60(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161,
					    ((Class229) this).anInt2680);
    }
    
    void method4664() {
	if (((Class229) this).anInt2680 != 0) {
	    ((Class229) this).aClass103_Sub3_Sub2_2675.method17551
		(((Class229) this).anInt2680,
		 (((Class229) this).anInt2677 * ((Class229) this).anInt2679
		  * (((Class229) this).aClass102_2678.anInt1447 * -387243519)
		  * (((Class229) this).aClass175_2676.anInt2121
		     * 1893442799)));
	    ((Class229) this).anInt2680 = 0;
	}
    }
}
