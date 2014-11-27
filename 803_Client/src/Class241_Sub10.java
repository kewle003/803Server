/* Class241_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub10 extends Node
{
    boolean aBool8895;
    Class583_Sub1 aClass583_Sub1_8896;
    int anInt8897;
    boolean aBool8898;
    int anInt8899;
    boolean aBool8900;
    boolean aBool8901;
    
    Class241_Sub10(int i, Class583_Sub1 class583_sub1, int i_0_,
		   boolean bool) {
	((Class241_Sub10) this).anInt8899 = -2091471659 * i;
	((Class241_Sub10) this).aClass583_Sub1_8896 = class583_sub1;
	((Class241_Sub10) this).anInt8897 = -1106147545 * i_0_;
	((Class241_Sub10) this).aBool8895 = bool;
    }
    
    static final void method14937(Class475_Sub1 class475_sub1, int i,
				  boolean bool, boolean bool_1_, int i_2_) {
	int i_3_;
	int i_4_;
	if (class475_sub1 instanceof Class475_Sub1_Sub1
	    && class475_sub1 instanceof Interface24) {
	    Class475_Sub1_Sub1 class475_sub1_sub1
		= (Class475_Sub1_Sub1) class475_sub1;
	    int i_5_ = ((class475_sub1_sub1.aShort10716
			 - class475_sub1_sub1.aShort10717 + 1)
			<< 9);
	    int i_6_ = ((class475_sub1_sub1.aShort10719
			 - class475_sub1_sub1.aShort10718 + 1)
			<< 9);
	    i_3_ = i_5_ / 2 + (class475_sub1_sub1.aShort10717 << 9);
	    i_4_ = i_6_ / 2 + (class475_sub1_sub1.aShort10718 << 9);
	} else {
	    Class287 class287 = class475_sub1.method10874().aClass287_4386;
	    i_3_ = (int) class287.aFloat4477;
	    i_4_ = (int) class287.aFloat4479;
	}
	Class123.method2992(class475_sub1.nodePlane, i_3_, i_4_, 0, i, bool,
			    bool_1_, 950503254);
    }
}
