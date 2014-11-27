/* Class557 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class557 implements Interface56
{
    int anInt7256;
    
    public void method191(int i) {
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4115,
					 client.aClass190_8340.packetCipher,
					 16711935);
	class241_sub27.data
	    .writeLEShortA(2113954229 * ((Class557) this).anInt7256, (byte) 12);
	client.aClass190_8340.sendPacket(class241_sub27, -1895910035);
    }
    
    Class557(int i) {
	((Class557) this).anInt7256 = 1116751005 * i;
    }
    
    public void method190() {
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4115,
					 client.aClass190_8340.packetCipher,
					 16711935);
	class241_sub27.data
	    .writeLEShortA(2113954229 * ((Class557) this).anInt7256, (byte) 41);
	client.aClass190_8340.sendPacket(class241_sub27, -1994640076);
    }
    
    public void method28() {
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4115,
					 client.aClass190_8340.packetCipher,
					 16711935);
	class241_sub27.data
	    .writeLEShortA(2113954229 * ((Class557) this).anInt7256, (byte) -19);
	client.aClass190_8340.sendPacket(class241_sub27, -1521505247);
    }
    
    public void method429() {
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4115,
					 client.aClass190_8340.packetCipher,
					 16711935);
	class241_sub27.data
	    .writeLEShortA(2113954229 * ((Class557) this).anInt7256, (byte) 3);
	client.aClass190_8340.sendPacket(class241_sub27, -1634793051);
    }
    
    static final void method12316(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.aClass220Array8426[i_0_].anInt2565 * -177853963;
    }
    
    static final void method12317(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_1_ | i_2_;
    }
    
    static final void method12318(ClientScriptData class454, short i) {
	Class96_Sub2.method15443(Class573_Sub1.anInt8793 * 805419239,
				 (byte) 0);
    }
    
    static final void method12319(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class474.getDisplayMode(1559431861);
    }
    
    static final void method12320(ClientScriptData class454, int i) {
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (client.currentFriendsChatName != null
	    && i_3_ < -612332369 * Class357_Sub1.currentFcSize)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 1494319203 * Class350.currentFcUsers[i_3_].nodeID;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
    }
}
