/* Class453 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class WorldType implements Interface47
{
    public static WorldType FREE = new WorldType(0, "");//aClass453_6213
    public static WorldType MEMBERS = new WorldType(1, "");//aClass453_6214
    int anInt6215;
    
    public int getId(byte i) {
    	return anInt6215 * 1002950621;
    }
    
    public int method147() {
	return anInt6215 * 1002950621;
    }
    
    public int method9() {
	return anInt6215 * 1002950621;
    }
    
    public int method10() {
	return anInt6215 * 1002950621;
    }
    
    public int method11() {
	return anInt6215 * 1002950621;
    }
    
    WorldType(int i, String string) {
	anInt6215 = i * 1619394677;
    }
    
    static final void method10547(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, byte i) {
	class58.modelType = -553405919;
	class58.anInt879 = client.myPlayerIndex * -1814056849;
	class58.anInt880 = 0;
	if (-389932081 * class58.slot1 == -1 && !class35.aBool374)
	    Class120_Sub7.method16774(445907013 * class58.componentHash, 495861955);
    }
    
    public static void method10548(Class103 class103, long l) {
	Class487.anInt6477 = Class487.anInt6470 * -1226220859;
	Class487.anInt6470 = 0;
	Class50.method1249((byte) 1);
	Iterator iterator = Class487.aList6475.iterator();
	while (iterator.hasNext()) {
	    Class489 class489 = (Class489) iterator.next();
	    boolean bool = class489.method11156(class103, l);
	    if (!bool) {
		iterator.remove();
		Class42.aClass489Array602[Class487.anInt6472 * 741457535]
		    = class489;
		Class487.anInt6472
		    = (1 + 741457535 * Class487.anInt6472
		       & (Class90.anIntArray1300
			  [Class487.anInt6480 * 275753719])) * 2087453055;
	    }
	}
    }
    
    static final void method10549(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = ClientScriptCaller.anInt8978 * -2135626763;
    }
    
    public static void refreshComponent/*method10550*/(InterfaceComponent component, int i) {
		if (-400059253 * component.anInt1011 == client.anInt8522 * 983685959) {
		    client.aBoolArray8523[-2057625155 * component.anInt1010] = true;
		}
    }
    
    static final void setVar/*method10551*/(ClientScriptData scriptData, int i) {
		VarType varType = (VarType) scriptData.script.objectConstants[1938982693 * scriptData.step];
		VarDomain varDomain = (VarDomain) (
				0 == scriptData.integerConstants[1938982693 * scriptData.step]
				? scriptData.aMap6241.get(varType.domain)
				: scriptData.aMap6238.get(varType.domain));
		BaseVarType baseVarType = varType.dataType.getVarBaseType(509882535);
		if (baseVarType == BaseVarType.INTEGER) {
		    if (varType.domain == VarDomainType.CLIENT) {
		    	Class10.method581(varType, -599268377);
		    }
		    varDomain.setVarValueInt(varType,
					 scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719],
					 113907279);
		} else if (BaseVarType.LONG == baseVarType) {
			varDomain.setVarValueLong(varType,
					 scriptData.longStack[(scriptData.anInt6231 -= 710535117) * -735224571]);
		} else if (baseVarType == BaseVarType.STRING) {
		    if (VarDomainType.CLIENT == varType.domain) {
		    	CsDeltaNode.method14873(varType, -1602909435);
		    }
		    varDomain.setVarValue(varType,
					 scriptData.objectStack[(scriptData.objectStackPointer -= -1650705371) * -290357331],
					 (byte) 8);
		} else {
		    throw new RuntimeException();
		}
    }
}
