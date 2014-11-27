/* Class464_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class464_Sub1 extends Class464
{
    int method10685(byte i) {
	return 0;
    }
    
    void method10680(RSByteBuffer class241_sub3,
		     Class241_Sub24 class241_sub24) {
	/* empty */
    }
    
    Class464_Sub1() {
	/* empty */
    }
    
    Class241_Sub24 method14310(int i) {
	return (Class241_Sub24) client.aClass429_8311.method7694(16711935);
    }
    
    Class241_Sub27 makePacket(int i) {
	return Class445_Sub26.makePacket(OutgoingOpcode.MOUSE_PACKET,
					  client.aClass190_8340.packetCipher,
					  16711935);
    }
    
    void method10686(RSByteBuffer class241_sub3,
		     Class241_Sub24 class241_sub24, int i) {
	/* empty */
    }
    
    void method10687(byte i) {
		Class241_Sub24 location = method14310(1736754263);
		if (null != location) {
		    int time = method10700(location, 32767, 752739528);
		    int y = location.getY((byte) 118);
		    if (y < 0) {
		    	y = 0;
		    } else if (y > 65535) {
		    	y = 65535;
		    }
		    int x = location.getX((byte) -69);
		    if (x < 0) {
		    	x = 0;
		    }
		    else if (x > 65535) {
		    	x = 65535;
		    }
		    int mouseButton = 0;
		    if (location.method15064(1357100966) == 2) {
		    	mouseButton = 1;
		    }
		    Class241_Sub27 packet = Class445_Sub26.makePacket(
		    		OutgoingOpcode.CLICK_PACKET,
					client.aClass190_8340.packetCipher,
					16711935);
		    packet.data.writeIntV2(x | y << 16, -1567821956);
		    packet.data.writeLEShort(time | mouseButton << 15, 342075095);
		    client.aClass190_8340.sendPacket(packet, -2116405946);
		}
    }
    
    void method10701() {
	Class241_Sub24 class241_sub24 = method14310(1736754263);
	if (null != class241_sub24) {
	    int i = method10700(class241_sub24, 32767, 1897751780);
	    int i_4_ = class241_sub24.getY((byte) 115);
	    if (i_4_ < 0)
		i_4_ = 0;
	    else if (i_4_ > 65535)
		i_4_ = 65535;
	    int i_5_ = class241_sub24.getX((byte) 7);
	    if (i_5_ < 0)
		i_5_ = 0;
	    else if (i_5_ > 65535)
		i_5_ = 65535;
	    int i_6_ = 0;
	    if (class241_sub24.method15064(369484323) == 2)
		i_6_ = 1;
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.CLICK_PACKET,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data
		.writeIntV2(i_5_ | i_4_ << 16, -1782700824);
	    class241_sub27.data.writeLEShort(i | i_6_ << 15,
								-437527437);
	    client.aClass190_8340.sendPacket(class241_sub27, -1607320284);
	}
    }
    
    void method10691() {
	Class241_Sub24 class241_sub24 = method14310(1736754263);
	if (null != class241_sub24) {
	    int i = method10700(class241_sub24, 32767, 581164083);
	    int i_7_ = class241_sub24.getY((byte) 106);
	    if (i_7_ < 0)
		i_7_ = 0;
	    else if (i_7_ > 65535)
		i_7_ = 65535;
	    int i_8_ = class241_sub24.getX((byte) 20);
	    if (i_8_ < 0)
		i_8_ = 0;
	    else if (i_8_ > 65535)
		i_8_ = 65535;
	    int i_9_ = 0;
	    if (class241_sub24.method15064(268682436) == 2)
		i_9_ = 1;
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.CLICK_PACKET,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data
		.writeIntV2(i_8_ | i_7_ << 16, -1279690943);
	    class241_sub27.data.writeLEShort(i | i_9_ << 15,
								-198845943);
	    client.aClass190_8340.sendPacket(class241_sub27, -2088181762);
	}
    }
    
    int method10695() {
	return 0;
    }
    
    boolean method10693() {
	return (method14310(1736754263) != null
		|| (-3288374089961196625L * ((Class464_Sub1) this).aLong6292
		    < Class50.method1249((byte) 1) - 2000L));
    }
    
    Class241_Sub27 method10694() {
	return Class445_Sub26.makePacket(OutgoingOpcode.MOUSE_PACKET,
					  client.aClass190_8340.packetCipher,
					  16711935);
    }
    
    Class241_Sub24 method14311() {
	return (Class241_Sub24) client.aClass429_8311.method7694(16711935);
    }
    
    void method10696(RSByteBuffer class241_sub3,
		     Class241_Sub24 class241_sub24) {
	/* empty */
    }
    
    void method10692() {
	Class241_Sub24 class241_sub24 = method14310(1736754263);
	if (null != class241_sub24) {
	    int i = method10700(class241_sub24, 32767, -1076686610);
	    int i_10_ = class241_sub24.getY((byte) 74);
	    if (i_10_ < 0)
		i_10_ = 0;
	    else if (i_10_ > 65535)
		i_10_ = 65535;
	    int i_11_ = class241_sub24.getX((byte) -59);
	    if (i_11_ < 0)
		i_11_ = 0;
	    else if (i_11_ > 65535)
		i_11_ = 65535;
	    int i_12_ = 0;
	    if (class241_sub24.method15064(1135465997) == 2)
		i_12_ = 1;
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.CLICK_PACKET,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data
		.writeIntV2(i_11_ | i_10_ << 16, 170479800);
	    class241_sub27.data
		.writeLEShort(i | i_12_ << 15, -1279886873);
	    client.aClass190_8340.sendPacket(class241_sub27, -1690899239);
	}
    }
    
    void method10697(RSByteBuffer class241_sub3,
		     Class241_Sub24 class241_sub24) {
	/* empty */
    }
    
    boolean method10690(int i) {
	return (method14310(1736754263) != null
		|| (-3288374089961196625L * ((Class464_Sub1) this).aLong6292
		    < Class50.method1249((byte) 1) - 2000L));
    }
}
