/* Class596 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class596
{
    static final int anInt7673 = 16;
    static final int anInt7674 = 0;
    static final int anInt7675 = 1;
    static final int anInt7676 = 2;
    int anInt7677;
    static Class168 aClass168_7678;
    static final int anInt7679 = 13;
    int anInt7680;
    int anInt7681;
    int anInt7682;
    int anInt7683;
    int anInt7684;
    int anInt7685;
    int anInt7686;
    int anInt7687;
    int anInt7688;
    int anInt7689;
    boolean aBool7690;
    int anInt7691;
    Class168 aClass168_7692;
    int anInt7693;
    static final int anInt7694 = 24;
    static final int anInt7695 = 24;
    static final int anInt7696 = 192;
    static final int anInt7697 = 128;
    int anInt7698;
    int anInt7699;
    static Class89 aClass89_7700;
    static Class168 aClass168_7701;
    static final int anInt7702 = 512;
    static int[] anIntArray7703 = new int[4];
    
    boolean method13080(Class103 class103, Class596 class596_0_) {
	return (((Class596) this).aClass168_7692 != null
		|| method13085(class103, class596_0_));
    }
    
    static void method13081() {
	aClass89_7700 = null;
	aClass168_7678 = null;
    }
    
    boolean method13082(int i, int i_1_, int i_2_, int i_3_) {
	int i_4_;
	int i_5_;
	int i_6_;
	if (!((Class596) this).aBool7690) {
	    i_4_ = ((Class596) this).anInt7693 - i;
	    i_5_ = ((Class596) this).anInt7680 - i_1_;
	    i_6_ = ((Class596) this).anInt7681 - i_2_;
	    ((Class596) this).anInt7687
		= (int) Math.sqrt((double) (i_4_ * i_4_ + i_5_ * i_5_
					    + i_6_ * i_6_));
	    if (((Class596) this).anInt7687 == 0)
		((Class596) this).anInt7687 = 1;
	    i_4_ = (i_4_ << 8) / ((Class596) this).anInt7687;
	    i_5_ = (i_5_ << 8) / ((Class596) this).anInt7687;
	    i_6_ = (i_6_ << 8) / ((Class596) this).anInt7687;
	} else {
	    ((Class596) this).anInt7687 = 1073741823;
	    i_4_ = ((Class596) this).anInt7693;
	    i_5_ = ((Class596) this).anInt7680;
	    i_6_ = ((Class596) this).anInt7681;
	}
	int i_7_ = (int) (Math.sqrt((double) (i_4_ * i_4_ + i_5_ * i_5_
					      + i_6_ * i_6_))
			  * 256.0);
	if (i_7_ > 128) {
	    i_4_ = (i_4_ << 16) / i_7_;
	    i_5_ = (i_5_ << 16) / i_7_;
	    i_6_ = (i_6_ << 16) / i_7_;
	    ((Class596) this).anInt7689
		= (((Class596) this).anInt7698 * i_3_
		   / (((Class596) this).aBool7690 ? 1024
		      : ((Class596) this).anInt7687));
	} else
	    ((Class596) this).anInt7689 = 0;
	if (((Class596) this).anInt7689 < 8) {
	    ((Class596) this).aClass168_7692 = null;
	    return false;
	}
	int i_8_
	    = Class480.method11001(((Class596) this).anInt7689, (byte) 22);
	if (i_8_ > i_3_)
	    i_8_ = RSAKeys.method860(i_3_, -1959341094);
	if (i_8_ > 512)
	    i_8_ = 512;
	if (i_8_ != ((Class596) this).anInt7688)
	    ((Class596) this).anInt7688 = i_8_;
	((Class596) this).anInt7699
	    = (int) (Math.asin((double) ((float) i_5_ / 256.0F))
		     * 2607.5945876176133) & 0x3fff;
	((Class596) this).anInt7686
	    = (int) (Math.atan2((double) i_4_, (double) -i_6_)
		     * 2607.5945876176133) & 0x3fff;
	((Class596) this).aClass168_7692 = null;
	return true;
    }
    
    boolean method13083(Class103 class103, Class596 class596_9_) {
	return (((Class596) this).aClass168_7692 != null
		|| method13085(class103, class596_9_));
    }
    
    void method13084(Class103 class103, int i, int i_10_, int i_11_, int i_12_,
		     int i_13_, int i_14_, int i_15_, int i_16_, int i_17_,
		     int i_18_) {
	if (((Class596) this).aClass168_7692 != null) {
	    float[] fs = new float[3];
	    float f = (float) -(((Class596) this).anInt7693 - i_15_ << 16);
	    float f_19_ = (float) (((Class596) this).anInt7680 - i_16_ << 15);
	    float f_20_ = (float) -(((Class596) this).anInt7681 - i_17_ << 16);
	    float[] fs_21_ = new float[3];
	    class103.method2307().method5140(fs_21_);
	    f += fs_21_[0];
	    f_19_ += fs_21_[1];
	    f_20_ += fs_21_[2];
	    class103.method2338(f, f_19_, f_20_, fs);
	    if (!(fs[2] < 0.0F)) {
		int i_22_ = (int) (fs[0] - (float) (((Class596) this).anInt7689
						    / 2));
		int i_23_ = (int) (fs[1] - (float) (((Class596) this).anInt7689
						    / 2));
		if (i_23_ < i_12_ && i_23_ + ((Class596) this).anInt7689 > 0
		    && i_22_ < i_11_
		    && i_22_ + ((Class596) this).anInt7689 > 0)
		    ((Class596) this).aClass168_7692.method3615
			(i_22_, i_23_, ((Class596) this).anInt7689,
			 ((Class596) this).anInt7689, 0,
			 i_18_ << 24 | 0xffffff, 1);
	    }
	}
    }
    
    boolean method13085(Class103 class103, Class596 class596_24_) {
	if (((Class596) this).aClass168_7692 == null) {
	    if (((Class596) this).anInt7677 == 0) {
		if (Class589.anInterface6_7614.method31
		    (((Class596) this).anInt7683, Class537.aClass537_6990,
		     0.7F, ((Class596) this).anInt7688,
		     ((Class596) this).anInt7688, false, -2121149751)) {
		    int[] is
			= (Class589.anInterface6_7614.method30
			   (((Class596) this).anInt7683, 0.7F,
			    ((Class596) this).anInt7688,
			    ((Class596) this).anInt7688, false, -2086874277));
		    ((Class596) this).aClass168_7692
			= class103.method2259(is, 0,
					      ((Class596) this).anInt7688,
					      ((Class596) this).anInt7688,
					      ((Class596) this).anInt7688,
					      (byte) -46);
		}
	    } else if (((Class596) this).anInt7677 == 2)
		method13096(class103, class596_24_);
	    else if (((Class596) this).anInt7677 == 1)
		method13086(class103, class596_24_);
	}
	return ((Class596) this).aClass168_7692 != null;
    }
    
    public Class596(int i, int i_25_, int i_26_, int i_27_, int i_28_,
		    int i_29_, int i_30_, boolean bool, int i_31_, int i_32_,
		    int i_33_) {
	((Class596) this).anInt7693 = i_26_;
	((Class596) this).anInt7680 = i_27_;
	((Class596) this).anInt7681 = i_28_;
	((Class596) this).aBool7690 = bool;
	((Class596) this).anInt7683 = i_25_;
	((Class596) this).anInt7684 = i_30_;
	((Class596) this).anInt7698 = i_29_;
	((Class596) this).anInt7677 = i;
	((Class596) this).anInt7691 = i_31_;
	((Class596) this).anInt7682 = i_32_;
	((Class596) this).anInt7685 = i_33_;
    }
    
    void method13086(Class103 class103, Class596 class596_34_) {
	method13094(class103);
	method13087(class103);
	class103.method2260(anIntArray7703);
	class103.method2445(0, 0, ((Class596) this).anInt7688,
			    ((Class596) this).anInt7688);
	class103.method2450(2, 0);
	class103.method2396(0, 0, ((Class596) this).anInt7688,
			    ((Class596) this).anInt7688,
			    ~0xffffff | ((Class596) this).anInt7684, 0);
	int i = 0;
	int i_35_ = 0;
	int i_36_ = 256;
	if (class596_34_ != null) {
	    if (((Class596) class596_34_).aBool7690) {
		i = -((Class596) class596_34_).anInt7693;
		i_35_ = -((Class596) class596_34_).anInt7680;
		i_36_ = -((Class596) class596_34_).anInt7681;
	    } else {
		i = (((Class596) class596_34_).anInt7693
		     - ((Class596) this).anInt7693);
		i_35_ = (((Class596) class596_34_).anInt7680
			 - ((Class596) this).anInt7680);
		i_36_ = (((Class596) class596_34_).anInt7681
			 - ((Class596) this).anInt7681);
	    }
	}
	if (((Class596) this).anInt7699 != 0) {
	    int i_37_ = Class282.anIntArray4430[((Class596) this).anInt7699];
	    int i_38_ = Class282.anIntArray4441[((Class596) this).anInt7699];
	    int i_39_ = i_35_ * i_38_ - i_36_ * i_37_ >> 14;
	    i_36_ = i_35_ * i_37_ + i_36_ * i_38_ >> 14;
	    i_35_ = i_39_;
	}
	if (((Class596) this).anInt7686 != 0) {
	    int i_40_ = Class282.anIntArray4430[((Class596) this).anInt7686];
	    int i_41_ = Class282.anIntArray4441[((Class596) this).anInt7686];
	    int i_42_ = i_36_ * i_40_ + i * i_41_ >> 14;
	    i_36_ = i_36_ * i_41_ - i * i_40_ >> 14;
	    i = i_42_;
	}
	Class89 class89 = aClass89_7700.method2019((byte) 0, 51200, true);
	class89.method1985((short) 0, (short) ((Class596) this).anInt7683);
	class103.method2311(1.0F);
	class103.method2227(16777215, 1.0F, 1.0F, (float) i, (float) i_35_,
			    (float) i_36_);
	int i_43_ = (1024 * ((Class596) this).anInt7688
		     / (class89.method1906() - class89.method1895()));
	if (((Class596) this).anInt7684 != 0)
	    i_43_ = i_43_ * 13 / 16;
	Class268 class268 = class103.method2310();
	Class268 class268_44_ = class103.method2226();
	class268_44_.method5216((float) (((Class596) this).anInt7688 / 2),
				(float) (((Class596) this).anInt7688 / 2),
				(float) i_43_, (float) i_43_, 50.0F, 50000.0F,
				(float) class103.method2237((byte) 4)
					    .method2655(),
				(float) class103.method2237((byte) 4)
					    .method2654(),
				1024.0F);
	class103.method2309(class268_44_);
	class103.method2512(new Class266());
	Class266 class266 = new Class266();
	class266.method5131(0.0F, 0.0F, (float) (50 - class89.method1899()));
	class89.method1890(class266, null, 1);
	int i_45_ = ((Class596) this).anInt7688 * 13 / 16;
	int i_46_ = (((Class596) this).anInt7688 - i_45_) / 2;
	aClass168_7701.method3615(i_46_, i_46_, i_45_, i_45_, 0,
				  ~0xffffff | ((Class596) this).anInt7684, 1);
	((Class596) this).aClass168_7692
	    = class103.method2290(0, 0, ((Class596) this).anInt7688,
				  ((Class596) this).anInt7688, true);
	class103.method2450(2, 0);
	class103.method2396(0, 0, ((Class596) this).anInt7688,
			    ((Class596) this).anInt7688, 0, 0);
	aClass168_7678.method3615(0, 0, ((Class596) this).anInt7688,
				  ((Class596) this).anInt7688, 1, 0, 0);
	((Class596) this).aClass168_7692.method3610(0, 0, 3);
	class103.method2309(class268);
	class103.method2445(anIntArray7703[0], anIntArray7703[1],
			    anIntArray7703[2], anIntArray7703[3]);
    }
    
    static void method13087(Class103 class103) {
	if (aClass168_7678 == null) {
	    int[] is = new int[16384];
	    int[] is_47_ = new int[16384];
	    for (int i = 0; i < 64; i++) {
		int i_48_ = 64 - i;
		i_48_ *= i_48_;
		int i_49_ = 128 - i - 1;
		int i_50_ = i * 128;
		int i_51_ = i_49_ * 128;
		for (int i_52_ = 0; i_52_ < 64; i_52_++) {
		    int i_53_ = 64 - i_52_;
		    i_53_ *= i_53_;
		    int i_54_ = 128 - i_52_ - 1;
		    int i_55_ = 256 - (i_53_ + i_48_ << 8) / 4096;
		    i_55_ = i_55_ * 3072 / 1536;
		    if (i_55_ < 0)
			i_55_ = 0;
		    else if (i_55_ > 255)
			i_55_ = 255;
		    int i_56_ = i_55_ / 2;
		    is_47_[i_50_ + i_52_] = is_47_[i_50_ + i_54_]
			= is_47_[i_51_ + i_52_] = is_47_[i_51_ + i_54_]
			= ~0xffffff | i_55_ << 16;
		    is[i_50_ + i_52_] = is[i_50_ + i_54_]
			= is[i_51_ + i_52_] = is[i_51_ + i_54_]
			= 127 - i_56_ << 24 | 0xffffff;
		}
	    }
	    aClass168_7678
		= class103.method2259(is_47_, 0, 128, 128, 128, (byte) -118);
	    aClass168_7701
		= class103.method2259(is, 0, 128, 128, 128, (byte) -43);
	}
    }
    
    static void method13088(Class103 class103) {
	if (aClass168_7678 == null) {
	    int[] is = new int[16384];
	    int[] is_57_ = new int[16384];
	    for (int i = 0; i < 64; i++) {
		int i_58_ = 64 - i;
		i_58_ *= i_58_;
		int i_59_ = 128 - i - 1;
		int i_60_ = i * 128;
		int i_61_ = i_59_ * 128;
		for (int i_62_ = 0; i_62_ < 64; i_62_++) {
		    int i_63_ = 64 - i_62_;
		    i_63_ *= i_63_;
		    int i_64_ = 128 - i_62_ - 1;
		    int i_65_ = 256 - (i_63_ + i_58_ << 8) / 4096;
		    i_65_ = i_65_ * 3072 / 1536;
		    if (i_65_ < 0)
			i_65_ = 0;
		    else if (i_65_ > 255)
			i_65_ = 255;
		    int i_66_ = i_65_ / 2;
		    is_57_[i_60_ + i_62_] = is_57_[i_60_ + i_64_]
			= is_57_[i_61_ + i_62_] = is_57_[i_61_ + i_64_]
			= ~0xffffff | i_65_ << 16;
		    is[i_60_ + i_62_] = is[i_60_ + i_64_]
			= is[i_61_ + i_62_] = is[i_61_ + i_64_]
			= 127 - i_66_ << 24 | 0xffffff;
		}
	    }
	    aClass168_7678
		= class103.method2259(is_57_, 0, 128, 128, 128, (byte) 17);
	    aClass168_7701
		= class103.method2259(is, 0, 128, 128, 128, (byte) -46);
	}
    }
    
    boolean method13089(Class103 class103, Class596 class596_67_) {
	return (((Class596) this).aClass168_7692 != null
		|| method13085(class103, class596_67_));
    }
    
    boolean method13090(int i, int i_68_, int i_69_, int i_70_) {
	int i_71_;
	int i_72_;
	int i_73_;
	if (!((Class596) this).aBool7690) {
	    i_71_ = ((Class596) this).anInt7693 - i;
	    i_72_ = ((Class596) this).anInt7680 - i_68_;
	    i_73_ = ((Class596) this).anInt7681 - i_69_;
	    ((Class596) this).anInt7687
		= (int) Math.sqrt((double) (i_71_ * i_71_ + i_72_ * i_72_
					    + i_73_ * i_73_));
	    if (((Class596) this).anInt7687 == 0)
		((Class596) this).anInt7687 = 1;
	    i_71_ = (i_71_ << 8) / ((Class596) this).anInt7687;
	    i_72_ = (i_72_ << 8) / ((Class596) this).anInt7687;
	    i_73_ = (i_73_ << 8) / ((Class596) this).anInt7687;
	} else {
	    ((Class596) this).anInt7687 = 1073741823;
	    i_71_ = ((Class596) this).anInt7693;
	    i_72_ = ((Class596) this).anInt7680;
	    i_73_ = ((Class596) this).anInt7681;
	}
	int i_74_ = (int) (Math.sqrt((double) (i_71_ * i_71_ + i_72_ * i_72_
					       + i_73_ * i_73_))
			   * 256.0);
	if (i_74_ > 128) {
	    i_71_ = (i_71_ << 16) / i_74_;
	    i_72_ = (i_72_ << 16) / i_74_;
	    i_73_ = (i_73_ << 16) / i_74_;
	    ((Class596) this).anInt7689
		= (((Class596) this).anInt7698 * i_70_
		   / (((Class596) this).aBool7690 ? 1024
		      : ((Class596) this).anInt7687));
	} else
	    ((Class596) this).anInt7689 = 0;
	if (((Class596) this).anInt7689 < 8) {
	    ((Class596) this).aClass168_7692 = null;
	    return false;
	}
	int i_75_
	    = Class480.method11001(((Class596) this).anInt7689, (byte) -15);
	if (i_75_ > i_70_)
	    i_75_ = RSAKeys.method860(i_70_, -1959341094);
	if (i_75_ > 512)
	    i_75_ = 512;
	if (i_75_ != ((Class596) this).anInt7688)
	    ((Class596) this).anInt7688 = i_75_;
	((Class596) this).anInt7699
	    = (int) (Math.asin((double) ((float) i_72_ / 256.0F))
		     * 2607.5945876176133) & 0x3fff;
	((Class596) this).anInt7686
	    = (int) (Math.atan2((double) i_71_, (double) -i_73_)
		     * 2607.5945876176133) & 0x3fff;
	((Class596) this).aClass168_7692 = null;
	return true;
    }
    
    boolean method13091(Class103 class103, Class596 class596_76_) {
	return (((Class596) this).aClass168_7692 != null
		|| method13085(class103, class596_76_));
    }
    
    static void method13092(Class103 class103) {
	if (aClass168_7678 == null) {
	    int[] is = new int[16384];
	    int[] is_77_ = new int[16384];
	    for (int i = 0; i < 64; i++) {
		int i_78_ = 64 - i;
		i_78_ *= i_78_;
		int i_79_ = 128 - i - 1;
		int i_80_ = i * 128;
		int i_81_ = i_79_ * 128;
		for (int i_82_ = 0; i_82_ < 64; i_82_++) {
		    int i_83_ = 64 - i_82_;
		    i_83_ *= i_83_;
		    int i_84_ = 128 - i_82_ - 1;
		    int i_85_ = 256 - (i_83_ + i_78_ << 8) / 4096;
		    i_85_ = i_85_ * 3072 / 1536;
		    if (i_85_ < 0)
			i_85_ = 0;
		    else if (i_85_ > 255)
			i_85_ = 255;
		    int i_86_ = i_85_ / 2;
		    is_77_[i_80_ + i_82_] = is_77_[i_80_ + i_84_]
			= is_77_[i_81_ + i_82_] = is_77_[i_81_ + i_84_]
			= ~0xffffff | i_85_ << 16;
		    is[i_80_ + i_82_] = is[i_80_ + i_84_]
			= is[i_81_ + i_82_] = is[i_81_ + i_84_]
			= 127 - i_86_ << 24 | 0xffffff;
		}
	    }
	    aClass168_7678
		= class103.method2259(is_77_, 0, 128, 128, 128, (byte) -80);
	    aClass168_7701
		= class103.method2259(is, 0, 128, 128, 128, (byte) -128);
	}
    }
    
    void method13093(Class103 class103, int i, int i_87_, int i_88_, int i_89_,
		     int i_90_, int i_91_, int i_92_, int i_93_, int i_94_,
		     int i_95_) {
	if (((Class596) this).aClass168_7692 != null) {
	    float[] fs = new float[3];
	    float f = (float) -(((Class596) this).anInt7693 - i_92_ << 16);
	    float f_96_ = (float) (((Class596) this).anInt7680 - i_93_ << 15);
	    float f_97_ = (float) -(((Class596) this).anInt7681 - i_94_ << 16);
	    float[] fs_98_ = new float[3];
	    class103.method2307().method5140(fs_98_);
	    f += fs_98_[0];
	    f_96_ += fs_98_[1];
	    f_97_ += fs_98_[2];
	    class103.method2338(f, f_96_, f_97_, fs);
	    if (!(fs[2] < 0.0F)) {
		int i_99_ = (int) (fs[0] - (float) (((Class596) this).anInt7689
						    / 2));
		int i_100_
		    = (int) (fs[1]
			     - (float) (((Class596) this).anInt7689 / 2));
		if (i_100_ < i_89_ && i_100_ + ((Class596) this).anInt7689 > 0
		    && i_99_ < i_88_
		    && i_99_ + ((Class596) this).anInt7689 > 0)
		    ((Class596) this).aClass168_7692.method3615
			(i_99_, i_100_, ((Class596) this).anInt7689,
			 ((Class596) this).anInt7689, 0,
			 i_95_ << 24 | 0xffffff, 1);
	    }
	}
    }
    
    static void method13094(Class103 class103) {
	if (aClass89_7700 == null) {
	    Class161 class161 = new Class161(580, 1104, 1);
	    class161.method3454((short) 0, (short) 32767, (short) 0,
				(short) 1024, (short) 1024, (short) 1024,
				(byte) 0, (byte) 0, (byte) 0);
	    class161.method3451(0, 128, 0);
	    class161.method3451(0, -128, 0);
	    for (int i = 0; i <= 24; i++) {
		int i_101_ = i * 8192 / 24;
		int i_102_ = Class282.anIntArray4430[i_101_];
		int i_103_ = Class282.anIntArray4441[i_101_];
		for (int i_104_ = 1; i_104_ < 24; i_104_++) {
		    int i_105_ = i_104_ * 8192 / 24;
		    int i_106_ = Class282.anIntArray4441[i_105_] >> 7;
		    int i_107_
			= Class282.anIntArray4430[i_105_] * i_102_ >> 21;
		    int i_108_
			= Class282.anIntArray4430[i_105_] * i_103_ >> 21;
		    class161.method3451(i_108_, i_106_, -i_107_);
		}
		if (i > 0) {
		    int i_109_ = i * 23 + 2;
		    int i_110_ = i_109_ - 23;
		    class161.method3452(0, i_110_, i_109_, (byte) 0, (byte) 0,
					(short) 127, (byte) 0, (short) 0);
		    for (int i_111_ = 1; i_111_ < 23; i_111_++) {
			int i_112_ = i_110_ + 1;
			int i_113_ = i_109_ + 1;
			class161.method3452(i_110_, i_112_, i_109_, (byte) 0,
					    (byte) 0, (short) 127, (byte) 0,
					    (short) 0);
			class161.method3452(i_112_, i_113_, i_109_, (byte) 0,
					    (byte) 0, (short) 127, (byte) 0,
					    (short) 0);
			i_110_ = i_112_;
			i_109_ = i_113_;
		    }
		    class161.method3452(i_109_, i_110_, 1, (byte) 0, (byte) 0,
					(short) 127, (byte) 0, (short) 0);
		}
	    }
	    class161.anInt1805 = class161.anInt1790;
	    class161.anIntArray1814 = null;
	    class161.anIntArray1799 = null;
	    class161.aByteArray1809 = null;
	    aClass89_7700 = class103.method2356(class161, 51200, 33, 64, 768);
	}
    }
    
    boolean method13095(int i, int i_114_, int i_115_, int i_116_) {
	int i_117_;
	int i_118_;
	int i_119_;
	if (!((Class596) this).aBool7690) {
	    i_117_ = ((Class596) this).anInt7693 - i;
	    i_118_ = ((Class596) this).anInt7680 - i_114_;
	    i_119_ = ((Class596) this).anInt7681 - i_115_;
	    ((Class596) this).anInt7687
		= (int) Math.sqrt((double) (i_117_ * i_117_ + i_118_ * i_118_
					    + i_119_ * i_119_));
	    if (((Class596) this).anInt7687 == 0)
		((Class596) this).anInt7687 = 1;
	    i_117_ = (i_117_ << 8) / ((Class596) this).anInt7687;
	    i_118_ = (i_118_ << 8) / ((Class596) this).anInt7687;
	    i_119_ = (i_119_ << 8) / ((Class596) this).anInt7687;
	} else {
	    ((Class596) this).anInt7687 = 1073741823;
	    i_117_ = ((Class596) this).anInt7693;
	    i_118_ = ((Class596) this).anInt7680;
	    i_119_ = ((Class596) this).anInt7681;
	}
	int i_120_
	    = (int) (Math.sqrt((double) (i_117_ * i_117_ + i_118_ * i_118_
					 + i_119_ * i_119_))
		     * 256.0);
	if (i_120_ > 128) {
	    i_117_ = (i_117_ << 16) / i_120_;
	    i_118_ = (i_118_ << 16) / i_120_;
	    i_119_ = (i_119_ << 16) / i_120_;
	    ((Class596) this).anInt7689
		= (((Class596) this).anInt7698 * i_116_
		   / (((Class596) this).aBool7690 ? 1024
		      : ((Class596) this).anInt7687));
	} else
	    ((Class596) this).anInt7689 = 0;
	if (((Class596) this).anInt7689 < 8) {
	    ((Class596) this).aClass168_7692 = null;
	    return false;
	}
	int i_121_
	    = Class480.method11001(((Class596) this).anInt7689, (byte) -89);
	if (i_121_ > i_116_)
	    i_121_ = RSAKeys.method860(i_116_, -1959341094);
	if (i_121_ > 512)
	    i_121_ = 512;
	if (i_121_ != ((Class596) this).anInt7688)
	    ((Class596) this).anInt7688 = i_121_;
	((Class596) this).anInt7699
	    = (int) (Math.asin((double) ((float) i_118_ / 256.0F))
		     * 2607.5945876176133) & 0x3fff;
	((Class596) this).anInt7686
	    = (int) (Math.atan2((double) i_117_, (double) -i_119_)
		     * 2607.5945876176133) & 0x3fff;
	((Class596) this).aClass168_7692 = null;
	return true;
    }
    
    void method13096(Class103 class103, Class596 class596_122_) {
	Class161 class161
	    = Class161.method3448(Class448.aClass210_6192,
				  ((Class596) this).anInt7683, 0);
	if (class161 != null) {
	    class103.method2260(anIntArray7703);
	    class103.method2445(0, 0, ((Class596) this).anInt7688,
				((Class596) this).anInt7688);
	    class103.method2450(2, 0);
	    class103.method2396(0, 0, ((Class596) this).anInt7688,
				((Class596) this).anInt7688, 0, 0);
	    int i = 0;
	    int i_123_ = 0;
	    int i_124_ = 256;
	    if (class596_122_ != null) {
		if (((Class596) class596_122_).aBool7690) {
		    i = -((Class596) class596_122_).anInt7693;
		    i_123_ = -((Class596) class596_122_).anInt7680;
		    i_124_ = -((Class596) class596_122_).anInt7681;
		} else {
		    i = (((Class596) this).anInt7693
			 - ((Class596) class596_122_).anInt7693);
		    i_123_ = (((Class596) this).anInt7680
			      - ((Class596) class596_122_).anInt7680);
		    i_124_ = (((Class596) this).anInt7681
			      - ((Class596) class596_122_).anInt7681);
		}
	    }
	    if (((Class596) this).anInt7699 != 0) {
		int i_125_ = -((Class596) this).anInt7699 & 0x3fff;
		int i_126_ = Class282.anIntArray4430[i_125_];
		int i_127_ = Class282.anIntArray4441[i_125_];
		int i_128_ = i_123_ * i_127_ - i_124_ * i_126_ >> 14;
		i_124_ = i_123_ * i_126_ + i_124_ * i_127_ >> 14;
		i_123_ = i_128_;
	    }
	    if (((Class596) this).anInt7686 != 0) {
		int i_129_ = -((Class596) this).anInt7686 & 0x3fff;
		int i_130_ = Class282.anIntArray4430[i_129_];
		int i_131_ = Class282.anIntArray4441[i_129_];
		int i_132_ = i_124_ * i_130_ + i * i_131_ >> 14;
		i_124_ = i_124_ * i_131_ - i * i_130_ >> 14;
		i = i_132_;
	    }
	    class103.method2311(1.0F);
	    class103.method2227(((Class596) this).anInt7684, 1.0F, 1.0F,
				(float) i, (float) i_123_, (float) i_124_);
	    class161.method3489(((Class596) this).anInt7691 & 0x3fff,
				((Class596) this).anInt7682 & 0x3fff,
				((Class596) this).anInt7685 & 0x3fff);
	    Class89 class89 = class103.method2356(class161, 2048, 0, 64, 768);
	    int i_133_ = class89.method1906() - class89.method1895();
	    int i_134_ = class89.method1865() - class89.method1902();
	    int i_135_ = i_133_ > i_134_ ? i_133_ : i_134_;
	    int i_136_ = 1024 * ((Class596) this).anInt7688 / i_135_;
	    Class268 class268 = class103.method2310();
	    Class268 class268_137_ = class103.method2226();
	    class268_137_.method5216
		((float) (((Class596) this).anInt7688 / 2),
		 (float) (((Class596) this).anInt7688 / 2), (float) i_136_,
		 (float) i_136_, 50.0F, 50000.0F,
		 (float) class103.method2237((byte) 4).method2655(),
		 (float) class103.method2237((byte) 4).method2654(), 1024.0F);
	    class103.method2309(class268_137_);
	    Class266 class266 = new Class266();
	    class103.method2512(class266);
	    Class266 class266_138_ = class103.method2595();
	    class266_138_.method5131(0.0F, 0.0F,
				     (float) (50 - class89.method1899()));
	    class89.method1890(class266_138_, null, 1);
	    ((Class596) this).aClass168_7692
		= class103.method2290(0, 0, ((Class596) this).anInt7688,
				      ((Class596) this).anInt7688, true);
	    ((Class596) this).aClass168_7692.method3610(0, 0, 3);
	    class103.method2309(class268);
	    class103.method2445(anIntArray7703[0], anIntArray7703[1],
				anIntArray7703[2], anIntArray7703[3]);
	}
    }
    
    boolean method13097(Class103 class103, Class596 class596_139_) {
	if (((Class596) this).aClass168_7692 == null) {
	    if (((Class596) this).anInt7677 == 0) {
		if (Class589.anInterface6_7614.method31
		    (((Class596) this).anInt7683, Class537.aClass537_6990,
		     0.7F, ((Class596) this).anInt7688,
		     ((Class596) this).anInt7688, false, 374666802)) {
		    int[] is
			= (Class589.anInterface6_7614.method30
			   (((Class596) this).anInt7683, 0.7F,
			    ((Class596) this).anInt7688,
			    ((Class596) this).anInt7688, false, -2086874277));
		    ((Class596) this).aClass168_7692
			= class103.method2259(is, 0,
					      ((Class596) this).anInt7688,
					      ((Class596) this).anInt7688,
					      ((Class596) this).anInt7688,
					      (byte) 19);
		}
	    } else if (((Class596) this).anInt7677 == 2)
		method13096(class103, class596_139_);
	    else if (((Class596) this).anInt7677 == 1)
		method13086(class103, class596_139_);
	}
	return ((Class596) this).aClass168_7692 != null;
    }
    
    boolean method13098(Class103 class103, Class596 class596_140_) {
	if (((Class596) this).aClass168_7692 == null) {
	    if (((Class596) this).anInt7677 == 0) {
		if (Class589.anInterface6_7614.method31
		    (((Class596) this).anInt7683, Class537.aClass537_6990,
		     0.7F, ((Class596) this).anInt7688,
		     ((Class596) this).anInt7688, false, 603109747)) {
		    int[] is
			= (Class589.anInterface6_7614.method30
			   (((Class596) this).anInt7683, 0.7F,
			    ((Class596) this).anInt7688,
			    ((Class596) this).anInt7688, false, -2086874277));
		    ((Class596) this).aClass168_7692
			= class103.method2259(is, 0,
					      ((Class596) this).anInt7688,
					      ((Class596) this).anInt7688,
					      ((Class596) this).anInt7688,
					      (byte) -76);
		}
	    } else if (((Class596) this).anInt7677 == 2)
		method13096(class103, class596_140_);
	    else if (((Class596) this).anInt7677 == 1)
		method13086(class103, class596_140_);
	}
	return ((Class596) this).aClass168_7692 != null;
    }
    
    boolean method13099(Class103 class103, Class596 class596_141_) {
	if (((Class596) this).aClass168_7692 == null) {
	    if (((Class596) this).anInt7677 == 0) {
		if (Class589.anInterface6_7614.method31
		    (((Class596) this).anInt7683, Class537.aClass537_6990,
		     0.7F, ((Class596) this).anInt7688,
		     ((Class596) this).anInt7688, false, -2031917685)) {
		    int[] is
			= (Class589.anInterface6_7614.method30
			   (((Class596) this).anInt7683, 0.7F,
			    ((Class596) this).anInt7688,
			    ((Class596) this).anInt7688, false, -2086874277));
		    ((Class596) this).aClass168_7692
			= class103.method2259(is, 0,
					      ((Class596) this).anInt7688,
					      ((Class596) this).anInt7688,
					      ((Class596) this).anInt7688,
					      (byte) -111);
		}
	    } else if (((Class596) this).anInt7677 == 2)
		method13096(class103, class596_141_);
	    else if (((Class596) this).anInt7677 == 1)
		method13086(class103, class596_141_);
	}
	return ((Class596) this).aClass168_7692 != null;
    }
    
    boolean method13100(Class103 class103, Class596 class596_142_) {
	if (((Class596) this).aClass168_7692 == null) {
	    if (((Class596) this).anInt7677 == 0) {
		if (Class589.anInterface6_7614.method31
		    (((Class596) this).anInt7683, Class537.aClass537_6990,
		     0.7F, ((Class596) this).anInt7688,
		     ((Class596) this).anInt7688, false, -877938875)) {
		    int[] is
			= (Class589.anInterface6_7614.method30
			   (((Class596) this).anInt7683, 0.7F,
			    ((Class596) this).anInt7688,
			    ((Class596) this).anInt7688, false, -2086874277));
		    ((Class596) this).aClass168_7692
			= class103.method2259(is, 0,
					      ((Class596) this).anInt7688,
					      ((Class596) this).anInt7688,
					      ((Class596) this).anInt7688,
					      (byte) -67);
		}
	    } else if (((Class596) this).anInt7677 == 2)
		method13096(class103, class596_142_);
	    else if (((Class596) this).anInt7677 == 1)
		method13086(class103, class596_142_);
	}
	return ((Class596) this).aClass168_7692 != null;
    }
    
    void method13101(Class103 class103, Class596 class596_143_) {
	method13094(class103);
	method13087(class103);
	class103.method2260(anIntArray7703);
	class103.method2445(0, 0, ((Class596) this).anInt7688,
			    ((Class596) this).anInt7688);
	class103.method2450(2, 0);
	class103.method2396(0, 0, ((Class596) this).anInt7688,
			    ((Class596) this).anInt7688,
			    ~0xffffff | ((Class596) this).anInt7684, 0);
	int i = 0;
	int i_144_ = 0;
	int i_145_ = 256;
	if (class596_143_ != null) {
	    if (((Class596) class596_143_).aBool7690) {
		i = -((Class596) class596_143_).anInt7693;
		i_144_ = -((Class596) class596_143_).anInt7680;
		i_145_ = -((Class596) class596_143_).anInt7681;
	    } else {
		i = (((Class596) class596_143_).anInt7693
		     - ((Class596) this).anInt7693);
		i_144_ = (((Class596) class596_143_).anInt7680
			  - ((Class596) this).anInt7680);
		i_145_ = (((Class596) class596_143_).anInt7681
			  - ((Class596) this).anInt7681);
	    }
	}
	if (((Class596) this).anInt7699 != 0) {
	    int i_146_ = Class282.anIntArray4430[((Class596) this).anInt7699];
	    int i_147_ = Class282.anIntArray4441[((Class596) this).anInt7699];
	    int i_148_ = i_144_ * i_147_ - i_145_ * i_146_ >> 14;
	    i_145_ = i_144_ * i_146_ + i_145_ * i_147_ >> 14;
	    i_144_ = i_148_;
	}
	if (((Class596) this).anInt7686 != 0) {
	    int i_149_ = Class282.anIntArray4430[((Class596) this).anInt7686];
	    int i_150_ = Class282.anIntArray4441[((Class596) this).anInt7686];
	    int i_151_ = i_145_ * i_149_ + i * i_150_ >> 14;
	    i_145_ = i_145_ * i_150_ - i * i_149_ >> 14;
	    i = i_151_;
	}
	Class89 class89 = aClass89_7700.method2019((byte) 0, 51200, true);
	class89.method1985((short) 0, (short) ((Class596) this).anInt7683);
	class103.method2311(1.0F);
	class103.method2227(16777215, 1.0F, 1.0F, (float) i, (float) i_144_,
			    (float) i_145_);
	int i_152_ = (1024 * ((Class596) this).anInt7688
		      / (class89.method1906() - class89.method1895()));
	if (((Class596) this).anInt7684 != 0)
	    i_152_ = i_152_ * 13 / 16;
	Class268 class268 = class103.method2310();
	Class268 class268_153_ = class103.method2226();
	class268_153_.method5216
	    ((float) (((Class596) this).anInt7688 / 2),
	     (float) (((Class596) this).anInt7688 / 2), (float) i_152_,
	     (float) i_152_, 50.0F, 50000.0F,
	     (float) class103.method2237((byte) 4).method2655(),
	     (float) class103.method2237((byte) 4).method2654(), 1024.0F);
	class103.method2309(class268_153_);
	class103.method2512(new Class266());
	Class266 class266 = new Class266();
	class266.method5131(0.0F, 0.0F, (float) (50 - class89.method1899()));
	class89.method1890(class266, null, 1);
	int i_154_ = ((Class596) this).anInt7688 * 13 / 16;
	int i_155_ = (((Class596) this).anInt7688 - i_154_) / 2;
	aClass168_7701.method3615(i_155_, i_155_, i_154_, i_154_, 0,
				  ~0xffffff | ((Class596) this).anInt7684, 1);
	((Class596) this).aClass168_7692
	    = class103.method2290(0, 0, ((Class596) this).anInt7688,
				  ((Class596) this).anInt7688, true);
	class103.method2450(2, 0);
	class103.method2396(0, 0, ((Class596) this).anInt7688,
			    ((Class596) this).anInt7688, 0, 0);
	aClass168_7678.method3615(0, 0, ((Class596) this).anInt7688,
				  ((Class596) this).anInt7688, 1, 0, 0);
	((Class596) this).aClass168_7692.method3610(0, 0, 3);
	class103.method2309(class268);
	class103.method2445(anIntArray7703[0], anIntArray7703[1],
			    anIntArray7703[2], anIntArray7703[3]);
    }
    
    static void method13102(Class103 class103) {
	if (aClass89_7700 == null) {
	    Class161 class161 = new Class161(580, 1104, 1);
	    class161.method3454((short) 0, (short) 32767, (short) 0,
				(short) 1024, (short) 1024, (short) 1024,
				(byte) 0, (byte) 0, (byte) 0);
	    class161.method3451(0, 128, 0);
	    class161.method3451(0, -128, 0);
	    for (int i = 0; i <= 24; i++) {
		int i_156_ = i * 8192 / 24;
		int i_157_ = Class282.anIntArray4430[i_156_];
		int i_158_ = Class282.anIntArray4441[i_156_];
		for (int i_159_ = 1; i_159_ < 24; i_159_++) {
		    int i_160_ = i_159_ * 8192 / 24;
		    int i_161_ = Class282.anIntArray4441[i_160_] >> 7;
		    int i_162_
			= Class282.anIntArray4430[i_160_] * i_157_ >> 21;
		    int i_163_
			= Class282.anIntArray4430[i_160_] * i_158_ >> 21;
		    class161.method3451(i_163_, i_161_, -i_162_);
		}
		if (i > 0) {
		    int i_164_ = i * 23 + 2;
		    int i_165_ = i_164_ - 23;
		    class161.method3452(0, i_165_, i_164_, (byte) 0, (byte) 0,
					(short) 127, (byte) 0, (short) 0);
		    for (int i_166_ = 1; i_166_ < 23; i_166_++) {
			int i_167_ = i_165_ + 1;
			int i_168_ = i_164_ + 1;
			class161.method3452(i_165_, i_167_, i_164_, (byte) 0,
					    (byte) 0, (short) 127, (byte) 0,
					    (short) 0);
			class161.method3452(i_167_, i_168_, i_164_, (byte) 0,
					    (byte) 0, (short) 127, (byte) 0,
					    (short) 0);
			i_165_ = i_167_;
			i_164_ = i_168_;
		    }
		    class161.method3452(i_164_, i_165_, 1, (byte) 0, (byte) 0,
					(short) 127, (byte) 0, (short) 0);
		}
	    }
	    class161.anInt1805 = class161.anInt1790;
	    class161.anIntArray1814 = null;
	    class161.anIntArray1799 = null;
	    class161.aByteArray1809 = null;
	    aClass89_7700 = class103.method2356(class161, 51200, 33, 64, 768);
	}
    }
    
    void method13103(Class103 class103, int i, int i_169_, int i_170_,
		     int i_171_, int i_172_, int i_173_, int i_174_,
		     int i_175_, int i_176_, int i_177_) {
	if (((Class596) this).aClass168_7692 != null) {
	    float[] fs = new float[3];
	    float f = (float) -(((Class596) this).anInt7693 - i_174_ << 16);
	    float f_178_
		= (float) (((Class596) this).anInt7680 - i_175_ << 15);
	    float f_179_
		= (float) -(((Class596) this).anInt7681 - i_176_ << 16);
	    float[] fs_180_ = new float[3];
	    class103.method2307().method5140(fs_180_);
	    f += fs_180_[0];
	    f_178_ += fs_180_[1];
	    f_179_ += fs_180_[2];
	    class103.method2338(f, f_178_, f_179_, fs);
	    if (!(fs[2] < 0.0F)) {
		int i_181_
		    = (int) (fs[0]
			     - (float) (((Class596) this).anInt7689 / 2));
		int i_182_
		    = (int) (fs[1]
			     - (float) (((Class596) this).anInt7689 / 2));
		if (i_182_ < i_171_ && i_182_ + ((Class596) this).anInt7689 > 0
		    && i_181_ < i_170_
		    && i_181_ + ((Class596) this).anInt7689 > 0)
		    ((Class596) this).aClass168_7692.method3615
			(i_181_, i_182_, ((Class596) this).anInt7689,
			 ((Class596) this).anInt7689, 0,
			 i_177_ << 24 | 0xffffff, 1);
	    }
	}
    }
    
    static void method13104(Class103 class103) {
	if (aClass168_7678 == null) {
	    int[] is = new int[16384];
	    int[] is_183_ = new int[16384];
	    for (int i = 0; i < 64; i++) {
		int i_184_ = 64 - i;
		i_184_ *= i_184_;
		int i_185_ = 128 - i - 1;
		int i_186_ = i * 128;
		int i_187_ = i_185_ * 128;
		for (int i_188_ = 0; i_188_ < 64; i_188_++) {
		    int i_189_ = 64 - i_188_;
		    i_189_ *= i_189_;
		    int i_190_ = 128 - i_188_ - 1;
		    int i_191_ = 256 - (i_189_ + i_184_ << 8) / 4096;
		    i_191_ = i_191_ * 3072 / 1536;
		    if (i_191_ < 0)
			i_191_ = 0;
		    else if (i_191_ > 255)
			i_191_ = 255;
		    int i_192_ = i_191_ / 2;
		    is_183_[i_186_ + i_188_] = is_183_[i_186_ + i_190_]
			= is_183_[i_187_ + i_188_] = is_183_[i_187_ + i_190_]
			= ~0xffffff | i_191_ << 16;
		    is[i_186_ + i_188_] = is[i_186_ + i_190_]
			= is[i_187_ + i_188_] = is[i_187_ + i_190_]
			= 127 - i_192_ << 24 | 0xffffff;
		}
	    }
	    aClass168_7678
		= class103.method2259(is_183_, 0, 128, 128, 128, (byte) -46);
	    aClass168_7701
		= class103.method2259(is, 0, 128, 128, 128, (byte) -113);
	}
    }
    
    static void method13105(Class103 class103) {
	if (aClass168_7678 == null) {
	    int[] is = new int[16384];
	    int[] is_193_ = new int[16384];
	    for (int i = 0; i < 64; i++) {
		int i_194_ = 64 - i;
		i_194_ *= i_194_;
		int i_195_ = 128 - i - 1;
		int i_196_ = i * 128;
		int i_197_ = i_195_ * 128;
		for (int i_198_ = 0; i_198_ < 64; i_198_++) {
		    int i_199_ = 64 - i_198_;
		    i_199_ *= i_199_;
		    int i_200_ = 128 - i_198_ - 1;
		    int i_201_ = 256 - (i_199_ + i_194_ << 8) / 4096;
		    i_201_ = i_201_ * 3072 / 1536;
		    if (i_201_ < 0)
			i_201_ = 0;
		    else if (i_201_ > 255)
			i_201_ = 255;
		    int i_202_ = i_201_ / 2;
		    is_193_[i_196_ + i_198_] = is_193_[i_196_ + i_200_]
			= is_193_[i_197_ + i_198_] = is_193_[i_197_ + i_200_]
			= ~0xffffff | i_201_ << 16;
		    is[i_196_ + i_198_] = is[i_196_ + i_200_]
			= is[i_197_ + i_198_] = is[i_197_ + i_200_]
			= 127 - i_202_ << 24 | 0xffffff;
		}
	    }
	    aClass168_7678
		= class103.method2259(is_193_, 0, 128, 128, 128, (byte) -2);
	    aClass168_7701
		= class103.method2259(is, 0, 128, 128, 128, (byte) 69);
	}
    }
    
    static void method13106(Class103 class103) {
	if (aClass168_7678 == null) {
	    int[] is = new int[16384];
	    int[] is_203_ = new int[16384];
	    for (int i = 0; i < 64; i++) {
		int i_204_ = 64 - i;
		i_204_ *= i_204_;
		int i_205_ = 128 - i - 1;
		int i_206_ = i * 128;
		int i_207_ = i_205_ * 128;
		for (int i_208_ = 0; i_208_ < 64; i_208_++) {
		    int i_209_ = 64 - i_208_;
		    i_209_ *= i_209_;
		    int i_210_ = 128 - i_208_ - 1;
		    int i_211_ = 256 - (i_209_ + i_204_ << 8) / 4096;
		    i_211_ = i_211_ * 3072 / 1536;
		    if (i_211_ < 0)
			i_211_ = 0;
		    else if (i_211_ > 255)
			i_211_ = 255;
		    int i_212_ = i_211_ / 2;
		    is_203_[i_206_ + i_208_] = is_203_[i_206_ + i_210_]
			= is_203_[i_207_ + i_208_] = is_203_[i_207_ + i_210_]
			= ~0xffffff | i_211_ << 16;
		    is[i_206_ + i_208_] = is[i_206_ + i_210_]
			= is[i_207_ + i_208_] = is[i_207_ + i_210_]
			= 127 - i_212_ << 24 | 0xffffff;
		}
	    }
	    aClass168_7678
		= class103.method2259(is_203_, 0, 128, 128, 128, (byte) 15);
	    aClass168_7701
		= class103.method2259(is, 0, 128, 128, 128, (byte) -61);
	}
    }
    
    boolean method13107(Class103 class103, Class596 class596_213_) {
	return (((Class596) this).aClass168_7692 != null
		|| method13085(class103, class596_213_));
    }
    
    static void method13108(Class103 class103) {
	if (aClass168_7678 == null) {
	    int[] is = new int[16384];
	    int[] is_214_ = new int[16384];
	    for (int i = 0; i < 64; i++) {
		int i_215_ = 64 - i;
		i_215_ *= i_215_;
		int i_216_ = 128 - i - 1;
		int i_217_ = i * 128;
		int i_218_ = i_216_ * 128;
		for (int i_219_ = 0; i_219_ < 64; i_219_++) {
		    int i_220_ = 64 - i_219_;
		    i_220_ *= i_220_;
		    int i_221_ = 128 - i_219_ - 1;
		    int i_222_ = 256 - (i_220_ + i_215_ << 8) / 4096;
		    i_222_ = i_222_ * 3072 / 1536;
		    if (i_222_ < 0)
			i_222_ = 0;
		    else if (i_222_ > 255)
			i_222_ = 255;
		    int i_223_ = i_222_ / 2;
		    is_214_[i_217_ + i_219_] = is_214_[i_217_ + i_221_]
			= is_214_[i_218_ + i_219_] = is_214_[i_218_ + i_221_]
			= ~0xffffff | i_222_ << 16;
		    is[i_217_ + i_219_] = is[i_217_ + i_221_]
			= is[i_218_ + i_219_] = is[i_218_ + i_221_]
			= 127 - i_223_ << 24 | 0xffffff;
		}
	    }
	    aClass168_7678
		= class103.method2259(is_214_, 0, 128, 128, 128, (byte) -30);
	    aClass168_7701
		= class103.method2259(is, 0, 128, 128, 128, (byte) 18);
	}
    }
    
    static void method13109(Class103 class103) {
	if (aClass168_7678 == null) {
	    int[] is = new int[16384];
	    int[] is_224_ = new int[16384];
	    for (int i = 0; i < 64; i++) {
		int i_225_ = 64 - i;
		i_225_ *= i_225_;
		int i_226_ = 128 - i - 1;
		int i_227_ = i * 128;
		int i_228_ = i_226_ * 128;
		for (int i_229_ = 0; i_229_ < 64; i_229_++) {
		    int i_230_ = 64 - i_229_;
		    i_230_ *= i_230_;
		    int i_231_ = 128 - i_229_ - 1;
		    int i_232_ = 256 - (i_230_ + i_225_ << 8) / 4096;
		    i_232_ = i_232_ * 3072 / 1536;
		    if (i_232_ < 0)
			i_232_ = 0;
		    else if (i_232_ > 255)
			i_232_ = 255;
		    int i_233_ = i_232_ / 2;
		    is_224_[i_227_ + i_229_] = is_224_[i_227_ + i_231_]
			= is_224_[i_228_ + i_229_] = is_224_[i_228_ + i_231_]
			= ~0xffffff | i_232_ << 16;
		    is[i_227_ + i_229_] = is[i_227_ + i_231_]
			= is[i_228_ + i_229_] = is[i_228_ + i_231_]
			= 127 - i_233_ << 24 | 0xffffff;
		}
	    }
	    aClass168_7678
		= class103.method2259(is_224_, 0, 128, 128, 128, (byte) -86);
	    aClass168_7701
		= class103.method2259(is, 0, 128, 128, 128, (byte) 15);
	}
    }
}
