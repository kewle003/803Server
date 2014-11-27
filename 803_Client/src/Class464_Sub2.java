/* Class464_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;
import java.util.Queue;

public class Class464_Sub2 extends Class464
{
    Queue aQueue8796 = new LinkedList();
    
    void method10687(byte i) {
		Class241_Sub24_Sub1 class241_sub24_sub1
			= (Class241_Sub24_Sub1) aQueue8796.poll();
		if (class241_sub24_sub1 != null) {
			Class241_Sub27 packet = Class445_Sub26.makePacket(
					OutgoingOpcode.aClass253_4012,
					client.aClass190_8340.packetCipher, 16711935);
			packet.data.writeInt((class241_sub24_sub1.getX((byte) -19)
					| class241_sub24_sub1.getY((byte) 74) << 16),
					1221597158);
			packet.data.writeByteC(
					(class241_sub24_sub1.method17007((byte) 3) << 1
					| class241_sub24_sub1.method17006((byte) -105) & 0x1),
					868520951);
			packet.data.writeShort(
					method10700(class241_sub24_sub1, 65535, -1995538162),
					-484048531);
			client.aClass190_8340.sendPacket(packet, -1844681928);
			class241_sub24_sub1.method15070(373866037);
		}
    }
    
    int method10685(byte i) {
	return 1;
    }
    
    int method10695() {
	return 1;
    }
    
    void method10701() {
	Class241_Sub24_Sub1 class241_sub24_sub1
	    = (Class241_Sub24_Sub1) aQueue8796.poll();
	if (class241_sub24_sub1 != null) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4012,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeInt
		((class241_sub24_sub1.getX((byte) 81)
		  | class241_sub24_sub1.getY((byte) 21) << 16),
		 141916108);
	    class241_sub27.data.writeByteC
		((class241_sub24_sub1.method17007((byte) 3) << 1
		  | class241_sub24_sub1.method17006((byte) -97) & 0x1),
		 868520951);
	    class241_sub27.data.writeShort
		(method10700(class241_sub24_sub1, 65535, 1956466062),
		 -484048531);
	    client.aClass190_8340.sendPacket(class241_sub27, -1680254138);
	    class241_sub24_sub1.method15070(-29810948);
	}
    }
    
    Class241_Sub27 makePacket/*method10689*/(int i) {
    	return Class445_Sub26.makePacket(
    			OutgoingOpcode.aClass253_4020,
    			client.aClass190_8340.packetCipher, 16711935);
    }
    
    boolean method10690(int i) {
	return (!aQueue8796.isEmpty()
		|| (-3288374089961196625L * aLong6292
		    < Class50.method1249((byte) 1) - 2000L));
    }
    
    void method10686(RSByteBuffer class241_sub3,
		     Class241_Sub24 class241_sub24, int i) {
	method14615(class241_sub3, (Class241_Sub24_Sub1) class241_sub24,
		    1448888660);
    }
    
    void method10680(RSByteBuffer class241_sub3,
		     Class241_Sub24 class241_sub24) {
	method14615(class241_sub3, (Class241_Sub24_Sub1) class241_sub24,
		    1756867579);
    }
    
    void method14613(Class241_Sub24_Sub1 class241_sub24_sub1, int i) {
	aQueue8796.add(class241_sub24_sub1);
	if (aQueue8796.size() > 10)
	    aQueue8796.poll();
    }
    
    void method10691() {
	Class241_Sub24_Sub1 class241_sub24_sub1
	    = (Class241_Sub24_Sub1) aQueue8796.poll();
	if (class241_sub24_sub1 != null) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4012,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeInt
		((class241_sub24_sub1.getX((byte) -4)
		  | class241_sub24_sub1.getY((byte) 100) << 16),
		 -204195465);
	    class241_sub27.data.writeByteC
		((class241_sub24_sub1.method17007((byte) 3) << 1
		  | class241_sub24_sub1.method17006((byte) -10) & 0x1),
		 868520951);
	    class241_sub27.data.writeShort
		(method10700(class241_sub24_sub1, 65535, 1761486062),
		 -484048531);
	    client.aClass190_8340.sendPacket(class241_sub27, -1758093656);
	    class241_sub24_sub1.method15070(138997894);
	}
    }
    
    Class464_Sub2() {
	/* empty */
    }
    
    boolean method10693() {
	return (!aQueue8796.isEmpty()
		|| (-3288374089961196625L * aLong6292
		    < Class50.method1249((byte) 1) - 2000L));
    }
    
    Class241_Sub27 method10694() {
		return Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4020,
					  client.aClass190_8340.packetCipher,
					  16711935);
    }
    
    void method14614(RSByteBuffer class241_sub3,
		     Class241_Sub24_Sub1 class241_sub24_sub1) {
	class241_sub3.writeByte(class241_sub24_sub1.method17006((byte) -47),
				  -106989238);
    }
    
    void method14615(RSByteBuffer class241_sub3,
		     Class241_Sub24_Sub1 class241_sub24_sub1, int i) {
	class241_sub3.writeByte(class241_sub24_sub1.method17006((byte) -94),
				  -1125915002);
    }
    
    void method10696(RSByteBuffer class241_sub3,
		     Class241_Sub24 class241_sub24) {
	method14615(class241_sub3, (Class241_Sub24_Sub1) class241_sub24,
		    1917726932);
    }
    
    void method10692() {
	Class241_Sub24_Sub1 class241_sub24_sub1
	    = (Class241_Sub24_Sub1) aQueue8796.poll();
	if (class241_sub24_sub1 != null) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4012,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeInt
		((class241_sub24_sub1.getX((byte) -65)
		  | class241_sub24_sub1.getY((byte) 64) << 16),
		 1860875765);
	    class241_sub27.data.writeByteC
		((class241_sub24_sub1.method17007((byte) 3) << 1
		  | class241_sub24_sub1.method17006((byte) -21) & 0x1),
		 868520951);
	    class241_sub27.data.writeShort
		(method10700(class241_sub24_sub1, 65535, 686065703),
		 -484048531);
	    client.aClass190_8340.sendPacket(class241_sub27, -2034310509);
	    class241_sub24_sub1.method15070(-719602080);
	}
    }
    
    void method10697(RSByteBuffer class241_sub3,
		     Class241_Sub24 class241_sub24) {
	method14615(class241_sub3, (Class241_Sub24_Sub1) class241_sub24,
		    1797758351);
    }
}
