/* Class525 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class525
{
    int anInt6823;
    static Class525 aClass525_6824;
    static Class525 aClass525_6825;
    static Class525 aClass525_6826 = new Class525(0);
    
    static Class525 method11751(int i) {
	Class525[] class525s = Class105_Sub2.method15601(-1695436984);
	for (int i_0_ = 0; i_0_ < class525s.length; i_0_++) {
	    Class525 class525 = class525s[i_0_];
	    if (287537157 * ((Class525) class525).anInt6823 == i)
		return class525;
	}
	return null;
    }
    
    static {
	aClass525_6824 = new Class525(1);
	aClass525_6825 = new Class525(2);
    }
    
    static Class525[] method11752() {
	return (new Class525[]
		{ aClass525_6826, aClass525_6824, aClass525_6825 });
    }
    
    static Class525[] method11753() {
	return (new Class525[]
		{ aClass525_6826, aClass525_6824, aClass525_6825 });
    }
    
    Class525(int i) {
	((Class525) this).anInt6823 = 608081101 * i;
    }
    
    static Class525 method11754(int i) {
	Class525[] class525s = Class105_Sub2.method15601(-1984971152);
	for (int i_1_ = 0; i_1_ < class525s.length; i_1_++) {
	    Class525 class525 = class525s[i_1_];
	    if (287537157 * ((Class525) class525).anInt6823 == i)
		return class525;
	}
	return null;
    }
    
    static final void method11755(InterfaceComponent class58, ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_2_ = ((((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719])
		    - 1);
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	int i_4_ = (((ClientScriptData) class454).integerStack
		    [2 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	if (i_2_ < 0 || i_2_ > 9)
	    throw new RuntimeException();
	Class70.method1727(class58, i_2_, i_3_, i_4_, class454, -92065542);
    }
    
    static final void method11756(ClientScriptData class454, int i) {
	int i_5_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (JS5.itemDefLoader.list(i_5_, (short) 44).stackable
	       * -942978965) == 1 ? 1 : 0;
    }
    
    static void method11757(Class103 class103, NodeCollection class429, int i,
			    int i_6_, int i_7_) {
	Class120_Sub23.aClass429_10631.method7652((byte) 115);
	if (!Class573_Sub1.aBool8786) {
	    for (Class241_Sub41 class241_sub41
		     = (Class241_Sub41) class429.method7694(16711935);
		 null != class241_sub41;
		 class241_sub41
		     = (Class241_Sub41) class429.method7692(53829012)) {
		Class515 class515
		    = Class573_Sub1.aClass524_7370.method11745(((class241_sub41
								 .anInt10158)
								* -1454932011),
							       -771121109);
		if (Class241_Sub16.method15018(class515, -1503563297)) {
		    boolean bool
			= Class449.method7936(class103, class241_sub41,
					      class515, i, i_6_, (byte) 0);
		    if (bool)
			Class576.method12670(class103, class241_sub41,
					     class515, (short) -11808);
		}
	    }
	}
    }
    
    static final void method11758(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = ((null
		!= Class21.myPlayer.aClass490_11499)
	       && (Class21.myPlayer.aClass490_11499
		   .aBool6507)) ? 1 : 0;
    }
}
