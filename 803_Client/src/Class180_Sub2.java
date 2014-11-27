/* Class180_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class180_Sub2 extends Class180
{
    Class142 aClass142_9661;
    Class103_Sub1 aClass103_Sub1_9662;
    
    Class180_Sub2(Class103_Sub1 class103_sub1, int[] is) {
	((Class180_Sub2) this).aClass103_Sub1_9662 = class103_sub1;
	if (((Class103_Sub1) ((Class180_Sub2) this).aClass103_Sub1_9662)
	    .aBool9208) {
	    byte[] is_0_ = method16029(is);
	    ((Class180_Sub2) this).aClass142_9661
		= new Class142_Sub3(((Class180_Sub2) this).aClass103_Sub1_9662,
				    Class175.aClass175_2110,
				    Class102.aClass102_1440, 16, 16, 16, is_0_,
				    Class175.aClass175_2110);
	} else
	    ((Class180_Sub2) this).aClass142_9661
		= new Class142_Sub4(((Class180_Sub2) this).aClass103_Sub1_9662,
				    3553, 256, 16, false, is, 256, 0, false);
    }
    
    byte[] method16028(int[] is) {
	byte[] is_1_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_2_ = 0; i_2_ < 16; i_2_++) {
		for (int i_3_ = 0; i_3_ < 16; i_3_++) {
		    int i_4_ = is[256 * i_2_ + 16 * i_3_ + i];
		    int i_5_ = (i_3_ * 256 + i_2_ * 16 + i) * 4;
		    is_1_[i_5_ + 0] = (byte) (i_4_ >> 16 & 0xff);
		    is_1_[i_5_ + 1] = (byte) (i_4_ >> 8 & 0xff);
		    is_1_[i_5_ + 2] = (byte) (i_4_ & 0xff);
		    is_1_[i_5_ + 3] = (byte) -1;
		}
	    }
	}
	return is_1_;
    }
    
    byte[] method16029(int[] is) {
	byte[] is_6_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_7_ = 0; i_7_ < 16; i_7_++) {
		for (int i_8_ = 0; i_8_ < 16; i_8_++) {
		    int i_9_ = is[256 * i_7_ + 16 * i_8_ + i];
		    int i_10_ = (i_8_ * 256 + i_7_ * 16 + i) * 4;
		    is_6_[i_10_ + 0] = (byte) (i_9_ >> 16 & 0xff);
		    is_6_[i_10_ + 1] = (byte) (i_9_ >> 8 & 0xff);
		    is_6_[i_10_ + 2] = (byte) (i_9_ & 0xff);
		    is_6_[i_10_ + 3] = (byte) -1;
		}
	    }
	}
	return is_6_;
    }
    
    byte[] method16030(int[] is) {
	byte[] is_11_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_12_ = 0; i_12_ < 16; i_12_++) {
		for (int i_13_ = 0; i_13_ < 16; i_13_++) {
		    int i_14_ = is[256 * i_12_ + 16 * i_13_ + i];
		    int i_15_ = (i_13_ * 256 + i_12_ * 16 + i) * 4;
		    is_11_[i_15_ + 0] = (byte) (i_14_ >> 16 & 0xff);
		    is_11_[i_15_ + 1] = (byte) (i_14_ >> 8 & 0xff);
		    is_11_[i_15_ + 2] = (byte) (i_14_ & 0xff);
		    is_11_[i_15_ + 3] = (byte) -1;
		}
	    }
	}
	return is_11_;
    }
    
    byte[] method16031(int[] is) {
	byte[] is_16_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_17_ = 0; i_17_ < 16; i_17_++) {
		for (int i_18_ = 0; i_18_ < 16; i_18_++) {
		    int i_19_ = is[256 * i_17_ + 16 * i_18_ + i];
		    int i_20_ = (i_18_ * 256 + i_17_ * 16 + i) * 4;
		    is_16_[i_20_ + 0] = (byte) (i_19_ >> 16 & 0xff);
		    is_16_[i_20_ + 1] = (byte) (i_19_ >> 8 & 0xff);
		    is_16_[i_20_ + 2] = (byte) (i_19_ & 0xff);
		    is_16_[i_20_ + 3] = (byte) -1;
		}
	    }
	}
	return is_16_;
    }
    
    byte[] method16032(int[] is) {
	byte[] is_21_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_22_ = 0; i_22_ < 16; i_22_++) {
		for (int i_23_ = 0; i_23_ < 16; i_23_++) {
		    int i_24_ = is[256 * i_22_ + 16 * i_23_ + i];
		    int i_25_ = (i_23_ * 256 + i_22_ * 16 + i) * 4;
		    is_21_[i_25_ + 0] = (byte) (i_24_ >> 16 & 0xff);
		    is_21_[i_25_ + 1] = (byte) (i_24_ >> 8 & 0xff);
		    is_21_[i_25_ + 2] = (byte) (i_24_ & 0xff);
		    is_21_[i_25_ + 3] = (byte) -1;
		}
	    }
	}
	return is_21_;
    }
    
    Class142 method16033() {
	return ((Class180_Sub2) this).aClass142_9661;
    }
}
