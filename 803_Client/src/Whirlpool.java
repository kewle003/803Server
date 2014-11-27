/* Class626 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Whirlpool
{
    static long[] rc;//aLongArray7968
    public static final int anInt7969 = 64;
    static final int R = 10;//anInt7970
    static final String sbox/*aString7971*/
	= "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886";
    static long[][] C = new long[8][256];//aLongArrayArray7972
    byte[] buffer;//aByteArray7973
    byte[] bitLength = new byte[32];//aByteArray7974
    long[] state;//aLongArray7975
    int bufferBits;//anInt7976
    int bufferPos;//anInt7977
    long[] hash;//aLongArray7978
    long[] K;//aLongArray7979
    long[] L;//aLongArray7980
    long[] block;//aLongArray7981
    static final int DIGESTBITS = 512;//anInt7982
    
    void dummyMethod13446() {
	int i = 0;
	int i_0_ = 0;
	while (i < 8) {
	    block[i]
		= ((long) buffer[i_0_] << 56
		   ^ ((long) buffer[1 + i_0_]
		      & 0xffL) << 48
		   ^ ((long) buffer[2 + i_0_]
		      & 0xffL) << 40
		   ^ ((long) buffer[i_0_ + 3]
		      & 0xffL) << 32
		   ^ ((long) buffer[4 + i_0_]
		      & 0xffL) << 24
		   ^ ((long) buffer[5 + i_0_]
		      & 0xffL) << 16
		   ^ ((long) buffer[i_0_ + 6]
		      & 0xffL) << 8
		   ^ ((long) buffer[i_0_ + 7]
		      & 0xffL));
	    i++;
	    i_0_ += 8;
	}
	for (i = 0; i < 8; i++)
	    state[i]
		= (block[i]
		   ^ (K[i]
		      = hash[i]));
	for (i = 1; i <= 10; i++) {
	    for (i_0_ = 0; i_0_ < 8; i_0_++) {
		L[i_0_] = 0L;
		int i_1_ = 0;
		int i_2_ = 56;
		while (i_1_ < 8) {
		    L[i_0_]
			^= (C[i_1_]
			    [(int) ((K
				     [i_0_ - i_1_ & 0x7])
				    >>> i_2_) & 0xff]);
		    i_1_++;
		    i_2_ -= 8;
		}
	    }
	    for (i_0_ = 0; i_0_ < 8; i_0_++)
		K[i_0_]
		    = L[i_0_];
	    K[0] ^= rc[i];
	    for (i_0_ = 0; i_0_ < 8; i_0_++) {
		L[i_0_]
		    = K[i_0_];
		int i_3_ = 0;
		int i_4_ = 56;
		while (i_3_ < 8) {
		    L[i_0_]
			^= (C[i_3_]
			    [(int) ((state
				     [i_0_ - i_3_ & 0x7])
				    >>> i_4_) & 0xff]);
		    i_3_++;
		    i_4_ -= 8;
		}
	    }
	    for (i_0_ = 0; i_0_ < 8; i_0_++)
		state[i_0_]
		    = L[i_0_];
	}
	for (i = 0; i < 8; i++)
	    hash[i]
		^= (state[i]
		    ^ block[i]);
    }
    
    void processBuffer/*method13447*/(byte i) {
		int i_5_ = 0;
		int i_6_ = 0;
		while (i_5_ < 8) {
		    block[i_5_]
			= ((long) buffer[i_6_] << 56
			   ^ ((long) buffer[1 + i_6_]
			      & 0xffL) << 48
			   ^ ((long) buffer[2 + i_6_]
			      & 0xffL) << 40
			   ^ ((long) buffer[i_6_ + 3]
			      & 0xffL) << 32
			   ^ ((long) buffer[4 + i_6_]
			      & 0xffL) << 24
			   ^ ((long) buffer[5 + i_6_]
			      & 0xffL) << 16
			   ^ ((long) buffer[i_6_ + 6]
			      & 0xffL) << 8
			   ^ ((long) buffer[i_6_ + 7]
			      & 0xffL));
		    i_5_++;
		    i_6_ += 8;
		}
		for (i_5_ = 0; i_5_ < 8; i_5_++) {
		    state[i_5_] = (block[i_5_] ^ (K[i_5_] = hash[i_5_]));
		}
		for (i_5_ = 1; i_5_ <= 10; i_5_++) {
		    for (i_6_ = 0; i_6_ < 8; i_6_++) {
				L[i_6_] = 0L;
				int i_7_ = 0;
				int i_8_ = 56;
				while (i_7_ < 8) {
				    L[i_6_]
					^= (C[i_7_]
					    [(int) ((K
						     [i_6_ - i_7_ & 0x7])
						    >>> i_8_) & 0xff]);
				    i_7_++;
				    i_8_ -= 8;
				}
		    }
		    for (i_6_ = 0; i_6_ < 8; i_6_++)
			K[i_6_]
			    = L[i_6_];
		    K[0] ^= rc[i_5_];
		    for (i_6_ = 0; i_6_ < 8; i_6_++) {
			L[i_6_]
			    = K[i_6_];
			int i_9_ = 0;
			int i_10_ = 56;
			while (i_9_ < 8) {
			    L[i_6_]
				^= (C[i_9_]
				    [(int) ((state
					     [i_6_ - i_9_ & 0x7])
					    >>> i_10_) & 0xff]);
			    i_9_++;
			    i_10_ -= 8;
			}
		    }
		    for (i_6_ = 0; i_6_ < 8; i_6_++)
			state[i_6_]
			    = L[i_6_];
		}
		for (i_5_ = 0; i_5_ < 8; i_5_++)
		    hash[i_5_]
			^= (state[i_5_]
			    ^ block[i_5_]);
    }
    
    void NESSIEinit/*method13448*/(int i) {
		for (int i_11_ = 0; i_11_ < 32; i_11_++) {
		    bitLength[i_11_] = (byte) 0;
		}
		bufferPos = 0;
		bufferBits = 0;
		buffer[0] = (byte) 0;
		for (int i_12_ = 0; i_12_ < 8; i_12_++) {
		    hash[i_12_] = 0L;
		}
    }
    
    void NESSIEadd/*method13449*/(byte[] source, long sourceBits) {
		int sourcePos = 0;
		int sourceGap = 8 - ((int) sourceBits & 0x7) & 0x7;
		int bufferRem = -155593333 * bufferBits & 0x7;
		long value = sourceBits;
		int i_16_ = 31;
		int carry = 0;
		for (/**/; i_16_ >= 0; i_16_--) {
			carry += (((int) value & 0xff) + (bitLength[i_16_] & 0xff));
		    bitLength[i_16_] = (byte) carry;
		    carry >>>= 8;
			value >>>= 8;
		}
		while (sourceBits > 8L) {
		    int b = source[sourcePos] << sourceGap & 0xff | (source[1 + sourcePos] & 0xff) >>> 8 - sourceGap;
		    if (b < 0 || b >= 256) {
		    	throw new RuntimeException();
		    }
		    buffer[(-781608953 * bufferPos)] |= b >>> bufferRem;
		    bufferPos += -1423551049;
		    bufferBits += (8 - bufferRem) * -1098044893;
		    if (-155593333 * bufferBits == 512) {
			processBuffer((byte) 39);
			bufferPos = 0;
			bufferBits = 0;
		    }
		    buffer[(bufferPos * -781608953)] = (byte) (b << 8 - bufferRem & 0xff);
		    bufferBits += -1098044893 * bufferRem;
		    sourceBits -= 8L;
		    sourcePos++;
		}
		int i_19_;
		if (sourceBits > 0L) {
		    i_19_ = source[sourcePos] << sourceGap & 0xff;
		    buffer[(-781608953 * bufferPos)] |= i_19_ >>> bufferRem;
		} else {
		    i_19_ = 0;
		}
		if (sourceBits + (long) bufferRem < 8L) {
		    bufferBits += sourceBits * -1098044893L;
		} else {
		    bufferPos += -1423551049;
		    bufferBits += (8 - bufferRem) * -1098044893;
		    sourceBits -= (long) (8 - bufferRem);
		    if (512 == bufferBits * -155593333) {
				processBuffer((byte) 24);
				bufferPos = 0;
				bufferBits = 0;
		    }
		    buffer[(bufferPos * -781608953)] = (byte) (i_19_ << 8 - bufferRem & 0xff);
		    bufferBits += -1098044893 * (int) sourceBits;
		}
    }
    
    void method13450() {
	for (int i = 0; i < 32; i++)
	    bitLength[i] = (byte) 0;
	bufferPos = 0;
	bufferBits = 0;
	buffer[0] = (byte) 0;
	for (int i = 0; i < 8; i++)
	    hash[i] = 0L;
    }
    
    static {
		rc = new long[11];
		for (int i = 0; i < 256; i++) {
		    int i_20_
			= "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886"
			      .charAt(i / 2);
		    long l = ((i & 0x1) == 0 ? (long) (i_20_ >>> 8)
			      : (long) (i_20_ & 0xff));
		    long l_21_ = l << 1;
		    if (l_21_ >= 256L)
			l_21_ ^= 0x11dL;
		    long l_22_ = l_21_ << 1;
		    if (l_22_ >= 256L)
			l_22_ ^= 0x11dL;
		    long l_23_ = l_22_ ^ l;
		    long l_24_ = l_22_ << 1;
		    if (l_24_ >= 256L)
			l_24_ ^= 0x11dL;
		    long l_25_ = l_24_ ^ l;
		    C[0][i]
			= (l << 56 | l << 48 | l_22_ << 40 | l << 32 | l_24_ << 24
			   | l_23_ << 16 | l_21_ << 8 | l_25_);
		    for (int i_26_ = 1; i_26_ < 8; i_26_++)
			C[i_26_][i]
			    = (C[i_26_ - 1][i] >>> 8
			       | C[i_26_ - 1][i] << 56);
		}
		rc[0] = 0L;
		for (int i = 1; i <= 10; i++) {
		    int i_27_ = (i - 1) * 8;
		    rc[i]
			= (C[0][i_27_] & ~0xffffffffffffffL
			   ^ C[1][1 + i_27_] & 0xff000000000000L
			   ^ C[2][2 + i_27_] & 0xff0000000000L
			   ^ C[3][i_27_ + 3] & 0xff00000000L
			   ^ C[4][4 + i_27_] & 0xff000000L
			   ^ C[5][5 + i_27_] & 0xff0000L
			   ^ C[6][6 + i_27_] & 0xff00L
			   ^ C[7][7 + i_27_] & 0xffL);
		}
    }
    
    void method13451() {
	int i = 0;
	int i_28_ = 0;
	while (i < 8) {
	    block[i]
		= ((long) buffer[i_28_] << 56
		   ^ ((long) buffer[1 + i_28_]
		      & 0xffL) << 48
		   ^ ((long) buffer[2 + i_28_]
		      & 0xffL) << 40
		   ^ ((long) buffer[i_28_ + 3]
		      & 0xffL) << 32
		   ^ ((long) buffer[4 + i_28_]
		      & 0xffL) << 24
		   ^ ((long) buffer[5 + i_28_]
		      & 0xffL) << 16
		   ^ ((long) buffer[i_28_ + 6]
		      & 0xffL) << 8
		   ^ ((long) buffer[i_28_ + 7]
		      & 0xffL));
	    i++;
	    i_28_ += 8;
	}
	for (i = 0; i < 8; i++)
	    state[i]
		= (block[i]
		   ^ (K[i]
		      = hash[i]));
	for (i = 1; i <= 10; i++) {
	    for (i_28_ = 0; i_28_ < 8; i_28_++) {
		L[i_28_] = 0L;
		int i_29_ = 0;
		int i_30_ = 56;
		while (i_29_ < 8) {
		    L[i_28_]
			^= (C[i_29_]
			    [(int) ((K
				     [i_28_ - i_29_ & 0x7])
				    >>> i_30_) & 0xff]);
		    i_29_++;
		    i_30_ -= 8;
		}
	    }
	    for (i_28_ = 0; i_28_ < 8; i_28_++)
		K[i_28_]
		    = L[i_28_];
	    K[0] ^= rc[i];
	    for (i_28_ = 0; i_28_ < 8; i_28_++) {
		L[i_28_]
		    = K[i_28_];
		int i_31_ = 0;
		int i_32_ = 56;
		while (i_31_ < 8) {
		    L[i_28_]
			^= (C[i_31_]
			    [(int) ((state
				     [i_28_ - i_31_ & 0x7])
				    >>> i_32_) & 0xff]);
		    i_31_++;
		    i_32_ -= 8;
		}
	    }
	    for (i_28_ = 0; i_28_ < 8; i_28_++)
		state[i_28_]
		    = L[i_28_];
	}
	for (i = 0; i < 8; i++)
	    hash[i]
		^= (state[i]
		    ^ block[i]);
    }
    
    void method13452(byte[] is, long l) {
	int i = 0;
	int i_33_ = 8 - ((int) l & 0x7) & 0x7;
	int i_34_ = -155593333 * bufferBits & 0x7;
	long l_35_ = l;
	int i_36_ = 31;
	int i_37_ = 0;
	for (/**/; i_36_ >= 0; i_36_--) {
	    i_37_ += (((int) l_35_ & 0xff)
		      + (bitLength[i_36_] & 0xff));
	    bitLength[i_36_] = (byte) i_37_;
	    i_37_ >>>= 8;
	    l_35_ >>>= 8;
	}
	while (l > 8L) {
	    int i_38_
		= is[i] << i_33_ & 0xff | (is[1 + i] & 0xff) >>> 8 - i_33_;
	    if (i_38_ < 0 || i_38_ >= 256)
		throw new RuntimeException();
	    buffer[(-781608953
					      * bufferPos)]
		|= i_38_ >>> i_34_;
	    bufferPos += -1423551049;
	    bufferBits += (8 - i_34_) * -1098044893;
	    if (-155593333 * bufferBits == 512) {
		processBuffer((byte) 29);
		bufferPos = 0;
		bufferBits = 0;
	    }
	    buffer[(bufferPos
					      * -781608953)]
		= (byte) (i_38_ << 8 - i_34_ & 0xff);
	    bufferBits += -1098044893 * i_34_;
	    l -= 8L;
	    i++;
	}
	int i_39_;
	if (l > 0L) {
	    i_39_ = is[i] << i_33_ & 0xff;
	    buffer[(-781608953
					      * bufferPos)]
		|= i_39_ >>> i_34_;
	} else
	    i_39_ = 0;
	if (l + (long) i_34_ < 8L)
	    bufferBits += l * -1098044893L;
	else {
	    bufferPos += -1423551049;
	    bufferBits += (8 - i_34_) * -1098044893;
	    l -= (long) (8 - i_34_);
	    if (512 == bufferBits * -155593333) {
		processBuffer((byte) 77);
		bufferPos = 0;
		bufferBits = 0;
	    }
	    buffer[(bufferPos
					      * -781608953)]
		= (byte) (i_39_ << 8 - i_34_ & 0xff);
	    bufferBits += -1098044893 * (int) l;
	}
    }
    
    Whirlpool() {
		buffer = new byte[64];
		bufferBits = 0;
		bufferPos = 0;
		hash = new long[8];
		K = new long[8];
		L = new long[8];
		block = new long[8];
		state = new long[8];
    }
    
    void method13453() {
	int i = 0;
	int i_40_ = 0;
	while (i < 8) {
	    block[i]
		= ((long) buffer[i_40_] << 56
		   ^ ((long) buffer[1 + i_40_]
		      & 0xffL) << 48
		   ^ ((long) buffer[2 + i_40_]
		      & 0xffL) << 40
		   ^ ((long) buffer[i_40_ + 3]
		      & 0xffL) << 32
		   ^ ((long) buffer[4 + i_40_]
		      & 0xffL) << 24
		   ^ ((long) buffer[5 + i_40_]
		      & 0xffL) << 16
		   ^ ((long) buffer[i_40_ + 6]
		      & 0xffL) << 8
		   ^ ((long) buffer[i_40_ + 7]
		      & 0xffL));
	    i++;
	    i_40_ += 8;
	}
	for (i = 0; i < 8; i++)
	    state[i]
		= (block[i]
		   ^ (K[i]
		      = hash[i]));
	for (i = 1; i <= 10; i++) {
	    for (i_40_ = 0; i_40_ < 8; i_40_++) {
		L[i_40_] = 0L;
		int i_41_ = 0;
		int i_42_ = 56;
		while (i_41_ < 8) {
		    L[i_40_]
			^= (C[i_41_]
			    [(int) ((K
				     [i_40_ - i_41_ & 0x7])
				    >>> i_42_) & 0xff]);
		    i_41_++;
		    i_42_ -= 8;
		}
	    }
	    for (i_40_ = 0; i_40_ < 8; i_40_++)
		K[i_40_]
		    = L[i_40_];
	    K[0] ^= rc[i];
	    for (i_40_ = 0; i_40_ < 8; i_40_++) {
		L[i_40_]
		    = K[i_40_];
		int i_43_ = 0;
		int i_44_ = 56;
		while (i_43_ < 8) {
		    L[i_40_]
			^= (C[i_43_]
			    [(int) ((state
				     [i_40_ - i_43_ & 0x7])
				    >>> i_44_) & 0xff]);
		    i_43_++;
		    i_44_ -= 8;
		}
	    }
	    for (i_40_ = 0; i_40_ < 8; i_40_++)
		state[i_40_]
		    = L[i_40_];
	}
	for (i = 0; i < 8; i++)
	    hash[i]
		^= (state[i]
		    ^ block[i]);
    }
    
    void NESSIEfinalize/*method13454*/(byte[] digest, int i, int i_45_) {
		buffer[(bufferPos * -781608953)]
		    |= 128 >>> (bufferBits * -155593333 & 0x7);
		bufferPos += -1423551049;
		if (bufferPos * -781608953 > 32) {
		    while (-781608953 * bufferPos < 64)
			buffer[((bufferPos
							   += -1423551049) * -781608953
							  - 1)]
			    = (byte) 0;
		    processBuffer((byte) 88);
		    bufferPos = 0;
		}
		while (-781608953 * bufferPos < 32) {
		    buffer[(bufferPos += -1423551049) * -781608953 - 1] = (byte) 0;
		}
		System.arraycopy(bitLength, 0, buffer, 32, 32);
		processBuffer((byte) 124);
		int i_46_ = 0;
		int i_47_ = i;
		while (i_46_ < 8) {
		    long l = hash[i_46_];
		    digest[i_47_] = (byte) (int) (l >>> 56);
		    digest[1 + i_47_] = (byte) (int) (l >>> 48);
		    digest[2 + i_47_] = (byte) (int) (l >>> 40);
		    digest[i_47_ + 3] = (byte) (int) (l >>> 32);
		    digest[4 + i_47_] = (byte) (int) (l >>> 24);
		    digest[5 + i_47_] = (byte) (int) (l >>> 16);
		    digest[6 + i_47_] = (byte) (int) (l >>> 8);
		    digest[i_47_ + 7] = (byte) (int) l;
		    i_46_++;
		    i_47_ += 8;
		}
    }
    
    public static byte[] method13455(byte[] is, int i, int i_48_) {
		byte[] is_49_;
		if (i > 0) {
		    is_49_ = new byte[i_48_];
		    for (int i_50_ = 0; i_50_ < i_48_; i_50_++)
			is_49_[i_50_] = is[i_50_ + i];
		} else
		    is_49_ = is;
		Whirlpool class626 = new Whirlpool();
		class626.NESSIEinit(-1850229318);
		class626.NESSIEadd(is_49_, (long) (8 * i_48_));
		byte[] is_51_ = new byte[64];
		class626.NESSIEfinalize(is_51_, 0, 1380097884);
		return is_51_;
    }
    
    void method13456(byte[] is, int i) {
	buffer[(bufferPos
					  * -781608953)]
	    |= 128 >>> (bufferBits * -155593333 & 0x7);
	bufferPos += -1423551049;
	if (bufferPos * -781608953 > 32) {
	    while (-781608953 * bufferPos < 64)
		buffer[((bufferPos
						   += -1423551049) * -781608953
						  - 1)]
		    = (byte) 0;
	    processBuffer((byte) 107);
	    bufferPos = 0;
	}
	while (-781608953 * bufferPos < 32)
	    buffer
		[(bufferPos += -1423551049) * -781608953 - 1]
		= (byte) 0;
	System.arraycopy(bitLength, 0,
			 buffer, 32, 32);
	processBuffer((byte) 127);
	int i_52_ = 0;
	int i_53_ = i;
	while (i_52_ < 8) {
	    long l = hash[i_52_];
	    is[i_53_] = (byte) (int) (l >>> 56);
	    is[1 + i_53_] = (byte) (int) (l >>> 48);
	    is[2 + i_53_] = (byte) (int) (l >>> 40);
	    is[i_53_ + 3] = (byte) (int) (l >>> 32);
	    is[4 + i_53_] = (byte) (int) (l >>> 24);
	    is[5 + i_53_] = (byte) (int) (l >>> 16);
	    is[6 + i_53_] = (byte) (int) (l >>> 8);
	    is[i_53_ + 7] = (byte) (int) l;
	    i_52_++;
	    i_53_ += 8;
	}
    }
    
    void method13457(byte[] is, int i) {
	buffer[(bufferPos
					  * -781608953)]
	    |= 128 >>> (bufferBits * -155593333 & 0x7);
	bufferPos += -1423551049;
	if (bufferPos * -781608953 > 32) {
	    while (-781608953 * bufferPos < 64)
		buffer[((bufferPos
						   += -1423551049) * -781608953
						  - 1)]
		    = (byte) 0;
	    processBuffer((byte) 76);
	    bufferPos = 0;
	}
	while (-781608953 * bufferPos < 32)
	    buffer
		[(bufferPos += -1423551049) * -781608953 - 1]
		= (byte) 0;
	System.arraycopy(bitLength, 0,
			 buffer, 32, 32);
	processBuffer((byte) 119);
	int i_54_ = 0;
	int i_55_ = i;
	while (i_54_ < 8) {
	    long l = hash[i_54_];
	    is[i_55_] = (byte) (int) (l >>> 56);
	    is[1 + i_55_] = (byte) (int) (l >>> 48);
	    is[2 + i_55_] = (byte) (int) (l >>> 40);
	    is[i_55_ + 3] = (byte) (int) (l >>> 32);
	    is[4 + i_55_] = (byte) (int) (l >>> 24);
	    is[5 + i_55_] = (byte) (int) (l >>> 16);
	    is[6 + i_55_] = (byte) (int) (l >>> 8);
	    is[i_55_ + 7] = (byte) (int) l;
	    i_54_++;
	    i_55_ += 8;
	}
    }
    
    void method13458(byte[] is, int i) {
	buffer[(bufferPos
					  * -781608953)]
	    |= 128 >>> (bufferBits * -155593333 & 0x7);
	bufferPos += -1423551049;
	if (bufferPos * -781608953 > 32) {
	    while (-781608953 * bufferPos < 64)
		buffer[((bufferPos
						   += -1423551049) * -781608953
						  - 1)]
		    = (byte) 0;
	    processBuffer((byte) 58);
	    bufferPos = 0;
	}
	while (-781608953 * bufferPos < 32)
	    buffer
		[(bufferPos += -1423551049) * -781608953 - 1]
		= (byte) 0;
	System.arraycopy(bitLength, 0,
			 buffer, 32, 32);
	processBuffer((byte) 103);
	int i_56_ = 0;
	int i_57_ = i;
	while (i_56_ < 8) {
	    long l = hash[i_56_];
	    is[i_57_] = (byte) (int) (l >>> 56);
	    is[1 + i_57_] = (byte) (int) (l >>> 48);
	    is[2 + i_57_] = (byte) (int) (l >>> 40);
	    is[i_57_ + 3] = (byte) (int) (l >>> 32);
	    is[4 + i_57_] = (byte) (int) (l >>> 24);
	    is[5 + i_57_] = (byte) (int) (l >>> 16);
	    is[6 + i_57_] = (byte) (int) (l >>> 8);
	    is[i_57_ + 7] = (byte) (int) l;
	    i_56_++;
	    i_57_ += 8;
	}
    }
    
    void method13459(byte[] is, int i) {
	buffer[(bufferPos
					  * -781608953)]
	    |= 128 >>> (bufferBits * -155593333 & 0x7);
	bufferPos += -1423551049;
	if (bufferPos * -781608953 > 32) {
	    while (-781608953 * bufferPos < 64)
		buffer[((bufferPos
						   += -1423551049) * -781608953
						  - 1)]
		    = (byte) 0;
	    processBuffer((byte) 117);
	    bufferPos = 0;
	}
	while (-781608953 * bufferPos < 32)
	    buffer
		[(bufferPos += -1423551049) * -781608953 - 1]
		= (byte) 0;
	System.arraycopy(bitLength, 0,
			 buffer, 32, 32);
	processBuffer((byte) 30);
	int i_58_ = 0;
	int i_59_ = i;
	while (i_58_ < 8) {
	    long l = hash[i_58_];
	    is[i_59_] = (byte) (int) (l >>> 56);
	    is[1 + i_59_] = (byte) (int) (l >>> 48);
	    is[2 + i_59_] = (byte) (int) (l >>> 40);
	    is[i_59_ + 3] = (byte) (int) (l >>> 32);
	    is[4 + i_59_] = (byte) (int) (l >>> 24);
	    is[5 + i_59_] = (byte) (int) (l >>> 16);
	    is[6 + i_59_] = (byte) (int) (l >>> 8);
	    is[i_59_ + 7] = (byte) (int) l;
	    i_58_++;
	    i_59_ += 8;
	}
    }
    
    void method13460() {
	int i = 0;
	int i_60_ = 0;
	while (i < 8) {
	    block[i]
		= ((long) buffer[i_60_] << 56
		   ^ ((long) buffer[1 + i_60_]
		      & 0xffL) << 48
		   ^ ((long) buffer[2 + i_60_]
		      & 0xffL) << 40
		   ^ ((long) buffer[i_60_ + 3]
		      & 0xffL) << 32
		   ^ ((long) buffer[4 + i_60_]
		      & 0xffL) << 24
		   ^ ((long) buffer[5 + i_60_]
		      & 0xffL) << 16
		   ^ ((long) buffer[i_60_ + 6]
		      & 0xffL) << 8
		   ^ ((long) buffer[i_60_ + 7]
		      & 0xffL));
	    i++;
	    i_60_ += 8;
	}
	for (i = 0; i < 8; i++)
	    state[i]
		= (block[i]
		   ^ (K[i]
		      = hash[i]));
	for (i = 1; i <= 10; i++) {
	    for (i_60_ = 0; i_60_ < 8; i_60_++) {
		L[i_60_] = 0L;
		int i_61_ = 0;
		int i_62_ = 56;
		while (i_61_ < 8) {
		    L[i_60_]
			^= (C[i_61_]
			    [(int) ((K
				     [i_60_ - i_61_ & 0x7])
				    >>> i_62_) & 0xff]);
		    i_61_++;
		    i_62_ -= 8;
		}
	    }
	    for (i_60_ = 0; i_60_ < 8; i_60_++)
		K[i_60_]
		    = L[i_60_];
	    K[0] ^= rc[i];
	    for (i_60_ = 0; i_60_ < 8; i_60_++) {
		L[i_60_]
		    = K[i_60_];
		int i_63_ = 0;
		int i_64_ = 56;
		while (i_63_ < 8) {
		    L[i_60_]
			^= (C[i_63_]
			    [(int) ((state
				     [i_60_ - i_63_ & 0x7])
				    >>> i_64_) & 0xff]);
		    i_63_++;
		    i_64_ -= 8;
		}
	    }
	    for (i_60_ = 0; i_60_ < 8; i_60_++)
		state[i_60_]
		    = L[i_60_];
	}
	for (i = 0; i < 8; i++)
	    hash[i]
		^= (state[i]
		    ^ block[i]);
    }
    
    static final void method13461(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 100;
    }
    
    static final void method13462(ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	Class254.addFriend(string, 1152655890);
    }
    
    static final void method13463(ClientScriptData class454, int i) {
	if (Class66_Sub2.aShortArray10479 == null
	    || (Class72.anInt1099 * -908664087
		>= 678860917 * Class120_Sub16.anInt10563))
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= ((Class66_Sub2.aShortArray10479
		    [(Class72.anInt1099 += 1031673177) * -908664087 - 1])
		   & 0xffff);
    }
}
