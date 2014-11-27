/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class90
{
    public static final int anInt1299 = 64;
    public static int[] anIntArray1300 = { 3, 7, 15 };
    public static final int anInt1301 = 16;
    public static final int anInt1302 = 8191;
    public static final int anInt1303 = 8;
    public static final int anInt1304 = 32;
    public static final int anInt1305 = 16;
    public static final int anInt1306 = 1023;
    public static final int anInt1307 = 0;
    public static final int anInt1308 = 1;
    public static final int anInt1309 = 0;
    public static final int anInt1310 = 2;
    public static int[] anIntArray1311 = { 2047, 16383, 65535 };
    public static final int anInt1312 = 2;
    
    Class90() throws Throwable {
	throw new Error();
    }
    
    static Class256[] method2059(short i) {
	return (new Class256[]
		{ Class256.aClass256_4154, Class256.aClass256_4142,
		  Class256.aClass256_4147, Class256.aClass256_4152,
		  Class256.aClass256_4149, Class256.aClass256_4144,
		  Class256.aClass256_4150, Class256.aClass256_4148,
		  Class256.aClass256_4146, Class256.aClass256_4141,
		  Class256.aClass256_4143, Class256.aClass256_4151 });
    }
    
    static void method2060(ServerConnection conn, InterfaceComponent component, int button, int slot1,
			   int slot2, int i_2_) {
		if (1 == button) {
		    Class241_Sub27 packet = Class445_Sub26.makePacket(
		    		OutgoingOpcode.ACTION_BUTTON_1_PACKET,
					conn.packetCipher, 16711935);
		    Class25.packAction(packet, slot1, slot2, component.slot2 * 877329925, 166539920);
		    conn.sendPacket(packet, -2089964724);
		}
		if (2 == button) {
		    Class241_Sub27 packet = Class445_Sub26.makePacket(
		    		OutgoingOpcode.ACTION_BUTTON_2_PACKET,
					conn.packetCipher, 16711935);
		    Class25.packAction(packet, slot1, slot2, component.slot2 * 877329925, -1201488004);
		    conn.sendPacket(packet, -1866941214);
		}
		if (button == 3) {
		    Class241_Sub27 packet = Class445_Sub26.makePacket(
		    		OutgoingOpcode.ACTION_BUTTON_3_PACKET,
					conn.packetCipher, 16711935);
		    Class25.packAction(packet, slot1, slot2, component.slot2 * 877329925, -2012138987);
		    conn.sendPacket(packet, -1710062864);
		}
		if (4 == button) {
		    Class241_Sub27 packet = Class445_Sub26.makePacket(
					OutgoingOpcode.ACTION_BUTTON_4_PACKET,
					conn.packetCipher, 16711935);
		    Class25.packAction(packet, slot1, slot2, 877329925 * component.slot2, -44563028);
		    conn.sendPacket(packet, -1801888334);
		}
		if (5 == button) {
		    Class241_Sub27 packet = Class445_Sub26.makePacket(
		    		OutgoingOpcode.ACTION_BUTTON_5_PACKET,
					conn.packetCipher, 16711935);
		    Class25.packAction(packet, slot1, slot2, component.slot2 * 877329925, -88421023);
		    conn.sendPacket(packet, -1496058659);
		}
		if (button == 6) {
		    Class241_Sub27 packet = Class445_Sub26.makePacket(
		    		OutgoingOpcode.ACTION_BUTTON_6_PACKET,
					conn.packetCipher, 16711935);
		    Class25.packAction(packet, slot1, slot2, 877329925 * component.slot2, 1468456822);
		    conn.sendPacket(packet, -2041387629);
		}
		if (7 == button) {
		    Class241_Sub27 packet = Class445_Sub26.makePacket(
		    		OutgoingOpcode.ACTION_BUTTON_7_PACKET,
					conn.packetCipher, 16711935);
		    Class25.packAction(packet, slot1, slot2, component.slot2 * 877329925, -869799946);
		    conn.sendPacket(packet, -1889602103);
		}
		if (button == 8) {
		    Class241_Sub27 packet = Class445_Sub26.makePacket(
		    		OutgoingOpcode.ACTION_BUTTON_8_PACKET,
		    		conn.packetCipher, 16711935);
		    Class25.packAction(packet, slot1, slot2, 877329925 * component.slot2, -1480416046);
		    conn.sendPacket(packet, -1497617010);
		}
		if (9 == button) {
		    Class241_Sub27 packet = Class445_Sub26.makePacket(
		    		OutgoingOpcode.ACTION_BUTTON_9_PACKET,
		    		conn.packetCipher, 16711935);
		    Class25.packAction(packet, slot1, slot2, component.slot2 * 877329925, -323671407);
		    conn.sendPacket(packet, -1624751082);
		}
		if (button == 10) {
		    Class241_Sub27 packet = Class445_Sub26.makePacket(
					OutgoingOpcode.ACTION_BUTTON_10_PACKET,
					conn.packetCipher, 16711935);
		    Class25.packAction(packet, slot1, slot2, 877329925 * component.slot2, -535693896);
		    conn.sendPacket(packet, -1723306925);
		}
    }
    
    static final void method2061(InterfaceComponent class58, ClientScriptData class454, short i) {
	int i_3_ = 10;
	Class475_Sub1_Sub5_Sub1.method17723(class58, i_3_, class454,
					    -316500858);
    }
}
