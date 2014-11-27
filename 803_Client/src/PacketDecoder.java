import java.io.IOException;
import java.util.Arrays;

/*
 * Originally located within Class163
 */
public class PacketDecoder {

	static final boolean decodePacket(ServerConnection connection, int i)
			throws IOException {
		Class563 class563 = connection.getIO(-283616200);
		RSBitBuffer stream = connection.inputBuffer;
		if (class563 == null)
			return false;
		if (null == connection.currentPacket) {
			if (connection.aBool2265) {
				if (!class563.isAvailable(1, -341343911))
					return false;
				class563.read(
						(connection.inputBuffer.payload),
						0, 1, 2048597390);
				connection.anInt2266 += 350604633;
				connection.anInt2269 = 0;
				connection.aBool2265 = false;
			}
			stream.pointer = 0;
			if (stream.method17041(-953803912)) {
				if (!class563.isAvailable(1, -341343911))
					return false;
				class563.read(
						(connection.inputBuffer.payload),
						1, 1, 2048256463);
				connection.anInt2266 += 350604633;
				connection.anInt2269 = 0;
			}
			connection.aBool2265 = true;
			IncommingOpcode[] class340s = Class452.method10546((byte) 30);
			int i_21_ = stream.readPacketOpcode(1610447244);
			if (i_21_ < 0 || i_21_ >= class340s.length)
				throw new IOException(new StringBuilder().append(i_21_)
						.append(" ").append(stream.pointer * 421967667)
						.toString());
			connection.currentPacket = class340s[i_21_];
			connection.incommingPacketSize = 1850243431 * connection.currentPacket.size;
		}
		if (connection.incommingPacketSize * 1912225577 == -1) {
			if (!class563.isAvailable(1, -341343911))
				return false;
			class563.read(stream.payload, 0, 1, 2119629103);
			connection.incommingPacketSize = -1248015079
					* (stream.payload[0] & 0xff);
			connection.anInt2266 += 350604633;
			connection.anInt2269 = 0;
		}
		if (1912225577 * connection.incommingPacketSize == -2) {
			if (!class563.isAvailable(2, -341343911))
				return false;
			class563.read(stream.payload, 0, 2, 2011530660);
			stream.pointer = 0;
			connection.incommingPacketSize = stream
					.readUnsignedShort(1162222719) * -1248015079;
			connection.anInt2266 += 701209266;
			connection.anInt2269 = 0;
		}
		if (1912225577 * connection.incommingPacketSize > 0) {
			if (!class563.isAvailable(
					(connection.incommingPacketSize * 1912225577),
					-341343911))
				return false;
			stream.pointer = 0;
			class563.read(stream.payload, 0,
					connection.incommingPacketSize * 1912225577,
					2145073403);
			connection.anInt2266 += -1203713471
					* connection.incommingPacketSize;
			connection.anInt2269 = 0;
		}
		if (connection.currentPacket.opcode * 935526901 != 96
				&& connection.currentPacket.opcode * 935526901 != 153
				&& connection.currentPacket.opcode * 935526901 != 134
				&& connection.currentPacket.opcode * 935526901 != 49
				&& connection.currentPacket.opcode * 935526901 != 23
				&& connection.currentPacket.opcode * 935526901 != 167) {
			// System.out.println("Received incomming packet: opcode="+(class190.currentPacket.opcode
			// * 935526901)+", size="+(class190.incommingPacketSize * 1912225577));
		}
		connection.aClass340_2274 = connection.aClass340_2273;
		connection.aClass340_2273 = connection.aClass340_2272;
		connection.aClass340_2272 = connection.currentPacket;
		if (IncommingOpcode.aClass340_5230 == connection.currentPacket) {
			int i_22_ = stream.readUnsignedShortA((byte) 81);
			if (65535 == i_22_) {
				i_22_ = -1;
			}
			Class402.soundManager.method1163(i_22_, 255, 378943703);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.FRIENDS_PACKET == connection.currentPacket) {
			while (stream.pointer * 421967667 < 1912225577 * connection.incommingPacketSize) {
				boolean bool = stream.readUnsignedByte((byte) -22) == 1;
				String curName = stream.readString(1655650137);
				String prevName = stream.readString(981056813);
				int nodeID = stream.readUnsignedShort(1162222719);
				int i_25_ = stream.readUnsignedByte((byte) -24);
				int i_26_ = stream.readUnsignedByte((byte) 8);
				boolean bool_27_ = 0 != (i_26_ & 0x2);
				boolean bool_28_ = (i_26_ & 0x1) != 0;
				String worldName = "";
				int i_30_ = -1;
				int worldFlags = 0;
				if (nodeID > 0) {
					worldName = stream.readString(-1584369859);
					i_30_ = stream.readUnsignedByte((byte) 37);
					worldFlags = stream.readInt((byte) 4);
				}
				String note = stream.readString(649994252);
				for (int index = 0; index < 1557840217 * client.friendListSize; index++) {
					Friend friend = client.friendList[index];
					if (!bool) {
						if (curName.equals(friend.currentName)) {
							if (nodeID != 1337402161 * friend.serverNodeID) {
								boolean bool_34_ = true;
								for (Class247_Sub3 class247_sub3 = ((Class247_Sub3) client.aClass421_8568
										.method7525(1643853664)); class247_sub3 != null; class247_sub3 = ((Class247_Sub3) client.aClass421_8568
										.method7526(-1399264471))) {
									if (((Class247_Sub3) class247_sub3).aString10081.equals(curName)) {
										if (nodeID != 0
												&& 0 == (((Class247_Sub3) class247_sub3).aShort10080)) {
											class247_sub3.method4944((byte) 0);
											bool_34_ = false;
										} else if (nodeID == 0
												&& 0 != (((Class247_Sub3) class247_sub3).aShort10080)) {
											class247_sub3.method4944((byte) 38);
											bool_34_ = false;
										}
									}
								}
								if (bool_34_)
									client.aClass421_8568.method7522(new Class247_Sub3(curName, nodeID),
											-1665299415);
								friend.serverNodeID = -1805822511 * nodeID;
							}
							friend.previousName = prevName;
							friend.serverName = worldName;
							friend.anInt190 = 748979401 * i_25_;
							friend.anInt194 = i_30_ * 1288470163;
							friend.aBool192 = bool_27_;
							friend.aBool193 = bool_28_;
							friend.note = note;
							friend.serverFlags = 1566867689 * worldFlags;
							curName = null;
							break;
						}
					} else if (prevName.equals(friend.currentName)) {
						friend.currentName = curName;
						friend.previousName = prevName;
						curName = null;
						break;
					}
				}
				if (null != curName && 1557840217 * client.friendListSize < 400) {
					Friend friend = new Friend();
					client.friendList[1557840217 * client.friendListSize] = friend;
					friend.currentName = curName;
					friend.previousName = prevName;
					friend.serverNodeID = -1805822511 * nodeID;
					friend.serverName = worldName;
					friend.anInt190 = i_25_ * 748979401;
					friend.anInt194 = 1288470163 * i_30_;
					friend.aBool192 = bool_27_;
					friend.aBool193 = bool_28_;
					friend.note = note;
					friend.serverFlags = worldFlags * 1566867689;
					client.friendListSize += 1847555817;
				}
			}
			client.friendListStage = -1425715398;
			client.lastFriendsListUpdate = client.anInt8494 * -1343088703;
			boolean finished = false;
			int length = client.friendListSize * 1557840217;
			do {
				if (length <= 0) {
					break;
				}
				finished = true;
				length--;
				for (int index = 0; index < length; index++) {
					boolean swap = false;
					Friend f1 = client.friendList[index];
					Friend f2 = client.friendList[1 + index];
					if ((1337402161 * f1.serverNodeID != Class193.aClass397_2297.nodeID * -2019487531)
							&& (1337402161 * f2.serverNodeID == (Class193.aClass397_2297.nodeID * -2019487531))) {
						swap = true;
					}
					if (!swap && 1337402161 * f1.serverNodeID == 0 && 0 != f2.serverNodeID * 1337402161) {
						swap = true;
					}
					if (!swap && !f1.aBool192 && f2.aBool192) {
						swap = true;
					}
					if (!swap && !f1.aBool193 && f2.aBool193) {
						swap = true;
					}
					if (swap) {
						Friend friend = client.friendList[index];
						client.friendList[index] = client.friendList[index + 1];
						client.friendList[1 + index] = friend;
						finished = false;
					}
				}
			} while (!finished);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5288 == connection.currentPacket) {
			for (int index = 0; index < client.localPlayers.length; index++) {
				if (null != client.localPlayers[index]) {
					client.localPlayers[index].anIntArray11397 = null;
					client.localPlayers[index].aClass409_11375.method7347(-1, -39653237);
				}
			}
			for (int i_41_ = 0; i_41_ < 743597371 * client.anInt8434; i_41_++) {
				((Entity) client.aClass241_Sub26Array8276[i_41_].objectValue).anIntArray11397 = null;
				((Entity) client.aClass241_Sub26Array8276[i_41_].objectValue).aClass409_11375
						.method7347(-1, -784435109);
			}
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.DESTROY_OBJECT_PACKET) {
			Class529.decodeWorldUpdatePacket(SubIncommingOpcode.DESTROY_OBJECT, -1967947202);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5128) {
			Class319_Sub1.method16525(1231407985);
			Class592.method12924(Class520.method11690(-1370334398), 474680356);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5184) {
			int i_42_ = stream.readUnsignedLEShortA(1477519647);
			int i_43_ = stream.readUnsignedShortA((byte) 115);
			Class319_Sub1.method16525(-481003980);
			Class530.method11842(i_43_, i_42_, 0, 265854353);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5232) {
			int i_44_ = stream.readUnsignedShort(1162222719);
			int i_45_ = stream.readUnsignedShort(1162222719);
			Class402.soundManager.method1151(i_44_, i_45_, (byte) 2);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5126 == connection.currentPacket) {
			int i_46_ = stream.readInt((byte) 55);
			Class621.aClass4_7876 = new Class4(i_46_);
			Thread thread = new Thread(Class621.aClass4_7876);
			thread.setPriority(1);
			thread.start();
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5183) {
			int i_47_ = stream.readLEInt(-200537526);
			boolean bool = stream.getByteA(-2019219972) == 1;
			Class319_Sub1.method16525(-161464350);
			Class209_Sub1.method16590(i_47_, bool, (byte) 54);//22
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.MESSAGE_PRIVATE) {//Private Message
			boolean hasDisplayName = stream.readUnsignedByte((byte) 16) == 1;
			String name = stream.readString(-1266878362);
			String nameUnfiltered = name;
			if (hasDisplayName) {
				nameUnfiltered = stream.readString(-1612811800);
			}
			long l = (long) stream.readUnsignedShort(1162222719);
			long l_49_ = (long) stream.readTriByte(1771646547);
			PlayerRights rights = ((PlayerRights) Class531.method11848(
					VarBitType.method5909(1766317249),
					stream.readUnsignedByte((byte) 9), -1475828171));
			long hash = (l << 32) + l_49_;
			boolean skipMessage = false;
			while_90_: do {
				for (int index = 0; index < 100; index++) {
					if (hash == client.chatMessageHashes[index]) {
						skipMessage = true;
						break while_90_;
					}
				}
				if (rights.ignorable) {
					if (client.aBool8441 && !client.aBool8442 || client.isQcWorld) {
						skipMessage = true;
					} else if (Class459.isIgnored(nameUnfiltered, (byte) -62)) {
						skipMessage = true;
					}
				}
			} while (false);
			if (!skipMessage) {
				client.chatMessageHashes[963687043 * client.anInt8539] = hash;
				client.anInt8539 = 330738731 * ((client.anInt8539 * 963687043 + 1) % 100);
				String message = (Class240.stripCode(
						Class241_Sub47.huffmanDecrypt(stream, (byte) 112),
						417256845));
				int opcode = rights.bypassChatFilter ? 7 : 3;
				if (1247059781 * rights.chatIcon != -1){
					Class337.showChatMessage(
							opcode,
							0,
							new StringBuilder()
									.append(Class475_Sub1_Sub5_Sub1.method17724(rights.chatIcon * 1247059781,381506539))
									.append(name).toString(),
							new StringBuilder()
									.append(Class475_Sub1_Sub5_Sub1.method17724(1247059781 * rights.chatIcon, 1809455200))
									.append(nameUnfiltered).toString(), 
									name, message, null, -1, (byte) 1);
				} else {
					Class337.showChatMessage(opcode, 0, name, nameUnfiltered, name,
							message, null, -1, (byte) 1);
				}
			}
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.CLIENT_SETVARC_SMALL == connection.currentPacket) {
			byte value = stream.getByteC(537746309);
			int key = stream.readUnsignedShortA((byte) 59);
			Class319_Sub1.method16525(-485768433);
			Class597.setVarc(key, value, 65280);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.REMOVE_GROUND_ITEM_PACKET == connection.currentPacket) {
			Class529.decodeWorldUpdatePacket(SubIncommingOpcode.REMOVE_GROUND_ITEM, -1884291719);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5141) {
			Class402.soundManager.method1155(
					stream.readUnsignedShort(1162222719), (byte) 8);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.CLIENT_SETVARC_LARGE) {
			int key = stream.readUnsignedLEShortA(970280017);
			int value = stream.readInt((byte) 82);
			Class319_Sub1.method16525(1557992071);
			Class597.setVarc(key, value, 65280);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5192) {
			int itemID = stream.readUnsignedShortA((byte) 47);
			if (65535 == itemID) {
				itemID = -1;
			}
			int i_60_ = stream.readLEInt(142464404);
			int i_61_ = stream.readLEInt(1390811231);
			Class319_Sub1.method16525(-615765590);
			Class121.method2975(i_60_, itemID, i_61_, 717934678);//9
			ItemDefinition item = JS5.itemDefLoader.list(itemID, (short) -11940);
			Class477.setComponentObject(i_60_, 1905798151 * item.xan2d,
					item.yan2d * -1675080811, item.zoom2d
							* -1923471293, (short) -15614);
			Class14.method694(i_60_, item.xof2d * 774761921,
					1096836429 * item.yof2d,
					50884575 * item.zan2d, -1873166539);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.PROJECTILE_PACKET == connection.currentPacket) {
			Class529.decodeWorldUpdatePacket(SubIncommingOpcode.PROJECTILE, -2088407461);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5171 == connection.currentPacket) {
			int i_62_ = stream.readUnsignedByte((byte) -43);
			Class411 class411 = ((Class411) Class531.method11848(
					Class84.method1841((byte) 102), i_62_, 1152176324));
			if (class411 == null)
				class411 = Class411.aClass411_5938;
			NPCDefinition.method7187(class411, -1951044822);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5258 == connection.currentPacket) {
			Class529.decodeWorldUpdatePacket(SubIncommingOpcode.aClass341_5306, -1877413563);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.CLIENT_SETVARCBIT_LARGE == connection.currentPacket) {
			int key = stream.readUnsignedLEShortA(1430427446);
			int value = stream.readIntV1((short) 21145);
			Class319_Sub1.method16525(1271963026);
			Class95.setVarcBit(key, value, 1913283808);//1
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5243) {
			int i_65_ = stream.readUnsignedLEShortA(956826422);
			int i_66_ = stream.readIntV2(1274614902);
			Class319_Sub1.method16525(1266773869);
			ParamTypeList.method13275(i_66_, i_65_, -1116997185);//16
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.MESSAGE_PACKET == connection.currentPacket) {
			int opcode = stream.readSmart((short) -2307);
			int i_68_ = stream.readInt((byte) 38);
			int mask = stream.readUnsignedByte((byte) -116);
			String name = "";
			String nameUnfiltered = name;
			if (0 != (mask & 0x1)) {
				name = stream.readString(-248888235);
				if ((mask & 0x2) != 0) {
					nameUnfiltered = stream.readString(-1652345883);
				} else {
					nameUnfiltered = name;
				}
			}
			String message = stream.readString(-1036080221);
			if (99 == opcode) {
				Class21.addline(message, (byte) 85);
			} else if (98 == opcode) {
				Class1.method453(message, -679385407);
			} else {
				if (!nameUnfiltered.equals("") && Class459.isIgnored(nameUnfiltered, (byte) -97)) {
					connection.currentPacket = null;
					return true;
				}
				Class318.appendChatboxMessage(opcode, i_68_, name, nameUnfiltered, name,
						message, -1825617028);
			}
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5156) {
			int i_72_ = stream.readUnsignedShort(1162222719);
			if (i_72_ == 65535)
				i_72_ = -1;
			int i_73_ = stream.readUnsignedByte((byte) 13);
			int i_74_ = stream.readUnsignedShort(1162222719);
			int i_75_ = stream.readUnsignedByte((byte) 34);
			int i_76_ = stream.readUnsignedShort(1162222719);
			Class402.soundManager.method1162(Class112.aClass112_1523, i_72_,
					i_73_, i_75_,
					Class130.aClass130_1597.method3067(-960497231),
					Class127.aClass127_1587, 0.0F, 0.0F, null, 0, i_76_, i_74_,
					12756358);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5209) {
			int i_77_ = stream.readUnsignedShort(1162222719);
			int i_78_ = stream.readIntV2(1274614902);
			int i_79_ = stream.readUnsignedByte((byte) 83);
			int i_80_ = stream.readUnsignedLEShort((short) 4344);
			Class319_Sub1.method16525(289187301);
			Class68.method1678(i_78_, i_79_, i_80_, i_77_, 730693588);//20
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.UNLOCK_FRIEND_LIST_PACKET == connection.currentPacket) {
			client.friendListStage = 1434625949;
			client.lastFriendsListUpdate = client.anInt8494 * -1343088703;
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.UPDATE_RUNWEIGHT == connection.currentPacket) {//Weight
			client.anInt8471 = stream.readShort((byte) 71) * -1277217811;
			client.anInt8271 = client.anInt8494 * -674075855;
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5165) {
			int i_81_ = stream.readInt((byte) 4);
			int i_82_ = stream.readInt((byte) 108);
			Class241_Sub27 packet = Class445_Sub26.makePacket(
					OutgoingOpcode.aClass253_4039, connection.packetCipher,
					16711935);
			packet.data.writeByteS(2016113751 * client.currentFpsRate, 1994269085);
			packet.data.writeInt(i_81_, 728836936);
			packet.data.writeInt(i_82_, 1288675387);
			connection.sendPacket(packet, -1660129078);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.GRAPHICS_PACKET) {
			int graphicsHeight = stream.readUnsignedLEShortA(204370544);
			int graphicsID = stream.readUnsignedShortA((byte) 6);
			if (graphicsID == 65535)
				graphicsID = -1;
			int slotID = stream.readByteC((byte) 10);
			int hash = stream.getByteA(-2088713592);
			int speed = stream.readUnsignedLEShort((short) 25514);
			int targetHash = stream.readLEInt(-2063878447);
			int i_89_ = hash & 0x7;
			int i_90_ = hash >> 3 & 0xf;
			if (15 == i_90_)
				i_90_ = -1;
			boolean bool = 1 == (hash >> 7 & 0x1);
			if (0 != targetHash >> 30) {
				GameScene class522 = client.aClass238_8477.method4806((byte) 1);
				int i_91_ = targetHash >> 28 & 0x3;
				int i_92_ = (targetHash >> 14 & 0x3fff) - 127679513 * class522.baseX;
				int i_93_ = (targetHash & 0x3fff) - 468558693 * class522.baseY;
				if (i_92_ >= 0
						&& i_93_ >= 0
						&& i_92_ < client.aClass238_8477
								.method4744(-1437651636)
						&& i_93_ < client.aClass238_8477
								.method4745(-1730314072)) {
					if (graphicsID == -1) {
						Class241_Sub39_Sub7 class241_sub39_sub7 = ((Class241_Sub39_Sub7) client.aClass407_8454
								.get((long) (i_92_ << 16 | i_93_)));
						if (class241_sub39_sub7 != null) {
							((Class241_Sub39_Sub7) class241_sub39_sub7).aClass475_Sub1_Sub1_Sub5_10856
									.method17935((byte) -82);
							class241_sub39_sub7.remove((byte) 36);
						}
					} else {
						int i_94_ = 256 + 512 * i_92_;
						int i_95_ = 256 + i_93_ * 512;
						int i_96_ = i_91_;
						if (i_96_ < 3
								&& client.aClass238_8477
										.method4753((byte) -102).method4331(
												i_92_, i_93_, -1151840182))
							i_96_++;
						Class475_Sub1_Sub1_Sub5 class475_sub1_sub1_sub5 = (new Class475_Sub1_Sub1_Sub5(
								client.aClass238_8477.method4751(-1756692602),
								graphicsID, speed, i_91_, i_96_, i_94_,
								Class96_Sub5.method16046(i_94_, i_95_, i_91_,
										1480158126) - graphicsHeight, i_95_, i_92_,
								i_92_, i_93_, i_93_, i_89_, bool, 0));
						client.aClass407_8454
								.put(new Class241_Sub39_Sub7(
										class475_sub1_sub1_sub5),
										(long) (i_92_ << 16 | i_93_));
					}
				}
			} else if (targetHash >> 29 != 0) {
				int i_97_ = targetHash & 0xffff;
				ObjectNode class241_sub26 = ((ObjectNode) client.aClass407_8457
						.get((long) i_97_));
				if (null != class241_sub26) {
					NPC npc = ((NPC) class241_sub26.objectValue);
					RSGraphics class244 = npc.aClass244Array11404[slotID];
					if (65535 == graphicsID) {
						graphicsID = -1;
					}
					boolean bool_98_ = true;
					int i_99_ = class244.graphicsID * 1967872619;
					if (-1 != graphicsID && -1 != i_99_) {
						if (graphicsID == i_99_) {
							GraphicsDefinition class460 = Class240.graphicsDefLoader
									.getGraphicsDefinition(graphicsID, 1232200923);
							if (class460.aBool6277
									&& class460.anInt6267 * 850723107 != -1) {
								AnimationDefinition class549 = (Class394.animationDefLoader
										.getAnimationDefinition(
												class460.anInt6267 * 850723107,
												(byte) -79));
								int i_100_ = class549.anInt7078 * 1834456867;
								if (i_100_ == 0 || 2 == i_100_)
									bool_98_ = false;
								else if (1 == i_100_)
									bool_98_ = true;
							}
						} else {
							GraphicsDefinition class460 = Class240.graphicsDefLoader
									.getGraphicsDefinition(graphicsID, 1232200923);
							GraphicsDefinition class460_101_ = Class240.graphicsDefLoader
									.getGraphicsDefinition(i_99_, 1232200923);
							if (class460.anInt6267 * 850723107 != -1
									&& class460_101_.anInt6267 * 850723107 != -1) {
								AnimationDefinition class549 = (Class394.animationDefLoader
										.getAnimationDefinition(
												850723107 * class460.anInt6267,
												(byte) -62));
								AnimationDefinition class549_102_ = (Class394.animationDefLoader
										.getAnimationDefinition(
												class460_101_.anInt6267 * 850723107,
												(byte) -23));
								if (class549.anInt7076 * -397642129 < class549_102_.anInt7076
										* -397642129)
									bool_98_ = false;
							}
						}
					}
					if (bool_98_) {
						class244.graphicsID = -1386773949 * graphicsID;
						class244.height = -179650045 * graphicsHeight;
						class244.anInt3938 = i_90_ * -471497347;
						if (-1 != graphicsID) {
							GraphicsDefinition class460 = Class240.graphicsDefLoader
									.getGraphicsDefinition(graphicsID, 1232200923);
							int i_103_ = class460.aBool6277 ? 0 : 2;
							if (bool)
								i_103_ = 1;
							class244.aClass409_3935.method7351(
									850723107 * class460.anInt6267, speed,
									i_103_, false, -1302211377);
						} else
							class244.aClass409_3935.method7347(-1, -530231331);
					}
				}
			} else if (0 != targetHash >> 28) {
				int i_104_ = targetHash & 0xffff;
				Player player;
				if (i_104_ == client.myPlayerIndex * 1124115145) {
					player = Class21.myPlayer;
				} else {
					player = (client.localPlayers[i_104_]);
				}
				if (null != player) {
					RSGraphics graphics = (player.aClass244Array11404[slotID]);
					if (graphicsID == 65535) {
						graphicsID = -1;
					}
					boolean bool_105_ = true;
					int i_106_ = 1967872619 * graphics.graphicsID;
					if (-1 != graphicsID && i_106_ != -1) {
						if (i_106_ == graphicsID) {
							GraphicsDefinition class460 = Class240.graphicsDefLoader
									.getGraphicsDefinition(graphicsID, 1232200923);
							if (class460.aBool6277
									&& -1 != 850723107 * class460.anInt6267) {
								AnimationDefinition class549 = (Class394.animationDefLoader
										.getAnimationDefinition(
												850723107 * class460.anInt6267,
												(byte) -29));
								int i_107_ = 1834456867 * class549.anInt7078;
								if (i_107_ == 0 || 2 == i_107_)
									bool_105_ = false;
								else if (i_107_ == 1)
									bool_105_ = true;
							}
						} else {
							GraphicsDefinition class460 = Class240.graphicsDefLoader
									.getGraphicsDefinition(graphicsID, 1232200923);
							GraphicsDefinition class460_108_ = Class240.graphicsDefLoader
									.getGraphicsDefinition(i_106_, 1232200923);
							if (-1 != class460.anInt6267 * 850723107
									&& 850723107 * class460_108_.anInt6267 != -1) {
								AnimationDefinition class549 = (Class394.animationDefLoader
										.getAnimationDefinition(
												class460.anInt6267 * 850723107,
												(byte) -4));
								AnimationDefinition class549_109_ = (Class394.animationDefLoader
										.getAnimationDefinition(
												850723107 * class460_108_.anInt6267,
												(byte) -79));
								if (class549.anInt7076 * -397642129 < class549_109_.anInt7076
										* -397642129)
									bool_105_ = false;
							}
						}
					}
					if (bool_105_) {
						graphics.graphicsID = graphicsID * -1386773949;
						graphics.height = graphicsHeight * -179650045;
						graphics.anInt3938 = -471497347 * i_90_;
						graphics.anInt3937 = i_89_ * 1528521109;
						if (graphicsID != -1) {
							GraphicsDefinition class460 = Class240.graphicsDefLoader
									.getGraphicsDefinition(graphicsID, 1232200923);
							int i_110_ = class460.aBool6277 ? 0 : 2;
							if (bool)
								i_110_ = 1;
							graphics.aClass409_3935.method7351(
									850723107 * class460.anInt6267, speed,
									i_110_, false, -1302211377);
						} else
							graphics.aClass409_3935.method7347(-1, -423255093);
					}
				}
			}
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.CLIENT_SETVARCBIT_SMALL == connection.currentPacket) {
			byte value = stream.readByteA(582493488);
			int key = stream.readUnsignedShortA((byte) 57);
			Class319_Sub1.method16525(1015877960);
			Class95.setVarcBit(key, value, 1927119636);//1
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5281) {
			int i_113_ = stream.getByteA(-1931991254);
			if (i_113_ == 255)
				i_113_ = -1;
			int i_114_ = stream.readUnsignedShortA((byte) 103);
			int i_115_ = stream.readUnsignedLEShortA(929065824);
			int i_116_ = stream.getByteA(-2114959797);
			int i_117_ = stream.readUnsignedShort(1162222719);
			int i_118_ = stream.readByteA(582493488);
			int i_119_ = stream.readUnsignedShortA((byte) 122);
			int i_120_ = stream.readUnsignedByteS((byte) 85) * 4;
			int i_121_ = stream.method14822(1034958835);
			int i_122_ = stream.readUnsignedByte((byte) 19);
			int i_123_ = stream.readUnsignedLEShort((short) 606);
			int i_124_ = stream.readUnsignedLEShortA(-36385129);
			int i_125_ = stream.readByteA(582493488);
			int i_126_ = stream.method14667(-1081071970);
			boolean bool = (i_122_ & 0x1) != 0;
			boolean bool_127_ = (i_122_ & 0x2) != 0;
			int i_128_ = bool_127_ ? i_122_ >> 2 : -1;
			if (bool_127_)
				i_116_ = (byte) i_116_;
			else
				i_116_ *= 4;
			GameScene class522 = client.aClass238_8477.method4806((byte) 1);
			int i_129_ = i_119_ - class522.baseX * 255359026;
			int i_130_ = i_124_ - class522.baseY * 937117386;
			i_125_ += i_129_;
			i_118_ += i_130_;
			if (i_129_ >= 0
					&& i_130_ >= 0
					&& i_129_ < client.aClass238_8477.method4744(-2073733146) * 2
					&& i_130_ < client.aClass238_8477.method4744(-2072878453) * 2
					&& i_125_ >= 0
					&& i_118_ >= 0
					&& i_125_ < client.aClass238_8477.method4745(-13823467) * 2
					&& i_118_ < client.aClass238_8477.method4745(1533000393) * 2
					&& 65535 != i_117_) {
				i_129_ = 256 * i_129_;
				i_130_ = 256 * i_130_;
				i_125_ *= 256;
				i_118_ *= 256;
				i_116_ <<= 2;
				i_120_ <<= 2;
				i_123_ <<= 2;
				Class329.method6029(i_117_, i_121_, i_126_, i_128_, i_116_,
						i_120_, i_129_, i_130_, i_125_, i_118_, i_115_, i_114_,
						i_113_, i_123_, bool, 0, (short) 16383);
			}
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.CLIENT_SETVARCSTR_SMALL == connection.currentPacket) {
			int id = stream.readUnsignedLEShortA(-899888512);
			String string = stream.readString(638243849);
			Class319_Sub1.method16525(1820883228);
			if (RS3Applet.DEBUG) {
				System.out.println("Received global string: "+string+", id="+id);
			}
			Entity.setVarcString(id, string, 1484004327);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5140 == connection.currentPacket) {
			boolean isMainCc = stream.readUnsignedByte((byte) 26) == 1;
			long l = (long) stream.readUnsignedShort(1162222719);
			long l_132_ = (long) stream.readTriByte(1771646547);
			long hash = (l << 32) + l_132_;
			boolean skipMessage = false;
			ClanChannel channel = (isMainCc ? Class324.mainClanChannel : Class239.guestClanChannel);
			if (null == channel) {
				skipMessage = true;
			} else {
				for (int index = 0; index < 100; index++) {
					if (client.chatMessageHashes[index] == hash) {
						skipMessage = true;
						break;
					}
				}
			}
			if (!skipMessage) {
				client.chatMessageHashes[963687043 * client.anInt8539] = hash;
				client.anInt8539 = 330738731 * ((1 + client.anInt8539 * 963687043) % 100);
				String message = Class241_Sub47.huffmanDecrypt(stream, (byte) 89);
				int opcode = isMainCc ? 43 : 46;
				Class337.showChatMessage(opcode, 0, "", "", "", message,
						channel.channelName, -1, (byte) 1);
			}
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5294) {
			Class319_Sub1.method16525(1439066215);
			HitMarkTypeList.method12294(1448273096);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.SKILLS_PACKET) {// Skills
			int skillID = stream.readByteC((byte) 89);// Byte
			Class227.skillTypeList.method11455(skillID, 1948153345);
			int level = stream.readUnsignedByteS((byte) 108);// Byte
			int xp = stream.readInt((byte) 19);// Int
			((Class19) Class1.aClass19_11).skills[skillID].setExperience(xp, 742978135);
			((Class19) Class1.aClass19_11).skills[skillID].setCurrentLevel(level, 1965823486);
			if (RS3Applet.DEBUG) {
				System.out.println("Received skill: id="+skillID+", level="+level+", xp="+xp);
			}
			client.skillUpdates[(client.skillUpdatePointer += 1380191559) * 1837993079 - 1 & 0x1f] = skillID;
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.IF_SETOBJECT == connection.currentPacket) {
			int i_140_ = stream.readUnsignedLEShortA(-2125628);
			int compHash = stream.readIntV2(1274614902);
			int i_142_ = stream.readUnsignedShortA((byte) 46);
			int i_143_ = stream.readUnsignedShortA((byte) 41);
			Class319_Sub1.method16525(1888770897);
			Class477.setComponentObject(compHash, i_142_, i_143_, i_140_, (short) -26314);//8
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5182) {//QC Clan Message
			boolean isMainCc = stream.readUnsignedByte((byte) 95) == 1;
			String name = stream.readString(-1876974884);
			long l = (long) stream.readUnsignedShort(1162222719);
			long l_144_ = (long) stream.readTriByte(1771646547);
			PlayerRights rights = ((PlayerRights) Class531.method11848(
					VarBitType.method5909(1766317249),
					stream.readUnsignedByte((byte) 51), -588789368));
			int messageID = stream.readUnsignedShort(1162222719);
			long hash = (l << 32) + l_144_;
			boolean skipMessage = false;
			//Object object = null;
			ClanChannel channel = (isMainCc ? Class324.mainClanChannel : Class239.guestClanChannel);
			while_91_: do {
				if (null == channel) {
					skipMessage = true;
				} else {
					for (int index = 0; index < 100; index++) {
						if (hash == client.chatMessageHashes[index]) {
							skipMessage = true;
							break while_91_;
						}
					}
					if (rights.ignorable && Class459.isIgnored(name, (byte) -72)) {
						skipMessage = true;
					}
				}
			} while (false);
			if (!skipMessage) {
				client.chatMessageHashes[client.anInt8539 * 963687043] = hash;
				client.anInt8539 = 330738731 * ((1 + 963687043 * client.anInt8539) % 100);
				String message = Class72.aClass625_1100.list(messageID, 941975140)
						.method17177(stream, 1575176070);
				int opcode = isMainCc ? 42 : 45;
				if (1247059781 * rights.chatIcon != -1) {
					Class337.showChatMessage(
							opcode,
							0,
							new StringBuilder()
									.append(Class475_Sub1_Sub5_Sub1
											.method17724(
													rights.chatIcon * 1247059781,
													1721117053)).append(name)
									.toString(),
							new StringBuilder()
									.append(Class475_Sub1_Sub5_Sub1
											.method17724(
													rights.chatIcon * 1247059781,
													224542596)).append(name)
									.toString(), name, message,
									channel.channelName, messageID, (byte) 1);
				} else {
					Class337.showChatMessage(opcode, 0, name, name, name,
							message, channel.channelName, messageID, (byte) 1);
				}
			}
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5176) {
			Class402.soundManager.method1215((byte) 0);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.MESSAGE_FRIENDCHANNEL == connection.currentPacket) {//Friends chat Message
			boolean hasDisplayName = stream.readUnsignedByte((byte) 4) == 1;
			String name = stream.readString(-416450926);
			String nameUnfiltered = name;
			if (hasDisplayName) {
				nameUnfiltered = stream.readString(2147249218);
			}
			String channelPrefix = stream.readString(-363723708);
			long l = (long) stream.readUnsignedShort(1162222719);
			long l_153_ = (long) stream.readTriByte(1771646547);
			PlayerRights rights = ((PlayerRights) Class531.method11848(
					VarBitType.method5909(1766317249),
					stream.readUnsignedByte((byte) 29), -1313178422));
			long hash = l_153_ + (l << 32);
			boolean skipMessage = false;
			while_92_: do {
				for (int i_156_ = 0; i_156_ < 100; i_156_++) {
					if (hash == client.chatMessageHashes[i_156_]) {
						skipMessage = true;
						break while_92_;
					}
				}
				if (rights.ignorable) {
					if (client.aBool8441 && !client.aBool8442 || client.isQcWorld) {
						skipMessage = true;
					} else if (Class459.isIgnored(nameUnfiltered, (byte) -13)) {
						skipMessage = true;
					}
				}
			} while (false);
			if (!skipMessage) {
				client.chatMessageHashes[963687043 * client.anInt8539] = hash;
				client.anInt8539 = 330738731 * ((1 + client.anInt8539 * 963687043) % 100);
				String message = (Class240.stripCode(
						Class241_Sub47.huffmanDecrypt(stream, (byte) 56),
						417256845));
				if (1247059781 * rights.chatIcon != -1) {
					Class337.showChatMessage(9, 0,
							new StringBuilder().append(
									Class475_Sub1_Sub5_Sub1.method17724(1247059781 * rights.chatIcon, 1827450880))
								.append(name).toString(),
							new StringBuilder().append(
									Class475_Sub1_Sub5_Sub1.method17724(1247059781 * rights.chatIcon, 1226680448))
								.append(nameUnfiltered).toString(), name,
							message, channelPrefix, -1, (byte) 1);
				} else {
					Class337.showChatMessage(9, 0, name, nameUnfiltered, name,
							message, channelPrefix, -1, (byte) 1);
				}
			}
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5260) {
			int i_158_ = stream.readUnsignedLEShort((short) 15117);
			Class319_Sub1.method16525(1504873687);
			Class19.method880(i_158_, (short) -7989);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5149) {
			int i_159_ = stream.readLEInt(831441553);
			int i_160_ = stream.readLEInt(897204541);
			Class319_Sub1.method16525(2063307011);
			InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_160_, (byte) -32);
			class58.anInt852 = -1571121665 * i_159_;
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.VARCLAN_DISABLE) {
			Class520.varClanDomain = null;
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5129) {//Message
			String name = stream.readString(1530926763);
			int messageID = stream.readUnsignedShort(1162222719);
			String message = Class72.aClass625_1100.list(messageID,
					-338740128).method17177(stream, 2024058558);
			Class337.showChatMessage(19, 0, name, name, name, message,
					null, messageID, (byte) 1);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.LOBBY_LOGOUT_PACKET) {
			Class362_Sub1.gameLogout(Class13.hasLobby, -284197250);
			connection.currentPacket = null;
			return false;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5227) {
			int i_163_ = stream.readUnsignedShort(1162222719);
			if (i_163_ == 65535) {
				i_163_ = -1;
			}
			int i_164_ = stream.readUnsignedByte((byte) 8);
			int i_165_ = stream.readUnsignedShort(1162222719);
			int i_166_ = stream.readUnsignedByte((byte) -10);
			int i_167_ = stream.readUnsignedShort(1162222719);
			int i_168_ = stream.readUnsignedShort(1162222719);
			Class221 class221 = (Class402.soundManager.method1161(
					Class112.aClass112_1523, Class402.soundManager, i_163_,
					i_164_, i_166_,
					Class130.aClass130_1597.method3067(-960497231),
					Class127.aClass127_1587, 0.0F, 0.0F, null, 0, i_167_,
					false, 1236167870));
			if (class221 != null)
				Class402.soundManager.method1231(class221, i_168_, i_165_,
						-971004782);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.ITEMS_PACKET == connection.currentPacket) {
			int key = stream.readUnsignedShort(1162222719);
			int flags = stream.readUnsignedByte((byte) 30);
			boolean negativeKey = (1 == (flags & 0x1));
			Class230.method4672(key, negativeKey, 16711680);
			int length = stream.readUnsignedShort(1162222719);
			//System.out.println("Received items packet: length="+length+", key="+key);
			for (int slotID = 0; slotID < length; slotID++) {
				int amount = stream.readUnsignedByteS((byte) 105);
				if (255 == amount) {
					amount = stream.readLEInt(1286096256);
				}
				int itemID = stream.readUnsignedShort(1162222719);
				//System.out.println("Received item: amount: "+amount+", id: "+id+", key: "+key);
				ServerConnection.method3910(key, slotID, itemID - 1, amount, negativeKey, -110075473);
			}
			client.itemContainerUpdates[(client.itemContainerUpdatePointer += 1789825217) * 1774059329 - 1 & 0x1f] = key;
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.UPDATE_ITEMS_PACKET) {
			int key = stream.readUnsignedShort(1162222719);
			int flags = stream.readUnsignedByte((byte) 48);
			boolean negativeKey = 1 == (flags & 0x1);
			while (421967667 * stream.pointer < connection.incommingPacketSize * 1912225577) {
				int slotID = stream.readSmart((short) -5633);
				int itemID = stream.readUnsignedShort(1162222719);
				int amount = 0;
				if (itemID != 0) {
					amount = stream.readUnsignedByte((byte) -88);
					if (255 == amount) {
						amount = stream.readInt((byte) 38);
					}
				}
				//System.out.println("Updating item at slot="+slotID+", item="+itemID+", amount="+amount);
				ServerConnection.method3910(key, slotID, itemID - 1, amount, negativeKey, 234447755);
			}
			client.itemContainerUpdates[(client.itemContainerUpdatePointer += 1789825217) * 1774059329 - 1 & 0x1f] = key;
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.IF_SETPOSITION == connection.currentPacket) {
			int posX = stream.readShortA(587241409);
			int compHash = stream.readIntV2(1274614902);
			int posY = stream.readShort((byte) 60);
			Class319_Sub1.method16525(1848899233);
			Class9.setComponentPosition(compHash, posX, posY, -1319925016);//11
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.IF_SETANIM == connection.currentPacket) {
			int animID = stream.readLEInt(931545828);
			int compHash = stream.readIntV1((short) 7611);
			Class319_Sub1.method16525(850327452);
			Class120_Sub2.setComponentAnimation(compHash, animID, (byte) 5);//5
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5144) {
			int i_185_ = stream.readInt((byte) 49);
			if (Class111.anInt1513 * 1506923943 != i_185_) {
				Class111.anInt1513 = i_185_ * 1711374871;
				Class561.method12372(Class614.aClass614_7825, -1, -1, 426334577);
			}
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5133 == connection.currentPacket) {
			int i_186_ = stream.readUnsignedShort(1162222719);
			if (65535 == i_186_)
				i_186_ = -1;
			int i_187_ = stream.readUnsignedByte((byte) -2);
			int i_188_ = stream.readUnsignedShort(1162222719);
			int i_189_ = stream.readUnsignedByte((byte) -10);
			Class402.soundManager.method1162(Class112.aClass112_1523, i_186_,
					i_187_, i_189_,
					Class130.aClass130_1603.method3067(-960497231),
					Class127.aClass127_1587, 0.0F, 0.0F, null, 0, 256, i_188_,
					827445396);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5212 == connection.currentPacket) {
			client.anInt8316 = stream.readShortA(1581915964) * 1620939783;
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5163) {
			int interfaceID = stream.readUnsignedShortA((byte) 80);
			int x2 = stream.readInt((byte) 15);
			int x1 = stream.readLEInt(-539046626);
			int x0 = stream.readInt((byte) 3);
			int parentHash = stream.readInt((byte) 123);
			int i_195_ = stream.readInt((byte) 101);
			int i_196_ = stream.readUnsignedByteS((byte) 53);
			int i_197_ = i_196_ >> 2;
			int i_198_ = i_196_ & 0x3;
			GameScene class522 = new GameScene(stream.readIntV2(1274614902));
			int clipped = stream.readByteC((byte) 60);
			int x3 = stream.readIntV1((short) 10272);
			Class319_Sub1.method16525(-42600738);
			Class595.method13079(parentHash, new Class241_Sub11_Sub2(interfaceID,
					clipped, new Class449(class522, i_197_, i_198_, i_195_)),
					new int[] { x0, x1, x2, x3 }, false, (byte) 0);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5174) {
			int compHash = stream.readLEInt(1523090181);
			int i_202_ = stream.readUnsignedShort(1162222719);
			int i_203_ = stream.readLEInt(-168497317);
			Class319_Sub1.method16525(-565227406);
			GeneralMapList.setInterfaceModel(compHash, 5, i_202_, i_203_, -880068799);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5135) {
			int i_204_ = stream.readUnsignedByte((byte) 25);
			Class432 class432 = ((Class432) Class531.method11848(
					Class613.method13244((byte) 61), i_204_, 1808955892));
			if (class432 == null)
				class432 = Class432.aClass432_6107;
			Class528.method11824(class432, (byte) 67);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5155) {
			boolean bool = stream.readUnsignedByte((byte) 68) == 1;
			if (bool)
				Class592.method12924(4, -1458961770);
			else
				Class592.method12924(3, -330646251);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5169 == connection.currentPacket) {
			int i_205_ = stream.readUnsignedByte((byte) -63);
			int i_206_ = stream.readUnsignedShortA((byte) 28);
			int i_207_ = stream.readUnsignedByteS((byte) 30);
			int i_208_ = stream.readUnsignedByteS((byte) 68);
			int i_209_ = stream.readByteC((byte) 53);
			Class319_Sub1.method16525(-611495424);
			client.aBoolArray8517[i_205_] = true;
			client.anIntArray8367[i_205_] = i_208_;
			client.anIntArray8413[i_205_] = i_209_;
			client.anIntArray8549[i_205_] = i_207_;
			client.anIntArray8550[i_205_] = i_206_;
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.OBJECT_ANIMATION_PACKET) {
			int i_210_ = stream.readByteC((byte) 11);
			int animationID = stream.readIntV1((short) 11105);
			int typeHash = stream.readByteC((byte) 29);
			int type = typeHash >> 2;
			int rotation = typeHash & 0x3;
			int i_215_ = client.anIntArray8351[type];
			int locationHash = stream.readLEInt(-261345401);
			int plane = locationHash >> 28 & 0x3;
			int posX = locationHash >> 14 & 0x3fff;
			int posY = locationHash & 0x3fff;
			GameScene class522 = client.aClass238_8477.method4806((byte) 1);
			posX -= class522.baseX * 127679513;
			posY -= class522.baseY * 468558693;
			Class462.method10658(plane, posX, posY, i_215_, type,
					rotation, animationID, i_210_, 229717895);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5254) {
			byte i_220_ = stream.getByte(-1479059528);
			Class21.myPlayer.decodeAppearance(stream,
					i_220_, (short) -25334);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5245 == connection.currentPacket) {
			stream.readUnsignedShort(1162222719);
			stream.readUnsignedByte((byte) 64);
			stream.readString(-1002189387);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5287 == connection.currentPacket) {
			int i_221_ = stream.readByteC((byte) 30);
			int i_222_ = stream.readUnsignedLEShort((short) 758);
			if (i_222_ == 65535)
				i_222_ = -1;
			Class402.soundManager.method1169(i_222_, i_221_, -397390243);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.MESSAGE_PUBLIC == connection.currentPacket) {
			//System.out.println("Received message.");
			int playerIndex = stream.readUnsignedShort(1162222719);
			Player player;
			if (client.myPlayerIndex * 1124115145 == playerIndex) {
				player = Class21.myPlayer;
			} else {
				player = client.localPlayers[playerIndex];
			}
			if (null == player) {
				//System.out.println("Player is null. Index="+playerIndex);
				connection.currentPacket = null;
				return true;
			}
			int effects = stream.readUnsignedShort(1162222719);
			PlayerRights rights = ((PlayerRights) Class531.method11848(
					VarBitType.method5909(1766317249),
					stream.readUnsignedByte((byte) 82), -1597937257));
			boolean isQuickMessage = 0 != (effects & 0x8000);
			if (player.nameUnfiltered != null && player.aClass490_11499 != null) {
				boolean skipMessage = false;
				if (rights.ignorable) {
					if (!isQuickMessage && (client.aBool8441 && !client.aBool8442 || client.isQcWorld)) {
						skipMessage = true;
					} else if (Class459.isIgnored(player.nameUnfiltered, (byte) -15)) {
						skipMessage = true;
					}
				}
				if (!skipMessage) {
					int i_226_ = -1;
					String message;
					if (isQuickMessage) {
						effects &= 0x7fff;
						Class333 class333 = Class120_Sub23.method16854(stream, -1335109491);
						i_226_ = -1422545021 * class333.anInt5058;
						message = class333.aClass241_Sub39_Sub9_5059.method17177(stream, 1722977889);
					} else {
						message = Class240.stripCode(
								Class241_Sub47.huffmanDecrypt(stream, (byte) 78),
								417256845);
					}
					//System.out.println("Message: "+message);
					player.setOverheadMessage(message.trim(),
							effects >> 8, effects & 0xff, (byte) 5);
					int opcode;
					if (rights.bypassChatFilter) {
						opcode = isQuickMessage ? 17 : 1;
					} else {
						opcode = isQuickMessage ? 17 : 2;
					}
					if (-1 != 1247059781 * rights.chatIcon) {
						Class337.showChatMessage(
								opcode,
								0,
								new StringBuilder()
										.append(Class475_Sub1_Sub5_Sub1
												.method17724(rights.chatIcon * 1247059781, 491402568))
										.append(player.getFormattedName(true, -1034674220))
										.toString(),
								new StringBuilder()
										.append(Class475_Sub1_Sub5_Sub1
												.method17724(
														rights.chatIcon * 1247059781,
														1919047168))
										.append(player.getName(false, -122333825))
										.toString(),
										player.nameFiltered,
										message, null, i_226_, (byte) 1);
					} else {
						Class337.showChatMessage(opcode, 0,
								player.getFormattedName(true, 543004307),
								player.getName(false, -122333825),
								player.nameFiltered,
								message, null, i_226_, (byte) 1);
					}
				}
			}
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5145) {
			Class216.method4349(stream,
					connection.incommingPacketSize * 1912225577,
					(byte) 115);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.NPC_UPDATE_PACKET) {
			Class563.decodeNPCUpdate(false, 1670740698);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5161) {//QC Message
			boolean hasFilteredName = stream.readUnsignedByte((byte) 27) == 1;
			String name = stream.readString(-1217226427);
			String nameUnfiltered = name;
			if (hasFilteredName) {
				nameUnfiltered = stream.readString(1771901857);
			}
			String prefix = stream.readString(-1656890258);
			long l = (long) stream.readUnsignedShort(1162222719);
			long l_230_ = (long) stream.readTriByte(1771646547);
			PlayerRights rights = ((PlayerRights) Class531.method11848(
					VarBitType.method5909(1766317249),
					stream.readUnsignedByte((byte) -83), 1195958461));
			int messageID = stream.readUnsignedShort(1162222719);
			long hash = (l << 32) + l_230_;
			boolean skipMessage = false;
			while_93_: do {
				for (int i_234_ = 0; i_234_ < 100; i_234_++) {
					if (client.chatMessageHashes[i_234_] == hash) {
						skipMessage = true;
						break while_93_;
					}
				}
				if (rights.ignorable && Class459.isIgnored(nameUnfiltered, (byte) -9)) {
					skipMessage = true;
				}
			} while (false);
			if (!skipMessage) {
				client.chatMessageHashes[client.anInt8539 * 963687043] = hash;
				client.anInt8539 = 330738731 * ((client.anInt8539 * 963687043 + 1) % 100);
				String message = Class72.aClass625_1100.list(messageID,
						-1500894235).method17177(stream, 1529076314);
				if (-1 != 1247059781 * rights.chatIcon) {
					Class337.showChatMessage(
							20,
							0,
							new StringBuilder()
									.append(Class475_Sub1_Sub5_Sub1
											.method17724(
													1247059781 * rights.chatIcon,
													279471294)).append(name)
									.toString(),
							new StringBuilder()
									.append(Class475_Sub1_Sub5_Sub1
											.method17724(
													rights.chatIcon * 1247059781,
													315419250))
									.append(nameUnfiltered).toString(), name,
									message, prefix, messageID, (byte) 1);
				} else {
					Class337.showChatMessage(20, 0, name, nameUnfiltered, name,
							message, prefix, messageID, (byte) 1);
				}
			}
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.UPDATE_RUNENERGY == connection.currentPacket) {
			client.anInt8470 = stream.readUnsignedByte((byte) 10) * -694893465;
			client.anInt8271 = -674075855 * client.anInt8494;
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.IF_SETTEXT) {
			int componentHash = stream.readIntV2(1274614902);
			String text = stream.readString(1882178617);
			if (RS3Applet.DEBUG) {
				System.out.println("Received interface component text: "+text+", iFace="+(componentHash >> 16)+", compID="+(componentHash & 0xffff));
			}
			Class319_Sub1.method16525(1856129277);
			Class552.setIfaceComponentText(componentHash, text, 776983355);//3
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.STATIC_MAP_REGION_PACKET == connection.currentPacket) {
			RSBitBuffer bitBuff = new RSBitBuffer(
					1912225577 * connection.incommingPacketSize);
			System.arraycopy(
					(connection.inputBuffer.payload),
					(connection.inputBuffer.pointer) * 421967667,
					bitBuff.payload, 0,
					1912225577 * connection.incommingPacketSize);
			Class211.method4286((byte) 27);
			if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub3_8885
					.method14100((short) -8532) == 1)
				Class277.aClass236_4389.method4707(new Class234(
						MapType.STATIC_MAP, bitBuff), -998091378);
			else
				client.aClass238_8477.setMapScene(new Class234(
						MapType.STATIC_MAP, bitBuff), 1975322345);
			connection.currentPacket = null;
			return false;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5207) {
			if (-1 != client.anInt8466 * 1629309841)
				Class298.method5735(client.anInt8466 * 1629309841, 0, (byte) -115);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5265 == connection.currentPacket) {
			if (Class442.aBool6160 && Class228.aFrame2674 != null)
				Class537.method11899(
						Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub30_8878
								.method14386(-801965113), -1, -1, false,
						1482319719);
			byte[] is = new byte[connection.incommingPacketSize * 1912225577];
			stream.readEncodeBytes(is, 0,
					(1912225577 * connection.incommingPacketSize),
					-427418430);
			String string = Class95.getMessageFromBytes(is, 0,
					(1912225577 * connection.incommingPacketSize),
					-949072930);
			Class446.method7895(string, true, client.aBool8440, -1815142638);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5291 == connection.currentPacket) {
			Class529.decodeWorldUpdatePacket(SubIncommingOpcode.aClass341_5300, -1969393403);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5196 == connection.currentPacket) {
			String string = stream.readString(-1312260225);
			OutgoingOpcode.method5024(string, (byte) 13);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5239 == connection.currentPacket) {
			Class473 class473 = new Class473();
			boolean bool = class473.method10785(stream, (short) 465);
			client.aClass238_8477.method4833(-153294338).method11379(
					client.aClass238_8477, bool ? class473 : null,
					class473.method10828(-473734350), (short) 500);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5293) {
			int i_238_ = stream.readIntV1((short) 29799);
			int i_239_ = stream.readIntV1((short) 13721);
			Class319_Sub1.method16525(258992519);
			Class241_Sub11 class241_sub11 = ((Class241_Sub11) client.aClass407_8467
					.get((long) i_238_));
			Class241_Sub11 class241_sub11_240_ = ((Class241_Sub11) client.aClass407_8467
					.get((long) i_239_));
			if (null != class241_sub11_240_)
				Class40.method1047(
						class241_sub11_240_,
						(class241_sub11 == null || (-443552671
								* class241_sub11.interfaceID != (class241_sub11_240_.interfaceID * -443552671))),
						false, -1439989229);
			if (class241_sub11 != null) {
				class241_sub11.remove((byte) 36);
				client.aClass407_8467.put(class241_sub11, (long) i_239_);
			}
			InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_238_, (byte) -39);
			if (null != class58)
				WorldType.refreshComponent(class58, 1568446070);
			class58 = Js5ConfigGroup.getInterfaceComponent(i_239_, (byte) -125);
			if (null != class58) {
				WorldType.refreshComponent(class58, 1251088953);
				Class380.method6882(
						(Class187.aClass35Array2203[445907013 * class58.componentHash >>> 16]),
						class58, true, 1963781627);
			}
			if (-1 != client.anInt8466 * 1629309841)
				Class298.method5735(1629309841 * client.anInt8466, 1,
						(byte) -106);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.WORLD_TILE_PACKET == connection.currentPacket) {
			Class65.baseTileX = (stream.getByte(1036172041) << 3) * 360690737;
			Class323.basePlane = stream.getByteA(-2019361736) * -1045599855;
			Class74.baseTileY = (stream.readByteA(582493488) << 3) * -771490083;
			//System.out.println("World tile: x="+(-585685807 * Class65.baseTileX)+", y="+(902154613 * Class74.baseTileY));
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.VARPBIT_SMALL == connection.currentPacket) {
			int key = stream.readUnsignedLEShort((short) 25698);
			int value = stream.readUnsignedByteS((byte) 106);
			Class1.aClass19_11.varPlayerDomain.setVarBit(
					Class541.aClass199_Sub1_7008.list(key, (byte) -72), 
					value, -375049495);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5198) {
			int interfaceHash = stream.readLEInt(-1461606683);
			Class319_Sub1.method16525(-188884035);
			GeneralMapList.setInterfaceModel(interfaceHash, 3, 1124115145 * client.myPlayerIndex, 0, -1961184604);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5219 == connection.currentPacket) {//Hide?
			int i_244_ = stream.readIntV2(1274614902);
			boolean bool = stream.getByteA(-2117393715) == 1;
			Class319_Sub1.method16525(631878678);
			Class628_Sub1.method14328(i_244_, bool, (short) -1677);//23
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5280 == connection.currentPacket) {
			int i_245_ = stream.readIntV1((short) 32405);
			int i_246_ = stream.readIntV2(1274614902);
			int i_247_ = stream.getByteA(-2109746365);
			int i_248_ = stream.readUnsignedByteS((byte) 14);
			int i_249_ = stream.getByteA(-2021107687);
			int i_250_ = i_246_ >> 28;
			int i_251_ = i_246_ >> 14 & 0x3fff;
			int i_252_ = i_246_ & 0x3fff;
			Class402.soundManager.method1170(i_245_, i_248_, true, i_250_,
					i_251_ << 9, i_252_ << 9, i_249_ << 9, i_247_ << 9,
					-644343173);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.RESET_CLIENT_VARCACHE) {
			Class1.aClass19_11.varPlayerDomain.method11638((short) 29292);
			client.varpChangePointer += 1584994784;
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5226) {
			int i_253_ = stream.readUnsignedLEShort((short) 18995);
			Class319_Sub1.method16525(-350446020);
			Class578.method12700(i_253_, 1447474908);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.SET_CAMERA_POS_PACKET == connection.currentPacket) {
			int moveZ = stream.readUnsignedLEShort((short) 11858) << 2;
			int moveLocalX = stream.getByteA(-2054187017);
			int speed1 = stream.readByteC((byte) 38);
			int speed2 = stream.readUnsignedByteS((byte) 62);
			int moveLocalY = stream.getByteA(-2138449679);
			Class319_Sub1.method16525(1559801739);
			Class336.method6081(moveLocalX, moveLocalY, moveZ, speed1, speed2, true, (byte) -40);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5221 == connection.currentPacket) {
			Class402.soundManager.method1153(Class130.aClass130_1603.method3067(-960497231), -1115616708);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.RUNCLIENTSCRIPT == connection.currentPacket) {
			String paramString = stream.readString(-17121931);
			Object[] paramaters = new Object[paramString.length() + 1];
			for (int i_259_ = paramString.length() - 1; i_259_ >= 0; i_259_--) {
				if (paramString.charAt(i_259_) == 's') {
					paramaters[1 + i_259_] = stream.readString(1424305055);
				} else {
					paramaters[i_259_ + 1] = new Integer(stream.readInt((byte) 2));
				}
			}
			paramaters[0] = new Integer(stream.readInt((byte) 97));
			if (RS3Applet.DEBUG) {
				System.out.println("Runscript: " + Arrays.toString(paramaters));
			}
			Class319_Sub1.method16525(153489791);
			ClientScriptCaller scriptCaller = new ClientScriptCaller();
			scriptCaller.paramaters = paramaters;
			Class42.method1067(scriptCaller, 124835554);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5217) {
			int i_260_ = stream.readUnsignedShort(1162222719);
			Class402.soundManager.method1146(i_260_, 229579761);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.CLANCHANNEL_DELTA == connection.currentPacket) {
			client.lastClanChannelUpdate = client.anInt8494 * -1710652333;
			boolean isMainCc = stream.readUnsignedByte((byte) 73) == 1;
			ClanChannelDelta delta = new ClanChannelDelta(stream);
			ClanChannel channel;
			if (isMainCc) {
				channel = Class324.mainClanChannel;
			} else {
				channel = Class239.guestClanChannel;
			}
			delta.applyToClanChannel(channel, -245903231);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5187) {
			Class445_Sub16.aClass351_Sub1_8660.method16834(stream,
					1912225577 * connection.incommingPacketSize, (short) -370);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.IF_OPENSUB_ACTIVE_PLAYER) {
			int xtea2 = stream.readIntV1((short) 27385);
			int clipped = stream.readByteC((byte) 15);
			int parentHash = stream.readIntV2(1274614902);
			int xtea3 = stream.readLEInt(1568689461);
			int xtea1 = stream.readIntV2(1274614902);
			int playerIndex = stream.readUnsignedLEShortA(1733501138);
			int xtea0 = stream.readIntV2(1274614902);
			int interfaceID = stream.readUnsignedShort(1162222719);
			Class319_Sub1.method16525(331067801);
			Class595.method13079(parentHash, 
					new Class241_Sub11_Sub4(interfaceID, clipped, playerIndex),
					new int[] { xtea0, xtea1, xtea2, xtea3 }, false,
					(byte) 0);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.FRIENDS_CHANNEL_UPDATE_PACKET) {//Friends chat update
			String displayName = stream.readString(1456399455);
			boolean hasReplyName = stream.readUnsignedByte((byte) -96) == 1;
			String replyToName;
			if (hasReplyName) {
				replyToName = stream.readString(498221970);
			} else {
				replyToName = displayName;
			}
			int nodeID = stream.readUnsignedShort(1162222719);
			byte rank = stream.getByte(-166740667);
			boolean remove = false;
			if (rank == -128) {
				remove = true;
			}		
			if (remove) {
				if (0 == -612332369 * Class357_Sub1.currentFcSize) {
					connection.currentPacket = null;
					return true;
				}
				//boolean bool_273_ = false;
				int index;
				for (index = 0; (index < Class357_Sub1.currentFcSize * -612332369 
						&& (!Class350.currentFcUsers[index].replyToName.equals(replyToName) 
						|| nodeID != 1494319203 * (Class350.currentFcUsers[index].nodeID))); index++) {
					/* empty */
				}
				if (index < Class357_Sub1.currentFcSize * -612332369) {
					for (/**/; index < -612332369 * Class357_Sub1.currentFcSize - 1; index++) {
						Class350.currentFcUsers[index] = Class350.currentFcUsers[index + 1];
					}
					Class357_Sub1.currentFcSize -= 1584810575;
					Class350.currentFcUsers[(-612332369 * Class357_Sub1.currentFcSize)] = null;
				}
			} else {
				String worldName = stream.readString(1521246567);
				FriendsChatUser fcUser = new FriendsChatUser();
				fcUser.displayName = displayName;
				fcUser.replyToName = replyToName;
				fcUser.protocolName = Class482.formatStringForProtocol(
						fcUser.replyToName, Class524.aClass600_6822,
						(byte) 66);
				fcUser.nodeID = 752157003 * nodeID;
				fcUser.rank = rank;
				fcUser.worldName = worldName;
				int addIndex;
				for (addIndex = Class357_Sub1.currentFcSize * -612332369 - 1; addIndex >= 0; addIndex--) {
					int comparison = Class350.currentFcUsers[addIndex].protocolName.compareTo(fcUser.protocolName);
					if (0 == comparison) {//Update request
						Class350.currentFcUsers[addIndex].nodeID = nodeID * 752157003;
						Class350.currentFcUsers[addIndex].rank = rank;
						Class350.currentFcUsers[addIndex].worldName = worldName;
						if (replyToName.equals(Class21.myPlayer.nameUnfiltered)) {
							NPC.myCurrentFcRank = rank;
						}
						client.lastFriendsChatUpdate = client.anInt8494 * -1375606821;
						connection.currentPacket = null;
						return true;
					}
					if (comparison < 0) {
						break;
					}
				}
				if (Class357_Sub1.currentFcSize * -612332369 >= Class350.currentFcUsers.length) {
					connection.currentPacket = null;
					return true;
				}
				for (int index = -612332369 * Class357_Sub1.currentFcSize - 1; index > addIndex; index--) {
					Class350.currentFcUsers[index + 1] = Class350.currentFcUsers[index];
				}
				if (0 == -612332369 * Class357_Sub1.currentFcSize) {
					Class350.currentFcUsers = new FriendsChatUser[100];
				}
				Class350.currentFcUsers[addIndex + 1] = fcUser;
				Class357_Sub1.currentFcSize += 1584810575;
				if (replyToName.equals(Class21.myPlayer.nameUnfiltered)) {
					NPC.myCurrentFcRank = rank;
				}
			}
			client.lastFriendsChatUpdate = -1375606821 * client.anInt8494;
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.VARCLAN_ENABLE == connection.currentPacket) {
			Class520.varClanDomain = new SparseVarDomain(Class443.VAR_CLAN_LIST);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5147 == connection.currentPacket) {
			int i_279_ = stream.readUnsignedByte((byte) -94);
			int i_280_ = stream.readBigSmart((byte) -29);
			if (null != client.aClass246Array8302[i_279_]) {
				client.aClass246Array8302[i_279_].method4935(
						client.aClass238_8477.method4751(-2117014011),
						-2057373030);
				client.aClass246Array8302[i_279_] = null;
			}
			if (-1 != i_280_) {
				client.aClass246Array8302[i_279_] = new Class246(
						Class236.aClass103_2713, stream, i_280_);
			}
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5200 == connection.currentPacket) {
			Class529.decodeWorldUpdatePacket(SubIncommingOpcode.aClass341_5302, -1976701881);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.IF_CLOSESUB == connection.currentPacket) {
			int parentHash = stream.readIntV1((short) 12052);
			Class319_Sub1.method16525(1188339985);
			Class241_Sub11 class241_sub11 = ((Class241_Sub11) client.aClass407_8467.get((long) parentHash));
			if (class241_sub11 != null) {
				Class40.method1047(class241_sub11, true, false, -1302435175);
			}
			if (client.aClass58_8384 != null) {
				WorldType.refreshComponent(client.aClass58_8384, -1101937761);
				client.aClass58_8384 = null;
			}
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.MESSAGE_PRIVATE_ECHO == connection.currentPacket) {//Outgoing Message
			String displayName = stream.readString(1261617288);
			String message = Class240.stripCode(Class241_Sub47.huffmanDecrypt(stream, (byte) 40), 417256845);
			Class318.appendChatboxMessage(6, 0, displayName, displayName, displayName, message, -1934311570);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.IF_SETSCROLLPOS) {//Scroll?
			int compHash = stream.readIntV2(1274614902);
			int scroll = stream.readUnsignedShortA((byte) 127);
			Class319_Sub1.method16525(1944377786);
			Class456.setComponentScroll(compHash, scroll, 459109515);//12
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.PLAYER_UPDATE_PACKET) {
			ClientScriptMap.decodePlayerUpdates(stream,
					1912225577 * connection.incommingPacketSize,
					850051792);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5143 == connection.currentPacket) {
			Class529.decodeWorldUpdatePacket(SubIncommingOpcode.aClass341_5301, -1678486092);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5206) {
			stream.pointer += -1889333388;
			if (stream.method14669(-625753720)) {
				Class611.method13229(stream, (421967667 * stream.pointer - 28), (byte) 2);
			}
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.CLANCHANNEL_FULL) {
			client.lastClanChannelUpdate = -1710652333 * client.anInt8494;
			boolean isMainCc = stream.readUnsignedByte((byte) -72) == 1;
			if (connection.incommingPacketSize * 1912225577 == 1) {
				if (isMainCc) {
					Class324.mainClanChannel = null;
				} else {
					Class239.guestClanChannel = null;
				}
				connection.currentPacket = null;
				return true;
			}
			if (isMainCc) {
				Class324.mainClanChannel = new ClanChannel(stream);
			} else {
				System.out.println("Initing guest clan channel.");
				Class239.guestClanChannel = new ClanChannel(stream);
			}
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5242) {
			int i_285_ = stream.readUnsignedShort(1162222719);
			int i_286_ = stream.readUnsignedShort(1162222719);
			int i_287_ = stream.readUnsignedShort(1162222719);
			Class402.soundManager.method1174(i_285_, i_286_, i_287_, -2019458075);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.VARPBIT_LARGE == connection.currentPacket) {
			int key = stream.readUnsignedLEShortA(58753603);
			int value = stream.readIntV2(1274614902);
			Class1.aClass19_11.varPlayerDomain.setVarBit(
					Class541.aClass199_Sub1_7008.list(key, (byte) -46),
					value, -576834300);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.INTERFACE_SETTINGS_PACKET == connection.currentPacket) {
			int iFaceHash = stream.readIntV1((short) 13181);// Int
			int toSlot = stream.readUnsignedShortA((byte) 28);// Short
			if (toSlot == 65535) {
				toSlot = -1;
			}
			int fromSlot = stream.readUnsignedShortA((byte) 15);// Short
			if (fromSlot == 65535) {
				fromSlot = -1;
			}
			int settings = stream.readIntV2(1274614902);// Int
			if (RS3Applet.DEBUG) {
				System.out.println("IfaceSettings: interface=" + (iFaceHash >> 16)+", compID="+(iFaceHash & 0xffff) + ", fromSlot=" + fromSlot + ", toSlot=" + toSlot + ", settings=" + settings);
			}
			Class319_Sub1.method16525(1809970040);
			for (int slotID = fromSlot; slotID <= toSlot; slotID++) {
				long l = ((long) iFaceHash << 32) + (long) slotID;
				Class241_Sub20 class241_sub20 = (Class241_Sub20) client.aClass407_8519.get(l);
				Class241_Sub20 class241_sub20_295_;
				if (null == class241_sub20) {
					if (-1 == slotID) {
						class241_sub20_295_ = new Class241_Sub20(settings,
								(Js5ConfigGroup.getInterfaceComponent(iFaceHash, (byte) -114).aClass241_Sub20_922.anInt9008)
										* -1892353525);
					} else {
						class241_sub20_295_ = new Class241_Sub20(settings, -1);
					}
				} else {
					class241_sub20_295_ = new Class241_Sub20(settings, (class241_sub20.anInt9008 * -1892353525));
					class241_sub20.remove((byte) 36);
				}
				client.aClass407_8519.put(class241_sub20_295_, l);
			}
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5199) {
			int i_296_ = stream.readLEInt(244866542);
			Class319_Sub1.method16525(1005853127);
			if (i_296_ == -1) {
				Class245.anInt3961 = -1540801703;
				Class254.anInt4134 = -162819257;
			} else {
				GameScene class522 = client.aClass238_8477.method4806((byte) 1);
				int i_297_ = i_296_ >> 14 & 0x3fff;
				int i_298_ = i_296_ & 0x3fff;
				i_297_ -= 127679513 * class522.baseX;
				if (i_297_ < 0)
					i_297_ = 0;
				else if (i_297_ >= client.aClass238_8477
						.method4744(-1450302641))
					i_297_ = client.aClass238_8477.method4744(-1362322354);
				i_298_ -= class522.baseY * 468558693;
				if (i_298_ < 0)
					i_298_ = 0;
				else if (i_298_ >= client.aClass238_8477.method4745(-434202344))
					i_298_ = client.aClass238_8477.method4745(669911020);
				Class245.anInt3961 = (256 + (i_297_ << 9)) * 1540801703;
				Class254.anInt4134 = 162819257 * ((i_298_ << 9) + 256);
			}
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5257) {
			Class529.decodeWorldUpdatePacket(SubIncommingOpcode.aClass341_5310, -1771137052);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.SYSTEM_UPDATE_PACKET == connection.currentPacket) {
			if (Class523.method11733(client.anInt8288 * 1766317249, 263589217)) {
				client.systemUpdateTimer = (int) ((float) stream.readUnsignedShort(1162222719) * 2.5F) * -1917854577;
			} else {
				client.systemUpdateTimer = stream.readUnsignedShort(1162222719) * -1701062462;
			}
			client.anInt8271 = -674075855 * client.anInt8494;
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5214 == connection.currentPacket) {
			client.aBool8444 = stream.readUnsignedByte((byte) 104) == 1;
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5142) {
			Class74.baseTileY = (stream.readByteS((byte) 1) << 3) * -771490083;
			Class65.baseTileX = (stream.readByteS((byte) 1) << 3) * 360690737;
			Class323.basePlane = stream.getByteA(-1940970519) * -1045599855;
			if (RS3Applet.DEBUG) {
				System.out.println("Packet 23: baseTileY=" + (Class74.baseTileY * 902154613)
					+ ", baseTileX=" + (Class65.baseTileX * -585685807) + ", basePlane="
					+ (Class323.basePlane * 1061320561));
			}
			GameScene lastRegion = client.aClass238_8477.method4806((byte) 1);
			for (WorldTile tile = ((WorldTile) client.aClass407_8452.method7294(2090894173)); 
					tile != null; 
					tile = ((WorldTile) client.aClass407_8452.method7295(2141427004))) {
				int tilePlane = (int) ((4356572401218184725L * tile.hashCode >> 28) & 0x3L);
				int tileX = (int) (tile.hashCode * 4356572401218184725L & 0x3fffL);
				int xOffset = tileX - lastRegion.baseX * 127679513;
				int tileY = (int) ((tile.hashCode * 4356572401218184725L >> 14) & 0x3fffL);
				int yOffset = tileY - 468558693 * lastRegion.baseY;
				if (Class323.basePlane * 1061320561 == tilePlane
						&& xOffset >= -585685807 * Class65.baseTileX
						&& xOffset < -585685807 * Class65.baseTileX + 8
						&& yOffset >= Class74.baseTileY * 902154613
						&& yOffset < 8 + 902154613 * Class74.baseTileY) {
					tile.remove((byte) 36);
					if (xOffset >= 0 && yOffset >= 0
							&& (xOffset < client.aClass238_8477.method4744(-1501305006))
							&& (yOffset < client.aClass238_8477.method4745(616718659))) {
						Class39.method1041(Class323.basePlane * 1061320561,
								xOffset, yOffset, -1246071661);
					}
				}
			}
			for (WorldObject class241_sub30 = ((WorldObject) WorldObject.aClass429_10039.method7694(16711935)); 
					class241_sub30 != null; 
					class241_sub30 = (WorldObject) WorldObject.aClass429_10039.method7692(119027722)) {
				if ((1204421839 * class241_sub30.posX >= Class65.baseTileX * -585685807)
						&& (class241_sub30.posX * 1204421839 < 8 + -585685807 * Class65.baseTileX)
						&& (-320018831 * class241_sub30.posY >= 902154613 * Class74.baseTileY)
						&& (-320018831 * class241_sub30.posY < 902154613 * Class74.baseTileY + 8)
						&& (1061320561 * Class323.basePlane == (-603972145 * ((WorldObject) class241_sub30).plane))) {
					((WorldObject) class241_sub30).aBool10046 = true;
				}
			}
			for (WorldObject class241_sub30 = ((WorldObject) WorldObject.aClass429_10053.method7694(16711935)); 
					class241_sub30 != null; 
					class241_sub30 = (WorldObject) WorldObject.aClass429_10053.method7692(1987333500)) {
				if ((1204421839 * class241_sub30.posX >= -585685807 * Class65.baseTileX)
						&& (1204421839 * class241_sub30.posX < 8 + -585685807 * Class65.baseTileX)
						&& (-320018831 * class241_sub30.posY >= 902154613 * Class74.baseTileY)
						&& (-320018831 * class241_sub30.posY < 8 + Class74.baseTileY * 902154613)
						&& (Class323.basePlane * 1061320561 == (-603972145 * ((WorldObject) class241_sub30).plane))) {
					((WorldObject) class241_sub30).aBool10046 = true;
				}
			}
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.DYNAMIC_MAP_REGION_PACKET == connection.currentPacket) {
			RSBitBuffer class241_sub3_sub1_304_ = new RSBitBuffer(
					connection.incommingPacketSize * 1912225577);
			System.arraycopy(
					connection.inputBuffer.payload,
					connection.inputBuffer.pointer * 421967667,
					class241_sub3_sub1_304_.payload, 0,
					1912225577 * connection.incommingPacketSize);
			Class211.method4286((byte) -69);
			if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub3_8885
					.method14100((short) -14024) == 1) {
				Class277.aClass236_4389.method4707(new Class234(
						MapType.aClass235_2703, class241_sub3_sub1_304_),
						1439606198);
			} else {
				client.aClass238_8477.setMapScene(new Class234(
						MapType.aClass235_2703, class241_sub3_sub1_304_),
						1814390441);
			}
			connection.currentPacket = null;
			return false;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5203) {
			int i_305_ = stream.readUnsignedLEShort((short) 18181);
			int i_306_ = stream.readLEInt(765318955);
			int compHash = stream.readInt((byte) 29);
			Class319_Sub1.method16525(1103957177);
			GeneralMapList.setInterfaceModel(compHash, 3, i_305_, i_306_, -1220666736);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5278 == connection.currentPacket) {
			int i_308_ = stream.readUnsignedByte((byte) 3);
			if (stream.readUnsignedByte((byte) -70) == 0) {
				client.aClass220Array8426[i_308_] = new Class220();
			} else {
				stream.pointer -= -681042949;
				client.aClass220Array8426[i_308_] = new Class220(stream, null);
			}
			client.anInt8514 = 684986005 * client.anInt8494;
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.CLANSETTINGS_FULL == connection.currentPacket) {
			client.lastClanSettingsUpdate = 603265577 * client.anInt8494;
			boolean bool = stream.readUnsignedByte((byte) 95) == 1;
			if (1 == 1912225577 * connection.incommingPacketSize) {
				if (bool) {
					GraphicsDefinitionLoader.mainClanSettings = null;
				} else {
					Class24.guestClanSettings = null;
				}
				connection.currentPacket = null;
				return true;
			}
			if (bool) {
				GraphicsDefinitionLoader.mainClanSettings = new ClanSettings(stream);
			} else {
				Class24.guestClanSettings = new ClanSettings(stream);
			}
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.IF_SETPLAYERHEAD == connection.currentPacket) {
			int compHash = stream.readIntV2(1274614902);
			Class319_Sub1.method16525(-430121476);
			GeneralMapList.setInterfaceModel(compHash, 5, 1124115145 * client.myPlayerIndex, 0, -1801814943);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5173) {
			int i_310_ = stream.readUnsignedShortA((byte) 4);
			int i_311_ = stream.readUnsignedByte((byte) 50);
			int i_312_ = stream.readInt((byte) 94);
			int i_313_ = stream.readShort((byte) 109);
			ObjectNode class241_sub26 = ((ObjectNode) client.aClass407_8457
					.get((long) i_310_));
			if (class241_sub26 != null) {
				NPC class475_sub1_sub1_sub3_sub2 = ((NPC) class241_sub26.objectValue);				
				if (class475_sub1_sub1_sub3_sub2.aClass400_11529 == null)
					class475_sub1_sub1_sub3_sub2.aClass400_11529 = new Class400(
							class475_sub1_sub1_sub3_sub2.definition);
				class475_sub1_sub1_sub3_sub2.aClass400_11529.anIntArray5797[i_311_] = i_312_;
				class475_sub1_sub1_sub3_sub2.aClass400_11529.aShortArray5796[i_311_] = (short) i_313_;
			}
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5177 == connection.currentPacket) {
			int i_314_ = stream.getByteA(-1931833683);
			int i_315_ = stream.readUnsignedLEShortA(1756041347);
			Class319_Sub1.method16525(-411118082);
			Class270.method5303(i_315_, i_314_, true, (byte) 63);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5271 == connection.currentPacket) {
			Class518.method11663(1202803149);
			connection.currentPacket = null;
			return false;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5205) {
			int i_316_ = stream.readUnsignedShort(1162222719);
			Class402.soundManager.method1224(i_316_, -1041268341);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5267) {
			Class529.decodeWorldUpdatePacket(SubIncommingOpcode.aClass341_5307, -1831683453);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.PLAYER_OPTION_PACKET) {
			int top = stream.readByteC((byte) 102);
			String option = stream.readString(-988458572);
			int slotID = stream.getByteA(-1987298641);
			int cursor = stream.readUnsignedLEShortA(1426033137);
			if (65535 == cursor) {
				cursor = -1;
			}
			if (slotID >= 1 && slotID <= 8) {
				if (option.equalsIgnoreCase("null"))
					option = null;
				client.playerOptionMessages[slotID - 1] = option;
				client.playerOptionCursors[slotID - 1] = cursor;
				client.aBoolArray8450[slotID - 1] = (0 == top);
			}
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.TILE_MESSAGE_PACKET == connection.currentPacket) {
			Class529.decodeWorldUpdatePacket(SubIncommingOpcode.TILE_MESSAGE, -1707590448);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5270 == connection.currentPacket) {
			int i_320_ = stream.readUnsignedShort(1162222719);
			Class402.soundManager.method1147(i_320_, 847297876);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5289 == connection.currentPacket) {
			int i_321_ = stream.readUnsignedShort(1162222719);
			client.anInt8332 = -1905889125;
			client.anInt8352 = 504628557 * i_321_;
			client.anInt8266 = 0;
			Class112.aClass210_1527.method4250(2040707973 * client.anInt8352,
					991683158);
			Class198.method4036((byte) 4);
			Class274.method5345(-461040305);
			int i_322_ = stream.readUnsignedShort(1162222719);
			client.anInt8357 = 654027789 * i_322_;
			int i_323_ = stream.readUnsignedByte((byte) -58);
			HitMarkType.aClass241_Sub3_7297 = new RSByteBuffer(i_323_);
			HitMarkType.aClass241_Sub3_7297.writeBytes(stream.payload,
					stream.pointer * 421967667, i_323_, 752061035);
			stream.pointer += i_323_ * -681042949;
			connection.currentPacket = null;
			return false;
		}
		if (IncommingOpcode.aClass340_5148 == connection.currentPacket) {
			int i_324_ = stream.readInt((byte) 126);
			int compHash = stream.readLEInt(1555284538);
			Class319_Sub1.method16525(292463347);
			GeneralMapList.setInterfaceModel(compHash, 1, i_324_, -1, -1579864864);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5216) {
			Class203.anInt2425 = stream.method14643((byte) 61) * 1122928185;
			client.aBool8441 = stream.readUnsignedByte((byte) 82) == 1;
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5244) {
			int i_326_ = stream.readUnsignedShort(1162222719);
			String string = stream.readString(-1675228176);
			boolean bool = stream.readUnsignedByte((byte) -36) == 1;
			Class395.aClass397_5775 = Class193.aClass397_2297;
			Class474.aBool6385 = bool;
			ClanSettings.method6718(i_326_, string, (byte) 0);
			//Object object = null;
			Class496.setClientStage(6, (byte) -101);
			connection.currentPacket = null;
			return false;
		}
		if (connection.currentPacket == IncommingOpcode.FULL_LOGOUT_PACKET) {
			Class362_Sub1.gameLogout(false, 1262191862);
			connection.currentPacket = null;
			return false;
		}
		if (connection.currentPacket == IncommingOpcode.MINIMAP_FLAG_PACKET) {
			int localY = stream.readUnsignedByte((byte) 37);
			int localX = stream.readUnsignedByteS((byte) 89);
			if (localX == 255) {
				localX = -1;
				localY = -1;
			}
			Class43.setMinimapFlag(localX, localY, (byte) 91);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.VARP_LARGE) {// Config2
			int key = stream.readUnsignedLEShortA(-114174004);
			int value = stream.readInt((byte) 4);
			if (RS3Applet.DEBUG) {
				System.out.println("LOBBY_VARPS_803[" + key + "] = " + value + ";");
			}
			Class1.aClass19_11.varPlayerDomain.setVarp(
					Class177.VAR_PLAYER_LIST.list(key, -1867449695), 
					value, (byte) 127);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.ADD_GROUND_ITEM_PACKET) {
			Class529.decodeWorldUpdatePacket(SubIncommingOpcode.ADD_GROUND_ITEM, -2023734760);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.UPDATE_WORLD_TILE_PACKET) {
			Class323.basePlane = stream.readUnsignedByte((byte) -44) * -1045599855;
			Class74.baseTileY = (stream.getByteC(537746309) << 3) * -771490083;
			Class65.baseTileX = (stream.getByte(940748705) << 3) * 360690737;
			while (stream.pointer * 421967667 < connection.incommingPacketSize * 1912225577) {
				SubIncommingOpcode opcode = 
						CsDelta_SetVarInt.method17454(-971409071)[stream.readUnsignedByte((byte) -32)];
				Class529.decodeWorldUpdatePacket(opcode, -1802405054);
			}
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5264) {
			int[] is = new int[4];
			for (int i_331_ = 0; i_331_ < 4; i_331_++)
				is[i_331_] = stream.readIntV2(1274614902);
			int i_332_ = stream.readUnsignedShort(1162222719);
			int i_333_ = stream.getByteA(-2032270282);
			ObjectNode class241_sub26 = ((ObjectNode) client.aClass407_8457.get((long) i_332_));
			if (null != class241_sub26)
				Class638.method13557(
						((Entity) class241_sub26.objectValue), is, i_333_, true, (byte) 45);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.CLANSETTINGS_DELTA == connection.currentPacket) {
			client.lastClanSettingsUpdate = 603265577 * client.anInt8494;
			boolean isMainClan = stream.readUnsignedByte((byte) -32) == 1;
			ClanSettingsDelta delta = new ClanSettingsDelta(stream);
			ClanSettings settings;
			if (isMainClan) {
				settings = GraphicsDefinitionLoader.mainClanSettings;
			} else {
				settings = Class24.guestClanSettings;
			}
			delta.applyToClanSettings(settings, (byte) 9);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5240 == connection.currentPacket) {
			String string = stream.readString(202915183);
			int i_334_ = stream.readUnsignedShort(1162222719);
			Class395.aClass397_5773.aString5786 = string;
			Class395.aClass397_5773.nodeID = 1167304829 * i_334_;
			Class81.method1815(-1204806555);
			Class120_Sub15.aClass207_10542.method4095(
					Class395.aClass397_5773.aString5786,
					Class395.aClass397_5773.method7112(173210687), -1749579414);
			Class281.aClass280_4428.method5479(432662636);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.LARGE_NPC_UPDATE_PACKET == connection.currentPacket) {
			Class563.decodeNPCUpdate(true, 1146560558);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5168 == connection.currentPacket) {
			int i_335_ = stream.readByteC((byte) 122);
			int i_336_ = stream.readUnsignedLEShort((short) 1203) << 2;
			int i_337_ = stream.readByteC((byte) 124);
			int i_338_ = stream.getByteA(-1957848367);
			int i_339_ = stream.readByteC((byte) 55);
			Class319_Sub1.method16525(1414521406);
			Class247.method4950(i_337_, i_339_, i_336_, i_335_, i_338_, (byte) 21);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.IF_OPENSUB_ACTIVE_OBJ == connection.currentPacket) {
			int x3 = stream.readIntV2(1274614902);
			int x2 = stream.readLEInt(-1251708050);
			GameScene class522 = new GameScene(stream.readInt((byte) 116));
			int i_342_ = stream.readUnsignedLEShort((short) 23081);
			int x1 = stream.readInt((byte) 71);
			int x0 = stream.readLEInt(1123309711);
			int clipped = stream.readUnsignedByte((byte) -44);
			int interfaceID = stream.readUnsignedLEShort((short) 21699);
			int parentHash = stream.readInt((byte) 119);
			Class319_Sub1.method16525(1462560203);
			Class595.method13079(parentHash, 
					new Class241_Sub11_Sub3(interfaceID, clipped, new Class440(class522, i_342_)), 
					new int[] { x0, x1, x2, x3 }, false, (byte) 0);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5220) {
			byte[] is = new byte[connection.incommingPacketSize * 1912225577];
			stream.readEncodeBytes(is, 0,
					(1912225577 * connection.incommingPacketSize),
					-346439291);
			String string = Class95.getMessageFromBytes(is, 0,
					(connection.incommingPacketSize * 1912225577),
					-949072930);
			if (client.aBool8267) {
				try {
					JSFunction.aClass348_5366.method6209(new Object[] { string },
							-1577355589);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.KEEP_ALIVE_PACKET) {
			connection.currentPacket = null;
			return false;
		}
		if (IncommingOpcode.IF_SETCOLOUR == connection.currentPacket) {
			int compHash = stream.readInt((byte) 69);
			int colour = stream.readUnsignedShortA((byte) 90);
			Class319_Sub1.method16525(1838291508);
			Class499.setComponentColour(compHash, colour, 2045448888);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5285 == connection.currentPacket) {
			int i_350_ = stream.readByteC((byte) 68);
			int i_351_ = stream.readUnsignedShortA((byte) 14);
			int i_352_ = stream.readUnsignedLEShortA(406787184);
			int i_353_ = stream.readLEInt(-2077816375);
			Class319_Sub1.method16525(1656743122);
			Class536.method11895(i_353_, i_350_, i_352_, i_351_, (short) 9449);//17
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.SPAWN_OBJECT_PACKET) {
			Class529.decodeWorldUpdatePacket(SubIncommingOpcode.SPAWN_OBJECT, -1919763550);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5172 == connection.currentPacket) {//QC Message
			boolean bool = stream.readUnsignedByte((byte) -39) == 1;
			String name = stream.readString(-571365820);
			String nameUnfiltered = name;
			if (bool) {
				nameUnfiltered = stream.readString(-307649769);
			}
			long l = (long) stream.readUnsignedShort(1162222719);
			long l_355_ = (long) stream.readTriByte(1771646547);
			PlayerRights rights = ((PlayerRights) Class531.method11848(
					VarBitType.method5909(1766317249),
					stream.readUnsignedByte((byte) 18), -802874088));
			int messageID = stream.readUnsignedShort(1162222719);
			long hash = l_355_ + (l << 32);
			boolean bool_358_ = false;
			while_94_: do {
				for (int i_359_ = 0; i_359_ < 100; i_359_++) {
					if (client.chatMessageHashes[i_359_] == hash) {
						bool_358_ = true;
						break while_94_;
					}
				}
				if (rights.ignorable && Class459.isIgnored(nameUnfiltered, (byte) -10)) {
					bool_358_ = true;
				}
			} while (false);
			if (!bool_358_) {
				client.chatMessageHashes[963687043 * client.anInt8539] = hash;
				client.anInt8539 = (1 + client.anInt8539 * 963687043) % 100 * 330738731;
				String message = Class72.aClass625_1100.list(messageID,
						1407907440).method17177(stream, 1884818119);
				if (1247059781 * rights.chatIcon != -1)
					Class337.showChatMessage(
							18,
							0,
							new StringBuilder()
									.append(Class475_Sub1_Sub5_Sub1
											.method17724(
													rights.chatIcon * 1247059781,
													118759549)).append(name)
									.toString(),
							new StringBuilder()
									.append(Class475_Sub1_Sub5_Sub1
											.method17724(
													rights.chatIcon * 1247059781,
													1497078648))
									.append(nameUnfiltered).toString(), name,
									message, null, messageID, (byte) 1);
				else {
					Class337.showChatMessage(18, 0, name, nameUnfiltered, name,
							message, null, messageID, (byte) 1);
				}
			}
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5180) {
			String string = stream.readString(2060217053);
			int i_361_ = stream.readUnsignedShort(1162222719);
			Class609.aClass397_7759.aString5786 = string;
			Class609.aClass397_7759.nodeID = 1167304829 * i_361_;
			Class81.method1815(1316348980);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.UPDATE_SITESETTINGS == connection.currentPacket) {
			Class496.setCookie(stream.readString(503900114), 840281711);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.IGNORES_PACKET == connection.currentPacket) {
			while (421967667 * stream.pointer < connection.incommingPacketSize * 1912225577) {
				int i_362_ = stream.readUnsignedByte((byte) 26);
				boolean bool = (i_362_ & 0x1) == 1;
				String currentName = stream.readString(1351106751);
				String prevName = stream.readString(-815661897);
				String note = stream.readString(-531363733);
				for (int index = 0; index < client.ignoreListSize * -750736473; index++) {
					Ignore ignore = client.ignoreList[index];
					if (bool) {
						if (prevName.equals(ignore.currentName)) {
							ignore.currentName = currentName;
							ignore.previousName = prevName;
							currentName = null;
							break;
						}
					} else if (currentName.equals(ignore.currentName)) {
						ignore.currentName = currentName;
						ignore.previousName = prevName;
						ignore.note = note;
						currentName = null;
						break;
					}
				}
				if (currentName != null && -750736473 * client.ignoreListSize < 400) {
					Ignore ignore = new Ignore();
					client.ignoreList[client.ignoreListSize * -750736473] = ignore;
					ignore.currentName = currentName;
					ignore.previousName = prevName;
					ignore.note = note;
					ignore.temporary = 2 == (i_362_ & 0x2);
					client.ignoreListSize += 1733118999;
				}
			}
			client.lastFriendsListUpdate = client.anInt8494 * -1343088703;
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5120 == connection.currentPacket) {
			boolean bool = stream.readByteC((byte) 30) == 1;
			Class319_Sub1.method16525(-648791211);
			Class120_Sub18.aBool10606 = bool;
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5238 == connection.currentPacket) {
			Class529.decodeWorldUpdatePacket(SubIncommingOpcode.aClass341_5308, -1869551902);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5189) {
			int i_366_ = stream.readUnsignedShort(1162222719);
			int i_367_ = stream.readUnsignedShort(1162222719);
			int i_368_ = stream.readUnsignedShort(1162222719);
			Class319_Sub1.method16525(608321693);
			if (null != Class187.aClass35Array2203[i_366_]) {
				for (int i_369_ = i_367_; i_369_ < i_368_; i_369_++) {
					int i_370_ = stream.readTriByte(1771646547);
					if (i_369_ < (Class187.aClass35Array2203[i_366_].components).length
							&& null != (Class187.aClass35Array2203[i_366_].components[i_369_]))
						Class187.aClass35Array2203[i_366_].components[i_369_].anInt835 = -1937504665
								* i_370_;
				}
			}
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.CLIENT_SETVARCSTR_LARGE) {
			String string = stream.readString(1235355942);
			int id = stream.readUnsignedLEShortA(288716882);
			Class319_Sub1.method16525(1083233201);
			if (RS3Applet.DEBUG) {
				System.out.println("Received var client string: "+string+", id="+id);
			}
			Entity.setVarcString(id, string, 1484004327);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5185) {
			int i_372_ = stream.readUnsignedByte((byte) 47);
			Class319_Sub1.method16525(-668807651);
			client.anInt8284 = i_372_ * 544234413;
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.RUN_COMMAND_PACKET) {
			String string = stream.readString(27039408);
			Class120_Sub10.runCommand(string, false, false, -166891133);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5266) {
			int i_373_ = stream.readIntV2(1274614902);
			if (i_373_ != Class249.anInt3998 * 1315882367) {
				Class249.anInt3998 = i_373_ * 416479871;
				Class561.method12372(Class614.aClass614_7814, -1, -1,
						-188228284);
			}
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.IF_OPENSUB) {
			int ifaceID = stream.readUnsignedLEShortA(1282658734);
			int x1 = stream.readLEInt(-1087333862);
			int clipped = stream.getByteA(-2071650308);
			int x3 = stream.readIntV2(1274614902);
			int x0 = stream.readIntV1((short) 1565);
			int x2 = stream.readInt((byte) 8);
			int parent = stream.readInt((byte) 84);
			if (RS3Applet.DEBUG) {
				System.out.println("Interface: id=" + ifaceID + ", clipped=" + clipped+", parentID="+(parent >> 16)+", compID="+(parent & 0xffff));
			}
			Class319_Sub1.method16525(218386059);
			Class595.method13079(parent, new Class241_Sub11(ifaceID, clipped),
					new int[] { x0, x1, x2, x3 }, false, (byte) 0);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.CHAT_FILTER_SETTINGS == connection.currentPacket) {
			client.publicChatStatus = stream.readUnsignedByteS((byte) 42) * 868091143;
			client.tradeStatus = stream.readByteC((byte) 62) * 78873981;
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5197) {
			int i_381_ = stream.readUnsignedLEShortA(621026644);
			if (i_381_ == 65535)
				i_381_ = -1;
			int i_382_ = stream.getByteA(-1969203911);
			Class402.soundManager.method1173(i_381_, i_382_, (byte) -74);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.VARP_SMALL) {
			int id = stream.readUnsignedShortA((byte) 122);
			byte value = stream.readByteA(582493488);
			if (RS3Applet.DEBUG) {
				System.out.println("LOBBY_VARPS_803[" + id + "] = " + value + ";");
			}
			Class1.aClass19_11.varPlayerDomain.setVarp(
					Class177.VAR_PLAYER_LIST.list(id, -1572202466), 
					value, (byte) 127);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.RESET_INTERFACE_INFORMATION == connection.currentPacket) {
			Class473.varClientDomain.resetLayoutInfo((byte) 1);
			connection.currentPacket = null;
			return false;
		}
		if (IncommingOpcode.aClass340_5275 == connection.currentPacket) {
			int i_385_ = stream.readUnsignedShort(1162222719);
			Class299.method5815(i_385_, -312621625);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5186 == connection.currentPacket) {
			int i_386_ = stream.readUnsignedByte((byte) -64);
			Class425 class425 = ((Class425) Class531.method11848(
					ObjectDefinition.method11811(392550851), i_386_, 1367223996));
			if (null == class425)
				class425 = Class425.aClass425_6073;
			Class230.method4671(class425, 803935971);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.HINT_ICON_PACKET == connection.currentPacket) {
			int i_387_ = stream.readUnsignedByte((byte) -53);
			int i_388_ = i_387_ >> 5;
			int i_389_ = i_387_ & 0x1f;
			if (i_389_ == 0) {
				client.aClass192Array8301[i_388_] = null;
				connection.currentPacket = null;
				return true;
			}
			Class192 class192 = new Class192();
			class192.anInt2288 = 983685271 * i_389_;
			((Class192) class192).anInt2285 = stream.readUnsignedByte((byte) 21) * -1674659237;
			if (1521214931 * ((Class192) class192).anInt2285 >= 0
					&& (1521214931 * ((Class192) class192).anInt2285 < Class191.aClass168Array2284.length)) {
				if (-1685117145 * class192.anInt2288 == 1
						|| 10 == -1685117145 * class192.anInt2288) {
					class192.anInt2287 = (stream.readUnsignedShort(1162222719) * -2048892741);
					((Class192) class192).anInt2294 = (stream
							.readUnsignedShort(1162222719) * -712934801);
					stream.pointer += 1570795500;
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
					((Class192) class192).anInt2286 = stream.readUnsignedByte((byte) -14) * -2118467403;
					GameScene class522 = client.aClass238_8477.method4806((byte) 1);
					class192.anInt2289 += ((stream.readUnsignedShort(1162222719) - 127679513 * class522.baseX) << 9) * 815649107;
					class192.anInt2290 += ((stream.readUnsignedShort(1162222719) - class522.baseY * 468558693) << 9) * 184029469;
					((Class192) class192).anInt2291 = ((stream
							.readUnsignedByte((byte) 70) << 2) * 2066889041);
					class192.anInt2293 = (stream.readUnsignedShort(1162222719) * -1465178659);
				}
				class192.anInt2292 = stream.readInt((byte) 120) * -1757964121;
				client.aClass192Array8301[i_388_] = class192;
			}
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5194 == connection.currentPacket) {//Interface model (of some sort)
			int i_390_ = stream.readUnsignedLEShort((short) 5671);
			int i_391_ = stream.readUnsignedShortA((byte) 34);
			int compHash = stream.readLEInt(-1003625009);
			int i_393_ = stream.readUnsignedShort(1162222719);
			Class319_Sub1.method16525(2137398431);
			GeneralMapList.setInterfaceModel(compHash, 7, i_393_ << 16 | i_390_, i_391_, -801960798);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5284) {
			Class529.decodeWorldUpdatePacket(SubIncommingOpcode.aClass341_5303, -1715562970);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.VARCLAN) {
			if (Class520.varClanDomain == null) {
				Class520.varClanDomain = new SparseVarDomain(Class443.VAR_CLAN_LIST);
			}
			Class254 class254 = Class443.VAR_CLAN_LIST.decodeVarValue(stream, (byte) 81);
			Class520.varClanDomain.varValues.method335(
					class254.key * 623518843, class254.value, (byte) -32);
			client.recentVarClanChanged[(client.varClanChangePointer += 874463821) * 401065605 - 1 & 0x1f] = 623518843 * class254.key;
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5119) {
			int i_394_ = stream.readIntV1((short) 10350);
			int i_395_ = stream.readUnsignedLEShortA(934601630);
			int i_396_ = stream.readUnsignedLEShort((short) 30354);
			if (i_396_ == 65535)
				i_396_ = -1;
			int i_397_ = stream.readUnsignedLEShort((short) 23588);
			if (i_397_ == 65535)
				i_397_ = -1;
			Class319_Sub1.method16525(618945481);
			for (int i_398_ = i_397_; i_398_ <= i_396_; i_398_++) {
				long l = ((long) i_394_ << 32) + (long) i_398_;
				Class241_Sub20 class241_sub20 = (Class241_Sub20) client.aClass407_8519
						.get(l);
				Class241_Sub20 class241_sub20_399_;
				if (class241_sub20 == null) {
					if (-1 == i_398_)
						class241_sub20_399_ = new Class241_Sub20(
								(Js5ConfigGroup.getInterfaceComponent(i_394_, (byte) -13).aClass241_Sub20_922.anInt9007)
										* -438085493, i_395_);
					else
						class241_sub20_399_ = new Class241_Sub20(0, i_395_);
				} else {
					class241_sub20_399_ = new Class241_Sub20(
							(-438085493 * class241_sub20.anInt9007), i_395_);
					class241_sub20.remove((byte) 36);
				}
				client.aClass407_8519.put(class241_sub20_399_, l);
			}
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5202) {
			Class194.anInt2311 = stream.readUnsignedByte((byte) -3) * 1817774129;
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5290) {
			int i_400_ = stream.readUnsignedByteS((byte) 45);
			int i_401_ = stream.readUnsignedLEShortA(248769675);
			boolean bool = 1 == (i_400_ & 0x1);
			AnimationDefinitionLoader.method12313(i_401_, bool, -1438134197);
			client.itemContainerUpdates[(client.itemContainerUpdatePointer += 1789825217) * 1774059329 - 1 & 0x1f] = i_401_;
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.IF_SETHIDE) {//Hide component
			int componentHash = stream.readInt((byte) 113);
			int hidden = stream.readByteC((byte) 26);
			if (RS3Applet.DEBUG) {
				System.out.println("Received component hidden: hash="+componentHash+", hidden="+hidden);
			}
			Class319_Sub1.method16525(347792234);
			Class445_Sub34.setComponentHidden(componentHash, hidden, -496067405);//7
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.aClass340_5167) {
			Class353.aString5444 = (1912225577 * connection.incommingPacketSize > 2 ? stream.readString(1619683858)
					: ClientMessage.WALKHERE.getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 24606));
			client.anInt8451 = ((connection.incommingPacketSize * 1912225577 > 0 ? stream
					.readUnsignedShort(1162222719) : -1) * 1517266607);
			if (-485396401 * client.anInt8451 == 65535) {
				client.anInt8451 = -1517266607;
			}
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.FRIENDS_CHANNEL_PACKET == connection.currentPacket) {//Friends chat channel
			client.lastFriendsChatUpdate = -1375606821 * client.anInt8494;
			//System.out.println("Received friends channel packet...");
			if (0 == connection.incommingPacketSize * 1912225577) {
				client.currentFriendsChatName = null;
				client.currentFriendsChatOwner = null;
				Class357_Sub1.currentFcSize = 0;
				Class350.currentFcUsers = null;
				connection.currentPacket = null;
				return true;
			}
			client.currentFriendsChatOwner = stream.readString(198216827);
			boolean hasReplyName = stream.readUnsignedByte((byte) -27) == 1;
			if (hasReplyName) {
				stream.readString(1769100883);
			}
			client.currentFriendsChatName = stream.readString(288873380);
			Class380.currentFcKickReq = stream.getByte(-689375467);
			int size = stream.readUnsignedByte((byte) 3);
			if (size == 255) {
				connection.currentPacket = null;
				return true;
			}
			Class357_Sub1.currentFcSize = 1584810575 * size;
			FriendsChatUser[] fcUsers = new FriendsChatUser[100];
			for (int index = 0; index < -612332369 * Class357_Sub1.currentFcSize; index++) {
				fcUsers[index] = new FriendsChatUser();
				fcUsers[index].displayName = stream.readString(-690194442);
				hasReplyName = stream.readUnsignedByte((byte) -1) == 1;
				if (hasReplyName) {
					fcUsers[index].replyToName = stream.readString(1162660033);
				} else {
					fcUsers[index].replyToName = fcUsers[index].displayName;
				}
				fcUsers[index].protocolName = Class482.formatStringForProtocol(
						fcUsers[index].replyToName, Class524.aClass600_6822, (byte) 108);
				fcUsers[index].nodeID = stream.readUnsignedShort(1162222719) * 752157003;
				fcUsers[index].rank = stream.getByte(-102585992);
				fcUsers[index].worldName = stream.readString(-1693791601);
				if (fcUsers[index].replyToName.equals(Class21.myPlayer.nameUnfiltered)) {
					NPC.myCurrentFcRank = fcUsers[index].rank;
				}
			}
			boolean bool_406_ = false;
			int remaining = -612332369 * Class357_Sub1.currentFcSize;
			do {
				if (remaining <= 0) {
					break;
				}
				bool_406_ = true;
				remaining--;
				for (int i_408_ = 0; i_408_ < remaining; i_408_++) {
					if ((((FriendsChatUser) fcUsers[i_408_]).protocolName
							.compareTo(((FriendsChatUser) fcUsers[i_408_ + 1]).protocolName)) > 0) {
						FriendsChatUser class197 = fcUsers[i_408_];
						fcUsers[i_408_] = fcUsers[1 + i_408_];
						fcUsers[i_408_ + 1] = class197;
						bool_406_ = false;
					}
				}
			} while (!bool_406_);
			Class350.currentFcUsers = fcUsers;
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.IF_SETNPCHEAD) {
			int modelID = stream.readIntV1((short) 15630);
			int compHash = stream.readLEInt(-777817151);
			Class319_Sub1.method16525(891197342);
			GeneralMapList.setInterfaceModel(compHash, 2, modelID, -1, -1105970033);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5218 == connection.currentPacket) {
			int i_411_ = stream.readUnsignedByte((byte) 70);
			Class423 class423 = ((Class423) Class531.method11848(
					GraphicsDefinition.method10631(-229145530), i_411_, -1167903494));
			if (class423 == null) {
				class423 = Class423.aClass423_6050;
			}
			VarTransmitLevel.method5825(class423, (byte) 66);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.ONLINE_STATUS_PACKET == connection.currentPacket) {// Online status
			Class38.currentOnlineStatus = Class3.method463(
					stream.readUnsignedByte((byte) 104), 877627580);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.IF_SETGRAPHIC) {
			int spriteID = stream.readIntV1((short) 10241);
			int compHash = stream.readLEInt(-135799303);
			Class319_Sub1.method16525(1736269464);
			Class569.setComponentSprite(compHash, spriteID, 1921432437);//13
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.IF_SETTEXTFONT == connection.currentPacket) {
			int compHash = stream.readLEInt(748601263);
			int fontID = stream.readIntV2(1274614902);
			Class319_Sub1.method16525(-42772586);
			Class536.setComponentFont(compHash, fontID, -1905960332);//15
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5193 == connection.currentPacket) {
			int i_416_ = stream.readUnsignedShort(1162222719);
			if (65535 == i_416_) {
				i_416_ = -1;
			}
			int i_417_ = stream.readUnsignedByte((byte) 78);
			int i_418_ = stream.readUnsignedShort(1162222719);
			int i_419_ = stream.readUnsignedByte((byte) -36);
			int i_420_ = stream.readUnsignedShort(1162222719);
			Class402.soundManager.method1162(Class112.aClass112_1523, i_416_,
					i_417_, i_419_,
					Class130.aClass130_1597.method3067(-960497231),
					Class127.aClass127_1587, 0.0F, 0.0F, null, 0, i_420_,
					i_418_, 1341646821);
			connection.currentPacket = null;
			return true;
		}
		if (IncommingOpcode.aClass340_5261 == connection.currentPacket) {
			int x0 = stream.readLEInt(-674348356);
			int parentHash = stream.readIntV1((short) 31617);
			int clipped = stream.readByteC((byte) 108);
			int x2 = stream.readLEInt(596321590);
			int x3 = stream.readIntV2(1274614902);
			int x1 = stream.readLEInt(1550622498);
			int interfaceID = stream.readUnsignedShort(1162222719);
			int i_428_ = stream.readUnsignedLEShort((short) 11453);
			Class319_Sub1.method16525(2057916212);
			Class595.method13079(parentHash, 
					new Class241_Sub11_Sub1(interfaceID, clipped, i_428_),
					new int[] { x0, x1, x2, x3 }, false, (byte) 0);
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.IF_OPENTOP) {
			stream.readByteC((byte) 73);
			int x0 = stream.readLEInt(1856895206);
			int paneID = stream.readUnsignedLEShortA(1064065668);
			int x2 = stream.readIntV2(1274614902);
			int x3 = stream.readIntV2(1274614902);
			int x1 = stream.readLEInt(-1346112583);
			if (RS3Applet.DEBUG) {
				System.out.println("Window pane " + paneID + " [" + x0 + " " + x1 + " " + x2 + " " + x3 + "]");
			}
			Class319_Sub1.method16525(1410937802);
			int[] is = { x0, x1, x2, x3 };
			client.anInt8466 = paneID * 1376966001;
			Class474.method10869(paneID, is, (byte) 0);
			Class105_Sub1_Sub3_Sub1.method17885(false, -1827085363);
			Class107.method2686(1629309841 * client.anInt8466, is, -578799681);
			for (int i_434_ = 0; i_434_ < 108; i_434_++) {
				client.aBoolArray8523[i_434_] = true;
			}
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.MESSAGE_CLANCHANNEL) {//Normal Clan Message
			boolean isMainCc = stream.readUnsignedByte((byte) -23) == 1;
			String senderName = stream.readString(-804177418);
			long l = (long) stream.readUnsignedShort(1162222719);
			long l_435_ = (long) stream.readTriByte(1771646547);
			PlayerRights rights = ((PlayerRights) Class531.method11848(
					VarBitType.method5909(1766317249),
					stream.readUnsignedByte((byte) -44), 883350778));
			long hash = (l << 32) + l_435_;
			boolean skipMessage = false;
			//Object object = null;
			ClanChannel channel = (isMainCc ? Class324.mainClanChannel : Class239.guestClanChannel);
			while_95_: do {
				if (null == channel) {
					skipMessage = true;//Not in channel
				} else {
					for (int i_438_ = 0; i_438_ < 100; i_438_++) {
						if (client.chatMessageHashes[i_438_] == hash) {
							skipMessage = true;//Already received message
							break while_95_;
						}
					}
					if (rights.ignorable) {
						if (client.aBool8441 && !client.aBool8442 || client.isQcWorld) {
							skipMessage = true;
						} else if (Class459.isIgnored(senderName, (byte) -51)) {
							skipMessage = true;//Sender is on ignore list
						}
					}
				}
			} while (false);
			if (!skipMessage) {
				client.chatMessageHashes[963687043 * client.anInt8539] = hash;
				client.anInt8539 = (client.anInt8539 * 963687043 + 1) % 100 * 330738731;
				String message = Class240.stripCode(
						Class241_Sub47.huffmanDecrypt(stream, (byte) 44),
						417256845);
				int opcode = isMainCc ? 41 : 44;
				if (rights.chatIcon * 1247059781 != -1) {
					Class337.showChatMessage(opcode, 0,
							new StringBuilder()
								.append(Class475_Sub1_Sub5_Sub1.method17724(
										rights.chatIcon * 1247059781, 866151944)).append(senderName)
									.toString(),
							new StringBuilder()
								.append(Class475_Sub1_Sub5_Sub1.method17724(
										rights.chatIcon * 1247059781, 2053924903)).append(senderName)
									.toString(), 
							senderName, message, channel.channelName, -1, (byte) 1);
				} else {
					Class337.showChatMessage(opcode, 0, senderName, senderName, senderName,
							message, channel.channelName, -1, (byte) 1);
				}
			}
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.URL_OPEN) {
			if (Class442.aBool6160 && Class228.aFrame2674 != null) {
				Class537.method11899(
						Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub30_8878
								.method14386(-801965113), -1, -1, false,
						1482319719);
			}
			byte[] data = new byte[1912225577 * connection.incommingPacketSize - 1];
			boolean bool = stream.readUnsignedByte((byte) 19) == 1;
			stream.readEncodeBytes(data, 0, (connection.incommingPacketSize * 1912225577) - 1, 611383743);
			RSByteBuffer buffer = new RSByteBuffer(data);
			String string = buffer.readString(-116388221);
			if (bool) {
				String string_441_ = buffer.readString(-1162337600);
				if (string_441_.length() == 0) {
					string_441_ = string;
				}
				if (!client.aBool8267 || Class83.osName.startsWith("mac")
						|| !Class68.method1676(string, 1, JSFunction.OPEN_MTX_URL.getName(1944294900), -913960973)) {
					Class446.method7895(string_441_, true, client.aBool8440, -1815142638);
				}
			} else {
				Class446.method7895(string, true, client.aBool8440, -1815142638);
			}
			connection.currentPacket = null;
			return true;
		}
		if (connection.currentPacket == IncommingOpcode.WORLD_LIST_PACKET) {
			boolean bool = stream.readUnsignedByte((byte) -81) == 1;
			byte[] is = new byte[connection.incommingPacketSize * 1912225577 - 1];
			stream.readBytes(is, 0, (connection.incommingPacketSize * 1912225577) - 1, (byte) 103);
			Class548.method12001(bool, is, (byte) -67);
			connection.currentPacket = null;
			return true;
		}
		VarType.method3770(
				new StringBuilder()
						.append(null != connection.currentPacket ? connection.currentPacket.opcode * 935526901
								: -1)
						.append(Class6.aString30)
						.append(null != connection.aClass340_2273 ? 935526901 * connection.aClass340_2273.opcode
								: -1)
						.append(Class6.aString30)
						.append(null != connection.aClass340_2274 ? 935526901 * connection.aClass340_2274.opcode
								: -1)
						.append(" ")
						.append(connection.incommingPacketSize * 1912225577)
						.toString(), new RuntimeException(), -415651059);
		Class362_Sub1.gameLogout(false, 1539375466);
		return true;
	}

}
