/* Class400 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class400
{
    public short[] aShortArray5796;
    public int[] anIntArray5797;
    
    public Class400(int[] is, short[] is_0_) {
	anIntArray5797 = is;
	aShortArray5796 = is_0_;
    }
    
    public Class400(NPCDefinition class401) {
	anIntArray5797 = new int[8];
	aShortArray5796 = new short[8];
	int i = 0;
	if (class401.anIntArray5869 != null
	    && class401.aShortArray5833 != null) {
	    i = class401.anIntArray5869.length;
	    System.arraycopy(class401.anIntArray5869, 0, anIntArray5797, 0, i);
	    System.arraycopy(class401.aShortArray5833, 0, aShortArray5796, 0,
			     i);
	}
	for (int i_1_ = i; i_1_ < 8; i_1_++) {
	    anIntArray5797[i_1_] = -1;
	    aShortArray5796[i_1_] = (short) -1;
	}
    }
    
    static boolean method7138(int i, int i_2_, int i_3_) {
	if (i_2_ >= 1000 && i < 1000)
	    return true;
	if (i_2_ < 1000 && i < 1000) {
	    if (Class13.method665(i, 1186522822))
		return true;
	    if (Class13.method665(i_2_, 93708172))
		return false;
	    return true;
	}
	if (i_2_ >= 1000 && i >= 1000)
	    return true;
	return false;
    }
    
    public static Class71 method7139(int i, int i_4_) {
	Class71[] class71s = Class241_Sub2.method14415(5305617);
	for (int i_5_ = 0; i_5_ < class71s.length; i_5_++) {
	    Class71 class71 = class71s[i_5_];
	    if (i == class71.anInt1093 * -915921191)
		return class71;
	}
	return null;
    }
}
