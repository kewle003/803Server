/* Class218_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class218_Sub5 extends VarDomainType
{
    public static JS5 INTERFACES_ARCHIVE;//aClass210_10414
    
    Object method4365(VarType class179) {
	if (class179.dataType == ScriptVarType.INT
	    || class179.dataType == ScriptVarType.BOOLEAN)
	    return Integer.valueOf(-1);
	return class179.dataType.getDefaultValue((byte) 53);
    }
    
    Object method4364(VarType class179, byte i) {
	if (class179.dataType == ScriptVarType.INT
	    || class179.dataType == ScriptVarType.BOOLEAN)
	    return Integer.valueOf(-1);
	return class179.dataType.getDefaultValue((byte) 91);
    }
    
    Class218_Sub5(Js5ConfigGroup class37, int i, boolean bool, boolean bool_0_) {
	super(class37, i, bool, bool_0_);
    }
    
    Object method4371(VarType class179) {
	if (class179.dataType == ScriptVarType.INT
	    || class179.dataType == ScriptVarType.BOOLEAN)
	    return Integer.valueOf(-1);
	return class179.dataType.getDefaultValue((byte) 50);
    }
    
    Object method4368(VarType class179) {
	if (class179.dataType == ScriptVarType.INT
	    || class179.dataType == ScriptVarType.BOOLEAN)
	    return Integer.valueOf(-1);
	return class179.dataType.getDefaultValue((byte) 127);
    }
    
    static final void method16723(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 1463495207 * class58.scrollMinY;
    }
}
