/* Class247_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class247_Sub3 extends Class247
{
    short aShort10080;
    String aString10081;
    int anInt10082
	= (int) (Class50.method1249((byte) 1) / 1000L) * -1462396549;
    
    Class247_Sub3(String string, int i) {
	((Class247_Sub3) this).aString10081 = string;
	((Class247_Sub3) this).aShort10080 = (short) i;
    }
    
    static final void method16342(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -52);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_0_ >> 16];
	VarTransmitLevel.method5826(class58, class35, class454, -1938660922);
    }
    
    static final void method16343(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class104.method2650(class58, class35, class454, -1685453665);
    }
}
