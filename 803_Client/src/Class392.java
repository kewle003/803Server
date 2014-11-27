/* Class392 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class392
{
    int[] anIntArray5751;
    int anInt5752;
    Class103_Sub3 aClass103_Sub3_5753;
    static final int anInt5754 = 128;
    int anInt5755;
    int anInt5756;
    boolean aBool5757 = true;
    int anInt5758 = -1;
    int anInt5759;
    Interface33 anInterface33_5760;
    Interface41 anInterface41_5761;
    int anInt5762;
    static final int anInt5763 = 7;
    Class364 aClass364_5764;
    byte[] aByteArray5765;
    
    void method7014(Class361 class361) {
	method7020(class361, ((Class392) this).anInterface33_5760, 0,
		   ((Class392) this).anInt5759);
    }
    
    void method7015(Class361 class361) {
	method7020(class361, ((Class392) this).anInterface33_5760, 0,
		   ((Class392) this).anInt5759);
    }
    
    void method7016(Class361 class361, Interface33 interface33, int i,
		    int i_0_) {
	if (i_0_ > 0) {
	    method7017();
	    ((Class392) this).aClass103_Sub3_5753.method15718(interface33);
	    class361.anInterface41_5525 = ((Class392) this).anInterface41_5761;
	    class361.anInt5522 = ((Class392) this).anInt5762;
	    class361.anInt5523 = (((Class392) this).anInt5752
				  - ((Class392) this).anInt5762 + 1);
	    class361.anInt5506 = i;
	    class361.anInt5517 = i_0_;
	    class361.method6495(false);
	}
    }
    
    void method7017() {
	if (((Class392) this).aBool5757) {
	    ((Class392) this).aBool5757 = false;
	    byte[] is
		= ((Class364) ((Class392) this).aClass364_5764).aByteArray5539;
	    int i = 0;
	    int i_1_ = ((Class364) ((Class392) this).aClass364_5764).anInt5537;
	    int i_2_ = (((Class392) this).anInt5755
			+ (((Class392) this).anInt5756
			   * (((Class364) ((Class392) this).aClass364_5764)
			      .anInt5537)));
	    for (int i_3_ = -128; i_3_ < 0; i_3_++) {
		i = (i << 8) - i;
		for (int i_4_ = -128; i_4_ < 0; i_4_++) {
		    if (is[i_2_++] != 0)
			i++;
		}
		i_2_ += i_1_ - 128;
	    }
	    if (((Class392) this).anInterface41_5761 != null
		&& ((Class392) this).anInt5758 == i)
		((Class392) this).aBool5757 = false;
	    else {
		((Class392) this).anInt5758 = i;
		int i_5_ = 0;
		i_2_ = (((Class392) this).anInt5755
			+ ((Class392) this).anInt5756 * i_1_);
		if (((Class392) this).aClass103_Sub3_5753.method15675
		    (Class175.aClass175_2112, Class102.aClass102_1440)) {
		    if (((Class392) this).aByteArray5765 == null)
			((Class392) this).aByteArray5765 = new byte[16384];
		    byte[] is_6_ = ((Class392) this).aByteArray5765;
		    for (int i_7_ = -128; i_7_ < 0; i_7_++) {
			for (int i_8_ = -128; i_8_ < 0; i_8_++) {
			    if (is[i_2_] != 0)
				is_6_[i_5_++] = (byte) 68;
			    else {
				int i_9_ = 0;
				if (is[i_2_ - 1] != 0)
				    i_9_++;
				if (is[i_2_ + 1] != 0)
				    i_9_++;
				if (is[i_2_ - i_1_] != 0)
				    i_9_++;
				if (is[i_2_ + i_1_] != 0)
				    i_9_++;
				is_6_[i_5_++] = (byte) (17 * i_9_);
			    }
			    i_2_++;
			}
			i_2_ += (((Class364) ((Class392) this).aClass364_5764)
				 .anInt5537) - 128;
		    }
		    if (((Class392) this).anInterface41_5761 == null) {
			((Class392) this).anInterface41_5761
			    = (((Class392) this).aClass103_Sub3_5753
				   .method15849
			       (Class175.aClass175_2112, 128, 128, false,
				((Class392) this).aByteArray5765));
			((Class392) this).anInterface41_5761.method228(false,
								       false);
		    } else
			((Class392) this).anInterface41_5761.method230
			    (0, 0, 128, 128, ((Class392) this).aByteArray5765,
			     Class175.aClass175_2112, 0, 128);
		} else {
		    if (((Class392) this).anIntArray5751 == null)
			((Class392) this).anIntArray5751 = new int[16384];
		    int[] is_10_ = ((Class392) this).anIntArray5751;
		    for (int i_11_ = -128; i_11_ < 0; i_11_++) {
			for (int i_12_ = -128; i_12_ < 0; i_12_++) {
			    if (is[i_2_] != 0)
				is_10_[i_5_++] = 1140850688;
			    else {
				int i_13_ = 0;
				if (is[i_2_ - 1] != 0)
				    i_13_++;
				if (is[i_2_ + 1] != 0)
				    i_13_++;
				if (is[i_2_ - i_1_] != 0)
				    i_13_++;
				if (is[i_2_ + i_1_] != 0)
				    i_13_++;
				is_10_[i_5_++] = 17 * i_13_ << 24;
			    }
			    i_2_++;
			}
			i_2_ += (((Class364) ((Class392) this).aClass364_5764)
				 .anInt5537) - 128;
		    }
		    if (((Class392) this).anInterface41_5761 == null) {
			((Class392) this).anInterface41_5761
			    = (((Class392) this).aClass103_Sub3_5753
				   .method15828
			       (128, 128, false,
				((Class392) this).anIntArray5751));
			((Class392) this).anInterface41_5761.method228(false,
								       false);
		    } else
			((Class392) this).anInterface41_5761.method256
			    (0, 0, 128, 128, ((Class392) this).anIntArray5751,
			     0, 128);
		}
	    }
	}
    }
    
    void method7018(Class361 class361) {
	method7020(class361, ((Class392) this).anInterface33_5760, 0,
		   ((Class392) this).anInt5759);
    }
    
    void method7019() {
	if (((Class392) this).aBool5757) {
	    ((Class392) this).aBool5757 = false;
	    byte[] is
		= ((Class364) ((Class392) this).aClass364_5764).aByteArray5539;
	    int i = 0;
	    int i_14_
		= ((Class364) ((Class392) this).aClass364_5764).anInt5537;
	    int i_15_ = (((Class392) this).anInt5755
			 + (((Class392) this).anInt5756
			    * (((Class364) ((Class392) this).aClass364_5764)
			       .anInt5537)));
	    for (int i_16_ = -128; i_16_ < 0; i_16_++) {
		i = (i << 8) - i;
		for (int i_17_ = -128; i_17_ < 0; i_17_++) {
		    if (is[i_15_++] != 0)
			i++;
		}
		i_15_ += i_14_ - 128;
	    }
	    if (((Class392) this).anInterface41_5761 != null
		&& ((Class392) this).anInt5758 == i)
		((Class392) this).aBool5757 = false;
	    else {
		((Class392) this).anInt5758 = i;
		int i_18_ = 0;
		i_15_ = (((Class392) this).anInt5755
			 + ((Class392) this).anInt5756 * i_14_);
		if (((Class392) this).aClass103_Sub3_5753.method15675
		    (Class175.aClass175_2112, Class102.aClass102_1440)) {
		    if (((Class392) this).aByteArray5765 == null)
			((Class392) this).aByteArray5765 = new byte[16384];
		    byte[] is_19_ = ((Class392) this).aByteArray5765;
		    for (int i_20_ = -128; i_20_ < 0; i_20_++) {
			for (int i_21_ = -128; i_21_ < 0; i_21_++) {
			    if (is[i_15_] != 0)
				is_19_[i_18_++] = (byte) 68;
			    else {
				int i_22_ = 0;
				if (is[i_15_ - 1] != 0)
				    i_22_++;
				if (is[i_15_ + 1] != 0)
				    i_22_++;
				if (is[i_15_ - i_14_] != 0)
				    i_22_++;
				if (is[i_15_ + i_14_] != 0)
				    i_22_++;
				is_19_[i_18_++] = (byte) (17 * i_22_);
			    }
			    i_15_++;
			}
			i_15_ += (((Class364) ((Class392) this).aClass364_5764)
				  .anInt5537) - 128;
		    }
		    if (((Class392) this).anInterface41_5761 == null) {
			((Class392) this).anInterface41_5761
			    = (((Class392) this).aClass103_Sub3_5753
				   .method15849
			       (Class175.aClass175_2112, 128, 128, false,
				((Class392) this).aByteArray5765));
			((Class392) this).anInterface41_5761.method228(false,
								       false);
		    } else
			((Class392) this).anInterface41_5761.method230
			    (0, 0, 128, 128, ((Class392) this).aByteArray5765,
			     Class175.aClass175_2112, 0, 128);
		} else {
		    if (((Class392) this).anIntArray5751 == null)
			((Class392) this).anIntArray5751 = new int[16384];
		    int[] is_23_ = ((Class392) this).anIntArray5751;
		    for (int i_24_ = -128; i_24_ < 0; i_24_++) {
			for (int i_25_ = -128; i_25_ < 0; i_25_++) {
			    if (is[i_15_] != 0)
				is_23_[i_18_++] = 1140850688;
			    else {
				int i_26_ = 0;
				if (is[i_15_ - 1] != 0)
				    i_26_++;
				if (is[i_15_ + 1] != 0)
				    i_26_++;
				if (is[i_15_ - i_14_] != 0)
				    i_26_++;
				if (is[i_15_ + i_14_] != 0)
				    i_26_++;
				is_23_[i_18_++] = 17 * i_26_ << 24;
			    }
			    i_15_++;
			}
			i_15_ += (((Class364) ((Class392) this).aClass364_5764)
				  .anInt5537) - 128;
		    }
		    if (((Class392) this).anInterface41_5761 == null) {
			((Class392) this).anInterface41_5761
			    = (((Class392) this).aClass103_Sub3_5753
				   .method15828
			       (128, 128, false,
				((Class392) this).anIntArray5751));
			((Class392) this).anInterface41_5761.method228(false,
								       false);
		    } else
			((Class392) this).anInterface41_5761.method256
			    (0, 0, 128, 128, ((Class392) this).anIntArray5751,
			     0, 128);
		}
	    }
	}
    }
    
    void method7020(Class361 class361, Interface33 interface33, int i,
		    int i_27_) {
	if (i_27_ > 0) {
	    method7017();
	    ((Class392) this).aClass103_Sub3_5753.method15718(interface33);
	    class361.anInterface41_5525 = ((Class392) this).anInterface41_5761;
	    class361.anInt5522 = ((Class392) this).anInt5762;
	    class361.anInt5523 = (((Class392) this).anInt5752
				  - ((Class392) this).anInt5762 + 1);
	    class361.anInt5506 = i;
	    class361.anInt5517 = i_27_;
	    class361.method6495(false);
	}
    }
    
    void method7021(Class361 class361, Interface33 interface33, int i,
		    int i_28_) {
	if (i_28_ > 0) {
	    method7017();
	    ((Class392) this).aClass103_Sub3_5753.method15718(interface33);
	    class361.anInterface41_5525 = ((Class392) this).anInterface41_5761;
	    class361.anInt5522 = ((Class392) this).anInt5762;
	    class361.anInt5523 = (((Class392) this).anInt5752
				  - ((Class392) this).anInt5762 + 1);
	    class361.anInt5506 = i;
	    class361.anInt5517 = i_28_;
	    class361.method6495(false);
	}
    }
    
    Class392(Class103_Sub3 class103_sub3, Class364 class364,
	     Class166_Sub1 class166_sub1, int i, int i_29_, int i_30_,
	     int i_31_, int i_32_) {
	((Class392) this).aClass103_Sub3_5753 = class103_sub3;
	((Class392) this).aClass364_5764 = class364;
	((Class392) this).anInt5755 = i_31_;
	((Class392) this).anInt5756 = i_32_;
	int i_33_ = 1 << i_30_;
	int i_34_ = 0;
	int i_35_ = i << i_30_;
	int i_36_ = i_29_ << i_30_;
	for (int i_37_ = 0; i_37_ < i_33_; i_37_++) {
	    int i_38_
		= ((i_36_ + i_37_) * (class166_sub1.anInt2055 * 266270313)
		   + i_35_);
	    for (int i_39_ = 0; i_39_ < i_33_; i_39_++) {
		short[] is = (((Class166_Sub1) class166_sub1)
			      .aShortArrayArray9791[i_38_++]);
		if (is != null)
		    i_34_ += is.length;
	    }
	}
	if (i_34_ > 0) {
	    ((Class392) this).anInt5752 = -2147483648;
	    ((Class392) this).anInt5762 = 2147483647;
	    ((Class392) this).anInterface33_5760
		= ((Class392) this).aClass103_Sub3_5753.method15714(false);
	    ((Class392) this).anInterface33_5760.method185(i_34_);
	    ByteBuffer bytebuffer
		= ((Class392) this).aClass103_Sub3_5753.aByteBuffer9490;
	    bytebuffer.clear();
	    for (int i_40_ = 0; i_40_ < i_33_; i_40_++) {
		int i_41_
		    = ((i_36_ + i_40_) * (class166_sub1.anInt2055 * 266270313)
		       + i_35_);
		for (int i_42_ = 0; i_42_ < i_33_; i_42_++) {
		    short[] is = (((Class166_Sub1) class166_sub1)
				  .aShortArrayArray9791[i_41_++]);
		    if (is != null) {
			for (int i_43_ = 0; i_43_ < is.length; i_43_++) {
			    int i_44_ = is[i_43_] & 0xffff;
			    if (i_44_ < ((Class392) this).anInt5762)
				((Class392) this).anInt5762 = i_44_;
			    if (i_44_ > ((Class392) this).anInt5752)
				((Class392) this).anInt5752 = i_44_;
			    bytebuffer.putShort((short) i_44_);
			}
		    }
		}
	    }
	    ((Class392) this).anInterface33_5760.method268
		(0, bytebuffer.position(),
		 ((Class392) this).aClass103_Sub3_5753.aLong9491);
	    ((Class392) this).anInt5759 = i_34_ / 3;
	} else {
	    ((Class392) this).anInt5759 = 0;
	    ((Class392) this).anInterface41_5761 = null;
	}
    }
    
    void method7022() {
	if (((Class392) this).aBool5757) {
	    ((Class392) this).aBool5757 = false;
	    byte[] is
		= ((Class364) ((Class392) this).aClass364_5764).aByteArray5539;
	    int i = 0;
	    int i_45_
		= ((Class364) ((Class392) this).aClass364_5764).anInt5537;
	    int i_46_ = (((Class392) this).anInt5755
			 + (((Class392) this).anInt5756
			    * (((Class364) ((Class392) this).aClass364_5764)
			       .anInt5537)));
	    for (int i_47_ = -128; i_47_ < 0; i_47_++) {
		i = (i << 8) - i;
		for (int i_48_ = -128; i_48_ < 0; i_48_++) {
		    if (is[i_46_++] != 0)
			i++;
		}
		i_46_ += i_45_ - 128;
	    }
	    if (((Class392) this).anInterface41_5761 != null
		&& ((Class392) this).anInt5758 == i)
		((Class392) this).aBool5757 = false;
	    else {
		((Class392) this).anInt5758 = i;
		int i_49_ = 0;
		i_46_ = (((Class392) this).anInt5755
			 + ((Class392) this).anInt5756 * i_45_);
		if (((Class392) this).aClass103_Sub3_5753.method15675
		    (Class175.aClass175_2112, Class102.aClass102_1440)) {
		    if (((Class392) this).aByteArray5765 == null)
			((Class392) this).aByteArray5765 = new byte[16384];
		    byte[] is_50_ = ((Class392) this).aByteArray5765;
		    for (int i_51_ = -128; i_51_ < 0; i_51_++) {
			for (int i_52_ = -128; i_52_ < 0; i_52_++) {
			    if (is[i_46_] != 0)
				is_50_[i_49_++] = (byte) 68;
			    else {
				int i_53_ = 0;
				if (is[i_46_ - 1] != 0)
				    i_53_++;
				if (is[i_46_ + 1] != 0)
				    i_53_++;
				if (is[i_46_ - i_45_] != 0)
				    i_53_++;
				if (is[i_46_ + i_45_] != 0)
				    i_53_++;
				is_50_[i_49_++] = (byte) (17 * i_53_);
			    }
			    i_46_++;
			}
			i_46_ += (((Class364) ((Class392) this).aClass364_5764)
				  .anInt5537) - 128;
		    }
		    if (((Class392) this).anInterface41_5761 == null) {
			((Class392) this).anInterface41_5761
			    = (((Class392) this).aClass103_Sub3_5753
				   .method15849
			       (Class175.aClass175_2112, 128, 128, false,
				((Class392) this).aByteArray5765));
			((Class392) this).anInterface41_5761.method228(false,
								       false);
		    } else
			((Class392) this).anInterface41_5761.method230
			    (0, 0, 128, 128, ((Class392) this).aByteArray5765,
			     Class175.aClass175_2112, 0, 128);
		} else {
		    if (((Class392) this).anIntArray5751 == null)
			((Class392) this).anIntArray5751 = new int[16384];
		    int[] is_54_ = ((Class392) this).anIntArray5751;
		    for (int i_55_ = -128; i_55_ < 0; i_55_++) {
			for (int i_56_ = -128; i_56_ < 0; i_56_++) {
			    if (is[i_46_] != 0)
				is_54_[i_49_++] = 1140850688;
			    else {
				int i_57_ = 0;
				if (is[i_46_ - 1] != 0)
				    i_57_++;
				if (is[i_46_ + 1] != 0)
				    i_57_++;
				if (is[i_46_ - i_45_] != 0)
				    i_57_++;
				if (is[i_46_ + i_45_] != 0)
				    i_57_++;
				is_54_[i_49_++] = 17 * i_57_ << 24;
			    }
			    i_46_++;
			}
			i_46_ += (((Class364) ((Class392) this).aClass364_5764)
				  .anInt5537) - 128;
		    }
		    if (((Class392) this).anInterface41_5761 == null) {
			((Class392) this).anInterface41_5761
			    = (((Class392) this).aClass103_Sub3_5753
				   .method15828
			       (128, 128, false,
				((Class392) this).anIntArray5751));
			((Class392) this).anInterface41_5761.method228(false,
								       false);
		    } else
			((Class392) this).anInterface41_5761.method256
			    (0, 0, 128, 128, ((Class392) this).anIntArray5751,
			     0, 128);
		}
	    }
	}
    }
    
    void method7023(Class361 class361, Interface33 interface33, int i,
		    int i_58_) {
	if (i_58_ > 0) {
	    method7017();
	    ((Class392) this).aClass103_Sub3_5753.method15718(interface33);
	    class361.anInterface41_5525 = ((Class392) this).anInterface41_5761;
	    class361.anInt5522 = ((Class392) this).anInt5762;
	    class361.anInt5523 = (((Class392) this).anInt5752
				  - ((Class392) this).anInt5762 + 1);
	    class361.anInt5506 = i;
	    class361.anInt5517 = i_58_;
	    class361.method6495(false);
	}
    }
}
