/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

//package com.jagex.game.runetek6.config;
public class Js5Archive {
    public static Js5Archive DEFAULTS;
    public static Js5Archive SKINS_INDEX;
    public static Js5Archive SKELETON_INDEX;// = new CacheIndexDef(0, "", false, false, false);
    public static Js5Archive INTERFACES_INDEX;//aClass56_701
    public static Js5Archive BINARY;//aClass56_702
    public static Js5Archive MODELS_INDEX;//aClass56_703
    public static Js5Archive SPRITES_INDEX;//aClass56_704
    public static Js5Archive TEXTURES_INDEX;//aClass56_705
    public static Js5Archive CONFIG;//aClass56_706
    public static Js5Archive CS2_INDEX;//aClass56_707
    public static Js5Archive FONTMETRICS;//aClass56_708
    public static Js5Archive VORBIS;
    public static Js5Archive OBJECTS_INDEX;//aClass56_710
    public static Js5Archive CS2_MAPS_INDEX;//aClass56_711
    public static Js5Archive NPCS_INDEX;//aClass56_712
    static int requiredArrayLength;//anInt713
    public static Js5Archive ANIMATIONS_INDEX;//aClass56_714
    public static Js5Archive GRAPHICS_INDEX;
    public static Js5Archive GENERAL_MAPS_INDEX;
    public static Js5Archive WORLD_MAP_INDEX;//aClass56_717
    public static Js5Archive GFX_CONFIG;
    public static Js5Archive QUICK_CHAT_MENUS_INDEX;
    public static Js5Archive ITEMS_INDEX;//aClass56_720
    public static Js5Archive MAP_EFFECT_INDEX;
    public static Js5Archive QUICK_CHAT_MESSAGES_INDEX;
    public static Js5Archive aClass56_723;//aClass56_723
    public static Js5Archive DLLS;//aClass56_724
    public static Js5Archive SHADERS;//aClass56_725
    public static Js5Archive SPRITES_JPG_INDEX;
    public static Js5Archive aClass56_727;
    public static Js5Archive SPRITES_JAGEX_INDEX;
    public static Js5Archive aClass56_729;
    public static Js5Archive LANDSCAPES_INDEX;//aClass56_730
    public static Js5Archive aClass56_731;
    public static Js5Archive LOADING_SCREEN_INDEX;//aClass56_732
    static Js5Archive MESHES;//aClass56_733
    public static Js5Archive AUDIO_INDEX;
    int archiveId;//anInt735
    boolean isStreamed;//aBool736
    static Js5Archive MATERIALS;//aClass56_737
    public static JS5 NPCS_ARCHIVE;//aClass210_738
        
    public boolean isStreamed/*method1375*/(int i) {
    	return isStreamed;
    }
       
    public int method1377() {
	return -399988375 * archiveId;
    }
        
    public int getArchiveId/*method1379*/(byte i) {
    	return -399988375 * archiveId;
    }
      
    public boolean method1381() {
    	return isStreamed;
    }
    
    static {
    	SKELETON_INDEX = new Js5Archive(0, "", false, false, false);
		SKINS_INDEX = new Js5Archive(1, "", false, false, false);
		CONFIG = new Js5Archive(2, "client.config", true, false, false);
		INTERFACES_INDEX = new Js5Archive(3, "client.scaleform", true, false, false);
		LANDSCAPES_INDEX = new Js5Archive(5, "", false, false, false);
		MODELS_INDEX = new Js5Archive(7, "", false, false, false);
		SPRITES_INDEX = new Js5Archive(8, "client.sprites", false, false, false);
		TEXTURES_INDEX = new Js5Archive(9, "", false, false, false);
		BINARY = new Js5Archive(10, "client.binary", false, false, false);
		CS2_INDEX = new Js5Archive(12, "", true, false, false);
		FONTMETRICS = new Js5Archive(13, "client.fontmetrics", false, false, false);
		VORBIS = new Js5Archive(14, "client.vorbis", false, false, false);
		OBJECTS_INDEX = new Js5Archive(16, "", true, false, false);
		CS2_MAPS_INDEX = new Js5Archive(17, "", true, false, false);
		NPCS_INDEX = new Js5Archive(18, "", true, false, false);
		ITEMS_INDEX = new Js5Archive(19, "client.obj.config", true, false, false);
		ANIMATIONS_INDEX = new Js5Archive(20, "", true, false, false);
		GRAPHICS_INDEX = new Js5Archive(21, "", true, false, false);
		GENERAL_MAPS_INDEX = new Js5Archive(22, "", true, false, false);
		WORLD_MAP_INDEX = new Js5Archive(23, "", true, false, false);
		QUICK_CHAT_MESSAGES_INDEX = new Js5Archive(24, "", true, false, false);
		QUICK_CHAT_MENUS_INDEX = new Js5Archive(25, "", true, false, false);
		aClass56_727 = new Js5Archive(26, "", false, false, false);
		MAP_EFFECT_INDEX = new Js5Archive(27, "", false, false, false);//stuff like water on varrock fountian
		DEFAULTS = new Js5Archive(28, "client.defaults", false, false, false);
		aClass56_723 = new Js5Archive(29, "", false, false, false);
		DLLS = new Js5Archive(30, "dlls", false, false, false);
		SHADERS = new Js5Archive(31, "client.hlsl", false, false, false);
		SPRITES_JPG_INDEX = new Js5Archive(32, "", false, false, false);
		LOADING_SCREEN_INDEX = new Js5Archive(33, "", true, false, false);
		SPRITES_JAGEX_INDEX = new Js5Archive(34, "", false, false, false);
		aClass56_729 = new Js5Archive(35, "", true, false, false);
		aClass56_731 = new Js5Archive(36, "", false, false, false);
		GFX_CONFIG = new Js5Archive(37, "client.gfxconfigs", false, false, false);
		MATERIALS = new Js5Archive(38, "client.materials", false, false, false);
		MESHES = new Js5Archive(39, "client.meshes", false, false, false);
		AUDIO_INDEX = new Js5Archive(40, "", false, false, true);
		requiredArrayLength = -58886911;
    }
    
