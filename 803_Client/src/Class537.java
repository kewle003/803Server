/* Class537 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class537
{
    public static Class537 aClass537_6990;
    public static Class537 aClass537_6991 = new Class537(0);
    public static Class537 aClass537_6992;
    
    static {
	aClass537_6990 = new Class537(1);
	aClass537_6992 = new Class537(2);
    }
    
    Class537(int i) {
	/* empty */
    }
    
    static final void method11896(ClientScriptData class454, byte i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -10);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = -145726829 * class58.anInt894;
    }
    
    static final void method11897(ClientScriptData class454, int i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_1_, (byte) -8);
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
    
    static final void method11898(ClientScriptData class454, byte i) {
	/* empty */
    }
    
    public static void method11899(int i, int i_2_, int i_3_, boolean bool,
				   int i_4_) {
	client.aLong8428 = 0L;
	int i_5_ = Class474.getDisplayMode(25801054);
	if (3 == i || 3 == i_5_)
	    bool = true;
	if (!Class236.aClass103_2713.method2330())
	    bool = true;
	InterfaceComponent.method1595(i_5_, i, i_2_, i_3_, bool, -1328356096);
    }
    
    static final void method11900(ClientScriptData class454, byte i) {
	int i_6_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (int) (Math.random() * (double) i_6_);
    }
    
    static final void method11901(ClientScriptData class454, byte i) {
	int i_7_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class474.anIntArray6382[i_7_ & 0xffff];
    }
    
    public static void method11902(JS5 class210, int i) {
	Class496.anInt6524
	    = class210.identifierToIndex("hint_headicons", -187631888) * 1420643083;
	Class5.anInt24
	    = class210.identifierToIndex("hint_mapmarkers", -187631888) * -1805723449;
	Class5.anInt18
	    = class210.identifierToIndex("mapflag", -187631888) * 1284150699;
	Class5.anInt20 = class210.identifierToIndex("cross", -187631888) * -922269423;
	Class94.anInt1327
	    = class210.identifierToIndex("mapdots", -187631888) * -1482566701;
	Class5.anInt21
	    = class210.identifierToIndex("name_icons", -187631888) * -2095330129;
	Class47.anInt635
	    = class210.identifierToIndex("floorshadows", -187631888) * 284288791;
	CsDelta_DeleteBan.anInt11056
	    = class210.identifierToIndex("compass", -187631888) * -765952811;
	Class5.anInt22
	    = class210.identifierToIndex("otherlevel", -187631888) * 962340297;
	Class5.anInt23
	    = class210.identifierToIndex("hint_mapedge", -187631888) * -524840195;
    }
}
