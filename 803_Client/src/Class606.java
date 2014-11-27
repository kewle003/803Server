/* Class606 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.Inflater;

public class Class606
{
    Inflater anInflater7755;
    
    public void method13212(RSByteBuffer class241_sub3, byte[] is) {
	if ((class241_sub3.payload[421967667 * class241_sub3.pointer]
	     != 31)
	    || (class241_sub3.payload
		[421967667 * class241_sub3.pointer + 1]) != -117)
	    throw new RuntimeException("");
	if (null == ((Class606) this).anInflater7755)
	    ((Class606) this).anInflater7755 = new Inflater(true);
	try {
	    ((Class606) this).anInflater7755.setInput
		(class241_sub3.payload,
		 10 + class241_sub3.pointer * 421967667,
		 (class241_sub3.payload.length
		  - (8 + (class241_sub3.pointer * 421967667 + 10))));
	    ((Class606) this).anInflater7755.inflate(is);
	} catch (Exception exception) {
	    ((Class606) this).anInflater7755.reset();
	    throw new RuntimeException("");
	}
	((Class606) this).anInflater7755.reset();
    }
    
    Class606(int i, int i_0_, int i_1_) {
	/* empty */
    }
    
    public byte[] method13213(byte[] is, int i) {
	RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	class241_sub3.pointer = (is.length - 4) * -681042949;
	int i_2_ = class241_sub3.method14764((byte) 17);
	byte[] is_3_ = new byte[i_2_];
	class241_sub3.pointer = 0;
	method13214(class241_sub3, is_3_, -53110952);
	return is_3_;
    }
    
    public Class606() {
	this(-1, 1000000, 1000000);
    }
    
    public void method13214(RSByteBuffer class241_sub3, byte[] is, int i) {
	if ((class241_sub3.payload[421967667 * class241_sub3.pointer]
	     != 31)
	    || (class241_sub3.payload
		[421967667 * class241_sub3.pointer + 1]) != -117)
	    throw new RuntimeException("");
	if (null == ((Class606) this).anInflater7755)
	    ((Class606) this).anInflater7755 = new Inflater(true);
	try {
	    ((Class606) this).anInflater7755.setInput
		(class241_sub3.payload,
		 10 + class241_sub3.pointer * 421967667,
		 (class241_sub3.payload.length
		  - (8 + (class241_sub3.pointer * 421967667 + 10))));
	    ((Class606) this).anInflater7755.inflate(is);
	} catch (Exception exception) {
	    ((Class606) this).anInflater7755.reset();
	    throw new RuntimeException("");
	}
	((Class606) this).anInflater7755.reset();
    }
    
    public void method13215(RSByteBuffer class241_sub3, byte[] is) {
	if ((class241_sub3.payload[421967667 * class241_sub3.pointer]
	     != 31)
	    || (class241_sub3.payload
		[421967667 * class241_sub3.pointer + 1]) != -117)
	    throw new RuntimeException("");
	if (null == ((Class606) this).anInflater7755)
	    ((Class606) this).anInflater7755 = new Inflater(true);
	try {
	    ((Class606) this).anInflater7755.setInput
		(class241_sub3.payload,
		 10 + class241_sub3.pointer * 421967667,
		 (class241_sub3.payload.length
		  - (8 + (class241_sub3.pointer * 421967667 + 10))));
	    ((Class606) this).anInflater7755.inflate(is);
	} catch (Exception exception) {
	    ((Class606) this).anInflater7755.reset();
	    throw new RuntimeException("");
	}
	((Class606) this).anInflater7755.reset();
    }
    
    static final void method13216(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub35_8859
		  .method14946((byte) 8) == 1 ? 1 : 0;
    }
}
