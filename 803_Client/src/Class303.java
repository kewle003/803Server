/* Class303 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class303
{
    public static Class303 aClass303_4788;
    public static Class303 aClass303_4789;
    public static Class303 aClass303_4790 = new Class303();
    public static Class303 aClass303_4791;
    public static Class303 aClass303_4792 = new Class303();
    public static Class303 aClass303_4793;
    public static Class303 aClass303_4794;
    
    static {
	aClass303_4789 = new Class303();
	aClass303_4791 = new Class303();
	aClass303_4788 = new Class303();
	aClass303_4793 = new Class303();
	aClass303_4794 = new Class303();
    }
    
    Class303() {
	/* empty */
    }
    
    static final void method5847(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	class58.aString933 = (String) (((ClientScriptData) class454).objectStack
				       [(((ClientScriptData) class454).objectStackPointer
					 -= -1650705371) * -290357331]);
    }
    
    static final void method5848(ClientScriptData class454, int i) {
	if (client.currentFriendsChatOwner != null)
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= client.currentFriendsChatOwner;
	else
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
    }
    
    static final void method5849(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_0_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_0_ * i_1_;
    }
    
    static final void method5850(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub21_8853
		  .method14299(-965759266);
    }
    
    static final void method5851(ClientScriptData class454, int i) {
	boolean bool = false;
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (client.aBool8267) {
	    try {
		Object object
		    = JSFunction.aClass348_5376
			  .method6209(new Object[] { string }, -1614078792);
		if (object != null)
		    bool = ((Boolean) object).booleanValue();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = bool ? 1 : 0;
    }
    
    static final void method5852(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.aShort8551;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.aShort8279;
    }
    
    public static Class439[] method5853(int i) {
	return (new Class439[]
		{ Class439.aClass439_6147, Class439.aClass439_6153,
		  Class439.aClass439_6152, Class439.aClass439_6151,
		  Class439.aClass439_6145, Class439.aClass439_6149,
		  Class439.aClass439_6144, Class439.aClass439_6150 });
    }
    
    static void method5854(RSBitBuffer buffer, int i) {
    	buffer.writeInt(Class187.aClass210_2204.method4195((byte) 4), -151444096);
    	buffer.writeInt(Class577.aClass210_7450.method4195((byte) 18), -32342354);
    	buffer.writeInt(Class120_Sub2.CONFIG_ARCHIVE.method4195((byte) 80), -754269053);
    	buffer.writeInt(Class218_Sub5.INTERFACES_ARCHIVE.method4195((byte) 30), -1597297371);
    	buffer.writeInt(Class120_Sub22.LANDSCAPES_ARCHIVE.method4195((byte) 92), 741069526);
    	buffer.writeInt(Class508.MODELS_ARCHIVE.method4195((byte) 20), 1552140496);
    	buffer.writeInt(Class284.SPRITES_ARCHIVE.method4195((byte) 19), 2032199937);
    	buffer.writeInt(Class177.TEXTURES_ARCHIVE.method4195((byte) 12), -1733431619);
    	buffer.writeInt(Class209.HUFFMAN_ARCHIVE.method4195((byte) 97), -1686133504);
    	buffer.writeInt(Class547.CS2_ARCHIVE.method4195((byte) 34), -1972991108);
    	buffer.writeInt(Class120_Sub7.FONTS_ARCHIVE.method4195((byte) 59), -211530699);
		if (!Class84.aBool1159) {
			buffer.writeInt(AnimationConfigLoader.aClass210_6996.method4195((byte) 125), -564894740);
		}
		buffer.writeInt(Class496.OBJECTS_ARCHIVE.method4195((byte) 28), 145361262);
		buffer.writeInt(Class132.CS2_MAPS_ARCHIVE.method4195((byte) 43), -137537559);
		buffer.writeInt(Js5Archive.NPCS_ARCHIVE.method4195((byte) 7), 1669506206);
		buffer.writeInt(Class640.ITEMS_ARCHIVE.method4195((byte) 5), -2093759585);
		buffer.writeInt(Class601.ANIMATIONS_ARCHIVE.method4195((byte) 112), -513705044);
		buffer.writeInt(Class452.GRAPHICS_ARCHIVE.method4195((byte) 113), 1406774736);
		buffer.writeInt(Class117.GENERAL_MAPS_ARCHIVE.method4195((byte) 109), 815201902);
		buffer.writeInt(Class608.WORLD_MAP_ARCHIVE.method4195((byte) 7), -1282064810);
		buffer.writeInt(Class630.QC_MESSAGE_ARCHIVE.method4195((byte) 113), 1861439139);
		buffer.writeInt(Class445_Sub23.QC_MENU_ARCHIVE.method4195((byte) 56), -529892961);
		buffer.writeInt(Class565.aClass210_7321.method4195((byte) 95), 533271631);
		buffer.writeInt(Player.aClass210_11519.method4195((byte) 10), 445772103);
		buffer.writeInt(Class349.DEFAULTS_ARCHIVE.method4195((byte) 32), -365660543);
		buffer.writeInt(Class394.aClass210_5769.method4195((byte) 29), -2037164024);
		buffer.writeInt(Class505.DLLS_ARCHIVE.method4195((byte) 107), -204147961);
		buffer.writeInt(Class200.SHADERS_ARCHIVE.method4195((byte) 25), -794987709);
		buffer.writeInt(Class327.method6017((byte) -26), 1567524123);
		buffer.writeInt(Class133.method3087(1411420306), 1513518932);
		buffer.writeInt(Class112.aClass210_1527.method4195((byte) 57), -1914466629);
		buffer.writeInt(SoundManager.aClass210_672.method4195((byte) 113), -604035358);
		buffer.writeInt(Class223.GRAPHIC_CONFIG_ARCHIVE.method4195((byte) 127), -426780474);
		buffer.writeInt(0, 283028144);
		buffer.writeInt(0, -1139858741);
		if (!Class84.aBool1159) {
			buffer.writeInt(Class507.aClass210_6671.method4195((byte) 75), 1081495875);
		}
    }
}
