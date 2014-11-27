/* Class543 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class AnimationConfig
{
    public boolean[] aBoolArray7014;
    static long aLong7015;
    
    void read/*method11953*/(RSByteBuffer buffer, int opcode, int i_0_) {
		if (2 == opcode) {
		    aBoolArray7014 = new boolean[400];
		    int length = buffer.readSmart((short) -3314);
		    for (int index = 0; index < length; index++) {
		    	aBoolArray7014[buffer.readSmart((short) -21081)] = true;
		    }
		} else if (opcode == 3) {
			buffer.readUnsignedByte((byte) -27);
		    int length = buffer.readSmart((short) -19817);
		    for (int index = 0; index < length; index++) {
		    	buffer.readSmart((short) -2328);
		    	buffer.readUnsignedByte((byte) -9);
		    }
		}
    }
    
    AnimationConfig() {
	/* empty */
    }
    
    void method11954(RSByteBuffer class241_sub3, int i) {
	if (2 == i) {
	    aBoolArray7014 = new boolean[400];
	    int i_5_ = class241_sub3.readSmart((short) -20437);
	    for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
		aBoolArray7014[class241_sub3.readSmart((short) -3240)]
		    = true;
	} else if (i == 3) {
	    class241_sub3.readUnsignedByte((byte) -93);
	    int i_7_ = class241_sub3.readSmart((short) -11158);
	    for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
		class241_sub3.readSmart((short) -31569);
		class241_sub3.readUnsignedByte((byte) 11);
	    }
	}
    }
    
    void method11955(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -6);
	    if (i == 0)
		break;
	    read(class241_sub3, i, -1403765475);
	}
    }
    
    void read/*method11956*/(RSByteBuffer buffer, int i) {
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) 78);
		    if (opcode == 0) {
		    	break;
		    }
		    read(buffer, opcode, -1403765475);
		}
    }
    
    void method11957(RSByteBuffer class241_sub3, int i) {
	if (2 == i) {
	    aBoolArray7014 = new boolean[400];
	    int i_10_ = class241_sub3.readSmart((short) -10507);
	    for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
		aBoolArray7014[class241_sub3.readSmart((short) -31779)]
		    = true;
	} else if (i == 3) {
	    class241_sub3.readUnsignedByte((byte) 9);
	    int i_12_ = class241_sub3.readSmart((short) -8003);
	    for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
		class241_sub3.readSmart((short) -2771);
		class241_sub3.readUnsignedByte((byte) -67);
	    }
	}
    }
    
    static final void storeGeneralMapValue/*method11958*/(ClientScriptData scriptData, int i) {
    	scriptData.intStackPointer -= -821458770;
		int type = scriptData.integerStack[1482319719 * scriptData.intStackPointer];
		int key = scriptData.integerStack[scriptData.intStackPointer * 1482319719 + 1];
		ParamType paramType = Class621.paramTypeList.list(key, -14759000);
		if (paramType.method13186(658726847)) {
			scriptData.objectStack[((scriptData.objectStackPointer += -1650705371) * -290357331 - 1)]
					= Class610.generalMapList.method13435(type, -787147009)
						.getParamValueStr(key, paramType.defaultstr, (byte) 81);
		} else {
			scriptData.integerStack[((scriptData.intStackPointer += 1736754263) * 1482319719 - 1)]
					= Class610.generalMapList.method13435(type, -787147009)
							.getParamValueInt(key, paramType.defaultint * 2015998927, (byte) 49);
		}
    }
    
    static final void method11959(ClientScriptData class454, int i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub7_8865,
	     (((ClientScriptData) class454).integerStack
	      [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]),
	     (byte) 2);
	client.aClass238_8477.method4768((byte) 5);
	Class167.method3600((short) 5374);
	client.aBool8297 = false;
    }
    
    static final void method11960(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_16_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_17_ = (((ClientScriptData) class454).integerStack
		     [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_18_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer + 2]);
	Class581.processActionButton(6, i_16_ << 16 | i_17_, i_18_, "", -1685273123);
    }
    
    static boolean method11961(int i, int i_19_) {
	if (i == 3 || i == 4 || 5 == i || i == 6 || i == 1001 || i == 1002)
	    return true;
	if (2 == i)
	    return true;
	return false;
    }
    
    static final void method11962(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class175.method3738(class58, class35, class454, (byte) 36);
    }
    
    static final void method11963(ClientScriptData class454, byte i) {
	int i_20_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8879
		  .method7880(i_20_, 996762312);
    }
    
    static final void method11964(ClientScriptData class454, byte i) {
	int i_21_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class445_Sub16.aClass351_Sub1_8660.method6277(i_21_, (byte) -30);
    }
}
