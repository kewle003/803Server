/* Class180_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class180_Sub1 extends Class180
{
    Class103_Sub3 aClass103_Sub3_9033;
    Interface31 anInterface31_9034;
    
    byte[] method15113(int[] is) {
	byte[] is_0_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_1_ = 0; i_1_ < 16; i_1_++) {
		for (int i_2_ = 0; i_2_ < 16; i_2_++) {
		    int i_3_ = is[256 * i_1_ + 16 * i_2_ + i];
		    int i_4_ = (i_2_ * 256 + i_1_ * 16 + i) * 4;
		    if (((Class103_Sub3)
			 ((Class180_Sub1) this).aClass103_Sub3_9033).anInt9633
			== 0) {
			is_0_[i_4_ + 0] = (byte) (i_3_ & 0xff);
			is_0_[i_4_ + 1] = (byte) (i_3_ >> 8 & 0xff);
			is_0_[i_4_ + 2] = (byte) (i_3_ >> 16 & 0xff);
			is_0_[i_4_ + 3] = (byte) -1;
		    } else {
			is_0_[i_4_ + 0] = (byte) (i_3_ >> 16 & 0xff);
			is_0_[i_4_ + 1] = (byte) (i_3_ >> 8 & 0xff);
			is_0_[i_4_ + 2] = (byte) (i_3_ & 0xff);
			is_0_[i_4_ + 3] = (byte) -1;
		    }
		}
	    }
	}
	return is_0_;
    }
    
    byte[] method15114(int[] is) {
	byte[] is_5_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_6_ = 0; i_6_ < 16; i_6_++) {
		for (int i_7_ = 0; i_7_ < 16; i_7_++) {
		    int i_8_ = is[256 * i_6_ + 16 * i_7_ + i];
		    int i_9_ = (i_7_ * 256 + i_6_ * 16 + i) * 4;
		    if (((Class103_Sub3)
			 ((Class180_Sub1) this).aClass103_Sub3_9033).anInt9633
			== 0) {
			is_5_[i_9_ + 0] = (byte) (i_8_ & 0xff);
			is_5_[i_9_ + 1] = (byte) (i_8_ >> 8 & 0xff);
			is_5_[i_9_ + 2] = (byte) (i_8_ >> 16 & 0xff);
			is_5_[i_9_ + 3] = (byte) -1;
		    } else {
			is_5_[i_9_ + 0] = (byte) (i_8_ >> 16 & 0xff);
			is_5_[i_9_ + 1] = (byte) (i_8_ >> 8 & 0xff);
			is_5_[i_9_ + 2] = (byte) (i_8_ & 0xff);
			is_5_[i_9_ + 3] = (byte) -1;
		    }
		}
	    }
	}
	return is_5_;
    }
    
    public Interface31 method15115() {
	return ((Class180_Sub1) this).anInterface31_9034;
    }
    
    public Interface31 method15116() {
	return ((Class180_Sub1) this).anInterface31_9034;
    }
    
    Class180_Sub1(Class103_Sub3 class103_sub3, int[] is) {
	((Class180_Sub1) this).aClass103_Sub3_9033 = class103_sub3;
	if (((Class180_Sub1) this).aClass103_Sub3_9033.aBool9636) {
	    byte[] is_10_ = method15120(is);
	    ((Class180_Sub1) this).anInterface31_9034
		= (((Class180_Sub1) this).aClass103_Sub3_9033.method15990
		   (Class175.aClass175_2110, 16, 16, 16, false, is_10_));
	} else
	    ((Class180_Sub1) this).anInterface31_9034
		= ((Class180_Sub1) this).aClass103_Sub3_9033
		      .method15828(256, 16, false, is);
    }
    
    public Interface31 method15117() {
	return ((Class180_Sub1) this).anInterface31_9034;
    }
    
    public Interface31 method15118() {
	return ((Class180_Sub1) this).anInterface31_9034;
    }
    
    public Interface31 method15119() {
	return ((Class180_Sub1) this).anInterface31_9034;
    }
    
    byte[] method15120(int[] is) {
	byte[] is_11_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_12_ = 0; i_12_ < 16; i_12_++) {
		for (int i_13_ = 0; i_13_ < 16; i_13_++) {
		    int i_14_ = is[256 * i_12_ + 16 * i_13_ + i];
		    int i_15_ = (i_13_ * 256 + i_12_ * 16 + i) * 4;
		    if (((Class103_Sub3)
			 ((Class180_Sub1) this).aClass103_Sub3_9033).anInt9633
			== 0) {
			is_11_[i_15_ + 0] = (byte) (i_14_ & 0xff);
			is_11_[i_15_ + 1] = (byte) (i_14_ >> 8 & 0xff);
			is_11_[i_15_ + 2] = (byte) (i_14_ >> 16 & 0xff);
			is_11_[i_15_ + 3] = (byte) -1;
		    } else {
			is_11_[i_15_ + 0] = (byte) (i_14_ >> 16 & 0xff);
			is_11_[i_15_ + 1] = (byte) (i_14_ >> 8 & 0xff);
			is_11_[i_15_ + 2] = (byte) (i_14_ & 0xff);
			is_11_[i_15_ + 3] = (byte) -1;
		    }
		}
	    }
	}
	return is_11_;
    }
    
    byte[] method15121(int[] is) {
	byte[] is_16_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_17_ = 0; i_17_ < 16; i_17_++) {
		for (int i_18_ = 0; i_18_ < 16; i_18_++) {
		    int i_19_ = is[256 * i_17_ + 16 * i_18_ + i];
		    int i_20_ = (i_18_ * 256 + i_17_ * 16 + i) * 4;
		    if (((Class103_Sub3)
			 ((Class180_Sub1) this).aClass103_Sub3_9033).anInt9633
			== 0) {
			is_16_[i_20_ + 0] = (byte) (i_19_ & 0xff);
			is_16_[i_20_ + 1] = (byte) (i_19_ >> 8 & 0xff);
			is_16_[i_20_ + 2] = (byte) (i_19_ >> 16 & 0xff);
			is_16_[i_20_ + 3] = (byte) -1;
		    } else {
			is_16_[i_20_ + 0] = (byte) (i_19_ >> 16 & 0xff);
			is_16_[i_20_ + 1] = (byte) (i_19_ >> 8 & 0xff);
			is_16_[i_20_ + 2] = (byte) (i_19_ & 0xff);
			is_16_[i_20_ + 3] = (byte) -1;
		    }
		}
	    }
	}
	return is_16_;
    }
    
    public Interface31 method15122() {
	return ((Class180_Sub1) this).anInterface31_9034;
    }
}
