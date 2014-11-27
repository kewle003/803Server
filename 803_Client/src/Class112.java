/* Class112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class112
{
    static Class112 aClass112_1514;
    static Class112 aClass112_1515;
    static Class112 aClass112_1516 = new Class112();
    static Class112 aClass112_1517;
    static Class112 aClass112_1518;
    static Class112 aClass112_1519;
    static Class112 aClass112_1520;
    static Class112 aClass112_1521;
    public static Class112 aClass112_1522;
    public static Class112 aClass112_1523;
    static Class112 aClass112_1524;
    static Class112 aClass112_1525;
    static Class112 aClass112_1526 = new Class112();
    public static JS5 aClass210_1527;
    
    Class112() {
	/* empty */
    }
    
    static {
	aClass112_1514 = new Class112();
	aClass112_1517 = new Class112();
	aClass112_1515 = new Class112();
	aClass112_1519 = new Class112();
	aClass112_1520 = new Class112();
	aClass112_1521 = new Class112();
	aClass112_1522 = new Class112();
	aClass112_1523 = new Class112();
	aClass112_1524 = new Class112();
	aClass112_1525 = new Class112();
	aClass112_1518 = new Class112();
    }
    
    static final void method2776(ClientScriptData class454, int i) {
	Class241_Sub16 class241_sub16
	    = (Class241_Sub16) (((ClientScriptData) class454).objectStack
				[(((ClientScriptData) class454).objectStackPointer
				  -= -1650705371) * -290357331]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 666561047 * class241_sub16.anInt8983;
    }
    
    static final void method2777(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -727622047;
	int i_0_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_1_ = ((((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719 + 1])
		    << 1);
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719 + 2]);
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719 + 3]);
	int i_4_ = (((ClientScriptData) class454).integerStack
		    [4 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_5_ = (((ClientScriptData) class454).integerStack
		    [5 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_6_ = (((ClientScriptData) class454).integerStack
		    [6 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	if (i_0_ >= 0 && i_0_ < 2
	    && null != client.anIntArrayArrayArray8405[i_0_] && i_1_ >= 0
	    && i_1_ < client.anIntArrayArrayArray8405[i_0_].length) {
	    client.anIntArrayArrayArray8405[i_0_][i_1_]
		= new int[] { (i_2_ >> 14 & 0x3fff) << 9, i_3_ << 2,
			      (i_2_ & 0x3fff) << 9, i_6_ };
	    client.anIntArrayArrayArray8405[i_0_][i_1_ + 1]
		= new int[] { (i_4_ >> 14 & 0x3fff) << 9, i_5_ << 2,
			      (i_4_ & 0x3fff) << 9 };
	}
    }
    
    public static Class507_Sub1 method2778(int i) {
	Class395.anInt5772 = 0;
	return Class164.method3536(205381025);
    }
    
    static Class83[] method2779(int i) {
	return new Class83[] { Class83.aClass83_1155, Class83.aClass83_1153,
			       Class83.aClass83_1154 };
    }
    
    static boolean method2780(Interface24 interface24, ObjectDefinitionLoader class532,
			      int i, int i_7_, int i_8_) {
	if (null == interface24)
	    return false;
	ObjectDefinition class526
	    = class532.getObjectDefinition(interface24.method146((byte) 0), 577892407);
	if (class526.membersObject && !client.isP2pWorld)
	    return false;
	int i_9_ = class526.mapSpriteID * 8166631;
	if (class526.toObjectIDs != null) {
	    for (int i_10_ = 0; i_10_ < class526.toObjectIDs.length;
		 i_10_++) {
		if (-1 != class526.toObjectIDs[i_10_]) {
		    ObjectDefinition class526_11_
			= class532.getObjectDefinition(class526.toObjectIDs[i_10_],
					       577892407);
		    if (8166631 * class526_11_.mapSpriteID >= 0)
			i_9_ = class526_11_.mapSpriteID * 8166631;
		}
	    }
	}
	if (i_9_ >= 0) {
	    Class194.anIntArray2306[Class194.anInt2303 * -1037886889]
		= -2079513015 * class526.objectID;
	    Class194.anIntArray2304[-1037886889 * Class194.anInt2303] = i;
	    Class194.anIntArray2313[-1037886889 * Class194.anInt2303] = i_7_;
	    Class194.anInt2303 += -54496921;
	    return true;
	}
	return false;
    }
}
