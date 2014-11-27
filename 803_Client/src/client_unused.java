import java.io.IOException;


public class client_unused {

	static final boolean method13872(ServerConnection class190) {
	boolean bool;
	try {
	    bool = PacketDecoder.decodePacket(class190, 155005827);
	} catch (IOException ioexception) {
	    if (16 == client.anInt8288 * 1766317249) {
		class190.method3886((short) 721);
		return false;
	    }
	    Class199.dropClient(137823375);
	    return true;
	} catch (Exception exception) {
	    GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	    String string
		= new StringBuilder().append
		      (((ServerConnection) class190).currentPacket != null
		       ? (((ServerConnection) class190).currentPacket.opcode
			  * 935526901)
		       : -1)
		      .append
		      (Class6.aString30).append
		      (((ServerConnection) class190).aClass340_2273 != null
		       ? (935526901
			  * ((ServerConnection) class190).aClass340_2273.opcode)
		       : -1)
		      .append
		      (Class6.aString30).append
		      (((ServerConnection) class190).aClass340_2274 != null
		       ? (935526901
			  * ((ServerConnection) class190).aClass340_2274.opcode)
		       : -1)
		      .append
		      (" ").append
		      (((ServerConnection) class190).incommingPacketSize * 1912225577).append
		      (Class6.aString30).append
		      (class522.baseX * 127679513
		       + (Class21.myPlayer
			  .scenePositionXQueue[0]))
		      .append
		      (Class6.aString30).append
		      (468558693 * class522.baseY
		       + (Class21.myPlayer
			  .scenePositionYQueue[0]))
		      .append
		      (" ").toString();
	    for (int i = 0;
		 i < 1912225577 * ((ServerConnection) class190).incommingPacketSize && i < 50;
		 i++)
		string = new StringBuilder().append(string).append
			     (((ServerConnection) class190).inputBuffer
			      .payload[i])
			     .append
			     (Class6.aString30).toString();
	    VarType.method3770(string, exception, -220638686);
	    Class362_Sub1.gameLogout(false, -218596361);
	    return true;
	}
	return bool;
	}

	static final boolean method13873(ServerConnection class190) {
	boolean bool;
	try {
	    bool = PacketDecoder.decodePacket(class190, 24262746);
	} catch (IOException ioexception) {
	    if (16 == client.anInt8288 * 1766317249) {
		class190.method3886((short) 721);
		return false;
	    }
	    Class199.dropClient(-1787257852);
	    return true;
	} catch (Exception exception) {
	    GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	    String string
		= new StringBuilder().append
		      (((ServerConnection) class190).currentPacket != null
		       ? (((ServerConnection) class190).currentPacket.opcode
			  * 935526901)
		       : -1)
		      .append
		      (Class6.aString30).append
		      (((ServerConnection) class190).aClass340_2273 != null
		       ? (935526901
			  * ((ServerConnection) class190).aClass340_2273.opcode)
		       : -1)
		      .append
		      (Class6.aString30).append
		      (((ServerConnection) class190).aClass340_2274 != null
		       ? (935526901
			  * ((ServerConnection) class190).aClass340_2274.opcode)
		       : -1)
		      .append
		      (" ").append
		      (((ServerConnection) class190).incommingPacketSize * 1912225577).append
		      (Class6.aString30).append
		      (class522.baseX * 127679513
		       + (Class21.myPlayer
			  .scenePositionXQueue[0]))
		      .append
		      (Class6.aString30).append
		      (468558693 * class522.baseY
		       + (Class21.myPlayer
			  .scenePositionYQueue[0]))
		      .append
		      (" ").toString();
	    for (int i = 0;
		 i < 1912225577 * ((ServerConnection) class190).incommingPacketSize && i < 50;
		 i++)
		string = new StringBuilder().append(string).append
			     (((ServerConnection) class190).inputBuffer
			      .payload[i])
			     .append
			     (Class6.aString30).toString();
	    VarType.method3770(string, exception, -390774670);
	    Class362_Sub1.gameLogout(false, 2010465539);
	    return true;
	}
	return bool;
	}

	static final boolean method13875(ServerConnection class190) {
	boolean bool;
	try {
	    bool = PacketDecoder.decodePacket(class190, -1567717295);
	} catch (IOException ioexception) {
	    if (16 == client.anInt8288 * 1766317249) {
		class190.method3886((short) 721);
		return false;
	    }
	    Class199.dropClient(-1562822381);
	    return true;
	} catch (Exception exception) {
	    GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	    String string
		= new StringBuilder().append
		      (((ServerConnection) class190).currentPacket != null
		       ? (((ServerConnection) class190).currentPacket.opcode
			  * 935526901)
		       : -1)
		      .append
		      (Class6.aString30).append
		      (((ServerConnection) class190).aClass340_2273 != null
		       ? (935526901
			  * ((ServerConnection) class190).aClass340_2273.opcode)
		       : -1)
		      .append
		      (Class6.aString30).append
		      (((ServerConnection) class190).aClass340_2274 != null
		       ? (935526901
			  * ((ServerConnection) class190).aClass340_2274.opcode)
		       : -1)
		      .append
		      (" ").append
		      (((ServerConnection) class190).incommingPacketSize * 1912225577).append
		      (Class6.aString30).append
		      (class522.baseX * 127679513
		       + (Class21.myPlayer
			  .scenePositionXQueue[0]))
		      .append
		      (Class6.aString30).append
		      (468558693 * class522.baseY
		       + (Class21.myPlayer
			  .scenePositionYQueue[0]))
		      .append
		      (" ").toString();
	    for (int i = 0;
		 i < 1912225577 * ((ServerConnection) class190).incommingPacketSize && i < 50;
		 i++)
		string = new StringBuilder().append(string).append
			     (((ServerConnection) class190).inputBuffer
			      .payload[i])
			     .append
			     (Class6.aString30).toString();
	    VarType.method3770(string, exception, -2007778010);
	    Class362_Sub1.gameLogout(false, -327693322);
	    return true;
	}
	return bool;
	}

	static final boolean method13876(ServerConnection class190) {
	boolean bool;
	try {
	    bool = PacketDecoder.decodePacket(class190, 1249489581);
	} catch (IOException ioexception) {
	    if (16 == client.anInt8288 * 1766317249) {
		class190.method3886((short) 721);
		return false;
	    }
	    Class199.dropClient(-1111527111);
	    return true;
	} catch (Exception exception) {
	    GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	    String string
		= new StringBuilder().append
		      (((ServerConnection) class190).currentPacket != null
		       ? (((ServerConnection) class190).currentPacket.opcode
			  * 935526901)
		       : -1)
		      .append
		      (Class6.aString30).append
		      (((ServerConnection) class190).aClass340_2273 != null
		       ? (935526901
			  * ((ServerConnection) class190).aClass340_2273.opcode)
		       : -1)
		      .append
		      (Class6.aString30).append
		      (((ServerConnection) class190).aClass340_2274 != null
		       ? (935526901
			  * ((ServerConnection) class190).aClass340_2274.opcode)
		       : -1)
		      .append
		      (" ").append
		      (((ServerConnection) class190).incommingPacketSize * 1912225577).append
		      (Class6.aString30).append
		      (class522.baseX * 127679513
		       + (Class21.myPlayer
			  .scenePositionXQueue[0]))
		      .append
		      (Class6.aString30).append
		      (468558693 * class522.baseY
		       + (Class21.myPlayer
			  .scenePositionYQueue[0]))
		      .append
		      (" ").toString();
	    for (int i = 0;
		 i < 1912225577 * ((ServerConnection) class190).incommingPacketSize && i < 50;
		 i++)
		string = new StringBuilder().append(string).append
			     (((ServerConnection) class190).inputBuffer
			      .payload[i])
			     .append
			     (Class6.aString30).toString();
	    VarType.method3770(string, exception, -1779800888);
	    Class362_Sub1.gameLogout(false, 487446861);
	    return true;
	}
	return bool;
	}

