/* Class459 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class459
{
    Class459() throws Throwable {
	throw new Error();
    }
    
    public static int method10599(Class278 class278) {
	Class287 class287 = Class287.method5561(0.0F, 0.0F, 1.0F);
	class287.method5592(class278);
	double d = Math.atan2((double) class287.aFloat4477,
			      (double) class287.aFloat4479);
	class287.method5564();
	if (d < 0.0)
	    d = 3.141592653589793 + (d + 3.141592653589793);
	return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
    }
    
    public static int method10600(Class278 class278) {
	Class287 class287 = Class287.method5561(0.0F, 0.0F, 1.0F);
	class287.method5592(class278);
	double d = Math.atan2((double) class287.aFloat4477,
			      (double) class287.aFloat4479);
	class287.method5564();
	if (d < 0.0)
	    d = 3.141592653589793 + (d + 3.141592653589793);
	return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
    }
    
    static int decodeSkip/*method10601*/(RSBitBuffer buffer, int i) {
		int skipCode = buffer.readBits(2, -772189157);
		int amount;
		if (skipCode == 0) {
			amount = 0;
		} else if (skipCode == 1) {
			amount = buffer.readBits(5, 673613815);
		} else if (2 == skipCode) {
			amount = buffer.readBits(8, -160423002);
		} else {
			amount = buffer.readBits(11, 761687804);
		}
		return amount;
    }
    
    static final void method10602(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class124.setScrollMax(class58, class35, class454, -1424834567);
    }
    
    public static boolean isIgnored/*method10603*/(String displayName, byte i) {
		if (null == displayName) {
		    return false;
		}
		for (int index = 0; index < -750736473 * client.ignoreListSize; index++) {
		    Ignore ignore = client.ignoreList[index];
		    if (displayName.equalsIgnoreCase(ignore.currentName)) {
		    	return true;
		    }
		    if (displayName.equalsIgnoreCase(ignore.previousName)) {
		    	return true;
		    }
		}
		return false;
    }
    
    static boolean method10604(int i) {
	Class13.anInt77 = 78183201;
	Exception_Sub5.aClass190_10704 = client.aClass190_8340;
	return (CcDeltaNode.method15095
		(Class13.aLong82 * -3469600135743429117L == -1L, true, "", "",
		 -3469600135743429117L * Class13.aLong82));
    }
    
    static final void method10605(ClientScriptData class454, int i) {
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_3_, (byte) -121);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_3_ >> 16];
	Class44.method1107(class58, class35, class454, 84503750);
    }
    
    static final void method10606(ClientScriptData class454, int i) {
	if (client.aBool8267)
	    JSFunction.REMOVE_VIDEO_ADVERT.method6212((byte) 0);
    }
}
