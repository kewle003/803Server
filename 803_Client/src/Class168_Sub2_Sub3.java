/* Class168_Sub2_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class168_Sub2_Sub3 extends Class168_Sub2
{
    int[] anIntArray11204;
    byte[] aByteArray11205;
    
    public void method3675(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			   int i_4_) {
	throw new IllegalStateException();
    }
    
    public Interface4 method3634() {
	throw new IllegalStateException();
    }
    
    public void method3639(int i, int i_5_, int i_6_, int i_7_, int i_8_,
			   int i_9_) {
	throw new IllegalStateException();
    }
    
    public void method3638(int i, int i_10_, Class135 class135, int i_11_,
			   int i_12_) {
	if (((Class168_Sub2_Sub3) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    i += ((Class168_Sub2_Sub3) this).anInt9907;
	    i_10_ += ((Class168_Sub2_Sub3) this).anInt9905;
	    int i_13_ = 0;
	    int i_14_ = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					   .aClass103_Sub2_9904)).anInt9260
			 * -1826993761);
	    int i_15_ = ((Class168_Sub2_Sub3) this).anInt9920;
	    int i_16_ = ((Class168_Sub2_Sub3) this).anInt9916;
	    int i_17_ = i_14_ - i_15_;
	    int i_18_ = 0;
	    int i_19_ = i + i_10_ * i_14_;
	    if (i_10_ < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					   .aClass103_Sub2_9904)).anInt9254
			 * -788450385)) {
		int i_20_ = ((((Class103_Sub2)
			       ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			      .anInt9254) * -788450385
			     - i_10_);
		i_16_ -= i_20_;
		i_10_ = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					   .aClass103_Sub2_9904)).anInt9254
			 * -788450385);
		i_13_ += i_20_ * i_15_;
		i_19_ += i_20_ * i_14_;
	    }
	    if (i_10_ + i_16_ > (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						   .aClass103_Sub2_9904))
				 .anInt9252) * 1546170165)
		i_16_ -= (i_10_ + i_16_
			  - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					       .aClass103_Sub2_9904)).anInt9252
			     * 1546170165));
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_21_ = ((((Class103_Sub2)
			       ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			      .anInt9249) * 1298750001
			     - i);
		i_15_ -= i_21_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_13_ += i_21_;
		i_19_ += i_21_;
		i_18_ += i_21_;
		i_17_ += i_21_;
	    }
	    if (i + i_15_ > (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					       .aClass103_Sub2_9904)).anInt9250
			     * 325436811)) {
		int i_22_ = (i + i_15_
			     - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						  .aClass103_Sub2_9904))
				.anInt9250) * 325436811);
		i_15_ -= i_22_;
		i_18_ += i_22_;
		i_17_ += i_22_;
	    }
	    if (i_15_ > 0 && i_16_ > 0) {
		Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
		int[] is_23_ = ((Class135_Sub1) class135_sub1).anIntArray9874;
		int[] is_24_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
		int i_25_ = i_10_;
		if (i_12_ > i_25_) {
		    i_25_ = i_12_;
		    i_19_ += (i_12_ - i_10_) * i_14_;
		    i_13_ += ((i_12_ - i_10_)
			      * ((Class168_Sub2_Sub3) this).anInt9920);
		}
		int i_26_ = (i_12_ + is_23_.length < i_10_ + i_16_
			     ? i_12_ + is_23_.length : i_10_ + i_16_);
		for (int i_27_ = i_25_; i_27_ < i_26_; i_27_++) {
		    int i_28_ = is_23_[i_27_ - i_12_] + i_11_;
		    int i_29_ = is_24_[i_27_ - i_12_];
		    int i_30_ = i_15_;
		    if (i > i_28_) {
			int i_31_ = i - i_28_;
			if (i_31_ >= i_29_) {
			    i_13_ += i_15_ + i_18_;
			    i_19_ += i_15_ + i_17_;
			    continue;
			}
			i_29_ -= i_31_;
		    } else {
			int i_32_ = i_28_ - i;
			if (i_32_ >= i_15_) {
			    i_13_ += i_15_ + i_18_;
			    i_19_ += i_15_ + i_17_;
			    continue;
			}
			i_13_ += i_32_;
			i_30_ -= i_32_;
			i_19_ += i_32_;
		    }
		    int i_33_ = 0;
		    if (i_30_ < i_29_)
			i_29_ = i_30_;
		    else
			i_33_ = i_30_ - i_29_;
		    for (int i_34_ = -i_29_; i_34_ < 0; i_34_++) {
			int i_35_ = (((Class168_Sub2_Sub3) this)
				     .aByteArray11205[i_13_++]);
			if (i_35_ != 0)
			    is[i_19_++] = (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_35_ & 0xff]);
			else
			    i_19_++;
		    }
		    i_13_ += i_33_ + i_18_;
		    i_19_ += i_33_ + i_17_;
		}
	    }
	}
    }
    
    public void method3666(int i, int i_36_, int i_37_, int i_38_, int i_39_) {
	if (((Class168_Sub2_Sub3) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    int i_40_ = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					   .aClass103_Sub2_9904)).anInt9260
			 * -1826993761);
	    i += ((Class168_Sub2_Sub3) this).anInt9907;
	    i_36_ += ((Class168_Sub2_Sub3) this).anInt9905;
	    int i_41_ = i_36_ * i_40_ + i;
	    int i_42_ = 0;
	    int i_43_ = ((Class168_Sub2_Sub3) this).anInt9916;
	    int i_44_ = ((Class168_Sub2_Sub3) this).anInt9920;
	    int i_45_ = i_40_ - i_44_;
	    int i_46_ = 0;
	    if (i_36_ < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					   .aClass103_Sub2_9904)).anInt9254
			 * -788450385)) {
		int i_47_ = ((((Class103_Sub2)
			       ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			      .anInt9254) * -788450385
			     - i_36_);
		i_43_ -= i_47_;
		i_36_ = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					   .aClass103_Sub2_9904)).anInt9254
			 * -788450385);
		i_42_ += i_47_ * i_44_;
		i_41_ += i_47_ * i_40_;
	    }
	    if (i_36_ + i_43_ > (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						   .aClass103_Sub2_9904))
				 .anInt9252) * 1546170165)
		i_43_ -= (i_36_ + i_43_
			  - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					       .aClass103_Sub2_9904)).anInt9252
			     * 1546170165));
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_48_ = ((((Class103_Sub2)
			       ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			      .anInt9249) * 1298750001
			     - i);
		i_44_ -= i_48_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_42_ += i_48_;
		i_41_ += i_48_;
		i_46_ += i_48_;
		i_45_ += i_48_;
	    }
	    if (i + i_44_ > (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					       .aClass103_Sub2_9904)).anInt9250
			     * 325436811)) {
		int i_49_ = (i + i_44_
			     - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						  .aClass103_Sub2_9904))
				.anInt9250) * 325436811);
		i_44_ -= i_49_;
		i_46_ += i_49_;
		i_45_ += i_49_;
	    }
	    if (i_44_ > 0 && i_43_ > 0) {
		if (i_39_ == 0) {
		    if (i_37_ == 1) {
			for (int i_50_ = -i_43_; i_50_ < 0; i_50_++) {
			    int i_51_ = i_41_ + i_44_ - 3;
			    while (i_41_ < i_51_) {
				is[i_41_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_42_++]) & 0xff]);
				is[i_41_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_42_++]) & 0xff]);
				is[i_41_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_42_++]) & 0xff]);
				is[i_41_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_42_++]) & 0xff]);
			    }
			    i_51_ += 3;
			    while (i_41_ < i_51_)
				is[i_41_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_42_++]) & 0xff]);
			    i_41_ += i_45_;
			    i_42_ += i_46_;
			}
		    } else if (i_37_ == 0) {
			int i_52_ = (i_38_ & 0xff0000) >> 16;
			int i_53_ = (i_38_ & 0xff00) >> 8;
			int i_54_ = i_38_ & 0xff;
			for (int i_55_ = -i_43_; i_55_ < 0; i_55_++) {
			    for (int i_56_ = -i_44_; i_56_ < 0; i_56_++) {
				int i_57_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_42_++]) & 0xff]);
				int i_58_
				    = (i_57_ & 0xff0000) * i_52_ & ~0xffffff;
				int i_59_
				    = (i_57_ & 0xff00) * i_53_ & 0xff0000;
				int i_60_ = (i_57_ & 0xff) * i_54_ & 0xff00;
				is[i_41_++] = (i_58_ | i_59_ | i_60_) >>> 8;
			    }
			    i_41_ += i_45_;
			    i_42_ += i_46_;
			}
		    } else if (i_37_ == 3) {
			for (int i_61_ = -i_43_; i_61_ < 0; i_61_++) {
			    for (int i_62_ = -i_44_; i_62_ < 0; i_62_++) {
				int i_63_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_42_++]) & 0xff]);
				int i_64_ = i_63_ + i_38_;
				int i_65_
				    = (i_63_ & 0xff00ff) + (i_38_ & 0xff00ff);
				int i_66_ = ((i_65_ & 0x1000100)
					     + (i_64_ - i_65_ & 0x10000));
				is[i_41_++]
				    = i_64_ - i_66_ | i_66_ - (i_66_ >>> 8);
			    }
			    i_41_ += i_45_;
			    i_42_ += i_46_;
			}
		    } else if (i_37_ == 2) {
			int i_67_ = i_38_ >>> 24;
			int i_68_ = 256 - i_67_;
			int i_69_ = (i_38_ & 0xff00ff) * i_68_ & ~0xff00ff;
			int i_70_ = (i_38_ & 0xff00) * i_68_ & 0xff0000;
			i_38_ = (i_69_ | i_70_) >>> 8;
			for (int i_71_ = -i_43_; i_71_ < 0; i_71_++) {
			    for (int i_72_ = -i_44_; i_72_ < 0; i_72_++) {
				int i_73_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_42_++]) & 0xff]);
				i_69_ = (i_73_ & 0xff00ff) * i_67_ & ~0xff00ff;
				i_70_ = (i_73_ & 0xff00) * i_67_ & 0xff0000;
				is[i_41_++] = ((i_69_ | i_70_) >>> 8) + i_38_;
			    }
			    i_41_ += i_45_;
			    i_42_ += i_46_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_39_ == 1) {
		    if (i_37_ == 1) {
			for (int i_74_ = -i_43_; i_74_ < 0; i_74_++) {
			    for (int i_75_ = -i_44_; i_75_ < 0; i_75_++) {
				int i_76_ = (((Class168_Sub2_Sub3) this)
					     .aByteArray11205[i_42_++]);
				if (i_76_ != 0) {
				    int i_77_
					= ((((Class168_Sub2_Sub3) this)
					    .anIntArray11204[i_76_ & 0xff])
					   | ~0xffffff);
				    int i_78_ = 255;
				    int i_79_ = 0;
				    int i_80_ = is[i_41_];
				    is[i_41_++]
					= (((((i_77_ & 0xff00ff) * i_78_
					      + (i_80_ & 0xff00ff) * i_79_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_77_ & ~0xff00ff) >>> 8)
						* i_78_)
					       + (((i_80_ & ~0xff00ff) >>> 8)
						  * i_79_))
					      & ~0xff00ff));
				} else
				    i_41_++;
			    }
			    i_41_ += i_45_;
			    i_42_ += i_46_;
			}
		    } else if (i_37_ == 0) {
			if ((i_38_ & 0xffffff) == 16777215) {
			    int i_81_ = i_38_ >>> 24;
			    int i_82_ = 256 - i_81_;
			    for (int i_83_ = -i_43_; i_83_ < 0; i_83_++) {
				for (int i_84_ = -i_44_; i_84_ < 0; i_84_++) {
				    int i_85_ = (((Class168_Sub2_Sub3) this)
						 .aByteArray11205[i_42_++]);
				    if (i_85_ != 0) {
					int i_86_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204[i_85_ & 0xff]);
					int i_87_ = is[i_41_];
					is[i_41_++]
					    = ((((i_86_ & 0xff00ff) * i_81_
						 + (i_87_ & 0xff00ff) * i_82_)
						& ~0xff00ff)
					       + (((i_86_ & 0xff00) * i_81_
						   + (i_87_ & 0xff00) * i_82_)
						  & 0xff0000)) >> 8;
				    } else
					i_41_++;
				}
				i_41_ += i_45_;
				i_42_ += i_46_;
			    }
			} else {
			    int i_88_ = (i_38_ & 0xff0000) >> 16;
			    int i_89_ = (i_38_ & 0xff00) >> 8;
			    int i_90_ = i_38_ & 0xff;
			    int i_91_ = i_38_ >>> 24;
			    int i_92_ = 256 - i_91_;
			    for (int i_93_ = -i_43_; i_93_ < 0; i_93_++) {
				for (int i_94_ = -i_44_; i_94_ < 0; i_94_++) {
				    int i_95_ = (((Class168_Sub2_Sub3) this)
						 .aByteArray11205[i_42_++]);
				    if (i_95_ != 0) {
					int i_96_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204[i_95_ & 0xff]);
					if (i_91_ != 255) {
					    int i_97_
						= ((i_96_ & 0xff0000) * i_88_
						   & ~0xffffff);
					    int i_98_
						= ((i_96_ & 0xff00) * i_89_
						   & 0xff0000);
					    int i_99_ = ((i_96_ & 0xff) * i_90_
							 & 0xff00);
					    i_96_ = ((i_97_ | i_98_ | i_99_)
						     >>> 8);
					    int i_100_ = is[i_41_];
					    is[i_41_++]
						= ((((i_96_ & 0xff00ff) * i_91_
						     + ((i_100_ & 0xff00ff)
							* i_92_))
						    & ~0xff00ff)
						   + (((i_96_ & 0xff00) * i_91_
						       + ((i_100_ & 0xff00)
							  * i_92_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_101_
						= ((i_96_ & 0xff0000) * i_88_
						   & ~0xffffff);
					    int i_102_
						= ((i_96_ & 0xff00) * i_89_
						   & 0xff0000);
					    int i_103_
						= ((i_96_ & 0xff) * i_90_
						   & 0xff00);
					    is[i_41_++] = (i_101_ | i_102_
							   | i_103_) >>> 8;
					}
				    } else
					i_41_++;
				}
				i_41_ += i_45_;
				i_42_ += i_46_;
			    }
			}
		    } else if (i_37_ == 3) {
			int i_104_ = i_38_ >>> 24;
			int i_105_ = 256 - i_104_;
			for (int i_106_ = -i_43_; i_106_ < 0; i_106_++) {
			    for (int i_107_ = -i_44_; i_107_ < 0; i_107_++) {
				byte i_108_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_42_++]);
				int i_109_ = (i_108_ > 0
					      ? (((Class168_Sub2_Sub3) this)
						 .anIntArray11204[i_108_])
					      : 0);
				int i_110_ = i_109_ + i_38_;
				int i_111_
				    = (i_109_ & 0xff00ff) + (i_38_ & 0xff00ff);
				int i_112_ = ((i_111_ & 0x1000100)
					      + (i_110_ - i_111_ & 0x10000));
				i_112_ = i_110_ - i_112_ | i_112_ - (i_112_
								     >>> 8);
				if (i_109_ == 0 && i_104_ != 255) {
				    i_109_ = i_112_;
				    i_112_ = is[i_41_];
				    i_112_ = ((((i_109_ & 0xff00ff) * i_104_
						+ (i_112_ & 0xff00ff) * i_105_)
					       & ~0xff00ff)
					      + (((i_109_ & 0xff00) * i_104_
						  + (i_112_ & 0xff00) * i_105_)
						 & 0xff0000)) >> 8;
				}
				is[i_41_++] = i_112_;
			    }
			    i_41_ += i_45_;
			    i_42_ += i_46_;
			}
		    } else if (i_37_ == 2) {
			int i_113_ = i_38_ >>> 24;
			int i_114_ = 256 - i_113_;
			int i_115_ = (i_38_ & 0xff00ff) * i_114_ & ~0xff00ff;
			int i_116_ = (i_38_ & 0xff00) * i_114_ & 0xff0000;
			i_38_ = (i_115_ | i_116_) >>> 8;
			for (int i_117_ = -i_43_; i_117_ < 0; i_117_++) {
			    for (int i_118_ = -i_44_; i_118_ < 0; i_118_++) {
				int i_119_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_42_++]);
				if (i_119_ != 0) {
				    int i_120_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_119_ & 0xff]);
				    i_115_ = ((i_120_ & 0xff00ff) * i_113_
					      & ~0xff00ff);
				    i_116_ = ((i_120_ & 0xff00) * i_113_
					      & 0xff0000);
				    is[i_41_++]
					= ((i_115_ | i_116_) >>> 8) + i_38_;
				} else
				    i_41_++;
			    }
			    i_41_ += i_45_;
			    i_42_ += i_46_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_39_ == 2) {
		    if (i_37_ == 1) {
			for (int i_121_ = -i_43_; i_121_ < 0; i_121_++) {
			    for (int i_122_ = -i_44_; i_122_ < 0; i_122_++) {
				int i_123_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_42_++]);
				if (i_123_ != 0) {
				    int i_124_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_123_ & 0xff]);
				    int i_125_ = is[i_41_];
				    int i_126_ = i_124_ + i_125_;
				    int i_127_ = ((i_124_ & 0xff00ff)
						  + (i_125_ & 0xff00ff));
				    i_125_ = ((i_127_ & 0x1000100)
					      + (i_126_ - i_127_ & 0x10000));
				    is[i_41_++]
					= i_126_ - i_125_ | i_125_ - (i_125_
								      >>> 8);
				} else
				    i_41_++;
			    }
			    i_41_ += i_45_;
			    i_42_ += i_46_;
			}
		    } else if (i_37_ == 0) {
			int i_128_ = (i_38_ & 0xff0000) >> 16;
			int i_129_ = (i_38_ & 0xff00) >> 8;
			int i_130_ = i_38_ & 0xff;
			for (int i_131_ = -i_43_; i_131_ < 0; i_131_++) {
			    for (int i_132_ = -i_44_; i_132_ < 0; i_132_++) {
				int i_133_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_42_++]);
				if (i_133_ != 0) {
				    int i_134_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_133_ & 0xff]);
				    int i_135_ = ((i_134_ & 0xff0000) * i_128_
						  & ~0xffffff);
				    int i_136_ = ((i_134_ & 0xff00) * i_129_
						  & 0xff0000);
				    int i_137_
					= (i_134_ & 0xff) * i_130_ & 0xff00;
				    i_134_ = (i_135_ | i_136_ | i_137_) >>> 8;
				    int i_138_ = is[i_41_];
				    int i_139_ = i_134_ + i_138_;
				    int i_140_ = ((i_134_ & 0xff00ff)
						  + (i_138_ & 0xff00ff));
				    i_138_ = ((i_140_ & 0x1000100)
					      + (i_139_ - i_140_ & 0x10000));
				    is[i_41_++]
					= i_139_ - i_138_ | i_138_ - (i_138_
								      >>> 8);
				} else
				    i_41_++;
			    }
			    i_41_ += i_45_;
			    i_42_ += i_46_;
			}
		    } else if (i_37_ == 3) {
			for (int i_141_ = -i_43_; i_141_ < 0; i_141_++) {
			    for (int i_142_ = -i_44_; i_142_ < 0; i_142_++) {
				byte i_143_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_42_++]);
				int i_144_ = (i_143_ > 0
					      ? (((Class168_Sub2_Sub3) this)
						 .anIntArray11204[i_143_])
					      : 0);
				int i_145_ = i_144_ + i_38_;
				int i_146_
				    = (i_144_ & 0xff00ff) + (i_38_ & 0xff00ff);
				int i_147_ = ((i_146_ & 0x1000100)
					      + (i_145_ - i_146_ & 0x10000));
				i_144_ = i_145_ - i_147_ | i_147_ - (i_147_
								     >>> 8);
				i_147_ = is[i_41_];
				i_145_ = i_144_ + i_147_;
				i_146_ = (i_144_ & 0xff00ff) + (i_147_
								& 0xff00ff);
				i_147_
				    = (i_146_ & 0x1000100) + (i_145_ - i_146_
							      & 0x10000);
				is[i_41_++]
				    = i_145_ - i_147_ | i_147_ - (i_147_
								  >>> 8);
			    }
			    i_41_ += i_45_;
			    i_42_ += i_46_;
			}
		    } else if (i_37_ == 2) {
			int i_148_ = i_38_ >>> 24;
			int i_149_ = 256 - i_148_;
			int i_150_ = (i_38_ & 0xff00ff) * i_149_ & ~0xff00ff;
			int i_151_ = (i_38_ & 0xff00) * i_149_ & 0xff0000;
			i_38_ = (i_150_ | i_151_) >>> 8;
			for (int i_152_ = -i_43_; i_152_ < 0; i_152_++) {
			    for (int i_153_ = -i_44_; i_153_ < 0; i_153_++) {
				int i_154_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_42_++]);
				if (i_154_ != 0) {
				    int i_155_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_154_ & 0xff]);
				    i_150_ = ((i_155_ & 0xff00ff) * i_148_
					      & ~0xff00ff);
				    i_151_ = ((i_155_ & 0xff00) * i_148_
					      & 0xff0000);
				    i_155_ = ((i_150_ | i_151_) >>> 8) + i_38_;
				    int i_156_ = is[i_41_];
				    int i_157_ = i_155_ + i_156_;
				    int i_158_ = ((i_155_ & 0xff00ff)
						  + (i_156_ & 0xff00ff));
				    i_156_ = ((i_158_ & 0x1000100)
					      + (i_157_ - i_158_ & 0x10000));
				    is[i_41_++]
					= i_157_ - i_156_ | i_156_ - (i_156_
								      >>> 8);
				} else
				    i_41_++;
			    }
			    i_41_ += i_45_;
			    i_42_ += i_46_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method3679(int i, int i_159_, Class135 class135, int i_160_,
			   int i_161_) {
	if (((Class168_Sub2_Sub3) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    i += ((Class168_Sub2_Sub3) this).anInt9907;
	    i_159_ += ((Class168_Sub2_Sub3) this).anInt9905;
	    int i_162_ = 0;
	    int i_163_ = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					    .aClass103_Sub2_9904)).anInt9260
			  * -1826993761);
	    int i_164_ = ((Class168_Sub2_Sub3) this).anInt9920;
	    int i_165_ = ((Class168_Sub2_Sub3) this).anInt9916;
	    int i_166_ = i_163_ - i_164_;
	    int i_167_ = 0;
	    int i_168_ = i + i_159_ * i_163_;
	    if (i_159_ < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					    .aClass103_Sub2_9904)).anInt9254
			  * -788450385)) {
		int i_169_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9254) * -788450385
			      - i_159_);
		i_165_ -= i_169_;
		i_159_ = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					    .aClass103_Sub2_9904)).anInt9254
			  * -788450385);
		i_162_ += i_169_ * i_164_;
		i_168_ += i_169_ * i_163_;
	    }
	    if (i_159_ + i_165_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_165_ -= (i_159_ + i_165_
			   - (((Class103_Sub2)
			       ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			      .anInt9252) * 1546170165);
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_170_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9249) * 1298750001
			      - i);
		i_164_ -= i_170_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_162_ += i_170_;
		i_168_ += i_170_;
		i_167_ += i_170_;
		i_166_ += i_170_;
	    }
	    if (i + i_164_ > (((Class103_Sub2)
			       ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			      .anInt9250) * 325436811) {
		int i_171_ = (i + i_164_
			      - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						   .aClass103_Sub2_9904))
				 .anInt9250) * 325436811);
		i_164_ -= i_171_;
		i_167_ += i_171_;
		i_166_ += i_171_;
	    }
	    if (i_164_ > 0 && i_165_ > 0) {
		Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
		int[] is_172_ = ((Class135_Sub1) class135_sub1).anIntArray9874;
		int[] is_173_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
		int i_174_ = i_159_;
		if (i_161_ > i_174_) {
		    i_174_ = i_161_;
		    i_168_ += (i_161_ - i_159_) * i_163_;
		    i_162_ += ((i_161_ - i_159_)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
		}
		int i_175_ = (i_161_ + is_172_.length < i_159_ + i_165_
			      ? i_161_ + is_172_.length : i_159_ + i_165_);
		for (int i_176_ = i_174_; i_176_ < i_175_; i_176_++) {
		    int i_177_ = is_172_[i_176_ - i_161_] + i_160_;
		    int i_178_ = is_173_[i_176_ - i_161_];
		    int i_179_ = i_164_;
		    if (i > i_177_) {
			int i_180_ = i - i_177_;
			if (i_180_ >= i_178_) {
			    i_162_ += i_164_ + i_167_;
			    i_168_ += i_164_ + i_166_;
			    continue;
			}
			i_178_ -= i_180_;
		    } else {
			int i_181_ = i_177_ - i;
			if (i_181_ >= i_164_) {
			    i_162_ += i_164_ + i_167_;
			    i_168_ += i_164_ + i_166_;
			    continue;
			}
			i_162_ += i_181_;
			i_179_ -= i_181_;
			i_168_ += i_181_;
		    }
		    int i_182_ = 0;
		    if (i_179_ < i_178_)
			i_178_ = i_179_;
		    else
			i_182_ = i_179_ - i_178_;
		    for (int i_183_ = -i_178_; i_183_ < 0; i_183_++) {
			int i_184_ = (((Class168_Sub2_Sub3) this)
				      .aByteArray11205[i_162_++]);
			if (i_184_ != 0)
			    is[i_168_++] = (((Class168_Sub2_Sub3) this)
					    .anIntArray11204[i_184_ & 0xff]);
			else
			    i_168_++;
		    }
		    i_162_ += i_182_ + i_167_;
		    i_168_ += i_182_ + i_166_;
		}
	    }
	}
    }
    
    void method16221(boolean bool, boolean bool_185_, boolean bool_186_, int i,
		     int i_187_, float f, int i_188_, int i_189_, int i_190_,
		     int i_191_, int i_192_, int i_193_, boolean bool_194_) {
	if (i_188_ > 0 && i_189_ > 0 && (bool || bool_185_)) {
	    int i_195_ = 0;
	    int i_196_ = 0;
	    int i_197_ = (((Class168_Sub2_Sub3) this).anInt9907
			  + ((Class168_Sub2_Sub3) this).anInt9920
			  + ((Class168_Sub2_Sub3) this).anInt9909);
	    int i_198_ = (((Class168_Sub2_Sub3) this).anInt9905
			  + ((Class168_Sub2_Sub3) this).anInt9916
			  + ((Class168_Sub2_Sub3) this).anInt9910);
	    int i_199_ = (i_197_ << 16) / i_188_;
	    int i_200_ = (i_198_ << 16) / i_189_;
	    if (((Class168_Sub2_Sub3) this).anInt9907 > 0) {
		int i_201_ = (((((Class168_Sub2_Sub3) this).anInt9907 << 16)
			       + i_199_ - 1)
			      / i_199_);
		i += i_201_;
		i_195_
		    += i_201_ * i_199_ - (((Class168_Sub2_Sub3) this).anInt9907
					  << 16);
	    }
	    if (((Class168_Sub2_Sub3) this).anInt9905 > 0) {
		int i_202_ = (((((Class168_Sub2_Sub3) this).anInt9905 << 16)
			       + i_200_ - 1)
			      / i_200_);
		i_187_ += i_202_;
		i_196_
		    += i_202_ * i_200_ - (((Class168_Sub2_Sub3) this).anInt9905
					  << 16);
	    }
	    if (((Class168_Sub2_Sub3) this).anInt9920 < i_197_)
		i_188_ = ((((Class168_Sub2_Sub3) this).anInt9920 << 16)
			  - i_195_ + i_199_ - 1) / i_199_;
	    if (((Class168_Sub2_Sub3) this).anInt9916 < i_198_)
		i_189_ = ((((Class168_Sub2_Sub3) this).anInt9916 << 16)
			  - i_196_ + i_200_ - 1) / i_200_;
	    int i_203_
		= i + i_187_ * ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						   .aClass103_Sub2_9904))
				 .anInt9260)
				* -1826993761);
	    int i_204_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761)
			  - i_188_);
	    if (i_187_ + i_189_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_189_ -= (i_187_ + i_189_
			   - (((Class103_Sub2)
			       ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			      .anInt9252) * 1546170165);
	    if (i_187_ < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					    .aClass103_Sub2_9904)).anInt9254
			  * -788450385)) {
		int i_205_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9254) * -788450385
			      - i_187_);
		i_189_ -= i_205_;
		i_203_
		    += i_205_ * ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						    .aClass103_Sub2_9904))
				  .anInt9260)
				 * -1826993761);
		i_196_ += i_200_ * i_205_;
	    }
	    if (i + i_188_ > (((Class103_Sub2)
			       ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			      .anInt9250) * 325436811) {
		int i_206_ = (i + i_188_
			      - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						   .aClass103_Sub2_9904))
				 .anInt9250) * 325436811);
		i_188_ -= i_206_;
		i_204_ += i_206_;
	    }
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_207_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9249) * 1298750001
			      - i);
		i_188_ -= i_207_;
		i_203_ += i_207_;
		i_195_ += i_199_ * i_207_;
		i_204_ += i_207_;
	    }
	    float[] fs = (((Class103_Sub2)
			   ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			  .aFloatArray9248);
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (i_192_ == 0) {
		if (i_190_ == 1) {
		    int i_208_ = i_195_;
		    for (int i_209_ = -i_189_; i_209_ < 0; i_209_++) {
			int i_210_ = ((i_196_ >> 16)
				      * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_211_ = -i_188_; i_211_ < 0; i_211_++) {
			    if (!bool_185_ || f < fs[i_203_]) {
				if (bool)
				    is[i_203_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_195_ >> 16) + i_210_])
					     & 0xff)]);
				if (bool_185_ && bool_194_)
				    fs[i_203_] = f;
			    }
			    i_195_ += i_199_;
			    i_203_++;
			}
			i_196_ += i_200_;
			i_195_ = i_208_;
			i_203_ += i_204_;
		    }
		} else if (i_190_ == 0) {
		    int i_212_ = (i_191_ & 0xff0000) >> 16;
		    int i_213_ = (i_191_ & 0xff00) >> 8;
		    int i_214_ = i_191_ & 0xff;
		    int i_215_ = i_195_;
		    for (int i_216_ = -i_189_; i_216_ < 0; i_216_++) {
			int i_217_ = ((i_196_ >> 16)
				      * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_218_ = -i_188_; i_218_ < 0; i_218_++) {
			    if (!bool_185_ || f < fs[i_203_]) {
				if (bool) {
				    int i_219_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_195_ >> 16) + i_217_])
					     & 0xff)]);
				    int i_220_ = ((i_219_ & 0xff0000) * i_212_
						  & ~0xffffff);
				    int i_221_ = ((i_219_ & 0xff00) * i_213_
						  & 0xff0000);
				    int i_222_
					= (i_219_ & 0xff) * i_214_ & 0xff00;
				    is[i_203_]
					= (i_220_ | i_221_ | i_222_) >>> 8;
				}
				if (bool_185_ && bool_194_)
				    fs[i_203_] = f;
			    }
			    i_195_ += i_199_;
			    i_203_++;
			}
			i_196_ += i_200_;
			i_195_ = i_215_;
			i_203_ += i_204_;
		    }
		} else if (i_190_ == 3) {
		    int i_223_ = i_195_;
		    for (int i_224_ = -i_189_; i_224_ < 0; i_224_++) {
			int i_225_ = ((i_196_ >> 16)
				      * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_226_ = -i_188_; i_226_ < 0; i_226_++) {
			    if (!bool_185_ || f < fs[i_203_]) {
				if (bool) {
				    byte i_227_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205
						   [(i_195_ >> 16) + i_225_]);
				    int i_228_
					= (i_227_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_227_])
					   : 0);
				    int i_229_ = i_228_ + i_191_;
				    int i_230_ = ((i_228_ & 0xff00ff)
						  + (i_191_ & 0xff00ff));
				    int i_231_
					= ((i_230_ & 0x1000100)
					   + (i_229_ - i_230_ & 0x10000));
				    is[i_203_]
					= i_229_ - i_231_ | i_231_ - (i_231_
								      >>> 8);
				}
				if (bool_185_ && bool_194_)
				    fs[i_203_] = f;
			    }
			    i_195_ += i_199_;
			    i_203_++;
			}
			i_196_ += i_200_;
			i_195_ = i_223_;
			i_203_ += i_204_;
		    }
		} else if (i_190_ == 2) {
		    int i_232_ = i_191_ >>> 24;
		    int i_233_ = 256 - i_232_;
		    int i_234_ = (i_191_ & 0xff00ff) * i_233_ & ~0xff00ff;
		    int i_235_ = (i_191_ & 0xff00) * i_233_ & 0xff0000;
		    i_191_ = (i_234_ | i_235_) >>> 8;
		    int i_236_ = i_195_;
		    for (int i_237_ = -i_189_; i_237_ < 0; i_237_++) {
			int i_238_ = ((i_196_ >> 16)
				      * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_239_ = -i_188_; i_239_ < 0; i_239_++) {
			    if (!bool_185_ || f < fs[i_203_]) {
				if (bool) {
				    int i_240_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_195_ >> 16) + i_238_])
					     & 0xff)]);
				    i_234_ = ((i_240_ & 0xff00ff) * i_232_
					      & ~0xff00ff);
				    i_235_ = ((i_240_ & 0xff00) * i_232_
					      & 0xff0000);
				    is[i_203_]
					= ((i_234_ | i_235_) >>> 8) + i_191_;
				}
				if (bool_185_ && bool_194_)
				    fs[i_203_] = f;
			    }
			    i_195_ += i_199_;
			    i_203_++;
			}
			i_196_ += i_200_;
			i_195_ = i_236_;
			i_203_ += i_204_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_192_ == 1) {
		if (i_190_ == 1) {
		    int i_241_ = i_195_;
		    for (int i_242_ = -i_189_; i_242_ < 0; i_242_++) {
			int i_243_ = ((i_196_ >> 16)
				      * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_244_ = -i_188_; i_244_ < 0; i_244_++) {
			    if (!bool_185_ || f < fs[i_203_]) {
				int i_245_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_195_ >> 16) + i_243_]);
				if (i_245_ != 0) {
				    if (bool)
					is[i_203_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_245_ & 0xff]);
				    if (bool_185_ && bool_194_)
					fs[i_203_] = f;
				}
			    }
			    i_195_ += i_199_;
			    i_203_++;
			}
			i_196_ += i_200_;
			i_195_ = i_241_;
			i_203_ += i_204_;
		    }
		} else if (i_190_ == 0) {
		    int i_246_ = i_195_;
		    if ((i_191_ & 0xffffff) == 16777215) {
			int i_247_ = i_191_ >>> 24;
			int i_248_ = 256 - i_247_;
			for (int i_249_ = -i_189_; i_249_ < 0; i_249_++) {
			    int i_250_
				= ((i_196_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_251_ = -i_188_; i_251_ < 0; i_251_++) {
				if (!bool_185_ || f < fs[i_203_]) {
				    int i_252_ = (((Class168_Sub2_Sub3) this)
						  .aByteArray11205
						  [(i_195_ >> 16) + i_250_]);
				    if (i_252_ != 0) {
					if (bool) {
					    int i_253_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_252_ & 0xff]);
					    int i_254_ = is[i_203_];
					    is[i_203_]
						= (((((i_253_ & 0xff00ff)
						      * i_247_)
						     + ((i_254_ & 0xff00ff)
							* i_248_))
						    & ~0xff00ff)
						   + ((((i_253_ & 0xff00)
							* i_247_)
						       + ((i_254_ & 0xff00)
							  * i_248_))
						      & 0xff0000)) >> 8;
					}
					if (bool_185_ && bool_194_)
					    fs[i_203_] = f;
				    }
				}
				i_195_ += i_199_;
				i_203_++;
			    }
			    i_196_ += i_200_;
			    i_195_ = i_246_;
			    i_203_ += i_204_;
			}
		    } else {
			int i_255_ = (i_191_ & 0xff0000) >> 16;
			int i_256_ = (i_191_ & 0xff00) >> 8;
			int i_257_ = i_191_ & 0xff;
			int i_258_ = i_191_ >>> 24;
			int i_259_ = 256 - i_258_;
			for (int i_260_ = -i_189_; i_260_ < 0; i_260_++) {
			    int i_261_
				= ((i_196_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_262_ = -i_188_; i_262_ < 0; i_262_++) {
				if (!bool_185_ || f < fs[i_203_]) {
				    int i_263_ = (((Class168_Sub2_Sub3) this)
						  .aByteArray11205
						  [(i_195_ >> 16) + i_261_]);
				    if (i_263_ != 0) {
					int i_264_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_263_ & 0xff]);
					if (i_258_ != 255) {
					    if (bool) {
						int i_265_
						    = (((i_264_ & 0xff0000)
							* i_255_)
						       & ~0xffffff);
						int i_266_
						    = (((i_264_ & 0xff00)
							* i_256_)
						       & 0xff0000);
						int i_267_
						    = ((i_264_ & 0xff) * i_257_
						       & 0xff00);
						i_264_ = (i_265_ | i_266_
							  | i_267_) >>> 8;
						int i_268_ = is[i_203_];
						is[i_203_]
						    = (((((i_264_ & 0xff00ff)
							  * i_258_)
							 + ((i_268_ & 0xff00ff)
							    * i_259_))
							& ~0xff00ff)
						       + ((((i_264_ & 0xff00)
							    * i_258_)
							   + ((i_268_ & 0xff00)
							      * i_259_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_185_ && bool_194_)
						fs[i_203_] = f;
					} else {
					    if (bool) {
						int i_269_
						    = (((i_264_ & 0xff0000)
							* i_255_)
						       & ~0xffffff);
						int i_270_
						    = (((i_264_ & 0xff00)
							* i_256_)
						       & 0xff0000);
						int i_271_
						    = ((i_264_ & 0xff) * i_257_
						       & 0xff00);
						is[i_203_] = (i_269_ | i_270_
							      | i_271_) >>> 8;
					    }
					    if (bool_185_ && bool_194_)
						fs[i_203_] = f;
					}
				    }
				}
				i_195_ += i_199_;
				i_203_++;
			    }
			    i_196_ += i_200_;
			    i_195_ = i_246_;
			    i_203_ += i_204_;
			}
		    }
		} else if (i_190_ == 3) {
		    int i_272_ = i_195_;
		    int i_273_ = i_191_ >>> 24;
		    int i_274_ = 256 - i_273_;
		    for (int i_275_ = -i_189_; i_275_ < 0; i_275_++) {
			int i_276_ = ((i_196_ >> 16)
				      * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_277_ = -i_188_; i_277_ < 0; i_277_++) {
			    if (!bool_185_ || f < fs[i_203_]) {
				if (bool) {
				    byte i_278_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205
						   [(i_195_ >> 16) + i_276_]);
				    int i_279_
					= (i_278_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_278_])
					   : 0);
				    int i_280_ = i_279_ + i_191_;
				    int i_281_ = ((i_279_ & 0xff00ff)
						  + (i_191_ & 0xff00ff));
				    int i_282_
					= ((i_281_ & 0x1000100)
					   + (i_280_ - i_281_ & 0x10000));
				    i_282_
					= i_280_ - i_282_ | i_282_ - (i_282_
								      >>> 8);
				    if (i_279_ == 0 && i_273_ != 255) {
					i_279_ = i_282_;
					i_282_ = is[i_203_];
					i_282_
					    = ((((i_279_ & 0xff00ff) * i_273_
						 + ((i_282_ & 0xff00ff)
						    * i_274_))
						& ~0xff00ff)
					       + (((i_279_ & 0xff00) * i_273_
						   + ((i_282_ & 0xff00)
						      * i_274_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_203_] = i_282_;
				}
				if (bool_185_ && bool_194_)
				    fs[i_203_] = f;
			    }
			    i_195_ += i_199_;
			    i_203_++;
			}
			i_196_ += i_200_;
			i_195_ = i_272_;
			i_203_ += i_204_;
		    }
		} else if (i_190_ == 2) {
		    int i_283_ = i_191_ >>> 24;
		    int i_284_ = 256 - i_283_;
		    int i_285_ = (i_191_ & 0xff00ff) * i_284_ & ~0xff00ff;
		    int i_286_ = (i_191_ & 0xff00) * i_284_ & 0xff0000;
		    i_191_ = (i_285_ | i_286_) >>> 8;
		    int i_287_ = i_195_;
		    for (int i_288_ = -i_189_; i_288_ < 0; i_288_++) {
			int i_289_ = ((i_196_ >> 16)
				      * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_290_ = -i_188_; i_290_ < 0; i_290_++) {
			    if (!bool_185_ || f < fs[i_203_]) {
				int i_291_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_195_ >> 16) + i_289_]);
				if (i_291_ != 0) {
				    if (bool) {
					int i_292_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_291_ & 0xff]);
					i_285_ = ((i_292_ & 0xff00ff) * i_283_
						  & ~0xff00ff);
					i_286_ = ((i_292_ & 0xff00) * i_283_
						  & 0xff0000);
					is[i_203_] = (((i_285_ | i_286_) >>> 8)
						      + i_191_);
				    }
				    if (bool_185_ && bool_194_)
					fs[i_203_] = f;
				}
			    }
			    i_195_ += i_199_;
			    i_203_++;
			}
			i_196_ += i_200_;
			i_195_ = i_287_;
			i_203_ += i_204_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_192_ == 2) {
		if (i_190_ == 1) {
		    int i_293_ = i_195_;
		    for (int i_294_ = -i_189_; i_294_ < 0; i_294_++) {
			int i_295_ = ((i_196_ >> 16)
				      * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_296_ = -i_188_; i_296_ < 0; i_296_++) {
			    if (!bool_185_ || f < fs[i_203_]) {
				int i_297_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_195_ >> 16) + i_295_]);
				if (i_297_ != 0) {
				    if (bool) {
					int i_298_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_297_ & 0xff]);
					int i_299_ = is[i_203_];
					int i_300_ = i_298_ + i_299_;
					int i_301_ = ((i_298_ & 0xff00ff)
						      + (i_299_ & 0xff00ff));
					i_299_
					    = ((i_301_ & 0x1000100)
					       + (i_300_ - i_301_ & 0x10000));
					is[i_203_]
					    = (i_300_ - i_299_
					       | i_299_ - (i_299_ >>> 8));
				    }
				    if (bool_185_ && bool_194_)
					fs[i_203_] = f;
				}
			    }
			    i_195_ += i_199_;
			    i_203_++;
			}
			i_196_ += i_200_;
			i_195_ = i_293_;
			i_203_ += i_204_;
		    }
		} else if (i_190_ == 0) {
		    int i_302_ = i_195_;
		    int i_303_ = (i_191_ & 0xff0000) >> 16;
		    int i_304_ = (i_191_ & 0xff00) >> 8;
		    int i_305_ = i_191_ & 0xff;
		    for (int i_306_ = -i_189_; i_306_ < 0; i_306_++) {
			int i_307_ = ((i_196_ >> 16)
				      * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_308_ = -i_188_; i_308_ < 0; i_308_++) {
			    if (!bool_185_ || f < fs[i_203_]) {
				int i_309_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_195_ >> 16) + i_307_]);
				if (i_309_ != 0) {
				    if (bool) {
					int i_310_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_309_ & 0xff]);
					int i_311_
					    = ((i_310_ & 0xff0000) * i_303_
					       & ~0xffffff);
					int i_312_
					    = ((i_310_ & 0xff00) * i_304_
					       & 0xff0000);
					int i_313_ = ((i_310_ & 0xff) * i_305_
						      & 0xff00);
					i_310_
					    = (i_311_ | i_312_ | i_313_) >>> 8;
					int i_314_ = is[i_203_];
					int i_315_ = i_310_ + i_314_;
					int i_316_ = ((i_310_ & 0xff00ff)
						      + (i_314_ & 0xff00ff));
					i_314_
					    = ((i_316_ & 0x1000100)
					       + (i_315_ - i_316_ & 0x10000));
					is[i_203_]
					    = (i_315_ - i_314_
					       | i_314_ - (i_314_ >>> 8));
				    }
				    if (bool_185_ && bool_194_)
					fs[i_203_] = f;
				}
			    }
			    i_195_ += i_199_;
			    i_203_++;
			}
			i_196_ += i_200_;
			i_195_ = i_302_;
			i_203_ += i_204_;
		    }
		} else if (i_190_ == 3) {
		    int i_317_ = i_195_;
		    for (int i_318_ = -i_189_; i_318_ < 0; i_318_++) {
			int i_319_ = ((i_196_ >> 16)
				      * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_320_ = -i_188_; i_320_ < 0; i_320_++) {
			    if (!bool_185_ || f < fs[i_203_]) {
				if (bool) {
				    byte i_321_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205
						   [(i_195_ >> 16) + i_319_]);
				    int i_322_
					= (i_321_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_321_])
					   : 0);
				    int i_323_ = i_322_ + i_191_;
				    int i_324_ = ((i_322_ & 0xff00ff)
						  + (i_191_ & 0xff00ff));
				    int i_325_
					= ((i_324_ & 0x1000100)
					   + (i_323_ - i_324_ & 0x10000));
				    i_322_
					= i_323_ - i_325_ | i_325_ - (i_325_
								      >>> 8);
				    i_325_ = is[i_203_];
				    i_323_ = i_322_ + i_325_;
				    i_324_
					= (i_322_ & 0xff00ff) + (i_325_
								 & 0xff00ff);
				    i_325_ = ((i_324_ & 0x1000100)
					      + (i_323_ - i_324_ & 0x10000));
				    is[i_203_]
					= i_323_ - i_325_ | i_325_ - (i_325_
								      >>> 8);
				}
				if (bool_185_ && bool_194_)
				    fs[i_203_] = f;
			    }
			    i_195_ += i_199_;
			    i_203_++;
			}
			i_196_ += i_200_;
			i_195_ = i_317_;
			i_203_ += i_204_;
		    }
		} else if (i_190_ == 2) {
		    int i_326_ = i_191_ >>> 24;
		    int i_327_ = 256 - i_326_;
		    int i_328_ = (i_191_ & 0xff00ff) * i_327_ & ~0xff00ff;
		    int i_329_ = (i_191_ & 0xff00) * i_327_ & 0xff0000;
		    i_191_ = (i_328_ | i_329_) >>> 8;
		    int i_330_ = i_195_;
		    for (int i_331_ = -i_189_; i_331_ < 0; i_331_++) {
			int i_332_ = ((i_196_ >> 16)
				      * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_333_ = -i_188_; i_333_ < 0; i_333_++) {
			    if (!bool_185_ || f < fs[i_203_]) {
				int i_334_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_195_ >> 16) + i_332_]);
				if (i_334_ != 0) {
				    if (bool) {
					int i_335_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_334_ & 0xff]);
					i_328_ = ((i_335_ & 0xff00ff) * i_326_
						  & ~0xff00ff);
					i_329_ = ((i_335_ & 0xff00) * i_326_
						  & 0xff0000);
					i_335_ = (((i_328_ | i_329_) >>> 8)
						  + i_191_);
					int i_336_ = is[i_203_];
					int i_337_ = i_335_ + i_336_;
					int i_338_ = ((i_335_ & 0xff00ff)
						      + (i_336_ & 0xff00ff));
					i_336_
					    = ((i_338_ & 0x1000100)
					       + (i_337_ - i_338_ & 0x10000));
					is[i_203_]
					    = (i_337_ - i_336_
					       | i_336_ - (i_336_ >>> 8));
				    }
				    if (bool_185_ && bool_194_)
					fs[i_203_] = f;
				}
			    }
			    i_195_ += i_199_;
			    i_203_++;
			}
			i_196_ += i_200_;
			i_195_ = i_330_;
			i_203_ += i_204_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method16222(int i, int i_339_) {
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_340_ = anInt9919;
		    while (i_340_ < 0) {
			int i_341_ = anInt9925;
			int i_342_ = anInt9927;
			int i_343_ = anInt9928;
			int i_344_ = anInt9906;
			if (i_342_ >= 0 && i_343_ >= 0
			    && i_342_ - (((Class168_Sub2_Sub3) this).anInt9920
					 << 12) < 0
			    && i_343_ - (((Class168_Sub2_Sub3) this).anInt9916
					 << 12) < 0) {
			    for (/**/; i_344_ < 0; i_344_++) {
				int i_345_
				    = ((i_343_ >> 12) * ((Class168_Sub2_Sub3)
							 this).anInt9920
				       + (i_342_ >> 12));
				int i_346_ = i_341_++;
				if (i_339_ == 0) {
				    if (i == 1)
					is[i_346_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_345_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_347_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_345_])
						 & 0xff)]);
					int i_348_
					    = ((i_347_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_349_
					    = ((i_347_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_350_
					    = ((i_347_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_346_]
					    = (i_348_ | i_349_ | i_350_) >>> 8;
				    } else if (i == 3) {
					int i_351_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_345_])
						 & 0xff)]);
					int i_352_ = anInt9931;
					int i_353_ = i_351_ + i_352_;
					int i_354_ = ((i_351_ & 0xff00ff)
						      + (i_352_ & 0xff00ff));
					int i_355_
					    = ((i_354_ & 0x1000100)
					       + (i_353_ - i_354_ & 0x10000));
					is[i_346_]
					    = (i_353_ - i_355_
					       | i_355_ - (i_355_ >>> 8));
				    } else if (i == 2) {
					int i_356_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_345_])
						 & 0xff)]);
					int i_357_
					    = ((i_356_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_358_
					    = ((i_356_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_346_] = (((i_357_ | i_358_) >>> 8)
						      + anInt9939);
				    } else
					throw new IllegalArgumentException();
				} else if (i_339_ == 1) {
				    if (i == 1) {
					int i_359_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_345_]);
					if (i_359_ != 0)
					    is[i_346_]
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_359_ & 0xff]);
				    } else if (i == 0) {
					int i_360_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_345_]);
					if (i_360_ != 0) {
					    int i_361_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_360_ & 0xff]);
					    if ((anInt9931 & 0xffffff)
						== 16777215) {
						int i_362_ = anInt9931 >>> 24;
						int i_363_ = 256 - i_362_;
						int i_364_ = is[i_346_];
						is[i_346_]
						    = (((((i_361_ & 0xff00ff)
							  * i_362_)
							 + ((i_364_ & 0xff00ff)
							    * i_363_))
							& ~0xff00ff)
						       + ((((i_361_ & 0xff00)
							    * i_362_)
							   + ((i_364_ & 0xff00)
							      * i_363_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9932 != 255) {
						int i_365_
						    = (((i_361_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_366_
						    = (((i_361_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_367_ = (((i_361_ & 0xff)
							       * anInt9936)
							      & 0xff00);
						i_361_ = (i_365_ | i_366_
							  | i_367_) >>> 8;
						int i_368_ = is[i_346_];
						is[i_346_]
						    = (((((i_361_ & 0xff00ff)
							  * anInt9932)
							 + ((i_368_ & 0xff00ff)
							    * anInt9937))
							& ~0xff00ff)
						       + ((((i_361_ & 0xff00)
							    * anInt9932)
							   + ((i_368_ & 0xff00)
							      * anInt9937))
							  & 0xff0000)) >> 8;
					    } else {
						int i_369_
						    = (((i_361_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_370_
						    = (((i_361_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_371_ = (((i_361_ & 0xff)
							       * anInt9936)
							      & 0xff00);
						is[i_346_] = (i_369_ | i_370_
							      | i_371_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_372_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_345_]);
					int i_373_
					    = (i_372_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_372_])
					       : 0);
					int i_374_ = anInt9931;
					int i_375_ = i_373_ + i_374_;
					int i_376_ = ((i_373_ & 0xff00ff)
						      + (i_374_ & 0xff00ff));
					int i_377_
					    = ((i_376_ & 0x1000100)
					       + (i_375_ - i_376_ & 0x10000));
					i_377_ = (i_375_ - i_377_
						  | i_377_ - (i_377_ >>> 8));
					if (i_373_ == 0 && anInt9932 != 255) {
					    i_373_ = i_377_;
					    i_377_ = is[i_346_];
					    i_377_ = (((((i_373_ & 0xff00ff)
							 * anInt9932)
							+ ((i_377_ & 0xff00ff)
							   * anInt9937))
						       & ~0xff00ff)
						      + ((((i_373_ & 0xff00)
							   * anInt9932)
							  + ((i_377_ & 0xff00)
							     * anInt9937))
							 & 0xff0000)) >> 8;
					}
					is[i_346_] = i_377_;
				    } else if (i == 2) {
					int i_378_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_345_]);
					if (i_378_ != 0) {
					    int i_379_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_378_ & 0xff]);
					    int i_380_ = (((i_379_ & 0xff00ff)
							   * anInt9932)
							  & ~0xff00ff);
					    int i_381_ = (((i_379_ & 0xff00)
							   * anInt9932)
							  & 0xff0000);
					    is[i_346_++] = ((i_380_ | i_381_)
							    >>> 8) + anInt9939;
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_339_ == 2) {
				    if (i == 1) {
					int i_382_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_345_]);
					if (i_382_ != 0) {
					    int i_383_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_382_ & 0xff]);
					    int i_384_ = is[i_346_];
					    int i_385_ = i_383_ + i_384_;
					    int i_386_
						= ((i_383_ & 0xff00ff)
						   + (i_384_ & 0xff00ff));
					    i_384_ = ((i_386_ & 0x1000100)
						      + (i_385_ - i_386_
							 & 0x10000));
					    is[i_346_]
						= (i_385_ - i_384_
						   | i_384_ - (i_384_ >>> 8));
					}
				    } else if (i == 0) {
					int i_387_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_345_]);
					if (i_387_ != 0) {
					    int i_388_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_387_ & 0xff]);
					    int i_389_ = (((i_388_ & 0xff0000)
							   * anInt9934)
							  & ~0xffffff);
					    int i_390_ = (((i_388_ & 0xff00)
							   * anInt9913)
							  & 0xff0000);
					    int i_391_
						= ((i_388_ & 0xff) * anInt9936
						   & 0xff00);
					    i_388_ = (i_389_ | i_390_
						      | i_391_) >>> 8;
					    int i_392_ = is[i_346_];
					    int i_393_ = i_388_ + i_392_;
					    int i_394_
						= ((i_388_ & 0xff00ff)
						   + (i_392_ & 0xff00ff));
					    i_392_ = ((i_394_ & 0x1000100)
						      + (i_393_ - i_394_
							 & 0x10000));
					    is[i_346_]
						= (i_393_ - i_392_
						   | i_392_ - (i_392_ >>> 8));
					}
				    } else if (i == 3) {
					byte i_395_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_345_]);
					int i_396_
					    = (i_395_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_395_])
					       : 0);
					int i_397_ = anInt9931;
					int i_398_ = i_396_ + i_397_;
					int i_399_ = ((i_396_ & 0xff00ff)
						      + (i_397_ & 0xff00ff));
					int i_400_
					    = ((i_399_ & 0x1000100)
					       + (i_398_ - i_399_ & 0x10000));
					i_400_ = (i_398_ - i_400_
						  | i_400_ - (i_400_ >>> 8));
					if (i_396_ == 0 && anInt9932 != 255) {
					    i_396_ = i_400_;
					    i_400_ = is[i_346_];
					    i_400_ = (((((i_396_ & 0xff00ff)
							 * anInt9932)
							+ ((i_400_ & 0xff00ff)
							   * anInt9937))
						       & ~0xff00ff)
						      + ((((i_396_ & 0xff00)
							   * anInt9932)
							  + ((i_400_ & 0xff00)
							     * anInt9937))
							 & 0xff0000)) >> 8;
					}
					is[i_346_] = i_400_;
				    } else if (i == 2) {
					int i_401_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_345_]);
					if (i_401_ != 0) {
					    int i_402_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_401_ & 0xff]);
					    int i_403_ = (((i_402_ & 0xff00ff)
							   * anInt9932)
							  & ~0xff00ff);
					    int i_404_ = (((i_402_ & 0xff00)
							   * anInt9932)
							  & 0xff0000);
					    i_402_ = (((i_403_ | i_404_) >>> 8)
						      + anInt9939);
					    int i_405_ = is[i_346_];
					    int i_406_ = i_402_ + i_405_;
					    int i_407_
						= ((i_402_ & 0xff00ff)
						   + (i_405_ & 0xff00ff));
					    i_405_ = ((i_407_ & 0x1000100)
						      + (i_406_ - i_407_
							 & 0x10000));
					    is[i_346_]
						= (i_406_ - i_405_
						   | i_405_ - (i_405_ >>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
			    }
			}
			i_340_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_408_ = anInt9919;
		    while (i_408_ < 0) {
			int i_409_ = anInt9925;
			int i_410_ = anInt9927;
			int i_411_ = anInt9928 + anInt9930;
			int i_412_ = anInt9906;
			if (i_410_ >= 0
			    && i_410_ - (((Class168_Sub2_Sub3) this).anInt9920
					 << 12) < 0) {
			    int i_413_;
			    if ((i_413_
				 = (i_411_
				    - (((Class168_Sub2_Sub3) this).anInt9916
				       << 12)))
				>= 0) {
				i_413_ = (anInt9922 - i_413_) / anInt9922;
				i_412_ += i_413_;
				i_411_ += anInt9922 * i_413_;
				i_409_ += i_413_;
			    }
			    if ((i_413_ = (i_411_ - anInt9922) / anInt9922)
				> i_412_)
				i_412_ = i_413_;
			    for (/**/; i_412_ < 0; i_412_++) {
				int i_414_
				    = ((i_411_ >> 12) * ((Class168_Sub2_Sub3)
							 this).anInt9920
				       + (i_410_ >> 12));
				int i_415_ = i_409_++;
				if (i_339_ == 0) {
				    if (i == 1)
					is[i_415_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_414_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_416_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_414_])
						 & 0xff)]);
					int i_417_
					    = ((i_416_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_418_
					    = ((i_416_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_419_
					    = ((i_416_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_415_]
					    = (i_417_ | i_418_ | i_419_) >>> 8;
				    } else if (i == 3) {
					int i_420_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_414_])
						 & 0xff)]);
					int i_421_ = anInt9931;
					int i_422_ = i_420_ + i_421_;
					int i_423_ = ((i_420_ & 0xff00ff)
						      + (i_421_ & 0xff00ff));
					int i_424_
					    = ((i_423_ & 0x1000100)
					       + (i_422_ - i_423_ & 0x10000));
					is[i_415_]
					    = (i_422_ - i_424_
					       | i_424_ - (i_424_ >>> 8));
				    } else if (i == 2) {
					int i_425_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_414_])
						 & 0xff)]);
					int i_426_
					    = ((i_425_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_427_
					    = ((i_425_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_415_] = (((i_426_ | i_427_) >>> 8)
						      + anInt9939);
				    } else
					throw new IllegalArgumentException();
				} else if (i_339_ == 1) {
				    if (i == 1) {
					int i_428_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_414_]);
					if (i_428_ != 0)
					    is[i_415_]
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_428_ & 0xff]);
				    } else if (i == 0) {
					int i_429_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_414_]);
					if (i_429_ != 0) {
					    int i_430_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_429_ & 0xff]);
					    if ((anInt9931 & 0xffffff)
						== 16777215) {
						int i_431_ = anInt9931 >>> 24;
						int i_432_ = 256 - i_431_;
						int i_433_ = is[i_415_];
						is[i_415_]
						    = (((((i_430_ & 0xff00ff)
							  * i_431_)
							 + ((i_433_ & 0xff00ff)
							    * i_432_))
							& ~0xff00ff)
						       + ((((i_430_ & 0xff00)
							    * i_431_)
							   + ((i_433_ & 0xff00)
							      * i_432_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9932 != 255) {
						int i_434_
						    = (((i_430_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_435_
						    = (((i_430_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_436_ = (((i_430_ & 0xff)
							       * anInt9936)
							      & 0xff00);
						i_430_ = (i_434_ | i_435_
							  | i_436_) >>> 8;
						int i_437_ = is[i_415_];
						is[i_415_]
						    = (((((i_430_ & 0xff00ff)
							  * anInt9932)
							 + ((i_437_ & 0xff00ff)
							    * anInt9937))
							& ~0xff00ff)
						       + ((((i_430_ & 0xff00)
							    * anInt9932)
							   + ((i_437_ & 0xff00)
							      * anInt9937))
							  & 0xff0000)) >> 8;
					    } else {
						int i_438_
						    = (((i_430_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_439_
						    = (((i_430_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_440_ = (((i_430_ & 0xff)
							       * anInt9936)
							      & 0xff00);
						is[i_415_] = (i_438_ | i_439_
							      | i_440_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_441_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_414_]);
					int i_442_
					    = (i_441_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_441_])
					       : 0);
					int i_443_ = anInt9931;
					int i_444_ = i_442_ + i_443_;
					int i_445_ = ((i_442_ & 0xff00ff)
						      + (i_443_ & 0xff00ff));
					int i_446_
					    = ((i_445_ & 0x1000100)
					       + (i_444_ - i_445_ & 0x10000));
					i_446_ = (i_444_ - i_446_
						  | i_446_ - (i_446_ >>> 8));
					if (i_442_ == 0 && anInt9932 != 255) {
					    i_442_ = i_446_;
					    i_446_ = is[i_415_];
					    i_446_ = (((((i_442_ & 0xff00ff)
							 * anInt9932)
							+ ((i_446_ & 0xff00ff)
							   * anInt9937))
						       & ~0xff00ff)
						      + ((((i_442_ & 0xff00)
							   * anInt9932)
							  + ((i_446_ & 0xff00)
							     * anInt9937))
							 & 0xff0000)) >> 8;
					}
					is[i_415_] = i_446_;
				    } else if (i == 2) {
					int i_447_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_414_]);
					if (i_447_ != 0) {
					    int i_448_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_447_ & 0xff]);
					    int i_449_ = (((i_448_ & 0xff00ff)
							   * anInt9932)
							  & ~0xff00ff);
					    int i_450_ = (((i_448_ & 0xff00)
							   * anInt9932)
							  & 0xff0000);
					    is[i_415_++] = ((i_449_ | i_450_)
							    >>> 8) + anInt9939;
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_339_ == 2) {
				    if (i == 1) {
					int i_451_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_414_]);
					if (i_451_ != 0) {
					    int i_452_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_451_ & 0xff]);
					    int i_453_ = is[i_415_];
					    int i_454_ = i_452_ + i_453_;
					    int i_455_
						= ((i_452_ & 0xff00ff)
						   + (i_453_ & 0xff00ff));
					    i_453_ = ((i_455_ & 0x1000100)
						      + (i_454_ - i_455_
							 & 0x10000));
					    is[i_415_]
						= (i_454_ - i_453_
						   | i_453_ - (i_453_ >>> 8));
					}
				    } else if (i == 0) {
					int i_456_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_414_]);
					if (i_456_ != 0) {
					    int i_457_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_456_ & 0xff]);
					    int i_458_ = (((i_457_ & 0xff0000)
							   * anInt9934)
							  & ~0xffffff);
					    int i_459_ = (((i_457_ & 0xff00)
							   * anInt9913)
							  & 0xff0000);
					    int i_460_
						= ((i_457_ & 0xff) * anInt9936
						   & 0xff00);
					    i_457_ = (i_458_ | i_459_
						      | i_460_) >>> 8;
					    int i_461_ = is[i_415_];
					    int i_462_ = i_457_ + i_461_;
					    int i_463_
						= ((i_457_ & 0xff00ff)
						   + (i_461_ & 0xff00ff));
					    i_461_ = ((i_463_ & 0x1000100)
						      + (i_462_ - i_463_
							 & 0x10000));
					    is[i_415_]
						= (i_462_ - i_461_
						   | i_461_ - (i_461_ >>> 8));
					}
				    } else if (i == 3) {
					byte i_464_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_414_]);
					int i_465_
					    = (i_464_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_464_])
					       : 0);
					int i_466_ = anInt9931;
					int i_467_ = i_465_ + i_466_;
					int i_468_ = ((i_465_ & 0xff00ff)
						      + (i_466_ & 0xff00ff));
					int i_469_
					    = ((i_468_ & 0x1000100)
					       + (i_467_ - i_468_ & 0x10000));
					i_469_ = (i_467_ - i_469_
						  | i_469_ - (i_469_ >>> 8));
					if (i_465_ == 0 && anInt9932 != 255) {
					    i_465_ = i_469_;
					    i_469_ = is[i_415_];
					    i_469_ = (((((i_465_ & 0xff00ff)
							 * anInt9932)
							+ ((i_469_ & 0xff00ff)
							   * anInt9937))
						       & ~0xff00ff)
						      + ((((i_465_ & 0xff00)
							   * anInt9932)
							  + ((i_469_ & 0xff00)
							     * anInt9937))
							 & 0xff0000)) >> 8;
					}
					is[i_415_] = i_469_;
				    } else if (i == 2) {
					int i_470_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_414_]);
					if (i_470_ != 0) {
					    int i_471_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_470_ & 0xff]);
					    int i_472_ = (((i_471_ & 0xff00ff)
							   * anInt9932)
							  & ~0xff00ff);
					    int i_473_ = (((i_471_ & 0xff00)
							   * anInt9932)
							  & 0xff0000);
					    i_471_ = (((i_472_ | i_473_) >>> 8)
						      + anInt9939);
					    int i_474_ = is[i_415_];
					    int i_475_ = i_471_ + i_474_;
					    int i_476_
						= ((i_471_ & 0xff00ff)
						   + (i_474_ & 0xff00ff));
					    i_474_ = ((i_476_ & 0x1000100)
						      + (i_475_ - i_476_
							 & 0x10000));
					    is[i_415_]
						= (i_475_ - i_474_
						   | i_474_ - (i_474_ >>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_411_ += anInt9922;
			    }
			}
			i_408_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_477_ = anInt9919;
		    while (i_477_ < 0) {
			int i_478_ = anInt9925;
			int i_479_ = anInt9927;
			int i_480_ = anInt9928 + anInt9930;
			int i_481_ = anInt9906;
			if (i_479_ >= 0
			    && i_479_ - (((Class168_Sub2_Sub3) this).anInt9920
					 << 12) < 0) {
			    if (i_480_ < 0) {
				int i_482_
				    = (anInt9922 - 1 - i_480_) / anInt9922;
				i_481_ += i_482_;
				i_480_ += anInt9922 * i_482_;
				i_478_ += i_482_;
			    }
			    int i_483_;
			    if ((i_483_
				 = (1 + i_480_
				    - (((Class168_Sub2_Sub3) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_481_)
				i_481_ = i_483_;
			    for (/**/; i_481_ < 0; i_481_++) {
				int i_484_
				    = ((i_480_ >> 12) * ((Class168_Sub2_Sub3)
							 this).anInt9920
				       + (i_479_ >> 12));
				int i_485_ = i_478_++;
				if (i_339_ == 0) {
				    if (i == 1)
					is[i_485_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_484_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_486_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_484_])
						 & 0xff)]);
					int i_487_
					    = ((i_486_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_488_
					    = ((i_486_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_489_
					    = ((i_486_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_485_]
					    = (i_487_ | i_488_ | i_489_) >>> 8;
				    } else if (i == 3) {
					int i_490_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_484_])
						 & 0xff)]);
					int i_491_ = anInt9931;
					int i_492_ = i_490_ + i_491_;
					int i_493_ = ((i_490_ & 0xff00ff)
						      + (i_491_ & 0xff00ff));
					int i_494_
					    = ((i_493_ & 0x1000100)
					       + (i_492_ - i_493_ & 0x10000));
					is[i_485_]
					    = (i_492_ - i_494_
					       | i_494_ - (i_494_ >>> 8));
				    } else if (i == 2) {
					int i_495_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_484_])
						 & 0xff)]);
					int i_496_
					    = ((i_495_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_497_
					    = ((i_495_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_485_] = (((i_496_ | i_497_) >>> 8)
						      + anInt9939);
				    } else
					throw new IllegalArgumentException();
				} else if (i_339_ == 1) {
				    if (i == 1) {
					int i_498_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_484_]);
					if (i_498_ != 0)
					    is[i_485_]
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_498_ & 0xff]);
				    } else if (i == 0) {
					int i_499_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_484_]);
					if (i_499_ != 0) {
					    int i_500_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_499_ & 0xff]);
					    if ((anInt9931 & 0xffffff)
						== 16777215) {
						int i_501_ = anInt9931 >>> 24;
						int i_502_ = 256 - i_501_;
						int i_503_ = is[i_485_];
						is[i_485_]
						    = (((((i_500_ & 0xff00ff)
							  * i_501_)
							 + ((i_503_ & 0xff00ff)
							    * i_502_))
							& ~0xff00ff)
						       + ((((i_500_ & 0xff00)
							    * i_501_)
							   + ((i_503_ & 0xff00)
							      * i_502_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9932 != 255) {
						int i_504_
						    = (((i_500_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_505_
						    = (((i_500_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_506_ = (((i_500_ & 0xff)
							       * anInt9936)
							      & 0xff00);
						i_500_ = (i_504_ | i_505_
							  | i_506_) >>> 8;
						int i_507_ = is[i_485_];
						is[i_485_]
						    = (((((i_500_ & 0xff00ff)
							  * anInt9932)
							 + ((i_507_ & 0xff00ff)
							    * anInt9937))
							& ~0xff00ff)
						       + ((((i_500_ & 0xff00)
							    * anInt9932)
							   + ((i_507_ & 0xff00)
							      * anInt9937))
							  & 0xff0000)) >> 8;
					    } else {
						int i_508_
						    = (((i_500_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_509_
						    = (((i_500_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_510_ = (((i_500_ & 0xff)
							       * anInt9936)
							      & 0xff00);
						is[i_485_] = (i_508_ | i_509_
							      | i_510_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_511_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_484_]);
					int i_512_
					    = (i_511_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_511_])
					       : 0);
					int i_513_ = anInt9931;
					int i_514_ = i_512_ + i_513_;
					int i_515_ = ((i_512_ & 0xff00ff)
						      + (i_513_ & 0xff00ff));
					int i_516_
					    = ((i_515_ & 0x1000100)
					       + (i_514_ - i_515_ & 0x10000));
					i_516_ = (i_514_ - i_516_
						  | i_516_ - (i_516_ >>> 8));
					if (i_512_ == 0 && anInt9932 != 255) {
					    i_512_ = i_516_;
					    i_516_ = is[i_485_];
					    i_516_ = (((((i_512_ & 0xff00ff)
							 * anInt9932)
							+ ((i_516_ & 0xff00ff)
							   * anInt9937))
						       & ~0xff00ff)
						      + ((((i_512_ & 0xff00)
							   * anInt9932)
							  + ((i_516_ & 0xff00)
							     * anInt9937))
							 & 0xff0000)) >> 8;
					}
					is[i_485_] = i_516_;
				    } else if (i == 2) {
					int i_517_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_484_]);
					if (i_517_ != 0) {
					    int i_518_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_517_ & 0xff]);
					    int i_519_ = (((i_518_ & 0xff00ff)
							   * anInt9932)
							  & ~0xff00ff);
					    int i_520_ = (((i_518_ & 0xff00)
							   * anInt9932)
							  & 0xff0000);
					    is[i_485_++] = ((i_519_ | i_520_)
							    >>> 8) + anInt9939;
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_339_ == 2) {
				    if (i == 1) {
					int i_521_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_484_]);
					if (i_521_ != 0) {
					    int i_522_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_521_ & 0xff]);
					    int i_523_ = is[i_485_];
					    int i_524_ = i_522_ + i_523_;
					    int i_525_
						= ((i_522_ & 0xff00ff)
						   + (i_523_ & 0xff00ff));
					    i_523_ = ((i_525_ & 0x1000100)
						      + (i_524_ - i_525_
							 & 0x10000));
					    is[i_485_]
						= (i_524_ - i_523_
						   | i_523_ - (i_523_ >>> 8));
					}
				    } else if (i == 0) {
					int i_526_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_484_]);
					if (i_526_ != 0) {
					    int i_527_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_526_ & 0xff]);
					    int i_528_ = (((i_527_ & 0xff0000)
							   * anInt9934)
							  & ~0xffffff);
					    int i_529_ = (((i_527_ & 0xff00)
							   * anInt9913)
							  & 0xff0000);
					    int i_530_
						= ((i_527_ & 0xff) * anInt9936
						   & 0xff00);
					    i_527_ = (i_528_ | i_529_
						      | i_530_) >>> 8;
					    int i_531_ = is[i_485_];
					    int i_532_ = i_527_ + i_531_;
					    int i_533_
						= ((i_527_ & 0xff00ff)
						   + (i_531_ & 0xff00ff));
					    i_531_ = ((i_533_ & 0x1000100)
						      + (i_532_ - i_533_
							 & 0x10000));
					    is[i_485_]
						= (i_532_ - i_531_
						   | i_531_ - (i_531_ >>> 8));
					}
				    } else if (i == 3) {
					byte i_534_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_484_]);
					int i_535_
					    = (i_534_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_534_])
					       : 0);
					int i_536_ = anInt9931;
					int i_537_ = i_535_ + i_536_;
					int i_538_ = ((i_535_ & 0xff00ff)
						      + (i_536_ & 0xff00ff));
					int i_539_
					    = ((i_538_ & 0x1000100)
					       + (i_537_ - i_538_ & 0x10000));
					i_539_ = (i_537_ - i_539_
						  | i_539_ - (i_539_ >>> 8));
					if (i_535_ == 0 && anInt9932 != 255) {
					    i_535_ = i_539_;
					    i_539_ = is[i_485_];
					    i_539_ = (((((i_535_ & 0xff00ff)
							 * anInt9932)
							+ ((i_539_ & 0xff00ff)
							   * anInt9937))
						       & ~0xff00ff)
						      + ((((i_535_ & 0xff00)
							   * anInt9932)
							  + ((i_539_ & 0xff00)
							     * anInt9937))
							 & 0xff0000)) >> 8;
					}
					is[i_485_] = i_539_;
				    } else if (i == 2) {
					int i_540_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_484_]);
					if (i_540_ != 0) {
					    int i_541_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_540_ & 0xff]);
					    int i_542_ = (((i_541_ & 0xff00ff)
							   * anInt9932)
							  & ~0xff00ff);
					    int i_543_ = (((i_541_ & 0xff00)
							   * anInt9932)
							  & 0xff0000);
					    i_541_ = (((i_542_ | i_543_) >>> 8)
						      + anInt9939);
					    int i_544_ = is[i_485_];
					    int i_545_ = i_541_ + i_544_;
					    int i_546_
						= ((i_541_ & 0xff00ff)
						   + (i_544_ & 0xff00ff));
					    i_544_ = ((i_546_ & 0x1000100)
						      + (i_545_ - i_546_
							 & 0x10000));
					    is[i_485_]
						= (i_545_ - i_544_
						   | i_544_ - (i_544_ >>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_480_ += anInt9922;
			    }
			}
			i_477_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_547_ = anInt9919;
		    while (i_547_ < 0) {
			int i_548_ = anInt9925;
			int i_549_ = anInt9927 + anInt9929;
			int i_550_ = anInt9928;
			int i_551_ = anInt9906;
			if (i_550_ >= 0
			    && i_550_ - (((Class168_Sub2_Sub3) this).anInt9916
					 << 12) < 0) {
			    int i_552_;
			    if ((i_552_
				 = (i_549_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)))
				>= 0) {
				i_552_ = (anInt9921 - i_552_) / anInt9921;
				i_551_ += i_552_;
				i_549_ += anInt9921 * i_552_;
				i_548_ += i_552_;
			    }
			    if ((i_552_ = (i_549_ - anInt9921) / anInt9921)
				> i_551_)
				i_551_ = i_552_;
			    for (/**/; i_551_ < 0; i_551_++) {
				int i_553_
				    = ((i_550_ >> 12) * ((Class168_Sub2_Sub3)
							 this).anInt9920
				       + (i_549_ >> 12));
				int i_554_ = i_548_++;
				if (i_339_ == 0) {
				    if (i == 1)
					is[i_554_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_553_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_555_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_553_])
						 & 0xff)]);
					int i_556_
					    = ((i_555_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_557_
					    = ((i_555_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_558_
					    = ((i_555_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_554_]
					    = (i_556_ | i_557_ | i_558_) >>> 8;
				    } else if (i == 3) {
					int i_559_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_553_])
						 & 0xff)]);
					int i_560_ = anInt9931;
					int i_561_ = i_559_ + i_560_;
					int i_562_ = ((i_559_ & 0xff00ff)
						      + (i_560_ & 0xff00ff));
					int i_563_
					    = ((i_562_ & 0x1000100)
					       + (i_561_ - i_562_ & 0x10000));
					is[i_554_]
					    = (i_561_ - i_563_
					       | i_563_ - (i_563_ >>> 8));
				    } else if (i == 2) {
					int i_564_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_553_])
						 & 0xff)]);
					int i_565_
					    = ((i_564_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_566_
					    = ((i_564_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_554_] = (((i_565_ | i_566_) >>> 8)
						      + anInt9939);
				    } else
					throw new IllegalArgumentException();
				} else if (i_339_ == 1) {
				    if (i == 1) {
					int i_567_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_553_]);
					if (i_567_ != 0)
					    is[i_554_]
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_567_ & 0xff]);
				    } else if (i == 0) {
					int i_568_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_553_]);
					if (i_568_ != 0) {
					    int i_569_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_568_ & 0xff]);
					    if ((anInt9931 & 0xffffff)
						== 16777215) {
						int i_570_ = anInt9931 >>> 24;
						int i_571_ = 256 - i_570_;
						int i_572_ = is[i_554_];
						is[i_554_]
						    = (((((i_569_ & 0xff00ff)
							  * i_570_)
							 + ((i_572_ & 0xff00ff)
							    * i_571_))
							& ~0xff00ff)
						       + ((((i_569_ & 0xff00)
							    * i_570_)
							   + ((i_572_ & 0xff00)
							      * i_571_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9932 != 255) {
						int i_573_
						    = (((i_569_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_574_
						    = (((i_569_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_575_ = (((i_569_ & 0xff)
							       * anInt9936)
							      & 0xff00);
						i_569_ = (i_573_ | i_574_
							  | i_575_) >>> 8;
						int i_576_ = is[i_554_];
						is[i_554_]
						    = (((((i_569_ & 0xff00ff)
							  * anInt9932)
							 + ((i_576_ & 0xff00ff)
							    * anInt9937))
							& ~0xff00ff)
						       + ((((i_569_ & 0xff00)
							    * anInt9932)
							   + ((i_576_ & 0xff00)
							      * anInt9937))
							  & 0xff0000)) >> 8;
					    } else {
						int i_577_
						    = (((i_569_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_578_
						    = (((i_569_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_579_ = (((i_569_ & 0xff)
							       * anInt9936)
							      & 0xff00);
						is[i_554_] = (i_577_ | i_578_
							      | i_579_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_580_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_553_]);
					int i_581_
					    = (i_580_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_580_])
					       : 0);
					int i_582_ = anInt9931;
					int i_583_ = i_581_ + i_582_;
					int i_584_ = ((i_581_ & 0xff00ff)
						      + (i_582_ & 0xff00ff));
					int i_585_
					    = ((i_584_ & 0x1000100)
					       + (i_583_ - i_584_ & 0x10000));
					i_585_ = (i_583_ - i_585_
						  | i_585_ - (i_585_ >>> 8));
					if (i_581_ == 0 && anInt9932 != 255) {
					    i_581_ = i_585_;
					    i_585_ = is[i_554_];
					    i_585_ = (((((i_581_ & 0xff00ff)
							 * anInt9932)
							+ ((i_585_ & 0xff00ff)
							   * anInt9937))
						       & ~0xff00ff)
						      + ((((i_581_ & 0xff00)
							   * anInt9932)
							  + ((i_585_ & 0xff00)
							     * anInt9937))
							 & 0xff0000)) >> 8;
					}
					is[i_554_] = i_585_;
				    } else if (i == 2) {
					int i_586_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_553_]);
					if (i_586_ != 0) {
					    int i_587_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_586_ & 0xff]);
					    int i_588_ = (((i_587_ & 0xff00ff)
							   * anInt9932)
							  & ~0xff00ff);
					    int i_589_ = (((i_587_ & 0xff00)
							   * anInt9932)
							  & 0xff0000);
					    is[i_554_++] = ((i_588_ | i_589_)
							    >>> 8) + anInt9939;
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_339_ == 2) {
				    if (i == 1) {
					int i_590_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_553_]);
					if (i_590_ != 0) {
					    int i_591_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_590_ & 0xff]);
					    int i_592_ = is[i_554_];
					    int i_593_ = i_591_ + i_592_;
					    int i_594_
						= ((i_591_ & 0xff00ff)
						   + (i_592_ & 0xff00ff));
					    i_592_ = ((i_594_ & 0x1000100)
						      + (i_593_ - i_594_
							 & 0x10000));
					    is[i_554_]
						= (i_593_ - i_592_
						   | i_592_ - (i_592_ >>> 8));
					}
				    } else if (i == 0) {
					int i_595_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_553_]);
					if (i_595_ != 0) {
					    int i_596_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_595_ & 0xff]);
					    int i_597_ = (((i_596_ & 0xff0000)
							   * anInt9934)
							  & ~0xffffff);
					    int i_598_ = (((i_596_ & 0xff00)
							   * anInt9913)
							  & 0xff0000);
					    int i_599_
						= ((i_596_ & 0xff) * anInt9936
						   & 0xff00);
					    i_596_ = (i_597_ | i_598_
						      | i_599_) >>> 8;
					    int i_600_ = is[i_554_];
					    int i_601_ = i_596_ + i_600_;
					    int i_602_
						= ((i_596_ & 0xff00ff)
						   + (i_600_ & 0xff00ff));
					    i_600_ = ((i_602_ & 0x1000100)
						      + (i_601_ - i_602_
							 & 0x10000));
					    is[i_554_]
						= (i_601_ - i_600_
						   | i_600_ - (i_600_ >>> 8));
					}
				    } else if (i == 3) {
					byte i_603_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_553_]);
					int i_604_
					    = (i_603_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_603_])
					       : 0);
					int i_605_ = anInt9931;
					int i_606_ = i_604_ + i_605_;
					int i_607_ = ((i_604_ & 0xff00ff)
						      + (i_605_ & 0xff00ff));
					int i_608_
					    = ((i_607_ & 0x1000100)
					       + (i_606_ - i_607_ & 0x10000));
					i_608_ = (i_606_ - i_608_
						  | i_608_ - (i_608_ >>> 8));
					if (i_604_ == 0 && anInt9932 != 255) {
					    i_604_ = i_608_;
					    i_608_ = is[i_554_];
					    i_608_ = (((((i_604_ & 0xff00ff)
							 * anInt9932)
							+ ((i_608_ & 0xff00ff)
							   * anInt9937))
						       & ~0xff00ff)
						      + ((((i_604_ & 0xff00)
							   * anInt9932)
							  + ((i_608_ & 0xff00)
							     * anInt9937))
							 & 0xff0000)) >> 8;
					}
					is[i_554_] = i_608_;
				    } else if (i == 2) {
					int i_609_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_553_]);
					if (i_609_ != 0) {
					    int i_610_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_609_ & 0xff]);
					    int i_611_ = (((i_610_ & 0xff00ff)
							   * anInt9932)
							  & ~0xff00ff);
					    int i_612_ = (((i_610_ & 0xff00)
							   * anInt9932)
							  & 0xff0000);
					    i_610_ = (((i_611_ | i_612_) >>> 8)
						      + anInt9939);
					    int i_613_ = is[i_554_];
					    int i_614_ = i_610_ + i_613_;
					    int i_615_
						= ((i_610_ & 0xff00ff)
						   + (i_613_ & 0xff00ff));
					    i_613_ = ((i_615_ & 0x1000100)
						      + (i_614_ - i_615_
							 & 0x10000));
					    is[i_554_]
						= (i_614_ - i_613_
						   | i_613_ - (i_613_ >>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_549_ += anInt9921;
			    }
			}
			i_547_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_616_ = anInt9919;
		    while (i_616_ < 0) {
			int i_617_ = anInt9925;
			int i_618_ = anInt9927 + anInt9929;
			int i_619_ = anInt9928 + anInt9930;
			int i_620_ = anInt9906;
			int i_621_;
			if ((i_621_
			     = i_618_ - (((Class168_Sub2_Sub3) this).anInt9920
					 << 12))
			    >= 0) {
			    i_621_ = (anInt9921 - i_621_) / anInt9921;
			    i_620_ += i_621_;
			    i_618_ += anInt9921 * i_621_;
			    i_619_ += anInt9922 * i_621_;
			    i_617_ += i_621_;
			}
			if ((i_621_ = (i_618_ - anInt9921) / anInt9921)
			    > i_620_)
			    i_620_ = i_621_;
			if ((i_621_
			     = i_619_ - (((Class168_Sub2_Sub3) this).anInt9916
					 << 12))
			    >= 0) {
			    i_621_ = (anInt9922 - i_621_) / anInt9922;
			    i_620_ += i_621_;
			    i_618_ += anInt9921 * i_621_;
			    i_619_ += anInt9922 * i_621_;
			    i_617_ += i_621_;
			}
			if ((i_621_ = (i_619_ - anInt9922) / anInt9922)
			    > i_620_)
			    i_620_ = i_621_;
			for (/**/; i_620_ < 0; i_620_++) {
			    int i_622_
				= (((i_619_ >> 12)
				    * ((Class168_Sub2_Sub3) this).anInt9920)
				   + (i_618_ >> 12));
			    int i_623_ = i_617_++;
			    if (i_339_ == 0) {
				if (i == 1)
				    is[i_623_] = (((Class168_Sub2_Sub3) this)
						  .anIntArray11204
						  [(((Class168_Sub2_Sub3) this)
						    .aByteArray11205
						    [i_622_]) & 0xff]);
				else if (i == 0) {
				    int i_624_ = (((Class168_Sub2_Sub3) this)
						  .anIntArray11204
						  [(((Class168_Sub2_Sub3) this)
						    .aByteArray11205
						    [i_622_]) & 0xff]);
				    int i_625_
					= ((i_624_ & 0xff0000) * anInt9934
					   & ~0xffffff);
				    int i_626_ = ((i_624_ & 0xff00) * anInt9913
						  & 0xff0000);
				    int i_627_
					= (i_624_ & 0xff) * anInt9936 & 0xff00;
				    is[i_623_]
					= (i_625_ | i_626_ | i_627_) >>> 8;
				} else if (i == 3) {
				    int i_628_ = (((Class168_Sub2_Sub3) this)
						  .anIntArray11204
						  [(((Class168_Sub2_Sub3) this)
						    .aByteArray11205
						    [i_622_]) & 0xff]);
				    int i_629_ = anInt9931;
				    int i_630_ = i_628_ + i_629_;
				    int i_631_ = ((i_628_ & 0xff00ff)
						  + (i_629_ & 0xff00ff));
				    int i_632_
					= ((i_631_ & 0x1000100)
					   + (i_630_ - i_631_ & 0x10000));
				    is[i_623_]
					= i_630_ - i_632_ | i_632_ - (i_632_
								      >>> 8);
				} else if (i == 2) {
				    int i_633_ = (((Class168_Sub2_Sub3) this)
						  .anIntArray11204
						  [(((Class168_Sub2_Sub3) this)
						    .aByteArray11205
						    [i_622_]) & 0xff]);
				    int i_634_
					= ((i_633_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_635_ = ((i_633_ & 0xff00) * anInt9932
						  & 0xff0000);
				    is[i_623_] = (((i_634_ | i_635_) >>> 8)
						  + anInt9939);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_339_ == 1) {
				if (i == 1) {
				    int i_636_ = (((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_622_]);
				    if (i_636_ != 0)
					is[i_623_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_636_ & 0xff]);
				} else if (i == 0) {
				    int i_637_ = (((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_622_]);
				    if (i_637_ != 0) {
					int i_638_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_637_ & 0xff]);
					if ((anInt9931 & 0xffffff)
					    == 16777215) {
					    int i_639_ = anInt9931 >>> 24;
					    int i_640_ = 256 - i_639_;
					    int i_641_ = is[i_623_];
					    is[i_623_]
						= (((((i_638_ & 0xff00ff)
						      * i_639_)
						     + ((i_641_ & 0xff00ff)
							* i_640_))
						    & ~0xff00ff)
						   + ((((i_638_ & 0xff00)
							* i_639_)
						       + ((i_641_ & 0xff00)
							  * i_640_))
						      & 0xff0000)) >> 8;
					} else if (anInt9932 != 255) {
					    int i_642_ = (((i_638_ & 0xff0000)
							   * anInt9934)
							  & ~0xffffff);
					    int i_643_ = (((i_638_ & 0xff00)
							   * anInt9913)
							  & 0xff0000);
					    int i_644_
						= ((i_638_ & 0xff) * anInt9936
						   & 0xff00);
					    i_638_ = (i_642_ | i_643_
						      | i_644_) >>> 8;
					    int i_645_ = is[i_623_];
					    is[i_623_]
						= (((((i_638_ & 0xff00ff)
						      * anInt9932)
						     + ((i_645_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_638_ & 0xff00)
							* anInt9932)
						       + ((i_645_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					} else {
					    int i_646_ = (((i_638_ & 0xff0000)
							   * anInt9934)
							  & ~0xffffff);
					    int i_647_ = (((i_638_ & 0xff00)
							   * anInt9913)
							  & 0xff0000);
					    int i_648_
						= ((i_638_ & 0xff) * anInt9936
						   & 0xff00);
					    is[i_623_] = (i_646_ | i_647_
							  | i_648_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_649_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_622_]);
				    int i_650_
					= (i_649_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_649_])
					   : 0);
				    int i_651_ = anInt9931;
				    int i_652_ = i_650_ + i_651_;
				    int i_653_ = ((i_650_ & 0xff00ff)
						  + (i_651_ & 0xff00ff));
				    int i_654_
					= ((i_653_ & 0x1000100)
					   + (i_652_ - i_653_ & 0x10000));
				    i_654_
					= i_652_ - i_654_ | i_654_ - (i_654_
								      >>> 8);
				    if (i_650_ == 0 && anInt9932 != 255) {
					i_650_ = i_654_;
					i_654_ = is[i_623_];
					i_654_ = (((((i_650_ & 0xff00ff)
						     * anInt9932)
						    + ((i_654_ & 0xff00ff)
						       * anInt9937))
						   & ~0xff00ff)
						  + ((((i_650_ & 0xff00)
						       * anInt9932)
						      + ((i_654_ & 0xff00)
							 * anInt9937))
						     & 0xff0000)) >> 8;
				    }
				    is[i_623_] = i_654_;
				} else if (i == 2) {
				    int i_655_ = (((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_622_]);
				    if (i_655_ != 0) {
					int i_656_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_655_ & 0xff]);
					int i_657_
					    = ((i_656_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_658_
					    = ((i_656_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_623_++] = ((i_657_ | i_658_)
							>>> 8) + anInt9939;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_339_ == 2) {
				if (i == 1) {
				    int i_659_ = (((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_622_]);
				    if (i_659_ != 0) {
					int i_660_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_659_ & 0xff]);
					int i_661_ = is[i_623_];
					int i_662_ = i_660_ + i_661_;
					int i_663_ = ((i_660_ & 0xff00ff)
						      + (i_661_ & 0xff00ff));
					i_661_
					    = ((i_663_ & 0x1000100)
					       + (i_662_ - i_663_ & 0x10000));
					is[i_623_]
					    = (i_662_ - i_661_
					       | i_661_ - (i_661_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_664_ = (((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_622_]);
				    if (i_664_ != 0) {
					int i_665_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_664_ & 0xff]);
					int i_666_
					    = ((i_665_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_667_
					    = ((i_665_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_668_
					    = ((i_665_ & 0xff) * anInt9936
					       & 0xff00);
					i_665_
					    = (i_666_ | i_667_ | i_668_) >>> 8;
					int i_669_ = is[i_623_];
					int i_670_ = i_665_ + i_669_;
					int i_671_ = ((i_665_ & 0xff00ff)
						      + (i_669_ & 0xff00ff));
					i_669_
					    = ((i_671_ & 0x1000100)
					       + (i_670_ - i_671_ & 0x10000));
					is[i_623_]
					    = (i_670_ - i_669_
					       | i_669_ - (i_669_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_672_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_622_]);
				    int i_673_
					= (i_672_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_672_])
					   : 0);
				    int i_674_ = anInt9931;
				    int i_675_ = i_673_ + i_674_;
				    int i_676_ = ((i_673_ & 0xff00ff)
						  + (i_674_ & 0xff00ff));
				    int i_677_
					= ((i_676_ & 0x1000100)
					   + (i_675_ - i_676_ & 0x10000));
				    i_677_
					= i_675_ - i_677_ | i_677_ - (i_677_
								      >>> 8);
				    if (i_673_ == 0 && anInt9932 != 255) {
					i_673_ = i_677_;
					i_677_ = is[i_623_];
					i_677_ = (((((i_673_ & 0xff00ff)
						     * anInt9932)
						    + ((i_677_ & 0xff00ff)
						       * anInt9937))
						   & ~0xff00ff)
						  + ((((i_673_ & 0xff00)
						       * anInt9932)
						      + ((i_677_ & 0xff00)
							 * anInt9937))
						     & 0xff0000)) >> 8;
				    }
				    is[i_623_] = i_677_;
				} else if (i == 2) {
				    int i_678_ = (((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_622_]);
				    if (i_678_ != 0) {
					int i_679_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_678_ & 0xff]);
					int i_680_
					    = ((i_679_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_681_
					    = ((i_679_ & 0xff00) * anInt9932
					       & 0xff0000);
					i_679_ = (((i_680_ | i_681_) >>> 8)
						  + anInt9939);
					int i_682_ = is[i_623_];
					int i_683_ = i_679_ + i_682_;
					int i_684_ = ((i_679_ & 0xff00ff)
						      + (i_682_ & 0xff00ff));
					i_682_
					    = ((i_684_ & 0x1000100)
					       + (i_683_ - i_684_ & 0x10000));
					is[i_623_]
					    = (i_683_ - i_682_
					       | i_682_ - (i_682_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_618_ += anInt9921;
			    i_619_ += anInt9922;
			}
			i_616_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_685_ = anInt9919;
		    while (i_685_ < 0) {
			int i_686_ = anInt9925;
			int i_687_ = anInt9927 + anInt9929;
			int i_688_ = anInt9928 + anInt9930;
			int i_689_ = anInt9906;
			int i_690_;
			if ((i_690_
			     = i_687_ - (((Class168_Sub2_Sub3) this).anInt9920
					 << 12))
			    >= 0) {
			    i_690_ = (anInt9921 - i_690_) / anInt9921;
			    i_689_ += i_690_;
			    i_687_ += anInt9921 * i_690_;
			    i_688_ += anInt9922 * i_690_;
			    i_686_ += i_690_;
			}
			if ((i_690_ = (i_687_ - anInt9921) / anInt9921)
			    > i_689_)
			    i_689_ = i_690_;
			if (i_688_ < 0) {
			    i_690_ = (anInt9922 - 1 - i_688_) / anInt9922;
			    i_689_ += i_690_;
			    i_687_ += anInt9921 * i_690_;
			    i_688_ += anInt9922 * i_690_;
			    i_686_ += i_690_;
			}
			if ((i_690_
			     = (1 + i_688_
				- (((Class168_Sub2_Sub3) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_689_)
			    i_689_ = i_690_;
			for (/**/; i_689_ < 0; i_689_++) {
			    int i_691_
				= (((i_688_ >> 12)
				    * ((Class168_Sub2_Sub3) this).anInt9920)
				   + (i_687_ >> 12));
			    int i_692_ = i_686_++;
			    if (i_339_ == 0) {
				if (i == 1)
				    is[i_692_] = (((Class168_Sub2_Sub3) this)
						  .anIntArray11204
						  [(((Class168_Sub2_Sub3) this)
						    .aByteArray11205
						    [i_691_]) & 0xff]);
				else if (i == 0) {
				    int i_693_ = (((Class168_Sub2_Sub3) this)
						  .anIntArray11204
						  [(((Class168_Sub2_Sub3) this)
						    .aByteArray11205
						    [i_691_]) & 0xff]);
				    int i_694_
					= ((i_693_ & 0xff0000) * anInt9934
					   & ~0xffffff);
				    int i_695_ = ((i_693_ & 0xff00) * anInt9913
						  & 0xff0000);
				    int i_696_
					= (i_693_ & 0xff) * anInt9936 & 0xff00;
				    is[i_692_]
					= (i_694_ | i_695_ | i_696_) >>> 8;
				} else if (i == 3) {
				    int i_697_ = (((Class168_Sub2_Sub3) this)
						  .anIntArray11204
						  [(((Class168_Sub2_Sub3) this)
						    .aByteArray11205
						    [i_691_]) & 0xff]);
				    int i_698_ = anInt9931;
				    int i_699_ = i_697_ + i_698_;
				    int i_700_ = ((i_697_ & 0xff00ff)
						  + (i_698_ & 0xff00ff));
				    int i_701_
					= ((i_700_ & 0x1000100)
					   + (i_699_ - i_700_ & 0x10000));
				    is[i_692_]
					= i_699_ - i_701_ | i_701_ - (i_701_
								      >>> 8);
				} else if (i == 2) {
				    int i_702_ = (((Class168_Sub2_Sub3) this)
						  .anIntArray11204
						  [(((Class168_Sub2_Sub3) this)
						    .aByteArray11205
						    [i_691_]) & 0xff]);
				    int i_703_
					= ((i_702_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_704_ = ((i_702_ & 0xff00) * anInt9932
						  & 0xff0000);
				    is[i_692_] = (((i_703_ | i_704_) >>> 8)
						  + anInt9939);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_339_ == 1) {
				if (i == 1) {
				    int i_705_ = (((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_691_]);
				    if (i_705_ != 0)
					is[i_692_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_705_ & 0xff]);
				} else if (i == 0) {
				    int i_706_ = (((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_691_]);
				    if (i_706_ != 0) {
					int i_707_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_706_ & 0xff]);
					if ((anInt9931 & 0xffffff)
					    == 16777215) {
					    int i_708_ = anInt9931 >>> 24;
					    int i_709_ = 256 - i_708_;
					    int i_710_ = is[i_692_];
					    is[i_692_]
						= (((((i_707_ & 0xff00ff)
						      * i_708_)
						     + ((i_710_ & 0xff00ff)
							* i_709_))
						    & ~0xff00ff)
						   + ((((i_707_ & 0xff00)
							* i_708_)
						       + ((i_710_ & 0xff00)
							  * i_709_))
						      & 0xff0000)) >> 8;
					} else if (anInt9932 != 255) {
					    int i_711_ = (((i_707_ & 0xff0000)
							   * anInt9934)
							  & ~0xffffff);
					    int i_712_ = (((i_707_ & 0xff00)
							   * anInt9913)
							  & 0xff0000);
					    int i_713_
						= ((i_707_ & 0xff) * anInt9936
						   & 0xff00);
					    i_707_ = (i_711_ | i_712_
						      | i_713_) >>> 8;
					    int i_714_ = is[i_692_];
					    is[i_692_]
						= (((((i_707_ & 0xff00ff)
						      * anInt9932)
						     + ((i_714_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_707_ & 0xff00)
							* anInt9932)
						       + ((i_714_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					} else {
					    int i_715_ = (((i_707_ & 0xff0000)
							   * anInt9934)
							  & ~0xffffff);
					    int i_716_ = (((i_707_ & 0xff00)
							   * anInt9913)
							  & 0xff0000);
					    int i_717_
						= ((i_707_ & 0xff) * anInt9936
						   & 0xff00);
					    is[i_692_] = (i_715_ | i_716_
							  | i_717_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_718_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_691_]);
				    int i_719_
					= (i_718_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_718_])
					   : 0);
				    int i_720_ = anInt9931;
				    int i_721_ = i_719_ + i_720_;
				    int i_722_ = ((i_719_ & 0xff00ff)
						  + (i_720_ & 0xff00ff));
				    int i_723_
					= ((i_722_ & 0x1000100)
					   + (i_721_ - i_722_ & 0x10000));
				    i_723_
					= i_721_ - i_723_ | i_723_ - (i_723_
								      >>> 8);
				    if (i_719_ == 0 && anInt9932 != 255) {
					i_719_ = i_723_;
					i_723_ = is[i_692_];
					i_723_ = (((((i_719_ & 0xff00ff)
						     * anInt9932)
						    + ((i_723_ & 0xff00ff)
						       * anInt9937))
						   & ~0xff00ff)
						  + ((((i_719_ & 0xff00)
						       * anInt9932)
						      + ((i_723_ & 0xff00)
							 * anInt9937))
						     & 0xff0000)) >> 8;
				    }
				    is[i_692_] = i_723_;
				} else if (i == 2) {
				    int i_724_ = (((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_691_]);
				    if (i_724_ != 0) {
					int i_725_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_724_ & 0xff]);
					int i_726_
					    = ((i_725_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_727_
					    = ((i_725_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_692_++] = ((i_726_ | i_727_)
							>>> 8) + anInt9939;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_339_ == 2) {
				if (i == 1) {
				    int i_728_ = (((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_691_]);
				    if (i_728_ != 0) {
					int i_729_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_728_ & 0xff]);
					int i_730_ = is[i_692_];
					int i_731_ = i_729_ + i_730_;
					int i_732_ = ((i_729_ & 0xff00ff)
						      + (i_730_ & 0xff00ff));
					i_730_
					    = ((i_732_ & 0x1000100)
					       + (i_731_ - i_732_ & 0x10000));
					is[i_692_]
					    = (i_731_ - i_730_
					       | i_730_ - (i_730_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_733_ = (((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_691_]);
				    if (i_733_ != 0) {
					int i_734_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_733_ & 0xff]);
					int i_735_
					    = ((i_734_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_736_
					    = ((i_734_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_737_
					    = ((i_734_ & 0xff) * anInt9936
					       & 0xff00);
					i_734_
					    = (i_735_ | i_736_ | i_737_) >>> 8;
					int i_738_ = is[i_692_];
					int i_739_ = i_734_ + i_738_;
					int i_740_ = ((i_734_ & 0xff00ff)
						      + (i_738_ & 0xff00ff));
					i_738_
					    = ((i_740_ & 0x1000100)
					       + (i_739_ - i_740_ & 0x10000));
					is[i_692_]
					    = (i_739_ - i_738_
					       | i_738_ - (i_738_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_741_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_691_]);
				    int i_742_
					= (i_741_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_741_])
					   : 0);
				    int i_743_ = anInt9931;
				    int i_744_ = i_742_ + i_743_;
				    int i_745_ = ((i_742_ & 0xff00ff)
						  + (i_743_ & 0xff00ff));
				    int i_746_
					= ((i_745_ & 0x1000100)
					   + (i_744_ - i_745_ & 0x10000));
				    i_746_
					= i_744_ - i_746_ | i_746_ - (i_746_
								      >>> 8);
				    if (i_742_ == 0 && anInt9932 != 255) {
					i_742_ = i_746_;
					i_746_ = is[i_692_];
					i_746_ = (((((i_742_ & 0xff00ff)
						     * anInt9932)
						    + ((i_746_ & 0xff00ff)
						       * anInt9937))
						   & ~0xff00ff)
						  + ((((i_742_ & 0xff00)
						       * anInt9932)
						      + ((i_746_ & 0xff00)
							 * anInt9937))
						     & 0xff0000)) >> 8;
				    }
				    is[i_692_] = i_746_;
				} else if (i == 2) {
				    int i_747_ = (((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_691_]);
				    if (i_747_ != 0) {
					int i_748_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_747_ & 0xff]);
					int i_749_
					    = ((i_748_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_750_
					    = ((i_748_ & 0xff00) * anInt9932
					       & 0xff0000);
					i_748_ = (((i_749_ | i_750_) >>> 8)
						  + anInt9939);
					int i_751_ = is[i_692_];
					int i_752_ = i_748_ + i_751_;
					int i_753_ = ((i_748_ & 0xff00ff)
						      + (i_751_ & 0xff00ff));
					i_751_
					    = ((i_753_ & 0x1000100)
					       + (i_752_ - i_753_ & 0x10000));
					is[i_692_]
					    = (i_752_ - i_751_
					       | i_751_ - (i_751_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_687_ += anInt9921;
			    i_688_ += anInt9922;
			}
			i_685_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_754_ = anInt9919;
		while (i_754_ < 0) {
		    int i_755_ = anInt9925;
		    int i_756_ = anInt9927 + anInt9929;
		    int i_757_ = anInt9928;
		    int i_758_ = anInt9906;
		    if (i_757_ >= 0
			&& i_757_ - (((Class168_Sub2_Sub3) this).anInt9916
				     << 12) < 0) {
			if (i_756_ < 0) {
			    int i_759_ = (anInt9921 - 1 - i_756_) / anInt9921;
			    i_758_ += i_759_;
			    i_756_ += anInt9921 * i_759_;
			    i_755_ += i_759_;
			}
			int i_760_;
			if ((i_760_
			     = (1 + i_756_
				- (((Class168_Sub2_Sub3) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_758_)
			    i_758_ = i_760_;
			for (/**/; i_758_ < 0; i_758_++) {
			    int i_761_
				= (((i_757_ >> 12)
				    * ((Class168_Sub2_Sub3) this).anInt9920)
				   + (i_756_ >> 12));
			    int i_762_ = i_755_++;
			    if (i_339_ == 0) {
				if (i == 1)
				    is[i_762_] = (((Class168_Sub2_Sub3) this)
						  .anIntArray11204
						  [(((Class168_Sub2_Sub3) this)
						    .aByteArray11205
						    [i_761_]) & 0xff]);
				else if (i == 0) {
				    int i_763_ = (((Class168_Sub2_Sub3) this)
						  .anIntArray11204
						  [(((Class168_Sub2_Sub3) this)
						    .aByteArray11205
						    [i_761_]) & 0xff]);
				    int i_764_
					= ((i_763_ & 0xff0000) * anInt9934
					   & ~0xffffff);
				    int i_765_ = ((i_763_ & 0xff00) * anInt9913
						  & 0xff0000);
				    int i_766_
					= (i_763_ & 0xff) * anInt9936 & 0xff00;
				    is[i_762_]
					= (i_764_ | i_765_ | i_766_) >>> 8;
				} else if (i == 3) {
				    int i_767_ = (((Class168_Sub2_Sub3) this)
						  .anIntArray11204
						  [(((Class168_Sub2_Sub3) this)
						    .aByteArray11205
						    [i_761_]) & 0xff]);
				    int i_768_ = anInt9931;
				    int i_769_ = i_767_ + i_768_;
				    int i_770_ = ((i_767_ & 0xff00ff)
						  + (i_768_ & 0xff00ff));
				    int i_771_
					= ((i_770_ & 0x1000100)
					   + (i_769_ - i_770_ & 0x10000));
				    is[i_762_]
					= i_769_ - i_771_ | i_771_ - (i_771_
								      >>> 8);
				} else if (i == 2) {
				    int i_772_ = (((Class168_Sub2_Sub3) this)
						  .anIntArray11204
						  [(((Class168_Sub2_Sub3) this)
						    .aByteArray11205
						    [i_761_]) & 0xff]);
				    int i_773_
					= ((i_772_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_774_ = ((i_772_ & 0xff00) * anInt9932
						  & 0xff0000);
				    is[i_762_] = (((i_773_ | i_774_) >>> 8)
						  + anInt9939);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_339_ == 1) {
				if (i == 1) {
				    int i_775_ = (((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_761_]);
				    if (i_775_ != 0)
					is[i_762_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_775_ & 0xff]);
				} else if (i == 0) {
				    int i_776_ = (((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_761_]);
				    if (i_776_ != 0) {
					int i_777_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_776_ & 0xff]);
					if ((anInt9931 & 0xffffff)
					    == 16777215) {
					    int i_778_ = anInt9931 >>> 24;
					    int i_779_ = 256 - i_778_;
					    int i_780_ = is[i_762_];
					    is[i_762_]
						= (((((i_777_ & 0xff00ff)
						      * i_778_)
						     + ((i_780_ & 0xff00ff)
							* i_779_))
						    & ~0xff00ff)
						   + ((((i_777_ & 0xff00)
							* i_778_)
						       + ((i_780_ & 0xff00)
							  * i_779_))
						      & 0xff0000)) >> 8;
					} else if (anInt9932 != 255) {
					    int i_781_ = (((i_777_ & 0xff0000)
							   * anInt9934)
							  & ~0xffffff);
					    int i_782_ = (((i_777_ & 0xff00)
							   * anInt9913)
							  & 0xff0000);
					    int i_783_
						= ((i_777_ & 0xff) * anInt9936
						   & 0xff00);
					    i_777_ = (i_781_ | i_782_
						      | i_783_) >>> 8;
					    int i_784_ = is[i_762_];
					    is[i_762_]
						= (((((i_777_ & 0xff00ff)
						      * anInt9932)
						     + ((i_784_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_777_ & 0xff00)
							* anInt9932)
						       + ((i_784_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					} else {
					    int i_785_ = (((i_777_ & 0xff0000)
							   * anInt9934)
							  & ~0xffffff);
					    int i_786_ = (((i_777_ & 0xff00)
							   * anInt9913)
							  & 0xff0000);
					    int i_787_
						= ((i_777_ & 0xff) * anInt9936
						   & 0xff00);
					    is[i_762_] = (i_785_ | i_786_
							  | i_787_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_788_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_761_]);
				    int i_789_
					= (i_788_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_788_])
					   : 0);
				    int i_790_ = anInt9931;
				    int i_791_ = i_789_ + i_790_;
				    int i_792_ = ((i_789_ & 0xff00ff)
						  + (i_790_ & 0xff00ff));
				    int i_793_
					= ((i_792_ & 0x1000100)
					   + (i_791_ - i_792_ & 0x10000));
				    i_793_
					= i_791_ - i_793_ | i_793_ - (i_793_
								      >>> 8);
				    if (i_789_ == 0 && anInt9932 != 255) {
					i_789_ = i_793_;
					i_793_ = is[i_762_];
					i_793_ = (((((i_789_ & 0xff00ff)
						     * anInt9932)
						    + ((i_793_ & 0xff00ff)
						       * anInt9937))
						   & ~0xff00ff)
						  + ((((i_789_ & 0xff00)
						       * anInt9932)
						      + ((i_793_ & 0xff00)
							 * anInt9937))
						     & 0xff0000)) >> 8;
				    }
				    is[i_762_] = i_793_;
				} else if (i == 2) {
				    int i_794_ = (((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_761_]);
				    if (i_794_ != 0) {
					int i_795_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_794_ & 0xff]);
					int i_796_
					    = ((i_795_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_797_
					    = ((i_795_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_762_++] = ((i_796_ | i_797_)
							>>> 8) + anInt9939;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_339_ == 2) {
				if (i == 1) {
				    int i_798_ = (((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_761_]);
				    if (i_798_ != 0) {
					int i_799_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_798_ & 0xff]);
					int i_800_ = is[i_762_];
					int i_801_ = i_799_ + i_800_;
					int i_802_ = ((i_799_ & 0xff00ff)
						      + (i_800_ & 0xff00ff));
					i_800_
					    = ((i_802_ & 0x1000100)
					       + (i_801_ - i_802_ & 0x10000));
					is[i_762_]
					    = (i_801_ - i_800_
					       | i_800_ - (i_800_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_803_ = (((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_761_]);
				    if (i_803_ != 0) {
					int i_804_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_803_ & 0xff]);
					int i_805_
					    = ((i_804_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_806_
					    = ((i_804_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_807_
					    = ((i_804_ & 0xff) * anInt9936
					       & 0xff00);
					i_804_
					    = (i_805_ | i_806_ | i_807_) >>> 8;
					int i_808_ = is[i_762_];
					int i_809_ = i_804_ + i_808_;
					int i_810_ = ((i_804_ & 0xff00ff)
						      + (i_808_ & 0xff00ff));
					i_808_
					    = ((i_810_ & 0x1000100)
					       + (i_809_ - i_810_ & 0x10000));
					is[i_762_]
					    = (i_809_ - i_808_
					       | i_808_ - (i_808_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_811_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_761_]);
				    int i_812_
					= (i_811_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_811_])
					   : 0);
				    int i_813_ = anInt9931;
				    int i_814_ = i_812_ + i_813_;
				    int i_815_ = ((i_812_ & 0xff00ff)
						  + (i_813_ & 0xff00ff));
				    int i_816_
					= ((i_815_ & 0x1000100)
					   + (i_814_ - i_815_ & 0x10000));
				    i_816_
					= i_814_ - i_816_ | i_816_ - (i_816_
								      >>> 8);
				    if (i_812_ == 0 && anInt9932 != 255) {
					i_812_ = i_816_;
					i_816_ = is[i_762_];
					i_816_ = (((((i_812_ & 0xff00ff)
						     * anInt9932)
						    + ((i_816_ & 0xff00ff)
						       * anInt9937))
						   & ~0xff00ff)
						  + ((((i_812_ & 0xff00)
						       * anInt9932)
						      + ((i_816_ & 0xff00)
							 * anInt9937))
						     & 0xff0000)) >> 8;
				    }
				    is[i_762_] = i_816_;
				} else if (i == 2) {
				    int i_817_ = (((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_761_]);
				    if (i_817_ != 0) {
					int i_818_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_817_ & 0xff]);
					int i_819_
					    = ((i_818_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_820_
					    = ((i_818_ & 0xff00) * anInt9932
					       & 0xff0000);
					i_818_ = (((i_819_ | i_820_) >>> 8)
						  + anInt9939);
					int i_821_ = is[i_762_];
					int i_822_ = i_818_ + i_821_;
					int i_823_ = ((i_818_ & 0xff00ff)
						      + (i_821_ & 0xff00ff));
					i_821_
					    = ((i_823_ & 0x1000100)
					       + (i_822_ - i_823_ & 0x10000));
					is[i_762_]
					    = (i_822_ - i_821_
					       | i_821_ - (i_821_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_756_ += anInt9921;
			}
		    }
		    i_754_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		for (int i_824_ = anInt9919; i_824_ < 0; i_824_++) {
		    int i_825_ = anInt9925;
		    int i_826_ = anInt9927 + anInt9929;
		    int i_827_ = anInt9928 + anInt9930;
		    int i_828_ = anInt9906;
		    if (i_826_ < 0) {
			int i_829_ = (anInt9921 - 1 - i_826_) / anInt9921;
			i_828_ += i_829_;
			i_826_ += anInt9921 * i_829_;
			i_827_ += anInt9922 * i_829_;
			i_825_ += i_829_;
		    }
		    int i_830_;
		    if ((i_830_
			 = (1 + i_826_
			    - (((Class168_Sub2_Sub3) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_828_)
			i_828_ = i_830_;
		    if ((i_830_
			 = i_827_ - (((Class168_Sub2_Sub3) this).anInt9916
				     << 12))
			>= 0) {
			i_830_ = (anInt9922 - i_830_) / anInt9922;
			i_828_ += i_830_;
			i_826_ += anInt9921 * i_830_;
			i_827_ += anInt9922 * i_830_;
			i_825_ += i_830_;
		    }
		    if ((i_830_ = (i_827_ - anInt9922) / anInt9922) > i_828_)
			i_828_ = i_830_;
		    for (/**/; i_828_ < 0; i_828_++) {
			int i_831_ = (((i_827_ >> 12)
				       * ((Class168_Sub2_Sub3) this).anInt9920)
				      + (i_826_ >> 12));
			int i_832_ = i_825_++;
			if (i_339_ == 0) {
			    if (i == 1)
				is[i_832_]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_831_]) & 0xff]);
			    else if (i == 0) {
				int i_833_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_831_]) & 0xff]);
				int i_834_ = ((i_833_ & 0xff0000) * anInt9934
					      & ~0xffffff);
				int i_835_
				    = (i_833_ & 0xff00) * anInt9913 & 0xff0000;
				int i_836_
				    = (i_833_ & 0xff) * anInt9936 & 0xff00;
				is[i_832_] = (i_834_ | i_835_ | i_836_) >>> 8;
			    } else if (i == 3) {
				int i_837_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_831_]) & 0xff]);
				int i_838_ = anInt9931;
				int i_839_ = i_837_ + i_838_;
				int i_840_ = ((i_837_ & 0xff00ff)
					      + (i_838_ & 0xff00ff));
				int i_841_ = ((i_840_ & 0x1000100)
					      + (i_839_ - i_840_ & 0x10000));
				is[i_832_]
				    = i_839_ - i_841_ | i_841_ - (i_841_
								  >>> 8);
			    } else if (i == 2) {
				int i_842_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_831_]) & 0xff]);
				int i_843_ = ((i_842_ & 0xff00ff) * anInt9932
					      & ~0xff00ff);
				int i_844_
				    = (i_842_ & 0xff00) * anInt9932 & 0xff0000;
				is[i_832_]
				    = ((i_843_ | i_844_) >>> 8) + anInt9939;
			    } else
				throw new IllegalArgumentException();
			} else if (i_339_ == 1) {
			    if (i == 1) {
				int i_845_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_831_]);
				if (i_845_ != 0)
				    is[i_832_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_845_ & 0xff]);
			    } else if (i == 0) {
				int i_846_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_831_]);
				if (i_846_ != 0) {
				    int i_847_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_846_ & 0xff]);
				    if ((anInt9931 & 0xffffff) == 16777215) {
					int i_848_ = anInt9931 >>> 24;
					int i_849_ = 256 - i_848_;
					int i_850_ = is[i_832_];
					is[i_832_]
					    = ((((i_847_ & 0xff00ff) * i_848_
						 + ((i_850_ & 0xff00ff)
						    * i_849_))
						& ~0xff00ff)
					       + (((i_847_ & 0xff00) * i_848_
						   + ((i_850_ & 0xff00)
						      * i_849_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9932 != 255) {
					int i_851_
					    = ((i_847_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_852_
					    = ((i_847_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_853_
					    = ((i_847_ & 0xff) * anInt9936
					       & 0xff00);
					i_847_
					    = (i_851_ | i_852_ | i_853_) >>> 8;
					int i_854_ = is[i_832_];
					is[i_832_] = (((((i_847_ & 0xff00ff)
							 * anInt9932)
							+ ((i_854_ & 0xff00ff)
							   * anInt9937))
						       & ~0xff00ff)
						      + ((((i_847_ & 0xff00)
							   * anInt9932)
							  + ((i_854_ & 0xff00)
							     * anInt9937))
							 & 0xff0000)) >> 8;
				    } else {
					int i_855_
					    = ((i_847_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_856_
					    = ((i_847_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_857_
					    = ((i_847_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_832_]
					    = (i_855_ | i_856_ | i_857_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_858_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_831_]);
				int i_859_ = (i_858_ > 0
					      ? (((Class168_Sub2_Sub3) this)
						 .anIntArray11204[i_858_])
					      : 0);
				int i_860_ = anInt9931;
				int i_861_ = i_859_ + i_860_;
				int i_862_ = ((i_859_ & 0xff00ff)
					      + (i_860_ & 0xff00ff));
				int i_863_ = ((i_862_ & 0x1000100)
					      + (i_861_ - i_862_ & 0x10000));
				i_863_ = i_861_ - i_863_ | i_863_ - (i_863_
								     >>> 8);
				if (i_859_ == 0 && anInt9932 != 255) {
				    i_859_ = i_863_;
				    i_863_ = is[i_832_];
				    i_863_
					= ((((i_859_ & 0xff00ff) * anInt9932
					     + (i_863_ & 0xff00ff) * anInt9937)
					    & ~0xff00ff)
					   + (((i_859_ & 0xff00) * anInt9932
					       + (i_863_ & 0xff00) * anInt9937)
					      & 0xff0000)) >> 8;
				}
				is[i_832_] = i_863_;
			    } else if (i == 2) {
				int i_864_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_831_]);
				if (i_864_ != 0) {
				    int i_865_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_864_ & 0xff]);
				    int i_866_
					= ((i_865_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_867_ = ((i_865_ & 0xff00) * anInt9932
						  & 0xff0000);
				    is[i_832_++] = (((i_866_ | i_867_) >>> 8)
						    + anInt9939);
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_339_ == 2) {
			    if (i == 1) {
				int i_868_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_831_]);
				if (i_868_ != 0) {
				    int i_869_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_868_ & 0xff]);
				    int i_870_ = is[i_832_];
				    int i_871_ = i_869_ + i_870_;
				    int i_872_ = ((i_869_ & 0xff00ff)
						  + (i_870_ & 0xff00ff));
				    i_870_ = ((i_872_ & 0x1000100)
					      + (i_871_ - i_872_ & 0x10000));
				    is[i_832_]
					= i_871_ - i_870_ | i_870_ - (i_870_
								      >>> 8);
				}
			    } else if (i == 0) {
				int i_873_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_831_]);
				if (i_873_ != 0) {
				    int i_874_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_873_ & 0xff]);
				    int i_875_
					= ((i_874_ & 0xff0000) * anInt9934
					   & ~0xffffff);
				    int i_876_ = ((i_874_ & 0xff00) * anInt9913
						  & 0xff0000);
				    int i_877_
					= (i_874_ & 0xff) * anInt9936 & 0xff00;
				    i_874_ = (i_875_ | i_876_ | i_877_) >>> 8;
				    int i_878_ = is[i_832_];
				    int i_879_ = i_874_ + i_878_;
				    int i_880_ = ((i_874_ & 0xff00ff)
						  + (i_878_ & 0xff00ff));
				    i_878_ = ((i_880_ & 0x1000100)
					      + (i_879_ - i_880_ & 0x10000));
				    is[i_832_]
					= i_879_ - i_878_ | i_878_ - (i_878_
								      >>> 8);
				}
			    } else if (i == 3) {
				byte i_881_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_831_]);
				int i_882_ = (i_881_ > 0
					      ? (((Class168_Sub2_Sub3) this)
						 .anIntArray11204[i_881_])
					      : 0);
				int i_883_ = anInt9931;
				int i_884_ = i_882_ + i_883_;
				int i_885_ = ((i_882_ & 0xff00ff)
					      + (i_883_ & 0xff00ff));
				int i_886_ = ((i_885_ & 0x1000100)
					      + (i_884_ - i_885_ & 0x10000));
				i_886_ = i_884_ - i_886_ | i_886_ - (i_886_
								     >>> 8);
				if (i_882_ == 0 && anInt9932 != 255) {
				    i_882_ = i_886_;
				    i_886_ = is[i_832_];
				    i_886_
					= ((((i_882_ & 0xff00ff) * anInt9932
					     + (i_886_ & 0xff00ff) * anInt9937)
					    & ~0xff00ff)
					   + (((i_882_ & 0xff00) * anInt9932
					       + (i_886_ & 0xff00) * anInt9937)
					      & 0xff0000)) >> 8;
				}
				is[i_832_] = i_886_;
			    } else if (i == 2) {
				int i_887_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_831_]);
				if (i_887_ != 0) {
				    int i_888_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_887_ & 0xff]);
				    int i_889_
					= ((i_888_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_890_ = ((i_888_ & 0xff00) * anInt9932
						  & 0xff0000);
				    i_888_ = (((i_889_ | i_890_) >>> 8)
					      + anInt9939);
				    int i_891_ = is[i_832_];
				    int i_892_ = i_888_ + i_891_;
				    int i_893_ = ((i_888_ & 0xff00ff)
						  + (i_891_ & 0xff00ff));
				    i_891_ = ((i_893_ & 0x1000100)
					      + (i_892_ - i_893_ & 0x10000));
				    is[i_832_]
					= i_892_ - i_891_ | i_891_ - (i_891_
								      >>> 8);
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_826_ += anInt9921;
			i_827_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		for (int i_894_ = anInt9919; i_894_ < 0; i_894_++) {
		    int i_895_ = anInt9925;
		    int i_896_ = anInt9927 + anInt9929;
		    int i_897_ = anInt9928 + anInt9930;
		    int i_898_ = anInt9906;
		    if (i_896_ < 0) {
			int i_899_ = (anInt9921 - 1 - i_896_) / anInt9921;
			i_898_ += i_899_;
			i_896_ += anInt9921 * i_899_;
			i_897_ += anInt9922 * i_899_;
			i_895_ += i_899_;
		    }
		    int i_900_;
		    if ((i_900_
			 = (1 + i_896_
			    - (((Class168_Sub2_Sub3) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_898_)
			i_898_ = i_900_;
		    if (i_897_ < 0) {
			i_900_ = (anInt9922 - 1 - i_897_) / anInt9922;
			i_898_ += i_900_;
			i_896_ += anInt9921 * i_900_;
			i_897_ += anInt9922 * i_900_;
			i_895_ += i_900_;
		    }
		    if ((i_900_
			 = (1 + i_897_
			    - (((Class168_Sub2_Sub3) this).anInt9916 << 12)
			    - anInt9922) / anInt9922)
			> i_898_)
			i_898_ = i_900_;
		    for (/**/; i_898_ < 0; i_898_++) {
			int i_901_ = (((i_897_ >> 12)
				       * ((Class168_Sub2_Sub3) this).anInt9920)
				      + (i_896_ >> 12));
			int i_902_ = i_895_++;
			if (i_339_ == 0) {
			    if (i == 1)
				is[i_902_]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_901_]) & 0xff]);
			    else if (i == 0) {
				int i_903_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_901_]) & 0xff]);
				int i_904_ = ((i_903_ & 0xff0000) * anInt9934
					      & ~0xffffff);
				int i_905_
				    = (i_903_ & 0xff00) * anInt9913 & 0xff0000;
				int i_906_
				    = (i_903_ & 0xff) * anInt9936 & 0xff00;
				is[i_902_] = (i_904_ | i_905_ | i_906_) >>> 8;
			    } else if (i == 3) {
				int i_907_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_901_]) & 0xff]);
				int i_908_ = anInt9931;
				int i_909_ = i_907_ + i_908_;
				int i_910_ = ((i_907_ & 0xff00ff)
					      + (i_908_ & 0xff00ff));
				int i_911_ = ((i_910_ & 0x1000100)
					      + (i_909_ - i_910_ & 0x10000));
				is[i_902_]
				    = i_909_ - i_911_ | i_911_ - (i_911_
								  >>> 8);
			    } else if (i == 2) {
				int i_912_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_901_]) & 0xff]);
				int i_913_ = ((i_912_ & 0xff00ff) * anInt9932
					      & ~0xff00ff);
				int i_914_
				    = (i_912_ & 0xff00) * anInt9932 & 0xff0000;
				is[i_902_]
				    = ((i_913_ | i_914_) >>> 8) + anInt9939;
			    } else
				throw new IllegalArgumentException();
			} else if (i_339_ == 1) {
			    if (i == 1) {
				int i_915_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_901_]);
				if (i_915_ != 0)
				    is[i_902_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_915_ & 0xff]);
			    } else if (i == 0) {
				int i_916_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_901_]);
				if (i_916_ != 0) {
				    int i_917_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_916_ & 0xff]);
				    if ((anInt9931 & 0xffffff) == 16777215) {
					int i_918_ = anInt9931 >>> 24;
					int i_919_ = 256 - i_918_;
					int i_920_ = is[i_902_];
					is[i_902_]
					    = ((((i_917_ & 0xff00ff) * i_918_
						 + ((i_920_ & 0xff00ff)
						    * i_919_))
						& ~0xff00ff)
					       + (((i_917_ & 0xff00) * i_918_
						   + ((i_920_ & 0xff00)
						      * i_919_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9932 != 255) {
					int i_921_
					    = ((i_917_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_922_
					    = ((i_917_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_923_
					    = ((i_917_ & 0xff) * anInt9936
					       & 0xff00);
					i_917_
					    = (i_921_ | i_922_ | i_923_) >>> 8;
					int i_924_ = is[i_902_];
					is[i_902_] = (((((i_917_ & 0xff00ff)
							 * anInt9932)
							+ ((i_924_ & 0xff00ff)
							   * anInt9937))
						       & ~0xff00ff)
						      + ((((i_917_ & 0xff00)
							   * anInt9932)
							  + ((i_924_ & 0xff00)
							     * anInt9937))
							 & 0xff0000)) >> 8;
				    } else {
					int i_925_
					    = ((i_917_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_926_
					    = ((i_917_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_927_
					    = ((i_917_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_902_]
					    = (i_925_ | i_926_ | i_927_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_928_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_901_]);
				int i_929_ = (i_928_ > 0
					      ? (((Class168_Sub2_Sub3) this)
						 .anIntArray11204[i_928_])
					      : 0);
				int i_930_ = anInt9931;
				int i_931_ = i_929_ + i_930_;
				int i_932_ = ((i_929_ & 0xff00ff)
					      + (i_930_ & 0xff00ff));
				int i_933_ = ((i_932_ & 0x1000100)
					      + (i_931_ - i_932_ & 0x10000));
				i_933_ = i_931_ - i_933_ | i_933_ - (i_933_
								     >>> 8);
				if (i_929_ == 0 && anInt9932 != 255) {
				    i_929_ = i_933_;
				    i_933_ = is[i_902_];
				    i_933_
					= ((((i_929_ & 0xff00ff) * anInt9932
					     + (i_933_ & 0xff00ff) * anInt9937)
					    & ~0xff00ff)
					   + (((i_929_ & 0xff00) * anInt9932
					       + (i_933_ & 0xff00) * anInt9937)
					      & 0xff0000)) >> 8;
				}
				is[i_902_] = i_933_;
			    } else if (i == 2) {
				int i_934_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_901_]);
				if (i_934_ != 0) {
				    int i_935_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_934_ & 0xff]);
				    int i_936_
					= ((i_935_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_937_ = ((i_935_ & 0xff00) * anInt9932
						  & 0xff0000);
				    is[i_902_++] = (((i_936_ | i_937_) >>> 8)
						    + anInt9939);
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_339_ == 2) {
			    if (i == 1) {
				int i_938_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_901_]);
				if (i_938_ != 0) {
				    int i_939_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_938_ & 0xff]);
				    int i_940_ = is[i_902_];
				    int i_941_ = i_939_ + i_940_;
				    int i_942_ = ((i_939_ & 0xff00ff)
						  + (i_940_ & 0xff00ff));
				    i_940_ = ((i_942_ & 0x1000100)
					      + (i_941_ - i_942_ & 0x10000));
				    is[i_902_]
					= i_941_ - i_940_ | i_940_ - (i_940_
								      >>> 8);
				}
			    } else if (i == 0) {
				int i_943_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_901_]);
				if (i_943_ != 0) {
				    int i_944_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_943_ & 0xff]);
				    int i_945_
					= ((i_944_ & 0xff0000) * anInt9934
					   & ~0xffffff);
				    int i_946_ = ((i_944_ & 0xff00) * anInt9913
						  & 0xff0000);
				    int i_947_
					= (i_944_ & 0xff) * anInt9936 & 0xff00;
				    i_944_ = (i_945_ | i_946_ | i_947_) >>> 8;
				    int i_948_ = is[i_902_];
				    int i_949_ = i_944_ + i_948_;
				    int i_950_ = ((i_944_ & 0xff00ff)
						  + (i_948_ & 0xff00ff));
				    i_948_ = ((i_950_ & 0x1000100)
					      + (i_949_ - i_950_ & 0x10000));
				    is[i_902_]
					= i_949_ - i_948_ | i_948_ - (i_948_
								      >>> 8);
				}
			    } else if (i == 3) {
				byte i_951_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_901_]);
				int i_952_ = (i_951_ > 0
					      ? (((Class168_Sub2_Sub3) this)
						 .anIntArray11204[i_951_])
					      : 0);
				int i_953_ = anInt9931;
				int i_954_ = i_952_ + i_953_;
				int i_955_ = ((i_952_ & 0xff00ff)
					      + (i_953_ & 0xff00ff));
				int i_956_ = ((i_955_ & 0x1000100)
					      + (i_954_ - i_955_ & 0x10000));
				i_956_ = i_954_ - i_956_ | i_956_ - (i_956_
								     >>> 8);
				if (i_952_ == 0 && anInt9932 != 255) {
				    i_952_ = i_956_;
				    i_956_ = is[i_902_];
				    i_956_
					= ((((i_952_ & 0xff00ff) * anInt9932
					     + (i_956_ & 0xff00ff) * anInt9937)
					    & ~0xff00ff)
					   + (((i_952_ & 0xff00) * anInt9932
					       + (i_956_ & 0xff00) * anInt9937)
					      & 0xff0000)) >> 8;
				}
				is[i_902_] = i_956_;
			    } else if (i == 2) {
				int i_957_ = (((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_901_]);
				if (i_957_ != 0) {
				    int i_958_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_957_ & 0xff]);
				    int i_959_
					= ((i_958_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_960_ = ((i_958_ & 0xff00) * anInt9932
						  & 0xff0000);
				    i_958_ = (((i_959_ | i_960_) >>> 8)
					      + anInt9939);
				    int i_961_ = is[i_902_];
				    int i_962_ = i_958_ + i_961_;
				    int i_963_ = ((i_958_ & 0xff00ff)
						  + (i_961_ & 0xff00ff));
				    i_961_ = ((i_963_ & 0x1000100)
					      + (i_962_ - i_963_ & 0x10000));
				    is[i_902_]
					= i_962_ - i_961_ | i_961_ - (i_961_
								      >>> 8);
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_896_ += anInt9921;
			i_897_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    public void method3635(int i, int i_964_, int i_965_, int i_966_,
			   int i_967_) {
	if (((Class168_Sub2_Sub3) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    int i_968_ = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					    .aClass103_Sub2_9904)).anInt9260
			  * -1826993761);
	    i += ((Class168_Sub2_Sub3) this).anInt9907;
	    i_964_ += ((Class168_Sub2_Sub3) this).anInt9905;
	    int i_969_ = i_964_ * i_968_ + i;
	    int i_970_ = 0;
	    int i_971_ = ((Class168_Sub2_Sub3) this).anInt9916;
	    int i_972_ = ((Class168_Sub2_Sub3) this).anInt9920;
	    int i_973_ = i_968_ - i_972_;
	    int i_974_ = 0;
	    if (i_964_ < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					    .aClass103_Sub2_9904)).anInt9254
			  * -788450385)) {
		int i_975_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9254) * -788450385
			      - i_964_);
		i_971_ -= i_975_;
		i_964_ = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					    .aClass103_Sub2_9904)).anInt9254
			  * -788450385);
		i_970_ += i_975_ * i_972_;
		i_969_ += i_975_ * i_968_;
	    }
	    if (i_964_ + i_971_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_971_ -= (i_964_ + i_971_
			   - (((Class103_Sub2)
			       ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			      .anInt9252) * 1546170165);
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_976_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9249) * 1298750001
			      - i);
		i_972_ -= i_976_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_970_ += i_976_;
		i_969_ += i_976_;
		i_974_ += i_976_;
		i_973_ += i_976_;
	    }
	    if (i + i_972_ > (((Class103_Sub2)
			       ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			      .anInt9250) * 325436811) {
		int i_977_ = (i + i_972_
			      - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						   .aClass103_Sub2_9904))
				 .anInt9250) * 325436811);
		i_972_ -= i_977_;
		i_974_ += i_977_;
		i_973_ += i_977_;
	    }
	    if (i_972_ > 0 && i_971_ > 0) {
		if (i_967_ == 0) {
		    if (i_965_ == 1) {
			for (int i_978_ = -i_971_; i_978_ < 0; i_978_++) {
			    int i_979_ = i_969_ + i_972_ - 3;
			    while (i_969_ < i_979_) {
				is[i_969_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_970_++]) & 0xff]);
				is[i_969_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_970_++]) & 0xff]);
				is[i_969_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_970_++]) & 0xff]);
				is[i_969_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_970_++]) & 0xff]);
			    }
			    i_979_ += 3;
			    while (i_969_ < i_979_)
				is[i_969_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_970_++]) & 0xff]);
			    i_969_ += i_973_;
			    i_970_ += i_974_;
			}
		    } else if (i_965_ == 0) {
			int i_980_ = (i_966_ & 0xff0000) >> 16;
			int i_981_ = (i_966_ & 0xff00) >> 8;
			int i_982_ = i_966_ & 0xff;
			for (int i_983_ = -i_971_; i_983_ < 0; i_983_++) {
			    for (int i_984_ = -i_972_; i_984_ < 0; i_984_++) {
				int i_985_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_970_++]) & 0xff]);
				int i_986_
				    = (i_985_ & 0xff0000) * i_980_ & ~0xffffff;
				int i_987_
				    = (i_985_ & 0xff00) * i_981_ & 0xff0000;
				int i_988_ = (i_985_ & 0xff) * i_982_ & 0xff00;
				is[i_969_++]
				    = (i_986_ | i_987_ | i_988_) >>> 8;
			    }
			    i_969_ += i_973_;
			    i_970_ += i_974_;
			}
		    } else if (i_965_ == 3) {
			for (int i_989_ = -i_971_; i_989_ < 0; i_989_++) {
			    for (int i_990_ = -i_972_; i_990_ < 0; i_990_++) {
				int i_991_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_970_++]) & 0xff]);
				int i_992_ = i_991_ + i_966_;
				int i_993_ = ((i_991_ & 0xff00ff)
					      + (i_966_ & 0xff00ff));
				int i_994_ = ((i_993_ & 0x1000100)
					      + (i_992_ - i_993_ & 0x10000));
				is[i_969_++]
				    = i_992_ - i_994_ | i_994_ - (i_994_
								  >>> 8);
			    }
			    i_969_ += i_973_;
			    i_970_ += i_974_;
			}
		    } else if (i_965_ == 2) {
			int i_995_ = i_966_ >>> 24;
			int i_996_ = 256 - i_995_;
			int i_997_ = (i_966_ & 0xff00ff) * i_996_ & ~0xff00ff;
			int i_998_ = (i_966_ & 0xff00) * i_996_ & 0xff0000;
			i_966_ = (i_997_ | i_998_) >>> 8;
			for (int i_999_ = -i_971_; i_999_ < 0; i_999_++) {
			    for (int i_1000_ = -i_972_; i_1000_ < 0;
				 i_1000_++) {
				int i_1001_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_970_++]) & 0xff]);
				i_997_ = ((i_1001_ & 0xff00ff) * i_995_
					  & ~0xff00ff);
				i_998_
				    = (i_1001_ & 0xff00) * i_995_ & 0xff0000;
				is[i_969_++]
				    = ((i_997_ | i_998_) >>> 8) + i_966_;
			    }
			    i_969_ += i_973_;
			    i_970_ += i_974_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_967_ == 1) {
		    if (i_965_ == 1) {
			for (int i_1002_ = -i_971_; i_1002_ < 0; i_1002_++) {
			    for (int i_1003_ = -i_972_; i_1003_ < 0;
				 i_1003_++) {
				int i_1004_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_970_++]);
				if (i_1004_ != 0) {
				    int i_1005_
					= ((((Class168_Sub2_Sub3) this)
					    .anIntArray11204[i_1004_ & 0xff])
					   | ~0xffffff);
				    int i_1006_ = 255;
				    int i_1007_ = 0;
				    int i_1008_ = is[i_969_];
				    is[i_969_++]
					= (((((i_1005_ & 0xff00ff) * i_1006_
					      + (i_1008_ & 0xff00ff) * i_1007_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_1005_ & ~0xff00ff) >>> 8)
						* i_1006_)
					       + (((i_1008_ & ~0xff00ff) >>> 8)
						  * i_1007_))
					      & ~0xff00ff));
				} else
				    i_969_++;
			    }
			    i_969_ += i_973_;
			    i_970_ += i_974_;
			}
		    } else if (i_965_ == 0) {
			if ((i_966_ & 0xffffff) == 16777215) {
			    int i_1009_ = i_966_ >>> 24;
			    int i_1010_ = 256 - i_1009_;
			    for (int i_1011_ = -i_971_; i_1011_ < 0;
				 i_1011_++) {
				for (int i_1012_ = -i_972_; i_1012_ < 0;
				     i_1012_++) {
				    int i_1013_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_970_++]);
				    if (i_1013_ != 0) {
					int i_1014_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1013_ & 0xff]);
					int i_1015_ = is[i_969_];
					is[i_969_++]
					    = ((((i_1014_ & 0xff00ff) * i_1009_
						 + ((i_1015_ & 0xff00ff)
						    * i_1010_))
						& ~0xff00ff)
					       + (((i_1014_ & 0xff00) * i_1009_
						   + ((i_1015_ & 0xff00)
						      * i_1010_))
						  & 0xff0000)) >> 8;
				    } else
					i_969_++;
				}
				i_969_ += i_973_;
				i_970_ += i_974_;
			    }
			} else {
			    int i_1016_ = (i_966_ & 0xff0000) >> 16;
			    int i_1017_ = (i_966_ & 0xff00) >> 8;
			    int i_1018_ = i_966_ & 0xff;
			    int i_1019_ = i_966_ >>> 24;
			    int i_1020_ = 256 - i_1019_;
			    for (int i_1021_ = -i_971_; i_1021_ < 0;
				 i_1021_++) {
				for (int i_1022_ = -i_972_; i_1022_ < 0;
				     i_1022_++) {
				    int i_1023_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_970_++]);
				    if (i_1023_ != 0) {
					int i_1024_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1023_ & 0xff]);
					if (i_1019_ != 255) {
					    int i_1025_
						= (((i_1024_ & 0xff0000)
						    * i_1016_)
						   & ~0xffffff);
					    int i_1026_
						= ((i_1024_ & 0xff00) * i_1017_
						   & 0xff0000);
					    int i_1027_
						= ((i_1024_ & 0xff) * i_1018_
						   & 0xff00);
					    i_1024_ = (i_1025_ | i_1026_
						       | i_1027_) >>> 8;
					    int i_1028_ = is[i_969_];
					    is[i_969_++]
						= (((((i_1024_ & 0xff00ff)
						      * i_1019_)
						     + ((i_1028_ & 0xff00ff)
							* i_1020_))
						    & ~0xff00ff)
						   + ((((i_1024_ & 0xff00)
							* i_1019_)
						       + ((i_1028_ & 0xff00)
							  * i_1020_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1029_
						= (((i_1024_ & 0xff0000)
						    * i_1016_)
						   & ~0xffffff);
					    int i_1030_
						= ((i_1024_ & 0xff00) * i_1017_
						   & 0xff0000);
					    int i_1031_
						= ((i_1024_ & 0xff) * i_1018_
						   & 0xff00);
					    is[i_969_++] = (i_1029_ | i_1030_
							    | i_1031_) >>> 8;
					}
				    } else
					i_969_++;
				}
				i_969_ += i_973_;
				i_970_ += i_974_;
			    }
			}
		    } else if (i_965_ == 3) {
			int i_1032_ = i_966_ >>> 24;
			int i_1033_ = 256 - i_1032_;
			for (int i_1034_ = -i_971_; i_1034_ < 0; i_1034_++) {
			    for (int i_1035_ = -i_972_; i_1035_ < 0;
				 i_1035_++) {
				byte i_1036_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205[i_970_++]);
				int i_1037_ = (i_1036_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_1036_])
					       : 0);
				int i_1038_ = i_1037_ + i_966_;
				int i_1039_ = ((i_1037_ & 0xff00ff)
					       + (i_966_ & 0xff00ff));
				int i_1040_
				    = ((i_1039_ & 0x1000100)
				       + (i_1038_ - i_1039_ & 0x10000));
				i_1040_
				    = i_1038_ - i_1040_ | i_1040_ - (i_1040_
								     >>> 8);
				if (i_1037_ == 0 && i_1032_ != 255) {
				    i_1037_ = i_1040_;
				    i_1040_ = is[i_969_];
				    i_1040_
					= ((((i_1037_ & 0xff00ff) * i_1032_
					     + (i_1040_ & 0xff00ff) * i_1033_)
					    & ~0xff00ff)
					   + (((i_1037_ & 0xff00) * i_1032_
					       + (i_1040_ & 0xff00) * i_1033_)
					      & 0xff0000)) >> 8;
				}
				is[i_969_++] = i_1040_;
			    }
			    i_969_ += i_973_;
			    i_970_ += i_974_;
			}
		    } else if (i_965_ == 2) {
			int i_1041_ = i_966_ >>> 24;
			int i_1042_ = 256 - i_1041_;
			int i_1043_
			    = (i_966_ & 0xff00ff) * i_1042_ & ~0xff00ff;
			int i_1044_ = (i_966_ & 0xff00) * i_1042_ & 0xff0000;
			i_966_ = (i_1043_ | i_1044_) >>> 8;
			for (int i_1045_ = -i_971_; i_1045_ < 0; i_1045_++) {
			    for (int i_1046_ = -i_972_; i_1046_ < 0;
				 i_1046_++) {
				int i_1047_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_970_++]);
				if (i_1047_ != 0) {
				    int i_1048_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_1047_ & 0xff]);
				    i_1043_ = ((i_1048_ & 0xff00ff) * i_1041_
					       & ~0xff00ff);
				    i_1044_ = ((i_1048_ & 0xff00) * i_1041_
					       & 0xff0000);
				    is[i_969_++]
					= ((i_1043_ | i_1044_) >>> 8) + i_966_;
				} else
				    i_969_++;
			    }
			    i_969_ += i_973_;
			    i_970_ += i_974_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_967_ == 2) {
		    if (i_965_ == 1) {
			for (int i_1049_ = -i_971_; i_1049_ < 0; i_1049_++) {
			    for (int i_1050_ = -i_972_; i_1050_ < 0;
				 i_1050_++) {
				int i_1051_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_970_++]);
				if (i_1051_ != 0) {
				    int i_1052_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_1051_ & 0xff]);
				    int i_1053_ = is[i_969_];
				    int i_1054_ = i_1052_ + i_1053_;
				    int i_1055_ = ((i_1052_ & 0xff00ff)
						   + (i_1053_ & 0xff00ff));
				    i_1053_
					= ((i_1055_ & 0x1000100)
					   + (i_1054_ - i_1055_ & 0x10000));
				    is[i_969_++]
					= (i_1054_ - i_1053_
					   | i_1053_ - (i_1053_ >>> 8));
				} else
				    i_969_++;
			    }
			    i_969_ += i_973_;
			    i_970_ += i_974_;
			}
		    } else if (i_965_ == 0) {
			int i_1056_ = (i_966_ & 0xff0000) >> 16;
			int i_1057_ = (i_966_ & 0xff00) >> 8;
			int i_1058_ = i_966_ & 0xff;
			for (int i_1059_ = -i_971_; i_1059_ < 0; i_1059_++) {
			    for (int i_1060_ = -i_972_; i_1060_ < 0;
				 i_1060_++) {
				int i_1061_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_970_++]);
				if (i_1061_ != 0) {
				    int i_1062_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_1061_ & 0xff]);
				    int i_1063_
					= ((i_1062_ & 0xff0000) * i_1056_
					   & ~0xffffff);
				    int i_1064_ = ((i_1062_ & 0xff00) * i_1057_
						   & 0xff0000);
				    int i_1065_
					= (i_1062_ & 0xff) * i_1058_ & 0xff00;
				    i_1062_
					= (i_1063_ | i_1064_ | i_1065_) >>> 8;
				    int i_1066_ = is[i_969_];
				    int i_1067_ = i_1062_ + i_1066_;
				    int i_1068_ = ((i_1062_ & 0xff00ff)
						   + (i_1066_ & 0xff00ff));
				    i_1066_
					= ((i_1068_ & 0x1000100)
					   + (i_1067_ - i_1068_ & 0x10000));
				    is[i_969_++]
					= (i_1067_ - i_1066_
					   | i_1066_ - (i_1066_ >>> 8));
				} else
				    i_969_++;
			    }
			    i_969_ += i_973_;
			    i_970_ += i_974_;
			}
		    } else if (i_965_ == 3) {
			for (int i_1069_ = -i_971_; i_1069_ < 0; i_1069_++) {
			    for (int i_1070_ = -i_972_; i_1070_ < 0;
				 i_1070_++) {
				byte i_1071_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205[i_970_++]);
				int i_1072_ = (i_1071_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_1071_])
					       : 0);
				int i_1073_ = i_1072_ + i_966_;
				int i_1074_ = ((i_1072_ & 0xff00ff)
					       + (i_966_ & 0xff00ff));
				int i_1075_
				    = ((i_1074_ & 0x1000100)
				       + (i_1073_ - i_1074_ & 0x10000));
				i_1072_
				    = i_1073_ - i_1075_ | i_1075_ - (i_1075_
								     >>> 8);
				i_1075_ = is[i_969_];
				i_1073_ = i_1072_ + i_1075_;
				i_1074_ = (i_1072_ & 0xff00ff) + (i_1075_
								  & 0xff00ff);
				i_1075_ = ((i_1074_ & 0x1000100)
					   + (i_1073_ - i_1074_ & 0x10000));
				is[i_969_++]
				    = i_1073_ - i_1075_ | i_1075_ - (i_1075_
								     >>> 8);
			    }
			    i_969_ += i_973_;
			    i_970_ += i_974_;
			}
		    } else if (i_965_ == 2) {
			int i_1076_ = i_966_ >>> 24;
			int i_1077_ = 256 - i_1076_;
			int i_1078_
			    = (i_966_ & 0xff00ff) * i_1077_ & ~0xff00ff;
			int i_1079_ = (i_966_ & 0xff00) * i_1077_ & 0xff0000;
			i_966_ = (i_1078_ | i_1079_) >>> 8;
			for (int i_1080_ = -i_971_; i_1080_ < 0; i_1080_++) {
			    for (int i_1081_ = -i_972_; i_1081_ < 0;
				 i_1081_++) {
				int i_1082_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_970_++]);
				if (i_1082_ != 0) {
				    int i_1083_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_1082_ & 0xff]);
				    i_1078_ = ((i_1083_ & 0xff00ff) * i_1076_
					       & ~0xff00ff);
				    i_1079_ = ((i_1083_ & 0xff00) * i_1076_
					       & 0xff0000);
				    i_1083_
					= ((i_1078_ | i_1079_) >>> 8) + i_966_;
				    int i_1084_ = is[i_969_];
				    int i_1085_ = i_1083_ + i_1084_;
				    int i_1086_ = ((i_1083_ & 0xff00ff)
						   + (i_1084_ & 0xff00ff));
				    i_1084_
					= ((i_1086_ & 0x1000100)
					   + (i_1085_ - i_1086_ & 0x10000));
				    is[i_969_++]
					= (i_1085_ - i_1084_
					   | i_1084_ - (i_1084_ >>> 8));
				} else
				    i_969_++;
			    }
			    i_969_ += i_973_;
			    i_970_ += i_974_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public Interface4 method3608() {
	throw new IllegalStateException();
    }
    
    void method16225(boolean bool, boolean bool_1087_, boolean bool_1088_,
		     int i, int i_1089_, float f, int i_1090_, int i_1091_,
		     int i_1092_, int i_1093_, int i_1094_, int i_1095_,
		     boolean bool_1096_) {
	if (i_1090_ > 0 && i_1091_ > 0 && (bool || bool_1087_)) {
	    int i_1097_ = 0;
	    int i_1098_ = 0;
	    int i_1099_ = (((Class168_Sub2_Sub3) this).anInt9907
			   + ((Class168_Sub2_Sub3) this).anInt9920
			   + ((Class168_Sub2_Sub3) this).anInt9909);
	    int i_1100_ = (((Class168_Sub2_Sub3) this).anInt9905
			   + ((Class168_Sub2_Sub3) this).anInt9916
			   + ((Class168_Sub2_Sub3) this).anInt9910);
	    int i_1101_ = (i_1099_ << 16) / i_1090_;
	    int i_1102_ = (i_1100_ << 16) / i_1091_;
	    if (((Class168_Sub2_Sub3) this).anInt9907 > 0) {
		int i_1103_ = (((((Class168_Sub2_Sub3) this).anInt9907 << 16)
				+ i_1101_ - 1)
			       / i_1101_);
		i += i_1103_;
		i_1097_ += (i_1103_ * i_1101_
			    - (((Class168_Sub2_Sub3) this).anInt9907 << 16));
	    }
	    if (((Class168_Sub2_Sub3) this).anInt9905 > 0) {
		int i_1104_ = (((((Class168_Sub2_Sub3) this).anInt9905 << 16)
				+ i_1102_ - 1)
			       / i_1102_);
		i_1089_ += i_1104_;
		i_1098_ += (i_1104_ * i_1102_
			    - (((Class168_Sub2_Sub3) this).anInt9905 << 16));
	    }
	    if (((Class168_Sub2_Sub3) this).anInt9920 < i_1099_)
		i_1090_ = ((((Class168_Sub2_Sub3) this).anInt9920 << 16)
			   - i_1097_ + i_1101_ - 1) / i_1101_;
	    if (((Class168_Sub2_Sub3) this).anInt9916 < i_1100_)
		i_1091_ = ((((Class168_Sub2_Sub3) this).anInt9916 << 16)
			   - i_1098_ + i_1102_ - 1) / i_1102_;
	    int i_1105_
		= i + i_1089_ * ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						    .aClass103_Sub2_9904))
				  .anInt9260)
				 * -1826993761);
	    int i_1106_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					      .aClass103_Sub2_9904)).anInt9260
			    * -1826993761)
			   - i_1090_);
	    if (i_1089_ + i_1091_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_1091_ -= (i_1089_ + i_1091_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i_1089_ < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_1107_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_1089_);
		i_1091_ -= i_1107_;
		i_1105_ += i_1107_ * (((Class103_Sub2)
				       (((Class168_Sub2_Sub3) this)
					.aClass103_Sub2_9904)).anInt9260
				      * -1826993761);
		i_1098_ += i_1102_ * i_1107_;
	    }
	    if (i + i_1090_ > (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_1108_ = (i + i_1090_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_1090_ -= i_1108_;
		i_1106_ += i_1108_;
	    }
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_1109_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_1090_ -= i_1109_;
		i_1105_ += i_1109_;
		i_1097_ += i_1101_ * i_1109_;
		i_1106_ += i_1109_;
	    }
	    float[] fs = (((Class103_Sub2)
			   ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			  .aFloatArray9248);
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (i_1094_ == 0) {
		if (i_1092_ == 1) {
		    int i_1110_ = i_1097_;
		    for (int i_1111_ = -i_1091_; i_1111_ < 0; i_1111_++) {
			int i_1112_
			    = ((i_1098_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1113_ = -i_1090_; i_1113_ < 0; i_1113_++) {
			    if (!bool_1087_ || f < fs[i_1105_]) {
				if (bool)
				    is[i_1105_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_1097_ >> 16) + i_1112_])
					     & 0xff)]);
				if (bool_1087_ && bool_1096_)
				    fs[i_1105_] = f;
			    }
			    i_1097_ += i_1101_;
			    i_1105_++;
			}
			i_1098_ += i_1102_;
			i_1097_ = i_1110_;
			i_1105_ += i_1106_;
		    }
		} else if (i_1092_ == 0) {
		    int i_1114_ = (i_1093_ & 0xff0000) >> 16;
		    int i_1115_ = (i_1093_ & 0xff00) >> 8;
		    int i_1116_ = i_1093_ & 0xff;
		    int i_1117_ = i_1097_;
		    for (int i_1118_ = -i_1091_; i_1118_ < 0; i_1118_++) {
			int i_1119_
			    = ((i_1098_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1120_ = -i_1090_; i_1120_ < 0; i_1120_++) {
			    if (!bool_1087_ || f < fs[i_1105_]) {
				if (bool) {
				    int i_1121_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_1097_ >> 16) + i_1119_])
					     & 0xff)]);
				    int i_1122_
					= ((i_1121_ & 0xff0000) * i_1114_
					   & ~0xffffff);
				    int i_1123_ = ((i_1121_ & 0xff00) * i_1115_
						   & 0xff0000);
				    int i_1124_
					= (i_1121_ & 0xff) * i_1116_ & 0xff00;
				    is[i_1105_]
					= (i_1122_ | i_1123_ | i_1124_) >>> 8;
				}
				if (bool_1087_ && bool_1096_)
				    fs[i_1105_] = f;
			    }
			    i_1097_ += i_1101_;
			    i_1105_++;
			}
			i_1098_ += i_1102_;
			i_1097_ = i_1117_;
			i_1105_ += i_1106_;
		    }
		} else if (i_1092_ == 3) {
		    int i_1125_ = i_1097_;
		    for (int i_1126_ = -i_1091_; i_1126_ < 0; i_1126_++) {
			int i_1127_
			    = ((i_1098_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1128_ = -i_1090_; i_1128_ < 0; i_1128_++) {
			    if (!bool_1087_ || f < fs[i_1105_]) {
				if (bool) {
				    byte i_1129_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_1097_ >> 16) + i_1127_]);
				    int i_1130_
					= (i_1129_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_1129_])
					   : 0);
				    int i_1131_ = i_1130_ + i_1093_;
				    int i_1132_ = ((i_1130_ & 0xff00ff)
						   + (i_1093_ & 0xff00ff));
				    int i_1133_
					= ((i_1132_ & 0x1000100)
					   + (i_1131_ - i_1132_ & 0x10000));
				    is[i_1105_]
					= (i_1131_ - i_1133_
					   | i_1133_ - (i_1133_ >>> 8));
				}
				if (bool_1087_ && bool_1096_)
				    fs[i_1105_] = f;
			    }
			    i_1097_ += i_1101_;
			    i_1105_++;
			}
			i_1098_ += i_1102_;
			i_1097_ = i_1125_;
			i_1105_ += i_1106_;
		    }
		} else if (i_1092_ == 2) {
		    int i_1134_ = i_1093_ >>> 24;
		    int i_1135_ = 256 - i_1134_;
		    int i_1136_ = (i_1093_ & 0xff00ff) * i_1135_ & ~0xff00ff;
		    int i_1137_ = (i_1093_ & 0xff00) * i_1135_ & 0xff0000;
		    i_1093_ = (i_1136_ | i_1137_) >>> 8;
		    int i_1138_ = i_1097_;
		    for (int i_1139_ = -i_1091_; i_1139_ < 0; i_1139_++) {
			int i_1140_
			    = ((i_1098_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1141_ = -i_1090_; i_1141_ < 0; i_1141_++) {
			    if (!bool_1087_ || f < fs[i_1105_]) {
				if (bool) {
				    int i_1142_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_1097_ >> 16) + i_1140_])
					     & 0xff)]);
				    i_1136_ = ((i_1142_ & 0xff00ff) * i_1134_
					       & ~0xff00ff);
				    i_1137_ = ((i_1142_ & 0xff00) * i_1134_
					       & 0xff0000);
				    is[i_1105_] = (((i_1136_ | i_1137_) >>> 8)
						   + i_1093_);
				}
				if (bool_1087_ && bool_1096_)
				    fs[i_1105_] = f;
			    }
			    i_1097_ += i_1101_;
			    i_1105_++;
			}
			i_1098_ += i_1102_;
			i_1097_ = i_1138_;
			i_1105_ += i_1106_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1094_ == 1) {
		if (i_1092_ == 1) {
		    int i_1143_ = i_1097_;
		    for (int i_1144_ = -i_1091_; i_1144_ < 0; i_1144_++) {
			int i_1145_
			    = ((i_1098_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1146_ = -i_1090_; i_1146_ < 0; i_1146_++) {
			    if (!bool_1087_ || f < fs[i_1105_]) {
				int i_1147_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_1097_ >> 16) + i_1145_]);
				if (i_1147_ != 0) {
				    if (bool)
					is[i_1105_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1147_ & 0xff]);
				    if (bool_1087_ && bool_1096_)
					fs[i_1105_] = f;
				}
			    }
			    i_1097_ += i_1101_;
			    i_1105_++;
			}
			i_1098_ += i_1102_;
			i_1097_ = i_1143_;
			i_1105_ += i_1106_;
		    }
		} else if (i_1092_ == 0) {
		    int i_1148_ = i_1097_;
		    if ((i_1093_ & 0xffffff) == 16777215) {
			int i_1149_ = i_1093_ >>> 24;
			int i_1150_ = 256 - i_1149_;
			for (int i_1151_ = -i_1091_; i_1151_ < 0; i_1151_++) {
			    int i_1152_
				= ((i_1098_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_1153_ = -i_1090_; i_1153_ < 0;
				 i_1153_++) {
				if (!bool_1087_ || f < fs[i_1105_]) {
				    int i_1154_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_1097_ >> 16) + i_1152_]);
				    if (i_1154_ != 0) {
					if (bool) {
					    int i_1155_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_1154_ & 0xff]);
					    int i_1156_ = is[i_1105_];
					    is[i_1105_]
						= (((((i_1155_ & 0xff00ff)
						      * i_1149_)
						     + ((i_1156_ & 0xff00ff)
							* i_1150_))
						    & ~0xff00ff)
						   + ((((i_1155_ & 0xff00)
							* i_1149_)
						       + ((i_1156_ & 0xff00)
							  * i_1150_))
						      & 0xff0000)) >> 8;
					}
					if (bool_1087_ && bool_1096_)
					    fs[i_1105_] = f;
				    }
				}
				i_1097_ += i_1101_;
				i_1105_++;
			    }
			    i_1098_ += i_1102_;
			    i_1097_ = i_1148_;
			    i_1105_ += i_1106_;
			}
		    } else {
			int i_1157_ = (i_1093_ & 0xff0000) >> 16;
			int i_1158_ = (i_1093_ & 0xff00) >> 8;
			int i_1159_ = i_1093_ & 0xff;
			int i_1160_ = i_1093_ >>> 24;
			int i_1161_ = 256 - i_1160_;
			for (int i_1162_ = -i_1091_; i_1162_ < 0; i_1162_++) {
			    int i_1163_
				= ((i_1098_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_1164_ = -i_1090_; i_1164_ < 0;
				 i_1164_++) {
				if (!bool_1087_ || f < fs[i_1105_]) {
				    int i_1165_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_1097_ >> 16) + i_1163_]);
				    if (i_1165_ != 0) {
					int i_1166_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1165_ & 0xff]);
					if (i_1160_ != 255) {
					    if (bool) {
						int i_1167_
						    = (((i_1166_ & 0xff0000)
							* i_1157_)
						       & ~0xffffff);
						int i_1168_
						    = (((i_1166_ & 0xff00)
							* i_1158_)
						       & 0xff0000);
						int i_1169_
						    = (((i_1166_ & 0xff)
							* i_1159_)
						       & 0xff00);
						i_1166_ = (i_1167_ | i_1168_
							   | i_1169_) >>> 8;
						int i_1170_ = is[i_1105_];
						is[i_1105_]
						    = (((((i_1166_ & 0xff00ff)
							  * i_1160_)
							 + ((i_1170_
							     & 0xff00ff)
							    * i_1161_))
							& ~0xff00ff)
						       + ((((i_1166_ & 0xff00)
							    * i_1160_)
							   + ((i_1170_
							       & 0xff00)
							      * i_1161_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_1087_ && bool_1096_)
						fs[i_1105_] = f;
					} else {
					    if (bool) {
						int i_1171_
						    = (((i_1166_ & 0xff0000)
							* i_1157_)
						       & ~0xffffff);
						int i_1172_
						    = (((i_1166_ & 0xff00)
							* i_1158_)
						       & 0xff0000);
						int i_1173_
						    = (((i_1166_ & 0xff)
							* i_1159_)
						       & 0xff00);
						is[i_1105_]
						    = (i_1171_ | i_1172_
						       | i_1173_) >>> 8;
					    }
					    if (bool_1087_ && bool_1096_)
						fs[i_1105_] = f;
					}
				    }
				}
				i_1097_ += i_1101_;
				i_1105_++;
			    }
			    i_1098_ += i_1102_;
			    i_1097_ = i_1148_;
			    i_1105_ += i_1106_;
			}
		    }
		} else if (i_1092_ == 3) {
		    int i_1174_ = i_1097_;
		    int i_1175_ = i_1093_ >>> 24;
		    int i_1176_ = 256 - i_1175_;
		    for (int i_1177_ = -i_1091_; i_1177_ < 0; i_1177_++) {
			int i_1178_
			    = ((i_1098_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1179_ = -i_1090_; i_1179_ < 0; i_1179_++) {
			    if (!bool_1087_ || f < fs[i_1105_]) {
				if (bool) {
				    byte i_1180_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_1097_ >> 16) + i_1178_]);
				    int i_1181_
					= (i_1180_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_1180_])
					   : 0);
				    int i_1182_ = i_1181_ + i_1093_;
				    int i_1183_ = ((i_1181_ & 0xff00ff)
						   + (i_1093_ & 0xff00ff));
				    int i_1184_
					= ((i_1183_ & 0x1000100)
					   + (i_1182_ - i_1183_ & 0x10000));
				    i_1184_ = (i_1182_ - i_1184_
					       | i_1184_ - (i_1184_ >>> 8));
				    if (i_1181_ == 0 && i_1175_ != 255) {
					i_1181_ = i_1184_;
					i_1184_ = is[i_1105_];
					i_1184_
					    = ((((i_1181_ & 0xff00ff) * i_1175_
						 + ((i_1184_ & 0xff00ff)
						    * i_1176_))
						& ~0xff00ff)
					       + (((i_1181_ & 0xff00) * i_1175_
						   + ((i_1184_ & 0xff00)
						      * i_1176_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_1105_] = i_1184_;
				}
				if (bool_1087_ && bool_1096_)
				    fs[i_1105_] = f;
			    }
			    i_1097_ += i_1101_;
			    i_1105_++;
			}
			i_1098_ += i_1102_;
			i_1097_ = i_1174_;
			i_1105_ += i_1106_;
		    }
		} else if (i_1092_ == 2) {
		    int i_1185_ = i_1093_ >>> 24;
		    int i_1186_ = 256 - i_1185_;
		    int i_1187_ = (i_1093_ & 0xff00ff) * i_1186_ & ~0xff00ff;
		    int i_1188_ = (i_1093_ & 0xff00) * i_1186_ & 0xff0000;
		    i_1093_ = (i_1187_ | i_1188_) >>> 8;
		    int i_1189_ = i_1097_;
		    for (int i_1190_ = -i_1091_; i_1190_ < 0; i_1190_++) {
			int i_1191_
			    = ((i_1098_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1192_ = -i_1090_; i_1192_ < 0; i_1192_++) {
			    if (!bool_1087_ || f < fs[i_1105_]) {
				int i_1193_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_1097_ >> 16) + i_1191_]);
				if (i_1193_ != 0) {
				    if (bool) {
					int i_1194_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1193_ & 0xff]);
					i_1187_
					    = ((i_1194_ & 0xff00ff) * i_1185_
					       & ~0xff00ff);
					i_1188_ = ((i_1194_ & 0xff00) * i_1185_
						   & 0xff0000);
					is[i_1105_] = ((i_1187_ | i_1188_)
						       >>> 8) + i_1093_;
				    }
				    if (bool_1087_ && bool_1096_)
					fs[i_1105_] = f;
				}
			    }
			    i_1097_ += i_1101_;
			    i_1105_++;
			}
			i_1098_ += i_1102_;
			i_1097_ = i_1189_;
			i_1105_ += i_1106_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1094_ == 2) {
		if (i_1092_ == 1) {
		    int i_1195_ = i_1097_;
		    for (int i_1196_ = -i_1091_; i_1196_ < 0; i_1196_++) {
			int i_1197_
			    = ((i_1098_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1198_ = -i_1090_; i_1198_ < 0; i_1198_++) {
			    if (!bool_1087_ || f < fs[i_1105_]) {
				int i_1199_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_1097_ >> 16) + i_1197_]);
				if (i_1199_ != 0) {
				    if (bool) {
					int i_1200_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1199_ & 0xff]);
					int i_1201_ = is[i_1105_];
					int i_1202_ = i_1200_ + i_1201_;
					int i_1203_ = ((i_1200_ & 0xff00ff)
						       + (i_1201_ & 0xff00ff));
					i_1201_ = ((i_1203_ & 0x1000100)
						   + (i_1202_ - i_1203_
						      & 0x10000));
					is[i_1105_]
					    = (i_1202_ - i_1201_
					       | i_1201_ - (i_1201_ >>> 8));
				    }
				    if (bool_1087_ && bool_1096_)
					fs[i_1105_] = f;
				}
			    }
			    i_1097_ += i_1101_;
			    i_1105_++;
			}
			i_1098_ += i_1102_;
			i_1097_ = i_1195_;
			i_1105_ += i_1106_;
		    }
		} else if (i_1092_ == 0) {
		    int i_1204_ = i_1097_;
		    int i_1205_ = (i_1093_ & 0xff0000) >> 16;
		    int i_1206_ = (i_1093_ & 0xff00) >> 8;
		    int i_1207_ = i_1093_ & 0xff;
		    for (int i_1208_ = -i_1091_; i_1208_ < 0; i_1208_++) {
			int i_1209_
			    = ((i_1098_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1210_ = -i_1090_; i_1210_ < 0; i_1210_++) {
			    if (!bool_1087_ || f < fs[i_1105_]) {
				int i_1211_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_1097_ >> 16) + i_1209_]);
				if (i_1211_ != 0) {
				    if (bool) {
					int i_1212_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1211_ & 0xff]);
					int i_1213_
					    = ((i_1212_ & 0xff0000) * i_1205_
					       & ~0xffffff);
					int i_1214_
					    = ((i_1212_ & 0xff00) * i_1206_
					       & 0xff0000);
					int i_1215_
					    = ((i_1212_ & 0xff) * i_1207_
					       & 0xff00);
					i_1212_ = (i_1213_ | i_1214_
						   | i_1215_) >>> 8;
					int i_1216_ = is[i_1105_];
					int i_1217_ = i_1212_ + i_1216_;
					int i_1218_ = ((i_1212_ & 0xff00ff)
						       + (i_1216_ & 0xff00ff));
					i_1216_ = ((i_1218_ & 0x1000100)
						   + (i_1217_ - i_1218_
						      & 0x10000));
					is[i_1105_]
					    = (i_1217_ - i_1216_
					       | i_1216_ - (i_1216_ >>> 8));
				    }
				    if (bool_1087_ && bool_1096_)
					fs[i_1105_] = f;
				}
			    }
			    i_1097_ += i_1101_;
			    i_1105_++;
			}
			i_1098_ += i_1102_;
			i_1097_ = i_1204_;
			i_1105_ += i_1106_;
		    }
		} else if (i_1092_ == 3) {
		    int i_1219_ = i_1097_;
		    for (int i_1220_ = -i_1091_; i_1220_ < 0; i_1220_++) {
			int i_1221_
			    = ((i_1098_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1222_ = -i_1090_; i_1222_ < 0; i_1222_++) {
			    if (!bool_1087_ || f < fs[i_1105_]) {
				if (bool) {
				    byte i_1223_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_1097_ >> 16) + i_1221_]);
				    int i_1224_
					= (i_1223_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_1223_])
					   : 0);
				    int i_1225_ = i_1224_ + i_1093_;
				    int i_1226_ = ((i_1224_ & 0xff00ff)
						   + (i_1093_ & 0xff00ff));
				    int i_1227_
					= ((i_1226_ & 0x1000100)
					   + (i_1225_ - i_1226_ & 0x10000));
				    i_1224_ = (i_1225_ - i_1227_
					       | i_1227_ - (i_1227_ >>> 8));
				    i_1227_ = is[i_1105_];
				    i_1225_ = i_1224_ + i_1227_;
				    i_1226_
					= (i_1224_ & 0xff00ff) + (i_1227_
								  & 0xff00ff);
				    i_1227_
					= ((i_1226_ & 0x1000100)
					   + (i_1225_ - i_1226_ & 0x10000));
				    is[i_1105_]
					= (i_1225_ - i_1227_
					   | i_1227_ - (i_1227_ >>> 8));
				}
				if (bool_1087_ && bool_1096_)
				    fs[i_1105_] = f;
			    }
			    i_1097_ += i_1101_;
			    i_1105_++;
			}
			i_1098_ += i_1102_;
			i_1097_ = i_1219_;
			i_1105_ += i_1106_;
		    }
		} else if (i_1092_ == 2) {
		    int i_1228_ = i_1093_ >>> 24;
		    int i_1229_ = 256 - i_1228_;
		    int i_1230_ = (i_1093_ & 0xff00ff) * i_1229_ & ~0xff00ff;
		    int i_1231_ = (i_1093_ & 0xff00) * i_1229_ & 0xff0000;
		    i_1093_ = (i_1230_ | i_1231_) >>> 8;
		    int i_1232_ = i_1097_;
		    for (int i_1233_ = -i_1091_; i_1233_ < 0; i_1233_++) {
			int i_1234_
			    = ((i_1098_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1235_ = -i_1090_; i_1235_ < 0; i_1235_++) {
			    if (!bool_1087_ || f < fs[i_1105_]) {
				int i_1236_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_1097_ >> 16) + i_1234_]);
				if (i_1236_ != 0) {
				    if (bool) {
					int i_1237_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1236_ & 0xff]);
					i_1230_
					    = ((i_1237_ & 0xff00ff) * i_1228_
					       & ~0xff00ff);
					i_1231_ = ((i_1237_ & 0xff00) * i_1228_
						   & 0xff0000);
					i_1237_ = (((i_1230_ | i_1231_) >>> 8)
						   + i_1093_);
					int i_1238_ = is[i_1105_];
					int i_1239_ = i_1237_ + i_1238_;
					int i_1240_ = ((i_1237_ & 0xff00ff)
						       + (i_1238_ & 0xff00ff));
					i_1238_ = ((i_1240_ & 0x1000100)
						   + (i_1239_ - i_1240_
						      & 0x10000));
					is[i_1105_]
					    = (i_1239_ - i_1238_
					       | i_1238_ - (i_1238_ >>> 8));
				    }
				    if (bool_1087_ && bool_1096_)
					fs[i_1105_] = f;
				}
			    }
			    i_1097_ += i_1101_;
			    i_1105_++;
			}
			i_1098_ += i_1102_;
			i_1097_ = i_1232_;
			i_1105_ += i_1106_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method3630(int i, int i_1241_, int i_1242_) {
	throw new IllegalStateException();
    }
    
    void method16224(boolean bool, boolean bool_1243_, boolean bool_1244_,
		     int i, int i_1245_, float f, int i_1246_, int i_1247_,
		     int i_1248_, int i_1249_, int i_1250_, int i_1251_,
		     boolean bool_1252_) {
	if (i_1246_ > 0 && i_1247_ > 0 && (bool || bool_1243_)) {
	    int i_1253_ = 0;
	    int i_1254_ = 0;
	    int i_1255_ = (((Class168_Sub2_Sub3) this).anInt9907
			   + ((Class168_Sub2_Sub3) this).anInt9920
			   + ((Class168_Sub2_Sub3) this).anInt9909);
	    int i_1256_ = (((Class168_Sub2_Sub3) this).anInt9905
			   + ((Class168_Sub2_Sub3) this).anInt9916
			   + ((Class168_Sub2_Sub3) this).anInt9910);
	    int i_1257_ = (i_1255_ << 16) / i_1246_;
	    int i_1258_ = (i_1256_ << 16) / i_1247_;
	    if (((Class168_Sub2_Sub3) this).anInt9907 > 0) {
		int i_1259_ = (((((Class168_Sub2_Sub3) this).anInt9907 << 16)
				+ i_1257_ - 1)
			       / i_1257_);
		i += i_1259_;
		i_1253_ += (i_1259_ * i_1257_
			    - (((Class168_Sub2_Sub3) this).anInt9907 << 16));
	    }
	    if (((Class168_Sub2_Sub3) this).anInt9905 > 0) {
		int i_1260_ = (((((Class168_Sub2_Sub3) this).anInt9905 << 16)
				+ i_1258_ - 1)
			       / i_1258_);
		i_1245_ += i_1260_;
		i_1254_ += (i_1260_ * i_1258_
			    - (((Class168_Sub2_Sub3) this).anInt9905 << 16));
	    }
	    if (((Class168_Sub2_Sub3) this).anInt9920 < i_1255_)
		i_1246_ = ((((Class168_Sub2_Sub3) this).anInt9920 << 16)
			   - i_1253_ + i_1257_ - 1) / i_1257_;
	    if (((Class168_Sub2_Sub3) this).anInt9916 < i_1256_)
		i_1247_ = ((((Class168_Sub2_Sub3) this).anInt9916 << 16)
			   - i_1254_ + i_1258_ - 1) / i_1258_;
	    int i_1261_
		= i + i_1245_ * ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						    .aClass103_Sub2_9904))
				  .anInt9260)
				 * -1826993761);
	    int i_1262_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					      .aClass103_Sub2_9904)).anInt9260
			    * -1826993761)
			   - i_1246_);
	    if (i_1245_ + i_1247_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_1247_ -= (i_1245_ + i_1247_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i_1245_ < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_1263_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_1245_);
		i_1247_ -= i_1263_;
		i_1261_ += i_1263_ * (((Class103_Sub2)
				       (((Class168_Sub2_Sub3) this)
					.aClass103_Sub2_9904)).anInt9260
				      * -1826993761);
		i_1254_ += i_1258_ * i_1263_;
	    }
	    if (i + i_1246_ > (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_1264_ = (i + i_1246_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_1246_ -= i_1264_;
		i_1262_ += i_1264_;
	    }
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_1265_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_1246_ -= i_1265_;
		i_1261_ += i_1265_;
		i_1253_ += i_1257_ * i_1265_;
		i_1262_ += i_1265_;
	    }
	    float[] fs = (((Class103_Sub2)
			   ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			  .aFloatArray9248);
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (i_1250_ == 0) {
		if (i_1248_ == 1) {
		    int i_1266_ = i_1253_;
		    for (int i_1267_ = -i_1247_; i_1267_ < 0; i_1267_++) {
			int i_1268_
			    = ((i_1254_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1269_ = -i_1246_; i_1269_ < 0; i_1269_++) {
			    if (!bool_1243_ || f < fs[i_1261_]) {
				if (bool)
				    is[i_1261_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_1253_ >> 16) + i_1268_])
					     & 0xff)]);
				if (bool_1243_ && bool_1252_)
				    fs[i_1261_] = f;
			    }
			    i_1253_ += i_1257_;
			    i_1261_++;
			}
			i_1254_ += i_1258_;
			i_1253_ = i_1266_;
			i_1261_ += i_1262_;
		    }
		} else if (i_1248_ == 0) {
		    int i_1270_ = (i_1249_ & 0xff0000) >> 16;
		    int i_1271_ = (i_1249_ & 0xff00) >> 8;
		    int i_1272_ = i_1249_ & 0xff;
		    int i_1273_ = i_1253_;
		    for (int i_1274_ = -i_1247_; i_1274_ < 0; i_1274_++) {
			int i_1275_
			    = ((i_1254_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1276_ = -i_1246_; i_1276_ < 0; i_1276_++) {
			    if (!bool_1243_ || f < fs[i_1261_]) {
				if (bool) {
				    int i_1277_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_1253_ >> 16) + i_1275_])
					     & 0xff)]);
				    int i_1278_
					= ((i_1277_ & 0xff0000) * i_1270_
					   & ~0xffffff);
				    int i_1279_ = ((i_1277_ & 0xff00) * i_1271_
						   & 0xff0000);
				    int i_1280_
					= (i_1277_ & 0xff) * i_1272_ & 0xff00;
				    is[i_1261_]
					= (i_1278_ | i_1279_ | i_1280_) >>> 8;
				}
				if (bool_1243_ && bool_1252_)
				    fs[i_1261_] = f;
			    }
			    i_1253_ += i_1257_;
			    i_1261_++;
			}
			i_1254_ += i_1258_;
			i_1253_ = i_1273_;
			i_1261_ += i_1262_;
		    }
		} else if (i_1248_ == 3) {
		    int i_1281_ = i_1253_;
		    for (int i_1282_ = -i_1247_; i_1282_ < 0; i_1282_++) {
			int i_1283_
			    = ((i_1254_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1284_ = -i_1246_; i_1284_ < 0; i_1284_++) {
			    if (!bool_1243_ || f < fs[i_1261_]) {
				if (bool) {
				    byte i_1285_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_1253_ >> 16) + i_1283_]);
				    int i_1286_
					= (i_1285_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_1285_])
					   : 0);
				    int i_1287_ = i_1286_ + i_1249_;
				    int i_1288_ = ((i_1286_ & 0xff00ff)
						   + (i_1249_ & 0xff00ff));
				    int i_1289_
					= ((i_1288_ & 0x1000100)
					   + (i_1287_ - i_1288_ & 0x10000));
				    is[i_1261_]
					= (i_1287_ - i_1289_
					   | i_1289_ - (i_1289_ >>> 8));
				}
				if (bool_1243_ && bool_1252_)
				    fs[i_1261_] = f;
			    }
			    i_1253_ += i_1257_;
			    i_1261_++;
			}
			i_1254_ += i_1258_;
			i_1253_ = i_1281_;
			i_1261_ += i_1262_;
		    }
		} else if (i_1248_ == 2) {
		    int i_1290_ = i_1249_ >>> 24;
		    int i_1291_ = 256 - i_1290_;
		    int i_1292_ = (i_1249_ & 0xff00ff) * i_1291_ & ~0xff00ff;
		    int i_1293_ = (i_1249_ & 0xff00) * i_1291_ & 0xff0000;
		    i_1249_ = (i_1292_ | i_1293_) >>> 8;
		    int i_1294_ = i_1253_;
		    for (int i_1295_ = -i_1247_; i_1295_ < 0; i_1295_++) {
			int i_1296_
			    = ((i_1254_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1297_ = -i_1246_; i_1297_ < 0; i_1297_++) {
			    if (!bool_1243_ || f < fs[i_1261_]) {
				if (bool) {
				    int i_1298_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_1253_ >> 16) + i_1296_])
					     & 0xff)]);
				    i_1292_ = ((i_1298_ & 0xff00ff) * i_1290_
					       & ~0xff00ff);
				    i_1293_ = ((i_1298_ & 0xff00) * i_1290_
					       & 0xff0000);
				    is[i_1261_] = (((i_1292_ | i_1293_) >>> 8)
						   + i_1249_);
				}
				if (bool_1243_ && bool_1252_)
				    fs[i_1261_] = f;
			    }
			    i_1253_ += i_1257_;
			    i_1261_++;
			}
			i_1254_ += i_1258_;
			i_1253_ = i_1294_;
			i_1261_ += i_1262_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1250_ == 1) {
		if (i_1248_ == 1) {
		    int i_1299_ = i_1253_;
		    for (int i_1300_ = -i_1247_; i_1300_ < 0; i_1300_++) {
			int i_1301_
			    = ((i_1254_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1302_ = -i_1246_; i_1302_ < 0; i_1302_++) {
			    if (!bool_1243_ || f < fs[i_1261_]) {
				int i_1303_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_1253_ >> 16) + i_1301_]);
				if (i_1303_ != 0) {
				    if (bool)
					is[i_1261_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1303_ & 0xff]);
				    if (bool_1243_ && bool_1252_)
					fs[i_1261_] = f;
				}
			    }
			    i_1253_ += i_1257_;
			    i_1261_++;
			}
			i_1254_ += i_1258_;
			i_1253_ = i_1299_;
			i_1261_ += i_1262_;
		    }
		} else if (i_1248_ == 0) {
		    int i_1304_ = i_1253_;
		    if ((i_1249_ & 0xffffff) == 16777215) {
			int i_1305_ = i_1249_ >>> 24;
			int i_1306_ = 256 - i_1305_;
			for (int i_1307_ = -i_1247_; i_1307_ < 0; i_1307_++) {
			    int i_1308_
				= ((i_1254_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_1309_ = -i_1246_; i_1309_ < 0;
				 i_1309_++) {
				if (!bool_1243_ || f < fs[i_1261_]) {
				    int i_1310_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_1253_ >> 16) + i_1308_]);
				    if (i_1310_ != 0) {
					if (bool) {
					    int i_1311_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_1310_ & 0xff]);
					    int i_1312_ = is[i_1261_];
					    is[i_1261_]
						= (((((i_1311_ & 0xff00ff)
						      * i_1305_)
						     + ((i_1312_ & 0xff00ff)
							* i_1306_))
						    & ~0xff00ff)
						   + ((((i_1311_ & 0xff00)
							* i_1305_)
						       + ((i_1312_ & 0xff00)
							  * i_1306_))
						      & 0xff0000)) >> 8;
					}
					if (bool_1243_ && bool_1252_)
					    fs[i_1261_] = f;
				    }
				}
				i_1253_ += i_1257_;
				i_1261_++;
			    }
			    i_1254_ += i_1258_;
			    i_1253_ = i_1304_;
			    i_1261_ += i_1262_;
			}
		    } else {
			int i_1313_ = (i_1249_ & 0xff0000) >> 16;
			int i_1314_ = (i_1249_ & 0xff00) >> 8;
			int i_1315_ = i_1249_ & 0xff;
			int i_1316_ = i_1249_ >>> 24;
			int i_1317_ = 256 - i_1316_;
			for (int i_1318_ = -i_1247_; i_1318_ < 0; i_1318_++) {
			    int i_1319_
				= ((i_1254_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_1320_ = -i_1246_; i_1320_ < 0;
				 i_1320_++) {
				if (!bool_1243_ || f < fs[i_1261_]) {
				    int i_1321_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_1253_ >> 16) + i_1319_]);
				    if (i_1321_ != 0) {
					int i_1322_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1321_ & 0xff]);
					if (i_1316_ != 255) {
					    if (bool) {
						int i_1323_
						    = (((i_1322_ & 0xff0000)
							* i_1313_)
						       & ~0xffffff);
						int i_1324_
						    = (((i_1322_ & 0xff00)
							* i_1314_)
						       & 0xff0000);
						int i_1325_
						    = (((i_1322_ & 0xff)
							* i_1315_)
						       & 0xff00);
						i_1322_ = (i_1323_ | i_1324_
							   | i_1325_) >>> 8;
						int i_1326_ = is[i_1261_];
						is[i_1261_]
						    = (((((i_1322_ & 0xff00ff)
							  * i_1316_)
							 + ((i_1326_
							     & 0xff00ff)
							    * i_1317_))
							& ~0xff00ff)
						       + ((((i_1322_ & 0xff00)
							    * i_1316_)
							   + ((i_1326_
							       & 0xff00)
							      * i_1317_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_1243_ && bool_1252_)
						fs[i_1261_] = f;
					} else {
					    if (bool) {
						int i_1327_
						    = (((i_1322_ & 0xff0000)
							* i_1313_)
						       & ~0xffffff);
						int i_1328_
						    = (((i_1322_ & 0xff00)
							* i_1314_)
						       & 0xff0000);
						int i_1329_
						    = (((i_1322_ & 0xff)
							* i_1315_)
						       & 0xff00);
						is[i_1261_]
						    = (i_1327_ | i_1328_
						       | i_1329_) >>> 8;
					    }
					    if (bool_1243_ && bool_1252_)
						fs[i_1261_] = f;
					}
				    }
				}
				i_1253_ += i_1257_;
				i_1261_++;
			    }
			    i_1254_ += i_1258_;
			    i_1253_ = i_1304_;
			    i_1261_ += i_1262_;
			}
		    }
		} else if (i_1248_ == 3) {
		    int i_1330_ = i_1253_;
		    int i_1331_ = i_1249_ >>> 24;
		    int i_1332_ = 256 - i_1331_;
		    for (int i_1333_ = -i_1247_; i_1333_ < 0; i_1333_++) {
			int i_1334_
			    = ((i_1254_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1335_ = -i_1246_; i_1335_ < 0; i_1335_++) {
			    if (!bool_1243_ || f < fs[i_1261_]) {
				if (bool) {
				    byte i_1336_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_1253_ >> 16) + i_1334_]);
				    int i_1337_
					= (i_1336_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_1336_])
					   : 0);
				    int i_1338_ = i_1337_ + i_1249_;
				    int i_1339_ = ((i_1337_ & 0xff00ff)
						   + (i_1249_ & 0xff00ff));
				    int i_1340_
					= ((i_1339_ & 0x1000100)
					   + (i_1338_ - i_1339_ & 0x10000));
				    i_1340_ = (i_1338_ - i_1340_
					       | i_1340_ - (i_1340_ >>> 8));
				    if (i_1337_ == 0 && i_1331_ != 255) {
					i_1337_ = i_1340_;
					i_1340_ = is[i_1261_];
					i_1340_
					    = ((((i_1337_ & 0xff00ff) * i_1331_
						 + ((i_1340_ & 0xff00ff)
						    * i_1332_))
						& ~0xff00ff)
					       + (((i_1337_ & 0xff00) * i_1331_
						   + ((i_1340_ & 0xff00)
						      * i_1332_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_1261_] = i_1340_;
				}
				if (bool_1243_ && bool_1252_)
				    fs[i_1261_] = f;
			    }
			    i_1253_ += i_1257_;
			    i_1261_++;
			}
			i_1254_ += i_1258_;
			i_1253_ = i_1330_;
			i_1261_ += i_1262_;
		    }
		} else if (i_1248_ == 2) {
		    int i_1341_ = i_1249_ >>> 24;
		    int i_1342_ = 256 - i_1341_;
		    int i_1343_ = (i_1249_ & 0xff00ff) * i_1342_ & ~0xff00ff;
		    int i_1344_ = (i_1249_ & 0xff00) * i_1342_ & 0xff0000;
		    i_1249_ = (i_1343_ | i_1344_) >>> 8;
		    int i_1345_ = i_1253_;
		    for (int i_1346_ = -i_1247_; i_1346_ < 0; i_1346_++) {
			int i_1347_
			    = ((i_1254_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1348_ = -i_1246_; i_1348_ < 0; i_1348_++) {
			    if (!bool_1243_ || f < fs[i_1261_]) {
				int i_1349_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_1253_ >> 16) + i_1347_]);
				if (i_1349_ != 0) {
				    if (bool) {
					int i_1350_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1349_ & 0xff]);
					i_1343_
					    = ((i_1350_ & 0xff00ff) * i_1341_
					       & ~0xff00ff);
					i_1344_ = ((i_1350_ & 0xff00) * i_1341_
						   & 0xff0000);
					is[i_1261_] = ((i_1343_ | i_1344_)
						       >>> 8) + i_1249_;
				    }
				    if (bool_1243_ && bool_1252_)
					fs[i_1261_] = f;
				}
			    }
			    i_1253_ += i_1257_;
			    i_1261_++;
			}
			i_1254_ += i_1258_;
			i_1253_ = i_1345_;
			i_1261_ += i_1262_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1250_ == 2) {
		if (i_1248_ == 1) {
		    int i_1351_ = i_1253_;
		    for (int i_1352_ = -i_1247_; i_1352_ < 0; i_1352_++) {
			int i_1353_
			    = ((i_1254_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1354_ = -i_1246_; i_1354_ < 0; i_1354_++) {
			    if (!bool_1243_ || f < fs[i_1261_]) {
				int i_1355_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_1253_ >> 16) + i_1353_]);
				if (i_1355_ != 0) {
				    if (bool) {
					int i_1356_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1355_ & 0xff]);
					int i_1357_ = is[i_1261_];
					int i_1358_ = i_1356_ + i_1357_;
					int i_1359_ = ((i_1356_ & 0xff00ff)
						       + (i_1357_ & 0xff00ff));
					i_1357_ = ((i_1359_ & 0x1000100)
						   + (i_1358_ - i_1359_
						      & 0x10000));
					is[i_1261_]
					    = (i_1358_ - i_1357_
					       | i_1357_ - (i_1357_ >>> 8));
				    }
				    if (bool_1243_ && bool_1252_)
					fs[i_1261_] = f;
				}
			    }
			    i_1253_ += i_1257_;
			    i_1261_++;
			}
			i_1254_ += i_1258_;
			i_1253_ = i_1351_;
			i_1261_ += i_1262_;
		    }
		} else if (i_1248_ == 0) {
		    int i_1360_ = i_1253_;
		    int i_1361_ = (i_1249_ & 0xff0000) >> 16;
		    int i_1362_ = (i_1249_ & 0xff00) >> 8;
		    int i_1363_ = i_1249_ & 0xff;
		    for (int i_1364_ = -i_1247_; i_1364_ < 0; i_1364_++) {
			int i_1365_
			    = ((i_1254_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1366_ = -i_1246_; i_1366_ < 0; i_1366_++) {
			    if (!bool_1243_ || f < fs[i_1261_]) {
				int i_1367_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_1253_ >> 16) + i_1365_]);
				if (i_1367_ != 0) {
				    if (bool) {
					int i_1368_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1367_ & 0xff]);
					int i_1369_
					    = ((i_1368_ & 0xff0000) * i_1361_
					       & ~0xffffff);
					int i_1370_
					    = ((i_1368_ & 0xff00) * i_1362_
					       & 0xff0000);
					int i_1371_
					    = ((i_1368_ & 0xff) * i_1363_
					       & 0xff00);
					i_1368_ = (i_1369_ | i_1370_
						   | i_1371_) >>> 8;
					int i_1372_ = is[i_1261_];
					int i_1373_ = i_1368_ + i_1372_;
					int i_1374_ = ((i_1368_ & 0xff00ff)
						       + (i_1372_ & 0xff00ff));
					i_1372_ = ((i_1374_ & 0x1000100)
						   + (i_1373_ - i_1374_
						      & 0x10000));
					is[i_1261_]
					    = (i_1373_ - i_1372_
					       | i_1372_ - (i_1372_ >>> 8));
				    }
				    if (bool_1243_ && bool_1252_)
					fs[i_1261_] = f;
				}
			    }
			    i_1253_ += i_1257_;
			    i_1261_++;
			}
			i_1254_ += i_1258_;
			i_1253_ = i_1360_;
			i_1261_ += i_1262_;
		    }
		} else if (i_1248_ == 3) {
		    int i_1375_ = i_1253_;
		    for (int i_1376_ = -i_1247_; i_1376_ < 0; i_1376_++) {
			int i_1377_
			    = ((i_1254_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1378_ = -i_1246_; i_1378_ < 0; i_1378_++) {
			    if (!bool_1243_ || f < fs[i_1261_]) {
				if (bool) {
				    byte i_1379_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_1253_ >> 16) + i_1377_]);
				    int i_1380_
					= (i_1379_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_1379_])
					   : 0);
				    int i_1381_ = i_1380_ + i_1249_;
				    int i_1382_ = ((i_1380_ & 0xff00ff)
						   + (i_1249_ & 0xff00ff));
				    int i_1383_
					= ((i_1382_ & 0x1000100)
					   + (i_1381_ - i_1382_ & 0x10000));
				    i_1380_ = (i_1381_ - i_1383_
					       | i_1383_ - (i_1383_ >>> 8));
				    i_1383_ = is[i_1261_];
				    i_1381_ = i_1380_ + i_1383_;
				    i_1382_
					= (i_1380_ & 0xff00ff) + (i_1383_
								  & 0xff00ff);
				    i_1383_
					= ((i_1382_ & 0x1000100)
					   + (i_1381_ - i_1382_ & 0x10000));
				    is[i_1261_]
					= (i_1381_ - i_1383_
					   | i_1383_ - (i_1383_ >>> 8));
				}
				if (bool_1243_ && bool_1252_)
				    fs[i_1261_] = f;
			    }
			    i_1253_ += i_1257_;
			    i_1261_++;
			}
			i_1254_ += i_1258_;
			i_1253_ = i_1375_;
			i_1261_ += i_1262_;
		    }
		} else if (i_1248_ == 2) {
		    int i_1384_ = i_1249_ >>> 24;
		    int i_1385_ = 256 - i_1384_;
		    int i_1386_ = (i_1249_ & 0xff00ff) * i_1385_ & ~0xff00ff;
		    int i_1387_ = (i_1249_ & 0xff00) * i_1385_ & 0xff0000;
		    i_1249_ = (i_1386_ | i_1387_) >>> 8;
		    int i_1388_ = i_1253_;
		    for (int i_1389_ = -i_1247_; i_1389_ < 0; i_1389_++) {
			int i_1390_
			    = ((i_1254_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_1391_ = -i_1246_; i_1391_ < 0; i_1391_++) {
			    if (!bool_1243_ || f < fs[i_1261_]) {
				int i_1392_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_1253_ >> 16) + i_1390_]);
				if (i_1392_ != 0) {
				    if (bool) {
					int i_1393_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1392_ & 0xff]);
					i_1386_
					    = ((i_1393_ & 0xff00ff) * i_1384_
					       & ~0xff00ff);
					i_1387_ = ((i_1393_ & 0xff00) * i_1384_
						   & 0xff0000);
					i_1393_ = (((i_1386_ | i_1387_) >>> 8)
						   + i_1249_);
					int i_1394_ = is[i_1261_];
					int i_1395_ = i_1393_ + i_1394_;
					int i_1396_ = ((i_1393_ & 0xff00ff)
						       + (i_1394_ & 0xff00ff));
					i_1394_ = ((i_1396_ & 0x1000100)
						   + (i_1395_ - i_1396_
						      & 0x10000));
					is[i_1261_]
					    = (i_1395_ - i_1394_
					       | i_1394_ - (i_1394_ >>> 8));
				    }
				    if (bool_1243_ && bool_1252_)
					fs[i_1261_] = f;
				}
			    }
			    i_1253_ += i_1257_;
			    i_1261_++;
			}
			i_1254_ += i_1258_;
			i_1253_ = i_1388_;
			i_1261_ += i_1262_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public Interface4 method3636() {
	throw new IllegalStateException();
    }
    
    public Interface4 method3633() {
	throw new IllegalStateException();
    }
    
    public Interface4 method3654() {
	throw new IllegalStateException();
    }
    
    void method16228(int[] is, int[] is_1397_, int i, int i_1398_) {
	int[] is_1399_ = (((Class103_Sub2)
			   ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			  .anIntArray9245);
	if (is_1399_ != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_1400_ = anInt9919;
		    while (i_1400_ < 0) {
			int i_1401_ = i_1400_ + i_1398_;
			if (i_1401_ >= 0) {
			    if (i_1401_ >= is.length)
				break;
			    int i_1402_ = anInt9925;
			    int i_1403_ = anInt9927;
			    int i_1404_ = anInt9928;
			    int i_1405_ = anInt9906;
			    if (i_1403_ >= 0 && i_1404_ >= 0
				&& (i_1403_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)) < 0
				&& (i_1404_
				    - (((Class168_Sub2_Sub3) this).anInt9916
				       << 12)) < 0) {
				int i_1406_ = is[i_1401_] - i;
				int i_1407_ = -is_1397_[i_1401_];
				int i_1408_ = i_1406_ - (i_1402_ - anInt9925);
				if (i_1408_ > 0) {
				    i_1402_ += i_1408_;
				    i_1405_ += i_1408_;
				    i_1403_ += anInt9921 * i_1408_;
				    i_1404_ += anInt9922 * i_1408_;
				} else
				    i_1407_ -= i_1408_;
				if (i_1405_ < i_1407_)
				    i_1405_ = i_1407_;
				for (/**/; i_1405_ < 0; i_1405_++) {
				    int i_1409_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(((i_1404_ >> 12)
					      * (((Class168_Sub2_Sub3) this)
						 .anInt9920))
					     + (i_1403_ >> 12))]);
				    if (i_1409_ != 0)
					is_1399_[i_1402_++]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1409_ & 0xff]);
				    else
					i_1402_++;
				}
			    }
			}
			i_1400_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_1410_ = anInt9919;
		    while (i_1410_ < 0) {
			int i_1411_ = i_1410_ + i_1398_;
			if (i_1411_ >= 0) {
			    if (i_1411_ >= is.length)
				break;
			    int i_1412_ = anInt9925;
			    int i_1413_ = anInt9927;
			    int i_1414_ = anInt9928 + anInt9930;
			    int i_1415_ = anInt9906;
			    if (i_1413_ >= 0
				&& (i_1413_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)) < 0) {
				int i_1416_;
				if ((i_1416_
				     = i_1414_ - ((((Class168_Sub2_Sub3) this)
						   .anInt9916)
						  << 12))
				    >= 0) {
				    i_1416_
					= (anInt9922 - i_1416_) / anInt9922;
				    i_1415_ += i_1416_;
				    i_1414_ += anInt9922 * i_1416_;
				    i_1412_ += i_1416_;
				}
				if ((i_1416_
				     = (i_1414_ - anInt9922) / anInt9922)
				    > i_1415_)
				    i_1415_ = i_1416_;
				int i_1417_ = is[i_1411_] - i;
				int i_1418_ = -is_1397_[i_1411_];
				int i_1419_ = i_1417_ - (i_1412_ - anInt9925);
				if (i_1419_ > 0) {
				    i_1412_ += i_1419_;
				    i_1415_ += i_1419_;
				    i_1413_ += anInt9921 * i_1419_;
				    i_1414_ += anInt9922 * i_1419_;
				} else
				    i_1418_ -= i_1419_;
				if (i_1415_ < i_1418_)
				    i_1415_ = i_1418_;
				for (/**/; i_1415_ < 0; i_1415_++) {
				    int i_1420_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(((i_1414_ >> 12)
					      * (((Class168_Sub2_Sub3) this)
						 .anInt9920))
					     + (i_1413_ >> 12))]);
				    if (i_1420_ != 0)
					is_1399_[i_1412_++]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1420_ & 0xff]);
				    else
					i_1412_++;
				    i_1414_ += anInt9922;
				}
			    }
			}
			i_1410_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_1421_ = anInt9919;
		    while (i_1421_ < 0) {
			int i_1422_ = i_1421_ + i_1398_;
			if (i_1422_ >= 0) {
			    if (i_1422_ >= is.length)
				break;
			    int i_1423_ = anInt9925;
			    int i_1424_ = anInt9927;
			    int i_1425_ = anInt9928 + anInt9930;
			    int i_1426_ = anInt9906;
			    if (i_1424_ >= 0
				&& (i_1424_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)) < 0) {
				if (i_1425_ < 0) {
				    int i_1427_ = ((anInt9922 - 1 - i_1425_)
						   / anInt9922);
				    i_1426_ += i_1427_;
				    i_1425_ += anInt9922 * i_1427_;
				    i_1423_ += i_1427_;
				}
				int i_1428_;
				if ((i_1428_ = (1 + i_1425_
						- ((((Class168_Sub2_Sub3) this)
						    .anInt9916)
						   << 12)
						- anInt9922) / anInt9922)
				    > i_1426_)
				    i_1426_ = i_1428_;
				int i_1429_ = is[i_1422_] - i;
				int i_1430_ = -is_1397_[i_1422_];
				int i_1431_ = i_1429_ - (i_1423_ - anInt9925);
				if (i_1431_ > 0) {
				    i_1423_ += i_1431_;
				    i_1426_ += i_1431_;
				    i_1424_ += anInt9921 * i_1431_;
				    i_1425_ += anInt9922 * i_1431_;
				} else
				    i_1430_ -= i_1431_;
				if (i_1426_ < i_1430_)
				    i_1426_ = i_1430_;
				for (/**/; i_1426_ < 0; i_1426_++) {
				    int i_1432_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(((i_1425_ >> 12)
					      * (((Class168_Sub2_Sub3) this)
						 .anInt9920))
					     + (i_1424_ >> 12))]);
				    if (i_1432_ != 0)
					is_1399_[i_1423_++]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1432_ & 0xff]);
				    else
					i_1423_++;
				    i_1425_ += anInt9922;
				}
			    }
			}
			i_1421_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_1433_ = anInt9919;
		    while (i_1433_ < 0) {
			int i_1434_ = i_1433_ + i_1398_;
			if (i_1434_ >= 0) {
			    if (i_1434_ >= is.length)
				break;
			    int i_1435_ = anInt9925;
			    int i_1436_ = anInt9927 + anInt9929;
			    int i_1437_ = anInt9928;
			    int i_1438_ = anInt9906;
			    if (i_1437_ >= 0
				&& (i_1437_
				    - (((Class168_Sub2_Sub3) this).anInt9916
				       << 12)) < 0) {
				int i_1439_;
				if ((i_1439_
				     = i_1436_ - ((((Class168_Sub2_Sub3) this)
						   .anInt9920)
						  << 12))
				    >= 0) {
				    i_1439_
					= (anInt9921 - i_1439_) / anInt9921;
				    i_1438_ += i_1439_;
				    i_1436_ += anInt9921 * i_1439_;
				    i_1435_ += i_1439_;
				}
				if ((i_1439_
				     = (i_1436_ - anInt9921) / anInt9921)
				    > i_1438_)
				    i_1438_ = i_1439_;
				int i_1440_ = is[i_1434_] - i;
				int i_1441_ = -is_1397_[i_1434_];
				int i_1442_ = i_1440_ - (i_1435_ - anInt9925);
				if (i_1442_ > 0) {
				    i_1435_ += i_1442_;
				    i_1438_ += i_1442_;
				    i_1436_ += anInt9921 * i_1442_;
				    i_1437_ += anInt9922 * i_1442_;
				} else
				    i_1441_ -= i_1442_;
				if (i_1438_ < i_1441_)
				    i_1438_ = i_1441_;
				for (/**/; i_1438_ < 0; i_1438_++) {
				    int i_1443_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(((i_1437_ >> 12)
					      * (((Class168_Sub2_Sub3) this)
						 .anInt9920))
					     + (i_1436_ >> 12))]);
				    if (i_1443_ != 0)
					is_1399_[i_1435_++]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1443_ & 0xff]);
				    else
					i_1435_++;
				    i_1436_ += anInt9921;
				}
			    }
			}
			i_1433_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_1444_ = anInt9919;
		    while (i_1444_ < 0) {
			int i_1445_ = i_1444_ + i_1398_;
			if (i_1445_ >= 0) {
			    if (i_1445_ >= is.length)
				break;
			    int i_1446_ = anInt9925;
			    int i_1447_ = anInt9927 + anInt9929;
			    int i_1448_ = anInt9928 + anInt9930;
			    int i_1449_ = anInt9906;
			    int i_1450_;
			    if ((i_1450_
				 = (i_1447_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)))
				>= 0) {
				i_1450_ = (anInt9921 - i_1450_) / anInt9921;
				i_1449_ += i_1450_;
				i_1447_ += anInt9921 * i_1450_;
				i_1448_ += anInt9922 * i_1450_;
				i_1446_ += i_1450_;
			    }
			    if ((i_1450_ = (i_1447_ - anInt9921) / anInt9921)
				> i_1449_)
				i_1449_ = i_1450_;
			    if ((i_1450_
				 = (i_1448_
				    - (((Class168_Sub2_Sub3) this).anInt9916
				       << 12)))
				>= 0) {
				i_1450_ = (anInt9922 - i_1450_) / anInt9922;
				i_1449_ += i_1450_;
				i_1447_ += anInt9921 * i_1450_;
				i_1448_ += anInt9922 * i_1450_;
				i_1446_ += i_1450_;
			    }
			    if ((i_1450_ = (i_1448_ - anInt9922) / anInt9922)
				> i_1449_)
				i_1449_ = i_1450_;
			    int i_1451_ = is[i_1445_] - i;
			    int i_1452_ = -is_1397_[i_1445_];
			    int i_1453_ = i_1451_ - (i_1446_ - anInt9925);
			    if (i_1453_ > 0) {
				i_1446_ += i_1453_;
				i_1449_ += i_1453_;
				i_1447_ += anInt9921 * i_1453_;
				i_1448_ += anInt9922 * i_1453_;
			    } else
				i_1452_ -= i_1453_;
			    if (i_1449_ < i_1452_)
				i_1449_ = i_1452_;
			    for (/**/; i_1449_ < 0; i_1449_++) {
				int i_1454_
				    = (((Class168_Sub2_Sub3) this)
				       .aByteArray11205
				       [((i_1448_ >> 12)
					 * (((Class168_Sub2_Sub3) this)
					    .anInt9920)) + (i_1447_ >> 12)]);
				if (i_1454_ != 0)
				    is_1399_[i_1446_++]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_1454_ & 0xff]);
				else
				    i_1446_++;
				i_1447_ += anInt9921;
				i_1448_ += anInt9922;
			    }
			}
			i_1444_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_1455_ = anInt9919;
		    while (i_1455_ < 0) {
			int i_1456_ = i_1455_ + i_1398_;
			if (i_1456_ >= 0) {
			    if (i_1456_ >= is.length)
				break;
			    int i_1457_ = anInt9925;
			    int i_1458_ = anInt9927 + anInt9929;
			    int i_1459_ = anInt9928 + anInt9930;
			    int i_1460_ = anInt9906;
			    int i_1461_;
			    if ((i_1461_
				 = (i_1458_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)))
				>= 0) {
				i_1461_ = (anInt9921 - i_1461_) / anInt9921;
				i_1460_ += i_1461_;
				i_1458_ += anInt9921 * i_1461_;
				i_1459_ += anInt9922 * i_1461_;
				i_1457_ += i_1461_;
			    }
			    if ((i_1461_ = (i_1458_ - anInt9921) / anInt9921)
				> i_1460_)
				i_1460_ = i_1461_;
			    if (i_1459_ < 0) {
				i_1461_
				    = (anInt9922 - 1 - i_1459_) / anInt9922;
				i_1460_ += i_1461_;
				i_1458_ += anInt9921 * i_1461_;
				i_1459_ += anInt9922 * i_1461_;
				i_1457_ += i_1461_;
			    }
			    if ((i_1461_
				 = (1 + i_1459_
				    - (((Class168_Sub2_Sub3) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_1460_)
				i_1460_ = i_1461_;
			    int i_1462_ = is[i_1456_] - i;
			    int i_1463_ = -is_1397_[i_1456_];
			    int i_1464_ = i_1462_ - (i_1457_ - anInt9925);
			    if (i_1464_ > 0) {
				i_1457_ += i_1464_;
				i_1460_ += i_1464_;
				i_1458_ += anInt9921 * i_1464_;
				i_1459_ += anInt9922 * i_1464_;
			    } else
				i_1463_ -= i_1464_;
			    if (i_1460_ < i_1463_)
				i_1460_ = i_1463_;
			    for (/**/; i_1460_ < 0; i_1460_++) {
				int i_1465_
				    = (((Class168_Sub2_Sub3) this)
				       .aByteArray11205
				       [((i_1459_ >> 12)
					 * (((Class168_Sub2_Sub3) this)
					    .anInt9920)) + (i_1458_ >> 12)]);
				if (i_1465_ != 0)
				    is_1399_[i_1457_++]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_1465_ & 0xff]);
				else
				    i_1457_++;
				i_1458_ += anInt9921;
				i_1459_ += anInt9922;
			    }
			}
			i_1455_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_1466_ = anInt9919;
		while (i_1466_ < 0) {
		    int i_1467_ = i_1466_ + i_1398_;
		    if (i_1467_ >= 0) {
			if (i_1467_ >= is.length)
			    break;
			int i_1468_ = anInt9925;
			int i_1469_ = anInt9927 + anInt9929;
			int i_1470_ = anInt9928;
			int i_1471_ = anInt9906;
			if (i_1470_ >= 0
			    && i_1470_ - (((Class168_Sub2_Sub3) this).anInt9916
					  << 12) < 0) {
			    if (i_1469_ < 0) {
				int i_1472_
				    = (anInt9921 - 1 - i_1469_) / anInt9921;
				i_1471_ += i_1472_;
				i_1469_ += anInt9921 * i_1472_;
				i_1468_ += i_1472_;
			    }
			    int i_1473_;
			    if ((i_1473_
				 = (1 + i_1469_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)
				    - anInt9921) / anInt9921)
				> i_1471_)
				i_1471_ = i_1473_;
			    int i_1474_ = is[i_1467_] - i;
			    int i_1475_ = -is_1397_[i_1467_];
			    int i_1476_ = i_1474_ - (i_1468_ - anInt9925);
			    if (i_1476_ > 0) {
				i_1468_ += i_1476_;
				i_1471_ += i_1476_;
				i_1469_ += anInt9921 * i_1476_;
				i_1470_ += anInt9922 * i_1476_;
			    } else
				i_1475_ -= i_1476_;
			    if (i_1471_ < i_1475_)
				i_1471_ = i_1475_;
			    for (/**/; i_1471_ < 0; i_1471_++) {
				int i_1477_
				    = (((Class168_Sub2_Sub3) this)
				       .aByteArray11205
				       [((i_1470_ >> 12)
					 * (((Class168_Sub2_Sub3) this)
					    .anInt9920)) + (i_1469_ >> 12)]);
				if (i_1477_ != 0)
				    is_1399_[i_1468_++]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_1477_ & 0xff]);
				else
				    i_1468_++;
				i_1469_ += anInt9921;
			    }
			}
		    }
		    i_1466_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		int i_1478_ = anInt9919;
		while (i_1478_ < 0) {
		    int i_1479_ = i_1478_ + i_1398_;
		    if (i_1479_ >= 0) {
			if (i_1479_ >= is.length)
			    break;
			int i_1480_ = anInt9925;
			int i_1481_ = anInt9927 + anInt9929;
			int i_1482_ = anInt9928 + anInt9930;
			int i_1483_ = anInt9906;
			if (i_1481_ < 0) {
			    int i_1484_
				= (anInt9921 - 1 - i_1481_) / anInt9921;
			    i_1483_ += i_1484_;
			    i_1481_ += anInt9921 * i_1484_;
			    i_1482_ += anInt9922 * i_1484_;
			    i_1480_ += i_1484_;
			}
			int i_1485_;
			if ((i_1485_
			     = (1 + i_1481_
				- (((Class168_Sub2_Sub3) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_1483_)
			    i_1483_ = i_1485_;
			if ((i_1485_
			     = i_1482_ - (((Class168_Sub2_Sub3) this).anInt9916
					  << 12))
			    >= 0) {
			    i_1485_ = (anInt9922 - i_1485_) / anInt9922;
			    i_1483_ += i_1485_;
			    i_1481_ += anInt9921 * i_1485_;
			    i_1482_ += anInt9922 * i_1485_;
			    i_1480_ += i_1485_;
			}
			if ((i_1485_ = (i_1482_ - anInt9922) / anInt9922)
			    > i_1483_)
			    i_1483_ = i_1485_;
			int i_1486_ = is[i_1479_] - i;
			int i_1487_ = -is_1397_[i_1479_];
			int i_1488_ = i_1486_ - (i_1480_ - anInt9925);
			if (i_1488_ > 0) {
			    i_1480_ += i_1488_;
			    i_1483_ += i_1488_;
			    i_1481_ += anInt9921 * i_1488_;
			    i_1482_ += anInt9922 * i_1488_;
			} else
			    i_1487_ -= i_1488_;
			if (i_1483_ < i_1487_)
			    i_1483_ = i_1487_;
			for (/**/; i_1483_ < 0; i_1483_++) {
			    int i_1489_
				= (((Class168_Sub2_Sub3) this).aByteArray11205
				   [(((i_1482_ >> 12)
				      * ((Class168_Sub2_Sub3) this).anInt9920)
				     + (i_1481_ >> 12))]);
			    if (i_1489_ != 0)
				is_1399_[i_1480_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204[i_1489_ & 0xff]);
			    else
				i_1480_++;
			    i_1481_ += anInt9921;
			    i_1482_ += anInt9922;
			}
		    }
		    i_1478_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		int i_1490_ = anInt9919;
		while (i_1490_ < 0) {
		    int i_1491_ = i_1490_ + i_1398_;
		    if (i_1491_ >= 0) {
			if (i_1491_ >= is.length)
			    break;
			int i_1492_ = anInt9925;
			int i_1493_ = anInt9927 + anInt9929;
			int i_1494_ = anInt9928 + anInt9930;
			int i_1495_ = anInt9906;
			if (i_1493_ < 0) {
			    int i_1496_
				= (anInt9921 - 1 - i_1493_) / anInt9921;
			    i_1495_ += i_1496_;
			    i_1493_ += anInt9921 * i_1496_;
			    i_1494_ += anInt9922 * i_1496_;
			    i_1492_ += i_1496_;
			}
			int i_1497_;
			if ((i_1497_
			     = (1 + i_1493_
				- (((Class168_Sub2_Sub3) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_1495_)
			    i_1495_ = i_1497_;
			if (i_1494_ < 0) {
			    i_1497_ = (anInt9922 - 1 - i_1494_) / anInt9922;
			    i_1495_ += i_1497_;
			    i_1493_ += anInt9921 * i_1497_;
			    i_1494_ += anInt9922 * i_1497_;
			    i_1492_ += i_1497_;
			}
			if ((i_1497_
			     = (1 + i_1494_
				- (((Class168_Sub2_Sub3) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_1495_)
			    i_1495_ = i_1497_;
			int i_1498_ = is[i_1491_] - i;
			int i_1499_ = -is_1397_[i_1491_];
			int i_1500_ = i_1498_ - (i_1492_ - anInt9925);
			if (i_1500_ > 0) {
			    i_1492_ += i_1500_;
			    i_1495_ += i_1500_;
			    i_1493_ += anInt9921 * i_1500_;
			    i_1494_ += anInt9922 * i_1500_;
			} else
			    i_1499_ -= i_1500_;
			if (i_1495_ < i_1499_)
			    i_1495_ = i_1499_;
			for (/**/; i_1495_ < 0; i_1495_++) {
			    int i_1501_
				= (((Class168_Sub2_Sub3) this).aByteArray11205
				   [(((i_1494_ >> 12)
				      * ((Class168_Sub2_Sub3) this).anInt9920)
				     + (i_1493_ >> 12))]);
			    if (i_1501_ != 0)
				is_1399_[i_1492_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204[i_1501_ & 0xff]);
			    else
				i_1492_++;
			    i_1493_ += anInt9921;
			    i_1494_ += anInt9922;
			}
		    }
		    i_1490_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    public void method3607(int i, int i_1502_, Class135 class135, int i_1503_,
			   int i_1504_) {
	if (((Class168_Sub2_Sub3) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    i += ((Class168_Sub2_Sub3) this).anInt9907;
	    i_1502_ += ((Class168_Sub2_Sub3) this).anInt9905;
	    int i_1505_ = 0;
	    int i_1506_ = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761);
	    int i_1507_ = ((Class168_Sub2_Sub3) this).anInt9920;
	    int i_1508_ = ((Class168_Sub2_Sub3) this).anInt9916;
	    int i_1509_ = i_1506_ - i_1507_;
	    int i_1510_ = 0;
	    int i_1511_ = i + i_1502_ * i_1506_;
	    if (i_1502_ < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_1512_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_1502_);
		i_1508_ -= i_1512_;
		i_1502_ = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385);
		i_1505_ += i_1512_ * i_1507_;
		i_1511_ += i_1512_ * i_1506_;
	    }
	    if (i_1502_ + i_1508_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_1508_ -= (i_1502_ + i_1508_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_1513_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_1507_ -= i_1513_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_1505_ += i_1513_;
		i_1511_ += i_1513_;
		i_1510_ += i_1513_;
		i_1509_ += i_1513_;
	    }
	    if (i + i_1507_ > (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_1514_ = (i + i_1507_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_1507_ -= i_1514_;
		i_1510_ += i_1514_;
		i_1509_ += i_1514_;
	    }
	    if (i_1507_ > 0 && i_1508_ > 0) {
		Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
		int[] is_1515_
		    = ((Class135_Sub1) class135_sub1).anIntArray9874;
		int[] is_1516_
		    = ((Class135_Sub1) class135_sub1).anIntArray9873;
		int i_1517_ = i_1502_;
		if (i_1504_ > i_1517_) {
		    i_1517_ = i_1504_;
		    i_1511_ += (i_1504_ - i_1502_) * i_1506_;
		    i_1505_ += ((i_1504_ - i_1502_)
				* ((Class168_Sub2_Sub3) this).anInt9920);
		}
		int i_1518_
		    = (i_1504_ + is_1515_.length < i_1502_ + i_1508_
		       ? i_1504_ + is_1515_.length : i_1502_ + i_1508_);
		for (int i_1519_ = i_1517_; i_1519_ < i_1518_; i_1519_++) {
		    int i_1520_ = is_1515_[i_1519_ - i_1504_] + i_1503_;
		    int i_1521_ = is_1516_[i_1519_ - i_1504_];
		    int i_1522_ = i_1507_;
		    if (i > i_1520_) {
			int i_1523_ = i - i_1520_;
			if (i_1523_ >= i_1521_) {
			    i_1505_ += i_1507_ + i_1510_;
			    i_1511_ += i_1507_ + i_1509_;
			    continue;
			}
			i_1521_ -= i_1523_;
		    } else {
			int i_1524_ = i_1520_ - i;
			if (i_1524_ >= i_1507_) {
			    i_1505_ += i_1507_ + i_1510_;
			    i_1511_ += i_1507_ + i_1509_;
			    continue;
			}
			i_1505_ += i_1524_;
			i_1522_ -= i_1524_;
			i_1511_ += i_1524_;
		    }
		    int i_1525_ = 0;
		    if (i_1522_ < i_1521_)
			i_1521_ = i_1522_;
		    else
			i_1525_ = i_1522_ - i_1521_;
		    for (int i_1526_ = -i_1521_; i_1526_ < 0; i_1526_++) {
			int i_1527_ = (((Class168_Sub2_Sub3) this)
				       .aByteArray11205[i_1505_++]);
			if (i_1527_ != 0)
			    is[i_1511_++] = (((Class168_Sub2_Sub3) this)
					     .anIntArray11204[i_1527_ & 0xff]);
			else
			    i_1511_++;
		    }
		    i_1505_ += i_1525_ + i_1510_;
		    i_1511_ += i_1525_ + i_1509_;
		}
	    }
	}
    }
    
    public void method3658(int i, int i_1528_, int i_1529_, int i_1530_,
			   int i_1531_) {
	if (((Class168_Sub2_Sub3) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    int i_1532_ = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761);
	    i += ((Class168_Sub2_Sub3) this).anInt9907;
	    i_1528_ += ((Class168_Sub2_Sub3) this).anInt9905;
	    int i_1533_ = i_1528_ * i_1532_ + i;
	    int i_1534_ = 0;
	    int i_1535_ = ((Class168_Sub2_Sub3) this).anInt9916;
	    int i_1536_ = ((Class168_Sub2_Sub3) this).anInt9920;
	    int i_1537_ = i_1532_ - i_1536_;
	    int i_1538_ = 0;
	    if (i_1528_ < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_1539_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_1528_);
		i_1535_ -= i_1539_;
		i_1528_ = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385);
		i_1534_ += i_1539_ * i_1536_;
		i_1533_ += i_1539_ * i_1532_;
	    }
	    if (i_1528_ + i_1535_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_1535_ -= (i_1528_ + i_1535_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_1540_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_1536_ -= i_1540_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_1534_ += i_1540_;
		i_1533_ += i_1540_;
		i_1538_ += i_1540_;
		i_1537_ += i_1540_;
	    }
	    if (i + i_1536_ > (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_1541_ = (i + i_1536_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_1536_ -= i_1541_;
		i_1538_ += i_1541_;
		i_1537_ += i_1541_;
	    }
	    if (i_1536_ > 0 && i_1535_ > 0) {
		if (i_1531_ == 0) {
		    if (i_1529_ == 1) {
			for (int i_1542_ = -i_1535_; i_1542_ < 0; i_1542_++) {
			    int i_1543_ = i_1533_ + i_1536_ - 3;
			    while (i_1533_ < i_1543_) {
				is[i_1533_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_1534_++]) & 0xff]);
				is[i_1533_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_1534_++]) & 0xff]);
				is[i_1533_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_1534_++]) & 0xff]);
				is[i_1533_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_1534_++]) & 0xff]);
			    }
			    i_1543_ += 3;
			    while (i_1533_ < i_1543_)
				is[i_1533_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_1534_++]) & 0xff]);
			    i_1533_ += i_1537_;
			    i_1534_ += i_1538_;
			}
		    } else if (i_1529_ == 0) {
			int i_1544_ = (i_1530_ & 0xff0000) >> 16;
			int i_1545_ = (i_1530_ & 0xff00) >> 8;
			int i_1546_ = i_1530_ & 0xff;
			for (int i_1547_ = -i_1535_; i_1547_ < 0; i_1547_++) {
			    for (int i_1548_ = -i_1536_; i_1548_ < 0;
				 i_1548_++) {
				int i_1549_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_1534_++]) & 0xff]);
				int i_1550_ = ((i_1549_ & 0xff0000) * i_1544_
					       & ~0xffffff);
				int i_1551_
				    = (i_1549_ & 0xff00) * i_1545_ & 0xff0000;
				int i_1552_
				    = (i_1549_ & 0xff) * i_1546_ & 0xff00;
				is[i_1533_++]
				    = (i_1550_ | i_1551_ | i_1552_) >>> 8;
			    }
			    i_1533_ += i_1537_;
			    i_1534_ += i_1538_;
			}
		    } else if (i_1529_ == 3) {
			for (int i_1553_ = -i_1535_; i_1553_ < 0; i_1553_++) {
			    for (int i_1554_ = -i_1536_; i_1554_ < 0;
				 i_1554_++) {
				int i_1555_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_1534_++]) & 0xff]);
				int i_1556_ = i_1555_ + i_1530_;
				int i_1557_ = ((i_1555_ & 0xff00ff)
					       + (i_1530_ & 0xff00ff));
				int i_1558_
				    = ((i_1557_ & 0x1000100)
				       + (i_1556_ - i_1557_ & 0x10000));
				is[i_1533_++]
				    = i_1556_ - i_1558_ | i_1558_ - (i_1558_
								     >>> 8);
			    }
			    i_1533_ += i_1537_;
			    i_1534_ += i_1538_;
			}
		    } else if (i_1529_ == 2) {
			int i_1559_ = i_1530_ >>> 24;
			int i_1560_ = 256 - i_1559_;
			int i_1561_
			    = (i_1530_ & 0xff00ff) * i_1560_ & ~0xff00ff;
			int i_1562_ = (i_1530_ & 0xff00) * i_1560_ & 0xff0000;
			i_1530_ = (i_1561_ | i_1562_) >>> 8;
			for (int i_1563_ = -i_1535_; i_1563_ < 0; i_1563_++) {
			    for (int i_1564_ = -i_1536_; i_1564_ < 0;
				 i_1564_++) {
				int i_1565_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_1534_++]) & 0xff]);
				i_1561_ = ((i_1565_ & 0xff00ff) * i_1559_
					   & ~0xff00ff);
				i_1562_
				    = (i_1565_ & 0xff00) * i_1559_ & 0xff0000;
				is[i_1533_++]
				    = ((i_1561_ | i_1562_) >>> 8) + i_1530_;
			    }
			    i_1533_ += i_1537_;
			    i_1534_ += i_1538_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1531_ == 1) {
		    if (i_1529_ == 1) {
			for (int i_1566_ = -i_1535_; i_1566_ < 0; i_1566_++) {
			    for (int i_1567_ = -i_1536_; i_1567_ < 0;
				 i_1567_++) {
				int i_1568_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1534_++]);
				if (i_1568_ != 0) {
				    int i_1569_
					= ((((Class168_Sub2_Sub3) this)
					    .anIntArray11204[i_1568_ & 0xff])
					   | ~0xffffff);
				    int i_1570_ = 255;
				    int i_1571_ = 0;
				    int i_1572_ = is[i_1533_];
				    is[i_1533_++]
					= (((((i_1569_ & 0xff00ff) * i_1570_
					      + (i_1572_ & 0xff00ff) * i_1571_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_1569_ & ~0xff00ff) >>> 8)
						* i_1570_)
					       + (((i_1572_ & ~0xff00ff) >>> 8)
						  * i_1571_))
					      & ~0xff00ff));
				} else
				    i_1533_++;
			    }
			    i_1533_ += i_1537_;
			    i_1534_ += i_1538_;
			}
		    } else if (i_1529_ == 0) {
			if ((i_1530_ & 0xffffff) == 16777215) {
			    int i_1573_ = i_1530_ >>> 24;
			    int i_1574_ = 256 - i_1573_;
			    for (int i_1575_ = -i_1535_; i_1575_ < 0;
				 i_1575_++) {
				for (int i_1576_ = -i_1536_; i_1576_ < 0;
				     i_1576_++) {
				    int i_1577_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205[i_1534_++]);
				    if (i_1577_ != 0) {
					int i_1578_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1577_ & 0xff]);
					int i_1579_ = is[i_1533_];
					is[i_1533_++]
					    = ((((i_1578_ & 0xff00ff) * i_1573_
						 + ((i_1579_ & 0xff00ff)
						    * i_1574_))
						& ~0xff00ff)
					       + (((i_1578_ & 0xff00) * i_1573_
						   + ((i_1579_ & 0xff00)
						      * i_1574_))
						  & 0xff0000)) >> 8;
				    } else
					i_1533_++;
				}
				i_1533_ += i_1537_;
				i_1534_ += i_1538_;
			    }
			} else {
			    int i_1580_ = (i_1530_ & 0xff0000) >> 16;
			    int i_1581_ = (i_1530_ & 0xff00) >> 8;
			    int i_1582_ = i_1530_ & 0xff;
			    int i_1583_ = i_1530_ >>> 24;
			    int i_1584_ = 256 - i_1583_;
			    for (int i_1585_ = -i_1535_; i_1585_ < 0;
				 i_1585_++) {
				for (int i_1586_ = -i_1536_; i_1586_ < 0;
				     i_1586_++) {
				    int i_1587_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205[i_1534_++]);
				    if (i_1587_ != 0) {
					int i_1588_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1587_ & 0xff]);
					if (i_1583_ != 255) {
					    int i_1589_
						= (((i_1588_ & 0xff0000)
						    * i_1580_)
						   & ~0xffffff);
					    int i_1590_
						= ((i_1588_ & 0xff00) * i_1581_
						   & 0xff0000);
					    int i_1591_
						= ((i_1588_ & 0xff) * i_1582_
						   & 0xff00);
					    i_1588_ = (i_1589_ | i_1590_
						       | i_1591_) >>> 8;
					    int i_1592_ = is[i_1533_];
					    is[i_1533_++]
						= (((((i_1588_ & 0xff00ff)
						      * i_1583_)
						     + ((i_1592_ & 0xff00ff)
							* i_1584_))
						    & ~0xff00ff)
						   + ((((i_1588_ & 0xff00)
							* i_1583_)
						       + ((i_1592_ & 0xff00)
							  * i_1584_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1593_
						= (((i_1588_ & 0xff0000)
						    * i_1580_)
						   & ~0xffffff);
					    int i_1594_
						= ((i_1588_ & 0xff00) * i_1581_
						   & 0xff0000);
					    int i_1595_
						= ((i_1588_ & 0xff) * i_1582_
						   & 0xff00);
					    is[i_1533_++] = (i_1593_ | i_1594_
							     | i_1595_) >>> 8;
					}
				    } else
					i_1533_++;
				}
				i_1533_ += i_1537_;
				i_1534_ += i_1538_;
			    }
			}
		    } else if (i_1529_ == 3) {
			int i_1596_ = i_1530_ >>> 24;
			int i_1597_ = 256 - i_1596_;
			for (int i_1598_ = -i_1535_; i_1598_ < 0; i_1598_++) {
			    for (int i_1599_ = -i_1536_; i_1599_ < 0;
				 i_1599_++) {
				byte i_1600_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205[i_1534_++]);
				int i_1601_ = (i_1600_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_1600_])
					       : 0);
				int i_1602_ = i_1601_ + i_1530_;
				int i_1603_ = ((i_1601_ & 0xff00ff)
					       + (i_1530_ & 0xff00ff));
				int i_1604_
				    = ((i_1603_ & 0x1000100)
				       + (i_1602_ - i_1603_ & 0x10000));
				i_1604_
				    = i_1602_ - i_1604_ | i_1604_ - (i_1604_
								     >>> 8);
				if (i_1601_ == 0 && i_1596_ != 255) {
				    i_1601_ = i_1604_;
				    i_1604_ = is[i_1533_];
				    i_1604_
					= ((((i_1601_ & 0xff00ff) * i_1596_
					     + (i_1604_ & 0xff00ff) * i_1597_)
					    & ~0xff00ff)
					   + (((i_1601_ & 0xff00) * i_1596_
					       + (i_1604_ & 0xff00) * i_1597_)
					      & 0xff0000)) >> 8;
				}
				is[i_1533_++] = i_1604_;
			    }
			    i_1533_ += i_1537_;
			    i_1534_ += i_1538_;
			}
		    } else if (i_1529_ == 2) {
			int i_1605_ = i_1530_ >>> 24;
			int i_1606_ = 256 - i_1605_;
			int i_1607_
			    = (i_1530_ & 0xff00ff) * i_1606_ & ~0xff00ff;
			int i_1608_ = (i_1530_ & 0xff00) * i_1606_ & 0xff0000;
			i_1530_ = (i_1607_ | i_1608_) >>> 8;
			for (int i_1609_ = -i_1535_; i_1609_ < 0; i_1609_++) {
			    for (int i_1610_ = -i_1536_; i_1610_ < 0;
				 i_1610_++) {
				int i_1611_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1534_++]);
				if (i_1611_ != 0) {
				    int i_1612_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_1611_ & 0xff]);
				    i_1607_ = ((i_1612_ & 0xff00ff) * i_1605_
					       & ~0xff00ff);
				    i_1608_ = ((i_1612_ & 0xff00) * i_1605_
					       & 0xff0000);
				    is[i_1533_++] = ((i_1607_ | i_1608_)
						     >>> 8) + i_1530_;
				} else
				    i_1533_++;
			    }
			    i_1533_ += i_1537_;
			    i_1534_ += i_1538_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1531_ == 2) {
		    if (i_1529_ == 1) {
			for (int i_1613_ = -i_1535_; i_1613_ < 0; i_1613_++) {
			    for (int i_1614_ = -i_1536_; i_1614_ < 0;
				 i_1614_++) {
				int i_1615_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1534_++]);
				if (i_1615_ != 0) {
				    int i_1616_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_1615_ & 0xff]);
				    int i_1617_ = is[i_1533_];
				    int i_1618_ = i_1616_ + i_1617_;
				    int i_1619_ = ((i_1616_ & 0xff00ff)
						   + (i_1617_ & 0xff00ff));
				    i_1617_
					= ((i_1619_ & 0x1000100)
					   + (i_1618_ - i_1619_ & 0x10000));
				    is[i_1533_++]
					= (i_1618_ - i_1617_
					   | i_1617_ - (i_1617_ >>> 8));
				} else
				    i_1533_++;
			    }
			    i_1533_ += i_1537_;
			    i_1534_ += i_1538_;
			}
		    } else if (i_1529_ == 0) {
			int i_1620_ = (i_1530_ & 0xff0000) >> 16;
			int i_1621_ = (i_1530_ & 0xff00) >> 8;
			int i_1622_ = i_1530_ & 0xff;
			for (int i_1623_ = -i_1535_; i_1623_ < 0; i_1623_++) {
			    for (int i_1624_ = -i_1536_; i_1624_ < 0;
				 i_1624_++) {
				int i_1625_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1534_++]);
				if (i_1625_ != 0) {
				    int i_1626_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_1625_ & 0xff]);
				    int i_1627_
					= ((i_1626_ & 0xff0000) * i_1620_
					   & ~0xffffff);
				    int i_1628_ = ((i_1626_ & 0xff00) * i_1621_
						   & 0xff0000);
				    int i_1629_
					= (i_1626_ & 0xff) * i_1622_ & 0xff00;
				    i_1626_
					= (i_1627_ | i_1628_ | i_1629_) >>> 8;
				    int i_1630_ = is[i_1533_];
				    int i_1631_ = i_1626_ + i_1630_;
				    int i_1632_ = ((i_1626_ & 0xff00ff)
						   + (i_1630_ & 0xff00ff));
				    i_1630_
					= ((i_1632_ & 0x1000100)
					   + (i_1631_ - i_1632_ & 0x10000));
				    is[i_1533_++]
					= (i_1631_ - i_1630_
					   | i_1630_ - (i_1630_ >>> 8));
				} else
				    i_1533_++;
			    }
			    i_1533_ += i_1537_;
			    i_1534_ += i_1538_;
			}
		    } else if (i_1529_ == 3) {
			for (int i_1633_ = -i_1535_; i_1633_ < 0; i_1633_++) {
			    for (int i_1634_ = -i_1536_; i_1634_ < 0;
				 i_1634_++) {
				byte i_1635_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205[i_1534_++]);
				int i_1636_ = (i_1635_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_1635_])
					       : 0);
				int i_1637_ = i_1636_ + i_1530_;
				int i_1638_ = ((i_1636_ & 0xff00ff)
					       + (i_1530_ & 0xff00ff));
				int i_1639_
				    = ((i_1638_ & 0x1000100)
				       + (i_1637_ - i_1638_ & 0x10000));
				i_1636_
				    = i_1637_ - i_1639_ | i_1639_ - (i_1639_
								     >>> 8);
				i_1639_ = is[i_1533_];
				i_1637_ = i_1636_ + i_1639_;
				i_1638_ = (i_1636_ & 0xff00ff) + (i_1639_
								  & 0xff00ff);
				i_1639_ = ((i_1638_ & 0x1000100)
					   + (i_1637_ - i_1638_ & 0x10000));
				is[i_1533_++]
				    = i_1637_ - i_1639_ | i_1639_ - (i_1639_
								     >>> 8);
			    }
			    i_1533_ += i_1537_;
			    i_1534_ += i_1538_;
			}
		    } else if (i_1529_ == 2) {
			int i_1640_ = i_1530_ >>> 24;
			int i_1641_ = 256 - i_1640_;
			int i_1642_
			    = (i_1530_ & 0xff00ff) * i_1641_ & ~0xff00ff;
			int i_1643_ = (i_1530_ & 0xff00) * i_1641_ & 0xff0000;
			i_1530_ = (i_1642_ | i_1643_) >>> 8;
			for (int i_1644_ = -i_1535_; i_1644_ < 0; i_1644_++) {
			    for (int i_1645_ = -i_1536_; i_1645_ < 0;
				 i_1645_++) {
				int i_1646_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1534_++]);
				if (i_1646_ != 0) {
				    int i_1647_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_1646_ & 0xff]);
				    i_1642_ = ((i_1647_ & 0xff00ff) * i_1640_
					       & ~0xff00ff);
				    i_1643_ = ((i_1647_ & 0xff00) * i_1640_
					       & 0xff0000);
				    i_1647_ = (((i_1642_ | i_1643_) >>> 8)
					       + i_1530_);
				    int i_1648_ = is[i_1533_];
				    int i_1649_ = i_1647_ + i_1648_;
				    int i_1650_ = ((i_1647_ & 0xff00ff)
						   + (i_1648_ & 0xff00ff));
				    i_1648_
					= ((i_1650_ & 0x1000100)
					   + (i_1649_ - i_1650_ & 0x10000));
				    is[i_1533_++]
					= (i_1649_ - i_1648_
					   | i_1648_ - (i_1648_ >>> 8));
				} else
				    i_1533_++;
			    }
			    i_1533_ += i_1537_;
			    i_1534_ += i_1538_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method3637(int i, int i_1651_, Class135 class135, int i_1652_,
			   int i_1653_) {
	if (((Class168_Sub2_Sub3) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    i += ((Class168_Sub2_Sub3) this).anInt9907;
	    i_1651_ += ((Class168_Sub2_Sub3) this).anInt9905;
	    int i_1654_ = 0;
	    int i_1655_ = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761);
	    int i_1656_ = ((Class168_Sub2_Sub3) this).anInt9920;
	    int i_1657_ = ((Class168_Sub2_Sub3) this).anInt9916;
	    int i_1658_ = i_1655_ - i_1656_;
	    int i_1659_ = 0;
	    int i_1660_ = i + i_1651_ * i_1655_;
	    if (i_1651_ < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_1661_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_1651_);
		i_1657_ -= i_1661_;
		i_1651_ = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385);
		i_1654_ += i_1661_ * i_1656_;
		i_1660_ += i_1661_ * i_1655_;
	    }
	    if (i_1651_ + i_1657_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_1657_ -= (i_1651_ + i_1657_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_1662_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_1656_ -= i_1662_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_1654_ += i_1662_;
		i_1660_ += i_1662_;
		i_1659_ += i_1662_;
		i_1658_ += i_1662_;
	    }
	    if (i + i_1656_ > (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_1663_ = (i + i_1656_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_1656_ -= i_1663_;
		i_1659_ += i_1663_;
		i_1658_ += i_1663_;
	    }
	    if (i_1656_ > 0 && i_1657_ > 0) {
		Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
		int[] is_1664_
		    = ((Class135_Sub1) class135_sub1).anIntArray9874;
		int[] is_1665_
		    = ((Class135_Sub1) class135_sub1).anIntArray9873;
		int i_1666_ = i_1651_;
		if (i_1653_ > i_1666_) {
		    i_1666_ = i_1653_;
		    i_1660_ += (i_1653_ - i_1651_) * i_1655_;
		    i_1654_ += ((i_1653_ - i_1651_)
				* ((Class168_Sub2_Sub3) this).anInt9920);
		}
		int i_1667_
		    = (i_1653_ + is_1664_.length < i_1651_ + i_1657_
		       ? i_1653_ + is_1664_.length : i_1651_ + i_1657_);
		for (int i_1668_ = i_1666_; i_1668_ < i_1667_; i_1668_++) {
		    int i_1669_ = is_1664_[i_1668_ - i_1653_] + i_1652_;
		    int i_1670_ = is_1665_[i_1668_ - i_1653_];
		    int i_1671_ = i_1656_;
		    if (i > i_1669_) {
			int i_1672_ = i - i_1669_;
			if (i_1672_ >= i_1670_) {
			    i_1654_ += i_1656_ + i_1659_;
			    i_1660_ += i_1656_ + i_1658_;
			    continue;
			}
			i_1670_ -= i_1672_;
		    } else {
			int i_1673_ = i_1669_ - i;
			if (i_1673_ >= i_1656_) {
			    i_1654_ += i_1656_ + i_1659_;
			    i_1660_ += i_1656_ + i_1658_;
			    continue;
			}
			i_1654_ += i_1673_;
			i_1671_ -= i_1673_;
			i_1660_ += i_1673_;
		    }
		    int i_1674_ = 0;
		    if (i_1671_ < i_1670_)
			i_1670_ = i_1671_;
		    else
			i_1674_ = i_1671_ - i_1670_;
		    for (int i_1675_ = -i_1670_; i_1675_ < 0; i_1675_++) {
			int i_1676_ = (((Class168_Sub2_Sub3) this)
				       .aByteArray11205[i_1654_++]);
			if (i_1676_ != 0)
			    is[i_1660_++] = (((Class168_Sub2_Sub3) this)
					     .anIntArray11204[i_1676_ & 0xff]);
			else
			    i_1660_++;
		    }
		    i_1654_ += i_1674_ + i_1659_;
		    i_1660_ += i_1674_ + i_1658_;
		}
	    }
	}
    }
    
    public void method3610(int i, int i_1677_, int i_1678_) {
	throw new IllegalStateException();
    }
    
    Class168_Sub2_Sub3(Class103_Sub2 class103_sub2, byte[] is, int[] is_1679_,
		       int i, int i_1680_) {
	super(class103_sub2, i, i_1680_);
	((Class168_Sub2_Sub3) this).aByteArray11205 = is;
	((Class168_Sub2_Sub3) this).anIntArray11204 = is_1679_;
    }
    
    public void method3653(int i, int i_1681_, int i_1682_) {
	throw new IllegalStateException();
    }
    
    void method3641(int i, int i_1683_, int i_1684_, int i_1685_, int i_1686_,
		    int i_1687_, int i_1688_, int i_1689_) {
	if (((Class168_Sub2_Sub3) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	if (i_1684_ > 0 && i_1685_ > 0) {
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (is != null) {
		int i_1690_ = 0;
		int i_1691_ = 0;
		int i_1692_
		    = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					 .aClass103_Sub2_9904)).anInt9260
		       * -1826993761);
		int i_1693_ = (((Class168_Sub2_Sub3) this).anInt9907
			       + ((Class168_Sub2_Sub3) this).anInt9920
			       + ((Class168_Sub2_Sub3) this).anInt9909);
		int i_1694_ = (((Class168_Sub2_Sub3) this).anInt9905
			       + ((Class168_Sub2_Sub3) this).anInt9916
			       + ((Class168_Sub2_Sub3) this).anInt9910);
		int i_1695_ = (i_1693_ << 16) / i_1684_;
		int i_1696_ = (i_1694_ << 16) / i_1685_;
		if (((Class168_Sub2_Sub3) this).anInt9907 > 0) {
		    int i_1697_
			= (((((Class168_Sub2_Sub3) this).anInt9907 << 16)
			    + i_1695_ - 1)
			   / i_1695_);
		    i += i_1697_;
		    i_1690_
			+= (i_1697_ * i_1695_
			    - (((Class168_Sub2_Sub3) this).anInt9907 << 16));
		}
		if (((Class168_Sub2_Sub3) this).anInt9905 > 0) {
		    int i_1698_
			= (((((Class168_Sub2_Sub3) this).anInt9905 << 16)
			    + i_1696_ - 1)
			   / i_1696_);
		    i_1683_ += i_1698_;
		    i_1691_
			+= (i_1698_ * i_1696_
			    - (((Class168_Sub2_Sub3) this).anInt9905 << 16));
		}
		if (((Class168_Sub2_Sub3) this).anInt9920 < i_1693_)
		    i_1684_ = ((((Class168_Sub2_Sub3) this).anInt9920 << 16)
			       - i_1690_ + i_1695_ - 1) / i_1695_;
		if (((Class168_Sub2_Sub3) this).anInt9916 < i_1694_)
		    i_1685_ = ((((Class168_Sub2_Sub3) this).anInt9916 << 16)
			       - i_1691_ + i_1696_ - 1) / i_1696_;
		int i_1699_ = i + i_1683_ * i_1692_;
		int i_1700_ = i_1692_ - i_1684_;
		if (i_1683_ + i_1685_
		    > (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					 .aClass103_Sub2_9904)).anInt9252
		       * 1546170165))
		    i_1685_
			-= (i_1683_ + i_1685_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
		if (i_1683_ < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9254) * -788450385) {
		    int i_1701_
			= ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					      .aClass103_Sub2_9904)).anInt9254
			    * -788450385)
			   - i_1683_);
		    i_1685_ -= i_1701_;
		    i_1699_ += i_1701_ * i_1692_;
		    i_1691_ += i_1696_ * i_1701_;
		}
		if (i + i_1684_
		    > (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					 .aClass103_Sub2_9904)).anInt9250
		       * 325436811)) {
		    int i_1702_
			= (i + i_1684_
			   - (((Class103_Sub2)
			       ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			      .anInt9250) * 325436811);
		    i_1684_ -= i_1702_;
		    i_1700_ += i_1702_;
		}
		if (i < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					   .aClass103_Sub2_9904)).anInt9249
			 * 1298750001)) {
		    int i_1703_
			= ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					      .aClass103_Sub2_9904)).anInt9249
			    * 1298750001)
			   - i);
		    i_1684_ -= i_1703_;
		    i_1699_ += i_1703_;
		    i_1690_ += i_1695_ * i_1703_;
		    i_1700_ += i_1703_;
		}
		if (i_1688_ == 0) {
		    if (i_1686_ == 1) {
			int i_1704_ = i_1690_;
			for (int i_1705_ = -i_1685_; i_1705_ < 0; i_1705_++) {
			    int i_1706_
				= ((i_1691_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_1707_ = -i_1684_; i_1707_ < 0;
				 i_1707_++) {
				is[i_1699_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205
					 [(i_1690_ >> 16) + i_1706_]) & 0xff]);
				i_1690_ += i_1695_;
			    }
			    i_1691_ += i_1696_;
			    i_1690_ = i_1704_;
			    i_1699_ += i_1700_;
			}
		    } else if (i_1686_ == 0) {
			int i_1708_ = (i_1687_ & 0xff0000) >> 16;
			int i_1709_ = (i_1687_ & 0xff00) >> 8;
			int i_1710_ = i_1687_ & 0xff;
			int i_1711_ = i_1690_;
			for (int i_1712_ = -i_1685_; i_1712_ < 0; i_1712_++) {
			    int i_1713_
				= ((i_1691_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_1714_ = -i_1684_; i_1714_ < 0;
				 i_1714_++) {
				int i_1715_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205
					 [(i_1690_ >> 16) + i_1713_]) & 0xff]);
				int i_1716_ = ((i_1715_ & 0xff0000) * i_1708_
					       & ~0xffffff);
				int i_1717_
				    = (i_1715_ & 0xff00) * i_1709_ & 0xff0000;
				int i_1718_
				    = (i_1715_ & 0xff) * i_1710_ & 0xff00;
				is[i_1699_++]
				    = (i_1716_ | i_1717_ | i_1718_) >>> 8;
				i_1690_ += i_1695_;
			    }
			    i_1691_ += i_1696_;
			    i_1690_ = i_1711_;
			    i_1699_ += i_1700_;
			}
		    } else if (i_1686_ == 3) {
			int i_1719_ = i_1690_;
			for (int i_1720_ = -i_1685_; i_1720_ < 0; i_1720_++) {
			    int i_1721_
				= ((i_1691_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_1722_ = -i_1684_; i_1722_ < 0;
				 i_1722_++) {
				byte i_1723_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205
						[(i_1690_ >> 16) + i_1721_]);
				int i_1724_ = (i_1723_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_1723_])
					       : 0);
				int i_1725_ = i_1724_ + i_1687_;
				int i_1726_ = ((i_1724_ & 0xff00ff)
					       + (i_1687_ & 0xff00ff));
				int i_1727_
				    = ((i_1726_ & 0x1000100)
				       + (i_1725_ - i_1726_ & 0x10000));
				is[i_1699_++]
				    = i_1725_ - i_1727_ | i_1727_ - (i_1727_
								     >>> 8);
				i_1690_ += i_1695_;
			    }
			    i_1691_ += i_1696_;
			    i_1690_ = i_1719_;
			    i_1699_ += i_1700_;
			}
		    } else if (i_1686_ == 2) {
			int i_1728_ = i_1687_ >>> 24;
			int i_1729_ = 256 - i_1728_;
			int i_1730_
			    = (i_1687_ & 0xff00ff) * i_1729_ & ~0xff00ff;
			int i_1731_ = (i_1687_ & 0xff00) * i_1729_ & 0xff0000;
			i_1687_ = (i_1730_ | i_1731_) >>> 8;
			int i_1732_ = i_1690_;
			for (int i_1733_ = -i_1685_; i_1733_ < 0; i_1733_++) {
			    int i_1734_
				= ((i_1691_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_1735_ = -i_1684_; i_1735_ < 0;
				 i_1735_++) {
				int i_1736_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205
					 [(i_1690_ >> 16) + i_1734_]) & 0xff]);
				i_1730_ = ((i_1736_ & 0xff00ff) * i_1728_
					   & ~0xff00ff);
				i_1731_
				    = (i_1736_ & 0xff00) * i_1728_ & 0xff0000;
				is[i_1699_++]
				    = ((i_1730_ | i_1731_) >>> 8) + i_1687_;
				i_1690_ += i_1695_;
			    }
			    i_1691_ += i_1696_;
			    i_1690_ = i_1732_;
			    i_1699_ += i_1700_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1688_ == 1) {
		    if (i_1686_ == 1) {
			int i_1737_ = i_1690_;
			for (int i_1738_ = -i_1685_; i_1738_ < 0; i_1738_++) {
			    int i_1739_
				= ((i_1691_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_1740_ = -i_1684_; i_1740_ < 0;
				 i_1740_++) {
				int i_1741_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_1690_ >> 16) + i_1739_]);
				if (i_1741_ != 0)
				    is[i_1699_++]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_1741_ & 0xff]);
				else
				    i_1699_++;
				i_1690_ += i_1695_;
			    }
			    i_1691_ += i_1696_;
			    i_1690_ = i_1737_;
			    i_1699_ += i_1700_;
			}
		    } else if (i_1686_ == 0) {
			int i_1742_ = i_1690_;
			if ((i_1687_ & 0xffffff) == 16777215) {
			    int i_1743_ = i_1687_ >>> 24;
			    int i_1744_ = 256 - i_1743_;
			    for (int i_1745_ = -i_1685_; i_1745_ < 0;
				 i_1745_++) {
				int i_1746_ = ((i_1691_ >> 16)
					       * (((Class168_Sub2_Sub3) this)
						  .anInt9920));
				for (int i_1747_ = -i_1684_; i_1747_ < 0;
				     i_1747_++) {
				    int i_1748_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_1690_ >> 16) + i_1746_]);
				    if (i_1748_ != 0) {
					int i_1749_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1748_ & 0xff]);
					int i_1750_ = is[i_1699_];
					is[i_1699_++]
					    = ((((i_1749_ & 0xff00ff) * i_1743_
						 + ((i_1750_ & 0xff00ff)
						    * i_1744_))
						& ~0xff00ff)
					       + (((i_1749_ & 0xff00) * i_1743_
						   + ((i_1750_ & 0xff00)
						      * i_1744_))
						  & 0xff0000)) >> 8;
				    } else
					i_1699_++;
				    i_1690_ += i_1695_;
				}
				i_1691_ += i_1696_;
				i_1690_ = i_1742_;
				i_1699_ += i_1700_;
			    }
			} else {
			    int i_1751_ = (i_1687_ & 0xff0000) >> 16;
			    int i_1752_ = (i_1687_ & 0xff00) >> 8;
			    int i_1753_ = i_1687_ & 0xff;
			    int i_1754_ = i_1687_ >>> 24;
			    int i_1755_ = 256 - i_1754_;
			    for (int i_1756_ = -i_1685_; i_1756_ < 0;
				 i_1756_++) {
				int i_1757_ = ((i_1691_ >> 16)
					       * (((Class168_Sub2_Sub3) this)
						  .anInt9920));
				for (int i_1758_ = -i_1684_; i_1758_ < 0;
				     i_1758_++) {
				    int i_1759_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_1690_ >> 16) + i_1757_]);
				    if (i_1759_ != 0) {
					int i_1760_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_1759_ & 0xff]);
					if (i_1754_ != 255) {
					    int i_1761_
						= (((i_1760_ & 0xff0000)
						    * i_1751_)
						   & ~0xffffff);
					    int i_1762_
						= ((i_1760_ & 0xff00) * i_1752_
						   & 0xff0000);
					    int i_1763_
						= ((i_1760_ & 0xff) * i_1753_
						   & 0xff00);
					    i_1760_ = (i_1761_ | i_1762_
						       | i_1763_) >>> 8;
					    int i_1764_ = is[i_1699_];
					    is[i_1699_++]
						= (((((i_1760_ & 0xff00ff)
						      * i_1754_)
						     + ((i_1764_ & 0xff00ff)
							* i_1755_))
						    & ~0xff00ff)
						   + ((((i_1760_ & 0xff00)
							* i_1754_)
						       + ((i_1764_ & 0xff00)
							  * i_1755_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1765_
						= (((i_1760_ & 0xff0000)
						    * i_1751_)
						   & ~0xffffff);
					    int i_1766_
						= ((i_1760_ & 0xff00) * i_1752_
						   & 0xff0000);
					    int i_1767_
						= ((i_1760_ & 0xff) * i_1753_
						   & 0xff00);
					    is[i_1699_++] = (i_1765_ | i_1766_
							     | i_1767_) >>> 8;
					}
				    } else
					i_1699_++;
				    i_1690_ += i_1695_;
				}
				i_1691_ += i_1696_;
				i_1690_ = i_1742_;
				i_1699_ += i_1700_;
			    }
			}
		    } else if (i_1686_ == 3) {
			int i_1768_ = i_1690_;
			int i_1769_ = i_1687_ >>> 24;
			int i_1770_ = 256 - i_1769_;
			for (int i_1771_ = -i_1685_; i_1771_ < 0; i_1771_++) {
			    int i_1772_
				= ((i_1691_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_1773_ = -i_1684_; i_1773_ < 0;
				 i_1773_++) {
				byte i_1774_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205
						[(i_1690_ >> 16) + i_1772_]);
				int i_1775_ = (i_1774_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_1774_])
					       : 0);
				int i_1776_ = i_1775_ + i_1687_;
				int i_1777_ = ((i_1775_ & 0xff00ff)
					       + (i_1687_ & 0xff00ff));
				int i_1778_
				    = ((i_1777_ & 0x1000100)
				       + (i_1776_ - i_1777_ & 0x10000));
				i_1778_
				    = i_1776_ - i_1778_ | i_1778_ - (i_1778_
								     >>> 8);
				if (i_1775_ == 0 && i_1769_ != 255) {
				    i_1775_ = i_1778_;
				    i_1778_ = is[i_1699_];
				    i_1778_
					= ((((i_1775_ & 0xff00ff) * i_1769_
					     + (i_1778_ & 0xff00ff) * i_1770_)
					    & ~0xff00ff)
					   + (((i_1775_ & 0xff00) * i_1769_
					       + (i_1778_ & 0xff00) * i_1770_)
					      & 0xff0000)) >> 8;
				}
				is[i_1699_++] = i_1778_;
				i_1690_ += i_1695_;
			    }
			    i_1691_ += i_1696_;
			    i_1690_ = i_1768_;
			    i_1699_ += i_1700_;
			}
		    } else if (i_1686_ == 2) {
			int i_1779_ = i_1687_ >>> 24;
			int i_1780_ = 256 - i_1779_;
			int i_1781_
			    = (i_1687_ & 0xff00ff) * i_1780_ & ~0xff00ff;
			int i_1782_ = (i_1687_ & 0xff00) * i_1780_ & 0xff0000;
			i_1687_ = (i_1781_ | i_1782_) >>> 8;
			int i_1783_ = i_1690_;
			for (int i_1784_ = -i_1685_; i_1784_ < 0; i_1784_++) {
			    int i_1785_
				= ((i_1691_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_1786_ = -i_1684_; i_1786_ < 0;
				 i_1786_++) {
				int i_1787_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_1690_ >> 16) + i_1785_]);
				if (i_1787_ != 0) {
				    int i_1788_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_1787_ & 0xff]);
				    i_1781_ = ((i_1788_ & 0xff00ff) * i_1779_
					       & ~0xff00ff);
				    i_1782_ = ((i_1788_ & 0xff00) * i_1779_
					       & 0xff0000);
				    is[i_1699_++] = ((i_1781_ | i_1782_)
						     >>> 8) + i_1687_;
				} else
				    i_1699_++;
				i_1690_ += i_1695_;
			    }
			    i_1691_ += i_1696_;
			    i_1690_ = i_1783_;
			    i_1699_ += i_1700_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1688_ == 2) {
		    if (i_1686_ == 1) {
			int i_1789_ = i_1690_;
			for (int i_1790_ = -i_1685_; i_1790_ < 0; i_1790_++) {
			    int i_1791_
				= ((i_1691_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_1792_ = -i_1684_; i_1792_ < 0;
				 i_1792_++) {
				int i_1793_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_1690_ >> 16) + i_1791_]);
				if (i_1793_ != 0) {
				    int i_1794_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_1793_ & 0xff]);
				    int i_1795_ = is[i_1699_];
				    int i_1796_ = i_1794_ + i_1795_;
				    int i_1797_ = ((i_1794_ & 0xff00ff)
						   + (i_1795_ & 0xff00ff));
				    i_1795_
					= ((i_1797_ & 0x1000100)
					   + (i_1796_ - i_1797_ & 0x10000));
				    is[i_1699_++]
					= (i_1796_ - i_1795_
					   | i_1795_ - (i_1795_ >>> 8));
				} else
				    i_1699_++;
				i_1690_ += i_1695_;
			    }
			    i_1691_ += i_1696_;
			    i_1690_ = i_1789_;
			    i_1699_ += i_1700_;
			}
		    } else if (i_1686_ == 0) {
			int i_1798_ = i_1690_;
			int i_1799_ = (i_1687_ & 0xff0000) >> 16;
			int i_1800_ = (i_1687_ & 0xff00) >> 8;
			int i_1801_ = i_1687_ & 0xff;
			for (int i_1802_ = -i_1685_; i_1802_ < 0; i_1802_++) {
			    int i_1803_
				= ((i_1691_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_1804_ = -i_1684_; i_1804_ < 0;
				 i_1804_++) {
				int i_1805_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_1690_ >> 16) + i_1803_]);
				if (i_1805_ != 0) {
				    int i_1806_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_1805_ & 0xff]);
				    int i_1807_
					= ((i_1806_ & 0xff0000) * i_1799_
					   & ~0xffffff);
				    int i_1808_ = ((i_1806_ & 0xff00) * i_1800_
						   & 0xff0000);
				    int i_1809_
					= (i_1806_ & 0xff) * i_1801_ & 0xff00;
				    i_1806_
					= (i_1807_ | i_1808_ | i_1809_) >>> 8;
				    int i_1810_ = is[i_1699_];
				    int i_1811_ = i_1806_ + i_1810_;
				    int i_1812_ = ((i_1806_ & 0xff00ff)
						   + (i_1810_ & 0xff00ff));
				    i_1810_
					= ((i_1812_ & 0x1000100)
					   + (i_1811_ - i_1812_ & 0x10000));
				    is[i_1699_++]
					= (i_1811_ - i_1810_
					   | i_1810_ - (i_1810_ >>> 8));
				} else
				    i_1699_++;
				i_1690_ += i_1695_;
			    }
			    i_1691_ += i_1696_;
			    i_1690_ = i_1798_;
			    i_1699_ += i_1700_;
			}
		    } else if (i_1686_ == 3) {
			int i_1813_ = i_1690_;
			for (int i_1814_ = -i_1685_; i_1814_ < 0; i_1814_++) {
			    int i_1815_
				= ((i_1691_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_1816_ = -i_1684_; i_1816_ < 0;
				 i_1816_++) {
				byte i_1817_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205
						[(i_1690_ >> 16) + i_1815_]);
				int i_1818_ = (i_1817_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_1817_])
					       : 0);
				int i_1819_ = i_1818_ + i_1687_;
				int i_1820_ = ((i_1818_ & 0xff00ff)
					       + (i_1687_ & 0xff00ff));
				int i_1821_
				    = ((i_1820_ & 0x1000100)
				       + (i_1819_ - i_1820_ & 0x10000));
				i_1818_
				    = i_1819_ - i_1821_ | i_1821_ - (i_1821_
								     >>> 8);
				i_1821_ = is[i_1699_];
				i_1819_ = i_1818_ + i_1821_;
				i_1820_ = (i_1818_ & 0xff00ff) + (i_1821_
								  & 0xff00ff);
				i_1821_ = ((i_1820_ & 0x1000100)
					   + (i_1819_ - i_1820_ & 0x10000));
				is[i_1699_++]
				    = i_1819_ - i_1821_ | i_1821_ - (i_1821_
								     >>> 8);
				i_1690_ += i_1695_;
			    }
			    i_1691_ += i_1696_;
			    i_1690_ = i_1813_;
			    i_1699_ += i_1700_;
			}
		    } else if (i_1686_ == 2) {
			int i_1822_ = i_1687_ >>> 24;
			int i_1823_ = 256 - i_1822_;
			int i_1824_
			    = (i_1687_ & 0xff00ff) * i_1823_ & ~0xff00ff;
			int i_1825_ = (i_1687_ & 0xff00) * i_1823_ & 0xff0000;
			i_1687_ = (i_1824_ | i_1825_) >>> 8;
			int i_1826_ = i_1690_;
			for (int i_1827_ = -i_1685_; i_1827_ < 0; i_1827_++) {
			    int i_1828_
				= ((i_1691_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_1829_ = -i_1684_; i_1829_ < 0;
				 i_1829_++) {
				int i_1830_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_1690_ >> 16) + i_1828_]);
				if (i_1830_ != 0) {
				    int i_1831_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_1830_ & 0xff]);
				    i_1824_ = ((i_1831_ & 0xff00ff) * i_1822_
					       & ~0xff00ff);
				    i_1825_ = ((i_1831_ & 0xff00) * i_1822_
					       & 0xff0000);
				    i_1831_ = (((i_1824_ | i_1825_) >>> 8)
					       + i_1687_);
				    int i_1832_ = is[i_1699_];
				    int i_1833_ = i_1831_ + i_1832_;
				    int i_1834_ = ((i_1831_ & 0xff00ff)
						   + (i_1832_ & 0xff00ff));
				    i_1832_
					= ((i_1834_ & 0x1000100)
					   + (i_1833_ - i_1834_ & 0x10000));
				    is[i_1699_++]
					= (i_1833_ - i_1832_
					   | i_1832_ - (i_1832_ >>> 8));
				} else
				    i_1699_++;
				i_1690_ += i_1695_;
			    }
			    i_1691_ += i_1696_;
			    i_1690_ = i_1826_;
			    i_1699_ += i_1700_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method16216(int i, int i_1835_) {
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_1836_ = anInt9919;
		    while (i_1836_ < 0) {
			int i_1837_ = anInt9925;
			int i_1838_ = anInt9927;
			int i_1839_ = anInt9928;
			int i_1840_ = anInt9906;
			if (i_1838_ >= 0 && i_1839_ >= 0
			    && i_1838_ - (((Class168_Sub2_Sub3) this).anInt9920
					  << 12) < 0
			    && i_1839_ - (((Class168_Sub2_Sub3) this).anInt9916
					  << 12) < 0) {
			    for (/**/; i_1840_ < 0; i_1840_++) {
				int i_1841_
				    = ((i_1839_ >> 12) * ((Class168_Sub2_Sub3)
							  this).anInt9920
				       + (i_1838_ >> 12));
				int i_1842_ = i_1837_++;
				if (i_1835_ == 0) {
				    if (i == 1)
					is[i_1842_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_1841_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_1843_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_1841_])
						 & 0xff)]);
					int i_1844_
					    = ((i_1843_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_1845_
					    = ((i_1843_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_1846_
					    = ((i_1843_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_1842_] = (i_1844_ | i_1845_
						       | i_1846_) >>> 8;
				    } else if (i == 3) {
					int i_1847_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_1841_])
						 & 0xff)]);
					int i_1848_ = anInt9931;
					int i_1849_ = i_1847_ + i_1848_;
					int i_1850_ = ((i_1847_ & 0xff00ff)
						       + (i_1848_ & 0xff00ff));
					int i_1851_ = ((i_1850_ & 0x1000100)
						       + (i_1849_ - i_1850_
							  & 0x10000));
					is[i_1842_]
					    = (i_1849_ - i_1851_
					       | i_1851_ - (i_1851_ >>> 8));
				    } else if (i == 2) {
					int i_1852_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_1841_])
						 & 0xff)]);
					int i_1853_
					    = ((i_1852_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_1854_
					    = ((i_1852_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_1842_] = ((i_1853_ | i_1854_)
						       >>> 8) + anInt9939;
				    } else
					throw new IllegalArgumentException();
				} else if (i_1835_ == 1) {
				    if (i == 1) {
					int i_1855_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1841_]);
					if (i_1855_ != 0)
					    is[i_1842_]
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_1855_ & 0xff]);
				    } else if (i == 0) {
					int i_1856_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1841_]);
					if (i_1856_ != 0) {
					    int i_1857_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_1856_ & 0xff]);
					    if ((anInt9931 & 0xffffff)
						== 16777215) {
						int i_1858_ = anInt9931 >>> 24;
						int i_1859_ = 256 - i_1858_;
						int i_1860_ = is[i_1842_];
						is[i_1842_]
						    = (((((i_1857_ & 0xff00ff)
							  * i_1858_)
							 + ((i_1860_
							     & 0xff00ff)
							    * i_1859_))
							& ~0xff00ff)
						       + ((((i_1857_ & 0xff00)
							    * i_1858_)
							   + ((i_1860_
							       & 0xff00)
							      * i_1859_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9932 != 255) {
						int i_1861_
						    = (((i_1857_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_1862_
						    = (((i_1857_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_1863_
						    = (((i_1857_ & 0xff)
							* anInt9936)
						       & 0xff00);
						i_1857_ = (i_1861_ | i_1862_
							   | i_1863_) >>> 8;
						int i_1864_ = is[i_1842_];
						is[i_1842_]
						    = (((((i_1857_ & 0xff00ff)
							  * anInt9932)
							 + ((i_1864_
							     & 0xff00ff)
							    * anInt9937))
							& ~0xff00ff)
						       + ((((i_1857_ & 0xff00)
							    * anInt9932)
							   + ((i_1864_
							       & 0xff00)
							      * anInt9937))
							  & 0xff0000)) >> 8;
					    } else {
						int i_1865_
						    = (((i_1857_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_1866_
						    = (((i_1857_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_1867_
						    = (((i_1857_ & 0xff)
							* anInt9936)
						       & 0xff00);
						is[i_1842_]
						    = (i_1865_ | i_1866_
						       | i_1867_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_1868_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1841_]);
					int i_1869_
					    = (i_1868_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_1868_])
					       : 0);
					int i_1870_ = anInt9931;
					int i_1871_ = i_1869_ + i_1870_;
					int i_1872_ = ((i_1869_ & 0xff00ff)
						       + (i_1870_ & 0xff00ff));
					int i_1873_ = ((i_1872_ & 0x1000100)
						       + (i_1871_ - i_1872_
							  & 0x10000));
					i_1873_
					    = (i_1871_ - i_1873_
					       | i_1873_ - (i_1873_ >>> 8));
					if (i_1869_ == 0 && anInt9932 != 255) {
					    i_1869_ = i_1873_;
					    i_1873_ = is[i_1842_];
					    i_1873_
						= (((((i_1869_ & 0xff00ff)
						      * anInt9932)
						     + ((i_1873_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_1869_ & 0xff00)
							* anInt9932)
						       + ((i_1873_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_1842_] = i_1873_;
				    } else if (i == 2) {
					int i_1874_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1841_]);
					if (i_1874_ != 0) {
					    int i_1875_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_1874_ & 0xff]);
					    int i_1876_
						= (((i_1875_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_1877_ = (((i_1875_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    is[i_1842_++]
						= (((i_1876_ | i_1877_) >>> 8)
						   + anInt9939);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_1835_ == 2) {
				    if (i == 1) {
					int i_1878_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1841_]);
					if (i_1878_ != 0) {
					    int i_1879_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_1878_ & 0xff]);
					    int i_1880_ = is[i_1842_];
					    int i_1881_ = i_1879_ + i_1880_;
					    int i_1882_
						= ((i_1879_ & 0xff00ff)
						   + (i_1880_ & 0xff00ff));
					    i_1880_ = ((i_1882_ & 0x1000100)
						       + (i_1881_ - i_1882_
							  & 0x10000));
					    is[i_1842_]
						= (i_1881_ - i_1880_
						   | i_1880_ - (i_1880_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_1883_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1841_]);
					if (i_1883_ != 0) {
					    int i_1884_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_1883_ & 0xff]);
					    int i_1885_
						= (((i_1884_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_1886_ = (((i_1884_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_1887_
						= ((i_1884_ & 0xff) * anInt9936
						   & 0xff00);
					    i_1884_ = (i_1885_ | i_1886_
						       | i_1887_) >>> 8;
					    int i_1888_ = is[i_1842_];
					    int i_1889_ = i_1884_ + i_1888_;
					    int i_1890_
						= ((i_1884_ & 0xff00ff)
						   + (i_1888_ & 0xff00ff));
					    i_1888_ = ((i_1890_ & 0x1000100)
						       + (i_1889_ - i_1890_
							  & 0x10000));
					    is[i_1842_]
						= (i_1889_ - i_1888_
						   | i_1888_ - (i_1888_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_1891_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1841_]);
					int i_1892_
					    = (i_1891_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_1891_])
					       : 0);
					int i_1893_ = anInt9931;
					int i_1894_ = i_1892_ + i_1893_;
					int i_1895_ = ((i_1892_ & 0xff00ff)
						       + (i_1893_ & 0xff00ff));
					int i_1896_ = ((i_1895_ & 0x1000100)
						       + (i_1894_ - i_1895_
							  & 0x10000));
					i_1896_
					    = (i_1894_ - i_1896_
					       | i_1896_ - (i_1896_ >>> 8));
					if (i_1892_ == 0 && anInt9932 != 255) {
					    i_1892_ = i_1896_;
					    i_1896_ = is[i_1842_];
					    i_1896_
						= (((((i_1892_ & 0xff00ff)
						      * anInt9932)
						     + ((i_1896_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_1892_ & 0xff00)
							* anInt9932)
						       + ((i_1896_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_1842_] = i_1896_;
				    } else if (i == 2) {
					int i_1897_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1841_]);
					if (i_1897_ != 0) {
					    int i_1898_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_1897_ & 0xff]);
					    int i_1899_
						= (((i_1898_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_1900_ = (((i_1898_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    i_1898_ = ((i_1899_ | i_1900_)
						       >>> 8) + anInt9939;
					    int i_1901_ = is[i_1842_];
					    int i_1902_ = i_1898_ + i_1901_;
					    int i_1903_
						= ((i_1898_ & 0xff00ff)
						   + (i_1901_ & 0xff00ff));
					    i_1901_ = ((i_1903_ & 0x1000100)
						       + (i_1902_ - i_1903_
							  & 0x10000));
					    is[i_1842_]
						= (i_1902_ - i_1901_
						   | i_1901_ - (i_1901_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
			    }
			}
			i_1836_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_1904_ = anInt9919;
		    while (i_1904_ < 0) {
			int i_1905_ = anInt9925;
			int i_1906_ = anInt9927;
			int i_1907_ = anInt9928 + anInt9930;
			int i_1908_ = anInt9906;
			if (i_1906_ >= 0
			    && i_1906_ - (((Class168_Sub2_Sub3) this).anInt9920
					  << 12) < 0) {
			    int i_1909_;
			    if ((i_1909_
				 = (i_1907_
				    - (((Class168_Sub2_Sub3) this).anInt9916
				       << 12)))
				>= 0) {
				i_1909_ = (anInt9922 - i_1909_) / anInt9922;
				i_1908_ += i_1909_;
				i_1907_ += anInt9922 * i_1909_;
				i_1905_ += i_1909_;
			    }
			    if ((i_1909_ = (i_1907_ - anInt9922) / anInt9922)
				> i_1908_)
				i_1908_ = i_1909_;
			    for (/**/; i_1908_ < 0; i_1908_++) {
				int i_1910_
				    = ((i_1907_ >> 12) * ((Class168_Sub2_Sub3)
							  this).anInt9920
				       + (i_1906_ >> 12));
				int i_1911_ = i_1905_++;
				if (i_1835_ == 0) {
				    if (i == 1)
					is[i_1911_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_1910_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_1912_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_1910_])
						 & 0xff)]);
					int i_1913_
					    = ((i_1912_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_1914_
					    = ((i_1912_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_1915_
					    = ((i_1912_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_1911_] = (i_1913_ | i_1914_
						       | i_1915_) >>> 8;
				    } else if (i == 3) {
					int i_1916_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_1910_])
						 & 0xff)]);
					int i_1917_ = anInt9931;
					int i_1918_ = i_1916_ + i_1917_;
					int i_1919_ = ((i_1916_ & 0xff00ff)
						       + (i_1917_ & 0xff00ff));
					int i_1920_ = ((i_1919_ & 0x1000100)
						       + (i_1918_ - i_1919_
							  & 0x10000));
					is[i_1911_]
					    = (i_1918_ - i_1920_
					       | i_1920_ - (i_1920_ >>> 8));
				    } else if (i == 2) {
					int i_1921_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_1910_])
						 & 0xff)]);
					int i_1922_
					    = ((i_1921_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_1923_
					    = ((i_1921_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_1911_] = ((i_1922_ | i_1923_)
						       >>> 8) + anInt9939;
				    } else
					throw new IllegalArgumentException();
				} else if (i_1835_ == 1) {
				    if (i == 1) {
					int i_1924_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1910_]);
					if (i_1924_ != 0)
					    is[i_1911_]
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_1924_ & 0xff]);
				    } else if (i == 0) {
					int i_1925_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1910_]);
					if (i_1925_ != 0) {
					    int i_1926_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_1925_ & 0xff]);
					    if ((anInt9931 & 0xffffff)
						== 16777215) {
						int i_1927_ = anInt9931 >>> 24;
						int i_1928_ = 256 - i_1927_;
						int i_1929_ = is[i_1911_];
						is[i_1911_]
						    = (((((i_1926_ & 0xff00ff)
							  * i_1927_)
							 + ((i_1929_
							     & 0xff00ff)
							    * i_1928_))
							& ~0xff00ff)
						       + ((((i_1926_ & 0xff00)
							    * i_1927_)
							   + ((i_1929_
							       & 0xff00)
							      * i_1928_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9932 != 255) {
						int i_1930_
						    = (((i_1926_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_1931_
						    = (((i_1926_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_1932_
						    = (((i_1926_ & 0xff)
							* anInt9936)
						       & 0xff00);
						i_1926_ = (i_1930_ | i_1931_
							   | i_1932_) >>> 8;
						int i_1933_ = is[i_1911_];
						is[i_1911_]
						    = (((((i_1926_ & 0xff00ff)
							  * anInt9932)
							 + ((i_1933_
							     & 0xff00ff)
							    * anInt9937))
							& ~0xff00ff)
						       + ((((i_1926_ & 0xff00)
							    * anInt9932)
							   + ((i_1933_
							       & 0xff00)
							      * anInt9937))
							  & 0xff0000)) >> 8;
					    } else {
						int i_1934_
						    = (((i_1926_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_1935_
						    = (((i_1926_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_1936_
						    = (((i_1926_ & 0xff)
							* anInt9936)
						       & 0xff00);
						is[i_1911_]
						    = (i_1934_ | i_1935_
						       | i_1936_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_1937_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1910_]);
					int i_1938_
					    = (i_1937_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_1937_])
					       : 0);
					int i_1939_ = anInt9931;
					int i_1940_ = i_1938_ + i_1939_;
					int i_1941_ = ((i_1938_ & 0xff00ff)
						       + (i_1939_ & 0xff00ff));
					int i_1942_ = ((i_1941_ & 0x1000100)
						       + (i_1940_ - i_1941_
							  & 0x10000));
					i_1942_
					    = (i_1940_ - i_1942_
					       | i_1942_ - (i_1942_ >>> 8));
					if (i_1938_ == 0 && anInt9932 != 255) {
					    i_1938_ = i_1942_;
					    i_1942_ = is[i_1911_];
					    i_1942_
						= (((((i_1938_ & 0xff00ff)
						      * anInt9932)
						     + ((i_1942_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_1938_ & 0xff00)
							* anInt9932)
						       + ((i_1942_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_1911_] = i_1942_;
				    } else if (i == 2) {
					int i_1943_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1910_]);
					if (i_1943_ != 0) {
					    int i_1944_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_1943_ & 0xff]);
					    int i_1945_
						= (((i_1944_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_1946_ = (((i_1944_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    is[i_1911_++]
						= (((i_1945_ | i_1946_) >>> 8)
						   + anInt9939);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_1835_ == 2) {
				    if (i == 1) {
					int i_1947_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1910_]);
					if (i_1947_ != 0) {
					    int i_1948_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_1947_ & 0xff]);
					    int i_1949_ = is[i_1911_];
					    int i_1950_ = i_1948_ + i_1949_;
					    int i_1951_
						= ((i_1948_ & 0xff00ff)
						   + (i_1949_ & 0xff00ff));
					    i_1949_ = ((i_1951_ & 0x1000100)
						       + (i_1950_ - i_1951_
							  & 0x10000));
					    is[i_1911_]
						= (i_1950_ - i_1949_
						   | i_1949_ - (i_1949_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_1952_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1910_]);
					if (i_1952_ != 0) {
					    int i_1953_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_1952_ & 0xff]);
					    int i_1954_
						= (((i_1953_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_1955_ = (((i_1953_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_1956_
						= ((i_1953_ & 0xff) * anInt9936
						   & 0xff00);
					    i_1953_ = (i_1954_ | i_1955_
						       | i_1956_) >>> 8;
					    int i_1957_ = is[i_1911_];
					    int i_1958_ = i_1953_ + i_1957_;
					    int i_1959_
						= ((i_1953_ & 0xff00ff)
						   + (i_1957_ & 0xff00ff));
					    i_1957_ = ((i_1959_ & 0x1000100)
						       + (i_1958_ - i_1959_
							  & 0x10000));
					    is[i_1911_]
						= (i_1958_ - i_1957_
						   | i_1957_ - (i_1957_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_1960_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1910_]);
					int i_1961_
					    = (i_1960_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_1960_])
					       : 0);
					int i_1962_ = anInt9931;
					int i_1963_ = i_1961_ + i_1962_;
					int i_1964_ = ((i_1961_ & 0xff00ff)
						       + (i_1962_ & 0xff00ff));
					int i_1965_ = ((i_1964_ & 0x1000100)
						       + (i_1963_ - i_1964_
							  & 0x10000));
					i_1965_
					    = (i_1963_ - i_1965_
					       | i_1965_ - (i_1965_ >>> 8));
					if (i_1961_ == 0 && anInt9932 != 255) {
					    i_1961_ = i_1965_;
					    i_1965_ = is[i_1911_];
					    i_1965_
						= (((((i_1961_ & 0xff00ff)
						      * anInt9932)
						     + ((i_1965_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_1961_ & 0xff00)
							* anInt9932)
						       + ((i_1965_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_1911_] = i_1965_;
				    } else if (i == 2) {
					int i_1966_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1910_]);
					if (i_1966_ != 0) {
					    int i_1967_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_1966_ & 0xff]);
					    int i_1968_
						= (((i_1967_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_1969_ = (((i_1967_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    i_1967_ = ((i_1968_ | i_1969_)
						       >>> 8) + anInt9939;
					    int i_1970_ = is[i_1911_];
					    int i_1971_ = i_1967_ + i_1970_;
					    int i_1972_
						= ((i_1967_ & 0xff00ff)
						   + (i_1970_ & 0xff00ff));
					    i_1970_ = ((i_1972_ & 0x1000100)
						       + (i_1971_ - i_1972_
							  & 0x10000));
					    is[i_1911_]
						= (i_1971_ - i_1970_
						   | i_1970_ - (i_1970_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_1907_ += anInt9922;
			    }
			}
			i_1904_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_1973_ = anInt9919;
		    while (i_1973_ < 0) {
			int i_1974_ = anInt9925;
			int i_1975_ = anInt9927;
			int i_1976_ = anInt9928 + anInt9930;
			int i_1977_ = anInt9906;
			if (i_1975_ >= 0
			    && i_1975_ - (((Class168_Sub2_Sub3) this).anInt9920
					  << 12) < 0) {
			    if (i_1976_ < 0) {
				int i_1978_
				    = (anInt9922 - 1 - i_1976_) / anInt9922;
				i_1977_ += i_1978_;
				i_1976_ += anInt9922 * i_1978_;
				i_1974_ += i_1978_;
			    }
			    int i_1979_;
			    if ((i_1979_
				 = (1 + i_1976_
				    - (((Class168_Sub2_Sub3) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_1977_)
				i_1977_ = i_1979_;
			    for (/**/; i_1977_ < 0; i_1977_++) {
				int i_1980_
				    = ((i_1976_ >> 12) * ((Class168_Sub2_Sub3)
							  this).anInt9920
				       + (i_1975_ >> 12));
				int i_1981_ = i_1974_++;
				if (i_1835_ == 0) {
				    if (i == 1)
					is[i_1981_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_1980_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_1982_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_1980_])
						 & 0xff)]);
					int i_1983_
					    = ((i_1982_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_1984_
					    = ((i_1982_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_1985_
					    = ((i_1982_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_1981_] = (i_1983_ | i_1984_
						       | i_1985_) >>> 8;
				    } else if (i == 3) {
					int i_1986_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_1980_])
						 & 0xff)]);
					int i_1987_ = anInt9931;
					int i_1988_ = i_1986_ + i_1987_;
					int i_1989_ = ((i_1986_ & 0xff00ff)
						       + (i_1987_ & 0xff00ff));
					int i_1990_ = ((i_1989_ & 0x1000100)
						       + (i_1988_ - i_1989_
							  & 0x10000));
					is[i_1981_]
					    = (i_1988_ - i_1990_
					       | i_1990_ - (i_1990_ >>> 8));
				    } else if (i == 2) {
					int i_1991_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_1980_])
						 & 0xff)]);
					int i_1992_
					    = ((i_1991_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_1993_
					    = ((i_1991_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_1981_] = ((i_1992_ | i_1993_)
						       >>> 8) + anInt9939;
				    } else
					throw new IllegalArgumentException();
				} else if (i_1835_ == 1) {
				    if (i == 1) {
					int i_1994_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1980_]);
					if (i_1994_ != 0)
					    is[i_1981_]
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_1994_ & 0xff]);
				    } else if (i == 0) {
					int i_1995_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1980_]);
					if (i_1995_ != 0) {
					    int i_1996_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_1995_ & 0xff]);
					    if ((anInt9931 & 0xffffff)
						== 16777215) {
						int i_1997_ = anInt9931 >>> 24;
						int i_1998_ = 256 - i_1997_;
						int i_1999_ = is[i_1981_];
						is[i_1981_]
						    = (((((i_1996_ & 0xff00ff)
							  * i_1997_)
							 + ((i_1999_
							     & 0xff00ff)
							    * i_1998_))
							& ~0xff00ff)
						       + ((((i_1996_ & 0xff00)
							    * i_1997_)
							   + ((i_1999_
							       & 0xff00)
							      * i_1998_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9932 != 255) {
						int i_2000_
						    = (((i_1996_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_2001_
						    = (((i_1996_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_2002_
						    = (((i_1996_ & 0xff)
							* anInt9936)
						       & 0xff00);
						i_1996_ = (i_2000_ | i_2001_
							   | i_2002_) >>> 8;
						int i_2003_ = is[i_1981_];
						is[i_1981_]
						    = (((((i_1996_ & 0xff00ff)
							  * anInt9932)
							 + ((i_2003_
							     & 0xff00ff)
							    * anInt9937))
							& ~0xff00ff)
						       + ((((i_1996_ & 0xff00)
							    * anInt9932)
							   + ((i_2003_
							       & 0xff00)
							      * anInt9937))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2004_
						    = (((i_1996_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_2005_
						    = (((i_1996_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_2006_
						    = (((i_1996_ & 0xff)
							* anInt9936)
						       & 0xff00);
						is[i_1981_]
						    = (i_2004_ | i_2005_
						       | i_2006_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2007_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1980_]);
					int i_2008_
					    = (i_2007_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_2007_])
					       : 0);
					int i_2009_ = anInt9931;
					int i_2010_ = i_2008_ + i_2009_;
					int i_2011_ = ((i_2008_ & 0xff00ff)
						       + (i_2009_ & 0xff00ff));
					int i_2012_ = ((i_2011_ & 0x1000100)
						       + (i_2010_ - i_2011_
							  & 0x10000));
					i_2012_
					    = (i_2010_ - i_2012_
					       | i_2012_ - (i_2012_ >>> 8));
					if (i_2008_ == 0 && anInt9932 != 255) {
					    i_2008_ = i_2012_;
					    i_2012_ = is[i_1981_];
					    i_2012_
						= (((((i_2008_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2012_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2008_ & 0xff00)
							* anInt9932)
						       + ((i_2012_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_1981_] = i_2012_;
				    } else if (i == 2) {
					int i_2013_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1980_]);
					if (i_2013_ != 0) {
					    int i_2014_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2013_ & 0xff]);
					    int i_2015_
						= (((i_2014_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_2016_ = (((i_2014_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    is[i_1981_++]
						= (((i_2015_ | i_2016_) >>> 8)
						   + anInt9939);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_1835_ == 2) {
				    if (i == 1) {
					int i_2017_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1980_]);
					if (i_2017_ != 0) {
					    int i_2018_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2017_ & 0xff]);
					    int i_2019_ = is[i_1981_];
					    int i_2020_ = i_2018_ + i_2019_;
					    int i_2021_
						= ((i_2018_ & 0xff00ff)
						   + (i_2019_ & 0xff00ff));
					    i_2019_ = ((i_2021_ & 0x1000100)
						       + (i_2020_ - i_2021_
							  & 0x10000));
					    is[i_1981_]
						= (i_2020_ - i_2019_
						   | i_2019_ - (i_2019_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2022_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1980_]);
					if (i_2022_ != 0) {
					    int i_2023_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2022_ & 0xff]);
					    int i_2024_
						= (((i_2023_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_2025_ = (((i_2023_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_2026_
						= ((i_2023_ & 0xff) * anInt9936
						   & 0xff00);
					    i_2023_ = (i_2024_ | i_2025_
						       | i_2026_) >>> 8;
					    int i_2027_ = is[i_1981_];
					    int i_2028_ = i_2023_ + i_2027_;
					    int i_2029_
						= ((i_2023_ & 0xff00ff)
						   + (i_2027_ & 0xff00ff));
					    i_2027_ = ((i_2029_ & 0x1000100)
						       + (i_2028_ - i_2029_
							  & 0x10000));
					    is[i_1981_]
						= (i_2028_ - i_2027_
						   | i_2027_ - (i_2027_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2030_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1980_]);
					int i_2031_
					    = (i_2030_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_2030_])
					       : 0);
					int i_2032_ = anInt9931;
					int i_2033_ = i_2031_ + i_2032_;
					int i_2034_ = ((i_2031_ & 0xff00ff)
						       + (i_2032_ & 0xff00ff));
					int i_2035_ = ((i_2034_ & 0x1000100)
						       + (i_2033_ - i_2034_
							  & 0x10000));
					i_2035_
					    = (i_2033_ - i_2035_
					       | i_2035_ - (i_2035_ >>> 8));
					if (i_2031_ == 0 && anInt9932 != 255) {
					    i_2031_ = i_2035_;
					    i_2035_ = is[i_1981_];
					    i_2035_
						= (((((i_2031_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2035_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2031_ & 0xff00)
							* anInt9932)
						       + ((i_2035_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_1981_] = i_2035_;
				    } else if (i == 2) {
					int i_2036_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_1980_]);
					if (i_2036_ != 0) {
					    int i_2037_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2036_ & 0xff]);
					    int i_2038_
						= (((i_2037_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_2039_ = (((i_2037_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    i_2037_ = ((i_2038_ | i_2039_)
						       >>> 8) + anInt9939;
					    int i_2040_ = is[i_1981_];
					    int i_2041_ = i_2037_ + i_2040_;
					    int i_2042_
						= ((i_2037_ & 0xff00ff)
						   + (i_2040_ & 0xff00ff));
					    i_2040_ = ((i_2042_ & 0x1000100)
						       + (i_2041_ - i_2042_
							  & 0x10000));
					    is[i_1981_]
						= (i_2041_ - i_2040_
						   | i_2040_ - (i_2040_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_1976_ += anInt9922;
			    }
			}
			i_1973_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_2043_ = anInt9919;
		    while (i_2043_ < 0) {
			int i_2044_ = anInt9925;
			int i_2045_ = anInt9927 + anInt9929;
			int i_2046_ = anInt9928;
			int i_2047_ = anInt9906;
			if (i_2046_ >= 0
			    && i_2046_ - (((Class168_Sub2_Sub3) this).anInt9916
					  << 12) < 0) {
			    int i_2048_;
			    if ((i_2048_
				 = (i_2045_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)))
				>= 0) {
				i_2048_ = (anInt9921 - i_2048_) / anInt9921;
				i_2047_ += i_2048_;
				i_2045_ += anInt9921 * i_2048_;
				i_2044_ += i_2048_;
			    }
			    if ((i_2048_ = (i_2045_ - anInt9921) / anInt9921)
				> i_2047_)
				i_2047_ = i_2048_;
			    for (/**/; i_2047_ < 0; i_2047_++) {
				int i_2049_
				    = ((i_2046_ >> 12) * ((Class168_Sub2_Sub3)
							  this).anInt9920
				       + (i_2045_ >> 12));
				int i_2050_ = i_2044_++;
				if (i_1835_ == 0) {
				    if (i == 1)
					is[i_2050_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_2049_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_2051_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_2049_])
						 & 0xff)]);
					int i_2052_
					    = ((i_2051_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_2053_
					    = ((i_2051_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_2054_
					    = ((i_2051_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_2050_] = (i_2052_ | i_2053_
						       | i_2054_) >>> 8;
				    } else if (i == 3) {
					int i_2055_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_2049_])
						 & 0xff)]);
					int i_2056_ = anInt9931;
					int i_2057_ = i_2055_ + i_2056_;
					int i_2058_ = ((i_2055_ & 0xff00ff)
						       + (i_2056_ & 0xff00ff));
					int i_2059_ = ((i_2058_ & 0x1000100)
						       + (i_2057_ - i_2058_
							  & 0x10000));
					is[i_2050_]
					    = (i_2057_ - i_2059_
					       | i_2059_ - (i_2059_ >>> 8));
				    } else if (i == 2) {
					int i_2060_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_2049_])
						 & 0xff)]);
					int i_2061_
					    = ((i_2060_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_2062_
					    = ((i_2060_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_2050_] = ((i_2061_ | i_2062_)
						       >>> 8) + anInt9939;
				    } else
					throw new IllegalArgumentException();
				} else if (i_1835_ == 1) {
				    if (i == 1) {
					int i_2063_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2049_]);
					if (i_2063_ != 0)
					    is[i_2050_]
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2063_ & 0xff]);
				    } else if (i == 0) {
					int i_2064_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2049_]);
					if (i_2064_ != 0) {
					    int i_2065_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2064_ & 0xff]);
					    if ((anInt9931 & 0xffffff)
						== 16777215) {
						int i_2066_ = anInt9931 >>> 24;
						int i_2067_ = 256 - i_2066_;
						int i_2068_ = is[i_2050_];
						is[i_2050_]
						    = (((((i_2065_ & 0xff00ff)
							  * i_2066_)
							 + ((i_2068_
							     & 0xff00ff)
							    * i_2067_))
							& ~0xff00ff)
						       + ((((i_2065_ & 0xff00)
							    * i_2066_)
							   + ((i_2068_
							       & 0xff00)
							      * i_2067_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9932 != 255) {
						int i_2069_
						    = (((i_2065_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_2070_
						    = (((i_2065_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_2071_
						    = (((i_2065_ & 0xff)
							* anInt9936)
						       & 0xff00);
						i_2065_ = (i_2069_ | i_2070_
							   | i_2071_) >>> 8;
						int i_2072_ = is[i_2050_];
						is[i_2050_]
						    = (((((i_2065_ & 0xff00ff)
							  * anInt9932)
							 + ((i_2072_
							     & 0xff00ff)
							    * anInt9937))
							& ~0xff00ff)
						       + ((((i_2065_ & 0xff00)
							    * anInt9932)
							   + ((i_2072_
							       & 0xff00)
							      * anInt9937))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2073_
						    = (((i_2065_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_2074_
						    = (((i_2065_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_2075_
						    = (((i_2065_ & 0xff)
							* anInt9936)
						       & 0xff00);
						is[i_2050_]
						    = (i_2073_ | i_2074_
						       | i_2075_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2076_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2049_]);
					int i_2077_
					    = (i_2076_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_2076_])
					       : 0);
					int i_2078_ = anInt9931;
					int i_2079_ = i_2077_ + i_2078_;
					int i_2080_ = ((i_2077_ & 0xff00ff)
						       + (i_2078_ & 0xff00ff));
					int i_2081_ = ((i_2080_ & 0x1000100)
						       + (i_2079_ - i_2080_
							  & 0x10000));
					i_2081_
					    = (i_2079_ - i_2081_
					       | i_2081_ - (i_2081_ >>> 8));
					if (i_2077_ == 0 && anInt9932 != 255) {
					    i_2077_ = i_2081_;
					    i_2081_ = is[i_2050_];
					    i_2081_
						= (((((i_2077_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2081_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2077_ & 0xff00)
							* anInt9932)
						       + ((i_2081_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_2050_] = i_2081_;
				    } else if (i == 2) {
					int i_2082_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2049_]);
					if (i_2082_ != 0) {
					    int i_2083_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2082_ & 0xff]);
					    int i_2084_
						= (((i_2083_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_2085_ = (((i_2083_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    is[i_2050_++]
						= (((i_2084_ | i_2085_) >>> 8)
						   + anInt9939);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_1835_ == 2) {
				    if (i == 1) {
					int i_2086_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2049_]);
					if (i_2086_ != 0) {
					    int i_2087_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2086_ & 0xff]);
					    int i_2088_ = is[i_2050_];
					    int i_2089_ = i_2087_ + i_2088_;
					    int i_2090_
						= ((i_2087_ & 0xff00ff)
						   + (i_2088_ & 0xff00ff));
					    i_2088_ = ((i_2090_ & 0x1000100)
						       + (i_2089_ - i_2090_
							  & 0x10000));
					    is[i_2050_]
						= (i_2089_ - i_2088_
						   | i_2088_ - (i_2088_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2091_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2049_]);
					if (i_2091_ != 0) {
					    int i_2092_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2091_ & 0xff]);
					    int i_2093_
						= (((i_2092_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_2094_ = (((i_2092_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_2095_
						= ((i_2092_ & 0xff) * anInt9936
						   & 0xff00);
					    i_2092_ = (i_2093_ | i_2094_
						       | i_2095_) >>> 8;
					    int i_2096_ = is[i_2050_];
					    int i_2097_ = i_2092_ + i_2096_;
					    int i_2098_
						= ((i_2092_ & 0xff00ff)
						   + (i_2096_ & 0xff00ff));
					    i_2096_ = ((i_2098_ & 0x1000100)
						       + (i_2097_ - i_2098_
							  & 0x10000));
					    is[i_2050_]
						= (i_2097_ - i_2096_
						   | i_2096_ - (i_2096_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2099_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2049_]);
					int i_2100_
					    = (i_2099_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_2099_])
					       : 0);
					int i_2101_ = anInt9931;
					int i_2102_ = i_2100_ + i_2101_;
					int i_2103_ = ((i_2100_ & 0xff00ff)
						       + (i_2101_ & 0xff00ff));
					int i_2104_ = ((i_2103_ & 0x1000100)
						       + (i_2102_ - i_2103_
							  & 0x10000));
					i_2104_
					    = (i_2102_ - i_2104_
					       | i_2104_ - (i_2104_ >>> 8));
					if (i_2100_ == 0 && anInt9932 != 255) {
					    i_2100_ = i_2104_;
					    i_2104_ = is[i_2050_];
					    i_2104_
						= (((((i_2100_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2104_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2100_ & 0xff00)
							* anInt9932)
						       + ((i_2104_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_2050_] = i_2104_;
				    } else if (i == 2) {
					int i_2105_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2049_]);
					if (i_2105_ != 0) {
					    int i_2106_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2105_ & 0xff]);
					    int i_2107_
						= (((i_2106_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_2108_ = (((i_2106_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    i_2106_ = ((i_2107_ | i_2108_)
						       >>> 8) + anInt9939;
					    int i_2109_ = is[i_2050_];
					    int i_2110_ = i_2106_ + i_2109_;
					    int i_2111_
						= ((i_2106_ & 0xff00ff)
						   + (i_2109_ & 0xff00ff));
					    i_2109_ = ((i_2111_ & 0x1000100)
						       + (i_2110_ - i_2111_
							  & 0x10000));
					    is[i_2050_]
						= (i_2110_ - i_2109_
						   | i_2109_ - (i_2109_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_2045_ += anInt9921;
			    }
			}
			i_2043_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_2112_ = anInt9919;
		    while (i_2112_ < 0) {
			int i_2113_ = anInt9925;
			int i_2114_ = anInt9927 + anInt9929;
			int i_2115_ = anInt9928 + anInt9930;
			int i_2116_ = anInt9906;
			int i_2117_;
			if ((i_2117_
			     = i_2114_ - (((Class168_Sub2_Sub3) this).anInt9920
					  << 12))
			    >= 0) {
			    i_2117_ = (anInt9921 - i_2117_) / anInt9921;
			    i_2116_ += i_2117_;
			    i_2114_ += anInt9921 * i_2117_;
			    i_2115_ += anInt9922 * i_2117_;
			    i_2113_ += i_2117_;
			}
			if ((i_2117_ = (i_2114_ - anInt9921) / anInt9921)
			    > i_2116_)
			    i_2116_ = i_2117_;
			if ((i_2117_
			     = i_2115_ - (((Class168_Sub2_Sub3) this).anInt9916
					  << 12))
			    >= 0) {
			    i_2117_ = (anInt9922 - i_2117_) / anInt9922;
			    i_2116_ += i_2117_;
			    i_2114_ += anInt9921 * i_2117_;
			    i_2115_ += anInt9922 * i_2117_;
			    i_2113_ += i_2117_;
			}
			if ((i_2117_ = (i_2115_ - anInt9922) / anInt9922)
			    > i_2116_)
			    i_2116_ = i_2117_;
			for (/**/; i_2116_ < 0; i_2116_++) {
			    int i_2118_
				= (((i_2115_ >> 12)
				    * ((Class168_Sub2_Sub3) this).anInt9920)
				   + (i_2114_ >> 12));
			    int i_2119_ = i_2113_++;
			    if (i_1835_ == 0) {
				if (i == 1)
				    is[i_2119_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2118_])
					     & 0xff)]);
				else if (i == 0) {
				    int i_2120_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2118_])
					     & 0xff)]);
				    int i_2121_
					= ((i_2120_ & 0xff0000) * anInt9934
					   & ~0xffffff);
				    int i_2122_
					= ((i_2120_ & 0xff00) * anInt9913
					   & 0xff0000);
				    int i_2123_ = ((i_2120_ & 0xff) * anInt9936
						   & 0xff00);
				    is[i_2119_]
					= (i_2121_ | i_2122_ | i_2123_) >>> 8;
				} else if (i == 3) {
				    int i_2124_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2118_])
					     & 0xff)]);
				    int i_2125_ = anInt9931;
				    int i_2126_ = i_2124_ + i_2125_;
				    int i_2127_ = ((i_2124_ & 0xff00ff)
						   + (i_2125_ & 0xff00ff));
				    int i_2128_
					= ((i_2127_ & 0x1000100)
					   + (i_2126_ - i_2127_ & 0x10000));
				    is[i_2119_]
					= (i_2126_ - i_2128_
					   | i_2128_ - (i_2128_ >>> 8));
				} else if (i == 2) {
				    int i_2129_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2118_])
					     & 0xff)]);
				    int i_2130_
					= ((i_2129_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_2131_
					= ((i_2129_ & 0xff00) * anInt9932
					   & 0xff0000);
				    is[i_2119_] = (((i_2130_ | i_2131_) >>> 8)
						   + anInt9939);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_1835_ == 1) {
				if (i == 1) {
				    int i_2132_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2118_]);
				    if (i_2132_ != 0)
					is[i_2119_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2132_ & 0xff]);
				} else if (i == 0) {
				    int i_2133_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2118_]);
				    if (i_2133_ != 0) {
					int i_2134_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2133_ & 0xff]);
					if ((anInt9931 & 0xffffff)
					    == 16777215) {
					    int i_2135_ = anInt9931 >>> 24;
					    int i_2136_ = 256 - i_2135_;
					    int i_2137_ = is[i_2119_];
					    is[i_2119_]
						= (((((i_2134_ & 0xff00ff)
						      * i_2135_)
						     + ((i_2137_ & 0xff00ff)
							* i_2136_))
						    & ~0xff00ff)
						   + ((((i_2134_ & 0xff00)
							* i_2135_)
						       + ((i_2137_ & 0xff00)
							  * i_2136_))
						      & 0xff0000)) >> 8;
					} else if (anInt9932 != 255) {
					    int i_2138_
						= (((i_2134_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_2139_ = (((i_2134_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_2140_
						= ((i_2134_ & 0xff) * anInt9936
						   & 0xff00);
					    i_2134_ = (i_2138_ | i_2139_
						       | i_2140_) >>> 8;
					    int i_2141_ = is[i_2119_];
					    is[i_2119_]
						= (((((i_2134_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2141_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2134_ & 0xff00)
							* anInt9932)
						       + ((i_2141_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2142_
						= (((i_2134_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_2143_ = (((i_2134_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_2144_
						= ((i_2134_ & 0xff) * anInt9936
						   & 0xff00);
					    is[i_2119_] = (i_2142_ | i_2143_
							   | i_2144_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_2145_ = (((Class168_Sub2_Sub3) this)
						    .aByteArray11205[i_2118_]);
				    int i_2146_
					= (i_2145_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_2145_])
					   : 0);
				    int i_2147_ = anInt9931;
				    int i_2148_ = i_2146_ + i_2147_;
				    int i_2149_ = ((i_2146_ & 0xff00ff)
						   + (i_2147_ & 0xff00ff));
				    int i_2150_
					= ((i_2149_ & 0x1000100)
					   + (i_2148_ - i_2149_ & 0x10000));
				    i_2150_ = (i_2148_ - i_2150_
					       | i_2150_ - (i_2150_ >>> 8));
				    if (i_2146_ == 0 && anInt9932 != 255) {
					i_2146_ = i_2150_;
					i_2150_ = is[i_2119_];
					i_2150_ = (((((i_2146_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2150_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2146_ & 0xff00)
							* anInt9932)
						       + ((i_2150_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2119_] = i_2150_;
				} else if (i == 2) {
				    int i_2151_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2118_]);
				    if (i_2151_ != 0) {
					int i_2152_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2151_ & 0xff]);
					int i_2153_
					    = ((i_2152_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_2154_
					    = ((i_2152_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_2119_++] = ((i_2153_ | i_2154_)
							 >>> 8) + anInt9939;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_1835_ == 2) {
				if (i == 1) {
				    int i_2155_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2118_]);
				    if (i_2155_ != 0) {
					int i_2156_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2155_ & 0xff]);
					int i_2157_ = is[i_2119_];
					int i_2158_ = i_2156_ + i_2157_;
					int i_2159_ = ((i_2156_ & 0xff00ff)
						       + (i_2157_ & 0xff00ff));
					i_2157_ = ((i_2159_ & 0x1000100)
						   + (i_2158_ - i_2159_
						      & 0x10000));
					is[i_2119_]
					    = (i_2158_ - i_2157_
					       | i_2157_ - (i_2157_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_2160_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2118_]);
				    if (i_2160_ != 0) {
					int i_2161_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2160_ & 0xff]);
					int i_2162_
					    = ((i_2161_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_2163_
					    = ((i_2161_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_2164_
					    = ((i_2161_ & 0xff) * anInt9936
					       & 0xff00);
					i_2161_ = (i_2162_ | i_2163_
						   | i_2164_) >>> 8;
					int i_2165_ = is[i_2119_];
					int i_2166_ = i_2161_ + i_2165_;
					int i_2167_ = ((i_2161_ & 0xff00ff)
						       + (i_2165_ & 0xff00ff));
					i_2165_ = ((i_2167_ & 0x1000100)
						   + (i_2166_ - i_2167_
						      & 0x10000));
					is[i_2119_]
					    = (i_2166_ - i_2165_
					       | i_2165_ - (i_2165_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_2168_ = (((Class168_Sub2_Sub3) this)
						    .aByteArray11205[i_2118_]);
				    int i_2169_
					= (i_2168_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_2168_])
					   : 0);
				    int i_2170_ = anInt9931;
				    int i_2171_ = i_2169_ + i_2170_;
				    int i_2172_ = ((i_2169_ & 0xff00ff)
						   + (i_2170_ & 0xff00ff));
				    int i_2173_
					= ((i_2172_ & 0x1000100)
					   + (i_2171_ - i_2172_ & 0x10000));
				    i_2173_ = (i_2171_ - i_2173_
					       | i_2173_ - (i_2173_ >>> 8));
				    if (i_2169_ == 0 && anInt9932 != 255) {
					i_2169_ = i_2173_;
					i_2173_ = is[i_2119_];
					i_2173_ = (((((i_2169_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2173_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2169_ & 0xff00)
							* anInt9932)
						       + ((i_2173_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2119_] = i_2173_;
				} else if (i == 2) {
				    int i_2174_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2118_]);
				    if (i_2174_ != 0) {
					int i_2175_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2174_ & 0xff]);
					int i_2176_
					    = ((i_2175_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_2177_
					    = ((i_2175_ & 0xff00) * anInt9932
					       & 0xff0000);
					i_2175_ = (((i_2176_ | i_2177_) >>> 8)
						   + anInt9939);
					int i_2178_ = is[i_2119_];
					int i_2179_ = i_2175_ + i_2178_;
					int i_2180_ = ((i_2175_ & 0xff00ff)
						       + (i_2178_ & 0xff00ff));
					i_2178_ = ((i_2180_ & 0x1000100)
						   + (i_2179_ - i_2180_
						      & 0x10000));
					is[i_2119_]
					    = (i_2179_ - i_2178_
					       | i_2178_ - (i_2178_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_2114_ += anInt9921;
			    i_2115_ += anInt9922;
			}
			i_2112_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_2181_ = anInt9919;
		    while (i_2181_ < 0) {
			int i_2182_ = anInt9925;
			int i_2183_ = anInt9927 + anInt9929;
			int i_2184_ = anInt9928 + anInt9930;
			int i_2185_ = anInt9906;
			int i_2186_;
			if ((i_2186_
			     = i_2183_ - (((Class168_Sub2_Sub3) this).anInt9920
					  << 12))
			    >= 0) {
			    i_2186_ = (anInt9921 - i_2186_) / anInt9921;
			    i_2185_ += i_2186_;
			    i_2183_ += anInt9921 * i_2186_;
			    i_2184_ += anInt9922 * i_2186_;
			    i_2182_ += i_2186_;
			}
			if ((i_2186_ = (i_2183_ - anInt9921) / anInt9921)
			    > i_2185_)
			    i_2185_ = i_2186_;
			if (i_2184_ < 0) {
			    i_2186_ = (anInt9922 - 1 - i_2184_) / anInt9922;
			    i_2185_ += i_2186_;
			    i_2183_ += anInt9921 * i_2186_;
			    i_2184_ += anInt9922 * i_2186_;
			    i_2182_ += i_2186_;
			}
			if ((i_2186_
			     = (1 + i_2184_
				- (((Class168_Sub2_Sub3) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_2185_)
			    i_2185_ = i_2186_;
			for (/**/; i_2185_ < 0; i_2185_++) {
			    int i_2187_
				= (((i_2184_ >> 12)
				    * ((Class168_Sub2_Sub3) this).anInt9920)
				   + (i_2183_ >> 12));
			    int i_2188_ = i_2182_++;
			    if (i_1835_ == 0) {
				if (i == 1)
				    is[i_2188_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2187_])
					     & 0xff)]);
				else if (i == 0) {
				    int i_2189_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2187_])
					     & 0xff)]);
				    int i_2190_
					= ((i_2189_ & 0xff0000) * anInt9934
					   & ~0xffffff);
				    int i_2191_
					= ((i_2189_ & 0xff00) * anInt9913
					   & 0xff0000);
				    int i_2192_ = ((i_2189_ & 0xff) * anInt9936
						   & 0xff00);
				    is[i_2188_]
					= (i_2190_ | i_2191_ | i_2192_) >>> 8;
				} else if (i == 3) {
				    int i_2193_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2187_])
					     & 0xff)]);
				    int i_2194_ = anInt9931;
				    int i_2195_ = i_2193_ + i_2194_;
				    int i_2196_ = ((i_2193_ & 0xff00ff)
						   + (i_2194_ & 0xff00ff));
				    int i_2197_
					= ((i_2196_ & 0x1000100)
					   + (i_2195_ - i_2196_ & 0x10000));
				    is[i_2188_]
					= (i_2195_ - i_2197_
					   | i_2197_ - (i_2197_ >>> 8));
				} else if (i == 2) {
				    int i_2198_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2187_])
					     & 0xff)]);
				    int i_2199_
					= ((i_2198_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_2200_
					= ((i_2198_ & 0xff00) * anInt9932
					   & 0xff0000);
				    is[i_2188_] = (((i_2199_ | i_2200_) >>> 8)
						   + anInt9939);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_1835_ == 1) {
				if (i == 1) {
				    int i_2201_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2187_]);
				    if (i_2201_ != 0)
					is[i_2188_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2201_ & 0xff]);
				} else if (i == 0) {
				    int i_2202_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2187_]);
				    if (i_2202_ != 0) {
					int i_2203_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2202_ & 0xff]);
					if ((anInt9931 & 0xffffff)
					    == 16777215) {
					    int i_2204_ = anInt9931 >>> 24;
					    int i_2205_ = 256 - i_2204_;
					    int i_2206_ = is[i_2188_];
					    is[i_2188_]
						= (((((i_2203_ & 0xff00ff)
						      * i_2204_)
						     + ((i_2206_ & 0xff00ff)
							* i_2205_))
						    & ~0xff00ff)
						   + ((((i_2203_ & 0xff00)
							* i_2204_)
						       + ((i_2206_ & 0xff00)
							  * i_2205_))
						      & 0xff0000)) >> 8;
					} else if (anInt9932 != 255) {
					    int i_2207_
						= (((i_2203_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_2208_ = (((i_2203_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_2209_
						= ((i_2203_ & 0xff) * anInt9936
						   & 0xff00);
					    i_2203_ = (i_2207_ | i_2208_
						       | i_2209_) >>> 8;
					    int i_2210_ = is[i_2188_];
					    is[i_2188_]
						= (((((i_2203_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2210_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2203_ & 0xff00)
							* anInt9932)
						       + ((i_2210_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2211_
						= (((i_2203_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_2212_ = (((i_2203_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_2213_
						= ((i_2203_ & 0xff) * anInt9936
						   & 0xff00);
					    is[i_2188_] = (i_2211_ | i_2212_
							   | i_2213_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_2214_ = (((Class168_Sub2_Sub3) this)
						    .aByteArray11205[i_2187_]);
				    int i_2215_
					= (i_2214_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_2214_])
					   : 0);
				    int i_2216_ = anInt9931;
				    int i_2217_ = i_2215_ + i_2216_;
				    int i_2218_ = ((i_2215_ & 0xff00ff)
						   + (i_2216_ & 0xff00ff));
				    int i_2219_
					= ((i_2218_ & 0x1000100)
					   + (i_2217_ - i_2218_ & 0x10000));
				    i_2219_ = (i_2217_ - i_2219_
					       | i_2219_ - (i_2219_ >>> 8));
				    if (i_2215_ == 0 && anInt9932 != 255) {
					i_2215_ = i_2219_;
					i_2219_ = is[i_2188_];
					i_2219_ = (((((i_2215_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2219_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2215_ & 0xff00)
							* anInt9932)
						       + ((i_2219_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2188_] = i_2219_;
				} else if (i == 2) {
				    int i_2220_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2187_]);
				    if (i_2220_ != 0) {
					int i_2221_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2220_ & 0xff]);
					int i_2222_
					    = ((i_2221_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_2223_
					    = ((i_2221_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_2188_++] = ((i_2222_ | i_2223_)
							 >>> 8) + anInt9939;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_1835_ == 2) {
				if (i == 1) {
				    int i_2224_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2187_]);
				    if (i_2224_ != 0) {
					int i_2225_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2224_ & 0xff]);
					int i_2226_ = is[i_2188_];
					int i_2227_ = i_2225_ + i_2226_;
					int i_2228_ = ((i_2225_ & 0xff00ff)
						       + (i_2226_ & 0xff00ff));
					i_2226_ = ((i_2228_ & 0x1000100)
						   + (i_2227_ - i_2228_
						      & 0x10000));
					is[i_2188_]
					    = (i_2227_ - i_2226_
					       | i_2226_ - (i_2226_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_2229_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2187_]);
				    if (i_2229_ != 0) {
					int i_2230_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2229_ & 0xff]);
					int i_2231_
					    = ((i_2230_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_2232_
					    = ((i_2230_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_2233_
					    = ((i_2230_ & 0xff) * anInt9936
					       & 0xff00);
					i_2230_ = (i_2231_ | i_2232_
						   | i_2233_) >>> 8;
					int i_2234_ = is[i_2188_];
					int i_2235_ = i_2230_ + i_2234_;
					int i_2236_ = ((i_2230_ & 0xff00ff)
						       + (i_2234_ & 0xff00ff));
					i_2234_ = ((i_2236_ & 0x1000100)
						   + (i_2235_ - i_2236_
						      & 0x10000));
					is[i_2188_]
					    = (i_2235_ - i_2234_
					       | i_2234_ - (i_2234_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_2237_ = (((Class168_Sub2_Sub3) this)
						    .aByteArray11205[i_2187_]);
				    int i_2238_
					= (i_2237_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_2237_])
					   : 0);
				    int i_2239_ = anInt9931;
				    int i_2240_ = i_2238_ + i_2239_;
				    int i_2241_ = ((i_2238_ & 0xff00ff)
						   + (i_2239_ & 0xff00ff));
				    int i_2242_
					= ((i_2241_ & 0x1000100)
					   + (i_2240_ - i_2241_ & 0x10000));
				    i_2242_ = (i_2240_ - i_2242_
					       | i_2242_ - (i_2242_ >>> 8));
				    if (i_2238_ == 0 && anInt9932 != 255) {
					i_2238_ = i_2242_;
					i_2242_ = is[i_2188_];
					i_2242_ = (((((i_2238_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2242_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2238_ & 0xff00)
							* anInt9932)
						       + ((i_2242_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2188_] = i_2242_;
				} else if (i == 2) {
				    int i_2243_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2187_]);
				    if (i_2243_ != 0) {
					int i_2244_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2243_ & 0xff]);
					int i_2245_
					    = ((i_2244_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_2246_
					    = ((i_2244_ & 0xff00) * anInt9932
					       & 0xff0000);
					i_2244_ = (((i_2245_ | i_2246_) >>> 8)
						   + anInt9939);
					int i_2247_ = is[i_2188_];
					int i_2248_ = i_2244_ + i_2247_;
					int i_2249_ = ((i_2244_ & 0xff00ff)
						       + (i_2247_ & 0xff00ff));
					i_2247_ = ((i_2249_ & 0x1000100)
						   + (i_2248_ - i_2249_
						      & 0x10000));
					is[i_2188_]
					    = (i_2248_ - i_2247_
					       | i_2247_ - (i_2247_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_2183_ += anInt9921;
			    i_2184_ += anInt9922;
			}
			i_2181_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_2250_ = anInt9919;
		while (i_2250_ < 0) {
		    int i_2251_ = anInt9925;
		    int i_2252_ = anInt9927 + anInt9929;
		    int i_2253_ = anInt9928;
		    int i_2254_ = anInt9906;
		    if (i_2253_ >= 0
			&& i_2253_ - (((Class168_Sub2_Sub3) this).anInt9916
				      << 12) < 0) {
			if (i_2252_ < 0) {
			    int i_2255_
				= (anInt9921 - 1 - i_2252_) / anInt9921;
			    i_2254_ += i_2255_;
			    i_2252_ += anInt9921 * i_2255_;
			    i_2251_ += i_2255_;
			}
			int i_2256_;
			if ((i_2256_
			     = (1 + i_2252_
				- (((Class168_Sub2_Sub3) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_2254_)
			    i_2254_ = i_2256_;
			for (/**/; i_2254_ < 0; i_2254_++) {
			    int i_2257_
				= (((i_2253_ >> 12)
				    * ((Class168_Sub2_Sub3) this).anInt9920)
				   + (i_2252_ >> 12));
			    int i_2258_ = i_2251_++;
			    if (i_1835_ == 0) {
				if (i == 1)
				    is[i_2258_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2257_])
					     & 0xff)]);
				else if (i == 0) {
				    int i_2259_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2257_])
					     & 0xff)]);
				    int i_2260_
					= ((i_2259_ & 0xff0000) * anInt9934
					   & ~0xffffff);
				    int i_2261_
					= ((i_2259_ & 0xff00) * anInt9913
					   & 0xff0000);
				    int i_2262_ = ((i_2259_ & 0xff) * anInt9936
						   & 0xff00);
				    is[i_2258_]
					= (i_2260_ | i_2261_ | i_2262_) >>> 8;
				} else if (i == 3) {
				    int i_2263_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2257_])
					     & 0xff)]);
				    int i_2264_ = anInt9931;
				    int i_2265_ = i_2263_ + i_2264_;
				    int i_2266_ = ((i_2263_ & 0xff00ff)
						   + (i_2264_ & 0xff00ff));
				    int i_2267_
					= ((i_2266_ & 0x1000100)
					   + (i_2265_ - i_2266_ & 0x10000));
				    is[i_2258_]
					= (i_2265_ - i_2267_
					   | i_2267_ - (i_2267_ >>> 8));
				} else if (i == 2) {
				    int i_2268_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2257_])
					     & 0xff)]);
				    int i_2269_
					= ((i_2268_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_2270_
					= ((i_2268_ & 0xff00) * anInt9932
					   & 0xff0000);
				    is[i_2258_] = (((i_2269_ | i_2270_) >>> 8)
						   + anInt9939);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_1835_ == 1) {
				if (i == 1) {
				    int i_2271_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2257_]);
				    if (i_2271_ != 0)
					is[i_2258_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2271_ & 0xff]);
				} else if (i == 0) {
				    int i_2272_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2257_]);
				    if (i_2272_ != 0) {
					int i_2273_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2272_ & 0xff]);
					if ((anInt9931 & 0xffffff)
					    == 16777215) {
					    int i_2274_ = anInt9931 >>> 24;
					    int i_2275_ = 256 - i_2274_;
					    int i_2276_ = is[i_2258_];
					    is[i_2258_]
						= (((((i_2273_ & 0xff00ff)
						      * i_2274_)
						     + ((i_2276_ & 0xff00ff)
							* i_2275_))
						    & ~0xff00ff)
						   + ((((i_2273_ & 0xff00)
							* i_2274_)
						       + ((i_2276_ & 0xff00)
							  * i_2275_))
						      & 0xff0000)) >> 8;
					} else if (anInt9932 != 255) {
					    int i_2277_
						= (((i_2273_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_2278_ = (((i_2273_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_2279_
						= ((i_2273_ & 0xff) * anInt9936
						   & 0xff00);
					    i_2273_ = (i_2277_ | i_2278_
						       | i_2279_) >>> 8;
					    int i_2280_ = is[i_2258_];
					    is[i_2258_]
						= (((((i_2273_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2280_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2273_ & 0xff00)
							* anInt9932)
						       + ((i_2280_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2281_
						= (((i_2273_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_2282_ = (((i_2273_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_2283_
						= ((i_2273_ & 0xff) * anInt9936
						   & 0xff00);
					    is[i_2258_] = (i_2281_ | i_2282_
							   | i_2283_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_2284_ = (((Class168_Sub2_Sub3) this)
						    .aByteArray11205[i_2257_]);
				    int i_2285_
					= (i_2284_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_2284_])
					   : 0);
				    int i_2286_ = anInt9931;
				    int i_2287_ = i_2285_ + i_2286_;
				    int i_2288_ = ((i_2285_ & 0xff00ff)
						   + (i_2286_ & 0xff00ff));
				    int i_2289_
					= ((i_2288_ & 0x1000100)
					   + (i_2287_ - i_2288_ & 0x10000));
				    i_2289_ = (i_2287_ - i_2289_
					       | i_2289_ - (i_2289_ >>> 8));
				    if (i_2285_ == 0 && anInt9932 != 255) {
					i_2285_ = i_2289_;
					i_2289_ = is[i_2258_];
					i_2289_ = (((((i_2285_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2289_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2285_ & 0xff00)
							* anInt9932)
						       + ((i_2289_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2258_] = i_2289_;
				} else if (i == 2) {
				    int i_2290_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2257_]);
				    if (i_2290_ != 0) {
					int i_2291_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2290_ & 0xff]);
					int i_2292_
					    = ((i_2291_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_2293_
					    = ((i_2291_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_2258_++] = ((i_2292_ | i_2293_)
							 >>> 8) + anInt9939;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_1835_ == 2) {
				if (i == 1) {
				    int i_2294_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2257_]);
				    if (i_2294_ != 0) {
					int i_2295_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2294_ & 0xff]);
					int i_2296_ = is[i_2258_];
					int i_2297_ = i_2295_ + i_2296_;
					int i_2298_ = ((i_2295_ & 0xff00ff)
						       + (i_2296_ & 0xff00ff));
					i_2296_ = ((i_2298_ & 0x1000100)
						   + (i_2297_ - i_2298_
						      & 0x10000));
					is[i_2258_]
					    = (i_2297_ - i_2296_
					       | i_2296_ - (i_2296_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_2299_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2257_]);
				    if (i_2299_ != 0) {
					int i_2300_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2299_ & 0xff]);
					int i_2301_
					    = ((i_2300_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_2302_
					    = ((i_2300_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_2303_
					    = ((i_2300_ & 0xff) * anInt9936
					       & 0xff00);
					i_2300_ = (i_2301_ | i_2302_
						   | i_2303_) >>> 8;
					int i_2304_ = is[i_2258_];
					int i_2305_ = i_2300_ + i_2304_;
					int i_2306_ = ((i_2300_ & 0xff00ff)
						       + (i_2304_ & 0xff00ff));
					i_2304_ = ((i_2306_ & 0x1000100)
						   + (i_2305_ - i_2306_
						      & 0x10000));
					is[i_2258_]
					    = (i_2305_ - i_2304_
					       | i_2304_ - (i_2304_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_2307_ = (((Class168_Sub2_Sub3) this)
						    .aByteArray11205[i_2257_]);
				    int i_2308_
					= (i_2307_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_2307_])
					   : 0);
				    int i_2309_ = anInt9931;
				    int i_2310_ = i_2308_ + i_2309_;
				    int i_2311_ = ((i_2308_ & 0xff00ff)
						   + (i_2309_ & 0xff00ff));
				    int i_2312_
					= ((i_2311_ & 0x1000100)
					   + (i_2310_ - i_2311_ & 0x10000));
				    i_2312_ = (i_2310_ - i_2312_
					       | i_2312_ - (i_2312_ >>> 8));
				    if (i_2308_ == 0 && anInt9932 != 255) {
					i_2308_ = i_2312_;
					i_2312_ = is[i_2258_];
					i_2312_ = (((((i_2308_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2312_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2308_ & 0xff00)
							* anInt9932)
						       + ((i_2312_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2258_] = i_2312_;
				} else if (i == 2) {
				    int i_2313_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2257_]);
				    if (i_2313_ != 0) {
					int i_2314_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2313_ & 0xff]);
					int i_2315_
					    = ((i_2314_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_2316_
					    = ((i_2314_ & 0xff00) * anInt9932
					       & 0xff0000);
					i_2314_ = (((i_2315_ | i_2316_) >>> 8)
						   + anInt9939);
					int i_2317_ = is[i_2258_];
					int i_2318_ = i_2314_ + i_2317_;
					int i_2319_ = ((i_2314_ & 0xff00ff)
						       + (i_2317_ & 0xff00ff));
					i_2317_ = ((i_2319_ & 0x1000100)
						   + (i_2318_ - i_2319_
						      & 0x10000));
					is[i_2258_]
					    = (i_2318_ - i_2317_
					       | i_2317_ - (i_2317_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_2252_ += anInt9921;
			}
		    }
		    i_2250_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		for (int i_2320_ = anInt9919; i_2320_ < 0; i_2320_++) {
		    int i_2321_ = anInt9925;
		    int i_2322_ = anInt9927 + anInt9929;
		    int i_2323_ = anInt9928 + anInt9930;
		    int i_2324_ = anInt9906;
		    if (i_2322_ < 0) {
			int i_2325_ = (anInt9921 - 1 - i_2322_) / anInt9921;
			i_2324_ += i_2325_;
			i_2322_ += anInt9921 * i_2325_;
			i_2323_ += anInt9922 * i_2325_;
			i_2321_ += i_2325_;
		    }
		    int i_2326_;
		    if ((i_2326_
			 = (1 + i_2322_
			    - (((Class168_Sub2_Sub3) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_2324_)
			i_2324_ = i_2326_;
		    if ((i_2326_
			 = i_2323_ - (((Class168_Sub2_Sub3) this).anInt9916
				      << 12))
			>= 0) {
			i_2326_ = (anInt9922 - i_2326_) / anInt9922;
			i_2324_ += i_2326_;
			i_2322_ += anInt9921 * i_2326_;
			i_2323_ += anInt9922 * i_2326_;
			i_2321_ += i_2326_;
		    }
		    if ((i_2326_ = (i_2323_ - anInt9922) / anInt9922)
			> i_2324_)
			i_2324_ = i_2326_;
		    for (/**/; i_2324_ < 0; i_2324_++) {
			int i_2327_
			    = (((i_2323_ >> 12)
				* ((Class168_Sub2_Sub3) this).anInt9920)
			       + (i_2322_ >> 12));
			int i_2328_ = i_2321_++;
			if (i_1835_ == 0) {
			    if (i == 1)
				is[i_2328_]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_2327_]) & 0xff]);
			    else if (i == 0) {
				int i_2329_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_2327_]) & 0xff]);
				int i_2330_ = ((i_2329_ & 0xff0000) * anInt9934
					       & ~0xffffff);
				int i_2331_ = ((i_2329_ & 0xff00) * anInt9913
					       & 0xff0000);
				int i_2332_
				    = (i_2329_ & 0xff) * anInt9936 & 0xff00;
				is[i_2328_]
				    = (i_2330_ | i_2331_ | i_2332_) >>> 8;
			    } else if (i == 3) {
				int i_2333_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_2327_]) & 0xff]);
				int i_2334_ = anInt9931;
				int i_2335_ = i_2333_ + i_2334_;
				int i_2336_ = ((i_2333_ & 0xff00ff)
					       + (i_2334_ & 0xff00ff));
				int i_2337_
				    = ((i_2336_ & 0x1000100)
				       + (i_2335_ - i_2336_ & 0x10000));
				is[i_2328_]
				    = i_2335_ - i_2337_ | i_2337_ - (i_2337_
								     >>> 8);
			    } else if (i == 2) {
				int i_2338_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_2327_]) & 0xff]);
				int i_2339_ = ((i_2338_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
				int i_2340_ = ((i_2338_ & 0xff00) * anInt9932
					       & 0xff0000);
				is[i_2328_]
				    = ((i_2339_ | i_2340_) >>> 8) + anInt9939;
			    } else
				throw new IllegalArgumentException();
			} else if (i_1835_ == 1) {
			    if (i == 1) {
				int i_2341_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2327_]);
				if (i_2341_ != 0)
				    is[i_2328_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_2341_ & 0xff]);
			    } else if (i == 0) {
				int i_2342_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2327_]);
				if (i_2342_ != 0) {
				    int i_2343_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_2342_ & 0xff]);
				    if ((anInt9931 & 0xffffff) == 16777215) {
					int i_2344_ = anInt9931 >>> 24;
					int i_2345_ = 256 - i_2344_;
					int i_2346_ = is[i_2328_];
					is[i_2328_]
					    = ((((i_2343_ & 0xff00ff) * i_2344_
						 + ((i_2346_ & 0xff00ff)
						    * i_2345_))
						& ~0xff00ff)
					       + (((i_2343_ & 0xff00) * i_2344_
						   + ((i_2346_ & 0xff00)
						      * i_2345_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9932 != 255) {
					int i_2347_
					    = ((i_2343_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_2348_
					    = ((i_2343_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_2349_
					    = ((i_2343_ & 0xff) * anInt9936
					       & 0xff00);
					i_2343_ = (i_2347_ | i_2348_
						   | i_2349_) >>> 8;
					int i_2350_ = is[i_2328_];
					is[i_2328_]
					    = (((((i_2343_ & 0xff00ff)
						  * anInt9932)
						 + ((i_2350_ & 0xff00ff)
						    * anInt9937))
						& ~0xff00ff)
					       + ((((i_2343_ & 0xff00)
						    * anInt9932)
						   + ((i_2350_ & 0xff00)
						      * anInt9937))
						  & 0xff0000)) >> 8;
				    } else {
					int i_2351_
					    = ((i_2343_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_2352_
					    = ((i_2343_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_2353_
					    = ((i_2343_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_2328_] = (i_2351_ | i_2352_
						       | i_2353_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_2354_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205[i_2327_]);
				int i_2355_ = (i_2354_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_2354_])
					       : 0);
				int i_2356_ = anInt9931;
				int i_2357_ = i_2355_ + i_2356_;
				int i_2358_ = ((i_2355_ & 0xff00ff)
					       + (i_2356_ & 0xff00ff));
				int i_2359_
				    = ((i_2358_ & 0x1000100)
				       + (i_2357_ - i_2358_ & 0x10000));
				i_2359_
				    = i_2357_ - i_2359_ | i_2359_ - (i_2359_
								     >>> 8);
				if (i_2355_ == 0 && anInt9932 != 255) {
				    i_2355_ = i_2359_;
				    i_2359_ = is[i_2328_];
				    i_2359_
					= ((((i_2355_ & 0xff00ff) * anInt9932
					     + ((i_2359_ & 0xff00ff)
						* anInt9937))
					    & ~0xff00ff)
					   + (((i_2355_ & 0xff00) * anInt9932
					       + ((i_2359_ & 0xff00)
						  * anInt9937))
					      & 0xff0000)) >> 8;
				}
				is[i_2328_] = i_2359_;
			    } else if (i == 2) {
				int i_2360_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2327_]);
				if (i_2360_ != 0) {
				    int i_2361_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_2360_ & 0xff]);
				    int i_2362_
					= ((i_2361_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_2363_
					= ((i_2361_ & 0xff00) * anInt9932
					   & 0xff0000);
				    is[i_2328_++] = ((i_2362_ | i_2363_)
						     >>> 8) + anInt9939;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_1835_ == 2) {
			    if (i == 1) {
				int i_2364_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2327_]);
				if (i_2364_ != 0) {
				    int i_2365_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_2364_ & 0xff]);
				    int i_2366_ = is[i_2328_];
				    int i_2367_ = i_2365_ + i_2366_;
				    int i_2368_ = ((i_2365_ & 0xff00ff)
						   + (i_2366_ & 0xff00ff));
				    i_2366_
					= ((i_2368_ & 0x1000100)
					   + (i_2367_ - i_2368_ & 0x10000));
				    is[i_2328_]
					= (i_2367_ - i_2366_
					   | i_2366_ - (i_2366_ >>> 8));
				}
			    } else if (i == 0) {
				int i_2369_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2327_]);
				if (i_2369_ != 0) {
				    int i_2370_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_2369_ & 0xff]);
				    int i_2371_
					= ((i_2370_ & 0xff0000) * anInt9934
					   & ~0xffffff);
				    int i_2372_
					= ((i_2370_ & 0xff00) * anInt9913
					   & 0xff0000);
				    int i_2373_ = ((i_2370_ & 0xff) * anInt9936
						   & 0xff00);
				    i_2370_
					= (i_2371_ | i_2372_ | i_2373_) >>> 8;
				    int i_2374_ = is[i_2328_];
				    int i_2375_ = i_2370_ + i_2374_;
				    int i_2376_ = ((i_2370_ & 0xff00ff)
						   + (i_2374_ & 0xff00ff));
				    i_2374_
					= ((i_2376_ & 0x1000100)
					   + (i_2375_ - i_2376_ & 0x10000));
				    is[i_2328_]
					= (i_2375_ - i_2374_
					   | i_2374_ - (i_2374_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_2377_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205[i_2327_]);
				int i_2378_ = (i_2377_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_2377_])
					       : 0);
				int i_2379_ = anInt9931;
				int i_2380_ = i_2378_ + i_2379_;
				int i_2381_ = ((i_2378_ & 0xff00ff)
					       + (i_2379_ & 0xff00ff));
				int i_2382_
				    = ((i_2381_ & 0x1000100)
				       + (i_2380_ - i_2381_ & 0x10000));
				i_2382_
				    = i_2380_ - i_2382_ | i_2382_ - (i_2382_
								     >>> 8);
				if (i_2378_ == 0 && anInt9932 != 255) {
				    i_2378_ = i_2382_;
				    i_2382_ = is[i_2328_];
				    i_2382_
					= ((((i_2378_ & 0xff00ff) * anInt9932
					     + ((i_2382_ & 0xff00ff)
						* anInt9937))
					    & ~0xff00ff)
					   + (((i_2378_ & 0xff00) * anInt9932
					       + ((i_2382_ & 0xff00)
						  * anInt9937))
					      & 0xff0000)) >> 8;
				}
				is[i_2328_] = i_2382_;
			    } else if (i == 2) {
				int i_2383_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2327_]);
				if (i_2383_ != 0) {
				    int i_2384_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_2383_ & 0xff]);
				    int i_2385_
					= ((i_2384_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_2386_
					= ((i_2384_ & 0xff00) * anInt9932
					   & 0xff0000);
				    i_2384_ = (((i_2385_ | i_2386_) >>> 8)
					       + anInt9939);
				    int i_2387_ = is[i_2328_];
				    int i_2388_ = i_2384_ + i_2387_;
				    int i_2389_ = ((i_2384_ & 0xff00ff)
						   + (i_2387_ & 0xff00ff));
				    i_2387_
					= ((i_2389_ & 0x1000100)
					   + (i_2388_ - i_2389_ & 0x10000));
				    is[i_2328_]
					= (i_2388_ - i_2387_
					   | i_2387_ - (i_2387_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_2322_ += anInt9921;
			i_2323_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		for (int i_2390_ = anInt9919; i_2390_ < 0; i_2390_++) {
		    int i_2391_ = anInt9925;
		    int i_2392_ = anInt9927 + anInt9929;
		    int i_2393_ = anInt9928 + anInt9930;
		    int i_2394_ = anInt9906;
		    if (i_2392_ < 0) {
			int i_2395_ = (anInt9921 - 1 - i_2392_) / anInt9921;
			i_2394_ += i_2395_;
			i_2392_ += anInt9921 * i_2395_;
			i_2393_ += anInt9922 * i_2395_;
			i_2391_ += i_2395_;
		    }
		    int i_2396_;
		    if ((i_2396_
			 = (1 + i_2392_
			    - (((Class168_Sub2_Sub3) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_2394_)
			i_2394_ = i_2396_;
		    if (i_2393_ < 0) {
			i_2396_ = (anInt9922 - 1 - i_2393_) / anInt9922;
			i_2394_ += i_2396_;
			i_2392_ += anInt9921 * i_2396_;
			i_2393_ += anInt9922 * i_2396_;
			i_2391_ += i_2396_;
		    }
		    if ((i_2396_
			 = (1 + i_2393_
			    - (((Class168_Sub2_Sub3) this).anInt9916 << 12)
			    - anInt9922) / anInt9922)
			> i_2394_)
			i_2394_ = i_2396_;
		    for (/**/; i_2394_ < 0; i_2394_++) {
			int i_2397_
			    = (((i_2393_ >> 12)
				* ((Class168_Sub2_Sub3) this).anInt9920)
			       + (i_2392_ >> 12));
			int i_2398_ = i_2391_++;
			if (i_1835_ == 0) {
			    if (i == 1)
				is[i_2398_]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_2397_]) & 0xff]);
			    else if (i == 0) {
				int i_2399_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_2397_]) & 0xff]);
				int i_2400_ = ((i_2399_ & 0xff0000) * anInt9934
					       & ~0xffffff);
				int i_2401_ = ((i_2399_ & 0xff00) * anInt9913
					       & 0xff0000);
				int i_2402_
				    = (i_2399_ & 0xff) * anInt9936 & 0xff00;
				is[i_2398_]
				    = (i_2400_ | i_2401_ | i_2402_) >>> 8;
			    } else if (i == 3) {
				int i_2403_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_2397_]) & 0xff]);
				int i_2404_ = anInt9931;
				int i_2405_ = i_2403_ + i_2404_;
				int i_2406_ = ((i_2403_ & 0xff00ff)
					       + (i_2404_ & 0xff00ff));
				int i_2407_
				    = ((i_2406_ & 0x1000100)
				       + (i_2405_ - i_2406_ & 0x10000));
				is[i_2398_]
				    = i_2405_ - i_2407_ | i_2407_ - (i_2407_
								     >>> 8);
			    } else if (i == 2) {
				int i_2408_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_2397_]) & 0xff]);
				int i_2409_ = ((i_2408_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
				int i_2410_ = ((i_2408_ & 0xff00) * anInt9932
					       & 0xff0000);
				is[i_2398_]
				    = ((i_2409_ | i_2410_) >>> 8) + anInt9939;
			    } else
				throw new IllegalArgumentException();
			} else if (i_1835_ == 1) {
			    if (i == 1) {
				int i_2411_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2397_]);
				if (i_2411_ != 0)
				    is[i_2398_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_2411_ & 0xff]);
			    } else if (i == 0) {
				int i_2412_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2397_]);
				if (i_2412_ != 0) {
				    int i_2413_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_2412_ & 0xff]);
				    if ((anInt9931 & 0xffffff) == 16777215) {
					int i_2414_ = anInt9931 >>> 24;
					int i_2415_ = 256 - i_2414_;
					int i_2416_ = is[i_2398_];
					is[i_2398_]
					    = ((((i_2413_ & 0xff00ff) * i_2414_
						 + ((i_2416_ & 0xff00ff)
						    * i_2415_))
						& ~0xff00ff)
					       + (((i_2413_ & 0xff00) * i_2414_
						   + ((i_2416_ & 0xff00)
						      * i_2415_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9932 != 255) {
					int i_2417_
					    = ((i_2413_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_2418_
					    = ((i_2413_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_2419_
					    = ((i_2413_ & 0xff) * anInt9936
					       & 0xff00);
					i_2413_ = (i_2417_ | i_2418_
						   | i_2419_) >>> 8;
					int i_2420_ = is[i_2398_];
					is[i_2398_]
					    = (((((i_2413_ & 0xff00ff)
						  * anInt9932)
						 + ((i_2420_ & 0xff00ff)
						    * anInt9937))
						& ~0xff00ff)
					       + ((((i_2413_ & 0xff00)
						    * anInt9932)
						   + ((i_2420_ & 0xff00)
						      * anInt9937))
						  & 0xff0000)) >> 8;
				    } else {
					int i_2421_
					    = ((i_2413_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_2422_
					    = ((i_2413_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_2423_
					    = ((i_2413_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_2398_] = (i_2421_ | i_2422_
						       | i_2423_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_2424_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205[i_2397_]);
				int i_2425_ = (i_2424_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_2424_])
					       : 0);
				int i_2426_ = anInt9931;
				int i_2427_ = i_2425_ + i_2426_;
				int i_2428_ = ((i_2425_ & 0xff00ff)
					       + (i_2426_ & 0xff00ff));
				int i_2429_
				    = ((i_2428_ & 0x1000100)
				       + (i_2427_ - i_2428_ & 0x10000));
				i_2429_
				    = i_2427_ - i_2429_ | i_2429_ - (i_2429_
								     >>> 8);
				if (i_2425_ == 0 && anInt9932 != 255) {
				    i_2425_ = i_2429_;
				    i_2429_ = is[i_2398_];
				    i_2429_
					= ((((i_2425_ & 0xff00ff) * anInt9932
					     + ((i_2429_ & 0xff00ff)
						* anInt9937))
					    & ~0xff00ff)
					   + (((i_2425_ & 0xff00) * anInt9932
					       + ((i_2429_ & 0xff00)
						  * anInt9937))
					      & 0xff0000)) >> 8;
				}
				is[i_2398_] = i_2429_;
			    } else if (i == 2) {
				int i_2430_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2397_]);
				if (i_2430_ != 0) {
				    int i_2431_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_2430_ & 0xff]);
				    int i_2432_
					= ((i_2431_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_2433_
					= ((i_2431_ & 0xff00) * anInt9932
					   & 0xff0000);
				    is[i_2398_++] = ((i_2432_ | i_2433_)
						     >>> 8) + anInt9939;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_1835_ == 2) {
			    if (i == 1) {
				int i_2434_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2397_]);
				if (i_2434_ != 0) {
				    int i_2435_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_2434_ & 0xff]);
				    int i_2436_ = is[i_2398_];
				    int i_2437_ = i_2435_ + i_2436_;
				    int i_2438_ = ((i_2435_ & 0xff00ff)
						   + (i_2436_ & 0xff00ff));
				    i_2436_
					= ((i_2438_ & 0x1000100)
					   + (i_2437_ - i_2438_ & 0x10000));
				    is[i_2398_]
					= (i_2437_ - i_2436_
					   | i_2436_ - (i_2436_ >>> 8));
				}
			    } else if (i == 0) {
				int i_2439_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2397_]);
				if (i_2439_ != 0) {
				    int i_2440_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_2439_ & 0xff]);
				    int i_2441_
					= ((i_2440_ & 0xff0000) * anInt9934
					   & ~0xffffff);
				    int i_2442_
					= ((i_2440_ & 0xff00) * anInt9913
					   & 0xff0000);
				    int i_2443_ = ((i_2440_ & 0xff) * anInt9936
						   & 0xff00);
				    i_2440_
					= (i_2441_ | i_2442_ | i_2443_) >>> 8;
				    int i_2444_ = is[i_2398_];
				    int i_2445_ = i_2440_ + i_2444_;
				    int i_2446_ = ((i_2440_ & 0xff00ff)
						   + (i_2444_ & 0xff00ff));
				    i_2444_
					= ((i_2446_ & 0x1000100)
					   + (i_2445_ - i_2446_ & 0x10000));
				    is[i_2398_]
					= (i_2445_ - i_2444_
					   | i_2444_ - (i_2444_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_2447_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205[i_2397_]);
				int i_2448_ = (i_2447_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_2447_])
					       : 0);
				int i_2449_ = anInt9931;
				int i_2450_ = i_2448_ + i_2449_;
				int i_2451_ = ((i_2448_ & 0xff00ff)
					       + (i_2449_ & 0xff00ff));
				int i_2452_
				    = ((i_2451_ & 0x1000100)
				       + (i_2450_ - i_2451_ & 0x10000));
				i_2452_
				    = i_2450_ - i_2452_ | i_2452_ - (i_2452_
								     >>> 8);
				if (i_2448_ == 0 && anInt9932 != 255) {
				    i_2448_ = i_2452_;
				    i_2452_ = is[i_2398_];
				    i_2452_
					= ((((i_2448_ & 0xff00ff) * anInt9932
					     + ((i_2452_ & 0xff00ff)
						* anInt9937))
					    & ~0xff00ff)
					   + (((i_2448_ & 0xff00) * anInt9932
					       + ((i_2452_ & 0xff00)
						  * anInt9937))
					      & 0xff0000)) >> 8;
				}
				is[i_2398_] = i_2452_;
			    } else if (i == 2) {
				int i_2453_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2397_]);
				if (i_2453_ != 0) {
				    int i_2454_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_2453_ & 0xff]);
				    int i_2455_
					= ((i_2454_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_2456_
					= ((i_2454_ & 0xff00) * anInt9932
					   & 0xff0000);
				    i_2454_ = (((i_2455_ | i_2456_) >>> 8)
					       + anInt9939);
				    int i_2457_ = is[i_2398_];
				    int i_2458_ = i_2454_ + i_2457_;
				    int i_2459_ = ((i_2454_ & 0xff00ff)
						   + (i_2457_ & 0xff00ff));
				    i_2457_
					= ((i_2459_ & 0x1000100)
					   + (i_2458_ - i_2459_ & 0x10000));
				    is[i_2398_]
					= (i_2458_ - i_2457_
					   | i_2457_ - (i_2457_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_2392_ += anInt9921;
			i_2393_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    void method16219(int i, int i_2460_) {
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_2461_ = anInt9919;
		    while (i_2461_ < 0) {
			int i_2462_ = anInt9925;
			int i_2463_ = anInt9927;
			int i_2464_ = anInt9928;
			int i_2465_ = anInt9906;
			if (i_2463_ >= 0 && i_2464_ >= 0
			    && i_2463_ - (((Class168_Sub2_Sub3) this).anInt9920
					  << 12) < 0
			    && i_2464_ - (((Class168_Sub2_Sub3) this).anInt9916
					  << 12) < 0) {
			    for (/**/; i_2465_ < 0; i_2465_++) {
				int i_2466_
				    = ((i_2464_ >> 12) * ((Class168_Sub2_Sub3)
							  this).anInt9920
				       + (i_2463_ >> 12));
				int i_2467_ = i_2462_++;
				if (i_2460_ == 0) {
				    if (i == 1)
					is[i_2467_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_2466_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_2468_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_2466_])
						 & 0xff)]);
					int i_2469_
					    = ((i_2468_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_2470_
					    = ((i_2468_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_2471_
					    = ((i_2468_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_2467_] = (i_2469_ | i_2470_
						       | i_2471_) >>> 8;
				    } else if (i == 3) {
					int i_2472_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_2466_])
						 & 0xff)]);
					int i_2473_ = anInt9931;
					int i_2474_ = i_2472_ + i_2473_;
					int i_2475_ = ((i_2472_ & 0xff00ff)
						       + (i_2473_ & 0xff00ff));
					int i_2476_ = ((i_2475_ & 0x1000100)
						       + (i_2474_ - i_2475_
							  & 0x10000));
					is[i_2467_]
					    = (i_2474_ - i_2476_
					       | i_2476_ - (i_2476_ >>> 8));
				    } else if (i == 2) {
					int i_2477_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_2466_])
						 & 0xff)]);
					int i_2478_
					    = ((i_2477_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_2479_
					    = ((i_2477_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_2467_] = ((i_2478_ | i_2479_)
						       >>> 8) + anInt9939;
				    } else
					throw new IllegalArgumentException();
				} else if (i_2460_ == 1) {
				    if (i == 1) {
					int i_2480_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2466_]);
					if (i_2480_ != 0)
					    is[i_2467_]
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2480_ & 0xff]);
				    } else if (i == 0) {
					int i_2481_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2466_]);
					if (i_2481_ != 0) {
					    int i_2482_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2481_ & 0xff]);
					    if ((anInt9931 & 0xffffff)
						== 16777215) {
						int i_2483_ = anInt9931 >>> 24;
						int i_2484_ = 256 - i_2483_;
						int i_2485_ = is[i_2467_];
						is[i_2467_]
						    = (((((i_2482_ & 0xff00ff)
							  * i_2483_)
							 + ((i_2485_
							     & 0xff00ff)
							    * i_2484_))
							& ~0xff00ff)
						       + ((((i_2482_ & 0xff00)
							    * i_2483_)
							   + ((i_2485_
							       & 0xff00)
							      * i_2484_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9932 != 255) {
						int i_2486_
						    = (((i_2482_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_2487_
						    = (((i_2482_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_2488_
						    = (((i_2482_ & 0xff)
							* anInt9936)
						       & 0xff00);
						i_2482_ = (i_2486_ | i_2487_
							   | i_2488_) >>> 8;
						int i_2489_ = is[i_2467_];
						is[i_2467_]
						    = (((((i_2482_ & 0xff00ff)
							  * anInt9932)
							 + ((i_2489_
							     & 0xff00ff)
							    * anInt9937))
							& ~0xff00ff)
						       + ((((i_2482_ & 0xff00)
							    * anInt9932)
							   + ((i_2489_
							       & 0xff00)
							      * anInt9937))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2490_
						    = (((i_2482_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_2491_
						    = (((i_2482_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_2492_
						    = (((i_2482_ & 0xff)
							* anInt9936)
						       & 0xff00);
						is[i_2467_]
						    = (i_2490_ | i_2491_
						       | i_2492_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2493_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2466_]);
					int i_2494_
					    = (i_2493_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_2493_])
					       : 0);
					int i_2495_ = anInt9931;
					int i_2496_ = i_2494_ + i_2495_;
					int i_2497_ = ((i_2494_ & 0xff00ff)
						       + (i_2495_ & 0xff00ff));
					int i_2498_ = ((i_2497_ & 0x1000100)
						       + (i_2496_ - i_2497_
							  & 0x10000));
					i_2498_
					    = (i_2496_ - i_2498_
					       | i_2498_ - (i_2498_ >>> 8));
					if (i_2494_ == 0 && anInt9932 != 255) {
					    i_2494_ = i_2498_;
					    i_2498_ = is[i_2467_];
					    i_2498_
						= (((((i_2494_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2498_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2494_ & 0xff00)
							* anInt9932)
						       + ((i_2498_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_2467_] = i_2498_;
				    } else if (i == 2) {
					int i_2499_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2466_]);
					if (i_2499_ != 0) {
					    int i_2500_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2499_ & 0xff]);
					    int i_2501_
						= (((i_2500_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_2502_ = (((i_2500_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    is[i_2467_++]
						= (((i_2501_ | i_2502_) >>> 8)
						   + anInt9939);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_2460_ == 2) {
				    if (i == 1) {
					int i_2503_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2466_]);
					if (i_2503_ != 0) {
					    int i_2504_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2503_ & 0xff]);
					    int i_2505_ = is[i_2467_];
					    int i_2506_ = i_2504_ + i_2505_;
					    int i_2507_
						= ((i_2504_ & 0xff00ff)
						   + (i_2505_ & 0xff00ff));
					    i_2505_ = ((i_2507_ & 0x1000100)
						       + (i_2506_ - i_2507_
							  & 0x10000));
					    is[i_2467_]
						= (i_2506_ - i_2505_
						   | i_2505_ - (i_2505_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2508_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2466_]);
					if (i_2508_ != 0) {
					    int i_2509_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2508_ & 0xff]);
					    int i_2510_
						= (((i_2509_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_2511_ = (((i_2509_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_2512_
						= ((i_2509_ & 0xff) * anInt9936
						   & 0xff00);
					    i_2509_ = (i_2510_ | i_2511_
						       | i_2512_) >>> 8;
					    int i_2513_ = is[i_2467_];
					    int i_2514_ = i_2509_ + i_2513_;
					    int i_2515_
						= ((i_2509_ & 0xff00ff)
						   + (i_2513_ & 0xff00ff));
					    i_2513_ = ((i_2515_ & 0x1000100)
						       + (i_2514_ - i_2515_
							  & 0x10000));
					    is[i_2467_]
						= (i_2514_ - i_2513_
						   | i_2513_ - (i_2513_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2516_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2466_]);
					int i_2517_
					    = (i_2516_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_2516_])
					       : 0);
					int i_2518_ = anInt9931;
					int i_2519_ = i_2517_ + i_2518_;
					int i_2520_ = ((i_2517_ & 0xff00ff)
						       + (i_2518_ & 0xff00ff));
					int i_2521_ = ((i_2520_ & 0x1000100)
						       + (i_2519_ - i_2520_
							  & 0x10000));
					i_2521_
					    = (i_2519_ - i_2521_
					       | i_2521_ - (i_2521_ >>> 8));
					if (i_2517_ == 0 && anInt9932 != 255) {
					    i_2517_ = i_2521_;
					    i_2521_ = is[i_2467_];
					    i_2521_
						= (((((i_2517_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2521_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2517_ & 0xff00)
							* anInt9932)
						       + ((i_2521_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_2467_] = i_2521_;
				    } else if (i == 2) {
					int i_2522_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2466_]);
					if (i_2522_ != 0) {
					    int i_2523_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2522_ & 0xff]);
					    int i_2524_
						= (((i_2523_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_2525_ = (((i_2523_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    i_2523_ = ((i_2524_ | i_2525_)
						       >>> 8) + anInt9939;
					    int i_2526_ = is[i_2467_];
					    int i_2527_ = i_2523_ + i_2526_;
					    int i_2528_
						= ((i_2523_ & 0xff00ff)
						   + (i_2526_ & 0xff00ff));
					    i_2526_ = ((i_2528_ & 0x1000100)
						       + (i_2527_ - i_2528_
							  & 0x10000));
					    is[i_2467_]
						= (i_2527_ - i_2526_
						   | i_2526_ - (i_2526_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
			    }
			}
			i_2461_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_2529_ = anInt9919;
		    while (i_2529_ < 0) {
			int i_2530_ = anInt9925;
			int i_2531_ = anInt9927;
			int i_2532_ = anInt9928 + anInt9930;
			int i_2533_ = anInt9906;
			if (i_2531_ >= 0
			    && i_2531_ - (((Class168_Sub2_Sub3) this).anInt9920
					  << 12) < 0) {
			    int i_2534_;
			    if ((i_2534_
				 = (i_2532_
				    - (((Class168_Sub2_Sub3) this).anInt9916
				       << 12)))
				>= 0) {
				i_2534_ = (anInt9922 - i_2534_) / anInt9922;
				i_2533_ += i_2534_;
				i_2532_ += anInt9922 * i_2534_;
				i_2530_ += i_2534_;
			    }
			    if ((i_2534_ = (i_2532_ - anInt9922) / anInt9922)
				> i_2533_)
				i_2533_ = i_2534_;
			    for (/**/; i_2533_ < 0; i_2533_++) {
				int i_2535_
				    = ((i_2532_ >> 12) * ((Class168_Sub2_Sub3)
							  this).anInt9920
				       + (i_2531_ >> 12));
				int i_2536_ = i_2530_++;
				if (i_2460_ == 0) {
				    if (i == 1)
					is[i_2536_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_2535_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_2537_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_2535_])
						 & 0xff)]);
					int i_2538_
					    = ((i_2537_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_2539_
					    = ((i_2537_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_2540_
					    = ((i_2537_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_2536_] = (i_2538_ | i_2539_
						       | i_2540_) >>> 8;
				    } else if (i == 3) {
					int i_2541_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_2535_])
						 & 0xff)]);
					int i_2542_ = anInt9931;
					int i_2543_ = i_2541_ + i_2542_;
					int i_2544_ = ((i_2541_ & 0xff00ff)
						       + (i_2542_ & 0xff00ff));
					int i_2545_ = ((i_2544_ & 0x1000100)
						       + (i_2543_ - i_2544_
							  & 0x10000));
					is[i_2536_]
					    = (i_2543_ - i_2545_
					       | i_2545_ - (i_2545_ >>> 8));
				    } else if (i == 2) {
					int i_2546_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_2535_])
						 & 0xff)]);
					int i_2547_
					    = ((i_2546_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_2548_
					    = ((i_2546_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_2536_] = ((i_2547_ | i_2548_)
						       >>> 8) + anInt9939;
				    } else
					throw new IllegalArgumentException();
				} else if (i_2460_ == 1) {
				    if (i == 1) {
					int i_2549_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2535_]);
					if (i_2549_ != 0)
					    is[i_2536_]
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2549_ & 0xff]);
				    } else if (i == 0) {
					int i_2550_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2535_]);
					if (i_2550_ != 0) {
					    int i_2551_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2550_ & 0xff]);
					    if ((anInt9931 & 0xffffff)
						== 16777215) {
						int i_2552_ = anInt9931 >>> 24;
						int i_2553_ = 256 - i_2552_;
						int i_2554_ = is[i_2536_];
						is[i_2536_]
						    = (((((i_2551_ & 0xff00ff)
							  * i_2552_)
							 + ((i_2554_
							     & 0xff00ff)
							    * i_2553_))
							& ~0xff00ff)
						       + ((((i_2551_ & 0xff00)
							    * i_2552_)
							   + ((i_2554_
							       & 0xff00)
							      * i_2553_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9932 != 255) {
						int i_2555_
						    = (((i_2551_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_2556_
						    = (((i_2551_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_2557_
						    = (((i_2551_ & 0xff)
							* anInt9936)
						       & 0xff00);
						i_2551_ = (i_2555_ | i_2556_
							   | i_2557_) >>> 8;
						int i_2558_ = is[i_2536_];
						is[i_2536_]
						    = (((((i_2551_ & 0xff00ff)
							  * anInt9932)
							 + ((i_2558_
							     & 0xff00ff)
							    * anInt9937))
							& ~0xff00ff)
						       + ((((i_2551_ & 0xff00)
							    * anInt9932)
							   + ((i_2558_
							       & 0xff00)
							      * anInt9937))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2559_
						    = (((i_2551_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_2560_
						    = (((i_2551_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_2561_
						    = (((i_2551_ & 0xff)
							* anInt9936)
						       & 0xff00);
						is[i_2536_]
						    = (i_2559_ | i_2560_
						       | i_2561_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2562_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2535_]);
					int i_2563_
					    = (i_2562_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_2562_])
					       : 0);
					int i_2564_ = anInt9931;
					int i_2565_ = i_2563_ + i_2564_;
					int i_2566_ = ((i_2563_ & 0xff00ff)
						       + (i_2564_ & 0xff00ff));
					int i_2567_ = ((i_2566_ & 0x1000100)
						       + (i_2565_ - i_2566_
							  & 0x10000));
					i_2567_
					    = (i_2565_ - i_2567_
					       | i_2567_ - (i_2567_ >>> 8));
					if (i_2563_ == 0 && anInt9932 != 255) {
					    i_2563_ = i_2567_;
					    i_2567_ = is[i_2536_];
					    i_2567_
						= (((((i_2563_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2567_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2563_ & 0xff00)
							* anInt9932)
						       + ((i_2567_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_2536_] = i_2567_;
				    } else if (i == 2) {
					int i_2568_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2535_]);
					if (i_2568_ != 0) {
					    int i_2569_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2568_ & 0xff]);
					    int i_2570_
						= (((i_2569_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_2571_ = (((i_2569_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    is[i_2536_++]
						= (((i_2570_ | i_2571_) >>> 8)
						   + anInt9939);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_2460_ == 2) {
				    if (i == 1) {
					int i_2572_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2535_]);
					if (i_2572_ != 0) {
					    int i_2573_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2572_ & 0xff]);
					    int i_2574_ = is[i_2536_];
					    int i_2575_ = i_2573_ + i_2574_;
					    int i_2576_
						= ((i_2573_ & 0xff00ff)
						   + (i_2574_ & 0xff00ff));
					    i_2574_ = ((i_2576_ & 0x1000100)
						       + (i_2575_ - i_2576_
							  & 0x10000));
					    is[i_2536_]
						= (i_2575_ - i_2574_
						   | i_2574_ - (i_2574_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2577_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2535_]);
					if (i_2577_ != 0) {
					    int i_2578_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2577_ & 0xff]);
					    int i_2579_
						= (((i_2578_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_2580_ = (((i_2578_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_2581_
						= ((i_2578_ & 0xff) * anInt9936
						   & 0xff00);
					    i_2578_ = (i_2579_ | i_2580_
						       | i_2581_) >>> 8;
					    int i_2582_ = is[i_2536_];
					    int i_2583_ = i_2578_ + i_2582_;
					    int i_2584_
						= ((i_2578_ & 0xff00ff)
						   + (i_2582_ & 0xff00ff));
					    i_2582_ = ((i_2584_ & 0x1000100)
						       + (i_2583_ - i_2584_
							  & 0x10000));
					    is[i_2536_]
						= (i_2583_ - i_2582_
						   | i_2582_ - (i_2582_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2585_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2535_]);
					int i_2586_
					    = (i_2585_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_2585_])
					       : 0);
					int i_2587_ = anInt9931;
					int i_2588_ = i_2586_ + i_2587_;
					int i_2589_ = ((i_2586_ & 0xff00ff)
						       + (i_2587_ & 0xff00ff));
					int i_2590_ = ((i_2589_ & 0x1000100)
						       + (i_2588_ - i_2589_
							  & 0x10000));
					i_2590_
					    = (i_2588_ - i_2590_
					       | i_2590_ - (i_2590_ >>> 8));
					if (i_2586_ == 0 && anInt9932 != 255) {
					    i_2586_ = i_2590_;
					    i_2590_ = is[i_2536_];
					    i_2590_
						= (((((i_2586_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2590_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2586_ & 0xff00)
							* anInt9932)
						       + ((i_2590_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_2536_] = i_2590_;
				    } else if (i == 2) {
					int i_2591_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2535_]);
					if (i_2591_ != 0) {
					    int i_2592_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2591_ & 0xff]);
					    int i_2593_
						= (((i_2592_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_2594_ = (((i_2592_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    i_2592_ = ((i_2593_ | i_2594_)
						       >>> 8) + anInt9939;
					    int i_2595_ = is[i_2536_];
					    int i_2596_ = i_2592_ + i_2595_;
					    int i_2597_
						= ((i_2592_ & 0xff00ff)
						   + (i_2595_ & 0xff00ff));
					    i_2595_ = ((i_2597_ & 0x1000100)
						       + (i_2596_ - i_2597_
							  & 0x10000));
					    is[i_2536_]
						= (i_2596_ - i_2595_
						   | i_2595_ - (i_2595_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_2532_ += anInt9922;
			    }
			}
			i_2529_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_2598_ = anInt9919;
		    while (i_2598_ < 0) {
			int i_2599_ = anInt9925;
			int i_2600_ = anInt9927;
			int i_2601_ = anInt9928 + anInt9930;
			int i_2602_ = anInt9906;
			if (i_2600_ >= 0
			    && i_2600_ - (((Class168_Sub2_Sub3) this).anInt9920
					  << 12) < 0) {
			    if (i_2601_ < 0) {
				int i_2603_
				    = (anInt9922 - 1 - i_2601_) / anInt9922;
				i_2602_ += i_2603_;
				i_2601_ += anInt9922 * i_2603_;
				i_2599_ += i_2603_;
			    }
			    int i_2604_;
			    if ((i_2604_
				 = (1 + i_2601_
				    - (((Class168_Sub2_Sub3) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_2602_)
				i_2602_ = i_2604_;
			    for (/**/; i_2602_ < 0; i_2602_++) {
				int i_2605_
				    = ((i_2601_ >> 12) * ((Class168_Sub2_Sub3)
							  this).anInt9920
				       + (i_2600_ >> 12));
				int i_2606_ = i_2599_++;
				if (i_2460_ == 0) {
				    if (i == 1)
					is[i_2606_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_2605_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_2607_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_2605_])
						 & 0xff)]);
					int i_2608_
					    = ((i_2607_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_2609_
					    = ((i_2607_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_2610_
					    = ((i_2607_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_2606_] = (i_2608_ | i_2609_
						       | i_2610_) >>> 8;
				    } else if (i == 3) {
					int i_2611_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_2605_])
						 & 0xff)]);
					int i_2612_ = anInt9931;
					int i_2613_ = i_2611_ + i_2612_;
					int i_2614_ = ((i_2611_ & 0xff00ff)
						       + (i_2612_ & 0xff00ff));
					int i_2615_ = ((i_2614_ & 0x1000100)
						       + (i_2613_ - i_2614_
							  & 0x10000));
					is[i_2606_]
					    = (i_2613_ - i_2615_
					       | i_2615_ - (i_2615_ >>> 8));
				    } else if (i == 2) {
					int i_2616_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_2605_])
						 & 0xff)]);
					int i_2617_
					    = ((i_2616_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_2618_
					    = ((i_2616_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_2606_] = ((i_2617_ | i_2618_)
						       >>> 8) + anInt9939;
				    } else
					throw new IllegalArgumentException();
				} else if (i_2460_ == 1) {
				    if (i == 1) {
					int i_2619_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2605_]);
					if (i_2619_ != 0)
					    is[i_2606_]
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2619_ & 0xff]);
				    } else if (i == 0) {
					int i_2620_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2605_]);
					if (i_2620_ != 0) {
					    int i_2621_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2620_ & 0xff]);
					    if ((anInt9931 & 0xffffff)
						== 16777215) {
						int i_2622_ = anInt9931 >>> 24;
						int i_2623_ = 256 - i_2622_;
						int i_2624_ = is[i_2606_];
						is[i_2606_]
						    = (((((i_2621_ & 0xff00ff)
							  * i_2622_)
							 + ((i_2624_
							     & 0xff00ff)
							    * i_2623_))
							& ~0xff00ff)
						       + ((((i_2621_ & 0xff00)
							    * i_2622_)
							   + ((i_2624_
							       & 0xff00)
							      * i_2623_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9932 != 255) {
						int i_2625_
						    = (((i_2621_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_2626_
						    = (((i_2621_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_2627_
						    = (((i_2621_ & 0xff)
							* anInt9936)
						       & 0xff00);
						i_2621_ = (i_2625_ | i_2626_
							   | i_2627_) >>> 8;
						int i_2628_ = is[i_2606_];
						is[i_2606_]
						    = (((((i_2621_ & 0xff00ff)
							  * anInt9932)
							 + ((i_2628_
							     & 0xff00ff)
							    * anInt9937))
							& ~0xff00ff)
						       + ((((i_2621_ & 0xff00)
							    * anInt9932)
							   + ((i_2628_
							       & 0xff00)
							      * anInt9937))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2629_
						    = (((i_2621_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_2630_
						    = (((i_2621_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_2631_
						    = (((i_2621_ & 0xff)
							* anInt9936)
						       & 0xff00);
						is[i_2606_]
						    = (i_2629_ | i_2630_
						       | i_2631_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2632_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2605_]);
					int i_2633_
					    = (i_2632_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_2632_])
					       : 0);
					int i_2634_ = anInt9931;
					int i_2635_ = i_2633_ + i_2634_;
					int i_2636_ = ((i_2633_ & 0xff00ff)
						       + (i_2634_ & 0xff00ff));
					int i_2637_ = ((i_2636_ & 0x1000100)
						       + (i_2635_ - i_2636_
							  & 0x10000));
					i_2637_
					    = (i_2635_ - i_2637_
					       | i_2637_ - (i_2637_ >>> 8));
					if (i_2633_ == 0 && anInt9932 != 255) {
					    i_2633_ = i_2637_;
					    i_2637_ = is[i_2606_];
					    i_2637_
						= (((((i_2633_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2637_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2633_ & 0xff00)
							* anInt9932)
						       + ((i_2637_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_2606_] = i_2637_;
				    } else if (i == 2) {
					int i_2638_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2605_]);
					if (i_2638_ != 0) {
					    int i_2639_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2638_ & 0xff]);
					    int i_2640_
						= (((i_2639_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_2641_ = (((i_2639_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    is[i_2606_++]
						= (((i_2640_ | i_2641_) >>> 8)
						   + anInt9939);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_2460_ == 2) {
				    if (i == 1) {
					int i_2642_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2605_]);
					if (i_2642_ != 0) {
					    int i_2643_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2642_ & 0xff]);
					    int i_2644_ = is[i_2606_];
					    int i_2645_ = i_2643_ + i_2644_;
					    int i_2646_
						= ((i_2643_ & 0xff00ff)
						   + (i_2644_ & 0xff00ff));
					    i_2644_ = ((i_2646_ & 0x1000100)
						       + (i_2645_ - i_2646_
							  & 0x10000));
					    is[i_2606_]
						= (i_2645_ - i_2644_
						   | i_2644_ - (i_2644_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2647_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2605_]);
					if (i_2647_ != 0) {
					    int i_2648_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2647_ & 0xff]);
					    int i_2649_
						= (((i_2648_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_2650_ = (((i_2648_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_2651_
						= ((i_2648_ & 0xff) * anInt9936
						   & 0xff00);
					    i_2648_ = (i_2649_ | i_2650_
						       | i_2651_) >>> 8;
					    int i_2652_ = is[i_2606_];
					    int i_2653_ = i_2648_ + i_2652_;
					    int i_2654_
						= ((i_2648_ & 0xff00ff)
						   + (i_2652_ & 0xff00ff));
					    i_2652_ = ((i_2654_ & 0x1000100)
						       + (i_2653_ - i_2654_
							  & 0x10000));
					    is[i_2606_]
						= (i_2653_ - i_2652_
						   | i_2652_ - (i_2652_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2655_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2605_]);
					int i_2656_
					    = (i_2655_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_2655_])
					       : 0);
					int i_2657_ = anInt9931;
					int i_2658_ = i_2656_ + i_2657_;
					int i_2659_ = ((i_2656_ & 0xff00ff)
						       + (i_2657_ & 0xff00ff));
					int i_2660_ = ((i_2659_ & 0x1000100)
						       + (i_2658_ - i_2659_
							  & 0x10000));
					i_2660_
					    = (i_2658_ - i_2660_
					       | i_2660_ - (i_2660_ >>> 8));
					if (i_2656_ == 0 && anInt9932 != 255) {
					    i_2656_ = i_2660_;
					    i_2660_ = is[i_2606_];
					    i_2660_
						= (((((i_2656_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2660_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2656_ & 0xff00)
							* anInt9932)
						       + ((i_2660_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_2606_] = i_2660_;
				    } else if (i == 2) {
					int i_2661_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2605_]);
					if (i_2661_ != 0) {
					    int i_2662_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2661_ & 0xff]);
					    int i_2663_
						= (((i_2662_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_2664_ = (((i_2662_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    i_2662_ = ((i_2663_ | i_2664_)
						       >>> 8) + anInt9939;
					    int i_2665_ = is[i_2606_];
					    int i_2666_ = i_2662_ + i_2665_;
					    int i_2667_
						= ((i_2662_ & 0xff00ff)
						   + (i_2665_ & 0xff00ff));
					    i_2665_ = ((i_2667_ & 0x1000100)
						       + (i_2666_ - i_2667_
							  & 0x10000));
					    is[i_2606_]
						= (i_2666_ - i_2665_
						   | i_2665_ - (i_2665_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_2601_ += anInt9922;
			    }
			}
			i_2598_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_2668_ = anInt9919;
		    while (i_2668_ < 0) {
			int i_2669_ = anInt9925;
			int i_2670_ = anInt9927 + anInt9929;
			int i_2671_ = anInt9928;
			int i_2672_ = anInt9906;
			if (i_2671_ >= 0
			    && i_2671_ - (((Class168_Sub2_Sub3) this).anInt9916
					  << 12) < 0) {
			    int i_2673_;
			    if ((i_2673_
				 = (i_2670_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)))
				>= 0) {
				i_2673_ = (anInt9921 - i_2673_) / anInt9921;
				i_2672_ += i_2673_;
				i_2670_ += anInt9921 * i_2673_;
				i_2669_ += i_2673_;
			    }
			    if ((i_2673_ = (i_2670_ - anInt9921) / anInt9921)
				> i_2672_)
				i_2672_ = i_2673_;
			    for (/**/; i_2672_ < 0; i_2672_++) {
				int i_2674_
				    = ((i_2671_ >> 12) * ((Class168_Sub2_Sub3)
							  this).anInt9920
				       + (i_2670_ >> 12));
				int i_2675_ = i_2669_++;
				if (i_2460_ == 0) {
				    if (i == 1)
					is[i_2675_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_2674_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_2676_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_2674_])
						 & 0xff)]);
					int i_2677_
					    = ((i_2676_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_2678_
					    = ((i_2676_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_2679_
					    = ((i_2676_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_2675_] = (i_2677_ | i_2678_
						       | i_2679_) >>> 8;
				    } else if (i == 3) {
					int i_2680_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_2674_])
						 & 0xff)]);
					int i_2681_ = anInt9931;
					int i_2682_ = i_2680_ + i_2681_;
					int i_2683_ = ((i_2680_ & 0xff00ff)
						       + (i_2681_ & 0xff00ff));
					int i_2684_ = ((i_2683_ & 0x1000100)
						       + (i_2682_ - i_2683_
							  & 0x10000));
					is[i_2675_]
					    = (i_2682_ - i_2684_
					       | i_2684_ - (i_2684_ >>> 8));
				    } else if (i == 2) {
					int i_2685_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_2674_])
						 & 0xff)]);
					int i_2686_
					    = ((i_2685_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_2687_
					    = ((i_2685_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_2675_] = ((i_2686_ | i_2687_)
						       >>> 8) + anInt9939;
				    } else
					throw new IllegalArgumentException();
				} else if (i_2460_ == 1) {
				    if (i == 1) {
					int i_2688_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2674_]);
					if (i_2688_ != 0)
					    is[i_2675_]
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2688_ & 0xff]);
				    } else if (i == 0) {
					int i_2689_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2674_]);
					if (i_2689_ != 0) {
					    int i_2690_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2689_ & 0xff]);
					    if ((anInt9931 & 0xffffff)
						== 16777215) {
						int i_2691_ = anInt9931 >>> 24;
						int i_2692_ = 256 - i_2691_;
						int i_2693_ = is[i_2675_];
						is[i_2675_]
						    = (((((i_2690_ & 0xff00ff)
							  * i_2691_)
							 + ((i_2693_
							     & 0xff00ff)
							    * i_2692_))
							& ~0xff00ff)
						       + ((((i_2690_ & 0xff00)
							    * i_2691_)
							   + ((i_2693_
							       & 0xff00)
							      * i_2692_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9932 != 255) {
						int i_2694_
						    = (((i_2690_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_2695_
						    = (((i_2690_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_2696_
						    = (((i_2690_ & 0xff)
							* anInt9936)
						       & 0xff00);
						i_2690_ = (i_2694_ | i_2695_
							   | i_2696_) >>> 8;
						int i_2697_ = is[i_2675_];
						is[i_2675_]
						    = (((((i_2690_ & 0xff00ff)
							  * anInt9932)
							 + ((i_2697_
							     & 0xff00ff)
							    * anInt9937))
							& ~0xff00ff)
						       + ((((i_2690_ & 0xff00)
							    * anInt9932)
							   + ((i_2697_
							       & 0xff00)
							      * anInt9937))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2698_
						    = (((i_2690_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_2699_
						    = (((i_2690_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_2700_
						    = (((i_2690_ & 0xff)
							* anInt9936)
						       & 0xff00);
						is[i_2675_]
						    = (i_2698_ | i_2699_
						       | i_2700_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2701_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2674_]);
					int i_2702_
					    = (i_2701_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_2701_])
					       : 0);
					int i_2703_ = anInt9931;
					int i_2704_ = i_2702_ + i_2703_;
					int i_2705_ = ((i_2702_ & 0xff00ff)
						       + (i_2703_ & 0xff00ff));
					int i_2706_ = ((i_2705_ & 0x1000100)
						       + (i_2704_ - i_2705_
							  & 0x10000));
					i_2706_
					    = (i_2704_ - i_2706_
					       | i_2706_ - (i_2706_ >>> 8));
					if (i_2702_ == 0 && anInt9932 != 255) {
					    i_2702_ = i_2706_;
					    i_2706_ = is[i_2675_];
					    i_2706_
						= (((((i_2702_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2706_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2702_ & 0xff00)
							* anInt9932)
						       + ((i_2706_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_2675_] = i_2706_;
				    } else if (i == 2) {
					int i_2707_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2674_]);
					if (i_2707_ != 0) {
					    int i_2708_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2707_ & 0xff]);
					    int i_2709_
						= (((i_2708_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_2710_ = (((i_2708_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    is[i_2675_++]
						= (((i_2709_ | i_2710_) >>> 8)
						   + anInt9939);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_2460_ == 2) {
				    if (i == 1) {
					int i_2711_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2674_]);
					if (i_2711_ != 0) {
					    int i_2712_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2711_ & 0xff]);
					    int i_2713_ = is[i_2675_];
					    int i_2714_ = i_2712_ + i_2713_;
					    int i_2715_
						= ((i_2712_ & 0xff00ff)
						   + (i_2713_ & 0xff00ff));
					    i_2713_ = ((i_2715_ & 0x1000100)
						       + (i_2714_ - i_2715_
							  & 0x10000));
					    is[i_2675_]
						= (i_2714_ - i_2713_
						   | i_2713_ - (i_2713_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2716_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2674_]);
					if (i_2716_ != 0) {
					    int i_2717_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2716_ & 0xff]);
					    int i_2718_
						= (((i_2717_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_2719_ = (((i_2717_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_2720_
						= ((i_2717_ & 0xff) * anInt9936
						   & 0xff00);
					    i_2717_ = (i_2718_ | i_2719_
						       | i_2720_) >>> 8;
					    int i_2721_ = is[i_2675_];
					    int i_2722_ = i_2717_ + i_2721_;
					    int i_2723_
						= ((i_2717_ & 0xff00ff)
						   + (i_2721_ & 0xff00ff));
					    i_2721_ = ((i_2723_ & 0x1000100)
						       + (i_2722_ - i_2723_
							  & 0x10000));
					    is[i_2675_]
						= (i_2722_ - i_2721_
						   | i_2721_ - (i_2721_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2724_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2674_]);
					int i_2725_
					    = (i_2724_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_2724_])
					       : 0);
					int i_2726_ = anInt9931;
					int i_2727_ = i_2725_ + i_2726_;
					int i_2728_ = ((i_2725_ & 0xff00ff)
						       + (i_2726_ & 0xff00ff));
					int i_2729_ = ((i_2728_ & 0x1000100)
						       + (i_2727_ - i_2728_
							  & 0x10000));
					i_2729_
					    = (i_2727_ - i_2729_
					       | i_2729_ - (i_2729_ >>> 8));
					if (i_2725_ == 0 && anInt9932 != 255) {
					    i_2725_ = i_2729_;
					    i_2729_ = is[i_2675_];
					    i_2729_
						= (((((i_2725_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2729_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2725_ & 0xff00)
							* anInt9932)
						       + ((i_2729_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_2675_] = i_2729_;
				    } else if (i == 2) {
					int i_2730_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2674_]);
					if (i_2730_ != 0) {
					    int i_2731_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_2730_ & 0xff]);
					    int i_2732_
						= (((i_2731_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_2733_ = (((i_2731_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    i_2731_ = ((i_2732_ | i_2733_)
						       >>> 8) + anInt9939;
					    int i_2734_ = is[i_2675_];
					    int i_2735_ = i_2731_ + i_2734_;
					    int i_2736_
						= ((i_2731_ & 0xff00ff)
						   + (i_2734_ & 0xff00ff));
					    i_2734_ = ((i_2736_ & 0x1000100)
						       + (i_2735_ - i_2736_
							  & 0x10000));
					    is[i_2675_]
						= (i_2735_ - i_2734_
						   | i_2734_ - (i_2734_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_2670_ += anInt9921;
			    }
			}
			i_2668_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_2737_ = anInt9919;
		    while (i_2737_ < 0) {
			int i_2738_ = anInt9925;
			int i_2739_ = anInt9927 + anInt9929;
			int i_2740_ = anInt9928 + anInt9930;
			int i_2741_ = anInt9906;
			int i_2742_;
			if ((i_2742_
			     = i_2739_ - (((Class168_Sub2_Sub3) this).anInt9920
					  << 12))
			    >= 0) {
			    i_2742_ = (anInt9921 - i_2742_) / anInt9921;
			    i_2741_ += i_2742_;
			    i_2739_ += anInt9921 * i_2742_;
			    i_2740_ += anInt9922 * i_2742_;
			    i_2738_ += i_2742_;
			}
			if ((i_2742_ = (i_2739_ - anInt9921) / anInt9921)
			    > i_2741_)
			    i_2741_ = i_2742_;
			if ((i_2742_
			     = i_2740_ - (((Class168_Sub2_Sub3) this).anInt9916
					  << 12))
			    >= 0) {
			    i_2742_ = (anInt9922 - i_2742_) / anInt9922;
			    i_2741_ += i_2742_;
			    i_2739_ += anInt9921 * i_2742_;
			    i_2740_ += anInt9922 * i_2742_;
			    i_2738_ += i_2742_;
			}
			if ((i_2742_ = (i_2740_ - anInt9922) / anInt9922)
			    > i_2741_)
			    i_2741_ = i_2742_;
			for (/**/; i_2741_ < 0; i_2741_++) {
			    int i_2743_
				= (((i_2740_ >> 12)
				    * ((Class168_Sub2_Sub3) this).anInt9920)
				   + (i_2739_ >> 12));
			    int i_2744_ = i_2738_++;
			    if (i_2460_ == 0) {
				if (i == 1)
				    is[i_2744_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2743_])
					     & 0xff)]);
				else if (i == 0) {
				    int i_2745_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2743_])
					     & 0xff)]);
				    int i_2746_
					= ((i_2745_ & 0xff0000) * anInt9934
					   & ~0xffffff);
				    int i_2747_
					= ((i_2745_ & 0xff00) * anInt9913
					   & 0xff0000);
				    int i_2748_ = ((i_2745_ & 0xff) * anInt9936
						   & 0xff00);
				    is[i_2744_]
					= (i_2746_ | i_2747_ | i_2748_) >>> 8;
				} else if (i == 3) {
				    int i_2749_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2743_])
					     & 0xff)]);
				    int i_2750_ = anInt9931;
				    int i_2751_ = i_2749_ + i_2750_;
				    int i_2752_ = ((i_2749_ & 0xff00ff)
						   + (i_2750_ & 0xff00ff));
				    int i_2753_
					= ((i_2752_ & 0x1000100)
					   + (i_2751_ - i_2752_ & 0x10000));
				    is[i_2744_]
					= (i_2751_ - i_2753_
					   | i_2753_ - (i_2753_ >>> 8));
				} else if (i == 2) {
				    int i_2754_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2743_])
					     & 0xff)]);
				    int i_2755_
					= ((i_2754_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_2756_
					= ((i_2754_ & 0xff00) * anInt9932
					   & 0xff0000);
				    is[i_2744_] = (((i_2755_ | i_2756_) >>> 8)
						   + anInt9939);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2460_ == 1) {
				if (i == 1) {
				    int i_2757_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2743_]);
				    if (i_2757_ != 0)
					is[i_2744_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2757_ & 0xff]);
				} else if (i == 0) {
				    int i_2758_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2743_]);
				    if (i_2758_ != 0) {
					int i_2759_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2758_ & 0xff]);
					if ((anInt9931 & 0xffffff)
					    == 16777215) {
					    int i_2760_ = anInt9931 >>> 24;
					    int i_2761_ = 256 - i_2760_;
					    int i_2762_ = is[i_2744_];
					    is[i_2744_]
						= (((((i_2759_ & 0xff00ff)
						      * i_2760_)
						     + ((i_2762_ & 0xff00ff)
							* i_2761_))
						    & ~0xff00ff)
						   + ((((i_2759_ & 0xff00)
							* i_2760_)
						       + ((i_2762_ & 0xff00)
							  * i_2761_))
						      & 0xff0000)) >> 8;
					} else if (anInt9932 != 255) {
					    int i_2763_
						= (((i_2759_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_2764_ = (((i_2759_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_2765_
						= ((i_2759_ & 0xff) * anInt9936
						   & 0xff00);
					    i_2759_ = (i_2763_ | i_2764_
						       | i_2765_) >>> 8;
					    int i_2766_ = is[i_2744_];
					    is[i_2744_]
						= (((((i_2759_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2766_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2759_ & 0xff00)
							* anInt9932)
						       + ((i_2766_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2767_
						= (((i_2759_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_2768_ = (((i_2759_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_2769_
						= ((i_2759_ & 0xff) * anInt9936
						   & 0xff00);
					    is[i_2744_] = (i_2767_ | i_2768_
							   | i_2769_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_2770_ = (((Class168_Sub2_Sub3) this)
						    .aByteArray11205[i_2743_]);
				    int i_2771_
					= (i_2770_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_2770_])
					   : 0);
				    int i_2772_ = anInt9931;
				    int i_2773_ = i_2771_ + i_2772_;
				    int i_2774_ = ((i_2771_ & 0xff00ff)
						   + (i_2772_ & 0xff00ff));
				    int i_2775_
					= ((i_2774_ & 0x1000100)
					   + (i_2773_ - i_2774_ & 0x10000));
				    i_2775_ = (i_2773_ - i_2775_
					       | i_2775_ - (i_2775_ >>> 8));
				    if (i_2771_ == 0 && anInt9932 != 255) {
					i_2771_ = i_2775_;
					i_2775_ = is[i_2744_];
					i_2775_ = (((((i_2771_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2775_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2771_ & 0xff00)
							* anInt9932)
						       + ((i_2775_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2744_] = i_2775_;
				} else if (i == 2) {
				    int i_2776_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2743_]);
				    if (i_2776_ != 0) {
					int i_2777_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2776_ & 0xff]);
					int i_2778_
					    = ((i_2777_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_2779_
					    = ((i_2777_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_2744_++] = ((i_2778_ | i_2779_)
							 >>> 8) + anInt9939;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2460_ == 2) {
				if (i == 1) {
				    int i_2780_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2743_]);
				    if (i_2780_ != 0) {
					int i_2781_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2780_ & 0xff]);
					int i_2782_ = is[i_2744_];
					int i_2783_ = i_2781_ + i_2782_;
					int i_2784_ = ((i_2781_ & 0xff00ff)
						       + (i_2782_ & 0xff00ff));
					i_2782_ = ((i_2784_ & 0x1000100)
						   + (i_2783_ - i_2784_
						      & 0x10000));
					is[i_2744_]
					    = (i_2783_ - i_2782_
					       | i_2782_ - (i_2782_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_2785_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2743_]);
				    if (i_2785_ != 0) {
					int i_2786_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2785_ & 0xff]);
					int i_2787_
					    = ((i_2786_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_2788_
					    = ((i_2786_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_2789_
					    = ((i_2786_ & 0xff) * anInt9936
					       & 0xff00);
					i_2786_ = (i_2787_ | i_2788_
						   | i_2789_) >>> 8;
					int i_2790_ = is[i_2744_];
					int i_2791_ = i_2786_ + i_2790_;
					int i_2792_ = ((i_2786_ & 0xff00ff)
						       + (i_2790_ & 0xff00ff));
					i_2790_ = ((i_2792_ & 0x1000100)
						   + (i_2791_ - i_2792_
						      & 0x10000));
					is[i_2744_]
					    = (i_2791_ - i_2790_
					       | i_2790_ - (i_2790_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_2793_ = (((Class168_Sub2_Sub3) this)
						    .aByteArray11205[i_2743_]);
				    int i_2794_
					= (i_2793_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_2793_])
					   : 0);
				    int i_2795_ = anInt9931;
				    int i_2796_ = i_2794_ + i_2795_;
				    int i_2797_ = ((i_2794_ & 0xff00ff)
						   + (i_2795_ & 0xff00ff));
				    int i_2798_
					= ((i_2797_ & 0x1000100)
					   + (i_2796_ - i_2797_ & 0x10000));
				    i_2798_ = (i_2796_ - i_2798_
					       | i_2798_ - (i_2798_ >>> 8));
				    if (i_2794_ == 0 && anInt9932 != 255) {
					i_2794_ = i_2798_;
					i_2798_ = is[i_2744_];
					i_2798_ = (((((i_2794_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2798_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2794_ & 0xff00)
							* anInt9932)
						       + ((i_2798_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2744_] = i_2798_;
				} else if (i == 2) {
				    int i_2799_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2743_]);
				    if (i_2799_ != 0) {
					int i_2800_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2799_ & 0xff]);
					int i_2801_
					    = ((i_2800_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_2802_
					    = ((i_2800_ & 0xff00) * anInt9932
					       & 0xff0000);
					i_2800_ = (((i_2801_ | i_2802_) >>> 8)
						   + anInt9939);
					int i_2803_ = is[i_2744_];
					int i_2804_ = i_2800_ + i_2803_;
					int i_2805_ = ((i_2800_ & 0xff00ff)
						       + (i_2803_ & 0xff00ff));
					i_2803_ = ((i_2805_ & 0x1000100)
						   + (i_2804_ - i_2805_
						      & 0x10000));
					is[i_2744_]
					    = (i_2804_ - i_2803_
					       | i_2803_ - (i_2803_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_2739_ += anInt9921;
			    i_2740_ += anInt9922;
			}
			i_2737_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_2806_ = anInt9919;
		    while (i_2806_ < 0) {
			int i_2807_ = anInt9925;
			int i_2808_ = anInt9927 + anInt9929;
			int i_2809_ = anInt9928 + anInt9930;
			int i_2810_ = anInt9906;
			int i_2811_;
			if ((i_2811_
			     = i_2808_ - (((Class168_Sub2_Sub3) this).anInt9920
					  << 12))
			    >= 0) {
			    i_2811_ = (anInt9921 - i_2811_) / anInt9921;
			    i_2810_ += i_2811_;
			    i_2808_ += anInt9921 * i_2811_;
			    i_2809_ += anInt9922 * i_2811_;
			    i_2807_ += i_2811_;
			}
			if ((i_2811_ = (i_2808_ - anInt9921) / anInt9921)
			    > i_2810_)
			    i_2810_ = i_2811_;
			if (i_2809_ < 0) {
			    i_2811_ = (anInt9922 - 1 - i_2809_) / anInt9922;
			    i_2810_ += i_2811_;
			    i_2808_ += anInt9921 * i_2811_;
			    i_2809_ += anInt9922 * i_2811_;
			    i_2807_ += i_2811_;
			}
			if ((i_2811_
			     = (1 + i_2809_
				- (((Class168_Sub2_Sub3) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_2810_)
			    i_2810_ = i_2811_;
			for (/**/; i_2810_ < 0; i_2810_++) {
			    int i_2812_
				= (((i_2809_ >> 12)
				    * ((Class168_Sub2_Sub3) this).anInt9920)
				   + (i_2808_ >> 12));
			    int i_2813_ = i_2807_++;
			    if (i_2460_ == 0) {
				if (i == 1)
				    is[i_2813_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2812_])
					     & 0xff)]);
				else if (i == 0) {
				    int i_2814_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2812_])
					     & 0xff)]);
				    int i_2815_
					= ((i_2814_ & 0xff0000) * anInt9934
					   & ~0xffffff);
				    int i_2816_
					= ((i_2814_ & 0xff00) * anInt9913
					   & 0xff0000);
				    int i_2817_ = ((i_2814_ & 0xff) * anInt9936
						   & 0xff00);
				    is[i_2813_]
					= (i_2815_ | i_2816_ | i_2817_) >>> 8;
				} else if (i == 3) {
				    int i_2818_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2812_])
					     & 0xff)]);
				    int i_2819_ = anInt9931;
				    int i_2820_ = i_2818_ + i_2819_;
				    int i_2821_ = ((i_2818_ & 0xff00ff)
						   + (i_2819_ & 0xff00ff));
				    int i_2822_
					= ((i_2821_ & 0x1000100)
					   + (i_2820_ - i_2821_ & 0x10000));
				    is[i_2813_]
					= (i_2820_ - i_2822_
					   | i_2822_ - (i_2822_ >>> 8));
				} else if (i == 2) {
				    int i_2823_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2812_])
					     & 0xff)]);
				    int i_2824_
					= ((i_2823_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_2825_
					= ((i_2823_ & 0xff00) * anInt9932
					   & 0xff0000);
				    is[i_2813_] = (((i_2824_ | i_2825_) >>> 8)
						   + anInt9939);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2460_ == 1) {
				if (i == 1) {
				    int i_2826_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2812_]);
				    if (i_2826_ != 0)
					is[i_2813_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2826_ & 0xff]);
				} else if (i == 0) {
				    int i_2827_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2812_]);
				    if (i_2827_ != 0) {
					int i_2828_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2827_ & 0xff]);
					if ((anInt9931 & 0xffffff)
					    == 16777215) {
					    int i_2829_ = anInt9931 >>> 24;
					    int i_2830_ = 256 - i_2829_;
					    int i_2831_ = is[i_2813_];
					    is[i_2813_]
						= (((((i_2828_ & 0xff00ff)
						      * i_2829_)
						     + ((i_2831_ & 0xff00ff)
							* i_2830_))
						    & ~0xff00ff)
						   + ((((i_2828_ & 0xff00)
							* i_2829_)
						       + ((i_2831_ & 0xff00)
							  * i_2830_))
						      & 0xff0000)) >> 8;
					} else if (anInt9932 != 255) {
					    int i_2832_
						= (((i_2828_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_2833_ = (((i_2828_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_2834_
						= ((i_2828_ & 0xff) * anInt9936
						   & 0xff00);
					    i_2828_ = (i_2832_ | i_2833_
						       | i_2834_) >>> 8;
					    int i_2835_ = is[i_2813_];
					    is[i_2813_]
						= (((((i_2828_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2835_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2828_ & 0xff00)
							* anInt9932)
						       + ((i_2835_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2836_
						= (((i_2828_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_2837_ = (((i_2828_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_2838_
						= ((i_2828_ & 0xff) * anInt9936
						   & 0xff00);
					    is[i_2813_] = (i_2836_ | i_2837_
							   | i_2838_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_2839_ = (((Class168_Sub2_Sub3) this)
						    .aByteArray11205[i_2812_]);
				    int i_2840_
					= (i_2839_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_2839_])
					   : 0);
				    int i_2841_ = anInt9931;
				    int i_2842_ = i_2840_ + i_2841_;
				    int i_2843_ = ((i_2840_ & 0xff00ff)
						   + (i_2841_ & 0xff00ff));
				    int i_2844_
					= ((i_2843_ & 0x1000100)
					   + (i_2842_ - i_2843_ & 0x10000));
				    i_2844_ = (i_2842_ - i_2844_
					       | i_2844_ - (i_2844_ >>> 8));
				    if (i_2840_ == 0 && anInt9932 != 255) {
					i_2840_ = i_2844_;
					i_2844_ = is[i_2813_];
					i_2844_ = (((((i_2840_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2844_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2840_ & 0xff00)
							* anInt9932)
						       + ((i_2844_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2813_] = i_2844_;
				} else if (i == 2) {
				    int i_2845_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2812_]);
				    if (i_2845_ != 0) {
					int i_2846_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2845_ & 0xff]);
					int i_2847_
					    = ((i_2846_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_2848_
					    = ((i_2846_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_2813_++] = ((i_2847_ | i_2848_)
							 >>> 8) + anInt9939;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2460_ == 2) {
				if (i == 1) {
				    int i_2849_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2812_]);
				    if (i_2849_ != 0) {
					int i_2850_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2849_ & 0xff]);
					int i_2851_ = is[i_2813_];
					int i_2852_ = i_2850_ + i_2851_;
					int i_2853_ = ((i_2850_ & 0xff00ff)
						       + (i_2851_ & 0xff00ff));
					i_2851_ = ((i_2853_ & 0x1000100)
						   + (i_2852_ - i_2853_
						      & 0x10000));
					is[i_2813_]
					    = (i_2852_ - i_2851_
					       | i_2851_ - (i_2851_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_2854_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2812_]);
				    if (i_2854_ != 0) {
					int i_2855_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2854_ & 0xff]);
					int i_2856_
					    = ((i_2855_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_2857_
					    = ((i_2855_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_2858_
					    = ((i_2855_ & 0xff) * anInt9936
					       & 0xff00);
					i_2855_ = (i_2856_ | i_2857_
						   | i_2858_) >>> 8;
					int i_2859_ = is[i_2813_];
					int i_2860_ = i_2855_ + i_2859_;
					int i_2861_ = ((i_2855_ & 0xff00ff)
						       + (i_2859_ & 0xff00ff));
					i_2859_ = ((i_2861_ & 0x1000100)
						   + (i_2860_ - i_2861_
						      & 0x10000));
					is[i_2813_]
					    = (i_2860_ - i_2859_
					       | i_2859_ - (i_2859_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_2862_ = (((Class168_Sub2_Sub3) this)
						    .aByteArray11205[i_2812_]);
				    int i_2863_
					= (i_2862_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_2862_])
					   : 0);
				    int i_2864_ = anInt9931;
				    int i_2865_ = i_2863_ + i_2864_;
				    int i_2866_ = ((i_2863_ & 0xff00ff)
						   + (i_2864_ & 0xff00ff));
				    int i_2867_
					= ((i_2866_ & 0x1000100)
					   + (i_2865_ - i_2866_ & 0x10000));
				    i_2867_ = (i_2865_ - i_2867_
					       | i_2867_ - (i_2867_ >>> 8));
				    if (i_2863_ == 0 && anInt9932 != 255) {
					i_2863_ = i_2867_;
					i_2867_ = is[i_2813_];
					i_2867_ = (((((i_2863_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2867_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2863_ & 0xff00)
							* anInt9932)
						       + ((i_2867_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2813_] = i_2867_;
				} else if (i == 2) {
				    int i_2868_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2812_]);
				    if (i_2868_ != 0) {
					int i_2869_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2868_ & 0xff]);
					int i_2870_
					    = ((i_2869_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_2871_
					    = ((i_2869_ & 0xff00) * anInt9932
					       & 0xff0000);
					i_2869_ = (((i_2870_ | i_2871_) >>> 8)
						   + anInt9939);
					int i_2872_ = is[i_2813_];
					int i_2873_ = i_2869_ + i_2872_;
					int i_2874_ = ((i_2869_ & 0xff00ff)
						       + (i_2872_ & 0xff00ff));
					i_2872_ = ((i_2874_ & 0x1000100)
						   + (i_2873_ - i_2874_
						      & 0x10000));
					is[i_2813_]
					    = (i_2873_ - i_2872_
					       | i_2872_ - (i_2872_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_2808_ += anInt9921;
			    i_2809_ += anInt9922;
			}
			i_2806_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_2875_ = anInt9919;
		while (i_2875_ < 0) {
		    int i_2876_ = anInt9925;
		    int i_2877_ = anInt9927 + anInt9929;
		    int i_2878_ = anInt9928;
		    int i_2879_ = anInt9906;
		    if (i_2878_ >= 0
			&& i_2878_ - (((Class168_Sub2_Sub3) this).anInt9916
				      << 12) < 0) {
			if (i_2877_ < 0) {
			    int i_2880_
				= (anInt9921 - 1 - i_2877_) / anInt9921;
			    i_2879_ += i_2880_;
			    i_2877_ += anInt9921 * i_2880_;
			    i_2876_ += i_2880_;
			}
			int i_2881_;
			if ((i_2881_
			     = (1 + i_2877_
				- (((Class168_Sub2_Sub3) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_2879_)
			    i_2879_ = i_2881_;
			for (/**/; i_2879_ < 0; i_2879_++) {
			    int i_2882_
				= (((i_2878_ >> 12)
				    * ((Class168_Sub2_Sub3) this).anInt9920)
				   + (i_2877_ >> 12));
			    int i_2883_ = i_2876_++;
			    if (i_2460_ == 0) {
				if (i == 1)
				    is[i_2883_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2882_])
					     & 0xff)]);
				else if (i == 0) {
				    int i_2884_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2882_])
					     & 0xff)]);
				    int i_2885_
					= ((i_2884_ & 0xff0000) * anInt9934
					   & ~0xffffff);
				    int i_2886_
					= ((i_2884_ & 0xff00) * anInt9913
					   & 0xff0000);
				    int i_2887_ = ((i_2884_ & 0xff) * anInt9936
						   & 0xff00);
				    is[i_2883_]
					= (i_2885_ | i_2886_ | i_2887_) >>> 8;
				} else if (i == 3) {
				    int i_2888_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2882_])
					     & 0xff)]);
				    int i_2889_ = anInt9931;
				    int i_2890_ = i_2888_ + i_2889_;
				    int i_2891_ = ((i_2888_ & 0xff00ff)
						   + (i_2889_ & 0xff00ff));
				    int i_2892_
					= ((i_2891_ & 0x1000100)
					   + (i_2890_ - i_2891_ & 0x10000));
				    is[i_2883_]
					= (i_2890_ - i_2892_
					   | i_2892_ - (i_2892_ >>> 8));
				} else if (i == 2) {
				    int i_2893_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_2882_])
					     & 0xff)]);
				    int i_2894_
					= ((i_2893_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_2895_
					= ((i_2893_ & 0xff00) * anInt9932
					   & 0xff0000);
				    is[i_2883_] = (((i_2894_ | i_2895_) >>> 8)
						   + anInt9939);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2460_ == 1) {
				if (i == 1) {
				    int i_2896_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2882_]);
				    if (i_2896_ != 0)
					is[i_2883_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2896_ & 0xff]);
				} else if (i == 0) {
				    int i_2897_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2882_]);
				    if (i_2897_ != 0) {
					int i_2898_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2897_ & 0xff]);
					if ((anInt9931 & 0xffffff)
					    == 16777215) {
					    int i_2899_ = anInt9931 >>> 24;
					    int i_2900_ = 256 - i_2899_;
					    int i_2901_ = is[i_2883_];
					    is[i_2883_]
						= (((((i_2898_ & 0xff00ff)
						      * i_2899_)
						     + ((i_2901_ & 0xff00ff)
							* i_2900_))
						    & ~0xff00ff)
						   + ((((i_2898_ & 0xff00)
							* i_2899_)
						       + ((i_2901_ & 0xff00)
							  * i_2900_))
						      & 0xff0000)) >> 8;
					} else if (anInt9932 != 255) {
					    int i_2902_
						= (((i_2898_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_2903_ = (((i_2898_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_2904_
						= ((i_2898_ & 0xff) * anInt9936
						   & 0xff00);
					    i_2898_ = (i_2902_ | i_2903_
						       | i_2904_) >>> 8;
					    int i_2905_ = is[i_2883_];
					    is[i_2883_]
						= (((((i_2898_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2905_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2898_ & 0xff00)
							* anInt9932)
						       + ((i_2905_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2906_
						= (((i_2898_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_2907_ = (((i_2898_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_2908_
						= ((i_2898_ & 0xff) * anInt9936
						   & 0xff00);
					    is[i_2883_] = (i_2906_ | i_2907_
							   | i_2908_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_2909_ = (((Class168_Sub2_Sub3) this)
						    .aByteArray11205[i_2882_]);
				    int i_2910_
					= (i_2909_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_2909_])
					   : 0);
				    int i_2911_ = anInt9931;
				    int i_2912_ = i_2910_ + i_2911_;
				    int i_2913_ = ((i_2910_ & 0xff00ff)
						   + (i_2911_ & 0xff00ff));
				    int i_2914_
					= ((i_2913_ & 0x1000100)
					   + (i_2912_ - i_2913_ & 0x10000));
				    i_2914_ = (i_2912_ - i_2914_
					       | i_2914_ - (i_2914_ >>> 8));
				    if (i_2910_ == 0 && anInt9932 != 255) {
					i_2910_ = i_2914_;
					i_2914_ = is[i_2883_];
					i_2914_ = (((((i_2910_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2914_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2910_ & 0xff00)
							* anInt9932)
						       + ((i_2914_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2883_] = i_2914_;
				} else if (i == 2) {
				    int i_2915_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2882_]);
				    if (i_2915_ != 0) {
					int i_2916_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2915_ & 0xff]);
					int i_2917_
					    = ((i_2916_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_2918_
					    = ((i_2916_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_2883_++] = ((i_2917_ | i_2918_)
							 >>> 8) + anInt9939;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2460_ == 2) {
				if (i == 1) {
				    int i_2919_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2882_]);
				    if (i_2919_ != 0) {
					int i_2920_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2919_ & 0xff]);
					int i_2921_ = is[i_2883_];
					int i_2922_ = i_2920_ + i_2921_;
					int i_2923_ = ((i_2920_ & 0xff00ff)
						       + (i_2921_ & 0xff00ff));
					i_2921_ = ((i_2923_ & 0x1000100)
						   + (i_2922_ - i_2923_
						      & 0x10000));
					is[i_2883_]
					    = (i_2922_ - i_2921_
					       | i_2921_ - (i_2921_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_2924_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2882_]);
				    if (i_2924_ != 0) {
					int i_2925_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2924_ & 0xff]);
					int i_2926_
					    = ((i_2925_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_2927_
					    = ((i_2925_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_2928_
					    = ((i_2925_ & 0xff) * anInt9936
					       & 0xff00);
					i_2925_ = (i_2926_ | i_2927_
						   | i_2928_) >>> 8;
					int i_2929_ = is[i_2883_];
					int i_2930_ = i_2925_ + i_2929_;
					int i_2931_ = ((i_2925_ & 0xff00ff)
						       + (i_2929_ & 0xff00ff));
					i_2929_ = ((i_2931_ & 0x1000100)
						   + (i_2930_ - i_2931_
						      & 0x10000));
					is[i_2883_]
					    = (i_2930_ - i_2929_
					       | i_2929_ - (i_2929_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_2932_ = (((Class168_Sub2_Sub3) this)
						    .aByteArray11205[i_2882_]);
				    int i_2933_
					= (i_2932_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_2932_])
					   : 0);
				    int i_2934_ = anInt9931;
				    int i_2935_ = i_2933_ + i_2934_;
				    int i_2936_ = ((i_2933_ & 0xff00ff)
						   + (i_2934_ & 0xff00ff));
				    int i_2937_
					= ((i_2936_ & 0x1000100)
					   + (i_2935_ - i_2936_ & 0x10000));
				    i_2937_ = (i_2935_ - i_2937_
					       | i_2937_ - (i_2937_ >>> 8));
				    if (i_2933_ == 0 && anInt9932 != 255) {
					i_2933_ = i_2937_;
					i_2937_ = is[i_2883_];
					i_2937_ = (((((i_2933_ & 0xff00ff)
						      * anInt9932)
						     + ((i_2937_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_2933_ & 0xff00)
							* anInt9932)
						       + ((i_2937_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2883_] = i_2937_;
				} else if (i == 2) {
				    int i_2938_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_2882_]);
				    if (i_2938_ != 0) {
					int i_2939_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_2938_ & 0xff]);
					int i_2940_
					    = ((i_2939_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_2941_
					    = ((i_2939_ & 0xff00) * anInt9932
					       & 0xff0000);
					i_2939_ = (((i_2940_ | i_2941_) >>> 8)
						   + anInt9939);
					int i_2942_ = is[i_2883_];
					int i_2943_ = i_2939_ + i_2942_;
					int i_2944_ = ((i_2939_ & 0xff00ff)
						       + (i_2942_ & 0xff00ff));
					i_2942_ = ((i_2944_ & 0x1000100)
						   + (i_2943_ - i_2944_
						      & 0x10000));
					is[i_2883_]
					    = (i_2943_ - i_2942_
					       | i_2942_ - (i_2942_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_2877_ += anInt9921;
			}
		    }
		    i_2875_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		for (int i_2945_ = anInt9919; i_2945_ < 0; i_2945_++) {
		    int i_2946_ = anInt9925;
		    int i_2947_ = anInt9927 + anInt9929;
		    int i_2948_ = anInt9928 + anInt9930;
		    int i_2949_ = anInt9906;
		    if (i_2947_ < 0) {
			int i_2950_ = (anInt9921 - 1 - i_2947_) / anInt9921;
			i_2949_ += i_2950_;
			i_2947_ += anInt9921 * i_2950_;
			i_2948_ += anInt9922 * i_2950_;
			i_2946_ += i_2950_;
		    }
		    int i_2951_;
		    if ((i_2951_
			 = (1 + i_2947_
			    - (((Class168_Sub2_Sub3) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_2949_)
			i_2949_ = i_2951_;
		    if ((i_2951_
			 = i_2948_ - (((Class168_Sub2_Sub3) this).anInt9916
				      << 12))
			>= 0) {
			i_2951_ = (anInt9922 - i_2951_) / anInt9922;
			i_2949_ += i_2951_;
			i_2947_ += anInt9921 * i_2951_;
			i_2948_ += anInt9922 * i_2951_;
			i_2946_ += i_2951_;
		    }
		    if ((i_2951_ = (i_2948_ - anInt9922) / anInt9922)
			> i_2949_)
			i_2949_ = i_2951_;
		    for (/**/; i_2949_ < 0; i_2949_++) {
			int i_2952_
			    = (((i_2948_ >> 12)
				* ((Class168_Sub2_Sub3) this).anInt9920)
			       + (i_2947_ >> 12));
			int i_2953_ = i_2946_++;
			if (i_2460_ == 0) {
			    if (i == 1)
				is[i_2953_]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_2952_]) & 0xff]);
			    else if (i == 0) {
				int i_2954_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_2952_]) & 0xff]);
				int i_2955_ = ((i_2954_ & 0xff0000) * anInt9934
					       & ~0xffffff);
				int i_2956_ = ((i_2954_ & 0xff00) * anInt9913
					       & 0xff0000);
				int i_2957_
				    = (i_2954_ & 0xff) * anInt9936 & 0xff00;
				is[i_2953_]
				    = (i_2955_ | i_2956_ | i_2957_) >>> 8;
			    } else if (i == 3) {
				int i_2958_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_2952_]) & 0xff]);
				int i_2959_ = anInt9931;
				int i_2960_ = i_2958_ + i_2959_;
				int i_2961_ = ((i_2958_ & 0xff00ff)
					       + (i_2959_ & 0xff00ff));
				int i_2962_
				    = ((i_2961_ & 0x1000100)
				       + (i_2960_ - i_2961_ & 0x10000));
				is[i_2953_]
				    = i_2960_ - i_2962_ | i_2962_ - (i_2962_
								     >>> 8);
			    } else if (i == 2) {
				int i_2963_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_2952_]) & 0xff]);
				int i_2964_ = ((i_2963_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
				int i_2965_ = ((i_2963_ & 0xff00) * anInt9932
					       & 0xff0000);
				is[i_2953_]
				    = ((i_2964_ | i_2965_) >>> 8) + anInt9939;
			    } else
				throw new IllegalArgumentException();
			} else if (i_2460_ == 1) {
			    if (i == 1) {
				int i_2966_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2952_]);
				if (i_2966_ != 0)
				    is[i_2953_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_2966_ & 0xff]);
			    } else if (i == 0) {
				int i_2967_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2952_]);
				if (i_2967_ != 0) {
				    int i_2968_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_2967_ & 0xff]);
				    if ((anInt9931 & 0xffffff) == 16777215) {
					int i_2969_ = anInt9931 >>> 24;
					int i_2970_ = 256 - i_2969_;
					int i_2971_ = is[i_2953_];
					is[i_2953_]
					    = ((((i_2968_ & 0xff00ff) * i_2969_
						 + ((i_2971_ & 0xff00ff)
						    * i_2970_))
						& ~0xff00ff)
					       + (((i_2968_ & 0xff00) * i_2969_
						   + ((i_2971_ & 0xff00)
						      * i_2970_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9932 != 255) {
					int i_2972_
					    = ((i_2968_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_2973_
					    = ((i_2968_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_2974_
					    = ((i_2968_ & 0xff) * anInt9936
					       & 0xff00);
					i_2968_ = (i_2972_ | i_2973_
						   | i_2974_) >>> 8;
					int i_2975_ = is[i_2953_];
					is[i_2953_]
					    = (((((i_2968_ & 0xff00ff)
						  * anInt9932)
						 + ((i_2975_ & 0xff00ff)
						    * anInt9937))
						& ~0xff00ff)
					       + ((((i_2968_ & 0xff00)
						    * anInt9932)
						   + ((i_2975_ & 0xff00)
						      * anInt9937))
						  & 0xff0000)) >> 8;
				    } else {
					int i_2976_
					    = ((i_2968_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_2977_
					    = ((i_2968_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_2978_
					    = ((i_2968_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_2953_] = (i_2976_ | i_2977_
						       | i_2978_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_2979_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205[i_2952_]);
				int i_2980_ = (i_2979_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_2979_])
					       : 0);
				int i_2981_ = anInt9931;
				int i_2982_ = i_2980_ + i_2981_;
				int i_2983_ = ((i_2980_ & 0xff00ff)
					       + (i_2981_ & 0xff00ff));
				int i_2984_
				    = ((i_2983_ & 0x1000100)
				       + (i_2982_ - i_2983_ & 0x10000));
				i_2984_
				    = i_2982_ - i_2984_ | i_2984_ - (i_2984_
								     >>> 8);
				if (i_2980_ == 0 && anInt9932 != 255) {
				    i_2980_ = i_2984_;
				    i_2984_ = is[i_2953_];
				    i_2984_
					= ((((i_2980_ & 0xff00ff) * anInt9932
					     + ((i_2984_ & 0xff00ff)
						* anInt9937))
					    & ~0xff00ff)
					   + (((i_2980_ & 0xff00) * anInt9932
					       + ((i_2984_ & 0xff00)
						  * anInt9937))
					      & 0xff0000)) >> 8;
				}
				is[i_2953_] = i_2984_;
			    } else if (i == 2) {
				int i_2985_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2952_]);
				if (i_2985_ != 0) {
				    int i_2986_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_2985_ & 0xff]);
				    int i_2987_
					= ((i_2986_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_2988_
					= ((i_2986_ & 0xff00) * anInt9932
					   & 0xff0000);
				    is[i_2953_++] = ((i_2987_ | i_2988_)
						     >>> 8) + anInt9939;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_2460_ == 2) {
			    if (i == 1) {
				int i_2989_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2952_]);
				if (i_2989_ != 0) {
				    int i_2990_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_2989_ & 0xff]);
				    int i_2991_ = is[i_2953_];
				    int i_2992_ = i_2990_ + i_2991_;
				    int i_2993_ = ((i_2990_ & 0xff00ff)
						   + (i_2991_ & 0xff00ff));
				    i_2991_
					= ((i_2993_ & 0x1000100)
					   + (i_2992_ - i_2993_ & 0x10000));
				    is[i_2953_]
					= (i_2992_ - i_2991_
					   | i_2991_ - (i_2991_ >>> 8));
				}
			    } else if (i == 0) {
				int i_2994_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2952_]);
				if (i_2994_ != 0) {
				    int i_2995_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_2994_ & 0xff]);
				    int i_2996_
					= ((i_2995_ & 0xff0000) * anInt9934
					   & ~0xffffff);
				    int i_2997_
					= ((i_2995_ & 0xff00) * anInt9913
					   & 0xff0000);
				    int i_2998_ = ((i_2995_ & 0xff) * anInt9936
						   & 0xff00);
				    i_2995_
					= (i_2996_ | i_2997_ | i_2998_) >>> 8;
				    int i_2999_ = is[i_2953_];
				    int i_3000_ = i_2995_ + i_2999_;
				    int i_3001_ = ((i_2995_ & 0xff00ff)
						   + (i_2999_ & 0xff00ff));
				    i_2999_
					= ((i_3001_ & 0x1000100)
					   + (i_3000_ - i_3001_ & 0x10000));
				    is[i_2953_]
					= (i_3000_ - i_2999_
					   | i_2999_ - (i_2999_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_3002_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205[i_2952_]);
				int i_3003_ = (i_3002_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_3002_])
					       : 0);
				int i_3004_ = anInt9931;
				int i_3005_ = i_3003_ + i_3004_;
				int i_3006_ = ((i_3003_ & 0xff00ff)
					       + (i_3004_ & 0xff00ff));
				int i_3007_
				    = ((i_3006_ & 0x1000100)
				       + (i_3005_ - i_3006_ & 0x10000));
				i_3007_
				    = i_3005_ - i_3007_ | i_3007_ - (i_3007_
								     >>> 8);
				if (i_3003_ == 0 && anInt9932 != 255) {
				    i_3003_ = i_3007_;
				    i_3007_ = is[i_2953_];
				    i_3007_
					= ((((i_3003_ & 0xff00ff) * anInt9932
					     + ((i_3007_ & 0xff00ff)
						* anInt9937))
					    & ~0xff00ff)
					   + (((i_3003_ & 0xff00) * anInt9932
					       + ((i_3007_ & 0xff00)
						  * anInt9937))
					      & 0xff0000)) >> 8;
				}
				is[i_2953_] = i_3007_;
			    } else if (i == 2) {
				int i_3008_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_2952_]);
				if (i_3008_ != 0) {
				    int i_3009_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3008_ & 0xff]);
				    int i_3010_
					= ((i_3009_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_3011_
					= ((i_3009_ & 0xff00) * anInt9932
					   & 0xff0000);
				    i_3009_ = (((i_3010_ | i_3011_) >>> 8)
					       + anInt9939);
				    int i_3012_ = is[i_2953_];
				    int i_3013_ = i_3009_ + i_3012_;
				    int i_3014_ = ((i_3009_ & 0xff00ff)
						   + (i_3012_ & 0xff00ff));
				    i_3012_
					= ((i_3014_ & 0x1000100)
					   + (i_3013_ - i_3014_ & 0x10000));
				    is[i_2953_]
					= (i_3013_ - i_3012_
					   | i_3012_ - (i_3012_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_2947_ += anInt9921;
			i_2948_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		for (int i_3015_ = anInt9919; i_3015_ < 0; i_3015_++) {
		    int i_3016_ = anInt9925;
		    int i_3017_ = anInt9927 + anInt9929;
		    int i_3018_ = anInt9928 + anInt9930;
		    int i_3019_ = anInt9906;
		    if (i_3017_ < 0) {
			int i_3020_ = (anInt9921 - 1 - i_3017_) / anInt9921;
			i_3019_ += i_3020_;
			i_3017_ += anInt9921 * i_3020_;
			i_3018_ += anInt9922 * i_3020_;
			i_3016_ += i_3020_;
		    }
		    int i_3021_;
		    if ((i_3021_
			 = (1 + i_3017_
			    - (((Class168_Sub2_Sub3) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_3019_)
			i_3019_ = i_3021_;
		    if (i_3018_ < 0) {
			i_3021_ = (anInt9922 - 1 - i_3018_) / anInt9922;
			i_3019_ += i_3021_;
			i_3017_ += anInt9921 * i_3021_;
			i_3018_ += anInt9922 * i_3021_;
			i_3016_ += i_3021_;
		    }
		    if ((i_3021_
			 = (1 + i_3018_
			    - (((Class168_Sub2_Sub3) this).anInt9916 << 12)
			    - anInt9922) / anInt9922)
			> i_3019_)
			i_3019_ = i_3021_;
		    for (/**/; i_3019_ < 0; i_3019_++) {
			int i_3022_
			    = (((i_3018_ >> 12)
				* ((Class168_Sub2_Sub3) this).anInt9920)
			       + (i_3017_ >> 12));
			int i_3023_ = i_3016_++;
			if (i_2460_ == 0) {
			    if (i == 1)
				is[i_3023_]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_3022_]) & 0xff]);
			    else if (i == 0) {
				int i_3024_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_3022_]) & 0xff]);
				int i_3025_ = ((i_3024_ & 0xff0000) * anInt9934
					       & ~0xffffff);
				int i_3026_ = ((i_3024_ & 0xff00) * anInt9913
					       & 0xff0000);
				int i_3027_
				    = (i_3024_ & 0xff) * anInt9936 & 0xff00;
				is[i_3023_]
				    = (i_3025_ | i_3026_ | i_3027_) >>> 8;
			    } else if (i == 3) {
				int i_3028_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_3022_]) & 0xff]);
				int i_3029_ = anInt9931;
				int i_3030_ = i_3028_ + i_3029_;
				int i_3031_ = ((i_3028_ & 0xff00ff)
					       + (i_3029_ & 0xff00ff));
				int i_3032_
				    = ((i_3031_ & 0x1000100)
				       + (i_3030_ - i_3031_ & 0x10000));
				is[i_3023_]
				    = i_3030_ - i_3032_ | i_3032_ - (i_3032_
								     >>> 8);
			    } else if (i == 2) {
				int i_3033_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_3022_]) & 0xff]);
				int i_3034_ = ((i_3033_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
				int i_3035_ = ((i_3033_ & 0xff00) * anInt9932
					       & 0xff0000);
				is[i_3023_]
				    = ((i_3034_ | i_3035_) >>> 8) + anInt9939;
			    } else
				throw new IllegalArgumentException();
			} else if (i_2460_ == 1) {
			    if (i == 1) {
				int i_3036_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3022_]);
				if (i_3036_ != 0)
				    is[i_3023_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3036_ & 0xff]);
			    } else if (i == 0) {
				int i_3037_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3022_]);
				if (i_3037_ != 0) {
				    int i_3038_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3037_ & 0xff]);
				    if ((anInt9931 & 0xffffff) == 16777215) {
					int i_3039_ = anInt9931 >>> 24;
					int i_3040_ = 256 - i_3039_;
					int i_3041_ = is[i_3023_];
					is[i_3023_]
					    = ((((i_3038_ & 0xff00ff) * i_3039_
						 + ((i_3041_ & 0xff00ff)
						    * i_3040_))
						& ~0xff00ff)
					       + (((i_3038_ & 0xff00) * i_3039_
						   + ((i_3041_ & 0xff00)
						      * i_3040_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9932 != 255) {
					int i_3042_
					    = ((i_3038_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_3043_
					    = ((i_3038_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_3044_
					    = ((i_3038_ & 0xff) * anInt9936
					       & 0xff00);
					i_3038_ = (i_3042_ | i_3043_
						   | i_3044_) >>> 8;
					int i_3045_ = is[i_3023_];
					is[i_3023_]
					    = (((((i_3038_ & 0xff00ff)
						  * anInt9932)
						 + ((i_3045_ & 0xff00ff)
						    * anInt9937))
						& ~0xff00ff)
					       + ((((i_3038_ & 0xff00)
						    * anInt9932)
						   + ((i_3045_ & 0xff00)
						      * anInt9937))
						  & 0xff0000)) >> 8;
				    } else {
					int i_3046_
					    = ((i_3038_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_3047_
					    = ((i_3038_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_3048_
					    = ((i_3038_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_3023_] = (i_3046_ | i_3047_
						       | i_3048_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_3049_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205[i_3022_]);
				int i_3050_ = (i_3049_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_3049_])
					       : 0);
				int i_3051_ = anInt9931;
				int i_3052_ = i_3050_ + i_3051_;
				int i_3053_ = ((i_3050_ & 0xff00ff)
					       + (i_3051_ & 0xff00ff));
				int i_3054_
				    = ((i_3053_ & 0x1000100)
				       + (i_3052_ - i_3053_ & 0x10000));
				i_3054_
				    = i_3052_ - i_3054_ | i_3054_ - (i_3054_
								     >>> 8);
				if (i_3050_ == 0 && anInt9932 != 255) {
				    i_3050_ = i_3054_;
				    i_3054_ = is[i_3023_];
				    i_3054_
					= ((((i_3050_ & 0xff00ff) * anInt9932
					     + ((i_3054_ & 0xff00ff)
						* anInt9937))
					    & ~0xff00ff)
					   + (((i_3050_ & 0xff00) * anInt9932
					       + ((i_3054_ & 0xff00)
						  * anInt9937))
					      & 0xff0000)) >> 8;
				}
				is[i_3023_] = i_3054_;
			    } else if (i == 2) {
				int i_3055_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3022_]);
				if (i_3055_ != 0) {
				    int i_3056_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3055_ & 0xff]);
				    int i_3057_
					= ((i_3056_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_3058_
					= ((i_3056_ & 0xff00) * anInt9932
					   & 0xff0000);
				    is[i_3023_++] = ((i_3057_ | i_3058_)
						     >>> 8) + anInt9939;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_2460_ == 2) {
			    if (i == 1) {
				int i_3059_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3022_]);
				if (i_3059_ != 0) {
				    int i_3060_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3059_ & 0xff]);
				    int i_3061_ = is[i_3023_];
				    int i_3062_ = i_3060_ + i_3061_;
				    int i_3063_ = ((i_3060_ & 0xff00ff)
						   + (i_3061_ & 0xff00ff));
				    i_3061_
					= ((i_3063_ & 0x1000100)
					   + (i_3062_ - i_3063_ & 0x10000));
				    is[i_3023_]
					= (i_3062_ - i_3061_
					   | i_3061_ - (i_3061_ >>> 8));
				}
			    } else if (i == 0) {
				int i_3064_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3022_]);
				if (i_3064_ != 0) {
				    int i_3065_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3064_ & 0xff]);
				    int i_3066_
					= ((i_3065_ & 0xff0000) * anInt9934
					   & ~0xffffff);
				    int i_3067_
					= ((i_3065_ & 0xff00) * anInt9913
					   & 0xff0000);
				    int i_3068_ = ((i_3065_ & 0xff) * anInt9936
						   & 0xff00);
				    i_3065_
					= (i_3066_ | i_3067_ | i_3068_) >>> 8;
				    int i_3069_ = is[i_3023_];
				    int i_3070_ = i_3065_ + i_3069_;
				    int i_3071_ = ((i_3065_ & 0xff00ff)
						   + (i_3069_ & 0xff00ff));
				    i_3069_
					= ((i_3071_ & 0x1000100)
					   + (i_3070_ - i_3071_ & 0x10000));
				    is[i_3023_]
					= (i_3070_ - i_3069_
					   | i_3069_ - (i_3069_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_3072_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205[i_3022_]);
				int i_3073_ = (i_3072_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_3072_])
					       : 0);
				int i_3074_ = anInt9931;
				int i_3075_ = i_3073_ + i_3074_;
				int i_3076_ = ((i_3073_ & 0xff00ff)
					       + (i_3074_ & 0xff00ff));
				int i_3077_
				    = ((i_3076_ & 0x1000100)
				       + (i_3075_ - i_3076_ & 0x10000));
				i_3077_
				    = i_3075_ - i_3077_ | i_3077_ - (i_3077_
								     >>> 8);
				if (i_3073_ == 0 && anInt9932 != 255) {
				    i_3073_ = i_3077_;
				    i_3077_ = is[i_3023_];
				    i_3077_
					= ((((i_3073_ & 0xff00ff) * anInt9932
					     + ((i_3077_ & 0xff00ff)
						* anInt9937))
					    & ~0xff00ff)
					   + (((i_3073_ & 0xff00) * anInt9932
					       + ((i_3077_ & 0xff00)
						  * anInt9937))
					      & 0xff0000)) >> 8;
				}
				is[i_3023_] = i_3077_;
			    } else if (i == 2) {
				int i_3078_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3022_]);
				if (i_3078_ != 0) {
				    int i_3079_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3078_ & 0xff]);
				    int i_3080_
					= ((i_3079_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_3081_
					= ((i_3079_ & 0xff00) * anInt9932
					   & 0xff0000);
				    i_3079_ = (((i_3080_ | i_3081_) >>> 8)
					       + anInt9939);
				    int i_3082_ = is[i_3023_];
				    int i_3083_ = i_3079_ + i_3082_;
				    int i_3084_ = ((i_3079_ & 0xff00ff)
						   + (i_3082_ & 0xff00ff));
				    i_3082_
					= ((i_3084_ & 0x1000100)
					   + (i_3083_ - i_3084_ & 0x10000));
				    is[i_3023_]
					= (i_3083_ - i_3082_
					   | i_3082_ - (i_3082_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_3017_ += anInt9921;
			i_3018_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    void method16223(int i, int i_3085_) {
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_3086_ = anInt9919;
		    while (i_3086_ < 0) {
			int i_3087_ = anInt9925;
			int i_3088_ = anInt9927;
			int i_3089_ = anInt9928;
			int i_3090_ = anInt9906;
			if (i_3088_ >= 0 && i_3089_ >= 0
			    && i_3088_ - (((Class168_Sub2_Sub3) this).anInt9920
					  << 12) < 0
			    && i_3089_ - (((Class168_Sub2_Sub3) this).anInt9916
					  << 12) < 0) {
			    for (/**/; i_3090_ < 0; i_3090_++) {
				int i_3091_
				    = ((i_3089_ >> 12) * ((Class168_Sub2_Sub3)
							  this).anInt9920
				       + (i_3088_ >> 12));
				int i_3092_ = i_3087_++;
				if (i_3085_ == 0) {
				    if (i == 1)
					is[i_3092_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_3091_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_3093_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_3091_])
						 & 0xff)]);
					int i_3094_
					    = ((i_3093_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_3095_
					    = ((i_3093_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_3096_
					    = ((i_3093_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_3092_] = (i_3094_ | i_3095_
						       | i_3096_) >>> 8;
				    } else if (i == 3) {
					int i_3097_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_3091_])
						 & 0xff)]);
					int i_3098_ = anInt9931;
					int i_3099_ = i_3097_ + i_3098_;
					int i_3100_ = ((i_3097_ & 0xff00ff)
						       + (i_3098_ & 0xff00ff));
					int i_3101_ = ((i_3100_ & 0x1000100)
						       + (i_3099_ - i_3100_
							  & 0x10000));
					is[i_3092_]
					    = (i_3099_ - i_3101_
					       | i_3101_ - (i_3101_ >>> 8));
				    } else if (i == 2) {
					int i_3102_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_3091_])
						 & 0xff)]);
					int i_3103_
					    = ((i_3102_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_3104_
					    = ((i_3102_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_3092_] = ((i_3103_ | i_3104_)
						       >>> 8) + anInt9939;
				    } else
					throw new IllegalArgumentException();
				} else if (i_3085_ == 1) {
				    if (i == 1) {
					int i_3105_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3091_]);
					if (i_3105_ != 0)
					    is[i_3092_]
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3105_ & 0xff]);
				    } else if (i == 0) {
					int i_3106_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3091_]);
					if (i_3106_ != 0) {
					    int i_3107_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3106_ & 0xff]);
					    if ((anInt9931 & 0xffffff)
						== 16777215) {
						int i_3108_ = anInt9931 >>> 24;
						int i_3109_ = 256 - i_3108_;
						int i_3110_ = is[i_3092_];
						is[i_3092_]
						    = (((((i_3107_ & 0xff00ff)
							  * i_3108_)
							 + ((i_3110_
							     & 0xff00ff)
							    * i_3109_))
							& ~0xff00ff)
						       + ((((i_3107_ & 0xff00)
							    * i_3108_)
							   + ((i_3110_
							       & 0xff00)
							      * i_3109_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9932 != 255) {
						int i_3111_
						    = (((i_3107_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_3112_
						    = (((i_3107_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_3113_
						    = (((i_3107_ & 0xff)
							* anInt9936)
						       & 0xff00);
						i_3107_ = (i_3111_ | i_3112_
							   | i_3113_) >>> 8;
						int i_3114_ = is[i_3092_];
						is[i_3092_]
						    = (((((i_3107_ & 0xff00ff)
							  * anInt9932)
							 + ((i_3114_
							     & 0xff00ff)
							    * anInt9937))
							& ~0xff00ff)
						       + ((((i_3107_ & 0xff00)
							    * anInt9932)
							   + ((i_3114_
							       & 0xff00)
							      * anInt9937))
							  & 0xff0000)) >> 8;
					    } else {
						int i_3115_
						    = (((i_3107_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_3116_
						    = (((i_3107_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_3117_
						    = (((i_3107_ & 0xff)
							* anInt9936)
						       & 0xff00);
						is[i_3092_]
						    = (i_3115_ | i_3116_
						       | i_3117_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_3118_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3091_]);
					int i_3119_
					    = (i_3118_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_3118_])
					       : 0);
					int i_3120_ = anInt9931;
					int i_3121_ = i_3119_ + i_3120_;
					int i_3122_ = ((i_3119_ & 0xff00ff)
						       + (i_3120_ & 0xff00ff));
					int i_3123_ = ((i_3122_ & 0x1000100)
						       + (i_3121_ - i_3122_
							  & 0x10000));
					i_3123_
					    = (i_3121_ - i_3123_
					       | i_3123_ - (i_3123_ >>> 8));
					if (i_3119_ == 0 && anInt9932 != 255) {
					    i_3119_ = i_3123_;
					    i_3123_ = is[i_3092_];
					    i_3123_
						= (((((i_3119_ & 0xff00ff)
						      * anInt9932)
						     + ((i_3123_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_3119_ & 0xff00)
							* anInt9932)
						       + ((i_3123_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_3092_] = i_3123_;
				    } else if (i == 2) {
					int i_3124_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3091_]);
					if (i_3124_ != 0) {
					    int i_3125_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3124_ & 0xff]);
					    int i_3126_
						= (((i_3125_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_3127_ = (((i_3125_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    is[i_3092_++]
						= (((i_3126_ | i_3127_) >>> 8)
						   + anInt9939);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_3085_ == 2) {
				    if (i == 1) {
					int i_3128_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3091_]);
					if (i_3128_ != 0) {
					    int i_3129_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3128_ & 0xff]);
					    int i_3130_ = is[i_3092_];
					    int i_3131_ = i_3129_ + i_3130_;
					    int i_3132_
						= ((i_3129_ & 0xff00ff)
						   + (i_3130_ & 0xff00ff));
					    i_3130_ = ((i_3132_ & 0x1000100)
						       + (i_3131_ - i_3132_
							  & 0x10000));
					    is[i_3092_]
						= (i_3131_ - i_3130_
						   | i_3130_ - (i_3130_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_3133_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3091_]);
					if (i_3133_ != 0) {
					    int i_3134_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3133_ & 0xff]);
					    int i_3135_
						= (((i_3134_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_3136_ = (((i_3134_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_3137_
						= ((i_3134_ & 0xff) * anInt9936
						   & 0xff00);
					    i_3134_ = (i_3135_ | i_3136_
						       | i_3137_) >>> 8;
					    int i_3138_ = is[i_3092_];
					    int i_3139_ = i_3134_ + i_3138_;
					    int i_3140_
						= ((i_3134_ & 0xff00ff)
						   + (i_3138_ & 0xff00ff));
					    i_3138_ = ((i_3140_ & 0x1000100)
						       + (i_3139_ - i_3140_
							  & 0x10000));
					    is[i_3092_]
						= (i_3139_ - i_3138_
						   | i_3138_ - (i_3138_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_3141_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3091_]);
					int i_3142_
					    = (i_3141_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_3141_])
					       : 0);
					int i_3143_ = anInt9931;
					int i_3144_ = i_3142_ + i_3143_;
					int i_3145_ = ((i_3142_ & 0xff00ff)
						       + (i_3143_ & 0xff00ff));
					int i_3146_ = ((i_3145_ & 0x1000100)
						       + (i_3144_ - i_3145_
							  & 0x10000));
					i_3146_
					    = (i_3144_ - i_3146_
					       | i_3146_ - (i_3146_ >>> 8));
					if (i_3142_ == 0 && anInt9932 != 255) {
					    i_3142_ = i_3146_;
					    i_3146_ = is[i_3092_];
					    i_3146_
						= (((((i_3142_ & 0xff00ff)
						      * anInt9932)
						     + ((i_3146_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_3142_ & 0xff00)
							* anInt9932)
						       + ((i_3146_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_3092_] = i_3146_;
				    } else if (i == 2) {
					int i_3147_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3091_]);
					if (i_3147_ != 0) {
					    int i_3148_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3147_ & 0xff]);
					    int i_3149_
						= (((i_3148_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_3150_ = (((i_3148_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    i_3148_ = ((i_3149_ | i_3150_)
						       >>> 8) + anInt9939;
					    int i_3151_ = is[i_3092_];
					    int i_3152_ = i_3148_ + i_3151_;
					    int i_3153_
						= ((i_3148_ & 0xff00ff)
						   + (i_3151_ & 0xff00ff));
					    i_3151_ = ((i_3153_ & 0x1000100)
						       + (i_3152_ - i_3153_
							  & 0x10000));
					    is[i_3092_]
						= (i_3152_ - i_3151_
						   | i_3151_ - (i_3151_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
			    }
			}
			i_3086_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_3154_ = anInt9919;
		    while (i_3154_ < 0) {
			int i_3155_ = anInt9925;
			int i_3156_ = anInt9927;
			int i_3157_ = anInt9928 + anInt9930;
			int i_3158_ = anInt9906;
			if (i_3156_ >= 0
			    && i_3156_ - (((Class168_Sub2_Sub3) this).anInt9920
					  << 12) < 0) {
			    int i_3159_;
			    if ((i_3159_
				 = (i_3157_
				    - (((Class168_Sub2_Sub3) this).anInt9916
				       << 12)))
				>= 0) {
				i_3159_ = (anInt9922 - i_3159_) / anInt9922;
				i_3158_ += i_3159_;
				i_3157_ += anInt9922 * i_3159_;
				i_3155_ += i_3159_;
			    }
			    if ((i_3159_ = (i_3157_ - anInt9922) / anInt9922)
				> i_3158_)
				i_3158_ = i_3159_;
			    for (/**/; i_3158_ < 0; i_3158_++) {
				int i_3160_
				    = ((i_3157_ >> 12) * ((Class168_Sub2_Sub3)
							  this).anInt9920
				       + (i_3156_ >> 12));
				int i_3161_ = i_3155_++;
				if (i_3085_ == 0) {
				    if (i == 1)
					is[i_3161_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_3160_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_3162_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_3160_])
						 & 0xff)]);
					int i_3163_
					    = ((i_3162_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_3164_
					    = ((i_3162_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_3165_
					    = ((i_3162_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_3161_] = (i_3163_ | i_3164_
						       | i_3165_) >>> 8;
				    } else if (i == 3) {
					int i_3166_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_3160_])
						 & 0xff)]);
					int i_3167_ = anInt9931;
					int i_3168_ = i_3166_ + i_3167_;
					int i_3169_ = ((i_3166_ & 0xff00ff)
						       + (i_3167_ & 0xff00ff));
					int i_3170_ = ((i_3169_ & 0x1000100)
						       + (i_3168_ - i_3169_
							  & 0x10000));
					is[i_3161_]
					    = (i_3168_ - i_3170_
					       | i_3170_ - (i_3170_ >>> 8));
				    } else if (i == 2) {
					int i_3171_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_3160_])
						 & 0xff)]);
					int i_3172_
					    = ((i_3171_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_3173_
					    = ((i_3171_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_3161_] = ((i_3172_ | i_3173_)
						       >>> 8) + anInt9939;
				    } else
					throw new IllegalArgumentException();
				} else if (i_3085_ == 1) {
				    if (i == 1) {
					int i_3174_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3160_]);
					if (i_3174_ != 0)
					    is[i_3161_]
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3174_ & 0xff]);
				    } else if (i == 0) {
					int i_3175_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3160_]);
					if (i_3175_ != 0) {
					    int i_3176_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3175_ & 0xff]);
					    if ((anInt9931 & 0xffffff)
						== 16777215) {
						int i_3177_ = anInt9931 >>> 24;
						int i_3178_ = 256 - i_3177_;
						int i_3179_ = is[i_3161_];
						is[i_3161_]
						    = (((((i_3176_ & 0xff00ff)
							  * i_3177_)
							 + ((i_3179_
							     & 0xff00ff)
							    * i_3178_))
							& ~0xff00ff)
						       + ((((i_3176_ & 0xff00)
							    * i_3177_)
							   + ((i_3179_
							       & 0xff00)
							      * i_3178_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9932 != 255) {
						int i_3180_
						    = (((i_3176_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_3181_
						    = (((i_3176_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_3182_
						    = (((i_3176_ & 0xff)
							* anInt9936)
						       & 0xff00);
						i_3176_ = (i_3180_ | i_3181_
							   | i_3182_) >>> 8;
						int i_3183_ = is[i_3161_];
						is[i_3161_]
						    = (((((i_3176_ & 0xff00ff)
							  * anInt9932)
							 + ((i_3183_
							     & 0xff00ff)
							    * anInt9937))
							& ~0xff00ff)
						       + ((((i_3176_ & 0xff00)
							    * anInt9932)
							   + ((i_3183_
							       & 0xff00)
							      * anInt9937))
							  & 0xff0000)) >> 8;
					    } else {
						int i_3184_
						    = (((i_3176_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_3185_
						    = (((i_3176_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_3186_
						    = (((i_3176_ & 0xff)
							* anInt9936)
						       & 0xff00);
						is[i_3161_]
						    = (i_3184_ | i_3185_
						       | i_3186_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_3187_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3160_]);
					int i_3188_
					    = (i_3187_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_3187_])
					       : 0);
					int i_3189_ = anInt9931;
					int i_3190_ = i_3188_ + i_3189_;
					int i_3191_ = ((i_3188_ & 0xff00ff)
						       + (i_3189_ & 0xff00ff));
					int i_3192_ = ((i_3191_ & 0x1000100)
						       + (i_3190_ - i_3191_
							  & 0x10000));
					i_3192_
					    = (i_3190_ - i_3192_
					       | i_3192_ - (i_3192_ >>> 8));
					if (i_3188_ == 0 && anInt9932 != 255) {
					    i_3188_ = i_3192_;
					    i_3192_ = is[i_3161_];
					    i_3192_
						= (((((i_3188_ & 0xff00ff)
						      * anInt9932)
						     + ((i_3192_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_3188_ & 0xff00)
							* anInt9932)
						       + ((i_3192_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_3161_] = i_3192_;
				    } else if (i == 2) {
					int i_3193_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3160_]);
					if (i_3193_ != 0) {
					    int i_3194_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3193_ & 0xff]);
					    int i_3195_
						= (((i_3194_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_3196_ = (((i_3194_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    is[i_3161_++]
						= (((i_3195_ | i_3196_) >>> 8)
						   + anInt9939);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_3085_ == 2) {
				    if (i == 1) {
					int i_3197_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3160_]);
					if (i_3197_ != 0) {
					    int i_3198_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3197_ & 0xff]);
					    int i_3199_ = is[i_3161_];
					    int i_3200_ = i_3198_ + i_3199_;
					    int i_3201_
						= ((i_3198_ & 0xff00ff)
						   + (i_3199_ & 0xff00ff));
					    i_3199_ = ((i_3201_ & 0x1000100)
						       + (i_3200_ - i_3201_
							  & 0x10000));
					    is[i_3161_]
						= (i_3200_ - i_3199_
						   | i_3199_ - (i_3199_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_3202_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3160_]);
					if (i_3202_ != 0) {
					    int i_3203_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3202_ & 0xff]);
					    int i_3204_
						= (((i_3203_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_3205_ = (((i_3203_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_3206_
						= ((i_3203_ & 0xff) * anInt9936
						   & 0xff00);
					    i_3203_ = (i_3204_ | i_3205_
						       | i_3206_) >>> 8;
					    int i_3207_ = is[i_3161_];
					    int i_3208_ = i_3203_ + i_3207_;
					    int i_3209_
						= ((i_3203_ & 0xff00ff)
						   + (i_3207_ & 0xff00ff));
					    i_3207_ = ((i_3209_ & 0x1000100)
						       + (i_3208_ - i_3209_
							  & 0x10000));
					    is[i_3161_]
						= (i_3208_ - i_3207_
						   | i_3207_ - (i_3207_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_3210_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3160_]);
					int i_3211_
					    = (i_3210_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_3210_])
					       : 0);
					int i_3212_ = anInt9931;
					int i_3213_ = i_3211_ + i_3212_;
					int i_3214_ = ((i_3211_ & 0xff00ff)
						       + (i_3212_ & 0xff00ff));
					int i_3215_ = ((i_3214_ & 0x1000100)
						       + (i_3213_ - i_3214_
							  & 0x10000));
					i_3215_
					    = (i_3213_ - i_3215_
					       | i_3215_ - (i_3215_ >>> 8));
					if (i_3211_ == 0 && anInt9932 != 255) {
					    i_3211_ = i_3215_;
					    i_3215_ = is[i_3161_];
					    i_3215_
						= (((((i_3211_ & 0xff00ff)
						      * anInt9932)
						     + ((i_3215_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_3211_ & 0xff00)
							* anInt9932)
						       + ((i_3215_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_3161_] = i_3215_;
				    } else if (i == 2) {
					int i_3216_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3160_]);
					if (i_3216_ != 0) {
					    int i_3217_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3216_ & 0xff]);
					    int i_3218_
						= (((i_3217_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_3219_ = (((i_3217_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    i_3217_ = ((i_3218_ | i_3219_)
						       >>> 8) + anInt9939;
					    int i_3220_ = is[i_3161_];
					    int i_3221_ = i_3217_ + i_3220_;
					    int i_3222_
						= ((i_3217_ & 0xff00ff)
						   + (i_3220_ & 0xff00ff));
					    i_3220_ = ((i_3222_ & 0x1000100)
						       + (i_3221_ - i_3222_
							  & 0x10000));
					    is[i_3161_]
						= (i_3221_ - i_3220_
						   | i_3220_ - (i_3220_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_3157_ += anInt9922;
			    }
			}
			i_3154_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_3223_ = anInt9919;
		    while (i_3223_ < 0) {
			int i_3224_ = anInt9925;
			int i_3225_ = anInt9927;
			int i_3226_ = anInt9928 + anInt9930;
			int i_3227_ = anInt9906;
			if (i_3225_ >= 0
			    && i_3225_ - (((Class168_Sub2_Sub3) this).anInt9920
					  << 12) < 0) {
			    if (i_3226_ < 0) {
				int i_3228_
				    = (anInt9922 - 1 - i_3226_) / anInt9922;
				i_3227_ += i_3228_;
				i_3226_ += anInt9922 * i_3228_;
				i_3224_ += i_3228_;
			    }
			    int i_3229_;
			    if ((i_3229_
				 = (1 + i_3226_
				    - (((Class168_Sub2_Sub3) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_3227_)
				i_3227_ = i_3229_;
			    for (/**/; i_3227_ < 0; i_3227_++) {
				int i_3230_
				    = ((i_3226_ >> 12) * ((Class168_Sub2_Sub3)
							  this).anInt9920
				       + (i_3225_ >> 12));
				int i_3231_ = i_3224_++;
				if (i_3085_ == 0) {
				    if (i == 1)
					is[i_3231_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_3230_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_3232_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_3230_])
						 & 0xff)]);
					int i_3233_
					    = ((i_3232_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_3234_
					    = ((i_3232_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_3235_
					    = ((i_3232_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_3231_] = (i_3233_ | i_3234_
						       | i_3235_) >>> 8;
				    } else if (i == 3) {
					int i_3236_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_3230_])
						 & 0xff)]);
					int i_3237_ = anInt9931;
					int i_3238_ = i_3236_ + i_3237_;
					int i_3239_ = ((i_3236_ & 0xff00ff)
						       + (i_3237_ & 0xff00ff));
					int i_3240_ = ((i_3239_ & 0x1000100)
						       + (i_3238_ - i_3239_
							  & 0x10000));
					is[i_3231_]
					    = (i_3238_ - i_3240_
					       | i_3240_ - (i_3240_ >>> 8));
				    } else if (i == 2) {
					int i_3241_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_3230_])
						 & 0xff)]);
					int i_3242_
					    = ((i_3241_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_3243_
					    = ((i_3241_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_3231_] = ((i_3242_ | i_3243_)
						       >>> 8) + anInt9939;
				    } else
					throw new IllegalArgumentException();
				} else if (i_3085_ == 1) {
				    if (i == 1) {
					int i_3244_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3230_]);
					if (i_3244_ != 0)
					    is[i_3231_]
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3244_ & 0xff]);
				    } else if (i == 0) {
					int i_3245_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3230_]);
					if (i_3245_ != 0) {
					    int i_3246_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3245_ & 0xff]);
					    if ((anInt9931 & 0xffffff)
						== 16777215) {
						int i_3247_ = anInt9931 >>> 24;
						int i_3248_ = 256 - i_3247_;
						int i_3249_ = is[i_3231_];
						is[i_3231_]
						    = (((((i_3246_ & 0xff00ff)
							  * i_3247_)
							 + ((i_3249_
							     & 0xff00ff)
							    * i_3248_))
							& ~0xff00ff)
						       + ((((i_3246_ & 0xff00)
							    * i_3247_)
							   + ((i_3249_
							       & 0xff00)
							      * i_3248_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9932 != 255) {
						int i_3250_
						    = (((i_3246_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_3251_
						    = (((i_3246_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_3252_
						    = (((i_3246_ & 0xff)
							* anInt9936)
						       & 0xff00);
						i_3246_ = (i_3250_ | i_3251_
							   | i_3252_) >>> 8;
						int i_3253_ = is[i_3231_];
						is[i_3231_]
						    = (((((i_3246_ & 0xff00ff)
							  * anInt9932)
							 + ((i_3253_
							     & 0xff00ff)
							    * anInt9937))
							& ~0xff00ff)
						       + ((((i_3246_ & 0xff00)
							    * anInt9932)
							   + ((i_3253_
							       & 0xff00)
							      * anInt9937))
							  & 0xff0000)) >> 8;
					    } else {
						int i_3254_
						    = (((i_3246_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_3255_
						    = (((i_3246_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_3256_
						    = (((i_3246_ & 0xff)
							* anInt9936)
						       & 0xff00);
						is[i_3231_]
						    = (i_3254_ | i_3255_
						       | i_3256_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_3257_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3230_]);
					int i_3258_
					    = (i_3257_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_3257_])
					       : 0);
					int i_3259_ = anInt9931;
					int i_3260_ = i_3258_ + i_3259_;
					int i_3261_ = ((i_3258_ & 0xff00ff)
						       + (i_3259_ & 0xff00ff));
					int i_3262_ = ((i_3261_ & 0x1000100)
						       + (i_3260_ - i_3261_
							  & 0x10000));
					i_3262_
					    = (i_3260_ - i_3262_
					       | i_3262_ - (i_3262_ >>> 8));
					if (i_3258_ == 0 && anInt9932 != 255) {
					    i_3258_ = i_3262_;
					    i_3262_ = is[i_3231_];
					    i_3262_
						= (((((i_3258_ & 0xff00ff)
						      * anInt9932)
						     + ((i_3262_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_3258_ & 0xff00)
							* anInt9932)
						       + ((i_3262_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_3231_] = i_3262_;
				    } else if (i == 2) {
					int i_3263_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3230_]);
					if (i_3263_ != 0) {
					    int i_3264_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3263_ & 0xff]);
					    int i_3265_
						= (((i_3264_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_3266_ = (((i_3264_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    is[i_3231_++]
						= (((i_3265_ | i_3266_) >>> 8)
						   + anInt9939);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_3085_ == 2) {
				    if (i == 1) {
					int i_3267_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3230_]);
					if (i_3267_ != 0) {
					    int i_3268_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3267_ & 0xff]);
					    int i_3269_ = is[i_3231_];
					    int i_3270_ = i_3268_ + i_3269_;
					    int i_3271_
						= ((i_3268_ & 0xff00ff)
						   + (i_3269_ & 0xff00ff));
					    i_3269_ = ((i_3271_ & 0x1000100)
						       + (i_3270_ - i_3271_
							  & 0x10000));
					    is[i_3231_]
						= (i_3270_ - i_3269_
						   | i_3269_ - (i_3269_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_3272_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3230_]);
					if (i_3272_ != 0) {
					    int i_3273_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3272_ & 0xff]);
					    int i_3274_
						= (((i_3273_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_3275_ = (((i_3273_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_3276_
						= ((i_3273_ & 0xff) * anInt9936
						   & 0xff00);
					    i_3273_ = (i_3274_ | i_3275_
						       | i_3276_) >>> 8;
					    int i_3277_ = is[i_3231_];
					    int i_3278_ = i_3273_ + i_3277_;
					    int i_3279_
						= ((i_3273_ & 0xff00ff)
						   + (i_3277_ & 0xff00ff));
					    i_3277_ = ((i_3279_ & 0x1000100)
						       + (i_3278_ - i_3279_
							  & 0x10000));
					    is[i_3231_]
						= (i_3278_ - i_3277_
						   | i_3277_ - (i_3277_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_3280_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3230_]);
					int i_3281_
					    = (i_3280_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_3280_])
					       : 0);
					int i_3282_ = anInt9931;
					int i_3283_ = i_3281_ + i_3282_;
					int i_3284_ = ((i_3281_ & 0xff00ff)
						       + (i_3282_ & 0xff00ff));
					int i_3285_ = ((i_3284_ & 0x1000100)
						       + (i_3283_ - i_3284_
							  & 0x10000));
					i_3285_
					    = (i_3283_ - i_3285_
					       | i_3285_ - (i_3285_ >>> 8));
					if (i_3281_ == 0 && anInt9932 != 255) {
					    i_3281_ = i_3285_;
					    i_3285_ = is[i_3231_];
					    i_3285_
						= (((((i_3281_ & 0xff00ff)
						      * anInt9932)
						     + ((i_3285_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_3281_ & 0xff00)
							* anInt9932)
						       + ((i_3285_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_3231_] = i_3285_;
				    } else if (i == 2) {
					int i_3286_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3230_]);
					if (i_3286_ != 0) {
					    int i_3287_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3286_ & 0xff]);
					    int i_3288_
						= (((i_3287_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_3289_ = (((i_3287_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    i_3287_ = ((i_3288_ | i_3289_)
						       >>> 8) + anInt9939;
					    int i_3290_ = is[i_3231_];
					    int i_3291_ = i_3287_ + i_3290_;
					    int i_3292_
						= ((i_3287_ & 0xff00ff)
						   + (i_3290_ & 0xff00ff));
					    i_3290_ = ((i_3292_ & 0x1000100)
						       + (i_3291_ - i_3292_
							  & 0x10000));
					    is[i_3231_]
						= (i_3291_ - i_3290_
						   | i_3290_ - (i_3290_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_3226_ += anInt9922;
			    }
			}
			i_3223_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_3293_ = anInt9919;
		    while (i_3293_ < 0) {
			int i_3294_ = anInt9925;
			int i_3295_ = anInt9927 + anInt9929;
			int i_3296_ = anInt9928;
			int i_3297_ = anInt9906;
			if (i_3296_ >= 0
			    && i_3296_ - (((Class168_Sub2_Sub3) this).anInt9916
					  << 12) < 0) {
			    int i_3298_;
			    if ((i_3298_
				 = (i_3295_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)))
				>= 0) {
				i_3298_ = (anInt9921 - i_3298_) / anInt9921;
				i_3297_ += i_3298_;
				i_3295_ += anInt9921 * i_3298_;
				i_3294_ += i_3298_;
			    }
			    if ((i_3298_ = (i_3295_ - anInt9921) / anInt9921)
				> i_3297_)
				i_3297_ = i_3298_;
			    for (/**/; i_3297_ < 0; i_3297_++) {
				int i_3299_
				    = ((i_3296_ >> 12) * ((Class168_Sub2_Sub3)
							  this).anInt9920
				       + (i_3295_ >> 12));
				int i_3300_ = i_3294_++;
				if (i_3085_ == 0) {
				    if (i == 1)
					is[i_3300_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_3299_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_3301_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_3299_])
						 & 0xff)]);
					int i_3302_
					    = ((i_3301_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_3303_
					    = ((i_3301_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_3304_
					    = ((i_3301_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_3300_] = (i_3302_ | i_3303_
						       | i_3304_) >>> 8;
				    } else if (i == 3) {
					int i_3305_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_3299_])
						 & 0xff)]);
					int i_3306_ = anInt9931;
					int i_3307_ = i_3305_ + i_3306_;
					int i_3308_ = ((i_3305_ & 0xff00ff)
						       + (i_3306_ & 0xff00ff));
					int i_3309_ = ((i_3308_ & 0x1000100)
						       + (i_3307_ - i_3308_
							  & 0x10000));
					is[i_3300_]
					    = (i_3307_ - i_3309_
					       | i_3309_ - (i_3309_ >>> 8));
				    } else if (i == 2) {
					int i_3310_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [((((Class168_Sub2_Sub3) this)
						  .aByteArray11205[i_3299_])
						 & 0xff)]);
					int i_3311_
					    = ((i_3310_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_3312_
					    = ((i_3310_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_3300_] = ((i_3311_ | i_3312_)
						       >>> 8) + anInt9939;
				    } else
					throw new IllegalArgumentException();
				} else if (i_3085_ == 1) {
				    if (i == 1) {
					int i_3313_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3299_]);
					if (i_3313_ != 0)
					    is[i_3300_]
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3313_ & 0xff]);
				    } else if (i == 0) {
					int i_3314_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3299_]);
					if (i_3314_ != 0) {
					    int i_3315_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3314_ & 0xff]);
					    if ((anInt9931 & 0xffffff)
						== 16777215) {
						int i_3316_ = anInt9931 >>> 24;
						int i_3317_ = 256 - i_3316_;
						int i_3318_ = is[i_3300_];
						is[i_3300_]
						    = (((((i_3315_ & 0xff00ff)
							  * i_3316_)
							 + ((i_3318_
							     & 0xff00ff)
							    * i_3317_))
							& ~0xff00ff)
						       + ((((i_3315_ & 0xff00)
							    * i_3316_)
							   + ((i_3318_
							       & 0xff00)
							      * i_3317_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9932 != 255) {
						int i_3319_
						    = (((i_3315_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_3320_
						    = (((i_3315_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_3321_
						    = (((i_3315_ & 0xff)
							* anInt9936)
						       & 0xff00);
						i_3315_ = (i_3319_ | i_3320_
							   | i_3321_) >>> 8;
						int i_3322_ = is[i_3300_];
						is[i_3300_]
						    = (((((i_3315_ & 0xff00ff)
							  * anInt9932)
							 + ((i_3322_
							     & 0xff00ff)
							    * anInt9937))
							& ~0xff00ff)
						       + ((((i_3315_ & 0xff00)
							    * anInt9932)
							   + ((i_3322_
							       & 0xff00)
							      * anInt9937))
							  & 0xff0000)) >> 8;
					    } else {
						int i_3323_
						    = (((i_3315_ & 0xff0000)
							* anInt9934)
						       & ~0xffffff);
						int i_3324_
						    = (((i_3315_ & 0xff00)
							* anInt9913)
						       & 0xff0000);
						int i_3325_
						    = (((i_3315_ & 0xff)
							* anInt9936)
						       & 0xff00);
						is[i_3300_]
						    = (i_3323_ | i_3324_
						       | i_3325_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_3326_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3299_]);
					int i_3327_
					    = (i_3326_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_3326_])
					       : 0);
					int i_3328_ = anInt9931;
					int i_3329_ = i_3327_ + i_3328_;
					int i_3330_ = ((i_3327_ & 0xff00ff)
						       + (i_3328_ & 0xff00ff));
					int i_3331_ = ((i_3330_ & 0x1000100)
						       + (i_3329_ - i_3330_
							  & 0x10000));
					i_3331_
					    = (i_3329_ - i_3331_
					       | i_3331_ - (i_3331_ >>> 8));
					if (i_3327_ == 0 && anInt9932 != 255) {
					    i_3327_ = i_3331_;
					    i_3331_ = is[i_3300_];
					    i_3331_
						= (((((i_3327_ & 0xff00ff)
						      * anInt9932)
						     + ((i_3331_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_3327_ & 0xff00)
							* anInt9932)
						       + ((i_3331_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_3300_] = i_3331_;
				    } else if (i == 2) {
					int i_3332_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3299_]);
					if (i_3332_ != 0) {
					    int i_3333_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3332_ & 0xff]);
					    int i_3334_
						= (((i_3333_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_3335_ = (((i_3333_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    is[i_3300_++]
						= (((i_3334_ | i_3335_) >>> 8)
						   + anInt9939);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_3085_ == 2) {
				    if (i == 1) {
					int i_3336_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3299_]);
					if (i_3336_ != 0) {
					    int i_3337_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3336_ & 0xff]);
					    int i_3338_ = is[i_3300_];
					    int i_3339_ = i_3337_ + i_3338_;
					    int i_3340_
						= ((i_3337_ & 0xff00ff)
						   + (i_3338_ & 0xff00ff));
					    i_3338_ = ((i_3340_ & 0x1000100)
						       + (i_3339_ - i_3340_
							  & 0x10000));
					    is[i_3300_]
						= (i_3339_ - i_3338_
						   | i_3338_ - (i_3338_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_3341_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3299_]);
					if (i_3341_ != 0) {
					    int i_3342_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3341_ & 0xff]);
					    int i_3343_
						= (((i_3342_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_3344_ = (((i_3342_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_3345_
						= ((i_3342_ & 0xff) * anInt9936
						   & 0xff00);
					    i_3342_ = (i_3343_ | i_3344_
						       | i_3345_) >>> 8;
					    int i_3346_ = is[i_3300_];
					    int i_3347_ = i_3342_ + i_3346_;
					    int i_3348_
						= ((i_3342_ & 0xff00ff)
						   + (i_3346_ & 0xff00ff));
					    i_3346_ = ((i_3348_ & 0x1000100)
						       + (i_3347_ - i_3348_
							  & 0x10000));
					    is[i_3300_]
						= (i_3347_ - i_3346_
						   | i_3346_ - (i_3346_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_3349_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3299_]);
					int i_3350_
					    = (i_3349_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_3349_])
					       : 0);
					int i_3351_ = anInt9931;
					int i_3352_ = i_3350_ + i_3351_;
					int i_3353_ = ((i_3350_ & 0xff00ff)
						       + (i_3351_ & 0xff00ff));
					int i_3354_ = ((i_3353_ & 0x1000100)
						       + (i_3352_ - i_3353_
							  & 0x10000));
					i_3354_
					    = (i_3352_ - i_3354_
					       | i_3354_ - (i_3354_ >>> 8));
					if (i_3350_ == 0 && anInt9932 != 255) {
					    i_3350_ = i_3354_;
					    i_3354_ = is[i_3300_];
					    i_3354_
						= (((((i_3350_ & 0xff00ff)
						      * anInt9932)
						     + ((i_3354_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_3350_ & 0xff00)
							* anInt9932)
						       + ((i_3354_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					}
					is[i_3300_] = i_3354_;
				    } else if (i == 2) {
					int i_3355_
					    = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3299_]);
					if (i_3355_ != 0) {
					    int i_3356_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_3355_ & 0xff]);
					    int i_3357_
						= (((i_3356_ & 0xff00ff)
						    * anInt9932)
						   & ~0xff00ff);
					    int i_3358_ = (((i_3356_ & 0xff00)
							    * anInt9932)
							   & 0xff0000);
					    i_3356_ = ((i_3357_ | i_3358_)
						       >>> 8) + anInt9939;
					    int i_3359_ = is[i_3300_];
					    int i_3360_ = i_3356_ + i_3359_;
					    int i_3361_
						= ((i_3356_ & 0xff00ff)
						   + (i_3359_ & 0xff00ff));
					    i_3359_ = ((i_3361_ & 0x1000100)
						       + (i_3360_ - i_3361_
							  & 0x10000));
					    is[i_3300_]
						= (i_3360_ - i_3359_
						   | i_3359_ - (i_3359_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_3295_ += anInt9921;
			    }
			}
			i_3293_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_3362_ = anInt9919;
		    while (i_3362_ < 0) {
			int i_3363_ = anInt9925;
			int i_3364_ = anInt9927 + anInt9929;
			int i_3365_ = anInt9928 + anInt9930;
			int i_3366_ = anInt9906;
			int i_3367_;
			if ((i_3367_
			     = i_3364_ - (((Class168_Sub2_Sub3) this).anInt9920
					  << 12))
			    >= 0) {
			    i_3367_ = (anInt9921 - i_3367_) / anInt9921;
			    i_3366_ += i_3367_;
			    i_3364_ += anInt9921 * i_3367_;
			    i_3365_ += anInt9922 * i_3367_;
			    i_3363_ += i_3367_;
			}
			if ((i_3367_ = (i_3364_ - anInt9921) / anInt9921)
			    > i_3366_)
			    i_3366_ = i_3367_;
			if ((i_3367_
			     = i_3365_ - (((Class168_Sub2_Sub3) this).anInt9916
					  << 12))
			    >= 0) {
			    i_3367_ = (anInt9922 - i_3367_) / anInt9922;
			    i_3366_ += i_3367_;
			    i_3364_ += anInt9921 * i_3367_;
			    i_3365_ += anInt9922 * i_3367_;
			    i_3363_ += i_3367_;
			}
			if ((i_3367_ = (i_3365_ - anInt9922) / anInt9922)
			    > i_3366_)
			    i_3366_ = i_3367_;
			for (/**/; i_3366_ < 0; i_3366_++) {
			    int i_3368_
				= (((i_3365_ >> 12)
				    * ((Class168_Sub2_Sub3) this).anInt9920)
				   + (i_3364_ >> 12));
			    int i_3369_ = i_3363_++;
			    if (i_3085_ == 0) {
				if (i == 1)
				    is[i_3369_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_3368_])
					     & 0xff)]);
				else if (i == 0) {
				    int i_3370_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_3368_])
					     & 0xff)]);
				    int i_3371_
					= ((i_3370_ & 0xff0000) * anInt9934
					   & ~0xffffff);
				    int i_3372_
					= ((i_3370_ & 0xff00) * anInt9913
					   & 0xff0000);
				    int i_3373_ = ((i_3370_ & 0xff) * anInt9936
						   & 0xff00);
				    is[i_3369_]
					= (i_3371_ | i_3372_ | i_3373_) >>> 8;
				} else if (i == 3) {
				    int i_3374_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_3368_])
					     & 0xff)]);
				    int i_3375_ = anInt9931;
				    int i_3376_ = i_3374_ + i_3375_;
				    int i_3377_ = ((i_3374_ & 0xff00ff)
						   + (i_3375_ & 0xff00ff));
				    int i_3378_
					= ((i_3377_ & 0x1000100)
					   + (i_3376_ - i_3377_ & 0x10000));
				    is[i_3369_]
					= (i_3376_ - i_3378_
					   | i_3378_ - (i_3378_ >>> 8));
				} else if (i == 2) {
				    int i_3379_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_3368_])
					     & 0xff)]);
				    int i_3380_
					= ((i_3379_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_3381_
					= ((i_3379_ & 0xff00) * anInt9932
					   & 0xff0000);
				    is[i_3369_] = (((i_3380_ | i_3381_) >>> 8)
						   + anInt9939);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3085_ == 1) {
				if (i == 1) {
				    int i_3382_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_3368_]);
				    if (i_3382_ != 0)
					is[i_3369_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3382_ & 0xff]);
				} else if (i == 0) {
				    int i_3383_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_3368_]);
				    if (i_3383_ != 0) {
					int i_3384_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3383_ & 0xff]);
					if ((anInt9931 & 0xffffff)
					    == 16777215) {
					    int i_3385_ = anInt9931 >>> 24;
					    int i_3386_ = 256 - i_3385_;
					    int i_3387_ = is[i_3369_];
					    is[i_3369_]
						= (((((i_3384_ & 0xff00ff)
						      * i_3385_)
						     + ((i_3387_ & 0xff00ff)
							* i_3386_))
						    & ~0xff00ff)
						   + ((((i_3384_ & 0xff00)
							* i_3385_)
						       + ((i_3387_ & 0xff00)
							  * i_3386_))
						      & 0xff0000)) >> 8;
					} else if (anInt9932 != 255) {
					    int i_3388_
						= (((i_3384_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_3389_ = (((i_3384_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_3390_
						= ((i_3384_ & 0xff) * anInt9936
						   & 0xff00);
					    i_3384_ = (i_3388_ | i_3389_
						       | i_3390_) >>> 8;
					    int i_3391_ = is[i_3369_];
					    is[i_3369_]
						= (((((i_3384_ & 0xff00ff)
						      * anInt9932)
						     + ((i_3391_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_3384_ & 0xff00)
							* anInt9932)
						       + ((i_3391_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					} else {
					    int i_3392_
						= (((i_3384_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_3393_ = (((i_3384_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_3394_
						= ((i_3384_ & 0xff) * anInt9936
						   & 0xff00);
					    is[i_3369_] = (i_3392_ | i_3393_
							   | i_3394_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_3395_ = (((Class168_Sub2_Sub3) this)
						    .aByteArray11205[i_3368_]);
				    int i_3396_
					= (i_3395_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_3395_])
					   : 0);
				    int i_3397_ = anInt9931;
				    int i_3398_ = i_3396_ + i_3397_;
				    int i_3399_ = ((i_3396_ & 0xff00ff)
						   + (i_3397_ & 0xff00ff));
				    int i_3400_
					= ((i_3399_ & 0x1000100)
					   + (i_3398_ - i_3399_ & 0x10000));
				    i_3400_ = (i_3398_ - i_3400_
					       | i_3400_ - (i_3400_ >>> 8));
				    if (i_3396_ == 0 && anInt9932 != 255) {
					i_3396_ = i_3400_;
					i_3400_ = is[i_3369_];
					i_3400_ = (((((i_3396_ & 0xff00ff)
						      * anInt9932)
						     + ((i_3400_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_3396_ & 0xff00)
							* anInt9932)
						       + ((i_3400_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3369_] = i_3400_;
				} else if (i == 2) {
				    int i_3401_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_3368_]);
				    if (i_3401_ != 0) {
					int i_3402_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3401_ & 0xff]);
					int i_3403_
					    = ((i_3402_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_3404_
					    = ((i_3402_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_3369_++] = ((i_3403_ | i_3404_)
							 >>> 8) + anInt9939;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3085_ == 2) {
				if (i == 1) {
				    int i_3405_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_3368_]);
				    if (i_3405_ != 0) {
					int i_3406_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3405_ & 0xff]);
					int i_3407_ = is[i_3369_];
					int i_3408_ = i_3406_ + i_3407_;
					int i_3409_ = ((i_3406_ & 0xff00ff)
						       + (i_3407_ & 0xff00ff));
					i_3407_ = ((i_3409_ & 0x1000100)
						   + (i_3408_ - i_3409_
						      & 0x10000));
					is[i_3369_]
					    = (i_3408_ - i_3407_
					       | i_3407_ - (i_3407_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_3410_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_3368_]);
				    if (i_3410_ != 0) {
					int i_3411_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3410_ & 0xff]);
					int i_3412_
					    = ((i_3411_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_3413_
					    = ((i_3411_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_3414_
					    = ((i_3411_ & 0xff) * anInt9936
					       & 0xff00);
					i_3411_ = (i_3412_ | i_3413_
						   | i_3414_) >>> 8;
					int i_3415_ = is[i_3369_];
					int i_3416_ = i_3411_ + i_3415_;
					int i_3417_ = ((i_3411_ & 0xff00ff)
						       + (i_3415_ & 0xff00ff));
					i_3415_ = ((i_3417_ & 0x1000100)
						   + (i_3416_ - i_3417_
						      & 0x10000));
					is[i_3369_]
					    = (i_3416_ - i_3415_
					       | i_3415_ - (i_3415_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_3418_ = (((Class168_Sub2_Sub3) this)
						    .aByteArray11205[i_3368_]);
				    int i_3419_
					= (i_3418_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_3418_])
					   : 0);
				    int i_3420_ = anInt9931;
				    int i_3421_ = i_3419_ + i_3420_;
				    int i_3422_ = ((i_3419_ & 0xff00ff)
						   + (i_3420_ & 0xff00ff));
				    int i_3423_
					= ((i_3422_ & 0x1000100)
					   + (i_3421_ - i_3422_ & 0x10000));
				    i_3423_ = (i_3421_ - i_3423_
					       | i_3423_ - (i_3423_ >>> 8));
				    if (i_3419_ == 0 && anInt9932 != 255) {
					i_3419_ = i_3423_;
					i_3423_ = is[i_3369_];
					i_3423_ = (((((i_3419_ & 0xff00ff)
						      * anInt9932)
						     + ((i_3423_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_3419_ & 0xff00)
							* anInt9932)
						       + ((i_3423_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3369_] = i_3423_;
				} else if (i == 2) {
				    int i_3424_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_3368_]);
				    if (i_3424_ != 0) {
					int i_3425_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3424_ & 0xff]);
					int i_3426_
					    = ((i_3425_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_3427_
					    = ((i_3425_ & 0xff00) * anInt9932
					       & 0xff0000);
					i_3425_ = (((i_3426_ | i_3427_) >>> 8)
						   + anInt9939);
					int i_3428_ = is[i_3369_];
					int i_3429_ = i_3425_ + i_3428_;
					int i_3430_ = ((i_3425_ & 0xff00ff)
						       + (i_3428_ & 0xff00ff));
					i_3428_ = ((i_3430_ & 0x1000100)
						   + (i_3429_ - i_3430_
						      & 0x10000));
					is[i_3369_]
					    = (i_3429_ - i_3428_
					       | i_3428_ - (i_3428_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_3364_ += anInt9921;
			    i_3365_ += anInt9922;
			}
			i_3362_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_3431_ = anInt9919;
		    while (i_3431_ < 0) {
			int i_3432_ = anInt9925;
			int i_3433_ = anInt9927 + anInt9929;
			int i_3434_ = anInt9928 + anInt9930;
			int i_3435_ = anInt9906;
			int i_3436_;
			if ((i_3436_
			     = i_3433_ - (((Class168_Sub2_Sub3) this).anInt9920
					  << 12))
			    >= 0) {
			    i_3436_ = (anInt9921 - i_3436_) / anInt9921;
			    i_3435_ += i_3436_;
			    i_3433_ += anInt9921 * i_3436_;
			    i_3434_ += anInt9922 * i_3436_;
			    i_3432_ += i_3436_;
			}
			if ((i_3436_ = (i_3433_ - anInt9921) / anInt9921)
			    > i_3435_)
			    i_3435_ = i_3436_;
			if (i_3434_ < 0) {
			    i_3436_ = (anInt9922 - 1 - i_3434_) / anInt9922;
			    i_3435_ += i_3436_;
			    i_3433_ += anInt9921 * i_3436_;
			    i_3434_ += anInt9922 * i_3436_;
			    i_3432_ += i_3436_;
			}
			if ((i_3436_
			     = (1 + i_3434_
				- (((Class168_Sub2_Sub3) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_3435_)
			    i_3435_ = i_3436_;
			for (/**/; i_3435_ < 0; i_3435_++) {
			    int i_3437_
				= (((i_3434_ >> 12)
				    * ((Class168_Sub2_Sub3) this).anInt9920)
				   + (i_3433_ >> 12));
			    int i_3438_ = i_3432_++;
			    if (i_3085_ == 0) {
				if (i == 1)
				    is[i_3438_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_3437_])
					     & 0xff)]);
				else if (i == 0) {
				    int i_3439_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_3437_])
					     & 0xff)]);
				    int i_3440_
					= ((i_3439_ & 0xff0000) * anInt9934
					   & ~0xffffff);
				    int i_3441_
					= ((i_3439_ & 0xff00) * anInt9913
					   & 0xff0000);
				    int i_3442_ = ((i_3439_ & 0xff) * anInt9936
						   & 0xff00);
				    is[i_3438_]
					= (i_3440_ | i_3441_ | i_3442_) >>> 8;
				} else if (i == 3) {
				    int i_3443_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_3437_])
					     & 0xff)]);
				    int i_3444_ = anInt9931;
				    int i_3445_ = i_3443_ + i_3444_;
				    int i_3446_ = ((i_3443_ & 0xff00ff)
						   + (i_3444_ & 0xff00ff));
				    int i_3447_
					= ((i_3446_ & 0x1000100)
					   + (i_3445_ - i_3446_ & 0x10000));
				    is[i_3438_]
					= (i_3445_ - i_3447_
					   | i_3447_ - (i_3447_ >>> 8));
				} else if (i == 2) {
				    int i_3448_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_3437_])
					     & 0xff)]);
				    int i_3449_
					= ((i_3448_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_3450_
					= ((i_3448_ & 0xff00) * anInt9932
					   & 0xff0000);
				    is[i_3438_] = (((i_3449_ | i_3450_) >>> 8)
						   + anInt9939);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3085_ == 1) {
				if (i == 1) {
				    int i_3451_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_3437_]);
				    if (i_3451_ != 0)
					is[i_3438_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3451_ & 0xff]);
				} else if (i == 0) {
				    int i_3452_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_3437_]);
				    if (i_3452_ != 0) {
					int i_3453_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3452_ & 0xff]);
					if ((anInt9931 & 0xffffff)
					    == 16777215) {
					    int i_3454_ = anInt9931 >>> 24;
					    int i_3455_ = 256 - i_3454_;
					    int i_3456_ = is[i_3438_];
					    is[i_3438_]
						= (((((i_3453_ & 0xff00ff)
						      * i_3454_)
						     + ((i_3456_ & 0xff00ff)
							* i_3455_))
						    & ~0xff00ff)
						   + ((((i_3453_ & 0xff00)
							* i_3454_)
						       + ((i_3456_ & 0xff00)
							  * i_3455_))
						      & 0xff0000)) >> 8;
					} else if (anInt9932 != 255) {
					    int i_3457_
						= (((i_3453_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_3458_ = (((i_3453_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_3459_
						= ((i_3453_ & 0xff) * anInt9936
						   & 0xff00);
					    i_3453_ = (i_3457_ | i_3458_
						       | i_3459_) >>> 8;
					    int i_3460_ = is[i_3438_];
					    is[i_3438_]
						= (((((i_3453_ & 0xff00ff)
						      * anInt9932)
						     + ((i_3460_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_3453_ & 0xff00)
							* anInt9932)
						       + ((i_3460_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					} else {
					    int i_3461_
						= (((i_3453_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_3462_ = (((i_3453_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_3463_
						= ((i_3453_ & 0xff) * anInt9936
						   & 0xff00);
					    is[i_3438_] = (i_3461_ | i_3462_
							   | i_3463_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_3464_ = (((Class168_Sub2_Sub3) this)
						    .aByteArray11205[i_3437_]);
				    int i_3465_
					= (i_3464_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_3464_])
					   : 0);
				    int i_3466_ = anInt9931;
				    int i_3467_ = i_3465_ + i_3466_;
				    int i_3468_ = ((i_3465_ & 0xff00ff)
						   + (i_3466_ & 0xff00ff));
				    int i_3469_
					= ((i_3468_ & 0x1000100)
					   + (i_3467_ - i_3468_ & 0x10000));
				    i_3469_ = (i_3467_ - i_3469_
					       | i_3469_ - (i_3469_ >>> 8));
				    if (i_3465_ == 0 && anInt9932 != 255) {
					i_3465_ = i_3469_;
					i_3469_ = is[i_3438_];
					i_3469_ = (((((i_3465_ & 0xff00ff)
						      * anInt9932)
						     + ((i_3469_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_3465_ & 0xff00)
							* anInt9932)
						       + ((i_3469_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3438_] = i_3469_;
				} else if (i == 2) {
				    int i_3470_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_3437_]);
				    if (i_3470_ != 0) {
					int i_3471_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3470_ & 0xff]);
					int i_3472_
					    = ((i_3471_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_3473_
					    = ((i_3471_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_3438_++] = ((i_3472_ | i_3473_)
							 >>> 8) + anInt9939;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3085_ == 2) {
				if (i == 1) {
				    int i_3474_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_3437_]);
				    if (i_3474_ != 0) {
					int i_3475_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3474_ & 0xff]);
					int i_3476_ = is[i_3438_];
					int i_3477_ = i_3475_ + i_3476_;
					int i_3478_ = ((i_3475_ & 0xff00ff)
						       + (i_3476_ & 0xff00ff));
					i_3476_ = ((i_3478_ & 0x1000100)
						   + (i_3477_ - i_3478_
						      & 0x10000));
					is[i_3438_]
					    = (i_3477_ - i_3476_
					       | i_3476_ - (i_3476_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_3479_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_3437_]);
				    if (i_3479_ != 0) {
					int i_3480_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3479_ & 0xff]);
					int i_3481_
					    = ((i_3480_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_3482_
					    = ((i_3480_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_3483_
					    = ((i_3480_ & 0xff) * anInt9936
					       & 0xff00);
					i_3480_ = (i_3481_ | i_3482_
						   | i_3483_) >>> 8;
					int i_3484_ = is[i_3438_];
					int i_3485_ = i_3480_ + i_3484_;
					int i_3486_ = ((i_3480_ & 0xff00ff)
						       + (i_3484_ & 0xff00ff));
					i_3484_ = ((i_3486_ & 0x1000100)
						   + (i_3485_ - i_3486_
						      & 0x10000));
					is[i_3438_]
					    = (i_3485_ - i_3484_
					       | i_3484_ - (i_3484_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_3487_ = (((Class168_Sub2_Sub3) this)
						    .aByteArray11205[i_3437_]);
				    int i_3488_
					= (i_3487_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_3487_])
					   : 0);
				    int i_3489_ = anInt9931;
				    int i_3490_ = i_3488_ + i_3489_;
				    int i_3491_ = ((i_3488_ & 0xff00ff)
						   + (i_3489_ & 0xff00ff));
				    int i_3492_
					= ((i_3491_ & 0x1000100)
					   + (i_3490_ - i_3491_ & 0x10000));
				    i_3492_ = (i_3490_ - i_3492_
					       | i_3492_ - (i_3492_ >>> 8));
				    if (i_3488_ == 0 && anInt9932 != 255) {
					i_3488_ = i_3492_;
					i_3492_ = is[i_3438_];
					i_3492_ = (((((i_3488_ & 0xff00ff)
						      * anInt9932)
						     + ((i_3492_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_3488_ & 0xff00)
							* anInt9932)
						       + ((i_3492_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3438_] = i_3492_;
				} else if (i == 2) {
				    int i_3493_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_3437_]);
				    if (i_3493_ != 0) {
					int i_3494_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3493_ & 0xff]);
					int i_3495_
					    = ((i_3494_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_3496_
					    = ((i_3494_ & 0xff00) * anInt9932
					       & 0xff0000);
					i_3494_ = (((i_3495_ | i_3496_) >>> 8)
						   + anInt9939);
					int i_3497_ = is[i_3438_];
					int i_3498_ = i_3494_ + i_3497_;
					int i_3499_ = ((i_3494_ & 0xff00ff)
						       + (i_3497_ & 0xff00ff));
					i_3497_ = ((i_3499_ & 0x1000100)
						   + (i_3498_ - i_3499_
						      & 0x10000));
					is[i_3438_]
					    = (i_3498_ - i_3497_
					       | i_3497_ - (i_3497_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_3433_ += anInt9921;
			    i_3434_ += anInt9922;
			}
			i_3431_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_3500_ = anInt9919;
		while (i_3500_ < 0) {
		    int i_3501_ = anInt9925;
		    int i_3502_ = anInt9927 + anInt9929;
		    int i_3503_ = anInt9928;
		    int i_3504_ = anInt9906;
		    if (i_3503_ >= 0
			&& i_3503_ - (((Class168_Sub2_Sub3) this).anInt9916
				      << 12) < 0) {
			if (i_3502_ < 0) {
			    int i_3505_
				= (anInt9921 - 1 - i_3502_) / anInt9921;
			    i_3504_ += i_3505_;
			    i_3502_ += anInt9921 * i_3505_;
			    i_3501_ += i_3505_;
			}
			int i_3506_;
			if ((i_3506_
			     = (1 + i_3502_
				- (((Class168_Sub2_Sub3) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_3504_)
			    i_3504_ = i_3506_;
			for (/**/; i_3504_ < 0; i_3504_++) {
			    int i_3507_
				= (((i_3503_ >> 12)
				    * ((Class168_Sub2_Sub3) this).anInt9920)
				   + (i_3502_ >> 12));
			    int i_3508_ = i_3501_++;
			    if (i_3085_ == 0) {
				if (i == 1)
				    is[i_3508_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_3507_])
					     & 0xff)]);
				else if (i == 0) {
				    int i_3509_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_3507_])
					     & 0xff)]);
				    int i_3510_
					= ((i_3509_ & 0xff0000) * anInt9934
					   & ~0xffffff);
				    int i_3511_
					= ((i_3509_ & 0xff00) * anInt9913
					   & 0xff0000);
				    int i_3512_ = ((i_3509_ & 0xff) * anInt9936
						   & 0xff00);
				    is[i_3508_]
					= (i_3510_ | i_3511_ | i_3512_) >>> 8;
				} else if (i == 3) {
				    int i_3513_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_3507_])
					     & 0xff)]);
				    int i_3514_ = anInt9931;
				    int i_3515_ = i_3513_ + i_3514_;
				    int i_3516_ = ((i_3513_ & 0xff00ff)
						   + (i_3514_ & 0xff00ff));
				    int i_3517_
					= ((i_3516_ & 0x1000100)
					   + (i_3515_ - i_3516_ & 0x10000));
				    is[i_3508_]
					= (i_3515_ - i_3517_
					   | i_3517_ - (i_3517_ >>> 8));
				} else if (i == 2) {
				    int i_3518_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205[i_3507_])
					     & 0xff)]);
				    int i_3519_
					= ((i_3518_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_3520_
					= ((i_3518_ & 0xff00) * anInt9932
					   & 0xff0000);
				    is[i_3508_] = (((i_3519_ | i_3520_) >>> 8)
						   + anInt9939);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3085_ == 1) {
				if (i == 1) {
				    int i_3521_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_3507_]);
				    if (i_3521_ != 0)
					is[i_3508_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3521_ & 0xff]);
				} else if (i == 0) {
				    int i_3522_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_3507_]);
				    if (i_3522_ != 0) {
					int i_3523_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3522_ & 0xff]);
					if ((anInt9931 & 0xffffff)
					    == 16777215) {
					    int i_3524_ = anInt9931 >>> 24;
					    int i_3525_ = 256 - i_3524_;
					    int i_3526_ = is[i_3508_];
					    is[i_3508_]
						= (((((i_3523_ & 0xff00ff)
						      * i_3524_)
						     + ((i_3526_ & 0xff00ff)
							* i_3525_))
						    & ~0xff00ff)
						   + ((((i_3523_ & 0xff00)
							* i_3524_)
						       + ((i_3526_ & 0xff00)
							  * i_3525_))
						      & 0xff0000)) >> 8;
					} else if (anInt9932 != 255) {
					    int i_3527_
						= (((i_3523_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_3528_ = (((i_3523_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_3529_
						= ((i_3523_ & 0xff) * anInt9936
						   & 0xff00);
					    i_3523_ = (i_3527_ | i_3528_
						       | i_3529_) >>> 8;
					    int i_3530_ = is[i_3508_];
					    is[i_3508_]
						= (((((i_3523_ & 0xff00ff)
						      * anInt9932)
						     + ((i_3530_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_3523_ & 0xff00)
							* anInt9932)
						       + ((i_3530_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
					} else {
					    int i_3531_
						= (((i_3523_ & 0xff0000)
						    * anInt9934)
						   & ~0xffffff);
					    int i_3532_ = (((i_3523_ & 0xff00)
							    * anInt9913)
							   & 0xff0000);
					    int i_3533_
						= ((i_3523_ & 0xff) * anInt9936
						   & 0xff00);
					    is[i_3508_] = (i_3531_ | i_3532_
							   | i_3533_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_3534_ = (((Class168_Sub2_Sub3) this)
						    .aByteArray11205[i_3507_]);
				    int i_3535_
					= (i_3534_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_3534_])
					   : 0);
				    int i_3536_ = anInt9931;
				    int i_3537_ = i_3535_ + i_3536_;
				    int i_3538_ = ((i_3535_ & 0xff00ff)
						   + (i_3536_ & 0xff00ff));
				    int i_3539_
					= ((i_3538_ & 0x1000100)
					   + (i_3537_ - i_3538_ & 0x10000));
				    i_3539_ = (i_3537_ - i_3539_
					       | i_3539_ - (i_3539_ >>> 8));
				    if (i_3535_ == 0 && anInt9932 != 255) {
					i_3535_ = i_3539_;
					i_3539_ = is[i_3508_];
					i_3539_ = (((((i_3535_ & 0xff00ff)
						      * anInt9932)
						     + ((i_3539_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_3535_ & 0xff00)
							* anInt9932)
						       + ((i_3539_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3508_] = i_3539_;
				} else if (i == 2) {
				    int i_3540_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_3507_]);
				    if (i_3540_ != 0) {
					int i_3541_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3540_ & 0xff]);
					int i_3542_
					    = ((i_3541_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_3543_
					    = ((i_3541_ & 0xff00) * anInt9932
					       & 0xff0000);
					is[i_3508_++] = ((i_3542_ | i_3543_)
							 >>> 8) + anInt9939;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3085_ == 2) {
				if (i == 1) {
				    int i_3544_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_3507_]);
				    if (i_3544_ != 0) {
					int i_3545_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3544_ & 0xff]);
					int i_3546_ = is[i_3508_];
					int i_3547_ = i_3545_ + i_3546_;
					int i_3548_ = ((i_3545_ & 0xff00ff)
						       + (i_3546_ & 0xff00ff));
					i_3546_ = ((i_3548_ & 0x1000100)
						   + (i_3547_ - i_3548_
						      & 0x10000));
					is[i_3508_]
					    = (i_3547_ - i_3546_
					       | i_3546_ - (i_3546_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_3549_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_3507_]);
				    if (i_3549_ != 0) {
					int i_3550_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3549_ & 0xff]);
					int i_3551_
					    = ((i_3550_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_3552_
					    = ((i_3550_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_3553_
					    = ((i_3550_ & 0xff) * anInt9936
					       & 0xff00);
					i_3550_ = (i_3551_ | i_3552_
						   | i_3553_) >>> 8;
					int i_3554_ = is[i_3508_];
					int i_3555_ = i_3550_ + i_3554_;
					int i_3556_ = ((i_3550_ & 0xff00ff)
						       + (i_3554_ & 0xff00ff));
					i_3554_ = ((i_3556_ & 0x1000100)
						   + (i_3555_ - i_3556_
						      & 0x10000));
					is[i_3508_]
					    = (i_3555_ - i_3554_
					       | i_3554_ - (i_3554_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_3557_ = (((Class168_Sub2_Sub3) this)
						    .aByteArray11205[i_3507_]);
				    int i_3558_
					= (i_3557_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_3557_])
					   : 0);
				    int i_3559_ = anInt9931;
				    int i_3560_ = i_3558_ + i_3559_;
				    int i_3561_ = ((i_3558_ & 0xff00ff)
						   + (i_3559_ & 0xff00ff));
				    int i_3562_
					= ((i_3561_ & 0x1000100)
					   + (i_3560_ - i_3561_ & 0x10000));
				    i_3562_ = (i_3560_ - i_3562_
					       | i_3562_ - (i_3562_ >>> 8));
				    if (i_3558_ == 0 && anInt9932 != 255) {
					i_3558_ = i_3562_;
					i_3562_ = is[i_3508_];
					i_3562_ = (((((i_3558_ & 0xff00ff)
						      * anInt9932)
						     + ((i_3562_ & 0xff00ff)
							* anInt9937))
						    & ~0xff00ff)
						   + ((((i_3558_ & 0xff00)
							* anInt9932)
						       + ((i_3562_ & 0xff00)
							  * anInt9937))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3508_] = i_3562_;
				} else if (i == 2) {
				    int i_3563_ = (((Class168_Sub2_Sub3) this)
						   .aByteArray11205[i_3507_]);
				    if (i_3563_ != 0) {
					int i_3564_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3563_ & 0xff]);
					int i_3565_
					    = ((i_3564_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
					int i_3566_
					    = ((i_3564_ & 0xff00) * anInt9932
					       & 0xff0000);
					i_3564_ = (((i_3565_ | i_3566_) >>> 8)
						   + anInt9939);
					int i_3567_ = is[i_3508_];
					int i_3568_ = i_3564_ + i_3567_;
					int i_3569_ = ((i_3564_ & 0xff00ff)
						       + (i_3567_ & 0xff00ff));
					i_3567_ = ((i_3569_ & 0x1000100)
						   + (i_3568_ - i_3569_
						      & 0x10000));
					is[i_3508_]
					    = (i_3568_ - i_3567_
					       | i_3567_ - (i_3567_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_3502_ += anInt9921;
			}
		    }
		    i_3500_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		for (int i_3570_ = anInt9919; i_3570_ < 0; i_3570_++) {
		    int i_3571_ = anInt9925;
		    int i_3572_ = anInt9927 + anInt9929;
		    int i_3573_ = anInt9928 + anInt9930;
		    int i_3574_ = anInt9906;
		    if (i_3572_ < 0) {
			int i_3575_ = (anInt9921 - 1 - i_3572_) / anInt9921;
			i_3574_ += i_3575_;
			i_3572_ += anInt9921 * i_3575_;
			i_3573_ += anInt9922 * i_3575_;
			i_3571_ += i_3575_;
		    }
		    int i_3576_;
		    if ((i_3576_
			 = (1 + i_3572_
			    - (((Class168_Sub2_Sub3) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_3574_)
			i_3574_ = i_3576_;
		    if ((i_3576_
			 = i_3573_ - (((Class168_Sub2_Sub3) this).anInt9916
				      << 12))
			>= 0) {
			i_3576_ = (anInt9922 - i_3576_) / anInt9922;
			i_3574_ += i_3576_;
			i_3572_ += anInt9921 * i_3576_;
			i_3573_ += anInt9922 * i_3576_;
			i_3571_ += i_3576_;
		    }
		    if ((i_3576_ = (i_3573_ - anInt9922) / anInt9922)
			> i_3574_)
			i_3574_ = i_3576_;
		    for (/**/; i_3574_ < 0; i_3574_++) {
			int i_3577_
			    = (((i_3573_ >> 12)
				* ((Class168_Sub2_Sub3) this).anInt9920)
			       + (i_3572_ >> 12));
			int i_3578_ = i_3571_++;
			if (i_3085_ == 0) {
			    if (i == 1)
				is[i_3578_]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_3577_]) & 0xff]);
			    else if (i == 0) {
				int i_3579_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_3577_]) & 0xff]);
				int i_3580_ = ((i_3579_ & 0xff0000) * anInt9934
					       & ~0xffffff);
				int i_3581_ = ((i_3579_ & 0xff00) * anInt9913
					       & 0xff0000);
				int i_3582_
				    = (i_3579_ & 0xff) * anInt9936 & 0xff00;
				is[i_3578_]
				    = (i_3580_ | i_3581_ | i_3582_) >>> 8;
			    } else if (i == 3) {
				int i_3583_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_3577_]) & 0xff]);
				int i_3584_ = anInt9931;
				int i_3585_ = i_3583_ + i_3584_;
				int i_3586_ = ((i_3583_ & 0xff00ff)
					       + (i_3584_ & 0xff00ff));
				int i_3587_
				    = ((i_3586_ & 0x1000100)
				       + (i_3585_ - i_3586_ & 0x10000));
				is[i_3578_]
				    = i_3585_ - i_3587_ | i_3587_ - (i_3587_
								     >>> 8);
			    } else if (i == 2) {
				int i_3588_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_3577_]) & 0xff]);
				int i_3589_ = ((i_3588_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
				int i_3590_ = ((i_3588_ & 0xff00) * anInt9932
					       & 0xff0000);
				is[i_3578_]
				    = ((i_3589_ | i_3590_) >>> 8) + anInt9939;
			    } else
				throw new IllegalArgumentException();
			} else if (i_3085_ == 1) {
			    if (i == 1) {
				int i_3591_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3577_]);
				if (i_3591_ != 0)
				    is[i_3578_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3591_ & 0xff]);
			    } else if (i == 0) {
				int i_3592_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3577_]);
				if (i_3592_ != 0) {
				    int i_3593_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3592_ & 0xff]);
				    if ((anInt9931 & 0xffffff) == 16777215) {
					int i_3594_ = anInt9931 >>> 24;
					int i_3595_ = 256 - i_3594_;
					int i_3596_ = is[i_3578_];
					is[i_3578_]
					    = ((((i_3593_ & 0xff00ff) * i_3594_
						 + ((i_3596_ & 0xff00ff)
						    * i_3595_))
						& ~0xff00ff)
					       + (((i_3593_ & 0xff00) * i_3594_
						   + ((i_3596_ & 0xff00)
						      * i_3595_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9932 != 255) {
					int i_3597_
					    = ((i_3593_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_3598_
					    = ((i_3593_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_3599_
					    = ((i_3593_ & 0xff) * anInt9936
					       & 0xff00);
					i_3593_ = (i_3597_ | i_3598_
						   | i_3599_) >>> 8;
					int i_3600_ = is[i_3578_];
					is[i_3578_]
					    = (((((i_3593_ & 0xff00ff)
						  * anInt9932)
						 + ((i_3600_ & 0xff00ff)
						    * anInt9937))
						& ~0xff00ff)
					       + ((((i_3593_ & 0xff00)
						    * anInt9932)
						   + ((i_3600_ & 0xff00)
						      * anInt9937))
						  & 0xff0000)) >> 8;
				    } else {
					int i_3601_
					    = ((i_3593_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_3602_
					    = ((i_3593_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_3603_
					    = ((i_3593_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_3578_] = (i_3601_ | i_3602_
						       | i_3603_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_3604_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205[i_3577_]);
				int i_3605_ = (i_3604_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_3604_])
					       : 0);
				int i_3606_ = anInt9931;
				int i_3607_ = i_3605_ + i_3606_;
				int i_3608_ = ((i_3605_ & 0xff00ff)
					       + (i_3606_ & 0xff00ff));
				int i_3609_
				    = ((i_3608_ & 0x1000100)
				       + (i_3607_ - i_3608_ & 0x10000));
				i_3609_
				    = i_3607_ - i_3609_ | i_3609_ - (i_3609_
								     >>> 8);
				if (i_3605_ == 0 && anInt9932 != 255) {
				    i_3605_ = i_3609_;
				    i_3609_ = is[i_3578_];
				    i_3609_
					= ((((i_3605_ & 0xff00ff) * anInt9932
					     + ((i_3609_ & 0xff00ff)
						* anInt9937))
					    & ~0xff00ff)
					   + (((i_3605_ & 0xff00) * anInt9932
					       + ((i_3609_ & 0xff00)
						  * anInt9937))
					      & 0xff0000)) >> 8;
				}
				is[i_3578_] = i_3609_;
			    } else if (i == 2) {
				int i_3610_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3577_]);
				if (i_3610_ != 0) {
				    int i_3611_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3610_ & 0xff]);
				    int i_3612_
					= ((i_3611_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_3613_
					= ((i_3611_ & 0xff00) * anInt9932
					   & 0xff0000);
				    is[i_3578_++] = ((i_3612_ | i_3613_)
						     >>> 8) + anInt9939;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_3085_ == 2) {
			    if (i == 1) {
				int i_3614_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3577_]);
				if (i_3614_ != 0) {
				    int i_3615_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3614_ & 0xff]);
				    int i_3616_ = is[i_3578_];
				    int i_3617_ = i_3615_ + i_3616_;
				    int i_3618_ = ((i_3615_ & 0xff00ff)
						   + (i_3616_ & 0xff00ff));
				    i_3616_
					= ((i_3618_ & 0x1000100)
					   + (i_3617_ - i_3618_ & 0x10000));
				    is[i_3578_]
					= (i_3617_ - i_3616_
					   | i_3616_ - (i_3616_ >>> 8));
				}
			    } else if (i == 0) {
				int i_3619_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3577_]);
				if (i_3619_ != 0) {
				    int i_3620_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3619_ & 0xff]);
				    int i_3621_
					= ((i_3620_ & 0xff0000) * anInt9934
					   & ~0xffffff);
				    int i_3622_
					= ((i_3620_ & 0xff00) * anInt9913
					   & 0xff0000);
				    int i_3623_ = ((i_3620_ & 0xff) * anInt9936
						   & 0xff00);
				    i_3620_
					= (i_3621_ | i_3622_ | i_3623_) >>> 8;
				    int i_3624_ = is[i_3578_];
				    int i_3625_ = i_3620_ + i_3624_;
				    int i_3626_ = ((i_3620_ & 0xff00ff)
						   + (i_3624_ & 0xff00ff));
				    i_3624_
					= ((i_3626_ & 0x1000100)
					   + (i_3625_ - i_3626_ & 0x10000));
				    is[i_3578_]
					= (i_3625_ - i_3624_
					   | i_3624_ - (i_3624_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_3627_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205[i_3577_]);
				int i_3628_ = (i_3627_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_3627_])
					       : 0);
				int i_3629_ = anInt9931;
				int i_3630_ = i_3628_ + i_3629_;
				int i_3631_ = ((i_3628_ & 0xff00ff)
					       + (i_3629_ & 0xff00ff));
				int i_3632_
				    = ((i_3631_ & 0x1000100)
				       + (i_3630_ - i_3631_ & 0x10000));
				i_3632_
				    = i_3630_ - i_3632_ | i_3632_ - (i_3632_
								     >>> 8);
				if (i_3628_ == 0 && anInt9932 != 255) {
				    i_3628_ = i_3632_;
				    i_3632_ = is[i_3578_];
				    i_3632_
					= ((((i_3628_ & 0xff00ff) * anInt9932
					     + ((i_3632_ & 0xff00ff)
						* anInt9937))
					    & ~0xff00ff)
					   + (((i_3628_ & 0xff00) * anInt9932
					       + ((i_3632_ & 0xff00)
						  * anInt9937))
					      & 0xff0000)) >> 8;
				}
				is[i_3578_] = i_3632_;
			    } else if (i == 2) {
				int i_3633_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3577_]);
				if (i_3633_ != 0) {
				    int i_3634_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3633_ & 0xff]);
				    int i_3635_
					= ((i_3634_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_3636_
					= ((i_3634_ & 0xff00) * anInt9932
					   & 0xff0000);
				    i_3634_ = (((i_3635_ | i_3636_) >>> 8)
					       + anInt9939);
				    int i_3637_ = is[i_3578_];
				    int i_3638_ = i_3634_ + i_3637_;
				    int i_3639_ = ((i_3634_ & 0xff00ff)
						   + (i_3637_ & 0xff00ff));
				    i_3637_
					= ((i_3639_ & 0x1000100)
					   + (i_3638_ - i_3639_ & 0x10000));
				    is[i_3578_]
					= (i_3638_ - i_3637_
					   | i_3637_ - (i_3637_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_3572_ += anInt9921;
			i_3573_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		for (int i_3640_ = anInt9919; i_3640_ < 0; i_3640_++) {
		    int i_3641_ = anInt9925;
		    int i_3642_ = anInt9927 + anInt9929;
		    int i_3643_ = anInt9928 + anInt9930;
		    int i_3644_ = anInt9906;
		    if (i_3642_ < 0) {
			int i_3645_ = (anInt9921 - 1 - i_3642_) / anInt9921;
			i_3644_ += i_3645_;
			i_3642_ += anInt9921 * i_3645_;
			i_3643_ += anInt9922 * i_3645_;
			i_3641_ += i_3645_;
		    }
		    int i_3646_;
		    if ((i_3646_
			 = (1 + i_3642_
			    - (((Class168_Sub2_Sub3) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_3644_)
			i_3644_ = i_3646_;
		    if (i_3643_ < 0) {
			i_3646_ = (anInt9922 - 1 - i_3643_) / anInt9922;
			i_3644_ += i_3646_;
			i_3642_ += anInt9921 * i_3646_;
			i_3643_ += anInt9922 * i_3646_;
			i_3641_ += i_3646_;
		    }
		    if ((i_3646_
			 = (1 + i_3643_
			    - (((Class168_Sub2_Sub3) this).anInt9916 << 12)
			    - anInt9922) / anInt9922)
			> i_3644_)
			i_3644_ = i_3646_;
		    for (/**/; i_3644_ < 0; i_3644_++) {
			int i_3647_
			    = (((i_3643_ >> 12)
				* ((Class168_Sub2_Sub3) this).anInt9920)
			       + (i_3642_ >> 12));
			int i_3648_ = i_3641_++;
			if (i_3085_ == 0) {
			    if (i == 1)
				is[i_3648_]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_3647_]) & 0xff]);
			    else if (i == 0) {
				int i_3649_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_3647_]) & 0xff]);
				int i_3650_ = ((i_3649_ & 0xff0000) * anInt9934
					       & ~0xffffff);
				int i_3651_ = ((i_3649_ & 0xff00) * anInt9913
					       & 0xff0000);
				int i_3652_
				    = (i_3649_ & 0xff) * anInt9936 & 0xff00;
				is[i_3648_]
				    = (i_3650_ | i_3651_ | i_3652_) >>> 8;
			    } else if (i == 3) {
				int i_3653_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_3647_]) & 0xff]);
				int i_3654_ = anInt9931;
				int i_3655_ = i_3653_ + i_3654_;
				int i_3656_ = ((i_3653_ & 0xff00ff)
					       + (i_3654_ & 0xff00ff));
				int i_3657_
				    = ((i_3656_ & 0x1000100)
				       + (i_3655_ - i_3656_ & 0x10000));
				is[i_3648_]
				    = i_3655_ - i_3657_ | i_3657_ - (i_3657_
								     >>> 8);
			    } else if (i == 2) {
				int i_3658_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205[i_3647_]) & 0xff]);
				int i_3659_ = ((i_3658_ & 0xff00ff) * anInt9932
					       & ~0xff00ff);
				int i_3660_ = ((i_3658_ & 0xff00) * anInt9932
					       & 0xff0000);
				is[i_3648_]
				    = ((i_3659_ | i_3660_) >>> 8) + anInt9939;
			    } else
				throw new IllegalArgumentException();
			} else if (i_3085_ == 1) {
			    if (i == 1) {
				int i_3661_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3647_]);
				if (i_3661_ != 0)
				    is[i_3648_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3661_ & 0xff]);
			    } else if (i == 0) {
				int i_3662_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3647_]);
				if (i_3662_ != 0) {
				    int i_3663_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3662_ & 0xff]);
				    if ((anInt9931 & 0xffffff) == 16777215) {
					int i_3664_ = anInt9931 >>> 24;
					int i_3665_ = 256 - i_3664_;
					int i_3666_ = is[i_3648_];
					is[i_3648_]
					    = ((((i_3663_ & 0xff00ff) * i_3664_
						 + ((i_3666_ & 0xff00ff)
						    * i_3665_))
						& ~0xff00ff)
					       + (((i_3663_ & 0xff00) * i_3664_
						   + ((i_3666_ & 0xff00)
						      * i_3665_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9932 != 255) {
					int i_3667_
					    = ((i_3663_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_3668_
					    = ((i_3663_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_3669_
					    = ((i_3663_ & 0xff) * anInt9936
					       & 0xff00);
					i_3663_ = (i_3667_ | i_3668_
						   | i_3669_) >>> 8;
					int i_3670_ = is[i_3648_];
					is[i_3648_]
					    = (((((i_3663_ & 0xff00ff)
						  * anInt9932)
						 + ((i_3670_ & 0xff00ff)
						    * anInt9937))
						& ~0xff00ff)
					       + ((((i_3663_ & 0xff00)
						    * anInt9932)
						   + ((i_3670_ & 0xff00)
						      * anInt9937))
						  & 0xff0000)) >> 8;
				    } else {
					int i_3671_
					    = ((i_3663_ & 0xff0000) * anInt9934
					       & ~0xffffff);
					int i_3672_
					    = ((i_3663_ & 0xff00) * anInt9913
					       & 0xff0000);
					int i_3673_
					    = ((i_3663_ & 0xff) * anInt9936
					       & 0xff00);
					is[i_3648_] = (i_3671_ | i_3672_
						       | i_3673_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_3674_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205[i_3647_]);
				int i_3675_ = (i_3674_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_3674_])
					       : 0);
				int i_3676_ = anInt9931;
				int i_3677_ = i_3675_ + i_3676_;
				int i_3678_ = ((i_3675_ & 0xff00ff)
					       + (i_3676_ & 0xff00ff));
				int i_3679_
				    = ((i_3678_ & 0x1000100)
				       + (i_3677_ - i_3678_ & 0x10000));
				i_3679_
				    = i_3677_ - i_3679_ | i_3679_ - (i_3679_
								     >>> 8);
				if (i_3675_ == 0 && anInt9932 != 255) {
				    i_3675_ = i_3679_;
				    i_3679_ = is[i_3648_];
				    i_3679_
					= ((((i_3675_ & 0xff00ff) * anInt9932
					     + ((i_3679_ & 0xff00ff)
						* anInt9937))
					    & ~0xff00ff)
					   + (((i_3675_ & 0xff00) * anInt9932
					       + ((i_3679_ & 0xff00)
						  * anInt9937))
					      & 0xff0000)) >> 8;
				}
				is[i_3648_] = i_3679_;
			    } else if (i == 2) {
				int i_3680_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3647_]);
				if (i_3680_ != 0) {
				    int i_3681_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3680_ & 0xff]);
				    int i_3682_
					= ((i_3681_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_3683_
					= ((i_3681_ & 0xff00) * anInt9932
					   & 0xff0000);
				    is[i_3648_++] = ((i_3682_ | i_3683_)
						     >>> 8) + anInt9939;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_3085_ == 2) {
			    if (i == 1) {
				int i_3684_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3647_]);
				if (i_3684_ != 0) {
				    int i_3685_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3684_ & 0xff]);
				    int i_3686_ = is[i_3648_];
				    int i_3687_ = i_3685_ + i_3686_;
				    int i_3688_ = ((i_3685_ & 0xff00ff)
						   + (i_3686_ & 0xff00ff));
				    i_3686_
					= ((i_3688_ & 0x1000100)
					   + (i_3687_ - i_3688_ & 0x10000));
				    is[i_3648_]
					= (i_3687_ - i_3686_
					   | i_3686_ - (i_3686_ >>> 8));
				}
			    } else if (i == 0) {
				int i_3689_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3647_]);
				if (i_3689_ != 0) {
				    int i_3690_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3689_ & 0xff]);
				    int i_3691_
					= ((i_3690_ & 0xff0000) * anInt9934
					   & ~0xffffff);
				    int i_3692_
					= ((i_3690_ & 0xff00) * anInt9913
					   & 0xff0000);
				    int i_3693_ = ((i_3690_ & 0xff) * anInt9936
						   & 0xff00);
				    i_3690_
					= (i_3691_ | i_3692_ | i_3693_) >>> 8;
				    int i_3694_ = is[i_3648_];
				    int i_3695_ = i_3690_ + i_3694_;
				    int i_3696_ = ((i_3690_ & 0xff00ff)
						   + (i_3694_ & 0xff00ff));
				    i_3694_
					= ((i_3696_ & 0x1000100)
					   + (i_3695_ - i_3696_ & 0x10000));
				    is[i_3648_]
					= (i_3695_ - i_3694_
					   | i_3694_ - (i_3694_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_3697_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205[i_3647_]);
				int i_3698_ = (i_3697_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_3697_])
					       : 0);
				int i_3699_ = anInt9931;
				int i_3700_ = i_3698_ + i_3699_;
				int i_3701_ = ((i_3698_ & 0xff00ff)
					       + (i_3699_ & 0xff00ff));
				int i_3702_
				    = ((i_3701_ & 0x1000100)
				       + (i_3700_ - i_3701_ & 0x10000));
				i_3702_
				    = i_3700_ - i_3702_ | i_3702_ - (i_3702_
								     >>> 8);
				if (i_3698_ == 0 && anInt9932 != 255) {
				    i_3698_ = i_3702_;
				    i_3702_ = is[i_3648_];
				    i_3702_
					= ((((i_3698_ & 0xff00ff) * anInt9932
					     + ((i_3702_ & 0xff00ff)
						* anInt9937))
					    & ~0xff00ff)
					   + (((i_3698_ & 0xff00) * anInt9932
					       + ((i_3702_ & 0xff00)
						  * anInt9937))
					      & 0xff0000)) >> 8;
				}
				is[i_3648_] = i_3702_;
			    } else if (i == 2) {
				int i_3703_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205[i_3647_]);
				if (i_3703_ != 0) {
				    int i_3704_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3703_ & 0xff]);
				    int i_3705_
					= ((i_3704_ & 0xff00ff) * anInt9932
					   & ~0xff00ff);
				    int i_3706_
					= ((i_3704_ & 0xff00) * anInt9932
					   & 0xff0000);
				    i_3704_ = (((i_3705_ | i_3706_) >>> 8)
					       + anInt9939);
				    int i_3707_ = is[i_3648_];
				    int i_3708_ = i_3704_ + i_3707_;
				    int i_3709_ = ((i_3704_ & 0xff00ff)
						   + (i_3707_ & 0xff00ff));
				    i_3707_
					= ((i_3709_ & 0x1000100)
					   + (i_3708_ - i_3709_ & 0x10000));
				    is[i_3648_]
					= (i_3708_ - i_3707_
					   | i_3707_ - (i_3707_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_3642_ += anInt9921;
			i_3643_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    void method16230(int[] is, int[] is_3710_, int i, int i_3711_) {
	int[] is_3712_ = (((Class103_Sub2)
			   ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			  .anIntArray9245);
	if (is_3712_ != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_3713_ = anInt9919;
		    while (i_3713_ < 0) {
			int i_3714_ = i_3713_ + i_3711_;
			if (i_3714_ >= 0) {
			    if (i_3714_ >= is.length)
				break;
			    int i_3715_ = anInt9925;
			    int i_3716_ = anInt9927;
			    int i_3717_ = anInt9928;
			    int i_3718_ = anInt9906;
			    if (i_3716_ >= 0 && i_3717_ >= 0
				&& (i_3716_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)) < 0
				&& (i_3717_
				    - (((Class168_Sub2_Sub3) this).anInt9916
				       << 12)) < 0) {
				int i_3719_ = is[i_3714_] - i;
				int i_3720_ = -is_3710_[i_3714_];
				int i_3721_ = i_3719_ - (i_3715_ - anInt9925);
				if (i_3721_ > 0) {
				    i_3715_ += i_3721_;
				    i_3718_ += i_3721_;
				    i_3716_ += anInt9921 * i_3721_;
				    i_3717_ += anInt9922 * i_3721_;
				} else
				    i_3720_ -= i_3721_;
				if (i_3718_ < i_3720_)
				    i_3718_ = i_3720_;
				for (/**/; i_3718_ < 0; i_3718_++) {
				    int i_3722_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(((i_3717_ >> 12)
					      * (((Class168_Sub2_Sub3) this)
						 .anInt9920))
					     + (i_3716_ >> 12))]);
				    if (i_3722_ != 0)
					is_3712_[i_3715_++]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3722_ & 0xff]);
				    else
					i_3715_++;
				}
			    }
			}
			i_3713_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_3723_ = anInt9919;
		    while (i_3723_ < 0) {
			int i_3724_ = i_3723_ + i_3711_;
			if (i_3724_ >= 0) {
			    if (i_3724_ >= is.length)
				break;
			    int i_3725_ = anInt9925;
			    int i_3726_ = anInt9927;
			    int i_3727_ = anInt9928 + anInt9930;
			    int i_3728_ = anInt9906;
			    if (i_3726_ >= 0
				&& (i_3726_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)) < 0) {
				int i_3729_;
				if ((i_3729_
				     = i_3727_ - ((((Class168_Sub2_Sub3) this)
						   .anInt9916)
						  << 12))
				    >= 0) {
				    i_3729_
					= (anInt9922 - i_3729_) / anInt9922;
				    i_3728_ += i_3729_;
				    i_3727_ += anInt9922 * i_3729_;
				    i_3725_ += i_3729_;
				}
				if ((i_3729_
				     = (i_3727_ - anInt9922) / anInt9922)
				    > i_3728_)
				    i_3728_ = i_3729_;
				int i_3730_ = is[i_3724_] - i;
				int i_3731_ = -is_3710_[i_3724_];
				int i_3732_ = i_3730_ - (i_3725_ - anInt9925);
				if (i_3732_ > 0) {
				    i_3725_ += i_3732_;
				    i_3728_ += i_3732_;
				    i_3726_ += anInt9921 * i_3732_;
				    i_3727_ += anInt9922 * i_3732_;
				} else
				    i_3731_ -= i_3732_;
				if (i_3728_ < i_3731_)
				    i_3728_ = i_3731_;
				for (/**/; i_3728_ < 0; i_3728_++) {
				    int i_3733_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(((i_3727_ >> 12)
					      * (((Class168_Sub2_Sub3) this)
						 .anInt9920))
					     + (i_3726_ >> 12))]);
				    if (i_3733_ != 0)
					is_3712_[i_3725_++]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3733_ & 0xff]);
				    else
					i_3725_++;
				    i_3727_ += anInt9922;
				}
			    }
			}
			i_3723_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_3734_ = anInt9919;
		    while (i_3734_ < 0) {
			int i_3735_ = i_3734_ + i_3711_;
			if (i_3735_ >= 0) {
			    if (i_3735_ >= is.length)
				break;
			    int i_3736_ = anInt9925;
			    int i_3737_ = anInt9927;
			    int i_3738_ = anInt9928 + anInt9930;
			    int i_3739_ = anInt9906;
			    if (i_3737_ >= 0
				&& (i_3737_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)) < 0) {
				if (i_3738_ < 0) {
				    int i_3740_ = ((anInt9922 - 1 - i_3738_)
						   / anInt9922);
				    i_3739_ += i_3740_;
				    i_3738_ += anInt9922 * i_3740_;
				    i_3736_ += i_3740_;
				}
				int i_3741_;
				if ((i_3741_ = (1 + i_3738_
						- ((((Class168_Sub2_Sub3) this)
						    .anInt9916)
						   << 12)
						- anInt9922) / anInt9922)
				    > i_3739_)
				    i_3739_ = i_3741_;
				int i_3742_ = is[i_3735_] - i;
				int i_3743_ = -is_3710_[i_3735_];
				int i_3744_ = i_3742_ - (i_3736_ - anInt9925);
				if (i_3744_ > 0) {
				    i_3736_ += i_3744_;
				    i_3739_ += i_3744_;
				    i_3737_ += anInt9921 * i_3744_;
				    i_3738_ += anInt9922 * i_3744_;
				} else
				    i_3743_ -= i_3744_;
				if (i_3739_ < i_3743_)
				    i_3739_ = i_3743_;
				for (/**/; i_3739_ < 0; i_3739_++) {
				    int i_3745_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(((i_3738_ >> 12)
					      * (((Class168_Sub2_Sub3) this)
						 .anInt9920))
					     + (i_3737_ >> 12))]);
				    if (i_3745_ != 0)
					is_3712_[i_3736_++]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3745_ & 0xff]);
				    else
					i_3736_++;
				    i_3738_ += anInt9922;
				}
			    }
			}
			i_3734_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_3746_ = anInt9919;
		    while (i_3746_ < 0) {
			int i_3747_ = i_3746_ + i_3711_;
			if (i_3747_ >= 0) {
			    if (i_3747_ >= is.length)
				break;
			    int i_3748_ = anInt9925;
			    int i_3749_ = anInt9927 + anInt9929;
			    int i_3750_ = anInt9928;
			    int i_3751_ = anInt9906;
			    if (i_3750_ >= 0
				&& (i_3750_
				    - (((Class168_Sub2_Sub3) this).anInt9916
				       << 12)) < 0) {
				int i_3752_;
				if ((i_3752_
				     = i_3749_ - ((((Class168_Sub2_Sub3) this)
						   .anInt9920)
						  << 12))
				    >= 0) {
				    i_3752_
					= (anInt9921 - i_3752_) / anInt9921;
				    i_3751_ += i_3752_;
				    i_3749_ += anInt9921 * i_3752_;
				    i_3748_ += i_3752_;
				}
				if ((i_3752_
				     = (i_3749_ - anInt9921) / anInt9921)
				    > i_3751_)
				    i_3751_ = i_3752_;
				int i_3753_ = is[i_3747_] - i;
				int i_3754_ = -is_3710_[i_3747_];
				int i_3755_ = i_3753_ - (i_3748_ - anInt9925);
				if (i_3755_ > 0) {
				    i_3748_ += i_3755_;
				    i_3751_ += i_3755_;
				    i_3749_ += anInt9921 * i_3755_;
				    i_3750_ += anInt9922 * i_3755_;
				} else
				    i_3754_ -= i_3755_;
				if (i_3751_ < i_3754_)
				    i_3751_ = i_3754_;
				for (/**/; i_3751_ < 0; i_3751_++) {
				    int i_3756_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(((i_3750_ >> 12)
					      * (((Class168_Sub2_Sub3) this)
						 .anInt9920))
					     + (i_3749_ >> 12))]);
				    if (i_3756_ != 0)
					is_3712_[i_3748_++]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3756_ & 0xff]);
				    else
					i_3748_++;
				    i_3749_ += anInt9921;
				}
			    }
			}
			i_3746_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_3757_ = anInt9919;
		    while (i_3757_ < 0) {
			int i_3758_ = i_3757_ + i_3711_;
			if (i_3758_ >= 0) {
			    if (i_3758_ >= is.length)
				break;
			    int i_3759_ = anInt9925;
			    int i_3760_ = anInt9927 + anInt9929;
			    int i_3761_ = anInt9928 + anInt9930;
			    int i_3762_ = anInt9906;
			    int i_3763_;
			    if ((i_3763_
				 = (i_3760_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)))
				>= 0) {
				i_3763_ = (anInt9921 - i_3763_) / anInt9921;
				i_3762_ += i_3763_;
				i_3760_ += anInt9921 * i_3763_;
				i_3761_ += anInt9922 * i_3763_;
				i_3759_ += i_3763_;
			    }
			    if ((i_3763_ = (i_3760_ - anInt9921) / anInt9921)
				> i_3762_)
				i_3762_ = i_3763_;
			    if ((i_3763_
				 = (i_3761_
				    - (((Class168_Sub2_Sub3) this).anInt9916
				       << 12)))
				>= 0) {
				i_3763_ = (anInt9922 - i_3763_) / anInt9922;
				i_3762_ += i_3763_;
				i_3760_ += anInt9921 * i_3763_;
				i_3761_ += anInt9922 * i_3763_;
				i_3759_ += i_3763_;
			    }
			    if ((i_3763_ = (i_3761_ - anInt9922) / anInt9922)
				> i_3762_)
				i_3762_ = i_3763_;
			    int i_3764_ = is[i_3758_] - i;
			    int i_3765_ = -is_3710_[i_3758_];
			    int i_3766_ = i_3764_ - (i_3759_ - anInt9925);
			    if (i_3766_ > 0) {
				i_3759_ += i_3766_;
				i_3762_ += i_3766_;
				i_3760_ += anInt9921 * i_3766_;
				i_3761_ += anInt9922 * i_3766_;
			    } else
				i_3765_ -= i_3766_;
			    if (i_3762_ < i_3765_)
				i_3762_ = i_3765_;
			    for (/**/; i_3762_ < 0; i_3762_++) {
				int i_3767_
				    = (((Class168_Sub2_Sub3) this)
				       .aByteArray11205
				       [((i_3761_ >> 12)
					 * (((Class168_Sub2_Sub3) this)
					    .anInt9920)) + (i_3760_ >> 12)]);
				if (i_3767_ != 0)
				    is_3712_[i_3759_++]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3767_ & 0xff]);
				else
				    i_3759_++;
				i_3760_ += anInt9921;
				i_3761_ += anInt9922;
			    }
			}
			i_3757_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_3768_ = anInt9919;
		    while (i_3768_ < 0) {
			int i_3769_ = i_3768_ + i_3711_;
			if (i_3769_ >= 0) {
			    if (i_3769_ >= is.length)
				break;
			    int i_3770_ = anInt9925;
			    int i_3771_ = anInt9927 + anInt9929;
			    int i_3772_ = anInt9928 + anInt9930;
			    int i_3773_ = anInt9906;
			    int i_3774_;
			    if ((i_3774_
				 = (i_3771_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)))
				>= 0) {
				i_3774_ = (anInt9921 - i_3774_) / anInt9921;
				i_3773_ += i_3774_;
				i_3771_ += anInt9921 * i_3774_;
				i_3772_ += anInt9922 * i_3774_;
				i_3770_ += i_3774_;
			    }
			    if ((i_3774_ = (i_3771_ - anInt9921) / anInt9921)
				> i_3773_)
				i_3773_ = i_3774_;
			    if (i_3772_ < 0) {
				i_3774_
				    = (anInt9922 - 1 - i_3772_) / anInt9922;
				i_3773_ += i_3774_;
				i_3771_ += anInt9921 * i_3774_;
				i_3772_ += anInt9922 * i_3774_;
				i_3770_ += i_3774_;
			    }
			    if ((i_3774_
				 = (1 + i_3772_
				    - (((Class168_Sub2_Sub3) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_3773_)
				i_3773_ = i_3774_;
			    int i_3775_ = is[i_3769_] - i;
			    int i_3776_ = -is_3710_[i_3769_];
			    int i_3777_ = i_3775_ - (i_3770_ - anInt9925);
			    if (i_3777_ > 0) {
				i_3770_ += i_3777_;
				i_3773_ += i_3777_;
				i_3771_ += anInt9921 * i_3777_;
				i_3772_ += anInt9922 * i_3777_;
			    } else
				i_3776_ -= i_3777_;
			    if (i_3773_ < i_3776_)
				i_3773_ = i_3776_;
			    for (/**/; i_3773_ < 0; i_3773_++) {
				int i_3778_
				    = (((Class168_Sub2_Sub3) this)
				       .aByteArray11205
				       [((i_3772_ >> 12)
					 * (((Class168_Sub2_Sub3) this)
					    .anInt9920)) + (i_3771_ >> 12)]);
				if (i_3778_ != 0)
				    is_3712_[i_3770_++]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3778_ & 0xff]);
				else
				    i_3770_++;
				i_3771_ += anInt9921;
				i_3772_ += anInt9922;
			    }
			}
			i_3768_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_3779_ = anInt9919;
		while (i_3779_ < 0) {
		    int i_3780_ = i_3779_ + i_3711_;
		    if (i_3780_ >= 0) {
			if (i_3780_ >= is.length)
			    break;
			int i_3781_ = anInt9925;
			int i_3782_ = anInt9927 + anInt9929;
			int i_3783_ = anInt9928;
			int i_3784_ = anInt9906;
			if (i_3783_ >= 0
			    && i_3783_ - (((Class168_Sub2_Sub3) this).anInt9916
					  << 12) < 0) {
			    if (i_3782_ < 0) {
				int i_3785_
				    = (anInt9921 - 1 - i_3782_) / anInt9921;
				i_3784_ += i_3785_;
				i_3782_ += anInt9921 * i_3785_;
				i_3781_ += i_3785_;
			    }
			    int i_3786_;
			    if ((i_3786_
				 = (1 + i_3782_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)
				    - anInt9921) / anInt9921)
				> i_3784_)
				i_3784_ = i_3786_;
			    int i_3787_ = is[i_3780_] - i;
			    int i_3788_ = -is_3710_[i_3780_];
			    int i_3789_ = i_3787_ - (i_3781_ - anInt9925);
			    if (i_3789_ > 0) {
				i_3781_ += i_3789_;
				i_3784_ += i_3789_;
				i_3782_ += anInt9921 * i_3789_;
				i_3783_ += anInt9922 * i_3789_;
			    } else
				i_3788_ -= i_3789_;
			    if (i_3784_ < i_3788_)
				i_3784_ = i_3788_;
			    for (/**/; i_3784_ < 0; i_3784_++) {
				int i_3790_
				    = (((Class168_Sub2_Sub3) this)
				       .aByteArray11205
				       [((i_3783_ >> 12)
					 * (((Class168_Sub2_Sub3) this)
					    .anInt9920)) + (i_3782_ >> 12)]);
				if (i_3790_ != 0)
				    is_3712_[i_3781_++]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3790_ & 0xff]);
				else
				    i_3781_++;
				i_3782_ += anInt9921;
			    }
			}
		    }
		    i_3779_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		int i_3791_ = anInt9919;
		while (i_3791_ < 0) {
		    int i_3792_ = i_3791_ + i_3711_;
		    if (i_3792_ >= 0) {
			if (i_3792_ >= is.length)
			    break;
			int i_3793_ = anInt9925;
			int i_3794_ = anInt9927 + anInt9929;
			int i_3795_ = anInt9928 + anInt9930;
			int i_3796_ = anInt9906;
			if (i_3794_ < 0) {
			    int i_3797_
				= (anInt9921 - 1 - i_3794_) / anInt9921;
			    i_3796_ += i_3797_;
			    i_3794_ += anInt9921 * i_3797_;
			    i_3795_ += anInt9922 * i_3797_;
			    i_3793_ += i_3797_;
			}
			int i_3798_;
			if ((i_3798_
			     = (1 + i_3794_
				- (((Class168_Sub2_Sub3) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_3796_)
			    i_3796_ = i_3798_;
			if ((i_3798_
			     = i_3795_ - (((Class168_Sub2_Sub3) this).anInt9916
					  << 12))
			    >= 0) {
			    i_3798_ = (anInt9922 - i_3798_) / anInt9922;
			    i_3796_ += i_3798_;
			    i_3794_ += anInt9921 * i_3798_;
			    i_3795_ += anInt9922 * i_3798_;
			    i_3793_ += i_3798_;
			}
			if ((i_3798_ = (i_3795_ - anInt9922) / anInt9922)
			    > i_3796_)
			    i_3796_ = i_3798_;
			int i_3799_ = is[i_3792_] - i;
			int i_3800_ = -is_3710_[i_3792_];
			int i_3801_ = i_3799_ - (i_3793_ - anInt9925);
			if (i_3801_ > 0) {
			    i_3793_ += i_3801_;
			    i_3796_ += i_3801_;
			    i_3794_ += anInt9921 * i_3801_;
			    i_3795_ += anInt9922 * i_3801_;
			} else
			    i_3800_ -= i_3801_;
			if (i_3796_ < i_3800_)
			    i_3796_ = i_3800_;
			for (/**/; i_3796_ < 0; i_3796_++) {
			    int i_3802_
				= (((Class168_Sub2_Sub3) this).aByteArray11205
				   [(((i_3795_ >> 12)
				      * ((Class168_Sub2_Sub3) this).anInt9920)
				     + (i_3794_ >> 12))]);
			    if (i_3802_ != 0)
				is_3712_[i_3793_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204[i_3802_ & 0xff]);
			    else
				i_3793_++;
			    i_3794_ += anInt9921;
			    i_3795_ += anInt9922;
			}
		    }
		    i_3791_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		int i_3803_ = anInt9919;
		while (i_3803_ < 0) {
		    int i_3804_ = i_3803_ + i_3711_;
		    if (i_3804_ >= 0) {
			if (i_3804_ >= is.length)
			    break;
			int i_3805_ = anInt9925;
			int i_3806_ = anInt9927 + anInt9929;
			int i_3807_ = anInt9928 + anInt9930;
			int i_3808_ = anInt9906;
			if (i_3806_ < 0) {
			    int i_3809_
				= (anInt9921 - 1 - i_3806_) / anInt9921;
			    i_3808_ += i_3809_;
			    i_3806_ += anInt9921 * i_3809_;
			    i_3807_ += anInt9922 * i_3809_;
			    i_3805_ += i_3809_;
			}
			int i_3810_;
			if ((i_3810_
			     = (1 + i_3806_
				- (((Class168_Sub2_Sub3) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_3808_)
			    i_3808_ = i_3810_;
			if (i_3807_ < 0) {
			    i_3810_ = (anInt9922 - 1 - i_3807_) / anInt9922;
			    i_3808_ += i_3810_;
			    i_3806_ += anInt9921 * i_3810_;
			    i_3807_ += anInt9922 * i_3810_;
			    i_3805_ += i_3810_;
			}
			if ((i_3810_
			     = (1 + i_3807_
				- (((Class168_Sub2_Sub3) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_3808_)
			    i_3808_ = i_3810_;
			int i_3811_ = is[i_3804_] - i;
			int i_3812_ = -is_3710_[i_3804_];
			int i_3813_ = i_3811_ - (i_3805_ - anInt9925);
			if (i_3813_ > 0) {
			    i_3805_ += i_3813_;
			    i_3808_ += i_3813_;
			    i_3806_ += anInt9921 * i_3813_;
			    i_3807_ += anInt9922 * i_3813_;
			} else
			    i_3812_ -= i_3813_;
			if (i_3808_ < i_3812_)
			    i_3808_ = i_3812_;
			for (/**/; i_3808_ < 0; i_3808_++) {
			    int i_3814_
				= (((Class168_Sub2_Sub3) this).aByteArray11205
				   [(((i_3807_ >> 12)
				      * ((Class168_Sub2_Sub3) this).anInt9920)
				     + (i_3806_ >> 12))]);
			    if (i_3814_ != 0)
				is_3712_[i_3805_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204[i_3814_ & 0xff]);
			    else
				i_3805_++;
			    i_3806_ += anInt9921;
			    i_3807_ += anInt9922;
			}
		    }
		    i_3803_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    void method3640(int i, int i_3815_, int i_3816_, int i_3817_, int i_3818_,
		    int i_3819_, int i_3820_, int i_3821_) {
	if (((Class168_Sub2_Sub3) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	if (i_3816_ > 0 && i_3817_ > 0) {
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (is != null) {
		int i_3822_ = 0;
		int i_3823_ = 0;
		int i_3824_
		    = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					 .aClass103_Sub2_9904)).anInt9260
		       * -1826993761);
		int i_3825_ = (((Class168_Sub2_Sub3) this).anInt9907
			       + ((Class168_Sub2_Sub3) this).anInt9920
			       + ((Class168_Sub2_Sub3) this).anInt9909);
		int i_3826_ = (((Class168_Sub2_Sub3) this).anInt9905
			       + ((Class168_Sub2_Sub3) this).anInt9916
			       + ((Class168_Sub2_Sub3) this).anInt9910);
		int i_3827_ = (i_3825_ << 16) / i_3816_;
		int i_3828_ = (i_3826_ << 16) / i_3817_;
		if (((Class168_Sub2_Sub3) this).anInt9907 > 0) {
		    int i_3829_
			= (((((Class168_Sub2_Sub3) this).anInt9907 << 16)
			    + i_3827_ - 1)
			   / i_3827_);
		    i += i_3829_;
		    i_3822_
			+= (i_3829_ * i_3827_
			    - (((Class168_Sub2_Sub3) this).anInt9907 << 16));
		}
		if (((Class168_Sub2_Sub3) this).anInt9905 > 0) {
		    int i_3830_
			= (((((Class168_Sub2_Sub3) this).anInt9905 << 16)
			    + i_3828_ - 1)
			   / i_3828_);
		    i_3815_ += i_3830_;
		    i_3823_
			+= (i_3830_ * i_3828_
			    - (((Class168_Sub2_Sub3) this).anInt9905 << 16));
		}
		if (((Class168_Sub2_Sub3) this).anInt9920 < i_3825_)
		    i_3816_ = ((((Class168_Sub2_Sub3) this).anInt9920 << 16)
			       - i_3822_ + i_3827_ - 1) / i_3827_;
		if (((Class168_Sub2_Sub3) this).anInt9916 < i_3826_)
		    i_3817_ = ((((Class168_Sub2_Sub3) this).anInt9916 << 16)
			       - i_3823_ + i_3828_ - 1) / i_3828_;
		int i_3831_ = i + i_3815_ * i_3824_;
		int i_3832_ = i_3824_ - i_3816_;
		if (i_3815_ + i_3817_
		    > (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					 .aClass103_Sub2_9904)).anInt9252
		       * 1546170165))
		    i_3817_
			-= (i_3815_ + i_3817_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
		if (i_3815_ < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9254) * -788450385) {
		    int i_3833_
			= ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					      .aClass103_Sub2_9904)).anInt9254
			    * -788450385)
			   - i_3815_);
		    i_3817_ -= i_3833_;
		    i_3831_ += i_3833_ * i_3824_;
		    i_3823_ += i_3828_ * i_3833_;
		}
		if (i + i_3816_
		    > (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					 .aClass103_Sub2_9904)).anInt9250
		       * 325436811)) {
		    int i_3834_
			= (i + i_3816_
			   - (((Class103_Sub2)
			       ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			      .anInt9250) * 325436811);
		    i_3816_ -= i_3834_;
		    i_3832_ += i_3834_;
		}
		if (i < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					   .aClass103_Sub2_9904)).anInt9249
			 * 1298750001)) {
		    int i_3835_
			= ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					      .aClass103_Sub2_9904)).anInt9249
			    * 1298750001)
			   - i);
		    i_3816_ -= i_3835_;
		    i_3831_ += i_3835_;
		    i_3822_ += i_3827_ * i_3835_;
		    i_3832_ += i_3835_;
		}
		if (i_3820_ == 0) {
		    if (i_3818_ == 1) {
			int i_3836_ = i_3822_;
			for (int i_3837_ = -i_3817_; i_3837_ < 0; i_3837_++) {
			    int i_3838_
				= ((i_3823_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_3839_ = -i_3816_; i_3839_ < 0;
				 i_3839_++) {
				is[i_3831_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205
					 [(i_3822_ >> 16) + i_3838_]) & 0xff]);
				i_3822_ += i_3827_;
			    }
			    i_3823_ += i_3828_;
			    i_3822_ = i_3836_;
			    i_3831_ += i_3832_;
			}
		    } else if (i_3818_ == 0) {
			int i_3840_ = (i_3819_ & 0xff0000) >> 16;
			int i_3841_ = (i_3819_ & 0xff00) >> 8;
			int i_3842_ = i_3819_ & 0xff;
			int i_3843_ = i_3822_;
			for (int i_3844_ = -i_3817_; i_3844_ < 0; i_3844_++) {
			    int i_3845_
				= ((i_3823_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_3846_ = -i_3816_; i_3846_ < 0;
				 i_3846_++) {
				int i_3847_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205
					 [(i_3822_ >> 16) + i_3845_]) & 0xff]);
				int i_3848_ = ((i_3847_ & 0xff0000) * i_3840_
					       & ~0xffffff);
				int i_3849_
				    = (i_3847_ & 0xff00) * i_3841_ & 0xff0000;
				int i_3850_
				    = (i_3847_ & 0xff) * i_3842_ & 0xff00;
				is[i_3831_++]
				    = (i_3848_ | i_3849_ | i_3850_) >>> 8;
				i_3822_ += i_3827_;
			    }
			    i_3823_ += i_3828_;
			    i_3822_ = i_3843_;
			    i_3831_ += i_3832_;
			}
		    } else if (i_3818_ == 3) {
			int i_3851_ = i_3822_;
			for (int i_3852_ = -i_3817_; i_3852_ < 0; i_3852_++) {
			    int i_3853_
				= ((i_3823_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_3854_ = -i_3816_; i_3854_ < 0;
				 i_3854_++) {
				byte i_3855_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205
						[(i_3822_ >> 16) + i_3853_]);
				int i_3856_ = (i_3855_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_3855_])
					       : 0);
				int i_3857_ = i_3856_ + i_3819_;
				int i_3858_ = ((i_3856_ & 0xff00ff)
					       + (i_3819_ & 0xff00ff));
				int i_3859_
				    = ((i_3858_ & 0x1000100)
				       + (i_3857_ - i_3858_ & 0x10000));
				is[i_3831_++]
				    = i_3857_ - i_3859_ | i_3859_ - (i_3859_
								     >>> 8);
				i_3822_ += i_3827_;
			    }
			    i_3823_ += i_3828_;
			    i_3822_ = i_3851_;
			    i_3831_ += i_3832_;
			}
		    } else if (i_3818_ == 2) {
			int i_3860_ = i_3819_ >>> 24;
			int i_3861_ = 256 - i_3860_;
			int i_3862_
			    = (i_3819_ & 0xff00ff) * i_3861_ & ~0xff00ff;
			int i_3863_ = (i_3819_ & 0xff00) * i_3861_ & 0xff0000;
			i_3819_ = (i_3862_ | i_3863_) >>> 8;
			int i_3864_ = i_3822_;
			for (int i_3865_ = -i_3817_; i_3865_ < 0; i_3865_++) {
			    int i_3866_
				= ((i_3823_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_3867_ = -i_3816_; i_3867_ < 0;
				 i_3867_++) {
				int i_3868_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205
					 [(i_3822_ >> 16) + i_3866_]) & 0xff]);
				i_3862_ = ((i_3868_ & 0xff00ff) * i_3860_
					   & ~0xff00ff);
				i_3863_
				    = (i_3868_ & 0xff00) * i_3860_ & 0xff0000;
				is[i_3831_++]
				    = ((i_3862_ | i_3863_) >>> 8) + i_3819_;
				i_3822_ += i_3827_;
			    }
			    i_3823_ += i_3828_;
			    i_3822_ = i_3864_;
			    i_3831_ += i_3832_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_3820_ == 1) {
		    if (i_3818_ == 1) {
			int i_3869_ = i_3822_;
			for (int i_3870_ = -i_3817_; i_3870_ < 0; i_3870_++) {
			    int i_3871_
				= ((i_3823_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_3872_ = -i_3816_; i_3872_ < 0;
				 i_3872_++) {
				int i_3873_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_3822_ >> 16) + i_3871_]);
				if (i_3873_ != 0)
				    is[i_3831_++]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3873_ & 0xff]);
				else
				    i_3831_++;
				i_3822_ += i_3827_;
			    }
			    i_3823_ += i_3828_;
			    i_3822_ = i_3869_;
			    i_3831_ += i_3832_;
			}
		    } else if (i_3818_ == 0) {
			int i_3874_ = i_3822_;
			if ((i_3819_ & 0xffffff) == 16777215) {
			    int i_3875_ = i_3819_ >>> 24;
			    int i_3876_ = 256 - i_3875_;
			    for (int i_3877_ = -i_3817_; i_3877_ < 0;
				 i_3877_++) {
				int i_3878_ = ((i_3823_ >> 16)
					       * (((Class168_Sub2_Sub3) this)
						  .anInt9920));
				for (int i_3879_ = -i_3816_; i_3879_ < 0;
				     i_3879_++) {
				    int i_3880_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_3822_ >> 16) + i_3878_]);
				    if (i_3880_ != 0) {
					int i_3881_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3880_ & 0xff]);
					int i_3882_ = is[i_3831_];
					is[i_3831_++]
					    = ((((i_3881_ & 0xff00ff) * i_3875_
						 + ((i_3882_ & 0xff00ff)
						    * i_3876_))
						& ~0xff00ff)
					       + (((i_3881_ & 0xff00) * i_3875_
						   + ((i_3882_ & 0xff00)
						      * i_3876_))
						  & 0xff0000)) >> 8;
				    } else
					i_3831_++;
				    i_3822_ += i_3827_;
				}
				i_3823_ += i_3828_;
				i_3822_ = i_3874_;
				i_3831_ += i_3832_;
			    }
			} else {
			    int i_3883_ = (i_3819_ & 0xff0000) >> 16;
			    int i_3884_ = (i_3819_ & 0xff00) >> 8;
			    int i_3885_ = i_3819_ & 0xff;
			    int i_3886_ = i_3819_ >>> 24;
			    int i_3887_ = 256 - i_3886_;
			    for (int i_3888_ = -i_3817_; i_3888_ < 0;
				 i_3888_++) {
				int i_3889_ = ((i_3823_ >> 16)
					       * (((Class168_Sub2_Sub3) this)
						  .anInt9920));
				for (int i_3890_ = -i_3816_; i_3890_ < 0;
				     i_3890_++) {
				    int i_3891_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_3822_ >> 16) + i_3889_]);
				    if (i_3891_ != 0) {
					int i_3892_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_3891_ & 0xff]);
					if (i_3886_ != 255) {
					    int i_3893_
						= (((i_3892_ & 0xff0000)
						    * i_3883_)
						   & ~0xffffff);
					    int i_3894_
						= ((i_3892_ & 0xff00) * i_3884_
						   & 0xff0000);
					    int i_3895_
						= ((i_3892_ & 0xff) * i_3885_
						   & 0xff00);
					    i_3892_ = (i_3893_ | i_3894_
						       | i_3895_) >>> 8;
					    int i_3896_ = is[i_3831_];
					    is[i_3831_++]
						= (((((i_3892_ & 0xff00ff)
						      * i_3886_)
						     + ((i_3896_ & 0xff00ff)
							* i_3887_))
						    & ~0xff00ff)
						   + ((((i_3892_ & 0xff00)
							* i_3886_)
						       + ((i_3896_ & 0xff00)
							  * i_3887_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_3897_
						= (((i_3892_ & 0xff0000)
						    * i_3883_)
						   & ~0xffffff);
					    int i_3898_
						= ((i_3892_ & 0xff00) * i_3884_
						   & 0xff0000);
					    int i_3899_
						= ((i_3892_ & 0xff) * i_3885_
						   & 0xff00);
					    is[i_3831_++] = (i_3897_ | i_3898_
							     | i_3899_) >>> 8;
					}
				    } else
					i_3831_++;
				    i_3822_ += i_3827_;
				}
				i_3823_ += i_3828_;
				i_3822_ = i_3874_;
				i_3831_ += i_3832_;
			    }
			}
		    } else if (i_3818_ == 3) {
			int i_3900_ = i_3822_;
			int i_3901_ = i_3819_ >>> 24;
			int i_3902_ = 256 - i_3901_;
			for (int i_3903_ = -i_3817_; i_3903_ < 0; i_3903_++) {
			    int i_3904_
				= ((i_3823_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_3905_ = -i_3816_; i_3905_ < 0;
				 i_3905_++) {
				byte i_3906_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205
						[(i_3822_ >> 16) + i_3904_]);
				int i_3907_ = (i_3906_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_3906_])
					       : 0);
				int i_3908_ = i_3907_ + i_3819_;
				int i_3909_ = ((i_3907_ & 0xff00ff)
					       + (i_3819_ & 0xff00ff));
				int i_3910_
				    = ((i_3909_ & 0x1000100)
				       + (i_3908_ - i_3909_ & 0x10000));
				i_3910_
				    = i_3908_ - i_3910_ | i_3910_ - (i_3910_
								     >>> 8);
				if (i_3907_ == 0 && i_3901_ != 255) {
				    i_3907_ = i_3910_;
				    i_3910_ = is[i_3831_];
				    i_3910_
					= ((((i_3907_ & 0xff00ff) * i_3901_
					     + (i_3910_ & 0xff00ff) * i_3902_)
					    & ~0xff00ff)
					   + (((i_3907_ & 0xff00) * i_3901_
					       + (i_3910_ & 0xff00) * i_3902_)
					      & 0xff0000)) >> 8;
				}
				is[i_3831_++] = i_3910_;
				i_3822_ += i_3827_;
			    }
			    i_3823_ += i_3828_;
			    i_3822_ = i_3900_;
			    i_3831_ += i_3832_;
			}
		    } else if (i_3818_ == 2) {
			int i_3911_ = i_3819_ >>> 24;
			int i_3912_ = 256 - i_3911_;
			int i_3913_
			    = (i_3819_ & 0xff00ff) * i_3912_ & ~0xff00ff;
			int i_3914_ = (i_3819_ & 0xff00) * i_3912_ & 0xff0000;
			i_3819_ = (i_3913_ | i_3914_) >>> 8;
			int i_3915_ = i_3822_;
			for (int i_3916_ = -i_3817_; i_3916_ < 0; i_3916_++) {
			    int i_3917_
				= ((i_3823_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_3918_ = -i_3816_; i_3918_ < 0;
				 i_3918_++) {
				int i_3919_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_3822_ >> 16) + i_3917_]);
				if (i_3919_ != 0) {
				    int i_3920_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3919_ & 0xff]);
				    i_3913_ = ((i_3920_ & 0xff00ff) * i_3911_
					       & ~0xff00ff);
				    i_3914_ = ((i_3920_ & 0xff00) * i_3911_
					       & 0xff0000);
				    is[i_3831_++] = ((i_3913_ | i_3914_)
						     >>> 8) + i_3819_;
				} else
				    i_3831_++;
				i_3822_ += i_3827_;
			    }
			    i_3823_ += i_3828_;
			    i_3822_ = i_3915_;
			    i_3831_ += i_3832_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_3820_ == 2) {
		    if (i_3818_ == 1) {
			int i_3921_ = i_3822_;
			for (int i_3922_ = -i_3817_; i_3922_ < 0; i_3922_++) {
			    int i_3923_
				= ((i_3823_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_3924_ = -i_3816_; i_3924_ < 0;
				 i_3924_++) {
				int i_3925_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_3822_ >> 16) + i_3923_]);
				if (i_3925_ != 0) {
				    int i_3926_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3925_ & 0xff]);
				    int i_3927_ = is[i_3831_];
				    int i_3928_ = i_3926_ + i_3927_;
				    int i_3929_ = ((i_3926_ & 0xff00ff)
						   + (i_3927_ & 0xff00ff));
				    i_3927_
					= ((i_3929_ & 0x1000100)
					   + (i_3928_ - i_3929_ & 0x10000));
				    is[i_3831_++]
					= (i_3928_ - i_3927_
					   | i_3927_ - (i_3927_ >>> 8));
				} else
				    i_3831_++;
				i_3822_ += i_3827_;
			    }
			    i_3823_ += i_3828_;
			    i_3822_ = i_3921_;
			    i_3831_ += i_3832_;
			}
		    } else if (i_3818_ == 0) {
			int i_3930_ = i_3822_;
			int i_3931_ = (i_3819_ & 0xff0000) >> 16;
			int i_3932_ = (i_3819_ & 0xff00) >> 8;
			int i_3933_ = i_3819_ & 0xff;
			for (int i_3934_ = -i_3817_; i_3934_ < 0; i_3934_++) {
			    int i_3935_
				= ((i_3823_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_3936_ = -i_3816_; i_3936_ < 0;
				 i_3936_++) {
				int i_3937_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_3822_ >> 16) + i_3935_]);
				if (i_3937_ != 0) {
				    int i_3938_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3937_ & 0xff]);
				    int i_3939_
					= ((i_3938_ & 0xff0000) * i_3931_
					   & ~0xffffff);
				    int i_3940_ = ((i_3938_ & 0xff00) * i_3932_
						   & 0xff0000);
				    int i_3941_
					= (i_3938_ & 0xff) * i_3933_ & 0xff00;
				    i_3938_
					= (i_3939_ | i_3940_ | i_3941_) >>> 8;
				    int i_3942_ = is[i_3831_];
				    int i_3943_ = i_3938_ + i_3942_;
				    int i_3944_ = ((i_3938_ & 0xff00ff)
						   + (i_3942_ & 0xff00ff));
				    i_3942_
					= ((i_3944_ & 0x1000100)
					   + (i_3943_ - i_3944_ & 0x10000));
				    is[i_3831_++]
					= (i_3943_ - i_3942_
					   | i_3942_ - (i_3942_ >>> 8));
				} else
				    i_3831_++;
				i_3822_ += i_3827_;
			    }
			    i_3823_ += i_3828_;
			    i_3822_ = i_3930_;
			    i_3831_ += i_3832_;
			}
		    } else if (i_3818_ == 3) {
			int i_3945_ = i_3822_;
			for (int i_3946_ = -i_3817_; i_3946_ < 0; i_3946_++) {
			    int i_3947_
				= ((i_3823_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_3948_ = -i_3816_; i_3948_ < 0;
				 i_3948_++) {
				byte i_3949_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205
						[(i_3822_ >> 16) + i_3947_]);
				int i_3950_ = (i_3949_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_3949_])
					       : 0);
				int i_3951_ = i_3950_ + i_3819_;
				int i_3952_ = ((i_3950_ & 0xff00ff)
					       + (i_3819_ & 0xff00ff));
				int i_3953_
				    = ((i_3952_ & 0x1000100)
				       + (i_3951_ - i_3952_ & 0x10000));
				i_3950_
				    = i_3951_ - i_3953_ | i_3953_ - (i_3953_
								     >>> 8);
				i_3953_ = is[i_3831_];
				i_3951_ = i_3950_ + i_3953_;
				i_3952_ = (i_3950_ & 0xff00ff) + (i_3953_
								  & 0xff00ff);
				i_3953_ = ((i_3952_ & 0x1000100)
					   + (i_3951_ - i_3952_ & 0x10000));
				is[i_3831_++]
				    = i_3951_ - i_3953_ | i_3953_ - (i_3953_
								     >>> 8);
				i_3822_ += i_3827_;
			    }
			    i_3823_ += i_3828_;
			    i_3822_ = i_3945_;
			    i_3831_ += i_3832_;
			}
		    } else if (i_3818_ == 2) {
			int i_3954_ = i_3819_ >>> 24;
			int i_3955_ = 256 - i_3954_;
			int i_3956_
			    = (i_3819_ & 0xff00ff) * i_3955_ & ~0xff00ff;
			int i_3957_ = (i_3819_ & 0xff00) * i_3955_ & 0xff0000;
			i_3819_ = (i_3956_ | i_3957_) >>> 8;
			int i_3958_ = i_3822_;
			for (int i_3959_ = -i_3817_; i_3959_ < 0; i_3959_++) {
			    int i_3960_
				= ((i_3823_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_3961_ = -i_3816_; i_3961_ < 0;
				 i_3961_++) {
				int i_3962_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_3822_ >> 16) + i_3960_]);
				if (i_3962_ != 0) {
				    int i_3963_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_3962_ & 0xff]);
				    i_3956_ = ((i_3963_ & 0xff00ff) * i_3954_
					       & ~0xff00ff);
				    i_3957_ = ((i_3963_ & 0xff00) * i_3954_
					       & 0xff0000);
				    i_3963_ = (((i_3956_ | i_3957_) >>> 8)
					       + i_3819_);
				    int i_3964_ = is[i_3831_];
				    int i_3965_ = i_3963_ + i_3964_;
				    int i_3966_ = ((i_3963_ & 0xff00ff)
						   + (i_3964_ & 0xff00ff));
				    i_3964_
					= ((i_3966_ & 0x1000100)
					   + (i_3965_ - i_3966_ & 0x10000));
				    is[i_3831_++]
					= (i_3965_ - i_3964_
					   | i_3964_ - (i_3964_ >>> 8));
				} else
				    i_3831_++;
				i_3822_ += i_3827_;
			    }
			    i_3823_ += i_3828_;
			    i_3822_ = i_3958_;
			    i_3831_ += i_3832_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method16220(boolean bool, boolean bool_3967_, boolean bool_3968_,
		     int i, int i_3969_, float f, int i_3970_, int i_3971_,
		     int i_3972_, int i_3973_, int i_3974_, int i_3975_,
		     boolean bool_3976_) {
	if (i_3970_ > 0 && i_3971_ > 0 && (bool || bool_3967_)) {
	    int i_3977_ = 0;
	    int i_3978_ = 0;
	    int i_3979_ = (((Class168_Sub2_Sub3) this).anInt9907
			   + ((Class168_Sub2_Sub3) this).anInt9920
			   + ((Class168_Sub2_Sub3) this).anInt9909);
	    int i_3980_ = (((Class168_Sub2_Sub3) this).anInt9905
			   + ((Class168_Sub2_Sub3) this).anInt9916
			   + ((Class168_Sub2_Sub3) this).anInt9910);
	    int i_3981_ = (i_3979_ << 16) / i_3970_;
	    int i_3982_ = (i_3980_ << 16) / i_3971_;
	    if (((Class168_Sub2_Sub3) this).anInt9907 > 0) {
		int i_3983_ = (((((Class168_Sub2_Sub3) this).anInt9907 << 16)
				+ i_3981_ - 1)
			       / i_3981_);
		i += i_3983_;
		i_3977_ += (i_3983_ * i_3981_
			    - (((Class168_Sub2_Sub3) this).anInt9907 << 16));
	    }
	    if (((Class168_Sub2_Sub3) this).anInt9905 > 0) {
		int i_3984_ = (((((Class168_Sub2_Sub3) this).anInt9905 << 16)
				+ i_3982_ - 1)
			       / i_3982_);
		i_3969_ += i_3984_;
		i_3978_ += (i_3984_ * i_3982_
			    - (((Class168_Sub2_Sub3) this).anInt9905 << 16));
	    }
	    if (((Class168_Sub2_Sub3) this).anInt9920 < i_3979_)
		i_3970_ = ((((Class168_Sub2_Sub3) this).anInt9920 << 16)
			   - i_3977_ + i_3981_ - 1) / i_3981_;
	    if (((Class168_Sub2_Sub3) this).anInt9916 < i_3980_)
		i_3971_ = ((((Class168_Sub2_Sub3) this).anInt9916 << 16)
			   - i_3978_ + i_3982_ - 1) / i_3982_;
	    int i_3985_
		= i + i_3969_ * ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						    .aClass103_Sub2_9904))
				  .anInt9260)
				 * -1826993761);
	    int i_3986_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					      .aClass103_Sub2_9904)).anInt9260
			    * -1826993761)
			   - i_3970_);
	    if (i_3969_ + i_3971_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_3971_ -= (i_3969_ + i_3971_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i_3969_ < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_3987_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_3969_);
		i_3971_ -= i_3987_;
		i_3985_ += i_3987_ * (((Class103_Sub2)
				       (((Class168_Sub2_Sub3) this)
					.aClass103_Sub2_9904)).anInt9260
				      * -1826993761);
		i_3978_ += i_3982_ * i_3987_;
	    }
	    if (i + i_3970_ > (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_3988_ = (i + i_3970_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_3970_ -= i_3988_;
		i_3986_ += i_3988_;
	    }
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_3989_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_3970_ -= i_3989_;
		i_3985_ += i_3989_;
		i_3977_ += i_3981_ * i_3989_;
		i_3986_ += i_3989_;
	    }
	    float[] fs = (((Class103_Sub2)
			   ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			  .aFloatArray9248);
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (i_3974_ == 0) {
		if (i_3972_ == 1) {
		    int i_3990_ = i_3977_;
		    for (int i_3991_ = -i_3971_; i_3991_ < 0; i_3991_++) {
			int i_3992_
			    = ((i_3978_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_3993_ = -i_3970_; i_3993_ < 0; i_3993_++) {
			    if (!bool_3967_ || f < fs[i_3985_]) {
				if (bool)
				    is[i_3985_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_3977_ >> 16) + i_3992_])
					     & 0xff)]);
				if (bool_3967_ && bool_3976_)
				    fs[i_3985_] = f;
			    }
			    i_3977_ += i_3981_;
			    i_3985_++;
			}
			i_3978_ += i_3982_;
			i_3977_ = i_3990_;
			i_3985_ += i_3986_;
		    }
		} else if (i_3972_ == 0) {
		    int i_3994_ = (i_3973_ & 0xff0000) >> 16;
		    int i_3995_ = (i_3973_ & 0xff00) >> 8;
		    int i_3996_ = i_3973_ & 0xff;
		    int i_3997_ = i_3977_;
		    for (int i_3998_ = -i_3971_; i_3998_ < 0; i_3998_++) {
			int i_3999_
			    = ((i_3978_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4000_ = -i_3970_; i_4000_ < 0; i_4000_++) {
			    if (!bool_3967_ || f < fs[i_3985_]) {
				if (bool) {
				    int i_4001_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_3977_ >> 16) + i_3999_])
					     & 0xff)]);
				    int i_4002_
					= ((i_4001_ & 0xff0000) * i_3994_
					   & ~0xffffff);
				    int i_4003_ = ((i_4001_ & 0xff00) * i_3995_
						   & 0xff0000);
				    int i_4004_
					= (i_4001_ & 0xff) * i_3996_ & 0xff00;
				    is[i_3985_]
					= (i_4002_ | i_4003_ | i_4004_) >>> 8;
				}
				if (bool_3967_ && bool_3976_)
				    fs[i_3985_] = f;
			    }
			    i_3977_ += i_3981_;
			    i_3985_++;
			}
			i_3978_ += i_3982_;
			i_3977_ = i_3997_;
			i_3985_ += i_3986_;
		    }
		} else if (i_3972_ == 3) {
		    int i_4005_ = i_3977_;
		    for (int i_4006_ = -i_3971_; i_4006_ < 0; i_4006_++) {
			int i_4007_
			    = ((i_3978_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4008_ = -i_3970_; i_4008_ < 0; i_4008_++) {
			    if (!bool_3967_ || f < fs[i_3985_]) {
				if (bool) {
				    byte i_4009_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_3977_ >> 16) + i_4007_]);
				    int i_4010_
					= (i_4009_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_4009_])
					   : 0);
				    int i_4011_ = i_4010_ + i_3973_;
				    int i_4012_ = ((i_4010_ & 0xff00ff)
						   + (i_3973_ & 0xff00ff));
				    int i_4013_
					= ((i_4012_ & 0x1000100)
					   + (i_4011_ - i_4012_ & 0x10000));
				    is[i_3985_]
					= (i_4011_ - i_4013_
					   | i_4013_ - (i_4013_ >>> 8));
				}
				if (bool_3967_ && bool_3976_)
				    fs[i_3985_] = f;
			    }
			    i_3977_ += i_3981_;
			    i_3985_++;
			}
			i_3978_ += i_3982_;
			i_3977_ = i_4005_;
			i_3985_ += i_3986_;
		    }
		} else if (i_3972_ == 2) {
		    int i_4014_ = i_3973_ >>> 24;
		    int i_4015_ = 256 - i_4014_;
		    int i_4016_ = (i_3973_ & 0xff00ff) * i_4015_ & ~0xff00ff;
		    int i_4017_ = (i_3973_ & 0xff00) * i_4015_ & 0xff0000;
		    i_3973_ = (i_4016_ | i_4017_) >>> 8;
		    int i_4018_ = i_3977_;
		    for (int i_4019_ = -i_3971_; i_4019_ < 0; i_4019_++) {
			int i_4020_
			    = ((i_3978_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4021_ = -i_3970_; i_4021_ < 0; i_4021_++) {
			    if (!bool_3967_ || f < fs[i_3985_]) {
				if (bool) {
				    int i_4022_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_3977_ >> 16) + i_4020_])
					     & 0xff)]);
				    i_4016_ = ((i_4022_ & 0xff00ff) * i_4014_
					       & ~0xff00ff);
				    i_4017_ = ((i_4022_ & 0xff00) * i_4014_
					       & 0xff0000);
				    is[i_3985_] = (((i_4016_ | i_4017_) >>> 8)
						   + i_3973_);
				}
				if (bool_3967_ && bool_3976_)
				    fs[i_3985_] = f;
			    }
			    i_3977_ += i_3981_;
			    i_3985_++;
			}
			i_3978_ += i_3982_;
			i_3977_ = i_4018_;
			i_3985_ += i_3986_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_3974_ == 1) {
		if (i_3972_ == 1) {
		    int i_4023_ = i_3977_;
		    for (int i_4024_ = -i_3971_; i_4024_ < 0; i_4024_++) {
			int i_4025_
			    = ((i_3978_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4026_ = -i_3970_; i_4026_ < 0; i_4026_++) {
			    if (!bool_3967_ || f < fs[i_3985_]) {
				int i_4027_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_3977_ >> 16) + i_4025_]);
				if (i_4027_ != 0) {
				    if (bool)
					is[i_3985_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4027_ & 0xff]);
				    if (bool_3967_ && bool_3976_)
					fs[i_3985_] = f;
				}
			    }
			    i_3977_ += i_3981_;
			    i_3985_++;
			}
			i_3978_ += i_3982_;
			i_3977_ = i_4023_;
			i_3985_ += i_3986_;
		    }
		} else if (i_3972_ == 0) {
		    int i_4028_ = i_3977_;
		    if ((i_3973_ & 0xffffff) == 16777215) {
			int i_4029_ = i_3973_ >>> 24;
			int i_4030_ = 256 - i_4029_;
			for (int i_4031_ = -i_3971_; i_4031_ < 0; i_4031_++) {
			    int i_4032_
				= ((i_3978_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_4033_ = -i_3970_; i_4033_ < 0;
				 i_4033_++) {
				if (!bool_3967_ || f < fs[i_3985_]) {
				    int i_4034_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_3977_ >> 16) + i_4032_]);
				    if (i_4034_ != 0) {
					if (bool) {
					    int i_4035_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_4034_ & 0xff]);
					    int i_4036_ = is[i_3985_];
					    is[i_3985_]
						= (((((i_4035_ & 0xff00ff)
						      * i_4029_)
						     + ((i_4036_ & 0xff00ff)
							* i_4030_))
						    & ~0xff00ff)
						   + ((((i_4035_ & 0xff00)
							* i_4029_)
						       + ((i_4036_ & 0xff00)
							  * i_4030_))
						      & 0xff0000)) >> 8;
					}
					if (bool_3967_ && bool_3976_)
					    fs[i_3985_] = f;
				    }
				}
				i_3977_ += i_3981_;
				i_3985_++;
			    }
			    i_3978_ += i_3982_;
			    i_3977_ = i_4028_;
			    i_3985_ += i_3986_;
			}
		    } else {
			int i_4037_ = (i_3973_ & 0xff0000) >> 16;
			int i_4038_ = (i_3973_ & 0xff00) >> 8;
			int i_4039_ = i_3973_ & 0xff;
			int i_4040_ = i_3973_ >>> 24;
			int i_4041_ = 256 - i_4040_;
			for (int i_4042_ = -i_3971_; i_4042_ < 0; i_4042_++) {
			    int i_4043_
				= ((i_3978_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_4044_ = -i_3970_; i_4044_ < 0;
				 i_4044_++) {
				if (!bool_3967_ || f < fs[i_3985_]) {
				    int i_4045_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_3977_ >> 16) + i_4043_]);
				    if (i_4045_ != 0) {
					int i_4046_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4045_ & 0xff]);
					if (i_4040_ != 255) {
					    if (bool) {
						int i_4047_
						    = (((i_4046_ & 0xff0000)
							* i_4037_)
						       & ~0xffffff);
						int i_4048_
						    = (((i_4046_ & 0xff00)
							* i_4038_)
						       & 0xff0000);
						int i_4049_
						    = (((i_4046_ & 0xff)
							* i_4039_)
						       & 0xff00);
						i_4046_ = (i_4047_ | i_4048_
							   | i_4049_) >>> 8;
						int i_4050_ = is[i_3985_];
						is[i_3985_]
						    = (((((i_4046_ & 0xff00ff)
							  * i_4040_)
							 + ((i_4050_
							     & 0xff00ff)
							    * i_4041_))
							& ~0xff00ff)
						       + ((((i_4046_ & 0xff00)
							    * i_4040_)
							   + ((i_4050_
							       & 0xff00)
							      * i_4041_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_3967_ && bool_3976_)
						fs[i_3985_] = f;
					} else {
					    if (bool) {
						int i_4051_
						    = (((i_4046_ & 0xff0000)
							* i_4037_)
						       & ~0xffffff);
						int i_4052_
						    = (((i_4046_ & 0xff00)
							* i_4038_)
						       & 0xff0000);
						int i_4053_
						    = (((i_4046_ & 0xff)
							* i_4039_)
						       & 0xff00);
						is[i_3985_]
						    = (i_4051_ | i_4052_
						       | i_4053_) >>> 8;
					    }
					    if (bool_3967_ && bool_3976_)
						fs[i_3985_] = f;
					}
				    }
				}
				i_3977_ += i_3981_;
				i_3985_++;
			    }
			    i_3978_ += i_3982_;
			    i_3977_ = i_4028_;
			    i_3985_ += i_3986_;
			}
		    }
		} else if (i_3972_ == 3) {
		    int i_4054_ = i_3977_;
		    int i_4055_ = i_3973_ >>> 24;
		    int i_4056_ = 256 - i_4055_;
		    for (int i_4057_ = -i_3971_; i_4057_ < 0; i_4057_++) {
			int i_4058_
			    = ((i_3978_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4059_ = -i_3970_; i_4059_ < 0; i_4059_++) {
			    if (!bool_3967_ || f < fs[i_3985_]) {
				if (bool) {
				    byte i_4060_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_3977_ >> 16) + i_4058_]);
				    int i_4061_
					= (i_4060_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_4060_])
					   : 0);
				    int i_4062_ = i_4061_ + i_3973_;
				    int i_4063_ = ((i_4061_ & 0xff00ff)
						   + (i_3973_ & 0xff00ff));
				    int i_4064_
					= ((i_4063_ & 0x1000100)
					   + (i_4062_ - i_4063_ & 0x10000));
				    i_4064_ = (i_4062_ - i_4064_
					       | i_4064_ - (i_4064_ >>> 8));
				    if (i_4061_ == 0 && i_4055_ != 255) {
					i_4061_ = i_4064_;
					i_4064_ = is[i_3985_];
					i_4064_
					    = ((((i_4061_ & 0xff00ff) * i_4055_
						 + ((i_4064_ & 0xff00ff)
						    * i_4056_))
						& ~0xff00ff)
					       + (((i_4061_ & 0xff00) * i_4055_
						   + ((i_4064_ & 0xff00)
						      * i_4056_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_3985_] = i_4064_;
				}
				if (bool_3967_ && bool_3976_)
				    fs[i_3985_] = f;
			    }
			    i_3977_ += i_3981_;
			    i_3985_++;
			}
			i_3978_ += i_3982_;
			i_3977_ = i_4054_;
			i_3985_ += i_3986_;
		    }
		} else if (i_3972_ == 2) {
		    int i_4065_ = i_3973_ >>> 24;
		    int i_4066_ = 256 - i_4065_;
		    int i_4067_ = (i_3973_ & 0xff00ff) * i_4066_ & ~0xff00ff;
		    int i_4068_ = (i_3973_ & 0xff00) * i_4066_ & 0xff0000;
		    i_3973_ = (i_4067_ | i_4068_) >>> 8;
		    int i_4069_ = i_3977_;
		    for (int i_4070_ = -i_3971_; i_4070_ < 0; i_4070_++) {
			int i_4071_
			    = ((i_3978_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4072_ = -i_3970_; i_4072_ < 0; i_4072_++) {
			    if (!bool_3967_ || f < fs[i_3985_]) {
				int i_4073_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_3977_ >> 16) + i_4071_]);
				if (i_4073_ != 0) {
				    if (bool) {
					int i_4074_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4073_ & 0xff]);
					i_4067_
					    = ((i_4074_ & 0xff00ff) * i_4065_
					       & ~0xff00ff);
					i_4068_ = ((i_4074_ & 0xff00) * i_4065_
						   & 0xff0000);
					is[i_3985_] = ((i_4067_ | i_4068_)
						       >>> 8) + i_3973_;
				    }
				    if (bool_3967_ && bool_3976_)
					fs[i_3985_] = f;
				}
			    }
			    i_3977_ += i_3981_;
			    i_3985_++;
			}
			i_3978_ += i_3982_;
			i_3977_ = i_4069_;
			i_3985_ += i_3986_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_3974_ == 2) {
		if (i_3972_ == 1) {
		    int i_4075_ = i_3977_;
		    for (int i_4076_ = -i_3971_; i_4076_ < 0; i_4076_++) {
			int i_4077_
			    = ((i_3978_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4078_ = -i_3970_; i_4078_ < 0; i_4078_++) {
			    if (!bool_3967_ || f < fs[i_3985_]) {
				int i_4079_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_3977_ >> 16) + i_4077_]);
				if (i_4079_ != 0) {
				    if (bool) {
					int i_4080_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4079_ & 0xff]);
					int i_4081_ = is[i_3985_];
					int i_4082_ = i_4080_ + i_4081_;
					int i_4083_ = ((i_4080_ & 0xff00ff)
						       + (i_4081_ & 0xff00ff));
					i_4081_ = ((i_4083_ & 0x1000100)
						   + (i_4082_ - i_4083_
						      & 0x10000));
					is[i_3985_]
					    = (i_4082_ - i_4081_
					       | i_4081_ - (i_4081_ >>> 8));
				    }
				    if (bool_3967_ && bool_3976_)
					fs[i_3985_] = f;
				}
			    }
			    i_3977_ += i_3981_;
			    i_3985_++;
			}
			i_3978_ += i_3982_;
			i_3977_ = i_4075_;
			i_3985_ += i_3986_;
		    }
		} else if (i_3972_ == 0) {
		    int i_4084_ = i_3977_;
		    int i_4085_ = (i_3973_ & 0xff0000) >> 16;
		    int i_4086_ = (i_3973_ & 0xff00) >> 8;
		    int i_4087_ = i_3973_ & 0xff;
		    for (int i_4088_ = -i_3971_; i_4088_ < 0; i_4088_++) {
			int i_4089_
			    = ((i_3978_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4090_ = -i_3970_; i_4090_ < 0; i_4090_++) {
			    if (!bool_3967_ || f < fs[i_3985_]) {
				int i_4091_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_3977_ >> 16) + i_4089_]);
				if (i_4091_ != 0) {
				    if (bool) {
					int i_4092_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4091_ & 0xff]);
					int i_4093_
					    = ((i_4092_ & 0xff0000) * i_4085_
					       & ~0xffffff);
					int i_4094_
					    = ((i_4092_ & 0xff00) * i_4086_
					       & 0xff0000);
					int i_4095_
					    = ((i_4092_ & 0xff) * i_4087_
					       & 0xff00);
					i_4092_ = (i_4093_ | i_4094_
						   | i_4095_) >>> 8;
					int i_4096_ = is[i_3985_];
					int i_4097_ = i_4092_ + i_4096_;
					int i_4098_ = ((i_4092_ & 0xff00ff)
						       + (i_4096_ & 0xff00ff));
					i_4096_ = ((i_4098_ & 0x1000100)
						   + (i_4097_ - i_4098_
						      & 0x10000));
					is[i_3985_]
					    = (i_4097_ - i_4096_
					       | i_4096_ - (i_4096_ >>> 8));
				    }
				    if (bool_3967_ && bool_3976_)
					fs[i_3985_] = f;
				}
			    }
			    i_3977_ += i_3981_;
			    i_3985_++;
			}
			i_3978_ += i_3982_;
			i_3977_ = i_4084_;
			i_3985_ += i_3986_;
		    }
		} else if (i_3972_ == 3) {
		    int i_4099_ = i_3977_;
		    for (int i_4100_ = -i_3971_; i_4100_ < 0; i_4100_++) {
			int i_4101_
			    = ((i_3978_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4102_ = -i_3970_; i_4102_ < 0; i_4102_++) {
			    if (!bool_3967_ || f < fs[i_3985_]) {
				if (bool) {
				    byte i_4103_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_3977_ >> 16) + i_4101_]);
				    int i_4104_
					= (i_4103_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_4103_])
					   : 0);
				    int i_4105_ = i_4104_ + i_3973_;
				    int i_4106_ = ((i_4104_ & 0xff00ff)
						   + (i_3973_ & 0xff00ff));
				    int i_4107_
					= ((i_4106_ & 0x1000100)
					   + (i_4105_ - i_4106_ & 0x10000));
				    i_4104_ = (i_4105_ - i_4107_
					       | i_4107_ - (i_4107_ >>> 8));
				    i_4107_ = is[i_3985_];
				    i_4105_ = i_4104_ + i_4107_;
				    i_4106_
					= (i_4104_ & 0xff00ff) + (i_4107_
								  & 0xff00ff);
				    i_4107_
					= ((i_4106_ & 0x1000100)
					   + (i_4105_ - i_4106_ & 0x10000));
				    is[i_3985_]
					= (i_4105_ - i_4107_
					   | i_4107_ - (i_4107_ >>> 8));
				}
				if (bool_3967_ && bool_3976_)
				    fs[i_3985_] = f;
			    }
			    i_3977_ += i_3981_;
			    i_3985_++;
			}
			i_3978_ += i_3982_;
			i_3977_ = i_4099_;
			i_3985_ += i_3986_;
		    }
		} else if (i_3972_ == 2) {
		    int i_4108_ = i_3973_ >>> 24;
		    int i_4109_ = 256 - i_4108_;
		    int i_4110_ = (i_3973_ & 0xff00ff) * i_4109_ & ~0xff00ff;
		    int i_4111_ = (i_3973_ & 0xff00) * i_4109_ & 0xff0000;
		    i_3973_ = (i_4110_ | i_4111_) >>> 8;
		    int i_4112_ = i_3977_;
		    for (int i_4113_ = -i_3971_; i_4113_ < 0; i_4113_++) {
			int i_4114_
			    = ((i_3978_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4115_ = -i_3970_; i_4115_ < 0; i_4115_++) {
			    if (!bool_3967_ || f < fs[i_3985_]) {
				int i_4116_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_3977_ >> 16) + i_4114_]);
				if (i_4116_ != 0) {
				    if (bool) {
					int i_4117_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4116_ & 0xff]);
					i_4110_
					    = ((i_4117_ & 0xff00ff) * i_4108_
					       & ~0xff00ff);
					i_4111_ = ((i_4117_ & 0xff00) * i_4108_
						   & 0xff0000);
					i_4117_ = (((i_4110_ | i_4111_) >>> 8)
						   + i_3973_);
					int i_4118_ = is[i_3985_];
					int i_4119_ = i_4117_ + i_4118_;
					int i_4120_ = ((i_4117_ & 0xff00ff)
						       + (i_4118_ & 0xff00ff));
					i_4118_ = ((i_4120_ & 0x1000100)
						   + (i_4119_ - i_4120_
						      & 0x10000));
					is[i_3985_]
					    = (i_4119_ - i_4118_
					       | i_4118_ - (i_4118_ >>> 8));
				    }
				    if (bool_3967_ && bool_3976_)
					fs[i_3985_] = f;
				}
			    }
			    i_3977_ += i_3981_;
			    i_3985_++;
			}
			i_3978_ += i_3982_;
			i_3977_ = i_4112_;
			i_3985_ += i_3986_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method3670(int i, int i_4121_, int i_4122_, int i_4123_, int i_4124_,
		    int i_4125_, int i_4126_, int i_4127_) {
	if (((Class168_Sub2_Sub3) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	if (i_4122_ > 0 && i_4123_ > 0) {
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (is != null) {
		int i_4128_ = 0;
		int i_4129_ = 0;
		int i_4130_
		    = (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					 .aClass103_Sub2_9904)).anInt9260
		       * -1826993761);
		int i_4131_ = (((Class168_Sub2_Sub3) this).anInt9907
			       + ((Class168_Sub2_Sub3) this).anInt9920
			       + ((Class168_Sub2_Sub3) this).anInt9909);
		int i_4132_ = (((Class168_Sub2_Sub3) this).anInt9905
			       + ((Class168_Sub2_Sub3) this).anInt9916
			       + ((Class168_Sub2_Sub3) this).anInt9910);
		int i_4133_ = (i_4131_ << 16) / i_4122_;
		int i_4134_ = (i_4132_ << 16) / i_4123_;
		if (((Class168_Sub2_Sub3) this).anInt9907 > 0) {
		    int i_4135_
			= (((((Class168_Sub2_Sub3) this).anInt9907 << 16)
			    + i_4133_ - 1)
			   / i_4133_);
		    i += i_4135_;
		    i_4128_
			+= (i_4135_ * i_4133_
			    - (((Class168_Sub2_Sub3) this).anInt9907 << 16));
		}
		if (((Class168_Sub2_Sub3) this).anInt9905 > 0) {
		    int i_4136_
			= (((((Class168_Sub2_Sub3) this).anInt9905 << 16)
			    + i_4134_ - 1)
			   / i_4134_);
		    i_4121_ += i_4136_;
		    i_4129_
			+= (i_4136_ * i_4134_
			    - (((Class168_Sub2_Sub3) this).anInt9905 << 16));
		}
		if (((Class168_Sub2_Sub3) this).anInt9920 < i_4131_)
		    i_4122_ = ((((Class168_Sub2_Sub3) this).anInt9920 << 16)
			       - i_4128_ + i_4133_ - 1) / i_4133_;
		if (((Class168_Sub2_Sub3) this).anInt9916 < i_4132_)
		    i_4123_ = ((((Class168_Sub2_Sub3) this).anInt9916 << 16)
			       - i_4129_ + i_4134_ - 1) / i_4134_;
		int i_4137_ = i + i_4121_ * i_4130_;
		int i_4138_ = i_4130_ - i_4122_;
		if (i_4121_ + i_4123_
		    > (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					 .aClass103_Sub2_9904)).anInt9252
		       * 1546170165))
		    i_4123_
			-= (i_4121_ + i_4123_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
		if (i_4121_ < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9254) * -788450385) {
		    int i_4139_
			= ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					      .aClass103_Sub2_9904)).anInt9254
			    * -788450385)
			   - i_4121_);
		    i_4123_ -= i_4139_;
		    i_4137_ += i_4139_ * i_4130_;
		    i_4129_ += i_4134_ * i_4139_;
		}
		if (i + i_4122_
		    > (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					 .aClass103_Sub2_9904)).anInt9250
		       * 325436811)) {
		    int i_4140_
			= (i + i_4122_
			   - (((Class103_Sub2)
			       ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			      .anInt9250) * 325436811);
		    i_4122_ -= i_4140_;
		    i_4138_ += i_4140_;
		}
		if (i < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					   .aClass103_Sub2_9904)).anInt9249
			 * 1298750001)) {
		    int i_4141_
			= ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					      .aClass103_Sub2_9904)).anInt9249
			    * 1298750001)
			   - i);
		    i_4122_ -= i_4141_;
		    i_4137_ += i_4141_;
		    i_4128_ += i_4133_ * i_4141_;
		    i_4138_ += i_4141_;
		}
		if (i_4126_ == 0) {
		    if (i_4124_ == 1) {
			int i_4142_ = i_4128_;
			for (int i_4143_ = -i_4123_; i_4143_ < 0; i_4143_++) {
			    int i_4144_
				= ((i_4129_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_4145_ = -i_4122_; i_4145_ < 0;
				 i_4145_++) {
				is[i_4137_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205
					 [(i_4128_ >> 16) + i_4144_]) & 0xff]);
				i_4128_ += i_4133_;
			    }
			    i_4129_ += i_4134_;
			    i_4128_ = i_4142_;
			    i_4137_ += i_4138_;
			}
		    } else if (i_4124_ == 0) {
			int i_4146_ = (i_4125_ & 0xff0000) >> 16;
			int i_4147_ = (i_4125_ & 0xff00) >> 8;
			int i_4148_ = i_4125_ & 0xff;
			int i_4149_ = i_4128_;
			for (int i_4150_ = -i_4123_; i_4150_ < 0; i_4150_++) {
			    int i_4151_
				= ((i_4129_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_4152_ = -i_4122_; i_4152_ < 0;
				 i_4152_++) {
				int i_4153_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205
					 [(i_4128_ >> 16) + i_4151_]) & 0xff]);
				int i_4154_ = ((i_4153_ & 0xff0000) * i_4146_
					       & ~0xffffff);
				int i_4155_
				    = (i_4153_ & 0xff00) * i_4147_ & 0xff0000;
				int i_4156_
				    = (i_4153_ & 0xff) * i_4148_ & 0xff00;
				is[i_4137_++]
				    = (i_4154_ | i_4155_ | i_4156_) >>> 8;
				i_4128_ += i_4133_;
			    }
			    i_4129_ += i_4134_;
			    i_4128_ = i_4149_;
			    i_4137_ += i_4138_;
			}
		    } else if (i_4124_ == 3) {
			int i_4157_ = i_4128_;
			for (int i_4158_ = -i_4123_; i_4158_ < 0; i_4158_++) {
			    int i_4159_
				= ((i_4129_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_4160_ = -i_4122_; i_4160_ < 0;
				 i_4160_++) {
				byte i_4161_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205
						[(i_4128_ >> 16) + i_4159_]);
				int i_4162_ = (i_4161_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_4161_])
					       : 0);
				int i_4163_ = i_4162_ + i_4125_;
				int i_4164_ = ((i_4162_ & 0xff00ff)
					       + (i_4125_ & 0xff00ff));
				int i_4165_
				    = ((i_4164_ & 0x1000100)
				       + (i_4163_ - i_4164_ & 0x10000));
				is[i_4137_++]
				    = i_4163_ - i_4165_ | i_4165_ - (i_4165_
								     >>> 8);
				i_4128_ += i_4133_;
			    }
			    i_4129_ += i_4134_;
			    i_4128_ = i_4157_;
			    i_4137_ += i_4138_;
			}
		    } else if (i_4124_ == 2) {
			int i_4166_ = i_4125_ >>> 24;
			int i_4167_ = 256 - i_4166_;
			int i_4168_
			    = (i_4125_ & 0xff00ff) * i_4167_ & ~0xff00ff;
			int i_4169_ = (i_4125_ & 0xff00) * i_4167_ & 0xff0000;
			i_4125_ = (i_4168_ | i_4169_) >>> 8;
			int i_4170_ = i_4128_;
			for (int i_4171_ = -i_4123_; i_4171_ < 0; i_4171_++) {
			    int i_4172_
				= ((i_4129_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_4173_ = -i_4122_; i_4173_ < 0;
				 i_4173_++) {
				int i_4174_
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204
				       [(((Class168_Sub2_Sub3) this)
					 .aByteArray11205
					 [(i_4128_ >> 16) + i_4172_]) & 0xff]);
				i_4168_ = ((i_4174_ & 0xff00ff) * i_4166_
					   & ~0xff00ff);
				i_4169_
				    = (i_4174_ & 0xff00) * i_4166_ & 0xff0000;
				is[i_4137_++]
				    = ((i_4168_ | i_4169_) >>> 8) + i_4125_;
				i_4128_ += i_4133_;
			    }
			    i_4129_ += i_4134_;
			    i_4128_ = i_4170_;
			    i_4137_ += i_4138_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_4126_ == 1) {
		    if (i_4124_ == 1) {
			int i_4175_ = i_4128_;
			for (int i_4176_ = -i_4123_; i_4176_ < 0; i_4176_++) {
			    int i_4177_
				= ((i_4129_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_4178_ = -i_4122_; i_4178_ < 0;
				 i_4178_++) {
				int i_4179_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_4128_ >> 16) + i_4177_]);
				if (i_4179_ != 0)
				    is[i_4137_++]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_4179_ & 0xff]);
				else
				    i_4137_++;
				i_4128_ += i_4133_;
			    }
			    i_4129_ += i_4134_;
			    i_4128_ = i_4175_;
			    i_4137_ += i_4138_;
			}
		    } else if (i_4124_ == 0) {
			int i_4180_ = i_4128_;
			if ((i_4125_ & 0xffffff) == 16777215) {
			    int i_4181_ = i_4125_ >>> 24;
			    int i_4182_ = 256 - i_4181_;
			    for (int i_4183_ = -i_4123_; i_4183_ < 0;
				 i_4183_++) {
				int i_4184_ = ((i_4129_ >> 16)
					       * (((Class168_Sub2_Sub3) this)
						  .anInt9920));
				for (int i_4185_ = -i_4122_; i_4185_ < 0;
				     i_4185_++) {
				    int i_4186_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_4128_ >> 16) + i_4184_]);
				    if (i_4186_ != 0) {
					int i_4187_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4186_ & 0xff]);
					int i_4188_ = is[i_4137_];
					is[i_4137_++]
					    = ((((i_4187_ & 0xff00ff) * i_4181_
						 + ((i_4188_ & 0xff00ff)
						    * i_4182_))
						& ~0xff00ff)
					       + (((i_4187_ & 0xff00) * i_4181_
						   + ((i_4188_ & 0xff00)
						      * i_4182_))
						  & 0xff0000)) >> 8;
				    } else
					i_4137_++;
				    i_4128_ += i_4133_;
				}
				i_4129_ += i_4134_;
				i_4128_ = i_4180_;
				i_4137_ += i_4138_;
			    }
			} else {
			    int i_4189_ = (i_4125_ & 0xff0000) >> 16;
			    int i_4190_ = (i_4125_ & 0xff00) >> 8;
			    int i_4191_ = i_4125_ & 0xff;
			    int i_4192_ = i_4125_ >>> 24;
			    int i_4193_ = 256 - i_4192_;
			    for (int i_4194_ = -i_4123_; i_4194_ < 0;
				 i_4194_++) {
				int i_4195_ = ((i_4129_ >> 16)
					       * (((Class168_Sub2_Sub3) this)
						  .anInt9920));
				for (int i_4196_ = -i_4122_; i_4196_ < 0;
				     i_4196_++) {
				    int i_4197_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_4128_ >> 16) + i_4195_]);
				    if (i_4197_ != 0) {
					int i_4198_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4197_ & 0xff]);
					if (i_4192_ != 255) {
					    int i_4199_
						= (((i_4198_ & 0xff0000)
						    * i_4189_)
						   & ~0xffffff);
					    int i_4200_
						= ((i_4198_ & 0xff00) * i_4190_
						   & 0xff0000);
					    int i_4201_
						= ((i_4198_ & 0xff) * i_4191_
						   & 0xff00);
					    i_4198_ = (i_4199_ | i_4200_
						       | i_4201_) >>> 8;
					    int i_4202_ = is[i_4137_];
					    is[i_4137_++]
						= (((((i_4198_ & 0xff00ff)
						      * i_4192_)
						     + ((i_4202_ & 0xff00ff)
							* i_4193_))
						    & ~0xff00ff)
						   + ((((i_4198_ & 0xff00)
							* i_4192_)
						       + ((i_4202_ & 0xff00)
							  * i_4193_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_4203_
						= (((i_4198_ & 0xff0000)
						    * i_4189_)
						   & ~0xffffff);
					    int i_4204_
						= ((i_4198_ & 0xff00) * i_4190_
						   & 0xff0000);
					    int i_4205_
						= ((i_4198_ & 0xff) * i_4191_
						   & 0xff00);
					    is[i_4137_++] = (i_4203_ | i_4204_
							     | i_4205_) >>> 8;
					}
				    } else
					i_4137_++;
				    i_4128_ += i_4133_;
				}
				i_4129_ += i_4134_;
				i_4128_ = i_4180_;
				i_4137_ += i_4138_;
			    }
			}
		    } else if (i_4124_ == 3) {
			int i_4206_ = i_4128_;
			int i_4207_ = i_4125_ >>> 24;
			int i_4208_ = 256 - i_4207_;
			for (int i_4209_ = -i_4123_; i_4209_ < 0; i_4209_++) {
			    int i_4210_
				= ((i_4129_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_4211_ = -i_4122_; i_4211_ < 0;
				 i_4211_++) {
				byte i_4212_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205
						[(i_4128_ >> 16) + i_4210_]);
				int i_4213_ = (i_4212_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_4212_])
					       : 0);
				int i_4214_ = i_4213_ + i_4125_;
				int i_4215_ = ((i_4213_ & 0xff00ff)
					       + (i_4125_ & 0xff00ff));
				int i_4216_
				    = ((i_4215_ & 0x1000100)
				       + (i_4214_ - i_4215_ & 0x10000));
				i_4216_
				    = i_4214_ - i_4216_ | i_4216_ - (i_4216_
								     >>> 8);
				if (i_4213_ == 0 && i_4207_ != 255) {
				    i_4213_ = i_4216_;
				    i_4216_ = is[i_4137_];
				    i_4216_
					= ((((i_4213_ & 0xff00ff) * i_4207_
					     + (i_4216_ & 0xff00ff) * i_4208_)
					    & ~0xff00ff)
					   + (((i_4213_ & 0xff00) * i_4207_
					       + (i_4216_ & 0xff00) * i_4208_)
					      & 0xff0000)) >> 8;
				}
				is[i_4137_++] = i_4216_;
				i_4128_ += i_4133_;
			    }
			    i_4129_ += i_4134_;
			    i_4128_ = i_4206_;
			    i_4137_ += i_4138_;
			}
		    } else if (i_4124_ == 2) {
			int i_4217_ = i_4125_ >>> 24;
			int i_4218_ = 256 - i_4217_;
			int i_4219_
			    = (i_4125_ & 0xff00ff) * i_4218_ & ~0xff00ff;
			int i_4220_ = (i_4125_ & 0xff00) * i_4218_ & 0xff0000;
			i_4125_ = (i_4219_ | i_4220_) >>> 8;
			int i_4221_ = i_4128_;
			for (int i_4222_ = -i_4123_; i_4222_ < 0; i_4222_++) {
			    int i_4223_
				= ((i_4129_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_4224_ = -i_4122_; i_4224_ < 0;
				 i_4224_++) {
				int i_4225_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_4128_ >> 16) + i_4223_]);
				if (i_4225_ != 0) {
				    int i_4226_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_4225_ & 0xff]);
				    i_4219_ = ((i_4226_ & 0xff00ff) * i_4217_
					       & ~0xff00ff);
				    i_4220_ = ((i_4226_ & 0xff00) * i_4217_
					       & 0xff0000);
				    is[i_4137_++] = ((i_4219_ | i_4220_)
						     >>> 8) + i_4125_;
				} else
				    i_4137_++;
				i_4128_ += i_4133_;
			    }
			    i_4129_ += i_4134_;
			    i_4128_ = i_4221_;
			    i_4137_ += i_4138_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_4126_ == 2) {
		    if (i_4124_ == 1) {
			int i_4227_ = i_4128_;
			for (int i_4228_ = -i_4123_; i_4228_ < 0; i_4228_++) {
			    int i_4229_
				= ((i_4129_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_4230_ = -i_4122_; i_4230_ < 0;
				 i_4230_++) {
				int i_4231_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_4128_ >> 16) + i_4229_]);
				if (i_4231_ != 0) {
				    int i_4232_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_4231_ & 0xff]);
				    int i_4233_ = is[i_4137_];
				    int i_4234_ = i_4232_ + i_4233_;
				    int i_4235_ = ((i_4232_ & 0xff00ff)
						   + (i_4233_ & 0xff00ff));
				    i_4233_
					= ((i_4235_ & 0x1000100)
					   + (i_4234_ - i_4235_ & 0x10000));
				    is[i_4137_++]
					= (i_4234_ - i_4233_
					   | i_4233_ - (i_4233_ >>> 8));
				} else
				    i_4137_++;
				i_4128_ += i_4133_;
			    }
			    i_4129_ += i_4134_;
			    i_4128_ = i_4227_;
			    i_4137_ += i_4138_;
			}
		    } else if (i_4124_ == 0) {
			int i_4236_ = i_4128_;
			int i_4237_ = (i_4125_ & 0xff0000) >> 16;
			int i_4238_ = (i_4125_ & 0xff00) >> 8;
			int i_4239_ = i_4125_ & 0xff;
			for (int i_4240_ = -i_4123_; i_4240_ < 0; i_4240_++) {
			    int i_4241_
				= ((i_4129_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_4242_ = -i_4122_; i_4242_ < 0;
				 i_4242_++) {
				int i_4243_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_4128_ >> 16) + i_4241_]);
				if (i_4243_ != 0) {
				    int i_4244_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_4243_ & 0xff]);
				    int i_4245_
					= ((i_4244_ & 0xff0000) * i_4237_
					   & ~0xffffff);
				    int i_4246_ = ((i_4244_ & 0xff00) * i_4238_
						   & 0xff0000);
				    int i_4247_
					= (i_4244_ & 0xff) * i_4239_ & 0xff00;
				    i_4244_
					= (i_4245_ | i_4246_ | i_4247_) >>> 8;
				    int i_4248_ = is[i_4137_];
				    int i_4249_ = i_4244_ + i_4248_;
				    int i_4250_ = ((i_4244_ & 0xff00ff)
						   + (i_4248_ & 0xff00ff));
				    i_4248_
					= ((i_4250_ & 0x1000100)
					   + (i_4249_ - i_4250_ & 0x10000));
				    is[i_4137_++]
					= (i_4249_ - i_4248_
					   | i_4248_ - (i_4248_ >>> 8));
				} else
				    i_4137_++;
				i_4128_ += i_4133_;
			    }
			    i_4129_ += i_4134_;
			    i_4128_ = i_4236_;
			    i_4137_ += i_4138_;
			}
		    } else if (i_4124_ == 3) {
			int i_4251_ = i_4128_;
			for (int i_4252_ = -i_4123_; i_4252_ < 0; i_4252_++) {
			    int i_4253_
				= ((i_4129_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_4254_ = -i_4122_; i_4254_ < 0;
				 i_4254_++) {
				byte i_4255_ = (((Class168_Sub2_Sub3) this)
						.aByteArray11205
						[(i_4128_ >> 16) + i_4253_]);
				int i_4256_ = (i_4255_ > 0
					       ? (((Class168_Sub2_Sub3) this)
						  .anIntArray11204[i_4255_])
					       : 0);
				int i_4257_ = i_4256_ + i_4125_;
				int i_4258_ = ((i_4256_ & 0xff00ff)
					       + (i_4125_ & 0xff00ff));
				int i_4259_
				    = ((i_4258_ & 0x1000100)
				       + (i_4257_ - i_4258_ & 0x10000));
				i_4256_
				    = i_4257_ - i_4259_ | i_4259_ - (i_4259_
								     >>> 8);
				i_4259_ = is[i_4137_];
				i_4257_ = i_4256_ + i_4259_;
				i_4258_ = (i_4256_ & 0xff00ff) + (i_4259_
								  & 0xff00ff);
				i_4259_ = ((i_4258_ & 0x1000100)
					   + (i_4257_ - i_4258_ & 0x10000));
				is[i_4137_++]
				    = i_4257_ - i_4259_ | i_4259_ - (i_4259_
								     >>> 8);
				i_4128_ += i_4133_;
			    }
			    i_4129_ += i_4134_;
			    i_4128_ = i_4251_;
			    i_4137_ += i_4138_;
			}
		    } else if (i_4124_ == 2) {
			int i_4260_ = i_4125_ >>> 24;
			int i_4261_ = 256 - i_4260_;
			int i_4262_
			    = (i_4125_ & 0xff00ff) * i_4261_ & ~0xff00ff;
			int i_4263_ = (i_4125_ & 0xff00) * i_4261_ & 0xff0000;
			i_4125_ = (i_4262_ | i_4263_) >>> 8;
			int i_4264_ = i_4128_;
			for (int i_4265_ = -i_4123_; i_4265_ < 0; i_4265_++) {
			    int i_4266_
				= ((i_4129_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_4267_ = -i_4122_; i_4267_ < 0;
				 i_4267_++) {
				int i_4268_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_4128_ >> 16) + i_4266_]);
				if (i_4268_ != 0) {
				    int i_4269_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_4268_ & 0xff]);
				    i_4262_ = ((i_4269_ & 0xff00ff) * i_4260_
					       & ~0xff00ff);
				    i_4263_ = ((i_4269_ & 0xff00) * i_4260_
					       & 0xff0000);
				    i_4269_ = (((i_4262_ | i_4263_) >>> 8)
					       + i_4125_);
				    int i_4270_ = is[i_4137_];
				    int i_4271_ = i_4269_ + i_4270_;
				    int i_4272_ = ((i_4269_ & 0xff00ff)
						   + (i_4270_ & 0xff00ff));
				    i_4270_
					= ((i_4272_ & 0x1000100)
					   + (i_4271_ - i_4272_ & 0x10000));
				    is[i_4137_++]
					= (i_4271_ - i_4270_
					   | i_4270_ - (i_4270_ >>> 8));
				} else
				    i_4137_++;
				i_4128_ += i_4133_;
			    }
			    i_4129_ += i_4134_;
			    i_4128_ = i_4264_;
			    i_4137_ += i_4138_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method16217(int[] is, int[] is_4273_, int i, int i_4274_) {
	int[] is_4275_ = (((Class103_Sub2)
			   ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			  .anIntArray9245);
	if (is_4275_ != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_4276_ = anInt9919;
		    while (i_4276_ < 0) {
			int i_4277_ = i_4276_ + i_4274_;
			if (i_4277_ >= 0) {
			    if (i_4277_ >= is.length)
				break;
			    int i_4278_ = anInt9925;
			    int i_4279_ = anInt9927;
			    int i_4280_ = anInt9928;
			    int i_4281_ = anInt9906;
			    if (i_4279_ >= 0 && i_4280_ >= 0
				&& (i_4279_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)) < 0
				&& (i_4280_
				    - (((Class168_Sub2_Sub3) this).anInt9916
				       << 12)) < 0) {
				int i_4282_ = is[i_4277_] - i;
				int i_4283_ = -is_4273_[i_4277_];
				int i_4284_ = i_4282_ - (i_4278_ - anInt9925);
				if (i_4284_ > 0) {
				    i_4278_ += i_4284_;
				    i_4281_ += i_4284_;
				    i_4279_ += anInt9921 * i_4284_;
				    i_4280_ += anInt9922 * i_4284_;
				} else
				    i_4283_ -= i_4284_;
				if (i_4281_ < i_4283_)
				    i_4281_ = i_4283_;
				for (/**/; i_4281_ < 0; i_4281_++) {
				    int i_4285_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(((i_4280_ >> 12)
					      * (((Class168_Sub2_Sub3) this)
						 .anInt9920))
					     + (i_4279_ >> 12))]);
				    if (i_4285_ != 0)
					is_4275_[i_4278_++]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4285_ & 0xff]);
				    else
					i_4278_++;
				}
			    }
			}
			i_4276_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_4286_ = anInt9919;
		    while (i_4286_ < 0) {
			int i_4287_ = i_4286_ + i_4274_;
			if (i_4287_ >= 0) {
			    if (i_4287_ >= is.length)
				break;
			    int i_4288_ = anInt9925;
			    int i_4289_ = anInt9927;
			    int i_4290_ = anInt9928 + anInt9930;
			    int i_4291_ = anInt9906;
			    if (i_4289_ >= 0
				&& (i_4289_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)) < 0) {
				int i_4292_;
				if ((i_4292_
				     = i_4290_ - ((((Class168_Sub2_Sub3) this)
						   .anInt9916)
						  << 12))
				    >= 0) {
				    i_4292_
					= (anInt9922 - i_4292_) / anInt9922;
				    i_4291_ += i_4292_;
				    i_4290_ += anInt9922 * i_4292_;
				    i_4288_ += i_4292_;
				}
				if ((i_4292_
				     = (i_4290_ - anInt9922) / anInt9922)
				    > i_4291_)
				    i_4291_ = i_4292_;
				int i_4293_ = is[i_4287_] - i;
				int i_4294_ = -is_4273_[i_4287_];
				int i_4295_ = i_4293_ - (i_4288_ - anInt9925);
				if (i_4295_ > 0) {
				    i_4288_ += i_4295_;
				    i_4291_ += i_4295_;
				    i_4289_ += anInt9921 * i_4295_;
				    i_4290_ += anInt9922 * i_4295_;
				} else
				    i_4294_ -= i_4295_;
				if (i_4291_ < i_4294_)
				    i_4291_ = i_4294_;
				for (/**/; i_4291_ < 0; i_4291_++) {
				    int i_4296_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(((i_4290_ >> 12)
					      * (((Class168_Sub2_Sub3) this)
						 .anInt9920))
					     + (i_4289_ >> 12))]);
				    if (i_4296_ != 0)
					is_4275_[i_4288_++]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4296_ & 0xff]);
				    else
					i_4288_++;
				    i_4290_ += anInt9922;
				}
			    }
			}
			i_4286_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_4297_ = anInt9919;
		    while (i_4297_ < 0) {
			int i_4298_ = i_4297_ + i_4274_;
			if (i_4298_ >= 0) {
			    if (i_4298_ >= is.length)
				break;
			    int i_4299_ = anInt9925;
			    int i_4300_ = anInt9927;
			    int i_4301_ = anInt9928 + anInt9930;
			    int i_4302_ = anInt9906;
			    if (i_4300_ >= 0
				&& (i_4300_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)) < 0) {
				if (i_4301_ < 0) {
				    int i_4303_ = ((anInt9922 - 1 - i_4301_)
						   / anInt9922);
				    i_4302_ += i_4303_;
				    i_4301_ += anInt9922 * i_4303_;
				    i_4299_ += i_4303_;
				}
				int i_4304_;
				if ((i_4304_ = (1 + i_4301_
						- ((((Class168_Sub2_Sub3) this)
						    .anInt9916)
						   << 12)
						- anInt9922) / anInt9922)
				    > i_4302_)
				    i_4302_ = i_4304_;
				int i_4305_ = is[i_4298_] - i;
				int i_4306_ = -is_4273_[i_4298_];
				int i_4307_ = i_4305_ - (i_4299_ - anInt9925);
				if (i_4307_ > 0) {
				    i_4299_ += i_4307_;
				    i_4302_ += i_4307_;
				    i_4300_ += anInt9921 * i_4307_;
				    i_4301_ += anInt9922 * i_4307_;
				} else
				    i_4306_ -= i_4307_;
				if (i_4302_ < i_4306_)
				    i_4302_ = i_4306_;
				for (/**/; i_4302_ < 0; i_4302_++) {
				    int i_4308_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(((i_4301_ >> 12)
					      * (((Class168_Sub2_Sub3) this)
						 .anInt9920))
					     + (i_4300_ >> 12))]);
				    if (i_4308_ != 0)
					is_4275_[i_4299_++]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4308_ & 0xff]);
				    else
					i_4299_++;
				    i_4301_ += anInt9922;
				}
			    }
			}
			i_4297_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_4309_ = anInt9919;
		    while (i_4309_ < 0) {
			int i_4310_ = i_4309_ + i_4274_;
			if (i_4310_ >= 0) {
			    if (i_4310_ >= is.length)
				break;
			    int i_4311_ = anInt9925;
			    int i_4312_ = anInt9927 + anInt9929;
			    int i_4313_ = anInt9928;
			    int i_4314_ = anInt9906;
			    if (i_4313_ >= 0
				&& (i_4313_
				    - (((Class168_Sub2_Sub3) this).anInt9916
				       << 12)) < 0) {
				int i_4315_;
				if ((i_4315_
				     = i_4312_ - ((((Class168_Sub2_Sub3) this)
						   .anInt9920)
						  << 12))
				    >= 0) {
				    i_4315_
					= (anInt9921 - i_4315_) / anInt9921;
				    i_4314_ += i_4315_;
				    i_4312_ += anInt9921 * i_4315_;
				    i_4311_ += i_4315_;
				}
				if ((i_4315_
				     = (i_4312_ - anInt9921) / anInt9921)
				    > i_4314_)
				    i_4314_ = i_4315_;
				int i_4316_ = is[i_4310_] - i;
				int i_4317_ = -is_4273_[i_4310_];
				int i_4318_ = i_4316_ - (i_4311_ - anInt9925);
				if (i_4318_ > 0) {
				    i_4311_ += i_4318_;
				    i_4314_ += i_4318_;
				    i_4312_ += anInt9921 * i_4318_;
				    i_4313_ += anInt9922 * i_4318_;
				} else
				    i_4317_ -= i_4318_;
				if (i_4314_ < i_4317_)
				    i_4314_ = i_4317_;
				for (/**/; i_4314_ < 0; i_4314_++) {
				    int i_4319_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(((i_4313_ >> 12)
					      * (((Class168_Sub2_Sub3) this)
						 .anInt9920))
					     + (i_4312_ >> 12))]);
				    if (i_4319_ != 0)
					is_4275_[i_4311_++]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4319_ & 0xff]);
				    else
					i_4311_++;
				    i_4312_ += anInt9921;
				}
			    }
			}
			i_4309_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_4320_ = anInt9919;
		    while (i_4320_ < 0) {
			int i_4321_ = i_4320_ + i_4274_;
			if (i_4321_ >= 0) {
			    if (i_4321_ >= is.length)
				break;
			    int i_4322_ = anInt9925;
			    int i_4323_ = anInt9927 + anInt9929;
			    int i_4324_ = anInt9928 + anInt9930;
			    int i_4325_ = anInt9906;
			    int i_4326_;
			    if ((i_4326_
				 = (i_4323_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)))
				>= 0) {
				i_4326_ = (anInt9921 - i_4326_) / anInt9921;
				i_4325_ += i_4326_;
				i_4323_ += anInt9921 * i_4326_;
				i_4324_ += anInt9922 * i_4326_;
				i_4322_ += i_4326_;
			    }
			    if ((i_4326_ = (i_4323_ - anInt9921) / anInt9921)
				> i_4325_)
				i_4325_ = i_4326_;
			    if ((i_4326_
				 = (i_4324_
				    - (((Class168_Sub2_Sub3) this).anInt9916
				       << 12)))
				>= 0) {
				i_4326_ = (anInt9922 - i_4326_) / anInt9922;
				i_4325_ += i_4326_;
				i_4323_ += anInt9921 * i_4326_;
				i_4324_ += anInt9922 * i_4326_;
				i_4322_ += i_4326_;
			    }
			    if ((i_4326_ = (i_4324_ - anInt9922) / anInt9922)
				> i_4325_)
				i_4325_ = i_4326_;
			    int i_4327_ = is[i_4321_] - i;
			    int i_4328_ = -is_4273_[i_4321_];
			    int i_4329_ = i_4327_ - (i_4322_ - anInt9925);
			    if (i_4329_ > 0) {
				i_4322_ += i_4329_;
				i_4325_ += i_4329_;
				i_4323_ += anInt9921 * i_4329_;
				i_4324_ += anInt9922 * i_4329_;
			    } else
				i_4328_ -= i_4329_;
			    if (i_4325_ < i_4328_)
				i_4325_ = i_4328_;
			    for (/**/; i_4325_ < 0; i_4325_++) {
				int i_4330_
				    = (((Class168_Sub2_Sub3) this)
				       .aByteArray11205
				       [((i_4324_ >> 12)
					 * (((Class168_Sub2_Sub3) this)
					    .anInt9920)) + (i_4323_ >> 12)]);
				if (i_4330_ != 0)
				    is_4275_[i_4322_++]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_4330_ & 0xff]);
				else
				    i_4322_++;
				i_4323_ += anInt9921;
				i_4324_ += anInt9922;
			    }
			}
			i_4320_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_4331_ = anInt9919;
		    while (i_4331_ < 0) {
			int i_4332_ = i_4331_ + i_4274_;
			if (i_4332_ >= 0) {
			    if (i_4332_ >= is.length)
				break;
			    int i_4333_ = anInt9925;
			    int i_4334_ = anInt9927 + anInt9929;
			    int i_4335_ = anInt9928 + anInt9930;
			    int i_4336_ = anInt9906;
			    int i_4337_;
			    if ((i_4337_
				 = (i_4334_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)))
				>= 0) {
				i_4337_ = (anInt9921 - i_4337_) / anInt9921;
				i_4336_ += i_4337_;
				i_4334_ += anInt9921 * i_4337_;
				i_4335_ += anInt9922 * i_4337_;
				i_4333_ += i_4337_;
			    }
			    if ((i_4337_ = (i_4334_ - anInt9921) / anInt9921)
				> i_4336_)
				i_4336_ = i_4337_;
			    if (i_4335_ < 0) {
				i_4337_
				    = (anInt9922 - 1 - i_4335_) / anInt9922;
				i_4336_ += i_4337_;
				i_4334_ += anInt9921 * i_4337_;
				i_4335_ += anInt9922 * i_4337_;
				i_4333_ += i_4337_;
			    }
			    if ((i_4337_
				 = (1 + i_4335_
				    - (((Class168_Sub2_Sub3) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_4336_)
				i_4336_ = i_4337_;
			    int i_4338_ = is[i_4332_] - i;
			    int i_4339_ = -is_4273_[i_4332_];
			    int i_4340_ = i_4338_ - (i_4333_ - anInt9925);
			    if (i_4340_ > 0) {
				i_4333_ += i_4340_;
				i_4336_ += i_4340_;
				i_4334_ += anInt9921 * i_4340_;
				i_4335_ += anInt9922 * i_4340_;
			    } else
				i_4339_ -= i_4340_;
			    if (i_4336_ < i_4339_)
				i_4336_ = i_4339_;
			    for (/**/; i_4336_ < 0; i_4336_++) {
				int i_4341_
				    = (((Class168_Sub2_Sub3) this)
				       .aByteArray11205
				       [((i_4335_ >> 12)
					 * (((Class168_Sub2_Sub3) this)
					    .anInt9920)) + (i_4334_ >> 12)]);
				if (i_4341_ != 0)
				    is_4275_[i_4333_++]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_4341_ & 0xff]);
				else
				    i_4333_++;
				i_4334_ += anInt9921;
				i_4335_ += anInt9922;
			    }
			}
			i_4331_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_4342_ = anInt9919;
		while (i_4342_ < 0) {
		    int i_4343_ = i_4342_ + i_4274_;
		    if (i_4343_ >= 0) {
			if (i_4343_ >= is.length)
			    break;
			int i_4344_ = anInt9925;
			int i_4345_ = anInt9927 + anInt9929;
			int i_4346_ = anInt9928;
			int i_4347_ = anInt9906;
			if (i_4346_ >= 0
			    && i_4346_ - (((Class168_Sub2_Sub3) this).anInt9916
					  << 12) < 0) {
			    if (i_4345_ < 0) {
				int i_4348_
				    = (anInt9921 - 1 - i_4345_) / anInt9921;
				i_4347_ += i_4348_;
				i_4345_ += anInt9921 * i_4348_;
				i_4344_ += i_4348_;
			    }
			    int i_4349_;
			    if ((i_4349_
				 = (1 + i_4345_
				    - (((Class168_Sub2_Sub3) this).anInt9920
				       << 12)
				    - anInt9921) / anInt9921)
				> i_4347_)
				i_4347_ = i_4349_;
			    int i_4350_ = is[i_4343_] - i;
			    int i_4351_ = -is_4273_[i_4343_];
			    int i_4352_ = i_4350_ - (i_4344_ - anInt9925);
			    if (i_4352_ > 0) {
				i_4344_ += i_4352_;
				i_4347_ += i_4352_;
				i_4345_ += anInt9921 * i_4352_;
				i_4346_ += anInt9922 * i_4352_;
			    } else
				i_4351_ -= i_4352_;
			    if (i_4347_ < i_4351_)
				i_4347_ = i_4351_;
			    for (/**/; i_4347_ < 0; i_4347_++) {
				int i_4353_
				    = (((Class168_Sub2_Sub3) this)
				       .aByteArray11205
				       [((i_4346_ >> 12)
					 * (((Class168_Sub2_Sub3) this)
					    .anInt9920)) + (i_4345_ >> 12)]);
				if (i_4353_ != 0)
				    is_4275_[i_4344_++]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204[i_4353_ & 0xff]);
				else
				    i_4344_++;
				i_4345_ += anInt9921;
			    }
			}
		    }
		    i_4342_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		int i_4354_ = anInt9919;
		while (i_4354_ < 0) {
		    int i_4355_ = i_4354_ + i_4274_;
		    if (i_4355_ >= 0) {
			if (i_4355_ >= is.length)
			    break;
			int i_4356_ = anInt9925;
			int i_4357_ = anInt9927 + anInt9929;
			int i_4358_ = anInt9928 + anInt9930;
			int i_4359_ = anInt9906;
			if (i_4357_ < 0) {
			    int i_4360_
				= (anInt9921 - 1 - i_4357_) / anInt9921;
			    i_4359_ += i_4360_;
			    i_4357_ += anInt9921 * i_4360_;
			    i_4358_ += anInt9922 * i_4360_;
			    i_4356_ += i_4360_;
			}
			int i_4361_;
			if ((i_4361_
			     = (1 + i_4357_
				- (((Class168_Sub2_Sub3) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_4359_)
			    i_4359_ = i_4361_;
			if ((i_4361_
			     = i_4358_ - (((Class168_Sub2_Sub3) this).anInt9916
					  << 12))
			    >= 0) {
			    i_4361_ = (anInt9922 - i_4361_) / anInt9922;
			    i_4359_ += i_4361_;
			    i_4357_ += anInt9921 * i_4361_;
			    i_4358_ += anInt9922 * i_4361_;
			    i_4356_ += i_4361_;
			}
			if ((i_4361_ = (i_4358_ - anInt9922) / anInt9922)
			    > i_4359_)
			    i_4359_ = i_4361_;
			int i_4362_ = is[i_4355_] - i;
			int i_4363_ = -is_4273_[i_4355_];
			int i_4364_ = i_4362_ - (i_4356_ - anInt9925);
			if (i_4364_ > 0) {
			    i_4356_ += i_4364_;
			    i_4359_ += i_4364_;
			    i_4357_ += anInt9921 * i_4364_;
			    i_4358_ += anInt9922 * i_4364_;
			} else
			    i_4363_ -= i_4364_;
			if (i_4359_ < i_4363_)
			    i_4359_ = i_4363_;
			for (/**/; i_4359_ < 0; i_4359_++) {
			    int i_4365_
				= (((Class168_Sub2_Sub3) this).aByteArray11205
				   [(((i_4358_ >> 12)
				      * ((Class168_Sub2_Sub3) this).anInt9920)
				     + (i_4357_ >> 12))]);
			    if (i_4365_ != 0)
				is_4275_[i_4356_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204[i_4365_ & 0xff]);
			    else
				i_4356_++;
			    i_4357_ += anInt9921;
			    i_4358_ += anInt9922;
			}
		    }
		    i_4354_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		int i_4366_ = anInt9919;
		while (i_4366_ < 0) {
		    int i_4367_ = i_4366_ + i_4274_;
		    if (i_4367_ >= 0) {
			if (i_4367_ >= is.length)
			    break;
			int i_4368_ = anInt9925;
			int i_4369_ = anInt9927 + anInt9929;
			int i_4370_ = anInt9928 + anInt9930;
			int i_4371_ = anInt9906;
			if (i_4369_ < 0) {
			    int i_4372_
				= (anInt9921 - 1 - i_4369_) / anInt9921;
			    i_4371_ += i_4372_;
			    i_4369_ += anInt9921 * i_4372_;
			    i_4370_ += anInt9922 * i_4372_;
			    i_4368_ += i_4372_;
			}
			int i_4373_;
			if ((i_4373_
			     = (1 + i_4369_
				- (((Class168_Sub2_Sub3) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_4371_)
			    i_4371_ = i_4373_;
			if (i_4370_ < 0) {
			    i_4373_ = (anInt9922 - 1 - i_4370_) / anInt9922;
			    i_4371_ += i_4373_;
			    i_4369_ += anInt9921 * i_4373_;
			    i_4370_ += anInt9922 * i_4373_;
			    i_4368_ += i_4373_;
			}
			if ((i_4373_
			     = (1 + i_4370_
				- (((Class168_Sub2_Sub3) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_4371_)
			    i_4371_ = i_4373_;
			int i_4374_ = is[i_4367_] - i;
			int i_4375_ = -is_4273_[i_4367_];
			int i_4376_ = i_4374_ - (i_4368_ - anInt9925);
			if (i_4376_ > 0) {
			    i_4368_ += i_4376_;
			    i_4371_ += i_4376_;
			    i_4369_ += anInt9921 * i_4376_;
			    i_4370_ += anInt9922 * i_4376_;
			} else
			    i_4375_ -= i_4376_;
			if (i_4371_ < i_4375_)
			    i_4371_ = i_4375_;
			for (/**/; i_4371_ < 0; i_4371_++) {
			    int i_4377_
				= (((Class168_Sub2_Sub3) this).aByteArray11205
				   [(((i_4370_ >> 12)
				      * ((Class168_Sub2_Sub3) this).anInt9920)
				     + (i_4369_ >> 12))]);
			    if (i_4377_ != 0)
				is_4275_[i_4368_++]
				    = (((Class168_Sub2_Sub3) this)
				       .anIntArray11204[i_4377_ & 0xff]);
			    else
				i_4368_++;
			    i_4369_ += anInt9921;
			    i_4370_ += anInt9922;
			}
		    }
		    i_4366_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    void method16226(boolean bool, boolean bool_4378_, boolean bool_4379_,
		     int i, int i_4380_, float f, int i_4381_, int i_4382_,
		     int i_4383_, int i_4384_, int i_4385_, int i_4386_,
		     boolean bool_4387_) {
	if (i_4381_ > 0 && i_4382_ > 0 && (bool || bool_4378_)) {
	    int i_4388_ = 0;
	    int i_4389_ = 0;
	    int i_4390_ = (((Class168_Sub2_Sub3) this).anInt9907
			   + ((Class168_Sub2_Sub3) this).anInt9920
			   + ((Class168_Sub2_Sub3) this).anInt9909);
	    int i_4391_ = (((Class168_Sub2_Sub3) this).anInt9905
			   + ((Class168_Sub2_Sub3) this).anInt9916
			   + ((Class168_Sub2_Sub3) this).anInt9910);
	    int i_4392_ = (i_4390_ << 16) / i_4381_;
	    int i_4393_ = (i_4391_ << 16) / i_4382_;
	    if (((Class168_Sub2_Sub3) this).anInt9907 > 0) {
		int i_4394_ = (((((Class168_Sub2_Sub3) this).anInt9907 << 16)
				+ i_4392_ - 1)
			       / i_4392_);
		i += i_4394_;
		i_4388_ += (i_4394_ * i_4392_
			    - (((Class168_Sub2_Sub3) this).anInt9907 << 16));
	    }
	    if (((Class168_Sub2_Sub3) this).anInt9905 > 0) {
		int i_4395_ = (((((Class168_Sub2_Sub3) this).anInt9905 << 16)
				+ i_4393_ - 1)
			       / i_4393_);
		i_4380_ += i_4395_;
		i_4389_ += (i_4395_ * i_4393_
			    - (((Class168_Sub2_Sub3) this).anInt9905 << 16));
	    }
	    if (((Class168_Sub2_Sub3) this).anInt9920 < i_4390_)
		i_4381_ = ((((Class168_Sub2_Sub3) this).anInt9920 << 16)
			   - i_4388_ + i_4392_ - 1) / i_4392_;
	    if (((Class168_Sub2_Sub3) this).anInt9916 < i_4391_)
		i_4382_ = ((((Class168_Sub2_Sub3) this).anInt9916 << 16)
			   - i_4389_ + i_4393_ - 1) / i_4393_;
	    int i_4396_
		= i + i_4380_ * ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						    .aClass103_Sub2_9904))
				  .anInt9260)
				 * -1826993761);
	    int i_4397_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					      .aClass103_Sub2_9904)).anInt9260
			    * -1826993761)
			   - i_4381_);
	    if (i_4380_ + i_4382_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_4382_ -= (i_4380_ + i_4382_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i_4380_ < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_4398_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_4380_);
		i_4382_ -= i_4398_;
		i_4396_ += i_4398_ * (((Class103_Sub2)
				       (((Class168_Sub2_Sub3) this)
					.aClass103_Sub2_9904)).anInt9260
				      * -1826993761);
		i_4389_ += i_4393_ * i_4398_;
	    }
	    if (i + i_4381_ > (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_4399_ = (i + i_4381_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_4381_ -= i_4399_;
		i_4397_ += i_4399_;
	    }
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_4400_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_4381_ -= i_4400_;
		i_4396_ += i_4400_;
		i_4388_ += i_4392_ * i_4400_;
		i_4397_ += i_4400_;
	    }
	    float[] fs = (((Class103_Sub2)
			   ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			  .aFloatArray9248);
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (i_4385_ == 0) {
		if (i_4383_ == 1) {
		    int i_4401_ = i_4388_;
		    for (int i_4402_ = -i_4382_; i_4402_ < 0; i_4402_++) {
			int i_4403_
			    = ((i_4389_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4404_ = -i_4381_; i_4404_ < 0; i_4404_++) {
			    if (!bool_4378_ || f < fs[i_4396_]) {
				if (bool)
				    is[i_4396_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_4388_ >> 16) + i_4403_])
					     & 0xff)]);
				if (bool_4378_ && bool_4387_)
				    fs[i_4396_] = f;
			    }
			    i_4388_ += i_4392_;
			    i_4396_++;
			}
			i_4389_ += i_4393_;
			i_4388_ = i_4401_;
			i_4396_ += i_4397_;
		    }
		} else if (i_4383_ == 0) {
		    int i_4405_ = (i_4384_ & 0xff0000) >> 16;
		    int i_4406_ = (i_4384_ & 0xff00) >> 8;
		    int i_4407_ = i_4384_ & 0xff;
		    int i_4408_ = i_4388_;
		    for (int i_4409_ = -i_4382_; i_4409_ < 0; i_4409_++) {
			int i_4410_
			    = ((i_4389_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4411_ = -i_4381_; i_4411_ < 0; i_4411_++) {
			    if (!bool_4378_ || f < fs[i_4396_]) {
				if (bool) {
				    int i_4412_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_4388_ >> 16) + i_4410_])
					     & 0xff)]);
				    int i_4413_
					= ((i_4412_ & 0xff0000) * i_4405_
					   & ~0xffffff);
				    int i_4414_ = ((i_4412_ & 0xff00) * i_4406_
						   & 0xff0000);
				    int i_4415_
					= (i_4412_ & 0xff) * i_4407_ & 0xff00;
				    is[i_4396_]
					= (i_4413_ | i_4414_ | i_4415_) >>> 8;
				}
				if (bool_4378_ && bool_4387_)
				    fs[i_4396_] = f;
			    }
			    i_4388_ += i_4392_;
			    i_4396_++;
			}
			i_4389_ += i_4393_;
			i_4388_ = i_4408_;
			i_4396_ += i_4397_;
		    }
		} else if (i_4383_ == 3) {
		    int i_4416_ = i_4388_;
		    for (int i_4417_ = -i_4382_; i_4417_ < 0; i_4417_++) {
			int i_4418_
			    = ((i_4389_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4419_ = -i_4381_; i_4419_ < 0; i_4419_++) {
			    if (!bool_4378_ || f < fs[i_4396_]) {
				if (bool) {
				    byte i_4420_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_4388_ >> 16) + i_4418_]);
				    int i_4421_
					= (i_4420_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_4420_])
					   : 0);
				    int i_4422_ = i_4421_ + i_4384_;
				    int i_4423_ = ((i_4421_ & 0xff00ff)
						   + (i_4384_ & 0xff00ff));
				    int i_4424_
					= ((i_4423_ & 0x1000100)
					   + (i_4422_ - i_4423_ & 0x10000));
				    is[i_4396_]
					= (i_4422_ - i_4424_
					   | i_4424_ - (i_4424_ >>> 8));
				}
				if (bool_4378_ && bool_4387_)
				    fs[i_4396_] = f;
			    }
			    i_4388_ += i_4392_;
			    i_4396_++;
			}
			i_4389_ += i_4393_;
			i_4388_ = i_4416_;
			i_4396_ += i_4397_;
		    }
		} else if (i_4383_ == 2) {
		    int i_4425_ = i_4384_ >>> 24;
		    int i_4426_ = 256 - i_4425_;
		    int i_4427_ = (i_4384_ & 0xff00ff) * i_4426_ & ~0xff00ff;
		    int i_4428_ = (i_4384_ & 0xff00) * i_4426_ & 0xff0000;
		    i_4384_ = (i_4427_ | i_4428_) >>> 8;
		    int i_4429_ = i_4388_;
		    for (int i_4430_ = -i_4382_; i_4430_ < 0; i_4430_++) {
			int i_4431_
			    = ((i_4389_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4432_ = -i_4381_; i_4432_ < 0; i_4432_++) {
			    if (!bool_4378_ || f < fs[i_4396_]) {
				if (bool) {
				    int i_4433_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_4388_ >> 16) + i_4431_])
					     & 0xff)]);
				    i_4427_ = ((i_4433_ & 0xff00ff) * i_4425_
					       & ~0xff00ff);
				    i_4428_ = ((i_4433_ & 0xff00) * i_4425_
					       & 0xff0000);
				    is[i_4396_] = (((i_4427_ | i_4428_) >>> 8)
						   + i_4384_);
				}
				if (bool_4378_ && bool_4387_)
				    fs[i_4396_] = f;
			    }
			    i_4388_ += i_4392_;
			    i_4396_++;
			}
			i_4389_ += i_4393_;
			i_4388_ = i_4429_;
			i_4396_ += i_4397_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_4385_ == 1) {
		if (i_4383_ == 1) {
		    int i_4434_ = i_4388_;
		    for (int i_4435_ = -i_4382_; i_4435_ < 0; i_4435_++) {
			int i_4436_
			    = ((i_4389_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4437_ = -i_4381_; i_4437_ < 0; i_4437_++) {
			    if (!bool_4378_ || f < fs[i_4396_]) {
				int i_4438_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_4388_ >> 16) + i_4436_]);
				if (i_4438_ != 0) {
				    if (bool)
					is[i_4396_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4438_ & 0xff]);
				    if (bool_4378_ && bool_4387_)
					fs[i_4396_] = f;
				}
			    }
			    i_4388_ += i_4392_;
			    i_4396_++;
			}
			i_4389_ += i_4393_;
			i_4388_ = i_4434_;
			i_4396_ += i_4397_;
		    }
		} else if (i_4383_ == 0) {
		    int i_4439_ = i_4388_;
		    if ((i_4384_ & 0xffffff) == 16777215) {
			int i_4440_ = i_4384_ >>> 24;
			int i_4441_ = 256 - i_4440_;
			for (int i_4442_ = -i_4382_; i_4442_ < 0; i_4442_++) {
			    int i_4443_
				= ((i_4389_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_4444_ = -i_4381_; i_4444_ < 0;
				 i_4444_++) {
				if (!bool_4378_ || f < fs[i_4396_]) {
				    int i_4445_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_4388_ >> 16) + i_4443_]);
				    if (i_4445_ != 0) {
					if (bool) {
					    int i_4446_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_4445_ & 0xff]);
					    int i_4447_ = is[i_4396_];
					    is[i_4396_]
						= (((((i_4446_ & 0xff00ff)
						      * i_4440_)
						     + ((i_4447_ & 0xff00ff)
							* i_4441_))
						    & ~0xff00ff)
						   + ((((i_4446_ & 0xff00)
							* i_4440_)
						       + ((i_4447_ & 0xff00)
							  * i_4441_))
						      & 0xff0000)) >> 8;
					}
					if (bool_4378_ && bool_4387_)
					    fs[i_4396_] = f;
				    }
				}
				i_4388_ += i_4392_;
				i_4396_++;
			    }
			    i_4389_ += i_4393_;
			    i_4388_ = i_4439_;
			    i_4396_ += i_4397_;
			}
		    } else {
			int i_4448_ = (i_4384_ & 0xff0000) >> 16;
			int i_4449_ = (i_4384_ & 0xff00) >> 8;
			int i_4450_ = i_4384_ & 0xff;
			int i_4451_ = i_4384_ >>> 24;
			int i_4452_ = 256 - i_4451_;
			for (int i_4453_ = -i_4382_; i_4453_ < 0; i_4453_++) {
			    int i_4454_
				= ((i_4389_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_4455_ = -i_4381_; i_4455_ < 0;
				 i_4455_++) {
				if (!bool_4378_ || f < fs[i_4396_]) {
				    int i_4456_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_4388_ >> 16) + i_4454_]);
				    if (i_4456_ != 0) {
					int i_4457_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4456_ & 0xff]);
					if (i_4451_ != 255) {
					    if (bool) {
						int i_4458_
						    = (((i_4457_ & 0xff0000)
							* i_4448_)
						       & ~0xffffff);
						int i_4459_
						    = (((i_4457_ & 0xff00)
							* i_4449_)
						       & 0xff0000);
						int i_4460_
						    = (((i_4457_ & 0xff)
							* i_4450_)
						       & 0xff00);
						i_4457_ = (i_4458_ | i_4459_
							   | i_4460_) >>> 8;
						int i_4461_ = is[i_4396_];
						is[i_4396_]
						    = (((((i_4457_ & 0xff00ff)
							  * i_4451_)
							 + ((i_4461_
							     & 0xff00ff)
							    * i_4452_))
							& ~0xff00ff)
						       + ((((i_4457_ & 0xff00)
							    * i_4451_)
							   + ((i_4461_
							       & 0xff00)
							      * i_4452_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_4378_ && bool_4387_)
						fs[i_4396_] = f;
					} else {
					    if (bool) {
						int i_4462_
						    = (((i_4457_ & 0xff0000)
							* i_4448_)
						       & ~0xffffff);
						int i_4463_
						    = (((i_4457_ & 0xff00)
							* i_4449_)
						       & 0xff0000);
						int i_4464_
						    = (((i_4457_ & 0xff)
							* i_4450_)
						       & 0xff00);
						is[i_4396_]
						    = (i_4462_ | i_4463_
						       | i_4464_) >>> 8;
					    }
					    if (bool_4378_ && bool_4387_)
						fs[i_4396_] = f;
					}
				    }
				}
				i_4388_ += i_4392_;
				i_4396_++;
			    }
			    i_4389_ += i_4393_;
			    i_4388_ = i_4439_;
			    i_4396_ += i_4397_;
			}
		    }
		} else if (i_4383_ == 3) {
		    int i_4465_ = i_4388_;
		    int i_4466_ = i_4384_ >>> 24;
		    int i_4467_ = 256 - i_4466_;
		    for (int i_4468_ = -i_4382_; i_4468_ < 0; i_4468_++) {
			int i_4469_
			    = ((i_4389_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4470_ = -i_4381_; i_4470_ < 0; i_4470_++) {
			    if (!bool_4378_ || f < fs[i_4396_]) {
				if (bool) {
				    byte i_4471_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_4388_ >> 16) + i_4469_]);
				    int i_4472_
					= (i_4471_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_4471_])
					   : 0);
				    int i_4473_ = i_4472_ + i_4384_;
				    int i_4474_ = ((i_4472_ & 0xff00ff)
						   + (i_4384_ & 0xff00ff));
				    int i_4475_
					= ((i_4474_ & 0x1000100)
					   + (i_4473_ - i_4474_ & 0x10000));
				    i_4475_ = (i_4473_ - i_4475_
					       | i_4475_ - (i_4475_ >>> 8));
				    if (i_4472_ == 0 && i_4466_ != 255) {
					i_4472_ = i_4475_;
					i_4475_ = is[i_4396_];
					i_4475_
					    = ((((i_4472_ & 0xff00ff) * i_4466_
						 + ((i_4475_ & 0xff00ff)
						    * i_4467_))
						& ~0xff00ff)
					       + (((i_4472_ & 0xff00) * i_4466_
						   + ((i_4475_ & 0xff00)
						      * i_4467_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_4396_] = i_4475_;
				}
				if (bool_4378_ && bool_4387_)
				    fs[i_4396_] = f;
			    }
			    i_4388_ += i_4392_;
			    i_4396_++;
			}
			i_4389_ += i_4393_;
			i_4388_ = i_4465_;
			i_4396_ += i_4397_;
		    }
		} else if (i_4383_ == 2) {
		    int i_4476_ = i_4384_ >>> 24;
		    int i_4477_ = 256 - i_4476_;
		    int i_4478_ = (i_4384_ & 0xff00ff) * i_4477_ & ~0xff00ff;
		    int i_4479_ = (i_4384_ & 0xff00) * i_4477_ & 0xff0000;
		    i_4384_ = (i_4478_ | i_4479_) >>> 8;
		    int i_4480_ = i_4388_;
		    for (int i_4481_ = -i_4382_; i_4481_ < 0; i_4481_++) {
			int i_4482_
			    = ((i_4389_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4483_ = -i_4381_; i_4483_ < 0; i_4483_++) {
			    if (!bool_4378_ || f < fs[i_4396_]) {
				int i_4484_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_4388_ >> 16) + i_4482_]);
				if (i_4484_ != 0) {
				    if (bool) {
					int i_4485_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4484_ & 0xff]);
					i_4478_
					    = ((i_4485_ & 0xff00ff) * i_4476_
					       & ~0xff00ff);
					i_4479_ = ((i_4485_ & 0xff00) * i_4476_
						   & 0xff0000);
					is[i_4396_] = ((i_4478_ | i_4479_)
						       >>> 8) + i_4384_;
				    }
				    if (bool_4378_ && bool_4387_)
					fs[i_4396_] = f;
				}
			    }
			    i_4388_ += i_4392_;
			    i_4396_++;
			}
			i_4389_ += i_4393_;
			i_4388_ = i_4480_;
			i_4396_ += i_4397_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_4385_ == 2) {
		if (i_4383_ == 1) {
		    int i_4486_ = i_4388_;
		    for (int i_4487_ = -i_4382_; i_4487_ < 0; i_4487_++) {
			int i_4488_
			    = ((i_4389_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4489_ = -i_4381_; i_4489_ < 0; i_4489_++) {
			    if (!bool_4378_ || f < fs[i_4396_]) {
				int i_4490_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_4388_ >> 16) + i_4488_]);
				if (i_4490_ != 0) {
				    if (bool) {
					int i_4491_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4490_ & 0xff]);
					int i_4492_ = is[i_4396_];
					int i_4493_ = i_4491_ + i_4492_;
					int i_4494_ = ((i_4491_ & 0xff00ff)
						       + (i_4492_ & 0xff00ff));
					i_4492_ = ((i_4494_ & 0x1000100)
						   + (i_4493_ - i_4494_
						      & 0x10000));
					is[i_4396_]
					    = (i_4493_ - i_4492_
					       | i_4492_ - (i_4492_ >>> 8));
				    }
				    if (bool_4378_ && bool_4387_)
					fs[i_4396_] = f;
				}
			    }
			    i_4388_ += i_4392_;
			    i_4396_++;
			}
			i_4389_ += i_4393_;
			i_4388_ = i_4486_;
			i_4396_ += i_4397_;
		    }
		} else if (i_4383_ == 0) {
		    int i_4495_ = i_4388_;
		    int i_4496_ = (i_4384_ & 0xff0000) >> 16;
		    int i_4497_ = (i_4384_ & 0xff00) >> 8;
		    int i_4498_ = i_4384_ & 0xff;
		    for (int i_4499_ = -i_4382_; i_4499_ < 0; i_4499_++) {
			int i_4500_
			    = ((i_4389_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4501_ = -i_4381_; i_4501_ < 0; i_4501_++) {
			    if (!bool_4378_ || f < fs[i_4396_]) {
				int i_4502_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_4388_ >> 16) + i_4500_]);
				if (i_4502_ != 0) {
				    if (bool) {
					int i_4503_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4502_ & 0xff]);
					int i_4504_
					    = ((i_4503_ & 0xff0000) * i_4496_
					       & ~0xffffff);
					int i_4505_
					    = ((i_4503_ & 0xff00) * i_4497_
					       & 0xff0000);
					int i_4506_
					    = ((i_4503_ & 0xff) * i_4498_
					       & 0xff00);
					i_4503_ = (i_4504_ | i_4505_
						   | i_4506_) >>> 8;
					int i_4507_ = is[i_4396_];
					int i_4508_ = i_4503_ + i_4507_;
					int i_4509_ = ((i_4503_ & 0xff00ff)
						       + (i_4507_ & 0xff00ff));
					i_4507_ = ((i_4509_ & 0x1000100)
						   + (i_4508_ - i_4509_
						      & 0x10000));
					is[i_4396_]
					    = (i_4508_ - i_4507_
					       | i_4507_ - (i_4507_ >>> 8));
				    }
				    if (bool_4378_ && bool_4387_)
					fs[i_4396_] = f;
				}
			    }
			    i_4388_ += i_4392_;
			    i_4396_++;
			}
			i_4389_ += i_4393_;
			i_4388_ = i_4495_;
			i_4396_ += i_4397_;
		    }
		} else if (i_4383_ == 3) {
		    int i_4510_ = i_4388_;
		    for (int i_4511_ = -i_4382_; i_4511_ < 0; i_4511_++) {
			int i_4512_
			    = ((i_4389_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4513_ = -i_4381_; i_4513_ < 0; i_4513_++) {
			    if (!bool_4378_ || f < fs[i_4396_]) {
				if (bool) {
				    byte i_4514_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_4388_ >> 16) + i_4512_]);
				    int i_4515_
					= (i_4514_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_4514_])
					   : 0);
				    int i_4516_ = i_4515_ + i_4384_;
				    int i_4517_ = ((i_4515_ & 0xff00ff)
						   + (i_4384_ & 0xff00ff));
				    int i_4518_
					= ((i_4517_ & 0x1000100)
					   + (i_4516_ - i_4517_ & 0x10000));
				    i_4515_ = (i_4516_ - i_4518_
					       | i_4518_ - (i_4518_ >>> 8));
				    i_4518_ = is[i_4396_];
				    i_4516_ = i_4515_ + i_4518_;
				    i_4517_
					= (i_4515_ & 0xff00ff) + (i_4518_
								  & 0xff00ff);
				    i_4518_
					= ((i_4517_ & 0x1000100)
					   + (i_4516_ - i_4517_ & 0x10000));
				    is[i_4396_]
					= (i_4516_ - i_4518_
					   | i_4518_ - (i_4518_ >>> 8));
				}
				if (bool_4378_ && bool_4387_)
				    fs[i_4396_] = f;
			    }
			    i_4388_ += i_4392_;
			    i_4396_++;
			}
			i_4389_ += i_4393_;
			i_4388_ = i_4510_;
			i_4396_ += i_4397_;
		    }
		} else if (i_4383_ == 2) {
		    int i_4519_ = i_4384_ >>> 24;
		    int i_4520_ = 256 - i_4519_;
		    int i_4521_ = (i_4384_ & 0xff00ff) * i_4520_ & ~0xff00ff;
		    int i_4522_ = (i_4384_ & 0xff00) * i_4520_ & 0xff0000;
		    i_4384_ = (i_4521_ | i_4522_) >>> 8;
		    int i_4523_ = i_4388_;
		    for (int i_4524_ = -i_4382_; i_4524_ < 0; i_4524_++) {
			int i_4525_
			    = ((i_4389_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4526_ = -i_4381_; i_4526_ < 0; i_4526_++) {
			    if (!bool_4378_ || f < fs[i_4396_]) {
				int i_4527_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_4388_ >> 16) + i_4525_]);
				if (i_4527_ != 0) {
				    if (bool) {
					int i_4528_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4527_ & 0xff]);
					i_4521_
					    = ((i_4528_ & 0xff00ff) * i_4519_
					       & ~0xff00ff);
					i_4522_ = ((i_4528_ & 0xff00) * i_4519_
						   & 0xff0000);
					i_4528_ = (((i_4521_ | i_4522_) >>> 8)
						   + i_4384_);
					int i_4529_ = is[i_4396_];
					int i_4530_ = i_4528_ + i_4529_;
					int i_4531_ = ((i_4528_ & 0xff00ff)
						       + (i_4529_ & 0xff00ff));
					i_4529_ = ((i_4531_ & 0x1000100)
						   + (i_4530_ - i_4531_
						      & 0x10000));
					is[i_4396_]
					    = (i_4530_ - i_4529_
					       | i_4529_ - (i_4529_ >>> 8));
				    }
				    if (bool_4378_ && bool_4387_)
					fs[i_4396_] = f;
				}
			    }
			    i_4388_ += i_4392_;
			    i_4396_++;
			}
			i_4389_ += i_4393_;
			i_4388_ = i_4523_;
			i_4396_ += i_4397_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method16227(boolean bool, boolean bool_4532_, boolean bool_4533_,
		     int i, int i_4534_, float f, int i_4535_, int i_4536_,
		     int i_4537_, int i_4538_, int i_4539_, int i_4540_,
		     boolean bool_4541_) {
	if (i_4535_ > 0 && i_4536_ > 0 && (bool || bool_4532_)) {
	    int i_4542_ = 0;
	    int i_4543_ = 0;
	    int i_4544_ = (((Class168_Sub2_Sub3) this).anInt9907
			   + ((Class168_Sub2_Sub3) this).anInt9920
			   + ((Class168_Sub2_Sub3) this).anInt9909);
	    int i_4545_ = (((Class168_Sub2_Sub3) this).anInt9905
			   + ((Class168_Sub2_Sub3) this).anInt9916
			   + ((Class168_Sub2_Sub3) this).anInt9910);
	    int i_4546_ = (i_4544_ << 16) / i_4535_;
	    int i_4547_ = (i_4545_ << 16) / i_4536_;
	    if (((Class168_Sub2_Sub3) this).anInt9907 > 0) {
		int i_4548_ = (((((Class168_Sub2_Sub3) this).anInt9907 << 16)
				+ i_4546_ - 1)
			       / i_4546_);
		i += i_4548_;
		i_4542_ += (i_4548_ * i_4546_
			    - (((Class168_Sub2_Sub3) this).anInt9907 << 16));
	    }
	    if (((Class168_Sub2_Sub3) this).anInt9905 > 0) {
		int i_4549_ = (((((Class168_Sub2_Sub3) this).anInt9905 << 16)
				+ i_4547_ - 1)
			       / i_4547_);
		i_4534_ += i_4549_;
		i_4543_ += (i_4549_ * i_4547_
			    - (((Class168_Sub2_Sub3) this).anInt9905 << 16));
	    }
	    if (((Class168_Sub2_Sub3) this).anInt9920 < i_4544_)
		i_4535_ = ((((Class168_Sub2_Sub3) this).anInt9920 << 16)
			   - i_4542_ + i_4546_ - 1) / i_4546_;
	    if (((Class168_Sub2_Sub3) this).anInt9916 < i_4545_)
		i_4536_ = ((((Class168_Sub2_Sub3) this).anInt9916 << 16)
			   - i_4543_ + i_4547_ - 1) / i_4547_;
	    int i_4550_
		= i + i_4534_ * ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						    .aClass103_Sub2_9904))
				  .anInt9260)
				 * -1826993761);
	    int i_4551_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					      .aClass103_Sub2_9904)).anInt9260
			    * -1826993761)
			   - i_4535_);
	    if (i_4534_ + i_4536_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_4536_ -= (i_4534_ + i_4536_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i_4534_ < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_4552_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_4534_);
		i_4536_ -= i_4552_;
		i_4550_ += i_4552_ * (((Class103_Sub2)
				       (((Class168_Sub2_Sub3) this)
					.aClass103_Sub2_9904)).anInt9260
				      * -1826993761);
		i_4543_ += i_4547_ * i_4552_;
	    }
	    if (i + i_4535_ > (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_4553_ = (i + i_4535_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_4535_ -= i_4553_;
		i_4551_ += i_4553_;
	    }
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub3) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_4554_ = ((((Class103_Sub2) (((Class168_Sub2_Sub3) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_4535_ -= i_4554_;
		i_4550_ += i_4554_;
		i_4542_ += i_4546_ * i_4554_;
		i_4551_ += i_4554_;
	    }
	    float[] fs = (((Class103_Sub2)
			   ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			  .aFloatArray9248);
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub3) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (i_4539_ == 0) {
		if (i_4537_ == 1) {
		    int i_4555_ = i_4542_;
		    for (int i_4556_ = -i_4536_; i_4556_ < 0; i_4556_++) {
			int i_4557_
			    = ((i_4543_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4558_ = -i_4535_; i_4558_ < 0; i_4558_++) {
			    if (!bool_4532_ || f < fs[i_4550_]) {
				if (bool)
				    is[i_4550_]
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_4542_ >> 16) + i_4557_])
					     & 0xff)]);
				if (bool_4532_ && bool_4541_)
				    fs[i_4550_] = f;
			    }
			    i_4542_ += i_4546_;
			    i_4550_++;
			}
			i_4543_ += i_4547_;
			i_4542_ = i_4555_;
			i_4550_ += i_4551_;
		    }
		} else if (i_4537_ == 0) {
		    int i_4559_ = (i_4538_ & 0xff0000) >> 16;
		    int i_4560_ = (i_4538_ & 0xff00) >> 8;
		    int i_4561_ = i_4538_ & 0xff;
		    int i_4562_ = i_4542_;
		    for (int i_4563_ = -i_4536_; i_4563_ < 0; i_4563_++) {
			int i_4564_
			    = ((i_4543_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4565_ = -i_4535_; i_4565_ < 0; i_4565_++) {
			    if (!bool_4532_ || f < fs[i_4550_]) {
				if (bool) {
				    int i_4566_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_4542_ >> 16) + i_4564_])
					     & 0xff)]);
				    int i_4567_
					= ((i_4566_ & 0xff0000) * i_4559_
					   & ~0xffffff);
				    int i_4568_ = ((i_4566_ & 0xff00) * i_4560_
						   & 0xff0000);
				    int i_4569_
					= (i_4566_ & 0xff) * i_4561_ & 0xff00;
				    is[i_4550_]
					= (i_4567_ | i_4568_ | i_4569_) >>> 8;
				}
				if (bool_4532_ && bool_4541_)
				    fs[i_4550_] = f;
			    }
			    i_4542_ += i_4546_;
			    i_4550_++;
			}
			i_4543_ += i_4547_;
			i_4542_ = i_4562_;
			i_4550_ += i_4551_;
		    }
		} else if (i_4537_ == 3) {
		    int i_4570_ = i_4542_;
		    for (int i_4571_ = -i_4536_; i_4571_ < 0; i_4571_++) {
			int i_4572_
			    = ((i_4543_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4573_ = -i_4535_; i_4573_ < 0; i_4573_++) {
			    if (!bool_4532_ || f < fs[i_4550_]) {
				if (bool) {
				    byte i_4574_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_4542_ >> 16) + i_4572_]);
				    int i_4575_
					= (i_4574_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_4574_])
					   : 0);
				    int i_4576_ = i_4575_ + i_4538_;
				    int i_4577_ = ((i_4575_ & 0xff00ff)
						   + (i_4538_ & 0xff00ff));
				    int i_4578_
					= ((i_4577_ & 0x1000100)
					   + (i_4576_ - i_4577_ & 0x10000));
				    is[i_4550_]
					= (i_4576_ - i_4578_
					   | i_4578_ - (i_4578_ >>> 8));
				}
				if (bool_4532_ && bool_4541_)
				    fs[i_4550_] = f;
			    }
			    i_4542_ += i_4546_;
			    i_4550_++;
			}
			i_4543_ += i_4547_;
			i_4542_ = i_4570_;
			i_4550_ += i_4551_;
		    }
		} else if (i_4537_ == 2) {
		    int i_4579_ = i_4538_ >>> 24;
		    int i_4580_ = 256 - i_4579_;
		    int i_4581_ = (i_4538_ & 0xff00ff) * i_4580_ & ~0xff00ff;
		    int i_4582_ = (i_4538_ & 0xff00) * i_4580_ & 0xff0000;
		    i_4538_ = (i_4581_ | i_4582_) >>> 8;
		    int i_4583_ = i_4542_;
		    for (int i_4584_ = -i_4536_; i_4584_ < 0; i_4584_++) {
			int i_4585_
			    = ((i_4543_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4586_ = -i_4535_; i_4586_ < 0; i_4586_++) {
			    if (!bool_4532_ || f < fs[i_4550_]) {
				if (bool) {
				    int i_4587_
					= (((Class168_Sub2_Sub3) this)
					   .anIntArray11204
					   [((((Class168_Sub2_Sub3) this)
					      .aByteArray11205
					      [(i_4542_ >> 16) + i_4585_])
					     & 0xff)]);
				    i_4581_ = ((i_4587_ & 0xff00ff) * i_4579_
					       & ~0xff00ff);
				    i_4582_ = ((i_4587_ & 0xff00) * i_4579_
					       & 0xff0000);
				    is[i_4550_] = (((i_4581_ | i_4582_) >>> 8)
						   + i_4538_);
				}
				if (bool_4532_ && bool_4541_)
				    fs[i_4550_] = f;
			    }
			    i_4542_ += i_4546_;
			    i_4550_++;
			}
			i_4543_ += i_4547_;
			i_4542_ = i_4583_;
			i_4550_ += i_4551_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_4539_ == 1) {
		if (i_4537_ == 1) {
		    int i_4588_ = i_4542_;
		    for (int i_4589_ = -i_4536_; i_4589_ < 0; i_4589_++) {
			int i_4590_
			    = ((i_4543_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4591_ = -i_4535_; i_4591_ < 0; i_4591_++) {
			    if (!bool_4532_ || f < fs[i_4550_]) {
				int i_4592_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_4542_ >> 16) + i_4590_]);
				if (i_4592_ != 0) {
				    if (bool)
					is[i_4550_]
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4592_ & 0xff]);
				    if (bool_4532_ && bool_4541_)
					fs[i_4550_] = f;
				}
			    }
			    i_4542_ += i_4546_;
			    i_4550_++;
			}
			i_4543_ += i_4547_;
			i_4542_ = i_4588_;
			i_4550_ += i_4551_;
		    }
		} else if (i_4537_ == 0) {
		    int i_4593_ = i_4542_;
		    if ((i_4538_ & 0xffffff) == 16777215) {
			int i_4594_ = i_4538_ >>> 24;
			int i_4595_ = 256 - i_4594_;
			for (int i_4596_ = -i_4536_; i_4596_ < 0; i_4596_++) {
			    int i_4597_
				= ((i_4543_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_4598_ = -i_4535_; i_4598_ < 0;
				 i_4598_++) {
				if (!bool_4532_ || f < fs[i_4550_]) {
				    int i_4599_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_4542_ >> 16) + i_4597_]);
				    if (i_4599_ != 0) {
					if (bool) {
					    int i_4600_
						= (((Class168_Sub2_Sub3) this)
						   .anIntArray11204
						   [i_4599_ & 0xff]);
					    int i_4601_ = is[i_4550_];
					    is[i_4550_]
						= (((((i_4600_ & 0xff00ff)
						      * i_4594_)
						     + ((i_4601_ & 0xff00ff)
							* i_4595_))
						    & ~0xff00ff)
						   + ((((i_4600_ & 0xff00)
							* i_4594_)
						       + ((i_4601_ & 0xff00)
							  * i_4595_))
						      & 0xff0000)) >> 8;
					}
					if (bool_4532_ && bool_4541_)
					    fs[i_4550_] = f;
				    }
				}
				i_4542_ += i_4546_;
				i_4550_++;
			    }
			    i_4543_ += i_4547_;
			    i_4542_ = i_4593_;
			    i_4550_ += i_4551_;
			}
		    } else {
			int i_4602_ = (i_4538_ & 0xff0000) >> 16;
			int i_4603_ = (i_4538_ & 0xff00) >> 8;
			int i_4604_ = i_4538_ & 0xff;
			int i_4605_ = i_4538_ >>> 24;
			int i_4606_ = 256 - i_4605_;
			for (int i_4607_ = -i_4536_; i_4607_ < 0; i_4607_++) {
			    int i_4608_
				= ((i_4543_ >> 16)
				   * ((Class168_Sub2_Sub3) this).anInt9920);
			    for (int i_4609_ = -i_4535_; i_4609_ < 0;
				 i_4609_++) {
				if (!bool_4532_ || f < fs[i_4550_]) {
				    int i_4610_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_4542_ >> 16) + i_4608_]);
				    if (i_4610_ != 0) {
					int i_4611_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4610_ & 0xff]);
					if (i_4605_ != 255) {
					    if (bool) {
						int i_4612_
						    = (((i_4611_ & 0xff0000)
							* i_4602_)
						       & ~0xffffff);
						int i_4613_
						    = (((i_4611_ & 0xff00)
							* i_4603_)
						       & 0xff0000);
						int i_4614_
						    = (((i_4611_ & 0xff)
							* i_4604_)
						       & 0xff00);
						i_4611_ = (i_4612_ | i_4613_
							   | i_4614_) >>> 8;
						int i_4615_ = is[i_4550_];
						is[i_4550_]
						    = (((((i_4611_ & 0xff00ff)
							  * i_4605_)
							 + ((i_4615_
							     & 0xff00ff)
							    * i_4606_))
							& ~0xff00ff)
						       + ((((i_4611_ & 0xff00)
							    * i_4605_)
							   + ((i_4615_
							       & 0xff00)
							      * i_4606_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_4532_ && bool_4541_)
						fs[i_4550_] = f;
					} else {
					    if (bool) {
						int i_4616_
						    = (((i_4611_ & 0xff0000)
							* i_4602_)
						       & ~0xffffff);
						int i_4617_
						    = (((i_4611_ & 0xff00)
							* i_4603_)
						       & 0xff0000);
						int i_4618_
						    = (((i_4611_ & 0xff)
							* i_4604_)
						       & 0xff00);
						is[i_4550_]
						    = (i_4616_ | i_4617_
						       | i_4618_) >>> 8;
					    }
					    if (bool_4532_ && bool_4541_)
						fs[i_4550_] = f;
					}
				    }
				}
				i_4542_ += i_4546_;
				i_4550_++;
			    }
			    i_4543_ += i_4547_;
			    i_4542_ = i_4593_;
			    i_4550_ += i_4551_;
			}
		    }
		} else if (i_4537_ == 3) {
		    int i_4619_ = i_4542_;
		    int i_4620_ = i_4538_ >>> 24;
		    int i_4621_ = 256 - i_4620_;
		    for (int i_4622_ = -i_4536_; i_4622_ < 0; i_4622_++) {
			int i_4623_
			    = ((i_4543_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4624_ = -i_4535_; i_4624_ < 0; i_4624_++) {
			    if (!bool_4532_ || f < fs[i_4550_]) {
				if (bool) {
				    byte i_4625_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_4542_ >> 16) + i_4623_]);
				    int i_4626_
					= (i_4625_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_4625_])
					   : 0);
				    int i_4627_ = i_4626_ + i_4538_;
				    int i_4628_ = ((i_4626_ & 0xff00ff)
						   + (i_4538_ & 0xff00ff));
				    int i_4629_
					= ((i_4628_ & 0x1000100)
					   + (i_4627_ - i_4628_ & 0x10000));
				    i_4629_ = (i_4627_ - i_4629_
					       | i_4629_ - (i_4629_ >>> 8));
				    if (i_4626_ == 0 && i_4620_ != 255) {
					i_4626_ = i_4629_;
					i_4629_ = is[i_4550_];
					i_4629_
					    = ((((i_4626_ & 0xff00ff) * i_4620_
						 + ((i_4629_ & 0xff00ff)
						    * i_4621_))
						& ~0xff00ff)
					       + (((i_4626_ & 0xff00) * i_4620_
						   + ((i_4629_ & 0xff00)
						      * i_4621_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_4550_] = i_4629_;
				}
				if (bool_4532_ && bool_4541_)
				    fs[i_4550_] = f;
			    }
			    i_4542_ += i_4546_;
			    i_4550_++;
			}
			i_4543_ += i_4547_;
			i_4542_ = i_4619_;
			i_4550_ += i_4551_;
		    }
		} else if (i_4537_ == 2) {
		    int i_4630_ = i_4538_ >>> 24;
		    int i_4631_ = 256 - i_4630_;
		    int i_4632_ = (i_4538_ & 0xff00ff) * i_4631_ & ~0xff00ff;
		    int i_4633_ = (i_4538_ & 0xff00) * i_4631_ & 0xff0000;
		    i_4538_ = (i_4632_ | i_4633_) >>> 8;
		    int i_4634_ = i_4542_;
		    for (int i_4635_ = -i_4536_; i_4635_ < 0; i_4635_++) {
			int i_4636_
			    = ((i_4543_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4637_ = -i_4535_; i_4637_ < 0; i_4637_++) {
			    if (!bool_4532_ || f < fs[i_4550_]) {
				int i_4638_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_4542_ >> 16) + i_4636_]);
				if (i_4638_ != 0) {
				    if (bool) {
					int i_4639_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4638_ & 0xff]);
					i_4632_
					    = ((i_4639_ & 0xff00ff) * i_4630_
					       & ~0xff00ff);
					i_4633_ = ((i_4639_ & 0xff00) * i_4630_
						   & 0xff0000);
					is[i_4550_] = ((i_4632_ | i_4633_)
						       >>> 8) + i_4538_;
				    }
				    if (bool_4532_ && bool_4541_)
					fs[i_4550_] = f;
				}
			    }
			    i_4542_ += i_4546_;
			    i_4550_++;
			}
			i_4543_ += i_4547_;
			i_4542_ = i_4634_;
			i_4550_ += i_4551_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_4539_ == 2) {
		if (i_4537_ == 1) {
		    int i_4640_ = i_4542_;
		    for (int i_4641_ = -i_4536_; i_4641_ < 0; i_4641_++) {
			int i_4642_
			    = ((i_4543_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4643_ = -i_4535_; i_4643_ < 0; i_4643_++) {
			    if (!bool_4532_ || f < fs[i_4550_]) {
				int i_4644_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_4542_ >> 16) + i_4642_]);
				if (i_4644_ != 0) {
				    if (bool) {
					int i_4645_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4644_ & 0xff]);
					int i_4646_ = is[i_4550_];
					int i_4647_ = i_4645_ + i_4646_;
					int i_4648_ = ((i_4645_ & 0xff00ff)
						       + (i_4646_ & 0xff00ff));
					i_4646_ = ((i_4648_ & 0x1000100)
						   + (i_4647_ - i_4648_
						      & 0x10000));
					is[i_4550_]
					    = (i_4647_ - i_4646_
					       | i_4646_ - (i_4646_ >>> 8));
				    }
				    if (bool_4532_ && bool_4541_)
					fs[i_4550_] = f;
				}
			    }
			    i_4542_ += i_4546_;
			    i_4550_++;
			}
			i_4543_ += i_4547_;
			i_4542_ = i_4640_;
			i_4550_ += i_4551_;
		    }
		} else if (i_4537_ == 0) {
		    int i_4649_ = i_4542_;
		    int i_4650_ = (i_4538_ & 0xff0000) >> 16;
		    int i_4651_ = (i_4538_ & 0xff00) >> 8;
		    int i_4652_ = i_4538_ & 0xff;
		    for (int i_4653_ = -i_4536_; i_4653_ < 0; i_4653_++) {
			int i_4654_
			    = ((i_4543_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4655_ = -i_4535_; i_4655_ < 0; i_4655_++) {
			    if (!bool_4532_ || f < fs[i_4550_]) {
				int i_4656_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_4542_ >> 16) + i_4654_]);
				if (i_4656_ != 0) {
				    if (bool) {
					int i_4657_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4656_ & 0xff]);
					int i_4658_
					    = ((i_4657_ & 0xff0000) * i_4650_
					       & ~0xffffff);
					int i_4659_
					    = ((i_4657_ & 0xff00) * i_4651_
					       & 0xff0000);
					int i_4660_
					    = ((i_4657_ & 0xff) * i_4652_
					       & 0xff00);
					i_4657_ = (i_4658_ | i_4659_
						   | i_4660_) >>> 8;
					int i_4661_ = is[i_4550_];
					int i_4662_ = i_4657_ + i_4661_;
					int i_4663_ = ((i_4657_ & 0xff00ff)
						       + (i_4661_ & 0xff00ff));
					i_4661_ = ((i_4663_ & 0x1000100)
						   + (i_4662_ - i_4663_
						      & 0x10000));
					is[i_4550_]
					    = (i_4662_ - i_4661_
					       | i_4661_ - (i_4661_ >>> 8));
				    }
				    if (bool_4532_ && bool_4541_)
					fs[i_4550_] = f;
				}
			    }
			    i_4542_ += i_4546_;
			    i_4550_++;
			}
			i_4543_ += i_4547_;
			i_4542_ = i_4649_;
			i_4550_ += i_4551_;
		    }
		} else if (i_4537_ == 3) {
		    int i_4664_ = i_4542_;
		    for (int i_4665_ = -i_4536_; i_4665_ < 0; i_4665_++) {
			int i_4666_
			    = ((i_4543_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4667_ = -i_4535_; i_4667_ < 0; i_4667_++) {
			    if (!bool_4532_ || f < fs[i_4550_]) {
				if (bool) {
				    byte i_4668_
					= (((Class168_Sub2_Sub3) this)
					   .aByteArray11205
					   [(i_4542_ >> 16) + i_4666_]);
				    int i_4669_
					= (i_4668_ > 0
					   ? (((Class168_Sub2_Sub3) this)
					      .anIntArray11204[i_4668_])
					   : 0);
				    int i_4670_ = i_4669_ + i_4538_;
				    int i_4671_ = ((i_4669_ & 0xff00ff)
						   + (i_4538_ & 0xff00ff));
				    int i_4672_
					= ((i_4671_ & 0x1000100)
					   + (i_4670_ - i_4671_ & 0x10000));
				    i_4669_ = (i_4670_ - i_4672_
					       | i_4672_ - (i_4672_ >>> 8));
				    i_4672_ = is[i_4550_];
				    i_4670_ = i_4669_ + i_4672_;
				    i_4671_
					= (i_4669_ & 0xff00ff) + (i_4672_
								  & 0xff00ff);
				    i_4672_
					= ((i_4671_ & 0x1000100)
					   + (i_4670_ - i_4671_ & 0x10000));
				    is[i_4550_]
					= (i_4670_ - i_4672_
					   | i_4672_ - (i_4672_ >>> 8));
				}
				if (bool_4532_ && bool_4541_)
				    fs[i_4550_] = f;
			    }
			    i_4542_ += i_4546_;
			    i_4550_++;
			}
			i_4543_ += i_4547_;
			i_4542_ = i_4664_;
			i_4550_ += i_4551_;
		    }
		} else if (i_4537_ == 2) {
		    int i_4673_ = i_4538_ >>> 24;
		    int i_4674_ = 256 - i_4673_;
		    int i_4675_ = (i_4538_ & 0xff00ff) * i_4674_ & ~0xff00ff;
		    int i_4676_ = (i_4538_ & 0xff00) * i_4674_ & 0xff0000;
		    i_4538_ = (i_4675_ | i_4676_) >>> 8;
		    int i_4677_ = i_4542_;
		    for (int i_4678_ = -i_4536_; i_4678_ < 0; i_4678_++) {
			int i_4679_
			    = ((i_4543_ >> 16)
			       * ((Class168_Sub2_Sub3) this).anInt9920);
			for (int i_4680_ = -i_4535_; i_4680_ < 0; i_4680_++) {
			    if (!bool_4532_ || f < fs[i_4550_]) {
				int i_4681_ = (((Class168_Sub2_Sub3) this)
					       .aByteArray11205
					       [(i_4542_ >> 16) + i_4679_]);
				if (i_4681_ != 0) {
				    if (bool) {
					int i_4682_
					    = (((Class168_Sub2_Sub3) this)
					       .anIntArray11204
					       [i_4681_ & 0xff]);
					i_4675_
					    = ((i_4682_ & 0xff00ff) * i_4673_
					       & ~0xff00ff);
					i_4676_ = ((i_4682_ & 0xff00) * i_4673_
						   & 0xff0000);
					i_4682_ = (((i_4675_ | i_4676_) >>> 8)
						   + i_4538_);
					int i_4683_ = is[i_4550_];
					int i_4684_ = i_4682_ + i_4683_;
					int i_4685_ = ((i_4682_ & 0xff00ff)
						       + (i_4683_ & 0xff00ff));
					i_4683_ = ((i_4685_ & 0x1000100)
						   + (i_4684_ - i_4685_
						      & 0x10000));
					is[i_4550_]
					    = (i_4684_ - i_4683_
					       | i_4683_ - (i_4683_ >>> 8));
				    }
				    if (bool_4532_ && bool_4541_)
					fs[i_4550_] = f;
				}
			    }
			    i_4542_ += i_4546_;
			    i_4550_++;
			}
			i_4543_ += i_4547_;
			i_4542_ = i_4677_;
			i_4550_ += i_4551_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
}
