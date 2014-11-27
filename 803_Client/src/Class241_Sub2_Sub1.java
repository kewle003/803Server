/* Class241_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub2_Sub1 extends Class241_Sub2
{
    short[] aShortArray10790;
    static final int anInt10791 = 4;
    static final int anInt10792 = 4;
    short[] aShortArray10793;
    static final boolean aBool10794 = true;
    static final int anInt10795 = 1638;
    int anInt10796;
    byte[] aByteArray10797 = new byte[512];
    static final int anInt10798 = 0;
    int anInt10799;
    int anInt10800;
    int anInt10801;
    int anInt10802;
    boolean aBool10803;
    static final int anInt10804 = 8;
    
    void method17024() {
	((Class241_Sub2_Sub1) this).aByteArray10797
	    = Class620.method13333((-1740505901
				    * ((Class241_Sub2_Sub1) this).anInt10796),
				   (byte) 2);
	method17026((byte) 83);
	for (int i = -1347698923 * ((Class241_Sub2_Sub1) this).anInt10801 - 1;
	     i >= 1; i--) {
	    short i_0_ = ((Class241_Sub2_Sub1) this).aShortArray10793[i];
	    if (i_0_ > 8 || i_0_ < -8)
		break;
	    ((Class241_Sub2_Sub1) this).anInt10801 -= -1880909763;
	}
    }
    
    Class241_Sub2_Sub1() {
	super(0, true);
	((Class241_Sub2_Sub1) this).anInt10796 = 0;
	((Class241_Sub2_Sub1) this).anInt10799 = -216868708;
	((Class241_Sub2_Sub1) this).anInt10800 = 564418708;
	((Class241_Sub2_Sub1) this).anInt10801 = 1066295540;
	((Class241_Sub2_Sub1) this).anInt10802 = 765085726;
	((Class241_Sub2_Sub1) this).aBool10803 = true;
    }
    
    int method17025(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_,
		    byte i_6_) {
	int i_7_ = i >> 12;
	int i_8_ = 1 + i_7_;
	if (i_8_ >= i_5_)
	    i_8_ = 0;
	i &= 0xfff;
	i_7_ &= 0xff;
	i_8_ &= 0xff;
	int i_9_ = i - 4096;
	int i_10_ = i_1_ - 4096;
	int i_11_ = Class347.anIntArray5362[i];
	int i_12_
	    = ((Class241_Sub2_Sub1) this).aByteArray10797[i_2_ + i_7_] & 0x3;
	int i_13_;
	if (i_12_ <= 1)
	    i_13_ = 0 == i_12_ ? i + i_1_ : i_1_ - i;
	else
	    i_13_ = 2 == i_12_ ? i - i_1_ : -i - i_1_;
	i_12_ = ((Class241_Sub2_Sub1) this).aByteArray10797[i_8_ + i_2_] & 0x3;
	int i_14_;
	if (i_12_ <= 1)
	    i_14_ = 0 == i_12_ ? i_9_ + i_1_ : i_1_ - i_9_;
	else
	    i_14_ = 2 == i_12_ ? i_9_ - i_1_ : -i_9_ - i_1_;
	int i_15_ = i_13_ + (i_11_ * (i_14_ - i_13_) >> 12);
	i_12_ = ((Class241_Sub2_Sub1) this).aByteArray10797[i_7_ + i_3_] & 0x3;
	if (i_12_ <= 1)
	    i_13_ = 0 == i_12_ ? i_10_ + i : i_10_ - i;
	else
	    i_13_ = i_12_ == 2 ? i - i_10_ : -i - i_10_;
	i_12_ = ((Class241_Sub2_Sub1) this).aByteArray10797[i_3_ + i_8_] & 0x3;
	if (i_12_ <= 1)
	    i_14_ = i_12_ == 0 ? i_9_ + i_10_ : i_10_ - i_9_;
	else
	    i_14_ = i_12_ == 2 ? i_9_ - i_10_ : -i_9_ - i_10_;
	int i_16_ = ((i_14_ - i_13_) * i_11_ >> 12) + i_13_;
	return (i_4_ * (i_16_ - i_15_) >> 12) + i_15_;
    }
    
    void method17026(byte i) {
	if (((Class241_Sub2_Sub1) this).anInt10802 * 1914878621 > 0) {
	    ((Class241_Sub2_Sub1) this).aShortArray10793
		= (new short
		   [((Class241_Sub2_Sub1) this).anInt10801 * -1347698923]);
	    ((Class241_Sub2_Sub1) this).aShortArray10790
		= (new short
		   [-1347698923 * ((Class241_Sub2_Sub1) this).anInt10801]);
	    for (int i_17_ = 0;
		 i_17_ < ((Class241_Sub2_Sub1) this).anInt10801 * -1347698923;
		 i_17_++) {
		((Class241_Sub2_Sub1) this).aShortArray10793[i_17_]
		    = (short) (int) ((Math.pow
				      ((double) ((float) (((Class241_Sub2_Sub1)
							   this).anInt10802
							  * 1914878621)
						 / 4096.0F),
				       (double) i_17_))
				     * 4096.0);
		((Class241_Sub2_Sub1) this).aShortArray10790[i_17_]
		    = (short) (int) Math.pow(2.0, (double) i_17_);
	    }
	} else if (((Class241_Sub2_Sub1) this).aShortArray10793 != null
		   && (-1347698923 * ((Class241_Sub2_Sub1) this).anInt10801
		       == (((Class241_Sub2_Sub1) this)
			   .aShortArray10793).length)) {
	    ((Class241_Sub2_Sub1) this).aShortArray10790
		= (new short
		   [((Class241_Sub2_Sub1) this).anInt10801 * -1347698923]);
	    for (int i_18_ = 0;
		 i_18_ < ((Class241_Sub2_Sub1) this).anInt10801 * -1347698923;
		 i_18_++)
		((Class241_Sub2_Sub1) this).aShortArray10790[i_18_]
		    = (short) (int) Math.pow(2.0, (double) i_18_);
	}
    }
    
    public static int[][] method17027(int i, int i_19_, int i_20_, int i_21_,
				      int i_22_, int i_23_, float f,
				      boolean bool) {
	int[][] is = new int[i_19_][i];
	Class241_Sub2_Sub1 class241_sub2_sub1 = new Class241_Sub2_Sub1();
	((Class241_Sub2_Sub1) class241_sub2_sub1).aBool10803 = bool;
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10799
	    = -1127959001 * i_21_;
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10800
	    = -2006378971 * i_22_;
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10801
	    = -1880909763 * i_23_;
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10802
	    = (int) (f * 4096.0F) * -1481008203;
	class241_sub2_sub1.method17037(-1675665158);
	Class620.method13332(i, i_19_, -1740859647);
	for (int i_24_ = 0; i_24_ < i_19_; i_24_++)
	    class241_sub2_sub1.method17032(i_24_, is[i_24_], (byte) 0);
	return is;
    }
    
    void method17028(int i, int[] is) {
	int i_25_ = (((Class241_Sub2_Sub1) this).anInt10800 * 1846482349
		     * Class620.anIntArray7857[i]);
	if (1 == ((Class241_Sub2_Sub1) this).anInt10801 * -1347698923) {
	    int i_26_ = ((Class241_Sub2_Sub1) this).aShortArray10793[0];
	    int i_27_ = ((Class241_Sub2_Sub1) this).aShortArray10790[0] << 12;
	    int i_28_
		= (1846482349 * ((Class241_Sub2_Sub1) this).anInt10800 * i_27_
		   >> 12);
	    int i_29_
		= (((Class241_Sub2_Sub1) this).anInt10799 * -632071785 * i_27_
		   >> 12);
	    int i_30_ = i_25_ * i_27_ >> 12;
	    int i_31_ = i_30_ >> 12;
	    int i_32_ = i_31_ + 1;
	    if (i_32_ >= i_28_)
		i_32_ = 0;
	    i_30_ &= 0xfff;
	    int i_33_ = Class347.anIntArray5362[i_30_];
	    int i_34_
		= (((Class241_Sub2_Sub1) this).aByteArray10797[i_31_ & 0xff]
		   & 0xff);
	    int i_35_
		= (((Class241_Sub2_Sub1) this).aByteArray10797[i_32_ & 0xff]
		   & 0xff);
	    if (((Class241_Sub2_Sub1) this).aBool10803) {
		for (int i_36_ = 0; i_36_ < 1303509079 * Class620.anInt7858;
		     i_36_++) {
		    int i_37_ = (Class620.anIntArray7855[i_36_]
				 * (-632071785
				    * ((Class241_Sub2_Sub1) this).anInt10799));
		    int i_38_ = method17025(i_27_ * i_37_ >> 12, i_30_, i_34_,
					    i_35_, i_33_, i_29_, (byte) 61);
		    i_38_ = i_38_ * i_26_ >> 12;
		    is[i_36_] = 2048 + (i_38_ >> 1);
		}
	    } else {
		for (int i_39_ = 0; i_39_ < 1303509079 * Class620.anInt7858;
		     i_39_++) {
		    int i_40_
			= (-632071785 * ((Class241_Sub2_Sub1) this).anInt10799
			   * Class620.anIntArray7855[i_39_]);
		    int i_41_ = method17025(i_40_ * i_27_ >> 12, i_30_, i_34_,
					    i_35_, i_33_, i_29_, (byte) -46);
		    is[i_39_] = i_41_ * i_26_ >> 12;
		}
	    }
	} else {
	    int i_42_ = ((Class241_Sub2_Sub1) this).aShortArray10793[0];
	    if (i_42_ > 8 || i_42_ < -8) {
		int i_43_
		    = ((Class241_Sub2_Sub1) this).aShortArray10790[0] << 12;
		int i_44_ = (i_43_ * (1846482349
				      * ((Class241_Sub2_Sub1) this).anInt10800)
			     >> 12);
		int i_45_ = (i_43_ * (-632071785
				      * ((Class241_Sub2_Sub1) this).anInt10799)
			     >> 12);
		int i_46_ = i_25_ * i_43_ >> 12;
		int i_47_ = i_46_ >> 12;
		int i_48_ = i_47_ + 1;
		if (i_48_ >= i_44_)
		    i_48_ = 0;
		i_46_ &= 0xfff;
		int i_49_ = Class347.anIntArray5362[i_46_];
		int i_50_ = ((((Class241_Sub2_Sub1) this).aByteArray10797
			      [i_47_ & 0xff])
			     & 0xff);
		int i_51_ = ((((Class241_Sub2_Sub1) this).aByteArray10797
			      [i_48_ & 0xff])
			     & 0xff);
		for (int i_52_ = 0; i_52_ < 1303509079 * Class620.anInt7858;
		     i_52_++) {
		    int i_53_
			= (((Class241_Sub2_Sub1) this).anInt10799 * -632071785
			   * Class620.anIntArray7855[i_52_]);
		    int i_54_ = method17025(i_53_ * i_43_ >> 12, i_46_, i_50_,
					    i_51_, i_49_, i_45_, (byte) 56);
		    is[i_52_] = i_42_ * i_54_ >> 12;
		}
	    }
	    for (int i_55_ = 1;
		 i_55_ < ((Class241_Sub2_Sub1) this).anInt10801 * -1347698923;
		 i_55_++) {
		i_42_ = ((Class241_Sub2_Sub1) this).aShortArray10793[i_55_];
		if (i_42_ > 8 || i_42_ < -8) {
		    int i_56_
			= (((Class241_Sub2_Sub1) this).aShortArray10790[i_55_]
			   << 12);
		    int i_57_ = i_56_ * (((Class241_Sub2_Sub1) this).anInt10800
					 * 1846482349) >> 12;
		    int i_58_ = i_56_ * (((Class241_Sub2_Sub1) this).anInt10799
					 * -632071785) >> 12;
		    int i_59_ = i_56_ * i_25_ >> 12;
		    int i_60_ = i_59_ >> 12;
		    int i_61_ = i_60_ + 1;
		    if (i_61_ >= i_57_)
			i_61_ = 0;
		    i_59_ &= 0xfff;
		    int i_62_ = Class347.anIntArray5362[i_59_];
		    int i_63_ = ((((Class241_Sub2_Sub1) this).aByteArray10797
				  [i_60_ & 0xff])
				 & 0xff);
		    int i_64_ = ((((Class241_Sub2_Sub1) this).aByteArray10797
				  [i_61_ & 0xff])
				 & 0xff);
		    if (((Class241_Sub2_Sub1) this).aBool10803
			&& i_55_ == (((Class241_Sub2_Sub1) this).anInt10801
				     * -1347698923) - 1) {
			for (int i_65_ = 0;
			     i_65_ < 1303509079 * Class620.anInt7858;
			     i_65_++) {
			    int i_66_
				= (Class620.anIntArray7855[i_65_]
				   * (-632071785 * (((Class241_Sub2_Sub1) this)
						    .anInt10799)));
			    int i_67_ = method17025(i_66_ * i_56_ >> 12, i_59_,
						    i_63_, i_64_, i_62_, i_58_,
						    (byte) -47);
			    i_67_ = is[i_65_] + (i_67_ * i_42_ >> 12);
			    is[i_65_] = 2048 + (i_67_ >> 1);
			}
		    } else {
			for (int i_68_ = 0;
			     i_68_ < Class620.anInt7858 * 1303509079;
			     i_68_++) {
			    int i_69_
				= (-632071785
				   * ((Class241_Sub2_Sub1) this).anInt10799
				   * Class620.anIntArray7855[i_68_]);
			    int i_70_ = method17025(i_69_ * i_56_ >> 12, i_59_,
						    i_63_, i_64_, i_62_, i_58_,
						    (byte) 41);
			    is[i_68_] += i_70_ * i_42_ >> 12;
			}
		    }
		}
	    }
	}
    }
    
    int method17029(int i, int i_71_, int i_72_, int i_73_, int i_74_,
		    int i_75_) {
	int i_76_ = i >> 12;
	int i_77_ = 1 + i_76_;
	if (i_77_ >= i_75_)
	    i_77_ = 0;
	i &= 0xfff;
	i_76_ &= 0xff;
	i_77_ &= 0xff;
	int i_78_ = i - 4096;
	int i_79_ = i_71_ - 4096;
	int i_80_ = Class347.anIntArray5362[i];
	int i_81_
	    = ((Class241_Sub2_Sub1) this).aByteArray10797[i_72_ + i_76_] & 0x3;
	int i_82_;
	if (i_81_ <= 1)
	    i_82_ = 0 == i_81_ ? i + i_71_ : i_71_ - i;
	else
	    i_82_ = 2 == i_81_ ? i - i_71_ : -i - i_71_;
	i_81_
	    = ((Class241_Sub2_Sub1) this).aByteArray10797[i_77_ + i_72_] & 0x3;
	int i_83_;
	if (i_81_ <= 1)
	    i_83_ = 0 == i_81_ ? i_78_ + i_71_ : i_71_ - i_78_;
	else
	    i_83_ = 2 == i_81_ ? i_78_ - i_71_ : -i_78_ - i_71_;
	int i_84_ = i_82_ + (i_80_ * (i_83_ - i_82_) >> 12);
	i_81_
	    = ((Class241_Sub2_Sub1) this).aByteArray10797[i_76_ + i_73_] & 0x3;
	if (i_81_ <= 1)
	    i_82_ = 0 == i_81_ ? i_79_ + i : i_79_ - i;
	else
	    i_82_ = i_81_ == 2 ? i - i_79_ : -i - i_79_;
	i_81_
	    = ((Class241_Sub2_Sub1) this).aByteArray10797[i_73_ + i_77_] & 0x3;
	if (i_81_ <= 1)
	    i_83_ = i_81_ == 0 ? i_78_ + i_79_ : i_79_ - i_78_;
	else
	    i_83_ = i_81_ == 2 ? i_78_ - i_79_ : -i_78_ - i_79_;
	int i_85_ = ((i_83_ - i_82_) * i_80_ >> 12) + i_82_;
	return (i_74_ * (i_85_ - i_84_) >> 12) + i_84_;
    }
    
    int method17030(int i, int i_86_, int i_87_, int i_88_, int i_89_,
		    int i_90_) {
	int i_91_ = i >> 12;
	int i_92_ = 1 + i_91_;
	if (i_92_ >= i_90_)
	    i_92_ = 0;
	i &= 0xfff;
	i_91_ &= 0xff;
	i_92_ &= 0xff;
	int i_93_ = i - 4096;
	int i_94_ = i_86_ - 4096;
	int i_95_ = Class347.anIntArray5362[i];
	int i_96_
	    = ((Class241_Sub2_Sub1) this).aByteArray10797[i_87_ + i_91_] & 0x3;
	int i_97_;
	if (i_96_ <= 1)
	    i_97_ = 0 == i_96_ ? i + i_86_ : i_86_ - i;
	else
	    i_97_ = 2 == i_96_ ? i - i_86_ : -i - i_86_;
	i_96_
	    = ((Class241_Sub2_Sub1) this).aByteArray10797[i_92_ + i_87_] & 0x3;
	int i_98_;
	if (i_96_ <= 1)
	    i_98_ = 0 == i_96_ ? i_93_ + i_86_ : i_86_ - i_93_;
	else
	    i_98_ = 2 == i_96_ ? i_93_ - i_86_ : -i_93_ - i_86_;
	int i_99_ = i_97_ + (i_95_ * (i_98_ - i_97_) >> 12);
	i_96_
	    = ((Class241_Sub2_Sub1) this).aByteArray10797[i_91_ + i_88_] & 0x3;
	if (i_96_ <= 1)
	    i_97_ = 0 == i_96_ ? i_94_ + i : i_94_ - i;
	else
	    i_97_ = i_96_ == 2 ? i - i_94_ : -i - i_94_;
	i_96_
	    = ((Class241_Sub2_Sub1) this).aByteArray10797[i_88_ + i_92_] & 0x3;
	if (i_96_ <= 1)
	    i_98_ = i_96_ == 0 ? i_93_ + i_94_ : i_94_ - i_93_;
	else
	    i_98_ = i_96_ == 2 ? i_93_ - i_94_ : -i_93_ - i_94_;
	int i_100_ = ((i_98_ - i_97_) * i_95_ >> 12) + i_97_;
	return (i_89_ * (i_100_ - i_99_) >> 12) + i_99_;
    }
    
    int method17031(int i, int i_101_, int i_102_, int i_103_, int i_104_,
		    int i_105_) {
	int i_106_ = i >> 12;
	int i_107_ = 1 + i_106_;
	if (i_107_ >= i_105_)
	    i_107_ = 0;
	i &= 0xfff;
	i_106_ &= 0xff;
	i_107_ &= 0xff;
	int i_108_ = i - 4096;
	int i_109_ = i_101_ - 4096;
	int i_110_ = Class347.anIntArray5362[i];
	int i_111_
	    = (((Class241_Sub2_Sub1) this).aByteArray10797[i_102_ + i_106_]
	       & 0x3);
	int i_112_;
	if (i_111_ <= 1)
	    i_112_ = 0 == i_111_ ? i + i_101_ : i_101_ - i;
	else
	    i_112_ = 2 == i_111_ ? i - i_101_ : -i - i_101_;
	i_111_ = (((Class241_Sub2_Sub1) this).aByteArray10797[i_107_ + i_102_]
		  & 0x3);
	int i_113_;
	if (i_111_ <= 1)
	    i_113_ = 0 == i_111_ ? i_108_ + i_101_ : i_101_ - i_108_;
	else
	    i_113_ = 2 == i_111_ ? i_108_ - i_101_ : -i_108_ - i_101_;
	int i_114_ = i_112_ + (i_110_ * (i_113_ - i_112_) >> 12);
	i_111_ = (((Class241_Sub2_Sub1) this).aByteArray10797[i_106_ + i_103_]
		  & 0x3);
	if (i_111_ <= 1)
	    i_112_ = 0 == i_111_ ? i_109_ + i : i_109_ - i;
	else
	    i_112_ = i_111_ == 2 ? i - i_109_ : -i - i_109_;
	i_111_ = (((Class241_Sub2_Sub1) this).aByteArray10797[i_103_ + i_107_]
		  & 0x3);
	if (i_111_ <= 1)
	    i_113_ = i_111_ == 0 ? i_108_ + i_109_ : i_109_ - i_108_;
	else
	    i_113_ = i_111_ == 2 ? i_108_ - i_109_ : -i_108_ - i_109_;
	int i_115_ = ((i_113_ - i_112_) * i_110_ >> 12) + i_112_;
	return (i_104_ * (i_115_ - i_114_) >> 12) + i_114_;
    }
    
    void method17032(int i, int[] is, byte i_116_) {
	int i_117_ = (((Class241_Sub2_Sub1) this).anInt10800 * 1846482349
		      * Class620.anIntArray7857[i]);
	if (1 == ((Class241_Sub2_Sub1) this).anInt10801 * -1347698923) {
	    int i_118_ = ((Class241_Sub2_Sub1) this).aShortArray10793[0];
	    int i_119_ = ((Class241_Sub2_Sub1) this).aShortArray10790[0] << 12;
	    int i_120_
		= (1846482349 * ((Class241_Sub2_Sub1) this).anInt10800 * i_119_
		   >> 12);
	    int i_121_
		= (((Class241_Sub2_Sub1) this).anInt10799 * -632071785 * i_119_
		   >> 12);
	    int i_122_ = i_117_ * i_119_ >> 12;
	    int i_123_ = i_122_ >> 12;
	    int i_124_ = i_123_ + 1;
	    if (i_124_ >= i_120_)
		i_124_ = 0;
	    i_122_ &= 0xfff;
	    int i_125_ = Class347.anIntArray5362[i_122_];
	    int i_126_
		= (((Class241_Sub2_Sub1) this).aByteArray10797[i_123_ & 0xff]
		   & 0xff);
	    int i_127_
		= (((Class241_Sub2_Sub1) this).aByteArray10797[i_124_ & 0xff]
		   & 0xff);
	    if (((Class241_Sub2_Sub1) this).aBool10803) {
		for (int i_128_ = 0; i_128_ < 1303509079 * Class620.anInt7858;
		     i_128_++) {
		    int i_129_
			= (Class620.anIntArray7855[i_128_]
			   * (-632071785
			      * ((Class241_Sub2_Sub1) this).anInt10799));
		    int i_130_
			= method17025(i_119_ * i_129_ >> 12, i_122_, i_126_,
				      i_127_, i_125_, i_121_, (byte) 12);
		    i_130_ = i_130_ * i_118_ >> 12;
		    is[i_128_] = 2048 + (i_130_ >> 1);
		}
	    } else {
		for (int i_131_ = 0; i_131_ < 1303509079 * Class620.anInt7858;
		     i_131_++) {
		    int i_132_
			= (-632071785 * ((Class241_Sub2_Sub1) this).anInt10799
			   * Class620.anIntArray7855[i_131_]);
		    int i_133_
			= method17025(i_132_ * i_119_ >> 12, i_122_, i_126_,
				      i_127_, i_125_, i_121_, (byte) -3);
		    is[i_131_] = i_133_ * i_118_ >> 12;
		}
	    }
	} else {
	    int i_134_ = ((Class241_Sub2_Sub1) this).aShortArray10793[0];
	    if (i_134_ > 8 || i_134_ < -8) {
		int i_135_
		    = ((Class241_Sub2_Sub1) this).aShortArray10790[0] << 12;
		int i_136_
		    = (i_135_ * (1846482349
				 * ((Class241_Sub2_Sub1) this).anInt10800)
		       >> 12);
		int i_137_
		    = (i_135_ * (-632071785
				 * ((Class241_Sub2_Sub1) this).anInt10799)
		       >> 12);
		int i_138_ = i_117_ * i_135_ >> 12;
		int i_139_ = i_138_ >> 12;
		int i_140_ = i_139_ + 1;
		if (i_140_ >= i_136_)
		    i_140_ = 0;
		i_138_ &= 0xfff;
		int i_141_ = Class347.anIntArray5362[i_138_];
		int i_142_ = ((((Class241_Sub2_Sub1) this).aByteArray10797
			       [i_139_ & 0xff])
			      & 0xff);
		int i_143_ = ((((Class241_Sub2_Sub1) this).aByteArray10797
			       [i_140_ & 0xff])
			      & 0xff);
		for (int i_144_ = 0; i_144_ < 1303509079 * Class620.anInt7858;
		     i_144_++) {
		    int i_145_
			= (((Class241_Sub2_Sub1) this).anInt10799 * -632071785
			   * Class620.anIntArray7855[i_144_]);
		    int i_146_
			= method17025(i_145_ * i_135_ >> 12, i_138_, i_142_,
				      i_143_, i_141_, i_137_, (byte) 47);
		    is[i_144_] = i_134_ * i_146_ >> 12;
		}
	    }
	    for (int i_147_ = 1;
		 i_147_ < ((Class241_Sub2_Sub1) this).anInt10801 * -1347698923;
		 i_147_++) {
		i_134_ = ((Class241_Sub2_Sub1) this).aShortArray10793[i_147_];
		if (i_134_ > 8 || i_134_ < -8) {
		    int i_148_
			= (((Class241_Sub2_Sub1) this).aShortArray10790[i_147_]
			   << 12);
		    int i_149_
			= (i_148_ * (((Class241_Sub2_Sub1) this).anInt10800
				     * 1846482349)
			   >> 12);
		    int i_150_
			= (i_148_ * (((Class241_Sub2_Sub1) this).anInt10799
				     * -632071785)
			   >> 12);
		    int i_151_ = i_148_ * i_117_ >> 12;
		    int i_152_ = i_151_ >> 12;
		    int i_153_ = i_152_ + 1;
		    if (i_153_ >= i_149_)
			i_153_ = 0;
		    i_151_ &= 0xfff;
		    int i_154_ = Class347.anIntArray5362[i_151_];
		    int i_155_ = ((((Class241_Sub2_Sub1) this).aByteArray10797
				   [i_152_ & 0xff])
				  & 0xff);
		    int i_156_ = ((((Class241_Sub2_Sub1) this).aByteArray10797
				   [i_153_ & 0xff])
				  & 0xff);
		    if (((Class241_Sub2_Sub1) this).aBool10803
			&& i_147_ == (((Class241_Sub2_Sub1) this).anInt10801
				      * -1347698923) - 1) {
			for (int i_157_ = 0;
			     i_157_ < 1303509079 * Class620.anInt7858;
			     i_157_++) {
			    int i_158_
				= (Class620.anIntArray7855[i_157_]
				   * (-632071785 * (((Class241_Sub2_Sub1) this)
						    .anInt10799)));
			    int i_159_ = method17025(i_158_ * i_148_ >> 12,
						     i_151_, i_155_, i_156_,
						     i_154_, i_150_, (byte) 7);
			    i_159_ = is[i_157_] + (i_159_ * i_134_ >> 12);
			    is[i_157_] = 2048 + (i_159_ >> 1);
			}
		    } else {
			for (int i_160_ = 0;
			     i_160_ < Class620.anInt7858 * 1303509079;
			     i_160_++) {
			    int i_161_
				= (-632071785
				   * ((Class241_Sub2_Sub1) this).anInt10799
				   * Class620.anIntArray7855[i_160_]);
			    int i_162_
				= method17025(i_161_ * i_148_ >> 12, i_151_,
					      i_155_, i_156_, i_154_, i_150_,
					      (byte) -14);
			    is[i_160_] += i_162_ * i_134_ >> 12;
			}
		    }
		}
	    }
	}
    }
    
    void method17033() {
	if (((Class241_Sub2_Sub1) this).anInt10802 * 1914878621 > 0) {
	    ((Class241_Sub2_Sub1) this).aShortArray10793
		= (new short
		   [((Class241_Sub2_Sub1) this).anInt10801 * -1347698923]);
	    ((Class241_Sub2_Sub1) this).aShortArray10790
		= (new short
		   [-1347698923 * ((Class241_Sub2_Sub1) this).anInt10801]);
	    for (int i = 0;
		 i < ((Class241_Sub2_Sub1) this).anInt10801 * -1347698923;
		 i++) {
		((Class241_Sub2_Sub1) this).aShortArray10793[i]
		    = (short) (int) ((Math.pow
				      ((double) ((float) (((Class241_Sub2_Sub1)
							   this).anInt10802
							  * 1914878621)
						 / 4096.0F),
				       (double) i))
				     * 4096.0);
		((Class241_Sub2_Sub1) this).aShortArray10790[i]
		    = (short) (int) Math.pow(2.0, (double) i);
	    }
	} else if (((Class241_Sub2_Sub1) this).aShortArray10793 != null
		   && (-1347698923 * ((Class241_Sub2_Sub1) this).anInt10801
		       == (((Class241_Sub2_Sub1) this)
			   .aShortArray10793).length)) {
	    ((Class241_Sub2_Sub1) this).aShortArray10790
		= (new short
		   [((Class241_Sub2_Sub1) this).anInt10801 * -1347698923]);
	    for (int i = 0;
		 i < ((Class241_Sub2_Sub1) this).anInt10801 * -1347698923; i++)
		((Class241_Sub2_Sub1) this).aShortArray10790[i]
		    = (short) (int) Math.pow(2.0, (double) i);
	}
    }
    
    void method17034() {
	if (((Class241_Sub2_Sub1) this).anInt10802 * 1914878621 > 0) {
	    ((Class241_Sub2_Sub1) this).aShortArray10793
		= (new short
		   [((Class241_Sub2_Sub1) this).anInt10801 * -1347698923]);
	    ((Class241_Sub2_Sub1) this).aShortArray10790
		= (new short
		   [-1347698923 * ((Class241_Sub2_Sub1) this).anInt10801]);
	    for (int i = 0;
		 i < ((Class241_Sub2_Sub1) this).anInt10801 * -1347698923;
		 i++) {
		((Class241_Sub2_Sub1) this).aShortArray10793[i]
		    = (short) (int) ((Math.pow
				      ((double) ((float) (((Class241_Sub2_Sub1)
							   this).anInt10802
							  * 1914878621)
						 / 4096.0F),
				       (double) i))
				     * 4096.0);
		((Class241_Sub2_Sub1) this).aShortArray10790[i]
		    = (short) (int) Math.pow(2.0, (double) i);
	    }
	} else if (((Class241_Sub2_Sub1) this).aShortArray10793 != null
		   && (-1347698923 * ((Class241_Sub2_Sub1) this).anInt10801
		       == (((Class241_Sub2_Sub1) this)
			   .aShortArray10793).length)) {
	    ((Class241_Sub2_Sub1) this).aShortArray10790
		= (new short
		   [((Class241_Sub2_Sub1) this).anInt10801 * -1347698923]);
	    for (int i = 0;
		 i < ((Class241_Sub2_Sub1) this).anInt10801 * -1347698923; i++)
		((Class241_Sub2_Sub1) this).aShortArray10790[i]
		    = (short) (int) Math.pow(2.0, (double) i);
	}
    }
    
    public static int[] method17035(int i, int i_163_, int i_164_, int i_165_,
				    int i_166_, float f, boolean bool) {
	int[] is = new int[i];
	Class241_Sub2_Sub1 class241_sub2_sub1 = new Class241_Sub2_Sub1();
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10796
	    = i_163_ * -510674085;
	((Class241_Sub2_Sub1) class241_sub2_sub1).aBool10803 = bool;
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10799
	    = -1127959001 * i_164_;
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10800
	    = i_165_ * -2006378971;
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10801
	    = i_166_ * -1880909763;
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10802
	    = -1481008203 * (int) (f * 4096.0F);
	class241_sub2_sub1.method17037(-1675665158);
	Class620.method13332(i, 1, -1782442303);
	class241_sub2_sub1.method17032(0, is, (byte) 0);
	return is;
    }
    
    public static int[][] method17036(int i, int i_167_, int i_168_,
				      int i_169_, int i_170_, int i_171_,
				      float f, boolean bool) {
	int[][] is = new int[i_167_][i];
	Class241_Sub2_Sub1 class241_sub2_sub1 = new Class241_Sub2_Sub1();
	((Class241_Sub2_Sub1) class241_sub2_sub1).aBool10803 = bool;
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10799
	    = -1127959001 * i_169_;
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10800
	    = -2006378971 * i_170_;
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10801
	    = -1880909763 * i_171_;
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10802
	    = (int) (f * 4096.0F) * -1481008203;
	class241_sub2_sub1.method17037(-1675665158);
	Class620.method13332(i, i_167_, -742868624);
	for (int i_172_ = 0; i_172_ < i_167_; i_172_++)
	    class241_sub2_sub1.method17032(i_172_, is[i_172_], (byte) 0);
	return is;
    }
    
    void method17037(int i) {
	((Class241_Sub2_Sub1) this).aByteArray10797
	    = Class620.method13333((-1740505901
				    * ((Class241_Sub2_Sub1) this).anInt10796),
				   (byte) 2);
	method17026((byte) 55);
	for (int i_173_
		 = -1347698923 * ((Class241_Sub2_Sub1) this).anInt10801 - 1;
	     i_173_ >= 1; i_173_--) {
	    short i_174_
		= ((Class241_Sub2_Sub1) this).aShortArray10793[i_173_];
	    if (i_174_ > 8 || i_174_ < -8)
		break;
	    ((Class241_Sub2_Sub1) this).anInt10801 -= -1880909763;
	}
    }
}
