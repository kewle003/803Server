/* Class241_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub27 extends Node
{
    static Class241_Sub27[] aClass241_Sub27Array9024 = new Class241_Sub27[300];
    int expectedSize;//anInt9025
    public RSBitBuffer data;//aClass241_Sub3_Sub1_9026
    public int size;//anInt9027
    static int anInt9028 = 0;
    OutgoingOpcode opcode;//aClass253_9029
    
    public void method15096(int i) {
	if (-1616563819 * anInt9028 < aClass241_Sub27Array9024.length)
	    aClass241_Sub27Array9024[((anInt9028 += -2032037443) * -1616563819
				      - 1)]
		= this;
    }
    
    public static Class241_Sub27 method15097() {
	Class241_Sub27 class241_sub27 = Class105_Sub1.method15442((byte) 109);
	((Class241_Sub27) class241_sub27).opcode = null;
	((Class241_Sub27) class241_sub27).expectedSize = 0;
	class241_sub27.data = new RSBitBuffer(5000);
	return class241_sub27;
    }
    
    Class241_Sub27() {
	/* empty */
    }
    
    public static Class241_Sub27 method15098(OutgoingOpcode class253,
					     IsaacCipher class418) {
	Class241_Sub27 class241_sub27 = Class105_Sub1.method15442((byte) 41);
	((Class241_Sub27) class241_sub27).opcode = class253;
	((Class241_Sub27) class241_sub27).expectedSize
	    = -1564242269 * ((OutgoingOpcode) class253).size;
	if (-1 == ((Class241_Sub27) class241_sub27).expectedSize * 986449709)
	    class241_sub27.data
		= new RSBitBuffer(260);
	else if (-2 == 986449709 * ((Class241_Sub27) class241_sub27).expectedSize)
	    class241_sub27.data
		= new RSBitBuffer(10000);
	else if (((Class241_Sub27) class241_sub27).expectedSize * 986449709 <= 18)
	    class241_sub27.data
		= new RSBitBuffer(20);
	else if (986449709 * ((Class241_Sub27) class241_sub27).expectedSize <= 98)
	    class241_sub27.data
		= new RSBitBuffer(100);
	else
	    class241_sub27.data
		= new RSBitBuffer(260);
	class241_sub27.data.setCipher(class418,
							    672758631);
	class241_sub27.data.writePacketOpcode
	    (399811741 * ((OutgoingOpcode) (((Class241_Sub27) class241_sub27)
				      .opcode)).opcode,
	     -1904523975);
	class241_sub27.size = 0;
	return class241_sub27;
    }
    
    static Class241_Sub27 method15099() {
	if (0 == -1616563819 * anInt9028)
	    return new Class241_Sub27();
	return (aClass241_Sub27Array9024
		[(anInt9028 -= -2032037443) * -1616563819]);
    }
    
    public void method15100() {
	if (-1616563819 * anInt9028 < aClass241_Sub27Array9024.length)
	    aClass241_Sub27Array9024[((anInt9028 += -2032037443) * -1616563819
				      - 1)]
		= this;
    }
    
    public static Class241_Sub27 method15101() {
	Class241_Sub27 class241_sub27 = Class105_Sub1.method15442((byte) 29);
	((Class241_Sub27) class241_sub27).opcode = null;
	((Class241_Sub27) class241_sub27).expectedSize = 0;
	class241_sub27.data = new RSBitBuffer(5000);
	return class241_sub27;
    }
    
    public static Class241_Sub27 method15102() {
	Class241_Sub27 class241_sub27 = Class105_Sub1.method15442((byte) 95);
	((Class241_Sub27) class241_sub27).opcode = null;
	((Class241_Sub27) class241_sub27).expectedSize = 0;
	class241_sub27.data = new RSBitBuffer(5000);
	return class241_sub27;
    }
    
    public void method15103() {
	if (-1616563819 * anInt9028 < aClass241_Sub27Array9024.length)
	    aClass241_Sub27Array9024[((anInt9028 += -2032037443) * -1616563819
				      - 1)]
		= this;
    }
    
    public void method15104() {
	if (-1616563819 * anInt9028 < aClass241_Sub27Array9024.length)
	    aClass241_Sub27Array9024[((anInt9028 += -2032037443) * -1616563819
				      - 1)]
		= this;
    }
    
    public void method15105() {
	if (-1616563819 * anInt9028 < aClass241_Sub27Array9024.length)
	    aClass241_Sub27Array9024[((anInt9028 += -2032037443) * -1616563819
				      - 1)]
		= this;
    }
    
    static Class241_Sub27 method15106() {
	if (0 == -1616563819 * anInt9028)
	    return new Class241_Sub27();
	return (aClass241_Sub27Array9024
		[(anInt9028 -= -2032037443) * -1616563819]);
    }
    
    public void method15107() {
	if (-1616563819 * anInt9028 < aClass241_Sub27Array9024.length)
	    aClass241_Sub27Array9024[((anInt9028 += -2032037443) * -1616563819
				      - 1)]
		= this;
    }
}
