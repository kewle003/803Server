/* Class445_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class445_Sub26 extends Class445
{
    public static final int anInt8697 = 1;
    public static final int anInt8698 = 2;
    public static final int anInt8699 = 0;
    
    void method7882(int i, int i_0_) {
	anInt6176 = -679946765 * i;
    }
    
    public Class445_Sub26(int i, Class241_Sub9 class241_sub9) {
	super(i, class241_sub9);
    }
    
    int method7885() {
	return 2;
    }
    
    int method7881(int i) {
	return 2;
    }
    
    int method7880(int i, int i_1_) {
	return 1;
    }
    
    public Class445_Sub26(Class241_Sub9 class241_sub9) {
	super(class241_sub9);
    }
    
    public void method14351(int i) {
	if ((aClass241_Sub9_6175.aClass445_Sub21_8853.method14299(-1759664827)
	     == 2)
	    && 2034617147 * anInt6176 == 2)
	    anInt6176 = -679946765;
	if (anInt6176 * 2034617147 < 0 || 2034617147 * anInt6176 > 2)
	    anInt6176 = method7881(-1388129207) * -679946765;
    }
    
    int method7883() {
	return 2;
    }
    
    public int method14352(byte i) {
	return anInt6176 * 2034617147;
    }
    
    public int method14353() {
	return anInt6176 * 2034617147;
    }
    
    int method7886(int i) {
	return 1;
    }
    
    int method7887(int i) {
	return 1;
    }
    
    int method7879(int i) {
	return 1;
    }
    
    void method7888(int i) {
	anInt6176 = -679946765 * i;
    }
    
    void method7889(int i) {
	anInt6176 = -679946765 * i;
    }
    
    public int method14354() {
	return anInt6176 * 2034617147;
    }
    
    public void method14355() {
	if ((aClass241_Sub9_6175.aClass445_Sub21_8853.method14299(-946424618)
	     == 2)
	    && 2034617147 * anInt6176 == 2)
	    anInt6176 = -679946765;
	if (anInt6176 * 2034617147 < 0 || 2034617147 * anInt6176 > 2)
	    anInt6176 = method7881(1393226875) * -679946765;
    }
    
    public void method14356() {
	if ((aClass241_Sub9_6175.aClass445_Sub21_8853.method14299(-1629380700)
	     == 2)
	    && 2034617147 * anInt6176 == 2)
	    anInt6176 = -679946765;
	if (anInt6176 * 2034617147 < 0 || 2034617147 * anInt6176 > 2)
	    anInt6176 = method7881(-415305412) * -679946765;
    }
    
    int method7884() {
	return 2;
    }
    
    public static Class241_Sub27 makePacket/*method14357*/(OutgoingOpcode opcode, IsaacCipher cipher, int i) {
		Class241_Sub27 packet = Class105_Sub1.method15442((byte) 67);
		packet.opcode = opcode;
		packet.expectedSize = -1564242269 * opcode.size;
		if (-1 == packet.expectedSize * 986449709) {
			packet.data = new RSBitBuffer(260);
		} else if (-2 == 986449709 * packet.expectedSize) {
			packet.data = new RSBitBuffer(10000);
		} else if (packet.expectedSize * 986449709 <= 18) {
			packet.data = new RSBitBuffer(20);
		} else if (986449709 * packet.expectedSize <= 98) {
			packet.data = new RSBitBuffer(100);
		} else {
			packet.data = new RSBitBuffer(260);
		}
		packet.data.setCipher(cipher, -411610646);
		packet.data.writePacketOpcode(399811741 * ((OutgoingOpcode) packet.opcode).opcode, -1904523975);
		packet.size = 0;
		return packet;
    }
}