    public int method1382() {
	return -399988375 * archiveId;
    }
    
    Js5Archive(int i, String defaultName, boolean bool, boolean bool_0_, boolean streamed) {
		archiveId = -878545191 * i;
		isStreamed = streamed;
    }
    
    public boolean method1383() {
	return isStreamed;
    }
    
    public boolean method1384() {
	return isStreamed;
    }
    
    public static int getRequiredArrayLength/*InterfaceDefinition.method1002*/(byte i) {
		if (-771459841 * requiredArrayLength == -1) {
		    Js5Archive[] class56s = Class206.method4093(368241882);
		    for (int i_3_ = 0; i_3_ < class56s.length; i_3_++) {
				Js5Archive archive = class56s[i_3_];
				if (-399988375 * archive.archiveId > -771459841 * requiredArrayLength) {
				    requiredArrayLength = 1847941527 * archive.archiveId;
				}
		    }
		    requiredArrayLength += 58886911;
		}
		return -771459841 * requiredArrayLength;
	}

	public static int method1385() {
	if (-771459841 * requiredArrayLength == -1) {
	    Js5Archive[] class56s = Class206.method4093(-560802225);
	    for (int i = 0; i < class56s.length; i++) {
		Js5Archive class56 = class56s[i];
		if (-399988375 * ((Js5Archive) class56).archiveId
		    > -771459841 * requiredArrayLength)
		    requiredArrayLength = 1847941527 * ((Js5Archive) class56).archiveId;
	    }
	    requiredArrayLength += 58886911;
	}
	return -771459841 * requiredArrayLength;
    }
    
    public static int method1386() {
	if (-771459841 * requiredArrayLength == -1) {
	    Js5Archive[] class56s = Class206.method4093(-402428073);
	    for (int i = 0; i < class56s.length; i++) {
		Js5Archive class56 = class56s[i];
		if (-399988375 * ((Js5Archive) class56).archiveId
		    > -771459841 * requiredArrayLength)
		    requiredArrayLength = 1847941527 * ((Js5Archive) class56).archiveId;
	    }
	    requiredArrayLength += 58886911;
	}
	return -771459841 * requiredArrayLength;
    }
    
    static final void method1387(ClientScriptData class454, byte i) {
	InterfaceComponent class58 = (((ClientScriptData) class454)
			       .varEntity.aClass35_11437
			       .method997
			   ((((ClientScriptData) class454).integerStack
			     [((((ClientScriptData) class454).intStackPointer -= 1736754263)
			       * 1482319719)]),
			    -947241701));
	class58.aClass58Array836 = null;
	class58.aClass58Array1000 = null;
	WorldType.refreshComponent(class58, 1210920704);
    }
    
    public static void method1388(int i) {
	Class573_Sub1.aHashMap8781.clear();
	Class573_Sub1.aHashMap8766.clear();
    }
    
    static final void method1389(ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	int i_2_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class493.changeFriendRank(string, i_2_, (byte) 82);
    }
    
    static final void method1390(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.aBool8441 && !client.aBool8442 ? 1 : 0;
    }
    
    static void method1391(byte i) {
	if (null != Class23.aClass103_206) {
	    Class23.aClass103_206.method2220((byte) 0);
	    Class23.aClass103_206 = null;
	    Class485.aClass96_6469 = null;
	}
    }
}
