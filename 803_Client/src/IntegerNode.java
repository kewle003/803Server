/* Class241_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class IntegerNode extends Node
{
    public int intValue;//anInt9011
    
    public IntegerNode(int i) {
    	intValue = i * 1144452473;
    }
    
    public static void setAnimationLoader/*method15059*/(AnimationDefinitionLoader loader, int i) {
    	VarBasicType.aClass556_9995 = loader;
    }
    
    static final void method15060(ClientScriptData class454, int i) {
	Class241_Sub16 class241_sub16
	    = Class162.method3521(((Class241_Sub16)
				   (((ClientScriptData) class454).objectStack
				    [(((ClientScriptData) class454).objectStackPointer
				      -= -1650705371) * -290357331])),
				  445585308);
	((ClientScriptData) class454).intStackPointer -= -1642917540;
	class241_sub16.anInt8979
	    += -1669927801 * (((ClientScriptData) class454).integerStack
			      [((ClientScriptData) class454).intStackPointer * 1482319719]);
	class241_sub16.anInt8982
	    += ((((ClientScriptData) class454).integerStack
		 [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer])
		* -795143013);
	class241_sub16.anInt8983
	    += (313978279
		* (((ClientScriptData) class454).integerStack
		   [((ClientScriptData) class454).intStackPointer * 1482319719 + 2]));
	class241_sub16.anInt8984
	    += ((((ClientScriptData) class454).integerStack
		 [3 + ((ClientScriptData) class454).intStackPointer * 1482319719])
		* -1732086989);
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = class241_sub16;
    }
    
    static final void method15061(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class281.method5488(class58, class35, true, 1, class454, 437226168);
    }
}
