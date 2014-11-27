/* Class135 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class135
{
    Class135() {
	/* empty */
    }
    
    static final void method3100(ClientScriptData class454, int i) {
		int i_0_ = (((ClientScriptData) class454).integerConstants
			    [((ClientScriptData) class454).step * 1938982693]);
		((ClientScriptData) class454).intStackPointer -= -821458770;
		int i_1_ = (((ClientScriptData) class454).integerStack
			    [((ClientScriptData) class454).intStackPointer * 1482319719]);
		if (i_1_ < 0 || i_1_ >= ((ClientScriptData) class454).anIntArray6219[i_0_])
		    throw new RuntimeException();
		((ClientScriptData) class454).anIntArrayArray6220[i_0_][i_1_]
		    = (((ClientScriptData) class454).integerStack
		       [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
    }
    
    static final void method3101(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, byte i) {
	int i_2_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	ParamType class603
	    = Class621.paramTypeList.list(i_2_, 509765855);
	if (!class603.defaultstr.equals(string))
	    class58.method1522(i_2_, string, -584095017);
	else
	    class58.method1523(i_2_, -16771433);
    }
    
    static final void method3102(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.anInt8296;
    }
    
    static final void method3103(ClientScriptData class454, int i) {
	Class411 class411 = Class361_Sub1.method16757(242765317);
	String string = Class241_Sub9.method14935((byte) 0);
	if (string == null)
	    string = "";
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class411.getId((byte) 0);
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = string;
    }
    
    public static String method3104(byte[] is, int i) {
	return Class95.getMessageFromBytes(is, 0, is.length, -949072930);
    }
}
