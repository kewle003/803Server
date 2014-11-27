/* Class241_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GroundItem extends Node
{
    int itemAmount;//anInt10055
    public int itemID;//anInt10056
    
    GroundItem(int id, int amount) {
		itemID = -387029335 * id;
		itemAmount = -2146208263 * amount;
    }
    
    public static void method16330(Class614 class614, int i, int i_1_,
				   Interface24 interface24, int i_2_) {
	ClientScriptData class454 = Class61.method1608(750416408);
	((ClientScriptData) class454).anInterface24_6237 = interface24;
	Class519.method11667(class614, i, i_1_, class454, -451058272);
	((ClientScriptData) class454).anInterface24_6237 = null;
    }
}
