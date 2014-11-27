/* Class120_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub17 extends Class120
{
    int anInt10564;
    int anInt10565;
    int anInt10566;
    int anInt10567;
    int anInt10568;
    
    Class120_Sub17(RSByteBuffer class241_sub3) {
	super(class241_sub3);
	((Class120_Sub17) this).anInt10567
	    = class241_sub3.readUnsignedShort(1162222719) * -1776451645;
	int i = class241_sub3.readUnsignedByte((byte) -81);
	if ((i & 0x1) != 0) {
	    ((Class120_Sub17) this).anInt10565
		= class241_sub3.readUnsignedShort(1162222719) * 205512271;
	    ((Class120_Sub17) this).anInt10566
		= class241_sub3.readUnsignedShort(1162222719) * 766640691;
	} else {
	    ((Class120_Sub17) this).anInt10565 = -205512271;
	    ((Class120_Sub17) this).anInt10566 = -766640691;
	}
	if ((i & 0x2) != 0) {
	    ((Class120_Sub17) this).anInt10568
		= class241_sub3.readUnsignedShort(1162222719) * 1946083011;
	    ((Class120_Sub17) this).anInt10564
		= class241_sub3.readUnsignedShort(1162222719) * 264622427;
	} else {
	    ((Class120_Sub17) this).anInt10568 = -1946083011;
	    ((Class120_Sub17) this).anInt10564 = -264622427;
	}
	if ((i & 0x4) != 0) {
	    int i_0_ = class241_sub3.readUnsignedShort(1162222719);
	    int i_1_ = class241_sub3.readUnsignedShort(1162222719);
	    int i_2_ = i_0_ * 255 / i_1_;
	    if (i_0_ > 0 && i_2_ < 1) {
		boolean bool = true;
	    }
	}
    }
    
    public void method2958(int i) {
	Entity class475_sub1_sub1_sub3
	    = Class25.aClass93Array213
		  [((Class120_Sub17) this).anInt10567 * 354543851]
		  .method2083(-47480623);
	class475_sub1_sub1_sub3.setHitMark
	    (1463711919 * ((Class120_Sub17) this).anInt10565,
	     474007803 * ((Class120_Sub17) this).anInt10566,
	     ((Class120_Sub17) this).anInt10568 * -2080488981,
	     369489619 * ((Class120_Sub17) this).anInt10564, client.anInt8296,
	     0, -2117742612);
    }
    
    public void method2961() {
	Entity class475_sub1_sub1_sub3
	    = Class25.aClass93Array213
		  [((Class120_Sub17) this).anInt10567 * 354543851]
		  .method2083(-1095223722);
	class475_sub1_sub1_sub3.setHitMark
	    (1463711919 * ((Class120_Sub17) this).anInt10565,
	     474007803 * ((Class120_Sub17) this).anInt10566,
	     ((Class120_Sub17) this).anInt10568 * -2080488981,
	     369489619 * ((Class120_Sub17) this).anInt10564, client.anInt8296,
	     0, -1815508453);
    }
    
    static final void method16798(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	boolean bool
	    = 1 == (((ClientScriptData) class454).integerStack
		    [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	if (Class573_Sub1.aClass407_8782 != null) {
	    Node class241
		= Class573_Sub1.aClass407_8782.get((long) i_3_);
	    if (class241 != null && !bool)
		class241.remove((byte) 36);
	    else if (null == class241 && bool) {
		class241 = new Node();
		Class573_Sub1.aClass407_8782.put(class241, (long) i_3_);
	    }
	}
    }
}
