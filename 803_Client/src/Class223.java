/* Class223 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class223
{
    public static Class223 aClass223_2593;
    public static Class223 aClass223_2594;
    public static Class223 aClass223_2595;
    public static Class223 aClass223_2596;
    public static Class223 aClass223_2597;
    public static Class223 aClass223_2598;
    static Class223 aClass223_2599 = new Class223(0);
    public static Class223 aClass223_2600;
    static Class223 aClass223_2601;
    public static Class223 aClass223_2602;
    public int anInt2603;
    public static JS5 GRAPHIC_CONFIG_ARCHIVE;//aClass210_2604
    
    Class223(int i) {
	anInt2603 = 91555587 * i;
    }
    
    static {
	aClass223_2594 = new Class223(1);
	aClass223_2595 = new Class223(2);
	aClass223_2593 = new Class223(3);
	aClass223_2597 = new Class223(4);
	aClass223_2598 = new Class223(5);
	aClass223_2596 = new Class223(6);
	aClass223_2600 = new Class223(7);
	aClass223_2601 = new Class223(8);
	aClass223_2602 = new Class223(9);
    }
    
    static void method4490(Interface56 interface56, int i) {
		while (Class551.aLinkedList7121.size() > 10)
		    Class551.aLinkedList7121.remove();
		Class551.aLinkedList7121.add(interface56);
    }
    
    static final void method4491(ClientScriptData scriptData, byte i) {
		InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent((scriptData.integerStack[(scriptData.intStackPointer  -= 1736754263) * 1482319719]),
					 (byte) -92);
		class58.aClass58Array836 = null;
		class58.aClass58Array1000 = null;
		WorldType.refreshComponent(class58, 1310134395);
    }
    
    static final void method4492(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class44.method1102(class58, class35, class454, 1127287627);
    }
    
    static final void method4493(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_0_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_1_ = ((((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719 + 1])
		    - 1);
	ItemDefinition class623
	    = JS5.itemDefLoader.list(i_0_, (short) -4564);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class623.method13381(i_1_, 1287546083);
    }
}
