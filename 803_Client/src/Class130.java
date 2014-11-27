/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class130
{
    static Class130 aClass130_1595;
    static Class130 aClass130_1596;
    public static Class130 aClass130_1597 = new Class130(0);
    static Class130 aClass130_1598;
    static Class130 aClass130_1599;
    static Class130 aClass130_1600;
    int anInt1601;
    static Class130 aClass130_1602;
    public static Class130 aClass130_1603;
    static Class130 aClass130_1604;
    static Class130 aClass130_1605;
    
    Class130(int i) {
	((Class130) this).anInt1601 = 798884131 * i;
    }
    
    public int method3067(int i) {
	return 0x2000000 | -962054517 * ((Class130) this).anInt1601;
    }
    
    static {
	aClass130_1596 = new Class130(2);
	aClass130_1603 = new Class130(7);
	aClass130_1598 = new Class130(6);
	aClass130_1605 = new Class130(3);
	aClass130_1600 = new Class130(4);
	aClass130_1599 = new Class130(5);
	aClass130_1602 = new Class130(1);
	aClass130_1595 = new Class130(9);
	aClass130_1604 = new Class130(8);
    }
    
    static void method3068(int i) {
	Class194.anInt2311 = 0;
	Class194.anInt2299 = -472227899;
	Class194.minimapFlagX = 980260023;
	Class194.minimapFlagY = 1262506991;
    }
    
    static final void method3069(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -50);
	Class90.method2061(class58, class454, (short) -6945);
    }
    
    static final void method3070(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub9_8883
		  .method14178(1043690291);
    }
    
    static final void method3071(ClientScriptData class454, int i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_1_ >> 14 & 0x3fff;
    }
    
    static int method3072
	(NPC class475_sub1_sub1_sub3_sub2, int i) {
	NPCDefinition class401 = class475_sub1_sub1_sub3_sub2.definition;
	if (null != class401.transformTo) {
	    class401 = class401.method7176(Class1.aClass19_11,
					   Class1.aClass19_11, (byte) 18);
	    if (class401 == null)
		return -1;
	}
	int i_2_ = -97900731 * class401.anInt5808;
	Class554 class554
	    = class475_sub1_sub1_sub3_sub2.method17787(-1427547671);
	int i_3_ = class475_sub1_sub1_sub3_sub2.aClass409_Sub1_11405
		       .method7346(-1834935282);
	if (-1 == i_3_
	    || class475_sub1_sub1_sub3_sub2.aClass409_Sub1_11405.aBool8600)
	    i_2_ = class401.anInt5819 * 1319993127;
	else if (i_3_ == class554.anInt7213 * -1503148783
		 || i_3_ == 1122571643 * class554.anInt7214
		 || -1591850491 * class554.anInt7226 == i_3_
		 || class554.anInt7215 * -526852481 == i_3_)
	    i_2_ = -1561948383 * class401.anInt5858;
	else if (i_3_ == -504629317 * class554.anInt7217
		 || class554.anInt7216 * 62833745 == i_3_
		 || 2130754419 * class554.anInt7220 == i_3_
		 || i_3_ == -216997439 * class554.anInt7212)
	    i_2_ = class401.anInt5852 * -199136369;
	return i_2_;
    }
}
