/* Class96_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class96_Sub6 extends Class96
{
    Class137 aClass137_9800;
    Class142_Sub4_Sub1 aClass142_Sub4_Sub1_9801;
    Class103_Sub1 aClass103_Sub1_9802;
    boolean aBool9803;
    
    Class96_Sub6(Class103_Sub1 class103_sub1, Class639 class639,
		 Class108[] class108s, boolean bool) {
	super(class103_sub1, class639);
	((Class96_Sub6) this).aClass103_Sub1_9802 = class103_sub1;
	int i = 0;
	for (int i_0_ = 0; i_0_ < 256; i_0_++) {
	    Class108 class108 = class108s[i_0_];
	    if (class108.method2694() > i)
		i = class108.method2694();
	    if (class108.method2698() > i)
		i = class108.method2698();
	}
	int i_1_ = i * 16;
	if (bool) {
	    byte[] is = new byte[i_1_ * i_1_];
	    for (int i_2_ = 0; i_2_ < 256; i_2_++) {
		Class108 class108 = class108s[i_2_];
		int i_3_ = class108.method2694();
		int i_4_ = class108.method2698();
		int i_5_ = i_2_ % 16 * i;
		int i_6_ = i_2_ / 16 * i;
		int i_7_ = i_6_ * i_1_ + i_5_;
		int i_8_ = 0;
		if (class108.method2691()) {
		    Class108_Sub2 class108_sub2
			= (Class108_Sub2) class108s[i_2_];
		    if (!class108_sub2.method2692()) {
			byte[] is_9_ = class108_sub2.aByteArray9309;
			for (int i_10_ = 0; i_10_ < i_3_; i_10_++) {
			    for (int i_11_ = 0; i_11_ < i_4_; i_11_++)
				is[i_7_++]
				    = (byte) (is_9_[i_8_++] == 0 ? 0 : -1);
			    i_7_ += i_1_ - i_4_;
			}
		    } else {
			byte[] is_12_ = class108_sub2.aByteArray9310;
			for (int i_13_ = 0; i_13_ < i_3_; i_13_++) {
			    for (int i_14_ = 0; i_14_ < i_4_; i_14_++)
				is[i_7_++] = is_12_[i_8_++];
			    i_7_ += i_1_ - i_4_;
			}
		    }
		} else {
		    Class108_Sub1 class108_sub1
			= (Class108_Sub1) class108s[i_2_];
		    int[] is_15_ = class108_sub1.method2707(false);
		    if (!class108_sub1.method2692()) {
			for (int i_16_ = 0; i_16_ < i_3_; i_16_++) {
			    for (int i_17_ = 0; i_17_ < i_4_; i_17_++) {
				int i_18_ = is_15_[i_8_++];
				byte i_19_ = (byte) (((i_18_ >> 16 & 0xff) * 3
						      + (i_18_ >> 8 & 0xff) * 4
						      + (i_18_ & 0xff))
						     >> 3);
				is[i_7_++] = i_19_;
			    }
			    i_7_ += i_1_ - i_4_;
			}
		    } else {
			for (int i_20_ = 0; i_20_ < i_3_; i_20_++) {
			    for (int i_21_ = 0; i_21_ < i_4_; i_21_++)
				is[i_7_++]
				    = (byte) (is_15_[i_8_++] >> 24 & 0xff);
			    i_7_ += i_1_ - i_4_;
			}
		    }
		}
	    }
	    ((Class96_Sub6) this).aClass142_Sub4_Sub1_9801
		= Class142_Sub4_Sub1.method16946(class103_sub1,
						 Class175.aClass175_2112,
						 Class102.aClass102_1440, i_1_,
						 i_1_, false, is,
						 Class175.aClass175_2112);
	    ((Class96_Sub6) this).aBool9803 = true;
	} else {
	    int[] is = new int[i_1_ * i_1_];
	    for (int i_22_ = 0; i_22_ < 256; i_22_++) {
		Class108 class108 = class108s[i_22_];
		int i_23_ = class108.method2694();
		int i_24_ = class108.method2698();
		int i_25_ = i_22_ % 16 * i;
		int i_26_ = i_22_ / 16 * i;
		int i_27_ = i_26_ * i_1_ + i_25_;
		int i_28_ = 0;
		if (class108.method2691()) {
		    Class108_Sub2 class108_sub2
			= (Class108_Sub2) class108s[i_22_];
		    int[] is_29_ = class108_sub2.anIntArray9308;
		    byte[] is_30_ = class108_sub2.aByteArray9310;
		    byte[] is_31_ = class108_sub2.aByteArray9309;
		    if (is_30_ != null) {
			for (int i_32_ = 0; i_32_ < i_23_; i_32_++) {
			    for (int i_33_ = 0; i_33_ < i_24_; i_33_++) {
				is[i_27_++] = (is_30_[i_28_] << 24
					       | is_29_[is_31_[i_28_] & 0xff]);
				i_28_++;
			    }
			    i_27_ += i_1_ - i_24_;
			}
		    } else {
			for (int i_34_ = 0; i_34_ < i_23_; i_34_++) {
			    for (int i_35_ = 0; i_35_ < i_24_; i_35_++) {
				int i_36_;
				if ((i_36_ = is_31_[i_28_++]) != 0)
				    is[i_27_++]
					= ~0xffffff | is_29_[i_36_ & 0xff];
				else
				    i_27_++;
			    }
			    i_27_ += i_1_ - i_24_;
			}
		    }
		} else {
		    Class108_Sub1 class108_sub1
			= (Class108_Sub1) class108s[i_22_];
		    int[] is_37_ = class108_sub1.method2707(false);
		    if (!class108_sub1.method2692()) {
			for (int i_38_ = 0; i_38_ < i_23_; i_38_++) {
			    for (int i_39_ = 0; i_39_ < i_24_; i_39_++) {
				int i_40_ = is_37_[i_28_] & 0xffffff;
				is[i_27_++]
				    = (i_40_ == 0 ? 0 : 255) << 24 | i_40_;
				i_28_++;
			    }
			    i_27_ += i_1_ - i_24_;
			}
		    } else {
			for (int i_41_ = 0; i_41_ < i_23_; i_41_++) {
			    for (int i_42_ = 0; i_42_ < i_24_; i_42_++)
				is[i_27_++] = is_37_[i_28_++];
			    i_27_ += i_1_ - i_24_;
			}
		    }
		}
	    }
	    ((Class96_Sub6) this).aClass142_Sub4_Sub1_9801
		= Class142_Sub4_Sub1.method16947(class103_sub1, i_1_, i_1_,
						 false, is, 0, 0);
	    ((Class96_Sub6) this).aBool9803 = false;
	}
	((Class96_Sub6) this).aClass142_Sub4_Sub1_9801.method3168(false);
	((Class96_Sub6) this).aClass137_9800
	    = new Class137(class103_sub1, 256);
	float f = (((Class142_Sub4_Sub1)
		    ((Class96_Sub6) this).aClass142_Sub4_Sub1_9801).aFloat10701
		   / (float) (((Class142_Sub4_Sub1)
			       ((Class96_Sub6) this).aClass142_Sub4_Sub1_9801)
			      .anInt10699));
	float f_43_
	    = (((Class142_Sub4_Sub1)
		((Class96_Sub6) this).aClass142_Sub4_Sub1_9801).aFloat10700
	       / (float) (((Class142_Sub4_Sub1)
			   ((Class96_Sub6) this).aClass142_Sub4_Sub1_9801)
			  .anInt10703));
	for (int i_44_ = 0; i_44_ < 256; i_44_++) {
	    Class108 class108 = class108s[i_44_];
	    int i_45_ = class108.method2694();
	    int i_46_ = class108.method2698();
	    int i_47_ = class108.method2697();
	    int i_48_ = class108.method2695();
	    float f_49_ = (float) (i_44_ % 16 * i);
	    float f_50_ = (float) (i_44_ / 16 * i);
	    float f_51_ = f_49_ * f;
	    float f_52_ = f_50_ * f_43_;
	    float f_53_ = (f_49_ + (float) i_46_) * f;
	    float f_54_ = (f_50_ + (float) i_45_) * f_43_;
	    ((Class96_Sub6) this).aClass137_9800.method3112(i_44_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(f_51_, (((Class142_Sub4_Sub1)
					 (((Class96_Sub6) this)
					  .aClass142_Sub4_Sub1_9801))
					.aFloat10700) - f_52_);
	    OpenGL.glVertex2i(i_48_, i_47_);
	    OpenGL.glTexCoord2f(f_51_, (((Class142_Sub4_Sub1)
					 (((Class96_Sub6) this)
					  .aClass142_Sub4_Sub1_9801))
					.aFloat10700) - f_54_);
	    OpenGL.glVertex2i(i_48_, i_47_ + i_45_);
	    OpenGL.glTexCoord2f(f_53_, (((Class142_Sub4_Sub1)
					 (((Class96_Sub6) this)
					  .aClass142_Sub4_Sub1_9801))
					.aFloat10700) - f_54_);
	    OpenGL.glVertex2i(i_48_ + i_46_, i_47_ + i_45_);
	    OpenGL.glTexCoord2f(f_53_, (((Class142_Sub4_Sub1)
					 (((Class96_Sub6) this)
					  .aClass142_Sub4_Sub1_9801))
					.aFloat10700) - f_52_);
	    OpenGL.glVertex2i(i_48_ + i_46_, i_47_);
	    OpenGL.glEnd();
	    ((Class96_Sub6) this).aClass137_9800.method3114();
	}
    }
    
    void method2123(char c, int i, int i_55_, int i_56_, boolean bool) {
	((Class96_Sub6) this).aClass103_Sub1_9802.method15193();
	((Class96_Sub6) this).aClass103_Sub1_9802
	    .method15177(((Class96_Sub6) this).aClass142_Sub4_Sub1_9801);
	if (((Class96_Sub6) this).aBool9803 || bool) {
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15180(7681, 8448);
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 34168,
								  768);
	} else
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15180(7681, 7681);
	OpenGL.glColor4ub((byte) (i_56_ >> 16), (byte) (i_56_ >> 8),
			  (byte) i_56_, (byte) (i_56_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_55_, 0.0F);
	((Class96_Sub6) this).aClass137_9800.method3113(c);
	OpenGL.glLoadIdentity();
	if (((Class96_Sub6) this).aBool9803 || bool)
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 5890,
								  768);
    }
    
    void method2140(char c, int i, int i_57_, int i_58_, boolean bool,
		    Class135 class135, int i_59_, int i_60_) {
	Class135_Sub3 class135_sub3 = (Class135_Sub3) class135;
	Class142_Sub4_Sub1 class142_sub4_sub1
	    = ((Class135_Sub3) class135_sub3).aClass142_Sub4_Sub1_10030;
	((Class96_Sub6) this).aClass103_Sub1_9802.method15193();
	((Class96_Sub6) this).aClass103_Sub1_9802
	    .method15177(((Class96_Sub6) this).aClass142_Sub4_Sub1_9801);
	if (((Class96_Sub6) this).aBool9803 || bool) {
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15180(7681, 8448);
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 34168,
								  768);
	} else
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15180(7681, 7681);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15225(1);
	((Class96_Sub6) this).aClass103_Sub1_9802
	    .method15177(class142_sub4_sub1);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15180(7681, 8448);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	float f
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10701
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10699);
	float f_61_
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10700
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10703);
	OpenGL.glTexGenfv(8192, 9474,
			  new float[] { f, 0.0F, 0.0F, (float) -i_59_ * f },
			  0);
	OpenGL.glTexGenfv(8193, 9474,
			  new float[] { 0.0F, f_61_, 0.0F,
					(float) -i_60_ * f_61_ },
			  0);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glColor4ub((byte) (i_58_ >> 16), (byte) (i_58_ >> 8),
			  (byte) i_58_, (byte) (i_58_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_57_, 0.0F);
	((Class96_Sub6) this).aClass137_9800.method3113(c);
	OpenGL.glLoadIdentity();
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 5890, 768);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15180(8448, 8448);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15177(null);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15225(0);
	if (((Class96_Sub6) this).aBool9803 || bool)
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 5890,
								  768);
    }
    
    void method2153(char c, int i, int i_62_, int i_63_, boolean bool) {
	((Class96_Sub6) this).aClass103_Sub1_9802.method15193();
	((Class96_Sub6) this).aClass103_Sub1_9802
	    .method15177(((Class96_Sub6) this).aClass142_Sub4_Sub1_9801);
	if (((Class96_Sub6) this).aBool9803 || bool) {
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15180(7681, 8448);
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 34168,
								  768);
	} else
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15180(7681, 7681);
	OpenGL.glColor4ub((byte) (i_63_ >> 16), (byte) (i_63_ >> 8),
			  (byte) i_63_, (byte) (i_63_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_62_, 0.0F);
	((Class96_Sub6) this).aClass137_9800.method3113(c);
	OpenGL.glLoadIdentity();
	if (((Class96_Sub6) this).aBool9803 || bool)
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 5890,
								  768);
    }
    
    void method2129(char c, int i, int i_64_, int i_65_, boolean bool) {
	((Class96_Sub6) this).aClass103_Sub1_9802.method15193();
	((Class96_Sub6) this).aClass103_Sub1_9802
	    .method15177(((Class96_Sub6) this).aClass142_Sub4_Sub1_9801);
	if (((Class96_Sub6) this).aBool9803 || bool) {
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15180(7681, 8448);
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 34168,
								  768);
	} else
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15180(7681, 7681);
	OpenGL.glColor4ub((byte) (i_65_ >> 16), (byte) (i_65_ >> 8),
			  (byte) i_65_, (byte) (i_65_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_64_, 0.0F);
	((Class96_Sub6) this).aClass137_9800.method3113(c);
	OpenGL.glLoadIdentity();
	if (((Class96_Sub6) this).aBool9803 || bool)
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 5890,
								  768);
    }
    
    void method2154(char c, int i, int i_66_, int i_67_, boolean bool) {
	((Class96_Sub6) this).aClass103_Sub1_9802.method15193();
	((Class96_Sub6) this).aClass103_Sub1_9802
	    .method15177(((Class96_Sub6) this).aClass142_Sub4_Sub1_9801);
	if (((Class96_Sub6) this).aBool9803 || bool) {
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15180(7681, 8448);
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 34168,
								  768);
	} else
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15180(7681, 7681);
	OpenGL.glColor4ub((byte) (i_67_ >> 16), (byte) (i_67_ >> 8),
			  (byte) i_67_, (byte) (i_67_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_66_, 0.0F);
	((Class96_Sub6) this).aClass137_9800.method3113(c);
	OpenGL.glLoadIdentity();
	if (((Class96_Sub6) this).aBool9803 || bool)
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 5890,
								  768);
    }
    
    void method2126(char c, int i, int i_68_, int i_69_, boolean bool) {
	((Class96_Sub6) this).aClass103_Sub1_9802.method15193();
	((Class96_Sub6) this).aClass103_Sub1_9802
	    .method15177(((Class96_Sub6) this).aClass142_Sub4_Sub1_9801);
	if (((Class96_Sub6) this).aBool9803 || bool) {
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15180(7681, 8448);
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 34168,
								  768);
	} else
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15180(7681, 7681);
	OpenGL.glColor4ub((byte) (i_69_ >> 16), (byte) (i_69_ >> 8),
			  (byte) i_69_, (byte) (i_69_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_68_, 0.0F);
	((Class96_Sub6) this).aClass137_9800.method3113(c);
	OpenGL.glLoadIdentity();
	if (((Class96_Sub6) this).aBool9803 || bool)
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 5890,
								  768);
    }
    
    void method2131(char c, int i, int i_70_, int i_71_, boolean bool,
		    Class135 class135, int i_72_, int i_73_) {
	Class135_Sub3 class135_sub3 = (Class135_Sub3) class135;
	Class142_Sub4_Sub1 class142_sub4_sub1
	    = ((Class135_Sub3) class135_sub3).aClass142_Sub4_Sub1_10030;
	((Class96_Sub6) this).aClass103_Sub1_9802.method15193();
	((Class96_Sub6) this).aClass103_Sub1_9802
	    .method15177(((Class96_Sub6) this).aClass142_Sub4_Sub1_9801);
	if (((Class96_Sub6) this).aBool9803 || bool) {
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15180(7681, 8448);
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 34168,
								  768);
	} else
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15180(7681, 7681);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15225(1);
	((Class96_Sub6) this).aClass103_Sub1_9802
	    .method15177(class142_sub4_sub1);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15180(7681, 8448);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	float f
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10701
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10699);
	float f_74_
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10700
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10703);
	OpenGL.glTexGenfv(8192, 9474,
			  new float[] { f, 0.0F, 0.0F, (float) -i_72_ * f },
			  0);
	OpenGL.glTexGenfv(8193, 9474,
			  new float[] { 0.0F, f_74_, 0.0F,
					(float) -i_73_ * f_74_ },
			  0);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glColor4ub((byte) (i_71_ >> 16), (byte) (i_71_ >> 8),
			  (byte) i_71_, (byte) (i_71_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_70_, 0.0F);
	((Class96_Sub6) this).aClass137_9800.method3113(c);
	OpenGL.glLoadIdentity();
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 5890, 768);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15180(8448, 8448);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15177(null);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15225(0);
	if (((Class96_Sub6) this).aBool9803 || bool)
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 5890,
								  768);
    }
    
    void method2151(char c, int i, int i_75_, int i_76_, boolean bool,
		    Class135 class135, int i_77_, int i_78_) {
	Class135_Sub3 class135_sub3 = (Class135_Sub3) class135;
	Class142_Sub4_Sub1 class142_sub4_sub1
	    = ((Class135_Sub3) class135_sub3).aClass142_Sub4_Sub1_10030;
	((Class96_Sub6) this).aClass103_Sub1_9802.method15193();
	((Class96_Sub6) this).aClass103_Sub1_9802
	    .method15177(((Class96_Sub6) this).aClass142_Sub4_Sub1_9801);
	if (((Class96_Sub6) this).aBool9803 || bool) {
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15180(7681, 8448);
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 34168,
								  768);
	} else
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15180(7681, 7681);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15225(1);
	((Class96_Sub6) this).aClass103_Sub1_9802
	    .method15177(class142_sub4_sub1);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15180(7681, 8448);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	float f
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10701
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10699);
	float f_79_
	    = (((Class142_Sub4_Sub1) class142_sub4_sub1).aFloat10700
	       / (float) ((Class142_Sub4_Sub1) class142_sub4_sub1).anInt10703);
	OpenGL.glTexGenfv(8192, 9474,
			  new float[] { f, 0.0F, 0.0F, (float) -i_77_ * f },
			  0);
	OpenGL.glTexGenfv(8193, 9474,
			  new float[] { 0.0F, f_79_, 0.0F,
					(float) -i_78_ * f_79_ },
			  0);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glColor4ub((byte) (i_76_ >> 16), (byte) (i_76_ >> 8),
			  (byte) i_76_, (byte) (i_76_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_75_, 0.0F);
	((Class96_Sub6) this).aClass137_9800.method3113(c);
	OpenGL.glLoadIdentity();
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 5890, 768);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15180(8448, 8448);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15177(null);
	((Class96_Sub6) this).aClass103_Sub1_9802.method15225(0);
	if (((Class96_Sub6) this).aBool9803 || bool)
	    ((Class96_Sub6) this).aClass103_Sub1_9802.method15181(0, 5890,
								  768);
    }
}
