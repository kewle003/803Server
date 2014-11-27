/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class104
{
    static int anInt1474;
    static Class123[] aClass123Array1475;
    static Class122[] aClass122Array1476;
    static int anInt1477;
    static int anInt1478;
    public static Class120[] aClass120Array1479;
    public static HashTable aClass407_1480;
    static int anInt1481;
    static boolean aBool1482;
    static int anInt1483;
    public static NodeCollection aClass429_1484 = new NodeCollection();
    public static Interface11 anInterface11_1485;
    
    public static void method2637(boolean bool) {
	if (1 != -831877317 * client.anInt8266
	    && 3 != client.anInt8266 * -831877317) {
	    if (!bool) {
		if (null != aClass120Array1479) {
		    Class120[] class120s = aClass120Array1479;
		    for (int i = 0; i < class120s.length; i++) {
			Class120 class120 = class120s[i];
			class120.method2959(2133125493);
		    }
		}
		if (-1 != 1161532437 * anInt1483)
		    Class402.soundManager.method1169(anInt1483 * 1161532437,
						      255, -319649020);
	    }
	    client.anInt8266 = 1322480115;
	    HitMarkType.aClass241_Sub3_7297 = null;
	    client.aBool8354 = false;
	    if (anInt1477 * -1324293729 > 0)
		Class561.method12372(Class614.aClass614_7823,
				     -1324293729 * anInt1477, -1, -1748692867);
	    Class208.method4135(-1070756622);
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4047,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeByte(bool ? 1 : 0,
								-922937795);
	    client.aClass190_8340.sendPacket(class241_sub27, -1557783389);
	}
    }
    
    static {
	aClass407_1480 = new HashTable(32);
	anInt1474 = 1952203933;
	anInt1478 = 0;
	anInt1481 = 0;
	aBool1482 = false;
	anInt1483 = 1512989891;
	anInt1477 = -775551583;
	anInterface11_1485 = new Class134();
    }
    
    public static boolean method2638(int i) {
	if (i != -1324293729 * anInt1477 || Class582.aClass133_7565 == null) {
	    Class208.method4135(-1070756622);
	    Class582.aClass133_7565 = Class133.aClass133_1617;
	    anInt1477 = i * 775551583;
	}
	if (Class133.aClass133_1617 == Class582.aClass133_7565) {
	    byte[] is = Class112.aClass210_1527.method4194(i, -827216878);
	    if (null == is)
		return false;
	    RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	    Class77.method1774(class241_sub3, -646562321);
	    int i_0_ = class241_sub3.readUnsignedByte((byte) 25);
	    for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
		aClass429_1484.addNode(new Class241_Sub32(class241_sub3),
					  (short) -26758);
	    int i_2_ = class241_sub3.readSmart((short) -13022);
	    aClass123Array1475 = new Class123[i_2_];
	    for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
		aClass123Array1475[i_3_] = new Class123(class241_sub3);
	    int i_4_ = class241_sub3.readSmart((short) -12333);
	    Class25.aClass93Array213 = new Class93[i_4_];
	    for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
		Class25.aClass93Array213[i_5_]
		    = new Class93(class241_sub3, i_5_);
	    int i_6_ = class241_sub3.readSmart((short) -23214);
	    Class258.aClass132Array4209 = new Class132[i_6_];
	    for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
		Class258.aClass132Array4209[i_7_]
		    = new Class132(class241_sub3);
	    int i_8_ = class241_sub3.readSmart((short) -16831);
	    aClass122Array1476 = new Class122[i_8_];
	    for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
		aClass122Array1476[i_9_] = new Class122(class241_sub3);
	    int i_10_ = class241_sub3.readSmart((short) -22389);
	    aClass120Array1479 = new Class120[i_10_];
	    for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
		aClass120Array1479[i_11_]
		    = Class92.method2075(class241_sub3, (byte) 39);
	    Class582.aClass133_7565 = Class133.aClass133_1614;
	}
	if (Class582.aClass133_7565 == Class133.aClass133_1614) {
	    boolean bool = true;
	    Class93[] class93s = Class25.aClass93Array213;
	    for (int i_12_ = 0; i_12_ < class93s.length; i_12_++) {
		Class93 class93 = class93s[i_12_];
		if (!class93.method2082(-332826430))
		    bool = false;
	    }
	    Class120[] class120s = aClass120Array1479;
	    for (int i_13_ = 0; i_13_ < class120s.length; i_13_++) {
		Class120 class120 = class120s[i_13_];
		if (!class120.method2960((byte) 16))
		    bool = false;
	    }
	    Class132[] class132s = Class258.aClass132Array4209;
	    for (int i_14_ = 0; i_14_ < class132s.length; i_14_++) {
		Class132 class132 = class132s[i_14_];
		if (!class132.method3079((byte) 1))
		    bool = false;
	    }
	    if (!bool)
		return false;
	    Class582.aClass133_7565 = Class133.aClass133_1615;
	}
	return true;
    }
    
    static void method2639(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 36);
	    switch (i) {
	    case 0:
		anInt1478 = class241_sub3.readUnsignedShort(1162222719) * 159964073;
		anInt1481
		    = class241_sub3.readUnsignedShort(1162222719) * -1645614417;
		break;
	    case 255:
		return;
	    }
	}
    }
    
    static void method2640(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 11);
	    switch (i) {
	    case 0:
		anInt1478 = class241_sub3.readUnsignedShort(1162222719) * 159964073;
		anInt1481
		    = class241_sub3.readUnsignedShort(1162222719) * -1645614417;
		break;
	    case 255:
		return;
	    }
	}
    }
    
    public static void method2641(boolean bool) {
	if (1 != -831877317 * client.anInt8266
	    && 3 != client.anInt8266 * -831877317) {
	    if (!bool) {
		if (null != aClass120Array1479) {
		    Class120[] class120s = aClass120Array1479;
		    for (int i = 0; i < class120s.length; i++) {
			Class120 class120 = class120s[i];
			class120.method2959(1752955943);
		    }
		}
		if (-1 != 1161532437 * anInt1483)
		    Class402.soundManager.method1169(anInt1483 * 1161532437,
						      255, -330773301);
	    }
	    client.anInt8266 = 1322480115;
	    HitMarkType.aClass241_Sub3_7297 = null;
	    client.aBool8354 = false;
	    if (anInt1477 * -1324293729 > 0)
		Class561.method12372(Class614.aClass614_7823,
				     -1324293729 * anInt1477, -1, 234373009);
	    Class208.method4135(-1070756622);
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4047,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeByte(bool ? 1 : 0,
								-966765695);
	    client.aClass190_8340.sendPacket(class241_sub27, -1989040319);
	}
    }
    
    static void method2642(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -40);
	    switch (i) {
	    case 0:
		anInt1478 = class241_sub3.readUnsignedShort(1162222719) * 159964073;
		anInt1481
		    = class241_sub3.readUnsignedShort(1162222719) * -1645614417;
		break;
	    case 255:
		return;
	    }
	}
    }
    
    public static void method2643() {
	Class393.aShort5766 = client.aShort8476;
	Class222.aShort2590 = client.aShort8558;
	Class202.aShort2413 = client.aShort8555;
	Class120_Sub21.aShort10623 = client.aShort8556;
	aBool1482 = true;
	anInt1483
	    = Class402.soundManager.method1164(-494148309) * -1512989891;
	if (0 != -473060273 * anInt1481 && 0 != anInt1478 * -289277799) {
	    client.aShort8555 = (short) 334;
	    client.aShort8556 = (short) 334;
	    client.aShort8558 = client.aShort8476
		= (short) (-1688691200 * anInt1481 / (anInt1478 * -289277799));
	}
    }
    
    public static void method2644() {
	Class393.aShort5766 = client.aShort8476;
	Class222.aShort2590 = client.aShort8558;
	Class202.aShort2413 = client.aShort8555;
	Class120_Sub21.aShort10623 = client.aShort8556;
	aBool1482 = true;
	anInt1483
	    = Class402.soundManager.method1164(-1624090931) * -1512989891;
	if (0 != -473060273 * anInt1481 && 0 != anInt1478 * -289277799) {
	    client.aShort8555 = (short) 334;
	    client.aShort8556 = (short) 334;
	    client.aShort8558 = client.aShort8476
		= (short) (-1688691200 * anInt1481 / (anInt1478 * -289277799));
	}
    }
    
    public static void method2645() {
	Class393.aShort5766 = client.aShort8476;
	Class222.aShort2590 = client.aShort8558;
	Class202.aShort2413 = client.aShort8555;
	Class120_Sub21.aShort10623 = client.aShort8556;
	aBool1482 = true;
	anInt1483
	    = Class402.soundManager.method1164(1284457080) * -1512989891;
	if (0 != -473060273 * anInt1481 && 0 != anInt1478 * -289277799) {
	    client.aShort8555 = (short) 334;
	    client.aShort8556 = (short) 334;
	    client.aShort8558 = client.aShort8476
		= (short) (-1688691200 * anInt1481 / (anInt1478 * -289277799));
	}
    }
    
    public static void method2646() {
	aClass407_1480.method7293(-574948744);
	aClass429_1484.method7652((byte) 64);
	aClass123Array1475 = null;
	Class25.aClass93Array213 = null;
	Class258.aClass132Array4209 = null;
	aClass122Array1476 = null;
	aClass120Array1479 = null;
	anInt1474 = 1952203933;
	anInt1478 = 0;
	anInt1481 = 0;
	Class582.aClass133_7565 = null;
	anInt1477 = -775551583;
	anInt1483 = 1512989891;
	if (aBool1482) {
	    client.aShort8476 = Class393.aShort5766;
	    client.aShort8558 = Class222.aShort2590;
	    client.aShort8555 = Class202.aShort2413;
	    client.aShort8556 = Class120_Sub21.aShort10623;
	    aBool1482 = false;
	}
    }
    
    public static void method2647(boolean bool) {
	if (1 != -831877317 * client.anInt8266
	    && 3 != client.anInt8266 * -831877317) {
	    if (!bool) {
		if (null != aClass120Array1479) {
		    Class120[] class120s = aClass120Array1479;
		    for (int i = 0; i < class120s.length; i++) {
			Class120 class120 = class120s[i];
			class120.method2959(1695624778);
		    }
		}
		if (-1 != 1161532437 * anInt1483)
		    Class402.soundManager.method1169(anInt1483 * 1161532437,
						      255, -450559257);
	    }
	    client.anInt8266 = 1322480115;
	    HitMarkType.aClass241_Sub3_7297 = null;
	    client.aBool8354 = false;
	    if (anInt1477 * -1324293729 > 0)
		Class561.method12372(Class614.aClass614_7823,
				     -1324293729 * anInt1477, -1, -362071696);
	    Class208.method4135(-1070756622);
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4047,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeByte(bool ? 1 : 0,
								-337874730);
	    client.aClass190_8340.sendPacket(class241_sub27, -2021424579);
	}
    }
    
    Class104() throws Throwable {
	throw new Error();
    }
    
    public static Class534[] method2648(int i) {
	return (new Class534[]
		{ Class534.aClass534_6975, Class534.aClass534_6973,
		  Class534.aClass534_6970, Class534.aClass534_6971,
		  Class534.aClass534_6972, Class534.aClass534_6969 });
    }
    
    static final void method2649(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class384.method6949(class58, class35, class454, 24033134);
    }
    
    static final void method2650(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	class58.anInt872
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       * -1758044863);
	WorldType.refreshComponent(class58, -880077172);
    }
    
    public static void method2651(int i, int i_15_) {
	CcDelta_Delete.method17439(i, -1100058955);
    }
    
    static final void saveIntValue/*method2652*/(ClientScriptData scriptData, int i) {
    	scriptData.integerVariables[scriptData.integerConstants[1938982693 * scriptData.step]]
    			= scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
    }
}
