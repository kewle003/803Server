/* Class218_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class218_Sub4 extends VarDomainType
{
    Object method4365(VarType class179) {
	if (class179.dataType == ScriptVarType.BOOLEAN)
	    return Integer.valueOf(-1);
	return class179.dataType.getDefaultValue((byte) 73);
    }
    
    Object method4364(VarType class179, byte i) {
	if (class179.dataType == ScriptVarType.BOOLEAN)
	    return Integer.valueOf(-1);
	return class179.dataType.getDefaultValue((byte) 93);
    }
    
    Class218_Sub4(Js5ConfigGroup class37, int i, boolean bool, boolean bool_0_) {
	super(class37, i, bool, bool_0_);
    }
    
    Object method4371(VarType class179) {
	if (class179.dataType == ScriptVarType.BOOLEAN)
	    return Integer.valueOf(-1);
	return class179.dataType.getDefaultValue((byte) 125);
    }
    
    Object method4368(VarType class179) {
	if (class179.dataType == ScriptVarType.BOOLEAN)
	    return Integer.valueOf(-1);
	return class179.dataType.getDefaultValue((byte) 92);
    }
    
    static final void method16596(ClientScriptData class454, int i) {
		int i_1_
		    = (((ClientScriptData) class454).integerStack
		       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
		InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_1_, (byte) -109);
		InterfaceDefinition class35 = Class187.aClass35Array2203[i_1_ >> 16];
		ClientScriptMap.method7286(class58, class35, class454, (byte) 30);
    }
}
