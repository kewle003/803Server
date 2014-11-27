/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class53
{
    static final String aString690 = "#";
    static int anInt691;
    
    Class53() throws Throwable {
	throw new Error();
    }
    
    public static final boolean method1292
	(String string, String string_0_, String string_1_, String string_2_) {
	if (null == string || string_1_ == null)
	    return false;
	if (string.startsWith("#") || string_1_.startsWith("#"))
	    return string.equals(string_1_);
	return string_0_.equals(string_2_);
    }
    
    static final void method1293(ClientScriptData class454, int i) {
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_3_, (byte) -66);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_3_ >> 16];
	Class583.setComponentAlpha(class58, class35, class454, (byte) 39);
    }
    
    static final void method1294(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class198.method4038(class58, class35, class454, (byte) 57);
    }
    
    static final void kickClanUser/*method1295*/(ClientScriptData scriptData, int i) {
    	int memberIndex  = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		Class105.kickClanUser((Class324.mainClanChannel == scriptData.currentChannel),
				memberIndex, 5798001);
    }
    
    public static void method1296(boolean bool, byte i) {
	if (null == CcDeltaNode.aClass70_9022)
	    Class524.method11748(-2133625185);
	if (bool)
	    CcDeltaNode.aClass70_9022.method1699(-1218301671);
    }
    
    static void method1297(int i) {
	Class241_Sub34.aClass129_10084.reset(-1956870262);
    }
}
