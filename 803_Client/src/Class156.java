/* Class156 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class156
{
    static final int anInt1759 = 35632;
    Class103_Sub1 aClass103_Sub1_1760;
    static int[] anIntArray1761 = new int[2];
    int anInt1762;
    static final int anInt1763 = 35633;
    
    void method3386() throws Throwable {
	((Class156) this).aClass103_Sub1_1760
	    .method15201((long) ((Class156) this).anInt1762);
	super.finalize();
    }
    
    Class156(Class103_Sub1 class103_sub1, int i, int i_0_) {
	((Class156) this).aClass103_Sub1_1760 = class103_sub1;
	((Class156) this).anInt1762 = i;
    }
    
    public void finalize() throws Throwable {
	((Class156) this).aClass103_Sub1_1760
	    .method15201((long) ((Class156) this).anInt1762);
	super.finalize();
    }
    
    void method3387() throws Throwable {
	((Class156) this).aClass103_Sub1_1760
	    .method15201((long) ((Class156) this).anInt1762);
	super.finalize();
    }
    
    void method3388() throws Throwable {
	((Class156) this).aClass103_Sub1_1760
	    .method15201((long) ((Class156) this).anInt1762);
	super.finalize();
    }
    
    static Class156 method3389(Class103_Sub1 class103_sub1, int i,
			       String string) {
	int i_1_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_1_, string);
	OpenGL.glCompileShader(i_1_);
	OpenGL.glGetShaderiv(i_1_, 35713, anIntArray1761, 0);
	if (anIntArray1761[0] == 0) {
	    boolean bool = false;
	    if (anIntArray1761[0] == 0) {
		bool = true;
		System.out.println("");
	    }
	    OpenGL.glGetShaderiv(i_1_, 35716, anIntArray1761, 1);
	    if (anIntArray1761[1] > 1) {
		byte[] is = new byte[anIntArray1761[1]];
		OpenGL.glGetShaderInfoLog(i_1_, anIntArray1761[1],
					  anIntArray1761, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (bool) {
		OpenGL.glDeleteShader(i_1_);
		return null;
	    }
	}
	return new Class156(class103_sub1, i_1_, i);
    }
    
    static Class156 method3390(Class103_Sub1 class103_sub1, int i,
			       String string) {
	int i_2_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_2_, string);
	OpenGL.glCompileShader(i_2_);
	OpenGL.glGetShaderiv(i_2_, 35713, anIntArray1761, 0);
	if (anIntArray1761[0] == 0) {
	    boolean bool = false;
	    if (anIntArray1761[0] == 0) {
		bool = true;
		System.out.println("");
	    }
	    OpenGL.glGetShaderiv(i_2_, 35716, anIntArray1761, 1);
	    if (anIntArray1761[1] > 1) {
		byte[] is = new byte[anIntArray1761[1]];
		OpenGL.glGetShaderInfoLog(i_2_, anIntArray1761[1],
					  anIntArray1761, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (bool) {
		OpenGL.glDeleteShader(i_2_);
		return null;
	    }
	}
	return new Class156(class103_sub1, i_2_, i);
    }
    
    void method3391() throws Throwable {
	((Class156) this).aClass103_Sub1_1760
	    .method15201((long) ((Class156) this).anInt1762);
	super.finalize();
    }
}
