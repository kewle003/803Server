/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class77
{
    static Class77 aClass77_1114 = new Class77(0);
    static Class77 aClass77_1115;
    static Class77 aClass77_1116;
    static Class77 aClass77_1117;
    static Class77 aClass77_1118 = new Class77(1);
    static Class77 aClass77_1119;
    static Class77 aClass77_1120;
    static Class77 aClass77_1121;
    static Class77 aClass77_1122;
    static Class77 aClass77_1123;
    static Class77 aClass77_1124;
    static Class77 aClass77_1125;
    static Class77 aClass77_1126;
    static Class77 aClass77_1127;
    static Class77 aClass77_1128;
    int anInt1129;
    public static int anInt1130;
    public static int anInt1131;
    
    Class77(int i) {
	((Class77) this).anInt1129 = -770062345 * i;
    }
    
    static {
	aClass77_1116 = new Class77(2);
	aClass77_1122 = new Class77(3);
	aClass77_1124 = new Class77(4);
	aClass77_1119 = new Class77(5);
	aClass77_1120 = new Class77(6);
	aClass77_1121 = new Class77(7);
	aClass77_1117 = new Class77(8);
	aClass77_1123 = new Class77(9);
	aClass77_1115 = new Class77(10);
	aClass77_1125 = new Class77(11);
	aClass77_1126 = new Class77(12);
	aClass77_1127 = new Class77(13);
	aClass77_1128 = new Class77(14);
    }
    
    static void method1774(RSByteBuffer class241_sub3, int i) {
	for (;;) {
	    int i_0_ = class241_sub3.readUnsignedByte((byte) -61);
	    switch (i_0_) {
	    case 0:
		Class104.anInt1478
		    = class241_sub3.readUnsignedShort(1162222719) * 159964073;
		Class104.anInt1481
		    = class241_sub3.readUnsignedShort(1162222719) * -1645614417;
		break;
	    case 255:
		return;
	    }
	}
    }
    
    static final void method1775(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	ClientScriptMap class406
	    = Class105_Sub1.cs2MapsList.list(i_1_, (byte) -77);
	if ('s' == class406.aChar5898) {
	    /* empty */
	}
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = class406.getStringValue(i_2_, -437258978);
    }
    
    static final void ifGtMatchSkip/*method1776*/(ClientScriptData scriptData, int i) {
    	scriptData.intStackPointer -= -821458770;
		if (scriptData.integerStack[1482319719 * scriptData.intStackPointer]
				>= scriptData.integerStack[1 + 1482319719 * scriptData.intStackPointer]) {
			scriptData.step += (1924545709 * scriptData.integerConstants[scriptData.step * 1938982693]);
		}
    }
}
