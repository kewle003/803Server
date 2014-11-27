/* Class235 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class MapType
{
    static MapType aClass235_2700;
    public static MapType aClass235_2701;
    public static MapType STATIC_MAP;//aClass235_2702
    public static MapType aClass235_2703;
    public static MapType aClass235_2704 = new MapType(false, false);
    static MapType aClass235_2705;
    static MapType aClass235_2706;
    public static MapType aClass235_2707;
    boolean allowDynamicMap;//aBool2708
    boolean aBool2709;
    
    boolean allowDynamicMapScene/*method4697*/(int i) {
    	return allowDynamicMap;
    }
    
    public boolean method4698(int i) {
    	return aBool2709;
    }
    
    MapType(boolean bool, boolean bool_0_) {
		allowDynamicMap = bool;
		aBool2709 = bool_0_;
    }
    
    static {
		aClass235_2701 = new MapType(true, false);
		STATIC_MAP = new MapType(false, false);
		aClass235_2703 = new MapType(true, false);
		aClass235_2700 = new MapType(true, false);
		aClass235_2705 = new MapType(true, true);
		aClass235_2706 = new MapType(true, true);
		aClass235_2707 = new MapType(false, false);
    }
    
    boolean method4699() {
	return allowDynamicMap;
    }
    
    boolean method4700() {
	return allowDynamicMap;
    }
    
    static final void method4701(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	Class504.aShortArray6634[(((ClientScriptData) class454).integerStack
				  [(((ClientScriptData) class454).intStackPointer
				    * 1482319719)])]
	    = (short) VarPlayerDomain.method11651((((ClientScriptData) class454)
					    .integerStack
					    [(((ClientScriptData) class454).intStackPointer
					      * 1482319719) + 1]),
					   (byte) 33);
	JS5.itemDefLoader.method13288(-1310638449);
	JS5.itemDefLoader.method13307(182691866);
	MasterIndex.npcDefLoader.method7230((short) 525);
	Class69.method1683((byte) 14);
    }
}
