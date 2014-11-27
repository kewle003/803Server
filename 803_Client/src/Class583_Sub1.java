/* Class583_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class583_Sub1 extends Class583
{
    RSByteBuffer aClass241_Sub3_8725;
    int anInt8726;
    JS5 aClass210_8727;
    int[] anIntArray8728;
    int anInt8729;
    static final int anInt8730 = 10;
    RSByteBuffer aClass241_Sub3_8731;
    byte[][] aByteArrayArray8732 = new byte[10][];
    
    public void method14417() {
	if (null != ((Class583_Sub1) this).anIntArray8728) {
	    for (int i = 0;
		 i < 10 && (579704469 * ((Class583_Sub1) this).anInt8729 + i
			    < ((Class583_Sub1) this).anIntArray8728.length);
		 i++) {
		if (((Class583_Sub1) this).aByteArrayArray8732[i] == null
		    && (((Class583_Sub1) this).aClass210_8727.method4188
			((((Class583_Sub1) this).anIntArray8728
			  [i + 579704469 * ((Class583_Sub1) this).anInt8729]),
			 0, -649893793)))
		    ((Class583_Sub1) this).aByteArrayArray8732[i]
			= (((Class583_Sub1) this).aClass210_8727.getfile
			   ((((Class583_Sub1) this).anIntArray8728
			     [(((Class583_Sub1) this).anInt8729 * 579704469
			       + i)]),
			    0, 1961360630));
	    }
	}
    }
    
    int method12808(byte[] is, byte i) throws IOException {
	if (null == ((Class583_Sub1) this).anIntArray8728) {
	    if (!((Class583_Sub1) this).aClass210_8727.method4188
		 (902618177 * ((Class583_Sub1) this).anInt8726, 0,
		  -2087681221))
		return 0;
	    byte[] is_0_ = (((Class583_Sub1) this).aClass210_8727.getfile
			    (((Class583_Sub1) this).anInt8726 * 902618177, 0,
			     1694603861));
	    if (null == is_0_)
		throw new IllegalStateException("");
	    ((Class583_Sub1) this).aClass241_Sub3_8725.payload = is_0_;
	    ((Class583_Sub1) this).aClass241_Sub3_8725.pointer = 0;
	    int i_1_ = is_0_.length >> 1;
	    ((Class583_Sub1) this).anIntArray8728 = new int[i_1_];
	    for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
		((Class583_Sub1) this).anIntArray8728[i_2_]
		    = ((Class583_Sub1) this).aClass241_Sub3_8725
			  .readUnsignedShort(1162222719);
	}
	if (((Class583_Sub1) this).anInt8729 * 579704469
	    >= ((Class583_Sub1) this).anIntArray8728.length)
	    return -1;
	method14418((byte) -22);
	((Class583_Sub1) this).aClass241_Sub3_8725.payload = is;
	((Class583_Sub1) this).aClass241_Sub3_8725.pointer = 0;
	while (((Class583_Sub1) this).aClass241_Sub3_8725.pointer * 421967667
	       < (((Class583_Sub1) this).aClass241_Sub3_8725
		  .payload).length) {
	    if (((Class583_Sub1) this).aClass241_Sub3_8731.payload
		== null) {
		if (((Class583_Sub1) this).aByteArrayArray8732[0] == null) {
		    ((Class583_Sub1) this).aClass241_Sub3_8725.payload
			= null;
		    return 421967667 * (((Class583_Sub1) this)
					.aClass241_Sub3_8725.pointer);
		}
		((Class583_Sub1) this).aClass241_Sub3_8731.payload
		    = ((Class583_Sub1) this).aByteArrayArray8732[0];
	    }
	    int i_3_ = ((((Class583_Sub1) this).aClass241_Sub3_8725
			 .payload).length
			- (((Class583_Sub1) this).aClass241_Sub3_8725.pointer
			   * 421967667));
	    int i_4_ = ((((Class583_Sub1) this).aClass241_Sub3_8731
			 .payload).length
			- 421967667 * (((Class583_Sub1) this)
				       .aClass241_Sub3_8731.pointer));
	    if (i_3_ < i_4_) {
		((Class583_Sub1) this).aClass241_Sub3_8731.readBytes
		    (((Class583_Sub1) this).aClass241_Sub3_8725.payload,
		     (421967667
		      * ((Class583_Sub1) this).aClass241_Sub3_8725.pointer),
		     i_3_, (byte) 6);
		((Class583_Sub1) this).aClass241_Sub3_8725.payload
		    = null;
		return is.length;
	    }
	    ((Class583_Sub1) this).aClass241_Sub3_8725.writeBytes
		(((Class583_Sub1) this).aClass241_Sub3_8731.payload,
		 (421967667
		  * ((Class583_Sub1) this).aClass241_Sub3_8731.pointer),
		 i_4_, 752061035);
	    ((Class583_Sub1) this).aClass241_Sub3_8731.payload = null;
	    ((Class583_Sub1) this).aClass241_Sub3_8731.pointer = 0;
	    ((Class583_Sub1) this).anInt8729 += 919045309;
	    for (int i_5_ = 0; i_5_ < 9; i_5_++)
		((Class583_Sub1) this).aByteArrayArray8732[i_5_]
		    = ((Class583_Sub1) this).aByteArrayArray8732[1 + i_5_];
	    ((Class583_Sub1) this).aByteArrayArray8732[9] = null;
	    if (579704469 * ((Class583_Sub1) this).anInt8729
		>= ((Class583_Sub1) this).anIntArray8728.length) {
		((Class583_Sub1) this).aClass241_Sub3_8725.payload
		    = null;
		return 421967667 * (((Class583_Sub1) this).aClass241_Sub3_8725
				    .pointer);
	    }
	}
	((Class583_Sub1) this).aClass241_Sub3_8725.payload = null;
	return is.length;
    }
    
    public void method14418(byte i) {
	if (null != ((Class583_Sub1) this).anIntArray8728) {
	    for (int i_6_ = 0;
		 (i_6_ < 10
		  && (579704469 * ((Class583_Sub1) this).anInt8729 + i_6_
		      < ((Class583_Sub1) this).anIntArray8728.length));
		 i_6_++) {
		if (((Class583_Sub1) this).aByteArrayArray8732[i_6_] == null
		    && (((Class583_Sub1) this).aClass210_8727.method4188
			((((Class583_Sub1) this).anIntArray8728
			  [(i_6_
			    + 579704469 * ((Class583_Sub1) this).anInt8729)]),
			 0, -1513838780)))
		    ((Class583_Sub1) this).aByteArrayArray8732[i_6_]
			= (((Class583_Sub1) this).aClass210_8727.getfile
			   ((((Class583_Sub1) this).anIntArray8728
			     [(((Class583_Sub1) this).anInt8729 * 579704469
			       + i_6_)]),
			    0, 2076111462));
	    }
	}
    }
    
    int method12793(byte[] is) throws IOException {
	if (null == ((Class583_Sub1) this).anIntArray8728) {
	    if (!((Class583_Sub1) this).aClass210_8727.method4188
		 (902618177 * ((Class583_Sub1) this).anInt8726, 0, -997971600))
		return 0;
	    byte[] is_7_ = (((Class583_Sub1) this).aClass210_8727.getfile
			    (((Class583_Sub1) this).anInt8726 * 902618177, 0,
			     1753068931));
	    if (null == is_7_)
		throw new IllegalStateException("");
	    ((Class583_Sub1) this).aClass241_Sub3_8725.payload = is_7_;
	    ((Class583_Sub1) this).aClass241_Sub3_8725.pointer = 0;
	    int i = is_7_.length >> 1;
	    ((Class583_Sub1) this).anIntArray8728 = new int[i];
	    for (int i_8_ = 0; i_8_ < i; i_8_++)
		((Class583_Sub1) this).anIntArray8728[i_8_]
		    = ((Class583_Sub1) this).aClass241_Sub3_8725
			  .readUnsignedShort(1162222719);
	}
	if (((Class583_Sub1) this).anInt8729 * 579704469
	    >= ((Class583_Sub1) this).anIntArray8728.length)
	    return -1;
	method14418((byte) -7);
	((Class583_Sub1) this).aClass241_Sub3_8725.payload = is;
	((Class583_Sub1) this).aClass241_Sub3_8725.pointer = 0;
	while (((Class583_Sub1) this).aClass241_Sub3_8725.pointer * 421967667
	       < (((Class583_Sub1) this).aClass241_Sub3_8725
		  .payload).length) {
	    if (((Class583_Sub1) this).aClass241_Sub3_8731.payload
		== null) {
		if (((Class583_Sub1) this).aByteArrayArray8732[0] == null) {
		    ((Class583_Sub1) this).aClass241_Sub3_8725.payload
			= null;
		    return 421967667 * (((Class583_Sub1) this)
					.aClass241_Sub3_8725.pointer);
		}
		((Class583_Sub1) this).aClass241_Sub3_8731.payload
		    = ((Class583_Sub1) this).aByteArrayArray8732[0];
	    }
	    int i = ((((Class583_Sub1) this).aClass241_Sub3_8725
		      .payload).length
		     - (((Class583_Sub1) this).aClass241_Sub3_8725.pointer
			* 421967667));
	    int i_9_ = ((((Class583_Sub1) this).aClass241_Sub3_8731
			 .payload).length
			- 421967667 * (((Class583_Sub1) this)
				       .aClass241_Sub3_8731.pointer));
	    if (i < i_9_) {
		((Class583_Sub1) this).aClass241_Sub3_8731.readBytes
		    (((Class583_Sub1) this).aClass241_Sub3_8725.payload,
		     (421967667
		      * ((Class583_Sub1) this).aClass241_Sub3_8725.pointer),
		     i, (byte) 1);
		((Class583_Sub1) this).aClass241_Sub3_8725.payload
		    = null;
		return is.length;
	    }
	    ((Class583_Sub1) this).aClass241_Sub3_8725.writeBytes
		(((Class583_Sub1) this).aClass241_Sub3_8731.payload,
		 (421967667
		  * ((Class583_Sub1) this).aClass241_Sub3_8731.pointer),
		 i_9_, 752061035);
	    ((Class583_Sub1) this).aClass241_Sub3_8731.payload = null;
	    ((Class583_Sub1) this).aClass241_Sub3_8731.pointer = 0;
	    ((Class583_Sub1) this).anInt8729 += 919045309;
	    for (int i_10_ = 0; i_10_ < 9; i_10_++)
		((Class583_Sub1) this).aByteArrayArray8732[i_10_]
		    = ((Class583_Sub1) this).aByteArrayArray8732[1 + i_10_];
	    ((Class583_Sub1) this).aByteArrayArray8732[9] = null;
	    if (579704469 * ((Class583_Sub1) this).anInt8729
		>= ((Class583_Sub1) this).anIntArray8728.length) {
		((Class583_Sub1) this).aClass241_Sub3_8725.payload
		    = null;
		return 421967667 * (((Class583_Sub1) this).aClass241_Sub3_8725
				    .pointer);
	    }
	}
	((Class583_Sub1) this).aClass241_Sub3_8725.payload = null;
	return is.length;
    }
    
    int method12795(byte[] is) throws IOException {
	if (null == ((Class583_Sub1) this).anIntArray8728) {
	    if (!((Class583_Sub1) this).aClass210_8727.method4188
		 (902618177 * ((Class583_Sub1) this).anInt8726, 0, -872871468))
		return 0;
	    byte[] is_11_ = (((Class583_Sub1) this).aClass210_8727.getfile
			     (((Class583_Sub1) this).anInt8726 * 902618177, 0,
			      83830110));
	    if (null == is_11_)
		throw new IllegalStateException("");
	    ((Class583_Sub1) this).aClass241_Sub3_8725.payload = is_11_;
	    ((Class583_Sub1) this).aClass241_Sub3_8725.pointer = 0;
	    int i = is_11_.length >> 1;
	    ((Class583_Sub1) this).anIntArray8728 = new int[i];
	    for (int i_12_ = 0; i_12_ < i; i_12_++)
		((Class583_Sub1) this).anIntArray8728[i_12_]
		    = ((Class583_Sub1) this).aClass241_Sub3_8725
			  .readUnsignedShort(1162222719);
	}
	if (((Class583_Sub1) this).anInt8729 * 579704469
	    >= ((Class583_Sub1) this).anIntArray8728.length)
	    return -1;
	method14418((byte) 14);
	((Class583_Sub1) this).aClass241_Sub3_8725.payload = is;
	((Class583_Sub1) this).aClass241_Sub3_8725.pointer = 0;
	while (((Class583_Sub1) this).aClass241_Sub3_8725.pointer * 421967667
	       < (((Class583_Sub1) this).aClass241_Sub3_8725
		  .payload).length) {
	    if (((Class583_Sub1) this).aClass241_Sub3_8731.payload
		== null) {
		if (((Class583_Sub1) this).aByteArrayArray8732[0] == null) {
		    ((Class583_Sub1) this).aClass241_Sub3_8725.payload
			= null;
		    return 421967667 * (((Class583_Sub1) this)
					.aClass241_Sub3_8725.pointer);
		}
		((Class583_Sub1) this).aClass241_Sub3_8731.payload
		    = ((Class583_Sub1) this).aByteArrayArray8732[0];
	    }
	    int i = ((((Class583_Sub1) this).aClass241_Sub3_8725
		      .payload).length
		     - (((Class583_Sub1) this).aClass241_Sub3_8725.pointer
			* 421967667));
	    int i_13_ = ((((Class583_Sub1) this).aClass241_Sub3_8731
			  .payload).length
			 - 421967667 * (((Class583_Sub1) this)
					.aClass241_Sub3_8731.pointer));
	    if (i < i_13_) {
		((Class583_Sub1) this).aClass241_Sub3_8731.readBytes
		    (((Class583_Sub1) this).aClass241_Sub3_8725.payload,
		     (421967667
		      * ((Class583_Sub1) this).aClass241_Sub3_8725.pointer),
		     i, (byte) 52);
		((Class583_Sub1) this).aClass241_Sub3_8725.payload
		    = null;
		return is.length;
	    }
	    ((Class583_Sub1) this).aClass241_Sub3_8725.writeBytes
		(((Class583_Sub1) this).aClass241_Sub3_8731.payload,
		 (421967667
		  * ((Class583_Sub1) this).aClass241_Sub3_8731.pointer),
		 i_13_, 752061035);
	    ((Class583_Sub1) this).aClass241_Sub3_8731.payload = null;
	    ((Class583_Sub1) this).aClass241_Sub3_8731.pointer = 0;
	    ((Class583_Sub1) this).anInt8729 += 919045309;
	    for (int i_14_ = 0; i_14_ < 9; i_14_++)
		((Class583_Sub1) this).aByteArrayArray8732[i_14_]
		    = ((Class583_Sub1) this).aByteArrayArray8732[1 + i_14_];
	    ((Class583_Sub1) this).aByteArrayArray8732[9] = null;
	    if (579704469 * ((Class583_Sub1) this).anInt8729
		>= ((Class583_Sub1) this).anIntArray8728.length) {
		((Class583_Sub1) this).aClass241_Sub3_8725.payload
		    = null;
		return 421967667 * (((Class583_Sub1) this).aClass241_Sub3_8725
				    .pointer);
	    }
	}
	((Class583_Sub1) this).aClass241_Sub3_8725.payload = null;
	return is.length;
    }
    
    public Class583_Sub1(int i, JS5 class210, int i_15_) {
	super(i);
	((Class583_Sub1) this).aClass241_Sub3_8731 = new RSByteBuffer(null);
	((Class583_Sub1) this).aClass241_Sub3_8725 = new RSByteBuffer(null);
	((Class583_Sub1) this).aClass210_8727 = class210;
	((Class583_Sub1) this).anInt8726 = -1720896575 * i_15_;
    }
    
    public void method14419() {
	if (null != ((Class583_Sub1) this).anIntArray8728) {
	    for (int i = 0;
		 i < 10 && (579704469 * ((Class583_Sub1) this).anInt8729 + i
			    < ((Class583_Sub1) this).anIntArray8728.length);
		 i++) {
		if (((Class583_Sub1) this).aByteArrayArray8732[i] == null
		    && (((Class583_Sub1) this).aClass210_8727.method4188
			((((Class583_Sub1) this).anIntArray8728
			  [i + 579704469 * ((Class583_Sub1) this).anInt8729]),
			 0, -2019255665)))
		    ((Class583_Sub1) this).aByteArrayArray8732[i]
			= (((Class583_Sub1) this).aClass210_8727.getfile
			   ((((Class583_Sub1) this).anIntArray8728
			     [(((Class583_Sub1) this).anInt8729 * 579704469
			       + i)]),
			    0, -354642211));
	    }
	}
    }
    
    int method12794(byte[] is) throws IOException {
	if (null == ((Class583_Sub1) this).anIntArray8728) {
	    if (!((Class583_Sub1) this).aClass210_8727.method4188
		 (902618177 * ((Class583_Sub1) this).anInt8726, 0, -928074526))
		return 0;
	    byte[] is_16_ = (((Class583_Sub1) this).aClass210_8727.getfile
			     (((Class583_Sub1) this).anInt8726 * 902618177, 0,
			      1186104690));
	    if (null == is_16_)
		throw new IllegalStateException("");
	    ((Class583_Sub1) this).aClass241_Sub3_8725.payload = is_16_;
	    ((Class583_Sub1) this).aClass241_Sub3_8725.pointer = 0;
	    int i = is_16_.length >> 1;
	    ((Class583_Sub1) this).anIntArray8728 = new int[i];
	    for (int i_17_ = 0; i_17_ < i; i_17_++)
		((Class583_Sub1) this).anIntArray8728[i_17_]
		    = ((Class583_Sub1) this).aClass241_Sub3_8725
			  .readUnsignedShort(1162222719);
	}
	if (((Class583_Sub1) this).anInt8729 * 579704469
	    >= ((Class583_Sub1) this).anIntArray8728.length)
	    return -1;
	method14418((byte) -113);
	((Class583_Sub1) this).aClass241_Sub3_8725.payload = is;
	((Class583_Sub1) this).aClass241_Sub3_8725.pointer = 0;
	while (((Class583_Sub1) this).aClass241_Sub3_8725.pointer * 421967667
	       < (((Class583_Sub1) this).aClass241_Sub3_8725
		  .payload).length) {
	    if (((Class583_Sub1) this).aClass241_Sub3_8731.payload
		== null) {
		if (((Class583_Sub1) this).aByteArrayArray8732[0] == null) {
		    ((Class583_Sub1) this).aClass241_Sub3_8725.payload
			= null;
		    return 421967667 * (((Class583_Sub1) this)
					.aClass241_Sub3_8725.pointer);
		}
		((Class583_Sub1) this).aClass241_Sub3_8731.payload
		    = ((Class583_Sub1) this).aByteArrayArray8732[0];
	    }
	    int i = ((((Class583_Sub1) this).aClass241_Sub3_8725
		      .payload).length
		     - (((Class583_Sub1) this).aClass241_Sub3_8725.pointer
			* 421967667));
	    int i_18_ = ((((Class583_Sub1) this).aClass241_Sub3_8731
			  .payload).length
			 - 421967667 * (((Class583_Sub1) this)
					.aClass241_Sub3_8731.pointer));
	    if (i < i_18_) {
		((Class583_Sub1) this).aClass241_Sub3_8731.readBytes
		    (((Class583_Sub1) this).aClass241_Sub3_8725.payload,
		     (421967667
		      * ((Class583_Sub1) this).aClass241_Sub3_8725.pointer),
		     i, (byte) -2);
		((Class583_Sub1) this).aClass241_Sub3_8725.payload
		    = null;
		return is.length;
	    }
	    ((Class583_Sub1) this).aClass241_Sub3_8725.writeBytes
		(((Class583_Sub1) this).aClass241_Sub3_8731.payload,
		 (421967667
		  * ((Class583_Sub1) this).aClass241_Sub3_8731.pointer),
		 i_18_, 752061035);
	    ((Class583_Sub1) this).aClass241_Sub3_8731.payload = null;
	    ((Class583_Sub1) this).aClass241_Sub3_8731.pointer = 0;
	    ((Class583_Sub1) this).anInt8729 += 919045309;
	    for (int i_19_ = 0; i_19_ < 9; i_19_++)
		((Class583_Sub1) this).aByteArrayArray8732[i_19_]
		    = ((Class583_Sub1) this).aByteArrayArray8732[1 + i_19_];
	    ((Class583_Sub1) this).aByteArrayArray8732[9] = null;
	    if (579704469 * ((Class583_Sub1) this).anInt8729
		>= ((Class583_Sub1) this).anIntArray8728.length) {
		((Class583_Sub1) this).aClass241_Sub3_8725.payload
		    = null;
		return 421967667 * (((Class583_Sub1) this).aClass241_Sub3_8725
				    .pointer);
	    }
	}
	((Class583_Sub1) this).aClass241_Sub3_8725.payload = null;
	return is.length;
    }
    
    static final void method14420(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (Class8.extractVarWatchKeys(string, class454, (byte) -72) != null)
	    string = string.substring(0, string.length() - 1);
	class58.anObjectArray953
	    = Class299.extractCs2Params(string, class454, 2071284771);
	class58.hasClientScript = true;
    }
}
