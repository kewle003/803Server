/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class79
{
    public int anInt1135;
    public int anInt1136;
    public int anInt1137;
    public static Class539 aClass539_1138;
    
    static final void method1786(ClientScriptData class454, byte i) {
	int i_0_ = (((ClientScriptData) class454).integerConstants
		    [((ClientScriptData) class454).step * 1938982693]);
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (i_1_ < 0 || i_1_ >= ((ClientScriptData) class454).anIntArray6219[i_0_])
	    throw new RuntimeException();
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = ((ClientScriptData) class454).anIntArrayArray6220[i_0_][i_1_];
    }
    
    static Class431[] method1787(int i) {
	return (new Class431[]
		{ Class431.aClass431_6096, Class431.aClass431_6097,
		  Class431.aClass431_6098, Class431.aClass431_6095,
		  Class431.aClass431_6094 });
    }
}