	static final boolean method13877(ServerConnection class190) throws IOException {
	Class563 class563 = class190.getIO(-891146365);
	RSBitBuffer class241_sub3_sub1
	    = ((ServerConnection) class190).inputBuffer;
	if (class563 == null)
	    return false;
	if (null == ((ServerConnection) class190).currentPacket) {
	    if (((ServerConnection) class190).aBool2265) {
		if (!class563.isAvailable(1, -341343911))
		    return false;
		class563.read((((ServerConnection) class190)
				      .inputBuffer
				      .payload),
				     0, 1, 1992027271);
		((ServerConnection) class190).anInt2266 += 350604633;
		((ServerConnection) class190).anInt2269 = 0;
		((ServerConnection) class190).aBool2265 = false;
	    }
	    class241_sub3_sub1.pointer = 0;
	    if (class241_sub3_sub1.method17041(894151261)) {
		if (!class563.isAvailable(1, -341343911))
		    return false;
		class563.read((((ServerConnection) class190)
				      .inputBuffer
				      .payload),
				     1, 1, 2100694832);
		((ServerConnection) class190).anInt2266 += 350604633;
		((ServerConnection) class190).anInt2269 = 0;
	    }
	    ((ServerConnection) class190).aBool2265 = true;
	    IncommingOpcode[] class340s = Class452.method10546((byte) -52);
	    int i = class241_sub3_sub1.readPacketOpcode(2110963629);
	    if (i < 0 || i >= class340s.length)
		throw new IOException(new StringBuilder().append(i).append
					  (" ").append
					  (class241_sub3_sub1.pointer
					   * 421967667)
					  .toString());
	    ((ServerConnection) class190).currentPacket = class340s[i];
	    ((ServerConnection) class190).incommingPacketSize
		= 1850243431 * ((ServerConnection) class190).currentPacket.size;
	}
	if (((ServerConnection) class190).incommingPacketSize * 1912225577 == -1) {
	    if (!class563.isAvailable(1, -341343911))
		return false;
	    class563.read(class241_sub3_sub1.payload, 0, 1,
				 1988809029);
	    ((ServerConnection) class190).incommingPacketSize
		= -1248015079 * (class241_sub3_sub1.payload[0] & 0xff);
	    ((ServerConnection) class190).anInt2266 += 350604633;
	    ((ServerConnection) class190).anInt2269 = 0;
	}
	if (1912225577 * ((ServerConnection) class190).incommingPacketSize == -2) {
	    if (!class563.isAvailable(2, -341343911))
		return false;
	    class563.read(class241_sub3_sub1.payload, 0, 2,
				 2103568339);
	    class241_sub3_sub1.pointer = 0;
	    ((ServerConnection) class190).incommingPacketSize
		= class241_sub3_sub1.readUnsignedShort(1162222719) * -1248015079;
	    ((ServerConnection) class190).anInt2266 += 701209266;
	    ((ServerConnection) class190).anInt2269 = 0;
	}
	if (1912225577 * ((ServerConnection) class190).incommingPacketSize > 0) {
	    if (!class563.isAvailable((((ServerConnection) class190).incommingPacketSize
				       * 1912225577),
				      -341343911))
		return false;
	    class241_sub3_sub1.pointer = 0;
	    class563.read(class241_sub3_sub1.payload, 0,
				 ((ServerConnection) class190).incommingPacketSize * 1912225577,
				 2087371958);
	    ((ServerConnection) class190).anInt2266
		+= -1203713471 * ((ServerConnection) class190).incommingPacketSize;
	    ((ServerConnection) class190).anInt2269 = 0;
	}
	((ServerConnection) class190).aClass340_2274
	    = ((ServerConnection) class190).aClass340_2273;
	((ServerConnection) class190).aClass340_2273
	    = ((ServerConnection) class190).aClass340_2272;
	((ServerConnection) class190).aClass340_2272
	    = ((ServerConnection) class190).currentPacket;
	if (IncommingOpcode.aClass340_5230 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedShortA((byte) 87);
	    if (65535 == i)
		i = -1;
	    Class402.soundManager.method1163(i, 255, 378943703);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.FRIENDS_PACKET == ((ServerConnection) class190).currentPacket) {
	    while (class241_sub3_sub1.pointer * 421967667
		   < 1912225577 * ((ServerConnection) class190).incommingPacketSize) {
		boolean bool = class241_sub3_sub1.readUnsignedByte((byte) -50) == 1;
		String string = class241_sub3_sub1.readString(-1051247159);
		String string_1435_
		    = class241_sub3_sub1.readString(676565149);
		int i = class241_sub3_sub1.readUnsignedShort(1162222719);
		int i_1436_ = class241_sub3_sub1.readUnsignedByte((byte) -26);
		int i_1437_ = class241_sub3_sub1.readUnsignedByte((byte) 52);
		boolean bool_1438_ = 0 != (i_1437_ & 0x2);
		boolean bool_1439_ = (i_1437_ & 0x1) != 0;
		String string_1440_ = "";
		int i_1441_ = -1;
		int i_1442_ = 0;
		if (i > 0) {
		    string_1440_ = class241_sub3_sub1.readString(-405521880);
		    i_1441_ = class241_sub3_sub1.readUnsignedByte((byte) -13);
		    i_1442_ = class241_sub3_sub1.readInt((byte) 112);
		}
		String string_1443_
		    = class241_sub3_sub1.readString(-1043785057);
		for (int i_1444_ = 0; i_1444_ < 1557840217 * client.friendListSize;
		     i_1444_++) {
		    Friend class18 = client.friendList[i_1444_];
		    if (!bool) {
			if (string.equals(class18.currentName)) {
			    if (i != 1337402161 * class18.serverNodeID) {
				boolean bool_1445_ = true;
				for (Class247_Sub3 class247_sub3
					 = ((Class247_Sub3)
					    client.aClass421_8568
						.method7525(442268352));
				     class247_sub3 != null;
				     class247_sub3
					 = ((Class247_Sub3)
					    client.aClass421_8568
						.method7526(-2054033703))) {
				    if (((Class247_Sub3) class247_sub3)
					    .aString10081.equals(string)) {
					if (i != 0 && 0 == (((Class247_Sub3)
							     class247_sub3)
							    .aShort10080)) {
					    class247_sub3.method4944((byte) 9);
					    bool_1445_ = false;
					} else if (i == 0
						   && 0 != (((Class247_Sub3)
							     class247_sub3)
							    .aShort10080)) {
					    class247_sub3
						.method4944((byte) 39);
					    bool_1445_ = false;
					}
				    }
				}
				if (bool_1445_)
				    client.aClass421_8568.method7522
					(new Class247_Sub3(string, i),
					 -1665299415);
				class18.serverNodeID = -1805822511 * i;
			    }
			    class18.previousName = string_1435_;
			    class18.serverName = string_1440_;
			    class18.anInt190 = 748979401 * i_1436_;
			    class18.anInt194 = i_1441_ * 1288470163;
			    class18.aBool192 = bool_1438_;
			    class18.aBool193 = bool_1439_;
			    class18.note = string_1443_;
			    class18.serverFlags = 1566867689 * i_1442_;
			    string = null;
			    break;
			}
		    } else if (string_1435_.equals(class18.currentName)) {
			class18.currentName = string;
			class18.previousName = string_1435_;
			string = null;
			break;
		    }
		}
		if (null != string && 1557840217 * client.friendListSize < 400) {
		    Friend class18 = new Friend();
		    client.friendList[1557840217 * client.friendListSize] = class18;
		    class18.currentName = string;
		    class18.previousName = string_1435_;
		    class18.serverNodeID = -1805822511 * i;
		    class18.serverName = string_1440_;
		    class18.anInt190 = i_1436_ * 748979401;
		    class18.anInt194 = 1288470163 * i_1441_;
		    class18.aBool192 = bool_1438_;
		    class18.aBool193 = bool_1439_;
		    class18.note = string_1443_;
		    class18.serverFlags = i_1442_ * 1566867689;
		    client.friendListSize += 1847555817;
		}
	    }
	    client.friendListStage = -1425715398;
	    client.lastFriendsListUpdate = client.anInt8494 * -1343088703;
	    boolean bool = false;
	    int i = client.friendListSize * 1557840217;
	    do {
		if (i <= 0)
		    break;
		bool = true;
		i--;
		for (int i_1446_ = 0; i_1446_ < i; i_1446_++) {
		    boolean bool_1447_ = false;
		    Friend class18 = client.friendList[i_1446_];
		    Friend class18_1448_ = client.friendList[1 + i_1446_];
		    if ((1337402161 * class18.serverNodeID
			 != Class193.aClass397_2297.nodeID * -2019487531)
			&& (1337402161 * class18_1448_.serverNodeID
			    == (Class193.aClass397_2297.nodeID
				* -2019487531)))
			bool_1447_ = true;
		    if (!bool_1447_ && 1337402161 * class18.serverNodeID == 0
			&& 0 != class18_1448_.serverNodeID * 1337402161)
			bool_1447_ = true;
		    if (!bool_1447_ && !class18.aBool192
			&& class18_1448_.aBool192)
			bool_1447_ = true;
		    if (!bool_1447_ && !class18.aBool193
			&& class18_1448_.aBool193)
			bool_1447_ = true;
		    if (bool_1447_) {
			Friend class18_1449_ = client.friendList[i_1446_];
			client.friendList[i_1446_]
			    = client.friendList[i_1446_ + 1];
			client.friendList[1 + i_1446_] = class18_1449_;
			bool = false;
		    }
		}
	    } while (!bool);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5288 == ((ServerConnection) class190).currentPacket) {
	    for (int i = 0; i < client.localPlayers.length;
		 i++) {
		if (null != client.localPlayers[i]) {
		    client.localPlayers[i].anIntArray11397
			= null;
		    client.localPlayers[i]
			.aClass409_11375.method7347(-1, 1374215267);
		}
	    }
	    for (int i = 0; i < 743597371 * client.anInt8434; i++) {
		((Entity)
		 client.aClass241_Sub26Array8276[i].objectValue).anIntArray11397
		    = null;
		((Entity)
		 client.aClass241_Sub26Array8276[i].objectValue)
		    .aClass409_11375.method7347(-1, -926661675);
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.DESTROY_OBJECT_PACKET) {
	    Class529.decodeWorldUpdatePacket(SubIncommingOpcode.DESTROY_OBJECT, -1852027387);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5128) {
	    Class319_Sub1.method16525(-368461636);
	    Class592.method12924(Class520.method11690(236063838), 1281977973);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5184) {
	    int i = class241_sub3_sub1.readUnsignedLEShortA(339129579);
	    int i_1450_ = class241_sub3_sub1.readUnsignedShortA((byte) 113);
	    Class319_Sub1.method16525(964237311);
	    Class530.method11842(i_1450_, i, 0, -163300226);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5232) {
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_1451_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    Class402.soundManager.method1151(i, i_1451_, (byte) 2);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5126 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readInt((byte) 114);
	    Class621.aClass4_7876 = new Class4(i);
	    Thread thread = new Thread(Class621.aClass4_7876);
	    thread.setPriority(1);
	    thread.start();
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5183) {
	    int i = class241_sub3_sub1.readLEInt(583188106);
	    boolean bool = class241_sub3_sub1.getByteA(-2094861018) == 1;
	    Class319_Sub1.method16525(1335920508);
	    Class209_Sub1.method16590(i, bool, (byte) -6);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.MESSAGE_PRIVATE) {
	    boolean bool = class241_sub3_sub1.readUnsignedByte((byte) 35) == 1;
	    String string = class241_sub3_sub1.readString(-790633217);
	    String string_1452_ = string;
	    if (bool)
		string_1452_ = class241_sub3_sub1.readString(250331756);
	    long l = (long) class241_sub3_sub1.readUnsignedShort(1162222719);
	    long l_1453_ = (long) class241_sub3_sub1.readTriByte(1771646547);
	    PlayerRights class328
		= ((PlayerRights)
		   Class531.method11848(VarBitType.method5909(1766317249),
					class241_sub3_sub1
					    .readUnsignedByte((byte) -30),
					-888619585));
	    long l_1454_ = (l << 32) + l_1453_;
	    boolean bool_1455_ = false;
	while_24_:
	    do {
		for (int i = 0; i < 100; i++) {
		    if (l_1454_ == client.chatMessageHashes[i]) {
			bool_1455_ = true;
			break while_24_;
		    }
		}
		if (class328.ignorable) {
		    if (client.aBool8441 && !client.aBool8442 || client.isQcWorld)
			bool_1455_ = true;
		    else if (Class459.isIgnored(string_1452_, (byte) -41))
			bool_1455_ = true;
		}
	    } while (false);
	    if (!bool_1455_) {
		client.chatMessageHashes[963687043 * client.anInt8539] = l_1454_;
		client.anInt8539 = 330738731 * ((client.anInt8539 * 963687043 + 1) % 100);
		String string_1456_
		    = (Class240.stripCode
		       (Class241_Sub47.huffmanDecrypt(class241_sub3_sub1,
						   (byte) 29),
			417256845));
		int i = class328.bypassChatFilter ? 7 : 3;
		if (1247059781 * class328.chatIcon != -1)
		    Class337.showChatMessage(i, 0,
					new StringBuilder().append
					    (Class475_Sub1_Sub5_Sub1
						 .method17724
					     (class328.chatIcon * 1247059781,
					      402956613))
					    .append
					    (string).toString(),
					new StringBuilder().append
					    (Class475_Sub1_Sub5_Sub1
						 .method17724
					     (1247059781 * class328.chatIcon,
					      1485325921))
					    .append
					    (string_1452_).toString(),
					string, string_1456_, null, -1,
					(byte) 1);
		else
		    Class337.showChatMessage(i, 0, string, string_1452_, string,
					string_1456_, null, -1, (byte) 1);
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.CLIENT_SETVARC_SMALL == ((ServerConnection) class190).currentPacket) {
	    byte i = class241_sub3_sub1.getByteC(537746309);
	    int i_1457_ = class241_sub3_sub1.readUnsignedShortA((byte) 40);
	    Class319_Sub1.method16525(978447948);
	    Class597.setVarc(i_1457_, i, 65280);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.REMOVE_GROUND_ITEM_PACKET == ((ServerConnection) class190).currentPacket) {
	    Class529.decodeWorldUpdatePacket(SubIncommingOpcode.REMOVE_GROUND_ITEM, -2011127758);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5141) {
	    Class402.soundManager.method1155(class241_sub3_sub1
						  .readUnsignedShort(1162222719),
					      (byte) 8);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.CLIENT_SETVARC_LARGE) {
	    int i = class241_sub3_sub1.readUnsignedLEShortA(-596648243);
	    int i_1458_ = class241_sub3_sub1.readInt((byte) 55);
	    Class319_Sub1.method16525(1616311196);
	    Class597.setVarc(i, i_1458_, 65280);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5192) {
	    int i = class241_sub3_sub1.readUnsignedShortA((byte) 97);
	    if (65535 == i)
		i = -1;
	    int i_1459_ = class241_sub3_sub1.readLEInt(-2114376567);
	    int i_1460_ = class241_sub3_sub1.readLEInt(-584362735);
	    Class319_Sub1.method16525(1114327443);
	    Class121.method2975(i_1459_, i, i_1460_, 717934678);
	    ItemDefinition class623
		= JS5.itemDefLoader.list(i, (short) 10604);
	    Class477.setComponentObject(i_1459_, 1905798151 * class623.xan2d,
				 class623.yan2d * -1675080811,
				 class623.zoom2d * -1923471293,
				 (short) -14064);
	    Class14.method694(i_1459_, class623.xof2d * 774761921,
			      1096836429 * class623.yof2d,
			      50884575 * class623.zan2d, -1831620595);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.PROJECTILE_PACKET == ((ServerConnection) class190).currentPacket) {
	    Class529.decodeWorldUpdatePacket(SubIncommingOpcode.PROJECTILE, -1971406175);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5171 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedByte((byte) -59);
	    Class411 class411
		= ((Class411)
		   Class531.method11848(Class84.method1841((byte) 50), i,
					-1056308839));
	    if (class411 == null)
		class411 = Class411.aClass411_5938;
	    NPCDefinition.method7187(class411, -2129078026);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5258 == ((ServerConnection) class190).currentPacket) {
	    Class529.decodeWorldUpdatePacket(SubIncommingOpcode.aClass341_5306, -1662795310);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.CLIENT_SETVARCBIT_LARGE == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedLEShortA(-585876245);
	    int i_1461_ = class241_sub3_sub1.readIntV1((short) 25434);
	    Class319_Sub1.method16525(1571535113);
	    Class95.setVarcBit(i, i_1461_, 1239171034);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5243) {
	    int i = class241_sub3_sub1.readUnsignedLEShortA(-108102383);
	    int i_1462_ = class241_sub3_sub1.readIntV2(1274614902);
	    Class319_Sub1.method16525(-359537015);
	    ParamTypeList.method13275(i_1462_, i, -1746676846);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.MESSAGE_PACKET == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readSmart((short) -13407);
	    int i_1463_ = class241_sub3_sub1.readInt((byte) 6);
	    int i_1464_ = class241_sub3_sub1.readUnsignedByte((byte) -30);
	    String string = "";
	    String string_1465_ = string;
	    if (0 != (i_1464_ & 0x1)) {
		string = class241_sub3_sub1.readString(729324752);
		if ((i_1464_ & 0x2) != 0)
		    string_1465_ = class241_sub3_sub1.readString(-934325509);
		else
		    string_1465_ = string;
	    }
	    String string_1466_ = class241_sub3_sub1.readString(174601558);
	    if (99 == i)
		Class21.addline(string_1466_, (byte) 85);
	    else if (98 == i)
		Class1.method453(string_1466_, -1138641242);
	    else {
		if (!string_1465_.equals("")
		    && Class459.isIgnored(string_1465_, (byte) -66)) {
		    ((ServerConnection) class190).currentPacket = null;
		    return true;
		}
		Class318.appendChatboxMessage(i, i_1463_, string, string_1465_, string,
				    string_1466_, -1911921634);
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5156) {
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    if (i == 65535)
		i = -1;
	    int i_1467_ = class241_sub3_sub1.readUnsignedByte((byte) -106);
	    int i_1468_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_1469_ = class241_sub3_sub1.readUnsignedByte((byte) 32);
	    int i_1470_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    Class402.soundManager.method1162(Class112.aClass112_1523, i,
					      i_1467_, i_1469_,
					      Class130.aClass130_1597
						  .method3067(-960497231),
					      Class127.aClass127_1587, 0.0F,
					      0.0F, null, 0, i_1470_, i_1468_,
					      1596940757);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5209) {
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_1471_ = class241_sub3_sub1.readIntV2(1274614902);
	    int i_1472_ = class241_sub3_sub1.readUnsignedByte((byte) 118);
	    int i_1473_ = class241_sub3_sub1.readUnsignedLEShort((short) 16863);
	    Class319_Sub1.method16525(2135629433);
	    Class68.method1678(i_1471_, i_1472_, i_1473_, i, 730693588);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.UNLOCK_FRIEND_LIST_PACKET == ((ServerConnection) class190).currentPacket) {
	    client.friendListStage = 1434625949;
	    client.lastFriendsListUpdate = client.anInt8494 * -1343088703;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.UPDATE_RUNWEIGHT == ((ServerConnection) class190).currentPacket) {
	    client.anInt8471
		= class241_sub3_sub1.readShort((byte) 103) * -1277217811;
	    client.anInt8271 = client.anInt8494 * -674075855;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5165) {
	    int i = class241_sub3_sub1.readInt((byte) 78);
	    int i_1474_ = class241_sub3_sub1.readInt((byte) 21);
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4039,
					     class190.packetCipher,
					     16711935);
	    class241_sub27.data
		.writeByteS(2016113751 * client.currentFpsRate, 1913428408);
	    class241_sub27.data.writeInt(i,
								-1580419457);
	    class241_sub27.data.writeInt(i_1474_,
								-1374287719);
	    class190.sendPacket(class241_sub27, -1966609299);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.GRAPHICS_PACKET) {
	    int i = class241_sub3_sub1.readUnsignedLEShortA(-120673852);
	    int i_1475_ = class241_sub3_sub1.readUnsignedShortA((byte) 90);
	    if (i_1475_ == 65535)
		i_1475_ = -1;
	    int i_1476_ = class241_sub3_sub1.readByteC((byte) 92);
	    int i_1477_ = class241_sub3_sub1.getByteA(-2004540171);
	    int i_1478_ = class241_sub3_sub1.readUnsignedLEShort((short) 25974);
	    int i_1479_ = class241_sub3_sub1.readLEInt(-1675214623);
	    int i_1480_ = i_1477_ & 0x7;
	    int i_1481_ = i_1477_ >> 3 & 0xf;
	    if (15 == i_1481_)
		i_1481_ = -1;
	    boolean bool = 1 == (i_1477_ >> 7 & 0x1);
	    if (0 != i_1479_ >> 30) {
		GameScene class522 = client.aClass238_8477.method4806((byte) 1);
		int i_1482_ = i_1479_ >> 28 & 0x3;
		int i_1483_ = ((i_1479_ >> 14 & 0x3fff)
			       - 127679513 * class522.baseX);
		int i_1484_
		    = (i_1479_ & 0x3fff) - 468558693 * class522.baseY;
		if (i_1483_ >= 0 && i_1484_ >= 0
		    && i_1483_ < client.aClass238_8477.method4744(-1581214165)
		    && i_1484_ < client.aClass238_8477.method4745(-1623996768)) {
		    if (i_1475_ == -1) {
			Class241_Sub39_Sub7 class241_sub39_sub7
			    = ((Class241_Sub39_Sub7)
			       client.aClass407_8454.get((long) (i_1483_ << 16
								 | i_1484_)));
			if (class241_sub39_sub7 != null) {
			    ((Class241_Sub39_Sub7) class241_sub39_sub7)
				.aClass475_Sub1_Sub1_Sub5_10856
				.method17935((byte) -11);
			    class241_sub39_sub7.remove((byte) 36);
			}
		    } else {
			int i_1485_ = 256 + 512 * i_1483_;
			int i_1486_ = 256 + i_1484_ * 512;
			int i_1487_ = i_1482_;
			if (i_1487_ < 3
			    && client.aClass238_8477.method4753((byte) -21)
				   .method4331(i_1483_, i_1484_, -894429250))
			    i_1487_++;
			Class475_Sub1_Sub1_Sub5 class475_sub1_sub1_sub5
			    = (new Class475_Sub1_Sub1_Sub5
			       (client.aClass238_8477.method4751(-1220359551),
				i_1475_, i_1478_, i_1482_, i_1487_, i_1485_,
				(Class96_Sub5.method16046(i_1485_, i_1486_,
							  i_1482_, 452340923)
				 - i),
				i_1486_, i_1483_, i_1483_, i_1484_, i_1484_,
				i_1480_, bool, 0));
			client.aClass407_8454.put
			    (new Class241_Sub39_Sub7(class475_sub1_sub1_sub5),
			     (long) (i_1483_ << 16 | i_1484_));
		    }
		}
	    } else if (i_1479_ >> 29 != 0) {
		int i_1488_ = i_1479_ & 0xffff;
		ObjectNode class241_sub26
		    = ((ObjectNode)
		       client.aClass407_8457.get((long) i_1488_));
		if (null != class241_sub26) {
		    NPC class475_sub1_sub1_sub3_sub2
			= ((NPC)
			   class241_sub26.objectValue);
		    RSGraphics class244 = (class475_sub1_sub1_sub3_sub2
					 .aClass244Array11404[i_1476_]);
		    if (65535 == i_1475_)
			i_1475_ = -1;
		    boolean bool_1489_ = true;
		    int i_1490_ = class244.graphicsID * 1967872619;
		    if (-1 != i_1475_ && -1 != i_1490_) {
			if (i_1475_ == i_1490_) {
			    GraphicsDefinition class460
				= Class240.graphicsDefLoader
				      .getGraphicsDefinition(i_1475_, 1232200923);
			    if (class460.aBool6277
				&& class460.anInt6267 * 850723107 != -1) {
				AnimationDefinition class549
				    = (Class394.animationDefLoader.getAnimationDefinition
				       (class460.anInt6267 * 850723107,
					(byte) -113));
				int i_1491_ = class549.anInt7078 * 1834456867;
				if (i_1491_ == 0 || 2 == i_1491_)
				    bool_1489_ = false;
				else if (1 == i_1491_)
				    bool_1489_ = true;
			    }
			} else {
			    GraphicsDefinition class460
				= Class240.graphicsDefLoader
				      .getGraphicsDefinition(i_1475_, 1232200923);
			    GraphicsDefinition class460_1492_
				= Class240.graphicsDefLoader
				      .getGraphicsDefinition(i_1490_, 1232200923);
			    if (class460.anInt6267 * 850723107 != -1
				&& (class460_1492_.anInt6267 * 850723107
				    != -1)) {
				AnimationDefinition class549
				    = (Class394.animationDefLoader.getAnimationDefinition
				       (850723107 * class460.anInt6267,
					(byte) -41));
				AnimationDefinition class549_1493_
				    = (Class394.animationDefLoader.getAnimationDefinition
				       (class460_1492_.anInt6267 * 850723107,
					(byte) -15));
				if (class549.anInt7076 * -397642129
				    < class549_1493_.anInt7076 * -397642129)
				    bool_1489_ = false;
			    }
			}
		    }
		    if (bool_1489_) {
			class244.graphicsID = -1386773949 * i_1475_;
			class244.height = -179650045 * i;
			class244.anInt3938 = i_1481_ * -471497347;
			if (-1 != i_1475_) {
			    GraphicsDefinition class460
				= Class240.graphicsDefLoader
				      .getGraphicsDefinition(i_1475_, 1232200923);
			    int i_1494_ = class460.aBool6277 ? 0 : 2;
			    if (bool)
				i_1494_ = 1;
			    class244.aClass409_3935.method7351
				(850723107 * class460.anInt6267, i_1478_,
				 i_1494_, false, -1302211377);
			} else
			    class244.aClass409_3935.method7347(-1,
							       -1783736281);
		    }
		}
	    } else if (0 != i_1479_ >> 28) {
		int i_1495_ = i_1479_ & 0xffff;
		Player class475_sub1_sub1_sub3_sub1;
		if (i_1495_ == client.myPlayerIndex * 1124115145)
		    class475_sub1_sub1_sub3_sub1
			= Class21.myPlayer;
		else
		    class475_sub1_sub1_sub3_sub1
			= client.localPlayers[i_1495_];
		if (null != class475_sub1_sub1_sub3_sub1) {
		    RSGraphics class244 = (class475_sub1_sub1_sub3_sub1
					 .aClass244Array11404[i_1476_]);
		    if (i_1475_ == 65535)
			i_1475_ = -1;
		    boolean bool_1496_ = true;
		    int i_1497_ = 1967872619 * class244.graphicsID;
		    if (-1 != i_1475_ && i_1497_ != -1) {
			if (i_1497_ == i_1475_) {
			    GraphicsDefinition class460
				= Class240.graphicsDefLoader
				      .getGraphicsDefinition(i_1475_, 1232200923);
			    if (class460.aBool6277
				&& -1 != 850723107 * class460.anInt6267) {
				AnimationDefinition class549
				    = (Class394.animationDefLoader.getAnimationDefinition
				       (850723107 * class460.anInt6267,
					(byte) -85));
				int i_1498_ = 1834456867 * class549.anInt7078;
				if (i_1498_ == 0 || 2 == i_1498_)
				    bool_1496_ = false;
				else if (i_1498_ == 1)
				    bool_1496_ = true;
			    }
			} else {
			    GraphicsDefinition class460
				= Class240.graphicsDefLoader
				      .getGraphicsDefinition(i_1475_, 1232200923);
			    GraphicsDefinition class460_1499_
				= Class240.graphicsDefLoader
				      .getGraphicsDefinition(i_1497_, 1232200923);
			    if (-1 != class460.anInt6267 * 850723107
				&& (850723107 * class460_1499_.anInt6267
				    != -1)) {
				AnimationDefinition class549
				    = (Class394.animationDefLoader.getAnimationDefinition
				       (class460.anInt6267 * 850723107,
					(byte) -40));
				AnimationDefinition class549_1500_
				    = (Class394.animationDefLoader.getAnimationDefinition
				       (850723107 * class460_1499_.anInt6267,
					(byte) -118));
				if (class549.anInt7076 * -397642129
				    < class549_1500_.anInt7076 * -397642129)
				    bool_1496_ = false;
			    }
			}
		    }
		    if (bool_1496_) {
			class244.graphicsID = i_1475_ * -1386773949;
			class244.height = i * -179650045;
			class244.anInt3938 = -471497347 * i_1481_;
			class244.anInt3937 = i_1480_ * 1528521109;
			if (i_1475_ != -1) {
			    GraphicsDefinition class460
				= Class240.graphicsDefLoader
				      .getGraphicsDefinition(i_1475_, 1232200923);
			    int i_1501_ = class460.aBool6277 ? 0 : 2;
			    if (bool)
				i_1501_ = 1;
			    class244.aClass409_3935.method7351
				(850723107 * class460.anInt6267, i_1478_,
				 i_1501_, false, -1302211377);
			} else
			    class244.aClass409_3935.method7347(-1,
							       -1553304554);
		    }
		}
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.CLIENT_SETVARCBIT_SMALL == ((ServerConnection) class190).currentPacket) {
	    byte i = class241_sub3_sub1.readByteA(582493488);
	    int i_1502_ = class241_sub3_sub1.readUnsignedShortA((byte) 25);
	    Class319_Sub1.method16525(1047388312);
	    Class95.setVarcBit(i_1502_, i, 2096986838);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5281) {
	    int i = class241_sub3_sub1.getByteA(-2048489302);
	    if (i == 255)
		i = -1;
	    int i_1503_ = class241_sub3_sub1.readUnsignedShortA((byte) 69);
	    int i_1504_ = class241_sub3_sub1.readUnsignedLEShortA(-577271002);
	    int i_1505_ = class241_sub3_sub1.getByteA(-1930217617);
	    int i_1506_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_1507_ = class241_sub3_sub1.readByteA(582493488);
	    int i_1508_ = class241_sub3_sub1.readUnsignedShortA((byte) 66);
	    int i_1509_ = class241_sub3_sub1.readUnsignedByteS((byte) 78) * 4;
	    int i_1510_ = class241_sub3_sub1.method14822(1849816551);
	    int i_1511_ = class241_sub3_sub1.readUnsignedByte((byte) -8);
	    int i_1512_ = class241_sub3_sub1.readUnsignedLEShort((short) 1914);
	    int i_1513_ = class241_sub3_sub1.readUnsignedLEShortA(-469890283);
	    int i_1514_ = class241_sub3_sub1.readByteA(582493488);
	    int i_1515_ = class241_sub3_sub1.method14667(561795681);
	    boolean bool = (i_1511_ & 0x1) != 0;
	    boolean bool_1516_ = (i_1511_ & 0x2) != 0;
	    int i_1517_ = bool_1516_ ? i_1511_ >> 2 : -1;
	    if (bool_1516_)
		i_1505_ = (byte) i_1505_;
	    else
		i_1505_ *= 4;
	    GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	    int i_1518_ = i_1508_ - class522.baseX * 255359026;
	    int i_1519_ = i_1513_ - class522.baseY * 937117386;
	    i_1514_ += i_1518_;
	    i_1507_ += i_1519_;
	    if (i_1518_ >= 0 && i_1519_ >= 0
		&& i_1518_ < client.aClass238_8477.method4744(-1361755432) * 2
		&& i_1519_ < client.aClass238_8477.method4744(-1397905251) * 2
		&& i_1514_ >= 0 && i_1507_ >= 0
		&& i_1514_ < client.aClass238_8477.method4745(1661349345) * 2
		&& i_1507_ < client.aClass238_8477.method4745(-976979711) * 2
		&& 65535 != i_1506_) {
		i_1518_ = 256 * i_1518_;
		i_1519_ = 256 * i_1519_;
		i_1514_ *= 256;
		i_1507_ *= 256;
		i_1505_ <<= 2;
		i_1509_ <<= 2;
		i_1512_ <<= 2;
		Class329.method6029(i_1506_, i_1510_, i_1515_, i_1517_,
				    i_1505_, i_1509_, i_1518_, i_1519_,
				    i_1514_, i_1507_, i_1504_, i_1503_, i,
				    i_1512_, bool, 0, (short) 16383);
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.CLIENT_SETVARCSTR_SMALL == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedLEShortA(32580777);
	    String string = class241_sub3_sub1.readString(1651445572);
	    Class319_Sub1.method16525(1844896745);
	    Entity.setVarcString(i, string, 1484004327);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5140 == ((ServerConnection) class190).currentPacket) {
	    boolean bool = class241_sub3_sub1.readUnsignedByte((byte) -54) == 1;
	    long l = (long) class241_sub3_sub1.readUnsignedShort(1162222719);
	    long l_1520_ = (long) class241_sub3_sub1.readTriByte(1771646547);
	    long l_1521_ = (l << 32) + l_1520_;
	    boolean bool_1522_ = false;
	    ClanChannel class241_sub6 = (bool ? Class324.mainClanChannel
					   : Class239.guestClanChannel);
	    if (null == class241_sub6)
		bool_1522_ = true;
	    else {
		for (int i = 0; i < 100; i++) {
		    if (client.chatMessageHashes[i] == l_1521_) {
			bool_1522_ = true;
			break;
		    }
		}
	    }
	    if (!bool_1522_) {
		client.chatMessageHashes[963687043 * client.anInt8539] = l_1521_;
		client.anInt8539 = 330738731 * ((1 + client.anInt8539 * 963687043) % 100);
		String string = Class241_Sub47.huffmanDecrypt(class241_sub3_sub1,
							   (byte) 106);
		int i = bool ? 43 : 46;
		Class337.showChatMessage(i, 0, "", "", "", string,
				    class241_sub6.channelName, -1, (byte) 1);
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5294) {
	    Class319_Sub1.method16525(1531143343);
	    HitMarkTypeList.method12294(1448273096);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.SKILLS_PACKET) {
	    int i = class241_sub3_sub1.readByteC((byte) 50);
	    Class227.skillTypeList.method11455(i, 2130716650);
	    int i_1523_ = class241_sub3_sub1.readUnsignedByteS((byte) 18);
	    int i_1524_ = class241_sub3_sub1.readInt((byte) 66);
	    ((Class19) Class1.aClass19_11).skills[i]
		.setExperience(i_1524_, -787336569);
	    ((Class19) Class1.aClass19_11).skills[i]
		.setCurrentLevel(i_1523_, 1469574528);
	    client.skillUpdates[(client.skillUpdatePointer += 1380191559) * 1837993079 - 1 & 0x1f]
		= i;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.IF_SETOBJECT == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedLEShortA(1768054494);
	    int i_1525_ = class241_sub3_sub1.readIntV2(1274614902);
	    int i_1526_ = class241_sub3_sub1.readUnsignedShortA((byte) 42);
	    int i_1527_ = class241_sub3_sub1.readUnsignedShortA((byte) 101);
	    Class319_Sub1.method16525(911746831);
	    Class477.setComponentObject(i_1525_, i_1526_, i_1527_, i, (short) -6671);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5182) {
	    boolean bool = class241_sub3_sub1.readUnsignedByte((byte) -12) == 1;
	    String string = class241_sub3_sub1.readString(586739294);
	    long l = (long) class241_sub3_sub1.readUnsignedShort(1162222719);
	    long l_1528_ = (long) class241_sub3_sub1.readTriByte(1771646547);
	    PlayerRights class328
		= ((PlayerRights)
		   Class531.method11848(VarBitType.method5909(1766317249),
					class241_sub3_sub1
					    .readUnsignedByte((byte) -8),
					524072809));
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    long l_1529_ = (l << 32) + l_1528_;
	    boolean bool_1530_ = false;
	    //Object object = null;
	    ClanChannel class241_sub6 = (bool ? Class324.mainClanChannel
					   : Class239.guestClanChannel);
	while_25_:
	    do {
		if (null == class241_sub6)
		    bool_1530_ = true;
		else {
		    for (int i_1531_ = 0; i_1531_ < 100; i_1531_++) {
			if (l_1529_ == client.chatMessageHashes[i_1531_]) {
			    bool_1530_ = true;
			    break while_25_;
			}
		    }
		    if (class328.ignorable
			&& Class459.isIgnored(string, (byte) -42))
			bool_1530_ = true;
		}
	    } while (false);
	    if (!bool_1530_) {
		client.chatMessageHashes[client.anInt8539 * 963687043] = l_1529_;
		client.anInt8539 = 330738731 * ((1 + 963687043 * client.anInt8539) % 100);
		String string_1532_
		    = Class72.aClass625_1100.list(i, 211080624)
			  .method17177(class241_sub3_sub1, 1485991505);
		int i_1533_ = bool ? 42 : 45;
		if (1247059781 * class328.chatIcon != -1)
		    Class337.showChatMessage(i_1533_, 0,
					new StringBuilder().append
					    (Class475_Sub1_Sub5_Sub1
						 .method17724
					     (class328.chatIcon * 1247059781,
					      2000492269))
					    .append
					    (string).toString(),
					new StringBuilder().append
					    (Class475_Sub1_Sub5_Sub1
						 .method17724
					     (class328.chatIcon * 1247059781,
					      277405651))
					    .append
					    (string).toString(),
					string, string_1532_,
					class241_sub6.channelName, i,
					(byte) 1);
		else
		    Class337.showChatMessage(i_1533_, 0, string, string, string,
					string_1532_,
					class241_sub6.channelName, i,
					(byte) 1);
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5176) {
	    Class402.soundManager.method1215((byte) 0);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.MESSAGE_FRIENDCHANNEL == ((ServerConnection) class190).currentPacket) {
	    boolean bool = class241_sub3_sub1.readUnsignedByte((byte) -61) == 1;
	    String string = class241_sub3_sub1.readString(-1517613671);
	    String string_1534_ = string;
	    if (bool)
		string_1534_ = class241_sub3_sub1.readString(978388878);
	    String string_1535_ = class241_sub3_sub1.readString(-906102804);
	    long l = (long) class241_sub3_sub1.readUnsignedShort(1162222719);
	    long l_1536_ = (long) class241_sub3_sub1.readTriByte(1771646547);
	    PlayerRights class328
		= ((PlayerRights)
		   Class531.method11848(VarBitType.method5909(1766317249),
					class241_sub3_sub1
					    .readUnsignedByte((byte) 79),
					-1931516633));
	    long l_1537_ = l_1536_ + (l << 32);
	    boolean bool_1538_ = false;
	while_26_:
	    do {
		for (int i = 0; i < 100; i++) {
		    if (l_1537_ == client.chatMessageHashes[i]) {
			bool_1538_ = true;
			break while_26_;
		    }
		}
		if (class328.ignorable) {
		    if (client.aBool8441 && !client.aBool8442 || client.isQcWorld)
			bool_1538_ = true;
		    else if (Class459.isIgnored(string_1534_, (byte) -76))
			bool_1538_ = true;
		}
	    } while (false);
	    if (!bool_1538_) {
		client.chatMessageHashes[963687043 * client.anInt8539] = l_1537_;
		client.anInt8539 = 330738731 * ((1 + client.anInt8539 * 963687043) % 100);
		String string_1539_
		    = (Class240.stripCode
		       (Class241_Sub47.huffmanDecrypt(class241_sub3_sub1,
						   (byte) 23),
			417256845));
		if (1247059781 * class328.chatIcon != -1)
		    Class337.showChatMessage(9, 0,
					new StringBuilder().append
					    (Class475_Sub1_Sub5_Sub1
						 .method17724
					     (1247059781 * class328.chatIcon,
					      1412203184))
					    .append
					    (string).toString(),
					new StringBuilder().append
					    (Class475_Sub1_Sub5_Sub1
						 .method17724
					     (1247059781 * class328.chatIcon,
					      1859153971))
					    .append
					    (string_1534_).toString(),
					string, string_1539_, string_1535_, -1,
					(byte) 1);
		else
		    Class337.showChatMessage(9, 0, string, string_1534_, string,
					string_1539_, string_1535_, -1,
					(byte) 1);
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5260) {
	    int i = class241_sub3_sub1.readUnsignedLEShort((short) 26809);
	    Class319_Sub1.method16525(-280124071);
	    Class19.method880(i, (short) -24736);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5149) {
	    int i = class241_sub3_sub1.readLEInt(-1943667815);
	    int i_1540_ = class241_sub3_sub1.readLEInt(-1822673930);
	    Class319_Sub1.method16525(-434987860);
	    InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_1540_, (byte) -85);
	    class58.anInt852 = -1571121665 * i;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.VARCLAN_DISABLE) {
	    Class520.varClanDomain = null;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5129) {
	    String string = class241_sub3_sub1.readString(2082586940);
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    String string_1541_
		= Class72.aClass625_1100.list(i, -895449614)
		      .method17177(class241_sub3_sub1, 1548799315);
	    Class337.showChatMessage(19, 0, string, string, string, string_1541_,
				null, i, (byte) 1);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.LOBBY_LOGOUT_PACKET) {
	    Class362_Sub1.gameLogout(Class13.hasLobby, 193791836);
	    ((ServerConnection) class190).currentPacket = null;
	    return false;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5227) {
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    if (i == 65535)
		i = -1;
	    int i_1542_ = class241_sub3_sub1.readUnsignedByte((byte) -16);
	    int i_1543_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_1544_ = class241_sub3_sub1.readUnsignedByte((byte) 82);
	    int i_1545_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_1546_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    Class221 class221
		= (Class402.soundManager.method1161
		   (Class112.aClass112_1523, Class402.soundManager, i,
		    i_1542_, i_1544_,
		    Class130.aClass130_1597.method3067(-960497231),
		    Class127.aClass127_1587, 0.0F, 0.0F, null, 0, i_1545_,
		    false, 2027274906));
	    if (class221 != null)
		Class402.soundManager.method1231(class221, i_1546_, i_1543_,
						  -971004782);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.ITEMS_PACKET == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_1547_ = class241_sub3_sub1.readUnsignedByte((byte) -54);
	    boolean bool = 1 == (i_1547_ & 0x1);
	    Class230.method4672(i, bool, 16711680);
	    int i_1548_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    for (int i_1549_ = 0; i_1549_ < i_1548_; i_1549_++) {
		int i_1550_ = class241_sub3_sub1.readUnsignedByteS((byte) 29);
		if (255 == i_1550_)
		    i_1550_ = class241_sub3_sub1.readLEInt(1371212505);
		int i_1551_ = class241_sub3_sub1.readUnsignedShort(1162222719);
		ServerConnection.method3910(i, i_1549_, i_1551_ - 1, i_1550_, bool,
				    -880934795);
	    }
	    client.itemContainerUpdates[(client.itemContainerUpdatePointer += 1789825217) * 1774059329 - 1 & 0x1f]
		= i;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.UPDATE_ITEMS_PACKET) {
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_1552_ = class241_sub3_sub1.readUnsignedByte((byte) 54);
	    boolean bool = 1 == (i_1552_ & 0x1);
	    while (421967667 * class241_sub3_sub1.pointer
		   < ((ServerConnection) class190).incommingPacketSize * 1912225577) {
		int i_1553_ = class241_sub3_sub1.readSmart((short) -23717);
		int i_1554_ = class241_sub3_sub1.readUnsignedShort(1162222719);
		int i_1555_ = 0;
		if (i_1554_ != 0) {
		    i_1555_ = class241_sub3_sub1.readUnsignedByte((byte) 2);
		    if (255 == i_1555_)
			i_1555_ = class241_sub3_sub1.readInt((byte) 102);
		}
		ServerConnection.method3910(i, i_1553_, i_1554_ - 1, i_1555_, bool,
				    -1062619788);
	    }
	    client.itemContainerUpdates[(client.itemContainerUpdatePointer += 1789825217) * 1774059329 - 1 & 0x1f]
		= i;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.IF_SETPOSITION == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readShortA(1974597882);
	    int i_1556_ = class241_sub3_sub1.readIntV2(1274614902);
	    int i_1557_ = class241_sub3_sub1.readShort((byte) 76);
	    Class319_Sub1.method16525(-547138112);
	    Class9.setComponentPosition(i_1556_, i, i_1557_, -1319925016);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.IF_SETANIM == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readLEInt(492782217);
	    int i_1558_ = class241_sub3_sub1.readIntV1((short) 27884);
	    Class319_Sub1.method16525(66757973);
	    Class120_Sub2.setComponentAnimation(i_1558_, i, (byte) 5);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5144) {
	    int i = class241_sub3_sub1.readInt((byte) 26);
	    if (Class111.anInt1513 * 1506923943 != i) {
		Class111.anInt1513 = i * 1711374871;
		Class561.method12372(Class614.aClass614_7825, -1, -1,
				     -119982173);
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5133 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    if (65535 == i)
		i = -1;
	    int i_1559_ = class241_sub3_sub1.readUnsignedByte((byte) -17);
	    int i_1560_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_1561_ = class241_sub3_sub1.readUnsignedByte((byte) -1);
	    Class402.soundManager.method1162(Class112.aClass112_1523, i,
					      i_1559_, i_1561_,
					      Class130.aClass130_1603
						  .method3067(-960497231),
					      Class127.aClass127_1587, 0.0F,
					      0.0F, null, 0, 256, i_1560_,
					      -965416740);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5212 == ((ServerConnection) class190).currentPacket) {
	    client.anInt8316
		= class241_sub3_sub1.readShortA(1314598575) * 1620939783;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5163) {
	    int i = class241_sub3_sub1.readUnsignedShortA((byte) 104);
	    int i_1562_ = class241_sub3_sub1.readInt((byte) 109);
	    int i_1563_ = class241_sub3_sub1.readLEInt(952099352);
	    int i_1564_ = class241_sub3_sub1.readInt((byte) 33);
	    int i_1565_ = class241_sub3_sub1.readInt((byte) 90);
	    int i_1566_ = class241_sub3_sub1.readInt((byte) 107);
	    int i_1567_ = class241_sub3_sub1.readUnsignedByteS((byte) 13);
	    int i_1568_ = i_1567_ >> 2;
	    int i_1569_ = i_1567_ & 0x3;
	    GameScene class522
		= new GameScene(class241_sub3_sub1.readIntV2(1274614902));
	    int i_1570_ = class241_sub3_sub1.readByteC((byte) 0);
	    int i_1571_ = class241_sub3_sub1.readIntV1((short) 19567);
	    Class319_Sub1.method16525(1402558300);
	    Class595.method13079
		(i_1565_,
		 new Class241_Sub11_Sub2(i, i_1570_,
					 new Class449(class522, i_1568_,
						      i_1569_, i_1566_)),
		 new int[] { i_1564_, i_1563_, i_1562_, i_1571_ }, false,
		 (byte) 0);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5174) {
	    int i = class241_sub3_sub1.readLEInt(1372811660);
	    int i_1572_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_1573_ = class241_sub3_sub1.readLEInt(977725346);
	    Class319_Sub1.method16525(-698926312);
	    GeneralMapList.setInterfaceModel(i, 5, i_1572_, i_1573_, -1312572939);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5135) {
	    int i = class241_sub3_sub1.readUnsignedByte((byte) 50);
	    Class432 class432
		= ((Class432)
		   Class531.method11848(Class613.method13244((byte) 114), i,
					186671176));
	    if (class432 == null)
		class432 = Class432.aClass432_6107;
	    Class528.method11824(class432, (byte) 43);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5155) {
	    boolean bool = class241_sub3_sub1.readUnsignedByte((byte) -93) == 1;
	    if (bool)
		Class592.method12924(4, -952024573);
	    else
		Class592.method12924(3, -1817958493);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5169 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedByte((byte) -9);
	    int i_1574_ = class241_sub3_sub1.readUnsignedShortA((byte) 69);
	    int i_1575_ = class241_sub3_sub1.readUnsignedByteS((byte) 119);
	    int i_1576_ = class241_sub3_sub1.readUnsignedByteS((byte) 23);
	    int i_1577_ = class241_sub3_sub1.readByteC((byte) 7);
	    Class319_Sub1.method16525(-615862412);
	    client.aBoolArray8517[i] = true;
	    client.anIntArray8367[i] = i_1576_;
	    client.anIntArray8413[i] = i_1577_;
	    client.anIntArray8549[i] = i_1575_;
	    client.anIntArray8550[i] = i_1574_;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.OBJECT_ANIMATION_PACKET) {
	    int i = class241_sub3_sub1.readByteC((byte) 106);
	    int i_1578_ = class241_sub3_sub1.readIntV1((short) 25095);
	    int i_1579_ = class241_sub3_sub1.readByteC((byte) 123);
	    int i_1580_ = i_1579_ >> 2;
	    int i_1581_ = i_1579_ & 0x3;
	    int i_1582_ = client.anIntArray8351[i_1580_];
	    int i_1583_ = class241_sub3_sub1.readLEInt(869669175);
	    int i_1584_ = i_1583_ >> 28 & 0x3;
	    int i_1585_ = i_1583_ >> 14 & 0x3fff;
	    int i_1586_ = i_1583_ & 0x3fff;
	    GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	    i_1585_ -= class522.baseX * 127679513;
	    i_1586_ -= class522.baseY * 468558693;
	    Class462.method10658(i_1584_, i_1585_, i_1586_, i_1582_, i_1580_,
				 i_1581_, i_1578_, i, 1340883407);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5254) {
	    byte i = class241_sub3_sub1.getByte(-492766937);
	    Class21.myPlayer
		.decodeAppearance(class241_sub3_sub1, i, (short) -30651);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5245 == ((ServerConnection) class190).currentPacket) {
	    class241_sub3_sub1.readUnsignedShort(1162222719);
	    class241_sub3_sub1.readUnsignedByte((byte) -4);
	    class241_sub3_sub1.readString(1779204391);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5287 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readByteC((byte) 31);
	    int i_1587_ = class241_sub3_sub1.readUnsignedLEShort((short) 4727);
	    if (i_1587_ == 65535)
		i_1587_ = -1;
	    Class402.soundManager.method1169(i_1587_, i, 102050994);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.MESSAGE_PUBLIC == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    Player class475_sub1_sub1_sub3_sub1;
	    if (client.myPlayerIndex * 1124115145 == i)
		class475_sub1_sub1_sub3_sub1
		    = Class21.myPlayer;
	    else
		class475_sub1_sub1_sub3_sub1
		    = client.localPlayers[i];
	    if (null == class475_sub1_sub1_sub3_sub1) {
		((ServerConnection) class190).currentPacket = null;
		return true;
	    }
	    int i_1588_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    PlayerRights class328
		= ((PlayerRights)
		   Class531.method11848(VarBitType.method5909(1766317249),
					class241_sub3_sub1
					    .readUnsignedByte((byte) 88),
					1572541750));
	    boolean bool = 0 != (i_1588_ & 0x8000);
	    if (class475_sub1_sub1_sub3_sub1.nameUnfiltered != null
		&& class475_sub1_sub1_sub3_sub1.aClass490_11499 != null) {
		boolean bool_1589_ = false;
		if (class328.ignorable) {
		    if (!bool && (client.aBool8441 && !client.aBool8442 || client.isQcWorld))
			bool_1589_ = true;
		    else if (Class459.isIgnored((class475_sub1_sub1_sub3_sub1
						   .nameUnfiltered),
						  (byte) -96))
			bool_1589_ = true;
		}
		if (!bool_1589_) {
		    int i_1590_ = -1;
		    String string;
		    if (bool) {
			i_1588_ &= 0x7fff;
			Class333 class333
			    = Class120_Sub23.method16854(class241_sub3_sub1,
							 -1335109491);
			i_1590_ = -1422545021 * class333.anInt5058;
			string
			    = class333.aClass241_Sub39_Sub9_5059
				  .method17177(class241_sub3_sub1, 1850219252);
		    } else
			string
			    = (Class240.stripCode
			       (Class241_Sub47.huffmanDecrypt(class241_sub3_sub1,
							   (byte) 122),
				417256845));
		    class475_sub1_sub1_sub3_sub1.setOverheadMessage(string.trim(),
							     i_1588_ >> 8,
							     i_1588_ & 0xff,
							     (byte) 29);
		    int i_1591_;
		    if (class328.bypassChatFilter)
			i_1591_ = bool ? 17 : 1;
		    else
			i_1591_ = bool ? 17 : 2;
		    if (-1 != 1247059781 * class328.chatIcon)
			Class337.showChatMessage
			    (i_1591_, 0,
			     new StringBuilder().append
				 (Class475_Sub1_Sub5_Sub1.method17724
				  (class328.chatIcon * 1247059781, 129722100))
				 .append
				 (class475_sub1_sub1_sub3_sub1
				      .getFormattedName(true, -161672003))
				 .toString(),
			     new StringBuilder().append
				 (Class475_Sub1_Sub5_Sub1.method17724
				  (class328.chatIcon * 1247059781, 243948806))
				 .append
				 (class475_sub1_sub1_sub3_sub1
				      .getName(false, -122333825))
				 .toString(),
			     class475_sub1_sub1_sub3_sub1.nameFiltered, string,
			     null, i_1590_, (byte) 1);
		    else
			Class337.showChatMessage
			    (i_1591_, 0,
			     class475_sub1_sub1_sub3_sub1
				 .getFormattedName(true, 285138692),
			     class475_sub1_sub1_sub3_sub1
				 .getName(false, -122333825),
			     class475_sub1_sub1_sub3_sub1.nameFiltered, string,
			     null, i_1590_, (byte) 1);
		}
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5145) {
	    Class216.method4349(class241_sub3_sub1,
				((ServerConnection) class190).incommingPacketSize * 1912225577,
				(byte) 75);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.NPC_UPDATE_PACKET) {
	    Class563.decodeNPCUpdate(false, 1646901438);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5161) {
	    boolean bool = class241_sub3_sub1.readUnsignedByte((byte) -77) == 1;
	    String string = class241_sub3_sub1.readString(22256187);
	    String string_1592_ = string;
	    if (bool)
		string_1592_ = class241_sub3_sub1.readString(-420159623);
	    String string_1593_ = class241_sub3_sub1.readString(-64578904);
	    long l = (long) class241_sub3_sub1.readUnsignedShort(1162222719);
	    long l_1594_ = (long) class241_sub3_sub1.readTriByte(1771646547);
	    PlayerRights class328
		= ((PlayerRights)
		   Class531.method11848(VarBitType.method5909(1766317249),
					class241_sub3_sub1
					    .readUnsignedByte((byte) -39),
					1697959488));
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    long l_1595_ = (l << 32) + l_1594_;
	    boolean bool_1596_ = false;
	while_27_:
	    do {
		for (int i_1597_ = 0; i_1597_ < 100; i_1597_++) {
		    if (client.chatMessageHashes[i_1597_] == l_1595_) {
			bool_1596_ = true;
			break while_27_;
		    }
		}
		if (class328.ignorable
		    && Class459.isIgnored(string_1592_, (byte) -62))
		    bool_1596_ = true;
	    } while (false);
	    if (!bool_1596_) {
		client.chatMessageHashes[client.anInt8539 * 963687043] = l_1595_;
		client.anInt8539 = 330738731 * ((client.anInt8539 * 963687043 + 1) % 100);
		String string_1598_
		    = Class72.aClass625_1100.list(i, 505793531)
			  .method17177(class241_sub3_sub1, 1750703121);
		if (-1 != 1247059781 * class328.chatIcon)
		    Class337.showChatMessage(20, 0,
					new StringBuilder().append
					    (Class475_Sub1_Sub5_Sub1
						 .method17724
					     (1247059781 * class328.chatIcon,
					      1904006920))
					    .append
					    (string).toString(),
					new StringBuilder().append
					    (Class475_Sub1_Sub5_Sub1
						 .method17724
					     (class328.chatIcon * 1247059781,
					      432372852))
					    .append
					    (string_1592_).toString(),
					string, string_1598_, string_1593_, i,
					(byte) 1);
		else
		    Class337.showChatMessage(20, 0, string, string_1592_, string,
					string_1598_, string_1593_, i,
					(byte) 1);
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.UPDATE_RUNENERGY == ((ServerConnection) class190).currentPacket) {
	    client.anInt8470
		= class241_sub3_sub1.readUnsignedByte((byte) -66) * -694893465;
	    client.anInt8271 = -674075855 * client.anInt8494;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.IF_SETTEXT) {
	    int i = class241_sub3_sub1.readIntV2(1274614902);
	    String string = class241_sub3_sub1.readString(320445348);
	    Class319_Sub1.method16525(-402933379);
	    Class552.setIfaceComponentText(i, string, -951385258);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.STATIC_MAP_REGION_PACKET == ((ServerConnection) class190).currentPacket) {
	    RSBitBuffer class241_sub3_sub1_1599_
		= new RSBitBuffer(1912225577
					 * ((ServerConnection) class190).incommingPacketSize);
	    System.arraycopy((((ServerConnection) class190).inputBuffer
			      .payload),
			     (((ServerConnection) class190).inputBuffer
			      .pointer) * 421967667,
			     class241_sub3_sub1_1599_.payload, 0,
			     1912225577 * ((ServerConnection) class190).incommingPacketSize);
	    Class211.method4286((byte) -56);
	    if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub3_8885
		    .method14100((short) -10767)
		== 1)
		Class277.aClass236_4389.method4707
		    (new Class234(MapType.STATIC_MAP,
				  class241_sub3_sub1_1599_),
		     164111949);
	    else
		client.aClass238_8477.setMapScene
		    (new Class234(MapType.STATIC_MAP,
				  class241_sub3_sub1_1599_),
		     1723525519);
	    ((ServerConnection) class190).currentPacket = null;
	    return false;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5207) {
	    if (-1 != client.anInt8466 * 1629309841)
		Class298.method5735(client.anInt8466 * 1629309841, 0, (byte) -125);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5265 == ((ServerConnection) class190).currentPacket) {
	    if (Class442.aBool6160 && Class228.aFrame2674 != null)
		Class537.method11899(Class241_Sub5_Sub9
					 .aClass241_Sub9_11043
					 .aClass445_Sub30_8878
					 .method14386(-801965113),
				     -1, -1, false, 1482319719);
	    byte[] is = new byte[((ServerConnection) class190).incommingPacketSize * 1912225577];
	    class241_sub3_sub1.readEncodeBytes(is, 0,
					   (1912225577
					    * ((ServerConnection) class190).incommingPacketSize),
					   -1392343287);
	    String string
		= Class95.getMessageFromBytes(is, 0,
				     (1912225577
				      * ((ServerConnection) class190).incommingPacketSize),
				     -949072930);
	    Class446.method7895(string, true, client.aBool8440, -1815142638);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5291 == ((ServerConnection) class190).currentPacket) {
	    Class529.decodeWorldUpdatePacket(SubIncommingOpcode.aClass341_5300, -1742268935);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5196 == ((ServerConnection) class190).currentPacket) {
	    String string = class241_sub3_sub1.readString(769293247);
	    OutgoingOpcode.method5024(string, (byte) -22);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5239 == ((ServerConnection) class190).currentPacket) {
	    Class473 class473 = new Class473();
	    boolean bool
		= class473.method10785(class241_sub3_sub1, (short) 465);
	    client.aClass238_8477.method4833(371425712).method11379
		(client.aClass238_8477, bool ? class473 : null,
		 class473.method10828(-270636877), (short) 500);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5293) {
	    int i = class241_sub3_sub1.readIntV1((short) 26174);
	    int i_1600_ = class241_sub3_sub1.readIntV1((short) 4768);
	    Class319_Sub1.method16525(782530732);
	    Class241_Sub11 class241_sub11
		= (Class241_Sub11) client.aClass407_8467.get((long) i);
	    Class241_Sub11 class241_sub11_1601_
		= (Class241_Sub11) client.aClass407_8467.get((long) i_1600_);
	    if (null != class241_sub11_1601_)
		Class40.method1047(class241_sub11_1601_,
				   (class241_sub11 == null
				    || (-443552671 * class241_sub11.interfaceID
					!= (class241_sub11_1601_.interfaceID
					    * -443552671))),
				   false, 1097716233);
	    if (class241_sub11 != null) {
		class241_sub11.remove((byte) 36);
		client.aClass407_8467.put(class241_sub11, (long) i_1600_);
	    }
	    InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i, (byte) -2);
	    if (null != class58)
		WorldType.refreshComponent(class58, 804794824);
	    class58 = Js5ConfigGroup.getInterfaceComponent(i_1600_, (byte) -118);
	    if (null != class58) {
		WorldType.refreshComponent(class58, -1133776815);
		Class380.method6882((Class187.aClass35Array2203
				     [445907013 * class58.componentHash >>> 16]),
				    class58, true, -642919931);
	    }
	    if (-1 != client.anInt8466 * 1629309841)
		Class298.method5735(1629309841 * client.anInt8466, 1, (byte) -121);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.WORLD_TILE_PACKET == ((ServerConnection) class190).currentPacket) {
	    Class65.baseTileX
		= (class241_sub3_sub1.getByte(805824735) << 3) * 360690737;
	    Class323.basePlane
		= class241_sub3_sub1.getByteA(-2069699381) * -1045599855;
	    Class74.baseTileY = (class241_sub3_sub1.readByteA(582493488)
				 << 3) * -771490083;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.VARPBIT_SMALL == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedLEShort((short) 5450);
	    int i_1602_ = class241_sub3_sub1.readUnsignedByteS((byte) 116);
	    Class1.aClass19_11.varPlayerDomain.setVarBit
		(Class541.aClass199_Sub1_7008.list(i, (byte) -41),
		 i_1602_, -1156247217);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5198) {
	    int i = class241_sub3_sub1.readLEInt(-1189672321);
	    Class319_Sub1.method16525(2030169873);
	    GeneralMapList.setInterfaceModel(i, 3, 1124115145 * client.myPlayerIndex, 0, -1037533872);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5219 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readIntV2(1274614902);
	    boolean bool = class241_sub3_sub1.getByteA(-2034516116) == 1;
	    Class319_Sub1.method16525(736989364);
	    Class628_Sub1.method14328(i, bool, (short) 10191);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5280 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readIntV1((short) 21296);
	    int i_1603_ = class241_sub3_sub1.readIntV2(1274614902);
	    int i_1604_ = class241_sub3_sub1.getByteA(-2007762582);
	    int i_1605_ = class241_sub3_sub1.readUnsignedByteS((byte) 108);
	    int i_1606_ = class241_sub3_sub1.getByteA(-2063518691);
	    int i_1607_ = i_1603_ >> 28;
	    int i_1608_ = i_1603_ >> 14 & 0x3fff;
	    int i_1609_ = i_1603_ & 0x3fff;
	    Class402.soundManager.method1170(i, i_1605_, true, i_1607_,
					      i_1608_ << 9, i_1609_ << 9,
					      i_1606_ << 9, i_1604_ << 9,
					      -410530909);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.RESET_CLIENT_VARCACHE) {
	    Class1.aClass19_11.varPlayerDomain.method11638((short) 30428);
	    client.varpChangePointer += 1584994784;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5226) {
	    int i = class241_sub3_sub1.readUnsignedLEShort((short) 26676);
	    Class319_Sub1.method16525(1640137747);
	    Class578.method12700(i, 2076462364);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.SET_CAMERA_POS_PACKET == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedLEShort((short) 15017) << 2;
	    int i_1610_ = class241_sub3_sub1.getByteA(-2116102484);
	    int i_1611_ = class241_sub3_sub1.readByteC((byte) 32);
	    int i_1612_ = class241_sub3_sub1.readUnsignedByteS((byte) 103);
	    int i_1613_ = class241_sub3_sub1.getByteA(-2066740314);
	    Class319_Sub1.method16525(2055425030);
	    Class336.method6081(i_1610_, i_1613_, i, i_1611_, i_1612_, true,
				(byte) -14);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5221 == ((ServerConnection) class190).currentPacket) {
	    Class402.soundManager.method1153(Class130.aClass130_1603
						  .method3067(-960497231),
					      -2038907836);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.RUNCLIENTSCRIPT == ((ServerConnection) class190).currentPacket) {
	    String string = class241_sub3_sub1.readString(864552275);
	    Object[] objects = new Object[string.length() + 1];
	    for (int i = string.length() - 1; i >= 0; i--) {
		if (string.charAt(i) == 's')
		    objects[1 + i]
			= class241_sub3_sub1.readString(-1520468822);
		else
		    objects[i + 1] = new Integer(class241_sub3_sub1
						     .readInt((byte) 73));
	    }
	    objects[0]
		= new Integer(class241_sub3_sub1.readInt((byte) 106));
	    Class319_Sub1.method16525(1880978964);
	    ClientScriptCaller class241_sub14 = new ClientScriptCaller();
	    class241_sub14.paramaters = objects;
	    Class42.method1067(class241_sub14, 1668819662);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5217) {
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    Class402.soundManager.method1146(i, -442923055);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.CLANCHANNEL_DELTA == ((ServerConnection) class190).currentPacket) {
	    client.lastClanChannelUpdate = client.anInt8494 * -1710652333;
	    boolean bool = class241_sub3_sub1.readUnsignedByte((byte) -88) == 1;
	    ClanChannelDelta class383 = new ClanChannelDelta(class241_sub3_sub1);
	    ClanChannel class241_sub6;
	    if (bool)
		class241_sub6 = Class324.mainClanChannel;
	    else
		class241_sub6 = Class239.guestClanChannel;
	    class383.applyToClanChannel(class241_sub6, -245903231);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5187) {
	    Class445_Sub16.aClass351_Sub1_8660.method16834
		(class241_sub3_sub1,
		 1912225577 * ((ServerConnection) class190).incommingPacketSize, (short) -21667);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.IF_OPENSUB_ACTIVE_PLAYER) {
	    int i = class241_sub3_sub1.readIntV1((short) 5141);
	    int i_1614_ = class241_sub3_sub1.readByteC((byte) 59);
	    int i_1615_ = class241_sub3_sub1.readIntV2(1274614902);
	    int i_1616_ = class241_sub3_sub1.readLEInt(-1934001391);
	    int i_1617_ = class241_sub3_sub1.readIntV2(1274614902);
	    int i_1618_ = class241_sub3_sub1.readUnsignedLEShortA(-572700721);
	    int i_1619_ = class241_sub3_sub1.readIntV2(1274614902);
	    int i_1620_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    Class319_Sub1.method16525(-133727252);
	    Class595.method13079(i_1615_,
				 new Class241_Sub11_Sub4(i_1620_, i_1614_,
							 i_1618_),
				 new int[] { i_1619_, i_1617_, i, i_1616_ },
				 false, (byte) 0);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.FRIENDS_CHANNEL_UPDATE_PACKET) {
	    String string = class241_sub3_sub1.readString(751803488);
	    boolean bool = class241_sub3_sub1.readUnsignedByte((byte) 65) == 1;
	    String string_1621_;
	    if (bool)
		string_1621_ = class241_sub3_sub1.readString(1271772237);
	    else
		string_1621_ = string;
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    byte i_1622_ = class241_sub3_sub1.getByte(906654825);
	    boolean bool_1623_ = false;
	    if (i_1622_ == -128)
		bool_1623_ = true;
	    if (bool_1623_) {
		if (0 == -612332369 * Class357_Sub1.currentFcSize) {
		    ((ServerConnection) class190).currentPacket = null;
		    return true;
		}
		//boolean bool_1624_ = false;
		int i_1625_;
		for (i_1625_ = 0;
		     (i_1625_ < Class357_Sub1.currentFcSize * -612332369
		      && (!Class350.currentFcUsers[i_1625_].replyToName
			       .equals(string_1621_)
			  || i != 1494319203 * (Class350.currentFcUsers
						[i_1625_].nodeID)));
		     i_1625_++) {
		    /* empty */
		}
		if (i_1625_ < Class357_Sub1.currentFcSize * -612332369) {
		    for (/**/;
			 i_1625_ < -612332369 * Class357_Sub1.currentFcSize - 1;
			 i_1625_++)
			Class350.currentFcUsers[i_1625_]
			    = Class350.currentFcUsers[i_1625_ + 1];
		    Class357_Sub1.currentFcSize -= 1584810575;
		    Class350.currentFcUsers[(-612332369
						 * Class357_Sub1.currentFcSize)]
			= null;
		}
	    } else {
		String string_1626_
		    = class241_sub3_sub1.readString(-1222328529);
		FriendsChatUser class197 = new FriendsChatUser();
		class197.displayName = string;
		class197.replyToName = string_1621_;
		((FriendsChatUser) class197).protocolName
		    = Class482.formatStringForProtocol(class197.replyToName,
					   Class524.aClass600_6822, (byte) 19);
		class197.nodeID = 752157003 * i;
		class197.rank = i_1622_;
		class197.worldName = string_1626_;
		int i_1627_;
		for (i_1627_ = Class357_Sub1.currentFcSize * -612332369 - 1;
		     i_1627_ >= 0; i_1627_--) {
		    int i_1628_
			= ((FriendsChatUser) Class350.currentFcUsers[i_1627_])
			      .protocolName
			      .compareTo(((FriendsChatUser) class197).protocolName);
		    if (0 == i_1628_) {
			Class350.currentFcUsers[i_1627_].nodeID
			    = i * 752157003;
			Class350.currentFcUsers[i_1627_].rank
			    = i_1622_;
			Class350.currentFcUsers[i_1627_].worldName
			    = string_1626_;
			if (string_1621_.equals
			    (Class21.myPlayer
			     .nameUnfiltered))
			    NPC.myCurrentFcRank = i_1622_;
			client.lastFriendsChatUpdate = client.anInt8494 * -1375606821;
			((ServerConnection) class190).currentPacket = null;
			return true;
		    }
		    if (i_1628_ < 0)
			break;
		}
		if (Class357_Sub1.currentFcSize * -612332369
		    >= Class350.currentFcUsers.length) {
		    ((ServerConnection) class190).currentPacket = null;
		    return true;
		}
		for (int i_1629_ = -612332369 * Class357_Sub1.currentFcSize - 1;
		     i_1629_ > i_1627_; i_1629_--)
		    Class350.currentFcUsers[i_1629_ + 1]
			= Class350.currentFcUsers[i_1629_];
		if (0 == -612332369 * Class357_Sub1.currentFcSize)
		    Class350.currentFcUsers = new FriendsChatUser[100];
		Class350.currentFcUsers[i_1627_ + 1] = class197;
		Class357_Sub1.currentFcSize += 1584810575;
		if (string_1621_.equals(Class21
					.myPlayer
					.nameUnfiltered))
		    NPC.myCurrentFcRank = i_1622_;
	    }
	    client.lastFriendsChatUpdate = -1375606821 * client.anInt8494;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.VARCLAN_ENABLE == ((ServerConnection) class190).currentPacket) {
	    Class520.varClanDomain
		= new SparseVarDomain(Class443.VAR_CLAN_LIST);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5147 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedByte((byte) 29);
	    int i_1630_ = class241_sub3_sub1.readBigSmart((byte) -36);
	    if (null != client.aClass246Array8302[i]) {
		client.aClass246Array8302[i].method4935(client.aClass238_8477
						     .method4751(-1007468439),
						 -2074616993);
		client.aClass246Array8302[i] = null;
	    }
	    if (-1 != i_1630_)
		client.aClass246Array8302[i]
		    = new Class246(Class236.aClass103_2713, class241_sub3_sub1,
				   i_1630_);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5200 == ((ServerConnection) class190).currentPacket) {
	    Class529.decodeWorldUpdatePacket(SubIncommingOpcode.aClass341_5302, -2121860966);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.IF_CLOSESUB == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readIntV1((short) 7448);
	    Class319_Sub1.method16525(-434653913);
	    Class241_Sub11 class241_sub11
		= (Class241_Sub11) client.aClass407_8467.get((long) i);
	    if (class241_sub11 != null)
		Class40.method1047(class241_sub11, true, false, -58077384);
	    if (client.aClass58_8384 != null) {
		WorldType.refreshComponent(client.aClass58_8384, 1750895331);
		client.aClass58_8384 = null;
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.MESSAGE_PRIVATE_ECHO == ((ServerConnection) class190).currentPacket) {
	    String string = class241_sub3_sub1.readString(1064153116);
	    String string_1631_
		= (Class240.stripCode
		   (Class241_Sub47.huffmanDecrypt(class241_sub3_sub1, (byte) 38),
		    417256845));
	    Class318.appendChatboxMessage(6, 0, string, string, string, string_1631_,
				-2069870538);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.IF_SETSCROLLPOS) {
	    int i = class241_sub3_sub1.readIntV2(1274614902);
	    int i_1632_ = class241_sub3_sub1.readUnsignedShortA((byte) 105);
	    Class319_Sub1.method16525(229054654);
	    Class456.setComponentScroll(i, i_1632_, 459109515);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.PLAYER_UPDATE_PACKET) {
	    ClientScriptMap.decodePlayerUpdates(class241_sub3_sub1,
				1912225577 * ((ServerConnection) class190).incommingPacketSize,
				-1078399953);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5143 == ((ServerConnection) class190).currentPacket) {
	    Class529.decodeWorldUpdatePacket(SubIncommingOpcode.aClass341_5301, -1745415905);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5206) {
	    class241_sub3_sub1.pointer += -1889333388;
	    if (class241_sub3_sub1.method14669(-625753720))
		Class611.method13229(class241_sub3_sub1,
				     (421967667 * class241_sub3_sub1.pointer
				      - 28),
				     (byte) 2);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.CLANCHANNEL_FULL) {
	    client.lastClanChannelUpdate = -1710652333 * client.anInt8494;
	    boolean bool = class241_sub3_sub1.readUnsignedByte((byte) 20) == 1;
	    if (((ServerConnection) class190).incommingPacketSize * 1912225577 == 1) {
		if (bool)
		    Class324.mainClanChannel = null;
		else
		    Class239.guestClanChannel = null;
		((ServerConnection) class190).currentPacket = null;
		return true;
	    }
	    if (bool)
		Class324.mainClanChannel
		    = new ClanChannel(class241_sub3_sub1);
	    else
		Class239.guestClanChannel
		    = new ClanChannel(class241_sub3_sub1);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5242) {
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_1633_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_1634_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    Class402.soundManager.method1174(i, i_1633_, i_1634_, 667679153);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.VARPBIT_LARGE == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedLEShortA(602764467);
	    int i_1635_ = class241_sub3_sub1.readIntV2(1274614902);
	    Class1.aClass19_11.varPlayerDomain.setVarBit
		(Class541.aClass199_Sub1_7008.list(i, (byte) -25),
		 i_1635_, -838678018);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.INTERFACE_SETTINGS_PACKET == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readIntV1((short) 30934);
	    int i_1636_ = class241_sub3_sub1.readUnsignedShortA((byte) 69);
	    if (i_1636_ == 65535)
		i_1636_ = -1;
	    int i_1637_ = class241_sub3_sub1.readUnsignedShortA((byte) 81);
	    if (i_1637_ == 65535)
		i_1637_ = -1;
	    int i_1638_ = class241_sub3_sub1.readIntV2(1274614902);
	    Class319_Sub1.method16525(1976249009);
	    for (int i_1639_ = i_1637_; i_1639_ <= i_1636_; i_1639_++) {
		long l = ((long) i << 32) + (long) i_1639_;
		Class241_Sub20 class241_sub20
		    = (Class241_Sub20) client.aClass407_8519.get(l);
		Class241_Sub20 class241_sub20_1640_;
		if (null == class241_sub20) {
		    if (-1 == i_1639_)
			class241_sub20_1640_
			    = new Class241_Sub20(i_1638_,
						 (Js5ConfigGroup.getInterfaceComponent
						  (i, (byte) -90)
						  .aClass241_Sub20_922
						  .anInt9008) * -1892353525);
		    else
			class241_sub20_1640_ = new Class241_Sub20(i_1638_, -1);
		} else {
		    class241_sub20_1640_
			= new Class241_Sub20(i_1638_, (class241_sub20.anInt9008
						       * -1892353525));
		    class241_sub20.remove((byte) 36);
		}
		client.aClass407_8519.put(class241_sub20_1640_, l);
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5199) {
	    int i = class241_sub3_sub1.readLEInt(-963287356);
	    Class319_Sub1.method16525(189852693);
	    if (i == -1) {
		Class245.anInt3961 = -1540801703;
		Class254.anInt4134 = -162819257;
	    } else {
		GameScene class522 = client.aClass238_8477.method4806((byte) 1);
		int i_1641_ = i >> 14 & 0x3fff;
		int i_1642_ = i & 0x3fff;
		i_1641_ -= 127679513 * class522.baseX;
		if (i_1641_ < 0)
		    i_1641_ = 0;
		else if (i_1641_ >= client.aClass238_8477.method4744(-1392398759))
		    i_1641_ = client.aClass238_8477.method4744(-1451851070);
		i_1642_ -= class522.baseY * 468558693;
		if (i_1642_ < 0)
		    i_1642_ = 0;
		else if (i_1642_ >= client.aClass238_8477.method4745(-1627273874))
		    i_1642_ = client.aClass238_8477.method4745(1599814346);
		Class245.anInt3961 = (256 + (i_1641_ << 9)) * 1540801703;
		Class254.anInt4134 = 162819257 * ((i_1642_ << 9) + 256);
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5257) {
	    Class529.decodeWorldUpdatePacket(SubIncommingOpcode.aClass341_5310, -1808856177);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.SYSTEM_UPDATE_PACKET == ((ServerConnection) class190).currentPacket) {
	    if (Class523.method11733(client.anInt8288 * 1766317249, 838604692))
		client.systemUpdateTimer
		    = (int) ((float) class241_sub3_sub1.readUnsignedShort(1162222719)
			     * 2.5F) * -1917854577;
	    else
		client.systemUpdateTimer
		    = class241_sub3_sub1.readUnsignedShort(1162222719) * -1701062462;
	    client.anInt8271 = -674075855 * client.anInt8494;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5214 == ((ServerConnection) class190).currentPacket) {
	    client.aBool8444 = class241_sub3_sub1.readUnsignedByte((byte) -59) == 1;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5142) {
	    Class74.baseTileY
		= (class241_sub3_sub1.readByteS((byte) 1) << 3) * -771490083;
	    Class65.baseTileX
		= (class241_sub3_sub1.readByteS((byte) 1) << 3) * 360690737;
	    Class323.basePlane
		= class241_sub3_sub1.getByteA(-2057713389) * -1045599855;
	    GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	    for (WorldTile class241_sub44
		     = (WorldTile) client.aClass407_8452.method7294(2090894173);
		 class241_sub44 != null;
		 class241_sub44 = ((WorldTile)
				   client.aClass407_8452.method7295(1038899481))) {
		int i = (int) ((4356572401218184725L * class241_sub44.hashCode
				>> 28)
			       & 0x3L);
		int i_1643_
		    = (int) (class241_sub44.hashCode * 4356572401218184725L
			     & 0x3fffL);
		int i_1644_ = i_1643_ - class522.baseX * 127679513;
		int i_1645_
		    = (int) ((class241_sub44.hashCode * 4356572401218184725L
			      >> 14)
			     & 0x3fffL);
		int i_1646_ = i_1645_ - 468558693 * class522.baseY;
		if (Class323.basePlane * 1061320561 == i
		    && i_1644_ >= -585685807 * Class65.baseTileX
		    && i_1644_ < -585685807 * Class65.baseTileX + 8
		    && i_1646_ >= Class74.baseTileY * 902154613
		    && i_1646_ < 8 + 902154613 * Class74.baseTileY) {
		    class241_sub44.remove((byte) 36);
		    if (i_1644_ >= 0 && i_1646_ >= 0
			&& i_1644_ < client.aClass238_8477.method4744(-1993969056)
			&& i_1646_ < client.aClass238_8477.method4745(1532505675))
			Class39.method1041(Class323.basePlane * 1061320561,
					   i_1644_, i_1646_, -383101445);
		}
	    }
	    for (WorldObject class241_sub30
		     = ((WorldObject)
			WorldObject.aClass429_10039.method7694(16711935));
		 class241_sub30 != null;
		 class241_sub30
		     = (WorldObject) WorldObject.aClass429_10039
					    .method7692(1210000107)) {
		if ((1204421839 * class241_sub30.posX
		     >= Class65.baseTileX * -585685807)
		    && (class241_sub30.posX * 1204421839
			< 8 + -585685807 * Class65.baseTileX)
		    && (-320018831 * class241_sub30.posY
			>= 902154613 * Class74.baseTileY)
		    && (-320018831 * class241_sub30.posY
			< 902154613 * Class74.baseTileY + 8)
		    && (1061320561 * Class323.basePlane
			== (-603972145
			    * ((WorldObject) class241_sub30).plane)))
		    ((WorldObject) class241_sub30).aBool10046 = true;
	    }
	    for (WorldObject class241_sub30
		     = ((WorldObject)
			WorldObject.aClass429_10053.method7694(16711935));
		 class241_sub30 != null;
		 class241_sub30
		     = (WorldObject) WorldObject.aClass429_10053
					    .method7692(546446207)) {
		if ((1204421839 * class241_sub30.posX
		     >= -585685807 * Class65.baseTileX)
		    && (1204421839 * class241_sub30.posX
			< 8 + -585685807 * Class65.baseTileX)
		    && (-320018831 * class241_sub30.posY
			>= 902154613 * Class74.baseTileY)
		    && (-320018831 * class241_sub30.posY
			< 8 + Class74.baseTileY * 902154613)
		    && (Class323.basePlane * 1061320561
			== (-603972145
			    * ((WorldObject) class241_sub30).plane)))
		    ((WorldObject) class241_sub30).aBool10046 = true;
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.DYNAMIC_MAP_REGION_PACKET == ((ServerConnection) class190).currentPacket) {
	    RSBitBuffer class241_sub3_sub1_1647_
		= new RSBitBuffer(((ServerConnection) class190).incommingPacketSize
					 * 1912225577);
	    System.arraycopy((((ServerConnection) class190).inputBuffer
			      .payload),
			     (((ServerConnection) class190).inputBuffer
			      .pointer) * 421967667,
			     class241_sub3_sub1_1647_.payload, 0,
			     1912225577 * ((ServerConnection) class190).incommingPacketSize);
	    Class211.method4286((byte) 15);
	    if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub3_8885
		    .method14100((short) -6465)
		== 1)
		Class277.aClass236_4389.method4707
		    (new Class234(MapType.aClass235_2703,
				  class241_sub3_sub1_1647_),
		     29554345);
	    else
		client.aClass238_8477.setMapScene
		    (new Class234(MapType.aClass235_2703,
				  class241_sub3_sub1_1647_),
		     2020048049);
	    ((ServerConnection) class190).currentPacket = null;
	    return false;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5203) {
	    int i = class241_sub3_sub1.readUnsignedLEShort((short) 2197);
	    int i_1648_ = class241_sub3_sub1.readLEInt(1091789088);
	    int i_1649_ = class241_sub3_sub1.readInt((byte) 28);
	    Class319_Sub1.method16525(510444462);
	    GeneralMapList.setInterfaceModel(i_1649_, 3, i, i_1648_, -1665279576);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5278 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedByte((byte) 48);
	    if (class241_sub3_sub1.readUnsignedByte((byte) -8) == 0)
		client.aClass220Array8426[i] = new Class220();
	    else {
		class241_sub3_sub1.pointer -= -681042949;
		client.aClass220Array8426[i] = new Class220(class241_sub3_sub1, null);
	    }
	    client.anInt8514 = 684986005 * client.anInt8494;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.CLANSETTINGS_FULL == ((ServerConnection) class190).currentPacket) {
	    client.lastClanSettingsUpdate = 603265577 * client.anInt8494;
	    boolean bool = class241_sub3_sub1.readUnsignedByte((byte) -19) == 1;
	    if (1 == 1912225577 * ((ServerConnection) class190).incommingPacketSize) {
		if (bool)
		    GraphicsDefinitionLoader.mainClanSettings = null;
		else
		    Class24.guestClanSettings = null;
		((ServerConnection) class190).currentPacket = null;
		return true;
	    }
	    if (bool)
		GraphicsDefinitionLoader.mainClanSettings = new ClanSettings(class241_sub3_sub1);
	    else
		Class24.guestClanSettings = new ClanSettings(class241_sub3_sub1);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.IF_SETPLAYERHEAD == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readIntV2(1274614902);
	    Class319_Sub1.method16525(1110019522);
	    GeneralMapList.setInterfaceModel(i, 5, 1124115145 * client.myPlayerIndex, 0, -1118582551);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5173) {
	    int i = class241_sub3_sub1.readUnsignedShortA((byte) 86);
	    int i_1650_ = class241_sub3_sub1.readUnsignedByte((byte) -62);
	    int i_1651_ = class241_sub3_sub1.readInt((byte) 21);
	    int i_1652_ = class241_sub3_sub1.readShort((byte) 91);
	    ObjectNode class241_sub26
		= (ObjectNode) client.aClass407_8457.get((long) i);
	    if (class241_sub26 != null) {
		NPC class475_sub1_sub1_sub3_sub2
		    = ((NPC)
		       class241_sub26.objectValue);
		if (class475_sub1_sub1_sub3_sub2.aClass400_11529 == null)
		    class475_sub1_sub1_sub3_sub2.aClass400_11529
			= new Class400(class475_sub1_sub1_sub3_sub2
				       .definition);
		class475_sub1_sub1_sub3_sub2.aClass400_11529.anIntArray5797
		    [i_1650_]
		    = i_1651_;
		class475_sub1_sub1_sub3_sub2.aClass400_11529
		    .aShortArray5796[i_1650_]
		    = (short) i_1652_;
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5177 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.getByteA(-2136558736);
	    int i_1653_ = class241_sub3_sub1.readUnsignedLEShortA(515464942);
	    Class319_Sub1.method16525(-25440150);
	    Class270.method5303(i_1653_, i, true, (byte) 63);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5271 == ((ServerConnection) class190).currentPacket) {
	    Class518.method11663(905297208);
	    ((ServerConnection) class190).currentPacket = null;
	    return false;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5205) {
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    Class402.soundManager.method1224(i, -1041268341);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5267) {
	    Class529.decodeWorldUpdatePacket(SubIncommingOpcode.aClass341_5307, -2009268469);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.PLAYER_OPTION_PACKET) {
	    int i = class241_sub3_sub1.readByteC((byte) 19);
	    String string = class241_sub3_sub1.readString(-652349961);
	    int i_1654_ = class241_sub3_sub1.getByteA(-2122315675);
	    int i_1655_ = class241_sub3_sub1.readUnsignedLEShortA(969405723);
	    if (65535 == i_1655_)
		i_1655_ = -1;
	    if (i_1654_ >= 1 && i_1654_ <= 8) {
		if (string.equalsIgnoreCase("null"))
		    string = null;
		client.playerOptionMessages[i_1654_ - 1] = string;
		client.playerOptionCursors[i_1654_ - 1] = i_1655_;
		client.aBoolArray8450[i_1654_ - 1] = 0 == i;
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.TILE_MESSAGE_PACKET == ((ServerConnection) class190).currentPacket) {
	    Class529.decodeWorldUpdatePacket(SubIncommingOpcode.TILE_MESSAGE, -2036503124);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5270 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    Class402.soundManager.method1147(i, 1043305617);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5289 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    client.anInt8332 = -1905889125;
	    client.anInt8352 = 504628557 * i;
	    client.anInt8266 = 0;
	    Class112.aClass210_1527.method4250(2040707973 * client.anInt8352,
					       1454056964);
	    Class198.method4036((byte) 4);
	    Class274.method5345(-19231847);
	    int i_1656_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    client.anInt8357 = 654027789 * i_1656_;
	    int i_1657_ = class241_sub3_sub1.readUnsignedByte((byte) -1);
	    HitMarkType.aClass241_Sub3_7297 = new RSByteBuffer(i_1657_);
	    HitMarkType.aClass241_Sub3_7297.writeBytes
		(class241_sub3_sub1.payload,
		 class241_sub3_sub1.pointer * 421967667, i_1657_, 752061035);
	    class241_sub3_sub1.pointer += i_1657_ * -681042949;
	    ((ServerConnection) class190).currentPacket = null;
	    return false;
	}
	if (IncommingOpcode.aClass340_5148 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readInt((byte) 119);
	    int i_1658_ = class241_sub3_sub1.readLEInt(312533871);
	    Class319_Sub1.method16525(209415210);
	    GeneralMapList.setInterfaceModel(i_1658_, 1, i, -1, -1344872558);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5216) {
	    Class203.anInt2425
		= class241_sub3_sub1.method14643((byte) -45) * 1122928185;
	    client.aBool8441 = class241_sub3_sub1.readUnsignedByte((byte) -42) == 1;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5244) {
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    String string = class241_sub3_sub1.readString(234500071);
	    boolean bool = class241_sub3_sub1.readUnsignedByte((byte) 14) == 1;
	    Class395.aClass397_5775 = Class193.aClass397_2297;
	    Class474.aBool6385 = bool;
	    ClanSettings.method6718(i, string, (byte) 0);
	    //Object object = null;
	    Class496.setClientStage(6, (byte) -51);
	    ((ServerConnection) class190).currentPacket = null;
	    return false;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.FULL_LOGOUT_PACKET) {
	    Class362_Sub1.gameLogout(false, 731718985);
	    ((ServerConnection) class190).currentPacket = null;
	    return false;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.MINIMAP_FLAG_PACKET) {
	    int i = class241_sub3_sub1.readUnsignedByte((byte) 79);
	    int i_1659_ = class241_sub3_sub1.readUnsignedByteS((byte) 93);
	    if (i_1659_ == 255) {
		i_1659_ = -1;
		i = -1;
	    }
	    Class43.setMinimapFlag(i_1659_, i, (byte) 40);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.VARP_LARGE) {
	    int i = class241_sub3_sub1.readUnsignedLEShortA(703396900);
	    int i_1660_ = class241_sub3_sub1.readInt((byte) 114);
	    Class1.aClass19_11.varPlayerDomain.setVarp
		(Class177.VAR_PLAYER_LIST.list(i, -1492856330),
		 i_1660_, (byte) 127);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.ADD_GROUND_ITEM_PACKET) {
	    Class529.decodeWorldUpdatePacket(SubIncommingOpcode.ADD_GROUND_ITEM, -2058671370);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.UPDATE_WORLD_TILE_PACKET) {
	    Class323.basePlane
		= class241_sub3_sub1.readUnsignedByte((byte) -1) * -1045599855;
	    Class74.baseTileY = (class241_sub3_sub1.getByteC(537746309)
				 << 3) * -771490083;
	    Class65.baseTileX = (class241_sub3_sub1.getByte(-513986007)
				 << 3) * 360690737;
	    while (class241_sub3_sub1.pointer * 421967667
		   < ((ServerConnection) class190).incommingPacketSize * 1912225577) {
		SubIncommingOpcode class341
		    = (CsDelta_SetVarInt.method17454(-641059314)
		       [class241_sub3_sub1.readUnsignedByte((byte) 76)]);
		Class529.decodeWorldUpdatePacket(class341, -2137350566);
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5264) {
	    int[] is = new int[4];
	    for (int i = 0; i < 4; i++)
		is[i] = class241_sub3_sub1.readIntV2(1274614902);
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_1661_ = class241_sub3_sub1.getByteA(-1993669547);
	    ObjectNode class241_sub26
		= (ObjectNode) client.aClass407_8457.get((long) i);
	    if (null != class241_sub26)
		Class638.method13557(((Entity)
				      class241_sub26.objectValue),
				     is, i_1661_, true, (byte) 29);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.CLANSETTINGS_DELTA == ((ServerConnection) class190).currentPacket) {
	    client.lastClanSettingsUpdate = 603265577 * client.anInt8494;
	    boolean bool = class241_sub3_sub1.readUnsignedByte((byte) -21) == 1;
	    ClanSettingsDelta class378 = new ClanSettingsDelta(class241_sub3_sub1);
	    ClanSettings class374;
	    if (bool)
		class374 = GraphicsDefinitionLoader.mainClanSettings;
	    else
		class374 = Class24.guestClanSettings;
	    class378.applyToClanSettings(class374, (byte) 13);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5240 == ((ServerConnection) class190).currentPacket) {
	    String string = class241_sub3_sub1.readString(201323285);
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    Class395.aClass397_5773.aString5786 = string;
	    Class395.aClass397_5773.nodeID = 1167304829 * i;
	    Class81.method1815(862818372);
	    Class120_Sub15.aClass207_10542.method4095
		(Class395.aClass397_5773.aString5786,
		 Class395.aClass397_5773.method7112(328680574), 143812545);
	    Class281.aClass280_4428.method5479(-1993831152);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.LARGE_NPC_UPDATE_PACKET == ((ServerConnection) class190).currentPacket) {
	    Class563.decodeNPCUpdate(true, 702582154);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5168 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readByteC((byte) 113);
	    int i_1662_ = class241_sub3_sub1.readUnsignedLEShort((short) 714) << 2;
	    int i_1663_ = class241_sub3_sub1.readByteC((byte) 91);
	    int i_1664_ = class241_sub3_sub1.getByteA(-2012942741);
	    int i_1665_ = class241_sub3_sub1.readByteC((byte) 90);
	    Class319_Sub1.method16525(1674584692);
	    Class247.method4950(i_1663_, i_1665_, i_1662_, i, i_1664_,
				(byte) -37);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.IF_OPENSUB_ACTIVE_OBJ == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readIntV2(1274614902);
	    int i_1666_ = class241_sub3_sub1.readLEInt(-2076214582);
	    GameScene class522
		= new GameScene(class241_sub3_sub1.readInt((byte) 87));
	    int i_1667_ = class241_sub3_sub1.readUnsignedLEShort((short) 5626);
	    int i_1668_ = class241_sub3_sub1.readInt((byte) 71);
	    int i_1669_ = class241_sub3_sub1.readLEInt(-1798172260);
	    int i_1670_ = class241_sub3_sub1.readUnsignedByte((byte) -40);
	    int i_1671_ = class241_sub3_sub1.readUnsignedLEShort((short) 29987);
	    int i_1672_ = class241_sub3_sub1.readInt((byte) 93);
	    Class319_Sub1.method16525(1874617837);
	    Class595.method13079
		(i_1672_,
		 new Class241_Sub11_Sub3(i_1671_, i_1670_,
					 new Class440(class522, i_1667_)),
		 new int[] { i_1669_, i_1668_, i_1666_, i }, false, (byte) 0);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5220) {
	    byte[] is = new byte[((ServerConnection) class190).incommingPacketSize * 1912225577];
	    class241_sub3_sub1.readEncodeBytes(is, 0,
					   (1912225577
					    * ((ServerConnection) class190).incommingPacketSize),
					   -1656381474);
	    String string
		= Class95.getMessageFromBytes(is, 0, (((ServerConnection) class190).incommingPacketSize
					     * 1912225577), -949072930);
	    if (client.aBool8267) {
		try {
		    JSFunction.aClass348_5366.method6209(new Object[] { string },
						       -1720001637);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.KEEP_ALIVE_PACKET) {
	    ((ServerConnection) class190).currentPacket = null;
	    return false;
	}
	if (IncommingOpcode.IF_SETCOLOUR == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readInt((byte) 8);
	    int i_1673_ = class241_sub3_sub1.readUnsignedShortA((byte) 36);
	    Class319_Sub1.method16525(1202535490);
	    Class499.setComponentColour(i, i_1673_, 1315489916);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5285 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readByteC((byte) 122);
	    int i_1674_ = class241_sub3_sub1.readUnsignedShortA((byte) 24);
	    int i_1675_ = class241_sub3_sub1.readUnsignedLEShortA(1751651389);
	    int i_1676_ = class241_sub3_sub1.readLEInt(1400164958);
	    Class319_Sub1.method16525(2130975430);
	    Class536.method11895(i_1676_, i, i_1675_, i_1674_, (short) -2243);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.SPAWN_OBJECT_PACKET) {
	    Class529.decodeWorldUpdatePacket(SubIncommingOpcode.SPAWN_OBJECT, -1951886165);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5172 == ((ServerConnection) class190).currentPacket) {
	    boolean bool = class241_sub3_sub1.readUnsignedByte((byte) -67) == 1;
	    String string = class241_sub3_sub1.readString(-277885269);
	    String string_1677_ = string;
	    if (bool)
		string_1677_ = class241_sub3_sub1.readString(92422233);
	    long l = (long) class241_sub3_sub1.readUnsignedShort(1162222719);
	    long l_1678_ = (long) class241_sub3_sub1.readTriByte(1771646547);
	    PlayerRights class328
		= ((PlayerRights)
		   Class531.method11848(VarBitType.method5909(1766317249),
					class241_sub3_sub1
					    .readUnsignedByte((byte) -101),
					1879044027));
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    long l_1679_ = l_1678_ + (l << 32);
	    boolean bool_1680_ = false;
	while_28_:
	    do {
		for (int i_1681_ = 0; i_1681_ < 100; i_1681_++) {
		    if (client.chatMessageHashes[i_1681_] == l_1679_) {
			bool_1680_ = true;
			break while_28_;
		    }
		}
		if (class328.ignorable
		    && Class459.isIgnored(string_1677_, (byte) -106))
		    bool_1680_ = true;
	    } while (false);
	    if (!bool_1680_) {
		client.chatMessageHashes[963687043 * client.anInt8539] = l_1679_;
		client.anInt8539 = (1 + client.anInt8539 * 963687043) % 100 * 330738731;
		String string_1682_
		    = Class72.aClass625_1100.list(i, -636173339)
			  .method17177(class241_sub3_sub1, 1592991632);
		if (1247059781 * class328.chatIcon != -1)
		    Class337.showChatMessage(18, 0,
					new StringBuilder().append
					    (Class475_Sub1_Sub5_Sub1
						 .method17724
					     (class328.chatIcon * 1247059781,
					      797018607))
					    .append
					    (string).toString(),
					new StringBuilder().append
					    (Class475_Sub1_Sub5_Sub1
						 .method17724
					     (class328.chatIcon * 1247059781,
					      1037184206))
					    .append
					    (string_1677_).toString(),
					string, string_1682_, null, i,
					(byte) 1);
		else
		    Class337.showChatMessage(18, 0, string, string_1677_, string,
					string_1682_, null, i, (byte) 1);
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5180) {
	    String string = class241_sub3_sub1.readString(1899784289);
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    Class609.aClass397_7759.aString5786 = string;
	    Class609.aClass397_7759.nodeID = 1167304829 * i;
	    Class81.method1815(1553103089);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.UPDATE_SITESETTINGS == ((ServerConnection) class190).currentPacket) {
	    Class496.setCookie(class241_sub3_sub1.readString(909758811),
				 1652853842);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.IGNORES_PACKET == ((ServerConnection) class190).currentPacket) {
	    while (421967667 * class241_sub3_sub1.pointer
		   < ((ServerConnection) class190).incommingPacketSize * 1912225577) {
		int i = class241_sub3_sub1.readUnsignedByte((byte) 59);
		boolean bool = (i & 0x1) == 1;
		String string = class241_sub3_sub1.readString(-1695740721);
		String string_1683_
		    = class241_sub3_sub1.readString(-294788412);
		String string_1684_
		    = class241_sub3_sub1.readString(1452691291);
		for (int i_1685_ = 0; i_1685_ < client.ignoreListSize * -750736473;
		     i_1685_++) {
		    Ignore class7 = client.ignoreList[i_1685_];
		    if (bool) {
			if (string_1683_.equals(class7.currentName)) {
			    class7.currentName = string;
			    class7.previousName = string_1683_;
			    string = null;
			    break;
			}
		    } else if (string.equals(class7.currentName)) {
			class7.currentName = string;
			class7.previousName = string_1683_;
			class7.note = string_1684_;
			string = null;
			break;
		    }
		}
		if (string != null && -750736473 * client.ignoreListSize < 400) {
		    Ignore class7 = new Ignore();
		    client.ignoreList[client.ignoreListSize * -750736473] = class7;
		    class7.currentName = string;
		    class7.previousName = string_1683_;
		    class7.note = string_1684_;
		    class7.temporary = 2 == (i & 0x2);
		    client.ignoreListSize += 1733118999;
		}
	    }
	    client.lastFriendsListUpdate = client.anInt8494 * -1343088703;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5120 == ((ServerConnection) class190).currentPacket) {
	    boolean bool = class241_sub3_sub1.readByteC((byte) 69) == 1;
	    Class319_Sub1.method16525(1825033141);
	    Class120_Sub18.aBool10606 = bool;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5238 == ((ServerConnection) class190).currentPacket) {
	    Class529.decodeWorldUpdatePacket(SubIncommingOpcode.aClass341_5308, -1637491513);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5189) {
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_1686_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_1687_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    Class319_Sub1.method16525(1128417204);
	    if (null != Class187.aClass35Array2203[i]) {
		for (int i_1688_ = i_1686_; i_1688_ < i_1687_; i_1688_++) {
		    int i_1689_ = class241_sub3_sub1.readTriByte(1771646547);
		    if (i_1688_ < (Class187.aClass35Array2203[i]
				   .components).length
			&& null != (Class187.aClass35Array2203[i]
				    .components[i_1688_]))
			Class187.aClass35Array2203[i].components
			    [i_1688_].anInt835
			    = -1937504665 * i_1689_;
		}
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.CLIENT_SETVARCSTR_LARGE) {
	    String string = class241_sub3_sub1.readString(1912524454);
	    int i = class241_sub3_sub1.readUnsignedLEShortA(-825337404);
	    Class319_Sub1.method16525(-573718262);
	    Entity.setVarcString(i, string, 1484004327);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5185) {
	    int i = class241_sub3_sub1.readUnsignedByte((byte) 38);
	    Class319_Sub1.method16525(2045891495);
	    client.anInt8284 = i * 544234413;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.RUN_COMMAND_PACKET) {
	    String string = class241_sub3_sub1.readString(2099233748);
	    Class120_Sub10.runCommand(string, false, false, 149830736);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5266) {
	    int i = class241_sub3_sub1.readIntV2(1274614902);
	    if (i != Class249.anInt3998 * 1315882367) {
		Class249.anInt3998 = i * 416479871;
		Class561.method12372(Class614.aClass614_7814, -1, -1,
				     -1997503882);
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.IF_OPENSUB) {
	    int i = class241_sub3_sub1.readUnsignedLEShortA(-187657023);
	    int i_1690_ = class241_sub3_sub1.readLEInt(647140212);
	    int i_1691_ = class241_sub3_sub1.getByteA(-2101352485);
	    int i_1692_ = class241_sub3_sub1.readIntV2(1274614902);
	    int i_1693_ = class241_sub3_sub1.readIntV1((short) 27993);
	    int i_1694_ = class241_sub3_sub1.readInt((byte) 93);
	    int i_1695_ = class241_sub3_sub1.readInt((byte) 114);
	    Class319_Sub1.method16525(1342313032);
	    Class595.method13079(i_1695_, new Class241_Sub11(i, i_1691_),
				 new int[] { i_1693_, i_1690_, i_1694_,
					     i_1692_ },
				 false, (byte) 0);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.CHAT_FILTER_SETTINGS == ((ServerConnection) class190).currentPacket) {
	    client.publicChatStatus = class241_sub3_sub1.readUnsignedByteS((byte) 54) * 868091143;
	    client.tradeStatus = class241_sub3_sub1.readByteC((byte) 64) * 78873981;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5197) {
	    int i = class241_sub3_sub1.readUnsignedLEShortA(357117747);
	    if (i == 65535)
		i = -1;
	    int i_1696_ = class241_sub3_sub1.getByteA(-2096731935);
	    Class402.soundManager.method1173(i, i_1696_, (byte) 6);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.VARP_SMALL) {
	    int i = class241_sub3_sub1.readUnsignedShortA((byte) 67);
	    byte i_1697_ = class241_sub3_sub1.readByteA(582493488);
	    Class1.aClass19_11.varPlayerDomain.setVarp
		(Class177.VAR_PLAYER_LIST.list(i, -2140418015),
		 i_1697_, (byte) 127);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.RESET_INTERFACE_INFORMATION == ((ServerConnection) class190).currentPacket) {
	    Class473.varClientDomain.resetLayoutInfo((byte) 1);
	    ((ServerConnection) class190).currentPacket = null;
	    return false;
	}
	if (IncommingOpcode.aClass340_5275 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    Class299.method5815(i, -1577217875);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5186 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedByte((byte) -66);
	    Class425 class425
		= ((Class425)
		   Class531.method11848(ObjectDefinition.method11811(964112366), i,
					238594013));
	    if (null == class425)
		class425 = Class425.aClass425_6073;
	    Class230.method4671(class425, -731919609);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.HINT_ICON_PACKET == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedByte((byte) -12);
	    int i_1698_ = i >> 5;
	    int i_1699_ = i & 0x1f;
	    if (i_1699_ == 0) {
		client.aClass192Array8301[i_1698_] = null;
		((ServerConnection) class190).currentPacket = null;
		return true;
	    }
	    Class192 class192 = new Class192();
	    class192.anInt2288 = 983685271 * i_1699_;
	    ((Class192) class192).anInt2285
		= class241_sub3_sub1.readUnsignedByte((byte) 20) * -1674659237;
	    if (1521214931 * ((Class192) class192).anInt2285 >= 0
		&& (1521214931 * ((Class192) class192).anInt2285
		    < Class191.aClass168Array2284.length)) {
		if (-1685117145 * class192.anInt2288 == 1
		    || 10 == -1685117145 * class192.anInt2288) {
		    class192.anInt2287
			= (class241_sub3_sub1.readUnsignedShort(1162222719)
			   * -2048892741);
		    ((Class192) class192).anInt2294
			= (class241_sub3_sub1.readUnsignedShort(1162222719)
			   * -712934801);
		    class241_sub3_sub1.pointer += 1570795500;
		} else if (class192.anInt2288 * -1685117145 >= 2
			   && class192.anInt2288 * -1685117145 <= 6) {
		    if (2 == class192.anInt2288 * -1685117145) {
			class192.anInt2289 = -1647226112;
			class192.anInt2290 = -133096192;
		    }
		    if (-1685117145 * class192.anInt2288 == 3) {
			class192.anInt2289 = 0;
			class192.anInt2290 = -133096192;
		    }
		    if (-1685117145 * class192.anInt2288 == 4) {
			class192.anInt2289 = 1000515072;
			class192.anInt2290 = -133096192;
		    }
		    if (class192.anInt2288 * -1685117145 == 5) {
			class192.anInt2289 = -1647226112;
			class192.anInt2290 = 0;
		    }
		    if (-1685117145 * class192.anInt2288 == 6) {
			class192.anInt2289 = -1647226112;
			class192.anInt2290 = -266192384;
		    }
		    class192.anInt2288 = 1967370542;
		    ((Class192) class192).anInt2286
			= (class241_sub3_sub1.readUnsignedByte((byte) -6)
			   * -2118467403);
		    GameScene class522 = client.aClass238_8477.method4806((byte) 1);
		    class192.anInt2289
			+= ((class241_sub3_sub1.readUnsignedShort(1162222719)
			     - 127679513 * class522.baseX)
			    << 9) * 815649107;
		    class192.anInt2290
			+= ((class241_sub3_sub1.readUnsignedShort(1162222719)
			     - class522.baseY * 468558693)
			    << 9) * 184029469;
		    ((Class192) class192).anInt2291
			= ((class241_sub3_sub1.readUnsignedByte((byte) -7) << 2)
			   * 2066889041);
		    class192.anInt2293
			= (class241_sub3_sub1.readUnsignedShort(1162222719)
			   * -1465178659);
		}
		class192.anInt2292
		    = class241_sub3_sub1.readInt((byte) 48) * -1757964121;
		client.aClass192Array8301[i_1698_] = class192;
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5194 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedLEShort((short) 30247);
	    int i_1700_ = class241_sub3_sub1.readUnsignedShortA((byte) 15);
	    int i_1701_ = class241_sub3_sub1.readLEInt(320653268);
	    int i_1702_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    Class319_Sub1.method16525(6915150);
	    GeneralMapList.setInterfaceModel(i_1701_, 7, i_1702_ << 16 | i, i_1700_,
				 -1616929848);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5284) {
	    Class529.decodeWorldUpdatePacket(SubIncommingOpcode.aClass341_5303, -1634974801);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.VARCLAN) {
	    if (Class520.varClanDomain == null)
		Class520.varClanDomain
		    = new SparseVarDomain(Class443.VAR_CLAN_LIST);
	    Class254 class254
		= Class443.VAR_CLAN_LIST
		      .decodeVarValue(class241_sub3_sub1, (byte) 83);
	    Class520.varClanDomain.varValues.method335
		(class254.key * 623518843, class254.value,
		 (byte) 11);
	    client.recentVarClanChanged[(client.varClanChangePointer += 874463821) * 401065605 - 1 & 0x1f]
		= 623518843 * class254.key;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5119) {
	    int i = class241_sub3_sub1.readIntV1((short) 17325);
	    int i_1703_ = class241_sub3_sub1.readUnsignedLEShortA(661845610);
	    int i_1704_ = class241_sub3_sub1.readUnsignedLEShort((short) 3446);
	    if (i_1704_ == 65535)
		i_1704_ = -1;
	    int i_1705_ = class241_sub3_sub1.readUnsignedLEShort((short) 26222);
	    if (i_1705_ == 65535)
		i_1705_ = -1;
	    Class319_Sub1.method16525(1288813962);
	    for (int i_1706_ = i_1705_; i_1706_ <= i_1704_; i_1706_++) {
		long l = ((long) i << 32) + (long) i_1706_;
		Class241_Sub20 class241_sub20
		    = (Class241_Sub20) client.aClass407_8519.get(l);
		Class241_Sub20 class241_sub20_1707_;
		if (class241_sub20 == null) {
		    if (-1 == i_1706_)
			class241_sub20_1707_
			    = new Class241_Sub20((Js5ConfigGroup.getInterfaceComponent
						  (i, (byte) -106)
						  .aClass241_Sub20_922
						  .anInt9007) * -438085493,
						 i_1703_);
		    else
			class241_sub20_1707_ = new Class241_Sub20(0, i_1703_);
		} else {
		    class241_sub20_1707_
			= new Class241_Sub20((-438085493
					      * class241_sub20.anInt9007),
					     i_1703_);
		    class241_sub20.remove((byte) 36);
		}
		client.aClass407_8519.put(class241_sub20_1707_, l);
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5202) {
	    Class194.anInt2311
		= class241_sub3_sub1.readUnsignedByte((byte) 43) * 1817774129;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5290) {
	    int i = class241_sub3_sub1.readUnsignedByteS((byte) 112);
	    int i_1708_ = class241_sub3_sub1.readUnsignedLEShortA(-1075042452);
	    boolean bool = 1 == (i & 0x1);
	    AnimationDefinitionLoader.method12313(i_1708_, bool, -1438134197);
	    client.itemContainerUpdates[(client.itemContainerUpdatePointer += 1789825217) * 1774059329 - 1 & 0x1f]
		= i_1708_;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.IF_SETHIDE) {
	    int i = class241_sub3_sub1.readInt((byte) 44);
	    int i_1709_ = class241_sub3_sub1.readByteC((byte) 121);
	    Class319_Sub1.method16525(1347914787);
	    Class445_Sub34.setComponentHidden(i, i_1709_, -2012081674);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.aClass340_5167) {
	    Class353.aString5444
		= (1912225577 * ((ServerConnection) class190).incommingPacketSize > 2
		   ? class241_sub3_sub1.readString(71065031)
		   : ClientMessage.WALKHERE
			 .getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 22275));
	    client.anInt8451 = ((((ServerConnection) class190).incommingPacketSize * 1912225577 > 0
			  ? class241_sub3_sub1.readUnsignedShort(1162222719) : -1)
			 * 1517266607);
	    if (-485396401 * client.anInt8451 == 65535)
		client.anInt8451 = -1517266607;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.FRIENDS_CHANNEL_PACKET == ((ServerConnection) class190).currentPacket) {
	    client.lastFriendsChatUpdate = -1375606821 * client.anInt8494;
	    if (0 == ((ServerConnection) class190).incommingPacketSize * 1912225577) {
		client.currentFriendsChatName = null;
		client.currentFriendsChatOwner = null;
		Class357_Sub1.currentFcSize = 0;
		Class350.currentFcUsers = null;
		((ServerConnection) class190).currentPacket = null;
		return true;
	    }
	    client.currentFriendsChatOwner = class241_sub3_sub1.readString(-833062840);
	    boolean bool = class241_sub3_sub1.readUnsignedByte((byte) -111) == 1;
	    if (bool)
		class241_sub3_sub1.readString(1661853167);
	    client.currentFriendsChatName = class241_sub3_sub1.readString(-1555612717);
	    Class380.currentFcKickReq = class241_sub3_sub1.getByte(-1012499377);
	    int i = class241_sub3_sub1.readUnsignedByte((byte) -49);
	    if (i == 255) {
		((ServerConnection) class190).currentPacket = null;
		return true;
	    }
	    Class357_Sub1.currentFcSize = 1584810575 * i;
	    FriendsChatUser[] class197s = new FriendsChatUser[100];
	    for (int i_1710_ = 0;
		 i_1710_ < -612332369 * Class357_Sub1.currentFcSize; i_1710_++) {
		class197s[i_1710_] = new FriendsChatUser();
		class197s[i_1710_].displayName
		    = class241_sub3_sub1.readString(-626832065);
		bool = class241_sub3_sub1.readUnsignedByte((byte) -25) == 1;
		if (bool)
		    class197s[i_1710_].replyToName
			= class241_sub3_sub1.readString(1803977324);
		else
		    class197s[i_1710_].replyToName
			= class197s[i_1710_].displayName;
		((FriendsChatUser) class197s[i_1710_]).protocolName
		    = Class482.formatStringForProtocol(class197s[i_1710_].replyToName,
					   Class524.aClass600_6822, (byte) 51);
		class197s[i_1710_].nodeID
		    = class241_sub3_sub1.readUnsignedShort(1162222719) * 752157003;
		class197s[i_1710_].rank
		    = class241_sub3_sub1.getByte(223308958);
		class197s[i_1710_].worldName
		    = class241_sub3_sub1.readString(-183768453);
		if (class197s[i_1710_].replyToName.equals
		    (Class21.myPlayer.nameUnfiltered))
		    NPC.myCurrentFcRank
			= class197s[i_1710_].rank;
	    }
	    boolean bool_1711_ = false;
	    int i_1712_ = -612332369 * Class357_Sub1.currentFcSize;
	    do {
		if (i_1712_ <= 0)
		    break;
		bool_1711_ = true;
		i_1712_--;
		for (int i_1713_ = 0; i_1713_ < i_1712_; i_1713_++) {
		    if ((((FriendsChatUser) class197s[i_1713_]).protocolName.compareTo
			 (((FriendsChatUser) class197s[i_1713_ + 1]).protocolName))
			> 0) {
			FriendsChatUser class197 = class197s[i_1713_];
			class197s[i_1713_] = class197s[1 + i_1713_];
			class197s[i_1713_ + 1] = class197;
			bool_1711_ = false;
		    }
		}
	    } while (!bool_1711_);
	    Class350.currentFcUsers = class197s;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.IF_SETNPCHEAD) {
	    int i = class241_sub3_sub1.readIntV1((short) 6318);
	    int i_1714_ = class241_sub3_sub1.readLEInt(929493848);
	    Class319_Sub1.method16525(-30897923);
	    GeneralMapList.setInterfaceModel(i_1714_, 2, i, -1, -1874171303);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5218 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedByte((byte) -31);
	    Class423 class423
		= ((Class423)
		   Class531.method11848(GraphicsDefinition.method10631(1053012172), i,
					-1369980419));
	    if (class423 == null)
		class423 = Class423.aClass423_6050;
	    VarTransmitLevel.method5825(class423, (byte) 20);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.ONLINE_STATUS_PACKET == ((ServerConnection) class190).currentPacket) {
	    Class38.currentOnlineStatus
		= Class3.method463(class241_sub3_sub1.readUnsignedByte((byte) 7),
				   877627580);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.IF_SETGRAPHIC) {
	    int i = class241_sub3_sub1.readIntV1((short) 18917);
	    int i_1715_ = class241_sub3_sub1.readLEInt(-62037818);
	    Class319_Sub1.method16525(1843480808);
	    Class569.setComponentSprite(i_1715_, i, 1933632063);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.IF_SETTEXTFONT == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readLEInt(59036643);
	    int i_1716_ = class241_sub3_sub1.readIntV2(1274614902);
	    Class319_Sub1.method16525(1459585915);
	    Class536.setComponentFont(i, i_1716_, -1905960332);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5193 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readUnsignedShort(1162222719);
	    if (65535 == i)
		i = -1;
	    int i_1717_ = class241_sub3_sub1.readUnsignedByte((byte) -31);
	    int i_1718_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_1719_ = class241_sub3_sub1.readUnsignedByte((byte) -44);
	    int i_1720_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    Class402.soundManager.method1162(Class112.aClass112_1523, i,
					      i_1717_, i_1719_,
					      Class130.aClass130_1597
						  .method3067(-960497231),
					      Class127.aClass127_1587, 0.0F,
					      0.0F, null, 0, i_1720_, i_1718_,
					      -196785723);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (IncommingOpcode.aClass340_5261 == ((ServerConnection) class190).currentPacket) {
	    int i = class241_sub3_sub1.readLEInt(330584211);
	    int i_1721_ = class241_sub3_sub1.readIntV1((short) 11492);
	    int i_1722_ = class241_sub3_sub1.readByteC((byte) 83);
	    int i_1723_ = class241_sub3_sub1.readLEInt(607500423);
	    int i_1724_ = class241_sub3_sub1.readIntV2(1274614902);
	    int i_1725_ = class241_sub3_sub1.readLEInt(-1368411625);
	    int i_1726_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_1727_ = class241_sub3_sub1.readUnsignedLEShort((short) 4773);
	    Class319_Sub1.method16525(1778110223);
	    Class595.method13079(i_1721_,
				 new Class241_Sub11_Sub1(i_1726_, i_1722_,
							 i_1727_),
				 new int[] { i, i_1725_, i_1723_, i_1724_ },
				 false, (byte) 0);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.IF_OPENTOP) {
	    class241_sub3_sub1.readByteC((byte) 52);
	    int i = class241_sub3_sub1.readLEInt(-1338267663);
	    int i_1728_ = class241_sub3_sub1.readUnsignedLEShortA(-943470895);
	    int i_1729_ = class241_sub3_sub1.readIntV2(1274614902);
	    int i_1730_ = class241_sub3_sub1.readIntV2(1274614902);
	    int i_1731_ = class241_sub3_sub1.readLEInt(369195424);
	    Class319_Sub1.method16525(1765088338);
	    int[] is = { i, i_1731_, i_1729_, i_1730_ };
	    client.anInt8466 = i_1728_ * 1376966001;
	    Class474.method10869(i_1728_, is, (byte) 0);
	    Class105_Sub1_Sub3_Sub1.method17885(false, -1813551636);
	    Class107.method2686(1629309841 * client.anInt8466, is, -578799681);
	    for (int i_1732_ = 0; i_1732_ < 108; i_1732_++)
		client.aBoolArray8523[i_1732_] = true;
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.MESSAGE_CLANCHANNEL) {
	    boolean bool = class241_sub3_sub1.readUnsignedByte((byte) 19) == 1;
	    String string = class241_sub3_sub1.readString(-240601672);
	    long l = (long) class241_sub3_sub1.readUnsignedShort(1162222719);
	    long l_1733_ = (long) class241_sub3_sub1.readTriByte(1771646547);
	    PlayerRights class328
		= ((PlayerRights)
		   Class531.method11848(VarBitType.method5909(1766317249),
					class241_sub3_sub1
					    .readUnsignedByte((byte) -8),
					-641997340));
	    long l_1734_ = (l << 32) + l_1733_;
	    boolean bool_1735_ = false;
	    //Object object = null;
	    ClanChannel class241_sub6 = (bool ? Class324.mainClanChannel
					   : Class239.guestClanChannel);
	while_29_:
	    do {
		if (null == class241_sub6)
		    bool_1735_ = true;
		else {
		    for (int i = 0; i < 100; i++) {
			if (client.chatMessageHashes[i] == l_1734_) {
			    bool_1735_ = true;
			    break while_29_;
			}
		    }
		    if (class328.ignorable) {
			if (client.aBool8441 && !client.aBool8442 || client.isQcWorld)
			    bool_1735_ = true;
			else if (Class459.isIgnored(string, (byte) -48))
			    bool_1735_ = true;
		    }
		}
	    } while (false);
	    if (!bool_1735_) {
		client.chatMessageHashes[963687043 * client.anInt8539] = l_1734_;
		client.anInt8539 = (client.anInt8539 * 963687043 + 1) % 100 * 330738731;
		String string_1736_
		    = (Class240.stripCode
		       (Class241_Sub47.huffmanDecrypt(class241_sub3_sub1,
						   (byte) 51),
			417256845));
		int i = bool ? 41 : 44;
		if (class328.chatIcon * 1247059781 != -1)
		    Class337.showChatMessage(i, 0,
					new StringBuilder().append
					    (Class475_Sub1_Sub5_Sub1
						 .method17724
					     (class328.chatIcon * 1247059781,
					      833036311))
					    .append
					    (string).toString(),
					new StringBuilder().append
					    (Class475_Sub1_Sub5_Sub1
						 .method17724
					     (class328.chatIcon * 1247059781,
					      1948066294))
					    .append
					    (string).toString(),
					string, string_1736_,
					class241_sub6.channelName, -1,
					(byte) 1);
		else
		    Class337.showChatMessage(i, 0, string, string, string,
					string_1736_,
					class241_sub6.channelName, -1,
					(byte) 1);
	    }
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.URL_OPEN) {
	    if (Class442.aBool6160 && Class228.aFrame2674 != null)
		Class537.method11899(Class241_Sub5_Sub9
					 .aClass241_Sub9_11043
					 .aClass445_Sub30_8878
					 .method14386(-801965113),
				     -1, -1, false, 1482319719);
	    byte[] is
		= new byte[1912225577 * ((ServerConnection) class190).incommingPacketSize - 1];
	    boolean bool = class241_sub3_sub1.readUnsignedByte((byte) 66) == 1;
	    class241_sub3_sub1.readEncodeBytes(is, 0,
					   (((ServerConnection) class190).incommingPacketSize
					    * 1912225577) - 1,
					   -1343464983);
	    RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	    String string = class241_sub3.readString(8616540);
	    if (bool) {
		String string_1737_ = class241_sub3.readString(-1281441063);
		if (string_1737_.length() == 0)
		    string_1737_ = string;
		if (!client.aBool8267 || Class83.osName.startsWith("mac")
		    || !Class68.method1676(string, 1,
					   JSFunction.OPEN_MTX_URL
					       .getName(1934037073),
					   -1258065788))
		    Class446.method7895(string_1737_, true, client.aBool8440,
					-1815142638);
	    } else
		Class446.method7895(string, true, client.aBool8440, -1815142638);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	if (((ServerConnection) class190).currentPacket == IncommingOpcode.WORLD_LIST_PACKET) {
	    boolean bool = class241_sub3_sub1.readUnsignedByte((byte) -50) == 1;
	    byte[] is
		= new byte[((ServerConnection) class190).incommingPacketSize * 1912225577 - 1];
	    class241_sub3_sub1.readBytes(is, 0,
					   (((ServerConnection) class190).incommingPacketSize
					    * 1912225577) - 1,
					   (byte) 11);
	    Class548.method12001(bool, is, (byte) -113);
	    ((ServerConnection) class190).currentPacket = null;
	    return true;
	}
	VarType.method3770
	    (new StringBuilder().append
		 (null != ((ServerConnection) class190).currentPacket
		  ? ((ServerConnection) class190).currentPacket.opcode * 935526901
		  : -1)
		 .append
		 (Class6.aString30).append
		 (null != ((ServerConnection) class190).aClass340_2273
		  ? 935526901 * ((ServerConnection) class190).aClass340_2273.opcode
		  : -1)
		 .append
		 (Class6.aString30).append
		 (null != ((ServerConnection) class190).aClass340_2274
		  ? 935526901 * ((ServerConnection) class190).aClass340_2274.opcode
		  : -1)
		 .append
		 (" ").append
		 (((ServerConnection) class190).incommingPacketSize * 1912225577).toString(),
	     new RuntimeException(), 206460885);
	Class362_Sub1.gameLogout(false, 1680237388);
	return true;
	}

}
