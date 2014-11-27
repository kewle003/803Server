/* Class388 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class388
{
    public static Class388 aClass388_5717 = new Class388();
    public static Class388 aClass388_5718 = new Class388();
    
    Class388() {
	/* empty */
    }
    
    public static int method6958(int i, int i_0_, int i_1_, int i_2_, int i_3_,
				 int i_4_, byte i_5_) {
	if (1 == (i_4_ & 0x1)) {
	    int i_6_ = i_2_;
	    i_2_ = i_3_;
	    i_3_ = i_6_;
	}
	i_1_ &= 0x3;
	if (i_1_ == 0)
	    return i_0_;
	if (1 == i_1_)
	    return 7 - i - (i_2_ - 1);
	if (2 == i_1_)
	    return 7 - i_0_ - (i_3_ - 1);
	return i;
    }
    
    static int method6959(int i, int i_7_) {
	if (i == 9 || i == 10)
	    return 1;
	if (i == 11)
	    return 8;
	return i;
    }
    
    static final void method6960(ClientScriptData class454, int i) {
	int i_8_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_8_, (byte) -33);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_8_ >> 16];
	ClientScriptData.method10553(class58, class35, class454, -1547279326);
    }
    
    static final void method6961(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 93836723;
	int i_9_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_10_ = (((ClientScriptData) class454).integerStack
		     [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_11_ = (((ClientScriptData) class454).integerStack
		     [2 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_12_ = (((ClientScriptData) class454).integerStack
		     [3 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_13_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer + 4]);
	Class402.soundManager.method1162(Class112.aClass112_1522, i_9_, i_10_,
					  i_12_,
					  Class130.aClass130_1597
					      .method3067(-960497231),
					  Class127.aClass127_1587, 0.0F, 0.0F,
					  null, 0, i_13_, i_11_, -547739464);
    }
    
    static final void method6962(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class13.anInt110 * 1572493461;
    }
    
    static boolean method6963(InterfaceComponent class58, int i) {
	Class241_Sub20 class241_sub20 = client.method13624(class58);
	if (class241_sub20.method15041((byte) -36) > 0)
	    return true;
	if (class241_sub20.method15038(1894590981))
	    return true;
	if (null != class58.aClass58_938)
	    return true;
	return false;
    }
    
    static final void method6964(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	if (null == class58.aString933)
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	else
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= class58.aString933;
    }
}
