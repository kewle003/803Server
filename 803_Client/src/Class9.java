/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.ActionEvent;

public class Class9
{
    static int anInt47 = 0;
    static final int anInt48 = 3;
    static Class433 aClass433_49;
    static int[] anIntArray50;
    static Class22 aClass22_51;
    static int anInt52 = 0;
    static Class423 aClass423_53;
    
    static void method523(Class432 class432) {
	Class455.aClass432_6247 = class432;
    }
    
    public static Class423 method524() {
	if (aClass423_53 == null)
	    return Class423.aClass423_6052;
	return aClass423_53;
    }
    
    static void method525(Class432 class432) {
	Class455.aClass432_6247 = class432;
    }
    
    static void method526() {
	aClass22_51 = Class22.aClass22_204;
	aClass433_49 = Class433.aClass433_6113;
	aClass423_53 = Class423.aClass423_6052;
	Class455.aClass432_6247 = Class432.aClass432_6101;
	Class327.aClass411_5019 = Class411.aClass411_5940;
	GameShell3$FrameParameters.aClass425_4007 = Class425.aClass425_6071;
	OutputStream_Sub1.aString8604 = null;
    }
    
    static void method527() {
	aClass22_51 = Class22.aClass22_204;
	aClass433_49 = Class433.aClass433_6113;
	aClass423_53 = Class423.aClass423_6052;
	Class455.aClass432_6247 = Class432.aClass432_6101;
	Class327.aClass411_5019 = Class411.aClass411_5940;
	GameShell3$FrameParameters.aClass425_4007 = Class425.aClass425_6071;
	OutputStream_Sub1.aString8604 = null;
    }
    
    static boolean method528() {
	return null != aClass22_51;
    }
    
    public static void method529(int i) {
	if (8 == client.anInt8288 * 1766317249) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4089,
					     (client.aClass190_8339
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeByte(i, -449782745);
	    client.aClass190_8339.sendPacket(class241_sub27, -2033815061);
	}
    }
    
    public static void method530(String string) {
	if (1766317249 * client.anInt8288 == 8) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4107,
					     (client.aClass190_8339
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeShort(0, -484048531);
	    int i = (421967667
		     * class241_sub27.data.pointer);
	    class241_sub27.data.writeString(string,
								1107349161);
	    class241_sub27.data.pointer += -472333347;
	    class241_sub27.data.method14665
		(anIntArray50, i,
		 421967667 * class241_sub27.data.pointer,
		 105897381);
	    class241_sub27.data.endPacketVarShort
		((421967667 * class241_sub27.data.pointer
		  - i),
		 (byte) 87);
	    client.aClass190_8339.sendPacket(class241_sub27, -1952042674);
	    Class455.aClass432_6247 = Class432.aClass432_6102;
	}
    }
    
    public static void method531(String string) {
	if (client.anInt8288 * 1766317249 == 8) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4022,
					     (client.aClass190_8339
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeByte(0,
								-1639726386);
	    int i = (421967667
		     * class241_sub27.data.pointer);
	    class241_sub27.data.writeString(string,
								641363892);
	    class241_sub27.data.pointer += -472333347;
	    class241_sub27.data.method14665
		(anIntArray50, i,
		 421967667 * class241_sub27.data.pointer,
		 264096696);
	    class241_sub27.data.endPacketVarByte
		((421967667 * class241_sub27.data.pointer
		  - i),
		 1558390527);
	    client.aClass190_8339.sendPacket(class241_sub27, -2120913278);
	    GameShell3$FrameParameters.aClass425_4007 = Class425.aClass425_6076;
	}
    }
    
    public static void method532() {
	if (17 == 1766317249 * client.anInt8288
	    && (!Class261.method5091(434697869)
		&& !Class109.method2762(1171418772)))
	    Class496.setClientStage(10, (byte) -38);
    }
    
    Class9() throws Throwable {
	throw new Error();
    }
    
