/* Class142_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class142_Sub4 extends Class142
{
    int anInt10643;
    int anInt10644;
    
    void method16900(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
	Class105 class105
	    = ((Class142_Sub4) this).aClass103_Sub1_1655.method2237((byte) 4);
	if (class105 != null) {
	    int i_5_ = class105.method2654() - (i_4_ + i_2_);
	    ((Class142_Sub4) this).aClass103_Sub1_1655.method15177(this);
	    OpenGL.glCopyTexSubImage2D(((Class142_Sub4) this).anInt1654, 0, i,
				       (((Class142_Sub4) this).anInt10643
					- (i_0_ + i_2_)),
				       i_3_, i_5_, i_1_, i_2_);
	    OpenGL.glFlush();
	}
    }
    
    Class142_Sub4(Class103_Sub1 class103_sub1, int i, int i_6_, int i_7_,
		  int i_8_, int i_9_) {
	super(class103_sub1, i, Class175.aClass175_2111,
	      Class102.aClass102_1440, i_8_ * i_9_, false);
	((Class142_Sub4) this).anInt10644 = i_8_;
	((Class142_Sub4) this).anInt10643 = i_9_;
	((Class142_Sub4) this).aClass103_Sub1_1655.method15177(this);
	Class105 class105
	    = ((Class142_Sub4) this).aClass103_Sub1_1655.method2237((byte) 4);
	if (class105 != null) {
	    int i_10_ = class105.method2654() - (i_7_ + i_9_);
	    int i_11_ = Class103_Sub1.method15203((((Class142_Sub4) this)
						   .aClass175_1658),
						  (((Class142_Sub4) this)
						   .aClass102_1656));
	    OpenGL.glCopyTexImage2D(((Class142_Sub4) this).anInt1654, 0, i_11_,
				    i_6_, i_10_, i_8_, i_9_, 0);
	}
	method3168(true);
    }
    
    Class142_Sub4(Class103_Sub1 class103_sub1, int i, int i_12_, int i_13_,
		  boolean bool, int[] is, int i_14_, int i_15_,
		  boolean bool_16_) {
	super(class103_sub1, i, Class175.aClass175_2110,
	      Class102.aClass102_1440, i_12_ * i_13_, bool);
	((Class142_Sub4) this).anInt10644 = i_12_;
	((Class142_Sub4) this).anInt10643 = i_13_;
	if (bool_16_) {
	    int[] is_17_ = new int[is.length];
	    for (int i_18_ = 0; i_18_ < i_13_; i_18_++) {
		int i_19_ = i_18_ * i_12_;
		int i_20_ = (i_13_ - i_18_ - 1) * i_12_;
		for (int i_21_ = 0; i_21_ < i_12_; i_21_++)
		    is_17_[i_19_++] = is[i_20_++];
	    }
	    is = is_17_;
	}
	((Class142_Sub4) this).aClass103_Sub1_1655.method15177(this);
	if (((Class142_Sub4) this).anInt1654 == 34037 || !bool || i_14_ != 0
	    || i_15_ != 0) {
	    OpenGL.glPixelStorei(3314, i_14_);
	    OpenGL.glTexImage2Di(((Class142_Sub4) this).anInt1654, 0,
				 (Class103_Sub1.method15203
				  (((Class142_Sub4) this).aClass175_1658,
				   ((Class142_Sub4) this).aClass102_1656)),
				 ((Class142_Sub4) this).anInt10644,
				 ((Class142_Sub4) this).anInt10643, 0, 32993,
				 (((Class103_Sub1)
				   ((Class142_Sub4) this).aClass103_Sub1_1655)
				  .anInt9220),
				 is, i_15_ * 4);
	    OpenGL.glPixelStorei(3314, 0);
	    method3171(false);
	} else {
	    method3191(((Class142_Sub4) this).anInt1654,
		       Class103_Sub1.method15203((((Class142_Sub4) this)
						  .aClass175_1658),
						 (((Class142_Sub4) this)
						  .aClass102_1656)),
		       ((Class142_Sub4) this).anInt10644,
		       ((Class142_Sub4) this).anInt10643, 32993,
		       ((Class103_Sub1)
			((Class142_Sub4) this).aClass103_Sub1_1655).anInt9220,
		       is);
	    method3171(true);
	}
	method3168(true);
    }
    
    Class142_Sub4(Class103_Sub1 class103_sub1, int i, Class175 class175,
		  Class102 class102, int i_22_, int i_23_, boolean bool,
		  byte[] is, Class175 class175_24_, boolean bool_25_) {
	super(class103_sub1, i, class175, class102, i_22_ * i_23_, bool);
	((Class142_Sub4) this).anInt10644 = i_22_;
	((Class142_Sub4) this).anInt10643 = i_23_;
	if (bool_25_) {
	    byte[] is_26_ = new byte[is.length];
	    for (int i_27_ = 0; i_27_ < i_23_; i_27_++) {
		int i_28_ = i_27_ * i_22_;
		int i_29_ = (i_23_ - i_27_ - 1) * i_22_;
		for (int i_30_ = 0; i_30_ < i_22_; i_30_++)
		    is_26_[i_28_++] = is[i_29_++];
	    }
	    is = is_26_;
	}
	((Class142_Sub4) this).aClass103_Sub1_1655.method15177(this);
	OpenGL.glPixelStorei(3317, 1);
	if (bool && ((Class142_Sub4) this).anInt1654 != 34037) {
	    method3178(i,
		       Class103_Sub1.method15203((((Class142_Sub4) this)
						  .aClass175_1658),
						 (((Class142_Sub4) this)
						  .aClass102_1656)),
		       i_22_, i_23_, class175_24_, is);
	    method3171(true);
	} else {
	    OpenGL.glTexImage2Dub(((Class142_Sub4) this).anInt1654, 0,
				  (Class103_Sub1.method15203
				   (((Class142_Sub4) this).aClass175_1658,
				    ((Class142_Sub4) this).aClass102_1656)),
				  ((Class142_Sub4) this).anInt10644,
				  ((Class142_Sub4) this).anInt10643, 0,
				  Class103_Sub1.method15202(class175_24_),
				  5121, is, 0);
	    method3171(false);
	}
	OpenGL.glPixelStorei(3317, 4);
	method3168(true);
    }
    
    Interface4 method16901(int i) {
	return new Class169(this, i);
    }
    
    Interface4 method16902(int i) {
	return new Class169(this, i);
    }
    
    void method16903(int i, int i_31_, int i_32_, int i_33_, byte[] is,
		     Class175 class175, int i_34_, int i_35_, boolean bool) {
	if (i_35_ == 0)
	    i_35_ = i_32_;
	if (bool) {
	    int i_36_ = class175.anInt2121 * 1893442799;
	    int i_37_ = i_36_ * i_32_;
	    int i_38_ = i_36_ * i_35_;
	    byte[] is_39_ = new byte[i_37_ * i_33_];
	    for (int i_40_ = 0; i_40_ < i_33_; i_40_++) {
		int i_41_ = i_40_ * i_37_;
		int i_42_ = (i_33_ - i_40_ - 1) * i_38_ + i_34_;
		for (int i_43_ = 0; i_43_ < i_37_; i_43_++)
		    is_39_[i_41_++] = is[i_42_++];
	    }
	    is = is_39_;
	}
	((Class142_Sub4) this).aClass103_Sub1_1655.method15177(this);
	OpenGL.glPixelStorei(3317, 1);
	if (i_35_ != i_32_)
	    OpenGL.glPixelStorei(3314, i_35_);
	OpenGL.glTexSubImage2Dub(((Class142_Sub4) this).anInt1654, 0, i,
				 (((Class142_Sub4) this).anInt10643 - i_31_
				  - i_33_),
				 i_32_, i_33_,
				 Class103_Sub1.method15202(class175), 5121, is,
				 i_34_);
	if (i_35_ != i_32_)
	    OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    void method16904(int i, int i_44_, int i_45_, int i_46_, int[] is,
		     int i_47_, int i_48_, boolean bool) {
	if (i_48_ == 0)
	    i_48_ = i_45_;
	if (bool) {
	    int[] is_49_ = new int[i_45_ * i_46_];
	    for (int i_50_ = 0; i_50_ < i_46_; i_50_++) {
		int i_51_ = i_50_ * i_45_;
		int i_52_ = (i_46_ - i_50_ - 1) * i_48_ + i_47_;
		for (int i_53_ = 0; i_53_ < i_45_; i_53_++)
		    is_49_[i_51_++] = is[i_52_++];
	    }
	    is = is_49_;
	}
	((Class142_Sub4) this).aClass103_Sub1_1655.method15177(this);
	if (i_45_ != i_48_)
	    OpenGL.glPixelStorei(3314, i_48_);
	OpenGL.glTexSubImage2Di(((Class142_Sub4) this).anInt1654, 0, i,
				(((Class142_Sub4) this).anInt10643 - i_44_
				 - i_46_),
				i_45_, i_46_, 32993,
				(((Class103_Sub1)
				  ((Class142_Sub4) this).aClass103_Sub1_1655)
				 .anInt9220),
				is, i_47_);
	if (i_45_ != i_48_)
	    OpenGL.glPixelStorei(3314, 0);
    }
    
    void method16905(int i, int i_54_, int i_55_, int i_56_, int i_57_,
		     int i_58_) {
	Class105 class105
	    = ((Class142_Sub4) this).aClass103_Sub1_1655.method2237((byte) 4);
	if (class105 != null) {
	    int i_59_ = class105.method2654() - (i_58_ + i_56_);
	    ((Class142_Sub4) this).aClass103_Sub1_1655.method15177(this);
	    OpenGL.glCopyTexSubImage2D(((Class142_Sub4) this).anInt1654, 0, i,
				       (((Class142_Sub4) this).anInt10643
					- (i_54_ + i_56_)),
				       i_57_, i_59_, i_55_, i_56_);
	    OpenGL.glFlush();
	}
    }
    
    void method16906(boolean bool, boolean bool_60_) {
	if (((Class142_Sub4) this).anInt1654 == 3553) {
	    ((Class142_Sub4) this).aClass103_Sub1_1655.method15177(this);
	    OpenGL.glTexParameteri(((Class142_Sub4) this).anInt1654, 10242,
				   bool ? 10497 : 33071);
	    OpenGL.glTexParameteri(((Class142_Sub4) this).anInt1654, 10243,
				   bool_60_ ? 10497 : 33071);
	}
    }
    
    Class142_Sub4(Class103_Sub1 class103_sub1, int i, Class175 class175,
		  Class102 class102, int i_61_, int i_62_) {
	super(class103_sub1, i, class175, class102, i_61_ * i_62_, false);
	((Class142_Sub4) this).anInt10644 = i_61_;
	((Class142_Sub4) this).anInt10643 = i_62_;
	((Class142_Sub4) this).aClass103_Sub1_1655.method15177(this);
	OpenGL.glTexImage2Dub
	    (((Class142_Sub4) this).anInt1654, 0,
	     Class103_Sub1.method15203(((Class142_Sub4) this).aClass175_1658,
				       ((Class142_Sub4) this).aClass102_1656),
	     i_61_, i_62_, 0,
	     Class103_Sub1.method15202(((Class142_Sub4) this).aClass175_1658),
	     5121, null, 0);
	method3168(true);
    }
    
    void method16907(int i, int i_63_, int i_64_, int i_65_, byte[] is,
		     Class175 class175, int i_66_, int i_67_, boolean bool) {
	if (i_67_ == 0)
	    i_67_ = i_64_;
	if (bool) {
	    int i_68_ = class175.anInt2121 * 1893442799;
	    int i_69_ = i_68_ * i_64_;
	    int i_70_ = i_68_ * i_67_;
	    byte[] is_71_ = new byte[i_69_ * i_65_];
	    for (int i_72_ = 0; i_72_ < i_65_; i_72_++) {
		int i_73_ = i_72_ * i_69_;
		int i_74_ = (i_65_ - i_72_ - 1) * i_70_ + i_66_;
		for (int i_75_ = 0; i_75_ < i_69_; i_75_++)
		    is_71_[i_73_++] = is[i_74_++];
	    }
	    is = is_71_;
	}
	((Class142_Sub4) this).aClass103_Sub1_1655.method15177(this);
	OpenGL.glPixelStorei(3317, 1);
	if (i_67_ != i_64_)
	    OpenGL.glPixelStorei(3314, i_67_);
	OpenGL.glTexSubImage2Dub(((Class142_Sub4) this).anInt1654, 0, i,
				 (((Class142_Sub4) this).anInt10643 - i_63_
				  - i_65_),
				 i_64_, i_65_,
				 Class103_Sub1.method15202(class175), 5121, is,
				 i_66_);
	if (i_67_ != i_64_)
	    OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    void method16908(int i, int i_76_, int i_77_, int i_78_, int i_79_,
		     int i_80_) {
	Class105 class105
	    = ((Class142_Sub4) this).aClass103_Sub1_1655.method2237((byte) 4);
	if (class105 != null) {
	    int i_81_ = class105.method2654() - (i_80_ + i_78_);
	    ((Class142_Sub4) this).aClass103_Sub1_1655.method15177(this);
	    OpenGL.glCopyTexSubImage2D(((Class142_Sub4) this).anInt1654, 0, i,
				       (((Class142_Sub4) this).anInt10643
					- (i_76_ + i_78_)),
				       i_79_, i_81_, i_77_, i_78_);
	    OpenGL.glFlush();
	}
    }
    
    Interface5 method16909(int i) {
	return new Class169(this, i);
    }
    
    void method16910(int i, int i_82_, int i_83_, int i_84_, int i_85_,
		     int i_86_) {
	Class105 class105
	    = ((Class142_Sub4) this).aClass103_Sub1_1655.method2237((byte) 4);
	if (class105 != null) {
	    int i_87_ = class105.method2654() - (i_86_ + i_84_);
	    ((Class142_Sub4) this).aClass103_Sub1_1655.method15177(this);
	    OpenGL.glCopyTexSubImage2D(((Class142_Sub4) this).anInt1654, 0, i,
				       (((Class142_Sub4) this).anInt10643
					- (i_82_ + i_84_)),
				       i_85_, i_87_, i_83_, i_84_);
	    OpenGL.glFlush();
	}
    }
    
    Interface5 method16911(int i) {
	return new Class169(this, i);
    }
    
    Class142_Sub4(Class103_Sub1 class103_sub1, int i, Class175 class175,
		  Class102 class102, int i_88_, int i_89_, boolean bool,
		  float[] fs, Class175 class175_90_) {
	super(class103_sub1, i, class175, class102, i_88_ * i_89_, bool);
	((Class142_Sub4) this).anInt10644 = i_88_;
	((Class142_Sub4) this).anInt10643 = i_89_;
	((Class142_Sub4) this).aClass103_Sub1_1655.method15177(this);
	if (bool && ((Class142_Sub4) this).anInt1654 != 34037) {
	    method3197(i,
		       Class103_Sub1.method15203((((Class142_Sub4) this)
						  .aClass175_1658),
						 (((Class142_Sub4) this)
						  .aClass102_1656)),
		       i_88_, i_89_, class175_90_, fs);
	    method3171(true);
	} else {
	    OpenGL.glTexImage2Df(((Class142_Sub4) this).anInt1654, 0,
				 (Class103_Sub1.method15203
				  (((Class142_Sub4) this).aClass175_1658,
				   ((Class142_Sub4) this).aClass102_1656)),
				 ((Class142_Sub4) this).anInt10644,
				 ((Class142_Sub4) this).anInt10643, 0,
				 Class103_Sub1.method15202(class175_90_), 5126,
				 fs, 0);
	    method3171(false);
	}
	method3168(true);
    }
}
