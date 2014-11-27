/* Class148 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class148
{
    static int[] anIntArray1702 = new int[2];
    Class103_Sub1 aClass103_Sub1_1703;
    int anInt1704;
    
    void method3224() throws Throwable {
	((Class148) this).aClass103_Sub1_1703
	    .method15201((long) ((Class148) this).anInt1704);
	super.finalize();
    }
    
    static Class148 method3225(Class103_Sub1 class103_sub1,
			       Class156[] class156s) {
	for (int i = 0; i < class156s.length; i++) {
	    if (class156s[i] == null
		|| ((Class156) class156s[i]).anInt1762 <= 0)
		return null;
	}
	int i = OpenGL.glCreateProgram();
	for (int i_0_ = 0; i_0_ < class156s.length; i_0_++)
	    OpenGL.glAttachShader(i, ((Class156) class156s[i_0_]).anInt1762);
	OpenGL.glLinkProgram(i);
	OpenGL.glGetProgramiv(i, 35714, anIntArray1702, 0);
	if (anIntArray1702[0] == 0) {
	    OpenGL.glGetProgramiv(i, 35716, anIntArray1702, 1);
	    if (anIntArray1702[1] > 1) {
		byte[] is = new byte[anIntArray1702[1]];
		OpenGL.glGetProgramInfoLog(i, anIntArray1702[1],
					   anIntArray1702, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (anIntArray1702[0] == 0) {
		for (int i_1_ = 0; i_1_ < class156s.length; i_1_++)
		    OpenGL.glDetachShader(i, (((Class156) class156s[i_1_])
					      .anInt1762));
		OpenGL.glDeleteProgram(i);
		return null;
	    }
	}
	return new Class148(class103_sub1, i, class156s);
    }
    
    static Class148 method3226(Class103_Sub1 class103_sub1,
			       Class156[] class156s) {
	for (int i = 0; i < class156s.length; i++) {
	    if (class156s[i] == null
		|| ((Class156) class156s[i]).anInt1762 <= 0)
		return null;
	}
	int i = OpenGL.glCreateProgram();
	for (int i_2_ = 0; i_2_ < class156s.length; i_2_++)
	    OpenGL.glAttachShader(i, ((Class156) class156s[i_2_]).anInt1762);
	OpenGL.glLinkProgram(i);
	OpenGL.glGetProgramiv(i, 35714, anIntArray1702, 0);
	if (anIntArray1702[0] == 0) {
	    OpenGL.glGetProgramiv(i, 35716, anIntArray1702, 1);
	    if (anIntArray1702[1] > 1) {
		byte[] is = new byte[anIntArray1702[1]];
		OpenGL.glGetProgramInfoLog(i, anIntArray1702[1],
					   anIntArray1702, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (anIntArray1702[0] == 0) {
		for (int i_3_ = 0; i_3_ < class156s.length; i_3_++)
		    OpenGL.glDetachShader(i, (((Class156) class156s[i_3_])
					      .anInt1762));
		OpenGL.glDeleteProgram(i);
		return null;
	    }
	}
	return new Class148(class103_sub1, i, class156s);
    }
    
    static Class148 method3227(Class103_Sub1 class103_sub1,
			       Class156[] class156s) {
	for (int i = 0; i < class156s.length; i++) {
	    if (class156s[i] == null
		|| ((Class156) class156s[i]).anInt1762 <= 0)
		return null;
	}
	int i = OpenGL.glCreateProgram();
	for (int i_4_ = 0; i_4_ < class156s.length; i_4_++)
	    OpenGL.glAttachShader(i, ((Class156) class156s[i_4_]).anInt1762);
	OpenGL.glLinkProgram(i);
	OpenGL.glGetProgramiv(i, 35714, anIntArray1702, 0);
	if (anIntArray1702[0] == 0) {
	    OpenGL.glGetProgramiv(i, 35716, anIntArray1702, 1);
	    if (anIntArray1702[1] > 1) {
		byte[] is = new byte[anIntArray1702[1]];
		OpenGL.glGetProgramInfoLog(i, anIntArray1702[1],
					   anIntArray1702, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (anIntArray1702[0] == 0) {
		for (int i_5_ = 0; i_5_ < class156s.length; i_5_++)
		    OpenGL.glDetachShader(i, (((Class156) class156s[i_5_])
					      .anInt1762));
		OpenGL.glDeleteProgram(i);
		return null;
	    }
	}
	return new Class148(class103_sub1, i, class156s);
    }
    
    static Class148 method3228(Class103_Sub1 class103_sub1,
			       Class156[] class156s) {
	for (int i = 0; i < class156s.length; i++) {
	    if (class156s[i] == null
		|| ((Class156) class156s[i]).anInt1762 <= 0)
		return null;
	}
	int i = OpenGL.glCreateProgram();
	for (int i_6_ = 0; i_6_ < class156s.length; i_6_++)
	    OpenGL.glAttachShader(i, ((Class156) class156s[i_6_]).anInt1762);
	OpenGL.glLinkProgram(i);
	OpenGL.glGetProgramiv(i, 35714, anIntArray1702, 0);
	if (anIntArray1702[0] == 0) {
	    OpenGL.glGetProgramiv(i, 35716, anIntArray1702, 1);
	    if (anIntArray1702[1] > 1) {
		byte[] is = new byte[anIntArray1702[1]];
		OpenGL.glGetProgramInfoLog(i, anIntArray1702[1],
					   anIntArray1702, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (anIntArray1702[0] == 0) {
		for (int i_7_ = 0; i_7_ < class156s.length; i_7_++)
		    OpenGL.glDetachShader(i, (((Class156) class156s[i_7_])
					      .anInt1762));
		OpenGL.glDeleteProgram(i);
		return null;
	    }
	}
	return new Class148(class103_sub1, i, class156s);
    }
    
    public void finalize() throws Throwable {
	((Class148) this).aClass103_Sub1_1703
	    .method15201((long) ((Class148) this).anInt1704);
	super.finalize();
    }
    
    void method3229() throws Throwable {
	((Class148) this).aClass103_Sub1_1703
	    .method15201((long) ((Class148) this).anInt1704);
	super.finalize();
    }
    
    void method3230() throws Throwable {
	((Class148) this).aClass103_Sub1_1703
	    .method15201((long) ((Class148) this).anInt1704);
	super.finalize();
    }
    
    void method3231() throws Throwable {
	((Class148) this).aClass103_Sub1_1703
	    .method15201((long) ((Class148) this).anInt1704);
	super.finalize();
    }
    
    Class148(Class103_Sub1 class103_sub1, int i, Class156[] class156s) {
	((Class148) this).aClass103_Sub1_1703 = class103_sub1;
	((Class148) this).anInt1704 = i;
    }
}
