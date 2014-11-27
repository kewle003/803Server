/* Class390 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import sun.misc.Unsafe;

@SuppressWarnings("restriction")
public class Class390
{
    Class376 aClass376_5722 = Class376.aClass376_5633;
    Class366 aClass366_5723;
    Class376 aClass376_5724;
    int[] anIntArray5725;
    Interface41[] anInterface41Array5726;
    float[] aFloatArray5727;
    Class103_Sub3 aClass103_Sub3_5728;
    int[] anIntArray5729;
    int anInt5730;
    Interface40 anInterface40_5731;
    int anInt5732 = 128;
    Interface33 anInterface33_5733;
    int anInt5734 = 0;
    
    void method6965() {
	if (((Class390) this).aClass376_5724 != null) {
	    ((Class390) this).aClass376_5722
		= ((Class390) this).aClass376_5724;
	    ((Class390) this).aClass376_5724 = null;
	}
    }
    
    void method6966() {
	((Class390) this).anInterface40_5731.method28();
	((Class390) this).anInterface33_5733.method28();
	((Class390) this).anInterface40_5731 = null;
	((Class390) this).anInterface33_5733 = null;
	((Class390) this).aClass366_5723 = null;
	((Class390) this).anInt5734 = 0;
    }
    
    void method6967() {
	if (((Class390) this).anInt5734 != 0) {
	    ((Class390) this).aClass103_Sub3_5728.method15727();
	    ((Class390) this).aClass103_Sub3_5728.method15640(1);
	    ((Class390) this).aClass103_Sub3_5728
		.method15718(((Class390) this).anInterface33_5733);
	    ((Class390) this).aClass103_Sub3_5728
		.method15955(0, ((Class390) this).anInterface40_5731);
	    ((Class390) this).aClass103_Sub3_5728
		.method15716(((Class390) this).aClass366_5723);
	    Class66 class66
		= (((Class103_Sub3) ((Class390) this).aClass103_Sub3_5728)
		   .aClass66_9594);
	    Unsafe unsafe = ((Class390) this).aClass103_Sub3_5728.anUnsafe9493;
	    ByteBuffer bytebuffer
		= ((Class390) this).aClass103_Sub3_5728.aByteBuffer9490;
	    bytebuffer.clear();
	    ((Class390) this).aClass103_Sub3_5728.method15743()
		.method5199(Class268.aClass268_4354);
	    ((Class390) this).aClass103_Sub3_5728
		.method15696(Class387.aClass387_5712);
	    int i = ((((Class390) this).anInt5734 + ((Class390) this).anInt5730
		      - 1)
		     / ((Class390) this).anInt5730);
	    int i_0_ = 0;
	    int i_1_ = 0;
	    for (int i_2_ = 0; i_2_ < i; i_2_++) {
		int i_3_ = Math.min(((Class390) this).anInt5730,
				    ((Class390) this).anInt5734 - i_0_);
		long l = ((Class390) this).anInterface40_5731
			     .method262(0, i_3_ * 96);
		int i_4_ = i_2_ * ((Class390) this).anInt5730 + i_3_;
		for (int i_5_ = i_0_; i_5_ < i_4_; i_5_++) {
		    for (int i_6_ = 0; i_6_ < 4; i_6_++) {
			unsafe.putFloat(l, (((Class390) this).aFloatArray5727
					    [i_1_++]));
			l += 4L;
			unsafe.putFloat(l, (((Class390) this).aFloatArray5727
					    [i_1_++]));
			l += 4L;
			unsafe.putFloat(l, 0.0F);
			l += 4L;
			unsafe.putFloat(l, (((Class390) this).aFloatArray5727
					    [i_1_++]));
			l += 4L;
			unsafe.putFloat(l, (((Class390) this).aFloatArray5727
					    [i_1_++]));
			l += 4L;
			unsafe.putInt(l,
				      ((Class390) this).anIntArray5729[i_5_]);
			l += 4L;
		    }
		}
		((Class390) this).anInterface40_5731.method192();
		Interface41 interface41
		    = ((Class390) this).anInterface41Array5726[i_0_];
		int i_7_ = 1;
		int i_8_ = 0;
		for (int i_9_ = i_0_ + 1; i_9_ < i_4_; i_9_++) {
		    if (interface41
			== ((Class390) this).anInterface41Array5726[i_9_])
			i_7_++;
		    else {
			class66.anInterface41_1050 = interface41;
			class66.method1641();
			((Class390) this).aClass103_Sub3_5728.method15757
			    (((Class390) this).anInterface33_5733,
			     Class310.aClass310_4822, i_8_ * 4, i_7_ * 4,
			     i_8_ * 6, i_7_ * 2);
			interface41
			    = ((Class390) this).anInterface41Array5726[i_9_];
			i_7_ = 1;
			i_8_ = i_9_ - i_0_;
		    }
		}
		class66.anInterface41_1050 = interface41;
		class66.method1641();
		((Class390) this).aClass103_Sub3_5728.method15757
		    (((Class390) this).anInterface33_5733,
		     Class310.aClass310_4822, i_8_ * 4, i_7_ * 4, i_8_ * 6,
		     i_7_ * 2);
		i_0_ += ((Class390) this).anInt5730;
	    }
	    ((Class390) this).anInt5734 = 0;
	}
    }
    
    Class390(Class103_Sub3 class103_sub3, int i) {
	((Class390) this).aFloatArray5727
	    = new float[((Class390) this).anInt5732 * 16];
	((Class390) this).anInterface41Array5726
	    = new Interface41[((Class390) this).anInt5732];
	((Class390) this).anIntArray5729
	    = new int[((Class390) this).anInt5732];
	((Class390) this).anIntArray5725 = new int[4];
	((Class390) this).aClass103_Sub3_5728 = class103_sub3;
	((Class390) this).anInterface40_5731
	    = ((Class390) this).aClass103_Sub3_5728.method15752(true);
	((Class390) this).anInterface40_5731.method221(i * 96, 24);
	((Class390) this).aClass366_5723
	    = (((Class390) this).aClass103_Sub3_5728.method15697
	       (new Class314[]
		{ new Class314(new Class367[] { Class367.aClass367_5545,
						Class367.aClass367_5549,
						Class367.aClass367_5547 }) }));
	((Class390) this).anInterface33_5733
	    = ((Class390) this).aClass103_Sub3_5728.method15714(false);
	int i_10_ = i * 6;
	((Class390) this).anInterface33_5733.method185(i_10_);
	ByteBuffer bytebuffer
	    = ((Class390) this).aClass103_Sub3_5728.aByteBuffer9490;
	bytebuffer.clear();
	for (int i_11_ = 0; i_11_ < i; i_11_++) {
	    bytebuffer.putShort((short) (i_11_ * 4));
	    bytebuffer.putShort((short) (i_11_ * 4 + 2));
	    bytebuffer.putShort((short) (i_11_ * 4 + 1));
	    bytebuffer.putShort((short) (i_11_ * 4 + 2));
	    bytebuffer.putShort((short) (i_11_ * 4 + 3));
	    bytebuffer.putShort((short) (i_11_ * 4 + 1));
	}
	((Class390) this).anInterface33_5733.method268
	    (0,
	     (i_10_
	      * (((Class390) this).anInterface33_5733.method186().anInt1447
		 * -387243519)),
	     ((Class390) this).aClass103_Sub3_5728.aLong9491);
	((Class390) this).anInt5730 = i;
	((Class390) this).anInt5734 = 0;
    }
    
    void method6968() {
	if (((Class390) this).anInt5734 == ((Class390) this).anInt5732) {
	    ((Class390) this).anInt5732 *= 2;
	    float[] fs = new float[((Class390) this).anInt5732 * 16];
	    for (int i = 0; i < ((Class390) this).anInt5734 * 16; i++)
		fs[i] = ((Class390) this).aFloatArray5727[i];
	    ((Class390) this).aFloatArray5727 = fs;
	    Interface41[] interface41s
		= new Interface41[((Class390) this).anInt5732];
	    int[] is = new int[((Class390) this).anInt5732];
	    for (int i = 0; i < ((Class390) this).anInt5734; i++) {
		interface41s[i] = ((Class390) this).anInterface41Array5726[i];
		is[i] = ((Class390) this).anIntArray5729[i];
	    }
	    ((Class390) this).anInterface41Array5726 = interface41s;
	    ((Class390) this).anIntArray5729 = is;
	}
    }
    
    void method6969() {
	if (((Class390) this).anInt5734 == ((Class390) this).anInt5732) {
	    ((Class390) this).anInt5732 *= 2;
	    float[] fs = new float[((Class390) this).anInt5732 * 16];
	    for (int i = 0; i < ((Class390) this).anInt5734 * 16; i++)
		fs[i] = ((Class390) this).aFloatArray5727[i];
	    ((Class390) this).aFloatArray5727 = fs;
	    Interface41[] interface41s
		= new Interface41[((Class390) this).anInt5732];
	    int[] is = new int[((Class390) this).anInt5732];
	    for (int i = 0; i < ((Class390) this).anInt5734; i++) {
		interface41s[i] = ((Class390) this).anInterface41Array5726[i];
		is[i] = ((Class390) this).anIntArray5729[i];
	    }
	    ((Class390) this).anInterface41Array5726 = interface41s;
	    ((Class390) this).anIntArray5729 = is;
	}
    }
    
    float method6970(float f) {
	int i = ((Class390) this).aClass103_Sub3_5728.method2237((byte) 4)
		    .method2655();
	float f_12_
	    = (((f + ((Class390) this).aClass103_Sub3_5728.method15622())
		/ (float) i * 2.0F)
	       - 1.0F);
	return f_12_;
    }
    
    float method6971(float f) {
	int i = ((Class390) this).aClass103_Sub3_5728.method2237((byte) 4)
		    .method2654();
	float f_13_ = ((1.0F - (f + ((Class390) this).aClass103_Sub3_5728
					.method15622()) / (float) i) * 2.0F
		       - 1.0F);
	return f_13_;
    }
    
    void method6972(float f, float f_14_, float f_15_, float f_16_,
		    float f_17_, float f_18_, float f_19_, float f_20_,
		    Interface41 interface41, int i) {
	if ((i & ~0xffffff) != 0) {
	    ((Class390) this).aClass103_Sub3_5728
		.method2260(((Class390) this).anIntArray5725);
	    int i_21_ = ((Class390) this).anIntArray5725[0];
	    int i_22_ = ((Class390) this).anIntArray5725[1];
	    int i_23_ = ((Class390) this).anIntArray5725[2];
	    int i_24_ = ((Class390) this).anIntArray5725[3];
	    if (!(f > (float) i_23_) && !(f_14_ > (float) i_24_)
		&& !(f_15_ < (float) i_21_) && !(f_16_ < (float) i_22_)) {
		float f_25_ = f_15_ - f;
		float f_26_ = f_16_ - f_14_;
		float f_27_ = f_19_ - f_17_;
		float f_28_ = f_20_ - f_18_;
		if (f < (float) i_21_) {
		    f_17_ += ((float) i_21_ - f) / f_25_ * f_27_;
		    f = (float) i_21_;
		}
		if (f_14_ < (float) i_22_) {
		    f_18_ += ((float) i_22_ - f_14_) / f_26_ * f_28_;
		    f_14_ = (float) i_22_;
		}
		if (f_15_ > (float) i_23_) {
		    f_19_ -= (f_15_ - (float) i_23_) / f_25_ * f_27_;
		    f_15_ = (float) i_23_;
		}
		if (f_16_ > (float) i_24_) {
		    f_20_ -= (f_16_ - (float) i_24_) / f_26_ * f_28_;
		    f_16_ = (float) i_24_;
		}
		method6969();
		f = method6970(f);
		f_14_ = method6971(f_14_);
		f_15_ = method6970(f_15_);
		f_16_ = method6971(f_16_);
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 0]
		    = f;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 1]
		    = f_14_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 2]
		    = f_17_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 3]
		    = f_18_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 4]
		    = f_15_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 5]
		    = f_14_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 6]
		    = f_19_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 7]
		    = f_18_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 8]
		    = f;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 9]
		    = f_16_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 10]
		    = f_17_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 11]
		    = f_20_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 12]
		    = f_15_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 13]
		    = f_16_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 14]
		    = f_19_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 15]
		    = f_20_;
		((Class390) this).anInterface41Array5726[(((Class390) this)
							  .anInt5734)]
		    = interface41;
		if ((((Class103_Sub3) ((Class390) this).aClass103_Sub3_5728)
		     .anInt9633)
		    == 1)
		    ((Class390) this).anIntArray5729[(((Class390) this)
						      .anInt5734)]
			= ~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff;
		else
		    ((Class390) this).anIntArray5729[(((Class390) this)
						      .anInt5734)]
			= i;
		((Class390) this).anInt5734++;
		if (((Class390) this).aClass376_5722
		    == Class376.aClass376_5634)
		    method6967();
	    }
	}
    }
    
    void method6973() {
	if (((Class390) this).aClass376_5724 != null) {
	    ((Class390) this).aClass376_5722
		= ((Class390) this).aClass376_5724;
	    ((Class390) this).aClass376_5724 = null;
	}
    }
    
    Class376 method6974() {
	return ((Class390) this).aClass376_5722;
    }
    
    void method6975() {
	((Class390) this).anInterface40_5731.method28();
	((Class390) this).anInterface33_5733.method28();
	((Class390) this).anInterface40_5731 = null;
	((Class390) this).anInterface33_5733 = null;
	((Class390) this).aClass366_5723 = null;
	((Class390) this).anInt5734 = 0;
    }
    
    void method6976() {
	((Class390) this).anInterface40_5731.method28();
	((Class390) this).anInterface33_5733.method28();
	((Class390) this).anInterface40_5731 = null;
	((Class390) this).anInterface33_5733 = null;
	((Class390) this).aClass366_5723 = null;
	((Class390) this).anInt5734 = 0;
    }
    
    void method6977(float f, float f_29_, float f_30_, float f_31_,
		    float f_32_, float f_33_, float f_34_, float f_35_,
		    float f_36_, float f_37_, float f_38_, float f_39_,
		    float f_40_, float f_41_, float f_42_, float f_43_,
		    Interface41 interface41, int i) {
	if ((i & ~0xffffff) != 0) {
	    ((Class390) this).aClass103_Sub3_5728
		.method2260(((Class390) this).anIntArray5725);
	    int i_44_ = ((Class390) this).anIntArray5725[0];
	    int i_45_ = ((Class390) this).anIntArray5725[1];
	    int i_46_ = ((Class390) this).anIntArray5725[2];
	    int i_47_ = ((Class390) this).anIntArray5725[3];
	    int i_48_ = 0;
	    int i_49_ = ((f < (float) i_44_ ? 1 : 0)
			 + (f_30_ < (float) i_44_ ? 1 : 0)
			 + (f_32_ < (float) i_44_ ? 1 : 0)
			 + (f_34_ < (float) i_44_ ? 1 : 0));
	    if (i_49_ != 4) {
		i_48_ |= i_49_;
		i_49_ = ((f > (float) i_46_ ? 1 : 0)
			 + (f_30_ > (float) i_46_ ? 1 : 0)
			 + (f_32_ > (float) i_46_ ? 1 : 0)
			 + (f_34_ > (float) i_46_ ? 1 : 0));
		if (i_49_ != 4) {
		    i_48_ |= i_49_;
		    i_49_ = ((f_29_ < (float) i_45_ ? 1 : 0)
			     + (f_31_ < (float) i_45_ ? 1 : 0)
			     + (f_33_ < (float) i_45_ ? 1 : 0)
			     + (f_35_ < (float) i_45_ ? 1 : 0));
		    if (i_49_ != 4) {
			i_48_ |= i_49_;
			i_49_ = ((f_29_ > (float) i_47_ ? 1 : 0)
				 + (f_31_ > (float) i_47_ ? 1 : 0)
				 + (f_33_ > (float) i_47_ ? 1 : 0)
				 + (f_35_ > (float) i_47_ ? 1 : 0));
			if (i_49_ != 4) {
			    i_48_ |= i_49_;
			    if (i_48_ != 0) {
				method6967();
				((Class390) this).aClass103_Sub3_5728
				    .method2279(true);
				((Class390) this).aClass103_Sub3_5728
				    .method2445(i_44_, i_45_, i_46_, i_47_);
			    }
			    method6969();
			    f = method6970(f);
			    f_29_ = method6971(f_29_);
			    f_30_ = method6970(f_30_);
			    f_31_ = method6971(f_31_);
			    f_32_ = method6970(f_32_);
			    f_33_ = method6971(f_33_);
			    f_34_ = method6970(f_34_);
			    f_35_ = method6971(f_35_);
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 0]
				= f;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 1]
				= f_29_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 2]
				= f_36_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 3]
				= f_37_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 4]
				= f_30_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 5]
				= f_31_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 6]
				= f_38_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 7]
				= f_39_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 8]
				= f_32_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 9]
				= f_33_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 10]
				= f_40_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 11]
				= f_41_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 12]
				= f_34_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 13]
				= f_35_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 14]
				= f_42_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 15]
				= f_43_;
			    ((Class390) this).anInterface41Array5726
				[((Class390) this).anInt5734]
				= interface41;
			    if ((((Class103_Sub3)
				  ((Class390) this).aClass103_Sub3_5728)
				 .anInt9633)
				== 1)
				((Class390) this).anIntArray5729
				    [((Class390) this).anInt5734]
				    = (~0xff00ff & i | (i & 0xff) << 16
				       | i >> 16 & 0xff);
			    else
				((Class390) this).anIntArray5729
				    [((Class390) this).anInt5734]
				    = i;
			    ((Class390) this).anInt5734++;
			    if ((((Class390) this).aClass376_5722
				 == Class376.aClass376_5634)
				|| i_48_ > 0)
				method6967();
			    if (i_48_ != 0) {
				((Class390) this).aClass103_Sub3_5728
				    .method2279(false);
				((Class390) this).aClass103_Sub3_5728
				    .method2572();
				((Class390) this).aClass103_Sub3_5728
				    .method2445(i_44_, i_45_, i_46_, i_47_);
			    }
			}
		    }
		}
	    }
	}
    }
    
    void method6978() {
	if (((Class390) this).anInt5734 == ((Class390) this).anInt5732) {
	    ((Class390) this).anInt5732 *= 2;
	    float[] fs = new float[((Class390) this).anInt5732 * 16];
	    for (int i = 0; i < ((Class390) this).anInt5734 * 16; i++)
		fs[i] = ((Class390) this).aFloatArray5727[i];
	    ((Class390) this).aFloatArray5727 = fs;
	    Interface41[] interface41s
		= new Interface41[((Class390) this).anInt5732];
	    int[] is = new int[((Class390) this).anInt5732];
	    for (int i = 0; i < ((Class390) this).anInt5734; i++) {
		interface41s[i] = ((Class390) this).anInterface41Array5726[i];
		is[i] = ((Class390) this).anIntArray5729[i];
	    }
	    ((Class390) this).anInterface41Array5726 = interface41s;
	    ((Class390) this).anIntArray5729 = is;
	}
    }
    
    void method6979(float f, float f_50_, float f_51_, float f_52_,
		    float f_53_, float f_54_, float f_55_, float f_56_,
		    Interface41 interface41, int i) {
	if ((i & ~0xffffff) != 0) {
	    ((Class390) this).aClass103_Sub3_5728
		.method2260(((Class390) this).anIntArray5725);
	    int i_57_ = ((Class390) this).anIntArray5725[0];
	    int i_58_ = ((Class390) this).anIntArray5725[1];
	    int i_59_ = ((Class390) this).anIntArray5725[2];
	    int i_60_ = ((Class390) this).anIntArray5725[3];
	    if (!(f > (float) i_59_) && !(f_50_ > (float) i_60_)
		&& !(f_51_ < (float) i_57_) && !(f_52_ < (float) i_58_)) {
		float f_61_ = f_51_ - f;
		float f_62_ = f_52_ - f_50_;
		float f_63_ = f_55_ - f_53_;
		float f_64_ = f_56_ - f_54_;
		if (f < (float) i_57_) {
		    f_53_ += ((float) i_57_ - f) / f_61_ * f_63_;
		    f = (float) i_57_;
		}
		if (f_50_ < (float) i_58_) {
		    f_54_ += ((float) i_58_ - f_50_) / f_62_ * f_64_;
		    f_50_ = (float) i_58_;
		}
		if (f_51_ > (float) i_59_) {
		    f_55_ -= (f_51_ - (float) i_59_) / f_61_ * f_63_;
		    f_51_ = (float) i_59_;
		}
		if (f_52_ > (float) i_60_) {
		    f_56_ -= (f_52_ - (float) i_60_) / f_62_ * f_64_;
		    f_52_ = (float) i_60_;
		}
		method6969();
		f = method6970(f);
		f_50_ = method6971(f_50_);
		f_51_ = method6970(f_51_);
		f_52_ = method6971(f_52_);
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 0]
		    = f;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 1]
		    = f_50_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 2]
		    = f_53_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 3]
		    = f_54_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 4]
		    = f_51_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 5]
		    = f_50_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 6]
		    = f_55_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 7]
		    = f_54_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 8]
		    = f;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 9]
		    = f_52_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 10]
		    = f_53_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 11]
		    = f_56_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 12]
		    = f_51_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 13]
		    = f_52_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 14]
		    = f_55_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 15]
		    = f_56_;
		((Class390) this).anInterface41Array5726[(((Class390) this)
							  .anInt5734)]
		    = interface41;
		if ((((Class103_Sub3) ((Class390) this).aClass103_Sub3_5728)
		     .anInt9633)
		    == 1)
		    ((Class390) this).anIntArray5729[(((Class390) this)
						      .anInt5734)]
			= ~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff;
		else
		    ((Class390) this).anIntArray5729[(((Class390) this)
						      .anInt5734)]
			= i;
		((Class390) this).anInt5734++;
		if (((Class390) this).aClass376_5722
		    == Class376.aClass376_5634)
		    method6967();
	    }
	}
    }
    
    void method6980(float f, float f_65_, float f_66_, float f_67_,
		    float f_68_, float f_69_, float f_70_, float f_71_,
		    Interface41 interface41, int i) {
	if ((i & ~0xffffff) != 0) {
	    ((Class390) this).aClass103_Sub3_5728
		.method2260(((Class390) this).anIntArray5725);
	    int i_72_ = ((Class390) this).anIntArray5725[0];
	    int i_73_ = ((Class390) this).anIntArray5725[1];
	    int i_74_ = ((Class390) this).anIntArray5725[2];
	    int i_75_ = ((Class390) this).anIntArray5725[3];
	    if (!(f > (float) i_74_) && !(f_65_ > (float) i_75_)
		&& !(f_66_ < (float) i_72_) && !(f_67_ < (float) i_73_)) {
		float f_76_ = f_66_ - f;
		float f_77_ = f_67_ - f_65_;
		float f_78_ = f_70_ - f_68_;
		float f_79_ = f_71_ - f_69_;
		if (f < (float) i_72_) {
		    f_68_ += ((float) i_72_ - f) / f_76_ * f_78_;
		    f = (float) i_72_;
		}
		if (f_65_ < (float) i_73_) {
		    f_69_ += ((float) i_73_ - f_65_) / f_77_ * f_79_;
		    f_65_ = (float) i_73_;
		}
		if (f_66_ > (float) i_74_) {
		    f_70_ -= (f_66_ - (float) i_74_) / f_76_ * f_78_;
		    f_66_ = (float) i_74_;
		}
		if (f_67_ > (float) i_75_) {
		    f_71_ -= (f_67_ - (float) i_75_) / f_77_ * f_79_;
		    f_67_ = (float) i_75_;
		}
		method6969();
		f = method6970(f);
		f_65_ = method6971(f_65_);
		f_66_ = method6970(f_66_);
		f_67_ = method6971(f_67_);
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 0]
		    = f;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 1]
		    = f_65_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 2]
		    = f_68_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 3]
		    = f_69_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 4]
		    = f_66_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 5]
		    = f_65_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 6]
		    = f_70_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 7]
		    = f_69_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 8]
		    = f;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 9]
		    = f_67_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 10]
		    = f_68_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 11]
		    = f_71_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 12]
		    = f_66_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 13]
		    = f_67_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 14]
		    = f_70_;
		((Class390) this).aFloatArray5727
		    [((Class390) this).anInt5734 * 16 + 15]
		    = f_71_;
		((Class390) this).anInterface41Array5726[(((Class390) this)
							  .anInt5734)]
		    = interface41;
		if ((((Class103_Sub3) ((Class390) this).aClass103_Sub3_5728)
		     .anInt9633)
		    == 1)
		    ((Class390) this).anIntArray5729[(((Class390) this)
						      .anInt5734)]
			= ~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff;
		else
		    ((Class390) this).anIntArray5729[(((Class390) this)
						      .anInt5734)]
			= i;
		((Class390) this).anInt5734++;
		if (((Class390) this).aClass376_5722
		    == Class376.aClass376_5634)
		    method6967();
	    }
	}
    }
    
    void method6981(float f, float f_80_, float f_81_, float f_82_,
		    float f_83_, float f_84_, float f_85_, float f_86_,
		    float f_87_, float f_88_, float f_89_, float f_90_,
		    float f_91_, float f_92_, float f_93_, float f_94_,
		    Interface41 interface41, int i) {
	if ((i & ~0xffffff) != 0) {
	    ((Class390) this).aClass103_Sub3_5728
		.method2260(((Class390) this).anIntArray5725);
	    int i_95_ = ((Class390) this).anIntArray5725[0];
	    int i_96_ = ((Class390) this).anIntArray5725[1];
	    int i_97_ = ((Class390) this).anIntArray5725[2];
	    int i_98_ = ((Class390) this).anIntArray5725[3];
	    int i_99_ = 0;
	    int i_100_ = ((f < (float) i_95_ ? 1 : 0)
			  + (f_81_ < (float) i_95_ ? 1 : 0)
			  + (f_83_ < (float) i_95_ ? 1 : 0)
			  + (f_85_ < (float) i_95_ ? 1 : 0));
	    if (i_100_ != 4) {
		i_99_ |= i_100_;
		i_100_ = ((f > (float) i_97_ ? 1 : 0)
			  + (f_81_ > (float) i_97_ ? 1 : 0)
			  + (f_83_ > (float) i_97_ ? 1 : 0)
			  + (f_85_ > (float) i_97_ ? 1 : 0));
		if (i_100_ != 4) {
		    i_99_ |= i_100_;
		    i_100_ = ((f_80_ < (float) i_96_ ? 1 : 0)
			      + (f_82_ < (float) i_96_ ? 1 : 0)
			      + (f_84_ < (float) i_96_ ? 1 : 0)
			      + (f_86_ < (float) i_96_ ? 1 : 0));
		    if (i_100_ != 4) {
			i_99_ |= i_100_;
			i_100_ = ((f_80_ > (float) i_98_ ? 1 : 0)
				  + (f_82_ > (float) i_98_ ? 1 : 0)
				  + (f_84_ > (float) i_98_ ? 1 : 0)
				  + (f_86_ > (float) i_98_ ? 1 : 0));
			if (i_100_ != 4) {
			    i_99_ |= i_100_;
			    if (i_99_ != 0) {
				method6967();
				((Class390) this).aClass103_Sub3_5728
				    .method2279(true);
				((Class390) this).aClass103_Sub3_5728
				    .method2445(i_95_, i_96_, i_97_, i_98_);
			    }
			    method6969();
			    f = method6970(f);
			    f_80_ = method6971(f_80_);
			    f_81_ = method6970(f_81_);
			    f_82_ = method6971(f_82_);
			    f_83_ = method6970(f_83_);
			    f_84_ = method6971(f_84_);
			    f_85_ = method6970(f_85_);
			    f_86_ = method6971(f_86_);
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 0]
				= f;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 1]
				= f_80_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 2]
				= f_87_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 3]
				= f_88_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 4]
				= f_81_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 5]
				= f_82_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 6]
				= f_89_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 7]
				= f_90_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 8]
				= f_83_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 9]
				= f_84_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 10]
				= f_91_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 11]
				= f_92_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 12]
				= f_85_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 13]
				= f_86_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 14]
				= f_93_;
			    ((Class390) this).aFloatArray5727
				[((Class390) this).anInt5734 * 16 + 15]
				= f_94_;
			    ((Class390) this).anInterface41Array5726
				[((Class390) this).anInt5734]
				= interface41;
			    if ((((Class103_Sub3)
				  ((Class390) this).aClass103_Sub3_5728)
				 .anInt9633)
				== 1)
				((Class390) this).anIntArray5729
				    [((Class390) this).anInt5734]
				    = (~0xff00ff & i | (i & 0xff) << 16
				       | i >> 16 & 0xff);
			    else
				((Class390) this).anIntArray5729
				    [((Class390) this).anInt5734]
				    = i;
			    ((Class390) this).anInt5734++;
			    if ((((Class390) this).aClass376_5722
				 == Class376.aClass376_5634)
				|| i_99_ > 0)
				method6967();
			    if (i_99_ != 0) {
				((Class390) this).aClass103_Sub3_5728
				    .method2279(false);
				((Class390) this).aClass103_Sub3_5728
				    .method2572();
				((Class390) this).aClass103_Sub3_5728
				    .method2445(i_95_, i_96_, i_97_, i_98_);
			    }
			}
		    }
		}
	    }
	}
    }
    
    void method6982() {
	((Class390) this).aClass376_5724 = ((Class390) this).aClass376_5722;
	((Class390) this).aClass376_5722 = Class376.aClass376_5635;
    }
    
    Class376 method6983() {
	return ((Class390) this).aClass376_5722;
    }
    
    float method6984(float f) {
	int i = ((Class390) this).aClass103_Sub3_5728.method2237((byte) 4)
		    .method2655();
	float f_101_
	    = (((f + ((Class390) this).aClass103_Sub3_5728.method15622())
		/ (float) i * 2.0F)
	       - 1.0F);
	return f_101_;
    }
    
    float method6985(float f) {
	int i = ((Class390) this).aClass103_Sub3_5728.method2237((byte) 4)
		    .method2655();
	float f_102_
	    = (((f + ((Class390) this).aClass103_Sub3_5728.method15622())
		/ (float) i * 2.0F)
	       - 1.0F);
	return f_102_;
    }
    
    float method6986(float f) {
	int i = ((Class390) this).aClass103_Sub3_5728.method2237((byte) 4)
		    .method2654();
	float f_103_ = ((1.0F - (f + ((Class390) this).aClass103_Sub3_5728
					 .method15622()) / (float) i) * 2.0F
			- 1.0F);
	return f_103_;
    }
    
    void method6987() {
	((Class390) this).aClass376_5724 = ((Class390) this).aClass376_5722;
	((Class390) this).aClass376_5722 = Class376.aClass376_5635;
    }
    
    void method6988() {
	((Class390) this).aClass376_5724 = ((Class390) this).aClass376_5722;
	((Class390) this).aClass376_5722 = Class376.aClass376_5635;
    }
    
    Class376 method6989() {
	return ((Class390) this).aClass376_5722;
    }
    
    void method6990() {
	if (((Class390) this).aClass376_5724 != null) {
	    ((Class390) this).aClass376_5722
		= ((Class390) this).aClass376_5724;
	    ((Class390) this).aClass376_5724 = null;
	}
    }
    
    void method6991() {
	if (((Class390) this).anInt5734 != 0) {
	    ((Class390) this).aClass103_Sub3_5728.method15727();
	    ((Class390) this).aClass103_Sub3_5728.method15640(1);
	    ((Class390) this).aClass103_Sub3_5728
		.method15718(((Class390) this).anInterface33_5733);
	    ((Class390) this).aClass103_Sub3_5728
		.method15955(0, ((Class390) this).anInterface40_5731);
	    ((Class390) this).aClass103_Sub3_5728
		.method15716(((Class390) this).aClass366_5723);
	    Class66 class66
		= (((Class103_Sub3) ((Class390) this).aClass103_Sub3_5728)
		   .aClass66_9594);
	    Unsafe unsafe = ((Class390) this).aClass103_Sub3_5728.anUnsafe9493;
	    ByteBuffer bytebuffer
		= ((Class390) this).aClass103_Sub3_5728.aByteBuffer9490;
	    bytebuffer.clear();
	    ((Class390) this).aClass103_Sub3_5728.method15743()
		.method5199(Class268.aClass268_4354);
	    ((Class390) this).aClass103_Sub3_5728
		.method15696(Class387.aClass387_5712);
	    int i = ((((Class390) this).anInt5734 + ((Class390) this).anInt5730
		      - 1)
		     / ((Class390) this).anInt5730);
	    int i_104_ = 0;
	    int i_105_ = 0;
	    for (int i_106_ = 0; i_106_ < i; i_106_++) {
		int i_107_ = Math.min(((Class390) this).anInt5730,
				      ((Class390) this).anInt5734 - i_104_);
		long l = ((Class390) this).anInterface40_5731
			     .method262(0, i_107_ * 96);
		int i_108_ = i_106_ * ((Class390) this).anInt5730 + i_107_;
		for (int i_109_ = i_104_; i_109_ < i_108_; i_109_++) {
		    for (int i_110_ = 0; i_110_ < 4; i_110_++) {
			unsafe.putFloat(l, (((Class390) this).aFloatArray5727
					    [i_105_++]));
			l += 4L;
			unsafe.putFloat(l, (((Class390) this).aFloatArray5727
					    [i_105_++]));
			l += 4L;
			unsafe.putFloat(l, 0.0F);
			l += 4L;
			unsafe.putFloat(l, (((Class390) this).aFloatArray5727
					    [i_105_++]));
			l += 4L;
			unsafe.putFloat(l, (((Class390) this).aFloatArray5727
					    [i_105_++]));
			l += 4L;
			unsafe.putInt(l, (((Class390) this).anIntArray5729
					  [i_109_]));
			l += 4L;
		    }
		}
		((Class390) this).anInterface40_5731.method192();
		Interface41 interface41
		    = ((Class390) this).anInterface41Array5726[i_104_];
		int i_111_ = 1;
		int i_112_ = 0;
		for (int i_113_ = i_104_ + 1; i_113_ < i_108_; i_113_++) {
		    if (interface41
			== ((Class390) this).anInterface41Array5726[i_113_])
			i_111_++;
		    else {
			class66.anInterface41_1050 = interface41;
			class66.method1641();
			((Class390) this).aClass103_Sub3_5728.method15757
			    (((Class390) this).anInterface33_5733,
			     Class310.aClass310_4822, i_112_ * 4, i_111_ * 4,
			     i_112_ * 6, i_111_ * 2);
			interface41
			    = ((Class390) this).anInterface41Array5726[i_113_];
			i_111_ = 1;
			i_112_ = i_113_ - i_104_;
		    }
		}
		class66.anInterface41_1050 = interface41;
		class66.method1641();
		((Class390) this).aClass103_Sub3_5728.method15757
		    (((Class390) this).anInterface33_5733,
		     Class310.aClass310_4822, i_112_ * 4, i_111_ * 4,
		     i_112_ * 6, i_111_ * 2);
		i_104_ += ((Class390) this).anInt5730;
	    }
	    ((Class390) this).anInt5734 = 0;
	}
    }
    
    Class376 method6992() {
	return ((Class390) this).aClass376_5722;
    }
    
    void method6993() {
	if (((Class390) this).anInt5734 != 0) {
	    ((Class390) this).aClass103_Sub3_5728.method15727();
	    ((Class390) this).aClass103_Sub3_5728.method15640(1);
	    ((Class390) this).aClass103_Sub3_5728
		.method15718(((Class390) this).anInterface33_5733);
	    ((Class390) this).aClass103_Sub3_5728
		.method15955(0, ((Class390) this).anInterface40_5731);
	    ((Class390) this).aClass103_Sub3_5728
		.method15716(((Class390) this).aClass366_5723);
	    Class66 class66
		= (((Class103_Sub3) ((Class390) this).aClass103_Sub3_5728)
		   .aClass66_9594);
	    Unsafe unsafe = ((Class390) this).aClass103_Sub3_5728.anUnsafe9493;
	    ByteBuffer bytebuffer
		= ((Class390) this).aClass103_Sub3_5728.aByteBuffer9490;
	    bytebuffer.clear();
	    ((Class390) this).aClass103_Sub3_5728.method15743()
		.method5199(Class268.aClass268_4354);
	    ((Class390) this).aClass103_Sub3_5728
		.method15696(Class387.aClass387_5712);
	    int i = ((((Class390) this).anInt5734 + ((Class390) this).anInt5730
		      - 1)
		     / ((Class390) this).anInt5730);
	    int i_114_ = 0;
	    int i_115_ = 0;
	    for (int i_116_ = 0; i_116_ < i; i_116_++) {
		int i_117_ = Math.min(((Class390) this).anInt5730,
				      ((Class390) this).anInt5734 - i_114_);
		long l = ((Class390) this).anInterface40_5731
			     .method262(0, i_117_ * 96);
		int i_118_ = i_116_ * ((Class390) this).anInt5730 + i_117_;
		for (int i_119_ = i_114_; i_119_ < i_118_; i_119_++) {
		    for (int i_120_ = 0; i_120_ < 4; i_120_++) {
			unsafe.putFloat(l, (((Class390) this).aFloatArray5727
					    [i_115_++]));
			l += 4L;
			unsafe.putFloat(l, (((Class390) this).aFloatArray5727
					    [i_115_++]));
			l += 4L;
			unsafe.putFloat(l, 0.0F);
			l += 4L;
			unsafe.putFloat(l, (((Class390) this).aFloatArray5727
					    [i_115_++]));
			l += 4L;
			unsafe.putFloat(l, (((Class390) this).aFloatArray5727
					    [i_115_++]));
			l += 4L;
			unsafe.putInt(l, (((Class390) this).anIntArray5729
					  [i_119_]));
			l += 4L;
		    }
		}
		((Class390) this).anInterface40_5731.method192();
		Interface41 interface41
		    = ((Class390) this).anInterface41Array5726[i_114_];
		int i_121_ = 1;
		int i_122_ = 0;
		for (int i_123_ = i_114_ + 1; i_123_ < i_118_; i_123_++) {
		    if (interface41
			== ((Class390) this).anInterface41Array5726[i_123_])
			i_121_++;
		    else {
			class66.anInterface41_1050 = interface41;
			class66.method1641();
			((Class390) this).aClass103_Sub3_5728.method15757
			    (((Class390) this).anInterface33_5733,
			     Class310.aClass310_4822, i_122_ * 4, i_121_ * 4,
			     i_122_ * 6, i_121_ * 2);
			interface41
			    = ((Class390) this).anInterface41Array5726[i_123_];
			i_121_ = 1;
			i_122_ = i_123_ - i_114_;
		    }
		}
		class66.anInterface41_1050 = interface41;
		class66.method1641();
		((Class390) this).aClass103_Sub3_5728.method15757
		    (((Class390) this).anInterface33_5733,
		     Class310.aClass310_4822, i_122_ * 4, i_121_ * 4,
		     i_122_ * 6, i_121_ * 2);
		i_114_ += ((Class390) this).anInt5730;
	    }
	    ((Class390) this).anInt5734 = 0;
	}
    }
    
    Class376 method6994() {
	return ((Class390) this).aClass376_5722;
    }
    
    void method6995() {
	if (((Class390) this).aClass376_5724 != null) {
	    ((Class390) this).aClass376_5722
		= ((Class390) this).aClass376_5724;
	    ((Class390) this).aClass376_5724 = null;
	}
    }
}
