/* Class466 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class466
{
    Object[] anObjectArray6313;
    int anInt6314 = -1020997289;
    ClientScript aClass241_Sub39_Sub1_6315;
    int[] anIntArray6316;
    long[] aLongArray6317;
    
    Class466() {
	/* empty */
    }
    
    static final void decementObjStack/*method10717*/(ClientScriptData scriptData, byte i) {
		scriptData.objectStackPointer -= -1650705371;
    }
    
    static final void method10718(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class473.method10839(class58, class35, class454, (byte) 109);
    }
    
    static final void method10719(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class47.isWindowFocused ? 1 : 0;
    }
    
    static final void method10720(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = -1970555139 * Class219.anInt2559;
    }
    
    public static Class398 method10721(String string, int i, int i_0_) {
	Class398_Sub1 class398_sub1 = new Class398_Sub1();
	((Class398) class398_sub1).aString5792 = string;
	((Class398) class398_sub1).anInt5793 = i * -1943367083;
	return class398_sub1;
    }
    
    static final boolean method10722(ObjectDefinitionLoader class532, int i, int i_1_,
				     byte i_2_) {
	ObjectDefinition class526 = class532.getObjectDefinition(i, 577892407);
	if (i_1_ == 11)
	    i_1_ = 10;
	if (i_1_ >= 5 && i_1_ <= 8)
	    i_1_ = 4;
	return class526.method11793(i_1_, (byte) 89);
    }
    
    static void method10723(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [((ClientScriptData) class454).intStackPointer * 1482319719 - 1]
	    = (Class326_Sub3.aClass482_10288.method11010
	       ((((ClientScriptData) class454).integerStack
		 [1482319719 * ((ClientScriptData) class454).intStackPointer - 1]),
		(short) -25324)
	       .anInt6435) * -1156301355;
    }
    
    static final void method10724(ClientScriptData class454, int i) {
	((ClientScriptData) class454).aClass333_6242 = new Class333();
	((ClientScriptData) class454).aClass333_6242.anInt5058
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       * 494032683);
	((ClientScriptData) class454).aClass333_6242.aClass241_Sub39_Sub9_5059
	    = Class72.aClass625_1100.list(((((ClientScriptData) class454)
						   .aClass333_6242.anInt5058)
						  * -1422545021),
						 1314079526);
	((ClientScriptData) class454).aClass333_6242.anIntArray5060
	    = new int[((ClientScriptData) class454).aClass333_6242
			  .aClass241_Sub39_Sub9_5059.method17193(-282462754)];
    }
}
