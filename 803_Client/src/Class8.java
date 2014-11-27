/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class8
{
    int anInt43;
    public int anInt44;
    public static int anInt45;
    public static Class598 aClass598_46;
    
    public void method511(int i) {
	anInt44 = -1673494563 * (-267726731 * anInt44 & 0x3fff);
    }
    
    public boolean method512(int i, int i_0_, int i_1_, byte i_2_) {
	int i_3_ = ((Class8) this).anInt43 * -696706557;
	if (anInt44 * -267726731 == i
	    && 0 == ((Class8) this).anInt43 * -696706557)
	    return false;
	boolean bool;
	if (-696706557 * ((Class8) this).anInt43 == 0) {
	    if (i > -267726731 * anInt44 && i <= -267726731 * anInt44 + i_0_
		|| (i < -267726731 * anInt44
		    && i >= anInt44 * -267726731 - i_0_)) {
		anInt44 = -1673494563 * i;
		return false;
	    }
	    bool = true;
	} else if (-696706557 * ((Class8) this).anInt43 > 0
		   && i > -267726731 * anInt44) {
	    int i_4_ = (-696706557 * ((Class8) this).anInt43
			* (-696706557 * ((Class8) this).anInt43) / (2 * i_0_));
	    int i_5_ = anInt44 * -267726731 + i_4_;
	    if (i_5_ >= i || i_5_ < -267726731 * anInt44)
		bool = false;
	    else
		bool = true;
	} else if (-696706557 * ((Class8) this).anInt43 < 0
		   && i < -267726731 * anInt44) {
	    int i_6_ = (((Class8) this).anInt43 * -696706557
			* (((Class8) this).anInt43 * -696706557) / (2 * i_0_));
	    int i_7_ = anInt44 * -267726731 - i_6_;
	    if (i_7_ <= i || i_7_ > -267726731 * anInt44)
		bool = false;
	    else
		bool = true;
	} else
	    bool = false;
	if (bool) {
	    if (i > -267726731 * anInt44) {
		((Class8) this).anInt43 += 1567875243 * i_0_;
		if (i_1_ != 0 && -696706557 * ((Class8) this).anInt43 > i_1_)
		    ((Class8) this).anInt43 = 1567875243 * i_1_;
	    } else {
		((Class8) this).anInt43 -= 1567875243 * i_0_;
		if (0 != i_1_ && -696706557 * ((Class8) this).anInt43 < -i_1_)
		    ((Class8) this).anInt43 = 1567875243 * -i_1_;
	    }
	    if (i_3_ != ((Class8) this).anInt43 * -696706557) {
		int i_8_
		    = (((Class8) this).anInt43 * -696706557
		       * (((Class8) this).anInt43 * -696706557) / (2 * i_0_));
		if (i > anInt44 * -267726731) {
		    if (i_8_ + -267726731 * anInt44 > i)
			((Class8) this).anInt43 = 1567875243 * i_3_;
		} else if (i < -267726731 * anInt44
			   && -267726731 * anInt44 - i_8_ < i)
		    ((Class8) this).anInt43 = 1567875243 * i_3_;
	    }
	} else if (((Class8) this).anInt43 * -696706557 > 0) {
	    ((Class8) this).anInt43 -= i_0_ * 1567875243;
	    if (-696706557 * ((Class8) this).anInt43 < 0)
		((Class8) this).anInt43 = 0;
	} else {
	    ((Class8) this).anInt43 += 1567875243 * i_0_;
	    if (((Class8) this).anInt43 * -696706557 > 0)
		((Class8) this).anInt43 = 0;
	}
	anInt44 += ((i_3_ + ((Class8) this).anInt43 * -696706557 >> 1)
		    * -1673494563);
	return bool;
    }
    
    public void method513(int i, int i_9_) {
	anInt44 = -1673494563 * i;
	((Class8) this).anInt43 = 0;
    }
    
    public int method514(byte i) {
	return anInt44 * -267726731 & 0x3fff;
    }
    
    public int method515() {
	return anInt44 * -267726731 & 0x3fff;
    }
    
    public void method516(int i) {
	anInt44 = -1673494563 * i;
	((Class8) this).anInt43 = 0;
    }
    
    public boolean method517(int i, int i_10_, int i_11_) {
	int i_12_ = ((Class8) this).anInt43 * -696706557;
	if (anInt44 * -267726731 == i
	    && 0 == ((Class8) this).anInt43 * -696706557)
	    return false;
	boolean bool;
	if (-696706557 * ((Class8) this).anInt43 == 0) {
	    if (i > -267726731 * anInt44 && i <= -267726731 * anInt44 + i_10_
		|| (i < -267726731 * anInt44
		    && i >= anInt44 * -267726731 - i_10_)) {
		anInt44 = -1673494563 * i;
		return false;
	    }
	    bool = true;
	} else if (-696706557 * ((Class8) this).anInt43 > 0
		   && i > -267726731 * anInt44) {
	    int i_13_
		= (-696706557 * ((Class8) this).anInt43
		   * (-696706557 * ((Class8) this).anInt43) / (2 * i_10_));
	    int i_14_ = anInt44 * -267726731 + i_13_;
	    if (i_14_ >= i || i_14_ < -267726731 * anInt44)
		bool = false;
	    else
		bool = true;
	} else if (-696706557 * ((Class8) this).anInt43 < 0
		   && i < -267726731 * anInt44) {
	    int i_15_
		= (((Class8) this).anInt43 * -696706557
		   * (((Class8) this).anInt43 * -696706557) / (2 * i_10_));
	    int i_16_ = anInt44 * -267726731 - i_15_;
	    if (i_16_ <= i || i_16_ > -267726731 * anInt44)
		bool = false;
	    else
		bool = true;
	} else
	    bool = false;
	if (bool) {
	    if (i > -267726731 * anInt44) {
		((Class8) this).anInt43 += 1567875243 * i_10_;
		if (i_11_ != 0 && -696706557 * ((Class8) this).anInt43 > i_11_)
		    ((Class8) this).anInt43 = 1567875243 * i_11_;
	    } else {
		((Class8) this).anInt43 -= 1567875243 * i_10_;
		if (0 != i_11_
		    && -696706557 * ((Class8) this).anInt43 < -i_11_)
		    ((Class8) this).anInt43 = 1567875243 * -i_11_;
	    }
	    if (i_12_ != ((Class8) this).anInt43 * -696706557) {
		int i_17_
		    = (((Class8) this).anInt43 * -696706557
		       * (((Class8) this).anInt43 * -696706557) / (2 * i_10_));
		if (i > anInt44 * -267726731) {
		    if (i_17_ + -267726731 * anInt44 > i)
			((Class8) this).anInt43 = 1567875243 * i_12_;
		} else if (i < -267726731 * anInt44
			   && -267726731 * anInt44 - i_17_ < i)
		    ((Class8) this).anInt43 = 1567875243 * i_12_;
	    }
	} else if (((Class8) this).anInt43 * -696706557 > 0) {
	    ((Class8) this).anInt43 -= i_10_ * 1567875243;
	    if (-696706557 * ((Class8) this).anInt43 < 0)
		((Class8) this).anInt43 = 0;
	} else {
	    ((Class8) this).anInt43 += 1567875243 * i_10_;
	    if (((Class8) this).anInt43 * -696706557 > 0)
		((Class8) this).anInt43 = 0;
	}
	anInt44 += ((i_12_ + ((Class8) this).anInt43 * -696706557 >> 1)
		    * -1673494563);
	return bool;
    }
    
    public void method518() {
	anInt44 = -1673494563 * (-267726731 * anInt44 & 0x3fff);
    }
    
    static final void method519(ClientScriptData class454, int i) {
	int i_18_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_18_, (byte) -89);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_18_ >> 16];
	Class281.method5488(class58, class35, true, 0, class454, 56979834);
    }
    
    static final int[] extractVarWatchKeys/*method520*/(String paramString, ClientScriptData scriptData, byte i) {
		int[] varWatchKeys = null;
		if (paramString.length() > 0 && paramString.charAt(paramString.length() - 1) == 'Y') {
		    int length = scriptData.integerStack[((scriptData.intStackPointer -= 1736754263) * 1482319719)];
		    if (length > 0) {
		    	varWatchKeys = new int[length];
				while (length-- > 0) {
					varWatchKeys[length] 
						= scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
				}
		    }
		}
		return varWatchKeys;
    }
    
    static final void method521(ClientScriptData class454, int i) {
	int i_20_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (i_20_ == -1)
	    throw new RuntimeException();
	ClientScriptMap class406
	    = Class105_Sub1.cs2MapsList.list(i_20_, (byte) -88);
	if (class406.aChar5898 != 's')
	    throw new RuntimeException();
	int[] is = class406.method7248(string, 1717671983);
	int i_21_ = 0;
	if (null != is)
	    i_21_ = is.length;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_21_;
    }
    
    static final void method522(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.anInt8466 * 1629309841;
    }
}
