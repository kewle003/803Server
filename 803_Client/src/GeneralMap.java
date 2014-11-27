/* Class241_Sub39_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GeneralMap extends Class241_Sub39
{
    HashTable aClass407_10827;
    
    void method17092(RSByteBuffer class241_sub3, int i) {
	if (i == 249) {
	    int i_0_ = class241_sub3.readUnsignedByte((byte) -39);
	    if (null == aClass407_10827) {
			int i_1_ = Class480.method11001(i_0_, (byte) -14);
			aClass407_10827 = new HashTable(i_1_);
	    }
	    for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
		boolean bool = class241_sub3.readUnsignedByte((byte) 22) == 1;
		int i_3_ = class241_sub3.readTriByte(1771646547);
		Node class241;
		if (bool)
		    class241 = new ObjectNode(class241_sub3
						      .readString(-76697971));
		else
		    class241 = new IntegerNode(class241_sub3
						      .readInt((byte) 87));
		aClass407_10827
		    .put(class241, (long) i_3_);
	    }
	}
    }
    
    void decode/*method17093*/(RSByteBuffer buffer, byte i) {
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) -5);
		    if (opcode == 0) {
		    	break;
		    }
		    decode(buffer, opcode, -1473711704);
		}
    }
    
    void decode/*method17094*/(RSByteBuffer buffer, int i, int i_5_) {
		if (i == 249) {
		    int i_6_ = buffer.readUnsignedByte((byte) 37);
		    if (null == aClass407_10827) {
				int i_7_ = Class480.method11001(i_6_, (byte) 29);
				aClass407_10827 = new HashTable(i_7_);
		    }
		    for (int i_8_ = 0; i_8_ < i_6_; i_8_++) {
				boolean bool = buffer.readUnsignedByte((byte) -16) == 1;
				int i_9_ = buffer.readTriByte(1771646547);
				Node class241;
				if (bool) {
				    class241 = new ObjectNode(buffer.readString(-1814565250));
				} else {
				    class241 = new IntegerNode(buffer.readInt((byte) 66));
				}
				aClass407_10827.put(class241, (long) i_9_);
		    }
		}
    }
    
    public int getParamValueInt/*method17095*/(int i, int defaultInt, byte i_11_) {
		if (null == aClass407_10827) {
		    return defaultInt;
		}
		IntegerNode class241_sub22 = (IntegerNode) aClass407_10827.get((long) i);
		if (class241_sub22 == null) {
		    return defaultInt;
		}
		return class241_sub22.intValue * -1859754807;
    }
    
    public String getParamValueStr/*method17096*/(int key, String defaultValue, byte i_12_) {
		if (null == aClass407_10827) {
		    return defaultValue;
		}
		ObjectNode class241_sub26 = (ObjectNode) aClass407_10827.get((long) key);
		if (null == class241_sub26) {
		    return defaultValue;
		}
		return (String) class241_sub26.objectValue;
    }
    
    void method17097(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -23);
	    if (i == 0)
		break;
	    decode(class241_sub3, i, -1473711704);
	}
    }
    
    public int method17098(int i, int i_13_) {
	if (null == aClass407_10827)
	    return i_13_;
	IntegerNode class241_sub22
	    = (IntegerNode) aClass407_10827
				   .get((long) i);
	if (class241_sub22 == null)
	    return i_13_;
	return class241_sub22.intValue * -1859754807;
    }
    
    void method17099(RSByteBuffer class241_sub3, int i) {
	if (i == 249) {
	    int i_14_ = class241_sub3.readUnsignedByte((byte) -87);
	    if (null == aClass407_10827) {
		int i_15_ = Class480.method11001(i_14_, (byte) 42);
		aClass407_10827
		    = new HashTable(i_15_);
	    }
	    for (int i_16_ = 0; i_16_ < i_14_; i_16_++) {
		boolean bool = class241_sub3.readUnsignedByte((byte) -19) == 1;
		int i_17_ = class241_sub3.readTriByte(1771646547);
		Node class241;
		if (bool)
		    class241
			= new ObjectNode(class241_sub3
						 .readString(-956320820));
		else
		    class241 = new IntegerNode(class241_sub3
						      .readInt((byte) 11));
		aClass407_10827
		    .put(class241, (long) i_17_);
	    }
	}
    }
    
    void method17100(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -12);
	    if (i == 0)
		break;
	    decode(class241_sub3, i, -1473711704);
	}
    }
    
    public int method17101(int i, int i_18_) {
	if (null == aClass407_10827)
	    return i_18_;
	IntegerNode class241_sub22
	    = (IntegerNode) aClass407_10827
				   .get((long) i);
	if (class241_sub22 == null)
	    return i_18_;
	return class241_sub22.intValue * -1859754807;
    }
    
    GeneralMap() {
	/* empty */
    }
    
    public int method17102(int i, int i_19_) {
	if (null == aClass407_10827)
	    return i_19_;
	IntegerNode class241_sub22
	    = (IntegerNode) aClass407_10827
				   .get((long) i);
	if (class241_sub22 == null)
	    return i_19_;
	return class241_sub22.intValue * -1859754807;
    }
    
    public String method17103(int i, String string) {
	if (null == aClass407_10827)
	    return string;
	ObjectNode class241_sub26
	    = (ObjectNode) aClass407_10827
				   .get((long) i);
	if (null == class241_sub26)
	    return string;
	return (String) class241_sub26.objectValue;
    }
}
