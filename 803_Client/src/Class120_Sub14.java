/* Class120_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub14 extends Class120
{
    String aString10536;
    int anInt10537;
    static Class563 aClass563_10538;
    
    public void method2961() {
	if (-1 != client.anInt8352 * 2040707973)
	    Class84.method1837(client.anInt8352 * 2040707973,
			       ((Class120_Sub14) this).aString10536,
			       ((Class120_Sub14) this).anInt10537 * 768977449,
			       43202055);
    }
    
    public void method2958(int i) {
	if (-1 != client.anInt8352 * 2040707973)
	    Class84.method1837(client.anInt8352 * 2040707973,
			       ((Class120_Sub14) this).aString10536,
			       ((Class120_Sub14) this).anInt10537 * 768977449,
			       43202055);
    }
    
    Class120_Sub14(RSByteBuffer class241_sub3) {
	super(class241_sub3);
	((Class120_Sub14) this).aString10536
	    = class241_sub3.readString(-593163410);
	((Class120_Sub14) this).anInt10537
	    = class241_sub3.readUnsignedShort(1162222719) * -750808551;
    }
    
    static void method16786(Class103 class103, int i) {
	if ((Class21.myPlayer.nodePlane
	     != Class194.anInt2299 * -1342949133)
	    && client.aClass238_8477.method4751(-1015823535) != null) {
	    Class50.method1249((byte) 1);
	    if (Class241_Sub41.method16449(class103,
					   (Class21
					    .myPlayer
					    .nodePlane),
					   (byte) -47))
		Class194.anInt2299
		    = (472227899
		       * Class21.myPlayer.nodePlane);
	}
    }
    
    public static Class433[] method16787(int i) {
	return (new Class433[]
		{ Class433.aClass433_6112, Class433.aClass433_6116,
		  Class433.aClass433_6117, Class433.aClass433_6113,
		  Class433.aClass433_6110, Class433.aClass433_6109,
		  Class433.aClass433_6114, Class433.aClass433_6111,
		  Class433.aClass433_6115, Class433.aClass433_6108 });
    }
}
