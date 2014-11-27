/* Class226_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class226_Sub2 extends Class226 implements Interface38
{
    int anInt10359;
    int anInt10360;
    int anInt10361;
    
    Class226_Sub2(Class103_Sub3_Sub2 class103_sub3_sub2, Class175 class175,
		  int i, int i_0_, int i_1_, boolean bool, byte[] is) {
	super(class103_sub3_sub2, 32879, class175, Class102.aClass102_1440,
	      i * i_0_ * i_1_, bool);
	((Class226_Sub2) this).anInt10361 = i;
	((Class226_Sub2) this).anInt10360 = i_0_;
	((Class226_Sub2) this).anInt10359 = i_1_;
	((Class226_Sub2) this).aClass103_Sub3_Sub2_2668.method15856(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glTexImage3Dub(((Class226_Sub2) this).anInt2660, 0,
			      (Class103_Sub3_Sub2.method17559
			       (((Class226_Sub2) this).aClass175_2663,
				((Class226_Sub2) this).aClass102_2664)),
			      ((Class226_Sub2) this).anInt10361,
			      ((Class226_Sub2) this).anInt10360,
			      ((Class226_Sub2) this).anInt10359, 0,
			      Class103_Sub3_Sub2.method17571(((Class226_Sub2)
							      this)
							     .aClass175_2663),
			      5121, is, 0);
	OpenGL.glPixelStorei(3317, 4);
	if (bool)
	    method150();
    }
    
    public void method177() {
	super.method178();
    }
    
    public void method179(Class312 class312) {
	super.method176(class312);
    }
    
    public void method28() {
	super.method28();
    }
    
    public void method27() {
	super.method28();
    }
    
    public void method29() {
	super.method28();
    }
    
    public void method176(Class312 class312) {
	super.method176(class312);
    }
    
    public void method180() {
	super.method178();
    }
    
    public void method175() {
	super.method178();
    }
    
    public void method178() {
	super.method178();
    }
    
    public void method181(Class312 class312) {
	super.method176(class312);
    }
}
