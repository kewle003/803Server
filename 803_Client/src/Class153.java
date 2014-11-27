/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class153
{
    Class103_Sub1 aClass103_Sub1_1716;
    static int[] anIntArray1717 = new int[1];
    int anInt1718;
    static final int anInt1719 = 34336;
    
    void method3235() throws Throwable {
	((Class153) this).aClass103_Sub1_1716
	    .method15207(((Class153) this).anInt1718);
	super.finalize();
    }
    
    Class153(Class103_Sub1 class103_sub1, int i, int i_0_) {
	((Class153) this).aClass103_Sub1_1716 = class103_sub1;
	((Class153) this).anInt1718 = i_0_;
    }
    
    static Class153 method3236(Class103_Sub1 class103_sub1, int i,
			       String string) {
	int i_1_ = OpenGL.glGenProgramARB();
	OpenGL.glBindProgramARB(i, i_1_);
	OpenGL.glProgramStringARB(i, 34933, string);
	OpenGL.glGetIntegerv(34379, anIntArray1717, 0);
	if (anIntArray1717[0] != -1) {
	    OpenGL.glBindProgramARB(i, 0);
	    return null;
	}
	OpenGL.glBindProgramARB(i, 0);
	return new Class153(class103_sub1, i, i_1_);
    }
    
    void method3237() throws Throwable {
	((Class153) this).aClass103_Sub1_1716
	    .method15207(((Class153) this).anInt1718);
	super.finalize();
    }
    
    static Class153 method3238(Class103_Sub1 class103_sub1, int i,
			       String string) {
	int i_2_ = OpenGL.glGenProgramARB();
	OpenGL.glBindProgramARB(i, i_2_);
	OpenGL.glProgramStringARB(i, 34933, string);
	OpenGL.glGetIntegerv(34379, anIntArray1717, 0);
	if (anIntArray1717[0] != -1) {
	    OpenGL.glBindProgramARB(i, 0);
	    return null;
	}
	OpenGL.glBindProgramARB(i, 0);
	return new Class153(class103_sub1, i, i_2_);
    }
    
    void method3239() throws Throwable {
	((Class153) this).aClass103_Sub1_1716
	    .method15207(((Class153) this).anInt1718);
	super.finalize();
    }
    
    public void finalize() throws Throwable {
	((Class153) this).aClass103_Sub1_1716
	    .method15207(((Class153) this).anInt1718);
	super.finalize();
    }
    
    void method3240() throws Throwable {
	((Class153) this).aClass103_Sub1_1716
	    .method15207(((Class153) this).anInt1718);
	super.finalize();
    }
    
    static Class153 method3241(Class103_Sub1 class103_sub1, int i,
			       String string) {
	int i_3_ = OpenGL.glGenProgramARB();
	OpenGL.glBindProgramARB(i, i_3_);
	OpenGL.glProgramStringARB(i, 34933, string);
	OpenGL.glGetIntegerv(34379, anIntArray1717, 0);
	if (anIntArray1717[0] != -1) {
	    OpenGL.glBindProgramARB(i, 0);
	    return null;
	}
	OpenGL.glBindProgramARB(i, 0);
	return new Class153(class103_sub1, i, i_3_);
    }
}
