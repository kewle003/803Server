/* Class530 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.image.BufferedImage;

public class Class530 implements Interface47
{
    static Class530 aClass530_6946;
    static Class530 aClass530_6947;
    static Class530 aClass530_6948 = new Class530(0);
    int anInt6949;
    
    public int method9() {
	return ((Class530) this).anInt6949 * -406690457;
    }
    
    public int method147() {
	return ((Class530) this).anInt6949 * -406690457;
    }
    
    public int getId(byte i) {
	return ((Class530) this).anInt6949 * -406690457;
    }
    
    Class530(int i) {
	((Class530) this).anInt6949 = i * 1231283799;
    }
    
    public int method10() {
	return ((Class530) this).anInt6949 * -406690457;
    }
    
    public int method11() {
	return ((Class530) this).anInt6949 * -406690457;
    }
    
    static {
	aClass530_6946 = new Class530(1);
	aClass530_6947 = new Class530(2);
    }
    
    public static Class530[] method11837() {
	return (new Class530[]
		{ aClass530_6946, aClass530_6948, aClass530_6947 });
    }
    
    static void method11838(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [1482319719 * ((ClientScriptData) class454).intStackPointer - 2]
	    = (Class326_Sub3.aClass482_10288.method11010
		   ((((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719 - 2]),
		    (short) 9297)
		   .method10972
	       (Class1.aClass19_11,
		(((ClientScriptData) class454).integerStack
		 [((ClientScriptData) class454).intStackPointer * 1482319719 - 1]),
		-389678846)) ? 1 : 0;
	((ClientScriptData) class454).intStackPointer -= 1736754263;
    }
    
    static final void method11839(ClientScriptData class454, byte i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -114);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_0_ >> 16];
	Class298.method5732(class58, class35, class454, (byte) -87);
    }
    
    static final void method11840(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub18_8862
		  .method14262((byte) 12) == 1 ? 1 : 0;
    }
    
    public static void method11841(String string, int i, int i_1_) {
	if (null == Class395.aClass397_5773)
	    Class395.aClass397_5773 = new Server();
	Class395.aClass397_5773.aString5786 = string;
	Class395.aClass397_5773.nodeID = (i + 1099) * 1167304829;
	Class395.aClass397_5773.anInt5790
	    = 1350095168 + 170709369 * Class395.aClass397_5773.nodeID;
	Class395.aClass397_5773.anInt5788
	    = -2097072480 + 170297199 * Class395.aClass397_5773.nodeID;
    }
    
    public static void method11842(int i, int i_2_, int i_3_, int i_4_) {
	i <<= 3;
	i_2_ <<= 3;
	i_3_ <<= 3;
	if (Class296.anInt4513 * 115241065 == 4) {
	    if (Class445_Sub16.aClass351_Sub1_8660.method6332((short) -21698)
		== Class39.aClass39_586) {
		Class380_Sub2 class380_sub2
		    = (Class380_Sub2) Class445_Sub16.aClass351_Sub1_8660
					  .method6283(1970981546);
		Class278 class278 = new Class278();
		Class278 class278_5_ = new Class278();
		class278.method5409(0.0F, 1.0F, 0.0F,
				    3.1415927F - (float) (2.0
							  * (3.141592653589793
							     * (double) i_2_)
							  / 16384.0));
		Class287 class287 = new Class287(1.0F, 0.0F, 0.0F);
		class287.method5592(class278);
		class287.method5603();
		class278_5_.method5385(class287,
				       (float) (3.141592653589793 * (double) i
						* 2.0) / 16384.0F);
		class278.method5396(class278_5_);
		class380_sub2.aClass278_10406.method5424(class278);
	    }
	} else {
	    client.aFloat8406 = (float) i;
	    client.aFloat8581 = (float) i_2_;
	    if (1 == Class296.anInt4513 * 115241065) {
		Class496.anInt6527 = i * 709117373;
		Class322.anInt4909 = 2118136689 * i_2_;
		Class120_Sub18.anInt10605 = i_3_ * 697117393;
	    }
	    VarPlayerDomain.method11656(-2000330275);
	}
	client.aBool8392 = true;
    }
    
    static final void method11843(ClientScriptData class454, int i) {
	int i_6_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_6_, (byte) -42);
	Class562.method12379(class58, class454, (byte) 0);
    }
    
    public static Class325 method11844(int i, int i_7_) {
	Class325 class325
	    = (Class325) Class325.aClass129_4952.get((long) i);
	if (null != class325)
	    return class325;
	byte[] is = Class325.aClass210_4929.getfile(0, i, -332677369);
	class325 = new Class325();
	if (is != null)
	    class325.method5984(new RSByteBuffer(is), 1915202642);
	class325.method5977(-1133248223);
	Class325.aClass129_4952.put(class325, (long) i);
	return class325;
    }
    
    public static int[] method11845(BufferedImage bufferedimage, short i) {
	if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
	    int[] is = null;
	    is = bufferedimage.getRaster().getPixels(0, 0,
						     bufferedimage.getWidth(),
						     bufferedimage.getHeight(),
						     is);
	    int[] is_8_
		= (new int
		   [bufferedimage.getWidth() * bufferedimage.getHeight()]);
	    if (bufferedimage.getType() == 10) {
		for (int i_9_ = 0; i_9_ < is_8_.length; i_9_++)
		    is_8_[i_9_] = is[i_9_] + ((is[i_9_] << 16)
					      + (is[i_9_] << 8)) + -16777216;
	    } else {
		for (int i_10_ = 0; i_10_ < is_8_.length; i_10_++) {
		    int i_11_ = 2 * i_10_;
		    is_8_[i_10_] = ((is[i_11_ + 1] << 24) + is[i_11_]
				    + ((is[i_11_] << 8) + (is[i_11_] << 16)));
		}
	    }
	    return is_8_;
	}
	return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(),
				    bufferedimage.getHeight(), null, 0,
				    bufferedimage.getWidth());
    }
}
