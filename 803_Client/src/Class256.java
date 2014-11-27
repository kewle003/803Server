/* Class256 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class256
{
    static Class256 aClass256_4141;
    public static Class256 aClass256_4142 = new Class256(14, 0);
    public static Class256 aClass256_4143;
    public static Class256 aClass256_4144;
    static Class256[] aClass256Array4145;
    static Class256 aClass256_4146;
    public static Class256 aClass256_4147 = new Class256(15, -1);
    static Class256 aClass256_4148;
    public static Class256 aClass256_4149;
    public static Class256 aClass256_4150;
    public static Class256 aClass256_4151;
    public static Class256 aClass256_4152;
    public int anInt4153;
    static Class256 aClass256_4154;
    protected static Class250 mouseImp;//aClass250_4155
    
    Class256(int i, int i_0_) {
    	anInt4153 = -1529451713 * i;
    }
    
    static {
	aClass256_4143 = new Class256(16, -2);
	aClass256_4144 = new Class256(19, -2);
	aClass256_4154 = new Class256(23, 4);
	aClass256_4146 = new Class256(24, -1);
	aClass256_4152 = new Class256(26, 0);
	aClass256_4148 = new Class256(27, 0);
	aClass256_4149 = new Class256(28, -2);
	aClass256_4150 = new Class256(29, -2);
	aClass256_4151 = new Class256(30, -2);
	aClass256_4141 = new Class256(31, 4);
	aClass256Array4145 = new Class256[32];
	Class256[] class256s = Class90.method2059((short) -14298);
	for (int i = 0; i < class256s.length; i++)
	    aClass256Array4145[class256s[i].anInt4153 * 2087126207]
		= class256s[i];
    }
    
    static Class256[] method5048() {
	return (new Class256[]
		{ aClass256_4154, aClass256_4142, aClass256_4147,
		  aClass256_4152, aClass256_4149, aClass256_4144,
		  aClass256_4150, aClass256_4148, aClass256_4146,
		  aClass256_4141, aClass256_4143, aClass256_4151 });
    }
    
    static final void method5049(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class122.method2982(class58, class35, class454, 863816720);
    }
    
    static final void method5050(ClientScriptData class454, int i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_1_, (byte) -25);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_1_ >>> 16];
	InterfaceComponent class58_2_
	    = LoadingScreenDef.method6489(class35, class58, -1575434854);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = null == class58_2_ ? -1 : class58_2_.componentHash * 445907013;
    }
    
    static final void method5051(ClientScriptData class454, int i) {
	boolean bool
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       == 1);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8869,
	     bool ? 2 : 1, (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8870,
	     bool ? 2 : 1, (byte) 2);
	Class514.method11576((byte) -69);
	Class167.method3600((short) 19254);
	client.aBool8297 = false;
    }
    
    static final void method5052(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8881
		   .method14188(904064679)
	       && Class236.aClass103_2713.method2215()) ? 1 : 0;
    }
    
    public static Interface18 method5053(byte i) {
	if (Class237.anInterface18_2714 == null)
	    throw new IllegalStateException("");
	return Class237.anInterface18_2714;
    }
    
    public static void method5054(int i, int i_3_) {
	Class241_Sub39_Sub13 class241_sub39_sub13
	    = NPC.method18030(21, (long) i);
	class241_sub39_sub13.method17278((byte) -84);
    }
}
