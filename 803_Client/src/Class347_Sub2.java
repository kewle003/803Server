/* Class347_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class347_Sub2 extends Class347
{
    int anInt10219;
    int anInt10220;
    int anInt10221;
    int anInt10222;
    int anInt10223;
    int anInt10224;
    int anInt10225;
    int anInt10226;
    byte[] aByteArray10227;
    
    void method6184(int i, int i_0_) {
	if (i != 0) {
	    ((Class347_Sub2) this).anInt10222
		= (((Class347_Sub2) this).anInt10225
		   * ((Class347_Sub2) this).anInt10219) >> 12;
	    if (((Class347_Sub2) this).anInt10222 < 0)
		((Class347_Sub2) this).anInt10222 = 0;
	    else if (((Class347_Sub2) this).anInt10222 > 4096)
		((Class347_Sub2) this).anInt10222 = 4096;
	    ((Class347_Sub2) this).anInt10225
		= ((Class347_Sub2) this).anInt10226 - (i_0_ < 0 ? -i_0_
						       : i_0_);
	    ((Class347_Sub2) this).anInt10225
		= (((Class347_Sub2) this).anInt10225
		   * ((Class347_Sub2) this).anInt10225) >> 12;
	    ((Class347_Sub2) this).anInt10225
		= (((Class347_Sub2) this).anInt10225
		   * ((Class347_Sub2) this).anInt10222) >> 12;
	    ((Class347_Sub2) this).anInt10224
		+= (((Class347_Sub2) this).anInt10225
		    * ((Class347_Sub2) this).anInt10221) >> 12;
	    ((Class347_Sub2) this).anInt10221
		= (((Class347_Sub2) this).anInt10221
		   * ((Class347_Sub2) this).anInt10220) >> 12;
	} else {
	    ((Class347_Sub2) this).anInt10225
		= ((Class347_Sub2) this).anInt10226 - (i_0_ < 0 ? -i_0_
						       : i_0_);
	    ((Class347_Sub2) this).anInt10225
		= (((Class347_Sub2) this).anInt10225
		   * ((Class347_Sub2) this).anInt10225) >> 12;
	    ((Class347_Sub2) this).anInt10222 = 4096;
	    ((Class347_Sub2) this).anInt10224
		= ((Class347_Sub2) this).anInt10225;
	}
    }
    
    void method16520(int i, byte i_1_) {
	((Class347_Sub2) this).aByteArray10227[i] = i_1_;
    }
    
    void method6197() {
	((Class347_Sub2) this).anInt10221 = ((Class347_Sub2) this).anInt10220;
	((Class347_Sub2) this).anInt10224 >>= 4;
	if (((Class347_Sub2) this).anInt10224 < 0)
	    ((Class347_Sub2) this).anInt10224 = 0;
	else if (((Class347_Sub2) this).anInt10224 > 255)
	    ((Class347_Sub2) this).anInt10224 = 255;
	method16520(((Class347_Sub2) this).anInt10223++,
		    (byte) ((Class347_Sub2) this).anInt10224);
	((Class347_Sub2) this).anInt10224 = 0;
    }
    
    Class347_Sub2(int i, int i_2_, int i_3_, int i_4_, int i_5_, float f,
		  float f_6_, float f_7_) {
	super(i, i_2_, i_3_, i_4_, i_5_);
	((Class347_Sub2) this).anInt10219 = (int) (f_7_ * 4096.0F);
	((Class347_Sub2) this).anInt10226 = (int) (f_6_ * 4096.0F);
	((Class347_Sub2) this).anInt10221
	    = ((Class347_Sub2) this).anInt10220
	    = (int) (Math.pow(0.5, (double) -f) * 4096.0);
    }
    
    void method6204(int i, int i_8_) {
	if (i != 0) {
	    ((Class347_Sub2) this).anInt10222
		= (((Class347_Sub2) this).anInt10225
		   * ((Class347_Sub2) this).anInt10219) >> 12;
	    if (((Class347_Sub2) this).anInt10222 < 0)
		((Class347_Sub2) this).anInt10222 = 0;
	    else if (((Class347_Sub2) this).anInt10222 > 4096)
		((Class347_Sub2) this).anInt10222 = 4096;
	    ((Class347_Sub2) this).anInt10225
		= ((Class347_Sub2) this).anInt10226 - (i_8_ < 0 ? -i_8_
						       : i_8_);
	    ((Class347_Sub2) this).anInt10225
		= (((Class347_Sub2) this).anInt10225
		   * ((Class347_Sub2) this).anInt10225) >> 12;
	    ((Class347_Sub2) this).anInt10225
		= (((Class347_Sub2) this).anInt10225
		   * ((Class347_Sub2) this).anInt10222) >> 12;
	    ((Class347_Sub2) this).anInt10224
		+= (((Class347_Sub2) this).anInt10225
		    * ((Class347_Sub2) this).anInt10221) >> 12;
	    ((Class347_Sub2) this).anInt10221
		= (((Class347_Sub2) this).anInt10221
		   * ((Class347_Sub2) this).anInt10220) >> 12;
	} else {
	    ((Class347_Sub2) this).anInt10225
		= ((Class347_Sub2) this).anInt10226 - (i_8_ < 0 ? -i_8_
						       : i_8_);
	    ((Class347_Sub2) this).anInt10225
		= (((Class347_Sub2) this).anInt10225
		   * ((Class347_Sub2) this).anInt10225) >> 12;
	    ((Class347_Sub2) this).anInt10222 = 4096;
	    ((Class347_Sub2) this).anInt10224
		= ((Class347_Sub2) this).anInt10225;
	}
    }
    
    void method6185() {
	((Class347_Sub2) this).anInt10221 = ((Class347_Sub2) this).anInt10220;
	((Class347_Sub2) this).anInt10224 >>= 4;
	if (((Class347_Sub2) this).anInt10224 < 0)
	    ((Class347_Sub2) this).anInt10224 = 0;
	else if (((Class347_Sub2) this).anInt10224 > 255)
	    ((Class347_Sub2) this).anInt10224 = 255;
	method16520(((Class347_Sub2) this).anInt10223++,
		    (byte) ((Class347_Sub2) this).anInt10224);
	((Class347_Sub2) this).anInt10224 = 0;
    }
    
    void method16521(int i, byte i_9_) {
	((Class347_Sub2) this).aByteArray10227[i] = i_9_;
    }
    
    void method6182() {
	((Class347_Sub2) this).anInt10223 = 0;
	((Class347_Sub2) this).anInt10224 = 0;
    }
    
    void method6195() {
	((Class347_Sub2) this).anInt10223 = 0;
	((Class347_Sub2) this).anInt10224 = 0;
    }
    
    void method6196() {
	((Class347_Sub2) this).anInt10223 = 0;
	((Class347_Sub2) this).anInt10224 = 0;
    }
    
    void method6193() {
	((Class347_Sub2) this).anInt10223 = 0;
	((Class347_Sub2) this).anInt10224 = 0;
    }
    
    void method6198() {
	((Class347_Sub2) this).anInt10221 = ((Class347_Sub2) this).anInt10220;
	((Class347_Sub2) this).anInt10224 >>= 4;
	if (((Class347_Sub2) this).anInt10224 < 0)
	    ((Class347_Sub2) this).anInt10224 = 0;
	else if (((Class347_Sub2) this).anInt10224 > 255)
	    ((Class347_Sub2) this).anInt10224 = 255;
	method16520(((Class347_Sub2) this).anInt10223++,
		    (byte) ((Class347_Sub2) this).anInt10224);
	((Class347_Sub2) this).anInt10224 = 0;
    }
    
    void method6200(int i, int i_10_) {
	if (i != 0) {
	    ((Class347_Sub2) this).anInt10222
		= (((Class347_Sub2) this).anInt10225
		   * ((Class347_Sub2) this).anInt10219) >> 12;
	    if (((Class347_Sub2) this).anInt10222 < 0)
		((Class347_Sub2) this).anInt10222 = 0;
	    else if (((Class347_Sub2) this).anInt10222 > 4096)
		((Class347_Sub2) this).anInt10222 = 4096;
	    ((Class347_Sub2) this).anInt10225
		= ((Class347_Sub2) this).anInt10226 - (i_10_ < 0 ? -i_10_
						       : i_10_);
	    ((Class347_Sub2) this).anInt10225
		= (((Class347_Sub2) this).anInt10225
		   * ((Class347_Sub2) this).anInt10225) >> 12;
	    ((Class347_Sub2) this).anInt10225
		= (((Class347_Sub2) this).anInt10225
		   * ((Class347_Sub2) this).anInt10222) >> 12;
	    ((Class347_Sub2) this).anInt10224
		+= (((Class347_Sub2) this).anInt10225
		    * ((Class347_Sub2) this).anInt10221) >> 12;
	    ((Class347_Sub2) this).anInt10221
		= (((Class347_Sub2) this).anInt10221
		   * ((Class347_Sub2) this).anInt10220) >> 12;
	} else {
	    ((Class347_Sub2) this).anInt10225
		= ((Class347_Sub2) this).anInt10226 - (i_10_ < 0 ? -i_10_
						       : i_10_);
	    ((Class347_Sub2) this).anInt10225
		= (((Class347_Sub2) this).anInt10225
		   * ((Class347_Sub2) this).anInt10225) >> 12;
	    ((Class347_Sub2) this).anInt10222 = 4096;
	    ((Class347_Sub2) this).anInt10224
		= ((Class347_Sub2) this).anInt10225;
	}
    }
    
    void method16522(int i, byte i_11_) {
	((Class347_Sub2) this).aByteArray10227[i] = i_11_;
    }
    
    void method6205(int i, int i_12_) {
	if (i != 0) {
	    ((Class347_Sub2) this).anInt10222
		= (((Class347_Sub2) this).anInt10225
		   * ((Class347_Sub2) this).anInt10219) >> 12;
	    if (((Class347_Sub2) this).anInt10222 < 0)
		((Class347_Sub2) this).anInt10222 = 0;
	    else if (((Class347_Sub2) this).anInt10222 > 4096)
		((Class347_Sub2) this).anInt10222 = 4096;
	    ((Class347_Sub2) this).anInt10225
		= ((Class347_Sub2) this).anInt10226 - (i_12_ < 0 ? -i_12_
						       : i_12_);
	    ((Class347_Sub2) this).anInt10225
		= (((Class347_Sub2) this).anInt10225
		   * ((Class347_Sub2) this).anInt10225) >> 12;
	    ((Class347_Sub2) this).anInt10225
		= (((Class347_Sub2) this).anInt10225
		   * ((Class347_Sub2) this).anInt10222) >> 12;
	    ((Class347_Sub2) this).anInt10224
		+= (((Class347_Sub2) this).anInt10225
		    * ((Class347_Sub2) this).anInt10221) >> 12;
	    ((Class347_Sub2) this).anInt10221
		= (((Class347_Sub2) this).anInt10221
		   * ((Class347_Sub2) this).anInt10220) >> 12;
	} else {
	    ((Class347_Sub2) this).anInt10225
		= ((Class347_Sub2) this).anInt10226 - (i_12_ < 0 ? -i_12_
						       : i_12_);
	    ((Class347_Sub2) this).anInt10225
		= (((Class347_Sub2) this).anInt10225
		   * ((Class347_Sub2) this).anInt10225) >> 12;
	    ((Class347_Sub2) this).anInt10222 = 4096;
	    ((Class347_Sub2) this).anInt10224
		= ((Class347_Sub2) this).anInt10225;
	}
    }
    
    void method6206(int i, int i_13_) {
	if (i != 0) {
	    ((Class347_Sub2) this).anInt10222
		= (((Class347_Sub2) this).anInt10225
		   * ((Class347_Sub2) this).anInt10219) >> 12;
	    if (((Class347_Sub2) this).anInt10222 < 0)
		((Class347_Sub2) this).anInt10222 = 0;
	    else if (((Class347_Sub2) this).anInt10222 > 4096)
		((Class347_Sub2) this).anInt10222 = 4096;
	    ((Class347_Sub2) this).anInt10225
		= ((Class347_Sub2) this).anInt10226 - (i_13_ < 0 ? -i_13_
						       : i_13_);
	    ((Class347_Sub2) this).anInt10225
		= (((Class347_Sub2) this).anInt10225
		   * ((Class347_Sub2) this).anInt10225) >> 12;
	    ((Class347_Sub2) this).anInt10225
		= (((Class347_Sub2) this).anInt10225
		   * ((Class347_Sub2) this).anInt10222) >> 12;
	    ((Class347_Sub2) this).anInt10224
		+= (((Class347_Sub2) this).anInt10225
		    * ((Class347_Sub2) this).anInt10221) >> 12;
	    ((Class347_Sub2) this).anInt10221
		= (((Class347_Sub2) this).anInt10221
		   * ((Class347_Sub2) this).anInt10220) >> 12;
	} else {
	    ((Class347_Sub2) this).anInt10225
		= ((Class347_Sub2) this).anInt10226 - (i_13_ < 0 ? -i_13_
						       : i_13_);
	    ((Class347_Sub2) this).anInt10225
		= (((Class347_Sub2) this).anInt10225
		   * ((Class347_Sub2) this).anInt10225) >> 12;
	    ((Class347_Sub2) this).anInt10222 = 4096;
	    ((Class347_Sub2) this).anInt10224
		= ((Class347_Sub2) this).anInt10225;
	}
    }
}
