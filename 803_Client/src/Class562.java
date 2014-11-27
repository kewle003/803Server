/* Class562 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class562
{
    int anInt7299;
    int[] anIntArray7300;
    int anInt7301 = 610087065;
    Class579 aClass579_7302;
    int anInt7303;
    
    void method12373(RSByteBuffer class241_sub3, int i, int i_0_) {
	if (i == 1)
	    ((Class562) this).anInt7301
		= class241_sub3.readUnsignedShort(1162222719) * -610087065;
	else if (2 == i) {
	    ((Class562) this).anIntArray7300
		= new int[class241_sub3.readUnsignedByte((byte) 112)];
	    for (int i_1_ = 0; i_1_ < ((Class562) this).anIntArray7300.length;
		 i_1_++)
		((Class562) this).anIntArray7300[i_1_]
		    = class241_sub3.readUnsignedShort(1162222719);
	} else if (i == 3)
	    ((Class562) this).anInt7299
		= class241_sub3.readUnsignedByte((byte) 2) * -1736077155;
	else if (4 == i)
	    ((Class562) this).aClass579_7302
		= ((Class579)
		   Class531.method11848(Class198.method4033(1035537579),
					class241_sub3.readUnsignedByte((byte) 27),
					-1262763516));
	else if (5 == i)
	    ((Class562) this).anInt7303
		= class241_sub3.readBigSmart((byte) -87) * -910653735;
	else if (6 == i)
	    class241_sub3.readBigSmart((byte) 72);
    }
    
    void method12374(RSByteBuffer class241_sub3, int i) {
	for (;;) {
	    int i_2_ = class241_sub3.readUnsignedByte((byte) -10);
	    if (i_2_ == 0)
		break;
	    method12373(class241_sub3, i_2_, 1987885467);
	}
    }
    
    void method12375(RSByteBuffer class241_sub3, int i) {
	if (i == 1)
	    ((Class562) this).anInt7301
		= class241_sub3.readUnsignedShort(1162222719) * -610087065;
	else if (2 == i) {
	    ((Class562) this).anIntArray7300
		= new int[class241_sub3.readUnsignedByte((byte) 103)];
	    for (int i_3_ = 0; i_3_ < ((Class562) this).anIntArray7300.length;
		 i_3_++)
		((Class562) this).anIntArray7300[i_3_]
		    = class241_sub3.readUnsignedShort(1162222719);
	} else if (i == 3)
	    ((Class562) this).anInt7299
		= class241_sub3.readUnsignedByte((byte) 67) * -1736077155;
	else if (4 == i)
	    ((Class562) this).aClass579_7302
		= ((Class579)
		   Class531.method11848(Class198.method4033(245793162),
					class241_sub3.readUnsignedByte((byte) 37),
					-209228703));
	else if (5 == i)
	    ((Class562) this).anInt7303
		= class241_sub3.readBigSmart((byte) -47) * -910653735;
	else if (6 == i)
	    class241_sub3.readBigSmart((byte) 57);
    }
    
    void method12376(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 41);
	    if (i == 0)
		break;
	    method12373(class241_sub3, i, -1561252481);
	}
    }
    
    Class562() {
	((Class562) this).anInt7299 = 1736077155;
	((Class562) this).aClass579_7302 = Class579.aClass579_7557;
	((Class562) this).anInt7303 = 910653735;
    }
    
    void method12377(RSByteBuffer class241_sub3, int i) {
	if (i == 1)
	    ((Class562) this).anInt7301
		= class241_sub3.readUnsignedShort(1162222719) * -610087065;
	else if (2 == i) {
	    ((Class562) this).anIntArray7300
		= new int[class241_sub3.readUnsignedByte((byte) -14)];
	    for (int i_4_ = 0; i_4_ < ((Class562) this).anIntArray7300.length;
		 i_4_++)
		((Class562) this).anIntArray7300[i_4_]
		    = class241_sub3.readUnsignedShort(1162222719);
	} else if (i == 3)
	    ((Class562) this).anInt7299
		= class241_sub3.readUnsignedByte((byte) 10) * -1736077155;
	else if (4 == i)
	    ((Class562) this).aClass579_7302
		= ((Class579)
		   Class531.method11848(Class198.method4033(-779625245),
					class241_sub3.readUnsignedByte((byte) -58),
					908388435));
	else if (5 == i)
	    ((Class562) this).anInt7303
		= class241_sub3.readBigSmart((byte) -13) * -910653735;
	else if (6 == i)
	    class241_sub3.readBigSmart((byte) 21);
    }
    
    void method12378(RSByteBuffer class241_sub3, int i) {
	if (i == 1)
	    ((Class562) this).anInt7301
		= class241_sub3.readUnsignedShort(1162222719) * -610087065;
	else if (2 == i) {
	    ((Class562) this).anIntArray7300
		= new int[class241_sub3.readUnsignedByte((byte) 21)];
	    for (int i_5_ = 0; i_5_ < ((Class562) this).anIntArray7300.length;
		 i_5_++)
		((Class562) this).anIntArray7300[i_5_]
		    = class241_sub3.readUnsignedShort(1162222719);
	} else if (i == 3)
	    ((Class562) this).anInt7299
		= class241_sub3.readUnsignedByte((byte) 83) * -1736077155;
	else if (4 == i)
	    ((Class562) this).aClass579_7302
		= ((Class579)
		   Class531.method11848(Class198.method4033(1013021781),
					class241_sub3.readUnsignedByte((byte) 3),
					703300855));
	else if (5 == i)
	    ((Class562) this).anInt7303
		= class241_sub3.readBigSmart((byte) 35) * -910653735;
	else if (6 == i)
	    class241_sub3.readBigSmart((byte) 86);
    }
    
    static final void method12379(InterfaceComponent class58, ClientScriptData class454, byte i) {
	int i_6_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	int i_7_
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       - 1);
	if (class58.modelType * -982148763 != 2)
	    throw new RuntimeException("");
	NPCDefinition class401
	    = MasterIndex.npcDefLoader.getNpcDefinition(1965460551 * class58.anInt879,
						 -1244574197);
	if (null == class58.aClass404_1014)
	    class58.aClass404_1014 = new Class404(class401, false);
	class58.aClass404_1014.aLong5882
	    = Class247.method4945((byte) 1) * 7399085059860748217L;
	if (i_7_ < 0 || i_7_ >= class401.anIntArray5841.length)
	    throw new RuntimeException("");
	class58.aClass404_1014.anIntArray5879[i_7_] = i_6_;
	WorldType.refreshComponent(class58, 678795006);
    }
    
    static final void method12380(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_8_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_9_ = (((ClientScriptData) class454).integerStack
		    [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	if (i_8_ >= 0 && i_8_ < 2)
	    client.anIntArrayArrayArray8405[i_8_] = new int[i_9_ << 1][4];
    }
    
    static final void method12381(ClientScriptData class454, byte i) {
		if (client.anInt8288 * 1766317249 != 2
		    || Class261.method5091(-948346995))
		    ((ClientScriptData) class454).integerStack
			[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
			  - 1)]
			= 1;
		else if (Class395.aBool5776)
		    ((ClientScriptData) class454).integerStack
			[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
			  - 1)]
			= 0;
		else if (-8662077455628331641L * Class395.aLong5783
			 > Class50.method1249((byte) 1) - 1000L)
		    ((ClientScriptData) class454).integerStack
			[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
			  - 1)]
			= 1;
		else {
		    Class395.aBool5776 = true;
		    Class241_Sub27 class241_sub27
			= Class445_Sub26.makePacket(OutgoingOpcode.WORLD_LIST_UPDATE_PACKET,
						     (client.aClass190_8339
						      .packetCipher),
						     16711935);
		    class241_sub27.data
			.writeInt(Class186.anInt2194 * 413703845, -477032838);
		    client.aClass190_8339.sendPacket(class241_sub27, -1968670487);
		    ((ClientScriptData) class454).integerStack
			[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
			  - 1)]
			= 0;
		}
	}	
    
    static final void method12382(ClientScriptData class454, int i) {
	int i_10_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class455 class455;
	if (((ClientScriptData) class454).aBool6246)
	    class455 = ((ClientScriptData) class454).aClass455_6230;
	else
	    class455 = ((ClientScriptData) class454).aClass455_6229;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class455.method10558((((ClientScriptData) class454)
				    .varEntity
				    .aClass35_11437),
				   i_10_, -1, -1591133504) ? 1 : 0;
    }
    
    public static void method12383(String string, int i) {
	if (client.aBool8544
	    && (-1622803377 * Class613.anInt7804 & 0x18) != 0) {
	    boolean bool = false;
	    int i_11_ = GPI.viewportPlayerCount * 794073197;
	    int[] is = GPI.viewportPlayerIndicies;
	    for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
		Player class475_sub1_sub1_sub3_sub1 = client.localPlayers[is[i_12_]];
		if (class475_sub1_sub1_sub3_sub1.nameUnfiltered != null
		    && class475_sub1_sub1_sub3_sub1.nameUnfiltered.equalsIgnoreCase(string)
		    && (((class475_sub1_sub1_sub3_sub1 == Class21.myPlayer)
			 && 0 != (-1622803377 * Class613.anInt7804 & 0x10))
			|| (Class613.anInt7804 * -1622803377 & 0x8) != 0)) {
		    Class241_Sub27 class241_sub27
			= Class445_Sub26.makePacket(OutgoingOpcode.INTERFACE_ON_PLAYER_PACKET,
						     (client.aClass190_8340
						      .packetCipher),
						     16711935);
		    class241_sub27.data
			.writeLEShortA(1196348233 * client.prevComponentSlot1, (byte) 24);
		    class241_sub27.data
			.writeLEShortA(is[i_12_], (byte) 57);
		    class241_sub27.data
			.writeByteC(0, 868520951);
		    class241_sub27.data
			.writeLEShortA(2122695965 * client.prevComponentSlot2, (byte) 83);
		    class241_sub27.data.writeIntV1
			(RSGraphics.prevComponentHash * -1349195347, (byte) 0);
		    client.aClass190_8340.sendPacket(class241_sub27,
						     -1754721218);
		    Class475_Sub1_Sub3_Sub2.setMinimapFlag
			(class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0],
			 class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0],
			 903088642);
		    bool = true;
		    break;
		}
	    }
	    if (!bool)
		Class629.appendClientMessage(4,
				     new StringBuilder().append
					 (ClientMessage.UNABLETOFIND.getLocalisedMessage
					  (VarPlayerDomain.currentLocale,
					   (short) 17388))
					 .append
					 (string).toString(),
				     -1788063388);
	    if (client.aBool8544)
		Class520.method11688(-1864427257);
	}
    }
}
