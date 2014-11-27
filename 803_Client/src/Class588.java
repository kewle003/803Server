/* Class588 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class588 implements Interface57
{
    Class475_Sub1_Sub1_Sub6 aClass475_Sub1_Sub1_Sub6_7594;
    
    Class588(Class475_Sub1_Sub1_Sub6 class475_sub1_sub1_sub6) {
	((Class588) this).aClass475_Sub1_Sub1_Sub6_7594
	    = class475_sub1_sub1_sub6;
    }
    
    public boolean method430(Class475_Sub1_Sub1 class475_sub1_sub1, int i) {
	return (((Class588) this).aClass475_Sub1_Sub1_Sub6_7594
		== class475_sub1_sub1);
    }
    
    public boolean method431(Class475_Sub1_Sub1 class475_sub1_sub1) {
	return (((Class588) this).aClass475_Sub1_Sub1_Sub6_7594
		== class475_sub1_sub1);
    }
    
    public boolean method432(Class475_Sub1_Sub1 class475_sub1_sub1) {
	return (((Class588) this).aClass475_Sub1_Sub1_Sub6_7594
		== class475_sub1_sub1);
    }
    
    public static void method12865
	(Class614 class614, int i, int i_0_,
	 Entity class475_sub1_sub1_sub3, int i_1_, int i_2_) {
	ClientScriptData class454 = Class61.method1608(1608245260);
	((ClientScriptData) class454).varEntity
	    = class475_sub1_sub1_sub3;
	((ClientScriptData) class454).anInt6218 = -1609666839 * i_1_;
	Class519.method11667(class614, i, i_0_, class454, -1023345986);
	((ClientScriptData) class454).varEntity = null;
	((ClientScriptData) class454).anInt6218 = 1609666839;
    }
    
    static final void method12866(ClientScriptData class454, byte i) {
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_3_ >> 28;
    }
}
