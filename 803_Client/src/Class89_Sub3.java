/* Class89_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class89_Sub3 extends Class89
{
    int[] anIntArray9670;
    Class189 aClass189_9671;
    int[][] anIntArrayArray9672;
    Class189 aClass189_9673;
    Class155 aClass155_9674;
    int[] anIntArray9675;
    static int anInt9676;
    static final int anInt9677 = -1;
    int[][] anIntArrayArray9678;
    short[] aShortArray9679;
    static final int anInt9680 = 7;
    static final int anInt9681 = 618520;
    static final int anInt9682 = 618648;
    int anInt9683;
    int[] anIntArray9684;
    int[] anIntArray9685;
    int anInt9686;
    int anInt9687;
    boolean aBool9688;
    static int anInt9689 = 4096;
    Class103_Sub2 aClass103_Sub2_9690;
    int anInt9691;
    Class204[] aClass204Array9692;
    static final int anInt9693 = 1;
    static final int anInt9694 = 4;
    int anInt9695;
    short[] aShortArray9696;
    short[] aShortArray9697;
    short[] aShortArray9698;
    static int anInt9699;
    float[] aFloatArray9700;
    short[] aShortArray9701;
    byte[] aByteArray9702;
    float[][] aFloatArrayArray9703;
    int[] anIntArray9704;
    static final int anInt9705 = -2;
    static final int anInt9706 = 2;
    int anInt9707;
    Class188[] aClass188Array9708;
    byte[] aByteArray9709;
    int[] anIntArray9710;
    byte[] aByteArray9711;
    short[] aShortArray9712;
    short[] aShortArray9713;
    short[] aShortArray9714;
    int anInt9715;
    int[][] anIntArrayArray9716;
    int anInt9717;
    boolean aBool9718;
    boolean aBool9719;
    float[][] aFloatArrayArray9720;
    int anInt9721;
    int anInt9722;
    boolean aBool9723;
    Class106[] aClass106Array9724;
    Class167[] aClass167Array9725;
    int anInt9726;
    Class187[] aClass187Array9727;
    Class203[] aClass203Array9728;
    int[] anIntArray9729;
    boolean aBool9730;
    short aShort9731;
    short aShort9732;
    short aShort9733;
    short aShort9734;
    short aShort9735;
    short aShort9736;
    short aShort9737;
    short aShort9738;
    boolean aBool9739;
    short aShort9740;
    int anInt9741;
    Class89_Sub3[] aClass89_Sub3Array9742;
    boolean aBool9743 = false;
    Class204[] aClass204Array9744;
    float[] aFloatArray9745;
    float[] aFloatArray9746;
    int[] anIntArray9747;
    boolean aBool9748;
    int[] anIntArray9749;
    int[] anIntArray9750;
    int[] anIntArray9751;
    int[] anIntArray9752;
    int[] anIntArray9753;
    static final int anInt9754 = 0;
    Class89_Sub3[] aClass89_Sub3Array9755;
    float[] aFloatArray9756;
    
    int method16048(int i, int i_0_) {
	i_0_ = i_0_ * (i & 0x7f) >> 7;
	if (i_0_ < 2)
	    i_0_ = 2;
	else if (i_0_ > 126)
	    i_0_ = 126;
	return (i & 0xff80) + i_0_;
    }
    
    Class89_Sub3(Class103_Sub2 class103_sub2, Class161 class161, int i,
		 int i_1_, int i_2_, int i_3_) {
	((Class89_Sub3) this).anInt9686 = 0;
	((Class89_Sub3) this).anInt9687 = 0;
	((Class89_Sub3) this).anInt9691 = 0;
	((Class89_Sub3) this).anInt9695 = 0;
	((Class89_Sub3) this).anInt9741 = 0;
	((Class89_Sub3) this).aBool9719 = false;
	((Class89_Sub3) this).aBool9723 = false;
	((Class89_Sub3) this).aBool9730 = false;
	((Class89_Sub3) this).aBool9739 = false;
	((Class89_Sub3) this).aBool9748 = false;
	((Class89_Sub3) this).aBool9688 = false;
	((Class89_Sub3) this).aClass103_Sub2_9690 = class103_sub2;
	((Class89_Sub3) this).anInt9683 = i;
	((Class89_Sub3) this).anInt9707 = i_1_;
	((Class89_Sub3) this).anInt9715 = i_2_;
	Class107 class107
	    = ((Class89_Sub3) this).aClass103_Sub2_9690.aClass107_1458;
	((Class89_Sub3) this).anInt9686 = class161.anInt1790;
	((Class89_Sub3) this).anInt9687 = class161.anInt1805;
	((Class89_Sub3) this).anIntArray9670 = class161.anIntArray1831;
	((Class89_Sub3) this).anIntArray9685 = class161.anIntArray1791;
	((Class89_Sub3) this).anIntArray9684 = class161.anIntArray1816;
	((Class89_Sub3) this).anInt9691 = class161.anInt1802;
	((Class89_Sub3) this).aShortArray9696 = class161.aShortArray1818;
	((Class89_Sub3) this).aShortArray9697 = class161.aShortArray1796;
	((Class89_Sub3) this).aShortArray9698 = class161.aShortArray1804;
	((Class89_Sub3) this).aByteArray9702 = class161.aByteArray1809;
	((Class89_Sub3) this).aShortArray9713 = class161.aShortArray1812;
	((Class89_Sub3) this).aByteArray9711 = class161.aByteArray1793;
	((Class89_Sub3) this).aShortArray9714 = class161.aShortArray1810;
	((Class89_Sub3) this).aByteArray9709 = class161.aByteArray1808;
	((Class89_Sub3) this).aClass106Array9724 = class161.aClass106Array1832;
	((Class89_Sub3) this).aClass167Array9725 = class161.aClass167Array1833;
	((Class89_Sub3) this).aShortArray9679 = class161.aShortArray1797;
	((Class89_Sub3) this).anInt9695 = ((Class89_Sub3) this).anInt9691;
	int[] is = new int[((Class89_Sub3) this).anInt9691];
	for (int i_4_ = 0; i_4_ < ((Class89_Sub3) this).anInt9691; i_4_++)
	    is[i_4_] = i_4_;
	long[] ls = new long[((Class89_Sub3) this).anInt9691];
	boolean bool = (((Class89_Sub3) this).anInt9683 & 0x100) != 0;
	for (int i_5_ = 0; i_5_ < ((Class89_Sub3) this).anInt9691; i_5_++) {
	    int i_6_ = is[i_5_];
	    Class101 class101 = null;
	    int i_7_ = 0;
	    int i_8_ = 0;
	    int i_9_ = 0;
	    int i_10_ = 0;
	    if (class161.aClass95Array1834 != null) {
		boolean bool_11_ = false;
		for (int i_12_ = 0; i_12_ < class161.aClass95Array1834.length;
		     i_12_++) {
		    Class95 class95 = class161.aClass95Array1834[i_12_];
		    if (i_6_ == class95.anInt1328 * 855950689) {
			Class332 class332
			    = Class279.method5466((class95.anInt1331
						   * 264591637),
						  390264367);
			if (class332.aBool5054)
			    bool_11_ = true;
			if (class332.anInt5051 * 73195809 != -1) {
			    Class101 class101_13_
				= class107.method2680((class332.anInt5051
						       * 73195809),
						      310068325);
			    if (class101_13_.aClass529_1391
				== Class529.aClass529_6944)
				((Class89_Sub3) this).aBool9748 = true;
			}
		    }
		}
		if (bool_11_) {
		    ls[i_5_] = 9223372036854775807L;
		    ((Class89_Sub3) this).anInt9695--;
		    continue;
		}
	    }
	    if (class161.aClass106Array1832 != null) {
		boolean bool_14_ = false;
		for (int i_15_ = 0; i_15_ < class161.aClass106Array1832.length;
		     i_15_++) {
		    Class106 class106 = class161.aClass106Array1832[i_15_];
		    if (i_6_ == class106.anInt1489 * -143674399) {
			Class325 class325
			    = Class530.method11844((class106.anInt1494
						    * 357275585),
						   -475596973);
			if (class325.aBool4980)
			    bool_14_ = true;
		    }
		}
		if (bool_14_) {
		    ls[i_5_] = 9223372036854775807L;
		    ((Class89_Sub3) this).anInt9695--;
		    continue;
		}
	    }
	    int i_16_ = -1;
	    if (class161.aShortArray1792 != null) {
		i_16_ = class161.aShortArray1792[i_6_];
		if (i_16_ != -1) {
		    class101
			= class107.method2680(i_16_ & 0xffff, -1347603366);
		    if ((i_3_ & 0x40) == 0 || !class101.aBool1434) {
			i_9_ = class101.aByte1427;
			i_10_ = class101.aByte1428;
		    } else
			i_16_ = -1;
		}
	    }
	    boolean bool_17_
		= ((((Class89_Sub3) this).aByteArray9711 != null
		    && ((Class89_Sub3) this).aByteArray9711[i_6_] != 0)
		   || (class101 != null
		       && class101.aClass529_1391 == Class529.aClass529_6944));
	    if ((bool || bool_17_)
		&& ((Class89_Sub3) this).aByteArray9702 != null)
		i_7_ += ((Class89_Sub3) this).aByteArray9702[i_6_] << 17;
	    if (bool_17_)
		i_7_ += 65536;
	    i_7_ += (i_9_ & 0xff) << 8;
	    i_7_ += i_10_ & 0xff;
	    i_8_ += (i_16_ & 0xffff) << 16;
	    i_8_ += i_5_ & 0xffff;
	    ls[i_5_] = ((long) i_7_ << 32) + (long) i_8_;
	    ((Class89_Sub3) this).aBool9748 |= bool_17_;
	}
	Class46.method1125(ls, is, (byte) 0);
	if (class161.aClass95Array1834 != null) {
	    ((Class89_Sub3) this).anInt9726
		= class161.aClass95Array1834.length;
	    ((Class89_Sub3) this).aClass187Array9727
		= new Class187[((Class89_Sub3) this).anInt9726];
	    ((Class89_Sub3) this).aClass203Array9728
		= new Class203[((Class89_Sub3) this).anInt9726];
	    for (int i_18_ = 0; i_18_ < class161.aClass95Array1834.length;
		 i_18_++) {
		Class95 class95 = class161.aClass95Array1834[i_18_];
		Class332 class332
		    = Class279.method5466(class95.anInt1331 * 264591637,
					  70032975);
		int i_19_ = ((Class474.anIntArray6382
			      [(class161.aShortArray1812
				[class95.anInt1328 * 855950689]) & 0xffff])
			     & 0xffffff);
		i_19_
		    = i_19_ | 255 - (class161.aByteArray1793 != null
				     ? (class161.aByteArray1793
					[class95.anInt1328 * 855950689]) & 0xff
				     : 0) << 24;
		((Class89_Sub3) this).aClass187Array9727[i_18_]
		    = new Class187(class95.anInt1328 * 855950689,
				   (class161.aShortArray1818
				    [class95.anInt1328 * 855950689]),
				   (class161.aShortArray1796
				    [class95.anInt1328 * 855950689]),
				   (class161.aShortArray1804
				    [class95.anInt1328 * 855950689]),
				   class332.anInt5052 * 1125026619,
				   class332.anInt5053 * 710944347,
				   class332.anInt5051 * 73195809,
				   class332.anInt5055 * -984464111,
				   class332.anInt5057 * -1886928841,
				   class332.aBool5054,
				   class95.anInt1329 * -933656211);
		((Class89_Sub3) this).aClass203Array9728[i_18_]
		    = new Class203(i_19_);
	    }
	}
	((Class89_Sub3) this).aFloatArrayArray9720
	    = new float[((Class89_Sub3) this).anInt9691][];
	((Class89_Sub3) this).aFloatArrayArray9703
	    = new float[((Class89_Sub3) this).anInt9691][];
	Class100 class100
	    = method1896(class161, is, ((Class89_Sub3) this).anInt9691);
	Class189 class189 = ((Class89_Sub3) this).aClass103_Sub2_9690
				.method15377(Thread.currentThread());
	float[] fs = ((Class189) class189).aFloatArray2246;
	boolean bool_20_ = false;
	for (int i_21_ = 0; i_21_ < ((Class89_Sub3) this).anInt9691; i_21_++) {
	    int i_22_ = is[i_21_];
	    int i_23_ = (class161.aShortArray1792 != null
			 ? class161.aShortArray1792[i_22_] : -1);
	    if (i_23_ != -1 && (i_3_ & 0x40) != 0
		&& class107.method2680(i_23_ & 0xffff, 81739512).aBool1434)
		i_23_ = -1;
	    if (i_23_ != -1) {
		int i_24_ = (class161.aShortArray1811 != null
			     ? class161.aShortArray1811[i_22_] : -1);
		bool_20_ = true;
		float[] fs_25_
		    = (((Class89_Sub3) this).aFloatArrayArray9720[i_22_]
		       = new float[3]);
		float[] fs_26_
		    = (((Class89_Sub3) this).aFloatArrayArray9703[i_22_]
		       = new float[3]);
		if (i_24_ == 32766) {
		    int i_27_ = class161.aByteArray1803[i_22_] & 0xff;
		    int i_28_ = class161.aByteArray1794[i_22_] & 0xff;
		    int i_29_ = class161.aByteArray1807[i_22_] & 0xff;
		    i_27_ += (class161.anIntArray1795
			      [class161.aShortArray1818[i_22_]]);
		    i_28_ += (class161.anIntArray1795
			      [class161.aShortArray1796[i_22_]]);
		    i_29_ += (class161.anIntArray1795
			      [class161.aShortArray1804[i_22_]]);
		    fs_25_[0] = class161.aFloatArray1787[i_27_];
		    fs_26_[0] = class161.aFloatArray1800[i_27_];
		    fs_25_[1] = class161.aFloatArray1787[i_28_];
		    fs_26_[1] = class161.aFloatArray1800[i_28_];
		    fs_25_[2] = class161.aFloatArray1787[i_29_];
		    fs_26_[2] = class161.aFloatArray1800[i_29_];
		} else if (i_24_ == -1) {
		    fs_25_[0] = 0.0F;
		    fs_26_[0] = 1.0F;
		    fs_25_[1] = 1.0F;
		    fs_26_[1] = 1.0F;
		    fs_25_[2] = 0.0F;
		    fs_26_[2] = 0.0F;
		} else {
		    i_24_ &= 0xffff;
		    byte i_30_ = class161.aByteArray1820[i_24_];
		    if (i_30_ == 0) {
			short i_31_
			    = ((Class89_Sub3) this).aShortArray9696[i_22_];
			short i_32_
			    = ((Class89_Sub3) this).aShortArray9697[i_22_];
			short i_33_
			    = ((Class89_Sub3) this).aShortArray9698[i_22_];
			short i_34_ = class161.aShortArray1821[i_24_];
			short i_35_ = class161.aShortArray1822[i_24_];
			short i_36_ = class161.aShortArray1823[i_24_];
			float f = (float) (((Class89_Sub3) this).anIntArray9670
					   [i_34_]);
			float f_37_ = (float) (((Class89_Sub3) this)
					       .anIntArray9685[i_34_]);
			float f_38_ = (float) (((Class89_Sub3) this)
					       .anIntArray9684[i_34_]);
			float f_39_ = ((float) (((Class89_Sub3) this)
						.anIntArray9670[i_35_])
				       - f);
			float f_40_ = ((float) (((Class89_Sub3) this)
						.anIntArray9685[i_35_])
				       - f_37_);
			float f_41_ = ((float) (((Class89_Sub3) this)
						.anIntArray9684[i_35_])
				       - f_38_);
			float f_42_ = ((float) (((Class89_Sub3) this)
						.anIntArray9670[i_36_])
				       - f);
			float f_43_ = ((float) (((Class89_Sub3) this)
						.anIntArray9685[i_36_])
				       - f_37_);
			float f_44_ = ((float) (((Class89_Sub3) this)
						.anIntArray9684[i_36_])
				       - f_38_);
			float f_45_ = ((float) (((Class89_Sub3) this)
						.anIntArray9670[i_31_])
				       - f);
			float f_46_ = ((float) (((Class89_Sub3) this)
						.anIntArray9685[i_31_])
				       - f_37_);
			float f_47_ = ((float) (((Class89_Sub3) this)
						.anIntArray9684[i_31_])
				       - f_38_);
			float f_48_ = ((float) (((Class89_Sub3) this)
						.anIntArray9670[i_32_])
				       - f);
			float f_49_ = ((float) (((Class89_Sub3) this)
						.anIntArray9685[i_32_])
				       - f_37_);
			float f_50_ = ((float) (((Class89_Sub3) this)
						.anIntArray9684[i_32_])
				       - f_38_);
			float f_51_ = ((float) (((Class89_Sub3) this)
						.anIntArray9670[i_33_])
				       - f);
			float f_52_ = ((float) (((Class89_Sub3) this)
						.anIntArray9685[i_33_])
				       - f_37_);
			float f_53_ = ((float) (((Class89_Sub3) this)
						.anIntArray9684[i_33_])
				       - f_38_);
			float f_54_ = f_40_ * f_44_ - f_41_ * f_43_;
			float f_55_ = f_41_ * f_42_ - f_39_ * f_44_;
			float f_56_ = f_39_ * f_43_ - f_40_ * f_42_;
			float f_57_ = f_43_ * f_56_ - f_44_ * f_55_;
			float f_58_ = f_44_ * f_54_ - f_42_ * f_56_;
			float f_59_ = f_42_ * f_55_ - f_43_ * f_54_;
			float f_60_ = 1.0F / (f_57_ * f_39_ + f_58_ * f_40_
					      + f_59_ * f_41_);
			fs_25_[0] = (f_57_ * f_45_ + f_58_ * f_46_
				     + f_59_ * f_47_) * f_60_;
			fs_25_[1] = (f_57_ * f_48_ + f_58_ * f_49_
				     + f_59_ * f_50_) * f_60_;
			fs_25_[2] = (f_57_ * f_51_ + f_58_ * f_52_
				     + f_59_ * f_53_) * f_60_;
			f_57_ = f_40_ * f_56_ - f_41_ * f_55_;
			f_58_ = f_41_ * f_54_ - f_39_ * f_56_;
			f_59_ = f_39_ * f_55_ - f_40_ * f_54_;
			f_60_ = 1.0F / (f_57_ * f_42_ + f_58_ * f_43_
					+ f_59_ * f_44_);
			fs_26_[0] = (f_57_ * f_45_ + f_58_ * f_46_
				     + f_59_ * f_47_) * f_60_;
			fs_26_[1] = (f_57_ * f_48_ + f_58_ * f_49_
				     + f_59_ * f_50_) * f_60_;
			fs_26_[2] = (f_57_ * f_51_ + f_58_ * f_52_
				     + f_59_ * f_53_) * f_60_;
		    } else {
			short i_61_
			    = ((Class89_Sub3) this).aShortArray9696[i_22_];
			short i_62_
			    = ((Class89_Sub3) this).aShortArray9697[i_22_];
			short i_63_
			    = ((Class89_Sub3) this).aShortArray9698[i_22_];
			int i_64_ = class100.anIntArray1365[i_24_];
			int i_65_ = class100.anIntArray1363[i_24_];
			int i_66_ = class100.anIntArray1364[i_24_];
			float[] fs_67_ = class100.aFloatArrayArray1366[i_24_];
			byte i_68_ = class161.aByteArray1827[i_24_];
			float f
			    = (float) class161.anIntArray1813[i_24_] / 256.0F;
			if (i_30_ == 1) {
			    float f_69_
				= ((float) class161.anIntArray1826[i_24_]
				   / 1024.0F);
			    method1859
				(((Class89_Sub3) this).anIntArray9670[i_61_],
				 ((Class89_Sub3) this).anIntArray9685[i_61_],
				 ((Class89_Sub3) this).anIntArray9684[i_61_],
				 i_64_, i_65_, i_66_, fs_67_, f_69_, i_68_, f,
				 fs);
			    fs_25_[0] = fs[0];
			    fs_26_[0] = fs[1];
			    method1859
				(((Class89_Sub3) this).anIntArray9670[i_62_],
				 ((Class89_Sub3) this).anIntArray9685[i_62_],
				 ((Class89_Sub3) this).anIntArray9684[i_62_],
				 i_64_, i_65_, i_66_, fs_67_, f_69_, i_68_, f,
				 fs);
			    fs_25_[1] = fs[0];
			    fs_26_[1] = fs[1];
			    method1859
				(((Class89_Sub3) this).anIntArray9670[i_63_],
				 ((Class89_Sub3) this).anIntArray9685[i_63_],
				 ((Class89_Sub3) this).anIntArray9684[i_63_],
				 i_64_, i_65_, i_66_, fs_67_, f_69_, i_68_, f,
				 fs);
			    fs_25_[2] = fs[0];
			    fs_26_[2] = fs[1];
			    float f_70_ = f_69_ / 2.0F;
			    if ((i_68_ & 0x1) == 0) {
				if (fs_25_[1] - fs_25_[0] > f_70_)
				    fs_25_[1] -= f_69_;
				else if (fs_25_[0] - fs_25_[1] > f_70_)
				    fs_25_[1] += f_69_;
				if (fs_25_[2] - fs_25_[0] > f_70_)
				    fs_25_[2] -= f_69_;
				else if (fs_25_[0] - fs_25_[2] > f_70_)
				    fs_25_[2] += f_69_;
			    } else {
				if (fs_26_[1] - fs_26_[0] > f_70_)
				    fs_26_[1] -= f_69_;
				else if (fs_26_[0] - fs_26_[1] > f_70_)
				    fs_26_[1] += f_69_;
				if (fs_26_[2] - fs_26_[0] > f_70_)
				    fs_26_[2] -= f_69_;
				else if (fs_26_[0] - fs_26_[2] > f_70_)
				    fs_26_[2] += f_69_;
			    }
			} else if (i_30_ == 2) {
			    float f_71_
				= ((float) class161.anIntArray1828[i_24_]
				   / 256.0F);
			    float f_72_
				= ((float) class161.anIntArray1806[i_24_]
				   / 256.0F);
			    int i_73_
				= (((Class89_Sub3) this).anIntArray9670[i_62_]
				   - (((Class89_Sub3) this).anIntArray9670
				      [i_61_]));
			    int i_74_
				= (((Class89_Sub3) this).anIntArray9685[i_62_]
				   - (((Class89_Sub3) this).anIntArray9685
				      [i_61_]));
			    int i_75_
				= (((Class89_Sub3) this).anIntArray9684[i_62_]
				   - (((Class89_Sub3) this).anIntArray9684
				      [i_61_]));
			    int i_76_
				= (((Class89_Sub3) this).anIntArray9670[i_63_]
				   - (((Class89_Sub3) this).anIntArray9670
				      [i_61_]));
			    int i_77_
				= (((Class89_Sub3) this).anIntArray9685[i_63_]
				   - (((Class89_Sub3) this).anIntArray9685
				      [i_61_]));
			    int i_78_
				= (((Class89_Sub3) this).anIntArray9684[i_63_]
				   - (((Class89_Sub3) this).anIntArray9684
				      [i_61_]));
			    int i_79_ = i_74_ * i_78_ - i_77_ * i_75_;
			    int i_80_ = i_75_ * i_76_ - i_78_ * i_73_;
			    int i_81_ = i_73_ * i_77_ - i_76_ * i_74_;
			    float f_82_
				= (64.0F
				   / (float) class161.anIntArray1824[i_24_]);
			    float f_83_
				= (64.0F
				   / (float) class161.anIntArray1825[i_24_]);
			    float f_84_
				= (64.0F
				   / (float) class161.anIntArray1826[i_24_]);
			    float f_85_ = (((float) i_79_ * fs_67_[0]
					    + (float) i_80_ * fs_67_[1]
					    + (float) i_81_ * fs_67_[2])
					   / f_82_);
			    float f_86_ = (((float) i_79_ * fs_67_[3]
					    + (float) i_80_ * fs_67_[4]
					    + (float) i_81_ * fs_67_[5])
					   / f_83_);
			    float f_87_ = (((float) i_79_ * fs_67_[6]
					    + (float) i_80_ * fs_67_[7]
					    + (float) i_81_ * fs_67_[8])
					   / f_84_);
			    int i_88_ = method1860(f_85_, f_86_, f_87_);
			    method1861
				(((Class89_Sub3) this).anIntArray9670[i_61_],
				 ((Class89_Sub3) this).anIntArray9685[i_61_],
				 ((Class89_Sub3) this).anIntArray9684[i_61_],
				 i_64_, i_65_, i_66_, i_88_, fs_67_, i_68_, f,
				 f_71_, f_72_, fs);
			    fs_25_[0] = fs[0];
			    fs_26_[0] = fs[1];
			    method1861
				(((Class89_Sub3) this).anIntArray9670[i_62_],
				 ((Class89_Sub3) this).anIntArray9685[i_62_],
				 ((Class89_Sub3) this).anIntArray9684[i_62_],
				 i_64_, i_65_, i_66_, i_88_, fs_67_, i_68_, f,
				 f_71_, f_72_, fs);
			    fs_25_[1] = fs[0];
			    fs_26_[1] = fs[1];
			    method1861
				(((Class89_Sub3) this).anIntArray9670[i_63_],
				 ((Class89_Sub3) this).anIntArray9685[i_63_],
				 ((Class89_Sub3) this).anIntArray9684[i_63_],
				 i_64_, i_65_, i_66_, i_88_, fs_67_, i_68_, f,
				 f_71_, f_72_, fs);
			    fs_25_[2] = fs[0];
			    fs_26_[2] = fs[1];
			} else if (i_30_ == 3) {
			    method1858
				(((Class89_Sub3) this).anIntArray9670[i_61_],
				 ((Class89_Sub3) this).anIntArray9685[i_61_],
				 ((Class89_Sub3) this).anIntArray9684[i_61_],
				 i_64_, i_65_, i_66_, fs_67_, i_68_, f, fs);
			    fs_25_[0] = fs[0];
			    fs_26_[0] = fs[1];
			    method1858
				(((Class89_Sub3) this).anIntArray9670[i_62_],
				 ((Class89_Sub3) this).anIntArray9685[i_62_],
				 ((Class89_Sub3) this).anIntArray9684[i_62_],
				 i_64_, i_65_, i_66_, fs_67_, i_68_, f, fs);
			    fs_25_[1] = fs[0];
			    fs_26_[1] = fs[1];
			    method1858
				(((Class89_Sub3) this).anIntArray9670[i_63_],
				 ((Class89_Sub3) this).anIntArray9685[i_63_],
				 ((Class89_Sub3) this).anIntArray9684[i_63_],
				 i_64_, i_65_, i_66_, fs_67_, i_68_, f, fs);
			    fs_25_[2] = fs[0];
			    fs_26_[2] = fs[1];
			    if ((i_68_ & 0x1) == 0) {
				if (fs_25_[1] - fs_25_[0] > 0.5F)
				    fs_25_[1]--;
				else if (fs_25_[0] - fs_25_[1] > 0.5F)
				    fs_25_[1]++;
				if (fs_25_[2] - fs_25_[0] > 0.5F)
				    fs_25_[2]--;
				else if (fs_25_[0] - fs_25_[2] > 0.5F)
				    fs_25_[2]++;
			    } else {
				if (fs_26_[1] - fs_26_[0] > 0.5F)
				    fs_26_[1]--;
				else if (fs_26_[0] - fs_26_[1] > 0.5F)
				    fs_26_[1]++;
				if (fs_26_[2] - fs_26_[0] > 0.5F)
				    fs_26_[2]--;
				else if (fs_26_[0] - fs_26_[2] > 0.5F)
				    fs_26_[2]++;
			    }
			}
		    }
		}
	    }
	}
	if (!bool_20_) {
	    ((Class89_Sub3) this).aFloatArrayArray9703 = null;
	    ((Class89_Sub3) this).aFloatArrayArray9720 = null;
	}
	if (class161.anIntArray1799 != null
	    && (((Class89_Sub3) this).anInt9683 & 0x20) != 0)
	    ((Class89_Sub3) this).anIntArrayArray9716
		= class161.method3455(true);
	if (class161.anIntArray1814 != null
	    && (((Class89_Sub3) this).anInt9683 & 0x180) != 0)
	    ((Class89_Sub3) this).anIntArrayArray9678 = class161.method3456();
	if (class161.aClass95Array1834 != null
	    && (((Class89_Sub3) this).anInt9683 & 0x400) != 0)
	    ((Class89_Sub3) this).anIntArrayArray9672 = class161.method3477();
	if (class161.aShortArray1792 != null) {
	    ((Class89_Sub3) this).aShortArray9712
		= new short[((Class89_Sub3) this).anInt9691];
	    boolean bool_89_ = false;
	    for (int i_90_ = 0; i_90_ < ((Class89_Sub3) this).anInt9691;
		 i_90_++) {
		short i_91_ = class161.aShortArray1792[i_90_];
		if (i_91_ != -1) {
		    Class101 class101
			= ((Class89_Sub3) this).aClass103_Sub2_9690
			      .aClass107_1458
			      .method2680(i_91_ & 0xffff, -1130497257);
		    if ((i_3_ & 0x40) == 0 || !class101.aBool1434) {
			((Class89_Sub3) this).aShortArray9712[i_90_] = i_91_;
			bool_89_ = true;
			if (class101.aClass529_1391 == Class529.aClass529_6944)
			    ((Class89_Sub3) this).aBool9748 = true;
			if (class101.aByte1376 != 0 || class101.aByte1396 != 0)
			    ((Class89_Sub3) this).aBool9688 = true;
		    } else
			((Class89_Sub3) this).aShortArray9712[i_90_]
			    = (short) -1;
		} else
		    ((Class89_Sub3) this).aShortArray9712[i_90_] = (short) -1;
	    }
	    if (!bool_89_)
		((Class89_Sub3) this).aShortArray9712 = null;
	} else
	    ((Class89_Sub3) this).aShortArray9712 = null;
	if (((Class89_Sub3) this).aBool9748
	    || ((Class89_Sub3) this).aClass187Array9727 != null) {
	    ((Class89_Sub3) this).aShortArray9701
		= new short[((Class89_Sub3) this).anInt9691];
	    for (int i_92_ = 0; i_92_ < ((Class89_Sub3) this).anInt9691;
		 i_92_++)
		((Class89_Sub3) this).aShortArray9701[i_92_]
		    = (short) is[i_92_];
	}
    }
    
    void method16049(Class189 class189) {
	((Class89_Sub3) this).aClass155_9674
	    = ((Class189) class189).aClass155_2223;
	if (class189 != ((Class89_Sub3) this).aClass189_9671) {
	    ((Class89_Sub3) this).aClass189_9671 = class189;
	    ((Class89_Sub3) this).anIntArray9729
		= (((Class189) ((Class89_Sub3) this).aClass189_9671)
		   .anIntArray2229);
	    ((Class89_Sub3) this).aFloatArray9745
		= (((Class189) ((Class89_Sub3) this).aClass189_9671)
		   .aFloatArray2228);
	    ((Class89_Sub3) this).aFloatArray9746
		= (((Class189) ((Class89_Sub3) this).aClass189_9671)
		   .aFloatArray2235);
	    ((Class89_Sub3) this).aFloatArray9756
		= (((Class189) ((Class89_Sub3) this).aClass189_9671)
		   .aFloatArray2234);
	    ((Class89_Sub3) this).aFloatArray9700
		= (((Class189) ((Class89_Sub3) this).aClass189_9671)
		   .aFloatArray2254);
	    ((Class89_Sub3) this).anIntArray9749
		= (((Class189) ((Class89_Sub3) this).aClass189_9671)
		   .anIntArray2227);
	    ((Class89_Sub3) this).anIntArray9750
		= (((Class189) ((Class89_Sub3) this).aClass189_9671)
		   .anIntArray2233);
	    ((Class89_Sub3) this).anIntArray9751
		= (((Class189) ((Class89_Sub3) this).aClass189_9671)
		   .anIntArray2238);
	    ((Class89_Sub3) this).anIntArray9752
		= (((Class189) ((Class89_Sub3) this).aClass189_9671)
		   .anIntArray2232);
	    ((Class89_Sub3) this).anIntArray9753
		= (((Class189) ((Class89_Sub3) this).aClass189_9671)
		   .anIntArray2236);
	    ((Class89_Sub3) this).anIntArray9675
		= (((Class189) ((Class89_Sub3) this).aClass189_9671)
		   .anIntArray2237);
	}
    }
    
    void method16050(Thread thread) {
	Class189 class189
	    = ((Class89_Sub3) this).aClass103_Sub2_9690.method15377(thread);
	if (class189 != ((Class89_Sub3) this).aClass189_9673) {
	    ((Class89_Sub3) this).aClass189_9673 = class189;
	    ((Class89_Sub3) this).aClass89_Sub3Array9755
		= (((Class189) ((Class89_Sub3) this).aClass189_9673)
		   .aClass89_Sub3Array2253);
	    ((Class89_Sub3) this).aClass89_Sub3Array9742
		= (((Class189) ((Class89_Sub3) this).aClass189_9673)
		   .aClass89_Sub3Array2248);
	}
    }
    
    void method16051() {
	if (((Class89_Sub3) this).anInt9741 == 0
	    && ((Class89_Sub3) this).aClass204Array9692 == null) {
	    if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		 .anInt9274) * 592623211
		> 1) {
		synchronized (this) {
		    method16052();
		}
	    } else
		method16052();
	}
    }
    
    void method16052() {
	((Class89_Sub3) this).aClass204Array9692
	    = new Class204[((Class89_Sub3) this).anInt9687];
	for (int i = 0; i < ((Class89_Sub3) this).anInt9687; i++)
	    ((Class89_Sub3) this).aClass204Array9692[i] = new Class204();
	for (int i = 0; i < ((Class89_Sub3) this).anInt9691; i++) {
	    short i_93_ = ((Class89_Sub3) this).aShortArray9696[i];
	    short i_94_ = ((Class89_Sub3) this).aShortArray9697[i];
	    short i_95_ = ((Class89_Sub3) this).aShortArray9698[i];
	    int i_96_ = (((Class89_Sub3) this).anIntArray9670[i_94_]
			 - ((Class89_Sub3) this).anIntArray9670[i_93_]);
	    int i_97_ = (((Class89_Sub3) this).anIntArray9685[i_94_]
			 - ((Class89_Sub3) this).anIntArray9685[i_93_]);
	    int i_98_ = (((Class89_Sub3) this).anIntArray9684[i_94_]
			 - ((Class89_Sub3) this).anIntArray9684[i_93_]);
	    int i_99_ = (((Class89_Sub3) this).anIntArray9670[i_95_]
			 - ((Class89_Sub3) this).anIntArray9670[i_93_]);
	    int i_100_ = (((Class89_Sub3) this).anIntArray9685[i_95_]
			  - ((Class89_Sub3) this).anIntArray9685[i_93_]);
	    int i_101_ = (((Class89_Sub3) this).anIntArray9684[i_95_]
			  - ((Class89_Sub3) this).anIntArray9684[i_93_]);
	    int i_102_ = i_97_ * i_101_ - i_100_ * i_98_;
	    int i_103_ = i_98_ * i_99_ - i_101_ * i_96_;
	    int i_104_;
	    for (i_104_ = i_96_ * i_100_ - i_99_ * i_97_;
		 (i_102_ > 8192 || i_103_ > 8192 || i_104_ > 8192
		  || i_102_ < -8192 || i_103_ < -8192 || i_104_ < -8192);
		 i_104_ >>= 1) {
		i_102_ >>= 1;
		i_103_ >>= 1;
	    }
	    int i_105_
		= (int) Math.sqrt((double) (i_102_ * i_102_ + i_103_ * i_103_
					    + i_104_ * i_104_));
	    if (i_105_ <= 0)
		i_105_ = 1;
	    i_102_ = i_102_ * 256 / i_105_;
	    i_103_ = i_103_ * 256 / i_105_;
	    i_104_ = i_104_ * 256 / i_105_;
	    byte i_106_;
	    if (((Class89_Sub3) this).aByteArray9709 == null)
		i_106_ = (byte) 0;
	    else
		i_106_ = ((Class89_Sub3) this).aByteArray9709[i];
	    if (i_106_ == 0) {
		Class204 class204
		    = ((Class89_Sub3) this).aClass204Array9692[i_93_];
		((Class204) class204).anInt2429 += i_102_;
		((Class204) class204).anInt2427 += i_103_;
		((Class204) class204).anInt2428 += i_104_;
		((Class204) class204).anInt2426++;
		class204 = ((Class89_Sub3) this).aClass204Array9692[i_94_];
		((Class204) class204).anInt2429 += i_102_;
		((Class204) class204).anInt2427 += i_103_;
		((Class204) class204).anInt2428 += i_104_;
		((Class204) class204).anInt2426++;
		class204 = ((Class89_Sub3) this).aClass204Array9692[i_95_];
		((Class204) class204).anInt2429 += i_102_;
		((Class204) class204).anInt2427 += i_103_;
		((Class204) class204).anInt2428 += i_104_;
		((Class204) class204).anInt2426++;
	    } else if (i_106_ == 1) {
		if (((Class89_Sub3) this).aClass188Array9708 == null)
		    ((Class89_Sub3) this).aClass188Array9708
			= new Class188[((Class89_Sub3) this).anInt9691];
		Class188 class188
		    = (((Class89_Sub3) this).aClass188Array9708[i]
		       = new Class188());
		((Class188) class188).anInt2206 = i_102_;
		((Class188) class188).anInt2207 = i_103_;
		((Class188) class188).anInt2208 = i_104_;
	    }
	}
    }
    
    public int method1894() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9732;
    }
    
    void method16053(boolean bool) {
	if (((Class89_Sub3) this).anInt9741 == 1)
	    method16055();
	else if (((Class89_Sub3) this).anInt9741 == 2) {
	    if ((((Class89_Sub3) this).anInt9683 & 0x97098) == 0
		&& ((Class89_Sub3) this).aFloatArrayArray9720 == null)
		((Class89_Sub3) this).aShortArray9713 = null;
	    if (bool)
		((Class89_Sub3) this).aByteArray9709 = null;
	} else {
	    method16051();
	    int i
		= ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		    .anInt9266)
		   * 1091642367);
	    int i_107_
		= ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		    .anInt9258)
		   * 2068876759);
	    int i_108_
		= ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		    .anInt9273)
		   * -1017303393);
	    int i_109_
		= ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		    .anInt9255) * 380315217
		   >> 8);
	    int i_110_ = 0;
	    int i_111_ = 0;
	    if (((Class89_Sub3) this).anInt9715 != 0) {
		i_110_ = (((Class103_Sub2)
			   ((Class89_Sub3) this).aClass103_Sub2_9690).anInt9256
			  * 971221760 / ((Class89_Sub3) this).anInt9715);
		i_111_ = (((Class103_Sub2)
			   ((Class89_Sub3) this).aClass103_Sub2_9690).anInt9257
			  * 2007041280 / ((Class89_Sub3) this).anInt9715);
	    }
	    if (((Class89_Sub3) this).anIntArray9710 == null) {
		((Class89_Sub3) this).anIntArray9710
		    = new int[((Class89_Sub3) this).anInt9691];
		((Class89_Sub3) this).anIntArray9747
		    = new int[((Class89_Sub3) this).anInt9691];
		((Class89_Sub3) this).anIntArray9704
		    = new int[((Class89_Sub3) this).anInt9691];
	    }
	    for (int i_112_ = 0; i_112_ < ((Class89_Sub3) this).anInt9691;
		 i_112_++) {
		byte i_113_;
		if (((Class89_Sub3) this).aByteArray9709 == null)
		    i_113_ = (byte) 0;
		else
		    i_113_ = ((Class89_Sub3) this).aByteArray9709[i_112_];
		byte i_114_;
		if (((Class89_Sub3) this).aByteArray9711 == null)
		    i_114_ = (byte) 0;
		else
		    i_114_ = ((Class89_Sub3) this).aByteArray9711[i_112_];
		short i_115_;
		if (((Class89_Sub3) this).aShortArray9712 == null)
		    i_115_ = (short) -1;
		else
		    i_115_ = ((Class89_Sub3) this).aShortArray9712[i_112_];
		if (i_114_ == -2)
		    i_113_ = (byte) 3;
		if (i_114_ == -1)
		    i_113_ = (byte) 2;
		if (i_115_ == -1) {
		    if (i_113_ == 0) {
			int i_116_
			    = (((Class89_Sub3) this).aShortArray9713[i_112_]
			       & 0xffff);
			int i_117_ = (((i_116_ & 0x7f)
				       * ((Class89_Sub3) this).anInt9707)
				      >> 7);
			short i_118_
			    = Class241_Sub42.method16451((i_116_ & ~0x7f
							  | i_117_),
							 -1105191051);
			Class204 class204;
			if (((Class89_Sub3) this).aClass204Array9744 != null
			    && (((Class89_Sub3) this).aClass204Array9744
				[(((Class89_Sub3) this).aShortArray9696
				  [i_112_])]) != null)
			    class204
				= (((Class89_Sub3) this).aClass204Array9744
				   [(((Class89_Sub3) this).aShortArray9696
				     [i_112_])]);
			else
			    class204
				= (((Class89_Sub3) this).aClass204Array9692
				   [(((Class89_Sub3) this).aShortArray9696
				     [i_112_])]);
			int i_119_
			    = (((i * ((Class204) class204).anInt2429
				 + i_107_ * ((Class204) class204).anInt2427
				 + i_108_ * ((Class204) class204).anInt2428)
				/ ((Class204) class204).anInt2426)
			       >> 16);
			int i_120_ = i_119_ > 256 ? i_110_ : i_111_;
			int i_121_ = (i_109_ >> 1) + (i_120_ * i_119_ >> 17);
			((Class89_Sub3) this).anIntArray9710[i_112_]
			    = i_121_ << 17 | Class639.method13606(i_118_,
								  i_121_,
								  -1858097490);
			if (((Class89_Sub3) this).aClass204Array9744 != null
			    && (((Class89_Sub3) this).aClass204Array9744
				[(((Class89_Sub3) this).aShortArray9697
				  [i_112_])]) != null)
			    class204
				= (((Class89_Sub3) this).aClass204Array9744
				   [(((Class89_Sub3) this).aShortArray9697
				     [i_112_])]);
			else
			    class204
				= (((Class89_Sub3) this).aClass204Array9692
				   [(((Class89_Sub3) this).aShortArray9697
				     [i_112_])]);
			i_119_ = ((i * ((Class204) class204).anInt2429
				   + i_107_ * ((Class204) class204).anInt2427
				   + i_108_ * ((Class204) class204).anInt2428)
				  / ((Class204) class204).anInt2426) >> 16;
			i_120_ = i_119_ > 256 ? i_110_ : i_111_;
			i_121_ = (i_109_ >> 1) + (i_120_ * i_119_ >> 17);
			((Class89_Sub3) this).anIntArray9747[i_112_]
			    = i_121_ << 17 | Class639.method13606(i_118_,
								  i_121_,
								  -310241227);
			if (((Class89_Sub3) this).aClass204Array9744 != null
			    && (((Class89_Sub3) this).aClass204Array9744
				[(((Class89_Sub3) this).aShortArray9698
				  [i_112_])]) != null)
			    class204
				= (((Class89_Sub3) this).aClass204Array9744
				   [(((Class89_Sub3) this).aShortArray9698
				     [i_112_])]);
			else
			    class204
				= (((Class89_Sub3) this).aClass204Array9692
				   [(((Class89_Sub3) this).aShortArray9698
				     [i_112_])]);
			i_119_ = ((i * ((Class204) class204).anInt2429
				   + i_107_ * ((Class204) class204).anInt2427
				   + i_108_ * ((Class204) class204).anInt2428)
				  / ((Class204) class204).anInt2426) >> 16;
			i_120_ = i_119_ > 256 ? i_110_ : i_111_;
			i_121_ = (i_109_ >> 1) + (i_120_ * i_119_ >> 17);
			((Class89_Sub3) this).anIntArray9704[i_112_]
			    = i_121_ << 17 | Class639.method13606(i_118_,
								  i_121_,
								  966779989);
		    } else if (i_113_ == 1) {
			int i_122_
			    = (((Class89_Sub3) this).aShortArray9713[i_112_]
			       & 0xffff);
			int i_123_ = (((i_122_ & 0x7f)
				       * ((Class89_Sub3) this).anInt9707)
				      >> 7);
			short i_124_
			    = Class241_Sub42.method16451((i_122_ & ~0x7f
							  | i_123_),
							 -439261294);
			Class188 class188
			    = ((Class89_Sub3) this).aClass188Array9708[i_112_];
			int i_125_
			    = ((i * ((Class188) class188).anInt2206
				+ i_107_ * ((Class188) class188).anInt2207
				+ i_108_ * ((Class188) class188).anInt2208)
			       >> 16);
			int i_126_ = i_125_ > 256 ? i_110_ : i_111_;
			int i_127_ = (i_109_ >> 1) + (i_126_ * i_125_ >> 17);
			((Class89_Sub3) this).anIntArray9710[i_112_]
			    = i_127_ << 17 | Class639.method13606(i_124_,
								  i_127_,
								  -743154489);
			((Class89_Sub3) this).anIntArray9704[i_112_] = -1;
		    } else if (i_113_ == 3) {
			((Class89_Sub3) this).anIntArray9710[i_112_] = 128;
			((Class89_Sub3) this).anIntArray9704[i_112_] = -1;
		    } else
			((Class89_Sub3) this).anIntArray9704[i_112_] = -2;
		} else {
		    int i_128_ = (((Class89_Sub3) this).aShortArray9713[i_112_]
				  & 0xffff);
		    if (i_113_ == 0) {
			Class204 class204;
			if (((Class89_Sub3) this).aClass204Array9744 != null
			    && (((Class89_Sub3) this).aClass204Array9744
				[(((Class89_Sub3) this).aShortArray9696
				  [i_112_])]) != null)
			    class204
				= (((Class89_Sub3) this).aClass204Array9744
				   [(((Class89_Sub3) this).aShortArray9696
				     [i_112_])]);
			else
			    class204
				= (((Class89_Sub3) this).aClass204Array9692
				   [(((Class89_Sub3) this).aShortArray9696
				     [i_112_])]);
			int i_129_
			    = (((i * ((Class204) class204).anInt2429
				 + i_107_ * ((Class204) class204).anInt2427
				 + i_108_ * ((Class204) class204).anInt2428)
				/ ((Class204) class204).anInt2426)
			       >> 16);
			int i_130_ = i_129_ > 256 ? i_110_ : i_111_;
			int i_131_
			    = method16054((i_109_ >> 2) + (i_130_ * i_129_
							   >> 18));
			((Class89_Sub3) this).anIntArray9710[i_112_]
			    = i_131_ << 24 | method16126(i_128_, i_115_,
							 i_131_);
			if (((Class89_Sub3) this).aClass204Array9744 != null
			    && (((Class89_Sub3) this).aClass204Array9744
				[(((Class89_Sub3) this).aShortArray9697
				  [i_112_])]) != null)
			    class204
				= (((Class89_Sub3) this).aClass204Array9744
				   [(((Class89_Sub3) this).aShortArray9697
				     [i_112_])]);
			else
			    class204
				= (((Class89_Sub3) this).aClass204Array9692
				   [(((Class89_Sub3) this).aShortArray9697
				     [i_112_])]);
			i_129_ = ((i * ((Class204) class204).anInt2429
				   + i_107_ * ((Class204) class204).anInt2427
				   + i_108_ * ((Class204) class204).anInt2428)
				  / ((Class204) class204).anInt2426) >> 16;
			i_130_ = i_129_ > 256 ? i_110_ : i_111_;
			i_131_ = method16054((i_109_ >> 2) + (i_130_ * i_129_
							      >> 18));
			((Class89_Sub3) this).anIntArray9747[i_112_]
			    = i_131_ << 24 | method16126(i_128_, i_115_,
							 i_131_);
			if (((Class89_Sub3) this).aClass204Array9744 != null
			    && (((Class89_Sub3) this).aClass204Array9744
				[(((Class89_Sub3) this).aShortArray9698
				  [i_112_])]) != null)
			    class204
				= (((Class89_Sub3) this).aClass204Array9744
				   [(((Class89_Sub3) this).aShortArray9698
				     [i_112_])]);
			else
			    class204
				= (((Class89_Sub3) this).aClass204Array9692
				   [(((Class89_Sub3) this).aShortArray9698
				     [i_112_])]);
			i_129_ = ((i * ((Class204) class204).anInt2429
				   + i_107_ * ((Class204) class204).anInt2427
				   + i_108_ * ((Class204) class204).anInt2428)
				  / ((Class204) class204).anInt2426) >> 16;
			i_130_ = i_129_ > 256 ? i_110_ : i_111_;
			i_131_ = method16054((i_109_ >> 2) + (i_130_ * i_129_
							      >> 18));
			((Class89_Sub3) this).anIntArray9704[i_112_]
			    = i_131_ << 24 | method16126(i_128_, i_115_,
							 i_131_);
		    } else if (i_113_ == 1) {
			Class188 class188
			    = ((Class89_Sub3) this).aClass188Array9708[i_112_];
			int i_132_
			    = ((i * ((Class188) class188).anInt2206
				+ i_107_ * ((Class188) class188).anInt2207
				+ i_108_ * ((Class188) class188).anInt2208)
			       >> 16);
			int i_133_ = i_132_ > 256 ? i_110_ : i_111_;
			int i_134_
			    = method16054((i_109_ >> 2) + (i_133_ * i_132_
							   >> 18));
			((Class89_Sub3) this).anIntArray9710[i_112_]
			    = i_134_ << 24 | method16126(i_128_, i_115_,
							 i_134_);
			((Class89_Sub3) this).anIntArray9704[i_112_] = -1;
		    } else
			((Class89_Sub3) this).anIntArray9704[i_112_] = -2;
		}
	    }
	    ((Class89_Sub3) this).aClass204Array9692 = null;
	    ((Class89_Sub3) this).aClass204Array9744 = null;
	    ((Class89_Sub3) this).aClass188Array9708 = null;
	    if ((((Class89_Sub3) this).anInt9683 & 0x97098) == 0
		&& ((Class89_Sub3) this).aFloatArrayArray9720 == null)
		((Class89_Sub3) this).aShortArray9713 = null;
	    if (bool)
		((Class89_Sub3) this).aByteArray9709 = null;
	    ((Class89_Sub3) this).anInt9741 = 2;
	}
    }
    
    public void method2006(Class266 class266, Class97 class97, int i) {
	method16067(class266, class97, i);
    }
    
    public void method1967(Class266 class266, Class97 class97, int i) {
	method16067(class266, class97, i);
    }
    
    int method16054(int i) {
	if (i < 2)
	    i = 2;
	else if (i > 126)
	    i = 126;
	return i;
    }
    
    void method16055() {
	if (((Class89_Sub3) this).anInt9741 == 0)
	    method16117(false);
	else if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		  .anInt9274) * 592623211
		 > 1) {
	    synchronized (this) {
		method16056();
	    }
	} else
	    method16056();
    }
    
    void method16056() {
	for (int i = 0; i < ((Class89_Sub3) this).anInt9691; i++) {
	    short i_135_
		= (((Class89_Sub3) this).aShortArray9712 != null
		   ? ((Class89_Sub3) this).aShortArray9712[i] : (short) -1);
	    if (i_135_ == -1) {
		int i_136_ = ((Class89_Sub3) this).aShortArray9713[i] & 0xffff;
		int i_137_
		    = (i_136_ & 0x7f) * ((Class89_Sub3) this).anInt9707 >> 7;
		short i_138_
		    = Class241_Sub42.method16451(i_136_ & ~0x7f | i_137_,
						 -1539700942);
		if (((Class89_Sub3) this).anIntArray9704[i] == -1) {
		    int i_139_
			= ((Class89_Sub3) this).anIntArray9710[i] & ~0x1ffff;
		    ((Class89_Sub3) this).anIntArray9710[i]
			= i_139_ | Class639.method13606(i_138_, i_139_ >> 17,
							-1216303424);
		} else if (((Class89_Sub3) this).anIntArray9704[i] != -2) {
		    int i_140_
			= ((Class89_Sub3) this).anIntArray9710[i] & ~0x1ffff;
		    ((Class89_Sub3) this).anIntArray9710[i]
			= i_140_ | Class639.method13606(i_138_, i_140_ >> 17,
							120661540);
		    i_140_
			= ((Class89_Sub3) this).anIntArray9747[i] & ~0x1ffff;
		    ((Class89_Sub3) this).anIntArray9747[i]
			= i_140_ | Class639.method13606(i_138_, i_140_ >> 17,
							-943543108);
		    i_140_
			= ((Class89_Sub3) this).anIntArray9704[i] & ~0x1ffff;
		    ((Class89_Sub3) this).anIntArray9704[i]
			= i_140_ | Class639.method13606(i_138_, i_140_ >> 17,
							407613553);
		}
	    }
	}
	((Class89_Sub3) this).anInt9741 = 2;
    }
    
    public void method1920(Class89 class89, int i, int i_141_, int i_142_,
			   boolean bool) {
	Class89_Sub3 class89_sub3_143_ = (Class89_Sub3) class89;
	if ((((Class89_Sub3) this).anInt9683 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	if ((((Class89_Sub3) class89_sub3_143_).anInt9683 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	method16049(((Class89_Sub3) this).aClass103_Sub2_9690
			.method15377(Thread.currentThread()));
	method16077();
	method16051();
	class89_sub3_143_.method16077();
	class89_sub3_143_.method16051();
	anInt9699++;
	int i_144_ = 0;
	int[] is = ((Class89_Sub3) class89_sub3_143_).anIntArray9670;
	int i_145_ = ((Class89_Sub3) class89_sub3_143_).anInt9687;
	for (int i_146_ = 0; i_146_ < ((Class89_Sub3) this).anInt9687;
	     i_146_++) {
	    Class204 class204
		= ((Class89_Sub3) this).aClass204Array9692[i_146_];
	    if (((Class204) class204).anInt2426 != 0) {
		int i_147_
		    = ((Class89_Sub3) this).anIntArray9685[i_146_] - i_141_;
		if (i_147_ >= ((Class89_Sub3) class89_sub3_143_).aShort9733
		    && (i_147_
			<= ((Class89_Sub3) class89_sub3_143_).aShort9734)) {
		    int i_148_
			= ((Class89_Sub3) this).anIntArray9670[i_146_] - i;
		    if (i_148_ >= ((Class89_Sub3) class89_sub3_143_).aShort9735
			&& i_148_ <= (((Class89_Sub3) class89_sub3_143_)
				      .aShort9736)) {
			int i_149_
			    = (((Class89_Sub3) this).anIntArray9684[i_146_]
			       - i_142_);
			if ((i_149_
			     >= ((Class89_Sub3) class89_sub3_143_).aShort9737)
			    && i_149_ <= (((Class89_Sub3) class89_sub3_143_)
					  .aShort9738)) {
			    for (int i_150_ = 0; i_150_ < i_145_; i_150_++) {
				Class204 class204_151_
				    = (((Class89_Sub3) class89_sub3_143_)
				       .aClass204Array9692[i_150_]);
				if (i_148_ == is[i_150_]
				    && (i_149_
					== (((Class89_Sub3) class89_sub3_143_)
					    .anIntArray9684[i_150_]))
				    && (i_147_
					== (((Class89_Sub3) class89_sub3_143_)
					    .anIntArray9685[i_150_]))
				    && (((Class204) class204_151_).anInt2426
					!= 0)) {
				    if ((((Class89_Sub3) this)
					 .aClass204Array9744)
					== null)
					((Class89_Sub3) this)
					    .aClass204Array9744
					    = new Class204[((Class89_Sub3)
							    this).anInt9687];
				    if ((((Class89_Sub3) class89_sub3_143_)
					 .aClass204Array9744)
					== null)
					((Class89_Sub3) class89_sub3_143_)
					    .aClass204Array9744
					    = new Class204[i_145_];
				    Class204 class204_152_
					= (((Class89_Sub3) this)
					   .aClass204Array9744[i_146_]);
				    if (class204_152_ == null)
					class204_152_
					    = ((Class89_Sub3) this)
						  .aClass204Array9744[i_146_]
					    = new Class204(class204);
				    Class204 class204_153_
					= (((Class89_Sub3) class89_sub3_143_)
					   .aClass204Array9744[i_150_]);
				    if (class204_153_ == null)
					class204_153_
					    = ((Class89_Sub3)
					       class89_sub3_143_)
						  .aClass204Array9744[i_150_]
					    = new Class204(class204_151_);
				    ((Class204) class204_152_).anInt2429
					+= (((Class204) class204_151_)
					    .anInt2429);
				    ((Class204) class204_152_).anInt2427
					+= (((Class204) class204_151_)
					    .anInt2427);
				    ((Class204) class204_152_).anInt2428
					+= (((Class204) class204_151_)
					    .anInt2428);
				    ((Class204) class204_152_).anInt2426
					+= (((Class204) class204_151_)
					    .anInt2426);
				    ((Class204) class204_153_).anInt2429
					+= ((Class204) class204).anInt2429;
				    ((Class204) class204_153_).anInt2427
					+= ((Class204) class204).anInt2427;
				    ((Class204) class204_153_).anInt2428
					+= ((Class204) class204).anInt2428;
				    ((Class204) class204_153_).anInt2426
					+= ((Class204) class204).anInt2426;
				    i_144_++;
				    ((Class89_Sub3) this).anIntArray9752
					[i_146_]
					= anInt9699;
				    ((Class89_Sub3) this).anIntArray9753
					[i_150_]
					= anInt9699;
				}
			    }
			}
		    }
		}
	    }
	}
	if (i_144_ >= 3 && bool) {
	    for (int i_154_ = 0; i_154_ < ((Class89_Sub3) this).anInt9691;
		 i_154_++) {
		if (((((Class89_Sub3) this).anIntArray9752
		      [((Class89_Sub3) this).aShortArray9696[i_154_]])
		     == anInt9699)
		    && ((((Class89_Sub3) this).anIntArray9752
			 [((Class89_Sub3) this).aShortArray9697[i_154_]])
			== anInt9699)
		    && ((((Class89_Sub3) this).anIntArray9752
			 [((Class89_Sub3) this).aShortArray9698[i_154_]])
			== anInt9699)) {
		    if (((Class89_Sub3) this).aByteArray9709 == null)
			((Class89_Sub3) this).aByteArray9709
			    = new byte[((Class89_Sub3) this).anInt9691];
		    ((Class89_Sub3) this).aByteArray9709[i_154_] = (byte) 2;
		}
	    }
	    for (int i_155_ = 0;
		 i_155_ < ((Class89_Sub3) class89_sub3_143_).anInt9691;
		 i_155_++) {
		if ((((Class89_Sub3) this).anIntArray9753
		     [(((Class89_Sub3) class89_sub3_143_).aShortArray9696
		       [i_155_])]) == anInt9699
		    && (((Class89_Sub3) this).anIntArray9753
			[(((Class89_Sub3) class89_sub3_143_).aShortArray9697
			  [i_155_])]) == anInt9699
		    && (((Class89_Sub3) this).anIntArray9753
			[(((Class89_Sub3) class89_sub3_143_).aShortArray9698
			  [i_155_])]) == anInt9699) {
		    if (((Class89_Sub3) class89_sub3_143_).aByteArray9709
			== null)
			((Class89_Sub3) class89_sub3_143_).aByteArray9709
			    = (new byte
			       [((Class89_Sub3) class89_sub3_143_).anInt9691]);
		    ((Class89_Sub3) class89_sub3_143_).aByteArray9709[i_155_]
			= (byte) 2;
		}
	    }
	}
    }
    
    public Class89 method2019(byte i, int i_156_, boolean bool) {
	method16050(Thread.currentThread());
	boolean bool_157_ = false;
	Class89_Sub3 class89_sub3_158_;
	Class89_Sub3 class89_sub3_159_;
	if (i > 0 && i <= 8) {
	    class89_sub3_159_
		= ((Class89_Sub3) this).aClass89_Sub3Array9742[i - 1];
	    class89_sub3_158_
		= ((Class89_Sub3) this).aClass89_Sub3Array9755[i - 1];
	    bool_157_ = true;
	} else
	    class89_sub3_158_ = class89_sub3_159_
		= new Class89_Sub3(((Class89_Sub3) this).aClass103_Sub2_9690);
	return method16057(class89_sub3_158_, class89_sub3_159_, i_156_,
			   bool_157_, bool);
    }
    
    Class89 method16057(Class89_Sub3 class89_sub3_160_,
			Class89_Sub3 class89_sub3_161_, int i, boolean bool,
			boolean bool_162_) {
	((Class89_Sub3) class89_sub3_160_).aBool9730
	    = ((Class89_Sub3) this).aBool9730;
	if (((Class89_Sub3) this).aBool9730) {
	    ((Class89_Sub3) class89_sub3_160_).aShort9736
		= ((Class89_Sub3) this).aShort9736;
	    ((Class89_Sub3) class89_sub3_160_).aShort9734
		= ((Class89_Sub3) this).aShort9734;
	    ((Class89_Sub3) class89_sub3_160_).aShort9738
		= ((Class89_Sub3) this).aShort9738;
	    ((Class89_Sub3) class89_sub3_160_).aShort9735
		= ((Class89_Sub3) this).aShort9735;
	    ((Class89_Sub3) class89_sub3_160_).aShort9733
		= ((Class89_Sub3) this).aShort9733;
	    ((Class89_Sub3) class89_sub3_160_).aShort9737
		= ((Class89_Sub3) this).aShort9737;
	    ((Class89_Sub3) class89_sub3_160_).aShort9731
		= ((Class89_Sub3) this).aShort9731;
	    ((Class89_Sub3) class89_sub3_160_).aShort9732
		= ((Class89_Sub3) this).aShort9732;
	}
	if (((Class89_Sub3) this).aBool9739) {
	    ((Class89_Sub3) class89_sub3_160_).aShort9740
		= ((Class89_Sub3) this).aShort9740;
	    ((Class89_Sub3) class89_sub3_160_).aBool9739 = true;
	} else
	    ((Class89_Sub3) class89_sub3_160_).aBool9739 = false;
	((Class89_Sub3) class89_sub3_160_).anInt9707
	    = ((Class89_Sub3) this).anInt9707;
	((Class89_Sub3) class89_sub3_160_).anInt9715
	    = ((Class89_Sub3) this).anInt9715;
	((Class89_Sub3) class89_sub3_160_).anInt9686
	    = ((Class89_Sub3) this).anInt9686;
	((Class89_Sub3) class89_sub3_160_).anInt9687
	    = ((Class89_Sub3) this).anInt9687;
	((Class89_Sub3) class89_sub3_160_).anInt9691
	    = ((Class89_Sub3) this).anInt9691;
	((Class89_Sub3) class89_sub3_160_).anInt9726
	    = ((Class89_Sub3) this).anInt9726;
	((Class89_Sub3) class89_sub3_160_).anInt9695
	    = ((Class89_Sub3) this).anInt9695;
	if ((i & 0x100) != 0)
	    ((Class89_Sub3) class89_sub3_160_).aBool9748 = true;
	else
	    ((Class89_Sub3) class89_sub3_160_).aBool9748
		= ((Class89_Sub3) this).aBool9748;
	((Class89_Sub3) class89_sub3_160_).aBool9688
	    = ((Class89_Sub3) this).aBool9688;
	boolean bool_163_ = (i & 0x7) == 7 | (i & 0x20) != 0;
	boolean bool_164_ = bool_163_ || (i & 0x1) != 0;
	boolean bool_165_ = bool_163_ || (i & 0x2) != 0;
	boolean bool_166_ = bool_163_ || (i & 0x4) != 0 || (i & 0x10) != 0;
	if (bool_164_ || bool_165_ || bool_166_) {
	    if (bool_164_) {
		if (((Class89_Sub3) class89_sub3_161_).anIntArray9670 == null
		    || ((((Class89_Sub3) class89_sub3_161_)
			 .anIntArray9670).length
			< ((Class89_Sub3) this).anInt9686))
		    ((Class89_Sub3) class89_sub3_160_).anIntArray9670
			= ((Class89_Sub3) class89_sub3_161_).anIntArray9670
			= new int[((Class89_Sub3) this).anInt9686];
		else
		    ((Class89_Sub3) class89_sub3_160_).anIntArray9670
			= ((Class89_Sub3) class89_sub3_161_).anIntArray9670;
		for (int i_167_ = 0; i_167_ < ((Class89_Sub3) this).anInt9686;
		     i_167_++)
		    ((Class89_Sub3) class89_sub3_160_).anIntArray9670[i_167_]
			= ((Class89_Sub3) this).anIntArray9670[i_167_];
	    } else
		((Class89_Sub3) class89_sub3_160_).anIntArray9670
		    = ((Class89_Sub3) this).anIntArray9670;
	    if (bool_165_) {
		if (((Class89_Sub3) class89_sub3_161_).anIntArray9685 == null
		    || ((((Class89_Sub3) class89_sub3_161_)
			 .anIntArray9685).length
			< ((Class89_Sub3) this).anInt9686))
		    ((Class89_Sub3) class89_sub3_160_).anIntArray9685
			= ((Class89_Sub3) class89_sub3_161_).anIntArray9685
			= new int[((Class89_Sub3) this).anInt9686];
		else
		    ((Class89_Sub3) class89_sub3_160_).anIntArray9685
			= ((Class89_Sub3) class89_sub3_161_).anIntArray9685;
		for (int i_168_ = 0; i_168_ < ((Class89_Sub3) this).anInt9686;
		     i_168_++)
		    ((Class89_Sub3) class89_sub3_160_).anIntArray9685[i_168_]
			= ((Class89_Sub3) this).anIntArray9685[i_168_];
	    } else
		((Class89_Sub3) class89_sub3_160_).anIntArray9685
		    = ((Class89_Sub3) this).anIntArray9685;
	    if (bool_166_) {
		if (((Class89_Sub3) class89_sub3_161_).anIntArray9684 == null
		    || ((((Class89_Sub3) class89_sub3_161_)
			 .anIntArray9684).length
			< ((Class89_Sub3) this).anInt9686))
		    ((Class89_Sub3) class89_sub3_160_).anIntArray9684
			= ((Class89_Sub3) class89_sub3_161_).anIntArray9684
			= new int[((Class89_Sub3) this).anInt9686];
		else
		    ((Class89_Sub3) class89_sub3_160_).anIntArray9684
			= ((Class89_Sub3) class89_sub3_161_).anIntArray9684;
		for (int i_169_ = 0; i_169_ < ((Class89_Sub3) this).anInt9686;
		     i_169_++)
		    ((Class89_Sub3) class89_sub3_160_).anIntArray9684[i_169_]
			= ((Class89_Sub3) this).anIntArray9684[i_169_];
	    } else
		((Class89_Sub3) class89_sub3_160_).anIntArray9684
		    = ((Class89_Sub3) this).anIntArray9684;
	} else {
	    ((Class89_Sub3) class89_sub3_160_).anIntArray9670
		= ((Class89_Sub3) this).anIntArray9670;
	    ((Class89_Sub3) class89_sub3_160_).anIntArray9685
		= ((Class89_Sub3) this).anIntArray9685;
	    ((Class89_Sub3) class89_sub3_160_).anIntArray9684
		= ((Class89_Sub3) this).anIntArray9684;
	}
	if ((i & 0x84080) != 0) {
	    if (((Class89_Sub3) class89_sub3_161_).aShortArray9713 == null
		|| (((Class89_Sub3) class89_sub3_161_).aShortArray9713.length
		    < ((Class89_Sub3) this).anInt9691)) {
		int i_170_ = ((Class89_Sub3) this).anInt9691;
		((Class89_Sub3) class89_sub3_160_).aShortArray9713
		    = ((Class89_Sub3) class89_sub3_161_).aShortArray9713
		    = new short[i_170_];
	    } else
		((Class89_Sub3) class89_sub3_160_).aShortArray9713
		    = ((Class89_Sub3) class89_sub3_161_).aShortArray9713;
	    for (int i_171_ = 0; i_171_ < ((Class89_Sub3) this).anInt9691;
		 i_171_++)
		((Class89_Sub3) class89_sub3_160_).aShortArray9713[i_171_]
		    = ((Class89_Sub3) this).aShortArray9713[i_171_];
	} else
	    ((Class89_Sub3) class89_sub3_160_).aShortArray9713
		= ((Class89_Sub3) this).aShortArray9713;
	if ((i & 0x97018) != 0) {
	    ((Class89_Sub3) class89_sub3_160_).anInt9741 = 0;
	    Class89_Sub3 class89_sub3_172_ = class89_sub3_160_;
	    Class89_Sub3 class89_sub3_173_ = class89_sub3_160_;
	    ((Class89_Sub3) class89_sub3_160_).anIntArray9704 = null;
	    ((Class89_Sub3) class89_sub3_173_).anIntArray9747 = null;
	    ((Class89_Sub3) class89_sub3_172_).anIntArray9710 = null;
	} else if ((i & 0x80) != 0) {
	    if (bool_162_)
		method16117(false);
	    if (((Class89_Sub3) this).anIntArray9710 != null) {
		if (((Class89_Sub3) class89_sub3_161_).anIntArray9710 == null
		    || ((((Class89_Sub3) class89_sub3_161_)
			 .anIntArray9710).length
			< ((Class89_Sub3) this).anInt9691)) {
		    int i_174_ = ((Class89_Sub3) this).anInt9691;
		    ((Class89_Sub3) class89_sub3_160_).anIntArray9710
			= ((Class89_Sub3) class89_sub3_161_).anIntArray9710
			= new int[i_174_];
		    ((Class89_Sub3) class89_sub3_160_).anIntArray9747
			= ((Class89_Sub3) class89_sub3_161_).anIntArray9747
			= new int[i_174_];
		    ((Class89_Sub3) class89_sub3_160_).anIntArray9704
			= ((Class89_Sub3) class89_sub3_161_).anIntArray9704
			= new int[i_174_];
		} else {
		    ((Class89_Sub3) class89_sub3_160_).anIntArray9710
			= ((Class89_Sub3) class89_sub3_161_).anIntArray9710;
		    ((Class89_Sub3) class89_sub3_160_).anIntArray9747
			= ((Class89_Sub3) class89_sub3_161_).anIntArray9747;
		    ((Class89_Sub3) class89_sub3_160_).anIntArray9704
			= ((Class89_Sub3) class89_sub3_161_).anIntArray9704;
		}
		for (int i_175_ = 0; i_175_ < ((Class89_Sub3) this).anInt9691;
		     i_175_++) {
		    ((Class89_Sub3) class89_sub3_160_).anIntArray9710[i_175_]
			= ((Class89_Sub3) this).anIntArray9710[i_175_];
		    ((Class89_Sub3) class89_sub3_160_).anIntArray9747[i_175_]
			= ((Class89_Sub3) this).anIntArray9747[i_175_];
		    ((Class89_Sub3) class89_sub3_160_).anIntArray9704[i_175_]
			= ((Class89_Sub3) this).anIntArray9704[i_175_];
		}
	    }
	    ((Class89_Sub3) class89_sub3_160_).anInt9741
		= ((Class89_Sub3) this).anInt9741;
	} else {
	    if (bool_162_)
		method16117(false);
	    ((Class89_Sub3) class89_sub3_160_).anIntArray9710
		= ((Class89_Sub3) this).anIntArray9710;
	    ((Class89_Sub3) class89_sub3_160_).anIntArray9747
		= ((Class89_Sub3) this).anIntArray9747;
	    ((Class89_Sub3) class89_sub3_160_).anIntArray9704
		= ((Class89_Sub3) this).anIntArray9704;
	    ((Class89_Sub3) class89_sub3_160_).anInt9741
		= ((Class89_Sub3) this).anInt9741;
	}
	if ((i & 0x100) != 0) {
	    if (((Class89_Sub3) class89_sub3_161_).aByteArray9711 == null
		|| (((Class89_Sub3) class89_sub3_161_).aByteArray9711.length
		    < ((Class89_Sub3) this).anInt9691)) {
		int i_176_ = ((Class89_Sub3) this).anInt9691;
		((Class89_Sub3) class89_sub3_160_).aByteArray9711
		    = ((Class89_Sub3) class89_sub3_161_).aByteArray9711
		    = new byte[i_176_];
	    } else
		((Class89_Sub3) class89_sub3_160_).aByteArray9711
		    = ((Class89_Sub3) class89_sub3_161_).aByteArray9711;
	    if (((Class89_Sub3) this).aByteArray9711 != null) {
		for (int i_177_ = 0; i_177_ < ((Class89_Sub3) this).anInt9691;
		     i_177_++)
		    ((Class89_Sub3) class89_sub3_160_).aByteArray9711[i_177_]
			= ((Class89_Sub3) this).aByteArray9711[i_177_];
	    } else {
		for (int i_178_ = 0; i_178_ < ((Class89_Sub3) this).anInt9691;
		     i_178_++)
		    ((Class89_Sub3) class89_sub3_160_).aByteArray9711[i_178_]
			= (byte) 0;
	    }
	} else
	    ((Class89_Sub3) class89_sub3_160_).aByteArray9711
		= ((Class89_Sub3) this).aByteArray9711;
	if ((i & 0x8) != 0 || (i & 0x10) != 0) {
	    if (((Class89_Sub3) class89_sub3_161_).aClass204Array9692 == null
		|| ((((Class89_Sub3) class89_sub3_161_)
		     .aClass204Array9692).length
		    < ((Class89_Sub3) this).anInt9687)) {
		int i_179_ = ((Class89_Sub3) this).anInt9687;
		((Class89_Sub3) class89_sub3_160_).aClass204Array9692
		    = ((Class89_Sub3) class89_sub3_161_).aClass204Array9692
		    = new Class204[i_179_];
	    } else
		((Class89_Sub3) class89_sub3_160_).aClass204Array9692
		    = ((Class89_Sub3) class89_sub3_161_).aClass204Array9692;
	    if (((Class89_Sub3) this).aClass204Array9692 != null) {
		for (int i_180_ = 0; i_180_ < ((Class89_Sub3) this).anInt9687;
		     i_180_++)
		    ((Class89_Sub3) class89_sub3_160_).aClass204Array9692
			[i_180_]
			= new Class204(((Class89_Sub3) this).aClass204Array9692
				       [i_180_]);
	    } else
		((Class89_Sub3) class89_sub3_160_).aClass204Array9692 = null;
	    if (((Class89_Sub3) this).aClass188Array9708 != null) {
		if ((((Class89_Sub3) class89_sub3_161_).aClass188Array9708
		     == null)
		    || ((((Class89_Sub3) class89_sub3_161_)
			 .aClass188Array9708).length
			< ((Class89_Sub3) this).anInt9691)) {
		    int i_181_ = ((Class89_Sub3) this).anInt9691;
		    ((Class89_Sub3) class89_sub3_160_).aClass188Array9708
			= ((Class89_Sub3) class89_sub3_161_).aClass188Array9708
			= new Class188[i_181_];
		} else
		    ((Class89_Sub3) class89_sub3_160_).aClass188Array9708
			= (((Class89_Sub3) class89_sub3_161_)
			   .aClass188Array9708);
		for (int i_182_ = 0; i_182_ < ((Class89_Sub3) this).anInt9691;
		     i_182_++)
		    ((Class89_Sub3) class89_sub3_160_).aClass188Array9708
			[i_182_]
			= ((((Class89_Sub3) this).aClass188Array9708[i_182_]
			    != null)
			   ? new Class188(((Class89_Sub3) this)
					  .aClass188Array9708[i_182_])
			   : null);
	    } else
		((Class89_Sub3) class89_sub3_160_).aClass188Array9708 = null;
	} else {
	    if (bool_162_)
		method16051();
	    ((Class89_Sub3) class89_sub3_160_).aClass204Array9692
		= ((Class89_Sub3) this).aClass204Array9692;
	    ((Class89_Sub3) class89_sub3_160_).aClass188Array9708
		= ((Class89_Sub3) this).aClass188Array9708;
	}
	if ((i & 0x8000) != 0) {
	    if (((Class89_Sub3) this).aShortArray9712 == null)
		((Class89_Sub3) class89_sub3_160_).aShortArray9712 = null;
	    else {
		if (((Class89_Sub3) class89_sub3_161_).aShortArray9712 == null
		    || ((((Class89_Sub3) class89_sub3_161_)
			 .aShortArray9712).length
			< ((Class89_Sub3) this).anInt9691)) {
		    int i_183_ = ((Class89_Sub3) this).anInt9691;
		    ((Class89_Sub3) class89_sub3_160_).aShortArray9712
			= ((Class89_Sub3) class89_sub3_161_).aShortArray9712
			= new short[i_183_];
		} else
		    ((Class89_Sub3) class89_sub3_160_).aShortArray9712
			= ((Class89_Sub3) class89_sub3_161_).aShortArray9712;
		for (int i_184_ = 0; i_184_ < ((Class89_Sub3) this).anInt9691;
		     i_184_++)
		    ((Class89_Sub3) class89_sub3_160_).aShortArray9712[i_184_]
			= ((Class89_Sub3) this).aShortArray9712[i_184_];
	    }
	} else
	    ((Class89_Sub3) class89_sub3_160_).aShortArray9712
		= ((Class89_Sub3) this).aShortArray9712;
	if ((i & 0x10000) != 0) {
	    if (((Class89_Sub3) this).aByteArray9709 == null)
		((Class89_Sub3) class89_sub3_160_).aByteArray9709 = null;
	    else {
		if (((Class89_Sub3) class89_sub3_161_).aByteArray9709 == null
		    || ((((Class89_Sub3) class89_sub3_161_)
			 .aByteArray9709).length
			< ((Class89_Sub3) this).anInt9691)) {
		    int i_185_ = (bool ? ((Class89_Sub3) this).anInt9691 + 100
				  : ((Class89_Sub3) this).anInt9691);
		    ((Class89_Sub3) class89_sub3_160_).aByteArray9709
			= ((Class89_Sub3) class89_sub3_161_).aByteArray9709
			= new byte[i_185_];
		} else
		    ((Class89_Sub3) class89_sub3_160_).aByteArray9709
			= ((Class89_Sub3) class89_sub3_161_).aByteArray9709;
		for (int i_186_ = 0; i_186_ < ((Class89_Sub3) this).anInt9691;
		     i_186_++)
		    ((Class89_Sub3) class89_sub3_160_).aByteArray9709[i_186_]
			= ((Class89_Sub3) this).aByteArray9709[i_186_];
	    }
	} else
	    ((Class89_Sub3) class89_sub3_160_).aByteArray9709
		= ((Class89_Sub3) this).aByteArray9709;
	if ((i & 0xc580) != 0) {
	    if (((Class89_Sub3) class89_sub3_161_).aClass203Array9728 == null
		|| ((((Class89_Sub3) class89_sub3_161_)
		     .aClass203Array9728).length
		    < ((Class89_Sub3) this).anInt9726)) {
		int i_187_ = ((Class89_Sub3) this).anInt9726;
		((Class89_Sub3) class89_sub3_160_).aClass203Array9728
		    = ((Class89_Sub3) class89_sub3_161_).aClass203Array9728
		    = new Class203[i_187_];
		for (int i_188_ = 0; i_188_ < ((Class89_Sub3) this).anInt9726;
		     i_188_++)
		    ((Class89_Sub3) class89_sub3_160_).aClass203Array9728
			[i_188_]
			= ((Class89_Sub3) this).aClass203Array9728[i_188_]
			      .method4081(-257580942);
	    } else {
		((Class89_Sub3) class89_sub3_160_).aClass203Array9728
		    = ((Class89_Sub3) class89_sub3_161_).aClass203Array9728;
		for (int i_189_ = 0; i_189_ < ((Class89_Sub3) this).anInt9726;
		     i_189_++)
		    ((Class89_Sub3) class89_sub3_160_).aClass203Array9728
			[i_189_].method4082
			(((Class89_Sub3) this).aClass203Array9728[i_189_],
			 -476246880);
	    }
	} else
	    ((Class89_Sub3) class89_sub3_160_).aClass203Array9728
		= ((Class89_Sub3) this).aClass203Array9728;
	if (((Class89_Sub3) this).aFloatArrayArray9720 != null
	    && (i & 0x10) != 0) {
	    if (((Class89_Sub3) class89_sub3_161_).aFloatArrayArray9720 == null
		|| ((((Class89_Sub3) class89_sub3_161_)
		     .aFloatArrayArray9720).length
		    < ((Class89_Sub3) this).anInt9691)) {
		int i_190_ = (bool ? ((Class89_Sub3) this).anInt9691 + 100
			      : ((Class89_Sub3) this).anInt9691);
		((Class89_Sub3) class89_sub3_160_).aFloatArrayArray9720
		    = ((Class89_Sub3) class89_sub3_161_).aFloatArrayArray9720
		    = new float[i_190_][3];
	    } else
		((Class89_Sub3) class89_sub3_160_).aFloatArrayArray9720
		    = ((Class89_Sub3) class89_sub3_161_).aFloatArrayArray9720;
	    for (int i_191_ = 0; i_191_ < ((Class89_Sub3) this).anInt9691;
		 i_191_++) {
		if (((Class89_Sub3) this).aFloatArrayArray9720[i_191_]
		    != null) {
		    ((Class89_Sub3) class89_sub3_160_).aFloatArrayArray9720
			[i_191_][0]
			= (((Class89_Sub3) this).aFloatArrayArray9720[i_191_]
			   [0]);
		    ((Class89_Sub3) class89_sub3_160_).aFloatArrayArray9720
			[i_191_][1]
			= (((Class89_Sub3) this).aFloatArrayArray9720[i_191_]
			   [1]);
		    ((Class89_Sub3) class89_sub3_160_).aFloatArrayArray9720
			[i_191_][2]
			= (((Class89_Sub3) this).aFloatArrayArray9720[i_191_]
			   [2]);
		}
	    }
	    if (((Class89_Sub3) class89_sub3_161_).aFloatArrayArray9703 == null
		|| ((((Class89_Sub3) class89_sub3_161_)
		     .aFloatArrayArray9703).length
		    < ((Class89_Sub3) this).anInt9691)) {
		int i_192_ = (bool ? ((Class89_Sub3) this).anInt9691 + 100
			      : ((Class89_Sub3) this).anInt9691);
		((Class89_Sub3) class89_sub3_160_).aFloatArrayArray9703
		    = ((Class89_Sub3) class89_sub3_161_).aFloatArrayArray9703
		    = new float[i_192_][3];
	    } else
		((Class89_Sub3) class89_sub3_160_).aFloatArrayArray9703
		    = ((Class89_Sub3) class89_sub3_161_).aFloatArrayArray9703;
	    for (int i_193_ = 0; i_193_ < ((Class89_Sub3) this).anInt9691;
		 i_193_++) {
		if (((Class89_Sub3) this).aFloatArrayArray9703[i_193_]
		    != null) {
		    ((Class89_Sub3) class89_sub3_160_).aFloatArrayArray9703
			[i_193_][0]
			= (((Class89_Sub3) this).aFloatArrayArray9703[i_193_]
			   [0]);
		    ((Class89_Sub3) class89_sub3_160_).aFloatArrayArray9703
			[i_193_][1]
			= (((Class89_Sub3) this).aFloatArrayArray9703[i_193_]
			   [1]);
		    ((Class89_Sub3) class89_sub3_160_).aFloatArrayArray9703
			[i_193_][2]
			= (((Class89_Sub3) this).aFloatArrayArray9703[i_193_]
			   [2]);
		}
	    }
	} else {
	    ((Class89_Sub3) class89_sub3_160_).aFloatArrayArray9720
		= ((Class89_Sub3) this).aFloatArrayArray9720;
	    ((Class89_Sub3) class89_sub3_160_).aFloatArrayArray9703
		= ((Class89_Sub3) this).aFloatArrayArray9703;
	}
	((Class89_Sub3) class89_sub3_160_).anIntArrayArray9716
	    = ((Class89_Sub3) this).anIntArrayArray9716;
	((Class89_Sub3) class89_sub3_160_).anIntArrayArray9678
	    = ((Class89_Sub3) this).anIntArrayArray9678;
	((Class89_Sub3) class89_sub3_160_).anIntArrayArray9672
	    = ((Class89_Sub3) this).anIntArrayArray9672;
	((Class89_Sub3) class89_sub3_160_).aShortArray9679
	    = ((Class89_Sub3) this).aShortArray9679;
	((Class89_Sub3) class89_sub3_160_).aShortArray9714
	    = ((Class89_Sub3) this).aShortArray9714;
	((Class89_Sub3) class89_sub3_160_).aByteArray9702
	    = ((Class89_Sub3) this).aByteArray9702;
	((Class89_Sub3) class89_sub3_160_).aShortArray9696
	    = ((Class89_Sub3) this).aShortArray9696;
	((Class89_Sub3) class89_sub3_160_).aShortArray9697
	    = ((Class89_Sub3) this).aShortArray9697;
	((Class89_Sub3) class89_sub3_160_).aShortArray9698
	    = ((Class89_Sub3) this).aShortArray9698;
	((Class89_Sub3) class89_sub3_160_).aClass106Array9724
	    = ((Class89_Sub3) this).aClass106Array9724;
	((Class89_Sub3) class89_sub3_160_).aClass167Array9725
	    = ((Class89_Sub3) this).aClass167Array9725;
	((Class89_Sub3) class89_sub3_160_).aClass187Array9727
	    = ((Class89_Sub3) this).aClass187Array9727;
	((Class89_Sub3) class89_sub3_160_).aShortArray9701
	    = ((Class89_Sub3) this).aShortArray9701;
	((Class89_Sub3) class89_sub3_160_).anInt9683 = i;
	return class89_sub3_160_;
    }
    
    final void method16058(boolean bool, boolean bool_194_, boolean bool_195_,
			   int i) {
	short i_196_ = ((Class89_Sub3) this).aShortArray9696[i];
	short i_197_ = ((Class89_Sub3) this).aShortArray9697[i];
	short i_198_ = ((Class89_Sub3) this).aShortArray9698[i];
	int i_199_ = -1;
	if (((Class89_Sub3) this).aShortArray9712 != null
	    && ((Class89_Sub3) this).aShortArray9712[i] != -1)
	    i_199_ = (((Class89_Sub3) this).aClass103_Sub2_9690
			  .aClass107_1458.method2680
		      (((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
		       -958614707)
		      .anInt1403) * 218388063;
	if (i_199_ == -1) {
	    if (((Class89_Sub3) this).aByteArray9711 == null)
		((Class155) ((Class89_Sub3) this).aClass155_9674).anInt1723
		    = 0;
	    else
		((Class155) ((Class89_Sub3) this).aClass155_9674).anInt1723
		    = ((Class89_Sub3) this).aByteArray9711[i] & 0xff;
	    if (((Class89_Sub3) this).anIntArray9704[i] == -1)
		((Class89_Sub3) this).aClass155_9674.method3377
		    (bool, bool_194_, bool_195_,
		     ((Class89_Sub3) this).aFloatArray9746[i_196_],
		     ((Class89_Sub3) this).aFloatArray9746[i_197_],
		     ((Class89_Sub3) this).aFloatArray9746[i_198_],
		     ((Class89_Sub3) this).aFloatArray9745[i_196_],
		     ((Class89_Sub3) this).aFloatArray9745[i_197_],
		     ((Class89_Sub3) this).aFloatArray9745[i_198_],
		     ((Class89_Sub3) this).aFloatArray9756[i_196_],
		     ((Class89_Sub3) this).aFloatArray9756[i_197_],
		     ((Class89_Sub3) this).aFloatArray9756[i_198_],
		     (Class474.anIntArray6382
		      [((Class89_Sub3) this).anIntArray9710[i] & 0xffff]));
	    else
		((Class89_Sub3) this).aClass155_9674.method3380
		    (bool, bool_194_, bool_195_,
		     ((Class89_Sub3) this).aFloatArray9746[i_196_],
		     ((Class89_Sub3) this).aFloatArray9746[i_197_],
		     ((Class89_Sub3) this).aFloatArray9746[i_198_],
		     ((Class89_Sub3) this).aFloatArray9745[i_196_],
		     ((Class89_Sub3) this).aFloatArray9745[i_197_],
		     ((Class89_Sub3) this).aFloatArray9745[i_198_],
		     ((Class89_Sub3) this).aFloatArray9756[i_196_],
		     ((Class89_Sub3) this).aFloatArray9756[i_197_],
		     ((Class89_Sub3) this).aFloatArray9756[i_198_],
		     (float) (((Class89_Sub3) this).anIntArray9710[i]
			      & 0xffff),
		     (float) (((Class89_Sub3) this).anIntArray9747[i]
			      & 0xffff),
		     (float) (((Class89_Sub3) this).anIntArray9704[i]
			      & 0xffff));
	} else {
	    int i_200_ = -16777216;
	    if (((Class89_Sub3) this).aByteArray9711 != null)
		i_200_ = 255 - (((Class89_Sub3) this).aByteArray9711[i]
				& 0xff) << 24;
	    if (((Class89_Sub3) this).anIntArray9704[i] == -1) {
		int i_201_
		    = (i_200_
		       | ((Class89_Sub3) this).anIntArray9710[i] & 0xffffff);
		((Class89_Sub3) this).aClass155_9674.method3384
		    (bool, bool_194_, bool_195_,
		     ((Class89_Sub3) this).aFloatArray9746[i_196_],
		     ((Class89_Sub3) this).aFloatArray9746[i_197_],
		     ((Class89_Sub3) this).aFloatArray9746[i_198_],
		     ((Class89_Sub3) this).aFloatArray9745[i_196_],
		     ((Class89_Sub3) this).aFloatArray9745[i_197_],
		     ((Class89_Sub3) this).aFloatArray9745[i_198_],
		     ((Class89_Sub3) this).aFloatArray9756[i_196_],
		     ((Class89_Sub3) this).aFloatArray9756[i_197_],
		     ((Class89_Sub3) this).aFloatArray9756[i_198_],
		     ((Class89_Sub3) this).aFloatArray9700[i_196_],
		     ((Class89_Sub3) this).aFloatArray9700[i_197_],
		     ((Class89_Sub3) this).aFloatArray9700[i_198_],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][0],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][1],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][2],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][0],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][1],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][2], i_201_,
		     i_201_, i_201_,
		     (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .anInt2215) * -338296791,
		     0.0F, 0.0F, 0.0F,
		     ((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
		     i_199_);
	    } else
		((Class89_Sub3) this).aClass155_9674.method3384
		    (bool, bool_194_, bool_195_,
		     ((Class89_Sub3) this).aFloatArray9746[i_196_],
		     ((Class89_Sub3) this).aFloatArray9746[i_197_],
		     ((Class89_Sub3) this).aFloatArray9746[i_198_],
		     ((Class89_Sub3) this).aFloatArray9745[i_196_],
		     ((Class89_Sub3) this).aFloatArray9745[i_197_],
		     ((Class89_Sub3) this).aFloatArray9745[i_198_],
		     ((Class89_Sub3) this).aFloatArray9756[i_196_],
		     ((Class89_Sub3) this).aFloatArray9756[i_197_],
		     ((Class89_Sub3) this).aFloatArray9756[i_198_],
		     ((Class89_Sub3) this).aFloatArray9700[i_196_],
		     ((Class89_Sub3) this).aFloatArray9700[i_197_],
		     ((Class89_Sub3) this).aFloatArray9700[i_198_],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][0],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][1],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][2],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][0],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][1],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][2],
		     (i_200_
		      | ((Class89_Sub3) this).anIntArray9710[i] & 0xffffff),
		     (i_200_
		      | ((Class89_Sub3) this).anIntArray9747[i] & 0xffffff),
		     (i_200_
		      | ((Class89_Sub3) this).anIntArray9704[i] & 0xffffff),
		     (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .anInt2215) * -338296791,
		     0.0F, 0.0F, 0.0F,
		     ((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
		     i_199_);
	}
    }
    
    public void method1928(int i) {
	if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
	     .anInt9274) * 592623211
	    > 1) {
	    synchronized (this) {
		if ((((Class89_Sub3) this).anInt9683 & 0x10000) == 65536
		    && (i & 0x10000) == 0)
		    method16117(true);
		((Class89_Sub3) this).anInt9683 = i;
	    }
	} else {
	    if ((((Class89_Sub3) this).anInt9683 & 0x10000) == 65536
		&& (i & 0x10000) == 0)
		method16117(true);
	    ((Class89_Sub3) this).anInt9683 = i;
	}
    }
    
    public void method1867() {
	/* empty */
    }
    
    public void method1868(int i) {
	if ((((Class89_Sub3) this).anInt9683 & 0x5) != 5)
	    throw new IllegalStateException();
	if (i == 4096)
	    method16128();
	else if (i == 8192)
	    method16059();
	else if (i == 12288)
	    method16109();
	else {
	    int i_202_ = Class282.anIntArray4430[i];
	    int i_203_ = Class282.anIntArray4441[i];
	    synchronized (this) {
		for (int i_204_ = 0; i_204_ < ((Class89_Sub3) this).anInt9686;
		     i_204_++) {
		    int i_205_
			= (((((Class89_Sub3) this).anIntArray9684[i_204_]
			     * i_202_)
			    + (((Class89_Sub3) this).anIntArray9670[i_204_]
			       * i_203_))
			   >> 14);
		    ((Class89_Sub3) this).anIntArray9684[i_204_]
			= ((((Class89_Sub3) this).anIntArray9684[i_204_]
			    * i_203_)
			   - (((Class89_Sub3) this).anIntArray9670[i_204_]
			      * i_202_)) >> 14;
		    ((Class89_Sub3) this).anIntArray9670[i_204_] = i_205_;
		}
		method16141();
	    }
	}
    }
    
    public void method1869(int i) {
	if ((((Class89_Sub3) this).anInt9683 & 0xd) != 13)
	    throw new IllegalStateException();
	if (((Class89_Sub3) this).aClass204Array9692 != null) {
	    if (i == 4096)
		method16060();
	    else if (i == 8192)
		method16116();
	    else if (i == 12288)
		method16061();
	    else {
		int i_206_ = Class282.anIntArray4430[i];
		int i_207_ = Class282.anIntArray4441[i];
		synchronized (this) {
		    for (int i_208_ = 0;
			 i_208_ < ((Class89_Sub3) this).anInt9687; i_208_++) {
			int i_209_
			    = (((((Class89_Sub3) this).anIntArray9684[i_208_]
				 * i_206_)
				+ (((Class89_Sub3) this).anIntArray9670[i_208_]
				   * i_207_))
			       >> 14);
			((Class89_Sub3) this).anIntArray9684[i_208_]
			    = ((((Class89_Sub3) this).anIntArray9684[i_208_]
				* i_207_)
			       - (((Class89_Sub3) this).anIntArray9670[i_208_]
				  * i_206_)) >> 14;
			((Class89_Sub3) this).anIntArray9670[i_208_] = i_209_;
			if (((Class89_Sub3) this).aClass204Array9692[i_208_]
			    != null) {
			    i_209_
				= ((((Class204) (((Class89_Sub3) this)
						 .aClass204Array9692[i_208_]))
				    .anInt2428) * i_206_
				   + (((Class204) (((Class89_Sub3) this)
						   .aClass204Array9692
						   [i_208_])).anInt2429
				      * i_207_)) >> 14;
			    ((Class204) (((Class89_Sub3) this)
					 .aClass204Array9692
					 [i_208_])).anInt2428
				= ((((Class204) (((Class89_Sub3) this)
						 .aClass204Array9692[i_208_]))
				    .anInt2428) * i_207_
				   - (((Class204) (((Class89_Sub3) this)
						   .aClass204Array9692
						   [i_208_])).anInt2429
				      * i_206_)) >> 14;
			    ((Class204) (((Class89_Sub3) this)
					 .aClass204Array9692
					 [i_208_])).anInt2429
				= i_209_;
			}
		    }
		    if (((Class89_Sub3) this).aClass188Array9708 != null) {
			for (int i_210_ = 0;
			     i_210_ < ((Class89_Sub3) this).anInt9691;
			     i_210_++) {
			    if ((((Class89_Sub3) this).aClass188Array9708
				 [i_210_])
				!= null) {
				int i_211_
				    = (((((Class188) (((Class89_Sub3) this)
						      .aClass188Array9708
						      [i_210_])).anInt2208
					 * i_206_)
					+ (((Class188) (((Class89_Sub3) this)
							.aClass188Array9708
							[i_210_])).anInt2206
					   * i_207_))
				       >> 14);
				((Class188) (((Class89_Sub3) this)
					     .aClass188Array9708
					     [i_210_])).anInt2208
				    = ((((Class188) (((Class89_Sub3) this)
						     .aClass188Array9708
						     [i_210_])).anInt2208
					* i_207_)
				       - (((Class188) (((Class89_Sub3) this)
						       .aClass188Array9708
						       [i_210_])).anInt2206
					  * i_206_)) >> 14;
				((Class188) (((Class89_Sub3) this)
					     .aClass188Array9708
					     [i_210_])).anInt2206
				    = i_211_;
			    }
			}
		    }
		    for (int i_212_ = ((Class89_Sub3) this).anInt9687;
			 i_212_ < ((Class89_Sub3) this).anInt9686; i_212_++) {
			int i_213_
			    = (((((Class89_Sub3) this).anIntArray9684[i_212_]
				 * i_206_)
				+ (((Class89_Sub3) this).anIntArray9670[i_212_]
				   * i_207_))
			       >> 14);
			((Class89_Sub3) this).anIntArray9684[i_212_]
			    = ((((Class89_Sub3) this).anIntArray9684[i_212_]
				* i_207_)
			       - (((Class89_Sub3) this).anIntArray9670[i_212_]
				  * i_206_)) >> 14;
			((Class89_Sub3) this).anIntArray9670[i_212_] = i_213_;
		    }
		    ((Class89_Sub3) this).anInt9741 = 0;
		    ((Class89_Sub3) this).aBool9730 = false;
		}
	    }
	} else
	    method1868(i);
    }
    
    public void method1941(int i, int i_214_, int i_215_) {
	if (i != 0 && (((Class89_Sub3) this).anInt9683 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_214_ != 0 && (((Class89_Sub3) this).anInt9683 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_215_ != 0 && (((Class89_Sub3) this).anInt9683 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_216_ = 0; i_216_ < ((Class89_Sub3) this).anInt9686;
		 i_216_++) {
		((Class89_Sub3) this).anIntArray9670[i_216_] += i;
		((Class89_Sub3) this).anIntArray9685[i_216_] += i_214_;
		((Class89_Sub3) this).anIntArray9684[i_216_] += i_215_;
	    }
	}
    }
    
    void method16059() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9686; i++) {
		((Class89_Sub3) this).anIntArray9670[i]
		    = -((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = -((Class89_Sub3) this).anIntArray9684[i];
	    }
	    method16141();
	}
    }
    
    public void method1945(int i, int i_217_, int i_218_) {
	if (i != 128 && (((Class89_Sub3) this).anInt9683 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_217_ != 128 && (((Class89_Sub3) this).anInt9683 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_218_ != 128 && (((Class89_Sub3) this).anInt9683 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_219_ = 0; i_219_ < ((Class89_Sub3) this).anInt9686;
		 i_219_++) {
		((Class89_Sub3) this).anIntArray9670[i_219_]
		    = ((Class89_Sub3) this).anIntArray9670[i_219_] * i >> 7;
		((Class89_Sub3) this).anIntArray9685[i_219_]
		    = (((Class89_Sub3) this).anIntArray9685[i_219_] * i_217_
		       >> 7);
		((Class89_Sub3) this).anIntArray9684[i_219_]
		    = (((Class89_Sub3) this).anIntArray9684[i_219_] * i_218_
		       >> 7);
	    }
	    ((Class89_Sub3) this).aBool9730 = false;
	}
    }
    
    void method16060() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9687; i++) {
		int i_220_ = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i]
		    = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i] = -i_220_;
		if (((Class89_Sub3) this).aClass204Array9692[i] != null) {
		    i_220_ = ((Class204) (((Class89_Sub3) this)
					  .aClass204Array9692[i])).anInt2429;
		    ((Class204) ((Class89_Sub3) this).aClass204Array9692[i])
			.anInt2429
			= ((Class204) (((Class89_Sub3) this).aClass204Array9692
				       [i])).anInt2428;
		    ((Class204) ((Class89_Sub3) this).aClass204Array9692[i])
			.anInt2428
			= -i_220_;
		}
	    }
	    if (((Class89_Sub3) this).aClass188Array9708 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9691; i++) {
		    if (((Class89_Sub3) this).aClass188Array9708[i] != null) {
			int i_221_ = (((Class188) (((Class89_Sub3) this)
						   .aClass188Array9708[i]))
				      .anInt2206);
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2206
			    = ((Class188) (((Class89_Sub3) this)
					   .aClass188Array9708[i])).anInt2208;
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2208
			    = -i_221_;
		    }
		}
	    }
	    for (int i = ((Class89_Sub3) this).anInt9687;
		 i < ((Class89_Sub3) this).anInt9686; i++) {
		int i_222_ = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i]
		    = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i] = -i_222_;
	    }
	    ((Class89_Sub3) this).anInt9741 = 0;
	    ((Class89_Sub3) this).aBool9730 = false;
	}
    }
    
    public Class241_Sub39_Sub17 method1904
	(Class241_Sub39_Sub17 class241_sub39_sub17) {
	return null;
    }
    
    void method16061() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9687; i++) {
		int i_223_ = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i] = -i_223_;
		if (((Class89_Sub3) this).aClass204Array9692[i] != null) {
		    i_223_ = ((Class204) (((Class89_Sub3) this)
					  .aClass204Array9692[i])).anInt2428;
		    ((Class204) ((Class89_Sub3) this).aClass204Array9692[i])
			.anInt2428
			= ((Class204) (((Class89_Sub3) this).aClass204Array9692
				       [i])).anInt2429;
		    ((Class204) ((Class89_Sub3) this).aClass204Array9692[i])
			.anInt2429
			= -i_223_;
		}
	    }
	    if (((Class89_Sub3) this).aClass188Array9708 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9691; i++) {
		    if (((Class89_Sub3) this).aClass188Array9708[i] != null) {
			int i_224_ = (((Class188) (((Class89_Sub3) this)
						   .aClass188Array9708[i]))
				      .anInt2208);
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2208
			    = ((Class188) (((Class89_Sub3) this)
					   .aClass188Array9708[i])).anInt2206;
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2206
			    = -i_224_;
		    }
		}
	    }
	    for (int i = ((Class89_Sub3) this).anInt9687;
		 i < ((Class89_Sub3) this).anInt9686; i++) {
		int i_225_ = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i] = -i_225_;
	    }
	    ((Class89_Sub3) this).anInt9741 = 0;
	    ((Class89_Sub3) this).aBool9730 = false;
	}
    }
    
    public void method1870(int i) {
	if ((((Class89_Sub3) this).anInt9683 & 0x6) != 6)
	    throw new IllegalStateException();
	int i_226_ = Class282.anIntArray4430[i];
	int i_227_ = Class282.anIntArray4441[i];
	synchronized (this) {
	    for (int i_228_ = 0; i_228_ < ((Class89_Sub3) this).anInt9686;
		 i_228_++) {
		int i_229_
		    = ((((Class89_Sub3) this).anIntArray9685[i_228_] * i_227_
			- (((Class89_Sub3) this).anIntArray9684[i_228_]
			   * i_226_))
		       >> 14);
		((Class89_Sub3) this).anIntArray9684[i_228_]
		    = (((Class89_Sub3) this).anIntArray9685[i_228_] * i_226_
		       + (((Class89_Sub3) this).anIntArray9684[i_228_]
			  * i_227_)) >> 14;
		((Class89_Sub3) this).anIntArray9685[i_228_] = i_229_;
	    }
	    method16141();
	}
    }
    
    public void method1980(int i) {
	if ((((Class89_Sub3) this).anInt9683 & 0x3) != 3)
	    throw new IllegalStateException();
	int i_230_ = Class282.anIntArray4430[i];
	int i_231_ = Class282.anIntArray4441[i];
	synchronized (this) {
	    for (int i_232_ = 0; i_232_ < ((Class89_Sub3) this).anInt9686;
		 i_232_++) {
		int i_233_
		    = ((((Class89_Sub3) this).anIntArray9685[i_232_] * i_230_
			+ (((Class89_Sub3) this).anIntArray9670[i_232_]
			   * i_231_))
		       >> 14);
		((Class89_Sub3) this).anIntArray9685[i_232_]
		    = (((Class89_Sub3) this).anIntArray9685[i_232_] * i_231_
		       - (((Class89_Sub3) this).anIntArray9670[i_232_]
			  * i_230_)) >> 14;
		((Class89_Sub3) this).anIntArray9670[i_232_] = i_233_;
	    }
	    method16141();
	}
    }
    
    public void method1927(int i, int i_234_, int i_235_) {
	if (i != 0 && (((Class89_Sub3) this).anInt9683 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_234_ != 0 && (((Class89_Sub3) this).anInt9683 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_235_ != 0 && (((Class89_Sub3) this).anInt9683 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_236_ = 0; i_236_ < ((Class89_Sub3) this).anInt9686;
		 i_236_++) {
		((Class89_Sub3) this).anIntArray9670[i_236_] += i;
		((Class89_Sub3) this).anIntArray9685[i_236_] += i_234_;
		((Class89_Sub3) this).anIntArray9684[i_236_] += i_235_;
	    }
	}
    }
    
    void method16062() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9687; i++) {
		int i_237_ = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i]
		    = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i] = -i_237_;
		if (((Class89_Sub3) this).aClass204Array9692[i] != null) {
		    i_237_ = ((Class204) (((Class89_Sub3) this)
					  .aClass204Array9692[i])).anInt2429;
		    ((Class204) ((Class89_Sub3) this).aClass204Array9692[i])
			.anInt2429
			= ((Class204) (((Class89_Sub3) this).aClass204Array9692
				       [i])).anInt2428;
		    ((Class204) ((Class89_Sub3) this).aClass204Array9692[i])
			.anInt2428
			= -i_237_;
		}
	    }
	    if (((Class89_Sub3) this).aClass188Array9708 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9691; i++) {
		    if (((Class89_Sub3) this).aClass188Array9708[i] != null) {
			int i_238_ = (((Class188) (((Class89_Sub3) this)
						   .aClass188Array9708[i]))
				      .anInt2206);
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2206
			    = ((Class188) (((Class89_Sub3) this)
					   .aClass188Array9708[i])).anInt2208;
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2208
			    = -i_238_;
		    }
		}
	    }
	    for (int i = ((Class89_Sub3) this).anInt9687;
		 i < ((Class89_Sub3) this).anInt9686; i++) {
		int i_239_ = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i]
		    = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i] = -i_239_;
	    }
	    ((Class89_Sub3) this).anInt9741 = 0;
	    ((Class89_Sub3) this).aBool9730 = false;
	}
    }
    
    public void method1863(int i, int i_240_, int i_241_) {
	if (i != 128 && (((Class89_Sub3) this).anInt9683 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_240_ != 128 && (((Class89_Sub3) this).anInt9683 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_241_ != 128 && (((Class89_Sub3) this).anInt9683 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_242_ = 0; i_242_ < ((Class89_Sub3) this).anInt9686;
		 i_242_++) {
		((Class89_Sub3) this).anIntArray9670[i_242_]
		    = ((Class89_Sub3) this).anIntArray9670[i_242_] * i >> 7;
		((Class89_Sub3) this).anIntArray9685[i_242_]
		    = (((Class89_Sub3) this).anIntArray9685[i_242_] * i_240_
		       >> 7);
		((Class89_Sub3) this).anIntArray9684[i_242_]
		    = (((Class89_Sub3) this).anIntArray9684[i_242_] * i_241_
		       >> 7);
	    }
	    ((Class89_Sub3) this).aBool9730 = false;
	}
    }
    
    public void method1875(int i, int i_243_, Class166 class166,
			   Class166 class166_244_, int i_245_, int i_246_,
			   int i_247_) {
	if (i == 3) {
	    if ((((Class89_Sub3) this).anInt9683 & 0x7) != 7)
		throw new IllegalStateException();
	} else if ((((Class89_Sub3) this).anInt9683 & 0x2) != 2)
	    throw new IllegalStateException();
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	int i_248_ = i_245_ + ((Class89_Sub3) this).aShort9735;
	int i_249_ = i_245_ + ((Class89_Sub3) this).aShort9736;
	int i_250_ = i_247_ + ((Class89_Sub3) this).aShort9737;
	int i_251_ = i_247_ + ((Class89_Sub3) this).aShort9738;
	if (i == 4 || (i_248_ >= 0
		       && ((i_249_ + class166.anInt2053 * 2039042417
			    >> class166.anInt2054 * -122333825)
			   < class166.anInt2055 * 266270313)
		       && i_250_ >= 0
		       && ((i_251_ + class166.anInt2053 * 2039042417
			    >> class166.anInt2054 * -122333825)
			   < class166.anInt2052 * -14610189))) {
	    int[][] is = class166.anIntArrayArray2051;
	    int[][] is_252_ = null;
	    if (class166_244_ != null)
		is_252_ = class166_244_.anIntArrayArray2051;
	    if (i == 4 || i == 5) {
		if (class166_244_ == null
		    || (i_248_ < 0
			|| ((i_249_ + class166_244_.anInt2053 * 2039042417
			     >> class166_244_.anInt2054 * -122333825)
			    >= class166_244_.anInt2055 * 266270313)
			|| i_250_ < 0
			|| ((i_251_ + class166_244_.anInt2053 * 2039042417
			     >> class166_244_.anInt2054 * -122333825)
			    >= class166_244_.anInt2052 * -14610189)))
		    return;
	    } else {
		i_248_ >>= class166.anInt2054 * -122333825;
		i_249_ = (i_249_ + (class166.anInt2053 * 2039042417 - 1)
			  >> class166.anInt2054 * -122333825);
		i_250_ >>= class166.anInt2054 * -122333825;
		i_251_ = (i_251_ + (class166.anInt2053 * 2039042417 - 1)
			  >> class166.anInt2054 * -122333825);
		if (is[i_248_][i_250_] == i_246_
		    && is[i_249_][i_250_] == i_246_
		    && is[i_248_][i_251_] == i_246_
		    && is[i_249_][i_251_] == i_246_)
		    return;
	    }
	    synchronized (this) {
		if (i == 1) {
		    int i_253_ = class166.anInt2053 * 2039042417 - 1;
		    for (int i_254_ = 0;
			 i_254_ < ((Class89_Sub3) this).anInt9687; i_254_++) {
			int i_255_
			    = (((Class89_Sub3) this).anIntArray9670[i_254_]
			       + i_245_);
			int i_256_
			    = (((Class89_Sub3) this).anIntArray9684[i_254_]
			       + i_247_);
			int i_257_ = i_255_ & i_253_;
			int i_258_ = i_256_ & i_253_;
			int i_259_ = i_255_ >> class166.anInt2054 * -122333825;
			int i_260_ = i_256_ >> class166.anInt2054 * -122333825;
			int i_261_
			    = (((is[i_259_][i_260_]
				 * (class166.anInt2053 * 2039042417 - i_257_))
				+ is[i_259_ + 1][i_260_] * i_257_)
			       >> class166.anInt2054 * -122333825);
			int i_262_
			    = (((is[i_259_][i_260_ + 1]
				 * (class166.anInt2053 * 2039042417 - i_257_))
				+ is[i_259_ + 1][i_260_ + 1] * i_257_)
			       >> class166.anInt2054 * -122333825);
			int i_263_ = (i_261_ * (class166.anInt2053 * 2039042417
						- i_258_) + i_262_ * i_258_
				      >> class166.anInt2054 * -122333825);
			((Class89_Sub3) this).anIntArray9685[i_254_]
			    = (((Class89_Sub3) this).anIntArray9685[i_254_]
			       + i_263_ - i_246_);
		    }
		    for (int i_264_ = ((Class89_Sub3) this).anInt9687;
			 i_264_ < ((Class89_Sub3) this).anInt9686; i_264_++) {
			int i_265_
			    = (((Class89_Sub3) this).anIntArray9670[i_264_]
			       + i_245_);
			int i_266_
			    = (((Class89_Sub3) this).anIntArray9684[i_264_]
			       + i_247_);
			int i_267_ = i_265_ & i_253_;
			int i_268_ = i_266_ & i_253_;
			int i_269_ = i_265_ >> class166.anInt2054 * -122333825;
			int i_270_ = i_266_ >> class166.anInt2054 * -122333825;
			if (i_269_ >= 0 && i_269_ < is.length - 1
			    && i_270_ >= 0 && i_270_ < is[0].length - 1) {
			    int i_271_ = (((is[i_269_][i_270_]
					    * (class166.anInt2053 * 2039042417
					       - i_267_))
					   + is[i_269_ + 1][i_270_] * i_267_)
					  >> class166.anInt2054 * -122333825);
			    int i_272_
				= (((is[i_269_][i_270_ + 1]
				     * (class166.anInt2053 * 2039042417
					- i_267_))
				    + is[i_269_ + 1][i_270_ + 1] * i_267_)
				   >> class166.anInt2054 * -122333825);
			    int i_273_
				= (i_271_ * (class166.anInt2053 * 2039042417
					     - i_268_) + i_272_ * i_268_
				   >> class166.anInt2054 * -122333825);
			    ((Class89_Sub3) this).anIntArray9685[i_264_]
				= (((Class89_Sub3) this).anIntArray9685[i_264_]
				   + i_273_ - i_246_);
			}
		    }
		} else if (i == 2) {
		    if (((Class89_Sub3) this).aShort9733 == 0)
			return;
		    int i_274_ = class166.anInt2053 * 2039042417 - 1;
		    for (int i_275_ = 0;
			 i_275_ < ((Class89_Sub3) this).anInt9687; i_275_++) {
			int i_276_
			    = ((((Class89_Sub3) this).anIntArray9685[i_275_]
				<< 16)
			       / ((Class89_Sub3) this).aShort9733);
			if (i_276_ < i_243_) {
			    int i_277_
				= (((Class89_Sub3) this).anIntArray9670[i_275_]
				   + i_245_);
			    int i_278_
				= (((Class89_Sub3) this).anIntArray9684[i_275_]
				   + i_247_);
			    int i_279_ = i_277_ & i_274_;
			    int i_280_ = i_278_ & i_274_;
			    int i_281_
				= i_277_ >> class166.anInt2054 * -122333825;
			    int i_282_
				= i_278_ >> class166.anInt2054 * -122333825;
			    int i_283_ = (((is[i_281_][i_282_]
					    * (class166.anInt2053 * 2039042417
					       - i_279_))
					   + is[i_281_ + 1][i_282_] * i_279_)
					  >> class166.anInt2054 * -122333825);
			    int i_284_
				= (((is[i_281_][i_282_ + 1]
				     * (class166.anInt2053 * 2039042417
					- i_279_))
				    + is[i_281_ + 1][i_282_ + 1] * i_279_)
				   >> class166.anInt2054 * -122333825);
			    int i_285_
				= (i_283_ * (class166.anInt2053 * 2039042417
					     - i_280_) + i_284_ * i_280_
				   >> class166.anInt2054 * -122333825);
			    ((Class89_Sub3) this).anIntArray9685[i_275_]
				= (((Class89_Sub3) this).anIntArray9685[i_275_]
				   + ((i_285_ - i_246_) * (i_243_ - i_276_)
				      / i_243_));
			} else
			    ((Class89_Sub3) this).anIntArray9685[i_275_]
				= ((Class89_Sub3) this).anIntArray9685[i_275_];
		    }
		    for (int i_286_ = ((Class89_Sub3) this).anInt9687;
			 i_286_ < ((Class89_Sub3) this).anInt9686; i_286_++) {
			int i_287_
			    = ((((Class89_Sub3) this).anIntArray9685[i_286_]
				<< 16)
			       / ((Class89_Sub3) this).aShort9733);
			if (i_287_ < i_243_) {
			    int i_288_
				= (((Class89_Sub3) this).anIntArray9670[i_286_]
				   + i_245_);
			    int i_289_
				= (((Class89_Sub3) this).anIntArray9684[i_286_]
				   + i_247_);
			    int i_290_ = i_288_ & i_274_;
			    int i_291_ = i_289_ & i_274_;
			    int i_292_
				= i_288_ >> class166.anInt2054 * -122333825;
			    int i_293_
				= i_289_ >> class166.anInt2054 * -122333825;
			    if (i_292_ >= 0
				&& i_292_ < class166.anInt2055 * 266270313 - 1
				&& i_293_ >= 0
				&& (i_293_
				    < class166.anInt2052 * -14610189 - 1)) {
				int i_294_
				    = (((is[i_292_][i_293_]
					 * (class166.anInt2053 * 2039042417
					    - i_290_))
					+ is[i_292_ + 1][i_293_] * i_290_)
				       >> class166.anInt2054 * -122333825);
				int i_295_
				    = (((is[i_292_][i_293_ + 1]
					 * (class166.anInt2053 * 2039042417
					    - i_290_))
					+ is[i_292_ + 1][i_293_ + 1] * i_290_)
				       >> class166.anInt2054 * -122333825);
				int i_296_
				    = ((i_294_
					* (class166.anInt2053 * 2039042417
					   - i_291_)) + i_295_ * i_291_
				       >> class166.anInt2054 * -122333825);
				((Class89_Sub3) this).anIntArray9685[i_286_]
				    = ((((Class89_Sub3) this).anIntArray9685
					[i_286_])
				       + ((i_296_ - i_246_) * (i_243_ - i_287_)
					  / i_243_));
			    }
			} else
			    ((Class89_Sub3) this).anIntArray9685[i_286_]
				= ((Class89_Sub3) this).anIntArray9685[i_286_];
		    }
		} else if (i == 3) {
		    int i_297_ = (i_243_ & 0xff) * 4;
		    int i_298_ = (i_243_ >> 8 & 0xff) * 4;
		    int i_299_ = (i_243_ >> 16 & 0xff) << 6;
		    int i_300_ = (i_243_ >> 24 & 0xff) << 6;
		    if (i_245_ - (i_297_ >> 1) < 0
			|| ((i_245_ + (i_297_ >> 1)
			     + class166.anInt2053 * 2039042417)
			    >= (class166.anInt2055 * 266270313
				<< class166.anInt2054 * -122333825))
			|| i_247_ - (i_298_ >> 1) < 0
			|| ((i_247_ + (i_298_ >> 1)
			     + class166.anInt2053 * 2039042417)
			    >= (class166.anInt2052 * -14610189
				<< class166.anInt2054 * -122333825)))
			return;
		    method2041(class166, i_245_, i_246_, i_247_, i_297_,
			       i_298_, i_299_, i_300_);
		} else if (i == 4) {
		    int i_301_ = class166_244_.anInt2053 * 2039042417 - 1;
		    int i_302_ = (((Class89_Sub3) this).aShort9734
				  - ((Class89_Sub3) this).aShort9733);
		    for (int i_303_ = 0;
			 i_303_ < ((Class89_Sub3) this).anInt9687; i_303_++) {
			int i_304_
			    = (((Class89_Sub3) this).anIntArray9670[i_303_]
			       + i_245_);
			int i_305_
			    = (((Class89_Sub3) this).anIntArray9684[i_303_]
			       + i_247_);
			int i_306_ = i_304_ & i_301_;
			int i_307_ = i_305_ & i_301_;
			int i_308_
			    = i_304_ >> class166_244_.anInt2054 * -122333825;
			int i_309_
			    = i_305_ >> class166_244_.anInt2054 * -122333825;
			int i_310_ = (((is_252_[i_308_][i_309_]
					* (class166_244_.anInt2053 * 2039042417
					   - i_306_))
				       + is_252_[i_308_ + 1][i_309_] * i_306_)
				      >> class166_244_.anInt2054 * -122333825);
			int i_311_
			    = (((is_252_[i_308_][i_309_ + 1]
				 * (class166_244_.anInt2053 * 2039042417
				    - i_306_))
				+ is_252_[i_308_ + 1][i_309_ + 1] * i_306_)
			       >> class166_244_.anInt2054 * -122333825);
			int i_312_
			    = (i_310_ * (class166_244_.anInt2053 * 2039042417
					 - i_307_) + i_311_ * i_307_
			       >> class166_244_.anInt2054 * -122333825);
			((Class89_Sub3) this).anIntArray9685[i_303_]
			    = (((Class89_Sub3) this).anIntArray9685[i_303_]
			       + (i_312_ - i_246_) + i_302_);
		    }
		    for (int i_313_ = ((Class89_Sub3) this).anInt9687;
			 i_313_ < ((Class89_Sub3) this).anInt9686; i_313_++) {
			int i_314_
			    = (((Class89_Sub3) this).anIntArray9670[i_313_]
			       + i_245_);
			int i_315_
			    = (((Class89_Sub3) this).anIntArray9684[i_313_]
			       + i_247_);
			int i_316_ = i_314_ & i_301_;
			int i_317_ = i_315_ & i_301_;
			int i_318_
			    = i_314_ >> class166_244_.anInt2054 * -122333825;
			int i_319_
			    = i_315_ >> class166_244_.anInt2054 * -122333825;
			if (i_318_ >= 0
			    && i_318_ < class166_244_.anInt2055 * 266270313 - 1
			    && i_319_ >= 0
			    && (i_319_
				< class166_244_.anInt2052 * -14610189 - 1)) {
			    int i_320_
				= (((is_252_[i_318_][i_319_]
				     * (class166_244_.anInt2053 * 2039042417
					- i_316_))
				    + is_252_[i_318_ + 1][i_319_] * i_316_)
				   >> class166_244_.anInt2054 * -122333825);
			    int i_321_
				= (((is_252_[i_318_][i_319_ + 1]
				     * (class166_244_.anInt2053 * 2039042417
					- i_316_))
				    + is_252_[i_318_ + 1][i_319_ + 1] * i_316_)
				   >> class166_244_.anInt2054 * -122333825);
			    int i_322_
				= ((i_320_
				    * (class166_244_.anInt2053 * 2039042417
				       - i_317_)) + i_321_ * i_317_
				   >> class166_244_.anInt2054 * -122333825);
			    ((Class89_Sub3) this).anIntArray9685[i_313_]
				= (((Class89_Sub3) this).anIntArray9685[i_313_]
				   + (i_322_ - i_246_) + i_302_);
			}
		    }
		} else if (i == 5) {
		    int i_323_ = class166_244_.anInt2053 * 2039042417 - 1;
		    int i_324_ = (((Class89_Sub3) this).aShort9734
				  - ((Class89_Sub3) this).aShort9733);
		    for (int i_325_ = 0;
			 i_325_ < ((Class89_Sub3) this).anInt9687; i_325_++) {
			int i_326_
			    = (((Class89_Sub3) this).anIntArray9670[i_325_]
			       + i_245_);
			int i_327_
			    = (((Class89_Sub3) this).anIntArray9684[i_325_]
			       + i_247_);
			int i_328_ = i_326_ & i_323_;
			int i_329_ = i_327_ & i_323_;
			int i_330_ = i_326_ >> class166.anInt2054 * -122333825;
			int i_331_ = i_327_ >> class166.anInt2054 * -122333825;
			int i_332_
			    = (((is[i_330_][i_331_]
				 * (class166.anInt2053 * 2039042417 - i_328_))
				+ is[i_330_ + 1][i_331_] * i_328_)
			       >> class166.anInt2054 * -122333825);
			int i_333_
			    = (((is[i_330_][i_331_ + 1]
				 * (class166.anInt2053 * 2039042417 - i_328_))
				+ is[i_330_ + 1][i_331_ + 1] * i_328_)
			       >> class166.anInt2054 * -122333825);
			int i_334_ = (i_332_ * (class166.anInt2053 * 2039042417
						- i_329_) + i_333_ * i_329_
				      >> class166.anInt2054 * -122333825);
			i_332_ = (((is_252_[i_330_][i_331_]
				    * (class166_244_.anInt2053 * 2039042417
				       - i_328_))
				   + is_252_[i_330_ + 1][i_331_] * i_328_)
				  >> class166_244_.anInt2054 * -122333825);
			i_333_ = (((is_252_[i_330_][i_331_ + 1]
				    * (class166_244_.anInt2053 * 2039042417
				       - i_328_))
				   + is_252_[i_330_ + 1][i_331_ + 1] * i_328_)
				  >> class166_244_.anInt2054 * -122333825);
			int i_335_
			    = (i_332_ * (class166_244_.anInt2053 * 2039042417
					 - i_329_) + i_333_ * i_329_
			       >> class166_244_.anInt2054 * -122333825);
			int i_336_ = i_334_ - i_335_ - i_243_;
			((Class89_Sub3) this).anIntArray9685[i_325_]
			    = ((((Class89_Sub3) this).anIntArray9685[i_325_]
				<< 8) / i_324_ * i_336_
			       >> 8) - (i_246_ - i_334_);
		    }
		    for (int i_337_ = ((Class89_Sub3) this).anInt9687;
			 i_337_ < ((Class89_Sub3) this).anInt9686; i_337_++) {
			int i_338_
			    = (((Class89_Sub3) this).anIntArray9670[i_337_]
			       + i_245_);
			int i_339_
			    = (((Class89_Sub3) this).anIntArray9684[i_337_]
			       + i_247_);
			int i_340_ = i_338_ & i_323_;
			int i_341_ = i_339_ & i_323_;
			int i_342_ = i_338_ >> class166.anInt2054 * -122333825;
			int i_343_ = i_339_ >> class166.anInt2054 * -122333825;
			if (i_342_ >= 0
			    && i_342_ < class166.anInt2055 * 266270313 - 1
			    && i_342_ < class166_244_.anInt2055 * 266270313 - 1
			    && i_343_ >= 0
			    && i_343_ < class166.anInt2052 * -14610189 - 1
			    && (i_343_
				< class166_244_.anInt2052 * -14610189 - 1)) {
			    int i_344_ = (((is[i_342_][i_343_]
					    * (class166.anInt2053 * 2039042417
					       - i_340_))
					   + is[i_342_ + 1][i_343_] * i_340_)
					  >> class166.anInt2054 * -122333825);
			    int i_345_
				= (((is[i_342_][i_343_ + 1]
				     * (class166.anInt2053 * 2039042417
					- i_340_))
				    + is[i_342_ + 1][i_343_ + 1] * i_340_)
				   >> class166.anInt2054 * -122333825);
			    int i_346_
				= (i_344_ * (class166.anInt2053 * 2039042417
					     - i_341_) + i_345_ * i_341_
				   >> class166.anInt2054 * -122333825);
			    i_344_ = (((is_252_[i_342_][i_343_]
					* (class166_244_.anInt2053 * 2039042417
					   - i_340_))
				       + is_252_[i_342_ + 1][i_343_] * i_340_)
				      >> class166_244_.anInt2054 * -122333825);
			    i_345_
				= (((is_252_[i_342_][i_343_ + 1]
				     * (class166_244_.anInt2053 * 2039042417
					- i_340_))
				    + is_252_[i_342_ + 1][i_343_ + 1] * i_340_)
				   >> class166_244_.anInt2054 * -122333825);
			    int i_347_
				= ((i_344_
				    * (class166_244_.anInt2053 * 2039042417
				       - i_341_)) + i_345_ * i_341_
				   >> class166_244_.anInt2054 * -122333825);
			    int i_348_ = i_346_ - i_347_ - i_243_;
			    ((Class89_Sub3) this).anIntArray9685[i_337_]
				= (((((Class89_Sub3) this).anIntArray9685
				     [i_337_])
				    << 8) / i_324_ * i_348_
				   >> 8) - (i_246_ - i_346_);
			}
		    }
		}
		((Class89_Sub3) this).aBool9730 = false;
	    }
	}
    }
    
    final void method16063(boolean bool, boolean bool_349_, boolean bool_350_,
			   int i) {
	int i_351_ = -1;
	if (((Class89_Sub3) this).aShortArray9712 != null
	    && ((Class89_Sub3) this).aShortArray9712[i] != -1)
	    i_351_ = (((Class89_Sub3) this).aClass103_Sub2_9690
			  .aClass107_1458.method2680
		      (((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
		       -1646076872)
		      .anInt1403) * 218388063;
	if (!((Class189) ((Class89_Sub3) this).aClass189_9671).aBool2217) {
	    short i_352_ = ((Class89_Sub3) this).aShortArray9696[i];
	    short i_353_ = ((Class89_Sub3) this).aShortArray9697[i];
	    short i_354_ = ((Class89_Sub3) this).aShortArray9698[i];
	    Class268 class268
		= (((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		   .aClass268_9261);
	    float f = class268.aFloatArray4353[10];
	    float f_355_ = class268.aFloatArray4353[14];
	    float f_356_ = class268.aFloatArray4353[11];
	    float f_357_ = class268.aFloatArray4353[15];
	    float f_358_ = f_355_ * f_356_ - f * f_357_;
	    float f_359_
		= ((((Class89_Sub3) this).aFloatArray9756[i_352_]
		    - (((Class189) ((Class89_Sub3) this).aClass189_9671)
		       .aFloat2243))
		   * (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2244));
	    float f_360_
		= ((((Class89_Sub3) this).aFloatArray9756[i_353_]
		    - (((Class189) ((Class89_Sub3) this).aClass189_9671)
		       .aFloat2243))
		   * (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2244));
	    float f_361_
		= ((((Class89_Sub3) this).aFloatArray9756[i_354_]
		    - (((Class189) ((Class89_Sub3) this).aClass189_9671)
		       .aFloat2243))
		   * (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2244));
	    float f_362_ = f_359_ * f_358_ / (f_359_ * f_356_ - f);
	    float f_363_ = f_360_ * f_358_ / (f_360_ * f_356_ - f);
	    float f_364_ = f_361_ * f_358_ / (f_361_ * f_356_ - f);
	    float f_365_
		= ((f_362_ - (((Class189) ((Class89_Sub3) this).aClass189_9671)
			      .aFloat2213))
		   / (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2214));
	    if (f_365_ > 1.0F)
		f_365_ = 1.0F;
	    else if (f_365_ < 0.0F)
		f_365_ = 0.0F;
	    float f_366_
		= ((f_363_ - (((Class189) ((Class89_Sub3) this).aClass189_9671)
			      .aFloat2213))
		   / (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2214));
	    if (f_366_ > 1.0F)
		f_366_ = 1.0F;
	    else if (f_366_ < 0.0F)
		f_366_ = 0.0F;
	    float f_367_
		= ((f_364_ - (((Class189) ((Class89_Sub3) this).aClass189_9671)
			      .aFloat2213))
		   / (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2214));
	    if (f_367_ > 1.0F)
		f_367_ = 1.0F;
	    else if (f_367_ < 0.0F)
		f_367_ = 0.0F;
	    float f_368_ = f_365_ + f_366_ + f_367_;
	    if (!(f_368_ >= 3.0F)) {
		if (f_368_ <= 0.0F)
		    method16073(bool, bool_349_, bool_350_, i);
		else {
		    if (((Class89_Sub3) this).aByteArray9711 == null)
			((Class155) ((Class89_Sub3) this).aClass155_9674)
			    .anInt1723
			    = 0;
		    else
			((Class155) ((Class89_Sub3) this).aClass155_9674)
			    .anInt1723
			    = ((Class89_Sub3) this).aByteArray9711[i] & 0xff;
		    if (i_351_ == -1) {
			if (((Class89_Sub3) this).anIntArray9704[i] == -1)
			    ((Class89_Sub3) this).aClass155_9674.method3385
				(bool, bool_349_, bool_350_,
				 ((Class89_Sub3) this).aFloatArray9746[i_352_],
				 ((Class89_Sub3) this).aFloatArray9746[i_353_],
				 ((Class89_Sub3) this).aFloatArray9746[i_354_],
				 ((Class89_Sub3) this).aFloatArray9745[i_352_],
				 ((Class89_Sub3) this).aFloatArray9745[i_353_],
				 ((Class89_Sub3) this).aFloatArray9745[i_354_],
				 ((Class89_Sub3) this).aFloatArray9756[i_352_],
				 ((Class89_Sub3) this).aFloatArray9756[i_353_],
				 ((Class89_Sub3) this).aFloatArray9756[i_354_],
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9710[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_365_ * 255.0F,
						    1372221625),
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9710[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_366_ * 255.0F,
						    1372221625),
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9710[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_367_ * 255.0F,
						    1372221625));
			else
			    ((Class89_Sub3) this).aClass155_9674.method3385
				(bool, bool_349_, bool_350_,
				 ((Class89_Sub3) this).aFloatArray9746[i_352_],
				 ((Class89_Sub3) this).aFloatArray9746[i_353_],
				 ((Class89_Sub3) this).aFloatArray9746[i_354_],
				 ((Class89_Sub3) this).aFloatArray9745[i_352_],
				 ((Class89_Sub3) this).aFloatArray9745[i_353_],
				 ((Class89_Sub3) this).aFloatArray9745[i_354_],
				 ((Class89_Sub3) this).aFloatArray9756[i_352_],
				 ((Class89_Sub3) this).aFloatArray9756[i_353_],
				 ((Class89_Sub3) this).aFloatArray9756[i_354_],
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9710[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_365_ * 255.0F,
						    1372221625),
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9747[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_366_ * 255.0F,
						    1372221625),
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9704[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_367_ * 255.0F,
						    1372221625));
		    } else {
			int i_369_ = -16777216;
			if (((Class89_Sub3) this).aByteArray9711 != null)
			    i_369_ = 255 - ((((Class89_Sub3) this)
					     .aByteArray9711[i])
					    & 0xff) << 24;
			if (((Class89_Sub3) this).anIntArray9704[i] == -1) {
			    int i_370_
				= (i_369_
				   | (((Class89_Sub3) this).anIntArray9710[i]
				      & 0xffffff));
			    ((Class89_Sub3) this).aClass155_9674.method3384
				(bool, bool_349_, bool_350_,
				 ((Class89_Sub3) this).aFloatArray9746[i_352_],
				 ((Class89_Sub3) this).aFloatArray9746[i_353_],
				 ((Class89_Sub3) this).aFloatArray9746[i_354_],
				 ((Class89_Sub3) this).aFloatArray9745[i_352_],
				 ((Class89_Sub3) this).aFloatArray9745[i_353_],
				 ((Class89_Sub3) this).aFloatArray9745[i_354_],
				 ((Class89_Sub3) this).aFloatArray9756[i_352_],
				 ((Class89_Sub3) this).aFloatArray9756[i_353_],
				 ((Class89_Sub3) this).aFloatArray9756[i_354_],
				 ((Class89_Sub3) this).aFloatArray9700[i_352_],
				 ((Class89_Sub3) this).aFloatArray9700[i_353_],
				 ((Class89_Sub3) this).aFloatArray9700[i_354_],
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [0]),
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [1]),
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [2]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [0]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [1]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [2]),
				 i_370_, i_370_, i_370_,
				 (((Class189) (((Class89_Sub3) this)
					       .aClass189_9671)).anInt2215
				  * -338296791),
				 f_365_ * 255.0F, f_366_ * 255.0F,
				 f_367_ * 255.0F,
				 (((Class89_Sub3) this).aShortArray9712[i]
				  & 0xffff),
				 i_351_);
			} else
			    ((Class89_Sub3) this).aClass155_9674.method3384
				(bool, bool_349_, bool_350_,
				 ((Class89_Sub3) this).aFloatArray9746[i_352_],
				 ((Class89_Sub3) this).aFloatArray9746[i_353_],
				 ((Class89_Sub3) this).aFloatArray9746[i_354_],
				 ((Class89_Sub3) this).aFloatArray9745[i_352_],
				 ((Class89_Sub3) this).aFloatArray9745[i_353_],
				 ((Class89_Sub3) this).aFloatArray9745[i_354_],
				 ((Class89_Sub3) this).aFloatArray9756[i_352_],
				 ((Class89_Sub3) this).aFloatArray9756[i_353_],
				 ((Class89_Sub3) this).aFloatArray9756[i_354_],
				 ((Class89_Sub3) this).aFloatArray9700[i_352_],
				 ((Class89_Sub3) this).aFloatArray9700[i_353_],
				 ((Class89_Sub3) this).aFloatArray9700[i_354_],
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [0]),
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [1]),
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [2]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [0]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [1]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [2]),
				 i_369_ | (((Class89_Sub3) this).anIntArray9710
					   [i]) & 0xffffff,
				 i_369_ | (((Class89_Sub3) this).anIntArray9747
					   [i]) & 0xffffff,
				 i_369_ | (((Class89_Sub3) this).anIntArray9704
					   [i]) & 0xffffff,
				 (((Class189) (((Class89_Sub3) this)
					       .aClass189_9671)).anInt2215
				  * -338296791),
				 f_365_ * 255.0F, f_366_ * 255.0F,
				 f_367_ * 255.0F,
				 (((Class89_Sub3) this).aShortArray9712[i]
				  & 0xffff),
				 i_351_);
		    }
		}
	    }
	} else {
	    short i_371_ = ((Class89_Sub3) this).aShortArray9696[i];
	    short i_372_ = ((Class89_Sub3) this).aShortArray9697[i];
	    short i_373_ = ((Class89_Sub3) this).aShortArray9698[i];
	    float f = 0.0F;
	    float f_374_ = 0.0F;
	    float f_375_ = 0.0F;
	    if (((Class89_Sub3) this).anIntArray9729[i_371_]
		> (((Class189) ((Class89_Sub3) this).aClass189_9671).anInt2230
		   * 2144219087))
		f = 1.0F;
	    else if (((Class89_Sub3) this).anIntArray9729[i_371_]
		     > (((Class189) ((Class89_Sub3) this).aClass189_9671)
			.anInt2218) * -1285418291)
		f = ((float) ((((Class189)
				((Class89_Sub3) this).aClass189_9671).anInt2218
			       * -1285418291)
			      - ((Class89_Sub3) this).anIntArray9729[i_371_])
		     * 1.0F
		     / (float) ((((Class189) (((Class89_Sub3) this)
					      .aClass189_9671)).anInt2218
				 * -1285418291)
				- (((Class189) (((Class89_Sub3) this)
						.aClass189_9671)).anInt2230
				   * 2144219087)));
	    if (((Class89_Sub3) this).anIntArray9729[i_372_]
		> (((Class189) ((Class89_Sub3) this).aClass189_9671).anInt2230
		   * 2144219087))
		f_374_ = 1.0F;
	    else if (((Class89_Sub3) this).anIntArray9729[i_372_]
		     > (((Class189) ((Class89_Sub3) this).aClass189_9671)
			.anInt2218) * -1285418291)
		f_374_
		    = ((float) ((((Class189) (((Class89_Sub3) this)
					      .aClass189_9671)).anInt2218
				 * -1285418291)
				- ((Class89_Sub3) this).anIntArray9729[i_372_])
		       * 1.0F
		       / (float) ((((Class189) (((Class89_Sub3) this)
						.aClass189_9671)).anInt2218
				   * -1285418291)
				  - (((Class189) (((Class89_Sub3) this)
						  .aClass189_9671)).anInt2230
				     * 2144219087)));
	    if (((Class89_Sub3) this).anIntArray9729[i_373_]
		> (((Class189) ((Class89_Sub3) this).aClass189_9671).anInt2230
		   * 2144219087))
		f_375_ = 1.0F;
	    else if (((Class89_Sub3) this).anIntArray9729[i_373_]
		     > (((Class189) ((Class89_Sub3) this).aClass189_9671)
			.anInt2218) * -1285418291)
		f_375_
		    = ((float) ((((Class189) (((Class89_Sub3) this)
					      .aClass189_9671)).anInt2218
				 * -1285418291)
				- ((Class89_Sub3) this).anIntArray9729[i_373_])
		       * 1.0F
		       / (float) ((((Class189) (((Class89_Sub3) this)
						.aClass189_9671)).anInt2218
				   * -1285418291)
				  - (((Class189) (((Class89_Sub3) this)
						  .aClass189_9671)).anInt2230
				     * 2144219087)));
	    if (((Class89_Sub3) this).aByteArray9711 == null)
		((Class155) ((Class89_Sub3) this).aClass155_9674).anInt1723
		    = 0;
	    else
		((Class155) ((Class89_Sub3) this).aClass155_9674).anInt1723
		    = ((Class89_Sub3) this).aByteArray9711[i] & 0xff;
	    if (i_351_ == -1) {
		if (((Class89_Sub3) this).anIntArray9704[i] == -1)
		    ((Class89_Sub3) this).aClass155_9674.method3385
			(bool, bool_349_, bool_350_,
			 ((Class89_Sub3) this).aFloatArray9746[i_371_],
			 ((Class89_Sub3) this).aFloatArray9746[i_372_],
			 ((Class89_Sub3) this).aFloatArray9746[i_373_],
			 ((Class89_Sub3) this).aFloatArray9745[i_371_],
			 ((Class89_Sub3) this).aFloatArray9745[i_372_],
			 ((Class89_Sub3) this).aFloatArray9745[i_373_],
			 ((Class89_Sub3) this).aFloatArray9756[i_371_],
			 ((Class89_Sub3) this).aFloatArray9756[i_372_],
			 ((Class89_Sub3) this).aFloatArray9756[i_373_],
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9710[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f * 255.0F, 1372221625),
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9710[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f_374_ * 255.0F, 1372221625),
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9710[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f_375_ * 255.0F, 1372221625));
		else
		    ((Class89_Sub3) this).aClass155_9674.method3385
			(bool, bool_349_, bool_350_,
			 ((Class89_Sub3) this).aFloatArray9746[i_371_],
			 ((Class89_Sub3) this).aFloatArray9746[i_372_],
			 ((Class89_Sub3) this).aFloatArray9746[i_373_],
			 ((Class89_Sub3) this).aFloatArray9745[i_371_],
			 ((Class89_Sub3) this).aFloatArray9745[i_372_],
			 ((Class89_Sub3) this).aFloatArray9745[i_373_],
			 ((Class89_Sub3) this).aFloatArray9756[i_371_],
			 ((Class89_Sub3) this).aFloatArray9756[i_372_],
			 ((Class89_Sub3) this).aFloatArray9756[i_373_],
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9710[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f * 255.0F, 1372221625),
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9747[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f_374_ * 255.0F, 1372221625),
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9704[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f_375_ * 255.0F, 1372221625));
	    } else {
		int i_376_ = -16777216;
		if (((Class89_Sub3) this).aByteArray9711 != null)
		    i_376_ = 255 - (((Class89_Sub3) this).aByteArray9711[i]
				    & 0xff) << 24;
		if (((Class89_Sub3) this).anIntArray9704[i] == -1) {
		    int i_377_
			= i_376_ | (((Class89_Sub3) this).anIntArray9710[i]
				    & 0xffffff);
		    ((Class89_Sub3) this).aClass155_9674.method3384
			(bool, bool_349_, bool_350_,
			 ((Class89_Sub3) this).aFloatArray9746[i_371_],
			 ((Class89_Sub3) this).aFloatArray9746[i_372_],
			 ((Class89_Sub3) this).aFloatArray9746[i_373_],
			 ((Class89_Sub3) this).aFloatArray9745[i_371_],
			 ((Class89_Sub3) this).aFloatArray9745[i_372_],
			 ((Class89_Sub3) this).aFloatArray9745[i_373_],
			 ((Class89_Sub3) this).aFloatArray9756[i_371_],
			 ((Class89_Sub3) this).aFloatArray9756[i_372_],
			 ((Class89_Sub3) this).aFloatArray9756[i_373_],
			 ((Class89_Sub3) this).aFloatArray9700[i_371_],
			 ((Class89_Sub3) this).aFloatArray9700[i_372_],
			 ((Class89_Sub3) this).aFloatArray9700[i_373_],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][0],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][1],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][2],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][0],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][1],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][2],
			 i_377_, i_377_, i_377_,
			 (((Class189) ((Class89_Sub3) this).aClass189_9671)
			  .anInt2215) * -338296791,
			 f * 255.0F, f_374_ * 255.0F, f_375_ * 255.0F,
			 ((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
			 i_351_);
		} else
		    ((Class89_Sub3) this).aClass155_9674.method3384
			(bool, bool_349_, bool_350_,
			 ((Class89_Sub3) this).aFloatArray9746[i_371_],
			 ((Class89_Sub3) this).aFloatArray9746[i_372_],
			 ((Class89_Sub3) this).aFloatArray9746[i_373_],
			 ((Class89_Sub3) this).aFloatArray9745[i_371_],
			 ((Class89_Sub3) this).aFloatArray9745[i_372_],
			 ((Class89_Sub3) this).aFloatArray9745[i_373_],
			 ((Class89_Sub3) this).aFloatArray9756[i_371_],
			 ((Class89_Sub3) this).aFloatArray9756[i_372_],
			 ((Class89_Sub3) this).aFloatArray9756[i_373_],
			 ((Class89_Sub3) this).aFloatArray9700[i_371_],
			 ((Class89_Sub3) this).aFloatArray9700[i_372_],
			 ((Class89_Sub3) this).aFloatArray9700[i_373_],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][0],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][1],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][2],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][0],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][1],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][2],
			 i_376_ | (((Class89_Sub3) this).anIntArray9710[i]
				   & 0xffffff),
			 i_376_ | (((Class89_Sub3) this).anIntArray9747[i]
				   & 0xffffff),
			 i_376_ | (((Class89_Sub3) this).anIntArray9704[i]
				   & 0xffffff),
			 (((Class189) ((Class89_Sub3) this).aClass189_9671)
			  .anInt2215) * -338296791,
			 f * 255.0F, f_374_ * 255.0F, f_375_ * 255.0F,
			 ((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
			 i_351_);
	    }
	}
    }
    
    void method1877() {
	if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
	     .anInt9274) * 592623211
	    > 1) {
	    synchronized (this) {
		while (aBool1298) {
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		aBool1298 = true;
	    }
	}
    }
    
    public Class89 method1886(byte i, int i_378_, boolean bool) {
	method16050(Thread.currentThread());
	boolean bool_379_ = false;
	Class89_Sub3 class89_sub3_380_;
	Class89_Sub3 class89_sub3_381_;
	if (i > 0 && i <= 8) {
	    class89_sub3_381_
		= ((Class89_Sub3) this).aClass89_Sub3Array9742[i - 1];
	    class89_sub3_380_
		= ((Class89_Sub3) this).aClass89_Sub3Array9755[i - 1];
	    bool_379_ = true;
	} else
	    class89_sub3_380_ = class89_sub3_381_
		= new Class89_Sub3(((Class89_Sub3) this).aClass103_Sub2_9690);
	return method16057(class89_sub3_380_, class89_sub3_381_, i_378_,
			   bool_379_, bool);
    }
    
    public int method1905() {
	return ((Class89_Sub3) this).anInt9707;
    }
    
    final boolean method16064(int i) {
	if (((Class89_Sub3) this).anIntArray9675 == null)
	    return false;
	if (((Class89_Sub3) this).anIntArray9675[i] == -1)
	    return false;
	return true;
    }
    
    void method2002(int i, int[] is, int i_382_, int i_383_, int i_384_,
		    int i_385_, boolean bool) {
	int i_386_ = is.length;
	if (i == 0) {
	    i_382_ <<= 4;
	    i_383_ <<= 4;
	    i_384_ <<= 4;
	    if (!((Class89_Sub3) this).aBool9719) {
		for (int i_387_ = 0; i_387_ < ((Class89_Sub3) this).anInt9686;
		     i_387_++) {
		    ((Class89_Sub3) this).anIntArray9670[i_387_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9685[i_387_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9684[i_387_] <<= 4;
		}
		((Class89_Sub3) this).aBool9719 = true;
	    }
	    int i_388_ = 0;
	    ((Class89_Sub3) this).anInt9717 = 0;
	    ((Class89_Sub3) this).anInt9721 = 0;
	    ((Class89_Sub3) this).anInt9722 = 0;
	    for (int i_389_ = 0; i_389_ < i_386_; i_389_++) {
		int i_390_ = is[i_389_];
		if (i_390_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_391_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_390_];
		    for (int i_392_ = 0; i_392_ < is_391_.length; i_392_++) {
			int i_393_ = is_391_[i_392_];
			((Class89_Sub3) this).anInt9717
			    += ((Class89_Sub3) this).anIntArray9670[i_393_];
			((Class89_Sub3) this).anInt9721
			    += ((Class89_Sub3) this).anIntArray9685[i_393_];
			((Class89_Sub3) this).anInt9722
			    += ((Class89_Sub3) this).anIntArray9684[i_393_];
			i_388_++;
		    }
		}
	    }
	    if (i_388_ > 0) {
		((Class89_Sub3) this).anInt9717
		    = ((Class89_Sub3) this).anInt9717 / i_388_ + i_382_;
		((Class89_Sub3) this).anInt9721
		    = ((Class89_Sub3) this).anInt9721 / i_388_ + i_383_;
		((Class89_Sub3) this).anInt9722
		    = ((Class89_Sub3) this).anInt9722 / i_388_ + i_384_;
	    } else {
		((Class89_Sub3) this).anInt9717 = i_382_;
		((Class89_Sub3) this).anInt9721 = i_383_;
		((Class89_Sub3) this).anInt9722 = i_384_;
	    }
	} else if (i == 1) {
	    i_382_ <<= 4;
	    i_383_ <<= 4;
	    i_384_ <<= 4;
	    if (!((Class89_Sub3) this).aBool9719) {
		for (int i_394_ = 0; i_394_ < ((Class89_Sub3) this).anInt9686;
		     i_394_++) {
		    ((Class89_Sub3) this).anIntArray9670[i_394_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9685[i_394_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9684[i_394_] <<= 4;
		}
		((Class89_Sub3) this).aBool9719 = true;
	    }
	    for (int i_395_ = 0; i_395_ < i_386_; i_395_++) {
		int i_396_ = is[i_395_];
		if (i_396_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_397_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_396_];
		    for (int i_398_ = 0; i_398_ < is_397_.length; i_398_++) {
			int i_399_ = is_397_[i_398_];
			((Class89_Sub3) this).anIntArray9670[i_399_] += i_382_;
			((Class89_Sub3) this).anIntArray9685[i_399_] += i_383_;
			((Class89_Sub3) this).anIntArray9684[i_399_] += i_384_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_400_ = 0; i_400_ < i_386_; i_400_++) {
		int i_401_ = is[i_400_];
		if (i_401_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_402_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_401_];
		    if ((i_385_ & 0x1) == 0) {
			for (int i_403_ = 0; i_403_ < is_402_.length;
			     i_403_++) {
			    int i_404_ = is_402_[i_403_];
			    ((Class89_Sub3) this).anIntArray9670[i_404_]
				-= ((Class89_Sub3) this).anInt9717;
			    ((Class89_Sub3) this).anIntArray9685[i_404_]
				-= ((Class89_Sub3) this).anInt9721;
			    ((Class89_Sub3) this).anIntArray9684[i_404_]
				-= ((Class89_Sub3) this).anInt9722;
			    if (i_384_ != 0) {
				int i_405_ = Class282.anIntArray4430[i_384_];
				int i_406_ = Class282.anIntArray4441[i_384_];
				int i_407_
				    = (((((Class89_Sub3) this).anIntArray9685
					 [i_404_]) * i_405_
					+ (((Class89_Sub3) this).anIntArray9670
					   [i_404_]) * i_406_
					+ 16383)
				       >> 14);
				((Class89_Sub3) this).anIntArray9685[i_404_]
				    = ((((Class89_Sub3) this).anIntArray9685
					[i_404_]) * i_406_
				       - (((Class89_Sub3) this).anIntArray9670
					  [i_404_]) * i_405_
				       + 16383) >> 14;
				((Class89_Sub3) this).anIntArray9670[i_404_]
				    = i_407_;
			    }
			    if (i_382_ != 0) {
				int i_408_ = Class282.anIntArray4430[i_382_];
				int i_409_ = Class282.anIntArray4441[i_382_];
				int i_410_
				    = (((((Class89_Sub3) this).anIntArray9685
					 [i_404_]) * i_409_
					- (((Class89_Sub3) this).anIntArray9684
					   [i_404_]) * i_408_
					+ 16383)
				       >> 14);
				((Class89_Sub3) this).anIntArray9684[i_404_]
				    = ((((Class89_Sub3) this).anIntArray9685
					[i_404_]) * i_408_
				       + (((Class89_Sub3) this).anIntArray9684
					  [i_404_]) * i_409_
				       + 16383) >> 14;
				((Class89_Sub3) this).anIntArray9685[i_404_]
				    = i_410_;
			    }
			    if (i_383_ != 0) {
				int i_411_ = Class282.anIntArray4430[i_383_];
				int i_412_ = Class282.anIntArray4441[i_383_];
				int i_413_
				    = (((((Class89_Sub3) this).anIntArray9684
					 [i_404_]) * i_411_
					+ (((Class89_Sub3) this).anIntArray9670
					   [i_404_]) * i_412_
					+ 16383)
				       >> 14);
				((Class89_Sub3) this).anIntArray9684[i_404_]
				    = ((((Class89_Sub3) this).anIntArray9684
					[i_404_]) * i_412_
				       - (((Class89_Sub3) this).anIntArray9670
					  [i_404_]) * i_411_
				       + 16383) >> 14;
				((Class89_Sub3) this).anIntArray9670[i_404_]
				    = i_413_;
			    }
			    ((Class89_Sub3) this).anIntArray9670[i_404_]
				+= ((Class89_Sub3) this).anInt9717;
			    ((Class89_Sub3) this).anIntArray9685[i_404_]
				+= ((Class89_Sub3) this).anInt9721;
			    ((Class89_Sub3) this).anIntArray9684[i_404_]
				+= ((Class89_Sub3) this).anInt9722;
			}
		    } else {
			for (int i_414_ = 0; i_414_ < is_402_.length;
			     i_414_++) {
			    int i_415_ = is_402_[i_414_];
			    ((Class89_Sub3) this).anIntArray9670[i_415_]
				-= ((Class89_Sub3) this).anInt9717;
			    ((Class89_Sub3) this).anIntArray9685[i_415_]
				-= ((Class89_Sub3) this).anInt9721;
			    ((Class89_Sub3) this).anIntArray9684[i_415_]
				-= ((Class89_Sub3) this).anInt9722;
			    if (i_382_ != 0) {
				int i_416_ = Class282.anIntArray4430[i_382_];
				int i_417_ = Class282.anIntArray4441[i_382_];
				int i_418_
				    = (((((Class89_Sub3) this).anIntArray9685
					 [i_415_]) * i_417_
					- (((Class89_Sub3) this).anIntArray9684
					   [i_415_]) * i_416_
					+ 16383)
				       >> 14);
				((Class89_Sub3) this).anIntArray9684[i_415_]
				    = ((((Class89_Sub3) this).anIntArray9685
					[i_415_]) * i_416_
				       + (((Class89_Sub3) this).anIntArray9684
					  [i_415_]) * i_417_
				       + 16383) >> 14;
				((Class89_Sub3) this).anIntArray9685[i_415_]
				    = i_418_;
			    }
			    if (i_384_ != 0) {
				int i_419_ = Class282.anIntArray4430[i_384_];
				int i_420_ = Class282.anIntArray4441[i_384_];
				int i_421_
				    = (((((Class89_Sub3) this).anIntArray9685
					 [i_415_]) * i_419_
					+ (((Class89_Sub3) this).anIntArray9670
					   [i_415_]) * i_420_
					+ 16383)
				       >> 14);
				((Class89_Sub3) this).anIntArray9685[i_415_]
				    = ((((Class89_Sub3) this).anIntArray9685
					[i_415_]) * i_420_
				       - (((Class89_Sub3) this).anIntArray9670
					  [i_415_]) * i_419_
				       + 16383) >> 14;
				((Class89_Sub3) this).anIntArray9670[i_415_]
				    = i_421_;
			    }
			    if (i_383_ != 0) {
				int i_422_ = Class282.anIntArray4430[i_383_];
				int i_423_ = Class282.anIntArray4441[i_383_];
				int i_424_
				    = (((((Class89_Sub3) this).anIntArray9684
					 [i_415_]) * i_422_
					+ (((Class89_Sub3) this).anIntArray9670
					   [i_415_]) * i_423_
					+ 16383)
				       >> 14);
				((Class89_Sub3) this).anIntArray9684[i_415_]
				    = ((((Class89_Sub3) this).anIntArray9684
					[i_415_]) * i_423_
				       - (((Class89_Sub3) this).anIntArray9670
					  [i_415_]) * i_422_
				       + 16383) >> 14;
				((Class89_Sub3) this).anIntArray9670[i_415_]
				    = i_424_;
			    }
			    ((Class89_Sub3) this).anIntArray9670[i_415_]
				+= ((Class89_Sub3) this).anInt9717;
			    ((Class89_Sub3) this).anIntArray9685[i_415_]
				+= ((Class89_Sub3) this).anInt9721;
			    ((Class89_Sub3) this).anIntArray9684[i_415_]
				+= ((Class89_Sub3) this).anInt9722;
			}
		    }
		}
	    }
	} else if (i == 3) {
	    for (int i_425_ = 0; i_425_ < i_386_; i_425_++) {
		int i_426_ = is[i_425_];
		if (i_426_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_427_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_426_];
		    for (int i_428_ = 0; i_428_ < is_427_.length; i_428_++) {
			int i_429_ = is_427_[i_428_];
			((Class89_Sub3) this).anIntArray9670[i_429_]
			    -= ((Class89_Sub3) this).anInt9717;
			((Class89_Sub3) this).anIntArray9685[i_429_]
			    -= ((Class89_Sub3) this).anInt9721;
			((Class89_Sub3) this).anIntArray9684[i_429_]
			    -= ((Class89_Sub3) this).anInt9722;
			((Class89_Sub3) this).anIntArray9670[i_429_]
			    = (((Class89_Sub3) this).anIntArray9670[i_429_]
			       * i_382_ / 128);
			((Class89_Sub3) this).anIntArray9685[i_429_]
			    = (((Class89_Sub3) this).anIntArray9685[i_429_]
			       * i_383_ / 128);
			((Class89_Sub3) this).anIntArray9684[i_429_]
			    = (((Class89_Sub3) this).anIntArray9684[i_429_]
			       * i_384_ / 128);
			((Class89_Sub3) this).anIntArray9670[i_429_]
			    += ((Class89_Sub3) this).anInt9717;
			((Class89_Sub3) this).anIntArray9685[i_429_]
			    += ((Class89_Sub3) this).anInt9721;
			((Class89_Sub3) this).anIntArray9684[i_429_]
			    += ((Class89_Sub3) this).anInt9722;
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub3) this).anIntArrayArray9678 != null
		&& ((Class89_Sub3) this).aByteArray9711 != null) {
		for (int i_430_ = 0; i_430_ < i_386_; i_430_++) {
		    int i_431_ = is[i_430_];
		    if (i_431_
			< ((Class89_Sub3) this).anIntArrayArray9678.length) {
			int[] is_432_ = (((Class89_Sub3) this)
					 .anIntArrayArray9678[i_431_]);
			for (int i_433_ = 0; i_433_ < is_432_.length;
			     i_433_++) {
			    int i_434_ = is_432_[i_433_];
			    int i_435_
				= (((Class89_Sub3) this).aByteArray9711[i_434_]
				   & 0xff) + i_382_ * 8;
			    if (i_435_ < 0)
				i_435_ = 0;
			    else if (i_435_ > 255)
				i_435_ = 255;
			    ((Class89_Sub3) this).aByteArray9711[i_434_]
				= (byte) i_435_;
			}
		    }
		}
		if (((Class89_Sub3) this).aClass187Array9727 != null) {
		    for (int i_436_ = 0;
			 i_436_ < ((Class89_Sub3) this).anInt9726; i_436_++) {
			Class187 class187
			    = ((Class89_Sub3) this).aClass187Array9727[i_436_];
			Class203 class203
			    = ((Class89_Sub3) this).aClass203Array9728[i_436_];
			((Class203) class203).anInt2417
			    = ((((Class203) class203).anInt2417 * -1473589757
				& 0xffffff)
			       | 255 - ((((Class89_Sub3) this).aByteArray9711
					 [(((Class187) class187).anInt2195
					   * 1571719645)])
					& 0xff) << 24) * 376097963;
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub3) this).anIntArrayArray9678 != null) {
		for (int i_437_ = 0; i_437_ < i_386_; i_437_++) {
		    int i_438_ = is[i_437_];
		    if (i_438_
			< ((Class89_Sub3) this).anIntArrayArray9678.length) {
			int[] is_439_ = (((Class89_Sub3) this)
					 .anIntArrayArray9678[i_438_]);
			for (int i_440_ = 0; i_440_ < is_439_.length;
			     i_440_++) {
			    int i_441_ = is_439_[i_440_];
			    int i_442_ = ((((Class89_Sub3) this)
					   .aShortArray9713[i_441_])
					  & 0xffff);
			    int i_443_ = i_442_ >> 10 & 0x3f;
			    int i_444_ = i_442_ >> 7 & 0x7;
			    int i_445_ = i_442_ & 0x7f;
			    i_443_ = i_443_ + i_382_ & 0x3f;
			    i_444_ += i_383_;
			    if (i_444_ < 0)
				i_444_ = 0;
			    else if (i_444_ > 7)
				i_444_ = 7;
			    i_445_ += i_384_;
			    if (i_445_ < 0)
				i_445_ = 0;
			    else if (i_445_ > 127)
				i_445_ = 127;
			    ((Class89_Sub3) this).aShortArray9713[i_441_]
				= (short) (i_443_ << 10 | i_444_ << 7
					   | i_445_);
			}
			((Class89_Sub3) this).aBool9718 = true;
		    }
		}
		if (((Class89_Sub3) this).aClass187Array9727 != null) {
		    for (int i_446_ = 0;
			 i_446_ < ((Class89_Sub3) this).anInt9726; i_446_++) {
			Class187 class187
			    = ((Class89_Sub3) this).aClass187Array9727[i_446_];
			Class203 class203
			    = ((Class89_Sub3) this).aClass203Array9728[i_446_];
			((Class203) class203).anInt2417
			    = (((((Class203) class203).anInt2417 * -1473589757
				 & ~0xffffff)
				| (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     ((((Class89_Sub3) this).aShortArray9713
				       [(((Class187) class187).anInt2195
					 * 1571719645)]) & 0xffff,
				      1238246120)) & 0xffff]) & 0xffffff)
			       * 376097963);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_447_ = 0; i_447_ < i_386_; i_447_++) {
		    int i_448_ = is[i_447_];
		    if (i_448_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_449_ = (((Class89_Sub3) this)
					 .anIntArrayArray9672[i_448_]);
			for (int i_450_ = 0; i_450_ < is_449_.length;
			     i_450_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_449_[i_450_]]);
			    ((Class203) class203).anInt2423
				+= i_382_ * -378944915;
			    ((Class203) class203).anInt2418
				+= i_383_ * 830599387;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_451_ = 0; i_451_ < i_386_; i_451_++) {
		    int i_452_ = is[i_451_];
		    if (i_452_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_453_ = (((Class89_Sub3) this)
					 .anIntArrayArray9672[i_452_]);
			for (int i_454_ = 0; i_454_ < is_453_.length;
			     i_454_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_453_[i_454_]]);
			    ((Class203) class203).aFloat2415
				= (((Class203) class203).aFloat2415
				   * (float) i_382_ / 128.0F);
			    ((Class203) class203).aFloat2416
				= (((Class203) class203).aFloat2416
				   * (float) i_383_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_455_ = 0; i_455_ < i_386_; i_455_++) {
		    int i_456_ = is[i_455_];
		    if (i_456_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_457_ = (((Class89_Sub3) this)
					 .anIntArrayArray9672[i_456_]);
			for (int i_458_ = 0; i_458_ < is_457_.length;
			     i_458_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_457_[i_458_]]);
			    ((Class203) class203).anInt2424
				= ((((Class203) class203).anInt2424 * 360392329
				    + i_382_)
				   & 0x3fff) * 318648249;
			}
		    }
		}
	    }
	}
    }
    
    void method16065() {
	((Class89_Sub3) this).aClass204Array9692 = null;
	((Class89_Sub3) this).aClass204Array9744 = null;
	((Class89_Sub3) this).aClass188Array9708 = null;
	((Class89_Sub3) this).aBool9730 = false;
    }
    
    void method1887(int i, int i_459_, int i_460_, int i_461_) {
	if (i == 0) {
	    int i_462_ = 0;
	    ((Class89_Sub3) this).anInt9717 = 0;
	    ((Class89_Sub3) this).anInt9721 = 0;
	    ((Class89_Sub3) this).anInt9722 = 0;
	    for (int i_463_ = 0; i_463_ < ((Class89_Sub3) this).anInt9686;
		 i_463_++) {
		((Class89_Sub3) this).anInt9717
		    += ((Class89_Sub3) this).anIntArray9670[i_463_];
		((Class89_Sub3) this).anInt9721
		    += ((Class89_Sub3) this).anIntArray9685[i_463_];
		((Class89_Sub3) this).anInt9722
		    += ((Class89_Sub3) this).anIntArray9684[i_463_];
		i_462_++;
	    }
	    if (i_462_ > 0) {
		((Class89_Sub3) this).anInt9717
		    = ((Class89_Sub3) this).anInt9717 / i_462_ + i_459_;
		((Class89_Sub3) this).anInt9721
		    = ((Class89_Sub3) this).anInt9721 / i_462_ + i_460_;
		((Class89_Sub3) this).anInt9722
		    = ((Class89_Sub3) this).anInt9722 / i_462_ + i_461_;
	    } else {
		((Class89_Sub3) this).anInt9717 = i_459_;
		((Class89_Sub3) this).anInt9721 = i_460_;
		((Class89_Sub3) this).anInt9722 = i_461_;
	    }
	} else if (i == 1) {
	    for (int i_464_ = 0; i_464_ < ((Class89_Sub3) this).anInt9686;
		 i_464_++) {
		((Class89_Sub3) this).anIntArray9670[i_464_] += i_459_;
		((Class89_Sub3) this).anIntArray9685[i_464_] += i_460_;
		((Class89_Sub3) this).anIntArray9684[i_464_] += i_461_;
	    }
	} else if (i == 2) {
	    for (int i_465_ = 0; i_465_ < ((Class89_Sub3) this).anInt9686;
		 i_465_++) {
		((Class89_Sub3) this).anIntArray9670[i_465_]
		    -= ((Class89_Sub3) this).anInt9717;
		((Class89_Sub3) this).anIntArray9685[i_465_]
		    -= ((Class89_Sub3) this).anInt9721;
		((Class89_Sub3) this).anIntArray9684[i_465_]
		    -= ((Class89_Sub3) this).anInt9722;
		if (i_461_ != 0) {
		    int i_466_ = Class282.anIntArray4430[i_461_];
		    int i_467_ = Class282.anIntArray4441[i_461_];
		    int i_468_
			= (((((Class89_Sub3) this).anIntArray9685[i_465_]
			     * i_466_)
			    + (((Class89_Sub3) this).anIntArray9670[i_465_]
			       * i_467_)
			    + 16383)
			   >> 14);
		    ((Class89_Sub3) this).anIntArray9685[i_465_]
			= ((((Class89_Sub3) this).anIntArray9685[i_465_]
			    * i_467_)
			   - (((Class89_Sub3) this).anIntArray9670[i_465_]
			      * i_466_)
			   + 16383) >> 14;
		    ((Class89_Sub3) this).anIntArray9670[i_465_] = i_468_;
		}
		if (i_459_ != 0) {
		    int i_469_ = Class282.anIntArray4430[i_459_];
		    int i_470_ = Class282.anIntArray4441[i_459_];
		    int i_471_
			= (((((Class89_Sub3) this).anIntArray9685[i_465_]
			     * i_470_)
			    - (((Class89_Sub3) this).anIntArray9684[i_465_]
			       * i_469_)
			    + 16383)
			   >> 14);
		    ((Class89_Sub3) this).anIntArray9684[i_465_]
			= ((((Class89_Sub3) this).anIntArray9685[i_465_]
			    * i_469_)
			   + (((Class89_Sub3) this).anIntArray9684[i_465_]
			      * i_470_)
			   + 16383) >> 14;
		    ((Class89_Sub3) this).anIntArray9685[i_465_] = i_471_;
		}
		if (i_460_ != 0) {
		    int i_472_ = Class282.anIntArray4430[i_460_];
		    int i_473_ = Class282.anIntArray4441[i_460_];
		    int i_474_
			= (((((Class89_Sub3) this).anIntArray9684[i_465_]
			     * i_472_)
			    + (((Class89_Sub3) this).anIntArray9670[i_465_]
			       * i_473_)
			    + 16383)
			   >> 14);
		    ((Class89_Sub3) this).anIntArray9684[i_465_]
			= ((((Class89_Sub3) this).anIntArray9684[i_465_]
			    * i_473_)
			   - (((Class89_Sub3) this).anIntArray9670[i_465_]
			      * i_472_)
			   + 16383) >> 14;
		    ((Class89_Sub3) this).anIntArray9670[i_465_] = i_474_;
		}
		((Class89_Sub3) this).anIntArray9670[i_465_]
		    += ((Class89_Sub3) this).anInt9717;
		((Class89_Sub3) this).anIntArray9685[i_465_]
		    += ((Class89_Sub3) this).anInt9721;
		((Class89_Sub3) this).anIntArray9684[i_465_]
		    += ((Class89_Sub3) this).anInt9722;
	    }
	} else if (i == 3) {
	    for (int i_475_ = 0; i_475_ < ((Class89_Sub3) this).anInt9686;
		 i_475_++) {
		((Class89_Sub3) this).anIntArray9670[i_475_]
		    -= ((Class89_Sub3) this).anInt9717;
		((Class89_Sub3) this).anIntArray9685[i_475_]
		    -= ((Class89_Sub3) this).anInt9721;
		((Class89_Sub3) this).anIntArray9684[i_475_]
		    -= ((Class89_Sub3) this).anInt9722;
		((Class89_Sub3) this).anIntArray9670[i_475_]
		    = (((Class89_Sub3) this).anIntArray9670[i_475_] * i_459_
		       / 128);
		((Class89_Sub3) this).anIntArray9685[i_475_]
		    = (((Class89_Sub3) this).anIntArray9685[i_475_] * i_460_
		       / 128);
		((Class89_Sub3) this).anIntArray9684[i_475_]
		    = (((Class89_Sub3) this).anIntArray9684[i_475_] * i_461_
		       / 128);
		((Class89_Sub3) this).anIntArray9670[i_475_]
		    += ((Class89_Sub3) this).anInt9717;
		((Class89_Sub3) this).anIntArray9685[i_475_]
		    += ((Class89_Sub3) this).anInt9721;
		((Class89_Sub3) this).anIntArray9684[i_475_]
		    += ((Class89_Sub3) this).anInt9722;
	    }
	} else if (i == 5) {
	    for (int i_476_ = 0; i_476_ < ((Class89_Sub3) this).anInt9691;
		 i_476_++) {
		int i_477_
		    = ((((Class89_Sub3) this).aByteArray9711[i_476_] & 0xff)
		       + i_459_ * 8);
		if (i_477_ < 0)
		    i_477_ = 0;
		else if (i_477_ > 255)
		    i_477_ = 255;
		((Class89_Sub3) this).aByteArray9711[i_476_] = (byte) i_477_;
	    }
	    if (((Class89_Sub3) this).aClass187Array9727 != null) {
		for (int i_478_ = 0; i_478_ < ((Class89_Sub3) this).anInt9726;
		     i_478_++) {
		    Class187 class187
			= ((Class89_Sub3) this).aClass187Array9727[i_478_];
		    Class203 class203
			= ((Class89_Sub3) this).aClass203Array9728[i_478_];
		    ((Class203) class203).anInt2417
			= ((((Class203) class203).anInt2417 * -1473589757
			    & 0xffffff)
			   | 255 - ((((Class89_Sub3) this).aByteArray9711
				     [(((Class187) class187).anInt2195
				       * 1571719645)])
				    & 0xff) << 24) * 376097963;
		}
	    }
	} else if (i == 7) {
	    for (int i_479_ = 0; i_479_ < ((Class89_Sub3) this).anInt9691;
		 i_479_++) {
		int i_480_
		    = ((Class89_Sub3) this).aShortArray9713[i_479_] & 0xffff;
		int i_481_ = i_480_ >> 10 & 0x3f;
		int i_482_ = i_480_ >> 7 & 0x7;
		int i_483_ = i_480_ & 0x7f;
		i_481_ = i_481_ + i_459_ & 0x3f;
		i_482_ += i_460_;
		if (i_482_ < 0)
		    i_482_ = 0;
		else if (i_482_ > 7)
		    i_482_ = 7;
		i_483_ += i_461_;
		if (i_483_ < 0)
		    i_483_ = 0;
		else if (i_483_ > 127)
		    i_483_ = 127;
		((Class89_Sub3) this).aShortArray9713[i_479_]
		    = (short) (i_481_ << 10 | i_482_ << 7 | i_483_);
	    }
	    ((Class89_Sub3) this).aBool9718 = true;
	    if (((Class89_Sub3) this).aClass187Array9727 != null) {
		for (int i_484_ = 0; i_484_ < ((Class89_Sub3) this).anInt9726;
		     i_484_++) {
		    Class187 class187
			= ((Class89_Sub3) this).aClass187Array9727[i_484_];
		    Class203 class203
			= ((Class89_Sub3) this).aClass203Array9728[i_484_];
		    ((Class203) class203).anInt2417
			= (((((Class203) class203).anInt2417 * -1473589757
			     & ~0xffffff)
			    | (Class474.anIntArray6382
			       [(Class241_Sub42.method16451
				 ((((Class89_Sub3) this).aShortArray9713
				   [(((Class187) class187).anInt2195
				     * 1571719645)]) & 0xffff,
				  896802534)) & 0xffff]) & 0xffffff)
			   * 376097963);
		}
	    }
	} else if (i == 8) {
	    for (int i_485_ = 0; i_485_ < ((Class89_Sub3) this).anInt9726;
		 i_485_++) {
		Class203 class203
		    = ((Class89_Sub3) this).aClass203Array9728[i_485_];
		((Class203) class203).anInt2423 += i_459_ * -378944915;
		((Class203) class203).anInt2418 += i_460_ * 830599387;
	    }
	} else if (i == 10) {
	    for (int i_486_ = 0; i_486_ < ((Class89_Sub3) this).anInt9726;
		 i_486_++) {
		Class203 class203
		    = ((Class89_Sub3) this).aClass203Array9728[i_486_];
		((Class203) class203).aFloat2415
		    = (((Class203) class203).aFloat2415 * (float) i_459_
		       / 128.0F);
		((Class203) class203).aFloat2416
		    = (((Class203) class203).aFloat2416 * (float) i_460_
		       / 128.0F);
	    }
	} else if (i == 9) {
	    for (int i_487_ = 0; i_487_ < ((Class89_Sub3) this).anInt9726;
		 i_487_++) {
		Class203 class203
		    = ((Class89_Sub3) this).aClass203Array9728[i_487_];
		((Class203) class203).anInt2424
		    = (((Class203) class203).anInt2424 * 360392329 + i_459_
		       & 0x3fff) * 318648249;
	    }
	}
    }
    
    public void method1857(Class266 class266, int i, boolean bool) {
	if (((Class89_Sub3) this).aShortArray9679 != null) {
	    Class189 class189 = ((Class89_Sub3) this).aClass103_Sub2_9690
				    .method15377(Thread.currentThread());
	    Class266 class266_488_ = ((Class189) class189).aClass266_2224;
	    class266_488_.method5175(class266);
	    if (bool)
		class266_488_.method5124();
	    Class268 class268 = ((Class189) class189).aClass268_2225;
	    class268.method5203(class266_488_);
	    float[] fs = new float[3];
	    for (int i_489_ = 0; i_489_ < ((Class89_Sub3) this).anInt9687;
		 i_489_++) {
		if ((i & ((Class89_Sub3) this).aShortArray9679[i_489_]) != 0) {
		    class268.method5208
			((float) ((Class89_Sub3) this).anIntArray9670[i_489_],
			 (float) ((Class89_Sub3) this).anIntArray9685[i_489_],
			 (float) ((Class89_Sub3) this).anIntArray9684[i_489_],
			 fs);
		    ((Class89_Sub3) this).anIntArray9670[i_489_] = (int) fs[0];
		    ((Class89_Sub3) this).anIntArray9685[i_489_] = (int) fs[1];
		    ((Class89_Sub3) this).anIntArray9684[i_489_] = (int) fs[2];
		}
	    }
	}
    }
    
    void method16066(Thread thread) {
	Class189 class189
	    = ((Class89_Sub3) this).aClass103_Sub2_9690.method15377(thread);
	if (class189 != ((Class89_Sub3) this).aClass189_9673) {
	    ((Class89_Sub3) this).aClass189_9673 = class189;
	    ((Class89_Sub3) this).aClass89_Sub3Array9755
		= (((Class189) ((Class89_Sub3) this).aClass189_9673)
		   .aClass89_Sub3Array2253);
	    ((Class89_Sub3) this).aClass89_Sub3Array9742
		= (((Class189) ((Class89_Sub3) this).aClass189_9673)
		   .aClass89_Sub3Array2248);
	}
    }
    
    void method16067(Class266 class266, Class97 class97, int i) {
	if (((Class89_Sub3) this).anInt9687 >= 1) {
	    Class189 class189 = ((Class89_Sub3) this).aClass103_Sub2_9690
				    .method15377(Thread.currentThread());
	    Class268 class268 = ((Class189) class189).aClass268_2225;
	    class268.method5203(class266);
	    Class268 class268_490_
		= (((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		   .aClass268_9279);
	    Class268 class268_491_
		= (((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		   .aClass268_9261);
	    if (!((Class89_Sub3) this).aBool9730)
		method16077();
	    boolean bool = class268.method5221();
	    float[] fs = ((Class189) class189).aFloatArray2219;
	    class268.method5208(0.0F, (float) ((Class89_Sub3) this).aShort9733,
				0.0F, fs);
	    float f = fs[0];
	    float f_492_ = fs[1];
	    float f_493_ = fs[2];
	    class268.method5208(0.0F, (float) ((Class89_Sub3) this).aShort9734,
				0.0F, fs);
	    float f_494_ = fs[0];
	    float f_495_ = fs[1];
	    float f_496_ = fs[2];
	    for (int i_497_ = 0; i_497_ < 6; i_497_++) {
		float[] fs_498_ = (((Class103_Sub2)
				    ((Class89_Sub3) this).aClass103_Sub2_9690)
				   .aFloatArrayArray9263[i_497_]);
		float f_499_ = (fs_498_[0] * f + fs_498_[1] * f_492_
				+ fs_498_[2] * f_493_ + fs_498_[3]
				+ (float) ((Class89_Sub3) this).aShort9731);
		float f_500_ = (fs_498_[0] * f_494_ + fs_498_[1] * f_495_
				+ fs_498_[2] * f_496_ + fs_498_[3]
				+ (float) ((Class89_Sub3) this).aShort9731);
		if (f_499_ < 0.0F && f_500_ < 0.0F)
		    return;
	    }
	    float f_501_;
	    float f_502_;
	    if (bool) {
		f_501_ = class268_490_.aFloatArray4353[14];
		f_502_ = class268_490_.aFloatArray4353[6];
	    } else {
		f_501_ = ((class268.aFloatArray4353[12]
			   * class268_490_.aFloatArray4353[2])
			  + (class268.aFloatArray4353[13]
			     * class268_490_.aFloatArray4353[6])
			  + (class268.aFloatArray4353[14]
			     * class268_490_.aFloatArray4353[10])
			  + class268_490_.aFloatArray4353[14]);
		f_502_ = ((class268.aFloatArray4353[4]
			   * class268_490_.aFloatArray4353[2])
			  + (class268.aFloatArray4353[5]
			     * class268_490_.aFloatArray4353[6])
			  + (class268.aFloatArray4353[6]
			     * class268_490_.aFloatArray4353[10]));
	    }
	    float f_503_
		= f_501_ + (float) ((Class89_Sub3) this).aShort9733 * f_502_;
	    float f_504_
		= f_501_ + (float) ((Class89_Sub3) this).aShort9734 * f_502_;
	    float f_505_
		= (f_503_ > f_504_
		   ? f_503_ + (float) ((Class89_Sub3) this).aShort9731
		   : f_504_ + (float) ((Class89_Sub3) this).aShort9731);
	    float f_506_ = (class268_491_.aFloatArray4353[10] * f_505_
			    + class268_491_.aFloatArray4353[14]);
	    if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		 .anInt9274) * 592623211
		> 1) {
		synchronized (this) {
		    while (((Class89_Sub3) this).aBool9743) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
		    }
		    ((Class89_Sub3) this).aBool9743 = true;
		}
	    }
	    method16049(class189);
	    Class268 class268_507_
		= (((Class189) ((Class89_Sub3) this).aClass189_9671)
		   .aClass268_2226);
	    class268_507_.method5199(class268);
	    class268_507_.method5202(((Class103_Sub2) (((Class89_Sub3) this)
						       .aClass103_Sub2_9690))
				     .aClass268_9262);
	    if ((i & 0x2) != 0)
		((Class89_Sub3) this).aClass155_9674.method3345(true);
	    else
		((Class89_Sub3) this).aClass155_9674.method3345(false);
	    boolean bool_508_ = false;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2212
		= ((Class155) ((Class89_Sub3) this).aClass155_9674).aFloat1728;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2247
		= ((Class155) ((Class89_Sub3) this).aClass155_9674).aFloat1729;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2242
		= ((Class155) ((Class89_Sub3) this).aClass155_9674).aFloat1732;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2244
		= 1.0F / (((Class155) ((Class89_Sub3) this).aClass155_9674)
			  .aFloat1732);
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2239
		= ((Class155) ((Class89_Sub3) this).aClass155_9674).aFloat1727;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2241
		= ((Class155) ((Class89_Sub3) this).aClass155_9674).aFloat1731;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2243
		= ((Class155) ((Class89_Sub3) this).aClass155_9674).aFloat1720;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).anInt2245
		= (((Class155) ((Class89_Sub3) this).aClass155_9674).anInt1733
		   * 798387409);
	    for (int i_509_ = 0; i_509_ < ((Class89_Sub3) this).anInt9686;
		 i_509_++) {
		int i_510_ = ((Class89_Sub3) this).anIntArray9670[i_509_];
		int i_511_ = ((Class89_Sub3) this).anIntArray9685[i_509_];
		int i_512_ = ((Class89_Sub3) this).anIntArray9684[i_509_];
		float f_513_
		    = (class268_507_.aFloatArray4353[0] * (float) i_510_
		       + class268_507_.aFloatArray4353[4] * (float) i_511_
		       + class268_507_.aFloatArray4353[8] * (float) i_512_
		       + class268_507_.aFloatArray4353[12]);
		float f_514_
		    = (class268_507_.aFloatArray4353[1] * (float) i_510_
		       + class268_507_.aFloatArray4353[5] * (float) i_511_
		       + class268_507_.aFloatArray4353[9] * (float) i_512_
		       + class268_507_.aFloatArray4353[13]);
		float f_515_
		    = (class268_507_.aFloatArray4353[2] * (float) i_510_
		       + class268_507_.aFloatArray4353[6] * (float) i_511_
		       + class268_507_.aFloatArray4353[10] * (float) i_512_
		       + class268_507_.aFloatArray4353[14]);
		float f_516_
		    = (class268_507_.aFloatArray4353[3] * (float) i_510_
		       + class268_507_.aFloatArray4353[7] * (float) i_511_
		       + class268_507_.aFloatArray4353[11] * (float) i_512_
		       + class268_507_.aFloatArray4353[15]);
		((Class89_Sub3) this).aFloatArray9756[i_509_]
		    = ((((Class189) ((Class89_Sub3) this).aClass189_9671)
			.aFloat2243)
		       + (((Class189) ((Class89_Sub3) this).aClass189_9671)
			  .aFloat2242) * f_515_ / f_516_);
		((Class89_Sub3) this).aFloatArray9700[i_509_] = f_516_;
		if (f_515_ >= -f_516_) {
		    ((Class89_Sub3) this).aFloatArray9745[i_509_]
			= (float) (int) ((((Class189) (((Class89_Sub3) this)
						       .aClass189_9671))
					  .aFloat2239)
					 + (((Class189) (((Class89_Sub3) this)
							 .aClass189_9671))
					    .aFloat2212) * f_513_ / f_516_);
		    ((Class89_Sub3) this).aFloatArray9746[i_509_]
			= (float) (int) ((((Class189) (((Class89_Sub3) this)
						       .aClass189_9671))
					  .aFloat2241)
					 + (((Class189) (((Class89_Sub3) this)
							 .aClass189_9671))
					    .aFloat2247) * f_514_ / f_516_);
		} else {
		    ((Class89_Sub3) this).aFloatArray9745[i_509_] = -5000.0F;
		    bool_508_ = true;
		}
		if (((Class189) ((Class89_Sub3) this).aClass189_9671)
		    .aBool2217)
		    ((Class89_Sub3) this).anIntArray9729[i_509_]
			= (int) (class268.aFloatArray4353[13]
				 + ((class268.aFloatArray4353[1]
				     * (float) i_510_)
				    + (class268.aFloatArray4353[5]
				       * (float) i_511_)
				    + (class268.aFloatArray4353[9]
				       * (float) i_512_)));
	    }
	    if (((Class89_Sub3) this).aClass187Array9727 != null) {
		for (int i_517_ = 0; i_517_ < ((Class89_Sub3) this).anInt9726;
		     i_517_++) {
		    Class187 class187
			= ((Class89_Sub3) this).aClass187Array9727[i_517_];
		    Class203 class203
			= ((Class89_Sub3) this).aClass203Array9728[i_517_];
		    short i_518_
			= (((Class89_Sub3) this).aShortArray9696
			   [((Class187) class187).anInt2195 * 1571719645]);
		    short i_519_
			= (((Class89_Sub3) this).aShortArray9697
			   [((Class187) class187).anInt2195 * 1571719645]);
		    short i_520_
			= (((Class89_Sub3) this).aShortArray9698
			   [((Class187) class187).anInt2195 * 1571719645]);
		    int i_521_
			= ((((Class89_Sub3) this).anIntArray9670[i_518_]
			    + ((Class89_Sub3) this).anIntArray9670[i_519_]
			    + ((Class89_Sub3) this).anIntArray9670[i_520_])
			   / 3);
		    int i_522_
			= ((((Class89_Sub3) this).anIntArray9685[i_518_]
			    + ((Class89_Sub3) this).anIntArray9685[i_519_]
			    + ((Class89_Sub3) this).anIntArray9685[i_520_])
			   / 3);
		    int i_523_
			= ((((Class89_Sub3) this).anIntArray9684[i_518_]
			    + ((Class89_Sub3) this).anIntArray9684[i_519_]
			    + ((Class89_Sub3) this).anIntArray9684[i_520_])
			   / 3);
		    float f_524_
			= (class268_507_.aFloatArray4353[0] * (float) i_521_
			   + class268_507_.aFloatArray4353[4] * (float) i_522_
			   + class268_507_.aFloatArray4353[8] * (float) i_523_
			   + class268_507_.aFloatArray4353[12]);
		    float f_525_
			= (class268_507_.aFloatArray4353[1] * (float) i_521_
			   + class268_507_.aFloatArray4353[5] * (float) i_522_
			   + class268_507_.aFloatArray4353[9] * (float) i_523_
			   + class268_507_.aFloatArray4353[13]);
		    float f_526_
			= (class268_507_.aFloatArray4353[2] * (float) i_521_
			   + class268_507_.aFloatArray4353[6] * (float) i_522_
			   + class268_507_.aFloatArray4353[10] * (float) i_523_
			   + class268_507_.aFloatArray4353[14]);
		    float f_527_
			= (class268_507_.aFloatArray4353[3] * (float) i_521_
			   + class268_507_.aFloatArray4353[7] * (float) i_522_
			   + class268_507_.aFloatArray4353[11] * (float) i_523_
			   + class268_507_.aFloatArray4353[15]);
		    f_526_ += ((class268_491_.aFloatArray4353[2]
				* (float) (((Class203) class203).anInt2423
					   * 653825893))
			       + (class268_491_.aFloatArray4353[6]
				  * (float) (((Class203) class203).anInt2418
					     * -825717933)));
		    f_527_ += ((class268_491_.aFloatArray4353[3]
				* (float) (((Class203) class203).anInt2423
					   * 653825893))
			       + (class268_491_.aFloatArray4353[7]
				  * (float) (((Class203) class203).anInt2418
					     * -825717933)));
		    if (f_526_ > -f_527_) {
			f_524_
			    += ((class268_491_.aFloatArray4353[0]
				 * (float) (((Class203) class203).anInt2423
					    * 653825893))
				+ (class268_491_.aFloatArray4353[4]
				   * (float) (((Class203) class203).anInt2418
					      * -825717933)));
			f_525_
			    += ((class268_491_.aFloatArray4353[1]
				 * (float) (((Class203) class203).anInt2423
					    * 653825893))
				+ (class268_491_.aFloatArray4353[5]
				   * (float) (((Class203) class203).anInt2418
					      * -825717933)));
			float f_528_
			    = ((((Class103_Sub2)
				 ((Class89_Sub3) this).aClass103_Sub2_9690)
				.aFloat9277)
			       + (((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9268) * f_524_ / f_527_);
			float f_529_
			    = ((((Class103_Sub2)
				 ((Class89_Sub3) this).aClass103_Sub2_9690)
				.aFloat9271)
			       + (((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9270) * f_525_ / f_527_);
			float f_530_
			    = (((Class203) class203).aFloat2415
			       * (float) ((Class187) class187).aShort2196);
			float f_531_
			    = (((Class203) class203).aFloat2416
			       * (float) ((Class187) class187).aShort2197);
			float f_532_
			    = (f_524_
			       + class268_491_.aFloatArray4353[0] * f_530_
			       + class268_491_.aFloatArray4353[4] * f_531_);
			float f_533_
			    = (f_525_
			       + class268_491_.aFloatArray4353[1] * f_530_
			       + class268_491_.aFloatArray4353[5] * f_531_);
			float f_534_
			    = (f_527_
			       + class268_491_.aFloatArray4353[3] * f_530_
			       + class268_491_.aFloatArray4353[7] * f_531_);
			float f_535_
			    = ((((Class103_Sub2)
				 ((Class89_Sub3) this).aClass103_Sub2_9690)
				.aFloat9277)
			       + (((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9268) * f_532_ / f_534_);
			float f_536_
			    = ((((Class103_Sub2)
				 ((Class89_Sub3) this).aClass103_Sub2_9690)
				.aFloat9271)
			       + (((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9270) * f_533_ / f_534_);
			((Class203) class203).anInt2420
			    = (int) f_528_ * -831814081;
			((Class203) class203).anInt2421
			    = (int) f_529_ * 653827797;
			((Class203) class203).aFloat2419
			    = ((((Class103_Sub2)
				 ((Class89_Sub3) this).aClass103_Sub2_9690)
				.aFloat9276)
			       + ((((Class103_Sub2)
				    ((Class89_Sub3) this).aClass103_Sub2_9690)
				   .aFloat9272)
				  * (f_526_
				     - (class268_491_.aFloatArray4353[10]
					* (float) ((((Class187) class187)
						    .anInt2202)
						   * 819851293)))
				  / f_527_));
			((Class203) class203).anInt2422
			    = (int) (f_535_ < f_528_ ? f_528_ - f_535_
				     : f_535_ - f_528_) * 851268813;
			((Class203) class203).anInt2414
			    = (int) (f_536_ < f_529_ ? f_529_ - f_536_
				     : f_536_ - f_529_) * -1013364265;
		    } else {
			Class203 class203_537_ = class203;
			((Class203) class203).anInt2414 = 0;
			((Class203) class203_537_).anInt2422 = 0;
		    }
		}
	    }
	    if (class97 != null) {
		boolean bool_538_ = false;
		boolean bool_539_ = true;
		int i_540_ = ((((Class89_Sub3) this).aShort9735
			       + ((Class89_Sub3) this).aShort9736)
			      >> 1);
		int i_541_ = ((((Class89_Sub3) this).aShort9737
			       + ((Class89_Sub3) this).aShort9738)
			      >> 1);
		int i_542_ = i_540_;
		short i_543_ = ((Class89_Sub3) this).aShort9733;
		int i_544_ = i_541_;
		float f_545_
		    = (class268_507_.aFloatArray4353[0] * (float) i_542_
		       + class268_507_.aFloatArray4353[4] * (float) i_543_
		       + class268_507_.aFloatArray4353[8] * (float) i_544_
		       + class268_507_.aFloatArray4353[12]);
		float f_546_
		    = (class268_507_.aFloatArray4353[1] * (float) i_542_
		       + class268_507_.aFloatArray4353[5] * (float) i_543_
		       + class268_507_.aFloatArray4353[9] * (float) i_544_
		       + class268_507_.aFloatArray4353[13]);
		float f_547_
		    = (class268_507_.aFloatArray4353[2] * (float) i_542_
		       + class268_507_.aFloatArray4353[6] * (float) i_543_
		       + class268_507_.aFloatArray4353[10] * (float) i_544_
		       + class268_507_.aFloatArray4353[14]);
		float f_548_
		    = (class268_507_.aFloatArray4353[3] * (float) i_542_
		       + class268_507_.aFloatArray4353[7] * (float) i_543_
		       + class268_507_.aFloatArray4353[11] * (float) i_544_
		       + class268_507_.aFloatArray4353[15]);
		if (f_547_ >= -f_548_) {
		    class97.anInt1349
			= (int) ((((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9277)
				 + (((Class103_Sub2)
				     ((Class89_Sub3) this).aClass103_Sub2_9690)
				    .aFloat9268) * f_545_ / f_548_);
		    class97.anInt1347
			= (int) ((((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9271)
				 + (((Class103_Sub2)
				     ((Class89_Sub3) this).aClass103_Sub2_9690)
				    .aFloat9270) * f_546_ / f_548_);
		} else
		    bool_538_ = true;
		i_542_ = i_540_;
		i_543_ = ((Class89_Sub3) this).aShort9734;
		i_544_ = i_541_;
		float f_549_
		    = (class268_507_.aFloatArray4353[0] * (float) i_542_
		       + class268_507_.aFloatArray4353[4] * (float) i_543_
		       + class268_507_.aFloatArray4353[8] * (float) i_544_
		       + class268_507_.aFloatArray4353[12]);
		float f_550_
		    = (class268_507_.aFloatArray4353[1] * (float) i_542_
		       + class268_507_.aFloatArray4353[5] * (float) i_543_
		       + class268_507_.aFloatArray4353[9] * (float) i_544_
		       + class268_507_.aFloatArray4353[13]);
		float f_551_
		    = (class268_507_.aFloatArray4353[2] * (float) i_542_
		       + class268_507_.aFloatArray4353[6] * (float) i_543_
		       + class268_507_.aFloatArray4353[10] * (float) i_544_
		       + class268_507_.aFloatArray4353[14]);
		float f_552_
		    = (class268_507_.aFloatArray4353[3] * (float) i_542_
		       + class268_507_.aFloatArray4353[7] * (float) i_543_
		       + class268_507_.aFloatArray4353[11] * (float) i_544_
		       + class268_507_.aFloatArray4353[15]);
		if (f_551_ >= -f_552_) {
		    class97.anInt1350
			= (int) ((((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9277)
				 + (((Class103_Sub2)
				     ((Class89_Sub3) this).aClass103_Sub2_9690)
				    .aFloat9268) * f_549_ / f_552_);
		    class97.anInt1351
			= (int) ((((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9271)
				 + (((Class103_Sub2)
				     ((Class89_Sub3) this).aClass103_Sub2_9690)
				    .aFloat9270) * f_550_ / f_552_);
		} else
		    bool_538_ = true;
		if (bool_538_) {
		    if (f_547_ < -f_548_ && f_551_ < -f_552_)
			bool_539_ = false;
		    else if (f_547_ < -f_548_) {
			float f_553_
			    = (f_547_ + f_548_) / (f_551_ + f_552_) - 1.0F;
			float f_554_ = f_545_ + f_553_ * (f_549_ - f_545_);
			float f_555_ = f_546_ + f_553_ * (f_550_ - f_546_);
			float f_556_ = f_548_ + f_553_ * (f_552_ - f_548_);
			class97.anInt1349
			    = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
							.aClass103_Sub2_9690))
				      .aFloat9277)
				     + (((Class103_Sub2)
					 (((Class89_Sub3) this)
					  .aClass103_Sub2_9690)).aFloat9268
					* f_554_ / f_556_));
			class97.anInt1347
			    = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
							.aClass103_Sub2_9690))
				      .aFloat9271)
				     + (((Class103_Sub2)
					 (((Class89_Sub3) this)
					  .aClass103_Sub2_9690)).aFloat9270
					* f_555_ / f_556_));
		    } else if (f_551_ < -f_552_) {
			float f_557_
			    = (f_551_ + f_552_) / (f_547_ + f_548_) - 1.0F;
			float f_558_ = f_549_ + f_557_ * (f_545_ - f_549_);
			float f_559_ = f_550_ + f_557_ * (f_546_ - f_550_);
			float f_560_ = f_552_ + f_557_ * (f_548_ - f_552_);
			class97.anInt1350
			    = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
							.aClass103_Sub2_9690))
				      .aFloat9277)
				     + (((Class103_Sub2)
					 (((Class89_Sub3) this)
					  .aClass103_Sub2_9690)).aFloat9268
					* f_558_ / f_560_));
			class97.anInt1351
			    = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
							.aClass103_Sub2_9690))
				      .aFloat9271)
				     + (((Class103_Sub2)
					 (((Class89_Sub3) this)
					  .aClass103_Sub2_9690)).aFloat9270
					* f_559_ / f_560_));
		    }
		}
		if (bool_539_) {
		    if (f_547_ / f_548_ > f_551_ / f_552_) {
			float f_561_
			    = (f_545_
			       + (class268_491_.aFloatArray4353[0]
				  * (float) ((Class89_Sub3) this).aShort9731)
			       + class268_491_.aFloatArray4353[12]);
			float f_562_
			    = (f_548_
			       + (class268_491_.aFloatArray4353[3]
				  * (float) ((Class89_Sub3) this).aShort9731)
			       + class268_491_.aFloatArray4353[15]);
			class97.anInt1348
			    = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
							.aClass103_Sub2_9690))
				      .aFloat9277)
				     - (float) class97.anInt1349
				     + (((Class103_Sub2)
					 (((Class89_Sub3) this)
					  .aClass103_Sub2_9690)).aFloat9268
					* f_561_ / f_562_));
		    } else {
			float f_563_
			    = (f_549_
			       + (class268_491_.aFloatArray4353[0]
				  * (float) ((Class89_Sub3) this).aShort9731)
			       + class268_491_.aFloatArray4353[12]);
			float f_564_
			    = (f_552_
			       + (class268_491_.aFloatArray4353[3]
				  * (float) ((Class89_Sub3) this).aShort9731)
			       + class268_491_.aFloatArray4353[15]);
			class97.anInt1348
			    = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
							.aClass103_Sub2_9690))
				      .aFloat9277)
				     - (float) class97.anInt1350
				     + (((Class103_Sub2)
					 (((Class89_Sub3) this)
					  .aClass103_Sub2_9690)).aFloat9268
					* f_563_ / f_564_));
		    }
		    class97.aBool1352 = true;
		}
	    }
	    method16117(true);
	    ((Class155) ((Class89_Sub3) this).aClass155_9674).aBool1721
		= (i & 0x1) == 0;
	    ((Class155) ((Class89_Sub3) this).aClass155_9674).aBool1722
		= false;
	    try {
		method16068((((Class103_Sub2)
			      ((Class89_Sub3) this).aClass103_Sub2_9690)
			     .anIntArray9245) != null,
			    (((Class103_Sub2)
			      ((Class89_Sub3) this).aClass103_Sub2_9690)
			     .aFloatArray9248) != null,
			    (i & 0x4) != 0, bool_508_,
			    ((((Class189)
			       ((Class89_Sub3) this).aClass189_9671).aBool2209
			      && f_506_ > (((Class189) (((Class89_Sub3) this)
							.aClass189_9671))
					   .aFloat2213))
			     || ((Class189) (((Class89_Sub3) this)
					     .aClass189_9671)).aBool2217));
	    } catch (Exception exception) {
		/* empty */
	    }
	    if (((Class89_Sub3) this).aClass187Array9727 != null) {
		for (int i_565_ = 0; i_565_ < ((Class89_Sub3) this).anInt9691;
		     i_565_++)
		    ((Class89_Sub3) this).anIntArray9675[i_565_] = -1;
	    }
	    ((Class89_Sub3) this).aClass155_9674 = null;
	    if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		 .anInt9274) * 592623211
		> 1) {
		synchronized (this) {
		    ((Class89_Sub3) this).aBool9743 = false;
		    this.notifyAll();
		}
	    }
	}
    }
    
    final void method16068(boolean bool, boolean bool_566_, boolean bool_567_,
			   boolean bool_568_, boolean bool_569_) {
	if (((Class89_Sub3) this).aClass187Array9727 != null) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9726; i++) {
		Class187 class187
		    = ((Class89_Sub3) this).aClass187Array9727[i];
		((Class89_Sub3) this).anIntArray9675
		    [((Class187) class187).anInt2195 * 1571719645]
		    = i;
	    }
	}
	if (((Class89_Sub3) this).aBool9748
	    || ((Class89_Sub3) this).aClass187Array9727 != null) {
	    if ((((Class89_Sub3) this).anInt9683 & 0x100) == 0
		&& ((Class89_Sub3) this).aShortArray9701 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9695; i++) {
		    short i_570_ = ((Class89_Sub3) this).aShortArray9701[i];
		    method16087(bool, bool_566_, bool_567_, i_570_, bool_568_,
				bool_569_);
		}
	    } else {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9695; i++) {
		    if (!method16070(i) && !method16071(i))
			method16087(bool, bool_566_, bool_567_, i, bool_568_,
				    bool_569_);
		}
		if (((Class89_Sub3) this).aByteArray9702 == null) {
		    for (int i = 0; i < ((Class89_Sub3) this).anInt9695; i++) {
			if (method16070(i) || method16071(i))
			    method16087(bool, bool_566_, bool_567_, i,
					bool_568_, bool_569_);
		    }
		} else {
		    for (int i = 0; i < 12; i++) {
			for (int i_571_ = 0;
			     i_571_ < ((Class89_Sub3) this).anInt9695;
			     i_571_++) {
			    if ((((Class89_Sub3) this).aByteArray9702[i_571_]
				 == i)
				&& (method16070(i_571_)
				    || method16071(i_571_)))
				method16087(bool, bool_566_, bool_567_, i_571_,
					    bool_568_, bool_569_);
			}
		    }
		}
	    }
	    if (((Class89_Sub3) this).aClass187Array9727 != null)
		method16069(bool, bool_566_, bool_567_);
	} else {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9695; i++)
		method16087(bool, bool_566_, bool_567_, i, bool_568_,
			    bool_569_);
	}
    }
    
    final void method16069(boolean bool, boolean bool_572_,
			   boolean bool_573_) {
	for (int i = 0; i < ((Class89_Sub3) this).anInt9726; i++) {
	    Class187 class187 = ((Class89_Sub3) this).aClass187Array9727[i];
	    if (((Class187) class187).aBool2201) {
		Class203 class203
		    = ((Class89_Sub3) this).aClass203Array9728[i];
		((Class89_Sub3) this).aClass103_Sub2_9690.method15380
		    (bool, bool_572_, bool_573_,
		     ((Class203) class203).anInt2420 * -192321089,
		     ((Class203) class203).anInt2421 * -585258371,
		     ((Class203) class203).aFloat2419,
		     ((Class203) class203).anInt2422 * 1388492805,
		     ((Class203) class203).anInt2414 * 1644083687,
		     ((Class187) class187).aShort2199,
		     ((Class203) class203).anInt2417 * -1473589757,
		     ((Class187) class187).aByte2200,
		     ((Class187) class187).aByte2198);
	    }
	}
    }
    
    final boolean method16070(int i) {
	if (((Class89_Sub3) this).aByteArray9711 == null)
	    return false;
	if (((Class89_Sub3) this).aByteArray9711[i] == 0)
	    return false;
	return true;
    }
    
    final boolean method16071(int i) {
	if (((Class89_Sub3) this).anIntArray9675 == null)
	    return false;
	if (((Class89_Sub3) this).anIntArray9675[i] == -1)
	    return false;
	return true;
    }
    
    void method16072() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9686; i++) {
		int i_574_ = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i] = -i_574_;
	    }
	    method16141();
	}
    }
    
    final void method16073(boolean bool, boolean bool_575_, boolean bool_576_,
			   int i) {
	short i_577_ = ((Class89_Sub3) this).aShortArray9696[i];
	short i_578_ = ((Class89_Sub3) this).aShortArray9697[i];
	short i_579_ = ((Class89_Sub3) this).aShortArray9698[i];
	int i_580_ = -1;
	if (((Class89_Sub3) this).aShortArray9712 != null
	    && ((Class89_Sub3) this).aShortArray9712[i] != -1)
	    i_580_ = (((Class89_Sub3) this).aClass103_Sub2_9690
			  .aClass107_1458.method2680
		      (((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
		       923352220)
		      .anInt1403) * 218388063;
	if (i_580_ == -1) {
	    if (((Class89_Sub3) this).aByteArray9711 == null)
		((Class155) ((Class89_Sub3) this).aClass155_9674).anInt1723
		    = 0;
	    else
		((Class155) ((Class89_Sub3) this).aClass155_9674).anInt1723
		    = ((Class89_Sub3) this).aByteArray9711[i] & 0xff;
	    if (((Class89_Sub3) this).anIntArray9704[i] == -1)
		((Class89_Sub3) this).aClass155_9674.method3377
		    (bool, bool_575_, bool_576_,
		     ((Class89_Sub3) this).aFloatArray9746[i_577_],
		     ((Class89_Sub3) this).aFloatArray9746[i_578_],
		     ((Class89_Sub3) this).aFloatArray9746[i_579_],
		     ((Class89_Sub3) this).aFloatArray9745[i_577_],
		     ((Class89_Sub3) this).aFloatArray9745[i_578_],
		     ((Class89_Sub3) this).aFloatArray9745[i_579_],
		     ((Class89_Sub3) this).aFloatArray9756[i_577_],
		     ((Class89_Sub3) this).aFloatArray9756[i_578_],
		     ((Class89_Sub3) this).aFloatArray9756[i_579_],
		     (Class474.anIntArray6382
		      [((Class89_Sub3) this).anIntArray9710[i] & 0xffff]));
	    else
		((Class89_Sub3) this).aClass155_9674.method3380
		    (bool, bool_575_, bool_576_,
		     ((Class89_Sub3) this).aFloatArray9746[i_577_],
		     ((Class89_Sub3) this).aFloatArray9746[i_578_],
		     ((Class89_Sub3) this).aFloatArray9746[i_579_],
		     ((Class89_Sub3) this).aFloatArray9745[i_577_],
		     ((Class89_Sub3) this).aFloatArray9745[i_578_],
		     ((Class89_Sub3) this).aFloatArray9745[i_579_],
		     ((Class89_Sub3) this).aFloatArray9756[i_577_],
		     ((Class89_Sub3) this).aFloatArray9756[i_578_],
		     ((Class89_Sub3) this).aFloatArray9756[i_579_],
		     (float) (((Class89_Sub3) this).anIntArray9710[i]
			      & 0xffff),
		     (float) (((Class89_Sub3) this).anIntArray9747[i]
			      & 0xffff),
		     (float) (((Class89_Sub3) this).anIntArray9704[i]
			      & 0xffff));
	} else {
	    int i_581_ = -16777216;
	    if (((Class89_Sub3) this).aByteArray9711 != null)
		i_581_ = 255 - (((Class89_Sub3) this).aByteArray9711[i]
				& 0xff) << 24;
	    if (((Class89_Sub3) this).anIntArray9704[i] == -1) {
		int i_582_
		    = (i_581_
		       | ((Class89_Sub3) this).anIntArray9710[i] & 0xffffff);
		((Class89_Sub3) this).aClass155_9674.method3384
		    (bool, bool_575_, bool_576_,
		     ((Class89_Sub3) this).aFloatArray9746[i_577_],
		     ((Class89_Sub3) this).aFloatArray9746[i_578_],
		     ((Class89_Sub3) this).aFloatArray9746[i_579_],
		     ((Class89_Sub3) this).aFloatArray9745[i_577_],
		     ((Class89_Sub3) this).aFloatArray9745[i_578_],
		     ((Class89_Sub3) this).aFloatArray9745[i_579_],
		     ((Class89_Sub3) this).aFloatArray9756[i_577_],
		     ((Class89_Sub3) this).aFloatArray9756[i_578_],
		     ((Class89_Sub3) this).aFloatArray9756[i_579_],
		     ((Class89_Sub3) this).aFloatArray9700[i_577_],
		     ((Class89_Sub3) this).aFloatArray9700[i_578_],
		     ((Class89_Sub3) this).aFloatArray9700[i_579_],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][0],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][1],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][2],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][0],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][1],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][2], i_582_,
		     i_582_, i_582_,
		     (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .anInt2215) * -338296791,
		     0.0F, 0.0F, 0.0F,
		     ((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
		     i_580_);
	    } else
		((Class89_Sub3) this).aClass155_9674.method3384
		    (bool, bool_575_, bool_576_,
		     ((Class89_Sub3) this).aFloatArray9746[i_577_],
		     ((Class89_Sub3) this).aFloatArray9746[i_578_],
		     ((Class89_Sub3) this).aFloatArray9746[i_579_],
		     ((Class89_Sub3) this).aFloatArray9745[i_577_],
		     ((Class89_Sub3) this).aFloatArray9745[i_578_],
		     ((Class89_Sub3) this).aFloatArray9745[i_579_],
		     ((Class89_Sub3) this).aFloatArray9756[i_577_],
		     ((Class89_Sub3) this).aFloatArray9756[i_578_],
		     ((Class89_Sub3) this).aFloatArray9756[i_579_],
		     ((Class89_Sub3) this).aFloatArray9700[i_577_],
		     ((Class89_Sub3) this).aFloatArray9700[i_578_],
		     ((Class89_Sub3) this).aFloatArray9700[i_579_],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][0],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][1],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][2],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][0],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][1],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][2],
		     (i_581_
		      | ((Class89_Sub3) this).anIntArray9710[i] & 0xffffff),
		     (i_581_
		      | ((Class89_Sub3) this).anIntArray9747[i] & 0xffffff),
		     (i_581_
		      | ((Class89_Sub3) this).anIntArray9704[i] & 0xffffff),
		     (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .anInt2215) * -338296791,
		     0.0F, 0.0F, 0.0F,
		     ((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
		     i_580_);
	}
    }
    
    final void method16074(boolean bool, boolean bool_583_, boolean bool_584_,
			   int i) {
	int i_585_ = -1;
	if (((Class89_Sub3) this).aShortArray9712 != null
	    && ((Class89_Sub3) this).aShortArray9712[i] != -1)
	    i_585_ = (((Class89_Sub3) this).aClass103_Sub2_9690
			  .aClass107_1458.method2680
		      (((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
		       927919240)
		      .anInt1403) * 218388063;
	if (!((Class189) ((Class89_Sub3) this).aClass189_9671).aBool2217) {
	    short i_586_ = ((Class89_Sub3) this).aShortArray9696[i];
	    short i_587_ = ((Class89_Sub3) this).aShortArray9697[i];
	    short i_588_ = ((Class89_Sub3) this).aShortArray9698[i];
	    Class268 class268
		= (((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		   .aClass268_9261);
	    float f = class268.aFloatArray4353[10];
	    float f_589_ = class268.aFloatArray4353[14];
	    float f_590_ = class268.aFloatArray4353[11];
	    float f_591_ = class268.aFloatArray4353[15];
	    float f_592_ = f_589_ * f_590_ - f * f_591_;
	    float f_593_
		= ((((Class89_Sub3) this).aFloatArray9756[i_586_]
		    - (((Class189) ((Class89_Sub3) this).aClass189_9671)
		       .aFloat2243))
		   * (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2244));
	    float f_594_
		= ((((Class89_Sub3) this).aFloatArray9756[i_587_]
		    - (((Class189) ((Class89_Sub3) this).aClass189_9671)
		       .aFloat2243))
		   * (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2244));
	    float f_595_
		= ((((Class89_Sub3) this).aFloatArray9756[i_588_]
		    - (((Class189) ((Class89_Sub3) this).aClass189_9671)
		       .aFloat2243))
		   * (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2244));
	    float f_596_ = f_593_ * f_592_ / (f_593_ * f_590_ - f);
	    float f_597_ = f_594_ * f_592_ / (f_594_ * f_590_ - f);
	    float f_598_ = f_595_ * f_592_ / (f_595_ * f_590_ - f);
	    float f_599_
		= ((f_596_ - (((Class189) ((Class89_Sub3) this).aClass189_9671)
			      .aFloat2213))
		   / (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2214));
	    if (f_599_ > 1.0F)
		f_599_ = 1.0F;
	    else if (f_599_ < 0.0F)
		f_599_ = 0.0F;
	    float f_600_
		= ((f_597_ - (((Class189) ((Class89_Sub3) this).aClass189_9671)
			      .aFloat2213))
		   / (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2214));
	    if (f_600_ > 1.0F)
		f_600_ = 1.0F;
	    else if (f_600_ < 0.0F)
		f_600_ = 0.0F;
	    float f_601_
		= ((f_598_ - (((Class189) ((Class89_Sub3) this).aClass189_9671)
			      .aFloat2213))
		   / (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2214));
	    if (f_601_ > 1.0F)
		f_601_ = 1.0F;
	    else if (f_601_ < 0.0F)
		f_601_ = 0.0F;
	    float f_602_ = f_599_ + f_600_ + f_601_;
	    if (!(f_602_ >= 3.0F)) {
		if (f_602_ <= 0.0F)
		    method16073(bool, bool_583_, bool_584_, i);
		else {
		    if (((Class89_Sub3) this).aByteArray9711 == null)
			((Class155) ((Class89_Sub3) this).aClass155_9674)
			    .anInt1723
			    = 0;
		    else
			((Class155) ((Class89_Sub3) this).aClass155_9674)
			    .anInt1723
			    = ((Class89_Sub3) this).aByteArray9711[i] & 0xff;
		    if (i_585_ == -1) {
			if (((Class89_Sub3) this).anIntArray9704[i] == -1)
			    ((Class89_Sub3) this).aClass155_9674.method3385
				(bool, bool_583_, bool_584_,
				 ((Class89_Sub3) this).aFloatArray9746[i_586_],
				 ((Class89_Sub3) this).aFloatArray9746[i_587_],
				 ((Class89_Sub3) this).aFloatArray9746[i_588_],
				 ((Class89_Sub3) this).aFloatArray9745[i_586_],
				 ((Class89_Sub3) this).aFloatArray9745[i_587_],
				 ((Class89_Sub3) this).aFloatArray9745[i_588_],
				 ((Class89_Sub3) this).aFloatArray9756[i_586_],
				 ((Class89_Sub3) this).aFloatArray9756[i_587_],
				 ((Class89_Sub3) this).aFloatArray9756[i_588_],
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9710[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_599_ * 255.0F,
						    1372221625),
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9710[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_600_ * 255.0F,
						    1372221625),
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9710[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_601_ * 255.0F,
						    1372221625));
			else
			    ((Class89_Sub3) this).aClass155_9674.method3385
				(bool, bool_583_, bool_584_,
				 ((Class89_Sub3) this).aFloatArray9746[i_586_],
				 ((Class89_Sub3) this).aFloatArray9746[i_587_],
				 ((Class89_Sub3) this).aFloatArray9746[i_588_],
				 ((Class89_Sub3) this).aFloatArray9745[i_586_],
				 ((Class89_Sub3) this).aFloatArray9745[i_587_],
				 ((Class89_Sub3) this).aFloatArray9745[i_588_],
				 ((Class89_Sub3) this).aFloatArray9756[i_586_],
				 ((Class89_Sub3) this).aFloatArray9756[i_587_],
				 ((Class89_Sub3) this).aFloatArray9756[i_588_],
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9710[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_599_ * 255.0F,
						    1372221625),
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9747[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_600_ * 255.0F,
						    1372221625),
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9704[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_601_ * 255.0F,
						    1372221625));
		    } else {
			int i_603_ = -16777216;
			if (((Class89_Sub3) this).aByteArray9711 != null)
			    i_603_ = 255 - ((((Class89_Sub3) this)
					     .aByteArray9711[i])
					    & 0xff) << 24;
			if (((Class89_Sub3) this).anIntArray9704[i] == -1) {
			    int i_604_
				= (i_603_
				   | (((Class89_Sub3) this).anIntArray9710[i]
				      & 0xffffff));
			    ((Class89_Sub3) this).aClass155_9674.method3384
				(bool, bool_583_, bool_584_,
				 ((Class89_Sub3) this).aFloatArray9746[i_586_],
				 ((Class89_Sub3) this).aFloatArray9746[i_587_],
				 ((Class89_Sub3) this).aFloatArray9746[i_588_],
				 ((Class89_Sub3) this).aFloatArray9745[i_586_],
				 ((Class89_Sub3) this).aFloatArray9745[i_587_],
				 ((Class89_Sub3) this).aFloatArray9745[i_588_],
				 ((Class89_Sub3) this).aFloatArray9756[i_586_],
				 ((Class89_Sub3) this).aFloatArray9756[i_587_],
				 ((Class89_Sub3) this).aFloatArray9756[i_588_],
				 ((Class89_Sub3) this).aFloatArray9700[i_586_],
				 ((Class89_Sub3) this).aFloatArray9700[i_587_],
				 ((Class89_Sub3) this).aFloatArray9700[i_588_],
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [0]),
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [1]),
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [2]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [0]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [1]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [2]),
				 i_604_, i_604_, i_604_,
				 (((Class189) (((Class89_Sub3) this)
					       .aClass189_9671)).anInt2215
				  * -338296791),
				 f_599_ * 255.0F, f_600_ * 255.0F,
				 f_601_ * 255.0F,
				 (((Class89_Sub3) this).aShortArray9712[i]
				  & 0xffff),
				 i_585_);
			} else
			    ((Class89_Sub3) this).aClass155_9674.method3384
				(bool, bool_583_, bool_584_,
				 ((Class89_Sub3) this).aFloatArray9746[i_586_],
				 ((Class89_Sub3) this).aFloatArray9746[i_587_],
				 ((Class89_Sub3) this).aFloatArray9746[i_588_],
				 ((Class89_Sub3) this).aFloatArray9745[i_586_],
				 ((Class89_Sub3) this).aFloatArray9745[i_587_],
				 ((Class89_Sub3) this).aFloatArray9745[i_588_],
				 ((Class89_Sub3) this).aFloatArray9756[i_586_],
				 ((Class89_Sub3) this).aFloatArray9756[i_587_],
				 ((Class89_Sub3) this).aFloatArray9756[i_588_],
				 ((Class89_Sub3) this).aFloatArray9700[i_586_],
				 ((Class89_Sub3) this).aFloatArray9700[i_587_],
				 ((Class89_Sub3) this).aFloatArray9700[i_588_],
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [0]),
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [1]),
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [2]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [0]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [1]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [2]),
				 i_603_ | (((Class89_Sub3) this).anIntArray9710
					   [i]) & 0xffffff,
				 i_603_ | (((Class89_Sub3) this).anIntArray9747
					   [i]) & 0xffffff,
				 i_603_ | (((Class89_Sub3) this).anIntArray9704
					   [i]) & 0xffffff,
				 (((Class189) (((Class89_Sub3) this)
					       .aClass189_9671)).anInt2215
				  * -338296791),
				 f_599_ * 255.0F, f_600_ * 255.0F,
				 f_601_ * 255.0F,
				 (((Class89_Sub3) this).aShortArray9712[i]
				  & 0xffff),
				 i_585_);
		    }
		}
	    }
	} else {
	    short i_605_ = ((Class89_Sub3) this).aShortArray9696[i];
	    short i_606_ = ((Class89_Sub3) this).aShortArray9697[i];
	    short i_607_ = ((Class89_Sub3) this).aShortArray9698[i];
	    float f = 0.0F;
	    float f_608_ = 0.0F;
	    float f_609_ = 0.0F;
	    if (((Class89_Sub3) this).anIntArray9729[i_605_]
		> (((Class189) ((Class89_Sub3) this).aClass189_9671).anInt2230
		   * 2144219087))
		f = 1.0F;
	    else if (((Class89_Sub3) this).anIntArray9729[i_605_]
		     > (((Class189) ((Class89_Sub3) this).aClass189_9671)
			.anInt2218) * -1285418291)
		f = ((float) ((((Class189)
				((Class89_Sub3) this).aClass189_9671).anInt2218
			       * -1285418291)
			      - ((Class89_Sub3) this).anIntArray9729[i_605_])
		     * 1.0F
		     / (float) ((((Class189) (((Class89_Sub3) this)
					      .aClass189_9671)).anInt2218
				 * -1285418291)
				- (((Class189) (((Class89_Sub3) this)
						.aClass189_9671)).anInt2230
				   * 2144219087)));
	    if (((Class89_Sub3) this).anIntArray9729[i_606_]
		> (((Class189) ((Class89_Sub3) this).aClass189_9671).anInt2230
		   * 2144219087))
		f_608_ = 1.0F;
	    else if (((Class89_Sub3) this).anIntArray9729[i_606_]
		     > (((Class189) ((Class89_Sub3) this).aClass189_9671)
			.anInt2218) * -1285418291)
		f_608_
		    = ((float) ((((Class189) (((Class89_Sub3) this)
					      .aClass189_9671)).anInt2218
				 * -1285418291)
				- ((Class89_Sub3) this).anIntArray9729[i_606_])
		       * 1.0F
		       / (float) ((((Class189) (((Class89_Sub3) this)
						.aClass189_9671)).anInt2218
				   * -1285418291)
				  - (((Class189) (((Class89_Sub3) this)
						  .aClass189_9671)).anInt2230
				     * 2144219087)));
	    if (((Class89_Sub3) this).anIntArray9729[i_607_]
		> (((Class189) ((Class89_Sub3) this).aClass189_9671).anInt2230
		   * 2144219087))
		f_609_ = 1.0F;
	    else if (((Class89_Sub3) this).anIntArray9729[i_607_]
		     > (((Class189) ((Class89_Sub3) this).aClass189_9671)
			.anInt2218) * -1285418291)
		f_609_
		    = ((float) ((((Class189) (((Class89_Sub3) this)
					      .aClass189_9671)).anInt2218
				 * -1285418291)
				- ((Class89_Sub3) this).anIntArray9729[i_607_])
		       * 1.0F
		       / (float) ((((Class189) (((Class89_Sub3) this)
						.aClass189_9671)).anInt2218
				   * -1285418291)
				  - (((Class189) (((Class89_Sub3) this)
						  .aClass189_9671)).anInt2230
				     * 2144219087)));
	    if (((Class89_Sub3) this).aByteArray9711 == null)
		((Class155) ((Class89_Sub3) this).aClass155_9674).anInt1723
		    = 0;
	    else
		((Class155) ((Class89_Sub3) this).aClass155_9674).anInt1723
		    = ((Class89_Sub3) this).aByteArray9711[i] & 0xff;
	    if (i_585_ == -1) {
		if (((Class89_Sub3) this).anIntArray9704[i] == -1)
		    ((Class89_Sub3) this).aClass155_9674.method3385
			(bool, bool_583_, bool_584_,
			 ((Class89_Sub3) this).aFloatArray9746[i_605_],
			 ((Class89_Sub3) this).aFloatArray9746[i_606_],
			 ((Class89_Sub3) this).aFloatArray9746[i_607_],
			 ((Class89_Sub3) this).aFloatArray9745[i_605_],
			 ((Class89_Sub3) this).aFloatArray9745[i_606_],
			 ((Class89_Sub3) this).aFloatArray9745[i_607_],
			 ((Class89_Sub3) this).aFloatArray9756[i_605_],
			 ((Class89_Sub3) this).aFloatArray9756[i_606_],
			 ((Class89_Sub3) this).aFloatArray9756[i_607_],
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9710[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f * 255.0F, 1372221625),
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9710[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f_608_ * 255.0F, 1372221625),
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9710[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f_609_ * 255.0F, 1372221625));
		else
		    ((Class89_Sub3) this).aClass155_9674.method3385
			(bool, bool_583_, bool_584_,
			 ((Class89_Sub3) this).aFloatArray9746[i_605_],
			 ((Class89_Sub3) this).aFloatArray9746[i_606_],
			 ((Class89_Sub3) this).aFloatArray9746[i_607_],
			 ((Class89_Sub3) this).aFloatArray9745[i_605_],
			 ((Class89_Sub3) this).aFloatArray9745[i_606_],
			 ((Class89_Sub3) this).aFloatArray9745[i_607_],
			 ((Class89_Sub3) this).aFloatArray9756[i_605_],
			 ((Class89_Sub3) this).aFloatArray9756[i_606_],
			 ((Class89_Sub3) this).aFloatArray9756[i_607_],
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9710[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f * 255.0F, 1372221625),
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9747[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f_608_ * 255.0F, 1372221625),
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9704[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f_609_ * 255.0F, 1372221625));
	    } else {
		int i_610_ = -16777216;
		if (((Class89_Sub3) this).aByteArray9711 != null)
		    i_610_ = 255 - (((Class89_Sub3) this).aByteArray9711[i]
				    & 0xff) << 24;
		if (((Class89_Sub3) this).anIntArray9704[i] == -1) {
		    int i_611_
			= i_610_ | (((Class89_Sub3) this).anIntArray9710[i]
				    & 0xffffff);
		    ((Class89_Sub3) this).aClass155_9674.method3384
			(bool, bool_583_, bool_584_,
			 ((Class89_Sub3) this).aFloatArray9746[i_605_],
			 ((Class89_Sub3) this).aFloatArray9746[i_606_],
			 ((Class89_Sub3) this).aFloatArray9746[i_607_],
			 ((Class89_Sub3) this).aFloatArray9745[i_605_],
			 ((Class89_Sub3) this).aFloatArray9745[i_606_],
			 ((Class89_Sub3) this).aFloatArray9745[i_607_],
			 ((Class89_Sub3) this).aFloatArray9756[i_605_],
			 ((Class89_Sub3) this).aFloatArray9756[i_606_],
			 ((Class89_Sub3) this).aFloatArray9756[i_607_],
			 ((Class89_Sub3) this).aFloatArray9700[i_605_],
			 ((Class89_Sub3) this).aFloatArray9700[i_606_],
			 ((Class89_Sub3) this).aFloatArray9700[i_607_],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][0],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][1],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][2],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][0],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][1],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][2],
			 i_611_, i_611_, i_611_,
			 (((Class189) ((Class89_Sub3) this).aClass189_9671)
			  .anInt2215) * -338296791,
			 f * 255.0F, f_608_ * 255.0F, f_609_ * 255.0F,
			 ((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
			 i_585_);
		} else
		    ((Class89_Sub3) this).aClass155_9674.method3384
			(bool, bool_583_, bool_584_,
			 ((Class89_Sub3) this).aFloatArray9746[i_605_],
			 ((Class89_Sub3) this).aFloatArray9746[i_606_],
			 ((Class89_Sub3) this).aFloatArray9746[i_607_],
			 ((Class89_Sub3) this).aFloatArray9745[i_605_],
			 ((Class89_Sub3) this).aFloatArray9745[i_606_],
			 ((Class89_Sub3) this).aFloatArray9745[i_607_],
			 ((Class89_Sub3) this).aFloatArray9756[i_605_],
			 ((Class89_Sub3) this).aFloatArray9756[i_606_],
			 ((Class89_Sub3) this).aFloatArray9756[i_607_],
			 ((Class89_Sub3) this).aFloatArray9700[i_605_],
			 ((Class89_Sub3) this).aFloatArray9700[i_606_],
			 ((Class89_Sub3) this).aFloatArray9700[i_607_],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][0],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][1],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][2],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][0],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][1],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][2],
			 i_610_ | (((Class89_Sub3) this).anIntArray9710[i]
				   & 0xffffff),
			 i_610_ | (((Class89_Sub3) this).anIntArray9747[i]
				   & 0xffffff),
			 i_610_ | (((Class89_Sub3) this).anIntArray9704[i]
				   & 0xffffff),
			 (((Class189) ((Class89_Sub3) this).aClass189_9671)
			  .anInt2215) * -338296791,
			 f * 255.0F, f_608_ * 255.0F, f_609_ * 255.0F,
			 ((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
			 i_585_);
	    }
	}
    }
    
    int method16075(int i, short i_612_, int i_613_) {
	int i_614_ = Class474.anIntArray6383[method16048(i, i_613_)];
	Class101 class101
	    = ((Class89_Sub3) this).aClass103_Sub2_9690.aClass107_1458
		  .method2680(i_612_ & 0xffff, -1484384194);
	int i_615_ = class101.aByte1430 & 0xff;
	if (i_615_ != 0) {
	    int i_616_ = 131586 * i_613_;
	    if (i_615_ == 256)
		i_614_ = i_616_;
	    else {
		int i_617_ = i_615_;
		int i_618_ = 256 - i_615_;
		i_614_ = ((((i_616_ & 0xff00ff) * i_617_
			    + (i_614_ & 0xff00ff) * i_618_)
			   & ~0xff00ff)
			  + (((i_616_ & 0xff00) * i_617_
			      + (i_614_ & 0xff00) * i_618_)
			     & 0xff0000)) >> 8;
	    }
	}
	int i_619_ = class101.aByte1433 & 0xff;
	if (i_619_ != 0) {
	    i_619_ += 256;
	    int i_620_ = ((i_614_ & 0xff0000) >> 16) * i_619_;
	    if (i_620_ > 65535)
		i_620_ = 65535;
	    int i_621_ = ((i_614_ & 0xff00) >> 8) * i_619_;
	    if (i_621_ > 65535)
		i_621_ = 65535;
	    int i_622_ = (i_614_ & 0xff) * i_619_;
	    if (i_622_ > 65535)
		i_622_ = 65535;
	    i_614_
		= (i_620_ << 8 & 0xff0000) + (i_621_ & 0xff00) + (i_622_ >> 8);
	}
	return i_614_;
    }
    
    boolean method16076(int i, int i_623_, float f, float f_624_, float f_625_,
			float f_626_, float f_627_, float f_628_) {
	if ((float) i_623_ < f && (float) i_623_ < f_624_
	    && (float) i_623_ < f_625_)
	    return false;
	if ((float) i_623_ > f && (float) i_623_ > f_624_
	    && (float) i_623_ > f_625_)
	    return false;
	if ((float) i < f_626_ && (float) i < f_627_ && (float) i < f_628_)
	    return false;
	if ((float) i > f_626_ && (float) i > f_627_ && (float) i > f_628_)
	    return false;
	return true;
    }
    
    public void method1915(Class266 class266) {
	method16049(((Class89_Sub3) this).aClass103_Sub2_9690
			.method15377(Thread.currentThread()));
	Class268 class268
	    = ((Class189) ((Class89_Sub3) this).aClass189_9671).aClass268_2225;
	class268.method5203(class266);
	if (((Class89_Sub3) this).aClass106Array9724 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub3) this).aClass106Array9724.length; i++) {
		Class106 class106
		    = ((Class89_Sub3) this).aClass106Array9724[i];
		Class106 class106_629_ = class106;
		if (class106.aClass106_1488 != null)
		    class106_629_ = class106.aClass106_1488;
		class106_629_.anInt1487
		    = (int) (class268.aFloatArray4353[12]
			     + ((class268.aFloatArray4353[0]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[4]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[8]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class106.anInt1490
						* 844698029)])))) * 548844199;
		class106_629_.anInt1495
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class106.anInt1490
						* 844698029)])))) * -237372493;
		class106_629_.anInt1498
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class106.anInt1490
						* 844698029)])))) * 1108321407;
		class106_629_.anInt1497
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1696685061);
		class106_629_.anInt1496
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1783587391);
		class106_629_.anInt1499
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -425190479);
		class106_629_.anInt1500
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * -1671800873);
		class106_629_.anInt1501
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 1675759173);
		class106_629_.anInt1502
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 2116418239);
	    }
	}
	if (((Class89_Sub3) this).aClass167Array9725 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub3) this).aClass167Array9725.length; i++) {
		Class167 class167
		    = ((Class89_Sub3) this).aClass167Array9725[i];
		Class167 class167_630_ = class167;
		if (class167.aClass167_2057 != null)
		    class167_630_ = class167.aClass167_2057;
		if (class167.aClass268_2061 != null)
		    class167.aClass268_2061.method5199(class268);
		else
		    class167.aClass268_2061 = new Class268(class268);
		class167_630_.anInt2060
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [class167.anInt2058 * 294413539]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class167.anInt2058
						 * 294413539)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class167.anInt2058
						 * 294413539)]))))
		       * -1901304929);
		class167_630_.anInt2062
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class167.anInt2058
						* 294413539)])))) * -290266353;
		class167_630_.anInt2056
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class167.anInt2058
						* 294413539)])))) * 1003150305;
	    }
	}
    }
    
    public Class241_Sub39_Sub17 method1892
	(Class241_Sub39_Sub17 class241_sub39_sub17) {
	return null;
    }
    
    void method16077() {
	if (!((Class89_Sub3) this).aBool9730) {
	    int i = 0;
	    int i_631_ = 0;
	    int i_632_ = 32767;
	    int i_633_ = 32767;
	    int i_634_ = 32767;
	    int i_635_ = -32768;
	    int i_636_ = -32768;
	    int i_637_ = -32768;
	    for (int i_638_ = 0; i_638_ < ((Class89_Sub3) this).anInt9687;
		 i_638_++) {
		int i_639_ = ((Class89_Sub3) this).anIntArray9670[i_638_];
		int i_640_ = ((Class89_Sub3) this).anIntArray9685[i_638_];
		int i_641_ = ((Class89_Sub3) this).anIntArray9684[i_638_];
		if (i_639_ < i_632_)
		    i_632_ = i_639_;
		if (i_639_ > i_635_)
		    i_635_ = i_639_;
		if (i_640_ < i_633_)
		    i_633_ = i_640_;
		if (i_640_ > i_636_)
		    i_636_ = i_640_;
		if (i_641_ < i_634_)
		    i_634_ = i_641_;
		if (i_641_ > i_637_)
		    i_637_ = i_641_;
		int i_642_ = i_639_ * i_639_ + i_641_ * i_641_;
		if (i_642_ > i)
		    i = i_642_;
		i_642_ += i_640_ * i_640_;
		if (i_642_ > i_631_)
		    i_631_ = i_642_;
	    }
	    ((Class89_Sub3) this).aShort9735 = (short) i_632_;
	    ((Class89_Sub3) this).aShort9736 = (short) i_635_;
	    ((Class89_Sub3) this).aShort9733 = (short) i_633_;
	    ((Class89_Sub3) this).aShort9734 = (short) i_636_;
	    ((Class89_Sub3) this).aShort9737 = (short) i_634_;
	    ((Class89_Sub3) this).aShort9738 = (short) i_637_;
	    ((Class89_Sub3) this).aShort9731
		= (short) (int) (Math.sqrt((double) i) + 0.99);
	    ((Class89_Sub3) this).aShort9732
		= (short) (int) (Math.sqrt((double) i_631_) + 0.99);
	    ((Class89_Sub3) this).aBool9730 = true;
	}
    }
    
    public boolean method1891(int i, int i_643_, Class266 class266,
			      boolean bool, int i_644_) {
	method16049(((Class89_Sub3) this).aClass103_Sub2_9690
			.method15377(Thread.currentThread()));
	Class268 class268
	    = ((Class189) ((Class89_Sub3) this).aClass189_9671).aClass268_2225;
	class268.method5203(class266);
	Class268 class268_645_
	    = ((Class189) ((Class89_Sub3) this).aClass189_9671).aClass268_2226;
	class268_645_.method5199(class268);
	class268_645_.method5202(((Class103_Sub2)
				  ((Class89_Sub3) this).aClass103_Sub2_9690)
				 .aClass268_9262);
	boolean bool_646_ = false;
	int i_647_ = 2147483647;
	int i_648_ = -2147483648;
	int i_649_ = 2147483647;
	int i_650_ = -2147483648;
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	int i_651_ = ((((Class89_Sub3) this).aShort9736
		       - ((Class89_Sub3) this).aShort9735)
		      >> 1);
	int i_652_ = ((((Class89_Sub3) this).aShort9734
		       - ((Class89_Sub3) this).aShort9733)
		      >> 1);
	int i_653_ = ((((Class89_Sub3) this).aShort9738
		       - ((Class89_Sub3) this).aShort9737)
		      >> 1);
	int i_654_ = ((Class89_Sub3) this).aShort9735 + i_651_;
	int i_655_ = ((Class89_Sub3) this).aShort9733 + i_652_;
	int i_656_ = ((Class89_Sub3) this).aShort9737 + i_653_;
	int i_657_ = i_654_ - (i_651_ << i_644_);
	int i_658_ = i_655_ - (i_652_ << i_644_);
	int i_659_ = i_656_ - (i_653_ << i_644_);
	int i_660_ = i_654_ + (i_651_ << i_644_);
	int i_661_ = i_655_ + (i_652_ << i_644_);
	int i_662_ = i_656_ + (i_653_ << i_644_);
	((Class89_Sub3) this).anIntArray9749[0] = i_657_;
	((Class89_Sub3) this).anIntArray9750[0] = i_658_;
	((Class89_Sub3) this).anIntArray9751[0] = i_659_;
	((Class89_Sub3) this).anIntArray9749[1] = i_660_;
	((Class89_Sub3) this).anIntArray9750[1] = i_658_;
	((Class89_Sub3) this).anIntArray9751[1] = i_659_;
	((Class89_Sub3) this).anIntArray9749[2] = i_657_;
	((Class89_Sub3) this).anIntArray9750[2] = i_661_;
	((Class89_Sub3) this).anIntArray9751[2] = i_659_;
	((Class89_Sub3) this).anIntArray9749[3] = i_660_;
	((Class89_Sub3) this).anIntArray9750[3] = i_661_;
	((Class89_Sub3) this).anIntArray9751[3] = i_659_;
	((Class89_Sub3) this).anIntArray9749[4] = i_657_;
	((Class89_Sub3) this).anIntArray9750[4] = i_658_;
	((Class89_Sub3) this).anIntArray9751[4] = i_662_;
	((Class89_Sub3) this).anIntArray9749[5] = i_660_;
	((Class89_Sub3) this).anIntArray9750[5] = i_658_;
	((Class89_Sub3) this).anIntArray9751[5] = i_662_;
	((Class89_Sub3) this).anIntArray9749[6] = i_657_;
	((Class89_Sub3) this).anIntArray9750[6] = i_661_;
	((Class89_Sub3) this).anIntArray9751[6] = i_662_;
	((Class89_Sub3) this).anIntArray9749[7] = i_660_;
	((Class89_Sub3) this).anIntArray9750[7] = i_661_;
	((Class89_Sub3) this).anIntArray9751[7] = i_662_;
	for (int i_663_ = 0; i_663_ < 8; i_663_++) {
	    int i_664_ = ((Class89_Sub3) this).anIntArray9749[i_663_];
	    int i_665_ = ((Class89_Sub3) this).anIntArray9750[i_663_];
	    int i_666_ = ((Class89_Sub3) this).anIntArray9751[i_663_];
	    float f = (class268_645_.aFloatArray4353[2] * (float) i_664_
		       + class268_645_.aFloatArray4353[6] * (float) i_665_
		       + class268_645_.aFloatArray4353[10] * (float) i_666_
		       + class268_645_.aFloatArray4353[14]);
	    float f_667_
		= (class268_645_.aFloatArray4353[3] * (float) i_664_
		   + class268_645_.aFloatArray4353[7] * (float) i_665_
		   + class268_645_.aFloatArray4353[11] * (float) i_666_
		   + class268_645_.aFloatArray4353[15]);
	    if (f >= -f_667_) {
		float f_668_
		    = (class268_645_.aFloatArray4353[0] * (float) i_664_
		       + class268_645_.aFloatArray4353[4] * (float) i_665_
		       + class268_645_.aFloatArray4353[8] * (float) i_666_
		       + class268_645_.aFloatArray4353[12]);
		float f_669_
		    = (class268_645_.aFloatArray4353[1] * (float) i_664_
		       + class268_645_.aFloatArray4353[5] * (float) i_665_
		       + class268_645_.aFloatArray4353[9] * (float) i_666_
		       + class268_645_.aFloatArray4353[13]);
		int i_670_ = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
						       .aClass103_Sub2_9690))
				     .aFloat9277)
				    + (((Class103_Sub2) (((Class89_Sub3) this)
							 .aClass103_Sub2_9690))
				       .aFloat9268) * f_668_ / f_667_);
		int i_671_ = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
						       .aClass103_Sub2_9690))
				     .aFloat9271)
				    + (((Class103_Sub2) (((Class89_Sub3) this)
							 .aClass103_Sub2_9690))
				       .aFloat9270) * f_669_ / f_667_);
		if (i_670_ < i_647_)
		    i_647_ = i_670_;
		if (i_670_ > i_648_)
		    i_648_ = i_670_;
		if (i_671_ < i_649_)
		    i_649_ = i_671_;
		if (i_671_ > i_650_)
		    i_650_ = i_671_;
		bool_646_ = true;
	    }
	}
	if (bool_646_ && i > i_647_ && i < i_648_ && i_643_ > i_649_
	    && i_643_ < i_650_) {
	    if (bool)
		return true;
	    for (int i_672_ = 0; i_672_ < ((Class89_Sub3) this).anInt9686;
		 i_672_++) {
		int i_673_ = ((Class89_Sub3) this).anIntArray9670[i_672_];
		int i_674_ = ((Class89_Sub3) this).anIntArray9685[i_672_];
		int i_675_ = ((Class89_Sub3) this).anIntArray9684[i_672_];
		float f = (class268_645_.aFloatArray4353[2] * (float) i_673_
			   + class268_645_.aFloatArray4353[6] * (float) i_674_
			   + class268_645_.aFloatArray4353[10] * (float) i_675_
			   + class268_645_.aFloatArray4353[14]);
		float f_676_
		    = (class268_645_.aFloatArray4353[3] * (float) i_673_
		       + class268_645_.aFloatArray4353[7] * (float) i_674_
		       + class268_645_.aFloatArray4353[11] * (float) i_675_
		       + class268_645_.aFloatArray4353[15]);
		if (f >= -f_676_) {
		    float f_677_
			= (class268_645_.aFloatArray4353[0] * (float) i_673_
			   + class268_645_.aFloatArray4353[4] * (float) i_674_
			   + class268_645_.aFloatArray4353[8] * (float) i_675_
			   + class268_645_.aFloatArray4353[12]);
		    float f_678_
			= (class268_645_.aFloatArray4353[1] * (float) i_673_
			   + class268_645_.aFloatArray4353[5] * (float) i_674_
			   + class268_645_.aFloatArray4353[9] * (float) i_675_
			   + class268_645_.aFloatArray4353[13]);
		    ((Class89_Sub3) this).aFloatArray9745[i_672_]
			= (float) (int) (((Class103_Sub2)
					  (((Class89_Sub3) this)
					   .aClass103_Sub2_9690)).aFloat9277
					 + (((Class103_Sub2)
					     (((Class89_Sub3) this)
					      .aClass103_Sub2_9690)).aFloat9268
					    * f_677_ / f_676_));
		    ((Class89_Sub3) this).aFloatArray9746[i_672_]
			= (float) (int) (((Class103_Sub2)
					  (((Class89_Sub3) this)
					   .aClass103_Sub2_9690)).aFloat9271
					 + (((Class103_Sub2)
					     (((Class89_Sub3) this)
					      .aClass103_Sub2_9690)).aFloat9270
					    * f_678_ / f_676_));
		} else
		    ((Class89_Sub3) this).aFloatArray9745[i_672_] = -999999.0F;
	    }
	    for (int i_679_ = 0; i_679_ < ((Class89_Sub3) this).anInt9695;
		 i_679_++) {
		if (((((Class89_Sub3) this).aFloatArray9745
		      [((Class89_Sub3) this).aShortArray9696[i_679_]])
		     != -999999.0F)
		    && ((((Class89_Sub3) this).aFloatArray9745
			 [((Class89_Sub3) this).aShortArray9697[i_679_]])
			!= -999999.0F)
		    && ((((Class89_Sub3) this).aFloatArray9745
			 [((Class89_Sub3) this).aShortArray9698[i_679_]])
			!= -999999.0F)
		    && (method16076
			(i, i_643_,
			 (((Class89_Sub3) this).aFloatArray9746
			  [((Class89_Sub3) this).aShortArray9696[i_679_]]),
			 (((Class89_Sub3) this).aFloatArray9746
			  [((Class89_Sub3) this).aShortArray9697[i_679_]]),
			 (((Class89_Sub3) this).aFloatArray9746
			  [((Class89_Sub3) this).aShortArray9698[i_679_]]),
			 (((Class89_Sub3) this).aFloatArray9745
			  [((Class89_Sub3) this).aShortArray9696[i_679_]]),
			 (((Class89_Sub3) this).aFloatArray9745
			  [((Class89_Sub3) this).aShortArray9697[i_679_]]),
			 (((Class89_Sub3) this).aFloatArray9745
			  [((Class89_Sub3) this).aShortArray9698[i_679_]]))))
		    return true;
	    }
	}
	return false;
    }
    
    public byte[] method1913() {
	return ((Class89_Sub3) this).aByteArray9711;
    }
    
    void method16078(Thread thread) {
	Class189 class189
	    = ((Class89_Sub3) this).aClass103_Sub2_9690.method15377(thread);
	if (class189 != ((Class89_Sub3) this).aClass189_9673) {
	    ((Class89_Sub3) this).aClass189_9673 = class189;
	    ((Class89_Sub3) this).aClass89_Sub3Array9755
		= (((Class189) ((Class89_Sub3) this).aClass189_9673)
		   .aClass89_Sub3Array2253);
	    ((Class89_Sub3) this).aClass89_Sub3Array9742
		= (((Class189) ((Class89_Sub3) this).aClass189_9673)
		   .aClass89_Sub3Array2248);
	}
    }
    
    public int method1895() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9735;
    }
    
    public int method1906() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9736;
    }
    
    public int method1902() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9733;
    }
    
    public int method1865() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9734;
    }
    
    public int method1899() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9737;
    }
    
    public void method1966(Class266 class266, int i, boolean bool) {
	if (((Class89_Sub3) this).aShortArray9679 != null) {
	    Class189 class189 = ((Class89_Sub3) this).aClass103_Sub2_9690
				    .method15377(Thread.currentThread());
	    Class266 class266_680_ = ((Class189) class189).aClass266_2224;
	    class266_680_.method5175(class266);
	    if (bool)
		class266_680_.method5124();
	    Class268 class268 = ((Class189) class189).aClass268_2225;
	    class268.method5203(class266_680_);
	    float[] fs = new float[3];
	    for (int i_681_ = 0; i_681_ < ((Class89_Sub3) this).anInt9687;
		 i_681_++) {
		if ((i & ((Class89_Sub3) this).aShortArray9679[i_681_]) != 0) {
		    class268.method5208
			((float) ((Class89_Sub3) this).anIntArray9670[i_681_],
			 (float) ((Class89_Sub3) this).anIntArray9685[i_681_],
			 (float) ((Class89_Sub3) this).anIntArray9684[i_681_],
			 fs);
		    ((Class89_Sub3) this).anIntArray9670[i_681_] = (int) fs[0];
		    ((Class89_Sub3) this).anIntArray9685[i_681_] = (int) fs[1];
		    ((Class89_Sub3) this).anIntArray9684[i_681_] = (int) fs[2];
		}
	    }
	}
    }
    
    public int method1901() {
	if (!((Class89_Sub3) this).aBool9739)
	    method1922();
	return ((Class89_Sub3) this).aShort9740;
    }
    
    public void method1903(int i) {
	if ((((Class89_Sub3) this).anInt9683 & 0x1000) != 4096)
	    throw new IllegalStateException();
	((Class89_Sub3) this).anInt9707 = i;
	((Class89_Sub3) this).anInt9741 = 0;
    }
    
    final void method16079(boolean bool, boolean bool_682_,
			   boolean bool_683_) {
	for (int i = 0; i < ((Class89_Sub3) this).anInt9726; i++) {
	    Class187 class187 = ((Class89_Sub3) this).aClass187Array9727[i];
	    if (((Class187) class187).aBool2201) {
		Class203 class203
		    = ((Class89_Sub3) this).aClass203Array9728[i];
		((Class89_Sub3) this).aClass103_Sub2_9690.method15380
		    (bool, bool_682_, bool_683_,
		     ((Class203) class203).anInt2420 * -192321089,
		     ((Class203) class203).anInt2421 * -585258371,
		     ((Class203) class203).aFloat2419,
		     ((Class203) class203).anInt2422 * 1388492805,
		     ((Class203) class203).anInt2414 * 1644083687,
		     ((Class187) class187).aShort2199,
		     ((Class203) class203).anInt2417 * -1473589757,
		     ((Class187) class187).aByte2200,
		     ((Class187) class187).aByte2198);
	    }
	}
    }
    
    public boolean method2022() {
	return ((Class89_Sub3) this).aBool9688;
    }
    
    public int method1862() {
	return ((Class89_Sub3) this).anInt9715;
    }
    
    public byte[] method1907() {
	return ((Class89_Sub3) this).aByteArray9711;
    }
    
    public void method1908(short i, short i_684_) {
	for (int i_685_ = 0; i_685_ < ((Class89_Sub3) this).anInt9691;
	     i_685_++) {
	    if (((Class89_Sub3) this).aShortArray9713[i_685_] == i)
		((Class89_Sub3) this).aShortArray9713[i_685_] = i_684_;
	}
	if (((Class89_Sub3) this).aClass187Array9727 != null) {
	    for (int i_686_ = 0; i_686_ < ((Class89_Sub3) this).anInt9726;
		 i_686_++) {
		Class187 class187
		    = ((Class89_Sub3) this).aClass187Array9727[i_686_];
		Class203 class203
		    = ((Class89_Sub3) this).aClass203Array9728[i_686_];
		((Class203) class203).anInt2417
		    = ((((Class203) class203).anInt2417 * -1473589757
			& ~0xffffff)
		       | ((Class474.anIntArray6382
			   [Class241_Sub42.method16451((((Class89_Sub3) this)
							.aShortArray9713
							[(((Class187)
							   class187).anInt2195
							  * 1571719645)]),
						       1773688561) & 0xffff])
			  & 0xffffff)) * 376097963;
	    }
	}
	if (((Class89_Sub3) this).anInt9741 == 2)
	    ((Class89_Sub3) this).anInt9741 = 1;
    }
    
    public void method1909(byte i, byte[] is) {
	if ((((Class89_Sub3) this).anInt9683 & 0x100000) == 0)
	    throw new RuntimeException();
	if (((Class89_Sub3) this).aByteArray9711 == null)
	    ((Class89_Sub3) this).aByteArray9711
		= new byte[((Class89_Sub3) this).anInt9691];
	if (is == null) {
	    for (int i_687_ = 0; i_687_ < ((Class89_Sub3) this).anInt9691;
		 i_687_++)
		((Class89_Sub3) this).aByteArray9711[i_687_] = i;
	} else {
	    for (int i_688_ = 0; i_688_ < ((Class89_Sub3) this).anInt9691;
		 i_688_++) {
		int i_689_ = 255 - ((255 - (is[i_688_] & 0xff))
				    * (255 - (i & 0xff)) / 255);
		((Class89_Sub3) this).aByteArray9711[i_688_] = (byte) i_689_;
	    }
	}
	if (((Class89_Sub3) this).anInt9741 == 2)
	    ((Class89_Sub3) this).anInt9741 = 1;
    }
    
    public void method1985(short i, short i_690_) {
	if (((Class89_Sub3) this).aShortArray9712 != null) {
	    if (!((Class89_Sub3) this).aBool9688 && i_690_ >= 0) {
		Class101 class101
		    = ((Class89_Sub3) this).aClass103_Sub2_9690
			  .aClass107_1458
			  .method2680(i_690_ & 0xffff, -1241649485);
		if (class101.aByte1376 != 0 || class101.aByte1396 != 0)
		    ((Class89_Sub3) this).aBool9688 = true;
	    }
	    for (int i_691_ = 0; i_691_ < ((Class89_Sub3) this).anInt9691;
		 i_691_++) {
		if (((Class89_Sub3) this).aShortArray9712[i_691_] == i)
		    ((Class89_Sub3) this).aShortArray9712[i_691_] = i_690_;
	    }
	}
    }
    
    public void method1911(int i, int i_692_, int i_693_, int i_694_) {
	if ((((Class89_Sub3) this).anInt9683 & 0x80000) != 524288)
	    throw new IllegalStateException();
	for (int i_695_ = 0; i_695_ < ((Class89_Sub3) this).anInt9691;
	     i_695_++) {
	    int i_696_
		= ((Class89_Sub3) this).aShortArray9713[i_695_] & 0xffff;
	    int i_697_ = i_696_ >> 10 & 0x3f;
	    int i_698_ = i_696_ >> 7 & 0x7;
	    int i_699_ = i_696_ & 0x7f;
	    if (i != -1)
		i_697_ += (i - i_697_) * i_694_ >> 7;
	    if (i_692_ != -1)
		i_698_ += (i_692_ - i_698_) * i_694_ >> 7;
	    if (i_693_ != -1)
		i_699_ += (i_693_ - i_699_) * i_694_ >> 7;
	    ((Class89_Sub3) this).aShortArray9713[i_695_]
		= (short) (i_697_ << 10 | i_698_ << 7 | i_699_);
	}
	if (((Class89_Sub3) this).aClass187Array9727 != null) {
	    for (int i_700_ = 0; i_700_ < ((Class89_Sub3) this).anInt9726;
		 i_700_++) {
		Class187 class187
		    = ((Class89_Sub3) this).aClass187Array9727[i_700_];
		Class203 class203
		    = ((Class89_Sub3) this).aClass203Array9728[i_700_];
		((Class203) class203).anInt2417
		    = ((((Class203) class203).anInt2417 * -1473589757
			& ~0xffffff)
		       | ((Class474.anIntArray6382
			   [Class241_Sub42.method16451(((((Class89_Sub3) this)
							 .aShortArray9713
							 [(((Class187)
							    class187).anInt2195
							   * 1571719645)])
							& 0xffff),
						       -1499756838) & 0xffff])
			  & 0xffffff)) * 376097963;
	    }
	}
	if (((Class89_Sub3) this).anInt9741 == 2)
	    ((Class89_Sub3) this).anInt9741 = 1;
    }
    
    public boolean method1968() {
	return ((Class89_Sub3) this).aBool9748;
    }
    
    public int method1996() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9738;
    }
    
    public boolean method1912() {
	if (((Class89_Sub3) this).aShortArray9712 == null)
	    return true;
	for (int i = 0; i < ((Class89_Sub3) this).aShortArray9712.length;
	     i++) {
	    if (((Class89_Sub3) this).aShortArray9712[i] != -1
		&& !((Class89_Sub3) this).aClass103_Sub2_9690
			.method15383(((Class89_Sub3) this).aShortArray9712[i]))
		return false;
	}
	return true;
    }
    
    public boolean method2052() {
	return ((Class89_Sub3) this).aBool9748;
    }
    
    public boolean method1914() {
	return ((Class89_Sub3) this).aBool9688;
    }
    
    static {
	anInt9676 = 4096;
	anInt9699 = 0;
    }
    
    void method16080() {
	if (((Class89_Sub3) this).anInt9741 == 0)
	    method16117(false);
	else if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		  .anInt9274) * 592623211
		 > 1) {
	    synchronized (this) {
		method16056();
	    }
	} else
	    method16056();
    }
    
    void method16081(Thread thread) {
	Class189 class189
	    = ((Class89_Sub3) this).aClass103_Sub2_9690.method15377(thread);
	if (class189 != ((Class89_Sub3) this).aClass189_9673) {
	    ((Class89_Sub3) this).aClass189_9673 = class189;
	    ((Class89_Sub3) this).aClass89_Sub3Array9755
		= (((Class189) ((Class89_Sub3) this).aClass189_9673)
		   .aClass89_Sub3Array2253);
	    ((Class89_Sub3) this).aClass89_Sub3Array9742
		= (((Class189) ((Class89_Sub3) this).aClass189_9673)
		   .aClass89_Sub3Array2248);
	}
    }
    
    void method16082(Thread thread) {
	Class189 class189
	    = ((Class89_Sub3) this).aClass103_Sub2_9690.method15377(thread);
	if (class189 != ((Class89_Sub3) this).aClass189_9673) {
	    ((Class89_Sub3) this).aClass189_9673 = class189;
	    ((Class89_Sub3) this).aClass89_Sub3Array9755
		= (((Class189) ((Class89_Sub3) this).aClass189_9673)
		   .aClass89_Sub3Array2253);
	    ((Class89_Sub3) this).aClass89_Sub3Array9742
		= (((Class189) ((Class89_Sub3) this).aClass189_9673)
		   .aClass89_Sub3Array2248);
	}
    }
    
    void method1953() {
	if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
	     .anInt9274) * 592623211
	    > 1) {
	    synchronized (this) {
		aBool1298 = false;
		this.notifyAll();
	    }
	}
    }
    
    public Class167[] method1917() {
	return ((Class89_Sub3) this).aClass167Array9725;
    }
    
    void method16083() {
	if (((Class89_Sub3) this).anInt9741 == 0
	    && ((Class89_Sub3) this).aClass204Array9692 == null) {
	    if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		 .anInt9274) * 592623211
		> 1) {
		synchronized (this) {
		    method16052();
		}
	    } else
		method16052();
	}
    }
    
    public void method1942(Class89 class89, int i, int i_701_, int i_702_,
			   boolean bool) {
	Class89_Sub3 class89_sub3_703_ = (Class89_Sub3) class89;
	if ((((Class89_Sub3) this).anInt9683 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	if ((((Class89_Sub3) class89_sub3_703_).anInt9683 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	method16049(((Class89_Sub3) this).aClass103_Sub2_9690
			.method15377(Thread.currentThread()));
	method16077();
	method16051();
	class89_sub3_703_.method16077();
	class89_sub3_703_.method16051();
	anInt9699++;
	int i_704_ = 0;
	int[] is = ((Class89_Sub3) class89_sub3_703_).anIntArray9670;
	int i_705_ = ((Class89_Sub3) class89_sub3_703_).anInt9687;
	for (int i_706_ = 0; i_706_ < ((Class89_Sub3) this).anInt9687;
	     i_706_++) {
	    Class204 class204
		= ((Class89_Sub3) this).aClass204Array9692[i_706_];
	    if (((Class204) class204).anInt2426 != 0) {
		int i_707_
		    = ((Class89_Sub3) this).anIntArray9685[i_706_] - i_701_;
		if (i_707_ >= ((Class89_Sub3) class89_sub3_703_).aShort9733
		    && (i_707_
			<= ((Class89_Sub3) class89_sub3_703_).aShort9734)) {
		    int i_708_
			= ((Class89_Sub3) this).anIntArray9670[i_706_] - i;
		    if (i_708_ >= ((Class89_Sub3) class89_sub3_703_).aShort9735
			&& i_708_ <= (((Class89_Sub3) class89_sub3_703_)
				      .aShort9736)) {
			int i_709_
			    = (((Class89_Sub3) this).anIntArray9684[i_706_]
			       - i_702_);
			if ((i_709_
			     >= ((Class89_Sub3) class89_sub3_703_).aShort9737)
			    && i_709_ <= (((Class89_Sub3) class89_sub3_703_)
					  .aShort9738)) {
			    for (int i_710_ = 0; i_710_ < i_705_; i_710_++) {
				Class204 class204_711_
				    = (((Class89_Sub3) class89_sub3_703_)
				       .aClass204Array9692[i_710_]);
				if (i_708_ == is[i_710_]
				    && (i_709_
					== (((Class89_Sub3) class89_sub3_703_)
					    .anIntArray9684[i_710_]))
				    && (i_707_
					== (((Class89_Sub3) class89_sub3_703_)
					    .anIntArray9685[i_710_]))
				    && (((Class204) class204_711_).anInt2426
					!= 0)) {
				    if ((((Class89_Sub3) this)
					 .aClass204Array9744)
					== null)
					((Class89_Sub3) this)
					    .aClass204Array9744
					    = new Class204[((Class89_Sub3)
							    this).anInt9687];
				    if ((((Class89_Sub3) class89_sub3_703_)
					 .aClass204Array9744)
					== null)
					((Class89_Sub3) class89_sub3_703_)
					    .aClass204Array9744
					    = new Class204[i_705_];
				    Class204 class204_712_
					= (((Class89_Sub3) this)
					   .aClass204Array9744[i_706_]);
				    if (class204_712_ == null)
					class204_712_
					    = ((Class89_Sub3) this)
						  .aClass204Array9744[i_706_]
					    = new Class204(class204);
				    Class204 class204_713_
					= (((Class89_Sub3) class89_sub3_703_)
					   .aClass204Array9744[i_710_]);
				    if (class204_713_ == null)
					class204_713_
					    = ((Class89_Sub3)
					       class89_sub3_703_)
						  .aClass204Array9744[i_710_]
					    = new Class204(class204_711_);
				    ((Class204) class204_712_).anInt2429
					+= (((Class204) class204_711_)
					    .anInt2429);
				    ((Class204) class204_712_).anInt2427
					+= (((Class204) class204_711_)
					    .anInt2427);
				    ((Class204) class204_712_).anInt2428
					+= (((Class204) class204_711_)
					    .anInt2428);
				    ((Class204) class204_712_).anInt2426
					+= (((Class204) class204_711_)
					    .anInt2426);
				    ((Class204) class204_713_).anInt2429
					+= ((Class204) class204).anInt2429;
				    ((Class204) class204_713_).anInt2427
					+= ((Class204) class204).anInt2427;
				    ((Class204) class204_713_).anInt2428
					+= ((Class204) class204).anInt2428;
				    ((Class204) class204_713_).anInt2426
					+= ((Class204) class204).anInt2426;
				    i_704_++;
				    ((Class89_Sub3) this).anIntArray9752
					[i_706_]
					= anInt9699;
				    ((Class89_Sub3) this).anIntArray9753
					[i_710_]
					= anInt9699;
				}
			    }
			}
		    }
		}
	    }
	}
	if (i_704_ >= 3 && bool) {
	    for (int i_714_ = 0; i_714_ < ((Class89_Sub3) this).anInt9691;
		 i_714_++) {
		if (((((Class89_Sub3) this).anIntArray9752
		      [((Class89_Sub3) this).aShortArray9696[i_714_]])
		     == anInt9699)
		    && ((((Class89_Sub3) this).anIntArray9752
			 [((Class89_Sub3) this).aShortArray9697[i_714_]])
			== anInt9699)
		    && ((((Class89_Sub3) this).anIntArray9752
			 [((Class89_Sub3) this).aShortArray9698[i_714_]])
			== anInt9699)) {
		    if (((Class89_Sub3) this).aByteArray9709 == null)
			((Class89_Sub3) this).aByteArray9709
			    = new byte[((Class89_Sub3) this).anInt9691];
		    ((Class89_Sub3) this).aByteArray9709[i_714_] = (byte) 2;
		}
	    }
	    for (int i_715_ = 0;
		 i_715_ < ((Class89_Sub3) class89_sub3_703_).anInt9691;
		 i_715_++) {
		if ((((Class89_Sub3) this).anIntArray9753
		     [(((Class89_Sub3) class89_sub3_703_).aShortArray9696
		       [i_715_])]) == anInt9699
		    && (((Class89_Sub3) this).anIntArray9753
			[(((Class89_Sub3) class89_sub3_703_).aShortArray9697
			  [i_715_])]) == anInt9699
		    && (((Class89_Sub3) this).anIntArray9753
			[(((Class89_Sub3) class89_sub3_703_).aShortArray9698
			  [i_715_])]) == anInt9699) {
		    if (((Class89_Sub3) class89_sub3_703_).aByteArray9709
			== null)
			((Class89_Sub3) class89_sub3_703_).aByteArray9709
			    = (new byte
			       [((Class89_Sub3) class89_sub3_703_).anInt9691]);
		    ((Class89_Sub3) class89_sub3_703_).aByteArray9709[i_715_]
			= (byte) 2;
		}
	    }
	}
    }
    
    void method1897(int i, int[] is, int i_716_, int i_717_, int i_718_,
		    int i_719_, boolean bool) {
	int i_720_ = is.length;
	if (i == 0) {
	    i_716_ <<= 4;
	    i_717_ <<= 4;
	    i_718_ <<= 4;
	    if (!((Class89_Sub3) this).aBool9719) {
		for (int i_721_ = 0; i_721_ < ((Class89_Sub3) this).anInt9686;
		     i_721_++) {
		    ((Class89_Sub3) this).anIntArray9670[i_721_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9685[i_721_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9684[i_721_] <<= 4;
		}
		((Class89_Sub3) this).aBool9719 = true;
	    }
	    int i_722_ = 0;
	    ((Class89_Sub3) this).anInt9717 = 0;
	    ((Class89_Sub3) this).anInt9721 = 0;
	    ((Class89_Sub3) this).anInt9722 = 0;
	    for (int i_723_ = 0; i_723_ < i_720_; i_723_++) {
		int i_724_ = is[i_723_];
		if (i_724_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_725_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_724_];
		    for (int i_726_ = 0; i_726_ < is_725_.length; i_726_++) {
			int i_727_ = is_725_[i_726_];
			((Class89_Sub3) this).anInt9717
			    += ((Class89_Sub3) this).anIntArray9670[i_727_];
			((Class89_Sub3) this).anInt9721
			    += ((Class89_Sub3) this).anIntArray9685[i_727_];
			((Class89_Sub3) this).anInt9722
			    += ((Class89_Sub3) this).anIntArray9684[i_727_];
			i_722_++;
		    }
		}
	    }
	    if (i_722_ > 0) {
		((Class89_Sub3) this).anInt9717
		    = ((Class89_Sub3) this).anInt9717 / i_722_ + i_716_;
		((Class89_Sub3) this).anInt9721
		    = ((Class89_Sub3) this).anInt9721 / i_722_ + i_717_;
		((Class89_Sub3) this).anInt9722
		    = ((Class89_Sub3) this).anInt9722 / i_722_ + i_718_;
	    } else {
		((Class89_Sub3) this).anInt9717 = i_716_;
		((Class89_Sub3) this).anInt9721 = i_717_;
		((Class89_Sub3) this).anInt9722 = i_718_;
	    }
	} else if (i == 1) {
	    i_716_ <<= 4;
	    i_717_ <<= 4;
	    i_718_ <<= 4;
	    if (!((Class89_Sub3) this).aBool9719) {
		for (int i_728_ = 0; i_728_ < ((Class89_Sub3) this).anInt9686;
		     i_728_++) {
		    ((Class89_Sub3) this).anIntArray9670[i_728_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9685[i_728_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9684[i_728_] <<= 4;
		}
		((Class89_Sub3) this).aBool9719 = true;
	    }
	    for (int i_729_ = 0; i_729_ < i_720_; i_729_++) {
		int i_730_ = is[i_729_];
		if (i_730_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_731_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_730_];
		    for (int i_732_ = 0; i_732_ < is_731_.length; i_732_++) {
			int i_733_ = is_731_[i_732_];
			((Class89_Sub3) this).anIntArray9670[i_733_] += i_716_;
			((Class89_Sub3) this).anIntArray9685[i_733_] += i_717_;
			((Class89_Sub3) this).anIntArray9684[i_733_] += i_718_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_734_ = 0; i_734_ < i_720_; i_734_++) {
		int i_735_ = is[i_734_];
		if (i_735_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_736_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_735_];
		    if ((i_719_ & 0x1) == 0) {
			for (int i_737_ = 0; i_737_ < is_736_.length;
			     i_737_++) {
			    int i_738_ = is_736_[i_737_];
			    ((Class89_Sub3) this).anIntArray9670[i_738_]
				-= ((Class89_Sub3) this).anInt9717;
			    ((Class89_Sub3) this).anIntArray9685[i_738_]
				-= ((Class89_Sub3) this).anInt9721;
			    ((Class89_Sub3) this).anIntArray9684[i_738_]
				-= ((Class89_Sub3) this).anInt9722;
			    if (i_718_ != 0) {
				int i_739_ = Class282.anIntArray4430[i_718_];
				int i_740_ = Class282.anIntArray4441[i_718_];
				int i_741_
				    = (((((Class89_Sub3) this).anIntArray9685
					 [i_738_]) * i_739_
					+ (((Class89_Sub3) this).anIntArray9670
					   [i_738_]) * i_740_
					+ 16383)
				       >> 14);
				((Class89_Sub3) this).anIntArray9685[i_738_]
				    = ((((Class89_Sub3) this).anIntArray9685
					[i_738_]) * i_740_
				       - (((Class89_Sub3) this).anIntArray9670
					  [i_738_]) * i_739_
				       + 16383) >> 14;
				((Class89_Sub3) this).anIntArray9670[i_738_]
				    = i_741_;
			    }
			    if (i_716_ != 0) {
				int i_742_ = Class282.anIntArray4430[i_716_];
				int i_743_ = Class282.anIntArray4441[i_716_];
				int i_744_
				    = (((((Class89_Sub3) this).anIntArray9685
					 [i_738_]) * i_743_
					- (((Class89_Sub3) this).anIntArray9684
					   [i_738_]) * i_742_
					+ 16383)
				       >> 14);
				((Class89_Sub3) this).anIntArray9684[i_738_]
				    = ((((Class89_Sub3) this).anIntArray9685
					[i_738_]) * i_742_
				       + (((Class89_Sub3) this).anIntArray9684
					  [i_738_]) * i_743_
				       + 16383) >> 14;
				((Class89_Sub3) this).anIntArray9685[i_738_]
				    = i_744_;
			    }
			    if (i_717_ != 0) {
				int i_745_ = Class282.anIntArray4430[i_717_];
				int i_746_ = Class282.anIntArray4441[i_717_];
				int i_747_
				    = (((((Class89_Sub3) this).anIntArray9684
					 [i_738_]) * i_745_
					+ (((Class89_Sub3) this).anIntArray9670
					   [i_738_]) * i_746_
					+ 16383)
				       >> 14);
				((Class89_Sub3) this).anIntArray9684[i_738_]
				    = ((((Class89_Sub3) this).anIntArray9684
					[i_738_]) * i_746_
				       - (((Class89_Sub3) this).anIntArray9670
					  [i_738_]) * i_745_
				       + 16383) >> 14;
				((Class89_Sub3) this).anIntArray9670[i_738_]
				    = i_747_;
			    }
			    ((Class89_Sub3) this).anIntArray9670[i_738_]
				+= ((Class89_Sub3) this).anInt9717;
			    ((Class89_Sub3) this).anIntArray9685[i_738_]
				+= ((Class89_Sub3) this).anInt9721;
			    ((Class89_Sub3) this).anIntArray9684[i_738_]
				+= ((Class89_Sub3) this).anInt9722;
			}
		    } else {
			for (int i_748_ = 0; i_748_ < is_736_.length;
			     i_748_++) {
			    int i_749_ = is_736_[i_748_];
			    ((Class89_Sub3) this).anIntArray9670[i_749_]
				-= ((Class89_Sub3) this).anInt9717;
			    ((Class89_Sub3) this).anIntArray9685[i_749_]
				-= ((Class89_Sub3) this).anInt9721;
			    ((Class89_Sub3) this).anIntArray9684[i_749_]
				-= ((Class89_Sub3) this).anInt9722;
			    if (i_716_ != 0) {
				int i_750_ = Class282.anIntArray4430[i_716_];
				int i_751_ = Class282.anIntArray4441[i_716_];
				int i_752_
				    = (((((Class89_Sub3) this).anIntArray9685
					 [i_749_]) * i_751_
					- (((Class89_Sub3) this).anIntArray9684
					   [i_749_]) * i_750_
					+ 16383)
				       >> 14);
				((Class89_Sub3) this).anIntArray9684[i_749_]
				    = ((((Class89_Sub3) this).anIntArray9685
					[i_749_]) * i_750_
				       + (((Class89_Sub3) this).anIntArray9684
					  [i_749_]) * i_751_
				       + 16383) >> 14;
				((Class89_Sub3) this).anIntArray9685[i_749_]
				    = i_752_;
			    }
			    if (i_718_ != 0) {
				int i_753_ = Class282.anIntArray4430[i_718_];
				int i_754_ = Class282.anIntArray4441[i_718_];
				int i_755_
				    = (((((Class89_Sub3) this).anIntArray9685
					 [i_749_]) * i_753_
					+ (((Class89_Sub3) this).anIntArray9670
					   [i_749_]) * i_754_
					+ 16383)
				       >> 14);
				((Class89_Sub3) this).anIntArray9685[i_749_]
				    = ((((Class89_Sub3) this).anIntArray9685
					[i_749_]) * i_754_
				       - (((Class89_Sub3) this).anIntArray9670
					  [i_749_]) * i_753_
				       + 16383) >> 14;
				((Class89_Sub3) this).anIntArray9670[i_749_]
				    = i_755_;
			    }
			    if (i_717_ != 0) {
				int i_756_ = Class282.anIntArray4430[i_717_];
				int i_757_ = Class282.anIntArray4441[i_717_];
				int i_758_
				    = (((((Class89_Sub3) this).anIntArray9684
					 [i_749_]) * i_756_
					+ (((Class89_Sub3) this).anIntArray9670
					   [i_749_]) * i_757_
					+ 16383)
				       >> 14);
				((Class89_Sub3) this).anIntArray9684[i_749_]
				    = ((((Class89_Sub3) this).anIntArray9684
					[i_749_]) * i_757_
				       - (((Class89_Sub3) this).anIntArray9670
					  [i_749_]) * i_756_
				       + 16383) >> 14;
				((Class89_Sub3) this).anIntArray9670[i_749_]
				    = i_758_;
			    }
			    ((Class89_Sub3) this).anIntArray9670[i_749_]
				+= ((Class89_Sub3) this).anInt9717;
			    ((Class89_Sub3) this).anIntArray9685[i_749_]
				+= ((Class89_Sub3) this).anInt9721;
			    ((Class89_Sub3) this).anIntArray9684[i_749_]
				+= ((Class89_Sub3) this).anInt9722;
			}
		    }
		}
	    }
	} else if (i == 3) {
	    for (int i_759_ = 0; i_759_ < i_720_; i_759_++) {
		int i_760_ = is[i_759_];
		if (i_760_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_761_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_760_];
		    for (int i_762_ = 0; i_762_ < is_761_.length; i_762_++) {
			int i_763_ = is_761_[i_762_];
			((Class89_Sub3) this).anIntArray9670[i_763_]
			    -= ((Class89_Sub3) this).anInt9717;
			((Class89_Sub3) this).anIntArray9685[i_763_]
			    -= ((Class89_Sub3) this).anInt9721;
			((Class89_Sub3) this).anIntArray9684[i_763_]
			    -= ((Class89_Sub3) this).anInt9722;
			((Class89_Sub3) this).anIntArray9670[i_763_]
			    = (((Class89_Sub3) this).anIntArray9670[i_763_]
			       * i_716_ / 128);
			((Class89_Sub3) this).anIntArray9685[i_763_]
			    = (((Class89_Sub3) this).anIntArray9685[i_763_]
			       * i_717_ / 128);
			((Class89_Sub3) this).anIntArray9684[i_763_]
			    = (((Class89_Sub3) this).anIntArray9684[i_763_]
			       * i_718_ / 128);
			((Class89_Sub3) this).anIntArray9670[i_763_]
			    += ((Class89_Sub3) this).anInt9717;
			((Class89_Sub3) this).anIntArray9685[i_763_]
			    += ((Class89_Sub3) this).anInt9721;
			((Class89_Sub3) this).anIntArray9684[i_763_]
			    += ((Class89_Sub3) this).anInt9722;
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub3) this).anIntArrayArray9678 != null
		&& ((Class89_Sub3) this).aByteArray9711 != null) {
		for (int i_764_ = 0; i_764_ < i_720_; i_764_++) {
		    int i_765_ = is[i_764_];
		    if (i_765_
			< ((Class89_Sub3) this).anIntArrayArray9678.length) {
			int[] is_766_ = (((Class89_Sub3) this)
					 .anIntArrayArray9678[i_765_]);
			for (int i_767_ = 0; i_767_ < is_766_.length;
			     i_767_++) {
			    int i_768_ = is_766_[i_767_];
			    int i_769_
				= (((Class89_Sub3) this).aByteArray9711[i_768_]
				   & 0xff) + i_716_ * 8;
			    if (i_769_ < 0)
				i_769_ = 0;
			    else if (i_769_ > 255)
				i_769_ = 255;
			    ((Class89_Sub3) this).aByteArray9711[i_768_]
				= (byte) i_769_;
			}
		    }
		}
		if (((Class89_Sub3) this).aClass187Array9727 != null) {
		    for (int i_770_ = 0;
			 i_770_ < ((Class89_Sub3) this).anInt9726; i_770_++) {
			Class187 class187
			    = ((Class89_Sub3) this).aClass187Array9727[i_770_];
			Class203 class203
			    = ((Class89_Sub3) this).aClass203Array9728[i_770_];
			((Class203) class203).anInt2417
			    = ((((Class203) class203).anInt2417 * -1473589757
				& 0xffffff)
			       | 255 - ((((Class89_Sub3) this).aByteArray9711
					 [(((Class187) class187).anInt2195
					   * 1571719645)])
					& 0xff) << 24) * 376097963;
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub3) this).anIntArrayArray9678 != null) {
		for (int i_771_ = 0; i_771_ < i_720_; i_771_++) {
		    int i_772_ = is[i_771_];
		    if (i_772_
			< ((Class89_Sub3) this).anIntArrayArray9678.length) {
			int[] is_773_ = (((Class89_Sub3) this)
					 .anIntArrayArray9678[i_772_]);
			for (int i_774_ = 0; i_774_ < is_773_.length;
			     i_774_++) {
			    int i_775_ = is_773_[i_774_];
			    int i_776_ = ((((Class89_Sub3) this)
					   .aShortArray9713[i_775_])
					  & 0xffff);
			    int i_777_ = i_776_ >> 10 & 0x3f;
			    int i_778_ = i_776_ >> 7 & 0x7;
			    int i_779_ = i_776_ & 0x7f;
			    i_777_ = i_777_ + i_716_ & 0x3f;
			    i_778_ += i_717_;
			    if (i_778_ < 0)
				i_778_ = 0;
			    else if (i_778_ > 7)
				i_778_ = 7;
			    i_779_ += i_718_;
			    if (i_779_ < 0)
				i_779_ = 0;
			    else if (i_779_ > 127)
				i_779_ = 127;
			    ((Class89_Sub3) this).aShortArray9713[i_775_]
				= (short) (i_777_ << 10 | i_778_ << 7
					   | i_779_);
			}
			((Class89_Sub3) this).aBool9718 = true;
		    }
		}
		if (((Class89_Sub3) this).aClass187Array9727 != null) {
		    for (int i_780_ = 0;
			 i_780_ < ((Class89_Sub3) this).anInt9726; i_780_++) {
			Class187 class187
			    = ((Class89_Sub3) this).aClass187Array9727[i_780_];
			Class203 class203
			    = ((Class89_Sub3) this).aClass203Array9728[i_780_];
			((Class203) class203).anInt2417
			    = (((((Class203) class203).anInt2417 * -1473589757
				 & ~0xffffff)
				| (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     ((((Class89_Sub3) this).aShortArray9713
				       [(((Class187) class187).anInt2195
					 * 1571719645)]) & 0xffff,
				      -1453173729)) & 0xffff]) & 0xffffff)
			       * 376097963);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_781_ = 0; i_781_ < i_720_; i_781_++) {
		    int i_782_ = is[i_781_];
		    if (i_782_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_783_ = (((Class89_Sub3) this)
					 .anIntArrayArray9672[i_782_]);
			for (int i_784_ = 0; i_784_ < is_783_.length;
			     i_784_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_783_[i_784_]]);
			    ((Class203) class203).anInt2423
				+= i_716_ * -378944915;
			    ((Class203) class203).anInt2418
				+= i_717_ * 830599387;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_785_ = 0; i_785_ < i_720_; i_785_++) {
		    int i_786_ = is[i_785_];
		    if (i_786_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_787_ = (((Class89_Sub3) this)
					 .anIntArrayArray9672[i_786_]);
			for (int i_788_ = 0; i_788_ < is_787_.length;
			     i_788_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_787_[i_788_]]);
			    ((Class203) class203).aFloat2415
				= (((Class203) class203).aFloat2415
				   * (float) i_716_ / 128.0F);
			    ((Class203) class203).aFloat2416
				= (((Class203) class203).aFloat2416
				   * (float) i_717_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_789_ = 0; i_789_ < i_720_; i_789_++) {
		    int i_790_ = is[i_789_];
		    if (i_790_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_791_ = (((Class89_Sub3) this)
					 .anIntArrayArray9672[i_790_]);
			for (int i_792_ = 0; i_792_ < is_791_.length;
			     i_792_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_791_[i_792_]]);
			    ((Class203) class203).anInt2424
				= ((((Class203) class203).anInt2424 * 360392329
				    + i_716_)
				   & 0x3fff) * 318648249;
			}
		    }
		}
	    }
	}
    }
    
    void method16084(boolean bool) {
	if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
	     .anInt9274) * 592623211
	    > 1) {
	    synchronized (this) {
		method16053(bool);
	    }
	} else
	    method16053(bool);
    }
    
    void method16085(boolean bool) {
	if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
	     .anInt9274) * 592623211
	    > 1) {
	    synchronized (this) {
		method16053(bool);
	    }
	} else
	    method16053(bool);
    }
    
    void method16086(boolean bool) {
	if (((Class89_Sub3) this).anInt9741 == 1)
	    method16055();
	else if (((Class89_Sub3) this).anInt9741 == 2) {
	    if ((((Class89_Sub3) this).anInt9683 & 0x97098) == 0
		&& ((Class89_Sub3) this).aFloatArrayArray9720 == null)
		((Class89_Sub3) this).aShortArray9713 = null;
	    if (bool)
		((Class89_Sub3) this).aByteArray9709 = null;
	} else {
	    method16051();
	    int i
		= ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		    .anInt9266)
		   * 1091642367);
	    int i_793_
		= ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		    .anInt9258)
		   * 2068876759);
	    int i_794_
		= ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		    .anInt9273)
		   * -1017303393);
	    int i_795_
		= ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		    .anInt9255) * 380315217
		   >> 8);
	    int i_796_ = 0;
	    int i_797_ = 0;
	    if (((Class89_Sub3) this).anInt9715 != 0) {
		i_796_ = (((Class103_Sub2)
			   ((Class89_Sub3) this).aClass103_Sub2_9690).anInt9256
			  * 971221760 / ((Class89_Sub3) this).anInt9715);
		i_797_ = (((Class103_Sub2)
			   ((Class89_Sub3) this).aClass103_Sub2_9690).anInt9257
			  * 2007041280 / ((Class89_Sub3) this).anInt9715);
	    }
	    if (((Class89_Sub3) this).anIntArray9710 == null) {
		((Class89_Sub3) this).anIntArray9710
		    = new int[((Class89_Sub3) this).anInt9691];
		((Class89_Sub3) this).anIntArray9747
		    = new int[((Class89_Sub3) this).anInt9691];
		((Class89_Sub3) this).anIntArray9704
		    = new int[((Class89_Sub3) this).anInt9691];
	    }
	    for (int i_798_ = 0; i_798_ < ((Class89_Sub3) this).anInt9691;
		 i_798_++) {
		byte i_799_;
		if (((Class89_Sub3) this).aByteArray9709 == null)
		    i_799_ = (byte) 0;
		else
		    i_799_ = ((Class89_Sub3) this).aByteArray9709[i_798_];
		byte i_800_;
		if (((Class89_Sub3) this).aByteArray9711 == null)
		    i_800_ = (byte) 0;
		else
		    i_800_ = ((Class89_Sub3) this).aByteArray9711[i_798_];
		short i_801_;
		if (((Class89_Sub3) this).aShortArray9712 == null)
		    i_801_ = (short) -1;
		else
		    i_801_ = ((Class89_Sub3) this).aShortArray9712[i_798_];
		if (i_800_ == -2)
		    i_799_ = (byte) 3;
		if (i_800_ == -1)
		    i_799_ = (byte) 2;
		if (i_801_ == -1) {
		    if (i_799_ == 0) {
			int i_802_
			    = (((Class89_Sub3) this).aShortArray9713[i_798_]
			       & 0xffff);
			int i_803_ = (((i_802_ & 0x7f)
				       * ((Class89_Sub3) this).anInt9707)
				      >> 7);
			short i_804_
			    = Class241_Sub42.method16451((i_802_ & ~0x7f
							  | i_803_),
							 178669537);
			Class204 class204;
			if (((Class89_Sub3) this).aClass204Array9744 != null
			    && (((Class89_Sub3) this).aClass204Array9744
				[(((Class89_Sub3) this).aShortArray9696
				  [i_798_])]) != null)
			    class204
				= (((Class89_Sub3) this).aClass204Array9744
				   [(((Class89_Sub3) this).aShortArray9696
				     [i_798_])]);
			else
			    class204
				= (((Class89_Sub3) this).aClass204Array9692
				   [(((Class89_Sub3) this).aShortArray9696
				     [i_798_])]);
			int i_805_
			    = (((i * ((Class204) class204).anInt2429
				 + i_793_ * ((Class204) class204).anInt2427
				 + i_794_ * ((Class204) class204).anInt2428)
				/ ((Class204) class204).anInt2426)
			       >> 16);
			int i_806_ = i_805_ > 256 ? i_796_ : i_797_;
			int i_807_ = (i_795_ >> 1) + (i_806_ * i_805_ >> 17);
			((Class89_Sub3) this).anIntArray9710[i_798_]
			    = i_807_ << 17 | Class639.method13606(i_804_,
								  i_807_,
								  1779505343);
			if (((Class89_Sub3) this).aClass204Array9744 != null
			    && (((Class89_Sub3) this).aClass204Array9744
				[(((Class89_Sub3) this).aShortArray9697
				  [i_798_])]) != null)
			    class204
				= (((Class89_Sub3) this).aClass204Array9744
				   [(((Class89_Sub3) this).aShortArray9697
				     [i_798_])]);
			else
			    class204
				= (((Class89_Sub3) this).aClass204Array9692
				   [(((Class89_Sub3) this).aShortArray9697
				     [i_798_])]);
			i_805_ = ((i * ((Class204) class204).anInt2429
				   + i_793_ * ((Class204) class204).anInt2427
				   + i_794_ * ((Class204) class204).anInt2428)
				  / ((Class204) class204).anInt2426) >> 16;
			i_806_ = i_805_ > 256 ? i_796_ : i_797_;
			i_807_ = (i_795_ >> 1) + (i_806_ * i_805_ >> 17);
			((Class89_Sub3) this).anIntArray9747[i_798_]
			    = i_807_ << 17 | Class639.method13606(i_804_,
								  i_807_,
								  1214611588);
			if (((Class89_Sub3) this).aClass204Array9744 != null
			    && (((Class89_Sub3) this).aClass204Array9744
				[(((Class89_Sub3) this).aShortArray9698
				  [i_798_])]) != null)
			    class204
				= (((Class89_Sub3) this).aClass204Array9744
				   [(((Class89_Sub3) this).aShortArray9698
				     [i_798_])]);
			else
			    class204
				= (((Class89_Sub3) this).aClass204Array9692
				   [(((Class89_Sub3) this).aShortArray9698
				     [i_798_])]);
			i_805_ = ((i * ((Class204) class204).anInt2429
				   + i_793_ * ((Class204) class204).anInt2427
				   + i_794_ * ((Class204) class204).anInt2428)
				  / ((Class204) class204).anInt2426) >> 16;
			i_806_ = i_805_ > 256 ? i_796_ : i_797_;
			i_807_ = (i_795_ >> 1) + (i_806_ * i_805_ >> 17);
			((Class89_Sub3) this).anIntArray9704[i_798_]
			    = i_807_ << 17 | Class639.method13606(i_804_,
								  i_807_,
								  -1331053004);
		    } else if (i_799_ == 1) {
			int i_808_
			    = (((Class89_Sub3) this).aShortArray9713[i_798_]
			       & 0xffff);
			int i_809_ = (((i_808_ & 0x7f)
				       * ((Class89_Sub3) this).anInt9707)
				      >> 7);
			short i_810_
			    = Class241_Sub42.method16451((i_808_ & ~0x7f
							  | i_809_),
							 -2111132777);
			Class188 class188
			    = ((Class89_Sub3) this).aClass188Array9708[i_798_];
			int i_811_
			    = ((i * ((Class188) class188).anInt2206
				+ i_793_ * ((Class188) class188).anInt2207
				+ i_794_ * ((Class188) class188).anInt2208)
			       >> 16);
			int i_812_ = i_811_ > 256 ? i_796_ : i_797_;
			int i_813_ = (i_795_ >> 1) + (i_812_ * i_811_ >> 17);
			((Class89_Sub3) this).anIntArray9710[i_798_]
			    = i_813_ << 17 | Class639.method13606(i_810_,
								  i_813_,
								  -796450385);
			((Class89_Sub3) this).anIntArray9704[i_798_] = -1;
		    } else if (i_799_ == 3) {
			((Class89_Sub3) this).anIntArray9710[i_798_] = 128;
			((Class89_Sub3) this).anIntArray9704[i_798_] = -1;
		    } else
			((Class89_Sub3) this).anIntArray9704[i_798_] = -2;
		} else {
		    int i_814_ = (((Class89_Sub3) this).aShortArray9713[i_798_]
				  & 0xffff);
		    if (i_799_ == 0) {
			Class204 class204;
			if (((Class89_Sub3) this).aClass204Array9744 != null
			    && (((Class89_Sub3) this).aClass204Array9744
				[(((Class89_Sub3) this).aShortArray9696
				  [i_798_])]) != null)
			    class204
				= (((Class89_Sub3) this).aClass204Array9744
				   [(((Class89_Sub3) this).aShortArray9696
				     [i_798_])]);
			else
			    class204
				= (((Class89_Sub3) this).aClass204Array9692
				   [(((Class89_Sub3) this).aShortArray9696
				     [i_798_])]);
			int i_815_
			    = (((i * ((Class204) class204).anInt2429
				 + i_793_ * ((Class204) class204).anInt2427
				 + i_794_ * ((Class204) class204).anInt2428)
				/ ((Class204) class204).anInt2426)
			       >> 16);
			int i_816_ = i_815_ > 256 ? i_796_ : i_797_;
			int i_817_
			    = method16054((i_795_ >> 2) + (i_816_ * i_815_
							   >> 18));
			((Class89_Sub3) this).anIntArray9710[i_798_]
			    = i_817_ << 24 | method16126(i_814_, i_801_,
							 i_817_);
			if (((Class89_Sub3) this).aClass204Array9744 != null
			    && (((Class89_Sub3) this).aClass204Array9744
				[(((Class89_Sub3) this).aShortArray9697
				  [i_798_])]) != null)
			    class204
				= (((Class89_Sub3) this).aClass204Array9744
				   [(((Class89_Sub3) this).aShortArray9697
				     [i_798_])]);
			else
			    class204
				= (((Class89_Sub3) this).aClass204Array9692
				   [(((Class89_Sub3) this).aShortArray9697
				     [i_798_])]);
			i_815_ = ((i * ((Class204) class204).anInt2429
				   + i_793_ * ((Class204) class204).anInt2427
				   + i_794_ * ((Class204) class204).anInt2428)
				  / ((Class204) class204).anInt2426) >> 16;
			i_816_ = i_815_ > 256 ? i_796_ : i_797_;
			i_817_ = method16054((i_795_ >> 2) + (i_816_ * i_815_
							      >> 18));
			((Class89_Sub3) this).anIntArray9747[i_798_]
			    = i_817_ << 24 | method16126(i_814_, i_801_,
							 i_817_);
			if (((Class89_Sub3) this).aClass204Array9744 != null
			    && (((Class89_Sub3) this).aClass204Array9744
				[(((Class89_Sub3) this).aShortArray9698
				  [i_798_])]) != null)
			    class204
				= (((Class89_Sub3) this).aClass204Array9744
				   [(((Class89_Sub3) this).aShortArray9698
				     [i_798_])]);
			else
			    class204
				= (((Class89_Sub3) this).aClass204Array9692
				   [(((Class89_Sub3) this).aShortArray9698
				     [i_798_])]);
			i_815_ = ((i * ((Class204) class204).anInt2429
				   + i_793_ * ((Class204) class204).anInt2427
				   + i_794_ * ((Class204) class204).anInt2428)
				  / ((Class204) class204).anInt2426) >> 16;
			i_816_ = i_815_ > 256 ? i_796_ : i_797_;
			i_817_ = method16054((i_795_ >> 2) + (i_816_ * i_815_
							      >> 18));
			((Class89_Sub3) this).anIntArray9704[i_798_]
			    = i_817_ << 24 | method16126(i_814_, i_801_,
							 i_817_);
		    } else if (i_799_ == 1) {
			Class188 class188
			    = ((Class89_Sub3) this).aClass188Array9708[i_798_];
			int i_818_
			    = ((i * ((Class188) class188).anInt2206
				+ i_793_ * ((Class188) class188).anInt2207
				+ i_794_ * ((Class188) class188).anInt2208)
			       >> 16);
			int i_819_ = i_818_ > 256 ? i_796_ : i_797_;
			int i_820_
			    = method16054((i_795_ >> 2) + (i_819_ * i_818_
							   >> 18));
			((Class89_Sub3) this).anIntArray9710[i_798_]
			    = i_820_ << 24 | method16126(i_814_, i_801_,
							 i_820_);
			((Class89_Sub3) this).anIntArray9704[i_798_] = -1;
		    } else
			((Class89_Sub3) this).anIntArray9704[i_798_] = -2;
		}
	    }
	    ((Class89_Sub3) this).aClass204Array9692 = null;
	    ((Class89_Sub3) this).aClass204Array9744 = null;
	    ((Class89_Sub3) this).aClass188Array9708 = null;
	    if ((((Class89_Sub3) this).anInt9683 & 0x97098) == 0
		&& ((Class89_Sub3) this).aFloatArrayArray9720 == null)
		((Class89_Sub3) this).aShortArray9713 = null;
	    if (bool)
		((Class89_Sub3) this).aByteArray9709 = null;
	    ((Class89_Sub3) this).anInt9741 = 2;
	}
    }
    
    public void method1874(Class266 class266) {
	method16049(((Class89_Sub3) this).aClass103_Sub2_9690
			.method15377(Thread.currentThread()));
	Class268 class268
	    = ((Class189) ((Class89_Sub3) this).aClass189_9671).aClass268_2225;
	class268.method5203(class266);
	if (((Class89_Sub3) this).aClass106Array9724 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub3) this).aClass106Array9724.length; i++) {
		Class106 class106
		    = ((Class89_Sub3) this).aClass106Array9724[i];
		Class106 class106_821_ = class106;
		if (class106.aClass106_1488 != null)
		    class106_821_ = class106.aClass106_1488;
		class106_821_.anInt1487
		    = (int) (class268.aFloatArray4353[12]
			     + ((class268.aFloatArray4353[0]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[4]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[8]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class106.anInt1490
						* 844698029)])))) * 548844199;
		class106_821_.anInt1495
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class106.anInt1490
						* 844698029)])))) * -237372493;
		class106_821_.anInt1498
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class106.anInt1490
						* 844698029)])))) * 1108321407;
		class106_821_.anInt1497
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1696685061);
		class106_821_.anInt1496
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1783587391);
		class106_821_.anInt1499
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -425190479);
		class106_821_.anInt1500
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * -1671800873);
		class106_821_.anInt1501
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 1675759173);
		class106_821_.anInt1502
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 2116418239);
	    }
	}
	if (((Class89_Sub3) this).aClass167Array9725 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub3) this).aClass167Array9725.length; i++) {
		Class167 class167
		    = ((Class89_Sub3) this).aClass167Array9725[i];
		Class167 class167_822_ = class167;
		if (class167.aClass167_2057 != null)
		    class167_822_ = class167.aClass167_2057;
		if (class167.aClass268_2061 != null)
		    class167.aClass268_2061.method5199(class268);
		else
		    class167.aClass268_2061 = new Class268(class268);
		class167_822_.anInt2060
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [class167.anInt2058 * 294413539]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class167.anInt2058
						 * 294413539)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class167.anInt2058
						 * 294413539)]))))
		       * -1901304929);
		class167_822_.anInt2062
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class167.anInt2058
						* 294413539)])))) * -290266353;
		class167_822_.anInt2056
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class167.anInt2058
						* 294413539)])))) * 1003150305;
	    }
	}
    }
    
    final void method16087(boolean bool, boolean bool_823_, boolean bool_824_,
			   int i, boolean bool_825_, boolean bool_826_) {
	if (((Class89_Sub3) this).anIntArray9704[i] != -2) {
	    short i_827_ = ((Class89_Sub3) this).aShortArray9696[i];
	    short i_828_ = ((Class89_Sub3) this).aShortArray9697[i];
	    short i_829_ = ((Class89_Sub3) this).aShortArray9698[i];
	    float f = ((Class89_Sub3) this).aFloatArray9745[i_827_];
	    float f_830_ = ((Class89_Sub3) this).aFloatArray9745[i_828_];
	    float f_831_ = ((Class89_Sub3) this).aFloatArray9745[i_829_];
	    if (!bool_825_
		|| f != -5000.0F && f_830_ != -5000.0F && f_831_ != -5000.0F) {
		float f_832_ = ((Class89_Sub3) this).aFloatArray9746[i_827_];
		float f_833_ = ((Class89_Sub3) this).aFloatArray9746[i_828_];
		float f_834_ = ((Class89_Sub3) this).aFloatArray9746[i_829_];
		if (((Class89_Sub3) this).anIntArray9675[i] != -1
		    || ((f - f_830_) * (f_834_ - f_833_)
			- (f_832_ - f_833_) * (f_831_ - f_830_)) > 0.0F) {
		    if (f < 0.0F || f_830_ < 0.0F || f_831_ < 0.0F
			|| f > (float) ((((Class189)
					  ((Class89_Sub3) this).aClass189_9671)
					 .anInt2245)
					* -1732416463)
			|| (f_830_
			    > (float) (((Class189) (((Class89_Sub3) this)
						    .aClass189_9671)).anInt2245
				       * -1732416463))
			|| (f_831_
			    > (float) (((Class189) (((Class89_Sub3) this)
						    .aClass189_9671)).anInt2245
				       * -1732416463)))
			((Class155) ((Class89_Sub3) this).aClass155_9674)
			    .aBool1748
			    = true;
		    else
			((Class155) ((Class89_Sub3) this).aClass155_9674)
			    .aBool1748
			    = false;
		    if (bool_826_) {
			int i_835_ = ((Class89_Sub3) this).anIntArray9675[i];
			if (i_835_ == -1 || !((Class187) (((Class89_Sub3) this)
							  .aClass187Array9727
							  [i_835_])).aBool2201)
			    method16074(bool, bool_823_, bool_824_, i);
		    } else {
			int i_836_ = ((Class89_Sub3) this).anIntArray9675[i];
			if (i_836_ != -1) {
			    Class187 class187 = (((Class89_Sub3) this)
						 .aClass187Array9727[i_836_]);
			    Class203 class203 = (((Class89_Sub3) this)
						 .aClass203Array9728[i_836_]);
			    if (!((Class187) class187).aBool2201)
				method16073(bool, bool_823_, bool_824_, i);
			    ((Class89_Sub3) this).aClass103_Sub2_9690
				.method15380
				(bool, bool_823_, bool_824_,
				 ((Class203) class203).anInt2420 * -192321089,
				 ((Class203) class203).anInt2421 * -585258371,
				 ((Class203) class203).aFloat2419,
				 ((Class203) class203).anInt2422 * 1388492805,
				 ((Class203) class203).anInt2414 * 1644083687,
				 ((Class187) class187).aShort2199,
				 ((Class203) class203).anInt2417 * -1473589757,
				 ((Class187) class187).aByte2200,
				 ((Class187) class187).aByte2198);
			} else
			    method16073(bool, bool_823_, bool_824_, i);
		    }
		}
	    }
	}
    }
    
    int method16088(int i, short i_837_, int i_838_) {
	int i_839_ = Class474.anIntArray6383[method16048(i, i_838_)];
	Class101 class101
	    = ((Class89_Sub3) this).aClass103_Sub2_9690.aClass107_1458
		  .method2680(i_837_ & 0xffff, -1150761448);
	int i_840_ = class101.aByte1430 & 0xff;
	if (i_840_ != 0) {
	    int i_841_ = 131586 * i_838_;
	    if (i_840_ == 256)
		i_839_ = i_841_;
	    else {
		int i_842_ = i_840_;
		int i_843_ = 256 - i_840_;
		i_839_ = ((((i_841_ & 0xff00ff) * i_842_
			    + (i_839_ & 0xff00ff) * i_843_)
			   & ~0xff00ff)
			  + (((i_841_ & 0xff00) * i_842_
			      + (i_839_ & 0xff00) * i_843_)
			     & 0xff0000)) >> 8;
	    }
	}
	int i_844_ = class101.aByte1433 & 0xff;
	if (i_844_ != 0) {
	    i_844_ += 256;
	    int i_845_ = ((i_839_ & 0xff0000) >> 16) * i_844_;
	    if (i_845_ > 65535)
		i_845_ = 65535;
	    int i_846_ = ((i_839_ & 0xff00) >> 8) * i_844_;
	    if (i_846_ > 65535)
		i_846_ = 65535;
	    int i_847_ = (i_839_ & 0xff) * i_844_;
	    if (i_847_ > 65535)
		i_847_ = 65535;
	    i_839_
		= (i_845_ << 8 & 0xff0000) + (i_846_ & 0xff00) + (i_847_ >> 8);
	}
	return i_839_;
    }
    
    int method16089(int i, int i_848_) {
	i_848_ = i_848_ * (i & 0x7f) >> 7;
	if (i_848_ < 2)
	    i_848_ = 2;
	else if (i_848_ > 126)
	    i_848_ = 126;
	return (i & 0xff80) + i_848_;
    }
    
    public int method1866() {
	return ((Class89_Sub3) this).anInt9683;
    }
    
    int method16090(int i, int i_849_) {
	i_849_ = i_849_ * (i & 0x7f) >> 7;
	if (i_849_ < 2)
	    i_849_ = 2;
	else if (i_849_ > 126)
	    i_849_ = 126;
	return (i & 0xff80) + i_849_;
    }
    
    public void method2057(int i) {
	if ((((Class89_Sub3) this).anInt9683 & 0x2000) != 8192)
	    throw new IllegalStateException();
	((Class89_Sub3) this).anInt9715 = i;
	((Class89_Sub3) this).anInt9741 = 0;
    }
    
    int method16091(int i) {
	if (i < 2)
	    i = 2;
	else if (i > 126)
	    i = 126;
	return i;
    }
    
    int method16092(int i) {
	if (i < 2)
	    i = 2;
	else if (i > 126)
	    i = 126;
	return i;
    }
    
    int method16093(int i) {
	if (i < 2)
	    i = 2;
	else if (i > 126)
	    i = 126;
	return i;
    }
    
    public void method1932(byte i, byte[] is) {
	if ((((Class89_Sub3) this).anInt9683 & 0x100000) == 0)
	    throw new RuntimeException();
	if (((Class89_Sub3) this).aByteArray9711 == null)
	    ((Class89_Sub3) this).aByteArray9711
		= new byte[((Class89_Sub3) this).anInt9691];
	if (is == null) {
	    for (int i_850_ = 0; i_850_ < ((Class89_Sub3) this).anInt9691;
		 i_850_++)
		((Class89_Sub3) this).aByteArray9711[i_850_] = i;
	} else {
	    for (int i_851_ = 0; i_851_ < ((Class89_Sub3) this).anInt9691;
		 i_851_++) {
		int i_852_ = 255 - ((255 - (is[i_851_] & 0xff))
				    * (255 - (i & 0xff)) / 255);
		((Class89_Sub3) this).aByteArray9711[i_851_] = (byte) i_852_;
	    }
	}
	if (((Class89_Sub3) this).anInt9741 == 2)
	    ((Class89_Sub3) this).anInt9741 = 1;
    }
    
    void method16094() {
	if (((Class89_Sub3) this).anInt9741 == 0)
	    method16117(false);
	else if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		  .anInt9274) * 592623211
		 > 1) {
	    synchronized (this) {
		method16056();
	    }
	} else
	    method16056();
    }
    
    public int method1889() {
	return ((Class89_Sub3) this).anInt9683;
    }
    
    public void method1931(int i) {
	if ((((Class89_Sub3) this).anInt9683 & 0x5) != 5)
	    throw new IllegalStateException();
	if (i == 4096)
	    method16128();
	else if (i == 8192)
	    method16059();
	else if (i == 12288)
	    method16109();
	else {
	    int i_853_ = Class282.anIntArray4430[i];
	    int i_854_ = Class282.anIntArray4441[i];
	    synchronized (this) {
		for (int i_855_ = 0; i_855_ < ((Class89_Sub3) this).anInt9686;
		     i_855_++) {
		    int i_856_
			= (((((Class89_Sub3) this).anIntArray9684[i_855_]
			     * i_853_)
			    + (((Class89_Sub3) this).anIntArray9670[i_855_]
			       * i_854_))
			   >> 14);
		    ((Class89_Sub3) this).anIntArray9684[i_855_]
			= ((((Class89_Sub3) this).anIntArray9684[i_855_]
			    * i_854_)
			   - (((Class89_Sub3) this).anIntArray9670[i_855_]
			      * i_853_)) >> 14;
		    ((Class89_Sub3) this).anIntArray9670[i_855_] = i_856_;
		}
		method16141();
	    }
	}
    }
    
    public int method1926() {
	return ((Class89_Sub3) this).anInt9683;
    }
    
    public int method1986() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9734;
    }
    
    public void method1921(Class89 class89, int i, int i_857_, int i_858_,
			   boolean bool) {
	Class89_Sub3 class89_sub3_859_ = (Class89_Sub3) class89;
	if ((((Class89_Sub3) this).anInt9683 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	if ((((Class89_Sub3) class89_sub3_859_).anInt9683 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	method16049(((Class89_Sub3) this).aClass103_Sub2_9690
			.method15377(Thread.currentThread()));
	method16077();
	method16051();
	class89_sub3_859_.method16077();
	class89_sub3_859_.method16051();
	anInt9699++;
	int i_860_ = 0;
	int[] is = ((Class89_Sub3) class89_sub3_859_).anIntArray9670;
	int i_861_ = ((Class89_Sub3) class89_sub3_859_).anInt9687;
	for (int i_862_ = 0; i_862_ < ((Class89_Sub3) this).anInt9687;
	     i_862_++) {
	    Class204 class204
		= ((Class89_Sub3) this).aClass204Array9692[i_862_];
	    if (((Class204) class204).anInt2426 != 0) {
		int i_863_
		    = ((Class89_Sub3) this).anIntArray9685[i_862_] - i_857_;
		if (i_863_ >= ((Class89_Sub3) class89_sub3_859_).aShort9733
		    && (i_863_
			<= ((Class89_Sub3) class89_sub3_859_).aShort9734)) {
		    int i_864_
			= ((Class89_Sub3) this).anIntArray9670[i_862_] - i;
		    if (i_864_ >= ((Class89_Sub3) class89_sub3_859_).aShort9735
			&& i_864_ <= (((Class89_Sub3) class89_sub3_859_)
				      .aShort9736)) {
			int i_865_
			    = (((Class89_Sub3) this).anIntArray9684[i_862_]
			       - i_858_);
			if ((i_865_
			     >= ((Class89_Sub3) class89_sub3_859_).aShort9737)
			    && i_865_ <= (((Class89_Sub3) class89_sub3_859_)
					  .aShort9738)) {
			    for (int i_866_ = 0; i_866_ < i_861_; i_866_++) {
				Class204 class204_867_
				    = (((Class89_Sub3) class89_sub3_859_)
				       .aClass204Array9692[i_866_]);
				if (i_864_ == is[i_866_]
				    && (i_865_
					== (((Class89_Sub3) class89_sub3_859_)
					    .anIntArray9684[i_866_]))
				    && (i_863_
					== (((Class89_Sub3) class89_sub3_859_)
					    .anIntArray9685[i_866_]))
				    && (((Class204) class204_867_).anInt2426
					!= 0)) {
				    if ((((Class89_Sub3) this)
					 .aClass204Array9744)
					== null)
					((Class89_Sub3) this)
					    .aClass204Array9744
					    = new Class204[((Class89_Sub3)
							    this).anInt9687];
				    if ((((Class89_Sub3) class89_sub3_859_)
					 .aClass204Array9744)
					== null)
					((Class89_Sub3) class89_sub3_859_)
					    .aClass204Array9744
					    = new Class204[i_861_];
				    Class204 class204_868_
					= (((Class89_Sub3) this)
					   .aClass204Array9744[i_862_]);
				    if (class204_868_ == null)
					class204_868_
					    = ((Class89_Sub3) this)
						  .aClass204Array9744[i_862_]
					    = new Class204(class204);
				    Class204 class204_869_
					= (((Class89_Sub3) class89_sub3_859_)
					   .aClass204Array9744[i_866_]);
				    if (class204_869_ == null)
					class204_869_
					    = ((Class89_Sub3)
					       class89_sub3_859_)
						  .aClass204Array9744[i_866_]
					    = new Class204(class204_867_);
				    ((Class204) class204_868_).anInt2429
					+= (((Class204) class204_867_)
					    .anInt2429);
				    ((Class204) class204_868_).anInt2427
					+= (((Class204) class204_867_)
					    .anInt2427);
				    ((Class204) class204_868_).anInt2428
					+= (((Class204) class204_867_)
					    .anInt2428);
				    ((Class204) class204_868_).anInt2426
					+= (((Class204) class204_867_)
					    .anInt2426);
				    ((Class204) class204_869_).anInt2429
					+= ((Class204) class204).anInt2429;
				    ((Class204) class204_869_).anInt2427
					+= ((Class204) class204).anInt2427;
				    ((Class204) class204_869_).anInt2428
					+= ((Class204) class204).anInt2428;
				    ((Class204) class204_869_).anInt2426
					+= ((Class204) class204).anInt2426;
				    i_860_++;
				    ((Class89_Sub3) this).anIntArray9752
					[i_862_]
					= anInt9699;
				    ((Class89_Sub3) this).anIntArray9753
					[i_866_]
					= anInt9699;
				}
			    }
			}
		    }
		}
	    }
	}
	if (i_860_ >= 3 && bool) {
	    for (int i_870_ = 0; i_870_ < ((Class89_Sub3) this).anInt9691;
		 i_870_++) {
		if (((((Class89_Sub3) this).anIntArray9752
		      [((Class89_Sub3) this).aShortArray9696[i_870_]])
		     == anInt9699)
		    && ((((Class89_Sub3) this).anIntArray9752
			 [((Class89_Sub3) this).aShortArray9697[i_870_]])
			== anInt9699)
		    && ((((Class89_Sub3) this).anIntArray9752
			 [((Class89_Sub3) this).aShortArray9698[i_870_]])
			== anInt9699)) {
		    if (((Class89_Sub3) this).aByteArray9709 == null)
			((Class89_Sub3) this).aByteArray9709
			    = new byte[((Class89_Sub3) this).anInt9691];
		    ((Class89_Sub3) this).aByteArray9709[i_870_] = (byte) 2;
		}
	    }
	    for (int i_871_ = 0;
		 i_871_ < ((Class89_Sub3) class89_sub3_859_).anInt9691;
		 i_871_++) {
		if ((((Class89_Sub3) this).anIntArray9753
		     [(((Class89_Sub3) class89_sub3_859_).aShortArray9696
		       [i_871_])]) == anInt9699
		    && (((Class89_Sub3) this).anIntArray9753
			[(((Class89_Sub3) class89_sub3_859_).aShortArray9697
			  [i_871_])]) == anInt9699
		    && (((Class89_Sub3) this).anIntArray9753
			[(((Class89_Sub3) class89_sub3_859_).aShortArray9698
			  [i_871_])]) == anInt9699) {
		    if (((Class89_Sub3) class89_sub3_859_).aByteArray9709
			== null)
			((Class89_Sub3) class89_sub3_859_).aByteArray9709
			    = (new byte
			       [((Class89_Sub3) class89_sub3_859_).anInt9691]);
		    ((Class89_Sub3) class89_sub3_859_).aByteArray9709[i_871_]
			= (byte) 2;
		}
	    }
	}
    }
    
    public int method1998() {
	return ((Class89_Sub3) this).anInt9707;
    }
    
    public Class89 method1923(byte i, int i_872_, boolean bool) {
	method16050(Thread.currentThread());
	boolean bool_873_ = false;
	Class89_Sub3 class89_sub3_874_;
	Class89_Sub3 class89_sub3_875_;
	if (i > 0 && i <= 8) {
	    class89_sub3_875_
		= ((Class89_Sub3) this).aClass89_Sub3Array9742[i - 1];
	    class89_sub3_874_
		= ((Class89_Sub3) this).aClass89_Sub3Array9755[i - 1];
	    bool_873_ = true;
	} else
	    class89_sub3_874_ = class89_sub3_875_
		= new Class89_Sub3(((Class89_Sub3) this).aClass103_Sub2_9690);
	return method16057(class89_sub3_874_, class89_sub3_875_, i_872_,
			   bool_873_, bool);
    }
    
    Class89 method16095(Class89_Sub3 class89_sub3_876_,
			Class89_Sub3 class89_sub3_877_, int i, boolean bool,
			boolean bool_878_) {
	((Class89_Sub3) class89_sub3_876_).aBool9730
	    = ((Class89_Sub3) this).aBool9730;
	if (((Class89_Sub3) this).aBool9730) {
	    ((Class89_Sub3) class89_sub3_876_).aShort9736
		= ((Class89_Sub3) this).aShort9736;
	    ((Class89_Sub3) class89_sub3_876_).aShort9734
		= ((Class89_Sub3) this).aShort9734;
	    ((Class89_Sub3) class89_sub3_876_).aShort9738
		= ((Class89_Sub3) this).aShort9738;
	    ((Class89_Sub3) class89_sub3_876_).aShort9735
		= ((Class89_Sub3) this).aShort9735;
	    ((Class89_Sub3) class89_sub3_876_).aShort9733
		= ((Class89_Sub3) this).aShort9733;
	    ((Class89_Sub3) class89_sub3_876_).aShort9737
		= ((Class89_Sub3) this).aShort9737;
	    ((Class89_Sub3) class89_sub3_876_).aShort9731
		= ((Class89_Sub3) this).aShort9731;
	    ((Class89_Sub3) class89_sub3_876_).aShort9732
		= ((Class89_Sub3) this).aShort9732;
	}
	if (((Class89_Sub3) this).aBool9739) {
	    ((Class89_Sub3) class89_sub3_876_).aShort9740
		= ((Class89_Sub3) this).aShort9740;
	    ((Class89_Sub3) class89_sub3_876_).aBool9739 = true;
	} else
	    ((Class89_Sub3) class89_sub3_876_).aBool9739 = false;
	((Class89_Sub3) class89_sub3_876_).anInt9707
	    = ((Class89_Sub3) this).anInt9707;
	((Class89_Sub3) class89_sub3_876_).anInt9715
	    = ((Class89_Sub3) this).anInt9715;
	((Class89_Sub3) class89_sub3_876_).anInt9686
	    = ((Class89_Sub3) this).anInt9686;
	((Class89_Sub3) class89_sub3_876_).anInt9687
	    = ((Class89_Sub3) this).anInt9687;
	((Class89_Sub3) class89_sub3_876_).anInt9691
	    = ((Class89_Sub3) this).anInt9691;
	((Class89_Sub3) class89_sub3_876_).anInt9726
	    = ((Class89_Sub3) this).anInt9726;
	((Class89_Sub3) class89_sub3_876_).anInt9695
	    = ((Class89_Sub3) this).anInt9695;
	if ((i & 0x100) != 0)
	    ((Class89_Sub3) class89_sub3_876_).aBool9748 = true;
	else
	    ((Class89_Sub3) class89_sub3_876_).aBool9748
		= ((Class89_Sub3) this).aBool9748;
	((Class89_Sub3) class89_sub3_876_).aBool9688
	    = ((Class89_Sub3) this).aBool9688;
	boolean bool_879_ = (i & 0x7) == 7 | (i & 0x20) != 0;
	boolean bool_880_ = bool_879_ || (i & 0x1) != 0;
	boolean bool_881_ = bool_879_ || (i & 0x2) != 0;
	boolean bool_882_ = bool_879_ || (i & 0x4) != 0 || (i & 0x10) != 0;
	if (bool_880_ || bool_881_ || bool_882_) {
	    if (bool_880_) {
		if (((Class89_Sub3) class89_sub3_877_).anIntArray9670 == null
		    || ((((Class89_Sub3) class89_sub3_877_)
			 .anIntArray9670).length
			< ((Class89_Sub3) this).anInt9686))
		    ((Class89_Sub3) class89_sub3_876_).anIntArray9670
			= ((Class89_Sub3) class89_sub3_877_).anIntArray9670
			= new int[((Class89_Sub3) this).anInt9686];
		else
		    ((Class89_Sub3) class89_sub3_876_).anIntArray9670
			= ((Class89_Sub3) class89_sub3_877_).anIntArray9670;
		for (int i_883_ = 0; i_883_ < ((Class89_Sub3) this).anInt9686;
		     i_883_++)
		    ((Class89_Sub3) class89_sub3_876_).anIntArray9670[i_883_]
			= ((Class89_Sub3) this).anIntArray9670[i_883_];
	    } else
		((Class89_Sub3) class89_sub3_876_).anIntArray9670
		    = ((Class89_Sub3) this).anIntArray9670;
	    if (bool_881_) {
		if (((Class89_Sub3) class89_sub3_877_).anIntArray9685 == null
		    || ((((Class89_Sub3) class89_sub3_877_)
			 .anIntArray9685).length
			< ((Class89_Sub3) this).anInt9686))
		    ((Class89_Sub3) class89_sub3_876_).anIntArray9685
			= ((Class89_Sub3) class89_sub3_877_).anIntArray9685
			= new int[((Class89_Sub3) this).anInt9686];
		else
		    ((Class89_Sub3) class89_sub3_876_).anIntArray9685
			= ((Class89_Sub3) class89_sub3_877_).anIntArray9685;
		for (int i_884_ = 0; i_884_ < ((Class89_Sub3) this).anInt9686;
		     i_884_++)
		    ((Class89_Sub3) class89_sub3_876_).anIntArray9685[i_884_]
			= ((Class89_Sub3) this).anIntArray9685[i_884_];
	    } else
		((Class89_Sub3) class89_sub3_876_).anIntArray9685
		    = ((Class89_Sub3) this).anIntArray9685;
	    if (bool_882_) {
		if (((Class89_Sub3) class89_sub3_877_).anIntArray9684 == null
		    || ((((Class89_Sub3) class89_sub3_877_)
			 .anIntArray9684).length
			< ((Class89_Sub3) this).anInt9686))
		    ((Class89_Sub3) class89_sub3_876_).anIntArray9684
			= ((Class89_Sub3) class89_sub3_877_).anIntArray9684
			= new int[((Class89_Sub3) this).anInt9686];
		else
		    ((Class89_Sub3) class89_sub3_876_).anIntArray9684
			= ((Class89_Sub3) class89_sub3_877_).anIntArray9684;
		for (int i_885_ = 0; i_885_ < ((Class89_Sub3) this).anInt9686;
		     i_885_++)
		    ((Class89_Sub3) class89_sub3_876_).anIntArray9684[i_885_]
			= ((Class89_Sub3) this).anIntArray9684[i_885_];
	    } else
		((Class89_Sub3) class89_sub3_876_).anIntArray9684
		    = ((Class89_Sub3) this).anIntArray9684;
	} else {
	    ((Class89_Sub3) class89_sub3_876_).anIntArray9670
		= ((Class89_Sub3) this).anIntArray9670;
	    ((Class89_Sub3) class89_sub3_876_).anIntArray9685
		= ((Class89_Sub3) this).anIntArray9685;
	    ((Class89_Sub3) class89_sub3_876_).anIntArray9684
		= ((Class89_Sub3) this).anIntArray9684;
	}
	if ((i & 0x84080) != 0) {
	    if (((Class89_Sub3) class89_sub3_877_).aShortArray9713 == null
		|| (((Class89_Sub3) class89_sub3_877_).aShortArray9713.length
		    < ((Class89_Sub3) this).anInt9691)) {
		int i_886_ = ((Class89_Sub3) this).anInt9691;
		((Class89_Sub3) class89_sub3_876_).aShortArray9713
		    = ((Class89_Sub3) class89_sub3_877_).aShortArray9713
		    = new short[i_886_];
	    } else
		((Class89_Sub3) class89_sub3_876_).aShortArray9713
		    = ((Class89_Sub3) class89_sub3_877_).aShortArray9713;
	    for (int i_887_ = 0; i_887_ < ((Class89_Sub3) this).anInt9691;
		 i_887_++)
		((Class89_Sub3) class89_sub3_876_).aShortArray9713[i_887_]
		    = ((Class89_Sub3) this).aShortArray9713[i_887_];
	} else
	    ((Class89_Sub3) class89_sub3_876_).aShortArray9713
		= ((Class89_Sub3) this).aShortArray9713;
	if ((i & 0x97018) != 0) {
	    ((Class89_Sub3) class89_sub3_876_).anInt9741 = 0;
	    Class89_Sub3 class89_sub3_888_ = class89_sub3_876_;
	    Class89_Sub3 class89_sub3_889_ = class89_sub3_876_;
	    ((Class89_Sub3) class89_sub3_876_).anIntArray9704 = null;
	    ((Class89_Sub3) class89_sub3_889_).anIntArray9747 = null;
	    ((Class89_Sub3) class89_sub3_888_).anIntArray9710 = null;
	} else if ((i & 0x80) != 0) {
	    if (bool_878_)
		method16117(false);
	    if (((Class89_Sub3) this).anIntArray9710 != null) {
		if (((Class89_Sub3) class89_sub3_877_).anIntArray9710 == null
		    || ((((Class89_Sub3) class89_sub3_877_)
			 .anIntArray9710).length
			< ((Class89_Sub3) this).anInt9691)) {
		    int i_890_ = ((Class89_Sub3) this).anInt9691;
		    ((Class89_Sub3) class89_sub3_876_).anIntArray9710
			= ((Class89_Sub3) class89_sub3_877_).anIntArray9710
			= new int[i_890_];
		    ((Class89_Sub3) class89_sub3_876_).anIntArray9747
			= ((Class89_Sub3) class89_sub3_877_).anIntArray9747
			= new int[i_890_];
		    ((Class89_Sub3) class89_sub3_876_).anIntArray9704
			= ((Class89_Sub3) class89_sub3_877_).anIntArray9704
			= new int[i_890_];
		} else {
		    ((Class89_Sub3) class89_sub3_876_).anIntArray9710
			= ((Class89_Sub3) class89_sub3_877_).anIntArray9710;
		    ((Class89_Sub3) class89_sub3_876_).anIntArray9747
			= ((Class89_Sub3) class89_sub3_877_).anIntArray9747;
		    ((Class89_Sub3) class89_sub3_876_).anIntArray9704
			= ((Class89_Sub3) class89_sub3_877_).anIntArray9704;
		}
		for (int i_891_ = 0; i_891_ < ((Class89_Sub3) this).anInt9691;
		     i_891_++) {
		    ((Class89_Sub3) class89_sub3_876_).anIntArray9710[i_891_]
			= ((Class89_Sub3) this).anIntArray9710[i_891_];
		    ((Class89_Sub3) class89_sub3_876_).anIntArray9747[i_891_]
			= ((Class89_Sub3) this).anIntArray9747[i_891_];
		    ((Class89_Sub3) class89_sub3_876_).anIntArray9704[i_891_]
			= ((Class89_Sub3) this).anIntArray9704[i_891_];
		}
	    }
	    ((Class89_Sub3) class89_sub3_876_).anInt9741
		= ((Class89_Sub3) this).anInt9741;
	} else {
	    if (bool_878_)
		method16117(false);
	    ((Class89_Sub3) class89_sub3_876_).anIntArray9710
		= ((Class89_Sub3) this).anIntArray9710;
	    ((Class89_Sub3) class89_sub3_876_).anIntArray9747
		= ((Class89_Sub3) this).anIntArray9747;
	    ((Class89_Sub3) class89_sub3_876_).anIntArray9704
		= ((Class89_Sub3) this).anIntArray9704;
	    ((Class89_Sub3) class89_sub3_876_).anInt9741
		= ((Class89_Sub3) this).anInt9741;
	}
	if ((i & 0x100) != 0) {
	    if (((Class89_Sub3) class89_sub3_877_).aByteArray9711 == null
		|| (((Class89_Sub3) class89_sub3_877_).aByteArray9711.length
		    < ((Class89_Sub3) this).anInt9691)) {
		int i_892_ = ((Class89_Sub3) this).anInt9691;
		((Class89_Sub3) class89_sub3_876_).aByteArray9711
		    = ((Class89_Sub3) class89_sub3_877_).aByteArray9711
		    = new byte[i_892_];
	    } else
		((Class89_Sub3) class89_sub3_876_).aByteArray9711
		    = ((Class89_Sub3) class89_sub3_877_).aByteArray9711;
	    if (((Class89_Sub3) this).aByteArray9711 != null) {
		for (int i_893_ = 0; i_893_ < ((Class89_Sub3) this).anInt9691;
		     i_893_++)
		    ((Class89_Sub3) class89_sub3_876_).aByteArray9711[i_893_]
			= ((Class89_Sub3) this).aByteArray9711[i_893_];
	    } else {
		for (int i_894_ = 0; i_894_ < ((Class89_Sub3) this).anInt9691;
		     i_894_++)
		    ((Class89_Sub3) class89_sub3_876_).aByteArray9711[i_894_]
			= (byte) 0;
	    }
	} else
	    ((Class89_Sub3) class89_sub3_876_).aByteArray9711
		= ((Class89_Sub3) this).aByteArray9711;
	if ((i & 0x8) != 0 || (i & 0x10) != 0) {
	    if (((Class89_Sub3) class89_sub3_877_).aClass204Array9692 == null
		|| ((((Class89_Sub3) class89_sub3_877_)
		     .aClass204Array9692).length
		    < ((Class89_Sub3) this).anInt9687)) {
		int i_895_ = ((Class89_Sub3) this).anInt9687;
		((Class89_Sub3) class89_sub3_876_).aClass204Array9692
		    = ((Class89_Sub3) class89_sub3_877_).aClass204Array9692
		    = new Class204[i_895_];
	    } else
		((Class89_Sub3) class89_sub3_876_).aClass204Array9692
		    = ((Class89_Sub3) class89_sub3_877_).aClass204Array9692;
	    if (((Class89_Sub3) this).aClass204Array9692 != null) {
		for (int i_896_ = 0; i_896_ < ((Class89_Sub3) this).anInt9687;
		     i_896_++)
		    ((Class89_Sub3) class89_sub3_876_).aClass204Array9692
			[i_896_]
			= new Class204(((Class89_Sub3) this).aClass204Array9692
				       [i_896_]);
	    } else
		((Class89_Sub3) class89_sub3_876_).aClass204Array9692 = null;
	    if (((Class89_Sub3) this).aClass188Array9708 != null) {
		if ((((Class89_Sub3) class89_sub3_877_).aClass188Array9708
		     == null)
		    || ((((Class89_Sub3) class89_sub3_877_)
			 .aClass188Array9708).length
			< ((Class89_Sub3) this).anInt9691)) {
		    int i_897_ = ((Class89_Sub3) this).anInt9691;
		    ((Class89_Sub3) class89_sub3_876_).aClass188Array9708
			= ((Class89_Sub3) class89_sub3_877_).aClass188Array9708
			= new Class188[i_897_];
		} else
		    ((Class89_Sub3) class89_sub3_876_).aClass188Array9708
			= (((Class89_Sub3) class89_sub3_877_)
			   .aClass188Array9708);
		for (int i_898_ = 0; i_898_ < ((Class89_Sub3) this).anInt9691;
		     i_898_++)
		    ((Class89_Sub3) class89_sub3_876_).aClass188Array9708
			[i_898_]
			= ((((Class89_Sub3) this).aClass188Array9708[i_898_]
			    != null)
			   ? new Class188(((Class89_Sub3) this)
					  .aClass188Array9708[i_898_])
			   : null);
	    } else
		((Class89_Sub3) class89_sub3_876_).aClass188Array9708 = null;
	} else {
	    if (bool_878_)
		method16051();
	    ((Class89_Sub3) class89_sub3_876_).aClass204Array9692
		= ((Class89_Sub3) this).aClass204Array9692;
	    ((Class89_Sub3) class89_sub3_876_).aClass188Array9708
		= ((Class89_Sub3) this).aClass188Array9708;
	}
	if ((i & 0x8000) != 0) {
	    if (((Class89_Sub3) this).aShortArray9712 == null)
		((Class89_Sub3) class89_sub3_876_).aShortArray9712 = null;
	    else {
		if (((Class89_Sub3) class89_sub3_877_).aShortArray9712 == null
		    || ((((Class89_Sub3) class89_sub3_877_)
			 .aShortArray9712).length
			< ((Class89_Sub3) this).anInt9691)) {
		    int i_899_ = ((Class89_Sub3) this).anInt9691;
		    ((Class89_Sub3) class89_sub3_876_).aShortArray9712
			= ((Class89_Sub3) class89_sub3_877_).aShortArray9712
			= new short[i_899_];
		} else
		    ((Class89_Sub3) class89_sub3_876_).aShortArray9712
			= ((Class89_Sub3) class89_sub3_877_).aShortArray9712;
		for (int i_900_ = 0; i_900_ < ((Class89_Sub3) this).anInt9691;
		     i_900_++)
		    ((Class89_Sub3) class89_sub3_876_).aShortArray9712[i_900_]
			= ((Class89_Sub3) this).aShortArray9712[i_900_];
	    }
	} else
	    ((Class89_Sub3) class89_sub3_876_).aShortArray9712
		= ((Class89_Sub3) this).aShortArray9712;
	if ((i & 0x10000) != 0) {
	    if (((Class89_Sub3) this).aByteArray9709 == null)
		((Class89_Sub3) class89_sub3_876_).aByteArray9709 = null;
	    else {
		if (((Class89_Sub3) class89_sub3_877_).aByteArray9709 == null
		    || ((((Class89_Sub3) class89_sub3_877_)
			 .aByteArray9709).length
			< ((Class89_Sub3) this).anInt9691)) {
		    int i_901_ = (bool ? ((Class89_Sub3) this).anInt9691 + 100
				  : ((Class89_Sub3) this).anInt9691);
		    ((Class89_Sub3) class89_sub3_876_).aByteArray9709
			= ((Class89_Sub3) class89_sub3_877_).aByteArray9709
			= new byte[i_901_];
		} else
		    ((Class89_Sub3) class89_sub3_876_).aByteArray9709
			= ((Class89_Sub3) class89_sub3_877_).aByteArray9709;
		for (int i_902_ = 0; i_902_ < ((Class89_Sub3) this).anInt9691;
		     i_902_++)
		    ((Class89_Sub3) class89_sub3_876_).aByteArray9709[i_902_]
			= ((Class89_Sub3) this).aByteArray9709[i_902_];
	    }
	} else
	    ((Class89_Sub3) class89_sub3_876_).aByteArray9709
		= ((Class89_Sub3) this).aByteArray9709;
	if ((i & 0xc580) != 0) {
	    if (((Class89_Sub3) class89_sub3_877_).aClass203Array9728 == null
		|| ((((Class89_Sub3) class89_sub3_877_)
		     .aClass203Array9728).length
		    < ((Class89_Sub3) this).anInt9726)) {
		int i_903_ = ((Class89_Sub3) this).anInt9726;
		((Class89_Sub3) class89_sub3_876_).aClass203Array9728
		    = ((Class89_Sub3) class89_sub3_877_).aClass203Array9728
		    = new Class203[i_903_];
		for (int i_904_ = 0; i_904_ < ((Class89_Sub3) this).anInt9726;
		     i_904_++)
		    ((Class89_Sub3) class89_sub3_876_).aClass203Array9728
			[i_904_]
			= ((Class89_Sub3) this).aClass203Array9728[i_904_]
			      .method4081(-1237322533);
	    } else {
		((Class89_Sub3) class89_sub3_876_).aClass203Array9728
		    = ((Class89_Sub3) class89_sub3_877_).aClass203Array9728;
		for (int i_905_ = 0; i_905_ < ((Class89_Sub3) this).anInt9726;
		     i_905_++)
		    ((Class89_Sub3) class89_sub3_876_).aClass203Array9728
			[i_905_].method4082
			(((Class89_Sub3) this).aClass203Array9728[i_905_],
			 -476246880);
	    }
	} else
	    ((Class89_Sub3) class89_sub3_876_).aClass203Array9728
		= ((Class89_Sub3) this).aClass203Array9728;
	if (((Class89_Sub3) this).aFloatArrayArray9720 != null
	    && (i & 0x10) != 0) {
	    if (((Class89_Sub3) class89_sub3_877_).aFloatArrayArray9720 == null
		|| ((((Class89_Sub3) class89_sub3_877_)
		     .aFloatArrayArray9720).length
		    < ((Class89_Sub3) this).anInt9691)) {
		int i_906_ = (bool ? ((Class89_Sub3) this).anInt9691 + 100
			      : ((Class89_Sub3) this).anInt9691);
		((Class89_Sub3) class89_sub3_876_).aFloatArrayArray9720
		    = ((Class89_Sub3) class89_sub3_877_).aFloatArrayArray9720
		    = new float[i_906_][3];
	    } else
		((Class89_Sub3) class89_sub3_876_).aFloatArrayArray9720
		    = ((Class89_Sub3) class89_sub3_877_).aFloatArrayArray9720;
	    for (int i_907_ = 0; i_907_ < ((Class89_Sub3) this).anInt9691;
		 i_907_++) {
		if (((Class89_Sub3) this).aFloatArrayArray9720[i_907_]
		    != null) {
		    ((Class89_Sub3) class89_sub3_876_).aFloatArrayArray9720
			[i_907_][0]
			= (((Class89_Sub3) this).aFloatArrayArray9720[i_907_]
			   [0]);
		    ((Class89_Sub3) class89_sub3_876_).aFloatArrayArray9720
			[i_907_][1]
			= (((Class89_Sub3) this).aFloatArrayArray9720[i_907_]
			   [1]);
		    ((Class89_Sub3) class89_sub3_876_).aFloatArrayArray9720
			[i_907_][2]
			= (((Class89_Sub3) this).aFloatArrayArray9720[i_907_]
			   [2]);
		}
	    }
	    if (((Class89_Sub3) class89_sub3_877_).aFloatArrayArray9703 == null
		|| ((((Class89_Sub3) class89_sub3_877_)
		     .aFloatArrayArray9703).length
		    < ((Class89_Sub3) this).anInt9691)) {
		int i_908_ = (bool ? ((Class89_Sub3) this).anInt9691 + 100
			      : ((Class89_Sub3) this).anInt9691);
		((Class89_Sub3) class89_sub3_876_).aFloatArrayArray9703
		    = ((Class89_Sub3) class89_sub3_877_).aFloatArrayArray9703
		    = new float[i_908_][3];
	    } else
		((Class89_Sub3) class89_sub3_876_).aFloatArrayArray9703
		    = ((Class89_Sub3) class89_sub3_877_).aFloatArrayArray9703;
	    for (int i_909_ = 0; i_909_ < ((Class89_Sub3) this).anInt9691;
		 i_909_++) {
		if (((Class89_Sub3) this).aFloatArrayArray9703[i_909_]
		    != null) {
		    ((Class89_Sub3) class89_sub3_876_).aFloatArrayArray9703
			[i_909_][0]
			= (((Class89_Sub3) this).aFloatArrayArray9703[i_909_]
			   [0]);
		    ((Class89_Sub3) class89_sub3_876_).aFloatArrayArray9703
			[i_909_][1]
			= (((Class89_Sub3) this).aFloatArrayArray9703[i_909_]
			   [1]);
		    ((Class89_Sub3) class89_sub3_876_).aFloatArrayArray9703
			[i_909_][2]
			= (((Class89_Sub3) this).aFloatArrayArray9703[i_909_]
			   [2]);
		}
	    }
	} else {
	    ((Class89_Sub3) class89_sub3_876_).aFloatArrayArray9720
		= ((Class89_Sub3) this).aFloatArrayArray9720;
	    ((Class89_Sub3) class89_sub3_876_).aFloatArrayArray9703
		= ((Class89_Sub3) this).aFloatArrayArray9703;
	}
	((Class89_Sub3) class89_sub3_876_).anIntArrayArray9716
	    = ((Class89_Sub3) this).anIntArrayArray9716;
	((Class89_Sub3) class89_sub3_876_).anIntArrayArray9678
	    = ((Class89_Sub3) this).anIntArrayArray9678;
	((Class89_Sub3) class89_sub3_876_).anIntArrayArray9672
	    = ((Class89_Sub3) this).anIntArrayArray9672;
	((Class89_Sub3) class89_sub3_876_).aShortArray9679
	    = ((Class89_Sub3) this).aShortArray9679;
	((Class89_Sub3) class89_sub3_876_).aShortArray9714
	    = ((Class89_Sub3) this).aShortArray9714;
	((Class89_Sub3) class89_sub3_876_).aByteArray9702
	    = ((Class89_Sub3) this).aByteArray9702;
	((Class89_Sub3) class89_sub3_876_).aShortArray9696
	    = ((Class89_Sub3) this).aShortArray9696;
	((Class89_Sub3) class89_sub3_876_).aShortArray9697
	    = ((Class89_Sub3) this).aShortArray9697;
	((Class89_Sub3) class89_sub3_876_).aShortArray9698
	    = ((Class89_Sub3) this).aShortArray9698;
	((Class89_Sub3) class89_sub3_876_).aClass106Array9724
	    = ((Class89_Sub3) this).aClass106Array9724;
	((Class89_Sub3) class89_sub3_876_).aClass167Array9725
	    = ((Class89_Sub3) this).aClass167Array9725;
	((Class89_Sub3) class89_sub3_876_).aClass187Array9727
	    = ((Class89_Sub3) this).aClass187Array9727;
	((Class89_Sub3) class89_sub3_876_).aShortArray9701
	    = ((Class89_Sub3) this).aShortArray9701;
	((Class89_Sub3) class89_sub3_876_).anInt9683 = i;
	return class89_sub3_876_;
    }
    
    boolean method1884() {
	if (((Class89_Sub3) this).anIntArrayArray9716 == null)
	    return false;
	((Class89_Sub3) this).anInt9717 = 0;
	((Class89_Sub3) this).anInt9721 = 0;
	((Class89_Sub3) this).anInt9722 = 0;
	return true;
    }
    
    public int method1925() {
	return ((Class89_Sub3) this).anInt9683;
    }
    
    public boolean method1969(int i, int i_910_, Class266 class266,
			      boolean bool, int i_911_) {
	method16049(((Class89_Sub3) this).aClass103_Sub2_9690
			.method15377(Thread.currentThread()));
	Class268 class268
	    = ((Class189) ((Class89_Sub3) this).aClass189_9671).aClass268_2225;
	class268.method5203(class266);
	Class268 class268_912_
	    = ((Class189) ((Class89_Sub3) this).aClass189_9671).aClass268_2226;
	class268_912_.method5199(class268);
	class268_912_.method5202(((Class103_Sub2)
				  ((Class89_Sub3) this).aClass103_Sub2_9690)
				 .aClass268_9262);
	boolean bool_913_ = false;
	int i_914_ = 2147483647;
	int i_915_ = -2147483648;
	int i_916_ = 2147483647;
	int i_917_ = -2147483648;
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	int i_918_ = ((((Class89_Sub3) this).aShort9736
		       - ((Class89_Sub3) this).aShort9735)
		      >> 1);
	int i_919_ = ((((Class89_Sub3) this).aShort9734
		       - ((Class89_Sub3) this).aShort9733)
		      >> 1);
	int i_920_ = ((((Class89_Sub3) this).aShort9738
		       - ((Class89_Sub3) this).aShort9737)
		      >> 1);
	int i_921_ = ((Class89_Sub3) this).aShort9735 + i_918_;
	int i_922_ = ((Class89_Sub3) this).aShort9733 + i_919_;
	int i_923_ = ((Class89_Sub3) this).aShort9737 + i_920_;
	int i_924_ = i_921_ - (i_918_ << i_911_);
	int i_925_ = i_922_ - (i_919_ << i_911_);
	int i_926_ = i_923_ - (i_920_ << i_911_);
	int i_927_ = i_921_ + (i_918_ << i_911_);
	int i_928_ = i_922_ + (i_919_ << i_911_);
	int i_929_ = i_923_ + (i_920_ << i_911_);
	((Class89_Sub3) this).anIntArray9749[0] = i_924_;
	((Class89_Sub3) this).anIntArray9750[0] = i_925_;
	((Class89_Sub3) this).anIntArray9751[0] = i_926_;
	((Class89_Sub3) this).anIntArray9749[1] = i_927_;
	((Class89_Sub3) this).anIntArray9750[1] = i_925_;
	((Class89_Sub3) this).anIntArray9751[1] = i_926_;
	((Class89_Sub3) this).anIntArray9749[2] = i_924_;
	((Class89_Sub3) this).anIntArray9750[2] = i_928_;
	((Class89_Sub3) this).anIntArray9751[2] = i_926_;
	((Class89_Sub3) this).anIntArray9749[3] = i_927_;
	((Class89_Sub3) this).anIntArray9750[3] = i_928_;
	((Class89_Sub3) this).anIntArray9751[3] = i_926_;
	((Class89_Sub3) this).anIntArray9749[4] = i_924_;
	((Class89_Sub3) this).anIntArray9750[4] = i_925_;
	((Class89_Sub3) this).anIntArray9751[4] = i_929_;
	((Class89_Sub3) this).anIntArray9749[5] = i_927_;
	((Class89_Sub3) this).anIntArray9750[5] = i_925_;
	((Class89_Sub3) this).anIntArray9751[5] = i_929_;
	((Class89_Sub3) this).anIntArray9749[6] = i_924_;
	((Class89_Sub3) this).anIntArray9750[6] = i_928_;
	((Class89_Sub3) this).anIntArray9751[6] = i_929_;
	((Class89_Sub3) this).anIntArray9749[7] = i_927_;
	((Class89_Sub3) this).anIntArray9750[7] = i_928_;
	((Class89_Sub3) this).anIntArray9751[7] = i_929_;
	for (int i_930_ = 0; i_930_ < 8; i_930_++) {
	    int i_931_ = ((Class89_Sub3) this).anIntArray9749[i_930_];
	    int i_932_ = ((Class89_Sub3) this).anIntArray9750[i_930_];
	    int i_933_ = ((Class89_Sub3) this).anIntArray9751[i_930_];
	    float f = (class268_912_.aFloatArray4353[2] * (float) i_931_
		       + class268_912_.aFloatArray4353[6] * (float) i_932_
		       + class268_912_.aFloatArray4353[10] * (float) i_933_
		       + class268_912_.aFloatArray4353[14]);
	    float f_934_
		= (class268_912_.aFloatArray4353[3] * (float) i_931_
		   + class268_912_.aFloatArray4353[7] * (float) i_932_
		   + class268_912_.aFloatArray4353[11] * (float) i_933_
		   + class268_912_.aFloatArray4353[15]);
	    if (f >= -f_934_) {
		float f_935_
		    = (class268_912_.aFloatArray4353[0] * (float) i_931_
		       + class268_912_.aFloatArray4353[4] * (float) i_932_
		       + class268_912_.aFloatArray4353[8] * (float) i_933_
		       + class268_912_.aFloatArray4353[12]);
		float f_936_
		    = (class268_912_.aFloatArray4353[1] * (float) i_931_
		       + class268_912_.aFloatArray4353[5] * (float) i_932_
		       + class268_912_.aFloatArray4353[9] * (float) i_933_
		       + class268_912_.aFloatArray4353[13]);
		int i_937_ = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
						       .aClass103_Sub2_9690))
				     .aFloat9277)
				    + (((Class103_Sub2) (((Class89_Sub3) this)
							 .aClass103_Sub2_9690))
				       .aFloat9268) * f_935_ / f_934_);
		int i_938_ = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
						       .aClass103_Sub2_9690))
				     .aFloat9271)
				    + (((Class103_Sub2) (((Class89_Sub3) this)
							 .aClass103_Sub2_9690))
				       .aFloat9270) * f_936_ / f_934_);
		if (i_937_ < i_914_)
		    i_914_ = i_937_;
		if (i_937_ > i_915_)
		    i_915_ = i_937_;
		if (i_938_ < i_916_)
		    i_916_ = i_938_;
		if (i_938_ > i_917_)
		    i_917_ = i_938_;
		bool_913_ = true;
	    }
	}
	if (bool_913_ && i > i_914_ && i < i_915_ && i_910_ > i_916_
	    && i_910_ < i_917_) {
	    if (bool)
		return true;
	    for (int i_939_ = 0; i_939_ < ((Class89_Sub3) this).anInt9686;
		 i_939_++) {
		int i_940_ = ((Class89_Sub3) this).anIntArray9670[i_939_];
		int i_941_ = ((Class89_Sub3) this).anIntArray9685[i_939_];
		int i_942_ = ((Class89_Sub3) this).anIntArray9684[i_939_];
		float f = (class268_912_.aFloatArray4353[2] * (float) i_940_
			   + class268_912_.aFloatArray4353[6] * (float) i_941_
			   + class268_912_.aFloatArray4353[10] * (float) i_942_
			   + class268_912_.aFloatArray4353[14]);
		float f_943_
		    = (class268_912_.aFloatArray4353[3] * (float) i_940_
		       + class268_912_.aFloatArray4353[7] * (float) i_941_
		       + class268_912_.aFloatArray4353[11] * (float) i_942_
		       + class268_912_.aFloatArray4353[15]);
		if (f >= -f_943_) {
		    float f_944_
			= (class268_912_.aFloatArray4353[0] * (float) i_940_
			   + class268_912_.aFloatArray4353[4] * (float) i_941_
			   + class268_912_.aFloatArray4353[8] * (float) i_942_
			   + class268_912_.aFloatArray4353[12]);
		    float f_945_
			= (class268_912_.aFloatArray4353[1] * (float) i_940_
			   + class268_912_.aFloatArray4353[5] * (float) i_941_
			   + class268_912_.aFloatArray4353[9] * (float) i_942_
			   + class268_912_.aFloatArray4353[13]);
		    ((Class89_Sub3) this).aFloatArray9745[i_939_]
			= (float) (int) (((Class103_Sub2)
					  (((Class89_Sub3) this)
					   .aClass103_Sub2_9690)).aFloat9277
					 + (((Class103_Sub2)
					     (((Class89_Sub3) this)
					      .aClass103_Sub2_9690)).aFloat9268
					    * f_944_ / f_943_));
		    ((Class89_Sub3) this).aFloatArray9746[i_939_]
			= (float) (int) (((Class103_Sub2)
					  (((Class89_Sub3) this)
					   .aClass103_Sub2_9690)).aFloat9271
					 + (((Class103_Sub2)
					     (((Class89_Sub3) this)
					      .aClass103_Sub2_9690)).aFloat9270
					    * f_945_ / f_943_));
		} else
		    ((Class89_Sub3) this).aFloatArray9745[i_939_] = -999999.0F;
	    }
	    for (int i_946_ = 0; i_946_ < ((Class89_Sub3) this).anInt9695;
		 i_946_++) {
		if (((((Class89_Sub3) this).aFloatArray9745
		      [((Class89_Sub3) this).aShortArray9696[i_946_]])
		     != -999999.0F)
		    && ((((Class89_Sub3) this).aFloatArray9745
			 [((Class89_Sub3) this).aShortArray9697[i_946_]])
			!= -999999.0F)
		    && ((((Class89_Sub3) this).aFloatArray9745
			 [((Class89_Sub3) this).aShortArray9698[i_946_]])
			!= -999999.0F)
		    && (method16076
			(i, i_910_,
			 (((Class89_Sub3) this).aFloatArray9746
			  [((Class89_Sub3) this).aShortArray9696[i_946_]]),
			 (((Class89_Sub3) this).aFloatArray9746
			  [((Class89_Sub3) this).aShortArray9697[i_946_]]),
			 (((Class89_Sub3) this).aFloatArray9746
			  [((Class89_Sub3) this).aShortArray9698[i_946_]]),
			 (((Class89_Sub3) this).aFloatArray9745
			  [((Class89_Sub3) this).aShortArray9696[i_946_]]),
			 (((Class89_Sub3) this).aFloatArray9745
			  [((Class89_Sub3) this).aShortArray9697[i_946_]]),
			 (((Class89_Sub3) this).aFloatArray9745
			  [((Class89_Sub3) this).aShortArray9698[i_946_]]))))
		    return true;
	    }
	}
	return false;
    }
    
    public int method1971() {
	return ((Class89_Sub3) this).anInt9683;
    }
    
    public void method1993(short i, short i_947_) {
	for (int i_948_ = 0; i_948_ < ((Class89_Sub3) this).anInt9691;
	     i_948_++) {
	    if (((Class89_Sub3) this).aShortArray9713[i_948_] == i)
		((Class89_Sub3) this).aShortArray9713[i_948_] = i_947_;
	}
	if (((Class89_Sub3) this).aClass187Array9727 != null) {
	    for (int i_949_ = 0; i_949_ < ((Class89_Sub3) this).anInt9726;
		 i_949_++) {
		Class187 class187
		    = ((Class89_Sub3) this).aClass187Array9727[i_949_];
		Class203 class203
		    = ((Class89_Sub3) this).aClass203Array9728[i_949_];
		((Class203) class203).anInt2417
		    = ((((Class203) class203).anInt2417 * -1473589757
			& ~0xffffff)
		       | ((Class474.anIntArray6382
			   [Class241_Sub42.method16451((((Class89_Sub3) this)
							.aShortArray9713
							[(((Class187)
							   class187).anInt2195
							  * 1571719645)]),
						       490538681) & 0xffff])
			  & 0xffffff)) * 376097963;
	    }
	}
	if (((Class89_Sub3) this).anInt9741 == 2)
	    ((Class89_Sub3) this).anInt9741 = 1;
    }
    
    public void method1929(int i) {
	if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
	     .anInt9274) * 592623211
	    > 1) {
	    synchronized (this) {
		if ((((Class89_Sub3) this).anInt9683 & 0x10000) == 65536
		    && (i & 0x10000) == 0)
		    method16117(true);
		((Class89_Sub3) this).anInt9683 = i;
	    }
	} else {
	    if ((((Class89_Sub3) this).anInt9683 & 0x10000) == 65536
		&& (i & 0x10000) == 0)
		method16117(true);
	    ((Class89_Sub3) this).anInt9683 = i;
	}
    }
    
    public void method1930(int i) {
	if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
	     .anInt9274) * 592623211
	    > 1) {
	    synchronized (this) {
		if ((((Class89_Sub3) this).anInt9683 & 0x10000) == 65536
		    && (i & 0x10000) == 0)
		    method16117(true);
		((Class89_Sub3) this).anInt9683 = i;
	    }
	} else {
	    if ((((Class89_Sub3) this).anInt9683 & 0x10000) == 65536
		&& (i & 0x10000) == 0)
		method16117(true);
	    ((Class89_Sub3) this).anInt9683 = i;
	}
    }
    
    void method16096(boolean bool) {
	if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
	     .anInt9274) * 592623211
	    > 1) {
	    synchronized (this) {
		method16053(bool);
	    }
	} else
	    method16053(bool);
    }
    
    public void method1961(int i) {
	if ((((Class89_Sub3) this).anInt9683 & 0x5) != 5)
	    throw new IllegalStateException();
	if (i == 4096)
	    method16128();
	else if (i == 8192)
	    method16059();
	else if (i == 12288)
	    method16109();
	else {
	    int i_950_ = Class282.anIntArray4430[i];
	    int i_951_ = Class282.anIntArray4441[i];
	    synchronized (this) {
		for (int i_952_ = 0; i_952_ < ((Class89_Sub3) this).anInt9686;
		     i_952_++) {
		    int i_953_
			= (((((Class89_Sub3) this).anIntArray9684[i_952_]
			     * i_950_)
			    + (((Class89_Sub3) this).anIntArray9670[i_952_]
			       * i_951_))
			   >> 14);
		    ((Class89_Sub3) this).anIntArray9684[i_952_]
			= ((((Class89_Sub3) this).anIntArray9684[i_952_]
			    * i_951_)
			   - (((Class89_Sub3) this).anIntArray9670[i_952_]
			      * i_950_)) >> 14;
		    ((Class89_Sub3) this).anIntArray9670[i_952_] = i_953_;
		}
		method16141();
	    }
	}
    }
    
    public void method1933(int i) {
	if ((((Class89_Sub3) this).anInt9683 & 0x5) != 5)
	    throw new IllegalStateException();
	if (i == 4096)
	    method16128();
	else if (i == 8192)
	    method16059();
	else if (i == 12288)
	    method16109();
	else {
	    int i_954_ = Class282.anIntArray4430[i];
	    int i_955_ = Class282.anIntArray4441[i];
	    synchronized (this) {
		for (int i_956_ = 0; i_956_ < ((Class89_Sub3) this).anInt9686;
		     i_956_++) {
		    int i_957_
			= (((((Class89_Sub3) this).anIntArray9684[i_956_]
			     * i_954_)
			    + (((Class89_Sub3) this).anIntArray9670[i_956_]
			       * i_955_))
			   >> 14);
		    ((Class89_Sub3) this).anIntArray9684[i_956_]
			= ((((Class89_Sub3) this).anIntArray9684[i_956_]
			    * i_955_)
			   - (((Class89_Sub3) this).anIntArray9670[i_956_]
			      * i_954_)) >> 14;
		    ((Class89_Sub3) this).anIntArray9670[i_956_] = i_957_;
		}
		method16141();
	    }
	}
    }
    
    public void method1934(int i) {
	if ((((Class89_Sub3) this).anInt9683 & 0xd) != 13)
	    throw new IllegalStateException();
	if (((Class89_Sub3) this).aClass204Array9692 != null) {
	    if (i == 4096)
		method16060();
	    else if (i == 8192)
		method16116();
	    else if (i == 12288)
		method16061();
	    else {
		int i_958_ = Class282.anIntArray4430[i];
		int i_959_ = Class282.anIntArray4441[i];
		synchronized (this) {
		    for (int i_960_ = 0;
			 i_960_ < ((Class89_Sub3) this).anInt9687; i_960_++) {
			int i_961_
			    = (((((Class89_Sub3) this).anIntArray9684[i_960_]
				 * i_958_)
				+ (((Class89_Sub3) this).anIntArray9670[i_960_]
				   * i_959_))
			       >> 14);
			((Class89_Sub3) this).anIntArray9684[i_960_]
			    = ((((Class89_Sub3) this).anIntArray9684[i_960_]
				* i_959_)
			       - (((Class89_Sub3) this).anIntArray9670[i_960_]
				  * i_958_)) >> 14;
			((Class89_Sub3) this).anIntArray9670[i_960_] = i_961_;
			if (((Class89_Sub3) this).aClass204Array9692[i_960_]
			    != null) {
			    i_961_
				= ((((Class204) (((Class89_Sub3) this)
						 .aClass204Array9692[i_960_]))
				    .anInt2428) * i_958_
				   + (((Class204) (((Class89_Sub3) this)
						   .aClass204Array9692
						   [i_960_])).anInt2429
				      * i_959_)) >> 14;
			    ((Class204) (((Class89_Sub3) this)
					 .aClass204Array9692
					 [i_960_])).anInt2428
				= ((((Class204) (((Class89_Sub3) this)
						 .aClass204Array9692[i_960_]))
				    .anInt2428) * i_959_
				   - (((Class204) (((Class89_Sub3) this)
						   .aClass204Array9692
						   [i_960_])).anInt2429
				      * i_958_)) >> 14;
			    ((Class204) (((Class89_Sub3) this)
					 .aClass204Array9692
					 [i_960_])).anInt2429
				= i_961_;
			}
		    }
		    if (((Class89_Sub3) this).aClass188Array9708 != null) {
			for (int i_962_ = 0;
			     i_962_ < ((Class89_Sub3) this).anInt9691;
			     i_962_++) {
			    if ((((Class89_Sub3) this).aClass188Array9708
				 [i_962_])
				!= null) {
				int i_963_
				    = (((((Class188) (((Class89_Sub3) this)
						      .aClass188Array9708
						      [i_962_])).anInt2208
					 * i_958_)
					+ (((Class188) (((Class89_Sub3) this)
							.aClass188Array9708
							[i_962_])).anInt2206
					   * i_959_))
				       >> 14);
				((Class188) (((Class89_Sub3) this)
					     .aClass188Array9708
					     [i_962_])).anInt2208
				    = ((((Class188) (((Class89_Sub3) this)
						     .aClass188Array9708
						     [i_962_])).anInt2208
					* i_959_)
				       - (((Class188) (((Class89_Sub3) this)
						       .aClass188Array9708
						       [i_962_])).anInt2206
					  * i_958_)) >> 14;
				((Class188) (((Class89_Sub3) this)
					     .aClass188Array9708
					     [i_962_])).anInt2206
				    = i_963_;
			    }
			}
		    }
		    for (int i_964_ = ((Class89_Sub3) this).anInt9687;
			 i_964_ < ((Class89_Sub3) this).anInt9686; i_964_++) {
			int i_965_
			    = (((((Class89_Sub3) this).anIntArray9684[i_964_]
				 * i_958_)
				+ (((Class89_Sub3) this).anIntArray9670[i_964_]
				   * i_959_))
			       >> 14);
			((Class89_Sub3) this).anIntArray9684[i_964_]
			    = ((((Class89_Sub3) this).anIntArray9684[i_964_]
				* i_959_)
			       - (((Class89_Sub3) this).anIntArray9670[i_964_]
				  * i_958_)) >> 14;
			((Class89_Sub3) this).anIntArray9670[i_964_] = i_965_;
		    }
		    ((Class89_Sub3) this).anInt9741 = 0;
		    ((Class89_Sub3) this).aBool9730 = false;
		}
	    }
	} else
	    method1868(i);
    }
    
    void method16097() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9686; i++) {
		int i_966_ = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i]
		    = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i] = -i_966_;
	    }
	    method16141();
	}
    }
    
    void method16098() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9686; i++) {
		int i_967_ = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i]
		    = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i] = -i_967_;
	    }
	    method16141();
	}
    }
    
    final boolean method16099(int i) {
	if (((Class89_Sub3) this).aByteArray9711 == null)
	    return false;
	if (((Class89_Sub3) this).aByteArray9711[i] == 0)
	    return false;
	return true;
    }
    
    public void method1990(int i) {
	if ((((Class89_Sub3) this).anInt9683 & 0x3) != 3)
	    throw new IllegalStateException();
	int i_968_ = Class282.anIntArray4430[i];
	int i_969_ = Class282.anIntArray4441[i];
	synchronized (this) {
	    for (int i_970_ = 0; i_970_ < ((Class89_Sub3) this).anInt9686;
		 i_970_++) {
		int i_971_
		    = ((((Class89_Sub3) this).anIntArray9685[i_970_] * i_968_
			+ (((Class89_Sub3) this).anIntArray9670[i_970_]
			   * i_969_))
		       >> 14);
		((Class89_Sub3) this).anIntArray9685[i_970_]
		    = (((Class89_Sub3) this).anIntArray9685[i_970_] * i_969_
		       - (((Class89_Sub3) this).anIntArray9670[i_970_]
			  * i_968_)) >> 14;
		((Class89_Sub3) this).anIntArray9670[i_970_] = i_971_;
	    }
	    method16141();
	}
    }
    
    final void method16100(boolean bool, boolean bool_972_, boolean bool_973_,
			   int i) {
	short i_974_ = ((Class89_Sub3) this).aShortArray9696[i];
	short i_975_ = ((Class89_Sub3) this).aShortArray9697[i];
	short i_976_ = ((Class89_Sub3) this).aShortArray9698[i];
	int i_977_ = -1;
	if (((Class89_Sub3) this).aShortArray9712 != null
	    && ((Class89_Sub3) this).aShortArray9712[i] != -1)
	    i_977_ = (((Class89_Sub3) this).aClass103_Sub2_9690
			  .aClass107_1458.method2680
		      (((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
		       387743639)
		      .anInt1403) * 218388063;
	if (i_977_ == -1) {
	    if (((Class89_Sub3) this).aByteArray9711 == null)
		((Class155) ((Class89_Sub3) this).aClass155_9674).anInt1723
		    = 0;
	    else
		((Class155) ((Class89_Sub3) this).aClass155_9674).anInt1723
		    = ((Class89_Sub3) this).aByteArray9711[i] & 0xff;
	    if (((Class89_Sub3) this).anIntArray9704[i] == -1)
		((Class89_Sub3) this).aClass155_9674.method3377
		    (bool, bool_972_, bool_973_,
		     ((Class89_Sub3) this).aFloatArray9746[i_974_],
		     ((Class89_Sub3) this).aFloatArray9746[i_975_],
		     ((Class89_Sub3) this).aFloatArray9746[i_976_],
		     ((Class89_Sub3) this).aFloatArray9745[i_974_],
		     ((Class89_Sub3) this).aFloatArray9745[i_975_],
		     ((Class89_Sub3) this).aFloatArray9745[i_976_],
		     ((Class89_Sub3) this).aFloatArray9756[i_974_],
		     ((Class89_Sub3) this).aFloatArray9756[i_975_],
		     ((Class89_Sub3) this).aFloatArray9756[i_976_],
		     (Class474.anIntArray6382
		      [((Class89_Sub3) this).anIntArray9710[i] & 0xffff]));
	    else
		((Class89_Sub3) this).aClass155_9674.method3380
		    (bool, bool_972_, bool_973_,
		     ((Class89_Sub3) this).aFloatArray9746[i_974_],
		     ((Class89_Sub3) this).aFloatArray9746[i_975_],
		     ((Class89_Sub3) this).aFloatArray9746[i_976_],
		     ((Class89_Sub3) this).aFloatArray9745[i_974_],
		     ((Class89_Sub3) this).aFloatArray9745[i_975_],
		     ((Class89_Sub3) this).aFloatArray9745[i_976_],
		     ((Class89_Sub3) this).aFloatArray9756[i_974_],
		     ((Class89_Sub3) this).aFloatArray9756[i_975_],
		     ((Class89_Sub3) this).aFloatArray9756[i_976_],
		     (float) (((Class89_Sub3) this).anIntArray9710[i]
			      & 0xffff),
		     (float) (((Class89_Sub3) this).anIntArray9747[i]
			      & 0xffff),
		     (float) (((Class89_Sub3) this).anIntArray9704[i]
			      & 0xffff));
	} else {
	    int i_978_ = -16777216;
	    if (((Class89_Sub3) this).aByteArray9711 != null)
		i_978_ = 255 - (((Class89_Sub3) this).aByteArray9711[i]
				& 0xff) << 24;
	    if (((Class89_Sub3) this).anIntArray9704[i] == -1) {
		int i_979_
		    = (i_978_
		       | ((Class89_Sub3) this).anIntArray9710[i] & 0xffffff);
		((Class89_Sub3) this).aClass155_9674.method3384
		    (bool, bool_972_, bool_973_,
		     ((Class89_Sub3) this).aFloatArray9746[i_974_],
		     ((Class89_Sub3) this).aFloatArray9746[i_975_],
		     ((Class89_Sub3) this).aFloatArray9746[i_976_],
		     ((Class89_Sub3) this).aFloatArray9745[i_974_],
		     ((Class89_Sub3) this).aFloatArray9745[i_975_],
		     ((Class89_Sub3) this).aFloatArray9745[i_976_],
		     ((Class89_Sub3) this).aFloatArray9756[i_974_],
		     ((Class89_Sub3) this).aFloatArray9756[i_975_],
		     ((Class89_Sub3) this).aFloatArray9756[i_976_],
		     ((Class89_Sub3) this).aFloatArray9700[i_974_],
		     ((Class89_Sub3) this).aFloatArray9700[i_975_],
		     ((Class89_Sub3) this).aFloatArray9700[i_976_],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][0],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][1],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][2],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][0],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][1],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][2], i_979_,
		     i_979_, i_979_,
		     (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .anInt2215) * -338296791,
		     0.0F, 0.0F, 0.0F,
		     ((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
		     i_977_);
	    } else
		((Class89_Sub3) this).aClass155_9674.method3384
		    (bool, bool_972_, bool_973_,
		     ((Class89_Sub3) this).aFloatArray9746[i_974_],
		     ((Class89_Sub3) this).aFloatArray9746[i_975_],
		     ((Class89_Sub3) this).aFloatArray9746[i_976_],
		     ((Class89_Sub3) this).aFloatArray9745[i_974_],
		     ((Class89_Sub3) this).aFloatArray9745[i_975_],
		     ((Class89_Sub3) this).aFloatArray9745[i_976_],
		     ((Class89_Sub3) this).aFloatArray9756[i_974_],
		     ((Class89_Sub3) this).aFloatArray9756[i_975_],
		     ((Class89_Sub3) this).aFloatArray9756[i_976_],
		     ((Class89_Sub3) this).aFloatArray9700[i_974_],
		     ((Class89_Sub3) this).aFloatArray9700[i_975_],
		     ((Class89_Sub3) this).aFloatArray9700[i_976_],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][0],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][1],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][2],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][0],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][1],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][2],
		     (i_978_
		      | ((Class89_Sub3) this).anIntArray9710[i] & 0xffffff),
		     (i_978_
		      | ((Class89_Sub3) this).anIntArray9747[i] & 0xffffff),
		     (i_978_
		      | ((Class89_Sub3) this).anIntArray9704[i] & 0xffffff),
		     (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .anInt2215) * -338296791,
		     0.0F, 0.0F, 0.0F,
		     ((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
		     i_977_);
	}
    }
    
    void method16101() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9686; i++) {
		int i_980_ = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i] = -i_980_;
	    }
	    method16141();
	}
    }
    
    void method16102() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9686; i++) {
		int i_981_ = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i] = -i_981_;
	    }
	    method16141();
	}
    }
    
    public void method1922() {
	if (!((Class89_Sub3) this).aBool9739) {
	    if (!((Class89_Sub3) this).aBool9730)
		method16077();
	    ((Class89_Sub3) this).aShort9740
		= ((Class89_Sub3) this).aShort9733;
	    ((Class89_Sub3) this).aBool9739 = true;
	}
    }
    
    void method16103() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9687; i++) {
		int i_982_ = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i]
		    = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i] = -i_982_;
		if (((Class89_Sub3) this).aClass204Array9692[i] != null) {
		    i_982_ = ((Class204) (((Class89_Sub3) this)
					  .aClass204Array9692[i])).anInt2429;
		    ((Class204) ((Class89_Sub3) this).aClass204Array9692[i])
			.anInt2429
			= ((Class204) (((Class89_Sub3) this).aClass204Array9692
				       [i])).anInt2428;
		    ((Class204) ((Class89_Sub3) this).aClass204Array9692[i])
			.anInt2428
			= -i_982_;
		}
	    }
	    if (((Class89_Sub3) this).aClass188Array9708 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9691; i++) {
		    if (((Class89_Sub3) this).aClass188Array9708[i] != null) {
			int i_983_ = (((Class188) (((Class89_Sub3) this)
						   .aClass188Array9708[i]))
				      .anInt2206);
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2206
			    = ((Class188) (((Class89_Sub3) this)
					   .aClass188Array9708[i])).anInt2208;
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2208
			    = -i_983_;
		    }
		}
	    }
	    for (int i = ((Class89_Sub3) this).anInt9687;
		 i < ((Class89_Sub3) this).anInt9686; i++) {
		int i_984_ = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i]
		    = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i] = -i_984_;
	    }
	    ((Class89_Sub3) this).anInt9741 = 0;
	    ((Class89_Sub3) this).aBool9730 = false;
	}
    }
    
    void method16104() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9687; i++) {
		((Class89_Sub3) this).anIntArray9670[i]
		    = -((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = -((Class89_Sub3) this).anIntArray9684[i];
		if (((Class89_Sub3) this).aClass204Array9692[i] != null) {
		    ((Class204) ((Class89_Sub3) this).aClass204Array9692[i])
			.anInt2429
			= -((Class204) (((Class89_Sub3) this)
					.aClass204Array9692[i])).anInt2429;
		    ((Class204) ((Class89_Sub3) this).aClass204Array9692[i])
			.anInt2428
			= -((Class204) (((Class89_Sub3) this)
					.aClass204Array9692[i])).anInt2428;
		}
	    }
	    if (((Class89_Sub3) this).aClass188Array9708 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9691; i++) {
		    if (((Class89_Sub3) this).aClass188Array9708[i] != null) {
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2206
			    = -((Class188) (((Class89_Sub3) this)
					    .aClass188Array9708[i])).anInt2206;
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2208
			    = -((Class188) (((Class89_Sub3) this)
					    .aClass188Array9708[i])).anInt2208;
		    }
		}
	    }
	    for (int i = ((Class89_Sub3) this).anInt9687;
		 i < ((Class89_Sub3) this).anInt9686; i++) {
		((Class89_Sub3) this).anIntArray9670[i]
		    = -((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = -((Class89_Sub3) this).anIntArray9684[i];
	    }
	    ((Class89_Sub3) this).anInt9741 = 0;
	    ((Class89_Sub3) this).aBool9730 = false;
	}
    }
    
    void method16105() {
	if (((Class89_Sub3) this).anInt9741 == 0
	    && ((Class89_Sub3) this).aClass204Array9692 == null) {
	    if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		 .anInt9274) * 592623211
		> 1) {
		synchronized (this) {
		    method16052();
		}
	    } else
		method16052();
	}
    }
    
    public int method1982() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9736;
    }
    
    void method16106() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9687; i++) {
		int i_985_ = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i] = -i_985_;
		if (((Class89_Sub3) this).aClass204Array9692[i] != null) {
		    i_985_ = ((Class204) (((Class89_Sub3) this)
					  .aClass204Array9692[i])).anInt2428;
		    ((Class204) ((Class89_Sub3) this).aClass204Array9692[i])
			.anInt2428
			= ((Class204) (((Class89_Sub3) this).aClass204Array9692
				       [i])).anInt2429;
		    ((Class204) ((Class89_Sub3) this).aClass204Array9692[i])
			.anInt2429
			= -i_985_;
		}
	    }
	    if (((Class89_Sub3) this).aClass188Array9708 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9691; i++) {
		    if (((Class89_Sub3) this).aClass188Array9708[i] != null) {
			int i_986_ = (((Class188) (((Class89_Sub3) this)
						   .aClass188Array9708[i]))
				      .anInt2208);
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2208
			    = ((Class188) (((Class89_Sub3) this)
					   .aClass188Array9708[i])).anInt2206;
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2206
			    = -i_986_;
		    }
		}
	    }
	    for (int i = ((Class89_Sub3) this).anInt9687;
		 i < ((Class89_Sub3) this).anInt9686; i++) {
		int i_987_ = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i] = -i_987_;
	    }
	    ((Class89_Sub3) this).anInt9741 = 0;
	    ((Class89_Sub3) this).aBool9730 = false;
	}
    }
    
    void method16107() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9687; i++) {
		int i_988_ = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i] = -i_988_;
		if (((Class89_Sub3) this).aClass204Array9692[i] != null) {
		    i_988_ = ((Class204) (((Class89_Sub3) this)
					  .aClass204Array9692[i])).anInt2428;
		    ((Class204) ((Class89_Sub3) this).aClass204Array9692[i])
			.anInt2428
			= ((Class204) (((Class89_Sub3) this).aClass204Array9692
				       [i])).anInt2429;
		    ((Class204) ((Class89_Sub3) this).aClass204Array9692[i])
			.anInt2429
			= -i_988_;
		}
	    }
	    if (((Class89_Sub3) this).aClass188Array9708 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9691; i++) {
		    if (((Class89_Sub3) this).aClass188Array9708[i] != null) {
			int i_989_ = (((Class188) (((Class89_Sub3) this)
						   .aClass188Array9708[i]))
				      .anInt2208);
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2208
			    = ((Class188) (((Class89_Sub3) this)
					   .aClass188Array9708[i])).anInt2206;
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2206
			    = -i_989_;
		    }
		}
	    }
	    for (int i = ((Class89_Sub3) this).anInt9687;
		 i < ((Class89_Sub3) this).anInt9686; i++) {
		int i_990_ = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i] = -i_990_;
	    }
	    ((Class89_Sub3) this).anInt9741 = 0;
	    ((Class89_Sub3) this).aBool9730 = false;
	}
    }
    
    void method16108() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9687; i++) {
		int i_991_ = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i] = -i_991_;
		if (((Class89_Sub3) this).aClass204Array9692[i] != null) {
		    i_991_ = ((Class204) (((Class89_Sub3) this)
					  .aClass204Array9692[i])).anInt2428;
		    ((Class204) ((Class89_Sub3) this).aClass204Array9692[i])
			.anInt2428
			= ((Class204) (((Class89_Sub3) this).aClass204Array9692
				       [i])).anInt2429;
		    ((Class204) ((Class89_Sub3) this).aClass204Array9692[i])
			.anInt2429
			= -i_991_;
		}
	    }
	    if (((Class89_Sub3) this).aClass188Array9708 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9691; i++) {
		    if (((Class89_Sub3) this).aClass188Array9708[i] != null) {
			int i_992_ = (((Class188) (((Class89_Sub3) this)
						   .aClass188Array9708[i]))
				      .anInt2208);
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2208
			    = ((Class188) (((Class89_Sub3) this)
					   .aClass188Array9708[i])).anInt2206;
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2206
			    = -i_992_;
		    }
		}
	    }
	    for (int i = ((Class89_Sub3) this).anInt9687;
		 i < ((Class89_Sub3) this).anInt9686; i++) {
		int i_993_ = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i] = -i_993_;
	    }
	    ((Class89_Sub3) this).anInt9741 = 0;
	    ((Class89_Sub3) this).aBool9730 = false;
	}
    }
    
    public void method1935(int i) {
	if ((((Class89_Sub3) this).anInt9683 & 0x6) != 6)
	    throw new IllegalStateException();
	int i_994_ = Class282.anIntArray4430[i];
	int i_995_ = Class282.anIntArray4441[i];
	synchronized (this) {
	    for (int i_996_ = 0; i_996_ < ((Class89_Sub3) this).anInt9686;
		 i_996_++) {
		int i_997_
		    = ((((Class89_Sub3) this).anIntArray9685[i_996_] * i_995_
			- (((Class89_Sub3) this).anIntArray9684[i_996_]
			   * i_994_))
		       >> 14);
		((Class89_Sub3) this).anIntArray9684[i_996_]
		    = (((Class89_Sub3) this).anIntArray9685[i_996_] * i_994_
		       + (((Class89_Sub3) this).anIntArray9684[i_996_]
			  * i_995_)) >> 14;
		((Class89_Sub3) this).anIntArray9685[i_996_] = i_997_;
	    }
	    method16141();
	}
    }
    
    public void method1936(int i) {
	if ((((Class89_Sub3) this).anInt9683 & 0x6) != 6)
	    throw new IllegalStateException();
	int i_998_ = Class282.anIntArray4430[i];
	int i_999_ = Class282.anIntArray4441[i];
	synchronized (this) {
	    for (int i_1000_ = 0; i_1000_ < ((Class89_Sub3) this).anInt9686;
		 i_1000_++) {
		int i_1001_
		    = ((((Class89_Sub3) this).anIntArray9685[i_1000_] * i_999_
			- (((Class89_Sub3) this).anIntArray9684[i_1000_]
			   * i_998_))
		       >> 14);
		((Class89_Sub3) this).anIntArray9684[i_1000_]
		    = (((Class89_Sub3) this).anIntArray9685[i_1000_] * i_998_
		       + (((Class89_Sub3) this).anIntArray9684[i_1000_]
			  * i_999_)) >> 14;
		((Class89_Sub3) this).anIntArray9685[i_1000_] = i_1001_;
	    }
	    method16141();
	}
    }
    
    void method16109() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9686; i++) {
		int i_1002_ = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i] = -i_1002_;
	    }
	    method16141();
	}
    }
    
    public void method1938(int i) {
	if ((((Class89_Sub3) this).anInt9683 & 0x3) != 3)
	    throw new IllegalStateException();
	int i_1003_ = Class282.anIntArray4430[i];
	int i_1004_ = Class282.anIntArray4441[i];
	synchronized (this) {
	    for (int i_1005_ = 0; i_1005_ < ((Class89_Sub3) this).anInt9686;
		 i_1005_++) {
		int i_1006_
		    = ((((Class89_Sub3) this).anIntArray9685[i_1005_] * i_1003_
			+ (((Class89_Sub3) this).anIntArray9670[i_1005_]
			   * i_1004_))
		       >> 14);
		((Class89_Sub3) this).anIntArray9685[i_1005_]
		    = (((Class89_Sub3) this).anIntArray9685[i_1005_] * i_1004_
		       - (((Class89_Sub3) this).anIntArray9670[i_1005_]
			  * i_1003_)) >> 14;
		((Class89_Sub3) this).anIntArray9670[i_1005_] = i_1006_;
	    }
	    method16141();
	}
    }
    
    void method16110() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9686; i++) {
		int i_1007_ = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i]
		    = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i] = -i_1007_;
	    }
	    method16141();
	}
    }
    
    public void method1943(int i, int i_1008_, int i_1009_) {
	if (i != 0 && (((Class89_Sub3) this).anInt9683 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_1008_ != 0 && (((Class89_Sub3) this).anInt9683 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_1009_ != 0 && (((Class89_Sub3) this).anInt9683 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_1010_ = 0; i_1010_ < ((Class89_Sub3) this).anInt9686;
		 i_1010_++) {
		((Class89_Sub3) this).anIntArray9670[i_1010_] += i;
		((Class89_Sub3) this).anIntArray9685[i_1010_] += i_1008_;
		((Class89_Sub3) this).anIntArray9684[i_1010_] += i_1009_;
	    }
	}
    }
    
    int method16111(int i, short i_1011_, int i_1012_) {
	int i_1013_ = Class474.anIntArray6383[method16048(i, i_1012_)];
	Class101 class101
	    = ((Class89_Sub3) this).aClass103_Sub2_9690.aClass107_1458
		  .method2680(i_1011_ & 0xffff, 1656120219);
	int i_1014_ = class101.aByte1430 & 0xff;
	if (i_1014_ != 0) {
	    int i_1015_ = 131586 * i_1012_;
	    if (i_1014_ == 256)
		i_1013_ = i_1015_;
	    else {
		int i_1016_ = i_1014_;
		int i_1017_ = 256 - i_1014_;
		i_1013_ = ((((i_1015_ & 0xff00ff) * i_1016_
			     + (i_1013_ & 0xff00ff) * i_1017_)
			    & ~0xff00ff)
			   + (((i_1015_ & 0xff00) * i_1016_
			       + (i_1013_ & 0xff00) * i_1017_)
			      & 0xff0000)) >> 8;
	    }
	}
	int i_1018_ = class101.aByte1433 & 0xff;
	if (i_1018_ != 0) {
	    i_1018_ += 256;
	    int i_1019_ = ((i_1013_ & 0xff0000) >> 16) * i_1018_;
	    if (i_1019_ > 65535)
		i_1019_ = 65535;
	    int i_1020_ = ((i_1013_ & 0xff00) >> 8) * i_1018_;
	    if (i_1020_ > 65535)
		i_1020_ = 65535;
	    int i_1021_ = (i_1013_ & 0xff) * i_1018_;
	    if (i_1021_ > 65535)
		i_1021_ = 65535;
	    i_1013_ = (i_1019_ << 8 & 0xff0000) + (i_1020_ & 0xff00) + (i_1021_
									>> 8);
	}
	return i_1013_;
    }
    
    public void method2034() {
	if ((((Class89_Sub3) this).anInt9683 & 0x10) != 16)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9686; i++)
		((Class89_Sub3) this).anIntArray9684[i]
		    = -((Class89_Sub3) this).anIntArray9684[i];
	    if (((Class89_Sub3) this).aClass204Array9692 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9687; i++) {
		    if (((Class89_Sub3) this).aClass204Array9692[i] != null)
			((Class204)
			 ((Class89_Sub3) this).aClass204Array9692[i]).anInt2428
			    = -((Class204) (((Class89_Sub3) this)
					    .aClass204Array9692[i])).anInt2428;
		}
	    }
	    if (((Class89_Sub3) this).aClass204Array9744 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9687; i++) {
		    if (((Class89_Sub3) this).aClass204Array9744[i] != null)
			((Class204)
			 ((Class89_Sub3) this).aClass204Array9744[i]).anInt2428
			    = -((Class204) (((Class89_Sub3) this)
					    .aClass204Array9744[i])).anInt2428;
		}
	    }
	    if (((Class89_Sub3) this).aClass188Array9708 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9691; i++) {
		    if (((Class89_Sub3) this).aClass188Array9708[i] != null)
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2208
			    = -((Class188) (((Class89_Sub3) this)
					    .aClass188Array9708[i])).anInt2208;
		}
	    }
	    short[] is = ((Class89_Sub3) this).aShortArray9696;
	    ((Class89_Sub3) this).aShortArray9696
		= ((Class89_Sub3) this).aShortArray9698;
	    ((Class89_Sub3) this).aShortArray9698 = is;
	    if (((Class89_Sub3) this).aFloatArrayArray9720 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9691; i++) {
		    if (((Class89_Sub3) this).aFloatArrayArray9720[i]
			!= null) {
			float f
			    = ((Class89_Sub3) this).aFloatArrayArray9720[i][0];
			((Class89_Sub3) this).aFloatArrayArray9720[i][0]
			    = ((Class89_Sub3) this).aFloatArrayArray9720[i][2];
			((Class89_Sub3) this).aFloatArrayArray9720[i][2] = f;
		    }
		    if (((Class89_Sub3) this).aFloatArrayArray9703[i]
			!= null) {
			float f
			    = ((Class89_Sub3) this).aFloatArrayArray9703[i][0];
			((Class89_Sub3) this).aFloatArrayArray9703[i][0]
			    = ((Class89_Sub3) this).aFloatArrayArray9703[i][2];
			((Class89_Sub3) this).aFloatArrayArray9703[i][2] = f;
		    }
		}
	    }
	    ((Class89_Sub3) this).aBool9730 = false;
	    ((Class89_Sub3) this).anInt9741 = 0;
	}
    }
    
    public void method1910() {
	if ((((Class89_Sub3) this).anInt9683 & 0x10) != 16)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9686; i++)
		((Class89_Sub3) this).anIntArray9684[i]
		    = -((Class89_Sub3) this).anIntArray9684[i];
	    if (((Class89_Sub3) this).aClass204Array9692 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9687; i++) {
		    if (((Class89_Sub3) this).aClass204Array9692[i] != null)
			((Class204)
			 ((Class89_Sub3) this).aClass204Array9692[i]).anInt2428
			    = -((Class204) (((Class89_Sub3) this)
					    .aClass204Array9692[i])).anInt2428;
		}
	    }
	    if (((Class89_Sub3) this).aClass204Array9744 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9687; i++) {
		    if (((Class89_Sub3) this).aClass204Array9744[i] != null)
			((Class204)
			 ((Class89_Sub3) this).aClass204Array9744[i]).anInt2428
			    = -((Class204) (((Class89_Sub3) this)
					    .aClass204Array9744[i])).anInt2428;
		}
	    }
	    if (((Class89_Sub3) this).aClass188Array9708 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9691; i++) {
		    if (((Class89_Sub3) this).aClass188Array9708[i] != null)
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2208
			    = -((Class188) (((Class89_Sub3) this)
					    .aClass188Array9708[i])).anInt2208;
		}
	    }
	    short[] is = ((Class89_Sub3) this).aShortArray9696;
	    ((Class89_Sub3) this).aShortArray9696
		= ((Class89_Sub3) this).aShortArray9698;
	    ((Class89_Sub3) this).aShortArray9698 = is;
	    if (((Class89_Sub3) this).aFloatArrayArray9720 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9691; i++) {
		    if (((Class89_Sub3) this).aFloatArrayArray9720[i]
			!= null) {
			float f
			    = ((Class89_Sub3) this).aFloatArrayArray9720[i][0];
			((Class89_Sub3) this).aFloatArrayArray9720[i][0]
			    = ((Class89_Sub3) this).aFloatArrayArray9720[i][2];
			((Class89_Sub3) this).aFloatArrayArray9720[i][2] = f;
		    }
		    if (((Class89_Sub3) this).aFloatArrayArray9703[i]
			!= null) {
			float f
			    = ((Class89_Sub3) this).aFloatArrayArray9703[i][0];
			((Class89_Sub3) this).aFloatArrayArray9703[i][0]
			    = ((Class89_Sub3) this).aFloatArrayArray9703[i][2];
			((Class89_Sub3) this).aFloatArrayArray9703[i][2] = f;
		    }
		}
	    }
	    ((Class89_Sub3) this).aBool9730 = false;
	    ((Class89_Sub3) this).anInt9741 = 0;
	}
    }
    
    public void method2014(int i, int i_1022_, int i_1023_, int i_1024_) {
	if ((((Class89_Sub3) this).anInt9683 & 0x80000) != 524288)
	    throw new IllegalStateException();
	for (int i_1025_ = 0; i_1025_ < ((Class89_Sub3) this).anInt9691;
	     i_1025_++) {
	    int i_1026_
		= ((Class89_Sub3) this).aShortArray9713[i_1025_] & 0xffff;
	    int i_1027_ = i_1026_ >> 10 & 0x3f;
	    int i_1028_ = i_1026_ >> 7 & 0x7;
	    int i_1029_ = i_1026_ & 0x7f;
	    if (i != -1)
		i_1027_ += (i - i_1027_) * i_1024_ >> 7;
	    if (i_1022_ != -1)
		i_1028_ += (i_1022_ - i_1028_) * i_1024_ >> 7;
	    if (i_1023_ != -1)
		i_1029_ += (i_1023_ - i_1029_) * i_1024_ >> 7;
	    ((Class89_Sub3) this).aShortArray9713[i_1025_]
		= (short) (i_1027_ << 10 | i_1028_ << 7 | i_1029_);
	}
	if (((Class89_Sub3) this).aClass187Array9727 != null) {
	    for (int i_1030_ = 0; i_1030_ < ((Class89_Sub3) this).anInt9726;
		 i_1030_++) {
		Class187 class187
		    = ((Class89_Sub3) this).aClass187Array9727[i_1030_];
		Class203 class203
		    = ((Class89_Sub3) this).aClass203Array9728[i_1030_];
		((Class203) class203).anInt2417
		    = ((((Class203) class203).anInt2417 * -1473589757
			& ~0xffffff)
		       | ((Class474.anIntArray6382
			   [Class241_Sub42.method16451(((((Class89_Sub3) this)
							 .aShortArray9713
							 [(((Class187)
							    class187).anInt2195
							   * 1571719645)])
							& 0xffff),
						       -14148763) & 0xffff])
			  & 0xffffff)) * 376097963;
	    }
	}
	if (((Class89_Sub3) this).anInt9741 == 2)
	    ((Class89_Sub3) this).anInt9741 = 1;
    }
    
    void method16112(Class266 class266, Class97 class97, int i) {
	if (((Class89_Sub3) this).anInt9687 >= 1) {
	    Class189 class189 = ((Class89_Sub3) this).aClass103_Sub2_9690
				    .method15377(Thread.currentThread());
	    Class268 class268 = ((Class189) class189).aClass268_2225;
	    class268.method5203(class266);
	    Class268 class268_1031_
		= (((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		   .aClass268_9279);
	    Class268 class268_1032_
		= (((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		   .aClass268_9261);
	    if (!((Class89_Sub3) this).aBool9730)
		method16077();
	    boolean bool = class268.method5221();
	    float[] fs = ((Class189) class189).aFloatArray2219;
	    class268.method5208(0.0F, (float) ((Class89_Sub3) this).aShort9733,
				0.0F, fs);
	    float f = fs[0];
	    float f_1033_ = fs[1];
	    float f_1034_ = fs[2];
	    class268.method5208(0.0F, (float) ((Class89_Sub3) this).aShort9734,
				0.0F, fs);
	    float f_1035_ = fs[0];
	    float f_1036_ = fs[1];
	    float f_1037_ = fs[2];
	    for (int i_1038_ = 0; i_1038_ < 6; i_1038_++) {
		float[] fs_1039_ = (((Class103_Sub2)
				     ((Class89_Sub3) this).aClass103_Sub2_9690)
				    .aFloatArrayArray9263[i_1038_]);
		float f_1040_ = (fs_1039_[0] * f + fs_1039_[1] * f_1033_
				 + fs_1039_[2] * f_1034_ + fs_1039_[3]
				 + (float) ((Class89_Sub3) this).aShort9731);
		float f_1041_ = (fs_1039_[0] * f_1035_ + fs_1039_[1] * f_1036_
				 + fs_1039_[2] * f_1037_ + fs_1039_[3]
				 + (float) ((Class89_Sub3) this).aShort9731);
		if (f_1040_ < 0.0F && f_1041_ < 0.0F)
		    return;
	    }
	    float f_1042_;
	    float f_1043_;
	    if (bool) {
		f_1042_ = class268_1031_.aFloatArray4353[14];
		f_1043_ = class268_1031_.aFloatArray4353[6];
	    } else {
		f_1042_ = ((class268.aFloatArray4353[12]
			    * class268_1031_.aFloatArray4353[2])
			   + (class268.aFloatArray4353[13]
			      * class268_1031_.aFloatArray4353[6])
			   + (class268.aFloatArray4353[14]
			      * class268_1031_.aFloatArray4353[10])
			   + class268_1031_.aFloatArray4353[14]);
		f_1043_ = ((class268.aFloatArray4353[4]
			    * class268_1031_.aFloatArray4353[2])
			   + (class268.aFloatArray4353[5]
			      * class268_1031_.aFloatArray4353[6])
			   + (class268.aFloatArray4353[6]
			      * class268_1031_.aFloatArray4353[10]));
	    }
	    float f_1044_
		= f_1042_ + (float) ((Class89_Sub3) this).aShort9733 * f_1043_;
	    float f_1045_
		= f_1042_ + (float) ((Class89_Sub3) this).aShort9734 * f_1043_;
	    float f_1046_
		= (f_1044_ > f_1045_
		   ? f_1044_ + (float) ((Class89_Sub3) this).aShort9731
		   : f_1045_ + (float) ((Class89_Sub3) this).aShort9731);
	    float f_1047_ = (class268_1032_.aFloatArray4353[10] * f_1046_
			     + class268_1032_.aFloatArray4353[14]);
	    if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		 .anInt9274) * 592623211
		> 1) {
		synchronized (this) {
		    while (((Class89_Sub3) this).aBool9743) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
		    }
		    ((Class89_Sub3) this).aBool9743 = true;
		}
	    }
	    method16049(class189);
	    Class268 class268_1048_
		= (((Class189) ((Class89_Sub3) this).aClass189_9671)
		   .aClass268_2226);
	    class268_1048_.method5199(class268);
	    class268_1048_.method5202(((Class103_Sub2) (((Class89_Sub3) this)
							.aClass103_Sub2_9690))
				      .aClass268_9262);
	    if ((i & 0x2) != 0)
		((Class89_Sub3) this).aClass155_9674.method3345(true);
	    else
		((Class89_Sub3) this).aClass155_9674.method3345(false);
	    boolean bool_1049_ = false;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2212
		= ((Class155) ((Class89_Sub3) this).aClass155_9674).aFloat1728;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2247
		= ((Class155) ((Class89_Sub3) this).aClass155_9674).aFloat1729;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2242
		= ((Class155) ((Class89_Sub3) this).aClass155_9674).aFloat1732;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2244
		= 1.0F / (((Class155) ((Class89_Sub3) this).aClass155_9674)
			  .aFloat1732);
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2239
		= ((Class155) ((Class89_Sub3) this).aClass155_9674).aFloat1727;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2241
		= ((Class155) ((Class89_Sub3) this).aClass155_9674).aFloat1731;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2243
		= ((Class155) ((Class89_Sub3) this).aClass155_9674).aFloat1720;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).anInt2245
		= (((Class155) ((Class89_Sub3) this).aClass155_9674).anInt1733
		   * 798387409);
	    for (int i_1050_ = 0; i_1050_ < ((Class89_Sub3) this).anInt9686;
		 i_1050_++) {
		int i_1051_ = ((Class89_Sub3) this).anIntArray9670[i_1050_];
		int i_1052_ = ((Class89_Sub3) this).anIntArray9685[i_1050_];
		int i_1053_ = ((Class89_Sub3) this).anIntArray9684[i_1050_];
		float f_1054_
		    = (class268_1048_.aFloatArray4353[0] * (float) i_1051_
		       + class268_1048_.aFloatArray4353[4] * (float) i_1052_
		       + class268_1048_.aFloatArray4353[8] * (float) i_1053_
		       + class268_1048_.aFloatArray4353[12]);
		float f_1055_
		    = (class268_1048_.aFloatArray4353[1] * (float) i_1051_
		       + class268_1048_.aFloatArray4353[5] * (float) i_1052_
		       + class268_1048_.aFloatArray4353[9] * (float) i_1053_
		       + class268_1048_.aFloatArray4353[13]);
		float f_1056_
		    = (class268_1048_.aFloatArray4353[2] * (float) i_1051_
		       + class268_1048_.aFloatArray4353[6] * (float) i_1052_
		       + class268_1048_.aFloatArray4353[10] * (float) i_1053_
		       + class268_1048_.aFloatArray4353[14]);
		float f_1057_
		    = (class268_1048_.aFloatArray4353[3] * (float) i_1051_
		       + class268_1048_.aFloatArray4353[7] * (float) i_1052_
		       + class268_1048_.aFloatArray4353[11] * (float) i_1053_
		       + class268_1048_.aFloatArray4353[15]);
		((Class89_Sub3) this).aFloatArray9756[i_1050_]
		    = ((((Class189) ((Class89_Sub3) this).aClass189_9671)
			.aFloat2243)
		       + (((Class189) ((Class89_Sub3) this).aClass189_9671)
			  .aFloat2242) * f_1056_ / f_1057_);
		((Class89_Sub3) this).aFloatArray9700[i_1050_] = f_1057_;
		if (f_1056_ >= -f_1057_) {
		    ((Class89_Sub3) this).aFloatArray9745[i_1050_]
			= (float) (int) ((((Class189) (((Class89_Sub3) this)
						       .aClass189_9671))
					  .aFloat2239)
					 + (((Class189) (((Class89_Sub3) this)
							 .aClass189_9671))
					    .aFloat2212) * f_1054_ / f_1057_);
		    ((Class89_Sub3) this).aFloatArray9746[i_1050_]
			= (float) (int) ((((Class189) (((Class89_Sub3) this)
						       .aClass189_9671))
					  .aFloat2241)
					 + (((Class189) (((Class89_Sub3) this)
							 .aClass189_9671))
					    .aFloat2247) * f_1055_ / f_1057_);
		} else {
		    ((Class89_Sub3) this).aFloatArray9745[i_1050_] = -5000.0F;
		    bool_1049_ = true;
		}
		if (((Class189) ((Class89_Sub3) this).aClass189_9671)
		    .aBool2217)
		    ((Class89_Sub3) this).anIntArray9729[i_1050_]
			= (int) (class268.aFloatArray4353[13]
				 + ((class268.aFloatArray4353[1]
				     * (float) i_1051_)
				    + (class268.aFloatArray4353[5]
				       * (float) i_1052_)
				    + (class268.aFloatArray4353[9]
				       * (float) i_1053_)));
	    }
	    if (((Class89_Sub3) this).aClass187Array9727 != null) {
		for (int i_1058_ = 0;
		     i_1058_ < ((Class89_Sub3) this).anInt9726; i_1058_++) {
		    Class187 class187
			= ((Class89_Sub3) this).aClass187Array9727[i_1058_];
		    Class203 class203
			= ((Class89_Sub3) this).aClass203Array9728[i_1058_];
		    short i_1059_
			= (((Class89_Sub3) this).aShortArray9696
			   [((Class187) class187).anInt2195 * 1571719645]);
		    short i_1060_
			= (((Class89_Sub3) this).aShortArray9697
			   [((Class187) class187).anInt2195 * 1571719645]);
		    short i_1061_
			= (((Class89_Sub3) this).aShortArray9698
			   [((Class187) class187).anInt2195 * 1571719645]);
		    int i_1062_
			= ((((Class89_Sub3) this).anIntArray9670[i_1059_]
			    + ((Class89_Sub3) this).anIntArray9670[i_1060_]
			    + ((Class89_Sub3) this).anIntArray9670[i_1061_])
			   / 3);
		    int i_1063_
			= ((((Class89_Sub3) this).anIntArray9685[i_1059_]
			    + ((Class89_Sub3) this).anIntArray9685[i_1060_]
			    + ((Class89_Sub3) this).anIntArray9685[i_1061_])
			   / 3);
		    int i_1064_
			= ((((Class89_Sub3) this).anIntArray9684[i_1059_]
			    + ((Class89_Sub3) this).anIntArray9684[i_1060_]
			    + ((Class89_Sub3) this).anIntArray9684[i_1061_])
			   / 3);
		    float f_1065_
			= (class268_1048_.aFloatArray4353[0] * (float) i_1062_
			   + (class268_1048_.aFloatArray4353[4]
			      * (float) i_1063_)
			   + (class268_1048_.aFloatArray4353[8]
			      * (float) i_1064_)
			   + class268_1048_.aFloatArray4353[12]);
		    float f_1066_
			= (class268_1048_.aFloatArray4353[1] * (float) i_1062_
			   + (class268_1048_.aFloatArray4353[5]
			      * (float) i_1063_)
			   + (class268_1048_.aFloatArray4353[9]
			      * (float) i_1064_)
			   + class268_1048_.aFloatArray4353[13]);
		    float f_1067_
			= (class268_1048_.aFloatArray4353[2] * (float) i_1062_
			   + (class268_1048_.aFloatArray4353[6]
			      * (float) i_1063_)
			   + (class268_1048_.aFloatArray4353[10]
			      * (float) i_1064_)
			   + class268_1048_.aFloatArray4353[14]);
		    float f_1068_
			= (class268_1048_.aFloatArray4353[3] * (float) i_1062_
			   + (class268_1048_.aFloatArray4353[7]
			      * (float) i_1063_)
			   + (class268_1048_.aFloatArray4353[11]
			      * (float) i_1064_)
			   + class268_1048_.aFloatArray4353[15]);
		    f_1067_ += ((class268_1032_.aFloatArray4353[2]
				 * (float) (((Class203) class203).anInt2423
					    * 653825893))
				+ (class268_1032_.aFloatArray4353[6]
				   * (float) (((Class203) class203).anInt2418
					      * -825717933)));
		    f_1068_ += ((class268_1032_.aFloatArray4353[3]
				 * (float) (((Class203) class203).anInt2423
					    * 653825893))
				+ (class268_1032_.aFloatArray4353[7]
				   * (float) (((Class203) class203).anInt2418
					      * -825717933)));
		    if (f_1067_ > -f_1068_) {
			f_1065_
			    += ((class268_1032_.aFloatArray4353[0]
				 * (float) (((Class203) class203).anInt2423
					    * 653825893))
				+ (class268_1032_.aFloatArray4353[4]
				   * (float) (((Class203) class203).anInt2418
					      * -825717933)));
			f_1066_
			    += ((class268_1032_.aFloatArray4353[1]
				 * (float) (((Class203) class203).anInt2423
					    * 653825893))
				+ (class268_1032_.aFloatArray4353[5]
				   * (float) (((Class203) class203).anInt2418
					      * -825717933)));
			float f_1069_
			    = ((((Class103_Sub2)
				 ((Class89_Sub3) this).aClass103_Sub2_9690)
				.aFloat9277)
			       + (((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9268) * f_1065_ / f_1068_);
			float f_1070_
			    = ((((Class103_Sub2)
				 ((Class89_Sub3) this).aClass103_Sub2_9690)
				.aFloat9271)
			       + (((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9270) * f_1066_ / f_1068_);
			float f_1071_
			    = (((Class203) class203).aFloat2415
			       * (float) ((Class187) class187).aShort2196);
			float f_1072_
			    = (((Class203) class203).aFloat2416
			       * (float) ((Class187) class187).aShort2197);
			float f_1073_
			    = (f_1065_
			       + class268_1032_.aFloatArray4353[0] * f_1071_
			       + class268_1032_.aFloatArray4353[4] * f_1072_);
			float f_1074_
			    = (f_1066_
			       + class268_1032_.aFloatArray4353[1] * f_1071_
			       + class268_1032_.aFloatArray4353[5] * f_1072_);
			float f_1075_
			    = (f_1068_
			       + class268_1032_.aFloatArray4353[3] * f_1071_
			       + class268_1032_.aFloatArray4353[7] * f_1072_);
			float f_1076_
			    = ((((Class103_Sub2)
				 ((Class89_Sub3) this).aClass103_Sub2_9690)
				.aFloat9277)
			       + (((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9268) * f_1073_ / f_1075_);
			float f_1077_
			    = ((((Class103_Sub2)
				 ((Class89_Sub3) this).aClass103_Sub2_9690)
				.aFloat9271)
			       + (((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9270) * f_1074_ / f_1075_);
			((Class203) class203).anInt2420
			    = (int) f_1069_ * -831814081;
			((Class203) class203).anInt2421
			    = (int) f_1070_ * 653827797;
			((Class203) class203).aFloat2419
			    = ((((Class103_Sub2)
				 ((Class89_Sub3) this).aClass103_Sub2_9690)
				.aFloat9276)
			       + ((((Class103_Sub2)
				    ((Class89_Sub3) this).aClass103_Sub2_9690)
				   .aFloat9272)
				  * (f_1067_
				     - (class268_1032_.aFloatArray4353[10]
					* (float) ((((Class187) class187)
						    .anInt2202)
						   * 819851293)))
				  / f_1068_));
			((Class203) class203).anInt2422
			    = (int) (f_1076_ < f_1069_ ? f_1069_ - f_1076_
				     : f_1076_ - f_1069_) * 851268813;
			((Class203) class203).anInt2414
			    = (int) (f_1077_ < f_1070_ ? f_1070_ - f_1077_
				     : f_1077_ - f_1070_) * -1013364265;
		    } else {
			Class203 class203_1078_ = class203;
			((Class203) class203).anInt2414 = 0;
			((Class203) class203_1078_).anInt2422 = 0;
		    }
		}
	    }
	    if (class97 != null) {
		boolean bool_1079_ = false;
		boolean bool_1080_ = true;
		int i_1081_ = ((((Class89_Sub3) this).aShort9735
				+ ((Class89_Sub3) this).aShort9736)
			       >> 1);
		int i_1082_ = ((((Class89_Sub3) this).aShort9737
				+ ((Class89_Sub3) this).aShort9738)
			       >> 1);
		int i_1083_ = i_1081_;
		short i_1084_ = ((Class89_Sub3) this).aShort9733;
		int i_1085_ = i_1082_;
		float f_1086_
		    = (class268_1048_.aFloatArray4353[0] * (float) i_1083_
		       + class268_1048_.aFloatArray4353[4] * (float) i_1084_
		       + class268_1048_.aFloatArray4353[8] * (float) i_1085_
		       + class268_1048_.aFloatArray4353[12]);
		float f_1087_
		    = (class268_1048_.aFloatArray4353[1] * (float) i_1083_
		       + class268_1048_.aFloatArray4353[5] * (float) i_1084_
		       + class268_1048_.aFloatArray4353[9] * (float) i_1085_
		       + class268_1048_.aFloatArray4353[13]);
		float f_1088_
		    = (class268_1048_.aFloatArray4353[2] * (float) i_1083_
		       + class268_1048_.aFloatArray4353[6] * (float) i_1084_
		       + class268_1048_.aFloatArray4353[10] * (float) i_1085_
		       + class268_1048_.aFloatArray4353[14]);
		float f_1089_
		    = (class268_1048_.aFloatArray4353[3] * (float) i_1083_
		       + class268_1048_.aFloatArray4353[7] * (float) i_1084_
		       + class268_1048_.aFloatArray4353[11] * (float) i_1085_
		       + class268_1048_.aFloatArray4353[15]);
		if (f_1088_ >= -f_1089_) {
		    class97.anInt1349
			= (int) ((((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9277)
				 + (((Class103_Sub2)
				     ((Class89_Sub3) this).aClass103_Sub2_9690)
				    .aFloat9268) * f_1086_ / f_1089_);
		    class97.anInt1347
			= (int) ((((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9271)
				 + (((Class103_Sub2)
				     ((Class89_Sub3) this).aClass103_Sub2_9690)
				    .aFloat9270) * f_1087_ / f_1089_);
		} else
		    bool_1079_ = true;
		i_1083_ = i_1081_;
		i_1084_ = ((Class89_Sub3) this).aShort9734;
		i_1085_ = i_1082_;
		float f_1090_
		    = (class268_1048_.aFloatArray4353[0] * (float) i_1083_
		       + class268_1048_.aFloatArray4353[4] * (float) i_1084_
		       + class268_1048_.aFloatArray4353[8] * (float) i_1085_
		       + class268_1048_.aFloatArray4353[12]);
		float f_1091_
		    = (class268_1048_.aFloatArray4353[1] * (float) i_1083_
		       + class268_1048_.aFloatArray4353[5] * (float) i_1084_
		       + class268_1048_.aFloatArray4353[9] * (float) i_1085_
		       + class268_1048_.aFloatArray4353[13]);
		float f_1092_
		    = (class268_1048_.aFloatArray4353[2] * (float) i_1083_
		       + class268_1048_.aFloatArray4353[6] * (float) i_1084_
		       + class268_1048_.aFloatArray4353[10] * (float) i_1085_
		       + class268_1048_.aFloatArray4353[14]);
		float f_1093_
		    = (class268_1048_.aFloatArray4353[3] * (float) i_1083_
		       + class268_1048_.aFloatArray4353[7] * (float) i_1084_
		       + class268_1048_.aFloatArray4353[11] * (float) i_1085_
		       + class268_1048_.aFloatArray4353[15]);
		if (f_1092_ >= -f_1093_) {
		    class97.anInt1350
			= (int) ((((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9277)
				 + (((Class103_Sub2)
				     ((Class89_Sub3) this).aClass103_Sub2_9690)
				    .aFloat9268) * f_1090_ / f_1093_);
		    class97.anInt1351
			= (int) ((((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9271)
				 + (((Class103_Sub2)
				     ((Class89_Sub3) this).aClass103_Sub2_9690)
				    .aFloat9270) * f_1091_ / f_1093_);
		} else
		    bool_1079_ = true;
		if (bool_1079_) {
		    if (f_1088_ < -f_1089_ && f_1092_ < -f_1093_)
			bool_1080_ = false;
		    else if (f_1088_ < -f_1089_) {
			float f_1094_
			    = (f_1088_ + f_1089_) / (f_1092_ + f_1093_) - 1.0F;
			float f_1095_
			    = f_1086_ + f_1094_ * (f_1090_ - f_1086_);
			float f_1096_
			    = f_1087_ + f_1094_ * (f_1091_ - f_1087_);
			float f_1097_
			    = f_1089_ + f_1094_ * (f_1093_ - f_1089_);
			class97.anInt1349
			    = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
							.aClass103_Sub2_9690))
				      .aFloat9277)
				     + (((Class103_Sub2)
					 (((Class89_Sub3) this)
					  .aClass103_Sub2_9690)).aFloat9268
					* f_1095_ / f_1097_));
			class97.anInt1347
			    = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
							.aClass103_Sub2_9690))
				      .aFloat9271)
				     + (((Class103_Sub2)
					 (((Class89_Sub3) this)
					  .aClass103_Sub2_9690)).aFloat9270
					* f_1096_ / f_1097_));
		    } else if (f_1092_ < -f_1093_) {
			float f_1098_
			    = (f_1092_ + f_1093_) / (f_1088_ + f_1089_) - 1.0F;
			float f_1099_
			    = f_1090_ + f_1098_ * (f_1086_ - f_1090_);
			float f_1100_
			    = f_1091_ + f_1098_ * (f_1087_ - f_1091_);
			float f_1101_
			    = f_1093_ + f_1098_ * (f_1089_ - f_1093_);
			class97.anInt1350
			    = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
							.aClass103_Sub2_9690))
				      .aFloat9277)
				     + (((Class103_Sub2)
					 (((Class89_Sub3) this)
					  .aClass103_Sub2_9690)).aFloat9268
					* f_1099_ / f_1101_));
			class97.anInt1351
			    = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
							.aClass103_Sub2_9690))
				      .aFloat9271)
				     + (((Class103_Sub2)
					 (((Class89_Sub3) this)
					  .aClass103_Sub2_9690)).aFloat9270
					* f_1100_ / f_1101_));
		    }
		}
		if (bool_1080_) {
		    if (f_1088_ / f_1089_ > f_1092_ / f_1093_) {
			float f_1102_
			    = (f_1086_
			       + (class268_1032_.aFloatArray4353[0]
				  * (float) ((Class89_Sub3) this).aShort9731)
			       + class268_1032_.aFloatArray4353[12]);
			float f_1103_
			    = (f_1089_
			       + (class268_1032_.aFloatArray4353[3]
				  * (float) ((Class89_Sub3) this).aShort9731)
			       + class268_1032_.aFloatArray4353[15]);
			class97.anInt1348
			    = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
							.aClass103_Sub2_9690))
				      .aFloat9277)
				     - (float) class97.anInt1349
				     + (((Class103_Sub2)
					 (((Class89_Sub3) this)
					  .aClass103_Sub2_9690)).aFloat9268
					* f_1102_ / f_1103_));
		    } else {
			float f_1104_
			    = (f_1090_
			       + (class268_1032_.aFloatArray4353[0]
				  * (float) ((Class89_Sub3) this).aShort9731)
			       + class268_1032_.aFloatArray4353[12]);
			float f_1105_
			    = (f_1093_
			       + (class268_1032_.aFloatArray4353[3]
				  * (float) ((Class89_Sub3) this).aShort9731)
			       + class268_1032_.aFloatArray4353[15]);
			class97.anInt1348
			    = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
							.aClass103_Sub2_9690))
				      .aFloat9277)
				     - (float) class97.anInt1350
				     + (((Class103_Sub2)
					 (((Class89_Sub3) this)
					  .aClass103_Sub2_9690)).aFloat9268
					* f_1104_ / f_1105_));
		    }
		    class97.aBool1352 = true;
		}
	    }
	    method16117(true);
	    ((Class155) ((Class89_Sub3) this).aClass155_9674).aBool1721
		= (i & 0x1) == 0;
	    ((Class155) ((Class89_Sub3) this).aClass155_9674).aBool1722
		= false;
	    try {
		method16068((((Class103_Sub2)
			      ((Class89_Sub3) this).aClass103_Sub2_9690)
			     .anIntArray9245) != null,
			    (((Class103_Sub2)
			      ((Class89_Sub3) this).aClass103_Sub2_9690)
			     .aFloatArray9248) != null,
			    (i & 0x4) != 0, bool_1049_,
			    ((((Class189)
			       ((Class89_Sub3) this).aClass189_9671).aBool2209
			      && f_1047_ > (((Class189) (((Class89_Sub3) this)
							 .aClass189_9671))
					    .aFloat2213))
			     || ((Class189) (((Class89_Sub3) this)
					     .aClass189_9671)).aBool2217));
	    } catch (Exception exception) {
		/* empty */
	    }
	    if (((Class89_Sub3) this).aClass187Array9727 != null) {
		for (int i_1106_ = 0;
		     i_1106_ < ((Class89_Sub3) this).anInt9691; i_1106_++)
		    ((Class89_Sub3) this).anIntArray9675[i_1106_] = -1;
	    }
	    ((Class89_Sub3) this).aClass155_9674 = null;
	    if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		 .anInt9274) * 592623211
		> 1) {
		synchronized (this) {
		    ((Class89_Sub3) this).aBool9743 = false;
		    this.notifyAll();
		}
	    }
	}
    }
    
    public void method1946(int i, int i_1107_, int i_1108_) {
	if (i != 128 && (((Class89_Sub3) this).anInt9683 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_1107_ != 128 && (((Class89_Sub3) this).anInt9683 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_1108_ != 128 && (((Class89_Sub3) this).anInt9683 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_1109_ = 0; i_1109_ < ((Class89_Sub3) this).anInt9686;
		 i_1109_++) {
		((Class89_Sub3) this).anIntArray9670[i_1109_]
		    = ((Class89_Sub3) this).anIntArray9670[i_1109_] * i >> 7;
		((Class89_Sub3) this).anIntArray9685[i_1109_]
		    = (((Class89_Sub3) this).anIntArray9685[i_1109_] * i_1107_
		       >> 7);
		((Class89_Sub3) this).anIntArray9684[i_1109_]
		    = (((Class89_Sub3) this).anIntArray9684[i_1109_] * i_1108_
		       >> 7);
	    }
	    ((Class89_Sub3) this).aBool9730 = false;
	}
    }
    
    public void method1947(int i, int i_1110_, Class166 class166,
			   Class166 class166_1111_, int i_1112_, int i_1113_,
			   int i_1114_) {
	if (i == 3) {
	    if ((((Class89_Sub3) this).anInt9683 & 0x7) != 7)
		throw new IllegalStateException();
	} else if ((((Class89_Sub3) this).anInt9683 & 0x2) != 2)
	    throw new IllegalStateException();
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	int i_1115_ = i_1112_ + ((Class89_Sub3) this).aShort9735;
	int i_1116_ = i_1112_ + ((Class89_Sub3) this).aShort9736;
	int i_1117_ = i_1114_ + ((Class89_Sub3) this).aShort9737;
	int i_1118_ = i_1114_ + ((Class89_Sub3) this).aShort9738;
	if (i == 4 || (i_1115_ >= 0
		       && ((i_1116_ + class166.anInt2053 * 2039042417
			    >> class166.anInt2054 * -122333825)
			   < class166.anInt2055 * 266270313)
		       && i_1117_ >= 0
		       && ((i_1118_ + class166.anInt2053 * 2039042417
			    >> class166.anInt2054 * -122333825)
			   < class166.anInt2052 * -14610189))) {
	    int[][] is = class166.anIntArrayArray2051;
	    int[][] is_1119_ = null;
	    if (class166_1111_ != null)
		is_1119_ = class166_1111_.anIntArrayArray2051;
	    if (i == 4 || i == 5) {
		if (class166_1111_ == null
		    || (i_1115_ < 0
			|| ((i_1116_ + class166_1111_.anInt2053 * 2039042417
			     >> class166_1111_.anInt2054 * -122333825)
			    >= class166_1111_.anInt2055 * 266270313)
			|| i_1117_ < 0
			|| ((i_1118_ + class166_1111_.anInt2053 * 2039042417
			     >> class166_1111_.anInt2054 * -122333825)
			    >= class166_1111_.anInt2052 * -14610189)))
		    return;
	    } else {
		i_1115_ >>= class166.anInt2054 * -122333825;
		i_1116_ = (i_1116_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		i_1117_ >>= class166.anInt2054 * -122333825;
		i_1118_ = (i_1118_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		if (is[i_1115_][i_1117_] == i_1113_
		    && is[i_1116_][i_1117_] == i_1113_
		    && is[i_1115_][i_1118_] == i_1113_
		    && is[i_1116_][i_1118_] == i_1113_)
		    return;
	    }
	    synchronized (this) {
		if (i == 1) {
		    int i_1120_ = class166.anInt2053 * 2039042417 - 1;
		    for (int i_1121_ = 0;
			 i_1121_ < ((Class89_Sub3) this).anInt9687;
			 i_1121_++) {
			int i_1122_
			    = (((Class89_Sub3) this).anIntArray9670[i_1121_]
			       + i_1112_);
			int i_1123_
			    = (((Class89_Sub3) this).anIntArray9684[i_1121_]
			       + i_1114_);
			int i_1124_ = i_1122_ & i_1120_;
			int i_1125_ = i_1123_ & i_1120_;
			int i_1126_
			    = i_1122_ >> class166.anInt2054 * -122333825;
			int i_1127_
			    = i_1123_ >> class166.anInt2054 * -122333825;
			int i_1128_
			    = (((is[i_1126_][i_1127_]
				 * (class166.anInt2053 * 2039042417 - i_1124_))
				+ is[i_1126_ + 1][i_1127_] * i_1124_)
			       >> class166.anInt2054 * -122333825);
			int i_1129_
			    = (((is[i_1126_][i_1127_ + 1]
				 * (class166.anInt2053 * 2039042417 - i_1124_))
				+ is[i_1126_ + 1][i_1127_ + 1] * i_1124_)
			       >> class166.anInt2054 * -122333825);
			int i_1130_
			    = (i_1128_ * (class166.anInt2053 * 2039042417
					  - i_1125_) + i_1129_ * i_1125_
			       >> class166.anInt2054 * -122333825);
			((Class89_Sub3) this).anIntArray9685[i_1121_]
			    = (((Class89_Sub3) this).anIntArray9685[i_1121_]
			       + i_1130_ - i_1113_);
		    }
		    for (int i_1131_ = ((Class89_Sub3) this).anInt9687;
			 i_1131_ < ((Class89_Sub3) this).anInt9686;
			 i_1131_++) {
			int i_1132_
			    = (((Class89_Sub3) this).anIntArray9670[i_1131_]
			       + i_1112_);
			int i_1133_
			    = (((Class89_Sub3) this).anIntArray9684[i_1131_]
			       + i_1114_);
			int i_1134_ = i_1132_ & i_1120_;
			int i_1135_ = i_1133_ & i_1120_;
			int i_1136_
			    = i_1132_ >> class166.anInt2054 * -122333825;
			int i_1137_
			    = i_1133_ >> class166.anInt2054 * -122333825;
			if (i_1136_ >= 0 && i_1136_ < is.length - 1
			    && i_1137_ >= 0 && i_1137_ < is[0].length - 1) {
			    int i_1138_
				= (((is[i_1136_][i_1137_]
				     * (class166.anInt2053 * 2039042417
					- i_1134_))
				    + is[i_1136_ + 1][i_1137_] * i_1134_)
				   >> class166.anInt2054 * -122333825);
			    int i_1139_
				= (((is[i_1136_][i_1137_ + 1]
				     * (class166.anInt2053 * 2039042417
					- i_1134_))
				    + is[i_1136_ + 1][i_1137_ + 1] * i_1134_)
				   >> class166.anInt2054 * -122333825);
			    int i_1140_
				= (i_1138_ * (class166.anInt2053 * 2039042417
					      - i_1135_) + i_1139_ * i_1135_
				   >> class166.anInt2054 * -122333825);
			    ((Class89_Sub3) this).anIntArray9685[i_1131_]
				= (((Class89_Sub3) this).anIntArray9685
				   [i_1131_]) + i_1140_ - i_1113_;
			}
		    }
		} else if (i == 2) {
		    if (((Class89_Sub3) this).aShort9733 == 0)
			return;
		    int i_1141_ = class166.anInt2053 * 2039042417 - 1;
		    for (int i_1142_ = 0;
			 i_1142_ < ((Class89_Sub3) this).anInt9687;
			 i_1142_++) {
			int i_1143_
			    = ((((Class89_Sub3) this).anIntArray9685[i_1142_]
				<< 16)
			       / ((Class89_Sub3) this).aShort9733);
			if (i_1143_ < i_1110_) {
			    int i_1144_ = ((((Class89_Sub3) this)
					    .anIntArray9670[i_1142_])
					   + i_1112_);
			    int i_1145_ = ((((Class89_Sub3) this)
					    .anIntArray9684[i_1142_])
					   + i_1114_);
			    int i_1146_ = i_1144_ & i_1141_;
			    int i_1147_ = i_1145_ & i_1141_;
			    int i_1148_
				= i_1144_ >> class166.anInt2054 * -122333825;
			    int i_1149_
				= i_1145_ >> class166.anInt2054 * -122333825;
			    int i_1150_
				= (((is[i_1148_][i_1149_]
				     * (class166.anInt2053 * 2039042417
					- i_1146_))
				    + is[i_1148_ + 1][i_1149_] * i_1146_)
				   >> class166.anInt2054 * -122333825);
			    int i_1151_
				= (((is[i_1148_][i_1149_ + 1]
				     * (class166.anInt2053 * 2039042417
					- i_1146_))
				    + is[i_1148_ + 1][i_1149_ + 1] * i_1146_)
				   >> class166.anInt2054 * -122333825);
			    int i_1152_
				= (i_1150_ * (class166.anInt2053 * 2039042417
					      - i_1147_) + i_1151_ * i_1147_
				   >> class166.anInt2054 * -122333825);
			    ((Class89_Sub3) this).anIntArray9685[i_1142_]
				= ((((Class89_Sub3) this).anIntArray9685
				    [i_1142_])
				   + ((i_1152_ - i_1113_) * (i_1110_ - i_1143_)
				      / i_1110_));
			} else
			    ((Class89_Sub3) this).anIntArray9685[i_1142_]
				= (((Class89_Sub3) this).anIntArray9685
				   [i_1142_]);
		    }
		    for (int i_1153_ = ((Class89_Sub3) this).anInt9687;
			 i_1153_ < ((Class89_Sub3) this).anInt9686;
			 i_1153_++) {
			int i_1154_
			    = ((((Class89_Sub3) this).anIntArray9685[i_1153_]
				<< 16)
			       / ((Class89_Sub3) this).aShort9733);
			if (i_1154_ < i_1110_) {
			    int i_1155_ = ((((Class89_Sub3) this)
					    .anIntArray9670[i_1153_])
					   + i_1112_);
			    int i_1156_ = ((((Class89_Sub3) this)
					    .anIntArray9684[i_1153_])
					   + i_1114_);
			    int i_1157_ = i_1155_ & i_1141_;
			    int i_1158_ = i_1156_ & i_1141_;
			    int i_1159_
				= i_1155_ >> class166.anInt2054 * -122333825;
			    int i_1160_
				= i_1156_ >> class166.anInt2054 * -122333825;
			    if (i_1159_ >= 0
				&& i_1159_ < class166.anInt2055 * 266270313 - 1
				&& i_1160_ >= 0
				&& (i_1160_
				    < class166.anInt2052 * -14610189 - 1)) {
				int i_1161_
				    = (((is[i_1159_][i_1160_]
					 * (class166.anInt2053 * 2039042417
					    - i_1157_))
					+ is[i_1159_ + 1][i_1160_] * i_1157_)
				       >> class166.anInt2054 * -122333825);
				int i_1162_
				    = (((is[i_1159_][i_1160_ + 1]
					 * (class166.anInt2053 * 2039042417
					    - i_1157_))
					+ (is[i_1159_ + 1][i_1160_ + 1]
					   * i_1157_))
				       >> class166.anInt2054 * -122333825);
				int i_1163_
				    = ((i_1161_
					* (class166.anInt2053 * 2039042417
					   - i_1158_)) + i_1162_ * i_1158_
				       >> class166.anInt2054 * -122333825);
				((Class89_Sub3) this).anIntArray9685[i_1153_]
				    = ((((Class89_Sub3) this).anIntArray9685
					[i_1153_])
				       + ((i_1163_ - i_1113_)
					  * (i_1110_ - i_1154_) / i_1110_));
			    }
			} else
			    ((Class89_Sub3) this).anIntArray9685[i_1153_]
				= (((Class89_Sub3) this).anIntArray9685
				   [i_1153_]);
		    }
		} else if (i == 3) {
		    int i_1164_ = (i_1110_ & 0xff) * 4;
		    int i_1165_ = (i_1110_ >> 8 & 0xff) * 4;
		    int i_1166_ = (i_1110_ >> 16 & 0xff) << 6;
		    int i_1167_ = (i_1110_ >> 24 & 0xff) << 6;
		    if (i_1112_ - (i_1164_ >> 1) < 0
			|| ((i_1112_ + (i_1164_ >> 1)
			     + class166.anInt2053 * 2039042417)
			    >= (class166.anInt2055 * 266270313
				<< class166.anInt2054 * -122333825))
			|| i_1114_ - (i_1165_ >> 1) < 0
			|| ((i_1114_ + (i_1165_ >> 1)
			     + class166.anInt2053 * 2039042417)
			    >= (class166.anInt2052 * -14610189
				<< class166.anInt2054 * -122333825)))
			return;
		    method2041(class166, i_1112_, i_1113_, i_1114_, i_1164_,
			       i_1165_, i_1166_, i_1167_);
		} else if (i == 4) {
		    int i_1168_ = class166_1111_.anInt2053 * 2039042417 - 1;
		    int i_1169_ = (((Class89_Sub3) this).aShort9734
				   - ((Class89_Sub3) this).aShort9733);
		    for (int i_1170_ = 0;
			 i_1170_ < ((Class89_Sub3) this).anInt9687;
			 i_1170_++) {
			int i_1171_
			    = (((Class89_Sub3) this).anIntArray9670[i_1170_]
			       + i_1112_);
			int i_1172_
			    = (((Class89_Sub3) this).anIntArray9684[i_1170_]
			       + i_1114_);
			int i_1173_ = i_1171_ & i_1168_;
			int i_1174_ = i_1172_ & i_1168_;
			int i_1175_
			    = i_1171_ >> class166_1111_.anInt2054 * -122333825;
			int i_1176_
			    = i_1172_ >> class166_1111_.anInt2054 * -122333825;
			int i_1177_
			    = (((is_1119_[i_1175_][i_1176_]
				 * (class166_1111_.anInt2053 * 2039042417
				    - i_1173_))
				+ is_1119_[i_1175_ + 1][i_1176_] * i_1173_)
			       >> class166_1111_.anInt2054 * -122333825);
			int i_1178_
			    = (((is_1119_[i_1175_][i_1176_ + 1]
				 * (class166_1111_.anInt2053 * 2039042417
				    - i_1173_))
				+ is_1119_[i_1175_ + 1][i_1176_ + 1] * i_1173_)
			       >> class166_1111_.anInt2054 * -122333825);
			int i_1179_
			    = (i_1177_ * (class166_1111_.anInt2053 * 2039042417
					  - i_1174_) + i_1178_ * i_1174_
			       >> class166_1111_.anInt2054 * -122333825);
			((Class89_Sub3) this).anIntArray9685[i_1170_]
			    = (((Class89_Sub3) this).anIntArray9685[i_1170_]
			       + (i_1179_ - i_1113_) + i_1169_);
		    }
		    for (int i_1180_ = ((Class89_Sub3) this).anInt9687;
			 i_1180_ < ((Class89_Sub3) this).anInt9686;
			 i_1180_++) {
			int i_1181_
			    = (((Class89_Sub3) this).anIntArray9670[i_1180_]
			       + i_1112_);
			int i_1182_
			    = (((Class89_Sub3) this).anIntArray9684[i_1180_]
			       + i_1114_);
			int i_1183_ = i_1181_ & i_1168_;
			int i_1184_ = i_1182_ & i_1168_;
			int i_1185_
			    = i_1181_ >> class166_1111_.anInt2054 * -122333825;
			int i_1186_
			    = i_1182_ >> class166_1111_.anInt2054 * -122333825;
			if (i_1185_ >= 0
			    && (i_1185_
				< class166_1111_.anInt2055 * 266270313 - 1)
			    && i_1186_ >= 0
			    && (i_1186_
				< class166_1111_.anInt2052 * -14610189 - 1)) {
			    int i_1187_
				= (((is_1119_[i_1185_][i_1186_]
				     * (class166_1111_.anInt2053 * 2039042417
					- i_1183_))
				    + is_1119_[i_1185_ + 1][i_1186_] * i_1183_)
				   >> class166_1111_.anInt2054 * -122333825);
			    int i_1188_
				= (((is_1119_[i_1185_][i_1186_ + 1]
				     * (class166_1111_.anInt2053 * 2039042417
					- i_1183_))
				    + (is_1119_[i_1185_ + 1][i_1186_ + 1]
				       * i_1183_))
				   >> class166_1111_.anInt2054 * -122333825);
			    int i_1189_
				= ((i_1187_
				    * (class166_1111_.anInt2053 * 2039042417
				       - i_1184_)) + i_1188_ * i_1184_
				   >> class166_1111_.anInt2054 * -122333825);
			    ((Class89_Sub3) this).anIntArray9685[i_1180_]
				= (((Class89_Sub3) this).anIntArray9685
				   [i_1180_]) + (i_1189_ - i_1113_) + i_1169_;
			}
		    }
		} else if (i == 5) {
		    int i_1190_ = class166_1111_.anInt2053 * 2039042417 - 1;
		    int i_1191_ = (((Class89_Sub3) this).aShort9734
				   - ((Class89_Sub3) this).aShort9733);
		    for (int i_1192_ = 0;
			 i_1192_ < ((Class89_Sub3) this).anInt9687;
			 i_1192_++) {
			int i_1193_
			    = (((Class89_Sub3) this).anIntArray9670[i_1192_]
			       + i_1112_);
			int i_1194_
			    = (((Class89_Sub3) this).anIntArray9684[i_1192_]
			       + i_1114_);
			int i_1195_ = i_1193_ & i_1190_;
			int i_1196_ = i_1194_ & i_1190_;
			int i_1197_
			    = i_1193_ >> class166.anInt2054 * -122333825;
			int i_1198_
			    = i_1194_ >> class166.anInt2054 * -122333825;
			int i_1199_
			    = (((is[i_1197_][i_1198_]
				 * (class166.anInt2053 * 2039042417 - i_1195_))
				+ is[i_1197_ + 1][i_1198_] * i_1195_)
			       >> class166.anInt2054 * -122333825);
			int i_1200_
			    = (((is[i_1197_][i_1198_ + 1]
				 * (class166.anInt2053 * 2039042417 - i_1195_))
				+ is[i_1197_ + 1][i_1198_ + 1] * i_1195_)
			       >> class166.anInt2054 * -122333825);
			int i_1201_
			    = (i_1199_ * (class166.anInt2053 * 2039042417
					  - i_1196_) + i_1200_ * i_1196_
			       >> class166.anInt2054 * -122333825);
			i_1199_ = (((is_1119_[i_1197_][i_1198_]
				     * (class166_1111_.anInt2053 * 2039042417
					- i_1195_))
				    + is_1119_[i_1197_ + 1][i_1198_] * i_1195_)
				   >> class166_1111_.anInt2054 * -122333825);
			i_1200_
			    = (((is_1119_[i_1197_][i_1198_ + 1]
				 * (class166_1111_.anInt2053 * 2039042417
				    - i_1195_))
				+ is_1119_[i_1197_ + 1][i_1198_ + 1] * i_1195_)
			       >> class166_1111_.anInt2054 * -122333825);
			int i_1202_
			    = (i_1199_ * (class166_1111_.anInt2053 * 2039042417
					  - i_1196_) + i_1200_ * i_1196_
			       >> class166_1111_.anInt2054 * -122333825);
			int i_1203_ = i_1201_ - i_1202_ - i_1110_;
			((Class89_Sub3) this).anIntArray9685[i_1192_]
			    = ((((Class89_Sub3) this).anIntArray9685[i_1192_]
				<< 8) / i_1191_ * i_1203_
			       >> 8) - (i_1113_ - i_1201_);
		    }
		    for (int i_1204_ = ((Class89_Sub3) this).anInt9687;
			 i_1204_ < ((Class89_Sub3) this).anInt9686;
			 i_1204_++) {
			int i_1205_
			    = (((Class89_Sub3) this).anIntArray9670[i_1204_]
			       + i_1112_);
			int i_1206_
			    = (((Class89_Sub3) this).anIntArray9684[i_1204_]
			       + i_1114_);
			int i_1207_ = i_1205_ & i_1190_;
			int i_1208_ = i_1206_ & i_1190_;
			int i_1209_
			    = i_1205_ >> class166.anInt2054 * -122333825;
			int i_1210_
			    = i_1206_ >> class166.anInt2054 * -122333825;
			if (i_1209_ >= 0
			    && i_1209_ < class166.anInt2055 * 266270313 - 1
			    && (i_1209_
				< class166_1111_.anInt2055 * 266270313 - 1)
			    && i_1210_ >= 0
			    && i_1210_ < class166.anInt2052 * -14610189 - 1
			    && (i_1210_
				< class166_1111_.anInt2052 * -14610189 - 1)) {
			    int i_1211_
				= (((is[i_1209_][i_1210_]
				     * (class166.anInt2053 * 2039042417
					- i_1207_))
				    + is[i_1209_ + 1][i_1210_] * i_1207_)
				   >> class166.anInt2054 * -122333825);
			    int i_1212_
				= (((is[i_1209_][i_1210_ + 1]
				     * (class166.anInt2053 * 2039042417
					- i_1207_))
				    + is[i_1209_ + 1][i_1210_ + 1] * i_1207_)
				   >> class166.anInt2054 * -122333825);
			    int i_1213_
				= (i_1211_ * (class166.anInt2053 * 2039042417
					      - i_1208_) + i_1212_ * i_1208_
				   >> class166.anInt2054 * -122333825);
			    i_1211_
				= (((is_1119_[i_1209_][i_1210_]
				     * (class166_1111_.anInt2053 * 2039042417
					- i_1207_))
				    + is_1119_[i_1209_ + 1][i_1210_] * i_1207_)
				   >> class166_1111_.anInt2054 * -122333825);
			    i_1212_
				= (((is_1119_[i_1209_][i_1210_ + 1]
				     * (class166_1111_.anInt2053 * 2039042417
					- i_1207_))
				    + (is_1119_[i_1209_ + 1][i_1210_ + 1]
				       * i_1207_))
				   >> class166_1111_.anInt2054 * -122333825);
			    int i_1214_
				= ((i_1211_
				    * (class166_1111_.anInt2053 * 2039042417
				       - i_1208_)) + i_1212_ * i_1208_
				   >> class166_1111_.anInt2054 * -122333825);
			    int i_1215_ = i_1213_ - i_1214_ - i_1110_;
			    ((Class89_Sub3) this).anIntArray9685[i_1204_]
				= (((((Class89_Sub3) this).anIntArray9685
				     [i_1204_])
				    << 8) / i_1191_ * i_1215_
				   >> 8) - (i_1113_ - i_1213_);
			}
		    }
		}
		((Class89_Sub3) this).aBool9730 = false;
	    }
	}
    }
    
    final void method16113(boolean bool, boolean bool_1216_,
			   boolean bool_1217_, int i) {
	int i_1218_ = -1;
	if (((Class89_Sub3) this).aShortArray9712 != null
	    && ((Class89_Sub3) this).aShortArray9712[i] != -1)
	    i_1218_ = (((Class89_Sub3) this).aClass103_Sub2_9690
			   .aClass107_1458.method2680
		       (((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
			930489081)
		       .anInt1403) * 218388063;
	if (!((Class189) ((Class89_Sub3) this).aClass189_9671).aBool2217) {
	    short i_1219_ = ((Class89_Sub3) this).aShortArray9696[i];
	    short i_1220_ = ((Class89_Sub3) this).aShortArray9697[i];
	    short i_1221_ = ((Class89_Sub3) this).aShortArray9698[i];
	    Class268 class268
		= (((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		   .aClass268_9261);
	    float f = class268.aFloatArray4353[10];
	    float f_1222_ = class268.aFloatArray4353[14];
	    float f_1223_ = class268.aFloatArray4353[11];
	    float f_1224_ = class268.aFloatArray4353[15];
	    float f_1225_ = f_1222_ * f_1223_ - f * f_1224_;
	    float f_1226_
		= ((((Class89_Sub3) this).aFloatArray9756[i_1219_]
		    - (((Class189) ((Class89_Sub3) this).aClass189_9671)
		       .aFloat2243))
		   * (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2244));
	    float f_1227_
		= ((((Class89_Sub3) this).aFloatArray9756[i_1220_]
		    - (((Class189) ((Class89_Sub3) this).aClass189_9671)
		       .aFloat2243))
		   * (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2244));
	    float f_1228_
		= ((((Class89_Sub3) this).aFloatArray9756[i_1221_]
		    - (((Class189) ((Class89_Sub3) this).aClass189_9671)
		       .aFloat2243))
		   * (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2244));
	    float f_1229_ = f_1226_ * f_1225_ / (f_1226_ * f_1223_ - f);
	    float f_1230_ = f_1227_ * f_1225_ / (f_1227_ * f_1223_ - f);
	    float f_1231_ = f_1228_ * f_1225_ / (f_1228_ * f_1223_ - f);
	    float f_1232_
		= ((f_1229_
		    - (((Class189) ((Class89_Sub3) this).aClass189_9671)
		       .aFloat2213))
		   / (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2214));
	    if (f_1232_ > 1.0F)
		f_1232_ = 1.0F;
	    else if (f_1232_ < 0.0F)
		f_1232_ = 0.0F;
	    float f_1233_
		= ((f_1230_
		    - (((Class189) ((Class89_Sub3) this).aClass189_9671)
		       .aFloat2213))
		   / (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2214));
	    if (f_1233_ > 1.0F)
		f_1233_ = 1.0F;
	    else if (f_1233_ < 0.0F)
		f_1233_ = 0.0F;
	    float f_1234_
		= ((f_1231_
		    - (((Class189) ((Class89_Sub3) this).aClass189_9671)
		       .aFloat2213))
		   / (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2214));
	    if (f_1234_ > 1.0F)
		f_1234_ = 1.0F;
	    else if (f_1234_ < 0.0F)
		f_1234_ = 0.0F;
	    float f_1235_ = f_1232_ + f_1233_ + f_1234_;
	    if (!(f_1235_ >= 3.0F)) {
		if (f_1235_ <= 0.0F)
		    method16073(bool, bool_1216_, bool_1217_, i);
		else {
		    if (((Class89_Sub3) this).aByteArray9711 == null)
			((Class155) ((Class89_Sub3) this).aClass155_9674)
			    .anInt1723
			    = 0;
		    else
			((Class155) ((Class89_Sub3) this).aClass155_9674)
			    .anInt1723
			    = ((Class89_Sub3) this).aByteArray9711[i] & 0xff;
		    if (i_1218_ == -1) {
			if (((Class89_Sub3) this).anIntArray9704[i] == -1)
			    ((Class89_Sub3) this).aClass155_9674.method3385
				(bool, bool_1216_, bool_1217_,
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_1219_]),
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_1220_]),
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_1221_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_1219_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_1220_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_1221_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_1219_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_1220_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_1221_]),
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9710[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_1232_ * 255.0F,
						    1372221625),
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9710[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_1233_ * 255.0F,
						    1372221625),
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9710[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_1234_ * 255.0F,
						    1372221625));
			else
			    ((Class89_Sub3) this).aClass155_9674.method3385
				(bool, bool_1216_, bool_1217_,
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_1219_]),
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_1220_]),
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_1221_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_1219_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_1220_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_1221_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_1219_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_1220_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_1221_]),
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9710[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_1232_ * 255.0F,
						    1372221625),
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9747[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_1233_ * 255.0F,
						    1372221625),
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9704[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_1234_ * 255.0F,
						    1372221625));
		    } else {
			int i_1236_ = -16777216;
			if (((Class89_Sub3) this).aByteArray9711 != null)
			    i_1236_ = 255 - ((((Class89_Sub3) this)
					      .aByteArray9711[i])
					     & 0xff) << 24;
			if (((Class89_Sub3) this).anIntArray9704[i] == -1) {
			    int i_1237_
				= (i_1236_
				   | (((Class89_Sub3) this).anIntArray9710[i]
				      & 0xffffff));
			    ((Class89_Sub3) this).aClass155_9674.method3384
				(bool, bool_1216_, bool_1217_,
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_1219_]),
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_1220_]),
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_1221_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_1219_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_1220_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_1221_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_1219_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_1220_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_1221_]),
				 (((Class89_Sub3) this).aFloatArray9700
				  [i_1219_]),
				 (((Class89_Sub3) this).aFloatArray9700
				  [i_1220_]),
				 (((Class89_Sub3) this).aFloatArray9700
				  [i_1221_]),
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [0]),
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [1]),
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [2]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [0]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [1]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [2]),
				 i_1237_, i_1237_, i_1237_,
				 (((Class189) (((Class89_Sub3) this)
					       .aClass189_9671)).anInt2215
				  * -338296791),
				 f_1232_ * 255.0F, f_1233_ * 255.0F,
				 f_1234_ * 255.0F,
				 (((Class89_Sub3) this).aShortArray9712[i]
				  & 0xffff),
				 i_1218_);
			} else
			    ((Class89_Sub3) this).aClass155_9674.method3384
				(bool, bool_1216_, bool_1217_,
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_1219_]),
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_1220_]),
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_1221_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_1219_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_1220_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_1221_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_1219_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_1220_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_1221_]),
				 (((Class89_Sub3) this).aFloatArray9700
				  [i_1219_]),
				 (((Class89_Sub3) this).aFloatArray9700
				  [i_1220_]),
				 (((Class89_Sub3) this).aFloatArray9700
				  [i_1221_]),
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [0]),
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [1]),
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [2]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [0]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [1]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [2]),
				 i_1236_ | (((Class89_Sub3) this)
					    .anIntArray9710[i]) & 0xffffff,
				 i_1236_ | (((Class89_Sub3) this)
					    .anIntArray9747[i]) & 0xffffff,
				 i_1236_ | (((Class89_Sub3) this)
					    .anIntArray9704[i]) & 0xffffff,
				 (((Class189) (((Class89_Sub3) this)
					       .aClass189_9671)).anInt2215
				  * -338296791),
				 f_1232_ * 255.0F, f_1233_ * 255.0F,
				 f_1234_ * 255.0F,
				 (((Class89_Sub3) this).aShortArray9712[i]
				  & 0xffff),
				 i_1218_);
		    }
		}
	    }
	} else {
	    short i_1238_ = ((Class89_Sub3) this).aShortArray9696[i];
	    short i_1239_ = ((Class89_Sub3) this).aShortArray9697[i];
	    short i_1240_ = ((Class89_Sub3) this).aShortArray9698[i];
	    float f = 0.0F;
	    float f_1241_ = 0.0F;
	    float f_1242_ = 0.0F;
	    if (((Class89_Sub3) this).anIntArray9729[i_1238_]
		> (((Class189) ((Class89_Sub3) this).aClass189_9671).anInt2230
		   * 2144219087))
		f = 1.0F;
	    else if (((Class89_Sub3) this).anIntArray9729[i_1238_]
		     > (((Class189) ((Class89_Sub3) this).aClass189_9671)
			.anInt2218) * -1285418291)
		f = ((float) ((((Class189)
				((Class89_Sub3) this).aClass189_9671).anInt2218
			       * -1285418291)
			      - ((Class89_Sub3) this).anIntArray9729[i_1238_])
		     * 1.0F
		     / (float) ((((Class189) (((Class89_Sub3) this)
					      .aClass189_9671)).anInt2218
				 * -1285418291)
				- (((Class189) (((Class89_Sub3) this)
						.aClass189_9671)).anInt2230
				   * 2144219087)));
	    if (((Class89_Sub3) this).anIntArray9729[i_1239_]
		> (((Class189) ((Class89_Sub3) this).aClass189_9671).anInt2230
		   * 2144219087))
		f_1241_ = 1.0F;
	    else if (((Class89_Sub3) this).anIntArray9729[i_1239_]
		     > (((Class189) ((Class89_Sub3) this).aClass189_9671)
			.anInt2218) * -1285418291)
		f_1241_ = ((float) ((((Class189) (((Class89_Sub3) this)
						  .aClass189_9671)).anInt2218
				     * -1285418291)
				    - (((Class89_Sub3) this).anIntArray9729
				       [i_1239_]))
			   * 1.0F
			   / (float) ((((Class189) (((Class89_Sub3) this)
						    .aClass189_9671)).anInt2218
				       * -1285418291)
				      - (((Class189)
					  ((Class89_Sub3) this).aClass189_9671)
					 .anInt2230) * 2144219087));
	    if (((Class89_Sub3) this).anIntArray9729[i_1240_]
		> (((Class189) ((Class89_Sub3) this).aClass189_9671).anInt2230
		   * 2144219087))
		f_1242_ = 1.0F;
	    else if (((Class89_Sub3) this).anIntArray9729[i_1240_]
		     > (((Class189) ((Class89_Sub3) this).aClass189_9671)
			.anInt2218) * -1285418291)
		f_1242_ = ((float) ((((Class189) (((Class89_Sub3) this)
						  .aClass189_9671)).anInt2218
				     * -1285418291)
				    - (((Class89_Sub3) this).anIntArray9729
				       [i_1240_]))
			   * 1.0F
			   / (float) ((((Class189) (((Class89_Sub3) this)
						    .aClass189_9671)).anInt2218
				       * -1285418291)
				      - (((Class189)
					  ((Class89_Sub3) this).aClass189_9671)
					 .anInt2230) * 2144219087));
	    if (((Class89_Sub3) this).aByteArray9711 == null)
		((Class155) ((Class89_Sub3) this).aClass155_9674).anInt1723
		    = 0;
	    else
		((Class155) ((Class89_Sub3) this).aClass155_9674).anInt1723
		    = ((Class89_Sub3) this).aByteArray9711[i] & 0xff;
	    if (i_1218_ == -1) {
		if (((Class89_Sub3) this).anIntArray9704[i] == -1)
		    ((Class89_Sub3) this).aClass155_9674.method3385
			(bool, bool_1216_, bool_1217_,
			 ((Class89_Sub3) this).aFloatArray9746[i_1238_],
			 ((Class89_Sub3) this).aFloatArray9746[i_1239_],
			 ((Class89_Sub3) this).aFloatArray9746[i_1240_],
			 ((Class89_Sub3) this).aFloatArray9745[i_1238_],
			 ((Class89_Sub3) this).aFloatArray9745[i_1239_],
			 ((Class89_Sub3) this).aFloatArray9745[i_1240_],
			 ((Class89_Sub3) this).aFloatArray9756[i_1238_],
			 ((Class89_Sub3) this).aFloatArray9756[i_1239_],
			 ((Class89_Sub3) this).aFloatArray9756[i_1240_],
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9710[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f * 255.0F, 1372221625),
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9710[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f_1241_ * 255.0F, 1372221625),
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9710[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f_1242_ * 255.0F, 1372221625));
		else
		    ((Class89_Sub3) this).aClass155_9674.method3385
			(bool, bool_1216_, bool_1217_,
			 ((Class89_Sub3) this).aFloatArray9746[i_1238_],
			 ((Class89_Sub3) this).aFloatArray9746[i_1239_],
			 ((Class89_Sub3) this).aFloatArray9746[i_1240_],
			 ((Class89_Sub3) this).aFloatArray9745[i_1238_],
			 ((Class89_Sub3) this).aFloatArray9745[i_1239_],
			 ((Class89_Sub3) this).aFloatArray9745[i_1240_],
			 ((Class89_Sub3) this).aFloatArray9756[i_1238_],
			 ((Class89_Sub3) this).aFloatArray9756[i_1239_],
			 ((Class89_Sub3) this).aFloatArray9756[i_1240_],
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9710[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f * 255.0F, 1372221625),
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9747[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f_1241_ * 255.0F, 1372221625),
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9704[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f_1242_ * 255.0F, 1372221625));
	    } else {
		int i_1243_ = -16777216;
		if (((Class89_Sub3) this).aByteArray9711 != null)
		    i_1243_ = 255 - (((Class89_Sub3) this).aByteArray9711[i]
				     & 0xff) << 24;
		if (((Class89_Sub3) this).anIntArray9704[i] == -1) {
		    int i_1244_
			= i_1243_ | (((Class89_Sub3) this).anIntArray9710[i]
				     & 0xffffff);
		    ((Class89_Sub3) this).aClass155_9674.method3384
			(bool, bool_1216_, bool_1217_,
			 ((Class89_Sub3) this).aFloatArray9746[i_1238_],
			 ((Class89_Sub3) this).aFloatArray9746[i_1239_],
			 ((Class89_Sub3) this).aFloatArray9746[i_1240_],
			 ((Class89_Sub3) this).aFloatArray9745[i_1238_],
			 ((Class89_Sub3) this).aFloatArray9745[i_1239_],
			 ((Class89_Sub3) this).aFloatArray9745[i_1240_],
			 ((Class89_Sub3) this).aFloatArray9756[i_1238_],
			 ((Class89_Sub3) this).aFloatArray9756[i_1239_],
			 ((Class89_Sub3) this).aFloatArray9756[i_1240_],
			 ((Class89_Sub3) this).aFloatArray9700[i_1238_],
			 ((Class89_Sub3) this).aFloatArray9700[i_1239_],
			 ((Class89_Sub3) this).aFloatArray9700[i_1240_],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][0],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][1],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][2],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][0],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][1],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][2],
			 i_1244_, i_1244_, i_1244_,
			 (((Class189) ((Class89_Sub3) this).aClass189_9671)
			  .anInt2215) * -338296791,
			 f * 255.0F, f_1241_ * 255.0F, f_1242_ * 255.0F,
			 ((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
			 i_1218_);
		} else
		    ((Class89_Sub3) this).aClass155_9674.method3384
			(bool, bool_1216_, bool_1217_,
			 ((Class89_Sub3) this).aFloatArray9746[i_1238_],
			 ((Class89_Sub3) this).aFloatArray9746[i_1239_],
			 ((Class89_Sub3) this).aFloatArray9746[i_1240_],
			 ((Class89_Sub3) this).aFloatArray9745[i_1238_],
			 ((Class89_Sub3) this).aFloatArray9745[i_1239_],
			 ((Class89_Sub3) this).aFloatArray9745[i_1240_],
			 ((Class89_Sub3) this).aFloatArray9756[i_1238_],
			 ((Class89_Sub3) this).aFloatArray9756[i_1239_],
			 ((Class89_Sub3) this).aFloatArray9756[i_1240_],
			 ((Class89_Sub3) this).aFloatArray9700[i_1238_],
			 ((Class89_Sub3) this).aFloatArray9700[i_1239_],
			 ((Class89_Sub3) this).aFloatArray9700[i_1240_],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][0],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][1],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][2],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][0],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][1],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][2],
			 i_1243_ | (((Class89_Sub3) this).anIntArray9710[i]
				    & 0xffffff),
			 i_1243_ | (((Class89_Sub3) this).anIntArray9747[i]
				    & 0xffffff),
			 i_1243_ | (((Class89_Sub3) this).anIntArray9704[i]
				    & 0xffffff),
			 (((Class189) ((Class89_Sub3) this).aClass189_9671)
			  .anInt2215) * -338296791,
			 f * 255.0F, f_1241_ * 255.0F, f_1242_ * 255.0F,
			 ((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
			 i_1218_);
	    }
	}
    }
    
    public void method1960(int i, int i_1245_, Class166 class166,
			   Class166 class166_1246_, int i_1247_, int i_1248_,
			   int i_1249_) {
	if (i == 3) {
	    if ((((Class89_Sub3) this).anInt9683 & 0x7) != 7)
		throw new IllegalStateException();
	} else if ((((Class89_Sub3) this).anInt9683 & 0x2) != 2)
	    throw new IllegalStateException();
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	int i_1250_ = i_1247_ + ((Class89_Sub3) this).aShort9735;
	int i_1251_ = i_1247_ + ((Class89_Sub3) this).aShort9736;
	int i_1252_ = i_1249_ + ((Class89_Sub3) this).aShort9737;
	int i_1253_ = i_1249_ + ((Class89_Sub3) this).aShort9738;
	if (i == 4 || (i_1250_ >= 0
		       && ((i_1251_ + class166.anInt2053 * 2039042417
			    >> class166.anInt2054 * -122333825)
			   < class166.anInt2055 * 266270313)
		       && i_1252_ >= 0
		       && ((i_1253_ + class166.anInt2053 * 2039042417
			    >> class166.anInt2054 * -122333825)
			   < class166.anInt2052 * -14610189))) {
	    int[][] is = class166.anIntArrayArray2051;
	    int[][] is_1254_ = null;
	    if (class166_1246_ != null)
		is_1254_ = class166_1246_.anIntArrayArray2051;
	    if (i == 4 || i == 5) {
		if (class166_1246_ == null
		    || (i_1250_ < 0
			|| ((i_1251_ + class166_1246_.anInt2053 * 2039042417
			     >> class166_1246_.anInt2054 * -122333825)
			    >= class166_1246_.anInt2055 * 266270313)
			|| i_1252_ < 0
			|| ((i_1253_ + class166_1246_.anInt2053 * 2039042417
			     >> class166_1246_.anInt2054 * -122333825)
			    >= class166_1246_.anInt2052 * -14610189)))
		    return;
	    } else {
		i_1250_ >>= class166.anInt2054 * -122333825;
		i_1251_ = (i_1251_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		i_1252_ >>= class166.anInt2054 * -122333825;
		i_1253_ = (i_1253_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		if (is[i_1250_][i_1252_] == i_1248_
		    && is[i_1251_][i_1252_] == i_1248_
		    && is[i_1250_][i_1253_] == i_1248_
		    && is[i_1251_][i_1253_] == i_1248_)
		    return;
	    }
	    synchronized (this) {
		if (i == 1) {
		    int i_1255_ = class166.anInt2053 * 2039042417 - 1;
		    for (int i_1256_ = 0;
			 i_1256_ < ((Class89_Sub3) this).anInt9687;
			 i_1256_++) {
			int i_1257_
			    = (((Class89_Sub3) this).anIntArray9670[i_1256_]
			       + i_1247_);
			int i_1258_
			    = (((Class89_Sub3) this).anIntArray9684[i_1256_]
			       + i_1249_);
			int i_1259_ = i_1257_ & i_1255_;
			int i_1260_ = i_1258_ & i_1255_;
			int i_1261_
			    = i_1257_ >> class166.anInt2054 * -122333825;
			int i_1262_
			    = i_1258_ >> class166.anInt2054 * -122333825;
			int i_1263_
			    = (((is[i_1261_][i_1262_]
				 * (class166.anInt2053 * 2039042417 - i_1259_))
				+ is[i_1261_ + 1][i_1262_] * i_1259_)
			       >> class166.anInt2054 * -122333825);
			int i_1264_
			    = (((is[i_1261_][i_1262_ + 1]
				 * (class166.anInt2053 * 2039042417 - i_1259_))
				+ is[i_1261_ + 1][i_1262_ + 1] * i_1259_)
			       >> class166.anInt2054 * -122333825);
			int i_1265_
			    = (i_1263_ * (class166.anInt2053 * 2039042417
					  - i_1260_) + i_1264_ * i_1260_
			       >> class166.anInt2054 * -122333825);
			((Class89_Sub3) this).anIntArray9685[i_1256_]
			    = (((Class89_Sub3) this).anIntArray9685[i_1256_]
			       + i_1265_ - i_1248_);
		    }
		    for (int i_1266_ = ((Class89_Sub3) this).anInt9687;
			 i_1266_ < ((Class89_Sub3) this).anInt9686;
			 i_1266_++) {
			int i_1267_
			    = (((Class89_Sub3) this).anIntArray9670[i_1266_]
			       + i_1247_);
			int i_1268_
			    = (((Class89_Sub3) this).anIntArray9684[i_1266_]
			       + i_1249_);
			int i_1269_ = i_1267_ & i_1255_;
			int i_1270_ = i_1268_ & i_1255_;
			int i_1271_
			    = i_1267_ >> class166.anInt2054 * -122333825;
			int i_1272_
			    = i_1268_ >> class166.anInt2054 * -122333825;
			if (i_1271_ >= 0 && i_1271_ < is.length - 1
			    && i_1272_ >= 0 && i_1272_ < is[0].length - 1) {
			    int i_1273_
				= (((is[i_1271_][i_1272_]
				     * (class166.anInt2053 * 2039042417
					- i_1269_))
				    + is[i_1271_ + 1][i_1272_] * i_1269_)
				   >> class166.anInt2054 * -122333825);
			    int i_1274_
				= (((is[i_1271_][i_1272_ + 1]
				     * (class166.anInt2053 * 2039042417
					- i_1269_))
				    + is[i_1271_ + 1][i_1272_ + 1] * i_1269_)
				   >> class166.anInt2054 * -122333825);
			    int i_1275_
				= (i_1273_ * (class166.anInt2053 * 2039042417
					      - i_1270_) + i_1274_ * i_1270_
				   >> class166.anInt2054 * -122333825);
			    ((Class89_Sub3) this).anIntArray9685[i_1266_]
				= (((Class89_Sub3) this).anIntArray9685
				   [i_1266_]) + i_1275_ - i_1248_;
			}
		    }
		} else if (i == 2) {
		    if (((Class89_Sub3) this).aShort9733 == 0)
			return;
		    int i_1276_ = class166.anInt2053 * 2039042417 - 1;
		    for (int i_1277_ = 0;
			 i_1277_ < ((Class89_Sub3) this).anInt9687;
			 i_1277_++) {
			int i_1278_
			    = ((((Class89_Sub3) this).anIntArray9685[i_1277_]
				<< 16)
			       / ((Class89_Sub3) this).aShort9733);
			if (i_1278_ < i_1245_) {
			    int i_1279_ = ((((Class89_Sub3) this)
					    .anIntArray9670[i_1277_])
					   + i_1247_);
			    int i_1280_ = ((((Class89_Sub3) this)
					    .anIntArray9684[i_1277_])
					   + i_1249_);
			    int i_1281_ = i_1279_ & i_1276_;
			    int i_1282_ = i_1280_ & i_1276_;
			    int i_1283_
				= i_1279_ >> class166.anInt2054 * -122333825;
			    int i_1284_
				= i_1280_ >> class166.anInt2054 * -122333825;
			    int i_1285_
				= (((is[i_1283_][i_1284_]
				     * (class166.anInt2053 * 2039042417
					- i_1281_))
				    + is[i_1283_ + 1][i_1284_] * i_1281_)
				   >> class166.anInt2054 * -122333825);
			    int i_1286_
				= (((is[i_1283_][i_1284_ + 1]
				     * (class166.anInt2053 * 2039042417
					- i_1281_))
				    + is[i_1283_ + 1][i_1284_ + 1] * i_1281_)
				   >> class166.anInt2054 * -122333825);
			    int i_1287_
				= (i_1285_ * (class166.anInt2053 * 2039042417
					      - i_1282_) + i_1286_ * i_1282_
				   >> class166.anInt2054 * -122333825);
			    ((Class89_Sub3) this).anIntArray9685[i_1277_]
				= ((((Class89_Sub3) this).anIntArray9685
				    [i_1277_])
				   + ((i_1287_ - i_1248_) * (i_1245_ - i_1278_)
				      / i_1245_));
			} else
			    ((Class89_Sub3) this).anIntArray9685[i_1277_]
				= (((Class89_Sub3) this).anIntArray9685
				   [i_1277_]);
		    }
		    for (int i_1288_ = ((Class89_Sub3) this).anInt9687;
			 i_1288_ < ((Class89_Sub3) this).anInt9686;
			 i_1288_++) {
			int i_1289_
			    = ((((Class89_Sub3) this).anIntArray9685[i_1288_]
				<< 16)
			       / ((Class89_Sub3) this).aShort9733);
			if (i_1289_ < i_1245_) {
			    int i_1290_ = ((((Class89_Sub3) this)
					    .anIntArray9670[i_1288_])
					   + i_1247_);
			    int i_1291_ = ((((Class89_Sub3) this)
					    .anIntArray9684[i_1288_])
					   + i_1249_);
			    int i_1292_ = i_1290_ & i_1276_;
			    int i_1293_ = i_1291_ & i_1276_;
			    int i_1294_
				= i_1290_ >> class166.anInt2054 * -122333825;
			    int i_1295_
				= i_1291_ >> class166.anInt2054 * -122333825;
			    if (i_1294_ >= 0
				&& i_1294_ < class166.anInt2055 * 266270313 - 1
				&& i_1295_ >= 0
				&& (i_1295_
				    < class166.anInt2052 * -14610189 - 1)) {
				int i_1296_
				    = (((is[i_1294_][i_1295_]
					 * (class166.anInt2053 * 2039042417
					    - i_1292_))
					+ is[i_1294_ + 1][i_1295_] * i_1292_)
				       >> class166.anInt2054 * -122333825);
				int i_1297_
				    = (((is[i_1294_][i_1295_ + 1]
					 * (class166.anInt2053 * 2039042417
					    - i_1292_))
					+ (is[i_1294_ + 1][i_1295_ + 1]
					   * i_1292_))
				       >> class166.anInt2054 * -122333825);
				int i_1298_
				    = ((i_1296_
					* (class166.anInt2053 * 2039042417
					   - i_1293_)) + i_1297_ * i_1293_
				       >> class166.anInt2054 * -122333825);
				((Class89_Sub3) this).anIntArray9685[i_1288_]
				    = ((((Class89_Sub3) this).anIntArray9685
					[i_1288_])
				       + ((i_1298_ - i_1248_)
					  * (i_1245_ - i_1289_) / i_1245_));
			    }
			} else
			    ((Class89_Sub3) this).anIntArray9685[i_1288_]
				= (((Class89_Sub3) this).anIntArray9685
				   [i_1288_]);
		    }
		} else if (i == 3) {
		    int i_1299_ = (i_1245_ & 0xff) * 4;
		    int i_1300_ = (i_1245_ >> 8 & 0xff) * 4;
		    int i_1301_ = (i_1245_ >> 16 & 0xff) << 6;
		    int i_1302_ = (i_1245_ >> 24 & 0xff) << 6;
		    if (i_1247_ - (i_1299_ >> 1) < 0
			|| ((i_1247_ + (i_1299_ >> 1)
			     + class166.anInt2053 * 2039042417)
			    >= (class166.anInt2055 * 266270313
				<< class166.anInt2054 * -122333825))
			|| i_1249_ - (i_1300_ >> 1) < 0
			|| ((i_1249_ + (i_1300_ >> 1)
			     + class166.anInt2053 * 2039042417)
			    >= (class166.anInt2052 * -14610189
				<< class166.anInt2054 * -122333825)))
			return;
		    method2041(class166, i_1247_, i_1248_, i_1249_, i_1299_,
			       i_1300_, i_1301_, i_1302_);
		} else if (i == 4) {
		    int i_1303_ = class166_1246_.anInt2053 * 2039042417 - 1;
		    int i_1304_ = (((Class89_Sub3) this).aShort9734
				   - ((Class89_Sub3) this).aShort9733);
		    for (int i_1305_ = 0;
			 i_1305_ < ((Class89_Sub3) this).anInt9687;
			 i_1305_++) {
			int i_1306_
			    = (((Class89_Sub3) this).anIntArray9670[i_1305_]
			       + i_1247_);
			int i_1307_
			    = (((Class89_Sub3) this).anIntArray9684[i_1305_]
			       + i_1249_);
			int i_1308_ = i_1306_ & i_1303_;
			int i_1309_ = i_1307_ & i_1303_;
			int i_1310_
			    = i_1306_ >> class166_1246_.anInt2054 * -122333825;
			int i_1311_
			    = i_1307_ >> class166_1246_.anInt2054 * -122333825;
			int i_1312_
			    = (((is_1254_[i_1310_][i_1311_]
				 * (class166_1246_.anInt2053 * 2039042417
				    - i_1308_))
				+ is_1254_[i_1310_ + 1][i_1311_] * i_1308_)
			       >> class166_1246_.anInt2054 * -122333825);
			int i_1313_
			    = (((is_1254_[i_1310_][i_1311_ + 1]
				 * (class166_1246_.anInt2053 * 2039042417
				    - i_1308_))
				+ is_1254_[i_1310_ + 1][i_1311_ + 1] * i_1308_)
			       >> class166_1246_.anInt2054 * -122333825);
			int i_1314_
			    = (i_1312_ * (class166_1246_.anInt2053 * 2039042417
					  - i_1309_) + i_1313_ * i_1309_
			       >> class166_1246_.anInt2054 * -122333825);
			((Class89_Sub3) this).anIntArray9685[i_1305_]
			    = (((Class89_Sub3) this).anIntArray9685[i_1305_]
			       + (i_1314_ - i_1248_) + i_1304_);
		    }
		    for (int i_1315_ = ((Class89_Sub3) this).anInt9687;
			 i_1315_ < ((Class89_Sub3) this).anInt9686;
			 i_1315_++) {
			int i_1316_
			    = (((Class89_Sub3) this).anIntArray9670[i_1315_]
			       + i_1247_);
			int i_1317_
			    = (((Class89_Sub3) this).anIntArray9684[i_1315_]
			       + i_1249_);
			int i_1318_ = i_1316_ & i_1303_;
			int i_1319_ = i_1317_ & i_1303_;
			int i_1320_
			    = i_1316_ >> class166_1246_.anInt2054 * -122333825;
			int i_1321_
			    = i_1317_ >> class166_1246_.anInt2054 * -122333825;
			if (i_1320_ >= 0
			    && (i_1320_
				< class166_1246_.anInt2055 * 266270313 - 1)
			    && i_1321_ >= 0
			    && (i_1321_
				< class166_1246_.anInt2052 * -14610189 - 1)) {
			    int i_1322_
				= (((is_1254_[i_1320_][i_1321_]
				     * (class166_1246_.anInt2053 * 2039042417
					- i_1318_))
				    + is_1254_[i_1320_ + 1][i_1321_] * i_1318_)
				   >> class166_1246_.anInt2054 * -122333825);
			    int i_1323_
				= (((is_1254_[i_1320_][i_1321_ + 1]
				     * (class166_1246_.anInt2053 * 2039042417
					- i_1318_))
				    + (is_1254_[i_1320_ + 1][i_1321_ + 1]
				       * i_1318_))
				   >> class166_1246_.anInt2054 * -122333825);
			    int i_1324_
				= ((i_1322_
				    * (class166_1246_.anInt2053 * 2039042417
				       - i_1319_)) + i_1323_ * i_1319_
				   >> class166_1246_.anInt2054 * -122333825);
			    ((Class89_Sub3) this).anIntArray9685[i_1315_]
				= (((Class89_Sub3) this).anIntArray9685
				   [i_1315_]) + (i_1324_ - i_1248_) + i_1304_;
			}
		    }
		} else if (i == 5) {
		    int i_1325_ = class166_1246_.anInt2053 * 2039042417 - 1;
		    int i_1326_ = (((Class89_Sub3) this).aShort9734
				   - ((Class89_Sub3) this).aShort9733);
		    for (int i_1327_ = 0;
			 i_1327_ < ((Class89_Sub3) this).anInt9687;
			 i_1327_++) {
			int i_1328_
			    = (((Class89_Sub3) this).anIntArray9670[i_1327_]
			       + i_1247_);
			int i_1329_
			    = (((Class89_Sub3) this).anIntArray9684[i_1327_]
			       + i_1249_);
			int i_1330_ = i_1328_ & i_1325_;
			int i_1331_ = i_1329_ & i_1325_;
			int i_1332_
			    = i_1328_ >> class166.anInt2054 * -122333825;
			int i_1333_
			    = i_1329_ >> class166.anInt2054 * -122333825;
			int i_1334_
			    = (((is[i_1332_][i_1333_]
				 * (class166.anInt2053 * 2039042417 - i_1330_))
				+ is[i_1332_ + 1][i_1333_] * i_1330_)
			       >> class166.anInt2054 * -122333825);
			int i_1335_
			    = (((is[i_1332_][i_1333_ + 1]
				 * (class166.anInt2053 * 2039042417 - i_1330_))
				+ is[i_1332_ + 1][i_1333_ + 1] * i_1330_)
			       >> class166.anInt2054 * -122333825);
			int i_1336_
			    = (i_1334_ * (class166.anInt2053 * 2039042417
					  - i_1331_) + i_1335_ * i_1331_
			       >> class166.anInt2054 * -122333825);
			i_1334_ = (((is_1254_[i_1332_][i_1333_]
				     * (class166_1246_.anInt2053 * 2039042417
					- i_1330_))
				    + is_1254_[i_1332_ + 1][i_1333_] * i_1330_)
				   >> class166_1246_.anInt2054 * -122333825);
			i_1335_
			    = (((is_1254_[i_1332_][i_1333_ + 1]
				 * (class166_1246_.anInt2053 * 2039042417
				    - i_1330_))
				+ is_1254_[i_1332_ + 1][i_1333_ + 1] * i_1330_)
			       >> class166_1246_.anInt2054 * -122333825);
			int i_1337_
			    = (i_1334_ * (class166_1246_.anInt2053 * 2039042417
					  - i_1331_) + i_1335_ * i_1331_
			       >> class166_1246_.anInt2054 * -122333825);
			int i_1338_ = i_1336_ - i_1337_ - i_1245_;
			((Class89_Sub3) this).anIntArray9685[i_1327_]
			    = ((((Class89_Sub3) this).anIntArray9685[i_1327_]
				<< 8) / i_1326_ * i_1338_
			       >> 8) - (i_1248_ - i_1336_);
		    }
		    for (int i_1339_ = ((Class89_Sub3) this).anInt9687;
			 i_1339_ < ((Class89_Sub3) this).anInt9686;
			 i_1339_++) {
			int i_1340_
			    = (((Class89_Sub3) this).anIntArray9670[i_1339_]
			       + i_1247_);
			int i_1341_
			    = (((Class89_Sub3) this).anIntArray9684[i_1339_]
			       + i_1249_);
			int i_1342_ = i_1340_ & i_1325_;
			int i_1343_ = i_1341_ & i_1325_;
			int i_1344_
			    = i_1340_ >> class166.anInt2054 * -122333825;
			int i_1345_
			    = i_1341_ >> class166.anInt2054 * -122333825;
			if (i_1344_ >= 0
			    && i_1344_ < class166.anInt2055 * 266270313 - 1
			    && (i_1344_
				< class166_1246_.anInt2055 * 266270313 - 1)
			    && i_1345_ >= 0
			    && i_1345_ < class166.anInt2052 * -14610189 - 1
			    && (i_1345_
				< class166_1246_.anInt2052 * -14610189 - 1)) {
			    int i_1346_
				= (((is[i_1344_][i_1345_]
				     * (class166.anInt2053 * 2039042417
					- i_1342_))
				    + is[i_1344_ + 1][i_1345_] * i_1342_)
				   >> class166.anInt2054 * -122333825);
			    int i_1347_
				= (((is[i_1344_][i_1345_ + 1]
				     * (class166.anInt2053 * 2039042417
					- i_1342_))
				    + is[i_1344_ + 1][i_1345_ + 1] * i_1342_)
				   >> class166.anInt2054 * -122333825);
			    int i_1348_
				= (i_1346_ * (class166.anInt2053 * 2039042417
					      - i_1343_) + i_1347_ * i_1343_
				   >> class166.anInt2054 * -122333825);
			    i_1346_
				= (((is_1254_[i_1344_][i_1345_]
				     * (class166_1246_.anInt2053 * 2039042417
					- i_1342_))
				    + is_1254_[i_1344_ + 1][i_1345_] * i_1342_)
				   >> class166_1246_.anInt2054 * -122333825);
			    i_1347_
				= (((is_1254_[i_1344_][i_1345_ + 1]
				     * (class166_1246_.anInt2053 * 2039042417
					- i_1342_))
				    + (is_1254_[i_1344_ + 1][i_1345_ + 1]
				       * i_1342_))
				   >> class166_1246_.anInt2054 * -122333825);
			    int i_1349_
				= ((i_1346_
				    * (class166_1246_.anInt2053 * 2039042417
				       - i_1343_)) + i_1347_ * i_1343_
				   >> class166_1246_.anInt2054 * -122333825);
			    int i_1350_ = i_1348_ - i_1349_ - i_1245_;
			    ((Class89_Sub3) this).anIntArray9685[i_1339_]
				= (((((Class89_Sub3) this).anIntArray9685
				     [i_1339_])
				    << 8) / i_1326_ * i_1350_
				   >> 8) - (i_1248_ - i_1348_);
			}
		    }
		}
		((Class89_Sub3) this).aBool9730 = false;
	    }
	}
    }
    
    public void method2013(int i, int i_1351_, Class166 class166,
			   Class166 class166_1352_, int i_1353_, int i_1354_,
			   int i_1355_) {
	if (i == 3) {
	    if ((((Class89_Sub3) this).anInt9683 & 0x7) != 7)
		throw new IllegalStateException();
	} else if ((((Class89_Sub3) this).anInt9683 & 0x2) != 2)
	    throw new IllegalStateException();
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	int i_1356_ = i_1353_ + ((Class89_Sub3) this).aShort9735;
	int i_1357_ = i_1353_ + ((Class89_Sub3) this).aShort9736;
	int i_1358_ = i_1355_ + ((Class89_Sub3) this).aShort9737;
	int i_1359_ = i_1355_ + ((Class89_Sub3) this).aShort9738;
	if (i == 4 || (i_1356_ >= 0
		       && ((i_1357_ + class166.anInt2053 * 2039042417
			    >> class166.anInt2054 * -122333825)
			   < class166.anInt2055 * 266270313)
		       && i_1358_ >= 0
		       && ((i_1359_ + class166.anInt2053 * 2039042417
			    >> class166.anInt2054 * -122333825)
			   < class166.anInt2052 * -14610189))) {
	    int[][] is = class166.anIntArrayArray2051;
	    int[][] is_1360_ = null;
	    if (class166_1352_ != null)
		is_1360_ = class166_1352_.anIntArrayArray2051;
	    if (i == 4 || i == 5) {
		if (class166_1352_ == null
		    || (i_1356_ < 0
			|| ((i_1357_ + class166_1352_.anInt2053 * 2039042417
			     >> class166_1352_.anInt2054 * -122333825)
			    >= class166_1352_.anInt2055 * 266270313)
			|| i_1358_ < 0
			|| ((i_1359_ + class166_1352_.anInt2053 * 2039042417
			     >> class166_1352_.anInt2054 * -122333825)
			    >= class166_1352_.anInt2052 * -14610189)))
		    return;
	    } else {
		i_1356_ >>= class166.anInt2054 * -122333825;
		i_1357_ = (i_1357_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		i_1358_ >>= class166.anInt2054 * -122333825;
		i_1359_ = (i_1359_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		if (is[i_1356_][i_1358_] == i_1354_
		    && is[i_1357_][i_1358_] == i_1354_
		    && is[i_1356_][i_1359_] == i_1354_
		    && is[i_1357_][i_1359_] == i_1354_)
		    return;
	    }
	    synchronized (this) {
		if (i == 1) {
		    int i_1361_ = class166.anInt2053 * 2039042417 - 1;
		    for (int i_1362_ = 0;
			 i_1362_ < ((Class89_Sub3) this).anInt9687;
			 i_1362_++) {
			int i_1363_
			    = (((Class89_Sub3) this).anIntArray9670[i_1362_]
			       + i_1353_);
			int i_1364_
			    = (((Class89_Sub3) this).anIntArray9684[i_1362_]
			       + i_1355_);
			int i_1365_ = i_1363_ & i_1361_;
			int i_1366_ = i_1364_ & i_1361_;
			int i_1367_
			    = i_1363_ >> class166.anInt2054 * -122333825;
			int i_1368_
			    = i_1364_ >> class166.anInt2054 * -122333825;
			int i_1369_
			    = (((is[i_1367_][i_1368_]
				 * (class166.anInt2053 * 2039042417 - i_1365_))
				+ is[i_1367_ + 1][i_1368_] * i_1365_)
			       >> class166.anInt2054 * -122333825);
			int i_1370_
			    = (((is[i_1367_][i_1368_ + 1]
				 * (class166.anInt2053 * 2039042417 - i_1365_))
				+ is[i_1367_ + 1][i_1368_ + 1] * i_1365_)
			       >> class166.anInt2054 * -122333825);
			int i_1371_
			    = (i_1369_ * (class166.anInt2053 * 2039042417
					  - i_1366_) + i_1370_ * i_1366_
			       >> class166.anInt2054 * -122333825);
			((Class89_Sub3) this).anIntArray9685[i_1362_]
			    = (((Class89_Sub3) this).anIntArray9685[i_1362_]
			       + i_1371_ - i_1354_);
		    }
		    for (int i_1372_ = ((Class89_Sub3) this).anInt9687;
			 i_1372_ < ((Class89_Sub3) this).anInt9686;
			 i_1372_++) {
			int i_1373_
			    = (((Class89_Sub3) this).anIntArray9670[i_1372_]
			       + i_1353_);
			int i_1374_
			    = (((Class89_Sub3) this).anIntArray9684[i_1372_]
			       + i_1355_);
			int i_1375_ = i_1373_ & i_1361_;
			int i_1376_ = i_1374_ & i_1361_;
			int i_1377_
			    = i_1373_ >> class166.anInt2054 * -122333825;
			int i_1378_
			    = i_1374_ >> class166.anInt2054 * -122333825;
			if (i_1377_ >= 0 && i_1377_ < is.length - 1
			    && i_1378_ >= 0 && i_1378_ < is[0].length - 1) {
			    int i_1379_
				= (((is[i_1377_][i_1378_]
				     * (class166.anInt2053 * 2039042417
					- i_1375_))
				    + is[i_1377_ + 1][i_1378_] * i_1375_)
				   >> class166.anInt2054 * -122333825);
			    int i_1380_
				= (((is[i_1377_][i_1378_ + 1]
				     * (class166.anInt2053 * 2039042417
					- i_1375_))
				    + is[i_1377_ + 1][i_1378_ + 1] * i_1375_)
				   >> class166.anInt2054 * -122333825);
			    int i_1381_
				= (i_1379_ * (class166.anInt2053 * 2039042417
					      - i_1376_) + i_1380_ * i_1376_
				   >> class166.anInt2054 * -122333825);
			    ((Class89_Sub3) this).anIntArray9685[i_1372_]
				= (((Class89_Sub3) this).anIntArray9685
				   [i_1372_]) + i_1381_ - i_1354_;
			}
		    }
		} else if (i == 2) {
		    if (((Class89_Sub3) this).aShort9733 == 0)
			return;
		    int i_1382_ = class166.anInt2053 * 2039042417 - 1;
		    for (int i_1383_ = 0;
			 i_1383_ < ((Class89_Sub3) this).anInt9687;
			 i_1383_++) {
			int i_1384_
			    = ((((Class89_Sub3) this).anIntArray9685[i_1383_]
				<< 16)
			       / ((Class89_Sub3) this).aShort9733);
			if (i_1384_ < i_1351_) {
			    int i_1385_ = ((((Class89_Sub3) this)
					    .anIntArray9670[i_1383_])
					   + i_1353_);
			    int i_1386_ = ((((Class89_Sub3) this)
					    .anIntArray9684[i_1383_])
					   + i_1355_);
			    int i_1387_ = i_1385_ & i_1382_;
			    int i_1388_ = i_1386_ & i_1382_;
			    int i_1389_
				= i_1385_ >> class166.anInt2054 * -122333825;
			    int i_1390_
				= i_1386_ >> class166.anInt2054 * -122333825;
			    int i_1391_
				= (((is[i_1389_][i_1390_]
				     * (class166.anInt2053 * 2039042417
					- i_1387_))
				    + is[i_1389_ + 1][i_1390_] * i_1387_)
				   >> class166.anInt2054 * -122333825);
			    int i_1392_
				= (((is[i_1389_][i_1390_ + 1]
				     * (class166.anInt2053 * 2039042417
					- i_1387_))
				    + is[i_1389_ + 1][i_1390_ + 1] * i_1387_)
				   >> class166.anInt2054 * -122333825);
			    int i_1393_
				= (i_1391_ * (class166.anInt2053 * 2039042417
					      - i_1388_) + i_1392_ * i_1388_
				   >> class166.anInt2054 * -122333825);
			    ((Class89_Sub3) this).anIntArray9685[i_1383_]
				= ((((Class89_Sub3) this).anIntArray9685
				    [i_1383_])
				   + ((i_1393_ - i_1354_) * (i_1351_ - i_1384_)
				      / i_1351_));
			} else
			    ((Class89_Sub3) this).anIntArray9685[i_1383_]
				= (((Class89_Sub3) this).anIntArray9685
				   [i_1383_]);
		    }
		    for (int i_1394_ = ((Class89_Sub3) this).anInt9687;
			 i_1394_ < ((Class89_Sub3) this).anInt9686;
			 i_1394_++) {
			int i_1395_
			    = ((((Class89_Sub3) this).anIntArray9685[i_1394_]
				<< 16)
			       / ((Class89_Sub3) this).aShort9733);
			if (i_1395_ < i_1351_) {
			    int i_1396_ = ((((Class89_Sub3) this)
					    .anIntArray9670[i_1394_])
					   + i_1353_);
			    int i_1397_ = ((((Class89_Sub3) this)
					    .anIntArray9684[i_1394_])
					   + i_1355_);
			    int i_1398_ = i_1396_ & i_1382_;
			    int i_1399_ = i_1397_ & i_1382_;
			    int i_1400_
				= i_1396_ >> class166.anInt2054 * -122333825;
			    int i_1401_
				= i_1397_ >> class166.anInt2054 * -122333825;
			    if (i_1400_ >= 0
				&& i_1400_ < class166.anInt2055 * 266270313 - 1
				&& i_1401_ >= 0
				&& (i_1401_
				    < class166.anInt2052 * -14610189 - 1)) {
				int i_1402_
				    = (((is[i_1400_][i_1401_]
					 * (class166.anInt2053 * 2039042417
					    - i_1398_))
					+ is[i_1400_ + 1][i_1401_] * i_1398_)
				       >> class166.anInt2054 * -122333825);
				int i_1403_
				    = (((is[i_1400_][i_1401_ + 1]
					 * (class166.anInt2053 * 2039042417
					    - i_1398_))
					+ (is[i_1400_ + 1][i_1401_ + 1]
					   * i_1398_))
				       >> class166.anInt2054 * -122333825);
				int i_1404_
				    = ((i_1402_
					* (class166.anInt2053 * 2039042417
					   - i_1399_)) + i_1403_ * i_1399_
				       >> class166.anInt2054 * -122333825);
				((Class89_Sub3) this).anIntArray9685[i_1394_]
				    = ((((Class89_Sub3) this).anIntArray9685
					[i_1394_])
				       + ((i_1404_ - i_1354_)
					  * (i_1351_ - i_1395_) / i_1351_));
			    }
			} else
			    ((Class89_Sub3) this).anIntArray9685[i_1394_]
				= (((Class89_Sub3) this).anIntArray9685
				   [i_1394_]);
		    }
		} else if (i == 3) {
		    int i_1405_ = (i_1351_ & 0xff) * 4;
		    int i_1406_ = (i_1351_ >> 8 & 0xff) * 4;
		    int i_1407_ = (i_1351_ >> 16 & 0xff) << 6;
		    int i_1408_ = (i_1351_ >> 24 & 0xff) << 6;
		    if (i_1353_ - (i_1405_ >> 1) < 0
			|| ((i_1353_ + (i_1405_ >> 1)
			     + class166.anInt2053 * 2039042417)
			    >= (class166.anInt2055 * 266270313
				<< class166.anInt2054 * -122333825))
			|| i_1355_ - (i_1406_ >> 1) < 0
			|| ((i_1355_ + (i_1406_ >> 1)
			     + class166.anInt2053 * 2039042417)
			    >= (class166.anInt2052 * -14610189
				<< class166.anInt2054 * -122333825)))
			return;
		    method2041(class166, i_1353_, i_1354_, i_1355_, i_1405_,
			       i_1406_, i_1407_, i_1408_);
		} else if (i == 4) {
		    int i_1409_ = class166_1352_.anInt2053 * 2039042417 - 1;
		    int i_1410_ = (((Class89_Sub3) this).aShort9734
				   - ((Class89_Sub3) this).aShort9733);
		    for (int i_1411_ = 0;
			 i_1411_ < ((Class89_Sub3) this).anInt9687;
			 i_1411_++) {
			int i_1412_
			    = (((Class89_Sub3) this).anIntArray9670[i_1411_]
			       + i_1353_);
			int i_1413_
			    = (((Class89_Sub3) this).anIntArray9684[i_1411_]
			       + i_1355_);
			int i_1414_ = i_1412_ & i_1409_;
			int i_1415_ = i_1413_ & i_1409_;
			int i_1416_
			    = i_1412_ >> class166_1352_.anInt2054 * -122333825;
			int i_1417_
			    = i_1413_ >> class166_1352_.anInt2054 * -122333825;
			int i_1418_
			    = (((is_1360_[i_1416_][i_1417_]
				 * (class166_1352_.anInt2053 * 2039042417
				    - i_1414_))
				+ is_1360_[i_1416_ + 1][i_1417_] * i_1414_)
			       >> class166_1352_.anInt2054 * -122333825);
			int i_1419_
			    = (((is_1360_[i_1416_][i_1417_ + 1]
				 * (class166_1352_.anInt2053 * 2039042417
				    - i_1414_))
				+ is_1360_[i_1416_ + 1][i_1417_ + 1] * i_1414_)
			       >> class166_1352_.anInt2054 * -122333825);
			int i_1420_
			    = (i_1418_ * (class166_1352_.anInt2053 * 2039042417
					  - i_1415_) + i_1419_ * i_1415_
			       >> class166_1352_.anInt2054 * -122333825);
			((Class89_Sub3) this).anIntArray9685[i_1411_]
			    = (((Class89_Sub3) this).anIntArray9685[i_1411_]
			       + (i_1420_ - i_1354_) + i_1410_);
		    }
		    for (int i_1421_ = ((Class89_Sub3) this).anInt9687;
			 i_1421_ < ((Class89_Sub3) this).anInt9686;
			 i_1421_++) {
			int i_1422_
			    = (((Class89_Sub3) this).anIntArray9670[i_1421_]
			       + i_1353_);
			int i_1423_
			    = (((Class89_Sub3) this).anIntArray9684[i_1421_]
			       + i_1355_);
			int i_1424_ = i_1422_ & i_1409_;
			int i_1425_ = i_1423_ & i_1409_;
			int i_1426_
			    = i_1422_ >> class166_1352_.anInt2054 * -122333825;
			int i_1427_
			    = i_1423_ >> class166_1352_.anInt2054 * -122333825;
			if (i_1426_ >= 0
			    && (i_1426_
				< class166_1352_.anInt2055 * 266270313 - 1)
			    && i_1427_ >= 0
			    && (i_1427_
				< class166_1352_.anInt2052 * -14610189 - 1)) {
			    int i_1428_
				= (((is_1360_[i_1426_][i_1427_]
				     * (class166_1352_.anInt2053 * 2039042417
					- i_1424_))
				    + is_1360_[i_1426_ + 1][i_1427_] * i_1424_)
				   >> class166_1352_.anInt2054 * -122333825);
			    int i_1429_
				= (((is_1360_[i_1426_][i_1427_ + 1]
				     * (class166_1352_.anInt2053 * 2039042417
					- i_1424_))
				    + (is_1360_[i_1426_ + 1][i_1427_ + 1]
				       * i_1424_))
				   >> class166_1352_.anInt2054 * -122333825);
			    int i_1430_
				= ((i_1428_
				    * (class166_1352_.anInt2053 * 2039042417
				       - i_1425_)) + i_1429_ * i_1425_
				   >> class166_1352_.anInt2054 * -122333825);
			    ((Class89_Sub3) this).anIntArray9685[i_1421_]
				= (((Class89_Sub3) this).anIntArray9685
				   [i_1421_]) + (i_1430_ - i_1354_) + i_1410_;
			}
		    }
		} else if (i == 5) {
		    int i_1431_ = class166_1352_.anInt2053 * 2039042417 - 1;
		    int i_1432_ = (((Class89_Sub3) this).aShort9734
				   - ((Class89_Sub3) this).aShort9733);
		    for (int i_1433_ = 0;
			 i_1433_ < ((Class89_Sub3) this).anInt9687;
			 i_1433_++) {
			int i_1434_
			    = (((Class89_Sub3) this).anIntArray9670[i_1433_]
			       + i_1353_);
			int i_1435_
			    = (((Class89_Sub3) this).anIntArray9684[i_1433_]
			       + i_1355_);
			int i_1436_ = i_1434_ & i_1431_;
			int i_1437_ = i_1435_ & i_1431_;
			int i_1438_
			    = i_1434_ >> class166.anInt2054 * -122333825;
			int i_1439_
			    = i_1435_ >> class166.anInt2054 * -122333825;
			int i_1440_
			    = (((is[i_1438_][i_1439_]
				 * (class166.anInt2053 * 2039042417 - i_1436_))
				+ is[i_1438_ + 1][i_1439_] * i_1436_)
			       >> class166.anInt2054 * -122333825);
			int i_1441_
			    = (((is[i_1438_][i_1439_ + 1]
				 * (class166.anInt2053 * 2039042417 - i_1436_))
				+ is[i_1438_ + 1][i_1439_ + 1] * i_1436_)
			       >> class166.anInt2054 * -122333825);
			int i_1442_
			    = (i_1440_ * (class166.anInt2053 * 2039042417
					  - i_1437_) + i_1441_ * i_1437_
			       >> class166.anInt2054 * -122333825);
			i_1440_ = (((is_1360_[i_1438_][i_1439_]
				     * (class166_1352_.anInt2053 * 2039042417
					- i_1436_))
				    + is_1360_[i_1438_ + 1][i_1439_] * i_1436_)
				   >> class166_1352_.anInt2054 * -122333825);
			i_1441_
			    = (((is_1360_[i_1438_][i_1439_ + 1]
				 * (class166_1352_.anInt2053 * 2039042417
				    - i_1436_))
				+ is_1360_[i_1438_ + 1][i_1439_ + 1] * i_1436_)
			       >> class166_1352_.anInt2054 * -122333825);
			int i_1443_
			    = (i_1440_ * (class166_1352_.anInt2053 * 2039042417
					  - i_1437_) + i_1441_ * i_1437_
			       >> class166_1352_.anInt2054 * -122333825);
			int i_1444_ = i_1442_ - i_1443_ - i_1351_;
			((Class89_Sub3) this).anIntArray9685[i_1433_]
			    = ((((Class89_Sub3) this).anIntArray9685[i_1433_]
				<< 8) / i_1432_ * i_1444_
			       >> 8) - (i_1354_ - i_1442_);
		    }
		    for (int i_1445_ = ((Class89_Sub3) this).anInt9687;
			 i_1445_ < ((Class89_Sub3) this).anInt9686;
			 i_1445_++) {
			int i_1446_
			    = (((Class89_Sub3) this).anIntArray9670[i_1445_]
			       + i_1353_);
			int i_1447_
			    = (((Class89_Sub3) this).anIntArray9684[i_1445_]
			       + i_1355_);
			int i_1448_ = i_1446_ & i_1431_;
			int i_1449_ = i_1447_ & i_1431_;
			int i_1450_
			    = i_1446_ >> class166.anInt2054 * -122333825;
			int i_1451_
			    = i_1447_ >> class166.anInt2054 * -122333825;
			if (i_1450_ >= 0
			    && i_1450_ < class166.anInt2055 * 266270313 - 1
			    && (i_1450_
				< class166_1352_.anInt2055 * 266270313 - 1)
			    && i_1451_ >= 0
			    && i_1451_ < class166.anInt2052 * -14610189 - 1
			    && (i_1451_
				< class166_1352_.anInt2052 * -14610189 - 1)) {
			    int i_1452_
				= (((is[i_1450_][i_1451_]
				     * (class166.anInt2053 * 2039042417
					- i_1448_))
				    + is[i_1450_ + 1][i_1451_] * i_1448_)
				   >> class166.anInt2054 * -122333825);
			    int i_1453_
				= (((is[i_1450_][i_1451_ + 1]
				     * (class166.anInt2053 * 2039042417
					- i_1448_))
				    + is[i_1450_ + 1][i_1451_ + 1] * i_1448_)
				   >> class166.anInt2054 * -122333825);
			    int i_1454_
				= (i_1452_ * (class166.anInt2053 * 2039042417
					      - i_1449_) + i_1453_ * i_1449_
				   >> class166.anInt2054 * -122333825);
			    i_1452_
				= (((is_1360_[i_1450_][i_1451_]
				     * (class166_1352_.anInt2053 * 2039042417
					- i_1448_))
				    + is_1360_[i_1450_ + 1][i_1451_] * i_1448_)
				   >> class166_1352_.anInt2054 * -122333825);
			    i_1453_
				= (((is_1360_[i_1450_][i_1451_ + 1]
				     * (class166_1352_.anInt2053 * 2039042417
					- i_1448_))
				    + (is_1360_[i_1450_ + 1][i_1451_ + 1]
				       * i_1448_))
				   >> class166_1352_.anInt2054 * -122333825);
			    int i_1455_
				= ((i_1452_
				    * (class166_1352_.anInt2053 * 2039042417
				       - i_1449_)) + i_1453_ * i_1449_
				   >> class166_1352_.anInt2054 * -122333825);
			    int i_1456_ = i_1454_ - i_1455_ - i_1351_;
			    ((Class89_Sub3) this).anIntArray9685[i_1445_]
				= (((((Class89_Sub3) this).anIntArray9685
				     [i_1445_])
				    << 8) / i_1432_ * i_1456_
				   >> 8) - (i_1354_ - i_1454_);
			}
		    }
		}
		((Class89_Sub3) this).aBool9730 = false;
	    }
	}
    }
    
    void method16114() {
	((Class89_Sub3) this).aClass204Array9692 = null;
	((Class89_Sub3) this).aClass204Array9744 = null;
	((Class89_Sub3) this).aClass188Array9708 = null;
	((Class89_Sub3) this).aBool9730 = false;
    }
    
    public Class106[] method2051() {
	return ((Class89_Sub3) this).aClass106Array9724;
    }
    
    void method1951() {
	if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
	     .anInt9274) * 592623211
	    > 1) {
	    synchronized (this) {
		while (aBool1298) {
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		aBool1298 = true;
	    }
	}
    }
    
    public void method1890(Class266 class266, Class97 class97, int i) {
	method16067(class266, class97, i);
    }
    
    void method16115(Thread thread) {
	Class189 class189
	    = ((Class89_Sub3) this).aClass103_Sub2_9690.method15377(thread);
	if (class189 != ((Class89_Sub3) this).aClass189_9673) {
	    ((Class89_Sub3) this).aClass189_9673 = class189;
	    ((Class89_Sub3) this).aClass89_Sub3Array9755
		= (((Class189) ((Class89_Sub3) this).aClass189_9673)
		   .aClass89_Sub3Array2253);
	    ((Class89_Sub3) this).aClass89_Sub3Array9742
		= (((Class189) ((Class89_Sub3) this).aClass189_9673)
		   .aClass89_Sub3Array2248);
	}
    }
    
    boolean method1954() {
	if (((Class89_Sub3) this).anIntArrayArray9716 == null)
	    return false;
	((Class89_Sub3) this).anInt9717 = 0;
	((Class89_Sub3) this).anInt9721 = 0;
	((Class89_Sub3) this).anInt9722 = 0;
	return true;
    }
    
    void method2032() {
	if (((Class89_Sub3) this).aBool9719) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9686; i++) {
		((Class89_Sub3) this).anIntArray9670[i]
		    = ((Class89_Sub3) this).anIntArray9670[i] + 7 >> 4;
		((Class89_Sub3) this).anIntArray9685[i]
		    = ((Class89_Sub3) this).anIntArray9685[i] + 7 >> 4;
		((Class89_Sub3) this).anIntArray9684[i]
		    = ((Class89_Sub3) this).anIntArray9684[i] + 7 >> 4;
	    }
	    ((Class89_Sub3) this).aBool9719 = false;
	}
	if (((Class89_Sub3) this).aBool9718) {
	    method16055();
	    ((Class89_Sub3) this).aBool9718 = false;
	}
	((Class89_Sub3) this).aBool9730 = false;
    }
    
    void method2009() {
	if (((Class89_Sub3) this).aBool9719) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9686; i++) {
		((Class89_Sub3) this).anIntArray9670[i]
		    = ((Class89_Sub3) this).anIntArray9670[i] + 7 >> 4;
		((Class89_Sub3) this).anIntArray9685[i]
		    = ((Class89_Sub3) this).anIntArray9685[i] + 7 >> 4;
		((Class89_Sub3) this).anIntArray9684[i]
		    = ((Class89_Sub3) this).anIntArray9684[i] + 7 >> 4;
	    }
	    ((Class89_Sub3) this).aBool9719 = false;
	}
	if (((Class89_Sub3) this).aBool9718) {
	    method16055();
	    ((Class89_Sub3) this).aBool9718 = false;
	}
	((Class89_Sub3) this).aBool9730 = false;
    }
    
    void method1957() {
	if (((Class89_Sub3) this).aBool9719) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9686; i++) {
		((Class89_Sub3) this).anIntArray9670[i]
		    = ((Class89_Sub3) this).anIntArray9670[i] + 7 >> 4;
		((Class89_Sub3) this).anIntArray9685[i]
		    = ((Class89_Sub3) this).anIntArray9685[i] + 7 >> 4;
		((Class89_Sub3) this).anIntArray9684[i]
		    = ((Class89_Sub3) this).anIntArray9684[i] + 7 >> 4;
	    }
	    ((Class89_Sub3) this).aBool9719 = false;
	}
	if (((Class89_Sub3) this).aBool9718) {
	    method16055();
	    ((Class89_Sub3) this).aBool9718 = false;
	}
	((Class89_Sub3) this).aBool9730 = false;
    }
    
    void method1958() {
	if (((Class89_Sub3) this).aBool9719) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9686; i++) {
		((Class89_Sub3) this).anIntArray9670[i]
		    = ((Class89_Sub3) this).anIntArray9670[i] + 7 >> 4;
		((Class89_Sub3) this).anIntArray9685[i]
		    = ((Class89_Sub3) this).anIntArray9685[i] + 7 >> 4;
		((Class89_Sub3) this).anIntArray9684[i]
		    = ((Class89_Sub3) this).anIntArray9684[i] + 7 >> 4;
	    }
	    ((Class89_Sub3) this).aBool9719 = false;
	}
	if (((Class89_Sub3) this).aBool9718) {
	    method16055();
	    ((Class89_Sub3) this).aBool9718 = false;
	}
	((Class89_Sub3) this).aBool9730 = false;
    }
    
    void method16116() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9687; i++) {
		((Class89_Sub3) this).anIntArray9670[i]
		    = -((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = -((Class89_Sub3) this).anIntArray9684[i];
		if (((Class89_Sub3) this).aClass204Array9692[i] != null) {
		    ((Class204) ((Class89_Sub3) this).aClass204Array9692[i])
			.anInt2429
			= -((Class204) (((Class89_Sub3) this)
					.aClass204Array9692[i])).anInt2429;
		    ((Class204) ((Class89_Sub3) this).aClass204Array9692[i])
			.anInt2428
			= -((Class204) (((Class89_Sub3) this)
					.aClass204Array9692[i])).anInt2428;
		}
	    }
	    if (((Class89_Sub3) this).aClass188Array9708 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9691; i++) {
		    if (((Class89_Sub3) this).aClass188Array9708[i] != null) {
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2206
			    = -((Class188) (((Class89_Sub3) this)
					    .aClass188Array9708[i])).anInt2206;
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2208
			    = -((Class188) (((Class89_Sub3) this)
					    .aClass188Array9708[i])).anInt2208;
		    }
		}
	    }
	    for (int i = ((Class89_Sub3) this).anInt9687;
		 i < ((Class89_Sub3) this).anInt9686; i++) {
		((Class89_Sub3) this).anIntArray9670[i]
		    = -((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = -((Class89_Sub3) this).anIntArray9684[i];
	    }
	    ((Class89_Sub3) this).anInt9741 = 0;
	    ((Class89_Sub3) this).aBool9730 = false;
	}
    }
    
    void method1916(int i, int[] is, int i_1457_, int i_1458_, int i_1459_,
		    int i_1460_, boolean bool) {
	int i_1461_ = is.length;
	if (i == 0) {
	    i_1457_ <<= 4;
	    i_1458_ <<= 4;
	    i_1459_ <<= 4;
	    if (!((Class89_Sub3) this).aBool9719) {
		for (int i_1462_ = 0;
		     i_1462_ < ((Class89_Sub3) this).anInt9686; i_1462_++) {
		    ((Class89_Sub3) this).anIntArray9670[i_1462_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9685[i_1462_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9684[i_1462_] <<= 4;
		}
		((Class89_Sub3) this).aBool9719 = true;
	    }
	    int i_1463_ = 0;
	    ((Class89_Sub3) this).anInt9717 = 0;
	    ((Class89_Sub3) this).anInt9721 = 0;
	    ((Class89_Sub3) this).anInt9722 = 0;
	    for (int i_1464_ = 0; i_1464_ < i_1461_; i_1464_++) {
		int i_1465_ = is[i_1464_];
		if (i_1465_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_1466_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_1465_];
		    for (int i_1467_ = 0; i_1467_ < is_1466_.length;
			 i_1467_++) {
			int i_1468_ = is_1466_[i_1467_];
			((Class89_Sub3) this).anInt9717
			    += ((Class89_Sub3) this).anIntArray9670[i_1468_];
			((Class89_Sub3) this).anInt9721
			    += ((Class89_Sub3) this).anIntArray9685[i_1468_];
			((Class89_Sub3) this).anInt9722
			    += ((Class89_Sub3) this).anIntArray9684[i_1468_];
			i_1463_++;
		    }
		}
	    }
	    if (i_1463_ > 0) {
		((Class89_Sub3) this).anInt9717
		    = ((Class89_Sub3) this).anInt9717 / i_1463_ + i_1457_;
		((Class89_Sub3) this).anInt9721
		    = ((Class89_Sub3) this).anInt9721 / i_1463_ + i_1458_;
		((Class89_Sub3) this).anInt9722
		    = ((Class89_Sub3) this).anInt9722 / i_1463_ + i_1459_;
	    } else {
		((Class89_Sub3) this).anInt9717 = i_1457_;
		((Class89_Sub3) this).anInt9721 = i_1458_;
		((Class89_Sub3) this).anInt9722 = i_1459_;
	    }
	} else if (i == 1) {
	    i_1457_ <<= 4;
	    i_1458_ <<= 4;
	    i_1459_ <<= 4;
	    if (!((Class89_Sub3) this).aBool9719) {
		for (int i_1469_ = 0;
		     i_1469_ < ((Class89_Sub3) this).anInt9686; i_1469_++) {
		    ((Class89_Sub3) this).anIntArray9670[i_1469_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9685[i_1469_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9684[i_1469_] <<= 4;
		}
		((Class89_Sub3) this).aBool9719 = true;
	    }
	    for (int i_1470_ = 0; i_1470_ < i_1461_; i_1470_++) {
		int i_1471_ = is[i_1470_];
		if (i_1471_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_1472_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_1471_];
		    for (int i_1473_ = 0; i_1473_ < is_1472_.length;
			 i_1473_++) {
			int i_1474_ = is_1472_[i_1473_];
			((Class89_Sub3) this).anIntArray9670[i_1474_]
			    += i_1457_;
			((Class89_Sub3) this).anIntArray9685[i_1474_]
			    += i_1458_;
			((Class89_Sub3) this).anIntArray9684[i_1474_]
			    += i_1459_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_1475_ = 0; i_1475_ < i_1461_; i_1475_++) {
		int i_1476_ = is[i_1475_];
		if (i_1476_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_1477_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_1476_];
		    if ((i_1460_ & 0x1) == 0) {
			for (int i_1478_ = 0; i_1478_ < is_1477_.length;
			     i_1478_++) {
			    int i_1479_ = is_1477_[i_1478_];
			    ((Class89_Sub3) this).anIntArray9670[i_1479_]
				-= ((Class89_Sub3) this).anInt9717;
			    ((Class89_Sub3) this).anIntArray9685[i_1479_]
				-= ((Class89_Sub3) this).anInt9721;
			    ((Class89_Sub3) this).anIntArray9684[i_1479_]
				-= ((Class89_Sub3) this).anInt9722;
			    if (i_1459_ != 0) {
				int i_1480_ = Class282.anIntArray4430[i_1459_];
				int i_1481_ = Class282.anIntArray4441[i_1459_];
				int i_1482_
				    = (((((Class89_Sub3) this).anIntArray9685
					 [i_1479_]) * i_1480_
					+ (((Class89_Sub3) this).anIntArray9670
					   [i_1479_]) * i_1481_
					+ 16383)
				       >> 14);
				((Class89_Sub3) this).anIntArray9685[i_1479_]
				    = ((((Class89_Sub3) this).anIntArray9685
					[i_1479_]) * i_1481_
				       - (((Class89_Sub3) this).anIntArray9670
					  [i_1479_]) * i_1480_
				       + 16383) >> 14;
				((Class89_Sub3) this).anIntArray9670[i_1479_]
				    = i_1482_;
			    }
			    if (i_1457_ != 0) {
				int i_1483_ = Class282.anIntArray4430[i_1457_];
				int i_1484_ = Class282.anIntArray4441[i_1457_];
				int i_1485_
				    = (((((Class89_Sub3) this).anIntArray9685
					 [i_1479_]) * i_1484_
					- (((Class89_Sub3) this).anIntArray9684
					   [i_1479_]) * i_1483_
					+ 16383)
				       >> 14);
				((Class89_Sub3) this).anIntArray9684[i_1479_]
				    = ((((Class89_Sub3) this).anIntArray9685
					[i_1479_]) * i_1483_
				       + (((Class89_Sub3) this).anIntArray9684
					  [i_1479_]) * i_1484_
				       + 16383) >> 14;
				((Class89_Sub3) this).anIntArray9685[i_1479_]
				    = i_1485_;
			    }
			    if (i_1458_ != 0) {
				int i_1486_ = Class282.anIntArray4430[i_1458_];
				int i_1487_ = Class282.anIntArray4441[i_1458_];
				int i_1488_
				    = (((((Class89_Sub3) this).anIntArray9684
					 [i_1479_]) * i_1486_
					+ (((Class89_Sub3) this).anIntArray9670
					   [i_1479_]) * i_1487_
					+ 16383)
				       >> 14);
				((Class89_Sub3) this).anIntArray9684[i_1479_]
				    = ((((Class89_Sub3) this).anIntArray9684
					[i_1479_]) * i_1487_
				       - (((Class89_Sub3) this).anIntArray9670
					  [i_1479_]) * i_1486_
				       + 16383) >> 14;
				((Class89_Sub3) this).anIntArray9670[i_1479_]
				    = i_1488_;
			    }
			    ((Class89_Sub3) this).anIntArray9670[i_1479_]
				+= ((Class89_Sub3) this).anInt9717;
			    ((Class89_Sub3) this).anIntArray9685[i_1479_]
				+= ((Class89_Sub3) this).anInt9721;
			    ((Class89_Sub3) this).anIntArray9684[i_1479_]
				+= ((Class89_Sub3) this).anInt9722;
			}
		    } else {
			for (int i_1489_ = 0; i_1489_ < is_1477_.length;
			     i_1489_++) {
			    int i_1490_ = is_1477_[i_1489_];
			    ((Class89_Sub3) this).anIntArray9670[i_1490_]
				-= ((Class89_Sub3) this).anInt9717;
			    ((Class89_Sub3) this).anIntArray9685[i_1490_]
				-= ((Class89_Sub3) this).anInt9721;
			    ((Class89_Sub3) this).anIntArray9684[i_1490_]
				-= ((Class89_Sub3) this).anInt9722;
			    if (i_1457_ != 0) {
				int i_1491_ = Class282.anIntArray4430[i_1457_];
				int i_1492_ = Class282.anIntArray4441[i_1457_];
				int i_1493_
				    = (((((Class89_Sub3) this).anIntArray9685
					 [i_1490_]) * i_1492_
					- (((Class89_Sub3) this).anIntArray9684
					   [i_1490_]) * i_1491_
					+ 16383)
				       >> 14);
				((Class89_Sub3) this).anIntArray9684[i_1490_]
				    = ((((Class89_Sub3) this).anIntArray9685
					[i_1490_]) * i_1491_
				       + (((Class89_Sub3) this).anIntArray9684
					  [i_1490_]) * i_1492_
				       + 16383) >> 14;
				((Class89_Sub3) this).anIntArray9685[i_1490_]
				    = i_1493_;
			    }
			    if (i_1459_ != 0) {
				int i_1494_ = Class282.anIntArray4430[i_1459_];
				int i_1495_ = Class282.anIntArray4441[i_1459_];
				int i_1496_
				    = (((((Class89_Sub3) this).anIntArray9685
					 [i_1490_]) * i_1494_
					+ (((Class89_Sub3) this).anIntArray9670
					   [i_1490_]) * i_1495_
					+ 16383)
				       >> 14);
				((Class89_Sub3) this).anIntArray9685[i_1490_]
				    = ((((Class89_Sub3) this).anIntArray9685
					[i_1490_]) * i_1495_
				       - (((Class89_Sub3) this).anIntArray9670
					  [i_1490_]) * i_1494_
				       + 16383) >> 14;
				((Class89_Sub3) this).anIntArray9670[i_1490_]
				    = i_1496_;
			    }
			    if (i_1458_ != 0) {
				int i_1497_ = Class282.anIntArray4430[i_1458_];
				int i_1498_ = Class282.anIntArray4441[i_1458_];
				int i_1499_
				    = (((((Class89_Sub3) this).anIntArray9684
					 [i_1490_]) * i_1497_
					+ (((Class89_Sub3) this).anIntArray9670
					   [i_1490_]) * i_1498_
					+ 16383)
				       >> 14);
				((Class89_Sub3) this).anIntArray9684[i_1490_]
				    = ((((Class89_Sub3) this).anIntArray9684
					[i_1490_]) * i_1498_
				       - (((Class89_Sub3) this).anIntArray9670
					  [i_1490_]) * i_1497_
				       + 16383) >> 14;
				((Class89_Sub3) this).anIntArray9670[i_1490_]
				    = i_1499_;
			    }
			    ((Class89_Sub3) this).anIntArray9670[i_1490_]
				+= ((Class89_Sub3) this).anInt9717;
			    ((Class89_Sub3) this).anIntArray9685[i_1490_]
				+= ((Class89_Sub3) this).anInt9721;
			    ((Class89_Sub3) this).anIntArray9684[i_1490_]
				+= ((Class89_Sub3) this).anInt9722;
			}
		    }
		}
	    }
	} else if (i == 3) {
	    for (int i_1500_ = 0; i_1500_ < i_1461_; i_1500_++) {
		int i_1501_ = is[i_1500_];
		if (i_1501_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_1502_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_1501_];
		    for (int i_1503_ = 0; i_1503_ < is_1502_.length;
			 i_1503_++) {
			int i_1504_ = is_1502_[i_1503_];
			((Class89_Sub3) this).anIntArray9670[i_1504_]
			    -= ((Class89_Sub3) this).anInt9717;
			((Class89_Sub3) this).anIntArray9685[i_1504_]
			    -= ((Class89_Sub3) this).anInt9721;
			((Class89_Sub3) this).anIntArray9684[i_1504_]
			    -= ((Class89_Sub3) this).anInt9722;
			((Class89_Sub3) this).anIntArray9670[i_1504_]
			    = (((Class89_Sub3) this).anIntArray9670[i_1504_]
			       * i_1457_ / 128);
			((Class89_Sub3) this).anIntArray9685[i_1504_]
			    = (((Class89_Sub3) this).anIntArray9685[i_1504_]
			       * i_1458_ / 128);
			((Class89_Sub3) this).anIntArray9684[i_1504_]
			    = (((Class89_Sub3) this).anIntArray9684[i_1504_]
			       * i_1459_ / 128);
			((Class89_Sub3) this).anIntArray9670[i_1504_]
			    += ((Class89_Sub3) this).anInt9717;
			((Class89_Sub3) this).anIntArray9685[i_1504_]
			    += ((Class89_Sub3) this).anInt9721;
			((Class89_Sub3) this).anIntArray9684[i_1504_]
			    += ((Class89_Sub3) this).anInt9722;
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub3) this).anIntArrayArray9678 != null
		&& ((Class89_Sub3) this).aByteArray9711 != null) {
		for (int i_1505_ = 0; i_1505_ < i_1461_; i_1505_++) {
		    int i_1506_ = is[i_1505_];
		    if (i_1506_
			< ((Class89_Sub3) this).anIntArrayArray9678.length) {
			int[] is_1507_ = (((Class89_Sub3) this)
					  .anIntArrayArray9678[i_1506_]);
			for (int i_1508_ = 0; i_1508_ < is_1507_.length;
			     i_1508_++) {
			    int i_1509_ = is_1507_[i_1508_];
			    int i_1510_ = (((((Class89_Sub3) this)
					     .aByteArray9711[i_1509_])
					    & 0xff)
					   + i_1457_ * 8);
			    if (i_1510_ < 0)
				i_1510_ = 0;
			    else if (i_1510_ > 255)
				i_1510_ = 255;
			    ((Class89_Sub3) this).aByteArray9711[i_1509_]
				= (byte) i_1510_;
			}
		    }
		}
		if (((Class89_Sub3) this).aClass187Array9727 != null) {
		    for (int i_1511_ = 0;
			 i_1511_ < ((Class89_Sub3) this).anInt9726;
			 i_1511_++) {
			Class187 class187 = (((Class89_Sub3) this)
					     .aClass187Array9727[i_1511_]);
			Class203 class203 = (((Class89_Sub3) this)
					     .aClass203Array9728[i_1511_]);
			((Class203) class203).anInt2417
			    = ((((Class203) class203).anInt2417 * -1473589757
				& 0xffffff)
			       | 255 - ((((Class89_Sub3) this).aByteArray9711
					 [(((Class187) class187).anInt2195
					   * 1571719645)])
					& 0xff) << 24) * 376097963;
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub3) this).anIntArrayArray9678 != null) {
		for (int i_1512_ = 0; i_1512_ < i_1461_; i_1512_++) {
		    int i_1513_ = is[i_1512_];
		    if (i_1513_
			< ((Class89_Sub3) this).anIntArrayArray9678.length) {
			int[] is_1514_ = (((Class89_Sub3) this)
					  .anIntArrayArray9678[i_1513_]);
			for (int i_1515_ = 0; i_1515_ < is_1514_.length;
			     i_1515_++) {
			    int i_1516_ = is_1514_[i_1515_];
			    int i_1517_ = ((((Class89_Sub3) this)
					    .aShortArray9713[i_1516_])
					   & 0xffff);
			    int i_1518_ = i_1517_ >> 10 & 0x3f;
			    int i_1519_ = i_1517_ >> 7 & 0x7;
			    int i_1520_ = i_1517_ & 0x7f;
			    i_1518_ = i_1518_ + i_1457_ & 0x3f;
			    i_1519_ += i_1458_;
			    if (i_1519_ < 0)
				i_1519_ = 0;
			    else if (i_1519_ > 7)
				i_1519_ = 7;
			    i_1520_ += i_1459_;
			    if (i_1520_ < 0)
				i_1520_ = 0;
			    else if (i_1520_ > 127)
				i_1520_ = 127;
			    ((Class89_Sub3) this).aShortArray9713[i_1516_]
				= (short) (i_1518_ << 10 | i_1519_ << 7
					   | i_1520_);
			}
			((Class89_Sub3) this).aBool9718 = true;
		    }
		}
		if (((Class89_Sub3) this).aClass187Array9727 != null) {
		    for (int i_1521_ = 0;
			 i_1521_ < ((Class89_Sub3) this).anInt9726;
			 i_1521_++) {
			Class187 class187 = (((Class89_Sub3) this)
					     .aClass187Array9727[i_1521_]);
			Class203 class203 = (((Class89_Sub3) this)
					     .aClass203Array9728[i_1521_]);
			((Class203) class203).anInt2417
			    = (((((Class203) class203).anInt2417 * -1473589757
				 & ~0xffffff)
				| (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     ((((Class89_Sub3) this).aShortArray9713
				       [(((Class187) class187).anInt2195
					 * 1571719645)]) & 0xffff,
				      -1741870569)) & 0xffff]) & 0xffffff)
			       * 376097963);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_1522_ = 0; i_1522_ < i_1461_; i_1522_++) {
		    int i_1523_ = is[i_1522_];
		    if (i_1523_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_1524_ = (((Class89_Sub3) this)
					  .anIntArrayArray9672[i_1523_]);
			for (int i_1525_ = 0; i_1525_ < is_1524_.length;
			     i_1525_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_1524_[i_1525_]]);
			    ((Class203) class203).anInt2423
				+= i_1457_ * -378944915;
			    ((Class203) class203).anInt2418
				+= i_1458_ * 830599387;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_1526_ = 0; i_1526_ < i_1461_; i_1526_++) {
		    int i_1527_ = is[i_1526_];
		    if (i_1527_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_1528_ = (((Class89_Sub3) this)
					  .anIntArrayArray9672[i_1527_]);
			for (int i_1529_ = 0; i_1529_ < is_1528_.length;
			     i_1529_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_1528_[i_1529_]]);
			    ((Class203) class203).aFloat2415
				= (((Class203) class203).aFloat2415
				   * (float) i_1457_ / 128.0F);
			    ((Class203) class203).aFloat2416
				= (((Class203) class203).aFloat2416
				   * (float) i_1458_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_1530_ = 0; i_1530_ < i_1461_; i_1530_++) {
		    int i_1531_ = is[i_1530_];
		    if (i_1531_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_1532_ = (((Class89_Sub3) this)
					  .anIntArrayArray9672[i_1531_]);
			for (int i_1533_ = 0; i_1533_ < is_1532_.length;
			     i_1533_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_1532_[i_1533_]]);
			    ((Class203) class203).anInt2424
				= ((((Class203) class203).anInt2424 * 360392329
				    + i_1457_)
				   & 0x3fff) * 318648249;
			}
		    }
		}
	    }
	}
    }
    
    void method1955(int i, int[] is, int i_1534_, int i_1535_, int i_1536_,
		    boolean bool, int i_1537_, int[] is_1538_) {
	int i_1539_ = is.length;
	if (i == 0) {
	    i_1534_ <<= 4;
	    i_1535_ <<= 4;
	    i_1536_ <<= 4;
	    if (!((Class89_Sub3) this).aBool9719) {
		for (int i_1540_ = 0;
		     i_1540_ < ((Class89_Sub3) this).anInt9686; i_1540_++) {
		    ((Class89_Sub3) this).anIntArray9670[i_1540_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9685[i_1540_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9684[i_1540_] <<= 4;
		}
		((Class89_Sub3) this).aBool9719 = true;
	    }
	    int i_1541_ = 0;
	    ((Class89_Sub3) this).anInt9717 = 0;
	    ((Class89_Sub3) this).anInt9721 = 0;
	    ((Class89_Sub3) this).anInt9722 = 0;
	    for (int i_1542_ = 0; i_1542_ < i_1539_; i_1542_++) {
		int i_1543_ = is[i_1542_];
		if (i_1543_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_1544_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_1543_];
		    for (int i_1545_ = 0; i_1545_ < is_1544_.length;
			 i_1545_++) {
			int i_1546_ = is_1544_[i_1545_];
			if (((Class89_Sub3) this).aShortArray9679 == null
			    || (i_1537_ & (((Class89_Sub3) this)
					   .aShortArray9679[i_1546_])) != 0) {
			    ((Class89_Sub3) this).anInt9717
				+= (((Class89_Sub3) this).anIntArray9670
				    [i_1546_]);
			    ((Class89_Sub3) this).anInt9721
				+= (((Class89_Sub3) this).anIntArray9685
				    [i_1546_]);
			    ((Class89_Sub3) this).anInt9722
				+= (((Class89_Sub3) this).anIntArray9684
				    [i_1546_]);
			    i_1541_++;
			}
		    }
		}
	    }
	    if (i_1541_ > 0) {
		((Class89_Sub3) this).anInt9717
		    = ((Class89_Sub3) this).anInt9717 / i_1541_ + i_1534_;
		((Class89_Sub3) this).anInt9721
		    = ((Class89_Sub3) this).anInt9721 / i_1541_ + i_1535_;
		((Class89_Sub3) this).anInt9722
		    = ((Class89_Sub3) this).anInt9722 / i_1541_ + i_1536_;
		((Class89_Sub3) this).aBool9723 = true;
	    } else {
		((Class89_Sub3) this).anInt9717 = i_1534_;
		((Class89_Sub3) this).anInt9721 = i_1535_;
		((Class89_Sub3) this).anInt9722 = i_1536_;
	    }
	} else if (i == 1) {
	    if (is_1538_ != null) {
		int i_1547_ = ((is_1538_[0] * i_1534_ + is_1538_[1] * i_1535_
				+ is_1538_[2] * i_1536_ + 8192)
			       >> 14);
		int i_1548_ = ((is_1538_[3] * i_1534_ + is_1538_[4] * i_1535_
				+ is_1538_[5] * i_1536_ + 8192)
			       >> 14);
		int i_1549_ = ((is_1538_[6] * i_1534_ + is_1538_[7] * i_1535_
				+ is_1538_[8] * i_1536_ + 8192)
			       >> 14);
		i_1534_ = i_1547_;
		i_1535_ = i_1548_;
		i_1536_ = i_1549_;
	    }
	    i_1534_ <<= 4;
	    i_1535_ <<= 4;
	    i_1536_ <<= 4;
	    if (!((Class89_Sub3) this).aBool9719) {
		for (int i_1550_ = 0;
		     i_1550_ < ((Class89_Sub3) this).anInt9686; i_1550_++) {
		    ((Class89_Sub3) this).anIntArray9670[i_1550_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9685[i_1550_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9684[i_1550_] <<= 4;
		}
		((Class89_Sub3) this).aBool9719 = true;
	    }
	    for (int i_1551_ = 0; i_1551_ < i_1539_; i_1551_++) {
		int i_1552_ = is[i_1551_];
		if (i_1552_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_1553_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_1552_];
		    for (int i_1554_ = 0; i_1554_ < is_1553_.length;
			 i_1554_++) {
			int i_1555_ = is_1553_[i_1554_];
			if (((Class89_Sub3) this).aShortArray9679 == null
			    || (i_1537_ & (((Class89_Sub3) this)
					   .aShortArray9679[i_1555_])) != 0) {
			    ((Class89_Sub3) this).anIntArray9670[i_1555_]
				+= i_1534_;
			    ((Class89_Sub3) this).anIntArray9685[i_1555_]
				+= i_1535_;
			    ((Class89_Sub3) this).anIntArray9684[i_1555_]
				+= i_1536_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1538_ != null) {
		if (!((Class89_Sub3) this).aBool9719) {
		    for (int i_1556_ = 0;
			 i_1556_ < ((Class89_Sub3) this).anInt9686;
			 i_1556_++) {
			((Class89_Sub3) this).anIntArray9670[i_1556_] <<= 4;
			((Class89_Sub3) this).anIntArray9685[i_1556_] <<= 4;
			((Class89_Sub3) this).anIntArray9684[i_1556_] <<= 4;
		    }
		    ((Class89_Sub3) this).aBool9719 = true;
		}
		int i_1557_ = is_1538_[9] << 4;
		int i_1558_ = is_1538_[10] << 4;
		int i_1559_ = is_1538_[11] << 4;
		int i_1560_ = is_1538_[12] << 4;
		int i_1561_ = is_1538_[13] << 4;
		int i_1562_ = is_1538_[14] << 4;
		if (((Class89_Sub3) this).aBool9723) {
		    int i_1563_
			= ((is_1538_[0] * ((Class89_Sub3) this).anInt9717
			    + is_1538_[3] * ((Class89_Sub3) this).anInt9721
			    + is_1538_[6] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    int i_1564_
			= ((is_1538_[1] * ((Class89_Sub3) this).anInt9717
			    + is_1538_[4] * ((Class89_Sub3) this).anInt9721
			    + is_1538_[7] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    int i_1565_
			= ((is_1538_[2] * ((Class89_Sub3) this).anInt9717
			    + is_1538_[5] * ((Class89_Sub3) this).anInt9721
			    + is_1538_[8] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    i_1563_ += i_1560_;
		    i_1564_ += i_1561_;
		    i_1565_ += i_1562_;
		    ((Class89_Sub3) this).anInt9717 = i_1563_;
		    ((Class89_Sub3) this).anInt9721 = i_1564_;
		    ((Class89_Sub3) this).anInt9722 = i_1565_;
		    ((Class89_Sub3) this).aBool9723 = false;
		}
		int[] is_1566_ = new int[9];
		int i_1567_ = Class282.anIntArray4441[i_1534_];
		int i_1568_ = Class282.anIntArray4430[i_1534_];
		int i_1569_ = Class282.anIntArray4441[i_1535_];
		int i_1570_ = Class282.anIntArray4430[i_1535_];
		int i_1571_ = Class282.anIntArray4441[i_1536_];
		int i_1572_ = Class282.anIntArray4430[i_1536_];
		int i_1573_ = i_1568_ * i_1571_ + 8192 >> 14;
		int i_1574_ = i_1568_ * i_1572_ + 8192 >> 14;
		is_1566_[0]
		    = i_1569_ * i_1571_ + i_1570_ * i_1574_ + 8192 >> 14;
		is_1566_[1]
		    = -i_1569_ * i_1572_ + i_1570_ * i_1573_ + 8192 >> 14;
		is_1566_[2] = i_1570_ * i_1567_ + 8192 >> 14;
		is_1566_[3] = i_1567_ * i_1572_ + 8192 >> 14;
		is_1566_[4] = i_1567_ * i_1571_ + 8192 >> 14;
		is_1566_[5] = -i_1568_;
		is_1566_[6]
		    = -i_1570_ * i_1571_ + i_1569_ * i_1574_ + 8192 >> 14;
		is_1566_[7]
		    = i_1570_ * i_1572_ + i_1569_ * i_1573_ + 8192 >> 14;
		is_1566_[8] = i_1569_ * i_1567_ + 8192 >> 14;
		int i_1575_ = (is_1566_[0] * -((Class89_Sub3) this).anInt9717
			       + is_1566_[1] * -((Class89_Sub3) this).anInt9721
			       + is_1566_[2] * -((Class89_Sub3) this).anInt9722
			       + 8192) >> 14;
		int i_1576_ = (is_1566_[3] * -((Class89_Sub3) this).anInt9717
			       + is_1566_[4] * -((Class89_Sub3) this).anInt9721
			       + is_1566_[5] * -((Class89_Sub3) this).anInt9722
			       + 8192) >> 14;
		int i_1577_ = (is_1566_[6] * -((Class89_Sub3) this).anInt9717
			       + is_1566_[7] * -((Class89_Sub3) this).anInt9721
			       + is_1566_[8] * -((Class89_Sub3) this).anInt9722
			       + 8192) >> 14;
		int i_1578_ = i_1575_ + ((Class89_Sub3) this).anInt9717;
		int i_1579_ = i_1576_ + ((Class89_Sub3) this).anInt9721;
		int i_1580_ = i_1577_ + ((Class89_Sub3) this).anInt9722;
		int[] is_1581_ = new int[9];
		for (int i_1582_ = 0; i_1582_ < 3; i_1582_++) {
		    for (int i_1583_ = 0; i_1583_ < 3; i_1583_++) {
			int i_1584_ = 0;
			for (int i_1585_ = 0; i_1585_ < 3; i_1585_++)
			    i_1584_ += (is_1566_[i_1582_ * 3 + i_1585_]
					* is_1538_[i_1583_ * 3 + i_1585_]);
			is_1581_[i_1582_ * 3 + i_1583_] = i_1584_ + 8192 >> 14;
		    }
		}
		int i_1586_ = ((is_1566_[0] * i_1560_ + is_1566_[1] * i_1561_
				+ is_1566_[2] * i_1562_ + 8192)
			       >> 14);
		int i_1587_ = ((is_1566_[3] * i_1560_ + is_1566_[4] * i_1561_
				+ is_1566_[5] * i_1562_ + 8192)
			       >> 14);
		int i_1588_ = ((is_1566_[6] * i_1560_ + is_1566_[7] * i_1561_
				+ is_1566_[8] * i_1562_ + 8192)
			       >> 14);
		i_1586_ += i_1578_;
		i_1587_ += i_1579_;
		i_1588_ += i_1580_;
		int[] is_1589_ = new int[9];
		for (int i_1590_ = 0; i_1590_ < 3; i_1590_++) {
		    for (int i_1591_ = 0; i_1591_ < 3; i_1591_++) {
			int i_1592_ = 0;
			for (int i_1593_ = 0; i_1593_ < 3; i_1593_++)
			    i_1592_ += (is_1538_[i_1590_ * 3 + i_1593_]
					* is_1581_[i_1591_ + i_1593_ * 3]);
			is_1589_[i_1590_ * 3 + i_1591_] = i_1592_ + 8192 >> 14;
		    }
		}
		int i_1594_ = ((is_1538_[0] * i_1586_ + is_1538_[1] * i_1587_
				+ is_1538_[2] * i_1588_ + 8192)
			       >> 14);
		int i_1595_ = ((is_1538_[3] * i_1586_ + is_1538_[4] * i_1587_
				+ is_1538_[5] * i_1588_ + 8192)
			       >> 14);
		int i_1596_ = ((is_1538_[6] * i_1586_ + is_1538_[7] * i_1587_
				+ is_1538_[8] * i_1588_ + 8192)
			       >> 14);
		i_1594_ += i_1557_;
		i_1595_ += i_1558_;
		i_1596_ += i_1559_;
		for (int i_1597_ = 0; i_1597_ < i_1539_; i_1597_++) {
		    int i_1598_ = is[i_1597_];
		    if (i_1598_
			< ((Class89_Sub3) this).anIntArrayArray9716.length) {
			int[] is_1599_ = (((Class89_Sub3) this)
					  .anIntArrayArray9716[i_1598_]);
			for (int i_1600_ = 0; i_1600_ < is_1599_.length;
			     i_1600_++) {
			    int i_1601_ = is_1599_[i_1600_];
			    if (((Class89_Sub3) this).aShortArray9679 == null
				|| ((i_1537_ & (((Class89_Sub3) this)
						.aShortArray9679[i_1601_]))
				    != 0)) {
				int i_1602_
				    = (is_1589_[0] * (((Class89_Sub3) this)
						      .anIntArray9670[i_1601_])
				       + is_1589_[1] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_1601_])
				       + is_1589_[2] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_1601_])
				       + 8192) >> 14;
				int i_1603_
				    = (is_1589_[3] * (((Class89_Sub3) this)
						      .anIntArray9670[i_1601_])
				       + is_1589_[4] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_1601_])
				       + is_1589_[5] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_1601_])
				       + 8192) >> 14;
				int i_1604_
				    = (is_1589_[6] * (((Class89_Sub3) this)
						      .anIntArray9670[i_1601_])
				       + is_1589_[7] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_1601_])
				       + is_1589_[8] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_1601_])
				       + 8192) >> 14;
				i_1602_ += i_1594_;
				i_1603_ += i_1595_;
				i_1604_ += i_1596_;
				((Class89_Sub3) this).anIntArray9670[i_1601_]
				    = i_1602_;
				((Class89_Sub3) this).anIntArray9685[i_1601_]
				    = i_1603_;
				((Class89_Sub3) this).anIntArray9684[i_1601_]
				    = i_1604_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1605_ = 0; i_1605_ < i_1539_; i_1605_++) {
		    int i_1606_ = is[i_1605_];
		    if (i_1606_
			< ((Class89_Sub3) this).anIntArrayArray9716.length) {
			int[] is_1607_ = (((Class89_Sub3) this)
					  .anIntArrayArray9716[i_1606_]);
			for (int i_1608_ = 0; i_1608_ < is_1607_.length;
			     i_1608_++) {
			    int i_1609_ = is_1607_[i_1608_];
			    if (((Class89_Sub3) this).aShortArray9679 == null
				|| ((i_1537_ & (((Class89_Sub3) this)
						.aShortArray9679[i_1609_]))
				    != 0)) {
				((Class89_Sub3) this).anIntArray9670[i_1609_]
				    -= ((Class89_Sub3) this).anInt9717;
				((Class89_Sub3) this).anIntArray9685[i_1609_]
				    -= ((Class89_Sub3) this).anInt9721;
				((Class89_Sub3) this).anIntArray9684[i_1609_]
				    -= ((Class89_Sub3) this).anInt9722;
				if (i_1536_ != 0) {
				    int i_1610_
					= Class282.anIntArray4430[i_1536_];
				    int i_1611_
					= Class282.anIntArray4441[i_1536_];
				    int i_1612_
					= ((((Class89_Sub3) this)
					    .anIntArray9685[i_1609_]) * i_1610_
					   + ((((Class89_Sub3) this)
					       .anIntArray9670[i_1609_])
					      * i_1611_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9685
					[i_1609_]
					= ((((Class89_Sub3) this)
					    .anIntArray9685[i_1609_]) * i_1611_
					   - ((((Class89_Sub3) this)
					       .anIntArray9670[i_1609_])
					      * i_1610_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9670
					[i_1609_]
					= i_1612_;
				}
				if (i_1534_ != 0) {
				    int i_1613_
					= Class282.anIntArray4430[i_1534_];
				    int i_1614_
					= Class282.anIntArray4441[i_1534_];
				    int i_1615_
					= ((((Class89_Sub3) this)
					    .anIntArray9685[i_1609_]) * i_1614_
					   - ((((Class89_Sub3) this)
					       .anIntArray9684[i_1609_])
					      * i_1613_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9684
					[i_1609_]
					= ((((Class89_Sub3) this)
					    .anIntArray9685[i_1609_]) * i_1613_
					   + ((((Class89_Sub3) this)
					       .anIntArray9684[i_1609_])
					      * i_1614_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9685
					[i_1609_]
					= i_1615_;
				}
				if (i_1535_ != 0) {
				    int i_1616_
					= Class282.anIntArray4430[i_1535_];
				    int i_1617_
					= Class282.anIntArray4441[i_1535_];
				    int i_1618_
					= ((((Class89_Sub3) this)
					    .anIntArray9684[i_1609_]) * i_1616_
					   + ((((Class89_Sub3) this)
					       .anIntArray9670[i_1609_])
					      * i_1617_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9684
					[i_1609_]
					= ((((Class89_Sub3) this)
					    .anIntArray9684[i_1609_]) * i_1617_
					   - ((((Class89_Sub3) this)
					       .anIntArray9670[i_1609_])
					      * i_1616_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9670
					[i_1609_]
					= i_1618_;
				}
				((Class89_Sub3) this).anIntArray9670[i_1609_]
				    += ((Class89_Sub3) this).anInt9717;
				((Class89_Sub3) this).anIntArray9685[i_1609_]
				    += ((Class89_Sub3) this).anInt9721;
				((Class89_Sub3) this).anIntArray9684[i_1609_]
				    += ((Class89_Sub3) this).anInt9722;
			    }
			}
		    }
		}
	    }
	} else if (i == 3) {
	    if (is_1538_ != null) {
		if (!((Class89_Sub3) this).aBool9719) {
		    for (int i_1619_ = 0;
			 i_1619_ < ((Class89_Sub3) this).anInt9686;
			 i_1619_++) {
			((Class89_Sub3) this).anIntArray9670[i_1619_] <<= 4;
			((Class89_Sub3) this).anIntArray9685[i_1619_] <<= 4;
			((Class89_Sub3) this).anIntArray9684[i_1619_] <<= 4;
		    }
		    ((Class89_Sub3) this).aBool9719 = true;
		}
		int i_1620_ = is_1538_[9] << 4;
		int i_1621_ = is_1538_[10] << 4;
		int i_1622_ = is_1538_[11] << 4;
		int i_1623_ = is_1538_[12] << 4;
		int i_1624_ = is_1538_[13] << 4;
		int i_1625_ = is_1538_[14] << 4;
		if (((Class89_Sub3) this).aBool9723) {
		    int i_1626_
			= ((is_1538_[0] * ((Class89_Sub3) this).anInt9717
			    + is_1538_[3] * ((Class89_Sub3) this).anInt9721
			    + is_1538_[6] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    int i_1627_
			= ((is_1538_[1] * ((Class89_Sub3) this).anInt9717
			    + is_1538_[4] * ((Class89_Sub3) this).anInt9721
			    + is_1538_[7] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    int i_1628_
			= ((is_1538_[2] * ((Class89_Sub3) this).anInt9717
			    + is_1538_[5] * ((Class89_Sub3) this).anInt9721
			    + is_1538_[8] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    i_1626_ += i_1623_;
		    i_1627_ += i_1624_;
		    i_1628_ += i_1625_;
		    ((Class89_Sub3) this).anInt9717 = i_1626_;
		    ((Class89_Sub3) this).anInt9721 = i_1627_;
		    ((Class89_Sub3) this).anInt9722 = i_1628_;
		    ((Class89_Sub3) this).aBool9723 = false;
		}
		int i_1629_ = i_1534_ << 15 >> 7;
		int i_1630_ = i_1535_ << 15 >> 7;
		int i_1631_ = i_1536_ << 15 >> 7;
		int i_1632_
		    = i_1629_ * -((Class89_Sub3) this).anInt9717 + 8192 >> 14;
		int i_1633_
		    = i_1630_ * -((Class89_Sub3) this).anInt9721 + 8192 >> 14;
		int i_1634_
		    = i_1631_ * -((Class89_Sub3) this).anInt9722 + 8192 >> 14;
		int i_1635_ = i_1632_ + ((Class89_Sub3) this).anInt9717;
		int i_1636_ = i_1633_ + ((Class89_Sub3) this).anInt9721;
		int i_1637_ = i_1634_ + ((Class89_Sub3) this).anInt9722;
		int[] is_1638_ = new int[9];
		is_1638_[0] = i_1629_ * is_1538_[0] + 8192 >> 14;
		is_1638_[1] = i_1629_ * is_1538_[3] + 8192 >> 14;
		is_1638_[2] = i_1629_ * is_1538_[6] + 8192 >> 14;
		is_1638_[3] = i_1630_ * is_1538_[1] + 8192 >> 14;
		is_1638_[4] = i_1630_ * is_1538_[4] + 8192 >> 14;
		is_1638_[5] = i_1630_ * is_1538_[7] + 8192 >> 14;
		is_1638_[6] = i_1631_ * is_1538_[2] + 8192 >> 14;
		is_1638_[7] = i_1631_ * is_1538_[5] + 8192 >> 14;
		is_1638_[8] = i_1631_ * is_1538_[8] + 8192 >> 14;
		int i_1639_ = i_1629_ * i_1623_ + 8192 >> 14;
		int i_1640_ = i_1630_ * i_1624_ + 8192 >> 14;
		int i_1641_ = i_1631_ * i_1625_ + 8192 >> 14;
		i_1639_ += i_1635_;
		i_1640_ += i_1636_;
		i_1641_ += i_1637_;
		int[] is_1642_ = new int[9];
		for (int i_1643_ = 0; i_1643_ < 3; i_1643_++) {
		    for (int i_1644_ = 0; i_1644_ < 3; i_1644_++) {
			int i_1645_ = 0;
			for (int i_1646_ = 0; i_1646_ < 3; i_1646_++)
			    i_1645_ += (is_1538_[i_1643_ * 3 + i_1646_]
					* is_1638_[i_1644_ + i_1646_ * 3]);
			is_1642_[i_1643_ * 3 + i_1644_] = i_1645_ + 8192 >> 14;
		    }
		}
		int i_1647_ = ((is_1538_[0] * i_1639_ + is_1538_[1] * i_1640_
				+ is_1538_[2] * i_1641_ + 8192)
			       >> 14);
		int i_1648_ = ((is_1538_[3] * i_1639_ + is_1538_[4] * i_1640_
				+ is_1538_[5] * i_1641_ + 8192)
			       >> 14);
		int i_1649_ = ((is_1538_[6] * i_1639_ + is_1538_[7] * i_1640_
				+ is_1538_[8] * i_1641_ + 8192)
			       >> 14);
		i_1647_ += i_1620_;
		i_1648_ += i_1621_;
		i_1649_ += i_1622_;
		for (int i_1650_ = 0; i_1650_ < i_1539_; i_1650_++) {
		    int i_1651_ = is[i_1650_];
		    if (i_1651_
			< ((Class89_Sub3) this).anIntArrayArray9716.length) {
			int[] is_1652_ = (((Class89_Sub3) this)
					  .anIntArrayArray9716[i_1651_]);
			for (int i_1653_ = 0; i_1653_ < is_1652_.length;
			     i_1653_++) {
			    int i_1654_ = is_1652_[i_1653_];
			    if (((Class89_Sub3) this).aShortArray9679 == null
				|| ((i_1537_ & (((Class89_Sub3) this)
						.aShortArray9679[i_1654_]))
				    != 0)) {
				int i_1655_
				    = (is_1642_[0] * (((Class89_Sub3) this)
						      .anIntArray9670[i_1654_])
				       + is_1642_[1] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_1654_])
				       + is_1642_[2] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_1654_])
				       + 8192) >> 14;
				int i_1656_
				    = (is_1642_[3] * (((Class89_Sub3) this)
						      .anIntArray9670[i_1654_])
				       + is_1642_[4] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_1654_])
				       + is_1642_[5] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_1654_])
				       + 8192) >> 14;
				int i_1657_
				    = (is_1642_[6] * (((Class89_Sub3) this)
						      .anIntArray9670[i_1654_])
				       + is_1642_[7] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_1654_])
				       + is_1642_[8] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_1654_])
				       + 8192) >> 14;
				i_1655_ += i_1647_;
				i_1656_ += i_1648_;
				i_1657_ += i_1649_;
				((Class89_Sub3) this).anIntArray9670[i_1654_]
				    = i_1655_;
				((Class89_Sub3) this).anIntArray9685[i_1654_]
				    = i_1656_;
				((Class89_Sub3) this).anIntArray9684[i_1654_]
				    = i_1657_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1658_ = 0; i_1658_ < i_1539_; i_1658_++) {
		    int i_1659_ = is[i_1658_];
		    if (i_1659_
			< ((Class89_Sub3) this).anIntArrayArray9716.length) {
			int[] is_1660_ = (((Class89_Sub3) this)
					  .anIntArrayArray9716[i_1659_]);
			for (int i_1661_ = 0; i_1661_ < is_1660_.length;
			     i_1661_++) {
			    int i_1662_ = is_1660_[i_1661_];
			    if (((Class89_Sub3) this).aShortArray9679 == null
				|| ((i_1537_ & (((Class89_Sub3) this)
						.aShortArray9679[i_1662_]))
				    != 0)) {
				((Class89_Sub3) this).anIntArray9670[i_1662_]
				    -= ((Class89_Sub3) this).anInt9717;
				((Class89_Sub3) this).anIntArray9685[i_1662_]
				    -= ((Class89_Sub3) this).anInt9721;
				((Class89_Sub3) this).anIntArray9684[i_1662_]
				    -= ((Class89_Sub3) this).anInt9722;
				((Class89_Sub3) this).anIntArray9670[i_1662_]
				    = (((Class89_Sub3) this).anIntArray9670
				       [i_1662_]) * i_1534_ / 128;
				((Class89_Sub3) this).anIntArray9685[i_1662_]
				    = (((Class89_Sub3) this).anIntArray9685
				       [i_1662_]) * i_1535_ / 128;
				((Class89_Sub3) this).anIntArray9684[i_1662_]
				    = (((Class89_Sub3) this).anIntArray9684
				       [i_1662_]) * i_1536_ / 128;
				((Class89_Sub3) this).anIntArray9670[i_1662_]
				    += ((Class89_Sub3) this).anInt9717;
				((Class89_Sub3) this).anIntArray9685[i_1662_]
				    += ((Class89_Sub3) this).anInt9721;
				((Class89_Sub3) this).anIntArray9684[i_1662_]
				    += ((Class89_Sub3) this).anInt9722;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub3) this).anIntArrayArray9678 != null
		&& ((Class89_Sub3) this).aByteArray9711 != null) {
		for (int i_1663_ = 0; i_1663_ < i_1539_; i_1663_++) {
		    int i_1664_ = is[i_1663_];
		    if (i_1664_
			< ((Class89_Sub3) this).anIntArrayArray9678.length) {
			int[] is_1665_ = (((Class89_Sub3) this)
					  .anIntArrayArray9678[i_1664_]);
			for (int i_1666_ = 0; i_1666_ < is_1665_.length;
			     i_1666_++) {
			    int i_1667_ = is_1665_[i_1666_];
			    if (((Class89_Sub3) this).aShortArray9714 == null
				|| ((i_1537_ & (((Class89_Sub3) this)
						.aShortArray9714[i_1667_]))
				    != 0)) {
				int i_1668_ = (((((Class89_Sub3) this)
						 .aByteArray9711[i_1667_])
						& 0xff)
					       + i_1534_ * 8);
				if (i_1668_ < 0)
				    i_1668_ = 0;
				else if (i_1668_ > 255)
				    i_1668_ = 255;
				((Class89_Sub3) this).aByteArray9711[i_1667_]
				    = (byte) i_1668_;
			    }
			}
		    }
		}
		if (((Class89_Sub3) this).aClass187Array9727 != null) {
		    for (int i_1669_ = 0;
			 i_1669_ < ((Class89_Sub3) this).anInt9726;
			 i_1669_++) {
			Class187 class187 = (((Class89_Sub3) this)
					     .aClass187Array9727[i_1669_]);
			Class203 class203 = (((Class89_Sub3) this)
					     .aClass203Array9728[i_1669_]);
			((Class203) class203).anInt2417
			    = ((((Class203) class203).anInt2417 * -1473589757
				& 0xffffff)
			       | 255 - ((((Class89_Sub3) this).aByteArray9711
					 [(((Class187) class187).anInt2195
					   * 1571719645)])
					& 0xff) << 24) * 376097963;
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub3) this).anIntArrayArray9678 != null) {
		for (int i_1670_ = 0; i_1670_ < i_1539_; i_1670_++) {
		    int i_1671_ = is[i_1670_];
		    if (i_1671_
			< ((Class89_Sub3) this).anIntArrayArray9678.length) {
			int[] is_1672_ = (((Class89_Sub3) this)
					  .anIntArrayArray9678[i_1671_]);
			for (int i_1673_ = 0; i_1673_ < is_1672_.length;
			     i_1673_++) {
			    int i_1674_ = is_1672_[i_1673_];
			    if (((Class89_Sub3) this).aShortArray9714 == null
				|| ((i_1537_ & (((Class89_Sub3) this)
						.aShortArray9714[i_1674_]))
				    != 0)) {
				int i_1675_ = ((((Class89_Sub3) this)
						.aShortArray9713[i_1674_])
					       & 0xffff);
				int i_1676_ = i_1675_ >> 10 & 0x3f;
				int i_1677_ = i_1675_ >> 7 & 0x7;
				int i_1678_ = i_1675_ & 0x7f;
				i_1676_ = i_1676_ + i_1534_ & 0x3f;
				i_1677_ += i_1535_;
				if (i_1677_ < 0)
				    i_1677_ = 0;
				else if (i_1677_ > 7)
				    i_1677_ = 7;
				i_1678_ += i_1536_;
				if (i_1678_ < 0)
				    i_1678_ = 0;
				else if (i_1678_ > 127)
				    i_1678_ = 127;
				((Class89_Sub3) this).aShortArray9713[i_1674_]
				    = (short) (i_1676_ << 10 | i_1677_ << 7
					       | i_1678_);
			    }
			}
			((Class89_Sub3) this).aBool9718 = true;
		    }
		}
		if (((Class89_Sub3) this).aClass187Array9727 != null) {
		    for (int i_1679_ = 0;
			 i_1679_ < ((Class89_Sub3) this).anInt9726;
			 i_1679_++) {
			Class187 class187 = (((Class89_Sub3) this)
					     .aClass187Array9727[i_1679_]);
			Class203 class203 = (((Class89_Sub3) this)
					     .aClass203Array9728[i_1679_]);
			((Class203) class203).anInt2417
			    = (((((Class203) class203).anInt2417 * -1473589757
				 & ~0xffffff)
				| (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     ((((Class89_Sub3) this).aShortArray9713
				       [(((Class187) class187).anInt2195
					 * 1571719645)]) & 0xffff,
				      1978422334)) & 0xffff]) & 0xffffff)
			       * 376097963);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_1680_ = 0; i_1680_ < i_1539_; i_1680_++) {
		    int i_1681_ = is[i_1680_];
		    if (i_1681_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_1682_ = (((Class89_Sub3) this)
					  .anIntArrayArray9672[i_1681_]);
			for (int i_1683_ = 0; i_1683_ < is_1682_.length;
			     i_1683_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_1682_[i_1683_]]);
			    ((Class203) class203).anInt2423
				+= i_1534_ * -378944915;
			    ((Class203) class203).anInt2418
				+= i_1535_ * 830599387;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_1684_ = 0; i_1684_ < i_1539_; i_1684_++) {
		    int i_1685_ = is[i_1684_];
		    if (i_1685_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_1686_ = (((Class89_Sub3) this)
					  .anIntArrayArray9672[i_1685_]);
			for (int i_1687_ = 0; i_1687_ < is_1686_.length;
			     i_1687_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_1686_[i_1687_]]);
			    ((Class203) class203).aFloat2415
				= (((Class203) class203).aFloat2415
				   * (float) i_1534_ / 128.0F);
			    ((Class203) class203).aFloat2416
				= (((Class203) class203).aFloat2416
				   * (float) i_1535_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_1688_ = 0; i_1688_ < i_1539_; i_1688_++) {
		    int i_1689_ = is[i_1688_];
		    if (i_1689_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_1690_ = (((Class89_Sub3) this)
					  .anIntArrayArray9672[i_1689_]);
			for (int i_1691_ = 0; i_1691_ < is_1690_.length;
			     i_1691_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_1690_[i_1691_]]);
			    ((Class203) class203).anInt2424
				= ((((Class203) class203).anInt2424 * 360392329
				    + i_1534_)
				   & 0x3fff) * 318648249;
			}
		    }
		}
	    }
	}
    }
    
    void method1962(int i, int[] is, int i_1692_, int i_1693_, int i_1694_,
		    boolean bool, int i_1695_, int[] is_1696_) {
	int i_1697_ = is.length;
	if (i == 0) {
	    i_1692_ <<= 4;
	    i_1693_ <<= 4;
	    i_1694_ <<= 4;
	    if (!((Class89_Sub3) this).aBool9719) {
		for (int i_1698_ = 0;
		     i_1698_ < ((Class89_Sub3) this).anInt9686; i_1698_++) {
		    ((Class89_Sub3) this).anIntArray9670[i_1698_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9685[i_1698_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9684[i_1698_] <<= 4;
		}
		((Class89_Sub3) this).aBool9719 = true;
	    }
	    int i_1699_ = 0;
	    ((Class89_Sub3) this).anInt9717 = 0;
	    ((Class89_Sub3) this).anInt9721 = 0;
	    ((Class89_Sub3) this).anInt9722 = 0;
	    for (int i_1700_ = 0; i_1700_ < i_1697_; i_1700_++) {
		int i_1701_ = is[i_1700_];
		if (i_1701_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_1702_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_1701_];
		    for (int i_1703_ = 0; i_1703_ < is_1702_.length;
			 i_1703_++) {
			int i_1704_ = is_1702_[i_1703_];
			if (((Class89_Sub3) this).aShortArray9679 == null
			    || (i_1695_ & (((Class89_Sub3) this)
					   .aShortArray9679[i_1704_])) != 0) {
			    ((Class89_Sub3) this).anInt9717
				+= (((Class89_Sub3) this).anIntArray9670
				    [i_1704_]);
			    ((Class89_Sub3) this).anInt9721
				+= (((Class89_Sub3) this).anIntArray9685
				    [i_1704_]);
			    ((Class89_Sub3) this).anInt9722
				+= (((Class89_Sub3) this).anIntArray9684
				    [i_1704_]);
			    i_1699_++;
			}
		    }
		}
	    }
	    if (i_1699_ > 0) {
		((Class89_Sub3) this).anInt9717
		    = ((Class89_Sub3) this).anInt9717 / i_1699_ + i_1692_;
		((Class89_Sub3) this).anInt9721
		    = ((Class89_Sub3) this).anInt9721 / i_1699_ + i_1693_;
		((Class89_Sub3) this).anInt9722
		    = ((Class89_Sub3) this).anInt9722 / i_1699_ + i_1694_;
		((Class89_Sub3) this).aBool9723 = true;
	    } else {
		((Class89_Sub3) this).anInt9717 = i_1692_;
		((Class89_Sub3) this).anInt9721 = i_1693_;
		((Class89_Sub3) this).anInt9722 = i_1694_;
	    }
	} else if (i == 1) {
	    if (is_1696_ != null) {
		int i_1705_ = ((is_1696_[0] * i_1692_ + is_1696_[1] * i_1693_
				+ is_1696_[2] * i_1694_ + 8192)
			       >> 14);
		int i_1706_ = ((is_1696_[3] * i_1692_ + is_1696_[4] * i_1693_
				+ is_1696_[5] * i_1694_ + 8192)
			       >> 14);
		int i_1707_ = ((is_1696_[6] * i_1692_ + is_1696_[7] * i_1693_
				+ is_1696_[8] * i_1694_ + 8192)
			       >> 14);
		i_1692_ = i_1705_;
		i_1693_ = i_1706_;
		i_1694_ = i_1707_;
	    }
	    i_1692_ <<= 4;
	    i_1693_ <<= 4;
	    i_1694_ <<= 4;
	    if (!((Class89_Sub3) this).aBool9719) {
		for (int i_1708_ = 0;
		     i_1708_ < ((Class89_Sub3) this).anInt9686; i_1708_++) {
		    ((Class89_Sub3) this).anIntArray9670[i_1708_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9685[i_1708_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9684[i_1708_] <<= 4;
		}
		((Class89_Sub3) this).aBool9719 = true;
	    }
	    for (int i_1709_ = 0; i_1709_ < i_1697_; i_1709_++) {
		int i_1710_ = is[i_1709_];
		if (i_1710_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_1711_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_1710_];
		    for (int i_1712_ = 0; i_1712_ < is_1711_.length;
			 i_1712_++) {
			int i_1713_ = is_1711_[i_1712_];
			if (((Class89_Sub3) this).aShortArray9679 == null
			    || (i_1695_ & (((Class89_Sub3) this)
					   .aShortArray9679[i_1713_])) != 0) {
			    ((Class89_Sub3) this).anIntArray9670[i_1713_]
				+= i_1692_;
			    ((Class89_Sub3) this).anIntArray9685[i_1713_]
				+= i_1693_;
			    ((Class89_Sub3) this).anIntArray9684[i_1713_]
				+= i_1694_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1696_ != null) {
		if (!((Class89_Sub3) this).aBool9719) {
		    for (int i_1714_ = 0;
			 i_1714_ < ((Class89_Sub3) this).anInt9686;
			 i_1714_++) {
			((Class89_Sub3) this).anIntArray9670[i_1714_] <<= 4;
			((Class89_Sub3) this).anIntArray9685[i_1714_] <<= 4;
			((Class89_Sub3) this).anIntArray9684[i_1714_] <<= 4;
		    }
		    ((Class89_Sub3) this).aBool9719 = true;
		}
		int i_1715_ = is_1696_[9] << 4;
		int i_1716_ = is_1696_[10] << 4;
		int i_1717_ = is_1696_[11] << 4;
		int i_1718_ = is_1696_[12] << 4;
		int i_1719_ = is_1696_[13] << 4;
		int i_1720_ = is_1696_[14] << 4;
		if (((Class89_Sub3) this).aBool9723) {
		    int i_1721_
			= ((is_1696_[0] * ((Class89_Sub3) this).anInt9717
			    + is_1696_[3] * ((Class89_Sub3) this).anInt9721
			    + is_1696_[6] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    int i_1722_
			= ((is_1696_[1] * ((Class89_Sub3) this).anInt9717
			    + is_1696_[4] * ((Class89_Sub3) this).anInt9721
			    + is_1696_[7] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    int i_1723_
			= ((is_1696_[2] * ((Class89_Sub3) this).anInt9717
			    + is_1696_[5] * ((Class89_Sub3) this).anInt9721
			    + is_1696_[8] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    i_1721_ += i_1718_;
		    i_1722_ += i_1719_;
		    i_1723_ += i_1720_;
		    ((Class89_Sub3) this).anInt9717 = i_1721_;
		    ((Class89_Sub3) this).anInt9721 = i_1722_;
		    ((Class89_Sub3) this).anInt9722 = i_1723_;
		    ((Class89_Sub3) this).aBool9723 = false;
		}
		int[] is_1724_ = new int[9];
		int i_1725_ = Class282.anIntArray4441[i_1692_];
		int i_1726_ = Class282.anIntArray4430[i_1692_];
		int i_1727_ = Class282.anIntArray4441[i_1693_];
		int i_1728_ = Class282.anIntArray4430[i_1693_];
		int i_1729_ = Class282.anIntArray4441[i_1694_];
		int i_1730_ = Class282.anIntArray4430[i_1694_];
		int i_1731_ = i_1726_ * i_1729_ + 8192 >> 14;
		int i_1732_ = i_1726_ * i_1730_ + 8192 >> 14;
		is_1724_[0]
		    = i_1727_ * i_1729_ + i_1728_ * i_1732_ + 8192 >> 14;
		is_1724_[1]
		    = -i_1727_ * i_1730_ + i_1728_ * i_1731_ + 8192 >> 14;
		is_1724_[2] = i_1728_ * i_1725_ + 8192 >> 14;
		is_1724_[3] = i_1725_ * i_1730_ + 8192 >> 14;
		is_1724_[4] = i_1725_ * i_1729_ + 8192 >> 14;
		is_1724_[5] = -i_1726_;
		is_1724_[6]
		    = -i_1728_ * i_1729_ + i_1727_ * i_1732_ + 8192 >> 14;
		is_1724_[7]
		    = i_1728_ * i_1730_ + i_1727_ * i_1731_ + 8192 >> 14;
		is_1724_[8] = i_1727_ * i_1725_ + 8192 >> 14;
		int i_1733_ = (is_1724_[0] * -((Class89_Sub3) this).anInt9717
			       + is_1724_[1] * -((Class89_Sub3) this).anInt9721
			       + is_1724_[2] * -((Class89_Sub3) this).anInt9722
			       + 8192) >> 14;
		int i_1734_ = (is_1724_[3] * -((Class89_Sub3) this).anInt9717
			       + is_1724_[4] * -((Class89_Sub3) this).anInt9721
			       + is_1724_[5] * -((Class89_Sub3) this).anInt9722
			       + 8192) >> 14;
		int i_1735_ = (is_1724_[6] * -((Class89_Sub3) this).anInt9717
			       + is_1724_[7] * -((Class89_Sub3) this).anInt9721
			       + is_1724_[8] * -((Class89_Sub3) this).anInt9722
			       + 8192) >> 14;
		int i_1736_ = i_1733_ + ((Class89_Sub3) this).anInt9717;
		int i_1737_ = i_1734_ + ((Class89_Sub3) this).anInt9721;
		int i_1738_ = i_1735_ + ((Class89_Sub3) this).anInt9722;
		int[] is_1739_ = new int[9];
		for (int i_1740_ = 0; i_1740_ < 3; i_1740_++) {
		    for (int i_1741_ = 0; i_1741_ < 3; i_1741_++) {
			int i_1742_ = 0;
			for (int i_1743_ = 0; i_1743_ < 3; i_1743_++)
			    i_1742_ += (is_1724_[i_1740_ * 3 + i_1743_]
					* is_1696_[i_1741_ * 3 + i_1743_]);
			is_1739_[i_1740_ * 3 + i_1741_] = i_1742_ + 8192 >> 14;
		    }
		}
		int i_1744_ = ((is_1724_[0] * i_1718_ + is_1724_[1] * i_1719_
				+ is_1724_[2] * i_1720_ + 8192)
			       >> 14);
		int i_1745_ = ((is_1724_[3] * i_1718_ + is_1724_[4] * i_1719_
				+ is_1724_[5] * i_1720_ + 8192)
			       >> 14);
		int i_1746_ = ((is_1724_[6] * i_1718_ + is_1724_[7] * i_1719_
				+ is_1724_[8] * i_1720_ + 8192)
			       >> 14);
		i_1744_ += i_1736_;
		i_1745_ += i_1737_;
		i_1746_ += i_1738_;
		int[] is_1747_ = new int[9];
		for (int i_1748_ = 0; i_1748_ < 3; i_1748_++) {
		    for (int i_1749_ = 0; i_1749_ < 3; i_1749_++) {
			int i_1750_ = 0;
			for (int i_1751_ = 0; i_1751_ < 3; i_1751_++)
			    i_1750_ += (is_1696_[i_1748_ * 3 + i_1751_]
					* is_1739_[i_1749_ + i_1751_ * 3]);
			is_1747_[i_1748_ * 3 + i_1749_] = i_1750_ + 8192 >> 14;
		    }
		}
		int i_1752_ = ((is_1696_[0] * i_1744_ + is_1696_[1] * i_1745_
				+ is_1696_[2] * i_1746_ + 8192)
			       >> 14);
		int i_1753_ = ((is_1696_[3] * i_1744_ + is_1696_[4] * i_1745_
				+ is_1696_[5] * i_1746_ + 8192)
			       >> 14);
		int i_1754_ = ((is_1696_[6] * i_1744_ + is_1696_[7] * i_1745_
				+ is_1696_[8] * i_1746_ + 8192)
			       >> 14);
		i_1752_ += i_1715_;
		i_1753_ += i_1716_;
		i_1754_ += i_1717_;
		for (int i_1755_ = 0; i_1755_ < i_1697_; i_1755_++) {
		    int i_1756_ = is[i_1755_];
		    if (i_1756_
			< ((Class89_Sub3) this).anIntArrayArray9716.length) {
			int[] is_1757_ = (((Class89_Sub3) this)
					  .anIntArrayArray9716[i_1756_]);
			for (int i_1758_ = 0; i_1758_ < is_1757_.length;
			     i_1758_++) {
			    int i_1759_ = is_1757_[i_1758_];
			    if (((Class89_Sub3) this).aShortArray9679 == null
				|| ((i_1695_ & (((Class89_Sub3) this)
						.aShortArray9679[i_1759_]))
				    != 0)) {
				int i_1760_
				    = (is_1747_[0] * (((Class89_Sub3) this)
						      .anIntArray9670[i_1759_])
				       + is_1747_[1] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_1759_])
				       + is_1747_[2] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_1759_])
				       + 8192) >> 14;
				int i_1761_
				    = (is_1747_[3] * (((Class89_Sub3) this)
						      .anIntArray9670[i_1759_])
				       + is_1747_[4] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_1759_])
				       + is_1747_[5] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_1759_])
				       + 8192) >> 14;
				int i_1762_
				    = (is_1747_[6] * (((Class89_Sub3) this)
						      .anIntArray9670[i_1759_])
				       + is_1747_[7] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_1759_])
				       + is_1747_[8] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_1759_])
				       + 8192) >> 14;
				i_1760_ += i_1752_;
				i_1761_ += i_1753_;
				i_1762_ += i_1754_;
				((Class89_Sub3) this).anIntArray9670[i_1759_]
				    = i_1760_;
				((Class89_Sub3) this).anIntArray9685[i_1759_]
				    = i_1761_;
				((Class89_Sub3) this).anIntArray9684[i_1759_]
				    = i_1762_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1763_ = 0; i_1763_ < i_1697_; i_1763_++) {
		    int i_1764_ = is[i_1763_];
		    if (i_1764_
			< ((Class89_Sub3) this).anIntArrayArray9716.length) {
			int[] is_1765_ = (((Class89_Sub3) this)
					  .anIntArrayArray9716[i_1764_]);
			for (int i_1766_ = 0; i_1766_ < is_1765_.length;
			     i_1766_++) {
			    int i_1767_ = is_1765_[i_1766_];
			    if (((Class89_Sub3) this).aShortArray9679 == null
				|| ((i_1695_ & (((Class89_Sub3) this)
						.aShortArray9679[i_1767_]))
				    != 0)) {
				((Class89_Sub3) this).anIntArray9670[i_1767_]
				    -= ((Class89_Sub3) this).anInt9717;
				((Class89_Sub3) this).anIntArray9685[i_1767_]
				    -= ((Class89_Sub3) this).anInt9721;
				((Class89_Sub3) this).anIntArray9684[i_1767_]
				    -= ((Class89_Sub3) this).anInt9722;
				if (i_1694_ != 0) {
				    int i_1768_
					= Class282.anIntArray4430[i_1694_];
				    int i_1769_
					= Class282.anIntArray4441[i_1694_];
				    int i_1770_
					= ((((Class89_Sub3) this)
					    .anIntArray9685[i_1767_]) * i_1768_
					   + ((((Class89_Sub3) this)
					       .anIntArray9670[i_1767_])
					      * i_1769_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9685
					[i_1767_]
					= ((((Class89_Sub3) this)
					    .anIntArray9685[i_1767_]) * i_1769_
					   - ((((Class89_Sub3) this)
					       .anIntArray9670[i_1767_])
					      * i_1768_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9670
					[i_1767_]
					= i_1770_;
				}
				if (i_1692_ != 0) {
				    int i_1771_
					= Class282.anIntArray4430[i_1692_];
				    int i_1772_
					= Class282.anIntArray4441[i_1692_];
				    int i_1773_
					= ((((Class89_Sub3) this)
					    .anIntArray9685[i_1767_]) * i_1772_
					   - ((((Class89_Sub3) this)
					       .anIntArray9684[i_1767_])
					      * i_1771_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9684
					[i_1767_]
					= ((((Class89_Sub3) this)
					    .anIntArray9685[i_1767_]) * i_1771_
					   + ((((Class89_Sub3) this)
					       .anIntArray9684[i_1767_])
					      * i_1772_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9685
					[i_1767_]
					= i_1773_;
				}
				if (i_1693_ != 0) {
				    int i_1774_
					= Class282.anIntArray4430[i_1693_];
				    int i_1775_
					= Class282.anIntArray4441[i_1693_];
				    int i_1776_
					= ((((Class89_Sub3) this)
					    .anIntArray9684[i_1767_]) * i_1774_
					   + ((((Class89_Sub3) this)
					       .anIntArray9670[i_1767_])
					      * i_1775_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9684
					[i_1767_]
					= ((((Class89_Sub3) this)
					    .anIntArray9684[i_1767_]) * i_1775_
					   - ((((Class89_Sub3) this)
					       .anIntArray9670[i_1767_])
					      * i_1774_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9670
					[i_1767_]
					= i_1776_;
				}
				((Class89_Sub3) this).anIntArray9670[i_1767_]
				    += ((Class89_Sub3) this).anInt9717;
				((Class89_Sub3) this).anIntArray9685[i_1767_]
				    += ((Class89_Sub3) this).anInt9721;
				((Class89_Sub3) this).anIntArray9684[i_1767_]
				    += ((Class89_Sub3) this).anInt9722;
			    }
			}
		    }
		}
	    }
	} else if (i == 3) {
	    if (is_1696_ != null) {
		if (!((Class89_Sub3) this).aBool9719) {
		    for (int i_1777_ = 0;
			 i_1777_ < ((Class89_Sub3) this).anInt9686;
			 i_1777_++) {
			((Class89_Sub3) this).anIntArray9670[i_1777_] <<= 4;
			((Class89_Sub3) this).anIntArray9685[i_1777_] <<= 4;
			((Class89_Sub3) this).anIntArray9684[i_1777_] <<= 4;
		    }
		    ((Class89_Sub3) this).aBool9719 = true;
		}
		int i_1778_ = is_1696_[9] << 4;
		int i_1779_ = is_1696_[10] << 4;
		int i_1780_ = is_1696_[11] << 4;
		int i_1781_ = is_1696_[12] << 4;
		int i_1782_ = is_1696_[13] << 4;
		int i_1783_ = is_1696_[14] << 4;
		if (((Class89_Sub3) this).aBool9723) {
		    int i_1784_
			= ((is_1696_[0] * ((Class89_Sub3) this).anInt9717
			    + is_1696_[3] * ((Class89_Sub3) this).anInt9721
			    + is_1696_[6] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    int i_1785_
			= ((is_1696_[1] * ((Class89_Sub3) this).anInt9717
			    + is_1696_[4] * ((Class89_Sub3) this).anInt9721
			    + is_1696_[7] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    int i_1786_
			= ((is_1696_[2] * ((Class89_Sub3) this).anInt9717
			    + is_1696_[5] * ((Class89_Sub3) this).anInt9721
			    + is_1696_[8] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    i_1784_ += i_1781_;
		    i_1785_ += i_1782_;
		    i_1786_ += i_1783_;
		    ((Class89_Sub3) this).anInt9717 = i_1784_;
		    ((Class89_Sub3) this).anInt9721 = i_1785_;
		    ((Class89_Sub3) this).anInt9722 = i_1786_;
		    ((Class89_Sub3) this).aBool9723 = false;
		}
		int i_1787_ = i_1692_ << 15 >> 7;
		int i_1788_ = i_1693_ << 15 >> 7;
		int i_1789_ = i_1694_ << 15 >> 7;
		int i_1790_
		    = i_1787_ * -((Class89_Sub3) this).anInt9717 + 8192 >> 14;
		int i_1791_
		    = i_1788_ * -((Class89_Sub3) this).anInt9721 + 8192 >> 14;
		int i_1792_
		    = i_1789_ * -((Class89_Sub3) this).anInt9722 + 8192 >> 14;
		int i_1793_ = i_1790_ + ((Class89_Sub3) this).anInt9717;
		int i_1794_ = i_1791_ + ((Class89_Sub3) this).anInt9721;
		int i_1795_ = i_1792_ + ((Class89_Sub3) this).anInt9722;
		int[] is_1796_ = new int[9];
		is_1796_[0] = i_1787_ * is_1696_[0] + 8192 >> 14;
		is_1796_[1] = i_1787_ * is_1696_[3] + 8192 >> 14;
		is_1796_[2] = i_1787_ * is_1696_[6] + 8192 >> 14;
		is_1796_[3] = i_1788_ * is_1696_[1] + 8192 >> 14;
		is_1796_[4] = i_1788_ * is_1696_[4] + 8192 >> 14;
		is_1796_[5] = i_1788_ * is_1696_[7] + 8192 >> 14;
		is_1796_[6] = i_1789_ * is_1696_[2] + 8192 >> 14;
		is_1796_[7] = i_1789_ * is_1696_[5] + 8192 >> 14;
		is_1796_[8] = i_1789_ * is_1696_[8] + 8192 >> 14;
		int i_1797_ = i_1787_ * i_1781_ + 8192 >> 14;
		int i_1798_ = i_1788_ * i_1782_ + 8192 >> 14;
		int i_1799_ = i_1789_ * i_1783_ + 8192 >> 14;
		i_1797_ += i_1793_;
		i_1798_ += i_1794_;
		i_1799_ += i_1795_;
		int[] is_1800_ = new int[9];
		for (int i_1801_ = 0; i_1801_ < 3; i_1801_++) {
		    for (int i_1802_ = 0; i_1802_ < 3; i_1802_++) {
			int i_1803_ = 0;
			for (int i_1804_ = 0; i_1804_ < 3; i_1804_++)
			    i_1803_ += (is_1696_[i_1801_ * 3 + i_1804_]
					* is_1796_[i_1802_ + i_1804_ * 3]);
			is_1800_[i_1801_ * 3 + i_1802_] = i_1803_ + 8192 >> 14;
		    }
		}
		int i_1805_ = ((is_1696_[0] * i_1797_ + is_1696_[1] * i_1798_
				+ is_1696_[2] * i_1799_ + 8192)
			       >> 14);
		int i_1806_ = ((is_1696_[3] * i_1797_ + is_1696_[4] * i_1798_
				+ is_1696_[5] * i_1799_ + 8192)
			       >> 14);
		int i_1807_ = ((is_1696_[6] * i_1797_ + is_1696_[7] * i_1798_
				+ is_1696_[8] * i_1799_ + 8192)
			       >> 14);
		i_1805_ += i_1778_;
		i_1806_ += i_1779_;
		i_1807_ += i_1780_;
		for (int i_1808_ = 0; i_1808_ < i_1697_; i_1808_++) {
		    int i_1809_ = is[i_1808_];
		    if (i_1809_
			< ((Class89_Sub3) this).anIntArrayArray9716.length) {
			int[] is_1810_ = (((Class89_Sub3) this)
					  .anIntArrayArray9716[i_1809_]);
			for (int i_1811_ = 0; i_1811_ < is_1810_.length;
			     i_1811_++) {
			    int i_1812_ = is_1810_[i_1811_];
			    if (((Class89_Sub3) this).aShortArray9679 == null
				|| ((i_1695_ & (((Class89_Sub3) this)
						.aShortArray9679[i_1812_]))
				    != 0)) {
				int i_1813_
				    = (is_1800_[0] * (((Class89_Sub3) this)
						      .anIntArray9670[i_1812_])
				       + is_1800_[1] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_1812_])
				       + is_1800_[2] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_1812_])
				       + 8192) >> 14;
				int i_1814_
				    = (is_1800_[3] * (((Class89_Sub3) this)
						      .anIntArray9670[i_1812_])
				       + is_1800_[4] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_1812_])
				       + is_1800_[5] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_1812_])
				       + 8192) >> 14;
				int i_1815_
				    = (is_1800_[6] * (((Class89_Sub3) this)
						      .anIntArray9670[i_1812_])
				       + is_1800_[7] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_1812_])
				       + is_1800_[8] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_1812_])
				       + 8192) >> 14;
				i_1813_ += i_1805_;
				i_1814_ += i_1806_;
				i_1815_ += i_1807_;
				((Class89_Sub3) this).anIntArray9670[i_1812_]
				    = i_1813_;
				((Class89_Sub3) this).anIntArray9685[i_1812_]
				    = i_1814_;
				((Class89_Sub3) this).anIntArray9684[i_1812_]
				    = i_1815_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1816_ = 0; i_1816_ < i_1697_; i_1816_++) {
		    int i_1817_ = is[i_1816_];
		    if (i_1817_
			< ((Class89_Sub3) this).anIntArrayArray9716.length) {
			int[] is_1818_ = (((Class89_Sub3) this)
					  .anIntArrayArray9716[i_1817_]);
			for (int i_1819_ = 0; i_1819_ < is_1818_.length;
			     i_1819_++) {
			    int i_1820_ = is_1818_[i_1819_];
			    if (((Class89_Sub3) this).aShortArray9679 == null
				|| ((i_1695_ & (((Class89_Sub3) this)
						.aShortArray9679[i_1820_]))
				    != 0)) {
				((Class89_Sub3) this).anIntArray9670[i_1820_]
				    -= ((Class89_Sub3) this).anInt9717;
				((Class89_Sub3) this).anIntArray9685[i_1820_]
				    -= ((Class89_Sub3) this).anInt9721;
				((Class89_Sub3) this).anIntArray9684[i_1820_]
				    -= ((Class89_Sub3) this).anInt9722;
				((Class89_Sub3) this).anIntArray9670[i_1820_]
				    = (((Class89_Sub3) this).anIntArray9670
				       [i_1820_]) * i_1692_ / 128;
				((Class89_Sub3) this).anIntArray9685[i_1820_]
				    = (((Class89_Sub3) this).anIntArray9685
				       [i_1820_]) * i_1693_ / 128;
				((Class89_Sub3) this).anIntArray9684[i_1820_]
				    = (((Class89_Sub3) this).anIntArray9684
				       [i_1820_]) * i_1694_ / 128;
				((Class89_Sub3) this).anIntArray9670[i_1820_]
				    += ((Class89_Sub3) this).anInt9717;
				((Class89_Sub3) this).anIntArray9685[i_1820_]
				    += ((Class89_Sub3) this).anInt9721;
				((Class89_Sub3) this).anIntArray9684[i_1820_]
				    += ((Class89_Sub3) this).anInt9722;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub3) this).anIntArrayArray9678 != null
		&& ((Class89_Sub3) this).aByteArray9711 != null) {
		for (int i_1821_ = 0; i_1821_ < i_1697_; i_1821_++) {
		    int i_1822_ = is[i_1821_];
		    if (i_1822_
			< ((Class89_Sub3) this).anIntArrayArray9678.length) {
			int[] is_1823_ = (((Class89_Sub3) this)
					  .anIntArrayArray9678[i_1822_]);
			for (int i_1824_ = 0; i_1824_ < is_1823_.length;
			     i_1824_++) {
			    int i_1825_ = is_1823_[i_1824_];
			    if (((Class89_Sub3) this).aShortArray9714 == null
				|| ((i_1695_ & (((Class89_Sub3) this)
						.aShortArray9714[i_1825_]))
				    != 0)) {
				int i_1826_ = (((((Class89_Sub3) this)
						 .aByteArray9711[i_1825_])
						& 0xff)
					       + i_1692_ * 8);
				if (i_1826_ < 0)
				    i_1826_ = 0;
				else if (i_1826_ > 255)
				    i_1826_ = 255;
				((Class89_Sub3) this).aByteArray9711[i_1825_]
				    = (byte) i_1826_;
			    }
			}
		    }
		}
		if (((Class89_Sub3) this).aClass187Array9727 != null) {
		    for (int i_1827_ = 0;
			 i_1827_ < ((Class89_Sub3) this).anInt9726;
			 i_1827_++) {
			Class187 class187 = (((Class89_Sub3) this)
					     .aClass187Array9727[i_1827_]);
			Class203 class203 = (((Class89_Sub3) this)
					     .aClass203Array9728[i_1827_]);
			((Class203) class203).anInt2417
			    = ((((Class203) class203).anInt2417 * -1473589757
				& 0xffffff)
			       | 255 - ((((Class89_Sub3) this).aByteArray9711
					 [(((Class187) class187).anInt2195
					   * 1571719645)])
					& 0xff) << 24) * 376097963;
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub3) this).anIntArrayArray9678 != null) {
		for (int i_1828_ = 0; i_1828_ < i_1697_; i_1828_++) {
		    int i_1829_ = is[i_1828_];
		    if (i_1829_
			< ((Class89_Sub3) this).anIntArrayArray9678.length) {
			int[] is_1830_ = (((Class89_Sub3) this)
					  .anIntArrayArray9678[i_1829_]);
			for (int i_1831_ = 0; i_1831_ < is_1830_.length;
			     i_1831_++) {
			    int i_1832_ = is_1830_[i_1831_];
			    if (((Class89_Sub3) this).aShortArray9714 == null
				|| ((i_1695_ & (((Class89_Sub3) this)
						.aShortArray9714[i_1832_]))
				    != 0)) {
				int i_1833_ = ((((Class89_Sub3) this)
						.aShortArray9713[i_1832_])
					       & 0xffff);
				int i_1834_ = i_1833_ >> 10 & 0x3f;
				int i_1835_ = i_1833_ >> 7 & 0x7;
				int i_1836_ = i_1833_ & 0x7f;
				i_1834_ = i_1834_ + i_1692_ & 0x3f;
				i_1835_ += i_1693_;
				if (i_1835_ < 0)
				    i_1835_ = 0;
				else if (i_1835_ > 7)
				    i_1835_ = 7;
				i_1836_ += i_1694_;
				if (i_1836_ < 0)
				    i_1836_ = 0;
				else if (i_1836_ > 127)
				    i_1836_ = 127;
				((Class89_Sub3) this).aShortArray9713[i_1832_]
				    = (short) (i_1834_ << 10 | i_1835_ << 7
					       | i_1836_);
			    }
			}
			((Class89_Sub3) this).aBool9718 = true;
		    }
		}
		if (((Class89_Sub3) this).aClass187Array9727 != null) {
		    for (int i_1837_ = 0;
			 i_1837_ < ((Class89_Sub3) this).anInt9726;
			 i_1837_++) {
			Class187 class187 = (((Class89_Sub3) this)
					     .aClass187Array9727[i_1837_]);
			Class203 class203 = (((Class89_Sub3) this)
					     .aClass203Array9728[i_1837_]);
			((Class203) class203).anInt2417
			    = (((((Class203) class203).anInt2417 * -1473589757
				 & ~0xffffff)
				| (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     ((((Class89_Sub3) this).aShortArray9713
				       [(((Class187) class187).anInt2195
					 * 1571719645)]) & 0xffff,
				      112055682)) & 0xffff]) & 0xffffff)
			       * 376097963);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_1838_ = 0; i_1838_ < i_1697_; i_1838_++) {
		    int i_1839_ = is[i_1838_];
		    if (i_1839_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_1840_ = (((Class89_Sub3) this)
					  .anIntArrayArray9672[i_1839_]);
			for (int i_1841_ = 0; i_1841_ < is_1840_.length;
			     i_1841_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_1840_[i_1841_]]);
			    ((Class203) class203).anInt2423
				+= i_1692_ * -378944915;
			    ((Class203) class203).anInt2418
				+= i_1693_ * 830599387;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_1842_ = 0; i_1842_ < i_1697_; i_1842_++) {
		    int i_1843_ = is[i_1842_];
		    if (i_1843_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_1844_ = (((Class89_Sub3) this)
					  .anIntArrayArray9672[i_1843_]);
			for (int i_1845_ = 0; i_1845_ < is_1844_.length;
			     i_1845_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_1844_[i_1845_]]);
			    ((Class203) class203).aFloat2415
				= (((Class203) class203).aFloat2415
				   * (float) i_1692_ / 128.0F);
			    ((Class203) class203).aFloat2416
				= (((Class203) class203).aFloat2416
				   * (float) i_1693_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_1846_ = 0; i_1846_ < i_1697_; i_1846_++) {
		    int i_1847_ = is[i_1846_];
		    if (i_1847_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_1848_ = (((Class89_Sub3) this)
					  .anIntArrayArray9672[i_1847_]);
			for (int i_1849_ = 0; i_1849_ < is_1848_.length;
			     i_1849_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_1848_[i_1849_]]);
			    ((Class203) class203).anInt2424
				= ((((Class203) class203).anInt2424 * 360392329
				    + i_1692_)
				   & 0x3fff) * 318648249;
			}
		    }
		}
	    }
	}
    }
    
    void method16117(boolean bool) {
	if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
	     .anInt9274) * 592623211
	    > 1) {
	    synchronized (this) {
		method16053(bool);
	    }
	} else
	    method16053(bool);
    }
    
    void method1964(int i, int[] is, int i_1850_, int i_1851_, int i_1852_,
		    boolean bool, int i_1853_, int[] is_1854_) {
	int i_1855_ = is.length;
	if (i == 0) {
	    i_1850_ <<= 4;
	    i_1851_ <<= 4;
	    i_1852_ <<= 4;
	    if (!((Class89_Sub3) this).aBool9719) {
		for (int i_1856_ = 0;
		     i_1856_ < ((Class89_Sub3) this).anInt9686; i_1856_++) {
		    ((Class89_Sub3) this).anIntArray9670[i_1856_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9685[i_1856_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9684[i_1856_] <<= 4;
		}
		((Class89_Sub3) this).aBool9719 = true;
	    }
	    int i_1857_ = 0;
	    ((Class89_Sub3) this).anInt9717 = 0;
	    ((Class89_Sub3) this).anInt9721 = 0;
	    ((Class89_Sub3) this).anInt9722 = 0;
	    for (int i_1858_ = 0; i_1858_ < i_1855_; i_1858_++) {
		int i_1859_ = is[i_1858_];
		if (i_1859_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_1860_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_1859_];
		    for (int i_1861_ = 0; i_1861_ < is_1860_.length;
			 i_1861_++) {
			int i_1862_ = is_1860_[i_1861_];
			if (((Class89_Sub3) this).aShortArray9679 == null
			    || (i_1853_ & (((Class89_Sub3) this)
					   .aShortArray9679[i_1862_])) != 0) {
			    ((Class89_Sub3) this).anInt9717
				+= (((Class89_Sub3) this).anIntArray9670
				    [i_1862_]);
			    ((Class89_Sub3) this).anInt9721
				+= (((Class89_Sub3) this).anIntArray9685
				    [i_1862_]);
			    ((Class89_Sub3) this).anInt9722
				+= (((Class89_Sub3) this).anIntArray9684
				    [i_1862_]);
			    i_1857_++;
			}
		    }
		}
	    }
	    if (i_1857_ > 0) {
		((Class89_Sub3) this).anInt9717
		    = ((Class89_Sub3) this).anInt9717 / i_1857_ + i_1850_;
		((Class89_Sub3) this).anInt9721
		    = ((Class89_Sub3) this).anInt9721 / i_1857_ + i_1851_;
		((Class89_Sub3) this).anInt9722
		    = ((Class89_Sub3) this).anInt9722 / i_1857_ + i_1852_;
		((Class89_Sub3) this).aBool9723 = true;
	    } else {
		((Class89_Sub3) this).anInt9717 = i_1850_;
		((Class89_Sub3) this).anInt9721 = i_1851_;
		((Class89_Sub3) this).anInt9722 = i_1852_;
	    }
	} else if (i == 1) {
	    if (is_1854_ != null) {
		int i_1863_ = ((is_1854_[0] * i_1850_ + is_1854_[1] * i_1851_
				+ is_1854_[2] * i_1852_ + 8192)
			       >> 14);
		int i_1864_ = ((is_1854_[3] * i_1850_ + is_1854_[4] * i_1851_
				+ is_1854_[5] * i_1852_ + 8192)
			       >> 14);
		int i_1865_ = ((is_1854_[6] * i_1850_ + is_1854_[7] * i_1851_
				+ is_1854_[8] * i_1852_ + 8192)
			       >> 14);
		i_1850_ = i_1863_;
		i_1851_ = i_1864_;
		i_1852_ = i_1865_;
	    }
	    i_1850_ <<= 4;
	    i_1851_ <<= 4;
	    i_1852_ <<= 4;
	    if (!((Class89_Sub3) this).aBool9719) {
		for (int i_1866_ = 0;
		     i_1866_ < ((Class89_Sub3) this).anInt9686; i_1866_++) {
		    ((Class89_Sub3) this).anIntArray9670[i_1866_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9685[i_1866_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9684[i_1866_] <<= 4;
		}
		((Class89_Sub3) this).aBool9719 = true;
	    }
	    for (int i_1867_ = 0; i_1867_ < i_1855_; i_1867_++) {
		int i_1868_ = is[i_1867_];
		if (i_1868_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_1869_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_1868_];
		    for (int i_1870_ = 0; i_1870_ < is_1869_.length;
			 i_1870_++) {
			int i_1871_ = is_1869_[i_1870_];
			if (((Class89_Sub3) this).aShortArray9679 == null
			    || (i_1853_ & (((Class89_Sub3) this)
					   .aShortArray9679[i_1871_])) != 0) {
			    ((Class89_Sub3) this).anIntArray9670[i_1871_]
				+= i_1850_;
			    ((Class89_Sub3) this).anIntArray9685[i_1871_]
				+= i_1851_;
			    ((Class89_Sub3) this).anIntArray9684[i_1871_]
				+= i_1852_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1854_ != null) {
		if (!((Class89_Sub3) this).aBool9719) {
		    for (int i_1872_ = 0;
			 i_1872_ < ((Class89_Sub3) this).anInt9686;
			 i_1872_++) {
			((Class89_Sub3) this).anIntArray9670[i_1872_] <<= 4;
			((Class89_Sub3) this).anIntArray9685[i_1872_] <<= 4;
			((Class89_Sub3) this).anIntArray9684[i_1872_] <<= 4;
		    }
		    ((Class89_Sub3) this).aBool9719 = true;
		}
		int i_1873_ = is_1854_[9] << 4;
		int i_1874_ = is_1854_[10] << 4;
		int i_1875_ = is_1854_[11] << 4;
		int i_1876_ = is_1854_[12] << 4;
		int i_1877_ = is_1854_[13] << 4;
		int i_1878_ = is_1854_[14] << 4;
		if (((Class89_Sub3) this).aBool9723) {
		    int i_1879_
			= ((is_1854_[0] * ((Class89_Sub3) this).anInt9717
			    + is_1854_[3] * ((Class89_Sub3) this).anInt9721
			    + is_1854_[6] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    int i_1880_
			= ((is_1854_[1] * ((Class89_Sub3) this).anInt9717
			    + is_1854_[4] * ((Class89_Sub3) this).anInt9721
			    + is_1854_[7] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    int i_1881_
			= ((is_1854_[2] * ((Class89_Sub3) this).anInt9717
			    + is_1854_[5] * ((Class89_Sub3) this).anInt9721
			    + is_1854_[8] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    i_1879_ += i_1876_;
		    i_1880_ += i_1877_;
		    i_1881_ += i_1878_;
		    ((Class89_Sub3) this).anInt9717 = i_1879_;
		    ((Class89_Sub3) this).anInt9721 = i_1880_;
		    ((Class89_Sub3) this).anInt9722 = i_1881_;
		    ((Class89_Sub3) this).aBool9723 = false;
		}
		int[] is_1882_ = new int[9];
		int i_1883_ = Class282.anIntArray4441[i_1850_];
		int i_1884_ = Class282.anIntArray4430[i_1850_];
		int i_1885_ = Class282.anIntArray4441[i_1851_];
		int i_1886_ = Class282.anIntArray4430[i_1851_];
		int i_1887_ = Class282.anIntArray4441[i_1852_];
		int i_1888_ = Class282.anIntArray4430[i_1852_];
		int i_1889_ = i_1884_ * i_1887_ + 8192 >> 14;
		int i_1890_ = i_1884_ * i_1888_ + 8192 >> 14;
		is_1882_[0]
		    = i_1885_ * i_1887_ + i_1886_ * i_1890_ + 8192 >> 14;
		is_1882_[1]
		    = -i_1885_ * i_1888_ + i_1886_ * i_1889_ + 8192 >> 14;
		is_1882_[2] = i_1886_ * i_1883_ + 8192 >> 14;
		is_1882_[3] = i_1883_ * i_1888_ + 8192 >> 14;
		is_1882_[4] = i_1883_ * i_1887_ + 8192 >> 14;
		is_1882_[5] = -i_1884_;
		is_1882_[6]
		    = -i_1886_ * i_1887_ + i_1885_ * i_1890_ + 8192 >> 14;
		is_1882_[7]
		    = i_1886_ * i_1888_ + i_1885_ * i_1889_ + 8192 >> 14;
		is_1882_[8] = i_1885_ * i_1883_ + 8192 >> 14;
		int i_1891_ = (is_1882_[0] * -((Class89_Sub3) this).anInt9717
			       + is_1882_[1] * -((Class89_Sub3) this).anInt9721
			       + is_1882_[2] * -((Class89_Sub3) this).anInt9722
			       + 8192) >> 14;
		int i_1892_ = (is_1882_[3] * -((Class89_Sub3) this).anInt9717
			       + is_1882_[4] * -((Class89_Sub3) this).anInt9721
			       + is_1882_[5] * -((Class89_Sub3) this).anInt9722
			       + 8192) >> 14;
		int i_1893_ = (is_1882_[6] * -((Class89_Sub3) this).anInt9717
			       + is_1882_[7] * -((Class89_Sub3) this).anInt9721
			       + is_1882_[8] * -((Class89_Sub3) this).anInt9722
			       + 8192) >> 14;
		int i_1894_ = i_1891_ + ((Class89_Sub3) this).anInt9717;
		int i_1895_ = i_1892_ + ((Class89_Sub3) this).anInt9721;
		int i_1896_ = i_1893_ + ((Class89_Sub3) this).anInt9722;
		int[] is_1897_ = new int[9];
		for (int i_1898_ = 0; i_1898_ < 3; i_1898_++) {
		    for (int i_1899_ = 0; i_1899_ < 3; i_1899_++) {
			int i_1900_ = 0;
			for (int i_1901_ = 0; i_1901_ < 3; i_1901_++)
			    i_1900_ += (is_1882_[i_1898_ * 3 + i_1901_]
					* is_1854_[i_1899_ * 3 + i_1901_]);
			is_1897_[i_1898_ * 3 + i_1899_] = i_1900_ + 8192 >> 14;
		    }
		}
		int i_1902_ = ((is_1882_[0] * i_1876_ + is_1882_[1] * i_1877_
				+ is_1882_[2] * i_1878_ + 8192)
			       >> 14);
		int i_1903_ = ((is_1882_[3] * i_1876_ + is_1882_[4] * i_1877_
				+ is_1882_[5] * i_1878_ + 8192)
			       >> 14);
		int i_1904_ = ((is_1882_[6] * i_1876_ + is_1882_[7] * i_1877_
				+ is_1882_[8] * i_1878_ + 8192)
			       >> 14);
		i_1902_ += i_1894_;
		i_1903_ += i_1895_;
		i_1904_ += i_1896_;
		int[] is_1905_ = new int[9];
		for (int i_1906_ = 0; i_1906_ < 3; i_1906_++) {
		    for (int i_1907_ = 0; i_1907_ < 3; i_1907_++) {
			int i_1908_ = 0;
			for (int i_1909_ = 0; i_1909_ < 3; i_1909_++)
			    i_1908_ += (is_1854_[i_1906_ * 3 + i_1909_]
					* is_1897_[i_1907_ + i_1909_ * 3]);
			is_1905_[i_1906_ * 3 + i_1907_] = i_1908_ + 8192 >> 14;
		    }
		}
		int i_1910_ = ((is_1854_[0] * i_1902_ + is_1854_[1] * i_1903_
				+ is_1854_[2] * i_1904_ + 8192)
			       >> 14);
		int i_1911_ = ((is_1854_[3] * i_1902_ + is_1854_[4] * i_1903_
				+ is_1854_[5] * i_1904_ + 8192)
			       >> 14);
		int i_1912_ = ((is_1854_[6] * i_1902_ + is_1854_[7] * i_1903_
				+ is_1854_[8] * i_1904_ + 8192)
			       >> 14);
		i_1910_ += i_1873_;
		i_1911_ += i_1874_;
		i_1912_ += i_1875_;
		for (int i_1913_ = 0; i_1913_ < i_1855_; i_1913_++) {
		    int i_1914_ = is[i_1913_];
		    if (i_1914_
			< ((Class89_Sub3) this).anIntArrayArray9716.length) {
			int[] is_1915_ = (((Class89_Sub3) this)
					  .anIntArrayArray9716[i_1914_]);
			for (int i_1916_ = 0; i_1916_ < is_1915_.length;
			     i_1916_++) {
			    int i_1917_ = is_1915_[i_1916_];
			    if (((Class89_Sub3) this).aShortArray9679 == null
				|| ((i_1853_ & (((Class89_Sub3) this)
						.aShortArray9679[i_1917_]))
				    != 0)) {
				int i_1918_
				    = (is_1905_[0] * (((Class89_Sub3) this)
						      .anIntArray9670[i_1917_])
				       + is_1905_[1] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_1917_])
				       + is_1905_[2] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_1917_])
				       + 8192) >> 14;
				int i_1919_
				    = (is_1905_[3] * (((Class89_Sub3) this)
						      .anIntArray9670[i_1917_])
				       + is_1905_[4] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_1917_])
				       + is_1905_[5] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_1917_])
				       + 8192) >> 14;
				int i_1920_
				    = (is_1905_[6] * (((Class89_Sub3) this)
						      .anIntArray9670[i_1917_])
				       + is_1905_[7] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_1917_])
				       + is_1905_[8] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_1917_])
				       + 8192) >> 14;
				i_1918_ += i_1910_;
				i_1919_ += i_1911_;
				i_1920_ += i_1912_;
				((Class89_Sub3) this).anIntArray9670[i_1917_]
				    = i_1918_;
				((Class89_Sub3) this).anIntArray9685[i_1917_]
				    = i_1919_;
				((Class89_Sub3) this).anIntArray9684[i_1917_]
				    = i_1920_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1921_ = 0; i_1921_ < i_1855_; i_1921_++) {
		    int i_1922_ = is[i_1921_];
		    if (i_1922_
			< ((Class89_Sub3) this).anIntArrayArray9716.length) {
			int[] is_1923_ = (((Class89_Sub3) this)
					  .anIntArrayArray9716[i_1922_]);
			for (int i_1924_ = 0; i_1924_ < is_1923_.length;
			     i_1924_++) {
			    int i_1925_ = is_1923_[i_1924_];
			    if (((Class89_Sub3) this).aShortArray9679 == null
				|| ((i_1853_ & (((Class89_Sub3) this)
						.aShortArray9679[i_1925_]))
				    != 0)) {
				((Class89_Sub3) this).anIntArray9670[i_1925_]
				    -= ((Class89_Sub3) this).anInt9717;
				((Class89_Sub3) this).anIntArray9685[i_1925_]
				    -= ((Class89_Sub3) this).anInt9721;
				((Class89_Sub3) this).anIntArray9684[i_1925_]
				    -= ((Class89_Sub3) this).anInt9722;
				if (i_1852_ != 0) {
				    int i_1926_
					= Class282.anIntArray4430[i_1852_];
				    int i_1927_
					= Class282.anIntArray4441[i_1852_];
				    int i_1928_
					= ((((Class89_Sub3) this)
					    .anIntArray9685[i_1925_]) * i_1926_
					   + ((((Class89_Sub3) this)
					       .anIntArray9670[i_1925_])
					      * i_1927_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9685
					[i_1925_]
					= ((((Class89_Sub3) this)
					    .anIntArray9685[i_1925_]) * i_1927_
					   - ((((Class89_Sub3) this)
					       .anIntArray9670[i_1925_])
					      * i_1926_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9670
					[i_1925_]
					= i_1928_;
				}
				if (i_1850_ != 0) {
				    int i_1929_
					= Class282.anIntArray4430[i_1850_];
				    int i_1930_
					= Class282.anIntArray4441[i_1850_];
				    int i_1931_
					= ((((Class89_Sub3) this)
					    .anIntArray9685[i_1925_]) * i_1930_
					   - ((((Class89_Sub3) this)
					       .anIntArray9684[i_1925_])
					      * i_1929_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9684
					[i_1925_]
					= ((((Class89_Sub3) this)
					    .anIntArray9685[i_1925_]) * i_1929_
					   + ((((Class89_Sub3) this)
					       .anIntArray9684[i_1925_])
					      * i_1930_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9685
					[i_1925_]
					= i_1931_;
				}
				if (i_1851_ != 0) {
				    int i_1932_
					= Class282.anIntArray4430[i_1851_];
				    int i_1933_
					= Class282.anIntArray4441[i_1851_];
				    int i_1934_
					= ((((Class89_Sub3) this)
					    .anIntArray9684[i_1925_]) * i_1932_
					   + ((((Class89_Sub3) this)
					       .anIntArray9670[i_1925_])
					      * i_1933_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9684
					[i_1925_]
					= ((((Class89_Sub3) this)
					    .anIntArray9684[i_1925_]) * i_1933_
					   - ((((Class89_Sub3) this)
					       .anIntArray9670[i_1925_])
					      * i_1932_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9670
					[i_1925_]
					= i_1934_;
				}
				((Class89_Sub3) this).anIntArray9670[i_1925_]
				    += ((Class89_Sub3) this).anInt9717;
				((Class89_Sub3) this).anIntArray9685[i_1925_]
				    += ((Class89_Sub3) this).anInt9721;
				((Class89_Sub3) this).anIntArray9684[i_1925_]
				    += ((Class89_Sub3) this).anInt9722;
			    }
			}
		    }
		}
	    }
	} else if (i == 3) {
	    if (is_1854_ != null) {
		if (!((Class89_Sub3) this).aBool9719) {
		    for (int i_1935_ = 0;
			 i_1935_ < ((Class89_Sub3) this).anInt9686;
			 i_1935_++) {
			((Class89_Sub3) this).anIntArray9670[i_1935_] <<= 4;
			((Class89_Sub3) this).anIntArray9685[i_1935_] <<= 4;
			((Class89_Sub3) this).anIntArray9684[i_1935_] <<= 4;
		    }
		    ((Class89_Sub3) this).aBool9719 = true;
		}
		int i_1936_ = is_1854_[9] << 4;
		int i_1937_ = is_1854_[10] << 4;
		int i_1938_ = is_1854_[11] << 4;
		int i_1939_ = is_1854_[12] << 4;
		int i_1940_ = is_1854_[13] << 4;
		int i_1941_ = is_1854_[14] << 4;
		if (((Class89_Sub3) this).aBool9723) {
		    int i_1942_
			= ((is_1854_[0] * ((Class89_Sub3) this).anInt9717
			    + is_1854_[3] * ((Class89_Sub3) this).anInt9721
			    + is_1854_[6] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    int i_1943_
			= ((is_1854_[1] * ((Class89_Sub3) this).anInt9717
			    + is_1854_[4] * ((Class89_Sub3) this).anInt9721
			    + is_1854_[7] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    int i_1944_
			= ((is_1854_[2] * ((Class89_Sub3) this).anInt9717
			    + is_1854_[5] * ((Class89_Sub3) this).anInt9721
			    + is_1854_[8] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    i_1942_ += i_1939_;
		    i_1943_ += i_1940_;
		    i_1944_ += i_1941_;
		    ((Class89_Sub3) this).anInt9717 = i_1942_;
		    ((Class89_Sub3) this).anInt9721 = i_1943_;
		    ((Class89_Sub3) this).anInt9722 = i_1944_;
		    ((Class89_Sub3) this).aBool9723 = false;
		}
		int i_1945_ = i_1850_ << 15 >> 7;
		int i_1946_ = i_1851_ << 15 >> 7;
		int i_1947_ = i_1852_ << 15 >> 7;
		int i_1948_
		    = i_1945_ * -((Class89_Sub3) this).anInt9717 + 8192 >> 14;
		int i_1949_
		    = i_1946_ * -((Class89_Sub3) this).anInt9721 + 8192 >> 14;
		int i_1950_
		    = i_1947_ * -((Class89_Sub3) this).anInt9722 + 8192 >> 14;
		int i_1951_ = i_1948_ + ((Class89_Sub3) this).anInt9717;
		int i_1952_ = i_1949_ + ((Class89_Sub3) this).anInt9721;
		int i_1953_ = i_1950_ + ((Class89_Sub3) this).anInt9722;
		int[] is_1954_ = new int[9];
		is_1954_[0] = i_1945_ * is_1854_[0] + 8192 >> 14;
		is_1954_[1] = i_1945_ * is_1854_[3] + 8192 >> 14;
		is_1954_[2] = i_1945_ * is_1854_[6] + 8192 >> 14;
		is_1954_[3] = i_1946_ * is_1854_[1] + 8192 >> 14;
		is_1954_[4] = i_1946_ * is_1854_[4] + 8192 >> 14;
		is_1954_[5] = i_1946_ * is_1854_[7] + 8192 >> 14;
		is_1954_[6] = i_1947_ * is_1854_[2] + 8192 >> 14;
		is_1954_[7] = i_1947_ * is_1854_[5] + 8192 >> 14;
		is_1954_[8] = i_1947_ * is_1854_[8] + 8192 >> 14;
		int i_1955_ = i_1945_ * i_1939_ + 8192 >> 14;
		int i_1956_ = i_1946_ * i_1940_ + 8192 >> 14;
		int i_1957_ = i_1947_ * i_1941_ + 8192 >> 14;
		i_1955_ += i_1951_;
		i_1956_ += i_1952_;
		i_1957_ += i_1953_;
		int[] is_1958_ = new int[9];
		for (int i_1959_ = 0; i_1959_ < 3; i_1959_++) {
		    for (int i_1960_ = 0; i_1960_ < 3; i_1960_++) {
			int i_1961_ = 0;
			for (int i_1962_ = 0; i_1962_ < 3; i_1962_++)
			    i_1961_ += (is_1854_[i_1959_ * 3 + i_1962_]
					* is_1954_[i_1960_ + i_1962_ * 3]);
			is_1958_[i_1959_ * 3 + i_1960_] = i_1961_ + 8192 >> 14;
		    }
		}
		int i_1963_ = ((is_1854_[0] * i_1955_ + is_1854_[1] * i_1956_
				+ is_1854_[2] * i_1957_ + 8192)
			       >> 14);
		int i_1964_ = ((is_1854_[3] * i_1955_ + is_1854_[4] * i_1956_
				+ is_1854_[5] * i_1957_ + 8192)
			       >> 14);
		int i_1965_ = ((is_1854_[6] * i_1955_ + is_1854_[7] * i_1956_
				+ is_1854_[8] * i_1957_ + 8192)
			       >> 14);
		i_1963_ += i_1936_;
		i_1964_ += i_1937_;
		i_1965_ += i_1938_;
		for (int i_1966_ = 0; i_1966_ < i_1855_; i_1966_++) {
		    int i_1967_ = is[i_1966_];
		    if (i_1967_
			< ((Class89_Sub3) this).anIntArrayArray9716.length) {
			int[] is_1968_ = (((Class89_Sub3) this)
					  .anIntArrayArray9716[i_1967_]);
			for (int i_1969_ = 0; i_1969_ < is_1968_.length;
			     i_1969_++) {
			    int i_1970_ = is_1968_[i_1969_];
			    if (((Class89_Sub3) this).aShortArray9679 == null
				|| ((i_1853_ & (((Class89_Sub3) this)
						.aShortArray9679[i_1970_]))
				    != 0)) {
				int i_1971_
				    = (is_1958_[0] * (((Class89_Sub3) this)
						      .anIntArray9670[i_1970_])
				       + is_1958_[1] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_1970_])
				       + is_1958_[2] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_1970_])
				       + 8192) >> 14;
				int i_1972_
				    = (is_1958_[3] * (((Class89_Sub3) this)
						      .anIntArray9670[i_1970_])
				       + is_1958_[4] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_1970_])
				       + is_1958_[5] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_1970_])
				       + 8192) >> 14;
				int i_1973_
				    = (is_1958_[6] * (((Class89_Sub3) this)
						      .anIntArray9670[i_1970_])
				       + is_1958_[7] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_1970_])
				       + is_1958_[8] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_1970_])
				       + 8192) >> 14;
				i_1971_ += i_1963_;
				i_1972_ += i_1964_;
				i_1973_ += i_1965_;
				((Class89_Sub3) this).anIntArray9670[i_1970_]
				    = i_1971_;
				((Class89_Sub3) this).anIntArray9685[i_1970_]
				    = i_1972_;
				((Class89_Sub3) this).anIntArray9684[i_1970_]
				    = i_1973_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1974_ = 0; i_1974_ < i_1855_; i_1974_++) {
		    int i_1975_ = is[i_1974_];
		    if (i_1975_
			< ((Class89_Sub3) this).anIntArrayArray9716.length) {
			int[] is_1976_ = (((Class89_Sub3) this)
					  .anIntArrayArray9716[i_1975_]);
			for (int i_1977_ = 0; i_1977_ < is_1976_.length;
			     i_1977_++) {
			    int i_1978_ = is_1976_[i_1977_];
			    if (((Class89_Sub3) this).aShortArray9679 == null
				|| ((i_1853_ & (((Class89_Sub3) this)
						.aShortArray9679[i_1978_]))
				    != 0)) {
				((Class89_Sub3) this).anIntArray9670[i_1978_]
				    -= ((Class89_Sub3) this).anInt9717;
				((Class89_Sub3) this).anIntArray9685[i_1978_]
				    -= ((Class89_Sub3) this).anInt9721;
				((Class89_Sub3) this).anIntArray9684[i_1978_]
				    -= ((Class89_Sub3) this).anInt9722;
				((Class89_Sub3) this).anIntArray9670[i_1978_]
				    = (((Class89_Sub3) this).anIntArray9670
				       [i_1978_]) * i_1850_ / 128;
				((Class89_Sub3) this).anIntArray9685[i_1978_]
				    = (((Class89_Sub3) this).anIntArray9685
				       [i_1978_]) * i_1851_ / 128;
				((Class89_Sub3) this).anIntArray9684[i_1978_]
				    = (((Class89_Sub3) this).anIntArray9684
				       [i_1978_]) * i_1852_ / 128;
				((Class89_Sub3) this).anIntArray9670[i_1978_]
				    += ((Class89_Sub3) this).anInt9717;
				((Class89_Sub3) this).anIntArray9685[i_1978_]
				    += ((Class89_Sub3) this).anInt9721;
				((Class89_Sub3) this).anIntArray9684[i_1978_]
				    += ((Class89_Sub3) this).anInt9722;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub3) this).anIntArrayArray9678 != null
		&& ((Class89_Sub3) this).aByteArray9711 != null) {
		for (int i_1979_ = 0; i_1979_ < i_1855_; i_1979_++) {
		    int i_1980_ = is[i_1979_];
		    if (i_1980_
			< ((Class89_Sub3) this).anIntArrayArray9678.length) {
			int[] is_1981_ = (((Class89_Sub3) this)
					  .anIntArrayArray9678[i_1980_]);
			for (int i_1982_ = 0; i_1982_ < is_1981_.length;
			     i_1982_++) {
			    int i_1983_ = is_1981_[i_1982_];
			    if (((Class89_Sub3) this).aShortArray9714 == null
				|| ((i_1853_ & (((Class89_Sub3) this)
						.aShortArray9714[i_1983_]))
				    != 0)) {
				int i_1984_ = (((((Class89_Sub3) this)
						 .aByteArray9711[i_1983_])
						& 0xff)
					       + i_1850_ * 8);
				if (i_1984_ < 0)
				    i_1984_ = 0;
				else if (i_1984_ > 255)
				    i_1984_ = 255;
				((Class89_Sub3) this).aByteArray9711[i_1983_]
				    = (byte) i_1984_;
			    }
			}
		    }
		}
		if (((Class89_Sub3) this).aClass187Array9727 != null) {
		    for (int i_1985_ = 0;
			 i_1985_ < ((Class89_Sub3) this).anInt9726;
			 i_1985_++) {
			Class187 class187 = (((Class89_Sub3) this)
					     .aClass187Array9727[i_1985_]);
			Class203 class203 = (((Class89_Sub3) this)
					     .aClass203Array9728[i_1985_]);
			((Class203) class203).anInt2417
			    = ((((Class203) class203).anInt2417 * -1473589757
				& 0xffffff)
			       | 255 - ((((Class89_Sub3) this).aByteArray9711
					 [(((Class187) class187).anInt2195
					   * 1571719645)])
					& 0xff) << 24) * 376097963;
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub3) this).anIntArrayArray9678 != null) {
		for (int i_1986_ = 0; i_1986_ < i_1855_; i_1986_++) {
		    int i_1987_ = is[i_1986_];
		    if (i_1987_
			< ((Class89_Sub3) this).anIntArrayArray9678.length) {
			int[] is_1988_ = (((Class89_Sub3) this)
					  .anIntArrayArray9678[i_1987_]);
			for (int i_1989_ = 0; i_1989_ < is_1988_.length;
			     i_1989_++) {
			    int i_1990_ = is_1988_[i_1989_];
			    if (((Class89_Sub3) this).aShortArray9714 == null
				|| ((i_1853_ & (((Class89_Sub3) this)
						.aShortArray9714[i_1990_]))
				    != 0)) {
				int i_1991_ = ((((Class89_Sub3) this)
						.aShortArray9713[i_1990_])
					       & 0xffff);
				int i_1992_ = i_1991_ >> 10 & 0x3f;
				int i_1993_ = i_1991_ >> 7 & 0x7;
				int i_1994_ = i_1991_ & 0x7f;
				i_1992_ = i_1992_ + i_1850_ & 0x3f;
				i_1993_ += i_1851_;
				if (i_1993_ < 0)
				    i_1993_ = 0;
				else if (i_1993_ > 7)
				    i_1993_ = 7;
				i_1994_ += i_1852_;
				if (i_1994_ < 0)
				    i_1994_ = 0;
				else if (i_1994_ > 127)
				    i_1994_ = 127;
				((Class89_Sub3) this).aShortArray9713[i_1990_]
				    = (short) (i_1992_ << 10 | i_1993_ << 7
					       | i_1994_);
			    }
			}
			((Class89_Sub3) this).aBool9718 = true;
		    }
		}
		if (((Class89_Sub3) this).aClass187Array9727 != null) {
		    for (int i_1995_ = 0;
			 i_1995_ < ((Class89_Sub3) this).anInt9726;
			 i_1995_++) {
			Class187 class187 = (((Class89_Sub3) this)
					     .aClass187Array9727[i_1995_]);
			Class203 class203 = (((Class89_Sub3) this)
					     .aClass203Array9728[i_1995_]);
			((Class203) class203).anInt2417
			    = (((((Class203) class203).anInt2417 * -1473589757
				 & ~0xffffff)
				| (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     ((((Class89_Sub3) this).aShortArray9713
				       [(((Class187) class187).anInt2195
					 * 1571719645)]) & 0xffff,
				      1315268494)) & 0xffff]) & 0xffffff)
			       * 376097963);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_1996_ = 0; i_1996_ < i_1855_; i_1996_++) {
		    int i_1997_ = is[i_1996_];
		    if (i_1997_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_1998_ = (((Class89_Sub3) this)
					  .anIntArrayArray9672[i_1997_]);
			for (int i_1999_ = 0; i_1999_ < is_1998_.length;
			     i_1999_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_1998_[i_1999_]]);
			    ((Class203) class203).anInt2423
				+= i_1850_ * -378944915;
			    ((Class203) class203).anInt2418
				+= i_1851_ * 830599387;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_2000_ = 0; i_2000_ < i_1855_; i_2000_++) {
		    int i_2001_ = is[i_2000_];
		    if (i_2001_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_2002_ = (((Class89_Sub3) this)
					  .anIntArrayArray9672[i_2001_]);
			for (int i_2003_ = 0; i_2003_ < is_2002_.length;
			     i_2003_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_2002_[i_2003_]]);
			    ((Class203) class203).aFloat2415
				= (((Class203) class203).aFloat2415
				   * (float) i_1850_ / 128.0F);
			    ((Class203) class203).aFloat2416
				= (((Class203) class203).aFloat2416
				   * (float) i_1851_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_2004_ = 0; i_2004_ < i_1855_; i_2004_++) {
		    int i_2005_ = is[i_2004_];
		    if (i_2005_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_2006_ = (((Class89_Sub3) this)
					  .anIntArrayArray9672[i_2005_]);
			for (int i_2007_ = 0; i_2007_ < is_2006_.length;
			     i_2007_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_2006_[i_2007_]]);
			    ((Class203) class203).anInt2424
				= ((((Class203) class203).anInt2424 * 360392329
				    + i_1850_)
				   & 0x3fff) * 318648249;
			}
		    }
		}
	    }
	}
    }
    
    public void method2011(Class266 class266) {
	method16049(((Class89_Sub3) this).aClass103_Sub2_9690
			.method15377(Thread.currentThread()));
	Class268 class268
	    = ((Class189) ((Class89_Sub3) this).aClass189_9671).aClass268_2225;
	class268.method5203(class266);
	if (((Class89_Sub3) this).aClass106Array9724 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub3) this).aClass106Array9724.length; i++) {
		Class106 class106
		    = ((Class89_Sub3) this).aClass106Array9724[i];
		Class106 class106_2008_ = class106;
		if (class106.aClass106_1488 != null)
		    class106_2008_ = class106.aClass106_1488;
		class106_2008_.anInt1487
		    = (int) (class268.aFloatArray4353[12]
			     + ((class268.aFloatArray4353[0]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[4]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[8]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class106.anInt1490
						* 844698029)])))) * 548844199;
		class106_2008_.anInt1495
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class106.anInt1490
						* 844698029)])))) * -237372493;
		class106_2008_.anInt1498
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class106.anInt1490
						* 844698029)])))) * 1108321407;
		class106_2008_.anInt1497
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1696685061);
		class106_2008_.anInt1496
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1783587391);
		class106_2008_.anInt1499
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -425190479);
		class106_2008_.anInt1500
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * -1671800873);
		class106_2008_.anInt1501
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 1675759173);
		class106_2008_.anInt1502
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 2116418239);
	    }
	}
	if (((Class89_Sub3) this).aClass167Array9725 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub3) this).aClass167Array9725.length; i++) {
		Class167 class167
		    = ((Class89_Sub3) this).aClass167Array9725[i];
		Class167 class167_2009_ = class167;
		if (class167.aClass167_2057 != null)
		    class167_2009_ = class167.aClass167_2057;
		if (class167.aClass268_2061 != null)
		    class167.aClass268_2061.method5199(class268);
		else
		    class167.aClass268_2061 = new Class268(class268);
		class167_2009_.anInt2060
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [class167.anInt2058 * 294413539]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class167.anInt2058
						 * 294413539)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class167.anInt2058
						 * 294413539)]))))
		       * -1901304929);
		class167_2009_.anInt2062
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class167.anInt2058
						* 294413539)])))) * -290266353;
		class167_2009_.anInt2056
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class167.anInt2058
						* 294413539)])))) * 1003150305;
	    }
	}
    }
    
    public Class241_Sub39_Sub17 method2038
	(Class241_Sub39_Sub17 class241_sub39_sub17) {
	return null;
    }
    
    final void method16118(boolean bool, boolean bool_2010_,
			   boolean bool_2011_) {
	for (int i = 0; i < ((Class89_Sub3) this).anInt9726; i++) {
	    Class187 class187 = ((Class89_Sub3) this).aClass187Array9727[i];
	    if (((Class187) class187).aBool2201) {
		Class203 class203
		    = ((Class89_Sub3) this).aClass203Array9728[i];
		((Class89_Sub3) this).aClass103_Sub2_9690.method15380
		    (bool, bool_2010_, bool_2011_,
		     ((Class203) class203).anInt2420 * -192321089,
		     ((Class203) class203).anInt2421 * -585258371,
		     ((Class203) class203).aFloat2419,
		     ((Class203) class203).anInt2422 * 1388492805,
		     ((Class203) class203).anInt2414 * 1644083687,
		     ((Class187) class187).aShort2199,
		     ((Class203) class203).anInt2417 * -1473589757,
		     ((Class187) class187).aByte2200,
		     ((Class187) class187).aByte2198);
	    }
	}
    }
    
    public void method1873() {
	if ((((Class89_Sub3) this).anInt9683 & 0x10) != 16)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9686; i++)
		((Class89_Sub3) this).anIntArray9684[i]
		    = -((Class89_Sub3) this).anIntArray9684[i];
	    if (((Class89_Sub3) this).aClass204Array9692 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9687; i++) {
		    if (((Class89_Sub3) this).aClass204Array9692[i] != null)
			((Class204)
			 ((Class89_Sub3) this).aClass204Array9692[i]).anInt2428
			    = -((Class204) (((Class89_Sub3) this)
					    .aClass204Array9692[i])).anInt2428;
		}
	    }
	    if (((Class89_Sub3) this).aClass204Array9744 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9687; i++) {
		    if (((Class89_Sub3) this).aClass204Array9744[i] != null)
			((Class204)
			 ((Class89_Sub3) this).aClass204Array9744[i]).anInt2428
			    = -((Class204) (((Class89_Sub3) this)
					    .aClass204Array9744[i])).anInt2428;
		}
	    }
	    if (((Class89_Sub3) this).aClass188Array9708 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9691; i++) {
		    if (((Class89_Sub3) this).aClass188Array9708[i] != null)
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2208
			    = -((Class188) (((Class89_Sub3) this)
					    .aClass188Array9708[i])).anInt2208;
		}
	    }
	    short[] is = ((Class89_Sub3) this).aShortArray9696;
	    ((Class89_Sub3) this).aShortArray9696
		= ((Class89_Sub3) this).aShortArray9698;
	    ((Class89_Sub3) this).aShortArray9698 = is;
	    if (((Class89_Sub3) this).aFloatArrayArray9720 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9691; i++) {
		    if (((Class89_Sub3) this).aFloatArrayArray9720[i]
			!= null) {
			float f
			    = ((Class89_Sub3) this).aFloatArrayArray9720[i][0];
			((Class89_Sub3) this).aFloatArrayArray9720[i][0]
			    = ((Class89_Sub3) this).aFloatArrayArray9720[i][2];
			((Class89_Sub3) this).aFloatArrayArray9720[i][2] = f;
		    }
		    if (((Class89_Sub3) this).aFloatArrayArray9703[i]
			!= null) {
			float f
			    = ((Class89_Sub3) this).aFloatArrayArray9703[i][0];
			((Class89_Sub3) this).aFloatArrayArray9703[i][0]
			    = ((Class89_Sub3) this).aFloatArrayArray9703[i][2];
			((Class89_Sub3) this).aFloatArrayArray9703[i][2] = f;
		    }
		}
	    }
	    ((Class89_Sub3) this).aBool9730 = false;
	    ((Class89_Sub3) this).anInt9741 = 0;
	}
    }
    
    public int method1893() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9731;
    }
    
    void method16119(Class266 class266, Class97 class97, int i) {
	if (((Class89_Sub3) this).anInt9687 >= 1) {
	    Class189 class189 = ((Class89_Sub3) this).aClass103_Sub2_9690
				    .method15377(Thread.currentThread());
	    Class268 class268 = ((Class189) class189).aClass268_2225;
	    class268.method5203(class266);
	    Class268 class268_2012_
		= (((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		   .aClass268_9279);
	    Class268 class268_2013_
		= (((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		   .aClass268_9261);
	    if (!((Class89_Sub3) this).aBool9730)
		method16077();
	    boolean bool = class268.method5221();
	    float[] fs = ((Class189) class189).aFloatArray2219;
	    class268.method5208(0.0F, (float) ((Class89_Sub3) this).aShort9733,
				0.0F, fs);
	    float f = fs[0];
	    float f_2014_ = fs[1];
	    float f_2015_ = fs[2];
	    class268.method5208(0.0F, (float) ((Class89_Sub3) this).aShort9734,
				0.0F, fs);
	    float f_2016_ = fs[0];
	    float f_2017_ = fs[1];
	    float f_2018_ = fs[2];
	    for (int i_2019_ = 0; i_2019_ < 6; i_2019_++) {
		float[] fs_2020_ = (((Class103_Sub2)
				     ((Class89_Sub3) this).aClass103_Sub2_9690)
				    .aFloatArrayArray9263[i_2019_]);
		float f_2021_ = (fs_2020_[0] * f + fs_2020_[1] * f_2014_
				 + fs_2020_[2] * f_2015_ + fs_2020_[3]
				 + (float) ((Class89_Sub3) this).aShort9731);
		float f_2022_ = (fs_2020_[0] * f_2016_ + fs_2020_[1] * f_2017_
				 + fs_2020_[2] * f_2018_ + fs_2020_[3]
				 + (float) ((Class89_Sub3) this).aShort9731);
		if (f_2021_ < 0.0F && f_2022_ < 0.0F)
		    return;
	    }
	    float f_2023_;
	    float f_2024_;
	    if (bool) {
		f_2023_ = class268_2012_.aFloatArray4353[14];
		f_2024_ = class268_2012_.aFloatArray4353[6];
	    } else {
		f_2023_ = ((class268.aFloatArray4353[12]
			    * class268_2012_.aFloatArray4353[2])
			   + (class268.aFloatArray4353[13]
			      * class268_2012_.aFloatArray4353[6])
			   + (class268.aFloatArray4353[14]
			      * class268_2012_.aFloatArray4353[10])
			   + class268_2012_.aFloatArray4353[14]);
		f_2024_ = ((class268.aFloatArray4353[4]
			    * class268_2012_.aFloatArray4353[2])
			   + (class268.aFloatArray4353[5]
			      * class268_2012_.aFloatArray4353[6])
			   + (class268.aFloatArray4353[6]
			      * class268_2012_.aFloatArray4353[10]));
	    }
	    float f_2025_
		= f_2023_ + (float) ((Class89_Sub3) this).aShort9733 * f_2024_;
	    float f_2026_
		= f_2023_ + (float) ((Class89_Sub3) this).aShort9734 * f_2024_;
	    float f_2027_
		= (f_2025_ > f_2026_
		   ? f_2025_ + (float) ((Class89_Sub3) this).aShort9731
		   : f_2026_ + (float) ((Class89_Sub3) this).aShort9731);
	    float f_2028_ = (class268_2013_.aFloatArray4353[10] * f_2027_
			     + class268_2013_.aFloatArray4353[14]);
	    if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		 .anInt9274) * 592623211
		> 1) {
		synchronized (this) {
		    while (((Class89_Sub3) this).aBool9743) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
		    }
		    ((Class89_Sub3) this).aBool9743 = true;
		}
	    }
	    method16049(class189);
	    Class268 class268_2029_
		= (((Class189) ((Class89_Sub3) this).aClass189_9671)
		   .aClass268_2226);
	    class268_2029_.method5199(class268);
	    class268_2029_.method5202(((Class103_Sub2) (((Class89_Sub3) this)
							.aClass103_Sub2_9690))
				      .aClass268_9262);
	    if ((i & 0x2) != 0)
		((Class89_Sub3) this).aClass155_9674.method3345(true);
	    else
		((Class89_Sub3) this).aClass155_9674.method3345(false);
	    boolean bool_2030_ = false;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2212
		= ((Class155) ((Class89_Sub3) this).aClass155_9674).aFloat1728;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2247
		= ((Class155) ((Class89_Sub3) this).aClass155_9674).aFloat1729;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2242
		= ((Class155) ((Class89_Sub3) this).aClass155_9674).aFloat1732;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2244
		= 1.0F / (((Class155) ((Class89_Sub3) this).aClass155_9674)
			  .aFloat1732);
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2239
		= ((Class155) ((Class89_Sub3) this).aClass155_9674).aFloat1727;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2241
		= ((Class155) ((Class89_Sub3) this).aClass155_9674).aFloat1731;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).aFloat2243
		= ((Class155) ((Class89_Sub3) this).aClass155_9674).aFloat1720;
	    ((Class189) ((Class89_Sub3) this).aClass189_9671).anInt2245
		= (((Class155) ((Class89_Sub3) this).aClass155_9674).anInt1733
		   * 798387409);
	    for (int i_2031_ = 0; i_2031_ < ((Class89_Sub3) this).anInt9686;
		 i_2031_++) {
		int i_2032_ = ((Class89_Sub3) this).anIntArray9670[i_2031_];
		int i_2033_ = ((Class89_Sub3) this).anIntArray9685[i_2031_];
		int i_2034_ = ((Class89_Sub3) this).anIntArray9684[i_2031_];
		float f_2035_
		    = (class268_2029_.aFloatArray4353[0] * (float) i_2032_
		       + class268_2029_.aFloatArray4353[4] * (float) i_2033_
		       + class268_2029_.aFloatArray4353[8] * (float) i_2034_
		       + class268_2029_.aFloatArray4353[12]);
		float f_2036_
		    = (class268_2029_.aFloatArray4353[1] * (float) i_2032_
		       + class268_2029_.aFloatArray4353[5] * (float) i_2033_
		       + class268_2029_.aFloatArray4353[9] * (float) i_2034_
		       + class268_2029_.aFloatArray4353[13]);
		float f_2037_
		    = (class268_2029_.aFloatArray4353[2] * (float) i_2032_
		       + class268_2029_.aFloatArray4353[6] * (float) i_2033_
		       + class268_2029_.aFloatArray4353[10] * (float) i_2034_
		       + class268_2029_.aFloatArray4353[14]);
		float f_2038_
		    = (class268_2029_.aFloatArray4353[3] * (float) i_2032_
		       + class268_2029_.aFloatArray4353[7] * (float) i_2033_
		       + class268_2029_.aFloatArray4353[11] * (float) i_2034_
		       + class268_2029_.aFloatArray4353[15]);
		((Class89_Sub3) this).aFloatArray9756[i_2031_]
		    = ((((Class189) ((Class89_Sub3) this).aClass189_9671)
			.aFloat2243)
		       + (((Class189) ((Class89_Sub3) this).aClass189_9671)
			  .aFloat2242) * f_2037_ / f_2038_);
		((Class89_Sub3) this).aFloatArray9700[i_2031_] = f_2038_;
		if (f_2037_ >= -f_2038_) {
		    ((Class89_Sub3) this).aFloatArray9745[i_2031_]
			= (float) (int) ((((Class189) (((Class89_Sub3) this)
						       .aClass189_9671))
					  .aFloat2239)
					 + (((Class189) (((Class89_Sub3) this)
							 .aClass189_9671))
					    .aFloat2212) * f_2035_ / f_2038_);
		    ((Class89_Sub3) this).aFloatArray9746[i_2031_]
			= (float) (int) ((((Class189) (((Class89_Sub3) this)
						       .aClass189_9671))
					  .aFloat2241)
					 + (((Class189) (((Class89_Sub3) this)
							 .aClass189_9671))
					    .aFloat2247) * f_2036_ / f_2038_);
		} else {
		    ((Class89_Sub3) this).aFloatArray9745[i_2031_] = -5000.0F;
		    bool_2030_ = true;
		}
		if (((Class189) ((Class89_Sub3) this).aClass189_9671)
		    .aBool2217)
		    ((Class89_Sub3) this).anIntArray9729[i_2031_]
			= (int) (class268.aFloatArray4353[13]
				 + ((class268.aFloatArray4353[1]
				     * (float) i_2032_)
				    + (class268.aFloatArray4353[5]
				       * (float) i_2033_)
				    + (class268.aFloatArray4353[9]
				       * (float) i_2034_)));
	    }
	    if (((Class89_Sub3) this).aClass187Array9727 != null) {
		for (int i_2039_ = 0;
		     i_2039_ < ((Class89_Sub3) this).anInt9726; i_2039_++) {
		    Class187 class187
			= ((Class89_Sub3) this).aClass187Array9727[i_2039_];
		    Class203 class203
			= ((Class89_Sub3) this).aClass203Array9728[i_2039_];
		    short i_2040_
			= (((Class89_Sub3) this).aShortArray9696
			   [((Class187) class187).anInt2195 * 1571719645]);
		    short i_2041_
			= (((Class89_Sub3) this).aShortArray9697
			   [((Class187) class187).anInt2195 * 1571719645]);
		    short i_2042_
			= (((Class89_Sub3) this).aShortArray9698
			   [((Class187) class187).anInt2195 * 1571719645]);
		    int i_2043_
			= ((((Class89_Sub3) this).anIntArray9670[i_2040_]
			    + ((Class89_Sub3) this).anIntArray9670[i_2041_]
			    + ((Class89_Sub3) this).anIntArray9670[i_2042_])
			   / 3);
		    int i_2044_
			= ((((Class89_Sub3) this).anIntArray9685[i_2040_]
			    + ((Class89_Sub3) this).anIntArray9685[i_2041_]
			    + ((Class89_Sub3) this).anIntArray9685[i_2042_])
			   / 3);
		    int i_2045_
			= ((((Class89_Sub3) this).anIntArray9684[i_2040_]
			    + ((Class89_Sub3) this).anIntArray9684[i_2041_]
			    + ((Class89_Sub3) this).anIntArray9684[i_2042_])
			   / 3);
		    float f_2046_
			= (class268_2029_.aFloatArray4353[0] * (float) i_2043_
			   + (class268_2029_.aFloatArray4353[4]
			      * (float) i_2044_)
			   + (class268_2029_.aFloatArray4353[8]
			      * (float) i_2045_)
			   + class268_2029_.aFloatArray4353[12]);
		    float f_2047_
			= (class268_2029_.aFloatArray4353[1] * (float) i_2043_
			   + (class268_2029_.aFloatArray4353[5]
			      * (float) i_2044_)
			   + (class268_2029_.aFloatArray4353[9]
			      * (float) i_2045_)
			   + class268_2029_.aFloatArray4353[13]);
		    float f_2048_
			= (class268_2029_.aFloatArray4353[2] * (float) i_2043_
			   + (class268_2029_.aFloatArray4353[6]
			      * (float) i_2044_)
			   + (class268_2029_.aFloatArray4353[10]
			      * (float) i_2045_)
			   + class268_2029_.aFloatArray4353[14]);
		    float f_2049_
			= (class268_2029_.aFloatArray4353[3] * (float) i_2043_
			   + (class268_2029_.aFloatArray4353[7]
			      * (float) i_2044_)
			   + (class268_2029_.aFloatArray4353[11]
			      * (float) i_2045_)
			   + class268_2029_.aFloatArray4353[15]);
		    f_2048_ += ((class268_2013_.aFloatArray4353[2]
				 * (float) (((Class203) class203).anInt2423
					    * 653825893))
				+ (class268_2013_.aFloatArray4353[6]
				   * (float) (((Class203) class203).anInt2418
					      * -825717933)));
		    f_2049_ += ((class268_2013_.aFloatArray4353[3]
				 * (float) (((Class203) class203).anInt2423
					    * 653825893))
				+ (class268_2013_.aFloatArray4353[7]
				   * (float) (((Class203) class203).anInt2418
					      * -825717933)));
		    if (f_2048_ > -f_2049_) {
			f_2046_
			    += ((class268_2013_.aFloatArray4353[0]
				 * (float) (((Class203) class203).anInt2423
					    * 653825893))
				+ (class268_2013_.aFloatArray4353[4]
				   * (float) (((Class203) class203).anInt2418
					      * -825717933)));
			f_2047_
			    += ((class268_2013_.aFloatArray4353[1]
				 * (float) (((Class203) class203).anInt2423
					    * 653825893))
				+ (class268_2013_.aFloatArray4353[5]
				   * (float) (((Class203) class203).anInt2418
					      * -825717933)));
			float f_2050_
			    = ((((Class103_Sub2)
				 ((Class89_Sub3) this).aClass103_Sub2_9690)
				.aFloat9277)
			       + (((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9268) * f_2046_ / f_2049_);
			float f_2051_
			    = ((((Class103_Sub2)
				 ((Class89_Sub3) this).aClass103_Sub2_9690)
				.aFloat9271)
			       + (((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9270) * f_2047_ / f_2049_);
			float f_2052_
			    = (((Class203) class203).aFloat2415
			       * (float) ((Class187) class187).aShort2196);
			float f_2053_
			    = (((Class203) class203).aFloat2416
			       * (float) ((Class187) class187).aShort2197);
			float f_2054_
			    = (f_2046_
			       + class268_2013_.aFloatArray4353[0] * f_2052_
			       + class268_2013_.aFloatArray4353[4] * f_2053_);
			float f_2055_
			    = (f_2047_
			       + class268_2013_.aFloatArray4353[1] * f_2052_
			       + class268_2013_.aFloatArray4353[5] * f_2053_);
			float f_2056_
			    = (f_2049_
			       + class268_2013_.aFloatArray4353[3] * f_2052_
			       + class268_2013_.aFloatArray4353[7] * f_2053_);
			float f_2057_
			    = ((((Class103_Sub2)
				 ((Class89_Sub3) this).aClass103_Sub2_9690)
				.aFloat9277)
			       + (((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9268) * f_2054_ / f_2056_);
			float f_2058_
			    = ((((Class103_Sub2)
				 ((Class89_Sub3) this).aClass103_Sub2_9690)
				.aFloat9271)
			       + (((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9270) * f_2055_ / f_2056_);
			((Class203) class203).anInt2420
			    = (int) f_2050_ * -831814081;
			((Class203) class203).anInt2421
			    = (int) f_2051_ * 653827797;
			((Class203) class203).aFloat2419
			    = ((((Class103_Sub2)
				 ((Class89_Sub3) this).aClass103_Sub2_9690)
				.aFloat9276)
			       + ((((Class103_Sub2)
				    ((Class89_Sub3) this).aClass103_Sub2_9690)
				   .aFloat9272)
				  * (f_2048_
				     - (class268_2013_.aFloatArray4353[10]
					* (float) ((((Class187) class187)
						    .anInt2202)
						   * 819851293)))
				  / f_2049_));
			((Class203) class203).anInt2422
			    = (int) (f_2057_ < f_2050_ ? f_2050_ - f_2057_
				     : f_2057_ - f_2050_) * 851268813;
			((Class203) class203).anInt2414
			    = (int) (f_2058_ < f_2051_ ? f_2051_ - f_2058_
				     : f_2058_ - f_2051_) * -1013364265;
		    } else {
			Class203 class203_2059_ = class203;
			((Class203) class203).anInt2414 = 0;
			((Class203) class203_2059_).anInt2422 = 0;
		    }
		}
	    }
	    if (class97 != null) {
		boolean bool_2060_ = false;
		boolean bool_2061_ = true;
		int i_2062_ = ((((Class89_Sub3) this).aShort9735
				+ ((Class89_Sub3) this).aShort9736)
			       >> 1);
		int i_2063_ = ((((Class89_Sub3) this).aShort9737
				+ ((Class89_Sub3) this).aShort9738)
			       >> 1);
		int i_2064_ = i_2062_;
		short i_2065_ = ((Class89_Sub3) this).aShort9733;
		int i_2066_ = i_2063_;
		float f_2067_
		    = (class268_2029_.aFloatArray4353[0] * (float) i_2064_
		       + class268_2029_.aFloatArray4353[4] * (float) i_2065_
		       + class268_2029_.aFloatArray4353[8] * (float) i_2066_
		       + class268_2029_.aFloatArray4353[12]);
		float f_2068_
		    = (class268_2029_.aFloatArray4353[1] * (float) i_2064_
		       + class268_2029_.aFloatArray4353[5] * (float) i_2065_
		       + class268_2029_.aFloatArray4353[9] * (float) i_2066_
		       + class268_2029_.aFloatArray4353[13]);
		float f_2069_
		    = (class268_2029_.aFloatArray4353[2] * (float) i_2064_
		       + class268_2029_.aFloatArray4353[6] * (float) i_2065_
		       + class268_2029_.aFloatArray4353[10] * (float) i_2066_
		       + class268_2029_.aFloatArray4353[14]);
		float f_2070_
		    = (class268_2029_.aFloatArray4353[3] * (float) i_2064_
		       + class268_2029_.aFloatArray4353[7] * (float) i_2065_
		       + class268_2029_.aFloatArray4353[11] * (float) i_2066_
		       + class268_2029_.aFloatArray4353[15]);
		if (f_2069_ >= -f_2070_) {
		    class97.anInt1349
			= (int) ((((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9277)
				 + (((Class103_Sub2)
				     ((Class89_Sub3) this).aClass103_Sub2_9690)
				    .aFloat9268) * f_2067_ / f_2070_);
		    class97.anInt1347
			= (int) ((((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9271)
				 + (((Class103_Sub2)
				     ((Class89_Sub3) this).aClass103_Sub2_9690)
				    .aFloat9270) * f_2068_ / f_2070_);
		} else
		    bool_2060_ = true;
		i_2064_ = i_2062_;
		i_2065_ = ((Class89_Sub3) this).aShort9734;
		i_2066_ = i_2063_;
		float f_2071_
		    = (class268_2029_.aFloatArray4353[0] * (float) i_2064_
		       + class268_2029_.aFloatArray4353[4] * (float) i_2065_
		       + class268_2029_.aFloatArray4353[8] * (float) i_2066_
		       + class268_2029_.aFloatArray4353[12]);
		float f_2072_
		    = (class268_2029_.aFloatArray4353[1] * (float) i_2064_
		       + class268_2029_.aFloatArray4353[5] * (float) i_2065_
		       + class268_2029_.aFloatArray4353[9] * (float) i_2066_
		       + class268_2029_.aFloatArray4353[13]);
		float f_2073_
		    = (class268_2029_.aFloatArray4353[2] * (float) i_2064_
		       + class268_2029_.aFloatArray4353[6] * (float) i_2065_
		       + class268_2029_.aFloatArray4353[10] * (float) i_2066_
		       + class268_2029_.aFloatArray4353[14]);
		float f_2074_
		    = (class268_2029_.aFloatArray4353[3] * (float) i_2064_
		       + class268_2029_.aFloatArray4353[7] * (float) i_2065_
		       + class268_2029_.aFloatArray4353[11] * (float) i_2066_
		       + class268_2029_.aFloatArray4353[15]);
		if (f_2073_ >= -f_2074_) {
		    class97.anInt1350
			= (int) ((((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9277)
				 + (((Class103_Sub2)
				     ((Class89_Sub3) this).aClass103_Sub2_9690)
				    .aFloat9268) * f_2071_ / f_2074_);
		    class97.anInt1351
			= (int) ((((Class103_Sub2)
				   ((Class89_Sub3) this).aClass103_Sub2_9690)
				  .aFloat9271)
				 + (((Class103_Sub2)
				     ((Class89_Sub3) this).aClass103_Sub2_9690)
				    .aFloat9270) * f_2072_ / f_2074_);
		} else
		    bool_2060_ = true;
		if (bool_2060_) {
		    if (f_2069_ < -f_2070_ && f_2073_ < -f_2074_)
			bool_2061_ = false;
		    else if (f_2069_ < -f_2070_) {
			float f_2075_
			    = (f_2069_ + f_2070_) / (f_2073_ + f_2074_) - 1.0F;
			float f_2076_
			    = f_2067_ + f_2075_ * (f_2071_ - f_2067_);
			float f_2077_
			    = f_2068_ + f_2075_ * (f_2072_ - f_2068_);
			float f_2078_
			    = f_2070_ + f_2075_ * (f_2074_ - f_2070_);
			class97.anInt1349
			    = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
							.aClass103_Sub2_9690))
				      .aFloat9277)
				     + (((Class103_Sub2)
					 (((Class89_Sub3) this)
					  .aClass103_Sub2_9690)).aFloat9268
					* f_2076_ / f_2078_));
			class97.anInt1347
			    = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
							.aClass103_Sub2_9690))
				      .aFloat9271)
				     + (((Class103_Sub2)
					 (((Class89_Sub3) this)
					  .aClass103_Sub2_9690)).aFloat9270
					* f_2077_ / f_2078_));
		    } else if (f_2073_ < -f_2074_) {
			float f_2079_
			    = (f_2073_ + f_2074_) / (f_2069_ + f_2070_) - 1.0F;
			float f_2080_
			    = f_2071_ + f_2079_ * (f_2067_ - f_2071_);
			float f_2081_
			    = f_2072_ + f_2079_ * (f_2068_ - f_2072_);
			float f_2082_
			    = f_2074_ + f_2079_ * (f_2070_ - f_2074_);
			class97.anInt1350
			    = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
							.aClass103_Sub2_9690))
				      .aFloat9277)
				     + (((Class103_Sub2)
					 (((Class89_Sub3) this)
					  .aClass103_Sub2_9690)).aFloat9268
					* f_2080_ / f_2082_));
			class97.anInt1351
			    = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
							.aClass103_Sub2_9690))
				      .aFloat9271)
				     + (((Class103_Sub2)
					 (((Class89_Sub3) this)
					  .aClass103_Sub2_9690)).aFloat9270
					* f_2081_ / f_2082_));
		    }
		}
		if (bool_2061_) {
		    if (f_2069_ / f_2070_ > f_2073_ / f_2074_) {
			float f_2083_
			    = (f_2067_
			       + (class268_2013_.aFloatArray4353[0]
				  * (float) ((Class89_Sub3) this).aShort9731)
			       + class268_2013_.aFloatArray4353[12]);
			float f_2084_
			    = (f_2070_
			       + (class268_2013_.aFloatArray4353[3]
				  * (float) ((Class89_Sub3) this).aShort9731)
			       + class268_2013_.aFloatArray4353[15]);
			class97.anInt1348
			    = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
							.aClass103_Sub2_9690))
				      .aFloat9277)
				     - (float) class97.anInt1349
				     + (((Class103_Sub2)
					 (((Class89_Sub3) this)
					  .aClass103_Sub2_9690)).aFloat9268
					* f_2083_ / f_2084_));
		    } else {
			float f_2085_
			    = (f_2071_
			       + (class268_2013_.aFloatArray4353[0]
				  * (float) ((Class89_Sub3) this).aShort9731)
			       + class268_2013_.aFloatArray4353[12]);
			float f_2086_
			    = (f_2074_
			       + (class268_2013_.aFloatArray4353[3]
				  * (float) ((Class89_Sub3) this).aShort9731)
			       + class268_2013_.aFloatArray4353[15]);
			class97.anInt1348
			    = (int) ((((Class103_Sub2) (((Class89_Sub3) this)
							.aClass103_Sub2_9690))
				      .aFloat9277)
				     - (float) class97.anInt1350
				     + (((Class103_Sub2)
					 (((Class89_Sub3) this)
					  .aClass103_Sub2_9690)).aFloat9268
					* f_2085_ / f_2086_));
		    }
		    class97.aBool1352 = true;
		}
	    }
	    method16117(true);
	    ((Class155) ((Class89_Sub3) this).aClass155_9674).aBool1721
		= (i & 0x1) == 0;
	    ((Class155) ((Class89_Sub3) this).aClass155_9674).aBool1722
		= false;
	    try {
		method16068((((Class103_Sub2)
			      ((Class89_Sub3) this).aClass103_Sub2_9690)
			     .anIntArray9245) != null,
			    (((Class103_Sub2)
			      ((Class89_Sub3) this).aClass103_Sub2_9690)
			     .aFloatArray9248) != null,
			    (i & 0x4) != 0, bool_2030_,
			    ((((Class189)
			       ((Class89_Sub3) this).aClass189_9671).aBool2209
			      && f_2028_ > (((Class189) (((Class89_Sub3) this)
							 .aClass189_9671))
					    .aFloat2213))
			     || ((Class189) (((Class89_Sub3) this)
					     .aClass189_9671)).aBool2217));
	    } catch (Exception exception) {
		/* empty */
	    }
	    if (((Class89_Sub3) this).aClass187Array9727 != null) {
		for (int i_2087_ = 0;
		     i_2087_ < ((Class89_Sub3) this).anInt9691; i_2087_++)
		    ((Class89_Sub3) this).anIntArray9675[i_2087_] = -1;
	    }
	    ((Class89_Sub3) this).aClass155_9674 = null;
	    if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		 .anInt9274) * 592623211
		> 1) {
		synchronized (this) {
		    ((Class89_Sub3) this).aBool9743 = false;
		    this.notifyAll();
		}
	    }
	}
    }
    
    final void method16120(boolean bool, boolean bool_2088_,
			   boolean bool_2089_, boolean bool_2090_,
			   boolean bool_2091_) {
	if (((Class89_Sub3) this).aClass187Array9727 != null) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9726; i++) {
		Class187 class187
		    = ((Class89_Sub3) this).aClass187Array9727[i];
		((Class89_Sub3) this).anIntArray9675
		    [((Class187) class187).anInt2195 * 1571719645]
		    = i;
	    }
	}
	if (((Class89_Sub3) this).aBool9748
	    || ((Class89_Sub3) this).aClass187Array9727 != null) {
	    if ((((Class89_Sub3) this).anInt9683 & 0x100) == 0
		&& ((Class89_Sub3) this).aShortArray9701 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9695; i++) {
		    short i_2092_ = ((Class89_Sub3) this).aShortArray9701[i];
		    method16087(bool, bool_2088_, bool_2089_, i_2092_,
				bool_2090_, bool_2091_);
		}
	    } else {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9695; i++) {
		    if (!method16070(i) && !method16071(i))
			method16087(bool, bool_2088_, bool_2089_, i,
				    bool_2090_, bool_2091_);
		}
		if (((Class89_Sub3) this).aByteArray9702 == null) {
		    for (int i = 0; i < ((Class89_Sub3) this).anInt9695; i++) {
			if (method16070(i) || method16071(i))
			    method16087(bool, bool_2088_, bool_2089_, i,
					bool_2090_, bool_2091_);
		    }
		} else {
		    for (int i = 0; i < 12; i++) {
			for (int i_2093_ = 0;
			     i_2093_ < ((Class89_Sub3) this).anInt9695;
			     i_2093_++) {
			    if ((((Class89_Sub3) this).aByteArray9702[i_2093_]
				 == i)
				&& (method16070(i_2093_)
				    || method16071(i_2093_)))
				method16087(bool, bool_2088_, bool_2089_,
					    i_2093_, bool_2090_, bool_2091_);
			}
		    }
		}
	    }
	    if (((Class89_Sub3) this).aClass187Array9727 != null)
		method16069(bool, bool_2088_, bool_2089_);
	} else {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9695; i++)
		method16087(bool, bool_2088_, bool_2089_, i, bool_2090_,
			    bool_2091_);
	}
    }
    
    final void method16121(boolean bool, boolean bool_2094_,
			   boolean bool_2095_) {
	for (int i = 0; i < ((Class89_Sub3) this).anInt9726; i++) {
	    Class187 class187 = ((Class89_Sub3) this).aClass187Array9727[i];
	    if (((Class187) class187).aBool2201) {
		Class203 class203
		    = ((Class89_Sub3) this).aClass203Array9728[i];
		((Class89_Sub3) this).aClass103_Sub2_9690.method15380
		    (bool, bool_2094_, bool_2095_,
		     ((Class203) class203).anInt2420 * -192321089,
		     ((Class203) class203).anInt2421 * -585258371,
		     ((Class203) class203).aFloat2419,
		     ((Class203) class203).anInt2422 * 1388492805,
		     ((Class203) class203).anInt2414 * 1644083687,
		     ((Class187) class187).aShort2199,
		     ((Class203) class203).anInt2417 * -1473589757,
		     ((Class187) class187).aByte2200,
		     ((Class187) class187).aByte2198);
	    }
	}
    }
    
    final void method16122(boolean bool, boolean bool_2096_,
			   boolean bool_2097_) {
	for (int i = 0; i < ((Class89_Sub3) this).anInt9726; i++) {
	    Class187 class187 = ((Class89_Sub3) this).aClass187Array9727[i];
	    if (((Class187) class187).aBool2201) {
		Class203 class203
		    = ((Class89_Sub3) this).aClass203Array9728[i];
		((Class89_Sub3) this).aClass103_Sub2_9690.method15380
		    (bool, bool_2096_, bool_2097_,
		     ((Class203) class203).anInt2420 * -192321089,
		     ((Class203) class203).anInt2421 * -585258371,
		     ((Class203) class203).aFloat2419,
		     ((Class203) class203).anInt2422 * 1388492805,
		     ((Class203) class203).anInt2414 * 1644083687,
		     ((Class187) class187).aShort2199,
		     ((Class203) class203).anInt2417 * -1473589757,
		     ((Class187) class187).aByte2200,
		     ((Class187) class187).aByte2198);
	    }
	}
    }
    
    Class89_Sub3(Class103_Sub2 class103_sub2) {
	((Class89_Sub3) this).anInt9686 = 0;
	((Class89_Sub3) this).anInt9687 = 0;
	((Class89_Sub3) this).anInt9691 = 0;
	((Class89_Sub3) this).anInt9695 = 0;
	((Class89_Sub3) this).anInt9741 = 0;
	((Class89_Sub3) this).aBool9719 = false;
	((Class89_Sub3) this).aBool9723 = false;
	((Class89_Sub3) this).aBool9730 = false;
	((Class89_Sub3) this).aBool9739 = false;
	((Class89_Sub3) this).aBool9748 = false;
	((Class89_Sub3) this).aBool9688 = false;
	((Class89_Sub3) this).aClass103_Sub2_9690 = class103_sub2;
    }
    
    void method16123() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9687; i++) {
		((Class89_Sub3) this).anIntArray9670[i]
		    = -((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = -((Class89_Sub3) this).anIntArray9684[i];
		if (((Class89_Sub3) this).aClass204Array9692[i] != null) {
		    ((Class204) ((Class89_Sub3) this).aClass204Array9692[i])
			.anInt2429
			= -((Class204) (((Class89_Sub3) this)
					.aClass204Array9692[i])).anInt2429;
		    ((Class204) ((Class89_Sub3) this).aClass204Array9692[i])
			.anInt2428
			= -((Class204) (((Class89_Sub3) this)
					.aClass204Array9692[i])).anInt2428;
		}
	    }
	    if (((Class89_Sub3) this).aClass188Array9708 != null) {
		for (int i = 0; i < ((Class89_Sub3) this).anInt9691; i++) {
		    if (((Class89_Sub3) this).aClass188Array9708[i] != null) {
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2206
			    = -((Class188) (((Class89_Sub3) this)
					    .aClass188Array9708[i])).anInt2206;
			((Class188)
			 ((Class89_Sub3) this).aClass188Array9708[i]).anInt2208
			    = -((Class188) (((Class89_Sub3) this)
					    .aClass188Array9708[i])).anInt2208;
		    }
		}
	    }
	    for (int i = ((Class89_Sub3) this).anInt9687;
		 i < ((Class89_Sub3) this).anInt9686; i++) {
		((Class89_Sub3) this).anIntArray9670[i]
		    = -((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = -((Class89_Sub3) this).anIntArray9684[i];
	    }
	    ((Class89_Sub3) this).anInt9741 = 0;
	    ((Class89_Sub3) this).aBool9730 = false;
	}
    }
    
    void method1872(int i, int[] is, int i_2098_, int i_2099_, int i_2100_,
		    boolean bool, int i_2101_, int[] is_2102_) {
	int i_2103_ = is.length;
	if (i == 0) {
	    i_2098_ <<= 4;
	    i_2099_ <<= 4;
	    i_2100_ <<= 4;
	    if (!((Class89_Sub3) this).aBool9719) {
		for (int i_2104_ = 0;
		     i_2104_ < ((Class89_Sub3) this).anInt9686; i_2104_++) {
		    ((Class89_Sub3) this).anIntArray9670[i_2104_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9685[i_2104_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9684[i_2104_] <<= 4;
		}
		((Class89_Sub3) this).aBool9719 = true;
	    }
	    int i_2105_ = 0;
	    ((Class89_Sub3) this).anInt9717 = 0;
	    ((Class89_Sub3) this).anInt9721 = 0;
	    ((Class89_Sub3) this).anInt9722 = 0;
	    for (int i_2106_ = 0; i_2106_ < i_2103_; i_2106_++) {
		int i_2107_ = is[i_2106_];
		if (i_2107_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_2108_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_2107_];
		    for (int i_2109_ = 0; i_2109_ < is_2108_.length;
			 i_2109_++) {
			int i_2110_ = is_2108_[i_2109_];
			if (((Class89_Sub3) this).aShortArray9679 == null
			    || (i_2101_ & (((Class89_Sub3) this)
					   .aShortArray9679[i_2110_])) != 0) {
			    ((Class89_Sub3) this).anInt9717
				+= (((Class89_Sub3) this).anIntArray9670
				    [i_2110_]);
			    ((Class89_Sub3) this).anInt9721
				+= (((Class89_Sub3) this).anIntArray9685
				    [i_2110_]);
			    ((Class89_Sub3) this).anInt9722
				+= (((Class89_Sub3) this).anIntArray9684
				    [i_2110_]);
			    i_2105_++;
			}
		    }
		}
	    }
	    if (i_2105_ > 0) {
		((Class89_Sub3) this).anInt9717
		    = ((Class89_Sub3) this).anInt9717 / i_2105_ + i_2098_;
		((Class89_Sub3) this).anInt9721
		    = ((Class89_Sub3) this).anInt9721 / i_2105_ + i_2099_;
		((Class89_Sub3) this).anInt9722
		    = ((Class89_Sub3) this).anInt9722 / i_2105_ + i_2100_;
		((Class89_Sub3) this).aBool9723 = true;
	    } else {
		((Class89_Sub3) this).anInt9717 = i_2098_;
		((Class89_Sub3) this).anInt9721 = i_2099_;
		((Class89_Sub3) this).anInt9722 = i_2100_;
	    }
	} else if (i == 1) {
	    if (is_2102_ != null) {
		int i_2111_ = ((is_2102_[0] * i_2098_ + is_2102_[1] * i_2099_
				+ is_2102_[2] * i_2100_ + 8192)
			       >> 14);
		int i_2112_ = ((is_2102_[3] * i_2098_ + is_2102_[4] * i_2099_
				+ is_2102_[5] * i_2100_ + 8192)
			       >> 14);
		int i_2113_ = ((is_2102_[6] * i_2098_ + is_2102_[7] * i_2099_
				+ is_2102_[8] * i_2100_ + 8192)
			       >> 14);
		i_2098_ = i_2111_;
		i_2099_ = i_2112_;
		i_2100_ = i_2113_;
	    }
	    i_2098_ <<= 4;
	    i_2099_ <<= 4;
	    i_2100_ <<= 4;
	    if (!((Class89_Sub3) this).aBool9719) {
		for (int i_2114_ = 0;
		     i_2114_ < ((Class89_Sub3) this).anInt9686; i_2114_++) {
		    ((Class89_Sub3) this).anIntArray9670[i_2114_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9685[i_2114_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9684[i_2114_] <<= 4;
		}
		((Class89_Sub3) this).aBool9719 = true;
	    }
	    for (int i_2115_ = 0; i_2115_ < i_2103_; i_2115_++) {
		int i_2116_ = is[i_2115_];
		if (i_2116_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_2117_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_2116_];
		    for (int i_2118_ = 0; i_2118_ < is_2117_.length;
			 i_2118_++) {
			int i_2119_ = is_2117_[i_2118_];
			if (((Class89_Sub3) this).aShortArray9679 == null
			    || (i_2101_ & (((Class89_Sub3) this)
					   .aShortArray9679[i_2119_])) != 0) {
			    ((Class89_Sub3) this).anIntArray9670[i_2119_]
				+= i_2098_;
			    ((Class89_Sub3) this).anIntArray9685[i_2119_]
				+= i_2099_;
			    ((Class89_Sub3) this).anIntArray9684[i_2119_]
				+= i_2100_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_2102_ != null) {
		if (!((Class89_Sub3) this).aBool9719) {
		    for (int i_2120_ = 0;
			 i_2120_ < ((Class89_Sub3) this).anInt9686;
			 i_2120_++) {
			((Class89_Sub3) this).anIntArray9670[i_2120_] <<= 4;
			((Class89_Sub3) this).anIntArray9685[i_2120_] <<= 4;
			((Class89_Sub3) this).anIntArray9684[i_2120_] <<= 4;
		    }
		    ((Class89_Sub3) this).aBool9719 = true;
		}
		int i_2121_ = is_2102_[9] << 4;
		int i_2122_ = is_2102_[10] << 4;
		int i_2123_ = is_2102_[11] << 4;
		int i_2124_ = is_2102_[12] << 4;
		int i_2125_ = is_2102_[13] << 4;
		int i_2126_ = is_2102_[14] << 4;
		if (((Class89_Sub3) this).aBool9723) {
		    int i_2127_
			= ((is_2102_[0] * ((Class89_Sub3) this).anInt9717
			    + is_2102_[3] * ((Class89_Sub3) this).anInt9721
			    + is_2102_[6] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    int i_2128_
			= ((is_2102_[1] * ((Class89_Sub3) this).anInt9717
			    + is_2102_[4] * ((Class89_Sub3) this).anInt9721
			    + is_2102_[7] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    int i_2129_
			= ((is_2102_[2] * ((Class89_Sub3) this).anInt9717
			    + is_2102_[5] * ((Class89_Sub3) this).anInt9721
			    + is_2102_[8] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    i_2127_ += i_2124_;
		    i_2128_ += i_2125_;
		    i_2129_ += i_2126_;
		    ((Class89_Sub3) this).anInt9717 = i_2127_;
		    ((Class89_Sub3) this).anInt9721 = i_2128_;
		    ((Class89_Sub3) this).anInt9722 = i_2129_;
		    ((Class89_Sub3) this).aBool9723 = false;
		}
		int[] is_2130_ = new int[9];
		int i_2131_ = Class282.anIntArray4441[i_2098_];
		int i_2132_ = Class282.anIntArray4430[i_2098_];
		int i_2133_ = Class282.anIntArray4441[i_2099_];
		int i_2134_ = Class282.anIntArray4430[i_2099_];
		int i_2135_ = Class282.anIntArray4441[i_2100_];
		int i_2136_ = Class282.anIntArray4430[i_2100_];
		int i_2137_ = i_2132_ * i_2135_ + 8192 >> 14;
		int i_2138_ = i_2132_ * i_2136_ + 8192 >> 14;
		is_2130_[0]
		    = i_2133_ * i_2135_ + i_2134_ * i_2138_ + 8192 >> 14;
		is_2130_[1]
		    = -i_2133_ * i_2136_ + i_2134_ * i_2137_ + 8192 >> 14;
		is_2130_[2] = i_2134_ * i_2131_ + 8192 >> 14;
		is_2130_[3] = i_2131_ * i_2136_ + 8192 >> 14;
		is_2130_[4] = i_2131_ * i_2135_ + 8192 >> 14;
		is_2130_[5] = -i_2132_;
		is_2130_[6]
		    = -i_2134_ * i_2135_ + i_2133_ * i_2138_ + 8192 >> 14;
		is_2130_[7]
		    = i_2134_ * i_2136_ + i_2133_ * i_2137_ + 8192 >> 14;
		is_2130_[8] = i_2133_ * i_2131_ + 8192 >> 14;
		int i_2139_ = (is_2130_[0] * -((Class89_Sub3) this).anInt9717
			       + is_2130_[1] * -((Class89_Sub3) this).anInt9721
			       + is_2130_[2] * -((Class89_Sub3) this).anInt9722
			       + 8192) >> 14;
		int i_2140_ = (is_2130_[3] * -((Class89_Sub3) this).anInt9717
			       + is_2130_[4] * -((Class89_Sub3) this).anInt9721
			       + is_2130_[5] * -((Class89_Sub3) this).anInt9722
			       + 8192) >> 14;
		int i_2141_ = (is_2130_[6] * -((Class89_Sub3) this).anInt9717
			       + is_2130_[7] * -((Class89_Sub3) this).anInt9721
			       + is_2130_[8] * -((Class89_Sub3) this).anInt9722
			       + 8192) >> 14;
		int i_2142_ = i_2139_ + ((Class89_Sub3) this).anInt9717;
		int i_2143_ = i_2140_ + ((Class89_Sub3) this).anInt9721;
		int i_2144_ = i_2141_ + ((Class89_Sub3) this).anInt9722;
		int[] is_2145_ = new int[9];
		for (int i_2146_ = 0; i_2146_ < 3; i_2146_++) {
		    for (int i_2147_ = 0; i_2147_ < 3; i_2147_++) {
			int i_2148_ = 0;
			for (int i_2149_ = 0; i_2149_ < 3; i_2149_++)
			    i_2148_ += (is_2130_[i_2146_ * 3 + i_2149_]
					* is_2102_[i_2147_ * 3 + i_2149_]);
			is_2145_[i_2146_ * 3 + i_2147_] = i_2148_ + 8192 >> 14;
		    }
		}
		int i_2150_ = ((is_2130_[0] * i_2124_ + is_2130_[1] * i_2125_
				+ is_2130_[2] * i_2126_ + 8192)
			       >> 14);
		int i_2151_ = ((is_2130_[3] * i_2124_ + is_2130_[4] * i_2125_
				+ is_2130_[5] * i_2126_ + 8192)
			       >> 14);
		int i_2152_ = ((is_2130_[6] * i_2124_ + is_2130_[7] * i_2125_
				+ is_2130_[8] * i_2126_ + 8192)
			       >> 14);
		i_2150_ += i_2142_;
		i_2151_ += i_2143_;
		i_2152_ += i_2144_;
		int[] is_2153_ = new int[9];
		for (int i_2154_ = 0; i_2154_ < 3; i_2154_++) {
		    for (int i_2155_ = 0; i_2155_ < 3; i_2155_++) {
			int i_2156_ = 0;
			for (int i_2157_ = 0; i_2157_ < 3; i_2157_++)
			    i_2156_ += (is_2102_[i_2154_ * 3 + i_2157_]
					* is_2145_[i_2155_ + i_2157_ * 3]);
			is_2153_[i_2154_ * 3 + i_2155_] = i_2156_ + 8192 >> 14;
		    }
		}
		int i_2158_ = ((is_2102_[0] * i_2150_ + is_2102_[1] * i_2151_
				+ is_2102_[2] * i_2152_ + 8192)
			       >> 14);
		int i_2159_ = ((is_2102_[3] * i_2150_ + is_2102_[4] * i_2151_
				+ is_2102_[5] * i_2152_ + 8192)
			       >> 14);
		int i_2160_ = ((is_2102_[6] * i_2150_ + is_2102_[7] * i_2151_
				+ is_2102_[8] * i_2152_ + 8192)
			       >> 14);
		i_2158_ += i_2121_;
		i_2159_ += i_2122_;
		i_2160_ += i_2123_;
		for (int i_2161_ = 0; i_2161_ < i_2103_; i_2161_++) {
		    int i_2162_ = is[i_2161_];
		    if (i_2162_
			< ((Class89_Sub3) this).anIntArrayArray9716.length) {
			int[] is_2163_ = (((Class89_Sub3) this)
					  .anIntArrayArray9716[i_2162_]);
			for (int i_2164_ = 0; i_2164_ < is_2163_.length;
			     i_2164_++) {
			    int i_2165_ = is_2163_[i_2164_];
			    if (((Class89_Sub3) this).aShortArray9679 == null
				|| ((i_2101_ & (((Class89_Sub3) this)
						.aShortArray9679[i_2165_]))
				    != 0)) {
				int i_2166_
				    = (is_2153_[0] * (((Class89_Sub3) this)
						      .anIntArray9670[i_2165_])
				       + is_2153_[1] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_2165_])
				       + is_2153_[2] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_2165_])
				       + 8192) >> 14;
				int i_2167_
				    = (is_2153_[3] * (((Class89_Sub3) this)
						      .anIntArray9670[i_2165_])
				       + is_2153_[4] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_2165_])
				       + is_2153_[5] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_2165_])
				       + 8192) >> 14;
				int i_2168_
				    = (is_2153_[6] * (((Class89_Sub3) this)
						      .anIntArray9670[i_2165_])
				       + is_2153_[7] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_2165_])
				       + is_2153_[8] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_2165_])
				       + 8192) >> 14;
				i_2166_ += i_2158_;
				i_2167_ += i_2159_;
				i_2168_ += i_2160_;
				((Class89_Sub3) this).anIntArray9670[i_2165_]
				    = i_2166_;
				((Class89_Sub3) this).anIntArray9685[i_2165_]
				    = i_2167_;
				((Class89_Sub3) this).anIntArray9684[i_2165_]
				    = i_2168_;
			    }
			}
		    }
		}
	    } else {
		for (int i_2169_ = 0; i_2169_ < i_2103_; i_2169_++) {
		    int i_2170_ = is[i_2169_];
		    if (i_2170_
			< ((Class89_Sub3) this).anIntArrayArray9716.length) {
			int[] is_2171_ = (((Class89_Sub3) this)
					  .anIntArrayArray9716[i_2170_]);
			for (int i_2172_ = 0; i_2172_ < is_2171_.length;
			     i_2172_++) {
			    int i_2173_ = is_2171_[i_2172_];
			    if (((Class89_Sub3) this).aShortArray9679 == null
				|| ((i_2101_ & (((Class89_Sub3) this)
						.aShortArray9679[i_2173_]))
				    != 0)) {
				((Class89_Sub3) this).anIntArray9670[i_2173_]
				    -= ((Class89_Sub3) this).anInt9717;
				((Class89_Sub3) this).anIntArray9685[i_2173_]
				    -= ((Class89_Sub3) this).anInt9721;
				((Class89_Sub3) this).anIntArray9684[i_2173_]
				    -= ((Class89_Sub3) this).anInt9722;
				if (i_2100_ != 0) {
				    int i_2174_
					= Class282.anIntArray4430[i_2100_];
				    int i_2175_
					= Class282.anIntArray4441[i_2100_];
				    int i_2176_
					= ((((Class89_Sub3) this)
					    .anIntArray9685[i_2173_]) * i_2174_
					   + ((((Class89_Sub3) this)
					       .anIntArray9670[i_2173_])
					      * i_2175_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9685
					[i_2173_]
					= ((((Class89_Sub3) this)
					    .anIntArray9685[i_2173_]) * i_2175_
					   - ((((Class89_Sub3) this)
					       .anIntArray9670[i_2173_])
					      * i_2174_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9670
					[i_2173_]
					= i_2176_;
				}
				if (i_2098_ != 0) {
				    int i_2177_
					= Class282.anIntArray4430[i_2098_];
				    int i_2178_
					= Class282.anIntArray4441[i_2098_];
				    int i_2179_
					= ((((Class89_Sub3) this)
					    .anIntArray9685[i_2173_]) * i_2178_
					   - ((((Class89_Sub3) this)
					       .anIntArray9684[i_2173_])
					      * i_2177_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9684
					[i_2173_]
					= ((((Class89_Sub3) this)
					    .anIntArray9685[i_2173_]) * i_2177_
					   + ((((Class89_Sub3) this)
					       .anIntArray9684[i_2173_])
					      * i_2178_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9685
					[i_2173_]
					= i_2179_;
				}
				if (i_2099_ != 0) {
				    int i_2180_
					= Class282.anIntArray4430[i_2099_];
				    int i_2181_
					= Class282.anIntArray4441[i_2099_];
				    int i_2182_
					= ((((Class89_Sub3) this)
					    .anIntArray9684[i_2173_]) * i_2180_
					   + ((((Class89_Sub3) this)
					       .anIntArray9670[i_2173_])
					      * i_2181_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9684
					[i_2173_]
					= ((((Class89_Sub3) this)
					    .anIntArray9684[i_2173_]) * i_2181_
					   - ((((Class89_Sub3) this)
					       .anIntArray9670[i_2173_])
					      * i_2180_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9670
					[i_2173_]
					= i_2182_;
				}
				((Class89_Sub3) this).anIntArray9670[i_2173_]
				    += ((Class89_Sub3) this).anInt9717;
				((Class89_Sub3) this).anIntArray9685[i_2173_]
				    += ((Class89_Sub3) this).anInt9721;
				((Class89_Sub3) this).anIntArray9684[i_2173_]
				    += ((Class89_Sub3) this).anInt9722;
			    }
			}
		    }
		}
	    }
	} else if (i == 3) {
	    if (is_2102_ != null) {
		if (!((Class89_Sub3) this).aBool9719) {
		    for (int i_2183_ = 0;
			 i_2183_ < ((Class89_Sub3) this).anInt9686;
			 i_2183_++) {
			((Class89_Sub3) this).anIntArray9670[i_2183_] <<= 4;
			((Class89_Sub3) this).anIntArray9685[i_2183_] <<= 4;
			((Class89_Sub3) this).anIntArray9684[i_2183_] <<= 4;
		    }
		    ((Class89_Sub3) this).aBool9719 = true;
		}
		int i_2184_ = is_2102_[9] << 4;
		int i_2185_ = is_2102_[10] << 4;
		int i_2186_ = is_2102_[11] << 4;
		int i_2187_ = is_2102_[12] << 4;
		int i_2188_ = is_2102_[13] << 4;
		int i_2189_ = is_2102_[14] << 4;
		if (((Class89_Sub3) this).aBool9723) {
		    int i_2190_
			= ((is_2102_[0] * ((Class89_Sub3) this).anInt9717
			    + is_2102_[3] * ((Class89_Sub3) this).anInt9721
			    + is_2102_[6] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    int i_2191_
			= ((is_2102_[1] * ((Class89_Sub3) this).anInt9717
			    + is_2102_[4] * ((Class89_Sub3) this).anInt9721
			    + is_2102_[7] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    int i_2192_
			= ((is_2102_[2] * ((Class89_Sub3) this).anInt9717
			    + is_2102_[5] * ((Class89_Sub3) this).anInt9721
			    + is_2102_[8] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    i_2190_ += i_2187_;
		    i_2191_ += i_2188_;
		    i_2192_ += i_2189_;
		    ((Class89_Sub3) this).anInt9717 = i_2190_;
		    ((Class89_Sub3) this).anInt9721 = i_2191_;
		    ((Class89_Sub3) this).anInt9722 = i_2192_;
		    ((Class89_Sub3) this).aBool9723 = false;
		}
		int i_2193_ = i_2098_ << 15 >> 7;
		int i_2194_ = i_2099_ << 15 >> 7;
		int i_2195_ = i_2100_ << 15 >> 7;
		int i_2196_
		    = i_2193_ * -((Class89_Sub3) this).anInt9717 + 8192 >> 14;
		int i_2197_
		    = i_2194_ * -((Class89_Sub3) this).anInt9721 + 8192 >> 14;
		int i_2198_
		    = i_2195_ * -((Class89_Sub3) this).anInt9722 + 8192 >> 14;
		int i_2199_ = i_2196_ + ((Class89_Sub3) this).anInt9717;
		int i_2200_ = i_2197_ + ((Class89_Sub3) this).anInt9721;
		int i_2201_ = i_2198_ + ((Class89_Sub3) this).anInt9722;
		int[] is_2202_ = new int[9];
		is_2202_[0] = i_2193_ * is_2102_[0] + 8192 >> 14;
		is_2202_[1] = i_2193_ * is_2102_[3] + 8192 >> 14;
		is_2202_[2] = i_2193_ * is_2102_[6] + 8192 >> 14;
		is_2202_[3] = i_2194_ * is_2102_[1] + 8192 >> 14;
		is_2202_[4] = i_2194_ * is_2102_[4] + 8192 >> 14;
		is_2202_[5] = i_2194_ * is_2102_[7] + 8192 >> 14;
		is_2202_[6] = i_2195_ * is_2102_[2] + 8192 >> 14;
		is_2202_[7] = i_2195_ * is_2102_[5] + 8192 >> 14;
		is_2202_[8] = i_2195_ * is_2102_[8] + 8192 >> 14;
		int i_2203_ = i_2193_ * i_2187_ + 8192 >> 14;
		int i_2204_ = i_2194_ * i_2188_ + 8192 >> 14;
		int i_2205_ = i_2195_ * i_2189_ + 8192 >> 14;
		i_2203_ += i_2199_;
		i_2204_ += i_2200_;
		i_2205_ += i_2201_;
		int[] is_2206_ = new int[9];
		for (int i_2207_ = 0; i_2207_ < 3; i_2207_++) {
		    for (int i_2208_ = 0; i_2208_ < 3; i_2208_++) {
			int i_2209_ = 0;
			for (int i_2210_ = 0; i_2210_ < 3; i_2210_++)
			    i_2209_ += (is_2102_[i_2207_ * 3 + i_2210_]
					* is_2202_[i_2208_ + i_2210_ * 3]);
			is_2206_[i_2207_ * 3 + i_2208_] = i_2209_ + 8192 >> 14;
		    }
		}
		int i_2211_ = ((is_2102_[0] * i_2203_ + is_2102_[1] * i_2204_
				+ is_2102_[2] * i_2205_ + 8192)
			       >> 14);
		int i_2212_ = ((is_2102_[3] * i_2203_ + is_2102_[4] * i_2204_
				+ is_2102_[5] * i_2205_ + 8192)
			       >> 14);
		int i_2213_ = ((is_2102_[6] * i_2203_ + is_2102_[7] * i_2204_
				+ is_2102_[8] * i_2205_ + 8192)
			       >> 14);
		i_2211_ += i_2184_;
		i_2212_ += i_2185_;
		i_2213_ += i_2186_;
		for (int i_2214_ = 0; i_2214_ < i_2103_; i_2214_++) {
		    int i_2215_ = is[i_2214_];
		    if (i_2215_
			< ((Class89_Sub3) this).anIntArrayArray9716.length) {
			int[] is_2216_ = (((Class89_Sub3) this)
					  .anIntArrayArray9716[i_2215_]);
			for (int i_2217_ = 0; i_2217_ < is_2216_.length;
			     i_2217_++) {
			    int i_2218_ = is_2216_[i_2217_];
			    if (((Class89_Sub3) this).aShortArray9679 == null
				|| ((i_2101_ & (((Class89_Sub3) this)
						.aShortArray9679[i_2218_]))
				    != 0)) {
				int i_2219_
				    = (is_2206_[0] * (((Class89_Sub3) this)
						      .anIntArray9670[i_2218_])
				       + is_2206_[1] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_2218_])
				       + is_2206_[2] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_2218_])
				       + 8192) >> 14;
				int i_2220_
				    = (is_2206_[3] * (((Class89_Sub3) this)
						      .anIntArray9670[i_2218_])
				       + is_2206_[4] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_2218_])
				       + is_2206_[5] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_2218_])
				       + 8192) >> 14;
				int i_2221_
				    = (is_2206_[6] * (((Class89_Sub3) this)
						      .anIntArray9670[i_2218_])
				       + is_2206_[7] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_2218_])
				       + is_2206_[8] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_2218_])
				       + 8192) >> 14;
				i_2219_ += i_2211_;
				i_2220_ += i_2212_;
				i_2221_ += i_2213_;
				((Class89_Sub3) this).anIntArray9670[i_2218_]
				    = i_2219_;
				((Class89_Sub3) this).anIntArray9685[i_2218_]
				    = i_2220_;
				((Class89_Sub3) this).anIntArray9684[i_2218_]
				    = i_2221_;
			    }
			}
		    }
		}
	    } else {
		for (int i_2222_ = 0; i_2222_ < i_2103_; i_2222_++) {
		    int i_2223_ = is[i_2222_];
		    if (i_2223_
			< ((Class89_Sub3) this).anIntArrayArray9716.length) {
			int[] is_2224_ = (((Class89_Sub3) this)
					  .anIntArrayArray9716[i_2223_]);
			for (int i_2225_ = 0; i_2225_ < is_2224_.length;
			     i_2225_++) {
			    int i_2226_ = is_2224_[i_2225_];
			    if (((Class89_Sub3) this).aShortArray9679 == null
				|| ((i_2101_ & (((Class89_Sub3) this)
						.aShortArray9679[i_2226_]))
				    != 0)) {
				((Class89_Sub3) this).anIntArray9670[i_2226_]
				    -= ((Class89_Sub3) this).anInt9717;
				((Class89_Sub3) this).anIntArray9685[i_2226_]
				    -= ((Class89_Sub3) this).anInt9721;
				((Class89_Sub3) this).anIntArray9684[i_2226_]
				    -= ((Class89_Sub3) this).anInt9722;
				((Class89_Sub3) this).anIntArray9670[i_2226_]
				    = (((Class89_Sub3) this).anIntArray9670
				       [i_2226_]) * i_2098_ / 128;
				((Class89_Sub3) this).anIntArray9685[i_2226_]
				    = (((Class89_Sub3) this).anIntArray9685
				       [i_2226_]) * i_2099_ / 128;
				((Class89_Sub3) this).anIntArray9684[i_2226_]
				    = (((Class89_Sub3) this).anIntArray9684
				       [i_2226_]) * i_2100_ / 128;
				((Class89_Sub3) this).anIntArray9670[i_2226_]
				    += ((Class89_Sub3) this).anInt9717;
				((Class89_Sub3) this).anIntArray9685[i_2226_]
				    += ((Class89_Sub3) this).anInt9721;
				((Class89_Sub3) this).anIntArray9684[i_2226_]
				    += ((Class89_Sub3) this).anInt9722;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub3) this).anIntArrayArray9678 != null
		&& ((Class89_Sub3) this).aByteArray9711 != null) {
		for (int i_2227_ = 0; i_2227_ < i_2103_; i_2227_++) {
		    int i_2228_ = is[i_2227_];
		    if (i_2228_
			< ((Class89_Sub3) this).anIntArrayArray9678.length) {
			int[] is_2229_ = (((Class89_Sub3) this)
					  .anIntArrayArray9678[i_2228_]);
			for (int i_2230_ = 0; i_2230_ < is_2229_.length;
			     i_2230_++) {
			    int i_2231_ = is_2229_[i_2230_];
			    if (((Class89_Sub3) this).aShortArray9714 == null
				|| ((i_2101_ & (((Class89_Sub3) this)
						.aShortArray9714[i_2231_]))
				    != 0)) {
				int i_2232_ = (((((Class89_Sub3) this)
						 .aByteArray9711[i_2231_])
						& 0xff)
					       + i_2098_ * 8);
				if (i_2232_ < 0)
				    i_2232_ = 0;
				else if (i_2232_ > 255)
				    i_2232_ = 255;
				((Class89_Sub3) this).aByteArray9711[i_2231_]
				    = (byte) i_2232_;
			    }
			}
		    }
		}
		if (((Class89_Sub3) this).aClass187Array9727 != null) {
		    for (int i_2233_ = 0;
			 i_2233_ < ((Class89_Sub3) this).anInt9726;
			 i_2233_++) {
			Class187 class187 = (((Class89_Sub3) this)
					     .aClass187Array9727[i_2233_]);
			Class203 class203 = (((Class89_Sub3) this)
					     .aClass203Array9728[i_2233_]);
			((Class203) class203).anInt2417
			    = ((((Class203) class203).anInt2417 * -1473589757
				& 0xffffff)
			       | 255 - ((((Class89_Sub3) this).aByteArray9711
					 [(((Class187) class187).anInt2195
					   * 1571719645)])
					& 0xff) << 24) * 376097963;
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub3) this).anIntArrayArray9678 != null) {
		for (int i_2234_ = 0; i_2234_ < i_2103_; i_2234_++) {
		    int i_2235_ = is[i_2234_];
		    if (i_2235_
			< ((Class89_Sub3) this).anIntArrayArray9678.length) {
			int[] is_2236_ = (((Class89_Sub3) this)
					  .anIntArrayArray9678[i_2235_]);
			for (int i_2237_ = 0; i_2237_ < is_2236_.length;
			     i_2237_++) {
			    int i_2238_ = is_2236_[i_2237_];
			    if (((Class89_Sub3) this).aShortArray9714 == null
				|| ((i_2101_ & (((Class89_Sub3) this)
						.aShortArray9714[i_2238_]))
				    != 0)) {
				int i_2239_ = ((((Class89_Sub3) this)
						.aShortArray9713[i_2238_])
					       & 0xffff);
				int i_2240_ = i_2239_ >> 10 & 0x3f;
				int i_2241_ = i_2239_ >> 7 & 0x7;
				int i_2242_ = i_2239_ & 0x7f;
				i_2240_ = i_2240_ + i_2098_ & 0x3f;
				i_2241_ += i_2099_;
				if (i_2241_ < 0)
				    i_2241_ = 0;
				else if (i_2241_ > 7)
				    i_2241_ = 7;
				i_2242_ += i_2100_;
				if (i_2242_ < 0)
				    i_2242_ = 0;
				else if (i_2242_ > 127)
				    i_2242_ = 127;
				((Class89_Sub3) this).aShortArray9713[i_2238_]
				    = (short) (i_2240_ << 10 | i_2241_ << 7
					       | i_2242_);
			    }
			}
			((Class89_Sub3) this).aBool9718 = true;
		    }
		}
		if (((Class89_Sub3) this).aClass187Array9727 != null) {
		    for (int i_2243_ = 0;
			 i_2243_ < ((Class89_Sub3) this).anInt9726;
			 i_2243_++) {
			Class187 class187 = (((Class89_Sub3) this)
					     .aClass187Array9727[i_2243_]);
			Class203 class203 = (((Class89_Sub3) this)
					     .aClass203Array9728[i_2243_]);
			((Class203) class203).anInt2417
			    = (((((Class203) class203).anInt2417 * -1473589757
				 & ~0xffffff)
				| (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     ((((Class89_Sub3) this).aShortArray9713
				       [(((Class187) class187).anInt2195
					 * 1571719645)]) & 0xffff,
				      -3723607)) & 0xffff]) & 0xffffff)
			       * 376097963);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_2244_ = 0; i_2244_ < i_2103_; i_2244_++) {
		    int i_2245_ = is[i_2244_];
		    if (i_2245_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_2246_ = (((Class89_Sub3) this)
					  .anIntArrayArray9672[i_2245_]);
			for (int i_2247_ = 0; i_2247_ < is_2246_.length;
			     i_2247_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_2246_[i_2247_]]);
			    ((Class203) class203).anInt2423
				+= i_2098_ * -378944915;
			    ((Class203) class203).anInt2418
				+= i_2099_ * 830599387;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_2248_ = 0; i_2248_ < i_2103_; i_2248_++) {
		    int i_2249_ = is[i_2248_];
		    if (i_2249_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_2250_ = (((Class89_Sub3) this)
					  .anIntArrayArray9672[i_2249_]);
			for (int i_2251_ = 0; i_2251_ < is_2250_.length;
			     i_2251_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_2250_[i_2251_]]);
			    ((Class203) class203).aFloat2415
				= (((Class203) class203).aFloat2415
				   * (float) i_2098_ / 128.0F);
			    ((Class203) class203).aFloat2416
				= (((Class203) class203).aFloat2416
				   * (float) i_2099_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_2252_ = 0; i_2252_ < i_2103_; i_2252_++) {
		    int i_2253_ = is[i_2252_];
		    if (i_2253_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_2254_ = (((Class89_Sub3) this)
					  .anIntArrayArray9672[i_2253_]);
			for (int i_2255_ = 0; i_2255_ < is_2254_.length;
			     i_2255_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_2254_[i_2255_]]);
			    ((Class203) class203).anInt2424
				= ((((Class203) class203).anInt2424 * 360392329
				    + i_2098_)
				   & 0x3fff) * 318648249;
			}
		    }
		}
	    }
	}
    }
    
    final void method16124(boolean bool, boolean bool_2256_,
			   boolean bool_2257_) {
	for (int i = 0; i < ((Class89_Sub3) this).anInt9726; i++) {
	    Class187 class187 = ((Class89_Sub3) this).aClass187Array9727[i];
	    if (((Class187) class187).aBool2201) {
		Class203 class203
		    = ((Class89_Sub3) this).aClass203Array9728[i];
		((Class89_Sub3) this).aClass103_Sub2_9690.method15380
		    (bool, bool_2256_, bool_2257_,
		     ((Class203) class203).anInt2420 * -192321089,
		     ((Class203) class203).anInt2421 * -585258371,
		     ((Class203) class203).aFloat2419,
		     ((Class203) class203).anInt2422 * 1388492805,
		     ((Class203) class203).anInt2414 * 1644083687,
		     ((Class187) class187).aShort2199,
		     ((Class203) class203).anInt2417 * -1473589757,
		     ((Class187) class187).aByte2200,
		     ((Class187) class187).aByte2198);
	    }
	}
    }
    
    final boolean method16125(int i) {
	if (((Class89_Sub3) this).aByteArray9711 == null)
	    return false;
	if (((Class89_Sub3) this).aByteArray9711[i] == 0)
	    return false;
	return true;
    }
    
    int method16126(int i, short i_2258_, int i_2259_) {
	int i_2260_ = Class474.anIntArray6383[method16048(i, i_2259_)];
	Class101 class101
	    = ((Class89_Sub3) this).aClass103_Sub2_9690.aClass107_1458
		  .method2680(i_2258_ & 0xffff, -921267693);
	int i_2261_ = class101.aByte1430 & 0xff;
	if (i_2261_ != 0) {
	    int i_2262_ = 131586 * i_2259_;
	    if (i_2261_ == 256)
		i_2260_ = i_2262_;
	    else {
		int i_2263_ = i_2261_;
		int i_2264_ = 256 - i_2261_;
		i_2260_ = ((((i_2262_ & 0xff00ff) * i_2263_
			     + (i_2260_ & 0xff00ff) * i_2264_)
			    & ~0xff00ff)
			   + (((i_2262_ & 0xff00) * i_2263_
			       + (i_2260_ & 0xff00) * i_2264_)
			      & 0xff0000)) >> 8;
	    }
	}
	int i_2265_ = class101.aByte1433 & 0xff;
	if (i_2265_ != 0) {
	    i_2265_ += 256;
	    int i_2266_ = ((i_2260_ & 0xff0000) >> 16) * i_2265_;
	    if (i_2266_ > 65535)
		i_2266_ = 65535;
	    int i_2267_ = ((i_2260_ & 0xff00) >> 8) * i_2265_;
	    if (i_2267_ > 65535)
		i_2267_ = 65535;
	    int i_2268_ = (i_2260_ & 0xff) * i_2265_;
	    if (i_2268_ > 65535)
		i_2268_ = 65535;
	    i_2260_ = (i_2266_ << 8 & 0xff0000) + (i_2267_ & 0xff00) + (i_2268_
									>> 8);
	}
	return i_2260_;
    }
    
    final boolean method16127(int i) {
	if (((Class89_Sub3) this).anIntArray9675 == null)
	    return false;
	if (((Class89_Sub3) this).anIntArray9675[i] == -1)
	    return false;
	return true;
    }
    
    public void method1944(short i, short i_2269_) {
	if (((Class89_Sub3) this).aShortArray9712 != null) {
	    if (!((Class89_Sub3) this).aBool9688 && i_2269_ >= 0) {
		Class101 class101
		    = ((Class89_Sub3) this).aClass103_Sub2_9690
			  .aClass107_1458
			  .method2680(i_2269_ & 0xffff, 1605845006);
		if (class101.aByte1376 != 0 || class101.aByte1396 != 0)
		    ((Class89_Sub3) this).aBool9688 = true;
	    }
	    for (int i_2270_ = 0; i_2270_ < ((Class89_Sub3) this).anInt9691;
		 i_2270_++) {
		if (((Class89_Sub3) this).aShortArray9712[i_2270_] == i)
		    ((Class89_Sub3) this).aShortArray9712[i_2270_] = i_2269_;
	    }
	}
    }
    
    void method16128() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9686; i++) {
		int i_2271_ = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i]
		    = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i] = -i_2271_;
	    }
	    method16141();
	}
    }
    
    final void method16129(boolean bool, boolean bool_2272_,
			   boolean bool_2273_, int i) {
	short i_2274_ = ((Class89_Sub3) this).aShortArray9696[i];
	short i_2275_ = ((Class89_Sub3) this).aShortArray9697[i];
	short i_2276_ = ((Class89_Sub3) this).aShortArray9698[i];
	int i_2277_ = -1;
	if (((Class89_Sub3) this).aShortArray9712 != null
	    && ((Class89_Sub3) this).aShortArray9712[i] != -1)
	    i_2277_ = (((Class89_Sub3) this).aClass103_Sub2_9690
			   .aClass107_1458.method2680
		       (((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
			-1510077911)
		       .anInt1403) * 218388063;
	if (i_2277_ == -1) {
	    if (((Class89_Sub3) this).aByteArray9711 == null)
		((Class155) ((Class89_Sub3) this).aClass155_9674).anInt1723
		    = 0;
	    else
		((Class155) ((Class89_Sub3) this).aClass155_9674).anInt1723
		    = ((Class89_Sub3) this).aByteArray9711[i] & 0xff;
	    if (((Class89_Sub3) this).anIntArray9704[i] == -1)
		((Class89_Sub3) this).aClass155_9674.method3377
		    (bool, bool_2272_, bool_2273_,
		     ((Class89_Sub3) this).aFloatArray9746[i_2274_],
		     ((Class89_Sub3) this).aFloatArray9746[i_2275_],
		     ((Class89_Sub3) this).aFloatArray9746[i_2276_],
		     ((Class89_Sub3) this).aFloatArray9745[i_2274_],
		     ((Class89_Sub3) this).aFloatArray9745[i_2275_],
		     ((Class89_Sub3) this).aFloatArray9745[i_2276_],
		     ((Class89_Sub3) this).aFloatArray9756[i_2274_],
		     ((Class89_Sub3) this).aFloatArray9756[i_2275_],
		     ((Class89_Sub3) this).aFloatArray9756[i_2276_],
		     (Class474.anIntArray6382
		      [((Class89_Sub3) this).anIntArray9710[i] & 0xffff]));
	    else
		((Class89_Sub3) this).aClass155_9674.method3380
		    (bool, bool_2272_, bool_2273_,
		     ((Class89_Sub3) this).aFloatArray9746[i_2274_],
		     ((Class89_Sub3) this).aFloatArray9746[i_2275_],
		     ((Class89_Sub3) this).aFloatArray9746[i_2276_],
		     ((Class89_Sub3) this).aFloatArray9745[i_2274_],
		     ((Class89_Sub3) this).aFloatArray9745[i_2275_],
		     ((Class89_Sub3) this).aFloatArray9745[i_2276_],
		     ((Class89_Sub3) this).aFloatArray9756[i_2274_],
		     ((Class89_Sub3) this).aFloatArray9756[i_2275_],
		     ((Class89_Sub3) this).aFloatArray9756[i_2276_],
		     (float) (((Class89_Sub3) this).anIntArray9710[i]
			      & 0xffff),
		     (float) (((Class89_Sub3) this).anIntArray9747[i]
			      & 0xffff),
		     (float) (((Class89_Sub3) this).anIntArray9704[i]
			      & 0xffff));
	} else {
	    int i_2278_ = -16777216;
	    if (((Class89_Sub3) this).aByteArray9711 != null)
		i_2278_ = 255 - (((Class89_Sub3) this).aByteArray9711[i]
				 & 0xff) << 24;
	    if (((Class89_Sub3) this).anIntArray9704[i] == -1) {
		int i_2279_
		    = (i_2278_
		       | ((Class89_Sub3) this).anIntArray9710[i] & 0xffffff);
		((Class89_Sub3) this).aClass155_9674.method3384
		    (bool, bool_2272_, bool_2273_,
		     ((Class89_Sub3) this).aFloatArray9746[i_2274_],
		     ((Class89_Sub3) this).aFloatArray9746[i_2275_],
		     ((Class89_Sub3) this).aFloatArray9746[i_2276_],
		     ((Class89_Sub3) this).aFloatArray9745[i_2274_],
		     ((Class89_Sub3) this).aFloatArray9745[i_2275_],
		     ((Class89_Sub3) this).aFloatArray9745[i_2276_],
		     ((Class89_Sub3) this).aFloatArray9756[i_2274_],
		     ((Class89_Sub3) this).aFloatArray9756[i_2275_],
		     ((Class89_Sub3) this).aFloatArray9756[i_2276_],
		     ((Class89_Sub3) this).aFloatArray9700[i_2274_],
		     ((Class89_Sub3) this).aFloatArray9700[i_2275_],
		     ((Class89_Sub3) this).aFloatArray9700[i_2276_],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][0],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][1],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][2],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][0],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][1],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][2], i_2279_,
		     i_2279_, i_2279_,
		     (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .anInt2215) * -338296791,
		     0.0F, 0.0F, 0.0F,
		     ((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
		     i_2277_);
	    } else
		((Class89_Sub3) this).aClass155_9674.method3384
		    (bool, bool_2272_, bool_2273_,
		     ((Class89_Sub3) this).aFloatArray9746[i_2274_],
		     ((Class89_Sub3) this).aFloatArray9746[i_2275_],
		     ((Class89_Sub3) this).aFloatArray9746[i_2276_],
		     ((Class89_Sub3) this).aFloatArray9745[i_2274_],
		     ((Class89_Sub3) this).aFloatArray9745[i_2275_],
		     ((Class89_Sub3) this).aFloatArray9745[i_2276_],
		     ((Class89_Sub3) this).aFloatArray9756[i_2274_],
		     ((Class89_Sub3) this).aFloatArray9756[i_2275_],
		     ((Class89_Sub3) this).aFloatArray9756[i_2276_],
		     ((Class89_Sub3) this).aFloatArray9700[i_2274_],
		     ((Class89_Sub3) this).aFloatArray9700[i_2275_],
		     ((Class89_Sub3) this).aFloatArray9700[i_2276_],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][0],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][1],
		     ((Class89_Sub3) this).aFloatArrayArray9720[i][2],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][0],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][1],
		     ((Class89_Sub3) this).aFloatArrayArray9703[i][2],
		     (i_2278_
		      | ((Class89_Sub3) this).anIntArray9710[i] & 0xffffff),
		     (i_2278_
		      | ((Class89_Sub3) this).anIntArray9747[i] & 0xffffff),
		     (i_2278_
		      | ((Class89_Sub3) this).anIntArray9704[i] & 0xffffff),
		     (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .anInt2215) * -338296791,
		     0.0F, 0.0F, 0.0F,
		     ((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
		     i_2277_);
	}
    }
    
    final void method16130(boolean bool, boolean bool_2280_,
			   boolean bool_2281_) {
	for (int i = 0; i < ((Class89_Sub3) this).anInt9726; i++) {
	    Class187 class187 = ((Class89_Sub3) this).aClass187Array9727[i];
	    if (((Class187) class187).aBool2201) {
		Class203 class203
		    = ((Class89_Sub3) this).aClass203Array9728[i];
		((Class89_Sub3) this).aClass103_Sub2_9690.method15380
		    (bool, bool_2280_, bool_2281_,
		     ((Class203) class203).anInt2420 * -192321089,
		     ((Class203) class203).anInt2421 * -585258371,
		     ((Class203) class203).aFloat2419,
		     ((Class203) class203).anInt2422 * 1388492805,
		     ((Class203) class203).anInt2414 * 1644083687,
		     ((Class187) class187).aShort2199,
		     ((Class203) class203).anInt2417 * -1473589757,
		     ((Class187) class187).aByte2200,
		     ((Class187) class187).aByte2198);
	    }
	}
    }
    
    public void method2042(int i, int i_2282_, Class166 class166,
			   Class166 class166_2283_, int i_2284_, int i_2285_,
			   int i_2286_) {
	if (i == 3) {
	    if ((((Class89_Sub3) this).anInt9683 & 0x7) != 7)
		throw new IllegalStateException();
	} else if ((((Class89_Sub3) this).anInt9683 & 0x2) != 2)
	    throw new IllegalStateException();
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	int i_2287_ = i_2284_ + ((Class89_Sub3) this).aShort9735;
	int i_2288_ = i_2284_ + ((Class89_Sub3) this).aShort9736;
	int i_2289_ = i_2286_ + ((Class89_Sub3) this).aShort9737;
	int i_2290_ = i_2286_ + ((Class89_Sub3) this).aShort9738;
	if (i == 4 || (i_2287_ >= 0
		       && ((i_2288_ + class166.anInt2053 * 2039042417
			    >> class166.anInt2054 * -122333825)
			   < class166.anInt2055 * 266270313)
		       && i_2289_ >= 0
		       && ((i_2290_ + class166.anInt2053 * 2039042417
			    >> class166.anInt2054 * -122333825)
			   < class166.anInt2052 * -14610189))) {
	    int[][] is = class166.anIntArrayArray2051;
	    int[][] is_2291_ = null;
	    if (class166_2283_ != null)
		is_2291_ = class166_2283_.anIntArrayArray2051;
	    if (i == 4 || i == 5) {
		if (class166_2283_ == null
		    || (i_2287_ < 0
			|| ((i_2288_ + class166_2283_.anInt2053 * 2039042417
			     >> class166_2283_.anInt2054 * -122333825)
			    >= class166_2283_.anInt2055 * 266270313)
			|| i_2289_ < 0
			|| ((i_2290_ + class166_2283_.anInt2053 * 2039042417
			     >> class166_2283_.anInt2054 * -122333825)
			    >= class166_2283_.anInt2052 * -14610189)))
		    return;
	    } else {
		i_2287_ >>= class166.anInt2054 * -122333825;
		i_2288_ = (i_2288_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		i_2289_ >>= class166.anInt2054 * -122333825;
		i_2290_ = (i_2290_ + (class166.anInt2053 * 2039042417 - 1)
			   >> class166.anInt2054 * -122333825);
		if (is[i_2287_][i_2289_] == i_2285_
		    && is[i_2288_][i_2289_] == i_2285_
		    && is[i_2287_][i_2290_] == i_2285_
		    && is[i_2288_][i_2290_] == i_2285_)
		    return;
	    }
	    synchronized (this) {
		if (i == 1) {
		    int i_2292_ = class166.anInt2053 * 2039042417 - 1;
		    for (int i_2293_ = 0;
			 i_2293_ < ((Class89_Sub3) this).anInt9687;
			 i_2293_++) {
			int i_2294_
			    = (((Class89_Sub3) this).anIntArray9670[i_2293_]
			       + i_2284_);
			int i_2295_
			    = (((Class89_Sub3) this).anIntArray9684[i_2293_]
			       + i_2286_);
			int i_2296_ = i_2294_ & i_2292_;
			int i_2297_ = i_2295_ & i_2292_;
			int i_2298_
			    = i_2294_ >> class166.anInt2054 * -122333825;
			int i_2299_
			    = i_2295_ >> class166.anInt2054 * -122333825;
			int i_2300_
			    = (((is[i_2298_][i_2299_]
				 * (class166.anInt2053 * 2039042417 - i_2296_))
				+ is[i_2298_ + 1][i_2299_] * i_2296_)
			       >> class166.anInt2054 * -122333825);
			int i_2301_
			    = (((is[i_2298_][i_2299_ + 1]
				 * (class166.anInt2053 * 2039042417 - i_2296_))
				+ is[i_2298_ + 1][i_2299_ + 1] * i_2296_)
			       >> class166.anInt2054 * -122333825);
			int i_2302_
			    = (i_2300_ * (class166.anInt2053 * 2039042417
					  - i_2297_) + i_2301_ * i_2297_
			       >> class166.anInt2054 * -122333825);
			((Class89_Sub3) this).anIntArray9685[i_2293_]
			    = (((Class89_Sub3) this).anIntArray9685[i_2293_]
			       + i_2302_ - i_2285_);
		    }
		    for (int i_2303_ = ((Class89_Sub3) this).anInt9687;
			 i_2303_ < ((Class89_Sub3) this).anInt9686;
			 i_2303_++) {
			int i_2304_
			    = (((Class89_Sub3) this).anIntArray9670[i_2303_]
			       + i_2284_);
			int i_2305_
			    = (((Class89_Sub3) this).anIntArray9684[i_2303_]
			       + i_2286_);
			int i_2306_ = i_2304_ & i_2292_;
			int i_2307_ = i_2305_ & i_2292_;
			int i_2308_
			    = i_2304_ >> class166.anInt2054 * -122333825;
			int i_2309_
			    = i_2305_ >> class166.anInt2054 * -122333825;
			if (i_2308_ >= 0 && i_2308_ < is.length - 1
			    && i_2309_ >= 0 && i_2309_ < is[0].length - 1) {
			    int i_2310_
				= (((is[i_2308_][i_2309_]
				     * (class166.anInt2053 * 2039042417
					- i_2306_))
				    + is[i_2308_ + 1][i_2309_] * i_2306_)
				   >> class166.anInt2054 * -122333825);
			    int i_2311_
				= (((is[i_2308_][i_2309_ + 1]
				     * (class166.anInt2053 * 2039042417
					- i_2306_))
				    + is[i_2308_ + 1][i_2309_ + 1] * i_2306_)
				   >> class166.anInt2054 * -122333825);
			    int i_2312_
				= (i_2310_ * (class166.anInt2053 * 2039042417
					      - i_2307_) + i_2311_ * i_2307_
				   >> class166.anInt2054 * -122333825);
			    ((Class89_Sub3) this).anIntArray9685[i_2303_]
				= (((Class89_Sub3) this).anIntArray9685
				   [i_2303_]) + i_2312_ - i_2285_;
			}
		    }
		} else if (i == 2) {
		    if (((Class89_Sub3) this).aShort9733 == 0)
			return;
		    int i_2313_ = class166.anInt2053 * 2039042417 - 1;
		    for (int i_2314_ = 0;
			 i_2314_ < ((Class89_Sub3) this).anInt9687;
			 i_2314_++) {
			int i_2315_
			    = ((((Class89_Sub3) this).anIntArray9685[i_2314_]
				<< 16)
			       / ((Class89_Sub3) this).aShort9733);
			if (i_2315_ < i_2282_) {
			    int i_2316_ = ((((Class89_Sub3) this)
					    .anIntArray9670[i_2314_])
					   + i_2284_);
			    int i_2317_ = ((((Class89_Sub3) this)
					    .anIntArray9684[i_2314_])
					   + i_2286_);
			    int i_2318_ = i_2316_ & i_2313_;
			    int i_2319_ = i_2317_ & i_2313_;
			    int i_2320_
				= i_2316_ >> class166.anInt2054 * -122333825;
			    int i_2321_
				= i_2317_ >> class166.anInt2054 * -122333825;
			    int i_2322_
				= (((is[i_2320_][i_2321_]
				     * (class166.anInt2053 * 2039042417
					- i_2318_))
				    + is[i_2320_ + 1][i_2321_] * i_2318_)
				   >> class166.anInt2054 * -122333825);
			    int i_2323_
				= (((is[i_2320_][i_2321_ + 1]
				     * (class166.anInt2053 * 2039042417
					- i_2318_))
				    + is[i_2320_ + 1][i_2321_ + 1] * i_2318_)
				   >> class166.anInt2054 * -122333825);
			    int i_2324_
				= (i_2322_ * (class166.anInt2053 * 2039042417
					      - i_2319_) + i_2323_ * i_2319_
				   >> class166.anInt2054 * -122333825);
			    ((Class89_Sub3) this).anIntArray9685[i_2314_]
				= ((((Class89_Sub3) this).anIntArray9685
				    [i_2314_])
				   + ((i_2324_ - i_2285_) * (i_2282_ - i_2315_)
				      / i_2282_));
			} else
			    ((Class89_Sub3) this).anIntArray9685[i_2314_]
				= (((Class89_Sub3) this).anIntArray9685
				   [i_2314_]);
		    }
		    for (int i_2325_ = ((Class89_Sub3) this).anInt9687;
			 i_2325_ < ((Class89_Sub3) this).anInt9686;
			 i_2325_++) {
			int i_2326_
			    = ((((Class89_Sub3) this).anIntArray9685[i_2325_]
				<< 16)
			       / ((Class89_Sub3) this).aShort9733);
			if (i_2326_ < i_2282_) {
			    int i_2327_ = ((((Class89_Sub3) this)
					    .anIntArray9670[i_2325_])
					   + i_2284_);
			    int i_2328_ = ((((Class89_Sub3) this)
					    .anIntArray9684[i_2325_])
					   + i_2286_);
			    int i_2329_ = i_2327_ & i_2313_;
			    int i_2330_ = i_2328_ & i_2313_;
			    int i_2331_
				= i_2327_ >> class166.anInt2054 * -122333825;
			    int i_2332_
				= i_2328_ >> class166.anInt2054 * -122333825;
			    if (i_2331_ >= 0
				&& i_2331_ < class166.anInt2055 * 266270313 - 1
				&& i_2332_ >= 0
				&& (i_2332_
				    < class166.anInt2052 * -14610189 - 1)) {
				int i_2333_
				    = (((is[i_2331_][i_2332_]
					 * (class166.anInt2053 * 2039042417
					    - i_2329_))
					+ is[i_2331_ + 1][i_2332_] * i_2329_)
				       >> class166.anInt2054 * -122333825);
				int i_2334_
				    = (((is[i_2331_][i_2332_ + 1]
					 * (class166.anInt2053 * 2039042417
					    - i_2329_))
					+ (is[i_2331_ + 1][i_2332_ + 1]
					   * i_2329_))
				       >> class166.anInt2054 * -122333825);
				int i_2335_
				    = ((i_2333_
					* (class166.anInt2053 * 2039042417
					   - i_2330_)) + i_2334_ * i_2330_
				       >> class166.anInt2054 * -122333825);
				((Class89_Sub3) this).anIntArray9685[i_2325_]
				    = ((((Class89_Sub3) this).anIntArray9685
					[i_2325_])
				       + ((i_2335_ - i_2285_)
					  * (i_2282_ - i_2326_) / i_2282_));
			    }
			} else
			    ((Class89_Sub3) this).anIntArray9685[i_2325_]
				= (((Class89_Sub3) this).anIntArray9685
				   [i_2325_]);
		    }
		} else if (i == 3) {
		    int i_2336_ = (i_2282_ & 0xff) * 4;
		    int i_2337_ = (i_2282_ >> 8 & 0xff) * 4;
		    int i_2338_ = (i_2282_ >> 16 & 0xff) << 6;
		    int i_2339_ = (i_2282_ >> 24 & 0xff) << 6;
		    if (i_2284_ - (i_2336_ >> 1) < 0
			|| ((i_2284_ + (i_2336_ >> 1)
			     + class166.anInt2053 * 2039042417)
			    >= (class166.anInt2055 * 266270313
				<< class166.anInt2054 * -122333825))
			|| i_2286_ - (i_2337_ >> 1) < 0
			|| ((i_2286_ + (i_2337_ >> 1)
			     + class166.anInt2053 * 2039042417)
			    >= (class166.anInt2052 * -14610189
				<< class166.anInt2054 * -122333825)))
			return;
		    method2041(class166, i_2284_, i_2285_, i_2286_, i_2336_,
			       i_2337_, i_2338_, i_2339_);
		} else if (i == 4) {
		    int i_2340_ = class166_2283_.anInt2053 * 2039042417 - 1;
		    int i_2341_ = (((Class89_Sub3) this).aShort9734
				   - ((Class89_Sub3) this).aShort9733);
		    for (int i_2342_ = 0;
			 i_2342_ < ((Class89_Sub3) this).anInt9687;
			 i_2342_++) {
			int i_2343_
			    = (((Class89_Sub3) this).anIntArray9670[i_2342_]
			       + i_2284_);
			int i_2344_
			    = (((Class89_Sub3) this).anIntArray9684[i_2342_]
			       + i_2286_);
			int i_2345_ = i_2343_ & i_2340_;
			int i_2346_ = i_2344_ & i_2340_;
			int i_2347_
			    = i_2343_ >> class166_2283_.anInt2054 * -122333825;
			int i_2348_
			    = i_2344_ >> class166_2283_.anInt2054 * -122333825;
			int i_2349_
			    = (((is_2291_[i_2347_][i_2348_]
				 * (class166_2283_.anInt2053 * 2039042417
				    - i_2345_))
				+ is_2291_[i_2347_ + 1][i_2348_] * i_2345_)
			       >> class166_2283_.anInt2054 * -122333825);
			int i_2350_
			    = (((is_2291_[i_2347_][i_2348_ + 1]
				 * (class166_2283_.anInt2053 * 2039042417
				    - i_2345_))
				+ is_2291_[i_2347_ + 1][i_2348_ + 1] * i_2345_)
			       >> class166_2283_.anInt2054 * -122333825);
			int i_2351_
			    = (i_2349_ * (class166_2283_.anInt2053 * 2039042417
					  - i_2346_) + i_2350_ * i_2346_
			       >> class166_2283_.anInt2054 * -122333825);
			((Class89_Sub3) this).anIntArray9685[i_2342_]
			    = (((Class89_Sub3) this).anIntArray9685[i_2342_]
			       + (i_2351_ - i_2285_) + i_2341_);
		    }
		    for (int i_2352_ = ((Class89_Sub3) this).anInt9687;
			 i_2352_ < ((Class89_Sub3) this).anInt9686;
			 i_2352_++) {
			int i_2353_
			    = (((Class89_Sub3) this).anIntArray9670[i_2352_]
			       + i_2284_);
			int i_2354_
			    = (((Class89_Sub3) this).anIntArray9684[i_2352_]
			       + i_2286_);
			int i_2355_ = i_2353_ & i_2340_;
			int i_2356_ = i_2354_ & i_2340_;
			int i_2357_
			    = i_2353_ >> class166_2283_.anInt2054 * -122333825;
			int i_2358_
			    = i_2354_ >> class166_2283_.anInt2054 * -122333825;
			if (i_2357_ >= 0
			    && (i_2357_
				< class166_2283_.anInt2055 * 266270313 - 1)
			    && i_2358_ >= 0
			    && (i_2358_
				< class166_2283_.anInt2052 * -14610189 - 1)) {
			    int i_2359_
				= (((is_2291_[i_2357_][i_2358_]
				     * (class166_2283_.anInt2053 * 2039042417
					- i_2355_))
				    + is_2291_[i_2357_ + 1][i_2358_] * i_2355_)
				   >> class166_2283_.anInt2054 * -122333825);
			    int i_2360_
				= (((is_2291_[i_2357_][i_2358_ + 1]
				     * (class166_2283_.anInt2053 * 2039042417
					- i_2355_))
				    + (is_2291_[i_2357_ + 1][i_2358_ + 1]
				       * i_2355_))
				   >> class166_2283_.anInt2054 * -122333825);
			    int i_2361_
				= ((i_2359_
				    * (class166_2283_.anInt2053 * 2039042417
				       - i_2356_)) + i_2360_ * i_2356_
				   >> class166_2283_.anInt2054 * -122333825);
			    ((Class89_Sub3) this).anIntArray9685[i_2352_]
				= (((Class89_Sub3) this).anIntArray9685
				   [i_2352_]) + (i_2361_ - i_2285_) + i_2341_;
			}
		    }
		} else if (i == 5) {
		    int i_2362_ = class166_2283_.anInt2053 * 2039042417 - 1;
		    int i_2363_ = (((Class89_Sub3) this).aShort9734
				   - ((Class89_Sub3) this).aShort9733);
		    for (int i_2364_ = 0;
			 i_2364_ < ((Class89_Sub3) this).anInt9687;
			 i_2364_++) {
			int i_2365_
			    = (((Class89_Sub3) this).anIntArray9670[i_2364_]
			       + i_2284_);
			int i_2366_
			    = (((Class89_Sub3) this).anIntArray9684[i_2364_]
			       + i_2286_);
			int i_2367_ = i_2365_ & i_2362_;
			int i_2368_ = i_2366_ & i_2362_;
			int i_2369_
			    = i_2365_ >> class166.anInt2054 * -122333825;
			int i_2370_
			    = i_2366_ >> class166.anInt2054 * -122333825;
			int i_2371_
			    = (((is[i_2369_][i_2370_]
				 * (class166.anInt2053 * 2039042417 - i_2367_))
				+ is[i_2369_ + 1][i_2370_] * i_2367_)
			       >> class166.anInt2054 * -122333825);
			int i_2372_
			    = (((is[i_2369_][i_2370_ + 1]
				 * (class166.anInt2053 * 2039042417 - i_2367_))
				+ is[i_2369_ + 1][i_2370_ + 1] * i_2367_)
			       >> class166.anInt2054 * -122333825);
			int i_2373_
			    = (i_2371_ * (class166.anInt2053 * 2039042417
					  - i_2368_) + i_2372_ * i_2368_
			       >> class166.anInt2054 * -122333825);
			i_2371_ = (((is_2291_[i_2369_][i_2370_]
				     * (class166_2283_.anInt2053 * 2039042417
					- i_2367_))
				    + is_2291_[i_2369_ + 1][i_2370_] * i_2367_)
				   >> class166_2283_.anInt2054 * -122333825);
			i_2372_
			    = (((is_2291_[i_2369_][i_2370_ + 1]
				 * (class166_2283_.anInt2053 * 2039042417
				    - i_2367_))
				+ is_2291_[i_2369_ + 1][i_2370_ + 1] * i_2367_)
			       >> class166_2283_.anInt2054 * -122333825);
			int i_2374_
			    = (i_2371_ * (class166_2283_.anInt2053 * 2039042417
					  - i_2368_) + i_2372_ * i_2368_
			       >> class166_2283_.anInt2054 * -122333825);
			int i_2375_ = i_2373_ - i_2374_ - i_2282_;
			((Class89_Sub3) this).anIntArray9685[i_2364_]
			    = ((((Class89_Sub3) this).anIntArray9685[i_2364_]
				<< 8) / i_2363_ * i_2375_
			       >> 8) - (i_2285_ - i_2373_);
		    }
		    for (int i_2376_ = ((Class89_Sub3) this).anInt9687;
			 i_2376_ < ((Class89_Sub3) this).anInt9686;
			 i_2376_++) {
			int i_2377_
			    = (((Class89_Sub3) this).anIntArray9670[i_2376_]
			       + i_2284_);
			int i_2378_
			    = (((Class89_Sub3) this).anIntArray9684[i_2376_]
			       + i_2286_);
			int i_2379_ = i_2377_ & i_2362_;
			int i_2380_ = i_2378_ & i_2362_;
			int i_2381_
			    = i_2377_ >> class166.anInt2054 * -122333825;
			int i_2382_
			    = i_2378_ >> class166.anInt2054 * -122333825;
			if (i_2381_ >= 0
			    && i_2381_ < class166.anInt2055 * 266270313 - 1
			    && (i_2381_
				< class166_2283_.anInt2055 * 266270313 - 1)
			    && i_2382_ >= 0
			    && i_2382_ < class166.anInt2052 * -14610189 - 1
			    && (i_2382_
				< class166_2283_.anInt2052 * -14610189 - 1)) {
			    int i_2383_
				= (((is[i_2381_][i_2382_]
				     * (class166.anInt2053 * 2039042417
					- i_2379_))
				    + is[i_2381_ + 1][i_2382_] * i_2379_)
				   >> class166.anInt2054 * -122333825);
			    int i_2384_
				= (((is[i_2381_][i_2382_ + 1]
				     * (class166.anInt2053 * 2039042417
					- i_2379_))
				    + is[i_2381_ + 1][i_2382_ + 1] * i_2379_)
				   >> class166.anInt2054 * -122333825);
			    int i_2385_
				= (i_2383_ * (class166.anInt2053 * 2039042417
					      - i_2380_) + i_2384_ * i_2380_
				   >> class166.anInt2054 * -122333825);
			    i_2383_
				= (((is_2291_[i_2381_][i_2382_]
				     * (class166_2283_.anInt2053 * 2039042417
					- i_2379_))
				    + is_2291_[i_2381_ + 1][i_2382_] * i_2379_)
				   >> class166_2283_.anInt2054 * -122333825);
			    i_2384_
				= (((is_2291_[i_2381_][i_2382_ + 1]
				     * (class166_2283_.anInt2053 * 2039042417
					- i_2379_))
				    + (is_2291_[i_2381_ + 1][i_2382_ + 1]
				       * i_2379_))
				   >> class166_2283_.anInt2054 * -122333825);
			    int i_2386_
				= ((i_2383_
				    * (class166_2283_.anInt2053 * 2039042417
				       - i_2380_)) + i_2384_ * i_2380_
				   >> class166_2283_.anInt2054 * -122333825);
			    int i_2387_ = i_2385_ - i_2386_ - i_2282_;
			    ((Class89_Sub3) this).anIntArray9685[i_2376_]
				= (((((Class89_Sub3) this).anIntArray9685
				     [i_2376_])
				    << 8) / i_2363_ * i_2387_
				   >> 8) - (i_2285_ - i_2385_);
			}
		    }
		}
		((Class89_Sub3) this).aBool9730 = false;
	    }
	}
    }
    
    final void method16131(boolean bool, boolean bool_2388_,
			   boolean bool_2389_, int i) {
	int i_2390_ = -1;
	if (((Class89_Sub3) this).aShortArray9712 != null
	    && ((Class89_Sub3) this).aShortArray9712[i] != -1)
	    i_2390_ = (((Class89_Sub3) this).aClass103_Sub2_9690
			   .aClass107_1458.method2680
		       (((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
			1898259498)
		       .anInt1403) * 218388063;
	if (!((Class189) ((Class89_Sub3) this).aClass189_9671).aBool2217) {
	    short i_2391_ = ((Class89_Sub3) this).aShortArray9696[i];
	    short i_2392_ = ((Class89_Sub3) this).aShortArray9697[i];
	    short i_2393_ = ((Class89_Sub3) this).aShortArray9698[i];
	    Class268 class268
		= (((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		   .aClass268_9261);
	    float f = class268.aFloatArray4353[10];
	    float f_2394_ = class268.aFloatArray4353[14];
	    float f_2395_ = class268.aFloatArray4353[11];
	    float f_2396_ = class268.aFloatArray4353[15];
	    float f_2397_ = f_2394_ * f_2395_ - f * f_2396_;
	    float f_2398_
		= ((((Class89_Sub3) this).aFloatArray9756[i_2391_]
		    - (((Class189) ((Class89_Sub3) this).aClass189_9671)
		       .aFloat2243))
		   * (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2244));
	    float f_2399_
		= ((((Class89_Sub3) this).aFloatArray9756[i_2392_]
		    - (((Class189) ((Class89_Sub3) this).aClass189_9671)
		       .aFloat2243))
		   * (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2244));
	    float f_2400_
		= ((((Class89_Sub3) this).aFloatArray9756[i_2393_]
		    - (((Class189) ((Class89_Sub3) this).aClass189_9671)
		       .aFloat2243))
		   * (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2244));
	    float f_2401_ = f_2398_ * f_2397_ / (f_2398_ * f_2395_ - f);
	    float f_2402_ = f_2399_ * f_2397_ / (f_2399_ * f_2395_ - f);
	    float f_2403_ = f_2400_ * f_2397_ / (f_2400_ * f_2395_ - f);
	    float f_2404_
		= ((f_2401_
		    - (((Class189) ((Class89_Sub3) this).aClass189_9671)
		       .aFloat2213))
		   / (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2214));
	    if (f_2404_ > 1.0F)
		f_2404_ = 1.0F;
	    else if (f_2404_ < 0.0F)
		f_2404_ = 0.0F;
	    float f_2405_
		= ((f_2402_
		    - (((Class189) ((Class89_Sub3) this).aClass189_9671)
		       .aFloat2213))
		   / (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2214));
	    if (f_2405_ > 1.0F)
		f_2405_ = 1.0F;
	    else if (f_2405_ < 0.0F)
		f_2405_ = 0.0F;
	    float f_2406_
		= ((f_2403_
		    - (((Class189) ((Class89_Sub3) this).aClass189_9671)
		       .aFloat2213))
		   / (((Class189) ((Class89_Sub3) this).aClass189_9671)
		      .aFloat2214));
	    if (f_2406_ > 1.0F)
		f_2406_ = 1.0F;
	    else if (f_2406_ < 0.0F)
		f_2406_ = 0.0F;
	    float f_2407_ = f_2404_ + f_2405_ + f_2406_;
	    if (!(f_2407_ >= 3.0F)) {
		if (f_2407_ <= 0.0F)
		    method16073(bool, bool_2388_, bool_2389_, i);
		else {
		    if (((Class89_Sub3) this).aByteArray9711 == null)
			((Class155) ((Class89_Sub3) this).aClass155_9674)
			    .anInt1723
			    = 0;
		    else
			((Class155) ((Class89_Sub3) this).aClass155_9674)
			    .anInt1723
			    = ((Class89_Sub3) this).aByteArray9711[i] & 0xff;
		    if (i_2390_ == -1) {
			if (((Class89_Sub3) this).anIntArray9704[i] == -1)
			    ((Class89_Sub3) this).aClass155_9674.method3385
				(bool, bool_2388_, bool_2389_,
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_2391_]),
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_2392_]),
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_2393_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_2391_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_2392_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_2393_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_2391_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_2392_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_2393_]),
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9710[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_2404_ * 255.0F,
						    1372221625),
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9710[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_2405_ * 255.0F,
						    1372221625),
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9710[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_2406_ * 255.0F,
						    1372221625));
			else
			    ((Class89_Sub3) this).aClass155_9674.method3385
				(bool, bool_2388_, bool_2389_,
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_2391_]),
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_2392_]),
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_2393_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_2391_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_2392_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_2393_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_2391_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_2392_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_2393_]),
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9710[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_2404_ * 255.0F,
						    1372221625),
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9747[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_2405_ * 255.0F,
						    1372221625),
				 Class54.method1306((Class474.anIntArray6382
						     [((((Class89_Sub3) this)
							.anIntArray9704[i])
						       & 0xffff)]),
						    (((Class189)
						      (((Class89_Sub3) this)
						       .aClass189_9671))
						     .anInt2215) * -338296791,
						    f_2406_ * 255.0F,
						    1372221625));
		    } else {
			int i_2408_ = -16777216;
			if (((Class89_Sub3) this).aByteArray9711 != null)
			    i_2408_ = 255 - ((((Class89_Sub3) this)
					      .aByteArray9711[i])
					     & 0xff) << 24;
			if (((Class89_Sub3) this).anIntArray9704[i] == -1) {
			    int i_2409_
				= (i_2408_
				   | (((Class89_Sub3) this).anIntArray9710[i]
				      & 0xffffff));
			    ((Class89_Sub3) this).aClass155_9674.method3384
				(bool, bool_2388_, bool_2389_,
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_2391_]),
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_2392_]),
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_2393_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_2391_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_2392_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_2393_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_2391_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_2392_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_2393_]),
				 (((Class89_Sub3) this).aFloatArray9700
				  [i_2391_]),
				 (((Class89_Sub3) this).aFloatArray9700
				  [i_2392_]),
				 (((Class89_Sub3) this).aFloatArray9700
				  [i_2393_]),
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [0]),
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [1]),
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [2]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [0]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [1]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [2]),
				 i_2409_, i_2409_, i_2409_,
				 (((Class189) (((Class89_Sub3) this)
					       .aClass189_9671)).anInt2215
				  * -338296791),
				 f_2404_ * 255.0F, f_2405_ * 255.0F,
				 f_2406_ * 255.0F,
				 (((Class89_Sub3) this).aShortArray9712[i]
				  & 0xffff),
				 i_2390_);
			} else
			    ((Class89_Sub3) this).aClass155_9674.method3384
				(bool, bool_2388_, bool_2389_,
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_2391_]),
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_2392_]),
				 (((Class89_Sub3) this).aFloatArray9746
				  [i_2393_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_2391_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_2392_]),
				 (((Class89_Sub3) this).aFloatArray9745
				  [i_2393_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_2391_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_2392_]),
				 (((Class89_Sub3) this).aFloatArray9756
				  [i_2393_]),
				 (((Class89_Sub3) this).aFloatArray9700
				  [i_2391_]),
				 (((Class89_Sub3) this).aFloatArray9700
				  [i_2392_]),
				 (((Class89_Sub3) this).aFloatArray9700
				  [i_2393_]),
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [0]),
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [1]),
				 (((Class89_Sub3) this).aFloatArrayArray9720[i]
				  [2]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [0]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [1]),
				 (((Class89_Sub3) this).aFloatArrayArray9703[i]
				  [2]),
				 i_2408_ | (((Class89_Sub3) this)
					    .anIntArray9710[i]) & 0xffffff,
				 i_2408_ | (((Class89_Sub3) this)
					    .anIntArray9747[i]) & 0xffffff,
				 i_2408_ | (((Class89_Sub3) this)
					    .anIntArray9704[i]) & 0xffffff,
				 (((Class189) (((Class89_Sub3) this)
					       .aClass189_9671)).anInt2215
				  * -338296791),
				 f_2404_ * 255.0F, f_2405_ * 255.0F,
				 f_2406_ * 255.0F,
				 (((Class89_Sub3) this).aShortArray9712[i]
				  & 0xffff),
				 i_2390_);
		    }
		}
	    }
	} else {
	    short i_2410_ = ((Class89_Sub3) this).aShortArray9696[i];
	    short i_2411_ = ((Class89_Sub3) this).aShortArray9697[i];
	    short i_2412_ = ((Class89_Sub3) this).aShortArray9698[i];
	    float f = 0.0F;
	    float f_2413_ = 0.0F;
	    float f_2414_ = 0.0F;
	    if (((Class89_Sub3) this).anIntArray9729[i_2410_]
		> (((Class189) ((Class89_Sub3) this).aClass189_9671).anInt2230
		   * 2144219087))
		f = 1.0F;
	    else if (((Class89_Sub3) this).anIntArray9729[i_2410_]
		     > (((Class189) ((Class89_Sub3) this).aClass189_9671)
			.anInt2218) * -1285418291)
		f = ((float) ((((Class189)
				((Class89_Sub3) this).aClass189_9671).anInt2218
			       * -1285418291)
			      - ((Class89_Sub3) this).anIntArray9729[i_2410_])
		     * 1.0F
		     / (float) ((((Class189) (((Class89_Sub3) this)
					      .aClass189_9671)).anInt2218
				 * -1285418291)
				- (((Class189) (((Class89_Sub3) this)
						.aClass189_9671)).anInt2230
				   * 2144219087)));
	    if (((Class89_Sub3) this).anIntArray9729[i_2411_]
		> (((Class189) ((Class89_Sub3) this).aClass189_9671).anInt2230
		   * 2144219087))
		f_2413_ = 1.0F;
	    else if (((Class89_Sub3) this).anIntArray9729[i_2411_]
		     > (((Class189) ((Class89_Sub3) this).aClass189_9671)
			.anInt2218) * -1285418291)
		f_2413_ = ((float) ((((Class189) (((Class89_Sub3) this)
						  .aClass189_9671)).anInt2218
				     * -1285418291)
				    - (((Class89_Sub3) this).anIntArray9729
				       [i_2411_]))
			   * 1.0F
			   / (float) ((((Class189) (((Class89_Sub3) this)
						    .aClass189_9671)).anInt2218
				       * -1285418291)
				      - (((Class189)
					  ((Class89_Sub3) this).aClass189_9671)
					 .anInt2230) * 2144219087));
	    if (((Class89_Sub3) this).anIntArray9729[i_2412_]
		> (((Class189) ((Class89_Sub3) this).aClass189_9671).anInt2230
		   * 2144219087))
		f_2414_ = 1.0F;
	    else if (((Class89_Sub3) this).anIntArray9729[i_2412_]
		     > (((Class189) ((Class89_Sub3) this).aClass189_9671)
			.anInt2218) * -1285418291)
		f_2414_ = ((float) ((((Class189) (((Class89_Sub3) this)
						  .aClass189_9671)).anInt2218
				     * -1285418291)
				    - (((Class89_Sub3) this).anIntArray9729
				       [i_2412_]))
			   * 1.0F
			   / (float) ((((Class189) (((Class89_Sub3) this)
						    .aClass189_9671)).anInt2218
				       * -1285418291)
				      - (((Class189)
					  ((Class89_Sub3) this).aClass189_9671)
					 .anInt2230) * 2144219087));
	    if (((Class89_Sub3) this).aByteArray9711 == null)
		((Class155) ((Class89_Sub3) this).aClass155_9674).anInt1723
		    = 0;
	    else
		((Class155) ((Class89_Sub3) this).aClass155_9674).anInt1723
		    = ((Class89_Sub3) this).aByteArray9711[i] & 0xff;
	    if (i_2390_ == -1) {
		if (((Class89_Sub3) this).anIntArray9704[i] == -1)
		    ((Class89_Sub3) this).aClass155_9674.method3385
			(bool, bool_2388_, bool_2389_,
			 ((Class89_Sub3) this).aFloatArray9746[i_2410_],
			 ((Class89_Sub3) this).aFloatArray9746[i_2411_],
			 ((Class89_Sub3) this).aFloatArray9746[i_2412_],
			 ((Class89_Sub3) this).aFloatArray9745[i_2410_],
			 ((Class89_Sub3) this).aFloatArray9745[i_2411_],
			 ((Class89_Sub3) this).aFloatArray9745[i_2412_],
			 ((Class89_Sub3) this).aFloatArray9756[i_2410_],
			 ((Class89_Sub3) this).aFloatArray9756[i_2411_],
			 ((Class89_Sub3) this).aFloatArray9756[i_2412_],
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9710[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f * 255.0F, 1372221625),
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9710[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f_2413_ * 255.0F, 1372221625),
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9710[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f_2414_ * 255.0F, 1372221625));
		else
		    ((Class89_Sub3) this).aClass155_9674.method3385
			(bool, bool_2388_, bool_2389_,
			 ((Class89_Sub3) this).aFloatArray9746[i_2410_],
			 ((Class89_Sub3) this).aFloatArray9746[i_2411_],
			 ((Class89_Sub3) this).aFloatArray9746[i_2412_],
			 ((Class89_Sub3) this).aFloatArray9745[i_2410_],
			 ((Class89_Sub3) this).aFloatArray9745[i_2411_],
			 ((Class89_Sub3) this).aFloatArray9745[i_2412_],
			 ((Class89_Sub3) this).aFloatArray9756[i_2410_],
			 ((Class89_Sub3) this).aFloatArray9756[i_2411_],
			 ((Class89_Sub3) this).aFloatArray9756[i_2412_],
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9710[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f * 255.0F, 1372221625),
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9747[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f_2413_ * 255.0F, 1372221625),
			 Class54.method1306((Class474.anIntArray6382
					     [(((Class89_Sub3) this)
					       .anIntArray9704[i]) & 0xffff]),
					    (((Class189) (((Class89_Sub3) this)
							  .aClass189_9671))
					     .anInt2215) * -338296791,
					    f_2414_ * 255.0F, 1372221625));
	    } else {
		int i_2415_ = -16777216;
		if (((Class89_Sub3) this).aByteArray9711 != null)
		    i_2415_ = 255 - (((Class89_Sub3) this).aByteArray9711[i]
				     & 0xff) << 24;
		if (((Class89_Sub3) this).anIntArray9704[i] == -1) {
		    int i_2416_
			= i_2415_ | (((Class89_Sub3) this).anIntArray9710[i]
				     & 0xffffff);
		    ((Class89_Sub3) this).aClass155_9674.method3384
			(bool, bool_2388_, bool_2389_,
			 ((Class89_Sub3) this).aFloatArray9746[i_2410_],
			 ((Class89_Sub3) this).aFloatArray9746[i_2411_],
			 ((Class89_Sub3) this).aFloatArray9746[i_2412_],
			 ((Class89_Sub3) this).aFloatArray9745[i_2410_],
			 ((Class89_Sub3) this).aFloatArray9745[i_2411_],
			 ((Class89_Sub3) this).aFloatArray9745[i_2412_],
			 ((Class89_Sub3) this).aFloatArray9756[i_2410_],
			 ((Class89_Sub3) this).aFloatArray9756[i_2411_],
			 ((Class89_Sub3) this).aFloatArray9756[i_2412_],
			 ((Class89_Sub3) this).aFloatArray9700[i_2410_],
			 ((Class89_Sub3) this).aFloatArray9700[i_2411_],
			 ((Class89_Sub3) this).aFloatArray9700[i_2412_],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][0],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][1],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][2],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][0],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][1],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][2],
			 i_2416_, i_2416_, i_2416_,
			 (((Class189) ((Class89_Sub3) this).aClass189_9671)
			  .anInt2215) * -338296791,
			 f * 255.0F, f_2413_ * 255.0F, f_2414_ * 255.0F,
			 ((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
			 i_2390_);
		} else
		    ((Class89_Sub3) this).aClass155_9674.method3384
			(bool, bool_2388_, bool_2389_,
			 ((Class89_Sub3) this).aFloatArray9746[i_2410_],
			 ((Class89_Sub3) this).aFloatArray9746[i_2411_],
			 ((Class89_Sub3) this).aFloatArray9746[i_2412_],
			 ((Class89_Sub3) this).aFloatArray9745[i_2410_],
			 ((Class89_Sub3) this).aFloatArray9745[i_2411_],
			 ((Class89_Sub3) this).aFloatArray9745[i_2412_],
			 ((Class89_Sub3) this).aFloatArray9756[i_2410_],
			 ((Class89_Sub3) this).aFloatArray9756[i_2411_],
			 ((Class89_Sub3) this).aFloatArray9756[i_2412_],
			 ((Class89_Sub3) this).aFloatArray9700[i_2410_],
			 ((Class89_Sub3) this).aFloatArray9700[i_2411_],
			 ((Class89_Sub3) this).aFloatArray9700[i_2412_],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][0],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][1],
			 ((Class89_Sub3) this).aFloatArrayArray9720[i][2],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][0],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][1],
			 ((Class89_Sub3) this).aFloatArrayArray9703[i][2],
			 i_2415_ | (((Class89_Sub3) this).anIntArray9710[i]
				    & 0xffffff),
			 i_2415_ | (((Class89_Sub3) this).anIntArray9747[i]
				    & 0xffffff),
			 i_2415_ | (((Class89_Sub3) this).anIntArray9704[i]
				    & 0xffffff),
			 (((Class189) ((Class89_Sub3) this).aClass189_9671)
			  .anInt2215) * -338296791,
			 f * 255.0F, f_2413_ * 255.0F, f_2414_ * 255.0F,
			 ((Class89_Sub3) this).aShortArray9712[i] & 0xffff,
			 i_2390_);
	    }
	}
    }
    
    void method16132() {
	for (int i = 0; i < ((Class89_Sub3) this).anInt9691; i++) {
	    short i_2417_
		= (((Class89_Sub3) this).aShortArray9712 != null
		   ? ((Class89_Sub3) this).aShortArray9712[i] : (short) -1);
	    if (i_2417_ == -1) {
		int i_2418_
		    = ((Class89_Sub3) this).aShortArray9713[i] & 0xffff;
		int i_2419_
		    = (i_2418_ & 0x7f) * ((Class89_Sub3) this).anInt9707 >> 7;
		short i_2420_
		    = Class241_Sub42.method16451(i_2418_ & ~0x7f | i_2419_,
						 475415343);
		if (((Class89_Sub3) this).anIntArray9704[i] == -1) {
		    int i_2421_
			= ((Class89_Sub3) this).anIntArray9710[i] & ~0x1ffff;
		    ((Class89_Sub3) this).anIntArray9710[i]
			= i_2421_ | Class639.method13606(i_2420_,
							 i_2421_ >> 17,
							 -558751538);
		} else if (((Class89_Sub3) this).anIntArray9704[i] != -2) {
		    int i_2422_
			= ((Class89_Sub3) this).anIntArray9710[i] & ~0x1ffff;
		    ((Class89_Sub3) this).anIntArray9710[i]
			= i_2422_ | Class639.method13606(i_2420_,
							 i_2422_ >> 17,
							 1803415719);
		    i_2422_
			= ((Class89_Sub3) this).anIntArray9747[i] & ~0x1ffff;
		    ((Class89_Sub3) this).anIntArray9747[i]
			= i_2422_ | Class639.method13606(i_2420_,
							 i_2422_ >> 17,
							 -53949057);
		    i_2422_
			= ((Class89_Sub3) this).anIntArray9704[i] & ~0x1ffff;
		    ((Class89_Sub3) this).anIntArray9704[i]
			= i_2422_ | Class639.method13606(i_2420_,
							 i_2422_ >> 17,
							 2050894286);
		}
	    }
	}
	((Class89_Sub3) this).anInt9741 = 2;
    }
    
    void method1878() {
	if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
	     .anInt9274) * 592623211
	    > 1) {
	    synchronized (this) {
		aBool1298 = false;
		this.notifyAll();
	    }
	}
    }
    
    boolean method16133(int i, int i_2423_, float f, float f_2424_,
			float f_2425_, float f_2426_, float f_2427_,
			float f_2428_) {
	if ((float) i_2423_ < f && (float) i_2423_ < f_2424_
	    && (float) i_2423_ < f_2425_)
	    return false;
	if ((float) i_2423_ > f && (float) i_2423_ > f_2424_
	    && (float) i_2423_ > f_2425_)
	    return false;
	if ((float) i < f_2426_ && (float) i < f_2427_ && (float) i < f_2428_)
	    return false;
	if ((float) i > f_2426_ && (float) i > f_2427_ && (float) i > f_2428_)
	    return false;
	return true;
    }
    
    boolean method16134(int i, int i_2429_, float f, float f_2430_,
			float f_2431_, float f_2432_, float f_2433_,
			float f_2434_) {
	if ((float) i_2429_ < f && (float) i_2429_ < f_2430_
	    && (float) i_2429_ < f_2431_)
	    return false;
	if ((float) i_2429_ > f && (float) i_2429_ > f_2430_
	    && (float) i_2429_ > f_2431_)
	    return false;
	if ((float) i < f_2432_ && (float) i < f_2433_ && (float) i < f_2434_)
	    return false;
	if ((float) i > f_2432_ && (float) i > f_2433_ && (float) i > f_2434_)
	    return false;
	return true;
    }
    
    public void method1970(Class266 class266) {
	method16049(((Class89_Sub3) this).aClass103_Sub2_9690
			.method15377(Thread.currentThread()));
	Class268 class268
	    = ((Class189) ((Class89_Sub3) this).aClass189_9671).aClass268_2225;
	class268.method5203(class266);
	if (((Class89_Sub3) this).aClass106Array9724 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub3) this).aClass106Array9724.length; i++) {
		Class106 class106
		    = ((Class89_Sub3) this).aClass106Array9724[i];
		Class106 class106_2435_ = class106;
		if (class106.aClass106_1488 != null)
		    class106_2435_ = class106.aClass106_1488;
		class106_2435_.anInt1487
		    = (int) (class268.aFloatArray4353[12]
			     + ((class268.aFloatArray4353[0]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[4]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[8]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class106.anInt1490
						* 844698029)])))) * 548844199;
		class106_2435_.anInt1495
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class106.anInt1490
						* 844698029)])))) * -237372493;
		class106_2435_.anInt1498
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class106.anInt1490
						* 844698029)])))) * 1108321407;
		class106_2435_.anInt1497
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1696685061);
		class106_2435_.anInt1496
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1783587391);
		class106_2435_.anInt1499
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -425190479);
		class106_2435_.anInt1500
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * -1671800873);
		class106_2435_.anInt1501
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 1675759173);
		class106_2435_.anInt1502
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 2116418239);
	    }
	}
	if (((Class89_Sub3) this).aClass167Array9725 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub3) this).aClass167Array9725.length; i++) {
		Class167 class167
		    = ((Class89_Sub3) this).aClass167Array9725[i];
		Class167 class167_2436_ = class167;
		if (class167.aClass167_2057 != null)
		    class167_2436_ = class167.aClass167_2057;
		if (class167.aClass268_2061 != null)
		    class167.aClass268_2061.method5199(class268);
		else
		    class167.aClass268_2061 = new Class268(class268);
		class167_2436_.anInt2060
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [class167.anInt2058 * 294413539]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class167.anInt2058
						 * 294413539)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class167.anInt2058
						 * 294413539)]))))
		       * -1901304929);
		class167_2436_.anInt2062
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class167.anInt2058
						* 294413539)])))) * -290266353;
		class167_2436_.anInt2056
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class167.anInt2058
						* 294413539)])))) * 1003150305;
	    }
	}
    }
    
    void method1888() {
	if (((Class89_Sub3) this).aBool9719) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9686; i++) {
		((Class89_Sub3) this).anIntArray9670[i]
		    = ((Class89_Sub3) this).anIntArray9670[i] + 7 >> 4;
		((Class89_Sub3) this).anIntArray9685[i]
		    = ((Class89_Sub3) this).anIntArray9685[i] + 7 >> 4;
		((Class89_Sub3) this).anIntArray9684[i]
		    = ((Class89_Sub3) this).anIntArray9684[i] + 7 >> 4;
	    }
	    ((Class89_Sub3) this).aBool9719 = false;
	}
	if (((Class89_Sub3) this).aBool9718) {
	    method16055();
	    ((Class89_Sub3) this).aBool9718 = false;
	}
	((Class89_Sub3) this).aBool9730 = false;
    }
    
    public void method1972(Class266 class266) {
	method16049(((Class89_Sub3) this).aClass103_Sub2_9690
			.method15377(Thread.currentThread()));
	Class268 class268
	    = ((Class189) ((Class89_Sub3) this).aClass189_9671).aClass268_2225;
	class268.method5203(class266);
	if (((Class89_Sub3) this).aClass106Array9724 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub3) this).aClass106Array9724.length; i++) {
		Class106 class106
		    = ((Class89_Sub3) this).aClass106Array9724[i];
		Class106 class106_2437_ = class106;
		if (class106.aClass106_1488 != null)
		    class106_2437_ = class106.aClass106_1488;
		class106_2437_.anInt1487
		    = (int) (class268.aFloatArray4353[12]
			     + ((class268.aFloatArray4353[0]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[4]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[8]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class106.anInt1490
						* 844698029)])))) * 548844199;
		class106_2437_.anInt1495
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class106.anInt1490
						* 844698029)])))) * -237372493;
		class106_2437_.anInt1498
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class106.anInt1490 * 844698029]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class106.anInt1490
						* 844698029)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class106.anInt1490
						* 844698029)])))) * 1108321407;
		class106_2437_.anInt1497
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1696685061);
		class106_2437_.anInt1496
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -1783587391);
		class106_2437_.anInt1499
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1491
					       * -142222581)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1491
						 * -142222581)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1491
						 * -142222581)]))))
		       * -425190479);
		class106_2437_.anInt1500
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * -1671800873);
		class106_2437_.anInt1501
		    = ((int) (class268.aFloatArray4353[13]
			      + ((class268.aFloatArray4353[1]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[5]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[9]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 1675759173);
		class106_2437_.anInt1502
		    = ((int) (class268.aFloatArray4353[14]
			      + ((class268.aFloatArray4353[2]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [(class106.anInt1492
					       * 1756482407)]))
				 + (class268.aFloatArray4353[6]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class106.anInt1492
						 * 1756482407)]))
				 + (class268.aFloatArray4353[10]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class106.anInt1492
						 * 1756482407)]))))
		       * 2116418239);
	    }
	}
	if (((Class89_Sub3) this).aClass167Array9725 != null) {
	    for (int i = 0;
		 i < ((Class89_Sub3) this).aClass167Array9725.length; i++) {
		Class167 class167
		    = ((Class89_Sub3) this).aClass167Array9725[i];
		Class167 class167_2438_ = class167;
		if (class167.aClass167_2057 != null)
		    class167_2438_ = class167.aClass167_2057;
		if (class167.aClass268_2061 != null)
		    class167.aClass268_2061.method5199(class268);
		else
		    class167.aClass268_2061 = new Class268(class268);
		class167_2438_.anInt2060
		    = ((int) (class268.aFloatArray4353[12]
			      + ((class268.aFloatArray4353[0]
				  * (float) (((Class89_Sub3) this)
					     .anIntArray9670
					     [class167.anInt2058 * 294413539]))
				 + (class268.aFloatArray4353[4]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9685
					       [(class167.anInt2058
						 * 294413539)]))
				 + (class268.aFloatArray4353[8]
				    * (float) (((Class89_Sub3) this)
					       .anIntArray9684
					       [(class167.anInt2058
						 * 294413539)]))))
		       * -1901304929);
		class167_2438_.anInt2062
		    = (int) (class268.aFloatArray4353[13]
			     + ((class268.aFloatArray4353[1]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[5]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[9]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class167.anInt2058
						* 294413539)])))) * -290266353;
		class167_2438_.anInt2056
		    = (int) (class268.aFloatArray4353[14]
			     + ((class268.aFloatArray4353[2]
				 * (float) (((Class89_Sub3) this)
					    .anIntArray9670
					    [class167.anInt2058 * 294413539]))
				+ (class268.aFloatArray4353[6]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9685
					      [(class167.anInt2058
						* 294413539)]))
				+ (class268.aFloatArray4353[10]
				   * (float) (((Class89_Sub3) this)
					      .anIntArray9684
					      [(class167.anInt2058
						* 294413539)])))) * 1003150305;
	    }
	}
    }
    
    void method1952() {
	if ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
	     .anInt9274) * 592623211
	    > 1) {
	    synchronized (this) {
		aBool1298 = false;
		this.notifyAll();
	    }
	}
    }
    
    public Class241_Sub39_Sub17 method1898
	(Class241_Sub39_Sub17 class241_sub39_sub17) {
	return null;
    }
    
    void method16135(boolean bool) {
	if (((Class89_Sub3) this).anInt9741 == 1)
	    method16055();
	else if (((Class89_Sub3) this).anInt9741 == 2) {
	    if ((((Class89_Sub3) this).anInt9683 & 0x97098) == 0
		&& ((Class89_Sub3) this).aFloatArrayArray9720 == null)
		((Class89_Sub3) this).aShortArray9713 = null;
	    if (bool)
		((Class89_Sub3) this).aByteArray9709 = null;
	} else {
	    method16051();
	    int i
		= ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		    .anInt9266)
		   * 1091642367);
	    int i_2439_
		= ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		    .anInt9258)
		   * 2068876759);
	    int i_2440_
		= ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		    .anInt9273)
		   * -1017303393);
	    int i_2441_
		= ((((Class103_Sub2) ((Class89_Sub3) this).aClass103_Sub2_9690)
		    .anInt9255) * 380315217
		   >> 8);
	    int i_2442_ = 0;
	    int i_2443_ = 0;
	    if (((Class89_Sub3) this).anInt9715 != 0) {
		i_2442_ = (((Class103_Sub2) (((Class89_Sub3) this)
					     .aClass103_Sub2_9690)).anInt9256
			   * 971221760 / ((Class89_Sub3) this).anInt9715);
		i_2443_ = (((Class103_Sub2) (((Class89_Sub3) this)
					     .aClass103_Sub2_9690)).anInt9257
			   * 2007041280 / ((Class89_Sub3) this).anInt9715);
	    }
	    if (((Class89_Sub3) this).anIntArray9710 == null) {
		((Class89_Sub3) this).anIntArray9710
		    = new int[((Class89_Sub3) this).anInt9691];
		((Class89_Sub3) this).anIntArray9747
		    = new int[((Class89_Sub3) this).anInt9691];
		((Class89_Sub3) this).anIntArray9704
		    = new int[((Class89_Sub3) this).anInt9691];
	    }
	    for (int i_2444_ = 0; i_2444_ < ((Class89_Sub3) this).anInt9691;
		 i_2444_++) {
		byte i_2445_;
		if (((Class89_Sub3) this).aByteArray9709 == null)
		    i_2445_ = (byte) 0;
		else
		    i_2445_ = ((Class89_Sub3) this).aByteArray9709[i_2444_];
		byte i_2446_;
		if (((Class89_Sub3) this).aByteArray9711 == null)
		    i_2446_ = (byte) 0;
		else
		    i_2446_ = ((Class89_Sub3) this).aByteArray9711[i_2444_];
		short i_2447_;
		if (((Class89_Sub3) this).aShortArray9712 == null)
		    i_2447_ = (short) -1;
		else
		    i_2447_ = ((Class89_Sub3) this).aShortArray9712[i_2444_];
		if (i_2446_ == -2)
		    i_2445_ = (byte) 3;
		if (i_2446_ == -1)
		    i_2445_ = (byte) 2;
		if (i_2447_ == -1) {
		    if (i_2445_ == 0) {
			int i_2448_
			    = (((Class89_Sub3) this).aShortArray9713[i_2444_]
			       & 0xffff);
			int i_2449_ = (((i_2448_ & 0x7f)
					* ((Class89_Sub3) this).anInt9707)
				       >> 7);
			short i_2450_
			    = Class241_Sub42.method16451((i_2448_ & ~0x7f
							  | i_2449_),
							 -212967716);
			Class204 class204;
			if (((Class89_Sub3) this).aClass204Array9744 != null
			    && (((Class89_Sub3) this).aClass204Array9744
				[(((Class89_Sub3) this).aShortArray9696
				  [i_2444_])]) != null)
			    class204
				= (((Class89_Sub3) this).aClass204Array9744
				   [(((Class89_Sub3) this).aShortArray9696
				     [i_2444_])]);
			else
			    class204
				= (((Class89_Sub3) this).aClass204Array9692
				   [(((Class89_Sub3) this).aShortArray9696
				     [i_2444_])]);
			int i_2451_
			    = (((i * ((Class204) class204).anInt2429
				 + i_2439_ * ((Class204) class204).anInt2427
				 + i_2440_ * ((Class204) class204).anInt2428)
				/ ((Class204) class204).anInt2426)
			       >> 16);
			int i_2452_ = i_2451_ > 256 ? i_2442_ : i_2443_;
			int i_2453_
			    = (i_2441_ >> 1) + (i_2452_ * i_2451_ >> 17);
			((Class89_Sub3) this).anIntArray9710[i_2444_]
			    = i_2453_ << 17 | Class639.method13606(i_2450_,
								   i_2453_,
								   443347910);
			if (((Class89_Sub3) this).aClass204Array9744 != null
			    && (((Class89_Sub3) this).aClass204Array9744
				[(((Class89_Sub3) this).aShortArray9697
				  [i_2444_])]) != null)
			    class204
				= (((Class89_Sub3) this).aClass204Array9744
				   [(((Class89_Sub3) this).aShortArray9697
				     [i_2444_])]);
			else
			    class204
				= (((Class89_Sub3) this).aClass204Array9692
				   [(((Class89_Sub3) this).aShortArray9697
				     [i_2444_])]);
			i_2451_
			    = ((i * ((Class204) class204).anInt2429
				+ i_2439_ * ((Class204) class204).anInt2427
				+ i_2440_ * ((Class204) class204).anInt2428)
			       / ((Class204) class204).anInt2426) >> 16;
			i_2452_ = i_2451_ > 256 ? i_2442_ : i_2443_;
			i_2453_ = (i_2441_ >> 1) + (i_2452_ * i_2451_ >> 17);
			((Class89_Sub3) this).anIntArray9747[i_2444_]
			    = (i_2453_ << 17
			       | Class639.method13606(i_2450_, i_2453_,
						      -1883967344));
			if (((Class89_Sub3) this).aClass204Array9744 != null
			    && (((Class89_Sub3) this).aClass204Array9744
				[(((Class89_Sub3) this).aShortArray9698
				  [i_2444_])]) != null)
			    class204
				= (((Class89_Sub3) this).aClass204Array9744
				   [(((Class89_Sub3) this).aShortArray9698
				     [i_2444_])]);
			else
			    class204
				= (((Class89_Sub3) this).aClass204Array9692
				   [(((Class89_Sub3) this).aShortArray9698
				     [i_2444_])]);
			i_2451_
			    = ((i * ((Class204) class204).anInt2429
				+ i_2439_ * ((Class204) class204).anInt2427
				+ i_2440_ * ((Class204) class204).anInt2428)
			       / ((Class204) class204).anInt2426) >> 16;
			i_2452_ = i_2451_ > 256 ? i_2442_ : i_2443_;
			i_2453_ = (i_2441_ >> 1) + (i_2452_ * i_2451_ >> 17);
			((Class89_Sub3) this).anIntArray9704[i_2444_]
			    = (i_2453_ << 17
			       | Class639.method13606(i_2450_, i_2453_,
						      -1315902790));
		    } else if (i_2445_ == 1) {
			int i_2454_
			    = (((Class89_Sub3) this).aShortArray9713[i_2444_]
			       & 0xffff);
			int i_2455_ = (((i_2454_ & 0x7f)
					* ((Class89_Sub3) this).anInt9707)
				       >> 7);
			short i_2456_
			    = Class241_Sub42.method16451((i_2454_ & ~0x7f
							  | i_2455_),
							 -1967081787);
			Class188 class188 = (((Class89_Sub3) this)
					     .aClass188Array9708[i_2444_]);
			int i_2457_
			    = ((i * ((Class188) class188).anInt2206
				+ i_2439_ * ((Class188) class188).anInt2207
				+ i_2440_ * ((Class188) class188).anInt2208)
			       >> 16);
			int i_2458_ = i_2457_ > 256 ? i_2442_ : i_2443_;
			int i_2459_
			    = (i_2441_ >> 1) + (i_2458_ * i_2457_ >> 17);
			((Class89_Sub3) this).anIntArray9710[i_2444_]
			    = (i_2459_ << 17
			       | Class639.method13606(i_2456_, i_2459_,
						      -1584151835));
			((Class89_Sub3) this).anIntArray9704[i_2444_] = -1;
		    } else if (i_2445_ == 3) {
			((Class89_Sub3) this).anIntArray9710[i_2444_] = 128;
			((Class89_Sub3) this).anIntArray9704[i_2444_] = -1;
		    } else
			((Class89_Sub3) this).anIntArray9704[i_2444_] = -2;
		} else {
		    int i_2460_
			= (((Class89_Sub3) this).aShortArray9713[i_2444_]
			   & 0xffff);
		    if (i_2445_ == 0) {
			Class204 class204;
			if (((Class89_Sub3) this).aClass204Array9744 != null
			    && (((Class89_Sub3) this).aClass204Array9744
				[(((Class89_Sub3) this).aShortArray9696
				  [i_2444_])]) != null)
			    class204
				= (((Class89_Sub3) this).aClass204Array9744
				   [(((Class89_Sub3) this).aShortArray9696
				     [i_2444_])]);
			else
			    class204
				= (((Class89_Sub3) this).aClass204Array9692
				   [(((Class89_Sub3) this).aShortArray9696
				     [i_2444_])]);
			int i_2461_
			    = (((i * ((Class204) class204).anInt2429
				 + i_2439_ * ((Class204) class204).anInt2427
				 + i_2440_ * ((Class204) class204).anInt2428)
				/ ((Class204) class204).anInt2426)
			       >> 16);
			int i_2462_ = i_2461_ > 256 ? i_2442_ : i_2443_;
			int i_2463_
			    = method16054((i_2441_ >> 2) + (i_2462_ * i_2461_
							    >> 18));
			((Class89_Sub3) this).anIntArray9710[i_2444_]
			    = i_2463_ << 24 | method16126(i_2460_, i_2447_,
							  i_2463_);
			if (((Class89_Sub3) this).aClass204Array9744 != null
			    && (((Class89_Sub3) this).aClass204Array9744
				[(((Class89_Sub3) this).aShortArray9697
				  [i_2444_])]) != null)
			    class204
				= (((Class89_Sub3) this).aClass204Array9744
				   [(((Class89_Sub3) this).aShortArray9697
				     [i_2444_])]);
			else
			    class204
				= (((Class89_Sub3) this).aClass204Array9692
				   [(((Class89_Sub3) this).aShortArray9697
				     [i_2444_])]);
			i_2461_
			    = ((i * ((Class204) class204).anInt2429
				+ i_2439_ * ((Class204) class204).anInt2427
				+ i_2440_ * ((Class204) class204).anInt2428)
			       / ((Class204) class204).anInt2426) >> 16;
			i_2462_ = i_2461_ > 256 ? i_2442_ : i_2443_;
			i_2463_
			    = method16054((i_2441_ >> 2) + (i_2462_ * i_2461_
							    >> 18));
			((Class89_Sub3) this).anIntArray9747[i_2444_]
			    = i_2463_ << 24 | method16126(i_2460_, i_2447_,
							  i_2463_);
			if (((Class89_Sub3) this).aClass204Array9744 != null
			    && (((Class89_Sub3) this).aClass204Array9744
				[(((Class89_Sub3) this).aShortArray9698
				  [i_2444_])]) != null)
			    class204
				= (((Class89_Sub3) this).aClass204Array9744
				   [(((Class89_Sub3) this).aShortArray9698
				     [i_2444_])]);
			else
			    class204
				= (((Class89_Sub3) this).aClass204Array9692
				   [(((Class89_Sub3) this).aShortArray9698
				     [i_2444_])]);
			i_2461_
			    = ((i * ((Class204) class204).anInt2429
				+ i_2439_ * ((Class204) class204).anInt2427
				+ i_2440_ * ((Class204) class204).anInt2428)
			       / ((Class204) class204).anInt2426) >> 16;
			i_2462_ = i_2461_ > 256 ? i_2442_ : i_2443_;
			i_2463_
			    = method16054((i_2441_ >> 2) + (i_2462_ * i_2461_
							    >> 18));
			((Class89_Sub3) this).anIntArray9704[i_2444_]
			    = i_2463_ << 24 | method16126(i_2460_, i_2447_,
							  i_2463_);
		    } else if (i_2445_ == 1) {
			Class188 class188 = (((Class89_Sub3) this)
					     .aClass188Array9708[i_2444_]);
			int i_2464_
			    = ((i * ((Class188) class188).anInt2206
				+ i_2439_ * ((Class188) class188).anInt2207
				+ i_2440_ * ((Class188) class188).anInt2208)
			       >> 16);
			int i_2465_ = i_2464_ > 256 ? i_2442_ : i_2443_;
			int i_2466_
			    = method16054((i_2441_ >> 2) + (i_2465_ * i_2464_
							    >> 18));
			((Class89_Sub3) this).anIntArray9710[i_2444_]
			    = i_2466_ << 24 | method16126(i_2460_, i_2447_,
							  i_2466_);
			((Class89_Sub3) this).anIntArray9704[i_2444_] = -1;
		    } else
			((Class89_Sub3) this).anIntArray9704[i_2444_] = -2;
		}
	    }
	    ((Class89_Sub3) this).aClass204Array9692 = null;
	    ((Class89_Sub3) this).aClass204Array9744 = null;
	    ((Class89_Sub3) this).aClass188Array9708 = null;
	    if ((((Class89_Sub3) this).anInt9683 & 0x97098) == 0
		&& ((Class89_Sub3) this).aFloatArrayArray9720 == null)
		((Class89_Sub3) this).aShortArray9713 = null;
	    if (bool)
		((Class89_Sub3) this).aByteArray9709 = null;
	    ((Class89_Sub3) this).anInt9741 = 2;
	}
    }
    
    public void method1939(int i, int i_2467_, int i_2468_) {
	if (i != 0 && (((Class89_Sub3) this).anInt9683 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_2467_ != 0 && (((Class89_Sub3) this).anInt9683 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_2468_ != 0 && (((Class89_Sub3) this).anInt9683 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_2469_ = 0; i_2469_ < ((Class89_Sub3) this).anInt9686;
		 i_2469_++) {
		((Class89_Sub3) this).anIntArray9670[i_2469_] += i;
		((Class89_Sub3) this).anIntArray9685[i_2469_] += i_2467_;
		((Class89_Sub3) this).anIntArray9684[i_2469_] += i_2468_;
	    }
	}
    }
    
    void method16136() {
	if (!((Class89_Sub3) this).aBool9730) {
	    int i = 0;
	    int i_2470_ = 0;
	    int i_2471_ = 32767;
	    int i_2472_ = 32767;
	    int i_2473_ = 32767;
	    int i_2474_ = -32768;
	    int i_2475_ = -32768;
	    int i_2476_ = -32768;
	    for (int i_2477_ = 0; i_2477_ < ((Class89_Sub3) this).anInt9687;
		 i_2477_++) {
		int i_2478_ = ((Class89_Sub3) this).anIntArray9670[i_2477_];
		int i_2479_ = ((Class89_Sub3) this).anIntArray9685[i_2477_];
		int i_2480_ = ((Class89_Sub3) this).anIntArray9684[i_2477_];
		if (i_2478_ < i_2471_)
		    i_2471_ = i_2478_;
		if (i_2478_ > i_2474_)
		    i_2474_ = i_2478_;
		if (i_2479_ < i_2472_)
		    i_2472_ = i_2479_;
		if (i_2479_ > i_2475_)
		    i_2475_ = i_2479_;
		if (i_2480_ < i_2473_)
		    i_2473_ = i_2480_;
		if (i_2480_ > i_2476_)
		    i_2476_ = i_2480_;
		int i_2481_ = i_2478_ * i_2478_ + i_2480_ * i_2480_;
		if (i_2481_ > i)
		    i = i_2481_;
		i_2481_ += i_2479_ * i_2479_;
		if (i_2481_ > i_2470_)
		    i_2470_ = i_2481_;
	    }
	    ((Class89_Sub3) this).aShort9735 = (short) i_2471_;
	    ((Class89_Sub3) this).aShort9736 = (short) i_2474_;
	    ((Class89_Sub3) this).aShort9733 = (short) i_2472_;
	    ((Class89_Sub3) this).aShort9734 = (short) i_2475_;
	    ((Class89_Sub3) this).aShort9737 = (short) i_2473_;
	    ((Class89_Sub3) this).aShort9738 = (short) i_2476_;
	    ((Class89_Sub3) this).aShort9731
		= (short) (int) (Math.sqrt((double) i) + 0.99);
	    ((Class89_Sub3) this).aShort9732
		= (short) (int) (Math.sqrt((double) i_2470_) + 0.99);
	    ((Class89_Sub3) this).aBool9730 = true;
	}
    }
    
    void method16137() {
	if (!((Class89_Sub3) this).aBool9730) {
	    int i = 0;
	    int i_2482_ = 0;
	    int i_2483_ = 32767;
	    int i_2484_ = 32767;
	    int i_2485_ = 32767;
	    int i_2486_ = -32768;
	    int i_2487_ = -32768;
	    int i_2488_ = -32768;
	    for (int i_2489_ = 0; i_2489_ < ((Class89_Sub3) this).anInt9687;
		 i_2489_++) {
		int i_2490_ = ((Class89_Sub3) this).anIntArray9670[i_2489_];
		int i_2491_ = ((Class89_Sub3) this).anIntArray9685[i_2489_];
		int i_2492_ = ((Class89_Sub3) this).anIntArray9684[i_2489_];
		if (i_2490_ < i_2483_)
		    i_2483_ = i_2490_;
		if (i_2490_ > i_2486_)
		    i_2486_ = i_2490_;
		if (i_2491_ < i_2484_)
		    i_2484_ = i_2491_;
		if (i_2491_ > i_2487_)
		    i_2487_ = i_2491_;
		if (i_2492_ < i_2485_)
		    i_2485_ = i_2492_;
		if (i_2492_ > i_2488_)
		    i_2488_ = i_2492_;
		int i_2493_ = i_2490_ * i_2490_ + i_2492_ * i_2492_;
		if (i_2493_ > i)
		    i = i_2493_;
		i_2493_ += i_2491_ * i_2491_;
		if (i_2493_ > i_2482_)
		    i_2482_ = i_2493_;
	    }
	    ((Class89_Sub3) this).aShort9735 = (short) i_2483_;
	    ((Class89_Sub3) this).aShort9736 = (short) i_2486_;
	    ((Class89_Sub3) this).aShort9733 = (short) i_2484_;
	    ((Class89_Sub3) this).aShort9734 = (short) i_2487_;
	    ((Class89_Sub3) this).aShort9737 = (short) i_2485_;
	    ((Class89_Sub3) this).aShort9738 = (short) i_2488_;
	    ((Class89_Sub3) this).aShort9731
		= (short) (int) (Math.sqrt((double) i) + 0.99);
	    ((Class89_Sub3) this).aShort9732
		= (short) (int) (Math.sqrt((double) i_2482_) + 0.99);
	    ((Class89_Sub3) this).aBool9730 = true;
	}
    }
    
    public void method1956() {
	if (!((Class89_Sub3) this).aBool9739) {
	    if (!((Class89_Sub3) this).aBool9730)
		method16077();
	    ((Class89_Sub3) this).aShort9740
		= ((Class89_Sub3) this).aShort9733;
	    ((Class89_Sub3) this).aBool9739 = true;
	}
    }
    
    public int method1978() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9731;
    }
    
    public int method1979() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9732;
    }
    
    public int method1900() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9732;
    }
    
    public int method1981() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9735;
    }
    
    public void method1997(Class89 class89, int i, int i_2494_, int i_2495_,
			   boolean bool) {
	Class89_Sub3 class89_sub3_2496_ = (Class89_Sub3) class89;
	if ((((Class89_Sub3) this).anInt9683 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	if ((((Class89_Sub3) class89_sub3_2496_).anInt9683 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	method16049(((Class89_Sub3) this).aClass103_Sub2_9690
			.method15377(Thread.currentThread()));
	method16077();
	method16051();
	class89_sub3_2496_.method16077();
	class89_sub3_2496_.method16051();
	anInt9699++;
	int i_2497_ = 0;
	int[] is = ((Class89_Sub3) class89_sub3_2496_).anIntArray9670;
	int i_2498_ = ((Class89_Sub3) class89_sub3_2496_).anInt9687;
	for (int i_2499_ = 0; i_2499_ < ((Class89_Sub3) this).anInt9687;
	     i_2499_++) {
	    Class204 class204
		= ((Class89_Sub3) this).aClass204Array9692[i_2499_];
	    if (((Class204) class204).anInt2426 != 0) {
		int i_2500_
		    = ((Class89_Sub3) this).anIntArray9685[i_2499_] - i_2494_;
		if (i_2500_ >= ((Class89_Sub3) class89_sub3_2496_).aShort9733
		    && (i_2500_
			<= ((Class89_Sub3) class89_sub3_2496_).aShort9734)) {
		    int i_2501_
			= ((Class89_Sub3) this).anIntArray9670[i_2499_] - i;
		    if ((i_2501_
			 >= ((Class89_Sub3) class89_sub3_2496_).aShort9735)
			&& i_2501_ <= (((Class89_Sub3) class89_sub3_2496_)
				       .aShort9736)) {
			int i_2502_
			    = (((Class89_Sub3) this).anIntArray9684[i_2499_]
			       - i_2495_);
			if ((i_2502_
			     >= ((Class89_Sub3) class89_sub3_2496_).aShort9737)
			    && i_2502_ <= (((Class89_Sub3) class89_sub3_2496_)
					   .aShort9738)) {
			    for (int i_2503_ = 0; i_2503_ < i_2498_;
				 i_2503_++) {
				Class204 class204_2504_
				    = (((Class89_Sub3) class89_sub3_2496_)
				       .aClass204Array9692[i_2503_]);
				if (i_2501_ == is[i_2503_]
				    && (i_2502_
					== (((Class89_Sub3) class89_sub3_2496_)
					    .anIntArray9684[i_2503_]))
				    && (i_2500_
					== (((Class89_Sub3) class89_sub3_2496_)
					    .anIntArray9685[i_2503_]))
				    && (((Class204) class204_2504_).anInt2426
					!= 0)) {
				    if ((((Class89_Sub3) this)
					 .aClass204Array9744)
					== null)
					((Class89_Sub3) this)
					    .aClass204Array9744
					    = new Class204[((Class89_Sub3)
							    this).anInt9687];
				    if ((((Class89_Sub3) class89_sub3_2496_)
					 .aClass204Array9744)
					== null)
					((Class89_Sub3) class89_sub3_2496_)
					    .aClass204Array9744
					    = new Class204[i_2498_];
				    Class204 class204_2505_
					= (((Class89_Sub3) this)
					   .aClass204Array9744[i_2499_]);
				    if (class204_2505_ == null)
					class204_2505_
					    = ((Class89_Sub3) this)
						  .aClass204Array9744[i_2499_]
					    = new Class204(class204);
				    Class204 class204_2506_
					= (((Class89_Sub3) class89_sub3_2496_)
					   .aClass204Array9744[i_2503_]);
				    if (class204_2506_ == null)
					class204_2506_
					    = ((Class89_Sub3)
					       class89_sub3_2496_)
						  .aClass204Array9744[i_2503_]
					    = new Class204(class204_2504_);
				    ((Class204) class204_2505_).anInt2429
					+= (((Class204) class204_2504_)
					    .anInt2429);
				    ((Class204) class204_2505_).anInt2427
					+= (((Class204) class204_2504_)
					    .anInt2427);
				    ((Class204) class204_2505_).anInt2428
					+= (((Class204) class204_2504_)
					    .anInt2428);
				    ((Class204) class204_2505_).anInt2426
					+= (((Class204) class204_2504_)
					    .anInt2426);
				    ((Class204) class204_2506_).anInt2429
					+= ((Class204) class204).anInt2429;
				    ((Class204) class204_2506_).anInt2427
					+= ((Class204) class204).anInt2427;
				    ((Class204) class204_2506_).anInt2428
					+= ((Class204) class204).anInt2428;
				    ((Class204) class204_2506_).anInt2426
					+= ((Class204) class204).anInt2426;
				    i_2497_++;
				    ((Class89_Sub3) this).anIntArray9752
					[i_2499_]
					= anInt9699;
				    ((Class89_Sub3) this).anIntArray9753
					[i_2503_]
					= anInt9699;
				}
			    }
			}
		    }
		}
	    }
	}
	if (i_2497_ >= 3 && bool) {
	    for (int i_2507_ = 0; i_2507_ < ((Class89_Sub3) this).anInt9691;
		 i_2507_++) {
		if (((((Class89_Sub3) this).anIntArray9752
		      [((Class89_Sub3) this).aShortArray9696[i_2507_]])
		     == anInt9699)
		    && ((((Class89_Sub3) this).anIntArray9752
			 [((Class89_Sub3) this).aShortArray9697[i_2507_]])
			== anInt9699)
		    && ((((Class89_Sub3) this).anIntArray9752
			 [((Class89_Sub3) this).aShortArray9698[i_2507_]])
			== anInt9699)) {
		    if (((Class89_Sub3) this).aByteArray9709 == null)
			((Class89_Sub3) this).aByteArray9709
			    = new byte[((Class89_Sub3) this).anInt9691];
		    ((Class89_Sub3) this).aByteArray9709[i_2507_] = (byte) 2;
		}
	    }
	    for (int i_2508_ = 0;
		 i_2508_ < ((Class89_Sub3) class89_sub3_2496_).anInt9691;
		 i_2508_++) {
		if ((((Class89_Sub3) this).anIntArray9753
		     [(((Class89_Sub3) class89_sub3_2496_).aShortArray9696
		       [i_2508_])]) == anInt9699
		    && (((Class89_Sub3) this).anIntArray9753
			[(((Class89_Sub3) class89_sub3_2496_).aShortArray9697
			  [i_2508_])]) == anInt9699
		    && (((Class89_Sub3) this).anIntArray9753
			[(((Class89_Sub3) class89_sub3_2496_).aShortArray9698
			  [i_2508_])]) == anInt9699) {
		    if (((Class89_Sub3) class89_sub3_2496_).aByteArray9709
			== null)
			((Class89_Sub3) class89_sub3_2496_).aByteArray9709
			    = new byte[(((Class89_Sub3) class89_sub3_2496_)
					.anInt9691)];
		    ((Class89_Sub3) class89_sub3_2496_).aByteArray9709[i_2508_]
			= (byte) 2;
		}
	    }
	}
    }
    
    public int method1983() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9736;
    }
    
    public int method2005() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9733;
    }
    
    public int method1940() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9733;
    }
    
    int method16138(int i, short i_2509_, int i_2510_) {
	int i_2511_ = Class474.anIntArray6383[method16048(i, i_2510_)];
	Class101 class101
	    = ((Class89_Sub3) this).aClass103_Sub2_9690.aClass107_1458
		  .method2680(i_2509_ & 0xffff, 1425216785);
	int i_2512_ = class101.aByte1430 & 0xff;
	if (i_2512_ != 0) {
	    int i_2513_ = 131586 * i_2510_;
	    if (i_2512_ == 256)
		i_2511_ = i_2513_;
	    else {
		int i_2514_ = i_2512_;
		int i_2515_ = 256 - i_2512_;
		i_2511_ = ((((i_2513_ & 0xff00ff) * i_2514_
			     + (i_2511_ & 0xff00ff) * i_2515_)
			    & ~0xff00ff)
			   + (((i_2513_ & 0xff00) * i_2514_
			       + (i_2511_ & 0xff00) * i_2515_)
			      & 0xff0000)) >> 8;
	    }
	}
	int i_2516_ = class101.aByte1433 & 0xff;
	if (i_2516_ != 0) {
	    i_2516_ += 256;
	    int i_2517_ = ((i_2511_ & 0xff0000) >> 16) * i_2516_;
	    if (i_2517_ > 65535)
		i_2517_ = 65535;
	    int i_2518_ = ((i_2511_ & 0xff00) >> 8) * i_2516_;
	    if (i_2518_ > 65535)
		i_2518_ = 65535;
	    int i_2519_ = (i_2511_ & 0xff) * i_2516_;
	    if (i_2519_ > 65535)
		i_2519_ = 65535;
	    i_2511_ = (i_2517_ << 8 & 0xff0000) + (i_2518_ & 0xff00) + (i_2519_
									>> 8);
	}
	return i_2511_;
    }
    
    public void method2024(int i, int i_2520_, int i_2521_) {
	if (i != 128 && (((Class89_Sub3) this).anInt9683 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_2520_ != 128 && (((Class89_Sub3) this).anInt9683 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_2521_ != 128 && (((Class89_Sub3) this).anInt9683 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_2522_ = 0; i_2522_ < ((Class89_Sub3) this).anInt9686;
		 i_2522_++) {
		((Class89_Sub3) this).anIntArray9670[i_2522_]
		    = ((Class89_Sub3) this).anIntArray9670[i_2522_] * i >> 7;
		((Class89_Sub3) this).anIntArray9685[i_2522_]
		    = (((Class89_Sub3) this).anIntArray9685[i_2522_] * i_2520_
		       >> 7);
		((Class89_Sub3) this).anIntArray9684[i_2522_]
		    = (((Class89_Sub3) this).anIntArray9684[i_2522_] * i_2521_
		       >> 7);
	    }
	    ((Class89_Sub3) this).aBool9730 = false;
	}
    }
    
    public int method1988() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9737;
    }
    
    public int method1989() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9737;
    }
    
    public int method1880() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9738;
    }
    
    public int method1991() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9738;
    }
    
    public int method1992() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9738;
    }
    
    public int method1919() {
	if (!((Class89_Sub3) this).aBool9739)
	    method1922();
	return ((Class89_Sub3) this).aShort9740;
    }
    
    public void method1984(int i) {
	if ((((Class89_Sub3) this).anInt9683 & 0x1000) != 4096)
	    throw new IllegalStateException();
	((Class89_Sub3) this).anInt9707 = i;
	((Class89_Sub3) this).anInt9741 = 0;
    }
    
    public void method1995(int i) {
	if ((((Class89_Sub3) this).anInt9683 & 0x2000) != 8192)
	    throw new IllegalStateException();
	((Class89_Sub3) this).anInt9715 = i;
	((Class89_Sub3) this).anInt9741 = 0;
    }
    
    public void method1885(int i) {
	if ((((Class89_Sub3) this).anInt9683 & 0x2000) != 8192)
	    throw new IllegalStateException();
	((Class89_Sub3) this).anInt9715 = i;
	((Class89_Sub3) this).anInt9741 = 0;
    }
    
    public void method1973(int i) {
	if ((((Class89_Sub3) this).anInt9683 & 0x2000) != 8192)
	    throw new IllegalStateException();
	((Class89_Sub3) this).anInt9715 = i;
	((Class89_Sub3) this).anInt9741 = 0;
    }
    
    public int method1987() {
	if (!((Class89_Sub3) this).aBool9730)
	    method16077();
	return ((Class89_Sub3) this).aShort9737;
    }
    
    public int method1999() {
	return ((Class89_Sub3) this).anInt9707;
    }
    
    public int method2000() {
	return ((Class89_Sub3) this).anInt9707;
    }
    
    public int method2001() {
	return ((Class89_Sub3) this).anInt9707;
    }
    
    public int method1974() {
	return ((Class89_Sub3) this).anInt9707;
    }
    
    public int method2003() {
	return ((Class89_Sub3) this).anInt9715;
    }
    
    public int method2004() {
	return ((Class89_Sub3) this).anInt9715;
    }
    
    public byte[] method2054() {
	return ((Class89_Sub3) this).aByteArray9711;
    }
    
    public int method1924() {
	return ((Class89_Sub3) this).anInt9683;
    }
    
    public byte[] method2007() {
	return ((Class89_Sub3) this).aByteArray9711;
    }
    
    void method1963(int i, int[] is, int i_2523_, int i_2524_, int i_2525_,
		    boolean bool, int i_2526_, int[] is_2527_) {
	int i_2528_ = is.length;
	if (i == 0) {
	    i_2523_ <<= 4;
	    i_2524_ <<= 4;
	    i_2525_ <<= 4;
	    if (!((Class89_Sub3) this).aBool9719) {
		for (int i_2529_ = 0;
		     i_2529_ < ((Class89_Sub3) this).anInt9686; i_2529_++) {
		    ((Class89_Sub3) this).anIntArray9670[i_2529_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9685[i_2529_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9684[i_2529_] <<= 4;
		}
		((Class89_Sub3) this).aBool9719 = true;
	    }
	    int i_2530_ = 0;
	    ((Class89_Sub3) this).anInt9717 = 0;
	    ((Class89_Sub3) this).anInt9721 = 0;
	    ((Class89_Sub3) this).anInt9722 = 0;
	    for (int i_2531_ = 0; i_2531_ < i_2528_; i_2531_++) {
		int i_2532_ = is[i_2531_];
		if (i_2532_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_2533_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_2532_];
		    for (int i_2534_ = 0; i_2534_ < is_2533_.length;
			 i_2534_++) {
			int i_2535_ = is_2533_[i_2534_];
			if (((Class89_Sub3) this).aShortArray9679 == null
			    || (i_2526_ & (((Class89_Sub3) this)
					   .aShortArray9679[i_2535_])) != 0) {
			    ((Class89_Sub3) this).anInt9717
				+= (((Class89_Sub3) this).anIntArray9670
				    [i_2535_]);
			    ((Class89_Sub3) this).anInt9721
				+= (((Class89_Sub3) this).anIntArray9685
				    [i_2535_]);
			    ((Class89_Sub3) this).anInt9722
				+= (((Class89_Sub3) this).anIntArray9684
				    [i_2535_]);
			    i_2530_++;
			}
		    }
		}
	    }
	    if (i_2530_ > 0) {
		((Class89_Sub3) this).anInt9717
		    = ((Class89_Sub3) this).anInt9717 / i_2530_ + i_2523_;
		((Class89_Sub3) this).anInt9721
		    = ((Class89_Sub3) this).anInt9721 / i_2530_ + i_2524_;
		((Class89_Sub3) this).anInt9722
		    = ((Class89_Sub3) this).anInt9722 / i_2530_ + i_2525_;
		((Class89_Sub3) this).aBool9723 = true;
	    } else {
		((Class89_Sub3) this).anInt9717 = i_2523_;
		((Class89_Sub3) this).anInt9721 = i_2524_;
		((Class89_Sub3) this).anInt9722 = i_2525_;
	    }
	} else if (i == 1) {
	    if (is_2527_ != null) {
		int i_2536_ = ((is_2527_[0] * i_2523_ + is_2527_[1] * i_2524_
				+ is_2527_[2] * i_2525_ + 8192)
			       >> 14);
		int i_2537_ = ((is_2527_[3] * i_2523_ + is_2527_[4] * i_2524_
				+ is_2527_[5] * i_2525_ + 8192)
			       >> 14);
		int i_2538_ = ((is_2527_[6] * i_2523_ + is_2527_[7] * i_2524_
				+ is_2527_[8] * i_2525_ + 8192)
			       >> 14);
		i_2523_ = i_2536_;
		i_2524_ = i_2537_;
		i_2525_ = i_2538_;
	    }
	    i_2523_ <<= 4;
	    i_2524_ <<= 4;
	    i_2525_ <<= 4;
	    if (!((Class89_Sub3) this).aBool9719) {
		for (int i_2539_ = 0;
		     i_2539_ < ((Class89_Sub3) this).anInt9686; i_2539_++) {
		    ((Class89_Sub3) this).anIntArray9670[i_2539_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9685[i_2539_] <<= 4;
		    ((Class89_Sub3) this).anIntArray9684[i_2539_] <<= 4;
		}
		((Class89_Sub3) this).aBool9719 = true;
	    }
	    for (int i_2540_ = 0; i_2540_ < i_2528_; i_2540_++) {
		int i_2541_ = is[i_2540_];
		if (i_2541_
		    < ((Class89_Sub3) this).anIntArrayArray9716.length) {
		    int[] is_2542_
			= ((Class89_Sub3) this).anIntArrayArray9716[i_2541_];
		    for (int i_2543_ = 0; i_2543_ < is_2542_.length;
			 i_2543_++) {
			int i_2544_ = is_2542_[i_2543_];
			if (((Class89_Sub3) this).aShortArray9679 == null
			    || (i_2526_ & (((Class89_Sub3) this)
					   .aShortArray9679[i_2544_])) != 0) {
			    ((Class89_Sub3) this).anIntArray9670[i_2544_]
				+= i_2523_;
			    ((Class89_Sub3) this).anIntArray9685[i_2544_]
				+= i_2524_;
			    ((Class89_Sub3) this).anIntArray9684[i_2544_]
				+= i_2525_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_2527_ != null) {
		if (!((Class89_Sub3) this).aBool9719) {
		    for (int i_2545_ = 0;
			 i_2545_ < ((Class89_Sub3) this).anInt9686;
			 i_2545_++) {
			((Class89_Sub3) this).anIntArray9670[i_2545_] <<= 4;
			((Class89_Sub3) this).anIntArray9685[i_2545_] <<= 4;
			((Class89_Sub3) this).anIntArray9684[i_2545_] <<= 4;
		    }
		    ((Class89_Sub3) this).aBool9719 = true;
		}
		int i_2546_ = is_2527_[9] << 4;
		int i_2547_ = is_2527_[10] << 4;
		int i_2548_ = is_2527_[11] << 4;
		int i_2549_ = is_2527_[12] << 4;
		int i_2550_ = is_2527_[13] << 4;
		int i_2551_ = is_2527_[14] << 4;
		if (((Class89_Sub3) this).aBool9723) {
		    int i_2552_
			= ((is_2527_[0] * ((Class89_Sub3) this).anInt9717
			    + is_2527_[3] * ((Class89_Sub3) this).anInt9721
			    + is_2527_[6] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    int i_2553_
			= ((is_2527_[1] * ((Class89_Sub3) this).anInt9717
			    + is_2527_[4] * ((Class89_Sub3) this).anInt9721
			    + is_2527_[7] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    int i_2554_
			= ((is_2527_[2] * ((Class89_Sub3) this).anInt9717
			    + is_2527_[5] * ((Class89_Sub3) this).anInt9721
			    + is_2527_[8] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    i_2552_ += i_2549_;
		    i_2553_ += i_2550_;
		    i_2554_ += i_2551_;
		    ((Class89_Sub3) this).anInt9717 = i_2552_;
		    ((Class89_Sub3) this).anInt9721 = i_2553_;
		    ((Class89_Sub3) this).anInt9722 = i_2554_;
		    ((Class89_Sub3) this).aBool9723 = false;
		}
		int[] is_2555_ = new int[9];
		int i_2556_ = Class282.anIntArray4441[i_2523_];
		int i_2557_ = Class282.anIntArray4430[i_2523_];
		int i_2558_ = Class282.anIntArray4441[i_2524_];
		int i_2559_ = Class282.anIntArray4430[i_2524_];
		int i_2560_ = Class282.anIntArray4441[i_2525_];
		int i_2561_ = Class282.anIntArray4430[i_2525_];
		int i_2562_ = i_2557_ * i_2560_ + 8192 >> 14;
		int i_2563_ = i_2557_ * i_2561_ + 8192 >> 14;
		is_2555_[0]
		    = i_2558_ * i_2560_ + i_2559_ * i_2563_ + 8192 >> 14;
		is_2555_[1]
		    = -i_2558_ * i_2561_ + i_2559_ * i_2562_ + 8192 >> 14;
		is_2555_[2] = i_2559_ * i_2556_ + 8192 >> 14;
		is_2555_[3] = i_2556_ * i_2561_ + 8192 >> 14;
		is_2555_[4] = i_2556_ * i_2560_ + 8192 >> 14;
		is_2555_[5] = -i_2557_;
		is_2555_[6]
		    = -i_2559_ * i_2560_ + i_2558_ * i_2563_ + 8192 >> 14;
		is_2555_[7]
		    = i_2559_ * i_2561_ + i_2558_ * i_2562_ + 8192 >> 14;
		is_2555_[8] = i_2558_ * i_2556_ + 8192 >> 14;
		int i_2564_ = (is_2555_[0] * -((Class89_Sub3) this).anInt9717
			       + is_2555_[1] * -((Class89_Sub3) this).anInt9721
			       + is_2555_[2] * -((Class89_Sub3) this).anInt9722
			       + 8192) >> 14;
		int i_2565_ = (is_2555_[3] * -((Class89_Sub3) this).anInt9717
			       + is_2555_[4] * -((Class89_Sub3) this).anInt9721
			       + is_2555_[5] * -((Class89_Sub3) this).anInt9722
			       + 8192) >> 14;
		int i_2566_ = (is_2555_[6] * -((Class89_Sub3) this).anInt9717
			       + is_2555_[7] * -((Class89_Sub3) this).anInt9721
			       + is_2555_[8] * -((Class89_Sub3) this).anInt9722
			       + 8192) >> 14;
		int i_2567_ = i_2564_ + ((Class89_Sub3) this).anInt9717;
		int i_2568_ = i_2565_ + ((Class89_Sub3) this).anInt9721;
		int i_2569_ = i_2566_ + ((Class89_Sub3) this).anInt9722;
		int[] is_2570_ = new int[9];
		for (int i_2571_ = 0; i_2571_ < 3; i_2571_++) {
		    for (int i_2572_ = 0; i_2572_ < 3; i_2572_++) {
			int i_2573_ = 0;
			for (int i_2574_ = 0; i_2574_ < 3; i_2574_++)
			    i_2573_ += (is_2555_[i_2571_ * 3 + i_2574_]
					* is_2527_[i_2572_ * 3 + i_2574_]);
			is_2570_[i_2571_ * 3 + i_2572_] = i_2573_ + 8192 >> 14;
		    }
		}
		int i_2575_ = ((is_2555_[0] * i_2549_ + is_2555_[1] * i_2550_
				+ is_2555_[2] * i_2551_ + 8192)
			       >> 14);
		int i_2576_ = ((is_2555_[3] * i_2549_ + is_2555_[4] * i_2550_
				+ is_2555_[5] * i_2551_ + 8192)
			       >> 14);
		int i_2577_ = ((is_2555_[6] * i_2549_ + is_2555_[7] * i_2550_
				+ is_2555_[8] * i_2551_ + 8192)
			       >> 14);
		i_2575_ += i_2567_;
		i_2576_ += i_2568_;
		i_2577_ += i_2569_;
		int[] is_2578_ = new int[9];
		for (int i_2579_ = 0; i_2579_ < 3; i_2579_++) {
		    for (int i_2580_ = 0; i_2580_ < 3; i_2580_++) {
			int i_2581_ = 0;
			for (int i_2582_ = 0; i_2582_ < 3; i_2582_++)
			    i_2581_ += (is_2527_[i_2579_ * 3 + i_2582_]
					* is_2570_[i_2580_ + i_2582_ * 3]);
			is_2578_[i_2579_ * 3 + i_2580_] = i_2581_ + 8192 >> 14;
		    }
		}
		int i_2583_ = ((is_2527_[0] * i_2575_ + is_2527_[1] * i_2576_
				+ is_2527_[2] * i_2577_ + 8192)
			       >> 14);
		int i_2584_ = ((is_2527_[3] * i_2575_ + is_2527_[4] * i_2576_
				+ is_2527_[5] * i_2577_ + 8192)
			       >> 14);
		int i_2585_ = ((is_2527_[6] * i_2575_ + is_2527_[7] * i_2576_
				+ is_2527_[8] * i_2577_ + 8192)
			       >> 14);
		i_2583_ += i_2546_;
		i_2584_ += i_2547_;
		i_2585_ += i_2548_;
		for (int i_2586_ = 0; i_2586_ < i_2528_; i_2586_++) {
		    int i_2587_ = is[i_2586_];
		    if (i_2587_
			< ((Class89_Sub3) this).anIntArrayArray9716.length) {
			int[] is_2588_ = (((Class89_Sub3) this)
					  .anIntArrayArray9716[i_2587_]);
			for (int i_2589_ = 0; i_2589_ < is_2588_.length;
			     i_2589_++) {
			    int i_2590_ = is_2588_[i_2589_];
			    if (((Class89_Sub3) this).aShortArray9679 == null
				|| ((i_2526_ & (((Class89_Sub3) this)
						.aShortArray9679[i_2590_]))
				    != 0)) {
				int i_2591_
				    = (is_2578_[0] * (((Class89_Sub3) this)
						      .anIntArray9670[i_2590_])
				       + is_2578_[1] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_2590_])
				       + is_2578_[2] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_2590_])
				       + 8192) >> 14;
				int i_2592_
				    = (is_2578_[3] * (((Class89_Sub3) this)
						      .anIntArray9670[i_2590_])
				       + is_2578_[4] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_2590_])
				       + is_2578_[5] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_2590_])
				       + 8192) >> 14;
				int i_2593_
				    = (is_2578_[6] * (((Class89_Sub3) this)
						      .anIntArray9670[i_2590_])
				       + is_2578_[7] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_2590_])
				       + is_2578_[8] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_2590_])
				       + 8192) >> 14;
				i_2591_ += i_2583_;
				i_2592_ += i_2584_;
				i_2593_ += i_2585_;
				((Class89_Sub3) this).anIntArray9670[i_2590_]
				    = i_2591_;
				((Class89_Sub3) this).anIntArray9685[i_2590_]
				    = i_2592_;
				((Class89_Sub3) this).anIntArray9684[i_2590_]
				    = i_2593_;
			    }
			}
		    }
		}
	    } else {
		for (int i_2594_ = 0; i_2594_ < i_2528_; i_2594_++) {
		    int i_2595_ = is[i_2594_];
		    if (i_2595_
			< ((Class89_Sub3) this).anIntArrayArray9716.length) {
			int[] is_2596_ = (((Class89_Sub3) this)
					  .anIntArrayArray9716[i_2595_]);
			for (int i_2597_ = 0; i_2597_ < is_2596_.length;
			     i_2597_++) {
			    int i_2598_ = is_2596_[i_2597_];
			    if (((Class89_Sub3) this).aShortArray9679 == null
				|| ((i_2526_ & (((Class89_Sub3) this)
						.aShortArray9679[i_2598_]))
				    != 0)) {
				((Class89_Sub3) this).anIntArray9670[i_2598_]
				    -= ((Class89_Sub3) this).anInt9717;
				((Class89_Sub3) this).anIntArray9685[i_2598_]
				    -= ((Class89_Sub3) this).anInt9721;
				((Class89_Sub3) this).anIntArray9684[i_2598_]
				    -= ((Class89_Sub3) this).anInt9722;
				if (i_2525_ != 0) {
				    int i_2599_
					= Class282.anIntArray4430[i_2525_];
				    int i_2600_
					= Class282.anIntArray4441[i_2525_];
				    int i_2601_
					= ((((Class89_Sub3) this)
					    .anIntArray9685[i_2598_]) * i_2599_
					   + ((((Class89_Sub3) this)
					       .anIntArray9670[i_2598_])
					      * i_2600_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9685
					[i_2598_]
					= ((((Class89_Sub3) this)
					    .anIntArray9685[i_2598_]) * i_2600_
					   - ((((Class89_Sub3) this)
					       .anIntArray9670[i_2598_])
					      * i_2599_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9670
					[i_2598_]
					= i_2601_;
				}
				if (i_2523_ != 0) {
				    int i_2602_
					= Class282.anIntArray4430[i_2523_];
				    int i_2603_
					= Class282.anIntArray4441[i_2523_];
				    int i_2604_
					= ((((Class89_Sub3) this)
					    .anIntArray9685[i_2598_]) * i_2603_
					   - ((((Class89_Sub3) this)
					       .anIntArray9684[i_2598_])
					      * i_2602_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9684
					[i_2598_]
					= ((((Class89_Sub3) this)
					    .anIntArray9685[i_2598_]) * i_2602_
					   + ((((Class89_Sub3) this)
					       .anIntArray9684[i_2598_])
					      * i_2603_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9685
					[i_2598_]
					= i_2604_;
				}
				if (i_2524_ != 0) {
				    int i_2605_
					= Class282.anIntArray4430[i_2524_];
				    int i_2606_
					= Class282.anIntArray4441[i_2524_];
				    int i_2607_
					= ((((Class89_Sub3) this)
					    .anIntArray9684[i_2598_]) * i_2605_
					   + ((((Class89_Sub3) this)
					       .anIntArray9670[i_2598_])
					      * i_2606_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9684
					[i_2598_]
					= ((((Class89_Sub3) this)
					    .anIntArray9684[i_2598_]) * i_2606_
					   - ((((Class89_Sub3) this)
					       .anIntArray9670[i_2598_])
					      * i_2605_)
					   + 16383) >> 14;
				    ((Class89_Sub3) this).anIntArray9670
					[i_2598_]
					= i_2607_;
				}
				((Class89_Sub3) this).anIntArray9670[i_2598_]
				    += ((Class89_Sub3) this).anInt9717;
				((Class89_Sub3) this).anIntArray9685[i_2598_]
				    += ((Class89_Sub3) this).anInt9721;
				((Class89_Sub3) this).anIntArray9684[i_2598_]
				    += ((Class89_Sub3) this).anInt9722;
			    }
			}
		    }
		}
	    }
	} else if (i == 3) {
	    if (is_2527_ != null) {
		if (!((Class89_Sub3) this).aBool9719) {
		    for (int i_2608_ = 0;
			 i_2608_ < ((Class89_Sub3) this).anInt9686;
			 i_2608_++) {
			((Class89_Sub3) this).anIntArray9670[i_2608_] <<= 4;
			((Class89_Sub3) this).anIntArray9685[i_2608_] <<= 4;
			((Class89_Sub3) this).anIntArray9684[i_2608_] <<= 4;
		    }
		    ((Class89_Sub3) this).aBool9719 = true;
		}
		int i_2609_ = is_2527_[9] << 4;
		int i_2610_ = is_2527_[10] << 4;
		int i_2611_ = is_2527_[11] << 4;
		int i_2612_ = is_2527_[12] << 4;
		int i_2613_ = is_2527_[13] << 4;
		int i_2614_ = is_2527_[14] << 4;
		if (((Class89_Sub3) this).aBool9723) {
		    int i_2615_
			= ((is_2527_[0] * ((Class89_Sub3) this).anInt9717
			    + is_2527_[3] * ((Class89_Sub3) this).anInt9721
			    + is_2527_[6] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    int i_2616_
			= ((is_2527_[1] * ((Class89_Sub3) this).anInt9717
			    + is_2527_[4] * ((Class89_Sub3) this).anInt9721
			    + is_2527_[7] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    int i_2617_
			= ((is_2527_[2] * ((Class89_Sub3) this).anInt9717
			    + is_2527_[5] * ((Class89_Sub3) this).anInt9721
			    + is_2527_[8] * ((Class89_Sub3) this).anInt9722
			    + 8192)
			   >> 14);
		    i_2615_ += i_2612_;
		    i_2616_ += i_2613_;
		    i_2617_ += i_2614_;
		    ((Class89_Sub3) this).anInt9717 = i_2615_;
		    ((Class89_Sub3) this).anInt9721 = i_2616_;
		    ((Class89_Sub3) this).anInt9722 = i_2617_;
		    ((Class89_Sub3) this).aBool9723 = false;
		}
		int i_2618_ = i_2523_ << 15 >> 7;
		int i_2619_ = i_2524_ << 15 >> 7;
		int i_2620_ = i_2525_ << 15 >> 7;
		int i_2621_
		    = i_2618_ * -((Class89_Sub3) this).anInt9717 + 8192 >> 14;
		int i_2622_
		    = i_2619_ * -((Class89_Sub3) this).anInt9721 + 8192 >> 14;
		int i_2623_
		    = i_2620_ * -((Class89_Sub3) this).anInt9722 + 8192 >> 14;
		int i_2624_ = i_2621_ + ((Class89_Sub3) this).anInt9717;
		int i_2625_ = i_2622_ + ((Class89_Sub3) this).anInt9721;
		int i_2626_ = i_2623_ + ((Class89_Sub3) this).anInt9722;
		int[] is_2627_ = new int[9];
		is_2627_[0] = i_2618_ * is_2527_[0] + 8192 >> 14;
		is_2627_[1] = i_2618_ * is_2527_[3] + 8192 >> 14;
		is_2627_[2] = i_2618_ * is_2527_[6] + 8192 >> 14;
		is_2627_[3] = i_2619_ * is_2527_[1] + 8192 >> 14;
		is_2627_[4] = i_2619_ * is_2527_[4] + 8192 >> 14;
		is_2627_[5] = i_2619_ * is_2527_[7] + 8192 >> 14;
		is_2627_[6] = i_2620_ * is_2527_[2] + 8192 >> 14;
		is_2627_[7] = i_2620_ * is_2527_[5] + 8192 >> 14;
		is_2627_[8] = i_2620_ * is_2527_[8] + 8192 >> 14;
		int i_2628_ = i_2618_ * i_2612_ + 8192 >> 14;
		int i_2629_ = i_2619_ * i_2613_ + 8192 >> 14;
		int i_2630_ = i_2620_ * i_2614_ + 8192 >> 14;
		i_2628_ += i_2624_;
		i_2629_ += i_2625_;
		i_2630_ += i_2626_;
		int[] is_2631_ = new int[9];
		for (int i_2632_ = 0; i_2632_ < 3; i_2632_++) {
		    for (int i_2633_ = 0; i_2633_ < 3; i_2633_++) {
			int i_2634_ = 0;
			for (int i_2635_ = 0; i_2635_ < 3; i_2635_++)
			    i_2634_ += (is_2527_[i_2632_ * 3 + i_2635_]
					* is_2627_[i_2633_ + i_2635_ * 3]);
			is_2631_[i_2632_ * 3 + i_2633_] = i_2634_ + 8192 >> 14;
		    }
		}
		int i_2636_ = ((is_2527_[0] * i_2628_ + is_2527_[1] * i_2629_
				+ is_2527_[2] * i_2630_ + 8192)
			       >> 14);
		int i_2637_ = ((is_2527_[3] * i_2628_ + is_2527_[4] * i_2629_
				+ is_2527_[5] * i_2630_ + 8192)
			       >> 14);
		int i_2638_ = ((is_2527_[6] * i_2628_ + is_2527_[7] * i_2629_
				+ is_2527_[8] * i_2630_ + 8192)
			       >> 14);
		i_2636_ += i_2609_;
		i_2637_ += i_2610_;
		i_2638_ += i_2611_;
		for (int i_2639_ = 0; i_2639_ < i_2528_; i_2639_++) {
		    int i_2640_ = is[i_2639_];
		    if (i_2640_
			< ((Class89_Sub3) this).anIntArrayArray9716.length) {
			int[] is_2641_ = (((Class89_Sub3) this)
					  .anIntArrayArray9716[i_2640_]);
			for (int i_2642_ = 0; i_2642_ < is_2641_.length;
			     i_2642_++) {
			    int i_2643_ = is_2641_[i_2642_];
			    if (((Class89_Sub3) this).aShortArray9679 == null
				|| ((i_2526_ & (((Class89_Sub3) this)
						.aShortArray9679[i_2643_]))
				    != 0)) {
				int i_2644_
				    = (is_2631_[0] * (((Class89_Sub3) this)
						      .anIntArray9670[i_2643_])
				       + is_2631_[1] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_2643_])
				       + is_2631_[2] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_2643_])
				       + 8192) >> 14;
				int i_2645_
				    = (is_2631_[3] * (((Class89_Sub3) this)
						      .anIntArray9670[i_2643_])
				       + is_2631_[4] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_2643_])
				       + is_2631_[5] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_2643_])
				       + 8192) >> 14;
				int i_2646_
				    = (is_2631_[6] * (((Class89_Sub3) this)
						      .anIntArray9670[i_2643_])
				       + is_2631_[7] * (((Class89_Sub3) this)
							.anIntArray9685
							[i_2643_])
				       + is_2631_[8] * (((Class89_Sub3) this)
							.anIntArray9684
							[i_2643_])
				       + 8192) >> 14;
				i_2644_ += i_2636_;
				i_2645_ += i_2637_;
				i_2646_ += i_2638_;
				((Class89_Sub3) this).anIntArray9670[i_2643_]
				    = i_2644_;
				((Class89_Sub3) this).anIntArray9685[i_2643_]
				    = i_2645_;
				((Class89_Sub3) this).anIntArray9684[i_2643_]
				    = i_2646_;
			    }
			}
		    }
		}
	    } else {
		for (int i_2647_ = 0; i_2647_ < i_2528_; i_2647_++) {
		    int i_2648_ = is[i_2647_];
		    if (i_2648_
			< ((Class89_Sub3) this).anIntArrayArray9716.length) {
			int[] is_2649_ = (((Class89_Sub3) this)
					  .anIntArrayArray9716[i_2648_]);
			for (int i_2650_ = 0; i_2650_ < is_2649_.length;
			     i_2650_++) {
			    int i_2651_ = is_2649_[i_2650_];
			    if (((Class89_Sub3) this).aShortArray9679 == null
				|| ((i_2526_ & (((Class89_Sub3) this)
						.aShortArray9679[i_2651_]))
				    != 0)) {
				((Class89_Sub3) this).anIntArray9670[i_2651_]
				    -= ((Class89_Sub3) this).anInt9717;
				((Class89_Sub3) this).anIntArray9685[i_2651_]
				    -= ((Class89_Sub3) this).anInt9721;
				((Class89_Sub3) this).anIntArray9684[i_2651_]
				    -= ((Class89_Sub3) this).anInt9722;
				((Class89_Sub3) this).anIntArray9670[i_2651_]
				    = (((Class89_Sub3) this).anIntArray9670
				       [i_2651_]) * i_2523_ / 128;
				((Class89_Sub3) this).anIntArray9685[i_2651_]
				    = (((Class89_Sub3) this).anIntArray9685
				       [i_2651_]) * i_2524_ / 128;
				((Class89_Sub3) this).anIntArray9684[i_2651_]
				    = (((Class89_Sub3) this).anIntArray9684
				       [i_2651_]) * i_2525_ / 128;
				((Class89_Sub3) this).anIntArray9670[i_2651_]
				    += ((Class89_Sub3) this).anInt9717;
				((Class89_Sub3) this).anIntArray9685[i_2651_]
				    += ((Class89_Sub3) this).anInt9721;
				((Class89_Sub3) this).anIntArray9684[i_2651_]
				    += ((Class89_Sub3) this).anInt9722;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class89_Sub3) this).anIntArrayArray9678 != null
		&& ((Class89_Sub3) this).aByteArray9711 != null) {
		for (int i_2652_ = 0; i_2652_ < i_2528_; i_2652_++) {
		    int i_2653_ = is[i_2652_];
		    if (i_2653_
			< ((Class89_Sub3) this).anIntArrayArray9678.length) {
			int[] is_2654_ = (((Class89_Sub3) this)
					  .anIntArrayArray9678[i_2653_]);
			for (int i_2655_ = 0; i_2655_ < is_2654_.length;
			     i_2655_++) {
			    int i_2656_ = is_2654_[i_2655_];
			    if (((Class89_Sub3) this).aShortArray9714 == null
				|| ((i_2526_ & (((Class89_Sub3) this)
						.aShortArray9714[i_2656_]))
				    != 0)) {
				int i_2657_ = (((((Class89_Sub3) this)
						 .aByteArray9711[i_2656_])
						& 0xff)
					       + i_2523_ * 8);
				if (i_2657_ < 0)
				    i_2657_ = 0;
				else if (i_2657_ > 255)
				    i_2657_ = 255;
				((Class89_Sub3) this).aByteArray9711[i_2656_]
				    = (byte) i_2657_;
			    }
			}
		    }
		}
		if (((Class89_Sub3) this).aClass187Array9727 != null) {
		    for (int i_2658_ = 0;
			 i_2658_ < ((Class89_Sub3) this).anInt9726;
			 i_2658_++) {
			Class187 class187 = (((Class89_Sub3) this)
					     .aClass187Array9727[i_2658_]);
			Class203 class203 = (((Class89_Sub3) this)
					     .aClass203Array9728[i_2658_]);
			((Class203) class203).anInt2417
			    = ((((Class203) class203).anInt2417 * -1473589757
				& 0xffffff)
			       | 255 - ((((Class89_Sub3) this).aByteArray9711
					 [(((Class187) class187).anInt2195
					   * 1571719645)])
					& 0xff) << 24) * 376097963;
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class89_Sub3) this).anIntArrayArray9678 != null) {
		for (int i_2659_ = 0; i_2659_ < i_2528_; i_2659_++) {
		    int i_2660_ = is[i_2659_];
		    if (i_2660_
			< ((Class89_Sub3) this).anIntArrayArray9678.length) {
			int[] is_2661_ = (((Class89_Sub3) this)
					  .anIntArrayArray9678[i_2660_]);
			for (int i_2662_ = 0; i_2662_ < is_2661_.length;
			     i_2662_++) {
			    int i_2663_ = is_2661_[i_2662_];
			    if (((Class89_Sub3) this).aShortArray9714 == null
				|| ((i_2526_ & (((Class89_Sub3) this)
						.aShortArray9714[i_2663_]))
				    != 0)) {
				int i_2664_ = ((((Class89_Sub3) this)
						.aShortArray9713[i_2663_])
					       & 0xffff);
				int i_2665_ = i_2664_ >> 10 & 0x3f;
				int i_2666_ = i_2664_ >> 7 & 0x7;
				int i_2667_ = i_2664_ & 0x7f;
				i_2665_ = i_2665_ + i_2523_ & 0x3f;
				i_2666_ += i_2524_;
				if (i_2666_ < 0)
				    i_2666_ = 0;
				else if (i_2666_ > 7)
				    i_2666_ = 7;
				i_2667_ += i_2525_;
				if (i_2667_ < 0)
				    i_2667_ = 0;
				else if (i_2667_ > 127)
				    i_2667_ = 127;
				((Class89_Sub3) this).aShortArray9713[i_2663_]
				    = (short) (i_2665_ << 10 | i_2666_ << 7
					       | i_2667_);
			    }
			}
			((Class89_Sub3) this).aBool9718 = true;
		    }
		}
		if (((Class89_Sub3) this).aClass187Array9727 != null) {
		    for (int i_2668_ = 0;
			 i_2668_ < ((Class89_Sub3) this).anInt9726;
			 i_2668_++) {
			Class187 class187 = (((Class89_Sub3) this)
					     .aClass187Array9727[i_2668_]);
			Class203 class203 = (((Class89_Sub3) this)
					     .aClass203Array9728[i_2668_]);
			((Class203) class203).anInt2417
			    = (((((Class203) class203).anInt2417 * -1473589757
				 & ~0xffffff)
				| (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     ((((Class89_Sub3) this).aShortArray9713
				       [(((Class187) class187).anInt2195
					 * 1571719645)]) & 0xffff,
				      -1865746763)) & 0xffff]) & 0xffffff)
			       * 376097963);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_2669_ = 0; i_2669_ < i_2528_; i_2669_++) {
		    int i_2670_ = is[i_2669_];
		    if (i_2670_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_2671_ = (((Class89_Sub3) this)
					  .anIntArrayArray9672[i_2670_]);
			for (int i_2672_ = 0; i_2672_ < is_2671_.length;
			     i_2672_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_2671_[i_2672_]]);
			    ((Class203) class203).anInt2423
				+= i_2523_ * -378944915;
			    ((Class203) class203).anInt2418
				+= i_2524_ * 830599387;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_2673_ = 0; i_2673_ < i_2528_; i_2673_++) {
		    int i_2674_ = is[i_2673_];
		    if (i_2674_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_2675_ = (((Class89_Sub3) this)
					  .anIntArrayArray9672[i_2674_]);
			for (int i_2676_ = 0; i_2676_ < is_2675_.length;
			     i_2676_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_2675_[i_2676_]]);
			    ((Class203) class203).aFloat2415
				= (((Class203) class203).aFloat2415
				   * (float) i_2523_ / 128.0F);
			    ((Class203) class203).aFloat2416
				= (((Class203) class203).aFloat2416
				   * (float) i_2524_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class89_Sub3) this).anIntArrayArray9672 != null) {
		for (int i_2677_ = 0; i_2677_ < i_2528_; i_2677_++) {
		    int i_2678_ = is[i_2677_];
		    if (i_2678_
			< ((Class89_Sub3) this).anIntArrayArray9672.length) {
			int[] is_2679_ = (((Class89_Sub3) this)
					  .anIntArrayArray9672[i_2678_]);
			for (int i_2680_ = 0; i_2680_ < is_2679_.length;
			     i_2680_++) {
			    Class203 class203
				= (((Class89_Sub3) this).aClass203Array9728
				   [is_2679_[i_2680_]]);
			    ((Class203) class203).anInt2424
				= ((((Class203) class203).anInt2424 * 360392329
				    + i_2523_)
				   & 0x3fff) * 318648249;
			}
		    }
		}
	    }
	}
    }
    
    void method16139() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9686; i++) {
		int i_2681_ = ((Class89_Sub3) this).anIntArray9684[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = ((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9670[i] = -i_2681_;
	    }
	    method16141();
	}
    }
    
    public void method2010(byte i, byte[] is) {
	if ((((Class89_Sub3) this).anInt9683 & 0x100000) == 0)
	    throw new RuntimeException();
	if (((Class89_Sub3) this).aByteArray9711 == null)
	    ((Class89_Sub3) this).aByteArray9711
		= new byte[((Class89_Sub3) this).anInt9691];
	if (is == null) {
	    for (int i_2682_ = 0; i_2682_ < ((Class89_Sub3) this).anInt9691;
		 i_2682_++)
		((Class89_Sub3) this).aByteArray9711[i_2682_] = i;
	} else {
	    for (int i_2683_ = 0; i_2683_ < ((Class89_Sub3) this).anInt9691;
		 i_2683_++) {
		int i_2684_ = 255 - ((255 - (is[i_2683_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		((Class89_Sub3) this).aByteArray9711[i_2683_] = (byte) i_2684_;
	    }
	}
	if (((Class89_Sub3) this).anInt9741 == 2)
	    ((Class89_Sub3) this).anInt9741 = 1;
    }
    
    void method16140() {
	for (int i = 0; i < ((Class89_Sub3) this).anInt9691; i++) {
	    short i_2685_
		= (((Class89_Sub3) this).aShortArray9712 != null
		   ? ((Class89_Sub3) this).aShortArray9712[i] : (short) -1);
	    if (i_2685_ == -1) {
		int i_2686_
		    = ((Class89_Sub3) this).aShortArray9713[i] & 0xffff;
		int i_2687_
		    = (i_2686_ & 0x7f) * ((Class89_Sub3) this).anInt9707 >> 7;
		short i_2688_
		    = Class241_Sub42.method16451(i_2686_ & ~0x7f | i_2687_,
						 1905736354);
		if (((Class89_Sub3) this).anIntArray9704[i] == -1) {
		    int i_2689_
			= ((Class89_Sub3) this).anIntArray9710[i] & ~0x1ffff;
		    ((Class89_Sub3) this).anIntArray9710[i]
			= i_2689_ | Class639.method13606(i_2688_,
							 i_2689_ >> 17,
							 1907925817);
		} else if (((Class89_Sub3) this).anIntArray9704[i] != -2) {
		    int i_2690_
			= ((Class89_Sub3) this).anIntArray9710[i] & ~0x1ffff;
		    ((Class89_Sub3) this).anIntArray9710[i]
			= i_2690_ | Class639.method13606(i_2688_,
							 i_2690_ >> 17,
							 22953043);
		    i_2690_
			= ((Class89_Sub3) this).anIntArray9747[i] & ~0x1ffff;
		    ((Class89_Sub3) this).anIntArray9747[i]
			= i_2690_ | Class639.method13606(i_2688_,
							 i_2690_ >> 17,
							 -1042033249);
		    i_2690_
			= ((Class89_Sub3) this).anIntArray9704[i] & ~0x1ffff;
		    ((Class89_Sub3) this).anIntArray9704[i]
			= i_2690_ | Class639.method13606(i_2688_,
							 i_2690_ >> 17,
							 -1435983805);
		}
	    }
	}
	((Class89_Sub3) this).anInt9741 = 2;
    }
    
    public Class167[] method2016() {
	return ((Class89_Sub3) this).aClass167Array9725;
    }
    
    public void method2045(short i, short i_2691_) {
	if (((Class89_Sub3) this).aShortArray9712 != null) {
	    if (!((Class89_Sub3) this).aBool9688 && i_2691_ >= 0) {
		Class101 class101
		    = ((Class89_Sub3) this).aClass103_Sub2_9690
			  .aClass107_1458
			  .method2680(i_2691_ & 0xffff, -501826315);
		if (class101.aByte1376 != 0 || class101.aByte1396 != 0)
		    ((Class89_Sub3) this).aBool9688 = true;
	    }
	    for (int i_2692_ = 0; i_2692_ < ((Class89_Sub3) this).anInt9691;
		 i_2692_++) {
		if (((Class89_Sub3) this).aShortArray9712[i_2692_] == i)
		    ((Class89_Sub3) this).aShortArray9712[i_2692_] = i_2691_;
	    }
	}
    }
    
    public byte[] method1976() {
	return ((Class89_Sub3) this).aByteArray9711;
    }
    
    public Class106[] method2015() {
	return ((Class89_Sub3) this).aClass106Array9724;
    }
    
    public boolean method2026() {
	return ((Class89_Sub3) this).aBool9748;
    }
    
    public Class167[] method2029() {
	return ((Class89_Sub3) this).aClass167Array9725;
    }
    
    public boolean method2018() {
	if (((Class89_Sub3) this).aShortArray9712 == null)
	    return true;
	for (int i = 0; i < ((Class89_Sub3) this).aShortArray9712.length;
	     i++) {
	    if (((Class89_Sub3) this).aShortArray9712[i] != -1
		&& !((Class89_Sub3) this).aClass103_Sub2_9690
			.method15383(((Class89_Sub3) this).aShortArray9712[i]))
		return false;
	}
	return true;
    }
    
    public boolean method1965() {
	if (((Class89_Sub3) this).aShortArray9712 == null)
	    return true;
	for (int i = 0; i < ((Class89_Sub3) this).aShortArray9712.length;
	     i++) {
	    if (((Class89_Sub3) this).aShortArray9712[i] != -1
		&& !((Class89_Sub3) this).aClass103_Sub2_9690
			.method15383(((Class89_Sub3) this).aShortArray9712[i]))
		return false;
	}
	return true;
    }
    
    public boolean method2020() {
	if (((Class89_Sub3) this).aShortArray9712 == null)
	    return true;
	for (int i = 0; i < ((Class89_Sub3) this).aShortArray9712.length;
	     i++) {
	    if (((Class89_Sub3) this).aShortArray9712[i] != -1
		&& !((Class89_Sub3) this).aClass103_Sub2_9690
			.method15383(((Class89_Sub3) this).aShortArray9712[i]))
		return false;
	}
	return true;
    }
    
    public boolean method2021() {
	return ((Class89_Sub3) this).aBool9688;
    }
    
    void method16141() {
	((Class89_Sub3) this).aClass204Array9692 = null;
	((Class89_Sub3) this).aClass204Array9744 = null;
	((Class89_Sub3) this).aClass188Array9708 = null;
	((Class89_Sub3) this).aBool9730 = false;
    }
    
    public boolean method2023() {
	return ((Class89_Sub3) this).aBool9688;
    }
    
    void method1876(int i, int i_2693_, int i_2694_, int i_2695_) {
	if (i == 0) {
	    int i_2696_ = 0;
	    ((Class89_Sub3) this).anInt9717 = 0;
	    ((Class89_Sub3) this).anInt9721 = 0;
	    ((Class89_Sub3) this).anInt9722 = 0;
	    for (int i_2697_ = 0; i_2697_ < ((Class89_Sub3) this).anInt9686;
		 i_2697_++) {
		((Class89_Sub3) this).anInt9717
		    += ((Class89_Sub3) this).anIntArray9670[i_2697_];
		((Class89_Sub3) this).anInt9721
		    += ((Class89_Sub3) this).anIntArray9685[i_2697_];
		((Class89_Sub3) this).anInt9722
		    += ((Class89_Sub3) this).anIntArray9684[i_2697_];
		i_2696_++;
	    }
	    if (i_2696_ > 0) {
		((Class89_Sub3) this).anInt9717
		    = ((Class89_Sub3) this).anInt9717 / i_2696_ + i_2693_;
		((Class89_Sub3) this).anInt9721
		    = ((Class89_Sub3) this).anInt9721 / i_2696_ + i_2694_;
		((Class89_Sub3) this).anInt9722
		    = ((Class89_Sub3) this).anInt9722 / i_2696_ + i_2695_;
	    } else {
		((Class89_Sub3) this).anInt9717 = i_2693_;
		((Class89_Sub3) this).anInt9721 = i_2694_;
		((Class89_Sub3) this).anInt9722 = i_2695_;
	    }
	} else if (i == 1) {
	    for (int i_2698_ = 0; i_2698_ < ((Class89_Sub3) this).anInt9686;
		 i_2698_++) {
		((Class89_Sub3) this).anIntArray9670[i_2698_] += i_2693_;
		((Class89_Sub3) this).anIntArray9685[i_2698_] += i_2694_;
		((Class89_Sub3) this).anIntArray9684[i_2698_] += i_2695_;
	    }
	} else if (i == 2) {
	    for (int i_2699_ = 0; i_2699_ < ((Class89_Sub3) this).anInt9686;
		 i_2699_++) {
		((Class89_Sub3) this).anIntArray9670[i_2699_]
		    -= ((Class89_Sub3) this).anInt9717;
		((Class89_Sub3) this).anIntArray9685[i_2699_]
		    -= ((Class89_Sub3) this).anInt9721;
		((Class89_Sub3) this).anIntArray9684[i_2699_]
		    -= ((Class89_Sub3) this).anInt9722;
		if (i_2695_ != 0) {
		    int i_2700_ = Class282.anIntArray4430[i_2695_];
		    int i_2701_ = Class282.anIntArray4441[i_2695_];
		    int i_2702_
			= (((((Class89_Sub3) this).anIntArray9685[i_2699_]
			     * i_2700_)
			    + (((Class89_Sub3) this).anIntArray9670[i_2699_]
			       * i_2701_)
			    + 16383)
			   >> 14);
		    ((Class89_Sub3) this).anIntArray9685[i_2699_]
			= ((((Class89_Sub3) this).anIntArray9685[i_2699_]
			    * i_2701_)
			   - (((Class89_Sub3) this).anIntArray9670[i_2699_]
			      * i_2700_)
			   + 16383) >> 14;
		    ((Class89_Sub3) this).anIntArray9670[i_2699_] = i_2702_;
		}
		if (i_2693_ != 0) {
		    int i_2703_ = Class282.anIntArray4430[i_2693_];
		    int i_2704_ = Class282.anIntArray4441[i_2693_];
		    int i_2705_
			= (((((Class89_Sub3) this).anIntArray9685[i_2699_]
			     * i_2704_)
			    - (((Class89_Sub3) this).anIntArray9684[i_2699_]
			       * i_2703_)
			    + 16383)
			   >> 14);
		    ((Class89_Sub3) this).anIntArray9684[i_2699_]
			= ((((Class89_Sub3) this).anIntArray9685[i_2699_]
			    * i_2703_)
			   + (((Class89_Sub3) this).anIntArray9684[i_2699_]
			      * i_2704_)
			   + 16383) >> 14;
		    ((Class89_Sub3) this).anIntArray9685[i_2699_] = i_2705_;
		}
		if (i_2694_ != 0) {
		    int i_2706_ = Class282.anIntArray4430[i_2694_];
		    int i_2707_ = Class282.anIntArray4441[i_2694_];
		    int i_2708_
			= (((((Class89_Sub3) this).anIntArray9684[i_2699_]
			     * i_2706_)
			    + (((Class89_Sub3) this).anIntArray9670[i_2699_]
			       * i_2707_)
			    + 16383)
			   >> 14);
		    ((Class89_Sub3) this).anIntArray9684[i_2699_]
			= ((((Class89_Sub3) this).anIntArray9684[i_2699_]
			    * i_2707_)
			   - (((Class89_Sub3) this).anIntArray9670[i_2699_]
			      * i_2706_)
			   + 16383) >> 14;
		    ((Class89_Sub3) this).anIntArray9670[i_2699_] = i_2708_;
		}
		((Class89_Sub3) this).anIntArray9670[i_2699_]
		    += ((Class89_Sub3) this).anInt9717;
		((Class89_Sub3) this).anIntArray9685[i_2699_]
		    += ((Class89_Sub3) this).anInt9721;
		((Class89_Sub3) this).anIntArray9684[i_2699_]
		    += ((Class89_Sub3) this).anInt9722;
	    }
	} else if (i == 3) {
	    for (int i_2709_ = 0; i_2709_ < ((Class89_Sub3) this).anInt9686;
		 i_2709_++) {
		((Class89_Sub3) this).anIntArray9670[i_2709_]
		    -= ((Class89_Sub3) this).anInt9717;
		((Class89_Sub3) this).anIntArray9685[i_2709_]
		    -= ((Class89_Sub3) this).anInt9721;
		((Class89_Sub3) this).anIntArray9684[i_2709_]
		    -= ((Class89_Sub3) this).anInt9722;
		((Class89_Sub3) this).anIntArray9670[i_2709_]
		    = (((Class89_Sub3) this).anIntArray9670[i_2709_] * i_2693_
		       / 128);
		((Class89_Sub3) this).anIntArray9685[i_2709_]
		    = (((Class89_Sub3) this).anIntArray9685[i_2709_] * i_2694_
		       / 128);
		((Class89_Sub3) this).anIntArray9684[i_2709_]
		    = (((Class89_Sub3) this).anIntArray9684[i_2709_] * i_2695_
		       / 128);
		((Class89_Sub3) this).anIntArray9670[i_2709_]
		    += ((Class89_Sub3) this).anInt9717;
		((Class89_Sub3) this).anIntArray9685[i_2709_]
		    += ((Class89_Sub3) this).anInt9721;
		((Class89_Sub3) this).anIntArray9684[i_2709_]
		    += ((Class89_Sub3) this).anInt9722;
	    }
	} else if (i == 5) {
	    for (int i_2710_ = 0; i_2710_ < ((Class89_Sub3) this).anInt9691;
		 i_2710_++) {
		int i_2711_
		    = ((((Class89_Sub3) this).aByteArray9711[i_2710_] & 0xff)
		       + i_2693_ * 8);
		if (i_2711_ < 0)
		    i_2711_ = 0;
		else if (i_2711_ > 255)
		    i_2711_ = 255;
		((Class89_Sub3) this).aByteArray9711[i_2710_] = (byte) i_2711_;
	    }
	    if (((Class89_Sub3) this).aClass187Array9727 != null) {
		for (int i_2712_ = 0;
		     i_2712_ < ((Class89_Sub3) this).anInt9726; i_2712_++) {
		    Class187 class187
			= ((Class89_Sub3) this).aClass187Array9727[i_2712_];
		    Class203 class203
			= ((Class89_Sub3) this).aClass203Array9728[i_2712_];
		    ((Class203) class203).anInt2417
			= ((((Class203) class203).anInt2417 * -1473589757
			    & 0xffffff)
			   | 255 - ((((Class89_Sub3) this).aByteArray9711
				     [(((Class187) class187).anInt2195
				       * 1571719645)])
				    & 0xff) << 24) * 376097963;
		}
	    }
	} else if (i == 7) {
	    for (int i_2713_ = 0; i_2713_ < ((Class89_Sub3) this).anInt9691;
		 i_2713_++) {
		int i_2714_
		    = ((Class89_Sub3) this).aShortArray9713[i_2713_] & 0xffff;
		int i_2715_ = i_2714_ >> 10 & 0x3f;
		int i_2716_ = i_2714_ >> 7 & 0x7;
		int i_2717_ = i_2714_ & 0x7f;
		i_2715_ = i_2715_ + i_2693_ & 0x3f;
		i_2716_ += i_2694_;
		if (i_2716_ < 0)
		    i_2716_ = 0;
		else if (i_2716_ > 7)
		    i_2716_ = 7;
		i_2717_ += i_2695_;
		if (i_2717_ < 0)
		    i_2717_ = 0;
		else if (i_2717_ > 127)
		    i_2717_ = 127;
		((Class89_Sub3) this).aShortArray9713[i_2713_]
		    = (short) (i_2715_ << 10 | i_2716_ << 7 | i_2717_);
	    }
	    ((Class89_Sub3) this).aBool9718 = true;
	    if (((Class89_Sub3) this).aClass187Array9727 != null) {
		for (int i_2718_ = 0;
		     i_2718_ < ((Class89_Sub3) this).anInt9726; i_2718_++) {
		    Class187 class187
			= ((Class89_Sub3) this).aClass187Array9727[i_2718_];
		    Class203 class203
			= ((Class89_Sub3) this).aClass203Array9728[i_2718_];
		    ((Class203) class203).anInt2417
			= (((((Class203) class203).anInt2417 * -1473589757
			     & ~0xffffff)
			    | (Class474.anIntArray6382
			       [(Class241_Sub42.method16451
				 ((((Class89_Sub3) this).aShortArray9713
				   [(((Class187) class187).anInt2195
				     * 1571719645)]) & 0xffff,
				  196364758)) & 0xffff]) & 0xffffff)
			   * 376097963);
		}
	    }
	} else if (i == 8) {
	    for (int i_2719_ = 0; i_2719_ < ((Class89_Sub3) this).anInt9726;
		 i_2719_++) {
		Class203 class203
		    = ((Class89_Sub3) this).aClass203Array9728[i_2719_];
		((Class203) class203).anInt2423 += i_2693_ * -378944915;
		((Class203) class203).anInt2418 += i_2694_ * 830599387;
	    }
	} else if (i == 10) {
	    for (int i_2720_ = 0; i_2720_ < ((Class89_Sub3) this).anInt9726;
		 i_2720_++) {
		Class203 class203
		    = ((Class89_Sub3) this).aClass203Array9728[i_2720_];
		((Class203) class203).aFloat2415
		    = (((Class203) class203).aFloat2415 * (float) i_2693_
		       / 128.0F);
		((Class203) class203).aFloat2416
		    = (((Class203) class203).aFloat2416 * (float) i_2694_
		       / 128.0F);
	    }
	} else if (i == 9) {
	    for (int i_2721_ = 0; i_2721_ < ((Class89_Sub3) this).anInt9726;
		 i_2721_++) {
		Class203 class203
		    = ((Class89_Sub3) this).aClass203Array9728[i_2721_];
		((Class203) class203).anInt2424
		    = (((Class203) class203).anInt2424 * 360392329 + i_2693_
		       & 0x3fff) * 318648249;
	    }
	}
    }
    
    public boolean method2025() {
	return ((Class89_Sub3) this).aBool9748;
    }
    
    void method16142() {
	synchronized (this) {
	    for (int i = 0; i < ((Class89_Sub3) this).anInt9686; i++) {
		((Class89_Sub3) this).anIntArray9670[i]
		    = -((Class89_Sub3) this).anIntArray9670[i];
		((Class89_Sub3) this).anIntArray9684[i]
		    = -((Class89_Sub3) this).anIntArray9684[i];
	    }
	    method16141();
	}
    }
    
    public boolean method2027() {
	return ((Class89_Sub3) this).aBool9748;
    }
    
    public void method1949() {
	/* empty */
    }
    
    public void method1977() {
	/* empty */
    }
}
