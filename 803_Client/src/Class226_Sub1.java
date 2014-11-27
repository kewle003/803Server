/* Class226_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class226_Sub1 extends Class226 implements Interface30
{
    static final int anInt10257 = 34069;
    
    public void method176(Class312 class312) {
	super.method176(class312);
    }
    
    public void method178() {
	super.method178();
    }
    
    public void method175() {
	super.method178();
    }
    
    public void method179(Class312 class312) {
	super.method176(class312);
    }
    
    public void method27() {
	super.method28();
    }
    
    public void method29() {
	super.method28();
    }
    
    public void method177() {
	super.method178();
    }
    
    public void method180() {
	super.method178();
    }
    
    public void method28() {
	super.method28();
    }
    
    Class226_Sub1(Class103_Sub3_Sub2 class103_sub3_sub2, int i, boolean bool,
		  int[][] is) {
	super(class103_sub3_sub2, 34067, Class175.aClass175_2110,
	      Class102.aClass102_1440, i * i * 6, bool);
	for (int i_0_ = 0; i_0_ < 6; i_0_++) {
	    for (int i_1_ = 0; i_1_ < is[i_0_].length; i_1_++) {
		int i_2_ = is[i_0_][i_1_];
		is[i_0_][i_1_] = (~0xff00ff & i_2_ | (i_2_ & 0xff) << 16
				  | i_2_ >> 16 & 0xff);
	    }
	}
	((Class226_Sub1) this).aClass103_Sub3_Sub2_2668.method15856(this);
	if (bool) {
	    for (int i_3_ = 0; i_3_ < 6; i_3_++)
		method4633(34069 + i_3_, i, i, is[i_3_]);
	} else {
	    for (int i_4_ = 0; i_4_ < 6; i_4_++)
		OpenGL.glTexImage2Di
		    (34069 + i_4_, 0,
		     Class103_Sub3_Sub2.method17559((((Class226_Sub1) this)
						     .aClass175_2663),
						    (((Class226_Sub1) this)
						     .aClass102_2664)),
		     i, i, 0,
		     Class103_Sub3_Sub2
			 .method17571(((Class226_Sub1) this).aClass175_2663),
		     (((Class103_Sub3_Sub2)
		       ((Class226_Sub1) this).aClass103_Sub3_Sub2_2668)
		      .anInt11165),
		     is[i_4_], 0);
	}
    }
    
    public void method181(Class312 class312) {
	super.method176(class312);
    }
}
