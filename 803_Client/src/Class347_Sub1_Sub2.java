/* Class347_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class347_Sub1_Sub2 extends Class347_Sub1
{
    byte[] aByteArray11115;
    
    void method16517(int i, byte i_0_) {
	int i_1_ = i * 2;
	i_0_ = (byte) (127 + ((i_0_ & 0xff) >> 1));
	((Class347_Sub1_Sub2) this).aByteArray11115[i_1_++] = i_0_;
	((Class347_Sub1_Sub2) this).aByteArray11115[i_1_] = i_0_;
    }
    
    Class347_Sub1_Sub2() {
	super(12, 5, 16, 2, 2, 0.45F);
    }
    
    void method16519(int i, byte i_2_) {
	int i_3_ = i * 2;
	i_2_ = (byte) (127 + ((i_2_ & 0xff) >> 1));
	((Class347_Sub1_Sub2) this).aByteArray11115[i_3_++] = i_2_;
	((Class347_Sub1_Sub2) this).aByteArray11115[i_3_] = i_2_;
    }
    
    byte[] method17533(int i, int i_4_, int i_5_) {
	((Class347_Sub1_Sub2) this).aByteArray11115
	    = new byte[i * i_4_ * i_5_ * 2];
	method6183(i, i_4_, i_5_);
	return ((Class347_Sub1_Sub2) this).aByteArray11115;
    }
    
    byte[] method17534(int i, int i_6_, int i_7_) {
	((Class347_Sub1_Sub2) this).aByteArray11115
	    = new byte[i * i_6_ * i_7_ * 2];
	method6183(i, i_6_, i_7_);
	return ((Class347_Sub1_Sub2) this).aByteArray11115;
    }
    
    void method16518(int i, byte i_8_) {
	int i_9_ = i * 2;
	i_8_ = (byte) (127 + ((i_8_ & 0xff) >> 1));
	((Class347_Sub1_Sub2) this).aByteArray11115[i_9_++] = i_8_;
	((Class347_Sub1_Sub2) this).aByteArray11115[i_9_] = i_8_;
    }
}
