/* Class135_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class135_Sub1 extends Class135
{
    int[] anIntArray9873;
    int[] anIntArray9874;
    
    Class135_Sub1(int i, int i_0_, int[] is, int[] is_1_) {
	((Class135_Sub1) this).anIntArray9874 = is;
	((Class135_Sub1) this).anIntArray9873 = is_1_;
    }
    
    public static final void removeIgnore/*method16205*/(String ignoreName, byte i) {
		if (ignoreName != null) {
		    String string_2_
			= Class482.formatStringForProtocol(ignoreName, Class524.aClass600_6822, (byte) 101);
		    if (string_2_ != null) {
			for (int i_3_ = 0; i_3_ < -750736473 * client.ignoreListSize;
			     i_3_++) {
			    Ignore class7 = client.ignoreList[i_3_];
			    String string_4_ = class7.currentName;
			    String string_5_
				= Class482.formatStringForProtocol(string_4_,
						       Class524.aClass600_6822,
						       (byte) 48);
			    if (Class42.namesAreEqual(ignoreName, string_2_, string_4_,
						   string_5_, -474042875)) {
				client.ignoreListSize -= 1733118999;
				for (int i_6_ = i_3_;
				     i_6_ < client.ignoreListSize * -750736473; i_6_++)
				    client.ignoreList[i_6_]
					= client.ignoreList[1 + i_6_];
				client.lastFriendsListUpdate = -1343088703 * client.anInt8494;
				ServerConnection class190 = ClanChannelDelta.method6943(-2025380029);
				Class241_Sub27 class241_sub27
				    = Class445_Sub26.makePacket((OutgoingOpcode
								  .REMOVE_IGNORE_PACKET),
								 (class190
								  .packetCipher),
								 16711935);
				class241_sub27.data.writeByte
				    (Class421.getEncodedStringLength(ignoreName, -1902818564),
				     1205544312);
				class241_sub27.data
				    .writeString(ignoreName, 138997886);
				class190.sendPacket(class241_sub27, -1948998550);
				break;
			    }
			}
		    }
		}
    }
    
    static final void method16206(ClientScriptData class454, byte i) {
	int i_7_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_7_, (byte) -100);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_7_ >> 16];
	Class219.setComponentHidden(class58, class35, class454, (byte) 52);
    }
}
