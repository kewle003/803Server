/* Class241_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import sun.misc.Unsafe;

@SuppressWarnings("restriction")
public class Class241_Sub8 extends Node
{
    Class103_Sub3 aClass103_Sub3_8827;
    Class166_Sub1 aClass166_Sub1_8828;
    int anInt8829;
    int anInt8830;
    int anInt8831;
    Class241_Sub43 aClass241_Sub43_8832;
    int anInt8833;
    int anInt8834 = 0;
    int anInt8835 = 0;
    float[][] aFloatArrayArray8836;
    Interface33 anInterface33_8837;
    Interface40 anInterface40_8838;
    float[][] aFloatArrayArray8839;
    int anInt8840;
    float[][] aFloatArrayArray8841;
    HashTable aClass407_8842;
    ByteBuffer aByteBuffer8843;
    
    void method14895(Class361 class361, Interface33 interface33, int i) {
	class361.anInt5522 = 0;
	class361.anInt5523 = ((Class241_Sub8) this).anInt8834;
	class361.anInt5506 = 0;
	class361.anInt5517 = ((Class241_Sub8) this).anInt8833 / 3;
	class361.anInterface41_5525
	    = ((Class241_Sub8) this).aClass103_Sub3_8827.anInterface41_9584;
	float f = ((Class241_Sub8) this).aClass241_Sub43_8832
		      .method16458(436450550);
	class361.aClass287_5521.method5568(f, f, f);
	((Class241_Sub8) this).aClass103_Sub3_8827
	    .method15955(0, ((Class241_Sub8) this).anInterface40_8838);
	((Class241_Sub8) this).aClass103_Sub3_8827.method15716
	    (((Class103_Sub3) ((Class241_Sub8) this).aClass103_Sub3_8827)
	     .aClass366_9648);
	((Class241_Sub8) this).aClass103_Sub3_8827
	    .method15718(((Class241_Sub8) this).anInterface33_8837);
	class361.method6496(0);
    }
    
    Class241_Sub8(Class103_Sub3 class103_sub3, Class166_Sub1 class166_sub1,
		  Class241_Sub43 class241_sub43, int[] is) {
	((Class241_Sub8) this).anInt8833 = 0;
	((Class241_Sub8) this).aClass103_Sub3_8827 = class103_sub3;
	((Class241_Sub8) this).aClass241_Sub43_8832 = class241_sub43;
	((Class241_Sub8) this).aClass166_Sub1_8828 = class166_sub1;
	int i = (((Class241_Sub8) this).aClass241_Sub43_8832
		     .method16468(1143403757)
		 - (class166_sub1.anInt2053 * 2039042417 >> 1));
	((Class241_Sub8) this).anInt8829
	    = (((Class241_Sub8) this).aClass241_Sub43_8832
		   .method16453((byte) -35) - i
	       >> class166_sub1.anInt2054 * -122333825);
	((Class241_Sub8) this).anInt8831
	    = (((Class241_Sub8) this).aClass241_Sub43_8832
		   .method16453((byte) -11) + i
	       >> class166_sub1.anInt2054 * -122333825);
	((Class241_Sub8) this).anInt8830
	    = (((Class241_Sub8) this).aClass241_Sub43_8832
		   .method16455(626523592) - i
	       >> class166_sub1.anInt2054 * -122333825);
	((Class241_Sub8) this).anInt8840
	    = (((Class241_Sub8) this).aClass241_Sub43_8832
		   .method16455(626523592) + i
	       >> class166_sub1.anInt2054 * -122333825);
	int i_0_ = (((Class241_Sub8) this).anInt8831
		    - ((Class241_Sub8) this).anInt8829 + 1);
	int i_1_ = (((Class241_Sub8) this).anInt8840
		    - ((Class241_Sub8) this).anInt8830 + 1);
	((Class241_Sub8) this).aFloatArrayArray8839
	    = new float[i_0_ + 1][i_1_ + 1];
	((Class241_Sub8) this).aFloatArrayArray8841
	    = new float[i_0_ + 1][i_1_ + 1];
	((Class241_Sub8) this).aFloatArrayArray8836
	    = new float[i_0_ + 1][i_1_ + 1];
	for (int i_2_ = 0; i_2_ <= i_1_; i_2_++) {
	    int i_3_ = i_2_ + ((Class241_Sub8) this).anInt8830;
	    if (i_3_ > 0
		&& i_3_ < (((Class241_Sub8) this).aClass166_Sub1_8828.anInt2052
			   * -14610189) - 1) {
		for (int i_4_ = 0; i_4_ <= i_0_; i_4_++) {
		    int i_5_ = i_4_ + ((Class241_Sub8) this).anInt8829;
		    if (i_5_ > 0
			&& i_5_ < (((Class241_Sub8) this).aClass166_Sub1_8828
				   .anInt2055) * 266270313 - 1) {
			int i_6_ = (class166_sub1.method3551(i_5_ + 1, i_3_,
							     -651008105)
				    - class166_sub1.method3551(i_5_ - 1, i_3_,
							       -1656433768));
			int i_7_ = (class166_sub1.method3551(i_5_, i_3_ + 1,
							     -980217441)
				    - class166_sub1.method3551(i_5_, i_3_ - 1,
							       -738461491));
			float f
			    = (float) (1.0
				       / Math.sqrt((double) (i_6_ * i_6_
							     + 65536
							     + i_7_ * i_7_)));
			((Class241_Sub8) this).aFloatArrayArray8839[i_4_][i_2_]
			    = (float) i_6_ * f;
			((Class241_Sub8) this).aFloatArrayArray8841[i_4_][i_2_]
			    = -256.0F * f;
			((Class241_Sub8) this).aFloatArrayArray8836[i_4_][i_2_]
			    = (float) i_7_ * f;
		    }
		}
	    }
	}
	int i_8_ = 0;
	for (int i_9_ = ((Class241_Sub8) this).anInt8830;
	     i_9_ <= ((Class241_Sub8) this).anInt8840; i_9_++) {
	    if (i_9_ >= 0 && i_9_ < class166_sub1.anInt2052 * -14610189) {
		for (int i_10_ = ((Class241_Sub8) this).anInt8829;
		     i_10_ <= ((Class241_Sub8) this).anInt8831; i_10_++) {
		    if (i_10_ >= 0
			&& i_10_ < class166_sub1.anInt2055 * 266270313) {
			int i_11_ = is[i_8_];
			int[] is_12_
			    = (((Class166_Sub1) class166_sub1)
			       .anIntArrayArrayArray9757[i_10_][i_9_]);
			if (is_12_ != null && i_11_ != 0) {
			    if (i_11_ == 1) {
				for (int i_13_ = 0; i_13_ < is_12_.length;
				     i_13_ += 3) {
				    if (is_12_[i_13_] != -1
					&& is_12_[i_13_ + 1] != -1
					&& is_12_[i_13_ + 2] != -1)
					((Class241_Sub8) this).anInt8835 += 3;
				}
			    } else
				((Class241_Sub8) this).anInt8835 += 3;
			}
		    }
		    i_8_++;
		}
	    } else
		i_8_ += (((Class241_Sub8) this).anInt8831
			 - ((Class241_Sub8) this).anInt8829);
	}
	if (((Class241_Sub8) this).anInt8835 > 0) {
	    ((Class241_Sub8) this).aClass407_8842
		= new HashTable(Class480.method11001((((Class241_Sub8) this)
						     .anInt8835),
						    (byte) 31));
	    ((Class241_Sub8) this).aByteBuffer8843
		= ((Class241_Sub8) this).aClass103_Sub3_8827.aByteBuffer9490;
	    ((Class241_Sub8) this).aByteBuffer8843.clear();
	    ((Class241_Sub8) this).aByteBuffer8843.position(2097152);
	    ((Class241_Sub8) this).aByteBuffer8843.slice();
	    ((Class241_Sub8) this).aByteBuffer8843.position(0);
	    ((Class241_Sub8) this).aByteBuffer8843.limit(2097152);
	    int i_14_ = 0;
	    i_8_ = 0;
	    for (int i_15_ = ((Class241_Sub8) this).anInt8830;
		 i_15_ <= ((Class241_Sub8) this).anInt8840; i_15_++) {
		if (i_15_ >= 0
		    && i_15_ < class166_sub1.anInt2052 * -14610189) {
		    int i_16_ = 0;
		    for (int i_17_ = ((Class241_Sub8) this).anInt8829;
			 i_17_ <= ((Class241_Sub8) this).anInt8831; i_17_++) {
			if (i_17_ >= 0
			    && i_17_ < class166_sub1.anInt2055 * 266270313) {
			    int i_18_ = is[i_8_];
			    int[] is_19_
				= (((Class166_Sub1) class166_sub1)
				   .anIntArrayArrayArray9757[i_17_][i_15_]);
			    if (is_19_ != null && i_18_ != 0) {
				if (i_18_ == 1) {
				    int[] is_20_
					= (((Class166_Sub1) class166_sub1)
					   .anIntArrayArrayArray9772[i_17_]
					   [i_15_]);
				    int[] is_21_
					= (((Class166_Sub1) class166_sub1)
					   .anIntArrayArrayArray9799[i_17_]
					   [i_15_]);
				    int i_22_ = 0;
				    while (i_22_ < is_19_.length) {
					if (is_19_[i_22_] != -1
					    && is_19_[i_22_ + 1] != -1
					    && is_19_[i_22_ + 2] != -1) {
					    method14896(i_16_, i_14_, i_17_,
							i_15_, is_20_[i_22_],
							is_21_[i_22_]);
					    i_22_++;
					    method14896(i_16_, i_14_, i_17_,
							i_15_, is_20_[i_22_],
							is_21_[i_22_]);
					    i_22_++;
					    method14896(i_16_, i_14_, i_17_,
							i_15_, is_20_[i_22_],
							is_21_[i_22_]);
					    i_22_++;
					} else
					    i_22_ += 3;
				    }
				} else if (i_18_ == 3) {
				    method14896(i_16_, i_14_, i_17_, i_15_, 0,
						0);
				    method14896(i_16_, i_14_, i_17_, i_15_,
						(class166_sub1.anInt2053
						 * 2039042417),
						0);
				    method14896(i_16_, i_14_, i_17_, i_15_, 0,
						(class166_sub1.anInt2053
						 * 2039042417));
				} else if (i_18_ == 2) {
				    method14896(i_16_, i_14_, i_17_, i_15_,
						(class166_sub1.anInt2053
						 * 2039042417),
						0);
				    method14896(i_16_, i_14_, i_17_, i_15_,
						(class166_sub1.anInt2053
						 * 2039042417),
						(class166_sub1.anInt2053
						 * 2039042417));
				    method14896(i_16_, i_14_, i_17_, i_15_, 0,
						0);
				} else if (i_18_ == 5) {
				    method14896(i_16_, i_14_, i_17_, i_15_,
						(class166_sub1.anInt2053
						 * 2039042417),
						(class166_sub1.anInt2053
						 * 2039042417));
				    method14896(i_16_, i_14_, i_17_, i_15_, 0,
						(class166_sub1.anInt2053
						 * 2039042417));
				    method14896(i_16_, i_14_, i_17_, i_15_,
						(class166_sub1.anInt2053
						 * 2039042417),
						0);
				} else if (i_18_ == 4) {
				    method14896(i_16_, i_14_, i_17_, i_15_, 0,
						(class166_sub1.anInt2053
						 * 2039042417));
				    method14896(i_16_, i_14_, i_17_, i_15_, 0,
						0);
				    method14896(i_16_, i_14_, i_17_, i_15_,
						(class166_sub1.anInt2053
						 * 2039042417),
						(class166_sub1.anInt2053
						 * 2039042417));
				}
			    }
			}
			i_8_++;
			i_16_++;
		    }
		} else
		    i_8_ += (((Class241_Sub8) this).anInt8831
			     - ((Class241_Sub8) this).anInt8829);
		i_14_++;
	    }
	    method14898();
	} else {
	    ((Class241_Sub8) this).anInterface40_8838 = null;
	    ((Class241_Sub8) this).anInterface33_8837 = null;
	}
	((Class241_Sub8) this).aClass407_8842 = null;
	((Class241_Sub8) this).aFloatArrayArray8836 = null;
	((Class241_Sub8) this).aFloatArrayArray8841 = null;
	((Class241_Sub8) this).aFloatArrayArray8839 = null;
    }
    
    void method14896(int i, int i_23_, int i_24_, int i_25_, int i_26_,
		     int i_27_) {
	long l = -1L;
	int i_28_
	    = i_26_ + (i_24_
		       << (((Class241_Sub8) this).aClass166_Sub1_8828.anInt2054
			   * -122333825));
	int i_29_
	    = i_27_ + (i_25_
		       << (((Class241_Sub8) this).aClass166_Sub1_8828.anInt2054
			   * -122333825));
	int i_30_ = ((Class241_Sub8) this).aClass166_Sub1_8828
			.method3574(i_28_, i_29_, -1503181215);
	if ((i_26_ & 0x7f) == 0 || (i_27_ & 0x7f) == 0) {
	    l = ((long) i_29_ & 0xffffL) << 16 | (long) i_28_ & 0xffffL;
	    Node class241
		= ((Class241_Sub8) this).aClass407_8842.get(l);
	    if (class241 != null) {
		Unsafe unsafe
		    = ((Class241_Sub8) this).aClass103_Sub3_8827.anUnsafe9493;
		unsafe.putShort(((((Class241_Sub8) this).aClass103_Sub3_8827
				  .aLong9491)
				 + 2097152L
				 + (long) (((Class241_Sub8) this).anInt8833
					   * 2)),
				((Class241_Sub7) class241).aShort8826);
		((Class241_Sub8) this).anInt8833++;
		return;
	    }
	}
	short i_31_ = (short) ((Class241_Sub8) this).anInt8834;
	if (l != -1L)
	    ((Class241_Sub8) this).aClass407_8842
		.put(new Class241_Sub7(i_31_), l);
	float f;
	float f_32_;
	float f_33_;
	if (i_26_ == 0 && i_27_ == 0) {
	    f = ((Class241_Sub8) this).aFloatArrayArray8839[i][i_23_];
	    f_32_ = ((Class241_Sub8) this).aFloatArrayArray8841[i][i_23_];
	    f_33_ = ((Class241_Sub8) this).aFloatArrayArray8836[i][i_23_];
	} else if (i_26_ == (((Class241_Sub8) this).aClass166_Sub1_8828
			     .anInt2053) * 2039042417
		   && i_27_ == 0) {
	    f = ((Class241_Sub8) this).aFloatArrayArray8839[i + 1][i_23_];
	    f_32_ = ((Class241_Sub8) this).aFloatArrayArray8841[i + 1][i_23_];
	    f_33_ = ((Class241_Sub8) this).aFloatArrayArray8836[i + 1][i_23_];
	} else if (i_26_ == (((Class241_Sub8) this).aClass166_Sub1_8828
			     .anInt2053) * 2039042417
		   && i_27_ == (((Class241_Sub8) this).aClass166_Sub1_8828
				.anInt2053) * 2039042417) {
	    f = ((Class241_Sub8) this).aFloatArrayArray8839[i + 1][i_23_ + 1];
	    f_32_ = (((Class241_Sub8) this).aFloatArrayArray8841[i + 1]
		     [i_23_ + 1]);
	    f_33_ = (((Class241_Sub8) this).aFloatArrayArray8836[i + 1]
		     [i_23_ + 1]);
	} else if (i_26_ == 0
		   && i_27_ == (((Class241_Sub8) this).aClass166_Sub1_8828
				.anInt2053) * 2039042417) {
	    f = ((Class241_Sub8) this).aFloatArrayArray8839[i][i_23_ + 1];
	    f_32_ = ((Class241_Sub8) this).aFloatArrayArray8841[i][i_23_ + 1];
	    f_33_ = ((Class241_Sub8) this).aFloatArrayArray8836[i][i_23_ + 1];
	} else {
	    float f_34_
		= (float) i_26_ / (float) ((((Class241_Sub8) this)
					    .aClass166_Sub1_8828.anInt2053)
					   * 2039042417);
	    float f_35_
		= (float) i_27_ / (float) ((((Class241_Sub8) this)
					    .aClass166_Sub1_8828.anInt2053)
					   * 2039042417);
	    float f_36_
		= ((Class241_Sub8) this).aFloatArrayArray8839[i][i_23_];
	    float f_37_
		= ((Class241_Sub8) this).aFloatArrayArray8841[i][i_23_];
	    float f_38_
		= ((Class241_Sub8) this).aFloatArrayArray8836[i][i_23_];
	    float f_39_
		= ((Class241_Sub8) this).aFloatArrayArray8839[i + 1][i_23_];
	    float f_40_
		= ((Class241_Sub8) this).aFloatArrayArray8841[i + 1][i_23_];
	    float f_41_
		= ((Class241_Sub8) this).aFloatArrayArray8836[i + 1][i_23_];
	    f_36_ += (((Class241_Sub8) this).aFloatArrayArray8839[i][i_23_ + 1]
		      - f_36_) * f_34_;
	    f_37_ += (((Class241_Sub8) this).aFloatArrayArray8841[i][i_23_ + 1]
		      - f_37_) * f_34_;
	    f_38_ += (((Class241_Sub8) this).aFloatArrayArray8836[i][i_23_ + 1]
		      - f_38_) * f_34_;
	    f_39_ += ((((Class241_Sub8) this).aFloatArrayArray8839[i + 1]
		       [i_23_ + 1])
		      - f_39_) * f_34_;
	    f_40_ += ((((Class241_Sub8) this).aFloatArrayArray8841[i + 1]
		       [i_23_ + 1])
		      - f_40_) * f_34_;
	    f_41_ += ((((Class241_Sub8) this).aFloatArrayArray8836[i + 1]
		       [i_23_ + 1])
		      - f_41_) * f_34_;
	    f = f_36_ + (f_39_ - f_36_) * f_35_;
	    f_32_ = f_37_ + (f_40_ - f_37_) * f_35_;
	    f_33_ = f_38_ + (f_41_ - f_38_) * f_35_;
	}
	float f_42_ = (float) (((Class241_Sub8) this).aClass241_Sub43_8832
				   .method16453((byte) -19)
			       - i_28_);
	float f_43_ = (float) (((Class241_Sub8) this).aClass241_Sub43_8832
				   .method16454(-1874096036)
			       - i_30_);
	float f_44_ = (float) (((Class241_Sub8) this).aClass241_Sub43_8832
				   .method16455(626523592)
			       - i_29_);
	float f_45_ = (float) Math.sqrt((double) (f_42_ * f_42_ + f_43_ * f_43_
						  + f_44_ * f_44_));
	float f_46_ = 1.0F / f_45_;
	f_42_ *= f_46_;
	f_43_ *= f_46_;
	f_44_ *= f_46_;
	float f_47_
	    = f_45_ / (float) ((Class241_Sub8) this).aClass241_Sub43_8832
				  .method16468(1143403757);
	float f_48_ = 1.0F - f_47_ * f_47_;
	if (f_48_ < 0.0F)
	    f_48_ = 0.0F;
	float f_49_ = f_42_ * f + f_43_ * f_32_ + f_44_ * f_33_;
	if (f_49_ < 0.0F)
	    f_49_ = 0.0F;
	float f_50_ = f_49_ * f_48_ * 2.0F;
	if (f_50_ > 1.0F)
	    f_50_ = 1.0F;
	int i_51_ = ((Class241_Sub8) this).aClass241_Sub43_8832
			.method16461(-894682571);
	int i_52_ = (int) (f_50_ * (float) (i_51_ >> 16 & 0xff));
	if (i_52_ > 255)
	    i_52_ = 255;
	int i_53_ = (int) (f_50_ * (float) (i_51_ >> 8 & 0xff));
	if (i_53_ > 255)
	    i_53_ = 255;
	int i_54_ = (int) (f_50_ * (float) (i_51_ & 0xff));
	if (i_54_ > 255)
	    i_54_ = 255;
	Unsafe unsafe
	    = ((Class241_Sub8) this).aClass103_Sub3_8827.anUnsafe9493;
	unsafe.putFloat((((Class241_Sub8) this).aClass103_Sub3_8827.aLong9491
			 + (long) (((Class241_Sub8) this).anInt8834 * 16)),
			(float) i_28_);
	unsafe.putFloat((((Class241_Sub8) this).aClass103_Sub3_8827.aLong9491
			 + (long) (((Class241_Sub8) this).anInt8834 * 16)
			 + 4L),
			(float) i_30_);
	unsafe.putFloat((((Class241_Sub8) this).aClass103_Sub3_8827.aLong9491
			 + (long) (((Class241_Sub8) this).anInt8834 * 16)
			 + 8L),
			(float) i_29_);
	if ((((Class103_Sub3) ((Class241_Sub8) this).aClass103_Sub3_8827)
	     .anInt9633)
	    == 0) {
	    unsafe.putByte(((((Class241_Sub8) this).aClass103_Sub3_8827
			     .aLong9491)
			    + (long) (((Class241_Sub8) this).anInt8834 * 16)
			    + 12L),
			   (byte) i_54_);
	    unsafe.putByte(((((Class241_Sub8) this).aClass103_Sub3_8827
			     .aLong9491)
			    + (long) (((Class241_Sub8) this).anInt8834 * 16)
			    + 13L),
			   (byte) i_53_);
	    unsafe.putByte(((((Class241_Sub8) this).aClass103_Sub3_8827
			     .aLong9491)
			    + (long) (((Class241_Sub8) this).anInt8834 * 16)
			    + 14L),
			   (byte) i_52_);
	} else {
	    unsafe.putByte(((((Class241_Sub8) this).aClass103_Sub3_8827
			     .aLong9491)
			    + (long) (((Class241_Sub8) this).anInt8834 * 16)
			    + 12L),
			   (byte) i_52_);
	    unsafe.putByte(((((Class241_Sub8) this).aClass103_Sub3_8827
			     .aLong9491)
			    + (long) (((Class241_Sub8) this).anInt8834 * 16)
			    + 13L),
			   (byte) i_53_);
	    unsafe.putByte(((((Class241_Sub8) this).aClass103_Sub3_8827
			     .aLong9491)
			    + (long) (((Class241_Sub8) this).anInt8834 * 16)
			    + 14L),
			   (byte) i_54_);
	}
	unsafe.putByte((((Class241_Sub8) this).aClass103_Sub3_8827.aLong9491
			+ (long) (((Class241_Sub8) this).anInt8834 * 16)
			+ 15L),
		       (byte) -1);
	((Class241_Sub8) this).anInt8834++;
	unsafe.putShort((((Class241_Sub8) this).aClass103_Sub3_8827.aLong9491
			 + 2097152L
			 + (long) (((Class241_Sub8) this).anInt8833 * 2)),
			i_31_);
	((Class241_Sub8) this).anInt8833++;
    }
    
    void method14897(Class361 class361, int i, int i_55_, int i_56_,
		     boolean[][] bools, boolean bool) {
	if (((Class241_Sub8) this).anInterface33_8837 != null
	    && ((Class241_Sub8) this).anInt8829 <= i + i_56_
	    && ((Class241_Sub8) this).anInt8831 >= i - i_56_
	    && ((Class241_Sub8) this).anInt8830 <= i_55_ + i_56_
	    && ((Class241_Sub8) this).anInt8840 >= i_55_ - i_56_) {
	    if (bool) {
		for (int i_57_ = ((Class241_Sub8) this).anInt8829;
		     i_57_ <= ((Class241_Sub8) this).anInt8831; i_57_++) {
		    if (i_57_ - i >= -i_56_ && i_57_ - i <= i_56_) {
			for (int i_58_ = ((Class241_Sub8) this).anInt8830;
			     i_58_ <= ((Class241_Sub8) this).anInt8840;
			     i_58_++) {
			    if (i_58_ - i_55_ >= -i_56_
				&& i_58_ - i_55_ <= i_56_
				&& (bools[i_57_ - i + i_56_]
				    [i_58_ - i_55_ + i_56_])) {
				method14901(class361,
					    (((Class241_Sub8) this)
					     .anInterface33_8837),
					    (((Class241_Sub8) this).anInt8833
					     / 3));
				return;
			    }
			}
		    }
		}
	    } else {
		int i_59_ = 0;
		ByteBuffer bytebuffer = (((Class241_Sub8) this)
					 .aClass103_Sub3_8827.aByteBuffer9490);
		bytebuffer.clear();
		for (int i_60_ = ((Class241_Sub8) this).anInt8830;
		     i_60_ <= ((Class241_Sub8) this).anInt8840; i_60_++) {
		    if (i_60_ - i_55_ >= -i_56_ && i_60_ - i_55_ <= i_56_) {
			int i_61_ = (i_60_ * ((((Class241_Sub8) this)
					       .aClass166_Sub1_8828.anInt2055)
					      * 266270313)
				     + ((Class241_Sub8) this).anInt8829);
			for (int i_62_ = ((Class241_Sub8) this).anInt8829;
			     i_62_ <= ((Class241_Sub8) this).anInt8831;
			     i_62_++) {
			    if (i_62_ - i >= -i_56_ && i_62_ - i <= i_56_
				&& (bools[i_62_ - i + i_56_]
				    [i_60_ - i_55_ + i_56_])) {
				short[] is
				    = (((Class166_Sub1) (((Class241_Sub8) this)
							 .aClass166_Sub1_8828))
				       .aShortArrayArray9791[i_61_]);
				if (is != null) {
				    for (int i_63_ = 0; i_63_ < is.length;
					 i_63_++) {
					bytebuffer.putShort(is[i_63_]);
					i_59_++;
				    }
				}
			    }
			    i_61_++;
			}
		    }
		}
		if (bytebuffer.position() != 0 && i_59_ != 0) {
		    int i_64_ = bytebuffer.position();
		    Interface33 interface33
			= ((Class241_Sub8) this).aClass103_Sub3_8827
			      .method15630(i_64_ / 2);
		    interface33.method268(0, i_64_,
					  (((Class241_Sub8) this)
					   .aClass103_Sub3_8827.aLong9491));
		    method14901(class361, interface33, i_59_ / 3);
		}
	    }
	}
    }
    
    void method14898() {
	((Class241_Sub8) this).anInterface33_8837
	    = ((Class241_Sub8) this).aClass103_Sub3_8827.method15714(false);
	((Class241_Sub8) this).anInterface33_8837
	    .method185(((Class241_Sub8) this).anInt8833);
	((Class241_Sub8) this).anInterface40_8838
	    = ((Class241_Sub8) this).aClass103_Sub3_8827.method15752(false);
	((Class241_Sub8) this).anInterface40_8838
	    .method221(((Class241_Sub8) this).anInt8834 * 16, 16);
	((Class241_Sub8) this).anInterface40_8838.method268
	    (0, ((Class241_Sub8) this).anInt8834 * 16,
	     ((Class241_Sub8) this).aClass103_Sub3_8827.aLong9491);
	((Class241_Sub8) this).anInterface33_8837.method268
	    (0, ((Class241_Sub8) this).anInt8833 * 2,
	     ((Class241_Sub8) this).aClass103_Sub3_8827.aLong9491 + 2097152L);
    }
    
    void method14899() {
	((Class241_Sub8) this).anInterface33_8837
	    = ((Class241_Sub8) this).aClass103_Sub3_8827.method15714(false);
	((Class241_Sub8) this).anInterface33_8837
	    .method185(((Class241_Sub8) this).anInt8833);
	((Class241_Sub8) this).anInterface40_8838
	    = ((Class241_Sub8) this).aClass103_Sub3_8827.method15752(false);
	((Class241_Sub8) this).anInterface40_8838
	    .method221(((Class241_Sub8) this).anInt8834 * 16, 16);
	((Class241_Sub8) this).anInterface40_8838.method268
	    (0, ((Class241_Sub8) this).anInt8834 * 16,
	     ((Class241_Sub8) this).aClass103_Sub3_8827.aLong9491);
	((Class241_Sub8) this).anInterface33_8837.method268
	    (0, ((Class241_Sub8) this).anInt8833 * 2,
	     ((Class241_Sub8) this).aClass103_Sub3_8827.aLong9491 + 2097152L);
    }
    
    void method14900() {
	((Class241_Sub8) this).anInterface33_8837
	    = ((Class241_Sub8) this).aClass103_Sub3_8827.method15714(false);
	((Class241_Sub8) this).anInterface33_8837
	    .method185(((Class241_Sub8) this).anInt8833);
	((Class241_Sub8) this).anInterface40_8838
	    = ((Class241_Sub8) this).aClass103_Sub3_8827.method15752(false);
	((Class241_Sub8) this).anInterface40_8838
	    .method221(((Class241_Sub8) this).anInt8834 * 16, 16);
	((Class241_Sub8) this).anInterface40_8838.method268
	    (0, ((Class241_Sub8) this).anInt8834 * 16,
	     ((Class241_Sub8) this).aClass103_Sub3_8827.aLong9491);
	((Class241_Sub8) this).anInterface33_8837.method268
	    (0, ((Class241_Sub8) this).anInt8833 * 2,
	     ((Class241_Sub8) this).aClass103_Sub3_8827.aLong9491 + 2097152L);
    }
    
    void method14901(Class361 class361, Interface33 interface33, int i) {
	class361.anInt5522 = 0;
	class361.anInt5523 = ((Class241_Sub8) this).anInt8834;
	class361.anInt5506 = 0;
	class361.anInt5517 = ((Class241_Sub8) this).anInt8833 / 3;
	class361.anInterface41_5525
	    = ((Class241_Sub8) this).aClass103_Sub3_8827.anInterface41_9584;
	float f = ((Class241_Sub8) this).aClass241_Sub43_8832
		      .method16458(2078097726);
	class361.aClass287_5521.method5568(f, f, f);
	((Class241_Sub8) this).aClass103_Sub3_8827
	    .method15955(0, ((Class241_Sub8) this).anInterface40_8838);
	((Class241_Sub8) this).aClass103_Sub3_8827.method15716
	    (((Class103_Sub3) ((Class241_Sub8) this).aClass103_Sub3_8827)
	     .aClass366_9648);
	((Class241_Sub8) this).aClass103_Sub3_8827
	    .method15718(((Class241_Sub8) this).anInterface33_8837);
	class361.method6496(0);
    }
    
    void method14902() {
	((Class241_Sub8) this).anInterface33_8837
	    = ((Class241_Sub8) this).aClass103_Sub3_8827.method15714(false);
	((Class241_Sub8) this).anInterface33_8837
	    .method185(((Class241_Sub8) this).anInt8833);
	((Class241_Sub8) this).anInterface40_8838
	    = ((Class241_Sub8) this).aClass103_Sub3_8827.method15752(false);
	((Class241_Sub8) this).anInterface40_8838
	    .method221(((Class241_Sub8) this).anInt8834 * 16, 16);
	((Class241_Sub8) this).anInterface40_8838.method268
	    (0, ((Class241_Sub8) this).anInt8834 * 16,
	     ((Class241_Sub8) this).aClass103_Sub3_8827.aLong9491);
	((Class241_Sub8) this).anInterface33_8837.method268
	    (0, ((Class241_Sub8) this).anInt8833 * 2,
	     ((Class241_Sub8) this).aClass103_Sub3_8827.aLong9491 + 2097152L);
    }
    
    void method14903() {
	((Class241_Sub8) this).anInterface33_8837
	    = ((Class241_Sub8) this).aClass103_Sub3_8827.method15714(false);
	((Class241_Sub8) this).anInterface33_8837
	    .method185(((Class241_Sub8) this).anInt8833);
	((Class241_Sub8) this).anInterface40_8838
	    = ((Class241_Sub8) this).aClass103_Sub3_8827.method15752(false);
	((Class241_Sub8) this).anInterface40_8838
	    .method221(((Class241_Sub8) this).anInt8834 * 16, 16);
	((Class241_Sub8) this).anInterface40_8838.method268
	    (0, ((Class241_Sub8) this).anInt8834 * 16,
	     ((Class241_Sub8) this).aClass103_Sub3_8827.aLong9491);
	((Class241_Sub8) this).anInterface33_8837.method268
	    (0, ((Class241_Sub8) this).anInt8833 * 2,
	     ((Class241_Sub8) this).aClass103_Sub3_8827.aLong9491 + 2097152L);
    }
    
    void method14904(Class361 class361, Interface33 interface33, int i) {
	class361.anInt5522 = 0;
	class361.anInt5523 = ((Class241_Sub8) this).anInt8834;
	class361.anInt5506 = 0;
	class361.anInt5517 = ((Class241_Sub8) this).anInt8833 / 3;
	class361.anInterface41_5525
	    = ((Class241_Sub8) this).aClass103_Sub3_8827.anInterface41_9584;
	float f = ((Class241_Sub8) this).aClass241_Sub43_8832
		      .method16458(1641819067);
	class361.aClass287_5521.method5568(f, f, f);
	((Class241_Sub8) this).aClass103_Sub3_8827
	    .method15955(0, ((Class241_Sub8) this).anInterface40_8838);
	((Class241_Sub8) this).aClass103_Sub3_8827.method15716
	    (((Class103_Sub3) ((Class241_Sub8) this).aClass103_Sub3_8827)
	     .aClass366_9648);
	((Class241_Sub8) this).aClass103_Sub3_8827
	    .method15718(((Class241_Sub8) this).anInterface33_8837);
	class361.method6496(0);
    }
}
