/* Class206 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

public class Class206 implements Callable
{
    Class241_Sub39_Sub5_Sub2 aClass241_Sub39_Sub5_Sub2_2444;
    URL anURL2445;
    Class207 this$0;
    
    public Object method4088() throws Exception {
	URLConnection urlconnection
	    = ((Class206) this).anURL2445.openConnection();
	urlconnection.setConnectTimeout(10000);
	urlconnection.setReadTimeout(60000);
	boolean bool = true;
	try {
	    urlconnection.connect();
	} catch (IOException ioexception) {
	    ((Class207) ((Class206) this).this$0).aLong2447
		= Class50.method1249((byte) 1) * -6601365876603476997L;
	    bool = false;
	}
	return new Class293(((Class206) this).this$0,
			    bool ? urlconnection.getInputStream() : null,
			    ((Class206) this).aClass241_Sub39_Sub5_Sub2_2444,
			    ((Class206) this).anURL2445);
    }
    
    public Object call() throws Exception {
	URLConnection urlconnection
	    = ((Class206) this).anURL2445.openConnection();
	urlconnection.setConnectTimeout(10000);
	urlconnection.setReadTimeout(60000);
	boolean bool = true;
	try {
	    urlconnection.connect();
	} catch (IOException ioexception) {
	    ((Class207) ((Class206) this).this$0).aLong2447
		= Class50.method1249((byte) 1) * -6601365876603476997L;
	    bool = false;
	}
	return new Class293(((Class206) this).this$0,
			    bool ? urlconnection.getInputStream() : null,
			    ((Class206) this).aClass241_Sub39_Sub5_Sub2_2444,
			    ((Class206) this).anURL2445);
    }
    
    Class206(Class207 class207, URL url,
	     Class241_Sub39_Sub5_Sub2 class241_sub39_sub5_sub2) {
	((Class206) this).this$0 = class207;
	((Class206) this).anURL2445 = url;
	((Class206) this).aClass241_Sub39_Sub5_Sub2_2444
	    = class241_sub39_sub5_sub2;
    }
    
    public static void method4089(byte i) {
	InterfaceComponent.aClass129_900.removeSoftReferences((byte) 105);
	InterfaceComponent.aClass129_863.removeSoftReferences((byte) -9);
	InterfaceComponent.aClass129_829.removeSoftReferences((byte) -32);
	InterfaceComponent.aClass129_830.removeSoftReferences((byte) 93);
    }
    
    static final void method4090(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = -389932081 * class58.slot1;
    }
    
    static void method4091(Class103 class103, int i, int i_0_, InterfaceComponent class58,
			   int i_1_) {
	int i_2_ = 127;
	int i_3_ = 7;
	for (int i_4_ = 63; i_4_ >= 0; i_4_--) {
	    int i_5_ = (i_4_ & 0x3f) << 10 | (i_3_ & 0x7) << 7 | i_2_ & 0x7f;
	    Class81.method1812(false, true, 953486904);
	    int i_6_ = Class474.anIntArray6382[i_5_];
	    Class238.method4876(false, true, 482862469);
	    class103.method2396(i,
				((63 - i_4_) * (1463495207 * class58.scrollMinY)
				 >> 6) + i_0_,
				class58.anInt850 * 439139681,
				(class58.scrollMinY * 1463495207 >> 6) + 1,
				~0xffffff | i_6_, 0);
	}
    }
    
    static final void method4092(ClientScriptData class454, int i) {
	int i_7_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	ItemDefinition class623
	    = JS5.itemDefLoader.list(i_7_, (short) -23981);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class623.stackable * -942978965 == 2 ? 1 : 0;
    }
    
    static Js5Archive[] method4093(int i) {
	return new Js5Archive[] { Js5Archive.INTERFACES_INDEX, Js5Archive.SPRITES_JAGEX_INDEX,
			       Js5Archive.WORLD_MAP_INDEX, Js5Archive.GFX_CONFIG,
			       Js5Archive.MESHES, Js5Archive.MAP_EFFECT_INDEX,
			       Js5Archive.BINARY, Js5Archive.NPCS_INDEX,
			       Js5Archive.AUDIO_INDEX, Js5Archive.DEFAULTS,
			       Js5Archive.CS2_INDEX, Js5Archive.LANDSCAPES_INDEX,
			       Js5Archive.aClass56_731, Js5Archive.LOADING_SCREEN_INDEX,
			       Js5Archive.GRAPHICS_INDEX, Js5Archive.TEXTURES_INDEX,
			       Js5Archive.OBJECTS_INDEX, Js5Archive.SPRITES_JPG_INDEX,
			       Js5Archive.DLLS, Js5Archive.aClass56_723,
			       Js5Archive.MATERIALS, Js5Archive.SPRITES_INDEX,
			       Js5Archive.SHADERS, Js5Archive.FONTMETRICS,
			       Js5Archive.CS2_MAPS_INDEX, Js5Archive.CONFIG,
			       Js5Archive.SKELETON_INDEX, Js5Archive.MODELS_INDEX,
			       Js5Archive.QUICK_CHAT_MENUS_INDEX, Js5Archive.VORBIS,
			       Js5Archive.SKINS_INDEX, Js5Archive.aClass56_729,
			       Js5Archive.aClass56_727, Js5Archive.ITEMS_INDEX,
			       Js5Archive.QUICK_CHAT_MESSAGES_INDEX, Js5Archive.ANIMATIONS_INDEX,
			       Js5Archive.GENERAL_MAPS_INDEX };
    }
    
    static final void method4094(ClientScriptData class454, int i) {
	int i_8_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub23_8855,
	     i_8_, (byte) 2);
	client.aClass238_8477.method4768((byte) 5);
	Class167.method3600((short) 19044);
	client.aBool8297 = false;
    }
}
