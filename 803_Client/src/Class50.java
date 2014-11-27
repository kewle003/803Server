/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class50
{
    static long aLong673;
    static long aLong674;
    static Class488[] aClass488Array675;
    
    public static final synchronized long method1248() {
	long l = System.currentTimeMillis();
	if (l < aLong673 * -6025900512109217135L)
	    aLong674 += ((aLong673 * -6025900512109217135L - l)
			 * 8778380492461247639L);
	aLong673 = 5414181828135765617L * l;
	return l + aLong674 * 2132481195625493287L;
    }
    
    public static final synchronized long method1249(byte i) {
		long l = System.currentTimeMillis();
		if (l < aLong673 * -6025900512109217135L)
			aLong674 += ((aLong673 * -6025900512109217135L - l)
				 * 8778380492461247639L);
		aLong673 = 5414181828135765617L * l;
		return l + aLong674 * 2132481195625493287L;
    }
    
    public static final synchronized long method1250() {
	long l = System.currentTimeMillis();
	if (l < aLong673 * -6025900512109217135L)
	    aLong674 += ((aLong673 * -6025900512109217135L - l)
			 * 8778380492461247639L);
	aLong673 = 5414181828135765617L * l;
	return l + aLong674 * 2132481195625493287L;
    }
    
    Class50() throws Throwable {
	throw new Error();
    }
    
    static final void method1251(ClientScriptData scriptData, byte i) {
		String string = (String) (scriptData.objectStack[(scriptData.objectStackPointer -= -1650705371) * -290357331]);
		Class241_Sub27 packet = Class445_Sub26.makePacket(
				OutgoingOpcode.aClass253_4018,
				client.aClass190_8340.packetCipher, 16711935);
		packet.data.writeByte(string.length() + 1, -716609960);
		packet.data.writeString(string, -1131235182);
		client.aClass190_8340.sendPacket(packet, -1603432120);
    }
    
    static void method1252(byte[] data, int i) {
		RSByteBuffer buffer = new RSByteBuffer(data);
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) 37);
		    if (0 == opcode) {
		    	break;
		    }
		    if (opcode == 1) {
		    	Class501.anInt6587 = buffer.readUnsignedShort(1162222719) * 430086479;
		    }
		}
    }
}
