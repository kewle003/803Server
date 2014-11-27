/* Class175 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class175
{
    public static Class175 aClass175_2110;
    public static Class175 aClass175_2111 = new Class175(9, 3);
    public static Class175 aClass175_2112;
    static Class175 aClass175_2113;
    public static Class175 aClass175_2114;
    public static Class175 aClass175_2115;
    public static Class175 aClass175_2116;
    static Class175 aClass175_2117;
    public static Class175 aClass175_2118;
    public static Class175 aClass175_2119;
    public int anInt2120;
    public int anInt2121;
    static Class639 aClass639_2122;
    static int anInt2123;
    
    Class175(int i, int i_0_) {
	anInt2120 = 1835486323 * i;
	anInt2121 = -61863409 * i_0_;
    }
    
    static {
	aClass175_2110 = new Class175(2, 4);
	aClass175_2112 = new Class175(3, 1);
	aClass175_2116 = new Class175(6, 1);
	aClass175_2114 = new Class175(7, 2);
	aClass175_2115 = new Class175(5, 1);
	aClass175_2113 = new Class175(8, 3);
	aClass175_2117 = new Class175(4, 4);
	aClass175_2118 = new Class175(0, 1);
	aClass175_2119 = new Class175(1, 1);
    }
    
    static void setLoginResponse/*method3737*/(int i, int i_1_) {
	if (172 == Class13.anInt77 * -47430143)
	    Class13.anInt75 = i * -347622659;
	else if (-47430143 * Class13.anInt77 == 289)
	    Class13.anInt110 = 1178710717 * i;
    }
    
    static final void method3738(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	short i_3_
	    = (short) (((ClientScriptData) class454).integerStack
		       [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	short i_4_
	    = (short) (((ClientScriptData) class454).integerStack
		       [1482319719 * ((ClientScriptData) class454).intStackPointer + 2]);
	if (i_2_ >= 0 && i_2_ < 5) {
	    class58.method1574(i_2_, i_3_, i_4_, -35421446);
	    WorldType.refreshComponent(class58, 669884403);
	    if (-1 == -389932081 * class58.slot1 && !class35.aBool374)
		Class320.method5930(class58.componentHash * 445907013, i_2_,
				    1992179335);
	}
    }
    
    static final void method3739(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = -1735856329 * class58.anInt860;
    }
    
    static final void method3740(ClientScriptData class454, int i) {
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4096,
					 client.aClass190_8340.packetCipher,
					 16711935);
	client.aClass190_8340.sendPacket(class241_sub27, -2091867836);
    }
    
    static final void method3741(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub7_8865
		  .method14148(-637617600) ? 1 : 0;
    }
    
    static final void method3742(ClientScriptData class454, int i) {
	((ClientScriptData) class454).aLongArray6222
	    [(((ClientScriptData) class454).integerConstants
	      [((ClientScriptData) class454).step * 1938982693])]
	    = (((ClientScriptData) class454).longStack
	       [(((ClientScriptData) class454).anInt6231 -= 710535117) * -735224571]);
    }
}
