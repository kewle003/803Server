/* Class347_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class347_Sub2_Sub1 extends Class347_Sub2
{
    byte[] aByteArray10992;
    
    byte[] method17424(int i, int i_0_, int i_1_) {
	((Class347_Sub2_Sub1) this).aByteArray10992
	    = new byte[i * i_0_ * i_1_ * 2];
	method6183(i, i_0_, i_1_);
	return ((Class347_Sub2_Sub1) this).aByteArray10992;
    }
    
    void method16520(int i, byte i_2_) {
	int i_3_ = i * 2;
	int i_4_ = i_2_ & 0xff;
	((Class347_Sub2_Sub1) this).aByteArray10992[i_3_++]
	    = (byte) (3 * i_4_ >> 5);
	((Class347_Sub2_Sub1) this).aByteArray10992[i_3_]
	    = (byte) (3 * i_4_ >> 5);
    }
    
    Class347_Sub2_Sub1() {
	super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
    
    byte[] method17425(int i, int i_5_, int i_6_) {
	((Class347_Sub2_Sub1) this).aByteArray10992
	    = new byte[i * i_5_ * i_6_ * 2];
	method6183(i, i_5_, i_6_);
	return ((Class347_Sub2_Sub1) this).aByteArray10992;
    }
    
    void method16521(int i, byte i_7_) {
	int i_8_ = i * 2;
	int i_9_ = i_7_ & 0xff;
	((Class347_Sub2_Sub1) this).aByteArray10992[i_8_++]
	    = (byte) (3 * i_9_ >> 5);
	((Class347_Sub2_Sub1) this).aByteArray10992[i_8_]
	    = (byte) (3 * i_9_ >> 5);
    }
    
    void method16522(int i, byte i_10_) {
	int i_11_ = i * 2;
	int i_12_ = i_10_ & 0xff;
	((Class347_Sub2_Sub1) this).aByteArray10992[i_11_++]
	    = (byte) (3 * i_12_ >> 5);
	((Class347_Sub2_Sub1) this).aByteArray10992[i_11_]
	    = (byte) (3 * i_12_ >> 5);
    }
}
