/* Class301 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class301
{
    int anInt4608;
    static Class301 aClass301_4609;
    static Class301 aClass301_4610;
    public static Class301 aClass301_4611;
    static Class301 aClass301_4612 = new Class301(0, false);
    static Class301 aClass301_4613;
    static Class301 aClass301_4614;
    static Class301 aClass301_4615;
    static Class301 aClass301_4616;
    static Class301 aClass301_4617;
    public boolean aBool4618;
    
    static {
	aClass301_4611 = new Class301(1, false);
	aClass301_4610 = new Class301(2, false);
	aClass301_4617 = new Class301(3, false);
	aClass301_4609 = new Class301(4, false);
	aClass301_4613 = new Class301(5, true);
	aClass301_4614 = new Class301(6, true);
	aClass301_4615 = new Class301(7, true);
	aClass301_4616 = new Class301(8, true);
    }
    
    Class301(int i, boolean bool) {
	((Class301) this).anInt4608 = -1375312507 * i;
	aBool4618 = bool;
    }
    
    static final void method5828(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_0_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 2]);
	Class581.processActionButton(3, i_0_ << 16 | i_1_, i_2_, "", -131086414);
    }
    
    static final void method5829(InterfaceComponent class58, ClientScriptData class454, int i) {
	if (client.method13624(class58).method15051(-1914840454)
	    && client.aClass58_8384 == null) {
	    Class440.method7831(445907013 * class58.componentHash,
				class58.slot1 * -389932081, 1482319719);
	    client.aClass58_8384
		= Class218_Sub3.method16576(445907013 * class58.componentHash,
					    -389932081 * class58.slot1,
					    (byte) -18);
	    WorldType.refreshComponent(client.aClass58_8384, -110131615);
	}
    }
}
