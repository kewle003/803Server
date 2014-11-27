/* Class168_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class168_Sub2_Sub1 extends Class168_Sub2
{
    int[] anIntArray10708;
    
    void method16221(boolean bool, boolean bool_0_, boolean bool_1_, int i,
		     int i_2_, float f, int i_3_, int i_4_, int i_5_, int i_6_,
		     int i_7_, int i_8_, boolean bool_9_) {
	if (i_3_ > 0 && i_4_ > 0 && (bool || bool_0_)) {
	    int i_10_ = 0;
	    int i_11_ = 0;
	    int i_12_ = (((Class168_Sub2_Sub1) this).anInt9907
			 + ((Class168_Sub2_Sub1) this).anInt9920
			 + ((Class168_Sub2_Sub1) this).anInt9909);
	    int i_13_ = (((Class168_Sub2_Sub1) this).anInt9905
			 + ((Class168_Sub2_Sub1) this).anInt9916
			 + ((Class168_Sub2_Sub1) this).anInt9910);
	    int i_14_ = (i_12_ << 16) / i_3_;
	    int i_15_ = (i_13_ << 16) / i_4_;
	    if (((Class168_Sub2_Sub1) this).anInt9907 > 0) {
		int i_16_ = (((((Class168_Sub2_Sub1) this).anInt9907 << 16)
			      + i_14_ - 1)
			     / i_14_);
		i += i_16_;
		i_10_ += i_16_ * i_14_ - (((Class168_Sub2_Sub1) this).anInt9907
					  << 16);
	    }
	    if (((Class168_Sub2_Sub1) this).anInt9905 > 0) {
		int i_17_ = (((((Class168_Sub2_Sub1) this).anInt9905 << 16)
			      + i_15_ - 1)
			     / i_15_);
		i_2_ += i_17_;
		i_11_ += i_17_ * i_15_ - (((Class168_Sub2_Sub1) this).anInt9905
					  << 16);
	    }
	    if (((Class168_Sub2_Sub1) this).anInt9920 < i_12_)
		i_3_ = ((((Class168_Sub2_Sub1) this).anInt9920 << 16) - i_10_
			+ i_14_ - 1) / i_14_;
	    if (((Class168_Sub2_Sub1) this).anInt9916 < i_13_)
		i_4_ = ((((Class168_Sub2_Sub1) this).anInt9916 << 16) - i_11_
			+ i_15_ - 1) / i_15_;
	    int i_18_
		= (i
		   + i_2_ * (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					       .aClass103_Sub2_9904)).anInt9260
			     * -1826993761));
	    int i_19_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					    .aClass103_Sub2_9904)).anInt9260
			  * -1826993761)
			 - i_3_);
	    if (i_2_ + i_4_ > (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165)
		i_4_ -= (i_2_ + i_4_
			 - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					      .aClass103_Sub2_9904)).anInt9252
			    * 1546170165));
	    if (i_2_ < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					  .aClass103_Sub2_9904)).anInt9254
			* -788450385)) {
		int i_20_ = ((((Class103_Sub2)
			       ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			      .anInt9254) * -788450385
			     - i_2_);
		i_4_ -= i_20_;
		i_18_
		    += i_20_ * ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						   .aClass103_Sub2_9904))
				 .anInt9260)
				* -1826993761);
		i_11_ += i_15_ * i_20_;
	    }
	    if (i + i_3_ > (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					      .aClass103_Sub2_9904)).anInt9250
			    * 325436811)) {
		int i_21_
		    = i + i_3_ - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811;
		i_3_ -= i_21_;
		i_19_ += i_21_;
	    }
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_22_ = ((((Class103_Sub2)
			       ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			      .anInt9249) * 1298750001
			     - i);
		i_3_ -= i_22_;
		i_18_ += i_22_;
		i_10_ += i_14_ * i_22_;
		i_19_ += i_22_;
	    }
	    float[] fs = (((Class103_Sub2)
			   ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			  .aFloatArray9248);
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (i_7_ == 0) {
		if (i_5_ == 1) {
		    int i_23_ = i_10_;
		    for (int i_24_ = -i_4_; i_24_ < 0; i_24_++) {
			int i_25_ = ((i_11_ >> 16)
				     * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_26_ = -i_3_; i_26_ < 0; i_26_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				if (bool)
				    is[i_18_] = (((Class168_Sub2_Sub1) this)
						 .anIntArray10708
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
				     * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_33_ = -i_3_; i_33_ < 0; i_33_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				if (bool) {
				    int i_34_ = (((Class168_Sub2_Sub1) this)
						 .anIntArray10708
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
				     * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_41_ = -i_3_; i_41_ < 0; i_41_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				if (bool) {
				    int i_42_ = (((Class168_Sub2_Sub1) this)
						 .anIntArray10708
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
				     * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_53_ = -i_3_; i_53_ < 0; i_53_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				if (bool) {
				    int i_54_ = (((Class168_Sub2_Sub1) this)
						 .anIntArray10708
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
				     * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_58_ = -i_3_; i_58_ < 0; i_58_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				int i_59_ = (((Class168_Sub2_Sub1) this)
					     .anIntArray10708
					     [(i_10_ >> 16) + i_57_]);
				if (i_59_ != 0) {
				    if (bool)
					is[i_18_] = i_59_;
				    if (bool_0_ && bool_9_)
					fs[i_18_] = f;
				}
			    }
			    i_10_ += i_14_;
			    i_18_++;
			}
			i_11_ += i_15_;
			i_10_ = i_55_;
			i_18_ += i_19_;
		    }
		} else if (i_5_ == 0) {
		    int i_60_ = i_10_;
		    if ((i_6_ & 0xffffff) == 16777215) {
			int i_61_ = i_6_ >>> 24;
			int i_62_ = 256 - i_61_;
			for (int i_63_ = -i_4_; i_63_ < 0; i_63_++) {
			    int i_64_
				= ((i_11_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_65_ = -i_3_; i_65_ < 0; i_65_++) {
				if (!bool_0_ || f < fs[i_18_]) {
				    int i_66_ = (((Class168_Sub2_Sub1) this)
						 .anIntArray10708
						 [(i_10_ >> 16) + i_64_]);
				    if (i_66_ != 0) {
					if (bool) {
					    int i_67_ = is[i_18_];
					    is[i_18_]
						= ((((i_66_ & 0xff00ff) * i_61_
						     + ((i_67_ & 0xff00ff)
							* i_62_))
						    & ~0xff00ff)
						   + (((i_66_ & 0xff00) * i_61_
						       + ((i_67_ & 0xff00)
							  * i_62_))
						      & 0xff0000)) >> 8;
					}
					if (bool_0_ && bool_9_)
					    fs[i_18_] = f;
				    }
				}
				i_10_ += i_14_;
				i_18_++;
			    }
			    i_11_ += i_15_;
			    i_10_ = i_60_;
			    i_18_ += i_19_;
			}
		    } else {
			int i_68_ = (i_6_ & 0xff0000) >> 16;
			int i_69_ = (i_6_ & 0xff00) >> 8;
			int i_70_ = i_6_ & 0xff;
			int i_71_ = i_6_ >>> 24;
			int i_72_ = 256 - i_71_;
			for (int i_73_ = -i_4_; i_73_ < 0; i_73_++) {
			    int i_74_
				= ((i_11_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_75_ = -i_3_; i_75_ < 0; i_75_++) {
				if (!bool_0_ || f < fs[i_18_]) {
				    int i_76_ = (((Class168_Sub2_Sub1) this)
						 .anIntArray10708
						 [(i_10_ >> 16) + i_74_]);
				    if (i_76_ != 0) {
					if (i_71_ != 255) {
					    if (bool) {
						int i_77_
						    = (((i_76_ & 0xff0000)
							* i_68_)
						       & ~0xffffff);
						int i_78_
						    = ((i_76_ & 0xff00) * i_69_
						       & 0xff0000);
						int i_79_
						    = ((i_76_ & 0xff) * i_70_
						       & 0xff00);
						i_76_ = (i_77_ | i_78_
							 | i_79_) >>> 8;
						int i_80_ = is[i_18_];
						is[i_18_]
						    = (((((i_76_ & 0xff00ff)
							  * i_71_)
							 + ((i_80_ & 0xff00ff)
							    * i_72_))
							& ~0xff00ff)
						       + ((((i_76_ & 0xff00)
							    * i_71_)
							   + ((i_80_ & 0xff00)
							      * i_72_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_0_ && bool_9_)
						fs[i_18_] = f;
					} else {
					    if (bool) {
						int i_81_
						    = (((i_76_ & 0xff0000)
							* i_68_)
						       & ~0xffffff);
						int i_82_
						    = ((i_76_ & 0xff00) * i_69_
						       & 0xff0000);
						int i_83_
						    = ((i_76_ & 0xff) * i_70_
						       & 0xff00);
						is[i_18_] = (i_81_ | i_82_
							     | i_83_) >>> 8;
					    }
					    if (bool_0_ && bool_9_)
						fs[i_18_] = f;
					}
				    }
				}
				i_10_ += i_14_;
				i_18_++;
			    }
			    i_11_ += i_15_;
			    i_10_ = i_60_;
			    i_18_ += i_19_;
			}
		    }
		} else if (i_5_ == 3) {
		    int i_84_ = i_10_;
		    int i_85_ = i_6_ >>> 24;
		    int i_86_ = 256 - i_85_;
		    for (int i_87_ = -i_4_; i_87_ < 0; i_87_++) {
			int i_88_ = ((i_11_ >> 16)
				     * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_89_ = -i_3_; i_89_ < 0; i_89_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				if (bool) {
				    int i_90_ = (((Class168_Sub2_Sub1) this)
						 .anIntArray10708
						 [(i_10_ >> 16) + i_88_]);
				    int i_91_ = i_90_ + i_6_;
				    int i_92_ = ((i_90_ & 0xff00ff)
						 + (i_6_ & 0xff00ff));
				    int i_93_ = ((i_92_ & 0x1000100)
						 + (i_91_ - i_92_ & 0x10000));
				    i_93_ = i_91_ - i_93_ | i_93_ - (i_93_
								     >>> 8);
				    if (i_90_ == 0 && i_85_ != 255) {
					i_90_ = i_93_;
					i_93_ = is[i_18_];
					i_93_
					    = ((((i_90_ & 0xff00ff) * i_85_
						 + (i_93_ & 0xff00ff) * i_86_)
						& ~0xff00ff)
					       + (((i_90_ & 0xff00) * i_85_
						   + (i_93_ & 0xff00) * i_86_)
						  & 0xff0000)) >> 8;
				    }
				    is[i_18_] = i_93_;
				}
				if (bool_0_ && bool_9_)
				    fs[i_18_] = f;
			    }
			    i_10_ += i_14_;
			    i_18_++;
			}
			i_11_ += i_15_;
			i_10_ = i_84_;
			i_18_ += i_19_;
		    }
		} else if (i_5_ == 2) {
		    int i_94_ = i_6_ >>> 24;
		    int i_95_ = 256 - i_94_;
		    int i_96_ = (i_6_ & 0xff00ff) * i_95_ & ~0xff00ff;
		    int i_97_ = (i_6_ & 0xff00) * i_95_ & 0xff0000;
		    i_6_ = (i_96_ | i_97_) >>> 8;
		    int i_98_ = i_10_;
		    for (int i_99_ = -i_4_; i_99_ < 0; i_99_++) {
			int i_100_ = ((i_11_ >> 16)
				      * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_101_ = -i_3_; i_101_ < 0; i_101_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				int i_102_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708
					      [(i_10_ >> 16) + i_100_]);
				if (i_102_ != 0) {
				    if (bool) {
					i_96_ = ((i_102_ & 0xff00ff) * i_94_
						 & ~0xff00ff);
					i_97_ = ((i_102_ & 0xff00) * i_94_
						 & 0xff0000);
					is[i_18_]
					    = ((i_96_ | i_97_) >>> 8) + i_6_;
				    }
				    if (bool_0_ && bool_9_)
					fs[i_18_] = f;
				}
			    }
			    i_10_ += i_14_;
			    i_18_++;
			}
			i_11_ += i_15_;
			i_10_ = i_98_;
			i_18_ += i_19_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_7_ == 2) {
		if (i_5_ == 1) {
		    int i_103_ = i_10_;
		    for (int i_104_ = -i_4_; i_104_ < 0; i_104_++) {
			int i_105_ = ((i_11_ >> 16)
				      * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_106_ = -i_3_; i_106_ < 0; i_106_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				int i_107_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708
					      [(i_10_ >> 16) + i_105_]);
				if (i_107_ != 0) {
				    if (bool) {
					int i_108_ = is[i_18_];
					int i_109_ = i_107_ + i_108_;
					int i_110_ = ((i_107_ & 0xff00ff)
						      + (i_108_ & 0xff00ff));
					i_108_
					    = ((i_110_ & 0x1000100)
					       + (i_109_ - i_110_ & 0x10000));
					is[i_18_]
					    = (i_109_ - i_108_
					       | i_108_ - (i_108_ >>> 8));
				    }
				    if (bool_0_ && bool_9_)
					fs[i_18_] = f;
				}
			    }
			    i_10_ += i_14_;
			    i_18_++;
			}
			i_11_ += i_15_;
			i_10_ = i_103_;
			i_18_ += i_19_;
		    }
		} else if (i_5_ == 0) {
		    int i_111_ = i_10_;
		    int i_112_ = (i_6_ & 0xff0000) >> 16;
		    int i_113_ = (i_6_ & 0xff00) >> 8;
		    int i_114_ = i_6_ & 0xff;
		    for (int i_115_ = -i_4_; i_115_ < 0; i_115_++) {
			int i_116_ = ((i_11_ >> 16)
				      * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_117_ = -i_3_; i_117_ < 0; i_117_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				int i_118_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708
					      [(i_10_ >> 16) + i_116_]);
				if (i_118_ != 0) {
				    if (bool) {
					int i_119_
					    = ((i_118_ & 0xff0000) * i_112_
					       & ~0xffffff);
					int i_120_
					    = ((i_118_ & 0xff00) * i_113_
					       & 0xff0000);
					int i_121_ = ((i_118_ & 0xff) * i_114_
						      & 0xff00);
					i_118_
					    = (i_119_ | i_120_ | i_121_) >>> 8;
					int i_122_ = is[i_18_];
					int i_123_ = i_118_ + i_122_;
					int i_124_ = ((i_118_ & 0xff00ff)
						      + (i_122_ & 0xff00ff));
					i_122_
					    = ((i_124_ & 0x1000100)
					       + (i_123_ - i_124_ & 0x10000));
					is[i_18_]
					    = (i_123_ - i_122_
					       | i_122_ - (i_122_ >>> 8));
				    }
				    if (bool_0_ && bool_9_)
					fs[i_18_] = f;
				}
			    }
			    i_10_ += i_14_;
			    i_18_++;
			}
			i_11_ += i_15_;
			i_10_ = i_111_;
			i_18_ += i_19_;
		    }
		} else if (i_5_ == 3) {
		    int i_125_ = i_10_;
		    for (int i_126_ = -i_4_; i_126_ < 0; i_126_++) {
			int i_127_ = ((i_11_ >> 16)
				      * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_128_ = -i_3_; i_128_ < 0; i_128_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				if (bool) {
				    int i_129_ = (((Class168_Sub2_Sub1) this)
						  .anIntArray10708
						  [(i_10_ >> 16) + i_127_]);
				    int i_130_ = i_129_ + i_6_;
				    int i_131_ = ((i_129_ & 0xff00ff)
						  + (i_6_ & 0xff00ff));
				    int i_132_
					= ((i_131_ & 0x1000100)
					   + (i_130_ - i_131_ & 0x10000));
				    i_129_
					= i_130_ - i_132_ | i_132_ - (i_132_
								      >>> 8);
				    i_132_ = is[i_18_];
				    i_130_ = i_129_ + i_132_;
				    i_131_
					= (i_129_ & 0xff00ff) + (i_132_
								 & 0xff00ff);
				    i_132_ = ((i_131_ & 0x1000100)
					      + (i_130_ - i_131_ & 0x10000));
				    is[i_18_]
					= i_130_ - i_132_ | i_132_ - (i_132_
								      >>> 8);
				}
				if (bool_0_ && bool_9_)
				    fs[i_18_] = f;
			    }
			    i_10_ += i_14_;
			    i_18_++;
			}
			i_11_ += i_15_;
			i_10_ = i_125_;
			i_18_ += i_19_;
		    }
		} else if (i_5_ == 2) {
		    int i_133_ = i_6_ >>> 24;
		    int i_134_ = 256 - i_133_;
		    int i_135_ = (i_6_ & 0xff00ff) * i_134_ & ~0xff00ff;
		    int i_136_ = (i_6_ & 0xff00) * i_134_ & 0xff0000;
		    i_6_ = (i_135_ | i_136_) >>> 8;
		    int i_137_ = i_10_;
		    for (int i_138_ = -i_4_; i_138_ < 0; i_138_++) {
			int i_139_ = ((i_11_ >> 16)
				      * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_140_ = -i_3_; i_140_ < 0; i_140_++) {
			    if (!bool_0_ || f < fs[i_18_]) {
				int i_141_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708
					      [(i_10_ >> 16) + i_139_]);
				if (i_141_ != 0) {
				    if (bool) {
					i_135_ = ((i_141_ & 0xff00ff) * i_133_
						  & ~0xff00ff);
					i_136_ = ((i_141_ & 0xff00) * i_133_
						  & 0xff0000);
					i_141_
					    = ((i_135_ | i_136_) >>> 8) + i_6_;
					int i_142_ = is[i_18_];
					int i_143_ = i_141_ + i_142_;
					int i_144_ = ((i_141_ & 0xff00ff)
						      + (i_142_ & 0xff00ff));
					i_142_
					    = ((i_144_ & 0x1000100)
					       + (i_143_ - i_144_ & 0x10000));
					is[i_18_]
					    = (i_143_ - i_142_
					       | i_142_ - (i_142_ >>> 8));
				    }
				    if (bool_0_ && bool_9_)
					fs[i_18_] = f;
				}
			    }
			    i_10_ += i_14_;
			    i_18_++;
			}
			i_11_ += i_15_;
			i_10_ = i_137_;
			i_18_ += i_19_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    Class168_Sub2_Sub1(Class103_Sub2 class103_sub2, int[] is, int i,
		       int i_145_, int i_146_, int i_147_, boolean bool) {
	super(class103_sub2, i_146_, i_147_);
	if (bool)
	    ((Class168_Sub2_Sub1) this).anIntArray10708
		= new int[i_146_ * i_147_];
	else
	    ((Class168_Sub2_Sub1) this).anIntArray10708 = is;
	i_145_ -= ((Class168_Sub2_Sub1) this).anInt9920;
	int i_148_ = 0;
	for (int i_149_ = 0; i_149_ < i_147_; i_149_++) {
	    for (int i_150_ = 0; i_150_ < i_146_; i_150_++) {
		int i_151_ = is[i++];
		if (i_151_ >>> 24 == 255)
		    ((Class168_Sub2_Sub1) this).anIntArray10708[i_148_++]
			= (i_151_ & 0xffffff) == 0 ? -16777215 : i_151_;
		else
		    ((Class168_Sub2_Sub1) this).anIntArray10708[i_148_++] = 0;
	    }
	    i += i_145_;
	}
    }
    
    Class168_Sub2_Sub1(Class103_Sub2 class103_sub2, int i, int i_152_) {
	super(class103_sub2, i, i_152_);
	((Class168_Sub2_Sub1) this).anIntArray10708 = new int[i * i_152_];
    }
    
    public void method3635(int i, int i_153_, int i_154_, int i_155_,
			   int i_156_) {
	if (((Class168_Sub2_Sub1) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    int i_157_ = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					    .aClass103_Sub2_9904)).anInt9260
			  * -1826993761);
	    i += ((Class168_Sub2_Sub1) this).anInt9907;
	    i_153_ += ((Class168_Sub2_Sub1) this).anInt9905;
	    int i_158_ = i_153_ * i_157_ + i;
	    int i_159_ = 0;
	    int i_160_ = ((Class168_Sub2_Sub1) this).anInt9916;
	    int i_161_ = ((Class168_Sub2_Sub1) this).anInt9920;
	    int i_162_ = i_157_ - i_161_;
	    int i_163_ = 0;
	    if (i_153_ < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					    .aClass103_Sub2_9904)).anInt9254
			  * -788450385)) {
		int i_164_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9254) * -788450385
			      - i_153_);
		i_160_ -= i_164_;
		i_153_ = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					    .aClass103_Sub2_9904)).anInt9254
			  * -788450385);
		i_159_ += i_164_ * i_161_;
		i_158_ += i_164_ * i_157_;
	    }
	    if (i_153_ + i_160_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_160_ -= (i_153_ + i_160_
			   - (((Class103_Sub2)
			       ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			      .anInt9252) * 1546170165);
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_165_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9249) * 1298750001
			      - i);
		i_161_ -= i_165_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_159_ += i_165_;
		i_158_ += i_165_;
		i_163_ += i_165_;
		i_162_ += i_165_;
	    }
	    if (i + i_161_ > (((Class103_Sub2)
			       ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			      .anInt9250) * 325436811) {
		int i_166_ = (i + i_161_
			      - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						   .aClass103_Sub2_9904))
				 .anInt9250) * 325436811);
		i_161_ -= i_166_;
		i_163_ += i_166_;
		i_162_ += i_166_;
	    }
	    if (i_161_ > 0 && i_160_ > 0) {
		if (i_156_ == 0) {
		    if (i_154_ == 1) {
			for (int i_167_ = -i_160_; i_167_ < 0; i_167_++) {
			    int i_168_ = i_158_ + i_161_ - 3;
			    while (i_158_ < i_168_) {
				is[i_158_++] = (((Class168_Sub2_Sub1) this)
						.anIntArray10708[i_159_++]);
				is[i_158_++] = (((Class168_Sub2_Sub1) this)
						.anIntArray10708[i_159_++]);
				is[i_158_++] = (((Class168_Sub2_Sub1) this)
						.anIntArray10708[i_159_++]);
				is[i_158_++] = (((Class168_Sub2_Sub1) this)
						.anIntArray10708[i_159_++]);
			    }
			    i_168_ += 3;
			    while (i_158_ < i_168_)
				is[i_158_++] = (((Class168_Sub2_Sub1) this)
						.anIntArray10708[i_159_++]);
			    i_158_ += i_162_;
			    i_159_ += i_163_;
			}
		    } else if (i_154_ == 0) {
			int i_169_ = (i_155_ & 0xff0000) >> 16;
			int i_170_ = (i_155_ & 0xff00) >> 8;
			int i_171_ = i_155_ & 0xff;
			for (int i_172_ = -i_160_; i_172_ < 0; i_172_++) {
			    for (int i_173_ = -i_161_; i_173_ < 0; i_173_++) {
				int i_174_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_159_++]);
				int i_175_
				    = (i_174_ & 0xff0000) * i_169_ & ~0xffffff;
				int i_176_
				    = (i_174_ & 0xff00) * i_170_ & 0xff0000;
				int i_177_ = (i_174_ & 0xff) * i_171_ & 0xff00;
				is[i_158_++]
				    = (i_175_ | i_176_ | i_177_) >>> 8;
			    }
			    i_158_ += i_162_;
			    i_159_ += i_163_;
			}
		    } else if (i_154_ == 3) {
			for (int i_178_ = -i_160_; i_178_ < 0; i_178_++) {
			    for (int i_179_ = -i_161_; i_179_ < 0; i_179_++) {
				int i_180_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_159_++]);
				int i_181_ = i_180_ + i_155_;
				int i_182_ = ((i_180_ & 0xff00ff)
					      + (i_155_ & 0xff00ff));
				int i_183_ = ((i_182_ & 0x1000100)
					      + (i_181_ - i_182_ & 0x10000));
				is[i_158_++]
				    = i_181_ - i_183_ | i_183_ - (i_183_
								  >>> 8);
			    }
			    i_158_ += i_162_;
			    i_159_ += i_163_;
			}
		    } else if (i_154_ == 2) {
			int i_184_ = i_155_ >>> 24;
			int i_185_ = 256 - i_184_;
			int i_186_ = (i_155_ & 0xff00ff) * i_185_ & ~0xff00ff;
			int i_187_ = (i_155_ & 0xff00) * i_185_ & 0xff0000;
			i_155_ = (i_186_ | i_187_) >>> 8;
			for (int i_188_ = -i_160_; i_188_ < 0; i_188_++) {
			    for (int i_189_ = -i_161_; i_189_ < 0; i_189_++) {
				int i_190_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_159_++]);
				i_186_
				    = (i_190_ & 0xff00ff) * i_184_ & ~0xff00ff;
				i_187_ = (i_190_ & 0xff00) * i_184_ & 0xff0000;
				is[i_158_++]
				    = ((i_186_ | i_187_) >>> 8) + i_155_;
			    }
			    i_158_ += i_162_;
			    i_159_ += i_163_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_156_ == 1) {
		    if (i_154_ == 1) {
			for (int i_191_ = -i_160_; i_191_ < 0; i_191_++) {
			    int i_192_ = i_158_ + i_161_ - 3;
			    while (i_158_ < i_192_) {
				int i_193_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_159_++]);
				if (i_193_ != 0)
				    is[i_158_++] = i_193_;
				else
				    i_158_++;
				i_193_ = (((Class168_Sub2_Sub1) this)
					  .anIntArray10708[i_159_++]);
				if (i_193_ != 0)
				    is[i_158_++] = i_193_;
				else
				    i_158_++;
				i_193_ = (((Class168_Sub2_Sub1) this)
					  .anIntArray10708[i_159_++]);
				if (i_193_ != 0)
				    is[i_158_++] = i_193_;
				else
				    i_158_++;
				i_193_ = (((Class168_Sub2_Sub1) this)
					  .anIntArray10708[i_159_++]);
				if (i_193_ != 0)
				    is[i_158_++] = i_193_;
				else
				    i_158_++;
			    }
			    i_192_ += 3;
			    while (i_158_ < i_192_) {
				int i_194_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_159_++]);
				if (i_194_ != 0)
				    is[i_158_++] = i_194_;
				else
				    i_158_++;
			    }
			    i_158_ += i_162_;
			    i_159_ += i_163_;
			}
		    } else if (i_154_ == 0) {
			if ((i_155_ & 0xffffff) == 16777215) {
			    int i_195_ = i_155_ >>> 24;
			    int i_196_ = 256 - i_195_;
			    for (int i_197_ = -i_160_; i_197_ < 0; i_197_++) {
				for (int i_198_ = -i_161_; i_198_ < 0;
				     i_198_++) {
				    int i_199_ = (((Class168_Sub2_Sub1) this)
						  .anIntArray10708[i_159_++]);
				    if (i_199_ != 0) {
					int i_200_ = is[i_158_];
					is[i_158_++]
					    = ((((i_199_ & 0xff00ff) * i_195_
						 + ((i_200_ & 0xff00ff)
						    * i_196_))
						& ~0xff00ff)
					       + (((i_199_ & 0xff00) * i_195_
						   + ((i_200_ & 0xff00)
						      * i_196_))
						  & 0xff0000)) >> 8;
				    } else
					i_158_++;
				}
				i_158_ += i_162_;
				i_159_ += i_163_;
			    }
			} else {
			    int i_201_ = (i_155_ & 0xff0000) >> 16;
			    int i_202_ = (i_155_ & 0xff00) >> 8;
			    int i_203_ = i_155_ & 0xff;
			    int i_204_ = i_155_ >>> 24;
			    int i_205_ = 256 - i_204_;
			    for (int i_206_ = -i_160_; i_206_ < 0; i_206_++) {
				for (int i_207_ = -i_161_; i_207_ < 0;
				     i_207_++) {
				    int i_208_ = (((Class168_Sub2_Sub1) this)
						  .anIntArray10708[i_159_++]);
				    if (i_208_ != 0) {
					if (i_204_ != 255) {
					    int i_209_
						= ((i_208_ & 0xff0000) * i_201_
						   & ~0xffffff);
					    int i_210_
						= ((i_208_ & 0xff00) * i_202_
						   & 0xff0000);
					    int i_211_
						= ((i_208_ & 0xff) * i_203_
						   & 0xff00);
					    i_208_ = (i_209_ | i_210_
						      | i_211_) >>> 8;
					    int i_212_ = is[i_158_];
					    is[i_158_++]
						= (((((i_208_ & 0xff00ff)
						      * i_204_)
						     + ((i_212_ & 0xff00ff)
							* i_205_))
						    & ~0xff00ff)
						   + ((((i_208_ & 0xff00)
							* i_204_)
						       + ((i_212_ & 0xff00)
							  * i_205_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_213_
						= ((i_208_ & 0xff0000) * i_201_
						   & ~0xffffff);
					    int i_214_
						= ((i_208_ & 0xff00) * i_202_
						   & 0xff0000);
					    int i_215_
						= ((i_208_ & 0xff) * i_203_
						   & 0xff00);
					    is[i_158_++] = (i_213_ | i_214_
							    | i_215_) >>> 8;
					}
				    } else
					i_158_++;
				}
				i_158_ += i_162_;
				i_159_ += i_163_;
			    }
			}
		    } else if (i_154_ == 3) {
			int i_216_ = i_155_ >>> 24;
			int i_217_ = 256 - i_216_;
			for (int i_218_ = -i_160_; i_218_ < 0; i_218_++) {
			    for (int i_219_ = -i_161_; i_219_ < 0; i_219_++) {
				int i_220_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_159_++]);
				int i_221_ = i_220_ + i_155_;
				int i_222_ = ((i_220_ & 0xff00ff)
					      + (i_155_ & 0xff00ff));
				int i_223_ = ((i_222_ & 0x1000100)
					      + (i_221_ - i_222_ & 0x10000));
				i_223_ = i_221_ - i_223_ | i_223_ - (i_223_
								     >>> 8);
				if (i_220_ == 0 && i_216_ != 255) {
				    i_220_ = i_223_;
				    i_223_ = is[i_158_];
				    i_223_ = ((((i_220_ & 0xff00ff) * i_216_
						+ (i_223_ & 0xff00ff) * i_217_)
					       & ~0xff00ff)
					      + (((i_220_ & 0xff00) * i_216_
						  + (i_223_ & 0xff00) * i_217_)
						 & 0xff0000)) >> 8;
				}
				is[i_158_++] = i_223_;
			    }
			    i_158_ += i_162_;
			    i_159_ += i_163_;
			}
		    } else if (i_154_ == 2) {
			int i_224_ = i_155_ >>> 24;
			int i_225_ = 256 - i_224_;
			int i_226_ = (i_155_ & 0xff00ff) * i_225_ & ~0xff00ff;
			int i_227_ = (i_155_ & 0xff00) * i_225_ & 0xff0000;
			i_155_ = (i_226_ | i_227_) >>> 8;
			for (int i_228_ = -i_160_; i_228_ < 0; i_228_++) {
			    for (int i_229_ = -i_161_; i_229_ < 0; i_229_++) {
				int i_230_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_159_++]);
				if (i_230_ != 0) {
				    i_226_ = ((i_230_ & 0xff00ff) * i_224_
					      & ~0xff00ff);
				    i_227_ = ((i_230_ & 0xff00) * i_224_
					      & 0xff0000);
				    is[i_158_++]
					= ((i_226_ | i_227_) >>> 8) + i_155_;
				} else
				    i_158_++;
			    }
			    i_158_ += i_162_;
			    i_159_ += i_163_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_156_ == 2) {
		    if (i_154_ == 1) {
			for (int i_231_ = -i_160_; i_231_ < 0; i_231_++) {
			    for (int i_232_ = -i_161_; i_232_ < 0; i_232_++) {
				int i_233_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_159_++]);
				if (i_233_ != 0) {
				    int i_234_ = is[i_158_];
				    int i_235_ = i_233_ + i_234_;
				    int i_236_ = ((i_233_ & 0xff00ff)
						  + (i_234_ & 0xff00ff));
				    i_234_ = ((i_236_ & 0x1000100)
					      + (i_235_ - i_236_ & 0x10000));
				    is[i_158_++]
					= i_235_ - i_234_ | i_234_ - (i_234_
								      >>> 8);
				} else
				    i_158_++;
			    }
			    i_158_ += i_162_;
			    i_159_ += i_163_;
			}
		    } else if (i_154_ == 0) {
			int i_237_ = (i_155_ & 0xff0000) >> 16;
			int i_238_ = (i_155_ & 0xff00) >> 8;
			int i_239_ = i_155_ & 0xff;
			for (int i_240_ = -i_160_; i_240_ < 0; i_240_++) {
			    for (int i_241_ = -i_161_; i_241_ < 0; i_241_++) {
				int i_242_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_159_++]);
				if (i_242_ != 0) {
				    int i_243_ = ((i_242_ & 0xff0000) * i_237_
						  & ~0xffffff);
				    int i_244_ = ((i_242_ & 0xff00) * i_238_
						  & 0xff0000);
				    int i_245_
					= (i_242_ & 0xff) * i_239_ & 0xff00;
				    i_242_ = (i_243_ | i_244_ | i_245_) >>> 8;
				    int i_246_ = is[i_158_];
				    int i_247_ = i_242_ + i_246_;
				    int i_248_ = ((i_242_ & 0xff00ff)
						  + (i_246_ & 0xff00ff));
				    i_246_ = ((i_248_ & 0x1000100)
					      + (i_247_ - i_248_ & 0x10000));
				    is[i_158_++]
					= i_247_ - i_246_ | i_246_ - (i_246_
								      >>> 8);
				} else
				    i_158_++;
			    }
			    i_158_ += i_162_;
			    i_159_ += i_163_;
			}
		    } else if (i_154_ == 3) {
			for (int i_249_ = -i_160_; i_249_ < 0; i_249_++) {
			    for (int i_250_ = -i_161_; i_250_ < 0; i_250_++) {
				int i_251_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_159_++]);
				int i_252_ = i_251_ + i_155_;
				int i_253_ = ((i_251_ & 0xff00ff)
					      + (i_155_ & 0xff00ff));
				int i_254_ = ((i_253_ & 0x1000100)
					      + (i_252_ - i_253_ & 0x10000));
				i_251_ = i_252_ - i_254_ | i_254_ - (i_254_
								     >>> 8);
				i_254_ = is[i_158_];
				i_252_ = i_251_ + i_254_;
				i_253_ = (i_251_ & 0xff00ff) + (i_254_
								& 0xff00ff);
				i_254_
				    = (i_253_ & 0x1000100) + (i_252_ - i_253_
							      & 0x10000);
				is[i_158_++]
				    = i_252_ - i_254_ | i_254_ - (i_254_
								  >>> 8);
			    }
			    i_158_ += i_162_;
			    i_159_ += i_163_;
			}
		    } else if (i_154_ == 2) {
			int i_255_ = i_155_ >>> 24;
			int i_256_ = 256 - i_255_;
			int i_257_ = (i_155_ & 0xff00ff) * i_256_ & ~0xff00ff;
			int i_258_ = (i_155_ & 0xff00) * i_256_ & 0xff0000;
			i_155_ = (i_257_ | i_258_) >>> 8;
			for (int i_259_ = -i_160_; i_259_ < 0; i_259_++) {
			    for (int i_260_ = -i_161_; i_260_ < 0; i_260_++) {
				int i_261_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_159_++]);
				if (i_261_ != 0) {
				    i_257_ = ((i_261_ & 0xff00ff) * i_255_
					      & ~0xff00ff);
				    i_258_ = ((i_261_ & 0xff00) * i_255_
					      & 0xff0000);
				    i_261_
					= ((i_257_ | i_258_) >>> 8) + i_155_;
				    int i_262_ = is[i_158_];
				    int i_263_ = i_261_ + i_262_;
				    int i_264_ = ((i_261_ & 0xff00ff)
						  + (i_262_ & 0xff00ff));
				    i_262_ = ((i_264_ & 0x1000100)
					      + (i_263_ - i_264_ & 0x10000));
				    is[i_158_++]
					= i_263_ - i_262_ | i_262_ - (i_262_
								      >>> 8);
				} else
				    i_158_++;
			    }
			    i_158_ += i_162_;
			    i_159_ += i_163_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method3610(int i, int i_265_, int i_266_) {
	throw new IllegalStateException("");
    }
    
    public Interface4 method3608() {
	return new Class186(((Class168_Sub2_Sub1) this).anInt9920,
			    ((Class168_Sub2_Sub1) this).anInt9916,
			    ((Class168_Sub2_Sub1) this).anIntArray10708);
    }
    
    public void method3666(int i, int i_267_, int i_268_, int i_269_,
			   int i_270_) {
	if (((Class168_Sub2_Sub1) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    int i_271_ = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					    .aClass103_Sub2_9904)).anInt9260
			  * -1826993761);
	    i += ((Class168_Sub2_Sub1) this).anInt9907;
	    i_267_ += ((Class168_Sub2_Sub1) this).anInt9905;
	    int i_272_ = i_267_ * i_271_ + i;
	    int i_273_ = 0;
	    int i_274_ = ((Class168_Sub2_Sub1) this).anInt9916;
	    int i_275_ = ((Class168_Sub2_Sub1) this).anInt9920;
	    int i_276_ = i_271_ - i_275_;
	    int i_277_ = 0;
	    if (i_267_ < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					    .aClass103_Sub2_9904)).anInt9254
			  * -788450385)) {
		int i_278_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9254) * -788450385
			      - i_267_);
		i_274_ -= i_278_;
		i_267_ = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					    .aClass103_Sub2_9904)).anInt9254
			  * -788450385);
		i_273_ += i_278_ * i_275_;
		i_272_ += i_278_ * i_271_;
	    }
	    if (i_267_ + i_274_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_274_ -= (i_267_ + i_274_
			   - (((Class103_Sub2)
			       ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			      .anInt9252) * 1546170165);
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_279_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9249) * 1298750001
			      - i);
		i_275_ -= i_279_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_273_ += i_279_;
		i_272_ += i_279_;
		i_277_ += i_279_;
		i_276_ += i_279_;
	    }
	    if (i + i_275_ > (((Class103_Sub2)
			       ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			      .anInt9250) * 325436811) {
		int i_280_ = (i + i_275_
			      - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						   .aClass103_Sub2_9904))
				 .anInt9250) * 325436811);
		i_275_ -= i_280_;
		i_277_ += i_280_;
		i_276_ += i_280_;
	    }
	    if (i_275_ > 0 && i_274_ > 0) {
		if (i_270_ == 0) {
		    if (i_268_ == 1) {
			for (int i_281_ = -i_274_; i_281_ < 0; i_281_++) {
			    int i_282_ = i_272_ + i_275_ - 3;
			    while (i_272_ < i_282_) {
				is[i_272_++] = (((Class168_Sub2_Sub1) this)
						.anIntArray10708[i_273_++]);
				is[i_272_++] = (((Class168_Sub2_Sub1) this)
						.anIntArray10708[i_273_++]);
				is[i_272_++] = (((Class168_Sub2_Sub1) this)
						.anIntArray10708[i_273_++]);
				is[i_272_++] = (((Class168_Sub2_Sub1) this)
						.anIntArray10708[i_273_++]);
			    }
			    i_282_ += 3;
			    while (i_272_ < i_282_)
				is[i_272_++] = (((Class168_Sub2_Sub1) this)
						.anIntArray10708[i_273_++]);
			    i_272_ += i_276_;
			    i_273_ += i_277_;
			}
		    } else if (i_268_ == 0) {
			int i_283_ = (i_269_ & 0xff0000) >> 16;
			int i_284_ = (i_269_ & 0xff00) >> 8;
			int i_285_ = i_269_ & 0xff;
			for (int i_286_ = -i_274_; i_286_ < 0; i_286_++) {
			    for (int i_287_ = -i_275_; i_287_ < 0; i_287_++) {
				int i_288_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_273_++]);
				int i_289_
				    = (i_288_ & 0xff0000) * i_283_ & ~0xffffff;
				int i_290_
				    = (i_288_ & 0xff00) * i_284_ & 0xff0000;
				int i_291_ = (i_288_ & 0xff) * i_285_ & 0xff00;
				is[i_272_++]
				    = (i_289_ | i_290_ | i_291_) >>> 8;
			    }
			    i_272_ += i_276_;
			    i_273_ += i_277_;
			}
		    } else if (i_268_ == 3) {
			for (int i_292_ = -i_274_; i_292_ < 0; i_292_++) {
			    for (int i_293_ = -i_275_; i_293_ < 0; i_293_++) {
				int i_294_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_273_++]);
				int i_295_ = i_294_ + i_269_;
				int i_296_ = ((i_294_ & 0xff00ff)
					      + (i_269_ & 0xff00ff));
				int i_297_ = ((i_296_ & 0x1000100)
					      + (i_295_ - i_296_ & 0x10000));
				is[i_272_++]
				    = i_295_ - i_297_ | i_297_ - (i_297_
								  >>> 8);
			    }
			    i_272_ += i_276_;
			    i_273_ += i_277_;
			}
		    } else if (i_268_ == 2) {
			int i_298_ = i_269_ >>> 24;
			int i_299_ = 256 - i_298_;
			int i_300_ = (i_269_ & 0xff00ff) * i_299_ & ~0xff00ff;
			int i_301_ = (i_269_ & 0xff00) * i_299_ & 0xff0000;
			i_269_ = (i_300_ | i_301_) >>> 8;
			for (int i_302_ = -i_274_; i_302_ < 0; i_302_++) {
			    for (int i_303_ = -i_275_; i_303_ < 0; i_303_++) {
				int i_304_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_273_++]);
				i_300_
				    = (i_304_ & 0xff00ff) * i_298_ & ~0xff00ff;
				i_301_ = (i_304_ & 0xff00) * i_298_ & 0xff0000;
				is[i_272_++]
				    = ((i_300_ | i_301_) >>> 8) + i_269_;
			    }
			    i_272_ += i_276_;
			    i_273_ += i_277_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_270_ == 1) {
		    if (i_268_ == 1) {
			for (int i_305_ = -i_274_; i_305_ < 0; i_305_++) {
			    int i_306_ = i_272_ + i_275_ - 3;
			    while (i_272_ < i_306_) {
				int i_307_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_273_++]);
				if (i_307_ != 0)
				    is[i_272_++] = i_307_;
				else
				    i_272_++;
				i_307_ = (((Class168_Sub2_Sub1) this)
					  .anIntArray10708[i_273_++]);
				if (i_307_ != 0)
				    is[i_272_++] = i_307_;
				else
				    i_272_++;
				i_307_ = (((Class168_Sub2_Sub1) this)
					  .anIntArray10708[i_273_++]);
				if (i_307_ != 0)
				    is[i_272_++] = i_307_;
				else
				    i_272_++;
				i_307_ = (((Class168_Sub2_Sub1) this)
					  .anIntArray10708[i_273_++]);
				if (i_307_ != 0)
				    is[i_272_++] = i_307_;
				else
				    i_272_++;
			    }
			    i_306_ += 3;
			    while (i_272_ < i_306_) {
				int i_308_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_273_++]);
				if (i_308_ != 0)
				    is[i_272_++] = i_308_;
				else
				    i_272_++;
			    }
			    i_272_ += i_276_;
			    i_273_ += i_277_;
			}
		    } else if (i_268_ == 0) {
			if ((i_269_ & 0xffffff) == 16777215) {
			    int i_309_ = i_269_ >>> 24;
			    int i_310_ = 256 - i_309_;
			    for (int i_311_ = -i_274_; i_311_ < 0; i_311_++) {
				for (int i_312_ = -i_275_; i_312_ < 0;
				     i_312_++) {
				    int i_313_ = (((Class168_Sub2_Sub1) this)
						  .anIntArray10708[i_273_++]);
				    if (i_313_ != 0) {
					int i_314_ = is[i_272_];
					is[i_272_++]
					    = ((((i_313_ & 0xff00ff) * i_309_
						 + ((i_314_ & 0xff00ff)
						    * i_310_))
						& ~0xff00ff)
					       + (((i_313_ & 0xff00) * i_309_
						   + ((i_314_ & 0xff00)
						      * i_310_))
						  & 0xff0000)) >> 8;
				    } else
					i_272_++;
				}
				i_272_ += i_276_;
				i_273_ += i_277_;
			    }
			} else {
			    int i_315_ = (i_269_ & 0xff0000) >> 16;
			    int i_316_ = (i_269_ & 0xff00) >> 8;
			    int i_317_ = i_269_ & 0xff;
			    int i_318_ = i_269_ >>> 24;
			    int i_319_ = 256 - i_318_;
			    for (int i_320_ = -i_274_; i_320_ < 0; i_320_++) {
				for (int i_321_ = -i_275_; i_321_ < 0;
				     i_321_++) {
				    int i_322_ = (((Class168_Sub2_Sub1) this)
						  .anIntArray10708[i_273_++]);
				    if (i_322_ != 0) {
					if (i_318_ != 255) {
					    int i_323_
						= ((i_322_ & 0xff0000) * i_315_
						   & ~0xffffff);
					    int i_324_
						= ((i_322_ & 0xff00) * i_316_
						   & 0xff0000);
					    int i_325_
						= ((i_322_ & 0xff) * i_317_
						   & 0xff00);
					    i_322_ = (i_323_ | i_324_
						      | i_325_) >>> 8;
					    int i_326_ = is[i_272_];
					    is[i_272_++]
						= (((((i_322_ & 0xff00ff)
						      * i_318_)
						     + ((i_326_ & 0xff00ff)
							* i_319_))
						    & ~0xff00ff)
						   + ((((i_322_ & 0xff00)
							* i_318_)
						       + ((i_326_ & 0xff00)
							  * i_319_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_327_
						= ((i_322_ & 0xff0000) * i_315_
						   & ~0xffffff);
					    int i_328_
						= ((i_322_ & 0xff00) * i_316_
						   & 0xff0000);
					    int i_329_
						= ((i_322_ & 0xff) * i_317_
						   & 0xff00);
					    is[i_272_++] = (i_327_ | i_328_
							    | i_329_) >>> 8;
					}
				    } else
					i_272_++;
				}
				i_272_ += i_276_;
				i_273_ += i_277_;
			    }
			}
		    } else if (i_268_ == 3) {
			int i_330_ = i_269_ >>> 24;
			int i_331_ = 256 - i_330_;
			for (int i_332_ = -i_274_; i_332_ < 0; i_332_++) {
			    for (int i_333_ = -i_275_; i_333_ < 0; i_333_++) {
				int i_334_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_273_++]);
				int i_335_ = i_334_ + i_269_;
				int i_336_ = ((i_334_ & 0xff00ff)
					      + (i_269_ & 0xff00ff));
				int i_337_ = ((i_336_ & 0x1000100)
					      + (i_335_ - i_336_ & 0x10000));
				i_337_ = i_335_ - i_337_ | i_337_ - (i_337_
								     >>> 8);
				if (i_334_ == 0 && i_330_ != 255) {
				    i_334_ = i_337_;
				    i_337_ = is[i_272_];
				    i_337_ = ((((i_334_ & 0xff00ff) * i_330_
						+ (i_337_ & 0xff00ff) * i_331_)
					       & ~0xff00ff)
					      + (((i_334_ & 0xff00) * i_330_
						  + (i_337_ & 0xff00) * i_331_)
						 & 0xff0000)) >> 8;
				}
				is[i_272_++] = i_337_;
			    }
			    i_272_ += i_276_;
			    i_273_ += i_277_;
			}
		    } else if (i_268_ == 2) {
			int i_338_ = i_269_ >>> 24;
			int i_339_ = 256 - i_338_;
			int i_340_ = (i_269_ & 0xff00ff) * i_339_ & ~0xff00ff;
			int i_341_ = (i_269_ & 0xff00) * i_339_ & 0xff0000;
			i_269_ = (i_340_ | i_341_) >>> 8;
			for (int i_342_ = -i_274_; i_342_ < 0; i_342_++) {
			    for (int i_343_ = -i_275_; i_343_ < 0; i_343_++) {
				int i_344_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_273_++]);
				if (i_344_ != 0) {
				    i_340_ = ((i_344_ & 0xff00ff) * i_338_
					      & ~0xff00ff);
				    i_341_ = ((i_344_ & 0xff00) * i_338_
					      & 0xff0000);
				    is[i_272_++]
					= ((i_340_ | i_341_) >>> 8) + i_269_;
				} else
				    i_272_++;
			    }
			    i_272_ += i_276_;
			    i_273_ += i_277_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_270_ == 2) {
		    if (i_268_ == 1) {
			for (int i_345_ = -i_274_; i_345_ < 0; i_345_++) {
			    for (int i_346_ = -i_275_; i_346_ < 0; i_346_++) {
				int i_347_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_273_++]);
				if (i_347_ != 0) {
				    int i_348_ = is[i_272_];
				    int i_349_ = i_347_ + i_348_;
				    int i_350_ = ((i_347_ & 0xff00ff)
						  + (i_348_ & 0xff00ff));
				    i_348_ = ((i_350_ & 0x1000100)
					      + (i_349_ - i_350_ & 0x10000));
				    is[i_272_++]
					= i_349_ - i_348_ | i_348_ - (i_348_
								      >>> 8);
				} else
				    i_272_++;
			    }
			    i_272_ += i_276_;
			    i_273_ += i_277_;
			}
		    } else if (i_268_ == 0) {
			int i_351_ = (i_269_ & 0xff0000) >> 16;
			int i_352_ = (i_269_ & 0xff00) >> 8;
			int i_353_ = i_269_ & 0xff;
			for (int i_354_ = -i_274_; i_354_ < 0; i_354_++) {
			    for (int i_355_ = -i_275_; i_355_ < 0; i_355_++) {
				int i_356_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_273_++]);
				if (i_356_ != 0) {
				    int i_357_ = ((i_356_ & 0xff0000) * i_351_
						  & ~0xffffff);
				    int i_358_ = ((i_356_ & 0xff00) * i_352_
						  & 0xff0000);
				    int i_359_
					= (i_356_ & 0xff) * i_353_ & 0xff00;
				    i_356_ = (i_357_ | i_358_ | i_359_) >>> 8;
				    int i_360_ = is[i_272_];
				    int i_361_ = i_356_ + i_360_;
				    int i_362_ = ((i_356_ & 0xff00ff)
						  + (i_360_ & 0xff00ff));
				    i_360_ = ((i_362_ & 0x1000100)
					      + (i_361_ - i_362_ & 0x10000));
				    is[i_272_++]
					= i_361_ - i_360_ | i_360_ - (i_360_
								      >>> 8);
				} else
				    i_272_++;
			    }
			    i_272_ += i_276_;
			    i_273_ += i_277_;
			}
		    } else if (i_268_ == 3) {
			for (int i_363_ = -i_274_; i_363_ < 0; i_363_++) {
			    for (int i_364_ = -i_275_; i_364_ < 0; i_364_++) {
				int i_365_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_273_++]);
				int i_366_ = i_365_ + i_269_;
				int i_367_ = ((i_365_ & 0xff00ff)
					      + (i_269_ & 0xff00ff));
				int i_368_ = ((i_367_ & 0x1000100)
					      + (i_366_ - i_367_ & 0x10000));
				i_365_ = i_366_ - i_368_ | i_368_ - (i_368_
								     >>> 8);
				i_368_ = is[i_272_];
				i_366_ = i_365_ + i_368_;
				i_367_ = (i_365_ & 0xff00ff) + (i_368_
								& 0xff00ff);
				i_368_
				    = (i_367_ & 0x1000100) + (i_366_ - i_367_
							      & 0x10000);
				is[i_272_++]
				    = i_366_ - i_368_ | i_368_ - (i_368_
								  >>> 8);
			    }
			    i_272_ += i_276_;
			    i_273_ += i_277_;
			}
		    } else if (i_268_ == 2) {
			int i_369_ = i_269_ >>> 24;
			int i_370_ = 256 - i_369_;
			int i_371_ = (i_269_ & 0xff00ff) * i_370_ & ~0xff00ff;
			int i_372_ = (i_269_ & 0xff00) * i_370_ & 0xff0000;
			i_269_ = (i_371_ | i_372_) >>> 8;
			for (int i_373_ = -i_274_; i_373_ < 0; i_373_++) {
			    for (int i_374_ = -i_275_; i_374_ < 0; i_374_++) {
				int i_375_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708[i_273_++]);
				if (i_375_ != 0) {
				    i_371_ = ((i_375_ & 0xff00ff) * i_369_
					      & ~0xff00ff);
				    i_372_ = ((i_375_ & 0xff00) * i_369_
					      & 0xff0000);
				    i_375_
					= ((i_371_ | i_372_) >>> 8) + i_269_;
				    int i_376_ = is[i_272_];
				    int i_377_ = i_375_ + i_376_;
				    int i_378_ = ((i_375_ & 0xff00ff)
						  + (i_376_ & 0xff00ff));
				    i_376_ = ((i_378_ & 0x1000100)
					      + (i_377_ - i_378_ & 0x10000));
				    is[i_272_++]
					= i_377_ - i_376_ | i_376_ - (i_376_
								      >>> 8);
				} else
				    i_272_++;
			    }
			    i_272_ += i_276_;
			    i_273_ += i_277_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method16227(boolean bool, boolean bool_379_, boolean bool_380_, int i,
		     int i_381_, float f, int i_382_, int i_383_, int i_384_,
		     int i_385_, int i_386_, int i_387_, boolean bool_388_) {
	if (i_382_ > 0 && i_383_ > 0 && (bool || bool_379_)) {
	    int i_389_ = 0;
	    int i_390_ = 0;
	    int i_391_ = (((Class168_Sub2_Sub1) this).anInt9907
			  + ((Class168_Sub2_Sub1) this).anInt9920
			  + ((Class168_Sub2_Sub1) this).anInt9909);
	    int i_392_ = (((Class168_Sub2_Sub1) this).anInt9905
			  + ((Class168_Sub2_Sub1) this).anInt9916
			  + ((Class168_Sub2_Sub1) this).anInt9910);
	    int i_393_ = (i_391_ << 16) / i_382_;
	    int i_394_ = (i_392_ << 16) / i_383_;
	    if (((Class168_Sub2_Sub1) this).anInt9907 > 0) {
		int i_395_ = (((((Class168_Sub2_Sub1) this).anInt9907 << 16)
			       + i_393_ - 1)
			      / i_393_);
		i += i_395_;
		i_389_
		    += i_395_ * i_393_ - (((Class168_Sub2_Sub1) this).anInt9907
					  << 16);
	    }
	    if (((Class168_Sub2_Sub1) this).anInt9905 > 0) {
		int i_396_ = (((((Class168_Sub2_Sub1) this).anInt9905 << 16)
			       + i_394_ - 1)
			      / i_394_);
		i_381_ += i_396_;
		i_390_
		    += i_396_ * i_394_ - (((Class168_Sub2_Sub1) this).anInt9905
					  << 16);
	    }
	    if (((Class168_Sub2_Sub1) this).anInt9920 < i_391_)
		i_382_ = ((((Class168_Sub2_Sub1) this).anInt9920 << 16)
			  - i_389_ + i_393_ - 1) / i_393_;
	    if (((Class168_Sub2_Sub1) this).anInt9916 < i_392_)
		i_383_ = ((((Class168_Sub2_Sub1) this).anInt9916 << 16)
			  - i_390_ + i_394_ - 1) / i_394_;
	    int i_397_
		= i + i_381_ * ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						   .aClass103_Sub2_9904))
				 .anInt9260)
				* -1826993761);
	    int i_398_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761)
			  - i_382_);
	    if (i_381_ + i_383_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_383_ -= (i_381_ + i_383_
			   - (((Class103_Sub2)
			       ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			      .anInt9252) * 1546170165);
	    if (i_381_ < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					    .aClass103_Sub2_9904)).anInt9254
			  * -788450385)) {
		int i_399_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9254) * -788450385
			      - i_381_);
		i_383_ -= i_399_;
		i_397_
		    += i_399_ * ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						    .aClass103_Sub2_9904))
				  .anInt9260)
				 * -1826993761);
		i_390_ += i_394_ * i_399_;
	    }
	    if (i + i_382_ > (((Class103_Sub2)
			       ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			      .anInt9250) * 325436811) {
		int i_400_ = (i + i_382_
			      - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						   .aClass103_Sub2_9904))
				 .anInt9250) * 325436811);
		i_382_ -= i_400_;
		i_398_ += i_400_;
	    }
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_401_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9249) * 1298750001
			      - i);
		i_382_ -= i_401_;
		i_397_ += i_401_;
		i_389_ += i_393_ * i_401_;
		i_398_ += i_401_;
	    }
	    float[] fs = (((Class103_Sub2)
			   ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			  .aFloatArray9248);
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (i_386_ == 0) {
		if (i_384_ == 1) {
		    int i_402_ = i_389_;
		    for (int i_403_ = -i_383_; i_403_ < 0; i_403_++) {
			int i_404_ = ((i_390_ >> 16)
				      * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_405_ = -i_382_; i_405_ < 0; i_405_++) {
			    if (!bool_379_ || f < fs[i_397_]) {
				if (bool)
				    is[i_397_] = (((Class168_Sub2_Sub1) this)
						  .anIntArray10708
						  [(i_389_ >> 16) + i_404_]);
				if (bool_379_ && bool_388_)
				    fs[i_397_] = f;
			    }
			    i_389_ += i_393_;
			    i_397_++;
			}
			i_390_ += i_394_;
			i_389_ = i_402_;
			i_397_ += i_398_;
		    }
		} else if (i_384_ == 0) {
		    int i_406_ = (i_385_ & 0xff0000) >> 16;
		    int i_407_ = (i_385_ & 0xff00) >> 8;
		    int i_408_ = i_385_ & 0xff;
		    int i_409_ = i_389_;
		    for (int i_410_ = -i_383_; i_410_ < 0; i_410_++) {
			int i_411_ = ((i_390_ >> 16)
				      * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_412_ = -i_382_; i_412_ < 0; i_412_++) {
			    if (!bool_379_ || f < fs[i_397_]) {
				if (bool) {
				    int i_413_ = (((Class168_Sub2_Sub1) this)
						  .anIntArray10708
						  [(i_389_ >> 16) + i_411_]);
				    int i_414_ = ((i_413_ & 0xff0000) * i_406_
						  & ~0xffffff);
				    int i_415_ = ((i_413_ & 0xff00) * i_407_
						  & 0xff0000);
				    int i_416_
					= (i_413_ & 0xff) * i_408_ & 0xff00;
				    is[i_397_]
					= (i_414_ | i_415_ | i_416_) >>> 8;
				}
				if (bool_379_ && bool_388_)
				    fs[i_397_] = f;
			    }
			    i_389_ += i_393_;
			    i_397_++;
			}
			i_390_ += i_394_;
			i_389_ = i_409_;
			i_397_ += i_398_;
		    }
		} else if (i_384_ == 3) {
		    int i_417_ = i_389_;
		    for (int i_418_ = -i_383_; i_418_ < 0; i_418_++) {
			int i_419_ = ((i_390_ >> 16)
				      * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_420_ = -i_382_; i_420_ < 0; i_420_++) {
			    if (!bool_379_ || f < fs[i_397_]) {
				if (bool) {
				    int i_421_ = (((Class168_Sub2_Sub1) this)
						  .anIntArray10708
						  [(i_389_ >> 16) + i_419_]);
				    int i_422_ = i_421_ + i_385_;
				    int i_423_ = ((i_421_ & 0xff00ff)
						  + (i_385_ & 0xff00ff));
				    int i_424_
					= ((i_423_ & 0x1000100)
					   + (i_422_ - i_423_ & 0x10000));
				    is[i_397_]
					= i_422_ - i_424_ | i_424_ - (i_424_
								      >>> 8);
				}
				if (bool_379_ && bool_388_)
				    fs[i_397_] = f;
			    }
			    i_389_ += i_393_;
			    i_397_++;
			}
			i_390_ += i_394_;
			i_389_ = i_417_;
			i_397_ += i_398_;
		    }
		} else if (i_384_ == 2) {
		    int i_425_ = i_385_ >>> 24;
		    int i_426_ = 256 - i_425_;
		    int i_427_ = (i_385_ & 0xff00ff) * i_426_ & ~0xff00ff;
		    int i_428_ = (i_385_ & 0xff00) * i_426_ & 0xff0000;
		    i_385_ = (i_427_ | i_428_) >>> 8;
		    int i_429_ = i_389_;
		    for (int i_430_ = -i_383_; i_430_ < 0; i_430_++) {
			int i_431_ = ((i_390_ >> 16)
				      * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_432_ = -i_382_; i_432_ < 0; i_432_++) {
			    if (!bool_379_ || f < fs[i_397_]) {
				if (bool) {
				    int i_433_ = (((Class168_Sub2_Sub1) this)
						  .anIntArray10708
						  [(i_389_ >> 16) + i_431_]);
				    i_427_ = ((i_433_ & 0xff00ff) * i_425_
					      & ~0xff00ff);
				    i_428_ = ((i_433_ & 0xff00) * i_425_
					      & 0xff0000);
				    is[i_397_]
					= ((i_427_ | i_428_) >>> 8) + i_385_;
				}
				if (bool_379_ && bool_388_)
				    fs[i_397_] = f;
			    }
			    i_389_ += i_393_;
			    i_397_++;
			}
			i_390_ += i_394_;
			i_389_ = i_429_;
			i_397_ += i_398_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_386_ == 1) {
		if (i_384_ == 1) {
		    int i_434_ = i_389_;
		    for (int i_435_ = -i_383_; i_435_ < 0; i_435_++) {
			int i_436_ = ((i_390_ >> 16)
				      * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_437_ = -i_382_; i_437_ < 0; i_437_++) {
			    if (!bool_379_ || f < fs[i_397_]) {
				int i_438_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708
					      [(i_389_ >> 16) + i_436_]);
				if (i_438_ != 0) {
				    if (bool)
					is[i_397_] = i_438_;
				    if (bool_379_ && bool_388_)
					fs[i_397_] = f;
				}
			    }
			    i_389_ += i_393_;
			    i_397_++;
			}
			i_390_ += i_394_;
			i_389_ = i_434_;
			i_397_ += i_398_;
		    }
		} else if (i_384_ == 0) {
		    int i_439_ = i_389_;
		    if ((i_385_ & 0xffffff) == 16777215) {
			int i_440_ = i_385_ >>> 24;
			int i_441_ = 256 - i_440_;
			for (int i_442_ = -i_383_; i_442_ < 0; i_442_++) {
			    int i_443_
				= ((i_390_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_444_ = -i_382_; i_444_ < 0; i_444_++) {
				if (!bool_379_ || f < fs[i_397_]) {
				    int i_445_ = (((Class168_Sub2_Sub1) this)
						  .anIntArray10708
						  [(i_389_ >> 16) + i_443_]);
				    if (i_445_ != 0) {
					if (bool) {
					    int i_446_ = is[i_397_];
					    is[i_397_]
						= (((((i_445_ & 0xff00ff)
						      * i_440_)
						     + ((i_446_ & 0xff00ff)
							* i_441_))
						    & ~0xff00ff)
						   + ((((i_445_ & 0xff00)
							* i_440_)
						       + ((i_446_ & 0xff00)
							  * i_441_))
						      & 0xff0000)) >> 8;
					}
					if (bool_379_ && bool_388_)
					    fs[i_397_] = f;
				    }
				}
				i_389_ += i_393_;
				i_397_++;
			    }
			    i_390_ += i_394_;
			    i_389_ = i_439_;
			    i_397_ += i_398_;
			}
		    } else {
			int i_447_ = (i_385_ & 0xff0000) >> 16;
			int i_448_ = (i_385_ & 0xff00) >> 8;
			int i_449_ = i_385_ & 0xff;
			int i_450_ = i_385_ >>> 24;
			int i_451_ = 256 - i_450_;
			for (int i_452_ = -i_383_; i_452_ < 0; i_452_++) {
			    int i_453_
				= ((i_390_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_454_ = -i_382_; i_454_ < 0; i_454_++) {
				if (!bool_379_ || f < fs[i_397_]) {
				    int i_455_ = (((Class168_Sub2_Sub1) this)
						  .anIntArray10708
						  [(i_389_ >> 16) + i_453_]);
				    if (i_455_ != 0) {
					if (i_450_ != 255) {
					    if (bool) {
						int i_456_
						    = (((i_455_ & 0xff0000)
							* i_447_)
						       & ~0xffffff);
						int i_457_
						    = (((i_455_ & 0xff00)
							* i_448_)
						       & 0xff0000);
						int i_458_
						    = ((i_455_ & 0xff) * i_449_
						       & 0xff00);
						i_455_ = (i_456_ | i_457_
							  | i_458_) >>> 8;
						int i_459_ = is[i_397_];
						is[i_397_]
						    = (((((i_455_ & 0xff00ff)
							  * i_450_)
							 + ((i_459_ & 0xff00ff)
							    * i_451_))
							& ~0xff00ff)
						       + ((((i_455_ & 0xff00)
							    * i_450_)
							   + ((i_459_ & 0xff00)
							      * i_451_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_379_ && bool_388_)
						fs[i_397_] = f;
					} else {
					    if (bool) {
						int i_460_
						    = (((i_455_ & 0xff0000)
							* i_447_)
						       & ~0xffffff);
						int i_461_
						    = (((i_455_ & 0xff00)
							* i_448_)
						       & 0xff0000);
						int i_462_
						    = ((i_455_ & 0xff) * i_449_
						       & 0xff00);
						is[i_397_] = (i_460_ | i_461_
							      | i_462_) >>> 8;
					    }
					    if (bool_379_ && bool_388_)
						fs[i_397_] = f;
					}
				    }
				}
				i_389_ += i_393_;
				i_397_++;
			    }
			    i_390_ += i_394_;
			    i_389_ = i_439_;
			    i_397_ += i_398_;
			}
		    }
		} else if (i_384_ == 3) {
		    int i_463_ = i_389_;
		    int i_464_ = i_385_ >>> 24;
		    int i_465_ = 256 - i_464_;
		    for (int i_466_ = -i_383_; i_466_ < 0; i_466_++) {
			int i_467_ = ((i_390_ >> 16)
				      * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_468_ = -i_382_; i_468_ < 0; i_468_++) {
			    if (!bool_379_ || f < fs[i_397_]) {
				if (bool) {
				    int i_469_ = (((Class168_Sub2_Sub1) this)
						  .anIntArray10708
						  [(i_389_ >> 16) + i_467_]);
				    int i_470_ = i_469_ + i_385_;
				    int i_471_ = ((i_469_ & 0xff00ff)
						  + (i_385_ & 0xff00ff));
				    int i_472_
					= ((i_471_ & 0x1000100)
					   + (i_470_ - i_471_ & 0x10000));
				    i_472_
					= i_470_ - i_472_ | i_472_ - (i_472_
								      >>> 8);
				    if (i_469_ == 0 && i_464_ != 255) {
					i_469_ = i_472_;
					i_472_ = is[i_397_];
					i_472_
					    = ((((i_469_ & 0xff00ff) * i_464_
						 + ((i_472_ & 0xff00ff)
						    * i_465_))
						& ~0xff00ff)
					       + (((i_469_ & 0xff00) * i_464_
						   + ((i_472_ & 0xff00)
						      * i_465_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_397_] = i_472_;
				}
				if (bool_379_ && bool_388_)
				    fs[i_397_] = f;
			    }
			    i_389_ += i_393_;
			    i_397_++;
			}
			i_390_ += i_394_;
			i_389_ = i_463_;
			i_397_ += i_398_;
		    }
		} else if (i_384_ == 2) {
		    int i_473_ = i_385_ >>> 24;
		    int i_474_ = 256 - i_473_;
		    int i_475_ = (i_385_ & 0xff00ff) * i_474_ & ~0xff00ff;
		    int i_476_ = (i_385_ & 0xff00) * i_474_ & 0xff0000;
		    i_385_ = (i_475_ | i_476_) >>> 8;
		    int i_477_ = i_389_;
		    for (int i_478_ = -i_383_; i_478_ < 0; i_478_++) {
			int i_479_ = ((i_390_ >> 16)
				      * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_480_ = -i_382_; i_480_ < 0; i_480_++) {
			    if (!bool_379_ || f < fs[i_397_]) {
				int i_481_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708
					      [(i_389_ >> 16) + i_479_]);
				if (i_481_ != 0) {
				    if (bool) {
					i_475_ = ((i_481_ & 0xff00ff) * i_473_
						  & ~0xff00ff);
					i_476_ = ((i_481_ & 0xff00) * i_473_
						  & 0xff0000);
					is[i_397_] = (((i_475_ | i_476_) >>> 8)
						      + i_385_);
				    }
				    if (bool_379_ && bool_388_)
					fs[i_397_] = f;
				}
			    }
			    i_389_ += i_393_;
			    i_397_++;
			}
			i_390_ += i_394_;
			i_389_ = i_477_;
			i_397_ += i_398_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_386_ == 2) {
		if (i_384_ == 1) {
		    int i_482_ = i_389_;
		    for (int i_483_ = -i_383_; i_483_ < 0; i_483_++) {
			int i_484_ = ((i_390_ >> 16)
				      * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_485_ = -i_382_; i_485_ < 0; i_485_++) {
			    if (!bool_379_ || f < fs[i_397_]) {
				int i_486_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708
					      [(i_389_ >> 16) + i_484_]);
				if (i_486_ != 0) {
				    if (bool) {
					int i_487_ = is[i_397_];
					int i_488_ = i_486_ + i_487_;
					int i_489_ = ((i_486_ & 0xff00ff)
						      + (i_487_ & 0xff00ff));
					i_487_
					    = ((i_489_ & 0x1000100)
					       + (i_488_ - i_489_ & 0x10000));
					is[i_397_]
					    = (i_488_ - i_487_
					       | i_487_ - (i_487_ >>> 8));
				    }
				    if (bool_379_ && bool_388_)
					fs[i_397_] = f;
				}
			    }
			    i_389_ += i_393_;
			    i_397_++;
			}
			i_390_ += i_394_;
			i_389_ = i_482_;
			i_397_ += i_398_;
		    }
		} else if (i_384_ == 0) {
		    int i_490_ = i_389_;
		    int i_491_ = (i_385_ & 0xff0000) >> 16;
		    int i_492_ = (i_385_ & 0xff00) >> 8;
		    int i_493_ = i_385_ & 0xff;
		    for (int i_494_ = -i_383_; i_494_ < 0; i_494_++) {
			int i_495_ = ((i_390_ >> 16)
				      * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_496_ = -i_382_; i_496_ < 0; i_496_++) {
			    if (!bool_379_ || f < fs[i_397_]) {
				int i_497_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708
					      [(i_389_ >> 16) + i_495_]);
				if (i_497_ != 0) {
				    if (bool) {
					int i_498_
					    = ((i_497_ & 0xff0000) * i_491_
					       & ~0xffffff);
					int i_499_
					    = ((i_497_ & 0xff00) * i_492_
					       & 0xff0000);
					int i_500_ = ((i_497_ & 0xff) * i_493_
						      & 0xff00);
					i_497_
					    = (i_498_ | i_499_ | i_500_) >>> 8;
					int i_501_ = is[i_397_];
					int i_502_ = i_497_ + i_501_;
					int i_503_ = ((i_497_ & 0xff00ff)
						      + (i_501_ & 0xff00ff));
					i_501_
					    = ((i_503_ & 0x1000100)
					       + (i_502_ - i_503_ & 0x10000));
					is[i_397_]
					    = (i_502_ - i_501_
					       | i_501_ - (i_501_ >>> 8));
				    }
				    if (bool_379_ && bool_388_)
					fs[i_397_] = f;
				}
			    }
			    i_389_ += i_393_;
			    i_397_++;
			}
			i_390_ += i_394_;
			i_389_ = i_490_;
			i_397_ += i_398_;
		    }
		} else if (i_384_ == 3) {
		    int i_504_ = i_389_;
		    for (int i_505_ = -i_383_; i_505_ < 0; i_505_++) {
			int i_506_ = ((i_390_ >> 16)
				      * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_507_ = -i_382_; i_507_ < 0; i_507_++) {
			    if (!bool_379_ || f < fs[i_397_]) {
				if (bool) {
				    int i_508_ = (((Class168_Sub2_Sub1) this)
						  .anIntArray10708
						  [(i_389_ >> 16) + i_506_]);
				    int i_509_ = i_508_ + i_385_;
				    int i_510_ = ((i_508_ & 0xff00ff)
						  + (i_385_ & 0xff00ff));
				    int i_511_
					= ((i_510_ & 0x1000100)
					   + (i_509_ - i_510_ & 0x10000));
				    i_508_
					= i_509_ - i_511_ | i_511_ - (i_511_
								      >>> 8);
				    i_511_ = is[i_397_];
				    i_509_ = i_508_ + i_511_;
				    i_510_
					= (i_508_ & 0xff00ff) + (i_511_
								 & 0xff00ff);
				    i_511_ = ((i_510_ & 0x1000100)
					      + (i_509_ - i_510_ & 0x10000));
				    is[i_397_]
					= i_509_ - i_511_ | i_511_ - (i_511_
								      >>> 8);
				}
				if (bool_379_ && bool_388_)
				    fs[i_397_] = f;
			    }
			    i_389_ += i_393_;
			    i_397_++;
			}
			i_390_ += i_394_;
			i_389_ = i_504_;
			i_397_ += i_398_;
		    }
		} else if (i_384_ == 2) {
		    int i_512_ = i_385_ >>> 24;
		    int i_513_ = 256 - i_512_;
		    int i_514_ = (i_385_ & 0xff00ff) * i_513_ & ~0xff00ff;
		    int i_515_ = (i_385_ & 0xff00) * i_513_ & 0xff0000;
		    i_385_ = (i_514_ | i_515_) >>> 8;
		    int i_516_ = i_389_;
		    for (int i_517_ = -i_383_; i_517_ < 0; i_517_++) {
			int i_518_ = ((i_390_ >> 16)
				      * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_519_ = -i_382_; i_519_ < 0; i_519_++) {
			    if (!bool_379_ || f < fs[i_397_]) {
				int i_520_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708
					      [(i_389_ >> 16) + i_518_]);
				if (i_520_ != 0) {
				    if (bool) {
					i_514_ = ((i_520_ & 0xff00ff) * i_512_
						  & ~0xff00ff);
					i_515_ = ((i_520_ & 0xff00) * i_512_
						  & 0xff0000);
					i_520_ = (((i_514_ | i_515_) >>> 8)
						  + i_385_);
					int i_521_ = is[i_397_];
					int i_522_ = i_520_ + i_521_;
					int i_523_ = ((i_520_ & 0xff00ff)
						      + (i_521_ & 0xff00ff));
					i_521_
					    = ((i_523_ & 0x1000100)
					       + (i_522_ - i_523_ & 0x10000));
					is[i_397_]
					    = (i_522_ - i_521_
					       | i_521_ - (i_521_ >>> 8));
				    }
				    if (bool_379_ && bool_388_)
					fs[i_397_] = f;
				}
			    }
			    i_389_ += i_393_;
			    i_397_++;
			}
			i_390_ += i_394_;
			i_389_ = i_516_;
			i_397_ += i_398_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method3679(int i, int i_524_, Class135 class135, int i_525_,
			   int i_526_) {
	if (((Class168_Sub2_Sub1) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    i += ((Class168_Sub2_Sub1) this).anInt9907;
	    i_524_ += ((Class168_Sub2_Sub1) this).anInt9905;
	    int i_527_ = 0;
	    int i_528_ = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					    .aClass103_Sub2_9904)).anInt9260
			  * -1826993761);
	    int i_529_ = ((Class168_Sub2_Sub1) this).anInt9920;
	    int i_530_ = ((Class168_Sub2_Sub1) this).anInt9916;
	    int i_531_ = i_528_ - i_529_;
	    int i_532_ = 0;
	    int i_533_ = i + i_524_ * i_528_;
	    if (i_524_ < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					    .aClass103_Sub2_9904)).anInt9254
			  * -788450385)) {
		int i_534_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9254) * -788450385
			      - i_524_);
		i_530_ -= i_534_;
		i_524_ = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					    .aClass103_Sub2_9904)).anInt9254
			  * -788450385);
		i_527_ += i_534_ * i_529_;
		i_533_ += i_534_ * i_528_;
	    }
	    if (i_524_ + i_530_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_530_ -= (i_524_ + i_530_
			   - (((Class103_Sub2)
			       ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			      .anInt9252) * 1546170165);
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_535_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9249) * 1298750001
			      - i);
		i_529_ -= i_535_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_527_ += i_535_;
		i_533_ += i_535_;
		i_532_ += i_535_;
		i_531_ += i_535_;
	    }
	    if (i + i_529_ > (((Class103_Sub2)
			       ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			      .anInt9250) * 325436811) {
		int i_536_ = (i + i_529_
			      - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						   .aClass103_Sub2_9904))
				 .anInt9250) * 325436811);
		i_529_ -= i_536_;
		i_532_ += i_536_;
		i_531_ += i_536_;
	    }
	    if (i_529_ > 0 && i_530_ > 0) {
		Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
		int[] is_537_ = ((Class135_Sub1) class135_sub1).anIntArray9874;
		int[] is_538_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
		int i_539_ = i_524_;
		if (i_526_ > i_539_) {
		    i_539_ = i_526_;
		    i_533_ += (i_526_ - i_524_) * i_528_;
		    i_527_ += ((i_526_ - i_524_)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
		}
		int i_540_ = (i_526_ + is_537_.length < i_524_ + i_530_
			      ? i_526_ + is_537_.length : i_524_ + i_530_);
		for (int i_541_ = i_539_; i_541_ < i_540_; i_541_++) {
		    int i_542_ = is_537_[i_541_ - i_526_] + i_525_;
		    int i_543_ = is_538_[i_541_ - i_526_];
		    int i_544_ = i_529_;
		    if (i > i_542_) {
			int i_545_ = i - i_542_;
			if (i_545_ >= i_543_) {
			    i_527_ += i_529_ + i_532_;
			    i_533_ += i_529_ + i_531_;
			    continue;
			}
			i_543_ -= i_545_;
		    } else {
			int i_546_ = i_542_ - i;
			if (i_546_ >= i_529_) {
			    i_527_ += i_529_ + i_532_;
			    i_533_ += i_529_ + i_531_;
			    continue;
			}
			i_527_ += i_546_;
			i_544_ -= i_546_;
			i_533_ += i_546_;
		    }
		    int i_547_ = 0;
		    if (i_544_ < i_543_)
			i_543_ = i_544_;
		    else
			i_547_ = i_544_ - i_543_;
		    for (int i_548_ = -i_543_; i_548_ < 0; i_548_++) {
			int i_549_ = (((Class168_Sub2_Sub1) this)
				      .anIntArray10708[i_527_++]);
			if (i_549_ != 0)
			    is[i_533_++] = i_549_;
			else
			    i_533_++;
		    }
		    i_527_ += i_547_ + i_532_;
		    i_533_ += i_547_ + i_531_;
		}
	    }
	}
    }
    
    void method3670(int i, int i_550_, int i_551_, int i_552_, int i_553_,
		    int i_554_, int i_555_, int i_556_) {
	if (((Class168_Sub2_Sub1) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	if (i_551_ > 0 && i_552_ > 0) {
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (is != null) {
		int i_557_ = 0;
		int i_558_ = 0;
		int i_559_
		    = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					 .aClass103_Sub2_9904)).anInt9260
		       * -1826993761);
		int i_560_ = (((Class168_Sub2_Sub1) this).anInt9907
			      + ((Class168_Sub2_Sub1) this).anInt9920
			      + ((Class168_Sub2_Sub1) this).anInt9909);
		int i_561_ = (((Class168_Sub2_Sub1) this).anInt9905
			      + ((Class168_Sub2_Sub1) this).anInt9916
			      + ((Class168_Sub2_Sub1) this).anInt9910);
		int i_562_ = (i_560_ << 16) / i_551_;
		int i_563_ = (i_561_ << 16) / i_552_;
		if (((Class168_Sub2_Sub1) this).anInt9907 > 0) {
		    int i_564_ = ((((Class168_Sub2_Sub1) this).anInt9907 << 16)
				  + i_562_ - 1) / i_562_;
		    i += i_564_;
		    i_557_
			+= (i_564_ * i_562_
			    - (((Class168_Sub2_Sub1) this).anInt9907 << 16));
		}
		if (((Class168_Sub2_Sub1) this).anInt9905 > 0) {
		    int i_565_ = ((((Class168_Sub2_Sub1) this).anInt9905 << 16)
				  + i_563_ - 1) / i_563_;
		    i_550_ += i_565_;
		    i_558_
			+= (i_565_ * i_563_
			    - (((Class168_Sub2_Sub1) this).anInt9905 << 16));
		}
		if (((Class168_Sub2_Sub1) this).anInt9920 < i_560_)
		    i_551_ = ((((Class168_Sub2_Sub1) this).anInt9920 << 16)
			      - i_557_ + i_562_ - 1) / i_562_;
		if (((Class168_Sub2_Sub1) this).anInt9916 < i_561_)
		    i_552_ = ((((Class168_Sub2_Sub1) this).anInt9916 << 16)
			      - i_558_ + i_563_ - 1) / i_563_;
		int i_566_ = i + i_550_ * i_559_;
		int i_567_ = i_559_ - i_551_;
		if (i_550_ + i_552_
		    > (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					 .aClass103_Sub2_9904)).anInt9252
		       * 1546170165))
		    i_552_ -= (i_550_ + i_552_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						    .aClass103_Sub2_9904))
				  .anInt9252) * 1546170165);
		if (i_550_ < (((Class103_Sub2)
			       ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			      .anInt9254) * -788450385) {
		    int i_568_ = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						    .aClass103_Sub2_9904))
				  .anInt9254) * -788450385 - i_550_;
		    i_552_ -= i_568_;
		    i_566_ += i_568_ * i_559_;
		    i_558_ += i_563_ * i_568_;
		}
		if (i + i_551_ > (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811) {
		    int i_569_
			= (i + i_551_
			   - (((Class103_Sub2)
			       ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			      .anInt9250) * 325436811);
		    i_551_ -= i_569_;
		    i_567_ += i_569_;
		}
		if (i < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					   .aClass103_Sub2_9904)).anInt9249
			 * 1298750001)) {
		    int i_570_ = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						    .aClass103_Sub2_9904))
				  .anInt9249) * 1298750001 - i;
		    i_551_ -= i_570_;
		    i_566_ += i_570_;
		    i_557_ += i_562_ * i_570_;
		    i_567_ += i_570_;
		}
		if (i_555_ == 0) {
		    if (i_553_ == 1) {
			int i_571_ = i_557_;
			for (int i_572_ = -i_552_; i_572_ < 0; i_572_++) {
			    int i_573_
				= ((i_558_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_574_ = -i_551_; i_574_ < 0; i_574_++) {
				is[i_566_++] = (((Class168_Sub2_Sub1) this)
						.anIntArray10708
						[(i_557_ >> 16) + i_573_]);
				i_557_ += i_562_;
			    }
			    i_558_ += i_563_;
			    i_557_ = i_571_;
			    i_566_ += i_567_;
			}
		    } else if (i_553_ == 0) {
			int i_575_ = (i_554_ & 0xff0000) >> 16;
			int i_576_ = (i_554_ & 0xff00) >> 8;
			int i_577_ = i_554_ & 0xff;
			int i_578_ = i_557_;
			for (int i_579_ = -i_552_; i_579_ < 0; i_579_++) {
			    int i_580_
				= ((i_558_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_581_ = -i_551_; i_581_ < 0; i_581_++) {
				int i_582_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708
					      [(i_557_ >> 16) + i_580_]);
				int i_583_
				    = (i_582_ & 0xff0000) * i_575_ & ~0xffffff;
				int i_584_
				    = (i_582_ & 0xff00) * i_576_ & 0xff0000;
				int i_585_ = (i_582_ & 0xff) * i_577_ & 0xff00;
				is[i_566_++]
				    = (i_583_ | i_584_ | i_585_) >>> 8;
				i_557_ += i_562_;
			    }
			    i_558_ += i_563_;
			    i_557_ = i_578_;
			    i_566_ += i_567_;
			}
		    } else if (i_553_ == 3) {
			int i_586_ = i_557_;
			for (int i_587_ = -i_552_; i_587_ < 0; i_587_++) {
			    int i_588_
				= ((i_558_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_589_ = -i_551_; i_589_ < 0; i_589_++) {
				int i_590_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708
					      [(i_557_ >> 16) + i_588_]);
				int i_591_ = i_590_ + i_554_;
				int i_592_ = ((i_590_ & 0xff00ff)
					      + (i_554_ & 0xff00ff));
				int i_593_ = ((i_592_ & 0x1000100)
					      + (i_591_ - i_592_ & 0x10000));
				is[i_566_++]
				    = i_591_ - i_593_ | i_593_ - (i_593_
								  >>> 8);
				i_557_ += i_562_;
			    }
			    i_558_ += i_563_;
			    i_557_ = i_586_;
			    i_566_ += i_567_;
			}
		    } else if (i_553_ == 2) {
			int i_594_ = i_554_ >>> 24;
			int i_595_ = 256 - i_594_;
			int i_596_ = (i_554_ & 0xff00ff) * i_595_ & ~0xff00ff;
			int i_597_ = (i_554_ & 0xff00) * i_595_ & 0xff0000;
			i_554_ = (i_596_ | i_597_) >>> 8;
			int i_598_ = i_557_;
			for (int i_599_ = -i_552_; i_599_ < 0; i_599_++) {
			    int i_600_
				= ((i_558_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_601_ = -i_551_; i_601_ < 0; i_601_++) {
				int i_602_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708
					      [(i_557_ >> 16) + i_600_]);
				i_596_
				    = (i_602_ & 0xff00ff) * i_594_ & ~0xff00ff;
				i_597_ = (i_602_ & 0xff00) * i_594_ & 0xff0000;
				is[i_566_++]
				    = ((i_596_ | i_597_) >>> 8) + i_554_;
				i_557_ += i_562_;
			    }
			    i_558_ += i_563_;
			    i_557_ = i_598_;
			    i_566_ += i_567_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_555_ == 1) {
		    if (i_553_ == 1) {
			int i_603_ = i_557_;
			for (int i_604_ = -i_552_; i_604_ < 0; i_604_++) {
			    int i_605_
				= ((i_558_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_606_ = -i_551_; i_606_ < 0; i_606_++) {
				int i_607_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708
					      [(i_557_ >> 16) + i_605_]);
				if (i_607_ != 0)
				    is[i_566_++] = i_607_;
				else
				    i_566_++;
				i_557_ += i_562_;
			    }
			    i_558_ += i_563_;
			    i_557_ = i_603_;
			    i_566_ += i_567_;
			}
		    } else if (i_553_ == 0) {
			int i_608_ = i_557_;
			if ((i_554_ & 0xffffff) == 16777215) {
			    int i_609_ = i_554_ >>> 24;
			    int i_610_ = 256 - i_609_;
			    for (int i_611_ = -i_552_; i_611_ < 0; i_611_++) {
				int i_612_ = ((i_558_ >> 16)
					      * (((Class168_Sub2_Sub1) this)
						 .anInt9920));
				for (int i_613_ = -i_551_; i_613_ < 0;
				     i_613_++) {
				    int i_614_ = (((Class168_Sub2_Sub1) this)
						  .anIntArray10708
						  [(i_557_ >> 16) + i_612_]);
				    if (i_614_ != 0) {
					int i_615_ = is[i_566_];
					is[i_566_++]
					    = ((((i_614_ & 0xff00ff) * i_609_
						 + ((i_615_ & 0xff00ff)
						    * i_610_))
						& ~0xff00ff)
					       + (((i_614_ & 0xff00) * i_609_
						   + ((i_615_ & 0xff00)
						      * i_610_))
						  & 0xff0000)) >> 8;
				    } else
					i_566_++;
				    i_557_ += i_562_;
				}
				i_558_ += i_563_;
				i_557_ = i_608_;
				i_566_ += i_567_;
			    }
			} else {
			    int i_616_ = (i_554_ & 0xff0000) >> 16;
			    int i_617_ = (i_554_ & 0xff00) >> 8;
			    int i_618_ = i_554_ & 0xff;
			    int i_619_ = i_554_ >>> 24;
			    int i_620_ = 256 - i_619_;
			    for (int i_621_ = -i_552_; i_621_ < 0; i_621_++) {
				int i_622_ = ((i_558_ >> 16)
					      * (((Class168_Sub2_Sub1) this)
						 .anInt9920));
				for (int i_623_ = -i_551_; i_623_ < 0;
				     i_623_++) {
				    int i_624_ = (((Class168_Sub2_Sub1) this)
						  .anIntArray10708
						  [(i_557_ >> 16) + i_622_]);
				    if (i_624_ != 0) {
					if (i_619_ != 255) {
					    int i_625_
						= ((i_624_ & 0xff0000) * i_616_
						   & ~0xffffff);
					    int i_626_
						= ((i_624_ & 0xff00) * i_617_
						   & 0xff0000);
					    int i_627_
						= ((i_624_ & 0xff) * i_618_
						   & 0xff00);
					    i_624_ = (i_625_ | i_626_
						      | i_627_) >>> 8;
					    int i_628_ = is[i_566_];
					    is[i_566_++]
						= (((((i_624_ & 0xff00ff)
						      * i_619_)
						     + ((i_628_ & 0xff00ff)
							* i_620_))
						    & ~0xff00ff)
						   + ((((i_624_ & 0xff00)
							* i_619_)
						       + ((i_628_ & 0xff00)
							  * i_620_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_629_
						= ((i_624_ & 0xff0000) * i_616_
						   & ~0xffffff);
					    int i_630_
						= ((i_624_ & 0xff00) * i_617_
						   & 0xff0000);
					    int i_631_
						= ((i_624_ & 0xff) * i_618_
						   & 0xff00);
					    is[i_566_++] = (i_629_ | i_630_
							    | i_631_) >>> 8;
					}
				    } else
					i_566_++;
				    i_557_ += i_562_;
				}
				i_558_ += i_563_;
				i_557_ = i_608_;
				i_566_ += i_567_;
			    }
			}
		    } else if (i_553_ == 3) {
			int i_632_ = i_557_;
			int i_633_ = i_554_ >>> 24;
			int i_634_ = 256 - i_633_;
			for (int i_635_ = -i_552_; i_635_ < 0; i_635_++) {
			    int i_636_
				= ((i_558_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_637_ = -i_551_; i_637_ < 0; i_637_++) {
				int i_638_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708
					      [(i_557_ >> 16) + i_636_]);
				int i_639_ = i_638_ + i_554_;
				int i_640_ = ((i_638_ & 0xff00ff)
					      + (i_554_ & 0xff00ff));
				int i_641_ = ((i_640_ & 0x1000100)
					      + (i_639_ - i_640_ & 0x10000));
				i_641_ = i_639_ - i_641_ | i_641_ - (i_641_
								     >>> 8);
				if (i_638_ == 0 && i_633_ != 255) {
				    i_638_ = i_641_;
				    i_641_ = is[i_566_];
				    i_641_ = ((((i_638_ & 0xff00ff) * i_633_
						+ (i_641_ & 0xff00ff) * i_634_)
					       & ~0xff00ff)
					      + (((i_638_ & 0xff00) * i_633_
						  + (i_641_ & 0xff00) * i_634_)
						 & 0xff0000)) >> 8;
				}
				is[i_566_++] = i_641_;
				i_557_ += i_562_;
			    }
			    i_558_ += i_563_;
			    i_557_ = i_632_;
			    i_566_ += i_567_;
			}
		    } else if (i_553_ == 2) {
			int i_642_ = i_554_ >>> 24;
			int i_643_ = 256 - i_642_;
			int i_644_ = (i_554_ & 0xff00ff) * i_643_ & ~0xff00ff;
			int i_645_ = (i_554_ & 0xff00) * i_643_ & 0xff0000;
			i_554_ = (i_644_ | i_645_) >>> 8;
			int i_646_ = i_557_;
			for (int i_647_ = -i_552_; i_647_ < 0; i_647_++) {
			    int i_648_
				= ((i_558_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_649_ = -i_551_; i_649_ < 0; i_649_++) {
				int i_650_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708
					      [(i_557_ >> 16) + i_648_]);
				if (i_650_ != 0) {
				    i_644_ = ((i_650_ & 0xff00ff) * i_642_
					      & ~0xff00ff);
				    i_645_ = ((i_650_ & 0xff00) * i_642_
					      & 0xff0000);
				    is[i_566_++]
					= ((i_644_ | i_645_) >>> 8) + i_554_;
				} else
				    i_566_++;
				i_557_ += i_562_;
			    }
			    i_558_ += i_563_;
			    i_557_ = i_646_;
			    i_566_ += i_567_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_555_ == 2) {
		    if (i_553_ == 1) {
			int i_651_ = i_557_;
			for (int i_652_ = -i_552_; i_652_ < 0; i_652_++) {
			    int i_653_
				= ((i_558_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_654_ = -i_551_; i_654_ < 0; i_654_++) {
				int i_655_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708
					      [(i_557_ >> 16) + i_653_]);
				if (i_655_ != 0) {
				    int i_656_ = is[i_566_];
				    int i_657_ = i_655_ + i_656_;
				    int i_658_ = ((i_655_ & 0xff00ff)
						  + (i_656_ & 0xff00ff));
				    i_656_ = ((i_658_ & 0x1000100)
					      + (i_657_ - i_658_ & 0x10000));
				    is[i_566_++]
					= i_657_ - i_656_ | i_656_ - (i_656_
								      >>> 8);
				} else
				    i_566_++;
				i_557_ += i_562_;
			    }
			    i_558_ += i_563_;
			    i_557_ = i_651_;
			    i_566_ += i_567_;
			}
		    } else if (i_553_ == 0) {
			int i_659_ = i_557_;
			int i_660_ = (i_554_ & 0xff0000) >> 16;
			int i_661_ = (i_554_ & 0xff00) >> 8;
			int i_662_ = i_554_ & 0xff;
			for (int i_663_ = -i_552_; i_663_ < 0; i_663_++) {
			    int i_664_
				= ((i_558_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_665_ = -i_551_; i_665_ < 0; i_665_++) {
				int i_666_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708
					      [(i_557_ >> 16) + i_664_]);
				if (i_666_ != 0) {
				    int i_667_ = ((i_666_ & 0xff0000) * i_660_
						  & ~0xffffff);
				    int i_668_ = ((i_666_ & 0xff00) * i_661_
						  & 0xff0000);
				    int i_669_
					= (i_666_ & 0xff) * i_662_ & 0xff00;
				    i_666_ = (i_667_ | i_668_ | i_669_) >>> 8;
				    int i_670_ = is[i_566_];
				    int i_671_ = i_666_ + i_670_;
				    int i_672_ = ((i_666_ & 0xff00ff)
						  + (i_670_ & 0xff00ff));
				    i_670_ = ((i_672_ & 0x1000100)
					      + (i_671_ - i_672_ & 0x10000));
				    is[i_566_++]
					= i_671_ - i_670_ | i_670_ - (i_670_
								      >>> 8);
				} else
				    i_566_++;
				i_557_ += i_562_;
			    }
			    i_558_ += i_563_;
			    i_557_ = i_659_;
			    i_566_ += i_567_;
			}
		    } else if (i_553_ == 3) {
			int i_673_ = i_557_;
			for (int i_674_ = -i_552_; i_674_ < 0; i_674_++) {
			    int i_675_
				= ((i_558_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_676_ = -i_551_; i_676_ < 0; i_676_++) {
				int i_677_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708
					      [(i_557_ >> 16) + i_675_]);
				int i_678_ = i_677_ + i_554_;
				int i_679_ = ((i_677_ & 0xff00ff)
					      + (i_554_ & 0xff00ff));
				int i_680_ = ((i_679_ & 0x1000100)
					      + (i_678_ - i_679_ & 0x10000));
				i_677_ = i_678_ - i_680_ | i_680_ - (i_680_
								     >>> 8);
				i_680_ = is[i_566_];
				i_678_ = i_677_ + i_680_;
				i_679_ = (i_677_ & 0xff00ff) + (i_680_
								& 0xff00ff);
				i_680_
				    = (i_679_ & 0x1000100) + (i_678_ - i_679_
							      & 0x10000);
				is[i_566_++]
				    = i_678_ - i_680_ | i_680_ - (i_680_
								  >>> 8);
				i_557_ += i_562_;
			    }
			    i_558_ += i_563_;
			    i_557_ = i_673_;
			    i_566_ += i_567_;
			}
		    } else if (i_553_ == 2) {
			int i_681_ = i_554_ >>> 24;
			int i_682_ = 256 - i_681_;
			int i_683_ = (i_554_ & 0xff00ff) * i_682_ & ~0xff00ff;
			int i_684_ = (i_554_ & 0xff00) * i_682_ & 0xff0000;
			i_554_ = (i_683_ | i_684_) >>> 8;
			int i_685_ = i_557_;
			for (int i_686_ = -i_552_; i_686_ < 0; i_686_++) {
			    int i_687_
				= ((i_558_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_688_ = -i_551_; i_688_ < 0; i_688_++) {
				int i_689_ = (((Class168_Sub2_Sub1) this)
					      .anIntArray10708
					      [(i_557_ >> 16) + i_687_]);
				if (i_689_ != 0) {
				    i_683_ = ((i_689_ & 0xff00ff) * i_681_
					      & ~0xff00ff);
				    i_684_ = ((i_689_ & 0xff00) * i_681_
					      & 0xff0000);
				    i_689_
					= ((i_683_ | i_684_) >>> 8) + i_554_;
				    int i_690_ = is[i_566_];
				    int i_691_ = i_689_ + i_690_;
				    int i_692_ = ((i_689_ & 0xff00ff)
						  + (i_690_ & 0xff00ff));
				    i_690_ = ((i_692_ & 0x1000100)
					      + (i_691_ - i_692_ & 0x10000));
				    is[i_566_++]
					= i_691_ - i_690_ | i_690_ - (i_690_
								      >>> 8);
				} else
				    i_566_++;
				i_557_ += i_562_;
			    }
			    i_558_ += i_563_;
			    i_557_ = i_685_;
			    i_566_ += i_567_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method16216(int i, int i_693_) {
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_694_ = anInt9919;
		    while (i_694_ < 0) {
			int i_695_ = anInt9925;
			int i_696_ = anInt9927;
			int i_697_ = anInt9928;
			int i_698_ = anInt9906;
			if (i_696_ >= 0 && i_697_ >= 0
			    && i_696_ - (((Class168_Sub2_Sub1) this).anInt9920
					 << 12) < 0
			    && i_697_ - (((Class168_Sub2_Sub1) this).anInt9916
					 << 12) < 0) {
			    for (/**/; i_698_ < 0; i_698_++)
				method16968(((i_697_ >> 12)
					     * (((Class168_Sub2_Sub1) this)
						.anInt9920)) + (i_696_ >> 12),
					    i_695_++, is, i, i_693_);
			}
			i_694_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_699_ = anInt9919;
		    while (i_699_ < 0) {
			int i_700_ = anInt9925;
			int i_701_ = anInt9927;
			int i_702_ = anInt9928 + anInt9930;
			int i_703_ = anInt9906;
			if (i_701_ >= 0
			    && i_701_ - (((Class168_Sub2_Sub1) this).anInt9920
					 << 12) < 0) {
			    int i_704_;
			    if ((i_704_
				 = (i_702_
				    - (((Class168_Sub2_Sub1) this).anInt9916
				       << 12)))
				>= 0) {
				i_704_ = (anInt9922 - i_704_) / anInt9922;
				i_703_ += i_704_;
				i_702_ += anInt9922 * i_704_;
				i_700_ += i_704_;
			    }
			    if ((i_704_ = (i_702_ - anInt9922) / anInt9922)
				> i_703_)
				i_703_ = i_704_;
			    for (/**/; i_703_ < 0; i_703_++) {
				method16968(((i_702_ >> 12)
					     * (((Class168_Sub2_Sub1) this)
						.anInt9920)) + (i_701_ >> 12),
					    i_700_++, is, i, i_693_);
				i_702_ += anInt9922;
			    }
			}
			i_699_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_705_ = anInt9919;
		    while (i_705_ < 0) {
			int i_706_ = anInt9925;
			int i_707_ = anInt9927;
			int i_708_ = anInt9928 + anInt9930;
			int i_709_ = anInt9906;
			if (i_707_ >= 0
			    && i_707_ - (((Class168_Sub2_Sub1) this).anInt9920
					 << 12) < 0) {
			    if (i_708_ < 0) {
				int i_710_
				    = (anInt9922 - 1 - i_708_) / anInt9922;
				i_709_ += i_710_;
				i_708_ += anInt9922 * i_710_;
				i_706_ += i_710_;
			    }
			    int i_711_;
			    if ((i_711_
				 = (1 + i_708_
				    - (((Class168_Sub2_Sub1) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_709_)
				i_709_ = i_711_;
			    for (/**/; i_709_ < 0; i_709_++) {
				method16968(((i_708_ >> 12)
					     * (((Class168_Sub2_Sub1) this)
						.anInt9920)) + (i_707_ >> 12),
					    i_706_++, is, i, i_693_);
				i_708_ += anInt9922;
			    }
			}
			i_705_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_712_ = anInt9919;
		    while (i_712_ < 0) {
			int i_713_ = anInt9925;
			int i_714_ = anInt9927 + anInt9929;
			int i_715_ = anInt9928;
			int i_716_ = anInt9906;
			if (i_715_ >= 0
			    && i_715_ - (((Class168_Sub2_Sub1) this).anInt9916
					 << 12) < 0) {
			    int i_717_;
			    if ((i_717_
				 = (i_714_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)))
				>= 0) {
				i_717_ = (anInt9921 - i_717_) / anInt9921;
				i_716_ += i_717_;
				i_714_ += anInt9921 * i_717_;
				i_713_ += i_717_;
			    }
			    if ((i_717_ = (i_714_ - anInt9921) / anInt9921)
				> i_716_)
				i_716_ = i_717_;
			    for (/**/; i_716_ < 0; i_716_++) {
				method16968(((i_715_ >> 12)
					     * (((Class168_Sub2_Sub1) this)
						.anInt9920)) + (i_714_ >> 12),
					    i_713_++, is, i, i_693_);
				i_714_ += anInt9921;
			    }
			}
			i_712_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_718_ = anInt9919;
		    while (i_718_ < 0) {
			int i_719_ = anInt9925;
			int i_720_ = anInt9927 + anInt9929;
			int i_721_ = anInt9928 + anInt9930;
			int i_722_ = anInt9906;
			int i_723_;
			if ((i_723_
			     = i_720_ - (((Class168_Sub2_Sub1) this).anInt9920
					 << 12))
			    >= 0) {
			    i_723_ = (anInt9921 - i_723_) / anInt9921;
			    i_722_ += i_723_;
			    i_720_ += anInt9921 * i_723_;
			    i_721_ += anInt9922 * i_723_;
			    i_719_ += i_723_;
			}
			if ((i_723_ = (i_720_ - anInt9921) / anInt9921)
			    > i_722_)
			    i_722_ = i_723_;
			if ((i_723_
			     = i_721_ - (((Class168_Sub2_Sub1) this).anInt9916
					 << 12))
			    >= 0) {
			    i_723_ = (anInt9922 - i_723_) / anInt9922;
			    i_722_ += i_723_;
			    i_720_ += anInt9921 * i_723_;
			    i_721_ += anInt9922 * i_723_;
			    i_719_ += i_723_;
			}
			if ((i_723_ = (i_721_ - anInt9922) / anInt9922)
			    > i_722_)
			    i_722_ = i_723_;
			for (/**/; i_722_ < 0; i_722_++) {
			    method16968(((i_721_ >> 12) * ((Class168_Sub2_Sub1)
							   this).anInt9920
					 + (i_720_ >> 12)),
					i_719_++, is, i, i_693_);
			    i_720_ += anInt9921;
			    i_721_ += anInt9922;
			}
			i_718_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_724_ = anInt9919;
		    while (i_724_ < 0) {
			int i_725_ = anInt9925;
			int i_726_ = anInt9927 + anInt9929;
			int i_727_ = anInt9928 + anInt9930;
			int i_728_ = anInt9906;
			int i_729_;
			if ((i_729_
			     = i_726_ - (((Class168_Sub2_Sub1) this).anInt9920
					 << 12))
			    >= 0) {
			    i_729_ = (anInt9921 - i_729_) / anInt9921;
			    i_728_ += i_729_;
			    i_726_ += anInt9921 * i_729_;
			    i_727_ += anInt9922 * i_729_;
			    i_725_ += i_729_;
			}
			if ((i_729_ = (i_726_ - anInt9921) / anInt9921)
			    > i_728_)
			    i_728_ = i_729_;
			if (i_727_ < 0) {
			    i_729_ = (anInt9922 - 1 - i_727_) / anInt9922;
			    i_728_ += i_729_;
			    i_726_ += anInt9921 * i_729_;
			    i_727_ += anInt9922 * i_729_;
			    i_725_ += i_729_;
			}
			if ((i_729_
			     = (1 + i_727_
				- (((Class168_Sub2_Sub1) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_728_)
			    i_728_ = i_729_;
			for (/**/; i_728_ < 0; i_728_++) {
			    method16968(((i_727_ >> 12) * ((Class168_Sub2_Sub1)
							   this).anInt9920
					 + (i_726_ >> 12)),
					i_725_++, is, i, i_693_);
			    i_726_ += anInt9921;
			    i_727_ += anInt9922;
			}
			i_724_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_730_ = anInt9919;
		while (i_730_ < 0) {
		    int i_731_ = anInt9925;
		    int i_732_ = anInt9927 + anInt9929;
		    int i_733_ = anInt9928;
		    int i_734_ = anInt9906;
		    if (i_733_ >= 0
			&& i_733_ - (((Class168_Sub2_Sub1) this).anInt9916
				     << 12) < 0) {
			if (i_732_ < 0) {
			    int i_735_ = (anInt9921 - 1 - i_732_) / anInt9921;
			    i_734_ += i_735_;
			    i_732_ += anInt9921 * i_735_;
			    i_731_ += i_735_;
			}
			int i_736_;
			if ((i_736_
			     = (1 + i_732_
				- (((Class168_Sub2_Sub1) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_734_)
			    i_734_ = i_736_;
			for (/**/; i_734_ < 0; i_734_++) {
			    method16968(((i_733_ >> 12) * ((Class168_Sub2_Sub1)
							   this).anInt9920
					 + (i_732_ >> 12)),
					i_731_++, is, i, i_693_);
			    i_732_ += anInt9921;
			}
		    }
		    i_730_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		for (int i_737_ = anInt9919; i_737_ < 0; i_737_++) {
		    int i_738_ = anInt9925;
		    int i_739_ = anInt9927 + anInt9929;
		    int i_740_ = anInt9928 + anInt9930;
		    int i_741_ = anInt9906;
		    if (i_739_ < 0) {
			int i_742_ = (anInt9921 - 1 - i_739_) / anInt9921;
			i_741_ += i_742_;
			i_739_ += anInt9921 * i_742_;
			i_740_ += anInt9922 * i_742_;
			i_738_ += i_742_;
		    }
		    int i_743_;
		    if ((i_743_
			 = (1 + i_739_
			    - (((Class168_Sub2_Sub1) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_741_)
			i_741_ = i_743_;
		    if ((i_743_
			 = i_740_ - (((Class168_Sub2_Sub1) this).anInt9916
				     << 12))
			>= 0) {
			i_743_ = (anInt9922 - i_743_) / anInt9922;
			i_741_ += i_743_;
			i_739_ += anInt9921 * i_743_;
			i_740_ += anInt9922 * i_743_;
			i_738_ += i_743_;
		    }
		    if ((i_743_ = (i_740_ - anInt9922) / anInt9922) > i_741_)
			i_741_ = i_743_;
		    for (/**/; i_741_ < 0; i_741_++) {
			method16968((((i_740_ >> 12)
				      * ((Class168_Sub2_Sub1) this).anInt9920)
				     + (i_739_ >> 12)),
				    i_738_++, is, i, i_693_);
			i_739_ += anInt9921;
			i_740_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		for (int i_744_ = anInt9919; i_744_ < 0; i_744_++) {
		    int i_745_ = anInt9925;
		    int i_746_ = anInt9927 + anInt9929;
		    int i_747_ = anInt9928 + anInt9930;
		    int i_748_ = anInt9906;
		    if (i_746_ < 0) {
			int i_749_ = (anInt9921 - 1 - i_746_) / anInt9921;
			i_748_ += i_749_;
			i_746_ += anInt9921 * i_749_;
			i_747_ += anInt9922 * i_749_;
			i_745_ += i_749_;
		    }
		    int i_750_;
		    if ((i_750_
			 = (1 + i_746_
			    - (((Class168_Sub2_Sub1) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_748_)
			i_748_ = i_750_;
		    if (i_747_ < 0) {
			i_750_ = (anInt9922 - 1 - i_747_) / anInt9922;
			i_748_ += i_750_;
			i_746_ += anInt9921 * i_750_;
			i_747_ += anInt9922 * i_750_;
			i_745_ += i_750_;
		    }
		    if ((i_750_
			 = (1 + i_747_
			    - (((Class168_Sub2_Sub1) this).anInt9916 << 12)
			    - anInt9922) / anInt9922)
			> i_748_)
			i_748_ = i_750_;
		    for (/**/; i_748_ < 0; i_748_++) {
			method16968((((i_747_ >> 12)
				      * ((Class168_Sub2_Sub1) this).anInt9920)
				     + (i_746_ >> 12)),
				    i_745_++, is, i, i_693_);
			i_746_ += anInt9921;
			i_747_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    void method16217(int[] is, int[] is_751_, int i, int i_752_) {
	int[] is_753_ = (((Class103_Sub2)
			  ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			 .anIntArray9245);
	if (is_753_ != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_754_ = anInt9919;
		    while (i_754_ < 0) {
			int i_755_ = i_754_ + i_752_;
			if (i_755_ >= 0) {
			    if (i_755_ >= is.length)
				break;
			    int i_756_ = anInt9925;
			    int i_757_ = anInt9927;
			    int i_758_ = anInt9928;
			    int i_759_ = anInt9906;
			    if (i_757_ >= 0 && i_758_ >= 0
				&& (i_757_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)) < 0
				&& (i_758_
				    - (((Class168_Sub2_Sub1) this).anInt9916
				       << 12)) < 0) {
				int i_760_ = is[i_755_] - i;
				int i_761_ = -is_751_[i_755_];
				int i_762_ = i_760_ - (i_756_ - anInt9925);
				if (i_762_ > 0) {
				    i_756_ += i_762_;
				    i_759_ += i_762_;
				    i_757_ += anInt9921 * i_762_;
				    i_758_ += anInt9922 * i_762_;
				} else
				    i_761_ -= i_762_;
				if (i_759_ < i_761_)
				    i_759_ = i_761_;
				for (/**/; i_759_ < 0; i_759_++) {
				    int i_763_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(((i_758_ >> 12)
					      * (((Class168_Sub2_Sub1) this)
						 .anInt9920))
					     + (i_757_ >> 12))]);
				    if (i_763_ != 0)
					is_753_[i_756_++] = i_763_;
				    else
					i_756_++;
				}
			    }
			}
			i_754_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_764_ = anInt9919;
		    while (i_764_ < 0) {
			int i_765_ = i_764_ + i_752_;
			if (i_765_ >= 0) {
			    if (i_765_ >= is.length)
				break;
			    int i_766_ = anInt9925;
			    int i_767_ = anInt9927;
			    int i_768_ = anInt9928 + anInt9930;
			    int i_769_ = anInt9906;
			    if (i_767_ >= 0
				&& (i_767_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)) < 0) {
				int i_770_;
				if ((i_770_
				     = i_768_ - ((((Class168_Sub2_Sub1) this)
						  .anInt9916)
						 << 12))
				    >= 0) {
				    i_770_ = (anInt9922 - i_770_) / anInt9922;
				    i_769_ += i_770_;
				    i_768_ += anInt9922 * i_770_;
				    i_766_ += i_770_;
				}
				if ((i_770_ = (i_768_ - anInt9922) / anInt9922)
				    > i_769_)
				    i_769_ = i_770_;
				int i_771_ = is[i_765_] - i;
				int i_772_ = -is_751_[i_765_];
				int i_773_ = i_771_ - (i_766_ - anInt9925);
				if (i_773_ > 0) {
				    i_766_ += i_773_;
				    i_769_ += i_773_;
				    i_767_ += anInt9921 * i_773_;
				    i_768_ += anInt9922 * i_773_;
				} else
				    i_772_ -= i_773_;
				if (i_769_ < i_772_)
				    i_769_ = i_772_;
				for (/**/; i_769_ < 0; i_769_++) {
				    int i_774_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(((i_768_ >> 12)
					      * (((Class168_Sub2_Sub1) this)
						 .anInt9920))
					     + (i_767_ >> 12))]);
				    if (i_774_ != 0)
					is_753_[i_766_++] = i_774_;
				    else
					i_766_++;
				    i_768_ += anInt9922;
				}
			    }
			}
			i_764_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_775_ = anInt9919;
		    while (i_775_ < 0) {
			int i_776_ = i_775_ + i_752_;
			if (i_776_ >= 0) {
			    if (i_776_ >= is.length)
				break;
			    int i_777_ = anInt9925;
			    int i_778_ = anInt9927;
			    int i_779_ = anInt9928 + anInt9930;
			    int i_780_ = anInt9906;
			    if (i_778_ >= 0
				&& (i_778_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)) < 0) {
				if (i_779_ < 0) {
				    int i_781_
					= (anInt9922 - 1 - i_779_) / anInt9922;
				    i_780_ += i_781_;
				    i_779_ += anInt9922 * i_781_;
				    i_777_ += i_781_;
				}
				int i_782_;
				if ((i_782_ = (1 + i_779_
					       - ((((Class168_Sub2_Sub1) this)
						   .anInt9916)
						  << 12)
					       - anInt9922) / anInt9922)
				    > i_780_)
				    i_780_ = i_782_;
				int i_783_ = is[i_776_] - i;
				int i_784_ = -is_751_[i_776_];
				int i_785_ = i_783_ - (i_777_ - anInt9925);
				if (i_785_ > 0) {
				    i_777_ += i_785_;
				    i_780_ += i_785_;
				    i_778_ += anInt9921 * i_785_;
				    i_779_ += anInt9922 * i_785_;
				} else
				    i_784_ -= i_785_;
				if (i_780_ < i_784_)
				    i_780_ = i_784_;
				for (/**/; i_780_ < 0; i_780_++) {
				    int i_786_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(((i_779_ >> 12)
					      * (((Class168_Sub2_Sub1) this)
						 .anInt9920))
					     + (i_778_ >> 12))]);
				    if (i_786_ != 0)
					is_753_[i_777_++] = i_786_;
				    else
					i_777_++;
				    i_779_ += anInt9922;
				}
			    }
			}
			i_775_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_787_ = anInt9919;
		    while (i_787_ < 0) {
			int i_788_ = i_787_ + i_752_;
			if (i_788_ >= 0) {
			    if (i_788_ >= is.length)
				break;
			    int i_789_ = anInt9925;
			    int i_790_ = anInt9927 + anInt9929;
			    int i_791_ = anInt9928;
			    int i_792_ = anInt9906;
			    if (i_791_ >= 0
				&& (i_791_
				    - (((Class168_Sub2_Sub1) this).anInt9916
				       << 12)) < 0) {
				int i_793_;
				if ((i_793_
				     = i_790_ - ((((Class168_Sub2_Sub1) this)
						  .anInt9920)
						 << 12))
				    >= 0) {
				    i_793_ = (anInt9921 - i_793_) / anInt9921;
				    i_792_ += i_793_;
				    i_790_ += anInt9921 * i_793_;
				    i_789_ += i_793_;
				}
				if ((i_793_ = (i_790_ - anInt9921) / anInt9921)
				    > i_792_)
				    i_792_ = i_793_;
				int i_794_ = is[i_788_] - i;
				int i_795_ = -is_751_[i_788_];
				int i_796_ = i_794_ - (i_789_ - anInt9925);
				if (i_796_ > 0) {
				    i_789_ += i_796_;
				    i_792_ += i_796_;
				    i_790_ += anInt9921 * i_796_;
				    i_791_ += anInt9922 * i_796_;
				} else
				    i_795_ -= i_796_;
				if (i_792_ < i_795_)
				    i_792_ = i_795_;
				for (/**/; i_792_ < 0; i_792_++) {
				    int i_797_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(((i_791_ >> 12)
					      * (((Class168_Sub2_Sub1) this)
						 .anInt9920))
					     + (i_790_ >> 12))]);
				    if (i_797_ != 0)
					is_753_[i_789_++] = i_797_;
				    else
					i_789_++;
				    i_790_ += anInt9921;
				}
			    }
			}
			i_787_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_798_ = anInt9919;
		    while (i_798_ < 0) {
			int i_799_ = i_798_ + i_752_;
			if (i_799_ >= 0) {
			    if (i_799_ >= is.length)
				break;
			    int i_800_ = anInt9925;
			    int i_801_ = anInt9927 + anInt9929;
			    int i_802_ = anInt9928 + anInt9930;
			    int i_803_ = anInt9906;
			    int i_804_;
			    if ((i_804_
				 = (i_801_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)))
				>= 0) {
				i_804_ = (anInt9921 - i_804_) / anInt9921;
				i_803_ += i_804_;
				i_801_ += anInt9921 * i_804_;
				i_802_ += anInt9922 * i_804_;
				i_800_ += i_804_;
			    }
			    if ((i_804_ = (i_801_ - anInt9921) / anInt9921)
				> i_803_)
				i_803_ = i_804_;
			    if ((i_804_
				 = (i_802_
				    - (((Class168_Sub2_Sub1) this).anInt9916
				       << 12)))
				>= 0) {
				i_804_ = (anInt9922 - i_804_) / anInt9922;
				i_803_ += i_804_;
				i_801_ += anInt9921 * i_804_;
				i_802_ += anInt9922 * i_804_;
				i_800_ += i_804_;
			    }
			    if ((i_804_ = (i_802_ - anInt9922) / anInt9922)
				> i_803_)
				i_803_ = i_804_;
			    int i_805_ = is[i_799_] - i;
			    int i_806_ = -is_751_[i_799_];
			    int i_807_ = i_805_ - (i_800_ - anInt9925);
			    if (i_807_ > 0) {
				i_800_ += i_807_;
				i_803_ += i_807_;
				i_801_ += anInt9921 * i_807_;
				i_802_ += anInt9922 * i_807_;
			    } else
				i_806_ -= i_807_;
			    if (i_803_ < i_806_)
				i_803_ = i_806_;
			    for (/**/; i_803_ < 0; i_803_++) {
				int i_808_
				    = (((Class168_Sub2_Sub1) this)
				       .anIntArray10708
				       [((i_802_ >> 12) * ((Class168_Sub2_Sub1)
							   this).anInt9920
					 + (i_801_ >> 12))]);
				if (i_808_ != 0)
				    is_753_[i_800_++] = i_808_;
				else
				    i_800_++;
				i_801_ += anInt9921;
				i_802_ += anInt9922;
			    }
			}
			i_798_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_809_ = anInt9919;
		    while (i_809_ < 0) {
			int i_810_ = i_809_ + i_752_;
			if (i_810_ >= 0) {
			    if (i_810_ >= is.length)
				break;
			    int i_811_ = anInt9925;
			    int i_812_ = anInt9927 + anInt9929;
			    int i_813_ = anInt9928 + anInt9930;
			    int i_814_ = anInt9906;
			    int i_815_;
			    if ((i_815_
				 = (i_812_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)))
				>= 0) {
				i_815_ = (anInt9921 - i_815_) / anInt9921;
				i_814_ += i_815_;
				i_812_ += anInt9921 * i_815_;
				i_813_ += anInt9922 * i_815_;
				i_811_ += i_815_;
			    }
			    if ((i_815_ = (i_812_ - anInt9921) / anInt9921)
				> i_814_)
				i_814_ = i_815_;
			    if (i_813_ < 0) {
				i_815_ = (anInt9922 - 1 - i_813_) / anInt9922;
				i_814_ += i_815_;
				i_812_ += anInt9921 * i_815_;
				i_813_ += anInt9922 * i_815_;
				i_811_ += i_815_;
			    }
			    if ((i_815_
				 = (1 + i_813_
				    - (((Class168_Sub2_Sub1) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_814_)
				i_814_ = i_815_;
			    int i_816_ = is[i_810_] - i;
			    int i_817_ = -is_751_[i_810_];
			    int i_818_ = i_816_ - (i_811_ - anInt9925);
			    if (i_818_ > 0) {
				i_811_ += i_818_;
				i_814_ += i_818_;
				i_812_ += anInt9921 * i_818_;
				i_813_ += anInt9922 * i_818_;
			    } else
				i_817_ -= i_818_;
			    if (i_814_ < i_817_)
				i_814_ = i_817_;
			    for (/**/; i_814_ < 0; i_814_++) {
				int i_819_
				    = (((Class168_Sub2_Sub1) this)
				       .anIntArray10708
				       [((i_813_ >> 12) * ((Class168_Sub2_Sub1)
							   this).anInt9920
					 + (i_812_ >> 12))]);
				if (i_819_ != 0)
				    is_753_[i_811_++] = i_819_;
				else
				    i_811_++;
				i_812_ += anInt9921;
				i_813_ += anInt9922;
			    }
			}
			i_809_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_820_ = anInt9919;
		while (i_820_ < 0) {
		    int i_821_ = i_820_ + i_752_;
		    if (i_821_ >= 0) {
			if (i_821_ >= is.length)
			    break;
			int i_822_ = anInt9925;
			int i_823_ = anInt9927 + anInt9929;
			int i_824_ = anInt9928;
			int i_825_ = anInt9906;
			if (i_824_ >= 0
			    && i_824_ - (((Class168_Sub2_Sub1) this).anInt9916
					 << 12) < 0) {
			    if (i_823_ < 0) {
				int i_826_
				    = (anInt9921 - 1 - i_823_) / anInt9921;
				i_825_ += i_826_;
				i_823_ += anInt9921 * i_826_;
				i_822_ += i_826_;
			    }
			    int i_827_;
			    if ((i_827_
				 = (1 + i_823_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)
				    - anInt9921) / anInt9921)
				> i_825_)
				i_825_ = i_827_;
			    int i_828_ = is[i_821_] - i;
			    int i_829_ = -is_751_[i_821_];
			    int i_830_ = i_828_ - (i_822_ - anInt9925);
			    if (i_830_ > 0) {
				i_822_ += i_830_;
				i_825_ += i_830_;
				i_823_ += anInt9921 * i_830_;
				i_824_ += anInt9922 * i_830_;
			    } else
				i_829_ -= i_830_;
			    if (i_825_ < i_829_)
				i_825_ = i_829_;
			    for (/**/; i_825_ < 0; i_825_++) {
				int i_831_
				    = (((Class168_Sub2_Sub1) this)
				       .anIntArray10708
				       [((i_824_ >> 12) * ((Class168_Sub2_Sub1)
							   this).anInt9920
					 + (i_823_ >> 12))]);
				if (i_831_ != 0)
				    is_753_[i_822_++] = i_831_;
				else
				    i_822_++;
				i_823_ += anInt9921;
			    }
			}
		    }
		    i_820_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		int i_832_ = anInt9919;
		while (i_832_ < 0) {
		    int i_833_ = i_832_ + i_752_;
		    if (i_833_ >= 0) {
			if (i_833_ >= is.length)
			    break;
			int i_834_ = anInt9925;
			int i_835_ = anInt9927 + anInt9929;
			int i_836_ = anInt9928 + anInt9930;
			int i_837_ = anInt9906;
			if (i_835_ < 0) {
			    int i_838_ = (anInt9921 - 1 - i_835_) / anInt9921;
			    i_837_ += i_838_;
			    i_835_ += anInt9921 * i_838_;
			    i_836_ += anInt9922 * i_838_;
			    i_834_ += i_838_;
			}
			int i_839_;
			if ((i_839_
			     = (1 + i_835_
				- (((Class168_Sub2_Sub1) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_837_)
			    i_837_ = i_839_;
			if ((i_839_
			     = i_836_ - (((Class168_Sub2_Sub1) this).anInt9916
					 << 12))
			    >= 0) {
			    i_839_ = (anInt9922 - i_839_) / anInt9922;
			    i_837_ += i_839_;
			    i_835_ += anInt9921 * i_839_;
			    i_836_ += anInt9922 * i_839_;
			    i_834_ += i_839_;
			}
			if ((i_839_ = (i_836_ - anInt9922) / anInt9922)
			    > i_837_)
			    i_837_ = i_839_;
			int i_840_ = is[i_833_] - i;
			int i_841_ = -is_751_[i_833_];
			int i_842_ = i_840_ - (i_834_ - anInt9925);
			if (i_842_ > 0) {
			    i_834_ += i_842_;
			    i_837_ += i_842_;
			    i_835_ += anInt9921 * i_842_;
			    i_836_ += anInt9922 * i_842_;
			} else
			    i_841_ -= i_842_;
			if (i_837_ < i_841_)
			    i_837_ = i_841_;
			for (/**/; i_837_ < 0; i_837_++) {
			    int i_843_
				= (((Class168_Sub2_Sub1) this).anIntArray10708
				   [(((i_836_ >> 12)
				      * ((Class168_Sub2_Sub1) this).anInt9920)
				     + (i_835_ >> 12))]);
			    if (i_843_ != 0)
				is_753_[i_834_++] = i_843_;
			    else
				i_834_++;
			    i_835_ += anInt9921;
			    i_836_ += anInt9922;
			}
		    }
		    i_832_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		int i_844_ = anInt9919;
		while (i_844_ < 0) {
		    int i_845_ = i_844_ + i_752_;
		    if (i_845_ >= 0) {
			if (i_845_ >= is.length)
			    break;
			int i_846_ = anInt9925;
			int i_847_ = anInt9927 + anInt9929;
			int i_848_ = anInt9928 + anInt9930;
			int i_849_ = anInt9906;
			if (i_847_ < 0) {
			    int i_850_ = (anInt9921 - 1 - i_847_) / anInt9921;
			    i_849_ += i_850_;
			    i_847_ += anInt9921 * i_850_;
			    i_848_ += anInt9922 * i_850_;
			    i_846_ += i_850_;
			}
			int i_851_;
			if ((i_851_
			     = (1 + i_847_
				- (((Class168_Sub2_Sub1) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_849_)
			    i_849_ = i_851_;
			if (i_848_ < 0) {
			    i_851_ = (anInt9922 - 1 - i_848_) / anInt9922;
			    i_849_ += i_851_;
			    i_847_ += anInt9921 * i_851_;
			    i_848_ += anInt9922 * i_851_;
			    i_846_ += i_851_;
			}
			if ((i_851_
			     = (1 + i_848_
				- (((Class168_Sub2_Sub1) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_849_)
			    i_849_ = i_851_;
			int i_852_ = is[i_845_] - i;
			int i_853_ = -is_751_[i_845_];
			int i_854_ = i_852_ - (i_846_ - anInt9925);
			if (i_854_ > 0) {
			    i_846_ += i_854_;
			    i_849_ += i_854_;
			    i_847_ += anInt9921 * i_854_;
			    i_848_ += anInt9922 * i_854_;
			} else
			    i_853_ -= i_854_;
			if (i_849_ < i_853_)
			    i_849_ = i_853_;
			for (/**/; i_849_ < 0; i_849_++) {
			    int i_855_
				= (((Class168_Sub2_Sub1) this).anIntArray10708
				   [(((i_848_ >> 12)
				      * ((Class168_Sub2_Sub1) this).anInt9920)
				     + (i_847_ >> 12))]);
			    if (i_855_ != 0)
				is_753_[i_846_++] = i_855_;
			    else
				i_846_++;
			    i_847_ += anInt9921;
			    i_848_ += anInt9922;
			}
		    }
		    i_844_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    void method16968(int i, int i_856_, int[] is, int i_857_, int i_858_) {
	if (i_858_ == 0) {
	    if (i_857_ == 1)
		is[i_856_] = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
	    else if (i_857_ == 0) {
		int i_859_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i++];
		int i_860_ = (i_859_ & 0xff0000) * anInt9934 & ~0xffffff;
		int i_861_ = (i_859_ & 0xff00) * anInt9913 & 0xff0000;
		int i_862_ = (i_859_ & 0xff) * anInt9936 & 0xff00;
		is[i_856_] = (i_860_ | i_861_ | i_862_) >>> 8;
	    } else if (i_857_ == 3) {
		int i_863_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i++];
		int i_864_ = anInt9931;
		int i_865_ = i_863_ + i_864_;
		int i_866_ = (i_863_ & 0xff00ff) + (i_864_ & 0xff00ff);
		int i_867_
		    = (i_866_ & 0x1000100) + (i_865_ - i_866_ & 0x10000);
		is[i_856_] = i_865_ - i_867_ | i_867_ - (i_867_ >>> 8);
	    } else if (i_857_ == 2) {
		int i_868_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		int i_869_ = (i_868_ & 0xff00ff) * anInt9932 & ~0xff00ff;
		int i_870_ = (i_868_ & 0xff00) * anInt9932 & 0xff0000;
		is[i_856_] = ((i_869_ | i_870_) >>> 8) + anInt9939;
	    } else
		throw new IllegalArgumentException();
	} else if (i_858_ == 1) {
	    if (i_857_ == 1) {
		int i_871_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		if (i_871_ != 0)
		    is[i_856_] = i_871_;
	    } else if (i_857_ == 0) {
		int i_872_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		if (i_872_ != 0) {
		    if ((anInt9931 & 0xffffff) == 16777215) {
			int i_873_ = anInt9931 >>> 24;
			int i_874_ = 256 - i_873_;
			int i_875_ = is[i_856_];
			is[i_856_] = ((((i_872_ & 0xff00ff) * i_873_
					+ (i_875_ & 0xff00ff) * i_874_)
				       & ~0xff00ff)
				      + (((i_872_ & 0xff00) * i_873_
					  + (i_875_ & 0xff00) * i_874_)
					 & 0xff0000)) >> 8;
		    } else if (anInt9932 != 255) {
			int i_876_
			    = (i_872_ & 0xff0000) * anInt9934 & ~0xffffff;
			int i_877_ = (i_872_ & 0xff00) * anInt9913 & 0xff0000;
			int i_878_ = (i_872_ & 0xff) * anInt9936 & 0xff00;
			i_872_ = (i_876_ | i_877_ | i_878_) >>> 8;
			int i_879_ = is[i_856_];
			is[i_856_] = ((((i_872_ & 0xff00ff) * anInt9932
					+ (i_879_ & 0xff00ff) * anInt9937)
				       & ~0xff00ff)
				      + (((i_872_ & 0xff00) * anInt9932
					  + (i_879_ & 0xff00) * anInt9937)
					 & 0xff0000)) >> 8;
		    } else {
			int i_880_
			    = (i_872_ & 0xff0000) * anInt9934 & ~0xffffff;
			int i_881_ = (i_872_ & 0xff00) * anInt9913 & 0xff0000;
			int i_882_ = (i_872_ & 0xff) * anInt9936 & 0xff00;
			is[i_856_] = (i_880_ | i_881_ | i_882_) >>> 8;
		    }
		}
	    } else if (i_857_ == 3) {
		int i_883_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		int i_884_ = anInt9931;
		int i_885_ = i_883_ + i_884_;
		int i_886_ = (i_883_ & 0xff00ff) + (i_884_ & 0xff00ff);
		int i_887_
		    = (i_886_ & 0x1000100) + (i_885_ - i_886_ & 0x10000);
		i_887_ = i_885_ - i_887_ | i_887_ - (i_887_ >>> 8);
		if (i_883_ == 0 && anInt9932 != 255) {
		    i_883_ = i_887_;
		    i_887_ = is[i_856_];
		    i_887_ = ((((i_883_ & 0xff00ff) * anInt9932
				+ (i_887_ & 0xff00ff) * anInt9937)
			       & ~0xff00ff)
			      + (((i_883_ & 0xff00) * anInt9932
				  + (i_887_ & 0xff00) * anInt9937)
				 & 0xff0000)) >> 8;
		}
		is[i_856_] = i_887_;
	    } else if (i_857_ == 2) {
		int i_888_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		if (i_888_ != 0) {
		    int i_889_ = (i_888_ & 0xff00ff) * anInt9932 & ~0xff00ff;
		    int i_890_ = (i_888_ & 0xff00) * anInt9932 & 0xff0000;
		    is[i_856_++] = ((i_889_ | i_890_) >>> 8) + anInt9939;
		}
	    } else
		throw new IllegalArgumentException();
	} else if (i_858_ == 2) {
	    if (i_857_ == 1) {
		int i_891_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		if (i_891_ != 0) {
		    int i_892_ = is[i_856_];
		    int i_893_ = i_891_ + i_892_;
		    int i_894_ = (i_891_ & 0xff00ff) + (i_892_ & 0xff00ff);
		    i_892_
			= (i_894_ & 0x1000100) + (i_893_ - i_894_ & 0x10000);
		    is[i_856_] = i_893_ - i_892_ | i_892_ - (i_892_ >>> 8);
		}
	    } else if (i_857_ == 0) {
		int i_895_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		if (i_895_ != 0) {
		    int i_896_ = (i_895_ & 0xff0000) * anInt9934 & ~0xffffff;
		    int i_897_ = (i_895_ & 0xff00) * anInt9913 & 0xff0000;
		    int i_898_ = (i_895_ & 0xff) * anInt9936 & 0xff00;
		    i_895_ = (i_896_ | i_897_ | i_898_) >>> 8;
		    int i_899_ = is[i_856_];
		    int i_900_ = i_895_ + i_899_;
		    int i_901_ = (i_895_ & 0xff00ff) + (i_899_ & 0xff00ff);
		    i_899_
			= (i_901_ & 0x1000100) + (i_900_ - i_901_ & 0x10000);
		    is[i_856_] = i_900_ - i_899_ | i_899_ - (i_899_ >>> 8);
		}
	    } else if (i_857_ == 3) {
		int i_902_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		int i_903_ = anInt9931;
		int i_904_ = i_902_ + i_903_;
		int i_905_ = (i_902_ & 0xff00ff) + (i_903_ & 0xff00ff);
		int i_906_
		    = (i_905_ & 0x1000100) + (i_904_ - i_905_ & 0x10000);
		i_902_ = i_904_ - i_906_ | i_906_ - (i_906_ >>> 8);
		i_906_ = is[i_856_];
		i_904_ = i_902_ + i_906_;
		i_905_ = (i_902_ & 0xff00ff) + (i_906_ & 0xff00ff);
		i_906_ = (i_905_ & 0x1000100) + (i_904_ - i_905_ & 0x10000);
		is[i_856_] = i_904_ - i_906_ | i_906_ - (i_906_ >>> 8);
	    } else if (i_857_ == 2) {
		int i_907_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		if (i_907_ != 0) {
		    int i_908_ = (i_907_ & 0xff00ff) * anInt9932 & ~0xff00ff;
		    int i_909_ = (i_907_ & 0xff00) * anInt9932 & 0xff0000;
		    i_907_ = ((i_908_ | i_909_) >>> 8) + anInt9939;
		    int i_910_ = is[i_856_];
		    int i_911_ = i_907_ + i_910_;
		    int i_912_ = (i_907_ & 0xff00ff) + (i_910_ & 0xff00ff);
		    i_910_
			= (i_912_ & 0x1000100) + (i_911_ - i_912_ & 0x10000);
		    is[i_856_] = i_911_ - i_910_ | i_910_ - (i_910_ >>> 8);
		}
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    public void method3639(int i, int i_913_, int i_914_, int i_915_,
			   int i_916_, int i_917_) {
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_918_ = 0; i_918_ < i_915_; i_918_++) {
	    int i_919_
		= ((i_913_ + i_918_) * ((Class168_Sub2_Sub1) this).anInt9920
		   + i);
	    int i_920_ = ((i_917_ + i_918_)
			  * (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					       .aClass103_Sub2_9904)).anInt9260
			     * -1826993761)) + i_916_;
	    for (int i_921_ = 0; i_921_ < i_914_; i_921_++)
		((Class168_Sub2_Sub1) this).anIntArray10708[i_919_ + i_921_]
		    = is[i_920_ + i_921_];
	}
    }
    
    Class168_Sub2_Sub1(Class103_Sub2 class103_sub2, int[] is, int i,
		       int i_922_) {
	super(class103_sub2, i, i_922_);
	((Class168_Sub2_Sub1) this).anIntArray10708 = is;
    }
    
    public void method3653(int i, int i_923_, int i_924_) {
	throw new IllegalStateException("");
    }
    
    public Interface4 method3636() {
	return new Class186(((Class168_Sub2_Sub1) this).anInt9920,
			    ((Class168_Sub2_Sub1) this).anInt9916,
			    ((Class168_Sub2_Sub1) this).anIntArray10708);
    }
    
    public void method3630(int i, int i_925_, int i_926_) {
	throw new IllegalStateException("");
    }
    
    public Interface4 method3654() {
	return new Class186(((Class168_Sub2_Sub1) this).anInt9920,
			    ((Class168_Sub2_Sub1) this).anInt9916,
			    ((Class168_Sub2_Sub1) this).anIntArray10708);
    }
    
    public Interface4 method3634() {
	return new Class186(((Class168_Sub2_Sub1) this).anInt9920,
			    ((Class168_Sub2_Sub1) this).anInt9916,
			    ((Class168_Sub2_Sub1) this).anIntArray10708);
    }
    
    void method16230(int[] is, int[] is_927_, int i, int i_928_) {
	int[] is_929_ = (((Class103_Sub2)
			  ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			 .anIntArray9245);
	if (is_929_ != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_930_ = anInt9919;
		    while (i_930_ < 0) {
			int i_931_ = i_930_ + i_928_;
			if (i_931_ >= 0) {
			    if (i_931_ >= is.length)
				break;
			    int i_932_ = anInt9925;
			    int i_933_ = anInt9927;
			    int i_934_ = anInt9928;
			    int i_935_ = anInt9906;
			    if (i_933_ >= 0 && i_934_ >= 0
				&& (i_933_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)) < 0
				&& (i_934_
				    - (((Class168_Sub2_Sub1) this).anInt9916
				       << 12)) < 0) {
				int i_936_ = is[i_931_] - i;
				int i_937_ = -is_927_[i_931_];
				int i_938_ = i_936_ - (i_932_ - anInt9925);
				if (i_938_ > 0) {
				    i_932_ += i_938_;
				    i_935_ += i_938_;
				    i_933_ += anInt9921 * i_938_;
				    i_934_ += anInt9922 * i_938_;
				} else
				    i_937_ -= i_938_;
				if (i_935_ < i_937_)
				    i_935_ = i_937_;
				for (/**/; i_935_ < 0; i_935_++) {
				    int i_939_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(((i_934_ >> 12)
					      * (((Class168_Sub2_Sub1) this)
						 .anInt9920))
					     + (i_933_ >> 12))]);
				    if (i_939_ != 0)
					is_929_[i_932_++] = i_939_;
				    else
					i_932_++;
				}
			    }
			}
			i_930_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_940_ = anInt9919;
		    while (i_940_ < 0) {
			int i_941_ = i_940_ + i_928_;
			if (i_941_ >= 0) {
			    if (i_941_ >= is.length)
				break;
			    int i_942_ = anInt9925;
			    int i_943_ = anInt9927;
			    int i_944_ = anInt9928 + anInt9930;
			    int i_945_ = anInt9906;
			    if (i_943_ >= 0
				&& (i_943_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)) < 0) {
				int i_946_;
				if ((i_946_
				     = i_944_ - ((((Class168_Sub2_Sub1) this)
						  .anInt9916)
						 << 12))
				    >= 0) {
				    i_946_ = (anInt9922 - i_946_) / anInt9922;
				    i_945_ += i_946_;
				    i_944_ += anInt9922 * i_946_;
				    i_942_ += i_946_;
				}
				if ((i_946_ = (i_944_ - anInt9922) / anInt9922)
				    > i_945_)
				    i_945_ = i_946_;
				int i_947_ = is[i_941_] - i;
				int i_948_ = -is_927_[i_941_];
				int i_949_ = i_947_ - (i_942_ - anInt9925);
				if (i_949_ > 0) {
				    i_942_ += i_949_;
				    i_945_ += i_949_;
				    i_943_ += anInt9921 * i_949_;
				    i_944_ += anInt9922 * i_949_;
				} else
				    i_948_ -= i_949_;
				if (i_945_ < i_948_)
				    i_945_ = i_948_;
				for (/**/; i_945_ < 0; i_945_++) {
				    int i_950_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(((i_944_ >> 12)
					      * (((Class168_Sub2_Sub1) this)
						 .anInt9920))
					     + (i_943_ >> 12))]);
				    if (i_950_ != 0)
					is_929_[i_942_++] = i_950_;
				    else
					i_942_++;
				    i_944_ += anInt9922;
				}
			    }
			}
			i_940_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_951_ = anInt9919;
		    while (i_951_ < 0) {
			int i_952_ = i_951_ + i_928_;
			if (i_952_ >= 0) {
			    if (i_952_ >= is.length)
				break;
			    int i_953_ = anInt9925;
			    int i_954_ = anInt9927;
			    int i_955_ = anInt9928 + anInt9930;
			    int i_956_ = anInt9906;
			    if (i_954_ >= 0
				&& (i_954_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)) < 0) {
				if (i_955_ < 0) {
				    int i_957_
					= (anInt9922 - 1 - i_955_) / anInt9922;
				    i_956_ += i_957_;
				    i_955_ += anInt9922 * i_957_;
				    i_953_ += i_957_;
				}
				int i_958_;
				if ((i_958_ = (1 + i_955_
					       - ((((Class168_Sub2_Sub1) this)
						   .anInt9916)
						  << 12)
					       - anInt9922) / anInt9922)
				    > i_956_)
				    i_956_ = i_958_;
				int i_959_ = is[i_952_] - i;
				int i_960_ = -is_927_[i_952_];
				int i_961_ = i_959_ - (i_953_ - anInt9925);
				if (i_961_ > 0) {
				    i_953_ += i_961_;
				    i_956_ += i_961_;
				    i_954_ += anInt9921 * i_961_;
				    i_955_ += anInt9922 * i_961_;
				} else
				    i_960_ -= i_961_;
				if (i_956_ < i_960_)
				    i_956_ = i_960_;
				for (/**/; i_956_ < 0; i_956_++) {
				    int i_962_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(((i_955_ >> 12)
					      * (((Class168_Sub2_Sub1) this)
						 .anInt9920))
					     + (i_954_ >> 12))]);
				    if (i_962_ != 0)
					is_929_[i_953_++] = i_962_;
				    else
					i_953_++;
				    i_955_ += anInt9922;
				}
			    }
			}
			i_951_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_963_ = anInt9919;
		    while (i_963_ < 0) {
			int i_964_ = i_963_ + i_928_;
			if (i_964_ >= 0) {
			    if (i_964_ >= is.length)
				break;
			    int i_965_ = anInt9925;
			    int i_966_ = anInt9927 + anInt9929;
			    int i_967_ = anInt9928;
			    int i_968_ = anInt9906;
			    if (i_967_ >= 0
				&& (i_967_
				    - (((Class168_Sub2_Sub1) this).anInt9916
				       << 12)) < 0) {
				int i_969_;
				if ((i_969_
				     = i_966_ - ((((Class168_Sub2_Sub1) this)
						  .anInt9920)
						 << 12))
				    >= 0) {
				    i_969_ = (anInt9921 - i_969_) / anInt9921;
				    i_968_ += i_969_;
				    i_966_ += anInt9921 * i_969_;
				    i_965_ += i_969_;
				}
				if ((i_969_ = (i_966_ - anInt9921) / anInt9921)
				    > i_968_)
				    i_968_ = i_969_;
				int i_970_ = is[i_964_] - i;
				int i_971_ = -is_927_[i_964_];
				int i_972_ = i_970_ - (i_965_ - anInt9925);
				if (i_972_ > 0) {
				    i_965_ += i_972_;
				    i_968_ += i_972_;
				    i_966_ += anInt9921 * i_972_;
				    i_967_ += anInt9922 * i_972_;
				} else
				    i_971_ -= i_972_;
				if (i_968_ < i_971_)
				    i_968_ = i_971_;
				for (/**/; i_968_ < 0; i_968_++) {
				    int i_973_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(((i_967_ >> 12)
					      * (((Class168_Sub2_Sub1) this)
						 .anInt9920))
					     + (i_966_ >> 12))]);
				    if (i_973_ != 0)
					is_929_[i_965_++] = i_973_;
				    else
					i_965_++;
				    i_966_ += anInt9921;
				}
			    }
			}
			i_963_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_974_ = anInt9919;
		    while (i_974_ < 0) {
			int i_975_ = i_974_ + i_928_;
			if (i_975_ >= 0) {
			    if (i_975_ >= is.length)
				break;
			    int i_976_ = anInt9925;
			    int i_977_ = anInt9927 + anInt9929;
			    int i_978_ = anInt9928 + anInt9930;
			    int i_979_ = anInt9906;
			    int i_980_;
			    if ((i_980_
				 = (i_977_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)))
				>= 0) {
				i_980_ = (anInt9921 - i_980_) / anInt9921;
				i_979_ += i_980_;
				i_977_ += anInt9921 * i_980_;
				i_978_ += anInt9922 * i_980_;
				i_976_ += i_980_;
			    }
			    if ((i_980_ = (i_977_ - anInt9921) / anInt9921)
				> i_979_)
				i_979_ = i_980_;
			    if ((i_980_
				 = (i_978_
				    - (((Class168_Sub2_Sub1) this).anInt9916
				       << 12)))
				>= 0) {
				i_980_ = (anInt9922 - i_980_) / anInt9922;
				i_979_ += i_980_;
				i_977_ += anInt9921 * i_980_;
				i_978_ += anInt9922 * i_980_;
				i_976_ += i_980_;
			    }
			    if ((i_980_ = (i_978_ - anInt9922) / anInt9922)
				> i_979_)
				i_979_ = i_980_;
			    int i_981_ = is[i_975_] - i;
			    int i_982_ = -is_927_[i_975_];
			    int i_983_ = i_981_ - (i_976_ - anInt9925);
			    if (i_983_ > 0) {
				i_976_ += i_983_;
				i_979_ += i_983_;
				i_977_ += anInt9921 * i_983_;
				i_978_ += anInt9922 * i_983_;
			    } else
				i_982_ -= i_983_;
			    if (i_979_ < i_982_)
				i_979_ = i_982_;
			    for (/**/; i_979_ < 0; i_979_++) {
				int i_984_
				    = (((Class168_Sub2_Sub1) this)
				       .anIntArray10708
				       [((i_978_ >> 12) * ((Class168_Sub2_Sub1)
							   this).anInt9920
					 + (i_977_ >> 12))]);
				if (i_984_ != 0)
				    is_929_[i_976_++] = i_984_;
				else
				    i_976_++;
				i_977_ += anInt9921;
				i_978_ += anInt9922;
			    }
			}
			i_974_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_985_ = anInt9919;
		    while (i_985_ < 0) {
			int i_986_ = i_985_ + i_928_;
			if (i_986_ >= 0) {
			    if (i_986_ >= is.length)
				break;
			    int i_987_ = anInt9925;
			    int i_988_ = anInt9927 + anInt9929;
			    int i_989_ = anInt9928 + anInt9930;
			    int i_990_ = anInt9906;
			    int i_991_;
			    if ((i_991_
				 = (i_988_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)))
				>= 0) {
				i_991_ = (anInt9921 - i_991_) / anInt9921;
				i_990_ += i_991_;
				i_988_ += anInt9921 * i_991_;
				i_989_ += anInt9922 * i_991_;
				i_987_ += i_991_;
			    }
			    if ((i_991_ = (i_988_ - anInt9921) / anInt9921)
				> i_990_)
				i_990_ = i_991_;
			    if (i_989_ < 0) {
				i_991_ = (anInt9922 - 1 - i_989_) / anInt9922;
				i_990_ += i_991_;
				i_988_ += anInt9921 * i_991_;
				i_989_ += anInt9922 * i_991_;
				i_987_ += i_991_;
			    }
			    if ((i_991_
				 = (1 + i_989_
				    - (((Class168_Sub2_Sub1) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_990_)
				i_990_ = i_991_;
			    int i_992_ = is[i_986_] - i;
			    int i_993_ = -is_927_[i_986_];
			    int i_994_ = i_992_ - (i_987_ - anInt9925);
			    if (i_994_ > 0) {
				i_987_ += i_994_;
				i_990_ += i_994_;
				i_988_ += anInt9921 * i_994_;
				i_989_ += anInt9922 * i_994_;
			    } else
				i_993_ -= i_994_;
			    if (i_990_ < i_993_)
				i_990_ = i_993_;
			    for (/**/; i_990_ < 0; i_990_++) {
				int i_995_
				    = (((Class168_Sub2_Sub1) this)
				       .anIntArray10708
				       [((i_989_ >> 12) * ((Class168_Sub2_Sub1)
							   this).anInt9920
					 + (i_988_ >> 12))]);
				if (i_995_ != 0)
				    is_929_[i_987_++] = i_995_;
				else
				    i_987_++;
				i_988_ += anInt9921;
				i_989_ += anInt9922;
			    }
			}
			i_985_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_996_ = anInt9919;
		while (i_996_ < 0) {
		    int i_997_ = i_996_ + i_928_;
		    if (i_997_ >= 0) {
			if (i_997_ >= is.length)
			    break;
			int i_998_ = anInt9925;
			int i_999_ = anInt9927 + anInt9929;
			int i_1000_ = anInt9928;
			int i_1001_ = anInt9906;
			if (i_1000_ >= 0
			    && i_1000_ - (((Class168_Sub2_Sub1) this).anInt9916
					  << 12) < 0) {
			    if (i_999_ < 0) {
				int i_1002_
				    = (anInt9921 - 1 - i_999_) / anInt9921;
				i_1001_ += i_1002_;
				i_999_ += anInt9921 * i_1002_;
				i_998_ += i_1002_;
			    }
			    int i_1003_;
			    if ((i_1003_
				 = (1 + i_999_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)
				    - anInt9921) / anInt9921)
				> i_1001_)
				i_1001_ = i_1003_;
			    int i_1004_ = is[i_997_] - i;
			    int i_1005_ = -is_927_[i_997_];
			    int i_1006_ = i_1004_ - (i_998_ - anInt9925);
			    if (i_1006_ > 0) {
				i_998_ += i_1006_;
				i_1001_ += i_1006_;
				i_999_ += anInt9921 * i_1006_;
				i_1000_ += anInt9922 * i_1006_;
			    } else
				i_1005_ -= i_1006_;
			    if (i_1001_ < i_1005_)
				i_1001_ = i_1005_;
			    for (/**/; i_1001_ < 0; i_1001_++) {
				int i_1007_
				    = (((Class168_Sub2_Sub1) this)
				       .anIntArray10708
				       [((i_1000_ >> 12)
					 * (((Class168_Sub2_Sub1) this)
					    .anInt9920)) + (i_999_ >> 12)]);
				if (i_1007_ != 0)
				    is_929_[i_998_++] = i_1007_;
				else
				    i_998_++;
				i_999_ += anInt9921;
			    }
			}
		    }
		    i_996_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		int i_1008_ = anInt9919;
		while (i_1008_ < 0) {
		    int i_1009_ = i_1008_ + i_928_;
		    if (i_1009_ >= 0) {
			if (i_1009_ >= is.length)
			    break;
			int i_1010_ = anInt9925;
			int i_1011_ = anInt9927 + anInt9929;
			int i_1012_ = anInt9928 + anInt9930;
			int i_1013_ = anInt9906;
			if (i_1011_ < 0) {
			    int i_1014_
				= (anInt9921 - 1 - i_1011_) / anInt9921;
			    i_1013_ += i_1014_;
			    i_1011_ += anInt9921 * i_1014_;
			    i_1012_ += anInt9922 * i_1014_;
			    i_1010_ += i_1014_;
			}
			int i_1015_;
			if ((i_1015_
			     = (1 + i_1011_
				- (((Class168_Sub2_Sub1) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_1013_)
			    i_1013_ = i_1015_;
			if ((i_1015_
			     = i_1012_ - (((Class168_Sub2_Sub1) this).anInt9916
					  << 12))
			    >= 0) {
			    i_1015_ = (anInt9922 - i_1015_) / anInt9922;
			    i_1013_ += i_1015_;
			    i_1011_ += anInt9921 * i_1015_;
			    i_1012_ += anInt9922 * i_1015_;
			    i_1010_ += i_1015_;
			}
			if ((i_1015_ = (i_1012_ - anInt9922) / anInt9922)
			    > i_1013_)
			    i_1013_ = i_1015_;
			int i_1016_ = is[i_1009_] - i;
			int i_1017_ = -is_927_[i_1009_];
			int i_1018_ = i_1016_ - (i_1010_ - anInt9925);
			if (i_1018_ > 0) {
			    i_1010_ += i_1018_;
			    i_1013_ += i_1018_;
			    i_1011_ += anInt9921 * i_1018_;
			    i_1012_ += anInt9922 * i_1018_;
			} else
			    i_1017_ -= i_1018_;
			if (i_1013_ < i_1017_)
			    i_1013_ = i_1017_;
			for (/**/; i_1013_ < 0; i_1013_++) {
			    int i_1019_
				= (((Class168_Sub2_Sub1) this).anIntArray10708
				   [(((i_1012_ >> 12)
				      * ((Class168_Sub2_Sub1) this).anInt9920)
				     + (i_1011_ >> 12))]);
			    if (i_1019_ != 0)
				is_929_[i_1010_++] = i_1019_;
			    else
				i_1010_++;
			    i_1011_ += anInt9921;
			    i_1012_ += anInt9922;
			}
		    }
		    i_1008_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		int i_1020_ = anInt9919;
		while (i_1020_ < 0) {
		    int i_1021_ = i_1020_ + i_928_;
		    if (i_1021_ >= 0) {
			if (i_1021_ >= is.length)
			    break;
			int i_1022_ = anInt9925;
			int i_1023_ = anInt9927 + anInt9929;
			int i_1024_ = anInt9928 + anInt9930;
			int i_1025_ = anInt9906;
			if (i_1023_ < 0) {
			    int i_1026_
				= (anInt9921 - 1 - i_1023_) / anInt9921;
			    i_1025_ += i_1026_;
			    i_1023_ += anInt9921 * i_1026_;
			    i_1024_ += anInt9922 * i_1026_;
			    i_1022_ += i_1026_;
			}
			int i_1027_;
			if ((i_1027_
			     = (1 + i_1023_
				- (((Class168_Sub2_Sub1) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_1025_)
			    i_1025_ = i_1027_;
			if (i_1024_ < 0) {
			    i_1027_ = (anInt9922 - 1 - i_1024_) / anInt9922;
			    i_1025_ += i_1027_;
			    i_1023_ += anInt9921 * i_1027_;
			    i_1024_ += anInt9922 * i_1027_;
			    i_1022_ += i_1027_;
			}
			if ((i_1027_
			     = (1 + i_1024_
				- (((Class168_Sub2_Sub1) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_1025_)
			    i_1025_ = i_1027_;
			int i_1028_ = is[i_1021_] - i;
			int i_1029_ = -is_927_[i_1021_];
			int i_1030_ = i_1028_ - (i_1022_ - anInt9925);
			if (i_1030_ > 0) {
			    i_1022_ += i_1030_;
			    i_1025_ += i_1030_;
			    i_1023_ += anInt9921 * i_1030_;
			    i_1024_ += anInt9922 * i_1030_;
			} else
			    i_1029_ -= i_1030_;
			if (i_1025_ < i_1029_)
			    i_1025_ = i_1029_;
			for (/**/; i_1025_ < 0; i_1025_++) {
			    int i_1031_
				= (((Class168_Sub2_Sub1) this).anIntArray10708
				   [(((i_1024_ >> 12)
				      * ((Class168_Sub2_Sub1) this).anInt9920)
				     + (i_1023_ >> 12))]);
			    if (i_1031_ != 0)
				is_929_[i_1022_++] = i_1031_;
			    else
				i_1022_++;
			    i_1023_ += anInt9921;
			    i_1024_ += anInt9922;
			}
		    }
		    i_1020_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    public void method3658(int i, int i_1032_, int i_1033_, int i_1034_,
			   int i_1035_) {
	if (((Class168_Sub2_Sub1) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    int i_1036_ = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761);
	    i += ((Class168_Sub2_Sub1) this).anInt9907;
	    i_1032_ += ((Class168_Sub2_Sub1) this).anInt9905;
	    int i_1037_ = i_1032_ * i_1036_ + i;
	    int i_1038_ = 0;
	    int i_1039_ = ((Class168_Sub2_Sub1) this).anInt9916;
	    int i_1040_ = ((Class168_Sub2_Sub1) this).anInt9920;
	    int i_1041_ = i_1036_ - i_1040_;
	    int i_1042_ = 0;
	    if (i_1032_ < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_1043_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_1032_);
		i_1039_ -= i_1043_;
		i_1032_ = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385);
		i_1038_ += i_1043_ * i_1040_;
		i_1037_ += i_1043_ * i_1036_;
	    }
	    if (i_1032_ + i_1039_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_1039_ -= (i_1032_ + i_1039_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_1044_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_1040_ -= i_1044_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_1038_ += i_1044_;
		i_1037_ += i_1044_;
		i_1042_ += i_1044_;
		i_1041_ += i_1044_;
	    }
	    if (i + i_1040_ > (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_1045_ = (i + i_1040_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_1040_ -= i_1045_;
		i_1042_ += i_1045_;
		i_1041_ += i_1045_;
	    }
	    if (i_1040_ > 0 && i_1039_ > 0) {
		if (i_1035_ == 0) {
		    if (i_1033_ == 1) {
			for (int i_1046_ = -i_1039_; i_1046_ < 0; i_1046_++) {
			    int i_1047_ = i_1037_ + i_1040_ - 3;
			    while (i_1037_ < i_1047_) {
				is[i_1037_++] = (((Class168_Sub2_Sub1) this)
						 .anIntArray10708[i_1038_++]);
				is[i_1037_++] = (((Class168_Sub2_Sub1) this)
						 .anIntArray10708[i_1038_++]);
				is[i_1037_++] = (((Class168_Sub2_Sub1) this)
						 .anIntArray10708[i_1038_++]);
				is[i_1037_++] = (((Class168_Sub2_Sub1) this)
						 .anIntArray10708[i_1038_++]);
			    }
			    i_1047_ += 3;
			    while (i_1037_ < i_1047_)
				is[i_1037_++] = (((Class168_Sub2_Sub1) this)
						 .anIntArray10708[i_1038_++]);
			    i_1037_ += i_1041_;
			    i_1038_ += i_1042_;
			}
		    } else if (i_1033_ == 0) {
			int i_1048_ = (i_1034_ & 0xff0000) >> 16;
			int i_1049_ = (i_1034_ & 0xff00) >> 8;
			int i_1050_ = i_1034_ & 0xff;
			for (int i_1051_ = -i_1039_; i_1051_ < 0; i_1051_++) {
			    for (int i_1052_ = -i_1040_; i_1052_ < 0;
				 i_1052_++) {
				int i_1053_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708[i_1038_++]);
				int i_1054_ = ((i_1053_ & 0xff0000) * i_1048_
					       & ~0xffffff);
				int i_1055_
				    = (i_1053_ & 0xff00) * i_1049_ & 0xff0000;
				int i_1056_
				    = (i_1053_ & 0xff) * i_1050_ & 0xff00;
				is[i_1037_++]
				    = (i_1054_ | i_1055_ | i_1056_) >>> 8;
			    }
			    i_1037_ += i_1041_;
			    i_1038_ += i_1042_;
			}
		    } else if (i_1033_ == 3) {
			for (int i_1057_ = -i_1039_; i_1057_ < 0; i_1057_++) {
			    for (int i_1058_ = -i_1040_; i_1058_ < 0;
				 i_1058_++) {
				int i_1059_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708[i_1038_++]);
				int i_1060_ = i_1059_ + i_1034_;
				int i_1061_ = ((i_1059_ & 0xff00ff)
					       + (i_1034_ & 0xff00ff));
				int i_1062_
				    = ((i_1061_ & 0x1000100)
				       + (i_1060_ - i_1061_ & 0x10000));
				is[i_1037_++]
				    = i_1060_ - i_1062_ | i_1062_ - (i_1062_
								     >>> 8);
			    }
			    i_1037_ += i_1041_;
			    i_1038_ += i_1042_;
			}
		    } else if (i_1033_ == 2) {
			int i_1063_ = i_1034_ >>> 24;
			int i_1064_ = 256 - i_1063_;
			int i_1065_
			    = (i_1034_ & 0xff00ff) * i_1064_ & ~0xff00ff;
			int i_1066_ = (i_1034_ & 0xff00) * i_1064_ & 0xff0000;
			i_1034_ = (i_1065_ | i_1066_) >>> 8;
			for (int i_1067_ = -i_1039_; i_1067_ < 0; i_1067_++) {
			    for (int i_1068_ = -i_1040_; i_1068_ < 0;
				 i_1068_++) {
				int i_1069_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708[i_1038_++]);
				i_1065_ = ((i_1069_ & 0xff00ff) * i_1063_
					   & ~0xff00ff);
				i_1066_
				    = (i_1069_ & 0xff00) * i_1063_ & 0xff0000;
				is[i_1037_++]
				    = ((i_1065_ | i_1066_) >>> 8) + i_1034_;
			    }
			    i_1037_ += i_1041_;
			    i_1038_ += i_1042_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1035_ == 1) {
		    if (i_1033_ == 1) {
			for (int i_1070_ = -i_1039_; i_1070_ < 0; i_1070_++) {
			    int i_1071_ = i_1037_ + i_1040_ - 3;
			    while (i_1037_ < i_1071_) {
				int i_1072_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708[i_1038_++]);
				if (i_1072_ != 0)
				    is[i_1037_++] = i_1072_;
				else
				    i_1037_++;
				i_1072_ = (((Class168_Sub2_Sub1) this)
					   .anIntArray10708[i_1038_++]);
				if (i_1072_ != 0)
				    is[i_1037_++] = i_1072_;
				else
				    i_1037_++;
				i_1072_ = (((Class168_Sub2_Sub1) this)
					   .anIntArray10708[i_1038_++]);
				if (i_1072_ != 0)
				    is[i_1037_++] = i_1072_;
				else
				    i_1037_++;
				i_1072_ = (((Class168_Sub2_Sub1) this)
					   .anIntArray10708[i_1038_++]);
				if (i_1072_ != 0)
				    is[i_1037_++] = i_1072_;
				else
				    i_1037_++;
			    }
			    i_1071_ += 3;
			    while (i_1037_ < i_1071_) {
				int i_1073_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708[i_1038_++]);
				if (i_1073_ != 0)
				    is[i_1037_++] = i_1073_;
				else
				    i_1037_++;
			    }
			    i_1037_ += i_1041_;
			    i_1038_ += i_1042_;
			}
		    } else if (i_1033_ == 0) {
			if ((i_1034_ & 0xffffff) == 16777215) {
			    int i_1074_ = i_1034_ >>> 24;
			    int i_1075_ = 256 - i_1074_;
			    for (int i_1076_ = -i_1039_; i_1076_ < 0;
				 i_1076_++) {
				for (int i_1077_ = -i_1040_; i_1077_ < 0;
				     i_1077_++) {
				    int i_1078_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708[i_1038_++]);
				    if (i_1078_ != 0) {
					int i_1079_ = is[i_1037_];
					is[i_1037_++]
					    = ((((i_1078_ & 0xff00ff) * i_1074_
						 + ((i_1079_ & 0xff00ff)
						    * i_1075_))
						& ~0xff00ff)
					       + (((i_1078_ & 0xff00) * i_1074_
						   + ((i_1079_ & 0xff00)
						      * i_1075_))
						  & 0xff0000)) >> 8;
				    } else
					i_1037_++;
				}
				i_1037_ += i_1041_;
				i_1038_ += i_1042_;
			    }
			} else {
			    int i_1080_ = (i_1034_ & 0xff0000) >> 16;
			    int i_1081_ = (i_1034_ & 0xff00) >> 8;
			    int i_1082_ = i_1034_ & 0xff;
			    int i_1083_ = i_1034_ >>> 24;
			    int i_1084_ = 256 - i_1083_;
			    for (int i_1085_ = -i_1039_; i_1085_ < 0;
				 i_1085_++) {
				for (int i_1086_ = -i_1040_; i_1086_ < 0;
				     i_1086_++) {
				    int i_1087_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708[i_1038_++]);
				    if (i_1087_ != 0) {
					if (i_1083_ != 255) {
					    int i_1088_
						= (((i_1087_ & 0xff0000)
						    * i_1080_)
						   & ~0xffffff);
					    int i_1089_
						= ((i_1087_ & 0xff00) * i_1081_
						   & 0xff0000);
					    int i_1090_
						= ((i_1087_ & 0xff) * i_1082_
						   & 0xff00);
					    i_1087_ = (i_1088_ | i_1089_
						       | i_1090_) >>> 8;
					    int i_1091_ = is[i_1037_];
					    is[i_1037_++]
						= (((((i_1087_ & 0xff00ff)
						      * i_1083_)
						     + ((i_1091_ & 0xff00ff)
							* i_1084_))
						    & ~0xff00ff)
						   + ((((i_1087_ & 0xff00)
							* i_1083_)
						       + ((i_1091_ & 0xff00)
							  * i_1084_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1092_
						= (((i_1087_ & 0xff0000)
						    * i_1080_)
						   & ~0xffffff);
					    int i_1093_
						= ((i_1087_ & 0xff00) * i_1081_
						   & 0xff0000);
					    int i_1094_
						= ((i_1087_ & 0xff) * i_1082_
						   & 0xff00);
					    is[i_1037_++] = (i_1092_ | i_1093_
							     | i_1094_) >>> 8;
					}
				    } else
					i_1037_++;
				}
				i_1037_ += i_1041_;
				i_1038_ += i_1042_;
			    }
			}
		    } else if (i_1033_ == 3) {
			int i_1095_ = i_1034_ >>> 24;
			int i_1096_ = 256 - i_1095_;
			for (int i_1097_ = -i_1039_; i_1097_ < 0; i_1097_++) {
			    for (int i_1098_ = -i_1040_; i_1098_ < 0;
				 i_1098_++) {
				int i_1099_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708[i_1038_++]);
				int i_1100_ = i_1099_ + i_1034_;
				int i_1101_ = ((i_1099_ & 0xff00ff)
					       + (i_1034_ & 0xff00ff));
				int i_1102_
				    = ((i_1101_ & 0x1000100)
				       + (i_1100_ - i_1101_ & 0x10000));
				i_1102_
				    = i_1100_ - i_1102_ | i_1102_ - (i_1102_
								     >>> 8);
				if (i_1099_ == 0 && i_1095_ != 255) {
				    i_1099_ = i_1102_;
				    i_1102_ = is[i_1037_];
				    i_1102_
					= ((((i_1099_ & 0xff00ff) * i_1095_
					     + (i_1102_ & 0xff00ff) * i_1096_)
					    & ~0xff00ff)
					   + (((i_1099_ & 0xff00) * i_1095_
					       + (i_1102_ & 0xff00) * i_1096_)
					      & 0xff0000)) >> 8;
				}
				is[i_1037_++] = i_1102_;
			    }
			    i_1037_ += i_1041_;
			    i_1038_ += i_1042_;
			}
		    } else if (i_1033_ == 2) {
			int i_1103_ = i_1034_ >>> 24;
			int i_1104_ = 256 - i_1103_;
			int i_1105_
			    = (i_1034_ & 0xff00ff) * i_1104_ & ~0xff00ff;
			int i_1106_ = (i_1034_ & 0xff00) * i_1104_ & 0xff0000;
			i_1034_ = (i_1105_ | i_1106_) >>> 8;
			for (int i_1107_ = -i_1039_; i_1107_ < 0; i_1107_++) {
			    for (int i_1108_ = -i_1040_; i_1108_ < 0;
				 i_1108_++) {
				int i_1109_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708[i_1038_++]);
				if (i_1109_ != 0) {
				    i_1105_ = ((i_1109_ & 0xff00ff) * i_1103_
					       & ~0xff00ff);
				    i_1106_ = ((i_1109_ & 0xff00) * i_1103_
					       & 0xff0000);
				    is[i_1037_++] = ((i_1105_ | i_1106_)
						     >>> 8) + i_1034_;
				} else
				    i_1037_++;
			    }
			    i_1037_ += i_1041_;
			    i_1038_ += i_1042_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1035_ == 2) {
		    if (i_1033_ == 1) {
			for (int i_1110_ = -i_1039_; i_1110_ < 0; i_1110_++) {
			    for (int i_1111_ = -i_1040_; i_1111_ < 0;
				 i_1111_++) {
				int i_1112_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708[i_1038_++]);
				if (i_1112_ != 0) {
				    int i_1113_ = is[i_1037_];
				    int i_1114_ = i_1112_ + i_1113_;
				    int i_1115_ = ((i_1112_ & 0xff00ff)
						   + (i_1113_ & 0xff00ff));
				    i_1113_
					= ((i_1115_ & 0x1000100)
					   + (i_1114_ - i_1115_ & 0x10000));
				    is[i_1037_++]
					= (i_1114_ - i_1113_
					   | i_1113_ - (i_1113_ >>> 8));
				} else
				    i_1037_++;
			    }
			    i_1037_ += i_1041_;
			    i_1038_ += i_1042_;
			}
		    } else if (i_1033_ == 0) {
			int i_1116_ = (i_1034_ & 0xff0000) >> 16;
			int i_1117_ = (i_1034_ & 0xff00) >> 8;
			int i_1118_ = i_1034_ & 0xff;
			for (int i_1119_ = -i_1039_; i_1119_ < 0; i_1119_++) {
			    for (int i_1120_ = -i_1040_; i_1120_ < 0;
				 i_1120_++) {
				int i_1121_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708[i_1038_++]);
				if (i_1121_ != 0) {
				    int i_1122_
					= ((i_1121_ & 0xff0000) * i_1116_
					   & ~0xffffff);
				    int i_1123_ = ((i_1121_ & 0xff00) * i_1117_
						   & 0xff0000);
				    int i_1124_
					= (i_1121_ & 0xff) * i_1118_ & 0xff00;
				    i_1121_
					= (i_1122_ | i_1123_ | i_1124_) >>> 8;
				    int i_1125_ = is[i_1037_];
				    int i_1126_ = i_1121_ + i_1125_;
				    int i_1127_ = ((i_1121_ & 0xff00ff)
						   + (i_1125_ & 0xff00ff));
				    i_1125_
					= ((i_1127_ & 0x1000100)
					   + (i_1126_ - i_1127_ & 0x10000));
				    is[i_1037_++]
					= (i_1126_ - i_1125_
					   | i_1125_ - (i_1125_ >>> 8));
				} else
				    i_1037_++;
			    }
			    i_1037_ += i_1041_;
			    i_1038_ += i_1042_;
			}
		    } else if (i_1033_ == 3) {
			for (int i_1128_ = -i_1039_; i_1128_ < 0; i_1128_++) {
			    for (int i_1129_ = -i_1040_; i_1129_ < 0;
				 i_1129_++) {
				int i_1130_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708[i_1038_++]);
				int i_1131_ = i_1130_ + i_1034_;
				int i_1132_ = ((i_1130_ & 0xff00ff)
					       + (i_1034_ & 0xff00ff));
				int i_1133_
				    = ((i_1132_ & 0x1000100)
				       + (i_1131_ - i_1132_ & 0x10000));
				i_1130_
				    = i_1131_ - i_1133_ | i_1133_ - (i_1133_
								     >>> 8);
				i_1133_ = is[i_1037_];
				i_1131_ = i_1130_ + i_1133_;
				i_1132_ = (i_1130_ & 0xff00ff) + (i_1133_
								  & 0xff00ff);
				i_1133_ = ((i_1132_ & 0x1000100)
					   + (i_1131_ - i_1132_ & 0x10000));
				is[i_1037_++]
				    = i_1131_ - i_1133_ | i_1133_ - (i_1133_
								     >>> 8);
			    }
			    i_1037_ += i_1041_;
			    i_1038_ += i_1042_;
			}
		    } else if (i_1033_ == 2) {
			int i_1134_ = i_1034_ >>> 24;
			int i_1135_ = 256 - i_1134_;
			int i_1136_
			    = (i_1034_ & 0xff00ff) * i_1135_ & ~0xff00ff;
			int i_1137_ = (i_1034_ & 0xff00) * i_1135_ & 0xff0000;
			i_1034_ = (i_1136_ | i_1137_) >>> 8;
			for (int i_1138_ = -i_1039_; i_1138_ < 0; i_1138_++) {
			    for (int i_1139_ = -i_1040_; i_1139_ < 0;
				 i_1139_++) {
				int i_1140_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708[i_1038_++]);
				if (i_1140_ != 0) {
				    i_1136_ = ((i_1140_ & 0xff00ff) * i_1134_
					       & ~0xff00ff);
				    i_1137_ = ((i_1140_ & 0xff00) * i_1134_
					       & 0xff0000);
				    i_1140_ = (((i_1136_ | i_1137_) >>> 8)
					       + i_1034_);
				    int i_1141_ = is[i_1037_];
				    int i_1142_ = i_1140_ + i_1141_;
				    int i_1143_ = ((i_1140_ & 0xff00ff)
						   + (i_1141_ & 0xff00ff));
				    i_1141_
					= ((i_1143_ & 0x1000100)
					   + (i_1142_ - i_1143_ & 0x10000));
				    is[i_1037_++]
					= (i_1142_ - i_1141_
					   | i_1141_ - (i_1141_ >>> 8));
				} else
				    i_1037_++;
			    }
			    i_1037_ += i_1041_;
			    i_1038_ += i_1042_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method3637(int i, int i_1144_, Class135 class135, int i_1145_,
			   int i_1146_) {
	if (((Class168_Sub2_Sub1) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    i += ((Class168_Sub2_Sub1) this).anInt9907;
	    i_1144_ += ((Class168_Sub2_Sub1) this).anInt9905;
	    int i_1147_ = 0;
	    int i_1148_ = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761);
	    int i_1149_ = ((Class168_Sub2_Sub1) this).anInt9920;
	    int i_1150_ = ((Class168_Sub2_Sub1) this).anInt9916;
	    int i_1151_ = i_1148_ - i_1149_;
	    int i_1152_ = 0;
	    int i_1153_ = i + i_1144_ * i_1148_;
	    if (i_1144_ < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_1154_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_1144_);
		i_1150_ -= i_1154_;
		i_1144_ = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385);
		i_1147_ += i_1154_ * i_1149_;
		i_1153_ += i_1154_ * i_1148_;
	    }
	    if (i_1144_ + i_1150_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_1150_ -= (i_1144_ + i_1150_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_1155_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_1149_ -= i_1155_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_1147_ += i_1155_;
		i_1153_ += i_1155_;
		i_1152_ += i_1155_;
		i_1151_ += i_1155_;
	    }
	    if (i + i_1149_ > (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_1156_ = (i + i_1149_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_1149_ -= i_1156_;
		i_1152_ += i_1156_;
		i_1151_ += i_1156_;
	    }
	    if (i_1149_ > 0 && i_1150_ > 0) {
		Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
		int[] is_1157_
		    = ((Class135_Sub1) class135_sub1).anIntArray9874;
		int[] is_1158_
		    = ((Class135_Sub1) class135_sub1).anIntArray9873;
		int i_1159_ = i_1144_;
		if (i_1146_ > i_1159_) {
		    i_1159_ = i_1146_;
		    i_1153_ += (i_1146_ - i_1144_) * i_1148_;
		    i_1147_ += ((i_1146_ - i_1144_)
				* ((Class168_Sub2_Sub1) this).anInt9920);
		}
		int i_1160_
		    = (i_1146_ + is_1157_.length < i_1144_ + i_1150_
		       ? i_1146_ + is_1157_.length : i_1144_ + i_1150_);
		for (int i_1161_ = i_1159_; i_1161_ < i_1160_; i_1161_++) {
		    int i_1162_ = is_1157_[i_1161_ - i_1146_] + i_1145_;
		    int i_1163_ = is_1158_[i_1161_ - i_1146_];
		    int i_1164_ = i_1149_;
		    if (i > i_1162_) {
			int i_1165_ = i - i_1162_;
			if (i_1165_ >= i_1163_) {
			    i_1147_ += i_1149_ + i_1152_;
			    i_1153_ += i_1149_ + i_1151_;
			    continue;
			}
			i_1163_ -= i_1165_;
		    } else {
			int i_1166_ = i_1162_ - i;
			if (i_1166_ >= i_1149_) {
			    i_1147_ += i_1149_ + i_1152_;
			    i_1153_ += i_1149_ + i_1151_;
			    continue;
			}
			i_1147_ += i_1166_;
			i_1164_ -= i_1166_;
			i_1153_ += i_1166_;
		    }
		    int i_1167_ = 0;
		    if (i_1164_ < i_1163_)
			i_1163_ = i_1164_;
		    else
			i_1167_ = i_1164_ - i_1163_;
		    for (int i_1168_ = -i_1163_; i_1168_ < 0; i_1168_++) {
			int i_1169_ = (((Class168_Sub2_Sub1) this)
				       .anIntArray10708[i_1147_++]);
			if (i_1169_ != 0)
			    is[i_1153_++] = i_1169_;
			else
			    i_1153_++;
		    }
		    i_1147_ += i_1167_ + i_1152_;
		    i_1153_ += i_1167_ + i_1151_;
		}
	    }
	}
    }
    
    public void method3638(int i, int i_1170_, Class135 class135, int i_1171_,
			   int i_1172_) {
	if (((Class168_Sub2_Sub1) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    i += ((Class168_Sub2_Sub1) this).anInt9907;
	    i_1170_ += ((Class168_Sub2_Sub1) this).anInt9905;
	    int i_1173_ = 0;
	    int i_1174_ = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761);
	    int i_1175_ = ((Class168_Sub2_Sub1) this).anInt9920;
	    int i_1176_ = ((Class168_Sub2_Sub1) this).anInt9916;
	    int i_1177_ = i_1174_ - i_1175_;
	    int i_1178_ = 0;
	    int i_1179_ = i + i_1170_ * i_1174_;
	    if (i_1170_ < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_1180_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_1170_);
		i_1176_ -= i_1180_;
		i_1170_ = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385);
		i_1173_ += i_1180_ * i_1175_;
		i_1179_ += i_1180_ * i_1174_;
	    }
	    if (i_1170_ + i_1176_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_1176_ -= (i_1170_ + i_1176_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_1181_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_1175_ -= i_1181_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_1173_ += i_1181_;
		i_1179_ += i_1181_;
		i_1178_ += i_1181_;
		i_1177_ += i_1181_;
	    }
	    if (i + i_1175_ > (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_1182_ = (i + i_1175_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_1175_ -= i_1182_;
		i_1178_ += i_1182_;
		i_1177_ += i_1182_;
	    }
	    if (i_1175_ > 0 && i_1176_ > 0) {
		Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
		int[] is_1183_
		    = ((Class135_Sub1) class135_sub1).anIntArray9874;
		int[] is_1184_
		    = ((Class135_Sub1) class135_sub1).anIntArray9873;
		int i_1185_ = i_1170_;
		if (i_1172_ > i_1185_) {
		    i_1185_ = i_1172_;
		    i_1179_ += (i_1172_ - i_1170_) * i_1174_;
		    i_1173_ += ((i_1172_ - i_1170_)
				* ((Class168_Sub2_Sub1) this).anInt9920);
		}
		int i_1186_
		    = (i_1172_ + is_1183_.length < i_1170_ + i_1176_
		       ? i_1172_ + is_1183_.length : i_1170_ + i_1176_);
		for (int i_1187_ = i_1185_; i_1187_ < i_1186_; i_1187_++) {
		    int i_1188_ = is_1183_[i_1187_ - i_1172_] + i_1171_;
		    int i_1189_ = is_1184_[i_1187_ - i_1172_];
		    int i_1190_ = i_1175_;
		    if (i > i_1188_) {
			int i_1191_ = i - i_1188_;
			if (i_1191_ >= i_1189_) {
			    i_1173_ += i_1175_ + i_1178_;
			    i_1179_ += i_1175_ + i_1177_;
			    continue;
			}
			i_1189_ -= i_1191_;
		    } else {
			int i_1192_ = i_1188_ - i;
			if (i_1192_ >= i_1175_) {
			    i_1173_ += i_1175_ + i_1178_;
			    i_1179_ += i_1175_ + i_1177_;
			    continue;
			}
			i_1173_ += i_1192_;
			i_1190_ -= i_1192_;
			i_1179_ += i_1192_;
		    }
		    int i_1193_ = 0;
		    if (i_1190_ < i_1189_)
			i_1189_ = i_1190_;
		    else
			i_1193_ = i_1190_ - i_1189_;
		    for (int i_1194_ = -i_1189_; i_1194_ < 0; i_1194_++) {
			int i_1195_ = (((Class168_Sub2_Sub1) this)
				       .anIntArray10708[i_1173_++]);
			if (i_1195_ != 0)
			    is[i_1179_++] = i_1195_;
			else
			    i_1179_++;
		    }
		    i_1173_ += i_1193_ + i_1178_;
		    i_1179_ += i_1193_ + i_1177_;
		}
	    }
	}
    }
    
    public void method3675(int i, int i_1196_, int i_1197_, int i_1198_,
			   int i_1199_, int i_1200_) {
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_1201_ = 0; i_1201_ < i_1198_; i_1201_++) {
	    int i_1202_
		= ((i_1196_ + i_1201_) * ((Class168_Sub2_Sub1) this).anInt9920
		   + i);
	    int i_1203_
		= (((i_1200_ + i_1201_)
		    * (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					 .aClass103_Sub2_9904)).anInt9260
		       * -1826993761))
		   + i_1199_);
	    for (int i_1204_ = 0; i_1204_ < i_1197_; i_1204_++)
		((Class168_Sub2_Sub1) this).anIntArray10708[i_1202_ + i_1204_]
		    = is[i_1203_ + i_1204_];
	}
    }
    
    void method3640(int i, int i_1205_, int i_1206_, int i_1207_, int i_1208_,
		    int i_1209_, int i_1210_, int i_1211_) {
	if (((Class168_Sub2_Sub1) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	if (i_1206_ > 0 && i_1207_ > 0) {
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (is != null) {
		int i_1212_ = 0;
		int i_1213_ = 0;
		int i_1214_
		    = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					 .aClass103_Sub2_9904)).anInt9260
		       * -1826993761);
		int i_1215_ = (((Class168_Sub2_Sub1) this).anInt9907
			       + ((Class168_Sub2_Sub1) this).anInt9920
			       + ((Class168_Sub2_Sub1) this).anInt9909);
		int i_1216_ = (((Class168_Sub2_Sub1) this).anInt9905
			       + ((Class168_Sub2_Sub1) this).anInt9916
			       + ((Class168_Sub2_Sub1) this).anInt9910);
		int i_1217_ = (i_1215_ << 16) / i_1206_;
		int i_1218_ = (i_1216_ << 16) / i_1207_;
		if (((Class168_Sub2_Sub1) this).anInt9907 > 0) {
		    int i_1219_
			= (((((Class168_Sub2_Sub1) this).anInt9907 << 16)
			    + i_1217_ - 1)
			   / i_1217_);
		    i += i_1219_;
		    i_1212_
			+= (i_1219_ * i_1217_
			    - (((Class168_Sub2_Sub1) this).anInt9907 << 16));
		}
		if (((Class168_Sub2_Sub1) this).anInt9905 > 0) {
		    int i_1220_
			= (((((Class168_Sub2_Sub1) this).anInt9905 << 16)
			    + i_1218_ - 1)
			   / i_1218_);
		    i_1205_ += i_1220_;
		    i_1213_
			+= (i_1220_ * i_1218_
			    - (((Class168_Sub2_Sub1) this).anInt9905 << 16));
		}
		if (((Class168_Sub2_Sub1) this).anInt9920 < i_1215_)
		    i_1206_ = ((((Class168_Sub2_Sub1) this).anInt9920 << 16)
			       - i_1212_ + i_1217_ - 1) / i_1217_;
		if (((Class168_Sub2_Sub1) this).anInt9916 < i_1216_)
		    i_1207_ = ((((Class168_Sub2_Sub1) this).anInt9916 << 16)
			       - i_1213_ + i_1218_ - 1) / i_1218_;
		int i_1221_ = i + i_1205_ * i_1214_;
		int i_1222_ = i_1214_ - i_1206_;
		if (i_1205_ + i_1207_
		    > (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					 .aClass103_Sub2_9904)).anInt9252
		       * 1546170165))
		    i_1207_
			-= (i_1205_ + i_1207_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
		if (i_1205_ < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9254) * -788450385) {
		    int i_1223_
			= ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					      .aClass103_Sub2_9904)).anInt9254
			    * -788450385)
			   - i_1205_);
		    i_1207_ -= i_1223_;
		    i_1221_ += i_1223_ * i_1214_;
		    i_1213_ += i_1218_ * i_1223_;
		}
		if (i + i_1206_
		    > (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					 .aClass103_Sub2_9904)).anInt9250
		       * 325436811)) {
		    int i_1224_
			= (i + i_1206_
			   - (((Class103_Sub2)
			       ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			      .anInt9250) * 325436811);
		    i_1206_ -= i_1224_;
		    i_1222_ += i_1224_;
		}
		if (i < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					   .aClass103_Sub2_9904)).anInt9249
			 * 1298750001)) {
		    int i_1225_
			= ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					      .aClass103_Sub2_9904)).anInt9249
			    * 1298750001)
			   - i);
		    i_1206_ -= i_1225_;
		    i_1221_ += i_1225_;
		    i_1212_ += i_1217_ * i_1225_;
		    i_1222_ += i_1225_;
		}
		if (i_1210_ == 0) {
		    if (i_1208_ == 1) {
			int i_1226_ = i_1212_;
			for (int i_1227_ = -i_1207_; i_1227_ < 0; i_1227_++) {
			    int i_1228_
				= ((i_1213_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1229_ = -i_1206_; i_1229_ < 0;
				 i_1229_++) {
				is[i_1221_++] = (((Class168_Sub2_Sub1) this)
						 .anIntArray10708
						 [(i_1212_ >> 16) + i_1228_]);
				i_1212_ += i_1217_;
			    }
			    i_1213_ += i_1218_;
			    i_1212_ = i_1226_;
			    i_1221_ += i_1222_;
			}
		    } else if (i_1208_ == 0) {
			int i_1230_ = (i_1209_ & 0xff0000) >> 16;
			int i_1231_ = (i_1209_ & 0xff00) >> 8;
			int i_1232_ = i_1209_ & 0xff;
			int i_1233_ = i_1212_;
			for (int i_1234_ = -i_1207_; i_1234_ < 0; i_1234_++) {
			    int i_1235_
				= ((i_1213_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1236_ = -i_1206_; i_1236_ < 0;
				 i_1236_++) {
				int i_1237_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1212_ >> 16) + i_1235_]);
				int i_1238_ = ((i_1237_ & 0xff0000) * i_1230_
					       & ~0xffffff);
				int i_1239_
				    = (i_1237_ & 0xff00) * i_1231_ & 0xff0000;
				int i_1240_
				    = (i_1237_ & 0xff) * i_1232_ & 0xff00;
				is[i_1221_++]
				    = (i_1238_ | i_1239_ | i_1240_) >>> 8;
				i_1212_ += i_1217_;
			    }
			    i_1213_ += i_1218_;
			    i_1212_ = i_1233_;
			    i_1221_ += i_1222_;
			}
		    } else if (i_1208_ == 3) {
			int i_1241_ = i_1212_;
			for (int i_1242_ = -i_1207_; i_1242_ < 0; i_1242_++) {
			    int i_1243_
				= ((i_1213_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1244_ = -i_1206_; i_1244_ < 0;
				 i_1244_++) {
				int i_1245_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1212_ >> 16) + i_1243_]);
				int i_1246_ = i_1245_ + i_1209_;
				int i_1247_ = ((i_1245_ & 0xff00ff)
					       + (i_1209_ & 0xff00ff));
				int i_1248_
				    = ((i_1247_ & 0x1000100)
				       + (i_1246_ - i_1247_ & 0x10000));
				is[i_1221_++]
				    = i_1246_ - i_1248_ | i_1248_ - (i_1248_
								     >>> 8);
				i_1212_ += i_1217_;
			    }
			    i_1213_ += i_1218_;
			    i_1212_ = i_1241_;
			    i_1221_ += i_1222_;
			}
		    } else if (i_1208_ == 2) {
			int i_1249_ = i_1209_ >>> 24;
			int i_1250_ = 256 - i_1249_;
			int i_1251_
			    = (i_1209_ & 0xff00ff) * i_1250_ & ~0xff00ff;
			int i_1252_ = (i_1209_ & 0xff00) * i_1250_ & 0xff0000;
			i_1209_ = (i_1251_ | i_1252_) >>> 8;
			int i_1253_ = i_1212_;
			for (int i_1254_ = -i_1207_; i_1254_ < 0; i_1254_++) {
			    int i_1255_
				= ((i_1213_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1256_ = -i_1206_; i_1256_ < 0;
				 i_1256_++) {
				int i_1257_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1212_ >> 16) + i_1255_]);
				i_1251_ = ((i_1257_ & 0xff00ff) * i_1249_
					   & ~0xff00ff);
				i_1252_
				    = (i_1257_ & 0xff00) * i_1249_ & 0xff0000;
				is[i_1221_++]
				    = ((i_1251_ | i_1252_) >>> 8) + i_1209_;
				i_1212_ += i_1217_;
			    }
			    i_1213_ += i_1218_;
			    i_1212_ = i_1253_;
			    i_1221_ += i_1222_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1210_ == 1) {
		    if (i_1208_ == 1) {
			int i_1258_ = i_1212_;
			for (int i_1259_ = -i_1207_; i_1259_ < 0; i_1259_++) {
			    int i_1260_
				= ((i_1213_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1261_ = -i_1206_; i_1261_ < 0;
				 i_1261_++) {
				int i_1262_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1212_ >> 16) + i_1260_]);
				if (i_1262_ != 0)
				    is[i_1221_++] = i_1262_;
				else
				    i_1221_++;
				i_1212_ += i_1217_;
			    }
			    i_1213_ += i_1218_;
			    i_1212_ = i_1258_;
			    i_1221_ += i_1222_;
			}
		    } else if (i_1208_ == 0) {
			int i_1263_ = i_1212_;
			if ((i_1209_ & 0xffffff) == 16777215) {
			    int i_1264_ = i_1209_ >>> 24;
			    int i_1265_ = 256 - i_1264_;
			    for (int i_1266_ = -i_1207_; i_1266_ < 0;
				 i_1266_++) {
				int i_1267_ = ((i_1213_ >> 16)
					       * (((Class168_Sub2_Sub1) this)
						  .anInt9920));
				for (int i_1268_ = -i_1206_; i_1268_ < 0;
				     i_1268_++) {
				    int i_1269_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_1212_ >> 16) + i_1267_]);
				    if (i_1269_ != 0) {
					int i_1270_ = is[i_1221_];
					is[i_1221_++]
					    = ((((i_1269_ & 0xff00ff) * i_1264_
						 + ((i_1270_ & 0xff00ff)
						    * i_1265_))
						& ~0xff00ff)
					       + (((i_1269_ & 0xff00) * i_1264_
						   + ((i_1270_ & 0xff00)
						      * i_1265_))
						  & 0xff0000)) >> 8;
				    } else
					i_1221_++;
				    i_1212_ += i_1217_;
				}
				i_1213_ += i_1218_;
				i_1212_ = i_1263_;
				i_1221_ += i_1222_;
			    }
			} else {
			    int i_1271_ = (i_1209_ & 0xff0000) >> 16;
			    int i_1272_ = (i_1209_ & 0xff00) >> 8;
			    int i_1273_ = i_1209_ & 0xff;
			    int i_1274_ = i_1209_ >>> 24;
			    int i_1275_ = 256 - i_1274_;
			    for (int i_1276_ = -i_1207_; i_1276_ < 0;
				 i_1276_++) {
				int i_1277_ = ((i_1213_ >> 16)
					       * (((Class168_Sub2_Sub1) this)
						  .anInt9920));
				for (int i_1278_ = -i_1206_; i_1278_ < 0;
				     i_1278_++) {
				    int i_1279_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_1212_ >> 16) + i_1277_]);
				    if (i_1279_ != 0) {
					if (i_1274_ != 255) {
					    int i_1280_
						= (((i_1279_ & 0xff0000)
						    * i_1271_)
						   & ~0xffffff);
					    int i_1281_
						= ((i_1279_ & 0xff00) * i_1272_
						   & 0xff0000);
					    int i_1282_
						= ((i_1279_ & 0xff) * i_1273_
						   & 0xff00);
					    i_1279_ = (i_1280_ | i_1281_
						       | i_1282_) >>> 8;
					    int i_1283_ = is[i_1221_];
					    is[i_1221_++]
						= (((((i_1279_ & 0xff00ff)
						      * i_1274_)
						     + ((i_1283_ & 0xff00ff)
							* i_1275_))
						    & ~0xff00ff)
						   + ((((i_1279_ & 0xff00)
							* i_1274_)
						       + ((i_1283_ & 0xff00)
							  * i_1275_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1284_
						= (((i_1279_ & 0xff0000)
						    * i_1271_)
						   & ~0xffffff);
					    int i_1285_
						= ((i_1279_ & 0xff00) * i_1272_
						   & 0xff0000);
					    int i_1286_
						= ((i_1279_ & 0xff) * i_1273_
						   & 0xff00);
					    is[i_1221_++] = (i_1284_ | i_1285_
							     | i_1286_) >>> 8;
					}
				    } else
					i_1221_++;
				    i_1212_ += i_1217_;
				}
				i_1213_ += i_1218_;
				i_1212_ = i_1263_;
				i_1221_ += i_1222_;
			    }
			}
		    } else if (i_1208_ == 3) {
			int i_1287_ = i_1212_;
			int i_1288_ = i_1209_ >>> 24;
			int i_1289_ = 256 - i_1288_;
			for (int i_1290_ = -i_1207_; i_1290_ < 0; i_1290_++) {
			    int i_1291_
				= ((i_1213_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1292_ = -i_1206_; i_1292_ < 0;
				 i_1292_++) {
				int i_1293_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1212_ >> 16) + i_1291_]);
				int i_1294_ = i_1293_ + i_1209_;
				int i_1295_ = ((i_1293_ & 0xff00ff)
					       + (i_1209_ & 0xff00ff));
				int i_1296_
				    = ((i_1295_ & 0x1000100)
				       + (i_1294_ - i_1295_ & 0x10000));
				i_1296_
				    = i_1294_ - i_1296_ | i_1296_ - (i_1296_
								     >>> 8);
				if (i_1293_ == 0 && i_1288_ != 255) {
				    i_1293_ = i_1296_;
				    i_1296_ = is[i_1221_];
				    i_1296_
					= ((((i_1293_ & 0xff00ff) * i_1288_
					     + (i_1296_ & 0xff00ff) * i_1289_)
					    & ~0xff00ff)
					   + (((i_1293_ & 0xff00) * i_1288_
					       + (i_1296_ & 0xff00) * i_1289_)
					      & 0xff0000)) >> 8;
				}
				is[i_1221_++] = i_1296_;
				i_1212_ += i_1217_;
			    }
			    i_1213_ += i_1218_;
			    i_1212_ = i_1287_;
			    i_1221_ += i_1222_;
			}
		    } else if (i_1208_ == 2) {
			int i_1297_ = i_1209_ >>> 24;
			int i_1298_ = 256 - i_1297_;
			int i_1299_
			    = (i_1209_ & 0xff00ff) * i_1298_ & ~0xff00ff;
			int i_1300_ = (i_1209_ & 0xff00) * i_1298_ & 0xff0000;
			i_1209_ = (i_1299_ | i_1300_) >>> 8;
			int i_1301_ = i_1212_;
			for (int i_1302_ = -i_1207_; i_1302_ < 0; i_1302_++) {
			    int i_1303_
				= ((i_1213_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1304_ = -i_1206_; i_1304_ < 0;
				 i_1304_++) {
				int i_1305_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1212_ >> 16) + i_1303_]);
				if (i_1305_ != 0) {
				    i_1299_ = ((i_1305_ & 0xff00ff) * i_1297_
					       & ~0xff00ff);
				    i_1300_ = ((i_1305_ & 0xff00) * i_1297_
					       & 0xff0000);
				    is[i_1221_++] = ((i_1299_ | i_1300_)
						     >>> 8) + i_1209_;
				} else
				    i_1221_++;
				i_1212_ += i_1217_;
			    }
			    i_1213_ += i_1218_;
			    i_1212_ = i_1301_;
			    i_1221_ += i_1222_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1210_ == 2) {
		    if (i_1208_ == 1) {
			int i_1306_ = i_1212_;
			for (int i_1307_ = -i_1207_; i_1307_ < 0; i_1307_++) {
			    int i_1308_
				= ((i_1213_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1309_ = -i_1206_; i_1309_ < 0;
				 i_1309_++) {
				int i_1310_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1212_ >> 16) + i_1308_]);
				if (i_1310_ != 0) {
				    int i_1311_ = is[i_1221_];
				    int i_1312_ = i_1310_ + i_1311_;
				    int i_1313_ = ((i_1310_ & 0xff00ff)
						   + (i_1311_ & 0xff00ff));
				    i_1311_
					= ((i_1313_ & 0x1000100)
					   + (i_1312_ - i_1313_ & 0x10000));
				    is[i_1221_++]
					= (i_1312_ - i_1311_
					   | i_1311_ - (i_1311_ >>> 8));
				} else
				    i_1221_++;
				i_1212_ += i_1217_;
			    }
			    i_1213_ += i_1218_;
			    i_1212_ = i_1306_;
			    i_1221_ += i_1222_;
			}
		    } else if (i_1208_ == 0) {
			int i_1314_ = i_1212_;
			int i_1315_ = (i_1209_ & 0xff0000) >> 16;
			int i_1316_ = (i_1209_ & 0xff00) >> 8;
			int i_1317_ = i_1209_ & 0xff;
			for (int i_1318_ = -i_1207_; i_1318_ < 0; i_1318_++) {
			    int i_1319_
				= ((i_1213_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1320_ = -i_1206_; i_1320_ < 0;
				 i_1320_++) {
				int i_1321_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1212_ >> 16) + i_1319_]);
				if (i_1321_ != 0) {
				    int i_1322_
					= ((i_1321_ & 0xff0000) * i_1315_
					   & ~0xffffff);
				    int i_1323_ = ((i_1321_ & 0xff00) * i_1316_
						   & 0xff0000);
				    int i_1324_
					= (i_1321_ & 0xff) * i_1317_ & 0xff00;
				    i_1321_
					= (i_1322_ | i_1323_ | i_1324_) >>> 8;
				    int i_1325_ = is[i_1221_];
				    int i_1326_ = i_1321_ + i_1325_;
				    int i_1327_ = ((i_1321_ & 0xff00ff)
						   + (i_1325_ & 0xff00ff));
				    i_1325_
					= ((i_1327_ & 0x1000100)
					   + (i_1326_ - i_1327_ & 0x10000));
				    is[i_1221_++]
					= (i_1326_ - i_1325_
					   | i_1325_ - (i_1325_ >>> 8));
				} else
				    i_1221_++;
				i_1212_ += i_1217_;
			    }
			    i_1213_ += i_1218_;
			    i_1212_ = i_1314_;
			    i_1221_ += i_1222_;
			}
		    } else if (i_1208_ == 3) {
			int i_1328_ = i_1212_;
			for (int i_1329_ = -i_1207_; i_1329_ < 0; i_1329_++) {
			    int i_1330_
				= ((i_1213_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1331_ = -i_1206_; i_1331_ < 0;
				 i_1331_++) {
				int i_1332_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1212_ >> 16) + i_1330_]);
				int i_1333_ = i_1332_ + i_1209_;
				int i_1334_ = ((i_1332_ & 0xff00ff)
					       + (i_1209_ & 0xff00ff));
				int i_1335_
				    = ((i_1334_ & 0x1000100)
				       + (i_1333_ - i_1334_ & 0x10000));
				i_1332_
				    = i_1333_ - i_1335_ | i_1335_ - (i_1335_
								     >>> 8);
				i_1335_ = is[i_1221_];
				i_1333_ = i_1332_ + i_1335_;
				i_1334_ = (i_1332_ & 0xff00ff) + (i_1335_
								  & 0xff00ff);
				i_1335_ = ((i_1334_ & 0x1000100)
					   + (i_1333_ - i_1334_ & 0x10000));
				is[i_1221_++]
				    = i_1333_ - i_1335_ | i_1335_ - (i_1335_
								     >>> 8);
				i_1212_ += i_1217_;
			    }
			    i_1213_ += i_1218_;
			    i_1212_ = i_1328_;
			    i_1221_ += i_1222_;
			}
		    } else if (i_1208_ == 2) {
			int i_1336_ = i_1209_ >>> 24;
			int i_1337_ = 256 - i_1336_;
			int i_1338_
			    = (i_1209_ & 0xff00ff) * i_1337_ & ~0xff00ff;
			int i_1339_ = (i_1209_ & 0xff00) * i_1337_ & 0xff0000;
			i_1209_ = (i_1338_ | i_1339_) >>> 8;
			int i_1340_ = i_1212_;
			for (int i_1341_ = -i_1207_; i_1341_ < 0; i_1341_++) {
			    int i_1342_
				= ((i_1213_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1343_ = -i_1206_; i_1343_ < 0;
				 i_1343_++) {
				int i_1344_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1212_ >> 16) + i_1342_]);
				if (i_1344_ != 0) {
				    i_1338_ = ((i_1344_ & 0xff00ff) * i_1336_
					       & ~0xff00ff);
				    i_1339_ = ((i_1344_ & 0xff00) * i_1336_
					       & 0xff0000);
				    i_1344_ = (((i_1338_ | i_1339_) >>> 8)
					       + i_1209_);
				    int i_1345_ = is[i_1221_];
				    int i_1346_ = i_1344_ + i_1345_;
				    int i_1347_ = ((i_1344_ & 0xff00ff)
						   + (i_1345_ & 0xff00ff));
				    i_1345_
					= ((i_1347_ & 0x1000100)
					   + (i_1346_ - i_1347_ & 0x10000));
				    is[i_1221_++]
					= (i_1346_ - i_1345_
					   | i_1345_ - (i_1345_ >>> 8));
				} else
				    i_1221_++;
				i_1212_ += i_1217_;
			    }
			    i_1213_ += i_1218_;
			    i_1212_ = i_1340_;
			    i_1221_ += i_1222_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method3641(int i, int i_1348_, int i_1349_, int i_1350_, int i_1351_,
		    int i_1352_, int i_1353_, int i_1354_) {
	if (((Class168_Sub2_Sub1) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	if (i_1349_ > 0 && i_1350_ > 0) {
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (is != null) {
		int i_1355_ = 0;
		int i_1356_ = 0;
		int i_1357_
		    = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					 .aClass103_Sub2_9904)).anInt9260
		       * -1826993761);
		int i_1358_ = (((Class168_Sub2_Sub1) this).anInt9907
			       + ((Class168_Sub2_Sub1) this).anInt9920
			       + ((Class168_Sub2_Sub1) this).anInt9909);
		int i_1359_ = (((Class168_Sub2_Sub1) this).anInt9905
			       + ((Class168_Sub2_Sub1) this).anInt9916
			       + ((Class168_Sub2_Sub1) this).anInt9910);
		int i_1360_ = (i_1358_ << 16) / i_1349_;
		int i_1361_ = (i_1359_ << 16) / i_1350_;
		if (((Class168_Sub2_Sub1) this).anInt9907 > 0) {
		    int i_1362_
			= (((((Class168_Sub2_Sub1) this).anInt9907 << 16)
			    + i_1360_ - 1)
			   / i_1360_);
		    i += i_1362_;
		    i_1355_
			+= (i_1362_ * i_1360_
			    - (((Class168_Sub2_Sub1) this).anInt9907 << 16));
		}
		if (((Class168_Sub2_Sub1) this).anInt9905 > 0) {
		    int i_1363_
			= (((((Class168_Sub2_Sub1) this).anInt9905 << 16)
			    + i_1361_ - 1)
			   / i_1361_);
		    i_1348_ += i_1363_;
		    i_1356_
			+= (i_1363_ * i_1361_
			    - (((Class168_Sub2_Sub1) this).anInt9905 << 16));
		}
		if (((Class168_Sub2_Sub1) this).anInt9920 < i_1358_)
		    i_1349_ = ((((Class168_Sub2_Sub1) this).anInt9920 << 16)
			       - i_1355_ + i_1360_ - 1) / i_1360_;
		if (((Class168_Sub2_Sub1) this).anInt9916 < i_1359_)
		    i_1350_ = ((((Class168_Sub2_Sub1) this).anInt9916 << 16)
			       - i_1356_ + i_1361_ - 1) / i_1361_;
		int i_1364_ = i + i_1348_ * i_1357_;
		int i_1365_ = i_1357_ - i_1349_;
		if (i_1348_ + i_1350_
		    > (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					 .aClass103_Sub2_9904)).anInt9252
		       * 1546170165))
		    i_1350_
			-= (i_1348_ + i_1350_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
		if (i_1348_ < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9254) * -788450385) {
		    int i_1366_
			= ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					      .aClass103_Sub2_9904)).anInt9254
			    * -788450385)
			   - i_1348_);
		    i_1350_ -= i_1366_;
		    i_1364_ += i_1366_ * i_1357_;
		    i_1356_ += i_1361_ * i_1366_;
		}
		if (i + i_1349_
		    > (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					 .aClass103_Sub2_9904)).anInt9250
		       * 325436811)) {
		    int i_1367_
			= (i + i_1349_
			   - (((Class103_Sub2)
			       ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			      .anInt9250) * 325436811);
		    i_1349_ -= i_1367_;
		    i_1365_ += i_1367_;
		}
		if (i < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					   .aClass103_Sub2_9904)).anInt9249
			 * 1298750001)) {
		    int i_1368_
			= ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					      .aClass103_Sub2_9904)).anInt9249
			    * 1298750001)
			   - i);
		    i_1349_ -= i_1368_;
		    i_1364_ += i_1368_;
		    i_1355_ += i_1360_ * i_1368_;
		    i_1365_ += i_1368_;
		}
		if (i_1353_ == 0) {
		    if (i_1351_ == 1) {
			int i_1369_ = i_1355_;
			for (int i_1370_ = -i_1350_; i_1370_ < 0; i_1370_++) {
			    int i_1371_
				= ((i_1356_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1372_ = -i_1349_; i_1372_ < 0;
				 i_1372_++) {
				is[i_1364_++] = (((Class168_Sub2_Sub1) this)
						 .anIntArray10708
						 [(i_1355_ >> 16) + i_1371_]);
				i_1355_ += i_1360_;
			    }
			    i_1356_ += i_1361_;
			    i_1355_ = i_1369_;
			    i_1364_ += i_1365_;
			}
		    } else if (i_1351_ == 0) {
			int i_1373_ = (i_1352_ & 0xff0000) >> 16;
			int i_1374_ = (i_1352_ & 0xff00) >> 8;
			int i_1375_ = i_1352_ & 0xff;
			int i_1376_ = i_1355_;
			for (int i_1377_ = -i_1350_; i_1377_ < 0; i_1377_++) {
			    int i_1378_
				= ((i_1356_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1379_ = -i_1349_; i_1379_ < 0;
				 i_1379_++) {
				int i_1380_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1355_ >> 16) + i_1378_]);
				int i_1381_ = ((i_1380_ & 0xff0000) * i_1373_
					       & ~0xffffff);
				int i_1382_
				    = (i_1380_ & 0xff00) * i_1374_ & 0xff0000;
				int i_1383_
				    = (i_1380_ & 0xff) * i_1375_ & 0xff00;
				is[i_1364_++]
				    = (i_1381_ | i_1382_ | i_1383_) >>> 8;
				i_1355_ += i_1360_;
			    }
			    i_1356_ += i_1361_;
			    i_1355_ = i_1376_;
			    i_1364_ += i_1365_;
			}
		    } else if (i_1351_ == 3) {
			int i_1384_ = i_1355_;
			for (int i_1385_ = -i_1350_; i_1385_ < 0; i_1385_++) {
			    int i_1386_
				= ((i_1356_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1387_ = -i_1349_; i_1387_ < 0;
				 i_1387_++) {
				int i_1388_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1355_ >> 16) + i_1386_]);
				int i_1389_ = i_1388_ + i_1352_;
				int i_1390_ = ((i_1388_ & 0xff00ff)
					       + (i_1352_ & 0xff00ff));
				int i_1391_
				    = ((i_1390_ & 0x1000100)
				       + (i_1389_ - i_1390_ & 0x10000));
				is[i_1364_++]
				    = i_1389_ - i_1391_ | i_1391_ - (i_1391_
								     >>> 8);
				i_1355_ += i_1360_;
			    }
			    i_1356_ += i_1361_;
			    i_1355_ = i_1384_;
			    i_1364_ += i_1365_;
			}
		    } else if (i_1351_ == 2) {
			int i_1392_ = i_1352_ >>> 24;
			int i_1393_ = 256 - i_1392_;
			int i_1394_
			    = (i_1352_ & 0xff00ff) * i_1393_ & ~0xff00ff;
			int i_1395_ = (i_1352_ & 0xff00) * i_1393_ & 0xff0000;
			i_1352_ = (i_1394_ | i_1395_) >>> 8;
			int i_1396_ = i_1355_;
			for (int i_1397_ = -i_1350_; i_1397_ < 0; i_1397_++) {
			    int i_1398_
				= ((i_1356_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1399_ = -i_1349_; i_1399_ < 0;
				 i_1399_++) {
				int i_1400_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1355_ >> 16) + i_1398_]);
				i_1394_ = ((i_1400_ & 0xff00ff) * i_1392_
					   & ~0xff00ff);
				i_1395_
				    = (i_1400_ & 0xff00) * i_1392_ & 0xff0000;
				is[i_1364_++]
				    = ((i_1394_ | i_1395_) >>> 8) + i_1352_;
				i_1355_ += i_1360_;
			    }
			    i_1356_ += i_1361_;
			    i_1355_ = i_1396_;
			    i_1364_ += i_1365_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1353_ == 1) {
		    if (i_1351_ == 1) {
			int i_1401_ = i_1355_;
			for (int i_1402_ = -i_1350_; i_1402_ < 0; i_1402_++) {
			    int i_1403_
				= ((i_1356_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1404_ = -i_1349_; i_1404_ < 0;
				 i_1404_++) {
				int i_1405_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1355_ >> 16) + i_1403_]);
				if (i_1405_ != 0)
				    is[i_1364_++] = i_1405_;
				else
				    i_1364_++;
				i_1355_ += i_1360_;
			    }
			    i_1356_ += i_1361_;
			    i_1355_ = i_1401_;
			    i_1364_ += i_1365_;
			}
		    } else if (i_1351_ == 0) {
			int i_1406_ = i_1355_;
			if ((i_1352_ & 0xffffff) == 16777215) {
			    int i_1407_ = i_1352_ >>> 24;
			    int i_1408_ = 256 - i_1407_;
			    for (int i_1409_ = -i_1350_; i_1409_ < 0;
				 i_1409_++) {
				int i_1410_ = ((i_1356_ >> 16)
					       * (((Class168_Sub2_Sub1) this)
						  .anInt9920));
				for (int i_1411_ = -i_1349_; i_1411_ < 0;
				     i_1411_++) {
				    int i_1412_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_1355_ >> 16) + i_1410_]);
				    if (i_1412_ != 0) {
					int i_1413_ = is[i_1364_];
					is[i_1364_++]
					    = ((((i_1412_ & 0xff00ff) * i_1407_
						 + ((i_1413_ & 0xff00ff)
						    * i_1408_))
						& ~0xff00ff)
					       + (((i_1412_ & 0xff00) * i_1407_
						   + ((i_1413_ & 0xff00)
						      * i_1408_))
						  & 0xff0000)) >> 8;
				    } else
					i_1364_++;
				    i_1355_ += i_1360_;
				}
				i_1356_ += i_1361_;
				i_1355_ = i_1406_;
				i_1364_ += i_1365_;
			    }
			} else {
			    int i_1414_ = (i_1352_ & 0xff0000) >> 16;
			    int i_1415_ = (i_1352_ & 0xff00) >> 8;
			    int i_1416_ = i_1352_ & 0xff;
			    int i_1417_ = i_1352_ >>> 24;
			    int i_1418_ = 256 - i_1417_;
			    for (int i_1419_ = -i_1350_; i_1419_ < 0;
				 i_1419_++) {
				int i_1420_ = ((i_1356_ >> 16)
					       * (((Class168_Sub2_Sub1) this)
						  .anInt9920));
				for (int i_1421_ = -i_1349_; i_1421_ < 0;
				     i_1421_++) {
				    int i_1422_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_1355_ >> 16) + i_1420_]);
				    if (i_1422_ != 0) {
					if (i_1417_ != 255) {
					    int i_1423_
						= (((i_1422_ & 0xff0000)
						    * i_1414_)
						   & ~0xffffff);
					    int i_1424_
						= ((i_1422_ & 0xff00) * i_1415_
						   & 0xff0000);
					    int i_1425_
						= ((i_1422_ & 0xff) * i_1416_
						   & 0xff00);
					    i_1422_ = (i_1423_ | i_1424_
						       | i_1425_) >>> 8;
					    int i_1426_ = is[i_1364_];
					    is[i_1364_++]
						= (((((i_1422_ & 0xff00ff)
						      * i_1417_)
						     + ((i_1426_ & 0xff00ff)
							* i_1418_))
						    & ~0xff00ff)
						   + ((((i_1422_ & 0xff00)
							* i_1417_)
						       + ((i_1426_ & 0xff00)
							  * i_1418_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1427_
						= (((i_1422_ & 0xff0000)
						    * i_1414_)
						   & ~0xffffff);
					    int i_1428_
						= ((i_1422_ & 0xff00) * i_1415_
						   & 0xff0000);
					    int i_1429_
						= ((i_1422_ & 0xff) * i_1416_
						   & 0xff00);
					    is[i_1364_++] = (i_1427_ | i_1428_
							     | i_1429_) >>> 8;
					}
				    } else
					i_1364_++;
				    i_1355_ += i_1360_;
				}
				i_1356_ += i_1361_;
				i_1355_ = i_1406_;
				i_1364_ += i_1365_;
			    }
			}
		    } else if (i_1351_ == 3) {
			int i_1430_ = i_1355_;
			int i_1431_ = i_1352_ >>> 24;
			int i_1432_ = 256 - i_1431_;
			for (int i_1433_ = -i_1350_; i_1433_ < 0; i_1433_++) {
			    int i_1434_
				= ((i_1356_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1435_ = -i_1349_; i_1435_ < 0;
				 i_1435_++) {
				int i_1436_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1355_ >> 16) + i_1434_]);
				int i_1437_ = i_1436_ + i_1352_;
				int i_1438_ = ((i_1436_ & 0xff00ff)
					       + (i_1352_ & 0xff00ff));
				int i_1439_
				    = ((i_1438_ & 0x1000100)
				       + (i_1437_ - i_1438_ & 0x10000));
				i_1439_
				    = i_1437_ - i_1439_ | i_1439_ - (i_1439_
								     >>> 8);
				if (i_1436_ == 0 && i_1431_ != 255) {
				    i_1436_ = i_1439_;
				    i_1439_ = is[i_1364_];
				    i_1439_
					= ((((i_1436_ & 0xff00ff) * i_1431_
					     + (i_1439_ & 0xff00ff) * i_1432_)
					    & ~0xff00ff)
					   + (((i_1436_ & 0xff00) * i_1431_
					       + (i_1439_ & 0xff00) * i_1432_)
					      & 0xff0000)) >> 8;
				}
				is[i_1364_++] = i_1439_;
				i_1355_ += i_1360_;
			    }
			    i_1356_ += i_1361_;
			    i_1355_ = i_1430_;
			    i_1364_ += i_1365_;
			}
		    } else if (i_1351_ == 2) {
			int i_1440_ = i_1352_ >>> 24;
			int i_1441_ = 256 - i_1440_;
			int i_1442_
			    = (i_1352_ & 0xff00ff) * i_1441_ & ~0xff00ff;
			int i_1443_ = (i_1352_ & 0xff00) * i_1441_ & 0xff0000;
			i_1352_ = (i_1442_ | i_1443_) >>> 8;
			int i_1444_ = i_1355_;
			for (int i_1445_ = -i_1350_; i_1445_ < 0; i_1445_++) {
			    int i_1446_
				= ((i_1356_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1447_ = -i_1349_; i_1447_ < 0;
				 i_1447_++) {
				int i_1448_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1355_ >> 16) + i_1446_]);
				if (i_1448_ != 0) {
				    i_1442_ = ((i_1448_ & 0xff00ff) * i_1440_
					       & ~0xff00ff);
				    i_1443_ = ((i_1448_ & 0xff00) * i_1440_
					       & 0xff0000);
				    is[i_1364_++] = ((i_1442_ | i_1443_)
						     >>> 8) + i_1352_;
				} else
				    i_1364_++;
				i_1355_ += i_1360_;
			    }
			    i_1356_ += i_1361_;
			    i_1355_ = i_1444_;
			    i_1364_ += i_1365_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1353_ == 2) {
		    if (i_1351_ == 1) {
			int i_1449_ = i_1355_;
			for (int i_1450_ = -i_1350_; i_1450_ < 0; i_1450_++) {
			    int i_1451_
				= ((i_1356_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1452_ = -i_1349_; i_1452_ < 0;
				 i_1452_++) {
				int i_1453_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1355_ >> 16) + i_1451_]);
				if (i_1453_ != 0) {
				    int i_1454_ = is[i_1364_];
				    int i_1455_ = i_1453_ + i_1454_;
				    int i_1456_ = ((i_1453_ & 0xff00ff)
						   + (i_1454_ & 0xff00ff));
				    i_1454_
					= ((i_1456_ & 0x1000100)
					   + (i_1455_ - i_1456_ & 0x10000));
				    is[i_1364_++]
					= (i_1455_ - i_1454_
					   | i_1454_ - (i_1454_ >>> 8));
				} else
				    i_1364_++;
				i_1355_ += i_1360_;
			    }
			    i_1356_ += i_1361_;
			    i_1355_ = i_1449_;
			    i_1364_ += i_1365_;
			}
		    } else if (i_1351_ == 0) {
			int i_1457_ = i_1355_;
			int i_1458_ = (i_1352_ & 0xff0000) >> 16;
			int i_1459_ = (i_1352_ & 0xff00) >> 8;
			int i_1460_ = i_1352_ & 0xff;
			for (int i_1461_ = -i_1350_; i_1461_ < 0; i_1461_++) {
			    int i_1462_
				= ((i_1356_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1463_ = -i_1349_; i_1463_ < 0;
				 i_1463_++) {
				int i_1464_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1355_ >> 16) + i_1462_]);
				if (i_1464_ != 0) {
				    int i_1465_
					= ((i_1464_ & 0xff0000) * i_1458_
					   & ~0xffffff);
				    int i_1466_ = ((i_1464_ & 0xff00) * i_1459_
						   & 0xff0000);
				    int i_1467_
					= (i_1464_ & 0xff) * i_1460_ & 0xff00;
				    i_1464_
					= (i_1465_ | i_1466_ | i_1467_) >>> 8;
				    int i_1468_ = is[i_1364_];
				    int i_1469_ = i_1464_ + i_1468_;
				    int i_1470_ = ((i_1464_ & 0xff00ff)
						   + (i_1468_ & 0xff00ff));
				    i_1468_
					= ((i_1470_ & 0x1000100)
					   + (i_1469_ - i_1470_ & 0x10000));
				    is[i_1364_++]
					= (i_1469_ - i_1468_
					   | i_1468_ - (i_1468_ >>> 8));
				} else
				    i_1364_++;
				i_1355_ += i_1360_;
			    }
			    i_1356_ += i_1361_;
			    i_1355_ = i_1457_;
			    i_1364_ += i_1365_;
			}
		    } else if (i_1351_ == 3) {
			int i_1471_ = i_1355_;
			for (int i_1472_ = -i_1350_; i_1472_ < 0; i_1472_++) {
			    int i_1473_
				= ((i_1356_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1474_ = -i_1349_; i_1474_ < 0;
				 i_1474_++) {
				int i_1475_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1355_ >> 16) + i_1473_]);
				int i_1476_ = i_1475_ + i_1352_;
				int i_1477_ = ((i_1475_ & 0xff00ff)
					       + (i_1352_ & 0xff00ff));
				int i_1478_
				    = ((i_1477_ & 0x1000100)
				       + (i_1476_ - i_1477_ & 0x10000));
				i_1475_
				    = i_1476_ - i_1478_ | i_1478_ - (i_1478_
								     >>> 8);
				i_1478_ = is[i_1364_];
				i_1476_ = i_1475_ + i_1478_;
				i_1477_ = (i_1475_ & 0xff00ff) + (i_1478_
								  & 0xff00ff);
				i_1478_ = ((i_1477_ & 0x1000100)
					   + (i_1476_ - i_1477_ & 0x10000));
				is[i_1364_++]
				    = i_1476_ - i_1478_ | i_1478_ - (i_1478_
								     >>> 8);
				i_1355_ += i_1360_;
			    }
			    i_1356_ += i_1361_;
			    i_1355_ = i_1471_;
			    i_1364_ += i_1365_;
			}
		    } else if (i_1351_ == 2) {
			int i_1479_ = i_1352_ >>> 24;
			int i_1480_ = 256 - i_1479_;
			int i_1481_
			    = (i_1352_ & 0xff00ff) * i_1480_ & ~0xff00ff;
			int i_1482_ = (i_1352_ & 0xff00) * i_1480_ & 0xff0000;
			i_1352_ = (i_1481_ | i_1482_) >>> 8;
			int i_1483_ = i_1355_;
			for (int i_1484_ = -i_1350_; i_1484_ < 0; i_1484_++) {
			    int i_1485_
				= ((i_1356_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1486_ = -i_1349_; i_1486_ < 0;
				 i_1486_++) {
				int i_1487_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1355_ >> 16) + i_1485_]);
				if (i_1487_ != 0) {
				    i_1481_ = ((i_1487_ & 0xff00ff) * i_1479_
					       & ~0xff00ff);
				    i_1482_ = ((i_1487_ & 0xff00) * i_1479_
					       & 0xff0000);
				    i_1487_ = (((i_1481_ | i_1482_) >>> 8)
					       + i_1352_);
				    int i_1488_ = is[i_1364_];
				    int i_1489_ = i_1487_ + i_1488_;
				    int i_1490_ = ((i_1487_ & 0xff00ff)
						   + (i_1488_ & 0xff00ff));
				    i_1488_
					= ((i_1490_ & 0x1000100)
					   + (i_1489_ - i_1490_ & 0x10000));
				    is[i_1364_++]
					= (i_1489_ - i_1488_
					   | i_1488_ - (i_1488_ >>> 8));
				} else
				    i_1364_++;
				i_1355_ += i_1360_;
			    }
			    i_1356_ += i_1361_;
			    i_1355_ = i_1483_;
			    i_1364_ += i_1365_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method16222(int i, int i_1491_) {
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_1492_ = anInt9919;
		    while (i_1492_ < 0) {
			int i_1493_ = anInt9925;
			int i_1494_ = anInt9927;
			int i_1495_ = anInt9928;
			int i_1496_ = anInt9906;
			if (i_1494_ >= 0 && i_1495_ >= 0
			    && i_1494_ - (((Class168_Sub2_Sub1) this).anInt9920
					  << 12) < 0
			    && i_1495_ - (((Class168_Sub2_Sub1) this).anInt9916
					  << 12) < 0) {
			    for (/**/; i_1496_ < 0; i_1496_++)
				method16968(((i_1495_ >> 12)
					     * (((Class168_Sub2_Sub1) this)
						.anInt9920)) + (i_1494_ >> 12),
					    i_1493_++, is, i, i_1491_);
			}
			i_1492_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_1497_ = anInt9919;
		    while (i_1497_ < 0) {
			int i_1498_ = anInt9925;
			int i_1499_ = anInt9927;
			int i_1500_ = anInt9928 + anInt9930;
			int i_1501_ = anInt9906;
			if (i_1499_ >= 0
			    && i_1499_ - (((Class168_Sub2_Sub1) this).anInt9920
					  << 12) < 0) {
			    int i_1502_;
			    if ((i_1502_
				 = (i_1500_
				    - (((Class168_Sub2_Sub1) this).anInt9916
				       << 12)))
				>= 0) {
				i_1502_ = (anInt9922 - i_1502_) / anInt9922;
				i_1501_ += i_1502_;
				i_1500_ += anInt9922 * i_1502_;
				i_1498_ += i_1502_;
			    }
			    if ((i_1502_ = (i_1500_ - anInt9922) / anInt9922)
				> i_1501_)
				i_1501_ = i_1502_;
			    for (/**/; i_1501_ < 0; i_1501_++) {
				method16968(((i_1500_ >> 12)
					     * (((Class168_Sub2_Sub1) this)
						.anInt9920)) + (i_1499_ >> 12),
					    i_1498_++, is, i, i_1491_);
				i_1500_ += anInt9922;
			    }
			}
			i_1497_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_1503_ = anInt9919;
		    while (i_1503_ < 0) {
			int i_1504_ = anInt9925;
			int i_1505_ = anInt9927;
			int i_1506_ = anInt9928 + anInt9930;
			int i_1507_ = anInt9906;
			if (i_1505_ >= 0
			    && i_1505_ - (((Class168_Sub2_Sub1) this).anInt9920
					  << 12) < 0) {
			    if (i_1506_ < 0) {
				int i_1508_
				    = (anInt9922 - 1 - i_1506_) / anInt9922;
				i_1507_ += i_1508_;
				i_1506_ += anInt9922 * i_1508_;
				i_1504_ += i_1508_;
			    }
			    int i_1509_;
			    if ((i_1509_
				 = (1 + i_1506_
				    - (((Class168_Sub2_Sub1) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_1507_)
				i_1507_ = i_1509_;
			    for (/**/; i_1507_ < 0; i_1507_++) {
				method16968(((i_1506_ >> 12)
					     * (((Class168_Sub2_Sub1) this)
						.anInt9920)) + (i_1505_ >> 12),
					    i_1504_++, is, i, i_1491_);
				i_1506_ += anInt9922;
			    }
			}
			i_1503_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_1510_ = anInt9919;
		    while (i_1510_ < 0) {
			int i_1511_ = anInt9925;
			int i_1512_ = anInt9927 + anInt9929;
			int i_1513_ = anInt9928;
			int i_1514_ = anInt9906;
			if (i_1513_ >= 0
			    && i_1513_ - (((Class168_Sub2_Sub1) this).anInt9916
					  << 12) < 0) {
			    int i_1515_;
			    if ((i_1515_
				 = (i_1512_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)))
				>= 0) {
				i_1515_ = (anInt9921 - i_1515_) / anInt9921;
				i_1514_ += i_1515_;
				i_1512_ += anInt9921 * i_1515_;
				i_1511_ += i_1515_;
			    }
			    if ((i_1515_ = (i_1512_ - anInt9921) / anInt9921)
				> i_1514_)
				i_1514_ = i_1515_;
			    for (/**/; i_1514_ < 0; i_1514_++) {
				method16968(((i_1513_ >> 12)
					     * (((Class168_Sub2_Sub1) this)
						.anInt9920)) + (i_1512_ >> 12),
					    i_1511_++, is, i, i_1491_);
				i_1512_ += anInt9921;
			    }
			}
			i_1510_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_1516_ = anInt9919;
		    while (i_1516_ < 0) {
			int i_1517_ = anInt9925;
			int i_1518_ = anInt9927 + anInt9929;
			int i_1519_ = anInt9928 + anInt9930;
			int i_1520_ = anInt9906;
			int i_1521_;
			if ((i_1521_
			     = i_1518_ - (((Class168_Sub2_Sub1) this).anInt9920
					  << 12))
			    >= 0) {
			    i_1521_ = (anInt9921 - i_1521_) / anInt9921;
			    i_1520_ += i_1521_;
			    i_1518_ += anInt9921 * i_1521_;
			    i_1519_ += anInt9922 * i_1521_;
			    i_1517_ += i_1521_;
			}
			if ((i_1521_ = (i_1518_ - anInt9921) / anInt9921)
			    > i_1520_)
			    i_1520_ = i_1521_;
			if ((i_1521_
			     = i_1519_ - (((Class168_Sub2_Sub1) this).anInt9916
					  << 12))
			    >= 0) {
			    i_1521_ = (anInt9922 - i_1521_) / anInt9922;
			    i_1520_ += i_1521_;
			    i_1518_ += anInt9921 * i_1521_;
			    i_1519_ += anInt9922 * i_1521_;
			    i_1517_ += i_1521_;
			}
			if ((i_1521_ = (i_1519_ - anInt9922) / anInt9922)
			    > i_1520_)
			    i_1520_ = i_1521_;
			for (/**/; i_1520_ < 0; i_1520_++) {
			    method16968(((i_1519_ >> 12)
					 * (((Class168_Sub2_Sub1) this)
					    .anInt9920)) + (i_1518_ >> 12),
					i_1517_++, is, i, i_1491_);
			    i_1518_ += anInt9921;
			    i_1519_ += anInt9922;
			}
			i_1516_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_1522_ = anInt9919;
		    while (i_1522_ < 0) {
			int i_1523_ = anInt9925;
			int i_1524_ = anInt9927 + anInt9929;
			int i_1525_ = anInt9928 + anInt9930;
			int i_1526_ = anInt9906;
			int i_1527_;
			if ((i_1527_
			     = i_1524_ - (((Class168_Sub2_Sub1) this).anInt9920
					  << 12))
			    >= 0) {
			    i_1527_ = (anInt9921 - i_1527_) / anInt9921;
			    i_1526_ += i_1527_;
			    i_1524_ += anInt9921 * i_1527_;
			    i_1525_ += anInt9922 * i_1527_;
			    i_1523_ += i_1527_;
			}
			if ((i_1527_ = (i_1524_ - anInt9921) / anInt9921)
			    > i_1526_)
			    i_1526_ = i_1527_;
			if (i_1525_ < 0) {
			    i_1527_ = (anInt9922 - 1 - i_1525_) / anInt9922;
			    i_1526_ += i_1527_;
			    i_1524_ += anInt9921 * i_1527_;
			    i_1525_ += anInt9922 * i_1527_;
			    i_1523_ += i_1527_;
			}
			if ((i_1527_
			     = (1 + i_1525_
				- (((Class168_Sub2_Sub1) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_1526_)
			    i_1526_ = i_1527_;
			for (/**/; i_1526_ < 0; i_1526_++) {
			    method16968(((i_1525_ >> 12)
					 * (((Class168_Sub2_Sub1) this)
					    .anInt9920)) + (i_1524_ >> 12),
					i_1523_++, is, i, i_1491_);
			    i_1524_ += anInt9921;
			    i_1525_ += anInt9922;
			}
			i_1522_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_1528_ = anInt9919;
		while (i_1528_ < 0) {
		    int i_1529_ = anInt9925;
		    int i_1530_ = anInt9927 + anInt9929;
		    int i_1531_ = anInt9928;
		    int i_1532_ = anInt9906;
		    if (i_1531_ >= 0
			&& i_1531_ - (((Class168_Sub2_Sub1) this).anInt9916
				      << 12) < 0) {
			if (i_1530_ < 0) {
			    int i_1533_
				= (anInt9921 - 1 - i_1530_) / anInt9921;
			    i_1532_ += i_1533_;
			    i_1530_ += anInt9921 * i_1533_;
			    i_1529_ += i_1533_;
			}
			int i_1534_;
			if ((i_1534_
			     = (1 + i_1530_
				- (((Class168_Sub2_Sub1) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_1532_)
			    i_1532_ = i_1534_;
			for (/**/; i_1532_ < 0; i_1532_++) {
			    method16968(((i_1531_ >> 12)
					 * (((Class168_Sub2_Sub1) this)
					    .anInt9920)) + (i_1530_ >> 12),
					i_1529_++, is, i, i_1491_);
			    i_1530_ += anInt9921;
			}
		    }
		    i_1528_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		for (int i_1535_ = anInt9919; i_1535_ < 0; i_1535_++) {
		    int i_1536_ = anInt9925;
		    int i_1537_ = anInt9927 + anInt9929;
		    int i_1538_ = anInt9928 + anInt9930;
		    int i_1539_ = anInt9906;
		    if (i_1537_ < 0) {
			int i_1540_ = (anInt9921 - 1 - i_1537_) / anInt9921;
			i_1539_ += i_1540_;
			i_1537_ += anInt9921 * i_1540_;
			i_1538_ += anInt9922 * i_1540_;
			i_1536_ += i_1540_;
		    }
		    int i_1541_;
		    if ((i_1541_
			 = (1 + i_1537_
			    - (((Class168_Sub2_Sub1) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_1539_)
			i_1539_ = i_1541_;
		    if ((i_1541_
			 = i_1538_ - (((Class168_Sub2_Sub1) this).anInt9916
				      << 12))
			>= 0) {
			i_1541_ = (anInt9922 - i_1541_) / anInt9922;
			i_1539_ += i_1541_;
			i_1537_ += anInt9921 * i_1541_;
			i_1538_ += anInt9922 * i_1541_;
			i_1536_ += i_1541_;
		    }
		    if ((i_1541_ = (i_1538_ - anInt9922) / anInt9922)
			> i_1539_)
			i_1539_ = i_1541_;
		    for (/**/; i_1539_ < 0; i_1539_++) {
			method16968((((i_1538_ >> 12)
				      * ((Class168_Sub2_Sub1) this).anInt9920)
				     + (i_1537_ >> 12)),
				    i_1536_++, is, i, i_1491_);
			i_1537_ += anInt9921;
			i_1538_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		for (int i_1542_ = anInt9919; i_1542_ < 0; i_1542_++) {
		    int i_1543_ = anInt9925;
		    int i_1544_ = anInt9927 + anInt9929;
		    int i_1545_ = anInt9928 + anInt9930;
		    int i_1546_ = anInt9906;
		    if (i_1544_ < 0) {
			int i_1547_ = (anInt9921 - 1 - i_1544_) / anInt9921;
			i_1546_ += i_1547_;
			i_1544_ += anInt9921 * i_1547_;
			i_1545_ += anInt9922 * i_1547_;
			i_1543_ += i_1547_;
		    }
		    int i_1548_;
		    if ((i_1548_
			 = (1 + i_1544_
			    - (((Class168_Sub2_Sub1) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_1546_)
			i_1546_ = i_1548_;
		    if (i_1545_ < 0) {
			i_1548_ = (anInt9922 - 1 - i_1545_) / anInt9922;
			i_1546_ += i_1548_;
			i_1544_ += anInt9921 * i_1548_;
			i_1545_ += anInt9922 * i_1548_;
			i_1543_ += i_1548_;
		    }
		    if ((i_1548_
			 = (1 + i_1545_
			    - (((Class168_Sub2_Sub1) this).anInt9916 << 12)
			    - anInt9922) / anInt9922)
			> i_1546_)
			i_1546_ = i_1548_;
		    for (/**/; i_1546_ < 0; i_1546_++) {
			method16968((((i_1545_ >> 12)
				      * ((Class168_Sub2_Sub1) this).anInt9920)
				     + (i_1544_ >> 12)),
				    i_1543_++, is, i, i_1491_);
			i_1544_ += anInt9921;
			i_1545_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    void method16219(int i, int i_1549_) {
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_1550_ = anInt9919;
		    while (i_1550_ < 0) {
			int i_1551_ = anInt9925;
			int i_1552_ = anInt9927;
			int i_1553_ = anInt9928;
			int i_1554_ = anInt9906;
			if (i_1552_ >= 0 && i_1553_ >= 0
			    && i_1552_ - (((Class168_Sub2_Sub1) this).anInt9920
					  << 12) < 0
			    && i_1553_ - (((Class168_Sub2_Sub1) this).anInt9916
					  << 12) < 0) {
			    for (/**/; i_1554_ < 0; i_1554_++)
				method16968(((i_1553_ >> 12)
					     * (((Class168_Sub2_Sub1) this)
						.anInt9920)) + (i_1552_ >> 12),
					    i_1551_++, is, i, i_1549_);
			}
			i_1550_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_1555_ = anInt9919;
		    while (i_1555_ < 0) {
			int i_1556_ = anInt9925;
			int i_1557_ = anInt9927;
			int i_1558_ = anInt9928 + anInt9930;
			int i_1559_ = anInt9906;
			if (i_1557_ >= 0
			    && i_1557_ - (((Class168_Sub2_Sub1) this).anInt9920
					  << 12) < 0) {
			    int i_1560_;
			    if ((i_1560_
				 = (i_1558_
				    - (((Class168_Sub2_Sub1) this).anInt9916
				       << 12)))
				>= 0) {
				i_1560_ = (anInt9922 - i_1560_) / anInt9922;
				i_1559_ += i_1560_;
				i_1558_ += anInt9922 * i_1560_;
				i_1556_ += i_1560_;
			    }
			    if ((i_1560_ = (i_1558_ - anInt9922) / anInt9922)
				> i_1559_)
				i_1559_ = i_1560_;
			    for (/**/; i_1559_ < 0; i_1559_++) {
				method16968(((i_1558_ >> 12)
					     * (((Class168_Sub2_Sub1) this)
						.anInt9920)) + (i_1557_ >> 12),
					    i_1556_++, is, i, i_1549_);
				i_1558_ += anInt9922;
			    }
			}
			i_1555_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_1561_ = anInt9919;
		    while (i_1561_ < 0) {
			int i_1562_ = anInt9925;
			int i_1563_ = anInt9927;
			int i_1564_ = anInt9928 + anInt9930;
			int i_1565_ = anInt9906;
			if (i_1563_ >= 0
			    && i_1563_ - (((Class168_Sub2_Sub1) this).anInt9920
					  << 12) < 0) {
			    if (i_1564_ < 0) {
				int i_1566_
				    = (anInt9922 - 1 - i_1564_) / anInt9922;
				i_1565_ += i_1566_;
				i_1564_ += anInt9922 * i_1566_;
				i_1562_ += i_1566_;
			    }
			    int i_1567_;
			    if ((i_1567_
				 = (1 + i_1564_
				    - (((Class168_Sub2_Sub1) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_1565_)
				i_1565_ = i_1567_;
			    for (/**/; i_1565_ < 0; i_1565_++) {
				method16968(((i_1564_ >> 12)
					     * (((Class168_Sub2_Sub1) this)
						.anInt9920)) + (i_1563_ >> 12),
					    i_1562_++, is, i, i_1549_);
				i_1564_ += anInt9922;
			    }
			}
			i_1561_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_1568_ = anInt9919;
		    while (i_1568_ < 0) {
			int i_1569_ = anInt9925;
			int i_1570_ = anInt9927 + anInt9929;
			int i_1571_ = anInt9928;
			int i_1572_ = anInt9906;
			if (i_1571_ >= 0
			    && i_1571_ - (((Class168_Sub2_Sub1) this).anInt9916
					  << 12) < 0) {
			    int i_1573_;
			    if ((i_1573_
				 = (i_1570_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)))
				>= 0) {
				i_1573_ = (anInt9921 - i_1573_) / anInt9921;
				i_1572_ += i_1573_;
				i_1570_ += anInt9921 * i_1573_;
				i_1569_ += i_1573_;
			    }
			    if ((i_1573_ = (i_1570_ - anInt9921) / anInt9921)
				> i_1572_)
				i_1572_ = i_1573_;
			    for (/**/; i_1572_ < 0; i_1572_++) {
				method16968(((i_1571_ >> 12)
					     * (((Class168_Sub2_Sub1) this)
						.anInt9920)) + (i_1570_ >> 12),
					    i_1569_++, is, i, i_1549_);
				i_1570_ += anInt9921;
			    }
			}
			i_1568_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_1574_ = anInt9919;
		    while (i_1574_ < 0) {
			int i_1575_ = anInt9925;
			int i_1576_ = anInt9927 + anInt9929;
			int i_1577_ = anInt9928 + anInt9930;
			int i_1578_ = anInt9906;
			int i_1579_;
			if ((i_1579_
			     = i_1576_ - (((Class168_Sub2_Sub1) this).anInt9920
					  << 12))
			    >= 0) {
			    i_1579_ = (anInt9921 - i_1579_) / anInt9921;
			    i_1578_ += i_1579_;
			    i_1576_ += anInt9921 * i_1579_;
			    i_1577_ += anInt9922 * i_1579_;
			    i_1575_ += i_1579_;
			}
			if ((i_1579_ = (i_1576_ - anInt9921) / anInt9921)
			    > i_1578_)
			    i_1578_ = i_1579_;
			if ((i_1579_
			     = i_1577_ - (((Class168_Sub2_Sub1) this).anInt9916
					  << 12))
			    >= 0) {
			    i_1579_ = (anInt9922 - i_1579_) / anInt9922;
			    i_1578_ += i_1579_;
			    i_1576_ += anInt9921 * i_1579_;
			    i_1577_ += anInt9922 * i_1579_;
			    i_1575_ += i_1579_;
			}
			if ((i_1579_ = (i_1577_ - anInt9922) / anInt9922)
			    > i_1578_)
			    i_1578_ = i_1579_;
			for (/**/; i_1578_ < 0; i_1578_++) {
			    method16968(((i_1577_ >> 12)
					 * (((Class168_Sub2_Sub1) this)
					    .anInt9920)) + (i_1576_ >> 12),
					i_1575_++, is, i, i_1549_);
			    i_1576_ += anInt9921;
			    i_1577_ += anInt9922;
			}
			i_1574_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_1580_ = anInt9919;
		    while (i_1580_ < 0) {
			int i_1581_ = anInt9925;
			int i_1582_ = anInt9927 + anInt9929;
			int i_1583_ = anInt9928 + anInt9930;
			int i_1584_ = anInt9906;
			int i_1585_;
			if ((i_1585_
			     = i_1582_ - (((Class168_Sub2_Sub1) this).anInt9920
					  << 12))
			    >= 0) {
			    i_1585_ = (anInt9921 - i_1585_) / anInt9921;
			    i_1584_ += i_1585_;
			    i_1582_ += anInt9921 * i_1585_;
			    i_1583_ += anInt9922 * i_1585_;
			    i_1581_ += i_1585_;
			}
			if ((i_1585_ = (i_1582_ - anInt9921) / anInt9921)
			    > i_1584_)
			    i_1584_ = i_1585_;
			if (i_1583_ < 0) {
			    i_1585_ = (anInt9922 - 1 - i_1583_) / anInt9922;
			    i_1584_ += i_1585_;
			    i_1582_ += anInt9921 * i_1585_;
			    i_1583_ += anInt9922 * i_1585_;
			    i_1581_ += i_1585_;
			}
			if ((i_1585_
			     = (1 + i_1583_
				- (((Class168_Sub2_Sub1) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_1584_)
			    i_1584_ = i_1585_;
			for (/**/; i_1584_ < 0; i_1584_++) {
			    method16968(((i_1583_ >> 12)
					 * (((Class168_Sub2_Sub1) this)
					    .anInt9920)) + (i_1582_ >> 12),
					i_1581_++, is, i, i_1549_);
			    i_1582_ += anInt9921;
			    i_1583_ += anInt9922;
			}
			i_1580_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_1586_ = anInt9919;
		while (i_1586_ < 0) {
		    int i_1587_ = anInt9925;
		    int i_1588_ = anInt9927 + anInt9929;
		    int i_1589_ = anInt9928;
		    int i_1590_ = anInt9906;
		    if (i_1589_ >= 0
			&& i_1589_ - (((Class168_Sub2_Sub1) this).anInt9916
				      << 12) < 0) {
			if (i_1588_ < 0) {
			    int i_1591_
				= (anInt9921 - 1 - i_1588_) / anInt9921;
			    i_1590_ += i_1591_;
			    i_1588_ += anInt9921 * i_1591_;
			    i_1587_ += i_1591_;
			}
			int i_1592_;
			if ((i_1592_
			     = (1 + i_1588_
				- (((Class168_Sub2_Sub1) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_1590_)
			    i_1590_ = i_1592_;
			for (/**/; i_1590_ < 0; i_1590_++) {
			    method16968(((i_1589_ >> 12)
					 * (((Class168_Sub2_Sub1) this)
					    .anInt9920)) + (i_1588_ >> 12),
					i_1587_++, is, i, i_1549_);
			    i_1588_ += anInt9921;
			}
		    }
		    i_1586_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		for (int i_1593_ = anInt9919; i_1593_ < 0; i_1593_++) {
		    int i_1594_ = anInt9925;
		    int i_1595_ = anInt9927 + anInt9929;
		    int i_1596_ = anInt9928 + anInt9930;
		    int i_1597_ = anInt9906;
		    if (i_1595_ < 0) {
			int i_1598_ = (anInt9921 - 1 - i_1595_) / anInt9921;
			i_1597_ += i_1598_;
			i_1595_ += anInt9921 * i_1598_;
			i_1596_ += anInt9922 * i_1598_;
			i_1594_ += i_1598_;
		    }
		    int i_1599_;
		    if ((i_1599_
			 = (1 + i_1595_
			    - (((Class168_Sub2_Sub1) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_1597_)
			i_1597_ = i_1599_;
		    if ((i_1599_
			 = i_1596_ - (((Class168_Sub2_Sub1) this).anInt9916
				      << 12))
			>= 0) {
			i_1599_ = (anInt9922 - i_1599_) / anInt9922;
			i_1597_ += i_1599_;
			i_1595_ += anInt9921 * i_1599_;
			i_1596_ += anInt9922 * i_1599_;
			i_1594_ += i_1599_;
		    }
		    if ((i_1599_ = (i_1596_ - anInt9922) / anInt9922)
			> i_1597_)
			i_1597_ = i_1599_;
		    for (/**/; i_1597_ < 0; i_1597_++) {
			method16968((((i_1596_ >> 12)
				      * ((Class168_Sub2_Sub1) this).anInt9920)
				     + (i_1595_ >> 12)),
				    i_1594_++, is, i, i_1549_);
			i_1595_ += anInt9921;
			i_1596_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		for (int i_1600_ = anInt9919; i_1600_ < 0; i_1600_++) {
		    int i_1601_ = anInt9925;
		    int i_1602_ = anInt9927 + anInt9929;
		    int i_1603_ = anInt9928 + anInt9930;
		    int i_1604_ = anInt9906;
		    if (i_1602_ < 0) {
			int i_1605_ = (anInt9921 - 1 - i_1602_) / anInt9921;
			i_1604_ += i_1605_;
			i_1602_ += anInt9921 * i_1605_;
			i_1603_ += anInt9922 * i_1605_;
			i_1601_ += i_1605_;
		    }
		    int i_1606_;
		    if ((i_1606_
			 = (1 + i_1602_
			    - (((Class168_Sub2_Sub1) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_1604_)
			i_1604_ = i_1606_;
		    if (i_1603_ < 0) {
			i_1606_ = (anInt9922 - 1 - i_1603_) / anInt9922;
			i_1604_ += i_1606_;
			i_1602_ += anInt9921 * i_1606_;
			i_1603_ += anInt9922 * i_1606_;
			i_1601_ += i_1606_;
		    }
		    if ((i_1606_
			 = (1 + i_1603_
			    - (((Class168_Sub2_Sub1) this).anInt9916 << 12)
			    - anInt9922) / anInt9922)
			> i_1604_)
			i_1604_ = i_1606_;
		    for (/**/; i_1604_ < 0; i_1604_++) {
			method16968((((i_1603_ >> 12)
				      * ((Class168_Sub2_Sub1) this).anInt9920)
				     + (i_1602_ >> 12)),
				    i_1601_++, is, i, i_1549_);
			i_1602_ += anInt9921;
			i_1603_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    void method16223(int i, int i_1607_) {
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_1608_ = anInt9919;
		    while (i_1608_ < 0) {
			int i_1609_ = anInt9925;
			int i_1610_ = anInt9927;
			int i_1611_ = anInt9928;
			int i_1612_ = anInt9906;
			if (i_1610_ >= 0 && i_1611_ >= 0
			    && i_1610_ - (((Class168_Sub2_Sub1) this).anInt9920
					  << 12) < 0
			    && i_1611_ - (((Class168_Sub2_Sub1) this).anInt9916
					  << 12) < 0) {
			    for (/**/; i_1612_ < 0; i_1612_++)
				method16968(((i_1611_ >> 12)
					     * (((Class168_Sub2_Sub1) this)
						.anInt9920)) + (i_1610_ >> 12),
					    i_1609_++, is, i, i_1607_);
			}
			i_1608_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_1613_ = anInt9919;
		    while (i_1613_ < 0) {
			int i_1614_ = anInt9925;
			int i_1615_ = anInt9927;
			int i_1616_ = anInt9928 + anInt9930;
			int i_1617_ = anInt9906;
			if (i_1615_ >= 0
			    && i_1615_ - (((Class168_Sub2_Sub1) this).anInt9920
					  << 12) < 0) {
			    int i_1618_;
			    if ((i_1618_
				 = (i_1616_
				    - (((Class168_Sub2_Sub1) this).anInt9916
				       << 12)))
				>= 0) {
				i_1618_ = (anInt9922 - i_1618_) / anInt9922;
				i_1617_ += i_1618_;
				i_1616_ += anInt9922 * i_1618_;
				i_1614_ += i_1618_;
			    }
			    if ((i_1618_ = (i_1616_ - anInt9922) / anInt9922)
				> i_1617_)
				i_1617_ = i_1618_;
			    for (/**/; i_1617_ < 0; i_1617_++) {
				method16968(((i_1616_ >> 12)
					     * (((Class168_Sub2_Sub1) this)
						.anInt9920)) + (i_1615_ >> 12),
					    i_1614_++, is, i, i_1607_);
				i_1616_ += anInt9922;
			    }
			}
			i_1613_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_1619_ = anInt9919;
		    while (i_1619_ < 0) {
			int i_1620_ = anInt9925;
			int i_1621_ = anInt9927;
			int i_1622_ = anInt9928 + anInt9930;
			int i_1623_ = anInt9906;
			if (i_1621_ >= 0
			    && i_1621_ - (((Class168_Sub2_Sub1) this).anInt9920
					  << 12) < 0) {
			    if (i_1622_ < 0) {
				int i_1624_
				    = (anInt9922 - 1 - i_1622_) / anInt9922;
				i_1623_ += i_1624_;
				i_1622_ += anInt9922 * i_1624_;
				i_1620_ += i_1624_;
			    }
			    int i_1625_;
			    if ((i_1625_
				 = (1 + i_1622_
				    - (((Class168_Sub2_Sub1) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_1623_)
				i_1623_ = i_1625_;
			    for (/**/; i_1623_ < 0; i_1623_++) {
				method16968(((i_1622_ >> 12)
					     * (((Class168_Sub2_Sub1) this)
						.anInt9920)) + (i_1621_ >> 12),
					    i_1620_++, is, i, i_1607_);
				i_1622_ += anInt9922;
			    }
			}
			i_1619_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_1626_ = anInt9919;
		    while (i_1626_ < 0) {
			int i_1627_ = anInt9925;
			int i_1628_ = anInt9927 + anInt9929;
			int i_1629_ = anInt9928;
			int i_1630_ = anInt9906;
			if (i_1629_ >= 0
			    && i_1629_ - (((Class168_Sub2_Sub1) this).anInt9916
					  << 12) < 0) {
			    int i_1631_;
			    if ((i_1631_
				 = (i_1628_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)))
				>= 0) {
				i_1631_ = (anInt9921 - i_1631_) / anInt9921;
				i_1630_ += i_1631_;
				i_1628_ += anInt9921 * i_1631_;
				i_1627_ += i_1631_;
			    }
			    if ((i_1631_ = (i_1628_ - anInt9921) / anInt9921)
				> i_1630_)
				i_1630_ = i_1631_;
			    for (/**/; i_1630_ < 0; i_1630_++) {
				method16968(((i_1629_ >> 12)
					     * (((Class168_Sub2_Sub1) this)
						.anInt9920)) + (i_1628_ >> 12),
					    i_1627_++, is, i, i_1607_);
				i_1628_ += anInt9921;
			    }
			}
			i_1626_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_1632_ = anInt9919;
		    while (i_1632_ < 0) {
			int i_1633_ = anInt9925;
			int i_1634_ = anInt9927 + anInt9929;
			int i_1635_ = anInt9928 + anInt9930;
			int i_1636_ = anInt9906;
			int i_1637_;
			if ((i_1637_
			     = i_1634_ - (((Class168_Sub2_Sub1) this).anInt9920
					  << 12))
			    >= 0) {
			    i_1637_ = (anInt9921 - i_1637_) / anInt9921;
			    i_1636_ += i_1637_;
			    i_1634_ += anInt9921 * i_1637_;
			    i_1635_ += anInt9922 * i_1637_;
			    i_1633_ += i_1637_;
			}
			if ((i_1637_ = (i_1634_ - anInt9921) / anInt9921)
			    > i_1636_)
			    i_1636_ = i_1637_;
			if ((i_1637_
			     = i_1635_ - (((Class168_Sub2_Sub1) this).anInt9916
					  << 12))
			    >= 0) {
			    i_1637_ = (anInt9922 - i_1637_) / anInt9922;
			    i_1636_ += i_1637_;
			    i_1634_ += anInt9921 * i_1637_;
			    i_1635_ += anInt9922 * i_1637_;
			    i_1633_ += i_1637_;
			}
			if ((i_1637_ = (i_1635_ - anInt9922) / anInt9922)
			    > i_1636_)
			    i_1636_ = i_1637_;
			for (/**/; i_1636_ < 0; i_1636_++) {
			    method16968(((i_1635_ >> 12)
					 * (((Class168_Sub2_Sub1) this)
					    .anInt9920)) + (i_1634_ >> 12),
					i_1633_++, is, i, i_1607_);
			    i_1634_ += anInt9921;
			    i_1635_ += anInt9922;
			}
			i_1632_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_1638_ = anInt9919;
		    while (i_1638_ < 0) {
			int i_1639_ = anInt9925;
			int i_1640_ = anInt9927 + anInt9929;
			int i_1641_ = anInt9928 + anInt9930;
			int i_1642_ = anInt9906;
			int i_1643_;
			if ((i_1643_
			     = i_1640_ - (((Class168_Sub2_Sub1) this).anInt9920
					  << 12))
			    >= 0) {
			    i_1643_ = (anInt9921 - i_1643_) / anInt9921;
			    i_1642_ += i_1643_;
			    i_1640_ += anInt9921 * i_1643_;
			    i_1641_ += anInt9922 * i_1643_;
			    i_1639_ += i_1643_;
			}
			if ((i_1643_ = (i_1640_ - anInt9921) / anInt9921)
			    > i_1642_)
			    i_1642_ = i_1643_;
			if (i_1641_ < 0) {
			    i_1643_ = (anInt9922 - 1 - i_1641_) / anInt9922;
			    i_1642_ += i_1643_;
			    i_1640_ += anInt9921 * i_1643_;
			    i_1641_ += anInt9922 * i_1643_;
			    i_1639_ += i_1643_;
			}
			if ((i_1643_
			     = (1 + i_1641_
				- (((Class168_Sub2_Sub1) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_1642_)
			    i_1642_ = i_1643_;
			for (/**/; i_1642_ < 0; i_1642_++) {
			    method16968(((i_1641_ >> 12)
					 * (((Class168_Sub2_Sub1) this)
					    .anInt9920)) + (i_1640_ >> 12),
					i_1639_++, is, i, i_1607_);
			    i_1640_ += anInt9921;
			    i_1641_ += anInt9922;
			}
			i_1638_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_1644_ = anInt9919;
		while (i_1644_ < 0) {
		    int i_1645_ = anInt9925;
		    int i_1646_ = anInt9927 + anInt9929;
		    int i_1647_ = anInt9928;
		    int i_1648_ = anInt9906;
		    if (i_1647_ >= 0
			&& i_1647_ - (((Class168_Sub2_Sub1) this).anInt9916
				      << 12) < 0) {
			if (i_1646_ < 0) {
			    int i_1649_
				= (anInt9921 - 1 - i_1646_) / anInt9921;
			    i_1648_ += i_1649_;
			    i_1646_ += anInt9921 * i_1649_;
			    i_1645_ += i_1649_;
			}
			int i_1650_;
			if ((i_1650_
			     = (1 + i_1646_
				- (((Class168_Sub2_Sub1) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_1648_)
			    i_1648_ = i_1650_;
			for (/**/; i_1648_ < 0; i_1648_++) {
			    method16968(((i_1647_ >> 12)
					 * (((Class168_Sub2_Sub1) this)
					    .anInt9920)) + (i_1646_ >> 12),
					i_1645_++, is, i, i_1607_);
			    i_1646_ += anInt9921;
			}
		    }
		    i_1644_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		for (int i_1651_ = anInt9919; i_1651_ < 0; i_1651_++) {
		    int i_1652_ = anInt9925;
		    int i_1653_ = anInt9927 + anInt9929;
		    int i_1654_ = anInt9928 + anInt9930;
		    int i_1655_ = anInt9906;
		    if (i_1653_ < 0) {
			int i_1656_ = (anInt9921 - 1 - i_1653_) / anInt9921;
			i_1655_ += i_1656_;
			i_1653_ += anInt9921 * i_1656_;
			i_1654_ += anInt9922 * i_1656_;
			i_1652_ += i_1656_;
		    }
		    int i_1657_;
		    if ((i_1657_
			 = (1 + i_1653_
			    - (((Class168_Sub2_Sub1) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_1655_)
			i_1655_ = i_1657_;
		    if ((i_1657_
			 = i_1654_ - (((Class168_Sub2_Sub1) this).anInt9916
				      << 12))
			>= 0) {
			i_1657_ = (anInt9922 - i_1657_) / anInt9922;
			i_1655_ += i_1657_;
			i_1653_ += anInt9921 * i_1657_;
			i_1654_ += anInt9922 * i_1657_;
			i_1652_ += i_1657_;
		    }
		    if ((i_1657_ = (i_1654_ - anInt9922) / anInt9922)
			> i_1655_)
			i_1655_ = i_1657_;
		    for (/**/; i_1655_ < 0; i_1655_++) {
			method16968((((i_1654_ >> 12)
				      * ((Class168_Sub2_Sub1) this).anInt9920)
				     + (i_1653_ >> 12)),
				    i_1652_++, is, i, i_1607_);
			i_1653_ += anInt9921;
			i_1654_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		for (int i_1658_ = anInt9919; i_1658_ < 0; i_1658_++) {
		    int i_1659_ = anInt9925;
		    int i_1660_ = anInt9927 + anInt9929;
		    int i_1661_ = anInt9928 + anInt9930;
		    int i_1662_ = anInt9906;
		    if (i_1660_ < 0) {
			int i_1663_ = (anInt9921 - 1 - i_1660_) / anInt9921;
			i_1662_ += i_1663_;
			i_1660_ += anInt9921 * i_1663_;
			i_1661_ += anInt9922 * i_1663_;
			i_1659_ += i_1663_;
		    }
		    int i_1664_;
		    if ((i_1664_
			 = (1 + i_1660_
			    - (((Class168_Sub2_Sub1) this).anInt9920 << 12)
			    - anInt9921) / anInt9921)
			> i_1662_)
			i_1662_ = i_1664_;
		    if (i_1661_ < 0) {
			i_1664_ = (anInt9922 - 1 - i_1661_) / anInt9922;
			i_1662_ += i_1664_;
			i_1660_ += anInt9921 * i_1664_;
			i_1661_ += anInt9922 * i_1664_;
			i_1659_ += i_1664_;
		    }
		    if ((i_1664_
			 = (1 + i_1661_
			    - (((Class168_Sub2_Sub1) this).anInt9916 << 12)
			    - anInt9922) / anInt9922)
			> i_1662_)
			i_1662_ = i_1664_;
		    for (/**/; i_1662_ < 0; i_1662_++) {
			method16968((((i_1661_ >> 12)
				      * ((Class168_Sub2_Sub1) this).anInt9920)
				     + (i_1660_ >> 12)),
				    i_1659_++, is, i, i_1607_);
			i_1660_ += anInt9921;
			i_1661_ += anInt9922;
		    }
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    public Interface4 method3633() {
	return new Class186(((Class168_Sub2_Sub1) this).anInt9920,
			    ((Class168_Sub2_Sub1) this).anInt9916,
			    ((Class168_Sub2_Sub1) this).anIntArray10708);
    }
    
    void method16228(int[] is, int[] is_1665_, int i, int i_1666_) {
	int[] is_1667_ = (((Class103_Sub2)
			   ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			  .anIntArray9245);
	if (is_1667_ != null) {
	    if (anInt9921 == 0) {
		if (anInt9922 == 0) {
		    int i_1668_ = anInt9919;
		    while (i_1668_ < 0) {
			int i_1669_ = i_1668_ + i_1666_;
			if (i_1669_ >= 0) {
			    if (i_1669_ >= is.length)
				break;
			    int i_1670_ = anInt9925;
			    int i_1671_ = anInt9927;
			    int i_1672_ = anInt9928;
			    int i_1673_ = anInt9906;
			    if (i_1671_ >= 0 && i_1672_ >= 0
				&& (i_1671_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)) < 0
				&& (i_1672_
				    - (((Class168_Sub2_Sub1) this).anInt9916
				       << 12)) < 0) {
				int i_1674_ = is[i_1669_] - i;
				int i_1675_ = -is_1665_[i_1669_];
				int i_1676_ = i_1674_ - (i_1670_ - anInt9925);
				if (i_1676_ > 0) {
				    i_1670_ += i_1676_;
				    i_1673_ += i_1676_;
				    i_1671_ += anInt9921 * i_1676_;
				    i_1672_ += anInt9922 * i_1676_;
				} else
				    i_1675_ -= i_1676_;
				if (i_1673_ < i_1675_)
				    i_1673_ = i_1675_;
				for (/**/; i_1673_ < 0; i_1673_++) {
				    int i_1677_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(((i_1672_ >> 12)
					      * (((Class168_Sub2_Sub1) this)
						 .anInt9920))
					     + (i_1671_ >> 12))]);
				    if (i_1677_ != 0)
					is_1667_[i_1670_++] = i_1677_;
				    else
					i_1670_++;
				}
			    }
			}
			i_1668_++;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_1678_ = anInt9919;
		    while (i_1678_ < 0) {
			int i_1679_ = i_1678_ + i_1666_;
			if (i_1679_ >= 0) {
			    if (i_1679_ >= is.length)
				break;
			    int i_1680_ = anInt9925;
			    int i_1681_ = anInt9927;
			    int i_1682_ = anInt9928 + anInt9930;
			    int i_1683_ = anInt9906;
			    if (i_1681_ >= 0
				&& (i_1681_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)) < 0) {
				int i_1684_;
				if ((i_1684_
				     = i_1682_ - ((((Class168_Sub2_Sub1) this)
						   .anInt9916)
						  << 12))
				    >= 0) {
				    i_1684_
					= (anInt9922 - i_1684_) / anInt9922;
				    i_1683_ += i_1684_;
				    i_1682_ += anInt9922 * i_1684_;
				    i_1680_ += i_1684_;
				}
				if ((i_1684_
				     = (i_1682_ - anInt9922) / anInt9922)
				    > i_1683_)
				    i_1683_ = i_1684_;
				int i_1685_ = is[i_1679_] - i;
				int i_1686_ = -is_1665_[i_1679_];
				int i_1687_ = i_1685_ - (i_1680_ - anInt9925);
				if (i_1687_ > 0) {
				    i_1680_ += i_1687_;
				    i_1683_ += i_1687_;
				    i_1681_ += anInt9921 * i_1687_;
				    i_1682_ += anInt9922 * i_1687_;
				} else
				    i_1686_ -= i_1687_;
				if (i_1683_ < i_1686_)
				    i_1683_ = i_1686_;
				for (/**/; i_1683_ < 0; i_1683_++) {
				    int i_1688_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(((i_1682_ >> 12)
					      * (((Class168_Sub2_Sub1) this)
						 .anInt9920))
					     + (i_1681_ >> 12))]);
				    if (i_1688_ != 0)
					is_1667_[i_1680_++] = i_1688_;
				    else
					i_1680_++;
				    i_1682_ += anInt9922;
				}
			    }
			}
			i_1678_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_1689_ = anInt9919;
		    while (i_1689_ < 0) {
			int i_1690_ = i_1689_ + i_1666_;
			if (i_1690_ >= 0) {
			    if (i_1690_ >= is.length)
				break;
			    int i_1691_ = anInt9925;
			    int i_1692_ = anInt9927;
			    int i_1693_ = anInt9928 + anInt9930;
			    int i_1694_ = anInt9906;
			    if (i_1692_ >= 0
				&& (i_1692_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)) < 0) {
				if (i_1693_ < 0) {
				    int i_1695_ = ((anInt9922 - 1 - i_1693_)
						   / anInt9922);
				    i_1694_ += i_1695_;
				    i_1693_ += anInt9922 * i_1695_;
				    i_1691_ += i_1695_;
				}
				int i_1696_;
				if ((i_1696_ = (1 + i_1693_
						- ((((Class168_Sub2_Sub1) this)
						    .anInt9916)
						   << 12)
						- anInt9922) / anInt9922)
				    > i_1694_)
				    i_1694_ = i_1696_;
				int i_1697_ = is[i_1690_] - i;
				int i_1698_ = -is_1665_[i_1690_];
				int i_1699_ = i_1697_ - (i_1691_ - anInt9925);
				if (i_1699_ > 0) {
				    i_1691_ += i_1699_;
				    i_1694_ += i_1699_;
				    i_1692_ += anInt9921 * i_1699_;
				    i_1693_ += anInt9922 * i_1699_;
				} else
				    i_1698_ -= i_1699_;
				if (i_1694_ < i_1698_)
				    i_1694_ = i_1698_;
				for (/**/; i_1694_ < 0; i_1694_++) {
				    int i_1700_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(((i_1693_ >> 12)
					      * (((Class168_Sub2_Sub1) this)
						 .anInt9920))
					     + (i_1692_ >> 12))]);
				    if (i_1700_ != 0)
					is_1667_[i_1691_++] = i_1700_;
				    else
					i_1691_++;
				    i_1693_ += anInt9922;
				}
			    }
			}
			i_1689_++;
			anInt9927 += anInt9923;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9921 < 0) {
		if (anInt9922 == 0) {
		    int i_1701_ = anInt9919;
		    while (i_1701_ < 0) {
			int i_1702_ = i_1701_ + i_1666_;
			if (i_1702_ >= 0) {
			    if (i_1702_ >= is.length)
				break;
			    int i_1703_ = anInt9925;
			    int i_1704_ = anInt9927 + anInt9929;
			    int i_1705_ = anInt9928;
			    int i_1706_ = anInt9906;
			    if (i_1705_ >= 0
				&& (i_1705_
				    - (((Class168_Sub2_Sub1) this).anInt9916
				       << 12)) < 0) {
				int i_1707_;
				if ((i_1707_
				     = i_1704_ - ((((Class168_Sub2_Sub1) this)
						   .anInt9920)
						  << 12))
				    >= 0) {
				    i_1707_
					= (anInt9921 - i_1707_) / anInt9921;
				    i_1706_ += i_1707_;
				    i_1704_ += anInt9921 * i_1707_;
				    i_1703_ += i_1707_;
				}
				if ((i_1707_
				     = (i_1704_ - anInt9921) / anInt9921)
				    > i_1706_)
				    i_1706_ = i_1707_;
				int i_1708_ = is[i_1702_] - i;
				int i_1709_ = -is_1665_[i_1702_];
				int i_1710_ = i_1708_ - (i_1703_ - anInt9925);
				if (i_1710_ > 0) {
				    i_1703_ += i_1710_;
				    i_1706_ += i_1710_;
				    i_1704_ += anInt9921 * i_1710_;
				    i_1705_ += anInt9922 * i_1710_;
				} else
				    i_1709_ -= i_1710_;
				if (i_1706_ < i_1709_)
				    i_1706_ = i_1709_;
				for (/**/; i_1706_ < 0; i_1706_++) {
				    int i_1711_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(((i_1705_ >> 12)
					      * (((Class168_Sub2_Sub1) this)
						 .anInt9920))
					     + (i_1704_ >> 12))]);
				    if (i_1711_ != 0)
					is_1667_[i_1703_++] = i_1711_;
				    else
					i_1703_++;
				    i_1704_ += anInt9921;
				}
			    }
			}
			i_1701_++;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else if (anInt9922 < 0) {
		    int i_1712_ = anInt9919;
		    while (i_1712_ < 0) {
			int i_1713_ = i_1712_ + i_1666_;
			if (i_1713_ >= 0) {
			    if (i_1713_ >= is.length)
				break;
			    int i_1714_ = anInt9925;
			    int i_1715_ = anInt9927 + anInt9929;
			    int i_1716_ = anInt9928 + anInt9930;
			    int i_1717_ = anInt9906;
			    int i_1718_;
			    if ((i_1718_
				 = (i_1715_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)))
				>= 0) {
				i_1718_ = (anInt9921 - i_1718_) / anInt9921;
				i_1717_ += i_1718_;
				i_1715_ += anInt9921 * i_1718_;
				i_1716_ += anInt9922 * i_1718_;
				i_1714_ += i_1718_;
			    }
			    if ((i_1718_ = (i_1715_ - anInt9921) / anInt9921)
				> i_1717_)
				i_1717_ = i_1718_;
			    if ((i_1718_
				 = (i_1716_
				    - (((Class168_Sub2_Sub1) this).anInt9916
				       << 12)))
				>= 0) {
				i_1718_ = (anInt9922 - i_1718_) / anInt9922;
				i_1717_ += i_1718_;
				i_1715_ += anInt9921 * i_1718_;
				i_1716_ += anInt9922 * i_1718_;
				i_1714_ += i_1718_;
			    }
			    if ((i_1718_ = (i_1716_ - anInt9922) / anInt9922)
				> i_1717_)
				i_1717_ = i_1718_;
			    int i_1719_ = is[i_1713_] - i;
			    int i_1720_ = -is_1665_[i_1713_];
			    int i_1721_ = i_1719_ - (i_1714_ - anInt9925);
			    if (i_1721_ > 0) {
				i_1714_ += i_1721_;
				i_1717_ += i_1721_;
				i_1715_ += anInt9921 * i_1721_;
				i_1716_ += anInt9922 * i_1721_;
			    } else
				i_1720_ -= i_1721_;
			    if (i_1717_ < i_1720_)
				i_1717_ = i_1720_;
			    for (/**/; i_1717_ < 0; i_1717_++) {
				int i_1722_
				    = (((Class168_Sub2_Sub1) this)
				       .anIntArray10708
				       [((i_1716_ >> 12)
					 * (((Class168_Sub2_Sub1) this)
					    .anInt9920)) + (i_1715_ >> 12)]);
				if (i_1722_ != 0)
				    is_1667_[i_1714_++] = i_1722_;
				else
				    i_1714_++;
				i_1715_ += anInt9921;
				i_1716_ += anInt9922;
			    }
			}
			i_1712_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		} else {
		    int i_1723_ = anInt9919;
		    while (i_1723_ < 0) {
			int i_1724_ = i_1723_ + i_1666_;
			if (i_1724_ >= 0) {
			    if (i_1724_ >= is.length)
				break;
			    int i_1725_ = anInt9925;
			    int i_1726_ = anInt9927 + anInt9929;
			    int i_1727_ = anInt9928 + anInt9930;
			    int i_1728_ = anInt9906;
			    int i_1729_;
			    if ((i_1729_
				 = (i_1726_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)))
				>= 0) {
				i_1729_ = (anInt9921 - i_1729_) / anInt9921;
				i_1728_ += i_1729_;
				i_1726_ += anInt9921 * i_1729_;
				i_1727_ += anInt9922 * i_1729_;
				i_1725_ += i_1729_;
			    }
			    if ((i_1729_ = (i_1726_ - anInt9921) / anInt9921)
				> i_1728_)
				i_1728_ = i_1729_;
			    if (i_1727_ < 0) {
				i_1729_
				    = (anInt9922 - 1 - i_1727_) / anInt9922;
				i_1728_ += i_1729_;
				i_1726_ += anInt9921 * i_1729_;
				i_1727_ += anInt9922 * i_1729_;
				i_1725_ += i_1729_;
			    }
			    if ((i_1729_
				 = (1 + i_1727_
				    - (((Class168_Sub2_Sub1) this).anInt9916
				       << 12)
				    - anInt9922) / anInt9922)
				> i_1728_)
				i_1728_ = i_1729_;
			    int i_1730_ = is[i_1724_] - i;
			    int i_1731_ = -is_1665_[i_1724_];
			    int i_1732_ = i_1730_ - (i_1725_ - anInt9925);
			    if (i_1732_ > 0) {
				i_1725_ += i_1732_;
				i_1728_ += i_1732_;
				i_1726_ += anInt9921 * i_1732_;
				i_1727_ += anInt9922 * i_1732_;
			    } else
				i_1731_ -= i_1732_;
			    if (i_1728_ < i_1731_)
				i_1728_ = i_1731_;
			    for (/**/; i_1728_ < 0; i_1728_++) {
				int i_1733_
				    = (((Class168_Sub2_Sub1) this)
				       .anIntArray10708
				       [((i_1727_ >> 12)
					 * (((Class168_Sub2_Sub1) this)
					    .anInt9920)) + (i_1726_ >> 12)]);
				if (i_1733_ != 0)
				    is_1667_[i_1725_++] = i_1733_;
				else
				    i_1725_++;
				i_1726_ += anInt9921;
				i_1727_ += anInt9922;
			    }
			}
			i_1723_++;
			anInt9927 += anInt9923;
			anInt9928 += anInt9908;
			anInt9925 += anInt9935;
		    }
		}
	    } else if (anInt9922 == 0) {
		int i_1734_ = anInt9919;
		while (i_1734_ < 0) {
		    int i_1735_ = i_1734_ + i_1666_;
		    if (i_1735_ >= 0) {
			if (i_1735_ >= is.length)
			    break;
			int i_1736_ = anInt9925;
			int i_1737_ = anInt9927 + anInt9929;
			int i_1738_ = anInt9928;
			int i_1739_ = anInt9906;
			if (i_1738_ >= 0
			    && i_1738_ - (((Class168_Sub2_Sub1) this).anInt9916
					  << 12) < 0) {
			    if (i_1737_ < 0) {
				int i_1740_
				    = (anInt9921 - 1 - i_1737_) / anInt9921;
				i_1739_ += i_1740_;
				i_1737_ += anInt9921 * i_1740_;
				i_1736_ += i_1740_;
			    }
			    int i_1741_;
			    if ((i_1741_
				 = (1 + i_1737_
				    - (((Class168_Sub2_Sub1) this).anInt9920
				       << 12)
				    - anInt9921) / anInt9921)
				> i_1739_)
				i_1739_ = i_1741_;
			    int i_1742_ = is[i_1735_] - i;
			    int i_1743_ = -is_1665_[i_1735_];
			    int i_1744_ = i_1742_ - (i_1736_ - anInt9925);
			    if (i_1744_ > 0) {
				i_1736_ += i_1744_;
				i_1739_ += i_1744_;
				i_1737_ += anInt9921 * i_1744_;
				i_1738_ += anInt9922 * i_1744_;
			    } else
				i_1743_ -= i_1744_;
			    if (i_1739_ < i_1743_)
				i_1739_ = i_1743_;
			    for (/**/; i_1739_ < 0; i_1739_++) {
				int i_1745_
				    = (((Class168_Sub2_Sub1) this)
				       .anIntArray10708
				       [((i_1738_ >> 12)
					 * (((Class168_Sub2_Sub1) this)
					    .anInt9920)) + (i_1737_ >> 12)]);
				if (i_1745_ != 0)
				    is_1667_[i_1736_++] = i_1745_;
				else
				    i_1736_++;
				i_1737_ += anInt9921;
			    }
			}
		    }
		    i_1734_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else if (anInt9922 < 0) {
		int i_1746_ = anInt9919;
		while (i_1746_ < 0) {
		    int i_1747_ = i_1746_ + i_1666_;
		    if (i_1747_ >= 0) {
			if (i_1747_ >= is.length)
			    break;
			int i_1748_ = anInt9925;
			int i_1749_ = anInt9927 + anInt9929;
			int i_1750_ = anInt9928 + anInt9930;
			int i_1751_ = anInt9906;
			if (i_1749_ < 0) {
			    int i_1752_
				= (anInt9921 - 1 - i_1749_) / anInt9921;
			    i_1751_ += i_1752_;
			    i_1749_ += anInt9921 * i_1752_;
			    i_1750_ += anInt9922 * i_1752_;
			    i_1748_ += i_1752_;
			}
			int i_1753_;
			if ((i_1753_
			     = (1 + i_1749_
				- (((Class168_Sub2_Sub1) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_1751_)
			    i_1751_ = i_1753_;
			if ((i_1753_
			     = i_1750_ - (((Class168_Sub2_Sub1) this).anInt9916
					  << 12))
			    >= 0) {
			    i_1753_ = (anInt9922 - i_1753_) / anInt9922;
			    i_1751_ += i_1753_;
			    i_1749_ += anInt9921 * i_1753_;
			    i_1750_ += anInt9922 * i_1753_;
			    i_1748_ += i_1753_;
			}
			if ((i_1753_ = (i_1750_ - anInt9922) / anInt9922)
			    > i_1751_)
			    i_1751_ = i_1753_;
			int i_1754_ = is[i_1747_] - i;
			int i_1755_ = -is_1665_[i_1747_];
			int i_1756_ = i_1754_ - (i_1748_ - anInt9925);
			if (i_1756_ > 0) {
			    i_1748_ += i_1756_;
			    i_1751_ += i_1756_;
			    i_1749_ += anInt9921 * i_1756_;
			    i_1750_ += anInt9922 * i_1756_;
			} else
			    i_1755_ -= i_1756_;
			if (i_1751_ < i_1755_)
			    i_1751_ = i_1755_;
			for (/**/; i_1751_ < 0; i_1751_++) {
			    int i_1757_
				= (((Class168_Sub2_Sub1) this).anIntArray10708
				   [(((i_1750_ >> 12)
				      * ((Class168_Sub2_Sub1) this).anInt9920)
				     + (i_1749_ >> 12))]);
			    if (i_1757_ != 0)
				is_1667_[i_1748_++] = i_1757_;
			    else
				i_1748_++;
			    i_1749_ += anInt9921;
			    i_1750_ += anInt9922;
			}
		    }
		    i_1746_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    } else {
		int i_1758_ = anInt9919;
		while (i_1758_ < 0) {
		    int i_1759_ = i_1758_ + i_1666_;
		    if (i_1759_ >= 0) {
			if (i_1759_ >= is.length)
			    break;
			int i_1760_ = anInt9925;
			int i_1761_ = anInt9927 + anInt9929;
			int i_1762_ = anInt9928 + anInt9930;
			int i_1763_ = anInt9906;
			if (i_1761_ < 0) {
			    int i_1764_
				= (anInt9921 - 1 - i_1761_) / anInt9921;
			    i_1763_ += i_1764_;
			    i_1761_ += anInt9921 * i_1764_;
			    i_1762_ += anInt9922 * i_1764_;
			    i_1760_ += i_1764_;
			}
			int i_1765_;
			if ((i_1765_
			     = (1 + i_1761_
				- (((Class168_Sub2_Sub1) this).anInt9920 << 12)
				- anInt9921) / anInt9921)
			    > i_1763_)
			    i_1763_ = i_1765_;
			if (i_1762_ < 0) {
			    i_1765_ = (anInt9922 - 1 - i_1762_) / anInt9922;
			    i_1763_ += i_1765_;
			    i_1761_ += anInt9921 * i_1765_;
			    i_1762_ += anInt9922 * i_1765_;
			    i_1760_ += i_1765_;
			}
			if ((i_1765_
			     = (1 + i_1762_
				- (((Class168_Sub2_Sub1) this).anInt9916 << 12)
				- anInt9922) / anInt9922)
			    > i_1763_)
			    i_1763_ = i_1765_;
			int i_1766_ = is[i_1759_] - i;
			int i_1767_ = -is_1665_[i_1759_];
			int i_1768_ = i_1766_ - (i_1760_ - anInt9925);
			if (i_1768_ > 0) {
			    i_1760_ += i_1768_;
			    i_1763_ += i_1768_;
			    i_1761_ += anInt9921 * i_1768_;
			    i_1762_ += anInt9922 * i_1768_;
			} else
			    i_1767_ -= i_1768_;
			if (i_1763_ < i_1767_)
			    i_1763_ = i_1767_;
			for (/**/; i_1763_ < 0; i_1763_++) {
			    int i_1769_
				= (((Class168_Sub2_Sub1) this).anIntArray10708
				   [(((i_1762_ >> 12)
				      * ((Class168_Sub2_Sub1) this).anInt9920)
				     + (i_1761_ >> 12))]);
			    if (i_1769_ != 0)
				is_1667_[i_1760_++] = i_1769_;
			    else
				i_1760_++;
			    i_1761_ += anInt9921;
			    i_1762_ += anInt9922;
			}
		    }
		    i_1758_++;
		    anInt9927 += anInt9923;
		    anInt9928 += anInt9908;
		    anInt9925 += anInt9935;
		}
	    }
	}
    }
    
    void method16969(int i, int i_1770_, int[] is, int i_1771_, int i_1772_) {
	if (i_1772_ == 0) {
	    if (i_1771_ == 1)
		is[i_1770_] = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
	    else if (i_1771_ == 0) {
		int i_1773_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i++];
		int i_1774_ = (i_1773_ & 0xff0000) * anInt9934 & ~0xffffff;
		int i_1775_ = (i_1773_ & 0xff00) * anInt9913 & 0xff0000;
		int i_1776_ = (i_1773_ & 0xff) * anInt9936 & 0xff00;
		is[i_1770_] = (i_1774_ | i_1775_ | i_1776_) >>> 8;
	    } else if (i_1771_ == 3) {
		int i_1777_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i++];
		int i_1778_ = anInt9931;
		int i_1779_ = i_1777_ + i_1778_;
		int i_1780_ = (i_1777_ & 0xff00ff) + (i_1778_ & 0xff00ff);
		int i_1781_
		    = (i_1780_ & 0x1000100) + (i_1779_ - i_1780_ & 0x10000);
		is[i_1770_] = i_1779_ - i_1781_ | i_1781_ - (i_1781_ >>> 8);
	    } else if (i_1771_ == 2) {
		int i_1782_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		int i_1783_ = (i_1782_ & 0xff00ff) * anInt9932 & ~0xff00ff;
		int i_1784_ = (i_1782_ & 0xff00) * anInt9932 & 0xff0000;
		is[i_1770_] = ((i_1783_ | i_1784_) >>> 8) + anInt9939;
	    } else
		throw new IllegalArgumentException();
	} else if (i_1772_ == 1) {
	    if (i_1771_ == 1) {
		int i_1785_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		if (i_1785_ != 0)
		    is[i_1770_] = i_1785_;
	    } else if (i_1771_ == 0) {
		int i_1786_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		if (i_1786_ != 0) {
		    if ((anInt9931 & 0xffffff) == 16777215) {
			int i_1787_ = anInt9931 >>> 24;
			int i_1788_ = 256 - i_1787_;
			int i_1789_ = is[i_1770_];
			is[i_1770_] = ((((i_1786_ & 0xff00ff) * i_1787_
					 + (i_1789_ & 0xff00ff) * i_1788_)
					& ~0xff00ff)
				       + (((i_1786_ & 0xff00) * i_1787_
					   + (i_1789_ & 0xff00) * i_1788_)
					  & 0xff0000)) >> 8;
		    } else if (anInt9932 != 255) {
			int i_1790_
			    = (i_1786_ & 0xff0000) * anInt9934 & ~0xffffff;
			int i_1791_
			    = (i_1786_ & 0xff00) * anInt9913 & 0xff0000;
			int i_1792_ = (i_1786_ & 0xff) * anInt9936 & 0xff00;
			i_1786_ = (i_1790_ | i_1791_ | i_1792_) >>> 8;
			int i_1793_ = is[i_1770_];
			is[i_1770_] = ((((i_1786_ & 0xff00ff) * anInt9932
					 + (i_1793_ & 0xff00ff) * anInt9937)
					& ~0xff00ff)
				       + (((i_1786_ & 0xff00) * anInt9932
					   + (i_1793_ & 0xff00) * anInt9937)
					  & 0xff0000)) >> 8;
		    } else {
			int i_1794_
			    = (i_1786_ & 0xff0000) * anInt9934 & ~0xffffff;
			int i_1795_
			    = (i_1786_ & 0xff00) * anInt9913 & 0xff0000;
			int i_1796_ = (i_1786_ & 0xff) * anInt9936 & 0xff00;
			is[i_1770_] = (i_1794_ | i_1795_ | i_1796_) >>> 8;
		    }
		}
	    } else if (i_1771_ == 3) {
		int i_1797_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		int i_1798_ = anInt9931;
		int i_1799_ = i_1797_ + i_1798_;
		int i_1800_ = (i_1797_ & 0xff00ff) + (i_1798_ & 0xff00ff);
		int i_1801_
		    = (i_1800_ & 0x1000100) + (i_1799_ - i_1800_ & 0x10000);
		i_1801_ = i_1799_ - i_1801_ | i_1801_ - (i_1801_ >>> 8);
		if (i_1797_ == 0 && anInt9932 != 255) {
		    i_1797_ = i_1801_;
		    i_1801_ = is[i_1770_];
		    i_1801_ = ((((i_1797_ & 0xff00ff) * anInt9932
				 + (i_1801_ & 0xff00ff) * anInt9937)
				& ~0xff00ff)
			       + (((i_1797_ & 0xff00) * anInt9932
				   + (i_1801_ & 0xff00) * anInt9937)
				  & 0xff0000)) >> 8;
		}
		is[i_1770_] = i_1801_;
	    } else if (i_1771_ == 2) {
		int i_1802_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		if (i_1802_ != 0) {
		    int i_1803_ = (i_1802_ & 0xff00ff) * anInt9932 & ~0xff00ff;
		    int i_1804_ = (i_1802_ & 0xff00) * anInt9932 & 0xff0000;
		    is[i_1770_++] = ((i_1803_ | i_1804_) >>> 8) + anInt9939;
		}
	    } else
		throw new IllegalArgumentException();
	} else if (i_1772_ == 2) {
	    if (i_1771_ == 1) {
		int i_1805_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		if (i_1805_ != 0) {
		    int i_1806_ = is[i_1770_];
		    int i_1807_ = i_1805_ + i_1806_;
		    int i_1808_ = (i_1805_ & 0xff00ff) + (i_1806_ & 0xff00ff);
		    i_1806_ = (i_1808_ & 0x1000100) + (i_1807_ - i_1808_
						       & 0x10000);
		    is[i_1770_]
			= i_1807_ - i_1806_ | i_1806_ - (i_1806_ >>> 8);
		}
	    } else if (i_1771_ == 0) {
		int i_1809_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		if (i_1809_ != 0) {
		    int i_1810_ = (i_1809_ & 0xff0000) * anInt9934 & ~0xffffff;
		    int i_1811_ = (i_1809_ & 0xff00) * anInt9913 & 0xff0000;
		    int i_1812_ = (i_1809_ & 0xff) * anInt9936 & 0xff00;
		    i_1809_ = (i_1810_ | i_1811_ | i_1812_) >>> 8;
		    int i_1813_ = is[i_1770_];
		    int i_1814_ = i_1809_ + i_1813_;
		    int i_1815_ = (i_1809_ & 0xff00ff) + (i_1813_ & 0xff00ff);
		    i_1813_ = (i_1815_ & 0x1000100) + (i_1814_ - i_1815_
						       & 0x10000);
		    is[i_1770_]
			= i_1814_ - i_1813_ | i_1813_ - (i_1813_ >>> 8);
		}
	    } else if (i_1771_ == 3) {
		int i_1816_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		int i_1817_ = anInt9931;
		int i_1818_ = i_1816_ + i_1817_;
		int i_1819_ = (i_1816_ & 0xff00ff) + (i_1817_ & 0xff00ff);
		int i_1820_
		    = (i_1819_ & 0x1000100) + (i_1818_ - i_1819_ & 0x10000);
		i_1816_ = i_1818_ - i_1820_ | i_1820_ - (i_1820_ >>> 8);
		i_1820_ = is[i_1770_];
		i_1818_ = i_1816_ + i_1820_;
		i_1819_ = (i_1816_ & 0xff00ff) + (i_1820_ & 0xff00ff);
		i_1820_
		    = (i_1819_ & 0x1000100) + (i_1818_ - i_1819_ & 0x10000);
		is[i_1770_] = i_1818_ - i_1820_ | i_1820_ - (i_1820_ >>> 8);
	    } else if (i_1771_ == 2) {
		int i_1821_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		if (i_1821_ != 0) {
		    int i_1822_ = (i_1821_ & 0xff00ff) * anInt9932 & ~0xff00ff;
		    int i_1823_ = (i_1821_ & 0xff00) * anInt9932 & 0xff0000;
		    i_1821_ = ((i_1822_ | i_1823_) >>> 8) + anInt9939;
		    int i_1824_ = is[i_1770_];
		    int i_1825_ = i_1821_ + i_1824_;
		    int i_1826_ = (i_1821_ & 0xff00ff) + (i_1824_ & 0xff00ff);
		    i_1824_ = (i_1826_ & 0x1000100) + (i_1825_ - i_1826_
						       & 0x10000);
		    is[i_1770_]
			= i_1825_ - i_1824_ | i_1824_ - (i_1824_ >>> 8);
		}
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    void method16970(int i, int i_1827_, int[] is, int i_1828_, int i_1829_) {
	if (i_1829_ == 0) {
	    if (i_1828_ == 1)
		is[i_1827_] = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
	    else if (i_1828_ == 0) {
		int i_1830_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i++];
		int i_1831_ = (i_1830_ & 0xff0000) * anInt9934 & ~0xffffff;
		int i_1832_ = (i_1830_ & 0xff00) * anInt9913 & 0xff0000;
		int i_1833_ = (i_1830_ & 0xff) * anInt9936 & 0xff00;
		is[i_1827_] = (i_1831_ | i_1832_ | i_1833_) >>> 8;
	    } else if (i_1828_ == 3) {
		int i_1834_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i++];
		int i_1835_ = anInt9931;
		int i_1836_ = i_1834_ + i_1835_;
		int i_1837_ = (i_1834_ & 0xff00ff) + (i_1835_ & 0xff00ff);
		int i_1838_
		    = (i_1837_ & 0x1000100) + (i_1836_ - i_1837_ & 0x10000);
		is[i_1827_] = i_1836_ - i_1838_ | i_1838_ - (i_1838_ >>> 8);
	    } else if (i_1828_ == 2) {
		int i_1839_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		int i_1840_ = (i_1839_ & 0xff00ff) * anInt9932 & ~0xff00ff;
		int i_1841_ = (i_1839_ & 0xff00) * anInt9932 & 0xff0000;
		is[i_1827_] = ((i_1840_ | i_1841_) >>> 8) + anInt9939;
	    } else
		throw new IllegalArgumentException();
	} else if (i_1829_ == 1) {
	    if (i_1828_ == 1) {
		int i_1842_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		if (i_1842_ != 0)
		    is[i_1827_] = i_1842_;
	    } else if (i_1828_ == 0) {
		int i_1843_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		if (i_1843_ != 0) {
		    if ((anInt9931 & 0xffffff) == 16777215) {
			int i_1844_ = anInt9931 >>> 24;
			int i_1845_ = 256 - i_1844_;
			int i_1846_ = is[i_1827_];
			is[i_1827_] = ((((i_1843_ & 0xff00ff) * i_1844_
					 + (i_1846_ & 0xff00ff) * i_1845_)
					& ~0xff00ff)
				       + (((i_1843_ & 0xff00) * i_1844_
					   + (i_1846_ & 0xff00) * i_1845_)
					  & 0xff0000)) >> 8;
		    } else if (anInt9932 != 255) {
			int i_1847_
			    = (i_1843_ & 0xff0000) * anInt9934 & ~0xffffff;
			int i_1848_
			    = (i_1843_ & 0xff00) * anInt9913 & 0xff0000;
			int i_1849_ = (i_1843_ & 0xff) * anInt9936 & 0xff00;
			i_1843_ = (i_1847_ | i_1848_ | i_1849_) >>> 8;
			int i_1850_ = is[i_1827_];
			is[i_1827_] = ((((i_1843_ & 0xff00ff) * anInt9932
					 + (i_1850_ & 0xff00ff) * anInt9937)
					& ~0xff00ff)
				       + (((i_1843_ & 0xff00) * anInt9932
					   + (i_1850_ & 0xff00) * anInt9937)
					  & 0xff0000)) >> 8;
		    } else {
			int i_1851_
			    = (i_1843_ & 0xff0000) * anInt9934 & ~0xffffff;
			int i_1852_
			    = (i_1843_ & 0xff00) * anInt9913 & 0xff0000;
			int i_1853_ = (i_1843_ & 0xff) * anInt9936 & 0xff00;
			is[i_1827_] = (i_1851_ | i_1852_ | i_1853_) >>> 8;
		    }
		}
	    } else if (i_1828_ == 3) {
		int i_1854_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		int i_1855_ = anInt9931;
		int i_1856_ = i_1854_ + i_1855_;
		int i_1857_ = (i_1854_ & 0xff00ff) + (i_1855_ & 0xff00ff);
		int i_1858_
		    = (i_1857_ & 0x1000100) + (i_1856_ - i_1857_ & 0x10000);
		i_1858_ = i_1856_ - i_1858_ | i_1858_ - (i_1858_ >>> 8);
		if (i_1854_ == 0 && anInt9932 != 255) {
		    i_1854_ = i_1858_;
		    i_1858_ = is[i_1827_];
		    i_1858_ = ((((i_1854_ & 0xff00ff) * anInt9932
				 + (i_1858_ & 0xff00ff) * anInt9937)
				& ~0xff00ff)
			       + (((i_1854_ & 0xff00) * anInt9932
				   + (i_1858_ & 0xff00) * anInt9937)
				  & 0xff0000)) >> 8;
		}
		is[i_1827_] = i_1858_;
	    } else if (i_1828_ == 2) {
		int i_1859_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		if (i_1859_ != 0) {
		    int i_1860_ = (i_1859_ & 0xff00ff) * anInt9932 & ~0xff00ff;
		    int i_1861_ = (i_1859_ & 0xff00) * anInt9932 & 0xff0000;
		    is[i_1827_++] = ((i_1860_ | i_1861_) >>> 8) + anInt9939;
		}
	    } else
		throw new IllegalArgumentException();
	} else if (i_1829_ == 2) {
	    if (i_1828_ == 1) {
		int i_1862_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		if (i_1862_ != 0) {
		    int i_1863_ = is[i_1827_];
		    int i_1864_ = i_1862_ + i_1863_;
		    int i_1865_ = (i_1862_ & 0xff00ff) + (i_1863_ & 0xff00ff);
		    i_1863_ = (i_1865_ & 0x1000100) + (i_1864_ - i_1865_
						       & 0x10000);
		    is[i_1827_]
			= i_1864_ - i_1863_ | i_1863_ - (i_1863_ >>> 8);
		}
	    } else if (i_1828_ == 0) {
		int i_1866_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		if (i_1866_ != 0) {
		    int i_1867_ = (i_1866_ & 0xff0000) * anInt9934 & ~0xffffff;
		    int i_1868_ = (i_1866_ & 0xff00) * anInt9913 & 0xff0000;
		    int i_1869_ = (i_1866_ & 0xff) * anInt9936 & 0xff00;
		    i_1866_ = (i_1867_ | i_1868_ | i_1869_) >>> 8;
		    int i_1870_ = is[i_1827_];
		    int i_1871_ = i_1866_ + i_1870_;
		    int i_1872_ = (i_1866_ & 0xff00ff) + (i_1870_ & 0xff00ff);
		    i_1870_ = (i_1872_ & 0x1000100) + (i_1871_ - i_1872_
						       & 0x10000);
		    is[i_1827_]
			= i_1871_ - i_1870_ | i_1870_ - (i_1870_ >>> 8);
		}
	    } else if (i_1828_ == 3) {
		int i_1873_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		int i_1874_ = anInt9931;
		int i_1875_ = i_1873_ + i_1874_;
		int i_1876_ = (i_1873_ & 0xff00ff) + (i_1874_ & 0xff00ff);
		int i_1877_
		    = (i_1876_ & 0x1000100) + (i_1875_ - i_1876_ & 0x10000);
		i_1873_ = i_1875_ - i_1877_ | i_1877_ - (i_1877_ >>> 8);
		i_1877_ = is[i_1827_];
		i_1875_ = i_1873_ + i_1877_;
		i_1876_ = (i_1873_ & 0xff00ff) + (i_1877_ & 0xff00ff);
		i_1877_
		    = (i_1876_ & 0x1000100) + (i_1875_ - i_1876_ & 0x10000);
		is[i_1827_] = i_1875_ - i_1877_ | i_1877_ - (i_1877_ >>> 8);
	    } else if (i_1828_ == 2) {
		int i_1878_ = ((Class168_Sub2_Sub1) this).anIntArray10708[i];
		if (i_1878_ != 0) {
		    int i_1879_ = (i_1878_ & 0xff00ff) * anInt9932 & ~0xff00ff;
		    int i_1880_ = (i_1878_ & 0xff00) * anInt9932 & 0xff0000;
		    i_1878_ = ((i_1879_ | i_1880_) >>> 8) + anInt9939;
		    int i_1881_ = is[i_1827_];
		    int i_1882_ = i_1878_ + i_1881_;
		    int i_1883_ = (i_1878_ & 0xff00ff) + (i_1881_ & 0xff00ff);
		    i_1881_ = (i_1883_ & 0x1000100) + (i_1882_ - i_1883_
						       & 0x10000);
		    is[i_1827_]
			= i_1882_ - i_1881_ | i_1881_ - (i_1881_ >>> 8);
		}
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    void method16220(boolean bool, boolean bool_1884_, boolean bool_1885_,
		     int i, int i_1886_, float f, int i_1887_, int i_1888_,
		     int i_1889_, int i_1890_, int i_1891_, int i_1892_,
		     boolean bool_1893_) {
	if (i_1887_ > 0 && i_1888_ > 0 && (bool || bool_1884_)) {
	    int i_1894_ = 0;
	    int i_1895_ = 0;
	    int i_1896_ = (((Class168_Sub2_Sub1) this).anInt9907
			   + ((Class168_Sub2_Sub1) this).anInt9920
			   + ((Class168_Sub2_Sub1) this).anInt9909);
	    int i_1897_ = (((Class168_Sub2_Sub1) this).anInt9905
			   + ((Class168_Sub2_Sub1) this).anInt9916
			   + ((Class168_Sub2_Sub1) this).anInt9910);
	    int i_1898_ = (i_1896_ << 16) / i_1887_;
	    int i_1899_ = (i_1897_ << 16) / i_1888_;
	    if (((Class168_Sub2_Sub1) this).anInt9907 > 0) {
		int i_1900_ = (((((Class168_Sub2_Sub1) this).anInt9907 << 16)
				+ i_1898_ - 1)
			       / i_1898_);
		i += i_1900_;
		i_1894_ += (i_1900_ * i_1898_
			    - (((Class168_Sub2_Sub1) this).anInt9907 << 16));
	    }
	    if (((Class168_Sub2_Sub1) this).anInt9905 > 0) {
		int i_1901_ = (((((Class168_Sub2_Sub1) this).anInt9905 << 16)
				+ i_1899_ - 1)
			       / i_1899_);
		i_1886_ += i_1901_;
		i_1895_ += (i_1901_ * i_1899_
			    - (((Class168_Sub2_Sub1) this).anInt9905 << 16));
	    }
	    if (((Class168_Sub2_Sub1) this).anInt9920 < i_1896_)
		i_1887_ = ((((Class168_Sub2_Sub1) this).anInt9920 << 16)
			   - i_1894_ + i_1898_ - 1) / i_1898_;
	    if (((Class168_Sub2_Sub1) this).anInt9916 < i_1897_)
		i_1888_ = ((((Class168_Sub2_Sub1) this).anInt9916 << 16)
			   - i_1895_ + i_1899_ - 1) / i_1899_;
	    int i_1902_
		= i + i_1886_ * ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						    .aClass103_Sub2_9904))
				  .anInt9260)
				 * -1826993761);
	    int i_1903_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					      .aClass103_Sub2_9904)).anInt9260
			    * -1826993761)
			   - i_1887_);
	    if (i_1886_ + i_1888_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_1888_ -= (i_1886_ + i_1888_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i_1886_ < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_1904_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_1886_);
		i_1888_ -= i_1904_;
		i_1902_ += i_1904_ * (((Class103_Sub2)
				       (((Class168_Sub2_Sub1) this)
					.aClass103_Sub2_9904)).anInt9260
				      * -1826993761);
		i_1895_ += i_1899_ * i_1904_;
	    }
	    if (i + i_1887_ > (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_1905_ = (i + i_1887_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_1887_ -= i_1905_;
		i_1903_ += i_1905_;
	    }
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_1906_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_1887_ -= i_1906_;
		i_1902_ += i_1906_;
		i_1894_ += i_1898_ * i_1906_;
		i_1903_ += i_1906_;
	    }
	    float[] fs = (((Class103_Sub2)
			   ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			  .aFloatArray9248);
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (i_1891_ == 0) {
		if (i_1889_ == 1) {
		    int i_1907_ = i_1894_;
		    for (int i_1908_ = -i_1888_; i_1908_ < 0; i_1908_++) {
			int i_1909_
			    = ((i_1895_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_1910_ = -i_1887_; i_1910_ < 0; i_1910_++) {
			    if (!bool_1884_ || f < fs[i_1902_]) {
				if (bool)
				    is[i_1902_]
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_1894_ >> 16) + i_1909_]);
				if (bool_1884_ && bool_1893_)
				    fs[i_1902_] = f;
			    }
			    i_1894_ += i_1898_;
			    i_1902_++;
			}
			i_1895_ += i_1899_;
			i_1894_ = i_1907_;
			i_1902_ += i_1903_;
		    }
		} else if (i_1889_ == 0) {
		    int i_1911_ = (i_1890_ & 0xff0000) >> 16;
		    int i_1912_ = (i_1890_ & 0xff00) >> 8;
		    int i_1913_ = i_1890_ & 0xff;
		    int i_1914_ = i_1894_;
		    for (int i_1915_ = -i_1888_; i_1915_ < 0; i_1915_++) {
			int i_1916_
			    = ((i_1895_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_1917_ = -i_1887_; i_1917_ < 0; i_1917_++) {
			    if (!bool_1884_ || f < fs[i_1902_]) {
				if (bool) {
				    int i_1918_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_1894_ >> 16) + i_1916_]);
				    int i_1919_
					= ((i_1918_ & 0xff0000) * i_1911_
					   & ~0xffffff);
				    int i_1920_ = ((i_1918_ & 0xff00) * i_1912_
						   & 0xff0000);
				    int i_1921_
					= (i_1918_ & 0xff) * i_1913_ & 0xff00;
				    is[i_1902_]
					= (i_1919_ | i_1920_ | i_1921_) >>> 8;
				}
				if (bool_1884_ && bool_1893_)
				    fs[i_1902_] = f;
			    }
			    i_1894_ += i_1898_;
			    i_1902_++;
			}
			i_1895_ += i_1899_;
			i_1894_ = i_1914_;
			i_1902_ += i_1903_;
		    }
		} else if (i_1889_ == 3) {
		    int i_1922_ = i_1894_;
		    for (int i_1923_ = -i_1888_; i_1923_ < 0; i_1923_++) {
			int i_1924_
			    = ((i_1895_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_1925_ = -i_1887_; i_1925_ < 0; i_1925_++) {
			    if (!bool_1884_ || f < fs[i_1902_]) {
				if (bool) {
				    int i_1926_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_1894_ >> 16) + i_1924_]);
				    int i_1927_ = i_1926_ + i_1890_;
				    int i_1928_ = ((i_1926_ & 0xff00ff)
						   + (i_1890_ & 0xff00ff));
				    int i_1929_
					= ((i_1928_ & 0x1000100)
					   + (i_1927_ - i_1928_ & 0x10000));
				    is[i_1902_]
					= (i_1927_ - i_1929_
					   | i_1929_ - (i_1929_ >>> 8));
				}
				if (bool_1884_ && bool_1893_)
				    fs[i_1902_] = f;
			    }
			    i_1894_ += i_1898_;
			    i_1902_++;
			}
			i_1895_ += i_1899_;
			i_1894_ = i_1922_;
			i_1902_ += i_1903_;
		    }
		} else if (i_1889_ == 2) {
		    int i_1930_ = i_1890_ >>> 24;
		    int i_1931_ = 256 - i_1930_;
		    int i_1932_ = (i_1890_ & 0xff00ff) * i_1931_ & ~0xff00ff;
		    int i_1933_ = (i_1890_ & 0xff00) * i_1931_ & 0xff0000;
		    i_1890_ = (i_1932_ | i_1933_) >>> 8;
		    int i_1934_ = i_1894_;
		    for (int i_1935_ = -i_1888_; i_1935_ < 0; i_1935_++) {
			int i_1936_
			    = ((i_1895_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_1937_ = -i_1887_; i_1937_ < 0; i_1937_++) {
			    if (!bool_1884_ || f < fs[i_1902_]) {
				if (bool) {
				    int i_1938_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_1894_ >> 16) + i_1936_]);
				    i_1932_ = ((i_1938_ & 0xff00ff) * i_1930_
					       & ~0xff00ff);
				    i_1933_ = ((i_1938_ & 0xff00) * i_1930_
					       & 0xff0000);
				    is[i_1902_] = (((i_1932_ | i_1933_) >>> 8)
						   + i_1890_);
				}
				if (bool_1884_ && bool_1893_)
				    fs[i_1902_] = f;
			    }
			    i_1894_ += i_1898_;
			    i_1902_++;
			}
			i_1895_ += i_1899_;
			i_1894_ = i_1934_;
			i_1902_ += i_1903_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1891_ == 1) {
		if (i_1889_ == 1) {
		    int i_1939_ = i_1894_;
		    for (int i_1940_ = -i_1888_; i_1940_ < 0; i_1940_++) {
			int i_1941_
			    = ((i_1895_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_1942_ = -i_1887_; i_1942_ < 0; i_1942_++) {
			    if (!bool_1884_ || f < fs[i_1902_]) {
				int i_1943_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1894_ >> 16) + i_1941_]);
				if (i_1943_ != 0) {
				    if (bool)
					is[i_1902_] = i_1943_;
				    if (bool_1884_ && bool_1893_)
					fs[i_1902_] = f;
				}
			    }
			    i_1894_ += i_1898_;
			    i_1902_++;
			}
			i_1895_ += i_1899_;
			i_1894_ = i_1939_;
			i_1902_ += i_1903_;
		    }
		} else if (i_1889_ == 0) {
		    int i_1944_ = i_1894_;
		    if ((i_1890_ & 0xffffff) == 16777215) {
			int i_1945_ = i_1890_ >>> 24;
			int i_1946_ = 256 - i_1945_;
			for (int i_1947_ = -i_1888_; i_1947_ < 0; i_1947_++) {
			    int i_1948_
				= ((i_1895_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1949_ = -i_1887_; i_1949_ < 0;
				 i_1949_++) {
				if (!bool_1884_ || f < fs[i_1902_]) {
				    int i_1950_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_1894_ >> 16) + i_1948_]);
				    if (i_1950_ != 0) {
					if (bool) {
					    int i_1951_ = is[i_1902_];
					    is[i_1902_]
						= (((((i_1950_ & 0xff00ff)
						      * i_1945_)
						     + ((i_1951_ & 0xff00ff)
							* i_1946_))
						    & ~0xff00ff)
						   + ((((i_1950_ & 0xff00)
							* i_1945_)
						       + ((i_1951_ & 0xff00)
							  * i_1946_))
						      & 0xff0000)) >> 8;
					}
					if (bool_1884_ && bool_1893_)
					    fs[i_1902_] = f;
				    }
				}
				i_1894_ += i_1898_;
				i_1902_++;
			    }
			    i_1895_ += i_1899_;
			    i_1894_ = i_1944_;
			    i_1902_ += i_1903_;
			}
		    } else {
			int i_1952_ = (i_1890_ & 0xff0000) >> 16;
			int i_1953_ = (i_1890_ & 0xff00) >> 8;
			int i_1954_ = i_1890_ & 0xff;
			int i_1955_ = i_1890_ >>> 24;
			int i_1956_ = 256 - i_1955_;
			for (int i_1957_ = -i_1888_; i_1957_ < 0; i_1957_++) {
			    int i_1958_
				= ((i_1895_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_1959_ = -i_1887_; i_1959_ < 0;
				 i_1959_++) {
				if (!bool_1884_ || f < fs[i_1902_]) {
				    int i_1960_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_1894_ >> 16) + i_1958_]);
				    if (i_1960_ != 0) {
					if (i_1955_ != 255) {
					    if (bool) {
						int i_1961_
						    = (((i_1960_ & 0xff0000)
							* i_1952_)
						       & ~0xffffff);
						int i_1962_
						    = (((i_1960_ & 0xff00)
							* i_1953_)
						       & 0xff0000);
						int i_1963_
						    = (((i_1960_ & 0xff)
							* i_1954_)
						       & 0xff00);
						i_1960_ = (i_1961_ | i_1962_
							   | i_1963_) >>> 8;
						int i_1964_ = is[i_1902_];
						is[i_1902_]
						    = (((((i_1960_ & 0xff00ff)
							  * i_1955_)
							 + ((i_1964_
							     & 0xff00ff)
							    * i_1956_))
							& ~0xff00ff)
						       + ((((i_1960_ & 0xff00)
							    * i_1955_)
							   + ((i_1964_
							       & 0xff00)
							      * i_1956_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_1884_ && bool_1893_)
						fs[i_1902_] = f;
					} else {
					    if (bool) {
						int i_1965_
						    = (((i_1960_ & 0xff0000)
							* i_1952_)
						       & ~0xffffff);
						int i_1966_
						    = (((i_1960_ & 0xff00)
							* i_1953_)
						       & 0xff0000);
						int i_1967_
						    = (((i_1960_ & 0xff)
							* i_1954_)
						       & 0xff00);
						is[i_1902_]
						    = (i_1965_ | i_1966_
						       | i_1967_) >>> 8;
					    }
					    if (bool_1884_ && bool_1893_)
						fs[i_1902_] = f;
					}
				    }
				}
				i_1894_ += i_1898_;
				i_1902_++;
			    }
			    i_1895_ += i_1899_;
			    i_1894_ = i_1944_;
			    i_1902_ += i_1903_;
			}
		    }
		} else if (i_1889_ == 3) {
		    int i_1968_ = i_1894_;
		    int i_1969_ = i_1890_ >>> 24;
		    int i_1970_ = 256 - i_1969_;
		    for (int i_1971_ = -i_1888_; i_1971_ < 0; i_1971_++) {
			int i_1972_
			    = ((i_1895_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_1973_ = -i_1887_; i_1973_ < 0; i_1973_++) {
			    if (!bool_1884_ || f < fs[i_1902_]) {
				if (bool) {
				    int i_1974_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_1894_ >> 16) + i_1972_]);
				    int i_1975_ = i_1974_ + i_1890_;
				    int i_1976_ = ((i_1974_ & 0xff00ff)
						   + (i_1890_ & 0xff00ff));
				    int i_1977_
					= ((i_1976_ & 0x1000100)
					   + (i_1975_ - i_1976_ & 0x10000));
				    i_1977_ = (i_1975_ - i_1977_
					       | i_1977_ - (i_1977_ >>> 8));
				    if (i_1974_ == 0 && i_1969_ != 255) {
					i_1974_ = i_1977_;
					i_1977_ = is[i_1902_];
					i_1977_
					    = ((((i_1974_ & 0xff00ff) * i_1969_
						 + ((i_1977_ & 0xff00ff)
						    * i_1970_))
						& ~0xff00ff)
					       + (((i_1974_ & 0xff00) * i_1969_
						   + ((i_1977_ & 0xff00)
						      * i_1970_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_1902_] = i_1977_;
				}
				if (bool_1884_ && bool_1893_)
				    fs[i_1902_] = f;
			    }
			    i_1894_ += i_1898_;
			    i_1902_++;
			}
			i_1895_ += i_1899_;
			i_1894_ = i_1968_;
			i_1902_ += i_1903_;
		    }
		} else if (i_1889_ == 2) {
		    int i_1978_ = i_1890_ >>> 24;
		    int i_1979_ = 256 - i_1978_;
		    int i_1980_ = (i_1890_ & 0xff00ff) * i_1979_ & ~0xff00ff;
		    int i_1981_ = (i_1890_ & 0xff00) * i_1979_ & 0xff0000;
		    i_1890_ = (i_1980_ | i_1981_) >>> 8;
		    int i_1982_ = i_1894_;
		    for (int i_1983_ = -i_1888_; i_1983_ < 0; i_1983_++) {
			int i_1984_
			    = ((i_1895_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_1985_ = -i_1887_; i_1985_ < 0; i_1985_++) {
			    if (!bool_1884_ || f < fs[i_1902_]) {
				int i_1986_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1894_ >> 16) + i_1984_]);
				if (i_1986_ != 0) {
				    if (bool) {
					i_1980_
					    = ((i_1986_ & 0xff00ff) * i_1978_
					       & ~0xff00ff);
					i_1981_ = ((i_1986_ & 0xff00) * i_1978_
						   & 0xff0000);
					is[i_1902_] = ((i_1980_ | i_1981_)
						       >>> 8) + i_1890_;
				    }
				    if (bool_1884_ && bool_1893_)
					fs[i_1902_] = f;
				}
			    }
			    i_1894_ += i_1898_;
			    i_1902_++;
			}
			i_1895_ += i_1899_;
			i_1894_ = i_1982_;
			i_1902_ += i_1903_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1891_ == 2) {
		if (i_1889_ == 1) {
		    int i_1987_ = i_1894_;
		    for (int i_1988_ = -i_1888_; i_1988_ < 0; i_1988_++) {
			int i_1989_
			    = ((i_1895_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_1990_ = -i_1887_; i_1990_ < 0; i_1990_++) {
			    if (!bool_1884_ || f < fs[i_1902_]) {
				int i_1991_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1894_ >> 16) + i_1989_]);
				if (i_1991_ != 0) {
				    if (bool) {
					int i_1992_ = is[i_1902_];
					int i_1993_ = i_1991_ + i_1992_;
					int i_1994_ = ((i_1991_ & 0xff00ff)
						       + (i_1992_ & 0xff00ff));
					i_1992_ = ((i_1994_ & 0x1000100)
						   + (i_1993_ - i_1994_
						      & 0x10000));
					is[i_1902_]
					    = (i_1993_ - i_1992_
					       | i_1992_ - (i_1992_ >>> 8));
				    }
				    if (bool_1884_ && bool_1893_)
					fs[i_1902_] = f;
				}
			    }
			    i_1894_ += i_1898_;
			    i_1902_++;
			}
			i_1895_ += i_1899_;
			i_1894_ = i_1987_;
			i_1902_ += i_1903_;
		    }
		} else if (i_1889_ == 0) {
		    int i_1995_ = i_1894_;
		    int i_1996_ = (i_1890_ & 0xff0000) >> 16;
		    int i_1997_ = (i_1890_ & 0xff00) >> 8;
		    int i_1998_ = i_1890_ & 0xff;
		    for (int i_1999_ = -i_1888_; i_1999_ < 0; i_1999_++) {
			int i_2000_
			    = ((i_1895_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2001_ = -i_1887_; i_2001_ < 0; i_2001_++) {
			    if (!bool_1884_ || f < fs[i_1902_]) {
				int i_2002_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1894_ >> 16) + i_2000_]);
				if (i_2002_ != 0) {
				    if (bool) {
					int i_2003_
					    = ((i_2002_ & 0xff0000) * i_1996_
					       & ~0xffffff);
					int i_2004_
					    = ((i_2002_ & 0xff00) * i_1997_
					       & 0xff0000);
					int i_2005_
					    = ((i_2002_ & 0xff) * i_1998_
					       & 0xff00);
					i_2002_ = (i_2003_ | i_2004_
						   | i_2005_) >>> 8;
					int i_2006_ = is[i_1902_];
					int i_2007_ = i_2002_ + i_2006_;
					int i_2008_ = ((i_2002_ & 0xff00ff)
						       + (i_2006_ & 0xff00ff));
					i_2006_ = ((i_2008_ & 0x1000100)
						   + (i_2007_ - i_2008_
						      & 0x10000));
					is[i_1902_]
					    = (i_2007_ - i_2006_
					       | i_2006_ - (i_2006_ >>> 8));
				    }
				    if (bool_1884_ && bool_1893_)
					fs[i_1902_] = f;
				}
			    }
			    i_1894_ += i_1898_;
			    i_1902_++;
			}
			i_1895_ += i_1899_;
			i_1894_ = i_1995_;
			i_1902_ += i_1903_;
		    }
		} else if (i_1889_ == 3) {
		    int i_2009_ = i_1894_;
		    for (int i_2010_ = -i_1888_; i_2010_ < 0; i_2010_++) {
			int i_2011_
			    = ((i_1895_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2012_ = -i_1887_; i_2012_ < 0; i_2012_++) {
			    if (!bool_1884_ || f < fs[i_1902_]) {
				if (bool) {
				    int i_2013_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_1894_ >> 16) + i_2011_]);
				    int i_2014_ = i_2013_ + i_1890_;
				    int i_2015_ = ((i_2013_ & 0xff00ff)
						   + (i_1890_ & 0xff00ff));
				    int i_2016_
					= ((i_2015_ & 0x1000100)
					   + (i_2014_ - i_2015_ & 0x10000));
				    i_2013_ = (i_2014_ - i_2016_
					       | i_2016_ - (i_2016_ >>> 8));
				    i_2016_ = is[i_1902_];
				    i_2014_ = i_2013_ + i_2016_;
				    i_2015_
					= (i_2013_ & 0xff00ff) + (i_2016_
								  & 0xff00ff);
				    i_2016_
					= ((i_2015_ & 0x1000100)
					   + (i_2014_ - i_2015_ & 0x10000));
				    is[i_1902_]
					= (i_2014_ - i_2016_
					   | i_2016_ - (i_2016_ >>> 8));
				}
				if (bool_1884_ && bool_1893_)
				    fs[i_1902_] = f;
			    }
			    i_1894_ += i_1898_;
			    i_1902_++;
			}
			i_1895_ += i_1899_;
			i_1894_ = i_2009_;
			i_1902_ += i_1903_;
		    }
		} else if (i_1889_ == 2) {
		    int i_2017_ = i_1890_ >>> 24;
		    int i_2018_ = 256 - i_2017_;
		    int i_2019_ = (i_1890_ & 0xff00ff) * i_2018_ & ~0xff00ff;
		    int i_2020_ = (i_1890_ & 0xff00) * i_2018_ & 0xff0000;
		    i_1890_ = (i_2019_ | i_2020_) >>> 8;
		    int i_2021_ = i_1894_;
		    for (int i_2022_ = -i_1888_; i_2022_ < 0; i_2022_++) {
			int i_2023_
			    = ((i_1895_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2024_ = -i_1887_; i_2024_ < 0; i_2024_++) {
			    if (!bool_1884_ || f < fs[i_1902_]) {
				int i_2025_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_1894_ >> 16) + i_2023_]);
				if (i_2025_ != 0) {
				    if (bool) {
					i_2019_
					    = ((i_2025_ & 0xff00ff) * i_2017_
					       & ~0xff00ff);
					i_2020_ = ((i_2025_ & 0xff00) * i_2017_
						   & 0xff0000);
					i_2025_ = (((i_2019_ | i_2020_) >>> 8)
						   + i_1890_);
					int i_2026_ = is[i_1902_];
					int i_2027_ = i_2025_ + i_2026_;
					int i_2028_ = ((i_2025_ & 0xff00ff)
						       + (i_2026_ & 0xff00ff));
					i_2026_ = ((i_2028_ & 0x1000100)
						   + (i_2027_ - i_2028_
						      & 0x10000));
					is[i_1902_]
					    = (i_2027_ - i_2026_
					       | i_2026_ - (i_2026_ >>> 8));
				    }
				    if (bool_1884_ && bool_1893_)
					fs[i_1902_] = f;
				}
			    }
			    i_1894_ += i_1898_;
			    i_1902_++;
			}
			i_1895_ += i_1899_;
			i_1894_ = i_2021_;
			i_1902_ += i_1903_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method16224(boolean bool, boolean bool_2029_, boolean bool_2030_,
		     int i, int i_2031_, float f, int i_2032_, int i_2033_,
		     int i_2034_, int i_2035_, int i_2036_, int i_2037_,
		     boolean bool_2038_) {
	if (i_2032_ > 0 && i_2033_ > 0 && (bool || bool_2029_)) {
	    int i_2039_ = 0;
	    int i_2040_ = 0;
	    int i_2041_ = (((Class168_Sub2_Sub1) this).anInt9907
			   + ((Class168_Sub2_Sub1) this).anInt9920
			   + ((Class168_Sub2_Sub1) this).anInt9909);
	    int i_2042_ = (((Class168_Sub2_Sub1) this).anInt9905
			   + ((Class168_Sub2_Sub1) this).anInt9916
			   + ((Class168_Sub2_Sub1) this).anInt9910);
	    int i_2043_ = (i_2041_ << 16) / i_2032_;
	    int i_2044_ = (i_2042_ << 16) / i_2033_;
	    if (((Class168_Sub2_Sub1) this).anInt9907 > 0) {
		int i_2045_ = (((((Class168_Sub2_Sub1) this).anInt9907 << 16)
				+ i_2043_ - 1)
			       / i_2043_);
		i += i_2045_;
		i_2039_ += (i_2045_ * i_2043_
			    - (((Class168_Sub2_Sub1) this).anInt9907 << 16));
	    }
	    if (((Class168_Sub2_Sub1) this).anInt9905 > 0) {
		int i_2046_ = (((((Class168_Sub2_Sub1) this).anInt9905 << 16)
				+ i_2044_ - 1)
			       / i_2044_);
		i_2031_ += i_2046_;
		i_2040_ += (i_2046_ * i_2044_
			    - (((Class168_Sub2_Sub1) this).anInt9905 << 16));
	    }
	    if (((Class168_Sub2_Sub1) this).anInt9920 < i_2041_)
		i_2032_ = ((((Class168_Sub2_Sub1) this).anInt9920 << 16)
			   - i_2039_ + i_2043_ - 1) / i_2043_;
	    if (((Class168_Sub2_Sub1) this).anInt9916 < i_2042_)
		i_2033_ = ((((Class168_Sub2_Sub1) this).anInt9916 << 16)
			   - i_2040_ + i_2044_ - 1) / i_2044_;
	    int i_2047_
		= i + i_2031_ * ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						    .aClass103_Sub2_9904))
				  .anInt9260)
				 * -1826993761);
	    int i_2048_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					      .aClass103_Sub2_9904)).anInt9260
			    * -1826993761)
			   - i_2032_);
	    if (i_2031_ + i_2033_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_2033_ -= (i_2031_ + i_2033_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i_2031_ < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_2049_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_2031_);
		i_2033_ -= i_2049_;
		i_2047_ += i_2049_ * (((Class103_Sub2)
				       (((Class168_Sub2_Sub1) this)
					.aClass103_Sub2_9904)).anInt9260
				      * -1826993761);
		i_2040_ += i_2044_ * i_2049_;
	    }
	    if (i + i_2032_ > (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_2050_ = (i + i_2032_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_2032_ -= i_2050_;
		i_2048_ += i_2050_;
	    }
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_2051_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_2032_ -= i_2051_;
		i_2047_ += i_2051_;
		i_2039_ += i_2043_ * i_2051_;
		i_2048_ += i_2051_;
	    }
	    float[] fs = (((Class103_Sub2)
			   ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			  .aFloatArray9248);
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (i_2036_ == 0) {
		if (i_2034_ == 1) {
		    int i_2052_ = i_2039_;
		    for (int i_2053_ = -i_2033_; i_2053_ < 0; i_2053_++) {
			int i_2054_
			    = ((i_2040_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2055_ = -i_2032_; i_2055_ < 0; i_2055_++) {
			    if (!bool_2029_ || f < fs[i_2047_]) {
				if (bool)
				    is[i_2047_]
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2039_ >> 16) + i_2054_]);
				if (bool_2029_ && bool_2038_)
				    fs[i_2047_] = f;
			    }
			    i_2039_ += i_2043_;
			    i_2047_++;
			}
			i_2040_ += i_2044_;
			i_2039_ = i_2052_;
			i_2047_ += i_2048_;
		    }
		} else if (i_2034_ == 0) {
		    int i_2056_ = (i_2035_ & 0xff0000) >> 16;
		    int i_2057_ = (i_2035_ & 0xff00) >> 8;
		    int i_2058_ = i_2035_ & 0xff;
		    int i_2059_ = i_2039_;
		    for (int i_2060_ = -i_2033_; i_2060_ < 0; i_2060_++) {
			int i_2061_
			    = ((i_2040_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2062_ = -i_2032_; i_2062_ < 0; i_2062_++) {
			    if (!bool_2029_ || f < fs[i_2047_]) {
				if (bool) {
				    int i_2063_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2039_ >> 16) + i_2061_]);
				    int i_2064_
					= ((i_2063_ & 0xff0000) * i_2056_
					   & ~0xffffff);
				    int i_2065_ = ((i_2063_ & 0xff00) * i_2057_
						   & 0xff0000);
				    int i_2066_
					= (i_2063_ & 0xff) * i_2058_ & 0xff00;
				    is[i_2047_]
					= (i_2064_ | i_2065_ | i_2066_) >>> 8;
				}
				if (bool_2029_ && bool_2038_)
				    fs[i_2047_] = f;
			    }
			    i_2039_ += i_2043_;
			    i_2047_++;
			}
			i_2040_ += i_2044_;
			i_2039_ = i_2059_;
			i_2047_ += i_2048_;
		    }
		} else if (i_2034_ == 3) {
		    int i_2067_ = i_2039_;
		    for (int i_2068_ = -i_2033_; i_2068_ < 0; i_2068_++) {
			int i_2069_
			    = ((i_2040_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2070_ = -i_2032_; i_2070_ < 0; i_2070_++) {
			    if (!bool_2029_ || f < fs[i_2047_]) {
				if (bool) {
				    int i_2071_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2039_ >> 16) + i_2069_]);
				    int i_2072_ = i_2071_ + i_2035_;
				    int i_2073_ = ((i_2071_ & 0xff00ff)
						   + (i_2035_ & 0xff00ff));
				    int i_2074_
					= ((i_2073_ & 0x1000100)
					   + (i_2072_ - i_2073_ & 0x10000));
				    is[i_2047_]
					= (i_2072_ - i_2074_
					   | i_2074_ - (i_2074_ >>> 8));
				}
				if (bool_2029_ && bool_2038_)
				    fs[i_2047_] = f;
			    }
			    i_2039_ += i_2043_;
			    i_2047_++;
			}
			i_2040_ += i_2044_;
			i_2039_ = i_2067_;
			i_2047_ += i_2048_;
		    }
		} else if (i_2034_ == 2) {
		    int i_2075_ = i_2035_ >>> 24;
		    int i_2076_ = 256 - i_2075_;
		    int i_2077_ = (i_2035_ & 0xff00ff) * i_2076_ & ~0xff00ff;
		    int i_2078_ = (i_2035_ & 0xff00) * i_2076_ & 0xff0000;
		    i_2035_ = (i_2077_ | i_2078_) >>> 8;
		    int i_2079_ = i_2039_;
		    for (int i_2080_ = -i_2033_; i_2080_ < 0; i_2080_++) {
			int i_2081_
			    = ((i_2040_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2082_ = -i_2032_; i_2082_ < 0; i_2082_++) {
			    if (!bool_2029_ || f < fs[i_2047_]) {
				if (bool) {
				    int i_2083_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2039_ >> 16) + i_2081_]);
				    i_2077_ = ((i_2083_ & 0xff00ff) * i_2075_
					       & ~0xff00ff);
				    i_2078_ = ((i_2083_ & 0xff00) * i_2075_
					       & 0xff0000);
				    is[i_2047_] = (((i_2077_ | i_2078_) >>> 8)
						   + i_2035_);
				}
				if (bool_2029_ && bool_2038_)
				    fs[i_2047_] = f;
			    }
			    i_2039_ += i_2043_;
			    i_2047_++;
			}
			i_2040_ += i_2044_;
			i_2039_ = i_2079_;
			i_2047_ += i_2048_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_2036_ == 1) {
		if (i_2034_ == 1) {
		    int i_2084_ = i_2039_;
		    for (int i_2085_ = -i_2033_; i_2085_ < 0; i_2085_++) {
			int i_2086_
			    = ((i_2040_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2087_ = -i_2032_; i_2087_ < 0; i_2087_++) {
			    if (!bool_2029_ || f < fs[i_2047_]) {
				int i_2088_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_2039_ >> 16) + i_2086_]);
				if (i_2088_ != 0) {
				    if (bool)
					is[i_2047_] = i_2088_;
				    if (bool_2029_ && bool_2038_)
					fs[i_2047_] = f;
				}
			    }
			    i_2039_ += i_2043_;
			    i_2047_++;
			}
			i_2040_ += i_2044_;
			i_2039_ = i_2084_;
			i_2047_ += i_2048_;
		    }
		} else if (i_2034_ == 0) {
		    int i_2089_ = i_2039_;
		    if ((i_2035_ & 0xffffff) == 16777215) {
			int i_2090_ = i_2035_ >>> 24;
			int i_2091_ = 256 - i_2090_;
			for (int i_2092_ = -i_2033_; i_2092_ < 0; i_2092_++) {
			    int i_2093_
				= ((i_2040_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_2094_ = -i_2032_; i_2094_ < 0;
				 i_2094_++) {
				if (!bool_2029_ || f < fs[i_2047_]) {
				    int i_2095_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2039_ >> 16) + i_2093_]);
				    if (i_2095_ != 0) {
					if (bool) {
					    int i_2096_ = is[i_2047_];
					    is[i_2047_]
						= (((((i_2095_ & 0xff00ff)
						      * i_2090_)
						     + ((i_2096_ & 0xff00ff)
							* i_2091_))
						    & ~0xff00ff)
						   + ((((i_2095_ & 0xff00)
							* i_2090_)
						       + ((i_2096_ & 0xff00)
							  * i_2091_))
						      & 0xff0000)) >> 8;
					}
					if (bool_2029_ && bool_2038_)
					    fs[i_2047_] = f;
				    }
				}
				i_2039_ += i_2043_;
				i_2047_++;
			    }
			    i_2040_ += i_2044_;
			    i_2039_ = i_2089_;
			    i_2047_ += i_2048_;
			}
		    } else {
			int i_2097_ = (i_2035_ & 0xff0000) >> 16;
			int i_2098_ = (i_2035_ & 0xff00) >> 8;
			int i_2099_ = i_2035_ & 0xff;
			int i_2100_ = i_2035_ >>> 24;
			int i_2101_ = 256 - i_2100_;
			for (int i_2102_ = -i_2033_; i_2102_ < 0; i_2102_++) {
			    int i_2103_
				= ((i_2040_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_2104_ = -i_2032_; i_2104_ < 0;
				 i_2104_++) {
				if (!bool_2029_ || f < fs[i_2047_]) {
				    int i_2105_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2039_ >> 16) + i_2103_]);
				    if (i_2105_ != 0) {
					if (i_2100_ != 255) {
					    if (bool) {
						int i_2106_
						    = (((i_2105_ & 0xff0000)
							* i_2097_)
						       & ~0xffffff);
						int i_2107_
						    = (((i_2105_ & 0xff00)
							* i_2098_)
						       & 0xff0000);
						int i_2108_
						    = (((i_2105_ & 0xff)
							* i_2099_)
						       & 0xff00);
						i_2105_ = (i_2106_ | i_2107_
							   | i_2108_) >>> 8;
						int i_2109_ = is[i_2047_];
						is[i_2047_]
						    = (((((i_2105_ & 0xff00ff)
							  * i_2100_)
							 + ((i_2109_
							     & 0xff00ff)
							    * i_2101_))
							& ~0xff00ff)
						       + ((((i_2105_ & 0xff00)
							    * i_2100_)
							   + ((i_2109_
							       & 0xff00)
							      * i_2101_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_2029_ && bool_2038_)
						fs[i_2047_] = f;
					} else {
					    if (bool) {
						int i_2110_
						    = (((i_2105_ & 0xff0000)
							* i_2097_)
						       & ~0xffffff);
						int i_2111_
						    = (((i_2105_ & 0xff00)
							* i_2098_)
						       & 0xff0000);
						int i_2112_
						    = (((i_2105_ & 0xff)
							* i_2099_)
						       & 0xff00);
						is[i_2047_]
						    = (i_2110_ | i_2111_
						       | i_2112_) >>> 8;
					    }
					    if (bool_2029_ && bool_2038_)
						fs[i_2047_] = f;
					}
				    }
				}
				i_2039_ += i_2043_;
				i_2047_++;
			    }
			    i_2040_ += i_2044_;
			    i_2039_ = i_2089_;
			    i_2047_ += i_2048_;
			}
		    }
		} else if (i_2034_ == 3) {
		    int i_2113_ = i_2039_;
		    int i_2114_ = i_2035_ >>> 24;
		    int i_2115_ = 256 - i_2114_;
		    for (int i_2116_ = -i_2033_; i_2116_ < 0; i_2116_++) {
			int i_2117_
			    = ((i_2040_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2118_ = -i_2032_; i_2118_ < 0; i_2118_++) {
			    if (!bool_2029_ || f < fs[i_2047_]) {
				if (bool) {
				    int i_2119_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2039_ >> 16) + i_2117_]);
				    int i_2120_ = i_2119_ + i_2035_;
				    int i_2121_ = ((i_2119_ & 0xff00ff)
						   + (i_2035_ & 0xff00ff));
				    int i_2122_
					= ((i_2121_ & 0x1000100)
					   + (i_2120_ - i_2121_ & 0x10000));
				    i_2122_ = (i_2120_ - i_2122_
					       | i_2122_ - (i_2122_ >>> 8));
				    if (i_2119_ == 0 && i_2114_ != 255) {
					i_2119_ = i_2122_;
					i_2122_ = is[i_2047_];
					i_2122_
					    = ((((i_2119_ & 0xff00ff) * i_2114_
						 + ((i_2122_ & 0xff00ff)
						    * i_2115_))
						& ~0xff00ff)
					       + (((i_2119_ & 0xff00) * i_2114_
						   + ((i_2122_ & 0xff00)
						      * i_2115_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_2047_] = i_2122_;
				}
				if (bool_2029_ && bool_2038_)
				    fs[i_2047_] = f;
			    }
			    i_2039_ += i_2043_;
			    i_2047_++;
			}
			i_2040_ += i_2044_;
			i_2039_ = i_2113_;
			i_2047_ += i_2048_;
		    }
		} else if (i_2034_ == 2) {
		    int i_2123_ = i_2035_ >>> 24;
		    int i_2124_ = 256 - i_2123_;
		    int i_2125_ = (i_2035_ & 0xff00ff) * i_2124_ & ~0xff00ff;
		    int i_2126_ = (i_2035_ & 0xff00) * i_2124_ & 0xff0000;
		    i_2035_ = (i_2125_ | i_2126_) >>> 8;
		    int i_2127_ = i_2039_;
		    for (int i_2128_ = -i_2033_; i_2128_ < 0; i_2128_++) {
			int i_2129_
			    = ((i_2040_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2130_ = -i_2032_; i_2130_ < 0; i_2130_++) {
			    if (!bool_2029_ || f < fs[i_2047_]) {
				int i_2131_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_2039_ >> 16) + i_2129_]);
				if (i_2131_ != 0) {
				    if (bool) {
					i_2125_
					    = ((i_2131_ & 0xff00ff) * i_2123_
					       & ~0xff00ff);
					i_2126_ = ((i_2131_ & 0xff00) * i_2123_
						   & 0xff0000);
					is[i_2047_] = ((i_2125_ | i_2126_)
						       >>> 8) + i_2035_;
				    }
				    if (bool_2029_ && bool_2038_)
					fs[i_2047_] = f;
				}
			    }
			    i_2039_ += i_2043_;
			    i_2047_++;
			}
			i_2040_ += i_2044_;
			i_2039_ = i_2127_;
			i_2047_ += i_2048_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_2036_ == 2) {
		if (i_2034_ == 1) {
		    int i_2132_ = i_2039_;
		    for (int i_2133_ = -i_2033_; i_2133_ < 0; i_2133_++) {
			int i_2134_
			    = ((i_2040_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2135_ = -i_2032_; i_2135_ < 0; i_2135_++) {
			    if (!bool_2029_ || f < fs[i_2047_]) {
				int i_2136_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_2039_ >> 16) + i_2134_]);
				if (i_2136_ != 0) {
				    if (bool) {
					int i_2137_ = is[i_2047_];
					int i_2138_ = i_2136_ + i_2137_;
					int i_2139_ = ((i_2136_ & 0xff00ff)
						       + (i_2137_ & 0xff00ff));
					i_2137_ = ((i_2139_ & 0x1000100)
						   + (i_2138_ - i_2139_
						      & 0x10000));
					is[i_2047_]
					    = (i_2138_ - i_2137_
					       | i_2137_ - (i_2137_ >>> 8));
				    }
				    if (bool_2029_ && bool_2038_)
					fs[i_2047_] = f;
				}
			    }
			    i_2039_ += i_2043_;
			    i_2047_++;
			}
			i_2040_ += i_2044_;
			i_2039_ = i_2132_;
			i_2047_ += i_2048_;
		    }
		} else if (i_2034_ == 0) {
		    int i_2140_ = i_2039_;
		    int i_2141_ = (i_2035_ & 0xff0000) >> 16;
		    int i_2142_ = (i_2035_ & 0xff00) >> 8;
		    int i_2143_ = i_2035_ & 0xff;
		    for (int i_2144_ = -i_2033_; i_2144_ < 0; i_2144_++) {
			int i_2145_
			    = ((i_2040_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2146_ = -i_2032_; i_2146_ < 0; i_2146_++) {
			    if (!bool_2029_ || f < fs[i_2047_]) {
				int i_2147_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_2039_ >> 16) + i_2145_]);
				if (i_2147_ != 0) {
				    if (bool) {
					int i_2148_
					    = ((i_2147_ & 0xff0000) * i_2141_
					       & ~0xffffff);
					int i_2149_
					    = ((i_2147_ & 0xff00) * i_2142_
					       & 0xff0000);
					int i_2150_
					    = ((i_2147_ & 0xff) * i_2143_
					       & 0xff00);
					i_2147_ = (i_2148_ | i_2149_
						   | i_2150_) >>> 8;
					int i_2151_ = is[i_2047_];
					int i_2152_ = i_2147_ + i_2151_;
					int i_2153_ = ((i_2147_ & 0xff00ff)
						       + (i_2151_ & 0xff00ff));
					i_2151_ = ((i_2153_ & 0x1000100)
						   + (i_2152_ - i_2153_
						      & 0x10000));
					is[i_2047_]
					    = (i_2152_ - i_2151_
					       | i_2151_ - (i_2151_ >>> 8));
				    }
				    if (bool_2029_ && bool_2038_)
					fs[i_2047_] = f;
				}
			    }
			    i_2039_ += i_2043_;
			    i_2047_++;
			}
			i_2040_ += i_2044_;
			i_2039_ = i_2140_;
			i_2047_ += i_2048_;
		    }
		} else if (i_2034_ == 3) {
		    int i_2154_ = i_2039_;
		    for (int i_2155_ = -i_2033_; i_2155_ < 0; i_2155_++) {
			int i_2156_
			    = ((i_2040_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2157_ = -i_2032_; i_2157_ < 0; i_2157_++) {
			    if (!bool_2029_ || f < fs[i_2047_]) {
				if (bool) {
				    int i_2158_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2039_ >> 16) + i_2156_]);
				    int i_2159_ = i_2158_ + i_2035_;
				    int i_2160_ = ((i_2158_ & 0xff00ff)
						   + (i_2035_ & 0xff00ff));
				    int i_2161_
					= ((i_2160_ & 0x1000100)
					   + (i_2159_ - i_2160_ & 0x10000));
				    i_2158_ = (i_2159_ - i_2161_
					       | i_2161_ - (i_2161_ >>> 8));
				    i_2161_ = is[i_2047_];
				    i_2159_ = i_2158_ + i_2161_;
				    i_2160_
					= (i_2158_ & 0xff00ff) + (i_2161_
								  & 0xff00ff);
				    i_2161_
					= ((i_2160_ & 0x1000100)
					   + (i_2159_ - i_2160_ & 0x10000));
				    is[i_2047_]
					= (i_2159_ - i_2161_
					   | i_2161_ - (i_2161_ >>> 8));
				}
				if (bool_2029_ && bool_2038_)
				    fs[i_2047_] = f;
			    }
			    i_2039_ += i_2043_;
			    i_2047_++;
			}
			i_2040_ += i_2044_;
			i_2039_ = i_2154_;
			i_2047_ += i_2048_;
		    }
		} else if (i_2034_ == 2) {
		    int i_2162_ = i_2035_ >>> 24;
		    int i_2163_ = 256 - i_2162_;
		    int i_2164_ = (i_2035_ & 0xff00ff) * i_2163_ & ~0xff00ff;
		    int i_2165_ = (i_2035_ & 0xff00) * i_2163_ & 0xff0000;
		    i_2035_ = (i_2164_ | i_2165_) >>> 8;
		    int i_2166_ = i_2039_;
		    for (int i_2167_ = -i_2033_; i_2167_ < 0; i_2167_++) {
			int i_2168_
			    = ((i_2040_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2169_ = -i_2032_; i_2169_ < 0; i_2169_++) {
			    if (!bool_2029_ || f < fs[i_2047_]) {
				int i_2170_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_2039_ >> 16) + i_2168_]);
				if (i_2170_ != 0) {
				    if (bool) {
					i_2164_
					    = ((i_2170_ & 0xff00ff) * i_2162_
					       & ~0xff00ff);
					i_2165_ = ((i_2170_ & 0xff00) * i_2162_
						   & 0xff0000);
					i_2170_ = (((i_2164_ | i_2165_) >>> 8)
						   + i_2035_);
					int i_2171_ = is[i_2047_];
					int i_2172_ = i_2170_ + i_2171_;
					int i_2173_ = ((i_2170_ & 0xff00ff)
						       + (i_2171_ & 0xff00ff));
					i_2171_ = ((i_2173_ & 0x1000100)
						   + (i_2172_ - i_2173_
						      & 0x10000));
					is[i_2047_]
					    = (i_2172_ - i_2171_
					       | i_2171_ - (i_2171_ >>> 8));
				    }
				    if (bool_2029_ && bool_2038_)
					fs[i_2047_] = f;
				}
			    }
			    i_2039_ += i_2043_;
			    i_2047_++;
			}
			i_2040_ += i_2044_;
			i_2039_ = i_2166_;
			i_2047_ += i_2048_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method16225(boolean bool, boolean bool_2174_, boolean bool_2175_,
		     int i, int i_2176_, float f, int i_2177_, int i_2178_,
		     int i_2179_, int i_2180_, int i_2181_, int i_2182_,
		     boolean bool_2183_) {
	if (i_2177_ > 0 && i_2178_ > 0 && (bool || bool_2174_)) {
	    int i_2184_ = 0;
	    int i_2185_ = 0;
	    int i_2186_ = (((Class168_Sub2_Sub1) this).anInt9907
			   + ((Class168_Sub2_Sub1) this).anInt9920
			   + ((Class168_Sub2_Sub1) this).anInt9909);
	    int i_2187_ = (((Class168_Sub2_Sub1) this).anInt9905
			   + ((Class168_Sub2_Sub1) this).anInt9916
			   + ((Class168_Sub2_Sub1) this).anInt9910);
	    int i_2188_ = (i_2186_ << 16) / i_2177_;
	    int i_2189_ = (i_2187_ << 16) / i_2178_;
	    if (((Class168_Sub2_Sub1) this).anInt9907 > 0) {
		int i_2190_ = (((((Class168_Sub2_Sub1) this).anInt9907 << 16)
				+ i_2188_ - 1)
			       / i_2188_);
		i += i_2190_;
		i_2184_ += (i_2190_ * i_2188_
			    - (((Class168_Sub2_Sub1) this).anInt9907 << 16));
	    }
	    if (((Class168_Sub2_Sub1) this).anInt9905 > 0) {
		int i_2191_ = (((((Class168_Sub2_Sub1) this).anInt9905 << 16)
				+ i_2189_ - 1)
			       / i_2189_);
		i_2176_ += i_2191_;
		i_2185_ += (i_2191_ * i_2189_
			    - (((Class168_Sub2_Sub1) this).anInt9905 << 16));
	    }
	    if (((Class168_Sub2_Sub1) this).anInt9920 < i_2186_)
		i_2177_ = ((((Class168_Sub2_Sub1) this).anInt9920 << 16)
			   - i_2184_ + i_2188_ - 1) / i_2188_;
	    if (((Class168_Sub2_Sub1) this).anInt9916 < i_2187_)
		i_2178_ = ((((Class168_Sub2_Sub1) this).anInt9916 << 16)
			   - i_2185_ + i_2189_ - 1) / i_2189_;
	    int i_2192_
		= i + i_2176_ * ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						    .aClass103_Sub2_9904))
				  .anInt9260)
				 * -1826993761);
	    int i_2193_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					      .aClass103_Sub2_9904)).anInt9260
			    * -1826993761)
			   - i_2177_);
	    if (i_2176_ + i_2178_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_2178_ -= (i_2176_ + i_2178_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i_2176_ < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_2194_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_2176_);
		i_2178_ -= i_2194_;
		i_2192_ += i_2194_ * (((Class103_Sub2)
				       (((Class168_Sub2_Sub1) this)
					.aClass103_Sub2_9904)).anInt9260
				      * -1826993761);
		i_2185_ += i_2189_ * i_2194_;
	    }
	    if (i + i_2177_ > (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_2195_ = (i + i_2177_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_2177_ -= i_2195_;
		i_2193_ += i_2195_;
	    }
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_2196_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_2177_ -= i_2196_;
		i_2192_ += i_2196_;
		i_2184_ += i_2188_ * i_2196_;
		i_2193_ += i_2196_;
	    }
	    float[] fs = (((Class103_Sub2)
			   ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			  .aFloatArray9248);
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (i_2181_ == 0) {
		if (i_2179_ == 1) {
		    int i_2197_ = i_2184_;
		    for (int i_2198_ = -i_2178_; i_2198_ < 0; i_2198_++) {
			int i_2199_
			    = ((i_2185_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2200_ = -i_2177_; i_2200_ < 0; i_2200_++) {
			    if (!bool_2174_ || f < fs[i_2192_]) {
				if (bool)
				    is[i_2192_]
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2184_ >> 16) + i_2199_]);
				if (bool_2174_ && bool_2183_)
				    fs[i_2192_] = f;
			    }
			    i_2184_ += i_2188_;
			    i_2192_++;
			}
			i_2185_ += i_2189_;
			i_2184_ = i_2197_;
			i_2192_ += i_2193_;
		    }
		} else if (i_2179_ == 0) {
		    int i_2201_ = (i_2180_ & 0xff0000) >> 16;
		    int i_2202_ = (i_2180_ & 0xff00) >> 8;
		    int i_2203_ = i_2180_ & 0xff;
		    int i_2204_ = i_2184_;
		    for (int i_2205_ = -i_2178_; i_2205_ < 0; i_2205_++) {
			int i_2206_
			    = ((i_2185_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2207_ = -i_2177_; i_2207_ < 0; i_2207_++) {
			    if (!bool_2174_ || f < fs[i_2192_]) {
				if (bool) {
				    int i_2208_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2184_ >> 16) + i_2206_]);
				    int i_2209_
					= ((i_2208_ & 0xff0000) * i_2201_
					   & ~0xffffff);
				    int i_2210_ = ((i_2208_ & 0xff00) * i_2202_
						   & 0xff0000);
				    int i_2211_
					= (i_2208_ & 0xff) * i_2203_ & 0xff00;
				    is[i_2192_]
					= (i_2209_ | i_2210_ | i_2211_) >>> 8;
				}
				if (bool_2174_ && bool_2183_)
				    fs[i_2192_] = f;
			    }
			    i_2184_ += i_2188_;
			    i_2192_++;
			}
			i_2185_ += i_2189_;
			i_2184_ = i_2204_;
			i_2192_ += i_2193_;
		    }
		} else if (i_2179_ == 3) {
		    int i_2212_ = i_2184_;
		    for (int i_2213_ = -i_2178_; i_2213_ < 0; i_2213_++) {
			int i_2214_
			    = ((i_2185_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2215_ = -i_2177_; i_2215_ < 0; i_2215_++) {
			    if (!bool_2174_ || f < fs[i_2192_]) {
				if (bool) {
				    int i_2216_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2184_ >> 16) + i_2214_]);
				    int i_2217_ = i_2216_ + i_2180_;
				    int i_2218_ = ((i_2216_ & 0xff00ff)
						   + (i_2180_ & 0xff00ff));
				    int i_2219_
					= ((i_2218_ & 0x1000100)
					   + (i_2217_ - i_2218_ & 0x10000));
				    is[i_2192_]
					= (i_2217_ - i_2219_
					   | i_2219_ - (i_2219_ >>> 8));
				}
				if (bool_2174_ && bool_2183_)
				    fs[i_2192_] = f;
			    }
			    i_2184_ += i_2188_;
			    i_2192_++;
			}
			i_2185_ += i_2189_;
			i_2184_ = i_2212_;
			i_2192_ += i_2193_;
		    }
		} else if (i_2179_ == 2) {
		    int i_2220_ = i_2180_ >>> 24;
		    int i_2221_ = 256 - i_2220_;
		    int i_2222_ = (i_2180_ & 0xff00ff) * i_2221_ & ~0xff00ff;
		    int i_2223_ = (i_2180_ & 0xff00) * i_2221_ & 0xff0000;
		    i_2180_ = (i_2222_ | i_2223_) >>> 8;
		    int i_2224_ = i_2184_;
		    for (int i_2225_ = -i_2178_; i_2225_ < 0; i_2225_++) {
			int i_2226_
			    = ((i_2185_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2227_ = -i_2177_; i_2227_ < 0; i_2227_++) {
			    if (!bool_2174_ || f < fs[i_2192_]) {
				if (bool) {
				    int i_2228_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2184_ >> 16) + i_2226_]);
				    i_2222_ = ((i_2228_ & 0xff00ff) * i_2220_
					       & ~0xff00ff);
				    i_2223_ = ((i_2228_ & 0xff00) * i_2220_
					       & 0xff0000);
				    is[i_2192_] = (((i_2222_ | i_2223_) >>> 8)
						   + i_2180_);
				}
				if (bool_2174_ && bool_2183_)
				    fs[i_2192_] = f;
			    }
			    i_2184_ += i_2188_;
			    i_2192_++;
			}
			i_2185_ += i_2189_;
			i_2184_ = i_2224_;
			i_2192_ += i_2193_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_2181_ == 1) {
		if (i_2179_ == 1) {
		    int i_2229_ = i_2184_;
		    for (int i_2230_ = -i_2178_; i_2230_ < 0; i_2230_++) {
			int i_2231_
			    = ((i_2185_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2232_ = -i_2177_; i_2232_ < 0; i_2232_++) {
			    if (!bool_2174_ || f < fs[i_2192_]) {
				int i_2233_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_2184_ >> 16) + i_2231_]);
				if (i_2233_ != 0) {
				    if (bool)
					is[i_2192_] = i_2233_;
				    if (bool_2174_ && bool_2183_)
					fs[i_2192_] = f;
				}
			    }
			    i_2184_ += i_2188_;
			    i_2192_++;
			}
			i_2185_ += i_2189_;
			i_2184_ = i_2229_;
			i_2192_ += i_2193_;
		    }
		} else if (i_2179_ == 0) {
		    int i_2234_ = i_2184_;
		    if ((i_2180_ & 0xffffff) == 16777215) {
			int i_2235_ = i_2180_ >>> 24;
			int i_2236_ = 256 - i_2235_;
			for (int i_2237_ = -i_2178_; i_2237_ < 0; i_2237_++) {
			    int i_2238_
				= ((i_2185_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_2239_ = -i_2177_; i_2239_ < 0;
				 i_2239_++) {
				if (!bool_2174_ || f < fs[i_2192_]) {
				    int i_2240_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2184_ >> 16) + i_2238_]);
				    if (i_2240_ != 0) {
					if (bool) {
					    int i_2241_ = is[i_2192_];
					    is[i_2192_]
						= (((((i_2240_ & 0xff00ff)
						      * i_2235_)
						     + ((i_2241_ & 0xff00ff)
							* i_2236_))
						    & ~0xff00ff)
						   + ((((i_2240_ & 0xff00)
							* i_2235_)
						       + ((i_2241_ & 0xff00)
							  * i_2236_))
						      & 0xff0000)) >> 8;
					}
					if (bool_2174_ && bool_2183_)
					    fs[i_2192_] = f;
				    }
				}
				i_2184_ += i_2188_;
				i_2192_++;
			    }
			    i_2185_ += i_2189_;
			    i_2184_ = i_2234_;
			    i_2192_ += i_2193_;
			}
		    } else {
			int i_2242_ = (i_2180_ & 0xff0000) >> 16;
			int i_2243_ = (i_2180_ & 0xff00) >> 8;
			int i_2244_ = i_2180_ & 0xff;
			int i_2245_ = i_2180_ >>> 24;
			int i_2246_ = 256 - i_2245_;
			for (int i_2247_ = -i_2178_; i_2247_ < 0; i_2247_++) {
			    int i_2248_
				= ((i_2185_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_2249_ = -i_2177_; i_2249_ < 0;
				 i_2249_++) {
				if (!bool_2174_ || f < fs[i_2192_]) {
				    int i_2250_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2184_ >> 16) + i_2248_]);
				    if (i_2250_ != 0) {
					if (i_2245_ != 255) {
					    if (bool) {
						int i_2251_
						    = (((i_2250_ & 0xff0000)
							* i_2242_)
						       & ~0xffffff);
						int i_2252_
						    = (((i_2250_ & 0xff00)
							* i_2243_)
						       & 0xff0000);
						int i_2253_
						    = (((i_2250_ & 0xff)
							* i_2244_)
						       & 0xff00);
						i_2250_ = (i_2251_ | i_2252_
							   | i_2253_) >>> 8;
						int i_2254_ = is[i_2192_];
						is[i_2192_]
						    = (((((i_2250_ & 0xff00ff)
							  * i_2245_)
							 + ((i_2254_
							     & 0xff00ff)
							    * i_2246_))
							& ~0xff00ff)
						       + ((((i_2250_ & 0xff00)
							    * i_2245_)
							   + ((i_2254_
							       & 0xff00)
							      * i_2246_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_2174_ && bool_2183_)
						fs[i_2192_] = f;
					} else {
					    if (bool) {
						int i_2255_
						    = (((i_2250_ & 0xff0000)
							* i_2242_)
						       & ~0xffffff);
						int i_2256_
						    = (((i_2250_ & 0xff00)
							* i_2243_)
						       & 0xff0000);
						int i_2257_
						    = (((i_2250_ & 0xff)
							* i_2244_)
						       & 0xff00);
						is[i_2192_]
						    = (i_2255_ | i_2256_
						       | i_2257_) >>> 8;
					    }
					    if (bool_2174_ && bool_2183_)
						fs[i_2192_] = f;
					}
				    }
				}
				i_2184_ += i_2188_;
				i_2192_++;
			    }
			    i_2185_ += i_2189_;
			    i_2184_ = i_2234_;
			    i_2192_ += i_2193_;
			}
		    }
		} else if (i_2179_ == 3) {
		    int i_2258_ = i_2184_;
		    int i_2259_ = i_2180_ >>> 24;
		    int i_2260_ = 256 - i_2259_;
		    for (int i_2261_ = -i_2178_; i_2261_ < 0; i_2261_++) {
			int i_2262_
			    = ((i_2185_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2263_ = -i_2177_; i_2263_ < 0; i_2263_++) {
			    if (!bool_2174_ || f < fs[i_2192_]) {
				if (bool) {
				    int i_2264_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2184_ >> 16) + i_2262_]);
				    int i_2265_ = i_2264_ + i_2180_;
				    int i_2266_ = ((i_2264_ & 0xff00ff)
						   + (i_2180_ & 0xff00ff));
				    int i_2267_
					= ((i_2266_ & 0x1000100)
					   + (i_2265_ - i_2266_ & 0x10000));
				    i_2267_ = (i_2265_ - i_2267_
					       | i_2267_ - (i_2267_ >>> 8));
				    if (i_2264_ == 0 && i_2259_ != 255) {
					i_2264_ = i_2267_;
					i_2267_ = is[i_2192_];
					i_2267_
					    = ((((i_2264_ & 0xff00ff) * i_2259_
						 + ((i_2267_ & 0xff00ff)
						    * i_2260_))
						& ~0xff00ff)
					       + (((i_2264_ & 0xff00) * i_2259_
						   + ((i_2267_ & 0xff00)
						      * i_2260_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_2192_] = i_2267_;
				}
				if (bool_2174_ && bool_2183_)
				    fs[i_2192_] = f;
			    }
			    i_2184_ += i_2188_;
			    i_2192_++;
			}
			i_2185_ += i_2189_;
			i_2184_ = i_2258_;
			i_2192_ += i_2193_;
		    }
		} else if (i_2179_ == 2) {
		    int i_2268_ = i_2180_ >>> 24;
		    int i_2269_ = 256 - i_2268_;
		    int i_2270_ = (i_2180_ & 0xff00ff) * i_2269_ & ~0xff00ff;
		    int i_2271_ = (i_2180_ & 0xff00) * i_2269_ & 0xff0000;
		    i_2180_ = (i_2270_ | i_2271_) >>> 8;
		    int i_2272_ = i_2184_;
		    for (int i_2273_ = -i_2178_; i_2273_ < 0; i_2273_++) {
			int i_2274_
			    = ((i_2185_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2275_ = -i_2177_; i_2275_ < 0; i_2275_++) {
			    if (!bool_2174_ || f < fs[i_2192_]) {
				int i_2276_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_2184_ >> 16) + i_2274_]);
				if (i_2276_ != 0) {
				    if (bool) {
					i_2270_
					    = ((i_2276_ & 0xff00ff) * i_2268_
					       & ~0xff00ff);
					i_2271_ = ((i_2276_ & 0xff00) * i_2268_
						   & 0xff0000);
					is[i_2192_] = ((i_2270_ | i_2271_)
						       >>> 8) + i_2180_;
				    }
				    if (bool_2174_ && bool_2183_)
					fs[i_2192_] = f;
				}
			    }
			    i_2184_ += i_2188_;
			    i_2192_++;
			}
			i_2185_ += i_2189_;
			i_2184_ = i_2272_;
			i_2192_ += i_2193_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_2181_ == 2) {
		if (i_2179_ == 1) {
		    int i_2277_ = i_2184_;
		    for (int i_2278_ = -i_2178_; i_2278_ < 0; i_2278_++) {
			int i_2279_
			    = ((i_2185_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2280_ = -i_2177_; i_2280_ < 0; i_2280_++) {
			    if (!bool_2174_ || f < fs[i_2192_]) {
				int i_2281_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_2184_ >> 16) + i_2279_]);
				if (i_2281_ != 0) {
				    if (bool) {
					int i_2282_ = is[i_2192_];
					int i_2283_ = i_2281_ + i_2282_;
					int i_2284_ = ((i_2281_ & 0xff00ff)
						       + (i_2282_ & 0xff00ff));
					i_2282_ = ((i_2284_ & 0x1000100)
						   + (i_2283_ - i_2284_
						      & 0x10000));
					is[i_2192_]
					    = (i_2283_ - i_2282_
					       | i_2282_ - (i_2282_ >>> 8));
				    }
				    if (bool_2174_ && bool_2183_)
					fs[i_2192_] = f;
				}
			    }
			    i_2184_ += i_2188_;
			    i_2192_++;
			}
			i_2185_ += i_2189_;
			i_2184_ = i_2277_;
			i_2192_ += i_2193_;
		    }
		} else if (i_2179_ == 0) {
		    int i_2285_ = i_2184_;
		    int i_2286_ = (i_2180_ & 0xff0000) >> 16;
		    int i_2287_ = (i_2180_ & 0xff00) >> 8;
		    int i_2288_ = i_2180_ & 0xff;
		    for (int i_2289_ = -i_2178_; i_2289_ < 0; i_2289_++) {
			int i_2290_
			    = ((i_2185_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2291_ = -i_2177_; i_2291_ < 0; i_2291_++) {
			    if (!bool_2174_ || f < fs[i_2192_]) {
				int i_2292_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_2184_ >> 16) + i_2290_]);
				if (i_2292_ != 0) {
				    if (bool) {
					int i_2293_
					    = ((i_2292_ & 0xff0000) * i_2286_
					       & ~0xffffff);
					int i_2294_
					    = ((i_2292_ & 0xff00) * i_2287_
					       & 0xff0000);
					int i_2295_
					    = ((i_2292_ & 0xff) * i_2288_
					       & 0xff00);
					i_2292_ = (i_2293_ | i_2294_
						   | i_2295_) >>> 8;
					int i_2296_ = is[i_2192_];
					int i_2297_ = i_2292_ + i_2296_;
					int i_2298_ = ((i_2292_ & 0xff00ff)
						       + (i_2296_ & 0xff00ff));
					i_2296_ = ((i_2298_ & 0x1000100)
						   + (i_2297_ - i_2298_
						      & 0x10000));
					is[i_2192_]
					    = (i_2297_ - i_2296_
					       | i_2296_ - (i_2296_ >>> 8));
				    }
				    if (bool_2174_ && bool_2183_)
					fs[i_2192_] = f;
				}
			    }
			    i_2184_ += i_2188_;
			    i_2192_++;
			}
			i_2185_ += i_2189_;
			i_2184_ = i_2285_;
			i_2192_ += i_2193_;
		    }
		} else if (i_2179_ == 3) {
		    int i_2299_ = i_2184_;
		    for (int i_2300_ = -i_2178_; i_2300_ < 0; i_2300_++) {
			int i_2301_
			    = ((i_2185_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2302_ = -i_2177_; i_2302_ < 0; i_2302_++) {
			    if (!bool_2174_ || f < fs[i_2192_]) {
				if (bool) {
				    int i_2303_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2184_ >> 16) + i_2301_]);
				    int i_2304_ = i_2303_ + i_2180_;
				    int i_2305_ = ((i_2303_ & 0xff00ff)
						   + (i_2180_ & 0xff00ff));
				    int i_2306_
					= ((i_2305_ & 0x1000100)
					   + (i_2304_ - i_2305_ & 0x10000));
				    i_2303_ = (i_2304_ - i_2306_
					       | i_2306_ - (i_2306_ >>> 8));
				    i_2306_ = is[i_2192_];
				    i_2304_ = i_2303_ + i_2306_;
				    i_2305_
					= (i_2303_ & 0xff00ff) + (i_2306_
								  & 0xff00ff);
				    i_2306_
					= ((i_2305_ & 0x1000100)
					   + (i_2304_ - i_2305_ & 0x10000));
				    is[i_2192_]
					= (i_2304_ - i_2306_
					   | i_2306_ - (i_2306_ >>> 8));
				}
				if (bool_2174_ && bool_2183_)
				    fs[i_2192_] = f;
			    }
			    i_2184_ += i_2188_;
			    i_2192_++;
			}
			i_2185_ += i_2189_;
			i_2184_ = i_2299_;
			i_2192_ += i_2193_;
		    }
		} else if (i_2179_ == 2) {
		    int i_2307_ = i_2180_ >>> 24;
		    int i_2308_ = 256 - i_2307_;
		    int i_2309_ = (i_2180_ & 0xff00ff) * i_2308_ & ~0xff00ff;
		    int i_2310_ = (i_2180_ & 0xff00) * i_2308_ & 0xff0000;
		    i_2180_ = (i_2309_ | i_2310_) >>> 8;
		    int i_2311_ = i_2184_;
		    for (int i_2312_ = -i_2178_; i_2312_ < 0; i_2312_++) {
			int i_2313_
			    = ((i_2185_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2314_ = -i_2177_; i_2314_ < 0; i_2314_++) {
			    if (!bool_2174_ || f < fs[i_2192_]) {
				int i_2315_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_2184_ >> 16) + i_2313_]);
				if (i_2315_ != 0) {
				    if (bool) {
					i_2309_
					    = ((i_2315_ & 0xff00ff) * i_2307_
					       & ~0xff00ff);
					i_2310_ = ((i_2315_ & 0xff00) * i_2307_
						   & 0xff0000);
					i_2315_ = (((i_2309_ | i_2310_) >>> 8)
						   + i_2180_);
					int i_2316_ = is[i_2192_];
					int i_2317_ = i_2315_ + i_2316_;
					int i_2318_ = ((i_2315_ & 0xff00ff)
						       + (i_2316_ & 0xff00ff));
					i_2316_ = ((i_2318_ & 0x1000100)
						   + (i_2317_ - i_2318_
						      & 0x10000));
					is[i_2192_]
					    = (i_2317_ - i_2316_
					       | i_2316_ - (i_2316_ >>> 8));
				    }
				    if (bool_2174_ && bool_2183_)
					fs[i_2192_] = f;
				}
			    }
			    i_2184_ += i_2188_;
			    i_2192_++;
			}
			i_2185_ += i_2189_;
			i_2184_ = i_2311_;
			i_2192_ += i_2193_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method16226(boolean bool, boolean bool_2319_, boolean bool_2320_,
		     int i, int i_2321_, float f, int i_2322_, int i_2323_,
		     int i_2324_, int i_2325_, int i_2326_, int i_2327_,
		     boolean bool_2328_) {
	if (i_2322_ > 0 && i_2323_ > 0 && (bool || bool_2319_)) {
	    int i_2329_ = 0;
	    int i_2330_ = 0;
	    int i_2331_ = (((Class168_Sub2_Sub1) this).anInt9907
			   + ((Class168_Sub2_Sub1) this).anInt9920
			   + ((Class168_Sub2_Sub1) this).anInt9909);
	    int i_2332_ = (((Class168_Sub2_Sub1) this).anInt9905
			   + ((Class168_Sub2_Sub1) this).anInt9916
			   + ((Class168_Sub2_Sub1) this).anInt9910);
	    int i_2333_ = (i_2331_ << 16) / i_2322_;
	    int i_2334_ = (i_2332_ << 16) / i_2323_;
	    if (((Class168_Sub2_Sub1) this).anInt9907 > 0) {
		int i_2335_ = (((((Class168_Sub2_Sub1) this).anInt9907 << 16)
				+ i_2333_ - 1)
			       / i_2333_);
		i += i_2335_;
		i_2329_ += (i_2335_ * i_2333_
			    - (((Class168_Sub2_Sub1) this).anInt9907 << 16));
	    }
	    if (((Class168_Sub2_Sub1) this).anInt9905 > 0) {
		int i_2336_ = (((((Class168_Sub2_Sub1) this).anInt9905 << 16)
				+ i_2334_ - 1)
			       / i_2334_);
		i_2321_ += i_2336_;
		i_2330_ += (i_2336_ * i_2334_
			    - (((Class168_Sub2_Sub1) this).anInt9905 << 16));
	    }
	    if (((Class168_Sub2_Sub1) this).anInt9920 < i_2331_)
		i_2322_ = ((((Class168_Sub2_Sub1) this).anInt9920 << 16)
			   - i_2329_ + i_2333_ - 1) / i_2333_;
	    if (((Class168_Sub2_Sub1) this).anInt9916 < i_2332_)
		i_2323_ = ((((Class168_Sub2_Sub1) this).anInt9916 << 16)
			   - i_2330_ + i_2334_ - 1) / i_2334_;
	    int i_2337_
		= i + i_2321_ * ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						    .aClass103_Sub2_9904))
				  .anInt9260)
				 * -1826993761);
	    int i_2338_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					      .aClass103_Sub2_9904)).anInt9260
			    * -1826993761)
			   - i_2322_);
	    if (i_2321_ + i_2323_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_2323_ -= (i_2321_ + i_2323_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i_2321_ < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_2339_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_2321_);
		i_2323_ -= i_2339_;
		i_2337_ += i_2339_ * (((Class103_Sub2)
				       (((Class168_Sub2_Sub1) this)
					.aClass103_Sub2_9904)).anInt9260
				      * -1826993761);
		i_2330_ += i_2334_ * i_2339_;
	    }
	    if (i + i_2322_ > (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_2340_ = (i + i_2322_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_2322_ -= i_2340_;
		i_2338_ += i_2340_;
	    }
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_2341_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_2322_ -= i_2341_;
		i_2337_ += i_2341_;
		i_2329_ += i_2333_ * i_2341_;
		i_2338_ += i_2341_;
	    }
	    float[] fs = (((Class103_Sub2)
			   ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			  .aFloatArray9248);
	    int[] is = (((Class103_Sub2)
			 ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
			.anIntArray9245);
	    if (i_2326_ == 0) {
		if (i_2324_ == 1) {
		    int i_2342_ = i_2329_;
		    for (int i_2343_ = -i_2323_; i_2343_ < 0; i_2343_++) {
			int i_2344_
			    = ((i_2330_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2345_ = -i_2322_; i_2345_ < 0; i_2345_++) {
			    if (!bool_2319_ || f < fs[i_2337_]) {
				if (bool)
				    is[i_2337_]
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2329_ >> 16) + i_2344_]);
				if (bool_2319_ && bool_2328_)
				    fs[i_2337_] = f;
			    }
			    i_2329_ += i_2333_;
			    i_2337_++;
			}
			i_2330_ += i_2334_;
			i_2329_ = i_2342_;
			i_2337_ += i_2338_;
		    }
		} else if (i_2324_ == 0) {
		    int i_2346_ = (i_2325_ & 0xff0000) >> 16;
		    int i_2347_ = (i_2325_ & 0xff00) >> 8;
		    int i_2348_ = i_2325_ & 0xff;
		    int i_2349_ = i_2329_;
		    for (int i_2350_ = -i_2323_; i_2350_ < 0; i_2350_++) {
			int i_2351_
			    = ((i_2330_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2352_ = -i_2322_; i_2352_ < 0; i_2352_++) {
			    if (!bool_2319_ || f < fs[i_2337_]) {
				if (bool) {
				    int i_2353_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2329_ >> 16) + i_2351_]);
				    int i_2354_
					= ((i_2353_ & 0xff0000) * i_2346_
					   & ~0xffffff);
				    int i_2355_ = ((i_2353_ & 0xff00) * i_2347_
						   & 0xff0000);
				    int i_2356_
					= (i_2353_ & 0xff) * i_2348_ & 0xff00;
				    is[i_2337_]
					= (i_2354_ | i_2355_ | i_2356_) >>> 8;
				}
				if (bool_2319_ && bool_2328_)
				    fs[i_2337_] = f;
			    }
			    i_2329_ += i_2333_;
			    i_2337_++;
			}
			i_2330_ += i_2334_;
			i_2329_ = i_2349_;
			i_2337_ += i_2338_;
		    }
		} else if (i_2324_ == 3) {
		    int i_2357_ = i_2329_;
		    for (int i_2358_ = -i_2323_; i_2358_ < 0; i_2358_++) {
			int i_2359_
			    = ((i_2330_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2360_ = -i_2322_; i_2360_ < 0; i_2360_++) {
			    if (!bool_2319_ || f < fs[i_2337_]) {
				if (bool) {
				    int i_2361_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2329_ >> 16) + i_2359_]);
				    int i_2362_ = i_2361_ + i_2325_;
				    int i_2363_ = ((i_2361_ & 0xff00ff)
						   + (i_2325_ & 0xff00ff));
				    int i_2364_
					= ((i_2363_ & 0x1000100)
					   + (i_2362_ - i_2363_ & 0x10000));
				    is[i_2337_]
					= (i_2362_ - i_2364_
					   | i_2364_ - (i_2364_ >>> 8));
				}
				if (bool_2319_ && bool_2328_)
				    fs[i_2337_] = f;
			    }
			    i_2329_ += i_2333_;
			    i_2337_++;
			}
			i_2330_ += i_2334_;
			i_2329_ = i_2357_;
			i_2337_ += i_2338_;
		    }
		} else if (i_2324_ == 2) {
		    int i_2365_ = i_2325_ >>> 24;
		    int i_2366_ = 256 - i_2365_;
		    int i_2367_ = (i_2325_ & 0xff00ff) * i_2366_ & ~0xff00ff;
		    int i_2368_ = (i_2325_ & 0xff00) * i_2366_ & 0xff0000;
		    i_2325_ = (i_2367_ | i_2368_) >>> 8;
		    int i_2369_ = i_2329_;
		    for (int i_2370_ = -i_2323_; i_2370_ < 0; i_2370_++) {
			int i_2371_
			    = ((i_2330_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2372_ = -i_2322_; i_2372_ < 0; i_2372_++) {
			    if (!bool_2319_ || f < fs[i_2337_]) {
				if (bool) {
				    int i_2373_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2329_ >> 16) + i_2371_]);
				    i_2367_ = ((i_2373_ & 0xff00ff) * i_2365_
					       & ~0xff00ff);
				    i_2368_ = ((i_2373_ & 0xff00) * i_2365_
					       & 0xff0000);
				    is[i_2337_] = (((i_2367_ | i_2368_) >>> 8)
						   + i_2325_);
				}
				if (bool_2319_ && bool_2328_)
				    fs[i_2337_] = f;
			    }
			    i_2329_ += i_2333_;
			    i_2337_++;
			}
			i_2330_ += i_2334_;
			i_2329_ = i_2369_;
			i_2337_ += i_2338_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_2326_ == 1) {
		if (i_2324_ == 1) {
		    int i_2374_ = i_2329_;
		    for (int i_2375_ = -i_2323_; i_2375_ < 0; i_2375_++) {
			int i_2376_
			    = ((i_2330_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2377_ = -i_2322_; i_2377_ < 0; i_2377_++) {
			    if (!bool_2319_ || f < fs[i_2337_]) {
				int i_2378_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_2329_ >> 16) + i_2376_]);
				if (i_2378_ != 0) {
				    if (bool)
					is[i_2337_] = i_2378_;
				    if (bool_2319_ && bool_2328_)
					fs[i_2337_] = f;
				}
			    }
			    i_2329_ += i_2333_;
			    i_2337_++;
			}
			i_2330_ += i_2334_;
			i_2329_ = i_2374_;
			i_2337_ += i_2338_;
		    }
		} else if (i_2324_ == 0) {
		    int i_2379_ = i_2329_;
		    if ((i_2325_ & 0xffffff) == 16777215) {
			int i_2380_ = i_2325_ >>> 24;
			int i_2381_ = 256 - i_2380_;
			for (int i_2382_ = -i_2323_; i_2382_ < 0; i_2382_++) {
			    int i_2383_
				= ((i_2330_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_2384_ = -i_2322_; i_2384_ < 0;
				 i_2384_++) {
				if (!bool_2319_ || f < fs[i_2337_]) {
				    int i_2385_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2329_ >> 16) + i_2383_]);
				    if (i_2385_ != 0) {
					if (bool) {
					    int i_2386_ = is[i_2337_];
					    is[i_2337_]
						= (((((i_2385_ & 0xff00ff)
						      * i_2380_)
						     + ((i_2386_ & 0xff00ff)
							* i_2381_))
						    & ~0xff00ff)
						   + ((((i_2385_ & 0xff00)
							* i_2380_)
						       + ((i_2386_ & 0xff00)
							  * i_2381_))
						      & 0xff0000)) >> 8;
					}
					if (bool_2319_ && bool_2328_)
					    fs[i_2337_] = f;
				    }
				}
				i_2329_ += i_2333_;
				i_2337_++;
			    }
			    i_2330_ += i_2334_;
			    i_2329_ = i_2379_;
			    i_2337_ += i_2338_;
			}
		    } else {
			int i_2387_ = (i_2325_ & 0xff0000) >> 16;
			int i_2388_ = (i_2325_ & 0xff00) >> 8;
			int i_2389_ = i_2325_ & 0xff;
			int i_2390_ = i_2325_ >>> 24;
			int i_2391_ = 256 - i_2390_;
			for (int i_2392_ = -i_2323_; i_2392_ < 0; i_2392_++) {
			    int i_2393_
				= ((i_2330_ >> 16)
				   * ((Class168_Sub2_Sub1) this).anInt9920);
			    for (int i_2394_ = -i_2322_; i_2394_ < 0;
				 i_2394_++) {
				if (!bool_2319_ || f < fs[i_2337_]) {
				    int i_2395_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2329_ >> 16) + i_2393_]);
				    if (i_2395_ != 0) {
					if (i_2390_ != 255) {
					    if (bool) {
						int i_2396_
						    = (((i_2395_ & 0xff0000)
							* i_2387_)
						       & ~0xffffff);
						int i_2397_
						    = (((i_2395_ & 0xff00)
							* i_2388_)
						       & 0xff0000);
						int i_2398_
						    = (((i_2395_ & 0xff)
							* i_2389_)
						       & 0xff00);
						i_2395_ = (i_2396_ | i_2397_
							   | i_2398_) >>> 8;
						int i_2399_ = is[i_2337_];
						is[i_2337_]
						    = (((((i_2395_ & 0xff00ff)
							  * i_2390_)
							 + ((i_2399_
							     & 0xff00ff)
							    * i_2391_))
							& ~0xff00ff)
						       + ((((i_2395_ & 0xff00)
							    * i_2390_)
							   + ((i_2399_
							       & 0xff00)
							      * i_2391_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_2319_ && bool_2328_)
						fs[i_2337_] = f;
					} else {
					    if (bool) {
						int i_2400_
						    = (((i_2395_ & 0xff0000)
							* i_2387_)
						       & ~0xffffff);
						int i_2401_
						    = (((i_2395_ & 0xff00)
							* i_2388_)
						       & 0xff0000);
						int i_2402_
						    = (((i_2395_ & 0xff)
							* i_2389_)
						       & 0xff00);
						is[i_2337_]
						    = (i_2400_ | i_2401_
						       | i_2402_) >>> 8;
					    }
					    if (bool_2319_ && bool_2328_)
						fs[i_2337_] = f;
					}
				    }
				}
				i_2329_ += i_2333_;
				i_2337_++;
			    }
			    i_2330_ += i_2334_;
			    i_2329_ = i_2379_;
			    i_2337_ += i_2338_;
			}
		    }
		} else if (i_2324_ == 3) {
		    int i_2403_ = i_2329_;
		    int i_2404_ = i_2325_ >>> 24;
		    int i_2405_ = 256 - i_2404_;
		    for (int i_2406_ = -i_2323_; i_2406_ < 0; i_2406_++) {
			int i_2407_
			    = ((i_2330_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2408_ = -i_2322_; i_2408_ < 0; i_2408_++) {
			    if (!bool_2319_ || f < fs[i_2337_]) {
				if (bool) {
				    int i_2409_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2329_ >> 16) + i_2407_]);
				    int i_2410_ = i_2409_ + i_2325_;
				    int i_2411_ = ((i_2409_ & 0xff00ff)
						   + (i_2325_ & 0xff00ff));
				    int i_2412_
					= ((i_2411_ & 0x1000100)
					   + (i_2410_ - i_2411_ & 0x10000));
				    i_2412_ = (i_2410_ - i_2412_
					       | i_2412_ - (i_2412_ >>> 8));
				    if (i_2409_ == 0 && i_2404_ != 255) {
					i_2409_ = i_2412_;
					i_2412_ = is[i_2337_];
					i_2412_
					    = ((((i_2409_ & 0xff00ff) * i_2404_
						 + ((i_2412_ & 0xff00ff)
						    * i_2405_))
						& ~0xff00ff)
					       + (((i_2409_ & 0xff00) * i_2404_
						   + ((i_2412_ & 0xff00)
						      * i_2405_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_2337_] = i_2412_;
				}
				if (bool_2319_ && bool_2328_)
				    fs[i_2337_] = f;
			    }
			    i_2329_ += i_2333_;
			    i_2337_++;
			}
			i_2330_ += i_2334_;
			i_2329_ = i_2403_;
			i_2337_ += i_2338_;
		    }
		} else if (i_2324_ == 2) {
		    int i_2413_ = i_2325_ >>> 24;
		    int i_2414_ = 256 - i_2413_;
		    int i_2415_ = (i_2325_ & 0xff00ff) * i_2414_ & ~0xff00ff;
		    int i_2416_ = (i_2325_ & 0xff00) * i_2414_ & 0xff0000;
		    i_2325_ = (i_2415_ | i_2416_) >>> 8;
		    int i_2417_ = i_2329_;
		    for (int i_2418_ = -i_2323_; i_2418_ < 0; i_2418_++) {
			int i_2419_
			    = ((i_2330_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2420_ = -i_2322_; i_2420_ < 0; i_2420_++) {
			    if (!bool_2319_ || f < fs[i_2337_]) {
				int i_2421_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_2329_ >> 16) + i_2419_]);
				if (i_2421_ != 0) {
				    if (bool) {
					i_2415_
					    = ((i_2421_ & 0xff00ff) * i_2413_
					       & ~0xff00ff);
					i_2416_ = ((i_2421_ & 0xff00) * i_2413_
						   & 0xff0000);
					is[i_2337_] = ((i_2415_ | i_2416_)
						       >>> 8) + i_2325_;
				    }
				    if (bool_2319_ && bool_2328_)
					fs[i_2337_] = f;
				}
			    }
			    i_2329_ += i_2333_;
			    i_2337_++;
			}
			i_2330_ += i_2334_;
			i_2329_ = i_2417_;
			i_2337_ += i_2338_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_2326_ == 2) {
		if (i_2324_ == 1) {
		    int i_2422_ = i_2329_;
		    for (int i_2423_ = -i_2323_; i_2423_ < 0; i_2423_++) {
			int i_2424_
			    = ((i_2330_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2425_ = -i_2322_; i_2425_ < 0; i_2425_++) {
			    if (!bool_2319_ || f < fs[i_2337_]) {
				int i_2426_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_2329_ >> 16) + i_2424_]);
				if (i_2426_ != 0) {
				    if (bool) {
					int i_2427_ = is[i_2337_];
					int i_2428_ = i_2426_ + i_2427_;
					int i_2429_ = ((i_2426_ & 0xff00ff)
						       + (i_2427_ & 0xff00ff));
					i_2427_ = ((i_2429_ & 0x1000100)
						   + (i_2428_ - i_2429_
						      & 0x10000));
					is[i_2337_]
					    = (i_2428_ - i_2427_
					       | i_2427_ - (i_2427_ >>> 8));
				    }
				    if (bool_2319_ && bool_2328_)
					fs[i_2337_] = f;
				}
			    }
			    i_2329_ += i_2333_;
			    i_2337_++;
			}
			i_2330_ += i_2334_;
			i_2329_ = i_2422_;
			i_2337_ += i_2338_;
		    }
		} else if (i_2324_ == 0) {
		    int i_2430_ = i_2329_;
		    int i_2431_ = (i_2325_ & 0xff0000) >> 16;
		    int i_2432_ = (i_2325_ & 0xff00) >> 8;
		    int i_2433_ = i_2325_ & 0xff;
		    for (int i_2434_ = -i_2323_; i_2434_ < 0; i_2434_++) {
			int i_2435_
			    = ((i_2330_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2436_ = -i_2322_; i_2436_ < 0; i_2436_++) {
			    if (!bool_2319_ || f < fs[i_2337_]) {
				int i_2437_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_2329_ >> 16) + i_2435_]);
				if (i_2437_ != 0) {
				    if (bool) {
					int i_2438_
					    = ((i_2437_ & 0xff0000) * i_2431_
					       & ~0xffffff);
					int i_2439_
					    = ((i_2437_ & 0xff00) * i_2432_
					       & 0xff0000);
					int i_2440_
					    = ((i_2437_ & 0xff) * i_2433_
					       & 0xff00);
					i_2437_ = (i_2438_ | i_2439_
						   | i_2440_) >>> 8;
					int i_2441_ = is[i_2337_];
					int i_2442_ = i_2437_ + i_2441_;
					int i_2443_ = ((i_2437_ & 0xff00ff)
						       + (i_2441_ & 0xff00ff));
					i_2441_ = ((i_2443_ & 0x1000100)
						   + (i_2442_ - i_2443_
						      & 0x10000));
					is[i_2337_]
					    = (i_2442_ - i_2441_
					       | i_2441_ - (i_2441_ >>> 8));
				    }
				    if (bool_2319_ && bool_2328_)
					fs[i_2337_] = f;
				}
			    }
			    i_2329_ += i_2333_;
			    i_2337_++;
			}
			i_2330_ += i_2334_;
			i_2329_ = i_2430_;
			i_2337_ += i_2338_;
		    }
		} else if (i_2324_ == 3) {
		    int i_2444_ = i_2329_;
		    for (int i_2445_ = -i_2323_; i_2445_ < 0; i_2445_++) {
			int i_2446_
			    = ((i_2330_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2447_ = -i_2322_; i_2447_ < 0; i_2447_++) {
			    if (!bool_2319_ || f < fs[i_2337_]) {
				if (bool) {
				    int i_2448_
					= (((Class168_Sub2_Sub1) this)
					   .anIntArray10708
					   [(i_2329_ >> 16) + i_2446_]);
				    int i_2449_ = i_2448_ + i_2325_;
				    int i_2450_ = ((i_2448_ & 0xff00ff)
						   + (i_2325_ & 0xff00ff));
				    int i_2451_
					= ((i_2450_ & 0x1000100)
					   + (i_2449_ - i_2450_ & 0x10000));
				    i_2448_ = (i_2449_ - i_2451_
					       | i_2451_ - (i_2451_ >>> 8));
				    i_2451_ = is[i_2337_];
				    i_2449_ = i_2448_ + i_2451_;
				    i_2450_
					= (i_2448_ & 0xff00ff) + (i_2451_
								  & 0xff00ff);
				    i_2451_
					= ((i_2450_ & 0x1000100)
					   + (i_2449_ - i_2450_ & 0x10000));
				    is[i_2337_]
					= (i_2449_ - i_2451_
					   | i_2451_ - (i_2451_ >>> 8));
				}
				if (bool_2319_ && bool_2328_)
				    fs[i_2337_] = f;
			    }
			    i_2329_ += i_2333_;
			    i_2337_++;
			}
			i_2330_ += i_2334_;
			i_2329_ = i_2444_;
			i_2337_ += i_2338_;
		    }
		} else if (i_2324_ == 2) {
		    int i_2452_ = i_2325_ >>> 24;
		    int i_2453_ = 256 - i_2452_;
		    int i_2454_ = (i_2325_ & 0xff00ff) * i_2453_ & ~0xff00ff;
		    int i_2455_ = (i_2325_ & 0xff00) * i_2453_ & 0xff0000;
		    i_2325_ = (i_2454_ | i_2455_) >>> 8;
		    int i_2456_ = i_2329_;
		    for (int i_2457_ = -i_2323_; i_2457_ < 0; i_2457_++) {
			int i_2458_
			    = ((i_2330_ >> 16)
			       * ((Class168_Sub2_Sub1) this).anInt9920);
			for (int i_2459_ = -i_2322_; i_2459_ < 0; i_2459_++) {
			    if (!bool_2319_ || f < fs[i_2337_]) {
				int i_2460_ = (((Class168_Sub2_Sub1) this)
					       .anIntArray10708
					       [(i_2329_ >> 16) + i_2458_]);
				if (i_2460_ != 0) {
				    if (bool) {
					i_2454_
					    = ((i_2460_ & 0xff00ff) * i_2452_
					       & ~0xff00ff);
					i_2455_ = ((i_2460_ & 0xff00) * i_2452_
						   & 0xff0000);
					i_2460_ = (((i_2454_ | i_2455_) >>> 8)
						   + i_2325_);
					int i_2461_ = is[i_2337_];
					int i_2462_ = i_2460_ + i_2461_;
					int i_2463_ = ((i_2460_ & 0xff00ff)
						       + (i_2461_ & 0xff00ff));
					i_2461_ = ((i_2463_ & 0x1000100)
						   + (i_2462_ - i_2463_
						      & 0x10000));
					is[i_2337_]
					    = (i_2462_ - i_2461_
					       | i_2461_ - (i_2461_ >>> 8));
				    }
				    if (bool_2319_ && bool_2328_)
					fs[i_2337_] = f;
				}
			    }
			    i_2329_ += i_2333_;
			    i_2337_++;
			}
			i_2330_ += i_2334_;
			i_2329_ = i_2456_;
			i_2337_ += i_2338_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method3607(int i, int i_2464_, Class135 class135, int i_2465_,
			   int i_2466_) {
	if (((Class168_Sub2_Sub1) this).aClass103_Sub2_9904.method15403())
	    throw new IllegalStateException();
	int[] is = (((Class103_Sub2)
		     ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904)
		    .anIntArray9245);
	if (is != null) {
	    i += ((Class168_Sub2_Sub1) this).anInt9907;
	    i_2464_ += ((Class168_Sub2_Sub1) this).anInt9905;
	    int i_2467_ = 0;
	    int i_2468_ = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					     .aClass103_Sub2_9904)).anInt9260
			   * -1826993761);
	    int i_2469_ = ((Class168_Sub2_Sub1) this).anInt9920;
	    int i_2470_ = ((Class168_Sub2_Sub1) this).anInt9916;
	    int i_2471_ = i_2468_ - i_2469_;
	    int i_2472_ = 0;
	    int i_2473_ = i + i_2464_ * i_2468_;
	    if (i_2464_ < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385)) {
		int i_2474_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						  .aClass103_Sub2_9904))
				.anInt9254) * -788450385
			       - i_2464_);
		i_2470_ -= i_2474_;
		i_2464_ = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
					     .aClass103_Sub2_9904)).anInt9254
			   * -788450385);
		i_2467_ += i_2474_ * i_2469_;
		i_2473_ += i_2474_ * i_2468_;
	    }
	    if (i_2464_ + i_2470_
		> (((Class103_Sub2)
		    ((Class168_Sub2_Sub1) this).aClass103_Sub2_9904).anInt9252
		   * 1546170165))
		i_2470_ -= (i_2464_ + i_2470_
			    - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9252) * 1546170165);
	    if (i < (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001)) {
		int i_2475_ = ((((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						  .aClass103_Sub2_9904))
				.anInt9249) * 1298750001
			       - i);
		i_2469_ -= i_2475_;
		i = (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
				       .aClass103_Sub2_9904)).anInt9249
		     * 1298750001);
		i_2467_ += i_2475_;
		i_2473_ += i_2475_;
		i_2472_ += i_2475_;
		i_2471_ += i_2475_;
	    }
	    if (i + i_2469_ > (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						 .aClass103_Sub2_9904))
			       .anInt9250) * 325436811) {
		int i_2476_ = (i + i_2469_
			       - (((Class103_Sub2) (((Class168_Sub2_Sub1) this)
						    .aClass103_Sub2_9904))
				  .anInt9250) * 325436811);
		i_2469_ -= i_2476_;
		i_2472_ += i_2476_;
		i_2471_ += i_2476_;
	    }
	    if (i_2469_ > 0 && i_2470_ > 0) {
		Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
		int[] is_2477_
		    = ((Class135_Sub1) class135_sub1).anIntArray9874;
		int[] is_2478_
		    = ((Class135_Sub1) class135_sub1).anIntArray9873;
		int i_2479_ = i_2464_;
		if (i_2466_ > i_2479_) {
		    i_2479_ = i_2466_;
		    i_2473_ += (i_2466_ - i_2464_) * i_2468_;
		    i_2467_ += ((i_2466_ - i_2464_)
				* ((Class168_Sub2_Sub1) this).anInt9920);
		}
		int i_2480_
		    = (i_2466_ + is_2477_.length < i_2464_ + i_2470_
		       ? i_2466_ + is_2477_.length : i_2464_ + i_2470_);
		for (int i_2481_ = i_2479_; i_2481_ < i_2480_; i_2481_++) {
		    int i_2482_ = is_2477_[i_2481_ - i_2466_] + i_2465_;
		    int i_2483_ = is_2478_[i_2481_ - i_2466_];
		    int i_2484_ = i_2469_;
		    if (i > i_2482_) {
			int i_2485_ = i - i_2482_;
			if (i_2485_ >= i_2483_) {
			    i_2467_ += i_2469_ + i_2472_;
			    i_2473_ += i_2469_ + i_2471_;
			    continue;
			}
			i_2483_ -= i_2485_;
		    } else {
			int i_2486_ = i_2482_ - i;
			if (i_2486_ >= i_2469_) {
			    i_2467_ += i_2469_ + i_2472_;
			    i_2473_ += i_2469_ + i_2471_;
			    continue;
			}
			i_2467_ += i_2486_;
			i_2484_ -= i_2486_;
			i_2473_ += i_2486_;
		    }
		    int i_2487_ = 0;
		    if (i_2484_ < i_2483_)
			i_2483_ = i_2484_;
		    else
			i_2487_ = i_2484_ - i_2483_;
		    for (int i_2488_ = -i_2483_; i_2488_ < 0; i_2488_++) {
			int i_2489_ = (((Class168_Sub2_Sub1) this)
				       .anIntArray10708[i_2467_++]);
			if (i_2489_ != 0)
			    is[i_2473_++] = i_2489_;
			else
			    i_2473_++;
		    }
		    i_2467_ += i_2487_ + i_2472_;
		    i_2473_ += i_2487_ + i_2471_;
		}
	    }
	}
    }
}
