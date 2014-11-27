/* Class241_Sub39_Sub17_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub39_Sub17_Sub2 extends Class241_Sub39_Sub17
{
    int anInt11476;
    int anInt11477;
    int anInt11478;
    int anInt11479;
    byte[] aByteArray11480;
    static final int anInt11481 = 16;
    
    static final void method17910(byte[] is, int i, int i_0_, int i_1_,
				  int i_2_) {
	if (i_1_ < i_2_) {
	    i += i_1_;
	    i_0_ = i_2_ - i_1_ >> 2;
	    while (--i_0_ >= 0) {
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
	    }
	    i_0_ = i_2_ - i_1_ & 0x3;
	    while (--i_0_ >= 0)
		is[i++] = (byte) 1;
	}
    }
    
    void method17911(int i, int i_3_, int i_4_, int i_5_) {
	((Class241_Sub39_Sub17_Sub2) this).anInt11479 = i;
	((Class241_Sub39_Sub17_Sub2) this).anInt11476 = i_3_;
	((Class241_Sub39_Sub17_Sub2) this).anInt11477 = i_4_ - i;
	((Class241_Sub39_Sub17_Sub2) this).anInt11478 = i_5_ - i_3_;
    }
    
    boolean method17912(int i, int i_6_) {
	return (((Class241_Sub39_Sub17_Sub2) this).aByteArray11480.length
		>= i * i_6_);
    }
    
    void method17913() {
	int i = -1;
	int i_7_
	    = ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480.length - 8;
	while (i < i_7_) {
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	}
	while (i
	       < ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480.length - 1)
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
    }
    
    void method17914(int i, int i_8_, int i_9_, int i_10_, int i_11_,
		     int i_12_) {
	int i_13_ = 0;
	if (i_8_ != i)
	    i_13_ = (i_11_ - i_10_ << 16) / (i_8_ - i);
	int i_14_ = 0;
	if (i_9_ != i_8_)
	    i_14_ = (i_12_ - i_11_ << 16) / (i_9_ - i_8_);
	int i_15_ = 0;
	if (i_9_ != i)
	    i_15_ = (i_10_ - i_12_ << 16) / (i - i_9_);
	if (i <= i_8_ && i <= i_9_) {
	    if (i_8_ < i_9_) {
		i_12_ = i_10_ <<= 16;
		if (i < 0) {
		    i_12_ -= i_15_ * i;
		    i_10_ -= i_13_ * i;
		    i = 0;
		}
		i_11_ <<= 16;
		if (i_8_ < 0) {
		    i_11_ -= i_14_ * i_8_;
		    i_8_ = 0;
		}
		if (i != i_8_ && i_15_ < i_13_ || i == i_8_ && i_15_ > i_14_) {
		    i_9_ -= i_8_;
		    i_8_ -= i;
		    i *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_8_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_12_ >> 16, i_10_ >> 16);
			i_12_ += i_15_;
			i_10_ += i_13_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_9_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_12_ >> 16, i_11_ >> 16);
			i_12_ += i_15_;
			i_11_ += i_14_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		} else {
		    i_9_ -= i_8_;
		    i_8_ -= i;
		    i *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_8_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_10_ >> 16, i_12_ >> 16);
			i_12_ += i_15_;
			i_10_ += i_13_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_9_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_11_ >> 16, i_12_ >> 16);
			i_12_ += i_15_;
			i_11_ += i_14_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		}
	    } else {
		i_11_ = i_10_ <<= 16;
		if (i < 0) {
		    i_11_ -= i_15_ * i;
		    i_10_ -= i_13_ * i;
		    i = 0;
		}
		i_12_ <<= 16;
		if (i_9_ < 0) {
		    i_12_ -= i_14_ * i_9_;
		    i_9_ = 0;
		}
		if (i != i_9_ && i_15_ < i_13_ || i == i_9_ && i_14_ > i_13_) {
		    i_8_ -= i_9_;
		    i_9_ -= i;
		    i *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_9_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_11_ >> 16, i_10_ >> 16);
			i_11_ += i_15_;
			i_10_ += i_13_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_8_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_12_ >> 16, i_10_ >> 16);
			i_12_ += i_14_;
			i_10_ += i_13_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		} else {
		    i_8_ -= i_9_;
		    i_9_ -= i;
		    i *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_9_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_10_ >> 16, i_11_ >> 16);
			i_11_ += i_15_;
			i_10_ += i_13_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_8_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_10_ >> 16, i_12_ >> 16);
			i_12_ += i_14_;
			i_10_ += i_13_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		}
	    }
	} else if (i_8_ <= i_9_) {
	    if (i_9_ < i) {
		i_10_ = i_11_ <<= 16;
		if (i_8_ < 0) {
		    i_10_ -= i_13_ * i_8_;
		    i_11_ -= i_14_ * i_8_;
		    i_8_ = 0;
		}
		i_12_ <<= 16;
		if (i_9_ < 0) {
		    i_12_ -= i_15_ * i_9_;
		    i_9_ = 0;
		}
		if (i_8_ != i_9_ && i_13_ < i_14_
		    || i_8_ == i_9_ && i_13_ > i_15_) {
		    i -= i_9_;
		    i_9_ -= i_8_;
		    i_8_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_9_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_8_, 0, i_10_ >> 16, i_11_ >> 16);
			i_10_ += i_13_;
			i_11_ += i_14_;
			i_8_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_8_, 0, i_10_ >> 16, i_12_ >> 16);
			i_10_ += i_13_;
			i_12_ += i_15_;
			i_8_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		} else {
		    i -= i_9_;
		    i_9_ -= i_8_;
		    i_8_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_9_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_8_, 0, i_11_ >> 16, i_10_ >> 16);
			i_10_ += i_13_;
			i_11_ += i_14_;
			i_8_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_8_, 0, i_12_ >> 16, i_10_ >> 16);
			i_10_ += i_13_;
			i_12_ += i_15_;
			i_8_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		}
	    } else {
		i_12_ = i_11_ <<= 16;
		if (i_8_ < 0) {
		    i_12_ -= i_13_ * i_8_;
		    i_11_ -= i_14_ * i_8_;
		    i_8_ = 0;
		}
		i_10_ <<= 16;
		if (i < 0) {
		    i_10_ -= i_15_ * i;
		    i = 0;
		}
		if (i_13_ < i_14_) {
		    i_9_ -= i;
		    i -= i_8_;
		    i_8_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_8_, 0, i_12_ >> 16, i_11_ >> 16);
			i_12_ += i_13_;
			i_11_ += i_14_;
			i_8_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_9_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_8_, 0, i_10_ >> 16, i_11_ >> 16);
			i_10_ += i_15_;
			i_11_ += i_14_;
			i_8_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		} else {
		    i_9_ -= i;
		    i -= i_8_;
		    i_8_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_8_, 0, i_11_ >> 16, i_12_ >> 16);
			i_12_ += i_13_;
			i_11_ += i_14_;
			i_8_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_9_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_8_, 0, i_11_ >> 16, i_10_ >> 16);
			i_10_ += i_15_;
			i_11_ += i_14_;
			i_8_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		}
	    }
	} else if (i < i_8_) {
	    i_11_ = i_12_ <<= 16;
	    if (i_9_ < 0) {
		i_11_ -= i_14_ * i_9_;
		i_12_ -= i_15_ * i_9_;
		i_9_ = 0;
	    }
	    i_10_ <<= 16;
	    if (i < 0) {
		i_10_ -= i_13_ * i;
		i = 0;
	    }
	    if (i_14_ < i_15_) {
		i_8_ -= i;
		i -= i_9_;
		i_9_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		while (--i >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_9_, 0, i_11_ >> 16, i_12_ >> 16);
		    i_11_ += i_14_;
		    i_12_ += i_15_;
		    i_9_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
		while (--i_8_ >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_9_, 0, i_11_ >> 16, i_10_ >> 16);
		    i_11_ += i_14_;
		    i_10_ += i_13_;
		    i_9_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
	    } else {
		i_8_ -= i;
		i -= i_9_;
		i_9_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		while (--i >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_9_, 0, i_12_ >> 16, i_11_ >> 16);
		    i_11_ += i_14_;
		    i_12_ += i_15_;
		    i_9_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
		while (--i_8_ >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_9_, 0, i_10_ >> 16, i_11_ >> 16);
		    i_11_ += i_14_;
		    i_10_ += i_13_;
		    i_9_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
	    }
	} else {
	    i_10_ = i_12_ <<= 16;
	    if (i_9_ < 0) {
		i_10_ -= i_14_ * i_9_;
		i_12_ -= i_15_ * i_9_;
		i_9_ = 0;
	    }
	    i_11_ <<= 16;
	    if (i_8_ < 0) {
		i_11_ -= i_13_ * i_8_;
		i_8_ = 0;
	    }
	    if (i_14_ < i_15_) {
		i -= i_8_;
		i_8_ -= i_9_;
		i_9_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		while (--i_8_ >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_9_, 0, i_10_ >> 16, i_12_ >> 16);
		    i_10_ += i_14_;
		    i_12_ += i_15_;
		    i_9_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
		while (--i >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_9_, 0, i_11_ >> 16, i_12_ >> 16);
		    i_11_ += i_13_;
		    i_12_ += i_15_;
		    i_9_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
	    } else {
		i -= i_8_;
		i_8_ -= i_9_;
		i_9_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		while (--i_8_ >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_9_, 0, i_12_ >> 16, i_10_ >> 16);
		    i_10_ += i_14_;
		    i_12_ += i_15_;
		    i_9_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
		while (--i >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_9_, 0, i_12_ >> 16, i_11_ >> 16);
		    i_11_ += i_13_;
		    i_12_ += i_15_;
		    i_9_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
	    }
	}
    }
    
    static final void method17915(byte[] is, int i, int i_16_, int i_17_,
				  int i_18_) {
	if (i_17_ < i_18_) {
	    i += i_17_;
	    i_16_ = i_18_ - i_17_ >> 2;
	    while (--i_16_ >= 0) {
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
	    }
	    i_16_ = i_18_ - i_17_ & 0x3;
	    while (--i_16_ >= 0)
		is[i++] = (byte) 1;
	}
    }
    
    boolean method17916(int i, int i_19_) {
	return (((Class241_Sub39_Sub17_Sub2) this).aByteArray11480.length
		>= i * i_19_);
    }
    
    void method17917() {
	int i = -1;
	int i_20_
	    = ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480.length - 8;
	while (i < i_20_) {
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	}
	while (i
	       < ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480.length - 1)
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
    }
    
    Class241_Sub39_Sub17_Sub2(Class103_Sub1 class103_sub1, int i, int i_21_) {
	((Class241_Sub39_Sub17_Sub2) this).aByteArray11480
	    = new byte[i * i_21_];
    }
    
    boolean method17918(int i, int i_22_) {
	return (((Class241_Sub39_Sub17_Sub2) this).aByteArray11480.length
		>= i * i_22_);
    }
    
    void method17919() {
	int i = -1;
	int i_23_
	    = ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480.length - 8;
	while (i < i_23_) {
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
	}
	while (i
	       < ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480.length - 1)
	    ((Class241_Sub39_Sub17_Sub2) this).aByteArray11480[++i] = (byte) 0;
    }
    
    static final void method17920(byte[] is, int i, int i_24_, int i_25_,
				  int i_26_) {
	if (i_25_ < i_26_) {
	    i += i_25_;
	    i_24_ = i_26_ - i_25_ >> 2;
	    while (--i_24_ >= 0) {
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
	    }
	    i_24_ = i_26_ - i_25_ & 0x3;
	    while (--i_24_ >= 0)
		is[i++] = (byte) 1;
	}
    }
    
    void method17921(int i, int i_27_, int i_28_, int i_29_, int i_30_,
		     int i_31_) {
	int i_32_ = 0;
	if (i_27_ != i)
	    i_32_ = (i_30_ - i_29_ << 16) / (i_27_ - i);
	int i_33_ = 0;
	if (i_28_ != i_27_)
	    i_33_ = (i_31_ - i_30_ << 16) / (i_28_ - i_27_);
	int i_34_ = 0;
	if (i_28_ != i)
	    i_34_ = (i_29_ - i_31_ << 16) / (i - i_28_);
	if (i <= i_27_ && i <= i_28_) {
	    if (i_27_ < i_28_) {
		i_31_ = i_29_ <<= 16;
		if (i < 0) {
		    i_31_ -= i_34_ * i;
		    i_29_ -= i_32_ * i;
		    i = 0;
		}
		i_30_ <<= 16;
		if (i_27_ < 0) {
		    i_30_ -= i_33_ * i_27_;
		    i_27_ = 0;
		}
		if (i != i_27_ && i_34_ < i_32_
		    || i == i_27_ && i_34_ > i_33_) {
		    i_28_ -= i_27_;
		    i_27_ -= i;
		    i *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_27_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_31_ >> 16, i_29_ >> 16);
			i_31_ += i_34_;
			i_29_ += i_32_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_28_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_31_ >> 16, i_30_ >> 16);
			i_31_ += i_34_;
			i_30_ += i_33_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		} else {
		    i_28_ -= i_27_;
		    i_27_ -= i;
		    i *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_27_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_29_ >> 16, i_31_ >> 16);
			i_31_ += i_34_;
			i_29_ += i_32_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_28_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_30_ >> 16, i_31_ >> 16);
			i_31_ += i_34_;
			i_30_ += i_33_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		}
	    } else {
		i_30_ = i_29_ <<= 16;
		if (i < 0) {
		    i_30_ -= i_34_ * i;
		    i_29_ -= i_32_ * i;
		    i = 0;
		}
		i_31_ <<= 16;
		if (i_28_ < 0) {
		    i_31_ -= i_33_ * i_28_;
		    i_28_ = 0;
		}
		if (i != i_28_ && i_34_ < i_32_
		    || i == i_28_ && i_33_ > i_32_) {
		    i_27_ -= i_28_;
		    i_28_ -= i;
		    i *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_28_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_30_ >> 16, i_29_ >> 16);
			i_30_ += i_34_;
			i_29_ += i_32_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_27_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_31_ >> 16, i_29_ >> 16);
			i_31_ += i_33_;
			i_29_ += i_32_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		} else {
		    i_27_ -= i_28_;
		    i_28_ -= i;
		    i *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_28_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_29_ >> 16, i_30_ >> 16);
			i_30_ += i_34_;
			i_29_ += i_32_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_27_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_29_ >> 16, i_31_ >> 16);
			i_31_ += i_33_;
			i_29_ += i_32_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		}
	    }
	} else if (i_27_ <= i_28_) {
	    if (i_28_ < i) {
		i_29_ = i_30_ <<= 16;
		if (i_27_ < 0) {
		    i_29_ -= i_32_ * i_27_;
		    i_30_ -= i_33_ * i_27_;
		    i_27_ = 0;
		}
		i_31_ <<= 16;
		if (i_28_ < 0) {
		    i_31_ -= i_34_ * i_28_;
		    i_28_ = 0;
		}
		if (i_27_ != i_28_ && i_32_ < i_33_
		    || i_27_ == i_28_ && i_32_ > i_34_) {
		    i -= i_28_;
		    i_28_ -= i_27_;
		    i_27_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_28_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_27_, 0, i_29_ >> 16, i_30_ >> 16);
			i_29_ += i_32_;
			i_30_ += i_33_;
			i_27_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_27_, 0, i_29_ >> 16, i_31_ >> 16);
			i_29_ += i_32_;
			i_31_ += i_34_;
			i_27_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		} else {
		    i -= i_28_;
		    i_28_ -= i_27_;
		    i_27_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_28_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_27_, 0, i_30_ >> 16, i_29_ >> 16);
			i_29_ += i_32_;
			i_30_ += i_33_;
			i_27_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_27_, 0, i_31_ >> 16, i_29_ >> 16);
			i_29_ += i_32_;
			i_31_ += i_34_;
			i_27_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		}
	    } else {
		i_31_ = i_30_ <<= 16;
		if (i_27_ < 0) {
		    i_31_ -= i_32_ * i_27_;
		    i_30_ -= i_33_ * i_27_;
		    i_27_ = 0;
		}
		i_29_ <<= 16;
		if (i < 0) {
		    i_29_ -= i_34_ * i;
		    i = 0;
		}
		if (i_32_ < i_33_) {
		    i_28_ -= i;
		    i -= i_27_;
		    i_27_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_27_, 0, i_31_ >> 16, i_30_ >> 16);
			i_31_ += i_32_;
			i_30_ += i_33_;
			i_27_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_28_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_27_, 0, i_29_ >> 16, i_30_ >> 16);
			i_29_ += i_34_;
			i_30_ += i_33_;
			i_27_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		} else {
		    i_28_ -= i;
		    i -= i_27_;
		    i_27_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_27_, 0, i_30_ >> 16, i_31_ >> 16);
			i_31_ += i_32_;
			i_30_ += i_33_;
			i_27_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_28_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_27_, 0, i_30_ >> 16, i_29_ >> 16);
			i_29_ += i_34_;
			i_30_ += i_33_;
			i_27_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		}
	    }
	} else if (i < i_27_) {
	    i_30_ = i_31_ <<= 16;
	    if (i_28_ < 0) {
		i_30_ -= i_33_ * i_28_;
		i_31_ -= i_34_ * i_28_;
		i_28_ = 0;
	    }
	    i_29_ <<= 16;
	    if (i < 0) {
		i_29_ -= i_32_ * i;
		i = 0;
	    }
	    if (i_33_ < i_34_) {
		i_27_ -= i;
		i -= i_28_;
		i_28_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		while (--i >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_28_, 0, i_30_ >> 16, i_31_ >> 16);
		    i_30_ += i_33_;
		    i_31_ += i_34_;
		    i_28_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
		while (--i_27_ >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_28_, 0, i_30_ >> 16, i_29_ >> 16);
		    i_30_ += i_33_;
		    i_29_ += i_32_;
		    i_28_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
	    } else {
		i_27_ -= i;
		i -= i_28_;
		i_28_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		while (--i >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_28_, 0, i_31_ >> 16, i_30_ >> 16);
		    i_30_ += i_33_;
		    i_31_ += i_34_;
		    i_28_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
		while (--i_27_ >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_28_, 0, i_29_ >> 16, i_30_ >> 16);
		    i_30_ += i_33_;
		    i_29_ += i_32_;
		    i_28_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
	    }
	} else {
	    i_29_ = i_31_ <<= 16;
	    if (i_28_ < 0) {
		i_29_ -= i_33_ * i_28_;
		i_31_ -= i_34_ * i_28_;
		i_28_ = 0;
	    }
	    i_30_ <<= 16;
	    if (i_27_ < 0) {
		i_30_ -= i_32_ * i_27_;
		i_27_ = 0;
	    }
	    if (i_33_ < i_34_) {
		i -= i_27_;
		i_27_ -= i_28_;
		i_28_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		while (--i_27_ >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_28_, 0, i_29_ >> 16, i_31_ >> 16);
		    i_29_ += i_33_;
		    i_31_ += i_34_;
		    i_28_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
		while (--i >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_28_, 0, i_30_ >> 16, i_31_ >> 16);
		    i_30_ += i_32_;
		    i_31_ += i_34_;
		    i_28_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
	    } else {
		i -= i_27_;
		i_27_ -= i_28_;
		i_28_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		while (--i_27_ >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_28_, 0, i_31_ >> 16, i_29_ >> 16);
		    i_29_ += i_33_;
		    i_31_ += i_34_;
		    i_28_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
		while (--i >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_28_, 0, i_31_ >> 16, i_30_ >> 16);
		    i_30_ += i_32_;
		    i_31_ += i_34_;
		    i_28_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
	    }
	}
    }
    
    boolean method17922(int i, int i_35_) {
	return (((Class241_Sub39_Sub17_Sub2) this).aByteArray11480.length
		>= i * i_35_);
    }
    
    void method17923(int i, int i_36_, int i_37_, int i_38_, int i_39_,
		     int i_40_) {
	int i_41_ = 0;
	if (i_36_ != i)
	    i_41_ = (i_39_ - i_38_ << 16) / (i_36_ - i);
	int i_42_ = 0;
	if (i_37_ != i_36_)
	    i_42_ = (i_40_ - i_39_ << 16) / (i_37_ - i_36_);
	int i_43_ = 0;
	if (i_37_ != i)
	    i_43_ = (i_38_ - i_40_ << 16) / (i - i_37_);
	if (i <= i_36_ && i <= i_37_) {
	    if (i_36_ < i_37_) {
		i_40_ = i_38_ <<= 16;
		if (i < 0) {
		    i_40_ -= i_43_ * i;
		    i_38_ -= i_41_ * i;
		    i = 0;
		}
		i_39_ <<= 16;
		if (i_36_ < 0) {
		    i_39_ -= i_42_ * i_36_;
		    i_36_ = 0;
		}
		if (i != i_36_ && i_43_ < i_41_
		    || i == i_36_ && i_43_ > i_42_) {
		    i_37_ -= i_36_;
		    i_36_ -= i;
		    i *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_36_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_40_ >> 16, i_38_ >> 16);
			i_40_ += i_43_;
			i_38_ += i_41_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_37_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_40_ >> 16, i_39_ >> 16);
			i_40_ += i_43_;
			i_39_ += i_42_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		} else {
		    i_37_ -= i_36_;
		    i_36_ -= i;
		    i *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_36_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_38_ >> 16, i_40_ >> 16);
			i_40_ += i_43_;
			i_38_ += i_41_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_37_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_39_ >> 16, i_40_ >> 16);
			i_40_ += i_43_;
			i_39_ += i_42_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		}
	    } else {
		i_39_ = i_38_ <<= 16;
		if (i < 0) {
		    i_39_ -= i_43_ * i;
		    i_38_ -= i_41_ * i;
		    i = 0;
		}
		i_40_ <<= 16;
		if (i_37_ < 0) {
		    i_40_ -= i_42_ * i_37_;
		    i_37_ = 0;
		}
		if (i != i_37_ && i_43_ < i_41_
		    || i == i_37_ && i_42_ > i_41_) {
		    i_36_ -= i_37_;
		    i_37_ -= i;
		    i *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_37_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_39_ >> 16, i_38_ >> 16);
			i_39_ += i_43_;
			i_38_ += i_41_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_36_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_40_ >> 16, i_38_ >> 16);
			i_40_ += i_42_;
			i_38_ += i_41_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		} else {
		    i_36_ -= i_37_;
		    i_37_ -= i;
		    i *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_37_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_38_ >> 16, i_39_ >> 16);
			i_39_ += i_43_;
			i_38_ += i_41_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_36_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_38_ >> 16, i_40_ >> 16);
			i_40_ += i_42_;
			i_38_ += i_41_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		}
	    }
	} else if (i_36_ <= i_37_) {
	    if (i_37_ < i) {
		i_38_ = i_39_ <<= 16;
		if (i_36_ < 0) {
		    i_38_ -= i_41_ * i_36_;
		    i_39_ -= i_42_ * i_36_;
		    i_36_ = 0;
		}
		i_40_ <<= 16;
		if (i_37_ < 0) {
		    i_40_ -= i_43_ * i_37_;
		    i_37_ = 0;
		}
		if (i_36_ != i_37_ && i_41_ < i_42_
		    || i_36_ == i_37_ && i_41_ > i_43_) {
		    i -= i_37_;
		    i_37_ -= i_36_;
		    i_36_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_37_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_36_, 0, i_38_ >> 16, i_39_ >> 16);
			i_38_ += i_41_;
			i_39_ += i_42_;
			i_36_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_36_, 0, i_38_ >> 16, i_40_ >> 16);
			i_38_ += i_41_;
			i_40_ += i_43_;
			i_36_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		} else {
		    i -= i_37_;
		    i_37_ -= i_36_;
		    i_36_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_37_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_36_, 0, i_39_ >> 16, i_38_ >> 16);
			i_38_ += i_41_;
			i_39_ += i_42_;
			i_36_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_36_, 0, i_40_ >> 16, i_38_ >> 16);
			i_38_ += i_41_;
			i_40_ += i_43_;
			i_36_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		}
	    } else {
		i_40_ = i_39_ <<= 16;
		if (i_36_ < 0) {
		    i_40_ -= i_41_ * i_36_;
		    i_39_ -= i_42_ * i_36_;
		    i_36_ = 0;
		}
		i_38_ <<= 16;
		if (i < 0) {
		    i_38_ -= i_43_ * i;
		    i = 0;
		}
		if (i_41_ < i_42_) {
		    i_37_ -= i;
		    i -= i_36_;
		    i_36_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_36_, 0, i_40_ >> 16, i_39_ >> 16);
			i_40_ += i_41_;
			i_39_ += i_42_;
			i_36_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_37_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_36_, 0, i_38_ >> 16, i_39_ >> 16);
			i_38_ += i_43_;
			i_39_ += i_42_;
			i_36_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		} else {
		    i_37_ -= i;
		    i -= i_36_;
		    i_36_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_36_, 0, i_39_ >> 16, i_40_ >> 16);
			i_40_ += i_41_;
			i_39_ += i_42_;
			i_36_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_37_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_36_, 0, i_39_ >> 16, i_38_ >> 16);
			i_38_ += i_43_;
			i_39_ += i_42_;
			i_36_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		}
	    }
	} else if (i < i_36_) {
	    i_39_ = i_40_ <<= 16;
	    if (i_37_ < 0) {
		i_39_ -= i_42_ * i_37_;
		i_40_ -= i_43_ * i_37_;
		i_37_ = 0;
	    }
	    i_38_ <<= 16;
	    if (i < 0) {
		i_38_ -= i_41_ * i;
		i = 0;
	    }
	    if (i_42_ < i_43_) {
		i_36_ -= i;
		i -= i_37_;
		i_37_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		while (--i >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_37_, 0, i_39_ >> 16, i_40_ >> 16);
		    i_39_ += i_42_;
		    i_40_ += i_43_;
		    i_37_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
		while (--i_36_ >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_37_, 0, i_39_ >> 16, i_38_ >> 16);
		    i_39_ += i_42_;
		    i_38_ += i_41_;
		    i_37_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
	    } else {
		i_36_ -= i;
		i -= i_37_;
		i_37_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		while (--i >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_37_, 0, i_40_ >> 16, i_39_ >> 16);
		    i_39_ += i_42_;
		    i_40_ += i_43_;
		    i_37_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
		while (--i_36_ >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_37_, 0, i_38_ >> 16, i_39_ >> 16);
		    i_39_ += i_42_;
		    i_38_ += i_41_;
		    i_37_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
	    }
	} else {
	    i_38_ = i_40_ <<= 16;
	    if (i_37_ < 0) {
		i_38_ -= i_42_ * i_37_;
		i_40_ -= i_43_ * i_37_;
		i_37_ = 0;
	    }
	    i_39_ <<= 16;
	    if (i_36_ < 0) {
		i_39_ -= i_41_ * i_36_;
		i_36_ = 0;
	    }
	    if (i_42_ < i_43_) {
		i -= i_36_;
		i_36_ -= i_37_;
		i_37_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		while (--i_36_ >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_37_, 0, i_38_ >> 16, i_40_ >> 16);
		    i_38_ += i_42_;
		    i_40_ += i_43_;
		    i_37_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
		while (--i >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_37_, 0, i_39_ >> 16, i_40_ >> 16);
		    i_39_ += i_41_;
		    i_40_ += i_43_;
		    i_37_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
	    } else {
		i -= i_36_;
		i_36_ -= i_37_;
		i_37_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		while (--i_36_ >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_37_, 0, i_40_ >> 16, i_38_ >> 16);
		    i_38_ += i_42_;
		    i_40_ += i_43_;
		    i_37_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
		while (--i >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_37_, 0, i_40_ >> 16, i_39_ >> 16);
		    i_39_ += i_41_;
		    i_40_ += i_43_;
		    i_37_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
	    }
	}
    }
    
    void method17924(int i, int i_44_, int i_45_, int i_46_, int i_47_,
		     int i_48_) {
	int i_49_ = 0;
	if (i_44_ != i)
	    i_49_ = (i_47_ - i_46_ << 16) / (i_44_ - i);
	int i_50_ = 0;
	if (i_45_ != i_44_)
	    i_50_ = (i_48_ - i_47_ << 16) / (i_45_ - i_44_);
	int i_51_ = 0;
	if (i_45_ != i)
	    i_51_ = (i_46_ - i_48_ << 16) / (i - i_45_);
	if (i <= i_44_ && i <= i_45_) {
	    if (i_44_ < i_45_) {
		i_48_ = i_46_ <<= 16;
		if (i < 0) {
		    i_48_ -= i_51_ * i;
		    i_46_ -= i_49_ * i;
		    i = 0;
		}
		i_47_ <<= 16;
		if (i_44_ < 0) {
		    i_47_ -= i_50_ * i_44_;
		    i_44_ = 0;
		}
		if (i != i_44_ && i_51_ < i_49_
		    || i == i_44_ && i_51_ > i_50_) {
		    i_45_ -= i_44_;
		    i_44_ -= i;
		    i *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_44_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_48_ >> 16, i_46_ >> 16);
			i_48_ += i_51_;
			i_46_ += i_49_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_45_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_48_ >> 16, i_47_ >> 16);
			i_48_ += i_51_;
			i_47_ += i_50_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		} else {
		    i_45_ -= i_44_;
		    i_44_ -= i;
		    i *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_44_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_46_ >> 16, i_48_ >> 16);
			i_48_ += i_51_;
			i_46_ += i_49_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_45_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_47_ >> 16, i_48_ >> 16);
			i_48_ += i_51_;
			i_47_ += i_50_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		}
	    } else {
		i_47_ = i_46_ <<= 16;
		if (i < 0) {
		    i_47_ -= i_51_ * i;
		    i_46_ -= i_49_ * i;
		    i = 0;
		}
		i_48_ <<= 16;
		if (i_45_ < 0) {
		    i_48_ -= i_50_ * i_45_;
		    i_45_ = 0;
		}
		if (i != i_45_ && i_51_ < i_49_
		    || i == i_45_ && i_50_ > i_49_) {
		    i_44_ -= i_45_;
		    i_45_ -= i;
		    i *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_45_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_47_ >> 16, i_46_ >> 16);
			i_47_ += i_51_;
			i_46_ += i_49_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_44_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_48_ >> 16, i_46_ >> 16);
			i_48_ += i_50_;
			i_46_ += i_49_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		} else {
		    i_44_ -= i_45_;
		    i_45_ -= i;
		    i *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_45_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_46_ >> 16, i_47_ >> 16);
			i_47_ += i_51_;
			i_46_ += i_49_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_44_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i, 0, i_46_ >> 16, i_48_ >> 16);
			i_48_ += i_50_;
			i_46_ += i_49_;
			i += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		}
	    }
	} else if (i_44_ <= i_45_) {
	    if (i_45_ < i) {
		i_46_ = i_47_ <<= 16;
		if (i_44_ < 0) {
		    i_46_ -= i_49_ * i_44_;
		    i_47_ -= i_50_ * i_44_;
		    i_44_ = 0;
		}
		i_48_ <<= 16;
		if (i_45_ < 0) {
		    i_48_ -= i_51_ * i_45_;
		    i_45_ = 0;
		}
		if (i_44_ != i_45_ && i_49_ < i_50_
		    || i_44_ == i_45_ && i_49_ > i_51_) {
		    i -= i_45_;
		    i_45_ -= i_44_;
		    i_44_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_45_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_44_, 0, i_46_ >> 16, i_47_ >> 16);
			i_46_ += i_49_;
			i_47_ += i_50_;
			i_44_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_44_, 0, i_46_ >> 16, i_48_ >> 16);
			i_46_ += i_49_;
			i_48_ += i_51_;
			i_44_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		} else {
		    i -= i_45_;
		    i_45_ -= i_44_;
		    i_44_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i_45_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_44_, 0, i_47_ >> 16, i_46_ >> 16);
			i_46_ += i_49_;
			i_47_ += i_50_;
			i_44_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_44_, 0, i_48_ >> 16, i_46_ >> 16);
			i_46_ += i_49_;
			i_48_ += i_51_;
			i_44_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		}
	    } else {
		i_48_ = i_47_ <<= 16;
		if (i_44_ < 0) {
		    i_48_ -= i_49_ * i_44_;
		    i_47_ -= i_50_ * i_44_;
		    i_44_ = 0;
		}
		i_46_ <<= 16;
		if (i < 0) {
		    i_46_ -= i_51_ * i;
		    i = 0;
		}
		if (i_49_ < i_50_) {
		    i_45_ -= i;
		    i -= i_44_;
		    i_44_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_44_, 0, i_48_ >> 16, i_47_ >> 16);
			i_48_ += i_49_;
			i_47_ += i_50_;
			i_44_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_45_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_44_, 0, i_46_ >> 16, i_47_ >> 16);
			i_46_ += i_51_;
			i_47_ += i_50_;
			i_44_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		} else {
		    i_45_ -= i;
		    i -= i_44_;
		    i_44_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    while (--i >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_44_, 0, i_47_ >> 16, i_48_ >> 16);
			i_48_ += i_49_;
			i_47_ += i_50_;
			i_44_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		    while (--i_45_ >= 0) {
			method17915((((Class241_Sub39_Sub17_Sub2) this)
				     .aByteArray11480),
				    i_44_, 0, i_47_ >> 16, i_46_ >> 16);
			i_46_ += i_51_;
			i_47_ += i_50_;
			i_44_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		    }
		}
	    }
	} else if (i < i_44_) {
	    i_47_ = i_48_ <<= 16;
	    if (i_45_ < 0) {
		i_47_ -= i_50_ * i_45_;
		i_48_ -= i_51_ * i_45_;
		i_45_ = 0;
	    }
	    i_46_ <<= 16;
	    if (i < 0) {
		i_46_ -= i_49_ * i;
		i = 0;
	    }
	    if (i_50_ < i_51_) {
		i_44_ -= i;
		i -= i_45_;
		i_45_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		while (--i >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_45_, 0, i_47_ >> 16, i_48_ >> 16);
		    i_47_ += i_50_;
		    i_48_ += i_51_;
		    i_45_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
		while (--i_44_ >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_45_, 0, i_47_ >> 16, i_46_ >> 16);
		    i_47_ += i_50_;
		    i_46_ += i_49_;
		    i_45_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
	    } else {
		i_44_ -= i;
		i -= i_45_;
		i_45_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		while (--i >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_45_, 0, i_48_ >> 16, i_47_ >> 16);
		    i_47_ += i_50_;
		    i_48_ += i_51_;
		    i_45_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
		while (--i_44_ >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_45_, 0, i_46_ >> 16, i_47_ >> 16);
		    i_47_ += i_50_;
		    i_46_ += i_49_;
		    i_45_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
	    }
	} else {
	    i_46_ = i_48_ <<= 16;
	    if (i_45_ < 0) {
		i_46_ -= i_50_ * i_45_;
		i_48_ -= i_51_ * i_45_;
		i_45_ = 0;
	    }
	    i_47_ <<= 16;
	    if (i_44_ < 0) {
		i_47_ -= i_49_ * i_44_;
		i_44_ = 0;
	    }
	    if (i_50_ < i_51_) {
		i -= i_44_;
		i_44_ -= i_45_;
		i_45_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		while (--i_44_ >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_45_, 0, i_46_ >> 16, i_48_ >> 16);
		    i_46_ += i_50_;
		    i_48_ += i_51_;
		    i_45_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
		while (--i >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_45_, 0, i_47_ >> 16, i_48_ >> 16);
		    i_47_ += i_49_;
		    i_48_ += i_51_;
		    i_45_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
	    } else {
		i -= i_44_;
		i_44_ -= i_45_;
		i_45_ *= ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		while (--i_44_ >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_45_, 0, i_48_ >> 16, i_46_ >> 16);
		    i_46_ += i_50_;
		    i_48_ += i_51_;
		    i_45_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
		while (--i >= 0) {
		    method17915((((Class241_Sub39_Sub17_Sub2) this)
				 .aByteArray11480),
				i_45_, 0, i_48_ >> 16, i_47_ >> 16);
		    i_47_ += i_49_;
		    i_48_ += i_51_;
		    i_45_ += ((Class241_Sub39_Sub17_Sub2) this).anInt11477;
		}
	    }
	}
    }
    
    static final void method17925(byte[] is, int i, int i_52_, int i_53_,
				  int i_54_) {
	if (i_53_ < i_54_) {
	    i += i_53_;
	    i_52_ = i_54_ - i_53_ >> 2;
	    while (--i_52_ >= 0) {
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
	    }
	    i_52_ = i_54_ - i_53_ & 0x3;
	    while (--i_52_ >= 0)
		is[i++] = (byte) 1;
	}
    }
    
    static final void method17926(byte[] is, int i, int i_55_, int i_56_,
				  int i_57_) {
	if (i_56_ < i_57_) {
	    i += i_56_;
	    i_55_ = i_57_ - i_56_ >> 2;
	    while (--i_55_ >= 0) {
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
	    }
	    i_55_ = i_57_ - i_56_ & 0x3;
	    while (--i_55_ >= 0)
		is[i++] = (byte) 1;
	}
    }
    
    boolean method17927(int i, int i_58_) {
	return (((Class241_Sub39_Sub17_Sub2) this).aByteArray11480.length
		>= i * i_58_);
    }
}
