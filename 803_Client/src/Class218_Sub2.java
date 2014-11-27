/* Class218_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class218_Sub2 extends VarDomainType
{
    Object method4371(VarType class179) {
	if (class179.dataType == ScriptVarType.BOOLEAN)
	    return Integer.valueOf(-1);
	return class179.dataType.getDefaultValue((byte) 105);
    }
    
    Object method4364(VarType class179, byte i) {
		if (class179.dataType == ScriptVarType.BOOLEAN) {
			return Integer.valueOf(-1);
		}
		return class179.dataType.getDefaultValue((byte) 101);
    }
    
    Object method4365(VarType class179) {
	if (class179.dataType == ScriptVarType.BOOLEAN)
	    return Integer.valueOf(-1);
	return class179.dataType.getDefaultValue((byte) 82);
    }
    
    Object method4368(VarType class179) {
	if (class179.dataType == ScriptVarType.BOOLEAN)
	    return Integer.valueOf(-1);
	return class179.dataType.getDefaultValue((byte) 85);
    }
    
    Class218_Sub2(Js5ConfigGroup class37, int i, boolean bool, boolean bool_0_) {
		super(class37, i, bool, bool_0_);
    }
    
    static final void method16568(ClientScriptData class454, int i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub33_8890,
	     ((((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	      == 1) ? 1 : 0,
	     (byte) 2);
	Class167.method3600((short) 9669);
	Class561.method12369(262144);
	Class486.method11126((byte) -4);
	client.aBool8297 = false;
    }
    
    static void method16569(int i, byte i_1_) {
	WorldTile.anInt10183 = -1182123501 * i;
	Class573_Sub1.anInt8794 = -1265261197;
	Class573_Sub1.anInt8794 = -1265261197;
	Class288.method5661(497318259);
    }
    
    static final void method16570(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub4_8850
		  .method14107(-941318582);
    }
}
