/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class128 implements Interface29
{
    SoundManager this$0;
    static Class107 aClass107_1588;
    public static GraphicsDefaults aClass513_1589;
    
    Class128(SoundManager class49) {
	((Class128) this).this$0 = class49;
    }
    
    public float method174(int i) {
	return ((float) Class241_Sub5_Sub9.aClass241_Sub9_11043
			    .aClass445_Sub6_8891.method14143(1908334168)
		/ 255.0F);
    }
    
    public float method173() {
	return ((float) Class241_Sub5_Sub9.aClass241_Sub9_11043
			    .aClass445_Sub6_8891.method14143(1909368890)
		/ 255.0F);
    }
    
    public static VarTransmitLevel[] method3015(int i) {
	return (new VarTransmitLevel[]
		{ VarTransmitLevel.NEVER, VarTransmitLevel.ON_SET_DIFFERENT,
		  VarTransmitLevel.ON_SET_ALWAYS });
    }
    
    public static Class542 method3016(boolean bool, int i) {
	synchronized (Class542.aStack7010) {
	    Class542 class542;
	    if (Class542.aStack7010.isEmpty())
		class542 = new Class542();
	    else
		class542 = (Class542) Class542.aStack7010.pop();
	    ((Class542) class542).aBool7012 = bool;
	    Class542 class542_0_ = class542;
	    return class542_0_;
	}
    }
    
    static final void setVarcompText/*method3017*/(ClientScriptData scriptData, int i) {
		Class455 class455 = (scriptData.aBool6246 ? scriptData.aClass455_6230 : scriptData.aClass455_6229);
		InterfaceComponent component = ((Class455) class455).aClass58_6248;
		InterfaceDefinition iFace = ((Class455) class455).aClass35_6249;
		Class564.setComponentText(component, iFace, scriptData, 190231187);
    }
    
    static final void method3018(ClientScriptData class454, int i) {
	if (client.playerRights * 482866503 >= 2)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= client.playerRights * 482866503;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
    }
    
    static final void storeClanMinKick/*method3019*/(ClientScriptData scriptData, byte i) {
    	scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
    			= scriptData.clanSettings.rankKick;
    }
}
