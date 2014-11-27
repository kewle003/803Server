/* Class120_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub8 extends Class120
{
    int anInt10497;
    int anInt10498;
    int anInt10499;
    int anInt10500;
    String aString10501;
    public static Class619 aClass619_10502;
    
    Class120_Sub8(RSByteBuffer class241_sub3) {
	super(class241_sub3);
	((Class120_Sub8) this).anInt10498
	    = class241_sub3.readUnsignedShort(1162222719) * -349391679;
	((Class120_Sub8) this).anInt10499
	    = class241_sub3.readUnsignedShort(1162222719) * -1478682925;
	((Class120_Sub8) this).aString10501
	    = class241_sub3.readString(-1093541702);
	((Class120_Sub8) this).anInt10500
	    = class241_sub3.readInt((byte) 28) * -944496883;
	((Class120_Sub8) this).anInt10497
	    = class241_sub3.readUnsignedShort(1162222719) * 1055525311;
    }
    
    public void method2958(int i) {
	Class403.method7212(993680393 * Class357_Sub1.anInt10357,
			    ((Class120_Sub8) this).anInt10498 * 323345217,
			    -683953829 * ((Class120_Sub8) this).anInt10499,
			    (Class96_Sub5.method16046
			     (((Class120_Sub8) this).anInt10498 * 323345217,
			      -683953829 * ((Class120_Sub8) this).anInt10499,
			      Class357_Sub1.anInt10357 * 993680393,
			      1659421708)),
			    ((Class120_Sub8) this).anInt10497 * -841292225,
			    -1090140219 * ((Class120_Sub8) this).anInt10500,
			    ((Class120_Sub8) this).aString10501, -425368904);
    }
    
    public void method2961() {
	Class403.method7212(993680393 * Class357_Sub1.anInt10357,
			    ((Class120_Sub8) this).anInt10498 * 323345217,
			    -683953829 * ((Class120_Sub8) this).anInt10499,
			    (Class96_Sub5.method16046
			     (((Class120_Sub8) this).anInt10498 * 323345217,
			      -683953829 * ((Class120_Sub8) this).anInt10499,
			      Class357_Sub1.anInt10357 * 993680393,
			      -517424274)),
			    ((Class120_Sub8) this).anInt10497 * -841292225,
			    -1090140219 * ((Class120_Sub8) this).anInt10500,
			    ((Class120_Sub8) this).aString10501, -427681375);
    }
    
    static void method16775(int i) {
	for (Class241_Sub39_Sub11 class241_sub39_sub11
		 = ((Class241_Sub39_Sub11)
		    Class16.aClass429_150.method7694(16711935));
	     null != class241_sub39_sub11;
	     class241_sub39_sub11
		 = ((Class241_Sub39_Sub11)
		    Class16.aClass429_150.method7692(380610924))) {
	    if (Class62.method1618((((Class241_Sub39_Sub11)
				     class241_sub39_sub11).anInt10879
				    * -142243581),
				   1781676373))
		Class11.method596(class241_sub39_sub11, -1288575817);
	}
    }
    
    public static void method16776(int i, int i_0_, int i_1_) {
	Class573_Sub1.anInt8773 = 362944491 * (i - Class573_Sub1.anInt7388);
	Class573_Sub1.anInt8794
	    = 1265261197 * (i_0_ - Class573_Sub1.anInt7389);
    }
    
    public static void method16777(byte i) {
	if (IcmpService_Sub1.anIcmpService_Sub1_8806 != null) {
	    try {
		IcmpService_Sub1.anIcmpService_Sub1_8806.quit();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    IcmpService_Sub1.anIcmpService_Sub1_8806 = null;
	}
    }
}
