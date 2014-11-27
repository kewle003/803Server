/* Class218_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class218_Sub3 extends VarDomainType
{
    public static Class491 aClass491_10256;
    
    Object method4365(VarType class179) {
	if (ScriptVarType.BOOLEAN == class179.dataType)
	    return Integer.valueOf(-1);
	return class179.dataType.getDefaultValue((byte) 85);
    }
    
    Class218_Sub3(Js5ConfigGroup class37, int i, boolean bool, boolean bool_0_) {
	super(class37, i, bool, bool_0_);
    }
    
    Object method4364(VarType class179, byte i) {
	if (ScriptVarType.BOOLEAN == class179.dataType)
	    return Integer.valueOf(-1);
	return class179.dataType.getDefaultValue((byte) 51);
    }
    
    Object method4371(VarType class179) {
	if (ScriptVarType.BOOLEAN == class179.dataType)
	    return Integer.valueOf(-1);
	return class179.dataType.getDefaultValue((byte) 98);
    }
    
    Object method4368(VarType class179) {
	if (ScriptVarType.BOOLEAN == class179.dataType)
	    return Integer.valueOf(-1);
	return class179.dataType.getDefaultValue((byte) 89);
    }
    
    static final void method16575(int i, byte i_1_) {
	Class218_Sub1.method16527((byte) 36);
	int i_2_
	    = ((((VarPlayerType)
		 Class177.VAR_PLAYER_LIST.list(i, -1790933073))
		.clientCode)
	       * -1297970353);
	if (i_2_ != 0) {
	    int i_3_
		= Class1.aClass19_11.getVarValueInt(Class177
						  .VAR_PLAYER_LIST
						  .list(i, -1801760636),
					      -1149526552);
	    if (i_2_ == 5)
		client.anInt8456 = i_3_ * -1786393527;
	    if (i_2_ == 6)
		client.anInt8277 = 2000266465 * i_3_;
	}
    }
    
    public static InterfaceComponent method16576(int i, int i_4_, byte i_5_) {
		InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i, (byte) -56);
		if (i_4_ == -1)
		    return class58;
		if (null == class58 || null == class58.aClass58Array836
		    || i_4_ >= class58.aClass58Array836.length)
		    return null;
		return class58.aClass58Array836[i_4_];
    }
}
