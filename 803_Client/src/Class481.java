/* Class481 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class481
{
    static Class481 aClass481_6440;
    public static Class481 aClass481_6441;
    public static Class481 aClass481_6442;
    static Class481 aClass481_6443;
    public static Class481 aClass481_6444;
    public static Class481 aClass481_6445;
    public static Class481 aClass481_6446;
    public static Class481 aClass481_6447;
    static Class481 aClass481_6448;
    static Class481 aClass481_6449;
    static Class481 aClass481_6450;
    static Class481 aClass481_6451;
    public int anInt6452;
    static Class481 aClass481_6453;
    public static Class481 aClass481_6454 = new Class481(1);
    public static Class481 aClass481_6455 = new Class481(2);
    static Class168[] aClass168Array6456;
    
    static {
	aClass481_6442 = new Class481(4);
	aClass481_6444 = new Class481(8);
	aClass481_6441 = new Class481(16);
	aClass481_6445 = new Class481(32);
	aClass481_6446 = new Class481(64);
	aClass481_6447 = new Class481(128);
	aClass481_6448 = new Class481(256);
	aClass481_6449 = new Class481(512);
	aClass481_6450 = new Class481(1024);
	aClass481_6443 = new Class481(2048);
	aClass481_6440 = new Class481(4096);
	aClass481_6453 = new Class481(8192);
	aClass481_6451 = new Class481(16384);
    }
    
    Class481(int i) {
	anInt6452 = 454729819 * i;
    }
    
    static final void method11006(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_0_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	boolean bool
	    = 1 == (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = Class370.method6617(i_0_, bool, 1708165207);
    }
    
    static final void method11007(InterfaceComponent class58, int i) {
	if (1551710807 * class58.anInt1002 == -923140953 * InterfaceComponent.anInt813) {
	    if (null
		== Class21.myPlayer.nameUnfiltered) {
		class58.anInt879 = 0;
		class58.anInt880 = 0;
	    } else {
		class58.anInt853 = -1540993706;
		class58.anInt885
		    = ((int) (Math.sin((double) client.anInt8296 / 40.0)
			      * 256.0)
		       & 0x7ff) * -1656663299;
		class58.modelType = -553405919;
		class58.anInt879 = client.myPlayerIndex * -1814056849;
		class58.anInt880
		    = (Class475_Sub1_Sub3_Sub1.method17705
		       (Class21.myPlayer.nameUnfiltered,
			-532128244)) * -424199415;
		Class409_Sub1 class409_sub1
		    = (Class21.myPlayer
		       .aClass409_Sub1_11405);
		if (class409_sub1 != null) {
		    if (class58.aClass409_998 == null)
			class58.aClass409_998 = new Class409_Sub2();
		    class58.anInt818
			= class409_sub1.method7346(-1273249661) * 1874344547;
		    class58.aClass409_998.method7420(class409_sub1,
						     -1613344657);
		} else
		    class58.aClass409_998 = null;
	    }
	}
    }
    
    static final void method11008(ClientScriptData class454, byte i) {
	boolean bool
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       == 1);
	Class219.method4377(bool, -519177116);
    }
    
    static final void setContextMenuSelectEvent/*method11009*/(InterfaceComponent component, 
    		InterfaceDefinition iFace, ClientScriptData scriptData, int i) {
		String params = (String) scriptData.objectStack
					  [(scriptData.objectStackPointer -= -1650705371) * -290357331];
		if (Class8.extractVarWatchKeys(params, scriptData, (byte) -82) != null) {
			params = params.substring(0, params.length() - 1);
		}
		component.onContextMenuSelect = Class299.extractCs2Params(params, scriptData, -319444970);
		component.hasClientScript = true;
    }
}
