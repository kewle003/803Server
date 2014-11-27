/* Class114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class114 implements Interface29
{
    SoundManager this$0;
    
    Class114(SoundManager class49) {
	((Class114) this).this$0 = class49;
    }
    
    public float method174(int i) {
	return ((float) Class241_Sub5_Sub9.aClass241_Sub9_11043
			    .aClass445_Sub6_8888.method14143(1909562645)
		/ 255.0F);
    }
    
    public float method173() {
	return ((float) Class241_Sub5_Sub9.aClass241_Sub9_11043
			    .aClass445_Sub6_8888.method14143(2011069748)
		/ 255.0F);
    }
    
    static final void setVarcompContextMenuOption/*method2794*/(ClientScriptData scriptData, int i) {
		Class455 class455 = (scriptData.aBool6246 ? scriptData.aClass455_6230 : scriptData.aClass455_6229);
		InterfaceComponent component = ((Class455) class455).aClass58_6248;
		InterfaceDefinition iFace = ((Class455) class455).aClass35_6249;
		Class221.setContextMenuOption(component, iFace, scriptData, 217455804);
    }
    
    static final void method2795(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	ClientScriptData.method10553(class58, class35, class454, 1497333031);
    }
    
    static final void method2796(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	class58.modelType = 1385943367;
	class58.anInt879 = -1814056849 * client.myPlayerIndex;
	class58.anInt880 = 0;
	if (-1 == -389932081 * class58.slot1 && !class35.aBool374)
	    Class120_Sub7.method16774(445907013 * class58.componentHash, 636791066);
    }
    
    static final void method2797(ClientScriptData class454, int i) {
	NPC class475_sub1_sub1_sub3_sub2
	    = ((NPC)
	       ((ClientScriptData) class454).varEntity);
	boolean bool = false;
	NPCDefinition class401 = class475_sub1_sub1_sub3_sub2.definition;
	if (null != class401.transformTo)
	    class401 = class401.method7176(Class1.aClass19_11,
					   Class1.aClass19_11, (byte) 9);
	if (null != class401)
	    bool = class401.aBool5839;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = bool ? 1 : 0;
    }
    
    static final void method2798(ClientScriptData class454, int i) {
	Class16.anInt162
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       * -20524323);
    }
}
