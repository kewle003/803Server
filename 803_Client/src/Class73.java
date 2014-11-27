/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class73
{
    static Class73 aClass73_1101 = new Class73(0, true);
    static Class73 aClass73_1102 = new Class73(1, true);
    static Class73 aClass73_1103 = new Class73(2, false);
    int anInt1104;
    boolean aBool1105;
    
    public static Class73 method1744(int i) {
	if (((Class73) aClass73_1101).anInt1104 * -1009806571 == i)
	    return aClass73_1101;
	if (-1009806571 * ((Class73) aClass73_1102).anInt1104 == i)
	    return aClass73_1102;
	if (i == -1009806571 * ((Class73) aClass73_1103).anInt1104)
	    return aClass73_1103;
	return null;
    }
    
    Class73(int i, boolean bool) {
	((Class73) this).anInt1104 = i * 237970493;
	((Class73) this).aBool1105 = bool;
    }
    
    public static Class73 method1745(int i) {
	if (((Class73) aClass73_1101).anInt1104 * -1009806571 == i)
	    return aClass73_1101;
	if (-1009806571 * ((Class73) aClass73_1102).anInt1104 == i)
	    return aClass73_1102;
	if (i == -1009806571 * ((Class73) aClass73_1103).anInt1104)
	    return aClass73_1103;
	return null;
    }
    
    static final void method1746(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.aBool8272 ? 1 : 0;
    }
    
    public static void method1747(int i) {
	if (Class395.aBool5779) {
	    if (Class395.anInt5781 * -1725450741
		< 1652918313 * Class120_Sub15.anInt10541)
		Class395.anInt5781 = Class120_Sub15.anInt10541 * -1524752613;
	    while (-1725450741 * Class395.anInt5781
		   < Class509.anInt6681 * -505875311) {
		Class507_Sub1 class507_sub1
		    = Class115.method2803(Class395.anInt5781 * -1725450741,
					  (byte) 33);
		if (class507_sub1 == null
		    || class507_sub1.anInt8735 * 212635377 != -1)
		    Class395.anInt5781 += -244931165;
		else {
		    if (Class395.aClass468_5782 == null)
			Class395.aClass468_5782
			    = client.aClass463_8344.method10661((class507_sub1
								 .aString8736),
								2127940615);
		    int i_0_ = Class395.aClass468_5782.anInt6335 * -2078748131;
		    if (i_0_ == -1)
			break;
		    class507_sub1.anInt8735 = 1131848209 * i_0_;
		    Class395.anInt5781 += -244931165;
		    Class395.aClass468_5782 = null;
		}
	    }
	}
    }
    
    static final void method1748(ClientScriptData class454, int i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub6_8872,
	     (((ClientScriptData) class454).integerStack
	      [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]),
	     (byte) 2);
	Class167.method3600((short) 13128);
	client.aBool8297 = false;
    }
    
    static final void method1749(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_1_ > i_2_ ? i_1_ : i_2_;
    }
}
