/* Class241_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class RSByteBuffer extends Node
{
    public static final int anInt8797 = 100;
    static int[] anIntArray8798 = new int[256];
    public byte[] payload;//aByteArray8799
    public static long[] aLongArray8800;
    public int pointer;//anInt8801
    static final int anInt8802 = -306674912;
    public static final int anInt8803 = 5000;
    static final long aLong8804 = -3932672073523589310L;
    
    public void method14616(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
    }
    
    public void readReverseA/*method14617*/(byte[] output, int offset, int length, int i_1_) {
    	for (int index = length + offset - 1; index >= offset; index--)
    		output[index] = (byte) ((payload[(pointer += -681042949) * 421967667 - 1]) - 128);
    }
    
    public RSByteBuffer(byte[] is) {
	payload = is;
	pointer = 0;
    }
    
    public void method14618(int i) {
	if (null != payload)
	    Class428.method7615(payload, 1723882855);
	payload = null;
    }
    
    public int method14619() {
	pointer += -1362085898;
	int i = (((payload[pointer * 421967667 - 1] & 0xff) << 8)
		 + (payload[pointer * 421967667 - 2] & 0xff));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public void writeShort/*method14620*/(int i, int i_3_) {
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i >> 8);
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
    }
    
    public void method14621(int i, byte i_4_) {
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
    }
    
    public void method14622() {
	if (null != payload)
	    Class428.method7615(payload, -1043160878);
	payload = null;
    }
    
    public void writeInt/*method14623*/(int i, int i_5_) {
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i >> 24);
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i >> 16);
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i >> 8);
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
    }
    
    public int method14624() {
	pointer += 1570795500;
	return (((payload[pointer * 421967667 - 2] & 0xff) << 24)
		+ ((payload[pointer * 421967667 - 1] & 0xff) << 16)
		+ ((payload[421967667 * pointer - 4] & 0xff) << 8)
		+ (payload[421967667 * pointer - 3] & 0xff));
    }
    
    public void method14625(long l) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 32);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 24);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 16);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 8);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) l;
    }
    
    public int method14626() {
	return (0 - payload[(pointer += -681042949) * 421967667 - 1]
		& 0xff);
    }
    
    public void method14627(long l) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 56);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 48);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 40);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 32);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 24);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 16);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 8);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) l;
    }
    
    public void method14628(long l, int i, short i_6_) {
	if (--i < 0 || i > 7)
	    throw new IllegalArgumentException();
	for (int i_7_ = 8 * i; i_7_ >= 0; i_7_ -= 8)
	    payload[(pointer += -681042949) * 421967667 - 1]
		= (byte) (int) (l >> i_7_);
    }
    
    public void writeString/*method14629*/(String string, int i) {
	int i_8_ = string.indexOf('\0');
	if (i_8_ >= 0)
	    throw new IllegalArgumentException("");
	pointer
	    += Class477.method10918(string, 0, string.length(), payload,
				    pointer * 421967667,
				    -1921818817) * -681042949;
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) 0;
    }
    
    public void method14630(String string, int i) {
	int i_9_ = string.indexOf('\0');
	if (i_9_ >= 0)
	    throw new IllegalArgumentException("");
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) 0;
	pointer
	    += Class477.method10918(string, 0, string.length(), payload,
				    pointer * 421967667,
				    -1793904323) * -681042949;
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) 0;
    }
    
    public void method14631(CharSequence charsequence, int i) {
	int i_10_ = Class126.method3008(charsequence, -1375339850);
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) 0;
	method14812(i_10_, 1452506744);
	pointer
	    += Class105_Sub2.method15602(payload, 421967667 * pointer,
					 charsequence,
					 -102225414) * -681042949;
    }
    
    public void writeBytes/*method14632*/(byte[] bytes, int off, int len, int i_12_) {
		for (int idx = off; idx < len + off; idx++) {
		    payload[(pointer += -681042949) * 421967667 - 1] = bytes[idx];
		}
    }
    
    public void method14633(RSByteBuffer class241_sub3_14_, int i) {
	writeBytes(class241_sub3_14_.payload, 0,
		    class241_sub3_14_.pointer * 421967667, 752061035);
    }
    
    public void endPacketVarShort/*method14634*/(int i, byte i_15_) {
		payload[421967667 * pointer - i - 2] = (byte) (i >> 8);
		payload[pointer * 421967667 - i - 1] = (byte) i;
    }
    
    public void endPacketVarByte/*method14635*/(int i, int i_16_) {
    	payload[421967667 * pointer - i - 1] = (byte) i;
    }
    
    public int readBigSmart/*method14636*/(byte i) {
		if (payload[pointer * 421967667] < 0)
		    return readInt((byte) 79) & 0x7fffffff;
		int i_17_ = readUnsignedShort(1162222719);
		if (i_17_ == 32767)
		    return -1;
		return i_17_;
    }
    
    public void method14637(int i) {
	payload[421967667 * pointer - i - 2] = (byte) (i >> 8);
	payload[pointer * 421967667 - i - 1] = (byte) i;
    }
    
    public int method14638/*method14638*/(int i) {
		int var2 = payload[421967667 * pointer] & 0xff;
		if (var2 < 128) {
		    return readUnsignedByte((byte) 6) - 1;
		}
		return readUnsignedShort(1162222719) - 32769;
    }
    
    public byte getByte/*method14639*/(int i) {
    	return payload[(pointer += -681042949) * 421967667 - 1];
    }
    
    public int readUnsignedShort/*method14640*/(int i) {
		pointer += -1362085898;
		return ((payload[pointer * 421967667 - 1] & 0xff)
			+ ((payload[pointer * 421967667 - 2] & 0xff) << 8));
    }
    
    public int method14641() {
	pointer += -1362085898;
	int i = ((payload[pointer * 421967667 - 1] - 128 & 0xff)
		 + ((payload[421967667 * pointer - 2] & 0xff) << 8));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public int readTriByte/*method14642*/(int i) {
		pointer += -2043128847;
		return ((payload[pointer * 421967667 - 1] & 0xff)
			+ (((payload[pointer * 421967667 - 3] & 0xff) << 16)
			   + ((payload[421967667 * pointer - 2] & 0xff) << 8)));
    }
    
    public int method14643(byte i) {
	pointer += -2043128847;
	int i_19_
	    = (((payload[421967667 * pointer - 2] & 0xff) << 8)
	       + ((payload[pointer * 421967667 - 3] & 0xff) << 16)
	       + (payload[pointer * 421967667 - 1] & 0xff));
	if (i_19_ > 8388607)
	    i_19_ -= 16777216;
	return i_19_;
    }
    
    public int readInt/*method14644*/(byte i) {
		pointer += 1570795500;
		return ((((payload[421967667 * pointer - 4] & 0xff) << 24)
			    + ((payload[pointer * 421967667 - 3] & 0xff) << 16))
			    + ((payload[pointer * 421967667 - 2] & 0xff) << 8)
				+ (payload[421967667 * pointer - 1] & 0xff));
    }
    
    public int method14645() {
	int i = payload[421967667 * pointer] & 0xff;
	if (i < 128)
	    return readUnsignedByte((byte) 9) - 64;
	return readUnsignedShort(1162222719) - 49152;
    }
    
    static int method14646(byte[] is, int i, int i_20_) {
	int i_21_ = -1;
	for (int i_22_ = i; i_22_ < i_20_; i_22_++)
	    i_21_ = i_21_ >>> 8 ^ anIntArray8798[(i_21_ ^ is[i_22_]) & 0xff];
	i_21_ ^= 0xffffffff;
	return i_21_;
    }
    
    public long readLong/*method14647*/(short i) {
	long l = (long) readInt((byte) 75) & 0xffffffffL;
	long l_23_ = (long) readInt((byte) 113) & 0xffffffffL;
	return (l << 32) + l_23_;
    }
    
    public void method14648(int i, int i_24_) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 16);
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
    }
    
    public long method14649(int i, int i_25_) {
	if (--i < 0 || i > 7)
	    throw new IllegalArgumentException();
	int i_26_ = 8 * i;
	long l = 0L;
	for (/**/; i_26_ >= 0; i_26_ -= 8)
	    l |= ((long) (payload
			  [(pointer += -681042949) * 421967667 - 1])
		  & 0xffL) << i_26_;
	return l;
    }
    
    public float method14650(int i) {
		return Float.intBitsToFloat(readInt((byte) 37));
    }
    
    public String readNullString/*method14651*/(int i) {
		if (0 == payload[421967667 * pointer]) {
			pointer += -681042949;
			return null;
		}
		return readString(-1339933603);
    }
    
    public int method14652(int i) {
	int i_27_
	    = Class393_Sub2.method16581(payload, i,
					421967667 * pointer, (byte) -60);
	writeInt(i_27_, 1183914461);
	return i_27_;
    }
    
    public String readJagString/*method14653*/(int i) {
		byte i_28_ = payload[(pointer += -681042949) * 421967667 - 1];
		if (0 != i_28_) {
		    throw new IllegalStateException("Invalid JAG string.");
		}
		int i_29_ = pointer * 421967667;
		while (payload[(pointer += -681042949) * 421967667 - 1]
		       != 0) {
		    /* empty */
		}
		int i_30_ = pointer * 421967667 - i_29_ - 1;
		if (0 == i_30_)
		    return "";
		return Class95.getMessageFromBytes(payload, i_29_, i_30_, -949072930);
    }
    
    public String method14654(int i) {
	byte i_31_ = payload[(pointer += -681042949) * 421967667 - 1];
	if (i_31_ != 0)
	    throw new IllegalStateException("");
	int i_32_ = method14662(-576298433);
	if (pointer * 421967667 + i_32_ > payload.length)
	    throw new IllegalStateException("");
	String string
	    = Friend.method864(payload, 421967667 * pointer, i_32_,
				1264476317);
	pointer += i_32_ * -681042949;
	return string;
    }
    
    public void method14655(int[] is, int i, int i_33_) {
	int i_34_ = 421967667 * pointer;
	pointer = i * -681042949;
	int i_35_ = (i_33_ - i) / 8;
	for (int i_36_ = 0; i_36_ < i_35_; i_36_++) {
	    int i_37_ = readInt((byte) 12);
	    int i_38_ = readInt((byte) 43);
	    int i_39_ = -957401312;
	    int i_40_ = -1640531527;
	    int i_41_ = 32;
	    while (i_41_-- > 0) {
		i_38_ -= ((i_37_ << 4 ^ i_37_ >>> 5) + i_37_
			  ^ is[i_39_ >>> 11 & 0x3] + i_39_);
		i_39_ -= i_40_;
		i_37_ -= (i_38_ + (i_38_ << 4 ^ i_38_ >>> 5)
			  ^ i_39_ + is[i_39_ & 0x3]);
	    }
	    pointer -= -1153376296;
	    writeInt(i_37_, 1472728591);
	    writeInt(i_38_, 318517970);
	}
	pointer = -681042949 * i_34_;
    }
    
    public int method14656() {
	pointer += 1570795500;
	return ((payload[421967667 * pointer - 2] & 0xff)
		+ (((payload[pointer * 421967667 - 4] & 0xff) << 16)
		   + ((payload[421967667 * pointer - 3] & 0xff) << 24)
		   + ((payload[pointer * 421967667 - 1] & 0xff)
		      << 8)));
    }
    
    public void method14657(int i, int i_42_) {
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 16);
    }
    
    public int method14658() {
	return (payload[(pointer += -681042949) * 421967667 - 1]
		& 0xff);
    }
    
    public String readString/*method14659*/(int i) {
		int offset = pointer * 421967667;
		while (payload[(pointer += -681042949) * 421967667 - 1]
		       != 0) {
		    /* empty */
		}
		int length = 421967667 * pointer - offset - 1;
		if (length == 0)
		    return "";
		return Class95.getMessageFromBytes(payload, offset, length, -949072930);
    }
    
    public int method14660() {
	pointer += -1362085898;
	int i = ((payload[pointer * 421967667 - 1] - 128 & 0xff)
		 + ((payload[421967667 * pointer - 2] & 0xff) << 8));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public void method14661(int[] is, int i) {
	int i_45_ = pointer * 421967667 / 8;
	pointer = 0;
	for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
	    int i_47_ = readInt((byte) 91);
	    int i_48_ = readInt((byte) 96);
	    int i_49_ = 0;
	    int i_50_ = -1640531527;
	    int i_51_ = 32;
	    while (i_51_-- > 0) {
		i_47_ += ((i_48_ << 4 ^ i_48_ >>> 5) + i_48_
			  ^ is[i_49_ & 0x3] + i_49_);
		i_49_ += i_50_;
		i_48_ += (i_47_ + (i_47_ << 4 ^ i_47_ >>> 5)
			  ^ i_49_ + is[i_49_ >>> 11 & 0x3]);
	    }
	    pointer -= -1153376296;
	    writeInt(i_47_, 1576072510);
	    writeInt(i_48_, -1115139155);
	}
    }
    
    int method14662(int i) {
	int i_52_ = payload[(pointer += -681042949) * 421967667 - 1];
	int i_53_ = 0;
	for (/**/; i_52_ < 0;
	     i_52_ = payload[(pointer += -681042949) * 421967667 - 1])
	    i_53_ = (i_53_ | i_52_ & 0x7f) << 7;
	return i_53_ | i_52_;
    }
    
    public boolean method14663() {
	pointer -= 1570795500;
	int i = Class393_Sub2.method16581(payload, 0,
					  421967667 * pointer, (byte) -36);
	int i_54_ = readInt((byte) 84);
	if (i_54_ == i)
	    return true;
	return false;
    }
    
    public void method14664(int[] is, int i) {
	int i_55_ = pointer * 421967667 / 8;
	pointer = 0;
	for (int i_56_ = 0; i_56_ < i_55_; i_56_++) {
	    int i_57_ = readInt((byte) 96);
	    int i_58_ = readInt((byte) 35);
	    int i_59_ = -957401312;
	    int i_60_ = -1640531527;
	    int i_61_ = 32;
	    while (i_61_-- > 0) {
		i_58_ -= (i_57_ + (i_57_ << 4 ^ i_57_ >>> 5)
			  ^ is[i_59_ >>> 11 & 0x3] + i_59_);
		i_59_ -= i_60_;
		i_57_ -= ((i_58_ << 4 ^ i_58_ >>> 5) + i_58_
			  ^ i_59_ + is[i_59_ & 0x3]);
	    }
	    pointer -= -1153376296;
	    writeInt(i_57_, -17484942);
	    writeInt(i_58_, 332619430);
	}
    }
    
    public void method14665(int[] is, int i, int i_62_, int i_63_) {
	int i_64_ = 421967667 * pointer;
	pointer = -681042949 * i;
	int i_65_ = (i_62_ - i) / 8;
	for (int i_66_ = 0; i_66_ < i_65_; i_66_++) {
	    int i_67_ = readInt((byte) 34);
	    int i_68_ = readInt((byte) 119);
	    int i_69_ = 0;
	    int i_70_ = -1640531527;
	    int i_71_ = 32;
	    while (i_71_-- > 0) {
		i_67_ += ((i_68_ << 4 ^ i_68_ >>> 5) + i_68_
			  ^ is[i_69_ & 0x3] + i_69_);
		i_69_ += i_70_;
		i_68_ += (i_67_ + (i_67_ << 4 ^ i_67_ >>> 5)
			  ^ i_69_ + is[i_69_ >>> 11 & 0x3]);
	    }
	    pointer -= -1153376296;
	    writeInt(i_67_, -30502243);
	    writeInt(i_68_, 1228139699);
	}
	pointer = i_64_ * -681042949;
    }
    
    public void method14666(int[] is, int i, int i_72_, int i_73_) {
	int i_74_ = 421967667 * pointer;
	pointer = i * -681042949;
	int i_75_ = (i_72_ - i) / 8;
	for (int i_76_ = 0; i_76_ < i_75_; i_76_++) {
	    int i_77_ = readInt((byte) 24);
	    int i_78_ = readInt((byte) 90);
	    int i_79_ = -957401312;
	    int i_80_ = -1640531527;
	    int i_81_ = 32;
	    while (i_81_-- > 0) {
		i_78_ -= ((i_77_ << 4 ^ i_77_ >>> 5) + i_77_
			  ^ is[i_79_ >>> 11 & 0x3] + i_79_);
		i_79_ -= i_80_;
		i_77_ -= (i_78_ + (i_78_ << 4 ^ i_78_ >>> 5)
			  ^ i_79_ + is[i_79_ & 0x3]);
	    }
	    pointer -= -1153376296;
	    writeInt(i_77_, -926251482);
	    writeInt(i_78_, -776932659);
	}
	pointer = -681042949 * i_74_;
    }
    
    public int method14667(int i) {
	pointer += -1362085898;
	int i_82_ = (((payload[pointer * 421967667 - 1] & 0xff) << 8)
		     + (payload[pointer * 421967667 - 2] & 0xff));
	if (i_82_ > 32767)
	    i_82_ -= 65536;
	return i_82_;
    }
    
    public int method14668(int i, byte i_83_) {
	int i_84_
	    = Class393_Sub2.method16581(payload, i,
					421967667 * pointer, (byte) -86);
	writeInt(i_84_, -712240523);
	return i_84_;
    }
    
    public boolean method14669(int i) {
		pointer -= 1570795500;
		int i_85_ = Class393_Sub2.method16581(payload, 0,
						421967667 * pointer, (byte) -42);
		int i_86_ = readInt((byte) 71);
		if (i_86_ == i_85_) {
		    return true;
		}
		return false;
    }
    
    public void writeByteA/*method14670*/(int i, int i_87_) {
    	payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i + 128);
    }
    
    public void writeByteC/*method14671*/(int i, int i_88_) {
    	payload[(pointer += -681042949) * 421967667 - 1] = (byte) (0 - i);
    }
    
    public void writeByteS/*method14672*/(int i, int i_89_) {
    	payload[(pointer += -681042949) * 421967667 - 1] = (byte) (128 - i);
    }
    
    public int getByteA/*method14673*/(int i) {
    	return (payload[(pointer += -681042949) * 421967667 - 1] - 128 & 0xff);
    }
    
    public int method14674() {
	pointer += -1362085898;
	return ((payload[pointer * 421967667 - 1] & 0xff)
		+ ((payload[pointer * 421967667 - 2] & 0xff) << 8));
    }
    
    public String method14675() {
	int i = pointer * 421967667;
	while (payload[(pointer += -681042949) * 421967667 - 1]
	       != 0) {
	    /* empty */
	}
	int i_90_ = 421967667 * pointer - i - 1;
	if (i_90_ == 0)
	    return "";
	return Class95.getMessageFromBytes(payload, i, i_90_, -949072930);
    }
    
    public byte readByteA/*method14676*/(int i) {
    	return (byte) ((payload[(pointer += -681042949) * 421967667 - 1]) - 128);
    }
    
    public byte getByteC/*method14677*/(int i) {
    	return (byte) (0 - (payload[(pointer += -681042949) * 421967667 - 1]));
    }
    
    public byte readByteS/*method14678*/(byte i) {
    	return (byte) (128 - (payload[(pointer += -681042949) * 421967667 - 1]));
    }
    
    public void writeLEShort/*method14679*/(int i, int i_91_) {
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i >> 8);
    }
    
    public int method14680() {
	if (payload[421967667 * pointer] < 0)
	    return readInt((byte) 24) & 0x7fffffff;
	return readUnsignedShort(1162222719);
    }
    
    public int readUnsignedShortA/*method14681*/(byte i) {
		pointer += -1362085898;
		return (((payload[421967667 * pointer - 2] & 0xff) << 8)
			+ (payload[421967667 * pointer - 1] - 128 & 0xff));
    }
    
    public int readUnsignedLEShort/*method14682*/(short i) {
		pointer += -1362085898;
		return ((payload[421967667 * pointer - 2] & 0xff)
				+ ((payload[pointer * 421967667 - 1] & 0xff) << 8));
    }
    
    public byte method14683() {
    	return (byte) (128 - (payload[(pointer += -681042949) * 421967667 - 1]));
    }
    
    public int readUnsignedLEShortA/*method14684*/(int i) {
		pointer += -1362085898;
		return (((payload[421967667 * pointer - 1] & 0xff) << 8)
			+ (payload[421967667 * pointer - 2] - 128 & 0xff));
    }
    
    public int readShort/*method14685*/(byte i) {
		pointer += -1362085898;
		int i_92_ = ((payload[pointer * 421967667 - 1] & 0xff)
		       + ((payload[pointer * 421967667 - 2] & 0xff) << 8));
		if (i_92_ > 32767) {
		    i_92_ -= 65536;
		}
		return i_92_;
    }
    
    public int method14686() {
	pointer += -1362085898;
	return (((payload[421967667 * pointer - 2] & 0xff) << 8)
		+ (payload[421967667 * pointer - 1] - 128 & 0xff));
    }
    
    public void method14687(int i, int i_93_) {
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 16);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 24);
    }
    
    public void method14688(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i + 128);
    }
    
    public RSByteBuffer(int i) {
	payload = Class428.method7613(i, -958684464);
	pointer = 0;
    }
    
    public void writeLEInt/*method14689*/(int i, int i_94_) {
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i >> 8);
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i >> 16);
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i >> 24);
    }
    
    public void writeIntV1/*method14690*/(int i, byte i_95_) {
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i >> 8);
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i >> 24);
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i >> 16);
    }
    
    public void writePSmart/*method14691*/(int i, int i_96_) {
		if (i >= 0 && i < 128) {
		    writeByte(i, 1604992875);
		} else if (i >= 0 && i < 32768) {
		    writeShort(32768 + i, -484048531);
		} else {
		    throw new IllegalArgumentException();
		}
    }
    
    public int readLEInt/*method14692*/(int i) {
		pointer += 1570795500;
		return ((payload[421967667 * pointer - 4] & 0xff)
			    + ((payload[pointer * 421967667 - 3] & 0xff) << 8))
				+ (((payload[pointer * 421967667 - 2] & 0xff) << 16)
			    + ((payload[421967667 * pointer - 1] & 0xff) << 24));
    }
    
    public int readIntV1/*method14693*/(short i) {
		pointer += 1570795500;
		return (((payload[421967667 * pointer - 4] & 0xff) << 8)
				+ (payload[421967667 * pointer - 3] & 0xff)
				+ ((payload[pointer * 421967667 - 2] & 0xff) << 24)
				+ ((payload[pointer * 421967667 - 1] & 0xff) << 16));
    }
    
    public int readIntV2/*method14694*/(int i) {
		pointer += 1570795500;
		return ((((payload[pointer * 421967667 - 4] & 0xff) << 16)
			    + ((payload[421967667 * pointer - 3] & 0xff) << 24)
			    + (payload[421967667 * pointer - 2] & 0xff)
				+ ((payload[pointer * 421967667 - 1] & 0xff) << 8)));
    }
    
    public int method14695() {
	if (payload[421967667 * pointer] < 0)
	    return readInt((byte) 61) & 0x7fffffff;
	return readUnsignedShort(1162222719);
    }
    
    public void writeShortA/*method14696*/(int i, int i_97_) {
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i >> 8);
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i + 128);
    }
    
    static int method14697(byte[] is, int i, int i_98_) {
	int i_99_ = -1;
	for (int i_100_ = i; i_100_ < i_98_; i_100_++)
	    i_99_ = i_99_ >>> 8 ^ anIntArray8798[(i_99_ ^ is[i_100_]) & 0xff];
	i_99_ ^= 0xffffffff;
	return i_99_;
    }
    
    public int readByteC/*method14698*/(byte i) {
    	return (0 - payload[(pointer += -681042949) * 421967667 - 1] & 0xff);
    }
    
    static int method14699(byte[] is, int i, int i_101_) {
	int i_102_ = -1;
	for (int i_103_ = i; i_103_ < i_101_; i_103_++)
	    i_102_
		= i_102_ >>> 8 ^ anIntArray8798[(i_102_ ^ is[i_103_]) & 0xff];
	i_102_ ^= 0xffffffff;
	return i_102_;
    }
    
    public int method14700() {
	pointer += 1570795500;
	return ((payload[421967667 * pointer - 4] & 0xff)
		+ (((payload[pointer * 421967667 - 2] & 0xff) << 16)
		   + ((payload[421967667 * pointer - 1] & 0xff) << 24)
		   + ((payload[pointer * 421967667 - 3] & 0xff)
		      << 8)));
    }
    
    static int method14701(byte[] is, int i, int i_104_) {
	int i_105_ = -1;
	for (int i_106_ = i; i_106_ < i_104_; i_106_++)
	    i_105_
		= i_105_ >>> 8 ^ anIntArray8798[(i_105_ ^ is[i_106_]) & 0xff];
	i_105_ ^= 0xffffffff;
	return i_105_;
    }
    
    public static int method14702(byte[] is, int i) {
	return Class393_Sub2.method16581(is, 0, i, (byte) -99);
    }
    
    public static int method14703(byte[] is, int i) {
	return Class393_Sub2.method16581(is, 0, i, (byte) -49);
    }
    
    public void method14704() {
	if (null != payload)
	    Class428.method7615(payload, -1118330632);
	payload = null;
    }
    
    public void method14705() {
	if (null != payload)
	    Class428.method7615(payload, -787381454);
	payload = null;
    }
    
    public void writeIntV2/*method14706*/(int i, int i_107_) {
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i >> 16);
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i >> 24);
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i >> 8);
    }
    
    public void method14707(int i) {
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
    }
    
    public void method14708(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
    }
    
    public boolean method14709() {
	pointer -= 1570795500;
	int i = Class393_Sub2.method16581(payload, 0,
					  421967667 * pointer, (byte) -104);
	int i_108_ = readInt((byte) 40);
	if (i_108_ == i)
	    return true;
	return false;
    }
    
    public void method14710(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
    }
    
    public void method14711(int i) {
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
    }
    
    public void method14712(int i) {
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
    }
    
    public void method14713(int i) {
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
    }
    
    public void method14714(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 16);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
    }
    
    public void method14715(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i + 128);
    }
    
    public void method14716(int i) {
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 16);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 24);
    }
    
    public void method14717(long l) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 32);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 24);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 16);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 8);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) l;
    }
    
    public void method14718(long l) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 32);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 24);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 16);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 8);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) l;
    }
    
    public void method14719(long l) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 40);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 32);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 24);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 16);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 8);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) l;
    }
    
    public long method14720(byte i) {
	long l = (long) method14764((byte) 24) & 0xffffffffL;
	long l_109_ = (long) method14764((byte) 22) & 0xffffffffL;
	return l + (l_109_ << 32);
    }
    
    public void method14721(long l) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 40);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 32);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 24);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 16);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 8);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) l;
    }
    
    public void method14722(long l) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 56);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 48);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 40);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 32);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 24);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 16);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 8);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) l;
    }
    
    public void method14723(long l) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 56);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 48);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 40);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 32);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 24);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 16);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 8);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) l;
    }
    
    public void method14724(long l) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 56);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 48);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 40);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 32);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 24);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 16);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 8);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) l;
    }
    
    public int method14725() {
	pointer += 1570795500;
	return ((payload[421967667 * pointer - 2] & 0xff)
		+ (((payload[pointer * 421967667 - 4] & 0xff) << 16)
		   + ((payload[421967667 * pointer - 3] & 0xff) << 24)
		   + ((payload[pointer * 421967667 - 1] & 0xff)
		      << 8)));
    }
    
    public static int method14726(String string) {
	return string.length() + 1;
    }
    
    public void method14727(String string) {
	int i = string.indexOf('\0');
	if (i >= 0)
	    throw new IllegalArgumentException("");
	pointer
	    += Class477.method10918(string, 0, string.length(), payload,
				    pointer * 421967667,
				    182210612) * -681042949;
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) 0;
    }
    
    public void method14728(String string) {
	int i = string.indexOf('\0');
	if (i >= 0)
	    throw new IllegalArgumentException("");
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) 0;
	pointer
	    += Class477.method10918(string, 0, string.length(), payload,
				    pointer * 421967667,
				    -555742944) * -681042949;
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) 0;
    }
    
    public long method14729(byte i) {
	long l = (long) readUnsignedByte((byte) -69) & 0xffffffffL;
	long l_110_ = (long) readInt((byte) 35) & 0xffffffffL;
	return l_110_ + (l << 32);
    }
    
    public void method14730(CharSequence charsequence) {
	int i = Class126.method3008(charsequence, -1235131502);
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) 0;
	method14812(i, -900077301);
	pointer
	    += Class105_Sub2.method15602(payload, 421967667 * pointer,
					 charsequence,
					 -1966649661) * -681042949;
    }
    
    public void method14731(byte[] is, int i, int i_111_) {
	for (int i_112_ = i; i_112_ < i_111_ + i; i_112_++)
	    payload[(pointer += -681042949) * 421967667 - 1]
		= is[i_112_];
    }
    
    public void method14732(RSByteBuffer class241_sub3_113_) {
	writeBytes(class241_sub3_113_.payload, 0,
		    class241_sub3_113_.pointer * 421967667, 752061035);
    }
    
    static {
		for (int i = 0; i < 256; i++) {
		    int i_114_ = i;
		    for (int i_115_ = 0; i_115_ < 8; i_115_++) {
				if ((i_114_ & 0x1) == 1) {
				    i_114_ = i_114_ >>> 1 ^ ~0x12477cdf;
				} else {
				    i_114_ >>>= 1;
				}
		    }
		    anIntArray8798[i] = i_114_;
		}
		aLongArray8800 = new long[256];
		for (int i = 0; i < 256; i++) {
		    long l = (long) i;
		    for (int i_116_ = 0; i_116_ < 8; i_116_++) {
			if ((l & 0x1L) == 1L)
			    l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
			else
			    l >>>= 1;
		    }
		    aLongArray8800[i] = l;
		}
    }
    
    public void method14733(int i) {
	payload[421967667 * pointer - i - 2] = (byte) (i >> 8);
	payload[pointer * 421967667 - i - 1] = (byte) i;
    }
    
    public void method14734(int i) {
	payload[421967667 * pointer - i - 1] = (byte) i;
    }
    
    public void method14735(int i) {
	payload[421967667 * pointer - i - 1] = (byte) i;
    }
    
    public void method14736(int i) {
	payload[421967667 * pointer - i - 1] = (byte) i;
    }
    
    public void method14737(int i) {
	payload[421967667 * pointer - i - 1] = (byte) i;
    }
    
    public void method14738(int i) {
	payload[421967667 * pointer - i - 1] = (byte) i;
    }
    
    public void method14739(int i) {
	if (i >= 0 && i < 128)
	    writeByte(i, -1645235531);
	else if (i >= 0 && i < 32768)
	    writeShort(32768 + i, -484048531);
	else
	    throw new IllegalArgumentException();
    }
    
    void method14740(int i) {
	if (0 != (i & ~0x7f)) {
	    if (0 != (i & ~0x3fff)) {
		if (0 != (i & ~0x1fffff)) {
		    if (0 != (i & ~0xfffffff))
			writeByte(i >>> 28 | 0x80, 571667678);
		    writeByte(i >>> 21 | 0x80, 937900640);
		}
		writeByte(i >>> 14 | 0x80, 758410445);
	    }
	    writeByte(i >>> 7 | 0x80, -1113088756);
	}
	writeByte(i & 0x7f, 1327346604);
    }
    
    public int readSmart2/*method14741*/(int i) {
		int i_117_ = 0;
		int i_118_;
		for (i_118_ = readSmart((short) -26849); 32767 == i_118_; i_118_ = readSmart((short) -4586)) {
		    i_117_ += 32767;
		}
		i_117_ += i_118_;
		return i_117_;
    }
    
    public int method14742() {
	return (payload[(pointer += -681042949) * 421967667 - 1]
		& 0xff);
    }
    
    public int method14743() {
	return (payload[(pointer += -681042949) * 421967667 - 1]
		& 0xff);
    }
    
    public int method14744() {
	pointer += -1362085898;
	return (((payload[421967667 * pointer - 2] & 0xff) << 8)
		+ (payload[421967667 * pointer - 1] - 128 & 0xff));
    }
    
    public void method14745(long l) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 40);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 32);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 24);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 16);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 8);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) l;
    }
    
    public int method14746() {
	if (payload[421967667 * pointer] < 0)
	    return readInt((byte) 104) & 0x7fffffff;
	return readUnsignedShort(1162222719);
    }
    
    public int method14747() {
	pointer += -1362085898;
	int i = ((payload[pointer * 421967667 - 1] & 0xff)
		 + ((payload[pointer * 421967667 - 2] & 0xff) << 8));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public int method14748() {
	pointer += -1362085898;
	int i = ((payload[pointer * 421967667 - 1] & 0xff)
		 + ((payload[pointer * 421967667 - 2] & 0xff) << 8));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public void method14749(BigInteger biginteger,
			    BigInteger biginteger_119_) {
	int i = 421967667 * pointer;
	pointer = 0;
	byte[] is = new byte[i];
	readBytes(is, 0, i, (byte) 97);
	BigInteger biginteger_120_ = new BigInteger(is);
	BigInteger biginteger_121_
	    = biginteger_120_.modPow(biginteger, biginteger_119_);
	byte[] is_122_ = biginteger_121_.toByteArray();
	pointer = 0;
	writeShort(is_122_.length, -484048531);
	writeBytes(is_122_, 0, is_122_.length, 752061035);
    }
    
    public String method14750() {
	byte i = payload[(pointer += -681042949) * 421967667 - 1];
	if (i != 0)
	    throw new IllegalStateException("");
	int i_123_ = method14662(-1472474625);
	if (pointer * 421967667 + i_123_ > payload.length)
	    throw new IllegalStateException("");
	String string
	    = Friend.method864(payload, 421967667 * pointer, i_123_,
				1264476317);
	pointer += i_123_ * -681042949;
	return string;
    }
    
    int method14751() {
	int i = payload[(pointer += -681042949) * 421967667 - 1];
	int i_124_ = 0;
	for (/**/; i < 0;
	     i = payload[(pointer += -681042949) * 421967667 - 1])
	    i_124_ = (i_124_ | i & 0x7f) << 7;
	return i_124_ | i;
    }
    
    public int method14752() {
	pointer += 1570795500;
	return (((payload[pointer * 421967667 - 3] & 0xff) << 8)
		+ (((payload[421967667 * pointer - 2] & 0xff) << 16)
		   + ((payload[421967667 * pointer - 1] & 0xff)
		      << 24))
		+ (payload[pointer * 421967667 - 4] & 0xff));
    }
    
    public int method14753() {
	pointer += -1362085898;
	return ((payload[421967667 * pointer - 2] & 0xff)
		+ ((payload[pointer * 421967667 - 1] & 0xff) << 8));
    }
    
    public long method14754() {
	long l = (long) readInt((byte) 125) & 0xffffffffL;
	long l_125_ = (long) readInt((byte) 59) & 0xffffffffL;
	return (l << 32) + l_125_;
    }
    
    public long method14755() {
	long l = (long) readInt((byte) 113) & 0xffffffffL;
	long l_126_ = (long) readInt((byte) 49) & 0xffffffffL;
	return (l << 32) + l_126_;
    }
    
    public long method14756() {
	long l = (long) readInt((byte) 19) & 0xffffffffL;
	long l_127_ = (long) readInt((byte) 126) & 0xffffffffL;
	return (l << 32) + l_127_;
    }
    
    public long method14757() {
	long l = (long) method14764((byte) 115) & 0xffffffffL;
	long l_128_ = (long) method14764((byte) -37) & 0xffffffffL;
	return l + (l_128_ << 32);
    }
    
    public long method14758() {
	long l = (long) method14764((byte) 68) & 0xffffffffL;
	long l_129_ = (long) method14764((byte) 18) & 0xffffffffL;
	return l + (l_129_ << 32);
    }
    
    public long method14759(int i) {
	if (--i < 0 || i > 7)
	    throw new IllegalArgumentException();
	int i_130_ = 8 * i;
	long l = 0L;
	for (/**/; i_130_ >= 0; i_130_ -= 8)
	    l |= ((long) (payload
			  [(pointer += -681042949) * 421967667 - 1])
		  & 0xffL) << i_130_;
	return l;
    }
    
    public float method14760() {
	return Float.intBitsToFloat(readInt((byte) 8));
    }
    
    public long method14761() {
	long l = (long) readUnsignedByte((byte) -52) & 0xffffffffL;
	long l_131_ = (long) readInt((byte) 93) & 0xffffffffL;
	return l_131_ + (l << 32);
    }
    
    public int method14762(int i) {
	int i_132_
	    = Class393_Sub2.method16581(payload, i,
					421967667 * pointer, (byte) -59);
	writeInt(i_132_, -105469323);
	return i_132_;
    }
    
    public String method14763() {
	byte i = payload[(pointer += -681042949) * 421967667 - 1];
	if (0 != i)
	    throw new IllegalStateException("");
	int i_133_ = pointer * 421967667;
	while (payload[(pointer += -681042949) * 421967667 - 1]
	       != 0) {
	    /* empty */
	}
	int i_134_ = pointer * 421967667 - i_133_ - 1;
	if (0 == i_134_)
	    return "";
	return Class95.getMessageFromBytes(payload, i_133_, i_134_, -949072930);
    }
    
    public int method14764(byte i) {
	pointer += 1570795500;
	return (((payload[pointer * 421967667 - 3] & 0xff) << 8)
		+ (((payload[421967667 * pointer - 2] & 0xff) << 16)
		   + ((payload[421967667 * pointer - 1] & 0xff)
		      << 24))
		+ (payload[pointer * 421967667 - 4] & 0xff));
    }
    
    public void method14765(int i) {
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 16);
    }
    
    public void method14766(byte[] is, int i, int i_135_) {
	for (int i_136_ = i; i_136_ < i + i_135_; i_136_++)
	    is[i_136_]
		= payload[(pointer += -681042949) * 421967667 - 1];
    }
    
    public void method14767(byte[] is, int i, int i_137_) {
	for (int i_138_ = i; i_138_ < i + i_137_; i_138_++)
	    is[i_138_]
		= payload[(pointer += -681042949) * 421967667 - 1];
    }
    
    public void writeByte/*method14768*/(int i, int i_139_) {
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
    }
    
    public int method14769() {
	int i = payload[421967667 * pointer] & 0xff;
	if (i < 128)
	    return readUnsignedByte((byte) -37) - 64;
	return readUnsignedShort(1162222719) - 49152;
    }
    
    public int method14770() {
	int i = payload[421967667 * pointer] & 0xff;
	if (i < 128)
	    return readUnsignedByte((byte) 112);
	return readUnsignedShort(1162222719) - 32768;
    }
    
    public int method14771() {
	int i = payload[421967667 * pointer] & 0xff;
	if (i < 128)
	    return readUnsignedByte((byte) 11);
	return readUnsignedShort(1162222719) - 32768;
    }
    
    public int method14772() {
	int i = payload[421967667 * pointer] & 0xff;
	if (i < 128)
	    return readUnsignedByte((byte) -19) - 1;
	return readUnsignedShort(1162222719) - 32769;
    }
    
    public int method14773() {
	int i = payload[421967667 * pointer] & 0xff;
	if (i < 128)
	    return readUnsignedByte((byte) 86) - 1;
	return readUnsignedShort(1162222719) - 32769;
    }
    
    public int method14774() {
	int i = payload[421967667 * pointer] & 0xff;
	if (i < 128)
	    return readUnsignedByte((byte) 25) - 1;
	return readUnsignedShort(1162222719) - 32769;
    }
    
    public void method14775(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 16);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
    }
    
    public int method14776(int i) {
	int i_140_
	    = Class393_Sub2.method16581(payload, i,
					421967667 * pointer, (byte) -80);
	writeInt(i_140_, -1478474862);
	return i_140_;
    }
    
    public byte method14777() {
	return payload[(pointer += -681042949) * 421967667 - 1];
    }
    
    public void applyRSA/*method14778*/(BigInteger key, BigInteger modulus,
			    byte i) {
		int i_142_ = 421967667 * pointer;
		pointer = 0;
		byte[] is = new byte[i_142_];
		readBytes(is, 0, i_142_, (byte) -15);
		BigInteger biginteger_143_ = new BigInteger(is);
		BigInteger biginteger_144_ = biginteger_143_.modPow(key, modulus);
		byte[] is_145_ = biginteger_144_.toByteArray();
		pointer = 0;
		writeShort(is_145_.length, -484048531);
		writeBytes(is_145_, 0, is_145_.length, 752061035);
    }
    
    public int method14779() {
	if (payload[421967667 * pointer] < 0)
	    return readInt((byte) 37) & 0x7fffffff;
	return readUnsignedShort(1162222719);
    }
    
    public int method14780() {
	if (payload[421967667 * pointer] < 0)
	    return readInt((byte) 18) & 0x7fffffff;
	return readUnsignedShort(1162222719);
    }
    
    int method14781() {
	int i = payload[(pointer += -681042949) * 421967667 - 1];
	int i_146_ = 0;
	for (/**/; i < 0;
	     i = payload[(pointer += -681042949) * 421967667 - 1])
	    i_146_ = (i_146_ | i & 0x7f) << 7;
	return i_146_ | i;
    }
    
    public int method14782() {
	int i = 0;
	int i_147_;
	for (i_147_ = readSmart((short) -11927); 32767 == i_147_;
	     i_147_ = readSmart((short) -17055))
	    i += 32767;
	i += i_147_;
	return i;
    }
    
    public void method14783(int[] is) {
	int i = pointer * 421967667 / 8;
	pointer = 0;
	for (int i_148_ = 0; i_148_ < i; i_148_++) {
	    int i_149_ = readInt((byte) 127);
	    int i_150_ = readInt((byte) 61);
	    int i_151_ = 0;
	    int i_152_ = -1640531527;
	    int i_153_ = 32;
	    while (i_153_-- > 0) {
		i_149_ += ((i_150_ << 4 ^ i_150_ >>> 5) + i_150_
			   ^ is[i_151_ & 0x3] + i_151_);
		i_151_ += i_152_;
		i_150_ += (i_149_ + (i_149_ << 4 ^ i_149_ >>> 5)
			   ^ i_151_ + is[i_151_ >>> 11 & 0x3]);
	    }
	    pointer -= -1153376296;
	    writeInt(i_149_, -296203566);
	    writeInt(i_150_, -632294087);
	}
    }
    
    public void method14784(long l) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 40);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 32);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 24);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 16);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) (l >> 8);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (int) l;
    }
    
    public void method14785(int[] is) {
	int i = pointer * 421967667 / 8;
	pointer = 0;
	for (int i_154_ = 0; i_154_ < i; i_154_++) {
	    int i_155_ = readInt((byte) 118);
	    int i_156_ = readInt((byte) 56);
	    int i_157_ = -957401312;
	    int i_158_ = -1640531527;
	    int i_159_ = 32;
	    while (i_159_-- > 0) {
		i_156_ -= (i_155_ + (i_155_ << 4 ^ i_155_ >>> 5)
			   ^ is[i_157_ >>> 11 & 0x3] + i_157_);
		i_157_ -= i_158_;
		i_155_ -= ((i_156_ << 4 ^ i_156_ >>> 5) + i_156_
			   ^ i_157_ + is[i_157_ & 0x3]);
	    }
	    pointer -= -1153376296;
	    writeInt(i_155_, 454953384);
	    writeInt(i_156_, -1876579781);
	}
    }
    
    public void method14786(int[] is, int i, int i_160_) {
	int i_161_ = 421967667 * pointer;
	pointer = -681042949 * i;
	int i_162_ = (i_160_ - i) / 8;
	for (int i_163_ = 0; i_163_ < i_162_; i_163_++) {
	    int i_164_ = readInt((byte) 75);
	    int i_165_ = readInt((byte) 20);
	    int i_166_ = 0;
	    int i_167_ = -1640531527;
	    int i_168_ = 32;
	    while (i_168_-- > 0) {
		i_164_ += ((i_165_ << 4 ^ i_165_ >>> 5) + i_165_
			   ^ is[i_166_ & 0x3] + i_166_);
		i_166_ += i_167_;
		i_165_ += (i_164_ + (i_164_ << 4 ^ i_164_ >>> 5)
			   ^ i_166_ + is[i_166_ >>> 11 & 0x3]);
	    }
	    pointer -= -1153376296;
	    writeInt(i_164_, -986594127);
	    writeInt(i_165_, 717432861);
	}
	pointer = i_161_ * -681042949;
    }
    
    public int method14787() {
	pointer += 1570795500;
	return (((payload[pointer * 421967667 - 3] & 0xff) << 8)
		+ (((payload[421967667 * pointer - 2] & 0xff) << 16)
		   + ((payload[421967667 * pointer - 1] & 0xff)
		      << 24))
		+ (payload[pointer * 421967667 - 4] & 0xff));
    }
    
    public void method14788(int[] is, int i, int i_169_) {
	int i_170_ = 421967667 * pointer;
	pointer = i * -681042949;
	int i_171_ = (i_169_ - i) / 8;
	for (int i_172_ = 0; i_172_ < i_171_; i_172_++) {
	    int i_173_ = readInt((byte) 35);
	    int i_174_ = readInt((byte) 13);
	    int i_175_ = -957401312;
	    int i_176_ = -1640531527;
	    int i_177_ = 32;
	    while (i_177_-- > 0) {
		i_174_ -= ((i_173_ << 4 ^ i_173_ >>> 5) + i_173_
			   ^ is[i_175_ >>> 11 & 0x3] + i_175_);
		i_175_ -= i_176_;
		i_173_ -= (i_174_ + (i_174_ << 4 ^ i_174_ >>> 5)
			   ^ i_175_ + is[i_175_ & 0x3]);
	    }
	    pointer -= -1153376296;
	    writeInt(i_173_, -2065099500);
	    writeInt(i_174_, -1171795608);
	}
	pointer = -681042949 * i_170_;
    }
    
    public void method14789(int[] is, int i, int i_178_) {
	int i_179_ = 421967667 * pointer;
	pointer = i * -681042949;
	int i_180_ = (i_178_ - i) / 8;
	for (int i_181_ = 0; i_181_ < i_180_; i_181_++) {
	    int i_182_ = readInt((byte) 76);
	    int i_183_ = readInt((byte) 107);
	    int i_184_ = -957401312;
	    int i_185_ = -1640531527;
	    int i_186_ = 32;
	    while (i_186_-- > 0) {
		i_183_ -= ((i_182_ << 4 ^ i_182_ >>> 5) + i_182_
			   ^ is[i_184_ >>> 11 & 0x3] + i_184_);
		i_184_ -= i_185_;
		i_182_ -= (i_183_ + (i_183_ << 4 ^ i_183_ >>> 5)
			   ^ i_184_ + is[i_184_ & 0x3]);
	    }
	    pointer -= -1153376296;
	    writeInt(i_182_, -80631112);
	    writeInt(i_183_, -1638880408);
	}
	pointer = -681042949 * i_179_;
    }
    
    public void method14790(String string) {
	int i = string.indexOf('\0');
	if (i >= 0)
	    throw new IllegalArgumentException("");
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) 0;
	pointer
	    += Class477.method10918(string, 0, string.length(), payload,
				    pointer * 421967667,
				    -383610284) * -681042949;
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) 0;
    }
    
    public int method14791() {
	pointer += -1362085898;
	int i = ((payload[pointer * 421967667 - 1] - 128 & 0xff)
		 + ((payload[421967667 * pointer - 2] & 0xff) << 8));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public int method14792() {
	pointer += -2043128847;
	return ((payload[pointer * 421967667 - 1] & 0xff)
		+ (((payload[pointer * 421967667 - 3] & 0xff) << 16)
		   + ((payload[421967667 * pointer - 2] & 0xff)
		      << 8)));
    }
    
    public int method14793() {
	pointer += -1362085898;
	int i = ((payload[pointer * 421967667 - 2] - 128 & 0xff)
		 + ((payload[421967667 * pointer - 1] & 0xff) << 8));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    static int method14794(byte[] is, int i, int i_187_) {
	int i_188_ = -1;
	for (int i_189_ = i; i_189_ < i_187_; i_189_++)
	    i_188_
		= i_188_ >>> 8 ^ anIntArray8798[(i_188_ ^ is[i_189_]) & 0xff];
	i_188_ ^= 0xffffffff;
	return i_188_;
    }
    
    public String method14795() {
	byte i = payload[(pointer += -681042949) * 421967667 - 1];
	if (0 != i)
	    throw new IllegalStateException("");
	int i_190_ = pointer * 421967667;
	while (payload[(pointer += -681042949) * 421967667 - 1]
	       != 0) {
	    /* empty */
	}
	int i_191_ = pointer * 421967667 - i_190_ - 1;
	if (0 == i_191_)
	    return "";
	return Class95.getMessageFromBytes(payload, i_190_, i_191_, -949072930);
    }
    
    public int readUnsignedByte/*method14796*/(byte i) {
    	return (payload[(pointer += -681042949) * 421967667 - 1] & 0xff);
    }
    
    public void method14797(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i + 128);
    }
    
    public void method14798(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (0 - i);
    }
    
    public void method14799(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (0 - i);
    }
    
    public void method14800(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (128 - i);
    }
    
    public void method14801(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (128 - i);
    }
    
    public void method14802(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (128 - i);
    }
    
    public int method14803() {
	return (payload[(pointer += -681042949) * 421967667 - 1] - 128
		& 0xff);
    }
    
    public int method14804() {
	return (payload[(pointer += -681042949) * 421967667 - 1] - 128
		& 0xff);
    }
    
    public byte method14805() {
	return (byte) ((payload
			[(pointer += -681042949) * 421967667 - 1])
		       - 128);
    }
    
    public int method14806() {
	return (0 - payload[(pointer += -681042949) * 421967667 - 1]
		& 0xff);
    }
    
    public void writeLEShortA/*method14807*/(int i, byte i_192_) {
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i + 128);
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i >> 8);
    }
    
    public byte method14808() {
	return (byte) ((payload
			[(pointer += -681042949) * 421967667 - 1])
		       - 128);
    }
    
    public void readBytes/*method14809*/(byte[] output, int off, int len, byte i_194_) {
		for (int idx = off; idx < off + len; idx++) {
			output[idx] = payload[(pointer += -681042949) * 421967667 - 1];
		}
    }
    
    public byte method14810() {
	return (byte) (0 - (payload
			    [(pointer += -681042949) * 421967667 - 1]));
    }
    
    public byte method14811() {
	return (byte) (128 - (payload
			      [(pointer += -681042949) * 421967667 - 1]));
    }
    
    void method14812(int i, int i_196_) {
	if (0 != (i & ~0x7f)) {
	    if (0 != (i & ~0x3fff)) {
		if (0 != (i & ~0x1fffff)) {
		    if (0 != (i & ~0xfffffff))
			writeByte(i >>> 28 | 0x80, -1814348864);
		    writeByte(i >>> 21 | 0x80, 151494146);
		}
		writeByte(i >>> 14 | 0x80, 1420673925);
	    }
	    writeByte(i >>> 7 | 0x80, 779819083);
	}
	writeByte(i & 0x7f, 236930303);
    }
    
    public String method14813() {
	if (0 == payload[421967667 * pointer]) {
	    pointer += -681042949;
	    return null;
	}
	return readString(-867901878);
    }
    
    public byte method14814() {
	return (byte) (128 - (payload
			      [(pointer += -681042949) * 421967667 - 1]));
    }
    
    public int readUnsignedBigSmart/*method14815*/(int i) {
		if (payload[421967667 * pointer] < 0) {
		    return readInt((byte) 75) & 0x7fffffff;
		}
		return readUnsignedShort(1162222719);
    }
    
    public int method14816() {
	pointer += -1362085898;
	int i = ((payload[pointer * 421967667 - 2] - 128 & 0xff)
		 + ((payload[421967667 * pointer - 1] & 0xff) << 8));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public void method14817(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i + 128);
    }
    
    public void method14818(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i + 128);
    }
    
    public void method14819(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i + 128);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
    }
    
    public int method14820() {
	pointer += -1362085898;
	return ((payload[421967667 * pointer - 2] & 0xff)
		+ ((payload[pointer * 421967667 - 1] & 0xff) << 8));
    }
    
    public int readSmart49152/*method14821*/(int i) {
		int i_197_ = payload[421967667 * pointer] & 0xff;
		if (i_197_ < 128) {
		    return readUnsignedByte((byte) -25) - 64;
		}
		return readUnsignedShort(1162222719) - 49152;
    }
    
    public int method14822(int i) {
	pointer += -1362085898;
	int i_198_
	    = ((payload[pointer * 421967667 - 2] - 128 & 0xff)
	       + ((payload[421967667 * pointer - 1] & 0xff) << 8));
	if (i_198_ > 32767)
	    i_198_ -= 65536;
	return i_198_;
    }
    
    public int method14823() {
	pointer += -1362085898;
	return (((payload[421967667 * pointer - 2] & 0xff) << 8)
		+ (payload[421967667 * pointer - 1] - 128 & 0xff));
    }
    
    public RSByteBuffer(int i, boolean bool) {
	payload = Class428.method7603(i, bool, (byte) 0);
    }
    
    public int readSmart/*method14824*/(short i) {
		int var2 = payload[421967667 * pointer] & 0xff;
		if (var2 < 128) {
		    return readUnsignedByte((byte) 11);
		}
		return readUnsignedShort(1162222719) - 32768;
    }
    
    public int method14825() {
	pointer += -1362085898;
	return (((payload[421967667 * pointer - 1] & 0xff) << 8)
		+ (payload[421967667 * pointer - 2] - 128 & 0xff));
    }
    
    public int method14826() {
	pointer += -1362085898;
	return (((payload[421967667 * pointer - 1] & 0xff) << 8)
		+ (payload[421967667 * pointer - 2] - 128 & 0xff));
    }
    
    public int method14827() {
	return (128 - payload[(pointer += -681042949) * 421967667 - 1]
		& 0xff);
    }
    
    public int method14828() {
	pointer += -1362085898;
	int i = (((payload[pointer * 421967667 - 1] & 0xff) << 8)
		 + (payload[pointer * 421967667 - 2] & 0xff));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public byte method14829() {
	return (byte) (128 - (payload
			      [(pointer += -681042949) * 421967667 - 1]));
    }
    
    public byte method14830() {
	return payload[(pointer += -681042949) * 421967667 - 1];
    }
    
    public int method14831() {
	pointer += -1362085898;
	int i = ((payload[pointer * 421967667 - 1] - 128 & 0xff)
		 + ((payload[421967667 * pointer - 2] & 0xff) << 8));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public static int method14832(String string) {
	return string.length() + 1;
    }
    
    public void method14833(int i) {
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
    }
    
    public int method14834() {
	pointer += -1362085898;
	return (((payload[421967667 * pointer - 1] & 0xff) << 8)
		+ (payload[421967667 * pointer - 2] - 128 & 0xff));
    }
    
    public int readUnsignedByteS/*method14835*/(byte i) {
    	return (128 - payload[(pointer += -681042949) * 421967667 - 1] & 0xff);
    }
    
    public void method14836(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 24);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 16);
    }
    
    public void method14837(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 24);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 16);
    }
    
    public void method14838(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 16);
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 24);
	payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i >> 8);
    }
    
    public void writeTriByte/*method14839*/(int i, int i_200_) {
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i >> 16);
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) (i >> 8);
		payload[(pointer += -681042949) * 421967667 - 1] = (byte) i;
    }
    
    int method14840() {
	int i = payload[(pointer += -681042949) * 421967667 - 1];
	int i_201_ = 0;
	for (/**/; i < 0;
	     i = payload[(pointer += -681042949) * 421967667 - 1])
	    i_201_ = (i_201_ | i & 0x7f) << 7;
	return i_201_ | i;
    }
    
    public int method14841() {
	pointer += -2043128847;
	int i = (((payload[421967667 * pointer - 2] & 0xff) << 8)
		 + ((payload[pointer * 421967667 - 3] & 0xff) << 16)
		 + (payload[pointer * 421967667 - 1] & 0xff));
	if (i > 8388607)
	    i -= 16777216;
	return i;
    }
    
    public int readShortA/*method14842*/(int i) {
		pointer += -1362085898;
		int i_202_ = ((payload[pointer * 421967667 - 1] - 128 & 0xff)
		       + ((payload[421967667 * pointer - 2] & 0xff) << 8));
		if (i_202_ > 32767) {
		    i_202_ -= 65536;
		}
		return i_202_;
    }
    
    public void method14843(byte[] is, int i, int i_203_) {
	for (int i_204_ = i_203_ + i - 1; i_204_ >= i; i_204_--)
	    is[i_204_] = (byte) ((payload
				  [(pointer += -681042949) * 421967667 - 1])
				 - 128);
    }
    
    public void method14844(byte[] is, int i, int i_205_) {
	for (int i_206_ = i_205_ + i - 1; i_206_ >= i; i_206_--)
	    is[i_206_] = (byte) ((payload
				  [(pointer += -681042949) * 421967667 - 1])
				 - 128);
    }
    
    static final void method14845(ClientScriptData class454, byte i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	String string_207_ = (String) (((ClientScriptData) class454).objectStack
				       [(((ClientScriptData) class454).objectStackPointer
					 -= -1650705371) * -290357331]);
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4016,
					 client.aClass190_8339.packetCipher,
					 16711935);
	class241_sub27.data.writeShort
	    ((Class421.getEncodedStringLength(string, -2027403568)
	      + Class421.getEncodedStringLength(string_207_, -1947406530)),
	     -484048531);
	class241_sub27.data.writeString(string,
							    1226243933);
	class241_sub27.data.writeString(string_207_,
							    -866251872);
	client.aClass190_8339.sendPacket(class241_sub27, -1952753226);
    }
    
    static void method14846(int i) {
	Class241_Sub39_Sub13.aClass407_10960.method7293(418600672);
	Class241_Sub39_Sub13.aClass410_10959.method7434(-1298530562);
	Class241_Sub39_Sub13.aClass410_10958.method7434(-1928138725);
    }
}
