/* Class226 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public abstract class Class226 implements Interface31
{
    static final int anInt2656 = 3553;
    static final int anInt2657 = 32879;
    static final int anInt2658 = 34067;
    static int[] anIntArray2659 = new int[1];
    int anInt2660;
    int anInt2661;
    static final int anInt2662 = 0;
    Class175 aClass175_2663;
    Class102 aClass102_2664;
    boolean aBool2665;
    Class312 aClass312_2666 = Class312.aClass312_4830;
    int anInt2667;
    Class103_Sub3_Sub2 aClass103_Sub3_Sub2_2668;
    
    void method4629(int i, int i_0_, int i_1_, int[] is) {
	if (((Class226) this).anInt2661 == 0)
	    throw new IllegalStateException("");
	if (i_0_ > 0 && !Class76.method1772(i_0_, (byte) 112))
	    throw new IllegalArgumentException("");
	if (i_1_ > 0 && !Class76.method1772(i_1_, (byte) 106))
	    throw new IllegalArgumentException("");
	if (((Class226) this).aClass175_2663 != Class175.aClass175_2110)
	    throw new IllegalArgumentException("");
	int i_2_ = 0;
	int i_3_ = i_0_ < i_1_ ? i_0_ : i_1_;
	int i_4_ = i_0_ >> 1;
	int i_5_ = i_1_ >> 1;
	int[] is_6_ = is;
	int[] is_7_ = new int[i_4_ * i_5_];
	for (;;) {
	    OpenGL.glTexImage2Di(i, i_2_,
				 (Class103_Sub3_Sub2.method17559
				  (((Class226) this).aClass175_2663,
				   ((Class226) this).aClass102_2664)),
				 i_0_, i_1_, 0, 32993,
				 (((Class103_Sub3_Sub2)
				   ((Class226) this).aClass103_Sub3_Sub2_2668)
				  .anInt11165),
				 is_6_, 0);
	    if (i_3_ <= 1)
		break;
	    int i_8_ = 0;
	    int i_9_ = 0;
	    int i_10_ = i_9_ + i_0_;
	    for (int i_11_ = 0; i_11_ < i_5_; i_11_++) {
		for (int i_12_ = 0; i_12_ < i_4_; i_12_++) {
		    int i_13_ = is_6_[i_9_++];
		    int i_14_ = is_6_[i_9_++];
		    int i_15_ = is_6_[i_10_++];
		    int i_16_ = is_6_[i_10_++];
		    int i_17_ = i_13_ >> 24 & 0xff;
		    int i_18_ = i_13_ >> 16 & 0xff;
		    int i_19_ = i_13_ >> 8 & 0xff;
		    int i_20_ = i_13_ & 0xff;
		    i_17_ += i_14_ >> 24 & 0xff;
		    i_18_ += i_14_ >> 16 & 0xff;
		    i_19_ += i_14_ >> 8 & 0xff;
		    i_20_ += i_14_ & 0xff;
		    i_17_ += i_15_ >> 24 & 0xff;
		    i_18_ += i_15_ >> 16 & 0xff;
		    i_19_ += i_15_ >> 8 & 0xff;
		    i_20_ += i_15_ & 0xff;
		    i_17_ += i_16_ >> 24 & 0xff;
		    i_18_ += i_16_ >> 16 & 0xff;
		    i_19_ += i_16_ >> 8 & 0xff;
		    i_20_ += i_16_ & 0xff;
		    is_7_[i_8_++]
			= ((i_17_ & 0x3fc) << 22 | (i_18_ & 0x3fc) << 14
			   | (i_19_ & 0x3fc) << 6 | (i_20_ & 0x3fc) >> 2);
		}
		i_9_ += i_0_;
		i_10_ += i_0_;
	    }
	    int[] is_21_ = is_7_;
	    is_7_ = is_6_;
	    is_6_ = is_21_;
	    i_0_ = i_4_;
	    i_1_ = i_5_;
	    i_4_ >>= 1;
	    i_5_ >>= 1;
	    i_3_ >>= 1;
	    i_2_++;
	}
    }
    
    void method4630() {
	if (((Class226) this).anInt2661 != 0) {
	    ((Class226) this).aClass103_Sub3_Sub2_2668
		.method17547(((Class226) this).anInt2661, method4635());
	    ((Class226) this).anInt2661 = 0;
	}
    }
    
    public void method176(Class312 class312) {
	if (((Class226) this).aClass312_2666 != class312) {
	    ((Class226) this).aClass312_2666 = class312;
	    method4631();
	}
    }
    
    void method4631() {
	if (((Class226) this).anInt2661 == 0)
	    throw new IllegalStateException("");
	((Class226) this).aClass103_Sub3_Sub2_2668.method15856(this);
	if (((Class226) this).aClass312_2666 == Class312.aClass312_4830) {
	    OpenGL.glTexParameteri(((Class226) this).anInt2660, 10241,
				   ((Class226) this).aBool2665 ? 9987 : 9729);
	    OpenGL.glTexParameteri(((Class226) this).anInt2660, 10240, 9729);
	} else {
	    OpenGL.glTexParameteri(((Class226) this).anInt2660, 10241,
				   ((Class226) this).aBool2665 ? 9984 : 9728);
	    OpenGL.glTexParameteri(((Class226) this).anInt2660, 10240, 9728);
	}
    }
    
    boolean method150() {
	if (((Class226) this).anInt2661 == 0)
	    throw new IllegalStateException("");
	int i = method4635();
	((Class226) this).aClass103_Sub3_Sub2_2668.method15856(this);
	if (((Class103_Sub3_Sub2) ((Class226) this).aClass103_Sub3_Sub2_2668)
	    .aBool11154)
	    OpenGL.glEnable(((Class226) this).anInt2660);
	OpenGL.glGenerateMipmapEXT(((Class226) this).anInt2660);
	if (((Class103_Sub3_Sub2) ((Class226) this).aClass103_Sub3_Sub2_2668)
	    .aBool11154)
	    OpenGL.glDisable(((Class226) this).anInt2660);
	((Class226) this).aBool2665 = true;
	method4631();
	method4634(i);
	return true;
    }
    
    void method4632() throws Throwable {
	method4630();
	super.finalize();
    }
    
    void method4633(int i, int i_22_, int i_23_, int[] is) {
	if (((Class226) this).anInt2661 == 0)
	    throw new IllegalStateException("");
	if (i_22_ > 0 && !Class76.method1772(i_22_, (byte) 93))
	    throw new IllegalArgumentException("");
	if (i_23_ > 0 && !Class76.method1772(i_23_, (byte) 50))
	    throw new IllegalArgumentException("");
	if (((Class226) this).aClass175_2663 != Class175.aClass175_2110)
	    throw new IllegalArgumentException("");
	int i_24_ = 0;
	int i_25_ = i_22_ < i_23_ ? i_22_ : i_23_;
	int i_26_ = i_22_ >> 1;
	int i_27_ = i_23_ >> 1;
	int[] is_28_ = is;
	int[] is_29_ = new int[i_26_ * i_27_];
	for (;;) {
	    OpenGL.glTexImage2Di(i, i_24_,
				 (Class103_Sub3_Sub2.method17559
				  (((Class226) this).aClass175_2663,
				   ((Class226) this).aClass102_2664)),
				 i_22_, i_23_, 0, 32993,
				 (((Class103_Sub3_Sub2)
				   ((Class226) this).aClass103_Sub3_Sub2_2668)
				  .anInt11165),
				 is_28_, 0);
	    if (i_25_ <= 1)
		break;
	    int i_30_ = 0;
	    int i_31_ = 0;
	    int i_32_ = i_31_ + i_22_;
	    for (int i_33_ = 0; i_33_ < i_27_; i_33_++) {
		for (int i_34_ = 0; i_34_ < i_26_; i_34_++) {
		    int i_35_ = is_28_[i_31_++];
		    int i_36_ = is_28_[i_31_++];
		    int i_37_ = is_28_[i_32_++];
		    int i_38_ = is_28_[i_32_++];
		    int i_39_ = i_35_ >> 24 & 0xff;
		    int i_40_ = i_35_ >> 16 & 0xff;
		    int i_41_ = i_35_ >> 8 & 0xff;
		    int i_42_ = i_35_ & 0xff;
		    i_39_ += i_36_ >> 24 & 0xff;
		    i_40_ += i_36_ >> 16 & 0xff;
		    i_41_ += i_36_ >> 8 & 0xff;
		    i_42_ += i_36_ & 0xff;
		    i_39_ += i_37_ >> 24 & 0xff;
		    i_40_ += i_37_ >> 16 & 0xff;
		    i_41_ += i_37_ >> 8 & 0xff;
		    i_42_ += i_37_ & 0xff;
		    i_39_ += i_38_ >> 24 & 0xff;
		    i_40_ += i_38_ >> 16 & 0xff;
		    i_41_ += i_38_ >> 8 & 0xff;
		    i_42_ += i_38_ & 0xff;
		    is_29_[i_30_++]
			= ((i_39_ & 0x3fc) << 22 | (i_40_ & 0x3fc) << 14
			   | (i_41_ & 0x3fc) << 6 | (i_42_ & 0x3fc) >> 2);
		}
		i_31_ += i_22_;
		i_32_ += i_22_;
	    }
	    int[] is_43_ = is_29_;
	    is_29_ = is_28_;
	    is_28_ = is_43_;
	    i_22_ = i_26_;
	    i_23_ = i_27_;
	    i_26_ >>= 1;
	    i_27_ >>= 1;
	    i_25_ >>= 1;
	    i_24_++;
	}
    }
    
    public void method181(Class312 class312) {
	if (((Class226) this).aClass312_2666 != class312) {
	    ((Class226) this).aClass312_2666 = class312;
	    method4631();
	}
    }
    
    void method4634(int i) {
	((Class226) this).aClass103_Sub3_Sub2_2668.anInt9539 -= i;
	((Class226) this).aClass103_Sub3_Sub2_2668.anInt9539 += method4635();
    }
    
    int method4635() {
	int i = (((Class226) this).aClass175_2663.anInt2121 * 1893442799
		 * (((Class226) this).aClass102_2664.anInt1447 * -387243519)
		 * ((Class226) this).anInt2667);
	return ((Class226) this).aBool2665 ? i * 4 / 3 : i;
    }
    
    public void method28() {
	if (((Class226) this).anInt2661 != 0) {
	    ((Class226) this).aClass103_Sub3_Sub2_2668.anInt9539
		-= method4635();
	    int[] is = new int[1];
	    is[0] = ((Class226) this).anInt2661;
	    OpenGL.glDeleteTextures(1, is, 0);
	    ((Class226) this).anInt2661 = 0;
	}
    }
    
    Class226(Class103_Sub3_Sub2 class103_sub3_sub2, int i, Class175 class175,
	     Class102 class102, int i_44_, boolean bool) {
	((Class226) this).aClass103_Sub3_Sub2_2668 = class103_sub3_sub2;
	((Class226) this).anInt2660 = i;
	((Class226) this).aClass175_2663 = class175;
	((Class226) this).aClass102_2664 = class102;
	((Class226) this).aBool2665 = bool;
	((Class226) this).anInt2667 = i_44_;
	OpenGL.glGenTextures(1, anIntArray2659, 0);
	((Class226) this).anInt2661 = anIntArray2659[0];
	method4631();
	method4634(0);
    }
    
    public void finalize() throws Throwable {
	method4630();
	super.finalize();
    }
    
    public void method27() {
	if (((Class226) this).anInt2661 != 0) {
	    ((Class226) this).aClass103_Sub3_Sub2_2668.anInt9539
		-= method4635();
	    int[] is = new int[1];
	    is[0] = ((Class226) this).anInt2661;
	    OpenGL.glDeleteTextures(1, is, 0);
	    ((Class226) this).anInt2661 = 0;
	}
    }
    
    public void method29() {
	if (((Class226) this).anInt2661 != 0) {
	    ((Class226) this).aClass103_Sub3_Sub2_2668.anInt9539
		-= method4635();
	    int[] is = new int[1];
	    is[0] = ((Class226) this).anInt2661;
	    OpenGL.glDeleteTextures(1, is, 0);
	    ((Class226) this).anInt2661 = 0;
	}
    }
    
    void method4636() throws Throwable {
	method4630();
	super.finalize();
    }
    
    void method4637(int i, int i_45_, int i_46_, int[] is) {
	if (((Class226) this).anInt2661 == 0)
	    throw new IllegalStateException("");
	if (i_45_ > 0 && !Class76.method1772(i_45_, (byte) 68))
	    throw new IllegalArgumentException("");
	if (i_46_ > 0 && !Class76.method1772(i_46_, (byte) 10))
	    throw new IllegalArgumentException("");
	if (((Class226) this).aClass175_2663 != Class175.aClass175_2110)
	    throw new IllegalArgumentException("");
	int i_47_ = 0;
	int i_48_ = i_45_ < i_46_ ? i_45_ : i_46_;
	int i_49_ = i_45_ >> 1;
	int i_50_ = i_46_ >> 1;
	int[] is_51_ = is;
	int[] is_52_ = new int[i_49_ * i_50_];
	for (;;) {
	    OpenGL.glTexImage2Di(i, i_47_,
				 (Class103_Sub3_Sub2.method17559
				  (((Class226) this).aClass175_2663,
				   ((Class226) this).aClass102_2664)),
				 i_45_, i_46_, 0, 32993,
				 (((Class103_Sub3_Sub2)
				   ((Class226) this).aClass103_Sub3_Sub2_2668)
				  .anInt11165),
				 is_51_, 0);
	    if (i_48_ <= 1)
		break;
	    int i_53_ = 0;
	    int i_54_ = 0;
	    int i_55_ = i_54_ + i_45_;
	    for (int i_56_ = 0; i_56_ < i_50_; i_56_++) {
		for (int i_57_ = 0; i_57_ < i_49_; i_57_++) {
		    int i_58_ = is_51_[i_54_++];
		    int i_59_ = is_51_[i_54_++];
		    int i_60_ = is_51_[i_55_++];
		    int i_61_ = is_51_[i_55_++];
		    int i_62_ = i_58_ >> 24 & 0xff;
		    int i_63_ = i_58_ >> 16 & 0xff;
		    int i_64_ = i_58_ >> 8 & 0xff;
		    int i_65_ = i_58_ & 0xff;
		    i_62_ += i_59_ >> 24 & 0xff;
		    i_63_ += i_59_ >> 16 & 0xff;
		    i_64_ += i_59_ >> 8 & 0xff;
		    i_65_ += i_59_ & 0xff;
		    i_62_ += i_60_ >> 24 & 0xff;
		    i_63_ += i_60_ >> 16 & 0xff;
		    i_64_ += i_60_ >> 8 & 0xff;
		    i_65_ += i_60_ & 0xff;
		    i_62_ += i_61_ >> 24 & 0xff;
		    i_63_ += i_61_ >> 16 & 0xff;
		    i_64_ += i_61_ >> 8 & 0xff;
		    i_65_ += i_61_ & 0xff;
		    is_52_[i_53_++]
			= ((i_62_ & 0x3fc) << 22 | (i_63_ & 0x3fc) << 14
			   | (i_64_ & 0x3fc) << 6 | (i_65_ & 0x3fc) >> 2);
		}
		i_54_ += i_45_;
		i_55_ += i_45_;
	    }
	    int[] is_66_ = is_52_;
	    is_52_ = is_51_;
	    is_51_ = is_66_;
	    i_45_ = i_49_;
	    i_46_ = i_50_;
	    i_49_ >>= 1;
	    i_50_ >>= 1;
	    i_48_ >>= 1;
	    i_47_++;
	}
    }
    
    void method4638(int i, int i_67_, int i_68_, byte[] is) {
	if (((Class226) this).anInt2661 == 0)
	    throw new IllegalStateException("");
	if (i_67_ > 0 && !Class76.method1772(i_67_, (byte) 125))
	    throw new IllegalArgumentException("");
	if (i_68_ > 0 && !Class76.method1772(i_68_, (byte) 112))
	    throw new IllegalArgumentException("");
	int i_69_ = ((Class226) this).aClass175_2663.anInt2121 * 1893442799;
	int i_70_ = 0;
	int i_71_ = i_67_ < i_68_ ? i_67_ : i_68_;
	int i_72_ = i_67_ >> 1;
	int i_73_ = i_68_ >> 1;
	byte[] is_74_ = is;
	byte[] is_75_ = new byte[i_72_ * i_73_ * i_69_];
	for (;;) {
	    OpenGL.glTexImage2Dub
		(i, i_70_,
		 Class103_Sub3_Sub2.method17559((((Class226) this)
						 .aClass175_2663),
						(((Class226) this)
						 .aClass102_2664)),
		 i_67_, i_68_, 0,
		 Class103_Sub3_Sub2
		     .method17571(((Class226) this).aClass175_2663),
		 5121, is_74_, 0);
	    if (i_71_ <= 1)
		break;
	    int i_76_ = i_67_ * i_69_;
	    for (int i_77_ = 0; i_77_ < i_69_; i_77_++) {
		int i_78_ = i_77_;
		int i_79_ = i_77_;
		int i_80_ = i_79_ + i_76_;
		for (int i_81_ = 0; i_81_ < i_73_; i_81_++) {
		    for (int i_82_ = 0; i_82_ < i_72_; i_82_++) {
			int i_83_ = is_74_[i_79_];
			i_79_ += i_69_;
			i_83_ += is_74_[i_79_];
			i_79_ += i_69_;
			i_83_ += is_74_[i_80_];
			i_80_ += i_69_;
			i_83_ += is_74_[i_80_];
			i_80_ += i_69_;
			is_75_[i_78_] = (byte) (i_83_ >> 2);
			i_78_ += i_69_;
		    }
		    i_79_ += i_76_;
		    i_80_ += i_76_;
		}
	    }
	    byte[] is_84_ = is_75_;
	    is_75_ = is_74_;
	    is_74_ = is_84_;
	    i_67_ = i_72_;
	    i_68_ = i_73_;
	    i_72_ >>= 1;
	    i_73_ >>= 1;
	    i_71_ >>= 1;
	    i_70_++;
	}
    }
    
    void method4639() throws Throwable {
	method4630();
	super.finalize();
    }
    
    void method4640(int i, int i_85_, int i_86_, float[] fs) {
	if (((Class226) this).anInt2661 == 0)
	    throw new IllegalStateException("");
	if (i_85_ > 0 && !Class76.method1772(i_85_, (byte) 69))
	    throw new IllegalArgumentException("");
	if (i_86_ > 0 && !Class76.method1772(i_86_, (byte) 113))
	    throw new IllegalArgumentException("");
	int i_87_ = ((Class226) this).aClass175_2663.anInt2121 * 1893442799;
	int i_88_ = 0;
	int i_89_ = i_85_ < i_86_ ? i_85_ : i_86_;
	int i_90_ = i_85_ >> 1;
	int i_91_ = i_86_ >> 1;
	float[] fs_92_ = fs;
	float[] fs_93_ = new float[i_90_ * i_91_ * i_87_];
	for (;;) {
	    OpenGL.glTexImage2Df
		(i, i_88_,
		 Class103_Sub3_Sub2.method17559((((Class226) this)
						 .aClass175_2663),
						(((Class226) this)
						 .aClass102_2664)),
		 i_85_, i_86_, 0,
		 Class103_Sub3_Sub2
		     .method17571(((Class226) this).aClass175_2663),
		 5126, fs_92_, 0);
	    if (i_89_ <= 1)
		break;
	    int i_94_ = i_85_ * i_87_;
	    for (int i_95_ = 0; i_95_ < i_87_; i_95_++) {
		int i_96_ = i_95_;
		int i_97_ = i_95_;
		int i_98_ = i_97_ + i_94_;
		for (int i_99_ = 0; i_99_ < i_91_; i_99_++) {
		    for (int i_100_ = 0; i_100_ < i_90_; i_100_++) {
			float f = fs_92_[i_97_];
			i_97_ += i_87_;
			f += fs_92_[i_97_];
			i_97_ += i_87_;
			f += fs_92_[i_98_];
			i_98_ += i_87_;
			f += fs_92_[i_98_];
			i_98_ += i_87_;
			fs_93_[i_96_] = f * 0.25F;
			i_96_ += i_87_;
		    }
		    i_97_ += i_94_;
		    i_98_ += i_94_;
		}
	    }
	    float[] fs_101_ = fs_93_;
	    fs_93_ = fs_92_;
	    fs_92_ = fs_101_;
	    i_85_ = i_90_;
	    i_86_ = i_91_;
	    i_90_ >>= 1;
	    i_91_ >>= 1;
	    i_89_ >>= 1;
	    i_88_++;
	}
    }
    
    public void method180() {
	if (((Class226) this).anInt2661 == 0)
	    throw new IllegalStateException("");
	int i = ((Class226) this).aClass103_Sub3_Sub2_2668.method15685();
	int i_102_ = (((Class103_Sub3_Sub2)
		       ((Class226) this).aClass103_Sub3_Sub2_2668)
		      .anIntArray11152[i]);
	if (i_102_ != ((Class226) this).anInt2660) {
	    if (i_102_ != 0) {
		OpenGL.glBindTexture(i_102_, 0);
		OpenGL.glDisable(i_102_);
	    }
	    OpenGL.glEnable(((Class226) this).anInt2660);
	    ((Class103_Sub3_Sub2) ((Class226) this).aClass103_Sub3_Sub2_2668)
		.anIntArray11152[i]
		= ((Class226) this).anInt2660;
	}
	OpenGL.glBindTexture(((Class226) this).anInt2660,
			     ((Class226) this).anInt2661);
    }
    
    void method4641(int i) {
	((Class226) this).aClass103_Sub3_Sub2_2668.anInt9539 -= i;
	((Class226) this).aClass103_Sub3_Sub2_2668.anInt9539 += method4635();
    }
    
    public void method179(Class312 class312) {
	if (((Class226) this).aClass312_2666 != class312) {
	    ((Class226) this).aClass312_2666 = class312;
	    method4631();
	}
    }
    
    void method4642(int i, int i_103_, int i_104_, int[] is) {
	if (((Class226) this).anInt2661 == 0)
	    throw new IllegalStateException("");
	if (i_103_ > 0 && !Class76.method1772(i_103_, (byte) 63))
	    throw new IllegalArgumentException("");
	if (i_104_ > 0 && !Class76.method1772(i_104_, (byte) 67))
	    throw new IllegalArgumentException("");
	if (((Class226) this).aClass175_2663 != Class175.aClass175_2110)
	    throw new IllegalArgumentException("");
	int i_105_ = 0;
	int i_106_ = i_103_ < i_104_ ? i_103_ : i_104_;
	int i_107_ = i_103_ >> 1;
	int i_108_ = i_104_ >> 1;
	int[] is_109_ = is;
	int[] is_110_ = new int[i_107_ * i_108_];
	for (;;) {
	    OpenGL.glTexImage2Di(i, i_105_,
				 (Class103_Sub3_Sub2.method17559
				  (((Class226) this).aClass175_2663,
				   ((Class226) this).aClass102_2664)),
				 i_103_, i_104_, 0, 32993,
				 (((Class103_Sub3_Sub2)
				   ((Class226) this).aClass103_Sub3_Sub2_2668)
				  .anInt11165),
				 is_109_, 0);
	    if (i_106_ <= 1)
		break;
	    int i_111_ = 0;
	    int i_112_ = 0;
	    int i_113_ = i_112_ + i_103_;
	    for (int i_114_ = 0; i_114_ < i_108_; i_114_++) {
		for (int i_115_ = 0; i_115_ < i_107_; i_115_++) {
		    int i_116_ = is_109_[i_112_++];
		    int i_117_ = is_109_[i_112_++];
		    int i_118_ = is_109_[i_113_++];
		    int i_119_ = is_109_[i_113_++];
		    int i_120_ = i_116_ >> 24 & 0xff;
		    int i_121_ = i_116_ >> 16 & 0xff;
		    int i_122_ = i_116_ >> 8 & 0xff;
		    int i_123_ = i_116_ & 0xff;
		    i_120_ += i_117_ >> 24 & 0xff;
		    i_121_ += i_117_ >> 16 & 0xff;
		    i_122_ += i_117_ >> 8 & 0xff;
		    i_123_ += i_117_ & 0xff;
		    i_120_ += i_118_ >> 24 & 0xff;
		    i_121_ += i_118_ >> 16 & 0xff;
		    i_122_ += i_118_ >> 8 & 0xff;
		    i_123_ += i_118_ & 0xff;
		    i_120_ += i_119_ >> 24 & 0xff;
		    i_121_ += i_119_ >> 16 & 0xff;
		    i_122_ += i_119_ >> 8 & 0xff;
		    i_123_ += i_119_ & 0xff;
		    is_110_[i_111_++]
			= ((i_120_ & 0x3fc) << 22 | (i_121_ & 0x3fc) << 14
			   | (i_122_ & 0x3fc) << 6 | (i_123_ & 0x3fc) >> 2);
		}
		i_112_ += i_103_;
		i_113_ += i_103_;
	    }
	    int[] is_124_ = is_110_;
	    is_110_ = is_109_;
	    is_109_ = is_124_;
	    i_103_ = i_107_;
	    i_104_ = i_108_;
	    i_107_ >>= 1;
	    i_108_ >>= 1;
	    i_106_ >>= 1;
	    i_105_++;
	}
    }
    
    boolean method261() {
	if (((Class226) this).anInt2661 == 0)
	    throw new IllegalStateException("");
	int i = method4635();
	((Class226) this).aClass103_Sub3_Sub2_2668.method15856(this);
	if (((Class103_Sub3_Sub2) ((Class226) this).aClass103_Sub3_Sub2_2668)
	    .aBool11154)
	    OpenGL.glEnable(((Class226) this).anInt2660);
	OpenGL.glGenerateMipmapEXT(((Class226) this).anInt2660);
	if (((Class103_Sub3_Sub2) ((Class226) this).aClass103_Sub3_Sub2_2668)
	    .aBool11154)
	    OpenGL.glDisable(((Class226) this).anInt2660);
	((Class226) this).aBool2665 = true;
	method4631();
	method4634(i);
	return true;
    }
    
    void method4643() throws Throwable {
	method4630();
	super.finalize();
    }
    
    void method4644() {
	if (((Class226) this).anInt2661 == 0)
	    throw new IllegalStateException("");
	((Class226) this).aClass103_Sub3_Sub2_2668.method15856(this);
	if (((Class226) this).aClass312_2666 == Class312.aClass312_4830) {
	    OpenGL.glTexParameteri(((Class226) this).anInt2660, 10241,
				   ((Class226) this).aBool2665 ? 9987 : 9729);
	    OpenGL.glTexParameteri(((Class226) this).anInt2660, 10240, 9729);
	} else {
	    OpenGL.glTexParameteri(((Class226) this).anInt2660, 10241,
				   ((Class226) this).aBool2665 ? 9984 : 9728);
	    OpenGL.glTexParameteri(((Class226) this).anInt2660, 10240, 9728);
	}
    }
    
    void method4645() {
	if (((Class226) this).anInt2661 == 0)
	    throw new IllegalStateException("");
	((Class226) this).aClass103_Sub3_Sub2_2668.method15856(this);
	if (((Class226) this).aClass312_2666 == Class312.aClass312_4830) {
	    OpenGL.glTexParameteri(((Class226) this).anInt2660, 10241,
				   ((Class226) this).aBool2665 ? 9987 : 9729);
	    OpenGL.glTexParameteri(((Class226) this).anInt2660, 10240, 9729);
	} else {
	    OpenGL.glTexParameteri(((Class226) this).anInt2660, 10241,
				   ((Class226) this).aBool2665 ? 9984 : 9728);
	    OpenGL.glTexParameteri(((Class226) this).anInt2660, 10240, 9728);
	}
    }
    
    void method4646(int i, int i_125_, int i_126_, byte[] is) {
	if (((Class226) this).anInt2661 == 0)
	    throw new IllegalStateException("");
	if (i_125_ > 0 && !Class76.method1772(i_125_, (byte) 51))
	    throw new IllegalArgumentException("");
	if (i_126_ > 0 && !Class76.method1772(i_126_, (byte) 69))
	    throw new IllegalArgumentException("");
	int i_127_ = ((Class226) this).aClass175_2663.anInt2121 * 1893442799;
	int i_128_ = 0;
	int i_129_ = i_125_ < i_126_ ? i_125_ : i_126_;
	int i_130_ = i_125_ >> 1;
	int i_131_ = i_126_ >> 1;
	byte[] is_132_ = is;
	byte[] is_133_ = new byte[i_130_ * i_131_ * i_127_];
	for (;;) {
	    OpenGL.glTexImage2Dub
		(i, i_128_,
		 Class103_Sub3_Sub2.method17559((((Class226) this)
						 .aClass175_2663),
						(((Class226) this)
						 .aClass102_2664)),
		 i_125_, i_126_, 0,
		 Class103_Sub3_Sub2
		     .method17571(((Class226) this).aClass175_2663),
		 5121, is_132_, 0);
	    if (i_129_ <= 1)
		break;
	    int i_134_ = i_125_ * i_127_;
	    for (int i_135_ = 0; i_135_ < i_127_; i_135_++) {
		int i_136_ = i_135_;
		int i_137_ = i_135_;
		int i_138_ = i_137_ + i_134_;
		for (int i_139_ = 0; i_139_ < i_131_; i_139_++) {
		    for (int i_140_ = 0; i_140_ < i_130_; i_140_++) {
			int i_141_ = is_132_[i_137_];
			i_137_ += i_127_;
			i_141_ += is_132_[i_137_];
			i_137_ += i_127_;
			i_141_ += is_132_[i_138_];
			i_138_ += i_127_;
			i_141_ += is_132_[i_138_];
			i_138_ += i_127_;
			is_133_[i_136_] = (byte) (i_141_ >> 2);
			i_136_ += i_127_;
		    }
		    i_137_ += i_134_;
		    i_138_ += i_134_;
		}
	    }
	    byte[] is_142_ = is_133_;
	    is_133_ = is_132_;
	    is_132_ = is_142_;
	    i_125_ = i_130_;
	    i_126_ = i_131_;
	    i_130_ >>= 1;
	    i_131_ >>= 1;
	    i_129_ >>= 1;
	    i_128_++;
	}
    }
    
    public void method175() {
	if (((Class226) this).anInt2661 == 0)
	    throw new IllegalStateException("");
	int i = ((Class226) this).aClass103_Sub3_Sub2_2668.method15685();
	int i_143_ = (((Class103_Sub3_Sub2)
		       ((Class226) this).aClass103_Sub3_Sub2_2668)
		      .anIntArray11152[i]);
	if (i_143_ != ((Class226) this).anInt2660) {
	    if (i_143_ != 0) {
		OpenGL.glBindTexture(i_143_, 0);
		OpenGL.glDisable(i_143_);
	    }
	    OpenGL.glEnable(((Class226) this).anInt2660);
	    ((Class103_Sub3_Sub2) ((Class226) this).aClass103_Sub3_Sub2_2668)
		.anIntArray11152[i]
		= ((Class226) this).anInt2660;
	}
	OpenGL.glBindTexture(((Class226) this).anInt2660,
			     ((Class226) this).anInt2661);
    }
    
    void method4647(int i, int i_144_, int i_145_, byte[] is) {
	if (((Class226) this).anInt2661 == 0)
	    throw new IllegalStateException("");
	if (i_144_ > 0 && !Class76.method1772(i_144_, (byte) 48))
	    throw new IllegalArgumentException("");
	if (i_145_ > 0 && !Class76.method1772(i_145_, (byte) 65))
	    throw new IllegalArgumentException("");
	int i_146_ = ((Class226) this).aClass175_2663.anInt2121 * 1893442799;
	int i_147_ = 0;
	int i_148_ = i_144_ < i_145_ ? i_144_ : i_145_;
	int i_149_ = i_144_ >> 1;
	int i_150_ = i_145_ >> 1;
	byte[] is_151_ = is;
	byte[] is_152_ = new byte[i_149_ * i_150_ * i_146_];
	for (;;) {
	    OpenGL.glTexImage2Dub
		(i, i_147_,
		 Class103_Sub3_Sub2.method17559((((Class226) this)
						 .aClass175_2663),
						(((Class226) this)
						 .aClass102_2664)),
		 i_144_, i_145_, 0,
		 Class103_Sub3_Sub2
		     .method17571(((Class226) this).aClass175_2663),
		 5121, is_151_, 0);
	    if (i_148_ <= 1)
		break;
	    int i_153_ = i_144_ * i_146_;
	    for (int i_154_ = 0; i_154_ < i_146_; i_154_++) {
		int i_155_ = i_154_;
		int i_156_ = i_154_;
		int i_157_ = i_156_ + i_153_;
		for (int i_158_ = 0; i_158_ < i_150_; i_158_++) {
		    for (int i_159_ = 0; i_159_ < i_149_; i_159_++) {
			int i_160_ = is_151_[i_156_];
			i_156_ += i_146_;
			i_160_ += is_151_[i_156_];
			i_156_ += i_146_;
			i_160_ += is_151_[i_157_];
			i_157_ += i_146_;
			i_160_ += is_151_[i_157_];
			i_157_ += i_146_;
			is_152_[i_155_] = (byte) (i_160_ >> 2);
			i_155_ += i_146_;
		    }
		    i_156_ += i_153_;
		    i_157_ += i_153_;
		}
	    }
	    byte[] is_161_ = is_152_;
	    is_152_ = is_151_;
	    is_151_ = is_161_;
	    i_144_ = i_149_;
	    i_145_ = i_150_;
	    i_149_ >>= 1;
	    i_150_ >>= 1;
	    i_148_ >>= 1;
	    i_147_++;
	}
    }
    
    public void method178() {
	if (((Class226) this).anInt2661 == 0)
	    throw new IllegalStateException("");
	int i = ((Class226) this).aClass103_Sub3_Sub2_2668.method15685();
	int i_162_ = (((Class103_Sub3_Sub2)
		       ((Class226) this).aClass103_Sub3_Sub2_2668)
		      .anIntArray11152[i]);
	if (i_162_ != ((Class226) this).anInt2660) {
	    if (i_162_ != 0) {
		OpenGL.glBindTexture(i_162_, 0);
		OpenGL.glDisable(i_162_);
	    }
	    OpenGL.glEnable(((Class226) this).anInt2660);
	    ((Class103_Sub3_Sub2) ((Class226) this).aClass103_Sub3_Sub2_2668)
		.anIntArray11152[i]
		= ((Class226) this).anInt2660;
	}
	OpenGL.glBindTexture(((Class226) this).anInt2660,
			     ((Class226) this).anInt2661);
    }
    
    void method4648(int i, int i_163_, int i_164_, float[] fs) {
	if (((Class226) this).anInt2661 == 0)
	    throw new IllegalStateException("");
	if (i_163_ > 0 && !Class76.method1772(i_163_, (byte) 11))
	    throw new IllegalArgumentException("");
	if (i_164_ > 0 && !Class76.method1772(i_164_, (byte) 57))
	    throw new IllegalArgumentException("");
	int i_165_ = ((Class226) this).aClass175_2663.anInt2121 * 1893442799;
	int i_166_ = 0;
	int i_167_ = i_163_ < i_164_ ? i_163_ : i_164_;
	int i_168_ = i_163_ >> 1;
	int i_169_ = i_164_ >> 1;
	float[] fs_170_ = fs;
	float[] fs_171_ = new float[i_168_ * i_169_ * i_165_];
	for (;;) {
	    OpenGL.glTexImage2Df
		(i, i_166_,
		 Class103_Sub3_Sub2.method17559((((Class226) this)
						 .aClass175_2663),
						(((Class226) this)
						 .aClass102_2664)),
		 i_163_, i_164_, 0,
		 Class103_Sub3_Sub2
		     .method17571(((Class226) this).aClass175_2663),
		 5126, fs_170_, 0);
	    if (i_167_ <= 1)
		break;
	    int i_172_ = i_163_ * i_165_;
	    for (int i_173_ = 0; i_173_ < i_165_; i_173_++) {
		int i_174_ = i_173_;
		int i_175_ = i_173_;
		int i_176_ = i_175_ + i_172_;
		for (int i_177_ = 0; i_177_ < i_169_; i_177_++) {
		    for (int i_178_ = 0; i_178_ < i_168_; i_178_++) {
			float f = fs_170_[i_175_];
			i_175_ += i_165_;
			f += fs_170_[i_175_];
			i_175_ += i_165_;
			f += fs_170_[i_176_];
			i_176_ += i_165_;
			f += fs_170_[i_176_];
			i_176_ += i_165_;
			fs_171_[i_174_] = f * 0.25F;
			i_174_ += i_165_;
		    }
		    i_175_ += i_172_;
		    i_176_ += i_172_;
		}
	    }
	    float[] fs_179_ = fs_171_;
	    fs_171_ = fs_170_;
	    fs_170_ = fs_179_;
	    i_163_ = i_168_;
	    i_164_ = i_169_;
	    i_168_ >>= 1;
	    i_169_ >>= 1;
	    i_167_ >>= 1;
	    i_166_++;
	}
    }
    
    public void method177() {
	if (((Class226) this).anInt2661 == 0)
	    throw new IllegalStateException("");
	int i = ((Class226) this).aClass103_Sub3_Sub2_2668.method15685();
	int i_180_ = (((Class103_Sub3_Sub2)
		       ((Class226) this).aClass103_Sub3_Sub2_2668)
		      .anIntArray11152[i]);
	if (i_180_ != ((Class226) this).anInt2660) {
	    if (i_180_ != 0) {
		OpenGL.glBindTexture(i_180_, 0);
		OpenGL.glDisable(i_180_);
	    }
	    OpenGL.glEnable(((Class226) this).anInt2660);
	    ((Class103_Sub3_Sub2) ((Class226) this).aClass103_Sub3_Sub2_2668)
		.anIntArray11152[i]
		= ((Class226) this).anInt2660;
	}
	OpenGL.glBindTexture(((Class226) this).anInt2660,
			     ((Class226) this).anInt2661);
    }
    
    void method4649(int i) {
	((Class226) this).aClass103_Sub3_Sub2_2668.anInt9539 -= i;
	((Class226) this).aClass103_Sub3_Sub2_2668.anInt9539 += method4635();
    }
    
    int method4650() {
	int i = (((Class226) this).aClass175_2663.anInt2121 * 1893442799
		 * (((Class226) this).aClass102_2664.anInt1447 * -387243519)
		 * ((Class226) this).anInt2667);
	return ((Class226) this).aBool2665 ? i * 4 / 3 : i;
    }
}
