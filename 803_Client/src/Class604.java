/* Class604 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class604
{
    static final int anInt7741 = 4;
    public int[] anIntArray7742 = new int[3];
    public int[] anIntArray7743;
    static final int anInt7744 = 8;
    static final int anInt7745 = 1;
    public int[] anIntArray7746 = new int[3];
    public int[] anIntArray7747 = new int[2];
    static final int anInt7748 = 2;
    public short[] aShortArray7749;
    public short[] aShortArray7750;
    
    public static Class604 method13196(ItemDefinition class623,
				       RSByteBuffer class241_sub3) {
	Class604 class604 = new Class604(class623);
	int i = class241_sub3.readUnsignedByte((byte) 33);
	boolean bool = 0 != (i & 0x1);
	boolean bool_0_ = 0 != (i & 0x2);
	boolean bool_1_ = (i & 0x4) != 0;
	boolean bool_2_ = 0 != (i & 0x8);
	if (bool) {
	    class604.anIntArray7742[0] = class241_sub3.readBigSmart((byte) -65);
	    class604.anIntArray7746[0] = class241_sub3.readBigSmart((byte) -36);
	    if (-1 != ((ItemDefinition) class623).maleEquip2 * -907955105
		|| -541441075 * ((ItemDefinition) class623).femaleEquip2 != -1) {
		class604.anIntArray7742[1]
		    = class241_sub3.readBigSmart((byte) -3);
		class604.anIntArray7746[1]
		    = class241_sub3.readBigSmart((byte) 69);
	    }
	    if (((ItemDefinition) class623).colourEquip1 * 795824037 != -1
		|| -1 != -471628237 * ((ItemDefinition) class623).colourEquip2) {
		class604.anIntArray7742[2]
		    = class241_sub3.readBigSmart((byte) -24);
		class604.anIntArray7746[2]
		    = class241_sub3.readBigSmart((byte) -99);
	    }
	}
	if (bool_0_) {
	    class604.anIntArray7747[0] = class241_sub3.readBigSmart((byte) -58);
	    class604.anIntArray7743[0]
		= class241_sub3.readBigSmart((byte) -107);
	    if (-1 != ((ItemDefinition) class623).manhead2 * -1341819643
		|| -1 != -1540815033 * ((ItemDefinition) class623).womanhead2) {
		class604.anIntArray7747[1]
		    = class241_sub3.readBigSmart((byte) 32);
		class604.anIntArray7743[1]
		    = class241_sub3.readBigSmart((byte) -27);
	    }
	}
	if (bool_1_) {
	    int i_3_ = class241_sub3.readUnsignedShort(1162222719);
	    int[] is = new int[4];
	    is[0] = i_3_ & 0xf;
	    is[1] = i_3_ >> 4 & 0xf;
	    is[2] = i_3_ >> 8 & 0xf;
	    is[3] = i_3_ >> 12 & 0xf;
	    for (int i_4_ = 0; i_4_ < 4; i_4_++) {
		if (is[i_4_] != 15)
		    class604.aShortArray7749[is[i_4_]]
			= (short) class241_sub3.readUnsignedShort(1162222719);
	    }
	}
	if (bool_2_) {
	    int i_5_ = class241_sub3.readUnsignedByte((byte) -18);
	    int[] is = new int[2];
	    is[0] = i_5_ & 0xf;
	    is[1] = i_5_ >> 4 & 0xf;
	    for (int i_6_ = 0; i_6_ < 2; i_6_++) {
		if (15 != is[i_6_])
		    class604.aShortArray7750[is[i_6_]]
			= (short) class241_sub3.readUnsignedShort(1162222719);
	    }
	}
	return class604;
    }
    
    public static Class604 method13197(ItemDefinition class623,
				       RSByteBuffer class241_sub3) {
	Class604 class604 = new Class604(class623);
	int i = class241_sub3.readUnsignedByte((byte) 47);
	boolean bool = 0 != (i & 0x1);
	boolean bool_7_ = 0 != (i & 0x2);
	boolean bool_8_ = (i & 0x4) != 0;
	boolean bool_9_ = 0 != (i & 0x8);
	if (bool) {
	    class604.anIntArray7742[0] = class241_sub3.readBigSmart((byte) -8);
	    class604.anIntArray7746[0] = class241_sub3.readBigSmart((byte) 23);
	    if (-1 != ((ItemDefinition) class623).maleEquip2 * -907955105
		|| -541441075 * ((ItemDefinition) class623).femaleEquip2 != -1) {
		class604.anIntArray7742[1]
		    = class241_sub3.readBigSmart((byte) -73);
		class604.anIntArray7746[1]
		    = class241_sub3.readBigSmart((byte) -10);
	    }
	    if (((ItemDefinition) class623).colourEquip1 * 795824037 != -1
		|| -1 != -471628237 * ((ItemDefinition) class623).colourEquip2) {
		class604.anIntArray7742[2]
		    = class241_sub3.readBigSmart((byte) -61);
		class604.anIntArray7746[2]
		    = class241_sub3.readBigSmart((byte) -76);
	    }
	}
	if (bool_7_) {
	    class604.anIntArray7747[0] = class241_sub3.readBigSmart((byte) 54);
	    class604.anIntArray7743[0] = class241_sub3.readBigSmart((byte) -50);
	    if (-1 != ((ItemDefinition) class623).manhead2 * -1341819643
		|| -1 != -1540815033 * ((ItemDefinition) class623).womanhead2) {
		class604.anIntArray7747[1]
		    = class241_sub3.readBigSmart((byte) 29);
		class604.anIntArray7743[1]
		    = class241_sub3.readBigSmart((byte) -3);
	    }
	}
	if (bool_8_) {
	    int i_10_ = class241_sub3.readUnsignedShort(1162222719);
	    int[] is = new int[4];
	    is[0] = i_10_ & 0xf;
	    is[1] = i_10_ >> 4 & 0xf;
	    is[2] = i_10_ >> 8 & 0xf;
	    is[3] = i_10_ >> 12 & 0xf;
	    for (int i_11_ = 0; i_11_ < 4; i_11_++) {
		if (is[i_11_] != 15)
		    class604.aShortArray7749[is[i_11_]]
			= (short) class241_sub3.readUnsignedShort(1162222719);
	    }
	}
	if (bool_9_) {
	    int i_12_ = class241_sub3.readUnsignedByte((byte) -19);
	    int[] is = new int[2];
	    is[0] = i_12_ & 0xf;
	    is[1] = i_12_ >> 4 & 0xf;
	    for (int i_13_ = 0; i_13_ < 2; i_13_++) {
		if (15 != is[i_13_])
		    class604.aShortArray7750[is[i_13_]]
			= (short) class241_sub3.readUnsignedShort(1162222719);
	    }
	}
	return class604;
    }
    
    Class604(ItemDefinition class623) {
	anIntArray7743 = new int[2];
	anIntArray7742[0] = ((ItemDefinition) class623).maleEquip1 * 1500268767;
	anIntArray7742[1] = ((ItemDefinition) class623).maleEquip2 * -907955105;
	anIntArray7742[2] = ((ItemDefinition) class623).colourEquip1 * 795824037;
	anIntArray7746[0] = ((ItemDefinition) class623).femaleEquip1 * 1129242275;
	anIntArray7746[1] = ((ItemDefinition) class623).femaleEquip2 * -541441075;
	anIntArray7746[2] = -471628237 * ((ItemDefinition) class623).colourEquip2;
	anIntArray7747[0] = ((ItemDefinition) class623).manhead * -823031799;
	anIntArray7747[1] = -1341819643 * ((ItemDefinition) class623).manhead2;
	anIntArray7743[0] = ((ItemDefinition) class623).womanhead * 1630099121;
	anIntArray7743[1] = -1540815033 * ((ItemDefinition) class623).womanhead2;
	if (((ItemDefinition) class623).modifiedModelColors != null) {
	    aShortArray7749
		= new short[((ItemDefinition) class623).modifiedModelColors.length];
	    System.arraycopy(((ItemDefinition) class623).modifiedModelColors, 0,
			     aShortArray7749, 0, aShortArray7749.length);
	}
	if (((ItemDefinition) class623).modifiedTextureColors != null) {
	    aShortArray7750
		= new short[((ItemDefinition) class623).modifiedTextureColors.length];
	    System.arraycopy(((ItemDefinition) class623).modifiedTextureColors, 0,
			     aShortArray7750, 0, aShortArray7750.length);
	}
    }
    
    public static Class241_Sub41 method13198(byte i) {
	if (Class573_Sub1.aClass429_7387 == null
	    || Class573_Sub1.aClass443_8789 == null)
	    return null;
	for (Class241_Sub41 class241_sub41
		 = (Class241_Sub41) Class573_Sub1.aClass443_8789.next();
	     class241_sub41 != null;
	     class241_sub41
		 = (Class241_Sub41) Class573_Sub1.aClass443_8789.next()) {
	    Class515 class515
		= Class573_Sub1.aClass524_7370.method11745((-1454932011
							    * (class241_sub41
							       .anInt10158)),
							   1089567858);
	    if (null != class515 && class515.aBool6769
		&& class515.method11587(Class573_Sub1.anInterface13_7373,
					Class573_Sub1.anInterface11_7372,
					-110014466))
		return class241_sub41;
	}
	return null;
    }
    
    static final void method13199(ClientScriptData class454, int i) {
	int i_14_ = 1129404283 * Class637.anInt8251;
	int i_15_ = Class357_Sub2_Sub1.anInt11116 * -765950619;
	int i_16_ = -1;
	if (Class442.aBool6160) {
	    Class446[] class446s = VarBitType.method5911(-2102279528);
	    for (int i_17_ = 0; i_17_ < class446s.length; i_17_++) {
		Class446 class446 = class446s[i_17_];
		if (i_14_ == -954685139 * class446.anInt6177
		    && -1042155793 * class446.anInt6180 == i_15_) {
		    i_16_ = i_17_;
		    break;
		}
	    }
	}
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_16_;
    }
    
    static final void method13200(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_18_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_19_ = (((ClientScriptData) class454).integerStack
		     [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_20_ = (((ClientScriptData) class454).integerStack
		     [2 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	Class241_Sub39_Sub9 class241_sub39_sub9
	    = Class72.aClass625_1100.list(i_18_, 478505074);
	if ((class241_sub39_sub9.method17196(i_19_, 16711935).anInt6298
	     * 2119010589)
	    != 0)
	    throw new RuntimeException("");
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class241_sub39_sub9.method17181(i_19_, i_20_, -2110819937);
    }
}
