/* Class536 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class536
{
    short[] aShortArray6986;
    int[] anIntArray6987;
    short[] aShortArray6988;
    long aLong6989;
    
    public Class536(long l, int[] is, short[] is_0_, short[] is_1_) {
	((Class536) this).aLong6989 = l * 3679289074559677423L;
	((Class536) this).anIntArray6987 = is;
	((Class536) this).aShortArray6986 = is_0_;
	((Class536) this).aShortArray6988 = is_1_;
    }
    
    static final void method11892(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	Class440.method7832(i_2_, i_3_ >> 14 & 0x3fff, i_3_ & 0x3fff, true,
			    (byte) 23);
    }
    
    static final void method11893(ClientScriptData class454, byte i) {
	int i_4_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class515 class515
	    = Class441.aClass524_6158.method11745(i_4_, -813648534);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class515.anInt6772 * -705700883;
    }
    
    static void setComponentFont/*method11894*/(int compHash, int fontID, int i_6_) {
		Class241_Sub39_Sub13 class241_sub39_sub13 = NPC.method18030(15, (long) compHash);
		class241_sub39_sub13.method17279((byte) 0);
		((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 = -1741260507 * fontID;
    }
    
    static void method11895(int i, int i_7_, int i_8_, int i_9_, short i_10_) {
	Class241_Sub39_Sub13 class241_sub39_sub13
	    = NPC.method18030(17, (long) i_7_ << 32 | (long) i);
	class241_sub39_sub13.method17279((byte) 0);
	((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941
	    = i_8_ * -1741260507;
	((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10951
	    = 1861259375 * i_9_;
    }
}
