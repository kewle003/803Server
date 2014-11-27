/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class47
{
    String aString626;
    static final int anInt627 = 4;
    static final int anInt628 = 256;
    Class115[] aClass115Array629;
    Class115[] aClass115Array630;
    Class117[] aClass117Array631;
    static final int anInt632 = 2;
    public static boolean isWindowFocused;//aBool633
    static int anInt634;
    static int anInt635;
    
    void method1129(byte[] is, short i) throws Exception_Sub6 {
	Class54 class54 = new Class54(is);
	int i_0_ = class54.method1300(1551346492);
	if (4 != i_0_)
	    throw new Exception_Sub6(this, i_0_, 4);
	((Class47) this).aString626 = class54.method1298(-1008814925);
	((Class47) this).aClass115Array629
	    = new Class115[class54.method1300(1695465070)];
	((Class47) this).aClass115Array630
	    = new Class115[class54.method1300(2112392989)];
	((Class47) this).aClass117Array631
	    = new Class117[class54.method1300(1697138392)];
	for (int i_1_ = 0; i_1_ < ((Class47) this).aClass115Array629.length;
	     i_1_++) {
	    ((Class47) this).aClass115Array629[i_1_] = new Class115();
	    ((Class47) this).aClass115Array629[i_1_].method2799(class54,
								-1108756897);
	}
	for (int i_2_ = 0; i_2_ < ((Class47) this).aClass115Array630.length;
	     i_2_++) {
	    ((Class47) this).aClass115Array630[i_2_] = new Class115();
	    ((Class47) this).aClass115Array630[i_2_].method2799(class54,
								-1108756897);
	}
	for (int i_3_ = 0; i_3_ < ((Class47) this).aClass117Array631.length;
	     i_3_++) {
	    ((Class47) this).aClass117Array631[i_3_] = new Class117();
	    ((Class47) this).aClass117Array631[i_3_].method2926(class54,
								-718913725);
	}
    }
    
    public Class47(byte[] is) throws Exception_Sub6 {
	method1129(is, (short) 128);
    }
    
    void method1130(byte[] is) throws Exception_Sub6 {
	Class54 class54 = new Class54(is);
	int i = class54.method1300(1507855119);
	if (4 != i)
	    throw new Exception_Sub6(this, i, 4);
	((Class47) this).aString626 = class54.method1298(118601999);
	((Class47) this).aClass115Array629
	    = new Class115[class54.method1300(1587417842)];
	((Class47) this).aClass115Array630
	    = new Class115[class54.method1300(1735480753)];
	((Class47) this).aClass117Array631
	    = new Class117[class54.method1300(1653524460)];
	for (int i_4_ = 0; i_4_ < ((Class47) this).aClass115Array629.length;
	     i_4_++) {
	    ((Class47) this).aClass115Array629[i_4_] = new Class115();
	    ((Class47) this).aClass115Array629[i_4_].method2799(class54,
								-1108756897);
	}
	for (int i_5_ = 0; i_5_ < ((Class47) this).aClass115Array630.length;
	     i_5_++) {
	    ((Class47) this).aClass115Array630[i_5_] = new Class115();
	    ((Class47) this).aClass115Array630[i_5_].method2799(class54,
								-1108756897);
	}
	for (int i_6_ = 0; i_6_ < ((Class47) this).aClass117Array631.length;
	     i_6_++) {
	    ((Class47) this).aClass117Array631[i_6_] = new Class117();
	    ((Class47) this).aClass117Array631[i_6_].method2926(class54,
								-718913725);
	}
    }
    
    void method1131(byte[] is) throws Exception_Sub6 {
	Class54 class54 = new Class54(is);
	int i = class54.method1300(1561515423);
	if (4 != i)
	    throw new Exception_Sub6(this, i, 4);
	((Class47) this).aString626 = class54.method1298(431756009);
	((Class47) this).aClass115Array629
	    = new Class115[class54.method1300(2041896168)];
	((Class47) this).aClass115Array630
	    = new Class115[class54.method1300(1799069095)];
	((Class47) this).aClass117Array631
	    = new Class117[class54.method1300(1496115537)];
	for (int i_7_ = 0; i_7_ < ((Class47) this).aClass115Array629.length;
	     i_7_++) {
	    ((Class47) this).aClass115Array629[i_7_] = new Class115();
	    ((Class47) this).aClass115Array629[i_7_].method2799(class54,
								-1108756897);
	}
	for (int i_8_ = 0; i_8_ < ((Class47) this).aClass115Array630.length;
	     i_8_++) {
	    ((Class47) this).aClass115Array630[i_8_] = new Class115();
	    ((Class47) this).aClass115Array630[i_8_].method2799(class54,
								-1108756897);
	}
	for (int i_9_ = 0; i_9_ < ((Class47) this).aClass117Array631.length;
	     i_9_++) {
	    ((Class47) this).aClass117Array631[i_9_] = new Class117();
	    ((Class47) this).aClass117Array631[i_9_].method2926(class54,
								-718913725);
	}
    }
    
    static final void method1132(int i) {
	Class13.aLong82 = 7226492194362182485L;
	Class13.aLong111 = 0L;
	Class13.anInt81 = -1017556759;
    }
    
    static final void method1133(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = -1;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = -1;
    }
    
    public static String method1134(CharSequence charsequence, byte i) {
	String string
	    = Class16.method855(ObjectDefinitionLoader.method11870(charsequence, 161672197));
	if (null == string)
	    string = "";
	return string;
    }
    
    static void method1135(Class241_Sub39_Sub11 class241_sub39_sub11, int i, int i_10_, int i_11_) {
		if (class241_sub39_sub11 != null && class241_sub39_sub11 != Class16.aClass429_150.aClass241_6093) {
		    int localX = (((Class241_Sub39_Sub11) class241_sub39_sub11).anInt10873 * -510105715);
		    int localY = (((Class241_Sub39_Sub11) class241_sub39_sub11).anInt10874 * 1841217923);
		    int opcode = (((Class241_Sub39_Sub11) class241_sub39_sub11).anInt10879 * -142243581);
		    int index = (int) (-218357506993850339L * (((Class241_Sub39_Sub11) class241_sub39_sub11).aLong10877));
		    long l = (((Class241_Sub39_Sub11) class241_sub39_sub11).aLong10877 * -218357506993850339L);
		    if (opcode >= 2000) {
		    	opcode -= 2000;
		    }
		    GameScene region = client.aClass238_8477.method4806((byte) 1);
		    OutgoingOpcode groundItemOpcode = null;
		    if (18 == opcode) {
		    	groundItemOpcode = OutgoingOpcode.GROUND_ITEM_OPTION_1_PACKET;
		    } else if (19 == opcode) {
		    	groundItemOpcode = OutgoingOpcode.GROUND_ITEM_OPTION_2_PACKET;
		    } else if (20 == opcode) {
		    	groundItemOpcode = OutgoingOpcode.GROUND_ITEM_OPTION_3_PACKET;
		    } else if (21 == opcode) {
		    	groundItemOpcode = OutgoingOpcode.GROUND_ITEM_OPTION_4_PACKET;
		    } else if (22 == opcode) {
		    	groundItemOpcode = OutgoingOpcode.GROUND_ITEM_OPTION_5_PACKET;
		    } else if (opcode == 1004) {
		    	groundItemOpcode = OutgoingOpcode.GROUND_ITEM_EXAMINE_PACKET;
		    }
		    if (groundItemOpcode != null) {
				client.anInt8391 = -430880975 * i;
				client.anInt8415 = i_10_ * 1990951441;
				client.anInt8417 = 1664655090;
				client.anInt8416 = 0;
				Class241_Sub27 packet = Class445_Sub26.makePacket(
						groundItemOpcode,
						client.aClass190_8340.packetCipher, 16711935);
				packet.data.writeShort(localY + 468558693 * region.baseY, -484048531);
				packet.data.writeByte(InvType.isForceRun(1319366149) ? 1 : 0, -1287910239);
				packet.data.writeShort(index, -484048531);
				packet.data.writeLEShortA(localX + 127679513 * region.baseX, (byte) -24);
				client.aClass190_8340.sendPacket(packet, -2073183654);
				Class475_Sub1_Sub3_Sub2.setMinimapFlag(localX, localY, 903088642);
		    }
		    if (15 == opcode) {
				Player player = client.localPlayers[index];
				if (null != player) {
				    client.anInt8391 = i * -430880975;
				    client.anInt8415 = 1990951441 * i_10_;
				    client.anInt8417 = 1664655090;
				    client.anInt8416 = 0;
				    Class241_Sub27 packet = Class445_Sub26.makePacket(
				    		OutgoingOpcode.INTERFACE_ON_PLAYER_PACKET,
				    		client.aClass190_8340.packetCipher, 16711935);
				    packet.data.writeLEShortA(1196348233 * client.prevComponentSlot1, (byte) 3);
				    packet.data.writeLEShortA(index, (byte) -84);
				    packet.data.writeByteC(InvType.isForceRun(1319366149) ? 1 : 0, 868520951);
				    packet.data.writeLEShortA(2122695965 * client.prevComponentSlot2, (byte) 44);
				    packet.data.writeIntV1(-1349195347 * RSGraphics.prevComponentHash, (byte) 0);
				    client.aClass190_8340.sendPacket(packet, -2132071400);
				    Class475_Sub1_Sub3_Sub2.setMinimapFlag(
				    		player.scenePositionXQueue[0],
				    		player.scenePositionYQueue[0],
				    		903088642);
				}
		    }
		    if (30 == opcode && null == client.aClass58_8384) {
				Class440.method7831(localY, localX, 1482319719);
				client.aClass58_8384 = Class218_Sub3.method16576(localY, localX, (byte) -81);
				if (client.aClass58_8384 != null) {
				    WorldType.refreshComponent(client.aClass58_8384, -51769826);
				}
		    }
		    if (60 == opcode) {
				if (482866503 * client.playerRights > 0
				    && Js5ConfigGroup.method1024(-120196804)) {
				    Class22.method903((Class21.myPlayer.nodePlane),
						      localX + region.baseX * 127679513,
						      localY + region.baseY * 468558693,
						      (byte) -11);
				} else {
				    client.anInt8391 = i * -430880975;
				    client.anInt8415 = 1990951441 * i_10_;
				    client.anInt8417 = -1315156103;
				    client.anInt8416 = 0;
				    Class241_Sub27 class241_sub27 = Class445_Sub26.makePacket(
				    		OutgoingOpcode.aClass253_4036,
				    		client.aClass190_8340.packetCipher, 16711935);
				    class241_sub27.data.writeShort(468558693 * region.baseY + localY, -484048531);
				    class241_sub27.data.writeShort(127679513 * region.baseX + localX, -484048531);
				    client.aClass190_8340.sendPacket(class241_sub27, -1760802981);
				}
		    }
		    if (2 == opcode) {
				client.anInt8391 = -430880975 * i;
				client.anInt8415 = i_10_ * 1990951441;
				client.anInt8417 = 1664655090;
				client.anInt8416 = 0;
				Class241_Sub27 packet = Class445_Sub26.makePacket(
						OutgoingOpcode.INTERFACE_ON_OBJECT_PACKET,
						client.aClass190_8340.packetCipher, 16711935);
				packet.data.writeShortA(2122695965 * client.prevComponentSlot2, -488185313);
				packet.data.writeLEShortA(client.prevComponentSlot1 * 1196348233, (byte) -54);
				packet.data.writeByteA(InvType.isForceRun(1319366149) ? 1 : 0, 1935906171);//Force run
				packet.data.writeIntV2((int) (l >>> 32) & 0x7fffffff, 674840770);//Object ID
				packet.data.writeShort(localX + region.baseX * 127679513, -484048531);//X
				packet.data.writeLEShort(468558693 * region.baseY + localY, 1847640142);//Y
				packet.data.writeInt(-1349195347 * RSGraphics.prevComponentHash, 564039962);
				client.aClass190_8340.sendPacket(packet, -1517879043);
				Class475_Sub1_Sub3_Sub2.setMinimapFlag(localX, localY, 903088642);
		    }
		    OutgoingOpcode objectOpcode = null;
		    if (opcode == 3) {
		    	objectOpcode = OutgoingOpcode.OBJECT_OPTION_1_PACKET;
		    } else if (4 == opcode) {
		    	objectOpcode = OutgoingOpcode.OBJECT_OPTION_2_PACKET;
		    } else if (opcode == 5) {
		    	objectOpcode = OutgoingOpcode.OBJECT_OPTION_3_PACKET;
		    } else if (opcode == 6) {
		    	objectOpcode = OutgoingOpcode.OBJECT_OPTION_4_PACKET;
		    } else if (1001 == opcode) {
		    	objectOpcode = OutgoingOpcode.OBJECT_OPTION_5_PACKET;
		    } else if (1002 == opcode) {
		    	objectOpcode = OutgoingOpcode.OBJECT_EXAMINE_PACKET;
		    }
		    if (null != objectOpcode) {
				client.anInt8391 = -430880975 * i;
				client.anInt8415 = 1990951441 * i_10_;
				client.anInt8417 = 1664655090;
				client.anInt8416 = 0;
				Class241_Sub27 packet = Class445_Sub26.makePacket( 
						objectOpcode, client.aClass190_8340.packetCipher, 16711935);
				packet.data.writeLEInt((int) (l >>> 32) & 0x7fffffff, -121138339);
				packet.data.writeLEShortA(468558693 * region.baseY + localY, (byte) -34);
				packet.data.writeByteA(InvType.isForceRun(1319366149) ? 1 : 0, 2094779734);
				packet.data.writeLEShortA(localX + region.baseX * 127679513, (byte) 19);
				client.aClass190_8340.sendPacket(packet, -1871526800);
				Class475_Sub1_Sub3_Sub2.setMinimapFlag(localX, localY, 903088642);
		    }
		    OutgoingOpcode npcOpcode = null;
		    if (opcode == 9) {
		    	npcOpcode = OutgoingOpcode.NPC_OPTION_1_PACKET;
		    } else if (opcode == 10) {
		    	npcOpcode = OutgoingOpcode.NPC_OPTION_2_PACKET;
		    } else if (11 == opcode) {
		    	npcOpcode = OutgoingOpcode.NPC_OPTION_3_PACKET;
		    } else if (12 == opcode) {
		    	npcOpcode = OutgoingOpcode.NPC_OPTION_4_PACKET;
		    } else if (opcode == 13) {
		    	npcOpcode = OutgoingOpcode.NPC_OPTION_5_PACKET;
		    } else if (1003 == opcode) {
		    	npcOpcode = OutgoingOpcode.NPC_EXAMINE_PACKET;
		    }
		    if (npcOpcode != null) {
				ObjectNode class241_sub26 = ((ObjectNode) client.aClass407_8457.get((long) index));
				if (null != class241_sub26) {
				    NPC npc = ((NPC) class241_sub26.objectValue);
				    client.anInt8391 = -430880975 * i;
				    client.anInt8415 = 1990951441 * i_10_;
				    client.anInt8417 = 1664655090;
				    client.anInt8416 = 0;
				    Class241_Sub27 packet = Class445_Sub26.makePacket(
				    		npcOpcode, client.aClass190_8340.packetCipher, 16711935);
				    packet.data.writeByteS(InvType.isForceRun(1319366149) ? 1 : 0, 1898014032);
				    packet.data.writeShortA(index, -1945434960);
				    client.aClass190_8340.sendPacket(packet, -1705554054);
				    Class475_Sub1_Sub3_Sub2.setMinimapFlag(
				    		npc.scenePositionXQueue[0],
							npc.scenePositionYQueue[0],
							903088642);
				}
		    }
		    if (23 == opcode) {//Movement packet
				if (482866503 * client.playerRights > 0 && Js5ConfigGroup.method1024(2124972350)) {
				    Class22.method903(Class21.myPlayer.nodePlane,
						      localX + region.baseX * 127679513,
						      region.baseY * 468558693 + localY,
						      (byte) -65);
				} else {
				    Class241_Sub27 movementPacket = Class461.createWalkPacket(localX, localY, index, 304007625);
				    if (1 == index) {//Minimap walking packer
				    	movementPacket.data.writeByte(-1, 185577187);
				    	movementPacket.data.writeByte(-1, -489821470);
				    	movementPacket.data.writeShort((int) client.aFloat8581, -484048531);
				    	movementPacket.data.writeByte(57, -1844907815);
				    	movementPacket.data.writeByte(390680985 * client.anInt8513, 1383649778);
				    	movementPacket.data.writeByte(1747300637 * client.anInt8377, -739090660);
				    	movementPacket.data.writeByte(89, 1236776334);
						Class287 class287 = Class21.myPlayer.method10874().aClass287_4386;
						movementPacket.data.writeShort((int) class287.aFloat4477, -484048531);
						movementPacket.data.writeShort((int) class287.aFloat4479, -484048531);
						movementPacket.data.writeByte(63, -173051099);
				    } else {
						client.anInt8391 = -430880975 * i;
						client.anInt8415 = i_10_ * 1990951441;
						client.anInt8417 = -1315156103;
						client.anInt8416 = 0;
				    }
				    client.aClass190_8340.sendPacket(movementPacket, -1976581582);
				    Class475_Sub1_Sub3_Sub2.setMinimapFlag(localX, localY, 903088642);
				}
		    }
		    if (opcode == 58) {
		    	InterfaceComponent component = Class218_Sub3.method16576(localY, localX, (byte) -128);
				if (component != null) {
				    Class462.processItemOnItem(component, (byte) -1);
				}
		    }
		    if (opcode == 16) {
				client.anInt8391 = i * -430880975;
				client.anInt8415 = i_10_ * 1990951441;
				client.anInt8417 = 1664655090;
				client.anInt8416 = 0;
				Class241_Sub27 class241_sub27
				    = Class445_Sub26.makePacket(OutgoingOpcode.INTERFACE_ON_PLAYER_PACKET,
								 (client.aClass190_8340
								  .packetCipher),
								 16711935);
				class241_sub27.data
				    .writeLEShortA(1196348233 * client.prevComponentSlot1, (byte) 26);
				class241_sub27.data.writeLEShortA
				    ((Class21.myPlayer.entityIndex
				      * -546698383),
				     (byte) 2);
				class241_sub27.data.writeByteC
				    (InvType.isForceRun(1319366149) ? 1 : 0,
				     868520951);
				class241_sub27.data
				    .writeLEShortA(client.prevComponentSlot2 * 2122695965, (byte) -2);
				class241_sub27.data
				    .writeIntV1(RSGraphics.prevComponentHash * -1349195347, (byte) 0);
				client.aClass190_8340.sendPacket(class241_sub27, -1577777764);
		    }
		    if (17 == opcode) {
				client.anInt8391 = -430880975 * i;
				client.anInt8415 = i_10_ * 1990951441;
				client.anInt8417 = 1664655090;
				client.anInt8416 = 0;
				Class241_Sub27 class241_sub27 = Class445_Sub26.makePacket(
						OutgoingOpcode.aClass253_4070,
						client.aClass190_8340.packetCipher,
						16711935);
				class241_sub27.data.writeByte
				    (InvType.isForceRun(1319366149) ? 1 : 0,
				     -1463887336);
				class241_sub27.data.writeLEShort(2122695965 * client.prevComponentSlot2, 2029971038);
				class241_sub27.data.writeIntV2(RSGraphics.prevComponentHash * -1349195347, -1877341509);
				class241_sub27.data.writeShortA(127679513 * region.baseX + localX, -1674999810);
				class241_sub27.data.writeLEShortA(index, (byte) -29);
				class241_sub27.data.writeLEShortA(localY + 468558693 * region.baseY, (byte) -17);
				class241_sub27.data.writeShort(1196348233 * client.prevComponentSlot1, -484048531);
				client.aClass190_8340.sendPacket(class241_sub27, -1880888349);
				Class475_Sub1_Sub3_Sub2.setMinimapFlag(localX, localY, 903088642);
		    }
		    OutgoingOpcode playerOption = null;
		    if (44 == opcode) {//Usually "Attack"
		    	playerOption = OutgoingOpcode.PLAYER_OPTION_1_PACKET;
		    } else if (opcode == 45) {//Usually "Follow"
		    	playerOption = OutgoingOpcode.PLAYER_OPTION_2_PACKET;
		    } else if (opcode == 46) {
		    	playerOption = OutgoingOpcode.PLAYER_OPTION_3_PACKET;
		    } else if (opcode == 47) {//Usually "Trade"
		    	playerOption = OutgoingOpcode.PLAYER_OPTION_4_PACKET;
		    } else if (opcode == 48) {
		    	playerOption = OutgoingOpcode.PLAYER_OPTION_5_PACKET;
		    } else if (49 == opcode) {
		    	playerOption = OutgoingOpcode.PLAYER_OPTION_6_PACKET;
		    } else if (opcode == 50) {
		    	playerOption = OutgoingOpcode.PLAYER_OPTION_7_PACKET;
		    } else if (51 == opcode) {
		    	playerOption = OutgoingOpcode.PLAYER_OPTION_8_PACKET;
		    } else if (52 == opcode) {
		    	playerOption = OutgoingOpcode.PLAYER_OPTION_9_PACKET;
		    } else if (opcode == 53) {
		    	playerOption = OutgoingOpcode.PLAYER_OPTION_10_PACKET;
		    }
		    if (null != playerOption) {
				Player player = client.localPlayers[index];
				if (null != player) {
				    client.anInt8391 = -430880975 * i;
				    client.anInt8415 = i_10_ * 1990951441;
				    client.anInt8417 = 1664655090;
				    client.anInt8416 = 0;
				    Class241_Sub27 packet = Class445_Sub26.makePacket(playerOption,
							client.aClass190_8340.packetCipher, 16711935);
				    packet.data.writeShortA(index, -2122314714);
				    packet.data.writeByte(InvType.isForceRun(1319366149) ? 1 : 0, -185356462);
				    client.aClass190_8340.sendPacket(packet, -1868898130);
				    Class475_Sub1_Sub3_Sub2.setMinimapFlag(
				    		player.scenePositionXQueue[0],
				    		player.scenePositionYQueue[0],
				    		903088642);
				}
		    }
		    if (25 == opcode) {//Item on item
				InterfaceComponent component = Class218_Sub3.method16576(localY, localX, (byte) -60);
				if (component != null) {
				    Class520.method11688(-1996624310);
				    Class241_Sub20 class241_sub20 = client.method13624(component);
				    Class107.method2689(component,
							class241_sub20.method15040((short) -12596),
							class241_sub20.anInt9008 * -1892353525,
							(byte) 26);
				    client.aString8464 = Class518.method11662(component, (byte) -42);
				    if (client.aString8464 == null) {
				    	client.aString8464 = "Null";
				    }
				    client.aString8465 = new StringBuilder().append(component.aString933).append
					      (Class338.method6112(16777215, 256336032)).toString();
				}
		    } else {
				if (57 == opcode || opcode == 1007) {
				    Class581.processActionButton(index, localY, localX,
				    		((Class241_Sub39_Sub11) class241_sub39_sub11).aString10869, -1223225155);
				}
				if (opcode == 59) {
				    client.anInt8391 = i * -430880975;
				    client.anInt8415 = 1990951441 * i_10_;
				    client.anInt8417 = -1315156103;
				    client.anInt8416 = 0;
				    Class241_Sub27 packet = Class445_Sub26.makePacket(
				    		OutgoingOpcode.aClass253_4033,
				    		client.aClass190_8340.packetCipher, 16711935);
				    packet.data.writeShort(region.baseY * 468558693 + localY, -484048531);
				    packet.data.writeInt(-1349195347 * RSGraphics.prevComponentHash, 444174440);
				    packet.data.writeLEShortA(region.baseX * 127679513 + localX, (byte) 26);
				    packet.data.writeLEShort(1196348233 * client.prevComponentSlot1, -1779059896);
				    packet.data.writeLEShortA(client.prevComponentSlot2 * 2122695965, (byte) 103);
				    client.aClass190_8340.sendPacket(packet, -1538839170);
				    Class475_Sub1_Sub3_Sub2.setMinimapFlag(localX, localY, 903088642);
				}
				if (opcode == 8) {
				    ObjectNode class241_sub26 = ((ObjectNode) client.aClass407_8457.get((long) index));
				    if (null != class241_sub26) {
						NPC npc = ((NPC) class241_sub26.objectValue);
						client.anInt8391 = -430880975 * i;
						client.anInt8415 = 1990951441 * i_10_;
						client.anInt8417 = 1664655090;
						client.anInt8416 = 0;
						Class241_Sub27 packet = Class445_Sub26.makePacket(
								OutgoingOpcode.aClass253_4046,
								client.aClass190_8340.packetCipher,
								16711935);
						packet.data.writeShortA(index, -1774345554);
						packet.data.writeShort(2122695965 * client.prevComponentSlot2, -484048531);
						packet.data.writeLEShortA(client.prevComponentSlot1 * 1196348233, (byte) -48);
						packet.data.writeByte((InvType.isForceRun(1319366149) ? 1 : 0), -630988685);
						packet.data.writeIntV1(-1349195347 * RSGraphics.prevComponentHash, (byte) 0);
						client.aClass190_8340.sendPacket(packet, -1798625295);
						Class475_Sub1_Sub3_Sub2.setMinimapFlag(
								npc.scenePositionXQueue[0],
								npc.scenePositionYQueue[0],
								903088642);
				    }
				}
				if (opcode == 1008 || 1009 == opcode || 1010 == opcode
				    || opcode == 1011 || opcode == 1012)
				    Class271.method5314(opcode, index, localX, 421967667);
				if (client.aBool8544) {
				    Class520.method11688(-2058672681);
				}
				if (null != Class566.aClass58_7322 && 0 == 1187065937 * client.anInt8274) {
				    WorldType.refreshComponent(Class566.aClass58_7322, -1649004868);
				}
		    }
		}
    }
}
