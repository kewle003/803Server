/* Class347_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class347_Sub1_Sub1 extends Class347_Sub1
{
    byte[] aByteArray11045;
    
    void method16518(int i, byte i_0_) {
	int i_1_ = i * 2;
	i_0_ = (byte) (127 + ((i_0_ & 0xff) >> 1));
	((Class347_Sub1_Sub1) this).aByteArray11045[i_1_++] = i_0_;
	((Class347_Sub1_Sub1) this).aByteArray11045[i_1_] = i_0_;
    }
    
    byte[] method17440(int i, int i_2_, int i_3_) {
	((Class347_Sub1_Sub1) this).aByteArray11045
	    = new byte[i * i_2_ * i_3_ * 2];
	method6183(i, i_2_, i_3_);
	return ((Class347_Sub1_Sub1) this).aByteArray11045;
    }
    
    void method16519(int i, byte i_4_) {
	int i_5_ = i * 2;
	i_4_ = (byte) (127 + ((i_4_ & 0xff) >> 1));
	((Class347_Sub1_Sub1) this).aByteArray11045[i_5_++] = i_4_;
	((Class347_Sub1_Sub1) this).aByteArray11045[i_5_] = i_4_;
    }
    
    Class347_Sub1_Sub1() {
	super(12, 5, 16, 2, 2, 0.45F);
    }
    
    void method16517(int i, byte i_6_) {
	int i_7_ = i * 2;
	i_6_ = (byte) (127 + ((i_6_ & 0xff) >> 1));
	((Class347_Sub1_Sub1) this).aByteArray11045[i_7_++] = i_6_;
	((Class347_Sub1_Sub1) this).aByteArray11045[i_7_] = i_6_;
    }
    
    byte[] method17441(int i, int i_8_, int i_9_) {
	((Class347_Sub1_Sub1) this).aByteArray11045
	    = new byte[i * i_8_ * i_9_ * 2];
	method6183(i, i_8_, i_9_);
	return ((Class347_Sub1_Sub1) this).aByteArray11045;
    }
    
    byte[] method17442(int i, int i_10_, int i_11_) {
	((Class347_Sub1_Sub1) this).aByteArray11045
	    = new byte[i * i_10_ * i_11_ * 2];
	method6183(i, i_10_, i_11_);
	return ((Class347_Sub1_Sub1) this).aByteArray11045;
    }
}
