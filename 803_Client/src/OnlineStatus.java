/* Class420 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class OnlineStatus
{
    public int opcode;//anInt6032
    static OnlineStatus EVERYONE = new OnlineStatus(0);//aClass420_6033
    static OnlineStatus NOBODY;//aClass420_6034
    public static OnlineStatus FRIENDS = new OnlineStatus(1);//aClass420_6035
    
    public static OnlineStatus method7514(int i) {
	OnlineStatus[] class420s = Class423.method7559(-310077587);
	for (int i_0_ = 0; i_0_ < class420s.length; i_0_++) {
	    OnlineStatus class420 = class420s[i_0_];
	    if (i == class420.opcode * 1473893111)
		return class420;
	}
	return null;
    }
    
    static {
	NOBODY = new OnlineStatus(2);
    }
    
    OnlineStatus(int i) {
	opcode = i * 1620610759;
    }
    
    public static OnlineStatus method7515(int i) {
	OnlineStatus[] class420s = Class423.method7559(-2036263119);
	for (int i_1_ = 0; i_1_ < class420s.length; i_1_++) {
	    OnlineStatus class420 = class420s[i_1_];
	    if (i == class420.opcode * 1473893111)
		return class420;
	}
	return null;
    }
    
    public static OnlineStatus method7516(int i) {
	OnlineStatus[] class420s = Class423.method7559(-1526161944);
	for (int i_2_ = 0; i_2_ < class420s.length; i_2_++) {
	    OnlineStatus class420 = class420s[i_2_];
	    if (i == class420.opcode * 1473893111)
		return class420;
	}
	return null;
    }
    
    static OnlineStatus[] method7517() {
	return (new OnlineStatus[]
		{ NOBODY, EVERYONE, FRIENDS });
    }
    
    static final void method7518(ClientScriptData class454, int i) {
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_3_, (byte) -28);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_3_ >> 16];
	Class44.method1102(class58, class35, class454, -202988258);
    }
    
    static Class639 method7519(int i) {
	Class639 class639;
	if (Class16.aBool168) {
	    if (Class445_Sub12.aClass96_8651 != null
		&& Class175.aClass639_2122 != null)
		class639 = Class175.aClass639_2122;
	    else
		class639 = Class5.aClass639_19;
	} else
	    class639 = Class5.aClass639_19;
	Class16.anInt164 = (class639.anInt8258 * -1171100233
			    + class639.anInt8260 * -583473923);
	return class639;
    }
}
