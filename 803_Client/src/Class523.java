/* Class523 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class523 implements Interface47
{
    static Class523 aClass523_6809;
    static Class523 aClass523_6810;
    static Class523 aClass523_6811;
    static Class523 aClass523_6812;
    static Class523 aClass523_6813;
    int anInt6814;
    static Class523 aClass523_6815 = new Class523(0);
    
    public int method11() {
	return ((Class523) this).anInt6814 * 275746923;
    }
    
    public int getId(byte i) {
	return ((Class523) this).anInt6814 * 275746923;
    }
    
    static {
	aClass523_6809 = new Class523(1);
	aClass523_6811 = new Class523(2);
	aClass523_6812 = new Class523(3);
	aClass523_6813 = new Class523(4);
	aClass523_6810 = new Class523(5);
    }
    
    public int method9() {
	return ((Class523) this).anInt6814 * 275746923;
    }
    
    public int method10() {
	return ((Class523) this).anInt6814 * 275746923;
    }
    
    public static Class523[] method11724() {
	return (new Class523[]
		{ aClass523_6810, aClass523_6813, aClass523_6811,
		  aClass523_6809, aClass523_6815, aClass523_6812 });
    }
    
    Class523(int i) {
	((Class523) this).anInt6814 = i * 660905027;
    }
    
    public static Class523[] method11725() {
	return (new Class523[]
		{ aClass523_6810, aClass523_6813, aClass523_6811,
		  aClass523_6809, aClass523_6815, aClass523_6812 });
    }
    
    public static Class523[] method11726() {
	return (new Class523[]
		{ aClass523_6810, aClass523_6813, aClass523_6811,
		  aClass523_6809, aClass523_6815, aClass523_6812 });
    }
    
    public int method147() {
	return ((Class523) this).anInt6814 * 275746923;
    }
    
    public static Class523[] method11727() {
	return (new Class523[]
		{ aClass523_6810, aClass523_6813, aClass523_6811,
		  aClass523_6809, aClass523_6815, aClass523_6812 });
    }
    
    static final void setVarcompShadow/*method11728*/(ClientScriptData scriptData, byte i) {
		Class455 class455 = (scriptData.aBool6246 ? scriptData.aClass455_6230 : scriptData.aClass455_6229);
		InterfaceComponent component = ((Class455) class455).aClass58_6248;
		InterfaceDefinition iFace = ((Class455) class455).aClass35_6249;
		Class134.setComponentShadow(component, iFace, scriptData, -1889150330);
    }
    
    static final void method11729(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub19_8882
		  .method14274(-1419197041);
    }
    
    static final void method11730(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_0_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	boolean bool = ((((ClientScriptData) class454).integerStack
			 [((ClientScriptData) class454).intStackPointer * 1482319719 + 1])
			== 1);
	if (i_0_ == 0)
	    Class573_Sub1.aBool8772 = bool;
	else if (i_0_ == 1)
	    Class573_Sub1.aBool8791 = bool;
	else if (2 == i_0_)
	    Class573_Sub1.aBool8792 = bool;
	else
	    throw new RuntimeException();
    }
    
    static final void method11731(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	Class46.method1127(class58, class454, 1296982120);
    }
    
    static void method11732(Class103 class103, int i) {
	if (Class16.aBool141)
	    Class546.method11992(class103, 325013498);
	else
	    Class455.method10568(class103, -174391449);
    }
    
    public static boolean method11733(int i, int i_1_) {
    	return i == 2 || i == 1 || i == 16 || 14 == i;
    }
}
