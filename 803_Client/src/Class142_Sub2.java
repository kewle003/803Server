/* Class142_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class142_Sub2 extends Class142
{
    int anInt10019;
    static final int anInt10020 = 34070;
    static final int anInt10021 = 34071;
    static final int anInt10022 = 34072;
    static final int anInt10023 = 34073;
    static final int anInt10024 = 34069;
    static final int anInt10025 = 34074;
    
    Interface4 method16284(int i, int i_0_) {
	return new Class150(this, i, i_0_);
    }
    
    Class142_Sub2(Class103_Sub1 class103_sub1, Class175 class175,
		  Class102 class102, int i, boolean bool, int[][] is) {
	super(class103_sub1, 34067, class175, class102, i * i * 6, bool);
	((Class142_Sub2) this).anInt10019 = i;
	((Class142_Sub2) this).aClass103_Sub1_1655.method15177(this);
	if (bool) {
	    for (int i_1_ = 0; i_1_ < 6; i_1_++)
		method3191(34069 + i_1_,
			   Class103_Sub1.method15203((((Class142_Sub2) this)
						      .aClass175_1658),
						     (((Class142_Sub2) this)
						      .aClass102_1656)),
			   i, i, 32993,
			   ((Class103_Sub1) (((Class142_Sub2) this)
					     .aClass103_Sub1_1655)).anInt9220,
			   is[i_1_]);
	} else {
	    for (int i_2_ = 0; i_2_ < 6; i_2_++)
		OpenGL.glTexImage2Di(34069 + i_2_, 0,
				     (Class103_Sub1.method15203
				      (((Class142_Sub2) this).aClass175_1658,
				       ((Class142_Sub2) this).aClass102_1656)),
				     i, i, 0, 32993,
				     (((Class103_Sub1) (((Class142_Sub2) this)
							.aClass103_Sub1_1655))
				      .anInt9220),
				     is[i_2_], 0);
	}
	method3168(true);
    }
    
    Class142_Sub2(Class103_Sub1 class103_sub1, Class175 class175,
		  Class102 class102, int i, boolean bool, byte[][] is,
		  Class175 class175_3_) {
	super(class103_sub1, 34067, class175, class102, i * i * 6, bool);
	((Class142_Sub2) this).anInt10019 = i;
	((Class142_Sub2) this).aClass103_Sub1_1655.method15177(this);
	for (int i_4_ = 0; i_4_ < 6; i_4_++)
	    OpenGL.glTexImage2Dub(34069 + i_4_, 0,
				  (Class103_Sub1.method15203
				   (((Class142_Sub2) this).aClass175_1658,
				    ((Class142_Sub2) this).aClass102_1656)),
				  i, i, 0,
				  Class103_Sub1.method15202(class175_3_), 5121,
				  is[i_4_], 0);
	method3168(true);
    }
    
    Class142_Sub2(Class103_Sub1 class103_sub1, Class175 class175,
		  Class102 class102, int i) {
	super(class103_sub1, 34067, class175, class102, i * i * 6, false);
	((Class142_Sub2) this).anInt10019 = i;
	((Class142_Sub2) this).aClass103_Sub1_1655.method15177(this);
	for (int i_5_ = 0; i_5_ < 6; i_5_++)
	    OpenGL.glTexImage2Dub(34069 + i_5_, 0,
				  (Class103_Sub1.method15203
				   (((Class142_Sub2) this).aClass175_1658,
				    ((Class142_Sub2) this).aClass102_1656)),
				  i, i, 0,
				  Class103_Sub1.method15202(((Class142_Sub2)
							     this)
							    .aClass175_1658),
				  5121, null, 0);
	method3168(true);
    }
    
    Interface4 method16285(int i, int i_6_) {
	return new Class150(this, i, i_6_);
    }
}