    public static void method533() {
	if (8 == client.anInt8288 * 1766317249) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4125,
					     (client.aClass190_8339
					      .packetCipher),
					     16711935);
	    client.aClass190_8339.sendPacket(class241_sub27, -2121677991);
	    Class327.aClass411_5019 = Class411.aClass411_5936;
	    OutputStream_Sub1.aString8604 = null;
	}
    }
    
    public static void method534() {
	if (8 == client.anInt8288 * 1766317249) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4125,
					     (client.aClass190_8339
					      .packetCipher),
					     16711935);
	    client.aClass190_8339.sendPacket(class241_sub27, -1748992293);
	    Class327.aClass411_5019 = Class411.aClass411_5936;
	    OutputStream_Sub1.aString8604 = null;
	}
    }
    
    public static void method535(String string, String string_0_, int i,
				 boolean bool, String string_1_) {
	if (8 == client.anInt8288 * 1766317249) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4101,
					     (client.aClass190_8339
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeShort(0, -484048531);
	    int i_2_ = (421967667
			* class241_sub27.data.pointer);
	    class241_sub27.data.writeString(string,
								-1157429081);
	    class241_sub27.data.writeString(string_0_,
								-1630474966);
	    class241_sub27.data.writeByte(i,
								-1563264492);
	    class241_sub27.data.writeByte(bool ? 1 : 0,
								-1745574467);
	    class241_sub27.data.writeString(string_1_,
								1437731263);
	    class241_sub27.data.pointer += -472333347;
	    class241_sub27.data.method14665
		(anIntArray50, i_2_,
		 421967667 * class241_sub27.data.pointer,
		 1488400507);
	    class241_sub27.data.endPacketVarShort
		((421967667 * class241_sub27.data.pointer
		  - i_2_),
		 (byte) 106);
	    client.aClass190_8339.sendPacket(class241_sub27, -2063628051);
	    if (i < 13) {
		client.aBool8386 = true;
		Class488.method11148(-929175047);
	    }
	    aClass423_53 = Class423.aClass423_6063;
	}
    }
    
    public static void method536(int i) {
	if (8 == client.anInt8288 * 1766317249) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4089,
					     (client.aClass190_8339
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeByte(i,
								-1406119514);
	    client.aClass190_8339.sendPacket(class241_sub27, -1729611823);
	}
    }
    
    public static Class432 method537() {
	if (Class455.aClass432_6247 == null)
	    return Class432.aClass432_6101;
	return Class455.aClass432_6247;
    }
    
    static void method538() {
	client.aClass190_8339.closeConnection(-172272881);
	if (1279563131 * anInt52 < 2) {
	    Class609.aClass397_7759.method7114(1451781846);
	    anInt47 = 0;
	    anInt52 += -847117901;
	    aClass22_51 = Class22.aClass22_204;
	} else {
	    aClass22_51 = null;
	    aClass433_49 = Class433.aClass433_6112;
	    Class496.setClientStage(17, (byte) -106);
	}
    }
    
    public static Class433 method539() {
	if (null == aClass433_49)
	    return Class433.aClass433_6109;
	return aClass433_49;
    }
    
    public static Class423 method540() {
	if (aClass423_53 == null)
	    return Class423.aClass423_6052;
	return aClass423_53;
    }
    
    public static void method541(String string) {
	if (client.anInt8288 * 1766317249 == 8) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4022,
					     (client.aClass190_8339
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeByte(0, 1069639590);
	    int i = (421967667
		     * class241_sub27.data.pointer);
	    class241_sub27.data.writeString(string,
								696329533);
	    class241_sub27.data.pointer += -472333347;
	    class241_sub27.data.method14665
		(anIntArray50, i,
		 421967667 * class241_sub27.data.pointer,
		 625463444);
	    class241_sub27.data.endPacketVarByte
		((421967667 * class241_sub27.data.pointer
		  - i),
		 1692557583);
	    client.aClass190_8339.sendPacket(class241_sub27, -2111856863);
	    GameShell3$FrameParameters.aClass425_4007 = Class425.aClass425_6076;
	}
    }
    
    public static Class423 method542() {
	if (aClass423_53 == null)
	    return Class423.aClass423_6052;
	return aClass423_53;
    }
    
    public static Class432 method543() {
	if (Class455.aClass432_6247 == null)
	    return Class432.aClass432_6101;
	return Class455.aClass432_6247;
    }
    
    public static void method544() {
	if (17 == 1766317249 * client.anInt8288
	    && (!Class261.method5091(247062427)
		&& !Class109.method2762(1634999445)))
	    Class496.setClientStage(10, (byte) -51);
    }
    
    public static void method545(String string) {
	if (1766317249 * client.anInt8288 == 8) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4107,
					     (client.aClass190_8339
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeShort(0, -484048531);
	    int i = (421967667
		     * class241_sub27.data.pointer);
	    class241_sub27.data.writeString(string,
								-711542360);
	    class241_sub27.data.pointer += -472333347;
	    class241_sub27.data.method14665
		(anIntArray50, i,
		 421967667 * class241_sub27.data.pointer,
		 707654924);
	    class241_sub27.data.endPacketVarShort
		((421967667 * class241_sub27.data.pointer
		  - i),
		 (byte) 108);
	    client.aClass190_8339.sendPacket(class241_sub27, -1995856570);
	    Class455.aClass432_6247 = Class432.aClass432_6102;
	}
    }
    
    public static Class411 method546() {
	if (Class327.aClass411_5019 == null)
	    return Class411.aClass411_5940;
	return Class327.aClass411_5019;
    }
    
    public static Class411 method547() {
	if (Class327.aClass411_5019 == null)
	    return Class411.aClass411_5940;
	return Class327.aClass411_5019;
    }
    
    static void method548(Class432 class432) {
	Class455.aClass432_6247 = class432;
    }
    
    public static Class411 method549() {
	if (Class327.aClass411_5019 == null)
	    return Class411.aClass411_5940;
	return Class327.aClass411_5019;
    }
    
    public static Class411 method550() {
	if (Class327.aClass411_5019 == null)
	    return Class411.aClass411_5940;
	return Class327.aClass411_5019;
    }
    
    public static String method551() {
	return OutputStream_Sub1.aString8604;
    }
    
    static void method552(Class423 class423) {
	aClass423_53 = class423;
    }
    
    static void method553(Class423 class423) {
	aClass423_53 = class423;
    }
    
    public static void method554(int i) {
	if (8 == client.anInt8288 * 1766317249) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4089,
					     (client.aClass190_8339
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeByte(i,
								-1646053375);
	    client.aClass190_8339.sendPacket(class241_sub27, -1511201176);
	}
    }
    
    static void method555() {
	client.aClass190_8339.closeConnection(-1192368387);
	if (1279563131 * anInt52 < 2) {
	    Class609.aClass397_7759.method7114(1451781846);
	    anInt47 = 0;
	    anInt52 += -847117901;
	    aClass22_51 = Class22.aClass22_204;
	} else {
	    aClass22_51 = null;
	    aClass433_49 = Class433.aClass433_6112;
	    Class496.setClientStage(17, (byte) -2);
	}
    }
    
    static void method556(Class432 class432) {
	Class455.aClass432_6247 = class432;
    }
    
    public static Class432 method557() {
	if (Class455.aClass432_6247 == null)
	    return Class432.aClass432_6101;
	return Class455.aClass432_6247;
    }
    
    static void method558(Class432 class432) {
	Class455.aClass432_6247 = class432;
    }
    
    static void method559(Class432 class432) {
	Class455.aClass432_6247 = class432;
    }
    
    static void method560(Class432 class432) {
	Class455.aClass432_6247 = class432;
    }
    
    static void method561(Class425 class425) {
	GameShell3$FrameParameters.aClass425_4007 = class425;
    }
    
    public static void method562() {
	if (8 == client.anInt8288 * 1766317249) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4125,
					     (client.aClass190_8339
					      .packetCipher),
					     16711935);
	    client.aClass190_8339.sendPacket(class241_sub27, -1597494282);
	    Class327.aClass411_5019 = Class411.aClass411_5936;
	    OutputStream_Sub1.aString8604 = null;
	}
    }
    
    static void method563(Class411 class411) {
	Class327.aClass411_5019 = class411;
	OutputStream_Sub1.aString8604 = null;
    }
    
    static void method564(Class411 class411) {
	Class327.aClass411_5019 = class411;
	OutputStream_Sub1.aString8604 = null;
    }
    
    static int[] method565(Class241_Sub27 class241_sub27) {
	RSByteBuffer class241_sub3 = new RSByteBuffer(518);
	int[] is = new int[4];
	for (int i = 0; i < 4; i++)
	    is[i] = (int) (Math.random() * 9.9999999E7);
	class241_sub3.writeByte(10, 750731874);
	class241_sub3.writeInt(is[0], 986372194);
	class241_sub3.writeInt(is[1], -476867893);
	class241_sub3.writeInt(is[2], 321275985);
	class241_sub3.writeInt(is[3], -1873399832);
	for (int i = 0; i < 10; i++)
	    class241_sub3.writeInt((int) (Math.random() * 9.9999999E7),
				      1148181646);
	class241_sub3.writeShort((int) (Math.random() * 9.9999999E7),
				  -484048531);
	class241_sub3.applyRSA(RSAKeys.LOGIN_PUBLIC_KEY,
				  RSAKeys.LOGIN_MODULUS, (byte) -1);
	class241_sub27.data.writeBytes
	    (class241_sub3.payload, 0,
	     class241_sub3.pointer * 421967667, 752061035);
	return is;
    }
    
    static void method566() {
	client.aClass190_8339.closeConnection(2082667224);
	if (1279563131 * anInt52 < 2) {
	    Class609.aClass397_7759.method7114(1451781846);
	    anInt47 = 0;
	    anInt52 += -847117901;
	    aClass22_51 = Class22.aClass22_204;
	} else {
	    aClass22_51 = null;
	    aClass433_49 = Class433.aClass433_6112;
	    Class496.setClientStage(17, (byte) -92);
	}
    }
    
    public static Class425 method567() {
	if (null == GameShell3$FrameParameters.aClass425_4007)
	    return Class425.aClass425_6071;
	return GameShell3$FrameParameters.aClass425_4007;
    }
    
    static void method568(Class425 class425) {
	GameShell3$FrameParameters.aClass425_4007 = class425;
    }
    
    static void method569(Object object, int i) {
	if (null != Class105.eventQueue) {
	    for (int i_3_ = 0;
		 i_3_ < 50 && Class105.eventQueue.peekEvent() != null;
		 i_3_++)
		Class380_Sub2.method16722(1L);
	    try {
		if (object != null)
		    Class105.eventQueue
			.postEvent(new ActionEvent(object, 1001, "dummy"));
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    static void method570(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [((ClientScriptData) class454).intStackPointer * 1482319719 - 2]
	    = (Class326_Sub3.aClass482_10288.method11010
		   ((((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer - 2]),
		    (short) -3990)
		   .method10969
	       (Class1.aClass19_11,
		(((ClientScriptData) class454).integerStack
		 [1482319719 * ((ClientScriptData) class454).intStackPointer - 1]),
		-2105767165)) ? 1 : 0;
	((ClientScriptData) class454).intStackPointer -= 1736754263;
    }
    
    static final void method571(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_4_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_5_ = (((ClientScriptData) class454).integerStack
		    [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_4_ < i_5_ ? i_4_ : i_5_;
    }
    
    static final void method572(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class120.anInt1566 * 2096242755;
    }
    
    static void method573(ServerConnection conn, int i) {
		Class241_Sub27 packet = Class445_Sub26.makePacket(
				OutgoingOpcode.SCREEN_PACKET,
				conn.packetCipher, 16711935);
		packet.data.writeByte(Class474.getDisplayMode(420015265), -2023603692);
		packet.data.writeShort(-1080559003 * Class494.canvasWid, -484048531);
		packet.data.writeShort(963058943 * Class67.canvasHei, -484048531);
		packet.data.writeByte(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8852
			 .method14189((byte) 2), 534360096);
		conn.sendPacket(packet, -2043757476);
    }
    
    static void setComponentPosition/*method574*/(int compHash, int posX, int posY, int i_8_) {
		Class241_Sub39_Sub13 class241_sub39_sub13 = NPC.method18030(11, (long) compHash);
		class241_sub39_sub13.method17279((byte) 0);
		((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 = -1741260507 * posX;
		((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10951 = 1861259375 * posY;
    }
    
    public static final int method575(int i, int i_9_, int i_10_, int i_11_,
				      int i_12_, int i_13_) {
	if (client.aClass238_8477.method4751(-861597220) == null)
	    return 0;
	if (i_12_ < 3) {
	    Class215 class215 = client.aClass238_8477.method4753((byte) -54);
	    int i_14_ = i >> 9;
	    int i_15_ = i_9_ >> 9;
	    if (i_10_ < 0 || i_11_ < 0
		|| i_10_ > client.aClass238_8477.method4744(-1842447875) - 1
		|| i_11_ > client.aClass238_8477.method4745(1253220377) - 1)
		return 0;
	    if (i_14_ < 1 || i_15_ < 1
		|| i_14_ > client.aClass238_8477.method4744(-2106505741) - 1
		|| i_15_ > client.aClass238_8477.method4745(-1538696026) - 1)
		return 0;
	    boolean bool
		= 0 != (class215.heightmapData[1][i >> 9][i_9_ >> 9]
			& 0x2);
	    if (0 == (i & 0x1ff)) {
		boolean bool_16_ = 0 != ((class215.heightmapData[1]
					  [i_14_ - 1][i_9_ >> 9])
					 & 0x2);
		boolean bool_17_ = 0 != ((class215.heightmapData[1]
					  [i_14_][i_9_ >> 9])
					 & 0x2);
		if (bool_16_ != bool_17_)
		    bool = 0 != ((class215.heightmapData[1][i_10_]
				  [i_11_])
				 & 0x2);
	    }
	    if (0 == (i_9_ & 0x1ff)) {
		boolean bool_18_ = 0 != ((class215.heightmapData[1]
					  [i >> 9][i_15_ - 1])
					 & 0x2);
		boolean bool_19_
		    = 0 != (class215.heightmapData[1][i >> 9][i_15_]
			    & 0x2);
		if (bool_19_ != bool_18_)
		    bool = 0 != ((class215.heightmapData[1][i_10_]
				  [i_11_])
				 & 0x2);
	    }
	    if (bool)
		i_12_++;
	}
	return client.aClass238_8477.method4751(-1761377238)
		   .aClass166Array7184[i_12_].method3574(i, i_9_, 142920299);
    }
}
