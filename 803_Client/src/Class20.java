/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class20 implements Interface57
{
    public boolean method430(Class475_Sub1_Sub1 class475_sub1_sub1, int i) {
	return (class475_sub1_sub1 instanceof Interface24
		&& ((Interface24) class475_sub1_sub1).method157((byte) 16));
    }
    
    public boolean method432(Class475_Sub1_Sub1 class475_sub1_sub1) {
	return (class475_sub1_sub1 instanceof Interface24
		&& ((Interface24) class475_sub1_sub1).method157((byte) 119));
    }
    
    public boolean method431(Class475_Sub1_Sub1 class475_sub1_sub1) {
	return (class475_sub1_sub1 instanceof Interface24
		&& ((Interface24) class475_sub1_sub1).method157((byte) 35));
    }
    
    static final void method882(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -90);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_0_ >> 16];
	AnimationDefinition.method12029(class58, class35, class454, 1771941012);
    }
    
    static InterfaceComponent method883(InterfaceComponent class58, int i) {
	InterfaceComponent class58_1_ = client.method13625(class58);
	if (class58_1_ == null)
	    class58_1_ = class58.aClass58_938;
	return class58_1_;
    }
    
    static final void setClanSettingsUpdateEvent/*method884*/(InterfaceComponent component, InterfaceDefinition iFace,
				ClientScriptData scriptData, int i) {
		String params = (String) scriptData.objectStack
					  [(scriptData.objectStackPointer -= -1650705371) * -290357331];
		if (Class8.extractVarWatchKeys(params, scriptData, (byte) -42) != null) {
			params = params.substring(0, params.length() - 1);
		}
		component.onClanSettingsUpdateScript
		    = Class299.extractCs2Params(params, scriptData, 1140218126);
		component.hasClientScript = true;
    }
    
    static final void method885(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class92.method2071(class58, class35, class454, 1992631500);
    }
    
    static final void method886(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	LoadingScreenDef.method6482(class58, class35, class454, -615859486);
    }
}
