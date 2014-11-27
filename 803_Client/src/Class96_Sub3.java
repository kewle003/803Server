/* Class96_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub3 extends Class96
{
    int[] anIntArray9296;
    byte[][] aByteArrayArray9297;
    int[] anIntArray9298;
    Class103_Sub2 aClass103_Sub2_9299;
    int[] anIntArray9300;
    int[] anIntArray9301;
    
    void method15445(byte[] is, int[] is_0_, int i, int i_1_, int i_2_,
		     int i_3_, int i_4_, int i_5_, int i_6_) {
	int i_7_ = i >>> 24;
	int i_8_ = 255 - i_7_;
	for (int i_9_ = -i_4_; i_9_ < 0; i_9_++) {
	    for (int i_10_ = -i_3_; i_10_ < 0; i_10_++) {
		if (is[i_1_++] != 0) {
		    int i_11_ = ((((i & 0xff00ff) * i_7_ & ~0xff00ff)
				  + (i_7_ * (i & 0xff00) & 0xff0000))
				 >> 8);
		    int i_12_ = is_0_[i_2_];
		    is_0_[i_2_++]
			= i_11_ + (((i_8_ * (i_12_ & 0xff00) & 0xff0000)
				    + ((i_12_ & 0xff00ff) * i_8_ & ~0xff00ff))
				   >> 8);
		} else
		    i_2_++;
	    }
	    i_2_ += i_5_;
	    i_1_ += i_6_;
	}
    }
    
    Class96_Sub3(Class103_Sub2 class103_sub2, Class639 class639,
		 Class108_Sub1[] class108_sub1s, int[] is, int[] is_13_) {
	super(class103_sub2, class639);
	((Class96_Sub3) this).aClass103_Sub2_9299 = class103_sub2;
	((Class96_Sub3) this).anIntArray9298 = is;
	((Class96_Sub3) this).anIntArray9301 = is_13_;
	((Class96_Sub3) this).aByteArrayArray9297
	    = new byte[class108_sub1s.length][];
	((Class96_Sub3) this).anIntArray9300 = new int[class108_sub1s.length];
	((Class96_Sub3) this).anIntArray9296 = new int[class108_sub1s.length];
	for (int i = 0; i < class108_sub1s.length; i++) {
	    int[] is_14_ = class108_sub1s[i].method2707(false);
	    byte[] is_15_ = (((Class96_Sub3) this).aByteArrayArray9297[i]
			     = new byte[is_14_.length]);
	    for (int i_16_ = 0; i_16_ < is_14_.length; i_16_++) {
		int i_17_ = is_14_[i_16_];
		byte i_18_
		    = (byte) ((3 * (i_17_ >> 16 & 0xff)
			       + 4 * (i_17_ >> 8 & 0xff) + (i_17_ & 0xff))
			      >> 3);
		is_15_[i_16_] = i_18_;
	    }
	    ((Class96_Sub3) this).anIntArray9300[i]
		= class108_sub1s[i].method2697();
	    ((Class96_Sub3) this).anIntArray9296[i]
		= class108_sub1s[i].method2695();
	}
    }
    
    void method2126(char c, int i, int i_19_, int i_20_, boolean bool) {
	if ((((Class103_Sub2) ((Class96_Sub3) this).aClass103_Sub2_9299)
	     .anIntArray9245)
	    != null) {
	    i += ((Class96_Sub3) this).anIntArray9296[c];
	    i_19_ += ((Class96_Sub3) this).anIntArray9300[c];
	    int i_21_ = ((Class96_Sub3) this).anIntArray9298[c];
	    int i_22_ = ((Class96_Sub3) this).anIntArray9301[c];
	    int i_23_ = (-1826993761
			 * ((Class103_Sub2) (((Class96_Sub3) this)
					     .aClass103_Sub2_9299)).anInt9260);
	    int i_24_ = i_23_ * i_19_ + i;
	    int i_25_ = i_23_ - i_21_;
	    int i_26_ = 0;
	    int i_27_ = 0;
	    if (i_19_ < -788450385 * (((Class103_Sub2) (((Class96_Sub3) this)
							.aClass103_Sub2_9299))
				      .anInt9254)) {
		int i_28_
		    = (-788450385 * (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anInt9254)
		       - i_19_);
		i_22_ -= i_28_;
		i_19_ = (((Class103_Sub2)
			  ((Class96_Sub3) this).aClass103_Sub2_9299).anInt9254
			 * -788450385);
		i_27_ += i_28_ * i_21_;
		i_24_ += i_23_ * i_28_;
	    }
	    if (i_22_ + i_19_
		> 1546170165 * (((Class103_Sub2)
				 ((Class96_Sub3) this).aClass103_Sub2_9299)
				.anInt9252))
		i_22_ -= (i_19_ + i_22_
			  - (((Class103_Sub2) (((Class96_Sub3) this)
					       .aClass103_Sub2_9299)).anInt9252
			     * 1546170165));
	    if (i < 1298750001 * (((Class103_Sub2)
				   ((Class96_Sub3) this).aClass103_Sub2_9299)
				  .anInt9249)) {
		int i_29_
		    = (1298750001 * (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anInt9249)
		       - i);
		i_21_ -= i_29_;
		i = 1298750001 * (((Class103_Sub2)
				   ((Class96_Sub3) this).aClass103_Sub2_9299)
				  .anInt9249);
		i_27_ += i_29_;
		i_24_ += i_29_;
		i_26_ += i_29_;
		i_25_ += i_29_;
	    }
	    if (i_21_ + i
		> (((Class103_Sub2) ((Class96_Sub3) this).aClass103_Sub2_9299)
		   .anInt9250) * 325436811) {
		int i_30_
		    = (i + i_21_
		       - 325436811 * (((Class103_Sub2) (((Class96_Sub3) this)
							.aClass103_Sub2_9299))
				      .anInt9250));
		i_21_ -= i_30_;
		i_26_ += i_30_;
		i_25_ += i_30_;
	    }
	    if (i_21_ > 0 && i_22_ > 0) {
		if (-16777216 == (i_20_ & ~0xffffff))
		    method15446(((Class96_Sub3) this).aByteArrayArray9297[c],
				(((Class103_Sub2)
				  ((Class96_Sub3) this).aClass103_Sub2_9299)
				 .anIntArray9245),
				i_20_, i_27_, i_24_, i_21_, i_22_, i_25_,
				i_26_);
		else if (0 != (i_20_ & ~0xffffff))
		    method15445(((Class96_Sub3) this).aByteArrayArray9297[c],
				(((Class103_Sub2)
				  ((Class96_Sub3) this).aClass103_Sub2_9299)
				 .anIntArray9245),
				i_20_, i_27_, i_24_, i_21_, i_22_, i_25_,
				i_26_);
	    }
	}
    }
    
    void method15446(byte[] is, int[] is_31_, int i, int i_32_, int i_33_,
		     int i_34_, int i_35_, int i_36_, int i_37_) {
	int i_38_ = -(i_34_ >> 2);
	i_34_ = -(i_34_ & 0x3);
	for (int i_39_ = -i_35_; i_39_ < 0; i_39_++) {
	    for (int i_40_ = i_38_; i_40_ < 0; i_40_++) {
		if (is[i_32_++] != 0)
		    is_31_[i_33_++] = i;
		else
		    i_33_++;
		if (is[i_32_++] != 0)
		    is_31_[i_33_++] = i;
		else
		    i_33_++;
		if (is[i_32_++] != 0)
		    is_31_[i_33_++] = i;
		else
		    i_33_++;
		if (is[i_32_++] != 0)
		    is_31_[i_33_++] = i;
		else
		    i_33_++;
	    }
	    for (int i_41_ = i_34_; i_41_ < 0; i_41_++) {
		if (is[i_32_++] != 0)
		    is_31_[i_33_++] = i;
		else
		    i_33_++;
	    }
	    i_33_ += i_36_;
	    i_32_ += i_37_;
	}
    }
    
    Class96_Sub3(Class103_Sub2 class103_sub2, Class639 class639,
		 Class108_Sub2[] class108_sub2s, int[] is, int[] is_42_) {
	super(class103_sub2, class639);
	((Class96_Sub3) this).aClass103_Sub2_9299 = class103_sub2;
	((Class96_Sub3) this).anIntArray9298 = is;
	((Class96_Sub3) this).anIntArray9301 = is_42_;
	((Class96_Sub3) this).aByteArrayArray9297
	    = new byte[class108_sub2s.length][];
	((Class96_Sub3) this).anIntArray9300 = new int[class108_sub2s.length];
	((Class96_Sub3) this).anIntArray9296 = new int[class108_sub2s.length];
	for (int i = 0; i < class108_sub2s.length; i++) {
	    ((Class96_Sub3) this).aByteArrayArray9297[i]
		= class108_sub2s[i].aByteArray9309;
	    ((Class96_Sub3) this).anIntArray9300[i]
		= class108_sub2s[i].anInt9306;
	    ((Class96_Sub3) this).anIntArray9296[i]
		= class108_sub2s[i].anInt9302;
	}
    }
    
    void method2140(char c, int i, int i_43_, int i_44_, boolean bool,
		    Class135 class135, int i_45_, int i_46_) {
	if (null
	    != (((Class103_Sub2) ((Class96_Sub3) this).aClass103_Sub2_9299)
		.anIntArray9245)) {
	    if (class135 == null)
		method2126(c, i, i_43_, i_44_, bool);
	    else {
		i += ((Class96_Sub3) this).anIntArray9296[c];
		i_43_ += ((Class96_Sub3) this).anIntArray9300[c];
		int i_47_ = ((Class96_Sub3) this).anIntArray9298[c];
		int i_48_ = ((Class96_Sub3) this).anIntArray9301[c];
		int i_49_
		    = (-1826993761
		       * ((Class103_Sub2) (((Class96_Sub3) this)
					   .aClass103_Sub2_9299)).anInt9260);
		int i_50_ = i + i_49_ * i_43_;
		int i_51_ = i_49_ - i_47_;
		int i_52_ = 0;
		int i_53_ = 0;
		if (i_43_
		    < -788450385 * (((Class103_Sub2)
				     ((Class96_Sub3) this).aClass103_Sub2_9299)
				    .anInt9254)) {
		    int i_54_
			= (-788450385 * ((Class103_Sub2)
					 (((Class96_Sub3) this)
					  .aClass103_Sub2_9299)).anInt9254
			   - i_43_);
		    i_48_ -= i_54_;
		    i_43_ = (((Class103_Sub2) (((Class96_Sub3) this)
					       .aClass103_Sub2_9299)).anInt9254
			     * -788450385);
		    i_53_ += i_54_ * i_47_;
		    i_50_ += i_49_ * i_54_;
		}
		if (i_43_ + i_48_ > (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anInt9252) * 1546170165)
		    i_48_
			-= (i_48_ + i_43_
			    - 1546170165 * ((Class103_Sub2)
					    (((Class96_Sub3) this)
					     .aClass103_Sub2_9299)).anInt9252);
		if (i < 1298750001 * (((Class103_Sub2) (((Class96_Sub3) this)
							.aClass103_Sub2_9299))
				      .anInt9249)) {
		    int i_55_
			= (1298750001 * ((Class103_Sub2)
					 (((Class96_Sub3) this)
					  .aClass103_Sub2_9299)).anInt9249
			   - i);
		    i_47_ -= i_55_;
		    i = (((Class103_Sub2)
			  ((Class96_Sub3) this).aClass103_Sub2_9299).anInt9249
			 * 1298750001);
		    i_53_ += i_55_;
		    i_50_ += i_55_;
		    i_52_ += i_55_;
		    i_51_ += i_55_;
		}
		if (i + i_47_
		    > 325436811 * (((Class103_Sub2)
				    ((Class96_Sub3) this).aClass103_Sub2_9299)
				   .anInt9250)) {
		    int i_56_
			= (i + i_47_
			   - 325436811 * ((Class103_Sub2)
					  (((Class96_Sub3) this)
					   .aClass103_Sub2_9299)).anInt9250);
		    i_47_ -= i_56_;
		    i_52_ += i_56_;
		    i_51_ += i_56_;
		}
		if (i_47_ > 0 && i_48_ > 0) {
		    if ((i_44_ & ~0xffffff) == -16777216)
			method15450((((Class96_Sub3) this).aByteArrayArray9297
				     [c]),
				    (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anIntArray9245),
				    i_44_, i_53_, i_50_, i_47_, i_48_, i_51_,
				    i_52_, i, i_43_,
				    ((Class96_Sub3) this).anIntArray9298[c],
				    class135, i_45_, i_46_);
		    else
			method15448((((Class96_Sub3) this).aByteArrayArray9297
				     [c]),
				    (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anIntArray9245),
				    i_44_, i_53_, i_50_, i_47_, i_48_, i_51_,
				    i_52_, i, i_43_,
				    ((Class96_Sub3) this).anIntArray9298[c],
				    class135, i_45_, i_46_);
		}
	    }
	}
    }
    
    void method15447(byte[] is, int[] is_57_, int i, int i_58_, int i_59_,
		     int i_60_, int i_61_, int i_62_, int i_63_) {
	int i_64_ = -(i_60_ >> 2);
	i_60_ = -(i_60_ & 0x3);
	for (int i_65_ = -i_61_; i_65_ < 0; i_65_++) {
	    for (int i_66_ = i_64_; i_66_ < 0; i_66_++) {
		if (is[i_58_++] != 0)
		    is_57_[i_59_++] = i;
		else
		    i_59_++;
		if (is[i_58_++] != 0)
		    is_57_[i_59_++] = i;
		else
		    i_59_++;
		if (is[i_58_++] != 0)
		    is_57_[i_59_++] = i;
		else
		    i_59_++;
		if (is[i_58_++] != 0)
		    is_57_[i_59_++] = i;
		else
		    i_59_++;
	    }
	    for (int i_67_ = i_60_; i_67_ < 0; i_67_++) {
		if (is[i_58_++] != 0)
		    is_57_[i_59_++] = i;
		else
		    i_59_++;
	    }
	    i_59_ += i_62_;
	    i_58_ += i_63_;
	}
    }
    
    void method15448(byte[] is, int[] is_68_, int i, int i_69_, int i_70_,
		     int i_71_, int i_72_, int i_73_, int i_74_, int i_75_,
		     int i_76_, int i_77_, Class135 class135, int i_78_,
		     int i_79_) {
	Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	int[] is_80_ = ((Class135_Sub1) class135_sub1).anIntArray9874;
	int[] is_81_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	int i_82_
	    = i_75_ - 1298750001 * (((Class103_Sub2)
				     ((Class96_Sub3) this).aClass103_Sub2_9299)
				    .anInt9249);
	int i_83_ = i_76_;
	if (i_79_ > i_83_) {
	    i_83_ = i_79_;
	    i_70_ += -1826993761 * (((Class103_Sub2)
				     ((Class96_Sub3) this).aClass103_Sub2_9299)
				    .anInt9260) * (i_79_ - i_76_);
	    i_69_ += i_77_ * (i_79_ - i_76_);
	}
	int i_84_ = (is_80_.length + i_79_ < i_72_ + i_76_
		     ? i_79_ + is_80_.length : i_72_ + i_76_);
	int i_85_ = i >>> 24;
	int i_86_ = 255 - i_85_;
	for (int i_87_ = i_83_; i_87_ < i_84_; i_87_++) {
	    int i_88_ = i_78_ + is_80_[i_87_ - i_79_];
	    int i_89_ = is_81_[i_87_ - i_79_];
	    int i_90_ = i_71_;
	    if (i_82_ > i_88_) {
		int i_91_ = i_82_ - i_88_;
		if (i_91_ >= i_89_) {
		    i_69_ += i_71_ + i_74_;
		    i_70_ += i_71_ + i_73_;
		    continue;
		}
		i_89_ -= i_91_;
	    } else {
		int i_92_ = i_88_ - i_82_;
		if (i_92_ >= i_71_) {
		    i_69_ += i_74_ + i_71_;
		    i_70_ += i_73_ + i_71_;
		    continue;
		}
		i_69_ += i_92_;
		i_90_ -= i_92_;
		i_70_ += i_92_;
	    }
	    int i_93_ = 0;
	    if (i_90_ < i_89_)
		i_89_ = i_90_;
	    else
		i_93_ = i_90_ - i_89_;
	    for (int i_94_ = -i_89_; i_94_ < 0; i_94_++) {
		if (is[i_69_++] != 0) {
		    int i_95_ = ((((i & 0xff00) * i_85_ & 0xff0000)
				  + (i_85_ * (i & 0xff00ff) & ~0xff00ff))
				 >> 8);
		    int i_96_ = is_68_[i_70_];
		    is_68_[i_70_++]
			= (((i_86_ * (i_96_ & 0xff00) & 0xff0000)
			    + (i_86_ * (i_96_ & 0xff00ff) & ~0xff00ff))
			   >> 8) + i_95_;
		} else
		    i_70_++;
	    }
	    i_69_ += i_93_ + i_74_;
	    i_70_ += i_73_ + i_93_;
	}
    }
    
    void method2129(char c, int i, int i_97_, int i_98_, boolean bool) {
	if ((((Class103_Sub2) ((Class96_Sub3) this).aClass103_Sub2_9299)
	     .anIntArray9245)
	    != null) {
	    i += ((Class96_Sub3) this).anIntArray9296[c];
	    i_97_ += ((Class96_Sub3) this).anIntArray9300[c];
	    int i_99_ = ((Class96_Sub3) this).anIntArray9298[c];
	    int i_100_ = ((Class96_Sub3) this).anIntArray9301[c];
	    int i_101_
		= (-1826993761
		   * ((Class103_Sub2)
		      ((Class96_Sub3) this).aClass103_Sub2_9299).anInt9260);
	    int i_102_ = i_101_ * i_97_ + i;
	    int i_103_ = i_101_ - i_99_;
	    int i_104_ = 0;
	    int i_105_ = 0;
	    if (i_97_ < -788450385 * (((Class103_Sub2) (((Class96_Sub3) this)
							.aClass103_Sub2_9299))
				      .anInt9254)) {
		int i_106_
		    = (-788450385 * (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anInt9254)
		       - i_97_);
		i_100_ -= i_106_;
		i_97_ = (((Class103_Sub2)
			  ((Class96_Sub3) this).aClass103_Sub2_9299).anInt9254
			 * -788450385);
		i_105_ += i_106_ * i_99_;
		i_102_ += i_101_ * i_106_;
	    }
	    if (i_100_ + i_97_
		> 1546170165 * (((Class103_Sub2)
				 ((Class96_Sub3) this).aClass103_Sub2_9299)
				.anInt9252))
		i_100_ -= (i_97_ + i_100_
			   - (((Class103_Sub2)
			       ((Class96_Sub3) this).aClass103_Sub2_9299)
			      .anInt9252) * 1546170165);
	    if (i < 1298750001 * (((Class103_Sub2)
				   ((Class96_Sub3) this).aClass103_Sub2_9299)
				  .anInt9249)) {
		int i_107_
		    = (1298750001 * (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anInt9249)
		       - i);
		i_99_ -= i_107_;
		i = 1298750001 * (((Class103_Sub2)
				   ((Class96_Sub3) this).aClass103_Sub2_9299)
				  .anInt9249);
		i_105_ += i_107_;
		i_102_ += i_107_;
		i_104_ += i_107_;
		i_103_ += i_107_;
	    }
	    if (i_99_ + i
		> (((Class103_Sub2) ((Class96_Sub3) this).aClass103_Sub2_9299)
		   .anInt9250) * 325436811) {
		int i_108_
		    = (i + i_99_
		       - 325436811 * (((Class103_Sub2) (((Class96_Sub3) this)
							.aClass103_Sub2_9299))
				      .anInt9250));
		i_99_ -= i_108_;
		i_104_ += i_108_;
		i_103_ += i_108_;
	    }
	    if (i_99_ > 0 && i_100_ > 0) {
		if (-16777216 == (i_98_ & ~0xffffff))
		    method15446(((Class96_Sub3) this).aByteArrayArray9297[c],
				(((Class103_Sub2)
				  ((Class96_Sub3) this).aClass103_Sub2_9299)
				 .anIntArray9245),
				i_98_, i_105_, i_102_, i_99_, i_100_, i_103_,
				i_104_);
		else if (0 != (i_98_ & ~0xffffff))
		    method15445(((Class96_Sub3) this).aByteArrayArray9297[c],
				(((Class103_Sub2)
				  ((Class96_Sub3) this).aClass103_Sub2_9299)
				 .anIntArray9245),
				i_98_, i_105_, i_102_, i_99_, i_100_, i_103_,
				i_104_);
	    }
	}
    }
    
    void method15449(byte[] is, int[] is_109_, int i, int i_110_, int i_111_,
		     int i_112_, int i_113_, int i_114_, int i_115_) {
	int i_116_ = -(i_112_ >> 2);
	i_112_ = -(i_112_ & 0x3);
	for (int i_117_ = -i_113_; i_117_ < 0; i_117_++) {
	    for (int i_118_ = i_116_; i_118_ < 0; i_118_++) {
		if (is[i_110_++] != 0)
		    is_109_[i_111_++] = i;
		else
		    i_111_++;
		if (is[i_110_++] != 0)
		    is_109_[i_111_++] = i;
		else
		    i_111_++;
		if (is[i_110_++] != 0)
		    is_109_[i_111_++] = i;
		else
		    i_111_++;
		if (is[i_110_++] != 0)
		    is_109_[i_111_++] = i;
		else
		    i_111_++;
	    }
	    for (int i_119_ = i_112_; i_119_ < 0; i_119_++) {
		if (is[i_110_++] != 0)
		    is_109_[i_111_++] = i;
		else
		    i_111_++;
	    }
	    i_111_ += i_114_;
	    i_110_ += i_115_;
	}
    }
    
    void method2153(char c, int i, int i_120_, int i_121_, boolean bool) {
	if ((((Class103_Sub2) ((Class96_Sub3) this).aClass103_Sub2_9299)
	     .anIntArray9245)
	    != null) {
	    i += ((Class96_Sub3) this).anIntArray9296[c];
	    i_120_ += ((Class96_Sub3) this).anIntArray9300[c];
	    int i_122_ = ((Class96_Sub3) this).anIntArray9298[c];
	    int i_123_ = ((Class96_Sub3) this).anIntArray9301[c];
	    int i_124_
		= (-1826993761
		   * ((Class103_Sub2)
		      ((Class96_Sub3) this).aClass103_Sub2_9299).anInt9260);
	    int i_125_ = i_124_ * i_120_ + i;
	    int i_126_ = i_124_ - i_122_;
	    int i_127_ = 0;
	    int i_128_ = 0;
	    if (i_120_ < -788450385 * (((Class103_Sub2) (((Class96_Sub3) this)
							 .aClass103_Sub2_9299))
				       .anInt9254)) {
		int i_129_
		    = (-788450385 * (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anInt9254)
		       - i_120_);
		i_123_ -= i_129_;
		i_120_ = (((Class103_Sub2)
			   ((Class96_Sub3) this).aClass103_Sub2_9299).anInt9254
			  * -788450385);
		i_128_ += i_129_ * i_122_;
		i_125_ += i_124_ * i_129_;
	    }
	    if (i_123_ + i_120_
		> 1546170165 * (((Class103_Sub2)
				 ((Class96_Sub3) this).aClass103_Sub2_9299)
				.anInt9252))
		i_123_ -= (i_120_ + i_123_
			   - (((Class103_Sub2)
			       ((Class96_Sub3) this).aClass103_Sub2_9299)
			      .anInt9252) * 1546170165);
	    if (i < 1298750001 * (((Class103_Sub2)
				   ((Class96_Sub3) this).aClass103_Sub2_9299)
				  .anInt9249)) {
		int i_130_
		    = (1298750001 * (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anInt9249)
		       - i);
		i_122_ -= i_130_;
		i = 1298750001 * (((Class103_Sub2)
				   ((Class96_Sub3) this).aClass103_Sub2_9299)
				  .anInt9249);
		i_128_ += i_130_;
		i_125_ += i_130_;
		i_127_ += i_130_;
		i_126_ += i_130_;
	    }
	    if (i_122_ + i
		> (((Class103_Sub2) ((Class96_Sub3) this).aClass103_Sub2_9299)
		   .anInt9250) * 325436811) {
		int i_131_
		    = (i + i_122_
		       - 325436811 * (((Class103_Sub2) (((Class96_Sub3) this)
							.aClass103_Sub2_9299))
				      .anInt9250));
		i_122_ -= i_131_;
		i_127_ += i_131_;
		i_126_ += i_131_;
	    }
	    if (i_122_ > 0 && i_123_ > 0) {
		if (-16777216 == (i_121_ & ~0xffffff))
		    method15446(((Class96_Sub3) this).aByteArrayArray9297[c],
				(((Class103_Sub2)
				  ((Class96_Sub3) this).aClass103_Sub2_9299)
				 .anIntArray9245),
				i_121_, i_128_, i_125_, i_122_, i_123_, i_126_,
				i_127_);
		else if (0 != (i_121_ & ~0xffffff))
		    method15445(((Class96_Sub3) this).aByteArrayArray9297[c],
				(((Class103_Sub2)
				  ((Class96_Sub3) this).aClass103_Sub2_9299)
				 .anIntArray9245),
				i_121_, i_128_, i_125_, i_122_, i_123_, i_126_,
				i_127_);
	    }
	}
    }
    
    void method2154(char c, int i, int i_132_, int i_133_, boolean bool) {
	if ((((Class103_Sub2) ((Class96_Sub3) this).aClass103_Sub2_9299)
	     .anIntArray9245)
	    != null) {
	    i += ((Class96_Sub3) this).anIntArray9296[c];
	    i_132_ += ((Class96_Sub3) this).anIntArray9300[c];
	    int i_134_ = ((Class96_Sub3) this).anIntArray9298[c];
	    int i_135_ = ((Class96_Sub3) this).anIntArray9301[c];
	    int i_136_
		= (-1826993761
		   * ((Class103_Sub2)
		      ((Class96_Sub3) this).aClass103_Sub2_9299).anInt9260);
	    int i_137_ = i_136_ * i_132_ + i;
	    int i_138_ = i_136_ - i_134_;
	    int i_139_ = 0;
	    int i_140_ = 0;
	    if (i_132_ < -788450385 * (((Class103_Sub2) (((Class96_Sub3) this)
							 .aClass103_Sub2_9299))
				       .anInt9254)) {
		int i_141_
		    = (-788450385 * (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anInt9254)
		       - i_132_);
		i_135_ -= i_141_;
		i_132_ = (((Class103_Sub2)
			   ((Class96_Sub3) this).aClass103_Sub2_9299).anInt9254
			  * -788450385);
		i_140_ += i_141_ * i_134_;
		i_137_ += i_136_ * i_141_;
	    }
	    if (i_135_ + i_132_
		> 1546170165 * (((Class103_Sub2)
				 ((Class96_Sub3) this).aClass103_Sub2_9299)
				.anInt9252))
		i_135_ -= (i_132_ + i_135_
			   - (((Class103_Sub2)
			       ((Class96_Sub3) this).aClass103_Sub2_9299)
			      .anInt9252) * 1546170165);
	    if (i < 1298750001 * (((Class103_Sub2)
				   ((Class96_Sub3) this).aClass103_Sub2_9299)
				  .anInt9249)) {
		int i_142_
		    = (1298750001 * (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anInt9249)
		       - i);
		i_134_ -= i_142_;
		i = 1298750001 * (((Class103_Sub2)
				   ((Class96_Sub3) this).aClass103_Sub2_9299)
				  .anInt9249);
		i_140_ += i_142_;
		i_137_ += i_142_;
		i_139_ += i_142_;
		i_138_ += i_142_;
	    }
	    if (i_134_ + i
		> (((Class103_Sub2) ((Class96_Sub3) this).aClass103_Sub2_9299)
		   .anInt9250) * 325436811) {
		int i_143_
		    = (i + i_134_
		       - 325436811 * (((Class103_Sub2) (((Class96_Sub3) this)
							.aClass103_Sub2_9299))
				      .anInt9250));
		i_134_ -= i_143_;
		i_139_ += i_143_;
		i_138_ += i_143_;
	    }
	    if (i_134_ > 0 && i_135_ > 0) {
		if (-16777216 == (i_133_ & ~0xffffff))
		    method15446(((Class96_Sub3) this).aByteArrayArray9297[c],
				(((Class103_Sub2)
				  ((Class96_Sub3) this).aClass103_Sub2_9299)
				 .anIntArray9245),
				i_133_, i_140_, i_137_, i_134_, i_135_, i_138_,
				i_139_);
		else if (0 != (i_133_ & ~0xffffff))
		    method15445(((Class96_Sub3) this).aByteArrayArray9297[c],
				(((Class103_Sub2)
				  ((Class96_Sub3) this).aClass103_Sub2_9299)
				 .anIntArray9245),
				i_133_, i_140_, i_137_, i_134_, i_135_, i_138_,
				i_139_);
	    }
	}
    }
    
    void method15450(byte[] is, int[] is_144_, int i, int i_145_, int i_146_,
		     int i_147_, int i_148_, int i_149_, int i_150_,
		     int i_151_, int i_152_, int i_153_, Class135 class135,
		     int i_154_, int i_155_) {
	Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	int[] is_156_ = ((Class135_Sub1) class135_sub1).anIntArray9874;
	int[] is_157_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	int i_158_ = i_152_;
	if (i_155_ > i_158_) {
	    i_158_ = i_155_;
	    i_146_
		+= ((i_155_ - i_152_)
		    * (-1826993761
		       * ((Class103_Sub2) (((Class96_Sub3) this)
					   .aClass103_Sub2_9299)).anInt9260));
	    i_145_ += i_153_ * (i_155_ - i_152_);
	}
	int i_159_ = (i_155_ + is_156_.length < i_148_ + i_152_
		      ? is_156_.length + i_155_ : i_148_ + i_152_);
	for (int i_160_ = i_158_; i_160_ < i_159_; i_160_++) {
	    int i_161_ = is_156_[i_160_ - i_155_] + i_154_;
	    int i_162_ = is_157_[i_160_ - i_155_];
	    int i_163_ = i_147_;
	    if (i_151_ > i_161_) {
		int i_164_ = i_151_ - i_161_;
		if (i_164_ >= i_162_) {
		    i_145_ += i_147_ + i_150_;
		    i_146_ += i_147_ + i_149_;
		    continue;
		}
		i_162_ -= i_164_;
	    } else {
		int i_165_ = i_161_ - i_151_;
		if (i_165_ >= i_147_) {
		    i_145_ += i_147_ + i_150_;
		    i_146_ += i_147_ + i_149_;
		    continue;
		}
		i_145_ += i_165_;
		i_163_ -= i_165_;
		i_146_ += i_165_;
	    }
	    int i_166_ = 0;
	    if (i_163_ < i_162_)
		i_162_ = i_163_;
	    else
		i_166_ = i_163_ - i_162_;
	    for (int i_167_ = 0; i_167_ < i_162_; i_167_++) {
		if (is[i_145_++] != 0)
		    is_144_[i_146_++] = i;
		else
		    i_146_++;
	    }
	    i_145_ += i_166_ + i_150_;
	    i_146_ += i_166_ + i_149_;
	}
    }
    
    void method2151(char c, int i, int i_168_, int i_169_, boolean bool,
		    Class135 class135, int i_170_, int i_171_) {
	if (null
	    != (((Class103_Sub2) ((Class96_Sub3) this).aClass103_Sub2_9299)
		.anIntArray9245)) {
	    if (class135 == null)
		method2126(c, i, i_168_, i_169_, bool);
	    else {
		i += ((Class96_Sub3) this).anIntArray9296[c];
		i_168_ += ((Class96_Sub3) this).anIntArray9300[c];
		int i_172_ = ((Class96_Sub3) this).anIntArray9298[c];
		int i_173_ = ((Class96_Sub3) this).anIntArray9301[c];
		int i_174_
		    = (-1826993761
		       * ((Class103_Sub2) (((Class96_Sub3) this)
					   .aClass103_Sub2_9299)).anInt9260);
		int i_175_ = i + i_174_ * i_168_;
		int i_176_ = i_174_ - i_172_;
		int i_177_ = 0;
		int i_178_ = 0;
		if (i_168_
		    < -788450385 * (((Class103_Sub2)
				     ((Class96_Sub3) this).aClass103_Sub2_9299)
				    .anInt9254)) {
		    int i_179_
			= (-788450385 * ((Class103_Sub2)
					 (((Class96_Sub3) this)
					  .aClass103_Sub2_9299)).anInt9254
			   - i_168_);
		    i_173_ -= i_179_;
		    i_168_ = (((Class103_Sub2)
			       ((Class96_Sub3) this).aClass103_Sub2_9299)
			      .anInt9254) * -788450385;
		    i_178_ += i_179_ * i_172_;
		    i_175_ += i_174_ * i_179_;
		}
		if (i_168_ + i_173_ > (((Class103_Sub2) (((Class96_Sub3) this)
							 .aClass103_Sub2_9299))
				       .anInt9252) * 1546170165)
		    i_173_
			-= (i_173_ + i_168_
			    - 1546170165 * ((Class103_Sub2)
					    (((Class96_Sub3) this)
					     .aClass103_Sub2_9299)).anInt9252);
		if (i < 1298750001 * (((Class103_Sub2) (((Class96_Sub3) this)
							.aClass103_Sub2_9299))
				      .anInt9249)) {
		    int i_180_
			= (1298750001 * ((Class103_Sub2)
					 (((Class96_Sub3) this)
					  .aClass103_Sub2_9299)).anInt9249
			   - i);
		    i_172_ -= i_180_;
		    i = (((Class103_Sub2)
			  ((Class96_Sub3) this).aClass103_Sub2_9299).anInt9249
			 * 1298750001);
		    i_178_ += i_180_;
		    i_175_ += i_180_;
		    i_177_ += i_180_;
		    i_176_ += i_180_;
		}
		if (i + i_172_
		    > 325436811 * (((Class103_Sub2)
				    ((Class96_Sub3) this).aClass103_Sub2_9299)
				   .anInt9250)) {
		    int i_181_
			= (i + i_172_
			   - 325436811 * ((Class103_Sub2)
					  (((Class96_Sub3) this)
					   .aClass103_Sub2_9299)).anInt9250);
		    i_172_ -= i_181_;
		    i_177_ += i_181_;
		    i_176_ += i_181_;
		}
		if (i_172_ > 0 && i_173_ > 0) {
		    if ((i_169_ & ~0xffffff) == -16777216)
			method15450((((Class96_Sub3) this).aByteArrayArray9297
				     [c]),
				    (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anIntArray9245),
				    i_169_, i_178_, i_175_, i_172_, i_173_,
				    i_176_, i_177_, i, i_168_,
				    ((Class96_Sub3) this).anIntArray9298[c],
				    class135, i_170_, i_171_);
		    else
			method15448((((Class96_Sub3) this).aByteArrayArray9297
				     [c]),
				    (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anIntArray9245),
				    i_169_, i_178_, i_175_, i_172_, i_173_,
				    i_176_, i_177_, i, i_168_,
				    ((Class96_Sub3) this).anIntArray9298[c],
				    class135, i_170_, i_171_);
		}
	    }
	}
    }
    
    void method2123(char c, int i, int i_182_, int i_183_, boolean bool) {
	if ((((Class103_Sub2) ((Class96_Sub3) this).aClass103_Sub2_9299)
	     .anIntArray9245)
	    != null) {
	    i += ((Class96_Sub3) this).anIntArray9296[c];
	    i_182_ += ((Class96_Sub3) this).anIntArray9300[c];
	    int i_184_ = ((Class96_Sub3) this).anIntArray9298[c];
	    int i_185_ = ((Class96_Sub3) this).anIntArray9301[c];
	    int i_186_
		= (-1826993761
		   * ((Class103_Sub2)
		      ((Class96_Sub3) this).aClass103_Sub2_9299).anInt9260);
	    int i_187_ = i_186_ * i_182_ + i;
	    int i_188_ = i_186_ - i_184_;
	    int i_189_ = 0;
	    int i_190_ = 0;
	    if (i_182_ < -788450385 * (((Class103_Sub2) (((Class96_Sub3) this)
							 .aClass103_Sub2_9299))
				       .anInt9254)) {
		int i_191_
		    = (-788450385 * (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anInt9254)
		       - i_182_);
		i_185_ -= i_191_;
		i_182_ = (((Class103_Sub2)
			   ((Class96_Sub3) this).aClass103_Sub2_9299).anInt9254
			  * -788450385);
		i_190_ += i_191_ * i_184_;
		i_187_ += i_186_ * i_191_;
	    }
	    if (i_185_ + i_182_
		> 1546170165 * (((Class103_Sub2)
				 ((Class96_Sub3) this).aClass103_Sub2_9299)
				.anInt9252))
		i_185_ -= (i_182_ + i_185_
			   - (((Class103_Sub2)
			       ((Class96_Sub3) this).aClass103_Sub2_9299)
			      .anInt9252) * 1546170165);
	    if (i < 1298750001 * (((Class103_Sub2)
				   ((Class96_Sub3) this).aClass103_Sub2_9299)
				  .anInt9249)) {
		int i_192_
		    = (1298750001 * (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anInt9249)
		       - i);
		i_184_ -= i_192_;
		i = 1298750001 * (((Class103_Sub2)
				   ((Class96_Sub3) this).aClass103_Sub2_9299)
				  .anInt9249);
		i_190_ += i_192_;
		i_187_ += i_192_;
		i_189_ += i_192_;
		i_188_ += i_192_;
	    }
	    if (i_184_ + i
		> (((Class103_Sub2) ((Class96_Sub3) this).aClass103_Sub2_9299)
		   .anInt9250) * 325436811) {
		int i_193_
		    = (i + i_184_
		       - 325436811 * (((Class103_Sub2) (((Class96_Sub3) this)
							.aClass103_Sub2_9299))
				      .anInt9250));
		i_184_ -= i_193_;
		i_189_ += i_193_;
		i_188_ += i_193_;
	    }
	    if (i_184_ > 0 && i_185_ > 0) {
		if (-16777216 == (i_183_ & ~0xffffff))
		    method15446(((Class96_Sub3) this).aByteArrayArray9297[c],
				(((Class103_Sub2)
				  ((Class96_Sub3) this).aClass103_Sub2_9299)
				 .anIntArray9245),
				i_183_, i_190_, i_187_, i_184_, i_185_, i_188_,
				i_189_);
		else if (0 != (i_183_ & ~0xffffff))
		    method15445(((Class96_Sub3) this).aByteArrayArray9297[c],
				(((Class103_Sub2)
				  ((Class96_Sub3) this).aClass103_Sub2_9299)
				 .anIntArray9245),
				i_183_, i_190_, i_187_, i_184_, i_185_, i_188_,
				i_189_);
	    }
	}
    }
    
    void method15451(byte[] is, int[] is_194_, int i, int i_195_, int i_196_,
		     int i_197_, int i_198_, int i_199_, int i_200_,
		     int i_201_, int i_202_, int i_203_, Class135 class135,
		     int i_204_, int i_205_) {
	Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	int[] is_206_ = ((Class135_Sub1) class135_sub1).anIntArray9874;
	int[] is_207_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	int i_208_
	    = i_201_ - 1298750001 * (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anInt9249);
	int i_209_ = i_202_;
	if (i_205_ > i_209_) {
	    i_209_ = i_205_;
	    i_196_ += -1826993761 * (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anInt9260) * (i_205_ - i_202_);
	    i_195_ += i_203_ * (i_205_ - i_202_);
	}
	int i_210_ = (is_206_.length + i_205_ < i_198_ + i_202_
		      ? i_205_ + is_206_.length : i_198_ + i_202_);
	int i_211_ = i >>> 24;
	int i_212_ = 255 - i_211_;
	for (int i_213_ = i_209_; i_213_ < i_210_; i_213_++) {
	    int i_214_ = i_204_ + is_206_[i_213_ - i_205_];
	    int i_215_ = is_207_[i_213_ - i_205_];
	    int i_216_ = i_197_;
	    if (i_208_ > i_214_) {
		int i_217_ = i_208_ - i_214_;
		if (i_217_ >= i_215_) {
		    i_195_ += i_197_ + i_200_;
		    i_196_ += i_197_ + i_199_;
		    continue;
		}
		i_215_ -= i_217_;
	    } else {
		int i_218_ = i_214_ - i_208_;
		if (i_218_ >= i_197_) {
		    i_195_ += i_200_ + i_197_;
		    i_196_ += i_199_ + i_197_;
		    continue;
		}
		i_195_ += i_218_;
		i_216_ -= i_218_;
		i_196_ += i_218_;
	    }
	    int i_219_ = 0;
	    if (i_216_ < i_215_)
		i_215_ = i_216_;
	    else
		i_219_ = i_216_ - i_215_;
	    for (int i_220_ = -i_215_; i_220_ < 0; i_220_++) {
		if (is[i_195_++] != 0) {
		    int i_221_ = ((((i & 0xff00) * i_211_ & 0xff0000)
				   + (i_211_ * (i & 0xff00ff) & ~0xff00ff))
				  >> 8);
		    int i_222_ = is_194_[i_196_];
		    is_194_[i_196_++]
			= (((i_212_ * (i_222_ & 0xff00) & 0xff0000)
			    + (i_212_ * (i_222_ & 0xff00ff) & ~0xff00ff))
			   >> 8) + i_221_;
		} else
		    i_196_++;
	    }
	    i_195_ += i_219_ + i_200_;
	    i_196_ += i_199_ + i_219_;
	}
    }
    
    void method15452(byte[] is, int[] is_223_, int i, int i_224_, int i_225_,
		     int i_226_, int i_227_, int i_228_, int i_229_) {
	int i_230_ = -(i_226_ >> 2);
	i_226_ = -(i_226_ & 0x3);
	for (int i_231_ = -i_227_; i_231_ < 0; i_231_++) {
	    for (int i_232_ = i_230_; i_232_ < 0; i_232_++) {
		if (is[i_224_++] != 0)
		    is_223_[i_225_++] = i;
		else
		    i_225_++;
		if (is[i_224_++] != 0)
		    is_223_[i_225_++] = i;
		else
		    i_225_++;
		if (is[i_224_++] != 0)
		    is_223_[i_225_++] = i;
		else
		    i_225_++;
		if (is[i_224_++] != 0)
		    is_223_[i_225_++] = i;
		else
		    i_225_++;
	    }
	    for (int i_233_ = i_226_; i_233_ < 0; i_233_++) {
		if (is[i_224_++] != 0)
		    is_223_[i_225_++] = i;
		else
		    i_225_++;
	    }
	    i_225_ += i_228_;
	    i_224_ += i_229_;
	}
    }
    
    void method15453(byte[] is, int[] is_234_, int i, int i_235_, int i_236_,
		     int i_237_, int i_238_, int i_239_, int i_240_) {
	int i_241_ = -(i_237_ >> 2);
	i_237_ = -(i_237_ & 0x3);
	for (int i_242_ = -i_238_; i_242_ < 0; i_242_++) {
	    for (int i_243_ = i_241_; i_243_ < 0; i_243_++) {
		if (is[i_235_++] != 0)
		    is_234_[i_236_++] = i;
		else
		    i_236_++;
		if (is[i_235_++] != 0)
		    is_234_[i_236_++] = i;
		else
		    i_236_++;
		if (is[i_235_++] != 0)
		    is_234_[i_236_++] = i;
		else
		    i_236_++;
		if (is[i_235_++] != 0)
		    is_234_[i_236_++] = i;
		else
		    i_236_++;
	    }
	    for (int i_244_ = i_237_; i_244_ < 0; i_244_++) {
		if (is[i_235_++] != 0)
		    is_234_[i_236_++] = i;
		else
		    i_236_++;
	    }
	    i_236_ += i_239_;
	    i_235_ += i_240_;
	}
    }
    
    void method15454(byte[] is, int[] is_245_, int i, int i_246_, int i_247_,
		     int i_248_, int i_249_, int i_250_, int i_251_) {
	int i_252_ = i >>> 24;
	int i_253_ = 255 - i_252_;
	for (int i_254_ = -i_249_; i_254_ < 0; i_254_++) {
	    for (int i_255_ = -i_248_; i_255_ < 0; i_255_++) {
		if (is[i_246_++] != 0) {
		    int i_256_ = ((((i & 0xff00ff) * i_252_ & ~0xff00ff)
				   + (i_252_ * (i & 0xff00) & 0xff0000))
				  >> 8);
		    int i_257_ = is_245_[i_247_];
		    is_245_[i_247_++]
			= i_256_ + (((i_253_ * (i_257_ & 0xff00) & 0xff0000)
				     + ((i_257_ & 0xff00ff) * i_253_
					& ~0xff00ff))
				    >> 8);
		} else
		    i_247_++;
	    }
	    i_247_ += i_250_;
	    i_246_ += i_251_;
	}
    }
    
    void method15455(byte[] is, int[] is_258_, int i, int i_259_, int i_260_,
		     int i_261_, int i_262_, int i_263_, int i_264_) {
	int i_265_ = i >>> 24;
	int i_266_ = 255 - i_265_;
	for (int i_267_ = -i_262_; i_267_ < 0; i_267_++) {
	    for (int i_268_ = -i_261_; i_268_ < 0; i_268_++) {
		if (is[i_259_++] != 0) {
		    int i_269_ = ((((i & 0xff00ff) * i_265_ & ~0xff00ff)
				   + (i_265_ * (i & 0xff00) & 0xff0000))
				  >> 8);
		    int i_270_ = is_258_[i_260_];
		    is_258_[i_260_++]
			= i_269_ + (((i_266_ * (i_270_ & 0xff00) & 0xff0000)
				     + ((i_270_ & 0xff00ff) * i_266_
					& ~0xff00ff))
				    >> 8);
		} else
		    i_260_++;
	    }
	    i_260_ += i_263_;
	    i_259_ += i_264_;
	}
    }
    
    void method15456(byte[] is, int[] is_271_, int i, int i_272_, int i_273_,
		     int i_274_, int i_275_, int i_276_, int i_277_,
		     int i_278_, int i_279_, int i_280_, Class135 class135,
		     int i_281_, int i_282_) {
	Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	int[] is_283_ = ((Class135_Sub1) class135_sub1).anIntArray9874;
	int[] is_284_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	int i_285_ = i_279_;
	if (i_282_ > i_285_) {
	    i_285_ = i_282_;
	    i_273_
		+= ((i_282_ - i_279_)
		    * (-1826993761
		       * ((Class103_Sub2) (((Class96_Sub3) this)
					   .aClass103_Sub2_9299)).anInt9260));
	    i_272_ += i_280_ * (i_282_ - i_279_);
	}
	int i_286_ = (i_282_ + is_283_.length < i_275_ + i_279_
		      ? is_283_.length + i_282_ : i_275_ + i_279_);
	for (int i_287_ = i_285_; i_287_ < i_286_; i_287_++) {
	    int i_288_ = is_283_[i_287_ - i_282_] + i_281_;
	    int i_289_ = is_284_[i_287_ - i_282_];
	    int i_290_ = i_274_;
	    if (i_278_ > i_288_) {
		int i_291_ = i_278_ - i_288_;
		if (i_291_ >= i_289_) {
		    i_272_ += i_274_ + i_277_;
		    i_273_ += i_274_ + i_276_;
		    continue;
		}
		i_289_ -= i_291_;
	    } else {
		int i_292_ = i_288_ - i_278_;
		if (i_292_ >= i_274_) {
		    i_272_ += i_274_ + i_277_;
		    i_273_ += i_274_ + i_276_;
		    continue;
		}
		i_272_ += i_292_;
		i_290_ -= i_292_;
		i_273_ += i_292_;
	    }
	    int i_293_ = 0;
	    if (i_290_ < i_289_)
		i_289_ = i_290_;
	    else
		i_293_ = i_290_ - i_289_;
	    for (int i_294_ = 0; i_294_ < i_289_; i_294_++) {
		if (is[i_272_++] != 0)
		    is_271_[i_273_++] = i;
		else
		    i_273_++;
	    }
	    i_272_ += i_293_ + i_277_;
	    i_273_ += i_293_ + i_276_;
	}
    }
    
    void method15457(byte[] is, int[] is_295_, int i, int i_296_, int i_297_,
		     int i_298_, int i_299_, int i_300_, int i_301_,
		     int i_302_, int i_303_, int i_304_, Class135 class135,
		     int i_305_, int i_306_) {
	Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	int[] is_307_ = ((Class135_Sub1) class135_sub1).anIntArray9874;
	int[] is_308_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	int i_309_ = i_303_;
	if (i_306_ > i_309_) {
	    i_309_ = i_306_;
	    i_297_
		+= ((i_306_ - i_303_)
		    * (-1826993761
		       * ((Class103_Sub2) (((Class96_Sub3) this)
					   .aClass103_Sub2_9299)).anInt9260));
	    i_296_ += i_304_ * (i_306_ - i_303_);
	}
	int i_310_ = (i_306_ + is_307_.length < i_299_ + i_303_
		      ? is_307_.length + i_306_ : i_299_ + i_303_);
	for (int i_311_ = i_309_; i_311_ < i_310_; i_311_++) {
	    int i_312_ = is_307_[i_311_ - i_306_] + i_305_;
	    int i_313_ = is_308_[i_311_ - i_306_];
	    int i_314_ = i_298_;
	    if (i_302_ > i_312_) {
		int i_315_ = i_302_ - i_312_;
		if (i_315_ >= i_313_) {
		    i_296_ += i_298_ + i_301_;
		    i_297_ += i_298_ + i_300_;
		    continue;
		}
		i_313_ -= i_315_;
	    } else {
		int i_316_ = i_312_ - i_302_;
		if (i_316_ >= i_298_) {
		    i_296_ += i_298_ + i_301_;
		    i_297_ += i_298_ + i_300_;
		    continue;
		}
		i_296_ += i_316_;
		i_314_ -= i_316_;
		i_297_ += i_316_;
	    }
	    int i_317_ = 0;
	    if (i_314_ < i_313_)
		i_313_ = i_314_;
	    else
		i_317_ = i_314_ - i_313_;
	    for (int i_318_ = 0; i_318_ < i_313_; i_318_++) {
		if (is[i_296_++] != 0)
		    is_295_[i_297_++] = i;
		else
		    i_297_++;
	    }
	    i_296_ += i_317_ + i_301_;
	    i_297_ += i_317_ + i_300_;
	}
    }
    
    void method15458(byte[] is, int[] is_319_, int i, int i_320_, int i_321_,
		     int i_322_, int i_323_, int i_324_, int i_325_,
		     int i_326_, int i_327_, int i_328_, Class135 class135,
		     int i_329_, int i_330_) {
	Class135_Sub1 class135_sub1 = (Class135_Sub1) class135;
	int[] is_331_ = ((Class135_Sub1) class135_sub1).anIntArray9874;
	int[] is_332_ = ((Class135_Sub1) class135_sub1).anIntArray9873;
	int i_333_
	    = i_326_ - 1298750001 * (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anInt9249);
	int i_334_ = i_327_;
	if (i_330_ > i_334_) {
	    i_334_ = i_330_;
	    i_321_ += -1826993761 * (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anInt9260) * (i_330_ - i_327_);
	    i_320_ += i_328_ * (i_330_ - i_327_);
	}
	int i_335_ = (is_331_.length + i_330_ < i_323_ + i_327_
		      ? i_330_ + is_331_.length : i_323_ + i_327_);
	int i_336_ = i >>> 24;
	int i_337_ = 255 - i_336_;
	for (int i_338_ = i_334_; i_338_ < i_335_; i_338_++) {
	    int i_339_ = i_329_ + is_331_[i_338_ - i_330_];
	    int i_340_ = is_332_[i_338_ - i_330_];
	    int i_341_ = i_322_;
	    if (i_333_ > i_339_) {
		int i_342_ = i_333_ - i_339_;
		if (i_342_ >= i_340_) {
		    i_320_ += i_322_ + i_325_;
		    i_321_ += i_322_ + i_324_;
		    continue;
		}
		i_340_ -= i_342_;
	    } else {
		int i_343_ = i_339_ - i_333_;
		if (i_343_ >= i_322_) {
		    i_320_ += i_325_ + i_322_;
		    i_321_ += i_324_ + i_322_;
		    continue;
		}
		i_320_ += i_343_;
		i_341_ -= i_343_;
		i_321_ += i_343_;
	    }
	    int i_344_ = 0;
	    if (i_341_ < i_340_)
		i_340_ = i_341_;
	    else
		i_344_ = i_341_ - i_340_;
	    for (int i_345_ = -i_340_; i_345_ < 0; i_345_++) {
		if (is[i_320_++] != 0) {
		    int i_346_ = ((((i & 0xff00) * i_336_ & 0xff0000)
				   + (i_336_ * (i & 0xff00ff) & ~0xff00ff))
				  >> 8);
		    int i_347_ = is_319_[i_321_];
		    is_319_[i_321_++]
			= (((i_337_ * (i_347_ & 0xff00) & 0xff0000)
			    + (i_337_ * (i_347_ & 0xff00ff) & ~0xff00ff))
			   >> 8) + i_346_;
		} else
		    i_321_++;
	    }
	    i_320_ += i_344_ + i_325_;
	    i_321_ += i_324_ + i_344_;
	}
    }
    
    void method2131(char c, int i, int i_348_, int i_349_, boolean bool,
		    Class135 class135, int i_350_, int i_351_) {
	if (null
	    != (((Class103_Sub2) ((Class96_Sub3) this).aClass103_Sub2_9299)
		.anIntArray9245)) {
	    if (class135 == null)
		method2126(c, i, i_348_, i_349_, bool);
	    else {
		i += ((Class96_Sub3) this).anIntArray9296[c];
		i_348_ += ((Class96_Sub3) this).anIntArray9300[c];
		int i_352_ = ((Class96_Sub3) this).anIntArray9298[c];
		int i_353_ = ((Class96_Sub3) this).anIntArray9301[c];
		int i_354_
		    = (-1826993761
		       * ((Class103_Sub2) (((Class96_Sub3) this)
					   .aClass103_Sub2_9299)).anInt9260);
		int i_355_ = i + i_354_ * i_348_;
		int i_356_ = i_354_ - i_352_;
		int i_357_ = 0;
		int i_358_ = 0;
		if (i_348_
		    < -788450385 * (((Class103_Sub2)
				     ((Class96_Sub3) this).aClass103_Sub2_9299)
				    .anInt9254)) {
		    int i_359_
			= (-788450385 * ((Class103_Sub2)
					 (((Class96_Sub3) this)
					  .aClass103_Sub2_9299)).anInt9254
			   - i_348_);
		    i_353_ -= i_359_;
		    i_348_ = (((Class103_Sub2)
			       ((Class96_Sub3) this).aClass103_Sub2_9299)
			      .anInt9254) * -788450385;
		    i_358_ += i_359_ * i_352_;
		    i_355_ += i_354_ * i_359_;
		}
		if (i_348_ + i_353_ > (((Class103_Sub2) (((Class96_Sub3) this)
							 .aClass103_Sub2_9299))
				       .anInt9252) * 1546170165)
		    i_353_
			-= (i_353_ + i_348_
			    - 1546170165 * ((Class103_Sub2)
					    (((Class96_Sub3) this)
					     .aClass103_Sub2_9299)).anInt9252);
		if (i < 1298750001 * (((Class103_Sub2) (((Class96_Sub3) this)
							.aClass103_Sub2_9299))
				      .anInt9249)) {
		    int i_360_
			= (1298750001 * ((Class103_Sub2)
					 (((Class96_Sub3) this)
					  .aClass103_Sub2_9299)).anInt9249
			   - i);
		    i_352_ -= i_360_;
		    i = (((Class103_Sub2)
			  ((Class96_Sub3) this).aClass103_Sub2_9299).anInt9249
			 * 1298750001);
		    i_358_ += i_360_;
		    i_355_ += i_360_;
		    i_357_ += i_360_;
		    i_356_ += i_360_;
		}
		if (i + i_352_
		    > 325436811 * (((Class103_Sub2)
				    ((Class96_Sub3) this).aClass103_Sub2_9299)
				   .anInt9250)) {
		    int i_361_
			= (i + i_352_
			   - 325436811 * ((Class103_Sub2)
					  (((Class96_Sub3) this)
					   .aClass103_Sub2_9299)).anInt9250);
		    i_352_ -= i_361_;
		    i_357_ += i_361_;
		    i_356_ += i_361_;
		}
		if (i_352_ > 0 && i_353_ > 0) {
		    if ((i_349_ & ~0xffffff) == -16777216)
			method15450((((Class96_Sub3) this).aByteArrayArray9297
				     [c]),
				    (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anIntArray9245),
				    i_349_, i_358_, i_355_, i_352_, i_353_,
				    i_356_, i_357_, i, i_348_,
				    ((Class96_Sub3) this).anIntArray9298[c],
				    class135, i_350_, i_351_);
		    else
			method15448((((Class96_Sub3) this).aByteArrayArray9297
				     [c]),
				    (((Class103_Sub2) (((Class96_Sub3) this)
						       .aClass103_Sub2_9299))
				     .anIntArray9245),
				    i_349_, i_358_, i_355_, i_352_, i_353_,
				    i_356_, i_357_, i, i_348_,
				    ((Class96_Sub3) this).anIntArray9298[c],
				    class135, i_350_, i_351_);
		}
	    }
	}
    }
    
    static final void method15459(ClientScriptData class454, byte i) {
	Class241_Sub16 class241_sub16
	    = (Class241_Sub16) (((ClientScriptData) class454).objectStack
				[(((ClientScriptData) class454).objectStackPointer
				  -= -1650705371) * -290357331]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 576500115 * class241_sub16.anInt8982;
    }
}
