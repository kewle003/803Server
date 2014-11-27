/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public abstract class Class142
{
    static int[] anIntArray1649 = new int[1];
    static final int anInt1650 = 3553;
    static final int anInt1651 = 34037;
    static final int anInt1652 = 34067;
    static final int anInt1653 = 32879;
    int anInt1654;
    Class103_Sub1 aClass103_Sub1_1655;
    Class102 aClass102_1656;
    boolean aBool1657 = false;
    Class175 aClass175_1658;
    static final int anInt1659 = 3552;
    boolean aBool1660;
    static final int anInt1661 = 5121;
    int anInt1662;
    int anInt1663;
    
    boolean method3167() {
	if (((Class103_Sub1) ((Class142) this).aClass103_Sub1_1655)
	    .aBool9201) {
	    int i = method3179();
	    ((Class142) this).aClass103_Sub1_1655.method15177(this);
	    OpenGL.glGenerateMipmapEXT(((Class142) this).anInt1654);
	    ((Class142) this).aBool1660 = true;
	    method3194();
	    method3175(i);
	    return true;
	}
	return false;
    }
    
    void method3168(boolean bool) {
	if (((Class142) this).aBool1657 != bool) {
	    ((Class142) this).aBool1657 = bool;
	    method3194();
	}
    }
    
    boolean method3169() {
	if (((Class103_Sub1) ((Class142) this).aClass103_Sub1_1655)
	    .aBool9201) {
	    int i = method3179();
	    ((Class142) this).aClass103_Sub1_1655.method15177(this);
	    OpenGL.glGenerateMipmapEXT(((Class142) this).anInt1654);
	    ((Class142) this).aBool1660 = true;
	    method3194();
	    method3175(i);
	    return true;
	}
	return false;
    }
    
    static void method3170(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			   int i_4_, int[] is) {
	if (i_1_ > 0 && !Class76.method1772(i_1_, (byte) 2))
	    throw new IllegalArgumentException("");
	if (i_2_ > 0 && !Class76.method1772(i_2_, (byte) 64))
	    throw new IllegalArgumentException("");
	if (i_3_ != 32993)
	    throw new IllegalArgumentException("");
	int i_5_ = 0;
	int i_6_ = i_1_ < i_2_ ? i_1_ : i_2_;
	int i_7_ = i_1_ >> 1;
	int i_8_ = i_2_ >> 1;
	int[] is_9_ = is;
	int[] is_10_ = new int[i_7_ * i_8_];
	for (;;) {
	    OpenGL.glTexImage2Di(i, i_5_, i_0_, i_1_, i_2_, 0, i_3_, i_4_,
				 is_9_, 0);
	    if (i_6_ <= 1)
		break;
	    int i_11_ = 0;
	    int i_12_ = 0;
	    int i_13_ = i_12_ + i_1_;
	    for (int i_14_ = 0; i_14_ < i_8_; i_14_++) {
		for (int i_15_ = 0; i_15_ < i_7_; i_15_++) {
		    int i_16_ = is_9_[i_12_++];
		    int i_17_ = is_9_[i_12_++];
		    int i_18_ = is_9_[i_13_++];
		    int i_19_ = is_9_[i_13_++];
		    int i_20_ = i_16_ >> 24 & 0xff;
		    int i_21_ = i_16_ >> 16 & 0xff;
		    int i_22_ = i_16_ >> 8 & 0xff;
		    int i_23_ = i_16_ & 0xff;
		    i_20_ += i_17_ >> 24 & 0xff;
		    i_21_ += i_17_ >> 16 & 0xff;
		    i_22_ += i_17_ >> 8 & 0xff;
		    i_23_ += i_17_ & 0xff;
		    i_20_ += i_18_ >> 24 & 0xff;
		    i_21_ += i_18_ >> 16 & 0xff;
		    i_22_ += i_18_ >> 8 & 0xff;
		    i_23_ += i_18_ & 0xff;
		    i_20_ += i_19_ >> 24 & 0xff;
		    i_21_ += i_19_ >> 16 & 0xff;
		    i_22_ += i_19_ >> 8 & 0xff;
		    i_23_ += i_19_ & 0xff;
		    is_10_[i_11_++]
			= ((i_20_ & 0x3fc) << 22 | (i_21_ & 0x3fc) << 14
			   | (i_22_ & 0x3fc) << 6 | (i_23_ & 0x3fc) >> 2);
		}
		i_12_ += i_1_;
		i_13_ += i_1_;
	    }
	    int[] is_24_ = is_10_;
	    is_10_ = is_9_;
	    is_9_ = is_24_;
	    i_1_ = i_7_;
	    i_2_ = i_8_;
	    i_7_ >>= 1;
	    i_8_ >>= 1;
	    i_6_ >>= 1;
	    i_5_++;
	}
    }
    
    void method3171(boolean bool) {
	if (((Class142) this).aBool1660 != bool) {
	    int i = method3179();
	    ((Class142) this).aBool1660 = true;
	    method3194();
	    method3175(i);
	}
    }
    
    void method3172() {
	if (((Class142) this).anInt1663 != 0) {
	    ((Class103_Sub1) ((Class142) this).aClass103_Sub1_1655).anInt9097
		-= method3179();
	    int[] is = new int[1];
	    is[0] = ((Class142) this).anInt1663;
	    OpenGL.glDeleteTextures(1, is, 0);
	    ((Class142) this).anInt1663 = 0;
	}
    }
    
    void method3173() {
	if (((Class142) this).anInt1663 != 0) {
	    ((Class142) this).aClass103_Sub1_1655
		.method15198(((Class142) this).anInt1663, method3179());
	    ((Class142) this).anInt1663 = 0;
	}
    }
    
    void method3174() throws Throwable {
	method3173();
	super.finalize();
    }
    
    void method3175(int i) {
	((Class103_Sub1) ((Class142) this).aClass103_Sub1_1655).anInt9097 -= i;
	((Class103_Sub1) ((Class142) this).aClass103_Sub1_1655).anInt9097
	    += method3179();
    }
    
    void method3176() {
	if (((Class142) this).anInt1663 != 0) {
	    ((Class103_Sub1) ((Class142) this).aClass103_Sub1_1655).anInt9097
		-= method3179();
	    int[] is = new int[1];
	    is[0] = ((Class142) this).anInt1663;
	    OpenGL.glDeleteTextures(1, is, 0);
	    ((Class142) this).anInt1663 = 0;
	}
    }
    
    void method3177() throws Throwable {
	method3173();
	super.finalize();
    }
    
    static void method3178(int i, int i_25_, int i_26_, int i_27_,
			   Class175 class175, byte[] is) {
	if (i_26_ > 0 && !Class76.method1772(i_26_, (byte) 53))
	    throw new IllegalArgumentException("");
	if (i_27_ > 0 && !Class76.method1772(i_27_, (byte) 60))
	    throw new IllegalArgumentException("");
	int i_28_ = class175.anInt2121 * 1893442799;
	int i_29_ = 0;
	int i_30_ = i_26_ < i_27_ ? i_26_ : i_27_;
	int i_31_ = i_26_ >> 1;
	int i_32_ = i_27_ >> 1;
	byte[] is_33_ = is;
	byte[] is_34_ = new byte[i_31_ * i_32_ * i_28_];
	for (;;) {
	    OpenGL.glTexImage2Dub(i, i_29_, i_25_, i_26_, i_27_, 0,
				  Class103_Sub1.method15202(class175), 5121,
				  is_33_, 0);
	    if (i_30_ <= 1)
		break;
	    int i_35_ = i_26_ * i_28_;
	    for (int i_36_ = 0; i_36_ < i_28_; i_36_++) {
		int i_37_ = i_36_;
		int i_38_ = i_36_;
		int i_39_ = i_38_ + i_35_;
		for (int i_40_ = 0; i_40_ < i_32_; i_40_++) {
		    for (int i_41_ = 0; i_41_ < i_31_; i_41_++) {
			int i_42_ = is_33_[i_38_];
			i_38_ += i_28_;
			i_42_ += is_33_[i_38_];
			i_38_ += i_28_;
			i_42_ += is_33_[i_39_];
			i_39_ += i_28_;
			i_42_ += is_33_[i_39_];
			i_39_ += i_28_;
			is_34_[i_37_] = (byte) (i_42_ >> 2);
			i_37_ += i_28_;
		    }
		    i_38_ += i_35_;
		    i_39_ += i_35_;
		}
	    }
	    byte[] is_43_ = is_34_;
	    is_34_ = is_33_;
	    is_33_ = is_43_;
	    i_26_ = i_31_;
	    i_27_ = i_32_;
	    i_31_ >>= 1;
	    i_32_ >>= 1;
	    i_30_ >>= 1;
	    i_29_++;
	}
    }
    
    int method3179() {
	int i = (((Class142) this).aClass175_1658.anInt2121 * 1893442799
		 * (((Class142) this).aClass102_1656.anInt1447 * -387243519)
		 * ((Class142) this).anInt1662);
	return ((Class142) this).aBool1660 ? i * 4 / 3 : i;
    }
    
    void method3180() throws Throwable {
	method3173();
	super.finalize();
    }
    
    int method3181() {
	int i = (((Class142) this).aClass175_1658.anInt2121 * 1893442799
		 * (((Class142) this).aClass102_1656.anInt1447 * -387243519)
		 * ((Class142) this).anInt1662);
	return ((Class142) this).aBool1660 ? i * 4 / 3 : i;
    }
    
    int method3182() {
	int i = (((Class142) this).aClass175_1658.anInt2121 * 1893442799
		 * (((Class142) this).aClass102_1656.anInt1447 * -387243519)
		 * ((Class142) this).anInt1662);
	return ((Class142) this).aBool1660 ? i * 4 / 3 : i;
    }
    
    public void finalize() throws Throwable {
	method3173();
	super.finalize();
    }
    
    void method3183() throws Throwable {
	method3173();
	super.finalize();
    }
    
    void method3184(boolean bool) {
	if (((Class142) this).aBool1657 != bool) {
	    ((Class142) this).aBool1657 = bool;
	    method3194();
	}
    }
    
    void method3185() {
	((Class142) this).aClass103_Sub1_1655.method15177(this);
	if (((Class142) this).aBool1657) {
	    OpenGL.glTexParameteri(((Class142) this).anInt1654, 10241,
				   ((Class142) this).aBool1660 ? 9987 : 9729);
	    OpenGL.glTexParameteri(((Class142) this).anInt1654, 10240, 9729);
	} else {
	    OpenGL.glTexParameteri(((Class142) this).anInt1654, 10241,
				   ((Class142) this).aBool1660 ? 9984 : 9728);
	    OpenGL.glTexParameteri(((Class142) this).anInt1654, 10240, 9728);
	}
    }
    
    void method3186() {
	((Class142) this).aClass103_Sub1_1655.method15177(this);
	if (((Class142) this).aBool1657) {
	    OpenGL.glTexParameteri(((Class142) this).anInt1654, 10241,
				   ((Class142) this).aBool1660 ? 9987 : 9729);
	    OpenGL.glTexParameteri(((Class142) this).anInt1654, 10240, 9729);
	} else {
	    OpenGL.glTexParameteri(((Class142) this).anInt1654, 10241,
				   ((Class142) this).aBool1660 ? 9984 : 9728);
	    OpenGL.glTexParameteri(((Class142) this).anInt1654, 10240, 9728);
	}
    }
    
    boolean method3187() {
	if (((Class103_Sub1) ((Class142) this).aClass103_Sub1_1655)
	    .aBool9201) {
	    int i = method3179();
	    ((Class142) this).aClass103_Sub1_1655.method15177(this);
	    OpenGL.glGenerateMipmapEXT(((Class142) this).anInt1654);
	    ((Class142) this).aBool1660 = true;
	    method3194();
	    method3175(i);
	    return true;
	}
	return false;
    }
    
    boolean method3188() {
	if (((Class103_Sub1) ((Class142) this).aClass103_Sub1_1655)
	    .aBool9201) {
	    int i = method3179();
	    ((Class142) this).aClass103_Sub1_1655.method15177(this);
	    OpenGL.glGenerateMipmapEXT(((Class142) this).anInt1654);
	    ((Class142) this).aBool1660 = true;
	    method3194();
	    method3175(i);
	    return true;
	}
	return false;
    }
    
    boolean method3189() {
	if (((Class103_Sub1) ((Class142) this).aClass103_Sub1_1655)
	    .aBool9201) {
	    int i = method3179();
	    ((Class142) this).aClass103_Sub1_1655.method15177(this);
	    OpenGL.glGenerateMipmapEXT(((Class142) this).anInt1654);
	    ((Class142) this).aBool1660 = true;
	    method3194();
	    method3175(i);
	    return true;
	}
	return false;
    }
    
    void method3190(boolean bool) {
	if (((Class142) this).aBool1660 != bool) {
	    int i = method3179();
	    ((Class142) this).aBool1660 = true;
	    method3194();
	    method3175(i);
	}
    }
    
    Class142(Class103_Sub1 class103_sub1, int i, Class175 class175,
	     Class102 class102, int i_44_, boolean bool) {
	((Class142) this).aClass103_Sub1_1655 = class103_sub1;
	((Class142) this).anInt1654 = i;
	((Class142) this).aClass175_1658 = class175;
	((Class142) this).aClass102_1656 = class102;
	((Class142) this).aBool1660 = bool;
	((Class142) this).anInt1662 = i_44_;
	OpenGL.glGenTextures(1, anIntArray1649, 0);
	((Class142) this).anInt1663 = anIntArray1649[0];
	method3175(0);
    }
    
    static void method3191(int i, int i_45_, int i_46_, int i_47_, int i_48_,
			   int i_49_, int[] is) {
	if (i_46_ > 0 && !Class76.method1772(i_46_, (byte) 13))
	    throw new IllegalArgumentException("");
	if (i_47_ > 0 && !Class76.method1772(i_47_, (byte) 83))
	    throw new IllegalArgumentException("");
	if (i_48_ != 32993)
	    throw new IllegalArgumentException("");
	int i_50_ = 0;
	int i_51_ = i_46_ < i_47_ ? i_46_ : i_47_;
	int i_52_ = i_46_ >> 1;
	int i_53_ = i_47_ >> 1;
	int[] is_54_ = is;
	int[] is_55_ = new int[i_52_ * i_53_];
	for (;;) {
	    OpenGL.glTexImage2Di(i, i_50_, i_45_, i_46_, i_47_, 0, i_48_,
				 i_49_, is_54_, 0);
	    if (i_51_ <= 1)
		break;
	    int i_56_ = 0;
	    int i_57_ = 0;
	    int i_58_ = i_57_ + i_46_;
	    for (int i_59_ = 0; i_59_ < i_53_; i_59_++) {
		for (int i_60_ = 0; i_60_ < i_52_; i_60_++) {
		    int i_61_ = is_54_[i_57_++];
		    int i_62_ = is_54_[i_57_++];
		    int i_63_ = is_54_[i_58_++];
		    int i_64_ = is_54_[i_58_++];
		    int i_65_ = i_61_ >> 24 & 0xff;
		    int i_66_ = i_61_ >> 16 & 0xff;
		    int i_67_ = i_61_ >> 8 & 0xff;
		    int i_68_ = i_61_ & 0xff;
		    i_65_ += i_62_ >> 24 & 0xff;
		    i_66_ += i_62_ >> 16 & 0xff;
		    i_67_ += i_62_ >> 8 & 0xff;
		    i_68_ += i_62_ & 0xff;
		    i_65_ += i_63_ >> 24 & 0xff;
		    i_66_ += i_63_ >> 16 & 0xff;
		    i_67_ += i_63_ >> 8 & 0xff;
		    i_68_ += i_63_ & 0xff;
		    i_65_ += i_64_ >> 24 & 0xff;
		    i_66_ += i_64_ >> 16 & 0xff;
		    i_67_ += i_64_ >> 8 & 0xff;
		    i_68_ += i_64_ & 0xff;
		    is_55_[i_56_++]
			= ((i_65_ & 0x3fc) << 22 | (i_66_ & 0x3fc) << 14
			   | (i_67_ & 0x3fc) << 6 | (i_68_ & 0x3fc) >> 2);
		}
		i_57_ += i_46_;
		i_58_ += i_46_;
	    }
	    int[] is_69_ = is_55_;
	    is_55_ = is_54_;
	    is_54_ = is_69_;
	    i_46_ = i_52_;
	    i_47_ = i_53_;
	    i_52_ >>= 1;
	    i_53_ >>= 1;
	    i_51_ >>= 1;
	    i_50_++;
	}
    }
    
    void method3192(boolean bool) {
	if (((Class142) this).aBool1660 != bool) {
	    int i = method3179();
	    ((Class142) this).aBool1660 = true;
	    method3194();
	    method3175(i);
	}
    }
    
    void method3193(boolean bool) {
	if (((Class142) this).aBool1660 != bool) {
	    int i = method3179();
	    ((Class142) this).aBool1660 = true;
	    method3194();
	    method3175(i);
	}
    }
    
    void method3194() {
	((Class142) this).aClass103_Sub1_1655.method15177(this);
	if (((Class142) this).aBool1657) {
	    OpenGL.glTexParameteri(((Class142) this).anInt1654, 10241,
				   ((Class142) this).aBool1660 ? 9987 : 9729);
	    OpenGL.glTexParameteri(((Class142) this).anInt1654, 10240, 9729);
	} else {
	    OpenGL.glTexParameteri(((Class142) this).anInt1654, 10241,
				   ((Class142) this).aBool1660 ? 9984 : 9728);
	    OpenGL.glTexParameteri(((Class142) this).anInt1654, 10240, 9728);
	}
    }
    
    void method3195(int i) {
	((Class103_Sub1) ((Class142) this).aClass103_Sub1_1655).anInt9097 -= i;
	((Class103_Sub1) ((Class142) this).aClass103_Sub1_1655).anInt9097
	    += method3179();
    }
    
    void method3196() {
	if (((Class142) this).anInt1663 != 0) {
	    ((Class103_Sub1) ((Class142) this).aClass103_Sub1_1655).anInt9097
		-= method3179();
	    int[] is = new int[1];
	    is[0] = ((Class142) this).anInt1663;
	    OpenGL.glDeleteTextures(1, is, 0);
	    ((Class142) this).anInt1663 = 0;
	}
    }
    
    static void method3197(int i, int i_70_, int i_71_, int i_72_,
			   Class175 class175, float[] fs) {
	if (i_71_ > 0 && !Class76.method1772(i_71_, (byte) 93))
	    throw new IllegalArgumentException("");
	if (i_72_ > 0 && !Class76.method1772(i_72_, (byte) 58))
	    throw new IllegalArgumentException("");
	int i_73_ = class175.anInt2121 * 1893442799;
	int i_74_ = 0;
	int i_75_ = i_71_ < i_72_ ? i_71_ : i_72_;
	int i_76_ = i_71_ >> 1;
	int i_77_ = i_72_ >> 1;
	float[] fs_78_ = fs;
	float[] fs_79_ = new float[i_76_ * i_77_ * i_73_];
	for (;;) {
	    OpenGL.glTexImage2Df(i, i_74_, i_70_, i_71_, i_72_, 0,
				 Class103_Sub1.method15202(class175), 5126,
				 fs_78_, 0);
	    if (i_75_ <= 1)
		break;
	    int i_80_ = i_71_ * i_73_;
	    for (int i_81_ = 0; i_81_ < i_73_; i_81_++) {
		int i_82_ = i_81_;
		int i_83_ = i_81_;
		int i_84_ = i_83_ + i_80_;
		for (int i_85_ = 0; i_85_ < i_77_; i_85_++) {
		    for (int i_86_ = 0; i_86_ < i_76_; i_86_++) {
			float f = fs_78_[i_83_];
			i_83_ += i_73_;
			f += fs_78_[i_83_];
			i_83_ += i_73_;
			f += fs_78_[i_84_];
			i_84_ += i_73_;
			f += fs_78_[i_84_];
			i_84_ += i_73_;
			fs_79_[i_82_] = f * 0.25F;
			i_82_ += i_73_;
		    }
		    i_83_ += i_80_;
		    i_84_ += i_80_;
		}
	    }
	    float[] fs_87_ = fs_79_;
	    fs_79_ = fs_78_;
	    fs_78_ = fs_87_;
	    i_71_ = i_76_;
	    i_72_ = i_77_;
	    i_76_ >>= 1;
	    i_77_ >>= 1;
	    i_75_ >>= 1;
	    i_74_++;
	}
    }
    
    void method3198(int i) {
	((Class103_Sub1) ((Class142) this).aClass103_Sub1_1655).anInt9097 -= i;
	((Class103_Sub1) ((Class142) this).aClass103_Sub1_1655).anInt9097
	    += method3179();
    }
    
    void method3199(int i) {
	((Class103_Sub1) ((Class142) this).aClass103_Sub1_1655).anInt9097 -= i;
	((Class103_Sub1) ((Class142) this).aClass103_Sub1_1655).anInt9097
	    += method3179();
    }
    
    void method3200(boolean bool) {
	if (((Class142) this).aBool1660 != bool) {
	    int i = method3179();
	    ((Class142) this).aBool1660 = true;
	    method3194();
	    method3175(i);
	}
    }
    
    int method3201() {
	int i = (((Class142) this).aClass175_1658.anInt2121 * 1893442799
		 * (((Class142) this).aClass102_1656.anInt1447 * -387243519)
		 * ((Class142) this).anInt1662);
	return ((Class142) this).aBool1660 ? i * 4 / 3 : i;
    }
    
    static void method3202(int i, int i_88_, int i_89_, int i_90_, int i_91_,
			   int i_92_, int[] is) {
	if (i_89_ > 0 && !Class76.method1772(i_89_, (byte) 23))
	    throw new IllegalArgumentException("");
	if (i_90_ > 0 && !Class76.method1772(i_90_, (byte) 55))
	    throw new IllegalArgumentException("");
	if (i_91_ != 32993)
	    throw new IllegalArgumentException("");
	int i_93_ = 0;
	int i_94_ = i_89_ < i_90_ ? i_89_ : i_90_;
	int i_95_ = i_89_ >> 1;
	int i_96_ = i_90_ >> 1;
	int[] is_97_ = is;
	int[] is_98_ = new int[i_95_ * i_96_];
	for (;;) {
	    OpenGL.glTexImage2Di(i, i_93_, i_88_, i_89_, i_90_, 0, i_91_,
				 i_92_, is_97_, 0);
	    if (i_94_ <= 1)
		break;
	    int i_99_ = 0;
	    int i_100_ = 0;
	    int i_101_ = i_100_ + i_89_;
	    for (int i_102_ = 0; i_102_ < i_96_; i_102_++) {
		for (int i_103_ = 0; i_103_ < i_95_; i_103_++) {
		    int i_104_ = is_97_[i_100_++];
		    int i_105_ = is_97_[i_100_++];
		    int i_106_ = is_97_[i_101_++];
		    int i_107_ = is_97_[i_101_++];
		    int i_108_ = i_104_ >> 24 & 0xff;
		    int i_109_ = i_104_ >> 16 & 0xff;
		    int i_110_ = i_104_ >> 8 & 0xff;
		    int i_111_ = i_104_ & 0xff;
		    i_108_ += i_105_ >> 24 & 0xff;
		    i_109_ += i_105_ >> 16 & 0xff;
		    i_110_ += i_105_ >> 8 & 0xff;
		    i_111_ += i_105_ & 0xff;
		    i_108_ += i_106_ >> 24 & 0xff;
		    i_109_ += i_106_ >> 16 & 0xff;
		    i_110_ += i_106_ >> 8 & 0xff;
		    i_111_ += i_106_ & 0xff;
		    i_108_ += i_107_ >> 24 & 0xff;
		    i_109_ += i_107_ >> 16 & 0xff;
		    i_110_ += i_107_ >> 8 & 0xff;
		    i_111_ += i_107_ & 0xff;
		    is_98_[i_99_++]
			= ((i_108_ & 0x3fc) << 22 | (i_109_ & 0x3fc) << 14
			   | (i_110_ & 0x3fc) << 6 | (i_111_ & 0x3fc) >> 2);
		}
		i_100_ += i_89_;
		i_101_ += i_89_;
	    }
	    int[] is_112_ = is_98_;
	    is_98_ = is_97_;
	    is_97_ = is_112_;
	    i_89_ = i_95_;
	    i_90_ = i_96_;
	    i_95_ >>= 1;
	    i_96_ >>= 1;
	    i_94_ >>= 1;
	    i_93_++;
	}
    }
    
    void method3203(boolean bool) {
	if (((Class142) this).aBool1660 != bool) {
	    int i = method3179();
	    ((Class142) this).aBool1660 = true;
	    method3194();
	    method3175(i);
	}
    }
    
    static void method3204(int i, int i_113_, int i_114_, int i_115_,
			   Class175 class175, byte[] is) {
	if (i_114_ > 0 && !Class76.method1772(i_114_, (byte) 81))
	    throw new IllegalArgumentException("");
	if (i_115_ > 0 && !Class76.method1772(i_115_, (byte) 91))
	    throw new IllegalArgumentException("");
	int i_116_ = class175.anInt2121 * 1893442799;
	int i_117_ = 0;
	int i_118_ = i_114_ < i_115_ ? i_114_ : i_115_;
	int i_119_ = i_114_ >> 1;
	int i_120_ = i_115_ >> 1;
	byte[] is_121_ = is;
	byte[] is_122_ = new byte[i_119_ * i_120_ * i_116_];
	for (;;) {
	    OpenGL.glTexImage2Dub(i, i_117_, i_113_, i_114_, i_115_, 0,
				  Class103_Sub1.method15202(class175), 5121,
				  is_121_, 0);
	    if (i_118_ <= 1)
		break;
	    int i_123_ = i_114_ * i_116_;
	    for (int i_124_ = 0; i_124_ < i_116_; i_124_++) {
		int i_125_ = i_124_;
		int i_126_ = i_124_;
		int i_127_ = i_126_ + i_123_;
		for (int i_128_ = 0; i_128_ < i_120_; i_128_++) {
		    for (int i_129_ = 0; i_129_ < i_119_; i_129_++) {
			int i_130_ = is_121_[i_126_];
			i_126_ += i_116_;
			i_130_ += is_121_[i_126_];
			i_126_ += i_116_;
			i_130_ += is_121_[i_127_];
			i_127_ += i_116_;
			i_130_ += is_121_[i_127_];
			i_127_ += i_116_;
			is_122_[i_125_] = (byte) (i_130_ >> 2);
			i_125_ += i_116_;
		    }
		    i_126_ += i_123_;
		    i_127_ += i_123_;
		}
	    }
	    byte[] is_131_ = is_122_;
	    is_122_ = is_121_;
	    is_121_ = is_131_;
	    i_114_ = i_119_;
	    i_115_ = i_120_;
	    i_119_ >>= 1;
	    i_120_ >>= 1;
	    i_118_ >>= 1;
	    i_117_++;
	}
    }
    
    static void method3205(int i, int i_132_, int i_133_, int i_134_,
			   Class175 class175, byte[] is) {
	if (i_133_ > 0 && !Class76.method1772(i_133_, (byte) 25))
	    throw new IllegalArgumentException("");
	if (i_134_ > 0 && !Class76.method1772(i_134_, (byte) 66))
	    throw new IllegalArgumentException("");
	int i_135_ = class175.anInt2121 * 1893442799;
	int i_136_ = 0;
	int i_137_ = i_133_ < i_134_ ? i_133_ : i_134_;
	int i_138_ = i_133_ >> 1;
	int i_139_ = i_134_ >> 1;
	byte[] is_140_ = is;
	byte[] is_141_ = new byte[i_138_ * i_139_ * i_135_];
	for (;;) {
	    OpenGL.glTexImage2Dub(i, i_136_, i_132_, i_133_, i_134_, 0,
				  Class103_Sub1.method15202(class175), 5121,
				  is_140_, 0);
	    if (i_137_ <= 1)
		break;
	    int i_142_ = i_133_ * i_135_;
	    for (int i_143_ = 0; i_143_ < i_135_; i_143_++) {
		int i_144_ = i_143_;
		int i_145_ = i_143_;
		int i_146_ = i_145_ + i_142_;
		for (int i_147_ = 0; i_147_ < i_139_; i_147_++) {
		    for (int i_148_ = 0; i_148_ < i_138_; i_148_++) {
			int i_149_ = is_140_[i_145_];
			i_145_ += i_135_;
			i_149_ += is_140_[i_145_];
			i_145_ += i_135_;
			i_149_ += is_140_[i_146_];
			i_146_ += i_135_;
			i_149_ += is_140_[i_146_];
			i_146_ += i_135_;
			is_141_[i_144_] = (byte) (i_149_ >> 2);
			i_144_ += i_135_;
		    }
		    i_145_ += i_142_;
		    i_146_ += i_142_;
		}
	    }
	    byte[] is_150_ = is_141_;
	    is_141_ = is_140_;
	    is_140_ = is_150_;
	    i_133_ = i_138_;
	    i_134_ = i_139_;
	    i_138_ >>= 1;
	    i_139_ >>= 1;
	    i_137_ >>= 1;
	    i_136_++;
	}
    }
    
    static void method3206(int i, int i_151_, int i_152_, int i_153_,
			   Class175 class175, float[] fs) {
	if (i_152_ > 0 && !Class76.method1772(i_152_, (byte) 25))
	    throw new IllegalArgumentException("");
	if (i_153_ > 0 && !Class76.method1772(i_153_, (byte) 101))
	    throw new IllegalArgumentException("");
	int i_154_ = class175.anInt2121 * 1893442799;
	int i_155_ = 0;
	int i_156_ = i_152_ < i_153_ ? i_152_ : i_153_;
	int i_157_ = i_152_ >> 1;
	int i_158_ = i_153_ >> 1;
	float[] fs_159_ = fs;
	float[] fs_160_ = new float[i_157_ * i_158_ * i_154_];
	for (;;) {
	    OpenGL.glTexImage2Df(i, i_155_, i_151_, i_152_, i_153_, 0,
				 Class103_Sub1.method15202(class175), 5126,
				 fs_159_, 0);
	    if (i_156_ <= 1)
		break;
	    int i_161_ = i_152_ * i_154_;
	    for (int i_162_ = 0; i_162_ < i_154_; i_162_++) {
		int i_163_ = i_162_;
		int i_164_ = i_162_;
		int i_165_ = i_164_ + i_161_;
		for (int i_166_ = 0; i_166_ < i_158_; i_166_++) {
		    for (int i_167_ = 0; i_167_ < i_157_; i_167_++) {
			float f = fs_159_[i_164_];
			i_164_ += i_154_;
			f += fs_159_[i_164_];
			i_164_ += i_154_;
			f += fs_159_[i_165_];
			i_165_ += i_154_;
			f += fs_159_[i_165_];
			i_165_ += i_154_;
			fs_160_[i_163_] = f * 0.25F;
			i_163_ += i_154_;
		    }
		    i_164_ += i_161_;
		    i_165_ += i_161_;
		}
	    }
	    float[] fs_168_ = fs_160_;
	    fs_160_ = fs_159_;
	    fs_159_ = fs_168_;
	    i_152_ = i_157_;
	    i_153_ = i_158_;
	    i_157_ >>= 1;
	    i_158_ >>= 1;
	    i_156_ >>= 1;
	    i_155_++;
	}
    }
    
    static void method3207(int i, int i_169_, int i_170_, int i_171_,
			   Class175 class175, float[] fs) {
	if (i_170_ > 0 && !Class76.method1772(i_170_, (byte) 51))
	    throw new IllegalArgumentException("");
	if (i_171_ > 0 && !Class76.method1772(i_171_, (byte) 77))
	    throw new IllegalArgumentException("");
	int i_172_ = class175.anInt2121 * 1893442799;
	int i_173_ = 0;
	int i_174_ = i_170_ < i_171_ ? i_170_ : i_171_;
	int i_175_ = i_170_ >> 1;
	int i_176_ = i_171_ >> 1;
	float[] fs_177_ = fs;
	float[] fs_178_ = new float[i_175_ * i_176_ * i_172_];
	for (;;) {
	    OpenGL.glTexImage2Df(i, i_173_, i_169_, i_170_, i_171_, 0,
				 Class103_Sub1.method15202(class175), 5126,
				 fs_177_, 0);
	    if (i_174_ <= 1)
		break;
	    int i_179_ = i_170_ * i_172_;
	    for (int i_180_ = 0; i_180_ < i_172_; i_180_++) {
		int i_181_ = i_180_;
		int i_182_ = i_180_;
		int i_183_ = i_182_ + i_179_;
		for (int i_184_ = 0; i_184_ < i_176_; i_184_++) {
		    for (int i_185_ = 0; i_185_ < i_175_; i_185_++) {
			float f = fs_177_[i_182_];
			i_182_ += i_172_;
			f += fs_177_[i_182_];
			i_182_ += i_172_;
			f += fs_177_[i_183_];
			i_183_ += i_172_;
			f += fs_177_[i_183_];
			i_183_ += i_172_;
			fs_178_[i_181_] = f * 0.25F;
			i_181_ += i_172_;
		    }
		    i_182_ += i_179_;
		    i_183_ += i_179_;
		}
	    }
	    float[] fs_186_ = fs_178_;
	    fs_178_ = fs_177_;
	    fs_177_ = fs_186_;
	    i_170_ = i_175_;
	    i_171_ = i_176_;
	    i_175_ >>= 1;
	    i_176_ >>= 1;
	    i_174_ >>= 1;
	    i_173_++;
	}
    }
}
