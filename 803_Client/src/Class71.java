/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class71
{
    public static Class71 aClass71_1088 = new Class71(0, 104);
    static Class71 aClass71_1089 = new Class71(1, 120);
    static Class71 aClass71_1090 = new Class71(2, 136);
    static Class71 aClass71_1091;
    static Class71 aClass71_1092 = new Class71(3, 168);
    public int anInt1093;
    public int anInt1094;
    
    public static Class71 method1732(int i) {
	Class71[] class71s = Class241_Sub2.method14415(1227256912);
	for (int i_0_ = 0; i_0_ < class71s.length; i_0_++) {
	    Class71 class71 = class71s[i_0_];
	    if (i == class71.anInt1093 * -915921191)
		return class71;
	}
	return null;
    }
    
    Class71(int i, int i_1_) {
	anInt1093 = i * -1055393431;
	anInt1094 = i_1_ * 780426859;
    }
    
    static Class71[] method1733() {
	return new Class71[] { aClass71_1088, aClass71_1091, aClass71_1089,
			       aClass71_1090, aClass71_1092 };
    }
    
    static Class71[] method1734() {
	return new Class71[] { aClass71_1088, aClass71_1091, aClass71_1089,
			       aClass71_1090, aClass71_1092 };
    }
    
    static Class71[] method1735() {
	return new Class71[] { aClass71_1088, aClass71_1091, aClass71_1089,
			       aClass71_1090, aClass71_1092 };
    }
    
    static {
	aClass71_1091 = new Class71(4, 72);
    }
    
    public static Class71 method1736(int i) {
	Class71[] class71s = Class241_Sub2.method14415(-1563008181);
	for (int i_2_ = 0; i_2_ < class71s.length; i_2_++) {
	    Class71 class71 = class71s[i_2_];
	    if (i == class71.anInt1093 * -915921191)
		return class71;
	}
	return null;
    }
    
    static void method1737(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [1482319719 * ((ClientScriptData) class454).intStackPointer - 1]
	    = Class326_Sub3.aClass482_10288.method11010
		  ((((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer - 1]),
		   (short) -5433)
		  .method10961(Class1.aClass19_11, 1378450207) ? 1 : 0;
    }
    
    static final void method1738(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_4_ = (((ClientScriptData) class454).integerStack
		    [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_5_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719 + 2]);
	Class581.processActionButton(10, i_3_ << 16 | i_4_, i_5_, "", 551006400);
    }
}
