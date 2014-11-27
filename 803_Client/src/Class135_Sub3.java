/* Class135_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class135_Sub3 extends Class135
{
    Class142_Sub4_Sub1 aClass142_Sub4_Sub1_10030;
    
    static Class135_Sub3 method16286(Class103_Sub1 class103_sub1, int i,
				     int i_0_, int[] is, int[] is_1_) {
	byte[] is_2_ = new byte[i * i_0_];
	for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
	    int i_4_ = i_3_ * i + is[i_3_];
	    for (int i_5_ = 0; i_5_ < is_1_[i_3_]; i_5_++)
		is_2_[i_4_++] = (byte) -1;
	}
	return new Class135_Sub3(class103_sub1, i, i_0_, is_2_);
    }
    
    Class135_Sub3(Class103_Sub1 class103_sub1, int i, int i_6_, byte[] is) {
	((Class135_Sub3) this).aClass142_Sub4_Sub1_10030
	    = Class142_Sub4_Sub1.method16946(class103_sub1,
					     Class175.aClass175_2112,
					     Class102.aClass102_1440, i, i_6_,
					     false, is,
					     Class175.aClass175_2112);
	((Class135_Sub3) this).aClass142_Sub4_Sub1_10030.method16906(false,
								     false);
    }
    
    static Class135_Sub3 method16287(Class103_Sub1 class103_sub1, int i,
				     int i_7_, int[] is, int[] is_8_) {
	byte[] is_9_ = new byte[i * i_7_];
	for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
	    int i_11_ = i_10_ * i + is[i_10_];
	    for (int i_12_ = 0; i_12_ < is_8_[i_10_]; i_12_++)
		is_9_[i_11_++] = (byte) -1;
	}
	return new Class135_Sub3(class103_sub1, i, i_7_, is_9_);
    }
}
