/* Class108_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class108_Sub2 extends Class108
{
    public int anInt9302;
    int anInt9303;
    int anInt9304;
    int anInt9305;
    public int anInt9306;
    int anInt9307;
    public int[] anIntArray9308;
    public byte[] aByteArray9309;
    public byte[] aByteArray9310;
    
    public int method2695() {
	return anInt9302;
    }
    
    public boolean method2691() {
	return true;
    }
    
    public boolean method2709() {
	return aByteArray9310 != null;
    }
    
    public boolean method2710() {
	return true;
    }
    
    public void method2736(int i) {
	int i_0_ = getHeight();
	int i_1_ = getWidth();
	if (((Class108_Sub2) this).anInt9304 != i_0_
	    || ((Class108_Sub2) this).anInt9303 != i_1_) {
	    int i_2_ = i;
	    if (i_2_ > anInt9302)
		i_2_ = anInt9302;
	    int i_3_ = i;
	    if (i_3_ + anInt9302 + ((Class108_Sub2) this).anInt9304 > i_0_)
		i_3_ = i_0_ - anInt9302 - ((Class108_Sub2) this).anInt9304;
	    int i_4_ = i;
	    if (i_4_ > anInt9306)
		i_4_ = anInt9306;
	    int i_5_ = i;
	    if (i_5_ + anInt9306 + ((Class108_Sub2) this).anInt9303 > i_1_)
		i_5_ = i_1_ - anInt9306 - ((Class108_Sub2) this).anInt9303;
	    int i_6_ = ((Class108_Sub2) this).anInt9304 + i_2_ + i_3_;
	    int i_7_ = ((Class108_Sub2) this).anInt9303 + i_4_ + i_5_;
	    byte[] is = new byte[i_6_ * i_7_];
	    if (aByteArray9310 == null) {
		for (int i_8_ = 0; i_8_ < ((Class108_Sub2) this).anInt9303;
		     i_8_++) {
		    int i_9_ = i_8_ * ((Class108_Sub2) this).anInt9304;
		    int i_10_ = (i_8_ + i_4_) * i_6_ + i_2_;
		    for (int i_11_ = 0;
			 i_11_ < ((Class108_Sub2) this).anInt9304; i_11_++)
			is[i_10_++] = aByteArray9309[i_9_++];
		}
	    } else {
		byte[] is_12_ = new byte[i_6_ * i_7_];
		for (int i_13_ = 0; i_13_ < ((Class108_Sub2) this).anInt9303;
		     i_13_++) {
		    int i_14_ = i_13_ * ((Class108_Sub2) this).anInt9304;
		    int i_15_ = (i_13_ + i_4_) * i_6_ + i_2_;
		    for (int i_16_ = 0;
			 i_16_ < ((Class108_Sub2) this).anInt9304; i_16_++) {
			is_12_[i_15_] = aByteArray9310[i_14_];
			is[i_15_++] = aByteArray9309[i_14_++];
		    }
		}
		aByteArray9310 = is_12_;
	    }
	    anInt9302 -= i_2_;
	    anInt9306 -= i_4_;
	    ((Class108_Sub2) this).anInt9307 -= i_3_;
	    ((Class108_Sub2) this).anInt9305 -= i_5_;
	    ((Class108_Sub2) this).anInt9304 = i_6_;
	    ((Class108_Sub2) this).anInt9303 = i_7_;
	    aByteArray9309 = is;
	}
    }
    
    public int method2722() {
	return (((Class108_Sub2) this).anInt9303 + anInt9306
		+ ((Class108_Sub2) this).anInt9305);
    }
    
    public int getWidth() {
	return (((Class108_Sub2) this).anInt9303 + anInt9306
		+ ((Class108_Sub2) this).anInt9305);
    }
    
    public int[] method2712(boolean bool) {
	int[] is;
	if (bool) {
	    int i = getHeight();
	    is = new int[i * getWidth()];
	    if (aByteArray9310 != null) {
		for (int i_17_ = 0; i_17_ < ((Class108_Sub2) this).anInt9303;
		     i_17_++) {
		    int i_18_ = i_17_ * ((Class108_Sub2) this).anInt9304;
		    int i_19_ = anInt9302 + (i_17_ + anInt9306) * i;
		    for (int i_20_ = 0;
			 i_20_ < ((Class108_Sub2) this).anInt9304; i_20_++) {
			is[i_19_++]
			    = (aByteArray9310[i_18_] << 24
			       | anIntArray9308[aByteArray9309[i_18_] & 0xff]);
			i_18_++;
		    }
		}
	    } else {
		for (int i_21_ = 0; i_21_ < ((Class108_Sub2) this).anInt9303;
		     i_21_++) {
		    int i_22_ = i_21_ * ((Class108_Sub2) this).anInt9304;
		    int i_23_ = anInt9302 + (i_21_ + anInt9306) * i;
		    for (int i_24_ = 0;
			 i_24_ < ((Class108_Sub2) this).anInt9304; i_24_++) {
			int i_25_
			    = anIntArray9308[aByteArray9309[i_22_++] & 0xff];
			if (i_25_ != 0)
			    is[i_23_++] = ~0xffffff | i_25_;
			else
			    is[i_23_++] = 0;
		    }
		}
	    }
	} else {
	    is = new int[(((Class108_Sub2) this).anInt9304
			  * ((Class108_Sub2) this).anInt9303)];
	    int i = 0;
	    int i_26_ = 0;
	    if (aByteArray9310 != null) {
		for (int i_27_ = 0; i_27_ < ((Class108_Sub2) this).anInt9303;
		     i_27_++) {
		    for (int i_28_ = 0;
			 i_28_ < ((Class108_Sub2) this).anInt9304; i_28_++) {
			is[i_26_++]
			    = (aByteArray9310[i] << 24
			       | anIntArray9308[aByteArray9309[i] & 0xff]);
			i++;
		    }
		}
	    } else {
		for (int i_29_ = 0; i_29_ < ((Class108_Sub2) this).anInt9303;
		     i_29_++) {
		    for (int i_30_ = 0;
			 i_30_ < ((Class108_Sub2) this).anInt9304; i_30_++) {
			int i_31_ = anIntArray9308[aByteArray9309[i++] & 0xff];
			is[i_26_++] = i_31_ != 0 ? ~0xffffff | i_31_ : 0;
		    }
		}
	    }
	}
	return is;
    }
    
    public int method2696() {
	return ((Class108_Sub2) this).anInt9307;
    }
    
    public int method2698() {
	return ((Class108_Sub2) this).anInt9304;
    }
    
    public int method2742() {
	return ((Class108_Sub2) this).anInt9305;
    }
    
    public void method2724() {
	((Class108_Sub2) this).anInt9305 = 0;
	anInt9306 = 0;
	((Class108_Sub2) this).anInt9307 = 0;
	anInt9302 = 0;
    }
    
    public void method2702(int i) {
	int i_32_ = getHeight();
	int i_33_ = getWidth();
	if (((Class108_Sub2) this).anInt9304 != i_32_
	    || ((Class108_Sub2) this).anInt9303 != i_33_) {
	    int i_34_ = i;
	    if (i_34_ > anInt9302)
		i_34_ = anInt9302;
	    int i_35_ = i;
	    if (i_35_ + anInt9302 + ((Class108_Sub2) this).anInt9304 > i_32_)
		i_35_ = i_32_ - anInt9302 - ((Class108_Sub2) this).anInt9304;
	    int i_36_ = i;
	    if (i_36_ > anInt9306)
		i_36_ = anInt9306;
	    int i_37_ = i;
	    if (i_37_ + anInt9306 + ((Class108_Sub2) this).anInt9303 > i_33_)
		i_37_ = i_33_ - anInt9306 - ((Class108_Sub2) this).anInt9303;
	    int i_38_ = ((Class108_Sub2) this).anInt9304 + i_34_ + i_35_;
	    int i_39_ = ((Class108_Sub2) this).anInt9303 + i_36_ + i_37_;
	    byte[] is = new byte[i_38_ * i_39_];
	    if (aByteArray9310 == null) {
		for (int i_40_ = 0; i_40_ < ((Class108_Sub2) this).anInt9303;
		     i_40_++) {
		    int i_41_ = i_40_ * ((Class108_Sub2) this).anInt9304;
		    int i_42_ = (i_40_ + i_36_) * i_38_ + i_34_;
		    for (int i_43_ = 0;
			 i_43_ < ((Class108_Sub2) this).anInt9304; i_43_++)
			is[i_42_++] = aByteArray9309[i_41_++];
		}
	    } else {
		byte[] is_44_ = new byte[i_38_ * i_39_];
		for (int i_45_ = 0; i_45_ < ((Class108_Sub2) this).anInt9303;
		     i_45_++) {
		    int i_46_ = i_45_ * ((Class108_Sub2) this).anInt9304;
		    int i_47_ = (i_45_ + i_36_) * i_38_ + i_34_;
		    for (int i_48_ = 0;
			 i_48_ < ((Class108_Sub2) this).anInt9304; i_48_++) {
			is_44_[i_47_] = aByteArray9310[i_46_];
			is[i_47_++] = aByteArray9309[i_46_++];
		    }
		}
		aByteArray9310 = is_44_;
	    }
	    anInt9302 -= i_34_;
	    anInt9306 -= i_36_;
	    ((Class108_Sub2) this).anInt9307 -= i_35_;
	    ((Class108_Sub2) this).anInt9305 -= i_37_;
	    ((Class108_Sub2) this).anInt9304 = i_38_;
	    ((Class108_Sub2) this).anInt9303 = i_39_;
	    aByteArray9309 = is;
	}
    }
    
    public void method2734() {
	byte[] is = aByteArray9309;
	if (aByteArray9310 == null) {
	    for (int i = ((Class108_Sub2) this).anInt9303 - 1; i >= 0; i--) {
		int i_49_ = i * ((Class108_Sub2) this).anInt9304;
		for (int i_50_ = (i + 1) * ((Class108_Sub2) this).anInt9304;
		     i_49_ < i_50_; i_49_++) {
		    i_50_--;
		    byte i_51_ = is[i_49_];
		    is[i_49_] = is[i_50_];
		    is[i_50_] = i_51_;
		}
	    }
	} else {
	    byte[] is_52_ = aByteArray9310;
	    for (int i = ((Class108_Sub2) this).anInt9303 - 1; i >= 0; i--) {
		int i_53_ = i * ((Class108_Sub2) this).anInt9304;
		for (int i_54_ = (i + 1) * ((Class108_Sub2) this).anInt9304;
		     i_53_ < i_54_; i_53_++) {
		    i_54_--;
		    byte i_55_ = is[i_53_];
		    is[i_53_] = is[i_54_];
		    is[i_54_] = i_55_;
		    i_55_ = is_52_[i_53_];
		    is_52_[i_53_] = is_52_[i_54_];
		    is_52_[i_54_] = i_55_;
		}
	    }
	}
	int i = anInt9302;
	anInt9302 = ((Class108_Sub2) this).anInt9307;
	((Class108_Sub2) this).anInt9307 = i;
    }
    
    public void method2704(int i) {
	int i_56_ = -1;
	if (anIntArray9308.length < 255) {
	    for (int i_57_ = 0; i_57_ < anIntArray9308.length; i_57_++) {
		if (anIntArray9308[i_57_] == i) {
		    i_56_ = i_57_;
		    break;
		}
	    }
	    if (i_56_ == -1) {
		i_56_ = anIntArray9308.length;
		int[] is = new int[anIntArray9308.length + 1];
		System.arraycopy(anIntArray9308, 0, is, 0,
				 anIntArray9308.length);
		anIntArray9308 = is;
		is[i_56_] = i;
	    }
	} else {
	    int i_58_ = 2147483647;
	    int i_59_ = i >> 16 & 0xff;
	    int i_60_ = i >> 8 & 0xff;
	    int i_61_ = i & 0xff;
	    for (int i_62_ = 0; i_62_ < anIntArray9308.length; i_62_++) {
		int i_63_ = anIntArray9308[i_62_];
		int i_64_ = i_63_ >> 16 & 0xff;
		int i_65_ = i_63_ >> 8 & 0xff;
		int i_66_ = i_63_ & 0xff;
		int i_67_ = i_59_ - i_64_;
		if (i_67_ < 0)
		    i_67_ = -i_67_;
		int i_68_ = i_60_ - i_65_;
		if (i_68_ < 0)
		    i_68_ = -i_68_;
		int i_69_ = i_61_ - i_66_;
		if (i_69_ < 0)
		    i_69_ = -i_69_;
		int i_70_ = i_67_ + i_68_ + i_69_;
		if (i_70_ < i_58_) {
		    i_58_ = i_70_;
		    i_56_ = i_62_;
		}
	    }
	}
	for (int i_71_ = ((Class108_Sub2) this).anInt9303 - 1; i_71_ > 0;
	     i_71_--) {
	    int i_72_ = i_71_ * ((Class108_Sub2) this).anInt9304;
	    for (int i_73_ = ((Class108_Sub2) this).anInt9304 - 1; i_73_ > 0;
		 i_73_--) {
		if (anIntArray9308[aByteArray9309[i_73_ + i_72_] & 0xff] == 0
		    && (anIntArray9308
			[(aByteArray9309[(i_73_ + i_72_ - 1
					  - ((Class108_Sub2) this).anInt9304)]
			  & 0xff)]) != 0)
		    aByteArray9309[i_73_ + i_72_] = (byte) i_56_;
	    }
	}
    }
    
    public void method2705() {
	byte[] is = aByteArray9309;
	if (aByteArray9310 == null) {
	    for (int i = ((Class108_Sub2) this).anInt9303 - 1; i >= 0; i--) {
		int i_74_ = i * ((Class108_Sub2) this).anInt9304;
		for (int i_75_ = (i + 1) * ((Class108_Sub2) this).anInt9304;
		     i_74_ < i_75_; i_74_++) {
		    i_75_--;
		    byte i_76_ = is[i_74_];
		    is[i_74_] = is[i_75_];
		    is[i_75_] = i_76_;
		}
	    }
	} else {
	    byte[] is_77_ = aByteArray9310;
	    for (int i = ((Class108_Sub2) this).anInt9303 - 1; i >= 0; i--) {
		int i_78_ = i * ((Class108_Sub2) this).anInt9304;
		for (int i_79_ = (i + 1) * ((Class108_Sub2) this).anInt9304;
		     i_78_ < i_79_; i_78_++) {
		    i_79_--;
		    byte i_80_ = is[i_78_];
		    is[i_78_] = is[i_79_];
		    is[i_79_] = i_80_;
		    i_80_ = is_77_[i_78_];
		    is_77_[i_78_] = is_77_[i_79_];
		    is_77_[i_79_] = i_80_;
		}
	    }
	}
	int i = anInt9302;
	anInt9302 = ((Class108_Sub2) this).anInt9307;
	((Class108_Sub2) this).anInt9307 = i;
    }
    
    public void method2747() {
	byte[] is = aByteArray9309;
	if (aByteArray9310 == null) {
	    for (int i = (((Class108_Sub2) this).anInt9303 >> 1) - 1; i >= 0;
		 i--) {
		int i_81_ = i * ((Class108_Sub2) this).anInt9304;
		int i_82_ = ((((Class108_Sub2) this).anInt9303 - i - 1)
			     * ((Class108_Sub2) this).anInt9304);
		for (int i_83_ = -((Class108_Sub2) this).anInt9304; i_83_ < 0;
		     i_83_++) {
		    byte i_84_ = is[i_81_];
		    is[i_81_] = is[i_82_];
		    is[i_82_] = i_84_;
		    i_81_++;
		    i_82_++;
		}
	    }
	} else {
	    byte[] is_85_ = aByteArray9310;
	    for (int i = (((Class108_Sub2) this).anInt9303 >> 1) - 1; i >= 0;
		 i--) {
		int i_86_ = i * ((Class108_Sub2) this).anInt9304;
		int i_87_ = ((((Class108_Sub2) this).anInt9303 - i - 1)
			     * ((Class108_Sub2) this).anInt9304);
		for (int i_88_ = -((Class108_Sub2) this).anInt9304; i_88_ < 0;
		     i_88_++) {
		    byte i_89_ = is[i_86_];
		    is[i_86_] = is[i_87_];
		    is[i_87_] = i_89_;
		    i_89_ = is_85_[i_86_];
		    is_85_[i_86_] = is_85_[i_87_];
		    is_85_[i_87_] = i_89_;
		    i_86_++;
		    i_87_++;
		}
	    }
	}
	int i = anInt9306;
	anInt9306 = ((Class108_Sub2) this).anInt9305;
	((Class108_Sub2) this).anInt9305 = i;
    }
    
    public int getHeight() {
	return (((Class108_Sub2) this).anInt9304 + anInt9302
		+ ((Class108_Sub2) this).anInt9307);
    }
    
    public int[] method2707(boolean bool) {
	int[] is;
	if (bool) {
	    int i = getHeight();
	    is = new int[i * getWidth()];
	    if (aByteArray9310 != null) {
		for (int i_90_ = 0; i_90_ < ((Class108_Sub2) this).anInt9303;
		     i_90_++) {
		    int i_91_ = i_90_ * ((Class108_Sub2) this).anInt9304;
		    int i_92_ = anInt9302 + (i_90_ + anInt9306) * i;
		    for (int i_93_ = 0;
			 i_93_ < ((Class108_Sub2) this).anInt9304; i_93_++) {
			is[i_92_++]
			    = (aByteArray9310[i_91_] << 24
			       | anIntArray9308[aByteArray9309[i_91_] & 0xff]);
			i_91_++;
		    }
		}
	    } else {
		for (int i_94_ = 0; i_94_ < ((Class108_Sub2) this).anInt9303;
		     i_94_++) {
		    int i_95_ = i_94_ * ((Class108_Sub2) this).anInt9304;
		    int i_96_ = anInt9302 + (i_94_ + anInt9306) * i;
		    for (int i_97_ = 0;
			 i_97_ < ((Class108_Sub2) this).anInt9304; i_97_++) {
			int i_98_
			    = anIntArray9308[aByteArray9309[i_95_++] & 0xff];
			if (i_98_ != 0)
			    is[i_96_++] = ~0xffffff | i_98_;
			else
			    is[i_96_++] = 0;
		    }
		}
	    }
	} else {
	    is = new int[(((Class108_Sub2) this).anInt9304
			  * ((Class108_Sub2) this).anInt9303)];
	    int i = 0;
	    int i_99_ = 0;
	    if (aByteArray9310 != null) {
		for (int i_100_ = 0; i_100_ < ((Class108_Sub2) this).anInt9303;
		     i_100_++) {
		    for (int i_101_ = 0;
			 i_101_ < ((Class108_Sub2) this).anInt9304; i_101_++) {
			is[i_99_++]
			    = (aByteArray9310[i] << 24
			       | anIntArray9308[aByteArray9309[i] & 0xff]);
			i++;
		    }
		}
	    } else {
		for (int i_102_ = 0; i_102_ < ((Class108_Sub2) this).anInt9303;
		     i_102_++) {
		    for (int i_103_ = 0;
			 i_103_ < ((Class108_Sub2) this).anInt9304; i_103_++) {
			int i_104_
			    = anIntArray9308[aByteArray9309[i++] & 0xff];
			is[i_99_++] = i_104_ != 0 ? ~0xffffff | i_104_ : 0;
		    }
		}
	    }
	}
	return is;
    }
    
    public void method2708(int i, int i_105_, int i_106_) {
	for (int i_107_ = 1; i_107_ < anIntArray9308.length; i_107_++) {
	    if (anIntArray9308[i_107_] != 1
		&& anIntArray9308[i_107_] != 16711935) {
		int i_108_ = anIntArray9308[i_107_] >> 16 & 0xff;
		i_108_ += i;
		if (i_108_ < 0)
		    i_108_ = 0;
		else if (i_108_ > 255)
		    i_108_ = 255;
		int i_109_ = anIntArray9308[i_107_] >> 8 & 0xff;
		i_109_ += i_105_;
		if (i_109_ < 0)
		    i_109_ = 0;
		else if (i_109_ > 255)
		    i_109_ = 255;
		int i_110_ = anIntArray9308[i_107_] >> 0 & 0xff;
		i_110_ += i_106_;
		if (i_110_ < 0)
		    i_110_ = 0;
		else if (i_110_ > 255)
		    i_110_ = 255;
		anIntArray9308[i_107_] = i_108_ << 16 | i_109_ << 8 | i_110_;
	    }
	}
    }
    
    public int method2741(int i, int i_111_) {
	return (anIntArray9308
		[(aByteArray9309[i + i_111_ * ((Class108_Sub2) this).anInt9304]
		  & 0xff)]);
    }
    
    public int method2723() {
	return anInt9302;
    }
    
    public int method2728() {
	return anInt9306;
    }
    
    public boolean method2750() {
	return aByteArray9310 != null;
    }
    
    public boolean method2713() {
	return aByteArray9310 != null;
    }
    
    public int method2714() {
	return ((Class108_Sub2) this).anInt9304;
    }
    
    public int method2715() {
	return ((Class108_Sub2) this).anInt9303;
    }
    
    public int method2711() {
	return ((Class108_Sub2) this).anInt9303;
    }
    
    public int method2717() {
	return ((Class108_Sub2) this).anInt9303;
    }
    
    public int method2718() {
	return ((Class108_Sub2) this).anInt9303;
    }
    
    public void method2729(int i) {
	int i_112_ = getHeight();
	int i_113_ = getWidth();
	if (((Class108_Sub2) this).anInt9304 != i_112_
	    || ((Class108_Sub2) this).anInt9303 != i_113_) {
	    int i_114_ = i;
	    if (i_114_ > anInt9302)
		i_114_ = anInt9302;
	    int i_115_ = i;
	    if (i_115_ + anInt9302 + ((Class108_Sub2) this).anInt9304 > i_112_)
		i_115_ = i_112_ - anInt9302 - ((Class108_Sub2) this).anInt9304;
	    int i_116_ = i;
	    if (i_116_ > anInt9306)
		i_116_ = anInt9306;
	    int i_117_ = i;
	    if (i_117_ + anInt9306 + ((Class108_Sub2) this).anInt9303 > i_113_)
		i_117_ = i_113_ - anInt9306 - ((Class108_Sub2) this).anInt9303;
	    int i_118_ = ((Class108_Sub2) this).anInt9304 + i_114_ + i_115_;
	    int i_119_ = ((Class108_Sub2) this).anInt9303 + i_116_ + i_117_;
	    byte[] is = new byte[i_118_ * i_119_];
	    if (aByteArray9310 == null) {
		for (int i_120_ = 0; i_120_ < ((Class108_Sub2) this).anInt9303;
		     i_120_++) {
		    int i_121_ = i_120_ * ((Class108_Sub2) this).anInt9304;
		    int i_122_ = (i_120_ + i_116_) * i_118_ + i_114_;
		    for (int i_123_ = 0;
			 i_123_ < ((Class108_Sub2) this).anInt9304; i_123_++)
			is[i_122_++] = aByteArray9309[i_121_++];
		}
	    } else {
		byte[] is_124_ = new byte[i_118_ * i_119_];
		for (int i_125_ = 0; i_125_ < ((Class108_Sub2) this).anInt9303;
		     i_125_++) {
		    int i_126_ = i_125_ * ((Class108_Sub2) this).anInt9304;
		    int i_127_ = (i_125_ + i_116_) * i_118_ + i_114_;
		    for (int i_128_ = 0;
			 i_128_ < ((Class108_Sub2) this).anInt9304; i_128_++) {
			is_124_[i_127_] = aByteArray9310[i_126_];
			is[i_127_++] = aByteArray9309[i_126_++];
		    }
		}
		aByteArray9310 = is_124_;
	    }
	    anInt9302 -= i_114_;
	    anInt9306 -= i_116_;
	    ((Class108_Sub2) this).anInt9307 -= i_115_;
	    ((Class108_Sub2) this).anInt9305 -= i_117_;
	    ((Class108_Sub2) this).anInt9304 = i_118_;
	    ((Class108_Sub2) this).anInt9303 = i_119_;
	    aByteArray9309 = is;
	}
    }
    
    public int method2720() {
	return (((Class108_Sub2) this).anInt9304 + anInt9302
		+ ((Class108_Sub2) this).anInt9307);
    }
    
    public void method2701(int i) {
	int i_129_ = -1;
	if (anIntArray9308.length < 255) {
	    for (int i_130_ = 0; i_130_ < anIntArray9308.length; i_130_++) {
		if (anIntArray9308[i_130_] == i) {
		    i_129_ = i_130_;
		    break;
		}
	    }
	    if (i_129_ == -1) {
		i_129_ = anIntArray9308.length;
		int[] is = new int[anIntArray9308.length + 1];
		System.arraycopy(anIntArray9308, 0, is, 0,
				 anIntArray9308.length);
		anIntArray9308 = is;
		is[i_129_] = i;
	    }
	} else {
	    int i_131_ = 2147483647;
	    int i_132_ = i >> 16 & 0xff;
	    int i_133_ = i >> 8 & 0xff;
	    int i_134_ = i & 0xff;
	    for (int i_135_ = 0; i_135_ < anIntArray9308.length; i_135_++) {
		int i_136_ = anIntArray9308[i_135_];
		int i_137_ = i_136_ >> 16 & 0xff;
		int i_138_ = i_136_ >> 8 & 0xff;
		int i_139_ = i_136_ & 0xff;
		int i_140_ = i_132_ - i_137_;
		if (i_140_ < 0)
		    i_140_ = -i_140_;
		int i_141_ = i_133_ - i_138_;
		if (i_141_ < 0)
		    i_141_ = -i_141_;
		int i_142_ = i_134_ - i_139_;
		if (i_142_ < 0)
		    i_142_ = -i_142_;
		int i_143_ = i_140_ + i_141_ + i_142_;
		if (i_143_ < i_131_) {
		    i_131_ = i_143_;
		    i_129_ = i_135_;
		}
	    }
	}
	int i_144_ = 0;
	byte[] is = new byte[(((Class108_Sub2) this).anInt9304
			      * ((Class108_Sub2) this).anInt9303)];
	for (int i_145_ = 0; i_145_ < ((Class108_Sub2) this).anInt9303;
	     i_145_++) {
	    for (int i_146_ = 0; i_146_ < ((Class108_Sub2) this).anInt9304;
		 i_146_++) {
		int i_147_ = aByteArray9309[i_144_] & 0xff;
		if (anIntArray9308[i_147_] == 0) {
		    if (i_146_ > 0
			&& (anIntArray9308[aByteArray9309[i_144_ - 1] & 0xff]
			    != 0))
			i_147_ = i_129_;
		    else if (i_145_ > 0
			     && (anIntArray9308
				 [(aByteArray9309[i_144_ - ((Class108_Sub2)
							    this).anInt9304]
				   & 0xff)]) != 0)
			i_147_ = i_129_;
		    else if (i_146_ < ((Class108_Sub2) this).anInt9304 - 1
			     && (anIntArray9308
				 [aByteArray9309[i_144_ + 1] & 0xff]) != 0)
			i_147_ = i_129_;
		    else if (i_145_ < ((Class108_Sub2) this).anInt9303 - 1
			     && (anIntArray9308
				 [(aByteArray9309[i_144_ + ((Class108_Sub2)
							    this).anInt9304]
				   & 0xff)]) != 0)
			i_147_ = i_129_;
		}
		is[i_144_++] = (byte) i_147_;
	    }
	}
	aByteArray9309 = is;
    }
    
    public void method2738() {
	byte[] is = aByteArray9309;
	if (aByteArray9310 == null) {
	    for (int i = (((Class108_Sub2) this).anInt9303 >> 1) - 1; i >= 0;
		 i--) {
		int i_148_ = i * ((Class108_Sub2) this).anInt9304;
		int i_149_ = ((((Class108_Sub2) this).anInt9303 - i - 1)
			      * ((Class108_Sub2) this).anInt9304);
		for (int i_150_ = -((Class108_Sub2) this).anInt9304;
		     i_150_ < 0; i_150_++) {
		    byte i_151_ = is[i_148_];
		    is[i_148_] = is[i_149_];
		    is[i_149_] = i_151_;
		    i_148_++;
		    i_149_++;
		}
	    }
	} else {
	    byte[] is_152_ = aByteArray9310;
	    for (int i = (((Class108_Sub2) this).anInt9303 >> 1) - 1; i >= 0;
		 i--) {
		int i_153_ = i * ((Class108_Sub2) this).anInt9304;
		int i_154_ = ((((Class108_Sub2) this).anInt9303 - i - 1)
			      * ((Class108_Sub2) this).anInt9304);
		for (int i_155_ = -((Class108_Sub2) this).anInt9304;
		     i_155_ < 0; i_155_++) {
		    byte i_156_ = is[i_153_];
		    is[i_153_] = is[i_154_];
		    is[i_154_] = i_156_;
		    i_156_ = is_152_[i_153_];
		    is_152_[i_153_] = is_152_[i_154_];
		    is_152_[i_154_] = i_156_;
		    i_153_++;
		    i_154_++;
		}
	    }
	}
	int i = anInt9306;
	anInt9306 = ((Class108_Sub2) this).anInt9305;
	((Class108_Sub2) this).anInt9305 = i;
    }
    
    public void method2706() {
	byte[] is = new byte[(((Class108_Sub2) this).anInt9304
			      * ((Class108_Sub2) this).anInt9303)];
	int i = 0;
	if (aByteArray9310 == null) {
	    for (int i_157_ = 0; i_157_ < ((Class108_Sub2) this).anInt9304;
		 i_157_++) {
		for (int i_158_ = ((Class108_Sub2) this).anInt9303 - 1;
		     i_158_ >= 0; i_158_--)
		    is[i++]
			= aByteArray9309[i_157_ + i_158_ * ((Class108_Sub2)
							    this).anInt9304];
	    }
	    aByteArray9309 = is;
	} else {
	    byte[] is_159_ = new byte[(((Class108_Sub2) this).anInt9304
				       * ((Class108_Sub2) this).anInt9303)];
	    for (int i_160_ = 0; i_160_ < ((Class108_Sub2) this).anInt9304;
		 i_160_++) {
		for (int i_161_ = ((Class108_Sub2) this).anInt9303 - 1;
		     i_161_ >= 0; i_161_--) {
		    is[i] = aByteArray9309[i_160_ + i_161_ * ((Class108_Sub2)
							      this).anInt9304];
		    is_159_[i++]
			= aByteArray9310[i_160_ + i_161_ * ((Class108_Sub2)
							    this).anInt9304];
		}
	    }
	    aByteArray9309 = is;
	    aByteArray9310 = is_159_;
	}
	int i_162_ = anInt9306;
	anInt9306 = anInt9302;
	anInt9302 = ((Class108_Sub2) this).anInt9305;
	((Class108_Sub2) this).anInt9305 = ((Class108_Sub2) this).anInt9307;
	((Class108_Sub2) this).anInt9307 = i_162_;
	i_162_ = ((Class108_Sub2) this).anInt9303;
	((Class108_Sub2) this).anInt9303 = ((Class108_Sub2) this).anInt9304;
	((Class108_Sub2) this).anInt9304 = i_162_;
    }
    
    public int method2703() {
	return anInt9302;
    }
    
    public int method2725() {
	return anInt9302;
    }
    
    public int method2719() {
	return ((Class108_Sub2) this).anInt9303;
    }
    
    public int method2727() {
	return anInt9306;
    }
    
    public int method2726() {
	return ((Class108_Sub2) this).anInt9307;
    }
    
    public int method2690() {
	return ((Class108_Sub2) this).anInt9305;
    }
    
    public int method2730() {
	return ((Class108_Sub2) this).anInt9305;
    }
    
    Class108_Sub2() {
	/* empty */
    }
    
    public void method2732() {
	((Class108_Sub2) this).anInt9305 = 0;
	anInt9306 = 0;
	((Class108_Sub2) this).anInt9307 = 0;
	anInt9302 = 0;
    }
    
    public int method2697() {
	return anInt9306;
    }
    
    public int method2694() {
	return ((Class108_Sub2) this).anInt9303;
    }
    
    public void method2743(int i) {
	int i_163_ = getHeight();
	int i_164_ = getWidth();
	if (((Class108_Sub2) this).anInt9304 != i_163_
	    || ((Class108_Sub2) this).anInt9303 != i_164_) {
	    int i_165_ = i;
	    if (i_165_ > anInt9302)
		i_165_ = anInt9302;
	    int i_166_ = i;
	    if (i_166_ + anInt9302 + ((Class108_Sub2) this).anInt9304 > i_163_)
		i_166_ = i_163_ - anInt9302 - ((Class108_Sub2) this).anInt9304;
	    int i_167_ = i;
	    if (i_167_ > anInt9306)
		i_167_ = anInt9306;
	    int i_168_ = i;
	    if (i_168_ + anInt9306 + ((Class108_Sub2) this).anInt9303 > i_164_)
		i_168_ = i_164_ - anInt9306 - ((Class108_Sub2) this).anInt9303;
	    int i_169_ = ((Class108_Sub2) this).anInt9304 + i_165_ + i_166_;
	    int i_170_ = ((Class108_Sub2) this).anInt9303 + i_167_ + i_168_;
	    byte[] is = new byte[i_169_ * i_170_];
	    if (aByteArray9310 == null) {
		for (int i_171_ = 0; i_171_ < ((Class108_Sub2) this).anInt9303;
		     i_171_++) {
		    int i_172_ = i_171_ * ((Class108_Sub2) this).anInt9304;
		    int i_173_ = (i_171_ + i_167_) * i_169_ + i_165_;
		    for (int i_174_ = 0;
			 i_174_ < ((Class108_Sub2) this).anInt9304; i_174_++)
			is[i_173_++] = aByteArray9309[i_172_++];
		}
	    } else {
		byte[] is_175_ = new byte[i_169_ * i_170_];
		for (int i_176_ = 0; i_176_ < ((Class108_Sub2) this).anInt9303;
		     i_176_++) {
		    int i_177_ = i_176_ * ((Class108_Sub2) this).anInt9304;
		    int i_178_ = (i_176_ + i_167_) * i_169_ + i_165_;
		    for (int i_179_ = 0;
			 i_179_ < ((Class108_Sub2) this).anInt9304; i_179_++) {
			is_175_[i_178_] = aByteArray9310[i_177_];
			is[i_178_++] = aByteArray9309[i_177_++];
		    }
		}
		aByteArray9310 = is_175_;
	    }
	    anInt9302 -= i_165_;
	    anInt9306 -= i_167_;
	    ((Class108_Sub2) this).anInt9307 -= i_166_;
	    ((Class108_Sub2) this).anInt9305 -= i_168_;
	    ((Class108_Sub2) this).anInt9304 = i_169_;
	    ((Class108_Sub2) this).anInt9303 = i_170_;
	    aByteArray9309 = is;
	}
    }
    
    public int method2721() {
	return (((Class108_Sub2) this).anInt9303 + anInt9306
		+ ((Class108_Sub2) this).anInt9305);
    }
    
    public void method2737(int i) {
	int i_180_ = getHeight();
	int i_181_ = getWidth();
	if (((Class108_Sub2) this).anInt9304 != i_180_
	    || ((Class108_Sub2) this).anInt9303 != i_181_) {
	    int i_182_ = i;
	    if (i_182_ > anInt9302)
		i_182_ = anInt9302;
	    int i_183_ = i;
	    if (i_183_ + anInt9302 + ((Class108_Sub2) this).anInt9304 > i_180_)
		i_183_ = i_180_ - anInt9302 - ((Class108_Sub2) this).anInt9304;
	    int i_184_ = i;
	    if (i_184_ > anInt9306)
		i_184_ = anInt9306;
	    int i_185_ = i;
	    if (i_185_ + anInt9306 + ((Class108_Sub2) this).anInt9303 > i_181_)
		i_185_ = i_181_ - anInt9306 - ((Class108_Sub2) this).anInt9303;
	    int i_186_ = ((Class108_Sub2) this).anInt9304 + i_182_ + i_183_;
	    int i_187_ = ((Class108_Sub2) this).anInt9303 + i_184_ + i_185_;
	    byte[] is = new byte[i_186_ * i_187_];
	    if (aByteArray9310 == null) {
		for (int i_188_ = 0; i_188_ < ((Class108_Sub2) this).anInt9303;
		     i_188_++) {
		    int i_189_ = i_188_ * ((Class108_Sub2) this).anInt9304;
		    int i_190_ = (i_188_ + i_184_) * i_186_ + i_182_;
		    for (int i_191_ = 0;
			 i_191_ < ((Class108_Sub2) this).anInt9304; i_191_++)
			is[i_190_++] = aByteArray9309[i_189_++];
		}
	    } else {
		byte[] is_192_ = new byte[i_186_ * i_187_];
		for (int i_193_ = 0; i_193_ < ((Class108_Sub2) this).anInt9303;
		     i_193_++) {
		    int i_194_ = i_193_ * ((Class108_Sub2) this).anInt9304;
		    int i_195_ = (i_193_ + i_184_) * i_186_ + i_182_;
		    for (int i_196_ = 0;
			 i_196_ < ((Class108_Sub2) this).anInt9304; i_196_++) {
			is_192_[i_195_] = aByteArray9310[i_194_];
			is[i_195_++] = aByteArray9309[i_194_++];
		    }
		}
		aByteArray9310 = is_192_;
	    }
	    anInt9302 -= i_182_;
	    anInt9306 -= i_184_;
	    ((Class108_Sub2) this).anInt9307 -= i_183_;
	    ((Class108_Sub2) this).anInt9305 -= i_185_;
	    ((Class108_Sub2) this).anInt9304 = i_186_;
	    ((Class108_Sub2) this).anInt9303 = i_187_;
	    aByteArray9309 = is;
	}
    }
    
    public void method2699(int i) {
	int i_197_ = -1;
	if (anIntArray9308.length < 255) {
	    for (int i_198_ = 0; i_198_ < anIntArray9308.length; i_198_++) {
		if (anIntArray9308[i_198_] == i) {
		    i_197_ = i_198_;
		    break;
		}
	    }
	    if (i_197_ == -1) {
		i_197_ = anIntArray9308.length;
		int[] is = new int[anIntArray9308.length + 1];
		System.arraycopy(anIntArray9308, 0, is, 0,
				 anIntArray9308.length);
		anIntArray9308 = is;
		is[i_197_] = i;
	    }
	} else {
	    int i_199_ = 2147483647;
	    int i_200_ = i >> 16 & 0xff;
	    int i_201_ = i >> 8 & 0xff;
	    int i_202_ = i & 0xff;
	    for (int i_203_ = 0; i_203_ < anIntArray9308.length; i_203_++) {
		int i_204_ = anIntArray9308[i_203_];
		int i_205_ = i_204_ >> 16 & 0xff;
		int i_206_ = i_204_ >> 8 & 0xff;
		int i_207_ = i_204_ & 0xff;
		int i_208_ = i_200_ - i_205_;
		if (i_208_ < 0)
		    i_208_ = -i_208_;
		int i_209_ = i_201_ - i_206_;
		if (i_209_ < 0)
		    i_209_ = -i_209_;
		int i_210_ = i_202_ - i_207_;
		if (i_210_ < 0)
		    i_210_ = -i_210_;
		int i_211_ = i_208_ + i_209_ + i_210_;
		if (i_211_ < i_199_) {
		    i_199_ = i_211_;
		    i_197_ = i_203_;
		}
	    }
	}
	int i_212_ = 0;
	byte[] is = new byte[(((Class108_Sub2) this).anInt9304
			      * ((Class108_Sub2) this).anInt9303)];
	for (int i_213_ = 0; i_213_ < ((Class108_Sub2) this).anInt9303;
	     i_213_++) {
	    for (int i_214_ = 0; i_214_ < ((Class108_Sub2) this).anInt9304;
		 i_214_++) {
		int i_215_ = aByteArray9309[i_212_] & 0xff;
		if (anIntArray9308[i_215_] == 0) {
		    if (i_214_ > 0
			&& (anIntArray9308[aByteArray9309[i_212_ - 1] & 0xff]
			    != 0))
			i_215_ = i_197_;
		    else if (i_213_ > 0
			     && (anIntArray9308
				 [(aByteArray9309[i_212_ - ((Class108_Sub2)
							    this).anInt9304]
				   & 0xff)]) != 0)
			i_215_ = i_197_;
		    else if (i_214_ < ((Class108_Sub2) this).anInt9304 - 1
			     && (anIntArray9308
				 [aByteArray9309[i_212_ + 1] & 0xff]) != 0)
			i_215_ = i_197_;
		    else if (i_213_ < ((Class108_Sub2) this).anInt9303 - 1
			     && (anIntArray9308
				 [(aByteArray9309[i_212_ + ((Class108_Sub2)
							    this).anInt9304]
				   & 0xff)]) != 0)
			i_215_ = i_197_;
		}
		is[i_212_++] = (byte) i_215_;
	    }
	}
	aByteArray9309 = is;
    }
    
    public void method2739(int i) {
	int i_216_ = -1;
	if (anIntArray9308.length < 255) {
	    for (int i_217_ = 0; i_217_ < anIntArray9308.length; i_217_++) {
		if (anIntArray9308[i_217_] == i) {
		    i_216_ = i_217_;
		    break;
		}
	    }
	    if (i_216_ == -1) {
		i_216_ = anIntArray9308.length;
		int[] is = new int[anIntArray9308.length + 1];
		System.arraycopy(anIntArray9308, 0, is, 0,
				 anIntArray9308.length);
		anIntArray9308 = is;
		is[i_216_] = i;
	    }
	} else {
	    int i_218_ = 2147483647;
	    int i_219_ = i >> 16 & 0xff;
	    int i_220_ = i >> 8 & 0xff;
	    int i_221_ = i & 0xff;
	    for (int i_222_ = 0; i_222_ < anIntArray9308.length; i_222_++) {
		int i_223_ = anIntArray9308[i_222_];
		int i_224_ = i_223_ >> 16 & 0xff;
		int i_225_ = i_223_ >> 8 & 0xff;
		int i_226_ = i_223_ & 0xff;
		int i_227_ = i_219_ - i_224_;
		if (i_227_ < 0)
		    i_227_ = -i_227_;
		int i_228_ = i_220_ - i_225_;
		if (i_228_ < 0)
		    i_228_ = -i_228_;
		int i_229_ = i_221_ - i_226_;
		if (i_229_ < 0)
		    i_229_ = -i_229_;
		int i_230_ = i_227_ + i_228_ + i_229_;
		if (i_230_ < i_218_) {
		    i_218_ = i_230_;
		    i_216_ = i_222_;
		}
	    }
	}
	int i_231_ = 0;
	byte[] is = new byte[(((Class108_Sub2) this).anInt9304
			      * ((Class108_Sub2) this).anInt9303)];
	for (int i_232_ = 0; i_232_ < ((Class108_Sub2) this).anInt9303;
	     i_232_++) {
	    for (int i_233_ = 0; i_233_ < ((Class108_Sub2) this).anInt9304;
		 i_233_++) {
		int i_234_ = aByteArray9309[i_231_] & 0xff;
		if (anIntArray9308[i_234_] == 0) {
		    if (i_233_ > 0
			&& (anIntArray9308[aByteArray9309[i_231_ - 1] & 0xff]
			    != 0))
			i_234_ = i_216_;
		    else if (i_232_ > 0
			     && (anIntArray9308
				 [(aByteArray9309[i_231_ - ((Class108_Sub2)
							    this).anInt9304]
				   & 0xff)]) != 0)
			i_234_ = i_216_;
		    else if (i_233_ < ((Class108_Sub2) this).anInt9304 - 1
			     && (anIntArray9308
				 [aByteArray9309[i_231_ + 1] & 0xff]) != 0)
			i_234_ = i_216_;
		    else if (i_232_ < ((Class108_Sub2) this).anInt9303 - 1
			     && (anIntArray9308
				 [(aByteArray9309[i_231_ + ((Class108_Sub2)
							    this).anInt9304]
				   & 0xff)]) != 0)
			i_234_ = i_216_;
		}
		is[i_231_++] = (byte) i_234_;
	    }
	}
	aByteArray9309 = is;
    }
    
    public void method2740(int i) {
	int i_235_ = -1;
	if (anIntArray9308.length < 255) {
	    for (int i_236_ = 0; i_236_ < anIntArray9308.length; i_236_++) {
		if (anIntArray9308[i_236_] == i) {
		    i_235_ = i_236_;
		    break;
		}
	    }
	    if (i_235_ == -1) {
		i_235_ = anIntArray9308.length;
		int[] is = new int[anIntArray9308.length + 1];
		System.arraycopy(anIntArray9308, 0, is, 0,
				 anIntArray9308.length);
		anIntArray9308 = is;
		is[i_235_] = i;
	    }
	} else {
	    int i_237_ = 2147483647;
	    int i_238_ = i >> 16 & 0xff;
	    int i_239_ = i >> 8 & 0xff;
	    int i_240_ = i & 0xff;
	    for (int i_241_ = 0; i_241_ < anIntArray9308.length; i_241_++) {
		int i_242_ = anIntArray9308[i_241_];
		int i_243_ = i_242_ >> 16 & 0xff;
		int i_244_ = i_242_ >> 8 & 0xff;
		int i_245_ = i_242_ & 0xff;
		int i_246_ = i_238_ - i_243_;
		if (i_246_ < 0)
		    i_246_ = -i_246_;
		int i_247_ = i_239_ - i_244_;
		if (i_247_ < 0)
		    i_247_ = -i_247_;
		int i_248_ = i_240_ - i_245_;
		if (i_248_ < 0)
		    i_248_ = -i_248_;
		int i_249_ = i_246_ + i_247_ + i_248_;
		if (i_249_ < i_237_) {
		    i_237_ = i_249_;
		    i_235_ = i_241_;
		}
	    }
	}
	for (int i_250_ = ((Class108_Sub2) this).anInt9303 - 1; i_250_ > 0;
	     i_250_--) {
	    int i_251_ = i_250_ * ((Class108_Sub2) this).anInt9304;
	    for (int i_252_ = ((Class108_Sub2) this).anInt9304 - 1; i_252_ > 0;
		 i_252_--) {
		if (anIntArray9308[aByteArray9309[i_252_ + i_251_] & 0xff] == 0
		    && (anIntArray9308
			[(aByteArray9309[(i_252_ + i_251_ - 1
					  - ((Class108_Sub2) this).anInt9304)]
			  & 0xff)]) != 0)
		    aByteArray9309[i_252_ + i_251_] = (byte) i_235_;
	    }
	}
    }
    
    public void method2716(int i) {
	int i_253_ = -1;
	if (anIntArray9308.length < 255) {
	    for (int i_254_ = 0; i_254_ < anIntArray9308.length; i_254_++) {
		if (anIntArray9308[i_254_] == i) {
		    i_253_ = i_254_;
		    break;
		}
	    }
	    if (i_253_ == -1) {
		i_253_ = anIntArray9308.length;
		int[] is = new int[anIntArray9308.length + 1];
		System.arraycopy(anIntArray9308, 0, is, 0,
				 anIntArray9308.length);
		anIntArray9308 = is;
		is[i_253_] = i;
	    }
	} else {
	    int i_255_ = 2147483647;
	    int i_256_ = i >> 16 & 0xff;
	    int i_257_ = i >> 8 & 0xff;
	    int i_258_ = i & 0xff;
	    for (int i_259_ = 0; i_259_ < anIntArray9308.length; i_259_++) {
		int i_260_ = anIntArray9308[i_259_];
		int i_261_ = i_260_ >> 16 & 0xff;
		int i_262_ = i_260_ >> 8 & 0xff;
		int i_263_ = i_260_ & 0xff;
		int i_264_ = i_256_ - i_261_;
		if (i_264_ < 0)
		    i_264_ = -i_264_;
		int i_265_ = i_257_ - i_262_;
		if (i_265_ < 0)
		    i_265_ = -i_265_;
		int i_266_ = i_258_ - i_263_;
		if (i_266_ < 0)
		    i_266_ = -i_266_;
		int i_267_ = i_264_ + i_265_ + i_266_;
		if (i_267_ < i_255_) {
		    i_255_ = i_267_;
		    i_253_ = i_259_;
		}
	    }
	}
	for (int i_268_ = ((Class108_Sub2) this).anInt9303 - 1; i_268_ > 0;
	     i_268_--) {
	    int i_269_ = i_268_ * ((Class108_Sub2) this).anInt9304;
	    for (int i_270_ = ((Class108_Sub2) this).anInt9304 - 1; i_270_ > 0;
		 i_270_--) {
		if (anIntArray9308[aByteArray9309[i_270_ + i_269_] & 0xff] == 0
		    && (anIntArray9308
			[(aByteArray9309[(i_270_ + i_269_ - 1
					  - ((Class108_Sub2) this).anInt9304)]
			  & 0xff)]) != 0)
		    aByteArray9309[i_270_ + i_269_] = (byte) i_253_;
	    }
	}
    }
    
    public boolean method2692() {
	return aByteArray9310 != null;
    }
    
    public void method2731() {
	((Class108_Sub2) this).anInt9305 = 0;
	anInt9306 = 0;
	((Class108_Sub2) this).anInt9307 = 0;
	anInt9302 = 0;
    }
    
    public void method2744() {
	byte[] is = aByteArray9309;
	if (aByteArray9310 == null) {
	    for (int i = (((Class108_Sub2) this).anInt9303 >> 1) - 1; i >= 0;
		 i--) {
		int i_271_ = i * ((Class108_Sub2) this).anInt9304;
		int i_272_ = ((((Class108_Sub2) this).anInt9303 - i - 1)
			      * ((Class108_Sub2) this).anInt9304);
		for (int i_273_ = -((Class108_Sub2) this).anInt9304;
		     i_273_ < 0; i_273_++) {
		    byte i_274_ = is[i_271_];
		    is[i_271_] = is[i_272_];
		    is[i_272_] = i_274_;
		    i_271_++;
		    i_272_++;
		}
	    }
	} else {
	    byte[] is_275_ = aByteArray9310;
	    for (int i = (((Class108_Sub2) this).anInt9303 >> 1) - 1; i >= 0;
		 i--) {
		int i_276_ = i * ((Class108_Sub2) this).anInt9304;
		int i_277_ = ((((Class108_Sub2) this).anInt9303 - i - 1)
			      * ((Class108_Sub2) this).anInt9304);
		for (int i_278_ = -((Class108_Sub2) this).anInt9304;
		     i_278_ < 0; i_278_++) {
		    byte i_279_ = is[i_276_];
		    is[i_276_] = is[i_277_];
		    is[i_277_] = i_279_;
		    i_279_ = is_275_[i_276_];
		    is_275_[i_276_] = is_275_[i_277_];
		    is_275_[i_277_] = i_279_;
		    i_276_++;
		    i_277_++;
		}
	    }
	}
	int i = anInt9306;
	anInt9306 = ((Class108_Sub2) this).anInt9305;
	((Class108_Sub2) this).anInt9305 = i;
    }
    
    public void method2745() {
	byte[] is = aByteArray9309;
	if (aByteArray9310 == null) {
	    for (int i = (((Class108_Sub2) this).anInt9303 >> 1) - 1; i >= 0;
		 i--) {
		int i_280_ = i * ((Class108_Sub2) this).anInt9304;
		int i_281_ = ((((Class108_Sub2) this).anInt9303 - i - 1)
			      * ((Class108_Sub2) this).anInt9304);
		for (int i_282_ = -((Class108_Sub2) this).anInt9304;
		     i_282_ < 0; i_282_++) {
		    byte i_283_ = is[i_280_];
		    is[i_280_] = is[i_281_];
		    is[i_281_] = i_283_;
		    i_280_++;
		    i_281_++;
		}
	    }
	} else {
	    byte[] is_284_ = aByteArray9310;
	    for (int i = (((Class108_Sub2) this).anInt9303 >> 1) - 1; i >= 0;
		 i--) {
		int i_285_ = i * ((Class108_Sub2) this).anInt9304;
		int i_286_ = ((((Class108_Sub2) this).anInt9303 - i - 1)
			      * ((Class108_Sub2) this).anInt9304);
		for (int i_287_ = -((Class108_Sub2) this).anInt9304;
		     i_287_ < 0; i_287_++) {
		    byte i_288_ = is[i_285_];
		    is[i_285_] = is[i_286_];
		    is[i_286_] = i_288_;
		    i_288_ = is_284_[i_285_];
		    is_284_[i_285_] = is_284_[i_286_];
		    is_284_[i_286_] = i_288_;
		    i_285_++;
		    i_286_++;
		}
	    }
	}
	int i = anInt9306;
	anInt9306 = ((Class108_Sub2) this).anInt9305;
	((Class108_Sub2) this).anInt9305 = i;
    }
    
    public int[] method2746(boolean bool) {
	int[] is;
	if (bool) {
	    int i = getHeight();
	    is = new int[i * getWidth()];
	    if (aByteArray9310 != null) {
		for (int i_289_ = 0; i_289_ < ((Class108_Sub2) this).anInt9303;
		     i_289_++) {
		    int i_290_ = i_289_ * ((Class108_Sub2) this).anInt9304;
		    int i_291_ = anInt9302 + (i_289_ + anInt9306) * i;
		    for (int i_292_ = 0;
			 i_292_ < ((Class108_Sub2) this).anInt9304; i_292_++) {
			is[i_291_++] = (aByteArray9310[i_290_] << 24
					| (anIntArray9308
					   [aByteArray9309[i_290_] & 0xff]));
			i_290_++;
		    }
		}
	    } else {
		for (int i_293_ = 0; i_293_ < ((Class108_Sub2) this).anInt9303;
		     i_293_++) {
		    int i_294_ = i_293_ * ((Class108_Sub2) this).anInt9304;
		    int i_295_ = anInt9302 + (i_293_ + anInt9306) * i;
		    for (int i_296_ = 0;
			 i_296_ < ((Class108_Sub2) this).anInt9304; i_296_++) {
			int i_297_
			    = anIntArray9308[aByteArray9309[i_294_++] & 0xff];
			if (i_297_ != 0)
			    is[i_295_++] = ~0xffffff | i_297_;
			else
			    is[i_295_++] = 0;
		    }
		}
	    }
	} else {
	    is = new int[(((Class108_Sub2) this).anInt9304
			  * ((Class108_Sub2) this).anInt9303)];
	    int i = 0;
	    int i_298_ = 0;
	    if (aByteArray9310 != null) {
		for (int i_299_ = 0; i_299_ < ((Class108_Sub2) this).anInt9303;
		     i_299_++) {
		    for (int i_300_ = 0;
			 i_300_ < ((Class108_Sub2) this).anInt9304; i_300_++) {
			is[i_298_++]
			    = (aByteArray9310[i] << 24
			       | anIntArray9308[aByteArray9309[i] & 0xff]);
			i++;
		    }
		}
	    } else {
		for (int i_301_ = 0; i_301_ < ((Class108_Sub2) this).anInt9303;
		     i_301_++) {
		    for (int i_302_ = 0;
			 i_302_ < ((Class108_Sub2) this).anInt9304; i_302_++) {
			int i_303_
			    = anIntArray9308[aByteArray9309[i++] & 0xff];
			is[i_298_++] = i_303_ != 0 ? ~0xffffff | i_303_ : 0;
		    }
		}
	    }
	}
	return is;
    }
    
    public void method2733() {
	((Class108_Sub2) this).anInt9305 = 0;
	anInt9306 = 0;
	((Class108_Sub2) this).anInt9307 = 0;
	anInt9302 = 0;
    }
    
    public void method2748(int i, int i_304_, int i_305_) {
	for (int i_306_ = 1; i_306_ < anIntArray9308.length; i_306_++) {
	    if (anIntArray9308[i_306_] != 1
		&& anIntArray9308[i_306_] != 16711935) {
		int i_307_ = anIntArray9308[i_306_] >> 16 & 0xff;
		i_307_ += i;
		if (i_307_ < 0)
		    i_307_ = 0;
		else if (i_307_ > 255)
		    i_307_ = 255;
		int i_308_ = anIntArray9308[i_306_] >> 8 & 0xff;
		i_308_ += i_304_;
		if (i_308_ < 0)
		    i_308_ = 0;
		else if (i_308_ > 255)
		    i_308_ = 255;
		int i_309_ = anIntArray9308[i_306_] >> 0 & 0xff;
		i_309_ += i_305_;
		if (i_309_ < 0)
		    i_309_ = 0;
		else if (i_309_ > 255)
		    i_309_ = 255;
		anIntArray9308[i_306_] = i_307_ << 16 | i_308_ << 8 | i_309_;
	    }
	}
    }
    
    public void method2749(int i, int i_310_, int i_311_) {
	for (int i_312_ = 1; i_312_ < anIntArray9308.length; i_312_++) {
	    if (anIntArray9308[i_312_] != 1
		&& anIntArray9308[i_312_] != 16711935) {
		int i_313_ = anIntArray9308[i_312_] >> 16 & 0xff;
		i_313_ += i;
		if (i_313_ < 0)
		    i_313_ = 0;
		else if (i_313_ > 255)
		    i_313_ = 255;
		int i_314_ = anIntArray9308[i_312_] >> 8 & 0xff;
		i_314_ += i_310_;
		if (i_314_ < 0)
		    i_314_ = 0;
		else if (i_314_ > 255)
		    i_314_ = 255;
		int i_315_ = anIntArray9308[i_312_] >> 0 & 0xff;
		i_315_ += i_311_;
		if (i_315_ < 0)
		    i_315_ = 0;
		else if (i_315_ > 255)
		    i_315_ = 255;
		anIntArray9308[i_312_] = i_313_ << 16 | i_314_ << 8 | i_315_;
	    }
	}
    }
    
    public void method2751(int i, int i_316_, int i_317_) {
	for (int i_318_ = 1; i_318_ < anIntArray9308.length; i_318_++) {
	    if (anIntArray9308[i_318_] != 1
		&& anIntArray9308[i_318_] != 16711935) {
		int i_319_ = anIntArray9308[i_318_] >> 16 & 0xff;
		i_319_ += i;
		if (i_319_ < 0)
		    i_319_ = 0;
		else if (i_319_ > 255)
		    i_319_ = 255;
		int i_320_ = anIntArray9308[i_318_] >> 8 & 0xff;
		i_320_ += i_316_;
		if (i_320_ < 0)
		    i_320_ = 0;
		else if (i_320_ > 255)
		    i_320_ = 255;
		int i_321_ = anIntArray9308[i_318_] >> 0 & 0xff;
		i_321_ += i_317_;
		if (i_321_ < 0)
		    i_321_ = 0;
		else if (i_321_ > 255)
		    i_321_ = 255;
		anIntArray9308[i_318_] = i_319_ << 16 | i_320_ << 8 | i_321_;
	    }
	}
    }
    
    public int method2735(int i, int i_322_) {
	return (anIntArray9308
		[(aByteArray9309[i + i_322_ * ((Class108_Sub2) this).anInt9304]
		  & 0xff)]);
    }
    
    public int method2753(int i, int i_323_) {
	return (anIntArray9308
		[(aByteArray9309[i + i_323_ * ((Class108_Sub2) this).anInt9304]
		  & 0xff)]);
    }
    
    public void method2693() {
	byte[] is = new byte[(((Class108_Sub2) this).anInt9304
			      * ((Class108_Sub2) this).anInt9303)];
	int i = 0;
	if (aByteArray9310 == null) {
	    for (int i_324_ = 0; i_324_ < ((Class108_Sub2) this).anInt9304;
		 i_324_++) {
		for (int i_325_ = ((Class108_Sub2) this).anInt9303 - 1;
		     i_325_ >= 0; i_325_--)
		    is[i++]
			= aByteArray9309[i_324_ + i_325_ * ((Class108_Sub2)
							    this).anInt9304];
	    }
	    aByteArray9309 = is;
	} else {
	    byte[] is_326_ = new byte[(((Class108_Sub2) this).anInt9304
				       * ((Class108_Sub2) this).anInt9303)];
	    for (int i_327_ = 0; i_327_ < ((Class108_Sub2) this).anInt9304;
		 i_327_++) {
		for (int i_328_ = ((Class108_Sub2) this).anInt9303 - 1;
		     i_328_ >= 0; i_328_--) {
		    is[i] = aByteArray9309[i_327_ + i_328_ * ((Class108_Sub2)
							      this).anInt9304];
		    is_326_[i++]
			= aByteArray9310[i_327_ + i_328_ * ((Class108_Sub2)
							    this).anInt9304];
		}
	    }
	    aByteArray9309 = is;
	    aByteArray9310 = is_326_;
	}
	int i_329_ = anInt9306;
	anInt9306 = anInt9302;
	anInt9302 = ((Class108_Sub2) this).anInt9305;
	((Class108_Sub2) this).anInt9305 = ((Class108_Sub2) this).anInt9307;
	((Class108_Sub2) this).anInt9307 = i_329_;
	i_329_ = ((Class108_Sub2) this).anInt9303;
	((Class108_Sub2) this).anInt9303 = ((Class108_Sub2) this).anInt9304;
	((Class108_Sub2) this).anInt9304 = i_329_;
    }
}
