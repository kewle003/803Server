/* Class163 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class163 implements Interface47
{
    int anInt2041;
    static Class163 aClass163_2042;
    static Class163 aClass163_2043;
    static Class163 aClass163_2044;
    static Class163 aClass163_2045;
    static Class163 aClass163_2046;
    static Class163 aClass163_2047;
    static Class163 aClass163_2048 = new Class163(1, 1);
    int anInt2049;
    public static int anInt2050;
    
    static Class163[] method3522() {
	return new Class163[] { aClass163_2048, aClass163_2044, aClass163_2045,
				aClass163_2046, aClass163_2047, aClass163_2043,
				aClass163_2042 };
    }
    
    public int getId(byte i) {
	return 132998139 * ((Class163) this).anInt2049;
    }
    
    static {
	aClass163_2044 = new Class163(0, 2);
	aClass163_2043 = new Class163(6, 3);
	aClass163_2042 = new Class163(3, 4);
	aClass163_2045 = new Class163(4, 5);
	aClass163_2046 = new Class163(2, 6);
	aClass163_2047 = new Class163(5, 7);
    }
    
    public int method9() {
	return 132998139 * ((Class163) this).anInt2049;
    }
    
    Class163(int i, int i_0_) {
	((Class163) this).anInt2041 = i * -370969009;
	((Class163) this).anInt2049 = 971910963 * i_0_;
    }
    
    static Class163[] method3523() {
	return new Class163[] { aClass163_2048, aClass163_2044, aClass163_2045,
				aClass163_2046, aClass163_2047, aClass163_2043,
				aClass163_2042 };
    }
    
    static Class163[] method3524() {
	return new Class163[] { aClass163_2048, aClass163_2044, aClass163_2045,
				aClass163_2046, aClass163_2047, aClass163_2043,
				aClass163_2042 };
    }
    
    static Class163[] method3525() {
	return new Class163[] { aClass163_2048, aClass163_2044, aClass163_2045,
				aClass163_2046, aClass163_2047, aClass163_2043,
				aClass163_2042 };
    }
    
    static Class163[] method3526() {
	return new Class163[] { aClass163_2048, aClass163_2044, aClass163_2045,
				aClass163_2046, aClass163_2047, aClass163_2043,
				aClass163_2042 };
    }
    
    static Class163[] method3527() {
	return new Class163[] { aClass163_2048, aClass163_2044, aClass163_2045,
				aClass163_2046, aClass163_2047, aClass163_2043,
				aClass163_2042 };
    }
    
    public int method10() {
	return 132998139 * ((Class163) this).anInt2049;
    }
    
    public int method11() {
	return 132998139 * ((Class163) this).anInt2049;
    }
    
    public int method147() {
	return 132998139 * ((Class163) this).anInt2049;
    }
    
    public static int method3528(int i, int i_1_) {
	ChatLine class241_sub39_sub4
	    = (ChatLine) Class44.aClass407_609.get((long) i);
	if (class241_sub39_sub4 == null)
	    return -1;
	if (class241_sub39_sub4.aClass241_Sub39_10149
	    == Class44.aClass410_611.aClass241_Sub39_5934)
	    return -1;
	return (((ChatLine)
		 class241_sub39_sub4.aClass241_Sub39_10149).anInt10834
		* 608603855);
    }
    
    static final void method3529(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 93836723;
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_4_ = (((ClientScriptData) class454).integerStack
		    [2 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_5_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 3]);
	int i_6_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719 + 4]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (i_3_ - i_2_) * (i_6_ - i_4_) / (i_5_ - i_4_) + i_2_;
    }
    
    static final void method3530
	(Entity class475_sub1_sub1_sub3, int i) {
	if (class475_sub1_sub1_sub3.anIntArray11415 != null
	    || null != class475_sub1_sub1_sub3.anIntArray11418) {
	    boolean bool = true;
	    GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	    for (int i_7_ = 0;
		 i_7_ < class475_sub1_sub1_sub3.anIntArray11415.length;
		 i_7_++) {
		int i_8_ = -1;
		if (null != class475_sub1_sub1_sub3.anIntArray11415)
		    i_8_ = class475_sub1_sub1_sub3.anIntArray11415[i_7_];
		if (-1 == i_8_) {
		    if (!class475_sub1_sub1_sub3.method17774(i_7_, -1,
							     -835146138))
			bool = false;
		} else {
		    bool = false;
		    boolean bool_9_ = false;
		    boolean bool_10_ = false;
		    Class287 class287
			= class475_sub1_sub1_sub3.method10874().aClass287_4386;
		    int i_11_;
		    int i_12_;
		    if (-1073741824 == (i_8_ & ~0x3fffffff)) {
			int i_13_ = i_8_ & 0xfffffff;
			int i_14_ = i_13_ >> 14;
			int i_15_ = i_13_ & 0x3fff;
			i_11_ = ((int) class287.aFloat4477
				 - (256 + 512 * (i_14_ - (class522.baseX
							  * 127679513))));
			i_12_ = ((int) class287.aFloat4479
				 - (((i_15_ - 468558693 * class522.baseY)
				     * 512)
				    + 256));
		    } else if ((i_8_ & 0x8000) != 0) {
			int i_16_ = i_8_ & 0x7fff;
			Player class475_sub1_sub1_sub3_sub1
			    = (client.localPlayers
			       [i_16_]);
			if (null != class475_sub1_sub1_sub3_sub1) {
			    Class287 class287_17_
				= (class475_sub1_sub1_sub3_sub1.method10874()
				   .aClass287_4386);
			    i_11_ = ((int) class287.aFloat4477
				     - (int) class287_17_.aFloat4477);
			    i_12_ = ((int) class287.aFloat4479
				     - (int) class287_17_.aFloat4479);
			} else {
			    class475_sub1_sub1_sub3.method17774(i_7_, -1,
								-456829482);
			    continue;
			}
		    } else {
			ObjectNode class241_sub26
			    = ((ObjectNode)
			       client.aClass407_8457.get((long) i_8_));
			if (class241_sub26 != null) {
			    NPC class475_sub1_sub1_sub3_sub2
				= ((NPC)
				   class241_sub26.objectValue);
			    Class287 class287_18_
				= (class475_sub1_sub1_sub3_sub2.method10874()
				   .aClass287_4386);
			    i_11_ = ((int) class287.aFloat4477
				     - (int) class287_18_.aFloat4477);
			    i_12_ = ((int) class287.aFloat4479
				     - (int) class287_18_.aFloat4479);
			} else {
			    class475_sub1_sub1_sub3.method17774(i_7_, -1,
								-416607589);
			    continue;
			}
		    }
		    if (i_11_ != 0 || 0 != i_12_)
			class475_sub1_sub1_sub3.method17774
			    (i_7_,
			     (int) (Math.atan2((double) i_11_, (double) i_12_)
				    * 2607.5945876176133) & 0x3fff,
			     342736822);
		}
	    }
	    if (bool) {
		class475_sub1_sub1_sub3.anIntArray11415 = null;
		class475_sub1_sub1_sub3.anIntArray11418 = null;
	    }
	}
    }
    
    public static long method3531(CharSequence charsequence, int i) {
	int i_19_ = charsequence.length();
	long l = 0L;
	for (int i_20_ = 0; i_20_ < i_19_; i_20_++)
	    l = (l << 5) - l + (long) charsequence.charAt(i_20_);
	return l;
    }
}
