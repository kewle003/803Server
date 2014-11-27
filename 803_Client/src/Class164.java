/* Class164 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class164
{
    Class164() throws Throwable {
	throw new Error();
    }
    
    static final void method3533(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 1830590986;
	int i_0_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [2 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [3 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_4_ = (((ClientScriptData) class454).integerStack
		    [4 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_5_ = (((ClientScriptData) class454).integerStack
		    [5 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	Class221 class221
	    = Class402.soundManager.method1161(Class112.aClass112_1523,
						Class402.soundManager, i_0_,
						i_1_, i_3_,
						Class130.aClass130_1597
						    .method3067(-960497231),
						Class127.aClass127_1587, 0.0F,
						0.0F, null, 0, i_4_, false,
						747905494);
	if (class221 != null)
	    Class402.soundManager.method1231(class221, i_5_, i_2_,
					      -971004782);
    }
    
    static final void method3534(ClientScriptData class454, int i) {
	int i_6_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_6_ & 0x3fff;
    }
    
    static final void method3535(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class620.method13341(1301494434);
    }
    
    public static Class507_Sub1 method3536(int i) {
	if (Class395.anInt5772 * 1425602539
	    < Class395.aClass507_Sub1Array5780.length)
	    return (Class395.aClass507_Sub1Array5780
		    [(Class395.anInt5772 += -1439729469) * 1425602539 - 1]);
	return null;
    }
    
    public static void method3537(InterfaceComponent[] class58s, int i, int i_7_,
				  int i_8_, boolean bool, int i_9_) {
	for (int i_10_ = 0; i_10_ < class58s.length; i_10_++) {
	    InterfaceComponent class58 = class58s[i_10_];
	    if (class58 != null && i == -152977625 * class58.parentNode) {
		SparseVarDomain.method3108(class58, i_7_, i_8_, bool, (byte) 0);
		Class257.method5060(class58, i_7_, i_8_, -71272055);
		if (-1735856329 * class58.anInt860
		    > (class58.scrollMaxX * 1257300791
		       - class58.anInt850 * 439139681))
		    class58.anInt860 = (-582374399 * class58.scrollMaxX
					- class58.anInt850 * 979375143);
		if (class58.anInt860 * -1735856329 < 0)
		    class58.anInt860 = 0;
		if (-1669999329 * class58.scrollCurrentY
		    > (1204737107 * class58.scrollMaxY
		       - 1463495207 * class58.scrollMinY))
		    class58.scrollCurrentY = (class58.scrollMaxY * 398526029
					- 1614692857 * class58.scrollMinY);
		if (-1669999329 * class58.scrollCurrentY < 0)
		    class58.scrollCurrentY = 0;
		if (0 == class58.componentType * -1579470857)
		    Class224.method4499(class58s, class58, bool, (byte) 1);
	    }
	}
    }
}
