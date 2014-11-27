/* Class332 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class332
{
    static final int anInt5048 = 0;
    static Class129 aClass129_5049 = new Class129(64);
    static JS5 aClass210_5050;
    public int anInt5051 = 1262492959;
    public int anInt5052 = -1132102464;
    public int anInt5053 = -282692416;
    public boolean aBool5054;
    public int anInt5055;
    public boolean aBool5056;
    public int anInt5057 = -446174450;
    
    void method6045(RSByteBuffer class241_sub3, int i, int i_0_, byte i_1_) {
	if (1 == i) {
	    anInt5051 = class241_sub3.readUnsignedShort(1162222719) * -1262492959;
	    if (65535 == 73195809 * anInt5051)
		anInt5051 = 1262492959;
	} else if (2 == i) {
	    anInt5052
		= (class241_sub3.readUnsignedShort(1162222719) + 1) * -17689101;
	    anInt5053
		= (class241_sub3.readUnsignedShort(1162222719) + 1) * 599562707;
	} else if (3 == i)
	    class241_sub3.getByte(-1224916565);
	else if (i == 4)
	    anInt5057 = class241_sub3.readUnsignedByte((byte) 37) * -223087225;
	else if (i == 5)
	    anInt5055 = class241_sub3.readUnsignedByte((byte) 28) * -96384015;
	else if (i == 6)
	    aBool5056 = true;
	else if (7 == i)
	    aBool5054 = true;
    }
    
    Class332() {
	anInt5055 = -96384015;
	aBool5056 = false;
	aBool5054 = false;
    }
    
    void method6046(RSByteBuffer class241_sub3, int i, int i_2_) {
	for (;;) {
	    int i_3_ = class241_sub3.readUnsignedByte((byte) 62);
	    if (0 == i_3_)
		break;
	    method6045(class241_sub3, i_3_, i, (byte) 16);
	}
    }
    
    public static void method6047(JS5 class210) {
	aClass210_5050 = class210;
    }
    
    public static Class332 method6048(int i) {
	Class332 class332 = (Class332) aClass129_5049.get((long) i);
	if (class332 != null)
	    return class332;
	byte[] is = aClass210_5050.getfile(0, i, 590230087);
	class332 = new Class332();
	if (is != null)
	    class332.method6046(new RSByteBuffer(is), i, 612946731);
	aClass129_5049.put(class332, (long) i);
	return class332;
    }
    
    public static Class332 method6049(int i) {
	Class332 class332 = (Class332) aClass129_5049.get((long) i);
	if (class332 != null)
	    return class332;
	byte[] is = aClass210_5050.getfile(0, i, 558230856);
	class332 = new Class332();
	if (is != null)
	    class332.method6046(new RSByteBuffer(is), i, -1815865573);
	aClass129_5049.put(class332, (long) i);
	return class332;
    }
    
    public static Class332 method6050(int i) {
	Class332 class332 = (Class332) aClass129_5049.get((long) i);
	if (class332 != null)
	    return class332;
	byte[] is = aClass210_5050.getfile(0, i, 1604036644);
	class332 = new Class332();
	if (is != null)
	    class332.method6046(new RSByteBuffer(is), i, 1923341057);
	aClass129_5049.put(class332, (long) i);
	return class332;
    }
    
    void method6051(RSByteBuffer class241_sub3, int i) {
	for (;;) {
	    int i_4_ = class241_sub3.readUnsignedByte((byte) 14);
	    if (0 == i_4_)
		break;
	    method6045(class241_sub3, i_4_, i, (byte) 16);
	}
    }
    
    void method6052(RSByteBuffer class241_sub3, int i) {
	for (;;) {
	    int i_5_ = class241_sub3.readUnsignedByte((byte) -34);
	    if (0 == i_5_)
		break;
	    method6045(class241_sub3, i_5_, i, (byte) 16);
	}
    }
    
    void method6053(RSByteBuffer class241_sub3, int i) {
	for (;;) {
	    int i_6_ = class241_sub3.readUnsignedByte((byte) -8);
	    if (0 == i_6_)
		break;
	    method6045(class241_sub3, i_6_, i, (byte) 16);
	}
    }
    
    static final void method6054(ClientScriptData class454, int i) {
	int i_7_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_7_, (byte) -29);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_7_ >> 16];
	Class104.method2650(class58, class35, class454, -1685453665);
    }
    
    static final void method6055(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_8_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_9_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	int i_10_ = (((ClientScriptData) class454).integerStack
		     [2 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	Class581.processActionButton(1, i_8_ << 16 | i_9_, i_10_, "", -859201654);
    }
    
    static final void method6056(ClientScriptData class454, byte i) {
	boolean bool = true;
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (client.aBool8267) {
	    try {
		Object object
		    = JSFunction.aClass348_5371
			  .method6209(new Object[] { string }, -948551677);
		if (object != null)
		    bool = ((Boolean) object).booleanValue();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = bool ? 1 : 0;
    }
    
    static final void method6057(ClientScriptData class454, int i) {
	int i_11_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_11_, (byte) -10);
	Class76.method1771(class58, class454, -2140811764);
    }
    
    static final void method6058(InterfaceComponent component, InterfaceDefinition iFace,
				 ClientScriptData scriptData, int i) {
		int friendIdx = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		if (client.friendListStage * -2020075851 == 2 && friendIdx < 1557840217 * client.friendListSize) {
			component.linkedFriend = client.friendList[friendIdx].currentName;
		}
    }
    
    static final void method6059(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_13_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_14_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	if (Class442.aBool6160) {
	    Class537.method11899(3, i_13_, i_14_, false, 1482319719);
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= Class228.aFrame2674 != null ? 1 : 0;
	} else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
    }
}
