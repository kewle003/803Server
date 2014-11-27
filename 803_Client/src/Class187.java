/* Class187 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class187
{
    int anInt2195;
    short aShort2196;
    short aShort2197;
    byte aByte2198;
    short aShort2199;
    byte aByte2200;
    boolean aBool2201;
    int anInt2202;
    public static InterfaceDefinition[] aClass35Array2203;
    public static JS5 aClass210_2204;
    public static int anInt2205;
    
    Class187(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_,
	     int i_6_, int i_7_, boolean bool, int i_8_) {
	((Class187) this).anInt2195 = 332011125 * i;
	((Class187) this).aShort2196 = (short) i_3_;
	((Class187) this).aShort2197 = (short) i_4_;
	((Class187) this).aShort2199 = (short) i_5_;
	((Class187) this).aByte2200 = (byte) i_6_;
	((Class187) this).aByte2198 = (byte) i_7_;
	((Class187) this).aBool2201 = bool;
	((Class187) this).anInt2202 = i_8_ * -1770761675;
    }
    
    static final void method3865(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class281.method5488(class58, class35, true, 2, class454, -1078677722);
    }
    
    static final void method3866(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class479.method10958(class58, class35, class454, -268212524);
    }
    
    static final void method3867(ClientScriptData class454, int i) {
	int i_9_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class455 class455;
	if (((ClientScriptData) class454).aBool6246)
	    class455 = ((ClientScriptData) class454).aClass455_6230;
	else
	    class455 = ((ClientScriptData) class454).aClass455_6229;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class455.method10557(i_9_, -1, (byte) 44) ? 1 : 0;
    }
    
    public static byte[] whirlpool/*method3868*/(byte[] data, int off, int len, short i_11_) {
		byte[] source;
		if (off > 0) {
			source = new byte[len];
		    for (int i_13_ = 0; i_13_ < len; i_13_++) {
		    	source[i_13_] = data[i_13_ + off];
		    }
		} else {
			source = data;
		}
		Whirlpool whirlpool = new Whirlpool();
		whirlpool.NESSIEinit(-1850229318);
		whirlpool.NESSIEadd(source, (long) (8 * len));
		byte[] digest = new byte[64];
		whirlpool.NESSIEfinalize(digest, 0, 1849868205);
		return digest;
    }
    
    static final void method3869(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_15_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_16_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (Class72.aClass625_1100.list(i_15_, 1324690067)
	       .anIntArray10863[i_16_]);
    }
}
