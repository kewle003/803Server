/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class88
{
    static int anInt1296;
    
    Class88() {
	/* empty */
    }
    
    static void method1854(Class241_Sub39_Sub10 class241_sub39_sub10, byte i) {
	boolean bool = false;
	class241_sub39_sub10.method16441((byte) 2);
	for (Class241_Sub39_Sub10 class241_sub39_sub10_0_
		 = ((Class241_Sub39_Sub10)
		    Class16.aClass410_152.method7440(-1397088259));
	     null != class241_sub39_sub10_0_;
	     class241_sub39_sub10_0_
		 = ((Class241_Sub39_Sub10)
		    Class16.aClass410_152.method7435((byte) -1))) {
	    if (Class400.method7138(class241_sub39_sub10
					.method17198(-410131335),
				    class241_sub39_sub10_0_
					.method17198(-1422999625),
				    1838047034)) {
		Class506.method11487(class241_sub39_sub10,
				     class241_sub39_sub10_0_, 1612161464);
		bool = true;
		break;
	    }
	}
	if (!bool)
	    Class16.aClass410_152.method7431(class241_sub39_sub10, (byte) -22);
    }
    
    static final void method1855(ClientScriptData class454, int i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_1_, (byte) -30);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_1_ >> 16];
	Class445_Sub29.setComponentLocation(class58, class35, class454, (byte) 62);
    }
    
    static void method1856(byte i) {
	int i_2_ = -1080559003 * Class494.canvasWid;
	int i_3_ = Class67.canvasHei * 963058943;
	if (884255947 * Class294.frameWid < i_2_)
	    i_2_ = 884255947 * Class294.frameWid;
	if (-828675613 * Class43.frameHei < i_3_)
	    i_3_ = Class43.frameHei * -828675613;
	try {
	    if (null != Class241_Sub5_Sub9.aClass241_Sub9_11043)
		JSFunction.aClass348_5367.method6211
		    ((new Object[]
		      { Integer.valueOf(i_2_), Integer.valueOf(i_3_),
			Integer.valueOf(Class474.getDisplayMode(-1908900084)),
			Integer.valueOf(Class241_Sub5_Sub9
					    .aClass241_Sub9_11043
					    .aClass445_Sub24_8871
					    .method14334((byte) 53)) }),
		     -915291608);
	} catch (Throwable throwable) {
	    /* empty */
	}
    }
}
