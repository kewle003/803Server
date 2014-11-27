/* Class193 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

public class Class193
{
    public static Server aClass397_2297;
    static int anInt2298;
    
    Class193() throws Throwable {
	throw new Error();
    }
    
    static void method3937(int i) {
		GPI.viewportPlayerCount = 0;
		for (int index = 0; index < 2048; index++) {
		    GPI.aClass241_Sub3Array2373[index] = null;
		    GPI.aClass241_Sub3Array2366[index] = null;
		    GPI.playerMovementTypes[index] = Class448.aClass448_6186.aByte6187;
		    GPI.playerRegions[index] = null;
		}
    }
    
    static final void method3938(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class281.method5488(class58, class35, false, 1, class454, -1811991234);
    }
    
    public static float method3939(Class278 class278, int i) {
	Class287 class287 = Class287.method5561(0.0F, 0.0F, 1.0F);
	class287.method5592(class278);
	double d
	    = 1.5707963267948966 - Math.acos((double) class287.aFloat4474);
	class287.method5564();
	return (float) d;
    }
    
    static final void method3940(ClientScriptData class454, int i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_1_, (byte) -3);
	Class62.method1616(class58, class454, 1222806433);
    }
    
    static final void method3941(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	ChatLine class241_sub39_sub4
	    = Class116.method2917(i_2_, i_3_, 55432915);
	if (null != class241_sub39_sub4) {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 608603855 * class241_sub39_sub4.anInt10834;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class241_sub39_sub4.time * -1719033875;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 978963203 * class241_sub39_sub4.flags;
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= (class241_sub39_sub4.name != null
		   ? class241_sub39_sub4.name : "");
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= (null != class241_sub39_sub4.nameUnfiltered
		   ? class241_sub39_sub4.nameUnfiltered : "");
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= (class241_sub39_sub4.nameSimple != null
		   ? class241_sub39_sub4.nameSimple : "");
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= (null != class241_sub39_sub4.clan
		   ? class241_sub39_sub4.clan : "");
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class241_sub39_sub4.anInt10836 * 208492299;
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= (class241_sub39_sub4.message != null
		   ? class241_sub39_sub4.message : "");
	} else {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	}
    }
    
    static String method3942(long l) {
	return Class119.method2943(new Date(l), "EEE dd-MMM-yyyy HH:mm:ss zzz",
				   -1733138669);
    }
}
