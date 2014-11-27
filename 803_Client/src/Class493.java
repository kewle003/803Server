/* Class493 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;

public class Class493
{
    Class388 aClass388_6517;
    public HashMap aHashMap6518;
    
    public Class493(Class388 class388) {
	method11263(-1967412569);
	((Class493) this).aClass388_6517 = class388;
    }
    
    void method11262() {
	aHashMap6518 = new HashMap();
	aHashMap6518.put(Class301.aClass301_4611, Integer.valueOf(50));
    }
    
    void method11263(int i) {
	aHashMap6518 = new HashMap();
	aHashMap6518.put(Class301.aClass301_4611, Integer.valueOf(50));
    }
    
    void method11264() {
	aHashMap6518 = new HashMap();
	aHashMap6518.put(Class301.aClass301_4611, Integer.valueOf(50));
    }
    
    void method11265() {
	aHashMap6518 = new HashMap();
	aHashMap6518.put(Class301.aClass301_4611, Integer.valueOf(50));
    }
    
    void method11266() {
	aHashMap6518 = new HashMap();
	aHashMap6518.put(Class301.aClass301_4611, Integer.valueOf(50));
    }
    
    void method11267() {
	aHashMap6518 = new HashMap();
	aHashMap6518.put(Class301.aClass301_4611, Integer.valueOf(50));
    }
    
    static void method11268(int i) {
	Class120_Sub23.aClass429_10631 = null;
	Class573_Sub1.anInt8787 = 0;
	Class573_Sub1.anInt7419 = 0;
	Class417.aClass58_6019 = null;
	Class573_Sub1.method12561();
	Class573_Sub1.aClass429_7387.method7652((byte) 22);
	Class573_Sub1.aClass564_7386 = null;
	Class573_Sub1.aClass129_7412.reset(124081017);
	Class573_Sub1.aClass129_7413.reset(-1032166712);
	Class117.aClass168_1554 = null;
	Class573_Sub1.anInt8773 = -362944491;
	Class573_Sub1.anInt8794 = -1265261197;
	if (null != Class573_Sub1.aClass524_7370) {
	    Class573_Sub1.aClass524_7370.method11734((byte) 1);
	    Class573_Sub1.aClass524_7370.method11737(128, 64, 2131649029);
	}
	if (Class573_Sub1.aClass598_7436 != null)
	    Class573_Sub1.aClass598_7436.method13124(64, 64, -1690917282);
	if (null != Class573_Sub1.aClass532_7421)
	    Class573_Sub1.aClass532_7421.method11853(256, 1141357207);
	Class541.aClass199_Sub1_7008.method16869(64, 261015552);
    }
    
    public static final void changeFriendRank/*method11269*/(String friendName, int rank, byte i_0_) {
		ServerConnection conn = ClanChannelDelta.method6943(-1843049210);
		Class241_Sub27 packet = Class445_Sub26.makePacket(
				OutgoingOpcode.CHANGE_FRIEND_RANK_PACKET,
				conn.packetCipher, 16711935);
		packet.data.writeByte(1 + Class421.getEncodedStringLength(friendName, -2106006009), 176062185);
		packet.data.writeString(friendName, -1687321385);
		packet.data.writeByteC(rank, 868520951);
		conn.sendPacket(packet, -1710462540);
    }
}
