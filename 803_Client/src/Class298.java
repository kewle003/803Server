/* Class298 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class298 implements Interface19
{
    Class221 this$0;
    
    public byte[] method120(int i) {
	return ((Class221) ((Class298) this).this$0).anInterface52_2585
		   .method375(i, 317474291);
    }
    
    Class298(Class221 class221) {
	((Class298) this).this$0 = class221;
    }
    
    public byte[] method118(int i) {
	return ((Class221) ((Class298) this).this$0).anInterface52_2585
		   .method375(i, 317474291);
    }
    
    public byte[] method121(int i, byte i_0_) {
	return ((Class221) ((Class298) this).this$0).anInterface52_2585
		   .method375(i, 317474291);
    }
    
    public byte[] method119(int i) {
	return ((Class221) ((Class298) this).this$0).anInterface52_2585
		   .method375(i, 317474291);
    }
    
    static final void storeVar/*method5731*/(ClientScriptData scriptData, int i) {
		VarType varType = (VarType) scriptData.script
				.objectConstants[scriptData.step * 1938982693];
		VarDomain varDomain = (VarDomain) (
				scriptData.integerConstants[1938982693 * scriptData.step] == 0
				? scriptData.aMap6241.get(varType.domain)
				: scriptData.aMap6238.get(varType.domain));
		BaseVarType baseVarType = varType.dataType.getVarBaseType(-570738839);
		if (baseVarType == BaseVarType.INTEGER) {
			scriptData.integerStack[((scriptData.intStackPointer += 1736754263) * 1482319719 - 1)]
					= varDomain.getVarValueInt(varType, -1275777795);
		} else if (baseVarType == BaseVarType.LONG) {
			scriptData.longStack[((scriptData.anInt6231 += 710535117) * -735224571 - 1)]
					= varDomain.getVarValueLong(varType, (byte) 71);
		} else if (baseVarType == BaseVarType.STRING) {
		    try {
				String value = (String) varDomain.getVarValue(varType, 2091984975);
				if (null == value) {
					value = "null";
				}
				scriptData.objectStack[((scriptData.objectStackPointer += -1650705371) * -290357331) - 1]
				    = value;
		    } catch (Exception exception) {
		    	throw new RuntimeException(exception);
		    } 
		} else {
		    throw new RuntimeException();
		}
    }
    
    static final void method5732(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, byte i) {
	class58.modelType = -969674643;
	class58.anInt879
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       * 2003393911);
	WorldType.refreshComponent(class58, -109317743);
	if (-1 == class58.slot1 * -389932081 && !class35.aBool374)
	    Class120_Sub7.method16774(class58.componentHash * 445907013,
				      1880758693);
    }
    
    static final void method5733(ClientScriptData class454, int i) {
	if (-1699772257 * client.anInt8508 >= 5
	    && -1699772257 * client.anInt8508 <= 9)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 1;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
    }
    
    static final void method5734(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_1_ & -1 - (1 << i_2_);
    }
    
    static final void method5735(int i, int i_3_, byte i_4_) {
	if (Class54.method1301(i, null, (byte) 77))
	    Class318.method5918(Class187.aClass35Array2203[i].components,
				i_3_, 542742959);
    }
    
    public static boolean method5736(int i, int i_5_) {
	return i == 0 || 1 == i || 2 == i;
    }
}
