/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class41
{
    ChatLine[] aClass241_Sub39_Sub4Array596
	= new ChatLine[100];
    int anInt597;
    static final int anInt598 = 100;
    
    ChatLine method1051
	(int i, int i_0_, String string, String string_1_, String string_2_,
	 String string_3_, String string_4_, int i_5_) {
	ChatLine class241_sub39_sub4
	    = aClass241_Sub39_Sub4Array596[99];
	for (int i_6_ = 588105189 * anInt597; i_6_ > 0;
	     i_6_--) {
	    if (i_6_ != 100)
		aClass241_Sub39_Sub4Array596[i_6_]
		    = aClass241_Sub39_Sub4Array596[i_6_ - 1];
	}
	if (class241_sub39_sub4 == null)
	    class241_sub39_sub4
		= new ChatLine(i, i_0_, string, string_1_,
					  string_2_, string_4_, i_5_,
					  string_3_);
	else {
	    class241_sub39_sub4.remove((byte) 36);
	    class241_sub39_sub4.method16441((byte) 2);
	    class241_sub39_sub4.method17104(i, i_0_, string, string_1_,
					    string_2_, string_4_, i_5_,
					    string_3_, -1127869762);
	}
	aClass241_Sub39_Sub4Array596[0] = class241_sub39_sub4;
	if (588105189 * anInt597 < 100)
	    anInt597 += -158076947;
	return class241_sub39_sub4;
    }
    
    ChatLine method1052(int type, int flags, String name, String nameUnfiltered, 
    		String nameSimple, String message, String clan, int i_12_, byte i_13_) {
		ChatLine chatLine = aClass241_Sub39_Sub4Array596[99];
		for (int index = 588105189 * anInt597; index > 0; index--) {
		    if (index != 100) {
		    	aClass241_Sub39_Sub4Array596[index] = aClass241_Sub39_Sub4Array596[index - 1];
		    }
		}
		if (chatLine == null) {
			chatLine = new ChatLine(type, flags, name, nameUnfiltered,
					nameSimple, clan, i_12_, message);
		} else {
			chatLine.remove((byte) 36);
			chatLine.method16441((byte) 2);
			chatLine.method17104(type, flags, name, nameUnfiltered,
					nameSimple, clan, i_12_, message, -586668344);
		}
		aClass241_Sub39_Sub4Array596[0] = chatLine;
		if (588105189 * anInt597 < 100) {
		    anInt597 += -158076947;
		}
		return chatLine;
    }
    
    ChatLine method1053(int i, int i_15_) {
	if (i < 0 || i >= 588105189 * anInt597)
	    return null;
	return aClass241_Sub39_Sub4Array596[i];
    }
    
    int method1054(int i) {
	return 588105189 * anInt597;
    }
    
    int method1055() {
	return 588105189 * anInt597;
    }
    
    ChatLine method1056
	(int i, int i_16_, String string, String string_17_, String string_18_,
	 String string_19_, String string_20_, int i_21_) {
	ChatLine class241_sub39_sub4
	    = aClass241_Sub39_Sub4Array596[99];
	for (int i_22_ = 588105189 * anInt597; i_22_ > 0;
	     i_22_--) {
	    if (i_22_ != 100)
		aClass241_Sub39_Sub4Array596[i_22_]
		    = aClass241_Sub39_Sub4Array596[i_22_ - 1];
	}
	if (class241_sub39_sub4 == null)
	    class241_sub39_sub4
		= new ChatLine(i, i_16_, string, string_17_,
					  string_18_, string_20_, i_21_,
					  string_19_);
	else {
	    class241_sub39_sub4.remove((byte) 36);
	    class241_sub39_sub4.method16441((byte) 2);
	    class241_sub39_sub4.method17104(i, i_16_, string, string_17_,
					    string_18_, string_20_, i_21_,
					    string_19_, -1885720081);
	}
	aClass241_Sub39_Sub4Array596[0] = class241_sub39_sub4;
	if (588105189 * anInt597 < 100)
	    anInt597 += -158076947;
	return class241_sub39_sub4;
    }
    
    Class41() {
	/* empty */
    }
    
    ChatLine method1057(int i) {
	if (i < 0 || i >= 588105189 * anInt597)
	    return null;
	return aClass241_Sub39_Sub4Array596[i];
    }
    
    int method1058() {
	return 588105189 * anInt597;
    }
    
    ChatLine method1059(int i) {
	if (i < 0 || i >= 588105189 * anInt597)
	    return null;
	return aClass241_Sub39_Sub4Array596[i];
    }
    
    int method1060() {
	return 588105189 * anInt597;
    }
    
    static void method1061(ClientScriptData class454, int i) {
	Class480 class480 = (Class326_Sub3.aClass482_10288.method11010
			     ((((ClientScriptData) class454).integerStack
			       [(((ClientScriptData) class454).intStackPointer
				 -= 1736754263) * 1482319719]),
			      (short) -19616));
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (class480.anIntArray6434 == null ? 0
	       : class480.anIntArray6434.length);
    }
    
    public static void method1062(int i, int i_23_) {
	if (Class393.method7054(-1676741262)) {
	    if (1391949991 * Class13.anInt81 != i)
		Class13.aLong82 = 7226492194362182485L;
	    Class13.anInt81 = i * 1017556759;
	    Class496.setClientStage(12, (byte) -117);
	}
    }
    
    static final void method1063(ClientScriptData class454, int i) {
	int i_24_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	int i_25_ = client.aClass220Array8426[i_24_].method4383((byte) 0);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_25_ == 1 ? 1 : 0;
    }
    
    static void method1064(int i) {
	Class241_Sub39_Sub13 class241_sub39_sub13 = NPC.method18030(14, 0L);
	class241_sub39_sub13.method17278((byte) -24);
    }
}
