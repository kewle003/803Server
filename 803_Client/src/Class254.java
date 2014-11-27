/* Class254 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class254
{
    public Object value;//anObject4131
    public int key;//anInt4132
    static int anInt4133;
    public static int anInt4134;
    
    public Class254(int i) {
	key = -583263565 * i;
    }
    
    public Class254(int i, Object object) {
		key = -583263565 * i;
		value = object;
    }
    
    public boolean method5031(Object object) {
	if (!(object instanceof Class254))
	    return false;
	Class254 class254_0_ = (Class254) object;
	if (class254_0_.value == null && null != value)
	    return false;
	if (null == value && class254_0_.value != null)
	    return false;
	if (623518843 * class254_0_.key == 623518843 * key
	    && class254_0_.value.equals(value))
	    return true;
	return false;
    }
    
    public boolean equals(Object object) {
	if (!(object instanceof Class254))
	    return false;
	Class254 class254_1_ = (Class254) object;
	if (class254_1_.value == null && null != value)
	    return false;
	if (null == value && class254_1_.value != null)
	    return false;
	if (623518843 * class254_1_.key == 623518843 * key
	    && class254_1_.value.equals(value))
	    return true;
	return false;
    }
    
    public boolean method5032(Object object) {
	if (!(object instanceof Class254))
	    return false;
	Class254 class254_2_ = (Class254) object;
	if (class254_2_.value == null && null != value)
	    return false;
	if (null == value && class254_2_.value != null)
	    return false;
	if (623518843 * class254_2_.key == 623518843 * key
	    && class254_2_.value.equals(value))
	    return true;
	return false;
    }
    
    public boolean method5033(Object object) {
	if (!(object instanceof Class254))
	    return false;
	Class254 class254_3_ = (Class254) object;
	if (class254_3_.value == null && null != value)
	    return false;
	if (null == value && class254_3_.value != null)
	    return false;
	if (623518843 * class254_3_.key == 623518843 * key
	    && class254_3_.value.equals(value))
	    return true;
	return false;
    }
    
    public static int method5034(int i, int i_4_, int i_5_, int i_6_) {
	i_5_ &= 0x3;
	if (0 == i_5_)
	    return i;
	if (1 == i_5_)
	    return i_4_;
	if (2 == i_5_)
	    return 7 - i;
	return 7 - i_4_;
    }
    
    static void method5035(byte i) {
	Class192.aClass129_2295.reset(-168544021);
    }
    
    public static void method5036(short i) {
		Class426.method7581(1039158144);
		Class484.aClass464_Sub1_6463.method10681((byte) 102);
		Class484.aClass464_Sub2_6464.method10681((byte) 70);
		if (802559093 * client.anInt8317 > 0) {
		    Class241_Sub27 packet = Class445_Sub26.makePacket(
		    		OutgoingOpcode.EVENT_KEYBOARD,
					client.aClass190_8340.packetCipher,
					16711935);
		    packet.data.writeShort(client.anInt8317 * -1084730924, -484048531);
		    for (int i_7_ = 0; i_7_ < 802559093 * client.anInt8317; i_7_++) {
				Interface58 interface58 = client.anInterface58Array8318[i_7_];
				long l = (interface58.method435(1482319719)
					  - -6111726823487216051L * Class484.aLong6467);
				if (l > 16777215L) {
				    l = 16777215L;
				}
				Class484.aLong6467 = (interface58.method435(1482319719) * -6972232757595454843L);
				packet.data.writeByte(interface58.getKeyCode(-883962889), 24312017);
				packet.data.writeTriByte((int) l, 1659862511);
		    }
		    client.aClass190_8340.sendPacket(packet, -1849065467);
		}
		if (-1280722955 * Class484.anInt6466 > 0)
		    Class484.anInt6466 -= -833094563;
		if (client.aBool8392 && -1280722955 * Class484.anInt6466 <= 0) {
		    Class484.anInt6466 = 517977924;
		    client.aBool8392 = false;
		    int i_8_;
		    int i_9_;
		    if (115241065 * Class296.anInt4513 == 4) {
				if (Class445_Sub16.aClass351_Sub1_8660
					.method6332((short) -27533)
				    == Class39.aClass39_586) {
				    Class380_Sub2 class380_sub2
					= (Class380_Sub2) Class445_Sub16
							      .aClass351_Sub1_8660
							      .method6283(1856915346);
				    i_8_ = Class553.method12255(class380_sub2.aClass278_10406,
								50350113) >> 3;
				    int i_10_ = 1024;
				    i_9_
					= (i_10_ * 3 - (Class322.method5956((class380_sub2
									     .aClass278_10406),
									    (byte) 46)
							>> 3)) % (i_10_ * 2);
				} else {
				    i_8_ = 0;
				    i_9_ = 0;
				}
		    } else {
				i_8_ = (int) client.aFloat8406 >> 3;
				i_9_ = (int) client.aFloat8581 >> 3;
		    }
		    Class241_Sub27 packet = Class445_Sub26.makePacket(
		    		OutgoingOpcode.CAMERA_MOVEMENT_PACKET,
					client.aClass190_8340.packetCipher,
					16711935);
		    packet.data.writeShortA(i_9_, -1850488452);
		    packet.data.writeShort(i_8_, -484048531);
		    client.aClass190_8340.sendPacket(packet, -1637419122);
		}
		if (Class484.aBool6465 != Class47.isWindowFocused) {
		    Class484.aBool6465 = Class47.isWindowFocused;
		    Class241_Sub27 packet = Class445_Sub26.makePacket(
		    		OutgoingOpcode.EVENT_APPLET_FOCUS,
					client.aClass190_8340.packetCipher,
					16711935);
		    packet.data.writeByte(Class47.isWindowFocused ? 1 : 0, -435418127);
		    client.aClass190_8340.sendPacket(packet, -2071745778);
		}
		if (!client.aBool8297) {
		    Class241_Sub27 packet = Class445_Sub26.makePacket(
		    		OutgoingOpcode.REFLECTION_CHECK_REPLY,
					client.aClass190_8340.packetCipher,
					16711935);
		    packet.data.writeByte(0, 1478736560);
		    int i_11_ = (421967667 * packet.data.pointer);
		    RSByteBuffer buffer = Class241_Sub5_Sub9.aClass241_Sub9_11043.method14910(1864114853);
		    packet.data.writeBytes(buffer.payload, 0,
		    		buffer.pointer * 421967667, 752061035);
		    packet.data.endPacketVarByte(
		    		(packet.data.pointer * 421967667 - i_11_),
		    		1497529788);
		    client.aClass190_8340.sendPacket(packet, -1984722086);
		    client.aBool8297 = true;
		}
    }
    
    static final void storeIntParam/*method5037*/(ClientScriptData scriptData, int i) {
    	scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
		    = scriptData.integerVariables
		       [scriptData.integerConstants[1938982693 * scriptData.step]];
    }
    
    public static final void addFriend/*method5038*/(String friendName, int i) {
		int maxListSize = client.isP2pAccount ? 400 : 200;
		if (null != friendName) {
		    if (1557840217 * client.friendListSize >= maxListSize) {
				Class629.appendClientMessage(
						4, (client.isP2pAccount ? ClientMessage.FRIENDLIST_FULL2.getLocalisedMessage(
								VarPlayerDomain.currentLocale, (short) 21356)
						: ClientMessage.FRIENDLIST_FULL1.getLocalisedMessage(
								VarPlayerDomain.currentLocale, (short) 25432)),
						-1156866057);
		    } else {
				String protocolName = Class482.formatStringForProtocol(friendName, Class524.aClass600_6822, (byte) 24);
				if (null != protocolName) {
				    for (int index = 0; index < client.friendListSize * 1557840217; index++) {
						Friend friend = client.friendList[index];
						String string_15_ = Class482.formatStringForProtocol(friend.currentName,
									   Class524.aClass600_6822, (byte) 45);
						if (null != string_15_ && string_15_.equals(protocolName)) {
						    Class629.appendClientMessage(4,
						    	new StringBuilder().append(friendName)
						    		.append(ClientMessage.FRIENDLISTDUPE.getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 19880))
									.toString(),
								-1301583164);
						    return;
						}
						if (null != friend.previousName) {
						    String string_16_
							= Class482.formatStringForProtocol(friend.previousName,
									       Class524.aClass600_6822,
									       (byte) 14);
						    if (null != string_16_
							&& string_16_.equals(protocolName)) {
							Class629.appendClientMessage(4,
									     new StringBuilder().append
										 (friendName).append
										 (ClientMessage
										      .FRIENDLISTDUPE
										      .getLocalisedMessage
										  ((VarPlayerDomain
										    .currentLocale),
										   (short) 24643))
										 .toString(),
									     -1396197940);
							return;
						    }
						}
				    }
				    for (int index = 0; index < client.ignoreListSize * -750736473; index++) {
						Ignore ignore = client.ignoreList[index];
						String string_18_ = Class482.formatStringForProtocol(ignore.currentName,
									   Class524.aClass600_6822,
									   (byte) 105);
						if (string_18_ != null
						    && string_18_.equals(protocolName)) {
						    Class629.appendClientMessage(4,
									 new StringBuilder().append
									     (ClientMessage
										  .REMOVEIGNORE1
										  .getLocalisedMessage
									      (VarPlayerDomain.currentLocale,
									       (short) 29918))
									     .append
									     (friendName).append
									     (ClientMessage
										  .REMOVEIGNORE2
										  .getLocalisedMessage
									      (VarPlayerDomain.currentLocale,
									       (short) 19221))
									     .toString(),
									 -1115182679);
						    return;
						}
						if (ignore.previousName != null) {
						    String string_19_
							= Class482.formatStringForProtocol(ignore.previousName,
									       Class524.aClass600_6822,
									       (byte) 7);
						    if (string_19_ != null
							&& string_19_.equals(protocolName)) {
							Class629.appendClientMessage
							    (4,
							     new StringBuilder().append
								 (ClientMessage.REMOVEIGNORE1.getLocalisedMessage
								  (VarPlayerDomain.currentLocale,
								   (short) 28139))
								 .append
								 (friendName).append
								 (ClientMessage.REMOVEIGNORE2.getLocalisedMessage
								  (VarPlayerDomain.currentLocale,
								   (short) 19711))
								 .toString(),
							     -1548675998);
							return;
						    }
						}
				    }
				    if (Class482.formatStringForProtocol(
					    		Class21.myPlayer.nameUnfiltered,
					    		Class524.aClass600_6822, (byte) 51
				    		).equals(protocolName)) {
				    	Class629.appendClientMessage(4,
							     (ClientMessage.FRIENDCANTADDSELF
								  .getLocalisedMessage
							      (VarPlayerDomain.currentLocale,
							       (short) 31241)),
							     -1458158384);
				    } else {
						ServerConnection class190 = ClanChannelDelta.method6943(-1471476924);
						Class241_Sub27 packet = Class445_Sub26.makePacket(
								OutgoingOpcode.ADD_FRIEND_PACKET,
								class190.packetCipher,
								16711935);
						packet.data.writeByte(
								Class421.getEncodedStringLength(friendName, -1869229583),
								-220686694);
						packet.data.writeString(friendName, -407046246);
						class190.sendPacket(packet, -1891785614);
				    }
				}
		    }
		}
    }
    
    static final void method5039(ClientScriptData class454, byte i) {
	int i_20_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_20_, (byte) -106);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_20_ >> 16];
	Class439.setFriendsChatUpdateEvent(class58, class35, class454, (byte) -87);
    }
    
    static final void method5040(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = ((ClientScriptData) class454).aClass475_Sub1_Sub2_Sub1_6223
		  .method14464(-884468562);
    }
}
