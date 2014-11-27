/* Class66_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class66_Sub2 extends Class66
{
    Class55 aClass55_10476;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10477;
    Class116 aClass116_10478;
    public static short[] aShortArray10479;
    
    public Class66_Sub2(Class103_Sub3 class103_sub3) throws Exception_Sub7 {
	super(class103_sub3);
	method16765((short) 859);
    }
    
    boolean method16765(short i) throws Exception_Sub7 {
	((Class66_Sub2) this).aClass116_10478
	    = aClass103_Sub3_1049.method15784("BatchedSprite");
	((Class66_Sub2) this).aClass241_Sub23_Sub1_10477
	    = ((Class66_Sub2) this).aClass116_10478.method2815("SpriteSampler",
							       (byte) -103);
	((Class66_Sub2) this).aClass55_10476
	    = ((Class66_Sub2) this).aClass116_10478.method2810("Normal",
							       (byte) 1);
	((Class66_Sub2) this).aClass116_10478
	    .method2895(((Class66_Sub2) this).aClass55_10476);
	return true;
    }
    
    public void method1641() {
	((Class66_Sub2) this).aClass116_10478.method2805();
	((Class66_Sub2) this).aClass116_10478.method2828
	    (((Class66_Sub2) this).aClass241_Sub23_Sub1_10477, 0,
	     anInterface41_1050, -702865353);
    }
    
    public void method1642() {
	((Class66_Sub2) this).aClass116_10478.method2805();
	((Class66_Sub2) this).aClass116_10478.method2828
	    (((Class66_Sub2) this).aClass241_Sub23_Sub1_10477, 0,
	     anInterface41_1050, 1891885167);
    }
    
    boolean method16766() throws Exception_Sub7 {
	((Class66_Sub2) this).aClass116_10478
	    = aClass103_Sub3_1049.method15784("BatchedSprite");
	((Class66_Sub2) this).aClass241_Sub23_Sub1_10477
	    = ((Class66_Sub2) this).aClass116_10478.method2815("SpriteSampler",
							       (byte) -27);
	((Class66_Sub2) this).aClass55_10476
	    = ((Class66_Sub2) this).aClass116_10478.method2810("Normal",
							       (byte) 1);
	((Class66_Sub2) this).aClass116_10478
	    .method2895(((Class66_Sub2) this).aClass55_10476);
	return true;
    }
    
    public static boolean method16767(char c, int i) {
	return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }
    
    static final void method16768(ClientScriptData class454, byte i) {
	InterfaceComponent class58
	    = Js5ConfigGroup.getInterfaceComponent((((ClientScriptData) class454).integerStack
				  [(((ClientScriptData) class454).intStackPointer
				    -= 1736754263) * 1482319719]),
				 (byte) -97);
	if (null == class58.aClass58Array836)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	else {
	    int i_0_ = class58.aClass58Array836.length;
	    for (int i_1_ = 0; i_1_ < class58.aClass58Array836.length;
		 i_1_++) {
		if (null == class58.aClass58Array836[i_1_]) {
		    i_0_ = i_1_;
		    break;
		}
	    }
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= i_0_;
	}
    }
}
