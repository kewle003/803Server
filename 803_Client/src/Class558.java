/* Class558 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class558 implements Interface56
{
    int anInt7257;
    Class640 aClass640_7258;
    String aString7259;
    String aString7260;
    public static short[][] aShortArrayArray7261;
    
    Class558(Class640 class640, String string, int i, Throwable throwable) {
	((Class558) this).aClass640_7258 = class640;
	((Class558) this).aString7259 = string;
	((Class558) this).anInt7257 = -183813563 * i;
	((Class558) this).aString7260
	    = throwable != null ? throwable.getMessage() : null;
    }
    
    public void method191(int i) {
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4062,
					 client.aClass190_8340.packetCipher,
					 16711935);
	int i_0_ = ((class241_sub27.data.pointer
		     += -681042949)
		    * 421967667);
	class241_sub27.data.writeByte
	    (((Class558) this).aClass640_7258.getId((byte) 0), 988821458);
	class241_sub27.data
	    .writeString(((Class558) this).aString7259, 863891395);
	class241_sub27.data.writeShort
	    (-1471166323 * ((Class558) this).anInt7257, -484048531);
	class241_sub27.data
	    .writeString(Class240.aString2770, 204660912);
	if (((Class558) this).aString7260 != null) {
	    class241_sub27.data.writeByte(1, -395995630);
	    String string = ((Class558) this).aString7260;
	    if (string.length() > 100)
		string = string.substring(0, 100);
	    class241_sub27.data.writeString(string,
								-1091042039);
	} else
	    class241_sub27.data.writeByte(0,
								-1490135091);
	class241_sub27.data.endPacketVarByte
	    ((class241_sub27.data.pointer * 421967667
	      - i_0_),
	     2061005113);
	client.aClass190_8340.sendPacket(class241_sub27, -1715225162);
    }
    
    public void method190() {
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4062,
					 client.aClass190_8340.packetCipher,
					 16711935);
	int i = ((class241_sub27.data.pointer
		  += -681042949)
		 * 421967667);
	class241_sub27.data.writeByte
	    (((Class558) this).aClass640_7258.getId((byte) 0), -664911547);
	class241_sub27.data
	    .writeString(((Class558) this).aString7259, 1219272979);
	class241_sub27.data.writeShort
	    (-1471166323 * ((Class558) this).anInt7257, -484048531);
	class241_sub27.data
	    .writeString(Class240.aString2770, 1698327057);
	if (((Class558) this).aString7260 != null) {
	    class241_sub27.data.writeByte(1,
								-2112277878);
	    String string = ((Class558) this).aString7260;
	    if (string.length() > 100)
		string = string.substring(0, 100);
	    class241_sub27.data.writeString(string,
								726332691);
	} else
	    class241_sub27.data.writeByte(0, -603010014);
	class241_sub27.data.endPacketVarByte
	    (class241_sub27.data.pointer * 421967667 - i,
	     1427733128);
	client.aClass190_8340.sendPacket(class241_sub27, -2072060254);
    }
    
    public void method28() {
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4062,
					 client.aClass190_8340.packetCipher,
					 16711935);
	int i = ((class241_sub27.data.pointer
		  += -681042949)
		 * 421967667);
	class241_sub27.data.writeByte
	    (((Class558) this).aClass640_7258.getId((byte) 0), -510537468);
	class241_sub27.data
	    .writeString(((Class558) this).aString7259, -1904094328);
	class241_sub27.data.writeShort
	    (-1471166323 * ((Class558) this).anInt7257, -484048531);
	class241_sub27.data
	    .writeString(Class240.aString2770, -892477054);
	if (((Class558) this).aString7260 != null) {
	    class241_sub27.data.writeByte(1,
								-1578651257);
	    String string = ((Class558) this).aString7260;
	    if (string.length() > 100)
		string = string.substring(0, 100);
	    class241_sub27.data.writeString(string,
								-1486043849);
	} else
	    class241_sub27.data.writeByte(0, 1352908639);
	class241_sub27.data.endPacketVarByte
	    (class241_sub27.data.pointer * 421967667 - i,
	     688353452);
	client.aClass190_8340.sendPacket(class241_sub27, -1574346899);
    }
    
    public void method429() {
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4062,
					 client.aClass190_8340.packetCipher,
					 16711935);
	int i = ((class241_sub27.data.pointer
		  += -681042949)
		 * 421967667);
	class241_sub27.data.writeByte
	    (((Class558) this).aClass640_7258.getId((byte) 0), 147111260);
	class241_sub27.data
	    .writeString(((Class558) this).aString7259, -1153062401);
	class241_sub27.data.writeShort
	    (-1471166323 * ((Class558) this).anInt7257, -484048531);
	class241_sub27.data
	    .writeString(Class240.aString2770, -123664129);
	if (((Class558) this).aString7260 != null) {
	    class241_sub27.data.writeByte(1, 1740925667);
	    String string = ((Class558) this).aString7260;
	    if (string.length() > 100)
		string = string.substring(0, 100);
	    class241_sub27.data.writeString(string,
								936660187);
	} else
	    class241_sub27.data.writeByte(0, 2374678);
	class241_sub27.data.endPacketVarByte
	    (class241_sub27.data.pointer * 421967667 - i,
	     1483972208);
	client.aClass190_8340.sendPacket(class241_sub27, -2003528860);
    }
    
    public static Class529[] method12321(byte i) {
	return (new Class529[]
		{ Class529.aClass529_6944, Class529.aClass529_6942,
		  Class529.aClass529_6943 });
    }
    
    static final void method12322(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, int i) {
	class58.modelType = -1939349286;
	class58.aClass404_1014 = null;
	class58.anInt879
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       * 2003393911);
	if (class58.slot1 * -389932081 == -1 && !class35.aBool374)
	    Class120_Sub7.method16774(class58.componentHash * 445907013,
				      1276653946);
    }
    
    static final void method12323(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 1181070199 * Class13.anInt126;
    }
    
    static final void getChannelUserIndex/*method12324*/(ClientScriptData scriptData, int i) {
    	scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
    			= scriptData.currentChannel.getMemberIndex((String) 
    					scriptData.objectStack[((scriptData.objectStackPointer -= -1650705371) * -290357331)],
    					(byte) -40);
    }
    
    public static final int method12325(int i, int i_1_, int i_2_, byte i_3_) {
	if (i_2_ > 243)
	    i_1_ >>= 4;
	else if (i_2_ > 217)
	    i_1_ >>= 3;
	else if (i_2_ > 192)
	    i_1_ >>= 2;
	else if (i_2_ > 179)
	    i_1_ >>= 1;
	return (i_2_ >> 1) + (((i & 0xff) >> 2 << 10) + (i_1_ >> 5 << 7));
    }
    
    static void method12326(int i, int i_4_) {
	Class194.anInt2303 = 0;
	int i_5_ = client.aClass238_8477.method4744(-1584705059);
	int i_6_ = client.aClass238_8477.method4745(444913798);
	Class215 class215 = client.aClass238_8477.method4753((byte) -39);
	Class552 class552 = client.aClass238_8477.method4751(-981851474);
	ObjectDefinitionLoader class532 = client.aClass238_8477.getObjectLoader(-1886274007);
	int i_7_ = i;
	if (null != Class21.myPlayer) {
	    int i_8_
		= (Class21.myPlayer.scenePositionXQueue[0]
		   >> 3);
	    int i_9_
		= (Class21.myPlayer.scenePositionYQueue[0]
		   >> 3);
	    if (i_8_ >= 0 && i_8_ < Class458.aBoolArrayArray6260.length
		&& i_9_ >= 0
		&& i_9_ < Class458.aBoolArrayArray6260[i_8_].length
		&& Class458.aBoolArrayArray6260[i_8_][i_9_])
		i_7_ = 0;
	}
	for (int i_10_ = 0; i_10_ < i_5_; i_10_++) {
	    for (int i_11_ = 0; i_11_ < i_6_; i_11_++) {
		for (int i_12_ = i_7_; i_12_ <= 1 + i && i_12_ <= 3; i_12_++) {
		    if ((i_12_ < i || class215.method4332(i, i_12_, i_10_,
							  i_11_, 1873638139))
			&& !(Class112.method2780
			     ((Interface24) class552.method12100(i_12_, i_10_,
								 i_11_,
								 1748829641),
			      class532, i_10_, i_11_, 2113348683))
			&& !(Class112.method2780
			     (((Interface24)
			       class552.method12136(i_12_, i_10_, i_11_,
						    client.anInterface57_8577,
						    379988600)),
			      class532, i_10_, i_11_, 2020219210))
			&& !(Class112.method2780
			     ((Interface24) class552.method12132(i_12_, i_10_,
								 i_11_,
								 (byte) 7),
			      class532, i_10_, i_11_, 1720601926))
			&& !(Class112.method2780
			     ((Interface24) class552.method12162(i_12_, i_10_,
								 i_11_,
								 -1106172810),
			      class532, i_10_, i_11_, 1128351829))) {
			/* empty */
		    }
		}
	    }
	}
    }
    
    static Class525 method12327(int i, byte i_13_) {
	Class525[] class525s = Class105_Sub2.method15601(-1928303096);
	for (int i_14_ = 0; i_14_ < class525s.length; i_14_++) {
	    Class525 class525 = class525s[i_14_];
	    if (287537157 * ((Class525) class525).anInt6823 == i)
		return class525;
	}
	return null;
    }
}
