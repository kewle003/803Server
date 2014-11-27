/* Class155 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class155_Backup
{
    float aFloat1720;
    boolean aBool1721;
    boolean aBool1722;
    int anInt1723;
    boolean aBool1724 = false;
    int[] anIntArray1725;
    int anInt1726;
    float aFloat1727;
    float aFloat1728;
    float aFloat1729;
    int[] anIntArray1730;
    float aFloat1731;
    float aFloat1732;
    int anInt1733;
    int anInt1734;
    int anInt1735;
    Class189 aClass189_1736;
    int anInt1737;
    int anInt1738;
    float[] aFloatArray1739;
    int anInt1740;
    boolean aBool1741;
    int anInt1742;
    Class103_Sub2 aClass103_Sub2_1743;
    int anInt1744;
    float aFloat1745;
    Class529 aClass529_1746;
    int anInt1747;
    boolean aBool1748;
    int anInt1749;
    int[] anIntArray1750;
    int[] anIntArray1751;
    int anInt1752;
    float aFloat1753;
    int anInt1754;
    int[] anIntArray1755;
    boolean aBool1756;
    int anInt1757;
    float aFloat1758;
    
    final void method3343(boolean bool, boolean bool_0_, int[] is, int i,
			  int i_1_, int i_2_, float f, float f_3_, float f_4_,
			  float f_5_, float f_6_, float f_7_, float f_8_,
			  float f_9_, float f_10_, float f_11_, float f_12_,
			  float f_13_, float f_14_, float f_15_, float f_16_,
			  float f_17_, float f_18_, float f_19_, float f_20_,
			  float f_21_, float f_22_, float f_23_) {
	int i_24_ = i_2_ - i_1_;
	float f_25_ = 1.0F / (float) i_24_;
	float f_26_ = (f_3_ - f) * f_25_;
	float f_27_ = (f_5_ - f_4_) * f_25_;
	float f_28_ = (f_7_ - f_6_) * f_25_;
	float f_29_ = (f_9_ - f_8_) * f_25_;
	float f_30_ = (f_11_ - f_10_) * f_25_;
	float f_31_ = (f_13_ - f_12_) * f_25_;
	float f_32_ = (f_15_ - f_14_) * f_25_;
	float f_33_ = (f_17_ - f_16_) * f_25_;
	float f_34_ = (f_19_ - f_18_) * f_25_;
	float f_35_ = (f_21_ - f_20_) * f_25_;
	float f_36_ = (f_23_ - f_22_) * f_25_;
	if (((Class155_Backup) this).aBool1748) {
	    if (i_2_ > ((Class155_Backup) this).anInt1733)
		i_2_ = ((Class155_Backup) this).anInt1733;
	    if (i_1_ < 0) {
		f -= f_26_ * (float) i_1_;
		f_4_ -= f_27_ * (float) i_1_;
		f_6_ -= f_28_ * (float) i_1_;
		f_8_ -= f_29_ * (float) i_1_;
		f_10_ -= f_30_ * (float) i_1_;
		f_12_ -= f_31_ * (float) i_1_;
		f_14_ -= f_32_ * (float) i_1_;
		f_16_ -= f_33_ * (float) i_1_;
		f_18_ -= f_34_ * (float) i_1_;
		f_20_ -= f_35_ * (float) i_1_;
		f_22_ -= f_36_ * (float) i_1_;
		i_1_ = 0;
	    }
	}
	if (i_1_ < i_2_) {
	    i_24_ = i_2_ - i_1_;
	    i += i_1_;
	    while (i_24_-- > 0) {
		float f_37_ = 1.0F / f;
		float f_38_ = 1.0F / f_4_;
		if (!bool || f_37_ < ((Class155_Backup) this).aFloatArray1739[i]) {
		    float f_39_ = f_6_ * f_38_;
		    float f_40_ = f_8_ * f_38_;
		    int i_41_
			= ((int) (f_39_ * (float) ((Class155_Backup) this).anInt1752
				  * ((Class155_Backup) this).aFloat1745)
			   & ((Class155_Backup) this).anInt1744);
		    int i_42_
			= ((int) (f_40_ * (float) ((Class155_Backup) this).anInt1752
				  * ((Class155_Backup) this).aFloat1745)
			   & ((Class155_Backup) this).anInt1744);
		    int i_43_
			= (((Class155_Backup) this).anIntArray1725
			   [i_42_ * ((Class155_Backup) this).anInt1752 + i_41_]);
		    i_41_ = ((int) (f_39_ * (float) ((Class155_Backup) this).anInt1757
				    * ((Class155_Backup) this).aFloat1753)
			     & ((Class155_Backup) this).anInt1742);
		    i_42_ = ((int) (f_40_ * (float) ((Class155_Backup) this).anInt1757
				    * ((Class155_Backup) this).aFloat1753)
			     & ((Class155_Backup) this).anInt1742);
		    int i_44_
			= (((Class155_Backup) this).anIntArray1750
			   [i_42_ * ((Class155_Backup) this).anInt1757 + i_41_]);
		    i_41_ = ((int) (f_39_ * (float) ((Class155_Backup) this).anInt1738
				    * ((Class155_Backup) this).aFloat1758)
			     & ((Class155_Backup) this).anInt1735);
		    i_42_ = ((int) (f_40_ * (float) ((Class155_Backup) this).anInt1738
				    * ((Class155_Backup) this).aFloat1758)
			     & ((Class155_Backup) this).anInt1735);
		    int i_45_
			= (((Class155_Backup) this).anIntArray1755
			   [i_42_ * ((Class155_Backup) this).anInt1738 + i_41_]);
		    float f_46_ = 1.0F - (f_20_ + f_22_);
		    i_43_
			= (~0xffffff
			   | (int) (f_20_ * (float) (i_43_ >> 16 & 0xff)) << 16
			   | (int) (f_20_ * (float) (i_43_ >> 8 & 0xff)) << 8
			   | (int) (f_20_ * (float) (i_43_ & 0xff)));
		    i_44_
			= (~0xffffff
			   | (int) (f_22_ * (float) (i_44_ >> 16 & 0xff)) << 16
			   | (int) (f_22_ * (float) (i_44_ >> 8 & 0xff)) << 8
			   | (int) (f_22_ * (float) (i_44_ & 0xff)));
		    i_45_
			= (~0xffffff
			   | (int) (f_46_ * (float) (i_45_ >> 16 & 0xff)) << 16
			   | (int) (f_46_ * (float) (i_45_ >> 8 & 0xff)) << 8
			   | (int) (f_46_ * (float) (i_45_ & 0xff)));
		    int i_47_ = i_43_ + i_44_ + i_45_;
		    int i_48_
			= (~0xffffff
			   | ((int) (f_14_ * (float) (i_47_ >> 16 & 0xff)) << 8
			      & 0xff0000)
			   | ((int) (f_16_ * (float) (i_47_ >> 8 & 0xff))
			      & 0xff00)
			   | (int) (f_18_ * (float) (i_47_ & 0xff)) >> 8);
		    if (f_10_ != 0.0F) {
			int i_49_ = (int) (255.0F - f_10_);
			int i_50_ = ((((((Class155_Backup) this).anInt1740 & 0xff00ff)
				       * (int) f_10_) & ~0xff00ff
				      | ((((Class155_Backup) this).anInt1740 & 0xff00)
					 * (int) f_10_) & 0xff0000)
				     >>> 8);
			i_48_ = (((i_48_ & 0xff00ff) * i_49_ & ~0xff00ff
				  | (i_48_ & 0xff00) * i_49_ & 0xff0000)
				 >>> 8) + i_50_;
		    }
		    if (bool_0_)
			is[i] = ((int) f_12_ | is[i] >> 24) << 24 | i_48_;
		    else
			is[i] = i_48_;
		    if (bool)
			((Class155_Backup) this).aFloatArray1739[i] = f_37_;
		}
		i++;
		f += f_26_;
		f_4_ += f_27_;
		f_6_ += f_28_;
		f_8_ += f_29_;
		f_10_ += f_30_;
		f_12_ += f_31_;
		f_14_ += f_32_;
		f_16_ += f_33_;
		f_18_ += f_34_;
		f_20_ += f_35_;
		f_22_ += f_36_;
	    }
	}
    }
    
    int method3344() {
	return (((Class155_Backup) this).anIntArray1730[0]
		% ((Class155_Backup) this).anInt1737);
    }
    
    Class155_Backup(Class103_Sub2 class103_sub2, Class189 class189) {
	((Class155_Backup) this).aBool1721 = true;
	((Class155_Backup) this).aBool1722 = false;
	((Class155_Backup) this).anInt1723 = 0;
	((Class155_Backup) this).aBool1748 = false;
	((Class155_Backup) this).aBool1756 = false;
	((Class155_Backup) this).anIntArray1730 = new int[4096];
	((Class155_Backup) this).aFloat1720 = 0.0F;
	((Class155_Backup) this).aFloat1732 = 1.0F;
	((Class155_Backup) this).anInt1734 = -1;
	((Class155_Backup) this).anIntArray1725 = null;
	((Class155_Backup) this).anInt1752 = 0;
	((Class155_Backup) this).anInt1744 = 0;
	((Class155_Backup) this).aFloat1745 = 0.0F;
	((Class155_Backup) this).anInt1747 = 0;
	((Class155_Backup) this).aBool1741 = true;
	((Class155_Backup) this).anInt1749 = -1;
	((Class155_Backup) this).anIntArray1750 = null;
	((Class155_Backup) this).anInt1757 = 0;
	((Class155_Backup) this).anInt1742 = 0;
	((Class155_Backup) this).aFloat1753 = 0.0F;
	((Class155_Backup) this).anInt1754 = -1;
	((Class155_Backup) this).anIntArray1755 = null;
	((Class155_Backup) this).anInt1738 = 0;
	((Class155_Backup) this).anInt1735 = 0;
	((Class155_Backup) this).aFloat1758 = 0.0F;
	((Class155_Backup) this).aClass103_Sub2_1743 = class103_sub2;
	((Class155_Backup) this).aClass189_1736 = class189;
	((Class155_Backup) this).anInt1737
	    = (((Class103_Sub2) ((Class155_Backup) this).aClass103_Sub2_1743)
	       .anInt9260) * -1826993761;
	((Class155_Backup) this).anIntArray1751
	    = (((Class103_Sub2) ((Class155_Backup) this).aClass103_Sub2_1743)
	       .anIntArray9245);
	((Class155_Backup) this).aFloatArray1739
	    = (((Class103_Sub2) ((Class155_Backup) this).aClass103_Sub2_1743)
	       .aFloatArray9248);
	((Class155_Backup) this).aClass529_1746 = Class529.aClass529_6942;
    }
    
    final void method3345(boolean bool) {
	((Class155_Backup) this).aBool1724 = bool;
    }
    
    final void method3346(boolean bool, boolean bool_51_, boolean bool_52_,
			  float f, float f_53_, float f_54_, float f_55_,
			  float f_56_, float f_57_, float f_58_, float f_59_,
			  float f_60_, int i) {
	if (((Class155_Backup) this).aBool1724) {
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517((int) f_55_,
							     (int) f,
							     (int) f_56_,
							     (int) f_53_, i,
							     223909001);
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517((int) f_56_,
							     (int) f_53_,
							     (int) f_57_,
							     (int) f_54_, i,
							     223909001);
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517((int) f_57_,
							     (int) f_54_,
							     (int) f_55_,
							     (int) f, i,
							     223909001);
	} else {
	    float f_61_ = f_56_ - f_55_;
	    float f_62_ = f_53_ - f;
	    float f_63_ = f_57_ - f_55_;
	    float f_64_ = f_54_ - f;
	    float f_65_ = f_59_ - f_58_;
	    float f_66_ = f_60_ - f_58_;
	    float f_67_ = 0.0F;
	    if (f_53_ != f)
		f_67_ = (f_56_ - f_55_) / (f_53_ - f);
	    float f_68_ = 0.0F;
	    if (f_54_ != f_53_)
		f_68_ = (f_57_ - f_56_) / (f_54_ - f_53_);
	    float f_69_ = 0.0F;
	    if (f_54_ != f)
		f_69_ = (f_55_ - f_57_) / (f - f_54_);
	    float f_70_ = f_61_ * f_64_ - f_63_ * f_62_;
	    if (f_70_ != 0.0F) {
		float f_71_ = (f_65_ * f_64_ - f_66_ * f_62_) / f_70_;
		float f_72_ = (f_66_ * f_61_ - f_65_ * f_63_) / f_70_;
		if (f <= f_53_ && f <= f_54_) {
		    if (!(f >= (float) ((Class155_Backup) this).anInt1726)) {
			if (f_53_ > (float) ((Class155_Backup) this).anInt1726)
			    f_53_ = (float) ((Class155_Backup) this).anInt1726;
			if (f_54_ > (float) ((Class155_Backup) this).anInt1726)
			    f_54_ = (float) ((Class155_Backup) this).anInt1726;
			f_58_ = f_58_ - f_71_ * f_55_ + f_71_;
			if (f_53_ < f_54_) {
			    f_57_ = f_55_;
			    if (f < 0.0F) {
				f_57_ -= f_69_ * f;
				f_55_ -= f_67_ * f;
				f_58_ -= f_72_ * f;
				f = 0.0F;
			    }
			    if (f_53_ < 0.0F) {
				f_56_ -= f_68_ * f_53_;
				f_53_ = 0.0F;
			    }
			    if (f != f_53_ && f_69_ < f_67_
				|| f == f_53_ && f_69_ > f_68_) {
				f += 0.5F;
				f_53_ += 0.5F;
				f_54_ = (float) (int) (f_54_ + 0.5F) - f_53_;
				f_53_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_53_ >= 0.0F) {
				    method3374(bool, bool_51_, bool_52_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, i, 0, (int) f_57_,
					       (int) f_55_, f_58_, f_71_);
				    f_57_ += f_69_;
				    f_55_ += f_67_;
				    f_58_ += f_72_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_54_ >= 0.0F) {
				    method3374(bool, bool_51_, bool_52_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, i, 0, (int) f_57_,
					       (int) f_56_, f_58_, f_71_);
				    f_57_ += f_69_;
				    f_56_ += f_68_;
				    f_58_ += f_72_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f += 0.5F;
				f_53_ += 0.5F;
				f_54_ = (float) (int) (f_54_ + 0.5F) - f_53_;
				f_53_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_53_ >= 0.0F) {
				    method3374(bool, bool_51_, bool_52_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, i, 0, (int) f_55_,
					       (int) f_57_, f_58_, f_71_);
				    f_57_ += f_69_;
				    f_55_ += f_67_;
				    f_58_ += f_72_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_54_ >= 0.0F) {
				    method3374(bool, bool_51_, bool_52_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, i, 0, (int) f_56_,
					       (int) f_57_, f_58_, f_71_);
				    f_57_ += f_69_;
				    f_56_ += f_68_;
				    f_58_ += f_72_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			} else {
			    f_56_ = f_55_;
			    if (f < 0.0F) {
				f_56_ -= f_69_ * f;
				f_55_ -= f_67_ * f;
				f_58_ -= f_72_ * f;
				f = 0.0F;
			    }
			    if (f_54_ < 0.0F) {
				f_57_ -= f_68_ * f_54_;
				f_54_ = 0.0F;
			    }
			    if (f != f_54_ && f_69_ < f_67_
				|| f == f_54_ && f_68_ > f_67_) {
				f += 0.5F;
				f_54_ += 0.5F;
				f_53_ = (float) (int) (f_53_ + 0.5F) - f_54_;
				f_54_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_54_ >= 0.0F) {
				    method3374(bool, bool_51_, bool_52_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, i, 0, (int) f_56_,
					       (int) f_55_, f_58_, f_71_);
				    f_56_ += f_69_;
				    f_55_ += f_67_;
				    f_58_ += f_72_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_53_ >= 0.0F) {
				    method3374(bool, bool_51_, bool_52_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, i, 0, (int) f_57_,
					       (int) f_55_, f_58_, f_71_);
				    f_57_ += f_68_;
				    f_55_ += f_67_;
				    f_58_ += f_72_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f += 0.5F;
				f_54_ += 0.5F;
				f_53_ = (float) (int) (f_53_ + 0.5F) - f_54_;
				f_54_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_54_ >= 0.0F) {
				    method3374(bool, bool_51_, bool_52_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, i, 0, (int) f_55_,
					       (int) f_56_, f_58_, f_71_);
				    f_56_ += f_69_;
				    f_55_ += f_67_;
				    f_58_ += f_72_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_53_ >= 0.0F) {
				    method3374(bool, bool_51_, bool_52_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, i, 0, (int) f_55_,
					       (int) f_57_, f_58_, f_71_);
				    f_57_ += f_68_;
				    f_55_ += f_67_;
				    f_58_ += f_72_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			}
		    }
		} else if (f_53_ <= f_54_) {
		    if (!(f_53_ >= (float) ((Class155_Backup) this).anInt1726)) {
			if (f_54_ > (float) ((Class155_Backup) this).anInt1726)
			    f_54_ = (float) ((Class155_Backup) this).anInt1726;
			if (f > (float) ((Class155_Backup) this).anInt1726)
			    f = (float) ((Class155_Backup) this).anInt1726;
			f_59_ = f_59_ - f_71_ * f_56_ + f_71_;
			if (f_54_ < f) {
			    f_55_ = f_56_;
			    if (f_53_ < 0.0F) {
				f_55_ -= f_67_ * f_53_;
				f_56_ -= f_68_ * f_53_;
				f_59_ -= f_72_ * f_53_;
				f_53_ = 0.0F;
			    }
			    if (f_54_ < 0.0F) {
				f_57_ -= f_69_ * f_54_;
				f_54_ = 0.0F;
			    }
			    if (f_53_ != f_54_ && f_67_ < f_68_
				|| f_53_ == f_54_ && f_67_ > f_69_) {
				f_53_ += 0.5F;
				f_54_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_54_;
				f_54_ -= f_53_;
				f_53_ = (float) (((Class155_Backup) this)
						 .anIntArray1730[(int) f_53_]);
				while (--f_54_ >= 0.0F) {
				    method3374(bool, bool_51_, bool_52_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_53_, i, 0, (int) f_55_,
					       (int) f_56_, f_59_, f_71_);
				    f_55_ += f_67_;
				    f_56_ += f_68_;
				    f_59_ += f_72_;
				    f_53_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f >= 0.0F) {
				    method3374(bool, bool_51_, bool_52_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_53_, i, 0, (int) f_55_,
					       (int) f_57_, f_59_, f_71_);
				    f_55_ += f_67_;
				    f_57_ += f_69_;
				    f_59_ += f_72_;
				    f_53_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f_53_ += 0.5F;
				f_54_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_54_;
				f_54_ -= f_53_;
				f_53_ = (float) (((Class155_Backup) this)
						 .anIntArray1730[(int) f_53_]);
				while (--f_54_ >= 0.0F) {
				    method3374(bool, bool_51_, bool_52_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_53_, i, 0, (int) f_56_,
					       (int) f_55_, f_59_, f_71_);
				    f_55_ += f_67_;
				    f_56_ += f_68_;
				    f_59_ += f_72_;
				    f_53_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f >= 0.0F) {
				    method3374(bool, bool_51_, bool_52_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_53_, i, 0, (int) f_57_,
					       (int) f_55_, f_59_, f_71_);
				    f_55_ += f_67_;
				    f_57_ += f_69_;
				    f_59_ += f_72_;
				    f_53_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			} else {
			    f_57_ = f_56_;
			    if (f_53_ < 0.0F) {
				f_57_ -= f_67_ * f_53_;
				f_56_ -= f_68_ * f_53_;
				f_59_ -= f_72_ * f_53_;
				f_53_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_55_ -= f_69_ * f;
				f = 0.0F;
			    }
			    if (f_67_ < f_68_) {
				f_53_ += 0.5F;
				f += 0.5F;
				f_54_ = (float) (int) (f_54_ + 0.5F) - f;
				f -= f_53_;
				f_53_ = (float) (((Class155_Backup) this)
						 .anIntArray1730[(int) f_53_]);
				while (--f >= 0.0F) {
				    method3374(bool, bool_51_, bool_52_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_53_, i, 0, (int) f_57_,
					       (int) f_56_, f_59_, f_71_);
				    f_57_ += f_67_;
				    f_56_ += f_68_;
				    f_59_ += f_72_;
				    f_53_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_54_ >= 0.0F) {
				    method3374(bool, bool_51_, bool_52_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_53_, i, 0, (int) f_55_,
					       (int) f_56_, f_59_, f_71_);
				    f_55_ += f_69_;
				    f_56_ += f_68_;
				    f_59_ += f_72_;
				    f_53_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f_53_ += 0.5F;
				f += 0.5F;
				f_54_ = (float) (int) (f_54_ + 0.5F) - f;
				f -= f_53_;
				f_53_ = (float) (((Class155_Backup) this)
						 .anIntArray1730[(int) f_53_]);
				while (--f >= 0.0F) {
				    method3374(bool, bool_51_, bool_52_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_53_, i, 0, (int) f_56_,
					       (int) f_57_, f_59_, f_71_);
				    f_57_ += f_67_;
				    f_56_ += f_68_;
				    f_59_ += f_72_;
				    f_53_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_54_ >= 0.0F) {
				    method3374(bool, bool_51_, bool_52_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_53_, i, 0, (int) f_56_,
					       (int) f_55_, f_59_, f_71_);
				    f_55_ += f_69_;
				    f_56_ += f_68_;
				    f_59_ += f_72_;
				    f_53_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			}
		    }
		} else if (!(f_54_ >= (float) ((Class155_Backup) this).anInt1726)) {
		    if (f > (float) ((Class155_Backup) this).anInt1726)
			f = (float) ((Class155_Backup) this).anInt1726;
		    if (f_53_ > (float) ((Class155_Backup) this).anInt1726)
			f_53_ = (float) ((Class155_Backup) this).anInt1726;
		    f_60_ = f_60_ - f_71_ * f_57_ + f_71_;
		    if (f < f_53_) {
			f_56_ = f_57_;
			if (f_54_ < 0.0F) {
			    f_56_ -= f_68_ * f_54_;
			    f_57_ -= f_69_ * f_54_;
			    f_60_ -= f_72_ * f_54_;
			    f_54_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_55_ -= f_67_ * f;
			    f = 0.0F;
			}
			if (f_68_ < f_69_) {
			    f_54_ += 0.5F;
			    f += 0.5F;
			    f_53_ = (float) (int) (f_53_ + 0.5F) - f;
			    f -= f_54_;
			    f_54_ = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f_54_]);
			    while (--f >= 0.0F) {
				method3374(bool, bool_51_, bool_52_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_54_, i, 0, (int) f_56_,
					   (int) f_57_, f_60_, f_71_);
				f_56_ += f_68_;
				f_57_ += f_69_;
				f_60_ += f_72_;
				f_54_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f_53_ >= 0.0F) {
				method3374(bool, bool_51_, bool_52_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_54_, i, 0, (int) f_56_,
					   (int) f_55_, f_60_, f_71_);
				f_56_ += f_68_;
				f_55_ += f_67_;
				f_60_ += f_72_;
				f_54_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			} else {
			    f_54_ += 0.5F;
			    f += 0.5F;
			    f_53_ = (float) (int) (f_53_ + 0.5F) - f;
			    f -= f_54_;
			    f_54_ = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f_54_]);
			    while (--f >= 0.0F) {
				method3374(bool, bool_51_, bool_52_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_54_, i, 0, (int) f_57_,
					   (int) f_56_, f_60_, f_71_);
				f_56_ += f_68_;
				f_57_ += f_69_;
				f_60_ += f_72_;
				f_54_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f_53_ >= 0.0F) {
				method3374(bool, bool_51_, bool_52_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_54_, i, 0, (int) f_55_,
					   (int) f_56_, f_60_, f_71_);
				f_56_ += f_68_;
				f_55_ += f_67_;
				f_60_ += f_72_;
				f_54_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			}
		    } else {
			f_55_ = f_57_;
			if (f_54_ < 0.0F) {
			    f_55_ -= f_68_ * f_54_;
			    f_57_ -= f_69_ * f_54_;
			    f_60_ -= f_72_ * f_54_;
			    f_54_ = 0.0F;
			}
			if (f_53_ < 0.0F) {
			    f_56_ -= f_67_ * f_53_;
			    f_53_ = 0.0F;
			}
			if (f_68_ < f_69_) {
			    f_54_ += 0.5F;
			    f_53_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_53_;
			    f_53_ -= f_54_;
			    f_54_ = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f_54_]);
			    while (--f_53_ >= 0.0F) {
				method3374(bool, bool_51_, bool_52_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_54_, i, 0, (int) f_55_,
					   (int) f_57_, f_60_, f_71_);
				f_55_ += f_68_;
				f_57_ += f_69_;
				f_60_ += f_72_;
				f_54_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f >= 0.0F) {
				method3374(bool, bool_51_, bool_52_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_54_, i, 0, (int) f_56_,
					   (int) f_57_, f_60_, f_71_);
				f_56_ += f_67_;
				f_57_ += f_69_;
				f_60_ += f_72_;
				f_54_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			} else {
			    f_54_ += 0.5F;
			    f_53_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_53_;
			    f_53_ -= f_54_;
			    f_54_ = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f_54_]);
			    while (--f_53_ >= 0.0F) {
				method3374(bool, bool_51_, bool_52_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_54_, i, 0, (int) f_57_,
					   (int) f_55_, f_60_, f_71_);
				f_55_ += f_68_;
				f_57_ += f_69_;
				f_60_ += f_72_;
				f_54_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f >= 0.0F) {
				method3374(bool, bool_51_, bool_52_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_54_, i, 0, (int) f_57_,
					   (int) f_56_, f_60_, f_71_);
				f_56_ += f_67_;
				f_57_ += f_69_;
				f_60_ += f_72_;
				f_54_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method3347(boolean bool, boolean bool_73_, int[] is, int i,
			  int i_74_, int i_75_, int i_76_, int i_77_, float f,
			  float f_78_, float f_79_, float f_80_) {
	if (((Class155_Backup) this).aBool1748) {
	    if (i_77_ > ((Class155_Backup) this).anInt1733)
		i_77_ = ((Class155_Backup) this).anInt1733;
	    if (i_76_ < 0)
		i_76_ = 0;
	}
	if (i_76_ < i_77_) {
	    i += i_76_ - 1;
	    f += f_78_ * (float) i_76_;
	    f_79_ += f_80_ * (float) i_76_;
	    if (((Class189) ((Class155_Backup) this).aClass189_1736).aBool2220) {
		if (((Class155_Backup) this).aBool1721) {
		    i_75_ = i_77_ - i_76_ >> 2;
		    f_78_ *= 4.0F;
		    if (((Class155_Backup) this).anInt1723 == 0) {
			if (i_75_ > 0) {
			    do {
				i_74_ = (Class474.anIntArray6382
					 [(int) f & 0xffff]);
				f += f_78_;
				i++;
				if (!bool || f_79_ < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
				    is[i] = i_74_;
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_79_;
				}
				f_79_ += f_80_;
				i++;
				if (!bool || f_79_ < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
				    is[i] = i_74_;
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_79_;
				}
				f_79_ += f_80_;
				i++;
				if (!bool || f_79_ < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
				    is[i] = i_74_;
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_79_;
				}
				f_79_ += f_80_;
				i++;
				if (!bool || f_79_ < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
				    is[i] = i_74_;
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_79_;
				}
				f_79_ += f_80_;
			    } while (--i_75_ > 0);
			}
			i_75_ = i_77_ - i_76_ & 0x3;
			if (i_75_ > 0) {
			    i_74_ = Class474.anIntArray6382[(int) f & 0xffff];
			    do {
				i++;
				if (!bool || f_79_ < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
				    is[i] = i_74_;
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_79_;
				}
				f_79_ += f_80_;
			    } while (--i_75_ > 0);
			}
		    } else {
			int i_81_ = ((Class155_Backup) this).anInt1723;
			int i_82_ = 256 - ((Class155_Backup) this).anInt1723;
			if (i_75_ > 0) {
			    do {
				i_74_ = (Class474.anIntArray6382
					 [(int) f & 0xffff]);
				f += f_78_;
				i_74_ = (((i_74_ & 0xff00ff) * i_82_ >> 8
					  & 0xff00ff)
					 + ((i_74_ & 0xff00) * i_82_ >> 8
					    & 0xff00));
				i++;
				if (!bool || f_79_ < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
				    int i_83_ = is[i];
				    if (bool_73_)
					is[i]
					    = ((i_82_ | i_83_ >> 24) << 24
					       | (i_74_
						  + (((i_83_ & 0xff00ff)
						      * i_81_) >> 8
						     & 0xff00ff)
						  + (((i_83_ & 0xff00) * i_81_
						      >> 8)
						     & 0xff00)));
				    else
					is[i]
					    = (i_74_
					       + (((i_83_ & 0xff00ff) * i_81_
						   >> 8)
						  & 0xff00ff)
					       + ((i_83_ & 0xff00) * i_81_ >> 8
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_79_;
				}
				f_79_ += f_80_;
				i++;
				if (!bool || f_79_ < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
				    int i_84_ = is[i];
				    if (bool_73_)
					is[i]
					    = ((i_82_ | i_84_ >> 24) << 24
					       | (i_74_
						  + (((i_84_ & 0xff00ff)
						      * i_81_) >> 8
						     & 0xff00ff)
						  + (((i_84_ & 0xff00) * i_81_
						      >> 8)
						     & 0xff00)));
				    else
					is[i]
					    = (i_74_
					       + (((i_84_ & 0xff00ff) * i_81_
						   >> 8)
						  & 0xff00ff)
					       + ((i_84_ & 0xff00) * i_81_ >> 8
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_79_;
				}
				f_79_ += f_80_;
				i++;
				if (!bool || f_79_ < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
				    int i_85_ = is[i];
				    if (bool_73_)
					is[i]
					    = ((i_82_ | i_85_ >> 24) << 24
					       | (i_74_
						  + (((i_85_ & 0xff00ff)
						      * i_81_) >> 8
						     & 0xff00ff)
						  + (((i_85_ & 0xff00) * i_81_
						      >> 8)
						     & 0xff00)));
				    else
					is[i]
					    = (i_74_
					       + (((i_85_ & 0xff00ff) * i_81_
						   >> 8)
						  & 0xff00ff)
					       + ((i_85_ & 0xff00) * i_81_ >> 8
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_79_;
				}
				f_79_ += f_80_;
				i++;
				if (!bool || f_79_ < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
				    int i_86_ = is[i];
				    if (bool_73_)
					is[i]
					    = ((i_82_ | i_86_ >> 24) << 24
					       | (i_74_
						  + (((i_86_ & 0xff00ff)
						      * i_81_) >> 8
						     & 0xff00ff)
						  + (((i_86_ & 0xff00) * i_81_
						      >> 8)
						     & 0xff00)));
				    else
					is[i]
					    = (i_74_
					       + (((i_86_ & 0xff00ff) * i_81_
						   >> 8)
						  & 0xff00ff)
					       + ((i_86_ & 0xff00) * i_81_ >> 8
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_79_;
				}
				f_79_ += f_80_;
			    } while (--i_75_ > 0);
			}
			i_75_ = i_77_ - i_76_ & 0x3;
			if (i_75_ > 0) {
			    i_74_ = Class474.anIntArray6382[(int) f & 0xffff];
			    i_74_
				= (((i_74_ & 0xff00ff) * i_82_ >> 8 & 0xff00ff)
				   + ((i_74_ & 0xff00) * i_82_ >> 8 & 0xff00));
			    do {
				i++;
				if (!bool || f_79_ < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
				    int i_87_ = is[i];
				    if (bool_73_)
					is[i]
					    = ((i_82_ | i_87_ >> 24) << 24
					       | (i_74_
						  + (((i_87_ & 0xff00ff)
						      * i_81_) >> 8
						     & 0xff00ff)
						  + (((i_87_ & 0xff00) * i_81_
						      >> 8)
						     & 0xff00)));
				    else
					is[i]
					    = (i_74_
					       + (((i_87_ & 0xff00ff) * i_81_
						   >> 8)
						  & 0xff00ff)
					       + ((i_87_ & 0xff00) * i_81_ >> 8
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_79_;
				}
				f_79_ += f_80_;
			    } while (--i_75_ > 0);
			}
		    }
		} else {
		    i_75_ = i_77_ - i_76_;
		    if (((Class155_Backup) this).anInt1723 == 0) {
			do {
			    i++;
			    if (!bool || f_79_ < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				is[i] = (Class474.anIntArray6382
					 [(int) f & 0xffff]);
				if (bool)
				    ((Class155_Backup) this).aFloatArray1739[i]
					= f_79_;
			    }
			    f_79_ += f_80_;
			    f += f_78_;
			} while (--i_75_ > 0);
		    } else {
			int i_88_ = ((Class155_Backup) this).anInt1723;
			int i_89_ = 256 - ((Class155_Backup) this).anInt1723;
			do {
			    i++;
			    if (!bool || f_79_ < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				i_74_ = (Class474.anIntArray6382
					 [(int) f & 0xffff]);
				i_74_ = (((i_74_ & 0xff00ff) * i_89_ >> 8
					  & 0xff00ff)
					 + ((i_74_ & 0xff00) * i_89_ >> 8
					    & 0xff00));
				int i_90_ = is[i];
				if (bool_73_)
				    is[i]
					= ((i_89_ | i_90_ >> 24) << 24
					   | (i_74_
					      + (((i_90_ & 0xff00ff) * i_88_
						  >> 8)
						 & 0xff00ff)
					      + ((i_90_ & 0xff00) * i_88_ >> 8
						 & 0xff00)));
				else
				    is[i] = (i_74_
					     + ((i_90_ & 0xff00ff) * i_88_ >> 8
						& 0xff00ff)
					     + ((i_90_ & 0xff00) * i_88_ >> 8
						& 0xff00));
				if (bool)
				    ((Class155_Backup) this).aFloatArray1739[i]
					= f_79_;
			    }
			    f += f_78_;
			    f_79_ += f_80_;
			} while (--i_75_ > 0);
		    }
		}
	    } else if (((Class155_Backup) this).aBool1721) {
		i_75_ = i_77_ - i_76_ >> 2;
		f_78_ *= 4.0F;
		if (((Class155_Backup) this).anInt1723 == 0) {
		    if (i_75_ > 0) {
			do {
			    i_74_ = Class474.anIntArray6382[(int) f & 0xffff];
			    f += f_78_;
			    i++;
			    if (!bool || f_79_ < (((Class155_Backup) this)
						  .aFloatArray1739[i]))
				is[i] = i_74_;
			    f_79_ += f_80_;
			    i++;
			    if (!bool || f_79_ < (((Class155_Backup) this)
						  .aFloatArray1739[i]))
				is[i] = i_74_;
			    f_79_ += f_80_;
			    i++;
			    if (!bool || f_79_ < (((Class155_Backup) this)
						  .aFloatArray1739[i]))
				is[i] = i_74_;
			    f_79_ += f_80_;
			    i++;
			    if (!bool || f_79_ < (((Class155_Backup) this)
						  .aFloatArray1739[i]))
				is[i] = i_74_;
			    f_79_ += f_80_;
			} while (--i_75_ > 0);
		    }
		    i_75_ = i_77_ - i_76_ & 0x3;
		    if (i_75_ > 0) {
			i_74_ = Class474.anIntArray6382[(int) f & 0xffff];
			do {
			    i++;
			    if (!bool || f_79_ < (((Class155_Backup) this)
						  .aFloatArray1739[i]))
				is[i] = i_74_;
			    f_79_ += f_80_;
			} while (--i_75_ > 0);
		    }
		} else {
		    int i_91_ = ((Class155_Backup) this).anInt1723;
		    int i_92_ = 256 - ((Class155_Backup) this).anInt1723;
		    if (i_75_ > 0) {
			do {
			    i_74_ = Class474.anIntArray6382[(int) f & 0xffff];
			    f += f_78_;
			    i_74_
				= (((i_74_ & 0xff00ff) * i_92_ >> 8 & 0xff00ff)
				   + ((i_74_ & 0xff00) * i_92_ >> 8 & 0xff00));
			    i++;
			    if (!bool || f_79_ < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				int i_93_ = is[i];
				if (bool_73_)
				    is[i]
					= ((i_92_ | i_93_ >> 24) << 24
					   | (i_74_
					      + (((i_93_ & 0xff00ff) * i_91_
						  >> 8)
						 & 0xff00ff)
					      + ((i_93_ & 0xff00) * i_91_ >> 8
						 & 0xff00)));
				else
				    is[i] = (i_74_
					     + ((i_93_ & 0xff00ff) * i_91_ >> 8
						& 0xff00ff)
					     + ((i_93_ & 0xff00) * i_91_ >> 8
						& 0xff00));
			    }
			    f_79_ += f_80_;
			    i++;
			    if (!bool || f_79_ < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				int i_94_ = is[i];
				if (bool_73_)
				    is[i]
					= ((i_92_ | i_94_ >> 24) << 24
					   | (i_74_
					      + (((i_94_ & 0xff00ff) * i_91_
						  >> 8)
						 & 0xff00ff)
					      + ((i_94_ & 0xff00) * i_91_ >> 8
						 & 0xff00)));
				else
				    is[i] = (i_74_
					     + ((i_94_ & 0xff00ff) * i_91_ >> 8
						& 0xff00ff)
					     + ((i_94_ & 0xff00) * i_91_ >> 8
						& 0xff00));
			    }
			    f_79_ += f_80_;
			    i++;
			    if (!bool || f_79_ < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				int i_95_ = is[i];
				if (bool_73_)
				    is[i]
					= ((i_92_ | i_95_ >> 24) << 24
					   | (i_74_
					      + (((i_95_ & 0xff00ff) * i_91_
						  >> 8)
						 & 0xff00ff)
					      + ((i_95_ & 0xff00) * i_91_ >> 8
						 & 0xff00)));
				else
				    is[i] = (i_74_
					     + ((i_95_ & 0xff00ff) * i_91_ >> 8
						& 0xff00ff)
					     + ((i_95_ & 0xff00) * i_91_ >> 8
						& 0xff00));
			    }
			    f_79_ += f_80_;
			    i++;
			    if (!bool || f_79_ < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				int i_96_ = is[i];
				if (bool_73_)
				    is[i]
					= ((i_92_ | i_96_ >> 24) << 24
					   | (i_74_
					      + (((i_96_ & 0xff00ff) * i_91_
						  >> 8)
						 & 0xff00ff)
					      + ((i_96_ & 0xff00) * i_91_ >> 8
						 & 0xff00)));
				else
				    is[i] = (i_74_
					     + ((i_96_ & 0xff00ff) * i_91_ >> 8
						& 0xff00ff)
					     + ((i_96_ & 0xff00) * i_91_ >> 8
						& 0xff00));
			    }
			    f_79_ += f_80_;
			} while (--i_75_ > 0);
		    }
		    i_75_ = i_77_ - i_76_ & 0x3;
		    if (i_75_ > 0) {
			i_74_ = Class474.anIntArray6382[(int) f & 0xffff];
			i_74_ = (((i_74_ & 0xff00ff) * i_92_ >> 8 & 0xff00ff)
				 + ((i_74_ & 0xff00) * i_92_ >> 8 & 0xff00));
			do {
			    i++;
			    if (!bool || f_79_ < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				int i_97_ = is[i];
				if (bool_73_)
				    is[i]
					= ((i_92_ | i_97_ >> 24) << 24
					   | (i_74_
					      + (((i_97_ & 0xff00ff) * i_91_
						  >> 8)
						 & 0xff00ff)
					      + ((i_97_ & 0xff00) * i_91_ >> 8
						 & 0xff00)));
				else
				    is[i] = (i_74_
					     + ((i_97_ & 0xff00ff) * i_91_ >> 8
						& 0xff00ff)
					     + ((i_97_ & 0xff00) * i_91_ >> 8
						& 0xff00));
			    }
			    f_79_ += f_80_;
			} while (--i_75_ > 0);
		    }
		}
	    } else {
		i_75_ = i_77_ - i_76_;
		if (((Class155_Backup) this).anInt1723 == 0) {
		    do {
			i++;
			if (!bool
			    || f_79_ < ((Class155_Backup) this).aFloatArray1739[i])
			    is[i] = Class474.anIntArray6382[(int) f & 0xffff];
			f_79_ += f_80_;
			f += f_78_;
		    } while (--i_75_ > 0);
		} else {
		    int i_98_ = ((Class155_Backup) this).anInt1723;
		    int i_99_ = 256 - ((Class155_Backup) this).anInt1723;
		    do {
			i++;
			if (!bool
			    || f_79_ < ((Class155_Backup) this).aFloatArray1739[i]) {
			    i_74_ = Class474.anIntArray6382[(int) f & 0xffff];
			    i_74_
				= (((i_74_ & 0xff00ff) * i_99_ >> 8 & 0xff00ff)
				   + ((i_74_ & 0xff00) * i_99_ >> 8 & 0xff00));
			    int i_100_ = is[i];
			    if (bool_73_)
				is[i] = ((i_99_ | i_100_ >> 24) << 24
					 | (i_74_
					    + ((i_100_ & 0xff00ff) * i_98_ >> 8
					       & 0xff00ff)
					    + ((i_100_ & 0xff00) * i_98_ >> 8
					       & 0xff00)));
			    else
				is[i] = (i_74_
					 + ((i_100_ & 0xff00ff) * i_98_ >> 8
					    & 0xff00ff)
					 + ((i_100_ & 0xff00) * i_98_ >> 8
					    & 0xff00));
			}
			f += f_78_;
			f_79_ += f_80_;
		    } while (--i_75_ > 0);
		}
	    }
	}
    }
    
    final void method3348
	(boolean bool, boolean bool_101_, boolean bool_102_, float f,
	 float f_103_, float f_104_, float f_105_, float f_106_, float f_107_,
	 float f_108_, float f_109_, float f_110_, float f_111_, float f_112_,
	 float f_113_, float f_114_, float f_115_, float f_116_, float f_117_,
	 float f_118_, float f_119_, int i, int i_120_, int i_121_, int i_122_,
	 float f_123_, float f_124_, float f_125_, int i_126_, int i_127_) {
	if (!bool)
	    method3377(false, bool_101_, bool_102_, f, f_103_, f_104_, f_105_,
		       f_106_, f_107_, f_108_, f_109_, f_110_, 0);
	else {
	    int i_128_ = (i_126_ & 0xffff) << 16 | i_127_ & 0xffff;
	    if (i_128_ != ((Class155_Backup) this).anInt1734) {
		((Class155_Backup) this).anIntArray1725
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15389(i_126_, i_127_);
		if (((Class155_Backup) this).anIntArray1725 == null) {
		    ((Class155_Backup) this).anInt1734 = -1;
		    ((Class155_Backup) this).anInt1723 = 255 - (i >> 24 & 0xff);
		    ((Class155_Backup) this).anInt1747 = 0;
		    int i_129_ = (Class474.anIntArray6382
				  [(Class241_Sub42.method16451
				    (((Class155_Backup) this).aClass103_Sub2_1743
					 .method15368(i_126_),
				     280235293)) & 0xffff]);
		    int i_130_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_129_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_129_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_129_ & 0xff) >> 8);
		    method3385(true, bool_101_, bool_102_, f, f_103_, f_104_,
			       f_105_, f_106_, f_107_, f_108_, f_109_, f_110_,
			       Class54.method1306(i_130_, i_122_, f_123_,
						  1372221625),
			       Class54.method1306(i_130_, i_122_, f_124_,
						  1372221625),
			       Class54.method1306(i_130_, i_122_, f_125_,
						  1372221625));
		    return;
		}
		((Class155_Backup) this).anInt1734 = i_128_;
		((Class155_Backup) this).anInt1752
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15365(i_126_);
		((Class155_Backup) this).anInt1744 = ((Class155_Backup) this).anInt1752 - 1;
		((Class155_Backup) this).aClass529_1746
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15366(i_126_);
		((Class155_Backup) this).aBool1741
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15396(i_126_);
		((Class155_Backup) this).anInt1747
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15367(i_126_) & 0xff;
	    }
	    ((Class155_Backup) this).anInt1740 = i_122_;
	    if (!(f <= f_103_) || !(f <= f_104_)) {
		if (f_103_ <= f_104_) {
		    float f_131_ = f_105_;
		    f_105_ = f_106_;
		    f_106_ = f_131_;
		    f_131_ = f;
		    f = f_103_;
		    f_103_ = f_131_;
		    f_131_ = f_108_;
		    f_108_ = f_109_;
		    f_109_ = f_131_;
		    f_131_ = f_114_;
		    f_114_ = f_115_;
		    f_115_ = f_131_;
		    f_131_ = f_117_;
		    f_117_ = f_118_;
		    f_118_ = f_131_;
		    f_131_ = f_111_;
		    f_111_ = f_112_;
		    f_112_ = f_131_;
		    f_131_ = f_123_;
		    f_123_ = f_124_;
		    f_124_ = f_131_;
		    int i_132_ = i;
		    i = i_120_;
		    i_120_ = i_132_;
		} else {
		    float f_133_ = f_105_;
		    f_105_ = f_107_;
		    f_107_ = f_133_;
		    f_133_ = f;
		    f = f_104_;
		    f_104_ = f_133_;
		    f_133_ = f_108_;
		    f_108_ = f_110_;
		    f_110_ = f_133_;
		    f_133_ = f_114_;
		    f_114_ = f_116_;
		    f_116_ = f_133_;
		    f_133_ = f_117_;
		    f_117_ = f_119_;
		    f_119_ = f_133_;
		    f_133_ = f_111_;
		    f_111_ = f_113_;
		    f_113_ = f_133_;
		    f_133_ = f_123_;
		    f_123_ = f_125_;
		    f_125_ = f_133_;
		    int i_134_ = i;
		    i = i_121_;
		    i_121_ = i_134_;
		}
	    }
	    f_114_ /= f_111_;
	    f_115_ /= f_112_;
	    f_116_ /= f_113_;
	    f_117_ /= f_111_;
	    f_118_ /= f_112_;
	    f_119_ /= f_113_;
	    f_108_ = 1.0F / f_108_;
	    f_109_ = 1.0F / f_109_;
	    f_110_ = 1.0F / f_110_;
	    f_111_ = 1.0F / f_111_;
	    f_112_ = 1.0F / f_112_;
	    f_113_ = 1.0F / f_113_;
	    float f_135_ = (float) (i >> 24 & 0xff);
	    float f_136_ = (float) (i_120_ >> 24 & 0xff);
	    float f_137_ = (float) (i_121_ >> 24 & 0xff);
	    float f_138_ = (float) (i >> 16 & 0xff);
	    float f_139_ = (float) (i_120_ >> 16 & 0xff);
	    float f_140_ = (float) (i_121_ >> 16 & 0xff);
	    float f_141_ = (float) (i >> 8 & 0xff);
	    float f_142_ = (float) (i_120_ >> 8 & 0xff);
	    float f_143_ = (float) (i_121_ >> 8 & 0xff);
	    float f_144_ = (float) (i & 0xff);
	    float f_145_ = (float) (i_120_ & 0xff);
	    float f_146_ = (float) (i_121_ & 0xff);
	    float f_147_ = 0.0F;
	    float f_148_ = 0.0F;
	    float f_149_ = 0.0F;
	    float f_150_ = 0.0F;
	    float f_151_ = 0.0F;
	    float f_152_ = 0.0F;
	    float f_153_ = 0.0F;
	    float f_154_ = 0.0F;
	    float f_155_ = 0.0F;
	    float f_156_ = 0.0F;
	    if (f_103_ != f) {
		float f_157_ = f_103_ - f;
		f_147_ = (f_106_ - f_105_) / f_157_;
		f_148_ = (f_109_ - f_108_) / f_157_;
		f_149_ = (f_112_ - f_111_) / f_157_;
		f_150_ = (f_115_ - f_114_) / f_157_;
		f_151_ = (f_118_ - f_117_) / f_157_;
		f_152_ = (f_124_ - f_123_) / f_157_;
		f_153_ = (f_136_ - f_135_) / f_157_;
		f_154_ = (f_139_ - f_138_) / f_157_;
		f_155_ = (f_142_ - f_141_) / f_157_;
		f_156_ = (f_145_ - f_144_) / f_157_;
	    }
	    float f_158_ = 0.0F;
	    float f_159_ = 0.0F;
	    float f_160_ = 0.0F;
	    float f_161_ = 0.0F;
	    float f_162_ = 0.0F;
	    float f_163_ = 0.0F;
	    float f_164_ = 0.0F;
	    float f_165_ = 0.0F;
	    float f_166_ = 0.0F;
	    float f_167_ = 0.0F;
	    if (f_104_ != f_103_) {
		float f_168_ = f_104_ - f_103_;
		f_158_ = (f_107_ - f_106_) / f_168_;
		f_159_ = (f_110_ - f_109_) / f_168_;
		f_160_ = (f_113_ - f_112_) / f_168_;
		f_161_ = (f_116_ - f_115_) / f_168_;
		f_162_ = (f_119_ - f_118_) / f_168_;
		f_163_ = (f_125_ - f_124_) / f_168_;
		f_164_ = (f_137_ - f_136_) / f_168_;
		f_165_ = (f_140_ - f_139_) / f_168_;
		f_166_ = (f_143_ - f_142_) / f_168_;
		f_167_ = (f_146_ - f_145_) / f_168_;
	    }
	    float f_169_ = 0.0F;
	    float f_170_ = 0.0F;
	    float f_171_ = 0.0F;
	    float f_172_ = 0.0F;
	    float f_173_ = 0.0F;
	    float f_174_ = 0.0F;
	    float f_175_ = 0.0F;
	    float f_176_ = 0.0F;
	    float f_177_ = 0.0F;
	    float f_178_ = 0.0F;
	    if (f != f_104_) {
		float f_179_ = f - f_104_;
		f_169_ = (f_105_ - f_107_) / f_179_;
		f_170_ = (f_108_ - f_110_) / f_179_;
		f_171_ = (f_111_ - f_113_) / f_179_;
		f_172_ = (f_114_ - f_116_) / f_179_;
		f_173_ = (f_117_ - f_119_) / f_179_;
		f_174_ = (f_123_ - f_125_) / f_179_;
		f_175_ = (f_135_ - f_137_) / f_179_;
		f_176_ = (f_138_ - f_140_) / f_179_;
		f_177_ = (f_141_ - f_143_) / f_179_;
		f_178_ = (f_144_ - f_146_) / f_179_;
	    }
	    if (!(f >= (float) ((Class155_Backup) this).anInt1726)) {
		if (f_103_ > (float) ((Class155_Backup) this).anInt1726)
		    f_103_ = (float) ((Class155_Backup) this).anInt1726;
		if (f_104_ > (float) ((Class155_Backup) this).anInt1726)
		    f_104_ = (float) ((Class155_Backup) this).anInt1726;
		if (f_103_ < f_104_) {
		    f_107_ = f_105_;
		    f_110_ = f_108_;
		    f_113_ = f_111_;
		    f_116_ = f_114_;
		    f_119_ = f_117_;
		    f_125_ = f_123_;
		    f_137_ = f_135_;
		    f_140_ = f_138_;
		    f_143_ = f_141_;
		    f_146_ = f_144_;
		    if (f < 0.0F) {
			f_105_ -= f_147_ * f;
			f_107_ -= f_169_ * f;
			f_108_ -= f_148_ * f;
			f_110_ -= f_170_ * f;
			f_111_ -= f_149_ * f;
			f_113_ -= f_171_ * f;
			f_114_ -= f_150_ * f;
			f_116_ -= f_172_ * f;
			f_117_ -= f_151_ * f;
			f_119_ -= f_173_ * f;
			f_123_ -= f_152_ * f;
			f_125_ -= f_174_ * f;
			f_135_ -= f_153_ * f;
			f_137_ -= f_175_ * f;
			f_138_ -= f_153_ * f;
			f_140_ -= f_175_ * f;
			f_141_ -= f_153_ * f;
			f_143_ -= f_175_ * f;
			f_144_ -= f_153_ * f;
			f_146_ -= f_175_ * f;
			f = 0.0F;
		    }
		    if (f_103_ < 0.0F) {
			f_106_ -= f_158_ * f_103_;
			f_109_ -= f_159_ * f_103_;
			f_112_ -= f_160_ * f_103_;
			f_115_ -= f_161_ * f_103_;
			f_118_ -= f_162_ * f_103_;
			f_124_ -= f_163_ * f_103_;
			f_136_ -= f_164_ * f_103_;
			f_139_ -= f_165_ * f_103_;
			f_142_ -= f_166_ * f_103_;
			f_145_ -= f_167_ * f_103_;
			f_103_ = 0.0F;
		    }
		    if (f != f_103_ && f_169_ < f_147_
			|| f == f_103_ && f_169_ > f_158_) {
			f += 0.5F;
			f_103_ += 0.5F;
			f_104_ = (float) (int) (f_104_ + 0.5F) - f_103_;
			f_103_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_103_ >= 0.0F) {
			    method3353(bool_101_, bool_102_,
				       ((Class155_Backup) this).anIntArray1751,
				       ((Class155_Backup) this).anIntArray1725,
				       (int) f, (int) f_107_, (int) f_105_,
				       f_110_, f_108_, f_113_, f_111_, f_116_,
				       f_114_, f_119_, f_117_, f_125_, f_123_,
				       f_137_, f_135_, f_140_, f_138_, f_143_,
				       f_141_, f_146_, f_144_);
			    f_105_ += f_147_;
			    f_107_ += f_169_;
			    f_108_ += f_148_;
			    f_110_ += f_170_;
			    f_111_ += f_149_;
			    f_113_ += f_171_;
			    f_114_ += f_150_;
			    f_116_ += f_172_;
			    f_117_ += f_151_;
			    f_119_ += f_173_;
			    f_123_ += f_152_;
			    f_125_ += f_174_;
			    f_135_ += f_153_;
			    f_137_ += f_175_;
			    f_138_ += f_154_;
			    f_140_ += f_176_;
			    f_141_ += f_155_;
			    f_143_ += f_177_;
			    f_144_ += f_156_;
			    f_146_ += f_178_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_104_ >= 0.0F) {
			    method3353(bool_101_, bool_102_,
				       ((Class155_Backup) this).anIntArray1751,
				       ((Class155_Backup) this).anIntArray1725,
				       (int) f, (int) f_107_, (int) f_106_,
				       f_110_, f_109_, f_113_, f_112_, f_116_,
				       f_115_, f_119_, f_118_, f_125_, f_124_,
				       f_137_, f_136_, f_140_, f_139_, f_143_,
				       f_142_, f_146_, f_145_);
			    f_106_ += f_158_;
			    f_107_ += f_169_;
			    f_109_ += f_159_;
			    f_110_ += f_170_;
			    f_112_ += f_160_;
			    f_113_ += f_171_;
			    f_115_ += f_161_;
			    f_116_ += f_172_;
			    f_118_ += f_162_;
			    f_119_ += f_173_;
			    f_124_ += f_163_;
			    f_125_ += f_174_;
			    f_136_ += f_164_;
			    f_137_ += f_175_;
			    f_139_ += f_165_;
			    f_140_ += f_176_;
			    f_142_ += f_166_;
			    f_143_ += f_177_;
			    f_145_ += f_167_;
			    f_146_ += f_178_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    } else {
			f += 0.5F;
			f_103_ += 0.5F;
			f_104_ = (float) (int) (f_104_ + 0.5F) - f_103_;
			f_103_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_103_ >= 0.0F) {
			    method3353(bool_101_, bool_102_,
				       ((Class155_Backup) this).anIntArray1751,
				       ((Class155_Backup) this).anIntArray1725,
				       (int) f, (int) f_105_, (int) f_107_,
				       f_108_, f_110_, f_111_, f_113_, f_114_,
				       f_116_, f_117_, f_119_, f_123_, f_125_,
				       f_135_, f_137_, f_138_, f_140_, f_141_,
				       f_143_, f_144_, f_146_);
			    f_105_ += f_147_;
			    f_107_ += f_169_;
			    f_108_ += f_148_;
			    f_110_ += f_170_;
			    f_111_ += f_149_;
			    f_113_ += f_171_;
			    f_114_ += f_150_;
			    f_116_ += f_172_;
			    f_117_ += f_151_;
			    f_119_ += f_173_;
			    f_123_ += f_152_;
			    f_125_ += f_174_;
			    f_135_ += f_153_;
			    f_137_ += f_175_;
			    f_138_ += f_154_;
			    f_140_ += f_176_;
			    f_141_ += f_155_;
			    f_143_ += f_177_;
			    f_144_ += f_156_;
			    f_146_ += f_178_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_104_ >= 0.0F) {
			    method3353(bool_101_, bool_102_,
				       ((Class155_Backup) this).anIntArray1751,
				       ((Class155_Backup) this).anIntArray1725,
				       (int) f, (int) f_106_, (int) f_107_,
				       f_109_, f_110_, f_112_, f_113_, f_115_,
				       f_116_, f_118_, f_119_, f_124_, f_125_,
				       f_136_, f_137_, f_139_, f_140_, f_142_,
				       f_143_, f_145_, f_146_);
			    f_106_ += f_158_;
			    f_107_ += f_169_;
			    f_109_ += f_159_;
			    f_110_ += f_170_;
			    f_112_ += f_160_;
			    f_113_ += f_171_;
			    f_115_ += f_161_;
			    f_116_ += f_172_;
			    f_118_ += f_162_;
			    f_119_ += f_173_;
			    f_124_ += f_163_;
			    f_125_ += f_174_;
			    f_136_ += f_164_;
			    f_137_ += f_175_;
			    f_139_ += f_165_;
			    f_140_ += f_176_;
			    f_142_ += f_166_;
			    f_143_ += f_177_;
			    f_145_ += f_167_;
			    f_146_ += f_178_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    }
		} else {
		    f_106_ = f_105_;
		    f_109_ = f_108_;
		    f_112_ = f_111_;
		    f_115_ = f_114_;
		    f_118_ = f_117_;
		    f_124_ = f_123_;
		    f_136_ = f_135_;
		    f_139_ = f_138_;
		    f_142_ = f_141_;
		    f_145_ = f_144_;
		    if (f < 0.0F) {
			f_105_ -= f_147_ * f;
			f_106_ -= f_169_ * f;
			f_108_ -= f_148_ * f;
			f_109_ -= f_170_ * f;
			f_111_ -= f_149_ * f;
			f_112_ -= f_171_ * f;
			f_114_ -= f_150_ * f;
			f_115_ -= f_172_ * f;
			f_117_ -= f_151_ * f;
			f_118_ -= f_173_ * f;
			f_123_ -= f_152_ * f;
			f_124_ -= f_174_ * f;
			f_135_ -= f_153_ * f;
			f_136_ -= f_175_ * f;
			f_138_ -= f_153_ * f;
			f_139_ -= f_175_ * f;
			f_141_ -= f_153_ * f;
			f_142_ -= f_175_ * f;
			f_144_ -= f_153_ * f;
			f_145_ -= f_175_ * f;
			f = 0.0F;
		    }
		    if (f_104_ < 0.0F) {
			f_107_ -= f_158_ * f_104_;
			f_110_ -= f_159_ * f_104_;
			f_113_ -= f_160_ * f_104_;
			f_116_ -= f_161_ * f_104_;
			f_119_ -= f_162_ * f_104_;
			f_125_ -= f_163_ * f_104_;
			f_137_ -= f_164_ * f_104_;
			f_140_ -= f_165_ * f_104_;
			f_143_ -= f_166_ * f_104_;
			f_146_ -= f_167_ * f_104_;
			f_104_ = 0.0F;
		    }
		    if (f != f_104_ && f_169_ < f_147_
			|| f == f_104_ && f_158_ > f_147_) {
			f += 0.5F;
			f_104_ += 0.5F;
			f_103_ = (float) (int) (f_103_ + 0.5F) - f_104_;
			f_104_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_104_ >= 0.0F) {
			    method3353(bool_101_, bool_102_,
				       ((Class155_Backup) this).anIntArray1751,
				       ((Class155_Backup) this).anIntArray1725,
				       (int) f, (int) f_106_, (int) f_105_,
				       f_109_, f_108_, f_112_, f_111_, f_115_,
				       f_114_, f_118_, f_117_, f_124_, f_123_,
				       f_136_, f_135_, f_139_, f_138_, f_142_,
				       f_141_, f_145_, f_144_);
			    f_105_ += f_147_;
			    f_106_ += f_169_;
			    f_108_ += f_148_;
			    f_109_ += f_170_;
			    f_111_ += f_149_;
			    f_112_ += f_171_;
			    f_114_ += f_150_;
			    f_115_ += f_172_;
			    f_117_ += f_151_;
			    f_118_ += f_173_;
			    f_123_ += f_152_;
			    f_124_ += f_174_;
			    f_135_ += f_153_;
			    f_136_ += f_175_;
			    f_138_ += f_154_;
			    f_139_ += f_176_;
			    f_141_ += f_155_;
			    f_142_ += f_177_;
			    f_144_ += f_156_;
			    f_145_ += f_178_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_103_ >= 0.0F) {
			    method3353(bool_101_, bool_102_,
				       ((Class155_Backup) this).anIntArray1751,
				       ((Class155_Backup) this).anIntArray1725,
				       (int) f, (int) f_107_, (int) f_105_,
				       f_110_, f_108_, f_113_, f_111_, f_116_,
				       f_114_, f_119_, f_117_, f_125_, f_123_,
				       f_137_, f_135_, f_140_, f_138_, f_143_,
				       f_141_, f_146_, f_144_);
			    f_107_ += f_158_;
			    f_105_ += f_147_;
			    f_110_ += f_159_;
			    f_108_ += f_148_;
			    f_113_ += f_160_;
			    f_111_ += f_149_;
			    f_116_ += f_161_;
			    f_114_ += f_150_;
			    f_119_ += f_162_;
			    f_117_ += f_151_;
			    f_125_ += f_163_;
			    f_123_ += f_152_;
			    f_137_ += f_164_;
			    f_135_ += f_153_;
			    f_140_ += f_165_;
			    f_138_ += f_154_;
			    f_143_ += f_166_;
			    f_141_ += f_155_;
			    f_146_ += f_167_;
			    f_144_ += f_156_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    } else {
			f += 0.5F;
			f_104_ += 0.5F;
			f_103_ = (float) (int) (f_103_ + 0.5F) - f_104_;
			f_104_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_104_ >= 0.0F) {
			    method3353(bool_101_, bool_102_,
				       ((Class155_Backup) this).anIntArray1751,
				       ((Class155_Backup) this).anIntArray1725,
				       (int) f, (int) f_105_, (int) f_106_,
				       f_108_, f_109_, f_111_, f_112_, f_114_,
				       f_115_, f_117_, f_118_, f_123_, f_124_,
				       f_135_, f_136_, f_138_, f_139_, f_141_,
				       f_142_, f_144_, f_145_);
			    f_106_ += f_169_;
			    f_105_ += f_147_;
			    f_109_ += f_170_;
			    f_108_ += f_148_;
			    f_112_ += f_171_;
			    f_111_ += f_149_;
			    f_115_ += f_172_;
			    f_114_ += f_150_;
			    f_118_ += f_173_;
			    f_117_ += f_151_;
			    f_124_ += f_174_;
			    f_123_ += f_152_;
			    f_136_ += f_175_;
			    f_135_ += f_153_;
			    f_139_ += f_176_;
			    f_138_ += f_154_;
			    f_142_ += f_177_;
			    f_141_ += f_155_;
			    f_145_ += f_178_;
			    f_144_ += f_156_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_103_ >= 0.0F) {
			    method3353(bool_101_, bool_102_,
				       ((Class155_Backup) this).anIntArray1751,
				       ((Class155_Backup) this).anIntArray1725,
				       (int) f, (int) f_105_, (int) f_107_,
				       f_108_, f_110_, f_111_, f_113_, f_114_,
				       f_116_, f_117_, f_119_, f_123_, f_125_,
				       f_135_, f_137_, f_138_, f_140_, f_141_,
				       f_143_, f_144_, f_146_);
			    f_105_ += f_147_;
			    f_107_ += f_158_;
			    f_108_ += f_148_;
			    f_110_ += f_159_;
			    f_111_ += f_149_;
			    f_113_ += f_160_;
			    f_114_ += f_150_;
			    f_116_ += f_161_;
			    f_117_ += f_151_;
			    f_119_ += f_162_;
			    f_123_ += f_152_;
			    f_125_ += f_163_;
			    f_135_ += f_153_;
			    f_137_ += f_164_;
			    f_138_ += f_154_;
			    f_140_ += f_165_;
			    f_141_ += f_155_;
			    f_143_ += f_166_;
			    f_144_ += f_156_;
			    f_146_ += f_167_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    }
		}
	    }
	}
    }
    
    final void method3349(boolean bool, boolean bool_180_, int[] is, int i,
			  int i_181_, int i_182_, int i_183_, int i_184_,
			  float f, float f_185_, float f_186_, float f_187_,
			  float f_188_, float f_189_, float f_190_,
			  float f_191_) {
	if (((Class155_Backup) this).aBool1748) {
	    if (i_184_ > ((Class155_Backup) this).anInt1733)
		i_184_ = ((Class155_Backup) this).anInt1733;
	    if (i_183_ < 0)
		i_183_ = 0;
	}
	if (i_183_ < i_184_) {
	    if (((Class155_Backup) this).aBool1756) {
		i += i_183_;
		f_186_ += f_187_ * (float) i_183_;
		f_188_ += f_189_ * (float) i_183_;
		f_190_ += f_191_ * (float) i_183_;
		if (((Class155_Backup) this).aBool1721) {
		    i_182_ = i_184_ - i_183_ >> 2;
		    f_187_ *= 4.0F;
		    f_189_ *= 4.0F;
		    f_191_ *= 4.0F;
		    if (((Class155_Backup) this).anInt1723 == 0) {
			if (i_182_ > 0) {
			    do {
				i_181_ = ~0xffffff | ((int) f_186_ & 0xff0000
						      | (int) f_188_ & 0xff00
						      | (int) f_190_ & 0xff);
				f_186_ += f_187_;
				f_188_ += f_189_;
				f_190_ += f_191_;
				is[i++] = i_181_;
				is[i++] = i_181_;
				is[i++] = i_181_;
				is[i++] = i_181_;
			    } while (--i_182_ > 0);
			}
			i_182_ = i_184_ - i_183_ & 0x3;
			if (i_182_ > 0) {
			    i_181_ = ~0xffffff | ((int) f_186_ & 0xff0000
						  | (int) f_188_ & 0xff00
						  | (int) f_190_ & 0xff);
			    do
				is[i++] = i_181_;
			    while (--i_182_ > 0);
			}
		    } else if (!((Class155_Backup) this).aBool1722) {
			int i_192_ = ((Class155_Backup) this).anInt1723;
			int i_193_ = 256 - ((Class155_Backup) this).anInt1723;
			if (i_182_ > 0) {
			    do {
				i_181_ = ~0xffffff | ((int) f_186_ & 0xff0000
						      | (int) f_188_ & 0xff00
						      | (int) f_190_ & 0xff);
				f_186_ += f_187_;
				f_188_ += f_189_;
				f_190_ += f_191_;
				i_181_ = (((i_181_ & 0xff00ff) * i_193_ >> 8
					   & 0xff00ff)
					  + ((i_181_ & 0xff00) * i_193_ >> 8
					     & 0xff00));
				int i_194_ = is[i];
				if (bool_180_) {
				    is[i++]
					= ((i_193_ | i_194_ >> 24) << 24
					   | (i_181_
					      + (((i_194_ & 0xff00ff) * i_192_
						  >> 8)
						 & 0xff00ff)
					      + (((i_194_ & 0xff00) * i_192_
						  >> 8)
						 & 0xff00)));
				    i_194_ = is[i];
				    is[i++]
					= ((i_193_ | i_194_ >> 24) << 24
					   | (i_181_
					      + (((i_194_ & 0xff00ff) * i_192_
						  >> 8)
						 & 0xff00ff)
					      + (((i_194_ & 0xff00) * i_192_
						  >> 8)
						 & 0xff00)));
				    i_194_ = is[i];
				    is[i++]
					= ((i_193_ | i_194_ >> 24) << 24
					   | (i_181_
					      + (((i_194_ & 0xff00ff) * i_192_
						  >> 8)
						 & 0xff00ff)
					      + (((i_194_ & 0xff00) * i_192_
						  >> 8)
						 & 0xff00)));
				    i_194_ = is[i];
				    is[i++]
					= ((i_193_ | i_194_ >> 24) << 24
					   | (i_181_
					      + (((i_194_ & 0xff00ff) * i_192_
						  >> 8)
						 & 0xff00ff)
					      + (((i_194_ & 0xff00) * i_192_
						  >> 8)
						 & 0xff00)));
				} else {
				    is[i++]
					= (i_181_
					   + ((i_194_ & 0xff00ff) * i_192_ >> 8
					      & 0xff00ff)
					   + ((i_194_ & 0xff00) * i_192_ >> 8
					      & 0xff00));
				    i_194_ = is[i];
				    is[i++]
					= (i_181_
					   + ((i_194_ & 0xff00ff) * i_192_ >> 8
					      & 0xff00ff)
					   + ((i_194_ & 0xff00) * i_192_ >> 8
					      & 0xff00));
				    i_194_ = is[i];
				    is[i++]
					= (i_181_
					   + ((i_194_ & 0xff00ff) * i_192_ >> 8
					      & 0xff00ff)
					   + ((i_194_ & 0xff00) * i_192_ >> 8
					      & 0xff00));
				    i_194_ = is[i];
				    is[i++]
					= (i_181_
					   + ((i_194_ & 0xff00ff) * i_192_ >> 8
					      & 0xff00ff)
					   + ((i_194_ & 0xff00) * i_192_ >> 8
					      & 0xff00));
				}
			    } while (--i_182_ > 0);
			}
			i_182_ = i_184_ - i_183_ & 0x3;
			if (i_182_ > 0) {
			    i_181_ = ~0xffffff | ((int) f_186_ & 0xff0000
						  | (int) f_188_ & 0xff00
						  | (int) f_190_ & 0xff);
			    i_181_ = (((i_181_ & 0xff00ff) * i_193_ >> 8
				       & 0xff00ff)
				      + ((i_181_ & 0xff00) * i_193_ >> 8
					 & 0xff00));
			    do {
				int i_195_ = is[i];
				if (bool_180_)
				    is[i++]
					= ((i_193_ | i_195_ >> 24) << 24
					   | (i_181_
					      + (((i_195_ & 0xff00ff) * i_192_
						  >> 8)
						 & 0xff00ff)
					      + (((i_195_ & 0xff00) * i_192_
						  >> 8)
						 & 0xff00)));
				else
				    is[i++]
					= (i_181_
					   + ((i_195_ & 0xff00ff) * i_192_ >> 8
					      & 0xff00ff)
					   + ((i_195_ & 0xff00) * i_192_ >> 8
					      & 0xff00));
			    } while (--i_182_ > 0);
			}
		    } else {
			if (i_182_ > 0) {
			    do {
				i_181_ = ((int) f_186_ & 0xff0000
					  | (int) f_188_ & 0xff00
					  | (int) f_190_ & 0xff);
				f_186_ += f_187_;
				f_188_ += f_189_;
				f_190_ += f_191_;
				int[] is_196_ = is;
				int i_197_ = i++;
				int i_198_ = i_181_;
				int i_199_ = is_196_[i_197_];
				int i_200_ = i_198_ + i_199_;
				int i_201_ = ((i_198_ & 0xff00ff)
					      + (i_199_ & 0xff00ff));
				i_199_
				    = (i_201_ & 0x1000100) + (i_200_ - i_201_
							      & 0x10000);
				is_196_[i_197_] = (~0xffffff | i_200_ - i_199_
						   | i_199_ - (i_199_ >>> 8));
				int[] is_202_ = is;
				i_200_ = i++;
				i_201_ = i_181_;
				int i_203_ = is_202_[i_200_];
				int i_204_ = i_201_ + i_203_;
				int i_205_ = ((i_201_ & 0xff00ff)
					      + (i_203_ & 0xff00ff));
				i_203_
				    = (i_205_ & 0x1000100) + (i_204_ - i_205_
							      & 0x10000);
				is_202_[i_200_] = (~0xffffff | i_204_ - i_203_
						   | i_203_ - (i_203_ >>> 8));
				int[] is_206_ = is;
				i_204_ = i++;
				i_205_ = i_181_;
				int i_207_ = is_206_[i_204_];
				int i_208_ = i_205_ + i_207_;
				int i_209_ = ((i_205_ & 0xff00ff)
					      + (i_207_ & 0xff00ff));
				i_207_
				    = (i_209_ & 0x1000100) + (i_208_ - i_209_
							      & 0x10000);
				is_206_[i_204_] = (~0xffffff | i_208_ - i_207_
						   | i_207_ - (i_207_ >>> 8));
				int[] is_210_ = is;
				i_208_ = i++;
				i_209_ = i_181_;
				int i_211_ = is_210_[i_208_];
				int i_212_ = i_209_ + i_211_;
				int i_213_ = ((i_209_ & 0xff00ff)
					      + (i_211_ & 0xff00ff));
				i_211_
				    = (i_213_ & 0x1000100) + (i_212_ - i_213_
							      & 0x10000);
				is_210_[i_208_] = (~0xffffff | i_212_ - i_211_
						   | i_211_ - (i_211_ >>> 8));
			    } while (--i_182_ > 0);
			}
			i_182_ = i_184_ - i_183_ & 0x3;
			if (i_182_ > 0) {
			    i_181_ = ((int) f_186_ & 0xff0000
				      | (int) f_188_ & 0xff00
				      | (int) f_190_ & 0xff);
			    do {
				int[] is_214_ = is;
				int i_215_ = i++;
				int i_216_ = i_181_;
				int i_217_ = is_214_[i_215_];
				int i_218_ = i_216_ + i_217_;
				int i_219_ = ((i_216_ & 0xff00ff)
					      + (i_217_ & 0xff00ff));
				i_217_
				    = (i_219_ & 0x1000100) + (i_218_ - i_219_
							      & 0x10000);
				is_214_[i_215_] = (~0xffffff | i_218_ - i_217_
						   | i_217_ - (i_217_ >>> 8));
			    } while (--i_182_ > 0);
			}
		    }
		} else {
		    i_182_ = i_184_ - i_183_;
		    if (((Class155_Backup) this).anInt1723 == 0) {
			do {
			    is[i++] = ~0xffffff | ((int) f_186_ & 0xff0000
						   | (int) f_188_ & 0xff00
						   | (int) f_190_ & 0xff);
			    f_186_ += f_187_;
			    f_188_ += f_189_;
			    f_190_ += f_191_;
			} while (--i_182_ > 0);
		    } else if (!((Class155_Backup) this).aBool1722) {
			int i_220_ = ((Class155_Backup) this).anInt1723;
			int i_221_ = 256 - ((Class155_Backup) this).anInt1723;
			do {
			    i_181_ = ~0xffffff | ((int) f_186_ & 0xff0000
						  | (int) f_188_ & 0xff00
						  | (int) f_190_ & 0xff);
			    f_186_ += f_187_;
			    f_188_ += f_189_;
			    f_190_ += f_191_;
			    i_181_ = (((i_181_ & 0xff00ff) * i_221_ >> 8
				       & 0xff00ff)
				      + ((i_181_ & 0xff00) * i_221_ >> 8
					 & 0xff00));
			    int i_222_ = is[i];
			    if (bool_180_)
				is[i++]
				    = ((i_221_ | i_222_ >> 24) << 24
				       | (i_181_
					  + ((i_222_ & 0xff00ff) * i_220_ >> 8
					     & 0xff00ff)
					  + ((i_222_ & 0xff00) * i_220_ >> 8
					     & 0xff00)));
			    else
				is[i++] = (i_181_
					   + ((i_222_ & 0xff00ff) * i_220_ >> 8
					      & 0xff00ff)
					   + ((i_222_ & 0xff00) * i_220_ >> 8
					      & 0xff00));
			} while (--i_182_ > 0);
		    } else {
			do {
			    int[] is_223_ = is;
			    int i_224_ = i++;
			    int i_225_ = ((int) f_186_ & 0xff0000
					  | (int) f_188_ & 0xff00
					  | (int) f_190_ & 0xff);
			    int i_226_ = is_223_[i_224_];
			    int i_227_ = i_225_ + i_226_;
			    int i_228_
				= (i_225_ & 0xff00ff) + (i_226_ & 0xff00ff);
			    i_226_ = (i_228_ & 0x1000100) + (i_227_ - i_228_
							     & 0x10000);
			    is_223_[i_224_] = (~0xffffff | i_227_ - i_226_
					       | i_226_ - (i_226_ >>> 8));
			    f_186_ += f_187_;
			    f_188_ += f_189_;
			    f_190_ += f_191_;
			} while (--i_182_ > 0);
		    }
		}
	    } else {
		i += i_183_ - 1;
		f += f_185_ * (float) i_183_;
		f_186_ += f_187_ * (float) i_183_;
		f_188_ += f_189_ * (float) i_183_;
		f_190_ += f_191_ * (float) i_183_;
		if (((Class189) ((Class155_Backup) this).aClass189_1736).aBool2220) {
		    if (((Class155_Backup) this).aBool1721) {
			i_182_ = i_184_ - i_183_ >> 2;
			f_187_ *= 4.0F;
			f_189_ *= 4.0F;
			f_191_ *= 4.0F;
			if (((Class155_Backup) this).anInt1723 == 0) {
			    if (i_182_ > 0) {
				do {
				    i_181_
					= ~0xffffff | ((int) f_186_ & 0xff0000
						       | (int) f_188_ & 0xff00
						       | (int) f_190_ & 0xff);
				    f_186_ += f_187_;
				    f_188_ += f_189_;
				    f_190_ += f_191_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					is[i] = i_181_;
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_185_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					is[i] = i_181_;
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_185_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					is[i] = i_181_;
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_185_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					is[i] = i_181_;
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_185_;
				} while (--i_182_ > 0);
			    }
			    i_182_ = i_184_ - i_183_ & 0x3;
			    if (i_182_ > 0) {
				i_181_ = ~0xffffff | ((int) f_186_ & 0xff0000
						      | (int) f_188_ & 0xff00
						      | (int) f_190_ & 0xff);
				do {
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					is[i] = i_181_;
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_185_;
				} while (--i_182_ > 0);
			    }
			} else if (!((Class155_Backup) this).aBool1722) {
			    int i_229_ = ((Class155_Backup) this).anInt1723;
			    int i_230_ = 256 - ((Class155_Backup) this).anInt1723;
			    if (i_182_ > 0) {
				do {
				    i_181_
					= ~0xffffff | ((int) f_186_ & 0xff0000
						       | (int) f_188_ & 0xff00
						       | (int) f_190_ & 0xff);
				    f_186_ += f_187_;
				    f_188_ += f_189_;
				    f_190_ += f_191_;
				    i_181_
					= (((i_181_ & 0xff00ff) * i_230_ >> 8
					    & 0xff00ff)
					   + ((i_181_ & 0xff00) * i_230_ >> 8
					      & 0xff00));
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int i_231_ = is[i];
					if (bool_180_)
					    is[i] = (((i_230_ | i_231_ >> 24)
						      << 24)
						     | (i_181_
							+ (((i_231_ & 0xff00ff)
							    * i_229_) >> 8
							   & 0xff00ff)
							+ (((i_231_ & 0xff00)
							    * i_229_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_181_
						     + (((i_231_ & 0xff00ff)
							 * i_229_) >> 8
							& 0xff00ff)
						     + (((i_231_ & 0xff00)
							 * i_229_) >> 8
							& 0xff00));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_185_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int i_232_ = is[i];
					if (bool_180_)
					    is[i] = (((i_230_ | i_232_ >> 24)
						      << 24)
						     | (i_181_
							+ (((i_232_ & 0xff00ff)
							    * i_229_) >> 8
							   & 0xff00ff)
							+ (((i_232_ & 0xff00)
							    * i_229_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_181_
						     + (((i_232_ & 0xff00ff)
							 * i_229_) >> 8
							& 0xff00ff)
						     + (((i_232_ & 0xff00)
							 * i_229_) >> 8
							& 0xff00));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_185_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int i_233_ = is[i];
					if (bool_180_)
					    is[i] = (((i_230_ | i_233_ >> 24)
						      << 24)
						     | (i_181_
							+ (((i_233_ & 0xff00ff)
							    * i_229_) >> 8
							   & 0xff00ff)
							+ (((i_233_ & 0xff00)
							    * i_229_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_181_
						     + (((i_233_ & 0xff00ff)
							 * i_229_) >> 8
							& 0xff00ff)
						     + (((i_233_ & 0xff00)
							 * i_229_) >> 8
							& 0xff00));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_185_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int i_234_ = is[i];
					if (bool_180_)
					    is[i] = (((i_230_ | i_234_ >> 24)
						      << 24)
						     | (i_181_
							+ (((i_234_ & 0xff00ff)
							    * i_229_) >> 8
							   & 0xff00ff)
							+ (((i_234_ & 0xff00)
							    * i_229_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_181_
						     + (((i_234_ & 0xff00ff)
							 * i_229_) >> 8
							& 0xff00ff)
						     + (((i_234_ & 0xff00)
							 * i_229_) >> 8
							& 0xff00));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_185_;
				} while (--i_182_ > 0);
			    }
			    i_182_ = i_184_ - i_183_ & 0x3;
			    if (i_182_ > 0) {
				i_181_ = ~0xffffff | ((int) f_186_ & 0xff0000
						      | (int) f_188_ & 0xff00
						      | (int) f_190_ & 0xff);
				i_181_ = (((i_181_ & 0xff00ff) * i_230_ >> 8
					   & 0xff00ff)
					  + ((i_181_ & 0xff00) * i_230_ >> 8
					     & 0xff00));
				do {
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int i_235_ = is[i];
					if (bool_180_)
					    is[i] = (((i_230_ | i_235_ >> 24)
						      << 24)
						     | (i_181_
							+ (((i_235_ & 0xff00ff)
							    * i_229_) >> 8
							   & 0xff00ff)
							+ (((i_235_ & 0xff00)
							    * i_229_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_181_
						     + (((i_235_ & 0xff00ff)
							 * i_229_) >> 8
							& 0xff00ff)
						     + (((i_235_ & 0xff00)
							 * i_229_) >> 8
							& 0xff00));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_185_;
				} while (--i_182_ > 0);
			    }
			} else {
			    if (i_182_ > 0) {
				do {
				    i_181_ = ((int) f_186_ & 0xff0000
					      | (int) f_188_ & 0xff00
					      | (int) f_190_ & 0xff);
				    f_186_ += f_187_;
				    f_188_ += f_189_;
				    f_190_ += f_191_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int[] is_236_ = is;
					int i_237_ = i;
					int i_238_ = i_181_;
					int i_239_ = is_236_[i_237_];
					int i_240_ = i_238_ + i_239_;
					int i_241_ = ((i_238_ & 0xff00ff)
						      + (i_239_ & 0xff00ff));
					i_239_
					    = ((i_241_ & 0x1000100)
					       + (i_240_ - i_241_ & 0x10000));
					is_236_[i_237_]
					    = (~0xffffff | i_240_ - i_239_
					       | i_239_ - (i_239_ >>> 8));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_185_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int[] is_242_ = is;
					int i_243_ = i;
					int i_244_ = i_181_;
					int i_245_ = is_242_[i_243_];
					int i_246_ = i_244_ + i_245_;
					int i_247_ = ((i_244_ & 0xff00ff)
						      + (i_245_ & 0xff00ff));
					i_245_
					    = ((i_247_ & 0x1000100)
					       + (i_246_ - i_247_ & 0x10000));
					is_242_[i_243_]
					    = (~0xffffff | i_246_ - i_245_
					       | i_245_ - (i_245_ >>> 8));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_185_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int[] is_248_ = is;
					int i_249_ = i;
					int i_250_ = i_181_;
					int i_251_ = is_248_[i_249_];
					int i_252_ = i_250_ + i_251_;
					int i_253_ = ((i_250_ & 0xff00ff)
						      + (i_251_ & 0xff00ff));
					i_251_
					    = ((i_253_ & 0x1000100)
					       + (i_252_ - i_253_ & 0x10000));
					is_248_[i_249_]
					    = (~0xffffff | i_252_ - i_251_
					       | i_251_ - (i_251_ >>> 8));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_185_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int[] is_254_ = is;
					int i_255_ = i;
					int i_256_ = i_181_;
					int i_257_ = is_254_[i_255_];
					int i_258_ = i_256_ + i_257_;
					int i_259_ = ((i_256_ & 0xff00ff)
						      + (i_257_ & 0xff00ff));
					i_257_
					    = ((i_259_ & 0x1000100)
					       + (i_258_ - i_259_ & 0x10000));
					is_254_[i_255_]
					    = (~0xffffff | i_258_ - i_257_
					       | i_257_ - (i_257_ >>> 8));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_185_;
				} while (--i_182_ > 0);
			    }
			    i_182_ = i_184_ - i_183_ & 0x3;
			    if (i_182_ > 0) {
				i_181_ = ((int) f_186_ & 0xff0000
					  | (int) f_188_ & 0xff00
					  | (int) f_190_ & 0xff);
				do {
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int[] is_260_ = is;
					int i_261_ = i;
					int i_262_ = i_181_;
					int i_263_ = is_260_[i_261_];
					int i_264_ = i_262_ + i_263_;
					int i_265_ = ((i_262_ & 0xff00ff)
						      + (i_263_ & 0xff00ff));
					i_263_
					    = ((i_265_ & 0x1000100)
					       + (i_264_ - i_265_ & 0x10000));
					is_260_[i_261_]
					    = (~0xffffff | i_264_ - i_263_
					       | i_263_ - (i_263_ >>> 8));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_185_;
				} while (--i_182_ > 0);
			    }
			}
		    } else {
			i_182_ = i_184_ - i_183_;
			if (((Class155_Backup) this).anInt1723 == 0) {
			    do {
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    is[i]
					= ~0xffffff | ((int) f_186_ & 0xff0000
						       | (int) f_188_ & 0xff00
						       | (int) f_190_ & 0xff);
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f;
				}
				f += f_185_;
				f_186_ += f_187_;
				f_188_ += f_189_;
				f_190_ += f_191_;
			    } while (--i_182_ > 0);
			} else if (!((Class155_Backup) this).aBool1722) {
			    int i_266_ = ((Class155_Backup) this).anInt1723;
			    int i_267_ = 256 - ((Class155_Backup) this).anInt1723;
			    do {
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    i_181_
					= ~0xffffff | ((int) f_186_ & 0xff0000
						       | (int) f_188_ & 0xff00
						       | (int) f_190_ & 0xff);
				    i_181_
					= (((i_181_ & 0xff00ff) * i_267_ >> 8
					    & 0xff00ff)
					   + ((i_181_ & 0xff00) * i_267_ >> 8
					      & 0xff00));
				    int i_268_ = is[i];
				    if (bool_180_)
					is[i] = ((i_267_ | i_268_ >> 24) << 24
						 | (i_181_
						    + (((i_268_ & 0xff00ff)
							* i_266_) >> 8
						       & 0xff00ff)
						    + (((i_268_ & 0xff00)
							* i_266_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_181_
					       + (((i_268_ & 0xff00ff) * i_266_
						   >> 8)
						  & 0xff00ff)
					       + (((i_268_ & 0xff00) * i_266_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f;
				}
				f += f_185_;
				f_186_ += f_187_;
				f_188_ += f_189_;
				f_190_ += f_191_;
			    } while (--i_182_ > 0);
			} else {
			    do {
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int[] is_269_ = is;
				    int i_270_ = i;
				    int i_271_ = ((int) f_186_ & 0xff0000
						  | (int) f_188_ & 0xff00
						  | (int) f_190_ & 0xff);
				    int i_272_ = is_269_[i_270_];
				    int i_273_ = i_271_ + i_272_;
				    int i_274_ = ((i_271_ & 0xff00ff)
						  + (i_272_ & 0xff00ff));
				    i_272_ = ((i_274_ & 0x1000100)
					      + (i_273_ - i_274_ & 0x10000));
				    is_269_[i_270_]
					= (~0xffffff | i_273_ - i_272_
					   | i_272_ - (i_272_ >>> 8));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f;
				}
				f += f_185_;
				f_186_ += f_187_;
				f_188_ += f_189_;
				f_190_ += f_191_;
			    } while (--i_182_ > 0);
			}
		    }
		} else if (((Class155_Backup) this).aBool1721) {
		    i_182_ = i_184_ - i_183_ >> 2;
		    f_187_ *= 4.0F;
		    f_189_ *= 4.0F;
		    f_191_ *= 4.0F;
		    if (((Class155_Backup) this).anInt1723 == 0) {
			if (i_182_ > 0) {
			    do {
				i_181_ = ~0xffffff | ((int) f_186_ & 0xff0000
						      | (int) f_188_ & 0xff00
						      | (int) f_190_ & 0xff);
				f_186_ += f_187_;
				f_188_ += f_189_;
				f_190_ += f_191_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i]))
				    is[i] = i_181_;
				f += f_185_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i]))
				    is[i] = i_181_;
				f += f_185_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i]))
				    is[i] = i_181_;
				f += f_185_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i]))
				    is[i] = i_181_;
				f += f_185_;
			    } while (--i_182_ > 0);
			}
			i_182_ = i_184_ - i_183_ & 0x3;
			if (i_182_ > 0) {
			    i_181_ = ~0xffffff | ((int) f_186_ & 0xff0000
						  | (int) f_188_ & 0xff00
						  | (int) f_190_ & 0xff);
			    do {
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i]))
				    is[i] = i_181_;
				f += f_185_;
			    } while (--i_182_ > 0);
			}
		    } else if (!((Class155_Backup) this).aBool1722) {
			int i_275_ = ((Class155_Backup) this).anInt1723;
			int i_276_ = 256 - ((Class155_Backup) this).anInt1723;
			if (i_182_ > 0) {
			    do {
				i_181_ = ~0xffffff | ((int) f_186_ & 0xff0000
						      | (int) f_188_ & 0xff00
						      | (int) f_190_ & 0xff);
				f_186_ += f_187_;
				f_188_ += f_189_;
				f_190_ += f_191_;
				i_181_ = (((i_181_ & 0xff00ff) * i_276_ >> 8
					   & 0xff00ff)
					  + ((i_181_ & 0xff00) * i_276_ >> 8
					     & 0xff00));
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int i_277_ = is[i];
				    if (bool_180_)
					is[i] = ((i_276_ | i_277_ >> 24) << 24
						 | (i_181_
						    + (((i_277_ & 0xff00ff)
							* i_275_) >> 8
						       & 0xff00ff)
						    + (((i_277_ & 0xff00)
							* i_275_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_181_
					       + (((i_277_ & 0xff00ff) * i_275_
						   >> 8)
						  & 0xff00ff)
					       + (((i_277_ & 0xff00) * i_275_
						   >> 8)
						  & 0xff00));
				}
				f += f_185_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int i_278_ = is[i];
				    if (bool_180_)
					is[i] = ((i_276_ | i_278_ >> 24) << 24
						 | (i_181_
						    + (((i_278_ & 0xff00ff)
							* i_275_) >> 8
						       & 0xff00ff)
						    + (((i_278_ & 0xff00)
							* i_275_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_181_
					       + (((i_278_ & 0xff00ff) * i_275_
						   >> 8)
						  & 0xff00ff)
					       + (((i_278_ & 0xff00) * i_275_
						   >> 8)
						  & 0xff00));
				}
				f += f_185_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int i_279_ = is[i];
				    if (bool_180_)
					is[i] = ((i_276_ | i_279_ >> 24) << 24
						 | (i_181_
						    + (((i_279_ & 0xff00ff)
							* i_275_) >> 8
						       & 0xff00ff)
						    + (((i_279_ & 0xff00)
							* i_275_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_181_
					       + (((i_279_ & 0xff00ff) * i_275_
						   >> 8)
						  & 0xff00ff)
					       + (((i_279_ & 0xff00) * i_275_
						   >> 8)
						  & 0xff00));
				}
				f += f_185_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int i_280_ = is[i];
				    if (bool_180_)
					is[i] = ((i_276_ | i_280_ >> 24) << 24
						 | (i_181_
						    + (((i_280_ & 0xff00ff)
							* i_275_) >> 8
						       & 0xff00ff)
						    + (((i_280_ & 0xff00)
							* i_275_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_181_
					       + (((i_280_ & 0xff00ff) * i_275_
						   >> 8)
						  & 0xff00ff)
					       + (((i_280_ & 0xff00) * i_275_
						   >> 8)
						  & 0xff00));
				}
				f += f_185_;
			    } while (--i_182_ > 0);
			}
			i_182_ = i_184_ - i_183_ & 0x3;
			if (i_182_ > 0) {
			    i_181_ = ~0xffffff | ((int) f_186_ & 0xff0000
						  | (int) f_188_ & 0xff00
						  | (int) f_190_ & 0xff);
			    i_181_ = (((i_181_ & 0xff00ff) * i_276_ >> 8
				       & 0xff00ff)
				      + ((i_181_ & 0xff00) * i_276_ >> 8
					 & 0xff00));
			    do {
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int i_281_ = is[i];
				    if (bool_180_)
					is[i] = ((i_276_ | i_281_ >> 24) << 24
						 | (i_181_
						    + (((i_281_ & 0xff00ff)
							* i_275_) >> 8
						       & 0xff00ff)
						    + (((i_281_ & 0xff00)
							* i_275_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_181_
					       + (((i_281_ & 0xff00ff) * i_275_
						   >> 8)
						  & 0xff00ff)
					       + (((i_281_ & 0xff00) * i_275_
						   >> 8)
						  & 0xff00));
				}
				f += f_185_;
			    } while (--i_182_ > 0);
			}
		    } else {
			if (i_182_ > 0) {
			    do {
				i_181_ = ((int) f_186_ & 0xff0000
					  | (int) f_188_ & 0xff00
					  | (int) f_190_ & 0xff);
				f_186_ += f_187_;
				f_188_ += f_189_;
				f_190_ += f_191_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int[] is_282_ = is;
				    int i_283_ = i;
				    int i_284_ = i_181_;
				    int i_285_ = is_282_[i_283_];
				    int i_286_ = i_284_ + i_285_;
				    int i_287_ = ((i_284_ & 0xff00ff)
						  + (i_285_ & 0xff00ff));
				    i_285_ = ((i_287_ & 0x1000100)
					      + (i_286_ - i_287_ & 0x10000));
				    is_282_[i_283_]
					= (~0xffffff | i_286_ - i_285_
					   | i_285_ - (i_285_ >>> 8));
				}
				f += f_185_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int[] is_288_ = is;
				    int i_289_ = i;
				    int i_290_ = i_181_;
				    int i_291_ = is_288_[i_289_];
				    int i_292_ = i_290_ + i_291_;
				    int i_293_ = ((i_290_ & 0xff00ff)
						  + (i_291_ & 0xff00ff));
				    i_291_ = ((i_293_ & 0x1000100)
					      + (i_292_ - i_293_ & 0x10000));
				    is_288_[i_289_]
					= (~0xffffff | i_292_ - i_291_
					   | i_291_ - (i_291_ >>> 8));
				}
				f += f_185_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int[] is_294_ = is;
				    int i_295_ = i;
				    int i_296_ = i_181_;
				    int i_297_ = is_294_[i_295_];
				    int i_298_ = i_296_ + i_297_;
				    int i_299_ = ((i_296_ & 0xff00ff)
						  + (i_297_ & 0xff00ff));
				    i_297_ = ((i_299_ & 0x1000100)
					      + (i_298_ - i_299_ & 0x10000));
				    is_294_[i_295_]
					= (~0xffffff | i_298_ - i_297_
					   | i_297_ - (i_297_ >>> 8));
				}
				f += f_185_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int[] is_300_ = is;
				    int i_301_ = i;
				    int i_302_ = i_181_;
				    int i_303_ = is_300_[i_301_];
				    int i_304_ = i_302_ + i_303_;
				    int i_305_ = ((i_302_ & 0xff00ff)
						  + (i_303_ & 0xff00ff));
				    i_303_ = ((i_305_ & 0x1000100)
					      + (i_304_ - i_305_ & 0x10000));
				    is_300_[i_301_]
					= (~0xffffff | i_304_ - i_303_
					   | i_303_ - (i_303_ >>> 8));
				}
				f += f_185_;
			    } while (--i_182_ > 0);
			}
			i_182_ = i_184_ - i_183_ & 0x3;
			if (i_182_ > 0) {
			    i_181_ = ((int) f_186_ & 0xff0000
				      | (int) f_188_ & 0xff00
				      | (int) f_190_ & 0xff);
			    do {
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int[] is_306_ = is;
				    int i_307_ = i;
				    int i_308_ = i_181_;
				    int i_309_ = is_306_[i_307_];
				    int i_310_ = i_308_ + i_309_;
				    int i_311_ = ((i_308_ & 0xff00ff)
						  + (i_309_ & 0xff00ff));
				    i_309_ = ((i_311_ & 0x1000100)
					      + (i_310_ - i_311_ & 0x10000));
				    is_306_[i_307_]
					= (~0xffffff | i_310_ - i_309_
					   | i_309_ - (i_309_ >>> 8));
				}
				f += f_185_;
			    } while (--i_182_ > 0);
			}
		    }
		} else {
		    i_182_ = i_184_ - i_183_;
		    if (((Class155_Backup) this).anInt1723 == 0) {
			do {
			    i++;
			    if (!bool
				|| f < ((Class155_Backup) this).aFloatArray1739[i])
				is[i] = ~0xffffff | ((int) f_186_ & 0xff0000
						     | (int) f_188_ & 0xff00
						     | (int) f_190_ & 0xff);
			    f += f_185_;
			    f_186_ += f_187_;
			    f_188_ += f_189_;
			    f_190_ += f_191_;
			} while (--i_182_ > 0);
		    } else if (!((Class155_Backup) this).aBool1722) {
			int i_312_ = ((Class155_Backup) this).anInt1723;
			int i_313_ = 256 - ((Class155_Backup) this).anInt1723;
			do {
			    i++;
			    if (!bool
				|| f < ((Class155_Backup) this).aFloatArray1739[i]) {
				i_181_ = ~0xffffff | ((int) f_186_ & 0xff0000
						      | (int) f_188_ & 0xff00
						      | (int) f_190_ & 0xff);
				i_181_ = (((i_181_ & 0xff00ff) * i_313_ >> 8
					   & 0xff00ff)
					  + ((i_181_ & 0xff00) * i_313_ >> 8
					     & 0xff00));
				int i_314_ = is[i];
				if (bool_180_)
				    is[i]
					= ((i_313_ | i_314_ >> 24) << 24
					   | (i_181_
					      + (((i_314_ & 0xff00ff) * i_312_
						  >> 8)
						 & 0xff00ff)
					      + (((i_314_ & 0xff00) * i_312_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_181_
					   + ((i_314_ & 0xff00ff) * i_312_ >> 8
					      & 0xff00ff)
					   + ((i_314_ & 0xff00) * i_312_ >> 8
					      & 0xff00));
			    }
			    f += f_185_;
			    f_186_ += f_187_;
			    f_188_ += f_189_;
			    f_190_ += f_191_;
			} while (--i_182_ > 0);
		    } else {
			do {
			    i++;
			    if (!bool
				|| f < ((Class155_Backup) this).aFloatArray1739[i]) {
				int[] is_315_ = is;
				int i_316_ = i;
				int i_317_ = ((int) f_186_ & 0xff0000
					      | (int) f_188_ & 0xff00
					      | (int) f_190_ & 0xff);
				int i_318_ = is_315_[i_316_];
				int i_319_ = i_317_ + i_318_;
				int i_320_ = ((i_317_ & 0xff00ff)
					      + (i_318_ & 0xff00ff));
				i_318_
				    = (i_320_ & 0x1000100) + (i_319_ - i_320_
							      & 0x10000);
				is_315_[i_316_] = (~0xffffff | i_319_ - i_318_
						   | i_318_ - (i_318_ >>> 8));
			    }
			    f += f_185_;
			    f_186_ += f_187_;
			    f_188_ += f_189_;
			    f_190_ += f_191_;
			} while (--i_182_ > 0);
		    }
		}
	    }
	}
    }
    
    final void method3350
	(boolean bool, boolean bool_321_, int[] is, int i, int i_322_,
	 int i_323_, float f, float f_324_, float f_325_, float f_326_,
	 float f_327_, float f_328_, float f_329_, float f_330_, float f_331_,
	 float f_332_, float f_333_, float f_334_, float f_335_, float f_336_,
	 float f_337_, float f_338_, float f_339_, float f_340_, float f_341_,
	 float f_342_, float f_343_, float f_344_) {
	int i_345_ = i_323_ - i_322_;
	float f_346_ = 1.0F / (float) i_345_;
	float f_347_ = (f_324_ - f) * f_346_;
	float f_348_ = (f_326_ - f_325_) * f_346_;
	float f_349_ = (f_328_ - f_327_) * f_346_;
	float f_350_ = (f_330_ - f_329_) * f_346_;
	float f_351_ = (f_332_ - f_331_) * f_346_;
	float f_352_ = (f_334_ - f_333_) * f_346_;
	float f_353_ = (f_336_ - f_335_) * f_346_;
	float f_354_ = (f_338_ - f_337_) * f_346_;
	float f_355_ = (f_340_ - f_339_) * f_346_;
	float f_356_ = (f_342_ - f_341_) * f_346_;
	float f_357_ = (f_344_ - f_343_) * f_346_;
	if (((Class155_Backup) this).aBool1748) {
	    if (i_323_ > ((Class155_Backup) this).anInt1733)
		i_323_ = ((Class155_Backup) this).anInt1733;
	    if (i_322_ < 0) {
		f -= f_347_ * (float) i_322_;
		f_325_ -= f_348_ * (float) i_322_;
		f_327_ -= f_349_ * (float) i_322_;
		f_329_ -= f_350_ * (float) i_322_;
		f_331_ -= f_351_ * (float) i_322_;
		f_333_ -= f_352_ * (float) i_322_;
		f_335_ -= f_353_ * (float) i_322_;
		f_337_ -= f_354_ * (float) i_322_;
		f_339_ -= f_355_ * (float) i_322_;
		f_341_ -= f_356_ * (float) i_322_;
		f_343_ -= f_357_ * (float) i_322_;
		i_322_ = 0;
	    }
	}
	if (i_322_ < i_323_) {
	    i_345_ = i_323_ - i_322_;
	    i += i_322_;
	    while (i_345_-- > 0) {
		float f_358_ = 1.0F / f;
		float f_359_ = 1.0F / f_325_;
		if (!bool || f_358_ < ((Class155_Backup) this).aFloatArray1739[i]) {
		    float f_360_ = f_327_ * f_359_;
		    float f_361_ = f_329_ * f_359_;
		    int i_362_
			= ((int) (f_360_ * (float) ((Class155_Backup) this).anInt1752
				  * ((Class155_Backup) this).aFloat1745)
			   & ((Class155_Backup) this).anInt1744);
		    int i_363_
			= ((int) (f_361_ * (float) ((Class155_Backup) this).anInt1752
				  * ((Class155_Backup) this).aFloat1745)
			   & ((Class155_Backup) this).anInt1744);
		    int i_364_
			= (((Class155_Backup) this).anIntArray1725
			   [i_363_ * ((Class155_Backup) this).anInt1752 + i_362_]);
		    i_362_
			= ((int) (f_360_ * (float) ((Class155_Backup) this).anInt1757
				  * ((Class155_Backup) this).aFloat1753)
			   & ((Class155_Backup) this).anInt1742);
		    i_363_
			= ((int) (f_361_ * (float) ((Class155_Backup) this).anInt1757
				  * ((Class155_Backup) this).aFloat1753)
			   & ((Class155_Backup) this).anInt1742);
		    int i_365_
			= (((Class155_Backup) this).anIntArray1750
			   [i_363_ * ((Class155_Backup) this).anInt1757 + i_362_]);
		    i_362_
			= ((int) (f_360_ * (float) ((Class155_Backup) this).anInt1738
				  * ((Class155_Backup) this).aFloat1758)
			   & ((Class155_Backup) this).anInt1735);
		    i_363_
			= ((int) (f_361_ * (float) ((Class155_Backup) this).anInt1738
				  * ((Class155_Backup) this).aFloat1758)
			   & ((Class155_Backup) this).anInt1735);
		    int i_366_
			= (((Class155_Backup) this).anIntArray1755
			   [i_363_ * ((Class155_Backup) this).anInt1738 + i_362_]);
		    float f_367_ = 1.0F - (f_341_ + f_343_);
		    i_364_
			= (~0xffffff
			   | ((int) (f_341_ * (float) (i_364_ >> 16 & 0xff))
			      << 16)
			   | (int) (f_341_ * (float) (i_364_ >> 8 & 0xff)) << 8
			   | (int) (f_341_ * (float) (i_364_ & 0xff)));
		    i_365_
			= (~0xffffff
			   | ((int) (f_343_ * (float) (i_365_ >> 16 & 0xff))
			      << 16)
			   | (int) (f_343_ * (float) (i_365_ >> 8 & 0xff)) << 8
			   | (int) (f_343_ * (float) (i_365_ & 0xff)));
		    i_366_
			= (~0xffffff
			   | ((int) (f_367_ * (float) (i_366_ >> 16 & 0xff))
			      << 16)
			   | (int) (f_367_ * (float) (i_366_ >> 8 & 0xff)) << 8
			   | (int) (f_367_ * (float) (i_366_ & 0xff)));
		    int i_368_ = i_364_ + i_365_ + i_366_;
		    int i_369_
			= (~0xffffff
			   | ((int) (f_335_ * (float) (i_368_ >> 16 & 0xff))
			      << 8) & 0xff0000
			   | ((int) (f_337_ * (float) (i_368_ >> 8 & 0xff))
			      & 0xff00)
			   | (int) (f_339_ * (float) (i_368_ & 0xff)) >> 8);
		    if (f_331_ != 0.0F) {
			int i_370_ = (int) (255.0F - f_331_);
			int i_371_ = (((((Class155_Backup) this).anInt1740
					& 0xff00ff) * (int) f_331_ & ~0xff00ff
				       | (((Class155_Backup) this).anInt1740
					  & 0xff00) * (int) f_331_ & 0xff0000)
				      >>> 8);
			i_369_ = (((i_369_ & 0xff00ff) * i_370_ & ~0xff00ff
				   | (i_369_ & 0xff00) * i_370_ & 0xff0000)
				  >>> 8) + i_371_;
		    }
		    if (bool_321_)
			is[i] = ((int) f_333_ | is[i] >> 24) << 24 | i_369_;
		    else
			is[i] = i_369_;
		    if (bool)
			((Class155_Backup) this).aFloatArray1739[i] = f_358_;
		}
		i++;
		f += f_347_;
		f_325_ += f_348_;
		f_327_ += f_349_;
		f_329_ += f_350_;
		f_331_ += f_351_;
		f_333_ += f_352_;
		f_335_ += f_353_;
		f_337_ += f_354_;
		f_339_ += f_355_;
		f_341_ += f_356_;
		f_343_ += f_357_;
	    }
	}
    }
    
    final void method3351
	(boolean bool, boolean bool_372_, int[] is, int i, int i_373_,
	 int i_374_, float f, float f_375_, float f_376_, float f_377_,
	 float f_378_, float f_379_, float f_380_, float f_381_, float f_382_,
	 float f_383_, float f_384_, float f_385_, float f_386_, float f_387_,
	 float f_388_, float f_389_, float f_390_, float f_391_, float f_392_,
	 float f_393_, float f_394_, float f_395_) {
	int i_396_ = i_374_ - i_373_;
	float f_397_ = 1.0F / (float) i_396_;
	float f_398_ = (f_375_ - f) * f_397_;
	float f_399_ = (f_377_ - f_376_) * f_397_;
	float f_400_ = (f_379_ - f_378_) * f_397_;
	float f_401_ = (f_381_ - f_380_) * f_397_;
	float f_402_ = (f_383_ - f_382_) * f_397_;
	float f_403_ = (f_385_ - f_384_) * f_397_;
	float f_404_ = (f_387_ - f_386_) * f_397_;
	float f_405_ = (f_389_ - f_388_) * f_397_;
	float f_406_ = (f_391_ - f_390_) * f_397_;
	float f_407_ = (f_393_ - f_392_) * f_397_;
	float f_408_ = (f_395_ - f_394_) * f_397_;
	if (((Class155_Backup) this).aBool1748) {
	    if (i_374_ > ((Class155_Backup) this).anInt1733)
		i_374_ = ((Class155_Backup) this).anInt1733;
	    if (i_373_ < 0) {
		f -= f_398_ * (float) i_373_;
		f_376_ -= f_399_ * (float) i_373_;
		f_378_ -= f_400_ * (float) i_373_;
		f_380_ -= f_401_ * (float) i_373_;
		f_382_ -= f_402_ * (float) i_373_;
		f_384_ -= f_403_ * (float) i_373_;
		f_386_ -= f_404_ * (float) i_373_;
		f_388_ -= f_405_ * (float) i_373_;
		f_390_ -= f_406_ * (float) i_373_;
		f_392_ -= f_407_ * (float) i_373_;
		f_394_ -= f_408_ * (float) i_373_;
		i_373_ = 0;
	    }
	}
	if (i_373_ < i_374_) {
	    i_396_ = i_374_ - i_373_;
	    i += i_373_;
	    while (i_396_-- > 0) {
		float f_409_ = 1.0F / f;
		float f_410_ = 1.0F / f_376_;
		if (!bool || f_409_ < ((Class155_Backup) this).aFloatArray1739[i]) {
		    float f_411_ = f_378_ * f_410_;
		    float f_412_ = f_380_ * f_410_;
		    int i_413_
			= ((int) (f_411_ * (float) ((Class155_Backup) this).anInt1752
				  * ((Class155_Backup) this).aFloat1745)
			   & ((Class155_Backup) this).anInt1744);
		    int i_414_
			= ((int) (f_412_ * (float) ((Class155_Backup) this).anInt1752
				  * ((Class155_Backup) this).aFloat1745)
			   & ((Class155_Backup) this).anInt1744);
		    int i_415_
			= (((Class155_Backup) this).anIntArray1725
			   [i_414_ * ((Class155_Backup) this).anInt1752 + i_413_]);
		    i_413_
			= ((int) (f_411_ * (float) ((Class155_Backup) this).anInt1757
				  * ((Class155_Backup) this).aFloat1753)
			   & ((Class155_Backup) this).anInt1742);
		    i_414_
			= ((int) (f_412_ * (float) ((Class155_Backup) this).anInt1757
				  * ((Class155_Backup) this).aFloat1753)
			   & ((Class155_Backup) this).anInt1742);
		    int i_416_
			= (((Class155_Backup) this).anIntArray1750
			   [i_414_ * ((Class155_Backup) this).anInt1757 + i_413_]);
		    i_413_
			= ((int) (f_411_ * (float) ((Class155_Backup) this).anInt1738
				  * ((Class155_Backup) this).aFloat1758)
			   & ((Class155_Backup) this).anInt1735);
		    i_414_
			= ((int) (f_412_ * (float) ((Class155_Backup) this).anInt1738
				  * ((Class155_Backup) this).aFloat1758)
			   & ((Class155_Backup) this).anInt1735);
		    int i_417_
			= (((Class155_Backup) this).anIntArray1755
			   [i_414_ * ((Class155_Backup) this).anInt1738 + i_413_]);
		    float f_418_ = 1.0F - (f_392_ + f_394_);
		    i_415_
			= (~0xffffff
			   | ((int) (f_392_ * (float) (i_415_ >> 16 & 0xff))
			      << 16)
			   | (int) (f_392_ * (float) (i_415_ >> 8 & 0xff)) << 8
			   | (int) (f_392_ * (float) (i_415_ & 0xff)));
		    i_416_
			= (~0xffffff
			   | ((int) (f_394_ * (float) (i_416_ >> 16 & 0xff))
			      << 16)
			   | (int) (f_394_ * (float) (i_416_ >> 8 & 0xff)) << 8
			   | (int) (f_394_ * (float) (i_416_ & 0xff)));
		    i_417_
			= (~0xffffff
			   | ((int) (f_418_ * (float) (i_417_ >> 16 & 0xff))
			      << 16)
			   | (int) (f_418_ * (float) (i_417_ >> 8 & 0xff)) << 8
			   | (int) (f_418_ * (float) (i_417_ & 0xff)));
		    int i_419_ = i_415_ + i_416_ + i_417_;
		    int i_420_
			= (~0xffffff
			   | ((int) (f_386_ * (float) (i_419_ >> 16 & 0xff))
			      << 8) & 0xff0000
			   | ((int) (f_388_ * (float) (i_419_ >> 8 & 0xff))
			      & 0xff00)
			   | (int) (f_390_ * (float) (i_419_ & 0xff)) >> 8);
		    if (f_382_ != 0.0F) {
			int i_421_ = (int) (255.0F - f_382_);
			int i_422_ = (((((Class155_Backup) this).anInt1740
					& 0xff00ff) * (int) f_382_ & ~0xff00ff
				       | (((Class155_Backup) this).anInt1740
					  & 0xff00) * (int) f_382_ & 0xff0000)
				      >>> 8);
			i_420_ = (((i_420_ & 0xff00ff) * i_421_ & ~0xff00ff
				   | (i_420_ & 0xff00) * i_421_ & 0xff0000)
				  >>> 8) + i_422_;
		    }
		    if (bool_372_)
			is[i] = ((int) f_384_ | is[i] >> 24) << 24 | i_420_;
		    else
			is[i] = i_420_;
		    if (bool)
			((Class155_Backup) this).aFloatArray1739[i] = f_409_;
		}
		i++;
		f += f_398_;
		f_376_ += f_399_;
		f_378_ += f_400_;
		f_380_ += f_401_;
		f_382_ += f_402_;
		f_384_ += f_403_;
		f_386_ += f_404_;
		f_388_ += f_405_;
		f_390_ += f_406_;
		f_392_ += f_407_;
		f_394_ += f_408_;
	    }
	}
    }
    
    final void method3352(boolean bool, boolean bool_423_, int[] is, int i,
			  int i_424_, int i_425_, int i_426_, int i_427_,
			  float f, float f_428_, float f_429_, float f_430_,
			  float f_431_, float f_432_, float f_433_,
			  float f_434_) {
	if (((Class155_Backup) this).aBool1748) {
	    if (i_427_ > ((Class155_Backup) this).anInt1733)
		i_427_ = ((Class155_Backup) this).anInt1733;
	    if (i_426_ < 0)
		i_426_ = 0;
	}
	if (i_426_ < i_427_) {
	    if (((Class155_Backup) this).aBool1756) {
		i += i_426_;
		f_429_ += f_430_ * (float) i_426_;
		f_431_ += f_432_ * (float) i_426_;
		f_433_ += f_434_ * (float) i_426_;
		if (((Class155_Backup) this).aBool1721) {
		    i_425_ = i_427_ - i_426_ >> 2;
		    f_430_ *= 4.0F;
		    f_432_ *= 4.0F;
		    f_434_ *= 4.0F;
		    if (((Class155_Backup) this).anInt1723 == 0) {
			if (i_425_ > 0) {
			    do {
				i_424_ = ~0xffffff | ((int) f_429_ & 0xff0000
						      | (int) f_431_ & 0xff00
						      | (int) f_433_ & 0xff);
				f_429_ += f_430_;
				f_431_ += f_432_;
				f_433_ += f_434_;
				is[i++] = i_424_;
				is[i++] = i_424_;
				is[i++] = i_424_;
				is[i++] = i_424_;
			    } while (--i_425_ > 0);
			}
			i_425_ = i_427_ - i_426_ & 0x3;
			if (i_425_ > 0) {
			    i_424_ = ~0xffffff | ((int) f_429_ & 0xff0000
						  | (int) f_431_ & 0xff00
						  | (int) f_433_ & 0xff);
			    do
				is[i++] = i_424_;
			    while (--i_425_ > 0);
			}
		    } else if (!((Class155_Backup) this).aBool1722) {
			int i_435_ = ((Class155_Backup) this).anInt1723;
			int i_436_ = 256 - ((Class155_Backup) this).anInt1723;
			if (i_425_ > 0) {
			    do {
				i_424_ = ~0xffffff | ((int) f_429_ & 0xff0000
						      | (int) f_431_ & 0xff00
						      | (int) f_433_ & 0xff);
				f_429_ += f_430_;
				f_431_ += f_432_;
				f_433_ += f_434_;
				i_424_ = (((i_424_ & 0xff00ff) * i_436_ >> 8
					   & 0xff00ff)
					  + ((i_424_ & 0xff00) * i_436_ >> 8
					     & 0xff00));
				int i_437_ = is[i];
				if (bool_423_) {
				    is[i++]
					= ((i_436_ | i_437_ >> 24) << 24
					   | (i_424_
					      + (((i_437_ & 0xff00ff) * i_435_
						  >> 8)
						 & 0xff00ff)
					      + (((i_437_ & 0xff00) * i_435_
						  >> 8)
						 & 0xff00)));
				    i_437_ = is[i];
				    is[i++]
					= ((i_436_ | i_437_ >> 24) << 24
					   | (i_424_
					      + (((i_437_ & 0xff00ff) * i_435_
						  >> 8)
						 & 0xff00ff)
					      + (((i_437_ & 0xff00) * i_435_
						  >> 8)
						 & 0xff00)));
				    i_437_ = is[i];
				    is[i++]
					= ((i_436_ | i_437_ >> 24) << 24
					   | (i_424_
					      + (((i_437_ & 0xff00ff) * i_435_
						  >> 8)
						 & 0xff00ff)
					      + (((i_437_ & 0xff00) * i_435_
						  >> 8)
						 & 0xff00)));
				    i_437_ = is[i];
				    is[i++]
					= ((i_436_ | i_437_ >> 24) << 24
					   | (i_424_
					      + (((i_437_ & 0xff00ff) * i_435_
						  >> 8)
						 & 0xff00ff)
					      + (((i_437_ & 0xff00) * i_435_
						  >> 8)
						 & 0xff00)));
				} else {
				    is[i++]
					= (i_424_
					   + ((i_437_ & 0xff00ff) * i_435_ >> 8
					      & 0xff00ff)
					   + ((i_437_ & 0xff00) * i_435_ >> 8
					      & 0xff00));
				    i_437_ = is[i];
				    is[i++]
					= (i_424_
					   + ((i_437_ & 0xff00ff) * i_435_ >> 8
					      & 0xff00ff)
					   + ((i_437_ & 0xff00) * i_435_ >> 8
					      & 0xff00));
				    i_437_ = is[i];
				    is[i++]
					= (i_424_
					   + ((i_437_ & 0xff00ff) * i_435_ >> 8
					      & 0xff00ff)
					   + ((i_437_ & 0xff00) * i_435_ >> 8
					      & 0xff00));
				    i_437_ = is[i];
				    is[i++]
					= (i_424_
					   + ((i_437_ & 0xff00ff) * i_435_ >> 8
					      & 0xff00ff)
					   + ((i_437_ & 0xff00) * i_435_ >> 8
					      & 0xff00));
				}
			    } while (--i_425_ > 0);
			}
			i_425_ = i_427_ - i_426_ & 0x3;
			if (i_425_ > 0) {
			    i_424_ = ~0xffffff | ((int) f_429_ & 0xff0000
						  | (int) f_431_ & 0xff00
						  | (int) f_433_ & 0xff);
			    i_424_ = (((i_424_ & 0xff00ff) * i_436_ >> 8
				       & 0xff00ff)
				      + ((i_424_ & 0xff00) * i_436_ >> 8
					 & 0xff00));
			    do {
				int i_438_ = is[i];
				if (bool_423_)
				    is[i++]
					= ((i_436_ | i_438_ >> 24) << 24
					   | (i_424_
					      + (((i_438_ & 0xff00ff) * i_435_
						  >> 8)
						 & 0xff00ff)
					      + (((i_438_ & 0xff00) * i_435_
						  >> 8)
						 & 0xff00)));
				else
				    is[i++]
					= (i_424_
					   + ((i_438_ & 0xff00ff) * i_435_ >> 8
					      & 0xff00ff)
					   + ((i_438_ & 0xff00) * i_435_ >> 8
					      & 0xff00));
			    } while (--i_425_ > 0);
			}
		    } else {
			if (i_425_ > 0) {
			    do {
				i_424_ = ((int) f_429_ & 0xff0000
					  | (int) f_431_ & 0xff00
					  | (int) f_433_ & 0xff);
				f_429_ += f_430_;
				f_431_ += f_432_;
				f_433_ += f_434_;
				int[] is_439_ = is;
				int i_440_ = i++;
				int i_441_ = i_424_;
				int i_442_ = is_439_[i_440_];
				int i_443_ = i_441_ + i_442_;
				int i_444_ = ((i_441_ & 0xff00ff)
					      + (i_442_ & 0xff00ff));
				i_442_
				    = (i_444_ & 0x1000100) + (i_443_ - i_444_
							      & 0x10000);
				is_439_[i_440_] = (~0xffffff | i_443_ - i_442_
						   | i_442_ - (i_442_ >>> 8));
				int[] is_445_ = is;
				i_443_ = i++;
				i_444_ = i_424_;
				int i_446_ = is_445_[i_443_];
				int i_447_ = i_444_ + i_446_;
				int i_448_ = ((i_444_ & 0xff00ff)
					      + (i_446_ & 0xff00ff));
				i_446_
				    = (i_448_ & 0x1000100) + (i_447_ - i_448_
							      & 0x10000);
				is_445_[i_443_] = (~0xffffff | i_447_ - i_446_
						   | i_446_ - (i_446_ >>> 8));
				int[] is_449_ = is;
				i_447_ = i++;
				i_448_ = i_424_;
				int i_450_ = is_449_[i_447_];
				int i_451_ = i_448_ + i_450_;
				int i_452_ = ((i_448_ & 0xff00ff)
					      + (i_450_ & 0xff00ff));
				i_450_
				    = (i_452_ & 0x1000100) + (i_451_ - i_452_
							      & 0x10000);
				is_449_[i_447_] = (~0xffffff | i_451_ - i_450_
						   | i_450_ - (i_450_ >>> 8));
				int[] is_453_ = is;
				i_451_ = i++;
				i_452_ = i_424_;
				int i_454_ = is_453_[i_451_];
				int i_455_ = i_452_ + i_454_;
				int i_456_ = ((i_452_ & 0xff00ff)
					      + (i_454_ & 0xff00ff));
				i_454_
				    = (i_456_ & 0x1000100) + (i_455_ - i_456_
							      & 0x10000);
				is_453_[i_451_] = (~0xffffff | i_455_ - i_454_
						   | i_454_ - (i_454_ >>> 8));
			    } while (--i_425_ > 0);
			}
			i_425_ = i_427_ - i_426_ & 0x3;
			if (i_425_ > 0) {
			    i_424_ = ((int) f_429_ & 0xff0000
				      | (int) f_431_ & 0xff00
				      | (int) f_433_ & 0xff);
			    do {
				int[] is_457_ = is;
				int i_458_ = i++;
				int i_459_ = i_424_;
				int i_460_ = is_457_[i_458_];
				int i_461_ = i_459_ + i_460_;
				int i_462_ = ((i_459_ & 0xff00ff)
					      + (i_460_ & 0xff00ff));
				i_460_
				    = (i_462_ & 0x1000100) + (i_461_ - i_462_
							      & 0x10000);
				is_457_[i_458_] = (~0xffffff | i_461_ - i_460_
						   | i_460_ - (i_460_ >>> 8));
			    } while (--i_425_ > 0);
			}
		    }
		} else {
		    i_425_ = i_427_ - i_426_;
		    if (((Class155_Backup) this).anInt1723 == 0) {
			do {
			    is[i++] = ~0xffffff | ((int) f_429_ & 0xff0000
						   | (int) f_431_ & 0xff00
						   | (int) f_433_ & 0xff);
			    f_429_ += f_430_;
			    f_431_ += f_432_;
			    f_433_ += f_434_;
			} while (--i_425_ > 0);
		    } else if (!((Class155_Backup) this).aBool1722) {
			int i_463_ = ((Class155_Backup) this).anInt1723;
			int i_464_ = 256 - ((Class155_Backup) this).anInt1723;
			do {
			    i_424_ = ~0xffffff | ((int) f_429_ & 0xff0000
						  | (int) f_431_ & 0xff00
						  | (int) f_433_ & 0xff);
			    f_429_ += f_430_;
			    f_431_ += f_432_;
			    f_433_ += f_434_;
			    i_424_ = (((i_424_ & 0xff00ff) * i_464_ >> 8
				       & 0xff00ff)
				      + ((i_424_ & 0xff00) * i_464_ >> 8
					 & 0xff00));
			    int i_465_ = is[i];
			    if (bool_423_)
				is[i++]
				    = ((i_464_ | i_465_ >> 24) << 24
				       | (i_424_
					  + ((i_465_ & 0xff00ff) * i_463_ >> 8
					     & 0xff00ff)
					  + ((i_465_ & 0xff00) * i_463_ >> 8
					     & 0xff00)));
			    else
				is[i++] = (i_424_
					   + ((i_465_ & 0xff00ff) * i_463_ >> 8
					      & 0xff00ff)
					   + ((i_465_ & 0xff00) * i_463_ >> 8
					      & 0xff00));
			} while (--i_425_ > 0);
		    } else {
			do {
			    int[] is_466_ = is;
			    int i_467_ = i++;
			    int i_468_ = ((int) f_429_ & 0xff0000
					  | (int) f_431_ & 0xff00
					  | (int) f_433_ & 0xff);
			    int i_469_ = is_466_[i_467_];
			    int i_470_ = i_468_ + i_469_;
			    int i_471_
				= (i_468_ & 0xff00ff) + (i_469_ & 0xff00ff);
			    i_469_ = (i_471_ & 0x1000100) + (i_470_ - i_471_
							     & 0x10000);
			    is_466_[i_467_] = (~0xffffff | i_470_ - i_469_
					       | i_469_ - (i_469_ >>> 8));
			    f_429_ += f_430_;
			    f_431_ += f_432_;
			    f_433_ += f_434_;
			} while (--i_425_ > 0);
		    }
		}
	    } else {
		i += i_426_ - 1;
		f += f_428_ * (float) i_426_;
		f_429_ += f_430_ * (float) i_426_;
		f_431_ += f_432_ * (float) i_426_;
		f_433_ += f_434_ * (float) i_426_;
		if (((Class189) ((Class155_Backup) this).aClass189_1736).aBool2220) {
		    if (((Class155_Backup) this).aBool1721) {
			i_425_ = i_427_ - i_426_ >> 2;
			f_430_ *= 4.0F;
			f_432_ *= 4.0F;
			f_434_ *= 4.0F;
			if (((Class155_Backup) this).anInt1723 == 0) {
			    if (i_425_ > 0) {
				do {
				    i_424_
					= ~0xffffff | ((int) f_429_ & 0xff0000
						       | (int) f_431_ & 0xff00
						       | (int) f_433_ & 0xff);
				    f_429_ += f_430_;
				    f_431_ += f_432_;
				    f_433_ += f_434_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					is[i] = i_424_;
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_428_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					is[i] = i_424_;
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_428_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					is[i] = i_424_;
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_428_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					is[i] = i_424_;
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_428_;
				} while (--i_425_ > 0);
			    }
			    i_425_ = i_427_ - i_426_ & 0x3;
			    if (i_425_ > 0) {
				i_424_ = ~0xffffff | ((int) f_429_ & 0xff0000
						      | (int) f_431_ & 0xff00
						      | (int) f_433_ & 0xff);
				do {
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					is[i] = i_424_;
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_428_;
				} while (--i_425_ > 0);
			    }
			} else if (!((Class155_Backup) this).aBool1722) {
			    int i_472_ = ((Class155_Backup) this).anInt1723;
			    int i_473_ = 256 - ((Class155_Backup) this).anInt1723;
			    if (i_425_ > 0) {
				do {
				    i_424_
					= ~0xffffff | ((int) f_429_ & 0xff0000
						       | (int) f_431_ & 0xff00
						       | (int) f_433_ & 0xff);
				    f_429_ += f_430_;
				    f_431_ += f_432_;
				    f_433_ += f_434_;
				    i_424_
					= (((i_424_ & 0xff00ff) * i_473_ >> 8
					    & 0xff00ff)
					   + ((i_424_ & 0xff00) * i_473_ >> 8
					      & 0xff00));
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int i_474_ = is[i];
					if (bool_423_)
					    is[i] = (((i_473_ | i_474_ >> 24)
						      << 24)
						     | (i_424_
							+ (((i_474_ & 0xff00ff)
							    * i_472_) >> 8
							   & 0xff00ff)
							+ (((i_474_ & 0xff00)
							    * i_472_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_424_
						     + (((i_474_ & 0xff00ff)
							 * i_472_) >> 8
							& 0xff00ff)
						     + (((i_474_ & 0xff00)
							 * i_472_) >> 8
							& 0xff00));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_428_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int i_475_ = is[i];
					if (bool_423_)
					    is[i] = (((i_473_ | i_475_ >> 24)
						      << 24)
						     | (i_424_
							+ (((i_475_ & 0xff00ff)
							    * i_472_) >> 8
							   & 0xff00ff)
							+ (((i_475_ & 0xff00)
							    * i_472_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_424_
						     + (((i_475_ & 0xff00ff)
							 * i_472_) >> 8
							& 0xff00ff)
						     + (((i_475_ & 0xff00)
							 * i_472_) >> 8
							& 0xff00));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_428_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int i_476_ = is[i];
					if (bool_423_)
					    is[i] = (((i_473_ | i_476_ >> 24)
						      << 24)
						     | (i_424_
							+ (((i_476_ & 0xff00ff)
							    * i_472_) >> 8
							   & 0xff00ff)
							+ (((i_476_ & 0xff00)
							    * i_472_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_424_
						     + (((i_476_ & 0xff00ff)
							 * i_472_) >> 8
							& 0xff00ff)
						     + (((i_476_ & 0xff00)
							 * i_472_) >> 8
							& 0xff00));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_428_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int i_477_ = is[i];
					if (bool_423_)
					    is[i] = (((i_473_ | i_477_ >> 24)
						      << 24)
						     | (i_424_
							+ (((i_477_ & 0xff00ff)
							    * i_472_) >> 8
							   & 0xff00ff)
							+ (((i_477_ & 0xff00)
							    * i_472_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_424_
						     + (((i_477_ & 0xff00ff)
							 * i_472_) >> 8
							& 0xff00ff)
						     + (((i_477_ & 0xff00)
							 * i_472_) >> 8
							& 0xff00));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_428_;
				} while (--i_425_ > 0);
			    }
			    i_425_ = i_427_ - i_426_ & 0x3;
			    if (i_425_ > 0) {
				i_424_ = ~0xffffff | ((int) f_429_ & 0xff0000
						      | (int) f_431_ & 0xff00
						      | (int) f_433_ & 0xff);
				i_424_ = (((i_424_ & 0xff00ff) * i_473_ >> 8
					   & 0xff00ff)
					  + ((i_424_ & 0xff00) * i_473_ >> 8
					     & 0xff00));
				do {
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int i_478_ = is[i];
					if (bool_423_)
					    is[i] = (((i_473_ | i_478_ >> 24)
						      << 24)
						     | (i_424_
							+ (((i_478_ & 0xff00ff)
							    * i_472_) >> 8
							   & 0xff00ff)
							+ (((i_478_ & 0xff00)
							    * i_472_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_424_
						     + (((i_478_ & 0xff00ff)
							 * i_472_) >> 8
							& 0xff00ff)
						     + (((i_478_ & 0xff00)
							 * i_472_) >> 8
							& 0xff00));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_428_;
				} while (--i_425_ > 0);
			    }
			} else {
			    if (i_425_ > 0) {
				do {
				    i_424_ = ((int) f_429_ & 0xff0000
					      | (int) f_431_ & 0xff00
					      | (int) f_433_ & 0xff);
				    f_429_ += f_430_;
				    f_431_ += f_432_;
				    f_433_ += f_434_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int[] is_479_ = is;
					int i_480_ = i;
					int i_481_ = i_424_;
					int i_482_ = is_479_[i_480_];
					int i_483_ = i_481_ + i_482_;
					int i_484_ = ((i_481_ & 0xff00ff)
						      + (i_482_ & 0xff00ff));
					i_482_
					    = ((i_484_ & 0x1000100)
					       + (i_483_ - i_484_ & 0x10000));
					is_479_[i_480_]
					    = (~0xffffff | i_483_ - i_482_
					       | i_482_ - (i_482_ >>> 8));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_428_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int[] is_485_ = is;
					int i_486_ = i;
					int i_487_ = i_424_;
					int i_488_ = is_485_[i_486_];
					int i_489_ = i_487_ + i_488_;
					int i_490_ = ((i_487_ & 0xff00ff)
						      + (i_488_ & 0xff00ff));
					i_488_
					    = ((i_490_ & 0x1000100)
					       + (i_489_ - i_490_ & 0x10000));
					is_485_[i_486_]
					    = (~0xffffff | i_489_ - i_488_
					       | i_488_ - (i_488_ >>> 8));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_428_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int[] is_491_ = is;
					int i_492_ = i;
					int i_493_ = i_424_;
					int i_494_ = is_491_[i_492_];
					int i_495_ = i_493_ + i_494_;
					int i_496_ = ((i_493_ & 0xff00ff)
						      + (i_494_ & 0xff00ff));
					i_494_
					    = ((i_496_ & 0x1000100)
					       + (i_495_ - i_496_ & 0x10000));
					is_491_[i_492_]
					    = (~0xffffff | i_495_ - i_494_
					       | i_494_ - (i_494_ >>> 8));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_428_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int[] is_497_ = is;
					int i_498_ = i;
					int i_499_ = i_424_;
					int i_500_ = is_497_[i_498_];
					int i_501_ = i_499_ + i_500_;
					int i_502_ = ((i_499_ & 0xff00ff)
						      + (i_500_ & 0xff00ff));
					i_500_
					    = ((i_502_ & 0x1000100)
					       + (i_501_ - i_502_ & 0x10000));
					is_497_[i_498_]
					    = (~0xffffff | i_501_ - i_500_
					       | i_500_ - (i_500_ >>> 8));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_428_;
				} while (--i_425_ > 0);
			    }
			    i_425_ = i_427_ - i_426_ & 0x3;
			    if (i_425_ > 0) {
				i_424_ = ((int) f_429_ & 0xff0000
					  | (int) f_431_ & 0xff00
					  | (int) f_433_ & 0xff);
				do {
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int[] is_503_ = is;
					int i_504_ = i;
					int i_505_ = i_424_;
					int i_506_ = is_503_[i_504_];
					int i_507_ = i_505_ + i_506_;
					int i_508_ = ((i_505_ & 0xff00ff)
						      + (i_506_ & 0xff00ff));
					i_506_
					    = ((i_508_ & 0x1000100)
					       + (i_507_ - i_508_ & 0x10000));
					is_503_[i_504_]
					    = (~0xffffff | i_507_ - i_506_
					       | i_506_ - (i_506_ >>> 8));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_428_;
				} while (--i_425_ > 0);
			    }
			}
		    } else {
			i_425_ = i_427_ - i_426_;
			if (((Class155_Backup) this).anInt1723 == 0) {
			    do {
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    is[i]
					= ~0xffffff | ((int) f_429_ & 0xff0000
						       | (int) f_431_ & 0xff00
						       | (int) f_433_ & 0xff);
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f;
				}
				f += f_428_;
				f_429_ += f_430_;
				f_431_ += f_432_;
				f_433_ += f_434_;
			    } while (--i_425_ > 0);
			} else if (!((Class155_Backup) this).aBool1722) {
			    int i_509_ = ((Class155_Backup) this).anInt1723;
			    int i_510_ = 256 - ((Class155_Backup) this).anInt1723;
			    do {
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    i_424_
					= ~0xffffff | ((int) f_429_ & 0xff0000
						       | (int) f_431_ & 0xff00
						       | (int) f_433_ & 0xff);
				    i_424_
					= (((i_424_ & 0xff00ff) * i_510_ >> 8
					    & 0xff00ff)
					   + ((i_424_ & 0xff00) * i_510_ >> 8
					      & 0xff00));
				    int i_511_ = is[i];
				    if (bool_423_)
					is[i] = ((i_510_ | i_511_ >> 24) << 24
						 | (i_424_
						    + (((i_511_ & 0xff00ff)
							* i_509_) >> 8
						       & 0xff00ff)
						    + (((i_511_ & 0xff00)
							* i_509_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_424_
					       + (((i_511_ & 0xff00ff) * i_509_
						   >> 8)
						  & 0xff00ff)
					       + (((i_511_ & 0xff00) * i_509_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f;
				}
				f += f_428_;
				f_429_ += f_430_;
				f_431_ += f_432_;
				f_433_ += f_434_;
			    } while (--i_425_ > 0);
			} else {
			    do {
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int[] is_512_ = is;
				    int i_513_ = i;
				    int i_514_ = ((int) f_429_ & 0xff0000
						  | (int) f_431_ & 0xff00
						  | (int) f_433_ & 0xff);
				    int i_515_ = is_512_[i_513_];
				    int i_516_ = i_514_ + i_515_;
				    int i_517_ = ((i_514_ & 0xff00ff)
						  + (i_515_ & 0xff00ff));
				    i_515_ = ((i_517_ & 0x1000100)
					      + (i_516_ - i_517_ & 0x10000));
				    is_512_[i_513_]
					= (~0xffffff | i_516_ - i_515_
					   | i_515_ - (i_515_ >>> 8));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f;
				}
				f += f_428_;
				f_429_ += f_430_;
				f_431_ += f_432_;
				f_433_ += f_434_;
			    } while (--i_425_ > 0);
			}
		    }
		} else if (((Class155_Backup) this).aBool1721) {
		    i_425_ = i_427_ - i_426_ >> 2;
		    f_430_ *= 4.0F;
		    f_432_ *= 4.0F;
		    f_434_ *= 4.0F;
		    if (((Class155_Backup) this).anInt1723 == 0) {
			if (i_425_ > 0) {
			    do {
				i_424_ = ~0xffffff | ((int) f_429_ & 0xff0000
						      | (int) f_431_ & 0xff00
						      | (int) f_433_ & 0xff);
				f_429_ += f_430_;
				f_431_ += f_432_;
				f_433_ += f_434_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i]))
				    is[i] = i_424_;
				f += f_428_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i]))
				    is[i] = i_424_;
				f += f_428_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i]))
				    is[i] = i_424_;
				f += f_428_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i]))
				    is[i] = i_424_;
				f += f_428_;
			    } while (--i_425_ > 0);
			}
			i_425_ = i_427_ - i_426_ & 0x3;
			if (i_425_ > 0) {
			    i_424_ = ~0xffffff | ((int) f_429_ & 0xff0000
						  | (int) f_431_ & 0xff00
						  | (int) f_433_ & 0xff);
			    do {
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i]))
				    is[i] = i_424_;
				f += f_428_;
			    } while (--i_425_ > 0);
			}
		    } else if (!((Class155_Backup) this).aBool1722) {
			int i_518_ = ((Class155_Backup) this).anInt1723;
			int i_519_ = 256 - ((Class155_Backup) this).anInt1723;
			if (i_425_ > 0) {
			    do {
				i_424_ = ~0xffffff | ((int) f_429_ & 0xff0000
						      | (int) f_431_ & 0xff00
						      | (int) f_433_ & 0xff);
				f_429_ += f_430_;
				f_431_ += f_432_;
				f_433_ += f_434_;
				i_424_ = (((i_424_ & 0xff00ff) * i_519_ >> 8
					   & 0xff00ff)
					  + ((i_424_ & 0xff00) * i_519_ >> 8
					     & 0xff00));
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int i_520_ = is[i];
				    if (bool_423_)
					is[i] = ((i_519_ | i_520_ >> 24) << 24
						 | (i_424_
						    + (((i_520_ & 0xff00ff)
							* i_518_) >> 8
						       & 0xff00ff)
						    + (((i_520_ & 0xff00)
							* i_518_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_424_
					       + (((i_520_ & 0xff00ff) * i_518_
						   >> 8)
						  & 0xff00ff)
					       + (((i_520_ & 0xff00) * i_518_
						   >> 8)
						  & 0xff00));
				}
				f += f_428_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int i_521_ = is[i];
				    if (bool_423_)
					is[i] = ((i_519_ | i_521_ >> 24) << 24
						 | (i_424_
						    + (((i_521_ & 0xff00ff)
							* i_518_) >> 8
						       & 0xff00ff)
						    + (((i_521_ & 0xff00)
							* i_518_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_424_
					       + (((i_521_ & 0xff00ff) * i_518_
						   >> 8)
						  & 0xff00ff)
					       + (((i_521_ & 0xff00) * i_518_
						   >> 8)
						  & 0xff00));
				}
				f += f_428_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int i_522_ = is[i];
				    if (bool_423_)
					is[i] = ((i_519_ | i_522_ >> 24) << 24
						 | (i_424_
						    + (((i_522_ & 0xff00ff)
							* i_518_) >> 8
						       & 0xff00ff)
						    + (((i_522_ & 0xff00)
							* i_518_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_424_
					       + (((i_522_ & 0xff00ff) * i_518_
						   >> 8)
						  & 0xff00ff)
					       + (((i_522_ & 0xff00) * i_518_
						   >> 8)
						  & 0xff00));
				}
				f += f_428_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int i_523_ = is[i];
				    if (bool_423_)
					is[i] = ((i_519_ | i_523_ >> 24) << 24
						 | (i_424_
						    + (((i_523_ & 0xff00ff)
							* i_518_) >> 8
						       & 0xff00ff)
						    + (((i_523_ & 0xff00)
							* i_518_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_424_
					       + (((i_523_ & 0xff00ff) * i_518_
						   >> 8)
						  & 0xff00ff)
					       + (((i_523_ & 0xff00) * i_518_
						   >> 8)
						  & 0xff00));
				}
				f += f_428_;
			    } while (--i_425_ > 0);
			}
			i_425_ = i_427_ - i_426_ & 0x3;
			if (i_425_ > 0) {
			    i_424_ = ~0xffffff | ((int) f_429_ & 0xff0000
						  | (int) f_431_ & 0xff00
						  | (int) f_433_ & 0xff);
			    i_424_ = (((i_424_ & 0xff00ff) * i_519_ >> 8
				       & 0xff00ff)
				      + ((i_424_ & 0xff00) * i_519_ >> 8
					 & 0xff00));
			    do {
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int i_524_ = is[i];
				    if (bool_423_)
					is[i] = ((i_519_ | i_524_ >> 24) << 24
						 | (i_424_
						    + (((i_524_ & 0xff00ff)
							* i_518_) >> 8
						       & 0xff00ff)
						    + (((i_524_ & 0xff00)
							* i_518_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_424_
					       + (((i_524_ & 0xff00ff) * i_518_
						   >> 8)
						  & 0xff00ff)
					       + (((i_524_ & 0xff00) * i_518_
						   >> 8)
						  & 0xff00));
				}
				f += f_428_;
			    } while (--i_425_ > 0);
			}
		    } else {
			if (i_425_ > 0) {
			    do {
				i_424_ = ((int) f_429_ & 0xff0000
					  | (int) f_431_ & 0xff00
					  | (int) f_433_ & 0xff);
				f_429_ += f_430_;
				f_431_ += f_432_;
				f_433_ += f_434_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int[] is_525_ = is;
				    int i_526_ = i;
				    int i_527_ = i_424_;
				    int i_528_ = is_525_[i_526_];
				    int i_529_ = i_527_ + i_528_;
				    int i_530_ = ((i_527_ & 0xff00ff)
						  + (i_528_ & 0xff00ff));
				    i_528_ = ((i_530_ & 0x1000100)
					      + (i_529_ - i_530_ & 0x10000));
				    is_525_[i_526_]
					= (~0xffffff | i_529_ - i_528_
					   | i_528_ - (i_528_ >>> 8));
				}
				f += f_428_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int[] is_531_ = is;
				    int i_532_ = i;
				    int i_533_ = i_424_;
				    int i_534_ = is_531_[i_532_];
				    int i_535_ = i_533_ + i_534_;
				    int i_536_ = ((i_533_ & 0xff00ff)
						  + (i_534_ & 0xff00ff));
				    i_534_ = ((i_536_ & 0x1000100)
					      + (i_535_ - i_536_ & 0x10000));
				    is_531_[i_532_]
					= (~0xffffff | i_535_ - i_534_
					   | i_534_ - (i_534_ >>> 8));
				}
				f += f_428_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int[] is_537_ = is;
				    int i_538_ = i;
				    int i_539_ = i_424_;
				    int i_540_ = is_537_[i_538_];
				    int i_541_ = i_539_ + i_540_;
				    int i_542_ = ((i_539_ & 0xff00ff)
						  + (i_540_ & 0xff00ff));
				    i_540_ = ((i_542_ & 0x1000100)
					      + (i_541_ - i_542_ & 0x10000));
				    is_537_[i_538_]
					= (~0xffffff | i_541_ - i_540_
					   | i_540_ - (i_540_ >>> 8));
				}
				f += f_428_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int[] is_543_ = is;
				    int i_544_ = i;
				    int i_545_ = i_424_;
				    int i_546_ = is_543_[i_544_];
				    int i_547_ = i_545_ + i_546_;
				    int i_548_ = ((i_545_ & 0xff00ff)
						  + (i_546_ & 0xff00ff));
				    i_546_ = ((i_548_ & 0x1000100)
					      + (i_547_ - i_548_ & 0x10000));
				    is_543_[i_544_]
					= (~0xffffff | i_547_ - i_546_
					   | i_546_ - (i_546_ >>> 8));
				}
				f += f_428_;
			    } while (--i_425_ > 0);
			}
			i_425_ = i_427_ - i_426_ & 0x3;
			if (i_425_ > 0) {
			    i_424_ = ((int) f_429_ & 0xff0000
				      | (int) f_431_ & 0xff00
				      | (int) f_433_ & 0xff);
			    do {
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int[] is_549_ = is;
				    int i_550_ = i;
				    int i_551_ = i_424_;
				    int i_552_ = is_549_[i_550_];
				    int i_553_ = i_551_ + i_552_;
				    int i_554_ = ((i_551_ & 0xff00ff)
						  + (i_552_ & 0xff00ff));
				    i_552_ = ((i_554_ & 0x1000100)
					      + (i_553_ - i_554_ & 0x10000));
				    is_549_[i_550_]
					= (~0xffffff | i_553_ - i_552_
					   | i_552_ - (i_552_ >>> 8));
				}
				f += f_428_;
			    } while (--i_425_ > 0);
			}
		    }
		} else {
		    i_425_ = i_427_ - i_426_;
		    if (((Class155_Backup) this).anInt1723 == 0) {
			do {
			    i++;
			    if (!bool
				|| f < ((Class155_Backup) this).aFloatArray1739[i])
				is[i] = ~0xffffff | ((int) f_429_ & 0xff0000
						     | (int) f_431_ & 0xff00
						     | (int) f_433_ & 0xff);
			    f += f_428_;
			    f_429_ += f_430_;
			    f_431_ += f_432_;
			    f_433_ += f_434_;
			} while (--i_425_ > 0);
		    } else if (!((Class155_Backup) this).aBool1722) {
			int i_555_ = ((Class155_Backup) this).anInt1723;
			int i_556_ = 256 - ((Class155_Backup) this).anInt1723;
			do {
			    i++;
			    if (!bool
				|| f < ((Class155_Backup) this).aFloatArray1739[i]) {
				i_424_ = ~0xffffff | ((int) f_429_ & 0xff0000
						      | (int) f_431_ & 0xff00
						      | (int) f_433_ & 0xff);
				i_424_ = (((i_424_ & 0xff00ff) * i_556_ >> 8
					   & 0xff00ff)
					  + ((i_424_ & 0xff00) * i_556_ >> 8
					     & 0xff00));
				int i_557_ = is[i];
				if (bool_423_)
				    is[i]
					= ((i_556_ | i_557_ >> 24) << 24
					   | (i_424_
					      + (((i_557_ & 0xff00ff) * i_555_
						  >> 8)
						 & 0xff00ff)
					      + (((i_557_ & 0xff00) * i_555_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_424_
					   + ((i_557_ & 0xff00ff) * i_555_ >> 8
					      & 0xff00ff)
					   + ((i_557_ & 0xff00) * i_555_ >> 8
					      & 0xff00));
			    }
			    f += f_428_;
			    f_429_ += f_430_;
			    f_431_ += f_432_;
			    f_433_ += f_434_;
			} while (--i_425_ > 0);
		    } else {
			do {
			    i++;
			    if (!bool
				|| f < ((Class155_Backup) this).aFloatArray1739[i]) {
				int[] is_558_ = is;
				int i_559_ = i;
				int i_560_ = ((int) f_429_ & 0xff0000
					      | (int) f_431_ & 0xff00
					      | (int) f_433_ & 0xff);
				int i_561_ = is_558_[i_559_];
				int i_562_ = i_560_ + i_561_;
				int i_563_ = ((i_560_ & 0xff00ff)
					      + (i_561_ & 0xff00ff));
				i_561_
				    = (i_563_ & 0x1000100) + (i_562_ - i_563_
							      & 0x10000);
				is_558_[i_559_] = (~0xffffff | i_562_ - i_561_
						   | i_561_ - (i_561_ >>> 8));
			    }
			    f += f_428_;
			    f_429_ += f_430_;
			    f_431_ += f_432_;
			    f_433_ += f_434_;
			} while (--i_425_ > 0);
		    }
		}
	    }
	}
    }
    
    final void method3353
	(boolean bool, boolean bool_564_, int[] is, int[] is_565_, int i,
	 int i_566_, int i_567_, float f, float f_568_, float f_569_,
	 float f_570_, float f_571_, float f_572_, float f_573_, float f_574_,
	 float f_575_, float f_576_, float f_577_, float f_578_, float f_579_,
	 float f_580_, float f_581_, float f_582_, float f_583_,
	 float f_584_) {
	int i_585_ = i_567_ - i_566_;
	float f_586_ = 1.0F / (float) i_585_;
	float f_587_ = (f_568_ - f) * f_586_;
	float f_588_ = (f_570_ - f_569_) * f_586_;
	float f_589_ = (f_572_ - f_571_) * f_586_;
	float f_590_ = (f_574_ - f_573_) * f_586_;
	float f_591_ = (f_576_ - f_575_) * f_586_;
	float f_592_ = (f_578_ - f_577_) * f_586_;
	float f_593_ = (f_580_ - f_579_) * f_586_;
	float f_594_ = (f_582_ - f_581_) * f_586_;
	float f_595_ = (f_584_ - f_583_) * f_586_;
	if (((Class155_Backup) this).aBool1748) {
	    if (i_567_ > ((Class155_Backup) this).anInt1733)
		i_567_ = ((Class155_Backup) this).anInt1733;
	    if (i_566_ < 0) {
		f -= f_587_ * (float) i_566_;
		f_569_ -= f_588_ * (float) i_566_;
		f_571_ -= f_589_ * (float) i_566_;
		f_573_ -= f_590_ * (float) i_566_;
		f_575_ -= f_591_ * (float) i_566_;
		f_577_ -= f_592_ * (float) i_566_;
		f_579_ -= f_593_ * (float) i_566_;
		f_581_ -= f_594_ * (float) i_566_;
		f_583_ -= f_595_ * (float) i_566_;
		i_566_ = 0;
	    }
	}
	if (i_566_ < i_567_) {
	    i_585_ = i_567_ - i_566_;
	    i += i_566_;
	    while (i_585_-- > 0) {
		float f_596_ = 1.0F / f;
		float f_597_ = 1.0F / f_569_;
		if (!bool || f_596_ < ((Class155_Backup) this).aFloatArray1739[i]) {
		    int i_598_ = (int) (f_571_ * f_597_
					* (float) ((Class155_Backup) this).anInt1752);
		    if (((Class155_Backup) this).aBool1741)
			i_598_ &= ((Class155_Backup) this).anInt1744;
		    else if (i_598_ < 0)
			i_598_ = 0;
		    else if (i_598_ > ((Class155_Backup) this).anInt1744)
			i_598_ = ((Class155_Backup) this).anInt1744;
		    int i_599_ = (int) (f_573_ * f_597_
					* (float) ((Class155_Backup) this).anInt1752);
		    if (((Class155_Backup) this).aBool1741)
			i_599_ &= ((Class155_Backup) this).anInt1744;
		    else if (i_599_ < 0)
			i_599_ = 0;
		    else if (i_599_ > ((Class155_Backup) this).anInt1744)
			i_599_ = ((Class155_Backup) this).anInt1744;
		    int i_600_
			= (((Class155_Backup) this).anIntArray1725
			   [i_599_ * ((Class155_Backup) this).anInt1752 + i_598_]);
		    int i_601_ = 255;
		    if (((Class155_Backup) this).aClass529_1746
			== Class529.aClass529_6944)
			i_601_ = (int) ((float) (i_600_ >> 24 & 0xff) * f_577_
					/ 255.0F);
		    else if (((Class155_Backup) this).aClass529_1746
			     == Class529.aClass529_6943) {
			if ((i_600_ >> 24 & 0xff)
			    > ((Class155_Backup) this).anInt1747)
			    i_601_ = 255;
			else
			    i_601_ = 0;
		    } else
			i_601_ = (int) f_577_;
		    if (i_601_ != 0) {
			if (i_601_ != 255) {
			    int i_602_
				= (~0xffffff
				   | ((int) (f_579_ * (float) (i_600_ >> 16
							       & 0xff)) << 8
				      & 0xff0000)
				   | (int) (f_581_ * (float) (i_600_ >> 8
							      & 0xff)) & 0xff00
				   | ((int) (f_583_ * (float) (i_600_ & 0xff))
				      >> 8));
			    if (f_575_ != 0.0F) {
				int i_603_ = (int) (255.0F - f_575_);
				int i_604_
				    = (((((Class155_Backup) this).anInt1740
					 & 0xff00ff) * (int) f_575_ & ~0xff00ff
					| (((Class155_Backup) this).anInt1740
					   & 0xff00) * (int) f_575_ & 0xff0000)
				       >>> 8);
				i_602_ = ((((i_602_ & 0xff00ff) * i_603_
					    & ~0xff00ff)
					   | ((i_602_ & 0xff00) * i_603_
					      & 0xff0000))
					  >>> 8) + i_604_;
			    }
			    int i_605_ = is[i];
			    int i_606_ = 255 - i_601_;
			    i_602_ = ((((i_605_ & 0xff00ff) * i_606_
					+ (i_602_ & 0xff00ff) * i_601_)
				       & ~0xff00ff)
				      + (((i_605_ & 0xff00) * i_606_
					  + (i_602_ & 0xff00) * i_601_)
					 & 0xff0000)) >> 8;
			    if (bool_564_)
				is[i] = (i_601_ | is[i] >> 24) << 24 | i_602_;
			    else
				is[i] = i_602_;
			    if (bool)
				((Class155_Backup) this).aFloatArray1739[i] = f_596_;
			} else {
			    int i_607_
				= (~0xffffff
				   | ((int) (f_579_ * (float) (i_600_ >> 16
							       & 0xff)) << 8
				      & 0xff0000)
				   | (int) (f_581_ * (float) (i_600_ >> 8
							      & 0xff)) & 0xff00
				   | ((int) (f_583_ * (float) (i_600_ & 0xff))
				      >> 8));
			    if (f_575_ != 0.0F) {
				int i_608_ = (int) (255.0F - f_575_);
				int i_609_
				    = (((((Class155_Backup) this).anInt1740
					 & 0xff00ff) * (int) f_575_ & ~0xff00ff
					| (((Class155_Backup) this).anInt1740
					   & 0xff00) * (int) f_575_ & 0xff0000)
				       >>> 8);
				i_607_ = ((((i_607_ & 0xff00ff) * i_608_
					    & ~0xff00ff)
					   | ((i_607_ & 0xff00) * i_608_
					      & 0xff0000))
					  >>> 8) + i_609_;
			    }
			    if (bool_564_)
				is[i] = i_601_ << 24 | i_607_;
			    else
				is[i] = i_607_;
			    if (bool)
				((Class155_Backup) this).aFloatArray1739[i] = f_596_;
			}
		    }
		}
		i++;
		f += f_587_;
		f_569_ += f_588_;
		f_571_ += f_589_;
		f_573_ += f_590_;
		f_575_ += f_591_;
		f_577_ += f_592_;
		f_579_ += f_593_;
		f_581_ += f_594_;
		f_583_ += f_595_;
	    }
	}
    }
    
    final void method3354
	(boolean bool, boolean bool_610_, int[] is, int[] is_611_, int i,
	 int i_612_, int i_613_, float f, float f_614_, float f_615_,
	 float f_616_, float f_617_, float f_618_, float f_619_, float f_620_,
	 float f_621_, float f_622_, float f_623_, float f_624_, float f_625_,
	 float f_626_, float f_627_, float f_628_, float f_629_,
	 float f_630_) {
	int i_631_ = i_613_ - i_612_;
	float f_632_ = 1.0F / (float) i_631_;
	float f_633_ = (f_614_ - f) * f_632_;
	float f_634_ = (f_616_ - f_615_) * f_632_;
	float f_635_ = (f_618_ - f_617_) * f_632_;
	float f_636_ = (f_620_ - f_619_) * f_632_;
	float f_637_ = (f_622_ - f_621_) * f_632_;
	float f_638_ = (f_624_ - f_623_) * f_632_;
	float f_639_ = (f_626_ - f_625_) * f_632_;
	float f_640_ = (f_628_ - f_627_) * f_632_;
	float f_641_ = (f_630_ - f_629_) * f_632_;
	if (((Class155_Backup) this).aBool1748) {
	    if (i_613_ > ((Class155_Backup) this).anInt1733)
		i_613_ = ((Class155_Backup) this).anInt1733;
	    if (i_612_ < 0) {
		f -= f_633_ * (float) i_612_;
		f_615_ -= f_634_ * (float) i_612_;
		f_617_ -= f_635_ * (float) i_612_;
		f_619_ -= f_636_ * (float) i_612_;
		f_621_ -= f_637_ * (float) i_612_;
		f_623_ -= f_638_ * (float) i_612_;
		f_625_ -= f_639_ * (float) i_612_;
		f_627_ -= f_640_ * (float) i_612_;
		f_629_ -= f_641_ * (float) i_612_;
		i_612_ = 0;
	    }
	}
	if (i_612_ < i_613_) {
	    i_631_ = i_613_ - i_612_;
	    i += i_612_;
	    while (i_631_-- > 0) {
		float f_642_ = 1.0F / f;
		float f_643_ = 1.0F / f_615_;
		if (!bool || f_642_ < ((Class155_Backup) this).aFloatArray1739[i]) {
		    int i_644_ = (int) (f_617_ * f_643_
					* (float) ((Class155_Backup) this).anInt1752);
		    if (((Class155_Backup) this).aBool1741)
			i_644_ &= ((Class155_Backup) this).anInt1744;
		    else if (i_644_ < 0)
			i_644_ = 0;
		    else if (i_644_ > ((Class155_Backup) this).anInt1744)
			i_644_ = ((Class155_Backup) this).anInt1744;
		    int i_645_ = (int) (f_619_ * f_643_
					* (float) ((Class155_Backup) this).anInt1752);
		    if (((Class155_Backup) this).aBool1741)
			i_645_ &= ((Class155_Backup) this).anInt1744;
		    else if (i_645_ < 0)
			i_645_ = 0;
		    else if (i_645_ > ((Class155_Backup) this).anInt1744)
			i_645_ = ((Class155_Backup) this).anInt1744;
		    int i_646_
			= (((Class155_Backup) this).anIntArray1725
			   [i_645_ * ((Class155_Backup) this).anInt1752 + i_644_]);
		    int i_647_ = 255;
		    if (((Class155_Backup) this).aClass529_1746
			== Class529.aClass529_6944)
			i_647_ = (int) ((float) (i_646_ >> 24 & 0xff) * f_623_
					/ 255.0F);
		    else if (((Class155_Backup) this).aClass529_1746
			     == Class529.aClass529_6943) {
			if ((i_646_ >> 24 & 0xff)
			    > ((Class155_Backup) this).anInt1747)
			    i_647_ = 255;
			else
			    i_647_ = 0;
		    } else
			i_647_ = (int) f_623_;
		    if (i_647_ != 0) {
			if (i_647_ != 255) {
			    int i_648_
				= (~0xffffff
				   | ((int) (f_625_ * (float) (i_646_ >> 16
							       & 0xff)) << 8
				      & 0xff0000)
				   | (int) (f_627_ * (float) (i_646_ >> 8
							      & 0xff)) & 0xff00
				   | ((int) (f_629_ * (float) (i_646_ & 0xff))
				      >> 8));
			    if (f_621_ != 0.0F) {
				int i_649_ = (int) (255.0F - f_621_);
				int i_650_
				    = (((((Class155_Backup) this).anInt1740
					 & 0xff00ff) * (int) f_621_ & ~0xff00ff
					| (((Class155_Backup) this).anInt1740
					   & 0xff00) * (int) f_621_ & 0xff0000)
				       >>> 8);
				i_648_ = ((((i_648_ & 0xff00ff) * i_649_
					    & ~0xff00ff)
					   | ((i_648_ & 0xff00) * i_649_
					      & 0xff0000))
					  >>> 8) + i_650_;
			    }
			    int i_651_ = is[i];
			    int i_652_ = 255 - i_647_;
			    i_648_ = ((((i_651_ & 0xff00ff) * i_652_
					+ (i_648_ & 0xff00ff) * i_647_)
				       & ~0xff00ff)
				      + (((i_651_ & 0xff00) * i_652_
					  + (i_648_ & 0xff00) * i_647_)
					 & 0xff0000)) >> 8;
			    if (bool_610_)
				is[i] = (i_647_ | is[i] >> 24) << 24 | i_648_;
			    else
				is[i] = i_648_;
			    if (bool)
				((Class155_Backup) this).aFloatArray1739[i] = f_642_;
			} else {
			    int i_653_
				= (~0xffffff
				   | ((int) (f_625_ * (float) (i_646_ >> 16
							       & 0xff)) << 8
				      & 0xff0000)
				   | (int) (f_627_ * (float) (i_646_ >> 8
							      & 0xff)) & 0xff00
				   | ((int) (f_629_ * (float) (i_646_ & 0xff))
				      >> 8));
			    if (f_621_ != 0.0F) {
				int i_654_ = (int) (255.0F - f_621_);
				int i_655_
				    = (((((Class155_Backup) this).anInt1740
					 & 0xff00ff) * (int) f_621_ & ~0xff00ff
					| (((Class155_Backup) this).anInt1740
					   & 0xff00) * (int) f_621_ & 0xff0000)
				       >>> 8);
				i_653_ = ((((i_653_ & 0xff00ff) * i_654_
					    & ~0xff00ff)
					   | ((i_653_ & 0xff00) * i_654_
					      & 0xff0000))
					  >>> 8) + i_655_;
			    }
			    if (bool_610_)
				is[i] = i_647_ << 24 | i_653_;
			    else
				is[i] = i_653_;
			    if (bool)
				((Class155_Backup) this).aFloatArray1739[i] = f_642_;
			}
		    }
		}
		i++;
		f += f_633_;
		f_615_ += f_634_;
		f_617_ += f_635_;
		f_619_ += f_636_;
		f_621_ += f_637_;
		f_623_ += f_638_;
		f_625_ += f_639_;
		f_627_ += f_640_;
		f_629_ += f_641_;
	    }
	}
    }
    
    final void method3355
	(boolean bool, boolean bool_656_, boolean bool_657_, float f,
	 float f_658_, float f_659_, float f_660_, float f_661_, float f_662_,
	 float f_663_, float f_664_, float f_665_, float f_666_, float f_667_,
	 float f_668_, float f_669_, float f_670_, float f_671_, float f_672_,
	 float f_673_, float f_674_, int i, int i_675_, int i_676_, int i_677_,
	 float f_678_, float f_679_, float f_680_, int i_681_, int i_682_,
	 float f_683_, int i_684_, int i_685_, float f_686_, int i_687_,
	 int i_688_, float f_689_) {
	if (!bool)
	    method3377(false, bool_656_, bool_657_, f, f_658_, f_659_, f_660_,
		       f_661_, f_662_, f_663_, f_664_, f_665_, 0);
	else {
	    ((Class155_Backup) this).anInt1740 = i_677_;
	    if (!(f <= f_658_) || !(f <= f_659_)) {
		if (f_658_ <= f_659_) {
		    float f_690_ = f_660_;
		    f_660_ = f_661_;
		    f_661_ = f_690_;
		    f_690_ = f;
		    f = f_658_;
		    f_658_ = f_690_;
		    f_690_ = f_663_;
		    f_663_ = f_664_;
		    f_664_ = f_690_;
		    f_690_ = f_669_;
		    f_669_ = f_670_;
		    f_670_ = f_690_;
		    f_690_ = f_672_;
		    f_672_ = f_673_;
		    f_673_ = f_690_;
		    f_690_ = f_666_;
		    f_666_ = f_667_;
		    f_667_ = f_690_;
		    f_690_ = f_678_;
		    f_678_ = f_679_;
		    f_679_ = f_690_;
		    f_690_ = f_683_;
		    f_683_ = f_686_;
		    f_686_ = f_690_;
		    int i_691_ = i;
		    i = i_675_;
		    i_675_ = i_691_;
		    i_691_ = i_682_;
		    i_682_ = i_685_;
		    i_685_ = i_691_;
		    i_691_ = i_681_;
		    i_681_ = i_684_;
		    i_684_ = i_691_;
		} else {
		    float f_692_ = f_660_;
		    f_660_ = f_662_;
		    f_662_ = f_692_;
		    f_692_ = f;
		    f = f_659_;
		    f_659_ = f_692_;
		    f_692_ = f_663_;
		    f_663_ = f_665_;
		    f_665_ = f_692_;
		    f_692_ = f_669_;
		    f_669_ = f_671_;
		    f_671_ = f_692_;
		    f_692_ = f_672_;
		    f_672_ = f_674_;
		    f_674_ = f_692_;
		    f_692_ = f_666_;
		    f_666_ = f_668_;
		    f_668_ = f_692_;
		    f_692_ = f_678_;
		    f_678_ = f_680_;
		    f_680_ = f_692_;
		    f_692_ = f_683_;
		    f_683_ = f_689_;
		    f_689_ = f_692_;
		    int i_693_ = i;
		    i = i_676_;
		    i_676_ = i_693_;
		    i_693_ = i_682_;
		    i_682_ = i_688_;
		    i_688_ = i_693_;
		    i_693_ = i_681_;
		    i_681_ = i_687_;
		    i_687_ = i_693_;
		}
	    }
	    int i_694_ = (i_681_ & 0xffff) << 16 | i_682_ & 0xffff;
	    int i_695_ = (i_684_ & 0xffff) << 16 | i_685_ & 0xffff;
	    int i_696_ = (i_687_ & 0xffff) << 16 | i_688_ & 0xffff;
	    if (i_694_ != ((Class155_Backup) this).anInt1734) {
		((Class155_Backup) this).anIntArray1725
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15389(i_681_, i_682_);
		if (((Class155_Backup) this).anIntArray1725 == null) {
		    ((Class155_Backup) this).anInt1734 = -1;
		    ((Class155_Backup) this).anInt1723 = 255 - (i >> 24 & 0xff);
		    int i_697_ = (Class474.anIntArray6382
				  [(Class241_Sub42.method16451
				    (((Class155_Backup) this).aClass103_Sub2_1743
					 .method15368(i_681_),
				     1711635828)) & 0xffff]);
		    int i_698_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_697_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_697_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_697_ & 0xff) >> 8);
		    method3385(true, bool_656_, bool_657_, f, f_658_, f_659_,
			       f_660_, f_661_, f_662_, f_663_, f_664_, f_665_,
			       Class54.method1306(i_698_, i_677_, f_678_,
						  1372221625),
			       Class54.method1306(i_698_, i_677_, f_679_,
						  1372221625),
			       Class54.method1306(i_698_, i_677_, f_680_,
						  1372221625));
		    return;
		}
		((Class155_Backup) this).anInt1734 = i_694_;
		((Class155_Backup) this).anInt1752
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15365(i_681_);
		((Class155_Backup) this).anInt1744 = ((Class155_Backup) this).anInt1752 - 1;
		((Class155_Backup) this).aClass529_1746
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15366(i_681_);
	    }
	    ((Class155_Backup) this).aFloat1745 = f_683_;
	    if (i_695_ != ((Class155_Backup) this).anInt1749) {
		((Class155_Backup) this).anIntArray1750
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15389(i_684_, i_685_);
		if (((Class155_Backup) this).anIntArray1750 == null) {
		    ((Class155_Backup) this).anInt1749 = -1;
		    ((Class155_Backup) this).anInt1723 = 255 - (i >> 24 & 0xff);
		    int i_699_ = (Class474.anIntArray6382
				  [(Class241_Sub42.method16451
				    (((Class155_Backup) this).aClass103_Sub2_1743
					 .method15368(i_684_),
				     -594430289)) & 0xffff]);
		    int i_700_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_699_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_699_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_699_ & 0xff) >> 8);
		    method3385(true, bool_656_, bool_657_, f, f_658_, f_659_,
			       f_660_, f_661_, f_662_, f_663_, f_664_, f_665_,
			       Class54.method1306(i_700_, i_677_, f_678_,
						  1372221625),
			       Class54.method1306(i_700_, i_677_, f_679_,
						  1372221625),
			       Class54.method1306(i_700_, i_677_, f_680_,
						  1372221625));
		    return;
		}
		((Class155_Backup) this).anInt1749 = i_695_;
		((Class155_Backup) this).anInt1757
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15365(i_684_);
		((Class155_Backup) this).anInt1742 = ((Class155_Backup) this).anInt1757 - 1;
	    }
	    ((Class155_Backup) this).aFloat1753 = f_686_;
	    if (i_696_ != ((Class155_Backup) this).anInt1754) {
		((Class155_Backup) this).anIntArray1755
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15389(i_687_, i_688_);
		if (((Class155_Backup) this).anIntArray1755 == null) {
		    ((Class155_Backup) this).anInt1754 = -1;
		    ((Class155_Backup) this).anInt1723 = 255 - (i >> 24 & 0xff);
		    int i_701_ = (Class474.anIntArray6382
				  [(Class241_Sub42.method16451
				    (((Class155_Backup) this).aClass103_Sub2_1743
					 .method15368(i_687_),
				     -395807928)) & 0xffff]);
		    int i_702_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_701_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_701_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_701_ & 0xff) >> 8);
		    method3385(true, bool_656_, bool_657_, (float) (int) f,
			       (float) (int) f_658_, (float) (int) f_659_,
			       (float) (int) f_660_, (float) (int) f_661_,
			       (float) (int) f_662_, (float) (int) f_663_,
			       (float) (int) f_664_, (float) (int) f_665_,
			       Class54.method1306(i_702_, i_677_, f_678_,
						  1372221625),
			       Class54.method1306(i_702_, i_677_, f_679_,
						  1372221625),
			       Class54.method1306(i_702_, i_677_, f_680_,
						  1372221625));
		    return;
		}
		((Class155_Backup) this).anInt1754 = i_696_;
		((Class155_Backup) this).anInt1738
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15365(i_687_);
		((Class155_Backup) this).anInt1735 = ((Class155_Backup) this).anInt1738 - 1;
	    }
	    ((Class155_Backup) this).aFloat1758 = f_689_;
	    f_669_ /= f_666_;
	    f_670_ /= f_667_;
	    f_671_ /= f_668_;
	    f_672_ /= f_666_;
	    f_673_ /= f_667_;
	    f_674_ /= f_668_;
	    f_663_ = 1.0F / f_663_;
	    f_664_ = 1.0F / f_664_;
	    f_665_ = 1.0F / f_665_;
	    f_666_ = 1.0F / f_666_;
	    f_667_ = 1.0F / f_667_;
	    f_668_ = 1.0F / f_668_;
	    float f_703_ = (float) (i >> 24 & 0xff);
	    float f_704_ = (float) (i_675_ >> 24 & 0xff);
	    float f_705_ = (float) (i_676_ >> 24 & 0xff);
	    float f_706_ = (float) (i >> 16 & 0xff);
	    float f_707_ = (float) (i_675_ >> 16 & 0xff);
	    float f_708_ = (float) (i_676_ >> 16 & 0xff);
	    float f_709_ = (float) (i >> 8 & 0xff);
	    float f_710_ = (float) (i_675_ >> 8 & 0xff);
	    float f_711_ = (float) (i_676_ >> 8 & 0xff);
	    float f_712_ = (float) (i & 0xff);
	    float f_713_ = (float) (i_675_ & 0xff);
	    float f_714_ = (float) (i_676_ & 0xff);
	    float f_715_ = 1.0F;
	    float f_716_ = 0.0F;
	    float f_717_ = 0.0F;
	    float f_718_ = 0.0F;
	    float f_719_ = 1.0F;
	    float f_720_ = 0.0F;
	    float f_721_ = 0.0F;
	    float f_722_ = 0.0F;
	    float f_723_ = 0.0F;
	    float f_724_ = 0.0F;
	    float f_725_ = 0.0F;
	    float f_726_ = 0.0F;
	    float f_727_ = 0.0F;
	    float f_728_ = 0.0F;
	    float f_729_ = 0.0F;
	    float f_730_ = 0.0F;
	    float f_731_ = 0.0F;
	    float f_732_ = 0.0F;
	    if (f_658_ != f) {
		float f_733_ = f_658_ - f;
		f_721_ = (f_661_ - f_660_) / f_733_;
		f_722_ = (f_664_ - f_663_) / f_733_;
		f_723_ = (f_667_ - f_666_) / f_733_;
		f_724_ = (f_670_ - f_669_) / f_733_;
		f_725_ = (f_673_ - f_672_) / f_733_;
		f_726_ = (f_679_ - f_678_) / f_733_;
		f_727_ = (f_704_ - f_703_) / f_733_;
		f_728_ = (f_707_ - f_706_) / f_733_;
		f_729_ = (f_710_ - f_709_) / f_733_;
		f_730_ = (f_713_ - f_712_) / f_733_;
		f_731_ = (f_716_ - f_715_) / f_733_;
		f_732_ = (f_719_ - f_718_) / f_733_;
	    }
	    float f_734_ = 0.0F;
	    float f_735_ = 0.0F;
	    float f_736_ = 0.0F;
	    float f_737_ = 0.0F;
	    float f_738_ = 0.0F;
	    float f_739_ = 0.0F;
	    float f_740_ = 0.0F;
	    float f_741_ = 0.0F;
	    float f_742_ = 0.0F;
	    float f_743_ = 0.0F;
	    float f_744_ = 0.0F;
	    float f_745_ = 0.0F;
	    if (f_659_ != f_658_) {
		float f_746_ = f_659_ - f_658_;
		f_734_ = (f_662_ - f_661_) / f_746_;
		f_735_ = (f_665_ - f_664_) / f_746_;
		f_736_ = (f_668_ - f_667_) / f_746_;
		f_737_ = (f_671_ - f_670_) / f_746_;
		f_738_ = (f_674_ - f_673_) / f_746_;
		f_739_ = (f_680_ - f_679_) / f_746_;
		f_740_ = (f_705_ - f_704_) / f_746_;
		f_741_ = (f_708_ - f_707_) / f_746_;
		f_742_ = (f_711_ - f_710_) / f_746_;
		f_743_ = (f_714_ - f_713_) / f_746_;
		f_744_ = (f_717_ - f_716_) / f_746_;
		f_745_ = (f_720_ - f_719_) / f_746_;
	    }
	    float f_747_ = 0.0F;
	    float f_748_ = 0.0F;
	    float f_749_ = 0.0F;
	    float f_750_ = 0.0F;
	    float f_751_ = 0.0F;
	    float f_752_ = 0.0F;
	    float f_753_ = 0.0F;
	    float f_754_ = 0.0F;
	    float f_755_ = 0.0F;
	    float f_756_ = 0.0F;
	    float f_757_ = 0.0F;
	    float f_758_ = 0.0F;
	    if (f != f_659_) {
		float f_759_ = f - f_659_;
		f_747_ = (f_660_ - f_662_) / f_759_;
		f_748_ = (f_663_ - f_665_) / f_759_;
		f_749_ = (f_666_ - f_668_) / f_759_;
		f_750_ = (f_669_ - f_671_) / f_759_;
		f_751_ = (f_672_ - f_674_) / f_759_;
		f_752_ = (f_678_ - f_680_) / f_759_;
		f_753_ = (f_703_ - f_705_) / f_759_;
		f_754_ = (f_706_ - f_708_) / f_759_;
		f_755_ = (f_709_ - f_711_) / f_759_;
		f_756_ = (f_712_ - f_714_) / f_759_;
		f_757_ = (f_715_ - f_717_) / f_759_;
		f_758_ = (f_718_ - f_720_) / f_759_;
	    }
	    if (!(f >= (float) ((Class155_Backup) this).anInt1726)) {
		if (f_658_ > (float) ((Class155_Backup) this).anInt1726)
		    f_658_ = (float) ((Class155_Backup) this).anInt1726;
		if (f_659_ > (float) ((Class155_Backup) this).anInt1726)
		    f_659_ = (float) ((Class155_Backup) this).anInt1726;
		if (f_658_ < f_659_) {
		    f_662_ = f_660_;
		    f_665_ = f_663_;
		    f_668_ = f_666_;
		    f_671_ = f_669_;
		    f_674_ = f_672_;
		    f_680_ = f_678_;
		    f_705_ = f_703_;
		    f_708_ = f_706_;
		    f_711_ = f_709_;
		    f_714_ = f_712_;
		    f_717_ = f_715_;
		    f_720_ = f_718_;
		    if (f < 0.0F) {
			f_660_ -= f_721_ * f;
			f_662_ -= f_747_ * f;
			f_663_ -= f_722_ * f;
			f_665_ -= f_748_ * f;
			f_666_ -= f_723_ * f;
			f_668_ -= f_749_ * f;
			f_669_ -= f_724_ * f;
			f_671_ -= f_750_ * f;
			f_672_ -= f_725_ * f;
			f_674_ -= f_751_ * f;
			f_678_ -= f_726_ * f;
			f_680_ -= f_752_ * f;
			f_703_ -= f_727_ * f;
			f_705_ -= f_753_ * f;
			f_706_ -= f_728_ * f;
			f_708_ -= f_754_ * f;
			f_709_ -= f_729_ * f;
			f_711_ -= f_755_ * f;
			f_712_ -= f_730_ * f;
			f_714_ -= f_756_ * f;
			f_715_ -= f_731_ * f;
			f_717_ -= f_757_ * f;
			f_718_ -= f_732_ * f;
			f_720_ -= f_758_ * f;
			f = 0.0F;
		    }
		    if (f_658_ < 0.0F) {
			f_661_ -= f_734_ * f_658_;
			f_664_ -= f_735_ * f_658_;
			f_667_ -= f_736_ * f_658_;
			f_670_ -= f_737_ * f_658_;
			f_673_ -= f_738_ * f_658_;
			f_679_ -= f_739_ * f_658_;
			f_704_ -= f_740_ * f_658_;
			f_707_ -= f_741_ * f_658_;
			f_710_ -= f_742_ * f_658_;
			f_713_ -= f_743_ * f_658_;
			f_716_ -= f_744_ * f_658_;
			f_719_ -= f_745_ * f_658_;
			f_658_ = 0.0F;
		    }
		    if (f != f_658_ && f_747_ < f_721_
			|| f == f_658_ && f_747_ > f_734_) {
			f += 0.5F;
			f_658_ += 0.5F;
			f_659_ = (float) (int) (f_659_ + 0.5F) - f_658_;
			f_658_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_658_ >= 0.0F) {
			    method3343(bool_656_, bool_657_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_662_, (int) f_660_,
				       f_665_, f_663_, f_668_, f_666_, f_671_,
				       f_669_, f_674_, f_672_, f_680_, f_678_,
				       f_705_, f_703_, f_708_, f_706_, f_711_,
				       f_709_, f_714_, f_712_, f_717_, f_715_,
				       f_720_, f_718_);
			    f_660_ += f_721_;
			    f_662_ += f_747_;
			    f_663_ += f_722_;
			    f_665_ += f_748_;
			    f_666_ += f_723_;
			    f_668_ += f_749_;
			    f_669_ += f_724_;
			    f_671_ += f_750_;
			    f_672_ += f_725_;
			    f_674_ += f_751_;
			    f_678_ += f_726_;
			    f_680_ += f_752_;
			    f_703_ += f_727_;
			    f_705_ += f_753_;
			    f_706_ += f_728_;
			    f_708_ += f_754_;
			    f_709_ += f_729_;
			    f_711_ += f_755_;
			    f_712_ += f_730_;
			    f_714_ += f_756_;
			    f_715_ += f_731_;
			    f_717_ += f_757_;
			    f_718_ += f_732_;
			    f_720_ += f_758_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_659_ >= 0.0F) {
			    method3343(bool_656_, bool_657_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_662_, (int) f_661_,
				       f_665_, f_664_, f_668_, f_667_, f_671_,
				       f_670_, f_674_, f_673_, f_680_, f_679_,
				       f_705_, f_704_, f_708_, f_707_, f_711_,
				       f_710_, f_714_, f_713_, f_717_, f_716_,
				       f_720_, f_719_);
			    f_661_ += f_734_;
			    f_662_ += f_747_;
			    f_664_ += f_735_;
			    f_665_ += f_748_;
			    f_667_ += f_736_;
			    f_668_ += f_749_;
			    f_670_ += f_737_;
			    f_671_ += f_750_;
			    f_673_ += f_738_;
			    f_674_ += f_751_;
			    f_679_ += f_739_;
			    f_680_ += f_752_;
			    f_704_ += f_740_;
			    f_705_ += f_753_;
			    f_707_ += f_741_;
			    f_708_ += f_754_;
			    f_710_ += f_742_;
			    f_711_ += f_755_;
			    f_713_ += f_743_;
			    f_714_ += f_756_;
			    f_716_ += f_744_;
			    f_717_ += f_757_;
			    f_719_ += f_745_;
			    f_720_ += f_758_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    } else {
			f += 0.5F;
			f_658_ += 0.5F;
			f_659_ = (float) (int) (f_659_ + 0.5F) - f_658_;
			f_658_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_658_ >= 0.0F) {
			    method3343(bool_656_, bool_657_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_660_, (int) f_662_,
				       f_663_, f_665_, f_666_, f_668_, f_669_,
				       f_671_, f_672_, f_674_, f_678_, f_680_,
				       f_703_, f_705_, f_706_, f_708_, f_709_,
				       f_711_, f_712_, f_714_, f_715_, f_717_,
				       f_718_, f_720_);
			    f_660_ += f_721_;
			    f_662_ += f_747_;
			    f_663_ += f_722_;
			    f_665_ += f_748_;
			    f_666_ += f_723_;
			    f_668_ += f_749_;
			    f_669_ += f_724_;
			    f_671_ += f_750_;
			    f_672_ += f_725_;
			    f_674_ += f_751_;
			    f_678_ += f_726_;
			    f_680_ += f_752_;
			    f_703_ += f_727_;
			    f_705_ += f_753_;
			    f_706_ += f_728_;
			    f_708_ += f_754_;
			    f_709_ += f_729_;
			    f_711_ += f_755_;
			    f_712_ += f_730_;
			    f_714_ += f_756_;
			    f_715_ += f_731_;
			    f_717_ += f_757_;
			    f_718_ += f_732_;
			    f_720_ += f_758_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_659_ >= 0.0F) {
			    method3343(bool_656_, bool_657_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_661_, (int) f_662_,
				       f_664_, f_665_, f_667_, f_668_, f_670_,
				       f_671_, f_673_, f_674_, f_679_, f_680_,
				       f_704_, f_705_, f_707_, f_708_, f_710_,
				       f_711_, f_713_, f_714_, f_716_, f_717_,
				       f_719_, f_720_);
			    f_661_ += f_734_;
			    f_662_ += f_747_;
			    f_664_ += f_735_;
			    f_665_ += f_748_;
			    f_667_ += f_736_;
			    f_668_ += f_749_;
			    f_670_ += f_737_;
			    f_671_ += f_750_;
			    f_673_ += f_738_;
			    f_674_ += f_751_;
			    f_679_ += f_739_;
			    f_680_ += f_752_;
			    f_704_ += f_740_;
			    f_705_ += f_753_;
			    f_707_ += f_741_;
			    f_708_ += f_754_;
			    f_710_ += f_742_;
			    f_711_ += f_755_;
			    f_713_ += f_743_;
			    f_714_ += f_756_;
			    f_716_ += f_744_;
			    f_717_ += f_757_;
			    f_719_ += f_745_;
			    f_720_ += f_758_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    }
		} else {
		    f_661_ = f_660_;
		    f_664_ = f_663_;
		    f_667_ = f_666_;
		    f_670_ = f_669_;
		    f_673_ = f_672_;
		    f_679_ = f_678_;
		    f_704_ = f_703_;
		    f_707_ = f_706_;
		    f_710_ = f_709_;
		    f_713_ = f_712_;
		    f_716_ = f_715_;
		    f_719_ = f_718_;
		    if (f < 0.0F) {
			f_660_ -= f_721_ * f;
			f_661_ -= f_747_ * f;
			f_663_ -= f_722_ * f;
			f_664_ -= f_748_ * f;
			f_666_ -= f_723_ * f;
			f_667_ -= f_749_ * f;
			f_669_ -= f_724_ * f;
			f_670_ -= f_750_ * f;
			f_672_ -= f_725_ * f;
			f_673_ -= f_751_ * f;
			f_678_ -= f_726_ * f;
			f_679_ -= f_752_ * f;
			f_703_ -= f_727_ * f;
			f_704_ -= f_753_ * f;
			f_706_ -= f_728_ * f;
			f_707_ -= f_754_ * f;
			f_709_ -= f_729_ * f;
			f_710_ -= f_755_ * f;
			f_712_ -= f_730_ * f;
			f_713_ -= f_756_ * f;
			f_715_ -= f_731_ * f;
			f_716_ -= f_757_ * f;
			f_718_ -= f_732_ * f;
			f_719_ -= f_758_ * f;
			f = 0.0F;
		    }
		    if (f_659_ < 0.0F) {
			f_662_ -= f_734_ * f_659_;
			f_665_ -= f_735_ * f_659_;
			f_668_ -= f_736_ * f_659_;
			f_671_ -= f_737_ * f_659_;
			f_674_ -= f_738_ * f_659_;
			f_680_ -= f_739_ * f_659_;
			f_705_ -= f_740_ * f_659_;
			f_708_ -= f_741_ * f_659_;
			f_711_ -= f_742_ * f_659_;
			f_714_ -= f_743_ * f_659_;
			f_717_ -= f_744_ * f_659_;
			f_720_ -= f_745_ * f_659_;
			f_659_ = 0.0F;
		    }
		    if (f != f_659_ && f_747_ < f_721_
			|| f == f_659_ && f_734_ > f_721_) {
			f += 0.5F;
			f_659_ += 0.5F;
			f_658_ = (float) (int) (f_658_ + 0.5F) - f_659_;
			f_659_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_659_ >= 0.0F) {
			    method3343(bool_656_, bool_657_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_661_, (int) f_660_,
				       f_664_, f_663_, f_667_, f_666_, f_670_,
				       f_669_, f_673_, f_672_, f_679_, f_678_,
				       f_704_, f_703_, f_707_, f_706_, f_710_,
				       f_709_, f_713_, f_712_, f_716_, f_715_,
				       f_719_, f_718_);
			    f_660_ += f_721_;
			    f_661_ += f_747_;
			    f_663_ += f_722_;
			    f_664_ += f_748_;
			    f_666_ += f_723_;
			    f_667_ += f_749_;
			    f_669_ += f_724_;
			    f_670_ += f_750_;
			    f_672_ += f_725_;
			    f_673_ += f_751_;
			    f_678_ += f_726_;
			    f_679_ += f_752_;
			    f_703_ += f_727_;
			    f_704_ += f_753_;
			    f_706_ += f_728_;
			    f_707_ += f_754_;
			    f_709_ += f_729_;
			    f_710_ += f_755_;
			    f_712_ += f_730_;
			    f_713_ += f_756_;
			    f_715_ += f_731_;
			    f_716_ += f_757_;
			    f_718_ += f_732_;
			    f_719_ += f_758_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_658_ >= 0.0F) {
			    method3343(bool_656_, bool_657_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_662_, (int) f_660_,
				       f_665_, f_663_, f_668_, f_666_, f_671_,
				       f_669_, f_674_, f_672_, f_680_, f_678_,
				       f_705_, f_703_, f_708_, f_706_, f_711_,
				       f_709_, f_714_, f_712_, f_717_, f_715_,
				       f_720_, f_718_);
			    f_662_ += f_734_;
			    f_660_ += f_721_;
			    f_665_ += f_735_;
			    f_663_ += f_722_;
			    f_668_ += f_736_;
			    f_666_ += f_723_;
			    f_671_ += f_737_;
			    f_669_ += f_724_;
			    f_674_ += f_738_;
			    f_672_ += f_725_;
			    f_680_ += f_739_;
			    f_678_ += f_726_;
			    f_705_ += f_740_;
			    f_703_ += f_727_;
			    f_708_ += f_741_;
			    f_706_ += f_728_;
			    f_711_ += f_742_;
			    f_709_ += f_729_;
			    f_714_ += f_743_;
			    f_712_ += f_730_;
			    f_717_ += f_744_;
			    f_715_ += f_731_;
			    f_720_ += f_745_;
			    f_718_ += f_732_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    } else {
			f += 0.5F;
			f_659_ += 0.5F;
			f_658_ = (float) (int) (f_658_ + 0.5F) - f_659_;
			f_659_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_659_ >= 0.0F) {
			    method3343(bool_656_, bool_657_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_660_, (int) f_661_,
				       f_663_, f_664_, f_666_, f_667_, f_669_,
				       f_670_, f_672_, f_673_, f_678_, f_679_,
				       f_703_, f_704_, f_706_, f_707_, f_709_,
				       f_710_, f_712_, f_713_, f_715_, f_716_,
				       f_718_, f_719_);
			    f_661_ += f_747_;
			    f_660_ += f_721_;
			    f_664_ += f_748_;
			    f_663_ += f_722_;
			    f_667_ += f_749_;
			    f_666_ += f_723_;
			    f_670_ += f_750_;
			    f_669_ += f_724_;
			    f_673_ += f_751_;
			    f_672_ += f_725_;
			    f_679_ += f_752_;
			    f_678_ += f_726_;
			    f_704_ += f_753_;
			    f_703_ += f_727_;
			    f_707_ += f_754_;
			    f_706_ += f_728_;
			    f_710_ += f_755_;
			    f_709_ += f_729_;
			    f_713_ += f_756_;
			    f_712_ += f_730_;
			    f_716_ += f_757_;
			    f_715_ += f_731_;
			    f_719_ += f_758_;
			    f_718_ += f_732_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_658_ >= 0.0F) {
			    method3343(bool_656_, bool_657_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_660_, (int) f_662_,
				       f_663_, f_665_, f_666_, f_668_, f_669_,
				       f_671_, f_672_, f_674_, f_678_, f_680_,
				       f_703_, f_705_, f_706_, f_708_, f_709_,
				       f_711_, f_712_, f_714_, f_715_, f_717_,
				       f_718_, f_720_);
			    f_660_ += f_721_;
			    f_662_ += f_734_;
			    f_663_ += f_722_;
			    f_665_ += f_735_;
			    f_666_ += f_723_;
			    f_668_ += f_736_;
			    f_669_ += f_724_;
			    f_671_ += f_737_;
			    f_672_ += f_725_;
			    f_674_ += f_738_;
			    f_678_ += f_726_;
			    f_680_ += f_739_;
			    f_703_ += f_727_;
			    f_705_ += f_740_;
			    f_706_ += f_728_;
			    f_708_ += f_741_;
			    f_709_ += f_729_;
			    f_711_ += f_742_;
			    f_712_ += f_730_;
			    f_714_ += f_743_;
			    f_715_ += f_731_;
			    f_717_ += f_744_;
			    f_718_ += f_732_;
			    f_720_ += f_745_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    }
		}
	    }
	}
    }
    
    int method3356() {
	return (((Class155_Backup) this).anIntArray1730[0]
		% ((Class155_Backup) this).anInt1737);
    }
    
    int method3357() {
	return (((Class155_Backup) this).anIntArray1730[0]
		% ((Class155_Backup) this).anInt1737);
    }
    
    int method3358() {
	return (((Class155_Backup) this).anIntArray1730[0]
		/ ((Class155_Backup) this).anInt1737);
    }
    
    int method3359() {
	return (((Class155_Backup) this).anIntArray1730[0]
		/ ((Class155_Backup) this).anInt1737);
    }
    
    final void method3360(boolean bool) {
	((Class155_Backup) this).aBool1724 = bool;
    }
    
    final void method3361(boolean bool, boolean bool_760_, boolean bool_761_,
			  float f, float f_762_, float f_763_, float f_764_,
			  float f_765_, float f_766_, float f_767_,
			  float f_768_, float f_769_, float f_770_,
			  float f_771_, float f_772_) {
	if (!bool)
	    method3377(false, bool_760_, bool_761_, f, f_762_, f_763_, f_764_,
		       f_765_, f_766_, f_767_, f_768_, f_769_, 0);
	else if (((Class155_Backup) this).aBool1724) {
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517
		((int) f_764_, (int) f, (int) f_765_, (int) f_762_,
		 Class474.anIntArray6382[(int) f_770_ & 0xffff], 223909001);
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517
		((int) f_765_, (int) f_762_, (int) f_766_, (int) f_763_,
		 Class474.anIntArray6382[(int) f_770_ & 0xffff], 223909001);
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517
		((int) f_766_, (int) f_763_, (int) f_764_, (int) f,
		 Class474.anIntArray6382[(int) f_770_ & 0xffff], 223909001);
	} else {
	    float f_773_ = f_765_ - f_764_;
	    float f_774_ = f_762_ - f;
	    float f_775_ = f_766_ - f_764_;
	    float f_776_ = f_763_ - f;
	    float f_777_ = f_771_ - f_770_;
	    float f_778_ = f_772_ - f_770_;
	    float f_779_ = f_768_ - f_767_;
	    float f_780_ = f_769_ - f_767_;
	    float f_781_;
	    if (f_763_ != f_762_)
		f_781_ = (f_766_ - f_765_) / (f_763_ - f_762_);
	    else
		f_781_ = 0.0F;
	    float f_782_;
	    if (f_762_ != f)
		f_782_ = f_773_ / f_774_;
	    else
		f_782_ = 0.0F;
	    float f_783_;
	    if (f_763_ != f)
		f_783_ = f_775_ / f_776_;
	    else
		f_783_ = 0.0F;
	    float f_784_ = f_773_ * f_776_ - f_775_ * f_774_;
	    if (f_784_ != 0.0F) {
		float f_785_ = (f_777_ * f_776_ - f_778_ * f_774_) / f_784_;
		float f_786_ = (f_778_ * f_773_ - f_777_ * f_775_) / f_784_;
		float f_787_ = (f_779_ * f_776_ - f_780_ * f_774_) / f_784_;
		float f_788_ = (f_780_ * f_773_ - f_779_ * f_775_) / f_784_;
		if (f <= f_762_ && f <= f_763_) {
		    if (!(f >= (float) ((Class155_Backup) this).anInt1726)) {
			if (f_762_ > (float) ((Class155_Backup) this).anInt1726)
			    f_762_ = (float) ((Class155_Backup) this).anInt1726;
			if (f_763_ > (float) ((Class155_Backup) this).anInt1726)
			    f_763_ = (float) ((Class155_Backup) this).anInt1726;
			f_770_ = f_770_ - f_785_ * f_764_ + f_785_;
			f_767_ = f_767_ - f_787_ * f_764_ + f_787_;
			if (f_762_ < f_763_) {
			    f_766_ = f_764_;
			    if (f < 0.0F) {
				f_766_ -= f_783_ * f;
				f_764_ -= f_782_ * f;
				f_770_ -= f_786_ * f;
				f_767_ -= f_788_ * f;
				f = 0.0F;
			    }
			    if (f_762_ < 0.0F) {
				f_765_ -= f_781_ * f_762_;
				f_762_ = 0.0F;
			    }
			    if (f != f_762_ && f_783_ < f_782_
				|| f == f_762_ && f_783_ > f_781_) {
				f += 0.5F;
				f_762_ += 0.5F;
				f_763_
				    = (float) (int) (f_763_ + 0.5F) - f_762_;
				f_762_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_762_ >= 0.0F) {
				    method3347(bool_760_, bool_761_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_766_,
					       (int) f_764_, f_770_, f_785_,
					       f_767_, f_787_);
				    f_766_ += f_783_;
				    f_764_ += f_782_;
				    f_770_ += f_786_;
				    f_767_ += f_788_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_763_ >= 0.0F) {
				    method3347(bool_760_, bool_761_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_766_,
					       (int) f_765_, f_770_, f_785_,
					       f_767_, f_787_);
				    f_766_ += f_783_;
				    f_765_ += f_781_;
				    f_770_ += f_786_;
				    f_767_ += f_788_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f += 0.5F;
				f_762_ += 0.5F;
				f_763_
				    = (float) (int) (f_763_ + 0.5F) - f_762_;
				f_762_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_762_ >= 0.0F) {
				    method3347(bool_760_, bool_761_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_764_,
					       (int) f_766_, f_770_, f_785_,
					       f_767_, f_787_);
				    f_766_ += f_783_;
				    f_764_ += f_782_;
				    f_770_ += f_786_;
				    f_767_ += f_788_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_763_ >= 0.0F) {
				    method3347(bool_760_, bool_761_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_765_,
					       (int) f_766_, f_770_, f_785_,
					       f_767_, f_787_);
				    f_766_ += f_783_;
				    f_765_ += f_781_;
				    f_770_ += f_786_;
				    f_767_ += f_788_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			} else {
			    f_765_ = f_764_;
			    if (f < 0.0F) {
				f_765_ -= f_783_ * f;
				f_764_ -= f_782_ * f;
				f_770_ -= f_786_ * f;
				f_767_ -= f_788_ * f;
				f = 0.0F;
			    }
			    if (f_763_ < 0.0F) {
				f_766_ -= f_781_ * f_763_;
				f_763_ = 0.0F;
			    }
			    if (f != f_763_ && f_783_ < f_782_
				|| f == f_763_ && f_781_ > f_782_) {
				f += 0.5F;
				f_763_ += 0.5F;
				f_762_
				    = (float) (int) (f_762_ + 0.5F) - f_763_;
				f_763_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_763_ >= 0.0F) {
				    method3347(bool_760_, bool_761_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_765_,
					       (int) f_764_, f_770_, f_785_,
					       f_767_, f_787_);
				    f_765_ += f_783_;
				    f_764_ += f_782_;
				    f_770_ += f_786_;
				    f_767_ += f_788_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_762_ >= 0.0F) {
				    method3347(bool_760_, bool_761_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_766_,
					       (int) f_764_, f_770_, f_785_,
					       f_767_, f_787_);
				    f_766_ += f_781_;
				    f_764_ += f_782_;
				    f_770_ += f_786_;
				    f_767_ += f_788_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f += 0.5F;
				f_763_ += 0.5F;
				f_762_
				    = (float) (int) (f_762_ + 0.5F) - f_763_;
				f_763_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_763_ >= 0.0F) {
				    method3347(bool_760_, bool_761_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_764_,
					       (int) f_765_, f_770_, f_785_,
					       f_767_, f_787_);
				    f_765_ += f_783_;
				    f_764_ += f_782_;
				    f_770_ += f_786_;
				    f_767_ += f_788_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_762_ >= 0.0F) {
				    method3347(bool_760_, bool_761_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_764_,
					       (int) f_766_, f_770_, f_785_,
					       f_767_, f_787_);
				    f_766_ += f_781_;
				    f_764_ += f_782_;
				    f_770_ += f_786_;
				    f_767_ += f_788_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			}
		    }
		} else if (f_762_ <= f_763_) {
		    if (!(f_762_ >= (float) ((Class155_Backup) this).anInt1726)) {
			if (f_763_ > (float) ((Class155_Backup) this).anInt1726)
			    f_763_ = (float) ((Class155_Backup) this).anInt1726;
			if (f > (float) ((Class155_Backup) this).anInt1726)
			    f = (float) ((Class155_Backup) this).anInt1726;
			f_771_ = f_771_ - f_785_ * f_765_ + f_785_;
			f_768_ = f_768_ - f_787_ * f_765_ + f_787_;
			if (f_763_ < f) {
			    f_764_ = f_765_;
			    if (f_762_ < 0.0F) {
				f_764_ -= f_782_ * f_762_;
				f_765_ -= f_781_ * f_762_;
				f_771_ -= f_786_ * f_762_;
				f_768_ -= f_788_ * f_762_;
				f_762_ = 0.0F;
			    }
			    if (f_763_ < 0.0F) {
				f_766_ -= f_783_ * f_763_;
				f_763_ = 0.0F;
			    }
			    if (f_762_ != f_763_ && f_782_ < f_781_
				|| f_762_ == f_763_ && f_782_ > f_783_) {
				f_762_ += 0.5F;
				f_763_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_763_;
				f_763_ -= f_762_;
				f_762_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_762_]);
				while (--f_763_ >= 0.0F) {
				    method3347(bool_760_, bool_761_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_762_, 0, 0,
					       (int) f_764_, (int) f_765_,
					       f_771_, f_785_, f_768_, f_787_);
				    f_764_ += f_782_;
				    f_765_ += f_781_;
				    f_771_ += f_786_;
				    f_768_ += f_788_;
				    f_762_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f >= 0.0F) {
				    method3347(bool_760_, bool_761_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_762_, 0, 0,
					       (int) f_764_, (int) f_766_,
					       f_771_, f_785_, f_768_, f_787_);
				    f_764_ += f_782_;
				    f_766_ += f_783_;
				    f_771_ += f_786_;
				    f_768_ += f_788_;
				    f_762_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f_762_ += 0.5F;
				f_763_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_763_;
				f_763_ -= f_762_;
				f_762_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_762_]);
				while (--f_763_ >= 0.0F) {
				    method3347(bool_760_, bool_761_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_762_, 0, 0,
					       (int) f_765_, (int) f_764_,
					       f_771_, f_785_, f_768_, f_787_);
				    f_764_ += f_782_;
				    f_765_ += f_781_;
				    f_771_ += f_786_;
				    f_768_ += f_788_;
				    f_762_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f >= 0.0F) {
				    method3347(bool_760_, bool_761_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_762_, 0, 0,
					       (int) f_766_, (int) f_764_,
					       f_771_, f_785_, f_768_, f_787_);
				    f_764_ += f_782_;
				    f_766_ += f_783_;
				    f_771_ += f_786_;
				    f_768_ += f_788_;
				    f_762_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			} else {
			    f_766_ = f_765_;
			    if (f_762_ < 0.0F) {
				f_766_ -= f_782_ * f_762_;
				f_765_ -= f_781_ * f_762_;
				f_771_ -= f_786_ * f_762_;
				f_768_ -= f_788_ * f_762_;
				f_762_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_764_ -= f_783_ * f;
				f = 0.0F;
			    }
			    if (f_782_ < f_781_) {
				f_762_ += 0.5F;
				f += 0.5F;
				f_763_ = (float) (int) (f_763_ + 0.5F) - f;
				f -= f_762_;
				f_762_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_762_]);
				while (--f >= 0.0F) {
				    method3347(bool_760_, bool_761_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_762_, 0, 0,
					       (int) f_766_, (int) f_765_,
					       f_771_, f_785_, f_768_, f_787_);
				    f_766_ += f_782_;
				    f_765_ += f_781_;
				    f_771_ += f_786_;
				    f_768_ += f_788_;
				    f_762_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_763_ >= 0.0F) {
				    method3347(bool_760_, bool_761_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_762_, 0, 0,
					       (int) f_764_, (int) f_765_,
					       f_771_, f_785_, f_768_, f_787_);
				    f_764_ += f_783_;
				    f_765_ += f_781_;
				    f_771_ += f_786_;
				    f_768_ += f_788_;
				    f_762_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f_762_ += 0.5F;
				f += 0.5F;
				f_763_ = (float) (int) (f_763_ + 0.5F) - f;
				f -= f_762_;
				f_762_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_762_]);
				while (--f >= 0.0F) {
				    method3347(bool_760_, bool_761_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_762_, 0, 0,
					       (int) f_765_, (int) f_766_,
					       f_771_, f_785_, f_768_, f_787_);
				    f_766_ += f_782_;
				    f_765_ += f_781_;
				    f_771_ += f_786_;
				    f_768_ += f_788_;
				    f_762_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_763_ >= 0.0F) {
				    method3347(bool_760_, bool_761_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_762_, 0, 0,
					       (int) f_765_, (int) f_764_,
					       f_771_, f_785_, f_768_, f_787_);
				    f_764_ += f_783_;
				    f_765_ += f_781_;
				    f_771_ += f_786_;
				    f_768_ += f_788_;
				    f_762_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			}
		    }
		} else if (!(f_763_ >= (float) ((Class155_Backup) this).anInt1726)) {
		    if (f > (float) ((Class155_Backup) this).anInt1726)
			f = (float) ((Class155_Backup) this).anInt1726;
		    if (f_762_ > (float) ((Class155_Backup) this).anInt1726)
			f_762_ = (float) ((Class155_Backup) this).anInt1726;
		    f_772_ = f_772_ - f_785_ * f_766_ + f_785_;
		    f_769_ = f_769_ - f_787_ * f_766_ + f_787_;
		    if (f < f_762_) {
			f_765_ = f_766_;
			if (f_763_ < 0.0F) {
			    f_765_ -= f_781_ * f_763_;
			    f_766_ -= f_783_ * f_763_;
			    f_772_ -= f_786_ * f_763_;
			    f_769_ -= f_788_ * f_763_;
			    f_763_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_764_ -= f_782_ * f;
			    f = 0.0F;
			}
			if (f_781_ < f_783_) {
			    f_763_ += 0.5F;
			    f += 0.5F;
			    f_762_ = (float) (int) (f_762_ + 0.5F) - f;
			    f -= f_763_;
			    f_763_ = (float) (((Class155_Backup) this).anIntArray1730
					      [(int) f_763_]);
			    while (--f >= 0.0F) {
				method3347(bool_760_, bool_761_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_763_, 0, 0, (int) f_765_,
					   (int) f_766_, f_772_, f_785_,
					   f_769_, f_787_);
				f_765_ += f_781_;
				f_766_ += f_783_;
				f_772_ += f_786_;
				f_769_ += f_788_;
				f_763_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f_762_ >= 0.0F) {
				method3347(bool_760_, bool_761_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_763_, 0, 0, (int) f_765_,
					   (int) f_764_, f_772_, f_785_,
					   f_769_, f_787_);
				f_765_ += f_781_;
				f_764_ += f_782_;
				f_772_ += f_786_;
				f_769_ += f_788_;
				f_763_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			} else {
			    f_763_ += 0.5F;
			    f += 0.5F;
			    f_762_ = (float) (int) (f_762_ + 0.5F) - f;
			    f -= f_763_;
			    f_763_ = (float) (((Class155_Backup) this).anIntArray1730
					      [(int) f_763_]);
			    while (--f >= 0.0F) {
				method3347(bool_760_, bool_761_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_763_, 0, 0, (int) f_766_,
					   (int) f_765_, f_772_, f_785_,
					   f_769_, f_787_);
				f_765_ += f_781_;
				f_766_ += f_783_;
				f_772_ += f_786_;
				f_769_ += f_788_;
				f_763_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f_762_ >= 0.0F) {
				method3347(bool_760_, bool_761_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_763_, 0, 0, (int) f_764_,
					   (int) f_765_, f_772_, f_785_,
					   f_769_, f_787_);
				f_765_ += f_781_;
				f_764_ += f_782_;
				f_772_ += f_786_;
				f_769_ += f_788_;
				f_763_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			}
		    } else {
			f_764_ = f_766_;
			if (f_763_ < 0.0F) {
			    f_764_ -= f_781_ * f_763_;
			    f_766_ -= f_783_ * f_763_;
			    f_772_ -= f_786_ * f_763_;
			    f_769_ -= f_788_ * f_763_;
			    f_763_ = 0.0F;
			}
			if (f_762_ < 0.0F) {
			    f_765_ -= f_782_ * f_762_;
			    f_762_ = 0.0F;
			}
			if (f_781_ < f_783_) {
			    f_763_ += 0.5F;
			    f_762_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_762_;
			    f_762_ -= f_763_;
			    f_763_ = (float) (((Class155_Backup) this).anIntArray1730
					      [(int) f_763_]);
			    while (--f_762_ >= 0.0F) {
				method3347(bool_760_, bool_761_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_763_, 0, 0, (int) f_764_,
					   (int) f_766_, f_772_, f_785_,
					   f_769_, f_787_);
				f_764_ += f_781_;
				f_766_ += f_783_;
				f_772_ += f_786_;
				f_769_ += f_788_;
				f_763_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f >= 0.0F) {
				method3347(bool_760_, bool_761_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_763_, 0, 0, (int) f_765_,
					   (int) f_766_, f_772_, f_785_,
					   f_769_, f_787_);
				f_765_ += f_782_;
				f_766_ += f_783_;
				f_772_ += f_786_;
				f_769_ += f_788_;
				f_763_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			} else {
			    f_763_ += 0.5F;
			    f_762_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_762_;
			    f_762_ -= f_763_;
			    f_763_ = (float) (((Class155_Backup) this).anIntArray1730
					      [(int) f_763_]);
			    while (--f_762_ >= 0.0F) {
				method3347(bool_760_, bool_761_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_763_, 0, 0, (int) f_766_,
					   (int) f_764_, f_772_, f_785_,
					   f_769_, f_787_);
				f_764_ += f_781_;
				f_766_ += f_783_;
				f_772_ += f_786_;
				f_769_ += f_788_;
				f_763_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f >= 0.0F) {
				method3347(bool_760_, bool_761_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_763_, 0, 0, (int) f_766_,
					   (int) f_765_, f_772_, f_785_,
					   f_769_, f_787_);
				f_765_ += f_782_;
				f_766_ += f_783_;
				f_772_ += f_786_;
				f_769_ += f_788_;
				f_763_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method3362(boolean bool, boolean bool_789_, boolean bool_790_,
			  float f, float f_791_, float f_792_, float f_793_,
			  float f_794_, float f_795_, float f_796_,
			  float f_797_, float f_798_, float f_799_,
			  float f_800_, float f_801_) {
	if (!bool)
	    method3377(false, bool_789_, bool_790_, f, f_791_, f_792_, f_793_,
		       f_794_, f_795_, f_796_, f_797_, f_798_, 0);
	else if (((Class155_Backup) this).aBool1724) {
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517
		((int) f_793_, (int) f, (int) f_794_, (int) f_791_,
		 Class474.anIntArray6382[(int) f_799_ & 0xffff], 223909001);
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517
		((int) f_794_, (int) f_791_, (int) f_795_, (int) f_792_,
		 Class474.anIntArray6382[(int) f_799_ & 0xffff], 223909001);
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517
		((int) f_795_, (int) f_792_, (int) f_793_, (int) f,
		 Class474.anIntArray6382[(int) f_799_ & 0xffff], 223909001);
	} else {
	    float f_802_ = f_794_ - f_793_;
	    float f_803_ = f_791_ - f;
	    float f_804_ = f_795_ - f_793_;
	    float f_805_ = f_792_ - f;
	    float f_806_ = f_800_ - f_799_;
	    float f_807_ = f_801_ - f_799_;
	    float f_808_ = f_797_ - f_796_;
	    float f_809_ = f_798_ - f_796_;
	    float f_810_;
	    if (f_792_ != f_791_)
		f_810_ = (f_795_ - f_794_) / (f_792_ - f_791_);
	    else
		f_810_ = 0.0F;
	    float f_811_;
	    if (f_791_ != f)
		f_811_ = f_802_ / f_803_;
	    else
		f_811_ = 0.0F;
	    float f_812_;
	    if (f_792_ != f)
		f_812_ = f_804_ / f_805_;
	    else
		f_812_ = 0.0F;
	    float f_813_ = f_802_ * f_805_ - f_804_ * f_803_;
	    if (f_813_ != 0.0F) {
		float f_814_ = (f_806_ * f_805_ - f_807_ * f_803_) / f_813_;
		float f_815_ = (f_807_ * f_802_ - f_806_ * f_804_) / f_813_;
		float f_816_ = (f_808_ * f_805_ - f_809_ * f_803_) / f_813_;
		float f_817_ = (f_809_ * f_802_ - f_808_ * f_804_) / f_813_;
		if (f <= f_791_ && f <= f_792_) {
		    if (!(f >= (float) ((Class155_Backup) this).anInt1726)) {
			if (f_791_ > (float) ((Class155_Backup) this).anInt1726)
			    f_791_ = (float) ((Class155_Backup) this).anInt1726;
			if (f_792_ > (float) ((Class155_Backup) this).anInt1726)
			    f_792_ = (float) ((Class155_Backup) this).anInt1726;
			f_799_ = f_799_ - f_814_ * f_793_ + f_814_;
			f_796_ = f_796_ - f_816_ * f_793_ + f_816_;
			if (f_791_ < f_792_) {
			    f_795_ = f_793_;
			    if (f < 0.0F) {
				f_795_ -= f_812_ * f;
				f_793_ -= f_811_ * f;
				f_799_ -= f_815_ * f;
				f_796_ -= f_817_ * f;
				f = 0.0F;
			    }
			    if (f_791_ < 0.0F) {
				f_794_ -= f_810_ * f_791_;
				f_791_ = 0.0F;
			    }
			    if (f != f_791_ && f_812_ < f_811_
				|| f == f_791_ && f_812_ > f_810_) {
				f += 0.5F;
				f_791_ += 0.5F;
				f_792_
				    = (float) (int) (f_792_ + 0.5F) - f_791_;
				f_791_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_791_ >= 0.0F) {
				    method3347(bool_789_, bool_790_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_795_,
					       (int) f_793_, f_799_, f_814_,
					       f_796_, f_816_);
				    f_795_ += f_812_;
				    f_793_ += f_811_;
				    f_799_ += f_815_;
				    f_796_ += f_817_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_792_ >= 0.0F) {
				    method3347(bool_789_, bool_790_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_795_,
					       (int) f_794_, f_799_, f_814_,
					       f_796_, f_816_);
				    f_795_ += f_812_;
				    f_794_ += f_810_;
				    f_799_ += f_815_;
				    f_796_ += f_817_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f += 0.5F;
				f_791_ += 0.5F;
				f_792_
				    = (float) (int) (f_792_ + 0.5F) - f_791_;
				f_791_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_791_ >= 0.0F) {
				    method3347(bool_789_, bool_790_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_793_,
					       (int) f_795_, f_799_, f_814_,
					       f_796_, f_816_);
				    f_795_ += f_812_;
				    f_793_ += f_811_;
				    f_799_ += f_815_;
				    f_796_ += f_817_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_792_ >= 0.0F) {
				    method3347(bool_789_, bool_790_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_794_,
					       (int) f_795_, f_799_, f_814_,
					       f_796_, f_816_);
				    f_795_ += f_812_;
				    f_794_ += f_810_;
				    f_799_ += f_815_;
				    f_796_ += f_817_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			} else {
			    f_794_ = f_793_;
			    if (f < 0.0F) {
				f_794_ -= f_812_ * f;
				f_793_ -= f_811_ * f;
				f_799_ -= f_815_ * f;
				f_796_ -= f_817_ * f;
				f = 0.0F;
			    }
			    if (f_792_ < 0.0F) {
				f_795_ -= f_810_ * f_792_;
				f_792_ = 0.0F;
			    }
			    if (f != f_792_ && f_812_ < f_811_
				|| f == f_792_ && f_810_ > f_811_) {
				f += 0.5F;
				f_792_ += 0.5F;
				f_791_
				    = (float) (int) (f_791_ + 0.5F) - f_792_;
				f_792_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_792_ >= 0.0F) {
				    method3347(bool_789_, bool_790_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_794_,
					       (int) f_793_, f_799_, f_814_,
					       f_796_, f_816_);
				    f_794_ += f_812_;
				    f_793_ += f_811_;
				    f_799_ += f_815_;
				    f_796_ += f_817_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_791_ >= 0.0F) {
				    method3347(bool_789_, bool_790_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_795_,
					       (int) f_793_, f_799_, f_814_,
					       f_796_, f_816_);
				    f_795_ += f_810_;
				    f_793_ += f_811_;
				    f_799_ += f_815_;
				    f_796_ += f_817_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f += 0.5F;
				f_792_ += 0.5F;
				f_791_
				    = (float) (int) (f_791_ + 0.5F) - f_792_;
				f_792_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_792_ >= 0.0F) {
				    method3347(bool_789_, bool_790_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_793_,
					       (int) f_794_, f_799_, f_814_,
					       f_796_, f_816_);
				    f_794_ += f_812_;
				    f_793_ += f_811_;
				    f_799_ += f_815_;
				    f_796_ += f_817_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_791_ >= 0.0F) {
				    method3347(bool_789_, bool_790_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_793_,
					       (int) f_795_, f_799_, f_814_,
					       f_796_, f_816_);
				    f_795_ += f_810_;
				    f_793_ += f_811_;
				    f_799_ += f_815_;
				    f_796_ += f_817_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			}
		    }
		} else if (f_791_ <= f_792_) {
		    if (!(f_791_ >= (float) ((Class155_Backup) this).anInt1726)) {
			if (f_792_ > (float) ((Class155_Backup) this).anInt1726)
			    f_792_ = (float) ((Class155_Backup) this).anInt1726;
			if (f > (float) ((Class155_Backup) this).anInt1726)
			    f = (float) ((Class155_Backup) this).anInt1726;
			f_800_ = f_800_ - f_814_ * f_794_ + f_814_;
			f_797_ = f_797_ - f_816_ * f_794_ + f_816_;
			if (f_792_ < f) {
			    f_793_ = f_794_;
			    if (f_791_ < 0.0F) {
				f_793_ -= f_811_ * f_791_;
				f_794_ -= f_810_ * f_791_;
				f_800_ -= f_815_ * f_791_;
				f_797_ -= f_817_ * f_791_;
				f_791_ = 0.0F;
			    }
			    if (f_792_ < 0.0F) {
				f_795_ -= f_812_ * f_792_;
				f_792_ = 0.0F;
			    }
			    if (f_791_ != f_792_ && f_811_ < f_810_
				|| f_791_ == f_792_ && f_811_ > f_812_) {
				f_791_ += 0.5F;
				f_792_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_792_;
				f_792_ -= f_791_;
				f_791_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_791_]);
				while (--f_792_ >= 0.0F) {
				    method3347(bool_789_, bool_790_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_791_, 0, 0,
					       (int) f_793_, (int) f_794_,
					       f_800_, f_814_, f_797_, f_816_);
				    f_793_ += f_811_;
				    f_794_ += f_810_;
				    f_800_ += f_815_;
				    f_797_ += f_817_;
				    f_791_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f >= 0.0F) {
				    method3347(bool_789_, bool_790_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_791_, 0, 0,
					       (int) f_793_, (int) f_795_,
					       f_800_, f_814_, f_797_, f_816_);
				    f_793_ += f_811_;
				    f_795_ += f_812_;
				    f_800_ += f_815_;
				    f_797_ += f_817_;
				    f_791_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f_791_ += 0.5F;
				f_792_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_792_;
				f_792_ -= f_791_;
				f_791_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_791_]);
				while (--f_792_ >= 0.0F) {
				    method3347(bool_789_, bool_790_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_791_, 0, 0,
					       (int) f_794_, (int) f_793_,
					       f_800_, f_814_, f_797_, f_816_);
				    f_793_ += f_811_;
				    f_794_ += f_810_;
				    f_800_ += f_815_;
				    f_797_ += f_817_;
				    f_791_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f >= 0.0F) {
				    method3347(bool_789_, bool_790_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_791_, 0, 0,
					       (int) f_795_, (int) f_793_,
					       f_800_, f_814_, f_797_, f_816_);
				    f_793_ += f_811_;
				    f_795_ += f_812_;
				    f_800_ += f_815_;
				    f_797_ += f_817_;
				    f_791_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			} else {
			    f_795_ = f_794_;
			    if (f_791_ < 0.0F) {
				f_795_ -= f_811_ * f_791_;
				f_794_ -= f_810_ * f_791_;
				f_800_ -= f_815_ * f_791_;
				f_797_ -= f_817_ * f_791_;
				f_791_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_793_ -= f_812_ * f;
				f = 0.0F;
			    }
			    if (f_811_ < f_810_) {
				f_791_ += 0.5F;
				f += 0.5F;
				f_792_ = (float) (int) (f_792_ + 0.5F) - f;
				f -= f_791_;
				f_791_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_791_]);
				while (--f >= 0.0F) {
				    method3347(bool_789_, bool_790_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_791_, 0, 0,
					       (int) f_795_, (int) f_794_,
					       f_800_, f_814_, f_797_, f_816_);
				    f_795_ += f_811_;
				    f_794_ += f_810_;
				    f_800_ += f_815_;
				    f_797_ += f_817_;
				    f_791_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_792_ >= 0.0F) {
				    method3347(bool_789_, bool_790_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_791_, 0, 0,
					       (int) f_793_, (int) f_794_,
					       f_800_, f_814_, f_797_, f_816_);
				    f_793_ += f_812_;
				    f_794_ += f_810_;
				    f_800_ += f_815_;
				    f_797_ += f_817_;
				    f_791_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f_791_ += 0.5F;
				f += 0.5F;
				f_792_ = (float) (int) (f_792_ + 0.5F) - f;
				f -= f_791_;
				f_791_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_791_]);
				while (--f >= 0.0F) {
				    method3347(bool_789_, bool_790_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_791_, 0, 0,
					       (int) f_794_, (int) f_795_,
					       f_800_, f_814_, f_797_, f_816_);
				    f_795_ += f_811_;
				    f_794_ += f_810_;
				    f_800_ += f_815_;
				    f_797_ += f_817_;
				    f_791_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_792_ >= 0.0F) {
				    method3347(bool_789_, bool_790_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_791_, 0, 0,
					       (int) f_794_, (int) f_793_,
					       f_800_, f_814_, f_797_, f_816_);
				    f_793_ += f_812_;
				    f_794_ += f_810_;
				    f_800_ += f_815_;
				    f_797_ += f_817_;
				    f_791_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			}
		    }
		} else if (!(f_792_ >= (float) ((Class155_Backup) this).anInt1726)) {
		    if (f > (float) ((Class155_Backup) this).anInt1726)
			f = (float) ((Class155_Backup) this).anInt1726;
		    if (f_791_ > (float) ((Class155_Backup) this).anInt1726)
			f_791_ = (float) ((Class155_Backup) this).anInt1726;
		    f_801_ = f_801_ - f_814_ * f_795_ + f_814_;
		    f_798_ = f_798_ - f_816_ * f_795_ + f_816_;
		    if (f < f_791_) {
			f_794_ = f_795_;
			if (f_792_ < 0.0F) {
			    f_794_ -= f_810_ * f_792_;
			    f_795_ -= f_812_ * f_792_;
			    f_801_ -= f_815_ * f_792_;
			    f_798_ -= f_817_ * f_792_;
			    f_792_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_793_ -= f_811_ * f;
			    f = 0.0F;
			}
			if (f_810_ < f_812_) {
			    f_792_ += 0.5F;
			    f += 0.5F;
			    f_791_ = (float) (int) (f_791_ + 0.5F) - f;
			    f -= f_792_;
			    f_792_ = (float) (((Class155_Backup) this).anIntArray1730
					      [(int) f_792_]);
			    while (--f >= 0.0F) {
				method3347(bool_789_, bool_790_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_792_, 0, 0, (int) f_794_,
					   (int) f_795_, f_801_, f_814_,
					   f_798_, f_816_);
				f_794_ += f_810_;
				f_795_ += f_812_;
				f_801_ += f_815_;
				f_798_ += f_817_;
				f_792_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f_791_ >= 0.0F) {
				method3347(bool_789_, bool_790_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_792_, 0, 0, (int) f_794_,
					   (int) f_793_, f_801_, f_814_,
					   f_798_, f_816_);
				f_794_ += f_810_;
				f_793_ += f_811_;
				f_801_ += f_815_;
				f_798_ += f_817_;
				f_792_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			} else {
			    f_792_ += 0.5F;
			    f += 0.5F;
			    f_791_ = (float) (int) (f_791_ + 0.5F) - f;
			    f -= f_792_;
			    f_792_ = (float) (((Class155_Backup) this).anIntArray1730
					      [(int) f_792_]);
			    while (--f >= 0.0F) {
				method3347(bool_789_, bool_790_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_792_, 0, 0, (int) f_795_,
					   (int) f_794_, f_801_, f_814_,
					   f_798_, f_816_);
				f_794_ += f_810_;
				f_795_ += f_812_;
				f_801_ += f_815_;
				f_798_ += f_817_;
				f_792_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f_791_ >= 0.0F) {
				method3347(bool_789_, bool_790_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_792_, 0, 0, (int) f_793_,
					   (int) f_794_, f_801_, f_814_,
					   f_798_, f_816_);
				f_794_ += f_810_;
				f_793_ += f_811_;
				f_801_ += f_815_;
				f_798_ += f_817_;
				f_792_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			}
		    } else {
			f_793_ = f_795_;
			if (f_792_ < 0.0F) {
			    f_793_ -= f_810_ * f_792_;
			    f_795_ -= f_812_ * f_792_;
			    f_801_ -= f_815_ * f_792_;
			    f_798_ -= f_817_ * f_792_;
			    f_792_ = 0.0F;
			}
			if (f_791_ < 0.0F) {
			    f_794_ -= f_811_ * f_791_;
			    f_791_ = 0.0F;
			}
			if (f_810_ < f_812_) {
			    f_792_ += 0.5F;
			    f_791_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_791_;
			    f_791_ -= f_792_;
			    f_792_ = (float) (((Class155_Backup) this).anIntArray1730
					      [(int) f_792_]);
			    while (--f_791_ >= 0.0F) {
				method3347(bool_789_, bool_790_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_792_, 0, 0, (int) f_793_,
					   (int) f_795_, f_801_, f_814_,
					   f_798_, f_816_);
				f_793_ += f_810_;
				f_795_ += f_812_;
				f_801_ += f_815_;
				f_798_ += f_817_;
				f_792_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f >= 0.0F) {
				method3347(bool_789_, bool_790_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_792_, 0, 0, (int) f_794_,
					   (int) f_795_, f_801_, f_814_,
					   f_798_, f_816_);
				f_794_ += f_811_;
				f_795_ += f_812_;
				f_801_ += f_815_;
				f_798_ += f_817_;
				f_792_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			} else {
			    f_792_ += 0.5F;
			    f_791_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_791_;
			    f_791_ -= f_792_;
			    f_792_ = (float) (((Class155_Backup) this).anIntArray1730
					      [(int) f_792_]);
			    while (--f_791_ >= 0.0F) {
				method3347(bool_789_, bool_790_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_792_, 0, 0, (int) f_795_,
					   (int) f_793_, f_801_, f_814_,
					   f_798_, f_816_);
				f_793_ += f_810_;
				f_795_ += f_812_;
				f_801_ += f_815_;
				f_798_ += f_817_;
				f_792_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f >= 0.0F) {
				method3347(bool_789_, bool_790_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_792_, 0, 0, (int) f_795_,
					   (int) f_794_, f_801_, f_814_,
					   f_798_, f_816_);
				f_794_ += f_811_;
				f_795_ += f_812_;
				f_801_ += f_815_;
				f_798_ += f_817_;
				f_792_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method3363(boolean bool, boolean bool_818_, int[] is, int i,
			  int i_819_, int i_820_, int i_821_, int i_822_,
			  float f, float f_823_, float f_824_, float f_825_) {
	if (((Class155_Backup) this).aBool1748) {
	    if (i_822_ > ((Class155_Backup) this).anInt1733)
		i_822_ = ((Class155_Backup) this).anInt1733;
	    if (i_821_ < 0)
		i_821_ = 0;
	}
	if (i_821_ < i_822_) {
	    i += i_821_ - 1;
	    f += f_823_ * (float) i_821_;
	    f_824_ += f_825_ * (float) i_821_;
	    if (((Class189) ((Class155_Backup) this).aClass189_1736).aBool2220) {
		if (((Class155_Backup) this).aBool1721) {
		    i_820_ = i_822_ - i_821_ >> 2;
		    f_823_ *= 4.0F;
		    if (((Class155_Backup) this).anInt1723 == 0) {
			if (i_820_ > 0) {
			    do {
				i_819_ = (Class474.anIntArray6382
					  [(int) f & 0xffff]);
				f += f_823_;
				i++;
				if (!bool || f_824_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    is[i] = i_819_;
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_824_;
				}
				f_824_ += f_825_;
				i++;
				if (!bool || f_824_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    is[i] = i_819_;
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_824_;
				}
				f_824_ += f_825_;
				i++;
				if (!bool || f_824_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    is[i] = i_819_;
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_824_;
				}
				f_824_ += f_825_;
				i++;
				if (!bool || f_824_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    is[i] = i_819_;
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_824_;
				}
				f_824_ += f_825_;
			    } while (--i_820_ > 0);
			}
			i_820_ = i_822_ - i_821_ & 0x3;
			if (i_820_ > 0) {
			    i_819_ = Class474.anIntArray6382[(int) f & 0xffff];
			    do {
				i++;
				if (!bool || f_824_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    is[i] = i_819_;
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_824_;
				}
				f_824_ += f_825_;
			    } while (--i_820_ > 0);
			}
		    } else {
			int i_826_ = ((Class155_Backup) this).anInt1723;
			int i_827_ = 256 - ((Class155_Backup) this).anInt1723;
			if (i_820_ > 0) {
			    do {
				i_819_ = (Class474.anIntArray6382
					  [(int) f & 0xffff]);
				f += f_823_;
				i_819_ = (((i_819_ & 0xff00ff) * i_827_ >> 8
					   & 0xff00ff)
					  + ((i_819_ & 0xff00) * i_827_ >> 8
					     & 0xff00));
				i++;
				if (!bool || f_824_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    int i_828_ = is[i];
				    if (bool_818_)
					is[i] = ((i_827_ | i_828_ >> 24) << 24
						 | (i_819_
						    + (((i_828_ & 0xff00ff)
							* i_826_) >> 8
						       & 0xff00ff)
						    + (((i_828_ & 0xff00)
							* i_826_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_819_
					       + (((i_828_ & 0xff00ff) * i_826_
						   >> 8)
						  & 0xff00ff)
					       + (((i_828_ & 0xff00) * i_826_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_824_;
				}
				f_824_ += f_825_;
				i++;
				if (!bool || f_824_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    int i_829_ = is[i];
				    if (bool_818_)
					is[i] = ((i_827_ | i_829_ >> 24) << 24
						 | (i_819_
						    + (((i_829_ & 0xff00ff)
							* i_826_) >> 8
						       & 0xff00ff)
						    + (((i_829_ & 0xff00)
							* i_826_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_819_
					       + (((i_829_ & 0xff00ff) * i_826_
						   >> 8)
						  & 0xff00ff)
					       + (((i_829_ & 0xff00) * i_826_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_824_;
				}
				f_824_ += f_825_;
				i++;
				if (!bool || f_824_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    int i_830_ = is[i];
				    if (bool_818_)
					is[i] = ((i_827_ | i_830_ >> 24) << 24
						 | (i_819_
						    + (((i_830_ & 0xff00ff)
							* i_826_) >> 8
						       & 0xff00ff)
						    + (((i_830_ & 0xff00)
							* i_826_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_819_
					       + (((i_830_ & 0xff00ff) * i_826_
						   >> 8)
						  & 0xff00ff)
					       + (((i_830_ & 0xff00) * i_826_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_824_;
				}
				f_824_ += f_825_;
				i++;
				if (!bool || f_824_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    int i_831_ = is[i];
				    if (bool_818_)
					is[i] = ((i_827_ | i_831_ >> 24) << 24
						 | (i_819_
						    + (((i_831_ & 0xff00ff)
							* i_826_) >> 8
						       & 0xff00ff)
						    + (((i_831_ & 0xff00)
							* i_826_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_819_
					       + (((i_831_ & 0xff00ff) * i_826_
						   >> 8)
						  & 0xff00ff)
					       + (((i_831_ & 0xff00) * i_826_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_824_;
				}
				f_824_ += f_825_;
			    } while (--i_820_ > 0);
			}
			i_820_ = i_822_ - i_821_ & 0x3;
			if (i_820_ > 0) {
			    i_819_ = Class474.anIntArray6382[(int) f & 0xffff];
			    i_819_ = (((i_819_ & 0xff00ff) * i_827_ >> 8
				       & 0xff00ff)
				      + ((i_819_ & 0xff00) * i_827_ >> 8
					 & 0xff00));
			    do {
				i++;
				if (!bool || f_824_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    int i_832_ = is[i];
				    if (bool_818_)
					is[i] = ((i_827_ | i_832_ >> 24) << 24
						 | (i_819_
						    + (((i_832_ & 0xff00ff)
							* i_826_) >> 8
						       & 0xff00ff)
						    + (((i_832_ & 0xff00)
							* i_826_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_819_
					       + (((i_832_ & 0xff00ff) * i_826_
						   >> 8)
						  & 0xff00ff)
					       + (((i_832_ & 0xff00) * i_826_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_824_;
				}
				f_824_ += f_825_;
			    } while (--i_820_ > 0);
			}
		    }
		} else {
		    i_820_ = i_822_ - i_821_;
		    if (((Class155_Backup) this).anInt1723 == 0) {
			do {
			    i++;
			    if (!bool || f_824_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				is[i] = (Class474.anIntArray6382
					 [(int) f & 0xffff]);
				if (bool)
				    ((Class155_Backup) this).aFloatArray1739[i]
					= f_824_;
			    }
			    f_824_ += f_825_;
			    f += f_823_;
			} while (--i_820_ > 0);
		    } else {
			int i_833_ = ((Class155_Backup) this).anInt1723;
			int i_834_ = 256 - ((Class155_Backup) this).anInt1723;
			do {
			    i++;
			    if (!bool || f_824_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				i_819_ = (Class474.anIntArray6382
					  [(int) f & 0xffff]);
				i_819_ = (((i_819_ & 0xff00ff) * i_834_ >> 8
					   & 0xff00ff)
					  + ((i_819_ & 0xff00) * i_834_ >> 8
					     & 0xff00));
				int i_835_ = is[i];
				if (bool_818_)
				    is[i]
					= ((i_834_ | i_835_ >> 24) << 24
					   | (i_819_
					      + (((i_835_ & 0xff00ff) * i_833_
						  >> 8)
						 & 0xff00ff)
					      + (((i_835_ & 0xff00) * i_833_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_819_
					   + ((i_835_ & 0xff00ff) * i_833_ >> 8
					      & 0xff00ff)
					   + ((i_835_ & 0xff00) * i_833_ >> 8
					      & 0xff00));
				if (bool)
				    ((Class155_Backup) this).aFloatArray1739[i]
					= f_824_;
			    }
			    f += f_823_;
			    f_824_ += f_825_;
			} while (--i_820_ > 0);
		    }
		}
	    } else if (((Class155_Backup) this).aBool1721) {
		i_820_ = i_822_ - i_821_ >> 2;
		f_823_ *= 4.0F;
		if (((Class155_Backup) this).anInt1723 == 0) {
		    if (i_820_ > 0) {
			do {
			    i_819_ = Class474.anIntArray6382[(int) f & 0xffff];
			    f += f_823_;
			    i++;
			    if (!bool || f_824_ < (((Class155_Backup) this)
						   .aFloatArray1739[i]))
				is[i] = i_819_;
			    f_824_ += f_825_;
			    i++;
			    if (!bool || f_824_ < (((Class155_Backup) this)
						   .aFloatArray1739[i]))
				is[i] = i_819_;
			    f_824_ += f_825_;
			    i++;
			    if (!bool || f_824_ < (((Class155_Backup) this)
						   .aFloatArray1739[i]))
				is[i] = i_819_;
			    f_824_ += f_825_;
			    i++;
			    if (!bool || f_824_ < (((Class155_Backup) this)
						   .aFloatArray1739[i]))
				is[i] = i_819_;
			    f_824_ += f_825_;
			} while (--i_820_ > 0);
		    }
		    i_820_ = i_822_ - i_821_ & 0x3;
		    if (i_820_ > 0) {
			i_819_ = Class474.anIntArray6382[(int) f & 0xffff];
			do {
			    i++;
			    if (!bool || f_824_ < (((Class155_Backup) this)
						   .aFloatArray1739[i]))
				is[i] = i_819_;
			    f_824_ += f_825_;
			} while (--i_820_ > 0);
		    }
		} else {
		    int i_836_ = ((Class155_Backup) this).anInt1723;
		    int i_837_ = 256 - ((Class155_Backup) this).anInt1723;
		    if (i_820_ > 0) {
			do {
			    i_819_ = Class474.anIntArray6382[(int) f & 0xffff];
			    f += f_823_;
			    i_819_ = (((i_819_ & 0xff00ff) * i_837_ >> 8
				       & 0xff00ff)
				      + ((i_819_ & 0xff00) * i_837_ >> 8
					 & 0xff00));
			    i++;
			    if (!bool || f_824_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				int i_838_ = is[i];
				if (bool_818_)
				    is[i]
					= ((i_837_ | i_838_ >> 24) << 24
					   | (i_819_
					      + (((i_838_ & 0xff00ff) * i_836_
						  >> 8)
						 & 0xff00ff)
					      + (((i_838_ & 0xff00) * i_836_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_819_
					   + ((i_838_ & 0xff00ff) * i_836_ >> 8
					      & 0xff00ff)
					   + ((i_838_ & 0xff00) * i_836_ >> 8
					      & 0xff00));
			    }
			    f_824_ += f_825_;
			    i++;
			    if (!bool || f_824_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				int i_839_ = is[i];
				if (bool_818_)
				    is[i]
					= ((i_837_ | i_839_ >> 24) << 24
					   | (i_819_
					      + (((i_839_ & 0xff00ff) * i_836_
						  >> 8)
						 & 0xff00ff)
					      + (((i_839_ & 0xff00) * i_836_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_819_
					   + ((i_839_ & 0xff00ff) * i_836_ >> 8
					      & 0xff00ff)
					   + ((i_839_ & 0xff00) * i_836_ >> 8
					      & 0xff00));
			    }
			    f_824_ += f_825_;
			    i++;
			    if (!bool || f_824_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				int i_840_ = is[i];
				if (bool_818_)
				    is[i]
					= ((i_837_ | i_840_ >> 24) << 24
					   | (i_819_
					      + (((i_840_ & 0xff00ff) * i_836_
						  >> 8)
						 & 0xff00ff)
					      + (((i_840_ & 0xff00) * i_836_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_819_
					   + ((i_840_ & 0xff00ff) * i_836_ >> 8
					      & 0xff00ff)
					   + ((i_840_ & 0xff00) * i_836_ >> 8
					      & 0xff00));
			    }
			    f_824_ += f_825_;
			    i++;
			    if (!bool || f_824_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				int i_841_ = is[i];
				if (bool_818_)
				    is[i]
					= ((i_837_ | i_841_ >> 24) << 24
					   | (i_819_
					      + (((i_841_ & 0xff00ff) * i_836_
						  >> 8)
						 & 0xff00ff)
					      + (((i_841_ & 0xff00) * i_836_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_819_
					   + ((i_841_ & 0xff00ff) * i_836_ >> 8
					      & 0xff00ff)
					   + ((i_841_ & 0xff00) * i_836_ >> 8
					      & 0xff00));
			    }
			    f_824_ += f_825_;
			} while (--i_820_ > 0);
		    }
		    i_820_ = i_822_ - i_821_ & 0x3;
		    if (i_820_ > 0) {
			i_819_ = Class474.anIntArray6382[(int) f & 0xffff];
			i_819_
			    = (((i_819_ & 0xff00ff) * i_837_ >> 8 & 0xff00ff)
			       + ((i_819_ & 0xff00) * i_837_ >> 8 & 0xff00));
			do {
			    i++;
			    if (!bool || f_824_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				int i_842_ = is[i];
				if (bool_818_)
				    is[i]
					= ((i_837_ | i_842_ >> 24) << 24
					   | (i_819_
					      + (((i_842_ & 0xff00ff) * i_836_
						  >> 8)
						 & 0xff00ff)
					      + (((i_842_ & 0xff00) * i_836_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_819_
					   + ((i_842_ & 0xff00ff) * i_836_ >> 8
					      & 0xff00ff)
					   + ((i_842_ & 0xff00) * i_836_ >> 8
					      & 0xff00));
			    }
			    f_824_ += f_825_;
			} while (--i_820_ > 0);
		    }
		}
	    } else {
		i_820_ = i_822_ - i_821_;
		if (((Class155_Backup) this).anInt1723 == 0) {
		    do {
			i++;
			if (!bool
			    || f_824_ < ((Class155_Backup) this).aFloatArray1739[i])
			    is[i] = Class474.anIntArray6382[(int) f & 0xffff];
			f_824_ += f_825_;
			f += f_823_;
		    } while (--i_820_ > 0);
		} else {
		    int i_843_ = ((Class155_Backup) this).anInt1723;
		    int i_844_ = 256 - ((Class155_Backup) this).anInt1723;
		    do {
			i++;
			if (!bool
			    || f_824_ < ((Class155_Backup) this).aFloatArray1739[i]) {
			    i_819_ = Class474.anIntArray6382[(int) f & 0xffff];
			    i_819_ = (((i_819_ & 0xff00ff) * i_844_ >> 8
				       & 0xff00ff)
				      + ((i_819_ & 0xff00) * i_844_ >> 8
					 & 0xff00));
			    int i_845_ = is[i];
			    if (bool_818_)
				is[i]
				    = ((i_844_ | i_845_ >> 24) << 24
				       | (i_819_
					  + ((i_845_ & 0xff00ff) * i_843_ >> 8
					     & 0xff00ff)
					  + ((i_845_ & 0xff00) * i_843_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_819_
					 + ((i_845_ & 0xff00ff) * i_843_ >> 8
					    & 0xff00ff)
					 + ((i_845_ & 0xff00) * i_843_ >> 8
					    & 0xff00));
			}
			f += f_823_;
			f_824_ += f_825_;
		    } while (--i_820_ > 0);
		}
	    }
	}
    }
    
    final void method3364(boolean bool, boolean bool_846_, int[] is, int i,
			  int i_847_, int i_848_, int i_849_, int i_850_,
			  float f, float f_851_, float f_852_, float f_853_) {
	if (((Class155_Backup) this).aBool1748) {
	    if (i_850_ > ((Class155_Backup) this).anInt1733)
		i_850_ = ((Class155_Backup) this).anInt1733;
	    if (i_849_ < 0)
		i_849_ = 0;
	}
	if (i_849_ < i_850_) {
	    i += i_849_ - 1;
	    f += f_851_ * (float) i_849_;
	    f_852_ += f_853_ * (float) i_849_;
	    if (((Class189) ((Class155_Backup) this).aClass189_1736).aBool2220) {
		if (((Class155_Backup) this).aBool1721) {
		    i_848_ = i_850_ - i_849_ >> 2;
		    f_851_ *= 4.0F;
		    if (((Class155_Backup) this).anInt1723 == 0) {
			if (i_848_ > 0) {
			    do {
				i_847_ = (Class474.anIntArray6382
					  [(int) f & 0xffff]);
				f += f_851_;
				i++;
				if (!bool || f_852_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    is[i] = i_847_;
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_852_;
				}
				f_852_ += f_853_;
				i++;
				if (!bool || f_852_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    is[i] = i_847_;
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_852_;
				}
				f_852_ += f_853_;
				i++;
				if (!bool || f_852_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    is[i] = i_847_;
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_852_;
				}
				f_852_ += f_853_;
				i++;
				if (!bool || f_852_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    is[i] = i_847_;
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_852_;
				}
				f_852_ += f_853_;
			    } while (--i_848_ > 0);
			}
			i_848_ = i_850_ - i_849_ & 0x3;
			if (i_848_ > 0) {
			    i_847_ = Class474.anIntArray6382[(int) f & 0xffff];
			    do {
				i++;
				if (!bool || f_852_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    is[i] = i_847_;
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_852_;
				}
				f_852_ += f_853_;
			    } while (--i_848_ > 0);
			}
		    } else {
			int i_854_ = ((Class155_Backup) this).anInt1723;
			int i_855_ = 256 - ((Class155_Backup) this).anInt1723;
			if (i_848_ > 0) {
			    do {
				i_847_ = (Class474.anIntArray6382
					  [(int) f & 0xffff]);
				f += f_851_;
				i_847_ = (((i_847_ & 0xff00ff) * i_855_ >> 8
					   & 0xff00ff)
					  + ((i_847_ & 0xff00) * i_855_ >> 8
					     & 0xff00));
				i++;
				if (!bool || f_852_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    int i_856_ = is[i];
				    if (bool_846_)
					is[i] = ((i_855_ | i_856_ >> 24) << 24
						 | (i_847_
						    + (((i_856_ & 0xff00ff)
							* i_854_) >> 8
						       & 0xff00ff)
						    + (((i_856_ & 0xff00)
							* i_854_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_847_
					       + (((i_856_ & 0xff00ff) * i_854_
						   >> 8)
						  & 0xff00ff)
					       + (((i_856_ & 0xff00) * i_854_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_852_;
				}
				f_852_ += f_853_;
				i++;
				if (!bool || f_852_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    int i_857_ = is[i];
				    if (bool_846_)
					is[i] = ((i_855_ | i_857_ >> 24) << 24
						 | (i_847_
						    + (((i_857_ & 0xff00ff)
							* i_854_) >> 8
						       & 0xff00ff)
						    + (((i_857_ & 0xff00)
							* i_854_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_847_
					       + (((i_857_ & 0xff00ff) * i_854_
						   >> 8)
						  & 0xff00ff)
					       + (((i_857_ & 0xff00) * i_854_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_852_;
				}
				f_852_ += f_853_;
				i++;
				if (!bool || f_852_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    int i_858_ = is[i];
				    if (bool_846_)
					is[i] = ((i_855_ | i_858_ >> 24) << 24
						 | (i_847_
						    + (((i_858_ & 0xff00ff)
							* i_854_) >> 8
						       & 0xff00ff)
						    + (((i_858_ & 0xff00)
							* i_854_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_847_
					       + (((i_858_ & 0xff00ff) * i_854_
						   >> 8)
						  & 0xff00ff)
					       + (((i_858_ & 0xff00) * i_854_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_852_;
				}
				f_852_ += f_853_;
				i++;
				if (!bool || f_852_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    int i_859_ = is[i];
				    if (bool_846_)
					is[i] = ((i_855_ | i_859_ >> 24) << 24
						 | (i_847_
						    + (((i_859_ & 0xff00ff)
							* i_854_) >> 8
						       & 0xff00ff)
						    + (((i_859_ & 0xff00)
							* i_854_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_847_
					       + (((i_859_ & 0xff00ff) * i_854_
						   >> 8)
						  & 0xff00ff)
					       + (((i_859_ & 0xff00) * i_854_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_852_;
				}
				f_852_ += f_853_;
			    } while (--i_848_ > 0);
			}
			i_848_ = i_850_ - i_849_ & 0x3;
			if (i_848_ > 0) {
			    i_847_ = Class474.anIntArray6382[(int) f & 0xffff];
			    i_847_ = (((i_847_ & 0xff00ff) * i_855_ >> 8
				       & 0xff00ff)
				      + ((i_847_ & 0xff00) * i_855_ >> 8
					 & 0xff00));
			    do {
				i++;
				if (!bool || f_852_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    int i_860_ = is[i];
				    if (bool_846_)
					is[i] = ((i_855_ | i_860_ >> 24) << 24
						 | (i_847_
						    + (((i_860_ & 0xff00ff)
							* i_854_) >> 8
						       & 0xff00ff)
						    + (((i_860_ & 0xff00)
							* i_854_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_847_
					       + (((i_860_ & 0xff00ff) * i_854_
						   >> 8)
						  & 0xff00ff)
					       + (((i_860_ & 0xff00) * i_854_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_852_;
				}
				f_852_ += f_853_;
			    } while (--i_848_ > 0);
			}
		    }
		} else {
		    i_848_ = i_850_ - i_849_;
		    if (((Class155_Backup) this).anInt1723 == 0) {
			do {
			    i++;
			    if (!bool || f_852_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				is[i] = (Class474.anIntArray6382
					 [(int) f & 0xffff]);
				if (bool)
				    ((Class155_Backup) this).aFloatArray1739[i]
					= f_852_;
			    }
			    f_852_ += f_853_;
			    f += f_851_;
			} while (--i_848_ > 0);
		    } else {
			int i_861_ = ((Class155_Backup) this).anInt1723;
			int i_862_ = 256 - ((Class155_Backup) this).anInt1723;
			do {
			    i++;
			    if (!bool || f_852_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				i_847_ = (Class474.anIntArray6382
					  [(int) f & 0xffff]);
				i_847_ = (((i_847_ & 0xff00ff) * i_862_ >> 8
					   & 0xff00ff)
					  + ((i_847_ & 0xff00) * i_862_ >> 8
					     & 0xff00));
				int i_863_ = is[i];
				if (bool_846_)
				    is[i]
					= ((i_862_ | i_863_ >> 24) << 24
					   | (i_847_
					      + (((i_863_ & 0xff00ff) * i_861_
						  >> 8)
						 & 0xff00ff)
					      + (((i_863_ & 0xff00) * i_861_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_847_
					   + ((i_863_ & 0xff00ff) * i_861_ >> 8
					      & 0xff00ff)
					   + ((i_863_ & 0xff00) * i_861_ >> 8
					      & 0xff00));
				if (bool)
				    ((Class155_Backup) this).aFloatArray1739[i]
					= f_852_;
			    }
			    f += f_851_;
			    f_852_ += f_853_;
			} while (--i_848_ > 0);
		    }
		}
	    } else if (((Class155_Backup) this).aBool1721) {
		i_848_ = i_850_ - i_849_ >> 2;
		f_851_ *= 4.0F;
		if (((Class155_Backup) this).anInt1723 == 0) {
		    if (i_848_ > 0) {
			do {
			    i_847_ = Class474.anIntArray6382[(int) f & 0xffff];
			    f += f_851_;
			    i++;
			    if (!bool || f_852_ < (((Class155_Backup) this)
						   .aFloatArray1739[i]))
				is[i] = i_847_;
			    f_852_ += f_853_;
			    i++;
			    if (!bool || f_852_ < (((Class155_Backup) this)
						   .aFloatArray1739[i]))
				is[i] = i_847_;
			    f_852_ += f_853_;
			    i++;
			    if (!bool || f_852_ < (((Class155_Backup) this)
						   .aFloatArray1739[i]))
				is[i] = i_847_;
			    f_852_ += f_853_;
			    i++;
			    if (!bool || f_852_ < (((Class155_Backup) this)
						   .aFloatArray1739[i]))
				is[i] = i_847_;
			    f_852_ += f_853_;
			} while (--i_848_ > 0);
		    }
		    i_848_ = i_850_ - i_849_ & 0x3;
		    if (i_848_ > 0) {
			i_847_ = Class474.anIntArray6382[(int) f & 0xffff];
			do {
			    i++;
			    if (!bool || f_852_ < (((Class155_Backup) this)
						   .aFloatArray1739[i]))
				is[i] = i_847_;
			    f_852_ += f_853_;
			} while (--i_848_ > 0);
		    }
		} else {
		    int i_864_ = ((Class155_Backup) this).anInt1723;
		    int i_865_ = 256 - ((Class155_Backup) this).anInt1723;
		    if (i_848_ > 0) {
			do {
			    i_847_ = Class474.anIntArray6382[(int) f & 0xffff];
			    f += f_851_;
			    i_847_ = (((i_847_ & 0xff00ff) * i_865_ >> 8
				       & 0xff00ff)
				      + ((i_847_ & 0xff00) * i_865_ >> 8
					 & 0xff00));
			    i++;
			    if (!bool || f_852_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				int i_866_ = is[i];
				if (bool_846_)
				    is[i]
					= ((i_865_ | i_866_ >> 24) << 24
					   | (i_847_
					      + (((i_866_ & 0xff00ff) * i_864_
						  >> 8)
						 & 0xff00ff)
					      + (((i_866_ & 0xff00) * i_864_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_847_
					   + ((i_866_ & 0xff00ff) * i_864_ >> 8
					      & 0xff00ff)
					   + ((i_866_ & 0xff00) * i_864_ >> 8
					      & 0xff00));
			    }
			    f_852_ += f_853_;
			    i++;
			    if (!bool || f_852_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				int i_867_ = is[i];
				if (bool_846_)
				    is[i]
					= ((i_865_ | i_867_ >> 24) << 24
					   | (i_847_
					      + (((i_867_ & 0xff00ff) * i_864_
						  >> 8)
						 & 0xff00ff)
					      + (((i_867_ & 0xff00) * i_864_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_847_
					   + ((i_867_ & 0xff00ff) * i_864_ >> 8
					      & 0xff00ff)
					   + ((i_867_ & 0xff00) * i_864_ >> 8
					      & 0xff00));
			    }
			    f_852_ += f_853_;
			    i++;
			    if (!bool || f_852_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				int i_868_ = is[i];
				if (bool_846_)
				    is[i]
					= ((i_865_ | i_868_ >> 24) << 24
					   | (i_847_
					      + (((i_868_ & 0xff00ff) * i_864_
						  >> 8)
						 & 0xff00ff)
					      + (((i_868_ & 0xff00) * i_864_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_847_
					   + ((i_868_ & 0xff00ff) * i_864_ >> 8
					      & 0xff00ff)
					   + ((i_868_ & 0xff00) * i_864_ >> 8
					      & 0xff00));
			    }
			    f_852_ += f_853_;
			    i++;
			    if (!bool || f_852_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				int i_869_ = is[i];
				if (bool_846_)
				    is[i]
					= ((i_865_ | i_869_ >> 24) << 24
					   | (i_847_
					      + (((i_869_ & 0xff00ff) * i_864_
						  >> 8)
						 & 0xff00ff)
					      + (((i_869_ & 0xff00) * i_864_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_847_
					   + ((i_869_ & 0xff00ff) * i_864_ >> 8
					      & 0xff00ff)
					   + ((i_869_ & 0xff00) * i_864_ >> 8
					      & 0xff00));
			    }
			    f_852_ += f_853_;
			} while (--i_848_ > 0);
		    }
		    i_848_ = i_850_ - i_849_ & 0x3;
		    if (i_848_ > 0) {
			i_847_ = Class474.anIntArray6382[(int) f & 0xffff];
			i_847_
			    = (((i_847_ & 0xff00ff) * i_865_ >> 8 & 0xff00ff)
			       + ((i_847_ & 0xff00) * i_865_ >> 8 & 0xff00));
			do {
			    i++;
			    if (!bool || f_852_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				int i_870_ = is[i];
				if (bool_846_)
				    is[i]
					= ((i_865_ | i_870_ >> 24) << 24
					   | (i_847_
					      + (((i_870_ & 0xff00ff) * i_864_
						  >> 8)
						 & 0xff00ff)
					      + (((i_870_ & 0xff00) * i_864_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_847_
					   + ((i_870_ & 0xff00ff) * i_864_ >> 8
					      & 0xff00ff)
					   + ((i_870_ & 0xff00) * i_864_ >> 8
					      & 0xff00));
			    }
			    f_852_ += f_853_;
			} while (--i_848_ > 0);
		    }
		}
	    } else {
		i_848_ = i_850_ - i_849_;
		if (((Class155_Backup) this).anInt1723 == 0) {
		    do {
			i++;
			if (!bool
			    || f_852_ < ((Class155_Backup) this).aFloatArray1739[i])
			    is[i] = Class474.anIntArray6382[(int) f & 0xffff];
			f_852_ += f_853_;
			f += f_851_;
		    } while (--i_848_ > 0);
		} else {
		    int i_871_ = ((Class155_Backup) this).anInt1723;
		    int i_872_ = 256 - ((Class155_Backup) this).anInt1723;
		    do {
			i++;
			if (!bool
			    || f_852_ < ((Class155_Backup) this).aFloatArray1739[i]) {
			    i_847_ = Class474.anIntArray6382[(int) f & 0xffff];
			    i_847_ = (((i_847_ & 0xff00ff) * i_872_ >> 8
				       & 0xff00ff)
				      + ((i_847_ & 0xff00) * i_872_ >> 8
					 & 0xff00));
			    int i_873_ = is[i];
			    if (bool_846_)
				is[i]
				    = ((i_872_ | i_873_ >> 24) << 24
				       | (i_847_
					  + ((i_873_ & 0xff00ff) * i_871_ >> 8
					     & 0xff00ff)
					  + ((i_873_ & 0xff00) * i_871_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_847_
					 + ((i_873_ & 0xff00ff) * i_871_ >> 8
					    & 0xff00ff)
					 + ((i_873_ & 0xff00) * i_871_ >> 8
					    & 0xff00));
			}
			f += f_851_;
			f_852_ += f_853_;
		    } while (--i_848_ > 0);
		}
	    }
	}
    }
    
    final void method3365(boolean bool, boolean bool_874_, int[] is, int i,
			  int i_875_, int i_876_, int i_877_, int i_878_,
			  float f, float f_879_, float f_880_, float f_881_) {
	if (((Class155_Backup) this).aBool1748) {
	    if (i_878_ > ((Class155_Backup) this).anInt1733)
		i_878_ = ((Class155_Backup) this).anInt1733;
	    if (i_877_ < 0)
		i_877_ = 0;
	}
	if (i_877_ < i_878_) {
	    i += i_877_ - 1;
	    f += f_879_ * (float) i_877_;
	    f_880_ += f_881_ * (float) i_877_;
	    if (((Class189) ((Class155_Backup) this).aClass189_1736).aBool2220) {
		if (((Class155_Backup) this).aBool1721) {
		    i_876_ = i_878_ - i_877_ >> 2;
		    f_879_ *= 4.0F;
		    if (((Class155_Backup) this).anInt1723 == 0) {
			if (i_876_ > 0) {
			    do {
				i_875_ = (Class474.anIntArray6382
					  [(int) f & 0xffff]);
				f += f_879_;
				i++;
				if (!bool || f_880_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    is[i] = i_875_;
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_880_;
				}
				f_880_ += f_881_;
				i++;
				if (!bool || f_880_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    is[i] = i_875_;
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_880_;
				}
				f_880_ += f_881_;
				i++;
				if (!bool || f_880_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    is[i] = i_875_;
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_880_;
				}
				f_880_ += f_881_;
				i++;
				if (!bool || f_880_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    is[i] = i_875_;
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_880_;
				}
				f_880_ += f_881_;
			    } while (--i_876_ > 0);
			}
			i_876_ = i_878_ - i_877_ & 0x3;
			if (i_876_ > 0) {
			    i_875_ = Class474.anIntArray6382[(int) f & 0xffff];
			    do {
				i++;
				if (!bool || f_880_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    is[i] = i_875_;
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_880_;
				}
				f_880_ += f_881_;
			    } while (--i_876_ > 0);
			}
		    } else {
			int i_882_ = ((Class155_Backup) this).anInt1723;
			int i_883_ = 256 - ((Class155_Backup) this).anInt1723;
			if (i_876_ > 0) {
			    do {
				i_875_ = (Class474.anIntArray6382
					  [(int) f & 0xffff]);
				f += f_879_;
				i_875_ = (((i_875_ & 0xff00ff) * i_883_ >> 8
					   & 0xff00ff)
					  + ((i_875_ & 0xff00) * i_883_ >> 8
					     & 0xff00));
				i++;
				if (!bool || f_880_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    int i_884_ = is[i];
				    if (bool_874_)
					is[i] = ((i_883_ | i_884_ >> 24) << 24
						 | (i_875_
						    + (((i_884_ & 0xff00ff)
							* i_882_) >> 8
						       & 0xff00ff)
						    + (((i_884_ & 0xff00)
							* i_882_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_875_
					       + (((i_884_ & 0xff00ff) * i_882_
						   >> 8)
						  & 0xff00ff)
					       + (((i_884_ & 0xff00) * i_882_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_880_;
				}
				f_880_ += f_881_;
				i++;
				if (!bool || f_880_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    int i_885_ = is[i];
				    if (bool_874_)
					is[i] = ((i_883_ | i_885_ >> 24) << 24
						 | (i_875_
						    + (((i_885_ & 0xff00ff)
							* i_882_) >> 8
						       & 0xff00ff)
						    + (((i_885_ & 0xff00)
							* i_882_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_875_
					       + (((i_885_ & 0xff00ff) * i_882_
						   >> 8)
						  & 0xff00ff)
					       + (((i_885_ & 0xff00) * i_882_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_880_;
				}
				f_880_ += f_881_;
				i++;
				if (!bool || f_880_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    int i_886_ = is[i];
				    if (bool_874_)
					is[i] = ((i_883_ | i_886_ >> 24) << 24
						 | (i_875_
						    + (((i_886_ & 0xff00ff)
							* i_882_) >> 8
						       & 0xff00ff)
						    + (((i_886_ & 0xff00)
							* i_882_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_875_
					       + (((i_886_ & 0xff00ff) * i_882_
						   >> 8)
						  & 0xff00ff)
					       + (((i_886_ & 0xff00) * i_882_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_880_;
				}
				f_880_ += f_881_;
				i++;
				if (!bool || f_880_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    int i_887_ = is[i];
				    if (bool_874_)
					is[i] = ((i_883_ | i_887_ >> 24) << 24
						 | (i_875_
						    + (((i_887_ & 0xff00ff)
							* i_882_) >> 8
						       & 0xff00ff)
						    + (((i_887_ & 0xff00)
							* i_882_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_875_
					       + (((i_887_ & 0xff00ff) * i_882_
						   >> 8)
						  & 0xff00ff)
					       + (((i_887_ & 0xff00) * i_882_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_880_;
				}
				f_880_ += f_881_;
			    } while (--i_876_ > 0);
			}
			i_876_ = i_878_ - i_877_ & 0x3;
			if (i_876_ > 0) {
			    i_875_ = Class474.anIntArray6382[(int) f & 0xffff];
			    i_875_ = (((i_875_ & 0xff00ff) * i_883_ >> 8
				       & 0xff00ff)
				      + ((i_875_ & 0xff00) * i_883_ >> 8
					 & 0xff00));
			    do {
				i++;
				if (!bool || f_880_ < (((Class155_Backup) this)
						       .aFloatArray1739[i])) {
				    int i_888_ = is[i];
				    if (bool_874_)
					is[i] = ((i_883_ | i_888_ >> 24) << 24
						 | (i_875_
						    + (((i_888_ & 0xff00ff)
							* i_882_) >> 8
						       & 0xff00ff)
						    + (((i_888_ & 0xff00)
							* i_882_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_875_
					       + (((i_888_ & 0xff00ff) * i_882_
						   >> 8)
						  & 0xff00ff)
					       + (((i_888_ & 0xff00) * i_882_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f_880_;
				}
				f_880_ += f_881_;
			    } while (--i_876_ > 0);
			}
		    }
		} else {
		    i_876_ = i_878_ - i_877_;
		    if (((Class155_Backup) this).anInt1723 == 0) {
			do {
			    i++;
			    if (!bool || f_880_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				is[i] = (Class474.anIntArray6382
					 [(int) f & 0xffff]);
				if (bool)
				    ((Class155_Backup) this).aFloatArray1739[i]
					= f_880_;
			    }
			    f_880_ += f_881_;
			    f += f_879_;
			} while (--i_876_ > 0);
		    } else {
			int i_889_ = ((Class155_Backup) this).anInt1723;
			int i_890_ = 256 - ((Class155_Backup) this).anInt1723;
			do {
			    i++;
			    if (!bool || f_880_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				i_875_ = (Class474.anIntArray6382
					  [(int) f & 0xffff]);
				i_875_ = (((i_875_ & 0xff00ff) * i_890_ >> 8
					   & 0xff00ff)
					  + ((i_875_ & 0xff00) * i_890_ >> 8
					     & 0xff00));
				int i_891_ = is[i];
				if (bool_874_)
				    is[i]
					= ((i_890_ | i_891_ >> 24) << 24
					   | (i_875_
					      + (((i_891_ & 0xff00ff) * i_889_
						  >> 8)
						 & 0xff00ff)
					      + (((i_891_ & 0xff00) * i_889_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_875_
					   + ((i_891_ & 0xff00ff) * i_889_ >> 8
					      & 0xff00ff)
					   + ((i_891_ & 0xff00) * i_889_ >> 8
					      & 0xff00));
				if (bool)
				    ((Class155_Backup) this).aFloatArray1739[i]
					= f_880_;
			    }
			    f += f_879_;
			    f_880_ += f_881_;
			} while (--i_876_ > 0);
		    }
		}
	    } else if (((Class155_Backup) this).aBool1721) {
		i_876_ = i_878_ - i_877_ >> 2;
		f_879_ *= 4.0F;
		if (((Class155_Backup) this).anInt1723 == 0) {
		    if (i_876_ > 0) {
			do {
			    i_875_ = Class474.anIntArray6382[(int) f & 0xffff];
			    f += f_879_;
			    i++;
			    if (!bool || f_880_ < (((Class155_Backup) this)
						   .aFloatArray1739[i]))
				is[i] = i_875_;
			    f_880_ += f_881_;
			    i++;
			    if (!bool || f_880_ < (((Class155_Backup) this)
						   .aFloatArray1739[i]))
				is[i] = i_875_;
			    f_880_ += f_881_;
			    i++;
			    if (!bool || f_880_ < (((Class155_Backup) this)
						   .aFloatArray1739[i]))
				is[i] = i_875_;
			    f_880_ += f_881_;
			    i++;
			    if (!bool || f_880_ < (((Class155_Backup) this)
						   .aFloatArray1739[i]))
				is[i] = i_875_;
			    f_880_ += f_881_;
			} while (--i_876_ > 0);
		    }
		    i_876_ = i_878_ - i_877_ & 0x3;
		    if (i_876_ > 0) {
			i_875_ = Class474.anIntArray6382[(int) f & 0xffff];
			do {
			    i++;
			    if (!bool || f_880_ < (((Class155_Backup) this)
						   .aFloatArray1739[i]))
				is[i] = i_875_;
			    f_880_ += f_881_;
			} while (--i_876_ > 0);
		    }
		} else {
		    int i_892_ = ((Class155_Backup) this).anInt1723;
		    int i_893_ = 256 - ((Class155_Backup) this).anInt1723;
		    if (i_876_ > 0) {
			do {
			    i_875_ = Class474.anIntArray6382[(int) f & 0xffff];
			    f += f_879_;
			    i_875_ = (((i_875_ & 0xff00ff) * i_893_ >> 8
				       & 0xff00ff)
				      + ((i_875_ & 0xff00) * i_893_ >> 8
					 & 0xff00));
			    i++;
			    if (!bool || f_880_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				int i_894_ = is[i];
				if (bool_874_)
				    is[i]
					= ((i_893_ | i_894_ >> 24) << 24
					   | (i_875_
					      + (((i_894_ & 0xff00ff) * i_892_
						  >> 8)
						 & 0xff00ff)
					      + (((i_894_ & 0xff00) * i_892_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_875_
					   + ((i_894_ & 0xff00ff) * i_892_ >> 8
					      & 0xff00ff)
					   + ((i_894_ & 0xff00) * i_892_ >> 8
					      & 0xff00));
			    }
			    f_880_ += f_881_;
			    i++;
			    if (!bool || f_880_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				int i_895_ = is[i];
				if (bool_874_)
				    is[i]
					= ((i_893_ | i_895_ >> 24) << 24
					   | (i_875_
					      + (((i_895_ & 0xff00ff) * i_892_
						  >> 8)
						 & 0xff00ff)
					      + (((i_895_ & 0xff00) * i_892_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_875_
					   + ((i_895_ & 0xff00ff) * i_892_ >> 8
					      & 0xff00ff)
					   + ((i_895_ & 0xff00) * i_892_ >> 8
					      & 0xff00));
			    }
			    f_880_ += f_881_;
			    i++;
			    if (!bool || f_880_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				int i_896_ = is[i];
				if (bool_874_)
				    is[i]
					= ((i_893_ | i_896_ >> 24) << 24
					   | (i_875_
					      + (((i_896_ & 0xff00ff) * i_892_
						  >> 8)
						 & 0xff00ff)
					      + (((i_896_ & 0xff00) * i_892_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_875_
					   + ((i_896_ & 0xff00ff) * i_892_ >> 8
					      & 0xff00ff)
					   + ((i_896_ & 0xff00) * i_892_ >> 8
					      & 0xff00));
			    }
			    f_880_ += f_881_;
			    i++;
			    if (!bool || f_880_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				int i_897_ = is[i];
				if (bool_874_)
				    is[i]
					= ((i_893_ | i_897_ >> 24) << 24
					   | (i_875_
					      + (((i_897_ & 0xff00ff) * i_892_
						  >> 8)
						 & 0xff00ff)
					      + (((i_897_ & 0xff00) * i_892_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_875_
					   + ((i_897_ & 0xff00ff) * i_892_ >> 8
					      & 0xff00ff)
					   + ((i_897_ & 0xff00) * i_892_ >> 8
					      & 0xff00));
			    }
			    f_880_ += f_881_;
			} while (--i_876_ > 0);
		    }
		    i_876_ = i_878_ - i_877_ & 0x3;
		    if (i_876_ > 0) {
			i_875_ = Class474.anIntArray6382[(int) f & 0xffff];
			i_875_
			    = (((i_875_ & 0xff00ff) * i_893_ >> 8 & 0xff00ff)
			       + ((i_875_ & 0xff00) * i_893_ >> 8 & 0xff00));
			do {
			    i++;
			    if (!bool || f_880_ < (((Class155_Backup) this)
						   .aFloatArray1739[i])) {
				int i_898_ = is[i];
				if (bool_874_)
				    is[i]
					= ((i_893_ | i_898_ >> 24) << 24
					   | (i_875_
					      + (((i_898_ & 0xff00ff) * i_892_
						  >> 8)
						 & 0xff00ff)
					      + (((i_898_ & 0xff00) * i_892_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_875_
					   + ((i_898_ & 0xff00ff) * i_892_ >> 8
					      & 0xff00ff)
					   + ((i_898_ & 0xff00) * i_892_ >> 8
					      & 0xff00));
			    }
			    f_880_ += f_881_;
			} while (--i_876_ > 0);
		    }
		}
	    } else {
		i_876_ = i_878_ - i_877_;
		if (((Class155_Backup) this).anInt1723 == 0) {
		    do {
			i++;
			if (!bool
			    || f_880_ < ((Class155_Backup) this).aFloatArray1739[i])
			    is[i] = Class474.anIntArray6382[(int) f & 0xffff];
			f_880_ += f_881_;
			f += f_879_;
		    } while (--i_876_ > 0);
		} else {
		    int i_899_ = ((Class155_Backup) this).anInt1723;
		    int i_900_ = 256 - ((Class155_Backup) this).anInt1723;
		    do {
			i++;
			if (!bool
			    || f_880_ < ((Class155_Backup) this).aFloatArray1739[i]) {
			    i_875_ = Class474.anIntArray6382[(int) f & 0xffff];
			    i_875_ = (((i_875_ & 0xff00ff) * i_900_ >> 8
				       & 0xff00ff)
				      + ((i_875_ & 0xff00) * i_900_ >> 8
					 & 0xff00));
			    int i_901_ = is[i];
			    if (bool_874_)
				is[i]
				    = ((i_900_ | i_901_ >> 24) << 24
				       | (i_875_
					  + ((i_901_ & 0xff00ff) * i_899_ >> 8
					     & 0xff00ff)
					  + ((i_901_ & 0xff00) * i_899_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_875_
					 + ((i_901_ & 0xff00ff) * i_899_ >> 8
					    & 0xff00ff)
					 + ((i_901_ & 0xff00) * i_899_ >> 8
					    & 0xff00));
			}
			f += f_879_;
			f_880_ += f_881_;
		    } while (--i_876_ > 0);
		}
	    }
	}
    }
    
    final void method3366(boolean bool, boolean bool_902_, boolean bool_903_,
			  float f, float f_904_, float f_905_, float f_906_,
			  float f_907_, float f_908_, float f_909_,
			  float f_910_, float f_911_, int i, int i_912_,
			  int i_913_) {
	if (!bool)
	    method3377(false, bool_902_, bool_903_, f, f_904_, f_905_, f_906_,
		       f_907_, f_908_, f_909_, f_910_, f_911_, 0);
	else if (((Class155_Backup) this).aBool1724) {
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517((int) f_906_,
							     (int) f,
							     (int) f_907_,
							     (int) f_904_,
							     ~0xffffff | i,
							     223909001);
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517((int) f_907_,
							     (int) f_904_,
							     (int) f_908_,
							     (int) f_905_,
							     ~0xffffff | i,
							     223909001);
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517((int) f_908_,
							     (int) f_905_,
							     (int) f_906_,
							     (int) f,
							     ~0xffffff | i,
							     223909001);
	} else {
	    float f_914_ = f_907_ - f_906_;
	    float f_915_ = f_904_ - f;
	    float f_916_ = f_908_ - f_906_;
	    float f_917_ = f_905_ - f;
	    float f_918_ = f_910_ - f_909_;
	    float f_919_ = f_911_ - f_909_;
	    float f_920_ = (float) ((i_912_ & 0xff0000) - (i & 0xff0000));
	    float f_921_ = (float) ((i_913_ & 0xff0000) - (i & 0xff0000));
	    float f_922_ = (float) ((i_912_ & 0xff00) - (i & 0xff00));
	    float f_923_ = (float) ((i_913_ & 0xff00) - (i & 0xff00));
	    float f_924_ = (float) ((i_912_ & 0xff) - (i & 0xff));
	    float f_925_ = (float) ((i_913_ & 0xff) - (i & 0xff));
	    float f_926_;
	    if (f_905_ != f_904_)
		f_926_ = (f_908_ - f_907_) / (f_905_ - f_904_);
	    else
		f_926_ = 0.0F;
	    float f_927_;
	    if (f_904_ != f)
		f_927_ = f_914_ / f_915_;
	    else
		f_927_ = 0.0F;
	    float f_928_;
	    if (f_905_ != f)
		f_928_ = f_916_ / f_917_;
	    else
		f_928_ = 0.0F;
	    float f_929_ = f_914_ * f_917_ - f_916_ * f_915_;
	    if (f_929_ != 0.0F) {
		float f_930_ = (f_918_ * f_917_ - f_919_ * f_915_) / f_929_;
		float f_931_ = (f_919_ * f_914_ - f_918_ * f_916_) / f_929_;
		float f_932_ = (f_920_ * f_917_ - f_921_ * f_915_) / f_929_;
		float f_933_ = (f_921_ * f_914_ - f_920_ * f_916_) / f_929_;
		float f_934_ = (f_922_ * f_917_ - f_923_ * f_915_) / f_929_;
		float f_935_ = (f_923_ * f_914_ - f_922_ * f_916_) / f_929_;
		float f_936_ = (f_924_ * f_917_ - f_925_ * f_915_) / f_929_;
		float f_937_ = (f_925_ * f_914_ - f_924_ * f_916_) / f_929_;
		if (f <= f_904_ && f <= f_905_) {
		    if (!(f >= (float) ((Class155_Backup) this).anInt1726)) {
			if (f_904_ > (float) ((Class155_Backup) this).anInt1726)
			    f_904_ = (float) ((Class155_Backup) this).anInt1726;
			if (f_905_ > (float) ((Class155_Backup) this).anInt1726)
			    f_905_ = (float) ((Class155_Backup) this).anInt1726;
			f_909_ = f_909_ - f_930_ * f_906_ + f_930_;
			float f_938_ = ((float) (i & 0xff0000)
					- f_932_ * f_906_ + f_932_);
			float f_939_
			    = (float) (i & 0xff00) - f_934_ * f_906_ + f_934_;
			float f_940_
			    = (float) (i & 0xff) - f_936_ * f_906_ + f_936_;
			if (f_904_ < f_905_) {
			    f_908_ = f_906_;
			    if (f < 0.0F) {
				f_908_ -= f_928_ * f;
				f_906_ -= f_927_ * f;
				f_909_ -= f_931_ * f;
				f_938_ -= f_933_ * f;
				f_939_ -= f_935_ * f;
				f_940_ -= f_937_ * f;
				f = 0.0F;
			    }
			    if (f_904_ < 0.0F) {
				f_907_ -= f_926_ * f_904_;
				f_904_ = 0.0F;
			    }
			    if (f != f_904_ && f_928_ < f_927_
				|| f == f_904_ && f_928_ > f_926_) {
				f += 0.5F;
				f_904_ += 0.5F;
				f_905_
				    = (float) (int) (f_905_ + 0.5F) - f_904_;
				f_904_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_904_ >= 0.0F) {
				    method3349(bool_902_, bool_903_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_908_,
					       (int) f_906_, f_909_, f_930_,
					       f_938_, f_932_, f_939_, f_934_,
					       f_940_, f_936_);
				    f_908_ += f_928_;
				    f_906_ += f_927_;
				    f_909_ += f_931_;
				    f_938_ += f_933_;
				    f_939_ += f_935_;
				    f_940_ += f_937_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_905_ >= 0.0F) {
				    method3349(bool_902_, bool_903_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_908_,
					       (int) f_907_, f_909_, f_930_,
					       f_938_, f_932_, f_939_, f_934_,
					       f_940_, f_936_);
				    f_908_ += f_928_;
				    f_907_ += f_926_;
				    f_909_ += f_931_;
				    f_938_ += f_933_;
				    f_939_ += f_935_;
				    f_940_ += f_937_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f += 0.5F;
				f_904_ += 0.5F;
				f_905_
				    = (float) (int) (f_905_ + 0.5F) - f_904_;
				f_904_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_904_ >= 0.0F) {
				    method3349(bool_902_, bool_903_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_906_,
					       (int) f_908_, f_909_, f_930_,
					       f_938_, f_932_, f_939_, f_934_,
					       f_940_, f_936_);
				    f_908_ += f_928_;
				    f_906_ += f_927_;
				    f_909_ += f_931_;
				    f_938_ += f_933_;
				    f_939_ += f_935_;
				    f_940_ += f_937_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_905_ >= 0.0F) {
				    method3349(bool_902_, bool_903_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_907_,
					       (int) f_908_, f_909_, f_930_,
					       f_938_, f_932_, f_939_, f_934_,
					       f_940_, f_936_);
				    f_908_ += f_928_;
				    f_907_ += f_926_;
				    f_909_ += f_931_;
				    f_938_ += f_933_;
				    f_939_ += f_935_;
				    f_940_ += f_937_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			} else {
			    f_907_ = f_906_;
			    if (f < 0.0F) {
				f_907_ -= f_928_ * f;
				f_906_ -= f_927_ * f;
				f_909_ -= f_931_ * f;
				f_938_ -= f_933_ * f;
				f_939_ -= f_935_ * f;
				f_940_ -= f_937_ * f;
				f = 0.0F;
			    }
			    if (f_905_ < 0.0F) {
				f_908_ -= f_926_ * f_905_;
				f_905_ = 0.0F;
			    }
			    if (f != f_905_ && f_928_ < f_927_
				|| f == f_905_ && f_926_ > f_927_) {
				f += 0.5F;
				f_905_ += 0.5F;
				f_904_
				    = (float) (int) (f_904_ + 0.5F) - f_905_;
				f_905_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_905_ >= 0.0F) {
				    method3349(bool_902_, bool_903_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_907_,
					       (int) f_906_, f_909_, f_930_,
					       f_938_, f_932_, f_939_, f_934_,
					       f_940_, f_936_);
				    f_907_ += f_928_;
				    f_906_ += f_927_;
				    f_909_ += f_931_;
				    f_938_ += f_933_;
				    f_939_ += f_935_;
				    f_940_ += f_937_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_904_ >= 0.0F) {
				    method3349(bool_902_, bool_903_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_908_,
					       (int) f_906_, f_909_, f_930_,
					       f_938_, f_932_, f_939_, f_934_,
					       f_940_, f_936_);
				    f_908_ += f_926_;
				    f_906_ += f_927_;
				    f_909_ += f_931_;
				    f_938_ += f_933_;
				    f_939_ += f_935_;
				    f_940_ += f_937_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f += 0.5F;
				f_905_ += 0.5F;
				f_904_
				    = (float) (int) (f_904_ + 0.5F) - f_905_;
				f_905_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_905_ >= 0.0F) {
				    method3349(bool_902_, bool_903_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_906_,
					       (int) f_907_, f_909_, f_930_,
					       f_938_, f_932_, f_939_, f_934_,
					       f_940_, f_936_);
				    f_907_ += f_928_;
				    f_906_ += f_927_;
				    f_909_ += f_931_;
				    f_938_ += f_933_;
				    f_939_ += f_935_;
				    f_940_ += f_937_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_904_ >= 0.0F) {
				    method3349(bool_902_, bool_903_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_906_,
					       (int) f_908_, f_909_, f_930_,
					       f_938_, f_932_, f_939_, f_934_,
					       f_940_, f_936_);
				    f_908_ += f_926_;
				    f_906_ += f_927_;
				    f_909_ += f_931_;
				    f_938_ += f_933_;
				    f_939_ += f_935_;
				    f_940_ += f_937_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			}
		    }
		} else if (f_904_ <= f_905_) {
		    if (!(f_904_ >= (float) ((Class155_Backup) this).anInt1726)) {
			if (f_905_ > (float) ((Class155_Backup) this).anInt1726)
			    f_905_ = (float) ((Class155_Backup) this).anInt1726;
			if (f > (float) ((Class155_Backup) this).anInt1726)
			    f = (float) ((Class155_Backup) this).anInt1726;
			f_910_ = f_910_ - f_930_ * f_907_ + f_930_;
			float f_941_ = ((float) (i_912_ & 0xff0000)
					- f_932_ * f_907_ + f_932_);
			float f_942_ = ((float) (i_912_ & 0xff00)
					- f_934_ * f_907_ + f_934_);
			float f_943_ = ((float) (i_912_ & 0xff)
					- f_936_ * f_907_ + f_936_);
			if (f_905_ < f) {
			    f_906_ = f_907_;
			    if (f_904_ < 0.0F) {
				f_906_ -= f_927_ * f_904_;
				f_907_ -= f_926_ * f_904_;
				f_910_ -= f_931_ * f_904_;
				f_941_ -= f_933_ * f_904_;
				f_942_ -= f_935_ * f_904_;
				f_943_ -= f_937_ * f_904_;
				f_904_ = 0.0F;
			    }
			    if (f_905_ < 0.0F) {
				f_908_ -= f_928_ * f_905_;
				f_905_ = 0.0F;
			    }
			    if (f_904_ != f_905_ && f_927_ < f_926_
				|| f_904_ == f_905_ && f_927_ > f_928_) {
				f_904_ += 0.5F;
				f_905_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_905_;
				f_905_ -= f_904_;
				f_904_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_904_]);
				while (--f_905_ >= 0.0F) {
				    method3349(bool_902_, bool_903_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_904_, 0, 0,
					       (int) f_906_, (int) f_907_,
					       f_910_, f_930_, f_941_, f_932_,
					       f_942_, f_934_, f_943_, f_936_);
				    f_906_ += f_927_;
				    f_907_ += f_926_;
				    f_910_ += f_931_;
				    f_941_ += f_933_;
				    f_942_ += f_935_;
				    f_943_ += f_937_;
				    f_904_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f >= 0.0F) {
				    method3349(bool_902_, bool_903_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_904_, 0, 0,
					       (int) f_906_, (int) f_908_,
					       f_910_, f_930_, f_941_, f_932_,
					       f_942_, f_934_, f_943_, f_936_);
				    f_906_ += f_927_;
				    f_908_ += f_928_;
				    f_910_ += f_931_;
				    f_941_ += f_933_;
				    f_942_ += f_935_;
				    f_943_ += f_937_;
				    f_904_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f_904_ += 0.5F;
				f_905_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_905_;
				f_905_ -= f_904_;
				f_904_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_904_]);
				while (--f_905_ >= 0.0F) {
				    method3349(bool_902_, bool_903_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_904_, 0, 0,
					       (int) f_907_, (int) f_906_,
					       f_910_, f_930_, f_941_, f_932_,
					       f_942_, f_934_, f_943_, f_936_);
				    f_906_ += f_927_;
				    f_907_ += f_926_;
				    f_910_ += f_931_;
				    f_941_ += f_933_;
				    f_942_ += f_935_;
				    f_943_ += f_937_;
				    f_904_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f >= 0.0F) {
				    method3349(bool_902_, bool_903_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_904_, 0, 0,
					       (int) f_908_, (int) f_906_,
					       f_910_, f_930_, f_941_, f_932_,
					       f_942_, f_934_, f_943_, f_936_);
				    f_906_ += f_927_;
				    f_908_ += f_928_;
				    f_910_ += f_931_;
				    f_941_ += f_933_;
				    f_942_ += f_935_;
				    f_943_ += f_937_;
				    f_904_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			} else {
			    f_908_ = f_907_;
			    if (f_904_ < 0.0F) {
				f_908_ -= f_927_ * f_904_;
				f_907_ -= f_926_ * f_904_;
				f_910_ -= f_931_ * f_904_;
				f_941_ -= f_933_ * f_904_;
				f_942_ -= f_935_ * f_904_;
				f_943_ -= f_937_ * f_904_;
				f_904_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_906_ -= f_928_ * f;
				f = 0.0F;
			    }
			    if (f_927_ < f_926_) {
				f_904_ += 0.5F;
				f += 0.5F;
				f_905_ = (float) (int) (f_905_ + 0.5F) - f;
				f -= f_904_;
				f_904_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_904_]);
				while (--f >= 0.0F) {
				    method3349(bool_902_, bool_903_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_904_, 0, 0,
					       (int) f_908_, (int) f_907_,
					       f_910_, f_930_, f_941_, f_932_,
					       f_942_, f_934_, f_943_, f_936_);
				    f_908_ += f_927_;
				    f_907_ += f_926_;
				    f_910_ += f_931_;
				    f_941_ += f_933_;
				    f_942_ += f_935_;
				    f_943_ += f_937_;
				    f_904_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_905_ >= 0.0F) {
				    method3349(bool_902_, bool_903_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_904_, 0, 0,
					       (int) f_906_, (int) f_907_,
					       f_910_, f_930_, f_941_, f_932_,
					       f_942_, f_934_, f_943_, f_936_);
				    f_906_ += f_928_;
				    f_907_ += f_926_;
				    f_910_ += f_931_;
				    f_941_ += f_933_;
				    f_942_ += f_935_;
				    f_943_ += f_937_;
				    f_904_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f_904_ += 0.5F;
				f += 0.5F;
				f_905_ = (float) (int) (f_905_ + 0.5F) - f;
				f -= f_904_;
				f_904_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_904_]);
				while (--f >= 0.0F) {
				    method3349(bool_902_, bool_903_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_904_, 0, 0,
					       (int) f_907_, (int) f_908_,
					       f_910_, f_930_, f_941_, f_932_,
					       f_942_, f_934_, f_943_, f_936_);
				    f_908_ += f_927_;
				    f_907_ += f_926_;
				    f_910_ += f_931_;
				    f_941_ += f_933_;
				    f_942_ += f_935_;
				    f_943_ += f_937_;
				    f_904_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_905_ >= 0.0F) {
				    method3349(bool_902_, bool_903_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_904_, 0, 0,
					       (int) f_907_, (int) f_906_,
					       f_910_, f_930_, f_941_, f_932_,
					       f_942_, f_934_, f_943_, f_936_);
				    f_906_ += f_928_;
				    f_907_ += f_926_;
				    f_910_ += f_931_;
				    f_941_ += f_933_;
				    f_942_ += f_935_;
				    f_943_ += f_937_;
				    f_904_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			}
		    }
		} else if (!(f_905_ >= (float) ((Class155_Backup) this).anInt1726)) {
		    if (f > (float) ((Class155_Backup) this).anInt1726)
			f = (float) ((Class155_Backup) this).anInt1726;
		    if (f_904_ > (float) ((Class155_Backup) this).anInt1726)
			f_904_ = (float) ((Class155_Backup) this).anInt1726;
		    f_911_ = f_911_ - f_930_ * f_908_ + f_930_;
		    float f_944_ = ((float) (i_913_ & 0xff0000)
				    - f_932_ * f_908_ + f_932_);
		    float f_945_
			= (float) (i_913_ & 0xff00) - f_934_ * f_908_ + f_934_;
		    float f_946_
			= (float) (i_913_ & 0xff) - f_936_ * f_908_ + f_936_;
		    if (f < f_904_) {
			f_907_ = f_908_;
			if (f_905_ < 0.0F) {
			    f_907_ -= f_926_ * f_905_;
			    f_908_ -= f_928_ * f_905_;
			    f_911_ -= f_931_ * f_905_;
			    f_944_ -= f_933_ * f_905_;
			    f_945_ -= f_935_ * f_905_;
			    f_946_ -= f_937_ * f_905_;
			    f_905_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_906_ -= f_927_ * f;
			    f = 0.0F;
			}
			if (f_926_ < f_928_) {
			    f_905_ += 0.5F;
			    f += 0.5F;
			    f_904_ = (float) (int) (f_904_ + 0.5F) - f;
			    f -= f_905_;
			    f_905_ = (float) (((Class155_Backup) this).anIntArray1730
					      [(int) f_905_]);
			    while (--f >= 0.0F) {
				method3349(bool_902_, bool_903_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_905_, 0, 0, (int) f_907_,
					   (int) f_908_, f_911_, f_930_,
					   f_944_, f_932_, f_945_, f_934_,
					   f_946_, f_936_);
				f_907_ += f_926_;
				f_908_ += f_928_;
				f_911_ += f_931_;
				f_944_ += f_933_;
				f_945_ += f_935_;
				f_946_ += f_937_;
				f_905_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f_904_ >= 0.0F) {
				method3349(bool_902_, bool_903_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_905_, 0, 0, (int) f_907_,
					   (int) f_906_, f_911_, f_930_,
					   f_944_, f_932_, f_945_, f_934_,
					   f_946_, f_936_);
				f_907_ += f_926_;
				f_906_ += f_927_;
				f_911_ += f_931_;
				f_944_ += f_933_;
				f_945_ += f_935_;
				f_946_ += f_937_;
				f_905_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			} else {
			    f_905_ += 0.5F;
			    f += 0.5F;
			    f_904_ = (float) (int) (f_904_ + 0.5F) - f;
			    f -= f_905_;
			    f_905_ = (float) (((Class155_Backup) this).anIntArray1730
					      [(int) f_905_]);
			    while (--f >= 0.0F) {
				method3349(bool_902_, bool_903_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_905_, 0, 0, (int) f_908_,
					   (int) f_907_, f_911_, f_930_,
					   f_944_, f_932_, f_945_, f_934_,
					   f_946_, f_936_);
				f_907_ += f_926_;
				f_908_ += f_928_;
				f_911_ += f_931_;
				f_944_ += f_933_;
				f_945_ += f_935_;
				f_946_ += f_937_;
				f_905_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f_904_ >= 0.0F) {
				method3349(bool_902_, bool_903_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_905_, 0, 0, (int) f_906_,
					   (int) f_907_, f_911_, f_930_,
					   f_944_, f_932_, f_945_, f_934_,
					   f_946_, f_936_);
				f_907_ += f_926_;
				f_906_ += f_927_;
				f_911_ += f_931_;
				f_944_ += f_933_;
				f_945_ += f_935_;
				f_946_ += f_937_;
				f_905_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			}
		    } else {
			f_906_ = f_908_;
			if (f_905_ < 0.0F) {
			    f_906_ -= f_926_ * f_905_;
			    f_908_ -= f_928_ * f_905_;
			    f_911_ -= f_931_ * f_905_;
			    f_944_ -= f_933_ * f_905_;
			    f_945_ -= f_935_ * f_905_;
			    f_946_ -= f_937_ * f_905_;
			    f_905_ = 0.0F;
			}
			if (f_904_ < 0.0F) {
			    f_907_ -= f_927_ * f_904_;
			    f_904_ = 0.0F;
			}
			if (f_926_ < f_928_) {
			    f_905_ += 0.5F;
			    f_904_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_904_;
			    f_904_ -= f_905_;
			    f_905_ = (float) (((Class155_Backup) this).anIntArray1730
					      [(int) f_905_]);
			    while (--f_904_ >= 0.0F) {
				method3349(bool_902_, bool_903_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_905_, 0, 0, (int) f_906_,
					   (int) f_908_, f_911_, f_930_,
					   f_944_, f_932_, f_945_, f_934_,
					   f_946_, f_936_);
				f_906_ += f_926_;
				f_908_ += f_928_;
				f_911_ += f_931_;
				f_944_ += f_933_;
				f_945_ += f_935_;
				f_946_ += f_937_;
				f_905_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f >= 0.0F) {
				method3349(bool_902_, bool_903_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_905_, 0, 0, (int) f_907_,
					   (int) f_908_, f_911_, f_930_,
					   f_944_, f_932_, f_945_, f_934_,
					   f_946_, f_936_);
				f_907_ += f_927_;
				f_908_ += f_928_;
				f_911_ += f_931_;
				f_944_ += f_933_;
				f_945_ += f_935_;
				f_946_ += f_937_;
				f_905_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			} else {
			    f_905_ += 0.5F;
			    f_904_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_904_;
			    f_904_ -= f_905_;
			    f_905_ = (float) (((Class155_Backup) this).anIntArray1730
					      [(int) f_905_]);
			    while (--f_904_ >= 0.0F) {
				method3349(bool_902_, bool_903_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_905_, 0, 0, (int) f_908_,
					   (int) f_906_, f_911_, f_930_,
					   f_944_, f_932_, f_945_, f_934_,
					   f_946_, f_936_);
				f_906_ += f_926_;
				f_908_ += f_928_;
				f_911_ += f_931_;
				f_944_ += f_933_;
				f_945_ += f_935_;
				f_946_ += f_937_;
				f_905_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f >= 0.0F) {
				method3349(bool_902_, bool_903_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_905_, 0, 0, (int) f_908_,
					   (int) f_907_, f_911_, f_930_,
					   f_944_, f_932_, f_945_, f_934_,
					   f_946_, f_936_);
				f_907_ += f_927_;
				f_908_ += f_928_;
				f_911_ += f_931_;
				f_944_ += f_933_;
				f_945_ += f_935_;
				f_946_ += f_937_;
				f_905_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method3367(boolean bool, boolean bool_947_, boolean bool_948_,
			  float f, float f_949_, float f_950_, float f_951_,
			  float f_952_, float f_953_, float f_954_,
			  float f_955_, float f_956_, int i, int i_957_,
			  int i_958_) {
	if (!bool)
	    method3377(false, bool_947_, bool_948_, f, f_949_, f_950_, f_951_,
		       f_952_, f_953_, f_954_, f_955_, f_956_, 0);
	else if (((Class155_Backup) this).aBool1724) {
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517((int) f_951_,
							     (int) f,
							     (int) f_952_,
							     (int) f_949_,
							     ~0xffffff | i,
							     223909001);
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517((int) f_952_,
							     (int) f_949_,
							     (int) f_953_,
							     (int) f_950_,
							     ~0xffffff | i,
							     223909001);
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517((int) f_953_,
							     (int) f_950_,
							     (int) f_951_,
							     (int) f,
							     ~0xffffff | i,
							     223909001);
	} else {
	    float f_959_ = f_952_ - f_951_;
	    float f_960_ = f_949_ - f;
	    float f_961_ = f_953_ - f_951_;
	    float f_962_ = f_950_ - f;
	    float f_963_ = f_955_ - f_954_;
	    float f_964_ = f_956_ - f_954_;
	    float f_965_ = (float) ((i_957_ & 0xff0000) - (i & 0xff0000));
	    float f_966_ = (float) ((i_958_ & 0xff0000) - (i & 0xff0000));
	    float f_967_ = (float) ((i_957_ & 0xff00) - (i & 0xff00));
	    float f_968_ = (float) ((i_958_ & 0xff00) - (i & 0xff00));
	    float f_969_ = (float) ((i_957_ & 0xff) - (i & 0xff));
	    float f_970_ = (float) ((i_958_ & 0xff) - (i & 0xff));
	    float f_971_;
	    if (f_950_ != f_949_)
		f_971_ = (f_953_ - f_952_) / (f_950_ - f_949_);
	    else
		f_971_ = 0.0F;
	    float f_972_;
	    if (f_949_ != f)
		f_972_ = f_959_ / f_960_;
	    else
		f_972_ = 0.0F;
	    float f_973_;
	    if (f_950_ != f)
		f_973_ = f_961_ / f_962_;
	    else
		f_973_ = 0.0F;
	    float f_974_ = f_959_ * f_962_ - f_961_ * f_960_;
	    if (f_974_ != 0.0F) {
		float f_975_ = (f_963_ * f_962_ - f_964_ * f_960_) / f_974_;
		float f_976_ = (f_964_ * f_959_ - f_963_ * f_961_) / f_974_;
		float f_977_ = (f_965_ * f_962_ - f_966_ * f_960_) / f_974_;
		float f_978_ = (f_966_ * f_959_ - f_965_ * f_961_) / f_974_;
		float f_979_ = (f_967_ * f_962_ - f_968_ * f_960_) / f_974_;
		float f_980_ = (f_968_ * f_959_ - f_967_ * f_961_) / f_974_;
		float f_981_ = (f_969_ * f_962_ - f_970_ * f_960_) / f_974_;
		float f_982_ = (f_970_ * f_959_ - f_969_ * f_961_) / f_974_;
		if (f <= f_949_ && f <= f_950_) {
		    if (!(f >= (float) ((Class155_Backup) this).anInt1726)) {
			if (f_949_ > (float) ((Class155_Backup) this).anInt1726)
			    f_949_ = (float) ((Class155_Backup) this).anInt1726;
			if (f_950_ > (float) ((Class155_Backup) this).anInt1726)
			    f_950_ = (float) ((Class155_Backup) this).anInt1726;
			f_954_ = f_954_ - f_975_ * f_951_ + f_975_;
			float f_983_ = ((float) (i & 0xff0000)
					- f_977_ * f_951_ + f_977_);
			float f_984_
			    = (float) (i & 0xff00) - f_979_ * f_951_ + f_979_;
			float f_985_
			    = (float) (i & 0xff) - f_981_ * f_951_ + f_981_;
			if (f_949_ < f_950_) {
			    f_953_ = f_951_;
			    if (f < 0.0F) {
				f_953_ -= f_973_ * f;
				f_951_ -= f_972_ * f;
				f_954_ -= f_976_ * f;
				f_983_ -= f_978_ * f;
				f_984_ -= f_980_ * f;
				f_985_ -= f_982_ * f;
				f = 0.0F;
			    }
			    if (f_949_ < 0.0F) {
				f_952_ -= f_971_ * f_949_;
				f_949_ = 0.0F;
			    }
			    if (f != f_949_ && f_973_ < f_972_
				|| f == f_949_ && f_973_ > f_971_) {
				f += 0.5F;
				f_949_ += 0.5F;
				f_950_
				    = (float) (int) (f_950_ + 0.5F) - f_949_;
				f_949_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_949_ >= 0.0F) {
				    method3349(bool_947_, bool_948_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_953_,
					       (int) f_951_, f_954_, f_975_,
					       f_983_, f_977_, f_984_, f_979_,
					       f_985_, f_981_);
				    f_953_ += f_973_;
				    f_951_ += f_972_;
				    f_954_ += f_976_;
				    f_983_ += f_978_;
				    f_984_ += f_980_;
				    f_985_ += f_982_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_950_ >= 0.0F) {
				    method3349(bool_947_, bool_948_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_953_,
					       (int) f_952_, f_954_, f_975_,
					       f_983_, f_977_, f_984_, f_979_,
					       f_985_, f_981_);
				    f_953_ += f_973_;
				    f_952_ += f_971_;
				    f_954_ += f_976_;
				    f_983_ += f_978_;
				    f_984_ += f_980_;
				    f_985_ += f_982_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f += 0.5F;
				f_949_ += 0.5F;
				f_950_
				    = (float) (int) (f_950_ + 0.5F) - f_949_;
				f_949_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_949_ >= 0.0F) {
				    method3349(bool_947_, bool_948_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_951_,
					       (int) f_953_, f_954_, f_975_,
					       f_983_, f_977_, f_984_, f_979_,
					       f_985_, f_981_);
				    f_953_ += f_973_;
				    f_951_ += f_972_;
				    f_954_ += f_976_;
				    f_983_ += f_978_;
				    f_984_ += f_980_;
				    f_985_ += f_982_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_950_ >= 0.0F) {
				    method3349(bool_947_, bool_948_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_952_,
					       (int) f_953_, f_954_, f_975_,
					       f_983_, f_977_, f_984_, f_979_,
					       f_985_, f_981_);
				    f_953_ += f_973_;
				    f_952_ += f_971_;
				    f_954_ += f_976_;
				    f_983_ += f_978_;
				    f_984_ += f_980_;
				    f_985_ += f_982_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			} else {
			    f_952_ = f_951_;
			    if (f < 0.0F) {
				f_952_ -= f_973_ * f;
				f_951_ -= f_972_ * f;
				f_954_ -= f_976_ * f;
				f_983_ -= f_978_ * f;
				f_984_ -= f_980_ * f;
				f_985_ -= f_982_ * f;
				f = 0.0F;
			    }
			    if (f_950_ < 0.0F) {
				f_953_ -= f_971_ * f_950_;
				f_950_ = 0.0F;
			    }
			    if (f != f_950_ && f_973_ < f_972_
				|| f == f_950_ && f_971_ > f_972_) {
				f += 0.5F;
				f_950_ += 0.5F;
				f_949_
				    = (float) (int) (f_949_ + 0.5F) - f_950_;
				f_950_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_950_ >= 0.0F) {
				    method3349(bool_947_, bool_948_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_952_,
					       (int) f_951_, f_954_, f_975_,
					       f_983_, f_977_, f_984_, f_979_,
					       f_985_, f_981_);
				    f_952_ += f_973_;
				    f_951_ += f_972_;
				    f_954_ += f_976_;
				    f_983_ += f_978_;
				    f_984_ += f_980_;
				    f_985_ += f_982_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_949_ >= 0.0F) {
				    method3349(bool_947_, bool_948_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_953_,
					       (int) f_951_, f_954_, f_975_,
					       f_983_, f_977_, f_984_, f_979_,
					       f_985_, f_981_);
				    f_953_ += f_971_;
				    f_951_ += f_972_;
				    f_954_ += f_976_;
				    f_983_ += f_978_;
				    f_984_ += f_980_;
				    f_985_ += f_982_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f += 0.5F;
				f_950_ += 0.5F;
				f_949_
				    = (float) (int) (f_949_ + 0.5F) - f_950_;
				f_950_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_950_ >= 0.0F) {
				    method3349(bool_947_, bool_948_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_951_,
					       (int) f_952_, f_954_, f_975_,
					       f_983_, f_977_, f_984_, f_979_,
					       f_985_, f_981_);
				    f_952_ += f_973_;
				    f_951_ += f_972_;
				    f_954_ += f_976_;
				    f_983_ += f_978_;
				    f_984_ += f_980_;
				    f_985_ += f_982_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_949_ >= 0.0F) {
				    method3349(bool_947_, bool_948_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_951_,
					       (int) f_953_, f_954_, f_975_,
					       f_983_, f_977_, f_984_, f_979_,
					       f_985_, f_981_);
				    f_953_ += f_971_;
				    f_951_ += f_972_;
				    f_954_ += f_976_;
				    f_983_ += f_978_;
				    f_984_ += f_980_;
				    f_985_ += f_982_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			}
		    }
		} else if (f_949_ <= f_950_) {
		    if (!(f_949_ >= (float) ((Class155_Backup) this).anInt1726)) {
			if (f_950_ > (float) ((Class155_Backup) this).anInt1726)
			    f_950_ = (float) ((Class155_Backup) this).anInt1726;
			if (f > (float) ((Class155_Backup) this).anInt1726)
			    f = (float) ((Class155_Backup) this).anInt1726;
			f_955_ = f_955_ - f_975_ * f_952_ + f_975_;
			float f_986_ = ((float) (i_957_ & 0xff0000)
					- f_977_ * f_952_ + f_977_);
			float f_987_ = ((float) (i_957_ & 0xff00)
					- f_979_ * f_952_ + f_979_);
			float f_988_ = ((float) (i_957_ & 0xff)
					- f_981_ * f_952_ + f_981_);
			if (f_950_ < f) {
			    f_951_ = f_952_;
			    if (f_949_ < 0.0F) {
				f_951_ -= f_972_ * f_949_;
				f_952_ -= f_971_ * f_949_;
				f_955_ -= f_976_ * f_949_;
				f_986_ -= f_978_ * f_949_;
				f_987_ -= f_980_ * f_949_;
				f_988_ -= f_982_ * f_949_;
				f_949_ = 0.0F;
			    }
			    if (f_950_ < 0.0F) {
				f_953_ -= f_973_ * f_950_;
				f_950_ = 0.0F;
			    }
			    if (f_949_ != f_950_ && f_972_ < f_971_
				|| f_949_ == f_950_ && f_972_ > f_973_) {
				f_949_ += 0.5F;
				f_950_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_950_;
				f_950_ -= f_949_;
				f_949_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_949_]);
				while (--f_950_ >= 0.0F) {
				    method3349(bool_947_, bool_948_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_949_, 0, 0,
					       (int) f_951_, (int) f_952_,
					       f_955_, f_975_, f_986_, f_977_,
					       f_987_, f_979_, f_988_, f_981_);
				    f_951_ += f_972_;
				    f_952_ += f_971_;
				    f_955_ += f_976_;
				    f_986_ += f_978_;
				    f_987_ += f_980_;
				    f_988_ += f_982_;
				    f_949_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f >= 0.0F) {
				    method3349(bool_947_, bool_948_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_949_, 0, 0,
					       (int) f_951_, (int) f_953_,
					       f_955_, f_975_, f_986_, f_977_,
					       f_987_, f_979_, f_988_, f_981_);
				    f_951_ += f_972_;
				    f_953_ += f_973_;
				    f_955_ += f_976_;
				    f_986_ += f_978_;
				    f_987_ += f_980_;
				    f_988_ += f_982_;
				    f_949_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f_949_ += 0.5F;
				f_950_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_950_;
				f_950_ -= f_949_;
				f_949_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_949_]);
				while (--f_950_ >= 0.0F) {
				    method3349(bool_947_, bool_948_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_949_, 0, 0,
					       (int) f_952_, (int) f_951_,
					       f_955_, f_975_, f_986_, f_977_,
					       f_987_, f_979_, f_988_, f_981_);
				    f_951_ += f_972_;
				    f_952_ += f_971_;
				    f_955_ += f_976_;
				    f_986_ += f_978_;
				    f_987_ += f_980_;
				    f_988_ += f_982_;
				    f_949_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f >= 0.0F) {
				    method3349(bool_947_, bool_948_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_949_, 0, 0,
					       (int) f_953_, (int) f_951_,
					       f_955_, f_975_, f_986_, f_977_,
					       f_987_, f_979_, f_988_, f_981_);
				    f_951_ += f_972_;
				    f_953_ += f_973_;
				    f_955_ += f_976_;
				    f_986_ += f_978_;
				    f_987_ += f_980_;
				    f_988_ += f_982_;
				    f_949_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			} else {
			    f_953_ = f_952_;
			    if (f_949_ < 0.0F) {
				f_953_ -= f_972_ * f_949_;
				f_952_ -= f_971_ * f_949_;
				f_955_ -= f_976_ * f_949_;
				f_986_ -= f_978_ * f_949_;
				f_987_ -= f_980_ * f_949_;
				f_988_ -= f_982_ * f_949_;
				f_949_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_951_ -= f_973_ * f;
				f = 0.0F;
			    }
			    if (f_972_ < f_971_) {
				f_949_ += 0.5F;
				f += 0.5F;
				f_950_ = (float) (int) (f_950_ + 0.5F) - f;
				f -= f_949_;
				f_949_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_949_]);
				while (--f >= 0.0F) {
				    method3349(bool_947_, bool_948_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_949_, 0, 0,
					       (int) f_953_, (int) f_952_,
					       f_955_, f_975_, f_986_, f_977_,
					       f_987_, f_979_, f_988_, f_981_);
				    f_953_ += f_972_;
				    f_952_ += f_971_;
				    f_955_ += f_976_;
				    f_986_ += f_978_;
				    f_987_ += f_980_;
				    f_988_ += f_982_;
				    f_949_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_950_ >= 0.0F) {
				    method3349(bool_947_, bool_948_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_949_, 0, 0,
					       (int) f_951_, (int) f_952_,
					       f_955_, f_975_, f_986_, f_977_,
					       f_987_, f_979_, f_988_, f_981_);
				    f_951_ += f_973_;
				    f_952_ += f_971_;
				    f_955_ += f_976_;
				    f_986_ += f_978_;
				    f_987_ += f_980_;
				    f_988_ += f_982_;
				    f_949_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f_949_ += 0.5F;
				f += 0.5F;
				f_950_ = (float) (int) (f_950_ + 0.5F) - f;
				f -= f_949_;
				f_949_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_949_]);
				while (--f >= 0.0F) {
				    method3349(bool_947_, bool_948_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_949_, 0, 0,
					       (int) f_952_, (int) f_953_,
					       f_955_, f_975_, f_986_, f_977_,
					       f_987_, f_979_, f_988_, f_981_);
				    f_953_ += f_972_;
				    f_952_ += f_971_;
				    f_955_ += f_976_;
				    f_986_ += f_978_;
				    f_987_ += f_980_;
				    f_988_ += f_982_;
				    f_949_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_950_ >= 0.0F) {
				    method3349(bool_947_, bool_948_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_949_, 0, 0,
					       (int) f_952_, (int) f_951_,
					       f_955_, f_975_, f_986_, f_977_,
					       f_987_, f_979_, f_988_, f_981_);
				    f_951_ += f_973_;
				    f_952_ += f_971_;
				    f_955_ += f_976_;
				    f_986_ += f_978_;
				    f_987_ += f_980_;
				    f_988_ += f_982_;
				    f_949_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			}
		    }
		} else if (!(f_950_ >= (float) ((Class155_Backup) this).anInt1726)) {
		    if (f > (float) ((Class155_Backup) this).anInt1726)
			f = (float) ((Class155_Backup) this).anInt1726;
		    if (f_949_ > (float) ((Class155_Backup) this).anInt1726)
			f_949_ = (float) ((Class155_Backup) this).anInt1726;
		    f_956_ = f_956_ - f_975_ * f_953_ + f_975_;
		    float f_989_ = ((float) (i_958_ & 0xff0000)
				    - f_977_ * f_953_ + f_977_);
		    float f_990_
			= (float) (i_958_ & 0xff00) - f_979_ * f_953_ + f_979_;
		    float f_991_
			= (float) (i_958_ & 0xff) - f_981_ * f_953_ + f_981_;
		    if (f < f_949_) {
			f_952_ = f_953_;
			if (f_950_ < 0.0F) {
			    f_952_ -= f_971_ * f_950_;
			    f_953_ -= f_973_ * f_950_;
			    f_956_ -= f_976_ * f_950_;
			    f_989_ -= f_978_ * f_950_;
			    f_990_ -= f_980_ * f_950_;
			    f_991_ -= f_982_ * f_950_;
			    f_950_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_951_ -= f_972_ * f;
			    f = 0.0F;
			}
			if (f_971_ < f_973_) {
			    f_950_ += 0.5F;
			    f += 0.5F;
			    f_949_ = (float) (int) (f_949_ + 0.5F) - f;
			    f -= f_950_;
			    f_950_ = (float) (((Class155_Backup) this).anIntArray1730
					      [(int) f_950_]);
			    while (--f >= 0.0F) {
				method3349(bool_947_, bool_948_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_950_, 0, 0, (int) f_952_,
					   (int) f_953_, f_956_, f_975_,
					   f_989_, f_977_, f_990_, f_979_,
					   f_991_, f_981_);
				f_952_ += f_971_;
				f_953_ += f_973_;
				f_956_ += f_976_;
				f_989_ += f_978_;
				f_990_ += f_980_;
				f_991_ += f_982_;
				f_950_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f_949_ >= 0.0F) {
				method3349(bool_947_, bool_948_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_950_, 0, 0, (int) f_952_,
					   (int) f_951_, f_956_, f_975_,
					   f_989_, f_977_, f_990_, f_979_,
					   f_991_, f_981_);
				f_952_ += f_971_;
				f_951_ += f_972_;
				f_956_ += f_976_;
				f_989_ += f_978_;
				f_990_ += f_980_;
				f_991_ += f_982_;
				f_950_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			} else {
			    f_950_ += 0.5F;
			    f += 0.5F;
			    f_949_ = (float) (int) (f_949_ + 0.5F) - f;
			    f -= f_950_;
			    f_950_ = (float) (((Class155_Backup) this).anIntArray1730
					      [(int) f_950_]);
			    while (--f >= 0.0F) {
				method3349(bool_947_, bool_948_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_950_, 0, 0, (int) f_953_,
					   (int) f_952_, f_956_, f_975_,
					   f_989_, f_977_, f_990_, f_979_,
					   f_991_, f_981_);
				f_952_ += f_971_;
				f_953_ += f_973_;
				f_956_ += f_976_;
				f_989_ += f_978_;
				f_990_ += f_980_;
				f_991_ += f_982_;
				f_950_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f_949_ >= 0.0F) {
				method3349(bool_947_, bool_948_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_950_, 0, 0, (int) f_951_,
					   (int) f_952_, f_956_, f_975_,
					   f_989_, f_977_, f_990_, f_979_,
					   f_991_, f_981_);
				f_952_ += f_971_;
				f_951_ += f_972_;
				f_956_ += f_976_;
				f_989_ += f_978_;
				f_990_ += f_980_;
				f_991_ += f_982_;
				f_950_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			}
		    } else {
			f_951_ = f_953_;
			if (f_950_ < 0.0F) {
			    f_951_ -= f_971_ * f_950_;
			    f_953_ -= f_973_ * f_950_;
			    f_956_ -= f_976_ * f_950_;
			    f_989_ -= f_978_ * f_950_;
			    f_990_ -= f_980_ * f_950_;
			    f_991_ -= f_982_ * f_950_;
			    f_950_ = 0.0F;
			}
			if (f_949_ < 0.0F) {
			    f_952_ -= f_972_ * f_949_;
			    f_949_ = 0.0F;
			}
			if (f_971_ < f_973_) {
			    f_950_ += 0.5F;
			    f_949_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_949_;
			    f_949_ -= f_950_;
			    f_950_ = (float) (((Class155_Backup) this).anIntArray1730
					      [(int) f_950_]);
			    while (--f_949_ >= 0.0F) {
				method3349(bool_947_, bool_948_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_950_, 0, 0, (int) f_951_,
					   (int) f_953_, f_956_, f_975_,
					   f_989_, f_977_, f_990_, f_979_,
					   f_991_, f_981_);
				f_951_ += f_971_;
				f_953_ += f_973_;
				f_956_ += f_976_;
				f_989_ += f_978_;
				f_990_ += f_980_;
				f_991_ += f_982_;
				f_950_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f >= 0.0F) {
				method3349(bool_947_, bool_948_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_950_, 0, 0, (int) f_952_,
					   (int) f_953_, f_956_, f_975_,
					   f_989_, f_977_, f_990_, f_979_,
					   f_991_, f_981_);
				f_952_ += f_972_;
				f_953_ += f_973_;
				f_956_ += f_976_;
				f_989_ += f_978_;
				f_990_ += f_980_;
				f_991_ += f_982_;
				f_950_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			} else {
			    f_950_ += 0.5F;
			    f_949_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_949_;
			    f_949_ -= f_950_;
			    f_950_ = (float) (((Class155_Backup) this).anIntArray1730
					      [(int) f_950_]);
			    while (--f_949_ >= 0.0F) {
				method3349(bool_947_, bool_948_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_950_, 0, 0, (int) f_953_,
					   (int) f_951_, f_956_, f_975_,
					   f_989_, f_977_, f_990_, f_979_,
					   f_991_, f_981_);
				f_951_ += f_971_;
				f_953_ += f_973_;
				f_956_ += f_976_;
				f_989_ += f_978_;
				f_990_ += f_980_;
				f_991_ += f_982_;
				f_950_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f >= 0.0F) {
				method3349(bool_947_, bool_948_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_950_, 0, 0, (int) f_953_,
					   (int) f_952_, f_956_, f_975_,
					   f_989_, f_977_, f_990_, f_979_,
					   f_991_, f_981_);
				f_952_ += f_972_;
				f_953_ += f_973_;
				f_956_ += f_976_;
				f_989_ += f_978_;
				f_990_ += f_980_;
				f_991_ += f_982_;
				f_950_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method3368(boolean bool, boolean bool_992_, boolean bool_993_,
			  float f, float f_994_, float f_995_, float f_996_,
			  float f_997_, float f_998_, float f_999_,
			  float f_1000_, float f_1001_, int i, int i_1002_,
			  int i_1003_) {
	if (!bool)
	    method3377(false, bool_992_, bool_993_, f, f_994_, f_995_, f_996_,
		       f_997_, f_998_, f_999_, f_1000_, f_1001_, 0);
	else if (((Class155_Backup) this).aBool1724) {
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517((int) f_996_,
							     (int) f,
							     (int) f_997_,
							     (int) f_994_,
							     ~0xffffff | i,
							     223909001);
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517((int) f_997_,
							     (int) f_994_,
							     (int) f_998_,
							     (int) f_995_,
							     ~0xffffff | i,
							     223909001);
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517((int) f_998_,
							     (int) f_995_,
							     (int) f_996_,
							     (int) f,
							     ~0xffffff | i,
							     223909001);
	} else {
	    float f_1004_ = f_997_ - f_996_;
	    float f_1005_ = f_994_ - f;
	    float f_1006_ = f_998_ - f_996_;
	    float f_1007_ = f_995_ - f;
	    float f_1008_ = f_1000_ - f_999_;
	    float f_1009_ = f_1001_ - f_999_;
	    float f_1010_ = (float) ((i_1002_ & 0xff0000) - (i & 0xff0000));
	    float f_1011_ = (float) ((i_1003_ & 0xff0000) - (i & 0xff0000));
	    float f_1012_ = (float) ((i_1002_ & 0xff00) - (i & 0xff00));
	    float f_1013_ = (float) ((i_1003_ & 0xff00) - (i & 0xff00));
	    float f_1014_ = (float) ((i_1002_ & 0xff) - (i & 0xff));
	    float f_1015_ = (float) ((i_1003_ & 0xff) - (i & 0xff));
	    float f_1016_;
	    if (f_995_ != f_994_)
		f_1016_ = (f_998_ - f_997_) / (f_995_ - f_994_);
	    else
		f_1016_ = 0.0F;
	    float f_1017_;
	    if (f_994_ != f)
		f_1017_ = f_1004_ / f_1005_;
	    else
		f_1017_ = 0.0F;
	    float f_1018_;
	    if (f_995_ != f)
		f_1018_ = f_1006_ / f_1007_;
	    else
		f_1018_ = 0.0F;
	    float f_1019_ = f_1004_ * f_1007_ - f_1006_ * f_1005_;
	    if (f_1019_ != 0.0F) {
		float f_1020_
		    = (f_1008_ * f_1007_ - f_1009_ * f_1005_) / f_1019_;
		float f_1021_
		    = (f_1009_ * f_1004_ - f_1008_ * f_1006_) / f_1019_;
		float f_1022_
		    = (f_1010_ * f_1007_ - f_1011_ * f_1005_) / f_1019_;
		float f_1023_
		    = (f_1011_ * f_1004_ - f_1010_ * f_1006_) / f_1019_;
		float f_1024_
		    = (f_1012_ * f_1007_ - f_1013_ * f_1005_) / f_1019_;
		float f_1025_
		    = (f_1013_ * f_1004_ - f_1012_ * f_1006_) / f_1019_;
		float f_1026_
		    = (f_1014_ * f_1007_ - f_1015_ * f_1005_) / f_1019_;
		float f_1027_
		    = (f_1015_ * f_1004_ - f_1014_ * f_1006_) / f_1019_;
		if (f <= f_994_ && f <= f_995_) {
		    if (!(f >= (float) ((Class155_Backup) this).anInt1726)) {
			if (f_994_ > (float) ((Class155_Backup) this).anInt1726)
			    f_994_ = (float) ((Class155_Backup) this).anInt1726;
			if (f_995_ > (float) ((Class155_Backup) this).anInt1726)
			    f_995_ = (float) ((Class155_Backup) this).anInt1726;
			f_999_ = f_999_ - f_1020_ * f_996_ + f_1020_;
			float f_1028_ = ((float) (i & 0xff0000)
					 - f_1022_ * f_996_ + f_1022_);
			float f_1029_ = ((float) (i & 0xff00)
					 - f_1024_ * f_996_ + f_1024_);
			float f_1030_
			    = (float) (i & 0xff) - f_1026_ * f_996_ + f_1026_;
			if (f_994_ < f_995_) {
			    f_998_ = f_996_;
			    if (f < 0.0F) {
				f_998_ -= f_1018_ * f;
				f_996_ -= f_1017_ * f;
				f_999_ -= f_1021_ * f;
				f_1028_ -= f_1023_ * f;
				f_1029_ -= f_1025_ * f;
				f_1030_ -= f_1027_ * f;
				f = 0.0F;
			    }
			    if (f_994_ < 0.0F) {
				f_997_ -= f_1016_ * f_994_;
				f_994_ = 0.0F;
			    }
			    if (f != f_994_ && f_1018_ < f_1017_
				|| f == f_994_ && f_1018_ > f_1016_) {
				f += 0.5F;
				f_994_ += 0.5F;
				f_995_
				    = (float) (int) (f_995_ + 0.5F) - f_994_;
				f_994_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_994_ >= 0.0F) {
				    method3349(bool_992_, bool_993_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_998_,
					       (int) f_996_, f_999_, f_1020_,
					       f_1028_, f_1022_, f_1029_,
					       f_1024_, f_1030_, f_1026_);
				    f_998_ += f_1018_;
				    f_996_ += f_1017_;
				    f_999_ += f_1021_;
				    f_1028_ += f_1023_;
				    f_1029_ += f_1025_;
				    f_1030_ += f_1027_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_995_ >= 0.0F) {
				    method3349(bool_992_, bool_993_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_998_,
					       (int) f_997_, f_999_, f_1020_,
					       f_1028_, f_1022_, f_1029_,
					       f_1024_, f_1030_, f_1026_);
				    f_998_ += f_1018_;
				    f_997_ += f_1016_;
				    f_999_ += f_1021_;
				    f_1028_ += f_1023_;
				    f_1029_ += f_1025_;
				    f_1030_ += f_1027_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f += 0.5F;
				f_994_ += 0.5F;
				f_995_
				    = (float) (int) (f_995_ + 0.5F) - f_994_;
				f_994_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_994_ >= 0.0F) {
				    method3349(bool_992_, bool_993_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_996_,
					       (int) f_998_, f_999_, f_1020_,
					       f_1028_, f_1022_, f_1029_,
					       f_1024_, f_1030_, f_1026_);
				    f_998_ += f_1018_;
				    f_996_ += f_1017_;
				    f_999_ += f_1021_;
				    f_1028_ += f_1023_;
				    f_1029_ += f_1025_;
				    f_1030_ += f_1027_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_995_ >= 0.0F) {
				    method3349(bool_992_, bool_993_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_997_,
					       (int) f_998_, f_999_, f_1020_,
					       f_1028_, f_1022_, f_1029_,
					       f_1024_, f_1030_, f_1026_);
				    f_998_ += f_1018_;
				    f_997_ += f_1016_;
				    f_999_ += f_1021_;
				    f_1028_ += f_1023_;
				    f_1029_ += f_1025_;
				    f_1030_ += f_1027_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			} else {
			    f_997_ = f_996_;
			    if (f < 0.0F) {
				f_997_ -= f_1018_ * f;
				f_996_ -= f_1017_ * f;
				f_999_ -= f_1021_ * f;
				f_1028_ -= f_1023_ * f;
				f_1029_ -= f_1025_ * f;
				f_1030_ -= f_1027_ * f;
				f = 0.0F;
			    }
			    if (f_995_ < 0.0F) {
				f_998_ -= f_1016_ * f_995_;
				f_995_ = 0.0F;
			    }
			    if (f != f_995_ && f_1018_ < f_1017_
				|| f == f_995_ && f_1016_ > f_1017_) {
				f += 0.5F;
				f_995_ += 0.5F;
				f_994_
				    = (float) (int) (f_994_ + 0.5F) - f_995_;
				f_995_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_995_ >= 0.0F) {
				    method3349(bool_992_, bool_993_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_997_,
					       (int) f_996_, f_999_, f_1020_,
					       f_1028_, f_1022_, f_1029_,
					       f_1024_, f_1030_, f_1026_);
				    f_997_ += f_1018_;
				    f_996_ += f_1017_;
				    f_999_ += f_1021_;
				    f_1028_ += f_1023_;
				    f_1029_ += f_1025_;
				    f_1030_ += f_1027_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_994_ >= 0.0F) {
				    method3349(bool_992_, bool_993_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_998_,
					       (int) f_996_, f_999_, f_1020_,
					       f_1028_, f_1022_, f_1029_,
					       f_1024_, f_1030_, f_1026_);
				    f_998_ += f_1016_;
				    f_996_ += f_1017_;
				    f_999_ += f_1021_;
				    f_1028_ += f_1023_;
				    f_1029_ += f_1025_;
				    f_1030_ += f_1027_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f += 0.5F;
				f_995_ += 0.5F;
				f_994_
				    = (float) (int) (f_994_ + 0.5F) - f_995_;
				f_995_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_995_ >= 0.0F) {
				    method3349(bool_992_, bool_993_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_996_,
					       (int) f_997_, f_999_, f_1020_,
					       f_1028_, f_1022_, f_1029_,
					       f_1024_, f_1030_, f_1026_);
				    f_997_ += f_1018_;
				    f_996_ += f_1017_;
				    f_999_ += f_1021_;
				    f_1028_ += f_1023_;
				    f_1029_ += f_1025_;
				    f_1030_ += f_1027_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_994_ >= 0.0F) {
				    method3349(bool_992_, bool_993_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_996_,
					       (int) f_998_, f_999_, f_1020_,
					       f_1028_, f_1022_, f_1029_,
					       f_1024_, f_1030_, f_1026_);
				    f_998_ += f_1016_;
				    f_996_ += f_1017_;
				    f_999_ += f_1021_;
				    f_1028_ += f_1023_;
				    f_1029_ += f_1025_;
				    f_1030_ += f_1027_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			}
		    }
		} else if (f_994_ <= f_995_) {
		    if (!(f_994_ >= (float) ((Class155_Backup) this).anInt1726)) {
			if (f_995_ > (float) ((Class155_Backup) this).anInt1726)
			    f_995_ = (float) ((Class155_Backup) this).anInt1726;
			if (f > (float) ((Class155_Backup) this).anInt1726)
			    f = (float) ((Class155_Backup) this).anInt1726;
			f_1000_ = f_1000_ - f_1020_ * f_997_ + f_1020_;
			float f_1031_ = ((float) (i_1002_ & 0xff0000)
					 - f_1022_ * f_997_ + f_1022_);
			float f_1032_ = ((float) (i_1002_ & 0xff00)
					 - f_1024_ * f_997_ + f_1024_);
			float f_1033_ = ((float) (i_1002_ & 0xff)
					 - f_1026_ * f_997_ + f_1026_);
			if (f_995_ < f) {
			    f_996_ = f_997_;
			    if (f_994_ < 0.0F) {
				f_996_ -= f_1017_ * f_994_;
				f_997_ -= f_1016_ * f_994_;
				f_1000_ -= f_1021_ * f_994_;
				f_1031_ -= f_1023_ * f_994_;
				f_1032_ -= f_1025_ * f_994_;
				f_1033_ -= f_1027_ * f_994_;
				f_994_ = 0.0F;
			    }
			    if (f_995_ < 0.0F) {
				f_998_ -= f_1018_ * f_995_;
				f_995_ = 0.0F;
			    }
			    if (f_994_ != f_995_ && f_1017_ < f_1016_
				|| f_994_ == f_995_ && f_1017_ > f_1018_) {
				f_994_ += 0.5F;
				f_995_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_995_;
				f_995_ -= f_994_;
				f_994_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_994_]);
				while (--f_995_ >= 0.0F) {
				    method3349(bool_992_, bool_993_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_994_, 0, 0,
					       (int) f_996_, (int) f_997_,
					       f_1000_, f_1020_, f_1031_,
					       f_1022_, f_1032_, f_1024_,
					       f_1033_, f_1026_);
				    f_996_ += f_1017_;
				    f_997_ += f_1016_;
				    f_1000_ += f_1021_;
				    f_1031_ += f_1023_;
				    f_1032_ += f_1025_;
				    f_1033_ += f_1027_;
				    f_994_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f >= 0.0F) {
				    method3349(bool_992_, bool_993_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_994_, 0, 0,
					       (int) f_996_, (int) f_998_,
					       f_1000_, f_1020_, f_1031_,
					       f_1022_, f_1032_, f_1024_,
					       f_1033_, f_1026_);
				    f_996_ += f_1017_;
				    f_998_ += f_1018_;
				    f_1000_ += f_1021_;
				    f_1031_ += f_1023_;
				    f_1032_ += f_1025_;
				    f_1033_ += f_1027_;
				    f_994_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f_994_ += 0.5F;
				f_995_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_995_;
				f_995_ -= f_994_;
				f_994_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_994_]);
				while (--f_995_ >= 0.0F) {
				    method3349(bool_992_, bool_993_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_994_, 0, 0,
					       (int) f_997_, (int) f_996_,
					       f_1000_, f_1020_, f_1031_,
					       f_1022_, f_1032_, f_1024_,
					       f_1033_, f_1026_);
				    f_996_ += f_1017_;
				    f_997_ += f_1016_;
				    f_1000_ += f_1021_;
				    f_1031_ += f_1023_;
				    f_1032_ += f_1025_;
				    f_1033_ += f_1027_;
				    f_994_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f >= 0.0F) {
				    method3349(bool_992_, bool_993_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_994_, 0, 0,
					       (int) f_998_, (int) f_996_,
					       f_1000_, f_1020_, f_1031_,
					       f_1022_, f_1032_, f_1024_,
					       f_1033_, f_1026_);
				    f_996_ += f_1017_;
				    f_998_ += f_1018_;
				    f_1000_ += f_1021_;
				    f_1031_ += f_1023_;
				    f_1032_ += f_1025_;
				    f_1033_ += f_1027_;
				    f_994_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			} else {
			    f_998_ = f_997_;
			    if (f_994_ < 0.0F) {
				f_998_ -= f_1017_ * f_994_;
				f_997_ -= f_1016_ * f_994_;
				f_1000_ -= f_1021_ * f_994_;
				f_1031_ -= f_1023_ * f_994_;
				f_1032_ -= f_1025_ * f_994_;
				f_1033_ -= f_1027_ * f_994_;
				f_994_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_996_ -= f_1018_ * f;
				f = 0.0F;
			    }
			    if (f_1017_ < f_1016_) {
				f_994_ += 0.5F;
				f += 0.5F;
				f_995_ = (float) (int) (f_995_ + 0.5F) - f;
				f -= f_994_;
				f_994_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_994_]);
				while (--f >= 0.0F) {
				    method3349(bool_992_, bool_993_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_994_, 0, 0,
					       (int) f_998_, (int) f_997_,
					       f_1000_, f_1020_, f_1031_,
					       f_1022_, f_1032_, f_1024_,
					       f_1033_, f_1026_);
				    f_998_ += f_1017_;
				    f_997_ += f_1016_;
				    f_1000_ += f_1021_;
				    f_1031_ += f_1023_;
				    f_1032_ += f_1025_;
				    f_1033_ += f_1027_;
				    f_994_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_995_ >= 0.0F) {
				    method3349(bool_992_, bool_993_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_994_, 0, 0,
					       (int) f_996_, (int) f_997_,
					       f_1000_, f_1020_, f_1031_,
					       f_1022_, f_1032_, f_1024_,
					       f_1033_, f_1026_);
				    f_996_ += f_1018_;
				    f_997_ += f_1016_;
				    f_1000_ += f_1021_;
				    f_1031_ += f_1023_;
				    f_1032_ += f_1025_;
				    f_1033_ += f_1027_;
				    f_994_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f_994_ += 0.5F;
				f += 0.5F;
				f_995_ = (float) (int) (f_995_ + 0.5F) - f;
				f -= f_994_;
				f_994_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_994_]);
				while (--f >= 0.0F) {
				    method3349(bool_992_, bool_993_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_994_, 0, 0,
					       (int) f_997_, (int) f_998_,
					       f_1000_, f_1020_, f_1031_,
					       f_1022_, f_1032_, f_1024_,
					       f_1033_, f_1026_);
				    f_998_ += f_1017_;
				    f_997_ += f_1016_;
				    f_1000_ += f_1021_;
				    f_1031_ += f_1023_;
				    f_1032_ += f_1025_;
				    f_1033_ += f_1027_;
				    f_994_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_995_ >= 0.0F) {
				    method3349(bool_992_, bool_993_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_994_, 0, 0,
					       (int) f_997_, (int) f_996_,
					       f_1000_, f_1020_, f_1031_,
					       f_1022_, f_1032_, f_1024_,
					       f_1033_, f_1026_);
				    f_996_ += f_1018_;
				    f_997_ += f_1016_;
				    f_1000_ += f_1021_;
				    f_1031_ += f_1023_;
				    f_1032_ += f_1025_;
				    f_1033_ += f_1027_;
				    f_994_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			}
		    }
		} else if (!(f_995_ >= (float) ((Class155_Backup) this).anInt1726)) {
		    if (f > (float) ((Class155_Backup) this).anInt1726)
			f = (float) ((Class155_Backup) this).anInt1726;
		    if (f_994_ > (float) ((Class155_Backup) this).anInt1726)
			f_994_ = (float) ((Class155_Backup) this).anInt1726;
		    f_1001_ = f_1001_ - f_1020_ * f_998_ + f_1020_;
		    float f_1034_ = ((float) (i_1003_ & 0xff0000)
				     - f_1022_ * f_998_ + f_1022_);
		    float f_1035_ = ((float) (i_1003_ & 0xff00)
				     - f_1024_ * f_998_ + f_1024_);
		    float f_1036_ = ((float) (i_1003_ & 0xff)
				     - f_1026_ * f_998_ + f_1026_);
		    if (f < f_994_) {
			f_997_ = f_998_;
			if (f_995_ < 0.0F) {
			    f_997_ -= f_1016_ * f_995_;
			    f_998_ -= f_1018_ * f_995_;
			    f_1001_ -= f_1021_ * f_995_;
			    f_1034_ -= f_1023_ * f_995_;
			    f_1035_ -= f_1025_ * f_995_;
			    f_1036_ -= f_1027_ * f_995_;
			    f_995_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_996_ -= f_1017_ * f;
			    f = 0.0F;
			}
			if (f_1016_ < f_1018_) {
			    f_995_ += 0.5F;
			    f += 0.5F;
			    f_994_ = (float) (int) (f_994_ + 0.5F) - f;
			    f -= f_995_;
			    f_995_ = (float) (((Class155_Backup) this).anIntArray1730
					      [(int) f_995_]);
			    while (--f >= 0.0F) {
				method3349(bool_992_, bool_993_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_995_, 0, 0, (int) f_997_,
					   (int) f_998_, f_1001_, f_1020_,
					   f_1034_, f_1022_, f_1035_, f_1024_,
					   f_1036_, f_1026_);
				f_997_ += f_1016_;
				f_998_ += f_1018_;
				f_1001_ += f_1021_;
				f_1034_ += f_1023_;
				f_1035_ += f_1025_;
				f_1036_ += f_1027_;
				f_995_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f_994_ >= 0.0F) {
				method3349(bool_992_, bool_993_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_995_, 0, 0, (int) f_997_,
					   (int) f_996_, f_1001_, f_1020_,
					   f_1034_, f_1022_, f_1035_, f_1024_,
					   f_1036_, f_1026_);
				f_997_ += f_1016_;
				f_996_ += f_1017_;
				f_1001_ += f_1021_;
				f_1034_ += f_1023_;
				f_1035_ += f_1025_;
				f_1036_ += f_1027_;
				f_995_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			} else {
			    f_995_ += 0.5F;
			    f += 0.5F;
			    f_994_ = (float) (int) (f_994_ + 0.5F) - f;
			    f -= f_995_;
			    f_995_ = (float) (((Class155_Backup) this).anIntArray1730
					      [(int) f_995_]);
			    while (--f >= 0.0F) {
				method3349(bool_992_, bool_993_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_995_, 0, 0, (int) f_998_,
					   (int) f_997_, f_1001_, f_1020_,
					   f_1034_, f_1022_, f_1035_, f_1024_,
					   f_1036_, f_1026_);
				f_997_ += f_1016_;
				f_998_ += f_1018_;
				f_1001_ += f_1021_;
				f_1034_ += f_1023_;
				f_1035_ += f_1025_;
				f_1036_ += f_1027_;
				f_995_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f_994_ >= 0.0F) {
				method3349(bool_992_, bool_993_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_995_, 0, 0, (int) f_996_,
					   (int) f_997_, f_1001_, f_1020_,
					   f_1034_, f_1022_, f_1035_, f_1024_,
					   f_1036_, f_1026_);
				f_997_ += f_1016_;
				f_996_ += f_1017_;
				f_1001_ += f_1021_;
				f_1034_ += f_1023_;
				f_1035_ += f_1025_;
				f_1036_ += f_1027_;
				f_995_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			}
		    } else {
			f_996_ = f_998_;
			if (f_995_ < 0.0F) {
			    f_996_ -= f_1016_ * f_995_;
			    f_998_ -= f_1018_ * f_995_;
			    f_1001_ -= f_1021_ * f_995_;
			    f_1034_ -= f_1023_ * f_995_;
			    f_1035_ -= f_1025_ * f_995_;
			    f_1036_ -= f_1027_ * f_995_;
			    f_995_ = 0.0F;
			}
			if (f_994_ < 0.0F) {
			    f_997_ -= f_1017_ * f_994_;
			    f_994_ = 0.0F;
			}
			if (f_1016_ < f_1018_) {
			    f_995_ += 0.5F;
			    f_994_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_994_;
			    f_994_ -= f_995_;
			    f_995_ = (float) (((Class155_Backup) this).anIntArray1730
					      [(int) f_995_]);
			    while (--f_994_ >= 0.0F) {
				method3349(bool_992_, bool_993_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_995_, 0, 0, (int) f_996_,
					   (int) f_998_, f_1001_, f_1020_,
					   f_1034_, f_1022_, f_1035_, f_1024_,
					   f_1036_, f_1026_);
				f_996_ += f_1016_;
				f_998_ += f_1018_;
				f_1001_ += f_1021_;
				f_1034_ += f_1023_;
				f_1035_ += f_1025_;
				f_1036_ += f_1027_;
				f_995_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f >= 0.0F) {
				method3349(bool_992_, bool_993_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_995_, 0, 0, (int) f_997_,
					   (int) f_998_, f_1001_, f_1020_,
					   f_1034_, f_1022_, f_1035_, f_1024_,
					   f_1036_, f_1026_);
				f_997_ += f_1017_;
				f_998_ += f_1018_;
				f_1001_ += f_1021_;
				f_1034_ += f_1023_;
				f_1035_ += f_1025_;
				f_1036_ += f_1027_;
				f_995_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			} else {
			    f_995_ += 0.5F;
			    f_994_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_994_;
			    f_994_ -= f_995_;
			    f_995_ = (float) (((Class155_Backup) this).anIntArray1730
					      [(int) f_995_]);
			    while (--f_994_ >= 0.0F) {
				method3349(bool_992_, bool_993_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_995_, 0, 0, (int) f_998_,
					   (int) f_996_, f_1001_, f_1020_,
					   f_1034_, f_1022_, f_1035_, f_1024_,
					   f_1036_, f_1026_);
				f_996_ += f_1016_;
				f_998_ += f_1018_;
				f_1001_ += f_1021_;
				f_1034_ += f_1023_;
				f_1035_ += f_1025_;
				f_1036_ += f_1027_;
				f_995_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f >= 0.0F) {
				method3349(bool_992_, bool_993_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_995_, 0, 0, (int) f_998_,
					   (int) f_997_, f_1001_, f_1020_,
					   f_1034_, f_1022_, f_1035_, f_1024_,
					   f_1036_, f_1026_);
				f_997_ += f_1017_;
				f_998_ += f_1018_;
				f_1001_ += f_1021_;
				f_1034_ += f_1023_;
				f_1035_ += f_1025_;
				f_1036_ += f_1027_;
				f_995_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method3369
	(boolean bool, boolean bool_1037_, boolean bool_1038_, float f,
	 float f_1039_, float f_1040_, float f_1041_, float f_1042_,
	 float f_1043_, float f_1044_, float f_1045_, float f_1046_,
	 float f_1047_, float f_1048_, float f_1049_, float f_1050_,
	 float f_1051_, float f_1052_, float f_1053_, float f_1054_,
	 float f_1055_, int i, int i_1056_, int i_1057_, int i_1058_,
	 float f_1059_, float f_1060_, float f_1061_, int i_1062_, int i_1063_,
	 float f_1064_, int i_1065_, int i_1066_, float f_1067_, int i_1068_,
	 int i_1069_, float f_1070_) {
	if (!bool)
	    method3377(false, bool_1037_, bool_1038_, f, f_1039_, f_1040_,
		       f_1041_, f_1042_, f_1043_, f_1044_, f_1045_, f_1046_,
		       0);
	else {
	    ((Class155_Backup) this).anInt1740 = i_1058_;
	    if (!(f <= f_1039_) || !(f <= f_1040_)) {
		if (f_1039_ <= f_1040_) {
		    float f_1071_ = f_1041_;
		    f_1041_ = f_1042_;
		    f_1042_ = f_1071_;
		    f_1071_ = f;
		    f = f_1039_;
		    f_1039_ = f_1071_;
		    f_1071_ = f_1044_;
		    f_1044_ = f_1045_;
		    f_1045_ = f_1071_;
		    f_1071_ = f_1050_;
		    f_1050_ = f_1051_;
		    f_1051_ = f_1071_;
		    f_1071_ = f_1053_;
		    f_1053_ = f_1054_;
		    f_1054_ = f_1071_;
		    f_1071_ = f_1047_;
		    f_1047_ = f_1048_;
		    f_1048_ = f_1071_;
		    f_1071_ = f_1059_;
		    f_1059_ = f_1060_;
		    f_1060_ = f_1071_;
		    f_1071_ = f_1064_;
		    f_1064_ = f_1067_;
		    f_1067_ = f_1071_;
		    int i_1072_ = i;
		    i = i_1056_;
		    i_1056_ = i_1072_;
		    i_1072_ = i_1063_;
		    i_1063_ = i_1066_;
		    i_1066_ = i_1072_;
		    i_1072_ = i_1062_;
		    i_1062_ = i_1065_;
		    i_1065_ = i_1072_;
		} else {
		    float f_1073_ = f_1041_;
		    f_1041_ = f_1043_;
		    f_1043_ = f_1073_;
		    f_1073_ = f;
		    f = f_1040_;
		    f_1040_ = f_1073_;
		    f_1073_ = f_1044_;
		    f_1044_ = f_1046_;
		    f_1046_ = f_1073_;
		    f_1073_ = f_1050_;
		    f_1050_ = f_1052_;
		    f_1052_ = f_1073_;
		    f_1073_ = f_1053_;
		    f_1053_ = f_1055_;
		    f_1055_ = f_1073_;
		    f_1073_ = f_1047_;
		    f_1047_ = f_1049_;
		    f_1049_ = f_1073_;
		    f_1073_ = f_1059_;
		    f_1059_ = f_1061_;
		    f_1061_ = f_1073_;
		    f_1073_ = f_1064_;
		    f_1064_ = f_1070_;
		    f_1070_ = f_1073_;
		    int i_1074_ = i;
		    i = i_1057_;
		    i_1057_ = i_1074_;
		    i_1074_ = i_1063_;
		    i_1063_ = i_1069_;
		    i_1069_ = i_1074_;
		    i_1074_ = i_1062_;
		    i_1062_ = i_1068_;
		    i_1068_ = i_1074_;
		}
	    }
	    int i_1075_ = (i_1062_ & 0xffff) << 16 | i_1063_ & 0xffff;
	    int i_1076_ = (i_1065_ & 0xffff) << 16 | i_1066_ & 0xffff;
	    int i_1077_ = (i_1068_ & 0xffff) << 16 | i_1069_ & 0xffff;
	    if (i_1075_ != ((Class155_Backup) this).anInt1734) {
		((Class155_Backup) this).anIntArray1725
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15389(i_1062_, i_1063_);
		if (((Class155_Backup) this).anIntArray1725 == null) {
		    ((Class155_Backup) this).anInt1734 = -1;
		    ((Class155_Backup) this).anInt1723 = 255 - (i >> 24 & 0xff);
		    int i_1078_ = (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     (((Class155_Backup) this).aClass103_Sub2_1743
					  .method15368(i_1062_),
				      641433841)) & 0xffff]);
		    int i_1079_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_1078_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_1078_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_1078_ & 0xff) >> 8);
		    method3385(true, bool_1037_, bool_1038_, f, f_1039_,
			       f_1040_, f_1041_, f_1042_, f_1043_, f_1044_,
			       f_1045_, f_1046_,
			       Class54.method1306(i_1079_, i_1058_, f_1059_,
						  1372221625),
			       Class54.method1306(i_1079_, i_1058_, f_1060_,
						  1372221625),
			       Class54.method1306(i_1079_, i_1058_, f_1061_,
						  1372221625));
		    return;
		}
		((Class155_Backup) this).anInt1734 = i_1075_;
		((Class155_Backup) this).anInt1752
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15365(i_1062_);
		((Class155_Backup) this).anInt1744 = ((Class155_Backup) this).anInt1752 - 1;
		((Class155_Backup) this).aClass529_1746
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15366(i_1062_);
	    }
	    ((Class155_Backup) this).aFloat1745 = f_1064_;
	    if (i_1076_ != ((Class155_Backup) this).anInt1749) {
		((Class155_Backup) this).anIntArray1750
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15389(i_1065_, i_1066_);
		if (((Class155_Backup) this).anIntArray1750 == null) {
		    ((Class155_Backup) this).anInt1749 = -1;
		    ((Class155_Backup) this).anInt1723 = 255 - (i >> 24 & 0xff);
		    int i_1080_ = (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     (((Class155_Backup) this).aClass103_Sub2_1743
					  .method15368(i_1065_),
				      1093846664)) & 0xffff]);
		    int i_1081_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_1080_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_1080_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_1080_ & 0xff) >> 8);
		    method3385(true, bool_1037_, bool_1038_, f, f_1039_,
			       f_1040_, f_1041_, f_1042_, f_1043_, f_1044_,
			       f_1045_, f_1046_,
			       Class54.method1306(i_1081_, i_1058_, f_1059_,
						  1372221625),
			       Class54.method1306(i_1081_, i_1058_, f_1060_,
						  1372221625),
			       Class54.method1306(i_1081_, i_1058_, f_1061_,
						  1372221625));
		    return;
		}
		((Class155_Backup) this).anInt1749 = i_1076_;
		((Class155_Backup) this).anInt1757
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15365(i_1065_);
		((Class155_Backup) this).anInt1742 = ((Class155_Backup) this).anInt1757 - 1;
	    }
	    ((Class155_Backup) this).aFloat1753 = f_1067_;
	    if (i_1077_ != ((Class155_Backup) this).anInt1754) {
		((Class155_Backup) this).anIntArray1755
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15389(i_1068_, i_1069_);
		if (((Class155_Backup) this).anIntArray1755 == null) {
		    ((Class155_Backup) this).anInt1754 = -1;
		    ((Class155_Backup) this).anInt1723 = 255 - (i >> 24 & 0xff);
		    int i_1082_ = (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     (((Class155_Backup) this).aClass103_Sub2_1743
					  .method15368(i_1068_),
				      1112858046)) & 0xffff]);
		    int i_1083_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_1082_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_1082_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_1082_ & 0xff) >> 8);
		    method3385(true, bool_1037_, bool_1038_, (float) (int) f,
			       (float) (int) f_1039_, (float) (int) f_1040_,
			       (float) (int) f_1041_, (float) (int) f_1042_,
			       (float) (int) f_1043_, (float) (int) f_1044_,
			       (float) (int) f_1045_, (float) (int) f_1046_,
			       Class54.method1306(i_1083_, i_1058_, f_1059_,
						  1372221625),
			       Class54.method1306(i_1083_, i_1058_, f_1060_,
						  1372221625),
			       Class54.method1306(i_1083_, i_1058_, f_1061_,
						  1372221625));
		    return;
		}
		((Class155_Backup) this).anInt1754 = i_1077_;
		((Class155_Backup) this).anInt1738
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15365(i_1068_);
		((Class155_Backup) this).anInt1735 = ((Class155_Backup) this).anInt1738 - 1;
	    }
	    ((Class155_Backup) this).aFloat1758 = f_1070_;
	    f_1050_ /= f_1047_;
	    f_1051_ /= f_1048_;
	    f_1052_ /= f_1049_;
	    f_1053_ /= f_1047_;
	    f_1054_ /= f_1048_;
	    f_1055_ /= f_1049_;
	    f_1044_ = 1.0F / f_1044_;
	    f_1045_ = 1.0F / f_1045_;
	    f_1046_ = 1.0F / f_1046_;
	    f_1047_ = 1.0F / f_1047_;
	    f_1048_ = 1.0F / f_1048_;
	    f_1049_ = 1.0F / f_1049_;
	    float f_1084_ = (float) (i >> 24 & 0xff);
	    float f_1085_ = (float) (i_1056_ >> 24 & 0xff);
	    float f_1086_ = (float) (i_1057_ >> 24 & 0xff);
	    float f_1087_ = (float) (i >> 16 & 0xff);
	    float f_1088_ = (float) (i_1056_ >> 16 & 0xff);
	    float f_1089_ = (float) (i_1057_ >> 16 & 0xff);
	    float f_1090_ = (float) (i >> 8 & 0xff);
	    float f_1091_ = (float) (i_1056_ >> 8 & 0xff);
	    float f_1092_ = (float) (i_1057_ >> 8 & 0xff);
	    float f_1093_ = (float) (i & 0xff);
	    float f_1094_ = (float) (i_1056_ & 0xff);
	    float f_1095_ = (float) (i_1057_ & 0xff);
	    float f_1096_ = 1.0F;
	    float f_1097_ = 0.0F;
	    float f_1098_ = 0.0F;
	    float f_1099_ = 0.0F;
	    float f_1100_ = 1.0F;
	    float f_1101_ = 0.0F;
	    float f_1102_ = 0.0F;
	    float f_1103_ = 0.0F;
	    float f_1104_ = 0.0F;
	    float f_1105_ = 0.0F;
	    float f_1106_ = 0.0F;
	    float f_1107_ = 0.0F;
	    float f_1108_ = 0.0F;
	    float f_1109_ = 0.0F;
	    float f_1110_ = 0.0F;
	    float f_1111_ = 0.0F;
	    float f_1112_ = 0.0F;
	    float f_1113_ = 0.0F;
	    if (f_1039_ != f) {
		float f_1114_ = f_1039_ - f;
		f_1102_ = (f_1042_ - f_1041_) / f_1114_;
		f_1103_ = (f_1045_ - f_1044_) / f_1114_;
		f_1104_ = (f_1048_ - f_1047_) / f_1114_;
		f_1105_ = (f_1051_ - f_1050_) / f_1114_;
		f_1106_ = (f_1054_ - f_1053_) / f_1114_;
		f_1107_ = (f_1060_ - f_1059_) / f_1114_;
		f_1108_ = (f_1085_ - f_1084_) / f_1114_;
		f_1109_ = (f_1088_ - f_1087_) / f_1114_;
		f_1110_ = (f_1091_ - f_1090_) / f_1114_;
		f_1111_ = (f_1094_ - f_1093_) / f_1114_;
		f_1112_ = (f_1097_ - f_1096_) / f_1114_;
		f_1113_ = (f_1100_ - f_1099_) / f_1114_;
	    }
	    float f_1115_ = 0.0F;
	    float f_1116_ = 0.0F;
	    float f_1117_ = 0.0F;
	    float f_1118_ = 0.0F;
	    float f_1119_ = 0.0F;
	    float f_1120_ = 0.0F;
	    float f_1121_ = 0.0F;
	    float f_1122_ = 0.0F;
	    float f_1123_ = 0.0F;
	    float f_1124_ = 0.0F;
	    float f_1125_ = 0.0F;
	    float f_1126_ = 0.0F;
	    if (f_1040_ != f_1039_) {
		float f_1127_ = f_1040_ - f_1039_;
		f_1115_ = (f_1043_ - f_1042_) / f_1127_;
		f_1116_ = (f_1046_ - f_1045_) / f_1127_;
		f_1117_ = (f_1049_ - f_1048_) / f_1127_;
		f_1118_ = (f_1052_ - f_1051_) / f_1127_;
		f_1119_ = (f_1055_ - f_1054_) / f_1127_;
		f_1120_ = (f_1061_ - f_1060_) / f_1127_;
		f_1121_ = (f_1086_ - f_1085_) / f_1127_;
		f_1122_ = (f_1089_ - f_1088_) / f_1127_;
		f_1123_ = (f_1092_ - f_1091_) / f_1127_;
		f_1124_ = (f_1095_ - f_1094_) / f_1127_;
		f_1125_ = (f_1098_ - f_1097_) / f_1127_;
		f_1126_ = (f_1101_ - f_1100_) / f_1127_;
	    }
	    float f_1128_ = 0.0F;
	    float f_1129_ = 0.0F;
	    float f_1130_ = 0.0F;
	    float f_1131_ = 0.0F;
	    float f_1132_ = 0.0F;
	    float f_1133_ = 0.0F;
	    float f_1134_ = 0.0F;
	    float f_1135_ = 0.0F;
	    float f_1136_ = 0.0F;
	    float f_1137_ = 0.0F;
	    float f_1138_ = 0.0F;
	    float f_1139_ = 0.0F;
	    if (f != f_1040_) {
		float f_1140_ = f - f_1040_;
		f_1128_ = (f_1041_ - f_1043_) / f_1140_;
		f_1129_ = (f_1044_ - f_1046_) / f_1140_;
		f_1130_ = (f_1047_ - f_1049_) / f_1140_;
		f_1131_ = (f_1050_ - f_1052_) / f_1140_;
		f_1132_ = (f_1053_ - f_1055_) / f_1140_;
		f_1133_ = (f_1059_ - f_1061_) / f_1140_;
		f_1134_ = (f_1084_ - f_1086_) / f_1140_;
		f_1135_ = (f_1087_ - f_1089_) / f_1140_;
		f_1136_ = (f_1090_ - f_1092_) / f_1140_;
		f_1137_ = (f_1093_ - f_1095_) / f_1140_;
		f_1138_ = (f_1096_ - f_1098_) / f_1140_;
		f_1139_ = (f_1099_ - f_1101_) / f_1140_;
	    }
	    if (!(f >= (float) ((Class155_Backup) this).anInt1726)) {
		if (f_1039_ > (float) ((Class155_Backup) this).anInt1726)
		    f_1039_ = (float) ((Class155_Backup) this).anInt1726;
		if (f_1040_ > (float) ((Class155_Backup) this).anInt1726)
		    f_1040_ = (float) ((Class155_Backup) this).anInt1726;
		if (f_1039_ < f_1040_) {
		    f_1043_ = f_1041_;
		    f_1046_ = f_1044_;
		    f_1049_ = f_1047_;
		    f_1052_ = f_1050_;
		    f_1055_ = f_1053_;
		    f_1061_ = f_1059_;
		    f_1086_ = f_1084_;
		    f_1089_ = f_1087_;
		    f_1092_ = f_1090_;
		    f_1095_ = f_1093_;
		    f_1098_ = f_1096_;
		    f_1101_ = f_1099_;
		    if (f < 0.0F) {
			f_1041_ -= f_1102_ * f;
			f_1043_ -= f_1128_ * f;
			f_1044_ -= f_1103_ * f;
			f_1046_ -= f_1129_ * f;
			f_1047_ -= f_1104_ * f;
			f_1049_ -= f_1130_ * f;
			f_1050_ -= f_1105_ * f;
			f_1052_ -= f_1131_ * f;
			f_1053_ -= f_1106_ * f;
			f_1055_ -= f_1132_ * f;
			f_1059_ -= f_1107_ * f;
			f_1061_ -= f_1133_ * f;
			f_1084_ -= f_1108_ * f;
			f_1086_ -= f_1134_ * f;
			f_1087_ -= f_1109_ * f;
			f_1089_ -= f_1135_ * f;
			f_1090_ -= f_1110_ * f;
			f_1092_ -= f_1136_ * f;
			f_1093_ -= f_1111_ * f;
			f_1095_ -= f_1137_ * f;
			f_1096_ -= f_1112_ * f;
			f_1098_ -= f_1138_ * f;
			f_1099_ -= f_1113_ * f;
			f_1101_ -= f_1139_ * f;
			f = 0.0F;
		    }
		    if (f_1039_ < 0.0F) {
			f_1042_ -= f_1115_ * f_1039_;
			f_1045_ -= f_1116_ * f_1039_;
			f_1048_ -= f_1117_ * f_1039_;
			f_1051_ -= f_1118_ * f_1039_;
			f_1054_ -= f_1119_ * f_1039_;
			f_1060_ -= f_1120_ * f_1039_;
			f_1085_ -= f_1121_ * f_1039_;
			f_1088_ -= f_1122_ * f_1039_;
			f_1091_ -= f_1123_ * f_1039_;
			f_1094_ -= f_1124_ * f_1039_;
			f_1097_ -= f_1125_ * f_1039_;
			f_1100_ -= f_1126_ * f_1039_;
			f_1039_ = 0.0F;
		    }
		    if (f != f_1039_ && f_1128_ < f_1102_
			|| f == f_1039_ && f_1128_ > f_1115_) {
			f += 0.5F;
			f_1039_ += 0.5F;
			f_1040_ = (float) (int) (f_1040_ + 0.5F) - f_1039_;
			f_1039_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_1039_ >= 0.0F) {
			    method3343(bool_1037_, bool_1038_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1043_, (int) f_1041_,
				       f_1046_, f_1044_, f_1049_, f_1047_,
				       f_1052_, f_1050_, f_1055_, f_1053_,
				       f_1061_, f_1059_, f_1086_, f_1084_,
				       f_1089_, f_1087_, f_1092_, f_1090_,
				       f_1095_, f_1093_, f_1098_, f_1096_,
				       f_1101_, f_1099_);
			    f_1041_ += f_1102_;
			    f_1043_ += f_1128_;
			    f_1044_ += f_1103_;
			    f_1046_ += f_1129_;
			    f_1047_ += f_1104_;
			    f_1049_ += f_1130_;
			    f_1050_ += f_1105_;
			    f_1052_ += f_1131_;
			    f_1053_ += f_1106_;
			    f_1055_ += f_1132_;
			    f_1059_ += f_1107_;
			    f_1061_ += f_1133_;
			    f_1084_ += f_1108_;
			    f_1086_ += f_1134_;
			    f_1087_ += f_1109_;
			    f_1089_ += f_1135_;
			    f_1090_ += f_1110_;
			    f_1092_ += f_1136_;
			    f_1093_ += f_1111_;
			    f_1095_ += f_1137_;
			    f_1096_ += f_1112_;
			    f_1098_ += f_1138_;
			    f_1099_ += f_1113_;
			    f_1101_ += f_1139_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_1040_ >= 0.0F) {
			    method3343(bool_1037_, bool_1038_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1043_, (int) f_1042_,
				       f_1046_, f_1045_, f_1049_, f_1048_,
				       f_1052_, f_1051_, f_1055_, f_1054_,
				       f_1061_, f_1060_, f_1086_, f_1085_,
				       f_1089_, f_1088_, f_1092_, f_1091_,
				       f_1095_, f_1094_, f_1098_, f_1097_,
				       f_1101_, f_1100_);
			    f_1042_ += f_1115_;
			    f_1043_ += f_1128_;
			    f_1045_ += f_1116_;
			    f_1046_ += f_1129_;
			    f_1048_ += f_1117_;
			    f_1049_ += f_1130_;
			    f_1051_ += f_1118_;
			    f_1052_ += f_1131_;
			    f_1054_ += f_1119_;
			    f_1055_ += f_1132_;
			    f_1060_ += f_1120_;
			    f_1061_ += f_1133_;
			    f_1085_ += f_1121_;
			    f_1086_ += f_1134_;
			    f_1088_ += f_1122_;
			    f_1089_ += f_1135_;
			    f_1091_ += f_1123_;
			    f_1092_ += f_1136_;
			    f_1094_ += f_1124_;
			    f_1095_ += f_1137_;
			    f_1097_ += f_1125_;
			    f_1098_ += f_1138_;
			    f_1100_ += f_1126_;
			    f_1101_ += f_1139_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    } else {
			f += 0.5F;
			f_1039_ += 0.5F;
			f_1040_ = (float) (int) (f_1040_ + 0.5F) - f_1039_;
			f_1039_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_1039_ >= 0.0F) {
			    method3343(bool_1037_, bool_1038_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1041_, (int) f_1043_,
				       f_1044_, f_1046_, f_1047_, f_1049_,
				       f_1050_, f_1052_, f_1053_, f_1055_,
				       f_1059_, f_1061_, f_1084_, f_1086_,
				       f_1087_, f_1089_, f_1090_, f_1092_,
				       f_1093_, f_1095_, f_1096_, f_1098_,
				       f_1099_, f_1101_);
			    f_1041_ += f_1102_;
			    f_1043_ += f_1128_;
			    f_1044_ += f_1103_;
			    f_1046_ += f_1129_;
			    f_1047_ += f_1104_;
			    f_1049_ += f_1130_;
			    f_1050_ += f_1105_;
			    f_1052_ += f_1131_;
			    f_1053_ += f_1106_;
			    f_1055_ += f_1132_;
			    f_1059_ += f_1107_;
			    f_1061_ += f_1133_;
			    f_1084_ += f_1108_;
			    f_1086_ += f_1134_;
			    f_1087_ += f_1109_;
			    f_1089_ += f_1135_;
			    f_1090_ += f_1110_;
			    f_1092_ += f_1136_;
			    f_1093_ += f_1111_;
			    f_1095_ += f_1137_;
			    f_1096_ += f_1112_;
			    f_1098_ += f_1138_;
			    f_1099_ += f_1113_;
			    f_1101_ += f_1139_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_1040_ >= 0.0F) {
			    method3343(bool_1037_, bool_1038_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1042_, (int) f_1043_,
				       f_1045_, f_1046_, f_1048_, f_1049_,
				       f_1051_, f_1052_, f_1054_, f_1055_,
				       f_1060_, f_1061_, f_1085_, f_1086_,
				       f_1088_, f_1089_, f_1091_, f_1092_,
				       f_1094_, f_1095_, f_1097_, f_1098_,
				       f_1100_, f_1101_);
			    f_1042_ += f_1115_;
			    f_1043_ += f_1128_;
			    f_1045_ += f_1116_;
			    f_1046_ += f_1129_;
			    f_1048_ += f_1117_;
			    f_1049_ += f_1130_;
			    f_1051_ += f_1118_;
			    f_1052_ += f_1131_;
			    f_1054_ += f_1119_;
			    f_1055_ += f_1132_;
			    f_1060_ += f_1120_;
			    f_1061_ += f_1133_;
			    f_1085_ += f_1121_;
			    f_1086_ += f_1134_;
			    f_1088_ += f_1122_;
			    f_1089_ += f_1135_;
			    f_1091_ += f_1123_;
			    f_1092_ += f_1136_;
			    f_1094_ += f_1124_;
			    f_1095_ += f_1137_;
			    f_1097_ += f_1125_;
			    f_1098_ += f_1138_;
			    f_1100_ += f_1126_;
			    f_1101_ += f_1139_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    }
		} else {
		    f_1042_ = f_1041_;
		    f_1045_ = f_1044_;
		    f_1048_ = f_1047_;
		    f_1051_ = f_1050_;
		    f_1054_ = f_1053_;
		    f_1060_ = f_1059_;
		    f_1085_ = f_1084_;
		    f_1088_ = f_1087_;
		    f_1091_ = f_1090_;
		    f_1094_ = f_1093_;
		    f_1097_ = f_1096_;
		    f_1100_ = f_1099_;
		    if (f < 0.0F) {
			f_1041_ -= f_1102_ * f;
			f_1042_ -= f_1128_ * f;
			f_1044_ -= f_1103_ * f;
			f_1045_ -= f_1129_ * f;
			f_1047_ -= f_1104_ * f;
			f_1048_ -= f_1130_ * f;
			f_1050_ -= f_1105_ * f;
			f_1051_ -= f_1131_ * f;
			f_1053_ -= f_1106_ * f;
			f_1054_ -= f_1132_ * f;
			f_1059_ -= f_1107_ * f;
			f_1060_ -= f_1133_ * f;
			f_1084_ -= f_1108_ * f;
			f_1085_ -= f_1134_ * f;
			f_1087_ -= f_1109_ * f;
			f_1088_ -= f_1135_ * f;
			f_1090_ -= f_1110_ * f;
			f_1091_ -= f_1136_ * f;
			f_1093_ -= f_1111_ * f;
			f_1094_ -= f_1137_ * f;
			f_1096_ -= f_1112_ * f;
			f_1097_ -= f_1138_ * f;
			f_1099_ -= f_1113_ * f;
			f_1100_ -= f_1139_ * f;
			f = 0.0F;
		    }
		    if (f_1040_ < 0.0F) {
			f_1043_ -= f_1115_ * f_1040_;
			f_1046_ -= f_1116_ * f_1040_;
			f_1049_ -= f_1117_ * f_1040_;
			f_1052_ -= f_1118_ * f_1040_;
			f_1055_ -= f_1119_ * f_1040_;
			f_1061_ -= f_1120_ * f_1040_;
			f_1086_ -= f_1121_ * f_1040_;
			f_1089_ -= f_1122_ * f_1040_;
			f_1092_ -= f_1123_ * f_1040_;
			f_1095_ -= f_1124_ * f_1040_;
			f_1098_ -= f_1125_ * f_1040_;
			f_1101_ -= f_1126_ * f_1040_;
			f_1040_ = 0.0F;
		    }
		    if (f != f_1040_ && f_1128_ < f_1102_
			|| f == f_1040_ && f_1115_ > f_1102_) {
			f += 0.5F;
			f_1040_ += 0.5F;
			f_1039_ = (float) (int) (f_1039_ + 0.5F) - f_1040_;
			f_1040_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_1040_ >= 0.0F) {
			    method3343(bool_1037_, bool_1038_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1042_, (int) f_1041_,
				       f_1045_, f_1044_, f_1048_, f_1047_,
				       f_1051_, f_1050_, f_1054_, f_1053_,
				       f_1060_, f_1059_, f_1085_, f_1084_,
				       f_1088_, f_1087_, f_1091_, f_1090_,
				       f_1094_, f_1093_, f_1097_, f_1096_,
				       f_1100_, f_1099_);
			    f_1041_ += f_1102_;
			    f_1042_ += f_1128_;
			    f_1044_ += f_1103_;
			    f_1045_ += f_1129_;
			    f_1047_ += f_1104_;
			    f_1048_ += f_1130_;
			    f_1050_ += f_1105_;
			    f_1051_ += f_1131_;
			    f_1053_ += f_1106_;
			    f_1054_ += f_1132_;
			    f_1059_ += f_1107_;
			    f_1060_ += f_1133_;
			    f_1084_ += f_1108_;
			    f_1085_ += f_1134_;
			    f_1087_ += f_1109_;
			    f_1088_ += f_1135_;
			    f_1090_ += f_1110_;
			    f_1091_ += f_1136_;
			    f_1093_ += f_1111_;
			    f_1094_ += f_1137_;
			    f_1096_ += f_1112_;
			    f_1097_ += f_1138_;
			    f_1099_ += f_1113_;
			    f_1100_ += f_1139_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_1039_ >= 0.0F) {
			    method3343(bool_1037_, bool_1038_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1043_, (int) f_1041_,
				       f_1046_, f_1044_, f_1049_, f_1047_,
				       f_1052_, f_1050_, f_1055_, f_1053_,
				       f_1061_, f_1059_, f_1086_, f_1084_,
				       f_1089_, f_1087_, f_1092_, f_1090_,
				       f_1095_, f_1093_, f_1098_, f_1096_,
				       f_1101_, f_1099_);
			    f_1043_ += f_1115_;
			    f_1041_ += f_1102_;
			    f_1046_ += f_1116_;
			    f_1044_ += f_1103_;
			    f_1049_ += f_1117_;
			    f_1047_ += f_1104_;
			    f_1052_ += f_1118_;
			    f_1050_ += f_1105_;
			    f_1055_ += f_1119_;
			    f_1053_ += f_1106_;
			    f_1061_ += f_1120_;
			    f_1059_ += f_1107_;
			    f_1086_ += f_1121_;
			    f_1084_ += f_1108_;
			    f_1089_ += f_1122_;
			    f_1087_ += f_1109_;
			    f_1092_ += f_1123_;
			    f_1090_ += f_1110_;
			    f_1095_ += f_1124_;
			    f_1093_ += f_1111_;
			    f_1098_ += f_1125_;
			    f_1096_ += f_1112_;
			    f_1101_ += f_1126_;
			    f_1099_ += f_1113_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    } else {
			f += 0.5F;
			f_1040_ += 0.5F;
			f_1039_ = (float) (int) (f_1039_ + 0.5F) - f_1040_;
			f_1040_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_1040_ >= 0.0F) {
			    method3343(bool_1037_, bool_1038_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1041_, (int) f_1042_,
				       f_1044_, f_1045_, f_1047_, f_1048_,
				       f_1050_, f_1051_, f_1053_, f_1054_,
				       f_1059_, f_1060_, f_1084_, f_1085_,
				       f_1087_, f_1088_, f_1090_, f_1091_,
				       f_1093_, f_1094_, f_1096_, f_1097_,
				       f_1099_, f_1100_);
			    f_1042_ += f_1128_;
			    f_1041_ += f_1102_;
			    f_1045_ += f_1129_;
			    f_1044_ += f_1103_;
			    f_1048_ += f_1130_;
			    f_1047_ += f_1104_;
			    f_1051_ += f_1131_;
			    f_1050_ += f_1105_;
			    f_1054_ += f_1132_;
			    f_1053_ += f_1106_;
			    f_1060_ += f_1133_;
			    f_1059_ += f_1107_;
			    f_1085_ += f_1134_;
			    f_1084_ += f_1108_;
			    f_1088_ += f_1135_;
			    f_1087_ += f_1109_;
			    f_1091_ += f_1136_;
			    f_1090_ += f_1110_;
			    f_1094_ += f_1137_;
			    f_1093_ += f_1111_;
			    f_1097_ += f_1138_;
			    f_1096_ += f_1112_;
			    f_1100_ += f_1139_;
			    f_1099_ += f_1113_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_1039_ >= 0.0F) {
			    method3343(bool_1037_, bool_1038_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1041_, (int) f_1043_,
				       f_1044_, f_1046_, f_1047_, f_1049_,
				       f_1050_, f_1052_, f_1053_, f_1055_,
				       f_1059_, f_1061_, f_1084_, f_1086_,
				       f_1087_, f_1089_, f_1090_, f_1092_,
				       f_1093_, f_1095_, f_1096_, f_1098_,
				       f_1099_, f_1101_);
			    f_1041_ += f_1102_;
			    f_1043_ += f_1115_;
			    f_1044_ += f_1103_;
			    f_1046_ += f_1116_;
			    f_1047_ += f_1104_;
			    f_1049_ += f_1117_;
			    f_1050_ += f_1105_;
			    f_1052_ += f_1118_;
			    f_1053_ += f_1106_;
			    f_1055_ += f_1119_;
			    f_1059_ += f_1107_;
			    f_1061_ += f_1120_;
			    f_1084_ += f_1108_;
			    f_1086_ += f_1121_;
			    f_1087_ += f_1109_;
			    f_1089_ += f_1122_;
			    f_1090_ += f_1110_;
			    f_1092_ += f_1123_;
			    f_1093_ += f_1111_;
			    f_1095_ += f_1124_;
			    f_1096_ += f_1112_;
			    f_1098_ += f_1125_;
			    f_1099_ += f_1113_;
			    f_1101_ += f_1126_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    }
		}
	    }
	}
    }
    
    final void method3370(boolean bool, boolean bool_1141_, int[] is, int i,
			  int i_1142_, int i_1143_, int i_1144_, int i_1145_,
			  float f, float f_1146_, float f_1147_, float f_1148_,
			  float f_1149_, float f_1150_, float f_1151_,
			  float f_1152_) {
	if (((Class155_Backup) this).aBool1748) {
	    if (i_1145_ > ((Class155_Backup) this).anInt1733)
		i_1145_ = ((Class155_Backup) this).anInt1733;
	    if (i_1144_ < 0)
		i_1144_ = 0;
	}
	if (i_1144_ < i_1145_) {
	    if (((Class155_Backup) this).aBool1756) {
		i += i_1144_;
		f_1147_ += f_1148_ * (float) i_1144_;
		f_1149_ += f_1150_ * (float) i_1144_;
		f_1151_ += f_1152_ * (float) i_1144_;
		if (((Class155_Backup) this).aBool1721) {
		    i_1143_ = i_1145_ - i_1144_ >> 2;
		    f_1148_ *= 4.0F;
		    f_1150_ *= 4.0F;
		    f_1152_ *= 4.0F;
		    if (((Class155_Backup) this).anInt1723 == 0) {
			if (i_1143_ > 0) {
			    do {
				i_1142_ = ~0xffffff | ((int) f_1147_ & 0xff0000
						       | (int) f_1149_ & 0xff00
						       | (int) f_1151_ & 0xff);
				f_1147_ += f_1148_;
				f_1149_ += f_1150_;
				f_1151_ += f_1152_;
				is[i++] = i_1142_;
				is[i++] = i_1142_;
				is[i++] = i_1142_;
				is[i++] = i_1142_;
			    } while (--i_1143_ > 0);
			}
			i_1143_ = i_1145_ - i_1144_ & 0x3;
			if (i_1143_ > 0) {
			    i_1142_ = ~0xffffff | ((int) f_1147_ & 0xff0000
						   | (int) f_1149_ & 0xff00
						   | (int) f_1151_ & 0xff);
			    do
				is[i++] = i_1142_;
			    while (--i_1143_ > 0);
			}
		    } else if (!((Class155_Backup) this).aBool1722) {
			int i_1153_ = ((Class155_Backup) this).anInt1723;
			int i_1154_ = 256 - ((Class155_Backup) this).anInt1723;
			if (i_1143_ > 0) {
			    do {
				i_1142_ = ~0xffffff | ((int) f_1147_ & 0xff0000
						       | (int) f_1149_ & 0xff00
						       | (int) f_1151_ & 0xff);
				f_1147_ += f_1148_;
				f_1149_ += f_1150_;
				f_1151_ += f_1152_;
				i_1142_ = (((i_1142_ & 0xff00ff) * i_1154_ >> 8
					    & 0xff00ff)
					   + ((i_1142_ & 0xff00) * i_1154_ >> 8
					      & 0xff00));
				int i_1155_ = is[i];
				if (bool_1141_) {
				    is[i++]
					= ((i_1154_ | i_1155_ >> 24) << 24
					   | (i_1142_
					      + (((i_1155_ & 0xff00ff)
						  * i_1153_) >> 8
						 & 0xff00ff)
					      + (((i_1155_ & 0xff00) * i_1153_
						  >> 8)
						 & 0xff00)));
				    i_1155_ = is[i];
				    is[i++]
					= ((i_1154_ | i_1155_ >> 24) << 24
					   | (i_1142_
					      + (((i_1155_ & 0xff00ff)
						  * i_1153_) >> 8
						 & 0xff00ff)
					      + (((i_1155_ & 0xff00) * i_1153_
						  >> 8)
						 & 0xff00)));
				    i_1155_ = is[i];
				    is[i++]
					= ((i_1154_ | i_1155_ >> 24) << 24
					   | (i_1142_
					      + (((i_1155_ & 0xff00ff)
						  * i_1153_) >> 8
						 & 0xff00ff)
					      + (((i_1155_ & 0xff00) * i_1153_
						  >> 8)
						 & 0xff00)));
				    i_1155_ = is[i];
				    is[i++]
					= ((i_1154_ | i_1155_ >> 24) << 24
					   | (i_1142_
					      + (((i_1155_ & 0xff00ff)
						  * i_1153_) >> 8
						 & 0xff00ff)
					      + (((i_1155_ & 0xff00) * i_1153_
						  >> 8)
						 & 0xff00)));
				} else {
				    is[i++]
					= (i_1142_
					   + (((i_1155_ & 0xff00ff) * i_1153_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1155_ & 0xff00) * i_1153_ >> 8
					      & 0xff00));
				    i_1155_ = is[i];
				    is[i++]
					= (i_1142_
					   + (((i_1155_ & 0xff00ff) * i_1153_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1155_ & 0xff00) * i_1153_ >> 8
					      & 0xff00));
				    i_1155_ = is[i];
				    is[i++]
					= (i_1142_
					   + (((i_1155_ & 0xff00ff) * i_1153_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1155_ & 0xff00) * i_1153_ >> 8
					      & 0xff00));
				    i_1155_ = is[i];
				    is[i++]
					= (i_1142_
					   + (((i_1155_ & 0xff00ff) * i_1153_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1155_ & 0xff00) * i_1153_ >> 8
					      & 0xff00));
				}
			    } while (--i_1143_ > 0);
			}
			i_1143_ = i_1145_ - i_1144_ & 0x3;
			if (i_1143_ > 0) {
			    i_1142_ = ~0xffffff | ((int) f_1147_ & 0xff0000
						   | (int) f_1149_ & 0xff00
						   | (int) f_1151_ & 0xff);
			    i_1142_ = (((i_1142_ & 0xff00ff) * i_1154_ >> 8
					& 0xff00ff)
				       + ((i_1142_ & 0xff00) * i_1154_ >> 8
					  & 0xff00));
			    do {
				int i_1156_ = is[i];
				if (bool_1141_)
				    is[i++]
					= ((i_1154_ | i_1156_ >> 24) << 24
					   | (i_1142_
					      + (((i_1156_ & 0xff00ff)
						  * i_1153_) >> 8
						 & 0xff00ff)
					      + (((i_1156_ & 0xff00) * i_1153_
						  >> 8)
						 & 0xff00)));
				else
				    is[i++]
					= (i_1142_
					   + (((i_1156_ & 0xff00ff) * i_1153_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1156_ & 0xff00) * i_1153_ >> 8
					      & 0xff00));
			    } while (--i_1143_ > 0);
			}
		    } else {
			if (i_1143_ > 0) {
			    do {
				i_1142_ = ((int) f_1147_ & 0xff0000
					   | (int) f_1149_ & 0xff00
					   | (int) f_1151_ & 0xff);
				f_1147_ += f_1148_;
				f_1149_ += f_1150_;
				f_1151_ += f_1152_;
				int[] is_1157_ = is;
				int i_1158_ = i++;
				int i_1159_ = i_1142_;
				int i_1160_ = is_1157_[i_1158_];
				int i_1161_ = i_1159_ + i_1160_;
				int i_1162_ = ((i_1159_ & 0xff00ff)
					       + (i_1160_ & 0xff00ff));
				i_1160_ = ((i_1162_ & 0x1000100)
					   + (i_1161_ - i_1162_ & 0x10000));
				is_1157_[i_1158_]
				    = (~0xffffff | i_1161_ - i_1160_
				       | i_1160_ - (i_1160_ >>> 8));
				int[] is_1163_ = is;
				i_1161_ = i++;
				i_1162_ = i_1142_;
				int i_1164_ = is_1163_[i_1161_];
				int i_1165_ = i_1162_ + i_1164_;
				int i_1166_ = ((i_1162_ & 0xff00ff)
					       + (i_1164_ & 0xff00ff));
				i_1164_ = ((i_1166_ & 0x1000100)
					   + (i_1165_ - i_1166_ & 0x10000));
				is_1163_[i_1161_]
				    = (~0xffffff | i_1165_ - i_1164_
				       | i_1164_ - (i_1164_ >>> 8));
				int[] is_1167_ = is;
				i_1165_ = i++;
				i_1166_ = i_1142_;
				int i_1168_ = is_1167_[i_1165_];
				int i_1169_ = i_1166_ + i_1168_;
				int i_1170_ = ((i_1166_ & 0xff00ff)
					       + (i_1168_ & 0xff00ff));
				i_1168_ = ((i_1170_ & 0x1000100)
					   + (i_1169_ - i_1170_ & 0x10000));
				is_1167_[i_1165_]
				    = (~0xffffff | i_1169_ - i_1168_
				       | i_1168_ - (i_1168_ >>> 8));
				int[] is_1171_ = is;
				i_1169_ = i++;
				i_1170_ = i_1142_;
				int i_1172_ = is_1171_[i_1169_];
				int i_1173_ = i_1170_ + i_1172_;
				int i_1174_ = ((i_1170_ & 0xff00ff)
					       + (i_1172_ & 0xff00ff));
				i_1172_ = ((i_1174_ & 0x1000100)
					   + (i_1173_ - i_1174_ & 0x10000));
				is_1171_[i_1169_]
				    = (~0xffffff | i_1173_ - i_1172_
				       | i_1172_ - (i_1172_ >>> 8));
			    } while (--i_1143_ > 0);
			}
			i_1143_ = i_1145_ - i_1144_ & 0x3;
			if (i_1143_ > 0) {
			    i_1142_ = ((int) f_1147_ & 0xff0000
				       | (int) f_1149_ & 0xff00
				       | (int) f_1151_ & 0xff);
			    do {
				int[] is_1175_ = is;
				int i_1176_ = i++;
				int i_1177_ = i_1142_;
				int i_1178_ = is_1175_[i_1176_];
				int i_1179_ = i_1177_ + i_1178_;
				int i_1180_ = ((i_1177_ & 0xff00ff)
					       + (i_1178_ & 0xff00ff));
				i_1178_ = ((i_1180_ & 0x1000100)
					   + (i_1179_ - i_1180_ & 0x10000));
				is_1175_[i_1176_]
				    = (~0xffffff | i_1179_ - i_1178_
				       | i_1178_ - (i_1178_ >>> 8));
			    } while (--i_1143_ > 0);
			}
		    }
		} else {
		    i_1143_ = i_1145_ - i_1144_;
		    if (((Class155_Backup) this).anInt1723 == 0) {
			do {
			    is[i++] = ~0xffffff | ((int) f_1147_ & 0xff0000
						   | (int) f_1149_ & 0xff00
						   | (int) f_1151_ & 0xff);
			    f_1147_ += f_1148_;
			    f_1149_ += f_1150_;
			    f_1151_ += f_1152_;
			} while (--i_1143_ > 0);
		    } else if (!((Class155_Backup) this).aBool1722) {
			int i_1181_ = ((Class155_Backup) this).anInt1723;
			int i_1182_ = 256 - ((Class155_Backup) this).anInt1723;
			do {
			    i_1142_ = ~0xffffff | ((int) f_1147_ & 0xff0000
						   | (int) f_1149_ & 0xff00
						   | (int) f_1151_ & 0xff);
			    f_1147_ += f_1148_;
			    f_1149_ += f_1150_;
			    f_1151_ += f_1152_;
			    i_1142_ = (((i_1142_ & 0xff00ff) * i_1182_ >> 8
					& 0xff00ff)
				       + ((i_1142_ & 0xff00) * i_1182_ >> 8
					  & 0xff00));
			    int i_1183_ = is[i];
			    if (bool_1141_)
				is[i++]
				    = ((i_1182_ | i_1183_ >> 24) << 24
				       | (i_1142_
					  + (((i_1183_ & 0xff00ff) * i_1181_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1183_ & 0xff00) * i_1181_ >> 8
					     & 0xff00)));
			    else
				is[i++]
				    = (i_1142_
				       + ((i_1183_ & 0xff00ff) * i_1181_ >> 8
					  & 0xff00ff)
				       + ((i_1183_ & 0xff00) * i_1181_ >> 8
					  & 0xff00));
			} while (--i_1143_ > 0);
		    } else {
			do {
			    int[] is_1184_ = is;
			    int i_1185_ = i++;
			    int i_1186_ = ((int) f_1147_ & 0xff0000
					   | (int) f_1149_ & 0xff00
					   | (int) f_1151_ & 0xff);
			    int i_1187_ = is_1184_[i_1185_];
			    int i_1188_ = i_1186_ + i_1187_;
			    int i_1189_
				= (i_1186_ & 0xff00ff) + (i_1187_ & 0xff00ff);
			    i_1187_
				= (i_1189_ & 0x1000100) + (i_1188_ - i_1189_
							   & 0x10000);
			    is_1184_[i_1185_] = (~0xffffff | i_1188_ - i_1187_
						 | i_1187_ - (i_1187_ >>> 8));
			    f_1147_ += f_1148_;
			    f_1149_ += f_1150_;
			    f_1151_ += f_1152_;
			} while (--i_1143_ > 0);
		    }
		}
	    } else {
		i += i_1144_ - 1;
		f += f_1146_ * (float) i_1144_;
		f_1147_ += f_1148_ * (float) i_1144_;
		f_1149_ += f_1150_ * (float) i_1144_;
		f_1151_ += f_1152_ * (float) i_1144_;
		if (((Class189) ((Class155_Backup) this).aClass189_1736).aBool2220) {
		    if (((Class155_Backup) this).aBool1721) {
			i_1143_ = i_1145_ - i_1144_ >> 2;
			f_1148_ *= 4.0F;
			f_1150_ *= 4.0F;
			f_1152_ *= 4.0F;
			if (((Class155_Backup) this).anInt1723 == 0) {
			    if (i_1143_ > 0) {
				do {
				    i_1142_
					= ~0xffffff | ((int) f_1147_ & 0xff0000
						       | (int) f_1149_ & 0xff00
						       | (int) f_1151_ & 0xff);
				    f_1147_ += f_1148_;
				    f_1149_ += f_1150_;
				    f_1151_ += f_1152_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					is[i] = i_1142_;
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_1146_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					is[i] = i_1142_;
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_1146_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					is[i] = i_1142_;
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_1146_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					is[i] = i_1142_;
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_1146_;
				} while (--i_1143_ > 0);
			    }
			    i_1143_ = i_1145_ - i_1144_ & 0x3;
			    if (i_1143_ > 0) {
				i_1142_ = ~0xffffff | ((int) f_1147_ & 0xff0000
						       | (int) f_1149_ & 0xff00
						       | (int) f_1151_ & 0xff);
				do {
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					is[i] = i_1142_;
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_1146_;
				} while (--i_1143_ > 0);
			    }
			} else if (!((Class155_Backup) this).aBool1722) {
			    int i_1190_ = ((Class155_Backup) this).anInt1723;
			    int i_1191_ = 256 - ((Class155_Backup) this).anInt1723;
			    if (i_1143_ > 0) {
				do {
				    i_1142_
					= ~0xffffff | ((int) f_1147_ & 0xff0000
						       | (int) f_1149_ & 0xff00
						       | (int) f_1151_ & 0xff);
				    f_1147_ += f_1148_;
				    f_1149_ += f_1150_;
				    f_1151_ += f_1152_;
				    i_1142_
					= (((i_1142_ & 0xff00ff) * i_1191_ >> 8
					    & 0xff00ff)
					   + ((i_1142_ & 0xff00) * i_1191_ >> 8
					      & 0xff00));
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int i_1192_ = is[i];
					if (bool_1141_)
					    is[i]
						= (((i_1191_ | i_1192_ >> 24)
						    << 24)
						   | (i_1142_
						      + (((i_1192_ & 0xff00ff)
							  * i_1190_) >> 8
							 & 0xff00ff)
						      + (((i_1192_ & 0xff00)
							  * i_1190_) >> 8
							 & 0xff00)));
					else
					    is[i] = (i_1142_
						     + (((i_1192_ & 0xff00ff)
							 * i_1190_) >> 8
							& 0xff00ff)
						     + (((i_1192_ & 0xff00)
							 * i_1190_) >> 8
							& 0xff00));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_1146_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int i_1193_ = is[i];
					if (bool_1141_)
					    is[i]
						= (((i_1191_ | i_1193_ >> 24)
						    << 24)
						   | (i_1142_
						      + (((i_1193_ & 0xff00ff)
							  * i_1190_) >> 8
							 & 0xff00ff)
						      + (((i_1193_ & 0xff00)
							  * i_1190_) >> 8
							 & 0xff00)));
					else
					    is[i] = (i_1142_
						     + (((i_1193_ & 0xff00ff)
							 * i_1190_) >> 8
							& 0xff00ff)
						     + (((i_1193_ & 0xff00)
							 * i_1190_) >> 8
							& 0xff00));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_1146_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int i_1194_ = is[i];
					if (bool_1141_)
					    is[i]
						= (((i_1191_ | i_1194_ >> 24)
						    << 24)
						   | (i_1142_
						      + (((i_1194_ & 0xff00ff)
							  * i_1190_) >> 8
							 & 0xff00ff)
						      + (((i_1194_ & 0xff00)
							  * i_1190_) >> 8
							 & 0xff00)));
					else
					    is[i] = (i_1142_
						     + (((i_1194_ & 0xff00ff)
							 * i_1190_) >> 8
							& 0xff00ff)
						     + (((i_1194_ & 0xff00)
							 * i_1190_) >> 8
							& 0xff00));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_1146_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int i_1195_ = is[i];
					if (bool_1141_)
					    is[i]
						= (((i_1191_ | i_1195_ >> 24)
						    << 24)
						   | (i_1142_
						      + (((i_1195_ & 0xff00ff)
							  * i_1190_) >> 8
							 & 0xff00ff)
						      + (((i_1195_ & 0xff00)
							  * i_1190_) >> 8
							 & 0xff00)));
					else
					    is[i] = (i_1142_
						     + (((i_1195_ & 0xff00ff)
							 * i_1190_) >> 8
							& 0xff00ff)
						     + (((i_1195_ & 0xff00)
							 * i_1190_) >> 8
							& 0xff00));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_1146_;
				} while (--i_1143_ > 0);
			    }
			    i_1143_ = i_1145_ - i_1144_ & 0x3;
			    if (i_1143_ > 0) {
				i_1142_ = ~0xffffff | ((int) f_1147_ & 0xff0000
						       | (int) f_1149_ & 0xff00
						       | (int) f_1151_ & 0xff);
				i_1142_ = (((i_1142_ & 0xff00ff) * i_1191_ >> 8
					    & 0xff00ff)
					   + ((i_1142_ & 0xff00) * i_1191_ >> 8
					      & 0xff00));
				do {
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int i_1196_ = is[i];
					if (bool_1141_)
					    is[i]
						= (((i_1191_ | i_1196_ >> 24)
						    << 24)
						   | (i_1142_
						      + (((i_1196_ & 0xff00ff)
							  * i_1190_) >> 8
							 & 0xff00ff)
						      + (((i_1196_ & 0xff00)
							  * i_1190_) >> 8
							 & 0xff00)));
					else
					    is[i] = (i_1142_
						     + (((i_1196_ & 0xff00ff)
							 * i_1190_) >> 8
							& 0xff00ff)
						     + (((i_1196_ & 0xff00)
							 * i_1190_) >> 8
							& 0xff00));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_1146_;
				} while (--i_1143_ > 0);
			    }
			} else {
			    if (i_1143_ > 0) {
				do {
				    i_1142_ = ((int) f_1147_ & 0xff0000
					       | (int) f_1149_ & 0xff00
					       | (int) f_1151_ & 0xff);
				    f_1147_ += f_1148_;
				    f_1149_ += f_1150_;
				    f_1151_ += f_1152_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int[] is_1197_ = is;
					int i_1198_ = i;
					int i_1199_ = i_1142_;
					int i_1200_ = is_1197_[i_1198_];
					int i_1201_ = i_1199_ + i_1200_;
					int i_1202_ = ((i_1199_ & 0xff00ff)
						       + (i_1200_ & 0xff00ff));
					i_1200_ = ((i_1202_ & 0x1000100)
						   + (i_1201_ - i_1202_
						      & 0x10000));
					is_1197_[i_1198_]
					    = (~0xffffff | i_1201_ - i_1200_
					       | i_1200_ - (i_1200_ >>> 8));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_1146_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int[] is_1203_ = is;
					int i_1204_ = i;
					int i_1205_ = i_1142_;
					int i_1206_ = is_1203_[i_1204_];
					int i_1207_ = i_1205_ + i_1206_;
					int i_1208_ = ((i_1205_ & 0xff00ff)
						       + (i_1206_ & 0xff00ff));
					i_1206_ = ((i_1208_ & 0x1000100)
						   + (i_1207_ - i_1208_
						      & 0x10000));
					is_1203_[i_1204_]
					    = (~0xffffff | i_1207_ - i_1206_
					       | i_1206_ - (i_1206_ >>> 8));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_1146_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int[] is_1209_ = is;
					int i_1210_ = i;
					int i_1211_ = i_1142_;
					int i_1212_ = is_1209_[i_1210_];
					int i_1213_ = i_1211_ + i_1212_;
					int i_1214_ = ((i_1211_ & 0xff00ff)
						       + (i_1212_ & 0xff00ff));
					i_1212_ = ((i_1214_ & 0x1000100)
						   + (i_1213_ - i_1214_
						      & 0x10000));
					is_1209_[i_1210_]
					    = (~0xffffff | i_1213_ - i_1212_
					       | i_1212_ - (i_1212_ >>> 8));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_1146_;
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int[] is_1215_ = is;
					int i_1216_ = i;
					int i_1217_ = i_1142_;
					int i_1218_ = is_1215_[i_1216_];
					int i_1219_ = i_1217_ + i_1218_;
					int i_1220_ = ((i_1217_ & 0xff00ff)
						       + (i_1218_ & 0xff00ff));
					i_1218_ = ((i_1220_ & 0x1000100)
						   + (i_1219_ - i_1220_
						      & 0x10000));
					is_1215_[i_1216_]
					    = (~0xffffff | i_1219_ - i_1218_
					       | i_1218_ - (i_1218_ >>> 8));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_1146_;
				} while (--i_1143_ > 0);
			    }
			    i_1143_ = i_1145_ - i_1144_ & 0x3;
			    if (i_1143_ > 0) {
				i_1142_ = ((int) f_1147_ & 0xff0000
					   | (int) f_1149_ & 0xff00
					   | (int) f_1151_ & 0xff);
				do {
				    i++;
				    if (!bool || f < (((Class155_Backup) this)
						      .aFloatArray1739[i])) {
					int[] is_1221_ = is;
					int i_1222_ = i;
					int i_1223_ = i_1142_;
					int i_1224_ = is_1221_[i_1222_];
					int i_1225_ = i_1223_ + i_1224_;
					int i_1226_ = ((i_1223_ & 0xff00ff)
						       + (i_1224_ & 0xff00ff));
					i_1224_ = ((i_1226_ & 0x1000100)
						   + (i_1225_ - i_1226_
						      & 0x10000));
					is_1221_[i_1222_]
					    = (~0xffffff | i_1225_ - i_1224_
					       | i_1224_ - (i_1224_ >>> 8));
					if (bool)
					    ((Class155_Backup) this)
						.aFloatArray1739[i]
						= f;
				    }
				    f += f_1146_;
				} while (--i_1143_ > 0);
			    }
			}
		    } else {
			i_1143_ = i_1145_ - i_1144_;
			if (((Class155_Backup) this).anInt1723 == 0) {
			    do {
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    is[i]
					= ~0xffffff | ((int) f_1147_ & 0xff0000
						       | (int) f_1149_ & 0xff00
						       | (int) f_1151_ & 0xff);
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f;
				}
				f += f_1146_;
				f_1147_ += f_1148_;
				f_1149_ += f_1150_;
				f_1151_ += f_1152_;
			    } while (--i_1143_ > 0);
			} else if (!((Class155_Backup) this).aBool1722) {
			    int i_1227_ = ((Class155_Backup) this).anInt1723;
			    int i_1228_ = 256 - ((Class155_Backup) this).anInt1723;
			    do {
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    i_1142_
					= ~0xffffff | ((int) f_1147_ & 0xff0000
						       | (int) f_1149_ & 0xff00
						       | (int) f_1151_ & 0xff);
				    i_1142_
					= (((i_1142_ & 0xff00ff) * i_1228_ >> 8
					    & 0xff00ff)
					   + ((i_1142_ & 0xff00) * i_1228_ >> 8
					      & 0xff00));
				    int i_1229_ = is[i];
				    if (bool_1141_)
					is[i]
					    = ((i_1228_ | i_1229_ >> 24) << 24
					       | (i_1142_
						  + (((i_1229_ & 0xff00ff)
						      * i_1227_) >> 8
						     & 0xff00ff)
						  + (((i_1229_ & 0xff00)
						      * i_1227_) >> 8
						     & 0xff00)));
				    else
					is[i]
					    = (i_1142_
					       + (((i_1229_ & 0xff00ff)
						   * i_1227_) >> 8
						  & 0xff00ff)
					       + (((i_1229_ & 0xff00) * i_1227_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f;
				}
				f += f_1146_;
				f_1147_ += f_1148_;
				f_1149_ += f_1150_;
				f_1151_ += f_1152_;
			    } while (--i_1143_ > 0);
			} else {
			    do {
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int[] is_1230_ = is;
				    int i_1231_ = i;
				    int i_1232_ = ((int) f_1147_ & 0xff0000
						   | (int) f_1149_ & 0xff00
						   | (int) f_1151_ & 0xff);
				    int i_1233_ = is_1230_[i_1231_];
				    int i_1234_ = i_1232_ + i_1233_;
				    int i_1235_ = ((i_1232_ & 0xff00ff)
						   + (i_1233_ & 0xff00ff));
				    i_1233_
					= ((i_1235_ & 0x1000100)
					   + (i_1234_ - i_1235_ & 0x10000));
				    is_1230_[i_1231_]
					= (~0xffffff | i_1234_ - i_1233_
					   | i_1233_ - (i_1233_ >>> 8));
				    if (bool)
					((Class155_Backup) this).aFloatArray1739[i]
					    = f;
				}
				f += f_1146_;
				f_1147_ += f_1148_;
				f_1149_ += f_1150_;
				f_1151_ += f_1152_;
			    } while (--i_1143_ > 0);
			}
		    }
		} else if (((Class155_Backup) this).aBool1721) {
		    i_1143_ = i_1145_ - i_1144_ >> 2;
		    f_1148_ *= 4.0F;
		    f_1150_ *= 4.0F;
		    f_1152_ *= 4.0F;
		    if (((Class155_Backup) this).anInt1723 == 0) {
			if (i_1143_ > 0) {
			    do {
				i_1142_ = ~0xffffff | ((int) f_1147_ & 0xff0000
						       | (int) f_1149_ & 0xff00
						       | (int) f_1151_ & 0xff);
				f_1147_ += f_1148_;
				f_1149_ += f_1150_;
				f_1151_ += f_1152_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i]))
				    is[i] = i_1142_;
				f += f_1146_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i]))
				    is[i] = i_1142_;
				f += f_1146_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i]))
				    is[i] = i_1142_;
				f += f_1146_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i]))
				    is[i] = i_1142_;
				f += f_1146_;
			    } while (--i_1143_ > 0);
			}
			i_1143_ = i_1145_ - i_1144_ & 0x3;
			if (i_1143_ > 0) {
			    i_1142_ = ~0xffffff | ((int) f_1147_ & 0xff0000
						   | (int) f_1149_ & 0xff00
						   | (int) f_1151_ & 0xff);
			    do {
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i]))
				    is[i] = i_1142_;
				f += f_1146_;
			    } while (--i_1143_ > 0);
			}
		    } else if (!((Class155_Backup) this).aBool1722) {
			int i_1236_ = ((Class155_Backup) this).anInt1723;
			int i_1237_ = 256 - ((Class155_Backup) this).anInt1723;
			if (i_1143_ > 0) {
			    do {
				i_1142_ = ~0xffffff | ((int) f_1147_ & 0xff0000
						       | (int) f_1149_ & 0xff00
						       | (int) f_1151_ & 0xff);
				f_1147_ += f_1148_;
				f_1149_ += f_1150_;
				f_1151_ += f_1152_;
				i_1142_ = (((i_1142_ & 0xff00ff) * i_1237_ >> 8
					    & 0xff00ff)
					   + ((i_1142_ & 0xff00) * i_1237_ >> 8
					      & 0xff00));
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int i_1238_ = is[i];
				    if (bool_1141_)
					is[i]
					    = ((i_1237_ | i_1238_ >> 24) << 24
					       | (i_1142_
						  + (((i_1238_ & 0xff00ff)
						      * i_1236_) >> 8
						     & 0xff00ff)
						  + (((i_1238_ & 0xff00)
						      * i_1236_) >> 8
						     & 0xff00)));
				    else
					is[i]
					    = (i_1142_
					       + (((i_1238_ & 0xff00ff)
						   * i_1236_) >> 8
						  & 0xff00ff)
					       + (((i_1238_ & 0xff00) * i_1236_
						   >> 8)
						  & 0xff00));
				}
				f += f_1146_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int i_1239_ = is[i];
				    if (bool_1141_)
					is[i]
					    = ((i_1237_ | i_1239_ >> 24) << 24
					       | (i_1142_
						  + (((i_1239_ & 0xff00ff)
						      * i_1236_) >> 8
						     & 0xff00ff)
						  + (((i_1239_ & 0xff00)
						      * i_1236_) >> 8
						     & 0xff00)));
				    else
					is[i]
					    = (i_1142_
					       + (((i_1239_ & 0xff00ff)
						   * i_1236_) >> 8
						  & 0xff00ff)
					       + (((i_1239_ & 0xff00) * i_1236_
						   >> 8)
						  & 0xff00));
				}
				f += f_1146_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int i_1240_ = is[i];
				    if (bool_1141_)
					is[i]
					    = ((i_1237_ | i_1240_ >> 24) << 24
					       | (i_1142_
						  + (((i_1240_ & 0xff00ff)
						      * i_1236_) >> 8
						     & 0xff00ff)
						  + (((i_1240_ & 0xff00)
						      * i_1236_) >> 8
						     & 0xff00)));
				    else
					is[i]
					    = (i_1142_
					       + (((i_1240_ & 0xff00ff)
						   * i_1236_) >> 8
						  & 0xff00ff)
					       + (((i_1240_ & 0xff00) * i_1236_
						   >> 8)
						  & 0xff00));
				}
				f += f_1146_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int i_1241_ = is[i];
				    if (bool_1141_)
					is[i]
					    = ((i_1237_ | i_1241_ >> 24) << 24
					       | (i_1142_
						  + (((i_1241_ & 0xff00ff)
						      * i_1236_) >> 8
						     & 0xff00ff)
						  + (((i_1241_ & 0xff00)
						      * i_1236_) >> 8
						     & 0xff00)));
				    else
					is[i]
					    = (i_1142_
					       + (((i_1241_ & 0xff00ff)
						   * i_1236_) >> 8
						  & 0xff00ff)
					       + (((i_1241_ & 0xff00) * i_1236_
						   >> 8)
						  & 0xff00));
				}
				f += f_1146_;
			    } while (--i_1143_ > 0);
			}
			i_1143_ = i_1145_ - i_1144_ & 0x3;
			if (i_1143_ > 0) {
			    i_1142_ = ~0xffffff | ((int) f_1147_ & 0xff0000
						   | (int) f_1149_ & 0xff00
						   | (int) f_1151_ & 0xff);
			    i_1142_ = (((i_1142_ & 0xff00ff) * i_1237_ >> 8
					& 0xff00ff)
				       + ((i_1142_ & 0xff00) * i_1237_ >> 8
					  & 0xff00));
			    do {
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int i_1242_ = is[i];
				    if (bool_1141_)
					is[i]
					    = ((i_1237_ | i_1242_ >> 24) << 24
					       | (i_1142_
						  + (((i_1242_ & 0xff00ff)
						      * i_1236_) >> 8
						     & 0xff00ff)
						  + (((i_1242_ & 0xff00)
						      * i_1236_) >> 8
						     & 0xff00)));
				    else
					is[i]
					    = (i_1142_
					       + (((i_1242_ & 0xff00ff)
						   * i_1236_) >> 8
						  & 0xff00ff)
					       + (((i_1242_ & 0xff00) * i_1236_
						   >> 8)
						  & 0xff00));
				}
				f += f_1146_;
			    } while (--i_1143_ > 0);
			}
		    } else {
			if (i_1143_ > 0) {
			    do {
				i_1142_ = ((int) f_1147_ & 0xff0000
					   | (int) f_1149_ & 0xff00
					   | (int) f_1151_ & 0xff);
				f_1147_ += f_1148_;
				f_1149_ += f_1150_;
				f_1151_ += f_1152_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int[] is_1243_ = is;
				    int i_1244_ = i;
				    int i_1245_ = i_1142_;
				    int i_1246_ = is_1243_[i_1244_];
				    int i_1247_ = i_1245_ + i_1246_;
				    int i_1248_ = ((i_1245_ & 0xff00ff)
						   + (i_1246_ & 0xff00ff));
				    i_1246_
					= ((i_1248_ & 0x1000100)
					   + (i_1247_ - i_1248_ & 0x10000));
				    is_1243_[i_1244_]
					= (~0xffffff | i_1247_ - i_1246_
					   | i_1246_ - (i_1246_ >>> 8));
				}
				f += f_1146_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int[] is_1249_ = is;
				    int i_1250_ = i;
				    int i_1251_ = i_1142_;
				    int i_1252_ = is_1249_[i_1250_];
				    int i_1253_ = i_1251_ + i_1252_;
				    int i_1254_ = ((i_1251_ & 0xff00ff)
						   + (i_1252_ & 0xff00ff));
				    i_1252_
					= ((i_1254_ & 0x1000100)
					   + (i_1253_ - i_1254_ & 0x10000));
				    is_1249_[i_1250_]
					= (~0xffffff | i_1253_ - i_1252_
					   | i_1252_ - (i_1252_ >>> 8));
				}
				f += f_1146_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int[] is_1255_ = is;
				    int i_1256_ = i;
				    int i_1257_ = i_1142_;
				    int i_1258_ = is_1255_[i_1256_];
				    int i_1259_ = i_1257_ + i_1258_;
				    int i_1260_ = ((i_1257_ & 0xff00ff)
						   + (i_1258_ & 0xff00ff));
				    i_1258_
					= ((i_1260_ & 0x1000100)
					   + (i_1259_ - i_1260_ & 0x10000));
				    is_1255_[i_1256_]
					= (~0xffffff | i_1259_ - i_1258_
					   | i_1258_ - (i_1258_ >>> 8));
				}
				f += f_1146_;
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int[] is_1261_ = is;
				    int i_1262_ = i;
				    int i_1263_ = i_1142_;
				    int i_1264_ = is_1261_[i_1262_];
				    int i_1265_ = i_1263_ + i_1264_;
				    int i_1266_ = ((i_1263_ & 0xff00ff)
						   + (i_1264_ & 0xff00ff));
				    i_1264_
					= ((i_1266_ & 0x1000100)
					   + (i_1265_ - i_1266_ & 0x10000));
				    is_1261_[i_1262_]
					= (~0xffffff | i_1265_ - i_1264_
					   | i_1264_ - (i_1264_ >>> 8));
				}
				f += f_1146_;
			    } while (--i_1143_ > 0);
			}
			i_1143_ = i_1145_ - i_1144_ & 0x3;
			if (i_1143_ > 0) {
			    i_1142_ = ((int) f_1147_ & 0xff0000
				       | (int) f_1149_ & 0xff00
				       | (int) f_1151_ & 0xff);
			    do {
				i++;
				if (!bool || f < (((Class155_Backup) this)
						  .aFloatArray1739[i])) {
				    int[] is_1267_ = is;
				    int i_1268_ = i;
				    int i_1269_ = i_1142_;
				    int i_1270_ = is_1267_[i_1268_];
				    int i_1271_ = i_1269_ + i_1270_;
				    int i_1272_ = ((i_1269_ & 0xff00ff)
						   + (i_1270_ & 0xff00ff));
				    i_1270_
					= ((i_1272_ & 0x1000100)
					   + (i_1271_ - i_1272_ & 0x10000));
				    is_1267_[i_1268_]
					= (~0xffffff | i_1271_ - i_1270_
					   | i_1270_ - (i_1270_ >>> 8));
				}
				f += f_1146_;
			    } while (--i_1143_ > 0);
			}
		    }
		} else {
		    i_1143_ = i_1145_ - i_1144_;
		    if (((Class155_Backup) this).anInt1723 == 0) {
			do {
			    i++;
			    if (!bool
				|| f < ((Class155_Backup) this).aFloatArray1739[i])
				is[i] = ~0xffffff | ((int) f_1147_ & 0xff0000
						     | (int) f_1149_ & 0xff00
						     | (int) f_1151_ & 0xff);
			    f += f_1146_;
			    f_1147_ += f_1148_;
			    f_1149_ += f_1150_;
			    f_1151_ += f_1152_;
			} while (--i_1143_ > 0);
		    } else if (!((Class155_Backup) this).aBool1722) {
			int i_1273_ = ((Class155_Backup) this).anInt1723;
			int i_1274_ = 256 - ((Class155_Backup) this).anInt1723;
			do {
			    i++;
			    if (!bool
				|| f < ((Class155_Backup) this).aFloatArray1739[i]) {
				i_1142_ = ~0xffffff | ((int) f_1147_ & 0xff0000
						       | (int) f_1149_ & 0xff00
						       | (int) f_1151_ & 0xff);
				i_1142_ = (((i_1142_ & 0xff00ff) * i_1274_ >> 8
					    & 0xff00ff)
					   + ((i_1142_ & 0xff00) * i_1274_ >> 8
					      & 0xff00));
				int i_1275_ = is[i];
				if (bool_1141_)
				    is[i]
					= ((i_1274_ | i_1275_ >> 24) << 24
					   | (i_1142_
					      + (((i_1275_ & 0xff00ff)
						  * i_1273_) >> 8
						 & 0xff00ff)
					      + (((i_1275_ & 0xff00) * i_1273_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1142_
					   + (((i_1275_ & 0xff00ff) * i_1273_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1275_ & 0xff00) * i_1273_ >> 8
					      & 0xff00));
			    }
			    f += f_1146_;
			    f_1147_ += f_1148_;
			    f_1149_ += f_1150_;
			    f_1151_ += f_1152_;
			} while (--i_1143_ > 0);
		    } else {
			do {
			    i++;
			    if (!bool
				|| f < ((Class155_Backup) this).aFloatArray1739[i]) {
				int[] is_1276_ = is;
				int i_1277_ = i;
				int i_1278_ = ((int) f_1147_ & 0xff0000
					       | (int) f_1149_ & 0xff00
					       | (int) f_1151_ & 0xff);
				int i_1279_ = is_1276_[i_1277_];
				int i_1280_ = i_1278_ + i_1279_;
				int i_1281_ = ((i_1278_ & 0xff00ff)
					       + (i_1279_ & 0xff00ff));
				i_1279_ = ((i_1281_ & 0x1000100)
					   + (i_1280_ - i_1281_ & 0x10000));
				is_1276_[i_1277_]
				    = (~0xffffff | i_1280_ - i_1279_
				       | i_1279_ - (i_1279_ >>> 8));
			    }
			    f += f_1146_;
			    f_1147_ += f_1148_;
			    f_1149_ += f_1150_;
			    f_1151_ += f_1152_;
			} while (--i_1143_ > 0);
		    }
		}
	    }
	}
    }
    
    int method3371() {
	return (((Class155_Backup) this).anIntArray1730[0]
		/ ((Class155_Backup) this).anInt1737);
    }
    
    final void method3372(boolean bool, boolean bool_1282_, boolean bool_1283_,
			  int[] is, int i, int i_1284_, int i_1285_,
			  int i_1286_, int i_1287_, float f, float f_1288_) {
	if (((Class155_Backup) this).aBool1748) {
	    if (i_1287_ > ((Class155_Backup) this).anInt1733)
		i_1287_ = ((Class155_Backup) this).anInt1733;
	    if (i_1286_ < 0)
		i_1286_ = 0;
	}
	if (i_1286_ < i_1287_) {
	    i += i_1286_ - 1;
	    i_1285_ = i_1287_ - i_1286_ >> 2;
	    f += f_1288_ * (float) i_1286_;
	    if (((Class189) ((Class155_Backup) this).aClass189_1736).aBool2220) {
		if (((Class155_Backup) this).anInt1723 == 0) {
		    while (--i_1285_ >= 0) {
			i++;
			if (!bool_1282_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool)
				is[i] = i_1284_;
			    if (bool_1282_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1288_;
			i++;
			if (!bool_1282_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool)
				is[i] = i_1284_;
			    if (bool_1282_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1288_;
			i++;
			if (!bool_1282_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool)
				is[i] = i_1284_;
			    if (bool_1282_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1288_;
			i++;
			if (!bool_1282_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool)
				is[i] = i_1284_;
			    if (bool_1282_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1288_;
		    }
		    i_1285_ = i_1287_ - i_1286_ & 0x3;
		    while (--i_1285_ >= 0) {
			i++;
			if (!bool_1282_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool)
				is[i] = i_1284_;
			    if (bool_1282_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1288_;
		    }
		} else if (((Class155_Backup) this).anInt1723 == 254) {
		    if (i_1286_ != 0
			&& i_1287_ <= ((Class155_Backup) this).anInt1733 - 1) {
			while (--i_1285_ >= 0) {
			    i++;
			    if ((!bool_1282_
				 || f < ((Class155_Backup) this).aFloatArray1739[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_1288_;
			    i++;
			    if ((!bool_1282_
				 || f < ((Class155_Backup) this).aFloatArray1739[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_1288_;
			    i++;
			    if ((!bool_1282_
				 || f < ((Class155_Backup) this).aFloatArray1739[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_1288_;
			    i++;
			    if ((!bool_1282_
				 || f < ((Class155_Backup) this).aFloatArray1739[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_1288_;
			}
			i_1285_ = i_1287_ - i_1286_ & 0x3;
			while (--i_1285_ >= 0) {
			    i++;
			    if ((!bool_1282_
				 || f < ((Class155_Backup) this).aFloatArray1739[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_1288_;
			}
		    }
		} else {
		    int i_1289_ = ((Class155_Backup) this).anInt1723;
		    int i_1290_ = 256 - ((Class155_Backup) this).anInt1723;
		    i_1284_ = (((i_1284_ & 0xff00ff) * i_1290_ >> 8 & 0xff00ff)
			       + ((i_1284_ & 0xff00) * i_1290_ >> 8 & 0xff00));
		    while (--i_1285_ >= 0) {
			i++;
			if (!bool_1282_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool) {
				int i_1291_ = is[i];
				if (bool_1283_)
				    is[i]
					= ((i_1290_ | i_1291_ >> 24) << 24
					   | (i_1284_
					      + (((i_1291_ & 0xff00ff)
						  * i_1289_) >> 8
						 & 0xff00ff)
					      + (((i_1291_ & 0xff00) * i_1289_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1284_
					   + (((i_1291_ & 0xff00ff) * i_1289_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1291_ & 0xff00) * i_1289_ >> 8
					      & 0xff00));
			    }
			    if (bool_1282_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1288_;
			i++;
			if (!bool_1282_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool) {
				int i_1292_ = is[i];
				if (bool_1283_)
				    is[i]
					= ((i_1290_ | i_1292_ >> 24) << 24
					   | (i_1284_
					      + (((i_1292_ & 0xff00ff)
						  * i_1289_) >> 8
						 & 0xff00ff)
					      + (((i_1292_ & 0xff00) * i_1289_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1284_
					   + (((i_1292_ & 0xff00ff) * i_1289_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1292_ & 0xff00) * i_1289_ >> 8
					      & 0xff00));
			    }
			    if (bool_1282_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1288_;
			i++;
			if (!bool_1282_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool) {
				int i_1293_ = is[i];
				if (bool_1283_)
				    is[i]
					= ((i_1290_ | i_1293_ >> 24) << 24
					   | (i_1284_
					      + (((i_1293_ & 0xff00ff)
						  * i_1289_) >> 8
						 & 0xff00ff)
					      + (((i_1293_ & 0xff00) * i_1289_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1284_
					   + (((i_1293_ & 0xff00ff) * i_1289_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1293_ & 0xff00) * i_1289_ >> 8
					      & 0xff00));
			    }
			    if (bool_1282_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1288_;
			i++;
			if (!bool_1282_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool) {
				int i_1294_ = is[i];
				if (bool_1283_)
				    is[i]
					= ((i_1290_ | i_1294_ >> 24) << 24
					   | (i_1284_
					      + (((i_1294_ & 0xff00ff)
						  * i_1289_) >> 8
						 & 0xff00ff)
					      + (((i_1294_ & 0xff00) * i_1289_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1284_
					   + (((i_1294_ & 0xff00ff) * i_1289_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1294_ & 0xff00) * i_1289_ >> 8
					      & 0xff00));
			    }
			    if (bool_1282_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1288_;
		    }
		    i_1285_ = i_1287_ - i_1286_ & 0x3;
		    while (--i_1285_ >= 0) {
			i++;
			if (!bool_1282_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool) {
				int i_1295_ = is[i];
				if (bool_1283_)
				    is[i]
					= ((i_1290_ | i_1295_ >> 24) << 24
					   | (i_1284_
					      + (((i_1295_ & 0xff00ff)
						  * i_1289_) >> 8
						 & 0xff00ff)
					      + (((i_1295_ & 0xff00) * i_1289_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1284_
					   + (((i_1295_ & 0xff00ff) * i_1289_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1295_ & 0xff00) * i_1289_ >> 8
					      & 0xff00));
			    }
			    if (bool_1282_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1288_;
		    }
		}
	    } else if (bool) {
		if (((Class155_Backup) this).anInt1723 == 0) {
		    while (--i_1285_ >= 0) {
			i++;
			if (!bool_1282_
			    || f < ((Class155_Backup) this).aFloatArray1739[i])
			    is[i] = i_1284_;
			f += f_1288_;
			i++;
			if (!bool_1282_
			    || f < ((Class155_Backup) this).aFloatArray1739[i])
			    is[i] = i_1284_;
			f += f_1288_;
			i++;
			if (!bool_1282_
			    || f < ((Class155_Backup) this).aFloatArray1739[i])
			    is[i] = i_1284_;
			f += f_1288_;
			i++;
			if (!bool_1282_
			    || f < ((Class155_Backup) this).aFloatArray1739[i])
			    is[i] = i_1284_;
			f += f_1288_;
		    }
		    i_1285_ = i_1287_ - i_1286_ & 0x3;
		    while (--i_1285_ >= 0) {
			i++;
			if (!bool_1282_
			    || f < ((Class155_Backup) this).aFloatArray1739[i])
			    is[i] = i_1284_;
			f += f_1288_;
		    }
		} else if (((Class155_Backup) this).anInt1723 == 254) {
		    if (i_1286_ != 0
			&& i_1287_ <= ((Class155_Backup) this).anInt1733 - 1) {
			while (--i_1285_ >= 0) {
			    i++;
			    if (!bool_1282_
				|| f < ((Class155_Backup) this).aFloatArray1739[i])
				is[i - 1] = is[i];
			    f += f_1288_;
			    i++;
			    if (!bool_1282_
				|| f < ((Class155_Backup) this).aFloatArray1739[i])
				is[i - 1] = is[i];
			    f += f_1288_;
			    i++;
			    if (!bool_1282_
				|| f < ((Class155_Backup) this).aFloatArray1739[i])
				is[i - 1] = is[i];
			    f += f_1288_;
			    i++;
			    if (!bool_1282_
				|| f < ((Class155_Backup) this).aFloatArray1739[i])
				is[i - 1] = is[i];
			    f += f_1288_;
			}
			i_1285_ = i_1287_ - i_1286_ & 0x3;
			while (--i_1285_ >= 0) {
			    i++;
			    if (!bool_1282_
				|| f < ((Class155_Backup) this).aFloatArray1739[i])
				is[i - 1] = is[i];
			    f += f_1288_;
			}
		    }
		} else {
		    int i_1296_ = ((Class155_Backup) this).anInt1723;
		    int i_1297_ = 256 - ((Class155_Backup) this).anInt1723;
		    i_1284_ = (((i_1284_ & 0xff00ff) * i_1297_ >> 8 & 0xff00ff)
			       + ((i_1284_ & 0xff00) * i_1297_ >> 8 & 0xff00));
		    while (--i_1285_ >= 0) {
			i++;
			if (!bool_1282_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    int i_1298_ = is[i];
			    if (bool_1283_)
				is[i]
				    = ((i_1297_ | i_1298_ >> 24) << 24
				       | (i_1284_
					  + (((i_1298_ & 0xff00ff) * i_1296_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1298_ & 0xff00) * i_1296_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_1284_
					 + ((i_1298_ & 0xff00ff) * i_1296_ >> 8
					    & 0xff00ff)
					 + ((i_1298_ & 0xff00) * i_1296_ >> 8
					    & 0xff00));
			}
			f += f_1288_;
			i++;
			if (!bool_1282_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    int i_1299_ = is[i];
			    if (bool_1283_)
				is[i]
				    = ((i_1297_ | i_1299_ >> 24) << 24
				       | (i_1284_
					  + (((i_1299_ & 0xff00ff) * i_1296_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1299_ & 0xff00) * i_1296_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_1284_
					 + ((i_1299_ & 0xff00ff) * i_1296_ >> 8
					    & 0xff00ff)
					 + ((i_1299_ & 0xff00) * i_1296_ >> 8
					    & 0xff00));
			}
			f += f_1288_;
			i++;
			if (!bool_1282_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    int i_1300_ = is[i];
			    if (bool_1283_)
				is[i]
				    = ((i_1297_ | i_1300_ >> 24) << 24
				       | (i_1284_
					  + (((i_1300_ & 0xff00ff) * i_1296_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1300_ & 0xff00) * i_1296_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_1284_
					 + ((i_1300_ & 0xff00ff) * i_1296_ >> 8
					    & 0xff00ff)
					 + ((i_1300_ & 0xff00) * i_1296_ >> 8
					    & 0xff00));
			}
			f += f_1288_;
			i++;
			if (!bool_1282_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    int i_1301_ = is[i];
			    if (bool_1283_)
				is[i]
				    = ((i_1297_ | i_1301_ >> 24) << 24
				       | (i_1284_
					  + (((i_1301_ & 0xff00ff) * i_1296_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1301_ & 0xff00) * i_1296_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_1284_
					 + ((i_1301_ & 0xff00ff) * i_1296_ >> 8
					    & 0xff00ff)
					 + ((i_1301_ & 0xff00) * i_1296_ >> 8
					    & 0xff00));
			}
			f += f_1288_;
		    }
		    i_1285_ = i_1287_ - i_1286_ & 0x3;
		    while (--i_1285_ >= 0) {
			i++;
			if (!bool_1282_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    int i_1302_ = is[i];
			    if (bool_1283_)
				is[i]
				    = ((i_1297_ | i_1302_ >> 24) << 24
				       | (i_1284_
					  + (((i_1302_ & 0xff00ff) * i_1296_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1302_ & 0xff00) * i_1296_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_1284_
					 + ((i_1302_ & 0xff00ff) * i_1296_ >> 8
					    & 0xff00ff)
					 + ((i_1302_ & 0xff00) * i_1296_ >> 8
					    & 0xff00));
			}
			f += f_1288_;
		    }
		}
	    }
	}
    }
    
    final void method3373(boolean bool, boolean bool_1303_, boolean bool_1304_,
			  int[] is, int i, int i_1305_, int i_1306_,
			  int i_1307_, int i_1308_, float f, float f_1309_) {
	if (((Class155_Backup) this).aBool1748) {
	    if (i_1308_ > ((Class155_Backup) this).anInt1733)
		i_1308_ = ((Class155_Backup) this).anInt1733;
	    if (i_1307_ < 0)
		i_1307_ = 0;
	}
	if (i_1307_ < i_1308_) {
	    i += i_1307_ - 1;
	    i_1306_ = i_1308_ - i_1307_ >> 2;
	    f += f_1309_ * (float) i_1307_;
	    if (((Class189) ((Class155_Backup) this).aClass189_1736).aBool2220) {
		if (((Class155_Backup) this).anInt1723 == 0) {
		    while (--i_1306_ >= 0) {
			i++;
			if (!bool_1303_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool)
				is[i] = i_1305_;
			    if (bool_1303_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1309_;
			i++;
			if (!bool_1303_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool)
				is[i] = i_1305_;
			    if (bool_1303_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1309_;
			i++;
			if (!bool_1303_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool)
				is[i] = i_1305_;
			    if (bool_1303_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1309_;
			i++;
			if (!bool_1303_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool)
				is[i] = i_1305_;
			    if (bool_1303_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1309_;
		    }
		    i_1306_ = i_1308_ - i_1307_ & 0x3;
		    while (--i_1306_ >= 0) {
			i++;
			if (!bool_1303_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool)
				is[i] = i_1305_;
			    if (bool_1303_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1309_;
		    }
		} else if (((Class155_Backup) this).anInt1723 == 254) {
		    if (i_1307_ != 0
			&& i_1308_ <= ((Class155_Backup) this).anInt1733 - 1) {
			while (--i_1306_ >= 0) {
			    i++;
			    if ((!bool_1303_
				 || f < ((Class155_Backup) this).aFloatArray1739[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_1309_;
			    i++;
			    if ((!bool_1303_
				 || f < ((Class155_Backup) this).aFloatArray1739[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_1309_;
			    i++;
			    if ((!bool_1303_
				 || f < ((Class155_Backup) this).aFloatArray1739[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_1309_;
			    i++;
			    if ((!bool_1303_
				 || f < ((Class155_Backup) this).aFloatArray1739[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_1309_;
			}
			i_1306_ = i_1308_ - i_1307_ & 0x3;
			while (--i_1306_ >= 0) {
			    i++;
			    if ((!bool_1303_
				 || f < ((Class155_Backup) this).aFloatArray1739[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_1309_;
			}
		    }
		} else {
		    int i_1310_ = ((Class155_Backup) this).anInt1723;
		    int i_1311_ = 256 - ((Class155_Backup) this).anInt1723;
		    i_1305_ = (((i_1305_ & 0xff00ff) * i_1311_ >> 8 & 0xff00ff)
			       + ((i_1305_ & 0xff00) * i_1311_ >> 8 & 0xff00));
		    while (--i_1306_ >= 0) {
			i++;
			if (!bool_1303_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool) {
				int i_1312_ = is[i];
				if (bool_1304_)
				    is[i]
					= ((i_1311_ | i_1312_ >> 24) << 24
					   | (i_1305_
					      + (((i_1312_ & 0xff00ff)
						  * i_1310_) >> 8
						 & 0xff00ff)
					      + (((i_1312_ & 0xff00) * i_1310_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1305_
					   + (((i_1312_ & 0xff00ff) * i_1310_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1312_ & 0xff00) * i_1310_ >> 8
					      & 0xff00));
			    }
			    if (bool_1303_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1309_;
			i++;
			if (!bool_1303_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool) {
				int i_1313_ = is[i];
				if (bool_1304_)
				    is[i]
					= ((i_1311_ | i_1313_ >> 24) << 24
					   | (i_1305_
					      + (((i_1313_ & 0xff00ff)
						  * i_1310_) >> 8
						 & 0xff00ff)
					      + (((i_1313_ & 0xff00) * i_1310_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1305_
					   + (((i_1313_ & 0xff00ff) * i_1310_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1313_ & 0xff00) * i_1310_ >> 8
					      & 0xff00));
			    }
			    if (bool_1303_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1309_;
			i++;
			if (!bool_1303_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool) {
				int i_1314_ = is[i];
				if (bool_1304_)
				    is[i]
					= ((i_1311_ | i_1314_ >> 24) << 24
					   | (i_1305_
					      + (((i_1314_ & 0xff00ff)
						  * i_1310_) >> 8
						 & 0xff00ff)
					      + (((i_1314_ & 0xff00) * i_1310_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1305_
					   + (((i_1314_ & 0xff00ff) * i_1310_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1314_ & 0xff00) * i_1310_ >> 8
					      & 0xff00));
			    }
			    if (bool_1303_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1309_;
			i++;
			if (!bool_1303_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool) {
				int i_1315_ = is[i];
				if (bool_1304_)
				    is[i]
					= ((i_1311_ | i_1315_ >> 24) << 24
					   | (i_1305_
					      + (((i_1315_ & 0xff00ff)
						  * i_1310_) >> 8
						 & 0xff00ff)
					      + (((i_1315_ & 0xff00) * i_1310_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1305_
					   + (((i_1315_ & 0xff00ff) * i_1310_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1315_ & 0xff00) * i_1310_ >> 8
					      & 0xff00));
			    }
			    if (bool_1303_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1309_;
		    }
		    i_1306_ = i_1308_ - i_1307_ & 0x3;
		    while (--i_1306_ >= 0) {
			i++;
			if (!bool_1303_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool) {
				int i_1316_ = is[i];
				if (bool_1304_)
				    is[i]
					= ((i_1311_ | i_1316_ >> 24) << 24
					   | (i_1305_
					      + (((i_1316_ & 0xff00ff)
						  * i_1310_) >> 8
						 & 0xff00ff)
					      + (((i_1316_ & 0xff00) * i_1310_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1305_
					   + (((i_1316_ & 0xff00ff) * i_1310_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1316_ & 0xff00) * i_1310_ >> 8
					      & 0xff00));
			    }
			    if (bool_1303_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1309_;
		    }
		}
	    } else if (bool) {
		if (((Class155_Backup) this).anInt1723 == 0) {
		    while (--i_1306_ >= 0) {
			i++;
			if (!bool_1303_
			    || f < ((Class155_Backup) this).aFloatArray1739[i])
			    is[i] = i_1305_;
			f += f_1309_;
			i++;
			if (!bool_1303_
			    || f < ((Class155_Backup) this).aFloatArray1739[i])
			    is[i] = i_1305_;
			f += f_1309_;
			i++;
			if (!bool_1303_
			    || f < ((Class155_Backup) this).aFloatArray1739[i])
			    is[i] = i_1305_;
			f += f_1309_;
			i++;
			if (!bool_1303_
			    || f < ((Class155_Backup) this).aFloatArray1739[i])
			    is[i] = i_1305_;
			f += f_1309_;
		    }
		    i_1306_ = i_1308_ - i_1307_ & 0x3;
		    while (--i_1306_ >= 0) {
			i++;
			if (!bool_1303_
			    || f < ((Class155_Backup) this).aFloatArray1739[i])
			    is[i] = i_1305_;
			f += f_1309_;
		    }
		} else if (((Class155_Backup) this).anInt1723 == 254) {
		    if (i_1307_ != 0
			&& i_1308_ <= ((Class155_Backup) this).anInt1733 - 1) {
			while (--i_1306_ >= 0) {
			    i++;
			    if (!bool_1303_
				|| f < ((Class155_Backup) this).aFloatArray1739[i])
				is[i - 1] = is[i];
			    f += f_1309_;
			    i++;
			    if (!bool_1303_
				|| f < ((Class155_Backup) this).aFloatArray1739[i])
				is[i - 1] = is[i];
			    f += f_1309_;
			    i++;
			    if (!bool_1303_
				|| f < ((Class155_Backup) this).aFloatArray1739[i])
				is[i - 1] = is[i];
			    f += f_1309_;
			    i++;
			    if (!bool_1303_
				|| f < ((Class155_Backup) this).aFloatArray1739[i])
				is[i - 1] = is[i];
			    f += f_1309_;
			}
			i_1306_ = i_1308_ - i_1307_ & 0x3;
			while (--i_1306_ >= 0) {
			    i++;
			    if (!bool_1303_
				|| f < ((Class155_Backup) this).aFloatArray1739[i])
				is[i - 1] = is[i];
			    f += f_1309_;
			}
		    }
		} else {
		    int i_1317_ = ((Class155_Backup) this).anInt1723;
		    int i_1318_ = 256 - ((Class155_Backup) this).anInt1723;
		    i_1305_ = (((i_1305_ & 0xff00ff) * i_1318_ >> 8 & 0xff00ff)
			       + ((i_1305_ & 0xff00) * i_1318_ >> 8 & 0xff00));
		    while (--i_1306_ >= 0) {
			i++;
			if (!bool_1303_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    int i_1319_ = is[i];
			    if (bool_1304_)
				is[i]
				    = ((i_1318_ | i_1319_ >> 24) << 24
				       | (i_1305_
					  + (((i_1319_ & 0xff00ff) * i_1317_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1319_ & 0xff00) * i_1317_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_1305_
					 + ((i_1319_ & 0xff00ff) * i_1317_ >> 8
					    & 0xff00ff)
					 + ((i_1319_ & 0xff00) * i_1317_ >> 8
					    & 0xff00));
			}
			f += f_1309_;
			i++;
			if (!bool_1303_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    int i_1320_ = is[i];
			    if (bool_1304_)
				is[i]
				    = ((i_1318_ | i_1320_ >> 24) << 24
				       | (i_1305_
					  + (((i_1320_ & 0xff00ff) * i_1317_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1320_ & 0xff00) * i_1317_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_1305_
					 + ((i_1320_ & 0xff00ff) * i_1317_ >> 8
					    & 0xff00ff)
					 + ((i_1320_ & 0xff00) * i_1317_ >> 8
					    & 0xff00));
			}
			f += f_1309_;
			i++;
			if (!bool_1303_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    int i_1321_ = is[i];
			    if (bool_1304_)
				is[i]
				    = ((i_1318_ | i_1321_ >> 24) << 24
				       | (i_1305_
					  + (((i_1321_ & 0xff00ff) * i_1317_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1321_ & 0xff00) * i_1317_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_1305_
					 + ((i_1321_ & 0xff00ff) * i_1317_ >> 8
					    & 0xff00ff)
					 + ((i_1321_ & 0xff00) * i_1317_ >> 8
					    & 0xff00));
			}
			f += f_1309_;
			i++;
			if (!bool_1303_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    int i_1322_ = is[i];
			    if (bool_1304_)
				is[i]
				    = ((i_1318_ | i_1322_ >> 24) << 24
				       | (i_1305_
					  + (((i_1322_ & 0xff00ff) * i_1317_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1322_ & 0xff00) * i_1317_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_1305_
					 + ((i_1322_ & 0xff00ff) * i_1317_ >> 8
					    & 0xff00ff)
					 + ((i_1322_ & 0xff00) * i_1317_ >> 8
					    & 0xff00));
			}
			f += f_1309_;
		    }
		    i_1306_ = i_1308_ - i_1307_ & 0x3;
		    while (--i_1306_ >= 0) {
			i++;
			if (!bool_1303_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    int i_1323_ = is[i];
			    if (bool_1304_)
				is[i]
				    = ((i_1318_ | i_1323_ >> 24) << 24
				       | (i_1305_
					  + (((i_1323_ & 0xff00ff) * i_1317_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1323_ & 0xff00) * i_1317_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_1305_
					 + ((i_1323_ & 0xff00ff) * i_1317_ >> 8
					    & 0xff00ff)
					 + ((i_1323_ & 0xff00) * i_1317_ >> 8
					    & 0xff00));
			}
			f += f_1309_;
		    }
		}
	    }
	}
    }
    
    final void method3374(boolean bool, boolean bool_1324_, boolean bool_1325_,
			  int[] is, int i, int i_1326_, int i_1327_,
			  int i_1328_, int i_1329_, float f, float f_1330_) {
	if (((Class155_Backup) this).aBool1748) {
	    if (i_1329_ > ((Class155_Backup) this).anInt1733)
		i_1329_ = ((Class155_Backup) this).anInt1733;
	    if (i_1328_ < 0)
		i_1328_ = 0;
	}
	if (i_1328_ < i_1329_) {
	    i += i_1328_ - 1;
	    i_1327_ = i_1329_ - i_1328_ >> 2;
	    f += f_1330_ * (float) i_1328_;
	    if (((Class189) ((Class155_Backup) this).aClass189_1736).aBool2220) {
		if (((Class155_Backup) this).anInt1723 == 0) {
		    while (--i_1327_ >= 0) {
			i++;
			if (!bool_1324_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool)
				is[i] = i_1326_;
			    if (bool_1324_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1330_;
			i++;
			if (!bool_1324_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool)
				is[i] = i_1326_;
			    if (bool_1324_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1330_;
			i++;
			if (!bool_1324_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool)
				is[i] = i_1326_;
			    if (bool_1324_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1330_;
			i++;
			if (!bool_1324_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool)
				is[i] = i_1326_;
			    if (bool_1324_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1330_;
		    }
		    i_1327_ = i_1329_ - i_1328_ & 0x3;
		    while (--i_1327_ >= 0) {
			i++;
			if (!bool_1324_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool)
				is[i] = i_1326_;
			    if (bool_1324_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1330_;
		    }
		} else if (((Class155_Backup) this).anInt1723 == 254) {
		    if (i_1328_ != 0
			&& i_1329_ <= ((Class155_Backup) this).anInt1733 - 1) {
			while (--i_1327_ >= 0) {
			    i++;
			    if ((!bool_1324_
				 || f < ((Class155_Backup) this).aFloatArray1739[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_1330_;
			    i++;
			    if ((!bool_1324_
				 || f < ((Class155_Backup) this).aFloatArray1739[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_1330_;
			    i++;
			    if ((!bool_1324_
				 || f < ((Class155_Backup) this).aFloatArray1739[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_1330_;
			    i++;
			    if ((!bool_1324_
				 || f < ((Class155_Backup) this).aFloatArray1739[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_1330_;
			}
			i_1327_ = i_1329_ - i_1328_ & 0x3;
			while (--i_1327_ >= 0) {
			    i++;
			    if ((!bool_1324_
				 || f < ((Class155_Backup) this).aFloatArray1739[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_1330_;
			}
		    }
		} else {
		    int i_1331_ = ((Class155_Backup) this).anInt1723;
		    int i_1332_ = 256 - ((Class155_Backup) this).anInt1723;
		    i_1326_ = (((i_1326_ & 0xff00ff) * i_1332_ >> 8 & 0xff00ff)
			       + ((i_1326_ & 0xff00) * i_1332_ >> 8 & 0xff00));
		    while (--i_1327_ >= 0) {
			i++;
			if (!bool_1324_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool) {
				int i_1333_ = is[i];
				if (bool_1325_)
				    is[i]
					= ((i_1332_ | i_1333_ >> 24) << 24
					   | (i_1326_
					      + (((i_1333_ & 0xff00ff)
						  * i_1331_) >> 8
						 & 0xff00ff)
					      + (((i_1333_ & 0xff00) * i_1331_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1326_
					   + (((i_1333_ & 0xff00ff) * i_1331_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1333_ & 0xff00) * i_1331_ >> 8
					      & 0xff00));
			    }
			    if (bool_1324_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1330_;
			i++;
			if (!bool_1324_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool) {
				int i_1334_ = is[i];
				if (bool_1325_)
				    is[i]
					= ((i_1332_ | i_1334_ >> 24) << 24
					   | (i_1326_
					      + (((i_1334_ & 0xff00ff)
						  * i_1331_) >> 8
						 & 0xff00ff)
					      + (((i_1334_ & 0xff00) * i_1331_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1326_
					   + (((i_1334_ & 0xff00ff) * i_1331_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1334_ & 0xff00) * i_1331_ >> 8
					      & 0xff00));
			    }
			    if (bool_1324_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1330_;
			i++;
			if (!bool_1324_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool) {
				int i_1335_ = is[i];
				if (bool_1325_)
				    is[i]
					= ((i_1332_ | i_1335_ >> 24) << 24
					   | (i_1326_
					      + (((i_1335_ & 0xff00ff)
						  * i_1331_) >> 8
						 & 0xff00ff)
					      + (((i_1335_ & 0xff00) * i_1331_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1326_
					   + (((i_1335_ & 0xff00ff) * i_1331_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1335_ & 0xff00) * i_1331_ >> 8
					      & 0xff00));
			    }
			    if (bool_1324_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1330_;
			i++;
			if (!bool_1324_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool) {
				int i_1336_ = is[i];
				if (bool_1325_)
				    is[i]
					= ((i_1332_ | i_1336_ >> 24) << 24
					   | (i_1326_
					      + (((i_1336_ & 0xff00ff)
						  * i_1331_) >> 8
						 & 0xff00ff)
					      + (((i_1336_ & 0xff00) * i_1331_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1326_
					   + (((i_1336_ & 0xff00ff) * i_1331_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1336_ & 0xff00) * i_1331_ >> 8
					      & 0xff00));
			    }
			    if (bool_1324_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1330_;
		    }
		    i_1327_ = i_1329_ - i_1328_ & 0x3;
		    while (--i_1327_ >= 0) {
			i++;
			if (!bool_1324_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    if (bool) {
				int i_1337_ = is[i];
				if (bool_1325_)
				    is[i]
					= ((i_1332_ | i_1337_ >> 24) << 24
					   | (i_1326_
					      + (((i_1337_ & 0xff00ff)
						  * i_1331_) >> 8
						 & 0xff00ff)
					      + (((i_1337_ & 0xff00) * i_1331_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1326_
					   + (((i_1337_ & 0xff00ff) * i_1331_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1337_ & 0xff00) * i_1331_ >> 8
					      & 0xff00));
			    }
			    if (bool_1324_)
				((Class155_Backup) this).aFloatArray1739[i] = f;
			}
			f += f_1330_;
		    }
		}
	    } else if (bool) {
		if (((Class155_Backup) this).anInt1723 == 0) {
		    while (--i_1327_ >= 0) {
			i++;
			if (!bool_1324_
			    || f < ((Class155_Backup) this).aFloatArray1739[i])
			    is[i] = i_1326_;
			f += f_1330_;
			i++;
			if (!bool_1324_
			    || f < ((Class155_Backup) this).aFloatArray1739[i])
			    is[i] = i_1326_;
			f += f_1330_;
			i++;
			if (!bool_1324_
			    || f < ((Class155_Backup) this).aFloatArray1739[i])
			    is[i] = i_1326_;
			f += f_1330_;
			i++;
			if (!bool_1324_
			    || f < ((Class155_Backup) this).aFloatArray1739[i])
			    is[i] = i_1326_;
			f += f_1330_;
		    }
		    i_1327_ = i_1329_ - i_1328_ & 0x3;
		    while (--i_1327_ >= 0) {
			i++;
			if (!bool_1324_
			    || f < ((Class155_Backup) this).aFloatArray1739[i])
			    is[i] = i_1326_;
			f += f_1330_;
		    }
		} else if (((Class155_Backup) this).anInt1723 == 254) {
		    if (i_1328_ != 0
			&& i_1329_ <= ((Class155_Backup) this).anInt1733 - 1) {
			while (--i_1327_ >= 0) {
			    i++;
			    if (!bool_1324_
				|| f < ((Class155_Backup) this).aFloatArray1739[i])
				is[i - 1] = is[i];
			    f += f_1330_;
			    i++;
			    if (!bool_1324_
				|| f < ((Class155_Backup) this).aFloatArray1739[i])
				is[i - 1] = is[i];
			    f += f_1330_;
			    i++;
			    if (!bool_1324_
				|| f < ((Class155_Backup) this).aFloatArray1739[i])
				is[i - 1] = is[i];
			    f += f_1330_;
			    i++;
			    if (!bool_1324_
				|| f < ((Class155_Backup) this).aFloatArray1739[i])
				is[i - 1] = is[i];
			    f += f_1330_;
			}
			i_1327_ = i_1329_ - i_1328_ & 0x3;
			while (--i_1327_ >= 0) {
			    i++;
			    if (!bool_1324_
				|| f < ((Class155_Backup) this).aFloatArray1739[i])
				is[i - 1] = is[i];
			    f += f_1330_;
			}
		    }
		} else {
		    int i_1338_ = ((Class155_Backup) this).anInt1723;
		    int i_1339_ = 256 - ((Class155_Backup) this).anInt1723;
		    i_1326_ = (((i_1326_ & 0xff00ff) * i_1339_ >> 8 & 0xff00ff)
			       + ((i_1326_ & 0xff00) * i_1339_ >> 8 & 0xff00));
		    while (--i_1327_ >= 0) {
			i++;
			if (!bool_1324_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    int i_1340_ = is[i];
			    if (bool_1325_)
				is[i]
				    = ((i_1339_ | i_1340_ >> 24) << 24
				       | (i_1326_
					  + (((i_1340_ & 0xff00ff) * i_1338_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1340_ & 0xff00) * i_1338_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_1326_
					 + ((i_1340_ & 0xff00ff) * i_1338_ >> 8
					    & 0xff00ff)
					 + ((i_1340_ & 0xff00) * i_1338_ >> 8
					    & 0xff00));
			}
			f += f_1330_;
			i++;
			if (!bool_1324_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    int i_1341_ = is[i];
			    if (bool_1325_)
				is[i]
				    = ((i_1339_ | i_1341_ >> 24) << 24
				       | (i_1326_
					  + (((i_1341_ & 0xff00ff) * i_1338_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1341_ & 0xff00) * i_1338_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_1326_
					 + ((i_1341_ & 0xff00ff) * i_1338_ >> 8
					    & 0xff00ff)
					 + ((i_1341_ & 0xff00) * i_1338_ >> 8
					    & 0xff00));
			}
			f += f_1330_;
			i++;
			if (!bool_1324_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    int i_1342_ = is[i];
			    if (bool_1325_)
				is[i]
				    = ((i_1339_ | i_1342_ >> 24) << 24
				       | (i_1326_
					  + (((i_1342_ & 0xff00ff) * i_1338_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1342_ & 0xff00) * i_1338_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_1326_
					 + ((i_1342_ & 0xff00ff) * i_1338_ >> 8
					    & 0xff00ff)
					 + ((i_1342_ & 0xff00) * i_1338_ >> 8
					    & 0xff00));
			}
			f += f_1330_;
			i++;
			if (!bool_1324_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    int i_1343_ = is[i];
			    if (bool_1325_)
				is[i]
				    = ((i_1339_ | i_1343_ >> 24) << 24
				       | (i_1326_
					  + (((i_1343_ & 0xff00ff) * i_1338_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1343_ & 0xff00) * i_1338_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_1326_
					 + ((i_1343_ & 0xff00ff) * i_1338_ >> 8
					    & 0xff00ff)
					 + ((i_1343_ & 0xff00) * i_1338_ >> 8
					    & 0xff00));
			}
			f += f_1330_;
		    }
		    i_1327_ = i_1329_ - i_1328_ & 0x3;
		    while (--i_1327_ >= 0) {
			i++;
			if (!bool_1324_
			    || f < ((Class155_Backup) this).aFloatArray1739[i]) {
			    int i_1344_ = is[i];
			    if (bool_1325_)
				is[i]
				    = ((i_1339_ | i_1344_ >> 24) << 24
				       | (i_1326_
					  + (((i_1344_ & 0xff00ff) * i_1338_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1344_ & 0xff00) * i_1338_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_1326_
					 + ((i_1344_ & 0xff00ff) * i_1338_ >> 8
					    & 0xff00ff)
					 + ((i_1344_ & 0xff00) * i_1338_ >> 8
					    & 0xff00));
			}
			f += f_1330_;
		    }
		}
	    }
	}
    }
    
    final void method3375
	(boolean bool, boolean bool_1345_, int[] is, int[] is_1346_, int i,
	 int i_1347_, int i_1348_, float f, float f_1349_, float f_1350_,
	 float f_1351_, float f_1352_, float f_1353_, float f_1354_,
	 float f_1355_, float f_1356_, float f_1357_, float f_1358_,
	 float f_1359_, float f_1360_, float f_1361_, float f_1362_,
	 float f_1363_, float f_1364_, float f_1365_) {
	int i_1366_ = i_1348_ - i_1347_;
	float f_1367_ = 1.0F / (float) i_1366_;
	float f_1368_ = (f_1349_ - f) * f_1367_;
	float f_1369_ = (f_1351_ - f_1350_) * f_1367_;
	float f_1370_ = (f_1353_ - f_1352_) * f_1367_;
	float f_1371_ = (f_1355_ - f_1354_) * f_1367_;
	float f_1372_ = (f_1357_ - f_1356_) * f_1367_;
	float f_1373_ = (f_1359_ - f_1358_) * f_1367_;
	float f_1374_ = (f_1361_ - f_1360_) * f_1367_;
	float f_1375_ = (f_1363_ - f_1362_) * f_1367_;
	float f_1376_ = (f_1365_ - f_1364_) * f_1367_;
	if (((Class155_Backup) this).aBool1748) {
	    if (i_1348_ > ((Class155_Backup) this).anInt1733)
		i_1348_ = ((Class155_Backup) this).anInt1733;
	    if (i_1347_ < 0) {
		f -= f_1368_ * (float) i_1347_;
		f_1350_ -= f_1369_ * (float) i_1347_;
		f_1352_ -= f_1370_ * (float) i_1347_;
		f_1354_ -= f_1371_ * (float) i_1347_;
		f_1356_ -= f_1372_ * (float) i_1347_;
		f_1358_ -= f_1373_ * (float) i_1347_;
		f_1360_ -= f_1374_ * (float) i_1347_;
		f_1362_ -= f_1375_ * (float) i_1347_;
		f_1364_ -= f_1376_ * (float) i_1347_;
		i_1347_ = 0;
	    }
	}
	if (i_1347_ < i_1348_) {
	    i_1366_ = i_1348_ - i_1347_;
	    i += i_1347_;
	    while (i_1366_-- > 0) {
		float f_1377_ = 1.0F / f;
		float f_1378_ = 1.0F / f_1350_;
		if (!bool || f_1377_ < ((Class155_Backup) this).aFloatArray1739[i]) {
		    int i_1379_
			= (int) (f_1352_ * f_1378_
				 * (float) ((Class155_Backup) this).anInt1752);
		    if (((Class155_Backup) this).aBool1741)
			i_1379_ &= ((Class155_Backup) this).anInt1744;
		    else if (i_1379_ < 0)
			i_1379_ = 0;
		    else if (i_1379_ > ((Class155_Backup) this).anInt1744)
			i_1379_ = ((Class155_Backup) this).anInt1744;
		    int i_1380_
			= (int) (f_1354_ * f_1378_
				 * (float) ((Class155_Backup) this).anInt1752);
		    if (((Class155_Backup) this).aBool1741)
			i_1380_ &= ((Class155_Backup) this).anInt1744;
		    else if (i_1380_ < 0)
			i_1380_ = 0;
		    else if (i_1380_ > ((Class155_Backup) this).anInt1744)
			i_1380_ = ((Class155_Backup) this).anInt1744;
		    int i_1381_
			= (((Class155_Backup) this).anIntArray1725
			   [i_1380_ * ((Class155_Backup) this).anInt1752 + i_1379_]);
		    int i_1382_ = 255;
		    if (((Class155_Backup) this).aClass529_1746
			== Class529.aClass529_6944)
			i_1382_ = (int) ((float) (i_1381_ >> 24 & 0xff)
					 * f_1358_ / 255.0F);
		    else if (((Class155_Backup) this).aClass529_1746
			     == Class529.aClass529_6943) {
			if ((i_1381_ >> 24 & 0xff)
			    > ((Class155_Backup) this).anInt1747)
			    i_1382_ = 255;
			else
			    i_1382_ = 0;
		    } else
			i_1382_ = (int) f_1358_;
		    if (i_1382_ != 0) {
			if (i_1382_ != 255) {
			    int i_1383_
				= (~0xffffff
				   | ((int) (f_1360_ * (float) (i_1381_ >> 16
								& 0xff)) << 8
				      & 0xff0000)
				   | ((int) (f_1362_
					     * (float) (i_1381_ >> 8 & 0xff))
				      & 0xff00)
				   | (int) (f_1364_
					    * (float) (i_1381_ & 0xff)) >> 8);
			    if (f_1356_ != 0.0F) {
				int i_1384_ = (int) (255.0F - f_1356_);
				int i_1385_
				    = ((((Class155_Backup) this).anInt1740
					& 0xff00ff) * (int) f_1356_ & ~0xff00ff
				       | ((((Class155_Backup) this).anInt1740
					   & 0xff00) * (int) f_1356_
					  & 0xff0000)) >>> 8;
				i_1383_ = ((((i_1383_ & 0xff00ff) * i_1384_
					     & ~0xff00ff)
					    | ((i_1383_ & 0xff00) * i_1384_
					       & 0xff0000))
					   >>> 8) + i_1385_;
			    }
			    int i_1386_ = is[i];
			    int i_1387_ = 255 - i_1382_;
			    i_1383_ = ((((i_1386_ & 0xff00ff) * i_1387_
					 + (i_1383_ & 0xff00ff) * i_1382_)
					& ~0xff00ff)
				       + (((i_1386_ & 0xff00) * i_1387_
					   + (i_1383_ & 0xff00) * i_1382_)
					  & 0xff0000)) >> 8;
			    if (bool_1345_)
				is[i]
				    = (i_1382_ | is[i] >> 24) << 24 | i_1383_;
			    else
				is[i] = i_1383_;
			    if (bool)
				((Class155_Backup) this).aFloatArray1739[i] = f_1377_;
			} else {
			    int i_1388_
				= (~0xffffff
				   | ((int) (f_1360_ * (float) (i_1381_ >> 16
								& 0xff)) << 8
				      & 0xff0000)
				   | ((int) (f_1362_
					     * (float) (i_1381_ >> 8 & 0xff))
				      & 0xff00)
				   | (int) (f_1364_
					    * (float) (i_1381_ & 0xff)) >> 8);
			    if (f_1356_ != 0.0F) {
				int i_1389_ = (int) (255.0F - f_1356_);
				int i_1390_
				    = ((((Class155_Backup) this).anInt1740
					& 0xff00ff) * (int) f_1356_ & ~0xff00ff
				       | ((((Class155_Backup) this).anInt1740
					   & 0xff00) * (int) f_1356_
					  & 0xff0000)) >>> 8;
				i_1388_ = ((((i_1388_ & 0xff00ff) * i_1389_
					     & ~0xff00ff)
					    | ((i_1388_ & 0xff00) * i_1389_
					       & 0xff0000))
					   >>> 8) + i_1390_;
			    }
			    if (bool_1345_)
				is[i] = i_1382_ << 24 | i_1388_;
			    else
				is[i] = i_1388_;
			    if (bool)
				((Class155_Backup) this).aFloatArray1739[i] = f_1377_;
			}
		    }
		}
		i++;
		f += f_1368_;
		f_1350_ += f_1369_;
		f_1352_ += f_1370_;
		f_1354_ += f_1371_;
		f_1356_ += f_1372_;
		f_1358_ += f_1373_;
		f_1360_ += f_1374_;
		f_1362_ += f_1375_;
		f_1364_ += f_1376_;
	    }
	}
    }
    
    final void method3376
	(boolean bool, boolean bool_1391_, int[] is, int[] is_1392_, int i,
	 int i_1393_, int i_1394_, float f, float f_1395_, float f_1396_,
	 float f_1397_, float f_1398_, float f_1399_, float f_1400_,
	 float f_1401_, float f_1402_, float f_1403_, float f_1404_,
	 float f_1405_, float f_1406_, float f_1407_, float f_1408_,
	 float f_1409_, float f_1410_, float f_1411_) {
	int i_1412_ = i_1394_ - i_1393_;
	float f_1413_ = 1.0F / (float) i_1412_;
	float f_1414_ = (f_1395_ - f) * f_1413_;
	float f_1415_ = (f_1397_ - f_1396_) * f_1413_;
	float f_1416_ = (f_1399_ - f_1398_) * f_1413_;
	float f_1417_ = (f_1401_ - f_1400_) * f_1413_;
	float f_1418_ = (f_1403_ - f_1402_) * f_1413_;
	float f_1419_ = (f_1405_ - f_1404_) * f_1413_;
	float f_1420_ = (f_1407_ - f_1406_) * f_1413_;
	float f_1421_ = (f_1409_ - f_1408_) * f_1413_;
	float f_1422_ = (f_1411_ - f_1410_) * f_1413_;
	if (((Class155_Backup) this).aBool1748) {
	    if (i_1394_ > ((Class155_Backup) this).anInt1733)
		i_1394_ = ((Class155_Backup) this).anInt1733;
	    if (i_1393_ < 0) {
		f -= f_1414_ * (float) i_1393_;
		f_1396_ -= f_1415_ * (float) i_1393_;
		f_1398_ -= f_1416_ * (float) i_1393_;
		f_1400_ -= f_1417_ * (float) i_1393_;
		f_1402_ -= f_1418_ * (float) i_1393_;
		f_1404_ -= f_1419_ * (float) i_1393_;
		f_1406_ -= f_1420_ * (float) i_1393_;
		f_1408_ -= f_1421_ * (float) i_1393_;
		f_1410_ -= f_1422_ * (float) i_1393_;
		i_1393_ = 0;
	    }
	}
	if (i_1393_ < i_1394_) {
	    i_1412_ = i_1394_ - i_1393_;
	    i += i_1393_;
	    while (i_1412_-- > 0) {
		float f_1423_ = 1.0F / f;
		float f_1424_ = 1.0F / f_1396_;
		if (!bool || f_1423_ < ((Class155_Backup) this).aFloatArray1739[i]) {
		    int i_1425_
			= (int) (f_1398_ * f_1424_
				 * (float) ((Class155_Backup) this).anInt1752);
		    if (((Class155_Backup) this).aBool1741)
			i_1425_ &= ((Class155_Backup) this).anInt1744;
		    else if (i_1425_ < 0)
			i_1425_ = 0;
		    else if (i_1425_ > ((Class155_Backup) this).anInt1744)
			i_1425_ = ((Class155_Backup) this).anInt1744;
		    int i_1426_
			= (int) (f_1400_ * f_1424_
				 * (float) ((Class155_Backup) this).anInt1752);
		    if (((Class155_Backup) this).aBool1741)
			i_1426_ &= ((Class155_Backup) this).anInt1744;
		    else if (i_1426_ < 0)
			i_1426_ = 0;
		    else if (i_1426_ > ((Class155_Backup) this).anInt1744)
			i_1426_ = ((Class155_Backup) this).anInt1744;
		    int i_1427_
			= (((Class155_Backup) this).anIntArray1725
			   [i_1426_ * ((Class155_Backup) this).anInt1752 + i_1425_]);
		    int i_1428_ = 255;
		    if (((Class155_Backup) this).aClass529_1746
			== Class529.aClass529_6944)
			i_1428_ = (int) ((float) (i_1427_ >> 24 & 0xff)
					 * f_1404_ / 255.0F);
		    else if (((Class155_Backup) this).aClass529_1746
			     == Class529.aClass529_6943) {
			if ((i_1427_ >> 24 & 0xff)
			    > ((Class155_Backup) this).anInt1747)
			    i_1428_ = 255;
			else
			    i_1428_ = 0;
		    } else
			i_1428_ = (int) f_1404_;
		    if (i_1428_ != 0) {
			if (i_1428_ != 255) {
			    int i_1429_
				= (~0xffffff
				   | ((int) (f_1406_ * (float) (i_1427_ >> 16
								& 0xff)) << 8
				      & 0xff0000)
				   | ((int) (f_1408_
					     * (float) (i_1427_ >> 8 & 0xff))
				      & 0xff00)
				   | (int) (f_1410_
					    * (float) (i_1427_ & 0xff)) >> 8);
			    if (f_1402_ != 0.0F) {
				int i_1430_ = (int) (255.0F - f_1402_);
				int i_1431_
				    = ((((Class155_Backup) this).anInt1740
					& 0xff00ff) * (int) f_1402_ & ~0xff00ff
				       | ((((Class155_Backup) this).anInt1740
					   & 0xff00) * (int) f_1402_
					  & 0xff0000)) >>> 8;
				i_1429_ = ((((i_1429_ & 0xff00ff) * i_1430_
					     & ~0xff00ff)
					    | ((i_1429_ & 0xff00) * i_1430_
					       & 0xff0000))
					   >>> 8) + i_1431_;
			    }
			    int i_1432_ = is[i];
			    int i_1433_ = 255 - i_1428_;
			    i_1429_ = ((((i_1432_ & 0xff00ff) * i_1433_
					 + (i_1429_ & 0xff00ff) * i_1428_)
					& ~0xff00ff)
				       + (((i_1432_ & 0xff00) * i_1433_
					   + (i_1429_ & 0xff00) * i_1428_)
					  & 0xff0000)) >> 8;
			    if (bool_1391_)
				is[i]
				    = (i_1428_ | is[i] >> 24) << 24 | i_1429_;
			    else
				is[i] = i_1429_;
			    if (bool)
				((Class155_Backup) this).aFloatArray1739[i] = f_1423_;
			} else {
			    int i_1434_
				= (~0xffffff
				   | ((int) (f_1406_ * (float) (i_1427_ >> 16
								& 0xff)) << 8
				      & 0xff0000)
				   | ((int) (f_1408_
					     * (float) (i_1427_ >> 8 & 0xff))
				      & 0xff00)
				   | (int) (f_1410_
					    * (float) (i_1427_ & 0xff)) >> 8);
			    if (f_1402_ != 0.0F) {
				int i_1435_ = (int) (255.0F - f_1402_);
				int i_1436_
				    = ((((Class155_Backup) this).anInt1740
					& 0xff00ff) * (int) f_1402_ & ~0xff00ff
				       | ((((Class155_Backup) this).anInt1740
					   & 0xff00) * (int) f_1402_
					  & 0xff0000)) >>> 8;
				i_1434_ = ((((i_1434_ & 0xff00ff) * i_1435_
					     & ~0xff00ff)
					    | ((i_1434_ & 0xff00) * i_1435_
					       & 0xff0000))
					   >>> 8) + i_1436_;
			    }
			    if (bool_1391_)
				is[i] = i_1428_ << 24 | i_1434_;
			    else
				is[i] = i_1434_;
			    if (bool)
				((Class155_Backup) this).aFloatArray1739[i] = f_1423_;
			}
		    }
		}
		i++;
		f += f_1414_;
		f_1396_ += f_1415_;
		f_1398_ += f_1416_;
		f_1400_ += f_1417_;
		f_1402_ += f_1418_;
		f_1404_ += f_1419_;
		f_1406_ += f_1420_;
		f_1408_ += f_1421_;
		f_1410_ += f_1422_;
	    }
	}
    }
    
    final void method3377(boolean bool, boolean bool_1437_, boolean bool_1438_,
			  float f, float f_1439_, float f_1440_, float f_1441_,
			  float f_1442_, float f_1443_, float f_1444_,
			  float f_1445_, float f_1446_, int i) {
	if (((Class155_Backup) this).aBool1724) {
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517((int) f_1441_,
							     (int) f,
							     (int) f_1442_,
							     (int) f_1439_, i,
							     223909001);
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517((int) f_1442_,
							     (int) f_1439_,
							     (int) f_1443_,
							     (int) f_1440_, i,
							     223909001);
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517((int) f_1443_,
							     (int) f_1440_,
							     (int) f_1441_,
							     (int) f, i,
							     223909001);
	} else {
	    float f_1447_ = f_1442_ - f_1441_;
	    float f_1448_ = f_1439_ - f;
	    float f_1449_ = f_1443_ - f_1441_;
	    float f_1450_ = f_1440_ - f;
	    float f_1451_ = f_1445_ - f_1444_;
	    float f_1452_ = f_1446_ - f_1444_;
	    float f_1453_ = 0.0F;
	    if (f_1439_ != f)
		f_1453_ = (f_1442_ - f_1441_) / (f_1439_ - f);
	    float f_1454_ = 0.0F;
	    if (f_1440_ != f_1439_)
		f_1454_ = (f_1443_ - f_1442_) / (f_1440_ - f_1439_);
	    float f_1455_ = 0.0F;
	    if (f_1440_ != f)
		f_1455_ = (f_1441_ - f_1443_) / (f - f_1440_);
	    float f_1456_ = f_1447_ * f_1450_ - f_1449_ * f_1448_;
	    if (f_1456_ != 0.0F) {
		float f_1457_
		    = (f_1451_ * f_1450_ - f_1452_ * f_1448_) / f_1456_;
		float f_1458_
		    = (f_1452_ * f_1447_ - f_1451_ * f_1449_) / f_1456_;
		if (f <= f_1439_ && f <= f_1440_) {
		    if (!(f >= (float) ((Class155_Backup) this).anInt1726)) {
			if (f_1439_ > (float) ((Class155_Backup) this).anInt1726)
			    f_1439_ = (float) ((Class155_Backup) this).anInt1726;
			if (f_1440_ > (float) ((Class155_Backup) this).anInt1726)
			    f_1440_ = (float) ((Class155_Backup) this).anInt1726;
			f_1444_ = f_1444_ - f_1457_ * f_1441_ + f_1457_;
			if (f_1439_ < f_1440_) {
			    f_1443_ = f_1441_;
			    if (f < 0.0F) {
				f_1443_ -= f_1455_ * f;
				f_1441_ -= f_1453_ * f;
				f_1444_ -= f_1458_ * f;
				f = 0.0F;
			    }
			    if (f_1439_ < 0.0F) {
				f_1442_ -= f_1454_ * f_1439_;
				f_1439_ = 0.0F;
			    }
			    if (f != f_1439_ && f_1455_ < f_1453_
				|| f == f_1439_ && f_1455_ > f_1454_) {
				f += 0.5F;
				f_1439_ += 0.5F;
				f_1440_
				    = (float) (int) (f_1440_ + 0.5F) - f_1439_;
				f_1439_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_1439_ >= 0.0F) {
				    method3374(bool, bool_1437_, bool_1438_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, i, 0, (int) f_1443_,
					       (int) f_1441_, f_1444_,
					       f_1457_);
				    f_1443_ += f_1455_;
				    f_1441_ += f_1453_;
				    f_1444_ += f_1458_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_1440_ >= 0.0F) {
				    method3374(bool, bool_1437_, bool_1438_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, i, 0, (int) f_1443_,
					       (int) f_1442_, f_1444_,
					       f_1457_);
				    f_1443_ += f_1455_;
				    f_1442_ += f_1454_;
				    f_1444_ += f_1458_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f += 0.5F;
				f_1439_ += 0.5F;
				f_1440_
				    = (float) (int) (f_1440_ + 0.5F) - f_1439_;
				f_1439_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_1439_ >= 0.0F) {
				    method3374(bool, bool_1437_, bool_1438_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, i, 0, (int) f_1441_,
					       (int) f_1443_, f_1444_,
					       f_1457_);
				    f_1443_ += f_1455_;
				    f_1441_ += f_1453_;
				    f_1444_ += f_1458_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_1440_ >= 0.0F) {
				    method3374(bool, bool_1437_, bool_1438_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, i, 0, (int) f_1442_,
					       (int) f_1443_, f_1444_,
					       f_1457_);
				    f_1443_ += f_1455_;
				    f_1442_ += f_1454_;
				    f_1444_ += f_1458_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			} else {
			    f_1442_ = f_1441_;
			    if (f < 0.0F) {
				f_1442_ -= f_1455_ * f;
				f_1441_ -= f_1453_ * f;
				f_1444_ -= f_1458_ * f;
				f = 0.0F;
			    }
			    if (f_1440_ < 0.0F) {
				f_1443_ -= f_1454_ * f_1440_;
				f_1440_ = 0.0F;
			    }
			    if (f != f_1440_ && f_1455_ < f_1453_
				|| f == f_1440_ && f_1454_ > f_1453_) {
				f += 0.5F;
				f_1440_ += 0.5F;
				f_1439_
				    = (float) (int) (f_1439_ + 0.5F) - f_1440_;
				f_1440_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_1440_ >= 0.0F) {
				    method3374(bool, bool_1437_, bool_1438_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, i, 0, (int) f_1442_,
					       (int) f_1441_, f_1444_,
					       f_1457_);
				    f_1442_ += f_1455_;
				    f_1441_ += f_1453_;
				    f_1444_ += f_1458_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_1439_ >= 0.0F) {
				    method3374(bool, bool_1437_, bool_1438_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, i, 0, (int) f_1443_,
					       (int) f_1441_, f_1444_,
					       f_1457_);
				    f_1443_ += f_1454_;
				    f_1441_ += f_1453_;
				    f_1444_ += f_1458_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f += 0.5F;
				f_1440_ += 0.5F;
				f_1439_
				    = (float) (int) (f_1439_ + 0.5F) - f_1440_;
				f_1440_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_1440_ >= 0.0F) {
				    method3374(bool, bool_1437_, bool_1438_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, i, 0, (int) f_1441_,
					       (int) f_1442_, f_1444_,
					       f_1457_);
				    f_1442_ += f_1455_;
				    f_1441_ += f_1453_;
				    f_1444_ += f_1458_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_1439_ >= 0.0F) {
				    method3374(bool, bool_1437_, bool_1438_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, i, 0, (int) f_1441_,
					       (int) f_1443_, f_1444_,
					       f_1457_);
				    f_1443_ += f_1454_;
				    f_1441_ += f_1453_;
				    f_1444_ += f_1458_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			}
		    }
		} else if (f_1439_ <= f_1440_) {
		    if (!(f_1439_ >= (float) ((Class155_Backup) this).anInt1726)) {
			if (f_1440_ > (float) ((Class155_Backup) this).anInt1726)
			    f_1440_ = (float) ((Class155_Backup) this).anInt1726;
			if (f > (float) ((Class155_Backup) this).anInt1726)
			    f = (float) ((Class155_Backup) this).anInt1726;
			f_1445_ = f_1445_ - f_1457_ * f_1442_ + f_1457_;
			if (f_1440_ < f) {
			    f_1441_ = f_1442_;
			    if (f_1439_ < 0.0F) {
				f_1441_ -= f_1453_ * f_1439_;
				f_1442_ -= f_1454_ * f_1439_;
				f_1445_ -= f_1458_ * f_1439_;
				f_1439_ = 0.0F;
			    }
			    if (f_1440_ < 0.0F) {
				f_1443_ -= f_1455_ * f_1440_;
				f_1440_ = 0.0F;
			    }
			    if (f_1439_ != f_1440_ && f_1453_ < f_1454_
				|| f_1439_ == f_1440_ && f_1453_ > f_1455_) {
				f_1439_ += 0.5F;
				f_1440_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_1440_;
				f_1440_ -= f_1439_;
				f_1439_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1439_]);
				while (--f_1440_ >= 0.0F) {
				    method3374(bool, bool_1437_, bool_1438_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1439_, i, 0,
					       (int) f_1441_, (int) f_1442_,
					       f_1445_, f_1457_);
				    f_1441_ += f_1453_;
				    f_1442_ += f_1454_;
				    f_1445_ += f_1458_;
				    f_1439_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f >= 0.0F) {
				    method3374(bool, bool_1437_, bool_1438_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1439_, i, 0,
					       (int) f_1441_, (int) f_1443_,
					       f_1445_, f_1457_);
				    f_1441_ += f_1453_;
				    f_1443_ += f_1455_;
				    f_1445_ += f_1458_;
				    f_1439_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f_1439_ += 0.5F;
				f_1440_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_1440_;
				f_1440_ -= f_1439_;
				f_1439_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1439_]);
				while (--f_1440_ >= 0.0F) {
				    method3374(bool, bool_1437_, bool_1438_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1439_, i, 0,
					       (int) f_1442_, (int) f_1441_,
					       f_1445_, f_1457_);
				    f_1441_ += f_1453_;
				    f_1442_ += f_1454_;
				    f_1445_ += f_1458_;
				    f_1439_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f >= 0.0F) {
				    method3374(bool, bool_1437_, bool_1438_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1439_, i, 0,
					       (int) f_1443_, (int) f_1441_,
					       f_1445_, f_1457_);
				    f_1441_ += f_1453_;
				    f_1443_ += f_1455_;
				    f_1445_ += f_1458_;
				    f_1439_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			} else {
			    f_1443_ = f_1442_;
			    if (f_1439_ < 0.0F) {
				f_1443_ -= f_1453_ * f_1439_;
				f_1442_ -= f_1454_ * f_1439_;
				f_1445_ -= f_1458_ * f_1439_;
				f_1439_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_1441_ -= f_1455_ * f;
				f = 0.0F;
			    }
			    if (f_1453_ < f_1454_) {
				f_1439_ += 0.5F;
				f += 0.5F;
				f_1440_ = (float) (int) (f_1440_ + 0.5F) - f;
				f -= f_1439_;
				f_1439_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1439_]);
				while (--f >= 0.0F) {
				    method3374(bool, bool_1437_, bool_1438_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1439_, i, 0,
					       (int) f_1443_, (int) f_1442_,
					       f_1445_, f_1457_);
				    f_1443_ += f_1453_;
				    f_1442_ += f_1454_;
				    f_1445_ += f_1458_;
				    f_1439_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_1440_ >= 0.0F) {
				    method3374(bool, bool_1437_, bool_1438_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1439_, i, 0,
					       (int) f_1441_, (int) f_1442_,
					       f_1445_, f_1457_);
				    f_1441_ += f_1455_;
				    f_1442_ += f_1454_;
				    f_1445_ += f_1458_;
				    f_1439_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f_1439_ += 0.5F;
				f += 0.5F;
				f_1440_ = (float) (int) (f_1440_ + 0.5F) - f;
				f -= f_1439_;
				f_1439_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1439_]);
				while (--f >= 0.0F) {
				    method3374(bool, bool_1437_, bool_1438_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1439_, i, 0,
					       (int) f_1442_, (int) f_1443_,
					       f_1445_, f_1457_);
				    f_1443_ += f_1453_;
				    f_1442_ += f_1454_;
				    f_1445_ += f_1458_;
				    f_1439_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_1440_ >= 0.0F) {
				    method3374(bool, bool_1437_, bool_1438_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1439_, i, 0,
					       (int) f_1442_, (int) f_1441_,
					       f_1445_, f_1457_);
				    f_1441_ += f_1455_;
				    f_1442_ += f_1454_;
				    f_1445_ += f_1458_;
				    f_1439_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			}
		    }
		} else if (!(f_1440_ >= (float) ((Class155_Backup) this).anInt1726)) {
		    if (f > (float) ((Class155_Backup) this).anInt1726)
			f = (float) ((Class155_Backup) this).anInt1726;
		    if (f_1439_ > (float) ((Class155_Backup) this).anInt1726)
			f_1439_ = (float) ((Class155_Backup) this).anInt1726;
		    f_1446_ = f_1446_ - f_1457_ * f_1443_ + f_1457_;
		    if (f < f_1439_) {
			f_1442_ = f_1443_;
			if (f_1440_ < 0.0F) {
			    f_1442_ -= f_1454_ * f_1440_;
			    f_1443_ -= f_1455_ * f_1440_;
			    f_1446_ -= f_1458_ * f_1440_;
			    f_1440_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_1441_ -= f_1453_ * f;
			    f = 0.0F;
			}
			if (f_1454_ < f_1455_) {
			    f_1440_ += 0.5F;
			    f += 0.5F;
			    f_1439_ = (float) (int) (f_1439_ + 0.5F) - f;
			    f -= f_1440_;
			    f_1440_ = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1440_]);
			    while (--f >= 0.0F) {
				method3374(bool, bool_1437_, bool_1438_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1440_, i, 0, (int) f_1442_,
					   (int) f_1443_, f_1446_, f_1457_);
				f_1442_ += f_1454_;
				f_1443_ += f_1455_;
				f_1446_ += f_1458_;
				f_1440_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f_1439_ >= 0.0F) {
				method3374(bool, bool_1437_, bool_1438_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1440_, i, 0, (int) f_1442_,
					   (int) f_1441_, f_1446_, f_1457_);
				f_1442_ += f_1454_;
				f_1441_ += f_1453_;
				f_1446_ += f_1458_;
				f_1440_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			} else {
			    f_1440_ += 0.5F;
			    f += 0.5F;
			    f_1439_ = (float) (int) (f_1439_ + 0.5F) - f;
			    f -= f_1440_;
			    f_1440_ = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1440_]);
			    while (--f >= 0.0F) {
				method3374(bool, bool_1437_, bool_1438_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1440_, i, 0, (int) f_1443_,
					   (int) f_1442_, f_1446_, f_1457_);
				f_1442_ += f_1454_;
				f_1443_ += f_1455_;
				f_1446_ += f_1458_;
				f_1440_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f_1439_ >= 0.0F) {
				method3374(bool, bool_1437_, bool_1438_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1440_, i, 0, (int) f_1441_,
					   (int) f_1442_, f_1446_, f_1457_);
				f_1442_ += f_1454_;
				f_1441_ += f_1453_;
				f_1446_ += f_1458_;
				f_1440_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			}
		    } else {
			f_1441_ = f_1443_;
			if (f_1440_ < 0.0F) {
			    f_1441_ -= f_1454_ * f_1440_;
			    f_1443_ -= f_1455_ * f_1440_;
			    f_1446_ -= f_1458_ * f_1440_;
			    f_1440_ = 0.0F;
			}
			if (f_1439_ < 0.0F) {
			    f_1442_ -= f_1453_ * f_1439_;
			    f_1439_ = 0.0F;
			}
			if (f_1454_ < f_1455_) {
			    f_1440_ += 0.5F;
			    f_1439_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_1439_;
			    f_1439_ -= f_1440_;
			    f_1440_ = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1440_]);
			    while (--f_1439_ >= 0.0F) {
				method3374(bool, bool_1437_, bool_1438_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1440_, i, 0, (int) f_1441_,
					   (int) f_1443_, f_1446_, f_1457_);
				f_1441_ += f_1454_;
				f_1443_ += f_1455_;
				f_1446_ += f_1458_;
				f_1440_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f >= 0.0F) {
				method3374(bool, bool_1437_, bool_1438_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1440_, i, 0, (int) f_1442_,
					   (int) f_1443_, f_1446_, f_1457_);
				f_1442_ += f_1453_;
				f_1443_ += f_1455_;
				f_1446_ += f_1458_;
				f_1440_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			} else {
			    f_1440_ += 0.5F;
			    f_1439_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_1439_;
			    f_1439_ -= f_1440_;
			    f_1440_ = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1440_]);
			    while (--f_1439_ >= 0.0F) {
				method3374(bool, bool_1437_, bool_1438_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1440_, i, 0, (int) f_1443_,
					   (int) f_1441_, f_1446_, f_1457_);
				f_1441_ += f_1454_;
				f_1443_ += f_1455_;
				f_1446_ += f_1458_;
				f_1440_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f >= 0.0F) {
				method3374(bool, bool_1437_, bool_1438_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1440_, i, 0, (int) f_1443_,
					   (int) f_1442_, f_1446_, f_1457_);
				f_1442_ += f_1453_;
				f_1443_ += f_1455_;
				f_1446_ += f_1458_;
				f_1440_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method3378
	(boolean bool, boolean bool_1459_, int[] is, int[] is_1460_, int i,
	 int i_1461_, int i_1462_, float f, float f_1463_, float f_1464_,
	 float f_1465_, float f_1466_, float f_1467_, float f_1468_,
	 float f_1469_, float f_1470_, float f_1471_, float f_1472_,
	 float f_1473_, float f_1474_, float f_1475_, float f_1476_,
	 float f_1477_, float f_1478_, float f_1479_) {
	int i_1480_ = i_1462_ - i_1461_;
	float f_1481_ = 1.0F / (float) i_1480_;
	float f_1482_ = (f_1463_ - f) * f_1481_;
	float f_1483_ = (f_1465_ - f_1464_) * f_1481_;
	float f_1484_ = (f_1467_ - f_1466_) * f_1481_;
	float f_1485_ = (f_1469_ - f_1468_) * f_1481_;
	float f_1486_ = (f_1471_ - f_1470_) * f_1481_;
	float f_1487_ = (f_1473_ - f_1472_) * f_1481_;
	float f_1488_ = (f_1475_ - f_1474_) * f_1481_;
	float f_1489_ = (f_1477_ - f_1476_) * f_1481_;
	float f_1490_ = (f_1479_ - f_1478_) * f_1481_;
	if (((Class155_Backup) this).aBool1748) {
	    if (i_1462_ > ((Class155_Backup) this).anInt1733)
		i_1462_ = ((Class155_Backup) this).anInt1733;
	    if (i_1461_ < 0) {
		f -= f_1482_ * (float) i_1461_;
		f_1464_ -= f_1483_ * (float) i_1461_;
		f_1466_ -= f_1484_ * (float) i_1461_;
		f_1468_ -= f_1485_ * (float) i_1461_;
		f_1470_ -= f_1486_ * (float) i_1461_;
		f_1472_ -= f_1487_ * (float) i_1461_;
		f_1474_ -= f_1488_ * (float) i_1461_;
		f_1476_ -= f_1489_ * (float) i_1461_;
		f_1478_ -= f_1490_ * (float) i_1461_;
		i_1461_ = 0;
	    }
	}
	if (i_1461_ < i_1462_) {
	    i_1480_ = i_1462_ - i_1461_;
	    i += i_1461_;
	    while (i_1480_-- > 0) {
		float f_1491_ = 1.0F / f;
		float f_1492_ = 1.0F / f_1464_;
		if (!bool || f_1491_ < ((Class155_Backup) this).aFloatArray1739[i]) {
		    int i_1493_
			= (int) (f_1466_ * f_1492_
				 * (float) ((Class155_Backup) this).anInt1752);
		    if (((Class155_Backup) this).aBool1741)
			i_1493_ &= ((Class155_Backup) this).anInt1744;
		    else if (i_1493_ < 0)
			i_1493_ = 0;
		    else if (i_1493_ > ((Class155_Backup) this).anInt1744)
			i_1493_ = ((Class155_Backup) this).anInt1744;
		    int i_1494_
			= (int) (f_1468_ * f_1492_
				 * (float) ((Class155_Backup) this).anInt1752);
		    if (((Class155_Backup) this).aBool1741)
			i_1494_ &= ((Class155_Backup) this).anInt1744;
		    else if (i_1494_ < 0)
			i_1494_ = 0;
		    else if (i_1494_ > ((Class155_Backup) this).anInt1744)
			i_1494_ = ((Class155_Backup) this).anInt1744;
		    int i_1495_
			= (((Class155_Backup) this).anIntArray1725
			   [i_1494_ * ((Class155_Backup) this).anInt1752 + i_1493_]);
		    int i_1496_ = 255;
		    if (((Class155_Backup) this).aClass529_1746
			== Class529.aClass529_6944)
			i_1496_ = (int) ((float) (i_1495_ >> 24 & 0xff)
					 * f_1472_ / 255.0F);
		    else if (((Class155_Backup) this).aClass529_1746
			     == Class529.aClass529_6943) {
			if ((i_1495_ >> 24 & 0xff)
			    > ((Class155_Backup) this).anInt1747)
			    i_1496_ = 255;
			else
			    i_1496_ = 0;
		    } else
			i_1496_ = (int) f_1472_;
		    if (i_1496_ != 0) {
			if (i_1496_ != 255) {
			    int i_1497_
				= (~0xffffff
				   | ((int) (f_1474_ * (float) (i_1495_ >> 16
								& 0xff)) << 8
				      & 0xff0000)
				   | ((int) (f_1476_
					     * (float) (i_1495_ >> 8 & 0xff))
				      & 0xff00)
				   | (int) (f_1478_
					    * (float) (i_1495_ & 0xff)) >> 8);
			    if (f_1470_ != 0.0F) {
				int i_1498_ = (int) (255.0F - f_1470_);
				int i_1499_
				    = ((((Class155_Backup) this).anInt1740
					& 0xff00ff) * (int) f_1470_ & ~0xff00ff
				       | ((((Class155_Backup) this).anInt1740
					   & 0xff00) * (int) f_1470_
					  & 0xff0000)) >>> 8;
				i_1497_ = ((((i_1497_ & 0xff00ff) * i_1498_
					     & ~0xff00ff)
					    | ((i_1497_ & 0xff00) * i_1498_
					       & 0xff0000))
					   >>> 8) + i_1499_;
			    }
			    int i_1500_ = is[i];
			    int i_1501_ = 255 - i_1496_;
			    i_1497_ = ((((i_1500_ & 0xff00ff) * i_1501_
					 + (i_1497_ & 0xff00ff) * i_1496_)
					& ~0xff00ff)
				       + (((i_1500_ & 0xff00) * i_1501_
					   + (i_1497_ & 0xff00) * i_1496_)
					  & 0xff0000)) >> 8;
			    if (bool_1459_)
				is[i]
				    = (i_1496_ | is[i] >> 24) << 24 | i_1497_;
			    else
				is[i] = i_1497_;
			    if (bool)
				((Class155_Backup) this).aFloatArray1739[i] = f_1491_;
			} else {
			    int i_1502_
				= (~0xffffff
				   | ((int) (f_1474_ * (float) (i_1495_ >> 16
								& 0xff)) << 8
				      & 0xff0000)
				   | ((int) (f_1476_
					     * (float) (i_1495_ >> 8 & 0xff))
				      & 0xff00)
				   | (int) (f_1478_
					    * (float) (i_1495_ & 0xff)) >> 8);
			    if (f_1470_ != 0.0F) {
				int i_1503_ = (int) (255.0F - f_1470_);
				int i_1504_
				    = ((((Class155_Backup) this).anInt1740
					& 0xff00ff) * (int) f_1470_ & ~0xff00ff
				       | ((((Class155_Backup) this).anInt1740
					   & 0xff00) * (int) f_1470_
					  & 0xff0000)) >>> 8;
				i_1502_ = ((((i_1502_ & 0xff00ff) * i_1503_
					     & ~0xff00ff)
					    | ((i_1502_ & 0xff00) * i_1503_
					       & 0xff0000))
					   >>> 8) + i_1504_;
			    }
			    if (bool_1459_)
				is[i] = i_1496_ << 24 | i_1502_;
			    else
				is[i] = i_1502_;
			    if (bool)
				((Class155_Backup) this).aFloatArray1739[i] = f_1491_;
			}
		    }
		}
		i++;
		f += f_1482_;
		f_1464_ += f_1483_;
		f_1466_ += f_1484_;
		f_1468_ += f_1485_;
		f_1470_ += f_1486_;
		f_1472_ += f_1487_;
		f_1474_ += f_1488_;
		f_1476_ += f_1489_;
		f_1478_ += f_1490_;
	    }
	}
    }
    
    final void method3379
	(boolean bool, boolean bool_1505_, boolean bool_1506_, float f,
	 float f_1507_, float f_1508_, float f_1509_, float f_1510_,
	 float f_1511_, float f_1512_, float f_1513_, float f_1514_,
	 float f_1515_, float f_1516_, float f_1517_, float f_1518_,
	 float f_1519_, float f_1520_, float f_1521_, float f_1522_,
	 float f_1523_, int i, int i_1524_, int i_1525_, int i_1526_,
	 float f_1527_, float f_1528_, float f_1529_, int i_1530_, int i_1531_,
	 float f_1532_, int i_1533_, int i_1534_, float f_1535_, int i_1536_,
	 int i_1537_, float f_1538_) {
	if (!bool)
	    method3377(false, bool_1505_, bool_1506_, f, f_1507_, f_1508_,
		       f_1509_, f_1510_, f_1511_, f_1512_, f_1513_, f_1514_,
		       0);
	else {
	    ((Class155_Backup) this).anInt1740 = i_1526_;
	    if (!(f <= f_1507_) || !(f <= f_1508_)) {
		if (f_1507_ <= f_1508_) {
		    float f_1539_ = f_1509_;
		    f_1509_ = f_1510_;
		    f_1510_ = f_1539_;
		    f_1539_ = f;
		    f = f_1507_;
		    f_1507_ = f_1539_;
		    f_1539_ = f_1512_;
		    f_1512_ = f_1513_;
		    f_1513_ = f_1539_;
		    f_1539_ = f_1518_;
		    f_1518_ = f_1519_;
		    f_1519_ = f_1539_;
		    f_1539_ = f_1521_;
		    f_1521_ = f_1522_;
		    f_1522_ = f_1539_;
		    f_1539_ = f_1515_;
		    f_1515_ = f_1516_;
		    f_1516_ = f_1539_;
		    f_1539_ = f_1527_;
		    f_1527_ = f_1528_;
		    f_1528_ = f_1539_;
		    f_1539_ = f_1532_;
		    f_1532_ = f_1535_;
		    f_1535_ = f_1539_;
		    int i_1540_ = i;
		    i = i_1524_;
		    i_1524_ = i_1540_;
		    i_1540_ = i_1531_;
		    i_1531_ = i_1534_;
		    i_1534_ = i_1540_;
		    i_1540_ = i_1530_;
		    i_1530_ = i_1533_;
		    i_1533_ = i_1540_;
		} else {
		    float f_1541_ = f_1509_;
		    f_1509_ = f_1511_;
		    f_1511_ = f_1541_;
		    f_1541_ = f;
		    f = f_1508_;
		    f_1508_ = f_1541_;
		    f_1541_ = f_1512_;
		    f_1512_ = f_1514_;
		    f_1514_ = f_1541_;
		    f_1541_ = f_1518_;
		    f_1518_ = f_1520_;
		    f_1520_ = f_1541_;
		    f_1541_ = f_1521_;
		    f_1521_ = f_1523_;
		    f_1523_ = f_1541_;
		    f_1541_ = f_1515_;
		    f_1515_ = f_1517_;
		    f_1517_ = f_1541_;
		    f_1541_ = f_1527_;
		    f_1527_ = f_1529_;
		    f_1529_ = f_1541_;
		    f_1541_ = f_1532_;
		    f_1532_ = f_1538_;
		    f_1538_ = f_1541_;
		    int i_1542_ = i;
		    i = i_1525_;
		    i_1525_ = i_1542_;
		    i_1542_ = i_1531_;
		    i_1531_ = i_1537_;
		    i_1537_ = i_1542_;
		    i_1542_ = i_1530_;
		    i_1530_ = i_1536_;
		    i_1536_ = i_1542_;
		}
	    }
	    int i_1543_ = (i_1530_ & 0xffff) << 16 | i_1531_ & 0xffff;
	    int i_1544_ = (i_1533_ & 0xffff) << 16 | i_1534_ & 0xffff;
	    int i_1545_ = (i_1536_ & 0xffff) << 16 | i_1537_ & 0xffff;
	    if (i_1543_ != ((Class155_Backup) this).anInt1734) {
		((Class155_Backup) this).anIntArray1725
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15389(i_1530_, i_1531_);
		if (((Class155_Backup) this).anIntArray1725 == null) {
		    ((Class155_Backup) this).anInt1734 = -1;
		    ((Class155_Backup) this).anInt1723 = 255 - (i >> 24 & 0xff);
		    int i_1546_ = (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     (((Class155_Backup) this).aClass103_Sub2_1743
					  .method15368(i_1530_),
				      2014625391)) & 0xffff]);
		    int i_1547_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_1546_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_1546_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_1546_ & 0xff) >> 8);
		    method3385(true, bool_1505_, bool_1506_, f, f_1507_,
			       f_1508_, f_1509_, f_1510_, f_1511_, f_1512_,
			       f_1513_, f_1514_,
			       Class54.method1306(i_1547_, i_1526_, f_1527_,
						  1372221625),
			       Class54.method1306(i_1547_, i_1526_, f_1528_,
						  1372221625),
			       Class54.method1306(i_1547_, i_1526_, f_1529_,
						  1372221625));
		    return;
		}
		((Class155_Backup) this).anInt1734 = i_1543_;
		((Class155_Backup) this).anInt1752
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15365(i_1530_);
		((Class155_Backup) this).anInt1744 = ((Class155_Backup) this).anInt1752 - 1;
		((Class155_Backup) this).aClass529_1746
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15366(i_1530_);
	    }
	    ((Class155_Backup) this).aFloat1745 = f_1532_;
	    if (i_1544_ != ((Class155_Backup) this).anInt1749) {
		((Class155_Backup) this).anIntArray1750
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15389(i_1533_, i_1534_);
		if (((Class155_Backup) this).anIntArray1750 == null) {
		    ((Class155_Backup) this).anInt1749 = -1;
		    ((Class155_Backup) this).anInt1723 = 255 - (i >> 24 & 0xff);
		    int i_1548_ = (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     (((Class155_Backup) this).aClass103_Sub2_1743
					  .method15368(i_1533_),
				      -547701251)) & 0xffff]);
		    int i_1549_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_1548_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_1548_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_1548_ & 0xff) >> 8);
		    method3385(true, bool_1505_, bool_1506_, f, f_1507_,
			       f_1508_, f_1509_, f_1510_, f_1511_, f_1512_,
			       f_1513_, f_1514_,
			       Class54.method1306(i_1549_, i_1526_, f_1527_,
						  1372221625),
			       Class54.method1306(i_1549_, i_1526_, f_1528_,
						  1372221625),
			       Class54.method1306(i_1549_, i_1526_, f_1529_,
						  1372221625));
		    return;
		}
		((Class155_Backup) this).anInt1749 = i_1544_;
		((Class155_Backup) this).anInt1757
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15365(i_1533_);
		((Class155_Backup) this).anInt1742 = ((Class155_Backup) this).anInt1757 - 1;
	    }
	    ((Class155_Backup) this).aFloat1753 = f_1535_;
	    if (i_1545_ != ((Class155_Backup) this).anInt1754) {
		((Class155_Backup) this).anIntArray1755
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15389(i_1536_, i_1537_);
		if (((Class155_Backup) this).anIntArray1755 == null) {
		    ((Class155_Backup) this).anInt1754 = -1;
		    ((Class155_Backup) this).anInt1723 = 255 - (i >> 24 & 0xff);
		    int i_1550_ = (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     (((Class155_Backup) this).aClass103_Sub2_1743
					  .method15368(i_1536_),
				      2309733)) & 0xffff]);
		    int i_1551_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_1550_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_1550_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_1550_ & 0xff) >> 8);
		    method3385(true, bool_1505_, bool_1506_, (float) (int) f,
			       (float) (int) f_1507_, (float) (int) f_1508_,
			       (float) (int) f_1509_, (float) (int) f_1510_,
			       (float) (int) f_1511_, (float) (int) f_1512_,
			       (float) (int) f_1513_, (float) (int) f_1514_,
			       Class54.method1306(i_1551_, i_1526_, f_1527_,
						  1372221625),
			       Class54.method1306(i_1551_, i_1526_, f_1528_,
						  1372221625),
			       Class54.method1306(i_1551_, i_1526_, f_1529_,
						  1372221625));
		    return;
		}
		((Class155_Backup) this).anInt1754 = i_1545_;
		((Class155_Backup) this).anInt1738
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15365(i_1536_);
		((Class155_Backup) this).anInt1735 = ((Class155_Backup) this).anInt1738 - 1;
	    }
	    ((Class155_Backup) this).aFloat1758 = f_1538_;
	    f_1518_ /= f_1515_;
	    f_1519_ /= f_1516_;
	    f_1520_ /= f_1517_;
	    f_1521_ /= f_1515_;
	    f_1522_ /= f_1516_;
	    f_1523_ /= f_1517_;
	    f_1512_ = 1.0F / f_1512_;
	    f_1513_ = 1.0F / f_1513_;
	    f_1514_ = 1.0F / f_1514_;
	    f_1515_ = 1.0F / f_1515_;
	    f_1516_ = 1.0F / f_1516_;
	    f_1517_ = 1.0F / f_1517_;
	    float f_1552_ = (float) (i >> 24 & 0xff);
	    float f_1553_ = (float) (i_1524_ >> 24 & 0xff);
	    float f_1554_ = (float) (i_1525_ >> 24 & 0xff);
	    float f_1555_ = (float) (i >> 16 & 0xff);
	    float f_1556_ = (float) (i_1524_ >> 16 & 0xff);
	    float f_1557_ = (float) (i_1525_ >> 16 & 0xff);
	    float f_1558_ = (float) (i >> 8 & 0xff);
	    float f_1559_ = (float) (i_1524_ >> 8 & 0xff);
	    float f_1560_ = (float) (i_1525_ >> 8 & 0xff);
	    float f_1561_ = (float) (i & 0xff);
	    float f_1562_ = (float) (i_1524_ & 0xff);
	    float f_1563_ = (float) (i_1525_ & 0xff);
	    float f_1564_ = 1.0F;
	    float f_1565_ = 0.0F;
	    float f_1566_ = 0.0F;
	    float f_1567_ = 0.0F;
	    float f_1568_ = 1.0F;
	    float f_1569_ = 0.0F;
	    float f_1570_ = 0.0F;
	    float f_1571_ = 0.0F;
	    float f_1572_ = 0.0F;
	    float f_1573_ = 0.0F;
	    float f_1574_ = 0.0F;
	    float f_1575_ = 0.0F;
	    float f_1576_ = 0.0F;
	    float f_1577_ = 0.0F;
	    float f_1578_ = 0.0F;
	    float f_1579_ = 0.0F;
	    float f_1580_ = 0.0F;
	    float f_1581_ = 0.0F;
	    if (f_1507_ != f) {
		float f_1582_ = f_1507_ - f;
		f_1570_ = (f_1510_ - f_1509_) / f_1582_;
		f_1571_ = (f_1513_ - f_1512_) / f_1582_;
		f_1572_ = (f_1516_ - f_1515_) / f_1582_;
		f_1573_ = (f_1519_ - f_1518_) / f_1582_;
		f_1574_ = (f_1522_ - f_1521_) / f_1582_;
		f_1575_ = (f_1528_ - f_1527_) / f_1582_;
		f_1576_ = (f_1553_ - f_1552_) / f_1582_;
		f_1577_ = (f_1556_ - f_1555_) / f_1582_;
		f_1578_ = (f_1559_ - f_1558_) / f_1582_;
		f_1579_ = (f_1562_ - f_1561_) / f_1582_;
		f_1580_ = (f_1565_ - f_1564_) / f_1582_;
		f_1581_ = (f_1568_ - f_1567_) / f_1582_;
	    }
	    float f_1583_ = 0.0F;
	    float f_1584_ = 0.0F;
	    float f_1585_ = 0.0F;
	    float f_1586_ = 0.0F;
	    float f_1587_ = 0.0F;
	    float f_1588_ = 0.0F;
	    float f_1589_ = 0.0F;
	    float f_1590_ = 0.0F;
	    float f_1591_ = 0.0F;
	    float f_1592_ = 0.0F;
	    float f_1593_ = 0.0F;
	    float f_1594_ = 0.0F;
	    if (f_1508_ != f_1507_) {
		float f_1595_ = f_1508_ - f_1507_;
		f_1583_ = (f_1511_ - f_1510_) / f_1595_;
		f_1584_ = (f_1514_ - f_1513_) / f_1595_;
		f_1585_ = (f_1517_ - f_1516_) / f_1595_;
		f_1586_ = (f_1520_ - f_1519_) / f_1595_;
		f_1587_ = (f_1523_ - f_1522_) / f_1595_;
		f_1588_ = (f_1529_ - f_1528_) / f_1595_;
		f_1589_ = (f_1554_ - f_1553_) / f_1595_;
		f_1590_ = (f_1557_ - f_1556_) / f_1595_;
		f_1591_ = (f_1560_ - f_1559_) / f_1595_;
		f_1592_ = (f_1563_ - f_1562_) / f_1595_;
		f_1593_ = (f_1566_ - f_1565_) / f_1595_;
		f_1594_ = (f_1569_ - f_1568_) / f_1595_;
	    }
	    float f_1596_ = 0.0F;
	    float f_1597_ = 0.0F;
	    float f_1598_ = 0.0F;
	    float f_1599_ = 0.0F;
	    float f_1600_ = 0.0F;
	    float f_1601_ = 0.0F;
	    float f_1602_ = 0.0F;
	    float f_1603_ = 0.0F;
	    float f_1604_ = 0.0F;
	    float f_1605_ = 0.0F;
	    float f_1606_ = 0.0F;
	    float f_1607_ = 0.0F;
	    if (f != f_1508_) {
		float f_1608_ = f - f_1508_;
		f_1596_ = (f_1509_ - f_1511_) / f_1608_;
		f_1597_ = (f_1512_ - f_1514_) / f_1608_;
		f_1598_ = (f_1515_ - f_1517_) / f_1608_;
		f_1599_ = (f_1518_ - f_1520_) / f_1608_;
		f_1600_ = (f_1521_ - f_1523_) / f_1608_;
		f_1601_ = (f_1527_ - f_1529_) / f_1608_;
		f_1602_ = (f_1552_ - f_1554_) / f_1608_;
		f_1603_ = (f_1555_ - f_1557_) / f_1608_;
		f_1604_ = (f_1558_ - f_1560_) / f_1608_;
		f_1605_ = (f_1561_ - f_1563_) / f_1608_;
		f_1606_ = (f_1564_ - f_1566_) / f_1608_;
		f_1607_ = (f_1567_ - f_1569_) / f_1608_;
	    }
	    if (!(f >= (float) ((Class155_Backup) this).anInt1726)) {
		if (f_1507_ > (float) ((Class155_Backup) this).anInt1726)
		    f_1507_ = (float) ((Class155_Backup) this).anInt1726;
		if (f_1508_ > (float) ((Class155_Backup) this).anInt1726)
		    f_1508_ = (float) ((Class155_Backup) this).anInt1726;
		if (f_1507_ < f_1508_) {
		    f_1511_ = f_1509_;
		    f_1514_ = f_1512_;
		    f_1517_ = f_1515_;
		    f_1520_ = f_1518_;
		    f_1523_ = f_1521_;
		    f_1529_ = f_1527_;
		    f_1554_ = f_1552_;
		    f_1557_ = f_1555_;
		    f_1560_ = f_1558_;
		    f_1563_ = f_1561_;
		    f_1566_ = f_1564_;
		    f_1569_ = f_1567_;
		    if (f < 0.0F) {
			f_1509_ -= f_1570_ * f;
			f_1511_ -= f_1596_ * f;
			f_1512_ -= f_1571_ * f;
			f_1514_ -= f_1597_ * f;
			f_1515_ -= f_1572_ * f;
			f_1517_ -= f_1598_ * f;
			f_1518_ -= f_1573_ * f;
			f_1520_ -= f_1599_ * f;
			f_1521_ -= f_1574_ * f;
			f_1523_ -= f_1600_ * f;
			f_1527_ -= f_1575_ * f;
			f_1529_ -= f_1601_ * f;
			f_1552_ -= f_1576_ * f;
			f_1554_ -= f_1602_ * f;
			f_1555_ -= f_1577_ * f;
			f_1557_ -= f_1603_ * f;
			f_1558_ -= f_1578_ * f;
			f_1560_ -= f_1604_ * f;
			f_1561_ -= f_1579_ * f;
			f_1563_ -= f_1605_ * f;
			f_1564_ -= f_1580_ * f;
			f_1566_ -= f_1606_ * f;
			f_1567_ -= f_1581_ * f;
			f_1569_ -= f_1607_ * f;
			f = 0.0F;
		    }
		    if (f_1507_ < 0.0F) {
			f_1510_ -= f_1583_ * f_1507_;
			f_1513_ -= f_1584_ * f_1507_;
			f_1516_ -= f_1585_ * f_1507_;
			f_1519_ -= f_1586_ * f_1507_;
			f_1522_ -= f_1587_ * f_1507_;
			f_1528_ -= f_1588_ * f_1507_;
			f_1553_ -= f_1589_ * f_1507_;
			f_1556_ -= f_1590_ * f_1507_;
			f_1559_ -= f_1591_ * f_1507_;
			f_1562_ -= f_1592_ * f_1507_;
			f_1565_ -= f_1593_ * f_1507_;
			f_1568_ -= f_1594_ * f_1507_;
			f_1507_ = 0.0F;
		    }
		    if (f != f_1507_ && f_1596_ < f_1570_
			|| f == f_1507_ && f_1596_ > f_1583_) {
			f += 0.5F;
			f_1507_ += 0.5F;
			f_1508_ = (float) (int) (f_1508_ + 0.5F) - f_1507_;
			f_1507_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_1507_ >= 0.0F) {
			    method3343(bool_1505_, bool_1506_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1511_, (int) f_1509_,
				       f_1514_, f_1512_, f_1517_, f_1515_,
				       f_1520_, f_1518_, f_1523_, f_1521_,
				       f_1529_, f_1527_, f_1554_, f_1552_,
				       f_1557_, f_1555_, f_1560_, f_1558_,
				       f_1563_, f_1561_, f_1566_, f_1564_,
				       f_1569_, f_1567_);
			    f_1509_ += f_1570_;
			    f_1511_ += f_1596_;
			    f_1512_ += f_1571_;
			    f_1514_ += f_1597_;
			    f_1515_ += f_1572_;
			    f_1517_ += f_1598_;
			    f_1518_ += f_1573_;
			    f_1520_ += f_1599_;
			    f_1521_ += f_1574_;
			    f_1523_ += f_1600_;
			    f_1527_ += f_1575_;
			    f_1529_ += f_1601_;
			    f_1552_ += f_1576_;
			    f_1554_ += f_1602_;
			    f_1555_ += f_1577_;
			    f_1557_ += f_1603_;
			    f_1558_ += f_1578_;
			    f_1560_ += f_1604_;
			    f_1561_ += f_1579_;
			    f_1563_ += f_1605_;
			    f_1564_ += f_1580_;
			    f_1566_ += f_1606_;
			    f_1567_ += f_1581_;
			    f_1569_ += f_1607_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_1508_ >= 0.0F) {
			    method3343(bool_1505_, bool_1506_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1511_, (int) f_1510_,
				       f_1514_, f_1513_, f_1517_, f_1516_,
				       f_1520_, f_1519_, f_1523_, f_1522_,
				       f_1529_, f_1528_, f_1554_, f_1553_,
				       f_1557_, f_1556_, f_1560_, f_1559_,
				       f_1563_, f_1562_, f_1566_, f_1565_,
				       f_1569_, f_1568_);
			    f_1510_ += f_1583_;
			    f_1511_ += f_1596_;
			    f_1513_ += f_1584_;
			    f_1514_ += f_1597_;
			    f_1516_ += f_1585_;
			    f_1517_ += f_1598_;
			    f_1519_ += f_1586_;
			    f_1520_ += f_1599_;
			    f_1522_ += f_1587_;
			    f_1523_ += f_1600_;
			    f_1528_ += f_1588_;
			    f_1529_ += f_1601_;
			    f_1553_ += f_1589_;
			    f_1554_ += f_1602_;
			    f_1556_ += f_1590_;
			    f_1557_ += f_1603_;
			    f_1559_ += f_1591_;
			    f_1560_ += f_1604_;
			    f_1562_ += f_1592_;
			    f_1563_ += f_1605_;
			    f_1565_ += f_1593_;
			    f_1566_ += f_1606_;
			    f_1568_ += f_1594_;
			    f_1569_ += f_1607_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    } else {
			f += 0.5F;
			f_1507_ += 0.5F;
			f_1508_ = (float) (int) (f_1508_ + 0.5F) - f_1507_;
			f_1507_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_1507_ >= 0.0F) {
			    method3343(bool_1505_, bool_1506_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1509_, (int) f_1511_,
				       f_1512_, f_1514_, f_1515_, f_1517_,
				       f_1518_, f_1520_, f_1521_, f_1523_,
				       f_1527_, f_1529_, f_1552_, f_1554_,
				       f_1555_, f_1557_, f_1558_, f_1560_,
				       f_1561_, f_1563_, f_1564_, f_1566_,
				       f_1567_, f_1569_);
			    f_1509_ += f_1570_;
			    f_1511_ += f_1596_;
			    f_1512_ += f_1571_;
			    f_1514_ += f_1597_;
			    f_1515_ += f_1572_;
			    f_1517_ += f_1598_;
			    f_1518_ += f_1573_;
			    f_1520_ += f_1599_;
			    f_1521_ += f_1574_;
			    f_1523_ += f_1600_;
			    f_1527_ += f_1575_;
			    f_1529_ += f_1601_;
			    f_1552_ += f_1576_;
			    f_1554_ += f_1602_;
			    f_1555_ += f_1577_;
			    f_1557_ += f_1603_;
			    f_1558_ += f_1578_;
			    f_1560_ += f_1604_;
			    f_1561_ += f_1579_;
			    f_1563_ += f_1605_;
			    f_1564_ += f_1580_;
			    f_1566_ += f_1606_;
			    f_1567_ += f_1581_;
			    f_1569_ += f_1607_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_1508_ >= 0.0F) {
			    method3343(bool_1505_, bool_1506_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1510_, (int) f_1511_,
				       f_1513_, f_1514_, f_1516_, f_1517_,
				       f_1519_, f_1520_, f_1522_, f_1523_,
				       f_1528_, f_1529_, f_1553_, f_1554_,
				       f_1556_, f_1557_, f_1559_, f_1560_,
				       f_1562_, f_1563_, f_1565_, f_1566_,
				       f_1568_, f_1569_);
			    f_1510_ += f_1583_;
			    f_1511_ += f_1596_;
			    f_1513_ += f_1584_;
			    f_1514_ += f_1597_;
			    f_1516_ += f_1585_;
			    f_1517_ += f_1598_;
			    f_1519_ += f_1586_;
			    f_1520_ += f_1599_;
			    f_1522_ += f_1587_;
			    f_1523_ += f_1600_;
			    f_1528_ += f_1588_;
			    f_1529_ += f_1601_;
			    f_1553_ += f_1589_;
			    f_1554_ += f_1602_;
			    f_1556_ += f_1590_;
			    f_1557_ += f_1603_;
			    f_1559_ += f_1591_;
			    f_1560_ += f_1604_;
			    f_1562_ += f_1592_;
			    f_1563_ += f_1605_;
			    f_1565_ += f_1593_;
			    f_1566_ += f_1606_;
			    f_1568_ += f_1594_;
			    f_1569_ += f_1607_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    }
		} else {
		    f_1510_ = f_1509_;
		    f_1513_ = f_1512_;
		    f_1516_ = f_1515_;
		    f_1519_ = f_1518_;
		    f_1522_ = f_1521_;
		    f_1528_ = f_1527_;
		    f_1553_ = f_1552_;
		    f_1556_ = f_1555_;
		    f_1559_ = f_1558_;
		    f_1562_ = f_1561_;
		    f_1565_ = f_1564_;
		    f_1568_ = f_1567_;
		    if (f < 0.0F) {
			f_1509_ -= f_1570_ * f;
			f_1510_ -= f_1596_ * f;
			f_1512_ -= f_1571_ * f;
			f_1513_ -= f_1597_ * f;
			f_1515_ -= f_1572_ * f;
			f_1516_ -= f_1598_ * f;
			f_1518_ -= f_1573_ * f;
			f_1519_ -= f_1599_ * f;
			f_1521_ -= f_1574_ * f;
			f_1522_ -= f_1600_ * f;
			f_1527_ -= f_1575_ * f;
			f_1528_ -= f_1601_ * f;
			f_1552_ -= f_1576_ * f;
			f_1553_ -= f_1602_ * f;
			f_1555_ -= f_1577_ * f;
			f_1556_ -= f_1603_ * f;
			f_1558_ -= f_1578_ * f;
			f_1559_ -= f_1604_ * f;
			f_1561_ -= f_1579_ * f;
			f_1562_ -= f_1605_ * f;
			f_1564_ -= f_1580_ * f;
			f_1565_ -= f_1606_ * f;
			f_1567_ -= f_1581_ * f;
			f_1568_ -= f_1607_ * f;
			f = 0.0F;
		    }
		    if (f_1508_ < 0.0F) {
			f_1511_ -= f_1583_ * f_1508_;
			f_1514_ -= f_1584_ * f_1508_;
			f_1517_ -= f_1585_ * f_1508_;
			f_1520_ -= f_1586_ * f_1508_;
			f_1523_ -= f_1587_ * f_1508_;
			f_1529_ -= f_1588_ * f_1508_;
			f_1554_ -= f_1589_ * f_1508_;
			f_1557_ -= f_1590_ * f_1508_;
			f_1560_ -= f_1591_ * f_1508_;
			f_1563_ -= f_1592_ * f_1508_;
			f_1566_ -= f_1593_ * f_1508_;
			f_1569_ -= f_1594_ * f_1508_;
			f_1508_ = 0.0F;
		    }
		    if (f != f_1508_ && f_1596_ < f_1570_
			|| f == f_1508_ && f_1583_ > f_1570_) {
			f += 0.5F;
			f_1508_ += 0.5F;
			f_1507_ = (float) (int) (f_1507_ + 0.5F) - f_1508_;
			f_1508_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_1508_ >= 0.0F) {
			    method3343(bool_1505_, bool_1506_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1510_, (int) f_1509_,
				       f_1513_, f_1512_, f_1516_, f_1515_,
				       f_1519_, f_1518_, f_1522_, f_1521_,
				       f_1528_, f_1527_, f_1553_, f_1552_,
				       f_1556_, f_1555_, f_1559_, f_1558_,
				       f_1562_, f_1561_, f_1565_, f_1564_,
				       f_1568_, f_1567_);
			    f_1509_ += f_1570_;
			    f_1510_ += f_1596_;
			    f_1512_ += f_1571_;
			    f_1513_ += f_1597_;
			    f_1515_ += f_1572_;
			    f_1516_ += f_1598_;
			    f_1518_ += f_1573_;
			    f_1519_ += f_1599_;
			    f_1521_ += f_1574_;
			    f_1522_ += f_1600_;
			    f_1527_ += f_1575_;
			    f_1528_ += f_1601_;
			    f_1552_ += f_1576_;
			    f_1553_ += f_1602_;
			    f_1555_ += f_1577_;
			    f_1556_ += f_1603_;
			    f_1558_ += f_1578_;
			    f_1559_ += f_1604_;
			    f_1561_ += f_1579_;
			    f_1562_ += f_1605_;
			    f_1564_ += f_1580_;
			    f_1565_ += f_1606_;
			    f_1567_ += f_1581_;
			    f_1568_ += f_1607_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_1507_ >= 0.0F) {
			    method3343(bool_1505_, bool_1506_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1511_, (int) f_1509_,
				       f_1514_, f_1512_, f_1517_, f_1515_,
				       f_1520_, f_1518_, f_1523_, f_1521_,
				       f_1529_, f_1527_, f_1554_, f_1552_,
				       f_1557_, f_1555_, f_1560_, f_1558_,
				       f_1563_, f_1561_, f_1566_, f_1564_,
				       f_1569_, f_1567_);
			    f_1511_ += f_1583_;
			    f_1509_ += f_1570_;
			    f_1514_ += f_1584_;
			    f_1512_ += f_1571_;
			    f_1517_ += f_1585_;
			    f_1515_ += f_1572_;
			    f_1520_ += f_1586_;
			    f_1518_ += f_1573_;
			    f_1523_ += f_1587_;
			    f_1521_ += f_1574_;
			    f_1529_ += f_1588_;
			    f_1527_ += f_1575_;
			    f_1554_ += f_1589_;
			    f_1552_ += f_1576_;
			    f_1557_ += f_1590_;
			    f_1555_ += f_1577_;
			    f_1560_ += f_1591_;
			    f_1558_ += f_1578_;
			    f_1563_ += f_1592_;
			    f_1561_ += f_1579_;
			    f_1566_ += f_1593_;
			    f_1564_ += f_1580_;
			    f_1569_ += f_1594_;
			    f_1567_ += f_1581_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    } else {
			f += 0.5F;
			f_1508_ += 0.5F;
			f_1507_ = (float) (int) (f_1507_ + 0.5F) - f_1508_;
			f_1508_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_1508_ >= 0.0F) {
			    method3343(bool_1505_, bool_1506_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1509_, (int) f_1510_,
				       f_1512_, f_1513_, f_1515_, f_1516_,
				       f_1518_, f_1519_, f_1521_, f_1522_,
				       f_1527_, f_1528_, f_1552_, f_1553_,
				       f_1555_, f_1556_, f_1558_, f_1559_,
				       f_1561_, f_1562_, f_1564_, f_1565_,
				       f_1567_, f_1568_);
			    f_1510_ += f_1596_;
			    f_1509_ += f_1570_;
			    f_1513_ += f_1597_;
			    f_1512_ += f_1571_;
			    f_1516_ += f_1598_;
			    f_1515_ += f_1572_;
			    f_1519_ += f_1599_;
			    f_1518_ += f_1573_;
			    f_1522_ += f_1600_;
			    f_1521_ += f_1574_;
			    f_1528_ += f_1601_;
			    f_1527_ += f_1575_;
			    f_1553_ += f_1602_;
			    f_1552_ += f_1576_;
			    f_1556_ += f_1603_;
			    f_1555_ += f_1577_;
			    f_1559_ += f_1604_;
			    f_1558_ += f_1578_;
			    f_1562_ += f_1605_;
			    f_1561_ += f_1579_;
			    f_1565_ += f_1606_;
			    f_1564_ += f_1580_;
			    f_1568_ += f_1607_;
			    f_1567_ += f_1581_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_1507_ >= 0.0F) {
			    method3343(bool_1505_, bool_1506_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1509_, (int) f_1511_,
				       f_1512_, f_1514_, f_1515_, f_1517_,
				       f_1518_, f_1520_, f_1521_, f_1523_,
				       f_1527_, f_1529_, f_1552_, f_1554_,
				       f_1555_, f_1557_, f_1558_, f_1560_,
				       f_1561_, f_1563_, f_1564_, f_1566_,
				       f_1567_, f_1569_);
			    f_1509_ += f_1570_;
			    f_1511_ += f_1583_;
			    f_1512_ += f_1571_;
			    f_1514_ += f_1584_;
			    f_1515_ += f_1572_;
			    f_1517_ += f_1585_;
			    f_1518_ += f_1573_;
			    f_1520_ += f_1586_;
			    f_1521_ += f_1574_;
			    f_1523_ += f_1587_;
			    f_1527_ += f_1575_;
			    f_1529_ += f_1588_;
			    f_1552_ += f_1576_;
			    f_1554_ += f_1589_;
			    f_1555_ += f_1577_;
			    f_1557_ += f_1590_;
			    f_1558_ += f_1578_;
			    f_1560_ += f_1591_;
			    f_1561_ += f_1579_;
			    f_1563_ += f_1592_;
			    f_1564_ += f_1580_;
			    f_1566_ += f_1593_;
			    f_1567_ += f_1581_;
			    f_1569_ += f_1594_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    }
		}
	    }
	}
    }
    
    final void method3380(boolean bool, boolean bool_1609_, boolean bool_1610_,
			  float f, float f_1611_, float f_1612_, float f_1613_,
			  float f_1614_, float f_1615_, float f_1616_,
			  float f_1617_, float f_1618_, float f_1619_,
			  float f_1620_, float f_1621_) {
	if (!bool)
	    method3377(false, bool_1609_, bool_1610_, f, f_1611_, f_1612_,
		       f_1613_, f_1614_, f_1615_, f_1616_, f_1617_, f_1618_,
		       0);
	else if (((Class155_Backup) this).aBool1724) {
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517
		((int) f_1613_, (int) f, (int) f_1614_, (int) f_1611_,
		 Class474.anIntArray6382[(int) f_1619_ & 0xffff], 223909001);
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517
		((int) f_1614_, (int) f_1611_, (int) f_1615_, (int) f_1612_,
		 Class474.anIntArray6382[(int) f_1619_ & 0xffff], 223909001);
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517
		((int) f_1615_, (int) f_1612_, (int) f_1613_, (int) f,
		 Class474.anIntArray6382[(int) f_1619_ & 0xffff], 223909001);
	} else {
	    float f_1622_ = f_1614_ - f_1613_;
	    float f_1623_ = f_1611_ - f;
	    float f_1624_ = f_1615_ - f_1613_;
	    float f_1625_ = f_1612_ - f;
	    float f_1626_ = f_1620_ - f_1619_;
	    float f_1627_ = f_1621_ - f_1619_;
	    float f_1628_ = f_1617_ - f_1616_;
	    float f_1629_ = f_1618_ - f_1616_;
	    float f_1630_;
	    if (f_1612_ != f_1611_)
		f_1630_ = (f_1615_ - f_1614_) / (f_1612_ - f_1611_);
	    else
		f_1630_ = 0.0F;
	    float f_1631_;
	    if (f_1611_ != f)
		f_1631_ = f_1622_ / f_1623_;
	    else
		f_1631_ = 0.0F;
	    float f_1632_;
	    if (f_1612_ != f)
		f_1632_ = f_1624_ / f_1625_;
	    else
		f_1632_ = 0.0F;
	    float f_1633_ = f_1622_ * f_1625_ - f_1624_ * f_1623_;
	    if (f_1633_ != 0.0F) {
		float f_1634_
		    = (f_1626_ * f_1625_ - f_1627_ * f_1623_) / f_1633_;
		float f_1635_
		    = (f_1627_ * f_1622_ - f_1626_ * f_1624_) / f_1633_;
		float f_1636_
		    = (f_1628_ * f_1625_ - f_1629_ * f_1623_) / f_1633_;
		float f_1637_
		    = (f_1629_ * f_1622_ - f_1628_ * f_1624_) / f_1633_;
		if (f <= f_1611_ && f <= f_1612_) {
		    if (!(f >= (float) ((Class155_Backup) this).anInt1726)) {
			if (f_1611_ > (float) ((Class155_Backup) this).anInt1726)
			    f_1611_ = (float) ((Class155_Backup) this).anInt1726;
			if (f_1612_ > (float) ((Class155_Backup) this).anInt1726)
			    f_1612_ = (float) ((Class155_Backup) this).anInt1726;
			f_1619_ = f_1619_ - f_1634_ * f_1613_ + f_1634_;
			f_1616_ = f_1616_ - f_1636_ * f_1613_ + f_1636_;
			if (f_1611_ < f_1612_) {
			    f_1615_ = f_1613_;
			    if (f < 0.0F) {
				f_1615_ -= f_1632_ * f;
				f_1613_ -= f_1631_ * f;
				f_1619_ -= f_1635_ * f;
				f_1616_ -= f_1637_ * f;
				f = 0.0F;
			    }
			    if (f_1611_ < 0.0F) {
				f_1614_ -= f_1630_ * f_1611_;
				f_1611_ = 0.0F;
			    }
			    if (f != f_1611_ && f_1632_ < f_1631_
				|| f == f_1611_ && f_1632_ > f_1630_) {
				f += 0.5F;
				f_1611_ += 0.5F;
				f_1612_
				    = (float) (int) (f_1612_ + 0.5F) - f_1611_;
				f_1611_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_1611_ >= 0.0F) {
				    method3347(bool_1609_, bool_1610_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_1615_,
					       (int) f_1613_, f_1619_, f_1634_,
					       f_1616_, f_1636_);
				    f_1615_ += f_1632_;
				    f_1613_ += f_1631_;
				    f_1619_ += f_1635_;
				    f_1616_ += f_1637_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_1612_ >= 0.0F) {
				    method3347(bool_1609_, bool_1610_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_1615_,
					       (int) f_1614_, f_1619_, f_1634_,
					       f_1616_, f_1636_);
				    f_1615_ += f_1632_;
				    f_1614_ += f_1630_;
				    f_1619_ += f_1635_;
				    f_1616_ += f_1637_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f += 0.5F;
				f_1611_ += 0.5F;
				f_1612_
				    = (float) (int) (f_1612_ + 0.5F) - f_1611_;
				f_1611_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_1611_ >= 0.0F) {
				    method3347(bool_1609_, bool_1610_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_1613_,
					       (int) f_1615_, f_1619_, f_1634_,
					       f_1616_, f_1636_);
				    f_1615_ += f_1632_;
				    f_1613_ += f_1631_;
				    f_1619_ += f_1635_;
				    f_1616_ += f_1637_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_1612_ >= 0.0F) {
				    method3347(bool_1609_, bool_1610_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_1614_,
					       (int) f_1615_, f_1619_, f_1634_,
					       f_1616_, f_1636_);
				    f_1615_ += f_1632_;
				    f_1614_ += f_1630_;
				    f_1619_ += f_1635_;
				    f_1616_ += f_1637_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			} else {
			    f_1614_ = f_1613_;
			    if (f < 0.0F) {
				f_1614_ -= f_1632_ * f;
				f_1613_ -= f_1631_ * f;
				f_1619_ -= f_1635_ * f;
				f_1616_ -= f_1637_ * f;
				f = 0.0F;
			    }
			    if (f_1612_ < 0.0F) {
				f_1615_ -= f_1630_ * f_1612_;
				f_1612_ = 0.0F;
			    }
			    if (f != f_1612_ && f_1632_ < f_1631_
				|| f == f_1612_ && f_1630_ > f_1631_) {
				f += 0.5F;
				f_1612_ += 0.5F;
				f_1611_
				    = (float) (int) (f_1611_ + 0.5F) - f_1612_;
				f_1612_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_1612_ >= 0.0F) {
				    method3347(bool_1609_, bool_1610_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_1614_,
					       (int) f_1613_, f_1619_, f_1634_,
					       f_1616_, f_1636_);
				    f_1614_ += f_1632_;
				    f_1613_ += f_1631_;
				    f_1619_ += f_1635_;
				    f_1616_ += f_1637_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_1611_ >= 0.0F) {
				    method3347(bool_1609_, bool_1610_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_1615_,
					       (int) f_1613_, f_1619_, f_1634_,
					       f_1616_, f_1636_);
				    f_1615_ += f_1630_;
				    f_1613_ += f_1631_;
				    f_1619_ += f_1635_;
				    f_1616_ += f_1637_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f += 0.5F;
				f_1612_ += 0.5F;
				f_1611_
				    = (float) (int) (f_1611_ + 0.5F) - f_1612_;
				f_1612_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_1612_ >= 0.0F) {
				    method3347(bool_1609_, bool_1610_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_1613_,
					       (int) f_1614_, f_1619_, f_1634_,
					       f_1616_, f_1636_);
				    f_1614_ += f_1632_;
				    f_1613_ += f_1631_;
				    f_1619_ += f_1635_;
				    f_1616_ += f_1637_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_1611_ >= 0.0F) {
				    method3347(bool_1609_, bool_1610_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_1613_,
					       (int) f_1615_, f_1619_, f_1634_,
					       f_1616_, f_1636_);
				    f_1615_ += f_1630_;
				    f_1613_ += f_1631_;
				    f_1619_ += f_1635_;
				    f_1616_ += f_1637_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			}
		    }
		} else if (f_1611_ <= f_1612_) {
		    if (!(f_1611_ >= (float) ((Class155_Backup) this).anInt1726)) {
			if (f_1612_ > (float) ((Class155_Backup) this).anInt1726)
			    f_1612_ = (float) ((Class155_Backup) this).anInt1726;
			if (f > (float) ((Class155_Backup) this).anInt1726)
			    f = (float) ((Class155_Backup) this).anInt1726;
			f_1620_ = f_1620_ - f_1634_ * f_1614_ + f_1634_;
			f_1617_ = f_1617_ - f_1636_ * f_1614_ + f_1636_;
			if (f_1612_ < f) {
			    f_1613_ = f_1614_;
			    if (f_1611_ < 0.0F) {
				f_1613_ -= f_1631_ * f_1611_;
				f_1614_ -= f_1630_ * f_1611_;
				f_1620_ -= f_1635_ * f_1611_;
				f_1617_ -= f_1637_ * f_1611_;
				f_1611_ = 0.0F;
			    }
			    if (f_1612_ < 0.0F) {
				f_1615_ -= f_1632_ * f_1612_;
				f_1612_ = 0.0F;
			    }
			    if (f_1611_ != f_1612_ && f_1631_ < f_1630_
				|| f_1611_ == f_1612_ && f_1631_ > f_1632_) {
				f_1611_ += 0.5F;
				f_1612_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_1612_;
				f_1612_ -= f_1611_;
				f_1611_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1611_]);
				while (--f_1612_ >= 0.0F) {
				    method3347(bool_1609_, bool_1610_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1611_, 0, 0,
					       (int) f_1613_, (int) f_1614_,
					       f_1620_, f_1634_, f_1617_,
					       f_1636_);
				    f_1613_ += f_1631_;
				    f_1614_ += f_1630_;
				    f_1620_ += f_1635_;
				    f_1617_ += f_1637_;
				    f_1611_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f >= 0.0F) {
				    method3347(bool_1609_, bool_1610_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1611_, 0, 0,
					       (int) f_1613_, (int) f_1615_,
					       f_1620_, f_1634_, f_1617_,
					       f_1636_);
				    f_1613_ += f_1631_;
				    f_1615_ += f_1632_;
				    f_1620_ += f_1635_;
				    f_1617_ += f_1637_;
				    f_1611_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f_1611_ += 0.5F;
				f_1612_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_1612_;
				f_1612_ -= f_1611_;
				f_1611_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1611_]);
				while (--f_1612_ >= 0.0F) {
				    method3347(bool_1609_, bool_1610_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1611_, 0, 0,
					       (int) f_1614_, (int) f_1613_,
					       f_1620_, f_1634_, f_1617_,
					       f_1636_);
				    f_1613_ += f_1631_;
				    f_1614_ += f_1630_;
				    f_1620_ += f_1635_;
				    f_1617_ += f_1637_;
				    f_1611_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f >= 0.0F) {
				    method3347(bool_1609_, bool_1610_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1611_, 0, 0,
					       (int) f_1615_, (int) f_1613_,
					       f_1620_, f_1634_, f_1617_,
					       f_1636_);
				    f_1613_ += f_1631_;
				    f_1615_ += f_1632_;
				    f_1620_ += f_1635_;
				    f_1617_ += f_1637_;
				    f_1611_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			} else {
			    f_1615_ = f_1614_;
			    if (f_1611_ < 0.0F) {
				f_1615_ -= f_1631_ * f_1611_;
				f_1614_ -= f_1630_ * f_1611_;
				f_1620_ -= f_1635_ * f_1611_;
				f_1617_ -= f_1637_ * f_1611_;
				f_1611_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_1613_ -= f_1632_ * f;
				f = 0.0F;
			    }
			    if (f_1631_ < f_1630_) {
				f_1611_ += 0.5F;
				f += 0.5F;
				f_1612_ = (float) (int) (f_1612_ + 0.5F) - f;
				f -= f_1611_;
				f_1611_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1611_]);
				while (--f >= 0.0F) {
				    method3347(bool_1609_, bool_1610_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1611_, 0, 0,
					       (int) f_1615_, (int) f_1614_,
					       f_1620_, f_1634_, f_1617_,
					       f_1636_);
				    f_1615_ += f_1631_;
				    f_1614_ += f_1630_;
				    f_1620_ += f_1635_;
				    f_1617_ += f_1637_;
				    f_1611_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_1612_ >= 0.0F) {
				    method3347(bool_1609_, bool_1610_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1611_, 0, 0,
					       (int) f_1613_, (int) f_1614_,
					       f_1620_, f_1634_, f_1617_,
					       f_1636_);
				    f_1613_ += f_1632_;
				    f_1614_ += f_1630_;
				    f_1620_ += f_1635_;
				    f_1617_ += f_1637_;
				    f_1611_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f_1611_ += 0.5F;
				f += 0.5F;
				f_1612_ = (float) (int) (f_1612_ + 0.5F) - f;
				f -= f_1611_;
				f_1611_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1611_]);
				while (--f >= 0.0F) {
				    method3347(bool_1609_, bool_1610_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1611_, 0, 0,
					       (int) f_1614_, (int) f_1615_,
					       f_1620_, f_1634_, f_1617_,
					       f_1636_);
				    f_1615_ += f_1631_;
				    f_1614_ += f_1630_;
				    f_1620_ += f_1635_;
				    f_1617_ += f_1637_;
				    f_1611_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_1612_ >= 0.0F) {
				    method3347(bool_1609_, bool_1610_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1611_, 0, 0,
					       (int) f_1614_, (int) f_1613_,
					       f_1620_, f_1634_, f_1617_,
					       f_1636_);
				    f_1613_ += f_1632_;
				    f_1614_ += f_1630_;
				    f_1620_ += f_1635_;
				    f_1617_ += f_1637_;
				    f_1611_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			}
		    }
		} else if (!(f_1612_ >= (float) ((Class155_Backup) this).anInt1726)) {
		    if (f > (float) ((Class155_Backup) this).anInt1726)
			f = (float) ((Class155_Backup) this).anInt1726;
		    if (f_1611_ > (float) ((Class155_Backup) this).anInt1726)
			f_1611_ = (float) ((Class155_Backup) this).anInt1726;
		    f_1621_ = f_1621_ - f_1634_ * f_1615_ + f_1634_;
		    f_1618_ = f_1618_ - f_1636_ * f_1615_ + f_1636_;
		    if (f < f_1611_) {
			f_1614_ = f_1615_;
			if (f_1612_ < 0.0F) {
			    f_1614_ -= f_1630_ * f_1612_;
			    f_1615_ -= f_1632_ * f_1612_;
			    f_1621_ -= f_1635_ * f_1612_;
			    f_1618_ -= f_1637_ * f_1612_;
			    f_1612_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_1613_ -= f_1631_ * f;
			    f = 0.0F;
			}
			if (f_1630_ < f_1632_) {
			    f_1612_ += 0.5F;
			    f += 0.5F;
			    f_1611_ = (float) (int) (f_1611_ + 0.5F) - f;
			    f -= f_1612_;
			    f_1612_ = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1612_]);
			    while (--f >= 0.0F) {
				method3347(bool_1609_, bool_1610_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1612_, 0, 0, (int) f_1614_,
					   (int) f_1615_, f_1621_, f_1634_,
					   f_1618_, f_1636_);
				f_1614_ += f_1630_;
				f_1615_ += f_1632_;
				f_1621_ += f_1635_;
				f_1618_ += f_1637_;
				f_1612_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f_1611_ >= 0.0F) {
				method3347(bool_1609_, bool_1610_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1612_, 0, 0, (int) f_1614_,
					   (int) f_1613_, f_1621_, f_1634_,
					   f_1618_, f_1636_);
				f_1614_ += f_1630_;
				f_1613_ += f_1631_;
				f_1621_ += f_1635_;
				f_1618_ += f_1637_;
				f_1612_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			} else {
			    f_1612_ += 0.5F;
			    f += 0.5F;
			    f_1611_ = (float) (int) (f_1611_ + 0.5F) - f;
			    f -= f_1612_;
			    f_1612_ = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1612_]);
			    while (--f >= 0.0F) {
				method3347(bool_1609_, bool_1610_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1612_, 0, 0, (int) f_1615_,
					   (int) f_1614_, f_1621_, f_1634_,
					   f_1618_, f_1636_);
				f_1614_ += f_1630_;
				f_1615_ += f_1632_;
				f_1621_ += f_1635_;
				f_1618_ += f_1637_;
				f_1612_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f_1611_ >= 0.0F) {
				method3347(bool_1609_, bool_1610_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1612_, 0, 0, (int) f_1613_,
					   (int) f_1614_, f_1621_, f_1634_,
					   f_1618_, f_1636_);
				f_1614_ += f_1630_;
				f_1613_ += f_1631_;
				f_1621_ += f_1635_;
				f_1618_ += f_1637_;
				f_1612_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			}
		    } else {
			f_1613_ = f_1615_;
			if (f_1612_ < 0.0F) {
			    f_1613_ -= f_1630_ * f_1612_;
			    f_1615_ -= f_1632_ * f_1612_;
			    f_1621_ -= f_1635_ * f_1612_;
			    f_1618_ -= f_1637_ * f_1612_;
			    f_1612_ = 0.0F;
			}
			if (f_1611_ < 0.0F) {
			    f_1614_ -= f_1631_ * f_1611_;
			    f_1611_ = 0.0F;
			}
			if (f_1630_ < f_1632_) {
			    f_1612_ += 0.5F;
			    f_1611_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_1611_;
			    f_1611_ -= f_1612_;
			    f_1612_ = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1612_]);
			    while (--f_1611_ >= 0.0F) {
				method3347(bool_1609_, bool_1610_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1612_, 0, 0, (int) f_1613_,
					   (int) f_1615_, f_1621_, f_1634_,
					   f_1618_, f_1636_);
				f_1613_ += f_1630_;
				f_1615_ += f_1632_;
				f_1621_ += f_1635_;
				f_1618_ += f_1637_;
				f_1612_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f >= 0.0F) {
				method3347(bool_1609_, bool_1610_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1612_, 0, 0, (int) f_1614_,
					   (int) f_1615_, f_1621_, f_1634_,
					   f_1618_, f_1636_);
				f_1614_ += f_1631_;
				f_1615_ += f_1632_;
				f_1621_ += f_1635_;
				f_1618_ += f_1637_;
				f_1612_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			} else {
			    f_1612_ += 0.5F;
			    f_1611_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_1611_;
			    f_1611_ -= f_1612_;
			    f_1612_ = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1612_]);
			    while (--f_1611_ >= 0.0F) {
				method3347(bool_1609_, bool_1610_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1612_, 0, 0, (int) f_1615_,
					   (int) f_1613_, f_1621_, f_1634_,
					   f_1618_, f_1636_);
				f_1613_ += f_1630_;
				f_1615_ += f_1632_;
				f_1621_ += f_1635_;
				f_1618_ += f_1637_;
				f_1612_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f >= 0.0F) {
				method3347(bool_1609_, bool_1610_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1612_, 0, 0, (int) f_1615_,
					   (int) f_1614_, f_1621_, f_1634_,
					   f_1618_, f_1636_);
				f_1614_ += f_1631_;
				f_1615_ += f_1632_;
				f_1621_ += f_1635_;
				f_1618_ += f_1637_;
				f_1612_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method3381
	(boolean bool, boolean bool_1638_, boolean bool_1639_, float f,
	 float f_1640_, float f_1641_, float f_1642_, float f_1643_,
	 float f_1644_, float f_1645_, float f_1646_, float f_1647_,
	 float f_1648_, float f_1649_, float f_1650_, float f_1651_,
	 float f_1652_, float f_1653_, float f_1654_, float f_1655_,
	 float f_1656_, int i, int i_1657_, int i_1658_, int i_1659_,
	 float f_1660_, float f_1661_, float f_1662_, int i_1663_, int i_1664_,
	 float f_1665_, int i_1666_, int i_1667_, float f_1668_, int i_1669_,
	 int i_1670_, float f_1671_) {
	if (!bool)
	    method3377(false, bool_1638_, bool_1639_, f, f_1640_, f_1641_,
		       f_1642_, f_1643_, f_1644_, f_1645_, f_1646_, f_1647_,
		       0);
	else {
	    ((Class155_Backup) this).anInt1740 = i_1659_;
	    if (!(f <= f_1640_) || !(f <= f_1641_)) {
		if (f_1640_ <= f_1641_) {
		    float f_1672_ = f_1642_;
		    f_1642_ = f_1643_;
		    f_1643_ = f_1672_;
		    f_1672_ = f;
		    f = f_1640_;
		    f_1640_ = f_1672_;
		    f_1672_ = f_1645_;
		    f_1645_ = f_1646_;
		    f_1646_ = f_1672_;
		    f_1672_ = f_1651_;
		    f_1651_ = f_1652_;
		    f_1652_ = f_1672_;
		    f_1672_ = f_1654_;
		    f_1654_ = f_1655_;
		    f_1655_ = f_1672_;
		    f_1672_ = f_1648_;
		    f_1648_ = f_1649_;
		    f_1649_ = f_1672_;
		    f_1672_ = f_1660_;
		    f_1660_ = f_1661_;
		    f_1661_ = f_1672_;
		    f_1672_ = f_1665_;
		    f_1665_ = f_1668_;
		    f_1668_ = f_1672_;
		    int i_1673_ = i;
		    i = i_1657_;
		    i_1657_ = i_1673_;
		    i_1673_ = i_1664_;
		    i_1664_ = i_1667_;
		    i_1667_ = i_1673_;
		    i_1673_ = i_1663_;
		    i_1663_ = i_1666_;
		    i_1666_ = i_1673_;
		} else {
		    float f_1674_ = f_1642_;
		    f_1642_ = f_1644_;
		    f_1644_ = f_1674_;
		    f_1674_ = f;
		    f = f_1641_;
		    f_1641_ = f_1674_;
		    f_1674_ = f_1645_;
		    f_1645_ = f_1647_;
		    f_1647_ = f_1674_;
		    f_1674_ = f_1651_;
		    f_1651_ = f_1653_;
		    f_1653_ = f_1674_;
		    f_1674_ = f_1654_;
		    f_1654_ = f_1656_;
		    f_1656_ = f_1674_;
		    f_1674_ = f_1648_;
		    f_1648_ = f_1650_;
		    f_1650_ = f_1674_;
		    f_1674_ = f_1660_;
		    f_1660_ = f_1662_;
		    f_1662_ = f_1674_;
		    f_1674_ = f_1665_;
		    f_1665_ = f_1671_;
		    f_1671_ = f_1674_;
		    int i_1675_ = i;
		    i = i_1658_;
		    i_1658_ = i_1675_;
		    i_1675_ = i_1664_;
		    i_1664_ = i_1670_;
		    i_1670_ = i_1675_;
		    i_1675_ = i_1663_;
		    i_1663_ = i_1669_;
		    i_1669_ = i_1675_;
		}
	    }
	    int i_1676_ = (i_1663_ & 0xffff) << 16 | i_1664_ & 0xffff;
	    int i_1677_ = (i_1666_ & 0xffff) << 16 | i_1667_ & 0xffff;
	    int i_1678_ = (i_1669_ & 0xffff) << 16 | i_1670_ & 0xffff;
	    if (i_1676_ != ((Class155_Backup) this).anInt1734) {
		((Class155_Backup) this).anIntArray1725
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15389(i_1663_, i_1664_);
		if (((Class155_Backup) this).anIntArray1725 == null) {
		    ((Class155_Backup) this).anInt1734 = -1;
		    ((Class155_Backup) this).anInt1723 = 255 - (i >> 24 & 0xff);
		    int i_1679_ = (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     (((Class155_Backup) this).aClass103_Sub2_1743
					  .method15368(i_1663_),
				      155145138)) & 0xffff]);
		    int i_1680_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_1679_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_1679_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_1679_ & 0xff) >> 8);
		    method3385(true, bool_1638_, bool_1639_, f, f_1640_,
			       f_1641_, f_1642_, f_1643_, f_1644_, f_1645_,
			       f_1646_, f_1647_,
			       Class54.method1306(i_1680_, i_1659_, f_1660_,
						  1372221625),
			       Class54.method1306(i_1680_, i_1659_, f_1661_,
						  1372221625),
			       Class54.method1306(i_1680_, i_1659_, f_1662_,
						  1372221625));
		    return;
		}
		((Class155_Backup) this).anInt1734 = i_1676_;
		((Class155_Backup) this).anInt1752
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15365(i_1663_);
		((Class155_Backup) this).anInt1744 = ((Class155_Backup) this).anInt1752 - 1;
		((Class155_Backup) this).aClass529_1746
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15366(i_1663_);
	    }
	    ((Class155_Backup) this).aFloat1745 = f_1665_;
	    if (i_1677_ != ((Class155_Backup) this).anInt1749) {
		((Class155_Backup) this).anIntArray1750
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15389(i_1666_, i_1667_);
		if (((Class155_Backup) this).anIntArray1750 == null) {
		    ((Class155_Backup) this).anInt1749 = -1;
		    ((Class155_Backup) this).anInt1723 = 255 - (i >> 24 & 0xff);
		    int i_1681_ = (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     (((Class155_Backup) this).aClass103_Sub2_1743
					  .method15368(i_1666_),
				      320825277)) & 0xffff]);
		    int i_1682_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_1681_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_1681_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_1681_ & 0xff) >> 8);
		    method3385(true, bool_1638_, bool_1639_, f, f_1640_,
			       f_1641_, f_1642_, f_1643_, f_1644_, f_1645_,
			       f_1646_, f_1647_,
			       Class54.method1306(i_1682_, i_1659_, f_1660_,
						  1372221625),
			       Class54.method1306(i_1682_, i_1659_, f_1661_,
						  1372221625),
			       Class54.method1306(i_1682_, i_1659_, f_1662_,
						  1372221625));
		    return;
		}
		((Class155_Backup) this).anInt1749 = i_1677_;
		((Class155_Backup) this).anInt1757
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15365(i_1666_);
		((Class155_Backup) this).anInt1742 = ((Class155_Backup) this).anInt1757 - 1;
	    }
	    ((Class155_Backup) this).aFloat1753 = f_1668_;
	    if (i_1678_ != ((Class155_Backup) this).anInt1754) {
		((Class155_Backup) this).anIntArray1755
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15389(i_1669_, i_1670_);
		if (((Class155_Backup) this).anIntArray1755 == null) {
		    ((Class155_Backup) this).anInt1754 = -1;
		    ((Class155_Backup) this).anInt1723 = 255 - (i >> 24 & 0xff);
		    int i_1683_ = (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     (((Class155_Backup) this).aClass103_Sub2_1743
					  .method15368(i_1669_),
				      -886695244)) & 0xffff]);
		    int i_1684_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_1683_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_1683_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_1683_ & 0xff) >> 8);
		    method3385(true, bool_1638_, bool_1639_, (float) (int) f,
			       (float) (int) f_1640_, (float) (int) f_1641_,
			       (float) (int) f_1642_, (float) (int) f_1643_,
			       (float) (int) f_1644_, (float) (int) f_1645_,
			       (float) (int) f_1646_, (float) (int) f_1647_,
			       Class54.method1306(i_1684_, i_1659_, f_1660_,
						  1372221625),
			       Class54.method1306(i_1684_, i_1659_, f_1661_,
						  1372221625),
			       Class54.method1306(i_1684_, i_1659_, f_1662_,
						  1372221625));
		    return;
		}
		((Class155_Backup) this).anInt1754 = i_1678_;
		((Class155_Backup) this).anInt1738
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15365(i_1669_);
		((Class155_Backup) this).anInt1735 = ((Class155_Backup) this).anInt1738 - 1;
	    }
	    ((Class155_Backup) this).aFloat1758 = f_1671_;
	    f_1651_ /= f_1648_;
	    f_1652_ /= f_1649_;
	    f_1653_ /= f_1650_;
	    f_1654_ /= f_1648_;
	    f_1655_ /= f_1649_;
	    f_1656_ /= f_1650_;
	    f_1645_ = 1.0F / f_1645_;
	    f_1646_ = 1.0F / f_1646_;
	    f_1647_ = 1.0F / f_1647_;
	    f_1648_ = 1.0F / f_1648_;
	    f_1649_ = 1.0F / f_1649_;
	    f_1650_ = 1.0F / f_1650_;
	    float f_1685_ = (float) (i >> 24 & 0xff);
	    float f_1686_ = (float) (i_1657_ >> 24 & 0xff);
	    float f_1687_ = (float) (i_1658_ >> 24 & 0xff);
	    float f_1688_ = (float) (i >> 16 & 0xff);
	    float f_1689_ = (float) (i_1657_ >> 16 & 0xff);
	    float f_1690_ = (float) (i_1658_ >> 16 & 0xff);
	    float f_1691_ = (float) (i >> 8 & 0xff);
	    float f_1692_ = (float) (i_1657_ >> 8 & 0xff);
	    float f_1693_ = (float) (i_1658_ >> 8 & 0xff);
	    float f_1694_ = (float) (i & 0xff);
	    float f_1695_ = (float) (i_1657_ & 0xff);
	    float f_1696_ = (float) (i_1658_ & 0xff);
	    float f_1697_ = 1.0F;
	    float f_1698_ = 0.0F;
	    float f_1699_ = 0.0F;
	    float f_1700_ = 0.0F;
	    float f_1701_ = 1.0F;
	    float f_1702_ = 0.0F;
	    float f_1703_ = 0.0F;
	    float f_1704_ = 0.0F;
	    float f_1705_ = 0.0F;
	    float f_1706_ = 0.0F;
	    float f_1707_ = 0.0F;
	    float f_1708_ = 0.0F;
	    float f_1709_ = 0.0F;
	    float f_1710_ = 0.0F;
	    float f_1711_ = 0.0F;
	    float f_1712_ = 0.0F;
	    float f_1713_ = 0.0F;
	    float f_1714_ = 0.0F;
	    if (f_1640_ != f) {
		float f_1715_ = f_1640_ - f;
		f_1703_ = (f_1643_ - f_1642_) / f_1715_;
		f_1704_ = (f_1646_ - f_1645_) / f_1715_;
		f_1705_ = (f_1649_ - f_1648_) / f_1715_;
		f_1706_ = (f_1652_ - f_1651_) / f_1715_;
		f_1707_ = (f_1655_ - f_1654_) / f_1715_;
		f_1708_ = (f_1661_ - f_1660_) / f_1715_;
		f_1709_ = (f_1686_ - f_1685_) / f_1715_;
		f_1710_ = (f_1689_ - f_1688_) / f_1715_;
		f_1711_ = (f_1692_ - f_1691_) / f_1715_;
		f_1712_ = (f_1695_ - f_1694_) / f_1715_;
		f_1713_ = (f_1698_ - f_1697_) / f_1715_;
		f_1714_ = (f_1701_ - f_1700_) / f_1715_;
	    }
	    float f_1716_ = 0.0F;
	    float f_1717_ = 0.0F;
	    float f_1718_ = 0.0F;
	    float f_1719_ = 0.0F;
	    float f_1720_ = 0.0F;
	    float f_1721_ = 0.0F;
	    float f_1722_ = 0.0F;
	    float f_1723_ = 0.0F;
	    float f_1724_ = 0.0F;
	    float f_1725_ = 0.0F;
	    float f_1726_ = 0.0F;
	    float f_1727_ = 0.0F;
	    if (f_1641_ != f_1640_) {
		float f_1728_ = f_1641_ - f_1640_;
		f_1716_ = (f_1644_ - f_1643_) / f_1728_;
		f_1717_ = (f_1647_ - f_1646_) / f_1728_;
		f_1718_ = (f_1650_ - f_1649_) / f_1728_;
		f_1719_ = (f_1653_ - f_1652_) / f_1728_;
		f_1720_ = (f_1656_ - f_1655_) / f_1728_;
		f_1721_ = (f_1662_ - f_1661_) / f_1728_;
		f_1722_ = (f_1687_ - f_1686_) / f_1728_;
		f_1723_ = (f_1690_ - f_1689_) / f_1728_;
		f_1724_ = (f_1693_ - f_1692_) / f_1728_;
		f_1725_ = (f_1696_ - f_1695_) / f_1728_;
		f_1726_ = (f_1699_ - f_1698_) / f_1728_;
		f_1727_ = (f_1702_ - f_1701_) / f_1728_;
	    }
	    float f_1729_ = 0.0F;
	    float f_1730_ = 0.0F;
	    float f_1731_ = 0.0F;
	    float f_1732_ = 0.0F;
	    float f_1733_ = 0.0F;
	    float f_1734_ = 0.0F;
	    float f_1735_ = 0.0F;
	    float f_1736_ = 0.0F;
	    float f_1737_ = 0.0F;
	    float f_1738_ = 0.0F;
	    float f_1739_ = 0.0F;
	    float f_1740_ = 0.0F;
	    if (f != f_1641_) {
		float f_1741_ = f - f_1641_;
		f_1729_ = (f_1642_ - f_1644_) / f_1741_;
		f_1730_ = (f_1645_ - f_1647_) / f_1741_;
		f_1731_ = (f_1648_ - f_1650_) / f_1741_;
		f_1732_ = (f_1651_ - f_1653_) / f_1741_;
		f_1733_ = (f_1654_ - f_1656_) / f_1741_;
		f_1734_ = (f_1660_ - f_1662_) / f_1741_;
		f_1735_ = (f_1685_ - f_1687_) / f_1741_;
		f_1736_ = (f_1688_ - f_1690_) / f_1741_;
		f_1737_ = (f_1691_ - f_1693_) / f_1741_;
		f_1738_ = (f_1694_ - f_1696_) / f_1741_;
		f_1739_ = (f_1697_ - f_1699_) / f_1741_;
		f_1740_ = (f_1700_ - f_1702_) / f_1741_;
	    }
	    if (!(f >= (float) ((Class155_Backup) this).anInt1726)) {
		if (f_1640_ > (float) ((Class155_Backup) this).anInt1726)
		    f_1640_ = (float) ((Class155_Backup) this).anInt1726;
		if (f_1641_ > (float) ((Class155_Backup) this).anInt1726)
		    f_1641_ = (float) ((Class155_Backup) this).anInt1726;
		if (f_1640_ < f_1641_) {
		    f_1644_ = f_1642_;
		    f_1647_ = f_1645_;
		    f_1650_ = f_1648_;
		    f_1653_ = f_1651_;
		    f_1656_ = f_1654_;
		    f_1662_ = f_1660_;
		    f_1687_ = f_1685_;
		    f_1690_ = f_1688_;
		    f_1693_ = f_1691_;
		    f_1696_ = f_1694_;
		    f_1699_ = f_1697_;
		    f_1702_ = f_1700_;
		    if (f < 0.0F) {
			f_1642_ -= f_1703_ * f;
			f_1644_ -= f_1729_ * f;
			f_1645_ -= f_1704_ * f;
			f_1647_ -= f_1730_ * f;
			f_1648_ -= f_1705_ * f;
			f_1650_ -= f_1731_ * f;
			f_1651_ -= f_1706_ * f;
			f_1653_ -= f_1732_ * f;
			f_1654_ -= f_1707_ * f;
			f_1656_ -= f_1733_ * f;
			f_1660_ -= f_1708_ * f;
			f_1662_ -= f_1734_ * f;
			f_1685_ -= f_1709_ * f;
			f_1687_ -= f_1735_ * f;
			f_1688_ -= f_1710_ * f;
			f_1690_ -= f_1736_ * f;
			f_1691_ -= f_1711_ * f;
			f_1693_ -= f_1737_ * f;
			f_1694_ -= f_1712_ * f;
			f_1696_ -= f_1738_ * f;
			f_1697_ -= f_1713_ * f;
			f_1699_ -= f_1739_ * f;
			f_1700_ -= f_1714_ * f;
			f_1702_ -= f_1740_ * f;
			f = 0.0F;
		    }
		    if (f_1640_ < 0.0F) {
			f_1643_ -= f_1716_ * f_1640_;
			f_1646_ -= f_1717_ * f_1640_;
			f_1649_ -= f_1718_ * f_1640_;
			f_1652_ -= f_1719_ * f_1640_;
			f_1655_ -= f_1720_ * f_1640_;
			f_1661_ -= f_1721_ * f_1640_;
			f_1686_ -= f_1722_ * f_1640_;
			f_1689_ -= f_1723_ * f_1640_;
			f_1692_ -= f_1724_ * f_1640_;
			f_1695_ -= f_1725_ * f_1640_;
			f_1698_ -= f_1726_ * f_1640_;
			f_1701_ -= f_1727_ * f_1640_;
			f_1640_ = 0.0F;
		    }
		    if (f != f_1640_ && f_1729_ < f_1703_
			|| f == f_1640_ && f_1729_ > f_1716_) {
			f += 0.5F;
			f_1640_ += 0.5F;
			f_1641_ = (float) (int) (f_1641_ + 0.5F) - f_1640_;
			f_1640_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_1640_ >= 0.0F) {
			    method3343(bool_1638_, bool_1639_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1644_, (int) f_1642_,
				       f_1647_, f_1645_, f_1650_, f_1648_,
				       f_1653_, f_1651_, f_1656_, f_1654_,
				       f_1662_, f_1660_, f_1687_, f_1685_,
				       f_1690_, f_1688_, f_1693_, f_1691_,
				       f_1696_, f_1694_, f_1699_, f_1697_,
				       f_1702_, f_1700_);
			    f_1642_ += f_1703_;
			    f_1644_ += f_1729_;
			    f_1645_ += f_1704_;
			    f_1647_ += f_1730_;
			    f_1648_ += f_1705_;
			    f_1650_ += f_1731_;
			    f_1651_ += f_1706_;
			    f_1653_ += f_1732_;
			    f_1654_ += f_1707_;
			    f_1656_ += f_1733_;
			    f_1660_ += f_1708_;
			    f_1662_ += f_1734_;
			    f_1685_ += f_1709_;
			    f_1687_ += f_1735_;
			    f_1688_ += f_1710_;
			    f_1690_ += f_1736_;
			    f_1691_ += f_1711_;
			    f_1693_ += f_1737_;
			    f_1694_ += f_1712_;
			    f_1696_ += f_1738_;
			    f_1697_ += f_1713_;
			    f_1699_ += f_1739_;
			    f_1700_ += f_1714_;
			    f_1702_ += f_1740_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_1641_ >= 0.0F) {
			    method3343(bool_1638_, bool_1639_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1644_, (int) f_1643_,
				       f_1647_, f_1646_, f_1650_, f_1649_,
				       f_1653_, f_1652_, f_1656_, f_1655_,
				       f_1662_, f_1661_, f_1687_, f_1686_,
				       f_1690_, f_1689_, f_1693_, f_1692_,
				       f_1696_, f_1695_, f_1699_, f_1698_,
				       f_1702_, f_1701_);
			    f_1643_ += f_1716_;
			    f_1644_ += f_1729_;
			    f_1646_ += f_1717_;
			    f_1647_ += f_1730_;
			    f_1649_ += f_1718_;
			    f_1650_ += f_1731_;
			    f_1652_ += f_1719_;
			    f_1653_ += f_1732_;
			    f_1655_ += f_1720_;
			    f_1656_ += f_1733_;
			    f_1661_ += f_1721_;
			    f_1662_ += f_1734_;
			    f_1686_ += f_1722_;
			    f_1687_ += f_1735_;
			    f_1689_ += f_1723_;
			    f_1690_ += f_1736_;
			    f_1692_ += f_1724_;
			    f_1693_ += f_1737_;
			    f_1695_ += f_1725_;
			    f_1696_ += f_1738_;
			    f_1698_ += f_1726_;
			    f_1699_ += f_1739_;
			    f_1701_ += f_1727_;
			    f_1702_ += f_1740_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    } else {
			f += 0.5F;
			f_1640_ += 0.5F;
			f_1641_ = (float) (int) (f_1641_ + 0.5F) - f_1640_;
			f_1640_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_1640_ >= 0.0F) {
			    method3343(bool_1638_, bool_1639_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1642_, (int) f_1644_,
				       f_1645_, f_1647_, f_1648_, f_1650_,
				       f_1651_, f_1653_, f_1654_, f_1656_,
				       f_1660_, f_1662_, f_1685_, f_1687_,
				       f_1688_, f_1690_, f_1691_, f_1693_,
				       f_1694_, f_1696_, f_1697_, f_1699_,
				       f_1700_, f_1702_);
			    f_1642_ += f_1703_;
			    f_1644_ += f_1729_;
			    f_1645_ += f_1704_;
			    f_1647_ += f_1730_;
			    f_1648_ += f_1705_;
			    f_1650_ += f_1731_;
			    f_1651_ += f_1706_;
			    f_1653_ += f_1732_;
			    f_1654_ += f_1707_;
			    f_1656_ += f_1733_;
			    f_1660_ += f_1708_;
			    f_1662_ += f_1734_;
			    f_1685_ += f_1709_;
			    f_1687_ += f_1735_;
			    f_1688_ += f_1710_;
			    f_1690_ += f_1736_;
			    f_1691_ += f_1711_;
			    f_1693_ += f_1737_;
			    f_1694_ += f_1712_;
			    f_1696_ += f_1738_;
			    f_1697_ += f_1713_;
			    f_1699_ += f_1739_;
			    f_1700_ += f_1714_;
			    f_1702_ += f_1740_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_1641_ >= 0.0F) {
			    method3343(bool_1638_, bool_1639_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1643_, (int) f_1644_,
				       f_1646_, f_1647_, f_1649_, f_1650_,
				       f_1652_, f_1653_, f_1655_, f_1656_,
				       f_1661_, f_1662_, f_1686_, f_1687_,
				       f_1689_, f_1690_, f_1692_, f_1693_,
				       f_1695_, f_1696_, f_1698_, f_1699_,
				       f_1701_, f_1702_);
			    f_1643_ += f_1716_;
			    f_1644_ += f_1729_;
			    f_1646_ += f_1717_;
			    f_1647_ += f_1730_;
			    f_1649_ += f_1718_;
			    f_1650_ += f_1731_;
			    f_1652_ += f_1719_;
			    f_1653_ += f_1732_;
			    f_1655_ += f_1720_;
			    f_1656_ += f_1733_;
			    f_1661_ += f_1721_;
			    f_1662_ += f_1734_;
			    f_1686_ += f_1722_;
			    f_1687_ += f_1735_;
			    f_1689_ += f_1723_;
			    f_1690_ += f_1736_;
			    f_1692_ += f_1724_;
			    f_1693_ += f_1737_;
			    f_1695_ += f_1725_;
			    f_1696_ += f_1738_;
			    f_1698_ += f_1726_;
			    f_1699_ += f_1739_;
			    f_1701_ += f_1727_;
			    f_1702_ += f_1740_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    }
		} else {
		    f_1643_ = f_1642_;
		    f_1646_ = f_1645_;
		    f_1649_ = f_1648_;
		    f_1652_ = f_1651_;
		    f_1655_ = f_1654_;
		    f_1661_ = f_1660_;
		    f_1686_ = f_1685_;
		    f_1689_ = f_1688_;
		    f_1692_ = f_1691_;
		    f_1695_ = f_1694_;
		    f_1698_ = f_1697_;
		    f_1701_ = f_1700_;
		    if (f < 0.0F) {
			f_1642_ -= f_1703_ * f;
			f_1643_ -= f_1729_ * f;
			f_1645_ -= f_1704_ * f;
			f_1646_ -= f_1730_ * f;
			f_1648_ -= f_1705_ * f;
			f_1649_ -= f_1731_ * f;
			f_1651_ -= f_1706_ * f;
			f_1652_ -= f_1732_ * f;
			f_1654_ -= f_1707_ * f;
			f_1655_ -= f_1733_ * f;
			f_1660_ -= f_1708_ * f;
			f_1661_ -= f_1734_ * f;
			f_1685_ -= f_1709_ * f;
			f_1686_ -= f_1735_ * f;
			f_1688_ -= f_1710_ * f;
			f_1689_ -= f_1736_ * f;
			f_1691_ -= f_1711_ * f;
			f_1692_ -= f_1737_ * f;
			f_1694_ -= f_1712_ * f;
			f_1695_ -= f_1738_ * f;
			f_1697_ -= f_1713_ * f;
			f_1698_ -= f_1739_ * f;
			f_1700_ -= f_1714_ * f;
			f_1701_ -= f_1740_ * f;
			f = 0.0F;
		    }
		    if (f_1641_ < 0.0F) {
			f_1644_ -= f_1716_ * f_1641_;
			f_1647_ -= f_1717_ * f_1641_;
			f_1650_ -= f_1718_ * f_1641_;
			f_1653_ -= f_1719_ * f_1641_;
			f_1656_ -= f_1720_ * f_1641_;
			f_1662_ -= f_1721_ * f_1641_;
			f_1687_ -= f_1722_ * f_1641_;
			f_1690_ -= f_1723_ * f_1641_;
			f_1693_ -= f_1724_ * f_1641_;
			f_1696_ -= f_1725_ * f_1641_;
			f_1699_ -= f_1726_ * f_1641_;
			f_1702_ -= f_1727_ * f_1641_;
			f_1641_ = 0.0F;
		    }
		    if (f != f_1641_ && f_1729_ < f_1703_
			|| f == f_1641_ && f_1716_ > f_1703_) {
			f += 0.5F;
			f_1641_ += 0.5F;
			f_1640_ = (float) (int) (f_1640_ + 0.5F) - f_1641_;
			f_1641_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_1641_ >= 0.0F) {
			    method3343(bool_1638_, bool_1639_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1643_, (int) f_1642_,
				       f_1646_, f_1645_, f_1649_, f_1648_,
				       f_1652_, f_1651_, f_1655_, f_1654_,
				       f_1661_, f_1660_, f_1686_, f_1685_,
				       f_1689_, f_1688_, f_1692_, f_1691_,
				       f_1695_, f_1694_, f_1698_, f_1697_,
				       f_1701_, f_1700_);
			    f_1642_ += f_1703_;
			    f_1643_ += f_1729_;
			    f_1645_ += f_1704_;
			    f_1646_ += f_1730_;
			    f_1648_ += f_1705_;
			    f_1649_ += f_1731_;
			    f_1651_ += f_1706_;
			    f_1652_ += f_1732_;
			    f_1654_ += f_1707_;
			    f_1655_ += f_1733_;
			    f_1660_ += f_1708_;
			    f_1661_ += f_1734_;
			    f_1685_ += f_1709_;
			    f_1686_ += f_1735_;
			    f_1688_ += f_1710_;
			    f_1689_ += f_1736_;
			    f_1691_ += f_1711_;
			    f_1692_ += f_1737_;
			    f_1694_ += f_1712_;
			    f_1695_ += f_1738_;
			    f_1697_ += f_1713_;
			    f_1698_ += f_1739_;
			    f_1700_ += f_1714_;
			    f_1701_ += f_1740_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_1640_ >= 0.0F) {
			    method3343(bool_1638_, bool_1639_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1644_, (int) f_1642_,
				       f_1647_, f_1645_, f_1650_, f_1648_,
				       f_1653_, f_1651_, f_1656_, f_1654_,
				       f_1662_, f_1660_, f_1687_, f_1685_,
				       f_1690_, f_1688_, f_1693_, f_1691_,
				       f_1696_, f_1694_, f_1699_, f_1697_,
				       f_1702_, f_1700_);
			    f_1644_ += f_1716_;
			    f_1642_ += f_1703_;
			    f_1647_ += f_1717_;
			    f_1645_ += f_1704_;
			    f_1650_ += f_1718_;
			    f_1648_ += f_1705_;
			    f_1653_ += f_1719_;
			    f_1651_ += f_1706_;
			    f_1656_ += f_1720_;
			    f_1654_ += f_1707_;
			    f_1662_ += f_1721_;
			    f_1660_ += f_1708_;
			    f_1687_ += f_1722_;
			    f_1685_ += f_1709_;
			    f_1690_ += f_1723_;
			    f_1688_ += f_1710_;
			    f_1693_ += f_1724_;
			    f_1691_ += f_1711_;
			    f_1696_ += f_1725_;
			    f_1694_ += f_1712_;
			    f_1699_ += f_1726_;
			    f_1697_ += f_1713_;
			    f_1702_ += f_1727_;
			    f_1700_ += f_1714_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    } else {
			f += 0.5F;
			f_1641_ += 0.5F;
			f_1640_ = (float) (int) (f_1640_ + 0.5F) - f_1641_;
			f_1641_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_1641_ >= 0.0F) {
			    method3343(bool_1638_, bool_1639_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1642_, (int) f_1643_,
				       f_1645_, f_1646_, f_1648_, f_1649_,
				       f_1651_, f_1652_, f_1654_, f_1655_,
				       f_1660_, f_1661_, f_1685_, f_1686_,
				       f_1688_, f_1689_, f_1691_, f_1692_,
				       f_1694_, f_1695_, f_1697_, f_1698_,
				       f_1700_, f_1701_);
			    f_1643_ += f_1729_;
			    f_1642_ += f_1703_;
			    f_1646_ += f_1730_;
			    f_1645_ += f_1704_;
			    f_1649_ += f_1731_;
			    f_1648_ += f_1705_;
			    f_1652_ += f_1732_;
			    f_1651_ += f_1706_;
			    f_1655_ += f_1733_;
			    f_1654_ += f_1707_;
			    f_1661_ += f_1734_;
			    f_1660_ += f_1708_;
			    f_1686_ += f_1735_;
			    f_1685_ += f_1709_;
			    f_1689_ += f_1736_;
			    f_1688_ += f_1710_;
			    f_1692_ += f_1737_;
			    f_1691_ += f_1711_;
			    f_1695_ += f_1738_;
			    f_1694_ += f_1712_;
			    f_1698_ += f_1739_;
			    f_1697_ += f_1713_;
			    f_1701_ += f_1740_;
			    f_1700_ += f_1714_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_1640_ >= 0.0F) {
			    method3343(bool_1638_, bool_1639_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1642_, (int) f_1644_,
				       f_1645_, f_1647_, f_1648_, f_1650_,
				       f_1651_, f_1653_, f_1654_, f_1656_,
				       f_1660_, f_1662_, f_1685_, f_1687_,
				       f_1688_, f_1690_, f_1691_, f_1693_,
				       f_1694_, f_1696_, f_1697_, f_1699_,
				       f_1700_, f_1702_);
			    f_1642_ += f_1703_;
			    f_1644_ += f_1716_;
			    f_1645_ += f_1704_;
			    f_1647_ += f_1717_;
			    f_1648_ += f_1705_;
			    f_1650_ += f_1718_;
			    f_1651_ += f_1706_;
			    f_1653_ += f_1719_;
			    f_1654_ += f_1707_;
			    f_1656_ += f_1720_;
			    f_1660_ += f_1708_;
			    f_1662_ += f_1721_;
			    f_1685_ += f_1709_;
			    f_1687_ += f_1722_;
			    f_1688_ += f_1710_;
			    f_1690_ += f_1723_;
			    f_1691_ += f_1711_;
			    f_1693_ += f_1724_;
			    f_1694_ += f_1712_;
			    f_1696_ += f_1725_;
			    f_1697_ += f_1713_;
			    f_1699_ += f_1726_;
			    f_1700_ += f_1714_;
			    f_1702_ += f_1727_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    }
		}
	    }
	}
    }
    
    final void method3382
	(boolean bool, boolean bool_1742_, boolean bool_1743_, float f,
	 float f_1744_, float f_1745_, float f_1746_, float f_1747_,
	 float f_1748_, float f_1749_, float f_1750_, float f_1751_,
	 float f_1752_, float f_1753_, float f_1754_, float f_1755_,
	 float f_1756_, float f_1757_, float f_1758_, float f_1759_,
	 float f_1760_, int i, int i_1761_, int i_1762_, int i_1763_,
	 float f_1764_, float f_1765_, float f_1766_, int i_1767_, int i_1768_,
	 float f_1769_, int i_1770_, int i_1771_, float f_1772_, int i_1773_,
	 int i_1774_, float f_1775_) {
	if (!bool)
	    method3377(false, bool_1742_, bool_1743_, f, f_1744_, f_1745_,
		       f_1746_, f_1747_, f_1748_, f_1749_, f_1750_, f_1751_,
		       0);
	else {
	    ((Class155_Backup) this).anInt1740 = i_1763_;
	    if (!(f <= f_1744_) || !(f <= f_1745_)) {
		if (f_1744_ <= f_1745_) {
		    float f_1776_ = f_1746_;
		    f_1746_ = f_1747_;
		    f_1747_ = f_1776_;
		    f_1776_ = f;
		    f = f_1744_;
		    f_1744_ = f_1776_;
		    f_1776_ = f_1749_;
		    f_1749_ = f_1750_;
		    f_1750_ = f_1776_;
		    f_1776_ = f_1755_;
		    f_1755_ = f_1756_;
		    f_1756_ = f_1776_;
		    f_1776_ = f_1758_;
		    f_1758_ = f_1759_;
		    f_1759_ = f_1776_;
		    f_1776_ = f_1752_;
		    f_1752_ = f_1753_;
		    f_1753_ = f_1776_;
		    f_1776_ = f_1764_;
		    f_1764_ = f_1765_;
		    f_1765_ = f_1776_;
		    f_1776_ = f_1769_;
		    f_1769_ = f_1772_;
		    f_1772_ = f_1776_;
		    int i_1777_ = i;
		    i = i_1761_;
		    i_1761_ = i_1777_;
		    i_1777_ = i_1768_;
		    i_1768_ = i_1771_;
		    i_1771_ = i_1777_;
		    i_1777_ = i_1767_;
		    i_1767_ = i_1770_;
		    i_1770_ = i_1777_;
		} else {
		    float f_1778_ = f_1746_;
		    f_1746_ = f_1748_;
		    f_1748_ = f_1778_;
		    f_1778_ = f;
		    f = f_1745_;
		    f_1745_ = f_1778_;
		    f_1778_ = f_1749_;
		    f_1749_ = f_1751_;
		    f_1751_ = f_1778_;
		    f_1778_ = f_1755_;
		    f_1755_ = f_1757_;
		    f_1757_ = f_1778_;
		    f_1778_ = f_1758_;
		    f_1758_ = f_1760_;
		    f_1760_ = f_1778_;
		    f_1778_ = f_1752_;
		    f_1752_ = f_1754_;
		    f_1754_ = f_1778_;
		    f_1778_ = f_1764_;
		    f_1764_ = f_1766_;
		    f_1766_ = f_1778_;
		    f_1778_ = f_1769_;
		    f_1769_ = f_1775_;
		    f_1775_ = f_1778_;
		    int i_1779_ = i;
		    i = i_1762_;
		    i_1762_ = i_1779_;
		    i_1779_ = i_1768_;
		    i_1768_ = i_1774_;
		    i_1774_ = i_1779_;
		    i_1779_ = i_1767_;
		    i_1767_ = i_1773_;
		    i_1773_ = i_1779_;
		}
	    }
	    int i_1780_ = (i_1767_ & 0xffff) << 16 | i_1768_ & 0xffff;
	    int i_1781_ = (i_1770_ & 0xffff) << 16 | i_1771_ & 0xffff;
	    int i_1782_ = (i_1773_ & 0xffff) << 16 | i_1774_ & 0xffff;
	    if (i_1780_ != ((Class155_Backup) this).anInt1734) {
		((Class155_Backup) this).anIntArray1725
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15389(i_1767_, i_1768_);
		if (((Class155_Backup) this).anIntArray1725 == null) {
		    ((Class155_Backup) this).anInt1734 = -1;
		    ((Class155_Backup) this).anInt1723 = 255 - (i >> 24 & 0xff);
		    int i_1783_ = (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     (((Class155_Backup) this).aClass103_Sub2_1743
					  .method15368(i_1767_),
				      580628505)) & 0xffff]);
		    int i_1784_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_1783_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_1783_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_1783_ & 0xff) >> 8);
		    method3385(true, bool_1742_, bool_1743_, f, f_1744_,
			       f_1745_, f_1746_, f_1747_, f_1748_, f_1749_,
			       f_1750_, f_1751_,
			       Class54.method1306(i_1784_, i_1763_, f_1764_,
						  1372221625),
			       Class54.method1306(i_1784_, i_1763_, f_1765_,
						  1372221625),
			       Class54.method1306(i_1784_, i_1763_, f_1766_,
						  1372221625));
		    return;
		}
		((Class155_Backup) this).anInt1734 = i_1780_;
		((Class155_Backup) this).anInt1752
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15365(i_1767_);
		((Class155_Backup) this).anInt1744 = ((Class155_Backup) this).anInt1752 - 1;
		((Class155_Backup) this).aClass529_1746
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15366(i_1767_);
	    }
	    ((Class155_Backup) this).aFloat1745 = f_1769_;
	    if (i_1781_ != ((Class155_Backup) this).anInt1749) {
		((Class155_Backup) this).anIntArray1750
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15389(i_1770_, i_1771_);
		if (((Class155_Backup) this).anIntArray1750 == null) {
		    ((Class155_Backup) this).anInt1749 = -1;
		    ((Class155_Backup) this).anInt1723 = 255 - (i >> 24 & 0xff);
		    int i_1785_ = (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     (((Class155_Backup) this).aClass103_Sub2_1743
					  .method15368(i_1770_),
				      -76046514)) & 0xffff]);
		    int i_1786_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_1785_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_1785_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_1785_ & 0xff) >> 8);
		    method3385(true, bool_1742_, bool_1743_, f, f_1744_,
			       f_1745_, f_1746_, f_1747_, f_1748_, f_1749_,
			       f_1750_, f_1751_,
			       Class54.method1306(i_1786_, i_1763_, f_1764_,
						  1372221625),
			       Class54.method1306(i_1786_, i_1763_, f_1765_,
						  1372221625),
			       Class54.method1306(i_1786_, i_1763_, f_1766_,
						  1372221625));
		    return;
		}
		((Class155_Backup) this).anInt1749 = i_1781_;
		((Class155_Backup) this).anInt1757
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15365(i_1770_);
		((Class155_Backup) this).anInt1742 = ((Class155_Backup) this).anInt1757 - 1;
	    }
	    ((Class155_Backup) this).aFloat1753 = f_1772_;
	    if (i_1782_ != ((Class155_Backup) this).anInt1754) {
		((Class155_Backup) this).anIntArray1755
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15389(i_1773_, i_1774_);
		if (((Class155_Backup) this).anIntArray1755 == null) {
		    ((Class155_Backup) this).anInt1754 = -1;
		    ((Class155_Backup) this).anInt1723 = 255 - (i >> 24 & 0xff);
		    int i_1787_ = (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     (((Class155_Backup) this).aClass103_Sub2_1743
					  .method15368(i_1773_),
				      -1226669089)) & 0xffff]);
		    int i_1788_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_1787_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_1787_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_1787_ & 0xff) >> 8);
		    method3385(true, bool_1742_, bool_1743_, (float) (int) f,
			       (float) (int) f_1744_, (float) (int) f_1745_,
			       (float) (int) f_1746_, (float) (int) f_1747_,
			       (float) (int) f_1748_, (float) (int) f_1749_,
			       (float) (int) f_1750_, (float) (int) f_1751_,
			       Class54.method1306(i_1788_, i_1763_, f_1764_,
						  1372221625),
			       Class54.method1306(i_1788_, i_1763_, f_1765_,
						  1372221625),
			       Class54.method1306(i_1788_, i_1763_, f_1766_,
						  1372221625));
		    return;
		}
		((Class155_Backup) this).anInt1754 = i_1782_;
		((Class155_Backup) this).anInt1738
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15365(i_1773_);
		((Class155_Backup) this).anInt1735 = ((Class155_Backup) this).anInt1738 - 1;
	    }
	    ((Class155_Backup) this).aFloat1758 = f_1775_;
	    f_1755_ /= f_1752_;
	    f_1756_ /= f_1753_;
	    f_1757_ /= f_1754_;
	    f_1758_ /= f_1752_;
	    f_1759_ /= f_1753_;
	    f_1760_ /= f_1754_;
	    f_1749_ = 1.0F / f_1749_;
	    f_1750_ = 1.0F / f_1750_;
	    f_1751_ = 1.0F / f_1751_;
	    f_1752_ = 1.0F / f_1752_;
	    f_1753_ = 1.0F / f_1753_;
	    f_1754_ = 1.0F / f_1754_;
	    float f_1789_ = (float) (i >> 24 & 0xff);
	    float f_1790_ = (float) (i_1761_ >> 24 & 0xff);
	    float f_1791_ = (float) (i_1762_ >> 24 & 0xff);
	    float f_1792_ = (float) (i >> 16 & 0xff);
	    float f_1793_ = (float) (i_1761_ >> 16 & 0xff);
	    float f_1794_ = (float) (i_1762_ >> 16 & 0xff);
	    float f_1795_ = (float) (i >> 8 & 0xff);
	    float f_1796_ = (float) (i_1761_ >> 8 & 0xff);
	    float f_1797_ = (float) (i_1762_ >> 8 & 0xff);
	    float f_1798_ = (float) (i & 0xff);
	    float f_1799_ = (float) (i_1761_ & 0xff);
	    float f_1800_ = (float) (i_1762_ & 0xff);
	    float f_1801_ = 1.0F;
	    float f_1802_ = 0.0F;
	    float f_1803_ = 0.0F;
	    float f_1804_ = 0.0F;
	    float f_1805_ = 1.0F;
	    float f_1806_ = 0.0F;
	    float f_1807_ = 0.0F;
	    float f_1808_ = 0.0F;
	    float f_1809_ = 0.0F;
	    float f_1810_ = 0.0F;
	    float f_1811_ = 0.0F;
	    float f_1812_ = 0.0F;
	    float f_1813_ = 0.0F;
	    float f_1814_ = 0.0F;
	    float f_1815_ = 0.0F;
	    float f_1816_ = 0.0F;
	    float f_1817_ = 0.0F;
	    float f_1818_ = 0.0F;
	    if (f_1744_ != f) {
		float f_1819_ = f_1744_ - f;
		f_1807_ = (f_1747_ - f_1746_) / f_1819_;
		f_1808_ = (f_1750_ - f_1749_) / f_1819_;
		f_1809_ = (f_1753_ - f_1752_) / f_1819_;
		f_1810_ = (f_1756_ - f_1755_) / f_1819_;
		f_1811_ = (f_1759_ - f_1758_) / f_1819_;
		f_1812_ = (f_1765_ - f_1764_) / f_1819_;
		f_1813_ = (f_1790_ - f_1789_) / f_1819_;
		f_1814_ = (f_1793_ - f_1792_) / f_1819_;
		f_1815_ = (f_1796_ - f_1795_) / f_1819_;
		f_1816_ = (f_1799_ - f_1798_) / f_1819_;
		f_1817_ = (f_1802_ - f_1801_) / f_1819_;
		f_1818_ = (f_1805_ - f_1804_) / f_1819_;
	    }
	    float f_1820_ = 0.0F;
	    float f_1821_ = 0.0F;
	    float f_1822_ = 0.0F;
	    float f_1823_ = 0.0F;
	    float f_1824_ = 0.0F;
	    float f_1825_ = 0.0F;
	    float f_1826_ = 0.0F;
	    float f_1827_ = 0.0F;
	    float f_1828_ = 0.0F;
	    float f_1829_ = 0.0F;
	    float f_1830_ = 0.0F;
	    float f_1831_ = 0.0F;
	    if (f_1745_ != f_1744_) {
		float f_1832_ = f_1745_ - f_1744_;
		f_1820_ = (f_1748_ - f_1747_) / f_1832_;
		f_1821_ = (f_1751_ - f_1750_) / f_1832_;
		f_1822_ = (f_1754_ - f_1753_) / f_1832_;
		f_1823_ = (f_1757_ - f_1756_) / f_1832_;
		f_1824_ = (f_1760_ - f_1759_) / f_1832_;
		f_1825_ = (f_1766_ - f_1765_) / f_1832_;
		f_1826_ = (f_1791_ - f_1790_) / f_1832_;
		f_1827_ = (f_1794_ - f_1793_) / f_1832_;
		f_1828_ = (f_1797_ - f_1796_) / f_1832_;
		f_1829_ = (f_1800_ - f_1799_) / f_1832_;
		f_1830_ = (f_1803_ - f_1802_) / f_1832_;
		f_1831_ = (f_1806_ - f_1805_) / f_1832_;
	    }
	    float f_1833_ = 0.0F;
	    float f_1834_ = 0.0F;
	    float f_1835_ = 0.0F;
	    float f_1836_ = 0.0F;
	    float f_1837_ = 0.0F;
	    float f_1838_ = 0.0F;
	    float f_1839_ = 0.0F;
	    float f_1840_ = 0.0F;
	    float f_1841_ = 0.0F;
	    float f_1842_ = 0.0F;
	    float f_1843_ = 0.0F;
	    float f_1844_ = 0.0F;
	    if (f != f_1745_) {
		float f_1845_ = f - f_1745_;
		f_1833_ = (f_1746_ - f_1748_) / f_1845_;
		f_1834_ = (f_1749_ - f_1751_) / f_1845_;
		f_1835_ = (f_1752_ - f_1754_) / f_1845_;
		f_1836_ = (f_1755_ - f_1757_) / f_1845_;
		f_1837_ = (f_1758_ - f_1760_) / f_1845_;
		f_1838_ = (f_1764_ - f_1766_) / f_1845_;
		f_1839_ = (f_1789_ - f_1791_) / f_1845_;
		f_1840_ = (f_1792_ - f_1794_) / f_1845_;
		f_1841_ = (f_1795_ - f_1797_) / f_1845_;
		f_1842_ = (f_1798_ - f_1800_) / f_1845_;
		f_1843_ = (f_1801_ - f_1803_) / f_1845_;
		f_1844_ = (f_1804_ - f_1806_) / f_1845_;
	    }
	    if (!(f >= (float) ((Class155_Backup) this).anInt1726)) {
		if (f_1744_ > (float) ((Class155_Backup) this).anInt1726)
		    f_1744_ = (float) ((Class155_Backup) this).anInt1726;
		if (f_1745_ > (float) ((Class155_Backup) this).anInt1726)
		    f_1745_ = (float) ((Class155_Backup) this).anInt1726;
		if (f_1744_ < f_1745_) {
		    f_1748_ = f_1746_;
		    f_1751_ = f_1749_;
		    f_1754_ = f_1752_;
		    f_1757_ = f_1755_;
		    f_1760_ = f_1758_;
		    f_1766_ = f_1764_;
		    f_1791_ = f_1789_;
		    f_1794_ = f_1792_;
		    f_1797_ = f_1795_;
		    f_1800_ = f_1798_;
		    f_1803_ = f_1801_;
		    f_1806_ = f_1804_;
		    if (f < 0.0F) {
			f_1746_ -= f_1807_ * f;
			f_1748_ -= f_1833_ * f;
			f_1749_ -= f_1808_ * f;
			f_1751_ -= f_1834_ * f;
			f_1752_ -= f_1809_ * f;
			f_1754_ -= f_1835_ * f;
			f_1755_ -= f_1810_ * f;
			f_1757_ -= f_1836_ * f;
			f_1758_ -= f_1811_ * f;
			f_1760_ -= f_1837_ * f;
			f_1764_ -= f_1812_ * f;
			f_1766_ -= f_1838_ * f;
			f_1789_ -= f_1813_ * f;
			f_1791_ -= f_1839_ * f;
			f_1792_ -= f_1814_ * f;
			f_1794_ -= f_1840_ * f;
			f_1795_ -= f_1815_ * f;
			f_1797_ -= f_1841_ * f;
			f_1798_ -= f_1816_ * f;
			f_1800_ -= f_1842_ * f;
			f_1801_ -= f_1817_ * f;
			f_1803_ -= f_1843_ * f;
			f_1804_ -= f_1818_ * f;
			f_1806_ -= f_1844_ * f;
			f = 0.0F;
		    }
		    if (f_1744_ < 0.0F) {
			f_1747_ -= f_1820_ * f_1744_;
			f_1750_ -= f_1821_ * f_1744_;
			f_1753_ -= f_1822_ * f_1744_;
			f_1756_ -= f_1823_ * f_1744_;
			f_1759_ -= f_1824_ * f_1744_;
			f_1765_ -= f_1825_ * f_1744_;
			f_1790_ -= f_1826_ * f_1744_;
			f_1793_ -= f_1827_ * f_1744_;
			f_1796_ -= f_1828_ * f_1744_;
			f_1799_ -= f_1829_ * f_1744_;
			f_1802_ -= f_1830_ * f_1744_;
			f_1805_ -= f_1831_ * f_1744_;
			f_1744_ = 0.0F;
		    }
		    if (f != f_1744_ && f_1833_ < f_1807_
			|| f == f_1744_ && f_1833_ > f_1820_) {
			f += 0.5F;
			f_1744_ += 0.5F;
			f_1745_ = (float) (int) (f_1745_ + 0.5F) - f_1744_;
			f_1744_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_1744_ >= 0.0F) {
			    method3343(bool_1742_, bool_1743_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1748_, (int) f_1746_,
				       f_1751_, f_1749_, f_1754_, f_1752_,
				       f_1757_, f_1755_, f_1760_, f_1758_,
				       f_1766_, f_1764_, f_1791_, f_1789_,
				       f_1794_, f_1792_, f_1797_, f_1795_,
				       f_1800_, f_1798_, f_1803_, f_1801_,
				       f_1806_, f_1804_);
			    f_1746_ += f_1807_;
			    f_1748_ += f_1833_;
			    f_1749_ += f_1808_;
			    f_1751_ += f_1834_;
			    f_1752_ += f_1809_;
			    f_1754_ += f_1835_;
			    f_1755_ += f_1810_;
			    f_1757_ += f_1836_;
			    f_1758_ += f_1811_;
			    f_1760_ += f_1837_;
			    f_1764_ += f_1812_;
			    f_1766_ += f_1838_;
			    f_1789_ += f_1813_;
			    f_1791_ += f_1839_;
			    f_1792_ += f_1814_;
			    f_1794_ += f_1840_;
			    f_1795_ += f_1815_;
			    f_1797_ += f_1841_;
			    f_1798_ += f_1816_;
			    f_1800_ += f_1842_;
			    f_1801_ += f_1817_;
			    f_1803_ += f_1843_;
			    f_1804_ += f_1818_;
			    f_1806_ += f_1844_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_1745_ >= 0.0F) {
			    method3343(bool_1742_, bool_1743_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1748_, (int) f_1747_,
				       f_1751_, f_1750_, f_1754_, f_1753_,
				       f_1757_, f_1756_, f_1760_, f_1759_,
				       f_1766_, f_1765_, f_1791_, f_1790_,
				       f_1794_, f_1793_, f_1797_, f_1796_,
				       f_1800_, f_1799_, f_1803_, f_1802_,
				       f_1806_, f_1805_);
			    f_1747_ += f_1820_;
			    f_1748_ += f_1833_;
			    f_1750_ += f_1821_;
			    f_1751_ += f_1834_;
			    f_1753_ += f_1822_;
			    f_1754_ += f_1835_;
			    f_1756_ += f_1823_;
			    f_1757_ += f_1836_;
			    f_1759_ += f_1824_;
			    f_1760_ += f_1837_;
			    f_1765_ += f_1825_;
			    f_1766_ += f_1838_;
			    f_1790_ += f_1826_;
			    f_1791_ += f_1839_;
			    f_1793_ += f_1827_;
			    f_1794_ += f_1840_;
			    f_1796_ += f_1828_;
			    f_1797_ += f_1841_;
			    f_1799_ += f_1829_;
			    f_1800_ += f_1842_;
			    f_1802_ += f_1830_;
			    f_1803_ += f_1843_;
			    f_1805_ += f_1831_;
			    f_1806_ += f_1844_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    } else {
			f += 0.5F;
			f_1744_ += 0.5F;
			f_1745_ = (float) (int) (f_1745_ + 0.5F) - f_1744_;
			f_1744_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_1744_ >= 0.0F) {
			    method3343(bool_1742_, bool_1743_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1746_, (int) f_1748_,
				       f_1749_, f_1751_, f_1752_, f_1754_,
				       f_1755_, f_1757_, f_1758_, f_1760_,
				       f_1764_, f_1766_, f_1789_, f_1791_,
				       f_1792_, f_1794_, f_1795_, f_1797_,
				       f_1798_, f_1800_, f_1801_, f_1803_,
				       f_1804_, f_1806_);
			    f_1746_ += f_1807_;
			    f_1748_ += f_1833_;
			    f_1749_ += f_1808_;
			    f_1751_ += f_1834_;
			    f_1752_ += f_1809_;
			    f_1754_ += f_1835_;
			    f_1755_ += f_1810_;
			    f_1757_ += f_1836_;
			    f_1758_ += f_1811_;
			    f_1760_ += f_1837_;
			    f_1764_ += f_1812_;
			    f_1766_ += f_1838_;
			    f_1789_ += f_1813_;
			    f_1791_ += f_1839_;
			    f_1792_ += f_1814_;
			    f_1794_ += f_1840_;
			    f_1795_ += f_1815_;
			    f_1797_ += f_1841_;
			    f_1798_ += f_1816_;
			    f_1800_ += f_1842_;
			    f_1801_ += f_1817_;
			    f_1803_ += f_1843_;
			    f_1804_ += f_1818_;
			    f_1806_ += f_1844_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_1745_ >= 0.0F) {
			    method3343(bool_1742_, bool_1743_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1747_, (int) f_1748_,
				       f_1750_, f_1751_, f_1753_, f_1754_,
				       f_1756_, f_1757_, f_1759_, f_1760_,
				       f_1765_, f_1766_, f_1790_, f_1791_,
				       f_1793_, f_1794_, f_1796_, f_1797_,
				       f_1799_, f_1800_, f_1802_, f_1803_,
				       f_1805_, f_1806_);
			    f_1747_ += f_1820_;
			    f_1748_ += f_1833_;
			    f_1750_ += f_1821_;
			    f_1751_ += f_1834_;
			    f_1753_ += f_1822_;
			    f_1754_ += f_1835_;
			    f_1756_ += f_1823_;
			    f_1757_ += f_1836_;
			    f_1759_ += f_1824_;
			    f_1760_ += f_1837_;
			    f_1765_ += f_1825_;
			    f_1766_ += f_1838_;
			    f_1790_ += f_1826_;
			    f_1791_ += f_1839_;
			    f_1793_ += f_1827_;
			    f_1794_ += f_1840_;
			    f_1796_ += f_1828_;
			    f_1797_ += f_1841_;
			    f_1799_ += f_1829_;
			    f_1800_ += f_1842_;
			    f_1802_ += f_1830_;
			    f_1803_ += f_1843_;
			    f_1805_ += f_1831_;
			    f_1806_ += f_1844_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    }
		} else {
		    f_1747_ = f_1746_;
		    f_1750_ = f_1749_;
		    f_1753_ = f_1752_;
		    f_1756_ = f_1755_;
		    f_1759_ = f_1758_;
		    f_1765_ = f_1764_;
		    f_1790_ = f_1789_;
		    f_1793_ = f_1792_;
		    f_1796_ = f_1795_;
		    f_1799_ = f_1798_;
		    f_1802_ = f_1801_;
		    f_1805_ = f_1804_;
		    if (f < 0.0F) {
			f_1746_ -= f_1807_ * f;
			f_1747_ -= f_1833_ * f;
			f_1749_ -= f_1808_ * f;
			f_1750_ -= f_1834_ * f;
			f_1752_ -= f_1809_ * f;
			f_1753_ -= f_1835_ * f;
			f_1755_ -= f_1810_ * f;
			f_1756_ -= f_1836_ * f;
			f_1758_ -= f_1811_ * f;
			f_1759_ -= f_1837_ * f;
			f_1764_ -= f_1812_ * f;
			f_1765_ -= f_1838_ * f;
			f_1789_ -= f_1813_ * f;
			f_1790_ -= f_1839_ * f;
			f_1792_ -= f_1814_ * f;
			f_1793_ -= f_1840_ * f;
			f_1795_ -= f_1815_ * f;
			f_1796_ -= f_1841_ * f;
			f_1798_ -= f_1816_ * f;
			f_1799_ -= f_1842_ * f;
			f_1801_ -= f_1817_ * f;
			f_1802_ -= f_1843_ * f;
			f_1804_ -= f_1818_ * f;
			f_1805_ -= f_1844_ * f;
			f = 0.0F;
		    }
		    if (f_1745_ < 0.0F) {
			f_1748_ -= f_1820_ * f_1745_;
			f_1751_ -= f_1821_ * f_1745_;
			f_1754_ -= f_1822_ * f_1745_;
			f_1757_ -= f_1823_ * f_1745_;
			f_1760_ -= f_1824_ * f_1745_;
			f_1766_ -= f_1825_ * f_1745_;
			f_1791_ -= f_1826_ * f_1745_;
			f_1794_ -= f_1827_ * f_1745_;
			f_1797_ -= f_1828_ * f_1745_;
			f_1800_ -= f_1829_ * f_1745_;
			f_1803_ -= f_1830_ * f_1745_;
			f_1806_ -= f_1831_ * f_1745_;
			f_1745_ = 0.0F;
		    }
		    if (f != f_1745_ && f_1833_ < f_1807_
			|| f == f_1745_ && f_1820_ > f_1807_) {
			f += 0.5F;
			f_1745_ += 0.5F;
			f_1744_ = (float) (int) (f_1744_ + 0.5F) - f_1745_;
			f_1745_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_1745_ >= 0.0F) {
			    method3343(bool_1742_, bool_1743_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1747_, (int) f_1746_,
				       f_1750_, f_1749_, f_1753_, f_1752_,
				       f_1756_, f_1755_, f_1759_, f_1758_,
				       f_1765_, f_1764_, f_1790_, f_1789_,
				       f_1793_, f_1792_, f_1796_, f_1795_,
				       f_1799_, f_1798_, f_1802_, f_1801_,
				       f_1805_, f_1804_);
			    f_1746_ += f_1807_;
			    f_1747_ += f_1833_;
			    f_1749_ += f_1808_;
			    f_1750_ += f_1834_;
			    f_1752_ += f_1809_;
			    f_1753_ += f_1835_;
			    f_1755_ += f_1810_;
			    f_1756_ += f_1836_;
			    f_1758_ += f_1811_;
			    f_1759_ += f_1837_;
			    f_1764_ += f_1812_;
			    f_1765_ += f_1838_;
			    f_1789_ += f_1813_;
			    f_1790_ += f_1839_;
			    f_1792_ += f_1814_;
			    f_1793_ += f_1840_;
			    f_1795_ += f_1815_;
			    f_1796_ += f_1841_;
			    f_1798_ += f_1816_;
			    f_1799_ += f_1842_;
			    f_1801_ += f_1817_;
			    f_1802_ += f_1843_;
			    f_1804_ += f_1818_;
			    f_1805_ += f_1844_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_1744_ >= 0.0F) {
			    method3343(bool_1742_, bool_1743_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1748_, (int) f_1746_,
				       f_1751_, f_1749_, f_1754_, f_1752_,
				       f_1757_, f_1755_, f_1760_, f_1758_,
				       f_1766_, f_1764_, f_1791_, f_1789_,
				       f_1794_, f_1792_, f_1797_, f_1795_,
				       f_1800_, f_1798_, f_1803_, f_1801_,
				       f_1806_, f_1804_);
			    f_1748_ += f_1820_;
			    f_1746_ += f_1807_;
			    f_1751_ += f_1821_;
			    f_1749_ += f_1808_;
			    f_1754_ += f_1822_;
			    f_1752_ += f_1809_;
			    f_1757_ += f_1823_;
			    f_1755_ += f_1810_;
			    f_1760_ += f_1824_;
			    f_1758_ += f_1811_;
			    f_1766_ += f_1825_;
			    f_1764_ += f_1812_;
			    f_1791_ += f_1826_;
			    f_1789_ += f_1813_;
			    f_1794_ += f_1827_;
			    f_1792_ += f_1814_;
			    f_1797_ += f_1828_;
			    f_1795_ += f_1815_;
			    f_1800_ += f_1829_;
			    f_1798_ += f_1816_;
			    f_1803_ += f_1830_;
			    f_1801_ += f_1817_;
			    f_1806_ += f_1831_;
			    f_1804_ += f_1818_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    } else {
			f += 0.5F;
			f_1745_ += 0.5F;
			f_1744_ = (float) (int) (f_1744_ + 0.5F) - f_1745_;
			f_1745_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_1745_ >= 0.0F) {
			    method3343(bool_1742_, bool_1743_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1746_, (int) f_1747_,
				       f_1749_, f_1750_, f_1752_, f_1753_,
				       f_1755_, f_1756_, f_1758_, f_1759_,
				       f_1764_, f_1765_, f_1789_, f_1790_,
				       f_1792_, f_1793_, f_1795_, f_1796_,
				       f_1798_, f_1799_, f_1801_, f_1802_,
				       f_1804_, f_1805_);
			    f_1747_ += f_1833_;
			    f_1746_ += f_1807_;
			    f_1750_ += f_1834_;
			    f_1749_ += f_1808_;
			    f_1753_ += f_1835_;
			    f_1752_ += f_1809_;
			    f_1756_ += f_1836_;
			    f_1755_ += f_1810_;
			    f_1759_ += f_1837_;
			    f_1758_ += f_1811_;
			    f_1765_ += f_1838_;
			    f_1764_ += f_1812_;
			    f_1790_ += f_1839_;
			    f_1789_ += f_1813_;
			    f_1793_ += f_1840_;
			    f_1792_ += f_1814_;
			    f_1796_ += f_1841_;
			    f_1795_ += f_1815_;
			    f_1799_ += f_1842_;
			    f_1798_ += f_1816_;
			    f_1802_ += f_1843_;
			    f_1801_ += f_1817_;
			    f_1805_ += f_1844_;
			    f_1804_ += f_1818_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_1744_ >= 0.0F) {
			    method3343(bool_1742_, bool_1743_,
				       ((Class155_Backup) this).anIntArray1751,
				       (int) f, (int) f_1746_, (int) f_1748_,
				       f_1749_, f_1751_, f_1752_, f_1754_,
				       f_1755_, f_1757_, f_1758_, f_1760_,
				       f_1764_, f_1766_, f_1789_, f_1791_,
				       f_1792_, f_1794_, f_1795_, f_1797_,
				       f_1798_, f_1800_, f_1801_, f_1803_,
				       f_1804_, f_1806_);
			    f_1746_ += f_1807_;
			    f_1748_ += f_1820_;
			    f_1749_ += f_1808_;
			    f_1751_ += f_1821_;
			    f_1752_ += f_1809_;
			    f_1754_ += f_1822_;
			    f_1755_ += f_1810_;
			    f_1757_ += f_1823_;
			    f_1758_ += f_1811_;
			    f_1760_ += f_1824_;
			    f_1764_ += f_1812_;
			    f_1766_ += f_1825_;
			    f_1789_ += f_1813_;
			    f_1791_ += f_1826_;
			    f_1792_ += f_1814_;
			    f_1794_ += f_1827_;
			    f_1795_ += f_1815_;
			    f_1797_ += f_1828_;
			    f_1798_ += f_1816_;
			    f_1800_ += f_1829_;
			    f_1801_ += f_1817_;
			    f_1803_ += f_1830_;
			    f_1804_ += f_1818_;
			    f_1806_ += f_1831_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    }
		}
	    }
	}
    }
    
    final void method3383
	(boolean bool, boolean bool_1846_, int[] is, int i, int i_1847_,
	 int i_1848_, float f, float f_1849_, float f_1850_, float f_1851_,
	 float f_1852_, float f_1853_, float f_1854_, float f_1855_,
	 float f_1856_, float f_1857_, float f_1858_, float f_1859_,
	 float f_1860_, float f_1861_, float f_1862_, float f_1863_,
	 float f_1864_, float f_1865_, float f_1866_, float f_1867_,
	 float f_1868_, float f_1869_) {
	int i_1870_ = i_1848_ - i_1847_;
	float f_1871_ = 1.0F / (float) i_1870_;
	float f_1872_ = (f_1849_ - f) * f_1871_;
	float f_1873_ = (f_1851_ - f_1850_) * f_1871_;
	float f_1874_ = (f_1853_ - f_1852_) * f_1871_;
	float f_1875_ = (f_1855_ - f_1854_) * f_1871_;
	float f_1876_ = (f_1857_ - f_1856_) * f_1871_;
	float f_1877_ = (f_1859_ - f_1858_) * f_1871_;
	float f_1878_ = (f_1861_ - f_1860_) * f_1871_;
	float f_1879_ = (f_1863_ - f_1862_) * f_1871_;
	float f_1880_ = (f_1865_ - f_1864_) * f_1871_;
	float f_1881_ = (f_1867_ - f_1866_) * f_1871_;
	float f_1882_ = (f_1869_ - f_1868_) * f_1871_;
	if (((Class155_Backup) this).aBool1748) {
	    if (i_1848_ > ((Class155_Backup) this).anInt1733)
		i_1848_ = ((Class155_Backup) this).anInt1733;
	    if (i_1847_ < 0) {
		f -= f_1872_ * (float) i_1847_;
		f_1850_ -= f_1873_ * (float) i_1847_;
		f_1852_ -= f_1874_ * (float) i_1847_;
		f_1854_ -= f_1875_ * (float) i_1847_;
		f_1856_ -= f_1876_ * (float) i_1847_;
		f_1858_ -= f_1877_ * (float) i_1847_;
		f_1860_ -= f_1878_ * (float) i_1847_;
		f_1862_ -= f_1879_ * (float) i_1847_;
		f_1864_ -= f_1880_ * (float) i_1847_;
		f_1866_ -= f_1881_ * (float) i_1847_;
		f_1868_ -= f_1882_ * (float) i_1847_;
		i_1847_ = 0;
	    }
	}
	if (i_1847_ < i_1848_) {
	    i_1870_ = i_1848_ - i_1847_;
	    i += i_1847_;
	    while (i_1870_-- > 0) {
		float f_1883_ = 1.0F / f;
		float f_1884_ = 1.0F / f_1850_;
		if (!bool || f_1883_ < ((Class155_Backup) this).aFloatArray1739[i]) {
		    float f_1885_ = f_1852_ * f_1884_;
		    float f_1886_ = f_1854_ * f_1884_;
		    int i_1887_
			= ((int) (f_1885_ * (float) ((Class155_Backup) this).anInt1752
				  * ((Class155_Backup) this).aFloat1745)
			   & ((Class155_Backup) this).anInt1744);
		    int i_1888_
			= ((int) (f_1886_ * (float) ((Class155_Backup) this).anInt1752
				  * ((Class155_Backup) this).aFloat1745)
			   & ((Class155_Backup) this).anInt1744);
		    int i_1889_
			= (((Class155_Backup) this).anIntArray1725
			   [i_1888_ * ((Class155_Backup) this).anInt1752 + i_1887_]);
		    i_1887_
			= ((int) (f_1885_ * (float) ((Class155_Backup) this).anInt1757
				  * ((Class155_Backup) this).aFloat1753)
			   & ((Class155_Backup) this).anInt1742);
		    i_1888_
			= ((int) (f_1886_ * (float) ((Class155_Backup) this).anInt1757
				  * ((Class155_Backup) this).aFloat1753)
			   & ((Class155_Backup) this).anInt1742);
		    int i_1890_
			= (((Class155_Backup) this).anIntArray1750
			   [i_1888_ * ((Class155_Backup) this).anInt1757 + i_1887_]);
		    i_1887_
			= ((int) (f_1885_ * (float) ((Class155_Backup) this).anInt1738
				  * ((Class155_Backup) this).aFloat1758)
			   & ((Class155_Backup) this).anInt1735);
		    i_1888_
			= ((int) (f_1886_ * (float) ((Class155_Backup) this).anInt1738
				  * ((Class155_Backup) this).aFloat1758)
			   & ((Class155_Backup) this).anInt1735);
		    int i_1891_
			= (((Class155_Backup) this).anIntArray1755
			   [i_1888_ * ((Class155_Backup) this).anInt1738 + i_1887_]);
		    float f_1892_ = 1.0F - (f_1866_ + f_1868_);
		    i_1889_ = (~0xffffff
			       | (int) (f_1866_
					* (float) (i_1889_ >> 16 & 0xff)) << 16
			       | (int) (f_1866_
					* (float) (i_1889_ >> 8 & 0xff)) << 8
			       | (int) (f_1866_ * (float) (i_1889_ & 0xff)));
		    i_1890_ = (~0xffffff
			       | (int) (f_1868_
					* (float) (i_1890_ >> 16 & 0xff)) << 16
			       | (int) (f_1868_
					* (float) (i_1890_ >> 8 & 0xff)) << 8
			       | (int) (f_1868_ * (float) (i_1890_ & 0xff)));
		    i_1891_ = (~0xffffff
			       | (int) (f_1892_
					* (float) (i_1891_ >> 16 & 0xff)) << 16
			       | (int) (f_1892_
					* (float) (i_1891_ >> 8 & 0xff)) << 8
			       | (int) (f_1892_ * (float) (i_1891_ & 0xff)));
		    int i_1893_ = i_1889_ + i_1890_ + i_1891_;
		    int i_1894_
			= (~0xffffff
			   | ((int) (f_1860_ * (float) (i_1893_ >> 16 & 0xff))
			      << 8) & 0xff0000
			   | ((int) (f_1862_ * (float) (i_1893_ >> 8 & 0xff))
			      & 0xff00)
			   | (int) (f_1864_ * (float) (i_1893_ & 0xff)) >> 8);
		    if (f_1856_ != 0.0F) {
			int i_1895_ = (int) (255.0F - f_1856_);
			int i_1896_
			    = ((((((Class155_Backup) this).anInt1740 & 0xff00ff)
				 * (int) f_1856_) & ~0xff00ff
				| ((((Class155_Backup) this).anInt1740 & 0xff00)
				   * (int) f_1856_) & 0xff0000)
			       >>> 8);
			i_1894_ = (((i_1894_ & 0xff00ff) * i_1895_ & ~0xff00ff
				    | (i_1894_ & 0xff00) * i_1895_ & 0xff0000)
				   >>> 8) + i_1896_;
		    }
		    if (bool_1846_)
			is[i] = ((int) f_1858_ | is[i] >> 24) << 24 | i_1894_;
		    else
			is[i] = i_1894_;
		    if (bool)
			((Class155_Backup) this).aFloatArray1739[i] = f_1883_;
		}
		i++;
		f += f_1872_;
		f_1850_ += f_1873_;
		f_1852_ += f_1874_;
		f_1854_ += f_1875_;
		f_1856_ += f_1876_;
		f_1858_ += f_1877_;
		f_1860_ += f_1878_;
		f_1862_ += f_1879_;
		f_1864_ += f_1880_;
		f_1866_ += f_1881_;
		f_1868_ += f_1882_;
	    }
	}
    }
    
    final void method3384
	(boolean bool, boolean bool_1897_, boolean bool_1898_, float f,
	 float f_1899_, float f_1900_, float f_1901_, float f_1902_,
	 float f_1903_, float f_1904_, float f_1905_, float f_1906_,
	 float f_1907_, float f_1908_, float f_1909_, float f_1910_,
	 float f_1911_, float f_1912_, float f_1913_, float f_1914_,
	 float f_1915_, int i, int i_1916_, int i_1917_, int i_1918_,
	 float f_1919_, float f_1920_, float f_1921_, int i_1922_,
	 int i_1923_) {
	if (!bool)
	    method3377(false, bool_1897_, bool_1898_, f, f_1899_, f_1900_,
		       f_1901_, f_1902_, f_1903_, f_1904_, f_1905_, f_1906_,
		       0);
	else {
	    int i_1924_ = (i_1922_ & 0xffff) << 16 | i_1923_ & 0xffff;
	    if (i_1924_ != ((Class155_Backup) this).anInt1734) {
		((Class155_Backup) this).anIntArray1725
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15389(i_1922_, i_1923_);
		if (((Class155_Backup) this).anIntArray1725 == null) {
		    ((Class155_Backup) this).anInt1734 = -1;
		    ((Class155_Backup) this).anInt1723 = 255 - (i >> 24 & 0xff);
		    ((Class155_Backup) this).anInt1747 = 0;
		    int i_1925_ = (Class474.anIntArray6382
				   [(Class241_Sub42.method16451
				     (((Class155_Backup) this).aClass103_Sub2_1743
					  .method15368(i_1922_),
				      -291572925)) & 0xffff]);
		    int i_1926_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_1925_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_1925_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_1925_ & 0xff) >> 8);
		    method3385(true, bool_1897_, bool_1898_, f, f_1899_,
			       f_1900_, f_1901_, f_1902_, f_1903_, f_1904_,
			       f_1905_, f_1906_,
			       Class54.method1306(i_1926_, i_1918_, f_1919_,
						  1372221625),
			       Class54.method1306(i_1926_, i_1918_, f_1920_,
						  1372221625),
			       Class54.method1306(i_1926_, i_1918_, f_1921_,
						  1372221625));
		    return;
		}
		((Class155_Backup) this).anInt1734 = i_1924_;
		((Class155_Backup) this).anInt1752
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15365(i_1922_);
		((Class155_Backup) this).anInt1744 = ((Class155_Backup) this).anInt1752 - 1;
		((Class155_Backup) this).aClass529_1746
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15366(i_1922_);
		((Class155_Backup) this).aBool1741
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15396(i_1922_);
		((Class155_Backup) this).anInt1747
		    = ((Class155_Backup) this).aClass103_Sub2_1743
			  .method15367(i_1922_) & 0xff;
	    }
	    ((Class155_Backup) this).anInt1740 = i_1918_;
	    if (!(f <= f_1899_) || !(f <= f_1900_)) {
		if (f_1899_ <= f_1900_) {
		    float f_1927_ = f_1901_;
		    f_1901_ = f_1902_;
		    f_1902_ = f_1927_;
		    f_1927_ = f;
		    f = f_1899_;
		    f_1899_ = f_1927_;
		    f_1927_ = f_1904_;
		    f_1904_ = f_1905_;
		    f_1905_ = f_1927_;
		    f_1927_ = f_1910_;
		    f_1910_ = f_1911_;
		    f_1911_ = f_1927_;
		    f_1927_ = f_1913_;
		    f_1913_ = f_1914_;
		    f_1914_ = f_1927_;
		    f_1927_ = f_1907_;
		    f_1907_ = f_1908_;
		    f_1908_ = f_1927_;
		    f_1927_ = f_1919_;
		    f_1919_ = f_1920_;
		    f_1920_ = f_1927_;
		    int i_1928_ = i;
		    i = i_1916_;
		    i_1916_ = i_1928_;
		} else {
		    float f_1929_ = f_1901_;
		    f_1901_ = f_1903_;
		    f_1903_ = f_1929_;
		    f_1929_ = f;
		    f = f_1900_;
		    f_1900_ = f_1929_;
		    f_1929_ = f_1904_;
		    f_1904_ = f_1906_;
		    f_1906_ = f_1929_;
		    f_1929_ = f_1910_;
		    f_1910_ = f_1912_;
		    f_1912_ = f_1929_;
		    f_1929_ = f_1913_;
		    f_1913_ = f_1915_;
		    f_1915_ = f_1929_;
		    f_1929_ = f_1907_;
		    f_1907_ = f_1909_;
		    f_1909_ = f_1929_;
		    f_1929_ = f_1919_;
		    f_1919_ = f_1921_;
		    f_1921_ = f_1929_;
		    int i_1930_ = i;
		    i = i_1917_;
		    i_1917_ = i_1930_;
		}
	    }
	    f_1910_ /= f_1907_;
	    f_1911_ /= f_1908_;
	    f_1912_ /= f_1909_;
	    f_1913_ /= f_1907_;
	    f_1914_ /= f_1908_;
	    f_1915_ /= f_1909_;
	    f_1904_ = 1.0F / f_1904_;
	    f_1905_ = 1.0F / f_1905_;
	    f_1906_ = 1.0F / f_1906_;
	    f_1907_ = 1.0F / f_1907_;
	    f_1908_ = 1.0F / f_1908_;
	    f_1909_ = 1.0F / f_1909_;
	    float f_1931_ = (float) (i >> 24 & 0xff);
	    float f_1932_ = (float) (i_1916_ >> 24 & 0xff);
	    float f_1933_ = (float) (i_1917_ >> 24 & 0xff);
	    float f_1934_ = (float) (i >> 16 & 0xff);
	    float f_1935_ = (float) (i_1916_ >> 16 & 0xff);
	    float f_1936_ = (float) (i_1917_ >> 16 & 0xff);
	    float f_1937_ = (float) (i >> 8 & 0xff);
	    float f_1938_ = (float) (i_1916_ >> 8 & 0xff);
	    float f_1939_ = (float) (i_1917_ >> 8 & 0xff);
	    float f_1940_ = (float) (i & 0xff);
	    float f_1941_ = (float) (i_1916_ & 0xff);
	    float f_1942_ = (float) (i_1917_ & 0xff);
	    float f_1943_ = 0.0F;
	    float f_1944_ = 0.0F;
	    float f_1945_ = 0.0F;
	    float f_1946_ = 0.0F;
	    float f_1947_ = 0.0F;
	    float f_1948_ = 0.0F;
	    float f_1949_ = 0.0F;
	    float f_1950_ = 0.0F;
	    float f_1951_ = 0.0F;
	    float f_1952_ = 0.0F;
	    if (f_1899_ != f) {
		float f_1953_ = f_1899_ - f;
		f_1943_ = (f_1902_ - f_1901_) / f_1953_;
		f_1944_ = (f_1905_ - f_1904_) / f_1953_;
		f_1945_ = (f_1908_ - f_1907_) / f_1953_;
		f_1946_ = (f_1911_ - f_1910_) / f_1953_;
		f_1947_ = (f_1914_ - f_1913_) / f_1953_;
		f_1948_ = (f_1920_ - f_1919_) / f_1953_;
		f_1949_ = (f_1932_ - f_1931_) / f_1953_;
		f_1950_ = (f_1935_ - f_1934_) / f_1953_;
		f_1951_ = (f_1938_ - f_1937_) / f_1953_;
		f_1952_ = (f_1941_ - f_1940_) / f_1953_;
	    }
	    float f_1954_ = 0.0F;
	    float f_1955_ = 0.0F;
	    float f_1956_ = 0.0F;
	    float f_1957_ = 0.0F;
	    float f_1958_ = 0.0F;
	    float f_1959_ = 0.0F;
	    float f_1960_ = 0.0F;
	    float f_1961_ = 0.0F;
	    float f_1962_ = 0.0F;
	    float f_1963_ = 0.0F;
	    if (f_1900_ != f_1899_) {
		float f_1964_ = f_1900_ - f_1899_;
		f_1954_ = (f_1903_ - f_1902_) / f_1964_;
		f_1955_ = (f_1906_ - f_1905_) / f_1964_;
		f_1956_ = (f_1909_ - f_1908_) / f_1964_;
		f_1957_ = (f_1912_ - f_1911_) / f_1964_;
		f_1958_ = (f_1915_ - f_1914_) / f_1964_;
		f_1959_ = (f_1921_ - f_1920_) / f_1964_;
		f_1960_ = (f_1933_ - f_1932_) / f_1964_;
		f_1961_ = (f_1936_ - f_1935_) / f_1964_;
		f_1962_ = (f_1939_ - f_1938_) / f_1964_;
		f_1963_ = (f_1942_ - f_1941_) / f_1964_;
	    }
	    float f_1965_ = 0.0F;
	    float f_1966_ = 0.0F;
	    float f_1967_ = 0.0F;
	    float f_1968_ = 0.0F;
	    float f_1969_ = 0.0F;
	    float f_1970_ = 0.0F;
	    float f_1971_ = 0.0F;
	    float f_1972_ = 0.0F;
	    float f_1973_ = 0.0F;
	    float f_1974_ = 0.0F;
	    if (f != f_1900_) {
		float f_1975_ = f - f_1900_;
		f_1965_ = (f_1901_ - f_1903_) / f_1975_;
		f_1966_ = (f_1904_ - f_1906_) / f_1975_;
		f_1967_ = (f_1907_ - f_1909_) / f_1975_;
		f_1968_ = (f_1910_ - f_1912_) / f_1975_;
		f_1969_ = (f_1913_ - f_1915_) / f_1975_;
		f_1970_ = (f_1919_ - f_1921_) / f_1975_;
		f_1971_ = (f_1931_ - f_1933_) / f_1975_;
		f_1972_ = (f_1934_ - f_1936_) / f_1975_;
		f_1973_ = (f_1937_ - f_1939_) / f_1975_;
		f_1974_ = (f_1940_ - f_1942_) / f_1975_;
	    }
	    if (!(f >= (float) ((Class155_Backup) this).anInt1726)) {
		if (f_1899_ > (float) ((Class155_Backup) this).anInt1726)
		    f_1899_ = (float) ((Class155_Backup) this).anInt1726;
		if (f_1900_ > (float) ((Class155_Backup) this).anInt1726)
		    f_1900_ = (float) ((Class155_Backup) this).anInt1726;
		if (f_1899_ < f_1900_) {
		    f_1903_ = f_1901_;
		    f_1906_ = f_1904_;
		    f_1909_ = f_1907_;
		    f_1912_ = f_1910_;
		    f_1915_ = f_1913_;
		    f_1921_ = f_1919_;
		    f_1933_ = f_1931_;
		    f_1936_ = f_1934_;
		    f_1939_ = f_1937_;
		    f_1942_ = f_1940_;
		    if (f < 0.0F) {
			f_1901_ -= f_1943_ * f;
			f_1903_ -= f_1965_ * f;
			f_1904_ -= f_1944_ * f;
			f_1906_ -= f_1966_ * f;
			f_1907_ -= f_1945_ * f;
			f_1909_ -= f_1967_ * f;
			f_1910_ -= f_1946_ * f;
			f_1912_ -= f_1968_ * f;
			f_1913_ -= f_1947_ * f;
			f_1915_ -= f_1969_ * f;
			f_1919_ -= f_1948_ * f;
			f_1921_ -= f_1970_ * f;
			f_1931_ -= f_1949_ * f;
			f_1933_ -= f_1971_ * f;
			f_1934_ -= f_1949_ * f;
			f_1936_ -= f_1971_ * f;
			f_1937_ -= f_1949_ * f;
			f_1939_ -= f_1971_ * f;
			f_1940_ -= f_1949_ * f;
			f_1942_ -= f_1971_ * f;
			f = 0.0F;
		    }
		    if (f_1899_ < 0.0F) {
			f_1902_ -= f_1954_ * f_1899_;
			f_1905_ -= f_1955_ * f_1899_;
			f_1908_ -= f_1956_ * f_1899_;
			f_1911_ -= f_1957_ * f_1899_;
			f_1914_ -= f_1958_ * f_1899_;
			f_1920_ -= f_1959_ * f_1899_;
			f_1932_ -= f_1960_ * f_1899_;
			f_1935_ -= f_1961_ * f_1899_;
			f_1938_ -= f_1962_ * f_1899_;
			f_1941_ -= f_1963_ * f_1899_;
			f_1899_ = 0.0F;
		    }
		    if (f != f_1899_ && f_1965_ < f_1943_
			|| f == f_1899_ && f_1965_ > f_1954_) {
			f += 0.5F;
			f_1899_ += 0.5F;
			f_1900_ = (float) (int) (f_1900_ + 0.5F) - f_1899_;
			f_1899_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_1899_ >= 0.0F) {
			    method3353(bool_1897_, bool_1898_,
				       ((Class155_Backup) this).anIntArray1751,
				       ((Class155_Backup) this).anIntArray1725,
				       (int) f, (int) f_1903_, (int) f_1901_,
				       f_1906_, f_1904_, f_1909_, f_1907_,
				       f_1912_, f_1910_, f_1915_, f_1913_,
				       f_1921_, f_1919_, f_1933_, f_1931_,
				       f_1936_, f_1934_, f_1939_, f_1937_,
				       f_1942_, f_1940_);
			    f_1901_ += f_1943_;
			    f_1903_ += f_1965_;
			    f_1904_ += f_1944_;
			    f_1906_ += f_1966_;
			    f_1907_ += f_1945_;
			    f_1909_ += f_1967_;
			    f_1910_ += f_1946_;
			    f_1912_ += f_1968_;
			    f_1913_ += f_1947_;
			    f_1915_ += f_1969_;
			    f_1919_ += f_1948_;
			    f_1921_ += f_1970_;
			    f_1931_ += f_1949_;
			    f_1933_ += f_1971_;
			    f_1934_ += f_1950_;
			    f_1936_ += f_1972_;
			    f_1937_ += f_1951_;
			    f_1939_ += f_1973_;
			    f_1940_ += f_1952_;
			    f_1942_ += f_1974_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_1900_ >= 0.0F) {
			    method3353(bool_1897_, bool_1898_,
				       ((Class155_Backup) this).anIntArray1751,
				       ((Class155_Backup) this).anIntArray1725,
				       (int) f, (int) f_1903_, (int) f_1902_,
				       f_1906_, f_1905_, f_1909_, f_1908_,
				       f_1912_, f_1911_, f_1915_, f_1914_,
				       f_1921_, f_1920_, f_1933_, f_1932_,
				       f_1936_, f_1935_, f_1939_, f_1938_,
				       f_1942_, f_1941_);
			    f_1902_ += f_1954_;
			    f_1903_ += f_1965_;
			    f_1905_ += f_1955_;
			    f_1906_ += f_1966_;
			    f_1908_ += f_1956_;
			    f_1909_ += f_1967_;
			    f_1911_ += f_1957_;
			    f_1912_ += f_1968_;
			    f_1914_ += f_1958_;
			    f_1915_ += f_1969_;
			    f_1920_ += f_1959_;
			    f_1921_ += f_1970_;
			    f_1932_ += f_1960_;
			    f_1933_ += f_1971_;
			    f_1935_ += f_1961_;
			    f_1936_ += f_1972_;
			    f_1938_ += f_1962_;
			    f_1939_ += f_1973_;
			    f_1941_ += f_1963_;
			    f_1942_ += f_1974_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    } else {
			f += 0.5F;
			f_1899_ += 0.5F;
			f_1900_ = (float) (int) (f_1900_ + 0.5F) - f_1899_;
			f_1899_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_1899_ >= 0.0F) {
			    method3353(bool_1897_, bool_1898_,
				       ((Class155_Backup) this).anIntArray1751,
				       ((Class155_Backup) this).anIntArray1725,
				       (int) f, (int) f_1901_, (int) f_1903_,
				       f_1904_, f_1906_, f_1907_, f_1909_,
				       f_1910_, f_1912_, f_1913_, f_1915_,
				       f_1919_, f_1921_, f_1931_, f_1933_,
				       f_1934_, f_1936_, f_1937_, f_1939_,
				       f_1940_, f_1942_);
			    f_1901_ += f_1943_;
			    f_1903_ += f_1965_;
			    f_1904_ += f_1944_;
			    f_1906_ += f_1966_;
			    f_1907_ += f_1945_;
			    f_1909_ += f_1967_;
			    f_1910_ += f_1946_;
			    f_1912_ += f_1968_;
			    f_1913_ += f_1947_;
			    f_1915_ += f_1969_;
			    f_1919_ += f_1948_;
			    f_1921_ += f_1970_;
			    f_1931_ += f_1949_;
			    f_1933_ += f_1971_;
			    f_1934_ += f_1950_;
			    f_1936_ += f_1972_;
			    f_1937_ += f_1951_;
			    f_1939_ += f_1973_;
			    f_1940_ += f_1952_;
			    f_1942_ += f_1974_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_1900_ >= 0.0F) {
			    method3353(bool_1897_, bool_1898_,
				       ((Class155_Backup) this).anIntArray1751,
				       ((Class155_Backup) this).anIntArray1725,
				       (int) f, (int) f_1902_, (int) f_1903_,
				       f_1905_, f_1906_, f_1908_, f_1909_,
				       f_1911_, f_1912_, f_1914_, f_1915_,
				       f_1920_, f_1921_, f_1932_, f_1933_,
				       f_1935_, f_1936_, f_1938_, f_1939_,
				       f_1941_, f_1942_);
			    f_1902_ += f_1954_;
			    f_1903_ += f_1965_;
			    f_1905_ += f_1955_;
			    f_1906_ += f_1966_;
			    f_1908_ += f_1956_;
			    f_1909_ += f_1967_;
			    f_1911_ += f_1957_;
			    f_1912_ += f_1968_;
			    f_1914_ += f_1958_;
			    f_1915_ += f_1969_;
			    f_1920_ += f_1959_;
			    f_1921_ += f_1970_;
			    f_1932_ += f_1960_;
			    f_1933_ += f_1971_;
			    f_1935_ += f_1961_;
			    f_1936_ += f_1972_;
			    f_1938_ += f_1962_;
			    f_1939_ += f_1973_;
			    f_1941_ += f_1963_;
			    f_1942_ += f_1974_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    }
		} else {
		    f_1902_ = f_1901_;
		    f_1905_ = f_1904_;
		    f_1908_ = f_1907_;
		    f_1911_ = f_1910_;
		    f_1914_ = f_1913_;
		    f_1920_ = f_1919_;
		    f_1932_ = f_1931_;
		    f_1935_ = f_1934_;
		    f_1938_ = f_1937_;
		    f_1941_ = f_1940_;
		    if (f < 0.0F) {
			f_1901_ -= f_1943_ * f;
			f_1902_ -= f_1965_ * f;
			f_1904_ -= f_1944_ * f;
			f_1905_ -= f_1966_ * f;
			f_1907_ -= f_1945_ * f;
			f_1908_ -= f_1967_ * f;
			f_1910_ -= f_1946_ * f;
			f_1911_ -= f_1968_ * f;
			f_1913_ -= f_1947_ * f;
			f_1914_ -= f_1969_ * f;
			f_1919_ -= f_1948_ * f;
			f_1920_ -= f_1970_ * f;
			f_1931_ -= f_1949_ * f;
			f_1932_ -= f_1971_ * f;
			f_1934_ -= f_1949_ * f;
			f_1935_ -= f_1971_ * f;
			f_1937_ -= f_1949_ * f;
			f_1938_ -= f_1971_ * f;
			f_1940_ -= f_1949_ * f;
			f_1941_ -= f_1971_ * f;
			f = 0.0F;
		    }
		    if (f_1900_ < 0.0F) {
			f_1903_ -= f_1954_ * f_1900_;
			f_1906_ -= f_1955_ * f_1900_;
			f_1909_ -= f_1956_ * f_1900_;
			f_1912_ -= f_1957_ * f_1900_;
			f_1915_ -= f_1958_ * f_1900_;
			f_1921_ -= f_1959_ * f_1900_;
			f_1933_ -= f_1960_ * f_1900_;
			f_1936_ -= f_1961_ * f_1900_;
			f_1939_ -= f_1962_ * f_1900_;
			f_1942_ -= f_1963_ * f_1900_;
			f_1900_ = 0.0F;
		    }
		    if (f != f_1900_ && f_1965_ < f_1943_
			|| f == f_1900_ && f_1954_ > f_1943_) {
			f += 0.5F;
			f_1900_ += 0.5F;
			f_1899_ = (float) (int) (f_1899_ + 0.5F) - f_1900_;
			f_1900_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_1900_ >= 0.0F) {
			    method3353(bool_1897_, bool_1898_,
				       ((Class155_Backup) this).anIntArray1751,
				       ((Class155_Backup) this).anIntArray1725,
				       (int) f, (int) f_1902_, (int) f_1901_,
				       f_1905_, f_1904_, f_1908_, f_1907_,
				       f_1911_, f_1910_, f_1914_, f_1913_,
				       f_1920_, f_1919_, f_1932_, f_1931_,
				       f_1935_, f_1934_, f_1938_, f_1937_,
				       f_1941_, f_1940_);
			    f_1901_ += f_1943_;
			    f_1902_ += f_1965_;
			    f_1904_ += f_1944_;
			    f_1905_ += f_1966_;
			    f_1907_ += f_1945_;
			    f_1908_ += f_1967_;
			    f_1910_ += f_1946_;
			    f_1911_ += f_1968_;
			    f_1913_ += f_1947_;
			    f_1914_ += f_1969_;
			    f_1919_ += f_1948_;
			    f_1920_ += f_1970_;
			    f_1931_ += f_1949_;
			    f_1932_ += f_1971_;
			    f_1934_ += f_1950_;
			    f_1935_ += f_1972_;
			    f_1937_ += f_1951_;
			    f_1938_ += f_1973_;
			    f_1940_ += f_1952_;
			    f_1941_ += f_1974_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_1899_ >= 0.0F) {
			    method3353(bool_1897_, bool_1898_,
				       ((Class155_Backup) this).anIntArray1751,
				       ((Class155_Backup) this).anIntArray1725,
				       (int) f, (int) f_1903_, (int) f_1901_,
				       f_1906_, f_1904_, f_1909_, f_1907_,
				       f_1912_, f_1910_, f_1915_, f_1913_,
				       f_1921_, f_1919_, f_1933_, f_1931_,
				       f_1936_, f_1934_, f_1939_, f_1937_,
				       f_1942_, f_1940_);
			    f_1903_ += f_1954_;
			    f_1901_ += f_1943_;
			    f_1906_ += f_1955_;
			    f_1904_ += f_1944_;
			    f_1909_ += f_1956_;
			    f_1907_ += f_1945_;
			    f_1912_ += f_1957_;
			    f_1910_ += f_1946_;
			    f_1915_ += f_1958_;
			    f_1913_ += f_1947_;
			    f_1921_ += f_1959_;
			    f_1919_ += f_1948_;
			    f_1933_ += f_1960_;
			    f_1931_ += f_1949_;
			    f_1936_ += f_1961_;
			    f_1934_ += f_1950_;
			    f_1939_ += f_1962_;
			    f_1937_ += f_1951_;
			    f_1942_ += f_1963_;
			    f_1940_ += f_1952_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    } else {
			f += 0.5F;
			f_1900_ += 0.5F;
			f_1899_ = (float) (int) (f_1899_ + 0.5F) - f_1900_;
			f_1900_ -= f;
			f = (float) ((Class155_Backup) this).anIntArray1730[(int) f];
			while (--f_1900_ >= 0.0F) {
			    method3353(bool_1897_, bool_1898_,
				       ((Class155_Backup) this).anIntArray1751,
				       ((Class155_Backup) this).anIntArray1725,
				       (int) f, (int) f_1901_, (int) f_1902_,
				       f_1904_, f_1905_, f_1907_, f_1908_,
				       f_1910_, f_1911_, f_1913_, f_1914_,
				       f_1919_, f_1920_, f_1931_, f_1932_,
				       f_1934_, f_1935_, f_1937_, f_1938_,
				       f_1940_, f_1941_);
			    f_1902_ += f_1965_;
			    f_1901_ += f_1943_;
			    f_1905_ += f_1966_;
			    f_1904_ += f_1944_;
			    f_1908_ += f_1967_;
			    f_1907_ += f_1945_;
			    f_1911_ += f_1968_;
			    f_1910_ += f_1946_;
			    f_1914_ += f_1969_;
			    f_1913_ += f_1947_;
			    f_1920_ += f_1970_;
			    f_1919_ += f_1948_;
			    f_1932_ += f_1971_;
			    f_1931_ += f_1949_;
			    f_1935_ += f_1972_;
			    f_1934_ += f_1950_;
			    f_1938_ += f_1973_;
			    f_1937_ += f_1951_;
			    f_1941_ += f_1974_;
			    f_1940_ += f_1952_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
			while (--f_1899_ >= 0.0F) {
			    method3353(bool_1897_, bool_1898_,
				       ((Class155_Backup) this).anIntArray1751,
				       ((Class155_Backup) this).anIntArray1725,
				       (int) f, (int) f_1901_, (int) f_1903_,
				       f_1904_, f_1906_, f_1907_, f_1909_,
				       f_1910_, f_1912_, f_1913_, f_1915_,
				       f_1919_, f_1921_, f_1931_, f_1933_,
				       f_1934_, f_1936_, f_1937_, f_1939_,
				       f_1940_, f_1942_);
			    f_1901_ += f_1943_;
			    f_1903_ += f_1954_;
			    f_1904_ += f_1944_;
			    f_1906_ += f_1955_;
			    f_1907_ += f_1945_;
			    f_1909_ += f_1956_;
			    f_1910_ += f_1946_;
			    f_1912_ += f_1957_;
			    f_1913_ += f_1947_;
			    f_1915_ += f_1958_;
			    f_1919_ += f_1948_;
			    f_1921_ += f_1959_;
			    f_1931_ += f_1949_;
			    f_1933_ += f_1960_;
			    f_1934_ += f_1950_;
			    f_1936_ += f_1961_;
			    f_1937_ += f_1951_;
			    f_1939_ += f_1962_;
			    f_1940_ += f_1952_;
			    f_1942_ += f_1963_;
			    f += (float) ((Class155_Backup) this).anInt1737;
			}
		    }
		}
	    }
	}
    }
    
    final void method3385(boolean bool, boolean bool_1976_, boolean bool_1977_,
			  float f, float f_1978_, float f_1979_, float f_1980_,
			  float f_1981_, float f_1982_, float f_1983_,
			  float f_1984_, float f_1985_, int i, int i_1986_,
			  int i_1987_) {
	if (!bool)
	    method3377(false, bool_1976_, bool_1977_, f, f_1978_, f_1979_,
		       f_1980_, f_1981_, f_1982_, f_1983_, f_1984_, f_1985_,
		       0);
	else if (((Class155_Backup) this).aBool1724) {
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517((int) f_1980_,
							     (int) f,
							     (int) f_1981_,
							     (int) f_1978_,
							     ~0xffffff | i,
							     223909001);
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517((int) f_1981_,
							     (int) f_1978_,
							     (int) f_1982_,
							     (int) f_1979_,
							     ~0xffffff | i,
							     223909001);
	    ((Class155_Backup) this).aClass103_Sub2_1743.method2517((int) f_1982_,
							     (int) f_1979_,
							     (int) f_1980_,
							     (int) f,
							     ~0xffffff | i,
							     223909001);
	} else {
	    float f_1988_ = f_1981_ - f_1980_;
	    float f_1989_ = f_1978_ - f;
	    float f_1990_ = f_1982_ - f_1980_;
	    float f_1991_ = f_1979_ - f;
	    float f_1992_ = f_1984_ - f_1983_;
	    float f_1993_ = f_1985_ - f_1983_;
	    float f_1994_ = (float) ((i_1986_ & 0xff0000) - (i & 0xff0000));
	    float f_1995_ = (float) ((i_1987_ & 0xff0000) - (i & 0xff0000));
	    float f_1996_ = (float) ((i_1986_ & 0xff00) - (i & 0xff00));
	    float f_1997_ = (float) ((i_1987_ & 0xff00) - (i & 0xff00));
	    float f_1998_ = (float) ((i_1986_ & 0xff) - (i & 0xff));
	    float f_1999_ = (float) ((i_1987_ & 0xff) - (i & 0xff));
	    float f_2000_;
	    if (f_1979_ != f_1978_)
		f_2000_ = (f_1982_ - f_1981_) / (f_1979_ - f_1978_);
	    else
		f_2000_ = 0.0F;
	    float f_2001_;
	    if (f_1978_ != f)
		f_2001_ = f_1988_ / f_1989_;
	    else
		f_2001_ = 0.0F;
	    float f_2002_;
	    if (f_1979_ != f)
		f_2002_ = f_1990_ / f_1991_;
	    else
		f_2002_ = 0.0F;
	    float f_2003_ = f_1988_ * f_1991_ - f_1990_ * f_1989_;
	    if (f_2003_ != 0.0F) {
		float f_2004_
		    = (f_1992_ * f_1991_ - f_1993_ * f_1989_) / f_2003_;
		float f_2005_
		    = (f_1993_ * f_1988_ - f_1992_ * f_1990_) / f_2003_;
		float f_2006_
		    = (f_1994_ * f_1991_ - f_1995_ * f_1989_) / f_2003_;
		float f_2007_
		    = (f_1995_ * f_1988_ - f_1994_ * f_1990_) / f_2003_;
		float f_2008_
		    = (f_1996_ * f_1991_ - f_1997_ * f_1989_) / f_2003_;
		float f_2009_
		    = (f_1997_ * f_1988_ - f_1996_ * f_1990_) / f_2003_;
		float f_2010_
		    = (f_1998_ * f_1991_ - f_1999_ * f_1989_) / f_2003_;
		float f_2011_
		    = (f_1999_ * f_1988_ - f_1998_ * f_1990_) / f_2003_;
		if (f <= f_1978_ && f <= f_1979_) {
		    if (!(f >= (float) ((Class155_Backup) this).anInt1726)) {
			if (f_1978_ > (float) ((Class155_Backup) this).anInt1726)
			    f_1978_ = (float) ((Class155_Backup) this).anInt1726;
			if (f_1979_ > (float) ((Class155_Backup) this).anInt1726)
			    f_1979_ = (float) ((Class155_Backup) this).anInt1726;
			f_1983_ = f_1983_ - f_2004_ * f_1980_ + f_2004_;
			float f_2012_ = ((float) (i & 0xff0000)
					 - f_2006_ * f_1980_ + f_2006_);
			float f_2013_ = ((float) (i & 0xff00)
					 - f_2008_ * f_1980_ + f_2008_);
			float f_2014_
			    = (float) (i & 0xff) - f_2010_ * f_1980_ + f_2010_;
			if (f_1978_ < f_1979_) {
			    f_1982_ = f_1980_;
			    if (f < 0.0F) {
				f_1982_ -= f_2002_ * f;
				f_1980_ -= f_2001_ * f;
				f_1983_ -= f_2005_ * f;
				f_2012_ -= f_2007_ * f;
				f_2013_ -= f_2009_ * f;
				f_2014_ -= f_2011_ * f;
				f = 0.0F;
			    }
			    if (f_1978_ < 0.0F) {
				f_1981_ -= f_2000_ * f_1978_;
				f_1978_ = 0.0F;
			    }
			    if (f != f_1978_ && f_2002_ < f_2001_
				|| f == f_1978_ && f_2002_ > f_2000_) {
				f += 0.5F;
				f_1978_ += 0.5F;
				f_1979_
				    = (float) (int) (f_1979_ + 0.5F) - f_1978_;
				f_1978_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_1978_ >= 0.0F) {
				    method3349(bool_1976_, bool_1977_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_1982_,
					       (int) f_1980_, f_1983_, f_2004_,
					       f_2012_, f_2006_, f_2013_,
					       f_2008_, f_2014_, f_2010_);
				    f_1982_ += f_2002_;
				    f_1980_ += f_2001_;
				    f_1983_ += f_2005_;
				    f_2012_ += f_2007_;
				    f_2013_ += f_2009_;
				    f_2014_ += f_2011_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_1979_ >= 0.0F) {
				    method3349(bool_1976_, bool_1977_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_1982_,
					       (int) f_1981_, f_1983_, f_2004_,
					       f_2012_, f_2006_, f_2013_,
					       f_2008_, f_2014_, f_2010_);
				    f_1982_ += f_2002_;
				    f_1981_ += f_2000_;
				    f_1983_ += f_2005_;
				    f_2012_ += f_2007_;
				    f_2013_ += f_2009_;
				    f_2014_ += f_2011_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f += 0.5F;
				f_1978_ += 0.5F;
				f_1979_
				    = (float) (int) (f_1979_ + 0.5F) - f_1978_;
				f_1978_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_1978_ >= 0.0F) {
				    method3349(bool_1976_, bool_1977_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_1980_,
					       (int) f_1982_, f_1983_, f_2004_,
					       f_2012_, f_2006_, f_2013_,
					       f_2008_, f_2014_, f_2010_);
				    f_1982_ += f_2002_;
				    f_1980_ += f_2001_;
				    f_1983_ += f_2005_;
				    f_2012_ += f_2007_;
				    f_2013_ += f_2009_;
				    f_2014_ += f_2011_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_1979_ >= 0.0F) {
				    method3349(bool_1976_, bool_1977_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_1981_,
					       (int) f_1982_, f_1983_, f_2004_,
					       f_2012_, f_2006_, f_2013_,
					       f_2008_, f_2014_, f_2010_);
				    f_1982_ += f_2002_;
				    f_1981_ += f_2000_;
				    f_1983_ += f_2005_;
				    f_2012_ += f_2007_;
				    f_2013_ += f_2009_;
				    f_2014_ += f_2011_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			} else {
			    f_1981_ = f_1980_;
			    if (f < 0.0F) {
				f_1981_ -= f_2002_ * f;
				f_1980_ -= f_2001_ * f;
				f_1983_ -= f_2005_ * f;
				f_2012_ -= f_2007_ * f;
				f_2013_ -= f_2009_ * f;
				f_2014_ -= f_2011_ * f;
				f = 0.0F;
			    }
			    if (f_1979_ < 0.0F) {
				f_1982_ -= f_2000_ * f_1979_;
				f_1979_ = 0.0F;
			    }
			    if (f != f_1979_ && f_2002_ < f_2001_
				|| f == f_1979_ && f_2000_ > f_2001_) {
				f += 0.5F;
				f_1979_ += 0.5F;
				f_1978_
				    = (float) (int) (f_1978_ + 0.5F) - f_1979_;
				f_1979_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_1979_ >= 0.0F) {
				    method3349(bool_1976_, bool_1977_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_1981_,
					       (int) f_1980_, f_1983_, f_2004_,
					       f_2012_, f_2006_, f_2013_,
					       f_2008_, f_2014_, f_2010_);
				    f_1981_ += f_2002_;
				    f_1980_ += f_2001_;
				    f_1983_ += f_2005_;
				    f_2012_ += f_2007_;
				    f_2013_ += f_2009_;
				    f_2014_ += f_2011_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_1978_ >= 0.0F) {
				    method3349(bool_1976_, bool_1977_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_1982_,
					       (int) f_1980_, f_1983_, f_2004_,
					       f_2012_, f_2006_, f_2013_,
					       f_2008_, f_2014_, f_2010_);
				    f_1982_ += f_2000_;
				    f_1980_ += f_2001_;
				    f_1983_ += f_2005_;
				    f_2012_ += f_2007_;
				    f_2013_ += f_2009_;
				    f_2014_ += f_2011_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f += 0.5F;
				f_1979_ += 0.5F;
				f_1978_
				    = (float) (int) (f_1978_ + 0.5F) - f_1979_;
				f_1979_ -= f;
				f = (float) (((Class155_Backup) this).anIntArray1730
					     [(int) f]);
				while (--f_1979_ >= 0.0F) {
				    method3349(bool_1976_, bool_1977_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_1980_,
					       (int) f_1981_, f_1983_, f_2004_,
					       f_2012_, f_2006_, f_2013_,
					       f_2008_, f_2014_, f_2010_);
				    f_1981_ += f_2002_;
				    f_1980_ += f_2001_;
				    f_1983_ += f_2005_;
				    f_2012_ += f_2007_;
				    f_2013_ += f_2009_;
				    f_2014_ += f_2011_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_1978_ >= 0.0F) {
				    method3349(bool_1976_, bool_1977_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f, 0, 0, (int) f_1980_,
					       (int) f_1982_, f_1983_, f_2004_,
					       f_2012_, f_2006_, f_2013_,
					       f_2008_, f_2014_, f_2010_);
				    f_1982_ += f_2000_;
				    f_1980_ += f_2001_;
				    f_1983_ += f_2005_;
				    f_2012_ += f_2007_;
				    f_2013_ += f_2009_;
				    f_2014_ += f_2011_;
				    f += (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			}
		    }
		} else if (f_1978_ <= f_1979_) {
		    if (!(f_1978_ >= (float) ((Class155_Backup) this).anInt1726)) {
			if (f_1979_ > (float) ((Class155_Backup) this).anInt1726)
			    f_1979_ = (float) ((Class155_Backup) this).anInt1726;
			if (f > (float) ((Class155_Backup) this).anInt1726)
			    f = (float) ((Class155_Backup) this).anInt1726;
			f_1984_ = f_1984_ - f_2004_ * f_1981_ + f_2004_;
			float f_2015_ = ((float) (i_1986_ & 0xff0000)
					 - f_2006_ * f_1981_ + f_2006_);
			float f_2016_ = ((float) (i_1986_ & 0xff00)
					 - f_2008_ * f_1981_ + f_2008_);
			float f_2017_ = ((float) (i_1986_ & 0xff)
					 - f_2010_ * f_1981_ + f_2010_);
			if (f_1979_ < f) {
			    f_1980_ = f_1981_;
			    if (f_1978_ < 0.0F) {
				f_1980_ -= f_2001_ * f_1978_;
				f_1981_ -= f_2000_ * f_1978_;
				f_1984_ -= f_2005_ * f_1978_;
				f_2015_ -= f_2007_ * f_1978_;
				f_2016_ -= f_2009_ * f_1978_;
				f_2017_ -= f_2011_ * f_1978_;
				f_1978_ = 0.0F;
			    }
			    if (f_1979_ < 0.0F) {
				f_1982_ -= f_2002_ * f_1979_;
				f_1979_ = 0.0F;
			    }
			    if (f_1978_ != f_1979_ && f_2001_ < f_2000_
				|| f_1978_ == f_1979_ && f_2001_ > f_2002_) {
				f_1978_ += 0.5F;
				f_1979_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_1979_;
				f_1979_ -= f_1978_;
				f_1978_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1978_]);
				while (--f_1979_ >= 0.0F) {
				    method3349(bool_1976_, bool_1977_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1978_, 0, 0,
					       (int) f_1980_, (int) f_1981_,
					       f_1984_, f_2004_, f_2015_,
					       f_2006_, f_2016_, f_2008_,
					       f_2017_, f_2010_);
				    f_1980_ += f_2001_;
				    f_1981_ += f_2000_;
				    f_1984_ += f_2005_;
				    f_2015_ += f_2007_;
				    f_2016_ += f_2009_;
				    f_2017_ += f_2011_;
				    f_1978_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f >= 0.0F) {
				    method3349(bool_1976_, bool_1977_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1978_, 0, 0,
					       (int) f_1980_, (int) f_1982_,
					       f_1984_, f_2004_, f_2015_,
					       f_2006_, f_2016_, f_2008_,
					       f_2017_, f_2010_);
				    f_1980_ += f_2001_;
				    f_1982_ += f_2002_;
				    f_1984_ += f_2005_;
				    f_2015_ += f_2007_;
				    f_2016_ += f_2009_;
				    f_2017_ += f_2011_;
				    f_1978_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f_1978_ += 0.5F;
				f_1979_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_1979_;
				f_1979_ -= f_1978_;
				f_1978_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1978_]);
				while (--f_1979_ >= 0.0F) {
				    method3349(bool_1976_, bool_1977_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1978_, 0, 0,
					       (int) f_1981_, (int) f_1980_,
					       f_1984_, f_2004_, f_2015_,
					       f_2006_, f_2016_, f_2008_,
					       f_2017_, f_2010_);
				    f_1980_ += f_2001_;
				    f_1981_ += f_2000_;
				    f_1984_ += f_2005_;
				    f_2015_ += f_2007_;
				    f_2016_ += f_2009_;
				    f_2017_ += f_2011_;
				    f_1978_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f >= 0.0F) {
				    method3349(bool_1976_, bool_1977_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1978_, 0, 0,
					       (int) f_1982_, (int) f_1980_,
					       f_1984_, f_2004_, f_2015_,
					       f_2006_, f_2016_, f_2008_,
					       f_2017_, f_2010_);
				    f_1980_ += f_2001_;
				    f_1982_ += f_2002_;
				    f_1984_ += f_2005_;
				    f_2015_ += f_2007_;
				    f_2016_ += f_2009_;
				    f_2017_ += f_2011_;
				    f_1978_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			} else {
			    f_1982_ = f_1981_;
			    if (f_1978_ < 0.0F) {
				f_1982_ -= f_2001_ * f_1978_;
				f_1981_ -= f_2000_ * f_1978_;
				f_1984_ -= f_2005_ * f_1978_;
				f_2015_ -= f_2007_ * f_1978_;
				f_2016_ -= f_2009_ * f_1978_;
				f_2017_ -= f_2011_ * f_1978_;
				f_1978_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_1980_ -= f_2002_ * f;
				f = 0.0F;
			    }
			    if (f_2001_ < f_2000_) {
				f_1978_ += 0.5F;
				f += 0.5F;
				f_1979_ = (float) (int) (f_1979_ + 0.5F) - f;
				f -= f_1978_;
				f_1978_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1978_]);
				while (--f >= 0.0F) {
				    method3349(bool_1976_, bool_1977_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1978_, 0, 0,
					       (int) f_1982_, (int) f_1981_,
					       f_1984_, f_2004_, f_2015_,
					       f_2006_, f_2016_, f_2008_,
					       f_2017_, f_2010_);
				    f_1982_ += f_2001_;
				    f_1981_ += f_2000_;
				    f_1984_ += f_2005_;
				    f_2015_ += f_2007_;
				    f_2016_ += f_2009_;
				    f_2017_ += f_2011_;
				    f_1978_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_1979_ >= 0.0F) {
				    method3349(bool_1976_, bool_1977_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1978_, 0, 0,
					       (int) f_1980_, (int) f_1981_,
					       f_1984_, f_2004_, f_2015_,
					       f_2006_, f_2016_, f_2008_,
					       f_2017_, f_2010_);
				    f_1980_ += f_2002_;
				    f_1981_ += f_2000_;
				    f_1984_ += f_2005_;
				    f_2015_ += f_2007_;
				    f_2016_ += f_2009_;
				    f_2017_ += f_2011_;
				    f_1978_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    } else {
				f_1978_ += 0.5F;
				f += 0.5F;
				f_1979_ = (float) (int) (f_1979_ + 0.5F) - f;
				f -= f_1978_;
				f_1978_
				    = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1978_]);
				while (--f >= 0.0F) {
				    method3349(bool_1976_, bool_1977_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1978_, 0, 0,
					       (int) f_1981_, (int) f_1982_,
					       f_1984_, f_2004_, f_2015_,
					       f_2006_, f_2016_, f_2008_,
					       f_2017_, f_2010_);
				    f_1982_ += f_2001_;
				    f_1981_ += f_2000_;
				    f_1984_ += f_2005_;
				    f_2015_ += f_2007_;
				    f_2016_ += f_2009_;
				    f_2017_ += f_2011_;
				    f_1978_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
				while (--f_1979_ >= 0.0F) {
				    method3349(bool_1976_, bool_1977_,
					       (((Class155_Backup) this)
						.anIntArray1751),
					       (int) f_1978_, 0, 0,
					       (int) f_1981_, (int) f_1980_,
					       f_1984_, f_2004_, f_2015_,
					       f_2006_, f_2016_, f_2008_,
					       f_2017_, f_2010_);
				    f_1980_ += f_2002_;
				    f_1981_ += f_2000_;
				    f_1984_ += f_2005_;
				    f_2015_ += f_2007_;
				    f_2016_ += f_2009_;
				    f_2017_ += f_2011_;
				    f_1978_
					+= (float) ((Class155_Backup) this).anInt1737;
				}
			    }
			}
		    }
		} else if (!(f_1979_ >= (float) ((Class155_Backup) this).anInt1726)) {
		    if (f > (float) ((Class155_Backup) this).anInt1726)
			f = (float) ((Class155_Backup) this).anInt1726;
		    if (f_1978_ > (float) ((Class155_Backup) this).anInt1726)
			f_1978_ = (float) ((Class155_Backup) this).anInt1726;
		    f_1985_ = f_1985_ - f_2004_ * f_1982_ + f_2004_;
		    float f_2018_ = ((float) (i_1987_ & 0xff0000)
				     - f_2006_ * f_1982_ + f_2006_);
		    float f_2019_ = ((float) (i_1987_ & 0xff00)
				     - f_2008_ * f_1982_ + f_2008_);
		    float f_2020_ = ((float) (i_1987_ & 0xff)
				     - f_2010_ * f_1982_ + f_2010_);
		    if (f < f_1978_) {
			f_1981_ = f_1982_;
			if (f_1979_ < 0.0F) {
			    f_1981_ -= f_2000_ * f_1979_;
			    f_1982_ -= f_2002_ * f_1979_;
			    f_1985_ -= f_2005_ * f_1979_;
			    f_2018_ -= f_2007_ * f_1979_;
			    f_2019_ -= f_2009_ * f_1979_;
			    f_2020_ -= f_2011_ * f_1979_;
			    f_1979_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_1980_ -= f_2001_ * f;
			    f = 0.0F;
			}
			if (f_2000_ < f_2002_) {
			    f_1979_ += 0.5F;
			    f += 0.5F;
			    f_1978_ = (float) (int) (f_1978_ + 0.5F) - f;
			    f -= f_1979_;
			    f_1979_ = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1979_]);
			    while (--f >= 0.0F) {
				method3349(bool_1976_, bool_1977_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1979_, 0, 0, (int) f_1981_,
					   (int) f_1982_, f_1985_, f_2004_,
					   f_2018_, f_2006_, f_2019_, f_2008_,
					   f_2020_, f_2010_);
				f_1981_ += f_2000_;
				f_1982_ += f_2002_;
				f_1985_ += f_2005_;
				f_2018_ += f_2007_;
				f_2019_ += f_2009_;
				f_2020_ += f_2011_;
				f_1979_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f_1978_ >= 0.0F) {
				method3349(bool_1976_, bool_1977_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1979_, 0, 0, (int) f_1981_,
					   (int) f_1980_, f_1985_, f_2004_,
					   f_2018_, f_2006_, f_2019_, f_2008_,
					   f_2020_, f_2010_);
				f_1981_ += f_2000_;
				f_1980_ += f_2001_;
				f_1985_ += f_2005_;
				f_2018_ += f_2007_;
				f_2019_ += f_2009_;
				f_2020_ += f_2011_;
				f_1979_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			} else {
			    f_1979_ += 0.5F;
			    f += 0.5F;
			    f_1978_ = (float) (int) (f_1978_ + 0.5F) - f;
			    f -= f_1979_;
			    f_1979_ = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1979_]);
			    while (--f >= 0.0F) {
				method3349(bool_1976_, bool_1977_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1979_, 0, 0, (int) f_1982_,
					   (int) f_1981_, f_1985_, f_2004_,
					   f_2018_, f_2006_, f_2019_, f_2008_,
					   f_2020_, f_2010_);
				f_1981_ += f_2000_;
				f_1982_ += f_2002_;
				f_1985_ += f_2005_;
				f_2018_ += f_2007_;
				f_2019_ += f_2009_;
				f_2020_ += f_2011_;
				f_1979_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f_1978_ >= 0.0F) {
				method3349(bool_1976_, bool_1977_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1979_, 0, 0, (int) f_1980_,
					   (int) f_1981_, f_1985_, f_2004_,
					   f_2018_, f_2006_, f_2019_, f_2008_,
					   f_2020_, f_2010_);
				f_1981_ += f_2000_;
				f_1980_ += f_2001_;
				f_1985_ += f_2005_;
				f_2018_ += f_2007_;
				f_2019_ += f_2009_;
				f_2020_ += f_2011_;
				f_1979_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			}
		    } else {
			f_1980_ = f_1982_;
			if (f_1979_ < 0.0F) {
			    f_1980_ -= f_2000_ * f_1979_;
			    f_1982_ -= f_2002_ * f_1979_;
			    f_1985_ -= f_2005_ * f_1979_;
			    f_2018_ -= f_2007_ * f_1979_;
			    f_2019_ -= f_2009_ * f_1979_;
			    f_2020_ -= f_2011_ * f_1979_;
			    f_1979_ = 0.0F;
			}
			if (f_1978_ < 0.0F) {
			    f_1981_ -= f_2001_ * f_1978_;
			    f_1978_ = 0.0F;
			}
			if (f_2000_ < f_2002_) {
			    f_1979_ += 0.5F;
			    f_1978_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_1978_;
			    f_1978_ -= f_1979_;
			    f_1979_ = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1979_]);
			    while (--f_1978_ >= 0.0F) {
				method3349(bool_1976_, bool_1977_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1979_, 0, 0, (int) f_1980_,
					   (int) f_1982_, f_1985_, f_2004_,
					   f_2018_, f_2006_, f_2019_, f_2008_,
					   f_2020_, f_2010_);
				f_1980_ += f_2000_;
				f_1982_ += f_2002_;
				f_1985_ += f_2005_;
				f_2018_ += f_2007_;
				f_2019_ += f_2009_;
				f_2020_ += f_2011_;
				f_1979_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f >= 0.0F) {
				method3349(bool_1976_, bool_1977_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1979_, 0, 0, (int) f_1981_,
					   (int) f_1982_, f_1985_, f_2004_,
					   f_2018_, f_2006_, f_2019_, f_2008_,
					   f_2020_, f_2010_);
				f_1981_ += f_2001_;
				f_1982_ += f_2002_;
				f_1985_ += f_2005_;
				f_2018_ += f_2007_;
				f_2019_ += f_2009_;
				f_2020_ += f_2011_;
				f_1979_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			} else {
			    f_1979_ += 0.5F;
			    f_1978_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_1978_;
			    f_1978_ -= f_1979_;
			    f_1979_ = (float) (((Class155_Backup) this).anIntArray1730
					       [(int) f_1979_]);
			    while (--f_1978_ >= 0.0F) {
				method3349(bool_1976_, bool_1977_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1979_, 0, 0, (int) f_1982_,
					   (int) f_1980_, f_1985_, f_2004_,
					   f_2018_, f_2006_, f_2019_, f_2008_,
					   f_2020_, f_2010_);
				f_1980_ += f_2000_;
				f_1982_ += f_2002_;
				f_1985_ += f_2005_;
				f_2018_ += f_2007_;
				f_2019_ += f_2009_;
				f_2020_ += f_2011_;
				f_1979_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			    while (--f >= 0.0F) {
				method3349(bool_1976_, bool_1977_,
					   ((Class155_Backup) this).anIntArray1751,
					   (int) f_1979_, 0, 0, (int) f_1982_,
					   (int) f_1981_, f_1985_, f_2004_,
					   f_2018_, f_2006_, f_2019_, f_2008_,
					   f_2020_, f_2010_);
				f_1981_ += f_2001_;
				f_1982_ += f_2002_;
				f_1985_ += f_2005_;
				f_2018_ += f_2007_;
				f_2019_ += f_2009_;
				f_2020_ += f_2011_;
				f_1979_ += (float) ((Class155_Backup) this).anInt1737;
			    }
			}
		    }
		}
	    }
	}
    }
}
