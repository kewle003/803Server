/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class160
{
    static final int anInt1783 = 1;
    static final int anInt1784 = 0;
    static final int anInt1785 = 0;
    
    public static Class108 method3436(JS5 class210, int i) {
	byte[] is = class210.method4194(i, 93796787);
	if (is == null)
	    return null;
	return method3443(is)[0];
    }
    
    public static Class108 method3437(JS5 sprites, int cursorID, int i_0_) {
		byte[] is = sprites.getfile(cursorID, i_0_, -631085607);
		if (is == null) {
		    return null;
		}
		return method3443(is)[0];
    }
    
    public static Class108 method3438(JS5 class210, int i) {
	byte[] is = class210.method4194(i, -1143866401);
	if (is == null)
	    return null;
	return method3443(is)[0];
    }
    
    public static Class108[] method3439(JS5 class210, int i, int i_1_) {
	byte[] is = class210.getfile(i, i_1_, -621115988);
	if (is == null)
	    return null;
	return method3443(is);
    }
    
    public static Class108[] method3440(JS5 class210, int i) {
	byte[] is = class210.method4194(i, -1988836733);
	if (is == null)
	    return null;
	return method3443(is);
    }
    
    public static Class108 method3441(JS5 class210, int i) {
	byte[] is = class210.method4194(i, -705747365);
	if (is == null)
	    return null;
	return method3443(is)[0];
    }
    
    public static Class108 method3442(JS5 class210, int i, int i_2_) {
	byte[] is = class210.getfile(i, i_2_, 760822944);
	if (is == null)
	    return null;
	return method3443(is)[0];
    }
    
    public static Class108[] method3443(byte[] is) {
		RSByteBuffer buffer = new RSByteBuffer(is);
		buffer.pointer = (is.length - 2) * -681042949;
		int i = buffer.readUnsignedShort(1162222719);
		int i_3_ = i >> 15;
		int subSprites = i & 0x7fff;
		if (i_3_ == 0) {
		    Class108_Sub2[] class108_sub2s = new Class108_Sub2[subSprites];
		    for (int i_5_ = 0; i_5_ < subSprites; i_5_++) {
		    	class108_sub2s[i_5_] = new Class108_Sub2();
		    }
		    buffer.pointer = (is.length - 7 - subSprites * 8) * -681042949;
		    int i_6_ = buffer.readUnsignedShort(1162222719);
		    int i_7_ = buffer.readUnsignedShort(1162222719);
		    int i_8_ = (buffer.readUnsignedByte((byte) -55) & 0xff) + 1;
		    for (int i_9_ = 0; i_9_ < subSprites; i_9_++) {
		    	class108_sub2s[i_9_].anInt9302 = buffer.readUnsignedShort(1162222719);
		    }
		    for (int i_10_ = 0; i_10_ < subSprites; i_10_++)
			class108_sub2s[i_10_].anInt9306
			    = buffer.readUnsignedShort(1162222719);
		    for (int i_11_ = 0; i_11_ < subSprites; i_11_++)
			((Class108_Sub2) class108_sub2s[i_11_]).anInt9304
			    = buffer.readUnsignedShort(1162222719);
		    for (int i_12_ = 0; i_12_ < subSprites; i_12_++)
			((Class108_Sub2) class108_sub2s[i_12_]).anInt9303
			    = buffer.readUnsignedShort(1162222719);
		    for (int i_13_ = 0; i_13_ < subSprites; i_13_++) {
			Class108_Sub2 class108_sub2 = class108_sub2s[i_13_];
			((Class108_Sub2) class108_sub2).anInt9307
			    = (i_6_ - ((Class108_Sub2) class108_sub2).anInt9304
			       - class108_sub2.anInt9302);
			((Class108_Sub2) class108_sub2).anInt9305
			    = (i_7_ - ((Class108_Sub2) class108_sub2).anInt9303
			       - class108_sub2.anInt9306);
		    }
		    buffer.pointer
			= (is.length - 7 - subSprites * 8 - (i_8_ - 1) * 3) * -681042949;
		    int[] is_14_ = new int[i_8_];
		    for (int i_15_ = 1; i_15_ < i_8_; i_15_++) {
			is_14_[i_15_] = buffer.readTriByte(1771646547);
			if (is_14_[i_15_] == 0)
			    is_14_[i_15_] = 1;
		    }
		    for (int i_16_ = 0; i_16_ < subSprites; i_16_++)
			class108_sub2s[i_16_].anIntArray9308 = is_14_;
		    buffer.pointer = 0;
		    for (int i_17_ = 0; i_17_ < subSprites; i_17_++) {
			Class108_Sub2 class108_sub2 = class108_sub2s[i_17_];
			int i_18_ = (((Class108_Sub2) class108_sub2).anInt9304
				     * ((Class108_Sub2) class108_sub2).anInt9303);
			class108_sub2.aByteArray9309 = new byte[i_18_];
			int i_19_ = buffer.readUnsignedByte((byte) 80);
			if ((i_19_ & 0x2) == 0) {
			    if ((i_19_ & 0x1) == 0) {
				for (int i_20_ = 0; i_20_ < i_18_; i_20_++)
				    class108_sub2.aByteArray9309[i_20_]
					= buffer.getByte(-116171737);
			    } else {
				for (int i_21_ = 0;
				     i_21_ < ((Class108_Sub2) class108_sub2).anInt9304;
				     i_21_++) {
				    for (int i_22_ = 0;
					 (i_22_
					  < ((Class108_Sub2) class108_sub2).anInt9303);
					 i_22_++)
					class108_sub2.aByteArray9309
					    [i_21_ + i_22_ * ((Class108_Sub2)
							      class108_sub2).anInt9304]
					    = buffer.getByte(-731236959);
				}
			    }
			} else {
			    boolean bool = false;
			    class108_sub2.aByteArray9310 = new byte[i_18_];
			    if ((i_19_ & 0x1) == 0) {
				for (int i_23_ = 0; i_23_ < i_18_; i_23_++)
				    class108_sub2.aByteArray9309[i_23_]
					= buffer.getByte(-379334994);
				for (int i_24_ = 0; i_24_ < i_18_; i_24_++) {
				    byte i_25_
					= (class108_sub2.aByteArray9310[i_24_]
					   = buffer.getByte(1681236822));
				    bool = bool | i_25_ != -1;
				}
			    } else {
				for (int i_26_ = 0;
				     i_26_ < ((Class108_Sub2) class108_sub2).anInt9304;
				     i_26_++) {
				    for (int i_27_ = 0;
					 (i_27_
					  < ((Class108_Sub2) class108_sub2).anInt9303);
					 i_27_++)
					class108_sub2.aByteArray9309
					    [i_26_ + i_27_ * ((Class108_Sub2)
							      class108_sub2).anInt9304]
					    = buffer.getByte(-77369410);
				}
				for (int i_28_ = 0;
				     i_28_ < ((Class108_Sub2) class108_sub2).anInt9304;
				     i_28_++) {
				    for (int i_29_ = 0;
					 (i_29_
					  < ((Class108_Sub2) class108_sub2).anInt9303);
					 i_29_++) {
					byte i_30_
					    = (class108_sub2.aByteArray9310
						   [i_28_ + i_29_ * (((Class108_Sub2)
								      class108_sub2)
								     .anInt9304)]
					       = buffer
						     .getByte(-1687963318));
					bool = bool | i_30_ != -1;
				    }
				}
			    }
			    if (!bool)
				class108_sub2.aByteArray9310 = null;
			}
		    }
		    return class108_sub2s;
		}
		Class108_Sub1[] class108_sub1s = new Class108_Sub1[subSprites];
		buffer.pointer = 0;
		int format = buffer.readUnsignedByte((byte) -9);
		if (format == 0) {
		    boolean bool = buffer.readUnsignedByte((byte) 9) == 1;
		    int i_32_ = buffer.readUnsignedShort(1162222719);
		    int i_33_ = buffer.readUnsignedShort(1162222719);
		    for (int i_34_ = 0; i_34_ < subSprites; i_34_++) {
				int[] is_35_ = new int[i_32_ * i_33_];
				for (int i_36_ = 0; i_36_ < i_32_ * i_33_; i_36_++) {
				    is_35_[i_36_] = ~0xffffff | buffer.readTriByte(1771646547);
				    if (is_35_[i_36_] == -65281)
				    	is_35_[i_36_] = 0;
				}
				if (bool) {
				    for (int i_37_ = 0; i_37_ < i_32_ * i_33_; i_37_++) {
						is_35_[i_37_] &= 0xffffff;
						is_35_[i_37_] |= buffer.readUnsignedByte((byte) 32) << 24;
				    }
				}
				class108_sub1s[i_34_] = new Class108_Sub1(i_32_, i_33_, is_35_);
		    }
		} else {
		    if (format == 1) {
		    	throw new UnsupportedOperationException();
		    }
		    throw new RuntimeException();
		}
		return class108_sub1s;
    }
    
    public static Class108 method3444(JS5 class210, int i) {
	byte[] is = class210.method4194(i, -932612810);
	if (is == null)
	    return null;
	return method3443(is)[0];
    }
    
    public static Class108 method3445(JS5 class210, int i) {
	byte[] is = class210.method4194(i, -199218636);
	if (is == null)
	    return null;
	return method3443(is)[0];
    }
    
    Class160() throws Throwable {
	throw new Error();
    }
}
