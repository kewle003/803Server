/* Class168_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class168_Sub2_Sub2 extends Class168_Sub2
{
    int[] anIntArray11124;
    
    void method16221(boolean bool, boolean bool_0_, boolean bool_1_, int i,
		     int i_2_, float f, int i_3_, int i_4_, int i_5_, int i_6_,
		     int i_7_, int i_8_, boolean bool_9_) {
	if (i_3_ > 0 && i_4_ > 0 && (bool || bool_0_)) {
	    int i_10_ = 0;
	    int i_11_ = 0;
	    int i_12_ = (((Class168_Sub2_Sub2) this).anInt9907
			 + ((Class168_Sub2_Sub2) this).anInt9920
			 + ((Class168_Sub2_Sub2) this).anInt9909);
	    int i_13_ = (((Class168_Sub2_Sub2) this).anInt9905
			 + ((Class168_Sub2_Sub2) this).anInt9916
			 + ((Class168_Sub2_Sub2) this).anInt9910);
	    int i_14_ = (i_12_ << 16) / i_3_;
	    int i_15_ = (i_13_ << 16) / i_4_;
	    if (((Class168_Sub2_Sub2) this).anInt9907 > 0) {
		int i_16_ = (((((Class168_Sub2_Sub2) this).anInt9907 << 16)
			      + i_14_ - 1)
			     / i_14_);
		i += i_16_;
		i_10_ += i_16_ * i_14_ - (((Class168_Sub2_Sub2) this).anInt9907
					  << 16);
	    }
	    if (((Class168_Sub2_Sub2) this).anInt9905 > 0) {
		int i_17_ = (((((Class168_Sub2_Sub2) this).anInt9905 << 16)
			      + i_15_ - 1)
			     / i_15_);
		i_2_ += i_17_;
		i_11_ += i_17_ * i_15_ - (((Class168_Sub2_Sub2) this).anInt9905
					  << 16);
	    }
	    if (((Class168_Sub2_Sub2) this).anInt9920 < i_12_)
		i_3_ = ((((Class168_Sub2_Sub2) this).anInt9920 << 16) - i_10_
			+ i_14_ - 1) / i_14_;
	    if (((Class168_Sub2_Sub2) this).anInt9916 < i_13_)
		i_4_ = ((((Class168_Sub2_Sub2) this).anInt9916 << 16) - i_11_
			+ i_15_ - 1) / i_15_;
	    int i_18_
		= (i
		   + i_2_ * (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					       .aClass103_Sub2_9904)).anInt9260
			     * -1826993761));
	    int i_19_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					    .aClass103_Sub2_9904)).anInt9260
			  * -1826993761)
			 - i_3_);
	    if (i_2_ + i_4_ > (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165)
		i_4_ -= (i_2_ + i_4_
			 - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					      .aClass103_Sub2_9904)).anInt9252
			    * 1546170165));
	    if (i_2_ < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					  .aClass103_Sub2_9904)).anInt9254
			* -788450385)) {
		int i_20_ = ((((Class103_Sub2)
			       ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			      .anInt9254) * -788450385
			     - i_2_);
		i_4_ -= i_20_;
		i_18_
		    += i_20_ * ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						   .aClass103_Sub2_9904))
				 .anInt9260)
				* -1826993761);
		i_11_ += i_15_ * i_20_;
	    }
	    if (i + i_3_ > (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					      .aClass103_Sub2_9904)).anInt9250
			    * 325436811)) {
		int i_21_
		    = i + i_3_ - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811;
		i_3_ -= i_21_;
		i_19_ += i_21_;
	    }
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_22_ = ((((Class103_Sub2)
			       ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			      .anInt9249) * 1298750001
			     - i);
		i_3_ -= i_22_;
		i_18_ += i_22_;
		i_10_ += i_14_ * i_22_;
		i_19_ += i_22_;
	    }
	    float[] fs = (((Class103_Sub2)
			   ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			  .aFloatArray9248);
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (i_7_ == 0) {
		if (i_5_ == 1) {
		    int i_23_ = i_10_;
		    for (int i_24_ = -i_4_; i_24_ < 0; i_24_++) {
			int i_25_ = ((i_11_ >> 16)
				     * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_26_ = -i_3_; i_26_ < 0; i_26_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				if (bool)
				    is[i_18_] = (((Class168_Sub2_Sub2) this)
						 .anIntArray11124
						 [(i_10_ >> 16) + i_25_]);
				if (bool_0_ && bool_9_)
				    fs[i_18_] = f;
			    }
			    i_10_ += i_14_;
			    i_18_++;
			}
			i_11_ += i_15_;
			i_10_ = i_23_;
			i_18_ += i_19_;
		    }
		} else if (i_5_ == 0) {
		    int i_27_ = (i_6_ & 0xff0000) >> 16;
		    int i_28_ = (i_6_ & 0xff00) >> 8;
		    int i_29_ = i_6_ & 0xff;
		    int i_30_ = i_10_;
		    for (int i_31_ = -i_4_; i_31_ < 0; i_31_++) {
			int i_32_ = ((i_11_ >> 16)
				     * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_33_ = -i_3_; i_33_ < 0; i_33_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				if (bool) {
				    int i_34_ = (((Class168_Sub2_Sub2) this)
						 .anIntArray11124
						 [(i_10_ >> 16) + i_32_]);
				    int i_35_ = ((i_34_ & 0xff0000) * i_27_
						 & ~0xffffff);
				    int i_36_
					= (i_34_ & 0xff00) * i_28_ & 0xff0000;
				    int i_37_
					= (i_34_ & 0xff) * i_29_ & 0xff00;
				    is[i_18_] = (i_35_ | i_36_ | i_37_) >>> 8;
				}
				if (bool_0_ && bool_9_)
				    fs[i_18_] = f;
			    }
			    i_10_ += i_14_;
			    i_18_++;
			}
			i_11_ += i_15_;
			i_10_ = i_30_;
			i_18_ += i_19_;
		    }
		} else if (i_5_ == 3) {
		    int i_38_ = i_10_;
		    for (int i_39_ = -i_4_; i_39_ < 0; i_39_++) {
			int i_40_ = ((i_11_ >> 16)
				     * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_41_ = -i_3_; i_41_ < 0; i_41_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				if (bool) {
				    int i_42_ = (((Class168_Sub2_Sub2) this)
						 .anIntArray11124
						 [(i_10_ >> 16) + i_40_]);
				    int i_43_ = i_42_ + i_6_;
				    int i_44_ = ((i_42_ & 0xff00ff)
						 + (i_6_ & 0xff00ff));
				    int i_45_ = ((i_44_ & 0x1000100)
						 + (i_43_ - i_44_ & 0x10000));
				    is[i_18_]
					= i_43_ - i_45_ | i_45_ - (i_45_
								   >>> 8);
				}
				if (bool_0_ && bool_9_)
				    fs[i_18_] = f;
			    }
			    i_10_ += i_14_;
			    i_18_++;
			}
			i_11_ += i_15_;
			i_10_ = i_38_;
			i_18_ += i_19_;
		    }
		} else if (i_5_ == 2) {
		    int i_46_ = i_6_ >>> 24;
		    int i_47_ = 256 - i_46_;
		    int i_48_ = (i_6_ & 0xff00ff) * i_47_ & ~0xff00ff;
		    int i_49_ = (i_6_ & 0xff00) * i_47_ & 0xff0000;
		    i_6_ = (i_48_ | i_49_) >>> 8;
		    int i_50_ = i_10_;
		    for (int i_51_ = -i_4_; i_51_ < 0; i_51_++) {
			int i_52_ = ((i_11_ >> 16)
				     * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_53_ = -i_3_; i_53_ < 0; i_53_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				if (bool) {
				    int i_54_ = (((Class168_Sub2_Sub2) this)
						 .anIntArray11124
						 [(i_10_ >> 16) + i_52_]);
				    i_48_ = ((i_54_ & 0xff00ff) * i_46_
					     & ~0xff00ff);
				    i_49_
					= (i_54_ & 0xff00) * i_46_ & 0xff0000;
				    is[i_18_] = ((i_48_ | i_49_) >>> 8) + i_6_;
				}
				if (bool_0_ && bool_9_)
				    fs[i_18_] = f;
			    }
			    i_10_ += i_14_;
			    i_18_++;
			}
			i_11_ += i_15_;
			i_10_ = i_50_;
			i_18_ += i_19_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_7_ == 1) {
		if (i_5_ == 1) {
		    int i_55_ = i_10_;
		    for (int i_56_ = -i_4_; i_56_ < 0; i_56_++) {
			int i_57_ = ((i_11_ >> 16)
				     * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_58_ = -i_3_; i_58_ < 0; i_58_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				if (bool) {
				    int i_59_ = (((Class168_Sub2_Sub2) this)
						 .anIntArray11124
						 [(i_10_ >> 16) + i_57_]);
				    int i_60_ = i_59_ >>> 24;
				    int i_61_ = 256 - i_60_;
				    int i_62_ = is[i_18_];
				    is[i_18_]
					= (((((i_59_ & 0xff00ff) * i_60_
					      + (i_62_ & 0xff00ff) * i_61_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_59_ & ~0xff00ff) >>> 8)
						* i_60_)
					       + (((i_62_ & ~0xff00ff) >>> 8)
						  * i_61_))
					      & ~0xff00ff));
				}
				if (bool_0_ && bool_9_)
				    fs[i_18_] = f;
			    }
			    i_10_ += i_14_;
			    i_18_++;
			}
			i_11_ += i_15_;
			i_10_ = i_55_;
			i_18_ += i_19_;
		    }
		} else if (i_5_ == 0) {
		    int i_63_ = i_10_;
		    if ((i_6_ & 0xffffff) == 16777215) {
			for (int i_64_ = -i_4_; i_64_ < 0; i_64_++) {
			    int i_65_
				= ((i_11_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_66_ = -i_3_; i_66_ < 0; i_66_++) {
				if (!bool_0_ || f < fs[i_18_]) {
				    if (bool) {
					int i_67_
					    = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_10_ >> 16) + i_65_]);
					int i_68_
					    = ((i_67_ >>> 24) * (i_6_ >>> 24)
					       >> 8);
					int i_69_ = 256 - i_68_;
					int i_70_ = is[i_18_];
					is[i_18_]
					    = ((((i_67_ & 0xff00ff) * i_68_
						 + (i_70_ & 0xff00ff) * i_69_)
						& ~0xff00ff)
					       + (((i_67_ & 0xff00) * i_68_
						   + (i_70_ & 0xff00) * i_69_)
						  & 0xff0000)) >> 8;
				    }
				    if (bool_0_ && bool_9_)
					fs[i_18_] = f;
				}
				i_10_ += i_14_;
				i_18_++;
			    }
			    i_11_ += i_15_;
			    i_10_ = i_63_;
			    i_18_ += i_19_;
			}
		    } else {
			int i_71_ = (i_6_ & 0xff0000) >> 16;
			int i_72_ = (i_6_ & 0xff00) >> 8;
			int i_73_ = i_6_ & 0xff;
			for (int i_74_ = -i_4_; i_74_ < 0; i_74_++) {
			    int i_75_
				= ((i_11_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_76_ = -i_3_; i_76_ < 0; i_76_++) {
				if (!bool_0_ || f < fs[i_18_]) {
				    int i_77_ = (((Class168_Sub2_Sub2) this)
						 .anIntArray11124
						 [(i_10_ >> 16) + i_75_]);
				    int i_78_
					= (i_77_ >>> 24) * (i_6_ >>> 24) >> 8;
				    int i_79_ = 256 - i_78_;
				    if (i_78_ != 255) {
					if (bool) {
					    int i_80_
						= ((i_77_ & 0xff0000) * i_71_
						   & ~0xffffff);
					    int i_81_
						= ((i_77_ & 0xff00) * i_72_
						   & 0xff0000);
					    int i_82_ = ((i_77_ & 0xff) * i_73_
							 & 0xff00);
					    i_77_ = ((i_80_ | i_81_ | i_82_)
						     >>> 8);
					    int i_83_ = is[i_18_];
					    is[i_18_]
						= ((((i_77_ & 0xff00ff) * i_78_
						     + ((i_83_ & 0xff00ff)
							* i_79_))
						    & ~0xff00ff)
						   + (((i_77_ & 0xff00) * i_78_
						       + ((i_83_ & 0xff00)
							  * i_79_))
						      & 0xff0000)) >> 8;
					    if (bool_1_) {
						int i_84_
						    = (i_83_ >>> 24) + i_78_;
						if (i_84_ > 255)
						    i_84_ = 255;
						is[i_18_] |= i_84_ << 24;
					    }
					}
					if (bool_0_ && bool_9_)
					    fs[i_18_] = f;
				    } else {
					if (bool) {
					    int i_85_
						= ((i_77_ & 0xff0000) * i_71_
						   & ~0xffffff);
					    int i_86_
						= ((i_77_ & 0xff00) * i_72_
						   & 0xff0000);
					    int i_87_ = ((i_77_ & 0xff) * i_73_
							 & 0xff00);
					    is[i_18_] = (i_85_ | i_86_
							 | i_87_) >>> 8;
					}
					if (bool_0_ && bool_9_)
					    fs[i_18_] = f;
				    }
				}
				i_10_ += i_14_;
				i_18_++;
			    }
			    i_11_ += i_15_;
			    i_10_ = i_63_;
			    i_18_ += i_19_;
			}
		    }
		} else if (i_5_ == 3) {
		    int i_88_ = i_10_;
		    for (int i_89_ = -i_4_; i_89_ < 0; i_89_++) {
			int i_90_ = ((i_11_ >> 16)
				     * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_91_ = -i_3_; i_91_ < 0; i_91_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				if (bool) {
				    int i_92_ = (((Class168_Sub2_Sub2) this)
						 .anIntArray11124
						 [(i_10_ >> 16) + i_90_]);
				    int i_93_ = i_92_ + i_6_;
				    int i_94_ = ((i_92_ & 0xff00ff)
						 + (i_6_ & 0xff00ff));
				    int i_95_ = ((i_94_ & 0x1000100)
						 + (i_93_ - i_94_ & 0x10000));
				    i_95_ = i_93_ - i_95_ | i_95_ - (i_95_
								     >>> 8);
				    int i_96_
					= (i_95_ >>> 24) * (i_6_ >>> 24) >> 8;
				    int i_97_ = 256 - i_96_;
				    if (i_96_ != 255) {
					i_92_ = i_95_;
					i_95_ = is[i_18_];
					i_95_
					    = ((((i_92_ & 0xff00ff) * i_96_
						 + (i_95_ & 0xff00ff) * i_97_)
						& ~0xff00ff)
					       + (((i_92_ & 0xff00) * i_96_
						   + (i_95_ & 0xff00) * i_97_)
						  & 0xff0000)) >> 8;
				    }
				    is[i_18_] = i_95_;
				}
				if (bool_0_ && bool_9_)
				    fs[i_18_] = f;
			    }
			    i_10_ += i_14_;
			    i_18_++;
			}
			i_11_ += i_15_;
			i_10_ = i_88_;
			i_18_ += i_19_;
		    }
		} else if (i_5_ == 2) {
		    int i_98_ = i_6_ >>> 24;
		    int i_99_ = 256 - i_98_;
		    int i_100_ = (i_6_ & 0xff00ff) * i_99_ & ~0xff00ff;
		    int i_101_ = (i_6_ & 0xff00) * i_99_ & 0xff0000;
		    i_6_ = (i_100_ | i_101_) >>> 8;
		    int i_102_ = i_10_;
		    for (int i_103_ = -i_4_; i_103_ < 0; i_103_++) {
			int i_104_ = ((i_11_ >> 16)
				      * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_105_ = -i_3_; i_105_ < 0; i_105_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				if (bool) {
				    int i_106_ = (((Class168_Sub2_Sub2) this)
						  .anIntArray11124
						  [(i_10_ >> 16) + i_104_]);
				    int i_107_ = i_106_ >>> 24;
				    int i_108_ = 256 - i_107_;
				    i_100_ = ((i_106_ & 0xff00ff) * i_98_
					      & ~0xff00ff);
				    i_101_
					= (i_106_ & 0xff00) * i_98_ & 0xff0000;
				    i_106_ = ((i_100_ | i_101_) >>> 8) + i_6_;
				    int i_109_ = is[i_18_];
				    is[i_18_]
					= ((((i_106_ & 0xff00ff) * i_107_
					     + (i_109_ & 0xff00ff) * i_108_)
					    & ~0xff00ff)
					   + (((i_106_ & 0xff00) * i_107_
					       + (i_109_ & 0xff00) * i_108_)
					      & 0xff0000)) >> 8;
				}
				if (bool_0_ && bool_9_)
				    fs[i_18_] = f;
			    }
			    i_10_ += i_14_;
			    i_18_++;
			}
			i_11_ += i_15_;
			i_10_ = i_102_;
			i_18_ += i_19_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_7_ == 2) {
		if (i_5_ == 1) {
		    int i_110_ = i_10_;
		    for (int i_111_ = -i_4_; i_111_ < 0; i_111_++) {
			int i_112_ = ((i_11_ >> 16)
				      * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_113_ = -i_3_; i_113_ < 0; i_113_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				int i_114_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124
					      [(i_10_ >> 16) + i_112_]);
				if (i_114_ != 0) {
				    if (bool) {
					int i_115_ = is[i_18_];
					int i_116_ = i_114_ + i_115_;
					int i_117_ = ((i_114_ & 0xff00ff)
						      + (i_115_ & 0xff00ff));
					i_115_
					    = ((i_117_ & 0x1000100)
					       + (i_116_ - i_117_ & 0x10000));
					is[i_18_]
					    = (i_116_ - i_115_
					       | i_115_ - (i_115_ >>> 8));
				    }
				    if (bool_0_ && bool_9_)
					fs[i_18_] = f;
				}
			    }
			    i_10_ += i_14_;
			    i_18_++;
			}
			i_11_ += i_15_;
			i_10_ = i_110_;
			i_18_ += i_19_;
		    }
		} else if (i_5_ == 0) {
		    int i_118_ = i_10_;
		    int i_119_ = (i_6_ & 0xff0000) >> 16;
		    int i_120_ = (i_6_ & 0xff00) >> 8;
		    int i_121_ = i_6_ & 0xff;
		    for (int i_122_ = -i_4_; i_122_ < 0; i_122_++) {
			int i_123_ = ((i_11_ >> 16)
				      * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_124_ = -i_3_; i_124_ < 0; i_124_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				int i_125_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124
					      [(i_10_ >> 16) + i_123_]);
				if (i_125_ != 0) {
				    if (bool) {
					int i_126_
					    = ((i_125_ & 0xff0000) * i_119_
					       & ~0xffffff);
					int i_127_
					    = ((i_125_ & 0xff00) * i_120_
					       & 0xff0000);
					int i_128_ = ((i_125_ & 0xff) * i_121_
						      & 0xff00);
					i_125_
					    = (i_126_ | i_127_ | i_128_) >>> 8;
					int i_129_ = is[i_18_];
					int i_130_ = i_125_ + i_129_;
					int i_131_ = ((i_125_ & 0xff00ff)
						      + (i_129_ & 0xff00ff));
					i_129_
					    = ((i_131_ & 0x1000100)
					       + (i_130_ - i_131_ & 0x10000));
					is[i_18_]
					    = (i_130_ - i_129_
					       | i_129_ - (i_129_ >>> 8));
				    }
				    if (bool_0_ && bool_9_)
					fs[i_18_] = f;
				}
			    }
			    i_10_ += i_14_;
			    i_18_++;
			}
			i_11_ += i_15_;
			i_10_ = i_118_;
			i_18_ += i_19_;
		    }
		} else if (i_5_ == 3) {
		    int i_132_ = i_10_;
		    for (int i_133_ = -i_4_; i_133_ < 0; i_133_++) {
			int i_134_ = ((i_11_ >> 16)
				      * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_135_ = -i_3_; i_135_ < 0; i_135_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				if (bool) {
				    int i_136_ = (((Class168_Sub2_Sub2) this)
						  .anIntArray11124
						  [(i_10_ >> 16) + i_134_]);
				    int i_137_ = i_136_ + i_6_;
				    int i_138_ = ((i_136_ & 0xff00ff)
						  + (i_6_ & 0xff00ff));
				    int i_139_
					= ((i_138_ & 0x1000100)
					   + (i_137_ - i_138_ & 0x10000));
				    i_136_
					= i_137_ - i_139_ | i_139_ - (i_139_
								      >>> 8);
				    i_139_ = is[i_18_];
				    i_137_ = i_136_ + i_139_;
				    i_138_
					= (i_136_ & 0xff00ff) + (i_139_
								 & 0xff00ff);
				    i_139_ = ((i_138_ & 0x1000100)
					      + (i_137_ - i_138_ & 0x10000));
				    is[i_18_]
					= i_137_ - i_139_ | i_139_ - (i_139_
								      >>> 8);
				}
				if (bool_0_ && bool_9_)
				    fs[i_18_] = f;
			    }
			    i_10_ += i_14_;
			    i_18_++;
			}
			i_11_ += i_15_;
			i_10_ = i_132_;
			i_18_ += i_19_;
		    }
		} else if (i_5_ == 2) {
		    int i_140_ = i_6_ >>> 24;
		    int i_141_ = 256 - i_140_;
		    int i_142_ = (i_6_ & 0xff00ff) * i_141_ & ~0xff00ff;
		    int i_143_ = (i_6_ & 0xff00) * i_141_ & 0xff0000;
		    i_6_ = (i_142_ | i_143_) >>> 8;
		    int i_144_ = i_10_;
		    for (int i_145_ = -i_4_; i_145_ < 0; i_145_++) {
			int i_146_ = ((i_11_ >> 16)
				      * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_147_ = -i_3_; i_147_ < 0; i_147_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				int i_148_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124
					      [(i_10_ >> 16) + i_146_]);
				if (i_148_ != 0) {
				    if (bool) {
					i_142_ = ((i_148_ & 0xff00ff) * i_140_
						  & ~0xff00ff);
					i_143_ = ((i_148_ & 0xff00) * i_140_
						  & 0xff0000);
					i_148_
					    = ((i_142_ | i_143_) >>> 8) + i_6_;
					int i_149_ = is[i_18_];
					int i_150_ = i_148_ + i_149_;
					int i_151_ = ((i_148_ & 0xff00ff)
						      + (i_149_ & 0xff00ff));
					i_149_
					    = ((i_151_ & 0x1000100)
					       + (i_150_ - i_151_ & 0x10000));
					is[i_18_]
					    = (i_150_ - i_149_
					       | i_149_ - (i_149_ >>> 8));
				    }
				    if (bool_0_ && bool_9_)
					fs[i_18_] = f;
				}
			    }
			    i_10_ += i_14_;
			    i_18_++;
			}
			i_11_ += i_15_;
			i_10_ = i_144_;
			i_18_ += i_19_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    Class168_Sub2_Sub2(Class103_Sub2 class103_sub2, int[] is, int i,
		       int i_152_, int i_153_, int i_154_, boolean bool) {
	super(class103_sub2, i_153_, i_154_);
	if (bool)
	    ((Class168_Sub2_Sub2) this).anIntArray11124
		= new int[i_153_ * i_154_];
	else
	    ((Class168_Sub2_Sub2) this).anIntArray11124 = is;
	i_152_ -= ((Class168_Sub2_Sub2) this).anInt9920;
	int i_155_ = 0;
	for (int i_156_ = 0; i_156_ < i_154_; i_156_++) {
	    for (int i_157_ = 0; i_157_ < i_153_; i_157_++)
		((Class168_Sub2_Sub2) this).anIntArray11124[i_155_++]
		    = is[i++];
	    i += i_152_;
	}
    }
    
    void method16216(int i, int i_158_) {
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_159_ = anInt9919;
		    while (i_159_ < 0) {
			int i_160_ = anInt9925;
			int i_161_ = anInt9927;
			int i_162_ = anInt9928;
			int i_163_ = anInt9906;
			if (i_161_ >= 0 && i_162_ >= 0
			    && i_161_ - (((Class168_Sub2_Sub2) this).anInt9920
					 << 12) < 0
			    && i_162_ - (((Class168_Sub2_Sub2) this).anInt9916
					 << 12) < 0) {
			    for (/**/; i_163_ < 0; i_163_++)
				method17538(((i_162_ >> 12)
					     * (((Class168_Sub2_Sub2) this)
						.anInt9920)) + (i_161_ >> 12),
					    i_160_++, is, i, i_158_);
			}
			i_159_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_164_ = anInt9919;
		    while (i_164_ < 0) {
			int i_165_ = anInt9925;
			int i_166_ = anInt9927;
			int i_167_ = anInt9928 + anInt9930;
			int i_168_ = anInt9906;
			if (i_166_ >= 0
			    && i_166_ - (((Class168_Sub2_Sub2) this).anInt9920
					 << 12) < 0) {
			    int i_169_;
			    if ((i_169_
				 = (i_167_
				    - (((Class168_Sub2_Sub2) this).anInt9916
				       << 12)))
				>= 0) {
				i_169_ = (anInt9922 - i_169_) / anInt9922;
				i_168_ += i_169_;
				i_167_ += anInt9922 * i_169_;
				i_165_ += i_169_;
			    }
			    if ((i_169_ = (i_167_ - anInt9922) / anInt9922)
				> i_168_)
				i_168_ = i_169_;
			    for (/**/; i_168_ < 0; i_168_++) {
				method17538(((i_167_ >> 12)
					     * (((Class168_Sub2_Sub2) this)
						.anInt9920)) + (i_166_ >> 12),
					    i_165_++, is, i, i_158_);
				i_167_ += anInt9922;
			    }
			}
			i_164_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_170_ = anInt9919;
		    while (i_170_ < 0) {
			int i_171_ = anInt9925;
			int i_172_ = anInt9927;
			int i_173_ = anInt9928 + anInt9930;
			int i_174_ = anInt9906;
			if (i_172_ >= 0
			    && i_172_ - (((Class168_Sub2_Sub2) this).anInt9920
					 << 12) < 0) {
			    if (i_173_ < 0) {
				int i_175_
				    = (anInt9922 - 1 - i_173_) / anInt9922;
				i_174_ += i_175_;
				i_173_ += anInt9922 * i_175_;
				i_171_ += i_175_;
			    }
			    int i_176_;
			    if ((i_176_
				 = (1 + i_173_
				    - (((Class168_Sub2_Sub2) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_174_)
				i_174_ = i_176_;
			    for (/**/; i_174_ < 0; i_174_++) {
				method17538(((i_173_ >> 12)
					     * (((Class168_Sub2_Sub2) this)
						.anInt9920)) + (i_172_ >> 12),
					    i_171_++, is, i, i_158_);
				i_173_ += anInt9922;
			    }
			}
			i_170_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_177_ = anInt9919;
		    while (i_177_ < 0) {
			int i_178_ = anInt9925;
			int i_179_ = anInt9927 + anInt9929;
			int i_180_ = anInt9928;
			int i_181_ = anInt9906;
			if (i_180_ >= 0
			    && i_180_ - (((Class168_Sub2_Sub2) this).anInt9916
					 << 12) < 0) {
			    int i_182_;
			    if ((i_182_
				 = (i_179_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)))
				>= 0) {
				i_182_ = (anInt9921 - i_182_) / anInt9921;
				i_181_ += i_182_;
				i_179_ += anInt9921 * i_182_;
				i_178_ += i_182_;
			    }
			    if ((i_182_ = (i_179_ - anInt9921) / anInt9921)
				> i_181_)
				i_181_ = i_182_;
			    for (/**/; i_181_ < 0; i_181_++) {
				method17538(((i_180_ >> 12)
					     * (((Class168_Sub2_Sub2) this)
						.anInt9920)) + (i_179_ >> 12),
					    i_178_++, is, i, i_158_);
				i_179_ += anInt9921;
			    }
			}
			i_177_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_183_ = anInt9919;
		    while (i_183_ < 0) {
			int i_184_ = anInt9925;
			int i_185_ = anInt9927 + anInt9929;
			int i_186_ = anInt9928 + anInt9930;
			int i_187_ = anInt9906;
			int i_188_;
			if ((i_188_
			     = i_185_ - (((Class168_Sub2_Sub2) this).anInt9920
					 << 12))
			    >= 0) {
			    i_188_ = (anInt9921 - i_188_) / anInt9921;
			    i_187_ += i_188_;
			    i_185_ += anInt9921 * i_188_;
			    i_186_ += anInt9922 * i_188_;
			    i_184_ += i_188_;
			}
			if ((i_188_ = (i_185_ - anInt9921) / anInt9921)
			    > i_187_)
			    i_187_ = i_188_;
			if ((i_188_
			     = i_186_ - (((Class168_Sub2_Sub2) this).anInt9916
					 << 12))
			    >= 0) {
			    i_188_ = (anInt9922 - i_188_) / anInt9922;
			    i_187_ += i_188_;
			    i_185_ += anInt9921 * i_188_;
			    i_186_ += anInt9922 * i_188_;
			    i_184_ += i_188_;
			}
			if ((i_188_ = (i_186_ - anInt9922) / anInt9922)
			    > i_187_)
			    i_187_ = i_188_;
			for (/**/; i_187_ < 0; i_187_++) {
			    method17538(((i_186_ >> 12) * ((Class168_Sub2_Sub2)
							   this).anInt9920
					 + (i_185_ >> 12)),
					i_184_++, is, i, i_158_);
			    i_185_ += anInt9921;
			    i_186_ += anInt9922;
			}
			i_183_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_189_ = anInt9919;
		    while (i_189_ < 0) {
			int i_190_ = anInt9925;
			int i_191_ = anInt9927 + anInt9929;
			int i_192_ = anInt9928 + anInt9930;
			int i_193_ = anInt9906;
			int i_194_;
			if ((i_194_
			     = i_191_ - (((Class168_Sub2_Sub2) this).anInt9920
					 << 12))
			    >= 0) {
			    i_194_ = (anInt9921 - i_194_) / anInt9921;
			    i_193_ += i_194_;
			    i_191_ += anInt9921 * i_194_;
			    i_192_ += anInt9922 * i_194_;
			    i_190_ += i_194_;
			}
			if ((i_194_ = (i_191_ - anInt9921) / anInt9921)
			    > i_193_)
			    i_193_ = i_194_;
			if (i_192_ < 0) {
			    i_194_ = (anInt9922 - 1 - i_192_) / anInt9922;
			    i_193_ += i_194_;
			    i_191_ += anInt9921 * i_194_;
			    i_192_ += anInt9922 * i_194_;
			    i_190_ += i_194_;
			}
			if ((i_194_
			     = (1 + i_192_
				- (((Class168_Sub2_Sub2) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_193_)
			    i_193_ = i_194_;
			for (/**/; i_193_ < 0; i_193_++) {
			    method17538(((i_192_ >> 12) * ((Class168_Sub2_Sub2)
							   this).anInt9920
					 + (i_191_ >> 12)),
					i_190_++, is, i, i_158_);
			    i_191_ += anInt9921;
			    i_192_ += anInt9922;
			}
			i_189_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_195_ = anInt9919;
		while (i_195_ < 0) {
		    int i_196_ = anInt9925;
		    int i_197_ = anInt9927 + anInt9929;
		    int i_198_ = anInt9928;
		    int i_199_ = anInt9906;
		    if (i_198_ >= 0
			&& i_198_ - (((Class168_Sub2_Sub2) this).anInt9916
				     << 12) < 0) {
			if (i_197_ < 0) {
			    int i_200_ = (anInt9921 - 1 - i_197_) / anInt9921;
			    i_199_ += i_200_;
			    i_197_ += anInt9921 * i_200_;
			    i_196_ += i_200_;
			}
			int i_201_;
			if ((i_201_
			     = (1 + i_197_
				- (((Class168_Sub2_Sub2) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_199_)
			    i_199_ = i_201_;
			for (/**/; i_199_ < 0; i_199_++) {
			    method17538(((i_198_ >> 12) * ((Class168_Sub2_Sub2)
							   this).anInt9920
					 + (i_197_ >> 12)),
					i_196_++, is, i, i_158_);
			    i_197_ += anInt9921;
			}
		    }
		    i_195_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		for (int i_202_ = anInt9919; i_202_ < 0; i_202_++) {
		    int i_203_ = anInt9925;
		    int i_204_ = anInt9927 + anInt9929;
		    int i_205_ = anInt9928 + anInt9930;
		    int i_206_ = anInt9906;
		    if (i_204_ < 0) {
			int i_207_ = (anInt9921 - 1 - i_204_) / anInt9921;
			i_206_ += i_207_;
			i_204_ += anInt9921 * i_207_;
			i_205_ += anInt9922 * i_207_;
			i_203_ += i_207_;
		    }
		    int i_208_;
		    if ((i_208_
			 = (1 + i_204_
			    - (((Class168_Sub2_Sub2) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_206_)
			i_206_ = i_208_;
		    if ((i_208_
			 = i_205_ - (((Class168_Sub2_Sub2) this).anInt9916
				     << 12))
			>= 0) {
			i_208_ = (anInt9922 - i_208_) / anInt9922;
			i_206_ += i_208_;
			i_204_ += anInt9921 * i_208_;
			i_205_ += anInt9922 * i_208_;
			i_203_ += i_208_;
		    }
		    if ((i_208_ = (i_205_ - anInt9922) / anInt9922) > i_206_)
			i_206_ = i_208_;
		    for (/**/; i_206_ < 0; i_206_++) {
			method17538((((i_205_ >> 12)
				      * ((Class168_Sub2_Sub2) this).anInt9920)
				     + (i_204_ >> 12)),
				    i_203_++, is, i, i_158_);
			i_204_ += anInt9921;
			i_205_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		for (int i_209_ = anInt9919; i_209_ < 0; i_209_++) {
		    int i_210_ = anInt9925;
		    int i_211_ = anInt9927 + anInt9929;
		    int i_212_ = anInt9928 + anInt9930;
		    int i_213_ = anInt9906;
		    if (i_211_ < 0) {
			int i_214_ = (anInt9921 - 1 - i_211_) / anInt9921;
			i_213_ += i_214_;
			i_211_ += anInt9921 * i_214_;
			i_212_ += anInt9922 * i_214_;
			i_210_ += i_214_;
		    }
		    int i_215_;
		    if ((i_215_
			 = (1 + i_211_
			    - (((Class168_Sub2_Sub2) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_213_)
			i_213_ = i_215_;
		    if (i_212_ < 0) {
			i_215_ = (anInt9922 - 1 - i_212_) / anInt9922;
			i_213_ += i_215_;
			i_211_ += anInt9921 * i_215_;
			i_212_ += anInt9922 * i_215_;
			i_210_ += i_215_;
		    }
		    if ((i_215_
			 = (1 + i_212_
			    - (((Class168_Sub2_Sub2) this).anInt9916 << 12)
			    - anInt9922) / anInt9922)
			> i_213_)
			i_213_ = i_215_;
		    for (/**/; i_213_ < 0; i_213_++) {
			method17538((((i_212_ >> 12)
				      * ((Class168_Sub2_Sub2) this).anInt9920)
				     + (i_211_ >> 12)),
				    i_210_++, is, i, i_158_);
			i_211_ += anInt9921;
			i_212_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    public void method3675(int i, int i_216_, int i_217_, int i_218_,
			   int i_219_, int i_220_) {
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_221_ = 0; i_221_ < i_218_; i_221_++) {
	    int i_222_ = (i_216_ + i_221_) * i_217_ + i;
	    int i_223_ = (i_220_ + i_221_) * i_217_ + i_219_;
	    for (int i_224_ = 0; i_224_ < i_217_; i_224_++)
		((Class168_Sub2_Sub2) this).anIntArray11124[i_222_ + i_224_]
		    = is[i_223_ + i_224_] & 0xffffff;
	}
    }
    
    public void method3610(int i, int i_225_, int i_226_) {
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is == null)
	    throw new IllegalStateException("");
	if (i_226_ == 0) {
	    for (int i_227_ = 0;
		 i_227_ < ((Class168_Sub2_Sub2) this).anInt9916; i_227_++) {
		int i_228_ = i_227_ * ((Class168_Sub2_Sub2) this).anInt9920;
		int i_229_
		    = (((i_225_ + i_227_)
			* (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761))
		       + i);
		for (int i_230_ = 0;
		     i_230_ < ((Class168_Sub2_Sub2) this).anInt9920; i_230_++)
		    ((Class168_Sub2_Sub2) this).anIntArray11124[(i_228_
								 + i_230_)]
			= ((((Class168_Sub2_Sub2) this).anIntArray11124
			    [i_228_ + i_230_]) & 0xffffff
			   | is[i_229_ + i_230_] << 8 & ~0xffffff);
	    }
	} else if (i_226_ == 1) {
	    for (int i_231_ = 0;
		 i_231_ < ((Class168_Sub2_Sub2) this).anInt9916; i_231_++) {
		int i_232_ = i_231_ * ((Class168_Sub2_Sub2) this).anInt9920;
		int i_233_
		    = (((i_225_ + i_231_)
			* (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761))
		       + i);
		for (int i_234_ = 0;
		     i_234_ < ((Class168_Sub2_Sub2) this).anInt9920; i_234_++)
		    ((Class168_Sub2_Sub2) this).anIntArray11124[(i_232_
								 + i_234_)]
			= ((((Class168_Sub2_Sub2) this).anIntArray11124
			    [i_232_ + i_234_]) & 0xffffff
			   | is[i_233_ + i_234_] << 16 & ~0xffffff);
	    }
	} else if (i_226_ == 2) {
	    for (int i_235_ = 0;
		 i_235_ < ((Class168_Sub2_Sub2) this).anInt9916; i_235_++) {
		int i_236_ = i_235_ * ((Class168_Sub2_Sub2) this).anInt9920;
		int i_237_
		    = (((i_225_ + i_235_)
			* (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761))
		       + i);
		for (int i_238_ = 0;
		     i_238_ < ((Class168_Sub2_Sub2) this).anInt9920; i_238_++)
		    ((Class168_Sub2_Sub2) this).anIntArray11124[(i_236_
								 + i_238_)]
			= ((((Class168_Sub2_Sub2) this).anIntArray11124
			    [i_236_ + i_238_]) & 0xffffff
			   | is[i_237_ + i_238_] << 24 & ~0xffffff);
	    }
	} else if (i_226_ == 3) {
	    for (int i_239_ = 0;
		 i_239_ < ((Class168_Sub2_Sub2) this).anInt9916; i_239_++) {
		int i_240_ = i_239_ * ((Class168_Sub2_Sub2) this).anInt9920;
		int i_241_
		    = (((i_225_ + i_239_)
			* (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761))
		       + i);
		for (int i_242_ = 0;
		     i_242_ < ((Class168_Sub2_Sub2) this).anInt9920; i_242_++)
		    ((Class168_Sub2_Sub2) this).anIntArray11124[(i_240_
								 + i_242_)]
			= ((((Class168_Sub2_Sub2) this).anIntArray11124
			    [i_240_ + i_242_]) & 0xffffff
			   | (is[i_241_ + i_242_] != 0 ? -16777216 : 0));
	    }
	}
    }
    
    public Interface4 method3608() {
	return new Class186(((Class168_Sub2_Sub2) this).anInt9920,
			    ((Class168_Sub2_Sub2) this).anInt9916,
			    ((Class168_Sub2_Sub2) this).anIntArray11124);
    }
    
    public void method3658(int i, int i_243_, int i_244_, int i_245_,
			   int i_246_) {
	if (((Class168_Sub2_Sub2) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    int i_247_ = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					    .aClass103_Sub2_9904)).anInt9260
			  * -1826993761);
	    i += ((Class168_Sub2_Sub2) this).anInt9907;
	    i_243_ += ((Class168_Sub2_Sub2) this).anInt9905;
	    int i_248_ = i_243_ * i_247_ + i;
	    int i_249_ = 0;
	    int i_250_ = ((Class168_Sub2_Sub2) this).anInt9916;
	    int i_251_ = ((Class168_Sub2_Sub2) this).anInt9920;
	    int i_252_ = i_247_ - i_251_;
	    int i_253_ = 0;
	    if (i_243_ < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					    .aClass103_Sub2_9904)).anInt9254
			  * -788450385)) {
		int i_254_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9254) * -788450385
			      - i_243_);
		i_250_ -= i_254_;
		i_243_ = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					    .aClass103_Sub2_9904)).anInt9254
			  * -788450385);
		i_249_ += i_254_ * i_251_;
		i_248_ += i_254_ * i_247_;
	    }
	    if (i_243_ + i_250_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_250_ -= (i_243_ + i_250_
			   - (((Class103_Sub2)
			       ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			      .anInt9252) * 1546170165);
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_255_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9249) * 1298750001
			      - i);
		i_251_ -= i_255_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_249_ += i_255_;
		i_248_ += i_255_;
		i_253_ += i_255_;
		i_252_ += i_255_;
	    }
	    if (i + i_251_ > (((Class103_Sub2)
			       ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			      .anInt9250) * 325436811) {
		int i_256_ = (i + i_251_
			      - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						   .aClass103_Sub2_9904))
				 .anInt9250) * 325436811);
		i_251_ -= i_256_;
		i_253_ += i_256_;
		i_252_ += i_256_;
	    }
	    if (i_251_ > 0 && i_250_ > 0) {
		if (i_246_ == 0) {
		    if (i_244_ == 1) {
			for (int i_257_ = -i_250_; i_257_ < 0; i_257_++) {
			    int i_258_ = i_248_ + i_251_ - 3;
			    while (i_248_ < i_258_) {
				is[i_248_++] = (((Class168_Sub2_Sub2) this)
						.anIntArray11124[i_249_++]);
				is[i_248_++] = (((Class168_Sub2_Sub2) this)
						.anIntArray11124[i_249_++]);
				is[i_248_++] = (((Class168_Sub2_Sub2) this)
						.anIntArray11124[i_249_++]);
				is[i_248_++] = (((Class168_Sub2_Sub2) this)
						.anIntArray11124[i_249_++]);
			    }
			    i_258_ += 3;
			    while (i_248_ < i_258_)
				is[i_248_++] = (((Class168_Sub2_Sub2) this)
						.anIntArray11124[i_249_++]);
			    i_248_ += i_252_;
			    i_249_ += i_253_;
			}
		    } else if (i_244_ == 0) {
			int i_259_ = (i_245_ & 0xff0000) >> 16;
			int i_260_ = (i_245_ & 0xff00) >> 8;
			int i_261_ = i_245_ & 0xff;
			for (int i_262_ = -i_250_; i_262_ < 0; i_262_++) {
			    for (int i_263_ = -i_251_; i_263_ < 0; i_263_++) {
				int i_264_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_249_++]);
				int i_265_
				    = (i_264_ & 0xff0000) * i_259_ & ~0xffffff;
				int i_266_
				    = (i_264_ & 0xff00) * i_260_ & 0xff0000;
				int i_267_ = (i_264_ & 0xff) * i_261_ & 0xff00;
				is[i_248_++]
				    = (i_265_ | i_266_ | i_267_) >>> 8;
			    }
			    i_248_ += i_252_;
			    i_249_ += i_253_;
			}
		    } else if (i_244_ == 3) {
			for (int i_268_ = -i_250_; i_268_ < 0; i_268_++) {
			    for (int i_269_ = -i_251_; i_269_ < 0; i_269_++) {
				int i_270_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_249_++]);
				int i_271_ = i_270_ + i_245_;
				int i_272_ = ((i_270_ & 0xff00ff)
					      + (i_245_ & 0xff00ff));
				int i_273_ = ((i_272_ & 0x1000100)
					      + (i_271_ - i_272_ & 0x10000));
				is[i_248_++]
				    = i_271_ - i_273_ | i_273_ - (i_273_
								  >>> 8);
			    }
			    i_248_ += i_252_;
			    i_249_ += i_253_;
			}
		    } else if (i_244_ == 2) {
			int i_274_ = i_245_ >>> 24;
			int i_275_ = 256 - i_274_;
			int i_276_ = (i_245_ & 0xff00ff) * i_275_ & ~0xff00ff;
			int i_277_ = (i_245_ & 0xff00) * i_275_ & 0xff0000;
			i_245_ = (i_276_ | i_277_) >>> 8;
			for (int i_278_ = -i_250_; i_278_ < 0; i_278_++) {
			    for (int i_279_ = -i_251_; i_279_ < 0; i_279_++) {
				int i_280_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_249_++]);
				i_276_
				    = (i_280_ & 0xff00ff) * i_274_ & ~0xff00ff;
				i_277_ = (i_280_ & 0xff00) * i_274_ & 0xff0000;
				is[i_248_++]
				    = ((i_276_ | i_277_) >>> 8) + i_245_;
			    }
			    i_248_ += i_252_;
			    i_249_ += i_253_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_246_ == 1) {
		    if (i_244_ == 1) {
			for (int i_281_ = -i_250_; i_281_ < 0; i_281_++) {
			    for (int i_282_ = -i_251_; i_282_ < 0; i_282_++) {
				int i_283_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_249_++]);
				int i_284_ = i_283_ >>> 24;
				int i_285_ = 256 - i_284_;
				int i_286_ = is[i_248_];
				is[i_248_++]
				    = (((((i_283_ & 0xff00ff) * i_284_
					  + (i_286_ & 0xff00ff) * i_285_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_283_ & ~0xff00ff) >>> 8)
					    * i_284_)
					   + (((i_286_ & ~0xff00ff) >>> 8)
					      * i_285_))
					  & ~0xff00ff));
			    }
			    i_248_ += i_252_;
			    i_249_ += i_253_;
			}
		    } else if (i_244_ == 0) {
			if ((i_245_ & 0xffffff) == 16777215) {
			    for (int i_287_ = -i_250_; i_287_ < 0; i_287_++) {
				for (int i_288_ = -i_251_; i_288_ < 0;
				     i_288_++) {
				    int i_289_ = (((Class168_Sub2_Sub2) this)
						  .anIntArray11124[i_249_++]);
				    int i_290_
					= ((i_289_ >>> 24) * (i_245_ >>> 24)
					   >> 8);
				    int i_291_ = 256 - i_290_;
				    int i_292_ = is[i_248_];
				    is[i_248_++]
					= ((((i_289_ & 0xff00ff) * i_290_
					     + (i_292_ & 0xff00ff) * i_291_)
					    & ~0xff00ff)
					   + (((i_289_ & 0xff00) * i_290_
					       + (i_292_ & 0xff00) * i_291_)
					      & 0xff0000)) >> 8;
				}
				i_248_ += i_252_;
				i_249_ += i_253_;
			    }
			} else {
			    int i_293_ = (i_245_ & 0xff0000) >> 16;
			    int i_294_ = (i_245_ & 0xff00) >> 8;
			    int i_295_ = i_245_ & 0xff;
			    for (int i_296_ = -i_250_; i_296_ < 0; i_296_++) {
				for (int i_297_ = -i_251_; i_297_ < 0;
				     i_297_++) {
				    int i_298_ = (((Class168_Sub2_Sub2) this)
						  .anIntArray11124[i_249_++]);
				    int i_299_
					= ((i_298_ >>> 24) * (i_245_ >>> 24)
					   >> 8);
				    int i_300_ = 256 - i_299_;
				    if (i_299_ != 255) {
					int i_301_
					    = ((i_298_ & 0xff0000) * i_293_
					       & ~0xffffff);
					int i_302_
					    = ((i_298_ & 0xff00) * i_294_
					       & 0xff0000);
					int i_303_ = ((i_298_ & 0xff) * i_295_
						      & 0xff00);
					i_298_
					    = (i_301_ | i_302_ | i_303_) >>> 8;
					int i_304_ = is[i_248_];
					is[i_248_++]
					    = ((((i_298_ & 0xff00ff) * i_299_
						 + ((i_304_ & 0xff00ff)
						    * i_300_))
						& ~0xff00ff)
					       + (((i_298_ & 0xff00) * i_299_
						   + ((i_304_ & 0xff00)
						      * i_300_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_305_
					    = ((i_298_ & 0xff0000) * i_293_
					       & ~0xffffff);
					int i_306_
					    = ((i_298_ & 0xff00) * i_294_
					       & 0xff0000);
					int i_307_ = ((i_298_ & 0xff) * i_295_
						      & 0xff00);
					is[i_248_++]
					    = (i_305_ | i_306_ | i_307_) >>> 8;
				    }
				}
				i_248_ += i_252_;
				i_249_ += i_253_;
			    }
			}
		    } else if (i_244_ == 3) {
			for (int i_308_ = -i_250_; i_308_ < 0; i_308_++) {
			    for (int i_309_ = -i_251_; i_309_ < 0; i_309_++) {
				int i_310_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_249_++]);
				int i_311_ = i_310_ + i_245_;
				int i_312_ = ((i_310_ & 0xff00ff)
					      + (i_245_ & 0xff00ff));
				int i_313_ = ((i_312_ & 0x1000100)
					      + (i_311_ - i_312_ & 0x10000));
				i_313_ = i_311_ - i_313_ | i_313_ - (i_313_
								     >>> 8);
				int i_314_
				    = (i_313_ >>> 24) * (i_245_ >>> 24) >> 8;
				int i_315_ = 256 - i_314_;
				if (i_314_ != 255) {
				    i_310_ = i_313_;
				    i_313_ = is[i_248_];
				    i_313_ = ((((i_310_ & 0xff00ff) * i_314_
						+ (i_313_ & 0xff00ff) * i_315_)
					       & ~0xff00ff)
					      + (((i_310_ & 0xff00) * i_314_
						  + (i_313_ & 0xff00) * i_315_)
						 & 0xff0000)) >> 8;
				}
				is[i_248_++] = i_313_;
			    }
			    i_248_ += i_252_;
			    i_249_ += i_253_;
			}
		    } else if (i_244_ == 2) {
			int i_316_ = i_245_ >>> 24;
			int i_317_ = 256 - i_316_;
			int i_318_ = (i_245_ & 0xff00ff) * i_317_ & ~0xff00ff;
			int i_319_ = (i_245_ & 0xff00) * i_317_ & 0xff0000;
			i_245_ = (i_318_ | i_319_) >>> 8;
			for (int i_320_ = -i_250_; i_320_ < 0; i_320_++) {
			    for (int i_321_ = -i_251_; i_321_ < 0; i_321_++) {
				int i_322_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_249_++]);
				int i_323_ = i_322_ >>> 24;
				int i_324_ = 256 - i_323_;
				i_318_
				    = (i_322_ & 0xff00ff) * i_316_ & ~0xff00ff;
				i_319_ = (i_322_ & 0xff00) * i_316_ & 0xff0000;
				i_322_ = ((i_318_ | i_319_) >>> 8) + i_245_;
				int i_325_ = is[i_248_];
				is[i_248_++]
				    = ((((i_322_ & 0xff00ff) * i_323_
					 + (i_325_ & 0xff00ff) * i_324_)
					& ~0xff00ff)
				       + (((i_322_ & 0xff00) * i_323_
					   + (i_325_ & 0xff00) * i_324_)
					  & 0xff0000)) >> 8;
			    }
			    i_248_ += i_252_;
			    i_249_ += i_253_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_246_ == 2) {
		    if (i_244_ == 1) {
			for (int i_326_ = -i_250_; i_326_ < 0; i_326_++) {
			    for (int i_327_ = -i_251_; i_327_ < 0; i_327_++) {
				int i_328_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_249_++]);
				if (i_328_ != 0) {
				    int i_329_ = is[i_248_];
				    int i_330_ = i_328_ + i_329_;
				    int i_331_ = ((i_328_ & 0xff00ff)
						  + (i_329_ & 0xff00ff));
				    i_329_ = ((i_331_ & 0x1000100)
					      + (i_330_ - i_331_ & 0x10000));
				    is[i_248_++]
					= i_330_ - i_329_ | i_329_ - (i_329_
								      >>> 8);
				} else
				    i_248_++;
			    }
			    i_248_ += i_252_;
			    i_249_ += i_253_;
			}
		    } else if (i_244_ == 0) {
			int i_332_ = (i_245_ & 0xff0000) >> 16;
			int i_333_ = (i_245_ & 0xff00) >> 8;
			int i_334_ = i_245_ & 0xff;
			for (int i_335_ = -i_250_; i_335_ < 0; i_335_++) {
			    for (int i_336_ = -i_251_; i_336_ < 0; i_336_++) {
				int i_337_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_249_++]);
				if (i_337_ != 0) {
				    int i_338_ = ((i_337_ & 0xff0000) * i_332_
						  & ~0xffffff);
				    int i_339_ = ((i_337_ & 0xff00) * i_333_
						  & 0xff0000);
				    int i_340_
					= (i_337_ & 0xff) * i_334_ & 0xff00;
				    i_337_ = (i_338_ | i_339_ | i_340_) >>> 8;
				    int i_341_ = is[i_248_];
				    int i_342_ = i_337_ + i_341_;
				    int i_343_ = ((i_337_ & 0xff00ff)
						  + (i_341_ & 0xff00ff));
				    i_341_ = ((i_343_ & 0x1000100)
					      + (i_342_ - i_343_ & 0x10000));
				    is[i_248_++]
					= i_342_ - i_341_ | i_341_ - (i_341_
								      >>> 8);
				} else
				    i_248_++;
			    }
			    i_248_ += i_252_;
			    i_249_ += i_253_;
			}
		    } else if (i_244_ == 3) {
			for (int i_344_ = -i_250_; i_344_ < 0; i_344_++) {
			    for (int i_345_ = -i_251_; i_345_ < 0; i_345_++) {
				int i_346_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_249_++]);
				int i_347_ = i_346_ + i_245_;
				int i_348_ = ((i_346_ & 0xff00ff)
					      + (i_245_ & 0xff00ff));
				int i_349_ = ((i_348_ & 0x1000100)
					      + (i_347_ - i_348_ & 0x10000));
				i_346_ = i_347_ - i_349_ | i_349_ - (i_349_
								     >>> 8);
				i_349_ = is[i_248_];
				i_347_ = i_346_ + i_349_;
				i_348_ = (i_346_ & 0xff00ff) + (i_349_
								& 0xff00ff);
				i_349_
				    = (i_348_ & 0x1000100) + (i_347_ - i_348_
							      & 0x10000);
				is[i_248_++]
				    = i_347_ - i_349_ | i_349_ - (i_349_
								  >>> 8);
			    }
			    i_248_ += i_252_;
			    i_249_ += i_253_;
			}
		    } else if (i_244_ == 2) {
			int i_350_ = i_245_ >>> 24;
			int i_351_ = 256 - i_350_;
			int i_352_ = (i_245_ & 0xff00ff) * i_351_ & ~0xff00ff;
			int i_353_ = (i_245_ & 0xff00) * i_351_ & 0xff0000;
			i_245_ = (i_352_ | i_353_) >>> 8;
			for (int i_354_ = -i_250_; i_354_ < 0; i_354_++) {
			    for (int i_355_ = -i_251_; i_355_ < 0; i_355_++) {
				int i_356_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_249_++]);
				if (i_356_ != 0) {
				    i_352_ = ((i_356_ & 0xff00ff) * i_350_
					      & ~0xff00ff);
				    i_353_ = ((i_356_ & 0xff00) * i_350_
					      & 0xff0000);
				    i_356_
					= ((i_352_ | i_353_) >>> 8) + i_245_;
				    int i_357_ = is[i_248_];
				    int i_358_ = i_356_ + i_357_;
				    int i_359_ = ((i_356_ & 0xff00ff)
						  + (i_357_ & 0xff00ff));
				    i_357_ = ((i_359_ & 0x1000100)
					      + (i_358_ - i_359_ & 0x10000));
				    is[i_248_++]
					= i_358_ - i_357_ | i_357_ - (i_357_
								      >>> 8);
				} else
				    i_248_++;
			    }
			    i_248_ += i_252_;
			    i_249_ += i_253_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method3679(int i, int i_360_, Class135 class135, int i_361_,
			   int i_362_) {
	if (((Class168_Sub2_Sub2) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    i += ((Class168_Sub2_Sub2) this).anInt9907;
	    i_360_ += ((Class168_Sub2_Sub2) this).anInt9905;
	    int i_363_ = 0;
	    int i_364_ = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					    .aClass103_Sub2_9904)).anInt9260
			  * -1826993761);
	    int i_365_ = ((Class168_Sub2_Sub2) this).anInt9920;
	    int i_366_ = ((Class168_Sub2_Sub2) this).anInt9916;
	    int i_367_ = i_364_ - i_365_;
	    int i_368_ = 0;
	    int i_369_ = i + i_360_ * i_364_;
	    if (i_360_ < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					    .aClass103_Sub2_9904)).anInt9254
			  * -788450385)) {
		int i_370_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9254) * -788450385
			      - i_360_);
		i_366_ -= i_370_;
		i_360_ = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					    .aClass103_Sub2_9904)).anInt9254
			  * -788450385);
		i_363_ += i_370_ * i_365_;
		i_369_ += i_370_ * i_364_;
	    }
	    if (i_360_ + i_366_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_366_ -= (i_360_ + i_366_
			   - (((Class103_Sub2)
			       ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			      .anInt9252) * 1546170165);
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_371_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9249) * 1298750001
			      - i);
		i_365_ -= i_371_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_363_ += i_371_;
		i_369_ += i_371_;
		i_368_ += i_371_;
		i_367_ += i_371_;
	    }
	    if (i + i_365_ > (((Class103_Sub2)
			       ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			      .anInt9250) * 325436811) {
		int i_372_ = (i + i_365_
			      - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						   .aClass103_Sub2_9904))
				 .anInt9250) * 325436811);
		i_365_ -= i_372_;
		i_368_ += i_372_;
		i_367_ += i_372_;
	    }
	    if (i_365_ > 0 && i_366_ > 0) {
		Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
		int[] is_373_ = ((Class135_Sub1) class135_sub1).anIntArray9874;
		int[] is_374_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
		int i_375_ = i_360_;
		if (i_362_ > i_375_) {
		    i_375_ = i_362_;
		    i_369_ += (i_362_ - i_360_) * i_364_;
		    i_363_ += ((i_362_ - i_360_)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
		}
		int i_376_ = (i_362_ + is_373_.length < i_360_ + i_366_
			      ? i_362_ + is_373_.length : i_360_ + i_366_);
		for (int i_377_ = i_375_; i_377_ < i_376_; i_377_++) {
		    int i_378_ = is_373_[i_377_ - i_362_] + i_361_;
		    int i_379_ = is_374_[i_377_ - i_362_];
		    int i_380_ = i_365_;
		    if (i > i_378_) {
			int i_381_ = i - i_378_;
			if (i_381_ >= i_379_) {
			    i_363_ += i_365_ + i_368_;
			    i_369_ += i_365_ + i_367_;
			    continue;
			}
			i_379_ -= i_381_;
		    } else {
			int i_382_ = i_378_ - i;
			if (i_382_ >= i_365_) {
			    i_363_ += i_365_ + i_368_;
			    i_369_ += i_365_ + i_367_;
			    continue;
			}
			i_363_ += i_382_;
			i_380_ -= i_382_;
			i_369_ += i_382_;
		    }
		    int i_383_ = 0;
		    if (i_380_ < i_379_)
			i_379_ = i_380_;
		    else
			i_383_ = i_380_ - i_379_;
		    for (int i_384_ = -i_379_; i_384_ < 0; i_384_++) {
			int i_385_ = (((Class168_Sub2_Sub2) this)
				      .anIntArray11124[i_363_++]);
			int i_386_ = i_385_ >>> 24;
			int i_387_ = 256 - i_386_;
			int i_388_ = is[i_369_];
			is[i_369_++] = ((((i_385_ & 0xff00ff) * i_386_
					  + (i_388_ & 0xff00ff) * i_387_)
					 & ~0xff00ff)
					+ (((i_385_ & 0xff00) * i_386_
					    + (i_388_ & 0xff00) * i_387_)
					   & 0xff0000)) >> 8;
		    }
		    i_363_ += i_383_ + i_368_;
		    i_369_ += i_383_ + i_367_;
		}
	    }
	}
    }
    
    void method3670(int i, int i_389_, int i_390_, int i_391_, int i_392_,
		    int i_393_, int i_394_, int i_395_) {
	if (((Class168_Sub2_Sub2) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	if (i_390_ > 0 && i_391_ > 0) {
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (is != null) {
		int i_396_ = 0;
		int i_397_ = 0;
		int i_398_
		    = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					 .aClass103_Sub2_9904)).anInt9260
		       * -1826993761);
		int i_399_ = (((Class168_Sub2_Sub2) this).anInt9907
			      + ((Class168_Sub2_Sub2) this).anInt9920
			      + ((Class168_Sub2_Sub2) this).anInt9909);
		int i_400_ = (((Class168_Sub2_Sub2) this).anInt9905
			      + ((Class168_Sub2_Sub2) this).anInt9916
			      + ((Class168_Sub2_Sub2) this).anInt9910);
		int i_401_ = (i_399_ << 16) / i_390_;
		int i_402_ = (i_400_ << 16) / i_391_;
		if (((Class168_Sub2_Sub2) this).anInt9907 > 0) {
		    int i_403_ = ((((Class168_Sub2_Sub2) this).anInt9907 << 16)
				  + i_401_ - 1) / i_401_;
		    i += i_403_;
		    i_396_
			+= (i_403_ * i_401_
			    - (((Class168_Sub2_Sub2) this).anInt9907 << 16));
		}
		if (((Class168_Sub2_Sub2) this).anInt9905 > 0) {
		    int i_404_ = ((((Class168_Sub2_Sub2) this).anInt9905 << 16)
				  + i_402_ - 1) / i_402_;
		    i_389_ += i_404_;
		    i_397_
			+= (i_404_ * i_402_
			    - (((Class168_Sub2_Sub2) this).anInt9905 << 16));
		}
		if (((Class168_Sub2_Sub2) this).anInt9920 < i_399_)
		    i_390_ = ((((Class168_Sub2_Sub2) this).anInt9920 << 16)
			      - i_396_ + i_401_ - 1) / i_401_;
		if (((Class168_Sub2_Sub2) this).anInt9916 < i_400_)
		    i_391_ = ((((Class168_Sub2_Sub2) this).anInt9916 << 16)
			      - i_397_ + i_402_ - 1) / i_402_;
		int i_405_ = i + i_389_ * i_398_;
		int i_406_ = i_398_ - i_390_;
		if (i_389_ + i_391_
		    > (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					 .aClass103_Sub2_9904)).anInt9252
		       * 1546170165))
		    i_391_ -= (i_389_ + i_391_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						    .aClass103_Sub2_9904))
				  .anInt9252) * 1546170165);
		if (i_389_ < (((Class103_Sub2)
			       ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			      .anInt9254) * -788450385) {
		    int i_407_ = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						    .aClass103_Sub2_9904))
				  .anInt9254) * -788450385 - i_389_;
		    i_391_ -= i_407_;
		    i_405_ += i_407_ * i_398_;
		    i_397_ += i_402_ * i_407_;
		}
		if (i + i_390_ > (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811) {
		    int i_408_
			= (i + i_390_
			   - (((Class103_Sub2)
			       ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			      .anInt9250) * 325436811);
		    i_390_ -= i_408_;
		    i_406_ += i_408_;
		}
		if (i < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					   .aClass103_Sub2_9904)).anInt9249
			 * 1298750001)) {
		    int i_409_ = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						    .aClass103_Sub2_9904))
				  .anInt9249) * 1298750001 - i;
		    i_390_ -= i_409_;
		    i_405_ += i_409_;
		    i_396_ += i_401_ * i_409_;
		    i_406_ += i_409_;
		}
		if (i_394_ == 0) {
		    if (i_392_ == 1) {
			int i_410_ = i_396_;
			for (int i_411_ = -i_391_; i_411_ < 0; i_411_++) {
			    int i_412_
				= ((i_397_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_413_ = -i_390_; i_413_ < 0; i_413_++) {
				is[i_405_++] = (((Class168_Sub2_Sub2) this)
						.anIntArray11124
						[(i_396_ >> 16) + i_412_]);
				i_396_ += i_401_;
			    }
			    i_397_ += i_402_;
			    i_396_ = i_410_;
			    i_405_ += i_406_;
			}
		    } else if (i_392_ == 0) {
			int i_414_ = (i_393_ & 0xff0000) >> 16;
			int i_415_ = (i_393_ & 0xff00) >> 8;
			int i_416_ = i_393_ & 0xff;
			int i_417_ = i_396_;
			for (int i_418_ = -i_391_; i_418_ < 0; i_418_++) {
			    int i_419_
				= ((i_397_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_420_ = -i_390_; i_420_ < 0; i_420_++) {
				int i_421_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124
					      [(i_396_ >> 16) + i_419_]);
				int i_422_
				    = (i_421_ & 0xff0000) * i_414_ & ~0xffffff;
				int i_423_
				    = (i_421_ & 0xff00) * i_415_ & 0xff0000;
				int i_424_ = (i_421_ & 0xff) * i_416_ & 0xff00;
				is[i_405_++]
				    = (i_422_ | i_423_ | i_424_) >>> 8;
				i_396_ += i_401_;
			    }
			    i_397_ += i_402_;
			    i_396_ = i_417_;
			    i_405_ += i_406_;
			}
		    } else if (i_392_ == 3) {
			int i_425_ = i_396_;
			for (int i_426_ = -i_391_; i_426_ < 0; i_426_++) {
			    int i_427_
				= ((i_397_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_428_ = -i_390_; i_428_ < 0; i_428_++) {
				int i_429_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124
					      [(i_396_ >> 16) + i_427_]);
				int i_430_ = i_429_ + i_393_;
				int i_431_ = ((i_429_ & 0xff00ff)
					      + (i_393_ & 0xff00ff));
				int i_432_ = ((i_431_ & 0x1000100)
					      + (i_430_ - i_431_ & 0x10000));
				is[i_405_++]
				    = i_430_ - i_432_ | i_432_ - (i_432_
								  >>> 8);
				i_396_ += i_401_;
			    }
			    i_397_ += i_402_;
			    i_396_ = i_425_;
			    i_405_ += i_406_;
			}
		    } else if (i_392_ == 2) {
			int i_433_ = i_393_ >>> 24;
			int i_434_ = 256 - i_433_;
			int i_435_ = (i_393_ & 0xff00ff) * i_434_ & ~0xff00ff;
			int i_436_ = (i_393_ & 0xff00) * i_434_ & 0xff0000;
			i_393_ = (i_435_ | i_436_) >>> 8;
			int i_437_ = i_396_;
			for (int i_438_ = -i_391_; i_438_ < 0; i_438_++) {
			    int i_439_
				= ((i_397_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_440_ = -i_390_; i_440_ < 0; i_440_++) {
				int i_441_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124
					      [(i_396_ >> 16) + i_439_]);
				i_435_
				    = (i_441_ & 0xff00ff) * i_433_ & ~0xff00ff;
				i_436_ = (i_441_ & 0xff00) * i_433_ & 0xff0000;
				is[i_405_++]
				    = ((i_435_ | i_436_) >>> 8) + i_393_;
				i_396_ += i_401_;
			    }
			    i_397_ += i_402_;
			    i_396_ = i_437_;
			    i_405_ += i_406_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_394_ == 1) {
		    if (i_392_ == 1) {
			int i_442_ = i_396_;
			for (int i_443_ = -i_391_; i_443_ < 0; i_443_++) {
			    int i_444_
				= ((i_397_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_445_ = -i_390_; i_445_ < 0; i_445_++) {
				int i_446_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124
					      [(i_396_ >> 16) + i_444_]);
				int i_447_ = i_446_ >>> 24;
				int i_448_ = 256 - i_447_;
				int i_449_ = is[i_405_];
				is[i_405_++]
				    = (((((i_446_ & 0xff00ff) * i_447_
					  + (i_449_ & 0xff00ff) * i_448_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_446_ & ~0xff00ff) >>> 8)
					    * i_447_)
					   + (((i_449_ & ~0xff00ff) >>> 8)
					      * i_448_))
					  & ~0xff00ff));
				i_396_ += i_401_;
			    }
			    i_397_ += i_402_;
			    i_396_ = i_442_;
			    i_405_ += i_406_;
			}
		    } else if (i_392_ == 0) {
			int i_450_ = i_396_;
			if ((i_393_ & 0xffffff) == 16777215) {
			    for (int i_451_ = -i_391_; i_451_ < 0; i_451_++) {
				int i_452_ = ((i_397_ >> 16)
					      * (((Class168_Sub2_Sub2) this)
						 .anInt9920));
				for (int i_453_ = -i_390_; i_453_ < 0;
				     i_453_++) {
				    int i_454_ = (((Class168_Sub2_Sub2) this)
						  .anIntArray11124
						  [(i_396_ >> 16) + i_452_]);
				    int i_455_
					= ((i_454_ >>> 24) * (i_393_ >>> 24)
					   >> 8);
				    int i_456_ = 256 - i_455_;
				    int i_457_ = is[i_405_];
				    is[i_405_++]
					= ((((i_454_ & 0xff00ff) * i_455_
					     + (i_457_ & 0xff00ff) * i_456_)
					    & ~0xff00ff)
					   + (((i_454_ & 0xff00) * i_455_
					       + (i_457_ & 0xff00) * i_456_)
					      & 0xff0000)) >> 8;
				    i_396_ += i_401_;
				}
				i_397_ += i_402_;
				i_396_ = i_450_;
				i_405_ += i_406_;
			    }
			} else {
			    int i_458_ = (i_393_ & 0xff0000) >> 16;
			    int i_459_ = (i_393_ & 0xff00) >> 8;
			    int i_460_ = i_393_ & 0xff;
			    for (int i_461_ = -i_391_; i_461_ < 0; i_461_++) {
				int i_462_ = ((i_397_ >> 16)
					      * (((Class168_Sub2_Sub2) this)
						 .anInt9920));
				for (int i_463_ = -i_390_; i_463_ < 0;
				     i_463_++) {
				    int i_464_ = (((Class168_Sub2_Sub2) this)
						  .anIntArray11124
						  [(i_396_ >> 16) + i_462_]);
				    int i_465_
					= ((i_464_ >>> 24) * (i_393_ >>> 24)
					   >> 8);
				    int i_466_ = 256 - i_465_;
				    if (i_465_ != 255) {
					int i_467_
					    = ((i_464_ & 0xff0000) * i_458_
					       & ~0xffffff);
					int i_468_
					    = ((i_464_ & 0xff00) * i_459_
					       & 0xff0000);
					int i_469_ = ((i_464_ & 0xff) * i_460_
						      & 0xff00);
					i_464_
					    = (i_467_ | i_468_ | i_469_) >>> 8;
					int i_470_ = is[i_405_];
					is[i_405_++]
					    = ((((i_464_ & 0xff00ff) * i_465_
						 + ((i_470_ & 0xff00ff)
						    * i_466_))
						& ~0xff00ff)
					       + (((i_464_ & 0xff00) * i_465_
						   + ((i_470_ & 0xff00)
						      * i_466_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_471_
					    = ((i_464_ & 0xff0000) * i_458_
					       & ~0xffffff);
					int i_472_
					    = ((i_464_ & 0xff00) * i_459_
					       & 0xff0000);
					int i_473_ = ((i_464_ & 0xff) * i_460_
						      & 0xff00);
					is[i_405_++]
					    = (i_471_ | i_472_ | i_473_) >>> 8;
				    }
				    i_396_ += i_401_;
				}
				i_397_ += i_402_;
				i_396_ = i_450_;
				i_405_ += i_406_;
			    }
			}
		    } else if (i_392_ == 3) {
			int i_474_ = i_396_;
			for (int i_475_ = -i_391_; i_475_ < 0; i_475_++) {
			    int i_476_
				= ((i_397_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_477_ = -i_390_; i_477_ < 0; i_477_++) {
				int i_478_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124
					      [(i_396_ >> 16) + i_476_]);
				int i_479_ = i_478_ + i_393_;
				int i_480_ = ((i_478_ & 0xff00ff)
					      + (i_393_ & 0xff00ff));
				int i_481_ = ((i_480_ & 0x1000100)
					      + (i_479_ - i_480_ & 0x10000));
				i_481_ = i_479_ - i_481_ | i_481_ - (i_481_
								     >>> 8);
				int i_482_
				    = (i_481_ >>> 24) * (i_393_ >>> 24) >> 8;
				int i_483_ = 256 - i_482_;
				if (i_482_ != 255) {
				    i_478_ = i_481_;
				    i_481_ = is[i_405_];
				    i_481_ = ((((i_478_ & 0xff00ff) * i_482_
						+ (i_481_ & 0xff00ff) * i_483_)
					       & ~0xff00ff)
					      + (((i_478_ & 0xff00) * i_482_
						  + (i_481_ & 0xff00) * i_483_)
						 & 0xff0000)) >> 8;
				}
				is[i_405_++] = i_481_;
				i_396_ += i_401_;
			    }
			    i_397_ += i_402_;
			    i_396_ = i_474_;
			    i_405_ += i_406_;
			}
		    } else if (i_392_ == 2) {
			int i_484_ = i_393_ >>> 24;
			int i_485_ = 256 - i_484_;
			int i_486_ = (i_393_ & 0xff00ff) * i_485_ & ~0xff00ff;
			int i_487_ = (i_393_ & 0xff00) * i_485_ & 0xff0000;
			i_393_ = (i_486_ | i_487_) >>> 8;
			int i_488_ = i_396_;
			for (int i_489_ = -i_391_; i_489_ < 0; i_489_++) {
			    int i_490_
				= ((i_397_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_491_ = -i_390_; i_491_ < 0; i_491_++) {
				int i_492_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124
					      [(i_396_ >> 16) + i_490_]);
				int i_493_ = i_492_ >>> 24;
				int i_494_ = 256 - i_493_;
				i_486_
				    = (i_492_ & 0xff00ff) * i_484_ & ~0xff00ff;
				i_487_ = (i_492_ & 0xff00) * i_484_ & 0xff0000;
				i_492_ = ((i_486_ | i_487_) >>> 8) + i_393_;
				int i_495_ = is[i_405_];
				is[i_405_++]
				    = ((((i_492_ & 0xff00ff) * i_493_
					 + (i_495_ & 0xff00ff) * i_494_)
					& ~0xff00ff)
				       + (((i_492_ & 0xff00) * i_493_
					   + (i_495_ & 0xff00) * i_494_)
					  & 0xff0000)) >> 8;
				i_396_ += i_401_;
			    }
			    i_397_ += i_402_;
			    i_396_ = i_488_;
			    i_405_ += i_406_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_394_ == 2) {
		    if (i_392_ == 1) {
			int i_496_ = i_396_;
			for (int i_497_ = -i_391_; i_497_ < 0; i_497_++) {
			    int i_498_
				= ((i_397_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_499_ = -i_390_; i_499_ < 0; i_499_++) {
				int i_500_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124
					      [(i_396_ >> 16) + i_498_]);
				if (i_500_ != 0) {
				    int i_501_ = is[i_405_];
				    int i_502_ = i_500_ + i_501_;
				    int i_503_ = ((i_500_ & 0xff00ff)
						  + (i_501_ & 0xff00ff));
				    i_501_ = ((i_503_ & 0x1000100)
					      + (i_502_ - i_503_ & 0x10000));
				    is[i_405_++]
					= i_502_ - i_501_ | i_501_ - (i_501_
								      >>> 8);
				} else
				    i_405_++;
				i_396_ += i_401_;
			    }
			    i_397_ += i_402_;
			    i_396_ = i_496_;
			    i_405_ += i_406_;
			}
		    } else if (i_392_ == 0) {
			int i_504_ = i_396_;
			int i_505_ = (i_393_ & 0xff0000) >> 16;
			int i_506_ = (i_393_ & 0xff00) >> 8;
			int i_507_ = i_393_ & 0xff;
			for (int i_508_ = -i_391_; i_508_ < 0; i_508_++) {
			    int i_509_
				= ((i_397_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_510_ = -i_390_; i_510_ < 0; i_510_++) {
				int i_511_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124
					      [(i_396_ >> 16) + i_509_]);
				if (i_511_ != 0) {
				    int i_512_ = ((i_511_ & 0xff0000) * i_505_
						  & ~0xffffff);
				    int i_513_ = ((i_511_ & 0xff00) * i_506_
						  & 0xff0000);
				    int i_514_
					= (i_511_ & 0xff) * i_507_ & 0xff00;
				    i_511_ = (i_512_ | i_513_ | i_514_) >>> 8;
				    int i_515_ = is[i_405_];
				    int i_516_ = i_511_ + i_515_;
				    int i_517_ = ((i_511_ & 0xff00ff)
						  + (i_515_ & 0xff00ff));
				    i_515_ = ((i_517_ & 0x1000100)
					      + (i_516_ - i_517_ & 0x10000));
				    is[i_405_++]
					= i_516_ - i_515_ | i_515_ - (i_515_
								      >>> 8);
				} else
				    i_405_++;
				i_396_ += i_401_;
			    }
			    i_397_ += i_402_;
			    i_396_ = i_504_;
			    i_405_ += i_406_;
			}
		    } else if (i_392_ == 3) {
			int i_518_ = i_396_;
			for (int i_519_ = -i_391_; i_519_ < 0; i_519_++) {
			    int i_520_
				= ((i_397_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_521_ = -i_390_; i_521_ < 0; i_521_++) {
				int i_522_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124
					      [(i_396_ >> 16) + i_520_]);
				int i_523_ = i_522_ + i_393_;
				int i_524_ = ((i_522_ & 0xff00ff)
					      + (i_393_ & 0xff00ff));
				int i_525_ = ((i_524_ & 0x1000100)
					      + (i_523_ - i_524_ & 0x10000));
				i_522_ = i_523_ - i_525_ | i_525_ - (i_525_
								     >>> 8);
				i_525_ = is[i_405_];
				i_523_ = i_522_ + i_525_;
				i_524_ = (i_522_ & 0xff00ff) + (i_525_
								& 0xff00ff);
				i_525_
				    = (i_524_ & 0x1000100) + (i_523_ - i_524_
							      & 0x10000);
				is[i_405_++]
				    = i_523_ - i_525_ | i_525_ - (i_525_
								  >>> 8);
				i_396_ += i_401_;
			    }
			    i_397_ += i_402_;
			    i_396_ = i_518_;
			    i_405_ += i_406_;
			}
		    } else if (i_392_ == 2) {
			int i_526_ = i_393_ >>> 24;
			int i_527_ = 256 - i_526_;
			int i_528_ = (i_393_ & 0xff00ff) * i_527_ & ~0xff00ff;
			int i_529_ = (i_393_ & 0xff00) * i_527_ & 0xff0000;
			i_393_ = (i_528_ | i_529_) >>> 8;
			int i_530_ = i_396_;
			for (int i_531_ = -i_391_; i_531_ < 0; i_531_++) {
			    int i_532_
				= ((i_397_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_533_ = -i_390_; i_533_ < 0; i_533_++) {
				int i_534_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124
					      [(i_396_ >> 16) + i_532_]);
				if (i_534_ != 0) {
				    i_528_ = ((i_534_ & 0xff00ff) * i_526_
					      & ~0xff00ff);
				    i_529_ = ((i_534_ & 0xff00) * i_526_
					      & 0xff0000);
				    i_534_
					= ((i_528_ | i_529_) >>> 8) + i_393_;
				    int i_535_ = is[i_405_];
				    int i_536_ = i_534_ + i_535_;
				    int i_537_ = ((i_534_ & 0xff00ff)
						  + (i_535_ & 0xff00ff));
				    i_535_ = ((i_537_ & 0x1000100)
					      + (i_536_ - i_537_ & 0x10000));
				    is[i_405_++]
					= i_536_ - i_535_ | i_535_ - (i_535_
								      >>> 8);
				} else
				    i_405_++;
				i_396_ += i_401_;
			    }
			    i_397_ += i_402_;
			    i_396_ = i_530_;
			    i_405_ += i_406_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method16230(int[] is, int[] is_538_, int i, int i_539_) {
	int[] is_540_ = (((Class103_Sub2)
			  ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			 .anIntArray9245);
	if (is_540_ != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_541_ = anInt9919;
		    while (i_541_ < 0) {
			int i_542_ = i_541_ + i_539_;
			if (i_542_ >= 0) {
			    if (i_542_ >= is.length)
				break;
			    int i_543_ = anInt9925;
			    int i_544_ = anInt9927;
			    int i_545_ = anInt9928;
			    int i_546_ = anInt9906;
			    if (i_544_ >= 0 && i_545_ >= 0
				&& (i_544_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)) < 0
				&& (i_545_
				    - (((Class168_Sub2_Sub2) this).anInt9916
				       << 12)) < 0) {
				int i_547_ = is[i_542_] - i;
				int i_548_ = -is_538_[i_542_];
				int i_549_ = i_547_ - (i_543_ - anInt9925);
				if (i_549_ > 0) {
				    i_543_ += i_549_;
				    i_546_ += i_549_;
				    i_544_ += anInt9921 * i_549_;
				    i_545_ += anInt9922 * i_549_;
				} else
				    i_548_ -= i_549_;
				if (i_546_ < i_548_)
				    i_546_ = i_548_;
				for (/**/; i_546_ < 0; i_546_++) {
				    int i_550_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(((i_545_ >> 12)
					      * (((Class168_Sub2_Sub2) this)
						 .anInt9920))
					     + (i_544_ >> 12))]);
				    int i_551_ = i_550_ >>> 24;
				    int i_552_ = 256 - i_551_;
				    int i_553_ = is_540_[i_543_];
				    is_540_[i_543_++]
					= ((((i_550_ & 0xff00ff) * i_551_
					     + (i_553_ & 0xff00ff) * i_552_)
					    & ~0xff00ff)
					   + (((i_550_ & 0xff00) * i_551_
					       + (i_553_ & 0xff00) * i_552_)
					      & 0xff0000)) >> 8;
				}
			    }
			}
			i_541_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_554_ = anInt9919;
		    while (i_554_ < 0) {
			int i_555_ = i_554_ + i_539_;
			if (i_555_ >= 0) {
			    if (i_555_ >= is.length)
				break;
			    int i_556_ = anInt9925;
			    int i_557_ = anInt9927;
			    int i_558_ = anInt9928 + anInt9930;
			    int i_559_ = anInt9906;
			    if (i_557_ >= 0
				&& (i_557_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)) < 0) {
				int i_560_;
				if ((i_560_
				     = i_558_ - ((((Class168_Sub2_Sub2) this)
						  .anInt9916)
						 << 12))
				    >= 0) {
				    i_560_ = (anInt9922 - i_560_) / anInt9922;
				    i_559_ += i_560_;
				    i_558_ += anInt9922 * i_560_;
				    i_556_ += i_560_;
				}
				if ((i_560_ = (i_558_ - anInt9922) / anInt9922)
				    > i_559_)
				    i_559_ = i_560_;
				int i_561_ = is[i_555_] - i;
				int i_562_ = -is_538_[i_555_];
				int i_563_ = i_561_ - (i_556_ - anInt9925);
				if (i_563_ > 0) {
				    i_556_ += i_563_;
				    i_559_ += i_563_;
				    i_557_ += anInt9921 * i_563_;
				    i_558_ += anInt9922 * i_563_;
				} else
				    i_562_ -= i_563_;
				if (i_559_ < i_562_)
				    i_559_ = i_562_;
				for (/**/; i_559_ < 0; i_559_++) {
				    int i_564_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(((i_558_ >> 12)
					      * (((Class168_Sub2_Sub2) this)
						 .anInt9920))
					     + (i_557_ >> 12))]);
				    int i_565_ = i_564_ >>> 24;
				    int i_566_ = 256 - i_565_;
				    int i_567_ = is_540_[i_556_];
				    is_540_[i_556_++]
					= ((((i_564_ & 0xff00ff) * i_565_
					     + (i_567_ & 0xff00ff) * i_566_)
					    & ~0xff00ff)
					   + (((i_564_ & 0xff00) * i_565_
					       + (i_567_ & 0xff00) * i_566_)
					      & 0xff0000)) >> 8;
				    i_558_ += anInt9922;
				}
			    }
			}
			i_554_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_568_ = anInt9919;
		    while (i_568_ < 0) {
			int i_569_ = i_568_ + i_539_;
			if (i_569_ >= 0) {
			    if (i_569_ >= is.length)
				break;
			    int i_570_ = anInt9925;
			    int i_571_ = anInt9927;
			    int i_572_ = anInt9928 + anInt9930;
			    int i_573_ = anInt9906;
			    if (i_571_ >= 0
				&& (i_571_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)) < 0) {
				if (i_572_ < 0) {
				    int i_574_
					= (anInt9922 - 1 - i_572_) / anInt9922;
				    i_573_ += i_574_;
				    i_572_ += anInt9922 * i_574_;
				    i_570_ += i_574_;
				}
				int i_575_;
				if ((i_575_ = (1 + i_572_
					       - ((((Class168_Sub2_Sub2) this)
						   .anInt9916)
						  << 12)
					       - anInt9922) / anInt9922)
				    > i_573_)
				    i_573_ = i_575_;
				int i_576_ = is[i_569_] - i;
				int i_577_ = -is_538_[i_569_];
				int i_578_ = i_576_ - (i_570_ - anInt9925);
				if (i_578_ > 0) {
				    i_570_ += i_578_;
				    i_573_ += i_578_;
				    i_571_ += anInt9921 * i_578_;
				    i_572_ += anInt9922 * i_578_;
				} else
				    i_577_ -= i_578_;
				if (i_573_ < i_577_)
				    i_573_ = i_577_;
				for (/**/; i_573_ < 0; i_573_++) {
				    int i_579_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(((i_572_ >> 12)
					      * (((Class168_Sub2_Sub2) this)
						 .anInt9920))
					     + (i_571_ >> 12))]);
				    int i_580_ = i_579_ >>> 24;
				    int i_581_ = 256 - i_580_;
				    int i_582_ = is_540_[i_570_];
				    is_540_[i_570_++]
					= ((((i_579_ & 0xff00ff) * i_580_
					     + (i_582_ & 0xff00ff) * i_581_)
					    & ~0xff00ff)
					   + (((i_579_ & 0xff00) * i_580_
					       + (i_582_ & 0xff00) * i_581_)
					      & 0xff0000)) >> 8;
				    i_572_ += anInt9922;
				}
			    }
			}
			i_568_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_583_ = anInt9919;
		    while (i_583_ < 0) {
			int i_584_ = i_583_ + i_539_;
			if (i_584_ >= 0) {
			    if (i_584_ >= is.length)
				break;
			    int i_585_ = anInt9925;
			    int i_586_ = anInt9927 + anInt9929;
			    int i_587_ = anInt9928;
			    int i_588_ = anInt9906;
			    if (i_587_ >= 0
				&& (i_587_
				    - (((Class168_Sub2_Sub2) this).anInt9916
				       << 12)) < 0) {
				int i_589_;
				if ((i_589_
				     = i_586_ - ((((Class168_Sub2_Sub2) this)
						  .anInt9920)
						 << 12))
				    >= 0) {
				    i_589_ = (anInt9921 - i_589_) / anInt9921;
				    i_588_ += i_589_;
				    i_586_ += anInt9921 * i_589_;
				    i_585_ += i_589_;
				}
				if ((i_589_ = (i_586_ - anInt9921) / anInt9921)
				    > i_588_)
				    i_588_ = i_589_;
				int i_590_ = is[i_584_] - i;
				int i_591_ = -is_538_[i_584_];
				int i_592_ = i_590_ - (i_585_ - anInt9925);
				if (i_592_ > 0) {
				    i_585_ += i_592_;
				    i_588_ += i_592_;
				    i_586_ += anInt9921 * i_592_;
				    i_587_ += anInt9922 * i_592_;
				} else
				    i_591_ -= i_592_;
				if (i_588_ < i_591_)
				    i_588_ = i_591_;
				for (/**/; i_588_ < 0; i_588_++) {
				    int i_593_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(((i_587_ >> 12)
					      * (((Class168_Sub2_Sub2) this)
						 .anInt9920))
					     + (i_586_ >> 12))]);
				    int i_594_ = i_593_ >>> 24;
				    int i_595_ = 256 - i_594_;
				    int i_596_ = is_540_[i_585_];
				    is_540_[i_585_++]
					= ((((i_593_ & 0xff00ff) * i_594_
					     + (i_596_ & 0xff00ff) * i_595_)
					    & ~0xff00ff)
					   + (((i_593_ & 0xff00) * i_594_
					       + (i_596_ & 0xff00) * i_595_)
					      & 0xff0000)) >> 8;
				    i_586_ += anInt9921;
				}
			    }
			}
			i_583_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_597_ = anInt9919;
		    while (i_597_ < 0) {
			int i_598_ = i_597_ + i_539_;
			if (i_598_ >= 0) {
			    if (i_598_ >= is.length)
				break;
			    int i_599_ = anInt9925;
			    int i_600_ = anInt9927 + anInt9929;
			    int i_601_ = anInt9928 + anInt9930;
			    int i_602_ = anInt9906;
			    int i_603_;
			    if ((i_603_
				 = (i_600_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)))
				>= 0) {
				i_603_ = (anInt9921 - i_603_) / anInt9921;
				i_602_ += i_603_;
				i_600_ += anInt9921 * i_603_;
				i_601_ += anInt9922 * i_603_;
				i_599_ += i_603_;
			    }
			    if ((i_603_ = (i_600_ - anInt9921) / anInt9921)
				> i_602_)
				i_602_ = i_603_;
			    if ((i_603_
				 = (i_601_
				    - (((Class168_Sub2_Sub2) this).anInt9916
				       << 12)))
				>= 0) {
				i_603_ = (anInt9922 - i_603_) / anInt9922;
				i_602_ += i_603_;
				i_600_ += anInt9921 * i_603_;
				i_601_ += anInt9922 * i_603_;
				i_599_ += i_603_;
			    }
			    if ((i_603_ = (i_601_ - anInt9922) / anInt9922)
				> i_602_)
				i_602_ = i_603_;
			    int i_604_ = is[i_598_] - i;
			    int i_605_ = -is_538_[i_598_];
			    int i_606_ = i_604_ - (i_599_ - anInt9925);
			    if (i_606_ > 0) {
				i_599_ += i_606_;
				i_602_ += i_606_;
				i_600_ += anInt9921 * i_606_;
				i_601_ += anInt9922 * i_606_;
			    } else
				i_605_ -= i_606_;
			    if (i_602_ < i_605_)
				i_602_ = i_605_;
			    for (/**/; i_602_ < 0; i_602_++) {
				int i_607_
				    = (((Class168_Sub2_Sub2) this)
				       .anIntArray11124
				       [((i_601_ >> 12) * ((Class168_Sub2_Sub2)
							   this).anInt9920
					 + (i_600_ >> 12))]);
				int i_608_ = i_607_ >>> 24;
				int i_609_ = 256 - i_608_;
				int i_610_ = is_540_[i_599_];
				is_540_[i_599_++]
				    = ((((i_607_ & 0xff00ff) * i_608_
					 + (i_610_ & 0xff00ff) * i_609_)
					& ~0xff00ff)
				       + (((i_607_ & 0xff00) * i_608_
					   + (i_610_ & 0xff00) * i_609_)
					  & 0xff0000)) >> 8;
				i_600_ += anInt9921;
				i_601_ += anInt9922;
			    }
			}
			i_597_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_611_ = anInt9919;
		    while (i_611_ < 0) {
			int i_612_ = i_611_ + i_539_;
			if (i_612_ >= 0) {
			    if (i_612_ >= is.length)
				break;
			    int i_613_ = anInt9925;
			    int i_614_ = anInt9927 + anInt9929;
			    int i_615_ = anInt9928 + anInt9930;
			    int i_616_ = anInt9906;
			    int i_617_;
			    if ((i_617_
				 = (i_614_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)))
				>= 0) {
				i_617_ = (anInt9921 - i_617_) / anInt9921;
				i_616_ += i_617_;
				i_614_ += anInt9921 * i_617_;
				i_615_ += anInt9922 * i_617_;
				i_613_ += i_617_;
			    }
			    if ((i_617_ = (i_614_ - anInt9921) / anInt9921)
				> i_616_)
				i_616_ = i_617_;
			    if (i_615_ < 0) {
				i_617_ = (anInt9922 - 1 - i_615_) / anInt9922;
				i_616_ += i_617_;
				i_614_ += anInt9921 * i_617_;
				i_615_ += anInt9922 * i_617_;
				i_613_ += i_617_;
			    }
			    if ((i_617_
				 = (1 + i_615_
				    - (((Class168_Sub2_Sub2) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_616_)
				i_616_ = i_617_;
			    int i_618_ = is[i_612_] - i;
			    int i_619_ = -is_538_[i_612_];
			    int i_620_ = i_618_ - (i_613_ - anInt9925);
			    if (i_620_ > 0) {
				i_613_ += i_620_;
				i_616_ += i_620_;
				i_614_ += anInt9921 * i_620_;
				i_615_ += anInt9922 * i_620_;
			    } else
				i_619_ -= i_620_;
			    if (i_616_ < i_619_)
				i_616_ = i_619_;
			    for (/**/; i_616_ < 0; i_616_++) {
				int i_621_
				    = (((Class168_Sub2_Sub2) this)
				       .anIntArray11124
				       [((i_615_ >> 12) * ((Class168_Sub2_Sub2)
							   this).anInt9920
					 + (i_614_ >> 12))]);
				int i_622_ = i_621_ >>> 24;
				int i_623_ = 256 - i_622_;
				int i_624_ = is_540_[i_613_];
				is_540_[i_613_++]
				    = ((((i_621_ & 0xff00ff) * i_622_
					 + (i_624_ & 0xff00ff) * i_623_)
					& ~0xff00ff)
				       + (((i_621_ & 0xff00) * i_622_
					   + (i_624_ & 0xff00) * i_623_)
					  & 0xff0000)) >> 8;
				i_614_ += anInt9921;
				i_615_ += anInt9922;
			    }
			}
			i_611_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_625_ = anInt9919;
		while (i_625_ < 0) {
		    int i_626_ = i_625_ + i_539_;
		    if (i_626_ >= 0) {
			if (i_626_ >= is.length)
			    break;
			int i_627_ = anInt9925;
			int i_628_ = anInt9927 + anInt9929;
			int i_629_ = anInt9928;
			int i_630_ = anInt9906;
			if (i_629_ >= 0
			    && i_629_ - (((Class168_Sub2_Sub2) this).anInt9916
					 << 12) < 0) {
			    if (i_628_ < 0) {
				int i_631_
				    = (anInt9921 - 1 - i_628_) / anInt9921;
				i_630_ += i_631_;
				i_628_ += anInt9921 * i_631_;
				i_627_ += i_631_;
			    }
			    int i_632_;
			    if ((i_632_
				 = (1 + i_628_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)
				    - anInt9921) / anInt9921)
				> i_630_)
				i_630_ = i_632_;
			    int i_633_ = is[i_626_] - i;
			    int i_634_ = -is_538_[i_626_];
			    int i_635_ = i_633_ - (i_627_ - anInt9925);
			    if (i_635_ > 0) {
				i_627_ += i_635_;
				i_630_ += i_635_;
				i_628_ += anInt9921 * i_635_;
				i_629_ += anInt9922 * i_635_;
			    } else
				i_634_ -= i_635_;
			    if (i_630_ < i_634_)
				i_630_ = i_634_;
			    for (/**/; i_630_ < 0; i_630_++) {
				int i_636_
				    = (((Class168_Sub2_Sub2) this)
				       .anIntArray11124
				       [((i_629_ >> 12) * ((Class168_Sub2_Sub2)
							   this).anInt9920
					 + (i_628_ >> 12))]);
				int i_637_ = i_636_ >>> 24;
				int i_638_ = 256 - i_637_;
				int i_639_ = is_540_[i_627_];
				is_540_[i_627_++]
				    = ((((i_636_ & 0xff00ff) * i_637_
					 + (i_639_ & 0xff00ff) * i_638_)
					& ~0xff00ff)
				       + (((i_636_ & 0xff00) * i_637_
					   + (i_639_ & 0xff00) * i_638_)
					  & 0xff0000)) >> 8;
				i_628_ += anInt9921;
			    }
			}
		    }
		    i_625_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		int i_640_ = anInt9919;
		while (i_640_ < 0) {
		    int i_641_ = i_640_ + i_539_;
		    if (i_641_ >= 0) {
			if (i_641_ >= is.length)
			    break;
			int i_642_ = anInt9925;
			int i_643_ = anInt9927 + anInt9929;
			int i_644_ = anInt9928 + anInt9930;
			int i_645_ = anInt9906;
			if (i_643_ < 0) {
			    int i_646_ = (anInt9921 - 1 - i_643_) / anInt9921;
			    i_645_ += i_646_;
			    i_643_ += anInt9921 * i_646_;
			    i_644_ += anInt9922 * i_646_;
			    i_642_ += i_646_;
			}
			int i_647_;
			if ((i_647_
			     = (1 + i_643_
				- (((Class168_Sub2_Sub2) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_645_)
			    i_645_ = i_647_;
			if ((i_647_
			     = i_644_ - (((Class168_Sub2_Sub2) this).anInt9916
					 << 12))
			    >= 0) {
			    i_647_ = (anInt9922 - i_647_) / anInt9922;
			    i_645_ += i_647_;
			    i_643_ += anInt9921 * i_647_;
			    i_644_ += anInt9922 * i_647_;
			    i_642_ += i_647_;
			}
			if ((i_647_ = (i_644_ - anInt9922) / anInt9922)
			    > i_645_)
			    i_645_ = i_647_;
			int i_648_ = is[i_641_] - i;
			int i_649_ = -is_538_[i_641_];
			int i_650_ = i_648_ - (i_642_ - anInt9925);
			if (i_650_ > 0) {
			    i_642_ += i_650_;
			    i_645_ += i_650_;
			    i_643_ += anInt9921 * i_650_;
			    i_644_ += anInt9922 * i_650_;
			} else
			    i_649_ -= i_650_;
			if (i_645_ < i_649_)
			    i_645_ = i_649_;
			for (/**/; i_645_ < 0; i_645_++) {
			    int i_651_
				= (((Class168_Sub2_Sub2) this).anIntArray11124
				   [(((i_644_ >> 12)
				      * ((Class168_Sub2_Sub2) this).anInt9920)
				     + (i_643_ >> 12))]);
			    int i_652_ = i_651_ >>> 24;
			    int i_653_ = 256 - i_652_;
			    int i_654_ = is_540_[i_642_];
			    is_540_[i_642_++]
				= ((((i_651_ & 0xff00ff) * i_652_
				     + (i_654_ & 0xff00ff) * i_653_)
				    & ~0xff00ff)
				   + (((i_651_ & 0xff00) * i_652_
				       + (i_654_ & 0xff00) * i_653_)
				      & 0xff0000)) >> 8;
			    i_643_ += anInt9921;
			    i_644_ += anInt9922;
			}
		    }
		    i_640_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		int i_655_ = anInt9919;
		while (i_655_ < 0) {
		    int i_656_ = i_655_ + i_539_;
		    if (i_656_ >= 0) {
			if (i_656_ >= is.length)
			    break;
			int i_657_ = anInt9925;
			int i_658_ = anInt9927 + anInt9929;
			int i_659_ = anInt9928 + anInt9930;
			int i_660_ = anInt9906;
			if (i_658_ < 0) {
			    int i_661_ = (anInt9921 - 1 - i_658_) / anInt9921;
			    i_660_ += i_661_;
			    i_658_ += anInt9921 * i_661_;
			    i_659_ += anInt9922 * i_661_;
			    i_657_ += i_661_;
			}
			int i_662_;
			if ((i_662_
			     = (1 + i_658_
				- (((Class168_Sub2_Sub2) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_660_)
			    i_660_ = i_662_;
			if (i_659_ < 0) {
			    i_662_ = (anInt9922 - 1 - i_659_) / anInt9922;
			    i_660_ += i_662_;
			    i_658_ += anInt9921 * i_662_;
			    i_659_ += anInt9922 * i_662_;
			    i_657_ += i_662_;
			}
			if ((i_662_
			     = (1 + i_659_
				- (((Class168_Sub2_Sub2) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_660_)
			    i_660_ = i_662_;
			int i_663_ = is[i_656_] - i;
			int i_664_ = -is_538_[i_656_];
			int i_665_ = i_663_ - (i_657_ - anInt9925);
			if (i_665_ > 0) {
			    i_657_ += i_665_;
			    i_660_ += i_665_;
			    i_658_ += anInt9921 * i_665_;
			    i_659_ += anInt9922 * i_665_;
			} else
			    i_664_ -= i_665_;
			if (i_660_ < i_664_)
			    i_660_ = i_664_;
			for (/**/; i_660_ < 0; i_660_++) {
			    int i_666_
				= (((Class168_Sub2_Sub2) this).anIntArray11124
				   [(((i_659_ >> 12)
				      * ((Class168_Sub2_Sub2) this).anInt9920)
				     + (i_658_ >> 12))]);
			    int i_667_ = i_666_ >>> 24;
			    int i_668_ = 256 - i_667_;
			    int i_669_ = is_540_[i_657_];
			    is_540_[i_657_++]
				= ((((i_666_ & 0xff00ff) * i_667_
				     + (i_669_ & 0xff00ff) * i_668_)
				    & ~0xff00ff)
				   + (((i_666_ & 0xff00) * i_667_
				       + (i_669_ & 0xff00) * i_668_)
				      & 0xff0000)) >> 8;
			    i_658_ += anInt9921;
			    i_659_ += anInt9922;
			}
		    }
		    i_655_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    void method17537(int i, int i_670_, int[] is, int i_671_, int i_672_) {
	if (i_672_ == 0) {
	    if (i_671_ == 1)
		is[i_670_] = ((Class168_Sub2_Sub2) this).anIntArray11124[i];
	    else if (i_671_ == 0) {
		int i_673_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i++];
		int i_674_ = (i_673_ & 0xff0000) * anInt9934 & ~0xffffff;
		int i_675_ = (i_673_ & 0xff00) * anInt9913 & 0xff0000;
		int i_676_ = (i_673_ & 0xff) * anInt9936 & 0xff00;
		is[i_670_] = (i_674_ | i_675_ | i_676_) >>> 8;
	    } else if (i_671_ == 3) {
		int i_677_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i++];
		int i_678_ = anInt9931;
		int i_679_ = i_677_ + i_678_;
		int i_680_ = (i_677_ & 0xff00ff) + (i_678_ & 0xff00ff);
		int i_681_
		    = (i_680_ & 0x1000100) + (i_679_ - i_680_ & 0x10000);
		is[i_670_] = i_679_ - i_681_ | i_681_ - (i_681_ >>> 8);
	    } else if (i_671_ == 2) {
		int i_682_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i];
		int i_683_ = (i_682_ & 0xff00ff) * anInt9932 & ~0xff00ff;
		int i_684_ = (i_682_ & 0xff00) * anInt9932 & 0xff0000;
		is[i_670_] = ((i_683_ | i_684_) >>> 8) + anInt9939;
	    } else
		throw new IllegalArgumentException();
	} else if (i_672_ == 1) {
	    if (i_671_ == 1) {
		int i_685_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i];
		int i_686_ = i_685_ >>> 24;
		int i_687_ = 256 - i_686_;
		int i_688_ = is[i_670_];
		is[i_670_] = ((((i_685_ & 0xff00ff) * i_686_
				+ (i_688_ & 0xff00ff) * i_687_)
			       & ~0xff00ff)
			      + (((i_685_ & 0xff00) * i_686_
				  + (i_688_ & 0xff00) * i_687_)
				 & 0xff0000)) >> 8;
	    } else if (i_671_ == 0) {
		int i_689_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i];
		int i_690_ = (i_689_ >>> 24) * anInt9932 >> 8;
		int i_691_ = 256 - i_690_;
		if ((anInt9931 & 0xffffff) == 16777215) {
		    int i_692_ = is[i_670_];
		    is[i_670_] = ((((i_689_ & 0xff00ff) * i_690_
				    + (i_692_ & 0xff00ff) * i_691_)
				   & ~0xff00ff)
				  + (((i_689_ & 0xff00) * i_690_
				      + (i_692_ & 0xff00) * i_691_)
				     & 0xff0000)) >> 8;
		} else if (i_690_ != 255) {
		    int i_693_ = (i_689_ & 0xff0000) * anInt9934 & ~0xffffff;
		    int i_694_ = (i_689_ & 0xff00) * anInt9913 & 0xff0000;
		    int i_695_ = (i_689_ & 0xff) * anInt9936 & 0xff00;
		    i_689_ = (i_693_ | i_694_ | i_695_) >>> 8;
		    int i_696_ = is[i_670_];
		    is[i_670_] = ((((i_689_ & 0xff00ff) * i_690_
				    + (i_696_ & 0xff00ff) * i_691_)
				   & ~0xff00ff)
				  + (((i_689_ & 0xff00) * i_690_
				      + (i_696_ & 0xff00) * i_691_)
				     & 0xff0000)) >> 8;
		} else {
		    int i_697_ = (i_689_ & 0xff0000) * anInt9934 & ~0xffffff;
		    int i_698_ = (i_689_ & 0xff00) * anInt9913 & 0xff0000;
		    int i_699_ = (i_689_ & 0xff) * anInt9936 & 0xff00;
		    is[i_670_] = (i_697_ | i_698_ | i_699_) >>> 8;
		}
	    } else if (i_671_ == 3) {
		int i_700_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i];
		int i_701_ = anInt9931;
		int i_702_ = i_700_ + i_701_;
		int i_703_ = (i_700_ & 0xff00ff) + (i_701_ & 0xff00ff);
		int i_704_
		    = (i_703_ & 0x1000100) + (i_702_ - i_703_ & 0x10000);
		i_704_ = i_702_ - i_704_ | i_704_ - (i_704_ >>> 8);
		int i_705_ = (i_700_ >>> 24) * anInt9932 >> 8;
		int i_706_ = 256 - i_705_;
		if (i_705_ != 255) {
		    i_700_ = i_704_;
		    i_704_ = is[i_670_];
		    i_704_ = ((((i_700_ & 0xff00ff) * i_705_
				+ (i_704_ & 0xff00ff) * i_706_)
			       & ~0xff00ff)
			      + (((i_700_ & 0xff00) * i_705_
				  + (i_704_ & 0xff00) * i_706_)
				 & 0xff0000)) >> 8;
		}
		is[i_670_] = i_704_;
	    } else if (i_671_ == 2) {
		int i_707_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i];
		int i_708_ = i_707_ >>> 24;
		int i_709_ = 256 - i_708_;
		int i_710_ = (i_707_ & 0xff00ff) * anInt9932 & ~0xff00ff;
		int i_711_ = (i_707_ & 0xff00) * anInt9932 & 0xff0000;
		i_707_ = ((i_710_ | i_711_) >>> 8) + anInt9939;
		int i_712_ = is[i_670_];
		is[i_670_] = ((((i_707_ & 0xff00ff) * i_708_
				+ (i_712_ & 0xff00ff) * i_709_)
			       & ~0xff00ff)
			      + (((i_707_ & 0xff00) * i_708_
				  + (i_712_ & 0xff00) * i_709_)
				 & 0xff0000)) >> 8;
	    } else
		throw new IllegalArgumentException();
	} else if (i_672_ == 2) {
	    if (i_671_ == 1) {
		int i_713_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i];
		int i_714_ = is[i_670_];
		int i_715_ = i_713_ + i_714_;
		int i_716_ = (i_713_ & 0xff00ff) + (i_714_ & 0xff00ff);
		i_714_ = (i_716_ & 0x1000100) + (i_715_ - i_716_ & 0x10000);
		is[i_670_] = i_715_ - i_714_ | i_714_ - (i_714_ >>> 8);
	    } else if (i_671_ == 0) {
		int i_717_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i];
		int i_718_ = (i_717_ & 0xff0000) * anInt9934 & ~0xffffff;
		int i_719_ = (i_717_ & 0xff00) * anInt9913 & 0xff0000;
		int i_720_ = (i_717_ & 0xff) * anInt9936 & 0xff00;
		i_717_ = (i_718_ | i_719_ | i_720_) >>> 8;
		int i_721_ = is[i_670_];
		int i_722_ = i_717_ + i_721_;
		int i_723_ = (i_717_ & 0xff00ff) + (i_721_ & 0xff00ff);
		i_721_ = (i_723_ & 0x1000100) + (i_722_ - i_723_ & 0x10000);
		is[i_670_] = i_722_ - i_721_ | i_721_ - (i_721_ >>> 8);
	    } else if (i_671_ == 3) {
		int i_724_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i];
		int i_725_ = anInt9931;
		int i_726_ = i_724_ + i_725_;
		int i_727_ = (i_724_ & 0xff00ff) + (i_725_ & 0xff00ff);
		int i_728_
		    = (i_727_ & 0x1000100) + (i_726_ - i_727_ & 0x10000);
		i_724_ = i_726_ - i_728_ | i_728_ - (i_728_ >>> 8);
		i_728_ = is[i_670_];
		i_726_ = i_724_ + i_728_;
		i_727_ = (i_724_ & 0xff00ff) + (i_728_ & 0xff00ff);
		i_728_ = (i_727_ & 0x1000100) + (i_726_ - i_727_ & 0x10000);
		is[i_670_] = i_726_ - i_728_ | i_728_ - (i_728_ >>> 8);
	    } else if (i_671_ == 2) {
		int i_729_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i];
		int i_730_ = (i_729_ & 0xff00ff) * anInt9932 & ~0xff00ff;
		int i_731_ = (i_729_ & 0xff00) * anInt9932 & 0xff0000;
		i_729_ = ((i_730_ | i_731_) >>> 8) + anInt9939;
		int i_732_ = is[i_670_];
		int i_733_ = i_729_ + i_732_;
		int i_734_ = (i_729_ & 0xff00ff) + (i_732_ & 0xff00ff);
		i_732_ = (i_734_ & 0x1000100) + (i_733_ - i_734_ & 0x10000);
		is[i_670_] = i_733_ - i_732_ | i_732_ - (i_732_ >>> 8);
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    public void method3666(int i, int i_735_, int i_736_, int i_737_,
			   int i_738_) {
	if (((Class168_Sub2_Sub2) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    int i_739_ = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					    .aClass103_Sub2_9904)).anInt9260
			  * -1826993761);
	    i += ((Class168_Sub2_Sub2) this).anInt9907;
	    i_735_ += ((Class168_Sub2_Sub2) this).anInt9905;
	    int i_740_ = i_735_ * i_739_ + i;
	    int i_741_ = 0;
	    int i_742_ = ((Class168_Sub2_Sub2) this).anInt9916;
	    int i_743_ = ((Class168_Sub2_Sub2) this).anInt9920;
	    int i_744_ = i_739_ - i_743_;
	    int i_745_ = 0;
	    if (i_735_ < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					    .aClass103_Sub2_9904)).anInt9254
			  * -788450385)) {
		int i_746_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9254) * -788450385
			      - i_735_);
		i_742_ -= i_746_;
		i_735_ = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					    .aClass103_Sub2_9904)).anInt9254
			  * -788450385);
		i_741_ += i_746_ * i_743_;
		i_740_ += i_746_ * i_739_;
	    }
	    if (i_735_ + i_742_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_742_ -= (i_735_ + i_742_
			   - (((Class103_Sub2)
			       ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			      .anInt9252) * 1546170165);
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_747_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9249) * 1298750001
			      - i);
		i_743_ -= i_747_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_741_ += i_747_;
		i_740_ += i_747_;
		i_745_ += i_747_;
		i_744_ += i_747_;
	    }
	    if (i + i_743_ > (((Class103_Sub2)
			       ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			      .anInt9250) * 325436811) {
		int i_748_ = (i + i_743_
			      - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						   .aClass103_Sub2_9904))
				 .anInt9250) * 325436811);
		i_743_ -= i_748_;
		i_745_ += i_748_;
		i_744_ += i_748_;
	    }
	    if (i_743_ > 0 && i_742_ > 0) {
		if (i_738_ == 0) {
		    if (i_736_ == 1) {
			for (int i_749_ = -i_742_; i_749_ < 0; i_749_++) {
			    int i_750_ = i_740_ + i_743_ - 3;
			    while (i_740_ < i_750_) {
				is[i_740_++] = (((Class168_Sub2_Sub2) this)
						.anIntArray11124[i_741_++]);
				is[i_740_++] = (((Class168_Sub2_Sub2) this)
						.anIntArray11124[i_741_++]);
				is[i_740_++] = (((Class168_Sub2_Sub2) this)
						.anIntArray11124[i_741_++]);
				is[i_740_++] = (((Class168_Sub2_Sub2) this)
						.anIntArray11124[i_741_++]);
			    }
			    i_750_ += 3;
			    while (i_740_ < i_750_)
				is[i_740_++] = (((Class168_Sub2_Sub2) this)
						.anIntArray11124[i_741_++]);
			    i_740_ += i_744_;
			    i_741_ += i_745_;
			}
		    } else if (i_736_ == 0) {
			int i_751_ = (i_737_ & 0xff0000) >> 16;
			int i_752_ = (i_737_ & 0xff00) >> 8;
			int i_753_ = i_737_ & 0xff;
			for (int i_754_ = -i_742_; i_754_ < 0; i_754_++) {
			    for (int i_755_ = -i_743_; i_755_ < 0; i_755_++) {
				int i_756_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_741_++]);
				int i_757_
				    = (i_756_ & 0xff0000) * i_751_ & ~0xffffff;
				int i_758_
				    = (i_756_ & 0xff00) * i_752_ & 0xff0000;
				int i_759_ = (i_756_ & 0xff) * i_753_ & 0xff00;
				is[i_740_++]
				    = (i_757_ | i_758_ | i_759_) >>> 8;
			    }
			    i_740_ += i_744_;
			    i_741_ += i_745_;
			}
		    } else if (i_736_ == 3) {
			for (int i_760_ = -i_742_; i_760_ < 0; i_760_++) {
			    for (int i_761_ = -i_743_; i_761_ < 0; i_761_++) {
				int i_762_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_741_++]);
				int i_763_ = i_762_ + i_737_;
				int i_764_ = ((i_762_ & 0xff00ff)
					      + (i_737_ & 0xff00ff));
				int i_765_ = ((i_764_ & 0x1000100)
					      + (i_763_ - i_764_ & 0x10000));
				is[i_740_++]
				    = i_763_ - i_765_ | i_765_ - (i_765_
								  >>> 8);
			    }
			    i_740_ += i_744_;
			    i_741_ += i_745_;
			}
		    } else if (i_736_ == 2) {
			int i_766_ = i_737_ >>> 24;
			int i_767_ = 256 - i_766_;
			int i_768_ = (i_737_ & 0xff00ff) * i_767_ & ~0xff00ff;
			int i_769_ = (i_737_ & 0xff00) * i_767_ & 0xff0000;
			i_737_ = (i_768_ | i_769_) >>> 8;
			for (int i_770_ = -i_742_; i_770_ < 0; i_770_++) {
			    for (int i_771_ = -i_743_; i_771_ < 0; i_771_++) {
				int i_772_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_741_++]);
				i_768_
				    = (i_772_ & 0xff00ff) * i_766_ & ~0xff00ff;
				i_769_ = (i_772_ & 0xff00) * i_766_ & 0xff0000;
				is[i_740_++]
				    = ((i_768_ | i_769_) >>> 8) + i_737_;
			    }
			    i_740_ += i_744_;
			    i_741_ += i_745_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_738_ == 1) {
		    if (i_736_ == 1) {
			for (int i_773_ = -i_742_; i_773_ < 0; i_773_++) {
			    for (int i_774_ = -i_743_; i_774_ < 0; i_774_++) {
				int i_775_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_741_++]);
				int i_776_ = i_775_ >>> 24;
				int i_777_ = 256 - i_776_;
				int i_778_ = is[i_740_];
				is[i_740_++]
				    = (((((i_775_ & 0xff00ff) * i_776_
					  + (i_778_ & 0xff00ff) * i_777_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_775_ & ~0xff00ff) >>> 8)
					    * i_776_)
					   + (((i_778_ & ~0xff00ff) >>> 8)
					      * i_777_))
					  & ~0xff00ff));
			    }
			    i_740_ += i_744_;
			    i_741_ += i_745_;
			}
		    } else if (i_736_ == 0) {
			if ((i_737_ & 0xffffff) == 16777215) {
			    for (int i_779_ = -i_742_; i_779_ < 0; i_779_++) {
				for (int i_780_ = -i_743_; i_780_ < 0;
				     i_780_++) {
				    int i_781_ = (((Class168_Sub2_Sub2) this)
						  .anIntArray11124[i_741_++]);
				    int i_782_
					= ((i_781_ >>> 24) * (i_737_ >>> 24)
					   >> 8);
				    int i_783_ = 256 - i_782_;
				    int i_784_ = is[i_740_];
				    is[i_740_++]
					= ((((i_781_ & 0xff00ff) * i_782_
					     + (i_784_ & 0xff00ff) * i_783_)
					    & ~0xff00ff)
					   + (((i_781_ & 0xff00) * i_782_
					       + (i_784_ & 0xff00) * i_783_)
					      & 0xff0000)) >> 8;
				}
				i_740_ += i_744_;
				i_741_ += i_745_;
			    }
			} else {
			    int i_785_ = (i_737_ & 0xff0000) >> 16;
			    int i_786_ = (i_737_ & 0xff00) >> 8;
			    int i_787_ = i_737_ & 0xff;
			    for (int i_788_ = -i_742_; i_788_ < 0; i_788_++) {
				for (int i_789_ = -i_743_; i_789_ < 0;
				     i_789_++) {
				    int i_790_ = (((Class168_Sub2_Sub2) this)
						  .anIntArray11124[i_741_++]);
				    int i_791_
					= ((i_790_ >>> 24) * (i_737_ >>> 24)
					   >> 8);
				    int i_792_ = 256 - i_791_;
				    if (i_791_ != 255) {
					int i_793_
					    = ((i_790_ & 0xff0000) * i_785_
					       & ~0xffffff);
					int i_794_
					    = ((i_790_ & 0xff00) * i_786_
					       & 0xff0000);
					int i_795_ = ((i_790_ & 0xff) * i_787_
						      & 0xff00);
					i_790_
					    = (i_793_ | i_794_ | i_795_) >>> 8;
					int i_796_ = is[i_740_];
					is[i_740_++]
					    = ((((i_790_ & 0xff00ff) * i_791_
						 + ((i_796_ & 0xff00ff)
						    * i_792_))
						& ~0xff00ff)
					       + (((i_790_ & 0xff00) * i_791_
						   + ((i_796_ & 0xff00)
						      * i_792_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_797_
					    = ((i_790_ & 0xff0000) * i_785_
					       & ~0xffffff);
					int i_798_
					    = ((i_790_ & 0xff00) * i_786_
					       & 0xff0000);
					int i_799_ = ((i_790_ & 0xff) * i_787_
						      & 0xff00);
					is[i_740_++]
					    = (i_797_ | i_798_ | i_799_) >>> 8;
				    }
				}
				i_740_ += i_744_;
				i_741_ += i_745_;
			    }
			}
		    } else if (i_736_ == 3) {
			for (int i_800_ = -i_742_; i_800_ < 0; i_800_++) {
			    for (int i_801_ = -i_743_; i_801_ < 0; i_801_++) {
				int i_802_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_741_++]);
				int i_803_ = i_802_ + i_737_;
				int i_804_ = ((i_802_ & 0xff00ff)
					      + (i_737_ & 0xff00ff));
				int i_805_ = ((i_804_ & 0x1000100)
					      + (i_803_ - i_804_ & 0x10000));
				i_805_ = i_803_ - i_805_ | i_805_ - (i_805_
								     >>> 8);
				int i_806_
				    = (i_805_ >>> 24) * (i_737_ >>> 24) >> 8;
				int i_807_ = 256 - i_806_;
				if (i_806_ != 255) {
				    i_802_ = i_805_;
				    i_805_ = is[i_740_];
				    i_805_ = ((((i_802_ & 0xff00ff) * i_806_
						+ (i_805_ & 0xff00ff) * i_807_)
					       & ~0xff00ff)
					      + (((i_802_ & 0xff00) * i_806_
						  + (i_805_ & 0xff00) * i_807_)
						 & 0xff0000)) >> 8;
				}
				is[i_740_++] = i_805_;
			    }
			    i_740_ += i_744_;
			    i_741_ += i_745_;
			}
		    } else if (i_736_ == 2) {
			int i_808_ = i_737_ >>> 24;
			int i_809_ = 256 - i_808_;
			int i_810_ = (i_737_ & 0xff00ff) * i_809_ & ~0xff00ff;
			int i_811_ = (i_737_ & 0xff00) * i_809_ & 0xff0000;
			i_737_ = (i_810_ | i_811_) >>> 8;
			for (int i_812_ = -i_742_; i_812_ < 0; i_812_++) {
			    for (int i_813_ = -i_743_; i_813_ < 0; i_813_++) {
				int i_814_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_741_++]);
				int i_815_ = i_814_ >>> 24;
				int i_816_ = 256 - i_815_;
				i_810_
				    = (i_814_ & 0xff00ff) * i_808_ & ~0xff00ff;
				i_811_ = (i_814_ & 0xff00) * i_808_ & 0xff0000;
				i_814_ = ((i_810_ | i_811_) >>> 8) + i_737_;
				int i_817_ = is[i_740_];
				is[i_740_++]
				    = ((((i_814_ & 0xff00ff) * i_815_
					 + (i_817_ & 0xff00ff) * i_816_)
					& ~0xff00ff)
				       + (((i_814_ & 0xff00) * i_815_
					   + (i_817_ & 0xff00) * i_816_)
					  & 0xff0000)) >> 8;
			    }
			    i_740_ += i_744_;
			    i_741_ += i_745_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_738_ == 2) {
		    if (i_736_ == 1) {
			for (int i_818_ = -i_742_; i_818_ < 0; i_818_++) {
			    for (int i_819_ = -i_743_; i_819_ < 0; i_819_++) {
				int i_820_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_741_++]);
				if (i_820_ != 0) {
				    int i_821_ = is[i_740_];
				    int i_822_ = i_820_ + i_821_;
				    int i_823_ = ((i_820_ & 0xff00ff)
						  + (i_821_ & 0xff00ff));
				    i_821_ = ((i_823_ & 0x1000100)
					      + (i_822_ - i_823_ & 0x10000));
				    is[i_740_++]
					= i_822_ - i_821_ | i_821_ - (i_821_
								      >>> 8);
				} else
				    i_740_++;
			    }
			    i_740_ += i_744_;
			    i_741_ += i_745_;
			}
		    } else if (i_736_ == 0) {
			int i_824_ = (i_737_ & 0xff0000) >> 16;
			int i_825_ = (i_737_ & 0xff00) >> 8;
			int i_826_ = i_737_ & 0xff;
			for (int i_827_ = -i_742_; i_827_ < 0; i_827_++) {
			    for (int i_828_ = -i_743_; i_828_ < 0; i_828_++) {
				int i_829_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_741_++]);
				if (i_829_ != 0) {
				    int i_830_ = ((i_829_ & 0xff0000) * i_824_
						  & ~0xffffff);
				    int i_831_ = ((i_829_ & 0xff00) * i_825_
						  & 0xff0000);
				    int i_832_
					= (i_829_ & 0xff) * i_826_ & 0xff00;
				    i_829_ = (i_830_ | i_831_ | i_832_) >>> 8;
				    int i_833_ = is[i_740_];
				    int i_834_ = i_829_ + i_833_;
				    int i_835_ = ((i_829_ & 0xff00ff)
						  + (i_833_ & 0xff00ff));
				    i_833_ = ((i_835_ & 0x1000100)
					      + (i_834_ - i_835_ & 0x10000));
				    is[i_740_++]
					= i_834_ - i_833_ | i_833_ - (i_833_
								      >>> 8);
				} else
				    i_740_++;
			    }
			    i_740_ += i_744_;
			    i_741_ += i_745_;
			}
		    } else if (i_736_ == 3) {
			for (int i_836_ = -i_742_; i_836_ < 0; i_836_++) {
			    for (int i_837_ = -i_743_; i_837_ < 0; i_837_++) {
				int i_838_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_741_++]);
				int i_839_ = i_838_ + i_737_;
				int i_840_ = ((i_838_ & 0xff00ff)
					      + (i_737_ & 0xff00ff));
				int i_841_ = ((i_840_ & 0x1000100)
					      + (i_839_ - i_840_ & 0x10000));
				i_838_ = i_839_ - i_841_ | i_841_ - (i_841_
								     >>> 8);
				i_841_ = is[i_740_];
				i_839_ = i_838_ + i_841_;
				i_840_ = (i_838_ & 0xff00ff) + (i_841_
								& 0xff00ff);
				i_841_
				    = (i_840_ & 0x1000100) + (i_839_ - i_840_
							      & 0x10000);
				is[i_740_++]
				    = i_839_ - i_841_ | i_841_ - (i_841_
								  >>> 8);
			    }
			    i_740_ += i_744_;
			    i_741_ += i_745_;
			}
		    } else if (i_736_ == 2) {
			int i_842_ = i_737_ >>> 24;
			int i_843_ = 256 - i_842_;
			int i_844_ = (i_737_ & 0xff00ff) * i_843_ & ~0xff00ff;
			int i_845_ = (i_737_ & 0xff00) * i_843_ & 0xff0000;
			i_737_ = (i_844_ | i_845_) >>> 8;
			for (int i_846_ = -i_742_; i_846_ < 0; i_846_++) {
			    for (int i_847_ = -i_743_; i_847_ < 0; i_847_++) {
				int i_848_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_741_++]);
				if (i_848_ != 0) {
				    i_844_ = ((i_848_ & 0xff00ff) * i_842_
					      & ~0xff00ff);
				    i_845_ = ((i_848_ & 0xff00) * i_842_
					      & 0xff0000);
				    i_848_
					= ((i_844_ | i_845_) >>> 8) + i_737_;
				    int i_849_ = is[i_740_];
				    int i_850_ = i_848_ + i_849_;
				    int i_851_ = ((i_848_ & 0xff00ff)
						  + (i_849_ & 0xff00ff));
				    i_849_ = ((i_851_ & 0x1000100)
					      + (i_850_ - i_851_ & 0x10000));
				    is[i_740_++]
					= i_850_ - i_849_ | i_849_ - (i_849_
								      >>> 8);
				} else
				    i_740_++;
			    }
			    i_740_ += i_744_;
			    i_741_ += i_745_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method17538(int i, int i_852_, int[] is, int i_853_, int i_854_) {
	if (i_854_ == 0) {
	    if (i_853_ == 1)
		is[i_852_] = ((Class168_Sub2_Sub2) this).anIntArray11124[i];
	    else if (i_853_ == 0) {
		int i_855_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i++];
		int i_856_ = (i_855_ & 0xff0000) * anInt9934 & ~0xffffff;
		int i_857_ = (i_855_ & 0xff00) * anInt9913 & 0xff0000;
		int i_858_ = (i_855_ & 0xff) * anInt9936 & 0xff00;
		is[i_852_] = (i_856_ | i_857_ | i_858_) >>> 8;
	    } else if (i_853_ == 3) {
		int i_859_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i++];
		int i_860_ = anInt9931;
		int i_861_ = i_859_ + i_860_;
		int i_862_ = (i_859_ & 0xff00ff) + (i_860_ & 0xff00ff);
		int i_863_
		    = (i_862_ & 0x1000100) + (i_861_ - i_862_ & 0x10000);
		is[i_852_] = i_861_ - i_863_ | i_863_ - (i_863_ >>> 8);
	    } else if (i_853_ == 2) {
		int i_864_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i];
		int i_865_ = (i_864_ & 0xff00ff) * anInt9932 & ~0xff00ff;
		int i_866_ = (i_864_ & 0xff00) * anInt9932 & 0xff0000;
		is[i_852_] = ((i_865_ | i_866_) >>> 8) + anInt9939;
	    } else
		throw new IllegalArgumentException();
	} else if (i_854_ == 1) {
	    if (i_853_ == 1) {
		int i_867_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i];
		int i_868_ = i_867_ >>> 24;
		int i_869_ = 256 - i_868_;
		int i_870_ = is[i_852_];
		is[i_852_] = ((((i_867_ & 0xff00ff) * i_868_
				+ (i_870_ & 0xff00ff) * i_869_)
			       & ~0xff00ff)
			      + (((i_867_ & 0xff00) * i_868_
				  + (i_870_ & 0xff00) * i_869_)
				 & 0xff0000)) >> 8;
	    } else if (i_853_ == 0) {
		int i_871_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i];
		int i_872_ = (i_871_ >>> 24) * anInt9932 >> 8;
		int i_873_ = 256 - i_872_;
		if ((anInt9931 & 0xffffff) == 16777215) {
		    int i_874_ = is[i_852_];
		    is[i_852_] = ((((i_871_ & 0xff00ff) * i_872_
				    + (i_874_ & 0xff00ff) * i_873_)
				   & ~0xff00ff)
				  + (((i_871_ & 0xff00) * i_872_
				      + (i_874_ & 0xff00) * i_873_)
				     & 0xff0000)) >> 8;
		} else if (i_872_ != 255) {
		    int i_875_ = (i_871_ & 0xff0000) * anInt9934 & ~0xffffff;
		    int i_876_ = (i_871_ & 0xff00) * anInt9913 & 0xff0000;
		    int i_877_ = (i_871_ & 0xff) * anInt9936 & 0xff00;
		    i_871_ = (i_875_ | i_876_ | i_877_) >>> 8;
		    int i_878_ = is[i_852_];
		    is[i_852_] = ((((i_871_ & 0xff00ff) * i_872_
				    + (i_878_ & 0xff00ff) * i_873_)
				   & ~0xff00ff)
				  + (((i_871_ & 0xff00) * i_872_
				      + (i_878_ & 0xff00) * i_873_)
				     & 0xff0000)) >> 8;
		} else {
		    int i_879_ = (i_871_ & 0xff0000) * anInt9934 & ~0xffffff;
		    int i_880_ = (i_871_ & 0xff00) * anInt9913 & 0xff0000;
		    int i_881_ = (i_871_ & 0xff) * anInt9936 & 0xff00;
		    is[i_852_] = (i_879_ | i_880_ | i_881_) >>> 8;
		}
	    } else if (i_853_ == 3) {
		int i_882_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i];
		int i_883_ = anInt9931;
		int i_884_ = i_882_ + i_883_;
		int i_885_ = (i_882_ & 0xff00ff) + (i_883_ & 0xff00ff);
		int i_886_
		    = (i_885_ & 0x1000100) + (i_884_ - i_885_ & 0x10000);
		i_886_ = i_884_ - i_886_ | i_886_ - (i_886_ >>> 8);
		int i_887_ = (i_882_ >>> 24) * anInt9932 >> 8;
		int i_888_ = 256 - i_887_;
		if (i_887_ != 255) {
		    i_882_ = i_886_;
		    i_886_ = is[i_852_];
		    i_886_ = ((((i_882_ & 0xff00ff) * i_887_
				+ (i_886_ & 0xff00ff) * i_888_)
			       & ~0xff00ff)
			      + (((i_882_ & 0xff00) * i_887_
				  + (i_886_ & 0xff00) * i_888_)
				 & 0xff0000)) >> 8;
		}
		is[i_852_] = i_886_;
	    } else if (i_853_ == 2) {
		int i_889_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i];
		int i_890_ = i_889_ >>> 24;
		int i_891_ = 256 - i_890_;
		int i_892_ = (i_889_ & 0xff00ff) * anInt9932 & ~0xff00ff;
		int i_893_ = (i_889_ & 0xff00) * anInt9932 & 0xff0000;
		i_889_ = ((i_892_ | i_893_) >>> 8) + anInt9939;
		int i_894_ = is[i_852_];
		is[i_852_] = ((((i_889_ & 0xff00ff) * i_890_
				+ (i_894_ & 0xff00ff) * i_891_)
			       & ~0xff00ff)
			      + (((i_889_ & 0xff00) * i_890_
				  + (i_894_ & 0xff00) * i_891_)
				 & 0xff0000)) >> 8;
	    } else
		throw new IllegalArgumentException();
	} else if (i_854_ == 2) {
	    if (i_853_ == 1) {
		int i_895_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i];
		int i_896_ = is[i_852_];
		int i_897_ = i_895_ + i_896_;
		int i_898_ = (i_895_ & 0xff00ff) + (i_896_ & 0xff00ff);
		i_896_ = (i_898_ & 0x1000100) + (i_897_ - i_898_ & 0x10000);
		is[i_852_] = i_897_ - i_896_ | i_896_ - (i_896_ >>> 8);
	    } else if (i_853_ == 0) {
		int i_899_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i];
		int i_900_ = (i_899_ & 0xff0000) * anInt9934 & ~0xffffff;
		int i_901_ = (i_899_ & 0xff00) * anInt9913 & 0xff0000;
		int i_902_ = (i_899_ & 0xff) * anInt9936 & 0xff00;
		i_899_ = (i_900_ | i_901_ | i_902_) >>> 8;
		int i_903_ = is[i_852_];
		int i_904_ = i_899_ + i_903_;
		int i_905_ = (i_899_ & 0xff00ff) + (i_903_ & 0xff00ff);
		i_903_ = (i_905_ & 0x1000100) + (i_904_ - i_905_ & 0x10000);
		is[i_852_] = i_904_ - i_903_ | i_903_ - (i_903_ >>> 8);
	    } else if (i_853_ == 3) {
		int i_906_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i];
		int i_907_ = anInt9931;
		int i_908_ = i_906_ + i_907_;
		int i_909_ = (i_906_ & 0xff00ff) + (i_907_ & 0xff00ff);
		int i_910_
		    = (i_909_ & 0x1000100) + (i_908_ - i_909_ & 0x10000);
		i_906_ = i_908_ - i_910_ | i_910_ - (i_910_ >>> 8);
		i_910_ = is[i_852_];
		i_908_ = i_906_ + i_910_;
		i_909_ = (i_906_ & 0xff00ff) + (i_910_ & 0xff00ff);
		i_910_ = (i_909_ & 0x1000100) + (i_908_ - i_909_ & 0x10000);
		is[i_852_] = i_908_ - i_910_ | i_910_ - (i_910_ >>> 8);
	    } else if (i_853_ == 2) {
		int i_911_ = ((Class168_Sub2_Sub2) this).anIntArray11124[i];
		int i_912_ = (i_911_ & 0xff00ff) * anInt9932 & ~0xff00ff;
		int i_913_ = (i_911_ & 0xff00) * anInt9932 & 0xff0000;
		i_911_ = ((i_912_ | i_913_) >>> 8) + anInt9939;
		int i_914_ = is[i_852_];
		int i_915_ = i_911_ + i_914_;
		int i_916_ = (i_911_ & 0xff00ff) + (i_914_ & 0xff00ff);
		i_914_ = (i_916_ & 0x1000100) + (i_915_ - i_916_ & 0x10000);
		is[i_852_] = i_915_ - i_914_ | i_914_ - (i_914_ >>> 8);
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    public void method3639(int i, int i_917_, int i_918_, int i_919_,
			   int i_920_, int i_921_) {
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_922_ = 0; i_922_ < i_919_; i_922_++) {
	    int i_923_ = (i_917_ + i_922_) * i_918_ + i;
	    int i_924_ = (i_921_ + i_922_) * i_918_ + i_920_;
	    for (int i_925_ = 0; i_925_ < i_918_; i_925_++)
		((Class168_Sub2_Sub2) this).anIntArray11124[i_923_ + i_925_]
		    = is[i_924_ + i_925_] & 0xffffff;
	}
    }
    
    public void method3630(int i, int i_926_, int i_927_) {
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is == null)
	    throw new IllegalStateException("");
	if (i_927_ == 0) {
	    for (int i_928_ = 0;
		 i_928_ < ((Class168_Sub2_Sub2) this).anInt9916; i_928_++) {
		int i_929_ = i_928_ * ((Class168_Sub2_Sub2) this).anInt9920;
		int i_930_
		    = (((i_926_ + i_928_)
			* (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761))
		       + i);
		for (int i_931_ = 0;
		     i_931_ < ((Class168_Sub2_Sub2) this).anInt9920; i_931_++)
		    ((Class168_Sub2_Sub2) this).anIntArray11124[(i_929_
								 + i_931_)]
			= ((((Class168_Sub2_Sub2) this).anIntArray11124
			    [i_929_ + i_931_]) & 0xffffff
			   | is[i_930_ + i_931_] << 8 & ~0xffffff);
	    }
	} else if (i_927_ == 1) {
	    for (int i_932_ = 0;
		 i_932_ < ((Class168_Sub2_Sub2) this).anInt9916; i_932_++) {
		int i_933_ = i_932_ * ((Class168_Sub2_Sub2) this).anInt9920;
		int i_934_
		    = (((i_926_ + i_932_)
			* (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761))
		       + i);
		for (int i_935_ = 0;
		     i_935_ < ((Class168_Sub2_Sub2) this).anInt9920; i_935_++)
		    ((Class168_Sub2_Sub2) this).anIntArray11124[(i_933_
								 + i_935_)]
			= ((((Class168_Sub2_Sub2) this).anIntArray11124
			    [i_933_ + i_935_]) & 0xffffff
			   | is[i_934_ + i_935_] << 16 & ~0xffffff);
	    }
	} else if (i_927_ == 2) {
	    for (int i_936_ = 0;
		 i_936_ < ((Class168_Sub2_Sub2) this).anInt9916; i_936_++) {
		int i_937_ = i_936_ * ((Class168_Sub2_Sub2) this).anInt9920;
		int i_938_
		    = (((i_926_ + i_936_)
			* (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761))
		       + i);
		for (int i_939_ = 0;
		     i_939_ < ((Class168_Sub2_Sub2) this).anInt9920; i_939_++)
		    ((Class168_Sub2_Sub2) this).anIntArray11124[(i_937_
								 + i_939_)]
			= ((((Class168_Sub2_Sub2) this).anIntArray11124
			    [i_937_ + i_939_]) & 0xffffff
			   | is[i_938_ + i_939_] << 24 & ~0xffffff);
	    }
	} else if (i_927_ == 3) {
	    for (int i_940_ = 0;
		 i_940_ < ((Class168_Sub2_Sub2) this).anInt9916; i_940_++) {
		int i_941_ = i_940_ * ((Class168_Sub2_Sub2) this).anInt9920;
		int i_942_
		    = (((i_926_ + i_940_)
			* (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761))
		       + i);
		for (int i_943_ = 0;
		     i_943_ < ((Class168_Sub2_Sub2) this).anInt9920; i_943_++)
		    ((Class168_Sub2_Sub2) this).anIntArray11124[(i_941_
								 + i_943_)]
			= ((((Class168_Sub2_Sub2) this).anIntArray11124
			    [i_941_ + i_943_]) & 0xffffff
			   | (is[i_942_ + i_943_] != 0 ? -16777216 : 0));
	    }
	}
    }
    
    public void method3653(int i, int i_944_, int i_945_) {
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is == null)
	    throw new IllegalStateException("");
	if (i_945_ == 0) {
	    for (int i_946_ = 0;
		 i_946_ < ((Class168_Sub2_Sub2) this).anInt9916; i_946_++) {
		int i_947_ = i_946_ * ((Class168_Sub2_Sub2) this).anInt9920;
		int i_948_
		    = (((i_944_ + i_946_)
			* (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761))
		       + i);
		for (int i_949_ = 0;
		     i_949_ < ((Class168_Sub2_Sub2) this).anInt9920; i_949_++)
		    ((Class168_Sub2_Sub2) this).anIntArray11124[(i_947_
								 + i_949_)]
			= ((((Class168_Sub2_Sub2) this).anIntArray11124
			    [i_947_ + i_949_]) & 0xffffff
			   | is[i_948_ + i_949_] << 8 & ~0xffffff);
	    }
	} else if (i_945_ == 1) {
	    for (int i_950_ = 0;
		 i_950_ < ((Class168_Sub2_Sub2) this).anInt9916; i_950_++) {
		int i_951_ = i_950_ * ((Class168_Sub2_Sub2) this).anInt9920;
		int i_952_
		    = (((i_944_ + i_950_)
			* (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761))
		       + i);
		for (int i_953_ = 0;
		     i_953_ < ((Class168_Sub2_Sub2) this).anInt9920; i_953_++)
		    ((Class168_Sub2_Sub2) this).anIntArray11124[(i_951_
								 + i_953_)]
			= ((((Class168_Sub2_Sub2) this).anIntArray11124
			    [i_951_ + i_953_]) & 0xffffff
			   | is[i_952_ + i_953_] << 16 & ~0xffffff);
	    }
	} else if (i_945_ == 2) {
	    for (int i_954_ = 0;
		 i_954_ < ((Class168_Sub2_Sub2) this).anInt9916; i_954_++) {
		int i_955_ = i_954_ * ((Class168_Sub2_Sub2) this).anInt9920;
		int i_956_
		    = (((i_944_ + i_954_)
			* (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761))
		       + i);
		for (int i_957_ = 0;
		     i_957_ < ((Class168_Sub2_Sub2) this).anInt9920; i_957_++)
		    ((Class168_Sub2_Sub2) this).anIntArray11124[(i_955_
								 + i_957_)]
			= ((((Class168_Sub2_Sub2) this).anIntArray11124
			    [i_955_ + i_957_]) & 0xffffff
			   | is[i_956_ + i_957_] << 24 & ~0xffffff);
	    }
	} else if (i_945_ == 3) {
	    for (int i_958_ = 0;
		 i_958_ < ((Class168_Sub2_Sub2) this).anInt9916; i_958_++) {
		int i_959_ = i_958_ * ((Class168_Sub2_Sub2) this).anInt9920;
		int i_960_
		    = (((i_944_ + i_958_)
			* (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761))
		       + i);
		for (int i_961_ = 0;
		     i_961_ < ((Class168_Sub2_Sub2) this).anInt9920; i_961_++)
		    ((Class168_Sub2_Sub2) this).anIntArray11124[(i_959_
								 + i_961_)]
			= ((((Class168_Sub2_Sub2) this).anIntArray11124
			    [i_959_ + i_961_]) & 0xffffff
			   | (is[i_960_ + i_961_] != 0 ? -16777216 : 0));
	    }
	}
    }
    
    public Interface4 method3636() {
	return new Class186(((Class168_Sub2_Sub2) this).anInt9920,
			    ((Class168_Sub2_Sub2) this).anInt9916,
			    ((Class168_Sub2_Sub2) this).anIntArray11124);
    }
    
    public Interface4 method3633() {
	return new Class186(((Class168_Sub2_Sub2) this).anInt9920,
			    ((Class168_Sub2_Sub2) this).anInt9916,
			    ((Class168_Sub2_Sub2) this).anIntArray11124);
    }
    
    Class168_Sub2_Sub2(Class103_Sub2 class103_sub2, int[] is, int i,
		       int i_962_) {
	super(class103_sub2, i, i_962_);
	((Class168_Sub2_Sub2) this).anIntArray11124 = is;
    }
    
    public Interface4 method3634() {
	return new Class186(((Class168_Sub2_Sub2) this).anInt9920,
			    ((Class168_Sub2_Sub2) this).anInt9916,
			    ((Class168_Sub2_Sub2) this).anIntArray11124);
    }
    
    public void method3635(int i, int i_963_, int i_964_, int i_965_,
			   int i_966_) {
	if (((Class168_Sub2_Sub2) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    int i_967_ = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					    .aClass103_Sub2_9904)).anInt9260
			  * -1826993761);
	    i += ((Class168_Sub2_Sub2) this).anInt9907;
	    i_963_ += ((Class168_Sub2_Sub2) this).anInt9905;
	    int i_968_ = i_963_ * i_967_ + i;
	    int i_969_ = 0;
	    int i_970_ = ((Class168_Sub2_Sub2) this).anInt9916;
	    int i_971_ = ((Class168_Sub2_Sub2) this).anInt9920;
	    int i_972_ = i_967_ - i_971_;
	    int i_973_ = 0;
	    if (i_963_ < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					    .aClass103_Sub2_9904)).anInt9254
			  * -788450385)) {
		int i_974_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9254) * -788450385
			      - i_963_);
		i_970_ -= i_974_;
		i_963_ = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					    .aClass103_Sub2_9904)).anInt9254
			  * -788450385);
		i_969_ += i_974_ * i_971_;
		i_968_ += i_974_ * i_967_;
	    }
	    if (i_963_ + i_970_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_970_ -= (i_963_ + i_970_
			   - (((Class103_Sub2)
			       ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			      .anInt9252) * 1546170165);
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_975_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9249) * 1298750001
			      - i);
		i_971_ -= i_975_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_969_ += i_975_;
		i_968_ += i_975_;
		i_973_ += i_975_;
		i_972_ += i_975_;
	    }
	    if (i + i_971_ > (((Class103_Sub2)
			       ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			      .anInt9250) * 325436811) {
		int i_976_ = (i + i_971_
			      - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						   .aClass103_Sub2_9904))
				 .anInt9250) * 325436811);
		i_971_ -= i_976_;
		i_973_ += i_976_;
		i_972_ += i_976_;
	    }
	    if (i_971_ > 0 && i_970_ > 0) {
		if (i_966_ == 0) {
		    if (i_964_ == 1) {
			for (int i_977_ = -i_970_; i_977_ < 0; i_977_++) {
			    int i_978_ = i_968_ + i_971_ - 3;
			    while (i_968_ < i_978_) {
				is[i_968_++] = (((Class168_Sub2_Sub2) this)
						.anIntArray11124[i_969_++]);
				is[i_968_++] = (((Class168_Sub2_Sub2) this)
						.anIntArray11124[i_969_++]);
				is[i_968_++] = (((Class168_Sub2_Sub2) this)
						.anIntArray11124[i_969_++]);
				is[i_968_++] = (((Class168_Sub2_Sub2) this)
						.anIntArray11124[i_969_++]);
			    }
			    i_978_ += 3;
			    while (i_968_ < i_978_)
				is[i_968_++] = (((Class168_Sub2_Sub2) this)
						.anIntArray11124[i_969_++]);
			    i_968_ += i_972_;
			    i_969_ += i_973_;
			}
		    } else if (i_964_ == 0) {
			int i_979_ = (i_965_ & 0xff0000) >> 16;
			int i_980_ = (i_965_ & 0xff00) >> 8;
			int i_981_ = i_965_ & 0xff;
			for (int i_982_ = -i_970_; i_982_ < 0; i_982_++) {
			    for (int i_983_ = -i_971_; i_983_ < 0; i_983_++) {
				int i_984_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_969_++]);
				int i_985_
				    = (i_984_ & 0xff0000) * i_979_ & ~0xffffff;
				int i_986_
				    = (i_984_ & 0xff00) * i_980_ & 0xff0000;
				int i_987_ = (i_984_ & 0xff) * i_981_ & 0xff00;
				is[i_968_++]
				    = (i_985_ | i_986_ | i_987_) >>> 8;
			    }
			    i_968_ += i_972_;
			    i_969_ += i_973_;
			}
		    } else if (i_964_ == 3) {
			for (int i_988_ = -i_970_; i_988_ < 0; i_988_++) {
			    for (int i_989_ = -i_971_; i_989_ < 0; i_989_++) {
				int i_990_ = (((Class168_Sub2_Sub2) this)
					      .anIntArray11124[i_969_++]);
				int i_991_ = i_990_ + i_965_;
				int i_992_ = ((i_990_ & 0xff00ff)
					      + (i_965_ & 0xff00ff));
				int i_993_ = ((i_992_ & 0x1000100)
					      + (i_991_ - i_992_ & 0x10000));
				is[i_968_++]
				    = i_991_ - i_993_ | i_993_ - (i_993_
								  >>> 8);
			    }
			    i_968_ += i_972_;
			    i_969_ += i_973_;
			}
		    } else if (i_964_ == 2) {
			int i_994_ = i_965_ >>> 24;
			int i_995_ = 256 - i_994_;
			int i_996_ = (i_965_ & 0xff00ff) * i_995_ & ~0xff00ff;
			int i_997_ = (i_965_ & 0xff00) * i_995_ & 0xff0000;
			i_965_ = (i_996_ | i_997_) >>> 8;
			for (int i_998_ = -i_970_; i_998_ < 0; i_998_++) {
			    for (int i_999_ = -i_971_; i_999_ < 0; i_999_++) {
				int i_1000_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124[i_969_++]);
				i_996_ = ((i_1000_ & 0xff00ff) * i_994_
					  & ~0xff00ff);
				i_997_
				    = (i_1000_ & 0xff00) * i_994_ & 0xff0000;
				is[i_968_++]
				    = ((i_996_ | i_997_) >>> 8) + i_965_;
			    }
			    i_968_ += i_972_;
			    i_969_ += i_973_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_966_ == 1) {
		    if (i_964_ == 1) {
			for (int i_1001_ = -i_970_; i_1001_ < 0; i_1001_++) {
			    for (int i_1002_ = -i_971_; i_1002_ < 0;
				 i_1002_++) {
				int i_1003_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124[i_969_++]);
				int i_1004_ = i_1003_ >>> 24;
				int i_1005_ = 256 - i_1004_;
				int i_1006_ = is[i_968_];
				is[i_968_++]
				    = (((((i_1003_ & 0xff00ff) * i_1004_
					  + (i_1006_ & 0xff00ff) * i_1005_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_1003_ & ~0xff00ff) >>> 8)
					    * i_1004_)
					   + (((i_1006_ & ~0xff00ff) >>> 8)
					      * i_1005_))
					  & ~0xff00ff));
			    }
			    i_968_ += i_972_;
			    i_969_ += i_973_;
			}
		    } else if (i_964_ == 0) {
			if ((i_965_ & 0xffffff) == 16777215) {
			    for (int i_1007_ = -i_970_; i_1007_ < 0;
				 i_1007_++) {
				for (int i_1008_ = -i_971_; i_1008_ < 0;
				     i_1008_++) {
				    int i_1009_ = (((Class168_Sub2_Sub2) this)
						   .anIntArray11124[i_969_++]);
				    int i_1010_
					= ((i_1009_ >>> 24) * (i_965_ >>> 24)
					   >> 8);
				    int i_1011_ = 256 - i_1010_;
				    int i_1012_ = is[i_968_];
				    is[i_968_++]
					= ((((i_1009_ & 0xff00ff) * i_1010_
					     + (i_1012_ & 0xff00ff) * i_1011_)
					    & ~0xff00ff)
					   + (((i_1009_ & 0xff00) * i_1010_
					       + (i_1012_ & 0xff00) * i_1011_)
					      & 0xff0000)) >> 8;
				}
				i_968_ += i_972_;
				i_969_ += i_973_;
			    }
			} else {
			    int i_1013_ = (i_965_ & 0xff0000) >> 16;
			    int i_1014_ = (i_965_ & 0xff00) >> 8;
			    int i_1015_ = i_965_ & 0xff;
			    for (int i_1016_ = -i_970_; i_1016_ < 0;
				 i_1016_++) {
				for (int i_1017_ = -i_971_; i_1017_ < 0;
				     i_1017_++) {
				    int i_1018_ = (((Class168_Sub2_Sub2) this)
						   .anIntArray11124[i_969_++]);
				    int i_1019_
					= ((i_1018_ >>> 24) * (i_965_ >>> 24)
					   >> 8);
				    int i_1020_ = 256 - i_1019_;
				    if (i_1019_ != 255) {
					int i_1021_
					    = ((i_1018_ & 0xff0000) * i_1013_
					       & ~0xffffff);
					int i_1022_
					    = ((i_1018_ & 0xff00) * i_1014_
					       & 0xff0000);
					int i_1023_
					    = ((i_1018_ & 0xff) * i_1015_
					       & 0xff00);
					i_1018_ = (i_1021_ | i_1022_
						   | i_1023_) >>> 8;
					int i_1024_ = is[i_968_];
					is[i_968_++]
					    = ((((i_1018_ & 0xff00ff) * i_1019_
						 + ((i_1024_ & 0xff00ff)
						    * i_1020_))
						& ~0xff00ff)
					       + (((i_1018_ & 0xff00) * i_1019_
						   + ((i_1024_ & 0xff00)
						      * i_1020_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_1025_
					    = ((i_1018_ & 0xff0000) * i_1013_
					       & ~0xffffff);
					int i_1026_
					    = ((i_1018_ & 0xff00) * i_1014_
					       & 0xff0000);
					int i_1027_
					    = ((i_1018_ & 0xff) * i_1015_
					       & 0xff00);
					is[i_968_++] = (i_1025_ | i_1026_
							| i_1027_) >>> 8;
				    }
				}
				i_968_ += i_972_;
				i_969_ += i_973_;
			    }
			}
		    } else if (i_964_ == 3) {
			for (int i_1028_ = -i_970_; i_1028_ < 0; i_1028_++) {
			    for (int i_1029_ = -i_971_; i_1029_ < 0;
				 i_1029_++) {
				int i_1030_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124[i_969_++]);
				int i_1031_ = i_1030_ + i_965_;
				int i_1032_ = ((i_1030_ & 0xff00ff)
					       + (i_965_ & 0xff00ff));
				int i_1033_
				    = ((i_1032_ & 0x1000100)
				       + (i_1031_ - i_1032_ & 0x10000));
				i_1033_
				    = i_1031_ - i_1033_ | i_1033_ - (i_1033_
								     >>> 8);
				int i_1034_
				    = (i_1033_ >>> 24) * (i_965_ >>> 24) >> 8;
				int i_1035_ = 256 - i_1034_;
				if (i_1034_ != 255) {
				    i_1030_ = i_1033_;
				    i_1033_ = is[i_968_];
				    i_1033_
					= ((((i_1030_ & 0xff00ff) * i_1034_
					     + (i_1033_ & 0xff00ff) * i_1035_)
					    & ~0xff00ff)
					   + (((i_1030_ & 0xff00) * i_1034_
					       + (i_1033_ & 0xff00) * i_1035_)
					      & 0xff0000)) >> 8;
				}
				is[i_968_++] = i_1033_;
			    }
			    i_968_ += i_972_;
			    i_969_ += i_973_;
			}
		    } else if (i_964_ == 2) {
			int i_1036_ = i_965_ >>> 24;
			int i_1037_ = 256 - i_1036_;
			int i_1038_
			    = (i_965_ & 0xff00ff) * i_1037_ & ~0xff00ff;
			int i_1039_ = (i_965_ & 0xff00) * i_1037_ & 0xff0000;
			i_965_ = (i_1038_ | i_1039_) >>> 8;
			for (int i_1040_ = -i_970_; i_1040_ < 0; i_1040_++) {
			    for (int i_1041_ = -i_971_; i_1041_ < 0;
				 i_1041_++) {
				int i_1042_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124[i_969_++]);
				int i_1043_ = i_1042_ >>> 24;
				int i_1044_ = 256 - i_1043_;
				i_1038_ = ((i_1042_ & 0xff00ff) * i_1036_
					   & ~0xff00ff);
				i_1039_
				    = (i_1042_ & 0xff00) * i_1036_ & 0xff0000;
				i_1042_ = ((i_1038_ | i_1039_) >>> 8) + i_965_;
				int i_1045_ = is[i_968_];
				is[i_968_++]
				    = ((((i_1042_ & 0xff00ff) * i_1043_
					 + (i_1045_ & 0xff00ff) * i_1044_)
					& ~0xff00ff)
				       + (((i_1042_ & 0xff00) * i_1043_
					   + (i_1045_ & 0xff00) * i_1044_)
					  & 0xff0000)) >> 8;
			    }
			    i_968_ += i_972_;
			    i_969_ += i_973_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_966_ == 2) {
		    if (i_964_ == 1) {
			for (int i_1046_ = -i_970_; i_1046_ < 0; i_1046_++) {
			    for (int i_1047_ = -i_971_; i_1047_ < 0;
				 i_1047_++) {
				int i_1048_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124[i_969_++]);
				if (i_1048_ != 0) {
				    int i_1049_ = is[i_968_];
				    int i_1050_ = i_1048_ + i_1049_;
				    int i_1051_ = ((i_1048_ & 0xff00ff)
						   + (i_1049_ & 0xff00ff));
				    i_1049_
					= ((i_1051_ & 0x1000100)
					   + (i_1050_ - i_1051_ & 0x10000));
				    is[i_968_++]
					= (i_1050_ - i_1049_
					   | i_1049_ - (i_1049_ >>> 8));
				} else
				    i_968_++;
			    }
			    i_968_ += i_972_;
			    i_969_ += i_973_;
			}
		    } else if (i_964_ == 0) {
			int i_1052_ = (i_965_ & 0xff0000) >> 16;
			int i_1053_ = (i_965_ & 0xff00) >> 8;
			int i_1054_ = i_965_ & 0xff;
			for (int i_1055_ = -i_970_; i_1055_ < 0; i_1055_++) {
			    for (int i_1056_ = -i_971_; i_1056_ < 0;
				 i_1056_++) {
				int i_1057_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124[i_969_++]);
				if (i_1057_ != 0) {
				    int i_1058_
					= ((i_1057_ & 0xff0000) * i_1052_
					   & ~0xffffff);
				    int i_1059_ = ((i_1057_ & 0xff00) * i_1053_
						   & 0xff0000);
				    int i_1060_
					= (i_1057_ & 0xff) * i_1054_ & 0xff00;
				    i_1057_
					= (i_1058_ | i_1059_ | i_1060_) >>> 8;
				    int i_1061_ = is[i_968_];
				    int i_1062_ = i_1057_ + i_1061_;
				    int i_1063_ = ((i_1057_ & 0xff00ff)
						   + (i_1061_ & 0xff00ff));
				    i_1061_
					= ((i_1063_ & 0x1000100)
					   + (i_1062_ - i_1063_ & 0x10000));
				    is[i_968_++]
					= (i_1062_ - i_1061_
					   | i_1061_ - (i_1061_ >>> 8));
				} else
				    i_968_++;
			    }
			    i_968_ += i_972_;
			    i_969_ += i_973_;
			}
		    } else if (i_964_ == 3) {
			for (int i_1064_ = -i_970_; i_1064_ < 0; i_1064_++) {
			    for (int i_1065_ = -i_971_; i_1065_ < 0;
				 i_1065_++) {
				int i_1066_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124[i_969_++]);
				int i_1067_ = i_1066_ + i_965_;
				int i_1068_ = ((i_1066_ & 0xff00ff)
					       + (i_965_ & 0xff00ff));
				int i_1069_
				    = ((i_1068_ & 0x1000100)
				       + (i_1067_ - i_1068_ & 0x10000));
				i_1066_
				    = i_1067_ - i_1069_ | i_1069_ - (i_1069_
								     >>> 8);
				i_1069_ = is[i_968_];
				i_1067_ = i_1066_ + i_1069_;
				i_1068_ = (i_1066_ & 0xff00ff) + (i_1069_
								  & 0xff00ff);
				i_1069_ = ((i_1068_ & 0x1000100)
					   + (i_1067_ - i_1068_ & 0x10000));
				is[i_968_++]
				    = i_1067_ - i_1069_ | i_1069_ - (i_1069_
								     >>> 8);
			    }
			    i_968_ += i_972_;
			    i_969_ += i_973_;
			}
		    } else if (i_964_ == 2) {
			int i_1070_ = i_965_ >>> 24;
			int i_1071_ = 256 - i_1070_;
			int i_1072_
			    = (i_965_ & 0xff00ff) * i_1071_ & ~0xff00ff;
			int i_1073_ = (i_965_ & 0xff00) * i_1071_ & 0xff0000;
			i_965_ = (i_1072_ | i_1073_) >>> 8;
			for (int i_1074_ = -i_970_; i_1074_ < 0; i_1074_++) {
			    for (int i_1075_ = -i_971_; i_1075_ < 0;
				 i_1075_++) {
				int i_1076_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124[i_969_++]);
				if (i_1076_ != 0) {
				    i_1072_ = ((i_1076_ & 0xff00ff) * i_1070_
					       & ~0xff00ff);
				    i_1073_ = ((i_1076_ & 0xff00) * i_1070_
					       & 0xff0000);
				    i_1076_
					= ((i_1072_ | i_1073_) >>> 8) + i_965_;
				    int i_1077_ = is[i_968_];
				    int i_1078_ = i_1076_ + i_1077_;
				    int i_1079_ = ((i_1076_ & 0xff00ff)
						   + (i_1077_ & 0xff00ff));
				    i_1077_
					= ((i_1079_ & 0x1000100)
					   + (i_1078_ - i_1079_ & 0x10000));
				    is[i_968_++]
					= (i_1078_ - i_1077_
					   | i_1077_ - (i_1077_ >>> 8));
				} else
				    i_968_++;
			    }
			    i_968_ += i_972_;
			    i_969_ += i_973_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public Interface4 method3654() {
	return new Class186(((Class168_Sub2_Sub2) this).anInt9920,
			    ((Class168_Sub2_Sub2) this).anInt9916,
			    ((Class168_Sub2_Sub2) this).anIntArray11124);
    }
    
    void method16227(boolean bool, boolean bool_1080_, boolean bool_1081_,
		     int i, int i_1082_, float f, int i_1083_, int i_1084_,
		     int i_1085_, int i_1086_, int i_1087_, int i_1088_,
		     boolean bool_1089_) {
	if (i_1083_ > 0 && i_1084_ > 0 && (bool || bool_1080_)) {
	    int i_1090_ = 0;
	    int i_1091_ = 0;
	    int i_1092_ = (((Class168_Sub2_Sub2) this).anInt9907
			   + ((Class168_Sub2_Sub2) this).anInt9920
			   + ((Class168_Sub2_Sub2) this).anInt9909);
	    int i_1093_ = (((Class168_Sub2_Sub2) this).anInt9905
			   + ((Class168_Sub2_Sub2) this).anInt9916
			   + ((Class168_Sub2_Sub2) this).anInt9910);
	    int i_1094_ = (i_1092_ << 16) / i_1083_;
	    int i_1095_ = (i_1093_ << 16) / i_1084_;
	    if (((Class168_Sub2_Sub2) this).anInt9907 > 0) {
		int i_1096_ = (((((Class168_Sub2_Sub2) this).anInt9907 << 16)
				+ i_1094_ - 1)
			       / i_1094_);
		i += i_1096_;
		i_1090_ += (i_1096_ * i_1094_
			    - (((Class168_Sub2_Sub2) this).anInt9907 << 16));
	    }
	    if (((Class168_Sub2_Sub2) this).anInt9905 > 0) {
		int i_1097_ = (((((Class168_Sub2_Sub2) this).anInt9905 << 16)
				+ i_1095_ - 1)
			       / i_1095_);
		i_1082_ += i_1097_;
		i_1091_ += (i_1097_ * i_1095_
			    - (((Class168_Sub2_Sub2) this).anInt9905 << 16));
	    }
	    if (((Class168_Sub2_Sub2) this).anInt9920 < i_1092_)
		i_1083_ = ((((Class168_Sub2_Sub2) this).anInt9920 << 16)
			   - i_1090_ + i_1094_ - 1) / i_1094_;
	    if (((Class168_Sub2_Sub2) this).anInt9916 < i_1093_)
		i_1084_ = ((((Class168_Sub2_Sub2) this).anInt9916 << 16)
			   - i_1091_ + i_1095_ - 1) / i_1095_;
	    int i_1098_
		= i + i_1082_ * ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						    .aClass103_Sub2_9904))
				  .anInt9260)
				 * -1826993761);
	    int i_1099_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					      .aClass103_Sub2_9904)).anInt9260
			    * -1826993761)
			   - i_1083_);
	    if (i_1082_ + i_1084_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_1084_ -= (i_1082_ + i_1084_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i_1082_ < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_1100_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_1082_);
		i_1084_ -= i_1100_;
		i_1098_ += i_1100_ * (((Class103_Sub2)
				       (((Class168_Sub2_Sub2) this)
					.aClass103_Sub2_9904)).anInt9260
				      * -1826993761);
		i_1091_ += i_1095_ * i_1100_;
	    }
	    if (i + i_1083_ > (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_1101_ = (i + i_1083_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_1083_ -= i_1101_;
		i_1099_ += i_1101_;
	    }
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_1102_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_1083_ -= i_1102_;
		i_1098_ += i_1102_;
		i_1090_ += i_1094_ * i_1102_;
		i_1099_ += i_1102_;
	    }
	    float[] fs = (((Class103_Sub2)
			   ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			  .aFloatArray9248);
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (i_1087_ == 0) {
		if (i_1085_ == 1) {
		    int i_1103_ = i_1090_;
		    for (int i_1104_ = -i_1084_; i_1104_ < 0; i_1104_++) {
			int i_1105_
			    = ((i_1091_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_1106_ = -i_1083_; i_1106_ < 0; i_1106_++) {
			    if (!bool_1080_ || f < fs[i_1098_]) {
				if (bool)
				    is[i_1098_]
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1090_ >> 16) + i_1105_]);
				if (bool_1080_ && bool_1089_)
				    fs[i_1098_] = f;
			    }
			    i_1090_ += i_1094_;
			    i_1098_++;
			}
			i_1091_ += i_1095_;
			i_1090_ = i_1103_;
			i_1098_ += i_1099_;
		    }
		} else if (i_1085_ == 0) {
		    int i_1107_ = (i_1086_ & 0xff0000) >> 16;
		    int i_1108_ = (i_1086_ & 0xff00) >> 8;
		    int i_1109_ = i_1086_ & 0xff;
		    int i_1110_ = i_1090_;
		    for (int i_1111_ = -i_1084_; i_1111_ < 0; i_1111_++) {
			int i_1112_
			    = ((i_1091_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_1113_ = -i_1083_; i_1113_ < 0; i_1113_++) {
			    if (!bool_1080_ || f < fs[i_1098_]) {
				if (bool) {
				    int i_1114_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1090_ >> 16) + i_1112_]);
				    int i_1115_
					= ((i_1114_ & 0xff0000) * i_1107_
					   & ~0xffffff);
				    int i_1116_ = ((i_1114_ & 0xff00) * i_1108_
						   & 0xff0000);
				    int i_1117_
					= (i_1114_ & 0xff) * i_1109_ & 0xff00;
				    is[i_1098_]
					= (i_1115_ | i_1116_ | i_1117_) >>> 8;
				}
				if (bool_1080_ && bool_1089_)
				    fs[i_1098_] = f;
			    }
			    i_1090_ += i_1094_;
			    i_1098_++;
			}
			i_1091_ += i_1095_;
			i_1090_ = i_1110_;
			i_1098_ += i_1099_;
		    }
		} else if (i_1085_ == 3) {
		    int i_1118_ = i_1090_;
		    for (int i_1119_ = -i_1084_; i_1119_ < 0; i_1119_++) {
			int i_1120_
			    = ((i_1091_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_1121_ = -i_1083_; i_1121_ < 0; i_1121_++) {
			    if (!bool_1080_ || f < fs[i_1098_]) {
				if (bool) {
				    int i_1122_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1090_ >> 16) + i_1120_]);
				    int i_1123_ = i_1122_ + i_1086_;
				    int i_1124_ = ((i_1122_ & 0xff00ff)
						   + (i_1086_ & 0xff00ff));
				    int i_1125_
					= ((i_1124_ & 0x1000100)
					   + (i_1123_ - i_1124_ & 0x10000));
				    is[i_1098_]
					= (i_1123_ - i_1125_
					   | i_1125_ - (i_1125_ >>> 8));
				}
				if (bool_1080_ && bool_1089_)
				    fs[i_1098_] = f;
			    }
			    i_1090_ += i_1094_;
			    i_1098_++;
			}
			i_1091_ += i_1095_;
			i_1090_ = i_1118_;
			i_1098_ += i_1099_;
		    }
		} else if (i_1085_ == 2) {
		    int i_1126_ = i_1086_ >>> 24;
		    int i_1127_ = 256 - i_1126_;
		    int i_1128_ = (i_1086_ & 0xff00ff) * i_1127_ & ~0xff00ff;
		    int i_1129_ = (i_1086_ & 0xff00) * i_1127_ & 0xff0000;
		    i_1086_ = (i_1128_ | i_1129_) >>> 8;
		    int i_1130_ = i_1090_;
		    for (int i_1131_ = -i_1084_; i_1131_ < 0; i_1131_++) {
			int i_1132_
			    = ((i_1091_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_1133_ = -i_1083_; i_1133_ < 0; i_1133_++) {
			    if (!bool_1080_ || f < fs[i_1098_]) {
				if (bool) {
				    int i_1134_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1090_ >> 16) + i_1132_]);
				    i_1128_ = ((i_1134_ & 0xff00ff) * i_1126_
					       & ~0xff00ff);
				    i_1129_ = ((i_1134_ & 0xff00) * i_1126_
					       & 0xff0000);
				    is[i_1098_] = (((i_1128_ | i_1129_) >>> 8)
						   + i_1086_);
				}
				if (bool_1080_ && bool_1089_)
				    fs[i_1098_] = f;
			    }
			    i_1090_ += i_1094_;
			    i_1098_++;
			}
			i_1091_ += i_1095_;
			i_1090_ = i_1130_;
			i_1098_ += i_1099_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1087_ == 1) {
		if (i_1085_ == 1) {
		    int i_1135_ = i_1090_;
		    for (int i_1136_ = -i_1084_; i_1136_ < 0; i_1136_++) {
			int i_1137_
			    = ((i_1091_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_1138_ = -i_1083_; i_1138_ < 0; i_1138_++) {
			    if (!bool_1080_ || f < fs[i_1098_]) {
				if (bool) {
				    int i_1139_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1090_ >> 16) + i_1137_]);
				    int i_1140_ = i_1139_ >>> 24;
				    int i_1141_ = 256 - i_1140_;
				    int i_1142_ = is[i_1098_];
				    is[i_1098_]
					= (((((i_1139_ & 0xff00ff) * i_1140_
					      + (i_1142_ & 0xff00ff) * i_1141_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_1139_ & ~0xff00ff) >>> 8)
						* i_1140_)
					       + (((i_1142_ & ~0xff00ff) >>> 8)
						  * i_1141_))
					      & ~0xff00ff));
				}
				if (bool_1080_ && bool_1089_)
				    fs[i_1098_] = f;
			    }
			    i_1090_ += i_1094_;
			    i_1098_++;
			}
			i_1091_ += i_1095_;
			i_1090_ = i_1135_;
			i_1098_ += i_1099_;
		    }
		} else if (i_1085_ == 0) {
		    int i_1143_ = i_1090_;
		    if ((i_1086_ & 0xffffff) == 16777215) {
			for (int i_1144_ = -i_1084_; i_1144_ < 0; i_1144_++) {
			    int i_1145_
				= ((i_1091_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1146_ = -i_1083_; i_1146_ < 0;
				 i_1146_++) {
				if (!bool_1080_ || f < fs[i_1098_]) {
				    if (bool) {
					int i_1147_
					    = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1090_ >> 16) + i_1145_]);
					int i_1148_
					    = ((i_1147_ >>> 24) * (i_1086_
								   >>> 24)
					       >> 8);
					int i_1149_ = 256 - i_1148_;
					int i_1150_ = is[i_1098_];
					is[i_1098_]
					    = ((((i_1147_ & 0xff00ff) * i_1148_
						 + ((i_1150_ & 0xff00ff)
						    * i_1149_))
						& ~0xff00ff)
					       + (((i_1147_ & 0xff00) * i_1148_
						   + ((i_1150_ & 0xff00)
						      * i_1149_))
						  & 0xff0000)) >> 8;
				    }
				    if (bool_1080_ && bool_1089_)
					fs[i_1098_] = f;
				}
				i_1090_ += i_1094_;
				i_1098_++;
			    }
			    i_1091_ += i_1095_;
			    i_1090_ = i_1143_;
			    i_1098_ += i_1099_;
			}
		    } else {
			int i_1151_ = (i_1086_ & 0xff0000) >> 16;
			int i_1152_ = (i_1086_ & 0xff00) >> 8;
			int i_1153_ = i_1086_ & 0xff;
			for (int i_1154_ = -i_1084_; i_1154_ < 0; i_1154_++) {
			    int i_1155_
				= ((i_1091_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1156_ = -i_1083_; i_1156_ < 0;
				 i_1156_++) {
				if (!bool_1080_ || f < fs[i_1098_]) {
				    int i_1157_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1090_ >> 16) + i_1155_]);
				    int i_1158_
					= ((i_1157_ >>> 24) * (i_1086_ >>> 24)
					   >> 8);
				    int i_1159_ = 256 - i_1158_;
				    if (i_1158_ != 255) {
					if (bool) {
					    int i_1160_
						= (((i_1157_ & 0xff0000)
						    * i_1151_)
						   & ~0xffffff);
					    int i_1161_
						= ((i_1157_ & 0xff00) * i_1152_
						   & 0xff0000);
					    int i_1162_
						= ((i_1157_ & 0xff) * i_1153_
						   & 0xff00);
					    i_1157_ = (i_1160_ | i_1161_
						       | i_1162_) >>> 8;
					    int i_1163_ = is[i_1098_];
					    is[i_1098_]
						= (((((i_1157_ & 0xff00ff)
						      * i_1158_)
						     + ((i_1163_ & 0xff00ff)
							* i_1159_))
						    & ~0xff00ff)
						   + ((((i_1157_ & 0xff00)
							* i_1158_)
						       + ((i_1163_ & 0xff00)
							  * i_1159_))
						      & 0xff0000)) >> 8;
					    if (bool_1081_) {
						int i_1164_ = ((i_1163_ >>> 24)
							       + i_1158_);
						if (i_1164_ > 255)
						    i_1164_ = 255;
						is[i_1098_] |= i_1164_ << 24;
					    }
					}
					if (bool_1080_ && bool_1089_)
					    fs[i_1098_] = f;
				    } else {
					if (bool) {
					    int i_1165_
						= (((i_1157_ & 0xff0000)
						    * i_1151_)
						   & ~0xffffff);
					    int i_1166_
						= ((i_1157_ & 0xff00) * i_1152_
						   & 0xff0000);
					    int i_1167_
						= ((i_1157_ & 0xff) * i_1153_
						   & 0xff00);
					    is[i_1098_] = (i_1165_ | i_1166_
							   | i_1167_) >>> 8;
					}
					if (bool_1080_ && bool_1089_)
					    fs[i_1098_] = f;
				    }
				}
				i_1090_ += i_1094_;
				i_1098_++;
			    }
			    i_1091_ += i_1095_;
			    i_1090_ = i_1143_;
			    i_1098_ += i_1099_;
			}
		    }
		} else if (i_1085_ == 3) {
		    int i_1168_ = i_1090_;
		    for (int i_1169_ = -i_1084_; i_1169_ < 0; i_1169_++) {
			int i_1170_
			    = ((i_1091_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_1171_ = -i_1083_; i_1171_ < 0; i_1171_++) {
			    if (!bool_1080_ || f < fs[i_1098_]) {
				if (bool) {
				    int i_1172_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1090_ >> 16) + i_1170_]);
				    int i_1173_ = i_1172_ + i_1086_;
				    int i_1174_ = ((i_1172_ & 0xff00ff)
						   + (i_1086_ & 0xff00ff));
				    int i_1175_
					= ((i_1174_ & 0x1000100)
					   + (i_1173_ - i_1174_ & 0x10000));
				    i_1175_ = (i_1173_ - i_1175_
					       | i_1175_ - (i_1175_ >>> 8));
				    int i_1176_
					= ((i_1175_ >>> 24) * (i_1086_ >>> 24)
					   >> 8);
				    int i_1177_ = 256 - i_1176_;
				    if (i_1176_ != 255) {
					i_1172_ = i_1175_;
					i_1175_ = is[i_1098_];
					i_1175_
					    = ((((i_1172_ & 0xff00ff) * i_1176_
						 + ((i_1175_ & 0xff00ff)
						    * i_1177_))
						& ~0xff00ff)
					       + (((i_1172_ & 0xff00) * i_1176_
						   + ((i_1175_ & 0xff00)
						      * i_1177_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_1098_] = i_1175_;
				}
				if (bool_1080_ && bool_1089_)
				    fs[i_1098_] = f;
			    }
			    i_1090_ += i_1094_;
			    i_1098_++;
			}
			i_1091_ += i_1095_;
			i_1090_ = i_1168_;
			i_1098_ += i_1099_;
		    }
		} else if (i_1085_ == 2) {
		    int i_1178_ = i_1086_ >>> 24;
		    int i_1179_ = 256 - i_1178_;
		    int i_1180_ = (i_1086_ & 0xff00ff) * i_1179_ & ~0xff00ff;
		    int i_1181_ = (i_1086_ & 0xff00) * i_1179_ & 0xff0000;
		    i_1086_ = (i_1180_ | i_1181_) >>> 8;
		    int i_1182_ = i_1090_;
		    for (int i_1183_ = -i_1084_; i_1183_ < 0; i_1183_++) {
			int i_1184_
			    = ((i_1091_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_1185_ = -i_1083_; i_1185_ < 0; i_1185_++) {
			    if (!bool_1080_ || f < fs[i_1098_]) {
				if (bool) {
				    int i_1186_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1090_ >> 16) + i_1184_]);
				    int i_1187_ = i_1186_ >>> 24;
				    int i_1188_ = 256 - i_1187_;
				    i_1180_ = ((i_1186_ & 0xff00ff) * i_1178_
					       & ~0xff00ff);
				    i_1181_ = ((i_1186_ & 0xff00) * i_1178_
					       & 0xff0000);
				    i_1186_ = (((i_1180_ | i_1181_) >>> 8)
					       + i_1086_);
				    int i_1189_ = is[i_1098_];
				    is[i_1098_]
					= ((((i_1186_ & 0xff00ff) * i_1187_
					     + (i_1189_ & 0xff00ff) * i_1188_)
					    & ~0xff00ff)
					   + (((i_1186_ & 0xff00) * i_1187_
					       + (i_1189_ & 0xff00) * i_1188_)
					      & 0xff0000)) >> 8;
				}
				if (bool_1080_ && bool_1089_)
				    fs[i_1098_] = f;
			    }
			    i_1090_ += i_1094_;
			    i_1098_++;
			}
			i_1091_ += i_1095_;
			i_1090_ = i_1182_;
			i_1098_ += i_1099_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1087_ == 2) {
		if (i_1085_ == 1) {
		    int i_1190_ = i_1090_;
		    for (int i_1191_ = -i_1084_; i_1191_ < 0; i_1191_++) {
			int i_1192_
			    = ((i_1091_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_1193_ = -i_1083_; i_1193_ < 0; i_1193_++) {
			    if (!bool_1080_ || f < fs[i_1098_]) {
				int i_1194_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1090_ >> 16) + i_1192_]);
				if (i_1194_ != 0) {
				    if (bool) {
					int i_1195_ = is[i_1098_];
					int i_1196_ = i_1194_ + i_1195_;
					int i_1197_ = ((i_1194_ & 0xff00ff)
						       + (i_1195_ & 0xff00ff));
					i_1195_ = ((i_1197_ & 0x1000100)
						   + (i_1196_ - i_1197_
						      & 0x10000));
					is[i_1098_]
					    = (i_1196_ - i_1195_
					       | i_1195_ - (i_1195_ >>> 8));
				    }
				    if (bool_1080_ && bool_1089_)
					fs[i_1098_] = f;
				}
			    }
			    i_1090_ += i_1094_;
			    i_1098_++;
			}
			i_1091_ += i_1095_;
			i_1090_ = i_1190_;
			i_1098_ += i_1099_;
		    }
		} else if (i_1085_ == 0) {
		    int i_1198_ = i_1090_;
		    int i_1199_ = (i_1086_ & 0xff0000) >> 16;
		    int i_1200_ = (i_1086_ & 0xff00) >> 8;
		    int i_1201_ = i_1086_ & 0xff;
		    for (int i_1202_ = -i_1084_; i_1202_ < 0; i_1202_++) {
			int i_1203_
			    = ((i_1091_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_1204_ = -i_1083_; i_1204_ < 0; i_1204_++) {
			    if (!bool_1080_ || f < fs[i_1098_]) {
				int i_1205_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1090_ >> 16) + i_1203_]);
				if (i_1205_ != 0) {
				    if (bool) {
					int i_1206_
					    = ((i_1205_ & 0xff0000) * i_1199_
					       & ~0xffffff);
					int i_1207_
					    = ((i_1205_ & 0xff00) * i_1200_
					       & 0xff0000);
					int i_1208_
					    = ((i_1205_ & 0xff) * i_1201_
					       & 0xff00);
					i_1205_ = (i_1206_ | i_1207_
						   | i_1208_) >>> 8;
					int i_1209_ = is[i_1098_];
					int i_1210_ = i_1205_ + i_1209_;
					int i_1211_ = ((i_1205_ & 0xff00ff)
						       + (i_1209_ & 0xff00ff));
					i_1209_ = ((i_1211_ & 0x1000100)
						   + (i_1210_ - i_1211_
						      & 0x10000));
					is[i_1098_]
					    = (i_1210_ - i_1209_
					       | i_1209_ - (i_1209_ >>> 8));
				    }
				    if (bool_1080_ && bool_1089_)
					fs[i_1098_] = f;
				}
			    }
			    i_1090_ += i_1094_;
			    i_1098_++;
			}
			i_1091_ += i_1095_;
			i_1090_ = i_1198_;
			i_1098_ += i_1099_;
		    }
		} else if (i_1085_ == 3) {
		    int i_1212_ = i_1090_;
		    for (int i_1213_ = -i_1084_; i_1213_ < 0; i_1213_++) {
			int i_1214_
			    = ((i_1091_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_1215_ = -i_1083_; i_1215_ < 0; i_1215_++) {
			    if (!bool_1080_ || f < fs[i_1098_]) {
				if (bool) {
				    int i_1216_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1090_ >> 16) + i_1214_]);
				    int i_1217_ = i_1216_ + i_1086_;
				    int i_1218_ = ((i_1216_ & 0xff00ff)
						   + (i_1086_ & 0xff00ff));
				    int i_1219_
					= ((i_1218_ & 0x1000100)
					   + (i_1217_ - i_1218_ & 0x10000));
				    i_1216_ = (i_1217_ - i_1219_
					       | i_1219_ - (i_1219_ >>> 8));
				    i_1219_ = is[i_1098_];
				    i_1217_ = i_1216_ + i_1219_;
				    i_1218_
					= (i_1216_ & 0xff00ff) + (i_1219_
								  & 0xff00ff);
				    i_1219_
					= ((i_1218_ & 0x1000100)
					   + (i_1217_ - i_1218_ & 0x10000));
				    is[i_1098_]
					= (i_1217_ - i_1219_
					   | i_1219_ - (i_1219_ >>> 8));
				}
				if (bool_1080_ && bool_1089_)
				    fs[i_1098_] = f;
			    }
			    i_1090_ += i_1094_;
			    i_1098_++;
			}
			i_1091_ += i_1095_;
			i_1090_ = i_1212_;
			i_1098_ += i_1099_;
		    }
		} else if (i_1085_ == 2) {
		    int i_1220_ = i_1086_ >>> 24;
		    int i_1221_ = 256 - i_1220_;
		    int i_1222_ = (i_1086_ & 0xff00ff) * i_1221_ & ~0xff00ff;
		    int i_1223_ = (i_1086_ & 0xff00) * i_1221_ & 0xff0000;
		    i_1086_ = (i_1222_ | i_1223_) >>> 8;
		    int i_1224_ = i_1090_;
		    for (int i_1225_ = -i_1084_; i_1225_ < 0; i_1225_++) {
			int i_1226_
			    = ((i_1091_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_1227_ = -i_1083_; i_1227_ < 0; i_1227_++) {
			    if (!bool_1080_ || f < fs[i_1098_]) {
				int i_1228_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1090_ >> 16) + i_1226_]);
				if (i_1228_ != 0) {
				    if (bool) {
					i_1222_
					    = ((i_1228_ & 0xff00ff) * i_1220_
					       & ~0xff00ff);
					i_1223_ = ((i_1228_ & 0xff00) * i_1220_
						   & 0xff0000);
					i_1228_ = (((i_1222_ | i_1223_) >>> 8)
						   + i_1086_);
					int i_1229_ = is[i_1098_];
					int i_1230_ = i_1228_ + i_1229_;
					int i_1231_ = ((i_1228_ & 0xff00ff)
						       + (i_1229_ & 0xff00ff));
					i_1229_ = ((i_1231_ & 0x1000100)
						   + (i_1230_ - i_1231_
						      & 0x10000));
					is[i_1098_]
					    = (i_1230_ - i_1229_
					       | i_1229_ - (i_1229_ >>> 8));
				    }
				    if (bool_1080_ && bool_1089_)
					fs[i_1098_] = f;
				}
			    }
			    i_1090_ += i_1094_;
			    i_1098_++;
			}
			i_1091_ += i_1095_;
			i_1090_ = i_1224_;
			i_1098_ += i_1099_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method3637(int i, int i_1232_, Class135 class135, int i_1233_,
			   int i_1234_) {
	if (((Class168_Sub2_Sub2) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    i += ((Class168_Sub2_Sub2) this).anInt9907;
	    i_1232_ += ((Class168_Sub2_Sub2) this).anInt9905;
	    int i_1235_ = 0;
	    int i_1236_ = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761);
	    int i_1237_ = ((Class168_Sub2_Sub2) this).anInt9920;
	    int i_1238_ = ((Class168_Sub2_Sub2) this).anInt9916;
	    int i_1239_ = i_1236_ - i_1237_;
	    int i_1240_ = 0;
	    int i_1241_ = i + i_1232_ * i_1236_;
	    if (i_1232_ < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_1242_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_1232_);
		i_1238_ -= i_1242_;
		i_1232_ = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385);
		i_1235_ += i_1242_ * i_1237_;
		i_1241_ += i_1242_ * i_1236_;
	    }
	    if (i_1232_ + i_1238_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_1238_ -= (i_1232_ + i_1238_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_1243_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_1237_ -= i_1243_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_1235_ += i_1243_;
		i_1241_ += i_1243_;
		i_1240_ += i_1243_;
		i_1239_ += i_1243_;
	    }
	    if (i + i_1237_ > (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_1244_ = (i + i_1237_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_1237_ -= i_1244_;
		i_1240_ += i_1244_;
		i_1239_ += i_1244_;
	    }
	    if (i_1237_ > 0 && i_1238_ > 0) {
		Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
		int[] is_1245_
		    = ((Class135_Sub1) class135_sub1).anIntArray9874;
		int[] is_1246_
		    = ((Class135_Sub1) class135_sub1).anIntArray9873;
		int i_1247_ = i_1232_;
		if (i_1234_ > i_1247_) {
		    i_1247_ = i_1234_;
		    i_1241_ += (i_1234_ - i_1232_) * i_1236_;
		    i_1235_ += ((i_1234_ - i_1232_)
				* ((Class168_Sub2_Sub2) this).anInt9920);
		}
		int i_1248_
		    = (i_1234_ + is_1245_.length < i_1232_ + i_1238_
		       ? i_1234_ + is_1245_.length : i_1232_ + i_1238_);
		for (int i_1249_ = i_1247_; i_1249_ < i_1248_; i_1249_++) {
		    int i_1250_ = is_1245_[i_1249_ - i_1234_] + i_1233_;
		    int i_1251_ = is_1246_[i_1249_ - i_1234_];
		    int i_1252_ = i_1237_;
		    if (i > i_1250_) {
			int i_1253_ = i - i_1250_;
			if (i_1253_ >= i_1251_) {
			    i_1235_ += i_1237_ + i_1240_;
			    i_1241_ += i_1237_ + i_1239_;
			    continue;
			}
			i_1251_ -= i_1253_;
		    } else {
			int i_1254_ = i_1250_ - i;
			if (i_1254_ >= i_1237_) {
			    i_1235_ += i_1237_ + i_1240_;
			    i_1241_ += i_1237_ + i_1239_;
			    continue;
			}
			i_1235_ += i_1254_;
			i_1252_ -= i_1254_;
			i_1241_ += i_1254_;
		    }
		    int i_1255_ = 0;
		    if (i_1252_ < i_1251_)
			i_1251_ = i_1252_;
		    else
			i_1255_ = i_1252_ - i_1251_;
		    for (int i_1256_ = -i_1251_; i_1256_ < 0; i_1256_++) {
			int i_1257_ = (((Class168_Sub2_Sub2) this)
				       .anIntArray11124[i_1235_++]);
			int i_1258_ = i_1257_ >>> 24;
			int i_1259_ = 256 - i_1258_;
			int i_1260_ = is[i_1241_];
			is[i_1241_++] = ((((i_1257_ & 0xff00ff) * i_1258_
					   + (i_1260_ & 0xff00ff) * i_1259_)
					  & ~0xff00ff)
					 + (((i_1257_ & 0xff00) * i_1258_
					     + (i_1260_ & 0xff00) * i_1259_)
					    & 0xff0000)) >> 8;
		    }
		    i_1235_ += i_1255_ + i_1240_;
		    i_1241_ += i_1255_ + i_1239_;
		}
	    }
	}
    }
    
    public void method3607(int i, int i_1261_, Class135 class135, int i_1262_,
			   int i_1263_) {
	if (((Class168_Sub2_Sub2) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    i += ((Class168_Sub2_Sub2) this).anInt9907;
	    i_1261_ += ((Class168_Sub2_Sub2) this).anInt9905;
	    int i_1264_ = 0;
	    int i_1265_ = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761);
	    int i_1266_ = ((Class168_Sub2_Sub2) this).anInt9920;
	    int i_1267_ = ((Class168_Sub2_Sub2) this).anInt9916;
	    int i_1268_ = i_1265_ - i_1266_;
	    int i_1269_ = 0;
	    int i_1270_ = i + i_1261_ * i_1265_;
	    if (i_1261_ < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_1271_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_1261_);
		i_1267_ -= i_1271_;
		i_1261_ = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385);
		i_1264_ += i_1271_ * i_1266_;
		i_1270_ += i_1271_ * i_1265_;
	    }
	    if (i_1261_ + i_1267_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_1267_ -= (i_1261_ + i_1267_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_1272_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_1266_ -= i_1272_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_1264_ += i_1272_;
		i_1270_ += i_1272_;
		i_1269_ += i_1272_;
		i_1268_ += i_1272_;
	    }
	    if (i + i_1266_ > (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_1273_ = (i + i_1266_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_1266_ -= i_1273_;
		i_1269_ += i_1273_;
		i_1268_ += i_1273_;
	    }
	    if (i_1266_ > 0 && i_1267_ > 0) {
		Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
		int[] is_1274_
		    = ((Class135_Sub1) class135_sub1).anIntArray9874;
		int[] is_1275_
		    = ((Class135_Sub1) class135_sub1).anIntArray9873;
		int i_1276_ = i_1261_;
		if (i_1263_ > i_1276_) {
		    i_1276_ = i_1263_;
		    i_1270_ += (i_1263_ - i_1261_) * i_1265_;
		    i_1264_ += ((i_1263_ - i_1261_)
				* ((Class168_Sub2_Sub2) this).anInt9920);
		}
		int i_1277_
		    = (i_1263_ + is_1274_.length < i_1261_ + i_1267_
		       ? i_1263_ + is_1274_.length : i_1261_ + i_1267_);
		for (int i_1278_ = i_1276_; i_1278_ < i_1277_; i_1278_++) {
		    int i_1279_ = is_1274_[i_1278_ - i_1263_] + i_1262_;
		    int i_1280_ = is_1275_[i_1278_ - i_1263_];
		    int i_1281_ = i_1266_;
		    if (i > i_1279_) {
			int i_1282_ = i - i_1279_;
			if (i_1282_ >= i_1280_) {
			    i_1264_ += i_1266_ + i_1269_;
			    i_1270_ += i_1266_ + i_1268_;
			    continue;
			}
			i_1280_ -= i_1282_;
		    } else {
			int i_1283_ = i_1279_ - i;
			if (i_1283_ >= i_1266_) {
			    i_1264_ += i_1266_ + i_1269_;
			    i_1270_ += i_1266_ + i_1268_;
			    continue;
			}
			i_1264_ += i_1283_;
			i_1281_ -= i_1283_;
			i_1270_ += i_1283_;
		    }
		    int i_1284_ = 0;
		    if (i_1281_ < i_1280_)
			i_1280_ = i_1281_;
		    else
			i_1284_ = i_1281_ - i_1280_;
		    for (int i_1285_ = -i_1280_; i_1285_ < 0; i_1285_++) {
			int i_1286_ = (((Class168_Sub2_Sub2) this)
				       .anIntArray11124[i_1264_++]);
			int i_1287_ = i_1286_ >>> 24;
			int i_1288_ = 256 - i_1287_;
			int i_1289_ = is[i_1270_];
			is[i_1270_++] = ((((i_1286_ & 0xff00ff) * i_1287_
					   + (i_1289_ & 0xff00ff) * i_1288_)
					  & ~0xff00ff)
					 + (((i_1286_ & 0xff00) * i_1287_
					     + (i_1289_ & 0xff00) * i_1288_)
					    & 0xff0000)) >> 8;
		    }
		    i_1264_ += i_1284_ + i_1269_;
		    i_1270_ += i_1284_ + i_1268_;
		}
	    }
	}
    }
    
    void method3640(int i, int i_1290_, int i_1291_, int i_1292_, int i_1293_,
		    int i_1294_, int i_1295_, int i_1296_) {
	if (((Class168_Sub2_Sub2) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	if (i_1291_ > 0 && i_1292_ > 0) {
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (is != null) {
		int i_1297_ = 0;
		int i_1298_ = 0;
		int i_1299_
		    = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					 .aClass103_Sub2_9904)).anInt9260
		       * -1826993761);
		int i_1300_ = (((Class168_Sub2_Sub2) this).anInt9907
			       + ((Class168_Sub2_Sub2) this).anInt9920
			       + ((Class168_Sub2_Sub2) this).anInt9909);
		int i_1301_ = (((Class168_Sub2_Sub2) this).anInt9905
			       + ((Class168_Sub2_Sub2) this).anInt9916
			       + ((Class168_Sub2_Sub2) this).anInt9910);
		int i_1302_ = (i_1300_ << 16) / i_1291_;
		int i_1303_ = (i_1301_ << 16) / i_1292_;
		if (((Class168_Sub2_Sub2) this).anInt9907 > 0) {
		    int i_1304_
			= (((((Class168_Sub2_Sub2) this).anInt9907 << 16)
			    + i_1302_ - 1)
			   / i_1302_);
		    i += i_1304_;
		    i_1297_
			+= (i_1304_ * i_1302_
			    - (((Class168_Sub2_Sub2) this).anInt9907 << 16));
		}
		if (((Class168_Sub2_Sub2) this).anInt9905 > 0) {
		    int i_1305_
			= (((((Class168_Sub2_Sub2) this).anInt9905 << 16)
			    + i_1303_ - 1)
			   / i_1303_);
		    i_1290_ += i_1305_;
		    i_1298_
			+= (i_1305_ * i_1303_
			    - (((Class168_Sub2_Sub2) this).anInt9905 << 16));
		}
		if (((Class168_Sub2_Sub2) this).anInt9920 < i_1300_)
		    i_1291_ = ((((Class168_Sub2_Sub2) this).anInt9920 << 16)
			       - i_1297_ + i_1302_ - 1) / i_1302_;
		if (((Class168_Sub2_Sub2) this).anInt9916 < i_1301_)
		    i_1292_ = ((((Class168_Sub2_Sub2) this).anInt9916 << 16)
			       - i_1298_ + i_1303_ - 1) / i_1303_;
		int i_1306_ = i + i_1290_ * i_1299_;
		int i_1307_ = i_1299_ - i_1291_;
		if (i_1290_ + i_1292_
		    > (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					 .aClass103_Sub2_9904)).anInt9252
		       * 1546170165))
		    i_1292_
			-= (i_1290_ + i_1292_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
		if (i_1290_ < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9254) * -788450385) {
		    int i_1308_
			= ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					      .aClass103_Sub2_9904)).anInt9254
			    * -788450385)
			   - i_1290_);
		    i_1292_ -= i_1308_;
		    i_1306_ += i_1308_ * i_1299_;
		    i_1298_ += i_1303_ * i_1308_;
		}
		if (i + i_1291_
		    > (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					 .aClass103_Sub2_9904)).anInt9250
		       * 325436811)) {
		    int i_1309_
			= (i + i_1291_
			   - (((Class103_Sub2)
			       ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			      .anInt9250) * 325436811);
		    i_1291_ -= i_1309_;
		    i_1307_ += i_1309_;
		}
		if (i < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					   .aClass103_Sub2_9904)).anInt9249
			 * 1298750001)) {
		    int i_1310_
			= ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					      .aClass103_Sub2_9904)).anInt9249
			    * 1298750001)
			   - i);
		    i_1291_ -= i_1310_;
		    i_1306_ += i_1310_;
		    i_1297_ += i_1302_ * i_1310_;
		    i_1307_ += i_1310_;
		}
		if (i_1295_ == 0) {
		    if (i_1293_ == 1) {
			int i_1311_ = i_1297_;
			for (int i_1312_ = -i_1292_; i_1312_ < 0; i_1312_++) {
			    int i_1313_
				= ((i_1298_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1314_ = -i_1291_; i_1314_ < 0;
				 i_1314_++) {
				is[i_1306_++] = (((Class168_Sub2_Sub2) this)
						 .anIntArray11124
						 [(i_1297_ >> 16) + i_1313_]);
				i_1297_ += i_1302_;
			    }
			    i_1298_ += i_1303_;
			    i_1297_ = i_1311_;
			    i_1306_ += i_1307_;
			}
		    } else if (i_1293_ == 0) {
			int i_1315_ = (i_1294_ & 0xff0000) >> 16;
			int i_1316_ = (i_1294_ & 0xff00) >> 8;
			int i_1317_ = i_1294_ & 0xff;
			int i_1318_ = i_1297_;
			for (int i_1319_ = -i_1292_; i_1319_ < 0; i_1319_++) {
			    int i_1320_
				= ((i_1298_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1321_ = -i_1291_; i_1321_ < 0;
				 i_1321_++) {
				int i_1322_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1297_ >> 16) + i_1320_]);
				int i_1323_ = ((i_1322_ & 0xff0000) * i_1315_
					       & ~0xffffff);
				int i_1324_
				    = (i_1322_ & 0xff00) * i_1316_ & 0xff0000;
				int i_1325_
				    = (i_1322_ & 0xff) * i_1317_ & 0xff00;
				is[i_1306_++]
				    = (i_1323_ | i_1324_ | i_1325_) >>> 8;
				i_1297_ += i_1302_;
			    }
			    i_1298_ += i_1303_;
			    i_1297_ = i_1318_;
			    i_1306_ += i_1307_;
			}
		    } else if (i_1293_ == 3) {
			int i_1326_ = i_1297_;
			for (int i_1327_ = -i_1292_; i_1327_ < 0; i_1327_++) {
			    int i_1328_
				= ((i_1298_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1329_ = -i_1291_; i_1329_ < 0;
				 i_1329_++) {
				int i_1330_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1297_ >> 16) + i_1328_]);
				int i_1331_ = i_1330_ + i_1294_;
				int i_1332_ = ((i_1330_ & 0xff00ff)
					       + (i_1294_ & 0xff00ff));
				int i_1333_
				    = ((i_1332_ & 0x1000100)
				       + (i_1331_ - i_1332_ & 0x10000));
				is[i_1306_++]
				    = i_1331_ - i_1333_ | i_1333_ - (i_1333_
								     >>> 8);
				i_1297_ += i_1302_;
			    }
			    i_1298_ += i_1303_;
			    i_1297_ = i_1326_;
			    i_1306_ += i_1307_;
			}
		    } else if (i_1293_ == 2) {
			int i_1334_ = i_1294_ >>> 24;
			int i_1335_ = 256 - i_1334_;
			int i_1336_
			    = (i_1294_ & 0xff00ff) * i_1335_ & ~0xff00ff;
			int i_1337_ = (i_1294_ & 0xff00) * i_1335_ & 0xff0000;
			i_1294_ = (i_1336_ | i_1337_) >>> 8;
			int i_1338_ = i_1297_;
			for (int i_1339_ = -i_1292_; i_1339_ < 0; i_1339_++) {
			    int i_1340_
				= ((i_1298_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1341_ = -i_1291_; i_1341_ < 0;
				 i_1341_++) {
				int i_1342_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1297_ >> 16) + i_1340_]);
				i_1336_ = ((i_1342_ & 0xff00ff) * i_1334_
					   & ~0xff00ff);
				i_1337_
				    = (i_1342_ & 0xff00) * i_1334_ & 0xff0000;
				is[i_1306_++]
				    = ((i_1336_ | i_1337_) >>> 8) + i_1294_;
				i_1297_ += i_1302_;
			    }
			    i_1298_ += i_1303_;
			    i_1297_ = i_1338_;
			    i_1306_ += i_1307_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1295_ == 1) {
		    if (i_1293_ == 1) {
			int i_1343_ = i_1297_;
			for (int i_1344_ = -i_1292_; i_1344_ < 0; i_1344_++) {
			    int i_1345_
				= ((i_1298_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1346_ = -i_1291_; i_1346_ < 0;
				 i_1346_++) {
				int i_1347_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1297_ >> 16) + i_1345_]);
				int i_1348_ = i_1347_ >>> 24;
				int i_1349_ = 256 - i_1348_;
				int i_1350_ = is[i_1306_];
				is[i_1306_++]
				    = (((((i_1347_ & 0xff00ff) * i_1348_
					  + (i_1350_ & 0xff00ff) * i_1349_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_1347_ & ~0xff00ff) >>> 8)
					    * i_1348_)
					   + (((i_1350_ & ~0xff00ff) >>> 8)
					      * i_1349_))
					  & ~0xff00ff));
				i_1297_ += i_1302_;
			    }
			    i_1298_ += i_1303_;
			    i_1297_ = i_1343_;
			    i_1306_ += i_1307_;
			}
		    } else if (i_1293_ == 0) {
			int i_1351_ = i_1297_;
			if ((i_1294_ & 0xffffff) == 16777215) {
			    for (int i_1352_ = -i_1292_; i_1352_ < 0;
				 i_1352_++) {
				int i_1353_ = ((i_1298_ >> 16)
					       * (((Class168_Sub2_Sub2) this)
						  .anInt9920));
				for (int i_1354_ = -i_1291_; i_1354_ < 0;
				     i_1354_++) {
				    int i_1355_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1297_ >> 16) + i_1353_]);
				    int i_1356_
					= ((i_1355_ >>> 24) * (i_1294_ >>> 24)
					   >> 8);
				    int i_1357_ = 256 - i_1356_;
				    int i_1358_ = is[i_1306_];
				    is[i_1306_++]
					= ((((i_1355_ & 0xff00ff) * i_1356_
					     + (i_1358_ & 0xff00ff) * i_1357_)
					    & ~0xff00ff)
					   + (((i_1355_ & 0xff00) * i_1356_
					       + (i_1358_ & 0xff00) * i_1357_)
					      & 0xff0000)) >> 8;
				    i_1297_ += i_1302_;
				}
				i_1298_ += i_1303_;
				i_1297_ = i_1351_;
				i_1306_ += i_1307_;
			    }
			} else {
			    int i_1359_ = (i_1294_ & 0xff0000) >> 16;
			    int i_1360_ = (i_1294_ & 0xff00) >> 8;
			    int i_1361_ = i_1294_ & 0xff;
			    for (int i_1362_ = -i_1292_; i_1362_ < 0;
				 i_1362_++) {
				int i_1363_ = ((i_1298_ >> 16)
					       * (((Class168_Sub2_Sub2) this)
						  .anInt9920));
				for (int i_1364_ = -i_1291_; i_1364_ < 0;
				     i_1364_++) {
				    int i_1365_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1297_ >> 16) + i_1363_]);
				    int i_1366_
					= ((i_1365_ >>> 24) * (i_1294_ >>> 24)
					   >> 8);
				    int i_1367_ = 256 - i_1366_;
				    if (i_1366_ != 255) {
					int i_1368_
					    = ((i_1365_ & 0xff0000) * i_1359_
					       & ~0xffffff);
					int i_1369_
					    = ((i_1365_ & 0xff00) * i_1360_
					       & 0xff0000);
					int i_1370_
					    = ((i_1365_ & 0xff) * i_1361_
					       & 0xff00);
					i_1365_ = (i_1368_ | i_1369_
						   | i_1370_) >>> 8;
					int i_1371_ = is[i_1306_];
					is[i_1306_++]
					    = ((((i_1365_ & 0xff00ff) * i_1366_
						 + ((i_1371_ & 0xff00ff)
						    * i_1367_))
						& ~0xff00ff)
					       + (((i_1365_ & 0xff00) * i_1366_
						   + ((i_1371_ & 0xff00)
						      * i_1367_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_1372_
					    = ((i_1365_ & 0xff0000) * i_1359_
					       & ~0xffffff);
					int i_1373_
					    = ((i_1365_ & 0xff00) * i_1360_
					       & 0xff0000);
					int i_1374_
					    = ((i_1365_ & 0xff) * i_1361_
					       & 0xff00);
					is[i_1306_++] = (i_1372_ | i_1373_
							 | i_1374_) >>> 8;
				    }
				    i_1297_ += i_1302_;
				}
				i_1298_ += i_1303_;
				i_1297_ = i_1351_;
				i_1306_ += i_1307_;
			    }
			}
		    } else if (i_1293_ == 3) {
			int i_1375_ = i_1297_;
			for (int i_1376_ = -i_1292_; i_1376_ < 0; i_1376_++) {
			    int i_1377_
				= ((i_1298_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1378_ = -i_1291_; i_1378_ < 0;
				 i_1378_++) {
				int i_1379_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1297_ >> 16) + i_1377_]);
				int i_1380_ = i_1379_ + i_1294_;
				int i_1381_ = ((i_1379_ & 0xff00ff)
					       + (i_1294_ & 0xff00ff));
				int i_1382_
				    = ((i_1381_ & 0x1000100)
				       + (i_1380_ - i_1381_ & 0x10000));
				i_1382_
				    = i_1380_ - i_1382_ | i_1382_ - (i_1382_
								     >>> 8);
				int i_1383_
				    = (i_1382_ >>> 24) * (i_1294_ >>> 24) >> 8;
				int i_1384_ = 256 - i_1383_;
				if (i_1383_ != 255) {
				    i_1379_ = i_1382_;
				    i_1382_ = is[i_1306_];
				    i_1382_
					= ((((i_1379_ & 0xff00ff) * i_1383_
					     + (i_1382_ & 0xff00ff) * i_1384_)
					    & ~0xff00ff)
					   + (((i_1379_ & 0xff00) * i_1383_
					       + (i_1382_ & 0xff00) * i_1384_)
					      & 0xff0000)) >> 8;
				}
				is[i_1306_++] = i_1382_;
				i_1297_ += i_1302_;
			    }
			    i_1298_ += i_1303_;
			    i_1297_ = i_1375_;
			    i_1306_ += i_1307_;
			}
		    } else if (i_1293_ == 2) {
			int i_1385_ = i_1294_ >>> 24;
			int i_1386_ = 256 - i_1385_;
			int i_1387_
			    = (i_1294_ & 0xff00ff) * i_1386_ & ~0xff00ff;
			int i_1388_ = (i_1294_ & 0xff00) * i_1386_ & 0xff0000;
			i_1294_ = (i_1387_ | i_1388_) >>> 8;
			int i_1389_ = i_1297_;
			for (int i_1390_ = -i_1292_; i_1390_ < 0; i_1390_++) {
			    int i_1391_
				= ((i_1298_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1392_ = -i_1291_; i_1392_ < 0;
				 i_1392_++) {
				int i_1393_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1297_ >> 16) + i_1391_]);
				int i_1394_ = i_1393_ >>> 24;
				int i_1395_ = 256 - i_1394_;
				i_1387_ = ((i_1393_ & 0xff00ff) * i_1385_
					   & ~0xff00ff);
				i_1388_
				    = (i_1393_ & 0xff00) * i_1385_ & 0xff0000;
				i_1393_
				    = ((i_1387_ | i_1388_) >>> 8) + i_1294_;
				int i_1396_ = is[i_1306_];
				is[i_1306_++]
				    = ((((i_1393_ & 0xff00ff) * i_1394_
					 + (i_1396_ & 0xff00ff) * i_1395_)
					& ~0xff00ff)
				       + (((i_1393_ & 0xff00) * i_1394_
					   + (i_1396_ & 0xff00) * i_1395_)
					  & 0xff0000)) >> 8;
				i_1297_ += i_1302_;
			    }
			    i_1298_ += i_1303_;
			    i_1297_ = i_1389_;
			    i_1306_ += i_1307_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1295_ == 2) {
		    if (i_1293_ == 1) {
			int i_1397_ = i_1297_;
			for (int i_1398_ = -i_1292_; i_1398_ < 0; i_1398_++) {
			    int i_1399_
				= ((i_1298_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1400_ = -i_1291_; i_1400_ < 0;
				 i_1400_++) {
				int i_1401_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1297_ >> 16) + i_1399_]);
				if (i_1401_ != 0) {
				    int i_1402_ = is[i_1306_];
				    int i_1403_ = i_1401_ + i_1402_;
				    int i_1404_ = ((i_1401_ & 0xff00ff)
						   + (i_1402_ & 0xff00ff));
				    i_1402_
					= ((i_1404_ & 0x1000100)
					   + (i_1403_ - i_1404_ & 0x10000));
				    is[i_1306_++]
					= (i_1403_ - i_1402_
					   | i_1402_ - (i_1402_ >>> 8));
				} else
				    i_1306_++;
				i_1297_ += i_1302_;
			    }
			    i_1298_ += i_1303_;
			    i_1297_ = i_1397_;
			    i_1306_ += i_1307_;
			}
		    } else if (i_1293_ == 0) {
			int i_1405_ = i_1297_;
			int i_1406_ = (i_1294_ & 0xff0000) >> 16;
			int i_1407_ = (i_1294_ & 0xff00) >> 8;
			int i_1408_ = i_1294_ & 0xff;
			for (int i_1409_ = -i_1292_; i_1409_ < 0; i_1409_++) {
			    int i_1410_
				= ((i_1298_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1411_ = -i_1291_; i_1411_ < 0;
				 i_1411_++) {
				int i_1412_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1297_ >> 16) + i_1410_]);
				if (i_1412_ != 0) {
				    int i_1413_
					= ((i_1412_ & 0xff0000) * i_1406_
					   & ~0xffffff);
				    int i_1414_ = ((i_1412_ & 0xff00) * i_1407_
						   & 0xff0000);
				    int i_1415_
					= (i_1412_ & 0xff) * i_1408_ & 0xff00;
				    i_1412_
					= (i_1413_ | i_1414_ | i_1415_) >>> 8;
				    int i_1416_ = is[i_1306_];
				    int i_1417_ = i_1412_ + i_1416_;
				    int i_1418_ = ((i_1412_ & 0xff00ff)
						   + (i_1416_ & 0xff00ff));
				    i_1416_
					= ((i_1418_ & 0x1000100)
					   + (i_1417_ - i_1418_ & 0x10000));
				    is[i_1306_++]
					= (i_1417_ - i_1416_
					   | i_1416_ - (i_1416_ >>> 8));
				} else
				    i_1306_++;
				i_1297_ += i_1302_;
			    }
			    i_1298_ += i_1303_;
			    i_1297_ = i_1405_;
			    i_1306_ += i_1307_;
			}
		    } else if (i_1293_ == 3) {
			int i_1419_ = i_1297_;
			for (int i_1420_ = -i_1292_; i_1420_ < 0; i_1420_++) {
			    int i_1421_
				= ((i_1298_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1422_ = -i_1291_; i_1422_ < 0;
				 i_1422_++) {
				int i_1423_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1297_ >> 16) + i_1421_]);
				int i_1424_ = i_1423_ + i_1294_;
				int i_1425_ = ((i_1423_ & 0xff00ff)
					       + (i_1294_ & 0xff00ff));
				int i_1426_
				    = ((i_1425_ & 0x1000100)
				       + (i_1424_ - i_1425_ & 0x10000));
				i_1423_
				    = i_1424_ - i_1426_ | i_1426_ - (i_1426_
								     >>> 8);
				i_1426_ = is[i_1306_];
				i_1424_ = i_1423_ + i_1426_;
				i_1425_ = (i_1423_ & 0xff00ff) + (i_1426_
								  & 0xff00ff);
				i_1426_ = ((i_1425_ & 0x1000100)
					   + (i_1424_ - i_1425_ & 0x10000));
				is[i_1306_++]
				    = i_1424_ - i_1426_ | i_1426_ - (i_1426_
								     >>> 8);
				i_1297_ += i_1302_;
			    }
			    i_1298_ += i_1303_;
			    i_1297_ = i_1419_;
			    i_1306_ += i_1307_;
			}
		    } else if (i_1293_ == 2) {
			int i_1427_ = i_1294_ >>> 24;
			int i_1428_ = 256 - i_1427_;
			int i_1429_
			    = (i_1294_ & 0xff00ff) * i_1428_ & ~0xff00ff;
			int i_1430_ = (i_1294_ & 0xff00) * i_1428_ & 0xff0000;
			i_1294_ = (i_1429_ | i_1430_) >>> 8;
			int i_1431_ = i_1297_;
			for (int i_1432_ = -i_1292_; i_1432_ < 0; i_1432_++) {
			    int i_1433_
				= ((i_1298_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1434_ = -i_1291_; i_1434_ < 0;
				 i_1434_++) {
				int i_1435_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1297_ >> 16) + i_1433_]);
				if (i_1435_ != 0) {
				    i_1429_ = ((i_1435_ & 0xff00ff) * i_1427_
					       & ~0xff00ff);
				    i_1430_ = ((i_1435_ & 0xff00) * i_1427_
					       & 0xff0000);
				    i_1435_ = (((i_1429_ | i_1430_) >>> 8)
					       + i_1294_);
				    int i_1436_ = is[i_1306_];
				    int i_1437_ = i_1435_ + i_1436_;
				    int i_1438_ = ((i_1435_ & 0xff00ff)
						   + (i_1436_ & 0xff00ff));
				    i_1436_
					= ((i_1438_ & 0x1000100)
					   + (i_1437_ - i_1438_ & 0x10000));
				    is[i_1306_++]
					= (i_1437_ - i_1436_
					   | i_1436_ - (i_1436_ >>> 8));
				} else
				    i_1306_++;
				i_1297_ += i_1302_;
			    }
			    i_1298_ += i_1303_;
			    i_1297_ = i_1431_;
			    i_1306_ += i_1307_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method3641(int i, int i_1439_, int i_1440_, int i_1441_, int i_1442_,
		    int i_1443_, int i_1444_, int i_1445_) {
	if (((Class168_Sub2_Sub2) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	if (i_1440_ > 0 && i_1441_ > 0) {
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (is != null) {
		int i_1446_ = 0;
		int i_1447_ = 0;
		int i_1448_
		    = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					 .aClass103_Sub2_9904)).anInt9260
		       * -1826993761);
		int i_1449_ = (((Class168_Sub2_Sub2) this).anInt9907
			       + ((Class168_Sub2_Sub2) this).anInt9920
			       + ((Class168_Sub2_Sub2) this).anInt9909);
		int i_1450_ = (((Class168_Sub2_Sub2) this).anInt9905
			       + ((Class168_Sub2_Sub2) this).anInt9916
			       + ((Class168_Sub2_Sub2) this).anInt9910);
		int i_1451_ = (i_1449_ << 16) / i_1440_;
		int i_1452_ = (i_1450_ << 16) / i_1441_;
		if (((Class168_Sub2_Sub2) this).anInt9907 > 0) {
		    int i_1453_
			= (((((Class168_Sub2_Sub2) this).anInt9907 << 16)
			    + i_1451_ - 1)
			   / i_1451_);
		    i += i_1453_;
		    i_1446_
			+= (i_1453_ * i_1451_
			    - (((Class168_Sub2_Sub2) this).anInt9907 << 16));
		}
		if (((Class168_Sub2_Sub2) this).anInt9905 > 0) {
		    int i_1454_
			= (((((Class168_Sub2_Sub2) this).anInt9905 << 16)
			    + i_1452_ - 1)
			   / i_1452_);
		    i_1439_ += i_1454_;
		    i_1447_
			+= (i_1454_ * i_1452_
			    - (((Class168_Sub2_Sub2) this).anInt9905 << 16));
		}
		if (((Class168_Sub2_Sub2) this).anInt9920 < i_1449_)
		    i_1440_ = ((((Class168_Sub2_Sub2) this).anInt9920 << 16)
			       - i_1446_ + i_1451_ - 1) / i_1451_;
		if (((Class168_Sub2_Sub2) this).anInt9916 < i_1450_)
		    i_1441_ = ((((Class168_Sub2_Sub2) this).anInt9916 << 16)
			       - i_1447_ + i_1452_ - 1) / i_1452_;
		int i_1455_ = i + i_1439_ * i_1448_;
		int i_1456_ = i_1448_ - i_1440_;
		if (i_1439_ + i_1441_
		    > (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					 .aClass103_Sub2_9904)).anInt9252
		       * 1546170165))
		    i_1441_
			-= (i_1439_ + i_1441_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
		if (i_1439_ < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9254) * -788450385) {
		    int i_1457_
			= ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					      .aClass103_Sub2_9904)).anInt9254
			    * -788450385)
			   - i_1439_);
		    i_1441_ -= i_1457_;
		    i_1455_ += i_1457_ * i_1448_;
		    i_1447_ += i_1452_ * i_1457_;
		}
		if (i + i_1440_
		    > (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					 .aClass103_Sub2_9904)).anInt9250
		       * 325436811)) {
		    int i_1458_
			= (i + i_1440_
			   - (((Class103_Sub2)
			       ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			      .anInt9250) * 325436811);
		    i_1440_ -= i_1458_;
		    i_1456_ += i_1458_;
		}
		if (i < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					   .aClass103_Sub2_9904)).anInt9249
			 * 1298750001)) {
		    int i_1459_
			= ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					      .aClass103_Sub2_9904)).anInt9249
			    * 1298750001)
			   - i);
		    i_1440_ -= i_1459_;
		    i_1455_ += i_1459_;
		    i_1446_ += i_1451_ * i_1459_;
		    i_1456_ += i_1459_;
		}
		if (i_1444_ == 0) {
		    if (i_1442_ == 1) {
			int i_1460_ = i_1446_;
			for (int i_1461_ = -i_1441_; i_1461_ < 0; i_1461_++) {
			    int i_1462_
				= ((i_1447_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1463_ = -i_1440_; i_1463_ < 0;
				 i_1463_++) {
				is[i_1455_++] = (((Class168_Sub2_Sub2) this)
						 .anIntArray11124
						 [(i_1446_ >> 16) + i_1462_]);
				i_1446_ += i_1451_;
			    }
			    i_1447_ += i_1452_;
			    i_1446_ = i_1460_;
			    i_1455_ += i_1456_;
			}
		    } else if (i_1442_ == 0) {
			int i_1464_ = (i_1443_ & 0xff0000) >> 16;
			int i_1465_ = (i_1443_ & 0xff00) >> 8;
			int i_1466_ = i_1443_ & 0xff;
			int i_1467_ = i_1446_;
			for (int i_1468_ = -i_1441_; i_1468_ < 0; i_1468_++) {
			    int i_1469_
				= ((i_1447_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1470_ = -i_1440_; i_1470_ < 0;
				 i_1470_++) {
				int i_1471_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1446_ >> 16) + i_1469_]);
				int i_1472_ = ((i_1471_ & 0xff0000) * i_1464_
					       & ~0xffffff);
				int i_1473_
				    = (i_1471_ & 0xff00) * i_1465_ & 0xff0000;
				int i_1474_
				    = (i_1471_ & 0xff) * i_1466_ & 0xff00;
				is[i_1455_++]
				    = (i_1472_ | i_1473_ | i_1474_) >>> 8;
				i_1446_ += i_1451_;
			    }
			    i_1447_ += i_1452_;
			    i_1446_ = i_1467_;
			    i_1455_ += i_1456_;
			}
		    } else if (i_1442_ == 3) {
			int i_1475_ = i_1446_;
			for (int i_1476_ = -i_1441_; i_1476_ < 0; i_1476_++) {
			    int i_1477_
				= ((i_1447_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1478_ = -i_1440_; i_1478_ < 0;
				 i_1478_++) {
				int i_1479_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1446_ >> 16) + i_1477_]);
				int i_1480_ = i_1479_ + i_1443_;
				int i_1481_ = ((i_1479_ & 0xff00ff)
					       + (i_1443_ & 0xff00ff));
				int i_1482_
				    = ((i_1481_ & 0x1000100)
				       + (i_1480_ - i_1481_ & 0x10000));
				is[i_1455_++]
				    = i_1480_ - i_1482_ | i_1482_ - (i_1482_
								     >>> 8);
				i_1446_ += i_1451_;
			    }
			    i_1447_ += i_1452_;
			    i_1446_ = i_1475_;
			    i_1455_ += i_1456_;
			}
		    } else if (i_1442_ == 2) {
			int i_1483_ = i_1443_ >>> 24;
			int i_1484_ = 256 - i_1483_;
			int i_1485_
			    = (i_1443_ & 0xff00ff) * i_1484_ & ~0xff00ff;
			int i_1486_ = (i_1443_ & 0xff00) * i_1484_ & 0xff0000;
			i_1443_ = (i_1485_ | i_1486_) >>> 8;
			int i_1487_ = i_1446_;
			for (int i_1488_ = -i_1441_; i_1488_ < 0; i_1488_++) {
			    int i_1489_
				= ((i_1447_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1490_ = -i_1440_; i_1490_ < 0;
				 i_1490_++) {
				int i_1491_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1446_ >> 16) + i_1489_]);
				i_1485_ = ((i_1491_ & 0xff00ff) * i_1483_
					   & ~0xff00ff);
				i_1486_
				    = (i_1491_ & 0xff00) * i_1483_ & 0xff0000;
				is[i_1455_++]
				    = ((i_1485_ | i_1486_) >>> 8) + i_1443_;
				i_1446_ += i_1451_;
			    }
			    i_1447_ += i_1452_;
			    i_1446_ = i_1487_;
			    i_1455_ += i_1456_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1444_ == 1) {
		    if (i_1442_ == 1) {
			int i_1492_ = i_1446_;
			for (int i_1493_ = -i_1441_; i_1493_ < 0; i_1493_++) {
			    int i_1494_
				= ((i_1447_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1495_ = -i_1440_; i_1495_ < 0;
				 i_1495_++) {
				int i_1496_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1446_ >> 16) + i_1494_]);
				int i_1497_ = i_1496_ >>> 24;
				int i_1498_ = 256 - i_1497_;
				int i_1499_ = is[i_1455_];
				is[i_1455_++]
				    = (((((i_1496_ & 0xff00ff) * i_1497_
					  + (i_1499_ & 0xff00ff) * i_1498_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_1496_ & ~0xff00ff) >>> 8)
					    * i_1497_)
					   + (((i_1499_ & ~0xff00ff) >>> 8)
					      * i_1498_))
					  & ~0xff00ff));
				i_1446_ += i_1451_;
			    }
			    i_1447_ += i_1452_;
			    i_1446_ = i_1492_;
			    i_1455_ += i_1456_;
			}
		    } else if (i_1442_ == 0) {
			int i_1500_ = i_1446_;
			if ((i_1443_ & 0xffffff) == 16777215) {
			    for (int i_1501_ = -i_1441_; i_1501_ < 0;
				 i_1501_++) {
				int i_1502_ = ((i_1447_ >> 16)
					       * (((Class168_Sub2_Sub2) this)
						  .anInt9920));
				for (int i_1503_ = -i_1440_; i_1503_ < 0;
				     i_1503_++) {
				    int i_1504_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1446_ >> 16) + i_1502_]);
				    int i_1505_
					= ((i_1504_ >>> 24) * (i_1443_ >>> 24)
					   >> 8);
				    int i_1506_ = 256 - i_1505_;
				    int i_1507_ = is[i_1455_];
				    is[i_1455_++]
					= ((((i_1504_ & 0xff00ff) * i_1505_
					     + (i_1507_ & 0xff00ff) * i_1506_)
					    & ~0xff00ff)
					   + (((i_1504_ & 0xff00) * i_1505_
					       + (i_1507_ & 0xff00) * i_1506_)
					      & 0xff0000)) >> 8;
				    i_1446_ += i_1451_;
				}
				i_1447_ += i_1452_;
				i_1446_ = i_1500_;
				i_1455_ += i_1456_;
			    }
			} else {
			    int i_1508_ = (i_1443_ & 0xff0000) >> 16;
			    int i_1509_ = (i_1443_ & 0xff00) >> 8;
			    int i_1510_ = i_1443_ & 0xff;
			    for (int i_1511_ = -i_1441_; i_1511_ < 0;
				 i_1511_++) {
				int i_1512_ = ((i_1447_ >> 16)
					       * (((Class168_Sub2_Sub2) this)
						  .anInt9920));
				for (int i_1513_ = -i_1440_; i_1513_ < 0;
				     i_1513_++) {
				    int i_1514_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1446_ >> 16) + i_1512_]);
				    int i_1515_
					= ((i_1514_ >>> 24) * (i_1443_ >>> 24)
					   >> 8);
				    int i_1516_ = 256 - i_1515_;
				    if (i_1515_ != 255) {
					int i_1517_
					    = ((i_1514_ & 0xff0000) * i_1508_
					       & ~0xffffff);
					int i_1518_
					    = ((i_1514_ & 0xff00) * i_1509_
					       & 0xff0000);
					int i_1519_
					    = ((i_1514_ & 0xff) * i_1510_
					       & 0xff00);
					i_1514_ = (i_1517_ | i_1518_
						   | i_1519_) >>> 8;
					int i_1520_ = is[i_1455_];
					is[i_1455_++]
					    = ((((i_1514_ & 0xff00ff) * i_1515_
						 + ((i_1520_ & 0xff00ff)
						    * i_1516_))
						& ~0xff00ff)
					       + (((i_1514_ & 0xff00) * i_1515_
						   + ((i_1520_ & 0xff00)
						      * i_1516_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_1521_
					    = ((i_1514_ & 0xff0000) * i_1508_
					       & ~0xffffff);
					int i_1522_
					    = ((i_1514_ & 0xff00) * i_1509_
					       & 0xff0000);
					int i_1523_
					    = ((i_1514_ & 0xff) * i_1510_
					       & 0xff00);
					is[i_1455_++] = (i_1521_ | i_1522_
							 | i_1523_) >>> 8;
				    }
				    i_1446_ += i_1451_;
				}
				i_1447_ += i_1452_;
				i_1446_ = i_1500_;
				i_1455_ += i_1456_;
			    }
			}
		    } else if (i_1442_ == 3) {
			int i_1524_ = i_1446_;
			for (int i_1525_ = -i_1441_; i_1525_ < 0; i_1525_++) {
			    int i_1526_
				= ((i_1447_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1527_ = -i_1440_; i_1527_ < 0;
				 i_1527_++) {
				int i_1528_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1446_ >> 16) + i_1526_]);
				int i_1529_ = i_1528_ + i_1443_;
				int i_1530_ = ((i_1528_ & 0xff00ff)
					       + (i_1443_ & 0xff00ff));
				int i_1531_
				    = ((i_1530_ & 0x1000100)
				       + (i_1529_ - i_1530_ & 0x10000));
				i_1531_
				    = i_1529_ - i_1531_ | i_1531_ - (i_1531_
								     >>> 8);
				int i_1532_
				    = (i_1531_ >>> 24) * (i_1443_ >>> 24) >> 8;
				int i_1533_ = 256 - i_1532_;
				if (i_1532_ != 255) {
				    i_1528_ = i_1531_;
				    i_1531_ = is[i_1455_];
				    i_1531_
					= ((((i_1528_ & 0xff00ff) * i_1532_
					     + (i_1531_ & 0xff00ff) * i_1533_)
					    & ~0xff00ff)
					   + (((i_1528_ & 0xff00) * i_1532_
					       + (i_1531_ & 0xff00) * i_1533_)
					      & 0xff0000)) >> 8;
				}
				is[i_1455_++] = i_1531_;
				i_1446_ += i_1451_;
			    }
			    i_1447_ += i_1452_;
			    i_1446_ = i_1524_;
			    i_1455_ += i_1456_;
			}
		    } else if (i_1442_ == 2) {
			int i_1534_ = i_1443_ >>> 24;
			int i_1535_ = 256 - i_1534_;
			int i_1536_
			    = (i_1443_ & 0xff00ff) * i_1535_ & ~0xff00ff;
			int i_1537_ = (i_1443_ & 0xff00) * i_1535_ & 0xff0000;
			i_1443_ = (i_1536_ | i_1537_) >>> 8;
			int i_1538_ = i_1446_;
			for (int i_1539_ = -i_1441_; i_1539_ < 0; i_1539_++) {
			    int i_1540_
				= ((i_1447_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1541_ = -i_1440_; i_1541_ < 0;
				 i_1541_++) {
				int i_1542_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1446_ >> 16) + i_1540_]);
				int i_1543_ = i_1542_ >>> 24;
				int i_1544_ = 256 - i_1543_;
				i_1536_ = ((i_1542_ & 0xff00ff) * i_1534_
					   & ~0xff00ff);
				i_1537_
				    = (i_1542_ & 0xff00) * i_1534_ & 0xff0000;
				i_1542_
				    = ((i_1536_ | i_1537_) >>> 8) + i_1443_;
				int i_1545_ = is[i_1455_];
				is[i_1455_++]
				    = ((((i_1542_ & 0xff00ff) * i_1543_
					 + (i_1545_ & 0xff00ff) * i_1544_)
					& ~0xff00ff)
				       + (((i_1542_ & 0xff00) * i_1543_
					   + (i_1545_ & 0xff00) * i_1544_)
					  & 0xff0000)) >> 8;
				i_1446_ += i_1451_;
			    }
			    i_1447_ += i_1452_;
			    i_1446_ = i_1538_;
			    i_1455_ += i_1456_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1444_ == 2) {
		    if (i_1442_ == 1) {
			int i_1546_ = i_1446_;
			for (int i_1547_ = -i_1441_; i_1547_ < 0; i_1547_++) {
			    int i_1548_
				= ((i_1447_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1549_ = -i_1440_; i_1549_ < 0;
				 i_1549_++) {
				int i_1550_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1446_ >> 16) + i_1548_]);
				if (i_1550_ != 0) {
				    int i_1551_ = is[i_1455_];
				    int i_1552_ = i_1550_ + i_1551_;
				    int i_1553_ = ((i_1550_ & 0xff00ff)
						   + (i_1551_ & 0xff00ff));
				    i_1551_
					= ((i_1553_ & 0x1000100)
					   + (i_1552_ - i_1553_ & 0x10000));
				    is[i_1455_++]
					= (i_1552_ - i_1551_
					   | i_1551_ - (i_1551_ >>> 8));
				} else
				    i_1455_++;
				i_1446_ += i_1451_;
			    }
			    i_1447_ += i_1452_;
			    i_1446_ = i_1546_;
			    i_1455_ += i_1456_;
			}
		    } else if (i_1442_ == 0) {
			int i_1554_ = i_1446_;
			int i_1555_ = (i_1443_ & 0xff0000) >> 16;
			int i_1556_ = (i_1443_ & 0xff00) >> 8;
			int i_1557_ = i_1443_ & 0xff;
			for (int i_1558_ = -i_1441_; i_1558_ < 0; i_1558_++) {
			    int i_1559_
				= ((i_1447_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1560_ = -i_1440_; i_1560_ < 0;
				 i_1560_++) {
				int i_1561_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1446_ >> 16) + i_1559_]);
				if (i_1561_ != 0) {
				    int i_1562_
					= ((i_1561_ & 0xff0000) * i_1555_
					   & ~0xffffff);
				    int i_1563_ = ((i_1561_ & 0xff00) * i_1556_
						   & 0xff0000);
				    int i_1564_
					= (i_1561_ & 0xff) * i_1557_ & 0xff00;
				    i_1561_
					= (i_1562_ | i_1563_ | i_1564_) >>> 8;
				    int i_1565_ = is[i_1455_];
				    int i_1566_ = i_1561_ + i_1565_;
				    int i_1567_ = ((i_1561_ & 0xff00ff)
						   + (i_1565_ & 0xff00ff));
				    i_1565_
					= ((i_1567_ & 0x1000100)
					   + (i_1566_ - i_1567_ & 0x10000));
				    is[i_1455_++]
					= (i_1566_ - i_1565_
					   | i_1565_ - (i_1565_ >>> 8));
				} else
				    i_1455_++;
				i_1446_ += i_1451_;
			    }
			    i_1447_ += i_1452_;
			    i_1446_ = i_1554_;
			    i_1455_ += i_1456_;
			}
		    } else if (i_1442_ == 3) {
			int i_1568_ = i_1446_;
			for (int i_1569_ = -i_1441_; i_1569_ < 0; i_1569_++) {
			    int i_1570_
				= ((i_1447_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1571_ = -i_1440_; i_1571_ < 0;
				 i_1571_++) {
				int i_1572_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1446_ >> 16) + i_1570_]);
				int i_1573_ = i_1572_ + i_1443_;
				int i_1574_ = ((i_1572_ & 0xff00ff)
					       + (i_1443_ & 0xff00ff));
				int i_1575_
				    = ((i_1574_ & 0x1000100)
				       + (i_1573_ - i_1574_ & 0x10000));
				i_1572_
				    = i_1573_ - i_1575_ | i_1575_ - (i_1575_
								     >>> 8);
				i_1575_ = is[i_1455_];
				i_1573_ = i_1572_ + i_1575_;
				i_1574_ = (i_1572_ & 0xff00ff) + (i_1575_
								  & 0xff00ff);
				i_1575_ = ((i_1574_ & 0x1000100)
					   + (i_1573_ - i_1574_ & 0x10000));
				is[i_1455_++]
				    = i_1573_ - i_1575_ | i_1575_ - (i_1575_
								     >>> 8);
				i_1446_ += i_1451_;
			    }
			    i_1447_ += i_1452_;
			    i_1446_ = i_1568_;
			    i_1455_ += i_1456_;
			}
		    } else if (i_1442_ == 2) {
			int i_1576_ = i_1443_ >>> 24;
			int i_1577_ = 256 - i_1576_;
			int i_1578_
			    = (i_1443_ & 0xff00ff) * i_1577_ & ~0xff00ff;
			int i_1579_ = (i_1443_ & 0xff00) * i_1577_ & 0xff0000;
			i_1443_ = (i_1578_ | i_1579_) >>> 8;
			int i_1580_ = i_1446_;
			for (int i_1581_ = -i_1441_; i_1581_ < 0; i_1581_++) {
			    int i_1582_
				= ((i_1447_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1583_ = -i_1440_; i_1583_ < 0;
				 i_1583_++) {
				int i_1584_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1446_ >> 16) + i_1582_]);
				if (i_1584_ != 0) {
				    i_1578_ = ((i_1584_ & 0xff00ff) * i_1576_
					       & ~0xff00ff);
				    i_1579_ = ((i_1584_ & 0xff00) * i_1576_
					       & 0xff0000);
				    i_1584_ = (((i_1578_ | i_1579_) >>> 8)
					       + i_1443_);
				    int i_1585_ = is[i_1455_];
				    int i_1586_ = i_1584_ + i_1585_;
				    int i_1587_ = ((i_1584_ & 0xff00ff)
						   + (i_1585_ & 0xff00ff));
				    i_1585_
					= ((i_1587_ & 0x1000100)
					   + (i_1586_ - i_1587_ & 0x10000));
				    is[i_1455_++]
					= (i_1586_ - i_1585_
					   | i_1585_ - (i_1585_ >>> 8));
				} else
				    i_1455_++;
				i_1446_ += i_1451_;
			    }
			    i_1447_ += i_1452_;
			    i_1446_ = i_1580_;
			    i_1455_ += i_1456_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method16222(int i, int i_1588_) {
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_1589_ = anInt9919;
		    while (i_1589_ < 0) {
			int i_1590_ = anInt9925;
			int i_1591_ = anInt9927;
			int i_1592_ = anInt9928;
			int i_1593_ = anInt9906;
			if (i_1591_ >= 0 && i_1592_ >= 0
			    && i_1591_ - (((Class168_Sub2_Sub2) this).anInt9920
					  << 12) < 0
			    && i_1592_ - (((Class168_Sub2_Sub2) this).anInt9916
					  << 12) < 0) {
			    for (/**/; i_1593_ < 0; i_1593_++)
				method17538(((i_1592_ >> 12)
					     * (((Class168_Sub2_Sub2) this)
						.anInt9920)) + (i_1591_ >> 12),
					    i_1590_++, is, i, i_1588_);
			}
			i_1589_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_1594_ = anInt9919;
		    while (i_1594_ < 0) {
			int i_1595_ = anInt9925;
			int i_1596_ = anInt9927;
			int i_1597_ = anInt9928 + anInt9930;
			int i_1598_ = anInt9906;
			if (i_1596_ >= 0
			    && i_1596_ - (((Class168_Sub2_Sub2) this).anInt9920
					  << 12) < 0) {
			    int i_1599_;
			    if ((i_1599_
				 = (i_1597_
				    - (((Class168_Sub2_Sub2) this).anInt9916
				       << 12)))
				>= 0) {
				i_1599_ = (anInt9922 - i_1599_) / anInt9922;
				i_1598_ += i_1599_;
				i_1597_ += anInt9922 * i_1599_;
				i_1595_ += i_1599_;
			    }
			    if ((i_1599_ = (i_1597_ - anInt9922) / anInt9922)
				> i_1598_)
				i_1598_ = i_1599_;
			    for (/**/; i_1598_ < 0; i_1598_++) {
				method17538(((i_1597_ >> 12)
					     * (((Class168_Sub2_Sub2) this)
						.anInt9920)) + (i_1596_ >> 12),
					    i_1595_++, is, i, i_1588_);
				i_1597_ += anInt9922;
			    }
			}
			i_1594_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_1600_ = anInt9919;
		    while (i_1600_ < 0) {
			int i_1601_ = anInt9925;
			int i_1602_ = anInt9927;
			int i_1603_ = anInt9928 + anInt9930;
			int i_1604_ = anInt9906;
			if (i_1602_ >= 0
			    && i_1602_ - (((Class168_Sub2_Sub2) this).anInt9920
					  << 12) < 0) {
			    if (i_1603_ < 0) {
				int i_1605_
				    = (anInt9922 - 1 - i_1603_) / anInt9922;
				i_1604_ += i_1605_;
				i_1603_ += anInt9922 * i_1605_;
				i_1601_ += i_1605_;
			    }
			    int i_1606_;
			    if ((i_1606_
				 = (1 + i_1603_
				    - (((Class168_Sub2_Sub2) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_1604_)
				i_1604_ = i_1606_;
			    for (/**/; i_1604_ < 0; i_1604_++) {
				method17538(((i_1603_ >> 12)
					     * (((Class168_Sub2_Sub2) this)
						.anInt9920)) + (i_1602_ >> 12),
					    i_1601_++, is, i, i_1588_);
				i_1603_ += anInt9922;
			    }
			}
			i_1600_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_1607_ = anInt9919;
		    while (i_1607_ < 0) {
			int i_1608_ = anInt9925;
			int i_1609_ = anInt9927 + anInt9929;
			int i_1610_ = anInt9928;
			int i_1611_ = anInt9906;
			if (i_1610_ >= 0
			    && i_1610_ - (((Class168_Sub2_Sub2) this).anInt9916
					  << 12) < 0) {
			    int i_1612_;
			    if ((i_1612_
				 = (i_1609_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)))
				>= 0) {
				i_1612_ = (anInt9921 - i_1612_) / anInt9921;
				i_1611_ += i_1612_;
				i_1609_ += anInt9921 * i_1612_;
				i_1608_ += i_1612_;
			    }
			    if ((i_1612_ = (i_1609_ - anInt9921) / anInt9921)
				> i_1611_)
				i_1611_ = i_1612_;
			    for (/**/; i_1611_ < 0; i_1611_++) {
				method17538(((i_1610_ >> 12)
					     * (((Class168_Sub2_Sub2) this)
						.anInt9920)) + (i_1609_ >> 12),
					    i_1608_++, is, i, i_1588_);
				i_1609_ += anInt9921;
			    }
			}
			i_1607_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_1613_ = anInt9919;
		    while (i_1613_ < 0) {
			int i_1614_ = anInt9925;
			int i_1615_ = anInt9927 + anInt9929;
			int i_1616_ = anInt9928 + anInt9930;
			int i_1617_ = anInt9906;
			int i_1618_;
			if ((i_1618_
			     = i_1615_ - (((Class168_Sub2_Sub2) this).anInt9920
					  << 12))
			    >= 0) {
			    i_1618_ = (anInt9921 - i_1618_) / anInt9921;
			    i_1617_ += i_1618_;
			    i_1615_ += anInt9921 * i_1618_;
			    i_1616_ += anInt9922 * i_1618_;
			    i_1614_ += i_1618_;
			}
			if ((i_1618_ = (i_1615_ - anInt9921) / anInt9921)
			    > i_1617_)
			    i_1617_ = i_1618_;
			if ((i_1618_
			     = i_1616_ - (((Class168_Sub2_Sub2) this).anInt9916
					  << 12))
			    >= 0) {
			    i_1618_ = (anInt9922 - i_1618_) / anInt9922;
			    i_1617_ += i_1618_;
			    i_1615_ += anInt9921 * i_1618_;
			    i_1616_ += anInt9922 * i_1618_;
			    i_1614_ += i_1618_;
			}
			if ((i_1618_ = (i_1616_ - anInt9922) / anInt9922)
			    > i_1617_)
			    i_1617_ = i_1618_;
			for (/**/; i_1617_ < 0; i_1617_++) {
			    method17538(((i_1616_ >> 12)
					 * (((Class168_Sub2_Sub2) this)
					    .anInt9920)) + (i_1615_ >> 12),
					i_1614_++, is, i, i_1588_);
			    i_1615_ += anInt9921;
			    i_1616_ += anInt9922;
			}
			i_1613_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_1619_ = anInt9919;
		    while (i_1619_ < 0) {
			int i_1620_ = anInt9925;
			int i_1621_ = anInt9927 + anInt9929;
			int i_1622_ = anInt9928 + anInt9930;
			int i_1623_ = anInt9906;
			int i_1624_;
			if ((i_1624_
			     = i_1621_ - (((Class168_Sub2_Sub2) this).anInt9920
					  << 12))
			    >= 0) {
			    i_1624_ = (anInt9921 - i_1624_) / anInt9921;
			    i_1623_ += i_1624_;
			    i_1621_ += anInt9921 * i_1624_;
			    i_1622_ += anInt9922 * i_1624_;
			    i_1620_ += i_1624_;
			}
			if ((i_1624_ = (i_1621_ - anInt9921) / anInt9921)
			    > i_1623_)
			    i_1623_ = i_1624_;
			if (i_1622_ < 0) {
			    i_1624_ = (anInt9922 - 1 - i_1622_) / anInt9922;
			    i_1623_ += i_1624_;
			    i_1621_ += anInt9921 * i_1624_;
			    i_1622_ += anInt9922 * i_1624_;
			    i_1620_ += i_1624_;
			}
			if ((i_1624_
			     = (1 + i_1622_
				- (((Class168_Sub2_Sub2) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_1623_)
			    i_1623_ = i_1624_;
			for (/**/; i_1623_ < 0; i_1623_++) {
			    method17538(((i_1622_ >> 12)
					 * (((Class168_Sub2_Sub2) this)
					    .anInt9920)) + (i_1621_ >> 12),
					i_1620_++, is, i, i_1588_);
			    i_1621_ += anInt9921;
			    i_1622_ += anInt9922;
			}
			i_1619_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_1625_ = anInt9919;
		while (i_1625_ < 0) {
		    int i_1626_ = anInt9925;
		    int i_1627_ = anInt9927 + anInt9929;
		    int i_1628_ = anInt9928;
		    int i_1629_ = anInt9906;
		    if (i_1628_ >= 0
			&& i_1628_ - (((Class168_Sub2_Sub2) this).anInt9916
				      << 12) < 0) {
			if (i_1627_ < 0) {
			    int i_1630_
				= (anInt9921 - 1 - i_1627_) / anInt9921;
			    i_1629_ += i_1630_;
			    i_1627_ += anInt9921 * i_1630_;
			    i_1626_ += i_1630_;
			}
			int i_1631_;
			if ((i_1631_
			     = (1 + i_1627_
				- (((Class168_Sub2_Sub2) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_1629_)
			    i_1629_ = i_1631_;
			for (/**/; i_1629_ < 0; i_1629_++) {
			    method17538(((i_1628_ >> 12)
					 * (((Class168_Sub2_Sub2) this)
					    .anInt9920)) + (i_1627_ >> 12),
					i_1626_++, is, i, i_1588_);
			    i_1627_ += anInt9921;
			}
		    }
		    i_1625_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		for (int i_1632_ = anInt9919; i_1632_ < 0; i_1632_++) {
		    int i_1633_ = anInt9925;
		    int i_1634_ = anInt9927 + anInt9929;
		    int i_1635_ = anInt9928 + anInt9930;
		    int i_1636_ = anInt9906;
		    if (i_1634_ < 0) {
			int i_1637_ = (anInt9921 - 1 - i_1634_) / anInt9921;
			i_1636_ += i_1637_;
			i_1634_ += anInt9921 * i_1637_;
			i_1635_ += anInt9922 * i_1637_;
			i_1633_ += i_1637_;
		    }
		    int i_1638_;
		    if ((i_1638_
			 = (1 + i_1634_
			    - (((Class168_Sub2_Sub2) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_1636_)
			i_1636_ = i_1638_;
		    if ((i_1638_
			 = i_1635_ - (((Class168_Sub2_Sub2) this).anInt9916
				      << 12))
			>= 0) {
			i_1638_ = (anInt9922 - i_1638_) / anInt9922;
			i_1636_ += i_1638_;
			i_1634_ += anInt9921 * i_1638_;
			i_1635_ += anInt9922 * i_1638_;
			i_1633_ += i_1638_;
		    }
		    if ((i_1638_ = (i_1635_ - anInt9922) / anInt9922)
			> i_1636_)
			i_1636_ = i_1638_;
		    for (/**/; i_1636_ < 0; i_1636_++) {
			method17538((((i_1635_ >> 12)
				      * ((Class168_Sub2_Sub2) this).anInt9920)
				     + (i_1634_ >> 12)),
				    i_1633_++, is, i, i_1588_);
			i_1634_ += anInt9921;
			i_1635_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		for (int i_1639_ = anInt9919; i_1639_ < 0; i_1639_++) {
		    int i_1640_ = anInt9925;
		    int i_1641_ = anInt9927 + anInt9929;
		    int i_1642_ = anInt9928 + anInt9930;
		    int i_1643_ = anInt9906;
		    if (i_1641_ < 0) {
			int i_1644_ = (anInt9921 - 1 - i_1641_) / anInt9921;
			i_1643_ += i_1644_;
			i_1641_ += anInt9921 * i_1644_;
			i_1642_ += anInt9922 * i_1644_;
			i_1640_ += i_1644_;
		    }
		    int i_1645_;
		    if ((i_1645_
			 = (1 + i_1641_
			    - (((Class168_Sub2_Sub2) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_1643_)
			i_1643_ = i_1645_;
		    if (i_1642_ < 0) {
			i_1645_ = (anInt9922 - 1 - i_1642_) / anInt9922;
			i_1643_ += i_1645_;
			i_1641_ += anInt9921 * i_1645_;
			i_1642_ += anInt9922 * i_1645_;
			i_1640_ += i_1645_;
		    }
		    if ((i_1645_
			 = (1 + i_1642_
			    - (((Class168_Sub2_Sub2) this).anInt9916 << 12)
			    - anInt9922) / anInt9922)
			> i_1643_)
			i_1643_ = i_1645_;
		    for (/**/; i_1643_ < 0; i_1643_++) {
			method17538((((i_1642_ >> 12)
				      * ((Class168_Sub2_Sub2) this).anInt9920)
				     + (i_1641_ >> 12)),
				    i_1640_++, is, i, i_1588_);
			i_1641_ += anInt9921;
			i_1642_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    public void method3638(int i, int i_1646_, Class135 class135, int i_1647_,
			   int i_1648_) {
	if (((Class168_Sub2_Sub2) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    i += ((Class168_Sub2_Sub2) this).anInt9907;
	    i_1646_ += ((Class168_Sub2_Sub2) this).anInt9905;
	    int i_1649_ = 0;
	    int i_1650_ = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761);
	    int i_1651_ = ((Class168_Sub2_Sub2) this).anInt9920;
	    int i_1652_ = ((Class168_Sub2_Sub2) this).anInt9916;
	    int i_1653_ = i_1650_ - i_1651_;
	    int i_1654_ = 0;
	    int i_1655_ = i + i_1646_ * i_1650_;
	    if (i_1646_ < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_1656_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_1646_);
		i_1652_ -= i_1656_;
		i_1646_ = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385);
		i_1649_ += i_1656_ * i_1651_;
		i_1655_ += i_1656_ * i_1650_;
	    }
	    if (i_1646_ + i_1652_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_1652_ -= (i_1646_ + i_1652_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_1657_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_1651_ -= i_1657_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_1649_ += i_1657_;
		i_1655_ += i_1657_;
		i_1654_ += i_1657_;
		i_1653_ += i_1657_;
	    }
	    if (i + i_1651_ > (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_1658_ = (i + i_1651_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_1651_ -= i_1658_;
		i_1654_ += i_1658_;
		i_1653_ += i_1658_;
	    }
	    if (i_1651_ > 0 && i_1652_ > 0) {
		Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
		int[] is_1659_
		    = ((Class135_Sub1) class135_sub1).anIntArray9874;
		int[] is_1660_
		    = ((Class135_Sub1) class135_sub1).anIntArray9873;
		int i_1661_ = i_1646_;
		if (i_1648_ > i_1661_) {
		    i_1661_ = i_1648_;
		    i_1655_ += (i_1648_ - i_1646_) * i_1650_;
		    i_1649_ += ((i_1648_ - i_1646_)
				* ((Class168_Sub2_Sub2) this).anInt9920);
		}
		int i_1662_
		    = (i_1648_ + is_1659_.length < i_1646_ + i_1652_
		       ? i_1648_ + is_1659_.length : i_1646_ + i_1652_);
		for (int i_1663_ = i_1661_; i_1663_ < i_1662_; i_1663_++) {
		    int i_1664_ = is_1659_[i_1663_ - i_1648_] + i_1647_;
		    int i_1665_ = is_1660_[i_1663_ - i_1648_];
		    int i_1666_ = i_1651_;
		    if (i > i_1664_) {
			int i_1667_ = i - i_1664_;
			if (i_1667_ >= i_1665_) {
			    i_1649_ += i_1651_ + i_1654_;
			    i_1655_ += i_1651_ + i_1653_;
			    continue;
			}
			i_1665_ -= i_1667_;
		    } else {
			int i_1668_ = i_1664_ - i;
			if (i_1668_ >= i_1651_) {
			    i_1649_ += i_1651_ + i_1654_;
			    i_1655_ += i_1651_ + i_1653_;
			    continue;
			}
			i_1649_ += i_1668_;
			i_1666_ -= i_1668_;
			i_1655_ += i_1668_;
		    }
		    int i_1669_ = 0;
		    if (i_1666_ < i_1665_)
			i_1665_ = i_1666_;
		    else
			i_1669_ = i_1666_ - i_1665_;
		    for (int i_1670_ = -i_1665_; i_1670_ < 0; i_1670_++) {
			int i_1671_ = (((Class168_Sub2_Sub2) this)
				       .anIntArray11124[i_1649_++]);
			int i_1672_ = i_1671_ >>> 24;
			int i_1673_ = 256 - i_1672_;
			int i_1674_ = is[i_1655_];
			is[i_1655_++] = ((((i_1671_ & 0xff00ff) * i_1672_
					   + (i_1674_ & 0xff00ff) * i_1673_)
					  & ~0xff00ff)
					 + (((i_1671_ & 0xff00) * i_1672_
					     + (i_1674_ & 0xff00) * i_1673_)
					    & 0xff0000)) >> 8;
		    }
		    i_1649_ += i_1669_ + i_1654_;
		    i_1655_ += i_1669_ + i_1653_;
		}
	    }
	}
    }
    
    void method16219(int i, int i_1675_) {
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_1676_ = anInt9919;
		    while (i_1676_ < 0) {
			int i_1677_ = anInt9925;
			int i_1678_ = anInt9927;
			int i_1679_ = anInt9928;
			int i_1680_ = anInt9906;
			if (i_1678_ >= 0 && i_1679_ >= 0
			    && i_1678_ - (((Class168_Sub2_Sub2) this).anInt9920
					  << 12) < 0
			    && i_1679_ - (((Class168_Sub2_Sub2) this).anInt9916
					  << 12) < 0) {
			    for (/**/; i_1680_ < 0; i_1680_++)
				method17538(((i_1679_ >> 12)
					     * (((Class168_Sub2_Sub2) this)
						.anInt9920)) + (i_1678_ >> 12),
					    i_1677_++, is, i, i_1675_);
			}
			i_1676_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_1681_ = anInt9919;
		    while (i_1681_ < 0) {
			int i_1682_ = anInt9925;
			int i_1683_ = anInt9927;
			int i_1684_ = anInt9928 + anInt9930;
			int i_1685_ = anInt9906;
			if (i_1683_ >= 0
			    && i_1683_ - (((Class168_Sub2_Sub2) this).anInt9920
					  << 12) < 0) {
			    int i_1686_;
			    if ((i_1686_
				 = (i_1684_
				    - (((Class168_Sub2_Sub2) this).anInt9916
				       << 12)))
				>= 0) {
				i_1686_ = (anInt9922 - i_1686_) / anInt9922;
				i_1685_ += i_1686_;
				i_1684_ += anInt9922 * i_1686_;
				i_1682_ += i_1686_;
			    }
			    if ((i_1686_ = (i_1684_ - anInt9922) / anInt9922)
				> i_1685_)
				i_1685_ = i_1686_;
			    for (/**/; i_1685_ < 0; i_1685_++) {
				method17538(((i_1684_ >> 12)
					     * (((Class168_Sub2_Sub2) this)
						.anInt9920)) + (i_1683_ >> 12),
					    i_1682_++, is, i, i_1675_);
				i_1684_ += anInt9922;
			    }
			}
			i_1681_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_1687_ = anInt9919;
		    while (i_1687_ < 0) {
			int i_1688_ = anInt9925;
			int i_1689_ = anInt9927;
			int i_1690_ = anInt9928 + anInt9930;
			int i_1691_ = anInt9906;
			if (i_1689_ >= 0
			    && i_1689_ - (((Class168_Sub2_Sub2) this).anInt9920
					  << 12) < 0) {
			    if (i_1690_ < 0) {
				int i_1692_
				    = (anInt9922 - 1 - i_1690_) / anInt9922;
				i_1691_ += i_1692_;
				i_1690_ += anInt9922 * i_1692_;
				i_1688_ += i_1692_;
			    }
			    int i_1693_;
			    if ((i_1693_
				 = (1 + i_1690_
				    - (((Class168_Sub2_Sub2) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_1691_)
				i_1691_ = i_1693_;
			    for (/**/; i_1691_ < 0; i_1691_++) {
				method17538(((i_1690_ >> 12)
					     * (((Class168_Sub2_Sub2) this)
						.anInt9920)) + (i_1689_ >> 12),
					    i_1688_++, is, i, i_1675_);
				i_1690_ += anInt9922;
			    }
			}
			i_1687_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_1694_ = anInt9919;
		    while (i_1694_ < 0) {
			int i_1695_ = anInt9925;
			int i_1696_ = anInt9927 + anInt9929;
			int i_1697_ = anInt9928;
			int i_1698_ = anInt9906;
			if (i_1697_ >= 0
			    && i_1697_ - (((Class168_Sub2_Sub2) this).anInt9916
					  << 12) < 0) {
			    int i_1699_;
			    if ((i_1699_
				 = (i_1696_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)))
				>= 0) {
				i_1699_ = (anInt9921 - i_1699_) / anInt9921;
				i_1698_ += i_1699_;
				i_1696_ += anInt9921 * i_1699_;
				i_1695_ += i_1699_;
			    }
			    if ((i_1699_ = (i_1696_ - anInt9921) / anInt9921)
				> i_1698_)
				i_1698_ = i_1699_;
			    for (/**/; i_1698_ < 0; i_1698_++) {
				method17538(((i_1697_ >> 12)
					     * (((Class168_Sub2_Sub2) this)
						.anInt9920)) + (i_1696_ >> 12),
					    i_1695_++, is, i, i_1675_);
				i_1696_ += anInt9921;
			    }
			}
			i_1694_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_1700_ = anInt9919;
		    while (i_1700_ < 0) {
			int i_1701_ = anInt9925;
			int i_1702_ = anInt9927 + anInt9929;
			int i_1703_ = anInt9928 + anInt9930;
			int i_1704_ = anInt9906;
			int i_1705_;
			if ((i_1705_
			     = i_1702_ - (((Class168_Sub2_Sub2) this).anInt9920
					  << 12))
			    >= 0) {
			    i_1705_ = (anInt9921 - i_1705_) / anInt9921;
			    i_1704_ += i_1705_;
			    i_1702_ += anInt9921 * i_1705_;
			    i_1703_ += anInt9922 * i_1705_;
			    i_1701_ += i_1705_;
			}
			if ((i_1705_ = (i_1702_ - anInt9921) / anInt9921)
			    > i_1704_)
			    i_1704_ = i_1705_;
			if ((i_1705_
			     = i_1703_ - (((Class168_Sub2_Sub2) this).anInt9916
					  << 12))
			    >= 0) {
			    i_1705_ = (anInt9922 - i_1705_) / anInt9922;
			    i_1704_ += i_1705_;
			    i_1702_ += anInt9921 * i_1705_;
			    i_1703_ += anInt9922 * i_1705_;
			    i_1701_ += i_1705_;
			}
			if ((i_1705_ = (i_1703_ - anInt9922) / anInt9922)
			    > i_1704_)
			    i_1704_ = i_1705_;
			for (/**/; i_1704_ < 0; i_1704_++) {
			    method17538(((i_1703_ >> 12)
					 * (((Class168_Sub2_Sub2) this)
					    .anInt9920)) + (i_1702_ >> 12),
					i_1701_++, is, i, i_1675_);
			    i_1702_ += anInt9921;
			    i_1703_ += anInt9922;
			}
			i_1700_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_1706_ = anInt9919;
		    while (i_1706_ < 0) {
			int i_1707_ = anInt9925;
			int i_1708_ = anInt9927 + anInt9929;
			int i_1709_ = anInt9928 + anInt9930;
			int i_1710_ = anInt9906;
			int i_1711_;
			if ((i_1711_
			     = i_1708_ - (((Class168_Sub2_Sub2) this).anInt9920
					  << 12))
			    >= 0) {
			    i_1711_ = (anInt9921 - i_1711_) / anInt9921;
			    i_1710_ += i_1711_;
			    i_1708_ += anInt9921 * i_1711_;
			    i_1709_ += anInt9922 * i_1711_;
			    i_1707_ += i_1711_;
			}
			if ((i_1711_ = (i_1708_ - anInt9921) / anInt9921)
			    > i_1710_)
			    i_1710_ = i_1711_;
			if (i_1709_ < 0) {
			    i_1711_ = (anInt9922 - 1 - i_1709_) / anInt9922;
			    i_1710_ += i_1711_;
			    i_1708_ += anInt9921 * i_1711_;
			    i_1709_ += anInt9922 * i_1711_;
			    i_1707_ += i_1711_;
			}
			if ((i_1711_
			     = (1 + i_1709_
				- (((Class168_Sub2_Sub2) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_1710_)
			    i_1710_ = i_1711_;
			for (/**/; i_1710_ < 0; i_1710_++) {
			    method17538(((i_1709_ >> 12)
					 * (((Class168_Sub2_Sub2) this)
					    .anInt9920)) + (i_1708_ >> 12),
					i_1707_++, is, i, i_1675_);
			    i_1708_ += anInt9921;
			    i_1709_ += anInt9922;
			}
			i_1706_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_1712_ = anInt9919;
		while (i_1712_ < 0) {
		    int i_1713_ = anInt9925;
		    int i_1714_ = anInt9927 + anInt9929;
		    int i_1715_ = anInt9928;
		    int i_1716_ = anInt9906;
		    if (i_1715_ >= 0
			&& i_1715_ - (((Class168_Sub2_Sub2) this).anInt9916
				      << 12) < 0) {
			if (i_1714_ < 0) {
			    int i_1717_
				= (anInt9921 - 1 - i_1714_) / anInt9921;
			    i_1716_ += i_1717_;
			    i_1714_ += anInt9921 * i_1717_;
			    i_1713_ += i_1717_;
			}
			int i_1718_;
			if ((i_1718_
			     = (1 + i_1714_
				- (((Class168_Sub2_Sub2) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_1716_)
			    i_1716_ = i_1718_;
			for (/**/; i_1716_ < 0; i_1716_++) {
			    method17538(((i_1715_ >> 12)
					 * (((Class168_Sub2_Sub2) this)
					    .anInt9920)) + (i_1714_ >> 12),
					i_1713_++, is, i, i_1675_);
			    i_1714_ += anInt9921;
			}
		    }
		    i_1712_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		for (int i_1719_ = anInt9919; i_1719_ < 0; i_1719_++) {
		    int i_1720_ = anInt9925;
		    int i_1721_ = anInt9927 + anInt9929;
		    int i_1722_ = anInt9928 + anInt9930;
		    int i_1723_ = anInt9906;
		    if (i_1721_ < 0) {
			int i_1724_ = (anInt9921 - 1 - i_1721_) / anInt9921;
			i_1723_ += i_1724_;
			i_1721_ += anInt9921 * i_1724_;
			i_1722_ += anInt9922 * i_1724_;
			i_1720_ += i_1724_;
		    }
		    int i_1725_;
		    if ((i_1725_
			 = (1 + i_1721_
			    - (((Class168_Sub2_Sub2) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_1723_)
			i_1723_ = i_1725_;
		    if ((i_1725_
			 = i_1722_ - (((Class168_Sub2_Sub2) this).anInt9916
				      << 12))
			>= 0) {
			i_1725_ = (anInt9922 - i_1725_) / anInt9922;
			i_1723_ += i_1725_;
			i_1721_ += anInt9921 * i_1725_;
			i_1722_ += anInt9922 * i_1725_;
			i_1720_ += i_1725_;
		    }
		    if ((i_1725_ = (i_1722_ - anInt9922) / anInt9922)
			> i_1723_)
			i_1723_ = i_1725_;
		    for (/**/; i_1723_ < 0; i_1723_++) {
			method17538((((i_1722_ >> 12)
				      * ((Class168_Sub2_Sub2) this).anInt9920)
				     + (i_1721_ >> 12)),
				    i_1720_++, is, i, i_1675_);
			i_1721_ += anInt9921;
			i_1722_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		for (int i_1726_ = anInt9919; i_1726_ < 0; i_1726_++) {
		    int i_1727_ = anInt9925;
		    int i_1728_ = anInt9927 + anInt9929;
		    int i_1729_ = anInt9928 + anInt9930;
		    int i_1730_ = anInt9906;
		    if (i_1728_ < 0) {
			int i_1731_ = (anInt9921 - 1 - i_1728_) / anInt9921;
			i_1730_ += i_1731_;
			i_1728_ += anInt9921 * i_1731_;
			i_1729_ += anInt9922 * i_1731_;
			i_1727_ += i_1731_;
		    }
		    int i_1732_;
		    if ((i_1732_
			 = (1 + i_1728_
			    - (((Class168_Sub2_Sub2) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_1730_)
			i_1730_ = i_1732_;
		    if (i_1729_ < 0) {
			i_1732_ = (anInt9922 - 1 - i_1729_) / anInt9922;
			i_1730_ += i_1732_;
			i_1728_ += anInt9921 * i_1732_;
			i_1729_ += anInt9922 * i_1732_;
			i_1727_ += i_1732_;
		    }
		    if ((i_1732_
			 = (1 + i_1729_
			    - (((Class168_Sub2_Sub2) this).anInt9916 << 12)
			    - anInt9922) / anInt9922)
			> i_1730_)
			i_1730_ = i_1732_;
		    for (/**/; i_1730_ < 0; i_1730_++) {
			method17538((((i_1729_ >> 12)
				      * ((Class168_Sub2_Sub2) this).anInt9920)
				     + (i_1728_ >> 12)),
				    i_1727_++, is, i, i_1675_);
			i_1728_ += anInt9921;
			i_1729_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    Class168_Sub2_Sub2(Class103_Sub2 class103_sub2, int i, int i_1733_) {
	super(class103_sub2, i, i_1733_);
	((Class168_Sub2_Sub2) this).anIntArray11124 = new int[i * i_1733_];
    }
    
    void method16228(int[] is, int[] is_1734_, int i, int i_1735_) {
	int[] is_1736_ = (((Class103_Sub2)
			   ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			  .anIntArray9245);
	if (is_1736_ != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_1737_ = anInt9919;
		    while (i_1737_ < 0) {
			int i_1738_ = i_1737_ + i_1735_;
			if (i_1738_ >= 0) {
			    if (i_1738_ >= is.length)
				break;
			    int i_1739_ = anInt9925;
			    int i_1740_ = anInt9927;
			    int i_1741_ = anInt9928;
			    int i_1742_ = anInt9906;
			    if (i_1740_ >= 0 && i_1741_ >= 0
				&& (i_1740_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)) < 0
				&& (i_1741_
				    - (((Class168_Sub2_Sub2) this).anInt9916
				       << 12)) < 0) {
				int i_1743_ = is[i_1738_] - i;
				int i_1744_ = -is_1734_[i_1738_];
				int i_1745_ = i_1743_ - (i_1739_ - anInt9925);
				if (i_1745_ > 0) {
				    i_1739_ += i_1745_;
				    i_1742_ += i_1745_;
				    i_1740_ += anInt9921 * i_1745_;
				    i_1741_ += anInt9922 * i_1745_;
				} else
				    i_1744_ -= i_1745_;
				if (i_1742_ < i_1744_)
				    i_1742_ = i_1744_;
				for (/**/; i_1742_ < 0; i_1742_++) {
				    int i_1746_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(((i_1741_ >> 12)
					      * (((Class168_Sub2_Sub2) this)
						 .anInt9920))
					     + (i_1740_ >> 12))]);
				    int i_1747_ = i_1746_ >>> 24;
				    int i_1748_ = 256 - i_1747_;
				    int i_1749_ = is_1736_[i_1739_];
				    is_1736_[i_1739_++]
					= ((((i_1746_ & 0xff00ff) * i_1747_
					     + (i_1749_ & 0xff00ff) * i_1748_)
					    & ~0xff00ff)
					   + (((i_1746_ & 0xff00) * i_1747_
					       + (i_1749_ & 0xff00) * i_1748_)
					      & 0xff0000)) >> 8;
				}
			    }
			}
			i_1737_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_1750_ = anInt9919;
		    while (i_1750_ < 0) {
			int i_1751_ = i_1750_ + i_1735_;
			if (i_1751_ >= 0) {
			    if (i_1751_ >= is.length)
				break;
			    int i_1752_ = anInt9925;
			    int i_1753_ = anInt9927;
			    int i_1754_ = anInt9928 + anInt9930;
			    int i_1755_ = anInt9906;
			    if (i_1753_ >= 0
				&& (i_1753_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)) < 0) {
				int i_1756_;
				if ((i_1756_
				     = i_1754_ - ((((Class168_Sub2_Sub2) this)
						   .anInt9916)
						  << 12))
				    >= 0) {
				    i_1756_
					= (anInt9922 - i_1756_) / anInt9922;
				    i_1755_ += i_1756_;
				    i_1754_ += anInt9922 * i_1756_;
				    i_1752_ += i_1756_;
				}
				if ((i_1756_
				     = (i_1754_ - anInt9922) / anInt9922)
				    > i_1755_)
				    i_1755_ = i_1756_;
				int i_1757_ = is[i_1751_] - i;
				int i_1758_ = -is_1734_[i_1751_];
				int i_1759_ = i_1757_ - (i_1752_ - anInt9925);
				if (i_1759_ > 0) {
				    i_1752_ += i_1759_;
				    i_1755_ += i_1759_;
				    i_1753_ += anInt9921 * i_1759_;
				    i_1754_ += anInt9922 * i_1759_;
				} else
				    i_1758_ -= i_1759_;
				if (i_1755_ < i_1758_)
				    i_1755_ = i_1758_;
				for (/**/; i_1755_ < 0; i_1755_++) {
				    int i_1760_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(((i_1754_ >> 12)
					      * (((Class168_Sub2_Sub2) this)
						 .anInt9920))
					     + (i_1753_ >> 12))]);
				    int i_1761_ = i_1760_ >>> 24;
				    int i_1762_ = 256 - i_1761_;
				    int i_1763_ = is_1736_[i_1752_];
				    is_1736_[i_1752_++]
					= ((((i_1760_ & 0xff00ff) * i_1761_
					     + (i_1763_ & 0xff00ff) * i_1762_)
					    & ~0xff00ff)
					   + (((i_1760_ & 0xff00) * i_1761_
					       + (i_1763_ & 0xff00) * i_1762_)
					      & 0xff0000)) >> 8;
				    i_1754_ += anInt9922;
				}
			    }
			}
			i_1750_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_1764_ = anInt9919;
		    while (i_1764_ < 0) {
			int i_1765_ = i_1764_ + i_1735_;
			if (i_1765_ >= 0) {
			    if (i_1765_ >= is.length)
				break;
			    int i_1766_ = anInt9925;
			    int i_1767_ = anInt9927;
			    int i_1768_ = anInt9928 + anInt9930;
			    int i_1769_ = anInt9906;
			    if (i_1767_ >= 0
				&& (i_1767_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)) < 0) {
				if (i_1768_ < 0) {
				    int i_1770_ = ((anInt9922 - 1 - i_1768_)
						   / anInt9922);
				    i_1769_ += i_1770_;
				    i_1768_ += anInt9922 * i_1770_;
				    i_1766_ += i_1770_;
				}
				int i_1771_;
				if ((i_1771_ = (1 + i_1768_
						- ((((Class168_Sub2_Sub2) this)
						    .anInt9916)
						   << 12)
						- anInt9922) / anInt9922)
				    > i_1769_)
				    i_1769_ = i_1771_;
				int i_1772_ = is[i_1765_] - i;
				int i_1773_ = -is_1734_[i_1765_];
				int i_1774_ = i_1772_ - (i_1766_ - anInt9925);
				if (i_1774_ > 0) {
				    i_1766_ += i_1774_;
				    i_1769_ += i_1774_;
				    i_1767_ += anInt9921 * i_1774_;
				    i_1768_ += anInt9922 * i_1774_;
				} else
				    i_1773_ -= i_1774_;
				if (i_1769_ < i_1773_)
				    i_1769_ = i_1773_;
				for (/**/; i_1769_ < 0; i_1769_++) {
				    int i_1775_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(((i_1768_ >> 12)
					      * (((Class168_Sub2_Sub2) this)
						 .anInt9920))
					     + (i_1767_ >> 12))]);
				    int i_1776_ = i_1775_ >>> 24;
				    int i_1777_ = 256 - i_1776_;
				    int i_1778_ = is_1736_[i_1766_];
				    is_1736_[i_1766_++]
					= ((((i_1775_ & 0xff00ff) * i_1776_
					     + (i_1778_ & 0xff00ff) * i_1777_)
					    & ~0xff00ff)
					   + (((i_1775_ & 0xff00) * i_1776_
					       + (i_1778_ & 0xff00) * i_1777_)
					      & 0xff0000)) >> 8;
				    i_1768_ += anInt9922;
				}
			    }
			}
			i_1764_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_1779_ = anInt9919;
		    while (i_1779_ < 0) {
			int i_1780_ = i_1779_ + i_1735_;
			if (i_1780_ >= 0) {
			    if (i_1780_ >= is.length)
				break;
			    int i_1781_ = anInt9925;
			    int i_1782_ = anInt9927 + anInt9929;
			    int i_1783_ = anInt9928;
			    int i_1784_ = anInt9906;
			    if (i_1783_ >= 0
				&& (i_1783_
				    - (((Class168_Sub2_Sub2) this).anInt9916
				       << 12)) < 0) {
				int i_1785_;
				if ((i_1785_
				     = i_1782_ - ((((Class168_Sub2_Sub2) this)
						   .anInt9920)
						  << 12))
				    >= 0) {
				    i_1785_
					= (anInt9921 - i_1785_) / anInt9921;
				    i_1784_ += i_1785_;
				    i_1782_ += anInt9921 * i_1785_;
				    i_1781_ += i_1785_;
				}
				if ((i_1785_
				     = (i_1782_ - anInt9921) / anInt9921)
				    > i_1784_)
				    i_1784_ = i_1785_;
				int i_1786_ = is[i_1780_] - i;
				int i_1787_ = -is_1734_[i_1780_];
				int i_1788_ = i_1786_ - (i_1781_ - anInt9925);
				if (i_1788_ > 0) {
				    i_1781_ += i_1788_;
				    i_1784_ += i_1788_;
				    i_1782_ += anInt9921 * i_1788_;
				    i_1783_ += anInt9922 * i_1788_;
				} else
				    i_1787_ -= i_1788_;
				if (i_1784_ < i_1787_)
				    i_1784_ = i_1787_;
				for (/**/; i_1784_ < 0; i_1784_++) {
				    int i_1789_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(((i_1783_ >> 12)
					      * (((Class168_Sub2_Sub2) this)
						 .anInt9920))
					     + (i_1782_ >> 12))]);
				    int i_1790_ = i_1789_ >>> 24;
				    int i_1791_ = 256 - i_1790_;
				    int i_1792_ = is_1736_[i_1781_];
				    is_1736_[i_1781_++]
					= ((((i_1789_ & 0xff00ff) * i_1790_
					     + (i_1792_ & 0xff00ff) * i_1791_)
					    & ~0xff00ff)
					   + (((i_1789_ & 0xff00) * i_1790_
					       + (i_1792_ & 0xff00) * i_1791_)
					      & 0xff0000)) >> 8;
				    i_1782_ += anInt9921;
				}
			    }
			}
			i_1779_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_1793_ = anInt9919;
		    while (i_1793_ < 0) {
			int i_1794_ = i_1793_ + i_1735_;
			if (i_1794_ >= 0) {
			    if (i_1794_ >= is.length)
				break;
			    int i_1795_ = anInt9925;
			    int i_1796_ = anInt9927 + anInt9929;
			    int i_1797_ = anInt9928 + anInt9930;
			    int i_1798_ = anInt9906;
			    int i_1799_;
			    if ((i_1799_
				 = (i_1796_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)))
				>= 0) {
				i_1799_ = (anInt9921 - i_1799_) / anInt9921;
				i_1798_ += i_1799_;
				i_1796_ += anInt9921 * i_1799_;
				i_1797_ += anInt9922 * i_1799_;
				i_1795_ += i_1799_;
			    }
			    if ((i_1799_ = (i_1796_ - anInt9921) / anInt9921)
				> i_1798_)
				i_1798_ = i_1799_;
			    if ((i_1799_
				 = (i_1797_
				    - (((Class168_Sub2_Sub2) this).anInt9916
				       << 12)))
				>= 0) {
				i_1799_ = (anInt9922 - i_1799_) / anInt9922;
				i_1798_ += i_1799_;
				i_1796_ += anInt9921 * i_1799_;
				i_1797_ += anInt9922 * i_1799_;
				i_1795_ += i_1799_;
			    }
			    if ((i_1799_ = (i_1797_ - anInt9922) / anInt9922)
				> i_1798_)
				i_1798_ = i_1799_;
			    int i_1800_ = is[i_1794_] - i;
			    int i_1801_ = -is_1734_[i_1794_];
			    int i_1802_ = i_1800_ - (i_1795_ - anInt9925);
			    if (i_1802_ > 0) {
				i_1795_ += i_1802_;
				i_1798_ += i_1802_;
				i_1796_ += anInt9921 * i_1802_;
				i_1797_ += anInt9922 * i_1802_;
			    } else
				i_1801_ -= i_1802_;
			    if (i_1798_ < i_1801_)
				i_1798_ = i_1801_;
			    for (/**/; i_1798_ < 0; i_1798_++) {
				int i_1803_
				    = (((Class168_Sub2_Sub2) this)
				       .anIntArray11124
				       [((i_1797_ >> 12)
					 * (((Class168_Sub2_Sub2) this)
					    .anInt9920)) + (i_1796_ >> 12)]);
				int i_1804_ = i_1803_ >>> 24;
				int i_1805_ = 256 - i_1804_;
				int i_1806_ = is_1736_[i_1795_];
				is_1736_[i_1795_++]
				    = ((((i_1803_ & 0xff00ff) * i_1804_
					 + (i_1806_ & 0xff00ff) * i_1805_)
					& ~0xff00ff)
				       + (((i_1803_ & 0xff00) * i_1804_
					   + (i_1806_ & 0xff00) * i_1805_)
					  & 0xff0000)) >> 8;
				i_1796_ += anInt9921;
				i_1797_ += anInt9922;
			    }
			}
			i_1793_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_1807_ = anInt9919;
		    while (i_1807_ < 0) {
			int i_1808_ = i_1807_ + i_1735_;
			if (i_1808_ >= 0) {
			    if (i_1808_ >= is.length)
				break;
			    int i_1809_ = anInt9925;
			    int i_1810_ = anInt9927 + anInt9929;
			    int i_1811_ = anInt9928 + anInt9930;
			    int i_1812_ = anInt9906;
			    int i_1813_;
			    if ((i_1813_
				 = (i_1810_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)))
				>= 0) {
				i_1813_ = (anInt9921 - i_1813_) / anInt9921;
				i_1812_ += i_1813_;
				i_1810_ += anInt9921 * i_1813_;
				i_1811_ += anInt9922 * i_1813_;
				i_1809_ += i_1813_;
			    }
			    if ((i_1813_ = (i_1810_ - anInt9921) / anInt9921)
				> i_1812_)
				i_1812_ = i_1813_;
			    if (i_1811_ < 0) {
				i_1813_
				    = (anInt9922 - 1 - i_1811_) / anInt9922;
				i_1812_ += i_1813_;
				i_1810_ += anInt9921 * i_1813_;
				i_1811_ += anInt9922 * i_1813_;
				i_1809_ += i_1813_;
			    }
			    if ((i_1813_
				 = (1 + i_1811_
				    - (((Class168_Sub2_Sub2) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_1812_)
				i_1812_ = i_1813_;
			    int i_1814_ = is[i_1808_] - i;
			    int i_1815_ = -is_1734_[i_1808_];
			    int i_1816_ = i_1814_ - (i_1809_ - anInt9925);
			    if (i_1816_ > 0) {
				i_1809_ += i_1816_;
				i_1812_ += i_1816_;
				i_1810_ += anInt9921 * i_1816_;
				i_1811_ += anInt9922 * i_1816_;
			    } else
				i_1815_ -= i_1816_;
			    if (i_1812_ < i_1815_)
				i_1812_ = i_1815_;
			    for (/**/; i_1812_ < 0; i_1812_++) {
				int i_1817_
				    = (((Class168_Sub2_Sub2) this)
				       .anIntArray11124
				       [((i_1811_ >> 12)
					 * (((Class168_Sub2_Sub2) this)
					    .anInt9920)) + (i_1810_ >> 12)]);
				int i_1818_ = i_1817_ >>> 24;
				int i_1819_ = 256 - i_1818_;
				int i_1820_ = is_1736_[i_1809_];
				is_1736_[i_1809_++]
				    = ((((i_1817_ & 0xff00ff) * i_1818_
					 + (i_1820_ & 0xff00ff) * i_1819_)
					& ~0xff00ff)
				       + (((i_1817_ & 0xff00) * i_1818_
					   + (i_1820_ & 0xff00) * i_1819_)
					  & 0xff0000)) >> 8;
				i_1810_ += anInt9921;
				i_1811_ += anInt9922;
			    }
			}
			i_1807_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_1821_ = anInt9919;
		while (i_1821_ < 0) {
		    int i_1822_ = i_1821_ + i_1735_;
		    if (i_1822_ >= 0) {
			if (i_1822_ >= is.length)
			    break;
			int i_1823_ = anInt9925;
			int i_1824_ = anInt9927 + anInt9929;
			int i_1825_ = anInt9928;
			int i_1826_ = anInt9906;
			if (i_1825_ >= 0
			    && i_1825_ - (((Class168_Sub2_Sub2) this).anInt9916
					  << 12) < 0) {
			    if (i_1824_ < 0) {
				int i_1827_
				    = (anInt9921 - 1 - i_1824_) / anInt9921;
				i_1826_ += i_1827_;
				i_1824_ += anInt9921 * i_1827_;
				i_1823_ += i_1827_;
			    }
			    int i_1828_;
			    if ((i_1828_
				 = (1 + i_1824_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)
				    - anInt9921) / anInt9921)
				> i_1826_)
				i_1826_ = i_1828_;
			    int i_1829_ = is[i_1822_] - i;
			    int i_1830_ = -is_1734_[i_1822_];
			    int i_1831_ = i_1829_ - (i_1823_ - anInt9925);
			    if (i_1831_ > 0) {
				i_1823_ += i_1831_;
				i_1826_ += i_1831_;
				i_1824_ += anInt9921 * i_1831_;
				i_1825_ += anInt9922 * i_1831_;
			    } else
				i_1830_ -= i_1831_;
			    if (i_1826_ < i_1830_)
				i_1826_ = i_1830_;
			    for (/**/; i_1826_ < 0; i_1826_++) {
				int i_1832_
				    = (((Class168_Sub2_Sub2) this)
				       .anIntArray11124
				       [((i_1825_ >> 12)
					 * (((Class168_Sub2_Sub2) this)
					    .anInt9920)) + (i_1824_ >> 12)]);
				int i_1833_ = i_1832_ >>> 24;
				int i_1834_ = 256 - i_1833_;
				int i_1835_ = is_1736_[i_1823_];
				is_1736_[i_1823_++]
				    = ((((i_1832_ & 0xff00ff) * i_1833_
					 + (i_1835_ & 0xff00ff) * i_1834_)
					& ~0xff00ff)
				       + (((i_1832_ & 0xff00) * i_1833_
					   + (i_1835_ & 0xff00) * i_1834_)
					  & 0xff0000)) >> 8;
				i_1824_ += anInt9921;
			    }
			}
		    }
		    i_1821_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		int i_1836_ = anInt9919;
		while (i_1836_ < 0) {
		    int i_1837_ = i_1836_ + i_1735_;
		    if (i_1837_ >= 0) {
			if (i_1837_ >= is.length)
			    break;
			int i_1838_ = anInt9925;
			int i_1839_ = anInt9927 + anInt9929;
			int i_1840_ = anInt9928 + anInt9930;
			int i_1841_ = anInt9906;
			if (i_1839_ < 0) {
			    int i_1842_
				= (anInt9921 - 1 - i_1839_) / anInt9921;
			    i_1841_ += i_1842_;
			    i_1839_ += anInt9921 * i_1842_;
			    i_1840_ += anInt9922 * i_1842_;
			    i_1838_ += i_1842_;
			}
			int i_1843_;
			if ((i_1843_
			     = (1 + i_1839_
				- (((Class168_Sub2_Sub2) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_1841_)
			    i_1841_ = i_1843_;
			if ((i_1843_
			     = i_1840_ - (((Class168_Sub2_Sub2) this).anInt9916
					  << 12))
			    >= 0) {
			    i_1843_ = (anInt9922 - i_1843_) / anInt9922;
			    i_1841_ += i_1843_;
			    i_1839_ += anInt9921 * i_1843_;
			    i_1840_ += anInt9922 * i_1843_;
			    i_1838_ += i_1843_;
			}
			if ((i_1843_ = (i_1840_ - anInt9922) / anInt9922)
			    > i_1841_)
			    i_1841_ = i_1843_;
			int i_1844_ = is[i_1837_] - i;
			int i_1845_ = -is_1734_[i_1837_];
			int i_1846_ = i_1844_ - (i_1838_ - anInt9925);
			if (i_1846_ > 0) {
			    i_1838_ += i_1846_;
			    i_1841_ += i_1846_;
			    i_1839_ += anInt9921 * i_1846_;
			    i_1840_ += anInt9922 * i_1846_;
			} else
			    i_1845_ -= i_1846_;
			if (i_1841_ < i_1845_)
			    i_1841_ = i_1845_;
			for (/**/; i_1841_ < 0; i_1841_++) {
			    int i_1847_
				= (((Class168_Sub2_Sub2) this).anIntArray11124
				   [(((i_1840_ >> 12)
				      * ((Class168_Sub2_Sub2) this).anInt9920)
				     + (i_1839_ >> 12))]);
			    int i_1848_ = i_1847_ >>> 24;
			    int i_1849_ = 256 - i_1848_;
			    int i_1850_ = is_1736_[i_1838_];
			    is_1736_[i_1838_++]
				= ((((i_1847_ & 0xff00ff) * i_1848_
				     + (i_1850_ & 0xff00ff) * i_1849_)
				    & ~0xff00ff)
				   + (((i_1847_ & 0xff00) * i_1848_
				       + (i_1850_ & 0xff00) * i_1849_)
				      & 0xff0000)) >> 8;
			    i_1839_ += anInt9921;
			    i_1840_ += anInt9922;
			}
		    }
		    i_1836_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		int i_1851_ = anInt9919;
		while (i_1851_ < 0) {
		    int i_1852_ = i_1851_ + i_1735_;
		    if (i_1852_ >= 0) {
			if (i_1852_ >= is.length)
			    break;
			int i_1853_ = anInt9925;
			int i_1854_ = anInt9927 + anInt9929;
			int i_1855_ = anInt9928 + anInt9930;
			int i_1856_ = anInt9906;
			if (i_1854_ < 0) {
			    int i_1857_
				= (anInt9921 - 1 - i_1854_) / anInt9921;
			    i_1856_ += i_1857_;
			    i_1854_ += anInt9921 * i_1857_;
			    i_1855_ += anInt9922 * i_1857_;
			    i_1853_ += i_1857_;
			}
			int i_1858_;
			if ((i_1858_
			     = (1 + i_1854_
				- (((Class168_Sub2_Sub2) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_1856_)
			    i_1856_ = i_1858_;
			if (i_1855_ < 0) {
			    i_1858_ = (anInt9922 - 1 - i_1855_) / anInt9922;
			    i_1856_ += i_1858_;
			    i_1854_ += anInt9921 * i_1858_;
			    i_1855_ += anInt9922 * i_1858_;
			    i_1853_ += i_1858_;
			}
			if ((i_1858_
			     = (1 + i_1855_
				- (((Class168_Sub2_Sub2) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_1856_)
			    i_1856_ = i_1858_;
			int i_1859_ = is[i_1852_] - i;
			int i_1860_ = -is_1734_[i_1852_];
			int i_1861_ = i_1859_ - (i_1853_ - anInt9925);
			if (i_1861_ > 0) {
			    i_1853_ += i_1861_;
			    i_1856_ += i_1861_;
			    i_1854_ += anInt9921 * i_1861_;
			    i_1855_ += anInt9922 * i_1861_;
			} else
			    i_1860_ -= i_1861_;
			if (i_1856_ < i_1860_)
			    i_1856_ = i_1860_;
			for (/**/; i_1856_ < 0; i_1856_++) {
			    int i_1862_
				= (((Class168_Sub2_Sub2) this).anIntArray11124
				   [(((i_1855_ >> 12)
				      * ((Class168_Sub2_Sub2) this).anInt9920)
				     + (i_1854_ >> 12))]);
			    int i_1863_ = i_1862_ >>> 24;
			    int i_1864_ = 256 - i_1863_;
			    int i_1865_ = is_1736_[i_1853_];
			    is_1736_[i_1853_++]
				= ((((i_1862_ & 0xff00ff) * i_1863_
				     + (i_1865_ & 0xff00ff) * i_1864_)
				    & ~0xff00ff)
				   + (((i_1862_ & 0xff00) * i_1863_
				       + (i_1865_ & 0xff00) * i_1864_)
				      & 0xff0000)) >> 8;
			    i_1854_ += anInt9921;
			    i_1855_ += anInt9922;
			}
		    }
		    i_1851_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    void method16220(boolean bool, boolean bool_1866_, boolean bool_1867_,
		     int i, int i_1868_, float f, int i_1869_, int i_1870_,
		     int i_1871_, int i_1872_, int i_1873_, int i_1874_,
		     boolean bool_1875_) {
	if (i_1869_ > 0 && i_1870_ > 0 && (bool || bool_1866_)) {
	    int i_1876_ = 0;
	    int i_1877_ = 0;
	    int i_1878_ = (((Class168_Sub2_Sub2) this).anInt9907
			   + ((Class168_Sub2_Sub2) this).anInt9920
			   + ((Class168_Sub2_Sub2) this).anInt9909);
	    int i_1879_ = (((Class168_Sub2_Sub2) this).anInt9905
			   + ((Class168_Sub2_Sub2) this).anInt9916
			   + ((Class168_Sub2_Sub2) this).anInt9910);
	    int i_1880_ = (i_1878_ << 16) / i_1869_;
	    int i_1881_ = (i_1879_ << 16) / i_1870_;
	    if (((Class168_Sub2_Sub2) this).anInt9907 > 0) {
		int i_1882_ = (((((Class168_Sub2_Sub2) this).anInt9907 << 16)
				+ i_1880_ - 1)
			       / i_1880_);
		i += i_1882_;
		i_1876_ += (i_1882_ * i_1880_
			    - (((Class168_Sub2_Sub2) this).anInt9907 << 16));
	    }
	    if (((Class168_Sub2_Sub2) this).anInt9905 > 0) {
		int i_1883_ = (((((Class168_Sub2_Sub2) this).anInt9905 << 16)
				+ i_1881_ - 1)
			       / i_1881_);
		i_1868_ += i_1883_;
		i_1877_ += (i_1883_ * i_1881_
			    - (((Class168_Sub2_Sub2) this).anInt9905 << 16));
	    }
	    if (((Class168_Sub2_Sub2) this).anInt9920 < i_1878_)
		i_1869_ = ((((Class168_Sub2_Sub2) this).anInt9920 << 16)
			   - i_1876_ + i_1880_ - 1) / i_1880_;
	    if (((Class168_Sub2_Sub2) this).anInt9916 < i_1879_)
		i_1870_ = ((((Class168_Sub2_Sub2) this).anInt9916 << 16)
			   - i_1877_ + i_1881_ - 1) / i_1881_;
	    int i_1884_
		= i + i_1868_ * ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						    .aClass103_Sub2_9904))
				  .anInt9260)
				 * -1826993761);
	    int i_1885_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					      .aClass103_Sub2_9904)).anInt9260
			    * -1826993761)
			   - i_1869_);
	    if (i_1868_ + i_1870_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_1870_ -= (i_1868_ + i_1870_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i_1868_ < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_1886_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_1868_);
		i_1870_ -= i_1886_;
		i_1884_ += i_1886_ * (((Class103_Sub2)
				       (((Class168_Sub2_Sub2) this)
					.aClass103_Sub2_9904)).anInt9260
				      * -1826993761);
		i_1877_ += i_1881_ * i_1886_;
	    }
	    if (i + i_1869_ > (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_1887_ = (i + i_1869_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_1869_ -= i_1887_;
		i_1885_ += i_1887_;
	    }
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_1888_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_1869_ -= i_1888_;
		i_1884_ += i_1888_;
		i_1876_ += i_1880_ * i_1888_;
		i_1885_ += i_1888_;
	    }
	    float[] fs = (((Class103_Sub2)
			   ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			  .aFloatArray9248);
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (i_1873_ == 0) {
		if (i_1871_ == 1) {
		    int i_1889_ = i_1876_;
		    for (int i_1890_ = -i_1870_; i_1890_ < 0; i_1890_++) {
			int i_1891_
			    = ((i_1877_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_1892_ = -i_1869_; i_1892_ < 0; i_1892_++) {
			    if (!bool_1866_ || f < fs[i_1884_]) {
				if (bool)
				    is[i_1884_]
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1876_ >> 16) + i_1891_]);
				if (bool_1866_ && bool_1875_)
				    fs[i_1884_] = f;
			    }
			    i_1876_ += i_1880_;
			    i_1884_++;
			}
			i_1877_ += i_1881_;
			i_1876_ = i_1889_;
			i_1884_ += i_1885_;
		    }
		} else if (i_1871_ == 0) {
		    int i_1893_ = (i_1872_ & 0xff0000) >> 16;
		    int i_1894_ = (i_1872_ & 0xff00) >> 8;
		    int i_1895_ = i_1872_ & 0xff;
		    int i_1896_ = i_1876_;
		    for (int i_1897_ = -i_1870_; i_1897_ < 0; i_1897_++) {
			int i_1898_
			    = ((i_1877_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_1899_ = -i_1869_; i_1899_ < 0; i_1899_++) {
			    if (!bool_1866_ || f < fs[i_1884_]) {
				if (bool) {
				    int i_1900_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1876_ >> 16) + i_1898_]);
				    int i_1901_
					= ((i_1900_ & 0xff0000) * i_1893_
					   & ~0xffffff);
				    int i_1902_ = ((i_1900_ & 0xff00) * i_1894_
						   & 0xff0000);
				    int i_1903_
					= (i_1900_ & 0xff) * i_1895_ & 0xff00;
				    is[i_1884_]
					= (i_1901_ | i_1902_ | i_1903_) >>> 8;
				}
				if (bool_1866_ && bool_1875_)
				    fs[i_1884_] = f;
			    }
			    i_1876_ += i_1880_;
			    i_1884_++;
			}
			i_1877_ += i_1881_;
			i_1876_ = i_1896_;
			i_1884_ += i_1885_;
		    }
		} else if (i_1871_ == 3) {
		    int i_1904_ = i_1876_;
		    for (int i_1905_ = -i_1870_; i_1905_ < 0; i_1905_++) {
			int i_1906_
			    = ((i_1877_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_1907_ = -i_1869_; i_1907_ < 0; i_1907_++) {
			    if (!bool_1866_ || f < fs[i_1884_]) {
				if (bool) {
				    int i_1908_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1876_ >> 16) + i_1906_]);
				    int i_1909_ = i_1908_ + i_1872_;
				    int i_1910_ = ((i_1908_ & 0xff00ff)
						   + (i_1872_ & 0xff00ff));
				    int i_1911_
					= ((i_1910_ & 0x1000100)
					   + (i_1909_ - i_1910_ & 0x10000));
				    is[i_1884_]
					= (i_1909_ - i_1911_
					   | i_1911_ - (i_1911_ >>> 8));
				}
				if (bool_1866_ && bool_1875_)
				    fs[i_1884_] = f;
			    }
			    i_1876_ += i_1880_;
			    i_1884_++;
			}
			i_1877_ += i_1881_;
			i_1876_ = i_1904_;
			i_1884_ += i_1885_;
		    }
		} else if (i_1871_ == 2) {
		    int i_1912_ = i_1872_ >>> 24;
		    int i_1913_ = 256 - i_1912_;
		    int i_1914_ = (i_1872_ & 0xff00ff) * i_1913_ & ~0xff00ff;
		    int i_1915_ = (i_1872_ & 0xff00) * i_1913_ & 0xff0000;
		    i_1872_ = (i_1914_ | i_1915_) >>> 8;
		    int i_1916_ = i_1876_;
		    for (int i_1917_ = -i_1870_; i_1917_ < 0; i_1917_++) {
			int i_1918_
			    = ((i_1877_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_1919_ = -i_1869_; i_1919_ < 0; i_1919_++) {
			    if (!bool_1866_ || f < fs[i_1884_]) {
				if (bool) {
				    int i_1920_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1876_ >> 16) + i_1918_]);
				    i_1914_ = ((i_1920_ & 0xff00ff) * i_1912_
					       & ~0xff00ff);
				    i_1915_ = ((i_1920_ & 0xff00) * i_1912_
					       & 0xff0000);
				    is[i_1884_] = (((i_1914_ | i_1915_) >>> 8)
						   + i_1872_);
				}
				if (bool_1866_ && bool_1875_)
				    fs[i_1884_] = f;
			    }
			    i_1876_ += i_1880_;
			    i_1884_++;
			}
			i_1877_ += i_1881_;
			i_1876_ = i_1916_;
			i_1884_ += i_1885_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1873_ == 1) {
		if (i_1871_ == 1) {
		    int i_1921_ = i_1876_;
		    for (int i_1922_ = -i_1870_; i_1922_ < 0; i_1922_++) {
			int i_1923_
			    = ((i_1877_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_1924_ = -i_1869_; i_1924_ < 0; i_1924_++) {
			    if (!bool_1866_ || f < fs[i_1884_]) {
				if (bool) {
				    int i_1925_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1876_ >> 16) + i_1923_]);
				    int i_1926_ = i_1925_ >>> 24;
				    int i_1927_ = 256 - i_1926_;
				    int i_1928_ = is[i_1884_];
				    is[i_1884_]
					= (((((i_1925_ & 0xff00ff) * i_1926_
					      + (i_1928_ & 0xff00ff) * i_1927_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_1925_ & ~0xff00ff) >>> 8)
						* i_1926_)
					       + (((i_1928_ & ~0xff00ff) >>> 8)
						  * i_1927_))
					      & ~0xff00ff));
				}
				if (bool_1866_ && bool_1875_)
				    fs[i_1884_] = f;
			    }
			    i_1876_ += i_1880_;
			    i_1884_++;
			}
			i_1877_ += i_1881_;
			i_1876_ = i_1921_;
			i_1884_ += i_1885_;
		    }
		} else if (i_1871_ == 0) {
		    int i_1929_ = i_1876_;
		    if ((i_1872_ & 0xffffff) == 16777215) {
			for (int i_1930_ = -i_1870_; i_1930_ < 0; i_1930_++) {
			    int i_1931_
				= ((i_1877_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1932_ = -i_1869_; i_1932_ < 0;
				 i_1932_++) {
				if (!bool_1866_ || f < fs[i_1884_]) {
				    if (bool) {
					int i_1933_
					    = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1876_ >> 16) + i_1931_]);
					int i_1934_
					    = ((i_1933_ >>> 24) * (i_1872_
								   >>> 24)
					       >> 8);
					int i_1935_ = 256 - i_1934_;
					int i_1936_ = is[i_1884_];
					is[i_1884_]
					    = ((((i_1933_ & 0xff00ff) * i_1934_
						 + ((i_1936_ & 0xff00ff)
						    * i_1935_))
						& ~0xff00ff)
					       + (((i_1933_ & 0xff00) * i_1934_
						   + ((i_1936_ & 0xff00)
						      * i_1935_))
						  & 0xff0000)) >> 8;
				    }
				    if (bool_1866_ && bool_1875_)
					fs[i_1884_] = f;
				}
				i_1876_ += i_1880_;
				i_1884_++;
			    }
			    i_1877_ += i_1881_;
			    i_1876_ = i_1929_;
			    i_1884_ += i_1885_;
			}
		    } else {
			int i_1937_ = (i_1872_ & 0xff0000) >> 16;
			int i_1938_ = (i_1872_ & 0xff00) >> 8;
			int i_1939_ = i_1872_ & 0xff;
			for (int i_1940_ = -i_1870_; i_1940_ < 0; i_1940_++) {
			    int i_1941_
				= ((i_1877_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_1942_ = -i_1869_; i_1942_ < 0;
				 i_1942_++) {
				if (!bool_1866_ || f < fs[i_1884_]) {
				    int i_1943_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1876_ >> 16) + i_1941_]);
				    int i_1944_
					= ((i_1943_ >>> 24) * (i_1872_ >>> 24)
					   >> 8);
				    int i_1945_ = 256 - i_1944_;
				    if (i_1944_ != 255) {
					if (bool) {
					    int i_1946_
						= (((i_1943_ & 0xff0000)
						    * i_1937_)
						   & ~0xffffff);
					    int i_1947_
						= ((i_1943_ & 0xff00) * i_1938_
						   & 0xff0000);
					    int i_1948_
						= ((i_1943_ & 0xff) * i_1939_
						   & 0xff00);
					    i_1943_ = (i_1946_ | i_1947_
						       | i_1948_) >>> 8;
					    int i_1949_ = is[i_1884_];
					    is[i_1884_]
						= (((((i_1943_ & 0xff00ff)
						      * i_1944_)
						     + ((i_1949_ & 0xff00ff)
							* i_1945_))
						    & ~0xff00ff)
						   + ((((i_1943_ & 0xff00)
							* i_1944_)
						       + ((i_1949_ & 0xff00)
							  * i_1945_))
						      & 0xff0000)) >> 8;
					    if (bool_1867_) {
						int i_1950_ = ((i_1949_ >>> 24)
							       + i_1944_);
						if (i_1950_ > 255)
						    i_1950_ = 255;
						is[i_1884_] |= i_1950_ << 24;
					    }
					}
					if (bool_1866_ && bool_1875_)
					    fs[i_1884_] = f;
				    } else {
					if (bool) {
					    int i_1951_
						= (((i_1943_ & 0xff0000)
						    * i_1937_)
						   & ~0xffffff);
					    int i_1952_
						= ((i_1943_ & 0xff00) * i_1938_
						   & 0xff0000);
					    int i_1953_
						= ((i_1943_ & 0xff) * i_1939_
						   & 0xff00);
					    is[i_1884_] = (i_1951_ | i_1952_
							   | i_1953_) >>> 8;
					}
					if (bool_1866_ && bool_1875_)
					    fs[i_1884_] = f;
				    }
				}
				i_1876_ += i_1880_;
				i_1884_++;
			    }
			    i_1877_ += i_1881_;
			    i_1876_ = i_1929_;
			    i_1884_ += i_1885_;
			}
		    }
		} else if (i_1871_ == 3) {
		    int i_1954_ = i_1876_;
		    for (int i_1955_ = -i_1870_; i_1955_ < 0; i_1955_++) {
			int i_1956_
			    = ((i_1877_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_1957_ = -i_1869_; i_1957_ < 0; i_1957_++) {
			    if (!bool_1866_ || f < fs[i_1884_]) {
				if (bool) {
				    int i_1958_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1876_ >> 16) + i_1956_]);
				    int i_1959_ = i_1958_ + i_1872_;
				    int i_1960_ = ((i_1958_ & 0xff00ff)
						   + (i_1872_ & 0xff00ff));
				    int i_1961_
					= ((i_1960_ & 0x1000100)
					   + (i_1959_ - i_1960_ & 0x10000));
				    i_1961_ = (i_1959_ - i_1961_
					       | i_1961_ - (i_1961_ >>> 8));
				    int i_1962_
					= ((i_1961_ >>> 24) * (i_1872_ >>> 24)
					   >> 8);
				    int i_1963_ = 256 - i_1962_;
				    if (i_1962_ != 255) {
					i_1958_ = i_1961_;
					i_1961_ = is[i_1884_];
					i_1961_
					    = ((((i_1958_ & 0xff00ff) * i_1962_
						 + ((i_1961_ & 0xff00ff)
						    * i_1963_))
						& ~0xff00ff)
					       + (((i_1958_ & 0xff00) * i_1962_
						   + ((i_1961_ & 0xff00)
						      * i_1963_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_1884_] = i_1961_;
				}
				if (bool_1866_ && bool_1875_)
				    fs[i_1884_] = f;
			    }
			    i_1876_ += i_1880_;
			    i_1884_++;
			}
			i_1877_ += i_1881_;
			i_1876_ = i_1954_;
			i_1884_ += i_1885_;
		    }
		} else if (i_1871_ == 2) {
		    int i_1964_ = i_1872_ >>> 24;
		    int i_1965_ = 256 - i_1964_;
		    int i_1966_ = (i_1872_ & 0xff00ff) * i_1965_ & ~0xff00ff;
		    int i_1967_ = (i_1872_ & 0xff00) * i_1965_ & 0xff0000;
		    i_1872_ = (i_1966_ | i_1967_) >>> 8;
		    int i_1968_ = i_1876_;
		    for (int i_1969_ = -i_1870_; i_1969_ < 0; i_1969_++) {
			int i_1970_
			    = ((i_1877_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_1971_ = -i_1869_; i_1971_ < 0; i_1971_++) {
			    if (!bool_1866_ || f < fs[i_1884_]) {
				if (bool) {
				    int i_1972_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1876_ >> 16) + i_1970_]);
				    int i_1973_ = i_1972_ >>> 24;
				    int i_1974_ = 256 - i_1973_;
				    i_1966_ = ((i_1972_ & 0xff00ff) * i_1964_
					       & ~0xff00ff);
				    i_1967_ = ((i_1972_ & 0xff00) * i_1964_
					       & 0xff0000);
				    i_1972_ = (((i_1966_ | i_1967_) >>> 8)
					       + i_1872_);
				    int i_1975_ = is[i_1884_];
				    is[i_1884_]
					= ((((i_1972_ & 0xff00ff) * i_1973_
					     + (i_1975_ & 0xff00ff) * i_1974_)
					    & ~0xff00ff)
					   + (((i_1972_ & 0xff00) * i_1973_
					       + (i_1975_ & 0xff00) * i_1974_)
					      & 0xff0000)) >> 8;
				}
				if (bool_1866_ && bool_1875_)
				    fs[i_1884_] = f;
			    }
			    i_1876_ += i_1880_;
			    i_1884_++;
			}
			i_1877_ += i_1881_;
			i_1876_ = i_1968_;
			i_1884_ += i_1885_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1873_ == 2) {
		if (i_1871_ == 1) {
		    int i_1976_ = i_1876_;
		    for (int i_1977_ = -i_1870_; i_1977_ < 0; i_1977_++) {
			int i_1978_
			    = ((i_1877_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_1979_ = -i_1869_; i_1979_ < 0; i_1979_++) {
			    if (!bool_1866_ || f < fs[i_1884_]) {
				int i_1980_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1876_ >> 16) + i_1978_]);
				if (i_1980_ != 0) {
				    if (bool) {
					int i_1981_ = is[i_1884_];
					int i_1982_ = i_1980_ + i_1981_;
					int i_1983_ = ((i_1980_ & 0xff00ff)
						       + (i_1981_ & 0xff00ff));
					i_1981_ = ((i_1983_ & 0x1000100)
						   + (i_1982_ - i_1983_
						      & 0x10000));
					is[i_1884_]
					    = (i_1982_ - i_1981_
					       | i_1981_ - (i_1981_ >>> 8));
				    }
				    if (bool_1866_ && bool_1875_)
					fs[i_1884_] = f;
				}
			    }
			    i_1876_ += i_1880_;
			    i_1884_++;
			}
			i_1877_ += i_1881_;
			i_1876_ = i_1976_;
			i_1884_ += i_1885_;
		    }
		} else if (i_1871_ == 0) {
		    int i_1984_ = i_1876_;
		    int i_1985_ = (i_1872_ & 0xff0000) >> 16;
		    int i_1986_ = (i_1872_ & 0xff00) >> 8;
		    int i_1987_ = i_1872_ & 0xff;
		    for (int i_1988_ = -i_1870_; i_1988_ < 0; i_1988_++) {
			int i_1989_
			    = ((i_1877_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_1990_ = -i_1869_; i_1990_ < 0; i_1990_++) {
			    if (!bool_1866_ || f < fs[i_1884_]) {
				int i_1991_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1876_ >> 16) + i_1989_]);
				if (i_1991_ != 0) {
				    if (bool) {
					int i_1992_
					    = ((i_1991_ & 0xff0000) * i_1985_
					       & ~0xffffff);
					int i_1993_
					    = ((i_1991_ & 0xff00) * i_1986_
					       & 0xff0000);
					int i_1994_
					    = ((i_1991_ & 0xff) * i_1987_
					       & 0xff00);
					i_1991_ = (i_1992_ | i_1993_
						   | i_1994_) >>> 8;
					int i_1995_ = is[i_1884_];
					int i_1996_ = i_1991_ + i_1995_;
					int i_1997_ = ((i_1991_ & 0xff00ff)
						       + (i_1995_ & 0xff00ff));
					i_1995_ = ((i_1997_ & 0x1000100)
						   + (i_1996_ - i_1997_
						      & 0x10000));
					is[i_1884_]
					    = (i_1996_ - i_1995_
					       | i_1995_ - (i_1995_ >>> 8));
				    }
				    if (bool_1866_ && bool_1875_)
					fs[i_1884_] = f;
				}
			    }
			    i_1876_ += i_1880_;
			    i_1884_++;
			}
			i_1877_ += i_1881_;
			i_1876_ = i_1984_;
			i_1884_ += i_1885_;
		    }
		} else if (i_1871_ == 3) {
		    int i_1998_ = i_1876_;
		    for (int i_1999_ = -i_1870_; i_1999_ < 0; i_1999_++) {
			int i_2000_
			    = ((i_1877_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2001_ = -i_1869_; i_2001_ < 0; i_2001_++) {
			    if (!bool_1866_ || f < fs[i_1884_]) {
				if (bool) {
				    int i_2002_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_1876_ >> 16) + i_2000_]);
				    int i_2003_ = i_2002_ + i_1872_;
				    int i_2004_ = ((i_2002_ & 0xff00ff)
						   + (i_1872_ & 0xff00ff));
				    int i_2005_
					= ((i_2004_ & 0x1000100)
					   + (i_2003_ - i_2004_ & 0x10000));
				    i_2002_ = (i_2003_ - i_2005_
					       | i_2005_ - (i_2005_ >>> 8));
				    i_2005_ = is[i_1884_];
				    i_2003_ = i_2002_ + i_2005_;
				    i_2004_
					= (i_2002_ & 0xff00ff) + (i_2005_
								  & 0xff00ff);
				    i_2005_
					= ((i_2004_ & 0x1000100)
					   + (i_2003_ - i_2004_ & 0x10000));
				    is[i_1884_]
					= (i_2003_ - i_2005_
					   | i_2005_ - (i_2005_ >>> 8));
				}
				if (bool_1866_ && bool_1875_)
				    fs[i_1884_] = f;
			    }
			    i_1876_ += i_1880_;
			    i_1884_++;
			}
			i_1877_ += i_1881_;
			i_1876_ = i_1998_;
			i_1884_ += i_1885_;
		    }
		} else if (i_1871_ == 2) {
		    int i_2006_ = i_1872_ >>> 24;
		    int i_2007_ = 256 - i_2006_;
		    int i_2008_ = (i_1872_ & 0xff00ff) * i_2007_ & ~0xff00ff;
		    int i_2009_ = (i_1872_ & 0xff00) * i_2007_ & 0xff0000;
		    i_1872_ = (i_2008_ | i_2009_) >>> 8;
		    int i_2010_ = i_1876_;
		    for (int i_2011_ = -i_1870_; i_2011_ < 0; i_2011_++) {
			int i_2012_
			    = ((i_1877_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2013_ = -i_1869_; i_2013_ < 0; i_2013_++) {
			    if (!bool_1866_ || f < fs[i_1884_]) {
				int i_2014_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_1876_ >> 16) + i_2012_]);
				if (i_2014_ != 0) {
				    if (bool) {
					i_2008_
					    = ((i_2014_ & 0xff00ff) * i_2006_
					       & ~0xff00ff);
					i_2009_ = ((i_2014_ & 0xff00) * i_2006_
						   & 0xff0000);
					i_2014_ = (((i_2008_ | i_2009_) >>> 8)
						   + i_1872_);
					int i_2015_ = is[i_1884_];
					int i_2016_ = i_2014_ + i_2015_;
					int i_2017_ = ((i_2014_ & 0xff00ff)
						       + (i_2015_ & 0xff00ff));
					i_2015_ = ((i_2017_ & 0x1000100)
						   + (i_2016_ - i_2017_
						      & 0x10000));
					is[i_1884_]
					    = (i_2016_ - i_2015_
					       | i_2015_ - (i_2015_ >>> 8));
				    }
				    if (bool_1866_ && bool_1875_)
					fs[i_1884_] = f;
				}
			    }
			    i_1876_ += i_1880_;
			    i_1884_++;
			}
			i_1877_ += i_1881_;
			i_1876_ = i_2010_;
			i_1884_ += i_1885_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method16217(int[] is, int[] is_2018_, int i, int i_2019_) {
	int[] is_2020_ = (((Class103_Sub2)
			   ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			  .anIntArray9245);
	if (is_2020_ != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_2021_ = anInt9919;
		    while (i_2021_ < 0) {
			int i_2022_ = i_2021_ + i_2019_;
			if (i_2022_ >= 0) {
			    if (i_2022_ >= is.length)
				break;
			    int i_2023_ = anInt9925;
			    int i_2024_ = anInt9927;
			    int i_2025_ = anInt9928;
			    int i_2026_ = anInt9906;
			    if (i_2024_ >= 0 && i_2025_ >= 0
				&& (i_2024_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)) < 0
				&& (i_2025_
				    - (((Class168_Sub2_Sub2) this).anInt9916
				       << 12)) < 0) {
				int i_2027_ = is[i_2022_] - i;
				int i_2028_ = -is_2018_[i_2022_];
				int i_2029_ = i_2027_ - (i_2023_ - anInt9925);
				if (i_2029_ > 0) {
				    i_2023_ += i_2029_;
				    i_2026_ += i_2029_;
				    i_2024_ += anInt9921 * i_2029_;
				    i_2025_ += anInt9922 * i_2029_;
				} else
				    i_2028_ -= i_2029_;
				if (i_2026_ < i_2028_)
				    i_2026_ = i_2028_;
				for (/**/; i_2026_ < 0; i_2026_++) {
				    int i_2030_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(((i_2025_ >> 12)
					      * (((Class168_Sub2_Sub2) this)
						 .anInt9920))
					     + (i_2024_ >> 12))]);
				    int i_2031_ = i_2030_ >>> 24;
				    int i_2032_ = 256 - i_2031_;
				    int i_2033_ = is_2020_[i_2023_];
				    is_2020_[i_2023_++]
					= ((((i_2030_ & 0xff00ff) * i_2031_
					     + (i_2033_ & 0xff00ff) * i_2032_)
					    & ~0xff00ff)
					   + (((i_2030_ & 0xff00) * i_2031_
					       + (i_2033_ & 0xff00) * i_2032_)
					      & 0xff0000)) >> 8;
				}
			    }
			}
			i_2021_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_2034_ = anInt9919;
		    while (i_2034_ < 0) {
			int i_2035_ = i_2034_ + i_2019_;
			if (i_2035_ >= 0) {
			    if (i_2035_ >= is.length)
				break;
			    int i_2036_ = anInt9925;
			    int i_2037_ = anInt9927;
			    int i_2038_ = anInt9928 + anInt9930;
			    int i_2039_ = anInt9906;
			    if (i_2037_ >= 0
				&& (i_2037_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)) < 0) {
				int i_2040_;
				if ((i_2040_
				     = i_2038_ - ((((Class168_Sub2_Sub2) this)
						   .anInt9916)
						  << 12))
				    >= 0) {
				    i_2040_
					= (anInt9922 - i_2040_) / anInt9922;
				    i_2039_ += i_2040_;
				    i_2038_ += anInt9922 * i_2040_;
				    i_2036_ += i_2040_;
				}
				if ((i_2040_
				     = (i_2038_ - anInt9922) / anInt9922)
				    > i_2039_)
				    i_2039_ = i_2040_;
				int i_2041_ = is[i_2035_] - i;
				int i_2042_ = -is_2018_[i_2035_];
				int i_2043_ = i_2041_ - (i_2036_ - anInt9925);
				if (i_2043_ > 0) {
				    i_2036_ += i_2043_;
				    i_2039_ += i_2043_;
				    i_2037_ += anInt9921 * i_2043_;
				    i_2038_ += anInt9922 * i_2043_;
				} else
				    i_2042_ -= i_2043_;
				if (i_2039_ < i_2042_)
				    i_2039_ = i_2042_;
				for (/**/; i_2039_ < 0; i_2039_++) {
				    int i_2044_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(((i_2038_ >> 12)
					      * (((Class168_Sub2_Sub2) this)
						 .anInt9920))
					     + (i_2037_ >> 12))]);
				    int i_2045_ = i_2044_ >>> 24;
				    int i_2046_ = 256 - i_2045_;
				    int i_2047_ = is_2020_[i_2036_];
				    is_2020_[i_2036_++]
					= ((((i_2044_ & 0xff00ff) * i_2045_
					     + (i_2047_ & 0xff00ff) * i_2046_)
					    & ~0xff00ff)
					   + (((i_2044_ & 0xff00) * i_2045_
					       + (i_2047_ & 0xff00) * i_2046_)
					      & 0xff0000)) >> 8;
				    i_2038_ += anInt9922;
				}
			    }
			}
			i_2034_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_2048_ = anInt9919;
		    while (i_2048_ < 0) {
			int i_2049_ = i_2048_ + i_2019_;
			if (i_2049_ >= 0) {
			    if (i_2049_ >= is.length)
				break;
			    int i_2050_ = anInt9925;
			    int i_2051_ = anInt9927;
			    int i_2052_ = anInt9928 + anInt9930;
			    int i_2053_ = anInt9906;
			    if (i_2051_ >= 0
				&& (i_2051_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)) < 0) {
				if (i_2052_ < 0) {
				    int i_2054_ = ((anInt9922 - 1 - i_2052_)
						   / anInt9922);
				    i_2053_ += i_2054_;
				    i_2052_ += anInt9922 * i_2054_;
				    i_2050_ += i_2054_;
				}
				int i_2055_;
				if ((i_2055_ = (1 + i_2052_
						- ((((Class168_Sub2_Sub2) this)
						    .anInt9916)
						   << 12)
						- anInt9922) / anInt9922)
				    > i_2053_)
				    i_2053_ = i_2055_;
				int i_2056_ = is[i_2049_] - i;
				int i_2057_ = -is_2018_[i_2049_];
				int i_2058_ = i_2056_ - (i_2050_ - anInt9925);
				if (i_2058_ > 0) {
				    i_2050_ += i_2058_;
				    i_2053_ += i_2058_;
				    i_2051_ += anInt9921 * i_2058_;
				    i_2052_ += anInt9922 * i_2058_;
				} else
				    i_2057_ -= i_2058_;
				if (i_2053_ < i_2057_)
				    i_2053_ = i_2057_;
				for (/**/; i_2053_ < 0; i_2053_++) {
				    int i_2059_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(((i_2052_ >> 12)
					      * (((Class168_Sub2_Sub2) this)
						 .anInt9920))
					     + (i_2051_ >> 12))]);
				    int i_2060_ = i_2059_ >>> 24;
				    int i_2061_ = 256 - i_2060_;
				    int i_2062_ = is_2020_[i_2050_];
				    is_2020_[i_2050_++]
					= ((((i_2059_ & 0xff00ff) * i_2060_
					     + (i_2062_ & 0xff00ff) * i_2061_)
					    & ~0xff00ff)
					   + (((i_2059_ & 0xff00) * i_2060_
					       + (i_2062_ & 0xff00) * i_2061_)
					      & 0xff0000)) >> 8;
				    i_2052_ += anInt9922;
				}
			    }
			}
			i_2048_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_2063_ = anInt9919;
		    while (i_2063_ < 0) {
			int i_2064_ = i_2063_ + i_2019_;
			if (i_2064_ >= 0) {
			    if (i_2064_ >= is.length)
				break;
			    int i_2065_ = anInt9925;
			    int i_2066_ = anInt9927 + anInt9929;
			    int i_2067_ = anInt9928;
			    int i_2068_ = anInt9906;
			    if (i_2067_ >= 0
				&& (i_2067_
				    - (((Class168_Sub2_Sub2) this).anInt9916
				       << 12)) < 0) {
				int i_2069_;
				if ((i_2069_
				     = i_2066_ - ((((Class168_Sub2_Sub2) this)
						   .anInt9920)
						  << 12))
				    >= 0) {
				    i_2069_
					= (anInt9921 - i_2069_) / anInt9921;
				    i_2068_ += i_2069_;
				    i_2066_ += anInt9921 * i_2069_;
				    i_2065_ += i_2069_;
				}
				if ((i_2069_
				     = (i_2066_ - anInt9921) / anInt9921)
				    > i_2068_)
				    i_2068_ = i_2069_;
				int i_2070_ = is[i_2064_] - i;
				int i_2071_ = -is_2018_[i_2064_];
				int i_2072_ = i_2070_ - (i_2065_ - anInt9925);
				if (i_2072_ > 0) {
				    i_2065_ += i_2072_;
				    i_2068_ += i_2072_;
				    i_2066_ += anInt9921 * i_2072_;
				    i_2067_ += anInt9922 * i_2072_;
				} else
				    i_2071_ -= i_2072_;
				if (i_2068_ < i_2071_)
				    i_2068_ = i_2071_;
				for (/**/; i_2068_ < 0; i_2068_++) {
				    int i_2073_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(((i_2067_ >> 12)
					      * (((Class168_Sub2_Sub2) this)
						 .anInt9920))
					     + (i_2066_ >> 12))]);
				    int i_2074_ = i_2073_ >>> 24;
				    int i_2075_ = 256 - i_2074_;
				    int i_2076_ = is_2020_[i_2065_];
				    is_2020_[i_2065_++]
					= ((((i_2073_ & 0xff00ff) * i_2074_
					     + (i_2076_ & 0xff00ff) * i_2075_)
					    & ~0xff00ff)
					   + (((i_2073_ & 0xff00) * i_2074_
					       + (i_2076_ & 0xff00) * i_2075_)
					      & 0xff0000)) >> 8;
				    i_2066_ += anInt9921;
				}
			    }
			}
			i_2063_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_2077_ = anInt9919;
		    while (i_2077_ < 0) {
			int i_2078_ = i_2077_ + i_2019_;
			if (i_2078_ >= 0) {
			    if (i_2078_ >= is.length)
				break;
			    int i_2079_ = anInt9925;
			    int i_2080_ = anInt9927 + anInt9929;
			    int i_2081_ = anInt9928 + anInt9930;
			    int i_2082_ = anInt9906;
			    int i_2083_;
			    if ((i_2083_
				 = (i_2080_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)))
				>= 0) {
				i_2083_ = (anInt9921 - i_2083_) / anInt9921;
				i_2082_ += i_2083_;
				i_2080_ += anInt9921 * i_2083_;
				i_2081_ += anInt9922 * i_2083_;
				i_2079_ += i_2083_;
			    }
			    if ((i_2083_ = (i_2080_ - anInt9921) / anInt9921)
				> i_2082_)
				i_2082_ = i_2083_;
			    if ((i_2083_
				 = (i_2081_
				    - (((Class168_Sub2_Sub2) this).anInt9916
				       << 12)))
				>= 0) {
				i_2083_ = (anInt9922 - i_2083_) / anInt9922;
				i_2082_ += i_2083_;
				i_2080_ += anInt9921 * i_2083_;
				i_2081_ += anInt9922 * i_2083_;
				i_2079_ += i_2083_;
			    }
			    if ((i_2083_ = (i_2081_ - anInt9922) / anInt9922)
				> i_2082_)
				i_2082_ = i_2083_;
			    int i_2084_ = is[i_2078_] - i;
			    int i_2085_ = -is_2018_[i_2078_];
			    int i_2086_ = i_2084_ - (i_2079_ - anInt9925);
			    if (i_2086_ > 0) {
				i_2079_ += i_2086_;
				i_2082_ += i_2086_;
				i_2080_ += anInt9921 * i_2086_;
				i_2081_ += anInt9922 * i_2086_;
			    } else
				i_2085_ -= i_2086_;
			    if (i_2082_ < i_2085_)
				i_2082_ = i_2085_;
			    for (/**/; i_2082_ < 0; i_2082_++) {
				int i_2087_
				    = (((Class168_Sub2_Sub2) this)
				       .anIntArray11124
				       [((i_2081_ >> 12)
					 * (((Class168_Sub2_Sub2) this)
					    .anInt9920)) + (i_2080_ >> 12)]);
				int i_2088_ = i_2087_ >>> 24;
				int i_2089_ = 256 - i_2088_;
				int i_2090_ = is_2020_[i_2079_];
				is_2020_[i_2079_++]
				    = ((((i_2087_ & 0xff00ff) * i_2088_
					 + (i_2090_ & 0xff00ff) * i_2089_)
					& ~0xff00ff)
				       + (((i_2087_ & 0xff00) * i_2088_
					   + (i_2090_ & 0xff00) * i_2089_)
					  & 0xff0000)) >> 8;
				i_2080_ += anInt9921;
				i_2081_ += anInt9922;
			    }
			}
			i_2077_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_2091_ = anInt9919;
		    while (i_2091_ < 0) {
			int i_2092_ = i_2091_ + i_2019_;
			if (i_2092_ >= 0) {
			    if (i_2092_ >= is.length)
				break;
			    int i_2093_ = anInt9925;
			    int i_2094_ = anInt9927 + anInt9929;
			    int i_2095_ = anInt9928 + anInt9930;
			    int i_2096_ = anInt9906;
			    int i_2097_;
			    if ((i_2097_
				 = (i_2094_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)))
				>= 0) {
				i_2097_ = (anInt9921 - i_2097_) / anInt9921;
				i_2096_ += i_2097_;
				i_2094_ += anInt9921 * i_2097_;
				i_2095_ += anInt9922 * i_2097_;
				i_2093_ += i_2097_;
			    }
			    if ((i_2097_ = (i_2094_ - anInt9921) / anInt9921)
				> i_2096_)
				i_2096_ = i_2097_;
			    if (i_2095_ < 0) {
				i_2097_
				    = (anInt9922 - 1 - i_2095_) / anInt9922;
				i_2096_ += i_2097_;
				i_2094_ += anInt9921 * i_2097_;
				i_2095_ += anInt9922 * i_2097_;
				i_2093_ += i_2097_;
			    }
			    if ((i_2097_
				 = (1 + i_2095_
				    - (((Class168_Sub2_Sub2) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_2096_)
				i_2096_ = i_2097_;
			    int i_2098_ = is[i_2092_] - i;
			    int i_2099_ = -is_2018_[i_2092_];
			    int i_2100_ = i_2098_ - (i_2093_ - anInt9925);
			    if (i_2100_ > 0) {
				i_2093_ += i_2100_;
				i_2096_ += i_2100_;
				i_2094_ += anInt9921 * i_2100_;
				i_2095_ += anInt9922 * i_2100_;
			    } else
				i_2099_ -= i_2100_;
			    if (i_2096_ < i_2099_)
				i_2096_ = i_2099_;
			    for (/**/; i_2096_ < 0; i_2096_++) {
				int i_2101_
				    = (((Class168_Sub2_Sub2) this)
				       .anIntArray11124
				       [((i_2095_ >> 12)
					 * (((Class168_Sub2_Sub2) this)
					    .anInt9920)) + (i_2094_ >> 12)]);
				int i_2102_ = i_2101_ >>> 24;
				int i_2103_ = 256 - i_2102_;
				int i_2104_ = is_2020_[i_2093_];
				is_2020_[i_2093_++]
				    = ((((i_2101_ & 0xff00ff) * i_2102_
					 + (i_2104_ & 0xff00ff) * i_2103_)
					& ~0xff00ff)
				       + (((i_2101_ & 0xff00) * i_2102_
					   + (i_2104_ & 0xff00) * i_2103_)
					  & 0xff0000)) >> 8;
				i_2094_ += anInt9921;
				i_2095_ += anInt9922;
			    }
			}
			i_2091_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_2105_ = anInt9919;
		while (i_2105_ < 0) {
		    int i_2106_ = i_2105_ + i_2019_;
		    if (i_2106_ >= 0) {
			if (i_2106_ >= is.length)
			    break;
			int i_2107_ = anInt9925;
			int i_2108_ = anInt9927 + anInt9929;
			int i_2109_ = anInt9928;
			int i_2110_ = anInt9906;
			if (i_2109_ >= 0
			    && i_2109_ - (((Class168_Sub2_Sub2) this).anInt9916
					  << 12) < 0) {
			    if (i_2108_ < 0) {
				int i_2111_
				    = (anInt9921 - 1 - i_2108_) / anInt9921;
				i_2110_ += i_2111_;
				i_2108_ += anInt9921 * i_2111_;
				i_2107_ += i_2111_;
			    }
			    int i_2112_;
			    if ((i_2112_
				 = (1 + i_2108_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)
				    - anInt9921) / anInt9921)
				> i_2110_)
				i_2110_ = i_2112_;
			    int i_2113_ = is[i_2106_] - i;
			    int i_2114_ = -is_2018_[i_2106_];
			    int i_2115_ = i_2113_ - (i_2107_ - anInt9925);
			    if (i_2115_ > 0) {
				i_2107_ += i_2115_;
				i_2110_ += i_2115_;
				i_2108_ += anInt9921 * i_2115_;
				i_2109_ += anInt9922 * i_2115_;
			    } else
				i_2114_ -= i_2115_;
			    if (i_2110_ < i_2114_)
				i_2110_ = i_2114_;
			    for (/**/; i_2110_ < 0; i_2110_++) {
				int i_2116_
				    = (((Class168_Sub2_Sub2) this)
				       .anIntArray11124
				       [((i_2109_ >> 12)
					 * (((Class168_Sub2_Sub2) this)
					    .anInt9920)) + (i_2108_ >> 12)]);
				int i_2117_ = i_2116_ >>> 24;
				int i_2118_ = 256 - i_2117_;
				int i_2119_ = is_2020_[i_2107_];
				is_2020_[i_2107_++]
				    = ((((i_2116_ & 0xff00ff) * i_2117_
					 + (i_2119_ & 0xff00ff) * i_2118_)
					& ~0xff00ff)
				       + (((i_2116_ & 0xff00) * i_2117_
					   + (i_2119_ & 0xff00) * i_2118_)
					  & 0xff0000)) >> 8;
				i_2108_ += anInt9921;
			    }
			}
		    }
		    i_2105_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		int i_2120_ = anInt9919;
		while (i_2120_ < 0) {
		    int i_2121_ = i_2120_ + i_2019_;
		    if (i_2121_ >= 0) {
			if (i_2121_ >= is.length)
			    break;
			int i_2122_ = anInt9925;
			int i_2123_ = anInt9927 + anInt9929;
			int i_2124_ = anInt9928 + anInt9930;
			int i_2125_ = anInt9906;
			if (i_2123_ < 0) {
			    int i_2126_
				= (anInt9921 - 1 - i_2123_) / anInt9921;
			    i_2125_ += i_2126_;
			    i_2123_ += anInt9921 * i_2126_;
			    i_2124_ += anInt9922 * i_2126_;
			    i_2122_ += i_2126_;
			}
			int i_2127_;
			if ((i_2127_
			     = (1 + i_2123_
				- (((Class168_Sub2_Sub2) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_2125_)
			    i_2125_ = i_2127_;
			if ((i_2127_
			     = i_2124_ - (((Class168_Sub2_Sub2) this).anInt9916
					  << 12))
			    >= 0) {
			    i_2127_ = (anInt9922 - i_2127_) / anInt9922;
			    i_2125_ += i_2127_;
			    i_2123_ += anInt9921 * i_2127_;
			    i_2124_ += anInt9922 * i_2127_;
			    i_2122_ += i_2127_;
			}
			if ((i_2127_ = (i_2124_ - anInt9922) / anInt9922)
			    > i_2125_)
			    i_2125_ = i_2127_;
			int i_2128_ = is[i_2121_] - i;
			int i_2129_ = -is_2018_[i_2121_];
			int i_2130_ = i_2128_ - (i_2122_ - anInt9925);
			if (i_2130_ > 0) {
			    i_2122_ += i_2130_;
			    i_2125_ += i_2130_;
			    i_2123_ += anInt9921 * i_2130_;
			    i_2124_ += anInt9922 * i_2130_;
			} else
			    i_2129_ -= i_2130_;
			if (i_2125_ < i_2129_)
			    i_2125_ = i_2129_;
			for (/**/; i_2125_ < 0; i_2125_++) {
			    int i_2131_
				= (((Class168_Sub2_Sub2) this).anIntArray11124
				   [(((i_2124_ >> 12)
				      * ((Class168_Sub2_Sub2) this).anInt9920)
				     + (i_2123_ >> 12))]);
			    int i_2132_ = i_2131_ >>> 24;
			    int i_2133_ = 256 - i_2132_;
			    int i_2134_ = is_2020_[i_2122_];
			    is_2020_[i_2122_++]
				= ((((i_2131_ & 0xff00ff) * i_2132_
				     + (i_2134_ & 0xff00ff) * i_2133_)
				    & ~0xff00ff)
				   + (((i_2131_ & 0xff00) * i_2132_
				       + (i_2134_ & 0xff00) * i_2133_)
				      & 0xff0000)) >> 8;
			    i_2123_ += anInt9921;
			    i_2124_ += anInt9922;
			}
		    }
		    i_2120_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		int i_2135_ = anInt9919;
		while (i_2135_ < 0) {
		    int i_2136_ = i_2135_ + i_2019_;
		    if (i_2136_ >= 0) {
			if (i_2136_ >= is.length)
			    break;
			int i_2137_ = anInt9925;
			int i_2138_ = anInt9927 + anInt9929;
			int i_2139_ = anInt9928 + anInt9930;
			int i_2140_ = anInt9906;
			if (i_2138_ < 0) {
			    int i_2141_
				= (anInt9921 - 1 - i_2138_) / anInt9921;
			    i_2140_ += i_2141_;
			    i_2138_ += anInt9921 * i_2141_;
			    i_2139_ += anInt9922 * i_2141_;
			    i_2137_ += i_2141_;
			}
			int i_2142_;
			if ((i_2142_
			     = (1 + i_2138_
				- (((Class168_Sub2_Sub2) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_2140_)
			    i_2140_ = i_2142_;
			if (i_2139_ < 0) {
			    i_2142_ = (anInt9922 - 1 - i_2139_) / anInt9922;
			    i_2140_ += i_2142_;
			    i_2138_ += anInt9921 * i_2142_;
			    i_2139_ += anInt9922 * i_2142_;
			    i_2137_ += i_2142_;
			}
			if ((i_2142_
			     = (1 + i_2139_
				- (((Class168_Sub2_Sub2) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_2140_)
			    i_2140_ = i_2142_;
			int i_2143_ = is[i_2136_] - i;
			int i_2144_ = -is_2018_[i_2136_];
			int i_2145_ = i_2143_ - (i_2137_ - anInt9925);
			if (i_2145_ > 0) {
			    i_2137_ += i_2145_;
			    i_2140_ += i_2145_;
			    i_2138_ += anInt9921 * i_2145_;
			    i_2139_ += anInt9922 * i_2145_;
			} else
			    i_2144_ -= i_2145_;
			if (i_2140_ < i_2144_)
			    i_2140_ = i_2144_;
			for (/**/; i_2140_ < 0; i_2140_++) {
			    int i_2146_
				= (((Class168_Sub2_Sub2) this).anIntArray11124
				   [(((i_2139_ >> 12)
				      * ((Class168_Sub2_Sub2) this).anInt9920)
				     + (i_2138_ >> 12))]);
			    int i_2147_ = i_2146_ >>> 24;
			    int i_2148_ = 256 - i_2147_;
			    int i_2149_ = is_2020_[i_2137_];
			    is_2020_[i_2137_++]
				= ((((i_2146_ & 0xff00ff) * i_2147_
				     + (i_2149_ & 0xff00ff) * i_2148_)
				    & ~0xff00ff)
				   + (((i_2146_ & 0xff00) * i_2147_
				       + (i_2149_ & 0xff00) * i_2148_)
				      & 0xff0000)) >> 8;
			    i_2138_ += anInt9921;
			    i_2139_ += anInt9922;
			}
		    }
		    i_2135_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    void method16225(boolean bool, boolean bool_2150_, boolean bool_2151_,
		     int i, int i_2152_, float f, int i_2153_, int i_2154_,
		     int i_2155_, int i_2156_, int i_2157_, int i_2158_,
		     boolean bool_2159_) {
	if (i_2153_ > 0 && i_2154_ > 0 && (bool || bool_2150_)) {
	    int i_2160_ = 0;
	    int i_2161_ = 0;
	    int i_2162_ = (((Class168_Sub2_Sub2) this).anInt9907
			   + ((Class168_Sub2_Sub2) this).anInt9920
			   + ((Class168_Sub2_Sub2) this).anInt9909);
	    int i_2163_ = (((Class168_Sub2_Sub2) this).anInt9905
			   + ((Class168_Sub2_Sub2) this).anInt9916
			   + ((Class168_Sub2_Sub2) this).anInt9910);
	    int i_2164_ = (i_2162_ << 16) / i_2153_;
	    int i_2165_ = (i_2163_ << 16) / i_2154_;
	    if (((Class168_Sub2_Sub2) this).anInt9907 > 0) {
		int i_2166_ = (((((Class168_Sub2_Sub2) this).anInt9907 << 16)
				+ i_2164_ - 1)
			       / i_2164_);
		i += i_2166_;
		i_2160_ += (i_2166_ * i_2164_
			    - (((Class168_Sub2_Sub2) this).anInt9907 << 16));
	    }
	    if (((Class168_Sub2_Sub2) this).anInt9905 > 0) {
		int i_2167_ = (((((Class168_Sub2_Sub2) this).anInt9905 << 16)
				+ i_2165_ - 1)
			       / i_2165_);
		i_2152_ += i_2167_;
		i_2161_ += (i_2167_ * i_2165_
			    - (((Class168_Sub2_Sub2) this).anInt9905 << 16));
	    }
	    if (((Class168_Sub2_Sub2) this).anInt9920 < i_2162_)
		i_2153_ = ((((Class168_Sub2_Sub2) this).anInt9920 << 16)
			   - i_2160_ + i_2164_ - 1) / i_2164_;
	    if (((Class168_Sub2_Sub2) this).anInt9916 < i_2163_)
		i_2154_ = ((((Class168_Sub2_Sub2) this).anInt9916 << 16)
			   - i_2161_ + i_2165_ - 1) / i_2165_;
	    int i_2168_
		= i + i_2152_ * ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						    .aClass103_Sub2_9904))
				  .anInt9260)
				 * -1826993761);
	    int i_2169_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					      .aClass103_Sub2_9904)).anInt9260
			    * -1826993761)
			   - i_2153_);
	    if (i_2152_ + i_2154_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_2154_ -= (i_2152_ + i_2154_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i_2152_ < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_2170_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_2152_);
		i_2154_ -= i_2170_;
		i_2168_ += i_2170_ * (((Class103_Sub2)
				       (((Class168_Sub2_Sub2) this)
					.aClass103_Sub2_9904)).anInt9260
				      * -1826993761);
		i_2161_ += i_2165_ * i_2170_;
	    }
	    if (i + i_2153_ > (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_2171_ = (i + i_2153_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_2153_ -= i_2171_;
		i_2169_ += i_2171_;
	    }
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_2172_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_2153_ -= i_2172_;
		i_2168_ += i_2172_;
		i_2160_ += i_2164_ * i_2172_;
		i_2169_ += i_2172_;
	    }
	    float[] fs = (((Class103_Sub2)
			   ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			  .aFloatArray9248);
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (i_2157_ == 0) {
		if (i_2155_ == 1) {
		    int i_2173_ = i_2160_;
		    for (int i_2174_ = -i_2154_; i_2174_ < 0; i_2174_++) {
			int i_2175_
			    = ((i_2161_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2176_ = -i_2153_; i_2176_ < 0; i_2176_++) {
			    if (!bool_2150_ || f < fs[i_2168_]) {
				if (bool)
				    is[i_2168_]
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2160_ >> 16) + i_2175_]);
				if (bool_2150_ && bool_2159_)
				    fs[i_2168_] = f;
			    }
			    i_2160_ += i_2164_;
			    i_2168_++;
			}
			i_2161_ += i_2165_;
			i_2160_ = i_2173_;
			i_2168_ += i_2169_;
		    }
		} else if (i_2155_ == 0) {
		    int i_2177_ = (i_2156_ & 0xff0000) >> 16;
		    int i_2178_ = (i_2156_ & 0xff00) >> 8;
		    int i_2179_ = i_2156_ & 0xff;
		    int i_2180_ = i_2160_;
		    for (int i_2181_ = -i_2154_; i_2181_ < 0; i_2181_++) {
			int i_2182_
			    = ((i_2161_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2183_ = -i_2153_; i_2183_ < 0; i_2183_++) {
			    if (!bool_2150_ || f < fs[i_2168_]) {
				if (bool) {
				    int i_2184_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2160_ >> 16) + i_2182_]);
				    int i_2185_
					= ((i_2184_ & 0xff0000) * i_2177_
					   & ~0xffffff);
				    int i_2186_ = ((i_2184_ & 0xff00) * i_2178_
						   & 0xff0000);
				    int i_2187_
					= (i_2184_ & 0xff) * i_2179_ & 0xff00;
				    is[i_2168_]
					= (i_2185_ | i_2186_ | i_2187_) >>> 8;
				}
				if (bool_2150_ && bool_2159_)
				    fs[i_2168_] = f;
			    }
			    i_2160_ += i_2164_;
			    i_2168_++;
			}
			i_2161_ += i_2165_;
			i_2160_ = i_2180_;
			i_2168_ += i_2169_;
		    }
		} else if (i_2155_ == 3) {
		    int i_2188_ = i_2160_;
		    for (int i_2189_ = -i_2154_; i_2189_ < 0; i_2189_++) {
			int i_2190_
			    = ((i_2161_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2191_ = -i_2153_; i_2191_ < 0; i_2191_++) {
			    if (!bool_2150_ || f < fs[i_2168_]) {
				if (bool) {
				    int i_2192_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2160_ >> 16) + i_2190_]);
				    int i_2193_ = i_2192_ + i_2156_;
				    int i_2194_ = ((i_2192_ & 0xff00ff)
						   + (i_2156_ & 0xff00ff));
				    int i_2195_
					= ((i_2194_ & 0x1000100)
					   + (i_2193_ - i_2194_ & 0x10000));
				    is[i_2168_]
					= (i_2193_ - i_2195_
					   | i_2195_ - (i_2195_ >>> 8));
				}
				if (bool_2150_ && bool_2159_)
				    fs[i_2168_] = f;
			    }
			    i_2160_ += i_2164_;
			    i_2168_++;
			}
			i_2161_ += i_2165_;
			i_2160_ = i_2188_;
			i_2168_ += i_2169_;
		    }
		} else if (i_2155_ == 2) {
		    int i_2196_ = i_2156_ >>> 24;
		    int i_2197_ = 256 - i_2196_;
		    int i_2198_ = (i_2156_ & 0xff00ff) * i_2197_ & ~0xff00ff;
		    int i_2199_ = (i_2156_ & 0xff00) * i_2197_ & 0xff0000;
		    i_2156_ = (i_2198_ | i_2199_) >>> 8;
		    int i_2200_ = i_2160_;
		    for (int i_2201_ = -i_2154_; i_2201_ < 0; i_2201_++) {
			int i_2202_
			    = ((i_2161_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2203_ = -i_2153_; i_2203_ < 0; i_2203_++) {
			    if (!bool_2150_ || f < fs[i_2168_]) {
				if (bool) {
				    int i_2204_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2160_ >> 16) + i_2202_]);
				    i_2198_ = ((i_2204_ & 0xff00ff) * i_2196_
					       & ~0xff00ff);
				    i_2199_ = ((i_2204_ & 0xff00) * i_2196_
					       & 0xff0000);
				    is[i_2168_] = (((i_2198_ | i_2199_) >>> 8)
						   + i_2156_);
				}
				if (bool_2150_ && bool_2159_)
				    fs[i_2168_] = f;
			    }
			    i_2160_ += i_2164_;
			    i_2168_++;
			}
			i_2161_ += i_2165_;
			i_2160_ = i_2200_;
			i_2168_ += i_2169_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_2157_ == 1) {
		if (i_2155_ == 1) {
		    int i_2205_ = i_2160_;
		    for (int i_2206_ = -i_2154_; i_2206_ < 0; i_2206_++) {
			int i_2207_
			    = ((i_2161_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2208_ = -i_2153_; i_2208_ < 0; i_2208_++) {
			    if (!bool_2150_ || f < fs[i_2168_]) {
				if (bool) {
				    int i_2209_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2160_ >> 16) + i_2207_]);
				    int i_2210_ = i_2209_ >>> 24;
				    int i_2211_ = 256 - i_2210_;
				    int i_2212_ = is[i_2168_];
				    is[i_2168_]
					= (((((i_2209_ & 0xff00ff) * i_2210_
					      + (i_2212_ & 0xff00ff) * i_2211_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_2209_ & ~0xff00ff) >>> 8)
						* i_2210_)
					       + (((i_2212_ & ~0xff00ff) >>> 8)
						  * i_2211_))
					      & ~0xff00ff));
				}
				if (bool_2150_ && bool_2159_)
				    fs[i_2168_] = f;
			    }
			    i_2160_ += i_2164_;
			    i_2168_++;
			}
			i_2161_ += i_2165_;
			i_2160_ = i_2205_;
			i_2168_ += i_2169_;
		    }
		} else if (i_2155_ == 0) {
		    int i_2213_ = i_2160_;
		    if ((i_2156_ & 0xffffff) == 16777215) {
			for (int i_2214_ = -i_2154_; i_2214_ < 0; i_2214_++) {
			    int i_2215_
				= ((i_2161_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_2216_ = -i_2153_; i_2216_ < 0;
				 i_2216_++) {
				if (!bool_2150_ || f < fs[i_2168_]) {
				    if (bool) {
					int i_2217_
					    = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_2160_ >> 16) + i_2215_]);
					int i_2218_
					    = ((i_2217_ >>> 24) * (i_2156_
								   >>> 24)
					       >> 8);
					int i_2219_ = 256 - i_2218_;
					int i_2220_ = is[i_2168_];
					is[i_2168_]
					    = ((((i_2217_ & 0xff00ff) * i_2218_
						 + ((i_2220_ & 0xff00ff)
						    * i_2219_))
						& ~0xff00ff)
					       + (((i_2217_ & 0xff00) * i_2218_
						   + ((i_2220_ & 0xff00)
						      * i_2219_))
						  & 0xff0000)) >> 8;
				    }
				    if (bool_2150_ && bool_2159_)
					fs[i_2168_] = f;
				}
				i_2160_ += i_2164_;
				i_2168_++;
			    }
			    i_2161_ += i_2165_;
			    i_2160_ = i_2213_;
			    i_2168_ += i_2169_;
			}
		    } else {
			int i_2221_ = (i_2156_ & 0xff0000) >> 16;
			int i_2222_ = (i_2156_ & 0xff00) >> 8;
			int i_2223_ = i_2156_ & 0xff;
			for (int i_2224_ = -i_2154_; i_2224_ < 0; i_2224_++) {
			    int i_2225_
				= ((i_2161_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_2226_ = -i_2153_; i_2226_ < 0;
				 i_2226_++) {
				if (!bool_2150_ || f < fs[i_2168_]) {
				    int i_2227_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2160_ >> 16) + i_2225_]);
				    int i_2228_
					= ((i_2227_ >>> 24) * (i_2156_ >>> 24)
					   >> 8);
				    int i_2229_ = 256 - i_2228_;
				    if (i_2228_ != 255) {
					if (bool) {
					    int i_2230_
						= (((i_2227_ & 0xff0000)
						    * i_2221_)
						   & ~0xffffff);
					    int i_2231_
						= ((i_2227_ & 0xff00) * i_2222_
						   & 0xff0000);
					    int i_2232_
						= ((i_2227_ & 0xff) * i_2223_
						   & 0xff00);
					    i_2227_ = (i_2230_ | i_2231_
						       | i_2232_) >>> 8;
					    int i_2233_ = is[i_2168_];
					    is[i_2168_]
						= (((((i_2227_ & 0xff00ff)
						      * i_2228_)
						     + ((i_2233_ & 0xff00ff)
							* i_2229_))
						    & ~0xff00ff)
						   + ((((i_2227_ & 0xff00)
							* i_2228_)
						       + ((i_2233_ & 0xff00)
							  * i_2229_))
						      & 0xff0000)) >> 8;
					    if (bool_2151_) {
						int i_2234_ = ((i_2233_ >>> 24)
							       + i_2228_);
						if (i_2234_ > 255)
						    i_2234_ = 255;
						is[i_2168_] |= i_2234_ << 24;
					    }
					}
					if (bool_2150_ && bool_2159_)
					    fs[i_2168_] = f;
				    } else {
					if (bool) {
					    int i_2235_
						= (((i_2227_ & 0xff0000)
						    * i_2221_)
						   & ~0xffffff);
					    int i_2236_
						= ((i_2227_ & 0xff00) * i_2222_
						   & 0xff0000);
					    int i_2237_
						= ((i_2227_ & 0xff) * i_2223_
						   & 0xff00);
					    is[i_2168_] = (i_2235_ | i_2236_
							   | i_2237_) >>> 8;
					}
					if (bool_2150_ && bool_2159_)
					    fs[i_2168_] = f;
				    }
				}
				i_2160_ += i_2164_;
				i_2168_++;
			    }
			    i_2161_ += i_2165_;
			    i_2160_ = i_2213_;
			    i_2168_ += i_2169_;
			}
		    }
		} else if (i_2155_ == 3) {
		    int i_2238_ = i_2160_;
		    for (int i_2239_ = -i_2154_; i_2239_ < 0; i_2239_++) {
			int i_2240_
			    = ((i_2161_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2241_ = -i_2153_; i_2241_ < 0; i_2241_++) {
			    if (!bool_2150_ || f < fs[i_2168_]) {
				if (bool) {
				    int i_2242_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2160_ >> 16) + i_2240_]);
				    int i_2243_ = i_2242_ + i_2156_;
				    int i_2244_ = ((i_2242_ & 0xff00ff)
						   + (i_2156_ & 0xff00ff));
				    int i_2245_
					= ((i_2244_ & 0x1000100)
					   + (i_2243_ - i_2244_ & 0x10000));
				    i_2245_ = (i_2243_ - i_2245_
					       | i_2245_ - (i_2245_ >>> 8));
				    int i_2246_
					= ((i_2245_ >>> 24) * (i_2156_ >>> 24)
					   >> 8);
				    int i_2247_ = 256 - i_2246_;
				    if (i_2246_ != 255) {
					i_2242_ = i_2245_;
					i_2245_ = is[i_2168_];
					i_2245_
					    = ((((i_2242_ & 0xff00ff) * i_2246_
						 + ((i_2245_ & 0xff00ff)
						    * i_2247_))
						& ~0xff00ff)
					       + (((i_2242_ & 0xff00) * i_2246_
						   + ((i_2245_ & 0xff00)
						      * i_2247_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_2168_] = i_2245_;
				}
				if (bool_2150_ && bool_2159_)
				    fs[i_2168_] = f;
			    }
			    i_2160_ += i_2164_;
			    i_2168_++;
			}
			i_2161_ += i_2165_;
			i_2160_ = i_2238_;
			i_2168_ += i_2169_;
		    }
		} else if (i_2155_ == 2) {
		    int i_2248_ = i_2156_ >>> 24;
		    int i_2249_ = 256 - i_2248_;
		    int i_2250_ = (i_2156_ & 0xff00ff) * i_2249_ & ~0xff00ff;
		    int i_2251_ = (i_2156_ & 0xff00) * i_2249_ & 0xff0000;
		    i_2156_ = (i_2250_ | i_2251_) >>> 8;
		    int i_2252_ = i_2160_;
		    for (int i_2253_ = -i_2154_; i_2253_ < 0; i_2253_++) {
			int i_2254_
			    = ((i_2161_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2255_ = -i_2153_; i_2255_ < 0; i_2255_++) {
			    if (!bool_2150_ || f < fs[i_2168_]) {
				if (bool) {
				    int i_2256_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2160_ >> 16) + i_2254_]);
				    int i_2257_ = i_2256_ >>> 24;
				    int i_2258_ = 256 - i_2257_;
				    i_2250_ = ((i_2256_ & 0xff00ff) * i_2248_
					       & ~0xff00ff);
				    i_2251_ = ((i_2256_ & 0xff00) * i_2248_
					       & 0xff0000);
				    i_2256_ = (((i_2250_ | i_2251_) >>> 8)
					       + i_2156_);
				    int i_2259_ = is[i_2168_];
				    is[i_2168_]
					= ((((i_2256_ & 0xff00ff) * i_2257_
					     + (i_2259_ & 0xff00ff) * i_2258_)
					    & ~0xff00ff)
					   + (((i_2256_ & 0xff00) * i_2257_
					       + (i_2259_ & 0xff00) * i_2258_)
					      & 0xff0000)) >> 8;
				}
				if (bool_2150_ && bool_2159_)
				    fs[i_2168_] = f;
			    }
			    i_2160_ += i_2164_;
			    i_2168_++;
			}
			i_2161_ += i_2165_;
			i_2160_ = i_2252_;
			i_2168_ += i_2169_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_2157_ == 2) {
		if (i_2155_ == 1) {
		    int i_2260_ = i_2160_;
		    for (int i_2261_ = -i_2154_; i_2261_ < 0; i_2261_++) {
			int i_2262_
			    = ((i_2161_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2263_ = -i_2153_; i_2263_ < 0; i_2263_++) {
			    if (!bool_2150_ || f < fs[i_2168_]) {
				int i_2264_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_2160_ >> 16) + i_2262_]);
				if (i_2264_ != 0) {
				    if (bool) {
					int i_2265_ = is[i_2168_];
					int i_2266_ = i_2264_ + i_2265_;
					int i_2267_ = ((i_2264_ & 0xff00ff)
						       + (i_2265_ & 0xff00ff));
					i_2265_ = ((i_2267_ & 0x1000100)
						   + (i_2266_ - i_2267_
						      & 0x10000));
					is[i_2168_]
					    = (i_2266_ - i_2265_
					       | i_2265_ - (i_2265_ >>> 8));
				    }
				    if (bool_2150_ && bool_2159_)
					fs[i_2168_] = f;
				}
			    }
			    i_2160_ += i_2164_;
			    i_2168_++;
			}
			i_2161_ += i_2165_;
			i_2160_ = i_2260_;
			i_2168_ += i_2169_;
		    }
		} else if (i_2155_ == 0) {
		    int i_2268_ = i_2160_;
		    int i_2269_ = (i_2156_ & 0xff0000) >> 16;
		    int i_2270_ = (i_2156_ & 0xff00) >> 8;
		    int i_2271_ = i_2156_ & 0xff;
		    for (int i_2272_ = -i_2154_; i_2272_ < 0; i_2272_++) {
			int i_2273_
			    = ((i_2161_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2274_ = -i_2153_; i_2274_ < 0; i_2274_++) {
			    if (!bool_2150_ || f < fs[i_2168_]) {
				int i_2275_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_2160_ >> 16) + i_2273_]);
				if (i_2275_ != 0) {
				    if (bool) {
					int i_2276_
					    = ((i_2275_ & 0xff0000) * i_2269_
					       & ~0xffffff);
					int i_2277_
					    = ((i_2275_ & 0xff00) * i_2270_
					       & 0xff0000);
					int i_2278_
					    = ((i_2275_ & 0xff) * i_2271_
					       & 0xff00);
					i_2275_ = (i_2276_ | i_2277_
						   | i_2278_) >>> 8;
					int i_2279_ = is[i_2168_];
					int i_2280_ = i_2275_ + i_2279_;
					int i_2281_ = ((i_2275_ & 0xff00ff)
						       + (i_2279_ & 0xff00ff));
					i_2279_ = ((i_2281_ & 0x1000100)
						   + (i_2280_ - i_2281_
						      & 0x10000));
					is[i_2168_]
					    = (i_2280_ - i_2279_
					       | i_2279_ - (i_2279_ >>> 8));
				    }
				    if (bool_2150_ && bool_2159_)
					fs[i_2168_] = f;
				}
			    }
			    i_2160_ += i_2164_;
			    i_2168_++;
			}
			i_2161_ += i_2165_;
			i_2160_ = i_2268_;
			i_2168_ += i_2169_;
		    }
		} else if (i_2155_ == 3) {
		    int i_2282_ = i_2160_;
		    for (int i_2283_ = -i_2154_; i_2283_ < 0; i_2283_++) {
			int i_2284_
			    = ((i_2161_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2285_ = -i_2153_; i_2285_ < 0; i_2285_++) {
			    if (!bool_2150_ || f < fs[i_2168_]) {
				if (bool) {
				    int i_2286_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2160_ >> 16) + i_2284_]);
				    int i_2287_ = i_2286_ + i_2156_;
				    int i_2288_ = ((i_2286_ & 0xff00ff)
						   + (i_2156_ & 0xff00ff));
				    int i_2289_
					= ((i_2288_ & 0x1000100)
					   + (i_2287_ - i_2288_ & 0x10000));
				    i_2286_ = (i_2287_ - i_2289_
					       | i_2289_ - (i_2289_ >>> 8));
				    i_2289_ = is[i_2168_];
				    i_2287_ = i_2286_ + i_2289_;
				    i_2288_
					= (i_2286_ & 0xff00ff) + (i_2289_
								  & 0xff00ff);
				    i_2289_
					= ((i_2288_ & 0x1000100)
					   + (i_2287_ - i_2288_ & 0x10000));
				    is[i_2168_]
					= (i_2287_ - i_2289_
					   | i_2289_ - (i_2289_ >>> 8));
				}
				if (bool_2150_ && bool_2159_)
				    fs[i_2168_] = f;
			    }
			    i_2160_ += i_2164_;
			    i_2168_++;
			}
			i_2161_ += i_2165_;
			i_2160_ = i_2282_;
			i_2168_ += i_2169_;
		    }
		} else if (i_2155_ == 2) {
		    int i_2290_ = i_2156_ >>> 24;
		    int i_2291_ = 256 - i_2290_;
		    int i_2292_ = (i_2156_ & 0xff00ff) * i_2291_ & ~0xff00ff;
		    int i_2293_ = (i_2156_ & 0xff00) * i_2291_ & 0xff0000;
		    i_2156_ = (i_2292_ | i_2293_) >>> 8;
		    int i_2294_ = i_2160_;
		    for (int i_2295_ = -i_2154_; i_2295_ < 0; i_2295_++) {
			int i_2296_
			    = ((i_2161_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2297_ = -i_2153_; i_2297_ < 0; i_2297_++) {
			    if (!bool_2150_ || f < fs[i_2168_]) {
				int i_2298_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_2160_ >> 16) + i_2296_]);
				if (i_2298_ != 0) {
				    if (bool) {
					i_2292_
					    = ((i_2298_ & 0xff00ff) * i_2290_
					       & ~0xff00ff);
					i_2293_ = ((i_2298_ & 0xff00) * i_2290_
						   & 0xff0000);
					i_2298_ = (((i_2292_ | i_2293_) >>> 8)
						   + i_2156_);
					int i_2299_ = is[i_2168_];
					int i_2300_ = i_2298_ + i_2299_;
					int i_2301_ = ((i_2298_ & 0xff00ff)
						       + (i_2299_ & 0xff00ff));
					i_2299_ = ((i_2301_ & 0x1000100)
						   + (i_2300_ - i_2301_
						      & 0x10000));
					is[i_2168_]
					    = (i_2300_ - i_2299_
					       | i_2299_ - (i_2299_ >>> 8));
				    }
				    if (bool_2150_ && bool_2159_)
					fs[i_2168_] = f;
				}
			    }
			    i_2160_ += i_2164_;
			    i_2168_++;
			}
			i_2161_ += i_2165_;
			i_2160_ = i_2294_;
			i_2168_ += i_2169_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method16226(boolean bool, boolean bool_2302_, boolean bool_2303_,
		     int i, int i_2304_, float f, int i_2305_, int i_2306_,
		     int i_2307_, int i_2308_, int i_2309_, int i_2310_,
		     boolean bool_2311_) {
	if (i_2305_ > 0 && i_2306_ > 0 && (bool || bool_2302_)) {
	    int i_2312_ = 0;
	    int i_2313_ = 0;
	    int i_2314_ = (((Class168_Sub2_Sub2) this).anInt9907
			   + ((Class168_Sub2_Sub2) this).anInt9920
			   + ((Class168_Sub2_Sub2) this).anInt9909);
	    int i_2315_ = (((Class168_Sub2_Sub2) this).anInt9905
			   + ((Class168_Sub2_Sub2) this).anInt9916
			   + ((Class168_Sub2_Sub2) this).anInt9910);
	    int i_2316_ = (i_2314_ << 16) / i_2305_;
	    int i_2317_ = (i_2315_ << 16) / i_2306_;
	    if (((Class168_Sub2_Sub2) this).anInt9907 > 0) {
		int i_2318_ = (((((Class168_Sub2_Sub2) this).anInt9907 << 16)
				+ i_2316_ - 1)
			       / i_2316_);
		i += i_2318_;
		i_2312_ += (i_2318_ * i_2316_
			    - (((Class168_Sub2_Sub2) this).anInt9907 << 16));
	    }
	    if (((Class168_Sub2_Sub2) this).anInt9905 > 0) {
		int i_2319_ = (((((Class168_Sub2_Sub2) this).anInt9905 << 16)
				+ i_2317_ - 1)
			       / i_2317_);
		i_2304_ += i_2319_;
		i_2313_ += (i_2319_ * i_2317_
			    - (((Class168_Sub2_Sub2) this).anInt9905 << 16));
	    }
	    if (((Class168_Sub2_Sub2) this).anInt9920 < i_2314_)
		i_2305_ = ((((Class168_Sub2_Sub2) this).anInt9920 << 16)
			   - i_2312_ + i_2316_ - 1) / i_2316_;
	    if (((Class168_Sub2_Sub2) this).anInt9916 < i_2315_)
		i_2306_ = ((((Class168_Sub2_Sub2) this).anInt9916 << 16)
			   - i_2313_ + i_2317_ - 1) / i_2317_;
	    int i_2320_
		= i + i_2304_ * ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						    .aClass103_Sub2_9904))
				  .anInt9260)
				 * -1826993761);
	    int i_2321_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					      .aClass103_Sub2_9904)).anInt9260
			    * -1826993761)
			   - i_2305_);
	    if (i_2304_ + i_2306_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_2306_ -= (i_2304_ + i_2306_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i_2304_ < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_2322_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_2304_);
		i_2306_ -= i_2322_;
		i_2320_ += i_2322_ * (((Class103_Sub2)
				       (((Class168_Sub2_Sub2) this)
					.aClass103_Sub2_9904)).anInt9260
				      * -1826993761);
		i_2313_ += i_2317_ * i_2322_;
	    }
	    if (i + i_2305_ > (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_2323_ = (i + i_2305_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_2305_ -= i_2323_;
		i_2321_ += i_2323_;
	    }
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_2324_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_2305_ -= i_2324_;
		i_2320_ += i_2324_;
		i_2312_ += i_2316_ * i_2324_;
		i_2321_ += i_2324_;
	    }
	    float[] fs = (((Class103_Sub2)
			   ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			  .aFloatArray9248);
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (i_2309_ == 0) {
		if (i_2307_ == 1) {
		    int i_2325_ = i_2312_;
		    for (int i_2326_ = -i_2306_; i_2326_ < 0; i_2326_++) {
			int i_2327_
			    = ((i_2313_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2328_ = -i_2305_; i_2328_ < 0; i_2328_++) {
			    if (!bool_2302_ || f < fs[i_2320_]) {
				if (bool)
				    is[i_2320_]
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2312_ >> 16) + i_2327_]);
				if (bool_2302_ && bool_2311_)
				    fs[i_2320_] = f;
			    }
			    i_2312_ += i_2316_;
			    i_2320_++;
			}
			i_2313_ += i_2317_;
			i_2312_ = i_2325_;
			i_2320_ += i_2321_;
		    }
		} else if (i_2307_ == 0) {
		    int i_2329_ = (i_2308_ & 0xff0000) >> 16;
		    int i_2330_ = (i_2308_ & 0xff00) >> 8;
		    int i_2331_ = i_2308_ & 0xff;
		    int i_2332_ = i_2312_;
		    for (int i_2333_ = -i_2306_; i_2333_ < 0; i_2333_++) {
			int i_2334_
			    = ((i_2313_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2335_ = -i_2305_; i_2335_ < 0; i_2335_++) {
			    if (!bool_2302_ || f < fs[i_2320_]) {
				if (bool) {
				    int i_2336_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2312_ >> 16) + i_2334_]);
				    int i_2337_
					= ((i_2336_ & 0xff0000) * i_2329_
					   & ~0xffffff);
				    int i_2338_ = ((i_2336_ & 0xff00) * i_2330_
						   & 0xff0000);
				    int i_2339_
					= (i_2336_ & 0xff) * i_2331_ & 0xff00;
				    is[i_2320_]
					= (i_2337_ | i_2338_ | i_2339_) >>> 8;
				}
				if (bool_2302_ && bool_2311_)
				    fs[i_2320_] = f;
			    }
			    i_2312_ += i_2316_;
			    i_2320_++;
			}
			i_2313_ += i_2317_;
			i_2312_ = i_2332_;
			i_2320_ += i_2321_;
		    }
		} else if (i_2307_ == 3) {
		    int i_2340_ = i_2312_;
		    for (int i_2341_ = -i_2306_; i_2341_ < 0; i_2341_++) {
			int i_2342_
			    = ((i_2313_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2343_ = -i_2305_; i_2343_ < 0; i_2343_++) {
			    if (!bool_2302_ || f < fs[i_2320_]) {
				if (bool) {
				    int i_2344_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2312_ >> 16) + i_2342_]);
				    int i_2345_ = i_2344_ + i_2308_;
				    int i_2346_ = ((i_2344_ & 0xff00ff)
						   + (i_2308_ & 0xff00ff));
				    int i_2347_
					= ((i_2346_ & 0x1000100)
					   + (i_2345_ - i_2346_ & 0x10000));
				    is[i_2320_]
					= (i_2345_ - i_2347_
					   | i_2347_ - (i_2347_ >>> 8));
				}
				if (bool_2302_ && bool_2311_)
				    fs[i_2320_] = f;
			    }
			    i_2312_ += i_2316_;
			    i_2320_++;
			}
			i_2313_ += i_2317_;
			i_2312_ = i_2340_;
			i_2320_ += i_2321_;
		    }
		} else if (i_2307_ == 2) {
		    int i_2348_ = i_2308_ >>> 24;
		    int i_2349_ = 256 - i_2348_;
		    int i_2350_ = (i_2308_ & 0xff00ff) * i_2349_ & ~0xff00ff;
		    int i_2351_ = (i_2308_ & 0xff00) * i_2349_ & 0xff0000;
		    i_2308_ = (i_2350_ | i_2351_) >>> 8;
		    int i_2352_ = i_2312_;
		    for (int i_2353_ = -i_2306_; i_2353_ < 0; i_2353_++) {
			int i_2354_
			    = ((i_2313_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2355_ = -i_2305_; i_2355_ < 0; i_2355_++) {
			    if (!bool_2302_ || f < fs[i_2320_]) {
				if (bool) {
				    int i_2356_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2312_ >> 16) + i_2354_]);
				    i_2350_ = ((i_2356_ & 0xff00ff) * i_2348_
					       & ~0xff00ff);
				    i_2351_ = ((i_2356_ & 0xff00) * i_2348_
					       & 0xff0000);
				    is[i_2320_] = (((i_2350_ | i_2351_) >>> 8)
						   + i_2308_);
				}
				if (bool_2302_ && bool_2311_)
				    fs[i_2320_] = f;
			    }
			    i_2312_ += i_2316_;
			    i_2320_++;
			}
			i_2313_ += i_2317_;
			i_2312_ = i_2352_;
			i_2320_ += i_2321_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_2309_ == 1) {
		if (i_2307_ == 1) {
		    int i_2357_ = i_2312_;
		    for (int i_2358_ = -i_2306_; i_2358_ < 0; i_2358_++) {
			int i_2359_
			    = ((i_2313_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2360_ = -i_2305_; i_2360_ < 0; i_2360_++) {
			    if (!bool_2302_ || f < fs[i_2320_]) {
				if (bool) {
				    int i_2361_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2312_ >> 16) + i_2359_]);
				    int i_2362_ = i_2361_ >>> 24;
				    int i_2363_ = 256 - i_2362_;
				    int i_2364_ = is[i_2320_];
				    is[i_2320_]
					= (((((i_2361_ & 0xff00ff) * i_2362_
					      + (i_2364_ & 0xff00ff) * i_2363_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_2361_ & ~0xff00ff) >>> 8)
						* i_2362_)
					       + (((i_2364_ & ~0xff00ff) >>> 8)
						  * i_2363_))
					      & ~0xff00ff));
				}
				if (bool_2302_ && bool_2311_)
				    fs[i_2320_] = f;
			    }
			    i_2312_ += i_2316_;
			    i_2320_++;
			}
			i_2313_ += i_2317_;
			i_2312_ = i_2357_;
			i_2320_ += i_2321_;
		    }
		} else if (i_2307_ == 0) {
		    int i_2365_ = i_2312_;
		    if ((i_2308_ & 0xffffff) == 16777215) {
			for (int i_2366_ = -i_2306_; i_2366_ < 0; i_2366_++) {
			    int i_2367_
				= ((i_2313_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_2368_ = -i_2305_; i_2368_ < 0;
				 i_2368_++) {
				if (!bool_2302_ || f < fs[i_2320_]) {
				    if (bool) {
					int i_2369_
					    = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_2312_ >> 16) + i_2367_]);
					int i_2370_
					    = ((i_2369_ >>> 24) * (i_2308_
								   >>> 24)
					       >> 8);
					int i_2371_ = 256 - i_2370_;
					int i_2372_ = is[i_2320_];
					is[i_2320_]
					    = ((((i_2369_ & 0xff00ff) * i_2370_
						 + ((i_2372_ & 0xff00ff)
						    * i_2371_))
						& ~0xff00ff)
					       + (((i_2369_ & 0xff00) * i_2370_
						   + ((i_2372_ & 0xff00)
						      * i_2371_))
						  & 0xff0000)) >> 8;
				    }
				    if (bool_2302_ && bool_2311_)
					fs[i_2320_] = f;
				}
				i_2312_ += i_2316_;
				i_2320_++;
			    }
			    i_2313_ += i_2317_;
			    i_2312_ = i_2365_;
			    i_2320_ += i_2321_;
			}
		    } else {
			int i_2373_ = (i_2308_ & 0xff0000) >> 16;
			int i_2374_ = (i_2308_ & 0xff00) >> 8;
			int i_2375_ = i_2308_ & 0xff;
			for (int i_2376_ = -i_2306_; i_2376_ < 0; i_2376_++) {
			    int i_2377_
				= ((i_2313_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_2378_ = -i_2305_; i_2378_ < 0;
				 i_2378_++) {
				if (!bool_2302_ || f < fs[i_2320_]) {
				    int i_2379_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2312_ >> 16) + i_2377_]);
				    int i_2380_
					= ((i_2379_ >>> 24) * (i_2308_ >>> 24)
					   >> 8);
				    int i_2381_ = 256 - i_2380_;
				    if (i_2380_ != 255) {
					if (bool) {
					    int i_2382_
						= (((i_2379_ & 0xff0000)
						    * i_2373_)
						   & ~0xffffff);
					    int i_2383_
						= ((i_2379_ & 0xff00) * i_2374_
						   & 0xff0000);
					    int i_2384_
						= ((i_2379_ & 0xff) * i_2375_
						   & 0xff00);
					    i_2379_ = (i_2382_ | i_2383_
						       | i_2384_) >>> 8;
					    int i_2385_ = is[i_2320_];
					    is[i_2320_]
						= (((((i_2379_ & 0xff00ff)
						      * i_2380_)
						     + ((i_2385_ & 0xff00ff)
							* i_2381_))
						    & ~0xff00ff)
						   + ((((i_2379_ & 0xff00)
							* i_2380_)
						       + ((i_2385_ & 0xff00)
							  * i_2381_))
						      & 0xff0000)) >> 8;
					    if (bool_2303_) {
						int i_2386_ = ((i_2385_ >>> 24)
							       + i_2380_);
						if (i_2386_ > 255)
						    i_2386_ = 255;
						is[i_2320_] |= i_2386_ << 24;
					    }
					}
					if (bool_2302_ && bool_2311_)
					    fs[i_2320_] = f;
				    } else {
					if (bool) {
					    int i_2387_
						= (((i_2379_ & 0xff0000)
						    * i_2373_)
						   & ~0xffffff);
					    int i_2388_
						= ((i_2379_ & 0xff00) * i_2374_
						   & 0xff0000);
					    int i_2389_
						= ((i_2379_ & 0xff) * i_2375_
						   & 0xff00);
					    is[i_2320_] = (i_2387_ | i_2388_
							   | i_2389_) >>> 8;
					}
					if (bool_2302_ && bool_2311_)
					    fs[i_2320_] = f;
				    }
				}
				i_2312_ += i_2316_;
				i_2320_++;
			    }
			    i_2313_ += i_2317_;
			    i_2312_ = i_2365_;
			    i_2320_ += i_2321_;
			}
		    }
		} else if (i_2307_ == 3) {
		    int i_2390_ = i_2312_;
		    for (int i_2391_ = -i_2306_; i_2391_ < 0; i_2391_++) {
			int i_2392_
			    = ((i_2313_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2393_ = -i_2305_; i_2393_ < 0; i_2393_++) {
			    if (!bool_2302_ || f < fs[i_2320_]) {
				if (bool) {
				    int i_2394_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2312_ >> 16) + i_2392_]);
				    int i_2395_ = i_2394_ + i_2308_;
				    int i_2396_ = ((i_2394_ & 0xff00ff)
						   + (i_2308_ & 0xff00ff));
				    int i_2397_
					= ((i_2396_ & 0x1000100)
					   + (i_2395_ - i_2396_ & 0x10000));
				    i_2397_ = (i_2395_ - i_2397_
					       | i_2397_ - (i_2397_ >>> 8));
				    int i_2398_
					= ((i_2397_ >>> 24) * (i_2308_ >>> 24)
					   >> 8);
				    int i_2399_ = 256 - i_2398_;
				    if (i_2398_ != 255) {
					i_2394_ = i_2397_;
					i_2397_ = is[i_2320_];
					i_2397_
					    = ((((i_2394_ & 0xff00ff) * i_2398_
						 + ((i_2397_ & 0xff00ff)
						    * i_2399_))
						& ~0xff00ff)
					       + (((i_2394_ & 0xff00) * i_2398_
						   + ((i_2397_ & 0xff00)
						      * i_2399_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_2320_] = i_2397_;
				}
				if (bool_2302_ && bool_2311_)
				    fs[i_2320_] = f;
			    }
			    i_2312_ += i_2316_;
			    i_2320_++;
			}
			i_2313_ += i_2317_;
			i_2312_ = i_2390_;
			i_2320_ += i_2321_;
		    }
		} else if (i_2307_ == 2) {
		    int i_2400_ = i_2308_ >>> 24;
		    int i_2401_ = 256 - i_2400_;
		    int i_2402_ = (i_2308_ & 0xff00ff) * i_2401_ & ~0xff00ff;
		    int i_2403_ = (i_2308_ & 0xff00) * i_2401_ & 0xff0000;
		    i_2308_ = (i_2402_ | i_2403_) >>> 8;
		    int i_2404_ = i_2312_;
		    for (int i_2405_ = -i_2306_; i_2405_ < 0; i_2405_++) {
			int i_2406_
			    = ((i_2313_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2407_ = -i_2305_; i_2407_ < 0; i_2407_++) {
			    if (!bool_2302_ || f < fs[i_2320_]) {
				if (bool) {
				    int i_2408_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2312_ >> 16) + i_2406_]);
				    int i_2409_ = i_2408_ >>> 24;
				    int i_2410_ = 256 - i_2409_;
				    i_2402_ = ((i_2408_ & 0xff00ff) * i_2400_
					       & ~0xff00ff);
				    i_2403_ = ((i_2408_ & 0xff00) * i_2400_
					       & 0xff0000);
				    i_2408_ = (((i_2402_ | i_2403_) >>> 8)
					       + i_2308_);
				    int i_2411_ = is[i_2320_];
				    is[i_2320_]
					= ((((i_2408_ & 0xff00ff) * i_2409_
					     + (i_2411_ & 0xff00ff) * i_2410_)
					    & ~0xff00ff)
					   + (((i_2408_ & 0xff00) * i_2409_
					       + (i_2411_ & 0xff00) * i_2410_)
					      & 0xff0000)) >> 8;
				}
				if (bool_2302_ && bool_2311_)
				    fs[i_2320_] = f;
			    }
			    i_2312_ += i_2316_;
			    i_2320_++;
			}
			i_2313_ += i_2317_;
			i_2312_ = i_2404_;
			i_2320_ += i_2321_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_2309_ == 2) {
		if (i_2307_ == 1) {
		    int i_2412_ = i_2312_;
		    for (int i_2413_ = -i_2306_; i_2413_ < 0; i_2413_++) {
			int i_2414_
			    = ((i_2313_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2415_ = -i_2305_; i_2415_ < 0; i_2415_++) {
			    if (!bool_2302_ || f < fs[i_2320_]) {
				int i_2416_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_2312_ >> 16) + i_2414_]);
				if (i_2416_ != 0) {
				    if (bool) {
					int i_2417_ = is[i_2320_];
					int i_2418_ = i_2416_ + i_2417_;
					int i_2419_ = ((i_2416_ & 0xff00ff)
						       + (i_2417_ & 0xff00ff));
					i_2417_ = ((i_2419_ & 0x1000100)
						   + (i_2418_ - i_2419_
						      & 0x10000));
					is[i_2320_]
					    = (i_2418_ - i_2417_
					       | i_2417_ - (i_2417_ >>> 8));
				    }
				    if (bool_2302_ && bool_2311_)
					fs[i_2320_] = f;
				}
			    }
			    i_2312_ += i_2316_;
			    i_2320_++;
			}
			i_2313_ += i_2317_;
			i_2312_ = i_2412_;
			i_2320_ += i_2321_;
		    }
		} else if (i_2307_ == 0) {
		    int i_2420_ = i_2312_;
		    int i_2421_ = (i_2308_ & 0xff0000) >> 16;
		    int i_2422_ = (i_2308_ & 0xff00) >> 8;
		    int i_2423_ = i_2308_ & 0xff;
		    for (int i_2424_ = -i_2306_; i_2424_ < 0; i_2424_++) {
			int i_2425_
			    = ((i_2313_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2426_ = -i_2305_; i_2426_ < 0; i_2426_++) {
			    if (!bool_2302_ || f < fs[i_2320_]) {
				int i_2427_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_2312_ >> 16) + i_2425_]);
				if (i_2427_ != 0) {
				    if (bool) {
					int i_2428_
					    = ((i_2427_ & 0xff0000) * i_2421_
					       & ~0xffffff);
					int i_2429_
					    = ((i_2427_ & 0xff00) * i_2422_
					       & 0xff0000);
					int i_2430_
					    = ((i_2427_ & 0xff) * i_2423_
					       & 0xff00);
					i_2427_ = (i_2428_ | i_2429_
						   | i_2430_) >>> 8;
					int i_2431_ = is[i_2320_];
					int i_2432_ = i_2427_ + i_2431_;
					int i_2433_ = ((i_2427_ & 0xff00ff)
						       + (i_2431_ & 0xff00ff));
					i_2431_ = ((i_2433_ & 0x1000100)
						   + (i_2432_ - i_2433_
						      & 0x10000));
					is[i_2320_]
					    = (i_2432_ - i_2431_
					       | i_2431_ - (i_2431_ >>> 8));
				    }
				    if (bool_2302_ && bool_2311_)
					fs[i_2320_] = f;
				}
			    }
			    i_2312_ += i_2316_;
			    i_2320_++;
			}
			i_2313_ += i_2317_;
			i_2312_ = i_2420_;
			i_2320_ += i_2321_;
		    }
		} else if (i_2307_ == 3) {
		    int i_2434_ = i_2312_;
		    for (int i_2435_ = -i_2306_; i_2435_ < 0; i_2435_++) {
			int i_2436_
			    = ((i_2313_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2437_ = -i_2305_; i_2437_ < 0; i_2437_++) {
			    if (!bool_2302_ || f < fs[i_2320_]) {
				if (bool) {
				    int i_2438_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2312_ >> 16) + i_2436_]);
				    int i_2439_ = i_2438_ + i_2308_;
				    int i_2440_ = ((i_2438_ & 0xff00ff)
						   + (i_2308_ & 0xff00ff));
				    int i_2441_
					= ((i_2440_ & 0x1000100)
					   + (i_2439_ - i_2440_ & 0x10000));
				    i_2438_ = (i_2439_ - i_2441_
					       | i_2441_ - (i_2441_ >>> 8));
				    i_2441_ = is[i_2320_];
				    i_2439_ = i_2438_ + i_2441_;
				    i_2440_
					= (i_2438_ & 0xff00ff) + (i_2441_
								  & 0xff00ff);
				    i_2441_
					= ((i_2440_ & 0x1000100)
					   + (i_2439_ - i_2440_ & 0x10000));
				    is[i_2320_]
					= (i_2439_ - i_2441_
					   | i_2441_ - (i_2441_ >>> 8));
				}
				if (bool_2302_ && bool_2311_)
				    fs[i_2320_] = f;
			    }
			    i_2312_ += i_2316_;
			    i_2320_++;
			}
			i_2313_ += i_2317_;
			i_2312_ = i_2434_;
			i_2320_ += i_2321_;
		    }
		} else if (i_2307_ == 2) {
		    int i_2442_ = i_2308_ >>> 24;
		    int i_2443_ = 256 - i_2442_;
		    int i_2444_ = (i_2308_ & 0xff00ff) * i_2443_ & ~0xff00ff;
		    int i_2445_ = (i_2308_ & 0xff00) * i_2443_ & 0xff0000;
		    i_2308_ = (i_2444_ | i_2445_) >>> 8;
		    int i_2446_ = i_2312_;
		    for (int i_2447_ = -i_2306_; i_2447_ < 0; i_2447_++) {
			int i_2448_
			    = ((i_2313_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2449_ = -i_2305_; i_2449_ < 0; i_2449_++) {
			    if (!bool_2302_ || f < fs[i_2320_]) {
				int i_2450_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_2312_ >> 16) + i_2448_]);
				if (i_2450_ != 0) {
				    if (bool) {
					i_2444_
					    = ((i_2450_ & 0xff00ff) * i_2442_
					       & ~0xff00ff);
					i_2445_ = ((i_2450_ & 0xff00) * i_2442_
						   & 0xff0000);
					i_2450_ = (((i_2444_ | i_2445_) >>> 8)
						   + i_2308_);
					int i_2451_ = is[i_2320_];
					int i_2452_ = i_2450_ + i_2451_;
					int i_2453_ = ((i_2450_ & 0xff00ff)
						       + (i_2451_ & 0xff00ff));
					i_2451_ = ((i_2453_ & 0x1000100)
						   + (i_2452_ - i_2453_
						      & 0x10000));
					is[i_2320_]
					    = (i_2452_ - i_2451_
					       | i_2451_ - (i_2451_ >>> 8));
				    }
				    if (bool_2302_ && bool_2311_)
					fs[i_2320_] = f;
				}
			    }
			    i_2312_ += i_2316_;
			    i_2320_++;
			}
			i_2313_ += i_2317_;
			i_2312_ = i_2446_;
			i_2320_ += i_2321_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method16223(int i, int i_2454_) {
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_2455_ = anInt9919;
		    while (i_2455_ < 0) {
			int i_2456_ = anInt9925;
			int i_2457_ = anInt9927;
			int i_2458_ = anInt9928;
			int i_2459_ = anInt9906;
			if (i_2457_ >= 0 && i_2458_ >= 0
			    && i_2457_ - (((Class168_Sub2_Sub2) this).anInt9920
					  << 12) < 0
			    && i_2458_ - (((Class168_Sub2_Sub2) this).anInt9916
					  << 12) < 0) {
			    for (/**/; i_2459_ < 0; i_2459_++)
				method17538(((i_2458_ >> 12)
					     * (((Class168_Sub2_Sub2) this)
						.anInt9920)) + (i_2457_ >> 12),
					    i_2456_++, is, i, i_2454_);
			}
			i_2455_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_2460_ = anInt9919;
		    while (i_2460_ < 0) {
			int i_2461_ = anInt9925;
			int i_2462_ = anInt9927;
			int i_2463_ = anInt9928 + anInt9930;
			int i_2464_ = anInt9906;
			if (i_2462_ >= 0
			    && i_2462_ - (((Class168_Sub2_Sub2) this).anInt9920
					  << 12) < 0) {
			    int i_2465_;
			    if ((i_2465_
				 = (i_2463_
				    - (((Class168_Sub2_Sub2) this).anInt9916
				       << 12)))
				>= 0) {
				i_2465_ = (anInt9922 - i_2465_) / anInt9922;
				i_2464_ += i_2465_;
				i_2463_ += anInt9922 * i_2465_;
				i_2461_ += i_2465_;
			    }
			    if ((i_2465_ = (i_2463_ - anInt9922) / anInt9922)
				> i_2464_)
				i_2464_ = i_2465_;
			    for (/**/; i_2464_ < 0; i_2464_++) {
				method17538(((i_2463_ >> 12)
					     * (((Class168_Sub2_Sub2) this)
						.anInt9920)) + (i_2462_ >> 12),
					    i_2461_++, is, i, i_2454_);
				i_2463_ += anInt9922;
			    }
			}
			i_2460_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_2466_ = anInt9919;
		    while (i_2466_ < 0) {
			int i_2467_ = anInt9925;
			int i_2468_ = anInt9927;
			int i_2469_ = anInt9928 + anInt9930;
			int i_2470_ = anInt9906;
			if (i_2468_ >= 0
			    && i_2468_ - (((Class168_Sub2_Sub2) this).anInt9920
					  << 12) < 0) {
			    if (i_2469_ < 0) {
				int i_2471_
				    = (anInt9922 - 1 - i_2469_) / anInt9922;
				i_2470_ += i_2471_;
				i_2469_ += anInt9922 * i_2471_;
				i_2467_ += i_2471_;
			    }
			    int i_2472_;
			    if ((i_2472_
				 = (1 + i_2469_
				    - (((Class168_Sub2_Sub2) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_2470_)
				i_2470_ = i_2472_;
			    for (/**/; i_2470_ < 0; i_2470_++) {
				method17538(((i_2469_ >> 12)
					     * (((Class168_Sub2_Sub2) this)
						.anInt9920)) + (i_2468_ >> 12),
					    i_2467_++, is, i, i_2454_);
				i_2469_ += anInt9922;
			    }
			}
			i_2466_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_2473_ = anInt9919;
		    while (i_2473_ < 0) {
			int i_2474_ = anInt9925;
			int i_2475_ = anInt9927 + anInt9929;
			int i_2476_ = anInt9928;
			int i_2477_ = anInt9906;
			if (i_2476_ >= 0
			    && i_2476_ - (((Class168_Sub2_Sub2) this).anInt9916
					  << 12) < 0) {
			    int i_2478_;
			    if ((i_2478_
				 = (i_2475_
				    - (((Class168_Sub2_Sub2) this).anInt9920
				       << 12)))
				>= 0) {
				i_2478_ = (anInt9921 - i_2478_) / anInt9921;
				i_2477_ += i_2478_;
				i_2475_ += anInt9921 * i_2478_;
				i_2474_ += i_2478_;
			    }
			    if ((i_2478_ = (i_2475_ - anInt9921) / anInt9921)
				> i_2477_)
				i_2477_ = i_2478_;
			    for (/**/; i_2477_ < 0; i_2477_++) {
				method17538(((i_2476_ >> 12)
					     * (((Class168_Sub2_Sub2) this)
						.anInt9920)) + (i_2475_ >> 12),
					    i_2474_++, is, i, i_2454_);
				i_2475_ += anInt9921;
			    }
			}
			i_2473_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_2479_ = anInt9919;
		    while (i_2479_ < 0) {
			int i_2480_ = anInt9925;
			int i_2481_ = anInt9927 + anInt9929;
			int i_2482_ = anInt9928 + anInt9930;
			int i_2483_ = anInt9906;
			int i_2484_;
			if ((i_2484_
			     = i_2481_ - (((Class168_Sub2_Sub2) this).anInt9920
					  << 12))
			    >= 0) {
			    i_2484_ = (anInt9921 - i_2484_) / anInt9921;
			    i_2483_ += i_2484_;
			    i_2481_ += anInt9921 * i_2484_;
			    i_2482_ += anInt9922 * i_2484_;
			    i_2480_ += i_2484_;
			}
			if ((i_2484_ = (i_2481_ - anInt9921) / anInt9921)
			    > i_2483_)
			    i_2483_ = i_2484_;
			if ((i_2484_
			     = i_2482_ - (((Class168_Sub2_Sub2) this).anInt9916
					  << 12))
			    >= 0) {
			    i_2484_ = (anInt9922 - i_2484_) / anInt9922;
			    i_2483_ += i_2484_;
			    i_2481_ += anInt9921 * i_2484_;
			    i_2482_ += anInt9922 * i_2484_;
			    i_2480_ += i_2484_;
			}
			if ((i_2484_ = (i_2482_ - anInt9922) / anInt9922)
			    > i_2483_)
			    i_2483_ = i_2484_;
			for (/**/; i_2483_ < 0; i_2483_++) {
			    method17538(((i_2482_ >> 12)
					 * (((Class168_Sub2_Sub2) this)
					    .anInt9920)) + (i_2481_ >> 12),
					i_2480_++, is, i, i_2454_);
			    i_2481_ += anInt9921;
			    i_2482_ += anInt9922;
			}
			i_2479_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_2485_ = anInt9919;
		    while (i_2485_ < 0) {
			int i_2486_ = anInt9925;
			int i_2487_ = anInt9927 + anInt9929;
			int i_2488_ = anInt9928 + anInt9930;
			int i_2489_ = anInt9906;
			int i_2490_;
			if ((i_2490_
			     = i_2487_ - (((Class168_Sub2_Sub2) this).anInt9920
					  << 12))
			    >= 0) {
			    i_2490_ = (anInt9921 - i_2490_) / anInt9921;
			    i_2489_ += i_2490_;
			    i_2487_ += anInt9921 * i_2490_;
			    i_2488_ += anInt9922 * i_2490_;
			    i_2486_ += i_2490_;
			}
			if ((i_2490_ = (i_2487_ - anInt9921) / anInt9921)
			    > i_2489_)
			    i_2489_ = i_2490_;
			if (i_2488_ < 0) {
			    i_2490_ = (anInt9922 - 1 - i_2488_) / anInt9922;
			    i_2489_ += i_2490_;
			    i_2487_ += anInt9921 * i_2490_;
			    i_2488_ += anInt9922 * i_2490_;
			    i_2486_ += i_2490_;
			}
			if ((i_2490_
			     = (1 + i_2488_
				- (((Class168_Sub2_Sub2) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_2489_)
			    i_2489_ = i_2490_;
			for (/**/; i_2489_ < 0; i_2489_++) {
			    method17538(((i_2488_ >> 12)
					 * (((Class168_Sub2_Sub2) this)
					    .anInt9920)) + (i_2487_ >> 12),
					i_2486_++, is, i, i_2454_);
			    i_2487_ += anInt9921;
			    i_2488_ += anInt9922;
			}
			i_2485_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_2491_ = anInt9919;
		while (i_2491_ < 0) {
		    int i_2492_ = anInt9925;
		    int i_2493_ = anInt9927 + anInt9929;
		    int i_2494_ = anInt9928;
		    int i_2495_ = anInt9906;
		    if (i_2494_ >= 0
			&& i_2494_ - (((Class168_Sub2_Sub2) this).anInt9916
				      << 12) < 0) {
			if (i_2493_ < 0) {
			    int i_2496_
				= (anInt9921 - 1 - i_2493_) / anInt9921;
			    i_2495_ += i_2496_;
			    i_2493_ += anInt9921 * i_2496_;
			    i_2492_ += i_2496_;
			}
			int i_2497_;
			if ((i_2497_
			     = (1 + i_2493_
				- (((Class168_Sub2_Sub2) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_2495_)
			    i_2495_ = i_2497_;
			for (/**/; i_2495_ < 0; i_2495_++) {
			    method17538(((i_2494_ >> 12)
					 * (((Class168_Sub2_Sub2) this)
					    .anInt9920)) + (i_2493_ >> 12),
					i_2492_++, is, i, i_2454_);
			    i_2493_ += anInt9921;
			}
		    }
		    i_2491_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		for (int i_2498_ = anInt9919; i_2498_ < 0; i_2498_++) {
		    int i_2499_ = anInt9925;
		    int i_2500_ = anInt9927 + anInt9929;
		    int i_2501_ = anInt9928 + anInt9930;
		    int i_2502_ = anInt9906;
		    if (i_2500_ < 0) {
			int i_2503_ = (anInt9921 - 1 - i_2500_) / anInt9921;
			i_2502_ += i_2503_;
			i_2500_ += anInt9921 * i_2503_;
			i_2501_ += anInt9922 * i_2503_;
			i_2499_ += i_2503_;
		    }
		    int i_2504_;
		    if ((i_2504_
			 = (1 + i_2500_
			    - (((Class168_Sub2_Sub2) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_2502_)
			i_2502_ = i_2504_;
		    if ((i_2504_
			 = i_2501_ - (((Class168_Sub2_Sub2) this).anInt9916
				      << 12))
			>= 0) {
			i_2504_ = (anInt9922 - i_2504_) / anInt9922;
			i_2502_ += i_2504_;
			i_2500_ += anInt9921 * i_2504_;
			i_2501_ += anInt9922 * i_2504_;
			i_2499_ += i_2504_;
		    }
		    if ((i_2504_ = (i_2501_ - anInt9922) / anInt9922)
			> i_2502_)
			i_2502_ = i_2504_;
		    for (/**/; i_2502_ < 0; i_2502_++) {
			method17538((((i_2501_ >> 12)
				      * ((Class168_Sub2_Sub2) this).anInt9920)
				     + (i_2500_ >> 12)),
				    i_2499_++, is, i, i_2454_);
			i_2500_ += anInt9921;
			i_2501_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		for (int i_2505_ = anInt9919; i_2505_ < 0; i_2505_++) {
		    int i_2506_ = anInt9925;
		    int i_2507_ = anInt9927 + anInt9929;
		    int i_2508_ = anInt9928 + anInt9930;
		    int i_2509_ = anInt9906;
		    if (i_2507_ < 0) {
			int i_2510_ = (anInt9921 - 1 - i_2507_) / anInt9921;
			i_2509_ += i_2510_;
			i_2507_ += anInt9921 * i_2510_;
			i_2508_ += anInt9922 * i_2510_;
			i_2506_ += i_2510_;
		    }
		    int i_2511_;
		    if ((i_2511_
			 = (1 + i_2507_
			    - (((Class168_Sub2_Sub2) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_2509_)
			i_2509_ = i_2511_;
		    if (i_2508_ < 0) {
			i_2511_ = (anInt9922 - 1 - i_2508_) / anInt9922;
			i_2509_ += i_2511_;
			i_2507_ += anInt9921 * i_2511_;
			i_2508_ += anInt9922 * i_2511_;
			i_2506_ += i_2511_;
		    }
		    if ((i_2511_
			 = (1 + i_2508_
			    - (((Class168_Sub2_Sub2) this).anInt9916 << 12)
			    - anInt9922) / anInt9922)
			> i_2509_)
			i_2509_ = i_2511_;
		    for (/**/; i_2509_ < 0; i_2509_++) {
			method17538((((i_2508_ >> 12)
				      * ((Class168_Sub2_Sub2) this).anInt9920)
				     + (i_2507_ >> 12)),
				    i_2506_++, is, i, i_2454_);
			i_2507_ += anInt9921;
			i_2508_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    void method16224(boolean bool, boolean bool_2512_, boolean bool_2513_,
		     int i, int i_2514_, float f, int i_2515_, int i_2516_,
		     int i_2517_, int i_2518_, int i_2519_, int i_2520_,
		     boolean bool_2521_) {
	if (i_2515_ > 0 && i_2516_ > 0 && (bool || bool_2512_)) {
	    int i_2522_ = 0;
	    int i_2523_ = 0;
	    int i_2524_ = (((Class168_Sub2_Sub2) this).anInt9907
			   + ((Class168_Sub2_Sub2) this).anInt9920
			   + ((Class168_Sub2_Sub2) this).anInt9909);
	    int i_2525_ = (((Class168_Sub2_Sub2) this).anInt9905
			   + ((Class168_Sub2_Sub2) this).anInt9916
			   + ((Class168_Sub2_Sub2) this).anInt9910);
	    int i_2526_ = (i_2524_ << 16) / i_2515_;
	    int i_2527_ = (i_2525_ << 16) / i_2516_;
	    if (((Class168_Sub2_Sub2) this).anInt9907 > 0) {
		int i_2528_ = (((((Class168_Sub2_Sub2) this).anInt9907 << 16)
				+ i_2526_ - 1)
			       / i_2526_);
		i += i_2528_;
		i_2522_ += (i_2528_ * i_2526_
			    - (((Class168_Sub2_Sub2) this).anInt9907 << 16));
	    }
	    if (((Class168_Sub2_Sub2) this).anInt9905 > 0) {
		int i_2529_ = (((((Class168_Sub2_Sub2) this).anInt9905 << 16)
				+ i_2527_ - 1)
			       / i_2527_);
		i_2514_ += i_2529_;
		i_2523_ += (i_2529_ * i_2527_
			    - (((Class168_Sub2_Sub2) this).anInt9905 << 16));
	    }
	    if (((Class168_Sub2_Sub2) this).anInt9920 < i_2524_)
		i_2515_ = ((((Class168_Sub2_Sub2) this).anInt9920 << 16)
			   - i_2522_ + i_2526_ - 1) / i_2526_;
	    if (((Class168_Sub2_Sub2) this).anInt9916 < i_2525_)
		i_2516_ = ((((Class168_Sub2_Sub2) this).anInt9916 << 16)
			   - i_2523_ + i_2527_ - 1) / i_2527_;
	    int i_2530_
		= i + i_2514_ * ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						    .aClass103_Sub2_9904))
				  .anInt9260)
				 * -1826993761);
	    int i_2531_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					      .aClass103_Sub2_9904)).anInt9260
			    * -1826993761)
			   - i_2515_);
	    if (i_2514_ + i_2516_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_2516_ -= (i_2514_ + i_2516_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i_2514_ < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_2532_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_2514_);
		i_2516_ -= i_2532_;
		i_2530_ += i_2532_ * (((Class103_Sub2)
				       (((Class168_Sub2_Sub2) this)
					.aClass103_Sub2_9904)).anInt9260
				      * -1826993761);
		i_2523_ += i_2527_ * i_2532_;
	    }
	    if (i + i_2515_ > (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_2533_ = (i + i_2515_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_2515_ -= i_2533_;
		i_2531_ += i_2533_;
	    }
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub2) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_2534_ = ((((Class103_Sub2) (((Class168_Sub2_Sub2) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_2515_ -= i_2534_;
		i_2530_ += i_2534_;
		i_2522_ += i_2526_ * i_2534_;
		i_2531_ += i_2534_;
	    }
	    float[] fs = (((Class103_Sub2)
			   ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			  .aFloatArray9248);
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub2) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (i_2519_ == 0) {
		if (i_2517_ == 1) {
		    int i_2535_ = i_2522_;
		    for (int i_2536_ = -i_2516_; i_2536_ < 0; i_2536_++) {
			int i_2537_
			    = ((i_2523_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2538_ = -i_2515_; i_2538_ < 0; i_2538_++) {
			    if (!bool_2512_ || f < fs[i_2530_]) {
				if (bool)
				    is[i_2530_]
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2522_ >> 16) + i_2537_]);
				if (bool_2512_ && bool_2521_)
				    fs[i_2530_] = f;
			    }
			    i_2522_ += i_2526_;
			    i_2530_++;
			}
			i_2523_ += i_2527_;
			i_2522_ = i_2535_;
			i_2530_ += i_2531_;
		    }
		} else if (i_2517_ == 0) {
		    int i_2539_ = (i_2518_ & 0xff0000) >> 16;
		    int i_2540_ = (i_2518_ & 0xff00) >> 8;
		    int i_2541_ = i_2518_ & 0xff;
		    int i_2542_ = i_2522_;
		    for (int i_2543_ = -i_2516_; i_2543_ < 0; i_2543_++) {
			int i_2544_
			    = ((i_2523_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2545_ = -i_2515_; i_2545_ < 0; i_2545_++) {
			    if (!bool_2512_ || f < fs[i_2530_]) {
				if (bool) {
				    int i_2546_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2522_ >> 16) + i_2544_]);
				    int i_2547_
					= ((i_2546_ & 0xff0000) * i_2539_
					   & ~0xffffff);
				    int i_2548_ = ((i_2546_ & 0xff00) * i_2540_
						   & 0xff0000);
				    int i_2549_
					= (i_2546_ & 0xff) * i_2541_ & 0xff00;
				    is[i_2530_]
					= (i_2547_ | i_2548_ | i_2549_) >>> 8;
				}
				if (bool_2512_ && bool_2521_)
				    fs[i_2530_] = f;
			    }
			    i_2522_ += i_2526_;
			    i_2530_++;
			}
			i_2523_ += i_2527_;
			i_2522_ = i_2542_;
			i_2530_ += i_2531_;
		    }
		} else if (i_2517_ == 3) {
		    int i_2550_ = i_2522_;
		    for (int i_2551_ = -i_2516_; i_2551_ < 0; i_2551_++) {
			int i_2552_
			    = ((i_2523_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2553_ = -i_2515_; i_2553_ < 0; i_2553_++) {
			    if (!bool_2512_ || f < fs[i_2530_]) {
				if (bool) {
				    int i_2554_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2522_ >> 16) + i_2552_]);
				    int i_2555_ = i_2554_ + i_2518_;
				    int i_2556_ = ((i_2554_ & 0xff00ff)
						   + (i_2518_ & 0xff00ff));
				    int i_2557_
					= ((i_2556_ & 0x1000100)
					   + (i_2555_ - i_2556_ & 0x10000));
				    is[i_2530_]
					= (i_2555_ - i_2557_
					   | i_2557_ - (i_2557_ >>> 8));
				}
				if (bool_2512_ && bool_2521_)
				    fs[i_2530_] = f;
			    }
			    i_2522_ += i_2526_;
			    i_2530_++;
			}
			i_2523_ += i_2527_;
			i_2522_ = i_2550_;
			i_2530_ += i_2531_;
		    }
		} else if (i_2517_ == 2) {
		    int i_2558_ = i_2518_ >>> 24;
		    int i_2559_ = 256 - i_2558_;
		    int i_2560_ = (i_2518_ & 0xff00ff) * i_2559_ & ~0xff00ff;
		    int i_2561_ = (i_2518_ & 0xff00) * i_2559_ & 0xff0000;
		    i_2518_ = (i_2560_ | i_2561_) >>> 8;
		    int i_2562_ = i_2522_;
		    for (int i_2563_ = -i_2516_; i_2563_ < 0; i_2563_++) {
			int i_2564_
			    = ((i_2523_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2565_ = -i_2515_; i_2565_ < 0; i_2565_++) {
			    if (!bool_2512_ || f < fs[i_2530_]) {
				if (bool) {
				    int i_2566_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2522_ >> 16) + i_2564_]);
				    i_2560_ = ((i_2566_ & 0xff00ff) * i_2558_
					       & ~0xff00ff);
				    i_2561_ = ((i_2566_ & 0xff00) * i_2558_
					       & 0xff0000);
				    is[i_2530_] = (((i_2560_ | i_2561_) >>> 8)
						   + i_2518_);
				}
				if (bool_2512_ && bool_2521_)
				    fs[i_2530_] = f;
			    }
			    i_2522_ += i_2526_;
			    i_2530_++;
			}
			i_2523_ += i_2527_;
			i_2522_ = i_2562_;
			i_2530_ += i_2531_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_2519_ == 1) {
		if (i_2517_ == 1) {
		    int i_2567_ = i_2522_;
		    for (int i_2568_ = -i_2516_; i_2568_ < 0; i_2568_++) {
			int i_2569_
			    = ((i_2523_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2570_ = -i_2515_; i_2570_ < 0; i_2570_++) {
			    if (!bool_2512_ || f < fs[i_2530_]) {
				if (bool) {
				    int i_2571_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2522_ >> 16) + i_2569_]);
				    int i_2572_ = i_2571_ >>> 24;
				    int i_2573_ = 256 - i_2572_;
				    int i_2574_ = is[i_2530_];
				    is[i_2530_]
					= (((((i_2571_ & 0xff00ff) * i_2572_
					      + (i_2574_ & 0xff00ff) * i_2573_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_2571_ & ~0xff00ff) >>> 8)
						* i_2572_)
					       + (((i_2574_ & ~0xff00ff) >>> 8)
						  * i_2573_))
					      & ~0xff00ff));
				}
				if (bool_2512_ && bool_2521_)
				    fs[i_2530_] = f;
			    }
			    i_2522_ += i_2526_;
			    i_2530_++;
			}
			i_2523_ += i_2527_;
			i_2522_ = i_2567_;
			i_2530_ += i_2531_;
		    }
		} else if (i_2517_ == 0) {
		    int i_2575_ = i_2522_;
		    if ((i_2518_ & 0xffffff) == 16777215) {
			for (int i_2576_ = -i_2516_; i_2576_ < 0; i_2576_++) {
			    int i_2577_
				= ((i_2523_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_2578_ = -i_2515_; i_2578_ < 0;
				 i_2578_++) {
				if (!bool_2512_ || f < fs[i_2530_]) {
				    if (bool) {
					int i_2579_
					    = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_2522_ >> 16) + i_2577_]);
					int i_2580_
					    = ((i_2579_ >>> 24) * (i_2518_
								   >>> 24)
					       >> 8);
					int i_2581_ = 256 - i_2580_;
					int i_2582_ = is[i_2530_];
					is[i_2530_]
					    = ((((i_2579_ & 0xff00ff) * i_2580_
						 + ((i_2582_ & 0xff00ff)
						    * i_2581_))
						& ~0xff00ff)
					       + (((i_2579_ & 0xff00) * i_2580_
						   + ((i_2582_ & 0xff00)
						      * i_2581_))
						  & 0xff0000)) >> 8;
				    }
				    if (bool_2512_ && bool_2521_)
					fs[i_2530_] = f;
				}
				i_2522_ += i_2526_;
				i_2530_++;
			    }
			    i_2523_ += i_2527_;
			    i_2522_ = i_2575_;
			    i_2530_ += i_2531_;
			}
		    } else {
			int i_2583_ = (i_2518_ & 0xff0000) >> 16;
			int i_2584_ = (i_2518_ & 0xff00) >> 8;
			int i_2585_ = i_2518_ & 0xff;
			for (int i_2586_ = -i_2516_; i_2586_ < 0; i_2586_++) {
			    int i_2587_
				= ((i_2523_ >> 16)
				   * ((Class168_Sub2_Sub2) this).anInt9920);
			    for (int i_2588_ = -i_2515_; i_2588_ < 0;
				 i_2588_++) {
				if (!bool_2512_ || f < fs[i_2530_]) {
				    int i_2589_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2522_ >> 16) + i_2587_]);
				    int i_2590_
					= ((i_2589_ >>> 24) * (i_2518_ >>> 24)
					   >> 8);
				    int i_2591_ = 256 - i_2590_;
				    if (i_2590_ != 255) {
					if (bool) {
					    int i_2592_
						= (((i_2589_ & 0xff0000)
						    * i_2583_)
						   & ~0xffffff);
					    int i_2593_
						= ((i_2589_ & 0xff00) * i_2584_
						   & 0xff0000);
					    int i_2594_
						= ((i_2589_ & 0xff) * i_2585_
						   & 0xff00);
					    i_2589_ = (i_2592_ | i_2593_
						       | i_2594_) >>> 8;
					    int i_2595_ = is[i_2530_];
					    is[i_2530_]
						= (((((i_2589_ & 0xff00ff)
						      * i_2590_)
						     + ((i_2595_ & 0xff00ff)
							* i_2591_))
						    & ~0xff00ff)
						   + ((((i_2589_ & 0xff00)
							* i_2590_)
						       + ((i_2595_ & 0xff00)
							  * i_2591_))
						      & 0xff0000)) >> 8;
					    if (bool_2513_) {
						int i_2596_ = ((i_2595_ >>> 24)
							       + i_2590_);
						if (i_2596_ > 255)
						    i_2596_ = 255;
						is[i_2530_] |= i_2596_ << 24;
					    }
					}
					if (bool_2512_ && bool_2521_)
					    fs[i_2530_] = f;
				    } else {
					if (bool) {
					    int i_2597_
						= (((i_2589_ & 0xff0000)
						    * i_2583_)
						   & ~0xffffff);
					    int i_2598_
						= ((i_2589_ & 0xff00) * i_2584_
						   & 0xff0000);
					    int i_2599_
						= ((i_2589_ & 0xff) * i_2585_
						   & 0xff00);
					    is[i_2530_] = (i_2597_ | i_2598_
							   | i_2599_) >>> 8;
					}
					if (bool_2512_ && bool_2521_)
					    fs[i_2530_] = f;
				    }
				}
				i_2522_ += i_2526_;
				i_2530_++;
			    }
			    i_2523_ += i_2527_;
			    i_2522_ = i_2575_;
			    i_2530_ += i_2531_;
			}
		    }
		} else if (i_2517_ == 3) {
		    int i_2600_ = i_2522_;
		    for (int i_2601_ = -i_2516_; i_2601_ < 0; i_2601_++) {
			int i_2602_
			    = ((i_2523_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2603_ = -i_2515_; i_2603_ < 0; i_2603_++) {
			    if (!bool_2512_ || f < fs[i_2530_]) {
				if (bool) {
				    int i_2604_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2522_ >> 16) + i_2602_]);
				    int i_2605_ = i_2604_ + i_2518_;
				    int i_2606_ = ((i_2604_ & 0xff00ff)
						   + (i_2518_ & 0xff00ff));
				    int i_2607_
					= ((i_2606_ & 0x1000100)
					   + (i_2605_ - i_2606_ & 0x10000));
				    i_2607_ = (i_2605_ - i_2607_
					       | i_2607_ - (i_2607_ >>> 8));
				    int i_2608_
					= ((i_2607_ >>> 24) * (i_2518_ >>> 24)
					   >> 8);
				    int i_2609_ = 256 - i_2608_;
				    if (i_2608_ != 255) {
					i_2604_ = i_2607_;
					i_2607_ = is[i_2530_];
					i_2607_
					    = ((((i_2604_ & 0xff00ff) * i_2608_
						 + ((i_2607_ & 0xff00ff)
						    * i_2609_))
						& ~0xff00ff)
					       + (((i_2604_ & 0xff00) * i_2608_
						   + ((i_2607_ & 0xff00)
						      * i_2609_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_2530_] = i_2607_;
				}
				if (bool_2512_ && bool_2521_)
				    fs[i_2530_] = f;
			    }
			    i_2522_ += i_2526_;
			    i_2530_++;
			}
			i_2523_ += i_2527_;
			i_2522_ = i_2600_;
			i_2530_ += i_2531_;
		    }
		} else if (i_2517_ == 2) {
		    int i_2610_ = i_2518_ >>> 24;
		    int i_2611_ = 256 - i_2610_;
		    int i_2612_ = (i_2518_ & 0xff00ff) * i_2611_ & ~0xff00ff;
		    int i_2613_ = (i_2518_ & 0xff00) * i_2611_ & 0xff0000;
		    i_2518_ = (i_2612_ | i_2613_) >>> 8;
		    int i_2614_ = i_2522_;
		    for (int i_2615_ = -i_2516_; i_2615_ < 0; i_2615_++) {
			int i_2616_
			    = ((i_2523_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2617_ = -i_2515_; i_2617_ < 0; i_2617_++) {
			    if (!bool_2512_ || f < fs[i_2530_]) {
				if (bool) {
				    int i_2618_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2522_ >> 16) + i_2616_]);
				    int i_2619_ = i_2618_ >>> 24;
				    int i_2620_ = 256 - i_2619_;
				    i_2612_ = ((i_2618_ & 0xff00ff) * i_2610_
					       & ~0xff00ff);
				    i_2613_ = ((i_2618_ & 0xff00) * i_2610_
					       & 0xff0000);
				    i_2618_ = (((i_2612_ | i_2613_) >>> 8)
					       + i_2518_);
				    int i_2621_ = is[i_2530_];
				    is[i_2530_]
					= ((((i_2618_ & 0xff00ff) * i_2619_
					     + (i_2621_ & 0xff00ff) * i_2620_)
					    & ~0xff00ff)
					   + (((i_2618_ & 0xff00) * i_2619_
					       + (i_2621_ & 0xff00) * i_2620_)
					      & 0xff0000)) >> 8;
				}
				if (bool_2512_ && bool_2521_)
				    fs[i_2530_] = f;
			    }
			    i_2522_ += i_2526_;
			    i_2530_++;
			}
			i_2523_ += i_2527_;
			i_2522_ = i_2614_;
			i_2530_ += i_2531_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_2519_ == 2) {
		if (i_2517_ == 1) {
		    int i_2622_ = i_2522_;
		    for (int i_2623_ = -i_2516_; i_2623_ < 0; i_2623_++) {
			int i_2624_
			    = ((i_2523_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2625_ = -i_2515_; i_2625_ < 0; i_2625_++) {
			    if (!bool_2512_ || f < fs[i_2530_]) {
				int i_2626_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_2522_ >> 16) + i_2624_]);
				if (i_2626_ != 0) {
				    if (bool) {
					int i_2627_ = is[i_2530_];
					int i_2628_ = i_2626_ + i_2627_;
					int i_2629_ = ((i_2626_ & 0xff00ff)
						       + (i_2627_ & 0xff00ff));
					i_2627_ = ((i_2629_ & 0x1000100)
						   + (i_2628_ - i_2629_
						      & 0x10000));
					is[i_2530_]
					    = (i_2628_ - i_2627_
					       | i_2627_ - (i_2627_ >>> 8));
				    }
				    if (bool_2512_ && bool_2521_)
					fs[i_2530_] = f;
				}
			    }
			    i_2522_ += i_2526_;
			    i_2530_++;
			}
			i_2523_ += i_2527_;
			i_2522_ = i_2622_;
			i_2530_ += i_2531_;
		    }
		} else if (i_2517_ == 0) {
		    int i_2630_ = i_2522_;
		    int i_2631_ = (i_2518_ & 0xff0000) >> 16;
		    int i_2632_ = (i_2518_ & 0xff00) >> 8;
		    int i_2633_ = i_2518_ & 0xff;
		    for (int i_2634_ = -i_2516_; i_2634_ < 0; i_2634_++) {
			int i_2635_
			    = ((i_2523_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2636_ = -i_2515_; i_2636_ < 0; i_2636_++) {
			    if (!bool_2512_ || f < fs[i_2530_]) {
				int i_2637_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_2522_ >> 16) + i_2635_]);
				if (i_2637_ != 0) {
				    if (bool) {
					int i_2638_
					    = ((i_2637_ & 0xff0000) * i_2631_
					       & ~0xffffff);
					int i_2639_
					    = ((i_2637_ & 0xff00) * i_2632_
					       & 0xff0000);
					int i_2640_
					    = ((i_2637_ & 0xff) * i_2633_
					       & 0xff00);
					i_2637_ = (i_2638_ | i_2639_
						   | i_2640_) >>> 8;
					int i_2641_ = is[i_2530_];
					int i_2642_ = i_2637_ + i_2641_;
					int i_2643_ = ((i_2637_ & 0xff00ff)
						       + (i_2641_ & 0xff00ff));
					i_2641_ = ((i_2643_ & 0x1000100)
						   + (i_2642_ - i_2643_
						      & 0x10000));
					is[i_2530_]
					    = (i_2642_ - i_2641_
					       | i_2641_ - (i_2641_ >>> 8));
				    }
				    if (bool_2512_ && bool_2521_)
					fs[i_2530_] = f;
				}
			    }
			    i_2522_ += i_2526_;
			    i_2530_++;
			}
			i_2523_ += i_2527_;
			i_2522_ = i_2630_;
			i_2530_ += i_2531_;
		    }
		} else if (i_2517_ == 3) {
		    int i_2644_ = i_2522_;
		    for (int i_2645_ = -i_2516_; i_2645_ < 0; i_2645_++) {
			int i_2646_
			    = ((i_2523_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2647_ = -i_2515_; i_2647_ < 0; i_2647_++) {
			    if (!bool_2512_ || f < fs[i_2530_]) {
				if (bool) {
				    int i_2648_
					= (((Class168_Sub2_Sub2) this)
					   .anIntArray11124
					   [(i_2522_ >> 16) + i_2646_]);
				    int i_2649_ = i_2648_ + i_2518_;
				    int i_2650_ = ((i_2648_ & 0xff00ff)
						   + (i_2518_ & 0xff00ff));
				    int i_2651_
					= ((i_2650_ & 0x1000100)
					   + (i_2649_ - i_2650_ & 0x10000));
				    i_2648_ = (i_2649_ - i_2651_
					       | i_2651_ - (i_2651_ >>> 8));
				    i_2651_ = is[i_2530_];
				    i_2649_ = i_2648_ + i_2651_;
				    i_2650_
					= (i_2648_ & 0xff00ff) + (i_2651_
								  & 0xff00ff);
				    i_2651_
					= ((i_2650_ & 0x1000100)
					   + (i_2649_ - i_2650_ & 0x10000));
				    is[i_2530_]
					= (i_2649_ - i_2651_
					   | i_2651_ - (i_2651_ >>> 8));
				}
				if (bool_2512_ && bool_2521_)
				    fs[i_2530_] = f;
			    }
			    i_2522_ += i_2526_;
			    i_2530_++;
			}
			i_2523_ += i_2527_;
			i_2522_ = i_2644_;
			i_2530_ += i_2531_;
		    }
		} else if (i_2517_ == 2) {
		    int i_2652_ = i_2518_ >>> 24;
		    int i_2653_ = 256 - i_2652_;
		    int i_2654_ = (i_2518_ & 0xff00ff) * i_2653_ & ~0xff00ff;
		    int i_2655_ = (i_2518_ & 0xff00) * i_2653_ & 0xff0000;
		    i_2518_ = (i_2654_ | i_2655_) >>> 8;
		    int i_2656_ = i_2522_;
		    for (int i_2657_ = -i_2516_; i_2657_ < 0; i_2657_++) {
			int i_2658_
			    = ((i_2523_ >> 16)
			       * ((Class168_Sub2_Sub2) this).anInt9920);
			for (int i_2659_ = -i_2515_; i_2659_ < 0; i_2659_++) {
			    if (!bool_2512_ || f < fs[i_2530_]) {
				int i_2660_ = (((Class168_Sub2_Sub2) this)
					       .anIntArray11124
					       [(i_2522_ >> 16) + i_2658_]);
				if (i_2660_ != 0) {
				    if (bool) {
					i_2654_
					    = ((i_2660_ & 0xff00ff) * i_2652_
					       & ~0xff00ff);
					i_2655_ = ((i_2660_ & 0xff00) * i_2652_
						   & 0xff0000);
					i_2660_ = (((i_2654_ | i_2655_) >>> 8)
						   + i_2518_);
					int i_2661_ = is[i_2530_];
					int i_2662_ = i_2660_ + i_2661_;
					int i_2663_ = ((i_2660_ & 0xff00ff)
						       + (i_2661_ & 0xff00ff));
					i_2661_ = ((i_2663_ & 0x1000100)
						   + (i_2662_ - i_2663_
						      & 0x10000));
					is[i_2530_]
					    = (i_2662_ - i_2661_
					       | i_2661_ - (i_2661_ >>> 8));
				    }
				    if (bool_2512_ && bool_2521_)
					fs[i_2530_] = f;
				}
			    }
			    i_2522_ += i_2526_;
			    i_2530_++;
			}
			i_2523_ += i_2527_;
			i_2522_ = i_2656_;
			i_2530_ += i_2531_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
}
