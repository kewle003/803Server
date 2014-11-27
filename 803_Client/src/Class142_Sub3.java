/* Class142_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class142_Sub3 extends Class142
{
    int anInt10638;
    int anInt10639;
    int anInt10640;
    
    Class142_Sub3(Class103_Sub1 class103_sub1, Class175 class175,
		  Class102 class102, int i, int i_0_, int i_1_) {
	super(class103_sub1, 32879, class175, class102, i * i_0_ * i_1_,
	      false);
	((Class142_Sub3) this).anInt10639 = i;
	((Class142_Sub3) this).anInt10640 = i_0_;
	((Class142_Sub3) this).anInt10638 = i_1_;
	((Class142_Sub3) this).aClass103_Sub1_1655.method15177(this);
	OpenGL.glTexImage3Dub
	    (((Class142_Sub3) this).anInt1654, 0,
	     Class103_Sub1.method15203(((Class142_Sub3) this).aClass175_1658,
				       ((Class142_Sub3) this).aClass102_1656),
	     ((Class142_Sub3) this).anInt10639,
	     ((Class142_Sub3) this).anInt10640,
	     ((Class142_Sub3) this).anInt10638, 0,
	     Class103_Sub1.method15202(((Class142_Sub3) this).aClass175_1658),
	     5121, null, 0);
	method3168(true);
    }
    
    Class142_Sub3(Class103_Sub1 class103_sub1, Class175 class175,
		  Class102 class102, int i, int i_2_, int i_3_, byte[] is,
		  Class175 class175_4_) {
	super(class103_sub1, 32879, class175, class102, i * i_2_ * i_3_,
	      false);
	((Class142_Sub3) this).anInt10639 = i;
	((Class142_Sub3) this).anInt10640 = i_2_;
	((Class142_Sub3) this).anInt10638 = i_3_;
	((Class142_Sub3) this).aClass103_Sub1_1655.method15177(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glTexImage3Dub(((Class142_Sub3) this).anInt1654, 0,
			      Class103_Sub1.method15203((((Class142_Sub3) this)
							 .aClass175_1658),
							(((Class142_Sub3) this)
							 .aClass102_1656)),
			      ((Class142_Sub3) this).anInt10639,
			      ((Class142_Sub3) this).anInt10640,
			      ((Class142_Sub3) this).anInt10638, 0,
			      Class103_Sub1.method15202(class175_4_), 5121, is,
			      0);
	OpenGL.glPixelStorei(3317, 4);
	method3168(true);
    }
    
    void method16879(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_,
		     int i_10_) {
	((Class142_Sub3) this).aClass103_Sub1_1655.method15177(this);
	OpenGL.glCopyTexSubImage3D(((Class142_Sub3) this).anInt1654, 0, i,
				   i_5_, i_6_, i_9_, i_10_, i_7_, i_8_);
	OpenGL.glFlush();
    }
    
    void method16880(int i, int i_11_, int i_12_, int i_13_, int i_14_,
		     int i_15_, int i_16_) {
	((Class142_Sub3) this).aClass103_Sub1_1655.method15177(this);
	OpenGL.glCopyTexSubImage3D(((Class142_Sub3) this).anInt1654, 0, i,
				   i_11_, i_12_, i_15_, i_16_, i_13_, i_14_);
	OpenGL.glFlush();
    }
    
    void method16881(int i, int i_17_, int i_18_, int i_19_, int i_20_,
		     int i_21_, int i_22_) {
	((Class142_Sub3) this).aClass103_Sub1_1655.method15177(this);
	OpenGL.glCopyTexSubImage3D(((Class142_Sub3) this).anInt1654, 0, i,
				   i_17_, i_18_, i_21_, i_22_, i_19_, i_20_);
	OpenGL.glFlush();
    }
}
