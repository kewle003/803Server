/* Class215 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class215
{
    public byte[][][] heightmapData;//aByteArrayArrayArray2516
    static final int anInt2517 = 16;
    public static final int anInt2518 = 2;
    public static final int anInt2519 = 4;
    public static final int anInt2520 = 8;
    static final int anInt2521 = 2;
    static final int anInt2522 = 2;
    public static Interface13 anInterface13_2523;
    
    public boolean method4328(int i, int i_0_) {
	if (i < 0 || i_0_ < 0 || i >= heightmapData[3].length
	    || i_0_ >= heightmapData[3][i].length)
	    return false;
	return (heightmapData[3][i][i_0_] & 0x2) != 0;
    }
    
    public void method4329(int i) {
		for (int i_1_ = 0; i_1_ < heightmapData.length; i_1_++) {
		    for (int i_2_ = 0; i_2_ < heightmapData[0].length; i_2_++) {
		    	for (int i_3_ = 0; i_3_ < heightmapData[0][0].length; i_3_++) {
		    		heightmapData[i_1_][i_2_][i_3_] = (byte) 0;
		    	}
		    }
		}
    }
    
    public void method4330() {
	for (int i = 0; i < heightmapData.length; i++) {
	    for (int i_4_ = 0; i_4_ < heightmapData[0].length;
		 i_4_++) {
		for (int i_5_ = 0;
		     i_5_ < heightmapData[0][0].length; i_5_++)
		    heightmapData[i][i_4_][i_5_] = (byte) 0;
	    }
	}
    }
    
    public boolean method4331(int i, int i_6_, int i_7_) {
		if (i < 0 || i_6_ < 0 || i >= heightmapData[1].length || i_6_ >= heightmapData[1][i].length) {
		    return false;
		}
		if (0 != (heightmapData[1][i][i_6_] & 0x2)) {
		    return true;
		}
		return false;
    }
    
    public boolean method4332(int i, int i_8_, int i_9_, int i_10_,
			      int i_11_) {
	if ((heightmapData[0][i_9_][i_10_] & 0x2) != 0)
	    return true;
	if (0 != (heightmapData[i_8_][i_9_][i_10_] & 0x10))
	    return false;
	if (method4333(i_8_, i_9_, i_10_, (byte) -47) == i)
	    return true;
	return false;
    }
    
    int method4333(int i, int i_12_, int i_13_, byte i_14_) {
	if ((heightmapData[i][i_12_][i_13_] & 0x8) != 0)
	    return 0;
	if (i > 0 && 0 != (heightmapData[1][i_12_][i_13_] & 0x2))
	    return i - 1;
	return i;
    }
    
    public boolean method4334(int i, int i_15_, int i_16_) {
	if (i < 0 || i_15_ < 0 || i >= heightmapData[3].length
	    || i_15_ >= heightmapData[3][i].length)
	    return false;
	return (heightmapData[3][i][i_15_] & 0x2) != 0;
    }
    
    public boolean method4335(int i, int i_17_) {
	if (i < 0 || i_17_ < 0 || i >= heightmapData[1].length
	    || i_17_ >= heightmapData[1][i].length)
	    return false;
	if (0 != (heightmapData[1][i][i_17_] & 0x2))
	    return true;
	return false;
    }
    
    public boolean method4336(int i, int i_18_) {
	if (i < 0 || i_18_ < 0 || i >= heightmapData[1].length
	    || i_18_ >= heightmapData[1][i].length)
	    return false;
	if (0 != (heightmapData[1][i][i_18_] & 0x2))
	    return true;
	return false;
    }
    
    public boolean method4337(int i, int i_19_) {
	if (i < 0 || i_19_ < 0 || i >= heightmapData[1].length
	    || i_19_ >= heightmapData[1][i].length)
	    return false;
	if (0 != (heightmapData[1][i][i_19_] & 0x2))
	    return true;
	return false;
    }
    
    public Class215(int i, int i_20_, int i_21_) {
	heightmapData = new byte[i][i_20_][i_21_];
    }
    
    public boolean method4338(int i, int i_22_, int i_23_, int i_24_) {
	if ((heightmapData[0][i_23_][i_24_] & 0x2) != 0)
	    return true;
	if (0 != (heightmapData[i_22_][i_23_][i_24_] & 0x10))
	    return false;
	if (method4333(i_22_, i_23_, i_24_, (byte) -123) == i)
	    return true;
	return false;
    }
    
    public boolean method4339(int i, int i_25_, int i_26_, int i_27_) {
	if ((heightmapData[0][i_26_][i_27_] & 0x2) != 0)
	    return true;
	if (0 != (heightmapData[i_25_][i_26_][i_27_] & 0x10))
	    return false;
	if (method4333(i_25_, i_26_, i_27_, (byte) -60) == i)
	    return true;
	return false;
    }
    
    public boolean method4340(int i, int i_28_, int i_29_, int i_30_) {
	if ((heightmapData[0][i_29_][i_30_] & 0x2) != 0)
	    return true;
	if (0 != (heightmapData[i_28_][i_29_][i_30_] & 0x10))
	    return false;
	if (method4333(i_28_, i_29_, i_30_, (byte) -35) == i)
	    return true;
	return false;
    }
    
    int method4341(int i, int i_31_, int i_32_) {
	if ((heightmapData[i][i_31_][i_32_] & 0x8) != 0)
	    return 0;
	if (i > 0 && 0 != (heightmapData[1][i_31_][i_32_] & 0x2))
	    return i - 1;
	return i;
    }
    
    static final void method4342(ClientScriptData class454, int i) {
	int i_33_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (2 == client.friendListStage * -2020075851
	    && i_33_ < 1557840217 * client.friendListSize)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 1337402161 * client.friendList[i_33_].serverNodeID;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
    }
    
    static final void method4343(ClientScriptData class454, int i) {
	ServerConnection class190 = ClanChannelDelta.method6943(-1158635959);
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4075,
					 class190.packetCipher, 16711935);
	class241_sub27.data.writeByte(0, 1176038762);
	int i_34_
	    = 421967667 * class241_sub27.data.pointer;
	class241_sub27.data.writeByte(1, -1777153472);
	class241_sub27.data.writeShort
	    (((ClientScriptData) class454).aClass333_6242.anInt5058 * -1422545021,
	     -484048531);
	((ClientScriptData) class454).aClass333_6242.aClass241_Sub39_Sub9_5059
	    .method17176
	    (class241_sub27.data,
	     ((ClientScriptData) class454).aClass333_6242.anIntArray5060, 56142522);
	class241_sub27.data.endPacketVarByte
	    ((class241_sub27.data.pointer * 421967667
	      - i_34_),
	     1610854123);
	class190.sendPacket(class241_sub27, -1517345137);
    }
    
    static final void method4344(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.aBool8544 ? 1 : 0;
    }
    
    static final void method4345(ClientScriptData class454, byte i) {
	int i_35_ = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (client.currentFriendsChatName != null && i_35_ < Class357_Sub1.currentFcSize * -612332369)
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= Class350.currentFcUsers[i_35_].displayName;
	else
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
    }
}
