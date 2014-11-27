/* Class324 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class324
{
    static Class324 aClass324_4922 = new Class324();
    static Class324 aClass324_4923 = new Class324();
    static Class324 aClass324_4924 = new Class324();
    public static ClanChannel mainClanChannel;//aClass241_Sub6_4925
    
    Class324() {
	/* empty */
    }
    
    public int method5965(int i, int i_0_, int i_1_) {
	int i_2_ = (Class67.canvasHei * 963058943 > i_0_
		    ? Class67.canvasHei * 963058943 : i_0_);
	if (this == aClass324_4922)
	    return 0;
	if (aClass324_4924 == this)
	    return i_2_ - i;
	if (aClass324_4923 == this)
	    return (i_2_ - i) / 2;
	return 0;
    }
    
    public static Class324[] method5966() {
	return (new Class324[]
		{ aClass324_4922, aClass324_4923, aClass324_4924 });
    }
    
    public static Class324[] method5967() {
	return (new Class324[]
		{ aClass324_4922, aClass324_4923, aClass324_4924 });
    }
    
    public static Class324[] method5968() {
	return (new Class324[]
		{ aClass324_4922, aClass324_4923, aClass324_4924 });
    }
    
    public int method5969(int i, int i_3_) {
	int i_4_ = (Class67.canvasHei * 963058943 > i_3_
		    ? Class67.canvasHei * 963058943 : i_3_);
	if (this == aClass324_4922)
	    return 0;
	if (aClass324_4924 == this)
	    return i_4_ - i;
	if (aClass324_4923 == this)
	    return (i_4_ - i) / 2;
	return 0;
    }
    
    public int method5970(int i, int i_5_) {
	int i_6_ = (Class67.canvasHei * 963058943 > i_5_
		    ? Class67.canvasHei * 963058943 : i_5_);
	if (this == aClass324_4922)
	    return 0;
	if (aClass324_4924 == this)
	    return i_6_ - i;
	if (aClass324_4923 == this)
	    return (i_6_ - i) / 2;
	return 0;
    }
    
    public int method5971(int i, int i_7_) {
	int i_8_ = (Class67.canvasHei * 963058943 > i_7_
		    ? Class67.canvasHei * 963058943 : i_7_);
	if (this == aClass324_4922)
	    return 0;
	if (aClass324_4924 == this)
	    return i_8_ - i;
	if (aClass324_4923 == this)
	    return (i_8_ - i) / 2;
	return 0;
    }
    
    static final void method5972(ClientScriptData class454, int i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub24_8871,
	     (((ClientScriptData) class454).integerStack
	      [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]),
	     (byte) 2);
	Class167.method3600((short) 17696);
	client.aBool8307 = true;
    }
    
    static final int getMaxLength/*method5973*/(Class600 class600, short i) {
		if (null == class600)
		    return 12;
		switch (952633145 * ((Class600) class600).anInt7716) {
			default:
			    return 12;
			case 2:
			    return 20;
		}
    }
    
    static final void method5974(ClientScriptData class454, int i) {
	int i_9_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class241_Sub39_Sub12 class241_sub39_sub12 = Class573.method12560(i_9_);
	if (null == class241_sub39_sub12) {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	} else {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class241_sub39_sub12.anInt10931 * 219733397;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1017960145 * class241_sub39_sub12.anInt10930;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class241_sub39_sub12.anInt10929 * -1741001739;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class241_sub39_sub12.anInt10924 * 1587526511;
	}
    }
    
    public static int method5975(CharSequence charsequence, int i) {
	return Class403.method7210(charsequence, 10, true, (byte) -85);
    }
    
    static final void method5976(ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (client.aBool8267) {
	    try {
		JSFunction.aClass348_5379.method6209(new Object[] { string },
						   -799600565);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
    }
}
