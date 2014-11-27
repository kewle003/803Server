/* Class258 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class258
{
    public static final int anInt4206 = 15;
    public static final int anInt4207 = 15;
    public static final int anInt4208 = 32768;
    static Class132[] aClass132Array4209;
    static int anInt4210;
    
    Class258() throws Throwable {
	throw new Error();
    }
    
    static final void method5065(ClientScriptData class454, int i) {
	((ClientScriptData) class454).longStack
	    [(((ClientScriptData) class454).anInt6231 += 710535117) * -735224571 - 1]
	    = (((ClientScriptData) class454).aLongArray6222
	       [(((ClientScriptData) class454).integerConstants
		 [1938982693 * ((ClientScriptData) class454).step])]);
    }
    
    static final void method5066(InterfaceComponent class58, int i, int i_0_,
				 ClientScriptData class454, byte i_1_) {
	if (null == class58.anIntArray861) {
	    if (i_0_ > 0) {
		class58.aByteArrayArray869 = new byte[11][];
		class58.aByteArrayArray925 = new byte[11][];
		class58.anIntArray926 = new int[11];
		class58.anIntArray831 = new int[11];
		class58.anIntArray861 = new int[11];
	    } else
		return;
	}
	class58.anIntArray861[i] = i_0_;
	if (i_0_ > 0)
	    class58.aBool923 = true;
	else {
	    class58.aBool923 = false;
	    for (int i_2_ = 0; i_2_ < class58.aByteArrayArray869.length;
		 i_2_++) {
		if (class58.aByteArrayArray869[i_2_] != null
		    || class58.anIntArray861[i_2_] > 0) {
		    class58.aBool923 = true;
		    break;
		}
	    }
	}
    }
    
    static final void method5067(ClientScriptData class454, int i) {
	if (Class119.aClass578_1564.isKeyPressed(82, -1016346882))
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 1;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
    }
    
    public static final void addIgnore/*method5068*/(String displayName, boolean tillLogout, short i) {
		int maxListSize = client.isP2pAccount ? 400 : 100;
		if (null != displayName) {
		    if (-750736473 * client.ignoreListSize >= maxListSize) {
		    	Class629.appendClientMessage(4,(client.isP2pAccount
						? ClientMessage.IGNORELISTFULL2.getLocalisedMessage((VarPlayerDomain.currentLocale), (short) 32547)
						: ClientMessage.IGNORELISTFULL.getLocalisedMessage((VarPlayerDomain.currentLocale), (short) 22100)),
					-1154062111);
		    } else {
				String protocolName = Class482.formatStringForProtocol(displayName, Class524.aClass600_6822, (byte) 8);
				if (protocolName != null) {
				    for (int i_5_ = 0; i_5_ < client.ignoreListSize * -750736473; i_5_++) {
						Ignore ignore = client.ignoreList[i_5_];
						String string_6_ = Class482.formatStringForProtocol(ignore.currentName, Class524.aClass600_6822, (byte) 24);
						if (string_6_ != null && string_6_.equals(protocolName)) {
						    Class629.appendClientMessage(4,
									 new StringBuilder().append
									     (displayName).append
									     (ClientMessage
										  .IGNORELISTDUPE
										  .getLocalisedMessage
									      (VarPlayerDomain.currentLocale,
									       (short) 18414))
									     .toString(),
									 -2093850602);
						    return;
						}
						if (ignore.previousName != null) {
						    String string_7_ = Class482.formatStringForProtocol(ignore.previousName, Class524.aClass600_6822, (byte) 120);
						    if (string_7_ != null && string_7_.equals(protocolName)) {
						    	Class629.appendClientMessage(4,
									     new StringBuilder().append
										 (displayName).append
										 (ClientMessage
										      .IGNORELISTDUPE
										      .getLocalisedMessage
										  ((VarPlayerDomain
										    .currentLocale),
										   (short) 23957))
										 .toString(),
									     -2145464573);
						    	return;
						    }
						}
				    }
				    for (int i_8_ = 0; i_8_ < 1557840217 * client.friendListSize;
					 i_8_++) {
					Friend friend = client.friendList[i_8_];
					String string_9_
					    = Class482.formatStringForProtocol(friend.currentName,
								   Class524.aClass600_6822,
								   (byte) 91);
					if (string_9_ != null && string_9_.equals(protocolName)) {
					    Class629.appendClientMessage(4,
								 new StringBuilder().append
								     (ClientMessage
									  .REMOVEFRIEND1
									  .getLocalisedMessage
								      (VarPlayerDomain.currentLocale,
								       (short) 18171))
								     .append
								     (displayName).append
								     (ClientMessage
									  .REMOVEFRIEND2
									  .getLocalisedMessage
								      (VarPlayerDomain.currentLocale,
								       (short) 26133))
								     .toString(),
								 -1404023242);
					    return;
					}
					if (null != friend.previousName) {
					    String friendProtocol = Class482.formatStringForProtocol(friend.previousName, Class524.aClass600_6822,(byte) 95);
					    if (friendProtocol != null && friendProtocol.equals(protocolName)) {
					    	Class629.appendClientMessage(4,
					    			new StringBuilder().append(
					    					ClientMessage.REMOVEFRIEND1.getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 25263))
					    			.append
							 (displayName).append
							 (ClientMessage.REMOVEFRIEND2.getLocalisedMessage
							  (VarPlayerDomain.currentLocale,
							   (short) 19384))
							 .toString(),
						     -1381846347);
					    	return;
					    }
					}
				    }
				    if (Class482.formatStringForProtocol
					    ((Class21.myPlayer
					      .nameUnfiltered),
					     Class524.aClass600_6822, (byte) 48)
					    .equals(protocolName)) {
					Class629.appendClientMessage(4,
							     (ClientMessage.IGNORECANTADDSELF
								  .getLocalisedMessage
							      (VarPlayerDomain.currentLocale,
							       (short) 23173)),
							     -1433417674);
				    } else {
						ServerConnection class190 = ClanChannelDelta.method6943(-1630581920);
						Class241_Sub27 packet = Class445_Sub26.makePacket(
								OutgoingOpcode.ADD_IGNORE_PACKET,
								class190.packetCipher,
								16711935);
						packet.data.writeByte(Class421.getEncodedStringLength(displayName, -2082140217) + 1, 569312240);
						packet.data.writeString(displayName, 197561275);
						packet.data.writeByte(tillLogout ? 1 : 0, -26111101);
						class190.sendPacket(packet, -1949941934);
				    }
				}
		    }
		}
    }
    
    static final void method5069(ClientScriptData class454, byte i) {
	Class120_Sub10.runCommand((String) (((ClientScriptData) class454)
					     .objectStack
					     [(((ClientScriptData) class454).objectStackPointer
					       -= -1650705371) * -290357331]),
				   false, false, 1040601192);
    }
}
