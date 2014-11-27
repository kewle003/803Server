/* Class142_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class142_Sub1 extends Class142
{
    int anInt9996;
    
    void method16271(boolean bool) {
	((Class142_Sub1) this).aClass103_Sub1_1655.method15177(this);
	OpenGL.glTexParameteri(((Class142_Sub1) this).anInt1654, 10242,
			       bool ? 10497 : 33071);
    }
    
    void method16272(boolean bool) {
	((Class142_Sub1) this).aClass103_Sub1_1655.method15177(this);
	OpenGL.glTexParameteri(((Class142_Sub1) this).anInt1654, 10242,
			       bool ? 10497 : 33071);
    }
    
    Class142_Sub1(Class103_Sub1 class103_sub1, Class175 class175,
		  Class102 class102, int i, byte[] is, Class175 class175_0_) {
	super(class103_sub1, 3552, class175, class102, i, false);
	((Class142_Sub1) this).anInt9996 = i;
	((Class142_Sub1) this).aClass103_Sub1_1655.method15177(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glTexImage1Dub(((Class142_Sub1) this).anInt1654, 0,
			      Class103_Sub1.method15203((((Class142_Sub1) this)
							 .aClass175_1658),
							(((Class142_Sub1) this)
							 .aClass102_1656)),
			      ((Class142_Sub1) this).anInt9996, 0,
			      Class103_Sub1.method15202(class175_0_), 5121, is,
			      0);
	OpenGL.glPixelStorei(3317, 4);
	method3168(true);
    }
    
    void method16273(boolean bool) {
	((Class142_Sub1) this).aClass103_Sub1_1655.method15177(this);
	OpenGL.glTexParameteri(((Class142_Sub1) this).anInt1654, 10242,
			       bool ? 10497 : 33071);
    }
    
    void method16274(boolean bool) {
	((Class142_Sub1) this).aClass103_Sub1_1655.method15177(this);
	OpenGL.glTexParameteri(((Class142_Sub1) this).anInt1654, 10242,
			       bool ? 10497 : 33071);
    }
}
