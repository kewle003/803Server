/* Class404 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class404
{
    int[][] anIntArrayArray5878;
    public int[] anIntArray5879;
    float[] aFloatArray5880;
    int[][] anIntArrayArray5881;
    public long aLong5882;
    public short[] aShortArray5883;
    public short[] aShortArray5884;
    static int[] anIntArray5885;
    static Class568 aClass568_5886;
    
    public Class404(long l, int[] is, float[] fs, int[][] is_0_, int[][] is_1_,
		    short[] is_2_, short[] is_3_) {
	aLong5882 = l * 7399085059860748217L;
	anIntArray5879 = is;
	((Class404) this).aFloatArray5880 = fs;
	((Class404) this).anIntArrayArray5878 = is_0_;
	((Class404) this).anIntArrayArray5881 = is_1_;
	aShortArray5883 = is_2_;
	aShortArray5884 = is_3_;
    }
    
    public Class404(NPCDefinition class401, boolean bool) {
	if (bool) {
	    anIntArray5879 = new int[class401.modelIDs.length];
	    ((Class404) this).aFloatArray5880
		= new float[class401.modelIDs.length];
	    ((Class404) this).anIntArrayArray5878
		= new int[class401.modelIDs.length][3];
	    ((Class404) this).anIntArrayArray5881
		= new int[class401.modelIDs.length][3];
	    System.arraycopy(class401.modelIDs, 0, anIntArray5879, 0,
			     anIntArray5879.length);
	} else {
	    anIntArray5879 = new int[class401.anIntArray5841.length];
	    ((Class404) this).aFloatArray5880
		= new float[class401.anIntArray5841.length];
	    ((Class404) this).anIntArrayArray5878
		= new int[class401.anIntArray5841.length][3];
	    ((Class404) this).anIntArrayArray5881
		= new int[class401.anIntArray5841.length][3];
	    System.arraycopy(class401.anIntArray5841, 0, anIntArray5879, 0,
			     anIntArray5879.length);
	}
	if (null != class401.aShortArray5849) {
	    aShortArray5883 = new short[class401.aShortArray5849.length];
	    System.arraycopy(class401.aShortArray5849, 0, aShortArray5883, 0,
			     aShortArray5883.length);
	}
	if (class401.aShortArray5813 != null) {
	    aShortArray5884 = new short[class401.aShortArray5813.length];
	    System.arraycopy(class401.aShortArray5813, 0, aShortArray5884, 0,
			     aShortArray5884.length);
	}
    }
    
    public static Class73 method7224(int i, byte i_4_) {
	if (((Class73) Class73.aClass73_1101).anInt1104 * -1009806571 == i)
	    return Class73.aClass73_1101;
	if (-1009806571 * ((Class73) Class73.aClass73_1102).anInt1104 == i)
	    return Class73.aClass73_1102;
	if (i == -1009806571 * ((Class73) Class73.aClass73_1103).anInt1104)
	    return Class73.aClass73_1103;
	return null;
    }
}
