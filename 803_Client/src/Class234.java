/* Class234 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class234
{
    MapType mapType;//aClass235_2697
    RSBitBuffer mapData;//aClass241_Sub3_Sub1_2698
    public static Class107 aClass107_2699;
    
    public Class234(MapType class235, RSBitBuffer class241_sub3_sub1) {
		mapType = class235;
		mapData = class241_sub3_sub1;
    }
    
    static final void method4692(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_0_ ^ 0xffffffff;
    }
    
    static final void method4693(ClientScriptData class454, byte i) {
	Class72.anInt1099 = 0;
    }
    
    static final void method4694(ClientScriptData class454, int i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_1_, (byte) -53);
	int i_2_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	i_2_--;
	if (class58.contextMenuOptions == null
	    || i_2_ >= class58.contextMenuOptions.length
	    || null == class58.contextMenuOptions[i_2_])
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	else
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= class58.contextMenuOptions[i_2_];
    }
    
    public static Class331[] method4695(int i) {
	return (new Class331[]
		{ Class331.aClass331_5046, Class331.aClass331_5045,
		  Class331.aClass331_5038, Class331.aClass331_5037,
		  Class331.aClass331_5040, Class331.aClass331_5041,
		  Class331.aClass331_5042, Class331.aClass331_5043,
		  Class331.aClass331_5044, Class331.aClass331_5036,
		  Class331.aClass331_5039 });
    }
    
    static final void method4696(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = NPC.myCurrentFcRank;
    }
}
