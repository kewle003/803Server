/* Class241_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class RSBitBuffer extends RSByteBuffer
{
    int anInt10805;
    IsaacCipher aClass418_10806;
    static int[] bitMasks = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191,
	    16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151,
	    4194303, 8388607, 16777215, 33554431, 67108863, 134217727,
	    268435455, 536870911, 1073741823, 2147483647, -1 };//anIntArray10807
    
    public void method17038(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i + aClass418_10806
			      .method7497((byte) 8));
    }
    
    public void setCipher/*method17039*/(IsaacCipher class418, int i) {
    	aClass418_10806 = class418;
    }
    
    public void writePacketOpcode/*method17040*/(int i, int i_0_) {
    	payload[(pointer += -681042949) * 421967667 - 1] 
    			= (byte) (i + aClass418_10806.method7497((byte) 8));
    }
    
    public boolean method17041(int i) {
		int i_1_ = ((payload[pointer * 421967667] - aClass418_10806.method7506(36865181)) & 0xff);
		if (i_1_ < 128)
		    return false;
		return true;
    }
    
    public int readBits/*method17042*/(int bitsToRead, int i_2_) {
		int bytePtr = 196135521 * anInt10805 >> 3;
		int bitsRead = 8 - (anInt10805 * 196135521 & 0x7);
		int output = 0;
		anInt10805 += bitsToRead * -2053809759;
		for (/**/; bitsToRead > bitsRead; bitsRead = 8) {
		    output += ((payload[bytePtr++] & bitMasks[bitsRead]) << bitsToRead - bitsRead);
		    bitsToRead -= bitsRead;
		}
		if (bitsToRead == bitsRead) {
		    output += payload[bytePtr] & bitMasks[bitsRead];
		} else {
		    output += payload[bytePtr] >> bitsRead - bitsToRead & bitMasks[bitsToRead];
		}
		return output;
    }
    
    public void method17043(IsaacCipher class418) {
	aClass418_10806 = class418;
    }
    
    public void initBitAccess/*method17044*/(int i) {
    	anInt10805 = 902271128 * pointer;
    }
    
    public RSBitBuffer(int i) {
    	super(i);
    }
    
    public void finishBitAccess/*method17045*/(byte i) {
    	pointer = -681042949 * ((7 + (anInt10805 * 196135521)) / 8);
    }
    
    public int method17046(int i, int i_6_) {
	return i * 8 - 196135521 * anInt10805;
    }
    
    public int readPacketOpcode/*method17047*/(int i) {
		int i_7_ = ((payload[(pointer += -681042949) * 421967667 - 1]
			     - aClass418_10806.method7497((byte) 8)) & 0xff);
		if (i_7_ < 128)
		    return i_7_;
		return ((i_7_ - 128 << 8)
			+ ((payload[(pointer += -681042949) * 421967667 - 1]
			    - aClass418_10806.method7497((byte) 8)) & 0xff));
    }
    
    public int method17048(int i) {
	return i * 8 - 196135521 * anInt10805;
    }
    
    public void readEncodeBytes/*method17049*/(byte[] output, int offset, int length, int i_9_) {
    	for (int index = 0; index < length; index++) {
    		output[index + offset] = (byte) ((payload[(pointer += -681042949) * 421967667 - 1])
			  - aClass418_10806.method7497((byte) 8));
    	}
    }
    
    public void method17050(int i) {
	payload[(pointer += -681042949) * 421967667 - 1]
	    = (byte) (i + aClass418_10806
			      .method7497((byte) 8));
    }
    
    public boolean method17051() {
	int i = ((payload[pointer * 421967667]
		  - aClass418_10806
			.method7506(-1002267987))
		 & 0xff);
	if (i < 128)
	    return false;
	return true;
    }
    
    public boolean method17052() {
	int i = ((payload[pointer * 421967667]
		  - aClass418_10806
			.method7506(-9475109))
		 & 0xff);
	if (i < 128)
	    return false;
	return true;
    }
    
    public boolean method17053() {
	int i = ((payload[pointer * 421967667]
		  - aClass418_10806
			.method7506(-2136866039))
		 & 0xff);
	if (i < 128)
	    return false;
	return true;
    }
    
    public int method17054() {
	int i = ((payload[(pointer += -681042949) * 421967667 - 1]
		  - aClass418_10806
			.method7497((byte) 8))
		 & 0xff);
	if (i < 128)
	    return i;
	return ((i - 128 << 8)
		+ ((payload[(pointer += -681042949) * 421967667 - 1]
		    - aClass418_10806
			  .method7497((byte) 8))
		   & 0xff));
    }
    
    public int method17055(int i) {
	int i_11_ = 196135521 * anInt10805 >> 3;
	int i_12_
	    = 8 - (anInt10805 * 196135521 & 0x7);
	int i_13_ = 0;
	anInt10805 += i * -2053809759;
	for (/**/; i > i_12_; i_12_ = 8) {
	    i_13_ += ((payload[i_11_++] & bitMasks[i_12_])
		      << i - i_12_);
	    i -= i_12_;
	}
	if (i == i_12_)
	    i_13_ += payload[i_11_] & bitMasks[i_12_];
	else
	    i_13_ += payload[i_11_] >> i_12_ - i & bitMasks[i];
	return i_13_;
    }
    
    public void method17056(IsaacCipher class418) {
	aClass418_10806 = class418;
    }
    
    public int method17057(int i) {
	int i_14_ = 196135521 * anInt10805 >> 3;
	int i_15_
	    = 8 - (anInt10805 * 196135521 & 0x7);
	int i_16_ = 0;
	anInt10805 += i * -2053809759;
	for (/**/; i > i_15_; i_15_ = 8) {
	    i_16_ += ((payload[i_14_++] & bitMasks[i_15_])
		      << i - i_15_);
	    i -= i_15_;
	}
	if (i == i_15_)
	    i_16_ += payload[i_14_] & bitMasks[i_15_];
	else
	    i_16_ += payload[i_14_] >> i_15_ - i & bitMasks[i];
	return i_16_;
    }
    
    public int method17058(int i) {
	return i * 8 - 196135521 * anInt10805;
    }
    
    static final void method17059(ClientScriptData class454, int i) {
	int i_17_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_17_, (byte) -66);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_17_ >> 16];
	Class219.setComponentColour(class58, class35, class454, 1674088817);
    }
}
