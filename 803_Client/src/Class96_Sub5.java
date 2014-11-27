/* Class96_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub5 extends Class96
{
    int[] anIntArray9663;
    int[] anIntArray9664;
    byte[][] aByteArrayArray9665;
    int[] anIntArray9666;
    int[] anIntArray9667;
    Class103_Sub2 aClass103_Sub2_9668;
    int[] anIntArray9669;
    
    void method2123(char c, int i, int i_0_, int i_1_, boolean bool) {
	if (null
	    != (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		.anIntArray9245)) {
	    i += ((Class96_Sub5) this).anIntArray9669[c];
	    i_0_ += ((Class96_Sub5) this).anIntArray9666[c];
	    int i_2_ = ((Class96_Sub5) this).anIntArray9664[c];
	    int i_3_ = ((Class96_Sub5) this).anIntArray9667[c];
	    int i_4_
		= ((((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		    .anInt9260)
		   * -1826993761);
	    int i_5_ = i_4_ * i_0_ + i;
	    int i_6_ = i_4_ - i_2_;
	    int i_7_ = 0;
	    int i_8_ = 0;
	    if (i_0_
		< (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		   .anInt9254) * -788450385) {
		int i_9_ = ((((Class103_Sub2) (((Class96_Sub5) this)
					       .aClass103_Sub2_9668)).anInt9254
			     * -788450385)
			    - i_0_);
		i_3_ -= i_9_;
		i_0_ = (((Class103_Sub2)
			 ((Class96_Sub5) this).aClass103_Sub2_9668).anInt9254
			* -788450385);
		i_8_ += i_2_ * i_9_;
		i_5_ += i_9_ * i_4_;
	    }
	    if (i_0_ + i_3_
		> (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		   .anInt9252) * 1546170165)
		i_3_ -= i_3_ + i_0_ - (((Class103_Sub2) (((Class96_Sub5) this)
							 .aClass103_Sub2_9668))
				       .anInt9252) * 1546170165;
	    if (i
		< (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		   .anInt9249) * 1298750001) {
		int i_10_ = ((((Class103_Sub2)
			       ((Class96_Sub5) this).aClass103_Sub2_9668)
			      .anInt9249) * 1298750001
			     - i);
		i_2_ -= i_10_;
		i = 1298750001 * (((Class103_Sub2)
				   ((Class96_Sub5) this).aClass103_Sub2_9668)
				  .anInt9249);
		i_8_ += i_10_;
		i_5_ += i_10_;
		i_7_ += i_10_;
		i_6_ += i_10_;
	    }
	    if (i_2_ + i
		> 325436811 * (((Class103_Sub2)
				((Class96_Sub5) this).aClass103_Sub2_9668)
			       .anInt9250)) {
		int i_11_
		    = i_2_ + i - (((Class103_Sub2)
				   ((Class96_Sub5) this).aClass103_Sub2_9668)
				  .anInt9250) * 325436811;
		i_2_ -= i_11_;
		i_7_ += i_11_;
		i_6_ += i_11_;
	    }
	    if (i_2_ > 0 && i_3_ > 0) {
		if (bool)
		    method16036(((Class96_Sub5) this).aByteArrayArray9665[c],
				(((Class103_Sub2)
				  ((Class96_Sub5) this).aClass103_Sub2_9668)
				 .anIntArray9245),
				i_1_, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
		else
		    method16038(((Class96_Sub5) this).aByteArrayArray9665[c],
				(((Class103_Sub2)
				  ((Class96_Sub5) this).aClass103_Sub2_9668)
				 .anIntArray9245),
				((Class96_Sub5) this).anIntArray9663, i_8_,
				i_5_, i_2_, i_3_, i_6_, i_7_);
	    }
	}
    }
    
    void method16034(byte[] is, int[] is_12_, int i, int i_13_, int i_14_,
		     int i_15_, int i_16_, int i_17_, int i_18_) {
	int i_19_ = -(i_15_ >> 2);
	i_15_ = -(i_15_ & 0x3);
	for (int i_20_ = -i_16_; i_20_ < 0; i_20_++) {
	    for (int i_21_ = i_19_; i_21_ < 0; i_21_++) {
		if (is[i_13_++] != 0)
		    is_12_[i_14_++] = i;
		else
		    i_14_++;
		if (is[i_13_++] != 0)
		    is_12_[i_14_++] = i;
		else
		    i_14_++;
		if (is[i_13_++] != 0)
		    is_12_[i_14_++] = i;
		else
		    i_14_++;
		if (is[i_13_++] != 0)
		    is_12_[i_14_++] = i;
		else
		    i_14_++;
	    }
	    for (int i_22_ = i_15_; i_22_ < 0; i_22_++) {
		if (is[i_13_++] != 0)
		    is_12_[i_14_++] = i;
		else
		    i_14_++;
	    }
	    i_14_ += i_17_;
	    i_13_ += i_18_;
	}
    }
    
    void method16035(byte[] is, int[] is_23_, int i, int i_24_, int i_25_,
		     int i_26_, int i_27_, int i_28_, int i_29_, int i_30_,
		     int i_31_, int i_32_, Class135 class135, int i_33_,
		     int i_34_) {
	Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	int[] is_35_ = ((Class135_Sub1) class135_sub1).anIntArray9874;
	int[] is_36_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	int i_37_
	    = (i_30_
	       - (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		  .anInt9249) * 1298750001);
	int i_38_ = i_31_;
	if (i_34_ > i_38_) {
	    i_38_ = i_34_;
	    i_25_ += (i_34_ - i_31_) * (-1826993761
					* ((Class103_Sub2)
					   (((Class96_Sub5) this)
					    .aClass103_Sub2_9668)).anInt9260);
	    i_24_ += (i_34_ - i_31_) * i_32_;
	}
	int i_39_ = (i_34_ + is_35_.length < i_27_ + i_31_
		     ? i_34_ + is_35_.length : i_27_ + i_31_);
	for (int i_40_ = i_38_; i_40_ < i_39_; i_40_++) {
	    int i_41_ = i_33_ + is_35_[i_40_ - i_34_];
	    int i_42_ = is_36_[i_40_ - i_34_];
	    int i_43_ = i_26_;
	    if (i_37_ > i_41_) {
		int i_44_ = i_37_ - i_41_;
		if (i_44_ >= i_42_) {
		    i_24_ += i_29_ + i_26_;
		    i_25_ += i_26_ + i_28_;
		    continue;
		}
		i_42_ -= i_44_;
	    } else {
		int i_45_ = i_41_ - i_37_;
		if (i_45_ >= i_26_) {
		    i_24_ += i_29_ + i_26_;
		    i_25_ += i_26_ + i_28_;
		    continue;
		}
		i_24_ += i_45_;
		i_43_ -= i_45_;
		i_25_ += i_45_;
	    }
	    int i_46_ = 0;
	    if (i_43_ < i_42_)
		i_42_ = i_43_;
	    else
		i_46_ = i_43_ - i_42_;
	    for (int i_47_ = -i_42_; i_47_ < 0; i_47_++) {
		if (is[i_24_++] != 0)
		    is_23_[i_25_++] = i;
		else
		    i_25_++;
	    }
	    i_24_ += i_46_ + i_24_;
	    i_25_ += i_28_ + i_46_;
	}
    }
    
    void method16036(byte[] is, int[] is_48_, int i, int i_49_, int i_50_,
		     int i_51_, int i_52_, int i_53_, int i_54_) {
	int i_55_ = -(i_51_ >> 2);
	i_51_ = -(i_51_ & 0x3);
	for (int i_56_ = -i_52_; i_56_ < 0; i_56_++) {
	    for (int i_57_ = i_55_; i_57_ < 0; i_57_++) {
		if (is[i_49_++] != 0)
		    is_48_[i_50_++] = i;
		else
		    i_50_++;
		if (is[i_49_++] != 0)
		    is_48_[i_50_++] = i;
		else
		    i_50_++;
		if (is[i_49_++] != 0)
		    is_48_[i_50_++] = i;
		else
		    i_50_++;
		if (is[i_49_++] != 0)
		    is_48_[i_50_++] = i;
		else
		    i_50_++;
	    }
	    for (int i_58_ = i_51_; i_58_ < 0; i_58_++) {
		if (is[i_49_++] != 0)
		    is_48_[i_50_++] = i;
		else
		    i_50_++;
	    }
	    i_50_ += i_53_;
	    i_49_ += i_54_;
	}
    }
    
    void method2140(char c, int i, int i_59_, int i_60_, boolean bool,
		    Class135 class135, int i_61_, int i_62_) {
	if (null
	    != (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		.anIntArray9245)) {
	    if (null == class135)
		method2126(c, i, i_59_, i_60_, bool);
	    else {
		i += ((Class96_Sub5) this).anIntArray9669[c];
		i_59_ += ((Class96_Sub5) this).anIntArray9666[c];
		int i_63_ = ((Class96_Sub5) this).anIntArray9664[c];
		int i_64_ = ((Class96_Sub5) this).anIntArray9667[c];
		int i_65_ = (((Class103_Sub2) (((Class96_Sub5) this)
					       .aClass103_Sub2_9668)).anInt9260
			     * -1826993761);
		int i_66_ = i_65_ * i_59_ + i;
		int i_67_ = i_65_ - i_63_;
		int i_68_ = 0;
		int i_69_ = 0;
		if (i_59_ < (((Class103_Sub2) (((Class96_Sub5) this)
					       .aClass103_Sub2_9668)).anInt9254
			     * -788450385)) {
		    int i_70_
			= (-788450385 * ((Class103_Sub2)
					 (((Class96_Sub5) this)
					  .aClass103_Sub2_9668)).anInt9254
			   - i_59_);
		    i_64_ -= i_70_;
		    i_59_ = (((Class103_Sub2) (((Class96_Sub5) this)
					       .aClass103_Sub2_9668)).anInt9254
			     * -788450385);
		    i_69_ += i_63_ * i_70_;
		    i_66_ += i_65_ * i_70_;
		}
		if (i_64_ + i_59_ > (((Class103_Sub2) (((Class96_Sub5) this)
						       .aClass103_Sub2_9668))
				     .anInt9252) * 1546170165)
		    i_64_
			-= (i_59_ + i_64_
			    - 1546170165 * ((Class103_Sub2)
					    (((Class96_Sub5) this)
					     .aClass103_Sub2_9668)).anInt9252);
		if (i < (((Class103_Sub2)
			  ((Class96_Sub5) this).aClass103_Sub2_9668).anInt9249
			 * 1298750001)) {
		    int i_71_
			= (1298750001 * ((Class103_Sub2)
					 (((Class96_Sub5) this)
					  .aClass103_Sub2_9668)).anInt9249
			   - i);
		    i_63_ -= i_71_;
		    i = (((Class103_Sub2)
			  ((Class96_Sub5) this).aClass103_Sub2_9668).anInt9249
			 * 1298750001);
		    i_69_ += i_71_;
		    i_66_ += i_71_;
		    i_68_ += i_71_;
		    i_67_ += i_71_;
		}
		if (i + i_63_
		    > 325436811 * (((Class103_Sub2)
				    ((Class96_Sub5) this).aClass103_Sub2_9668)
				   .anInt9250)) {
		    int i_72_
			= i + i_63_ - (((Class103_Sub2) (((Class96_Sub5) this)
							 .aClass103_Sub2_9668))
				       .anInt9250) * 325436811;
		    i_63_ -= i_72_;
		    i_68_ += i_72_;
		    i_67_ += i_72_;
		}
		if (i_63_ > 0 && i_64_ > 0) {
		    if (bool)
			method16035((((Class96_Sub5) this).aByteArrayArray9665
				     [c]),
				    (((Class103_Sub2) (((Class96_Sub5) this)
						       .aClass103_Sub2_9668))
				     .anIntArray9245),
				    i_60_, i_69_, i_66_, i_63_, i_64_, i_67_,
				    i_68_, i, i_59_,
				    ((Class96_Sub5) this).anIntArray9664[c],
				    class135, i_61_, i_62_);
		    else
			method16037((((Class96_Sub5) this).aByteArrayArray9665
				     [c]),
				    (((Class103_Sub2) (((Class96_Sub5) this)
						       .aClass103_Sub2_9668))
				     .anIntArray9245),
				    ((Class96_Sub5) this).anIntArray9663,
				    i_60_, i_69_, i_66_, i_63_, i_64_, i_67_,
				    i_68_, i, i_59_,
				    ((Class96_Sub5) this).anIntArray9664[c],
				    class135, i_61_, i_62_);
		}
	    }
	}
    }
    
    void method16037(byte[] is, int[] is_73_, int[] is_74_, int i, int i_75_,
		     int i_76_, int i_77_, int i_78_, int i_79_, int i_80_,
		     int i_81_, int i_82_, int i_83_, Class135 class135,
		     int i_84_, int i_85_) {
	Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	int[] is_86_ = ((Class135_Sub1) class135_sub1).anIntArray9874;
	int[] is_87_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	int i_88_
	    = (i_81_
	       - (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		  .anInt9249) * 1298750001);
	int i_89_ = i_82_;
	if (i_85_ > i_89_) {
	    i_89_ = i_85_;
	    i_76_ += (i_85_ - i_82_) * (-1826993761
					* ((Class103_Sub2)
					   (((Class96_Sub5) this)
					    .aClass103_Sub2_9668)).anInt9260);
	    i_75_ += (i_85_ - i_82_) * i_83_;
	}
	int i_90_ = (is_86_.length + i_85_ < i_78_ + i_82_
		     ? i_85_ + is_86_.length : i_78_ + i_82_);
	boolean bool = false;
	for (int i_91_ = i_89_; i_91_ < i_90_; i_91_++) {
	    int i_92_ = i_84_ + is_86_[i_91_ - i_85_];
	    int i_93_ = is_87_[i_91_ - i_85_];
	    int i_94_ = i_77_;
	    if (i_88_ > i_92_) {
		int i_95_ = i_88_ - i_92_;
		if (i_95_ >= i_93_) {
		    i_75_ += i_80_ + i_77_;
		    i_76_ += i_79_ + i_77_;
		    continue;
		}
		i_93_ -= i_95_;
	    } else {
		int i_96_ = i_92_ - i_88_;
		if (i_96_ >= i_77_) {
		    i_75_ += i_77_ + i_80_;
		    i_76_ += i_77_ + i_79_;
		    continue;
		}
		i_75_ += i_96_;
		i_94_ -= i_96_;
		i_76_ += i_96_;
	    }
	    int i_97_ = 0;
	    if (i_94_ < i_93_)
		i_93_ = i_94_;
	    else
		i_97_ = i_94_ - i_93_;
	    for (int i_98_ = -i_93_; i_98_ < 0; i_98_++) {
		int i_99_;
		if ((i_99_ = is[i_75_++]) != 0)
		    is_73_[i_76_++] = is_74_[i_99_ & 0xff];
		else
		    i_76_++;
	    }
	    i_75_ += i_80_ + i_97_;
	    i_76_ += i_79_ + i_97_;
	}
    }
    
    void method2126(char c, int i, int i_100_, int i_101_, boolean bool) {
	if (null
	    != (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		.anIntArray9245)) {
	    i += ((Class96_Sub5) this).anIntArray9669[c];
	    i_100_ += ((Class96_Sub5) this).anIntArray9666[c];
	    int i_102_ = ((Class96_Sub5) this).anIntArray9664[c];
	    int i_103_ = ((Class96_Sub5) this).anIntArray9667[c];
	    int i_104_
		= ((((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		    .anInt9260)
		   * -1826993761);
	    int i_105_ = i_104_ * i_100_ + i;
	    int i_106_ = i_104_ - i_102_;
	    int i_107_ = 0;
	    int i_108_ = 0;
	    if (i_100_
		< (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		   .anInt9254) * -788450385) {
		int i_109_ = ((((Class103_Sub2)
				((Class96_Sub5) this).aClass103_Sub2_9668)
			       .anInt9254) * -788450385
			      - i_100_);
		i_103_ -= i_109_;
		i_100_ = (((Class103_Sub2)
			   ((Class96_Sub5) this).aClass103_Sub2_9668).anInt9254
			  * -788450385);
		i_108_ += i_102_ * i_109_;
		i_105_ += i_109_ * i_104_;
	    }
	    if (i_100_ + i_103_
		> (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		   .anInt9252) * 1546170165)
		i_103_ -= (i_103_ + i_100_
			   - (((Class103_Sub2)
			       ((Class96_Sub5) this).aClass103_Sub2_9668)
			      .anInt9252) * 1546170165);
	    if (i
		< (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		   .anInt9249) * 1298750001) {
		int i_110_ = ((((Class103_Sub2)
				((Class96_Sub5) this).aClass103_Sub2_9668)
			       .anInt9249) * 1298750001
			      - i);
		i_102_ -= i_110_;
		i = 1298750001 * (((Class103_Sub2)
				   ((Class96_Sub5) this).aClass103_Sub2_9668)
				  .anInt9249);
		i_108_ += i_110_;
		i_105_ += i_110_;
		i_107_ += i_110_;
		i_106_ += i_110_;
	    }
	    if (i_102_ + i
		> 325436811 * (((Class103_Sub2)
				((Class96_Sub5) this).aClass103_Sub2_9668)
			       .anInt9250)) {
		int i_111_
		    = i_102_ + i - (((Class103_Sub2)
				     ((Class96_Sub5) this).aClass103_Sub2_9668)
				    .anInt9250) * 325436811;
		i_102_ -= i_111_;
		i_107_ += i_111_;
		i_106_ += i_111_;
	    }
	    if (i_102_ > 0 && i_103_ > 0) {
		if (bool)
		    method16036(((Class96_Sub5) this).aByteArrayArray9665[c],
				(((Class103_Sub2)
				  ((Class96_Sub5) this).aClass103_Sub2_9668)
				 .anIntArray9245),
				i_101_, i_108_, i_105_, i_102_, i_103_, i_106_,
				i_107_);
		else
		    method16038(((Class96_Sub5) this).aByteArrayArray9665[c],
				(((Class103_Sub2)
				  ((Class96_Sub5) this).aClass103_Sub2_9668)
				 .anIntArray9245),
				((Class96_Sub5) this).anIntArray9663, i_108_,
				i_105_, i_102_, i_103_, i_106_, i_107_);
	    }
	}
    }
    
    void method16038(byte[] is, int[] is_112_, int[] is_113_, int i,
		     int i_114_, int i_115_, int i_116_, int i_117_,
		     int i_118_) {
	int i_119_ = -(i_115_ >> 2);
	i_115_ = -(i_115_ & 0x3);
	boolean bool = false;
	for (int i_120_ = -i_116_; i_120_ < 0; i_120_++) {
	    for (int i_121_ = i_119_; i_121_ < 0; i_121_++) {
		int i_122_;
		if ((i_122_ = is[i++]) != 0)
		    is_112_[i_114_++] = is_113_[i_122_ & 0xff];
		else
		    i_114_++;
		if ((i_122_ = is[i++]) != 0)
		    is_112_[i_114_++] = is_113_[i_122_ & 0xff];
		else
		    i_114_++;
		if ((i_122_ = is[i++]) != 0)
		    is_112_[i_114_++] = is_113_[i_122_ & 0xff];
		else
		    i_114_++;
		if ((i_122_ = is[i++]) != 0)
		    is_112_[i_114_++] = is_113_[i_122_ & 0xff];
		else
		    i_114_++;
	    }
	    for (int i_123_ = i_115_; i_123_ < 0; i_123_++) {
		int i_124_;
		if ((i_124_ = is[i++]) != 0)
		    is_112_[i_114_++] = is_113_[i_124_ & 0xff];
		else
		    i_114_++;
	    }
	    i_114_ += i_117_;
	    i += i_118_;
	}
    }
    
    void method2129(char c, int i, int i_125_, int i_126_, boolean bool) {
	if (null
	    != (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		.anIntArray9245)) {
	    i += ((Class96_Sub5) this).anIntArray9669[c];
	    i_125_ += ((Class96_Sub5) this).anIntArray9666[c];
	    int i_127_ = ((Class96_Sub5) this).anIntArray9664[c];
	    int i_128_ = ((Class96_Sub5) this).anIntArray9667[c];
	    int i_129_
		= ((((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		    .anInt9260)
		   * -1826993761);
	    int i_130_ = i_129_ * i_125_ + i;
	    int i_131_ = i_129_ - i_127_;
	    int i_132_ = 0;
	    int i_133_ = 0;
	    if (i_125_
		< (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		   .anInt9254) * -788450385) {
		int i_134_ = ((((Class103_Sub2)
				((Class96_Sub5) this).aClass103_Sub2_9668)
			       .anInt9254) * -788450385
			      - i_125_);
		i_128_ -= i_134_;
		i_125_ = (((Class103_Sub2)
			   ((Class96_Sub5) this).aClass103_Sub2_9668).anInt9254
			  * -788450385);
		i_133_ += i_127_ * i_134_;
		i_130_ += i_134_ * i_129_;
	    }
	    if (i_125_ + i_128_
		> (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		   .anInt9252) * 1546170165)
		i_128_ -= (i_128_ + i_125_
			   - (((Class103_Sub2)
			       ((Class96_Sub5) this).aClass103_Sub2_9668)
			      .anInt9252) * 1546170165);
	    if (i
		< (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		   .anInt9249) * 1298750001) {
		int i_135_ = ((((Class103_Sub2)
				((Class96_Sub5) this).aClass103_Sub2_9668)
			       .anInt9249) * 1298750001
			      - i);
		i_127_ -= i_135_;
		i = 1298750001 * (((Class103_Sub2)
				   ((Class96_Sub5) this).aClass103_Sub2_9668)
				  .anInt9249);
		i_133_ += i_135_;
		i_130_ += i_135_;
		i_132_ += i_135_;
		i_131_ += i_135_;
	    }
	    if (i_127_ + i
		> 325436811 * (((Class103_Sub2)
				((Class96_Sub5) this).aClass103_Sub2_9668)
			       .anInt9250)) {
		int i_136_
		    = i_127_ + i - (((Class103_Sub2)
				     ((Class96_Sub5) this).aClass103_Sub2_9668)
				    .anInt9250) * 325436811;
		i_127_ -= i_136_;
		i_132_ += i_136_;
		i_131_ += i_136_;
	    }
	    if (i_127_ > 0 && i_128_ > 0) {
		if (bool)
		    method16036(((Class96_Sub5) this).aByteArrayArray9665[c],
				(((Class103_Sub2)
				  ((Class96_Sub5) this).aClass103_Sub2_9668)
				 .anIntArray9245),
				i_126_, i_133_, i_130_, i_127_, i_128_, i_131_,
				i_132_);
		else
		    method16038(((Class96_Sub5) this).aByteArrayArray9665[c],
				(((Class103_Sub2)
				  ((Class96_Sub5) this).aClass103_Sub2_9668)
				 .anIntArray9245),
				((Class96_Sub5) this).anIntArray9663, i_133_,
				i_130_, i_127_, i_128_, i_131_, i_132_);
	    }
	}
    }
    
    void method2153(char c, int i, int i_137_, int i_138_, boolean bool) {
	if (null
	    != (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		.anIntArray9245)) {
	    i += ((Class96_Sub5) this).anIntArray9669[c];
	    i_137_ += ((Class96_Sub5) this).anIntArray9666[c];
	    int i_139_ = ((Class96_Sub5) this).anIntArray9664[c];
	    int i_140_ = ((Class96_Sub5) this).anIntArray9667[c];
	    int i_141_
		= ((((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		    .anInt9260)
		   * -1826993761);
	    int i_142_ = i_141_ * i_137_ + i;
	    int i_143_ = i_141_ - i_139_;
	    int i_144_ = 0;
	    int i_145_ = 0;
	    if (i_137_
		< (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		   .anInt9254) * -788450385) {
		int i_146_ = ((((Class103_Sub2)
				((Class96_Sub5) this).aClass103_Sub2_9668)
			       .anInt9254) * -788450385
			      - i_137_);
		i_140_ -= i_146_;
		i_137_ = (((Class103_Sub2)
			   ((Class96_Sub5) this).aClass103_Sub2_9668).anInt9254
			  * -788450385);
		i_145_ += i_139_ * i_146_;
		i_142_ += i_146_ * i_141_;
	    }
	    if (i_137_ + i_140_
		> (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		   .anInt9252) * 1546170165)
		i_140_ -= (i_140_ + i_137_
			   - (((Class103_Sub2)
			       ((Class96_Sub5) this).aClass103_Sub2_9668)
			      .anInt9252) * 1546170165);
	    if (i
		< (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		   .anInt9249) * 1298750001) {
		int i_147_ = ((((Class103_Sub2)
				((Class96_Sub5) this).aClass103_Sub2_9668)
			       .anInt9249) * 1298750001
			      - i);
		i_139_ -= i_147_;
		i = 1298750001 * (((Class103_Sub2)
				   ((Class96_Sub5) this).aClass103_Sub2_9668)
				  .anInt9249);
		i_145_ += i_147_;
		i_142_ += i_147_;
		i_144_ += i_147_;
		i_143_ += i_147_;
	    }
	    if (i_139_ + i
		> 325436811 * (((Class103_Sub2)
				((Class96_Sub5) this).aClass103_Sub2_9668)
			       .anInt9250)) {
		int i_148_
		    = i_139_ + i - (((Class103_Sub2)
				     ((Class96_Sub5) this).aClass103_Sub2_9668)
				    .anInt9250) * 325436811;
		i_139_ -= i_148_;
		i_144_ += i_148_;
		i_143_ += i_148_;
	    }
	    if (i_139_ > 0 && i_140_ > 0) {
		if (bool)
		    method16036(((Class96_Sub5) this).aByteArrayArray9665[c],
				(((Class103_Sub2)
				  ((Class96_Sub5) this).aClass103_Sub2_9668)
				 .anIntArray9245),
				i_138_, i_145_, i_142_, i_139_, i_140_, i_143_,
				i_144_);
		else
		    method16038(((Class96_Sub5) this).aByteArrayArray9665[c],
				(((Class103_Sub2)
				  ((Class96_Sub5) this).aClass103_Sub2_9668)
				 .anIntArray9245),
				((Class96_Sub5) this).anIntArray9663, i_145_,
				i_142_, i_139_, i_140_, i_143_, i_144_);
	    }
	}
    }
    
    void method2154(char c, int i, int i_149_, int i_150_, boolean bool) {
	if (null
	    != (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		.anIntArray9245)) {
	    i += ((Class96_Sub5) this).anIntArray9669[c];
	    i_149_ += ((Class96_Sub5) this).anIntArray9666[c];
	    int i_151_ = ((Class96_Sub5) this).anIntArray9664[c];
	    int i_152_ = ((Class96_Sub5) this).anIntArray9667[c];
	    int i_153_
		= ((((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		    .anInt9260)
		   * -1826993761);
	    int i_154_ = i_153_ * i_149_ + i;
	    int i_155_ = i_153_ - i_151_;
	    int i_156_ = 0;
	    int i_157_ = 0;
	    if (i_149_
		< (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		   .anInt9254) * -788450385) {
		int i_158_ = ((((Class103_Sub2)
				((Class96_Sub5) this).aClass103_Sub2_9668)
			       .anInt9254) * -788450385
			      - i_149_);
		i_152_ -= i_158_;
		i_149_ = (((Class103_Sub2)
			   ((Class96_Sub5) this).aClass103_Sub2_9668).anInt9254
			  * -788450385);
		i_157_ += i_151_ * i_158_;
		i_154_ += i_158_ * i_153_;
	    }
	    if (i_149_ + i_152_
		> (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		   .anInt9252) * 1546170165)
		i_152_ -= (i_152_ + i_149_
			   - (((Class103_Sub2)
			       ((Class96_Sub5) this).aClass103_Sub2_9668)
			      .anInt9252) * 1546170165);
	    if (i
		< (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		   .anInt9249) * 1298750001) {
		int i_159_ = ((((Class103_Sub2)
				((Class96_Sub5) this).aClass103_Sub2_9668)
			       .anInt9249) * 1298750001
			      - i);
		i_151_ -= i_159_;
		i = 1298750001 * (((Class103_Sub2)
				   ((Class96_Sub5) this).aClass103_Sub2_9668)
				  .anInt9249);
		i_157_ += i_159_;
		i_154_ += i_159_;
		i_156_ += i_159_;
		i_155_ += i_159_;
	    }
	    if (i_151_ + i
		> 325436811 * (((Class103_Sub2)
				((Class96_Sub5) this).aClass103_Sub2_9668)
			       .anInt9250)) {
		int i_160_
		    = i_151_ + i - (((Class103_Sub2)
				     ((Class96_Sub5) this).aClass103_Sub2_9668)
				    .anInt9250) * 325436811;
		i_151_ -= i_160_;
		i_156_ += i_160_;
		i_155_ += i_160_;
	    }
	    if (i_151_ > 0 && i_152_ > 0) {
		if (bool)
		    method16036(((Class96_Sub5) this).aByteArrayArray9665[c],
				(((Class103_Sub2)
				  ((Class96_Sub5) this).aClass103_Sub2_9668)
				 .anIntArray9245),
				i_150_, i_157_, i_154_, i_151_, i_152_, i_155_,
				i_156_);
		else
		    method16038(((Class96_Sub5) this).aByteArrayArray9665[c],
				(((Class103_Sub2)
				  ((Class96_Sub5) this).aClass103_Sub2_9668)
				 .anIntArray9245),
				((Class96_Sub5) this).anIntArray9663, i_157_,
				i_154_, i_151_, i_152_, i_155_, i_156_);
	    }
	}
    }
    
    void method2131(char c, int i, int i_161_, int i_162_, boolean bool,
		    Class135 class135, int i_163_, int i_164_) {
	if (null
	    != (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		.anIntArray9245)) {
	    if (null == class135)
		method2126(c, i, i_161_, i_162_, bool);
	    else {
		i += ((Class96_Sub5) this).anIntArray9669[c];
		i_161_ += ((Class96_Sub5) this).anIntArray9666[c];
		int i_165_ = ((Class96_Sub5) this).anIntArray9664[c];
		int i_166_ = ((Class96_Sub5) this).anIntArray9667[c];
		int i_167_
		    = (((Class103_Sub2)
			((Class96_Sub5) this).aClass103_Sub2_9668).anInt9260
		       * -1826993761);
		int i_168_ = i_167_ * i_161_ + i;
		int i_169_ = i_167_ - i_165_;
		int i_170_ = 0;
		int i_171_ = 0;
		if (i_161_ < (((Class103_Sub2)
			       ((Class96_Sub5) this).aClass103_Sub2_9668)
			      .anInt9254) * -788450385) {
		    int i_172_
			= (-788450385 * ((Class103_Sub2)
					 (((Class96_Sub5) this)
					  .aClass103_Sub2_9668)).anInt9254
			   - i_161_);
		    i_166_ -= i_172_;
		    i_161_ = (((Class103_Sub2)
			       ((Class96_Sub5) this).aClass103_Sub2_9668)
			      .anInt9254) * -788450385;
		    i_171_ += i_165_ * i_172_;
		    i_168_ += i_167_ * i_172_;
		}
		if (i_166_ + i_161_ > (((Class103_Sub2) (((Class96_Sub5) this)
							 .aClass103_Sub2_9668))
				       .anInt9252) * 1546170165)
		    i_166_
			-= (i_161_ + i_166_
			    - 1546170165 * ((Class103_Sub2)
					    (((Class96_Sub5) this)
					     .aClass103_Sub2_9668)).anInt9252);
		if (i < (((Class103_Sub2)
			  ((Class96_Sub5) this).aClass103_Sub2_9668).anInt9249
			 * 1298750001)) {
		    int i_173_
			= (1298750001 * ((Class103_Sub2)
					 (((Class96_Sub5) this)
					  .aClass103_Sub2_9668)).anInt9249
			   - i);
		    i_165_ -= i_173_;
		    i = (((Class103_Sub2)
			  ((Class96_Sub5) this).aClass103_Sub2_9668).anInt9249
			 * 1298750001);
		    i_171_ += i_173_;
		    i_168_ += i_173_;
		    i_170_ += i_173_;
		    i_169_ += i_173_;
		}
		if (i + i_165_
		    > 325436811 * (((Class103_Sub2)
				    ((Class96_Sub5) this).aClass103_Sub2_9668)
				   .anInt9250)) {
		    int i_174_ = (i + i_165_
				  - (((Class103_Sub2) (((Class96_Sub5) this)
						       .aClass103_Sub2_9668))
				     .anInt9250) * 325436811);
		    i_165_ -= i_174_;
		    i_170_ += i_174_;
		    i_169_ += i_174_;
		}
		if (i_165_ > 0 && i_166_ > 0) {
		    if (bool)
			method16035((((Class96_Sub5) this).aByteArrayArray9665
				     [c]),
				    (((Class103_Sub2) (((Class96_Sub5) this)
						       .aClass103_Sub2_9668))
				     .anIntArray9245),
				    i_162_, i_171_, i_168_, i_165_, i_166_,
				    i_169_, i_170_, i, i_161_,
				    ((Class96_Sub5) this).anIntArray9664[c],
				    class135, i_163_, i_164_);
		    else
			method16037((((Class96_Sub5) this).aByteArrayArray9665
				     [c]),
				    (((Class103_Sub2) (((Class96_Sub5) this)
						       .aClass103_Sub2_9668))
				     .anIntArray9245),
				    ((Class96_Sub5) this).anIntArray9663,
				    i_162_, i_171_, i_168_, i_165_, i_166_,
				    i_169_, i_170_, i, i_161_,
				    ((Class96_Sub5) this).anIntArray9664[c],
				    class135, i_163_, i_164_);
		}
	    }
	}
    }
    
    void method2151(char c, int i, int i_175_, int i_176_, boolean bool,
		    Class135 class135, int i_177_, int i_178_) {
	if (null
	    != (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		.anIntArray9245)) {
	    if (null == class135)
		method2126(c, i, i_175_, i_176_, bool);
	    else {
		i += ((Class96_Sub5) this).anIntArray9669[c];
		i_175_ += ((Class96_Sub5) this).anIntArray9666[c];
		int i_179_ = ((Class96_Sub5) this).anIntArray9664[c];
		int i_180_ = ((Class96_Sub5) this).anIntArray9667[c];
		int i_181_
		    = (((Class103_Sub2)
			((Class96_Sub5) this).aClass103_Sub2_9668).anInt9260
		       * -1826993761);
		int i_182_ = i_181_ * i_175_ + i;
		int i_183_ = i_181_ - i_179_;
		int i_184_ = 0;
		int i_185_ = 0;
		if (i_175_ < (((Class103_Sub2)
			       ((Class96_Sub5) this).aClass103_Sub2_9668)
			      .anInt9254) * -788450385) {
		    int i_186_
			= (-788450385 * ((Class103_Sub2)
					 (((Class96_Sub5) this)
					  .aClass103_Sub2_9668)).anInt9254
			   - i_175_);
		    i_180_ -= i_186_;
		    i_175_ = (((Class103_Sub2)
			       ((Class96_Sub5) this).aClass103_Sub2_9668)
			      .anInt9254) * -788450385;
		    i_185_ += i_179_ * i_186_;
		    i_182_ += i_181_ * i_186_;
		}
		if (i_180_ + i_175_ > (((Class103_Sub2) (((Class96_Sub5) this)
							 .aClass103_Sub2_9668))
				       .anInt9252) * 1546170165)
		    i_180_
			-= (i_175_ + i_180_
			    - 1546170165 * ((Class103_Sub2)
					    (((Class96_Sub5) this)
					     .aClass103_Sub2_9668)).anInt9252);
		if (i < (((Class103_Sub2)
			  ((Class96_Sub5) this).aClass103_Sub2_9668).anInt9249
			 * 1298750001)) {
		    int i_187_
			= (1298750001 * ((Class103_Sub2)
					 (((Class96_Sub5) this)
					  .aClass103_Sub2_9668)).anInt9249
			   - i);
		    i_179_ -= i_187_;
		    i = (((Class103_Sub2)
			  ((Class96_Sub5) this).aClass103_Sub2_9668).anInt9249
			 * 1298750001);
		    i_185_ += i_187_;
		    i_182_ += i_187_;
		    i_184_ += i_187_;
		    i_183_ += i_187_;
		}
		if (i + i_179_
		    > 325436811 * (((Class103_Sub2)
				    ((Class96_Sub5) this).aClass103_Sub2_9668)
				   .anInt9250)) {
		    int i_188_ = (i + i_179_
				  - (((Class103_Sub2) (((Class96_Sub5) this)
						       .aClass103_Sub2_9668))
				     .anInt9250) * 325436811);
		    i_179_ -= i_188_;
		    i_184_ += i_188_;
		    i_183_ += i_188_;
		}
		if (i_179_ > 0 && i_180_ > 0) {
		    if (bool)
			method16035((((Class96_Sub5) this).aByteArrayArray9665
				     [c]),
				    (((Class103_Sub2) (((Class96_Sub5) this)
						       .aClass103_Sub2_9668))
				     .anIntArray9245),
				    i_176_, i_185_, i_182_, i_179_, i_180_,
				    i_183_, i_184_, i, i_175_,
				    ((Class96_Sub5) this).anIntArray9664[c],
				    class135, i_177_, i_178_);
		    else
			method16037((((Class96_Sub5) this).aByteArrayArray9665
				     [c]),
				    (((Class103_Sub2) (((Class96_Sub5) this)
						       .aClass103_Sub2_9668))
				     .anIntArray9245),
				    ((Class96_Sub5) this).anIntArray9663,
				    i_176_, i_185_, i_182_, i_179_, i_180_,
				    i_183_, i_184_, i, i_175_,
				    ((Class96_Sub5) this).anIntArray9664[c],
				    class135, i_177_, i_178_);
		}
	    }
	}
    }
    
    void method16039(byte[] is, int[] is_189_, int[] is_190_, int i,
		     int i_191_, int i_192_, int i_193_, int i_194_,
		     int i_195_) {
	int i_196_ = -(i_192_ >> 2);
	i_192_ = -(i_192_ & 0x3);
	boolean bool = false;
	for (int i_197_ = -i_193_; i_197_ < 0; i_197_++) {
	    for (int i_198_ = i_196_; i_198_ < 0; i_198_++) {
		int i_199_;
		if ((i_199_ = is[i++]) != 0)
		    is_189_[i_191_++] = is_190_[i_199_ & 0xff];
		else
		    i_191_++;
		if ((i_199_ = is[i++]) != 0)
		    is_189_[i_191_++] = is_190_[i_199_ & 0xff];
		else
		    i_191_++;
		if ((i_199_ = is[i++]) != 0)
		    is_189_[i_191_++] = is_190_[i_199_ & 0xff];
		else
		    i_191_++;
		if ((i_199_ = is[i++]) != 0)
		    is_189_[i_191_++] = is_190_[i_199_ & 0xff];
		else
		    i_191_++;
	    }
	    for (int i_200_ = i_192_; i_200_ < 0; i_200_++) {
		int i_201_;
		if ((i_201_ = is[i++]) != 0)
		    is_189_[i_191_++] = is_190_[i_201_ & 0xff];
		else
		    i_191_++;
	    }
	    i_191_ += i_194_;
	    i += i_195_;
	}
    }
    
    void method16040(byte[] is, int[] is_202_, int[] is_203_, int i,
		     int i_204_, int i_205_, int i_206_, int i_207_,
		     int i_208_) {
	int i_209_ = -(i_205_ >> 2);
	i_205_ = -(i_205_ & 0x3);
	boolean bool = false;
	for (int i_210_ = -i_206_; i_210_ < 0; i_210_++) {
	    for (int i_211_ = i_209_; i_211_ < 0; i_211_++) {
		int i_212_;
		if ((i_212_ = is[i++]) != 0)
		    is_202_[i_204_++] = is_203_[i_212_ & 0xff];
		else
		    i_204_++;
		if ((i_212_ = is[i++]) != 0)
		    is_202_[i_204_++] = is_203_[i_212_ & 0xff];
		else
		    i_204_++;
		if ((i_212_ = is[i++]) != 0)
		    is_202_[i_204_++] = is_203_[i_212_ & 0xff];
		else
		    i_204_++;
		if ((i_212_ = is[i++]) != 0)
		    is_202_[i_204_++] = is_203_[i_212_ & 0xff];
		else
		    i_204_++;
	    }
	    for (int i_213_ = i_205_; i_213_ < 0; i_213_++) {
		int i_214_;
		if ((i_214_ = is[i++]) != 0)
		    is_202_[i_204_++] = is_203_[i_214_ & 0xff];
		else
		    i_204_++;
	    }
	    i_204_ += i_207_;
	    i += i_208_;
	}
    }
    
    void method16041(byte[] is, int[] is_215_, int i, int i_216_, int i_217_,
		     int i_218_, int i_219_, int i_220_, int i_221_) {
	int i_222_ = -(i_218_ >> 2);
	i_218_ = -(i_218_ & 0x3);
	for (int i_223_ = -i_219_; i_223_ < 0; i_223_++) {
	    for (int i_224_ = i_222_; i_224_ < 0; i_224_++) {
		if (is[i_216_++] != 0)
		    is_215_[i_217_++] = i;
		else
		    i_217_++;
		if (is[i_216_++] != 0)
		    is_215_[i_217_++] = i;
		else
		    i_217_++;
		if (is[i_216_++] != 0)
		    is_215_[i_217_++] = i;
		else
		    i_217_++;
		if (is[i_216_++] != 0)
		    is_215_[i_217_++] = i;
		else
		    i_217_++;
	    }
	    for (int i_225_ = i_218_; i_225_ < 0; i_225_++) {
		if (is[i_216_++] != 0)
		    is_215_[i_217_++] = i;
		else
		    i_217_++;
	    }
	    i_217_ += i_220_;
	    i_216_ += i_221_;
	}
    }
    
    void method16042(byte[] is, int[] is_226_, int i, int i_227_, int i_228_,
		     int i_229_, int i_230_, int i_231_, int i_232_) {
	int i_233_ = -(i_229_ >> 2);
	i_229_ = -(i_229_ & 0x3);
	for (int i_234_ = -i_230_; i_234_ < 0; i_234_++) {
	    for (int i_235_ = i_233_; i_235_ < 0; i_235_++) {
		if (is[i_227_++] != 0)
		    is_226_[i_228_++] = i;
		else
		    i_228_++;
		if (is[i_227_++] != 0)
		    is_226_[i_228_++] = i;
		else
		    i_228_++;
		if (is[i_227_++] != 0)
		    is_226_[i_228_++] = i;
		else
		    i_228_++;
		if (is[i_227_++] != 0)
		    is_226_[i_228_++] = i;
		else
		    i_228_++;
	    }
	    for (int i_236_ = i_229_; i_236_ < 0; i_236_++) {
		if (is[i_227_++] != 0)
		    is_226_[i_228_++] = i;
		else
		    i_228_++;
	    }
	    i_228_ += i_231_;
	    i_227_ += i_232_;
	}
    }
    
    Class96_Sub5(Class103_Sub2 class103_sub2, Class639 class639,
		 Class108_Sub2[] class108_sub2s, int[] is, int[] is_237_) {
	super(class103_sub2, class639);
	((Class96_Sub5) this).aClass103_Sub2_9668 = class103_sub2;
	((Class96_Sub5) this).aClass103_Sub2_9668 = class103_sub2;
	((Class96_Sub5) this).anIntArray9664 = is;
	((Class96_Sub5) this).anIntArray9667 = is_237_;
	((Class96_Sub5) this).aByteArrayArray9665
	    = new byte[class108_sub2s.length][];
	((Class96_Sub5) this).anIntArray9666 = new int[class108_sub2s.length];
	((Class96_Sub5) this).anIntArray9669 = new int[class108_sub2s.length];
	for (int i = 0; i < class108_sub2s.length; i++) {
	    ((Class96_Sub5) this).aByteArrayArray9665[i]
		= class108_sub2s[i].aByteArray9309;
	    ((Class96_Sub5) this).anIntArray9666[i]
		= class108_sub2s[i].anInt9306;
	    ((Class96_Sub5) this).anIntArray9669[i]
		= class108_sub2s[i].anInt9302;
	}
	((Class96_Sub5) this).anIntArray9663
	    = class108_sub2s[0].anIntArray9308;
    }
    
    void method16043(byte[] is, int[] is_238_, int[] is_239_, int i,
		     int i_240_, int i_241_, int i_242_, int i_243_,
		     int i_244_, int i_245_, int i_246_, int i_247_,
		     int i_248_, Class135 class135, int i_249_, int i_250_) {
	Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	int[] is_251_ = ((Class135_Sub1) class135_sub1).anIntArray9874;
	int[] is_252_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	int i_253_
	    = (i_246_
	       - (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		  .anInt9249) * 1298750001);
	int i_254_ = i_247_;
	if (i_250_ > i_254_) {
	    i_254_ = i_250_;
	    i_241_
		+= ((i_250_ - i_247_)
		    * (-1826993761
		       * ((Class103_Sub2) (((Class96_Sub5) this)
					   .aClass103_Sub2_9668)).anInt9260));
	    i_240_ += (i_250_ - i_247_) * i_248_;
	}
	int i_255_ = (is_251_.length + i_250_ < i_243_ + i_247_
		      ? i_250_ + is_251_.length : i_243_ + i_247_);
	boolean bool = false;
	for (int i_256_ = i_254_; i_256_ < i_255_; i_256_++) {
	    int i_257_ = i_249_ + is_251_[i_256_ - i_250_];
	    int i_258_ = is_252_[i_256_ - i_250_];
	    int i_259_ = i_242_;
	    if (i_253_ > i_257_) {
		int i_260_ = i_253_ - i_257_;
		if (i_260_ >= i_258_) {
		    i_240_ += i_245_ + i_242_;
		    i_241_ += i_244_ + i_242_;
		    continue;
		}
		i_258_ -= i_260_;
	    } else {
		int i_261_ = i_257_ - i_253_;
		if (i_261_ >= i_242_) {
		    i_240_ += i_242_ + i_245_;
		    i_241_ += i_242_ + i_244_;
		    continue;
		}
		i_240_ += i_261_;
		i_259_ -= i_261_;
		i_241_ += i_261_;
	    }
	    int i_262_ = 0;
	    if (i_259_ < i_258_)
		i_258_ = i_259_;
	    else
		i_262_ = i_259_ - i_258_;
	    for (int i_263_ = -i_258_; i_263_ < 0; i_263_++) {
		int i_264_;
		if ((i_264_ = is[i_240_++]) != 0)
		    is_238_[i_241_++] = is_239_[i_264_ & 0xff];
		else
		    i_241_++;
	    }
	    i_240_ += i_245_ + i_262_;
	    i_241_ += i_244_ + i_262_;
	}
    }
    
    void method16044(byte[] is, int[] is_265_, int[] is_266_, int i,
		     int i_267_, int i_268_, int i_269_, int i_270_,
		     int i_271_, int i_272_, int i_273_, int i_274_,
		     int i_275_, Class135 class135, int i_276_, int i_277_) {
	Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	int[] is_278_ = ((Class135_Sub1) class135_sub1).anIntArray9874;
	int[] is_279_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	int i_280_
	    = (i_273_
	       - (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		  .anInt9249) * 1298750001);
	int i_281_ = i_274_;
	if (i_277_ > i_281_) {
	    i_281_ = i_277_;
	    i_268_
		+= ((i_277_ - i_274_)
		    * (-1826993761
		       * ((Class103_Sub2) (((Class96_Sub5) this)
					   .aClass103_Sub2_9668)).anInt9260));
	    i_267_ += (i_277_ - i_274_) * i_275_;
	}
	int i_282_ = (is_278_.length + i_277_ < i_270_ + i_274_
		      ? i_277_ + is_278_.length : i_270_ + i_274_);
	boolean bool = false;
	for (int i_283_ = i_281_; i_283_ < i_282_; i_283_++) {
	    int i_284_ = i_276_ + is_278_[i_283_ - i_277_];
	    int i_285_ = is_279_[i_283_ - i_277_];
	    int i_286_ = i_269_;
	    if (i_280_ > i_284_) {
		int i_287_ = i_280_ - i_284_;
		if (i_287_ >= i_285_) {
		    i_267_ += i_272_ + i_269_;
		    i_268_ += i_271_ + i_269_;
		    continue;
		}
		i_285_ -= i_287_;
	    } else {
		int i_288_ = i_284_ - i_280_;
		if (i_288_ >= i_269_) {
		    i_267_ += i_269_ + i_272_;
		    i_268_ += i_269_ + i_271_;
		    continue;
		}
		i_267_ += i_288_;
		i_286_ -= i_288_;
		i_268_ += i_288_;
	    }
	    int i_289_ = 0;
	    if (i_286_ < i_285_)
		i_285_ = i_286_;
	    else
		i_289_ = i_286_ - i_285_;
	    for (int i_290_ = -i_285_; i_290_ < 0; i_290_++) {
		int i_291_;
		if ((i_291_ = is[i_267_++]) != 0)
		    is_265_[i_268_++] = is_266_[i_291_ & 0xff];
		else
		    i_268_++;
	    }
	    i_267_ += i_272_ + i_289_;
	    i_268_ += i_271_ + i_289_;
	}
    }
    
    void method16045(byte[] is, int[] is_292_, int i, int i_293_, int i_294_,
		     int i_295_, int i_296_, int i_297_, int i_298_,
		     int i_299_, int i_300_, int i_301_, Class135 class135,
		     int i_302_, int i_303_) {
	Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	int[] is_304_ = ((Class135_Sub1) class135_sub1).anIntArray9874;
	int[] is_305_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	int i_306_
	    = (i_299_
	       - (((Class103_Sub2) ((Class96_Sub5) this).aClass103_Sub2_9668)
		  .anInt9249) * 1298750001);
	int i_307_ = i_300_;
	if (i_303_ > i_307_) {
	    i_307_ = i_303_;
	    i_294_
		+= ((i_303_ - i_300_)
		    * (-1826993761
		       * ((Class103_Sub2) (((Class96_Sub5) this)
					   .aClass103_Sub2_9668)).anInt9260));
	    i_293_ += (i_303_ - i_300_) * i_301_;
	}
	int i_308_ = (i_303_ + is_304_.length < i_296_ + i_300_
		      ? i_303_ + is_304_.length : i_296_ + i_300_);
	for (int i_309_ = i_307_; i_309_ < i_308_; i_309_++) {
	    int i_310_ = i_302_ + is_304_[i_309_ - i_303_];
	    int i_311_ = is_305_[i_309_ - i_303_];
	    int i_312_ = i_295_;
	    if (i_306_ > i_310_) {
		int i_313_ = i_306_ - i_310_;
		if (i_313_ >= i_311_) {
		    i_293_ += i_298_ + i_295_;
		    i_294_ += i_295_ + i_297_;
		    continue;
		}
		i_311_ -= i_313_;
	    } else {
		int i_314_ = i_310_ - i_306_;
		if (i_314_ >= i_295_) {
		    i_293_ += i_298_ + i_295_;
		    i_294_ += i_295_ + i_297_;
		    continue;
		}
		i_293_ += i_314_;
		i_312_ -= i_314_;
		i_294_ += i_314_;
	    }
	    int i_315_ = 0;
	    if (i_312_ < i_311_)
		i_311_ = i_312_;
	    else
		i_315_ = i_312_ - i_311_;
	    for (int i_316_ = -i_311_; i_316_ < 0; i_316_++) {
		if (is[i_293_++] != 0)
		    is_292_[i_294_++] = i;
		else
		    i_294_++;
	    }
	    i_293_ += i_315_ + i_293_;
	    i_294_ += i_297_ + i_315_;
	}
    }
    
    public static final int method16046(int i, int i_317_, int i_318_,
					int i_319_) {
	if (client.aClass238_8477.method4751(-1925480655) == null)
	    return 0;
	int i_320_ = i >> 9;
	int i_321_ = i_317_ >> 9;
	if (i_320_ < 0 || i_321_ < 0
	    || i_320_ > client.aClass238_8477.method4744(-1629729146) - 1
	    || i_321_ > client.aClass238_8477.method4745(146454140) - 1)
	    return 0;
	int i_322_ = i_318_;
	if (i_322_ < 3 && ((client.aClass238_8477.method4753((byte) -28)
			    .heightmapData[1][i_320_][i_321_])
			   & 0x2) != 0)
	    i_322_++;
	return client.aClass238_8477.method4751(-1037999523)
		   .aClass166Array7184[i_322_]
		   .method3574(i, i_317_, 1951741035);
    }
    
    static final void method16047(ClientScriptData class454, byte i) {
	Class245.method4920((((ClientScriptData) class454).integerStack
			     [((((ClientScriptData) class454).intStackPointer -= 1736754263)
			       * 1482319719)]),
			    2104051175);
    }
}
