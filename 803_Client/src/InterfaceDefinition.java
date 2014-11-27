/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class InterfaceDefinition
{
    InterfaceComponent[] aClass58Array372;
    public InterfaceComponent[] components;//aClass58Array373
    public boolean aBool374;
    public static String javaVersion;//aString375
    
    public InterfaceComponent[] method994() {
	if (((InterfaceDefinition) this).aClass58Array372 == null) {
	    int i = components.length;
	    ((InterfaceDefinition) this).aClass58Array372 = new InterfaceComponent[i];
	    System.arraycopy(components, 0,
			     ((InterfaceDefinition) this).aClass58Array372, 0,
			     components.length);
	}
	return ((InterfaceDefinition) this).aClass58Array372;
    }
    
    public InterfaceComponent[] method995(int i) {
	return (((InterfaceDefinition) this).aClass58Array372 == null ? components
		: ((InterfaceDefinition) this).aClass58Array372);
    }
    
    public InterfaceComponent method996(int i) {
	if (components[0].componentHash * 445907013 >>> 16 != i >>> 16)
	    throw new IllegalArgumentException();
	return components[i & 0xffff];
    }
    
    public InterfaceComponent method997(int iFaceHash, int i_0_) {
		if (components[0].componentHash * 445907013 >>> 16 != iFaceHash >>> 16) {
		    throw new IllegalArgumentException();
		}
		return components[iFaceHash & 0xffff];
    }
    
    public InterfaceComponent[] method998() {
	return (((InterfaceDefinition) this).aClass58Array372 == null ? components
		: ((InterfaceDefinition) this).aClass58Array372);
    }
    
    public InterfaceComponent[] method999() {
	if (((InterfaceDefinition) this).aClass58Array372 == null) {
	    int i = components.length;
	    ((InterfaceDefinition) this).aClass58Array372 = new InterfaceComponent[i];
	    System.arraycopy(components, 0,
			     ((InterfaceDefinition) this).aClass58Array372, 0,
			     components.length);
	}
	return ((InterfaceDefinition) this).aClass58Array372;
    }
    
    public InterfaceComponent[] method1000(int i) {
	if (((InterfaceDefinition) this).aClass58Array372 == null) {
	    int i_1_ = components.length;
	    ((InterfaceDefinition) this).aClass58Array372 = new InterfaceComponent[i_1_];
	    System.arraycopy(components, 0,
			     ((InterfaceDefinition) this).aClass58Array372, 0,
			     components.length);
	}
	return ((InterfaceDefinition) this).aClass58Array372;
    }
    
    InterfaceDefinition(boolean bool, InterfaceComponent[] class58s) {
		components = class58s;
		aBool374 = bool;
    }
    
    static final void method1001(ClientScriptData class454, byte i) {
	int i_2_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_2_, (byte) -96);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_2_ >> 16];
	Class120_Sub5.method16769(class58, class35, class454, -2042241150);
    }
}
