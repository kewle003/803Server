/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class43
{
    public int anInt603;
    static Class43 aClass43_604 = new Class43(0);
    public static Class43 aClass43_605 = new Class43(1);
    protected static int frameHei;//anInt606
    public static Class283 aClass283_607;
    public static ObjectDefinitionLoader objectDefLoader;//aClass532_608
    
    Class43(int i) {
	anInt603 = -1522888317 * i;
    }
    
    static final void method1074(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (Class8.extractVarWatchKeys(string, class454, (byte) -30) != null)
	    string = string.substring(0, string.length() - 1);
	class58.anObjectArray946
	    = Class299.extractCs2Params(string, class454, 78530747);
	class58.hasClientScript = true;
    }
    
    static final void method1075(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_0_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	ItemDefinition class623
	    = JS5.itemDefLoader.list(i_0_, (short) -3708);
	if (i_1_ >= 1 && i_1_ <= 5
	    && null != class623.inventoryOptions[i_1_ - 1])
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= class623.inventoryOptions[i_1_ - 1];
	else
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
    }
    
    static final void method1076(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	client.aShort8551
	    = (short) (((ClientScriptData) class454).integerStack
		       [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	if (client.aShort8551 <= 0)
	    client.aShort8551 = (short) 256;
	client.aShort8279
	    = (short) (((ClientScriptData) class454).integerStack
		       [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	if (client.aShort8279 <= 0)
	    client.aShort8279 = (short) 205;
    }
    
    static void setMinimapFlag/*method1077*/(int localX, int localY, byte i_3_) {
		Class241_Sub39_Sub13 class241_sub39_sub13 = NPC.method18030(14, 0L);
		class241_sub39_sub13.method17279((byte) 0);
		((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 = localX * -1741260507;
		((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10951 = 1861259375 * localY;
    }
}
