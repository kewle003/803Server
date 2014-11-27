/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1
{
    static final int anInt9 = 7;
    static final int anInt10 = 127;
    public static Class19 aClass19_11;
    
    Class1() throws Throwable {
	throw new Error();
    }
    
    static void method451(Class103 class103, int i, int i_0_,
			  InterfaceComponent class58) {
	int i_1_ = 127;
	int i_2_ = 7;
	for (int i_3_ = 63; i_3_ >= 0; i_3_--) {
	    int i_4_ = (i_3_ & 0x3f) << 10 | (i_2_ & 0x7) << 7 | i_1_ & 0x7f;
	    Class81.method1812(false, true, 953486904);
	    int i_5_ = Class474.anIntArray6382[i_4_];
	    Class238.method4876(false, true, 1589931974);
	    class103.method2396(i,
				((63 - i_3_) * (1463495207 * class58.scrollMinY)
				 >> 6) + i_0_,
				class58.anInt850 * 439139681,
				(class58.scrollMinY * 1463495207 >> 6) + 1,
				~0xffffff | i_5_, 0);
	}
    }
    
    static void method452(InterfaceComponent class58, Class135 class135, int i, int i_6_,
			  int i_7_, int i_8_, Class168 class168, int i_9_) {
	Class212.method4293(class58, class135, i, i_6_, i_7_, i_8_, class168,
			    100.0);
    }
    
    public static void method453(String string, int i) {
	Class185.aString2181 = string;
	Class185.anInt2182 = Class185.aString2181.length() * 527811085;
    }
    
    static final void sendPrivateMessage/*method454*/(ClientScriptData scriptData, int i) {
    	scriptData.objectStackPointer -= 993556554;
		String recipient = (String) scriptData.objectStack[scriptData.objectStackPointer * -290357331];
		String message = (String) scriptData.objectStack[-290357331 * scriptData.objectStackPointer + 1];
		if (0 != 482866503 * client.playerRights || (!client.aBool8441 || client.aBool8442) && !client.isQcWorld) {
		    ServerConnection conn = ClanChannelDelta.method6943(-1515524819);
		    Class241_Sub27 packet = Class445_Sub26.makePacket(
		    		OutgoingOpcode.PRIVATE_MESSAGE_PACKET,
		    		conn.packetCipher, 16711935);
		    packet.data.writeShort(0, -484048531);
		    int start = (packet.data.pointer * 421967667);
		    packet.data.writeString(recipient, 955810284);
		    Class241_Sub18_Sub1.huffmanEncrypt(packet.data, message, 1059046689);
		    packet.data.endPacketVarShort((421967667 * packet.data.pointer - start), (byte) 48);
		    conn.sendPacket(packet, -1963085473);
		}
    }
}
