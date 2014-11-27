/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class52
{
    static final void method1279(long l) {
	try {
	    Thread.sleep(l);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    public static final void method1280(long l) {
	if (l > 0L) {
	    if (0L == l % 10L) {
		Class102.method2213(l - 1L);
		Class102.method2213(1L);
	    } else
		Class102.method2213(l);
	}
    }
    
    static final void method1281(long l) {
	try {
	    Thread.sleep(l);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    Class52() throws Throwable {
	throw new Error();
    }
    
    static final void method1282(long l) {
	try {
	    Thread.sleep(l);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    static final void method1283(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -77);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_0_ >> 16];
	Class291.method5683(class58, class35, class454, -326469051);
    }
    
    static final void method1284(ClientScriptData class454, byte i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_1_, (byte) -24);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_1_ >> 16];
	Class75.method1764(class58, class35, class454, (byte) 79);
    }
    
    static final void method1285(ClientScriptData class454, int i) {
	((ClientScriptData) class454).objectStackPointer -= 993556554;
	String string
	    = (String) (((ClientScriptData) class454).objectStack
			[-290357331 * ((ClientScriptData) class454).objectStackPointer]);
	String string_2_
	    = (String) (((ClientScriptData) class454).objectStack
			[1 + -290357331 * ((ClientScriptData) class454).objectStackPointer]);
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = string.indexOf(string_2_, i_3_);
    }
    
    static final void method1286(ClientScriptData class454, int i) {
	Class503.method11464(-859160156);
    }
    
    static final void method1287(ClientScriptData class454, int i) {
	int i_4_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class507_Sub1 class507_sub1 = Class115.method2803(i_4_, (byte) 28);
	if (class507_sub1 != null) {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 2058706651 * class507_sub1.anInt6664;
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= class507_sub1.aString8737;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class507_sub1.method14432((byte) -89);
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= class507_sub1.method14433(16711935);
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -760939251 * class507_sub1.anInt6669;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class507_sub1.anInt8735 * 212635377;
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= class507_sub1.aString8736;
	} else {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	}
    }
    
    public static Class604 method1288(ItemDefinition class623,
				      RSByteBuffer class241_sub3, int i) {
	Class604 class604 = new Class604(class623);
	int i_5_ = class241_sub3.readUnsignedByte((byte) -30);
	boolean bool = 0 != (i_5_ & 0x1);
	boolean bool_6_ = 0 != (i_5_ & 0x2);
	boolean bool_7_ = (i_5_ & 0x4) != 0;
	boolean bool_8_ = 0 != (i_5_ & 0x8);
	if (bool) {
	    class604.anIntArray7742[0] = class241_sub3.readBigSmart((byte) 8);
	    class604.anIntArray7746[0] = class241_sub3.readBigSmart((byte) 40);
	    if (-1 != ((ItemDefinition) class623).maleEquip2 * -907955105
		|| -541441075 * ((ItemDefinition) class623).femaleEquip2 != -1) {
		class604.anIntArray7742[1]
		    = class241_sub3.readBigSmart((byte) 51);
		class604.anIntArray7746[1]
		    = class241_sub3.readBigSmart((byte) 99);
	    }
	    if (((ItemDefinition) class623).colourEquip1 * 795824037 != -1
		|| -1 != -471628237 * ((ItemDefinition) class623).colourEquip2) {
		class604.anIntArray7742[2]
		    = class241_sub3.readBigSmart((byte) -40);
		class604.anIntArray7746[2]
		    = class241_sub3.readBigSmart((byte) 29);
	    }
	}
	if (bool_6_) {
	    class604.anIntArray7747[0] = class241_sub3.readBigSmart((byte) -44);
	    class604.anIntArray7743[0] = class241_sub3.readBigSmart((byte) 32);
	    if (-1 != ((ItemDefinition) class623).manhead2 * -1341819643
		|| -1 != -1540815033 * ((ItemDefinition) class623).womanhead2) {
		class604.anIntArray7747[1]
		    = class241_sub3.readBigSmart((byte) -96);
		class604.anIntArray7743[1]
		    = class241_sub3.readBigSmart((byte) -1);
	    }
	}
	if (bool_7_) {
	    int i_9_ = class241_sub3.readUnsignedShort(1162222719);
	    int[] is = new int[4];
	    is[0] = i_9_ & 0xf;
	    is[1] = i_9_ >> 4 & 0xf;
	    is[2] = i_9_ >> 8 & 0xf;
	    is[3] = i_9_ >> 12 & 0xf;
	    for (int i_10_ = 0; i_10_ < 4; i_10_++) {
		if (is[i_10_] != 15)
		    class604.aShortArray7749[is[i_10_]]
			= (short) class241_sub3.readUnsignedShort(1162222719);
	    }
	}
	if (bool_8_) {
	    int i_11_ = class241_sub3.readUnsignedByte((byte) 19);
	    int[] is = new int[2];
	    is[0] = i_11_ & 0xf;
	    is[1] = i_11_ >> 4 & 0xf;
	    for (int i_12_ = 0; i_12_ < 2; i_12_++) {
		if (15 != is[i_12_])
		    class604.aShortArray7750[is[i_12_]]
			= (short) class241_sub3.readUnsignedShort(1162222719);
	    }
	}
	return class604;
    }
    
    static void method1289(RSByteBuffer class241_sub3, byte i) {
	for (int i_13_ = 0; i_13_ < 1153743561 * Class212.anInt2507; i_13_++) {
	    int i_14_ = class241_sub3.readSmart((short) -18092);
	    int i_15_ = class241_sub3.readUnsignedShort(1162222719);
	    if (i_15_ == 65535)
		i_15_ = -1;
	    if (null != Class509.aClass507_Sub1Array6676[i_14_])
		Class509.aClass507_Sub1Array6676[i_14_].anInt6669
		    = i_15_ * -857794107;
	}
    }
    
    static final void method1290(ClientScriptData class454, byte i) {
	Class362_Sub1.gameLogout(false, 2131627817);
    }
    
    static final void method1291(ClientScriptData class454, int i) {
	int i_16_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_16_, (byte) -110);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class58.hidden ? 1 : 0;
    }
}
