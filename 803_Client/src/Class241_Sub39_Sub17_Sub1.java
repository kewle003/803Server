/* Class241_Sub39_Sub17_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub39_Sub17_Sub1 extends Class241_Sub39_Sub17
{
    static final int anInt11286 = 16;
    int anInt11287;
    int anInt11288;
    byte[] aByteArray11289;
    int anInt11290;
    int anInt11291;
    
    void method17669() {
	int i = -1;
	int i_0_
	    = ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289.length - 8;
	while (i < i_0_) {
	    ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289[++i] = (byte) 0;
	}
	while (i
	       < ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289.length - 1)
	    ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289[++i] = (byte) 0;
    }
    
    void method17670(int i, int i_1_, int i_2_, int i_3_) {
	((Class241_Sub39_Sub17_Sub1) this).anInt11291 = i;
	((Class241_Sub39_Sub17_Sub1) this).anInt11290 = i_1_;
	((Class241_Sub39_Sub17_Sub1) this).anInt11287 = i_2_ - i;
	((Class241_Sub39_Sub17_Sub1) this).anInt11288 = i_3_ - i_1_;
    }
    
    boolean method17671(int i, int i_4_) {
	return (((Class241_Sub39_Sub17_Sub1) this).aByteArray11289.length
		>= i * i_4_);
    }
    
    void method17672(int i, int i_5_, int i_6_, int i_7_) {
	((Class241_Sub39_Sub17_Sub1) this).anInt11291 = i;
	((Class241_Sub39_Sub17_Sub1) this).anInt11290 = i_5_;
	((Class241_Sub39_Sub17_Sub1) this).anInt11287 = i_6_ - i;
	((Class241_Sub39_Sub17_Sub1) this).anInt11288 = i_7_ - i_5_;
    }
    
    boolean method17673(int i, int i_8_) {
	return (((Class241_Sub39_Sub17_Sub1) this).aByteArray11289.length
		>= i * i_8_);
    }
    
    boolean method17674(int i, int i_9_) {
	return (((Class241_Sub39_Sub17_Sub1) this).aByteArray11289.length
		>= i * i_9_);
    }
    
    static final void method17675(byte[] is, int i, int i_10_, int i_11_,
				  int i_12_) {
	if (i_11_ < i_12_) {
	    i += i_11_;
	    i_10_ = i_12_ - i_11_ >> 2;
	    while (--i_10_ >= 0) {
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
	    }
	    i_10_ = i_12_ - i_11_ & 0x3;
	    while (--i_10_ >= 0)
		is[i++] = (byte) 1;
	}
    }
    
    void method17676(int i, int i_13_, int i_14_, int i_15_, int i_16_,
		     int i_17_) {
	int i_18_ = 0;
	if (i_13_ != i)
	    i_18_ = (i_16_ - i_15_ << 16) / (i_13_ - i);
	int i_19_ = 0;
	if (i_14_ != i_13_)
	    i_19_ = (i_17_ - i_16_ << 16) / (i_14_ - i_13_);
	int i_20_ = 0;
	if (i_14_ != i)
	    i_20_ = (i_15_ - i_17_ << 16) / (i - i_14_);
	if (i <= i_13_ && i <= i_14_) {
	    if (i_13_ < i_14_) {
		i_17_ = i_15_ <<= 16;
		if (i < 0) {
		    i_17_ -= i_20_ * i;
		    i_15_ -= i_18_ * i;
		    i = 0;
		}
		i_16_ <<= 16;
		if (i_13_ < 0) {
		    i_16_ -= i_19_ * i_13_;
		    i_13_ = 0;
		}
		if (i != i_13_ && i_20_ < i_18_
		    || i == i_13_ && i_20_ > i_19_) {
		    i_14_ -= i_13_;
		    i_13_ -= i;
		    i *= ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    while (--i_13_ >= 0) {
			method17675((((Class241_Sub39_Sub17_Sub1) this)
				     .aByteArray11289),
				    i, 0, i_17_ >> 16, i_15_ >> 16);
			i_17_ += i_20_;
			i_15_ += i_18_;
			i += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    }
		    while (--i_14_ >= 0) {
			method17675((((Class241_Sub39_Sub17_Sub1) this)
				     .aByteArray11289),
				    i, 0, i_17_ >> 16, i_16_ >> 16);
			i_17_ += i_20_;
			i_16_ += i_19_;
			i += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    }
		} else {
		    i_14_ -= i_13_;
		    i_13_ -= i;
		    i *= ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    while (--i_13_ >= 0) {
			method17675((((Class241_Sub39_Sub17_Sub1) this)
				     .aByteArray11289),
				    i, 0, i_15_ >> 16, i_17_ >> 16);
			i_17_ += i_20_;
			i_15_ += i_18_;
			i += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    }
		    while (--i_14_ >= 0) {
			method17675((((Class241_Sub39_Sub17_Sub1) this)
				     .aByteArray11289),
				    i, 0, i_16_ >> 16, i_17_ >> 16);
			i_17_ += i_20_;
			i_16_ += i_19_;
			i += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    }
		}
	    } else {
		i_16_ = i_15_ <<= 16;
		if (i < 0) {
		    i_16_ -= i_20_ * i;
		    i_15_ -= i_18_ * i;
		    i = 0;
		}
		i_17_ <<= 16;
		if (i_14_ < 0) {
		    i_17_ -= i_19_ * i_14_;
		    i_14_ = 0;
		}
		if (i != i_14_ && i_20_ < i_18_
		    || i == i_14_ && i_19_ > i_18_) {
		    i_13_ -= i_14_;
		    i_14_ -= i;
		    i *= ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    while (--i_14_ >= 0) {
			method17675((((Class241_Sub39_Sub17_Sub1) this)
				     .aByteArray11289),
				    i, 0, i_16_ >> 16, i_15_ >> 16);
			i_16_ += i_20_;
			i_15_ += i_18_;
			i += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    }
		    while (--i_13_ >= 0) {
			method17675((((Class241_Sub39_Sub17_Sub1) this)
				     .aByteArray11289),
				    i, 0, i_17_ >> 16, i_15_ >> 16);
			i_17_ += i_19_;
			i_15_ += i_18_;
			i += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    }
		} else {
		    i_13_ -= i_14_;
		    i_14_ -= i;
		    i *= ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    while (--i_14_ >= 0) {
			method17675((((Class241_Sub39_Sub17_Sub1) this)
				     .aByteArray11289),
				    i, 0, i_15_ >> 16, i_16_ >> 16);
			i_16_ += i_20_;
			i_15_ += i_18_;
			i += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    }
		    while (--i_13_ >= 0) {
			method17675((((Class241_Sub39_Sub17_Sub1) this)
				     .aByteArray11289),
				    i, 0, i_15_ >> 16, i_17_ >> 16);
			i_17_ += i_19_;
			i_15_ += i_18_;
			i += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    }
		}
	    }
	} else if (i_13_ <= i_14_) {
	    if (i_14_ < i) {
		i_15_ = i_16_ <<= 16;
		if (i_13_ < 0) {
		    i_15_ -= i_18_ * i_13_;
		    i_16_ -= i_19_ * i_13_;
		    i_13_ = 0;
		}
		i_17_ <<= 16;
		if (i_14_ < 0) {
		    i_17_ -= i_20_ * i_14_;
		    i_14_ = 0;
		}
		if (i_13_ != i_14_ && i_18_ < i_19_
		    || i_13_ == i_14_ && i_18_ > i_20_) {
		    i -= i_14_;
		    i_14_ -= i_13_;
		    i_13_ *= ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    while (--i_14_ >= 0) {
			method17675((((Class241_Sub39_Sub17_Sub1) this)
				     .aByteArray11289),
				    i_13_, 0, i_15_ >> 16, i_16_ >> 16);
			i_15_ += i_18_;
			i_16_ += i_19_;
			i_13_ += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    }
		    while (--i >= 0) {
			method17675((((Class241_Sub39_Sub17_Sub1) this)
				     .aByteArray11289),
				    i_13_, 0, i_15_ >> 16, i_17_ >> 16);
			i_15_ += i_18_;
			i_17_ += i_20_;
			i_13_ += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    }
		} else {
		    i -= i_14_;
		    i_14_ -= i_13_;
		    i_13_ *= ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    while (--i_14_ >= 0) {
			method17675((((Class241_Sub39_Sub17_Sub1) this)
				     .aByteArray11289),
				    i_13_, 0, i_16_ >> 16, i_15_ >> 16);
			i_15_ += i_18_;
			i_16_ += i_19_;
			i_13_ += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    }
		    while (--i >= 0) {
			method17675((((Class241_Sub39_Sub17_Sub1) this)
				     .aByteArray11289),
				    i_13_, 0, i_17_ >> 16, i_15_ >> 16);
			i_15_ += i_18_;
			i_17_ += i_20_;
			i_13_ += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    }
		}
	    } else {
		i_17_ = i_16_ <<= 16;
		if (i_13_ < 0) {
		    i_17_ -= i_18_ * i_13_;
		    i_16_ -= i_19_ * i_13_;
		    i_13_ = 0;
		}
		i_15_ <<= 16;
		if (i < 0) {
		    i_15_ -= i_20_ * i;
		    i = 0;
		}
		if (i_18_ < i_19_) {
		    i_14_ -= i;
		    i -= i_13_;
		    i_13_ *= ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    while (--i >= 0) {
			method17675((((Class241_Sub39_Sub17_Sub1) this)
				     .aByteArray11289),
				    i_13_, 0, i_17_ >> 16, i_16_ >> 16);
			i_17_ += i_18_;
			i_16_ += i_19_;
			i_13_ += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    }
		    while (--i_14_ >= 0) {
			method17675((((Class241_Sub39_Sub17_Sub1) this)
				     .aByteArray11289),
				    i_13_, 0, i_15_ >> 16, i_16_ >> 16);
			i_15_ += i_20_;
			i_16_ += i_19_;
			i_13_ += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    }
		} else {
		    i_14_ -= i;
		    i -= i_13_;
		    i_13_ *= ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    while (--i >= 0) {
			method17675((((Class241_Sub39_Sub17_Sub1) this)
				     .aByteArray11289),
				    i_13_, 0, i_16_ >> 16, i_17_ >> 16);
			i_17_ += i_18_;
			i_16_ += i_19_;
			i_13_ += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    }
		    while (--i_14_ >= 0) {
			method17675((((Class241_Sub39_Sub17_Sub1) this)
				     .aByteArray11289),
				    i_13_, 0, i_16_ >> 16, i_15_ >> 16);
			i_15_ += i_20_;
			i_16_ += i_19_;
			i_13_ += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		    }
		}
	    }
	} else if (i < i_13_) {
	    i_16_ = i_17_ <<= 16;
	    if (i_14_ < 0) {
		i_16_ -= i_19_ * i_14_;
		i_17_ -= i_20_ * i_14_;
		i_14_ = 0;
	    }
	    i_15_ <<= 16;
	    if (i < 0) {
		i_15_ -= i_18_ * i;
		i = 0;
	    }
	    if (i_19_ < i_20_) {
		i_13_ -= i;
		i -= i_14_;
		i_14_ *= ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		while (--i >= 0) {
		    method17675((((Class241_Sub39_Sub17_Sub1) this)
				 .aByteArray11289),
				i_14_, 0, i_16_ >> 16, i_17_ >> 16);
		    i_16_ += i_19_;
		    i_17_ += i_20_;
		    i_14_ += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		}
		while (--i_13_ >= 0) {
		    method17675((((Class241_Sub39_Sub17_Sub1) this)
				 .aByteArray11289),
				i_14_, 0, i_16_ >> 16, i_15_ >> 16);
		    i_16_ += i_19_;
		    i_15_ += i_18_;
		    i_14_ += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		}
	    } else {
		i_13_ -= i;
		i -= i_14_;
		i_14_ *= ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		while (--i >= 0) {
		    method17675((((Class241_Sub39_Sub17_Sub1) this)
				 .aByteArray11289),
				i_14_, 0, i_17_ >> 16, i_16_ >> 16);
		    i_16_ += i_19_;
		    i_17_ += i_20_;
		    i_14_ += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		}
		while (--i_13_ >= 0) {
		    method17675((((Class241_Sub39_Sub17_Sub1) this)
				 .aByteArray11289),
				i_14_, 0, i_15_ >> 16, i_16_ >> 16);
		    i_16_ += i_19_;
		    i_15_ += i_18_;
		    i_14_ += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		}
	    }
	} else {
	    i_15_ = i_17_ <<= 16;
	    if (i_14_ < 0) {
		i_15_ -= i_19_ * i_14_;
		i_17_ -= i_20_ * i_14_;
		i_14_ = 0;
	    }
	    i_16_ <<= 16;
	    if (i_13_ < 0) {
		i_16_ -= i_18_ * i_13_;
		i_13_ = 0;
	    }
	    if (i_19_ < i_20_) {
		i -= i_13_;
		i_13_ -= i_14_;
		i_14_ *= ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		while (--i_13_ >= 0) {
		    method17675((((Class241_Sub39_Sub17_Sub1) this)
				 .aByteArray11289),
				i_14_, 0, i_15_ >> 16, i_17_ >> 16);
		    i_15_ += i_19_;
		    i_17_ += i_20_;
		    i_14_ += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		}
		while (--i >= 0) {
		    method17675((((Class241_Sub39_Sub17_Sub1) this)
				 .aByteArray11289),
				i_14_, 0, i_16_ >> 16, i_17_ >> 16);
		    i_16_ += i_18_;
		    i_17_ += i_20_;
		    i_14_ += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		}
	    } else {
		i -= i_13_;
		i_13_ -= i_14_;
		i_14_ *= ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		while (--i_13_ >= 0) {
		    method17675((((Class241_Sub39_Sub17_Sub1) this)
				 .aByteArray11289),
				i_14_, 0, i_17_ >> 16, i_15_ >> 16);
		    i_15_ += i_19_;
		    i_17_ += i_20_;
		    i_14_ += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		}
		while (--i >= 0) {
		    method17675((((Class241_Sub39_Sub17_Sub1) this)
				 .aByteArray11289),
				i_14_, 0, i_17_ >> 16, i_16_ >> 16);
		    i_16_ += i_18_;
		    i_17_ += i_20_;
		    i_14_ += ((Class241_Sub39_Sub17_Sub1) this).anInt11287;
		}
	    }
	}
    }
    
    Class241_Sub39_Sub17_Sub1(Class103_Sub3 class103_sub3, int i, int i_21_) {
	((Class241_Sub39_Sub17_Sub1) this).aByteArray11289
	    = new byte[i * i_21_];
    }
    
    boolean method17677(int i, int i_22_) {
	return (((Class241_Sub39_Sub17_Sub1) this).aByteArray11289.length
		>= i * i_22_);
    }
    
    void method17678() {
	int i = -1;
	int i_23_
	    = ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289.length - 8;
	while (i < i_23_) {
	    ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289[++i] = (byte) 0;
	    ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289[++i] = (byte) 0;
	}
	while (i
	       < ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289.length - 1)
	    ((Class241_Sub39_Sub17_Sub1) this).aByteArray11289[++i] = (byte) 0;
    }
    
    static final void method17679(byte[] is, int i, int i_24_, int i_25_,
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
}
