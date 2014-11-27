/* Class347_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class347_Sub1 extends Class347
{
    int anInt10214;
    int anInt10215;
    int[] anIntArray10216 = new int[((Class347_Sub1) this).anInt5357];
    byte[] aByteArray10217;
    
    void method6193() {
	((Class347_Sub1) this).anInt10215 = 0;
	((Class347_Sub1) this).anInt10214 = 0;
    }
    
    void method6182() {
	((Class347_Sub1) this).anInt10215 = 0;
	((Class347_Sub1) this).anInt10214 = 0;
    }
    
    void method6196() {
	((Class347_Sub1) this).anInt10215 = 0;
	((Class347_Sub1) this).anInt10214 = 0;
    }
    
    void method6185() {
	((Class347_Sub1) this).anInt10214
	    = Math.abs(((Class347_Sub1) this).anInt10214);
	if (((Class347_Sub1) this).anInt10214 >= 4096)
	    ((Class347_Sub1) this).anInt10214 = 4095;
	method16519(((Class347_Sub1) this).anInt10215++,
		    (byte) (((Class347_Sub1) this).anInt10214 >> 4));
	((Class347_Sub1) this).anInt10214 = 0;
    }
    
    void method16517(int i, byte i_0_) {
	((Class347_Sub1) this).aByteArray10217
	    [((Class347_Sub1) this).anInt10215++]
	    = (byte) (127 + ((i_0_ & 0xff) >> 1));
    }
    
    void method6197() {
	((Class347_Sub1) this).anInt10214
	    = Math.abs(((Class347_Sub1) this).anInt10214);
	if (((Class347_Sub1) this).anInt10214 >= 4096)
	    ((Class347_Sub1) this).anInt10214 = 4095;
	method16519(((Class347_Sub1) this).anInt10215++,
		    (byte) (((Class347_Sub1) this).anInt10214 >> 4));
	((Class347_Sub1) this).anInt10214 = 0;
    }
    
    void method16518(int i, byte i_1_) {
	((Class347_Sub1) this).aByteArray10217
	    [((Class347_Sub1) this).anInt10215++]
	    = (byte) (127 + ((i_1_ & 0xff) >> 1));
    }
    
    void method6184(int i, int i_2_) {
	((Class347_Sub1) this).anInt10214
	    += i_2_ * ((Class347_Sub1) this).anIntArray10216[i] >> 12;
    }
    
    void method6195() {
	((Class347_Sub1) this).anInt10215 = 0;
	((Class347_Sub1) this).anInt10214 = 0;
    }
    
    Class347_Sub1(int i, int i_3_, int i_4_, int i_5_, int i_6_, float f) {
	super(i, i_3_, i_4_, i_5_, i_6_);
	for (int i_7_ = 0; i_7_ < ((Class347_Sub1) this).anInt5357; i_7_++)
	    ((Class347_Sub1) this).anIntArray10216[i_7_]
		= (short) (int) (Math.pow((double) f, (double) i_7_) * 4096.0);
    }
    
    void method6205(int i, int i_8_) {
	((Class347_Sub1) this).anInt10214
	    += i_8_ * ((Class347_Sub1) this).anIntArray10216[i] >> 12;
    }
    
    void method6198() {
	((Class347_Sub1) this).anInt10214
	    = Math.abs(((Class347_Sub1) this).anInt10214);
	if (((Class347_Sub1) this).anInt10214 >= 4096)
	    ((Class347_Sub1) this).anInt10214 = 4095;
	method16519(((Class347_Sub1) this).anInt10215++,
		    (byte) (((Class347_Sub1) this).anInt10214 >> 4));
	((Class347_Sub1) this).anInt10214 = 0;
    }
    
    void method6200(int i, int i_9_) {
	((Class347_Sub1) this).anInt10214
	    += i_9_ * ((Class347_Sub1) this).anIntArray10216[i] >> 12;
    }
    
    void method6204(int i, int i_10_) {
	((Class347_Sub1) this).anInt10214
	    += i_10_ * ((Class347_Sub1) this).anIntArray10216[i] >> 12;
    }
    
    void method6206(int i, int i_11_) {
	((Class347_Sub1) this).anInt10214
	    += i_11_ * ((Class347_Sub1) this).anIntArray10216[i] >> 12;
    }
    
    void method16519(int i, byte i_12_) {
	((Class347_Sub1) this).aByteArray10217
	    [((Class347_Sub1) this).anInt10215++]
	    = (byte) (127 + ((i_12_ & 0xff) >> 1));
    }
}
