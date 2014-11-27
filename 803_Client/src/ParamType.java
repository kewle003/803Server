/* Class603 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

//package com.jagex.game.runetek6.config.paramtype;
public class ParamType {
    char type;//aChar7736
    public int defaultint;//anInt7737
    public String defaultstr;//aString7738
    public boolean autodisable = true;//aBool7739
    public static int anInt7740;
    
    void decode/*method13181*/(RSByteBuffer buffer, int opcode, byte i_0_) {
		if (1 == opcode) {
		    type = Class80.method1809(buffer.getByte(964429926), 124736454);
		} else if (2 == opcode) {
		    defaultint = buffer.readInt((byte) 96) * 1020162863;
		} else if (opcode == 4) {
		    autodisable = false;
		} else if (5 == opcode) {
		    defaultstr = buffer.readString(-1674728962);
		}
    }
    
    void decode/*method13182*/(RSByteBuffer buffer, int i) {
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) 53);
		    if (0 == opcode) {
		    	break;
		    }
		    decode(buffer, opcode, (byte) -31);
		}
    }
    
    ParamType() {
	/* empty */
    }
    
    public boolean method13183() {
	return type == 's';
    }
    
    void method13184(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 48);
	    if (0 == i)
		break;
	    decode(class241_sub3, i, (byte) -41);
	}
    }
    
    void method13185(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -48);
	    if (0 == i)
		break;
	    decode(class241_sub3, i, (byte) -95);
	}
    }
    
    public boolean method13186(int i) {
	return type == 's';
    }
    
    void method13187(RSByteBuffer class241_sub3, int i) {
	if (1 == i)
	    type
		= Class80.method1809(class241_sub3.getByte(-1248929968),
				     -634408290);
	else if (2 == i)
	    defaultint = class241_sub3.readInt((byte) 55) * 1020162863;
	else if (i == 4)
	    autodisable = false;
	else if (5 == i)
	    defaultstr = class241_sub3.readString(1410213655);
    }
    
    public boolean method13188() {
	return type == 's';
    }
    
    void method13189(RSByteBuffer class241_sub3, int i) {
	if (1 == i)
	    type
		= Class80.method1809(class241_sub3.getByte(-1808519235),
				     -2144372594);
	else if (2 == i)
	    defaultint = class241_sub3.readInt((byte) 65) * 1020162863;
	else if (i == 4)
	    autodisable = false;
	else if (5 == i)
	    defaultstr = class241_sub3.readString(-2012885773);
    }
    
    public boolean method13190() {
	return type == 's';
    }
    
    static final void method13191(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, byte i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	int[] is = Class8.extractVarWatchKeys(string, class454, (byte) -49);
	if (is != null)
	    string = string.substring(0, string.length() - 1);
	class58.onItemsUpdateScript
	    = Class299.extractCs2Params(string, class454, -87183540);
	class58.itemUpdateWatch = is;
	class58.hasClientScript = true;
    }
    
    static final void method13192(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 1736754263;
    }
    
    static final void method13193(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	if (i_3_ == -1)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= Class123.aClass292_1579.method5686(i_2_, (byte) 13)
		      .method17379((char) i_3_, (byte) -108);
    }
    
    static final void method13194(ClientScriptData class454, int i)
	throws Exception_Sub5 {
	((ClientScriptData) class454).intStackPointer -= -1642917540;
	int i_4_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_5_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	int i_6_ = (((ClientScriptData) class454).integerStack
		    [2 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_7_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 3]);
	Class287 class287
	    = Class287.method5561((float) i_4_, (float) i_5_, (float) i_6_);
	if (-1.0F == class287.aFloat4477)
	    class287.aFloat4477 = Float.POSITIVE_INFINITY;
	if (class287.aFloat4474 == -1.0F)
	    class287.aFloat4474 = Float.POSITIVE_INFINITY;
	if (class287.aFloat4479 == -1.0F)
	    class287.aFloat4479 = Float.POSITIVE_INFINITY;
	Class445_Sub16.aClass351_Sub1_8660.method6264(class287, -611708878);
	Class445_Sub16.aClass351_Sub1_8660.method6261((float) i_7_ / 1000.0F,
						      935082320);
	class287.method5564();
    }
    
    static void method13195(byte i) {
	if (Class222.method4487(1766317249 * client.anInt8288, 1767065283)) {
	    if (client.aClass190_8339.getIO(140359369) == null)
		Class496.setClientStage(11, (byte) -94);
	    else
		Class496.setClientStage(2, (byte) -12);
	} else if (11 == 1766317249 * client.anInt8288
		   || 12 == client.anInt8288 * 1766317249)
	    Class496.setClientStage(17, (byte) -100);
	else if (1766317249 * client.anInt8288 == 5)
	    Class496.setClientStage(17, (byte) -69);
    }
}
