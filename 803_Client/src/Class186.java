/* Class186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class186 implements Interface4
{
    int anInt2191;
    int anInt2192;
    int[] anIntArray2193;
    public static int anInt2194;
    
    public int method53() {
	return 695676417 * ((Class186) this).anInt2191;
    }
    
    Class186(int i, int i_0_, int[] is) {
	((Class186) this).anInt2191 = i * 1791808001;
	((Class186) this).anInt2192 = i_0_ * 2083905;
	((Class186) this).anIntArray2193 = is;
    }
    
    public int method49() {
	return -116243519 * ((Class186) this).anInt2192;
    }
    
    Class186(int i, int i_1_) {
	this(i, i_1_, new int[i_1_ * i]);
    }
    
    public void method28() {
	/* empty */
    }
    
    public int method64() {
	return 695676417 * ((Class186) this).anInt2191;
    }
    
    public int method52() {
	return 695676417 * ((Class186) this).anInt2191;
    }
    
    public int method54() {
	return -116243519 * ((Class186) this).anInt2192;
    }
    
    public int method55() {
	return 695676417 * ((Class186) this).anInt2191;
    }
    
    public void method27() {
	/* empty */
    }
    
    public void method29() {
	/* empty */
    }
    
    static final void storeChannelMinKick/*method3862*/(ClientScriptData scriptData, int i) {
    	scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
    			= scriptData.currentChannel.minKickReq;
    }
    
    static final void method3863(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (1145412023 * client.anInt8316
	       == ((ClientScriptData) class454).varEntity
		      .method17832(512985334)) ? 1 : 0;
    }
    
    static final int method3864(int i, int i_2_) {
	int i_3_ = i & 0x3f;
	int i_4_ = i >> 6 & 0x3;
	if (i_3_ == 18) {
	    if (0 == i_4_)
		return 1;
	    if (1 == i_4_)
		return 2;
	    if (i_4_ == 2)
		return 4;
	    if (3 == i_4_)
		return 8;
	} else if (i_3_ == 19 || i_3_ == 21) {
	    if (0 == i_4_)
		return 16;
	    if (i_4_ == 1)
		return 32;
	    if (2 == i_4_)
		return 64;
	    if (3 == i_4_)
		return 128;
	}
	return 0;
    }
}
