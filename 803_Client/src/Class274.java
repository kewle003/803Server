/* Class274 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class274
{
    int anInt4375;
    int anInt4376;
    byte[] aByteArray4377;
    int anInt4378;
    static Class168[] aClass168Array4379;
    
    Class274(int i, int i_0_, int i_1_, int i_2_, byte[] is) {
	((Class274) this).anInt4378 = 1179968967 * i;
	((Class274) this).anInt4375 = -1781513773 * i_0_;
	((Class274) this).anInt4376 = i_1_ * -241015077;
	((Class274) this).aByteArray4377 = is;
    }
    
    static int method5338(int i, int i_3_, int i_4_) {
	if (9 == i_3_)
	    i = i + 1 & 0x3;
	if (10 == i_3_)
	    i = 3 + i & 0x3;
	if (11 == i_3_)
	    i = 3 + i & 0x3;
	return i;
    }
    
    static final void method5339(ClientScriptData class454, byte i) {
	int i_5_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_5_, (byte) -42);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_5_ >> 16];
	Class384.method6949(class58, class35, class454, 1977942801);
    }
    
    static final void method5340(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class72.method1740(class58, class35, class454, 140841069);
    }
    
    static final void method5341(ClientScriptData class454, int i) {
	Class241_Sub41 class241_sub41 = Class40.method1048(-147736545);
	if (null == class241_sub41) {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	} else {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class241_sub41.anInt10158 * -1454932011;
	    int i_6_ = (class241_sub41.anInt10153 * -1163930595 << 28
			| (Class573.anInt7388
			   + 669485685 * class241_sub41.anInt10154) << 14
			| (Class573.anInt7389
			   + -1535798317 * class241_sub41.anInt10152));
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= i_6_;
	}
    }
    
    static final void method5342(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_7_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_8_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	int i_9_ = i_8_ >> 14 & 0x3fff;
	int i_10_ = i_8_ & 0x3fff;
	int i_11_ = Class125.method3004(i_7_, i_9_, i_10_, -1942794615);
	if (i_11_ < 0)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= i_11_;
    }
    
    static final void method5343(ClientScriptData class454, int i) {
	NPC class475_sub1_sub1_sub3_sub2
	    = ((NPC)
	       ((ClientScriptData) class454).varEntity);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class475_sub1_sub1_sub3_sub2.combatLevel * 1239473347;
    }
    
    static void method5344(ClientScriptData class454, short i) {
	int i_12_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer - 3]);
	int i_13_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer - 2]);
	int i_14_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719 - 1]);
	((ClientScriptData) class454).intStackPointer -= 915295493;
	if (i_12_ > ((ClientScriptData) class454).anIntArray6219[i_13_])
	    throw new RuntimeException();
	if (i_12_ > ((ClientScriptData) class454).anIntArray6219[i_14_])
	    throw new RuntimeException();
	if (i_13_ == i_14_)
	    throw new RuntimeException();
	Class495.method11284(((ClientScriptData) class454).anIntArrayArray6220[i_13_],
			     ((ClientScriptData) class454).anIntArrayArray6220[i_14_],
			     0, i_12_ - 1, -115532202);
    }
    
    static void method5345(int i) {
	for (Class241_Sub39_Sub10 class241_sub39_sub10
		 = ((Class241_Sub39_Sub10)
		    Class16.aClass410_152.method7440(-1397088259));
	     null != class241_sub39_sub10;
	     class241_sub39_sub10
		 = ((Class241_Sub39_Sub10)
		    Class16.aClass410_152.method7435((byte) -1))) {
	    if ((1633676605
		 * ((Class241_Sub39_Sub10) class241_sub39_sub10).anInt10867)
		> 1) {
		((Class241_Sub39_Sub10) class241_sub39_sub10).anInt10867 = 0;
		Class16.aClass129_155.put(class241_sub39_sub10,
						 ((((Class241_Sub39_Sub11)
						    (Class241_Sub39_Sub11)
						    (((Class241_Sub39_Sub10)
						      class241_sub39_sub10)
						     .aClass410_10866
						     .aClass241_Sub39_5934
						     .aClass241_Sub39_10148))
						   .aLong10872)
						  * 544876251290631095L));
		((Class241_Sub39_Sub10) class241_sub39_sub10)
		    .aClass410_10866.method7434(-1990104736);
	    }
	}
	Class16.anInt149 = 0;
	Class16.anInt148 = 0;
	Class16.aClass429_150.method7652((byte) 90);
	Class16.aClass407_180.method7293(-1749475214);
	Class16.aClass410_152.method7434(-1128037731);
	Class355.method6437(Class16.aClass241_Sub39_Sub11_170, 1837394538);
    }
}
