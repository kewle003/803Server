/* Class458 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class458
{
    static Class458 aClass458_6257;
    public static Class458 aClass458_6258;
    static Class458 aClass458_6259 = new Class458();
    static boolean[][] aBoolArrayArray6260;
    
    Class458() {
	/* empty */
    }
    
    static {
	aClass458_6258 = new Class458();
	aClass458_6257 = new Class458();
    }
    
    static final void method10596(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub27_8867
		  .method14362((byte) 13) == 2 ? 1 : 0;
    }
    
    static final void method10597(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -5);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class58.anInt882 * -516485199;
    }
    
    static final void setCompMenuCursor/*method10598*/(ClientScriptData class454, byte i) {
		int i_1_ = (((ClientScriptData) class454).integerStack
		       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
		InterfaceComponent component = Js5ConfigGroup.getInterfaceComponent(i_1_, (byte) -36);
		InterfaceDefinition class35 = Class187.aClass35Array2203[i_1_ >> 16];
		Class542.setComponentCursor(component, class35, class454, 23966685);
    }
}
