/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class6
{
    static String aString29;
    static String aString30;
    static String aString31;
    static String aString32;
    static String aString33;
    static String aString34;
    public static String aString35;
    static String aString36 = "true";
    static String homeDir;//aString37
    public static Class241_Sub12 aClass241_Sub12_38;
    
    Class6() throws Throwable {
	throw new Error();
    }
    
    public static String method497(int i) {
	return new StringBuilder().append("<img=").append(i).append(">")
		   .toString();
    }
    
    static {
	aString30 = ",";
	aString29 = " (";
	aString32 = ")";
	aString33 = "->";
	aString31 = "127.0.0.1";
	aString35 = "<br>";
	aString34 = "</col>";
    }
    
    public static String method498(int i) {
	return new StringBuilder().append("<img=").append(i).append(">")
		   .toString();
    }
    
    public static String method499(int i) {
	return new StringBuilder().append("<col=").append
		   (Integer.toHexString(i)).append
		   (">").toString();
    }
    
    public static String method500(int i) {
	return new StringBuilder().append("<col=").append
		   (Integer.toHexString(i)).append
		   (">").toString();
    }
    
    public static String method501(int i) {
	return new StringBuilder().append("<col=").append
		   (Integer.toHexString(i)).append
		   (">").toString();
    }
    
    public static String method502(int i) {
	return new StringBuilder().append("<col=").append
		   (Integer.toHexString(i)).append
		   (">").toString();
    }
    
    static final void method503(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class323.method5960(class58, class35, class454, -507007453);
    }
    
    static final void method504(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_0_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	if (-1 == i_1_)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= Class123.aClass292_1579.method5686(i_0_, (byte) 66)
		      .method17380((char) i_1_, (byte) -59);
    }
    
    static final void method505(ClientScriptData class454, int i) {
	int i_2_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_2_, (byte) -114);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = -1669999329 * class58.scrollCurrentY;
    }
    
    static final void setVarcompItemSwapEvent/*method506*/(ClientScriptData class454, int i) {
		Class455 class455 = (((ClientScriptData) class454).aBool6246
				     ? ((ClientScriptData) class454).aClass455_6230
				     : ((ClientScriptData) class454).aClass455_6229);
		InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
		InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
		Class95.setItemSwapEvent(class58, class35, class454, (byte) 1);
    }
    
    static final void method507(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	boolean bool = ((((ClientScriptData) class454).integerStack
			 [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer])
			== 1);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8879,
	     i_3_, (byte) 2);
	if (!bool)
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub17_8887,
		 0, (byte) 2);
	Class167.method3600((short) -12344);
	client.aBool8297 = false;
    }
    
    static final void method508(ClientScriptData class454, byte i) {
	int i_4_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_4_, (byte) -109);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_4_ >> 16];
	Class468.setComponentSize(class58, class35, class454, -1261495704);
    }
}
