/* Class431 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class431
{
    public static Class431 aClass431_6094;
    static Class431 aClass431_6095;
    public static Class431 aClass431_6096;
    public static Class431 aClass431_6097;
    public static Class431 aClass431_6098 = new Class431("LIVE", 0);
    public String aString6099;
    public int anInt6100;
    
    public static Class431 method7735(int i) {
	Class431[] class431s = Class79.method1787(1916891436);
	for (int i_0_ = 0; i_0_ < class431s.length; i_0_++) {
	    Class431 class431 = class431s[i_0_];
	    if (class431.anInt6100 * -1515417381 == i)
		return class431;
	}
	return null;
    }
    
    Class431(String string, int i) {
	aString6099 = string;
	anInt6100 = i * 41741139;
    }
    
    static Class431[] method7736() {
	return new Class431[] { aClass431_6096, aClass431_6097, aClass431_6098,
				aClass431_6095, aClass431_6094 };
    }
    
    static {
	aClass431_6097 = new Class431("BUILDLIVE", 3);
	aClass431_6096 = new Class431("RC", 1);
	aClass431_6094 = new Class431("WIP", 2);
	aClass431_6095 = new Class431("INTBETA", 4);
    }
    
    static Class431[] method7737() {
	return new Class431[] { aClass431_6096, aClass431_6097, aClass431_6098,
				aClass431_6095, aClass431_6094 };
    }
    
    static Class431[] method7738() {
	return new Class431[] { aClass431_6096, aClass431_6097, aClass431_6098,
				aClass431_6095, aClass431_6094 };
    }
    
    public static Class431 method7739(int i) {
	Class431[] class431s = Class79.method1787(2008536033);
	for (int i_1_ = 0; i_1_ < class431s.length; i_1_++) {
	    Class431 class431 = class431s[i_1_];
	    if (class431.anInt6100 * -1515417381 == i)
		return class431;
	}
	return null;
    }
    
    static Class431[] method7740() {
	return new Class431[] { aClass431_6096, aClass431_6097, aClass431_6098,
				aClass431_6095, aClass431_6094 };
    }
    
    static final void method7741(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = class58.text;
    }
    
    static final void method7742(ClientScriptData class454, byte i) {
	int i_2_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (null != client.currentFriendsChatName
	    && i_2_ < Class357_Sub1.currentFcSize * -612332369)
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= Class350.currentFcUsers[i_2_].replyToName;
	else
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
    }
}
