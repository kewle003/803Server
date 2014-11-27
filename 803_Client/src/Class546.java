/* Class546 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class546 implements Interface56
{
    Class629 aClass629_7051;
    
    public void method429() {
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4021,
					 client.aClass190_8340.packetCipher,
					 16711935);
	class241_sub27.data.writeByteS
	    (((Class546) this).aClass629_7051.getId((byte) 0), 1910281975);
	client.aClass190_8340.sendPacket(class241_sub27, -1593637465);
    }
    
    public void method191(int i) {
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4021,
					 client.aClass190_8340.packetCipher,
					 16711935);
	class241_sub27.data.writeByteS
	    (((Class546) this).aClass629_7051.getId((byte) 0), 1887113590);
	client.aClass190_8340.sendPacket(class241_sub27, -1716532400);
    }
    
    public void method190() {
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4021,
					 client.aClass190_8340.packetCipher,
					 16711935);
	class241_sub27.data.writeByteS
	    (((Class546) this).aClass629_7051.getId((byte) 0), 1959209733);
	client.aClass190_8340.sendPacket(class241_sub27, -1684205188);
    }
    
    public void method28() {
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4021,
					 client.aClass190_8340.packetCipher,
					 16711935);
	class241_sub27.data.writeByteS
	    (((Class546) this).aClass629_7051.getId((byte) 0), 1973535344);
	client.aClass190_8340.sendPacket(class241_sub27, -1772794844);
    }
    
    Class546(Class629 class629) {
	((Class546) this).aClass629_7051 = class629;
    }
    
    static void method11992(Class103 class103, int i) {
	if (!Class16.aBool168)
	    Class241_Sub2.method14416(class103, -1509657179);
	else
	    Class236.method4728(class103, (byte) 7);
    }
    
    static final void method11993(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 1572493461 * Class13.anInt110;
    }
    
    static final void method11994(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= -1642917540;
	int i_0_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [2 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [3 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	Class247.method4950(((i_0_ >> 14 & 0x3fff)
			     - class522.baseX * 127679513),
			    (i_0_ & 0x3fff) - class522.baseY * 468558693,
			    i_1_ << 2, i_2_, i_3_, (byte) 8);
    }
}
