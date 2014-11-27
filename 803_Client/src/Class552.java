/* Class552 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class552
{
    int anInt7122;
    public int anInt7123;
    int anInt7124;
    int anInt7125;
    int anInt7126 = 16;
    Class103 aClass103_7127;
    int anInt7128;
    int anInt7129;
    boolean aBool7130;
    public Class550 aClass550_7131;
    public int anInt7132;
    short[][] aShortArrayArray7133;
    boolean[][] aBoolArrayArray7134;
    public Class548[][][] aClass548ArrayArrayArray7135;
    boolean aBool7136;
    boolean[][] aBoolArrayArray7137;
    public int anInt7138;
    int anInt7139;
    public Class166[] aClass166Array7140;
    int anInt7141;
    public int anInt7142;
    byte[][] aByteArrayArray7143;
    byte[][] aByteArrayArray7144;
    int[] anIntArray7145;
    byte[][] aByteArrayArray7146;
    int anInt7147 = 0;
    public Class548[][][] aClass548ArrayArrayArray7148;
    int anInt7149 = 10050;
    int anInt7150 = 5090;
    Class475_Sub1[] aClass475_Sub1Array7151;
    public static boolean aBool7152 = true;
    int anInt7153;
    int anInt7154;
    int anInt7155;
    Class475_Sub1[] aClass475_Sub1Array7156;
    Class475_Sub1[] aClass475_Sub1Array7157;
    Class475_Sub1_Sub1[] aClass475_Sub1_Sub1Array7158;
    int anInt7159 = 5066;
    int anInt7160;
    boolean[] aBoolArray7161;
    int anInt7162;
    int anInt7163;
    int anInt7164;
    int anInt7165;
    int[][] anIntArrayArray7166;
    int anInt7167;
    Class475_Sub1[] aClass475_Sub1Array7168;
    public Class548[][][] aClass548ArrayArrayArray7169;
    int anInt7170;
    int anInt7171;
    float[] aFloatArray7172;
    Class241_Sub43[] aClass241_Sub43Array7173;
    int anInt7174 = 65074;
    static final int anInt7175 = 4;
    Class475_Sub1[] aClass475_Sub1Array7176;
    long[][][] aLongArrayArrayArray7177;
    Class544[] aClass544Array7178;
    public Class166[] aClass166Array7179;
    public Class576 aClass576_7180;
    boolean[][] aBoolArrayArray7181;
    Class402 aClass402_7182;
    byte[][] aByteArrayArray7183;
    public Class166[] aClass166Array7184;
    
    void method12099(Class475_Sub1_Sub1 class475_sub1_sub1, boolean bool) {
	int i = Math.min(120442351 * anInt7138 - 1,
			 Math.max(0, class475_sub1_sub1.aShort10717));
	int i_0_ = Math.min(120442351 * anInt7138 - 1,
			    Math.max(0, class475_sub1_sub1.aShort10716));
	int i_1_ = Math.min(-2069974325 * anInt7142 - 1,
			    Math.max(0, class475_sub1_sub1.aShort10718));
	int i_2_ = Math.min(anInt7142 * -2069974325 - 1,
			    Math.max(0, class475_sub1_sub1.aShort10719));
	for (int i_3_ = i; i_3_ <= i_0_; i_3_++) {
	    for (int i_4_ = i_1_; i_4_ <= i_2_; i_4_++) {
		Class548 class548
		    = (aClass548ArrayArrayArray7169
		       [class475_sub1_sub1.nodePlane][i_3_][i_4_]);
		if (class548 != null) {
		    Class541 class541 = class548.aClass541_7053;
		    Class541 class541_5_ = null;
		    for (/**/; null != class541;
			 class541 = class541.aClass541_7005) {
			if (class475_sub1_sub1
			    == class541.aClass475_Sub1_Sub1_7004) {
			    if (null != class541_5_)
				class541_5_.aClass541_7005
				    = class541.aClass541_7005;
			    else
				class548.aClass541_7053
				    = class541.aClass541_7005;
			    class541.method11935(907220466);
			    break;
			}
			class541_5_ = class541;
		    }
		}
	    }
	}
	if (!bool)
	    method12131(class475_sub1_sub1, (byte) -83);
    }
    
    public Class475_Sub1_Sub4 method12100(int i, int i_6_, int i_7_,
					  int i_8_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_6_][i_7_];
	if (null == class548 || null == class548.aClass475_Sub1_Sub4_7058)
	    return null;
	return class548.aClass475_Sub1_Sub4_7058;
    }
    
    public void method12101(Class96 class96, int i) {
	/* empty */
    }
    
    public void method12102(boolean bool, byte i) {
	if (bool) {
	    aClass548ArrayArrayArray7169 = aClass548ArrayArrayArray7135;
	    aClass166Array7184 = aClass166Array7140;
	} else {
	    aClass548ArrayArrayArray7169 = aClass548ArrayArrayArray7148;
	    aClass166Array7184 = aClass166Array7179;
	}
	anInt7132 = aClass548ArrayArrayArray7169.length * 1516162213;
    }
    
    public void method12103(int i) {
	for (int i_9_ = 0; i_9_ < 120442351 * anInt7138; i_9_++) {
	    for (int i_10_ = 0; i_10_ < -2069974325 * anInt7142; i_10_++) {
		if (aClass548ArrayArrayArray7169[0][i_9_][i_10_] == null)
		    aClass548ArrayArrayArray7169[0][i_9_][i_10_]
			= new Class548(0);
	    }
	}
    }
    
    public void method12104(int i, int i_11_, int i_12_) {
	Class548 class548 = aClass548ArrayArrayArray7169[0][i][i_11_];
	for (int i_13_ = 0; i_13_ < 3; i_13_++) {
	    Class548 class548_14_
		= (aClass548ArrayArrayArray7169[i_13_][i][i_11_]
		   = aClass548ArrayArrayArray7169[1 + i_13_][i][i_11_]);
	    if (null != class548_14_) {
		for (Class541 class541 = class548_14_.aClass541_7053;
		     class541 != null; class541 = class541.aClass541_7005) {
		    Class475_Sub1_Sub1 class475_sub1_sub1
			= class541.aClass475_Sub1_Sub1_7004;
		    if (class475_sub1_sub1.aShort10717 == i
			&& i_11_ == class475_sub1_sub1.aShort10718)
			class475_sub1_sub1.nodePlane--;
		}
		if (null != class548_14_.aClass475_Sub1_Sub4_7058)
		    class548_14_.aClass475_Sub1_Sub4_7058.nodePlane--;
		if (null != class548_14_.aClass475_Sub1_Sub3_7055)
		    class548_14_.aClass475_Sub1_Sub3_7055.nodePlane--;
		if (class548_14_.aClass475_Sub1_Sub3_7056 != null)
		    class548_14_.aClass475_Sub1_Sub3_7056.nodePlane--;
		if (null != class548_14_.aClass475_Sub1_Sub5_7061)
		    class548_14_.aClass475_Sub1_Sub5_7061.nodePlane--;
		if (class548_14_.aClass475_Sub1_Sub5_7059 != null)
		    class548_14_.aClass475_Sub1_Sub5_7059.nodePlane--;
	    }
	}
	if (aClass548ArrayArrayArray7169[0][i][i_11_] == null) {
	    aClass548ArrayArrayArray7169[0][i][i_11_] = new Class548(0);
	    aClass548ArrayArrayArray7169[0][i][i_11_].aByte7054 = (byte) 1;
	}
	aClass548ArrayArrayArray7169[0][i][i_11_].aClass548_7063 = class548;
	aClass548ArrayArrayArray7169[3][i][i_11_] = null;
    }
    
    Class548 method12105(int i, int i_15_, int i_16_, short i_17_) {
	if (aClass548ArrayArrayArray7169[i][i_15_][i_16_] == null) {
	    boolean bool
		= (aClass548ArrayArrayArray7169[0][i_15_][i_16_] != null
		   && (aClass548ArrayArrayArray7169[0][i_15_][i_16_]
		       .aClass548_7063) != null);
	    if (bool && i >= anInt7132 * 532429613 - 1)
		return null;
	    method12107(i, i_15_, i_16_, -1745403360);
	}
	return aClass548ArrayArrayArray7169[i][i_15_][i_16_];
    }
    
    void method12106(Class475_Sub1[] class475_sub1s, int i, int i_18_) {
	if (i < i_18_) {
	    int i_19_ = (i + i_18_) / 2;
	    int i_20_ = i;
	    Class475_Sub1 class475_sub1 = class475_sub1s[i_19_];
	    class475_sub1s[i_19_] = class475_sub1s[i_18_];
	    class475_sub1s[i_18_] = class475_sub1;
	    int i_21_ = ((Class475_Sub1) class475_sub1).anInt8747 * 1364632497;
	    for (int i_22_ = i; i_22_ < i_18_; i_22_++) {
		if ((((Class475_Sub1) class475_sub1s[i_22_]).anInt8747
		     * 1364632497)
		    > i_21_ + (i_22_ & 0x1)) {
		    Class475_Sub1 class475_sub1_23_ = class475_sub1s[i_22_];
		    class475_sub1s[i_22_] = class475_sub1s[i_20_];
		    class475_sub1s[i_20_++] = class475_sub1_23_;
		}
	    }
	    class475_sub1s[i_18_] = class475_sub1s[i_20_];
	    class475_sub1s[i_20_] = class475_sub1;
	    method12238(class475_sub1s, i, i_20_ - 1);
	    method12238(class475_sub1s, i_20_ + 1, i_18_);
	}
    }
    
    public void method12107(int i, int i_24_, int i_25_, int i_26_) {
	boolean bool = (null != aClass548ArrayArrayArray7169[0][i_24_][i_25_]
			&& null != (aClass548ArrayArrayArray7169[0][i_24_]
				    [i_25_].aClass548_7063));
	for (int i_27_ = i; i_27_ >= 0; i_27_--) {
	    if (null == aClass548ArrayArrayArray7169[i_27_][i_24_][i_25_]) {
		Class548 class548
		    = (aClass548ArrayArrayArray7169[i_27_][i_24_][i_25_]
		       = new Class548(i_27_));
		if (bool)
		    class548.aByte7054++;
	    }
	}
    }
    
    public void method12108(int i, Class166 class166, byte i_28_) {
	aClass166Array7184[i] = class166;
    }
    
    public int method12109(int i, int i_29_, int i_30_) {
	return (((Class552) this).aShortArrayArray7133 != null
		? ((Class552) this).aShortArrayArray7133[i][i_29_] & 0xffff
		: 0);
    }
    
    void method12110(boolean bool, byte[][][] is, int i, byte i_31_,
		     int i_32_) {
	int i_33_ = bool ? 1 : 0;
	((Class552) this).anInt7154 = 0;
	((Class552) this).anInt7155 = 0;
	((Class552) this).anInt7164 += -1784631545;
	if (0 == (i_32_ & 0x2)) {
	    for (Class475_Sub1 class475_sub1
		     = ((Class552) this).aClass475_Sub1Array7151[i_33_];
		 class475_sub1 != null;
		 class475_sub1
		     = ((Class475_Sub1) class475_sub1).aClass475_Sub1_8743) {
		method12213(class475_sub1, 1726943831);
		if ((1364632497 * ((Class475_Sub1) class475_sub1).anInt8747
		     != -1)
		    && !method12147(class475_sub1, bool, is, i, i_31_))
		    ((Class552) this).aClass475_Sub1Array7157
			[((((Class552) this).anInt7154 += -1237267015)
			  * -1357567863) - 1]
			= class475_sub1;
	    }
	}
	if (0 == (i_32_ & 0x1)) {
	    for (Class475_Sub1 class475_sub1
		     = ((Class552) this).aClass475_Sub1Array7168[i_33_];
		 null != class475_sub1;
		 class475_sub1
		     = ((Class475_Sub1) class475_sub1).aClass475_Sub1_8743) {
		method12213(class475_sub1, 1187210539);
		if ((1364632497 * ((Class475_Sub1) class475_sub1).anInt8747
		     != -1)
		    && !method12147(class475_sub1, bool, is, i, i_31_))
		    ((Class552) this).aClass475_Sub1Array7156
			[((((Class552) this).anInt7155 += -542324275)
			  * -679130363) - 1]
			= class475_sub1;
	    }
	    for (Class475_Sub1 class475_sub1
		     = ((Class552) this).aClass475_Sub1Array7176[i_33_];
		 class475_sub1 != null;
		 class475_sub1
		     = ((Class475_Sub1) class475_sub1).aClass475_Sub1_8743) {
		method12213(class475_sub1, 772910513);
		if ((-1
		     != 1364632497 * ((Class475_Sub1) class475_sub1).anInt8747)
		    && !method12147(class475_sub1, bool, is, i, i_31_)) {
		    if (class475_sub1.method14452((byte) 65))
			((Class552) this).aClass475_Sub1Array7156
			    [((((Class552) this).anInt7155 += -542324275)
			      * -679130363) - 1]
			    = class475_sub1;
		    else
			((Class552) this).aClass475_Sub1Array7157
			    [((((Class552) this).anInt7154 += -1237267015)
			      * -1357567863) - 1]
			    = class475_sub1;
		}
	    }
	    if (!bool) {
		for (int i_34_ = 0;
		     i_34_ < ((Class552) this).anInt7147 * -1933263771;
		     i_34_++) {
		    method12213((((Class552) this).aClass475_Sub1_Sub1Array7158
				 [i_34_]),
				1015763474);
		    if ((((Class475_Sub1_Sub1) (((Class552) this)
						.aClass475_Sub1_Sub1Array7158
						[i_34_])).anInt8747
			 * 1364632497) != -1
			&& !method12147((((Class552) this)
					 .aClass475_Sub1_Sub1Array7158[i_34_]),
					bool, is, i, i_31_)) {
			if (((Class552) this).aClass475_Sub1_Sub1Array7158
				[i_34_].method14452((byte) 81))
			    ((Class552) this).aClass475_Sub1Array7156
				[((((Class552) this).anInt7155 += -542324275)
				  * -679130363) - 1]
				= (((Class552) this)
				   .aClass475_Sub1_Sub1Array7158[i_34_]);
			else
			    ((Class552) this).aClass475_Sub1Array7157
				[((((Class552) this).anInt7154 += -1237267015)
				  * -1357567863) - 1]
				= (((Class552) this)
				   .aClass475_Sub1_Sub1Array7158[i_34_]);
		    }
		}
	    }
	}
	if (-1357567863 * ((Class552) this).anInt7154 > 0) {
	    method12146(((Class552) this).aClass475_Sub1Array7157, 0,
			((Class552) this).anInt7154 * -1357567863 - 1);
	    for (int i_35_ = 0;
		 i_35_ < ((Class552) this).anInt7154 * -1357567863; i_35_++)
		method12148(((Class552) this).aClass475_Sub1Array7157[i_35_],
			    ((Class552) this).aClass241_Sub43Array7173);
	}
	if (((Class552) this).aBool7136)
	    ((Class552) this).aClass103_7127.method2317(0, null);
	if (0 == (i_32_ & 0x2)) {
	    for (int i_36_ = 0; i_36_ < 532429613 * anInt7132; i_36_++) {
		if (i_36_ >= i && is != null) {
		    int i_37_ = ((Class552) this).aBoolArrayArray7134.length;
		    if ((((Class552) this).aBoolArrayArray7134.length
			 + ((Class552) this).anInt7125 * -728696637)
			> 120442351 * anInt7138)
			i_37_
			    -= (((Class552) this).anInt7125 * -728696637
				+ ((Class552) this).aBoolArrayArray7134.length
				- anInt7138 * 120442351);
		    int i_38_
			= ((Class552) this).aBoolArrayArray7134[0].length;
		    if ((-1866739569 * ((Class552) this).anInt7170
			 + ((Class552) this).aBoolArrayArray7134[0].length)
			> anInt7142 * -2069974325)
			i_38_
			    -= (((Class552) this).aBoolArrayArray7134[0].length
				+ -1866739569 * ((Class552) this).anInt7170
				- -2069974325 * anInt7142);
		    boolean[][] bools = ((Class552) this).aBoolArrayArray7181;
		    if (((Class552) this).aBool7130) {
			for (int i_39_
				 = -181472661 * ((Class552) this).anInt7122;
			     i_39_ < i_37_; i_39_++) {
			    int i_40_
				= (i_39_
				   + -728696637 * ((Class552) this).anInt7125
				   - -181472661 * ((Class552) this).anInt7122);
			    for (int i_41_ = (((Class552) this).anInt7167
					      * -580117089);
				 i_41_ < i_38_; i_41_++) {
				bools[i_39_][i_41_] = false;
				if (((Class552) this).aBoolArrayArray7134
				    [i_39_][i_41_]) {
				    int i_42_
					= ((((Class552) this).anInt7170
					    * -1866739569)
					   + i_41_
					   - (-580117089
					      * ((Class552) this).anInt7167));
				    for (int i_43_ = i_36_; i_43_ >= 0;
					 i_43_--) {
					if ((null
					     != (aClass548ArrayArrayArray7169
						 [i_43_][i_40_][i_42_]))
					    && (aClass548ArrayArrayArray7169
						[i_43_][i_40_][i_42_]
						.aByte7054) == i_36_) {
					    if ((i_43_ >= i
						 && (is[i_43_][i_40_][i_42_]
						     == i_31_))
						|| (aClass550_7131.method12043
						    (i_36_, i_40_, i_42_)))
						bools[i_39_][i_41_] = false;
					    else
						bools[i_39_][i_41_] = true;
					    break;
					}
				    }
				}
			    }
			}
		    }
		    aClass166Array7184[i_36_].method3547
			(-985319149 * ((Class552) this).anInt7128,
			 -1234452287 * ((Class552) this).anInt7160,
			 1222806433 * ((Class552) this).anInt7165,
			 ((Class552) this).aBoolArrayArray7181, false, i_32_);
		} else {
		    int i_44_ = ((Class552) this).aBoolArrayArray7134.length;
		    if ((-728696637 * ((Class552) this).anInt7125
			 + ((Class552) this).aBoolArrayArray7134.length)
			> 120442351 * anInt7138)
			i_44_
			    -= (((Class552) this).anInt7125 * -728696637
				+ ((Class552) this).aBoolArrayArray7134.length
				- anInt7138 * 120442351);
		    int i_45_
			= ((Class552) this).aBoolArrayArray7134[0].length;
		    if ((((Class552) this).aBoolArrayArray7134[0].length
			 + ((Class552) this).anInt7170 * -1866739569)
			> anInt7142 * -2069974325)
			i_45_ -= (((Class552) this).anInt7170 * -1866739569
				  + (((Class552) this).aBoolArrayArray7134
				     [0]).length
				  - -2069974325 * anInt7142);
		    boolean[][] bools = ((Class552) this).aBoolArrayArray7181;
		    if (((Class552) this).aBool7130) {
			for (int i_46_
				 = -181472661 * ((Class552) this).anInt7122;
			     i_46_ < i_44_; i_46_++) {
			    int i_47_
				= (-728696637 * ((Class552) this).anInt7125
				   + i_46_
				   - ((Class552) this).anInt7122 * -181472661);
			    for (int i_48_ = (((Class552) this).anInt7167
					      * -580117089);
				 i_48_ < i_45_; i_48_++) {
				if ((((Class552) this).aBoolArrayArray7134
				     [i_46_][i_48_])
				    && !(aClass550_7131.method12043
					 (i_36_, i_47_,
					  (i_48_
					   + (((Class552) this).anInt7170
					      * -1866739569)
					   - (((Class552) this).anInt7167
					      * -580117089)))))
				    bools[i_46_][i_48_] = true;
				else
				    bools[i_46_][i_48_] = false;
			    }
			}
		    }
		    aClass166Array7184[i_36_].method3547
			(-985319149 * ((Class552) this).anInt7128,
			 -1234452287 * ((Class552) this).anInt7160,
			 1222806433 * ((Class552) this).anInt7165,
			 ((Class552) this).aBoolArrayArray7181, true, i_32_);
		}
	    }
	}
	if (-679130363 * ((Class552) this).anInt7155 > 0) {
	    method12238(((Class552) this).aClass475_Sub1Array7156, 0,
			((Class552) this).anInt7155 * -679130363 - 1);
	    for (int i_49_ = 0;
		 i_49_ < ((Class552) this).anInt7155 * -679130363; i_49_++)
		method12148(((Class552) this).aClass475_Sub1Array7156[i_49_],
			    ((Class552) this).aClass241_Sub43Array7173);
	}
    }
    
    public int method12111(int i, int i_50_) {
	return (((Class552) this).anIntArrayArray7166 != null
		? ((Class552) this).anIntArrayArray7166[i][i_50_] & 0xffffff
		: 0);
    }
    
    public Class475_Sub1_Sub4 method12112(int i, int i_51_, int i_52_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_51_][i_52_];
	if (null == class548 || null == class548.aClass475_Sub1_Sub4_7058)
	    return null;
	return class548.aClass475_Sub1_Sub4_7058;
    }
    
    public int method12113(int i, int i_53_, int i_54_) {
	return (((Class552) this).aByteArrayArray7183 != null
		? ((Class552) this).aByteArrayArray7183[i][i_53_] & 0xff : 0);
    }
    
    void method12114(Class475_Sub1_Sub1 class475_sub1_sub1, boolean bool) {
	int i = Math.min(120442351 * anInt7138 - 1,
			 Math.max(0, class475_sub1_sub1.aShort10717));
	int i_55_ = Math.min(120442351 * anInt7138 - 1,
			     Math.max(0, class475_sub1_sub1.aShort10716));
	int i_56_ = Math.min(-2069974325 * anInt7142 - 1,
			     Math.max(0, class475_sub1_sub1.aShort10718));
	int i_57_ = Math.min(anInt7142 * -2069974325 - 1,
			     Math.max(0, class475_sub1_sub1.aShort10719));
	for (int i_58_ = i; i_58_ <= i_55_; i_58_++) {
	    for (int i_59_ = i_56_; i_59_ <= i_57_; i_59_++) {
		Class548 class548
		    = (aClass548ArrayArrayArray7169
		       [class475_sub1_sub1.nodePlane][i_58_][i_59_]);
		if (class548 != null) {
		    Class541 class541 = class548.aClass541_7053;
		    Class541 class541_60_ = null;
		    for (/**/; null != class541;
			 class541 = class541.aClass541_7005) {
			if (class475_sub1_sub1
			    == class541.aClass475_Sub1_Sub1_7004) {
			    if (null != class541_60_)
				class541_60_.aClass541_7005
				    = class541.aClass541_7005;
			    else
				class548.aClass541_7053
				    = class541.aClass541_7005;
			    class541.method11935(1025510394);
			    break;
			}
			class541_60_ = class541;
		    }
		}
	    }
	}
	if (!bool)
	    method12131(class475_sub1_sub1, (byte) -106);
    }
    
    public Class475_Sub1_Sub4 method12115(int i, int i_61_, int i_62_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_61_][i_62_];
	if (null == class548)
	    return null;
	method12131(class548.aClass475_Sub1_Sub4_7058, (byte) -72);
	if (class548.aClass475_Sub1_Sub4_7058 != null) {
	    Class475_Sub1_Sub4 class475_sub1_sub4
		= class548.aClass475_Sub1_Sub4_7058;
	    class548.aClass475_Sub1_Sub4_7058 = null;
	    return class475_sub1_sub4;
	}
	return null;
    }
    
    public void method12116(int i, int i_63_, int i_64_,
			    Class475_Sub1_Sub4 class475_sub1_sub4, int i_65_) {
	Class548 class548 = method12105(i, i_63_, i_64_, (short) 14292);
	if (class548 != null) {
	    class548.aClass475_Sub1_Sub4_7058 = class475_sub1_sub4;
	    int i_66_ = aClass166Array7140 == aClass166Array7184 ? 1 : 0;
	    if (class475_sub1_sub4.method14469((byte) -122)) {
		if (class475_sub1_sub4.method14452((byte) 5)) {
		    ((Class475_Sub1_Sub4) class475_sub1_sub4)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7168[i_66_];
		    ((Class552) this).aClass475_Sub1Array7168[i_66_]
			= class475_sub1_sub4;
		} else {
		    ((Class475_Sub1_Sub4) class475_sub1_sub4)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7151[i_66_];
		    ((Class552) this).aClass475_Sub1Array7151[i_66_]
			= class475_sub1_sub4;
		}
	    } else {
		((Class475_Sub1_Sub4) class475_sub1_sub4).aClass475_Sub1_8743
		    = ((Class552) this).aClass475_Sub1Array7176[i_66_];
		((Class552) this).aClass475_Sub1Array7176[i_66_]
		    = class475_sub1_sub4;
	    }
	}
    }
    
    public Class475_Sub1_Sub1 method12117
	(int i, int i_67_, int i_68_, Interface57 interface57, byte i_69_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_67_][i_68_];
	if (class548 == null)
	    return null;
	for (Class541 class541 = class548.aClass541_7053; class541 != null;
	     class541 = class541.aClass541_7005) {
	    Class475_Sub1_Sub1 class475_sub1_sub1
		= class541.aClass475_Sub1_Sub1_7004;
	    if ((interface57 == null
		 || interface57.method430(class475_sub1_sub1, 1441757916))
		&& class475_sub1_sub1.aShort10717 == i_67_
		&& class475_sub1_sub1.aShort10718 == i_68_) {
		method12130(class475_sub1_sub1, false, 1879225499);
		return class475_sub1_sub1;
	    }
	}
	return null;
    }
    
    public void method12118
	(int i, int i_70_, int i_71_, Class475_Sub1_Sub3 class475_sub1_sub3,
	 Class475_Sub1_Sub3 class475_sub1_sub3_72_, int i_73_) {
	Class548 class548 = method12105(i, i_70_, i_71_, (short) 28493);
	if (class548 != null) {
	    class548.aClass475_Sub1_Sub3_7055 = class475_sub1_sub3;
	    class548.aClass475_Sub1_Sub3_7056 = class475_sub1_sub3_72_;
	    int i_74_ = aClass166Array7184 == aClass166Array7140 ? 1 : 0;
	    if (class475_sub1_sub3.method14469((byte) -107)) {
		if (class475_sub1_sub3.method14452((byte) 55)) {
		    ((Class475_Sub1_Sub3) class475_sub1_sub3)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7168[i_74_];
		    ((Class552) this).aClass475_Sub1Array7168[i_74_]
			= class475_sub1_sub3;
		} else {
		    ((Class475_Sub1_Sub3) class475_sub1_sub3)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7151[i_74_];
		    ((Class552) this).aClass475_Sub1Array7151[i_74_]
			= class475_sub1_sub3;
		}
	    } else {
		((Class475_Sub1_Sub3) class475_sub1_sub3).aClass475_Sub1_8743
		    = ((Class552) this).aClass475_Sub1Array7176[i_74_];
		((Class552) this).aClass475_Sub1Array7176[i_74_]
		    = class475_sub1_sub3;
	    }
	    if (class475_sub1_sub3_72_ != null) {
		if (class475_sub1_sub3_72_.method14469((byte) -126)) {
		    if (class475_sub1_sub3_72_.method14452((byte) -38)) {
			((Class475_Sub1_Sub3) class475_sub1_sub3_72_)
			    .aClass475_Sub1_8743
			    = ((Class552) this).aClass475_Sub1Array7168[i_74_];
			((Class552) this).aClass475_Sub1Array7168[i_74_]
			    = class475_sub1_sub3_72_;
		    } else {
			((Class475_Sub1_Sub3) class475_sub1_sub3_72_)
			    .aClass475_Sub1_8743
			    = ((Class552) this).aClass475_Sub1Array7151[i_74_];
			((Class552) this).aClass475_Sub1Array7151[i_74_]
			    = class475_sub1_sub3_72_;
		    }
		} else {
		    ((Class475_Sub1_Sub3) class475_sub1_sub3_72_)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7176[i_74_];
		    ((Class552) this).aClass475_Sub1Array7176[i_74_]
			= class475_sub1_sub3_72_;
		}
	    }
	}
    }
    
    public void method12119() {
	method12151(1, 532429613 * anInt7132, 1435143585);
    }
    
    public int method12120(int i, int i_75_) {
	return (((Class552) this).aByteArrayArray7143 != null
		? ((Class552) this).aByteArrayArray7143[i][i_75_] & 0xff : 0);
    }
    
    public void method12121(int i, int i_76_, int i_77_, int i_78_,
			    int i_79_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_76_][i_77_];
	if (null != class548) {
	    Class475_Sub1_Sub5 class475_sub1_sub5
		= class548.aClass475_Sub1_Sub5_7061;
	    Class475_Sub1_Sub5 class475_sub1_sub5_80_
		= class548.aClass475_Sub1_Sub5_7059;
	    if (class475_sub1_sub5 != null) {
		class475_sub1_sub5.aShort10749
		    = (short) (i_78_ * class475_sub1_sub5.aShort10749
			       / (16 << 1591782305 * anInt7123 - 7));
		class475_sub1_sub5.aShort10748
		    = (short) (class475_sub1_sub5.aShort10748 * i_78_
			       / (16 << anInt7123 * 1591782305 - 7));
	    }
	    if (class475_sub1_sub5_80_ != null) {
		class475_sub1_sub5_80_.aShort10749
		    = (short) (class475_sub1_sub5_80_.aShort10749 * i_78_
			       / (16 << anInt7123 * 1591782305 - 7));
		class475_sub1_sub5_80_.aShort10748
		    = (short) (class475_sub1_sub5_80_.aShort10748 * i_78_
			       / (16 << anInt7123 * 1591782305 - 7));
	    }
	}
    }
    
    public void method12122(int i) {
	for (int i_81_ = 0; i_81_ < -1933263771 * ((Class552) this).anInt7147;
	     i_81_++) {
	    Class475_Sub1_Sub1 class475_sub1_sub1
		= ((Class552) this).aClass475_Sub1_Sub1Array7158[i_81_];
	    method12130(class475_sub1_sub1, true, -195670470);
	    ((Class552) this).aClass475_Sub1_Sub1Array7158[i_81_] = null;
	}
	((Class552) this).anInt7147 = 0;
    }
    
    public Class475_Sub1_Sub3 method12123(int i, int i_82_, int i_83_,
					  byte i_84_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_82_][i_83_];
	if (null != class548) {
	    method12131(class548.aClass475_Sub1_Sub3_7055, (byte) -53);
	    if (class548.aClass475_Sub1_Sub3_7055 != null) {
		Class475_Sub1_Sub3 class475_sub1_sub3
		    = class548.aClass475_Sub1_Sub3_7055;
		class548.aClass475_Sub1_Sub3_7055 = null;
		return class475_sub1_sub3;
	    }
	}
	return null;
    }
    
    public Class475_Sub1_Sub3 method12124(int i, int i_85_, int i_86_,
					  int i_87_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_85_][i_86_];
	if (class548 != null) {
	    method12131(class548.aClass475_Sub1_Sub3_7056, (byte) -64);
	    if (null != class548.aClass475_Sub1_Sub3_7056) {
		Class475_Sub1_Sub3 class475_sub1_sub3
		    = class548.aClass475_Sub1_Sub3_7056;
		class548.aClass475_Sub1_Sub3_7056 = null;
		return class475_sub1_sub3;
	    }
	}
	return null;
    }
    
    public Class475_Sub1_Sub5 method12125(int i, int i_88_, int i_89_,
					  byte i_90_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_88_][i_89_];
	if (null != class548) {
	    method12131(class548.aClass475_Sub1_Sub5_7061, (byte) -5);
	    if (class548.aClass475_Sub1_Sub5_7061 != null) {
		Class475_Sub1_Sub5 class475_sub1_sub5
		    = class548.aClass475_Sub1_Sub5_7061;
		class548.aClass475_Sub1_Sub5_7061 = null;
		return class475_sub1_sub5;
	    }
	}
	return null;
    }
    
    public int method12126(int i, int i_91_, byte i_92_) {
	return (((Class552) this).aByteArrayArray7143 != null
		? ((Class552) this).aByteArrayArray7143[i][i_91_] & 0xff : 0);
    }
    
    public Class475_Sub1_Sub3 method12127(int i, int i_93_, int i_94_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_93_][i_94_];
	if (class548 == null)
	    return null;
	return class548.aClass475_Sub1_Sub3_7055;
    }
    
    public Class475_Sub1_Sub2 method12128(int i, int i_95_, int i_96_,
					  int i_97_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_95_][i_96_];
	if (class548 == null)
	    return null;
	Class475_Sub1_Sub2 class475_sub1_sub2
	    = ((Class548) class548).aClass475_Sub1_Sub2_7060;
	((Class548) class548).aClass475_Sub1_Sub2_7060 = null;
	method12131(class475_sub1_sub2, (byte) 106);
	return class475_sub1_sub2;
    }
    
    void method12129(Class475_Sub1 class475_sub1,
		     Class241_Sub43[] class241_sub43s) {
	if (((Class552) this).aBool7136) {
	    int i = class475_sub1.method14458(class241_sub43s, 1872027535);
	    ((Class552) this).aClass103_7127.method2317(i, class241_sub43s);
	}
	if (aClass166Array7140 == aClass166Array7184) {
	    boolean bool = false;
	    boolean bool_98_ = false;
	    Class287 class287 = class475_sub1.method10874().aClass287_4386;
	    int i;
	    int i_99_;
	    if (class475_sub1 instanceof Class475_Sub1_Sub1) {
		i = ((Class475_Sub1_Sub1) class475_sub1).aShort10717;
		i_99_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10718;
	    } else {
		i = (int) class287.aFloat4477 >> 1591782305 * anInt7123;
		i_99_ = (int) class287.aFloat4479 >> 1591782305 * anInt7123;
	    }
	    i = Math.min(120442351 * anInt7138 - 1, Math.max(0, i));
	    i_99_ = Math.min(anInt7142 * -2069974325 - 1, Math.max(0, i_99_));
	    Class86 class86 = new Class86();
	    class86.anInt1251 = method12200(i, i_99_, (byte) -25) * 271449803;
	    class86.anInt1252 = method12109(i, i_99_, 644023538) * 789618813;
	    class86.anInt1253 = method12126(i, i_99_, (byte) -2) * -2110386599;
	    class86.anInt1255 = method12202(i, i_99_, -179266136) * -456688723;
	    class86.anInt1256 = method12113(i, i_99_, 2127938739) * 1423284361;
	    class86.anInt1257 = method12246(i, i_99_, (byte) 1) * 1044755709;
	    ((Class552) this).aClass103_7127.method2335
		(aClass166Array7179[0].method3574((int) class287.aFloat4477,
						  (int) class287.aFloat4479,
						  -2085829610),
		 class86);
	}
	Class542 class542
	    = class475_sub1.method14455(((Class552) this).aClass103_7127,
					1921631283);
	if (null != class542) {
	    if (((Class542) class542).aBool7012) {
		class542.aClass475_Sub1_7011 = class475_sub1;
		aClass576_7180.method12662(class542, -61312495);
	    } else
		Class67.method1648(class542, 1054578886);
	}
    }
    
    void method12130(Class475_Sub1_Sub1 class475_sub1_sub1, boolean bool,
		     int i) {
	int i_100_ = Math.min(120442351 * anInt7138 - 1,
			      Math.max(0, class475_sub1_sub1.aShort10717));
	int i_101_ = Math.min(120442351 * anInt7138 - 1,
			      Math.max(0, class475_sub1_sub1.aShort10716));
	int i_102_ = Math.min(-2069974325 * anInt7142 - 1,
			      Math.max(0, class475_sub1_sub1.aShort10718));
	int i_103_ = Math.min(anInt7142 * -2069974325 - 1,
			      Math.max(0, class475_sub1_sub1.aShort10719));
	for (int i_104_ = i_100_; i_104_ <= i_101_; i_104_++) {
	    for (int i_105_ = i_102_; i_105_ <= i_103_; i_105_++) {
		Class548 class548
		    = (aClass548ArrayArrayArray7169
		       [class475_sub1_sub1.nodePlane][i_104_][i_105_]);
		if (class548 != null) {
		    Class541 class541 = class548.aClass541_7053;
		    Class541 class541_106_ = null;
		    for (/**/; null != class541;
			 class541 = class541.aClass541_7005) {
			if (class475_sub1_sub1
			    == class541.aClass475_Sub1_Sub1_7004) {
			    if (null != class541_106_)
				class541_106_.aClass541_7005
				    = class541.aClass541_7005;
			    else
				class548.aClass541_7053
				    = class541.aClass541_7005;
			    class541.method11935(1640486294);
			    break;
			}
			class541_106_ = class541;
		    }
		}
	    }
	}
	if (!bool)
	    method12131(class475_sub1_sub1, (byte) 6);
    }
    
    void method12131(Class475_Sub1 class475_sub1, byte i) {
	if (null != class475_sub1) {
	    class475_sub1.method10884();
	    for (int i_107_ = 0; i_107_ < 2; i_107_++) {
		Class475_Sub1 class475_sub1_108_ = null;
		for (Class475_Sub1 class475_sub1_109_
			 = ((Class552) this).aClass475_Sub1Array7151[i_107_];
		     null != class475_sub1_109_;
		     class475_sub1_109_ = (((Class475_Sub1) class475_sub1_109_)
					   .aClass475_Sub1_8743)) {
		    if (class475_sub1 == class475_sub1_109_) {
			if (null != class475_sub1_108_)
			    ((Class475_Sub1) class475_sub1_108_)
				.aClass475_Sub1_8743
				= (((Class475_Sub1) class475_sub1_109_)
				   .aClass475_Sub1_8743);
			else
			    ((Class552) this).aClass475_Sub1Array7151[i_107_]
				= (((Class475_Sub1) class475_sub1_109_)
				   .aClass475_Sub1_8743);
			return;
		    }
		    class475_sub1_108_ = class475_sub1_109_;
		}
		class475_sub1_108_ = null;
		for (Class475_Sub1 class475_sub1_110_
			 = ((Class552) this).aClass475_Sub1Array7168[i_107_];
		     class475_sub1_110_ != null;
		     class475_sub1_110_ = (((Class475_Sub1) class475_sub1_110_)
					   .aClass475_Sub1_8743)) {
		    if (class475_sub1 == class475_sub1_110_) {
			if (null != class475_sub1_108_)
			    ((Class475_Sub1) class475_sub1_108_)
				.aClass475_Sub1_8743
				= (((Class475_Sub1) class475_sub1_110_)
				   .aClass475_Sub1_8743);
			else
			    ((Class552) this).aClass475_Sub1Array7168[i_107_]
				= (((Class475_Sub1) class475_sub1_110_)
				   .aClass475_Sub1_8743);
			return;
		    }
		    class475_sub1_108_ = class475_sub1_110_;
		}
		class475_sub1_108_ = null;
		for (Class475_Sub1 class475_sub1_111_
			 = ((Class552) this).aClass475_Sub1Array7176[i_107_];
		     null != class475_sub1_111_;
		     class475_sub1_111_ = (((Class475_Sub1) class475_sub1_111_)
					   .aClass475_Sub1_8743)) {
		    if (class475_sub1_111_ == class475_sub1) {
			if (null != class475_sub1_108_)
			    ((Class475_Sub1) class475_sub1_108_)
				.aClass475_Sub1_8743
				= (((Class475_Sub1) class475_sub1_111_)
				   .aClass475_Sub1_8743);
			else
			    ((Class552) this).aClass475_Sub1Array7176[i_107_]
				= (((Class475_Sub1) class475_sub1_111_)
				   .aClass475_Sub1_8743);
			return;
		    }
		    class475_sub1_108_ = class475_sub1_111_;
		}
	    }
	}
    }
    
    public Class475_Sub1_Sub3 method12132(int i, int i_112_, int i_113_,
					  byte i_114_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_112_][i_113_];
	if (class548 == null)
	    return null;
	return class548.aClass475_Sub1_Sub3_7055;
    }
    
    public Class475_Sub1_Sub3 method12133(int i, int i_115_, int i_116_,
					  byte i_117_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_115_][i_116_];
	if (class548 == null)
	    return null;
	return class548.aClass475_Sub1_Sub3_7056;
    }
    
    public void method12134() {
	for (int i = 0; i < 120442351 * anInt7138; i++) {
	    for (int i_118_ = 0; i_118_ < -2069974325 * anInt7142; i_118_++) {
		if (aClass548ArrayArrayArray7169[0][i][i_118_] == null)
		    aClass548ArrayArrayArray7169[0][i][i_118_]
			= new Class548(0);
	    }
	}
    }
    
    public Class475_Sub1_Sub2 method12135(int i, int i_119_, int i_120_,
					  int i_121_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_119_][i_120_];
	if (null == class548)
	    return null;
	return ((Class548) class548).aClass475_Sub1_Sub2_7060;
    }
    
    public Class475_Sub1_Sub1 method12136
	(int i, int i_122_, int i_123_, Interface57 interface57, int i_124_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_122_][i_123_];
	if (class548 == null)
	    return null;
	for (Class541 class541 = class548.aClass541_7053; class541 != null;
	     class541 = class541.aClass541_7005) {
	    Class475_Sub1_Sub1 class475_sub1_sub1
		= class541.aClass475_Sub1_Sub1_7004;
	    if ((interface57 == null
		 || interface57.method430(class475_sub1_sub1, 776516352))
		&& i_122_ == class475_sub1_sub1.aShort10717
		&& i_123_ == class475_sub1_sub1.aShort10718)
		return class475_sub1_sub1;
	}
	return null;
    }
    
    public Class541 method12137(int i, int i_125_, int i_126_, int i_127_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_125_][i_126_];
	if (null == class548)
	    return null;
	return class548.aClass541_7053;
    }
    
    public void method12138() {
	for (int i = 0; i < ((Class552) this).anInt7129 * 1754722005; i++) {
	    if (!((Class552) this).aBoolArray7161[i]) {
		Class544 class544 = ((Class552) this).aClass544Array7178[i];
		Class241_Sub43 class241_sub43 = class544.aClass241_Sub43_7038;
		int i_128_ = 116093747 * class544.anInt7041;
		int i_129_ = (class241_sub43.method16468(1143403757)
			      - -558976661 * ((Class552) this).anInt7141);
		int i_130_ = 1 + (2 * i_129_ >> 1591782305 * anInt7123);
		int i_131_ = 0;
		int[] is = new int[i_130_ * i_130_];
		int i_132_ = (class241_sub43.method16453((byte) -3) - i_129_
			      >> anInt7123 * 1591782305);
		int i_133_ = (class241_sub43.method16455(626523592) - i_129_
			      >> anInt7123 * 1591782305);
		int i_134_ = (class241_sub43.method16455(626523592) + i_129_
			      >> anInt7123 * 1591782305);
		if (i_133_ < 0) {
		    i_131_ -= i_133_;
		    i_133_ = 0;
		}
		if (i_134_ >= anInt7142 * -2069974325)
		    i_134_ = -2069974325 * anInt7142 - 1;
		for (int i_135_ = i_133_; i_135_ <= i_134_; i_135_++) {
		    int i_136_ = ((Class544) class544).aShortArray7042[i_131_];
		    int i_137_ = i_136_ >>> 8;
		    int i_138_ = i_137_ + i_131_ * i_130_;
		    int i_139_ = (i_136_ >>> 8) + i_132_;
		    int i_140_ = i_139_ + (i_136_ & 0xff) - 1;
		    if (i_139_ < 0) {
			i_138_ -= i_139_;
			i_139_ = 0;
		    }
		    if (i_140_ >= anInt7138 * 120442351)
			i_140_ = 120442351 * anInt7138 - 1;
		    for (int i_141_ = i_139_; i_141_ <= i_140_; i_141_++) {
			int i_142_ = 1;
			Class475_Sub1_Sub1 class475_sub1_sub1
			    = method12136(i_128_, i_141_, i_135_, null,
					  -1823533258);
			if (null != class475_sub1_sub1
			    && (((Class475_Sub1_Sub1) class475_sub1_sub1)
				.aByte10721) != 0) {
			    if (1 == (((Class475_Sub1_Sub1) class475_sub1_sub1)
				      .aByte10721)) {
				boolean bool = i_141_ - 1 >= i_139_;
				boolean bool_143_ = i_141_ + 1 <= i_140_;
				if (!bool && i_135_ + 1 <= i_134_) {
				    int i_144_
					= (((Class544) class544)
					   .aShortArray7042[1 + i_131_]);
				    int i_145_ = (i_144_ >>> 8) + i_132_;
				    int i_146_ = i_145_ + (i_144_ & 0xff);
				    bool = i_141_ > i_145_ && i_141_ < i_146_;
				}
				if (!bool_143_ && i_135_ - 1 >= i_133_) {
				    int i_147_
					= (((Class544) class544)
					   .aShortArray7042[i_131_ - 1]);
				    int i_148_ = i_132_ + (i_147_ >>> 8);
				    int i_149_ = (i_147_ & 0xff) + i_148_;
				    bool_143_
					= i_141_ > i_148_ && i_141_ < i_149_;
				}
				if (bool && !bool_143_)
				    i_142_ = 4;
				else if (bool_143_ && !bool)
				    i_142_ = 2;
			    } else {
				boolean bool = i_141_ - 1 >= i_139_;
				boolean bool_150_ = i_141_ + 1 <= i_140_;
				if (!bool && i_135_ - 1 >= i_133_) {
				    int i_151_
					= (((Class544) class544)
					   .aShortArray7042[i_131_ - 1]);
				    int i_152_ = i_132_ + (i_151_ >>> 8);
				    int i_153_ = i_152_ + (i_151_ & 0xff);
				    bool = i_141_ > i_152_ && i_141_ < i_153_;
				}
				if (!bool_150_ && 1 + i_135_ <= i_134_) {
				    int i_154_
					= (((Class544) class544)
					   .aShortArray7042[1 + i_131_]);
				    int i_155_ = (i_154_ >>> 8) + i_132_;
				    int i_156_ = (i_154_ & 0xff) + i_155_;
				    bool_150_
					= i_141_ > i_155_ && i_141_ < i_156_;
				}
				if (bool && !bool_150_)
				    i_142_ = 3;
				else if (bool_150_ && !bool)
				    i_142_ = 5;
			    }
			}
			is[i_138_++] = i_142_;
		    }
		    i_131_++;
		}
		((Class552) this).aBoolArray7161[i] = true;
		if (aBool7152)
		    aClass166Array7184[i_128_].method3557(class241_sub43, is);
	    }
	}
    }
    
    public void method12139() {
	for (int i = 0; i < anInt7132 * 532429613; i++) {
	    for (int i_157_ = 0; i_157_ < anInt7138 * 120442351; i_157_++) {
		for (int i_158_ = 0; i_158_ < -2069974325 * anInt7142;
		     i_158_++) {
		    Class548 class548
			= aClass548ArrayArrayArray7169[i][i_157_][i_158_];
		    if (class548 != null) {
			Class475_Sub1_Sub3 class475_sub1_sub3
			    = class548.aClass475_Sub1_Sub3_7055;
			Class475_Sub1_Sub3 class475_sub1_sub3_159_
			    = class548.aClass475_Sub1_Sub3_7056;
			if (class475_sub1_sub3 != null
			    && class475_sub1_sub3.method14450(1372942798)) {
			    method12141(class475_sub1_sub3, i, i_157_, i_158_,
					1, 1);
			    if (class475_sub1_sub3_159_ != null
				&& class475_sub1_sub3_159_
				       .method14450(-1369031437)) {
				method12141(class475_sub1_sub3_159_, i, i_157_,
					    i_158_, 1, 1);
				class475_sub1_sub3_159_.method14453
				    (((Class552) this).aClass103_7127,
				     class475_sub1_sub3, 0, 0, 0, false,
				     2040522734);
				class475_sub1_sub3_159_
				    .method14454((byte) -77);
			    }
			    class475_sub1_sub3.method14454((byte) -100);
			}
			for (Class541 class541 = class548.aClass541_7053;
			     class541 != null;
			     class541 = class541.aClass541_7005) {
			    Class475_Sub1_Sub1 class475_sub1_sub1
				= class541.aClass475_Sub1_Sub1_7004;
			    if (null != class475_sub1_sub1
				&& class475_sub1_sub1
				       .method14450(-390174825)) {
				method12141(class475_sub1_sub1, i, i_157_,
					    i_158_,
					    1 + (class475_sub1_sub1.aShort10716
						 - (class475_sub1_sub1
						    .aShort10717)),
					    (class475_sub1_sub1.aShort10719
					     - class475_sub1_sub1.aShort10718
					     + 1));
				class475_sub1_sub1.method14454((byte) -101);
			    }
			}
			Class475_Sub1_Sub4 class475_sub1_sub4
			    = class548.aClass475_Sub1_Sub4_7058;
			if (class475_sub1_sub4 != null
			    && class475_sub1_sub4.method14450(-1272784641)) {
			    method12195(class475_sub1_sub4, i, i_157_, i_158_,
					481205794);
			    class475_sub1_sub4.method14454((byte) -21);
			}
		    }
		}
	    }
	}
    }
    
    public void method12140(int i, int i_160_, int i_161_, int i_162_,
			    int i_163_, int i_164_, int i_165_, int i_166_,
			    int i_167_) {
	if (((Class552) this).anIntArrayArray7166 != null)
	    ((Class552) this).anIntArrayArray7166[i][i_160_]
		= ~0xffffff | i_161_;
	if (((Class552) this).aShortArrayArray7133 != null)
	    ((Class552) this).aShortArrayArray7133[i][i_160_] = (short) i_162_;
	if (((Class552) this).aByteArrayArray7143 != null)
	    ((Class552) this).aByteArrayArray7143[i][i_160_] = (byte) i_163_;
	if (null != ((Class552) this).aByteArrayArray7144)
	    ((Class552) this).aByteArrayArray7144[i][i_160_] = (byte) i_164_;
	if (((Class552) this).aByteArrayArray7183 != null)
	    ((Class552) this).aByteArrayArray7183[i][i_160_] = (byte) i_165_;
	if (((Class552) this).aByteArrayArray7146 != null)
	    ((Class552) this).aByteArrayArray7146[i][i_160_] = (byte) i_166_;
    }
    
    void method12141(Class475_Sub1 class475_sub1, int i, int i_168_,
		     int i_169_, int i_170_, int i_171_) {
	boolean bool = true;
	int i_172_ = i_168_;
	int i_173_ = i_168_ + i_170_;
	int i_174_ = i_169_ - 1;
	int i_175_ = i_169_ + i_171_;
	for (int i_176_ = i; i_176_ <= i + 1; i_176_++) {
	    if (anInt7132 * 532429613 != i_176_) {
		for (int i_177_ = i_172_; i_177_ <= i_173_; i_177_++) {
		    if (i_177_ >= 0 && i_177_ < 120442351 * anInt7138) {
			for (int i_178_ = i_174_; i_178_ <= i_175_; i_178_++) {
			    if (i_178_ >= 0 && i_178_ < anInt7142 * -2069974325
				&& (!bool || i_177_ >= i_173_
				    || i_178_ >= i_175_
				    || i_178_ < i_169_ && i_168_ != i_177_)) {
				Class548 class548
				    = (aClass548ArrayArrayArray7169[i_176_]
				       [i_177_][i_178_]);
				if (null != class548) {
				    int i_179_
					= (((aClass166Array7184[i_176_]
						 .method3551
					     (i_177_, i_178_, -1472247700))
					    + (aClass166Array7184[i_176_]
						   .method3551
					       (i_177_ + 1, i_178_,
						-261271582))
					    + (aClass166Array7184[i_176_]
						   .method3551
					       (i_177_, i_178_ + 1, 840086377))
					    + (aClass166Array7184[i_176_]
						   .method3551
					       (i_177_ + 1, 1 + i_178_,
						-802872355))) / 4
					   - ((aClass166Array7184[i].method3551
					       (i_168_, i_169_, 131038))
					      + (aClass166Array7184[i]
						     .method3551
						 (i_168_ + 1, i_169_,
						  804178668))
					      + (aClass166Array7184[i]
						     .method3551
						 (i_168_, i_169_ + 1,
						  -2073308215))
					      + (aClass166Array7184[i]
						     .method3551
						 (1 + i_168_, i_169_ + 1,
						  590718692))) / 4);
				    Class475_Sub1_Sub3 class475_sub1_sub3
					= class548.aClass475_Sub1_Sub3_7055;
				    Class475_Sub1_Sub3 class475_sub1_sub3_180_
					= class548.aClass475_Sub1_Sub3_7056;
				    if (class475_sub1_sub3 != null
					&& class475_sub1_sub3
					       .method14450(576574638))
					class475_sub1.method14453
					    (((Class552) this).aClass103_7127,
					     class475_sub1_sub3,
					     (((1 - i_170_)
					       * (-558976661
						  * (((Class552) this)
						     .anInt7141)))
					      + (((Class552) this).anInt7124
						 * -1302211377
						 * (i_177_ - i_168_))),
					     i_179_,
					     (((1 - i_171_)
					       * (-558976661
						  * (((Class552) this)
						     .anInt7141)))
					      + (((Class552) this).anInt7124
						 * -1302211377
						 * (i_178_ - i_169_))),
					     bool, 2127384343);
				    if (null != class475_sub1_sub3_180_
					&& class475_sub1_sub3_180_
					       .method14450(1690016601))
					class475_sub1.method14453
					    (((Class552) this).aClass103_7127,
					     class475_sub1_sub3_180_,
					     (((1 - i_170_)
					       * (((Class552) this).anInt7141
						  * -558976661))
					      + ((i_177_ - i_168_)
						 * (((Class552) this).anInt7124
						    * -1302211377))),
					     i_179_,
					     ((-1302211377
					       * ((Class552) this).anInt7124
					       * (i_178_ - i_169_))
					      + (-558976661
						 * ((Class552) this).anInt7141
						 * (1 - i_171_))),
					     bool, 2128099089);
				    for (Class541 class541
					     = class548.aClass541_7053;
					 class541 != null;
					 class541 = class541.aClass541_7005) {
					Class475_Sub1_Sub1 class475_sub1_sub1
					    = (class541
					       .aClass475_Sub1_Sub1_7004);
					if (null != class475_sub1_sub1
					    && class475_sub1_sub1
						   .method14450(-97255622)
					    && ((class475_sub1_sub1.aShort10717
						 == i_177_)
						|| i_172_ == i_177_)
					    && (i_178_ == (class475_sub1_sub1
							   .aShort10718)
						|| i_178_ == i_174_)) {
					    int i_181_
						= 1 + ((class475_sub1_sub1
							.aShort10716)
						       - (class475_sub1_sub1
							  .aShort10717));
					    int i_182_
						= 1 + ((class475_sub1_sub1
							.aShort10719)
						       - (class475_sub1_sub1
							  .aShort10718));
					    class475_sub1.method14453
						((((Class552) this)
						  .aClass103_7127),
						 class475_sub1_sub1,
						 (((i_181_ - i_170_)
						   * ((((Class552) this)
						       .anInt7141)
						      * -558976661))
						  + (((class475_sub1_sub1
						       .aShort10717)
						      - i_168_)
						     * (-1302211377
							* (((Class552) this)
							   .anInt7124)))),
						 i_179_,
						 ((((Class552) this).anInt7124
						   * -1302211377
						   * ((class475_sub1_sub1
						       .aShort10718)
						      - i_169_))
						  + ((((Class552) this)
						      .anInt7141)
						     * -558976661
						     * (i_182_ - i_171_))),
						 bool, 2120281643);
					}
				    }
				}
			    }
			}
		    }
		}
		i_172_--;
		bool = false;
	    }
	}
    }
    
    public Class475_Sub1_Sub4 method12142(int i, int i_183_, int i_184_,
					  int i_185_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_183_][i_184_];
	if (null == class548)
	    return null;
	method12131(class548.aClass475_Sub1_Sub4_7058, (byte) 37);
	if (class548.aClass475_Sub1_Sub4_7058 != null) {
	    Class475_Sub1_Sub4 class475_sub1_sub4
		= class548.aClass475_Sub1_Sub4_7058;
	    class548.aClass475_Sub1_Sub4_7058 = null;
	    return class475_sub1_sub4;
	}
	return null;
    }
    
    void method12143(boolean bool, byte[][][] is, int i, byte i_186_,
		     int i_187_) {
	int i_188_ = bool ? 1 : 0;
	((Class552) this).anInt7154 = 0;
	((Class552) this).anInt7155 = 0;
	((Class552) this).anInt7164 += -1784631545;
	if (0 == (i_187_ & 0x2)) {
	    for (Class475_Sub1 class475_sub1
		     = ((Class552) this).aClass475_Sub1Array7151[i_188_];
		 class475_sub1 != null;
		 class475_sub1
		     = ((Class475_Sub1) class475_sub1).aClass475_Sub1_8743) {
		method12213(class475_sub1, -1044123494);
		if ((1364632497 * ((Class475_Sub1) class475_sub1).anInt8747
		     != -1)
		    && !method12147(class475_sub1, bool, is, i, i_186_))
		    ((Class552) this).aClass475_Sub1Array7157
			[((((Class552) this).anInt7154 += -1237267015)
			  * -1357567863) - 1]
			= class475_sub1;
	    }
	}
	if (0 == (i_187_ & 0x1)) {
	    for (Class475_Sub1 class475_sub1
		     = ((Class552) this).aClass475_Sub1Array7168[i_188_];
		 null != class475_sub1;
		 class475_sub1
		     = ((Class475_Sub1) class475_sub1).aClass475_Sub1_8743) {
		method12213(class475_sub1, -1740419043);
		if ((1364632497 * ((Class475_Sub1) class475_sub1).anInt8747
		     != -1)
		    && !method12147(class475_sub1, bool, is, i, i_186_))
		    ((Class552) this).aClass475_Sub1Array7156
			[((((Class552) this).anInt7155 += -542324275)
			  * -679130363) - 1]
			= class475_sub1;
	    }
	    for (Class475_Sub1 class475_sub1
		     = ((Class552) this).aClass475_Sub1Array7176[i_188_];
		 class475_sub1 != null;
		 class475_sub1
		     = ((Class475_Sub1) class475_sub1).aClass475_Sub1_8743) {
		method12213(class475_sub1, 1164045725);
		if ((-1
		     != 1364632497 * ((Class475_Sub1) class475_sub1).anInt8747)
		    && !method12147(class475_sub1, bool, is, i, i_186_)) {
		    if (class475_sub1.method14452((byte) -35))
			((Class552) this).aClass475_Sub1Array7156
			    [((((Class552) this).anInt7155 += -542324275)
			      * -679130363) - 1]
			    = class475_sub1;
		    else
			((Class552) this).aClass475_Sub1Array7157
			    [((((Class552) this).anInt7154 += -1237267015)
			      * -1357567863) - 1]
			    = class475_sub1;
		}
	    }
	    if (!bool) {
		for (int i_189_ = 0;
		     i_189_ < ((Class552) this).anInt7147 * -1933263771;
		     i_189_++) {
		    method12213((((Class552) this).aClass475_Sub1_Sub1Array7158
				 [i_189_]),
				-94709551);
		    if ((((Class475_Sub1_Sub1) (((Class552) this)
						.aClass475_Sub1_Sub1Array7158
						[i_189_])).anInt8747
			 * 1364632497) != -1
			&& !method12147((((Class552) this)
					 .aClass475_Sub1_Sub1Array7158
					 [i_189_]),
					bool, is, i, i_186_)) {
			if (((Class552) this).aClass475_Sub1_Sub1Array7158
				[i_189_].method14452((byte) 21))
			    ((Class552) this).aClass475_Sub1Array7156
				[((((Class552) this).anInt7155 += -542324275)
				  * -679130363) - 1]
				= (((Class552) this)
				   .aClass475_Sub1_Sub1Array7158[i_189_]);
			else
			    ((Class552) this).aClass475_Sub1Array7157
				[((((Class552) this).anInt7154 += -1237267015)
				  * -1357567863) - 1]
				= (((Class552) this)
				   .aClass475_Sub1_Sub1Array7158[i_189_]);
		    }
		}
	    }
	}
	if (-1357567863 * ((Class552) this).anInt7154 > 0) {
	    method12146(((Class552) this).aClass475_Sub1Array7157, 0,
			((Class552) this).anInt7154 * -1357567863 - 1);
	    for (int i_190_ = 0;
		 i_190_ < ((Class552) this).anInt7154 * -1357567863; i_190_++)
		method12148(((Class552) this).aClass475_Sub1Array7157[i_190_],
			    ((Class552) this).aClass241_Sub43Array7173);
	}
	if (((Class552) this).aBool7136)
	    ((Class552) this).aClass103_7127.method2317(0, null);
	if (0 == (i_187_ & 0x2)) {
	    for (int i_191_ = 0; i_191_ < 532429613 * anInt7132; i_191_++) {
		if (i_191_ >= i && is != null) {
		    int i_192_ = ((Class552) this).aBoolArrayArray7134.length;
		    if ((((Class552) this).aBoolArrayArray7134.length
			 + ((Class552) this).anInt7125 * -728696637)
			> 120442351 * anInt7138)
			i_192_
			    -= (((Class552) this).anInt7125 * -728696637
				+ ((Class552) this).aBoolArrayArray7134.length
				- anInt7138 * 120442351);
		    int i_193_
			= ((Class552) this).aBoolArrayArray7134[0].length;
		    if ((-1866739569 * ((Class552) this).anInt7170
			 + ((Class552) this).aBoolArrayArray7134[0].length)
			> anInt7142 * -2069974325)
			i_193_
			    -= (((Class552) this).aBoolArrayArray7134[0].length
				+ -1866739569 * ((Class552) this).anInt7170
				- -2069974325 * anInt7142);
		    boolean[][] bools = ((Class552) this).aBoolArrayArray7181;
		    if (((Class552) this).aBool7130) {
			for (int i_194_
				 = -181472661 * ((Class552) this).anInt7122;
			     i_194_ < i_192_; i_194_++) {
			    int i_195_
				= (i_194_
				   + -728696637 * ((Class552) this).anInt7125
				   - -181472661 * ((Class552) this).anInt7122);
			    for (int i_196_ = (((Class552) this).anInt7167
					       * -580117089);
				 i_196_ < i_193_; i_196_++) {
				bools[i_194_][i_196_] = false;
				if (((Class552) this).aBoolArrayArray7134
				    [i_194_][i_196_]) {
				    int i_197_
					= ((((Class552) this).anInt7170
					    * -1866739569)
					   + i_196_
					   - (-580117089
					      * ((Class552) this).anInt7167));
				    for (int i_198_ = i_191_; i_198_ >= 0;
					 i_198_--) {
					if ((null
					     != (aClass548ArrayArrayArray7169
						 [i_198_][i_195_][i_197_]))
					    && (aClass548ArrayArrayArray7169
						[i_198_][i_195_][i_197_]
						.aByte7054) == i_191_) {
					    if ((i_198_ >= i
						 && (is[i_198_][i_195_][i_197_]
						     == i_186_))
						|| (aClass550_7131.method12043
						    (i_191_, i_195_, i_197_)))
						bools[i_194_][i_196_] = false;
					    else
						bools[i_194_][i_196_] = true;
					    break;
					}
				    }
				}
			    }
			}
		    }
		    aClass166Array7184[i_191_].method3547
			(-985319149 * ((Class552) this).anInt7128,
			 -1234452287 * ((Class552) this).anInt7160,
			 1222806433 * ((Class552) this).anInt7165,
			 ((Class552) this).aBoolArrayArray7181, false, i_187_);
		} else {
		    int i_199_ = ((Class552) this).aBoolArrayArray7134.length;
		    if ((-728696637 * ((Class552) this).anInt7125
			 + ((Class552) this).aBoolArrayArray7134.length)
			> 120442351 * anInt7138)
			i_199_
			    -= (((Class552) this).anInt7125 * -728696637
				+ ((Class552) this).aBoolArrayArray7134.length
				- anInt7138 * 120442351);
		    int i_200_
			= ((Class552) this).aBoolArrayArray7134[0].length;
		    if ((((Class552) this).aBoolArrayArray7134[0].length
			 + ((Class552) this).anInt7170 * -1866739569)
			> anInt7142 * -2069974325)
			i_200_ -= (((Class552) this).anInt7170 * -1866739569
				   + (((Class552) this).aBoolArrayArray7134
				      [0]).length
				   - -2069974325 * anInt7142);
		    boolean[][] bools = ((Class552) this).aBoolArrayArray7181;
		    if (((Class552) this).aBool7130) {
			for (int i_201_
				 = -181472661 * ((Class552) this).anInt7122;
			     i_201_ < i_199_; i_201_++) {
			    int i_202_
				= (-728696637 * ((Class552) this).anInt7125
				   + i_201_
				   - ((Class552) this).anInt7122 * -181472661);
			    for (int i_203_ = (((Class552) this).anInt7167
					       * -580117089);
				 i_203_ < i_200_; i_203_++) {
				if ((((Class552) this).aBoolArrayArray7134
				     [i_201_][i_203_])
				    && !(aClass550_7131.method12043
					 (i_191_, i_202_,
					  (i_203_
					   + (((Class552) this).anInt7170
					      * -1866739569)
					   - (((Class552) this).anInt7167
					      * -580117089)))))
				    bools[i_201_][i_203_] = true;
				else
				    bools[i_201_][i_203_] = false;
			    }
			}
		    }
		    aClass166Array7184[i_191_].method3547
			(-985319149 * ((Class552) this).anInt7128,
			 -1234452287 * ((Class552) this).anInt7160,
			 1222806433 * ((Class552) this).anInt7165,
			 ((Class552) this).aBoolArrayArray7181, true, i_187_);
		}
	    }
	}
	if (-679130363 * ((Class552) this).anInt7155 > 0) {
	    method12238(((Class552) this).aClass475_Sub1Array7156, 0,
			((Class552) this).anInt7155 * -679130363 - 1);
	    for (int i_204_ = 0;
		 i_204_ < ((Class552) this).anInt7155 * -679130363; i_204_++)
		method12148(((Class552) this).aClass475_Sub1Array7156[i_204_],
			    ((Class552) this).aClass241_Sub43Array7173);
	}
    }
    
    public void method12144
	(int i, int i_205_, int i_206_, int i_207_, byte[][][] is,
	 int[] is_208_, int[] is_209_, int[] is_210_, int[] is_211_,
	 int[] is_212_, int i_213_, byte i_214_, int i_215_, int i_216_,
	 boolean bool, boolean bool_217_, int i_218_, boolean bool_219_) {
	((Class550) aClass550_7131).aBool7091 = true;
	((Class552) this).aBool7130 = bool_217_;
	((Class552) this).anInt7128
	    = 1199798555 * (i_205_ >> 1591782305 * anInt7123);
	((Class552) this).anInt7160
	    = (i_207_ >> anInt7123 * 1591782305) * -1211576511;
	((Class552) this).anInt7153 = -1632632143 * i_205_;
	((Class552) this).anInt7162 = -1203496281 * i_207_;
	((Class552) this).anInt7163 = i_206_ * -646808425;
	((Class552) this).anInt7125
	    = (((Class552) this).anInt7128 * -263440015
	       - ((Class552) this).anInt7165 * -725548085);
	if (-728696637 * ((Class552) this).anInt7125 < 0) {
	    ((Class552) this).anInt7122
		= -(473569545 * ((Class552) this).anInt7125);
	    ((Class552) this).anInt7125 = 0;
	} else
	    ((Class552) this).anInt7122 = 0;
	((Class552) this).anInt7170
	    = (1088315823 * ((Class552) this).anInt7160
	       - ((Class552) this).anInt7165 * -1479501617);
	if (((Class552) this).anInt7170 * -1866739569 < 0) {
	    ((Class552) this).anInt7167
		= -(-491682031 * ((Class552) this).anInt7170);
	    ((Class552) this).anInt7170 = 0;
	} else
	    ((Class552) this).anInt7167 = 0;
	((Class552) this).anInt7139
	    = (-906515853 * ((Class552) this).anInt7128
	       + ((Class552) this).anInt7165 * -2061994815);
	if (-579244319 * ((Class552) this).anInt7139 > anInt7138 * 120442351)
	    ((Class552) this).anInt7139 = 1866458831 * anInt7138;
	((Class552) this).anInt7171
	    = (499362943 * ((Class552) this).anInt7160
	       + ((Class552) this).anInt7165 * -1460733537);
	if (-1599933761 * ((Class552) this).anInt7171
	    > -2069974325 * anInt7142)
	    ((Class552) this).anInt7171 = -1337581835 * anInt7142;
	boolean[][] bools = ((Class552) this).aBoolArrayArray7134;
	boolean[][] bools_220_ = ((Class552) this).aBoolArrayArray7181;
	if (((Class552) this).aBool7130) {
	    for (int i_221_ = 0;
		 i_221_ < 2 + (1222806433 * ((Class552) this).anInt7165
			       + 1222806433 * ((Class552) this).anInt7165);
		 i_221_++) {
		int i_222_ = 0;
		int i_223_ = 0;
		for (int i_224_ = 0;
		     i_224_ < 2 + (((Class552) this).anInt7165 * 1222806433
				   + 1222806433 * ((Class552) this).anInt7165);
		     i_224_++) {
		    if (i_224_ > 1)
			((Class552) this).anIntArray7145[i_224_ - 2] = i_222_;
		    i_222_ = i_223_;
		    int i_225_ = (((Class552) this).anInt7128 * -985319149
				  - 1222806433 * ((Class552) this).anInt7165
				  + i_221_);
		    int i_226_ = (-1234452287 * ((Class552) this).anInt7160
				  - ((Class552) this).anInt7165 * 1222806433
				  + i_224_);
		    if (i_225_ >= 0 && i_226_ >= 0
			&& i_225_ < anInt7138 * 120442351
			&& i_226_ < anInt7142 * -2069974325) {
			int i_227_ = i_225_ << 1591782305 * anInt7123;
			int i_228_ = i_226_ << anInt7123 * 1591782305;
			int i_229_
			    = (aClass166Array7179
				   [aClass166Array7179.length - 1]
				   .method3551(i_225_, i_226_, -1254664235)
			       - (1000 << 1591782305 * anInt7123 - 7));
			int i_230_
			    = ((aClass166Array7140 != null
				? (aClass166Array7140[0]
				       .method3551(i_225_, i_226_, -285816382)
				   + -1302211377 * ((Class552) this).anInt7124)
				: (aClass166Array7179[0]
				       .method3551(i_225_, i_226_, -1145500899)
				   + (-1302211377
				      * ((Class552) this).anInt7124)))
			       + (1000 << anInt7123 * 1591782305 - 7));
			i_223_ = (((Class552) this).aClass103_7127.method2412
				  (i_227_, i_229_, i_228_, i_227_, i_230_,
				   i_228_));
			((Class552) this).aBoolArrayArray7181[i_221_][i_224_]
			    = 0 == i_223_;
		    } else {
			i_223_ = -1;
			((Class552) this).aBoolArrayArray7181[i_221_][i_224_]
			    = false;
		    }
		    if (i_221_ > 0 && i_224_ > 0) {
			int i_231_
			    = (((Class552) this).anIntArray7145[i_224_ - 1]
			       & ((Class552) this).anIntArray7145[i_224_]
			       & i_222_ & i_223_);
			((Class552) this).aBoolArrayArray7134[i_221_ - 1]
			    [i_224_ - 1]
			    = 0 == i_231_;
		    }
		}
		((Class552) this).anIntArray7145
		    [(1222806433 * ((Class552) this).anInt7165
		      + ((Class552) this).anInt7165 * 1222806433)]
		    = i_222_;
		((Class552) this).anIntArray7145
		    [(1222806433 * ((Class552) this).anInt7165
		      + 1222806433 * ((Class552) this).anInt7165 + 1)]
		    = i_223_;
	    }
	    if (!bool_219_)
		((Class550) aClass550_7131).aBool7091 = false;
	    else {
		((Class550) aClass550_7131).anIntArray7109 = is_208_;
		((Class550) aClass550_7131).anIntArray7095 = is_209_;
		((Class550) aClass550_7131).anIntArray7106 = is_210_;
		((Class550) aClass550_7131).anIntArray7119 = is_211_;
		((Class550) aClass550_7131).anIntArray7096 = is_212_;
		aClass550_7131.method12039(((Class552) this).aClass103_7127,
					   i_213_);
	    }
	} else {
	    if (((Class552) this).aBoolArrayArray7137 == null)
		((Class552) this).aBoolArrayArray7137
		    = (new boolean
		       [2 + (((Class552) this).anInt7165 * 1222806433
			     + 1222806433 * ((Class552) this).anInt7165)]
		       [(1222806433 * ((Class552) this).anInt7165
			 + ((Class552) this).anInt7165 * 1222806433 + 2)]);
	    for (int i_232_ = 0;
		 i_232_ < ((Class552) this).aBoolArrayArray7137.length;
		 i_232_++) {
		for (int i_233_ = 0;
		     i_233_ < ((Class552) this).aBoolArrayArray7137[0].length;
		     i_233_++)
		    ((Class552) this).aBoolArrayArray7137[i_232_][i_233_]
			= true;
	    }
	    ((Class552) this).aBoolArrayArray7181
		= ((Class552) this).aBoolArrayArray7137;
	    ((Class552) this).aBoolArrayArray7134
		= ((Class552) this).aBoolArrayArray7137;
	    ((Class552) this).anInt7125 = 0;
	    ((Class552) this).anInt7170 = 0;
	    ((Class552) this).anInt7139 = anInt7138 * 1866458831;
	    ((Class552) this).anInt7171 = anInt7142 * -1337581835;
	    ((Class550) aClass550_7131).aBool7091 = false;
	}
	Class220.method4385(this, ((Class552) this).aClass103_7127,
			    1422291134);
	if (!((Class576) aClass576_7180).aBool7444) {
	    Iterator iterator = aClass576_7180.aList7447.iterator();
	    while (iterator.hasNext()) {
		Class542 class542 = (Class542) iterator.next();
		iterator.remove();
		Class67.method1648(class542, 1472075518);
	    }
	}
	if (((Class552) this).aBool7136) {
	    for (int i_234_ = 0;
		 i_234_ < ((Class552) this).anInt7129 * 1754722005; i_234_++)
		((Class552) this).aClass544Array7178[i_234_]
		    .method11980(i, bool, 508304326);
	}
	if (null != aClass548ArrayArrayArray7135) {
	    method12102(true, (byte) -56);
	    ((Class552) this).aClass103_7127
		.method2334(-1, new Class86(1583160, 40, 127, 63, 0, 0, 0));
	    method12143(true, is, i_213_, i_214_, i_218_);
	    ((Class552) this).aClass103_7127.method2336();
	    method12102(false, (byte) -32);
	}
	method12143(false, is, i_213_, i_214_, i_218_);
	if (!((Class552) this).aBool7130) {
	    ((Class552) this).aBoolArrayArray7134 = bools;
	    ((Class552) this).aBoolArrayArray7181 = bools_220_;
	}
    }
    
    public int method12145(int i, int i_235_) {
	return (null != ((Class552) this).aByteArrayArray7146
		? ((Class552) this).aByteArrayArray7146[i][i_235_] & 0xff : 0);
    }
    
    void method12146(Class475_Sub1[] class475_sub1s, int i, int i_236_) {
	if (i < i_236_) {
	    int i_237_ = (i + i_236_) / 2;
	    int i_238_ = i;
	    Class475_Sub1 class475_sub1 = class475_sub1s[i_237_];
	    class475_sub1s[i_237_] = class475_sub1s[i_236_];
	    class475_sub1s[i_236_] = class475_sub1;
	    int i_239_
		= ((Class475_Sub1) class475_sub1).anInt8747 * 1364632497;
	    for (int i_240_ = i; i_240_ < i_236_; i_240_++) {
		if ((1364632497
		     * ((Class475_Sub1) class475_sub1s[i_240_]).anInt8747)
		    < (i_240_ & 0x1) + i_239_) {
		    Class475_Sub1 class475_sub1_241_ = class475_sub1s[i_240_];
		    class475_sub1s[i_240_] = class475_sub1s[i_238_];
		    class475_sub1s[i_238_++] = class475_sub1_241_;
		}
	    }
	    class475_sub1s[i_236_] = class475_sub1s[i_238_];
	    class475_sub1s[i_238_] = class475_sub1;
	    method12146(class475_sub1s, i, i_238_ - 1);
	    method12146(class475_sub1s, i_238_ + 1, i_236_);
	}
    }
    
    boolean method12147(Class475_Sub1 class475_sub1, boolean bool,
			byte[][][] is, int i, byte i_242_) {
	if (!((Class552) this).aBool7130)
	    return false;
	if (class475_sub1 instanceof Class475_Sub1_Sub1) {
	    int i_243_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10716;
	    int i_244_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10719;
	    int i_245_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10717;
	    int i_246_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10718;
	    for (int i_247_ = i_245_; i_247_ <= i_243_; i_247_++) {
		for (int i_248_ = i_246_; i_248_ <= i_244_; i_248_++) {
		    if (class475_sub1.aByte8745 < anInt7132 * 532429613
			&& i_247_ >= -728696637 * ((Class552) this).anInt7125
			&& i_247_ < ((Class552) this).anInt7139 * -579244319
			&& i_248_ >= -1866739569 * ((Class552) this).anInt7170
			&& (i_248_
			    < -1599933761 * ((Class552) this).anInt7171)) {
			if ((null != is && class475_sub1.nodePlane >= i
			     && (is[class475_sub1.nodePlane][i_247_][i_248_]
				 == i_242_))
			    || !class475_sub1.method14460(-303702116)
			    || class475_sub1.method14496((((Class552) this)
							  .aClass103_7127),
							 (byte) 109)) {
			    if (!bool
				&& i_247_ >= (((Class552) this).anInt7128
					      * -985319149) - 16
				&& i_247_ <= 16 + (((Class552) this).anInt7128
						   * -985319149)
				&& i_248_ >= -1234452287 * (((Class552) this)
							    .anInt7160) - 16
				&& i_248_ <= -1234452287 * (((Class552) this)
							    .anInt7160) + 16)
				class475_sub1.method14493((((Class552) this)
							   .aClass103_7127),
							  (byte) 102);
			    return true;
			}
			return false;
		    }
		}
	    }
	    return true;
	}
	Class287 class287 = class475_sub1.method10874().aClass287_4386;
	int i_249_ = (int) class287.aFloat4477 >> 1591782305 * anInt7123;
	int i_250_ = (int) class287.aFloat4479 >> anInt7123 * 1591782305;
	if (class475_sub1.aByte8745 < anInt7132 * 532429613
	    && i_249_ >= -728696637 * ((Class552) this).anInt7125
	    && i_249_ < -579244319 * ((Class552) this).anInt7139
	    && i_250_ >= ((Class552) this).anInt7170 * -1866739569
	    && i_250_ < -1599933761 * ((Class552) this).anInt7171) {
	    if ((null != is && class475_sub1.nodePlane >= i
		 && is[class475_sub1.nodePlane][i_249_][i_250_] == i_242_)
		|| !class475_sub1.method14460(-1860610766)
		|| class475_sub1.method14496(((Class552) this).aClass103_7127,
					     (byte) 109)) {
		if (!bool
		    && i_249_ >= -985319149 * ((Class552) this).anInt7128 - 16
		    && i_249_ <= 16 + -985319149 * ((Class552) this).anInt7128
		    && i_250_ >= -1234452287 * ((Class552) this).anInt7160 - 16
		    && (i_250_
			<= 16 + ((Class552) this).anInt7160 * -1234452287))
		    class475_sub1.method14493(((Class552) this).aClass103_7127,
					      (byte) 102);
		return true;
	    }
	    return false;
	}
	return true;
    }
    
    void method12148(Class475_Sub1 class475_sub1,
		     Class241_Sub43[] class241_sub43s) {
	if (((Class552) this).aBool7136) {
	    int i = class475_sub1.method14458(class241_sub43s, 1124844389);
	    ((Class552) this).aClass103_7127.method2317(i, class241_sub43s);
	}
	if (aClass166Array7140 == aClass166Array7184) {
	    boolean bool = false;
	    boolean bool_251_ = false;
	    Class287 class287 = class475_sub1.method10874().aClass287_4386;
	    int i;
	    int i_252_;
	    if (class475_sub1 instanceof Class475_Sub1_Sub1) {
		i = ((Class475_Sub1_Sub1) class475_sub1).aShort10717;
		i_252_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10718;
	    } else {
		i = (int) class287.aFloat4477 >> 1591782305 * anInt7123;
		i_252_ = (int) class287.aFloat4479 >> 1591782305 * anInt7123;
	    }
	    i = Math.min(120442351 * anInt7138 - 1, Math.max(0, i));
	    i_252_
		= Math.min(anInt7142 * -2069974325 - 1, Math.max(0, i_252_));
	    Class86 class86 = new Class86();
	    class86.anInt1251 = method12200(i, i_252_, (byte) -62) * 271449803;
	    class86.anInt1252 = method12109(i, i_252_, 644023538) * 789618813;
	    class86.anInt1253
		= method12126(i, i_252_, (byte) 105) * -2110386599;
	    class86.anInt1255
		= method12202(i, i_252_, -179266136) * -456688723;
	    class86.anInt1256
		= method12113(i, i_252_, 1934604214) * 1423284361;
	    class86.anInt1257 = method12246(i, i_252_, (byte) 1) * 1044755709;
	    ((Class552) this).aClass103_7127.method2335
		(aClass166Array7179[0].method3574((int) class287.aFloat4477,
						  (int) class287.aFloat4479,
						  -1218865609),
		 class86);
	}
	Class542 class542
	    = class475_sub1.method14455(((Class552) this).aClass103_7127,
					-715262277);
	if (null != class542) {
	    if (((Class542) class542).aBool7012) {
		class542.aClass475_Sub1_7011 = class475_sub1;
		aClass576_7180.method12662(class542, -699311631);
	    } else
		Class67.method1648(class542, 1680465219);
	}
    }
    
    public void method12149(int i, byte i_253_) {
	/* empty */
    }
    
    public void method12150(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			    int i_254_, int i_255_, boolean[] bools,
			    int i_256_) {
	if (aClass166Array7140 != aClass166Array7184) {
	    int i_257_
		= aClass166Array7179[i].method3574(i_254_, i_255_, 672015354);
	    for (int i_258_ = 0; i_258_ <= i; i_258_++) {
		if (null == bools || bools[i_258_]) {
		    Class166 class166 = aClass166Array7179[i_258_];
		    if (null != class166)
			class166.method3555(class241_sub39_sub17, i_254_,
					    (i_257_
					     - class166.method3574(i_254_,
								   i_255_,
								   245337262)),
					    i_255_, 0, false);
		}
	    }
	}
    }
    
    void method12151(int i, int i_259_, int i_260_) {
	Class241_Sub39_Sub17 class241_sub39_sub17 = null;
	for (int i_261_ = i; i_261_ < i_259_; i_261_++) {
	    Class166 class166 = aClass166Array7179[i_261_];
	    if (null != class166) {
		for (int i_262_ = 0; i_262_ < anInt7142 * -2069974325;
		     i_262_++) {
		    for (int i_263_ = 0; i_263_ < anInt7138 * 120442351;
			 i_263_++) {
			class241_sub39_sub17
			    = class166.method3553(i_263_, i_262_,
						  class241_sub39_sub17);
			if (null != class241_sub39_sub17) {
			    int i_264_ = i_263_ << 1591782305 * anInt7123;
			    int i_265_ = i_262_ << anInt7123 * 1591782305;
			    for (int i_266_ = i_261_ - 1; i_266_ >= 0;
				 i_266_--) {
				Class166 class166_267_
				    = aClass166Array7179[i_266_];
				if (null != class166_267_) {
				    int i_268_
					= (class166.method3551(i_263_, i_262_,
							       -1346524395)
					   - (class166_267_.method3551
					      (i_263_, i_262_, -26594339)));
				    int i_269_
					= (class166.method3551(1 + i_263_,
							       i_262_,
							       -2051656973)
					   - (class166_267_.method3551
					      (1 + i_263_, i_262_,
					       -1071169095)));
				    int i_270_
					= (class166.method3551(i_263_ + 1,
							       i_262_ + 1,
							       -9681626)
					   - (class166_267_.method3551
					      (1 + i_263_, i_262_ + 1,
					       -245048409)));
				    int i_271_
					= (class166.method3551(i_263_,
							       i_262_ + 1,
							       651992778)
					   - (class166_267_.method3551
					      (i_263_, i_262_ + 1,
					       710031263)));
				    class166_267_.method3554
					(class241_sub39_sub17, i_264_,
					 (i_271_
					  + (i_270_ + (i_268_ + i_269_))) / 4,
					 i_265_, 0, false);
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method12152(int i) {
	method12151(1, 532429613 * anInt7132, -667859793);
    }
    
    public void method12153(Class544 class544, int i) {
	if (1754722005 * ((Class552) this).anInt7129 < 65074) {
	    Class241_Sub43 class241_sub43 = class544.aClass241_Sub43_7038;
	    ((Class552) this).aClass544Array7178[(((Class552) this).anInt7129
						  * 1754722005)]
		= class544;
	    ((Class552) this).aBoolArray7161[(((Class552) this).anInt7129
					      * 1754722005)]
		= false;
	    ((Class552) this).anInt7129 += 960289405;
	    int i_272_ = 116093747 * class544.anInt7041;
	    if (((Class544) class544).aBool7040)
		i_272_ = 0;
	    int i_273_ = class544.anInt7041 * 116093747;
	    if (((Class544) class544).aBool7018)
		i_273_ = 532429613 * anInt7132 - 1;
	    for (int i_274_ = i_272_; i_274_ <= i_273_; i_274_++) {
		int i_275_ = 0;
		int i_276_ = ((class241_sub43.method16455(626523592)
			       - class241_sub43.method16468(1143403757)
			       + -558976661 * ((Class552) this).anInt7141)
			      >> anInt7123 * 1591782305);
		if (i_276_ < 0) {
		    i_275_ -= i_276_;
		    i_276_ = 0;
		}
		int i_277_ = ((class241_sub43.method16455(626523592)
			       + class241_sub43.method16468(1143403757)
			       - ((Class552) this).anInt7141 * -558976661)
			      >> 1591782305 * anInt7123);
		if (i_277_ >= -2069974325 * anInt7142)
		    i_277_ = -2069974325 * anInt7142 - 1;
		for (int i_278_ = i_276_; i_278_ <= i_277_; i_278_++) {
		    int i_279_
			= ((Class544) class544).aShortArray7042[i_275_++];
		    int i_280_ = (((class241_sub43.method16453((byte) -77)
				    - class241_sub43.method16468(1143403757)
				    + ((Class552) this).anInt7141 * -558976661)
				   >> 1591782305 * anInt7123)
				  + (i_279_ >>> 8));
		    int i_281_ = i_280_ + (i_279_ & 0xff) - 1;
		    if (i_280_ < 0)
			i_280_ = 0;
		    if (i_281_ >= 120442351 * anInt7138)
			i_281_ = anInt7138 * 120442351 - 1;
		    for (int i_282_ = i_280_; i_282_ <= i_281_; i_282_++) {
			long l = (((Class552) this).aLongArrayArrayArray7177
				  [i_274_][i_282_][i_278_]);
			if ((l & 0xffffL) == 0L)
			    ((Class552) this).aLongArrayArrayArray7177
				[i_274_][i_282_][i_278_]
				= l | (long) (1754722005
					      * ((Class552) this).anInt7129);
			else if ((l & 0xffff0000L) == 0L)
			    ((Class552) this).aLongArrayArrayArray7177
				[i_274_][i_282_][i_278_]
				= l | (long) (((Class552) this).anInt7129
					      * 1754722005) << 16;
			else if ((l & 0xffff00000000L) == 0L)
			    ((Class552) this).aLongArrayArrayArray7177
				[i_274_][i_282_][i_278_]
				= l | ((long) (1754722005
					       * ((Class552) this).anInt7129)
				       << 32);
			else if ((l & ~0xffffffffffffL) == 0L)
			    ((Class552) this).aLongArrayArrayArray7177
				[i_274_][i_282_][i_278_]
				= l | ((long) (1754722005
					       * ((Class552) this).anInt7129)
				       << 48);
		    }
		}
	    }
	}
    }
    
    public void method12154(int i) {
	for (int i_283_ = 0; i_283_ < ((Class552) this).anInt7129 * 1754722005;
	     i_283_++) {
	    if (!((Class552) this).aBoolArray7161[i_283_]) {
		Class544 class544
		    = ((Class552) this).aClass544Array7178[i_283_];
		Class241_Sub43 class241_sub43 = class544.aClass241_Sub43_7038;
		int i_284_ = 116093747 * class544.anInt7041;
		int i_285_ = (class241_sub43.method16468(1143403757)
			      - -558976661 * ((Class552) this).anInt7141);
		int i_286_ = 1 + (2 * i_285_ >> 1591782305 * anInt7123);
		int i_287_ = 0;
		int[] is = new int[i_286_ * i_286_];
		int i_288_ = (class241_sub43.method16453((byte) -33) - i_285_
			      >> anInt7123 * 1591782305);
		int i_289_ = (class241_sub43.method16455(626523592) - i_285_
			      >> anInt7123 * 1591782305);
		int i_290_ = (class241_sub43.method16455(626523592) + i_285_
			      >> anInt7123 * 1591782305);
		if (i_289_ < 0) {
		    i_287_ -= i_289_;
		    i_289_ = 0;
		}
		if (i_290_ >= anInt7142 * -2069974325)
		    i_290_ = -2069974325 * anInt7142 - 1;
		for (int i_291_ = i_289_; i_291_ <= i_290_; i_291_++) {
		    int i_292_ = ((Class544) class544).aShortArray7042[i_287_];
		    int i_293_ = i_292_ >>> 8;
		    int i_294_ = i_293_ + i_287_ * i_286_;
		    int i_295_ = (i_292_ >>> 8) + i_288_;
		    int i_296_ = i_295_ + (i_292_ & 0xff) - 1;
		    if (i_295_ < 0) {
			i_294_ -= i_295_;
			i_295_ = 0;
		    }
		    if (i_296_ >= anInt7138 * 120442351)
			i_296_ = 120442351 * anInt7138 - 1;
		    for (int i_297_ = i_295_; i_297_ <= i_296_; i_297_++) {
			int i_298_ = 1;
			Class475_Sub1_Sub1 class475_sub1_sub1
			    = method12136(i_284_, i_297_, i_291_, null,
					  -1823446018);
			if (null != class475_sub1_sub1
			    && (((Class475_Sub1_Sub1) class475_sub1_sub1)
				.aByte10721) != 0) {
			    if (1 == (((Class475_Sub1_Sub1) class475_sub1_sub1)
				      .aByte10721)) {
				boolean bool = i_297_ - 1 >= i_295_;
				boolean bool_299_ = i_297_ + 1 <= i_296_;
				if (!bool && i_291_ + 1 <= i_290_) {
				    int i_300_
					= (((Class544) class544)
					   .aShortArray7042[1 + i_287_]);
				    int i_301_ = (i_300_ >>> 8) + i_288_;
				    int i_302_ = i_301_ + (i_300_ & 0xff);
				    bool = i_297_ > i_301_ && i_297_ < i_302_;
				}
				if (!bool_299_ && i_291_ - 1 >= i_289_) {
				    int i_303_
					= (((Class544) class544)
					   .aShortArray7042[i_287_ - 1]);
				    int i_304_ = i_288_ + (i_303_ >>> 8);
				    int i_305_ = (i_303_ & 0xff) + i_304_;
				    bool_299_
					= i_297_ > i_304_ && i_297_ < i_305_;
				}
				if (bool && !bool_299_)
				    i_298_ = 4;
				else if (bool_299_ && !bool)
				    i_298_ = 2;
			    } else {
				boolean bool = i_297_ - 1 >= i_295_;
				boolean bool_306_ = i_297_ + 1 <= i_296_;
				if (!bool && i_291_ - 1 >= i_289_) {
				    int i_307_
					= (((Class544) class544)
					   .aShortArray7042[i_287_ - 1]);
				    int i_308_ = i_288_ + (i_307_ >>> 8);
				    int i_309_ = i_308_ + (i_307_ & 0xff);
				    bool = i_297_ > i_308_ && i_297_ < i_309_;
				}
				if (!bool_306_ && 1 + i_291_ <= i_290_) {
				    int i_310_
					= (((Class544) class544)
					   .aShortArray7042[1 + i_287_]);
				    int i_311_ = (i_310_ >>> 8) + i_288_;
				    int i_312_ = (i_310_ & 0xff) + i_311_;
				    bool_306_
					= i_297_ > i_311_ && i_297_ < i_312_;
				}
				if (bool && !bool_306_)
				    i_298_ = 3;
				else if (bool_306_ && !bool)
				    i_298_ = 5;
			    }
			}
			is[i_294_++] = i_298_;
		    }
		    i_287_++;
		}
		((Class552) this).aBoolArray7161[i_283_] = true;
		if (aBool7152)
		    aClass166Array7184[i_284_].method3557(class241_sub43, is);
	    }
	}
    }
    
    boolean method12155(Class475_Sub1 class475_sub1, boolean bool,
			byte[][][] is, int i, byte i_313_) {
	if (!((Class552) this).aBool7130)
	    return false;
	if (class475_sub1 instanceof Class475_Sub1_Sub1) {
	    int i_314_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10716;
	    int i_315_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10719;
	    int i_316_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10717;
	    int i_317_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10718;
	    for (int i_318_ = i_316_; i_318_ <= i_314_; i_318_++) {
		for (int i_319_ = i_317_; i_319_ <= i_315_; i_319_++) {
		    if (class475_sub1.aByte8745 < anInt7132 * 532429613
			&& i_318_ >= -728696637 * ((Class552) this).anInt7125
			&& i_318_ < ((Class552) this).anInt7139 * -579244319
			&& i_319_ >= -1866739569 * ((Class552) this).anInt7170
			&& (i_319_
			    < -1599933761 * ((Class552) this).anInt7171)) {
			if ((null != is && class475_sub1.nodePlane >= i
			     && (is[class475_sub1.nodePlane][i_318_][i_319_]
				 == i_313_))
			    || !class475_sub1.method14460(-2081197770)
			    || class475_sub1.method14496((((Class552) this)
							  .aClass103_7127),
							 (byte) 109)) {
			    if (!bool
				&& i_318_ >= (((Class552) this).anInt7128
					      * -985319149) - 16
				&& i_318_ <= 16 + (((Class552) this).anInt7128
						   * -985319149)
				&& i_319_ >= -1234452287 * (((Class552) this)
							    .anInt7160) - 16
				&& i_319_ <= -1234452287 * (((Class552) this)
							    .anInt7160) + 16)
				class475_sub1.method14493((((Class552) this)
							   .aClass103_7127),
							  (byte) 102);
			    return true;
			}
			return false;
		    }
		}
	    }
	    return true;
	}
	Class287 class287 = class475_sub1.method10874().aClass287_4386;
	int i_320_ = (int) class287.aFloat4477 >> 1591782305 * anInt7123;
	int i_321_ = (int) class287.aFloat4479 >> anInt7123 * 1591782305;
	if (class475_sub1.aByte8745 < anInt7132 * 532429613
	    && i_320_ >= -728696637 * ((Class552) this).anInt7125
	    && i_320_ < -579244319 * ((Class552) this).anInt7139
	    && i_321_ >= ((Class552) this).anInt7170 * -1866739569
	    && i_321_ < -1599933761 * ((Class552) this).anInt7171) {
	    if ((null != is && class475_sub1.nodePlane >= i
		 && is[class475_sub1.nodePlane][i_320_][i_321_] == i_313_)
		|| !class475_sub1.method14460(-1846858426)
		|| class475_sub1.method14496(((Class552) this).aClass103_7127,
					     (byte) 109)) {
		if (!bool
		    && i_320_ >= -985319149 * ((Class552) this).anInt7128 - 16
		    && i_320_ <= 16 + -985319149 * ((Class552) this).anInt7128
		    && i_321_ >= -1234452287 * ((Class552) this).anInt7160 - 16
		    && (i_321_
			<= 16 + ((Class552) this).anInt7160 * -1234452287))
		    class475_sub1.method14493(((Class552) this).aClass103_7127,
					      (byte) 102);
		return true;
	    }
	    return false;
	}
	return true;
    }
    
    public void method12156(int i) {
	/* empty */
    }
    
    public void method12157(int i) {
	/* empty */
    }
    
    public void method12158(int i) {
	/* empty */
    }
    
    void method12159(boolean bool, byte[][][] is, int i, byte i_322_,
		     int i_323_) {
	int i_324_ = bool ? 1 : 0;
	((Class552) this).anInt7154 = 0;
	((Class552) this).anInt7155 = 0;
	((Class552) this).anInt7164 += -1784631545;
	if (0 == (i_323_ & 0x2)) {
	    for (Class475_Sub1 class475_sub1
		     = ((Class552) this).aClass475_Sub1Array7151[i_324_];
		 class475_sub1 != null;
		 class475_sub1
		     = ((Class475_Sub1) class475_sub1).aClass475_Sub1_8743) {
		method12213(class475_sub1, -1750562237);
		if ((1364632497 * ((Class475_Sub1) class475_sub1).anInt8747
		     != -1)
		    && !method12147(class475_sub1, bool, is, i, i_322_))
		    ((Class552) this).aClass475_Sub1Array7157
			[((((Class552) this).anInt7154 += -1237267015)
			  * -1357567863) - 1]
			= class475_sub1;
	    }
	}
	if (0 == (i_323_ & 0x1)) {
	    for (Class475_Sub1 class475_sub1
		     = ((Class552) this).aClass475_Sub1Array7168[i_324_];
		 null != class475_sub1;
		 class475_sub1
		     = ((Class475_Sub1) class475_sub1).aClass475_Sub1_8743) {
		method12213(class475_sub1, 512186761);
		if ((1364632497 * ((Class475_Sub1) class475_sub1).anInt8747
		     != -1)
		    && !method12147(class475_sub1, bool, is, i, i_322_))
		    ((Class552) this).aClass475_Sub1Array7156
			[((((Class552) this).anInt7155 += -542324275)
			  * -679130363) - 1]
			= class475_sub1;
	    }
	    for (Class475_Sub1 class475_sub1
		     = ((Class552) this).aClass475_Sub1Array7176[i_324_];
		 class475_sub1 != null;
		 class475_sub1
		     = ((Class475_Sub1) class475_sub1).aClass475_Sub1_8743) {
		method12213(class475_sub1, 1400492064);
		if ((-1
		     != 1364632497 * ((Class475_Sub1) class475_sub1).anInt8747)
		    && !method12147(class475_sub1, bool, is, i, i_322_)) {
		    if (class475_sub1.method14452((byte) 93))
			((Class552) this).aClass475_Sub1Array7156
			    [((((Class552) this).anInt7155 += -542324275)
			      * -679130363) - 1]
			    = class475_sub1;
		    else
			((Class552) this).aClass475_Sub1Array7157
			    [((((Class552) this).anInt7154 += -1237267015)
			      * -1357567863) - 1]
			    = class475_sub1;
		}
	    }
	    if (!bool) {
		for (int i_325_ = 0;
		     i_325_ < ((Class552) this).anInt7147 * -1933263771;
		     i_325_++) {
		    method12213((((Class552) this).aClass475_Sub1_Sub1Array7158
				 [i_325_]),
				-1759914887);
		    if ((((Class475_Sub1_Sub1) (((Class552) this)
						.aClass475_Sub1_Sub1Array7158
						[i_325_])).anInt8747
			 * 1364632497) != -1
			&& !method12147((((Class552) this)
					 .aClass475_Sub1_Sub1Array7158
					 [i_325_]),
					bool, is, i, i_322_)) {
			if (((Class552) this).aClass475_Sub1_Sub1Array7158
				[i_325_].method14452((byte) 51))
			    ((Class552) this).aClass475_Sub1Array7156
				[((((Class552) this).anInt7155 += -542324275)
				  * -679130363) - 1]
				= (((Class552) this)
				   .aClass475_Sub1_Sub1Array7158[i_325_]);
			else
			    ((Class552) this).aClass475_Sub1Array7157
				[((((Class552) this).anInt7154 += -1237267015)
				  * -1357567863) - 1]
				= (((Class552) this)
				   .aClass475_Sub1_Sub1Array7158[i_325_]);
		    }
		}
	    }
	}
	if (-1357567863 * ((Class552) this).anInt7154 > 0) {
	    method12146(((Class552) this).aClass475_Sub1Array7157, 0,
			((Class552) this).anInt7154 * -1357567863 - 1);
	    for (int i_326_ = 0;
		 i_326_ < ((Class552) this).anInt7154 * -1357567863; i_326_++)
		method12148(((Class552) this).aClass475_Sub1Array7157[i_326_],
			    ((Class552) this).aClass241_Sub43Array7173);
	}
	if (((Class552) this).aBool7136)
	    ((Class552) this).aClass103_7127.method2317(0, null);
	if (0 == (i_323_ & 0x2)) {
	    for (int i_327_ = 0; i_327_ < 532429613 * anInt7132; i_327_++) {
		if (i_327_ >= i && is != null) {
		    int i_328_ = ((Class552) this).aBoolArrayArray7134.length;
		    if ((((Class552) this).aBoolArrayArray7134.length
			 + ((Class552) this).anInt7125 * -728696637)
			> 120442351 * anInt7138)
			i_328_
			    -= (((Class552) this).anInt7125 * -728696637
				+ ((Class552) this).aBoolArrayArray7134.length
				- anInt7138 * 120442351);
		    int i_329_
			= ((Class552) this).aBoolArrayArray7134[0].length;
		    if ((-1866739569 * ((Class552) this).anInt7170
			 + ((Class552) this).aBoolArrayArray7134[0].length)
			> anInt7142 * -2069974325)
			i_329_
			    -= (((Class552) this).aBoolArrayArray7134[0].length
				+ -1866739569 * ((Class552) this).anInt7170
				- -2069974325 * anInt7142);
		    boolean[][] bools = ((Class552) this).aBoolArrayArray7181;
		    if (((Class552) this).aBool7130) {
			for (int i_330_
				 = -181472661 * ((Class552) this).anInt7122;
			     i_330_ < i_328_; i_330_++) {
			    int i_331_
				= (i_330_
				   + -728696637 * ((Class552) this).anInt7125
				   - -181472661 * ((Class552) this).anInt7122);
			    for (int i_332_ = (((Class552) this).anInt7167
					       * -580117089);
				 i_332_ < i_329_; i_332_++) {
				bools[i_330_][i_332_] = false;
				if (((Class552) this).aBoolArrayArray7134
				    [i_330_][i_332_]) {
				    int i_333_
					= ((((Class552) this).anInt7170
					    * -1866739569)
					   + i_332_
					   - (-580117089
					      * ((Class552) this).anInt7167));
				    for (int i_334_ = i_327_; i_334_ >= 0;
					 i_334_--) {
					if ((null
					     != (aClass548ArrayArrayArray7169
						 [i_334_][i_331_][i_333_]))
					    && (aClass548ArrayArrayArray7169
						[i_334_][i_331_][i_333_]
						.aByte7054) == i_327_) {
					    if ((i_334_ >= i
						 && (is[i_334_][i_331_][i_333_]
						     == i_322_))
						|| (aClass550_7131.method12043
						    (i_327_, i_331_, i_333_)))
						bools[i_330_][i_332_] = false;
					    else
						bools[i_330_][i_332_] = true;
					    break;
					}
				    }
				}
			    }
			}
		    }
		    aClass166Array7184[i_327_].method3547
			(-985319149 * ((Class552) this).anInt7128,
			 -1234452287 * ((Class552) this).anInt7160,
			 1222806433 * ((Class552) this).anInt7165,
			 ((Class552) this).aBoolArrayArray7181, false, i_323_);
		} else {
		    int i_335_ = ((Class552) this).aBoolArrayArray7134.length;
		    if ((-728696637 * ((Class552) this).anInt7125
			 + ((Class552) this).aBoolArrayArray7134.length)
			> 120442351 * anInt7138)
			i_335_
			    -= (((Class552) this).anInt7125 * -728696637
				+ ((Class552) this).aBoolArrayArray7134.length
				- anInt7138 * 120442351);
		    int i_336_
			= ((Class552) this).aBoolArrayArray7134[0].length;
		    if ((((Class552) this).aBoolArrayArray7134[0].length
			 + ((Class552) this).anInt7170 * -1866739569)
			> anInt7142 * -2069974325)
			i_336_ -= (((Class552) this).anInt7170 * -1866739569
				   + (((Class552) this).aBoolArrayArray7134
				      [0]).length
				   - -2069974325 * anInt7142);
		    boolean[][] bools = ((Class552) this).aBoolArrayArray7181;
		    if (((Class552) this).aBool7130) {
			for (int i_337_
				 = -181472661 * ((Class552) this).anInt7122;
			     i_337_ < i_335_; i_337_++) {
			    int i_338_
				= (-728696637 * ((Class552) this).anInt7125
				   + i_337_
				   - ((Class552) this).anInt7122 * -181472661);
			    for (int i_339_ = (((Class552) this).anInt7167
					       * -580117089);
				 i_339_ < i_336_; i_339_++) {
				if ((((Class552) this).aBoolArrayArray7134
				     [i_337_][i_339_])
				    && !(aClass550_7131.method12043
					 (i_327_, i_338_,
					  (i_339_
					   + (((Class552) this).anInt7170
					      * -1866739569)
					   - (((Class552) this).anInt7167
					      * -580117089)))))
				    bools[i_337_][i_339_] = true;
				else
				    bools[i_337_][i_339_] = false;
			    }
			}
		    }
		    aClass166Array7184[i_327_].method3547
			(-985319149 * ((Class552) this).anInt7128,
			 -1234452287 * ((Class552) this).anInt7160,
			 1222806433 * ((Class552) this).anInt7165,
			 ((Class552) this).aBoolArrayArray7181, true, i_323_);
		}
	    }
	}
	if (-679130363 * ((Class552) this).anInt7155 > 0) {
	    method12238(((Class552) this).aClass475_Sub1Array7156, 0,
			((Class552) this).anInt7155 * -679130363 - 1);
	    for (int i_340_ = 0;
		 i_340_ < ((Class552) this).anInt7155 * -679130363; i_340_++)
		method12148(((Class552) this).aClass475_Sub1Array7156[i_340_],
			    ((Class552) this).aClass241_Sub43Array7173);
	}
    }
    
    public void method12160() {
	for (int i = 0; i < 120442351 * anInt7138; i++) {
	    for (int i_341_ = 0; i_341_ < -2069974325 * anInt7142; i_341_++) {
		if (aClass548ArrayArrayArray7169[0][i][i_341_] == null)
		    aClass548ArrayArrayArray7169[0][i][i_341_]
			= new Class548(0);
	    }
	}
    }
    
    public void method12161(int i, int i_342_) {
	Class548 class548 = aClass548ArrayArrayArray7169[0][i][i_342_];
	for (int i_343_ = 0; i_343_ < 3; i_343_++) {
	    Class548 class548_344_
		= (aClass548ArrayArrayArray7169[i_343_][i][i_342_]
		   = aClass548ArrayArrayArray7169[1 + i_343_][i][i_342_]);
	    if (null != class548_344_) {
		for (Class541 class541 = class548_344_.aClass541_7053;
		     class541 != null; class541 = class541.aClass541_7005) {
		    Class475_Sub1_Sub1 class475_sub1_sub1
			= class541.aClass475_Sub1_Sub1_7004;
		    if (class475_sub1_sub1.aShort10717 == i
			&& i_342_ == class475_sub1_sub1.aShort10718)
			class475_sub1_sub1.nodePlane--;
		}
		if (null != class548_344_.aClass475_Sub1_Sub4_7058)
		    class548_344_.aClass475_Sub1_Sub4_7058.nodePlane--;
		if (null != class548_344_.aClass475_Sub1_Sub3_7055)
		    class548_344_.aClass475_Sub1_Sub3_7055.nodePlane--;
		if (class548_344_.aClass475_Sub1_Sub3_7056 != null)
		    class548_344_.aClass475_Sub1_Sub3_7056.nodePlane--;
		if (null != class548_344_.aClass475_Sub1_Sub5_7061)
		    class548_344_.aClass475_Sub1_Sub5_7061.nodePlane--;
		if (class548_344_.aClass475_Sub1_Sub5_7059 != null)
		    class548_344_.aClass475_Sub1_Sub5_7059.nodePlane--;
	    }
	}
	if (aClass548ArrayArrayArray7169[0][i][i_342_] == null) {
	    aClass548ArrayArrayArray7169[0][i][i_342_] = new Class548(0);
	    aClass548ArrayArrayArray7169[0][i][i_342_].aByte7054 = (byte) 1;
	}
	aClass548ArrayArrayArray7169[0][i][i_342_].aClass548_7063 = class548;
	aClass548ArrayArrayArray7169[3][i][i_342_] = null;
    }
    
    public Class475_Sub1_Sub5 method12162(int i, int i_345_, int i_346_,
					  int i_347_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_345_][i_346_];
	if (class548 == null)
	    return null;
	return class548.aClass475_Sub1_Sub5_7061;
    }
    
    Class548 method12163(int i, int i_348_, int i_349_) {
	if (aClass548ArrayArrayArray7169[i][i_348_][i_349_] == null) {
	    boolean bool
		= (aClass548ArrayArrayArray7169[0][i_348_][i_349_] != null
		   && (aClass548ArrayArrayArray7169[0][i_348_][i_349_]
		       .aClass548_7063) != null);
	    if (bool && i >= anInt7132 * 532429613 - 1)
		return null;
	    method12107(i, i_348_, i_349_, -1312960481);
	}
	return aClass548ArrayArrayArray7169[i][i_348_][i_349_];
    }
    
    public void method12164
	(int i, int i_350_, int i_351_, int i_352_, byte[][][] is,
	 int[] is_353_, int[] is_354_, int[] is_355_, int[] is_356_,
	 int[] is_357_, int i_358_, byte i_359_, int i_360_, int i_361_,
	 boolean bool, boolean bool_362_, int i_363_, boolean bool_364_) {
	((Class550) aClass550_7131).aBool7091 = true;
	((Class552) this).aBool7130 = bool_362_;
	((Class552) this).anInt7128
	    = 1199798555 * (i_350_ >> 1591782305 * anInt7123);
	((Class552) this).anInt7160
	    = (i_352_ >> anInt7123 * 1591782305) * -1211576511;
	((Class552) this).anInt7153 = -1632632143 * i_350_;
	((Class552) this).anInt7162 = -1203496281 * i_352_;
	((Class552) this).anInt7163 = i_351_ * -646808425;
	((Class552) this).anInt7125
	    = (((Class552) this).anInt7128 * -263440015
	       - ((Class552) this).anInt7165 * -725548085);
	if (-728696637 * ((Class552) this).anInt7125 < 0) {
	    ((Class552) this).anInt7122
		= -(473569545 * ((Class552) this).anInt7125);
	    ((Class552) this).anInt7125 = 0;
	} else
	    ((Class552) this).anInt7122 = 0;
	((Class552) this).anInt7170
	    = (1088315823 * ((Class552) this).anInt7160
	       - ((Class552) this).anInt7165 * -1479501617);
	if (((Class552) this).anInt7170 * -1866739569 < 0) {
	    ((Class552) this).anInt7167
		= -(-491682031 * ((Class552) this).anInt7170);
	    ((Class552) this).anInt7170 = 0;
	} else
	    ((Class552) this).anInt7167 = 0;
	((Class552) this).anInt7139
	    = (-906515853 * ((Class552) this).anInt7128
	       + ((Class552) this).anInt7165 * -2061994815);
	if (-579244319 * ((Class552) this).anInt7139 > anInt7138 * 120442351)
	    ((Class552) this).anInt7139 = 1866458831 * anInt7138;
	((Class552) this).anInt7171
	    = (499362943 * ((Class552) this).anInt7160
	       + ((Class552) this).anInt7165 * -1460733537);
	if (-1599933761 * ((Class552) this).anInt7171
	    > -2069974325 * anInt7142)
	    ((Class552) this).anInt7171 = -1337581835 * anInt7142;
	boolean[][] bools = ((Class552) this).aBoolArrayArray7134;
	boolean[][] bools_365_ = ((Class552) this).aBoolArrayArray7181;
	if (((Class552) this).aBool7130) {
	    for (int i_366_ = 0;
		 i_366_ < 2 + (1222806433 * ((Class552) this).anInt7165
			       + 1222806433 * ((Class552) this).anInt7165);
		 i_366_++) {
		int i_367_ = 0;
		int i_368_ = 0;
		for (int i_369_ = 0;
		     i_369_ < 2 + (((Class552) this).anInt7165 * 1222806433
				   + 1222806433 * ((Class552) this).anInt7165);
		     i_369_++) {
		    if (i_369_ > 1)
			((Class552) this).anIntArray7145[i_369_ - 2] = i_367_;
		    i_367_ = i_368_;
		    int i_370_ = (((Class552) this).anInt7128 * -985319149
				  - 1222806433 * ((Class552) this).anInt7165
				  + i_366_);
		    int i_371_ = (-1234452287 * ((Class552) this).anInt7160
				  - ((Class552) this).anInt7165 * 1222806433
				  + i_369_);
		    if (i_370_ >= 0 && i_371_ >= 0
			&& i_370_ < anInt7138 * 120442351
			&& i_371_ < anInt7142 * -2069974325) {
			int i_372_ = i_370_ << 1591782305 * anInt7123;
			int i_373_ = i_371_ << anInt7123 * 1591782305;
			int i_374_
			    = (aClass166Array7179
				   [aClass166Array7179.length - 1]
				   .method3551(i_370_, i_371_, -2027019564)
			       - (1000 << 1591782305 * anInt7123 - 7));
			int i_375_
			    = ((aClass166Array7140 != null
				? (aClass166Array7140[0]
				       .method3551(i_370_, i_371_, -1574468024)
				   + -1302211377 * ((Class552) this).anInt7124)
				: (aClass166Array7179[0]
				       .method3551(i_370_, i_371_, -1034744139)
				   + (-1302211377
				      * ((Class552) this).anInt7124)))
			       + (1000 << anInt7123 * 1591782305 - 7));
			i_368_ = (((Class552) this).aClass103_7127.method2412
				  (i_372_, i_374_, i_373_, i_372_, i_375_,
				   i_373_));
			((Class552) this).aBoolArrayArray7181[i_366_][i_369_]
			    = 0 == i_368_;
		    } else {
			i_368_ = -1;
			((Class552) this).aBoolArrayArray7181[i_366_][i_369_]
			    = false;
		    }
		    if (i_366_ > 0 && i_369_ > 0) {
			int i_376_
			    = (((Class552) this).anIntArray7145[i_369_ - 1]
			       & ((Class552) this).anIntArray7145[i_369_]
			       & i_367_ & i_368_);
			((Class552) this).aBoolArrayArray7134[i_366_ - 1]
			    [i_369_ - 1]
			    = 0 == i_376_;
		    }
		}
		((Class552) this).anIntArray7145
		    [(1222806433 * ((Class552) this).anInt7165
		      + ((Class552) this).anInt7165 * 1222806433)]
		    = i_367_;
		((Class552) this).anIntArray7145
		    [(1222806433 * ((Class552) this).anInt7165
		      + 1222806433 * ((Class552) this).anInt7165 + 1)]
		    = i_368_;
	    }
	    if (!bool_364_)
		((Class550) aClass550_7131).aBool7091 = false;
	    else {
		((Class550) aClass550_7131).anIntArray7109 = is_353_;
		((Class550) aClass550_7131).anIntArray7095 = is_354_;
		((Class550) aClass550_7131).anIntArray7106 = is_355_;
		((Class550) aClass550_7131).anIntArray7119 = is_356_;
		((Class550) aClass550_7131).anIntArray7096 = is_357_;
		aClass550_7131.method12039(((Class552) this).aClass103_7127,
					   i_358_);
	    }
	} else {
	    if (((Class552) this).aBoolArrayArray7137 == null)
		((Class552) this).aBoolArrayArray7137
		    = (new boolean
		       [2 + (((Class552) this).anInt7165 * 1222806433
			     + 1222806433 * ((Class552) this).anInt7165)]
		       [(1222806433 * ((Class552) this).anInt7165
			 + ((Class552) this).anInt7165 * 1222806433 + 2)]);
	    for (int i_377_ = 0;
		 i_377_ < ((Class552) this).aBoolArrayArray7137.length;
		 i_377_++) {
		for (int i_378_ = 0;
		     i_378_ < ((Class552) this).aBoolArrayArray7137[0].length;
		     i_378_++)
		    ((Class552) this).aBoolArrayArray7137[i_377_][i_378_]
			= true;
	    }
	    ((Class552) this).aBoolArrayArray7181
		= ((Class552) this).aBoolArrayArray7137;
	    ((Class552) this).aBoolArrayArray7134
		= ((Class552) this).aBoolArrayArray7137;
	    ((Class552) this).anInt7125 = 0;
	    ((Class552) this).anInt7170 = 0;
	    ((Class552) this).anInt7139 = anInt7138 * 1866458831;
	    ((Class552) this).anInt7171 = anInt7142 * -1337581835;
	    ((Class550) aClass550_7131).aBool7091 = false;
	}
	Class220.method4385(this, ((Class552) this).aClass103_7127,
			    1239059543);
	if (!((Class576) aClass576_7180).aBool7444) {
	    Iterator iterator = aClass576_7180.aList7447.iterator();
	    while (iterator.hasNext()) {
		Class542 class542 = (Class542) iterator.next();
		iterator.remove();
		Class67.method1648(class542, 1073502432);
	    }
	}
	if (((Class552) this).aBool7136) {
	    for (int i_379_ = 0;
		 i_379_ < ((Class552) this).anInt7129 * 1754722005; i_379_++)
		((Class552) this).aClass544Array7178[i_379_]
		    .method11980(i, bool, 1880715132);
	}
	if (null != aClass548ArrayArrayArray7135) {
	    method12102(true, (byte) 54);
	    ((Class552) this).aClass103_7127
		.method2334(-1, new Class86(1583160, 40, 127, 63, 0, 0, 0));
	    method12143(true, is, i_358_, i_359_, i_363_);
	    ((Class552) this).aClass103_7127.method2336();
	    method12102(false, (byte) 23);
	}
	method12143(false, is, i_358_, i_359_, i_363_);
	if (!((Class552) this).aBool7130) {
	    ((Class552) this).aBoolArrayArray7134 = bools;
	    ((Class552) this).aBoolArrayArray7181 = bools_365_;
	}
    }
    
    Class548 method12165(int i, int i_380_, int i_381_) {
	if (aClass548ArrayArrayArray7169[i][i_380_][i_381_] == null) {
	    boolean bool
		= (aClass548ArrayArrayArray7169[0][i_380_][i_381_] != null
		   && (aClass548ArrayArrayArray7169[0][i_380_][i_381_]
		       .aClass548_7063) != null);
	    if (bool && i >= anInt7132 * 532429613 - 1)
		return null;
	    method12107(i, i_380_, i_381_, 883630442);
	}
	return aClass548ArrayArrayArray7169[i][i_380_][i_381_];
    }
    
    Class548 method12166(int i, int i_382_, int i_383_) {
	return method12105(i,
			   Math.min(anInt7138 * 120442351 - 1,
				    Math.max(0, i_382_)),
			   Math.min(-2069974325 * anInt7142 - 1,
				    Math.max(0, i_383_)),
			   (short) 24220);
    }
    
    Class548 method12167(int i, int i_384_, int i_385_) {
	return method12105(i,
			   Math.min(anInt7138 * 120442351 - 1,
				    Math.max(0, i_384_)),
			   Math.min(-2069974325 * anInt7142 - 1,
				    Math.max(0, i_385_)),
			   (short) 9444);
    }
    
    public void method12168(int i, int i_386_, int i_387_) {
	boolean bool = (null != aClass548ArrayArrayArray7169[0][i_386_][i_387_]
			&& null != (aClass548ArrayArrayArray7169[0][i_386_]
				    [i_387_].aClass548_7063));
	for (int i_388_ = i; i_388_ >= 0; i_388_--) {
	    if (null == aClass548ArrayArrayArray7169[i_388_][i_386_][i_387_]) {
		Class548 class548
		    = (aClass548ArrayArrayArray7169[i_388_][i_386_][i_387_]
		       = new Class548(i_388_));
		if (bool)
		    class548.aByte7054++;
	    }
	}
    }
    
    public void method12169(int i, int i_389_, int i_390_) {
	boolean bool = (null != aClass548ArrayArrayArray7169[0][i_389_][i_390_]
			&& null != (aClass548ArrayArrayArray7169[0][i_389_]
				    [i_390_].aClass548_7063));
	for (int i_391_ = i; i_391_ >= 0; i_391_--) {
	    if (null == aClass548ArrayArrayArray7169[i_391_][i_389_][i_390_]) {
		Class548 class548
		    = (aClass548ArrayArrayArray7169[i_391_][i_389_][i_390_]
		       = new Class548(i_391_));
		if (bool)
		    class548.aByte7054++;
	    }
	}
    }
    
    public void method12170(int i, int i_392_, int i_393_) {
	boolean bool = (null != aClass548ArrayArrayArray7169[0][i_392_][i_393_]
			&& null != (aClass548ArrayArrayArray7169[0][i_392_]
				    [i_393_].aClass548_7063));
	for (int i_394_ = i; i_394_ >= 0; i_394_--) {
	    if (null == aClass548ArrayArrayArray7169[i_394_][i_392_][i_393_]) {
		Class548 class548
		    = (aClass548ArrayArrayArray7169[i_394_][i_392_][i_393_]
		       = new Class548(i_394_));
		if (bool)
		    class548.aByte7054++;
	    }
	}
    }
    
    public void method12171(int i, Class166 class166) {
	aClass166Array7184[i] = class166;
    }
    
    public int method12172(int i, int i_395_) {
	return (((Class552) this).aShortArrayArray7133 != null
		? ((Class552) this).aShortArrayArray7133[i][i_395_] & 0xffff
		: 0);
    }
    
    public int method12173(int i, int i_396_) {
	return (((Class552) this).aShortArrayArray7133 != null
		? ((Class552) this).aShortArrayArray7133[i][i_396_] & 0xffff
		: 0);
    }
    
    public int method12174(int i, int i_397_) {
	return (((Class552) this).anIntArrayArray7166 != null
		? ((Class552) this).anIntArrayArray7166[i][i_397_] & 0xffffff
		: 0);
    }
    
    public int method12175(int i, int i_398_) {
	return (((Class552) this).anIntArrayArray7166 != null
		? ((Class552) this).anIntArrayArray7166[i][i_398_] & 0xffffff
		: 0);
    }
    
    public Class475_Sub1_Sub1 method12176(int i, int i_399_, int i_400_,
					  Interface57 interface57) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_399_][i_400_];
	if (class548 == null)
	    return null;
	for (Class541 class541 = class548.aClass541_7053; class541 != null;
	     class541 = class541.aClass541_7005) {
	    Class475_Sub1_Sub1 class475_sub1_sub1
		= class541.aClass475_Sub1_Sub1_7004;
	    if ((interface57 == null
		 || interface57.method430(class475_sub1_sub1, -323155391))
		&& i_399_ == class475_sub1_sub1.aShort10717
		&& i_400_ == class475_sub1_sub1.aShort10718)
		return class475_sub1_sub1;
	}
	return null;
    }
    
    public void method12177(int i, int i_401_, int i_402_, int i_403_,
			    Class475_Sub1_Sub2 class475_sub1_sub2,
			    byte i_404_) {
	Class548 class548 = method12105(i, i_401_, i_402_, (short) 30212);
	if (class548 != null) {
	    class475_sub1_sub2.method10898
		(new Class287((float) ((i_401_ << anInt7123 * 1591782305)
				       + (((Class552) this).anInt7141
					  * -558976661)),
			      (float) i_403_,
			      (float) ((i_402_ << anInt7123 * 1591782305)
				       + (((Class552) this).anInt7141
					  * -558976661))));
	    ((Class548) class548).aClass475_Sub1_Sub2_7060
		= class475_sub1_sub2;
	    int i_405_ = aClass166Array7184 == aClass166Array7140 ? 1 : 0;
	    if (class475_sub1_sub2.method14469((byte) -56)) {
		if (class475_sub1_sub2.method14452((byte) 45)) {
		    ((Class475_Sub1_Sub2) class475_sub1_sub2)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7168[i_405_];
		    ((Class552) this).aClass475_Sub1Array7168[i_405_]
			= class475_sub1_sub2;
		} else {
		    ((Class475_Sub1_Sub2) class475_sub1_sub2)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7151[i_405_];
		    ((Class552) this).aClass475_Sub1Array7151[i_405_]
			= class475_sub1_sub2;
		}
	    } else {
		((Class475_Sub1_Sub2) class475_sub1_sub2).aClass475_Sub1_8743
		    = ((Class552) this).aClass475_Sub1Array7176[i_405_];
		((Class552) this).aClass475_Sub1Array7176[i_405_]
		    = class475_sub1_sub2;
	    }
	}
    }
    
    public int method12178(int i, int i_406_) {
	return (null != ((Class552) this).aByteArrayArray7144
		? ((Class552) this).aByteArrayArray7144[i][i_406_] & 0xff : 0);
    }
    
    public Class475_Sub1_Sub2 method12179(int i, int i_407_, int i_408_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_407_][i_408_];
	if (class548 == null)
	    return null;
	Class475_Sub1_Sub2 class475_sub1_sub2
	    = ((Class548) class548).aClass475_Sub1_Sub2_7060;
	((Class548) class548).aClass475_Sub1_Sub2_7060 = null;
	method12131(class475_sub1_sub2, (byte) -119);
	return class475_sub1_sub2;
    }
    
    public int method12180(int i, int i_409_) {
	return (null != ((Class552) this).aByteArrayArray7146
		? ((Class552) this).aByteArrayArray7146[i][i_409_] & 0xff : 0);
    }
    
    public void method12181(int i, int i_410_, int i_411_, int i_412_,
			    int i_413_, int i_414_, int i_415_, int i_416_) {
	if (((Class552) this).anIntArrayArray7166 != null)
	    ((Class552) this).anIntArrayArray7166[i][i_410_]
		= ~0xffffff | i_411_;
	if (((Class552) this).aShortArrayArray7133 != null)
	    ((Class552) this).aShortArrayArray7133[i][i_410_] = (short) i_412_;
	if (((Class552) this).aByteArrayArray7143 != null)
	    ((Class552) this).aByteArrayArray7143[i][i_410_] = (byte) i_413_;
	if (null != ((Class552) this).aByteArrayArray7144)
	    ((Class552) this).aByteArrayArray7144[i][i_410_] = (byte) i_414_;
	if (((Class552) this).aByteArrayArray7183 != null)
	    ((Class552) this).aByteArrayArray7183[i][i_410_] = (byte) i_415_;
	if (((Class552) this).aByteArrayArray7146 != null)
	    ((Class552) this).aByteArrayArray7146[i][i_410_] = (byte) i_416_;
    }
    
    public void method12182(int i, int i_417_, int i_418_,
			    Class475_Sub1_Sub3 class475_sub1_sub3,
			    Class475_Sub1_Sub3 class475_sub1_sub3_419_) {
	Class548 class548 = method12105(i, i_417_, i_418_, (short) 15346);
	if (class548 != null) {
	    class548.aClass475_Sub1_Sub3_7055 = class475_sub1_sub3;
	    class548.aClass475_Sub1_Sub3_7056 = class475_sub1_sub3_419_;
	    int i_420_ = aClass166Array7184 == aClass166Array7140 ? 1 : 0;
	    if (class475_sub1_sub3.method14469((byte) -64)) {
		if (class475_sub1_sub3.method14452((byte) -30)) {
		    ((Class475_Sub1_Sub3) class475_sub1_sub3)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7168[i_420_];
		    ((Class552) this).aClass475_Sub1Array7168[i_420_]
			= class475_sub1_sub3;
		} else {
		    ((Class475_Sub1_Sub3) class475_sub1_sub3)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7151[i_420_];
		    ((Class552) this).aClass475_Sub1Array7151[i_420_]
			= class475_sub1_sub3;
		}
	    } else {
		((Class475_Sub1_Sub3) class475_sub1_sub3).aClass475_Sub1_8743
		    = ((Class552) this).aClass475_Sub1Array7176[i_420_];
		((Class552) this).aClass475_Sub1Array7176[i_420_]
		    = class475_sub1_sub3;
	    }
	    if (class475_sub1_sub3_419_ != null) {
		if (class475_sub1_sub3_419_.method14469((byte) -17)) {
		    if (class475_sub1_sub3_419_.method14452((byte) -43)) {
			((Class475_Sub1_Sub3) class475_sub1_sub3_419_)
			    .aClass475_Sub1_8743
			    = (((Class552) this).aClass475_Sub1Array7168
			       [i_420_]);
			((Class552) this).aClass475_Sub1Array7168[i_420_]
			    = class475_sub1_sub3_419_;
		    } else {
			((Class475_Sub1_Sub3) class475_sub1_sub3_419_)
			    .aClass475_Sub1_8743
			    = (((Class552) this).aClass475_Sub1Array7151
			       [i_420_]);
			((Class552) this).aClass475_Sub1Array7151[i_420_]
			    = class475_sub1_sub3_419_;
		    }
		} else {
		    ((Class475_Sub1_Sub3) class475_sub1_sub3_419_)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7176[i_420_];
		    ((Class552) this).aClass475_Sub1Array7176[i_420_]
			= class475_sub1_sub3_419_;
		}
	    }
	}
    }
    
    public void method12183(int i, int i_421_, int i_422_, int i_423_,
			    int i_424_, int i_425_, int i_426_, int i_427_) {
	if (((Class552) this).anIntArrayArray7166 != null)
	    ((Class552) this).anIntArrayArray7166[i][i_421_]
		= ~0xffffff | i_422_;
	if (((Class552) this).aShortArrayArray7133 != null)
	    ((Class552) this).aShortArrayArray7133[i][i_421_] = (short) i_423_;
	if (((Class552) this).aByteArrayArray7143 != null)
	    ((Class552) this).aByteArrayArray7143[i][i_421_] = (byte) i_424_;
	if (null != ((Class552) this).aByteArrayArray7144)
	    ((Class552) this).aByteArrayArray7144[i][i_421_] = (byte) i_425_;
	if (((Class552) this).aByteArrayArray7183 != null)
	    ((Class552) this).aByteArrayArray7183[i][i_421_] = (byte) i_426_;
	if (((Class552) this).aByteArrayArray7146 != null)
	    ((Class552) this).aByteArrayArray7146[i][i_421_] = (byte) i_427_;
    }
    
    Class548 method12184(int i, int i_428_, int i_429_) {
	if (aClass548ArrayArrayArray7169[i][i_428_][i_429_] == null) {
	    boolean bool
		= (aClass548ArrayArrayArray7169[0][i_428_][i_429_] != null
		   && (aClass548ArrayArrayArray7169[0][i_428_][i_429_]
		       .aClass548_7063) != null);
	    if (bool && i >= anInt7132 * 532429613 - 1)
		return null;
	    method12107(i, i_428_, i_429_, 1388860375);
	}
	return aClass548ArrayArrayArray7169[i][i_428_][i_429_];
    }
    
    public void method12185(int i, int i_430_, int i_431_, int i_432_,
			    int i_433_, int i_434_, int i_435_, int i_436_) {
	if (((Class552) this).anIntArrayArray7166 != null)
	    ((Class552) this).anIntArrayArray7166[i][i_430_]
		= ~0xffffff | i_431_;
	if (((Class552) this).aShortArrayArray7133 != null)
	    ((Class552) this).aShortArrayArray7133[i][i_430_] = (short) i_432_;
	if (((Class552) this).aByteArrayArray7143 != null)
	    ((Class552) this).aByteArrayArray7143[i][i_430_] = (byte) i_433_;
	if (null != ((Class552) this).aByteArrayArray7144)
	    ((Class552) this).aByteArrayArray7144[i][i_430_] = (byte) i_434_;
	if (((Class552) this).aByteArrayArray7183 != null)
	    ((Class552) this).aByteArrayArray7183[i][i_430_] = (byte) i_435_;
	if (((Class552) this).aByteArrayArray7146 != null)
	    ((Class552) this).aByteArrayArray7146[i][i_430_] = (byte) i_436_;
    }
    
    public void method12186
	(int i, int i_437_, int i_438_, Class475_Sub1_Sub5 class475_sub1_sub5,
	 Class475_Sub1_Sub5 class475_sub1_sub5_439_, int i_440_) {
	Class548 class548 = method12105(i, i_437_, i_438_, (short) 20351);
	if (class548 != null) {
	    class548.aClass475_Sub1_Sub5_7061 = class475_sub1_sub5;
	    class548.aClass475_Sub1_Sub5_7059 = class475_sub1_sub5_439_;
	    int i_441_ = aClass166Array7184 == aClass166Array7140 ? 1 : 0;
	    if (class475_sub1_sub5.method14469((byte) -50)) {
		if (class475_sub1_sub5.method14452((byte) -22)) {
		    ((Class475_Sub1_Sub5) class475_sub1_sub5)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7168[i_441_];
		    ((Class552) this).aClass475_Sub1Array7168[i_441_]
			= class475_sub1_sub5;
		} else {
		    ((Class475_Sub1_Sub5) class475_sub1_sub5)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7151[i_441_];
		    ((Class552) this).aClass475_Sub1Array7151[i_441_]
			= class475_sub1_sub5;
		}
	    } else {
		((Class475_Sub1_Sub5) class475_sub1_sub5).aClass475_Sub1_8743
		    = ((Class552) this).aClass475_Sub1Array7176[i_441_];
		((Class552) this).aClass475_Sub1Array7176[i_441_]
		    = class475_sub1_sub5;
	    }
	    if (null != class475_sub1_sub5_439_) {
		if (class475_sub1_sub5_439_.method14469((byte) -50)) {
		    if (class475_sub1_sub5_439_.method14452((byte) -60)) {
			((Class475_Sub1_Sub5) class475_sub1_sub5_439_)
			    .aClass475_Sub1_8743
			    = (((Class552) this).aClass475_Sub1Array7168
			       [i_441_]);
			((Class552) this).aClass475_Sub1Array7168[i_441_]
			    = class475_sub1_sub5_439_;
		    } else {
			((Class475_Sub1_Sub5) class475_sub1_sub5_439_)
			    .aClass475_Sub1_8743
			    = (((Class552) this).aClass475_Sub1Array7151
			       [i_441_]);
			((Class552) this).aClass475_Sub1Array7151[i_441_]
			    = class475_sub1_sub5_439_;
		    }
		} else {
		    ((Class475_Sub1_Sub5) class475_sub1_sub5_439_)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7176[i_441_];
		    ((Class552) this).aClass475_Sub1Array7176[i_441_]
			= class475_sub1_sub5_439_;
		}
	    }
	}
    }
    
    public void method12187(int i, int i_442_, int i_443_,
			    Class475_Sub1_Sub3 class475_sub1_sub3,
			    Class475_Sub1_Sub3 class475_sub1_sub3_444_) {
	Class548 class548 = method12105(i, i_442_, i_443_, (short) 19064);
	if (class548 != null) {
	    class548.aClass475_Sub1_Sub3_7055 = class475_sub1_sub3;
	    class548.aClass475_Sub1_Sub3_7056 = class475_sub1_sub3_444_;
	    int i_445_ = aClass166Array7184 == aClass166Array7140 ? 1 : 0;
	    if (class475_sub1_sub3.method14469((byte) -19)) {
		if (class475_sub1_sub3.method14452((byte) -24)) {
		    ((Class475_Sub1_Sub3) class475_sub1_sub3)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7168[i_445_];
		    ((Class552) this).aClass475_Sub1Array7168[i_445_]
			= class475_sub1_sub3;
		} else {
		    ((Class475_Sub1_Sub3) class475_sub1_sub3)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7151[i_445_];
		    ((Class552) this).aClass475_Sub1Array7151[i_445_]
			= class475_sub1_sub3;
		}
	    } else {
		((Class475_Sub1_Sub3) class475_sub1_sub3).aClass475_Sub1_8743
		    = ((Class552) this).aClass475_Sub1Array7176[i_445_];
		((Class552) this).aClass475_Sub1Array7176[i_445_]
		    = class475_sub1_sub3;
	    }
	    if (class475_sub1_sub3_444_ != null) {
		if (class475_sub1_sub3_444_.method14469((byte) -22)) {
		    if (class475_sub1_sub3_444_.method14452((byte) 56)) {
			((Class475_Sub1_Sub3) class475_sub1_sub3_444_)
			    .aClass475_Sub1_8743
			    = (((Class552) this).aClass475_Sub1Array7168
			       [i_445_]);
			((Class552) this).aClass475_Sub1Array7168[i_445_]
			    = class475_sub1_sub3_444_;
		    } else {
			((Class475_Sub1_Sub3) class475_sub1_sub3_444_)
			    .aClass475_Sub1_8743
			    = (((Class552) this).aClass475_Sub1Array7151
			       [i_445_]);
			((Class552) this).aClass475_Sub1Array7151[i_445_]
			    = class475_sub1_sub3_444_;
		    }
		} else {
		    ((Class475_Sub1_Sub3) class475_sub1_sub3_444_)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7176[i_445_];
		    ((Class552) this).aClass475_Sub1Array7176[i_445_]
			= class475_sub1_sub3_444_;
		}
	    }
	}
    }
    
    public void method12188(int i, int i_446_, int i_447_,
			    Class475_Sub1_Sub3 class475_sub1_sub3,
			    Class475_Sub1_Sub3 class475_sub1_sub3_448_) {
	Class548 class548 = method12105(i, i_446_, i_447_, (short) 1048);
	if (class548 != null) {
	    class548.aClass475_Sub1_Sub3_7055 = class475_sub1_sub3;
	    class548.aClass475_Sub1_Sub3_7056 = class475_sub1_sub3_448_;
	    int i_449_ = aClass166Array7184 == aClass166Array7140 ? 1 : 0;
	    if (class475_sub1_sub3.method14469((byte) -109)) {
		if (class475_sub1_sub3.method14452((byte) 32)) {
		    ((Class475_Sub1_Sub3) class475_sub1_sub3)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7168[i_449_];
		    ((Class552) this).aClass475_Sub1Array7168[i_449_]
			= class475_sub1_sub3;
		} else {
		    ((Class475_Sub1_Sub3) class475_sub1_sub3)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7151[i_449_];
		    ((Class552) this).aClass475_Sub1Array7151[i_449_]
			= class475_sub1_sub3;
		}
	    } else {
		((Class475_Sub1_Sub3) class475_sub1_sub3).aClass475_Sub1_8743
		    = ((Class552) this).aClass475_Sub1Array7176[i_449_];
		((Class552) this).aClass475_Sub1Array7176[i_449_]
		    = class475_sub1_sub3;
	    }
	    if (class475_sub1_sub3_448_ != null) {
		if (class475_sub1_sub3_448_.method14469((byte) -99)) {
		    if (class475_sub1_sub3_448_.method14452((byte) 32)) {
			((Class475_Sub1_Sub3) class475_sub1_sub3_448_)
			    .aClass475_Sub1_8743
			    = (((Class552) this).aClass475_Sub1Array7168
			       [i_449_]);
			((Class552) this).aClass475_Sub1Array7168[i_449_]
			    = class475_sub1_sub3_448_;
		    } else {
			((Class475_Sub1_Sub3) class475_sub1_sub3_448_)
			    .aClass475_Sub1_8743
			    = (((Class552) this).aClass475_Sub1Array7151
			       [i_449_]);
			((Class552) this).aClass475_Sub1Array7151[i_449_]
			    = class475_sub1_sub3_448_;
		    }
		} else {
		    ((Class475_Sub1_Sub3) class475_sub1_sub3_448_)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7176[i_449_];
		    ((Class552) this).aClass475_Sub1Array7176[i_449_]
			= class475_sub1_sub3_448_;
		}
	    }
	}
    }
    
    public void method12189(int i, int i_450_, int i_451_,
			    Class475_Sub1_Sub5 class475_sub1_sub5,
			    Class475_Sub1_Sub5 class475_sub1_sub5_452_) {
	Class548 class548 = method12105(i, i_450_, i_451_, (short) 13584);
	if (class548 != null) {
	    class548.aClass475_Sub1_Sub5_7061 = class475_sub1_sub5;
	    class548.aClass475_Sub1_Sub5_7059 = class475_sub1_sub5_452_;
	    int i_453_ = aClass166Array7184 == aClass166Array7140 ? 1 : 0;
	    if (class475_sub1_sub5.method14469((byte) -125)) {
		if (class475_sub1_sub5.method14452((byte) 14)) {
		    ((Class475_Sub1_Sub5) class475_sub1_sub5)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7168[i_453_];
		    ((Class552) this).aClass475_Sub1Array7168[i_453_]
			= class475_sub1_sub5;
		} else {
		    ((Class475_Sub1_Sub5) class475_sub1_sub5)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7151[i_453_];
		    ((Class552) this).aClass475_Sub1Array7151[i_453_]
			= class475_sub1_sub5;
		}
	    } else {
		((Class475_Sub1_Sub5) class475_sub1_sub5).aClass475_Sub1_8743
		    = ((Class552) this).aClass475_Sub1Array7176[i_453_];
		((Class552) this).aClass475_Sub1Array7176[i_453_]
		    = class475_sub1_sub5;
	    }
	    if (null != class475_sub1_sub5_452_) {
		if (class475_sub1_sub5_452_.method14469((byte) -8)) {
		    if (class475_sub1_sub5_452_.method14452((byte) -18)) {
			((Class475_Sub1_Sub5) class475_sub1_sub5_452_)
			    .aClass475_Sub1_8743
			    = (((Class552) this).aClass475_Sub1Array7168
			       [i_453_]);
			((Class552) this).aClass475_Sub1Array7168[i_453_]
			    = class475_sub1_sub5_452_;
		    } else {
			((Class475_Sub1_Sub5) class475_sub1_sub5_452_)
			    .aClass475_Sub1_8743
			    = (((Class552) this).aClass475_Sub1Array7151
			       [i_453_]);
			((Class552) this).aClass475_Sub1Array7151[i_453_]
			    = class475_sub1_sub5_452_;
		    }
		} else {
		    ((Class475_Sub1_Sub5) class475_sub1_sub5_452_)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7176[i_453_];
		    ((Class552) this).aClass475_Sub1Array7176[i_453_]
			= class475_sub1_sub5_452_;
		}
	    }
	}
    }
    
    public void method12190(int i, int i_454_, int i_455_,
			    Class475_Sub1_Sub5 class475_sub1_sub5,
			    Class475_Sub1_Sub5 class475_sub1_sub5_456_) {
	Class548 class548 = method12105(i, i_454_, i_455_, (short) 21710);
	if (class548 != null) {
	    class548.aClass475_Sub1_Sub5_7061 = class475_sub1_sub5;
	    class548.aClass475_Sub1_Sub5_7059 = class475_sub1_sub5_456_;
	    int i_457_ = aClass166Array7184 == aClass166Array7140 ? 1 : 0;
	    if (class475_sub1_sub5.method14469((byte) -20)) {
		if (class475_sub1_sub5.method14452((byte) 25)) {
		    ((Class475_Sub1_Sub5) class475_sub1_sub5)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7168[i_457_];
		    ((Class552) this).aClass475_Sub1Array7168[i_457_]
			= class475_sub1_sub5;
		} else {
		    ((Class475_Sub1_Sub5) class475_sub1_sub5)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7151[i_457_];
		    ((Class552) this).aClass475_Sub1Array7151[i_457_]
			= class475_sub1_sub5;
		}
	    } else {
		((Class475_Sub1_Sub5) class475_sub1_sub5).aClass475_Sub1_8743
		    = ((Class552) this).aClass475_Sub1Array7176[i_457_];
		((Class552) this).aClass475_Sub1Array7176[i_457_]
		    = class475_sub1_sub5;
	    }
	    if (null != class475_sub1_sub5_456_) {
		if (class475_sub1_sub5_456_.method14469((byte) -86)) {
		    if (class475_sub1_sub5_456_.method14452((byte) 92)) {
			((Class475_Sub1_Sub5) class475_sub1_sub5_456_)
			    .aClass475_Sub1_8743
			    = (((Class552) this).aClass475_Sub1Array7168
			       [i_457_]);
			((Class552) this).aClass475_Sub1Array7168[i_457_]
			    = class475_sub1_sub5_456_;
		    } else {
			((Class475_Sub1_Sub5) class475_sub1_sub5_456_)
			    .aClass475_Sub1_8743
			    = (((Class552) this).aClass475_Sub1Array7151
			       [i_457_]);
			((Class552) this).aClass475_Sub1Array7151[i_457_]
			    = class475_sub1_sub5_456_;
		    }
		} else {
		    ((Class475_Sub1_Sub5) class475_sub1_sub5_456_)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7176[i_457_];
		    ((Class552) this).aClass475_Sub1Array7176[i_457_]
			= class475_sub1_sub5_456_;
		}
	    }
	}
    }
    
    public boolean method12191(Class475_Sub1_Sub1 class475_sub1_sub1,
			       boolean bool) {
	boolean bool_458_ = aClass166Array7184 == aClass166Array7140;
	int i = 0;
	short i_459_ = 0;
	byte i_460_ = 0;
	class475_sub1_sub1.method16999(2081818386);
	short i_461_ = 0;
	int i_462_ = Math.min(anInt7138 * 120442351 - 1,
			      Math.max(0, class475_sub1_sub1.aShort10717));
	int i_463_ = Math.min(120442351 * anInt7138 - 1,
			      Math.max(0, class475_sub1_sub1.aShort10716));
	int i_464_ = Math.min(-2069974325 * anInt7142 - 1,
			      Math.max(0, class475_sub1_sub1.aShort10718));
	int i_465_ = Math.min(anInt7142 * -2069974325 - 1,
			      Math.max(0, class475_sub1_sub1.aShort10719));
	for (int i_466_ = i_462_; i_466_ <= i_463_; i_466_++) {
	    for (int i_467_ = i_464_; i_467_ <= i_465_; i_467_++) {
		Class548 class548 = method12245(class475_sub1_sub1.nodePlane,
						i_466_, i_467_, 2057366188);
		if (class548 != null) {
		    Class541 class541
			= RSAKeys.method858(class475_sub1_sub1, (byte) -114);
		    Class541 class541_468_ = class548.aClass541_7053;
		    if (null == class541_468_)
			class548.aClass541_7053 = class541;
		    else {
			for (/**/; class541_468_.aClass541_7005 != null;
			     class541_468_ = class541_468_.aClass541_7005) {
			    /* empty */
			}
			class541_468_.aClass541_7005 = class541;
		    }
		    if (bool_458_
			&& 0 != ((((Class552) this).anIntArrayArray7166[i_466_]
				  [i_467_])
				 & ~0xffffff)) {
			i = (((Class552) this).anIntArrayArray7166[i_466_]
			     [i_467_]);
			i_459_ = (((Class552) this).aShortArrayArray7133
				  [i_466_][i_467_]);
			i_460_ = (((Class552) this).aByteArrayArray7143[i_466_]
				  [i_467_]);
		    }
		    if (!bool && null != class548.aClass475_Sub1_Sub4_7058
			&& (class548.aClass475_Sub1_Sub4_7058.aShort10742
			    > i_461_))
			i_461_ = class548.aClass475_Sub1_Sub4_7058.aShort10742;
		}
	    }
	}
	if (bool_458_ && (i & ~0xffffff) != 0) {
	    for (int i_469_ = i_462_; i_469_ <= i_463_; i_469_++) {
		for (int i_470_ = i_464_; i_470_ <= i_465_; i_470_++) {
		    if ((((Class552) this).anIntArrayArray7166[i_469_][i_470_]
			 & ~0xffffff)
			== 0) {
			((Class552) this).anIntArrayArray7166[i_469_][i_470_]
			    = i;
			((Class552) this).aShortArrayArray7133[i_469_][i_470_]
			    = i_459_;
			((Class552) this).aByteArrayArray7143[i_469_][i_470_]
			    = i_460_;
		    }
		}
	    }
	}
	if (bool) {
	    ((Class552) this).aClass475_Sub1_Sub1Array7158
		[(((Class552) this).anInt7147 += 1852937581) * -1933263771 - 1]
		= class475_sub1_sub1;
	    class475_sub1_sub1.aClass552_8744 = this;
	} else {
	    int i_471_ = aClass166Array7140 == aClass166Array7184 ? 1 : 0;
	    if (class475_sub1_sub1.method14469((byte) -5)) {
		if (class475_sub1_sub1.method14452((byte) 14)) {
		    ((Class475_Sub1_Sub1) class475_sub1_sub1)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7168[i_471_];
		    ((Class552) this).aClass475_Sub1Array7168[i_471_]
			= class475_sub1_sub1;
		} else {
		    ((Class475_Sub1_Sub1) class475_sub1_sub1)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7151[i_471_];
		    ((Class552) this).aClass475_Sub1Array7151[i_471_]
			= class475_sub1_sub1;
		}
	    } else {
		((Class475_Sub1_Sub1) class475_sub1_sub1).aClass475_Sub1_8743
		    = ((Class552) this).aClass475_Sub1Array7176[i_471_];
		((Class552) this).aClass475_Sub1Array7176[i_471_]
		    = class475_sub1_sub1;
	    }
	}
	if (bool) {
	    Class287 class287
		= Class287.method5562(class475_sub1_sub1.method10874()
				      .aClass287_4386);
	    class287.aFloat4474 -= (float) i_461_;
	    class475_sub1_sub1.method10898(class287);
	    class287.method5564();
	}
	return true;
    }
    
    public void method12192(int i, int i_472_, int i_473_, int i_474_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_472_][i_473_];
	if (null != class548) {
	    Class475_Sub1_Sub5 class475_sub1_sub5
		= class548.aClass475_Sub1_Sub5_7061;
	    Class475_Sub1_Sub5 class475_sub1_sub5_475_
		= class548.aClass475_Sub1_Sub5_7059;
	    if (class475_sub1_sub5 != null) {
		class475_sub1_sub5.aShort10749
		    = (short) (i_474_ * class475_sub1_sub5.aShort10749
			       / (16 << 1591782305 * anInt7123 - 7));
		class475_sub1_sub5.aShort10748
		    = (short) (class475_sub1_sub5.aShort10748 * i_474_
			       / (16 << anInt7123 * 1591782305 - 7));
	    }
	    if (class475_sub1_sub5_475_ != null) {
		class475_sub1_sub5_475_.aShort10749
		    = (short) (class475_sub1_sub5_475_.aShort10749 * i_474_
			       / (16 << anInt7123 * 1591782305 - 7));
		class475_sub1_sub5_475_.aShort10748
		    = (short) (class475_sub1_sub5_475_.aShort10748 * i_474_
			       / (16 << anInt7123 * 1591782305 - 7));
	    }
	}
    }
    
    public Class475_Sub1_Sub3 method12193(int i, int i_476_, int i_477_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_476_][i_477_];
	if (null != class548) {
	    method12131(class548.aClass475_Sub1_Sub3_7055, (byte) 24);
	    if (class548.aClass475_Sub1_Sub3_7055 != null) {
		Class475_Sub1_Sub3 class475_sub1_sub3
		    = class548.aClass475_Sub1_Sub3_7055;
		class548.aClass475_Sub1_Sub3_7055 = null;
		return class475_sub1_sub3;
	    }
	}
	return null;
    }
    
    public Class475_Sub1_Sub3 method12194(int i, int i_478_, int i_479_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_478_][i_479_];
	if (null != class548) {
	    method12131(class548.aClass475_Sub1_Sub3_7055, (byte) -110);
	    if (class548.aClass475_Sub1_Sub3_7055 != null) {
		Class475_Sub1_Sub3 class475_sub1_sub3
		    = class548.aClass475_Sub1_Sub3_7055;
		class548.aClass475_Sub1_Sub3_7055 = null;
		return class475_sub1_sub3;
	    }
	}
	return null;
    }
    
    void method12195(Class475_Sub1 class475_sub1, int i, int i_480_,
		     int i_481_, int i_482_) {
	if (i_480_ < anInt7138 * 120442351) {
	    Class548 class548
		= aClass548ArrayArrayArray7169[i][1 + i_480_][i_481_];
	    if (class548 != null && null != class548.aClass475_Sub1_Sub4_7058
		&& class548.aClass475_Sub1_Sub4_7058.method14450(1884342964)) {
		int i_483_
		    = ((aClass166Array7184[i].method3551(1 + i_480_, i_481_,
							 -1583218586)
			+ aClass166Array7184[i].method3551(i_480_ + 1 + 1,
							   i_481_, -822430790)
			+ aClass166Array7184[i]
			      .method3551(1 + i_480_, i_481_ + 1, 779459909)
			+ aClass166Array7184[i].method3551(1 + (i_480_ + 1),
							   i_481_ + 1,
							   -215670657)) / 4
		       - ((aClass166Array7184[i].method3551(i_480_, i_481_,
							    588728810)
			   + aClass166Array7184[i]
				 .method3551(1 + i_480_, i_481_, -891762449)
			   + aClass166Array7184[i]
				 .method3551(i_480_, 1 + i_481_, 71879035)
			   + aClass166Array7184[i].method3551(i_480_ + 1,
							      1 + i_481_,
							      -1967051838))
			  / 4));
		class475_sub1.method14453(((Class552) this).aClass103_7127,
					  class548.aClass475_Sub1_Sub4_7058,
					  (((Class552) this).anInt7124
					   * -1302211377),
					  i_483_, 0, true, 2068497213);
	    }
	}
	if (i_481_ < 120442351 * anInt7138) {
	    Class548 class548
		= aClass548ArrayArrayArray7169[i][i_480_][i_481_ + 1];
	    if (null != class548 && class548.aClass475_Sub1_Sub4_7058 != null
		&& class548.aClass475_Sub1_Sub4_7058.method14450(1699477201)) {
		int i_484_
		    = ((aClass166Array7184[i].method3551(i_480_, i_481_,
							 -1925599665)
			+ aClass166Array7184[i]
			      .method3551(i_480_ + 1, i_481_ + 1, -601602694)
			+ aClass166Array7184[i].method3551(i_480_,
							   1 + (i_481_ + 1),
							   -1839383026)
			+ aClass166Array7184[i].method3551(1 + i_480_,
							   1 + i_481_ + 1,
							   209640900)) / 4
		       - ((aClass166Array7184[i].method3551(i_480_, i_481_,
							    -267482737)
			   + aClass166Array7184[i]
				 .method3551(i_480_ + 1, i_481_, -151119200)
			   + aClass166Array7184[i]
				 .method3551(i_480_, 1 + i_481_, 957264549)
			   + aClass166Array7184[i].method3551(1 + i_480_,
							      i_481_ + 1,
							      -2050933357))
			  / 4));
		class475_sub1.method14453(((Class552) this).aClass103_7127,
					  class548.aClass475_Sub1_Sub4_7058, 0,
					  i_484_,
					  (((Class552) this).anInt7124
					   * -1302211377),
					  true, 2087796751);
	    }
	}
	if (i_480_ < anInt7138 * 120442351
	    && i_481_ < -2069974325 * anInt7142) {
	    Class548 class548
		= aClass548ArrayArrayArray7169[i][1 + i_480_][i_481_ + 1];
	    if (null != class548 && null != class548.aClass475_Sub1_Sub4_7058
		&& class548.aClass475_Sub1_Sub4_7058.method14450(380534160)) {
		int i_485_
		    = ((aClass166Array7184[i].method3551(1 + i_480_,
							 i_481_ + 1, 890543093)
			+ aClass166Array7184[i].method3551(1 + (1 + i_480_),
							   1 + i_481_,
							   -1435424122)
			+ aClass166Array7184[i].method3551(1 + i_480_,
							   1 + (i_481_ + 1),
							   -38391197)
			+ aClass166Array7184[i].method3551(1 + (1 + i_480_),
							   1 + i_481_ + 1,
							   526781809)) / 4
		       - (aClass166Array7184[i].method3551(i_480_, i_481_,
							   -1903124213)
			  + aClass166Array7184[i]
				.method3551(1 + i_480_, i_481_, -702837236)
			  + aClass166Array7184[i]
				.method3551(i_480_, i_481_ + 1, -1965383055)
			  + aClass166Array7184[i].method3551(1 + i_480_,
							     1 + i_481_,
							     712640943)) / 4);
		class475_sub1.method14453(((Class552) this).aClass103_7127,
					  class548.aClass475_Sub1_Sub4_7058,
					  (((Class552) this).anInt7124
					   * -1302211377),
					  i_485_,
					  (-1302211377
					   * ((Class552) this).anInt7124),
					  true, 2139404520);
	    }
	}
	if (i_480_ < anInt7138 * 120442351 && i_481_ > 0) {
	    Class548 class548
		= aClass548ArrayArrayArray7169[i][i_480_ + 1][i_481_ - 1];
	    if (null != class548 && class548.aClass475_Sub1_Sub4_7058 != null
		&& class548.aClass475_Sub1_Sub4_7058.method14450(-707420739)) {
		int i_486_
		    = ((aClass166Array7184[i]
			    .method3551(1 + i_480_, i_481_ - 1, -1255212349)
			+ aClass166Array7184[i].method3551(1 + i_480_ + 1,
							   i_481_ - 1,
							   -960080269)
			+ aClass166Array7184[i].method3551(1 + i_480_,
							   i_481_ + 1 - 1,
							   -762791623)
			+ aClass166Array7184[i].method3551(i_480_ + 1 + 1,
							   1 + i_481_ - 1,
							   468918030)) / 4
		       - ((aClass166Array7184[i].method3551(i_480_, i_481_,
							    801820820)
			   + aClass166Array7184[i]
				 .method3551(1 + i_480_, i_481_, 521415959)
			   + aClass166Array7184[i]
				 .method3551(i_480_, 1 + i_481_, -661530775)
			   + aClass166Array7184[i].method3551(1 + i_480_,
							      1 + i_481_,
							      -1888408903))
			  / 4));
		class475_sub1.method14453(((Class552) this).aClass103_7127,
					  class548.aClass475_Sub1_Sub4_7058,
					  (-1302211377
					   * ((Class552) this).anInt7124),
					  i_486_,
					  -(-1302211377
					    * ((Class552) this).anInt7124),
					  true, 2047048868);
	    }
	}
    }
    
    public void method12196(int i, int i_487_, int i_488_, int i_489_,
			    Class475_Sub1_Sub2 class475_sub1_sub2) {
	Class548 class548 = method12105(i, i_487_, i_488_, (short) 5104);
	if (class548 != null) {
	    class475_sub1_sub2.method10898
		(new Class287((float) ((i_487_ << anInt7123 * 1591782305)
				       + (((Class552) this).anInt7141
					  * -558976661)),
			      (float) i_489_,
			      (float) ((i_488_ << anInt7123 * 1591782305)
				       + (((Class552) this).anInt7141
					  * -558976661))));
	    ((Class548) class548).aClass475_Sub1_Sub2_7060
		= class475_sub1_sub2;
	    int i_490_ = aClass166Array7184 == aClass166Array7140 ? 1 : 0;
	    if (class475_sub1_sub2.method14469((byte) -58)) {
		if (class475_sub1_sub2.method14452((byte) -21)) {
		    ((Class475_Sub1_Sub2) class475_sub1_sub2)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7168[i_490_];
		    ((Class552) this).aClass475_Sub1Array7168[i_490_]
			= class475_sub1_sub2;
		} else {
		    ((Class475_Sub1_Sub2) class475_sub1_sub2)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7151[i_490_];
		    ((Class552) this).aClass475_Sub1Array7151[i_490_]
			= class475_sub1_sub2;
		}
	    } else {
		((Class475_Sub1_Sub2) class475_sub1_sub2).aClass475_Sub1_8743
		    = ((Class552) this).aClass475_Sub1Array7176[i_490_];
		((Class552) this).aClass475_Sub1Array7176[i_490_]
		    = class475_sub1_sub2;
	    }
	}
    }
    
    public Class475_Sub1_Sub5 method12197(int i, int i_491_, int i_492_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_491_][i_492_];
	if (null != class548) {
	    method12131(class548.aClass475_Sub1_Sub5_7061, (byte) -58);
	    if (class548.aClass475_Sub1_Sub5_7061 != null) {
		Class475_Sub1_Sub5 class475_sub1_sub5
		    = class548.aClass475_Sub1_Sub5_7061;
		class548.aClass475_Sub1_Sub5_7061 = null;
		return class475_sub1_sub5;
	    }
	}
	return null;
    }
    
    public Class475_Sub1_Sub5 method12198(int i, int i_493_, int i_494_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_493_][i_494_];
	if (null != class548) {
	    method12131(class548.aClass475_Sub1_Sub5_7059, (byte) -27);
	    if (class548.aClass475_Sub1_Sub5_7059 != null) {
		Class475_Sub1_Sub5 class475_sub1_sub5
		    = class548.aClass475_Sub1_Sub5_7059;
		class548.aClass475_Sub1_Sub5_7059 = null;
		return class475_sub1_sub5;
	    }
	}
	return null;
    }
    
    public Class475_Sub1_Sub5 method12199(int i, int i_495_, int i_496_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_495_][i_496_];
	if (null != class548) {
	    method12131(class548.aClass475_Sub1_Sub5_7059, (byte) -52);
	    if (class548.aClass475_Sub1_Sub5_7059 != null) {
		Class475_Sub1_Sub5 class475_sub1_sub5
		    = class548.aClass475_Sub1_Sub5_7059;
		class548.aClass475_Sub1_Sub5_7059 = null;
		return class475_sub1_sub5;
	    }
	}
	return null;
    }
    
    public int method12200(int i, int i_497_, byte i_498_) {
	return (((Class552) this).anIntArrayArray7166 != null
		? ((Class552) this).anIntArrayArray7166[i][i_497_] & 0xffffff
		: 0);
    }
    
    public Class552(Class103 class103, int i, int i_499_, int i_500_,
		    int i_501_, int i_502_, boolean bool, boolean bool_503_) {
	((Class552) this).anInt7150 = 5090;
	((Class552) this).aFloatArray7172 = new float[3];
	((Class552) this).aClass241_Sub43Array7173 = new Class241_Sub43[8];
	((Class552) this).anInt7174 = 65074;
	((Class552) this).aClass103_7127 = class103;
	((Class552) this).aBool7136
	    = ((Class552) this).aClass103_7127.method2315() > 0;
	anInt7123 = i * 146536545;
	((Class552) this).anInt7124
	    = (1 << anInt7123 * 1591782305) * 760132143;
	((Class552) this).anInt7141
	    = -698485949 * (-1302211377 * ((Class552) this).anInt7124 >> 1);
	anInt7132 = i_499_ * 1516162213;
	anInt7138 = i_500_ * -2069036785;
	anInt7142 = -217472285 * i_501_;
	((Class552) this).anInt7165 = -1143859103 * i_502_;
	((Class552) this).aClass402_7182 = new Class402();
	aClass550_7131 = new Class550(this);
	aClass548ArrayArrayArray7148
	    = (new Class548[i_499_][anInt7138 * 120442351]
	       [-2069974325 * anInt7142]);
	aClass166Array7179 = new Class166[i_499_];
	if (bool) {
	    ((Class552) this).anIntArrayArray7166
		= new int[120442351 * anInt7138][anInt7142 * -2069974325];
	    ((Class552) this).aByteArrayArray7143
		= new byte[120442351 * anInt7138][-2069974325 * anInt7142];
	    ((Class552) this).aShortArrayArray7133
		= new short[120442351 * anInt7138][anInt7142 * -2069974325];
	    ((Class552) this).aByteArrayArray7144
		= new byte[anInt7138 * 120442351][anInt7142 * -2069974325];
	    ((Class552) this).aByteArrayArray7183
		= new byte[anInt7138 * 120442351][anInt7142 * -2069974325];
	    ((Class552) this).aByteArrayArray7146
		= new byte[120442351 * anInt7138][anInt7142 * -2069974325];
	    aClass548ArrayArrayArray7135
		= (new Class548[1][anInt7138 * 120442351]
		   [anInt7142 * -2069974325]);
	    aClass166Array7140 = new Class166[1];
	}
	if (bool_503_) {
	    ((Class552) this).aLongArrayArrayArray7177
		= new long[i_499_][i_500_][i_501_];
	    ((Class552) this).aClass544Array7178 = new Class544[65074];
	    ((Class552) this).aBoolArray7161 = new boolean[65074];
	    ((Class552) this).anInt7129 = 0;
	}
	method12102(false, (byte) -81);
	((Class552) this).aClass475_Sub1Array7151 = new Class475_Sub1[2];
	((Class552) this).aClass475_Sub1Array7168 = new Class475_Sub1[2];
	((Class552) this).aClass475_Sub1Array7176 = new Class475_Sub1[2];
	((Class552) this).aClass475_Sub1Array7157 = new Class475_Sub1[10050];
	((Class552) this).anInt7154 = 0;
	((Class552) this).aClass475_Sub1Array7156 = new Class475_Sub1[5066];
	((Class552) this).anInt7155 = 0;
	((Class552) this).aClass475_Sub1_Sub1Array7158
	    = new Class475_Sub1_Sub1[5090];
	((Class552) this).anInt7147 = 0;
	((Class552) this).aBoolArrayArray7134
	    = (new boolean
	       [(1222806433 * ((Class552) this).anInt7165
		 + 1222806433 * ((Class552) this).anInt7165 + 1)]
	       [1 + (((Class552) this).anInt7165 * 1222806433
		     + 1222806433 * ((Class552) this).anInt7165)]);
	((Class552) this).aBoolArrayArray7181
	    = (new boolean
	       [2 + (((Class552) this).anInt7165 * 1222806433
		     + 1222806433 * ((Class552) this).anInt7165)]
	       [(1222806433 * ((Class552) this).anInt7165
		 + ((Class552) this).anInt7165 * 1222806433 + 2)]);
	((Class552) this).anIntArray7145
	    = new int[(((Class552) this).anInt7165 * 1222806433
		       + ((Class552) this).anInt7165 * 1222806433 + 2)];
	aClass576_7180 = new Class576(false);
    }
    
    Class548 method12201(int i, int i_504_, int i_505_) {
	if (aClass548ArrayArrayArray7169[i][i_504_][i_505_] == null) {
	    boolean bool
		= (aClass548ArrayArrayArray7169[0][i_504_][i_505_] != null
		   && (aClass548ArrayArrayArray7169[0][i_504_][i_505_]
		       .aClass548_7063) != null);
	    if (bool && i >= anInt7132 * 532429613 - 1)
		return null;
	    method12107(i, i_504_, i_505_, -1218338009);
	}
	return aClass548ArrayArrayArray7169[i][i_504_][i_505_];
    }
    
    public int method12202(int i, int i_506_, int i_507_) {
	return (null != ((Class552) this).aByteArrayArray7144
		? ((Class552) this).aByteArrayArray7144[i][i_506_] & 0xff : 0);
    }
    
    public Class475_Sub1_Sub1 method12203(int i, int i_508_, int i_509_,
					  Interface57 interface57) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_508_][i_509_];
	if (class548 == null)
	    return null;
	for (Class541 class541 = class548.aClass541_7053; class541 != null;
	     class541 = class541.aClass541_7005) {
	    Class475_Sub1_Sub1 class475_sub1_sub1
		= class541.aClass475_Sub1_Sub1_7004;
	    if ((interface57 == null
		 || interface57.method430(class475_sub1_sub1, 1762907344))
		&& class475_sub1_sub1.aShort10717 == i_508_
		&& class475_sub1_sub1.aShort10718 == i_509_) {
		method12130(class475_sub1_sub1, false, -1703354374);
		return class475_sub1_sub1;
	    }
	}
	return null;
    }
    
    public Class475_Sub1_Sub1 method12204(int i, int i_510_, int i_511_,
					  Interface57 interface57) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_510_][i_511_];
	if (class548 == null)
	    return null;
	for (Class541 class541 = class548.aClass541_7053; class541 != null;
	     class541 = class541.aClass541_7005) {
	    Class475_Sub1_Sub1 class475_sub1_sub1
		= class541.aClass475_Sub1_Sub1_7004;
	    if ((interface57 == null
		 || interface57.method430(class475_sub1_sub1, 1434667206))
		&& class475_sub1_sub1.aShort10717 == i_510_
		&& class475_sub1_sub1.aShort10718 == i_511_) {
		method12130(class475_sub1_sub1, false, -381728223);
		return class475_sub1_sub1;
	    }
	}
	return null;
    }
    
    public boolean method12205(Class241_Sub39_Sub17 class241_sub39_sub17,
			       int i, int i_512_, int i_513_, boolean[] bools,
			       int i_514_) {
	boolean bool = false;
	if (aClass166Array7184 != aClass166Array7140) {
	    int i_515_ = aClass166Array7179[i].method3574(i_512_, i_513_,
							  -1302430157);
	    int i_516_ = 0;
	    for (/**/; i_516_ <= i; i_516_++) {
		Class166 class166 = aClass166Array7179[i_516_];
		if (class166 != null) {
		    int i_517_ = i_515_ - class166.method3574(i_512_, i_513_,
							      743294516);
		    if (null != bools) {
			bools[i_516_]
			    = class166.method3556(class241_sub39_sub17, i_512_,
						  i_517_, i_513_, 0, false);
			if (!bools[i_516_])
			    continue;
		    }
		    class166.method3554(class241_sub39_sub17, i_512_, i_517_,
					i_513_, 0, false);
		    bool = true;
		}
	    }
	}
	return bool;
    }
    
    public void method12206(Class544 class544) {
	if (1754722005 * ((Class552) this).anInt7129 < 65074) {
	    Class241_Sub43 class241_sub43 = class544.aClass241_Sub43_7038;
	    ((Class552) this).aClass544Array7178[(((Class552) this).anInt7129
						  * 1754722005)]
		= class544;
	    ((Class552) this).aBoolArray7161[(((Class552) this).anInt7129
					      * 1754722005)]
		= false;
	    ((Class552) this).anInt7129 += 960289405;
	    int i = 116093747 * class544.anInt7041;
	    if (((Class544) class544).aBool7040)
		i = 0;
	    int i_518_ = class544.anInt7041 * 116093747;
	    if (((Class544) class544).aBool7018)
		i_518_ = 532429613 * anInt7132 - 1;
	    for (int i_519_ = i; i_519_ <= i_518_; i_519_++) {
		int i_520_ = 0;
		int i_521_ = ((class241_sub43.method16455(626523592)
			       - class241_sub43.method16468(1143403757)
			       + -558976661 * ((Class552) this).anInt7141)
			      >> anInt7123 * 1591782305);
		if (i_521_ < 0) {
		    i_520_ -= i_521_;
		    i_521_ = 0;
		}
		int i_522_ = ((class241_sub43.method16455(626523592)
			       + class241_sub43.method16468(1143403757)
			       - ((Class552) this).anInt7141 * -558976661)
			      >> 1591782305 * anInt7123);
		if (i_522_ >= -2069974325 * anInt7142)
		    i_522_ = -2069974325 * anInt7142 - 1;
		for (int i_523_ = i_521_; i_523_ <= i_522_; i_523_++) {
		    int i_524_
			= ((Class544) class544).aShortArray7042[i_520_++];
		    int i_525_ = (((class241_sub43.method16453((byte) -40)
				    - class241_sub43.method16468(1143403757)
				    + ((Class552) this).anInt7141 * -558976661)
				   >> 1591782305 * anInt7123)
				  + (i_524_ >>> 8));
		    int i_526_ = i_525_ + (i_524_ & 0xff) - 1;
		    if (i_525_ < 0)
			i_525_ = 0;
		    if (i_526_ >= 120442351 * anInt7138)
			i_526_ = anInt7138 * 120442351 - 1;
		    for (int i_527_ = i_525_; i_527_ <= i_526_; i_527_++) {
			long l = (((Class552) this).aLongArrayArrayArray7177
				  [i_519_][i_527_][i_523_]);
			if ((l & 0xffffL) == 0L)
			    ((Class552) this).aLongArrayArrayArray7177
				[i_519_][i_527_][i_523_]
				= l | (long) (1754722005
					      * ((Class552) this).anInt7129);
			else if ((l & 0xffff0000L) == 0L)
			    ((Class552) this).aLongArrayArrayArray7177
				[i_519_][i_527_][i_523_]
				= l | (long) (((Class552) this).anInt7129
					      * 1754722005) << 16;
			else if ((l & 0xffff00000000L) == 0L)
			    ((Class552) this).aLongArrayArrayArray7177
				[i_519_][i_527_][i_523_]
				= l | ((long) (1754722005
					       * ((Class552) this).anInt7129)
				       << 32);
			else if ((l & ~0xffffffffffffL) == 0L)
			    ((Class552) this).aLongArrayArrayArray7177
				[i_519_][i_527_][i_523_]
				= l | ((long) (1754722005
					       * ((Class552) this).anInt7129)
				       << 48);
		    }
		}
	    }
	}
    }
    
    void method12207(Class475_Sub1 class475_sub1) {
	if (null != class475_sub1) {
	    class475_sub1.method10884();
	    for (int i = 0; i < 2; i++) {
		Class475_Sub1 class475_sub1_528_ = null;
		for (Class475_Sub1 class475_sub1_529_
			 = ((Class552) this).aClass475_Sub1Array7151[i];
		     null != class475_sub1_529_;
		     class475_sub1_529_ = (((Class475_Sub1) class475_sub1_529_)
					   .aClass475_Sub1_8743)) {
		    if (class475_sub1 == class475_sub1_529_) {
			if (null != class475_sub1_528_)
			    ((Class475_Sub1) class475_sub1_528_)
				.aClass475_Sub1_8743
				= (((Class475_Sub1) class475_sub1_529_)
				   .aClass475_Sub1_8743);
			else
			    ((Class552) this).aClass475_Sub1Array7151[i]
				= (((Class475_Sub1) class475_sub1_529_)
				   .aClass475_Sub1_8743);
			return;
		    }
		    class475_sub1_528_ = class475_sub1_529_;
		}
		class475_sub1_528_ = null;
		for (Class475_Sub1 class475_sub1_530_
			 = ((Class552) this).aClass475_Sub1Array7168[i];
		     class475_sub1_530_ != null;
		     class475_sub1_530_ = (((Class475_Sub1) class475_sub1_530_)
					   .aClass475_Sub1_8743)) {
		    if (class475_sub1 == class475_sub1_530_) {
			if (null != class475_sub1_528_)
			    ((Class475_Sub1) class475_sub1_528_)
				.aClass475_Sub1_8743
				= (((Class475_Sub1) class475_sub1_530_)
				   .aClass475_Sub1_8743);
			else
			    ((Class552) this).aClass475_Sub1Array7168[i]
				= (((Class475_Sub1) class475_sub1_530_)
				   .aClass475_Sub1_8743);
			return;
		    }
		    class475_sub1_528_ = class475_sub1_530_;
		}
		class475_sub1_528_ = null;
		for (Class475_Sub1 class475_sub1_531_
			 = ((Class552) this).aClass475_Sub1Array7176[i];
		     null != class475_sub1_531_;
		     class475_sub1_531_ = (((Class475_Sub1) class475_sub1_531_)
					   .aClass475_Sub1_8743)) {
		    if (class475_sub1_531_ == class475_sub1) {
			if (null != class475_sub1_528_)
			    ((Class475_Sub1) class475_sub1_528_)
				.aClass475_Sub1_8743
				= (((Class475_Sub1) class475_sub1_531_)
				   .aClass475_Sub1_8743);
			else
			    ((Class552) this).aClass475_Sub1Array7176[i]
				= (((Class475_Sub1) class475_sub1_531_)
				   .aClass475_Sub1_8743);
			return;
		    }
		    class475_sub1_528_ = class475_sub1_531_;
		}
	    }
	}
    }
    
    public void method12208
	(int i, int i_532_, int i_533_, int i_534_, byte[][][] is,
	 int[] is_535_, int[] is_536_, int[] is_537_, int[] is_538_,
	 int[] is_539_, int i_540_, byte i_541_, int i_542_, int i_543_,
	 boolean bool, boolean bool_544_, int i_545_, boolean bool_546_) {
	((Class550) aClass550_7131).aBool7091 = true;
	((Class552) this).aBool7130 = bool_544_;
	((Class552) this).anInt7128
	    = 1199798555 * (i_532_ >> 1591782305 * anInt7123);
	((Class552) this).anInt7160
	    = (i_534_ >> anInt7123 * 1591782305) * -1211576511;
	((Class552) this).anInt7153 = -1632632143 * i_532_;
	((Class552) this).anInt7162 = -1203496281 * i_534_;
	((Class552) this).anInt7163 = i_533_ * -646808425;
	((Class552) this).anInt7125
	    = (((Class552) this).anInt7128 * -263440015
	       - ((Class552) this).anInt7165 * -725548085);
	if (-728696637 * ((Class552) this).anInt7125 < 0) {
	    ((Class552) this).anInt7122
		= -(473569545 * ((Class552) this).anInt7125);
	    ((Class552) this).anInt7125 = 0;
	} else
	    ((Class552) this).anInt7122 = 0;
	((Class552) this).anInt7170
	    = (1088315823 * ((Class552) this).anInt7160
	       - ((Class552) this).anInt7165 * -1479501617);
	if (((Class552) this).anInt7170 * -1866739569 < 0) {
	    ((Class552) this).anInt7167
		= -(-491682031 * ((Class552) this).anInt7170);
	    ((Class552) this).anInt7170 = 0;
	} else
	    ((Class552) this).anInt7167 = 0;
	((Class552) this).anInt7139
	    = (-906515853 * ((Class552) this).anInt7128
	       + ((Class552) this).anInt7165 * -2061994815);
	if (-579244319 * ((Class552) this).anInt7139 > anInt7138 * 120442351)
	    ((Class552) this).anInt7139 = 1866458831 * anInt7138;
	((Class552) this).anInt7171
	    = (499362943 * ((Class552) this).anInt7160
	       + ((Class552) this).anInt7165 * -1460733537);
	if (-1599933761 * ((Class552) this).anInt7171
	    > -2069974325 * anInt7142)
	    ((Class552) this).anInt7171 = -1337581835 * anInt7142;
	boolean[][] bools = ((Class552) this).aBoolArrayArray7134;
	boolean[][] bools_547_ = ((Class552) this).aBoolArrayArray7181;
	if (((Class552) this).aBool7130) {
	    for (int i_548_ = 0;
		 i_548_ < 2 + (1222806433 * ((Class552) this).anInt7165
			       + 1222806433 * ((Class552) this).anInt7165);
		 i_548_++) {
		int i_549_ = 0;
		int i_550_ = 0;
		for (int i_551_ = 0;
		     i_551_ < 2 + (((Class552) this).anInt7165 * 1222806433
				   + 1222806433 * ((Class552) this).anInt7165);
		     i_551_++) {
		    if (i_551_ > 1)
			((Class552) this).anIntArray7145[i_551_ - 2] = i_549_;
		    i_549_ = i_550_;
		    int i_552_ = (((Class552) this).anInt7128 * -985319149
				  - 1222806433 * ((Class552) this).anInt7165
				  + i_548_);
		    int i_553_ = (-1234452287 * ((Class552) this).anInt7160
				  - ((Class552) this).anInt7165 * 1222806433
				  + i_551_);
		    if (i_552_ >= 0 && i_553_ >= 0
			&& i_552_ < anInt7138 * 120442351
			&& i_553_ < anInt7142 * -2069974325) {
			int i_554_ = i_552_ << 1591782305 * anInt7123;
			int i_555_ = i_553_ << anInt7123 * 1591782305;
			int i_556_
			    = (aClass166Array7179
				   [aClass166Array7179.length - 1]
				   .method3551(i_552_, i_553_, 1019455652)
			       - (1000 << 1591782305 * anInt7123 - 7));
			int i_557_
			    = ((aClass166Array7140 != null
				? (aClass166Array7140[0]
				       .method3551(i_552_, i_553_, -79688610)
				   + -1302211377 * ((Class552) this).anInt7124)
				: (aClass166Array7179[0]
				       .method3551(i_552_, i_553_, -1655551949)
				   + (-1302211377
				      * ((Class552) this).anInt7124)))
			       + (1000 << anInt7123 * 1591782305 - 7));
			i_550_ = (((Class552) this).aClass103_7127.method2412
				  (i_554_, i_556_, i_555_, i_554_, i_557_,
				   i_555_));
			((Class552) this).aBoolArrayArray7181[i_548_][i_551_]
			    = 0 == i_550_;
		    } else {
			i_550_ = -1;
			((Class552) this).aBoolArrayArray7181[i_548_][i_551_]
			    = false;
		    }
		    if (i_548_ > 0 && i_551_ > 0) {
			int i_558_
			    = (((Class552) this).anIntArray7145[i_551_ - 1]
			       & ((Class552) this).anIntArray7145[i_551_]
			       & i_549_ & i_550_);
			((Class552) this).aBoolArrayArray7134[i_548_ - 1]
			    [i_551_ - 1]
			    = 0 == i_558_;
		    }
		}
		((Class552) this).anIntArray7145
		    [(1222806433 * ((Class552) this).anInt7165
		      + ((Class552) this).anInt7165 * 1222806433)]
		    = i_549_;
		((Class552) this).anIntArray7145
		    [(1222806433 * ((Class552) this).anInt7165
		      + 1222806433 * ((Class552) this).anInt7165 + 1)]
		    = i_550_;
	    }
	    if (!bool_546_)
		((Class550) aClass550_7131).aBool7091 = false;
	    else {
		((Class550) aClass550_7131).anIntArray7109 = is_535_;
		((Class550) aClass550_7131).anIntArray7095 = is_536_;
		((Class550) aClass550_7131).anIntArray7106 = is_537_;
		((Class550) aClass550_7131).anIntArray7119 = is_538_;
		((Class550) aClass550_7131).anIntArray7096 = is_539_;
		aClass550_7131.method12039(((Class552) this).aClass103_7127,
					   i_540_);
	    }
	} else {
	    if (((Class552) this).aBoolArrayArray7137 == null)
		((Class552) this).aBoolArrayArray7137
		    = (new boolean
		       [2 + (((Class552) this).anInt7165 * 1222806433
			     + 1222806433 * ((Class552) this).anInt7165)]
		       [(1222806433 * ((Class552) this).anInt7165
			 + ((Class552) this).anInt7165 * 1222806433 + 2)]);
	    for (int i_559_ = 0;
		 i_559_ < ((Class552) this).aBoolArrayArray7137.length;
		 i_559_++) {
		for (int i_560_ = 0;
		     i_560_ < ((Class552) this).aBoolArrayArray7137[0].length;
		     i_560_++)
		    ((Class552) this).aBoolArrayArray7137[i_559_][i_560_]
			= true;
	    }
	    ((Class552) this).aBoolArrayArray7181
		= ((Class552) this).aBoolArrayArray7137;
	    ((Class552) this).aBoolArrayArray7134
		= ((Class552) this).aBoolArrayArray7137;
	    ((Class552) this).anInt7125 = 0;
	    ((Class552) this).anInt7170 = 0;
	    ((Class552) this).anInt7139 = anInt7138 * 1866458831;
	    ((Class552) this).anInt7171 = anInt7142 * -1337581835;
	    ((Class550) aClass550_7131).aBool7091 = false;
	}
	Class220.method4385(this, ((Class552) this).aClass103_7127, 585766242);
	if (!((Class576) aClass576_7180).aBool7444) {
	    Iterator iterator = aClass576_7180.aList7447.iterator();
	    while (iterator.hasNext()) {
		Class542 class542 = (Class542) iterator.next();
		iterator.remove();
		Class67.method1648(class542, 1909696333);
	    }
	}
	if (((Class552) this).aBool7136) {
	    for (int i_561_ = 0;
		 i_561_ < ((Class552) this).anInt7129 * 1754722005; i_561_++)
		((Class552) this).aClass544Array7178[i_561_]
		    .method11980(i, bool, 361359906);
	}
	if (null != aClass548ArrayArrayArray7135) {
	    method12102(true, (byte) 3);
	    ((Class552) this).aClass103_7127
		.method2334(-1, new Class86(1583160, 40, 127, 63, 0, 0, 0));
	    method12143(true, is, i_540_, i_541_, i_545_);
	    ((Class552) this).aClass103_7127.method2336();
	    method12102(false, (byte) 5);
	}
	method12143(false, is, i_540_, i_541_, i_545_);
	if (!((Class552) this).aBool7130) {
	    ((Class552) this).aBoolArrayArray7134 = bools;
	    ((Class552) this).aBoolArrayArray7181 = bools_547_;
	}
    }
    
    public Class475_Sub1_Sub3 method12209(int i, int i_562_, int i_563_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_562_][i_563_];
	if (class548 == null)
	    return null;
	return class548.aClass475_Sub1_Sub3_7055;
    }
    
    public Class475_Sub1_Sub5 method12210(int i, int i_564_, int i_565_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_564_][i_565_];
	if (class548 == null)
	    return null;
	return class548.aClass475_Sub1_Sub5_7061;
    }
    
    public Class475_Sub1_Sub2 method12211(int i, int i_566_, int i_567_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_566_][i_567_];
	if (null == class548)
	    return null;
	return ((Class548) class548).aClass475_Sub1_Sub2_7060;
    }
    
    public Class475_Sub1_Sub1 method12212(int i, int i_568_, int i_569_,
					  Interface57 interface57) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_568_][i_569_];
	if (class548 == null)
	    return null;
	for (Class541 class541 = class548.aClass541_7053; class541 != null;
	     class541 = class541.aClass541_7005) {
	    Class475_Sub1_Sub1 class475_sub1_sub1
		= class541.aClass475_Sub1_Sub1_7004;
	    if ((interface57 == null
		 || interface57.method430(class475_sub1_sub1, 736282800))
		&& i_568_ == class475_sub1_sub1.aShort10717
		&& i_569_ == class475_sub1_sub1.aShort10718)
		return class475_sub1_sub1;
	}
	return null;
    }
    
    void method12213(Class475_Sub1 class475_sub1, int i) {
	Class287 class287 = class475_sub1.method10874().aClass287_4386;
	((Class552) this).aClass103_7127.method2338
	    ((float) (int) class287.aFloat4477,
	     (float) ((int) class287.aFloat4474
		      + (class475_sub1.method14468((byte) 56) >> 1)),
	     (float) (int) class287.aFloat4479,
	     ((Class552) this).aFloatArray7172);
	((Class475_Sub1) class475_sub1).anInt8747
	    = 1414514001 * (int) ((Class552) this).aFloatArray7172[2];
    }
    
    public Class541 method12214(int i, int i_570_, int i_571_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_570_][i_571_];
	if (null == class548)
	    return null;
	return class548.aClass541_7053;
    }
    
    public Class475_Sub1_Sub3 method12215(int i, int i_572_, int i_573_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_572_][i_573_];
	if (null != class548) {
	    method12131(class548.aClass475_Sub1_Sub3_7055, (byte) 54);
	    if (class548.aClass475_Sub1_Sub3_7055 != null) {
		Class475_Sub1_Sub3 class475_sub1_sub3
		    = class548.aClass475_Sub1_Sub3_7055;
		class548.aClass475_Sub1_Sub3_7055 = null;
		return class475_sub1_sub3;
	    }
	}
	return null;
    }
    
    public Class475_Sub1_Sub4 method12216(int i, int i_574_, int i_575_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_574_][i_575_];
	if (null == class548 || null == class548.aClass475_Sub1_Sub4_7058)
	    return null;
	return class548.aClass475_Sub1_Sub4_7058;
    }
    
    public Class475_Sub1_Sub3 method12217(int i, int i_576_, int i_577_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_576_][i_577_];
	if (class548 != null) {
	    method12131(class548.aClass475_Sub1_Sub3_7056, (byte) -19);
	    if (null != class548.aClass475_Sub1_Sub3_7056) {
		Class475_Sub1_Sub3 class475_sub1_sub3
		    = class548.aClass475_Sub1_Sub3_7056;
		class548.aClass475_Sub1_Sub3_7056 = null;
		return class475_sub1_sub3;
	    }
	}
	return null;
    }
    
    public Class475_Sub1_Sub4 method12218(int i, int i_578_, int i_579_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_578_][i_579_];
	if (null == class548 || null == class548.aClass475_Sub1_Sub4_7058)
	    return null;
	return class548.aClass475_Sub1_Sub4_7058;
    }
    
    public void method12219() {
	for (int i = 0; i < anInt7132 * 532429613; i++) {
	    for (int i_580_ = 0; i_580_ < anInt7138 * 120442351; i_580_++) {
		for (int i_581_ = 0; i_581_ < -2069974325 * anInt7142;
		     i_581_++) {
		    Class548 class548
			= aClass548ArrayArrayArray7169[i][i_580_][i_581_];
		    if (class548 != null) {
			Class475_Sub1_Sub3 class475_sub1_sub3
			    = class548.aClass475_Sub1_Sub3_7055;
			Class475_Sub1_Sub3 class475_sub1_sub3_582_
			    = class548.aClass475_Sub1_Sub3_7056;
			if (class475_sub1_sub3 != null
			    && class475_sub1_sub3.method14450(-1724119410)) {
			    method12141(class475_sub1_sub3, i, i_580_, i_581_,
					1, 1);
			    if (class475_sub1_sub3_582_ != null
				&& class475_sub1_sub3_582_
				       .method14450(-1854707556)) {
				method12141(class475_sub1_sub3_582_, i, i_580_,
					    i_581_, 1, 1);
				class475_sub1_sub3_582_.method14453
				    (((Class552) this).aClass103_7127,
				     class475_sub1_sub3, 0, 0, 0, false,
				     2063176952);
				class475_sub1_sub3_582_
				    .method14454((byte) -126);
			    }
			    class475_sub1_sub3.method14454((byte) -13);
			}
			for (Class541 class541 = class548.aClass541_7053;
			     class541 != null;
			     class541 = class541.aClass541_7005) {
			    Class475_Sub1_Sub1 class475_sub1_sub1
				= class541.aClass475_Sub1_Sub1_7004;
			    if (null != class475_sub1_sub1
				&& class475_sub1_sub1
				       .method14450(-2128813150)) {
				method12141(class475_sub1_sub1, i, i_580_,
					    i_581_,
					    1 + (class475_sub1_sub1.aShort10716
						 - (class475_sub1_sub1
						    .aShort10717)),
					    (class475_sub1_sub1.aShort10719
					     - class475_sub1_sub1.aShort10718
					     + 1));
				class475_sub1_sub1.method14454((byte) -95);
			    }
			}
			Class475_Sub1_Sub4 class475_sub1_sub4
			    = class548.aClass475_Sub1_Sub4_7058;
			if (class475_sub1_sub4 != null
			    && class475_sub1_sub4.method14450(-1866161408)) {
			    method12195(class475_sub1_sub4, i, i_580_, i_581_,
					-1283207489);
			    class475_sub1_sub4.method14454((byte) -99);
			}
		    }
		}
	    }
	}
    }
    
    public void method12220() {
	for (int i = 0; i < anInt7132 * 532429613; i++) {
	    for (int i_583_ = 0; i_583_ < anInt7138 * 120442351; i_583_++) {
		for (int i_584_ = 0; i_584_ < -2069974325 * anInt7142;
		     i_584_++) {
		    Class548 class548
			= aClass548ArrayArrayArray7169[i][i_583_][i_584_];
		    if (class548 != null) {
			Class475_Sub1_Sub3 class475_sub1_sub3
			    = class548.aClass475_Sub1_Sub3_7055;
			Class475_Sub1_Sub3 class475_sub1_sub3_585_
			    = class548.aClass475_Sub1_Sub3_7056;
			if (class475_sub1_sub3 != null
			    && class475_sub1_sub3.method14450(1844312399)) {
			    method12141(class475_sub1_sub3, i, i_583_, i_584_,
					1, 1);
			    if (class475_sub1_sub3_585_ != null
				&& class475_sub1_sub3_585_
				       .method14450(-1366725905)) {
				method12141(class475_sub1_sub3_585_, i, i_583_,
					    i_584_, 1, 1);
				class475_sub1_sub3_585_.method14453
				    (((Class552) this).aClass103_7127,
				     class475_sub1_sub3, 0, 0, 0, false,
				     2136339302);
				class475_sub1_sub3_585_
				    .method14454((byte) -119);
			    }
			    class475_sub1_sub3.method14454((byte) -88);
			}
			for (Class541 class541 = class548.aClass541_7053;
			     class541 != null;
			     class541 = class541.aClass541_7005) {
			    Class475_Sub1_Sub1 class475_sub1_sub1
				= class541.aClass475_Sub1_Sub1_7004;
			    if (null != class475_sub1_sub1
				&& class475_sub1_sub1.method14450(54060750)) {
				method12141(class475_sub1_sub1, i, i_583_,
					    i_584_,
					    1 + (class475_sub1_sub1.aShort10716
						 - (class475_sub1_sub1
						    .aShort10717)),
					    (class475_sub1_sub1.aShort10719
					     - class475_sub1_sub1.aShort10718
					     + 1));
				class475_sub1_sub1.method14454((byte) -112);
			    }
			}
			Class475_Sub1_Sub4 class475_sub1_sub4
			    = class548.aClass475_Sub1_Sub4_7058;
			if (class475_sub1_sub4 != null
			    && class475_sub1_sub4.method14450(-411937830)) {
			    method12195(class475_sub1_sub4, i, i_583_, i_584_,
					1627182033);
			    class475_sub1_sub4.method14454((byte) -101);
			}
		    }
		}
	    }
	}
    }
    
    void method12221(Class475_Sub1 class475_sub1, int i, int i_586_,
		     int i_587_) {
	if (i_586_ < anInt7138 * 120442351) {
	    Class548 class548
		= aClass548ArrayArrayArray7169[i][1 + i_586_][i_587_];
	    if (class548 != null && null != class548.aClass475_Sub1_Sub4_7058
		&& class548.aClass475_Sub1_Sub4_7058.method14450(983730923)) {
		int i_588_
		    = ((aClass166Array7184[i].method3551(1 + i_586_, i_587_,
							 969850004)
			+ aClass166Array7184[i].method3551(i_586_ + 1 + 1,
							   i_587_, 982336387)
			+ aClass166Array7184[i]
			      .method3551(1 + i_586_, i_587_ + 1, 569436088)
			+ aClass166Array7184[i].method3551(1 + (i_586_ + 1),
							   i_587_ + 1,
							   363107186)) / 4
		       - (aClass166Array7184[i].method3551(i_586_, i_587_,
							   -1605501279)
			  + aClass166Array7184[i]
				.method3551(1 + i_586_, i_587_, -310331439)
			  + aClass166Array7184[i]
				.method3551(i_586_, 1 + i_587_, -1858576057)
			  + aClass166Array7184[i].method3551(i_586_ + 1,
							     1 + i_587_,
							     -401541235)) / 4);
		class475_sub1.method14453(((Class552) this).aClass103_7127,
					  class548.aClass475_Sub1_Sub4_7058,
					  (((Class552) this).anInt7124
					   * -1302211377),
					  i_588_, 0, true, 2049903413);
	    }
	}
	if (i_587_ < 120442351 * anInt7138) {
	    Class548 class548
		= aClass548ArrayArrayArray7169[i][i_586_][i_587_ + 1];
	    if (null != class548 && class548.aClass475_Sub1_Sub4_7058 != null
		&& class548.aClass475_Sub1_Sub4_7058.method14450(1681436073)) {
		int i_589_
		    = ((aClass166Array7184[i].method3551(i_586_, i_587_,
							 -155182533)
			+ aClass166Array7184[i]
			      .method3551(i_586_ + 1, i_587_ + 1, 43304193)
			+ aClass166Array7184[i]
			      .method3551(i_586_, 1 + (i_587_ + 1), -832014678)
			+ aClass166Array7184[i].method3551(1 + i_586_,
							   1 + i_587_ + 1,
							   -1070048796)) / 4
		       - (aClass166Array7184[i].method3551(i_586_, i_587_,
							   720838721)
			  + aClass166Array7184[i]
				.method3551(i_586_ + 1, i_587_, -2015380559)
			  + aClass166Array7184[i]
				.method3551(i_586_, 1 + i_587_, -1040658176)
			  + aClass166Array7184[i].method3551(1 + i_586_,
							     i_587_ + 1,
							     -441564781)) / 4);
		class475_sub1.method14453(((Class552) this).aClass103_7127,
					  class548.aClass475_Sub1_Sub4_7058, 0,
					  i_589_,
					  (((Class552) this).anInt7124
					   * -1302211377),
					  true, 2095195171);
	    }
	}
	if (i_586_ < anInt7138 * 120442351
	    && i_587_ < -2069974325 * anInt7142) {
	    Class548 class548
		= aClass548ArrayArrayArray7169[i][1 + i_586_][i_587_ + 1];
	    if (null != class548 && null != class548.aClass475_Sub1_Sub4_7058
		&& class548.aClass475_Sub1_Sub4_7058.method14450(908184595)) {
		int i_590_
		    = ((aClass166Array7184[i]
			    .method3551(1 + i_586_, i_587_ + 1, -1308998153)
			+ aClass166Array7184[i].method3551(1 + (1 + i_586_),
							   1 + i_587_,
							   220724089)
			+ aClass166Array7184[i].method3551(1 + i_586_,
							   1 + (i_587_ + 1),
							   -25687224)
			+ aClass166Array7184[i].method3551(1 + (1 + i_586_),
							   1 + i_587_ + 1,
							   -263166252)) / 4
		       - ((aClass166Array7184[i].method3551(i_586_, i_587_,
							    1046177322)
			   + aClass166Array7184[i]
				 .method3551(1 + i_586_, i_587_, -141795061)
			   + aClass166Array7184[i]
				 .method3551(i_586_, i_587_ + 1, 82418520)
			   + aClass166Array7184[i].method3551(1 + i_586_,
							      1 + i_587_,
							      -1886320379))
			  / 4));
		class475_sub1.method14453(((Class552) this).aClass103_7127,
					  class548.aClass475_Sub1_Sub4_7058,
					  (((Class552) this).anInt7124
					   * -1302211377),
					  i_590_,
					  (-1302211377
					   * ((Class552) this).anInt7124),
					  true, 2147355570);
	    }
	}
	if (i_586_ < anInt7138 * 120442351 && i_587_ > 0) {
	    Class548 class548
		= aClass548ArrayArrayArray7169[i][i_586_ + 1][i_587_ - 1];
	    if (null != class548 && class548.aClass475_Sub1_Sub4_7058 != null
		&& class548.aClass475_Sub1_Sub4_7058.method14450(468136783)) {
		int i_591_
		    = ((aClass166Array7184[i]
			    .method3551(1 + i_586_, i_587_ - 1, -688829829)
			+ aClass166Array7184[i].method3551(1 + i_586_ + 1,
							   i_587_ - 1,
							   -1634867088)
			+ aClass166Array7184[i].method3551(1 + i_586_,
							   i_587_ + 1 - 1,
							   -255993249)
			+ aClass166Array7184[i].method3551(i_586_ + 1 + 1,
							   1 + i_587_ - 1,
							   84935882)) / 4
		       - ((aClass166Array7184[i].method3551(i_586_, i_587_,
							    -116854603)
			   + aClass166Array7184[i]
				 .method3551(1 + i_586_, i_587_, -1678644223)
			   + aClass166Array7184[i]
				 .method3551(i_586_, 1 + i_587_, -856129055)
			   + aClass166Array7184[i].method3551(1 + i_586_,
							      1 + i_587_,
							      -1204865978))
			  / 4));
		class475_sub1.method14453(((Class552) this).aClass103_7127,
					  class548.aClass475_Sub1_Sub4_7058,
					  (-1302211377
					   * ((Class552) this).anInt7124),
					  i_591_,
					  -(-1302211377
					    * ((Class552) this).anInt7124),
					  true, 2064806510);
	    }
	}
    }
    
    void method12222(Class475_Sub1 class475_sub1, int i, int i_592_,
		     int i_593_, int i_594_, int i_595_) {
	boolean bool = true;
	int i_596_ = i_592_;
	int i_597_ = i_592_ + i_594_;
	int i_598_ = i_593_ - 1;
	int i_599_ = i_593_ + i_595_;
	for (int i_600_ = i; i_600_ <= i + 1; i_600_++) {
	    if (anInt7132 * 532429613 != i_600_) {
		for (int i_601_ = i_596_; i_601_ <= i_597_; i_601_++) {
		    if (i_601_ >= 0 && i_601_ < 120442351 * anInt7138) {
			for (int i_602_ = i_598_; i_602_ <= i_599_; i_602_++) {
			    if (i_602_ >= 0 && i_602_ < anInt7142 * -2069974325
				&& (!bool || i_601_ >= i_597_
				    || i_602_ >= i_599_
				    || i_602_ < i_593_ && i_592_ != i_601_)) {
				Class548 class548
				    = (aClass548ArrayArrayArray7169[i_600_]
				       [i_601_][i_602_]);
				if (null != class548) {
				    int i_603_
					= (((aClass166Array7184[i_600_]
						 .method3551
					     (i_601_, i_602_, -1281264447))
					    + (aClass166Array7184[i_600_]
						   .method3551
					       (i_601_ + 1, i_602_,
						-959483270))
					    + (aClass166Array7184[i_600_]
						   .method3551
					       (i_601_, i_602_ + 1,
						-1316791869))
					    + (aClass166Array7184[i_600_]
						   .method3551
					       (i_601_ + 1, 1 + i_602_,
						-1529490404))) / 4
					   - ((aClass166Array7184[i].method3551
					       (i_592_, i_593_, 577730915))
					      + (aClass166Array7184[i]
						     .method3551
						 (i_592_ + 1, i_593_,
						  101153862))
					      + (aClass166Array7184[i]
						     .method3551
						 (i_592_, i_593_ + 1,
						  -1460666409))
					      + (aClass166Array7184[i]
						     .method3551
						 (1 + i_592_, i_593_ + 1,
						  -1564793458))) / 4);
				    Class475_Sub1_Sub3 class475_sub1_sub3
					= class548.aClass475_Sub1_Sub3_7055;
				    Class475_Sub1_Sub3 class475_sub1_sub3_604_
					= class548.aClass475_Sub1_Sub3_7056;
				    if (class475_sub1_sub3 != null
					&& class475_sub1_sub3
					       .method14450(1554043232))
					class475_sub1.method14453
					    (((Class552) this).aClass103_7127,
					     class475_sub1_sub3,
					     (((1 - i_594_)
					       * (-558976661
						  * (((Class552) this)
						     .anInt7141)))
					      + (((Class552) this).anInt7124
						 * -1302211377
						 * (i_601_ - i_592_))),
					     i_603_,
					     (((1 - i_595_)
					       * (-558976661
						  * (((Class552) this)
						     .anInt7141)))
					      + (((Class552) this).anInt7124
						 * -1302211377
						 * (i_602_ - i_593_))),
					     bool, 2068326787);
				    if (null != class475_sub1_sub3_604_
					&& class475_sub1_sub3_604_
					       .method14450(-2076896680))
					class475_sub1.method14453
					    (((Class552) this).aClass103_7127,
					     class475_sub1_sub3_604_,
					     (((1 - i_594_)
					       * (((Class552) this).anInt7141
						  * -558976661))
					      + ((i_601_ - i_592_)
						 * (((Class552) this).anInt7124
						    * -1302211377))),
					     i_603_,
					     ((-1302211377
					       * ((Class552) this).anInt7124
					       * (i_602_ - i_593_))
					      + (-558976661
						 * ((Class552) this).anInt7141
						 * (1 - i_595_))),
					     bool, 2080394371);
				    for (Class541 class541
					     = class548.aClass541_7053;
					 class541 != null;
					 class541 = class541.aClass541_7005) {
					Class475_Sub1_Sub1 class475_sub1_sub1
					    = (class541
					       .aClass475_Sub1_Sub1_7004);
					if (null != class475_sub1_sub1
					    && class475_sub1_sub1
						   .method14450(1402911923)
					    && ((class475_sub1_sub1.aShort10717
						 == i_601_)
						|| i_596_ == i_601_)
					    && (i_602_ == (class475_sub1_sub1
							   .aShort10718)
						|| i_602_ == i_598_)) {
					    int i_605_
						= 1 + ((class475_sub1_sub1
							.aShort10716)
						       - (class475_sub1_sub1
							  .aShort10717));
					    int i_606_
						= 1 + ((class475_sub1_sub1
							.aShort10719)
						       - (class475_sub1_sub1
							  .aShort10718));
					    class475_sub1.method14453
						((((Class552) this)
						  .aClass103_7127),
						 class475_sub1_sub1,
						 (((i_605_ - i_594_)
						   * ((((Class552) this)
						       .anInt7141)
						      * -558976661))
						  + (((class475_sub1_sub1
						       .aShort10717)
						      - i_592_)
						     * (-1302211377
							* (((Class552) this)
							   .anInt7124)))),
						 i_603_,
						 ((((Class552) this).anInt7124
						   * -1302211377
						   * ((class475_sub1_sub1
						       .aShort10718)
						      - i_593_))
						  + ((((Class552) this)
						      .anInt7141)
						     * -558976661
						     * (i_606_ - i_595_))),
						 bool, 2084196835);
					}
				    }
				}
			    }
			}
		    }
		}
		i_596_--;
		bool = false;
	    }
	}
    }
    
    public Class475_Sub1_Sub5 method12223(int i, int i_607_, int i_608_,
					  byte i_609_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_607_][i_608_];
	if (null != class548) {
	    method12131(class548.aClass475_Sub1_Sub5_7059, (byte) 40);
	    if (class548.aClass475_Sub1_Sub5_7059 != null) {
		Class475_Sub1_Sub5 class475_sub1_sub5
		    = class548.aClass475_Sub1_Sub5_7059;
		class548.aClass475_Sub1_Sub5_7059 = null;
		return class475_sub1_sub5;
	    }
	}
	return null;
    }
    
    void method12224(Class475_Sub1 class475_sub1, int i, int i_610_,
		     int i_611_, int i_612_, int i_613_) {
	boolean bool = true;
	int i_614_ = i_610_;
	int i_615_ = i_610_ + i_612_;
	int i_616_ = i_611_ - 1;
	int i_617_ = i_611_ + i_613_;
	for (int i_618_ = i; i_618_ <= i + 1; i_618_++) {
	    if (anInt7132 * 532429613 != i_618_) {
		for (int i_619_ = i_614_; i_619_ <= i_615_; i_619_++) {
		    if (i_619_ >= 0 && i_619_ < 120442351 * anInt7138) {
			for (int i_620_ = i_616_; i_620_ <= i_617_; i_620_++) {
			    if (i_620_ >= 0 && i_620_ < anInt7142 * -2069974325
				&& (!bool || i_619_ >= i_615_
				    || i_620_ >= i_617_
				    || i_620_ < i_611_ && i_610_ != i_619_)) {
				Class548 class548
				    = (aClass548ArrayArrayArray7169[i_618_]
				       [i_619_][i_620_]);
				if (null != class548) {
				    int i_621_
					= (((aClass166Array7184[i_618_]
						 .method3551
					     (i_619_, i_620_, -754046148))
					    + (aClass166Array7184[i_618_]
						   .method3551
					       (i_619_ + 1, i_620_,
						-1117113206))
					    + (aClass166Array7184[i_618_]
						   .method3551
					       (i_619_, i_620_ + 1,
						-1073513889))
					    + (aClass166Array7184[i_618_]
						   .method3551
					       (i_619_ + 1, 1 + i_620_,
						924824544))) / 4
					   - ((aClass166Array7184[i].method3551
					       (i_610_, i_611_, -1015637760))
					      + (aClass166Array7184[i]
						     .method3551
						 (i_610_ + 1, i_611_,
						  -420330472))
					      + (aClass166Array7184[i]
						     .method3551
						 (i_610_, i_611_ + 1,
						  -1827386023))
					      + (aClass166Array7184[i]
						     .method3551
						 (1 + i_610_, i_611_ + 1,
						  507995991))) / 4);
				    Class475_Sub1_Sub3 class475_sub1_sub3
					= class548.aClass475_Sub1_Sub3_7055;
				    Class475_Sub1_Sub3 class475_sub1_sub3_622_
					= class548.aClass475_Sub1_Sub3_7056;
				    if (class475_sub1_sub3 != null
					&& class475_sub1_sub3
					       .method14450(56890885))
					class475_sub1.method14453
					    (((Class552) this).aClass103_7127,
					     class475_sub1_sub3,
					     (((1 - i_612_)
					       * (-558976661
						  * (((Class552) this)
						     .anInt7141)))
					      + (((Class552) this).anInt7124
						 * -1302211377
						 * (i_619_ - i_610_))),
					     i_621_,
					     (((1 - i_613_)
					       * (-558976661
						  * (((Class552) this)
						     .anInt7141)))
					      + (((Class552) this).anInt7124
						 * -1302211377
						 * (i_620_ - i_611_))),
					     bool, 2101562552);
				    if (null != class475_sub1_sub3_622_
					&& class475_sub1_sub3_622_
					       .method14450(-1234444033))
					class475_sub1.method14453
					    (((Class552) this).aClass103_7127,
					     class475_sub1_sub3_622_,
					     (((1 - i_612_)
					       * (((Class552) this).anInt7141
						  * -558976661))
					      + ((i_619_ - i_610_)
						 * (((Class552) this).anInt7124
						    * -1302211377))),
					     i_621_,
					     ((-1302211377
					       * ((Class552) this).anInt7124
					       * (i_620_ - i_611_))
					      + (-558976661
						 * ((Class552) this).anInt7141
						 * (1 - i_613_))),
					     bool, 2076761052);
				    for (Class541 class541
					     = class548.aClass541_7053;
					 class541 != null;
					 class541 = class541.aClass541_7005) {
					Class475_Sub1_Sub1 class475_sub1_sub1
					    = (class541
					       .aClass475_Sub1_Sub1_7004);
					if (null != class475_sub1_sub1
					    && class475_sub1_sub1
						   .method14450(227378710)
					    && ((class475_sub1_sub1.aShort10717
						 == i_619_)
						|| i_614_ == i_619_)
					    && (i_620_ == (class475_sub1_sub1
							   .aShort10718)
						|| i_620_ == i_616_)) {
					    int i_623_
						= 1 + ((class475_sub1_sub1
							.aShort10716)
						       - (class475_sub1_sub1
							  .aShort10717));
					    int i_624_
						= 1 + ((class475_sub1_sub1
							.aShort10719)
						       - (class475_sub1_sub1
							  .aShort10718));
					    class475_sub1.method14453
						((((Class552) this)
						  .aClass103_7127),
						 class475_sub1_sub1,
						 (((i_623_ - i_612_)
						   * ((((Class552) this)
						       .anInt7141)
						      * -558976661))
						  + (((class475_sub1_sub1
						       .aShort10717)
						      - i_610_)
						     * (-1302211377
							* (((Class552) this)
							   .anInt7124)))),
						 i_621_,
						 ((((Class552) this).anInt7124
						   * -1302211377
						   * ((class475_sub1_sub1
						       .aShort10718)
						      - i_611_))
						  + ((((Class552) this)
						      .anInt7141)
						     * -558976661
						     * (i_624_ - i_613_))),
						 bool, 2092383940);
					}
				    }
				}
			    }
			}
		    }
		}
		i_614_--;
		bool = false;
	    }
	}
    }
    
    public boolean method12225(Class475_Sub1_Sub1 class475_sub1_sub1,
			       boolean bool, int i) {
	boolean bool_625_ = aClass166Array7184 == aClass166Array7140;
	int i_626_ = 0;
	short i_627_ = 0;
	byte i_628_ = 0;
	class475_sub1_sub1.method16999(1877099305);
	short i_629_ = 0;
	int i_630_ = Math.min(anInt7138 * 120442351 - 1,
			      Math.max(0, class475_sub1_sub1.aShort10717));
	int i_631_ = Math.min(120442351 * anInt7138 - 1,
			      Math.max(0, class475_sub1_sub1.aShort10716));
	int i_632_ = Math.min(-2069974325 * anInt7142 - 1,
			      Math.max(0, class475_sub1_sub1.aShort10718));
	int i_633_ = Math.min(anInt7142 * -2069974325 - 1,
			      Math.max(0, class475_sub1_sub1.aShort10719));
	for (int i_634_ = i_630_; i_634_ <= i_631_; i_634_++) {
	    for (int i_635_ = i_632_; i_635_ <= i_633_; i_635_++) {
		Class548 class548 = method12245(class475_sub1_sub1.nodePlane,
						i_634_, i_635_, 2034052495);
		if (class548 != null) {
		    Class541 class541
			= RSAKeys.method858(class475_sub1_sub1, (byte) -20);
		    Class541 class541_636_ = class548.aClass541_7053;
		    if (null == class541_636_)
			class548.aClass541_7053 = class541;
		    else {
			for (/**/; class541_636_.aClass541_7005 != null;
			     class541_636_ = class541_636_.aClass541_7005) {
			    /* empty */
			}
			class541_636_.aClass541_7005 = class541;
		    }
		    if (bool_625_
			&& 0 != ((((Class552) this).anIntArrayArray7166[i_634_]
				  [i_635_])
				 & ~0xffffff)) {
			i_626_ = (((Class552) this).anIntArrayArray7166[i_634_]
				  [i_635_]);
			i_627_ = (((Class552) this).aShortArrayArray7133
				  [i_634_][i_635_]);
			i_628_ = (((Class552) this).aByteArrayArray7143[i_634_]
				  [i_635_]);
		    }
		    if (!bool && null != class548.aClass475_Sub1_Sub4_7058
			&& (class548.aClass475_Sub1_Sub4_7058.aShort10742
			    > i_629_))
			i_629_ = class548.aClass475_Sub1_Sub4_7058.aShort10742;
		}
	    }
	}
	if (bool_625_ && (i_626_ & ~0xffffff) != 0) {
	    for (int i_637_ = i_630_; i_637_ <= i_631_; i_637_++) {
		for (int i_638_ = i_632_; i_638_ <= i_633_; i_638_++) {
		    if ((((Class552) this).anIntArrayArray7166[i_637_][i_638_]
			 & ~0xffffff)
			== 0) {
			((Class552) this).anIntArrayArray7166[i_637_][i_638_]
			    = i_626_;
			((Class552) this).aShortArrayArray7133[i_637_][i_638_]
			    = i_627_;
			((Class552) this).aByteArrayArray7143[i_637_][i_638_]
			    = i_628_;
		    }
		}
	    }
	}
	if (bool) {
	    ((Class552) this).aClass475_Sub1_Sub1Array7158
		[(((Class552) this).anInt7147 += 1852937581) * -1933263771 - 1]
		= class475_sub1_sub1;
	    class475_sub1_sub1.aClass552_8744 = this;
	} else {
	    int i_639_ = aClass166Array7140 == aClass166Array7184 ? 1 : 0;
	    if (class475_sub1_sub1.method14469((byte) -50)) {
		if (class475_sub1_sub1.method14452((byte) -1)) {
		    ((Class475_Sub1_Sub1) class475_sub1_sub1)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7168[i_639_];
		    ((Class552) this).aClass475_Sub1Array7168[i_639_]
			= class475_sub1_sub1;
		} else {
		    ((Class475_Sub1_Sub1) class475_sub1_sub1)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7151[i_639_];
		    ((Class552) this).aClass475_Sub1Array7151[i_639_]
			= class475_sub1_sub1;
		}
	    } else {
		((Class475_Sub1_Sub1) class475_sub1_sub1).aClass475_Sub1_8743
		    = ((Class552) this).aClass475_Sub1Array7176[i_639_];
		((Class552) this).aClass475_Sub1Array7176[i_639_]
		    = class475_sub1_sub1;
	    }
	}
	if (bool) {
	    Class287 class287
		= Class287.method5562(class475_sub1_sub1.method10874()
				      .aClass287_4386);
	    class287.aFloat4474 -= (float) i_629_;
	    class475_sub1_sub1.method10898(class287);
	    class287.method5564();
	}
	return true;
    }
    
    public Class475_Sub1_Sub2 method12226(int i, int i_640_, int i_641_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_640_][i_641_];
	if (class548 == null)
	    return null;
	Class475_Sub1_Sub2 class475_sub1_sub2
	    = ((Class548) class548).aClass475_Sub1_Sub2_7060;
	((Class548) class548).aClass475_Sub1_Sub2_7060 = null;
	method12131(class475_sub1_sub2, (byte) 114);
	return class475_sub1_sub2;
    }
    
    public Class475_Sub1_Sub5 method12227(int i, int i_642_, int i_643_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_642_][i_643_];
	if (null != class548) {
	    method12131(class548.aClass475_Sub1_Sub5_7061, (byte) -63);
	    if (class548.aClass475_Sub1_Sub5_7061 != null) {
		Class475_Sub1_Sub5 class475_sub1_sub5
		    = class548.aClass475_Sub1_Sub5_7061;
		class548.aClass475_Sub1_Sub5_7061 = null;
		return class475_sub1_sub5;
	    }
	}
	return null;
    }
    
    void method12228(boolean bool, byte[][][] is, int i, byte i_644_,
		     int i_645_) {
	int i_646_ = bool ? 1 : 0;
	((Class552) this).anInt7154 = 0;
	((Class552) this).anInt7155 = 0;
	((Class552) this).anInt7164 += -1784631545;
	if (0 == (i_645_ & 0x2)) {
	    for (Class475_Sub1 class475_sub1
		     = ((Class552) this).aClass475_Sub1Array7151[i_646_];
		 class475_sub1 != null;
		 class475_sub1
		     = ((Class475_Sub1) class475_sub1).aClass475_Sub1_8743) {
		method12213(class475_sub1, -500344864);
		if ((1364632497 * ((Class475_Sub1) class475_sub1).anInt8747
		     != -1)
		    && !method12147(class475_sub1, bool, is, i, i_644_))
		    ((Class552) this).aClass475_Sub1Array7157
			[((((Class552) this).anInt7154 += -1237267015)
			  * -1357567863) - 1]
			= class475_sub1;
	    }
	}
	if (0 == (i_645_ & 0x1)) {
	    for (Class475_Sub1 class475_sub1
		     = ((Class552) this).aClass475_Sub1Array7168[i_646_];
		 null != class475_sub1;
		 class475_sub1
		     = ((Class475_Sub1) class475_sub1).aClass475_Sub1_8743) {
		method12213(class475_sub1, -1362443513);
		if ((1364632497 * ((Class475_Sub1) class475_sub1).anInt8747
		     != -1)
		    && !method12147(class475_sub1, bool, is, i, i_644_))
		    ((Class552) this).aClass475_Sub1Array7156
			[((((Class552) this).anInt7155 += -542324275)
			  * -679130363) - 1]
			= class475_sub1;
	    }
	    for (Class475_Sub1 class475_sub1
		     = ((Class552) this).aClass475_Sub1Array7176[i_646_];
		 class475_sub1 != null;
		 class475_sub1
		     = ((Class475_Sub1) class475_sub1).aClass475_Sub1_8743) {
		method12213(class475_sub1, -778594898);
		if ((-1
		     != 1364632497 * ((Class475_Sub1) class475_sub1).anInt8747)
		    && !method12147(class475_sub1, bool, is, i, i_644_)) {
		    if (class475_sub1.method14452((byte) 5))
			((Class552) this).aClass475_Sub1Array7156
			    [((((Class552) this).anInt7155 += -542324275)
			      * -679130363) - 1]
			    = class475_sub1;
		    else
			((Class552) this).aClass475_Sub1Array7157
			    [((((Class552) this).anInt7154 += -1237267015)
			      * -1357567863) - 1]
			    = class475_sub1;
		}
	    }
	    if (!bool) {
		for (int i_647_ = 0;
		     i_647_ < ((Class552) this).anInt7147 * -1933263771;
		     i_647_++) {
		    method12213((((Class552) this).aClass475_Sub1_Sub1Array7158
				 [i_647_]),
				-426631258);
		    if ((((Class475_Sub1_Sub1) (((Class552) this)
						.aClass475_Sub1_Sub1Array7158
						[i_647_])).anInt8747
			 * 1364632497) != -1
			&& !method12147((((Class552) this)
					 .aClass475_Sub1_Sub1Array7158
					 [i_647_]),
					bool, is, i, i_644_)) {
			if (((Class552) this).aClass475_Sub1_Sub1Array7158
				[i_647_].method14452((byte) -93))
			    ((Class552) this).aClass475_Sub1Array7156
				[((((Class552) this).anInt7155 += -542324275)
				  * -679130363) - 1]
				= (((Class552) this)
				   .aClass475_Sub1_Sub1Array7158[i_647_]);
			else
			    ((Class552) this).aClass475_Sub1Array7157
				[((((Class552) this).anInt7154 += -1237267015)
				  * -1357567863) - 1]
				= (((Class552) this)
				   .aClass475_Sub1_Sub1Array7158[i_647_]);
		    }
		}
	    }
	}
	if (-1357567863 * ((Class552) this).anInt7154 > 0) {
	    method12146(((Class552) this).aClass475_Sub1Array7157, 0,
			((Class552) this).anInt7154 * -1357567863 - 1);
	    for (int i_648_ = 0;
		 i_648_ < ((Class552) this).anInt7154 * -1357567863; i_648_++)
		method12148(((Class552) this).aClass475_Sub1Array7157[i_648_],
			    ((Class552) this).aClass241_Sub43Array7173);
	}
	if (((Class552) this).aBool7136)
	    ((Class552) this).aClass103_7127.method2317(0, null);
	if (0 == (i_645_ & 0x2)) {
	    for (int i_649_ = 0; i_649_ < 532429613 * anInt7132; i_649_++) {
		if (i_649_ >= i && is != null) {
		    int i_650_ = ((Class552) this).aBoolArrayArray7134.length;
		    if ((((Class552) this).aBoolArrayArray7134.length
			 + ((Class552) this).anInt7125 * -728696637)
			> 120442351 * anInt7138)
			i_650_
			    -= (((Class552) this).anInt7125 * -728696637
				+ ((Class552) this).aBoolArrayArray7134.length
				- anInt7138 * 120442351);
		    int i_651_
			= ((Class552) this).aBoolArrayArray7134[0].length;
		    if ((-1866739569 * ((Class552) this).anInt7170
			 + ((Class552) this).aBoolArrayArray7134[0].length)
			> anInt7142 * -2069974325)
			i_651_
			    -= (((Class552) this).aBoolArrayArray7134[0].length
				+ -1866739569 * ((Class552) this).anInt7170
				- -2069974325 * anInt7142);
		    boolean[][] bools = ((Class552) this).aBoolArrayArray7181;
		    if (((Class552) this).aBool7130) {
			for (int i_652_
				 = -181472661 * ((Class552) this).anInt7122;
			     i_652_ < i_650_; i_652_++) {
			    int i_653_
				= (i_652_
				   + -728696637 * ((Class552) this).anInt7125
				   - -181472661 * ((Class552) this).anInt7122);
			    for (int i_654_ = (((Class552) this).anInt7167
					       * -580117089);
				 i_654_ < i_651_; i_654_++) {
				bools[i_652_][i_654_] = false;
				if (((Class552) this).aBoolArrayArray7134
				    [i_652_][i_654_]) {
				    int i_655_
					= ((((Class552) this).anInt7170
					    * -1866739569)
					   + i_654_
					   - (-580117089
					      * ((Class552) this).anInt7167));
				    for (int i_656_ = i_649_; i_656_ >= 0;
					 i_656_--) {
					if ((null
					     != (aClass548ArrayArrayArray7169
						 [i_656_][i_653_][i_655_]))
					    && (aClass548ArrayArrayArray7169
						[i_656_][i_653_][i_655_]
						.aByte7054) == i_649_) {
					    if ((i_656_ >= i
						 && (is[i_656_][i_653_][i_655_]
						     == i_644_))
						|| (aClass550_7131.method12043
						    (i_649_, i_653_, i_655_)))
						bools[i_652_][i_654_] = false;
					    else
						bools[i_652_][i_654_] = true;
					    break;
					}
				    }
				}
			    }
			}
		    }
		    aClass166Array7184[i_649_].method3547
			(-985319149 * ((Class552) this).anInt7128,
			 -1234452287 * ((Class552) this).anInt7160,
			 1222806433 * ((Class552) this).anInt7165,
			 ((Class552) this).aBoolArrayArray7181, false, i_645_);
		} else {
		    int i_657_ = ((Class552) this).aBoolArrayArray7134.length;
		    if ((-728696637 * ((Class552) this).anInt7125
			 + ((Class552) this).aBoolArrayArray7134.length)
			> 120442351 * anInt7138)
			i_657_
			    -= (((Class552) this).anInt7125 * -728696637
				+ ((Class552) this).aBoolArrayArray7134.length
				- anInt7138 * 120442351);
		    int i_658_
			= ((Class552) this).aBoolArrayArray7134[0].length;
		    if ((((Class552) this).aBoolArrayArray7134[0].length
			 + ((Class552) this).anInt7170 * -1866739569)
			> anInt7142 * -2069974325)
			i_658_ -= (((Class552) this).anInt7170 * -1866739569
				   + (((Class552) this).aBoolArrayArray7134
				      [0]).length
				   - -2069974325 * anInt7142);
		    boolean[][] bools = ((Class552) this).aBoolArrayArray7181;
		    if (((Class552) this).aBool7130) {
			for (int i_659_
				 = -181472661 * ((Class552) this).anInt7122;
			     i_659_ < i_657_; i_659_++) {
			    int i_660_
				= (-728696637 * ((Class552) this).anInt7125
				   + i_659_
				   - ((Class552) this).anInt7122 * -181472661);
			    for (int i_661_ = (((Class552) this).anInt7167
					       * -580117089);
				 i_661_ < i_658_; i_661_++) {
				if ((((Class552) this).aBoolArrayArray7134
				     [i_659_][i_661_])
				    && !(aClass550_7131.method12043
					 (i_649_, i_660_,
					  (i_661_
					   + (((Class552) this).anInt7170
					      * -1866739569)
					   - (((Class552) this).anInt7167
					      * -580117089)))))
				    bools[i_659_][i_661_] = true;
				else
				    bools[i_659_][i_661_] = false;
			    }
			}
		    }
		    aClass166Array7184[i_649_].method3547
			(-985319149 * ((Class552) this).anInt7128,
			 -1234452287 * ((Class552) this).anInt7160,
			 1222806433 * ((Class552) this).anInt7165,
			 ((Class552) this).aBoolArrayArray7181, true, i_645_);
		}
	    }
	}
	if (-679130363 * ((Class552) this).anInt7155 > 0) {
	    method12238(((Class552) this).aClass475_Sub1Array7156, 0,
			((Class552) this).anInt7155 * -679130363 - 1);
	    for (int i_662_ = 0;
		 i_662_ < ((Class552) this).anInt7155 * -679130363; i_662_++)
		method12148(((Class552) this).aClass475_Sub1Array7156[i_662_],
			    ((Class552) this).aClass241_Sub43Array7173);
	}
    }
    
    public void method12229(int i, int i_663_, int i_664_,
			    Class475_Sub1_Sub3 class475_sub1_sub3,
			    Class475_Sub1_Sub3 class475_sub1_sub3_665_) {
	Class548 class548 = method12105(i, i_663_, i_664_, (short) 26519);
	if (class548 != null) {
	    class548.aClass475_Sub1_Sub3_7055 = class475_sub1_sub3;
	    class548.aClass475_Sub1_Sub3_7056 = class475_sub1_sub3_665_;
	    int i_666_ = aClass166Array7184 == aClass166Array7140 ? 1 : 0;
	    if (class475_sub1_sub3.method14469((byte) -45)) {
		if (class475_sub1_sub3.method14452((byte) -27)) {
		    ((Class475_Sub1_Sub3) class475_sub1_sub3)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7168[i_666_];
		    ((Class552) this).aClass475_Sub1Array7168[i_666_]
			= class475_sub1_sub3;
		} else {
		    ((Class475_Sub1_Sub3) class475_sub1_sub3)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7151[i_666_];
		    ((Class552) this).aClass475_Sub1Array7151[i_666_]
			= class475_sub1_sub3;
		}
	    } else {
		((Class475_Sub1_Sub3) class475_sub1_sub3).aClass475_Sub1_8743
		    = ((Class552) this).aClass475_Sub1Array7176[i_666_];
		((Class552) this).aClass475_Sub1Array7176[i_666_]
		    = class475_sub1_sub3;
	    }
	    if (class475_sub1_sub3_665_ != null) {
		if (class475_sub1_sub3_665_.method14469((byte) -125)) {
		    if (class475_sub1_sub3_665_.method14452((byte) 67)) {
			((Class475_Sub1_Sub3) class475_sub1_sub3_665_)
			    .aClass475_Sub1_8743
			    = (((Class552) this).aClass475_Sub1Array7168
			       [i_666_]);
			((Class552) this).aClass475_Sub1Array7168[i_666_]
			    = class475_sub1_sub3_665_;
		    } else {
			((Class475_Sub1_Sub3) class475_sub1_sub3_665_)
			    .aClass475_Sub1_8743
			    = (((Class552) this).aClass475_Sub1Array7151
			       [i_666_]);
			((Class552) this).aClass475_Sub1Array7151[i_666_]
			    = class475_sub1_sub3_665_;
		    }
		} else {
		    ((Class475_Sub1_Sub3) class475_sub1_sub3_665_)
			.aClass475_Sub1_8743
			= ((Class552) this).aClass475_Sub1Array7176[i_666_];
		    ((Class552) this).aClass475_Sub1Array7176[i_666_]
			= class475_sub1_sub3_665_;
		}
	    }
	}
    }
    
    void method12230(boolean bool, byte[][][] is, int i, byte i_667_,
		     int i_668_) {
	int i_669_ = bool ? 1 : 0;
	((Class552) this).anInt7154 = 0;
	((Class552) this).anInt7155 = 0;
	((Class552) this).anInt7164 += -1784631545;
	if (0 == (i_668_ & 0x2)) {
	    for (Class475_Sub1 class475_sub1
		     = ((Class552) this).aClass475_Sub1Array7151[i_669_];
		 class475_sub1 != null;
		 class475_sub1
		     = ((Class475_Sub1) class475_sub1).aClass475_Sub1_8743) {
		method12213(class475_sub1, -407103028);
		if ((1364632497 * ((Class475_Sub1) class475_sub1).anInt8747
		     != -1)
		    && !method12147(class475_sub1, bool, is, i, i_667_))
		    ((Class552) this).aClass475_Sub1Array7157
			[((((Class552) this).anInt7154 += -1237267015)
			  * -1357567863) - 1]
			= class475_sub1;
	    }
	}
	if (0 == (i_668_ & 0x1)) {
	    for (Class475_Sub1 class475_sub1
		     = ((Class552) this).aClass475_Sub1Array7168[i_669_];
		 null != class475_sub1;
		 class475_sub1
		     = ((Class475_Sub1) class475_sub1).aClass475_Sub1_8743) {
		method12213(class475_sub1, 1102049200);
		if ((1364632497 * ((Class475_Sub1) class475_sub1).anInt8747
		     != -1)
		    && !method12147(class475_sub1, bool, is, i, i_667_))
		    ((Class552) this).aClass475_Sub1Array7156
			[((((Class552) this).anInt7155 += -542324275)
			  * -679130363) - 1]
			= class475_sub1;
	    }
	    for (Class475_Sub1 class475_sub1
		     = ((Class552) this).aClass475_Sub1Array7176[i_669_];
		 class475_sub1 != null;
		 class475_sub1
		     = ((Class475_Sub1) class475_sub1).aClass475_Sub1_8743) {
		method12213(class475_sub1, -1240762037);
		if ((-1
		     != 1364632497 * ((Class475_Sub1) class475_sub1).anInt8747)
		    && !method12147(class475_sub1, bool, is, i, i_667_)) {
		    if (class475_sub1.method14452((byte) 63))
			((Class552) this).aClass475_Sub1Array7156
			    [((((Class552) this).anInt7155 += -542324275)
			      * -679130363) - 1]
			    = class475_sub1;
		    else
			((Class552) this).aClass475_Sub1Array7157
			    [((((Class552) this).anInt7154 += -1237267015)
			      * -1357567863) - 1]
			    = class475_sub1;
		}
	    }
	    if (!bool) {
		for (int i_670_ = 0;
		     i_670_ < ((Class552) this).anInt7147 * -1933263771;
		     i_670_++) {
		    method12213((((Class552) this).aClass475_Sub1_Sub1Array7158
				 [i_670_]),
				-1298467336);
		    if ((((Class475_Sub1_Sub1) (((Class552) this)
						.aClass475_Sub1_Sub1Array7158
						[i_670_])).anInt8747
			 * 1364632497) != -1
			&& !method12147((((Class552) this)
					 .aClass475_Sub1_Sub1Array7158
					 [i_670_]),
					bool, is, i, i_667_)) {
			if (((Class552) this).aClass475_Sub1_Sub1Array7158
				[i_670_].method14452((byte) 52))
			    ((Class552) this).aClass475_Sub1Array7156
				[((((Class552) this).anInt7155 += -542324275)
				  * -679130363) - 1]
				= (((Class552) this)
				   .aClass475_Sub1_Sub1Array7158[i_670_]);
			else
			    ((Class552) this).aClass475_Sub1Array7157
				[((((Class552) this).anInt7154 += -1237267015)
				  * -1357567863) - 1]
				= (((Class552) this)
				   .aClass475_Sub1_Sub1Array7158[i_670_]);
		    }
		}
	    }
	}
	if (-1357567863 * ((Class552) this).anInt7154 > 0) {
	    method12146(((Class552) this).aClass475_Sub1Array7157, 0,
			((Class552) this).anInt7154 * -1357567863 - 1);
	    for (int i_671_ = 0;
		 i_671_ < ((Class552) this).anInt7154 * -1357567863; i_671_++)
		method12148(((Class552) this).aClass475_Sub1Array7157[i_671_],
			    ((Class552) this).aClass241_Sub43Array7173);
	}
	if (((Class552) this).aBool7136)
	    ((Class552) this).aClass103_7127.method2317(0, null);
	if (0 == (i_668_ & 0x2)) {
	    for (int i_672_ = 0; i_672_ < 532429613 * anInt7132; i_672_++) {
		if (i_672_ >= i && is != null) {
		    int i_673_ = ((Class552) this).aBoolArrayArray7134.length;
		    if ((((Class552) this).aBoolArrayArray7134.length
			 + ((Class552) this).anInt7125 * -728696637)
			> 120442351 * anInt7138)
			i_673_
			    -= (((Class552) this).anInt7125 * -728696637
				+ ((Class552) this).aBoolArrayArray7134.length
				- anInt7138 * 120442351);
		    int i_674_
			= ((Class552) this).aBoolArrayArray7134[0].length;
		    if ((-1866739569 * ((Class552) this).anInt7170
			 + ((Class552) this).aBoolArrayArray7134[0].length)
			> anInt7142 * -2069974325)
			i_674_
			    -= (((Class552) this).aBoolArrayArray7134[0].length
				+ -1866739569 * ((Class552) this).anInt7170
				- -2069974325 * anInt7142);
		    boolean[][] bools = ((Class552) this).aBoolArrayArray7181;
		    if (((Class552) this).aBool7130) {
			for (int i_675_
				 = -181472661 * ((Class552) this).anInt7122;
			     i_675_ < i_673_; i_675_++) {
			    int i_676_
				= (i_675_
				   + -728696637 * ((Class552) this).anInt7125
				   - -181472661 * ((Class552) this).anInt7122);
			    for (int i_677_ = (((Class552) this).anInt7167
					       * -580117089);
				 i_677_ < i_674_; i_677_++) {
				bools[i_675_][i_677_] = false;
				if (((Class552) this).aBoolArrayArray7134
				    [i_675_][i_677_]) {
				    int i_678_
					= ((((Class552) this).anInt7170
					    * -1866739569)
					   + i_677_
					   - (-580117089
					      * ((Class552) this).anInt7167));
				    for (int i_679_ = i_672_; i_679_ >= 0;
					 i_679_--) {
					if ((null
					     != (aClass548ArrayArrayArray7169
						 [i_679_][i_676_][i_678_]))
					    && (aClass548ArrayArrayArray7169
						[i_679_][i_676_][i_678_]
						.aByte7054) == i_672_) {
					    if ((i_679_ >= i
						 && (is[i_679_][i_676_][i_678_]
						     == i_667_))
						|| (aClass550_7131.method12043
						    (i_672_, i_676_, i_678_)))
						bools[i_675_][i_677_] = false;
					    else
						bools[i_675_][i_677_] = true;
					    break;
					}
				    }
				}
			    }
			}
		    }
		    aClass166Array7184[i_672_].method3547
			(-985319149 * ((Class552) this).anInt7128,
			 -1234452287 * ((Class552) this).anInt7160,
			 1222806433 * ((Class552) this).anInt7165,
			 ((Class552) this).aBoolArrayArray7181, false, i_668_);
		} else {
		    int i_680_ = ((Class552) this).aBoolArrayArray7134.length;
		    if ((-728696637 * ((Class552) this).anInt7125
			 + ((Class552) this).aBoolArrayArray7134.length)
			> 120442351 * anInt7138)
			i_680_
			    -= (((Class552) this).anInt7125 * -728696637
				+ ((Class552) this).aBoolArrayArray7134.length
				- anInt7138 * 120442351);
		    int i_681_
			= ((Class552) this).aBoolArrayArray7134[0].length;
		    if ((((Class552) this).aBoolArrayArray7134[0].length
			 + ((Class552) this).anInt7170 * -1866739569)
			> anInt7142 * -2069974325)
			i_681_ -= (((Class552) this).anInt7170 * -1866739569
				   + (((Class552) this).aBoolArrayArray7134
				      [0]).length
				   - -2069974325 * anInt7142);
		    boolean[][] bools = ((Class552) this).aBoolArrayArray7181;
		    if (((Class552) this).aBool7130) {
			for (int i_682_
				 = -181472661 * ((Class552) this).anInt7122;
			     i_682_ < i_680_; i_682_++) {
			    int i_683_
				= (-728696637 * ((Class552) this).anInt7125
				   + i_682_
				   - ((Class552) this).anInt7122 * -181472661);
			    for (int i_684_ = (((Class552) this).anInt7167
					       * -580117089);
				 i_684_ < i_681_; i_684_++) {
				if ((((Class552) this).aBoolArrayArray7134
				     [i_682_][i_684_])
				    && !(aClass550_7131.method12043
					 (i_672_, i_683_,
					  (i_684_
					   + (((Class552) this).anInt7170
					      * -1866739569)
					   - (((Class552) this).anInt7167
					      * -580117089)))))
				    bools[i_682_][i_684_] = true;
				else
				    bools[i_682_][i_684_] = false;
			    }
			}
		    }
		    aClass166Array7184[i_672_].method3547
			(-985319149 * ((Class552) this).anInt7128,
			 -1234452287 * ((Class552) this).anInt7160,
			 1222806433 * ((Class552) this).anInt7165,
			 ((Class552) this).aBoolArrayArray7181, true, i_668_);
		}
	    }
	}
	if (-679130363 * ((Class552) this).anInt7155 > 0) {
	    method12238(((Class552) this).aClass475_Sub1Array7156, 0,
			((Class552) this).anInt7155 * -679130363 - 1);
	    for (int i_685_ = 0;
		 i_685_ < ((Class552) this).anInt7155 * -679130363; i_685_++)
		method12148(((Class552) this).aClass475_Sub1Array7156[i_685_],
			    ((Class552) this).aClass241_Sub43Array7173);
	}
    }
    
    void method12231(Class475_Sub1 class475_sub1) {
	Class287 class287 = class475_sub1.method10874().aClass287_4386;
	((Class552) this).aClass103_7127.method2338
	    ((float) (int) class287.aFloat4477,
	     (float) ((int) class287.aFloat4474
		      + (class475_sub1.method14468((byte) 65) >> 1)),
	     (float) (int) class287.aFloat4479,
	     ((Class552) this).aFloatArray7172);
	((Class475_Sub1) class475_sub1).anInt8747
	    = 1414514001 * (int) ((Class552) this).aFloatArray7172[2];
    }
    
    void method12232(Class475_Sub1 class475_sub1) {
	Class287 class287 = class475_sub1.method10874().aClass287_4386;
	((Class552) this).aClass103_7127.method2338
	    ((float) (int) class287.aFloat4477,
	     (float) ((int) class287.aFloat4474
		      + (class475_sub1.method14468((byte) 115) >> 1)),
	     (float) (int) class287.aFloat4479,
	     ((Class552) this).aFloatArray7172);
	((Class475_Sub1) class475_sub1).anInt8747
	    = 1414514001 * (int) ((Class552) this).aFloatArray7172[2];
    }
    
    void method12233(Class475_Sub1[] class475_sub1s, int i, int i_686_) {
	if (i < i_686_) {
	    int i_687_ = (i + i_686_) / 2;
	    int i_688_ = i;
	    Class475_Sub1 class475_sub1 = class475_sub1s[i_687_];
	    class475_sub1s[i_687_] = class475_sub1s[i_686_];
	    class475_sub1s[i_686_] = class475_sub1;
	    int i_689_
		= ((Class475_Sub1) class475_sub1).anInt8747 * 1364632497;
	    for (int i_690_ = i; i_690_ < i_686_; i_690_++) {
		if ((((Class475_Sub1) class475_sub1s[i_690_]).anInt8747
		     * 1364632497)
		    > i_689_ + (i_690_ & 0x1)) {
		    Class475_Sub1 class475_sub1_691_ = class475_sub1s[i_690_];
		    class475_sub1s[i_690_] = class475_sub1s[i_688_];
		    class475_sub1s[i_688_++] = class475_sub1_691_;
		}
	    }
	    class475_sub1s[i_686_] = class475_sub1s[i_688_];
	    class475_sub1s[i_688_] = class475_sub1;
	    method12238(class475_sub1s, i, i_688_ - 1);
	    method12238(class475_sub1s, i_688_ + 1, i_686_);
	}
    }
    
    void method12234(Class475_Sub1[] class475_sub1s, int i, int i_692_) {
	if (i < i_692_) {
	    int i_693_ = (i + i_692_) / 2;
	    int i_694_ = i;
	    Class475_Sub1 class475_sub1 = class475_sub1s[i_693_];
	    class475_sub1s[i_693_] = class475_sub1s[i_692_];
	    class475_sub1s[i_692_] = class475_sub1;
	    int i_695_
		= ((Class475_Sub1) class475_sub1).anInt8747 * 1364632497;
	    for (int i_696_ = i; i_696_ < i_692_; i_696_++) {
		if ((((Class475_Sub1) class475_sub1s[i_696_]).anInt8747
		     * 1364632497)
		    > i_695_ + (i_696_ & 0x1)) {
		    Class475_Sub1 class475_sub1_697_ = class475_sub1s[i_696_];
		    class475_sub1s[i_696_] = class475_sub1s[i_694_];
		    class475_sub1s[i_694_++] = class475_sub1_697_;
		}
	    }
	    class475_sub1s[i_692_] = class475_sub1s[i_694_];
	    class475_sub1s[i_694_] = class475_sub1;
	    method12238(class475_sub1s, i, i_694_ - 1);
	    method12238(class475_sub1s, i_694_ + 1, i_692_);
	}
    }
    
    public Class541 method12235(int i, int i_698_, int i_699_) {
	Class548 class548 = aClass548ArrayArrayArray7169[i][i_698_][i_699_];
	if (null == class548)
	    return null;
	return class548.aClass541_7053;
    }
    
    boolean method12236(Class475_Sub1 class475_sub1, boolean bool,
			byte[][][] is, int i, byte i_700_) {
	if (!((Class552) this).aBool7130)
	    return false;
	if (class475_sub1 instanceof Class475_Sub1_Sub1) {
	    int i_701_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10716;
	    int i_702_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10719;
	    int i_703_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10717;
	    int i_704_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10718;
	    for (int i_705_ = i_703_; i_705_ <= i_701_; i_705_++) {
		for (int i_706_ = i_704_; i_706_ <= i_702_; i_706_++) {
		    if (class475_sub1.aByte8745 < anInt7132 * 532429613
			&& i_705_ >= -728696637 * ((Class552) this).anInt7125
			&& i_705_ < ((Class552) this).anInt7139 * -579244319
			&& i_706_ >= -1866739569 * ((Class552) this).anInt7170
			&& (i_706_
			    < -1599933761 * ((Class552) this).anInt7171)) {
			if ((null != is && class475_sub1.nodePlane >= i
			     && (is[class475_sub1.nodePlane][i_705_][i_706_]
				 == i_700_))
			    || !class475_sub1.method14460(-1797556891)
			    || class475_sub1.method14496((((Class552) this)
							  .aClass103_7127),
							 (byte) 109)) {
			    if (!bool
				&& i_705_ >= (((Class552) this).anInt7128
					      * -985319149) - 16
				&& i_705_ <= 16 + (((Class552) this).anInt7128
						   * -985319149)
				&& i_706_ >= -1234452287 * (((Class552) this)
							    .anInt7160) - 16
				&& i_706_ <= -1234452287 * (((Class552) this)
							    .anInt7160) + 16)
				class475_sub1.method14493((((Class552) this)
							   .aClass103_7127),
							  (byte) 102);
			    return true;
			}
			return false;
		    }
		}
	    }
	    return true;
	}
	Class287 class287 = class475_sub1.method10874().aClass287_4386;
	int i_707_ = (int) class287.aFloat4477 >> 1591782305 * anInt7123;
	int i_708_ = (int) class287.aFloat4479 >> anInt7123 * 1591782305;
	if (class475_sub1.aByte8745 < anInt7132 * 532429613
	    && i_707_ >= -728696637 * ((Class552) this).anInt7125
	    && i_707_ < -579244319 * ((Class552) this).anInt7139
	    && i_708_ >= ((Class552) this).anInt7170 * -1866739569
	    && i_708_ < -1599933761 * ((Class552) this).anInt7171) {
	    if ((null != is && class475_sub1.nodePlane >= i
		 && is[class475_sub1.nodePlane][i_707_][i_708_] == i_700_)
		|| !class475_sub1.method14460(-360720219)
		|| class475_sub1.method14496(((Class552) this).aClass103_7127,
					     (byte) 109)) {
		if (!bool
		    && i_707_ >= -985319149 * ((Class552) this).anInt7128 - 16
		    && i_707_ <= 16 + -985319149 * ((Class552) this).anInt7128
		    && i_708_ >= -1234452287 * ((Class552) this).anInt7160 - 16
		    && (i_708_
			<= 16 + ((Class552) this).anInt7160 * -1234452287))
		    class475_sub1.method14493(((Class552) this).aClass103_7127,
					      (byte) 102);
		return true;
	    }
	    return false;
	}
	return true;
    }
    
    boolean method12237(Class475_Sub1 class475_sub1, boolean bool,
			byte[][][] is, int i, byte i_709_) {
	if (!((Class552) this).aBool7130)
	    return false;
	if (class475_sub1 instanceof Class475_Sub1_Sub1) {
	    int i_710_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10716;
	    int i_711_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10719;
	    int i_712_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10717;
	    int i_713_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10718;
	    for (int i_714_ = i_712_; i_714_ <= i_710_; i_714_++) {
		for (int i_715_ = i_713_; i_715_ <= i_711_; i_715_++) {
		    if (class475_sub1.aByte8745 < anInt7132 * 532429613
			&& i_714_ >= -728696637 * ((Class552) this).anInt7125
			&& i_714_ < ((Class552) this).anInt7139 * -579244319
			&& i_715_ >= -1866739569 * ((Class552) this).anInt7170
			&& (i_715_
			    < -1599933761 * ((Class552) this).anInt7171)) {
			if ((null != is && class475_sub1.nodePlane >= i
			     && (is[class475_sub1.nodePlane][i_714_][i_715_]
				 == i_709_))
			    || !class475_sub1.method14460(-1017248744)
			    || class475_sub1.method14496((((Class552) this)
							  .aClass103_7127),
							 (byte) 109)) {
			    if (!bool
				&& i_714_ >= (((Class552) this).anInt7128
					      * -985319149) - 16
				&& i_714_ <= 16 + (((Class552) this).anInt7128
						   * -985319149)
				&& i_715_ >= -1234452287 * (((Class552) this)
							    .anInt7160) - 16
				&& i_715_ <= -1234452287 * (((Class552) this)
							    .anInt7160) + 16)
				class475_sub1.method14493((((Class552) this)
							   .aClass103_7127),
							  (byte) 102);
			    return true;
			}
			return false;
		    }
		}
	    }
	    return true;
	}
	Class287 class287 = class475_sub1.method10874().aClass287_4386;
	int i_716_ = (int) class287.aFloat4477 >> 1591782305 * anInt7123;
	int i_717_ = (int) class287.aFloat4479 >> anInt7123 * 1591782305;
	if (class475_sub1.aByte8745 < anInt7132 * 532429613
	    && i_716_ >= -728696637 * ((Class552) this).anInt7125
	    && i_716_ < -579244319 * ((Class552) this).anInt7139
	    && i_717_ >= ((Class552) this).anInt7170 * -1866739569
	    && i_717_ < -1599933761 * ((Class552) this).anInt7171) {
	    if ((null != is && class475_sub1.nodePlane >= i
		 && is[class475_sub1.nodePlane][i_716_][i_717_] == i_709_)
		|| !class475_sub1.method14460(362738657)
		|| class475_sub1.method14496(((Class552) this).aClass103_7127,
					     (byte) 109)) {
		if (!bool
		    && i_716_ >= -985319149 * ((Class552) this).anInt7128 - 16
		    && i_716_ <= 16 + -985319149 * ((Class552) this).anInt7128
		    && i_717_ >= -1234452287 * ((Class552) this).anInt7160 - 16
		    && (i_717_
			<= 16 + ((Class552) this).anInt7160 * -1234452287))
		    class475_sub1.method14493(((Class552) this).aClass103_7127,
					      (byte) 102);
		return true;
	    }
	    return false;
	}
	return true;
    }
    
    void method12238(Class475_Sub1[] class475_sub1s, int i, int i_718_) {
	if (i < i_718_) {
	    int i_719_ = (i + i_718_) / 2;
	    int i_720_ = i;
	    Class475_Sub1 class475_sub1 = class475_sub1s[i_719_];
	    class475_sub1s[i_719_] = class475_sub1s[i_718_];
	    class475_sub1s[i_718_] = class475_sub1;
	    int i_721_
		= ((Class475_Sub1) class475_sub1).anInt8747 * 1364632497;
	    for (int i_722_ = i; i_722_ < i_718_; i_722_++) {
		if ((((Class475_Sub1) class475_sub1s[i_722_]).anInt8747
		     * 1364632497)
		    > i_721_ + (i_722_ & 0x1)) {
		    Class475_Sub1 class475_sub1_723_ = class475_sub1s[i_722_];
		    class475_sub1s[i_722_] = class475_sub1s[i_720_];
		    class475_sub1s[i_720_++] = class475_sub1_723_;
		}
	    }
	    class475_sub1s[i_718_] = class475_sub1s[i_720_];
	    class475_sub1s[i_720_] = class475_sub1;
	    method12238(class475_sub1s, i, i_720_ - 1);
	    method12238(class475_sub1s, i_720_ + 1, i_718_);
	}
    }
    
    boolean method12239(Class475_Sub1 class475_sub1, boolean bool,
			byte[][][] is, int i, byte i_724_) {
	if (!((Class552) this).aBool7130)
	    return false;
	if (class475_sub1 instanceof Class475_Sub1_Sub1) {
	    int i_725_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10716;
	    int i_726_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10719;
	    int i_727_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10717;
	    int i_728_ = ((Class475_Sub1_Sub1) class475_sub1).aShort10718;
	    for (int i_729_ = i_727_; i_729_ <= i_725_; i_729_++) {
		for (int i_730_ = i_728_; i_730_ <= i_726_; i_730_++) {
		    if (class475_sub1.aByte8745 < anInt7132 * 532429613
			&& i_729_ >= -728696637 * ((Class552) this).anInt7125
			&& i_729_ < ((Class552) this).anInt7139 * -579244319
			&& i_730_ >= -1866739569 * ((Class552) this).anInt7170
			&& (i_730_
			    < -1599933761 * ((Class552) this).anInt7171)) {
			if ((null != is && class475_sub1.nodePlane >= i
			     && (is[class475_sub1.nodePlane][i_729_][i_730_]
				 == i_724_))
			    || !class475_sub1.method14460(333518358)
			    || class475_sub1.method14496((((Class552) this)
							  .aClass103_7127),
							 (byte) 109)) {
			    if (!bool
				&& i_729_ >= (((Class552) this).anInt7128
					      * -985319149) - 16
				&& i_729_ <= 16 + (((Class552) this).anInt7128
						   * -985319149)
				&& i_730_ >= -1234452287 * (((Class552) this)
							    .anInt7160) - 16
				&& i_730_ <= -1234452287 * (((Class552) this)
							    .anInt7160) + 16)
				class475_sub1.method14493((((Class552) this)
							   .aClass103_7127),
							  (byte) 102);
			    return true;
			}
			return false;
		    }
		}
	    }
	    return true;
	}
	Class287 class287 = class475_sub1.method10874().aClass287_4386;
	int i_731_ = (int) class287.aFloat4477 >> 1591782305 * anInt7123;
	int i_732_ = (int) class287.aFloat4479 >> anInt7123 * 1591782305;
	if (class475_sub1.aByte8745 < anInt7132 * 532429613
	    && i_731_ >= -728696637 * ((Class552) this).anInt7125
	    && i_731_ < -579244319 * ((Class552) this).anInt7139
	    && i_732_ >= ((Class552) this).anInt7170 * -1866739569
	    && i_732_ < -1599933761 * ((Class552) this).anInt7171) {
	    if ((null != is && class475_sub1.nodePlane >= i
		 && is[class475_sub1.nodePlane][i_731_][i_732_] == i_724_)
		|| !class475_sub1.method14460(-1195889116)
		|| class475_sub1.method14496(((Class552) this).aClass103_7127,
					     (byte) 109)) {
		if (!bool
		    && i_731_ >= -985319149 * ((Class552) this).anInt7128 - 16
		    && i_731_ <= 16 + -985319149 * ((Class552) this).anInt7128
		    && i_732_ >= -1234452287 * ((Class552) this).anInt7160 - 16
		    && (i_732_
			<= 16 + ((Class552) this).anInt7160 * -1234452287))
		    class475_sub1.method14493(((Class552) this).aClass103_7127,
					      (byte) 102);
		return true;
	    }
	    return false;
	}
	return true;
    }
    
    public boolean method12240(Class241_Sub39_Sub17 class241_sub39_sub17,
			       int i, int i_733_, int i_734_,
			       boolean[] bools) {
	boolean bool = false;
	if (aClass166Array7184 != aClass166Array7140) {
	    int i_735_ = aClass166Array7179[i].method3574(i_733_, i_734_,
							  -1077430295);
	    int i_736_ = 0;
	    for (/**/; i_736_ <= i; i_736_++) {
		Class166 class166 = aClass166Array7179[i_736_];
		if (class166 != null) {
		    int i_737_ = i_735_ - class166.method3574(i_733_, i_734_,
							      -1154764624);
		    if (null != bools) {
			bools[i_736_]
			    = class166.method3556(class241_sub39_sub17, i_733_,
						  i_737_, i_734_, 0, false);
			if (!bools[i_736_])
			    continue;
		    }
		    class166.method3554(class241_sub39_sub17, i_733_, i_737_,
					i_734_, 0, false);
		    bool = true;
		}
	    }
	}
	return bool;
    }
    
    void method12241(int i, int i_738_) {
	Class241_Sub39_Sub17 class241_sub39_sub17 = null;
	for (int i_739_ = i; i_739_ < i_738_; i_739_++) {
	    Class166 class166 = aClass166Array7179[i_739_];
	    if (null != class166) {
		for (int i_740_ = 0; i_740_ < anInt7142 * -2069974325;
		     i_740_++) {
		    for (int i_741_ = 0; i_741_ < anInt7138 * 120442351;
			 i_741_++) {
			class241_sub39_sub17
			    = class166.method3553(i_741_, i_740_,
						  class241_sub39_sub17);
			if (null != class241_sub39_sub17) {
			    int i_742_ = i_741_ << 1591782305 * anInt7123;
			    int i_743_ = i_740_ << anInt7123 * 1591782305;
			    for (int i_744_ = i_739_ - 1; i_744_ >= 0;
				 i_744_--) {
				Class166 class166_745_
				    = aClass166Array7179[i_744_];
				if (null != class166_745_) {
				    int i_746_
					= (class166.method3551(i_741_, i_740_,
							       -1422530781)
					   - (class166_745_.method3551
					      (i_741_, i_740_, -2055018640)));
				    int i_747_
					= (class166.method3551(1 + i_741_,
							       i_740_,
							       -279213430)
					   - (class166_745_.method3551
					      (1 + i_741_, i_740_,
					       -2018125840)));
				    int i_748_
					= (class166.method3551(i_741_ + 1,
							       i_740_ + 1,
							       -632661227)
					   - (class166_745_.method3551
					      (1 + i_741_, i_740_ + 1,
					       -1805598982)));
				    int i_749_
					= (class166.method3551(i_741_,
							       i_740_ + 1,
							       400787624)
					   - (class166_745_.method3551
					      (i_741_, i_740_ + 1,
					       -1181849245)));
				    class166_745_.method3554
					(class241_sub39_sub17, i_742_,
					 (i_749_
					  + (i_748_ + (i_746_ + i_747_))) / 4,
					 i_743_, 0, false);
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    void method12242(int i, int i_750_) {
	Class241_Sub39_Sub17 class241_sub39_sub17 = null;
	for (int i_751_ = i; i_751_ < i_750_; i_751_++) {
	    Class166 class166 = aClass166Array7179[i_751_];
	    if (null != class166) {
		for (int i_752_ = 0; i_752_ < anInt7142 * -2069974325;
		     i_752_++) {
		    for (int i_753_ = 0; i_753_ < anInt7138 * 120442351;
			 i_753_++) {
			class241_sub39_sub17
			    = class166.method3553(i_753_, i_752_,
						  class241_sub39_sub17);
			if (null != class241_sub39_sub17) {
			    int i_754_ = i_753_ << 1591782305 * anInt7123;
			    int i_755_ = i_752_ << anInt7123 * 1591782305;
			    for (int i_756_ = i_751_ - 1; i_756_ >= 0;
				 i_756_--) {
				Class166 class166_757_
				    = aClass166Array7179[i_756_];
				if (null != class166_757_) {
				    int i_758_
					= (class166.method3551(i_753_, i_752_,
							       -490644943)
					   - (class166_757_.method3551
					      (i_753_, i_752_, -87662304)));
				    int i_759_
					= (class166.method3551(1 + i_753_,
							       i_752_,
							       -2113047990)
					   - (class166_757_.method3551
					      (1 + i_753_, i_752_,
					       838589303)));
				    int i_760_
					= (class166.method3551(i_753_ + 1,
							       i_752_ + 1,
							       -2026658942)
					   - (class166_757_.method3551
					      (1 + i_753_, i_752_ + 1,
					       -1456560244)));
				    int i_761_
					= (class166.method3551(i_753_,
							       i_752_ + 1,
							       -484032345)
					   - (class166_757_.method3551
					      (i_753_, i_752_ + 1,
					       991512334)));
				    class166_757_.method3554
					(class241_sub39_sub17, i_754_,
					 (i_761_
					  + (i_760_ + (i_758_ + i_759_))) / 4,
					 i_755_, 0, false);
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    void method12243(Class475_Sub1 class475_sub1, int i, int i_762_,
		     int i_763_, int i_764_, int i_765_) {
	boolean bool = true;
	int i_766_ = i_762_;
	int i_767_ = i_762_ + i_764_;
	int i_768_ = i_763_ - 1;
	int i_769_ = i_763_ + i_765_;
	for (int i_770_ = i; i_770_ <= i + 1; i_770_++) {
	    if (anInt7132 * 532429613 != i_770_) {
		for (int i_771_ = i_766_; i_771_ <= i_767_; i_771_++) {
		    if (i_771_ >= 0 && i_771_ < 120442351 * anInt7138) {
			for (int i_772_ = i_768_; i_772_ <= i_769_; i_772_++) {
			    if (i_772_ >= 0 && i_772_ < anInt7142 * -2069974325
				&& (!bool || i_771_ >= i_767_
				    || i_772_ >= i_769_
				    || i_772_ < i_763_ && i_762_ != i_771_)) {
				Class548 class548
				    = (aClass548ArrayArrayArray7169[i_770_]
				       [i_771_][i_772_]);
				if (null != class548) {
				    int i_773_
					= (((aClass166Array7184[i_770_]
						 .method3551
					     (i_771_, i_772_, 432544460))
					    + (aClass166Array7184[i_770_]
						   .method3551
					       (i_771_ + 1, i_772_, 504842517))
					    + (aClass166Array7184[i_770_]
						   .method3551
					       (i_771_, i_772_ + 1,
						-1328748489))
					    + (aClass166Array7184[i_770_]
						   .method3551
					       (i_771_ + 1, 1 + i_772_,
						535877022))) / 4
					   - ((aClass166Array7184[i].method3551
					       (i_762_, i_763_, -2023546220))
					      + (aClass166Array7184[i]
						     .method3551
						 (i_762_ + 1, i_763_,
						  -742931959))
					      + (aClass166Array7184[i]
						     .method3551
						 (i_762_, i_763_ + 1,
						  802724181))
					      + (aClass166Array7184[i]
						     .method3551
						 (1 + i_762_, i_763_ + 1,
						  -1507794536))) / 4);
				    Class475_Sub1_Sub3 class475_sub1_sub3
					= class548.aClass475_Sub1_Sub3_7055;
				    Class475_Sub1_Sub3 class475_sub1_sub3_774_
					= class548.aClass475_Sub1_Sub3_7056;
				    if (class475_sub1_sub3 != null
					&& class475_sub1_sub3
					       .method14450(1277156216))
					class475_sub1.method14453
					    (((Class552) this).aClass103_7127,
					     class475_sub1_sub3,
					     (((1 - i_764_)
					       * (-558976661
						  * (((Class552) this)
						     .anInt7141)))
					      + (((Class552) this).anInt7124
						 * -1302211377
						 * (i_771_ - i_762_))),
					     i_773_,
					     (((1 - i_765_)
					       * (-558976661
						  * (((Class552) this)
						     .anInt7141)))
					      + (((Class552) this).anInt7124
						 * -1302211377
						 * (i_772_ - i_763_))),
					     bool, 2052000877);
				    if (null != class475_sub1_sub3_774_
					&& class475_sub1_sub3_774_
					       .method14450(28898746))
					class475_sub1.method14453
					    (((Class552) this).aClass103_7127,
					     class475_sub1_sub3_774_,
					     (((1 - i_764_)
					       * (((Class552) this).anInt7141
						  * -558976661))
					      + ((i_771_ - i_762_)
						 * (((Class552) this).anInt7124
						    * -1302211377))),
					     i_773_,
					     ((-1302211377
					       * ((Class552) this).anInt7124
					       * (i_772_ - i_763_))
					      + (-558976661
						 * ((Class552) this).anInt7141
						 * (1 - i_765_))),
					     bool, 2119053142);
				    for (Class541 class541
					     = class548.aClass541_7053;
					 class541 != null;
					 class541 = class541.aClass541_7005) {
					Class475_Sub1_Sub1 class475_sub1_sub1
					    = (class541
					       .aClass475_Sub1_Sub1_7004);
					if (null != class475_sub1_sub1
					    && class475_sub1_sub1
						   .method14450(690613278)
					    && ((class475_sub1_sub1.aShort10717
						 == i_771_)
						|| i_766_ == i_771_)
					    && (i_772_ == (class475_sub1_sub1
							   .aShort10718)
						|| i_772_ == i_768_)) {
					    int i_775_
						= 1 + ((class475_sub1_sub1
							.aShort10716)
						       - (class475_sub1_sub1
							  .aShort10717));
					    int i_776_
						= 1 + ((class475_sub1_sub1
							.aShort10719)
						       - (class475_sub1_sub1
							  .aShort10718));
					    class475_sub1.method14453
						((((Class552) this)
						  .aClass103_7127),
						 class475_sub1_sub1,
						 (((i_775_ - i_764_)
						   * ((((Class552) this)
						       .anInt7141)
						      * -558976661))
						  + (((class475_sub1_sub1
						       .aShort10717)
						      - i_762_)
						     * (-1302211377
							* (((Class552) this)
							   .anInt7124)))),
						 i_773_,
						 ((((Class552) this).anInt7124
						   * -1302211377
						   * ((class475_sub1_sub1
						       .aShort10718)
						      - i_763_))
						  + ((((Class552) this)
						      .anInt7141)
						     * -558976661
						     * (i_776_ - i_765_))),
						 bool, 2132077584);
					}
				    }
				}
			    }
			}
		    }
		}
		i_766_--;
		bool = false;
	    }
	}
    }
    
    public void method12244(Class544 class544) {
	if (1754722005 * ((Class552) this).anInt7129 < 65074) {
	    Class241_Sub43 class241_sub43 = class544.aClass241_Sub43_7038;
	    ((Class552) this).aClass544Array7178[(((Class552) this).anInt7129
						  * 1754722005)]
		= class544;
	    ((Class552) this).aBoolArray7161[(((Class552) this).anInt7129
					      * 1754722005)]
		= false;
	    ((Class552) this).anInt7129 += 960289405;
	    int i = 116093747 * class544.anInt7041;
	    if (((Class544) class544).aBool7040)
		i = 0;
	    int i_777_ = class544.anInt7041 * 116093747;
	    if (((Class544) class544).aBool7018)
		i_777_ = 532429613 * anInt7132 - 1;
	    for (int i_778_ = i; i_778_ <= i_777_; i_778_++) {
		int i_779_ = 0;
		int i_780_ = ((class241_sub43.method16455(626523592)
			       - class241_sub43.method16468(1143403757)
			       + -558976661 * ((Class552) this).anInt7141)
			      >> anInt7123 * 1591782305);
		if (i_780_ < 0) {
		    i_779_ -= i_780_;
		    i_780_ = 0;
		}
		int i_781_ = ((class241_sub43.method16455(626523592)
			       + class241_sub43.method16468(1143403757)
			       - ((Class552) this).anInt7141 * -558976661)
			      >> 1591782305 * anInt7123);
		if (i_781_ >= -2069974325 * anInt7142)
		    i_781_ = -2069974325 * anInt7142 - 1;
		for (int i_782_ = i_780_; i_782_ <= i_781_; i_782_++) {
		    int i_783_
			= ((Class544) class544).aShortArray7042[i_779_++];
		    int i_784_ = (((class241_sub43.method16453((byte) -78)
				    - class241_sub43.method16468(1143403757)
				    + ((Class552) this).anInt7141 * -558976661)
				   >> 1591782305 * anInt7123)
				  + (i_783_ >>> 8));
		    int i_785_ = i_784_ + (i_783_ & 0xff) - 1;
		    if (i_784_ < 0)
			i_784_ = 0;
		    if (i_785_ >= 120442351 * anInt7138)
			i_785_ = anInt7138 * 120442351 - 1;
		    for (int i_786_ = i_784_; i_786_ <= i_785_; i_786_++) {
			long l = (((Class552) this).aLongArrayArrayArray7177
				  [i_778_][i_786_][i_782_]);
			if ((l & 0xffffL) == 0L)
			    ((Class552) this).aLongArrayArrayArray7177
				[i_778_][i_786_][i_782_]
				= l | (long) (1754722005
					      * ((Class552) this).anInt7129);
			else if ((l & 0xffff0000L) == 0L)
			    ((Class552) this).aLongArrayArrayArray7177
				[i_778_][i_786_][i_782_]
				= l | (long) (((Class552) this).anInt7129
					      * 1754722005) << 16;
			else if ((l & 0xffff00000000L) == 0L)
			    ((Class552) this).aLongArrayArrayArray7177
				[i_778_][i_786_][i_782_]
				= l | ((long) (1754722005
					       * ((Class552) this).anInt7129)
				       << 32);
			else if ((l & ~0xffffffffffffL) == 0L)
			    ((Class552) this).aLongArrayArrayArray7177
				[i_778_][i_786_][i_782_]
				= l | ((long) (1754722005
					       * ((Class552) this).anInt7129)
				       << 48);
		    }
		}
	    }
	}
    }
    
    Class548 method12245(int i, int i_787_, int i_788_, int i_789_) {
	return method12105(i,
			   Math.min(anInt7138 * 120442351 - 1,
				    Math.max(0, i_787_)),
			   Math.min(-2069974325 * anInt7142 - 1,
				    Math.max(0, i_788_)),
			   (short) 11868);
    }
    
    public int method12246(int i, int i_790_, byte i_791_) {
	return (null != ((Class552) this).aByteArrayArray7146
		? ((Class552) this).aByteArrayArray7146[i][i_790_] & 0xff : 0);
    }
    
    public void method12247() {
	for (int i = 0; i < ((Class552) this).anInt7129 * 1754722005; i++) {
	    if (!((Class552) this).aBoolArray7161[i]) {
		Class544 class544 = ((Class552) this).aClass544Array7178[i];
		Class241_Sub43 class241_sub43 = class544.aClass241_Sub43_7038;
		int i_792_ = 116093747 * class544.anInt7041;
		int i_793_ = (class241_sub43.method16468(1143403757)
			      - -558976661 * ((Class552) this).anInt7141);
		int i_794_ = 1 + (2 * i_793_ >> 1591782305 * anInt7123);
		int i_795_ = 0;
		int[] is = new int[i_794_ * i_794_];
		int i_796_ = (class241_sub43.method16453((byte) -110) - i_793_
			      >> anInt7123 * 1591782305);
		int i_797_ = (class241_sub43.method16455(626523592) - i_793_
			      >> anInt7123 * 1591782305);
		int i_798_ = (class241_sub43.method16455(626523592) + i_793_
			      >> anInt7123 * 1591782305);
		if (i_797_ < 0) {
		    i_795_ -= i_797_;
		    i_797_ = 0;
		}
		if (i_798_ >= anInt7142 * -2069974325)
		    i_798_ = -2069974325 * anInt7142 - 1;
		for (int i_799_ = i_797_; i_799_ <= i_798_; i_799_++) {
		    int i_800_ = ((Class544) class544).aShortArray7042[i_795_];
		    int i_801_ = i_800_ >>> 8;
		    int i_802_ = i_801_ + i_795_ * i_794_;
		    int i_803_ = (i_800_ >>> 8) + i_796_;
		    int i_804_ = i_803_ + (i_800_ & 0xff) - 1;
		    if (i_803_ < 0) {
			i_802_ -= i_803_;
			i_803_ = 0;
		    }
		    if (i_804_ >= anInt7138 * 120442351)
			i_804_ = 120442351 * anInt7138 - 1;
		    for (int i_805_ = i_803_; i_805_ <= i_804_; i_805_++) {
			int i_806_ = 1;
			Class475_Sub1_Sub1 class475_sub1_sub1
			    = method12136(i_792_, i_805_, i_799_, null,
					  2026843005);
			if (null != class475_sub1_sub1
			    && (((Class475_Sub1_Sub1) class475_sub1_sub1)
				.aByte10721) != 0) {
			    if (1 == (((Class475_Sub1_Sub1) class475_sub1_sub1)
				      .aByte10721)) {
				boolean bool = i_805_ - 1 >= i_803_;
				boolean bool_807_ = i_805_ + 1 <= i_804_;
				if (!bool && i_799_ + 1 <= i_798_) {
				    int i_808_
					= (((Class544) class544)
					   .aShortArray7042[1 + i_795_]);
				    int i_809_ = (i_808_ >>> 8) + i_796_;
				    int i_810_ = i_809_ + (i_808_ & 0xff);
				    bool = i_805_ > i_809_ && i_805_ < i_810_;
				}
				if (!bool_807_ && i_799_ - 1 >= i_797_) {
				    int i_811_
					= (((Class544) class544)
					   .aShortArray7042[i_795_ - 1]);
				    int i_812_ = i_796_ + (i_811_ >>> 8);
				    int i_813_ = (i_811_ & 0xff) + i_812_;
				    bool_807_
					= i_805_ > i_812_ && i_805_ < i_813_;
				}
				if (bool && !bool_807_)
				    i_806_ = 4;
				else if (bool_807_ && !bool)
				    i_806_ = 2;
			    } else {
				boolean bool = i_805_ - 1 >= i_803_;
				boolean bool_814_ = i_805_ + 1 <= i_804_;
				if (!bool && i_799_ - 1 >= i_797_) {
				    int i_815_
					= (((Class544) class544)
					   .aShortArray7042[i_795_ - 1]);
				    int i_816_ = i_796_ + (i_815_ >>> 8);
				    int i_817_ = i_816_ + (i_815_ & 0xff);
				    bool = i_805_ > i_816_ && i_805_ < i_817_;
				}
				if (!bool_814_ && 1 + i_799_ <= i_798_) {
				    int i_818_
					= (((Class544) class544)
					   .aShortArray7042[1 + i_795_]);
				    int i_819_ = (i_818_ >>> 8) + i_796_;
				    int i_820_ = (i_818_ & 0xff) + i_819_;
				    bool_814_
					= i_805_ > i_819_ && i_805_ < i_820_;
				}
				if (bool && !bool_814_)
				    i_806_ = 3;
				else if (bool_814_ && !bool)
				    i_806_ = 5;
			    }
			}
			is[i_802_++] = i_806_;
		    }
		    i_795_++;
		}
		((Class552) this).aBoolArray7161[i] = true;
		if (aBool7152)
		    aClass166Array7184[i_792_].method3557(class241_sub43, is);
	    }
	}
    }
    
    static final void method12248(ClientScriptData class454, int i) {
	int i_821_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_821_, (byte) -70);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_821_ >> 16];
	Class519.method11674(class58, class35, class454, 1697597869);
    }
    
    static final void method12249(ClientScriptData class454, int i) {
		((ClientScriptData) class454).objectStackPointer -= 993556554;
		String string = (String) (((ClientScriptData) class454).objectStack
				[-290357331 * ((ClientScriptData) class454).objectStackPointer]);
		String string_822_ = (String) (((ClientScriptData) class454).objectStack
				[1 + ((ClientScriptData) class454).objectStackPointer * -290357331]);
		Class508.sendIgnoreNote(string, string_822_, -2022955371);
    }
    
    static void setIfaceComponentText/*method12250*/(int i, String string, int i_823_) {
		Class241_Sub39_Sub13 class241_sub39_sub13 = NPC.method18030(3, (long) i);
		class241_sub39_sub13.method17279((byte) 0);
		((Class241_Sub39_Sub13) class241_sub39_sub13).aString10956 = string;
    }
}
