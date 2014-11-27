/* Class629 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class629 implements Interface47
{
    static Class629 aClass629_8003;
    static Class629 aClass629_8004 = new Class629(0);
    static Class629 aClass629_8005;
    public static Class629 aClass629_8006;
    public static Class629 aClass629_8007;
    public static Class629 aClass629_8008;
    static Class629 aClass629_8009;
    static Class629 aClass629_8010 = new Class629(1);
    public static Class629 aClass629_8011;
    public static Class629 aClass629_8012;
    public static Class629 aClass629_8013;
    static Class629 aClass629_8014;
    public static Class629 aClass629_8015;
    static Class629 aClass629_8016;
    int anInt8017;
    
    Class629(int i) {
	((Class629) this).anInt8017 = 668558455 * i;
    }
    
    public int method11() {
	return -1292126905 * ((Class629) this).anInt8017;
    }
    
    static {
	aClass629_8005 = new Class629(2);
	aClass629_8008 = new Class629(3);
	aClass629_8007 = new Class629(4);
	aClass629_8003 = new Class629(5);
	aClass629_8009 = new Class629(6);
	aClass629_8016 = new Class629(7);
	aClass629_8011 = new Class629(8);
	aClass629_8012 = new Class629(9);
	aClass629_8013 = new Class629(10);
	aClass629_8014 = new Class629(11);
	aClass629_8015 = new Class629(12);
	aClass629_8006 = new Class629(13);
    }
    
    public int getId(byte i) {
	return -1292126905 * ((Class629) this).anInt8017;
    }
    
    public int method10() {
	return -1292126905 * ((Class629) this).anInt8017;
    }
    
    public int method9() {
	return -1292126905 * ((Class629) this).anInt8017;
    }
    
    public int method147() {
	return -1292126905 * ((Class629) this).anInt8017;
    }
    
    public static void method13475(int i) {
	if (8 == client.anInt8288 * 1766317249) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4125,
					     (client.aClass190_8339
					      .packetCipher),
					     16711935);
	    client.aClass190_8339.sendPacket(class241_sub27, -2127354149);
	    Class327.aClass411_5019 = Class411.aClass411_5936;
	    OutputStream_Sub1.aString8604 = null;
	}
    }
    
    public static void appendClientMessage/*method13476*/(int opcode, String message, int i_0_) {
    	Class318.appendChatboxMessage(opcode, 0, "", "", "", message, -1950949970);
    }
    
    public static Class266 method13477(int i) {
	Class266 class266 = new Class266();
	class266.method5125(0.0F, 1.0F, 0.0F,
			    (float) (Math.random() * 3.141592653589793 * 2.0));
	float f = (float) (0.5 + 0.5 * Math.random()) * 256.0F;
	class266.method5133(f - 128.0F, 0.0F, 0.0F);
	class266.method5128(0.0F, 1.0F, 0.0F,
			    (float) (Math.random() * 3.141592653589793 * 2.0));
	return class266;
    }
}
