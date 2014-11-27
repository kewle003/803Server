/* Class166_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class166_Sub3 extends Class166
{
    Class103_Sub2 aClass103_Sub2_9962;
    static final int anInt9963 = -1694498816;
    static final int anInt9964 = 1;
    float aFloat9965;
    static final int anInt9966 = 4;
    Class201[][] aClass201ArrayArray9967;
    int anInt9968;
    Class183[][] aClass183ArrayArray9969;
    Class205[][] aClass205ArrayArray9970;
    static final int anInt9971 = 64;
    static final boolean aBool9972 = true;
    float aFloat9973;
    float aFloat9974;
    Class182[][] aClass182ArrayArray9975;
    float aFloat9976;
    float aFloat9977;
    float aFloat9978;
    Class143[][] aClass143ArrayArray9979;
    float aFloat9980;
    float aFloat9981;
    float aFloat9982;
    float aFloat9983;
    float aFloat9984;
    float aFloat9985;
    float aFloat9986;
    float aFloat9987;
    float aFloat9988;
    float aFloat9989;
    byte[][] aByteArrayArray9990;
    byte[][] aByteArrayArray9991;
    static final int anInt9992 = 2;
    static final boolean aBool9993 = true;
    static final boolean aBool9994 = false;
    
    public boolean method3556(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			      int i_0_, int i_1_, int i_2_, boolean bool) {
	return false;
    }
    
    public void method3543(int i, int i_3_, int i_4_) {
	i = Math.min(((Class166_Sub3) this).aByteArrayArray9991.length - 1,
		     Math.max(0, i));
	i_3_ = Math.min((((Class166_Sub3) this).aByteArrayArray9991[i].length
			 - 1),
			Math.max(0, i_3_));
	if (((Class166_Sub3) this).aByteArrayArray9991[i][i_3_] < i_4_)
	    ((Class166_Sub3) this).aByteArrayArray9991[i][i_3_] = (byte) i_4_;
    }
    
    public void method3568
	(int i, int i_5_, int[] is, int[] is_6_, int[] is_7_, int[] is_8_,
	 int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, int[] is_13_,
	 int[] is_14_, int[] is_15_, Class86 class86, boolean bool) {
	if (((Class166_Sub3) this).aClass182ArrayArray9975 == null) {
	    ((Class166_Sub3) this).aClass182ArrayArray9975
		= new Class182[anInt2055 * 266270313][anInt2052 * -14610189];
	    ((Class166_Sub3) this).aClass205ArrayArray9970
		= new Class205[anInt2055 * 266270313][anInt2052 * -14610189];
	} else if (((Class166_Sub3) this).aClass201ArrayArray9967 != null
		   || ((Class166_Sub3) this).aClass143ArrayArray9979 != null)
	    throw new IllegalStateException();
	boolean bool_16_ = false;
	if (is_12_.length == 2 && is_9_.length == 2
	    && (is_12_[0] == is_12_[1]
		|| is_14_[0] != -1 && is_14_[0] == is_14_[1])) {
	    bool_16_ = true;
	    for (int i_17_ = 1; i_17_ < 2; i_17_++) {
		int i_18_ = is[is_9_[i_17_]];
		int i_19_ = is_7_[is_9_[i_17_]];
		if (i_18_ != 0 && i_18_ != anInt2053 * 2039042417
		    || i_19_ != 0 && i_19_ != anInt2053 * 2039042417) {
		    bool_16_ = false;
		    break;
		}
	    }
	}
	if (!bool_16_) {
	    Class205 class205 = new Class205();
	    short i_20_ = (short) is.length;
	    int i_21_ = (short) is_12_.length;
	    ((Class205) class205).aShort2431 = i_20_;
	    ((Class205) class205).aShortArray2436 = new short[i_20_];
	    ((Class205) class205).aShortArray2433 = new short[i_20_];
	    ((Class205) class205).aShortArray2439 = new short[i_20_];
	    ((Class205) class205).aShortArray2438 = new short[i_20_];
	    for (int i_22_ = 0; i_22_ < i_20_; i_22_++) {
		int i_23_ = is[i_22_];
		int i_24_ = is_7_[i_22_];
		if (i_23_ == 0 && i_24_ == 0)
		    ((Class205) class205).aShortArray2436[i_22_]
			= (short) ((((Class166_Sub3) this).aByteArrayArray9990
				    [i][i_5_])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i][i_5_]));
		else if (i_23_ == 0 && i_24_ == anInt2053 * 2039042417)
		    ((Class205) class205).aShortArray2436[i_22_]
			= (short) ((((Class166_Sub3) this).aByteArrayArray9990
				    [i][i_5_ + 1])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i][i_5_ + 1]));
		else if (i_23_ == anInt2053 * 2039042417
			 && i_24_ == anInt2053 * 2039042417)
		    ((Class205) class205).aShortArray2436[i_22_]
			= (short) ((((Class166_Sub3) this).aByteArrayArray9990
				    [i + 1][i_5_ + 1])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i + 1][i_5_ + 1]));
		else if (i_23_ == anInt2053 * 2039042417 && i_24_ == 0)
		    ((Class205) class205).aShortArray2436[i_22_]
			= (short) ((((Class166_Sub3) this).aByteArrayArray9990
				    [i + 1][i_5_])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i + 1][i_5_]));
		else {
		    int i_25_
			= ((((Class166_Sub3) this).aByteArrayArray9990[i][i_5_]
			    - (((Class166_Sub3) this).aByteArrayArray9991[i]
			       [i_5_])) * (anInt2053 * 2039042417 - i_23_)
			   + ((((Class166_Sub3) this).aByteArrayArray9990
			       [i + 1][i_5_])
			      - (((Class166_Sub3) this).aByteArrayArray9991
				 [i + 1][i_5_])) * i_23_);
		    int i_26_
			= (((((Class166_Sub3) this).aByteArrayArray9990[i]
			     [i_5_ + 1])
			    - (((Class166_Sub3) this).aByteArrayArray9991[i]
			       [i_5_ + 1])) * (anInt2053 * 2039042417 - i_23_)
			   + ((((Class166_Sub3) this).aByteArrayArray9990
			       [i + 1][i_5_ + 1])
			      - (((Class166_Sub3) this).aByteArrayArray9991
				 [i + 1][i_5_ + 1])) * i_23_);
		    ((Class205) class205).aShortArray2436[i_22_]
			= (short) ((i_25_ * (anInt2053 * 2039042417 - i_24_)
				    + i_26_ * i_24_)
				   >> anInt2054 * -244667650);
		}
		int i_27_ = (i << anInt2054 * -122333825) + i_23_;
		int i_28_ = (i_5_ << anInt2054 * -122333825) + i_24_;
		((Class205) class205).aShortArray2433[i_22_] = (short) i_23_;
		((Class205) class205).aShortArray2438[i_22_] = (short) i_24_;
		((Class205) class205).aShortArray2439[i_22_]
		    = (short) (method3574(i_27_, i_28_, -2026075402)
			       + (is_6_ != null ? is_6_[i_22_] : 0));
		if (((Class205) class205).aShortArray2436[i_22_] < 2)
		    ((Class205) class205).aShortArray2436[i_22_] = (short) 2;
	    }
	    boolean bool_29_ = false;
	    int i_30_ = 0;
	    for (int i_31_ = 0; i_31_ < i_21_; i_31_++) {
		if (is_12_[i_31_] >= 0 || is_13_ != null && is_13_[i_31_] >= 0)
		    i_30_++;
		int i_32_ = is_14_[i_31_];
		if (i_32_ != -1) {
		    Class101 class101
			= ((Class166_Sub3) this).aClass103_Sub2_9962
			      .aClass107_1458.method2680(i_32_, -75803813);
		    if (!class101.aBool1434) {
			bool_29_ = true;
			if (method16256(class101.aByte1427)
			    || class101.aByte1376 != 0
			    || class101.aByte1396 != 0)
			    ((Class205) class205).aByte2432 |= 0x4;
		    }
		}
	    }
	    ((Class205) class205).anIntArray2442 = new int[i_30_];
	    if (is_13_ != null)
		((Class205) class205).anIntArray2435 = new int[i_30_];
	    ((Class205) class205).aShortArray2437 = new short[i_30_];
	    ((Class205) class205).aShortArray2430 = new short[i_30_];
	    ((Class205) class205).aShortArray2443 = new short[i_30_];
	    if (bool_29_) {
		((Class205) class205).aShortArray2440 = new short[i_30_];
		((Class205) class205).aShortArray2434 = new short[i_30_];
	    }
	    for (int i_33_ = 0; i_33_ < i_21_; i_33_++) {
		if (is_12_[i_33_] >= 0
		    || is_13_ != null && is_13_[i_33_] >= 0) {
		    if (is_12_[i_33_] >= 0)
			((Class205) class205).anIntArray2442
			    [((Class205) class205).aShort2441]
			    = Class241_Sub42.method16451(is_12_[i_33_],
							 624264131);
		    else
			((Class205) class205).anIntArray2442
			    [((Class205) class205).aShort2441]
			    = -1;
		    if (is_13_ != null) {
			if (is_13_[i_33_] != -1)
			    ((Class205) class205).anIntArray2435
				[((Class205) class205).aShort2441]
				= Class241_Sub42.method16451(is_13_[i_33_],
							     -10091642);
			else
			    ((Class205) class205).anIntArray2435
				[((Class205) class205).aShort2441]
				= -1;
		    }
		    ((Class205) class205).aShortArray2437
			[((Class205) class205).aShort2441]
			= (short) is_9_[i_33_];
		    ((Class205) class205).aShortArray2430
			[((Class205) class205).aShort2441]
			= (short) is_10_[i_33_];
		    ((Class205) class205).aShortArray2443
			[((Class205) class205).aShort2441]
			= (short) is_11_[i_33_];
		    if (bool_29_) {
			if (is_14_[i_33_] != -1
			    && !(((Class166_Sub3) this).aClass103_Sub2_9962
				     .aClass107_1458.method2680
				 (is_14_[i_33_], -1042599320).aBool1434)) {
			    ((Class205) class205).aShortArray2440
				[((Class205) class205).aShort2441]
				= (short) is_14_[i_33_];
			    ((Class205) class205).aShortArray2434
				[((Class205) class205).aShort2441]
				= (short) is_15_[i_33_];
			} else
			    ((Class205) class205).aShortArray2440
				[((Class205) class205).aShort2441]
				= (short) -1;
		    }
		    ((Class205) class205).aShort2441++;
		}
	    }
	    ((Class166_Sub3) this).aClass205ArrayArray9970[i][i_5_] = class205;
	} else if (is_12_[0] >= 0 || is_13_ != null && is_13_[0] >= 0) {
	    Class182 class182 = new Class182();
	    int i_34_ = is_12_[0];
	    int i_35_ = is_14_[0];
	    if (is_13_ != null) {
		((Class182) class182).anInt2151
		    = (Class639.method13606
		       (Class241_Sub42.method16451(is_13_[0], 1658429309),
			(((Class166_Sub3) this).aByteArrayArray9990[i][i_5_]
			 - (((Class166_Sub3) this).aByteArrayArray9991[i]
			    [i_5_])),
			-1685558969));
		if (i_34_ == -1)
		    ((Class182) class182).aByte2150 |= 0x2;
	    }
	    if ((anIntArrayArray2051[i][i_5_]
		 == anIntArrayArray2051[i + 1][i_5_])
		&& (anIntArrayArray2051[i][i_5_]
		    == anIntArrayArray2051[i + 1][i_5_ + 1])
		&& (anIntArrayArray2051[i][i_5_]
		    == anIntArrayArray2051[i][i_5_ + 1]))
		((Class182) class182).aByte2150 |= 0x1;
	    Class101 class101 = null;
	    if (i_35_ != -1)
		class101 = ((Class166_Sub3) this).aClass103_Sub2_9962
			       .aClass107_1458.method2680(i_35_, -1744437863);
	    if (class101 != null
		&& (((Class182) class182).aByte2150 & 0x2) == 0
		&& !class101.aBool1434) {
		((Class182) class182).aShort2146
		    = (short) ((((Class166_Sub3) this).aByteArrayArray9990[i]
				[i_5_])
			       - (((Class166_Sub3) this).aByteArrayArray9991[i]
				  [i_5_]));
		((Class182) class182).aShort2148
		    = (short) ((((Class166_Sub3) this).aByteArrayArray9990
				[i + 1][i_5_])
			       - (((Class166_Sub3) this).aByteArrayArray9991
				  [i + 1][i_5_]));
		((Class182) class182).aShort2147
		    = (short) ((((Class166_Sub3) this).aByteArrayArray9990
				[i + 1][i_5_ + 1])
			       - (((Class166_Sub3) this).aByteArrayArray9991
				  [i + 1][i_5_ + 1]));
		((Class182) class182).aShort2152
		    = (short) ((((Class166_Sub3) this).aByteArrayArray9990[i]
				[i_5_ + 1])
			       - (((Class166_Sub3) this).aByteArrayArray9991[i]
				  [i_5_ + 1]));
		((Class182) class182).aShort2149 = (short) i_35_;
		if (method16256(class101.aByte1427) || class101.aByte1376 != 0
		    || class101.aByte1396 != 0)
		    ((Class182) class182).aByte2150 |= 0x4;
	    } else {
		short i_36_ = Class241_Sub42.method16451(i_34_, -1121790937);
		((Class182) class182).aShort2146
		    = (short) Class639.method13606(i_36_,
						   ((((Class166_Sub3) this)
						     .aByteArrayArray9990[i]
						     [i_5_])
						    - (((Class166_Sub3) this)
						       .aByteArrayArray9991[i]
						       [i_5_])),
						   -905808433);
		((Class182) class182).aShort2148
		    = (short) Class639.method13606(i_36_,
						   ((((Class166_Sub3) this)
						     .aByteArrayArray9990
						     [i + 1][i_5_])
						    - (((Class166_Sub3) this)
						       .aByteArrayArray9991
						       [i + 1][i_5_])),
						   1034519669);
		((Class182) class182).aShort2147
		    = (short) Class639.method13606(i_36_,
						   ((((Class166_Sub3) this)
						     .aByteArrayArray9990
						     [i + 1][i_5_ + 1])
						    - (((Class166_Sub3) this)
						       .aByteArrayArray9991
						       [i + 1][i_5_ + 1])),
						   -1609834342);
		((Class182) class182).aShort2152
		    = (short) Class639.method13606(i_36_,
						   ((((Class166_Sub3) this)
						     .aByteArrayArray9990[i]
						     [i_5_ + 1])
						    - (((Class166_Sub3) this)
						       .aByteArrayArray9991[i]
						       [i_5_ + 1])),
						   1228863477);
		((Class182) class182).aShort2149 = (short) -1;
	    }
	    ((Class166_Sub3) this).aClass182ArrayArray9975[i][i_5_] = class182;
	}
    }
    
    void method16239(int i, int i_37_, boolean bool, Class189 class189,
		     Class155 class155, float[] fs, float[] fs_38_,
		     float[] fs_39_, float[] fs_40_, float[] fs_41_,
		     int i_42_) {
	Class201 class201
	    = ((Class166_Sub3) this).aClass201ArrayArray9967[i][i_37_];
	if (class201 != null) {
	    if ((((Class201) class201).aByte2409 & 0x2) == 0) {
		if (i_42_ != 0) {
		    if ((((Class201) class201).aByte2409 & 0x4) != 0) {
			if ((i_42_ & 0x1) != 0)
			    return;
		    } else if ((i_42_ & 0x2) != 0)
			return;
		}
		int i_43_ = i * (anInt2053 * 2039042417);
		int i_44_ = i_43_ + anInt2053 * 2039042417;
		int i_45_ = i_37_ * (anInt2053 * 2039042417);
		int i_46_ = i_45_ + anInt2053 * 2039042417;
		float f = 0.0F;
		float f_47_ = 0.0F;
		float f_48_ = 0.0F;
		float f_49_ = 0.0F;
		float f_50_;
		float f_51_;
		float f_52_;
		float f_53_;
		float f_54_;
		float f_55_;
		float f_56_;
		float f_57_;
		float f_58_;
		float f_59_;
		float f_60_;
		float f_61_;
		float f_62_;
		float f_63_;
		float f_64_;
		float f_65_;
		if ((((Class201) class201).aByte2409 & 0x1) != 0 && !bool) {
		    int i_66_ = anIntArrayArray2051[i][i_37_];
		    float f_67_
			= ((Class166_Sub3) this).aFloat9980 * (float) i_66_;
		    float f_68_
			= ((Class166_Sub3) this).aFloat9989 * (float) i_66_;
		    float f_69_
			= (((Class166_Sub3) this).aFloat9988
			   + (((Class166_Sub3) this).aFloat9976 * (float) i_43_
			      + f_67_
			      + (((Class166_Sub3) this).aFloat9984
				 * (float) i_45_)));
		    f_50_
			= (((Class166_Sub3) this).aFloat9974
			   + (((Class166_Sub3) this).aFloat9977 * (float) i_43_
			      + f_68_
			      + (((Class166_Sub3) this).aFloat9985
				 * (float) i_45_)));
		    if (f_69_ < -f_50_)
			return;
		    float f_70_
			= (((Class166_Sub3) this).aFloat9988
			   + (((Class166_Sub3) this).aFloat9976 * (float) i_44_
			      + f_67_
			      + (((Class166_Sub3) this).aFloat9984
				 * (float) i_45_)));
		    f_51_
			= (((Class166_Sub3) this).aFloat9974
			   + (((Class166_Sub3) this).aFloat9977 * (float) i_44_
			      + f_68_
			      + (((Class166_Sub3) this).aFloat9985
				 * (float) i_45_)));
		    if (f_70_ < -f_51_)
			return;
		    float f_71_
			= (((Class166_Sub3) this).aFloat9988
			   + (((Class166_Sub3) this).aFloat9976 * (float) i_44_
			      + f_67_
			      + (((Class166_Sub3) this).aFloat9984
				 * (float) i_46_)));
		    f_52_
			= (((Class166_Sub3) this).aFloat9974
			   + (((Class166_Sub3) this).aFloat9977 * (float) i_44_
			      + f_68_
			      + (((Class166_Sub3) this).aFloat9985
				 * (float) i_46_)));
		    if (f_71_ < -f_52_)
			return;
		    float f_72_
			= (((Class166_Sub3) this).aFloat9988
			   + (((Class166_Sub3) this).aFloat9976 * (float) i_43_
			      + f_67_
			      + (((Class166_Sub3) this).aFloat9984
				 * (float) i_46_)));
		    f_53_
			= (((Class166_Sub3) this).aFloat9974
			   + (((Class166_Sub3) this).aFloat9977 * (float) i_43_
			      + f_68_
			      + (((Class166_Sub3) this).aFloat9985
				 * (float) i_46_)));
		    if (f_72_ < -f_53_)
			return;
		    f_54_
			= (((Class155) class155).aFloat1720
			   + ((Class155) class155).aFloat1732 * f_69_ / f_50_);
		    f_55_
			= (((Class155) class155).aFloat1720
			   + ((Class155) class155).aFloat1732 * f_70_ / f_51_);
		    f_56_
			= (((Class155) class155).aFloat1720
			   + ((Class155) class155).aFloat1732 * f_71_ / f_52_);
		    f_57_
			= (((Class155) class155).aFloat1720
			   + ((Class155) class155).aFloat1732 * f_72_ / f_53_);
		    if (((Class189) class189).aBool2209) {
			float f_73_ = f_69_ - ((Class189) class189).aFloat2213;
			if (f_73_ > 0.0F) {
			    f = f_73_ / ((Class189) class189).aFloat2214;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_73_ = f_70_ - ((Class189) class189).aFloat2213;
			if (f_73_ > 0.0F) {
			    f_47_ = f_73_ / ((Class189) class189).aFloat2214;
			    if (f_47_ > 1.0F)
				f_47_ = 1.0F;
			}
			f_73_ = f_71_ - ((Class189) class189).aFloat2213;
			if (f_73_ > 0.0F) {
			    f_48_ = f_73_ / ((Class189) class189).aFloat2214;
			    if (f_48_ > 1.0F)
				f_48_ = 1.0F;
			}
			f_73_ = f_72_ - ((Class189) class189).aFloat2213;
			if (f_73_ > 0.0F) {
			    f_49_ = f_73_ / ((Class189) class189).aFloat2214;
			    if (f_49_ > 1.0F)
				f_49_ = 1.0F;
			}
		    }
		    float f_74_
			= ((Class166_Sub3) this).aFloat9978 * (float) i_66_;
		    float f_75_
			= ((Class166_Sub3) this).aFloat9965 * (float) i_66_;
		    float f_76_
			= (((Class166_Sub3) this).aFloat9986
			   + (((Class166_Sub3) this).aFloat9981 * (float) i_43_
			      + f_74_
			      + (((Class166_Sub3) this).aFloat9982
				 * (float) i_45_)));
		    f_58_
			= (((Class155) class155).aFloat1727
			   + ((Class155) class155).aFloat1728 * f_76_ / f_50_);
		    float f_77_
			= (((Class166_Sub3) this).aFloat9987
			   + (((Class166_Sub3) this).aFloat9973 * (float) i_43_
			      + f_75_
			      + (((Class166_Sub3) this).aFloat9983
				 * (float) i_45_)));
		    f_59_
			= (((Class155) class155).aFloat1731
			   + ((Class155) class155).aFloat1729 * f_77_ / f_50_);
		    float f_78_
			= (((Class166_Sub3) this).aFloat9986
			   + (((Class166_Sub3) this).aFloat9981 * (float) i_44_
			      + f_74_
			      + (((Class166_Sub3) this).aFloat9982
				 * (float) i_45_)));
		    f_60_
			= (((Class155) class155).aFloat1727
			   + ((Class155) class155).aFloat1728 * f_78_ / f_51_);
		    float f_79_
			= (((Class166_Sub3) this).aFloat9987
			   + (((Class166_Sub3) this).aFloat9973 * (float) i_44_
			      + f_75_
			      + (((Class166_Sub3) this).aFloat9983
				 * (float) i_45_)));
		    f_61_
			= (((Class155) class155).aFloat1731
			   + ((Class155) class155).aFloat1729 * f_79_ / f_51_);
		    float f_80_
			= (((Class166_Sub3) this).aFloat9986
			   + (((Class166_Sub3) this).aFloat9981 * (float) i_44_
			      + f_74_
			      + (((Class166_Sub3) this).aFloat9982
				 * (float) i_46_)));
		    f_62_
			= (((Class155) class155).aFloat1727
			   + ((Class155) class155).aFloat1728 * f_80_ / f_52_);
		    float f_81_
			= (((Class166_Sub3) this).aFloat9987
			   + (((Class166_Sub3) this).aFloat9973 * (float) i_44_
			      + f_75_
			      + (((Class166_Sub3) this).aFloat9983
				 * (float) i_46_)));
		    f_63_
			= (((Class155) class155).aFloat1731
			   + ((Class155) class155).aFloat1729 * f_81_ / f_52_);
		    float f_82_
			= (((Class166_Sub3) this).aFloat9986
			   + (((Class166_Sub3) this).aFloat9981 * (float) i_43_
			      + f_74_
			      + (((Class166_Sub3) this).aFloat9982
				 * (float) i_46_)));
		    f_64_
			= (((Class155) class155).aFloat1727
			   + ((Class155) class155).aFloat1728 * f_82_ / f_53_);
		    float f_83_
			= (((Class166_Sub3) this).aFloat9987
			   + (((Class166_Sub3) this).aFloat9973 * (float) i_43_
			      + f_75_
			      + (((Class166_Sub3) this).aFloat9983
				 * (float) i_46_)));
		    f_65_
			= (((Class155) class155).aFloat1731
			   + ((Class155) class155).aFloat1729 * f_83_ / f_53_);
		} else {
		    int i_84_ = anIntArrayArray2051[i][i_37_];
		    int i_85_ = anIntArrayArray2051[i + 1][i_37_];
		    int i_86_ = anIntArrayArray2051[i + 1][i_37_ + 1];
		    int i_87_ = anIntArrayArray2051[i][i_37_ + 1];
		    float f_88_
			= (((Class166_Sub3) this).aFloat9988
			   + (((Class166_Sub3) this).aFloat9976 * (float) i_43_
			      + (((Class166_Sub3) this).aFloat9980
				 * (float) i_84_)
			      + (((Class166_Sub3) this).aFloat9984
				 * (float) i_45_)));
		    f_50_
			= (((Class166_Sub3) this).aFloat9974
			   + (((Class166_Sub3) this).aFloat9977 * (float) i_43_
			      + (((Class166_Sub3) this).aFloat9989
				 * (float) i_84_)
			      + (((Class166_Sub3) this).aFloat9985
				 * (float) i_45_)));
		    if (f_88_ < -f_50_)
			return;
		    float f_89_
			= (((Class166_Sub3) this).aFloat9988
			   + (((Class166_Sub3) this).aFloat9976 * (float) i_44_
			      + (((Class166_Sub3) this).aFloat9980
				 * (float) i_85_)
			      + (((Class166_Sub3) this).aFloat9984
				 * (float) i_45_)));
		    f_51_
			= (((Class166_Sub3) this).aFloat9974
			   + (((Class166_Sub3) this).aFloat9977 * (float) i_44_
			      + (((Class166_Sub3) this).aFloat9989
				 * (float) i_85_)
			      + (((Class166_Sub3) this).aFloat9985
				 * (float) i_45_)));
		    if (f_89_ < -f_51_)
			return;
		    float f_90_
			= (((Class166_Sub3) this).aFloat9988
			   + (((Class166_Sub3) this).aFloat9976 * (float) i_44_
			      + (((Class166_Sub3) this).aFloat9980
				 * (float) i_86_)
			      + (((Class166_Sub3) this).aFloat9984
				 * (float) i_46_)));
		    f_52_
			= (((Class166_Sub3) this).aFloat9974
			   + (((Class166_Sub3) this).aFloat9977 * (float) i_44_
			      + (((Class166_Sub3) this).aFloat9989
				 * (float) i_86_)
			      + (((Class166_Sub3) this).aFloat9985
				 * (float) i_46_)));
		    if (f_90_ < -f_52_)
			return;
		    float f_91_
			= (((Class166_Sub3) this).aFloat9988
			   + (((Class166_Sub3) this).aFloat9976 * (float) i_43_
			      + (((Class166_Sub3) this).aFloat9980
				 * (float) i_87_)
			      + (((Class166_Sub3) this).aFloat9984
				 * (float) i_46_)));
		    f_53_
			= (((Class166_Sub3) this).aFloat9974
			   + (((Class166_Sub3) this).aFloat9977 * (float) i_43_
			      + (((Class166_Sub3) this).aFloat9989
				 * (float) i_87_)
			      + (((Class166_Sub3) this).aFloat9985
				 * (float) i_46_)));
		    if (f_91_ < -f_53_)
			return;
		    f_54_
			= (((Class155) class155).aFloat1720
			   + ((Class155) class155).aFloat1732 * f_88_ / f_50_);
		    f_55_
			= (((Class155) class155).aFloat1720
			   + ((Class155) class155).aFloat1732 * f_89_ / f_51_);
		    f_56_
			= (((Class155) class155).aFloat1720
			   + ((Class155) class155).aFloat1732 * f_90_ / f_52_);
		    f_57_
			= (((Class155) class155).aFloat1720
			   + ((Class155) class155).aFloat1732 * f_91_ / f_53_);
		    if (bool) {
			float f_92_ = f_88_ - ((Class189) class189).aFloat2213;
			if (f_92_ > 0.0F) {
			    f_92_ /= ((Class189) class189).aFloat2214;
			    if (f_92_ > 1.0F)
				f_92_ = 1.0F;
			    f = f_92_;
			    int i_93_ = (int) ((float) (((Class201) class201)
							.aShort2403)
					       * f_92_);
			    if (i_93_ > 0)
				i_84_ -= i_93_;
			}
			f_92_ = f_89_ - ((Class189) class189).aFloat2213;
			if (f_92_ > 0.0F) {
			    f_92_ /= ((Class189) class189).aFloat2214;
			    if (f_92_ > 1.0F)
				f_92_ = 1.0F;
			    f_47_ = f_92_;
			    int i_94_ = (int) ((float) (((Class201) class201)
							.aShort2407)
					       * f_92_);
			    if (i_94_ > 0)
				i_85_ -= i_94_;
			}
			f_92_ = f_90_ - ((Class189) class189).aFloat2213;
			if (f_92_ > 0.0F) {
			    f_92_ /= ((Class189) class189).aFloat2214;
			    if (f_92_ > 1.0F)
				f_92_ = 1.0F;
			    f_48_ = f_92_;
			    int i_95_ = (int) ((float) (((Class201) class201)
							.aShort2406)
					       * f_92_);
			    if (i_95_ > 0)
				i_86_ -= i_95_;
			}
			f_92_ = f_91_ - ((Class189) class189).aFloat2213;
			if (f_92_ > 0.0F) {
			    f_92_ /= ((Class189) class189).aFloat2214;
			    if (f_92_ > 1.0F)
				f_92_ = 1.0F;
			    f_49_ = f_92_;
			    int i_96_ = (int) ((float) (((Class201) class201)
							.aShort2402)
					       * f_92_);
			    if (i_96_ > 0)
				i_87_ -= i_96_;
			}
		    } else if (((Class189) class189).aBool2209) {
			float f_97_ = f_88_ - ((Class189) class189).aFloat2213;
			if (f_97_ > 0.0F) {
			    f = f_97_ / ((Class189) class189).aFloat2214;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_97_ = f_89_ - ((Class189) class189).aFloat2213;
			if (f_97_ > 0.0F) {
			    f_47_ = f_97_ / ((Class189) class189).aFloat2214;
			    if (f_47_ > 1.0F)
				f_47_ = 1.0F;
			}
			f_97_ = f_90_ - ((Class189) class189).aFloat2213;
			if (f_97_ > 0.0F) {
			    f_48_ = f_97_ / ((Class189) class189).aFloat2214;
			    if (f_48_ > 1.0F)
				f_48_ = 1.0F;
			}
			f_97_ = f_91_ - ((Class189) class189).aFloat2213;
			if (f_97_ > 0.0F) {
			    f_49_ = f_97_ / ((Class189) class189).aFloat2214;
			    if (f_49_ > 1.0F)
				f_49_ = 1.0F;
			}
		    }
		    float f_98_
			= (((Class166_Sub3) this).aFloat9986
			   + (((Class166_Sub3) this).aFloat9981 * (float) i_43_
			      + (((Class166_Sub3) this).aFloat9978
				 * (float) i_84_)
			      + (((Class166_Sub3) this).aFloat9982
				 * (float) i_45_)));
		    f_58_
			= (((Class155) class155).aFloat1727
			   + ((Class155) class155).aFloat1728 * f_98_ / f_50_);
		    float f_99_
			= (((Class166_Sub3) this).aFloat9987
			   + (((Class166_Sub3) this).aFloat9973 * (float) i_43_
			      + (((Class166_Sub3) this).aFloat9965
				 * (float) i_84_)
			      + (((Class166_Sub3) this).aFloat9983
				 * (float) i_45_)));
		    f_59_
			= (((Class155) class155).aFloat1731
			   + ((Class155) class155).aFloat1729 * f_99_ / f_50_);
		    float f_100_
			= (((Class166_Sub3) this).aFloat9986
			   + (((Class166_Sub3) this).aFloat9981 * (float) i_44_
			      + (((Class166_Sub3) this).aFloat9978
				 * (float) i_85_)
			      + (((Class166_Sub3) this).aFloat9982
				 * (float) i_45_)));
		    f_60_ = (((Class155) class155).aFloat1727
			     + (((Class155) class155).aFloat1728 * f_100_
				/ f_51_));
		    float f_101_
			= (((Class166_Sub3) this).aFloat9987
			   + (((Class166_Sub3) this).aFloat9973 * (float) i_44_
			      + (((Class166_Sub3) this).aFloat9965
				 * (float) i_85_)
			      + (((Class166_Sub3) this).aFloat9983
				 * (float) i_45_)));
		    f_61_ = (((Class155) class155).aFloat1731
			     + (((Class155) class155).aFloat1729 * f_101_
				/ f_51_));
		    float f_102_
			= (((Class166_Sub3) this).aFloat9986
			   + (((Class166_Sub3) this).aFloat9981 * (float) i_44_
			      + (((Class166_Sub3) this).aFloat9978
				 * (float) i_86_)
			      + (((Class166_Sub3) this).aFloat9982
				 * (float) i_46_)));
		    f_62_ = (((Class155) class155).aFloat1727
			     + (((Class155) class155).aFloat1728 * f_102_
				/ f_52_));
		    float f_103_
			= (((Class166_Sub3) this).aFloat9987
			   + (((Class166_Sub3) this).aFloat9973 * (float) i_44_
			      + (((Class166_Sub3) this).aFloat9965
				 * (float) i_86_)
			      + (((Class166_Sub3) this).aFloat9983
				 * (float) i_46_)));
		    f_63_ = (((Class155) class155).aFloat1731
			     + (((Class155) class155).aFloat1729 * f_103_
				/ f_52_));
		    float f_104_
			= (((Class166_Sub3) this).aFloat9986
			   + (((Class166_Sub3) this).aFloat9981 * (float) i_43_
			      + (((Class166_Sub3) this).aFloat9978
				 * (float) i_87_)
			      + (((Class166_Sub3) this).aFloat9982
				 * (float) i_46_)));
		    f_64_ = (((Class155) class155).aFloat1727
			     + (((Class155) class155).aFloat1728 * f_104_
				/ f_53_));
		    float f_105_
			= (((Class166_Sub3) this).aFloat9987
			   + (((Class166_Sub3) this).aFloat9973 * (float) i_43_
			      + (((Class166_Sub3) this).aFloat9965
				 * (float) i_87_)
			      + (((Class166_Sub3) this).aFloat9983
				 * (float) i_46_)));
		    f_65_ = (((Class155) class155).aFloat1731
			     + (((Class155) class155).aFloat1729 * f_105_
				/ f_53_));
		}
		Class101 class101 = null;
		int i_106_ = -1;
		if (((Class201) class201).aShort2411 != -1) {
		    class101 = (((Class166_Sub3) this).aClass103_Sub2_9962
				    .aClass107_1458.method2680
				(((Class201) class201).aShort2411 & 0xffff,
				 2017599601));
		    i_106_ = class101.anInt1403 * 218388063;
		}
		boolean bool_107_
		    = class101 != null && method16256(class101.aByte1427);
		float f_108_ = f_47_ + f_48_ + f_49_;
		if (((f_62_ - f_64_) * (f_61_ - f_65_)
		     - (f_63_ - f_65_) * (f_60_ - f_64_))
		    > 0.0F) {
		    ((Class155) class155).aBool1748
			= (f_62_ < 0.0F || f_64_ < 0.0F || f_60_ < 0.0F
			   || f_62_ > (float) ((Class155) class155).anInt1733
			   || f_64_ > (float) ((Class155) class155).anInt1733
			   || f_60_ > (float) ((Class155) class155).anInt1733);
		    if (f_108_ < 3.0F) {
			if (f_108_ > 0.0F) {
			    if (i_106_ >= 0) {
				int i_109_ = -16777216;
				if (bool_107_)
				    i_109_ = -1694498816;
				class155.method3384
				    (true, true, false, f_63_, f_65_, f_61_,
				     f_62_, f_64_, f_60_, f_56_, f_57_, f_55_,
				     f_52_, f_53_, f_51_, 1.0F, 0.0F, 1.0F,
				     1.0F, 1.0F, 0.0F,
				     i_109_ | (((Class201) class201).anInt2404
					       & 0xffffff),
				     i_109_ | (((Class201) class201).anInt2405
					       & 0xffffff),
				     i_109_ | (((Class201) class201).anInt2401
					       & 0xffffff),
				     (((Class189) class189).anInt2215
				      * -338296791),
				     f_48_ * 255.0F, f_49_ * 255.0F,
				     f_47_ * 255.0F,
				     ((Class201) class201).aShort2411 & 0xffff,
				     i_106_);
			    } else {
				if (bool_107_)
				    ((Class155) class155).anInt1723 = 100;
				class155.method3385
				    (true, true, false, f_63_, f_65_, f_61_,
				     f_62_, f_64_, f_60_, f_56_, f_57_, f_55_,
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2404,
				       ((int) (f_48_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       -591648406)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2405,
				       ((int) (f_49_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       1181758435)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2401,
				       ((int) (f_47_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       -1426013304)));
				((Class155) class155).anInt1723 = 0;
			    }
			} else if (i_106_ >= 0) {
			    int i_110_ = -16777216;
			    if (bool_107_)
				i_110_ = -1694498816;
			    class155.method3384
				(true, true, false, f_63_, f_65_, f_61_, f_62_,
				 f_64_, f_60_, f_56_, f_57_, f_55_, f_52_,
				 f_53_, f_51_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F,
				 0.0F,
				 i_110_ | (((Class201) class201).anInt2404
					   & 0xffffff),
				 i_110_ | (((Class201) class201).anInt2405
					   & 0xffffff),
				 i_110_ | (((Class201) class201).anInt2401
					   & 0xffffff),
				 0, 0.0F, 0.0F, 0.0F,
				 ((Class201) class201).aShort2411 & 0xffff,
				 i_106_);
			} else {
			    if (bool_107_)
				((Class155) class155).anInt1723 = 100;
			    class155.method3385
				(true, true, false, f_63_, f_65_, f_61_, f_62_,
				 f_64_, f_60_, f_56_, f_57_, f_55_,
				 ((Class201) class201).anInt2404,
				 ((Class201) class201).anInt2405,
				 ((Class201) class201).anInt2401);
			    ((Class155) class155).anInt1723 = 0;
			}
		    } else
			class155.method3377(true, true, false, f_63_, f_65_,
					    f_61_, f_62_, f_64_, f_60_, f_56_,
					    f_57_, f_55_,
					    (((Class189) class189).anInt2215
					     * -338296791));
		}
		f_108_ = f + f_47_ + f_49_;
		if (((f_58_ - f_60_) * (f_65_ - f_61_)
		     - (f_59_ - f_61_) * (f_64_ - f_60_))
		    > 0.0F) {
		    ((Class155) class155).aBool1748
			= (f_58_ < 0.0F || f_60_ < 0.0F || f_64_ < 0.0F
			   || f_58_ > (float) ((Class155) class155).anInt1733
			   || f_60_ > (float) ((Class155) class155).anInt1733
			   || f_64_ > (float) ((Class155) class155).anInt1733);
		    if (f_108_ < 3.0F) {
			if (bool_107_)
			    ((Class155) class155).anInt1723 = -1694498816;
			if (f_108_ > 0.0F) {
			    if (i_106_ >= 0) {
				int i_111_ = -16777216;
				if (bool_107_)
				    i_111_ = -1694498816;
				class155.method3384
				    (true, true, false, f_59_, f_61_, f_65_,
				     f_58_, f_60_, f_64_, f_54_, f_55_, f_57_,
				     f_50_, f_51_, f_53_, 0.0F, 1.0F, 1.0F,
				     0.0F, 0.0F, 1.0F,
				     i_111_ | (((Class201) class201).anInt2410
					       & 0xffffff),
				     i_111_ | (((Class201) class201).anInt2401
					       & 0xffffff),
				     i_111_ | (((Class201) class201).anInt2405
					       & 0xffffff),
				     (((Class189) class189).anInt2215
				      * -338296791),
				     f * 255.0F, f_47_ * 255.0F,
				     f_49_ * 255.0F,
				     ((Class201) class201).aShort2411 & 0xffff,
				     i_106_);
			    } else {
				if (bool_107_)
				    ((Class155) class155).anInt1723 = 100;
				class155.method3385
				    (true, true, false, f_59_, f_61_, f_65_,
				     f_58_, f_60_, f_64_, f_54_, f_55_, f_57_,
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2410,
				       ((int) (f * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       1425416691)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2401,
				       ((int) (f_47_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       522666184)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2405,
				       ((int) (f_49_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       -980653509)));
				((Class155) class155).anInt1723 = 0;
			    }
			} else if (i_106_ >= 0) {
			    int i_112_ = -16777216;
			    if (bool_107_)
				i_112_ = -1694498816;
			    class155.method3384
				(true, true, false, f_59_, f_61_, f_65_, f_58_,
				 f_60_, f_64_, f_54_, f_55_, f_57_, f_50_,
				 f_51_, f_53_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F,
				 1.0F,
				 i_112_ | (((Class201) class201).anInt2410
					   & 0xffffff),
				 i_112_ | (((Class201) class201).anInt2401
					   & 0xffffff),
				 i_112_ | (((Class201) class201).anInt2405
					   & 0xffffff),
				 0, 0.0F, 0.0F, 0.0F,
				 ((Class201) class201).aShort2411 & 0xffff,
				 i_106_);
			} else {
			    if (bool_107_)
				((Class155) class155).anInt1723 = 100;
			    class155.method3385
				(true, true, false, f_59_, f_61_, f_65_, f_58_,
				 f_60_, f_64_, f_54_, f_55_, f_57_,
				 ((Class201) class201).anInt2410,
				 ((Class201) class201).anInt2401,
				 ((Class201) class201).anInt2405);
			    ((Class155) class155).anInt1723 = 0;
			}
		    } else
			class155.method3377(true, true, false, f_59_, f_61_,
					    f_65_, f_58_, f_60_, f_64_, f_54_,
					    f_55_, f_57_,
					    (((Class189) class189).anInt2215
					     * -338296791));
		}
	    }
	} else {
	    Class183 class183
		= ((Class166_Sub3) this).aClass183ArrayArray9969[i][i_37_];
	    if (class183 != null) {
		if (i_42_ != 0) {
		    if ((((Class183) class183).aByte2157 & 0x4) != 0) {
			if ((i_42_ & 0x1) != 0)
			    return;
		    } else if ((i_42_ & 0x2) != 0)
			return;
		}
		for (int i_113_ = 0; i_113_ < ((Class183) class183).aShort2154;
		     i_113_++) {
		    int i_114_ = (((Class183) class183).aShortArray2156[i_113_]
				  + (i << anInt2054 * -122333825));
		    int i_115_ = ((Class183) class183).aShortArray2153[i_113_];
		    int i_116_ = (((Class183) class183).aShortArray2158[i_113_]
				  + (i_37_ << anInt2054 * -122333825));
		    float f = (((Class166_Sub3) this).aFloat9988
			       + ((((Class166_Sub3) this).aFloat9976
				   * (float) i_114_)
				  + (((Class166_Sub3) this).aFloat9980
				     * (float) i_115_)
				  + (((Class166_Sub3) this).aFloat9984
				     * (float) i_116_)));
		    float f_117_ = (((Class166_Sub3) this).aFloat9974
				    + ((((Class166_Sub3) this).aFloat9977
					* (float) i_114_)
				       + (((Class166_Sub3) this).aFloat9989
					  * (float) i_115_)
				       + (((Class166_Sub3) this).aFloat9985
					  * (float) i_116_)));
		    if (f < -f_117_)
			return;
		    float f_118_
			= (((Class155) class155).aFloat1720
			   + ((Class155) class155).aFloat1732 * f / f_117_);
		    fs_41_[i_113_] = 0.0F;
		    if (bool) {
			float f_119_ = f - ((Class189) class189).aFloat2213;
			if (f_119_ > 0.0F) {
			    f_119_ /= ((Class189) class189).aFloat2214;
			    if (f_119_ > 1.0F)
				f_119_ = 1.0F;
			    fs_41_[i_113_] = f_119_;
			    int i_120_
				= (int) ((float) (((Class183) class183)
						  .aShortArray2159[i_113_])
					 * f_119_);
			    if (i_120_ > 0)
				i_115_ -= i_120_;
			}
		    } else if (((Class189) class189).aBool2209) {
			float f_121_ = f - ((Class189) class189).aFloat2213;
			if (f_121_ > 0.0F) {
			    fs_41_[i_113_]
				= f_121_ / ((Class189) class189).aFloat2214;
			    if (fs_41_[i_113_] > 1.0F)
				fs_41_[i_113_] = 1.0F;
			}
		    }
		    float f_122_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_114_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_115_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_116_)));
		    float f_123_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_114_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_115_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_116_)));
		    fs[i_113_] = (((Class155) class155).aFloat1727
				  + (((Class155) class155).aFloat1728 * f_122_
				     / f_117_));
		    fs_38_[i_113_] = (((Class155) class155).aFloat1731
				      + (((Class155) class155).aFloat1729
					 * f_123_ / f_117_));
		    fs_39_[i_113_] = f_118_;
		    fs_40_[i_113_] = f_117_;
		}
		if (((Class183) class183).aShortArray2161 != null) {
		    for (int i_124_ = 0;
			 i_124_ < ((Class183) class183).aShort2160; i_124_++) {
			int i_125_ = i_124_ * 3;
			int i_126_ = i_125_ + 1;
			int i_127_ = i_126_ + 1;
			float f = fs[i_125_];
			float f_128_ = fs[i_126_];
			float f_129_ = fs[i_127_];
			float f_130_ = fs_38_[i_125_];
			float f_131_ = fs_38_[i_126_];
			float f_132_ = fs_38_[i_127_];
			float f_133_
			    = fs_41_[i_125_] + fs_41_[i_126_] + fs_41_[i_127_];
			if (((f - f_128_) * (f_132_ - f_131_)
			     - (f_130_ - f_131_) * (f_129_ - f_128_))
			    > 0.0F) {
			    ((Class155) class155).aBool1748
				= (f < 0.0F || f_128_ < 0.0F || f_129_ < 0.0F
				   || f > (float) (((Class155) class155)
						   .anInt1733)
				   || f_128_ > (float) (((Class155) class155)
							.anInt1733)
				   || f_129_ > (float) (((Class155) class155)
							.anInt1733));
			    Class101 class101 = null;
			    int i_134_ = -1;
			    if (((Class183) class183).aShortArray2161[i_124_]
				!= -1) {
				class101
				    = (((Class166_Sub3) this)
					   .aClass103_Sub2_9962.aClass107_1458
					   .method2680
				       ((((Class183) class183).aShortArray2161
					 [i_124_]) & 0xffff,
					1485381376));
				i_134_ = class101.anInt1403 * 218388063;
			    }
			    if (f_133_ < 3.0F) {
				if (f_133_ > 0.0F) {
				    if (i_134_ != -1) {
					int i_135_ = -16777216;
					if (i_134_ != -1
					    && method16256(class101.aByte1427))
					    i_135_ = -1694498816;
					class155.method3384
					    (true, true, false, f_130_, f_131_,
					     f_132_, f, f_128_, f_129_,
					     fs_39_[i_125_], fs_39_[i_126_],
					     fs_39_[i_127_], fs_40_[i_125_],
					     fs_40_[i_126_], fs_40_[i_127_],
					     ((float) (((Class183) class183)
						       .aShortArray2156
						       [i_125_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2156
						       [i_126_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2156
						       [i_127_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2158
						       [i_125_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2158
						       [i_126_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2158
						       [i_127_])
					      / (float) (anInt2053
							 * 2039042417)),
					     i_135_ | (((Class183) class183)
						       .anIntArray2163
						       [i_125_]) & 0xffffff,
					     i_135_ | (((Class183) class183)
						       .anIntArray2163
						       [i_126_]) & 0xffffff,
					     i_135_ | (((Class183) class183)
						       .anIntArray2163
						       [i_127_]) & 0xffffff,
					     (((Class189) class189).anInt2215
					      * -338296791),
					     fs_41_[i_125_] * 255.0F,
					     fs_41_[i_126_] * 255.0F,
					     fs_41_[i_127_] * 255.0F,
					     ((((Class183) class183)
					       .aShortArray2161[i_124_])
					      & 0xffff),
					     i_134_);
				    } else if (((((Class183) class183)
						 .anIntArray2163[i_125_])
						& 0xffffff)
					       != 0) {
					if (i_134_ != -1
					    && method16256(class101.aByte1427))
					    ((Class155) class155).anInt1723
						= -1694498816;
					class155.method3385
					    (true, true, false, f_130_, f_131_,
					     f_132_, f, f_128_, f_129_,
					     fs_39_[i_125_], fs_39_[i_126_],
					     fs_39_[i_127_],
					     (Class241_Sub18_Sub1.method17140
					      ((((Class183) class183)
						.anIntArray2163[i_125_]),
					       ((int) (fs_41_[i_125_]
						       * 255.0F) << 24
						| (((Class189) class189)
						   .anInt2215) * -338296791),
					       -1572940697)),
					     (Class241_Sub18_Sub1.method17140
					      ((((Class183) class183)
						.anIntArray2163[i_126_]),
					       ((int) (fs_41_[i_126_]
						       * 255.0F) << 24
						| (((Class189) class189)
						   .anInt2215) * -338296791),
					       -1455585889)),
					     (Class241_Sub18_Sub1.method17140
					      ((((Class183) class183)
						.anIntArray2163[i_127_]),
					       ((int) (fs_41_[i_127_]
						       * 255.0F) << 24
						| (((Class189) class189)
						   .anInt2215) * -338296791),
					       -1010174780)));
					((Class155) class155).anInt1723 = 0;
				    }
				} else if (i_134_ != -1) {
				    int i_136_ = -16777216;
				    if (i_134_ != -1
					&& method16256(class101.aByte1427))
					i_136_ = -1694498816;
				    class155.method3384
					(true, true, false, f_130_, f_131_,
					 f_132_, f, f_128_, f_129_,
					 fs_39_[i_125_], fs_39_[i_126_],
					 fs_39_[i_127_], fs_40_[i_125_],
					 fs_40_[i_126_], fs_40_[i_127_],
					 ((float) (((Class183) class183)
						   .aShortArray2156[i_125_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2156[i_126_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2156[i_127_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2158[i_125_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2158[i_126_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2158[i_127_])
					  / (float) (anInt2053 * 2039042417)),
					 i_136_ | ((((Class183) class183)
						    .anIntArray2163[i_125_])
						   & 0xffffff),
					 i_136_ | ((((Class183) class183)
						    .anIntArray2163[i_126_])
						   & 0xffffff),
					 i_136_ | ((((Class183) class183)
						    .anIntArray2163[i_127_])
						   & 0xffffff),
					 0, 0.0F, 0.0F, 0.0F,
					 (((Class183) class183).aShortArray2161
					  [i_124_]) & 0xffff,
					 i_134_);
				} else if (((((Class183) class183)
					     .anIntArray2163[i_125_])
					    & 0xffffff)
					   != 0) {
				    if (i_134_ != -1
					&& method16256(class101.aByte1427))
					((Class155) class155).anInt1723
					    = -1694498816;
				    class155.method3385(true, true, false,
							f_130_, f_131_, f_132_,
							f, f_128_, f_129_,
							fs_39_[i_125_],
							fs_39_[i_126_],
							fs_39_[i_127_],
							(((Class183) class183)
							 .anIntArray2163
							 [i_125_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_126_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_127_]));
				    ((Class155) class155).anInt1723 = 0;
				}
			    } else
				class155.method3377(true, true, false, f_130_,
						    f_131_, f_132_, f, f_128_,
						    f_129_, fs_39_[i_125_],
						    fs_39_[i_126_],
						    fs_39_[i_127_],
						    (((Class189) class189)
						     .anInt2215) * -338296791);
			}
		    }
		} else {
		    for (int i_137_ = 0;
			 i_137_ < ((Class183) class183).aShort2160; i_137_++) {
			int i_138_ = i_137_ * 3;
			int i_139_ = i_138_ + 1;
			int i_140_ = i_139_ + 1;
			float f = fs[i_138_];
			float f_141_ = fs[i_139_];
			float f_142_ = fs[i_140_];
			float f_143_ = fs_38_[i_138_];
			float f_144_ = fs_38_[i_139_];
			float f_145_ = fs_38_[i_140_];
			float f_146_
			    = fs_41_[i_138_] + fs_41_[i_139_] + fs_41_[i_140_];
			if (((f - f_141_) * (f_145_ - f_144_)
			     - (f_143_ - f_144_) * (f_142_ - f_141_))
			    > 0.0F) {
			    ((Class155) class155).aBool1748
				= (f < 0.0F || f_141_ < 0.0F || f_142_ < 0.0F
				   || f > (float) (((Class155) class155)
						   .anInt1733)
				   || f_141_ > (float) (((Class155) class155)
							.anInt1733)
				   || f_142_ > (float) (((Class155) class155)
							.anInt1733));
			    if (f_146_ < 3.0F) {
				if (f_146_ > 0.0F) {
				    if (((((Class183) class183).anIntArray2163
					  [i_138_])
					 & 0xffffff)
					!= 0)
					class155.method3385
					    (true, true, false, f_143_, f_144_,
					     f_145_, f, f_141_, f_142_,
					     fs_39_[i_138_], fs_39_[i_139_],
					     fs_39_[i_140_],
					     (Class54.method1306
					      ((((Class183) class183)
						.anIntArray2163[i_138_]),
					       (((Class189) class189).anInt2215
						* -338296791),
					       fs_41_[i_138_] * 255.0F,
					       1372221625)),
					     (Class54.method1306
					      ((((Class183) class183)
						.anIntArray2163[i_139_]),
					       (((Class189) class189).anInt2215
						* -338296791),
					       fs_41_[i_139_] * 255.0F,
					       1372221625)),
					     (Class54.method1306
					      ((((Class183) class183)
						.anIntArray2163[i_140_]),
					       (((Class189) class189).anInt2215
						* -338296791),
					       fs_41_[i_140_] * 255.0F,
					       1372221625)));
				} else if (((((Class183) class183)
					     .anIntArray2163[i_138_])
					    & 0xffffff)
					   != 0)
				    class155.method3385(true, true, false,
							f_143_, f_144_, f_145_,
							f, f_141_, f_142_,
							fs_39_[i_138_],
							fs_39_[i_139_],
							fs_39_[i_140_],
							(((Class183) class183)
							 .anIntArray2163
							 [i_138_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_139_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_140_]));
			    } else
				class155.method3377(true, true, false, f_143_,
						    f_144_, f_145_, f, f_141_,
						    f_142_, fs_39_[i_138_],
						    fs_39_[i_139_],
						    fs_39_[i_140_],
						    (((Class189) class189)
						     .anInt2215) * -338296791);
			}
		    }
		}
	    }
	}
    }
    
    public void method3567(int i, int i_147_, int[] is, int[] is_148_,
			   int[] is_149_, int[] is_150_, int[] is_151_,
			   int[] is_152_, int[] is_153_, int[] is_154_,
			   int[] is_155_, int[] is_156_, int[] is_157_,
			   Class86 class86, boolean bool) {
	if (((Class166_Sub3) this).aClass182ArrayArray9975 == null) {
	    ((Class166_Sub3) this).aClass182ArrayArray9975
		= new Class182[anInt2055 * 266270313][anInt2052 * -14610189];
	    ((Class166_Sub3) this).aClass205ArrayArray9970
		= new Class205[anInt2055 * 266270313][anInt2052 * -14610189];
	} else if (((Class166_Sub3) this).aClass201ArrayArray9967 != null
		   || ((Class166_Sub3) this).aClass143ArrayArray9979 != null)
	    throw new IllegalStateException();
	boolean bool_158_ = false;
	if (is_154_.length == 2 && is_151_.length == 2
	    && (is_154_[0] == is_154_[1]
		|| is_156_[0] != -1 && is_156_[0] == is_156_[1])) {
	    bool_158_ = true;
	    for (int i_159_ = 1; i_159_ < 2; i_159_++) {
		int i_160_ = is[is_151_[i_159_]];
		int i_161_ = is_149_[is_151_[i_159_]];
		if (i_160_ != 0 && i_160_ != anInt2053 * 2039042417
		    || i_161_ != 0 && i_161_ != anInt2053 * 2039042417) {
		    bool_158_ = false;
		    break;
		}
	    }
	}
	if (!bool_158_) {
	    Class205 class205 = new Class205();
	    short i_162_ = (short) is.length;
	    int i_163_ = (short) is_154_.length;
	    ((Class205) class205).aShort2431 = i_162_;
	    ((Class205) class205).aShortArray2436 = new short[i_162_];
	    ((Class205) class205).aShortArray2433 = new short[i_162_];
	    ((Class205) class205).aShortArray2439 = new short[i_162_];
	    ((Class205) class205).aShortArray2438 = new short[i_162_];
	    for (int i_164_ = 0; i_164_ < i_162_; i_164_++) {
		int i_165_ = is[i_164_];
		int i_166_ = is_149_[i_164_];
		if (i_165_ == 0 && i_166_ == 0)
		    ((Class205) class205).aShortArray2436[i_164_]
			= (short) ((((Class166_Sub3) this).aByteArrayArray9990
				    [i][i_147_])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i][i_147_]));
		else if (i_165_ == 0 && i_166_ == anInt2053 * 2039042417)
		    ((Class205) class205).aShortArray2436[i_164_]
			= (short) ((((Class166_Sub3) this).aByteArrayArray9990
				    [i][i_147_ + 1])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i][i_147_ + 1]));
		else if (i_165_ == anInt2053 * 2039042417
			 && i_166_ == anInt2053 * 2039042417)
		    ((Class205) class205).aShortArray2436[i_164_]
			= (short) ((((Class166_Sub3) this).aByteArrayArray9990
				    [i + 1][i_147_ + 1])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i + 1]
				      [i_147_ + 1]));
		else if (i_165_ == anInt2053 * 2039042417 && i_166_ == 0)
		    ((Class205) class205).aShortArray2436[i_164_]
			= (short) ((((Class166_Sub3) this).aByteArrayArray9990
				    [i + 1][i_147_])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i + 1][i_147_]));
		else {
		    int i_167_
			= (((((Class166_Sub3) this).aByteArrayArray9990[i]
			     [i_147_])
			    - (((Class166_Sub3) this).aByteArrayArray9991[i]
			       [i_147_])) * (anInt2053 * 2039042417 - i_165_)
			   + ((((Class166_Sub3) this).aByteArrayArray9990
			       [i + 1][i_147_])
			      - (((Class166_Sub3) this).aByteArrayArray9991
				 [i + 1][i_147_])) * i_165_);
		    int i_168_
			= ((((((Class166_Sub3) this).aByteArrayArray9990[i]
			      [i_147_ + 1])
			     - (((Class166_Sub3) this).aByteArrayArray9991[i]
				[i_147_ + 1]))
			    * (anInt2053 * 2039042417 - i_165_))
			   + ((((Class166_Sub3) this).aByteArrayArray9990
			       [i + 1][i_147_ + 1])
			      - (((Class166_Sub3) this).aByteArrayArray9991
				 [i + 1][i_147_ + 1])) * i_165_);
		    ((Class205) class205).aShortArray2436[i_164_]
			= (short) ((i_167_ * (anInt2053 * 2039042417 - i_166_)
				    + i_168_ * i_166_)
				   >> anInt2054 * -244667650);
		}
		int i_169_ = (i << anInt2054 * -122333825) + i_165_;
		int i_170_ = (i_147_ << anInt2054 * -122333825) + i_166_;
		((Class205) class205).aShortArray2433[i_164_] = (short) i_165_;
		((Class205) class205).aShortArray2438[i_164_] = (short) i_166_;
		((Class205) class205).aShortArray2439[i_164_]
		    = (short) (method3574(i_169_, i_170_, -1749429505)
			       + (is_148_ != null ? is_148_[i_164_] : 0));
		if (((Class205) class205).aShortArray2436[i_164_] < 2)
		    ((Class205) class205).aShortArray2436[i_164_] = (short) 2;
	    }
	    boolean bool_171_ = false;
	    int i_172_ = 0;
	    for (int i_173_ = 0; i_173_ < i_163_; i_173_++) {
		if (is_154_[i_173_] >= 0
		    || is_155_ != null && is_155_[i_173_] >= 0)
		    i_172_++;
		int i_174_ = is_156_[i_173_];
		if (i_174_ != -1) {
		    Class101 class101
			= ((Class166_Sub3) this).aClass103_Sub2_9962
			      .aClass107_1458.method2680(i_174_, 263425673);
		    if (!class101.aBool1434) {
			bool_171_ = true;
			if (method16256(class101.aByte1427)
			    || class101.aByte1376 != 0
			    || class101.aByte1396 != 0)
			    ((Class205) class205).aByte2432 |= 0x4;
		    }
		}
	    }
	    ((Class205) class205).anIntArray2442 = new int[i_172_];
	    if (is_155_ != null)
		((Class205) class205).anIntArray2435 = new int[i_172_];
	    ((Class205) class205).aShortArray2437 = new short[i_172_];
	    ((Class205) class205).aShortArray2430 = new short[i_172_];
	    ((Class205) class205).aShortArray2443 = new short[i_172_];
	    if (bool_171_) {
		((Class205) class205).aShortArray2440 = new short[i_172_];
		((Class205) class205).aShortArray2434 = new short[i_172_];
	    }
	    for (int i_175_ = 0; i_175_ < i_163_; i_175_++) {
		if (is_154_[i_175_] >= 0
		    || is_155_ != null && is_155_[i_175_] >= 0) {
		    if (is_154_[i_175_] >= 0)
			((Class205) class205).anIntArray2442
			    [((Class205) class205).aShort2441]
			    = Class241_Sub42.method16451(is_154_[i_175_],
							 741973530);
		    else
			((Class205) class205).anIntArray2442
			    [((Class205) class205).aShort2441]
			    = -1;
		    if (is_155_ != null) {
			if (is_155_[i_175_] != -1)
			    ((Class205) class205).anIntArray2435
				[((Class205) class205).aShort2441]
				= Class241_Sub42.method16451(is_155_[i_175_],
							     -2114895851);
			else
			    ((Class205) class205).anIntArray2435
				[((Class205) class205).aShort2441]
				= -1;
		    }
		    ((Class205) class205).aShortArray2437
			[((Class205) class205).aShort2441]
			= (short) is_151_[i_175_];
		    ((Class205) class205).aShortArray2430
			[((Class205) class205).aShort2441]
			= (short) is_152_[i_175_];
		    ((Class205) class205).aShortArray2443
			[((Class205) class205).aShort2441]
			= (short) is_153_[i_175_];
		    if (bool_171_) {
			if (is_156_[i_175_] != -1
			    && !(((Class166_Sub3) this).aClass103_Sub2_9962
				     .aClass107_1458.method2680
				 (is_156_[i_175_], 585373393).aBool1434)) {
			    ((Class205) class205).aShortArray2440
				[((Class205) class205).aShort2441]
				= (short) is_156_[i_175_];
			    ((Class205) class205).aShortArray2434
				[((Class205) class205).aShort2441]
				= (short) is_157_[i_175_];
			} else
			    ((Class205) class205).aShortArray2440
				[((Class205) class205).aShort2441]
				= (short) -1;
		    }
		    ((Class205) class205).aShort2441++;
		}
	    }
	    ((Class166_Sub3) this).aClass205ArrayArray9970[i][i_147_]
		= class205;
	} else if (is_154_[0] >= 0 || is_155_ != null && is_155_[0] >= 0) {
	    Class182 class182 = new Class182();
	    int i_176_ = is_154_[0];
	    int i_177_ = is_156_[0];
	    if (is_155_ != null) {
		((Class182) class182).anInt2151
		    = (Class639.method13606
		       (Class241_Sub42.method16451(is_155_[0], 1612878656),
			(((Class166_Sub3) this).aByteArrayArray9990[i][i_147_]
			 - (((Class166_Sub3) this).aByteArrayArray9991[i]
			    [i_147_])),
			959954138));
		if (i_176_ == -1)
		    ((Class182) class182).aByte2150 |= 0x2;
	    }
	    if ((anIntArrayArray2051[i][i_147_]
		 == anIntArrayArray2051[i + 1][i_147_])
		&& (anIntArrayArray2051[i][i_147_]
		    == anIntArrayArray2051[i + 1][i_147_ + 1])
		&& (anIntArrayArray2051[i][i_147_]
		    == anIntArrayArray2051[i][i_147_ + 1]))
		((Class182) class182).aByte2150 |= 0x1;
	    Class101 class101 = null;
	    if (i_177_ != -1)
		class101 = ((Class166_Sub3) this).aClass103_Sub2_9962
			       .aClass107_1458.method2680(i_177_, 1441444069);
	    if (class101 != null
		&& (((Class182) class182).aByte2150 & 0x2) == 0
		&& !class101.aBool1434) {
		((Class182) class182).aShort2146
		    = (short) ((((Class166_Sub3) this).aByteArrayArray9990[i]
				[i_147_])
			       - (((Class166_Sub3) this).aByteArrayArray9991[i]
				  [i_147_]));
		((Class182) class182).aShort2148
		    = (short) ((((Class166_Sub3) this).aByteArrayArray9990
				[i + 1][i_147_])
			       - (((Class166_Sub3) this).aByteArrayArray9991
				  [i + 1][i_147_]));
		((Class182) class182).aShort2147
		    = (short) ((((Class166_Sub3) this).aByteArrayArray9990
				[i + 1][i_147_ + 1])
			       - (((Class166_Sub3) this).aByteArrayArray9991
				  [i + 1][i_147_ + 1]));
		((Class182) class182).aShort2152
		    = (short) ((((Class166_Sub3) this).aByteArrayArray9990[i]
				[i_147_ + 1])
			       - (((Class166_Sub3) this).aByteArrayArray9991[i]
				  [i_147_ + 1]));
		((Class182) class182).aShort2149 = (short) i_177_;
		if (method16256(class101.aByte1427) || class101.aByte1376 != 0
		    || class101.aByte1396 != 0)
		    ((Class182) class182).aByte2150 |= 0x4;
	    } else {
		short i_178_ = Class241_Sub42.method16451(i_176_, 1926178186);
		((Class182) class182).aShort2146
		    = (short) Class639.method13606(i_178_,
						   ((((Class166_Sub3) this)
						     .aByteArrayArray9990[i]
						     [i_147_])
						    - (((Class166_Sub3) this)
						       .aByteArrayArray9991[i]
						       [i_147_])),
						   -1648850618);
		((Class182) class182).aShort2148
		    = (short) Class639.method13606(i_178_,
						   ((((Class166_Sub3) this)
						     .aByteArrayArray9990
						     [i + 1][i_147_])
						    - (((Class166_Sub3) this)
						       .aByteArrayArray9991
						       [i + 1][i_147_])),
						   -1741671551);
		((Class182) class182).aShort2147
		    = (short) Class639.method13606(i_178_,
						   ((((Class166_Sub3) this)
						     .aByteArrayArray9990
						     [i + 1][i_147_ + 1])
						    - (((Class166_Sub3) this)
						       .aByteArrayArray9991
						       [i + 1][i_147_ + 1])),
						   -781934239);
		((Class182) class182).aShort2152
		    = (short) Class639.method13606(i_178_,
						   ((((Class166_Sub3) this)
						     .aByteArrayArray9990[i]
						     [i_147_ + 1])
						    - (((Class166_Sub3) this)
						       .aByteArrayArray9991[i]
						       [i_147_ + 1])),
						   467546906);
		((Class182) class182).aShort2149 = (short) -1;
	    }
	    ((Class166_Sub3) this).aClass182ArrayArray9975[i][i_147_]
		= class182;
	}
    }
    
    public void method3579() {
	((Class166_Sub3) this).aByteArrayArray9990 = null;
	((Class166_Sub3) this).aByteArrayArray9991 = null;
    }
    
    public void method3547(int i, int i_179_, int i_180_, boolean[][] bools,
			   boolean bool, int i_181_) {
	if ((((Class103_Sub2) ((Class166_Sub3) this).aClass103_Sub2_9962)
	     .anIntArray9245) == null
	    || (((Class103_Sub2) ((Class166_Sub3) this).aClass103_Sub2_9962)
		.aFloatArray9248) == null)
	    throw new IllegalStateException("");
	Class268 class268
	    = (((Class103_Sub2) ((Class166_Sub3) this).aClass103_Sub2_9962)
	       .aClass268_9262);
	((Class166_Sub3) this).aFloat9981 = class268.aFloatArray4353[0];
	((Class166_Sub3) this).aFloat9973 = class268.aFloatArray4353[1];
	((Class166_Sub3) this).aFloat9976 = class268.aFloatArray4353[2];
	((Class166_Sub3) this).aFloat9977 = class268.aFloatArray4353[3];
	((Class166_Sub3) this).aFloat9978 = class268.aFloatArray4353[4];
	((Class166_Sub3) this).aFloat9965 = class268.aFloatArray4353[5];
	((Class166_Sub3) this).aFloat9980 = class268.aFloatArray4353[6];
	((Class166_Sub3) this).aFloat9989 = class268.aFloatArray4353[7];
	((Class166_Sub3) this).aFloat9982 = class268.aFloatArray4353[8];
	((Class166_Sub3) this).aFloat9983 = class268.aFloatArray4353[9];
	((Class166_Sub3) this).aFloat9984 = class268.aFloatArray4353[10];
	((Class166_Sub3) this).aFloat9985 = class268.aFloatArray4353[11];
	((Class166_Sub3) this).aFloat9986 = class268.aFloatArray4353[12];
	((Class166_Sub3) this).aFloat9987 = class268.aFloatArray4353[13];
	((Class166_Sub3) this).aFloat9988 = class268.aFloatArray4353[14];
	((Class166_Sub3) this).aFloat9974 = class268.aFloatArray4353[15];
	for (int i_182_ = 0; i_182_ < i_180_ + i_180_; i_182_++) {
	    for (int i_183_ = 0; i_183_ < i_180_ + i_180_; i_183_++) {
		if (bools[i_182_][i_183_]) {
		    int i_184_ = i - i_180_ + i_182_;
		    int i_185_ = i_179_ - i_180_ + i_183_;
		    if (i_184_ >= 0 && i_184_ < anInt2055 * 266270313
			&& i_185_ >= 0 && i_185_ < anInt2052 * -14610189)
			method16240(i_184_, i_185_, i_181_);
		}
	    }
	}
    }
    
    void method16240(int i, int i_186_, int i_187_) {
	Class189 class189 = ((Class166_Sub3) this).aClass103_Sub2_9962
				.method15377(Thread.currentThread());
	((Class155) ((Class189) class189).aClass155_2223).anInt1723 = 0;
	if (((Class166_Sub3) this).aClass201ArrayArray9967 != null)
	    method16241(i, i_186_, ((Class189) class189).aBool2217, class189,
			((Class189) class189).aClass155_2223,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211,
			((Class189) class189).aFloatArray2251,
			((Class189) class189).aFloatArray2252,
			((Class189) class189).aFloatArray2250, i_187_);
	else if (((Class166_Sub3) this).aClass182ArrayArray9975 != null)
	    method16249(i, i_186_, ((Class189) class189).aClass155_2223,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211,
			((Class189) class189).aFloatArray2251,
			((Class189) class189).aFloatArray2252,
			((Class189) class189).aFloatArray2250, i_187_);
	else if (((Class166_Sub3) this).aClass143ArrayArray9979 != null)
	    method16248(i, i_186_, ((Class189) class189).aBool2217, class189,
			((Class189) class189).aClass155_2223,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211,
			((Class189) class189).aFloatArray2251,
			((Class189) class189).aFloatArray2252,
			((Class189) class189).aFloatArray2250, i_187_);
    }
    
    public void method3558(int i, int i_188_, int i_189_) {
	i = Math.min(((Class166_Sub3) this).aByteArrayArray9991.length - 1,
		     Math.max(0, i));
	i_188_ = Math.min((((Class166_Sub3) this).aByteArrayArray9991[i].length
			   - 1),
			  Math.max(0, i_188_));
	if (((Class166_Sub3) this).aByteArrayArray9991[i][i_188_] < i_189_)
	    ((Class166_Sub3) this).aByteArrayArray9991[i][i_188_]
		= (byte) i_189_;
    }
    
    void method16241(int i, int i_190_, boolean bool, Class189 class189,
		     Class155 class155, float[] fs, float[] fs_191_,
		     float[] fs_192_, float[] fs_193_, float[] fs_194_,
		     int i_195_) {
	Class201 class201
	    = ((Class166_Sub3) this).aClass201ArrayArray9967[i][i_190_];
	if (class201 != null) {
	    if ((((Class201) class201).aByte2409 & 0x2) == 0) {
		if (i_195_ != 0) {
		    if ((((Class201) class201).aByte2409 & 0x4) != 0) {
			if ((i_195_ & 0x1) != 0)
			    return;
		    } else if ((i_195_ & 0x2) != 0)
			return;
		}
		int i_196_ = i * (anInt2053 * 2039042417);
		int i_197_ = i_196_ + anInt2053 * 2039042417;
		int i_198_ = i_190_ * (anInt2053 * 2039042417);
		int i_199_ = i_198_ + anInt2053 * 2039042417;
		float f = 0.0F;
		float f_200_ = 0.0F;
		float f_201_ = 0.0F;
		float f_202_ = 0.0F;
		float f_203_;
		float f_204_;
		float f_205_;
		float f_206_;
		float f_207_;
		float f_208_;
		float f_209_;
		float f_210_;
		float f_211_;
		float f_212_;
		float f_213_;
		float f_214_;
		float f_215_;
		float f_216_;
		float f_217_;
		float f_218_;
		if ((((Class201) class201).aByte2409 & 0x1) != 0 && !bool) {
		    int i_219_ = anIntArrayArray2051[i][i_190_];
		    float f_220_
			= ((Class166_Sub3) this).aFloat9980 * (float) i_219_;
		    float f_221_
			= ((Class166_Sub3) this).aFloat9989 * (float) i_219_;
		    float f_222_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_196_)
				       + f_220_
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_198_)));
		    f_203_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_196_)
				 + f_221_
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_198_)));
		    if (f_222_ < -f_203_)
			return;
		    float f_223_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_197_)
				       + f_220_
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_198_)));
		    f_204_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_197_)
				 + f_221_
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_198_)));
		    if (f_223_ < -f_204_)
			return;
		    float f_224_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_197_)
				       + f_220_
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_199_)));
		    f_205_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_197_)
				 + f_221_
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_199_)));
		    if (f_224_ < -f_205_)
			return;
		    float f_225_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_196_)
				       + f_220_
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_199_)));
		    f_206_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_196_)
				 + f_221_
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_199_)));
		    if (f_225_ < -f_206_)
			return;
		    f_207_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_222_
				 / f_203_));
		    f_208_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_223_
				 / f_204_));
		    f_209_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_224_
				 / f_205_));
		    f_210_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_225_
				 / f_206_));
		    if (((Class189) class189).aBool2209) {
			float f_226_
			    = f_222_ - ((Class189) class189).aFloat2213;
			if (f_226_ > 0.0F) {
			    f = f_226_ / ((Class189) class189).aFloat2214;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_226_ = f_223_ - ((Class189) class189).aFloat2213;
			if (f_226_ > 0.0F) {
			    f_200_ = f_226_ / ((Class189) class189).aFloat2214;
			    if (f_200_ > 1.0F)
				f_200_ = 1.0F;
			}
			f_226_ = f_224_ - ((Class189) class189).aFloat2213;
			if (f_226_ > 0.0F) {
			    f_201_ = f_226_ / ((Class189) class189).aFloat2214;
			    if (f_201_ > 1.0F)
				f_201_ = 1.0F;
			}
			f_226_ = f_225_ - ((Class189) class189).aFloat2213;
			if (f_226_ > 0.0F) {
			    f_202_ = f_226_ / ((Class189) class189).aFloat2214;
			    if (f_202_ > 1.0F)
				f_202_ = 1.0F;
			}
		    }
		    float f_227_
			= ((Class166_Sub3) this).aFloat9978 * (float) i_219_;
		    float f_228_
			= ((Class166_Sub3) this).aFloat9965 * (float) i_219_;
		    float f_229_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_196_)
				       + f_227_
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_198_)));
		    f_211_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_229_
				 / f_203_));
		    float f_230_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_196_)
				       + f_228_
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_198_)));
		    f_212_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_230_
				 / f_203_));
		    float f_231_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_197_)
				       + f_227_
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_198_)));
		    f_213_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_231_
				 / f_204_));
		    float f_232_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_197_)
				       + f_228_
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_198_)));
		    f_214_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_232_
				 / f_204_));
		    float f_233_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_197_)
				       + f_227_
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_199_)));
		    f_215_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_233_
				 / f_205_));
		    float f_234_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_197_)
				       + f_228_
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_199_)));
		    f_216_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_234_
				 / f_205_));
		    float f_235_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_196_)
				       + f_227_
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_199_)));
		    f_217_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_235_
				 / f_206_));
		    float f_236_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_196_)
				       + f_228_
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_199_)));
		    f_218_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_236_
				 / f_206_));
		} else {
		    int i_237_ = anIntArrayArray2051[i][i_190_];
		    int i_238_ = anIntArrayArray2051[i + 1][i_190_];
		    int i_239_ = anIntArrayArray2051[i + 1][i_190_ + 1];
		    int i_240_ = anIntArrayArray2051[i][i_190_ + 1];
		    float f_241_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_196_)
				       + (((Class166_Sub3) this).aFloat9980
					  * (float) i_237_)
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_198_)));
		    f_203_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_196_)
				 + (((Class166_Sub3) this).aFloat9989
				    * (float) i_237_)
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_198_)));
		    if (f_241_ < -f_203_)
			return;
		    float f_242_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_197_)
				       + (((Class166_Sub3) this).aFloat9980
					  * (float) i_238_)
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_198_)));
		    f_204_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_197_)
				 + (((Class166_Sub3) this).aFloat9989
				    * (float) i_238_)
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_198_)));
		    if (f_242_ < -f_204_)
			return;
		    float f_243_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_197_)
				       + (((Class166_Sub3) this).aFloat9980
					  * (float) i_239_)
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_199_)));
		    f_205_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_197_)
				 + (((Class166_Sub3) this).aFloat9989
				    * (float) i_239_)
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_199_)));
		    if (f_243_ < -f_205_)
			return;
		    float f_244_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_196_)
				       + (((Class166_Sub3) this).aFloat9980
					  * (float) i_240_)
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_199_)));
		    f_206_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_196_)
				 + (((Class166_Sub3) this).aFloat9989
				    * (float) i_240_)
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_199_)));
		    if (f_244_ < -f_206_)
			return;
		    f_207_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_241_
				 / f_203_));
		    f_208_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_242_
				 / f_204_));
		    f_209_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_243_
				 / f_205_));
		    f_210_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_244_
				 / f_206_));
		    if (bool) {
			float f_245_
			    = f_241_ - ((Class189) class189).aFloat2213;
			if (f_245_ > 0.0F) {
			    f_245_ /= ((Class189) class189).aFloat2214;
			    if (f_245_ > 1.0F)
				f_245_ = 1.0F;
			    f = f_245_;
			    int i_246_ = (int) ((float) (((Class201) class201)
							 .aShort2403)
						* f_245_);
			    if (i_246_ > 0)
				i_237_ -= i_246_;
			}
			f_245_ = f_242_ - ((Class189) class189).aFloat2213;
			if (f_245_ > 0.0F) {
			    f_245_ /= ((Class189) class189).aFloat2214;
			    if (f_245_ > 1.0F)
				f_245_ = 1.0F;
			    f_200_ = f_245_;
			    int i_247_ = (int) ((float) (((Class201) class201)
							 .aShort2407)
						* f_245_);
			    if (i_247_ > 0)
				i_238_ -= i_247_;
			}
			f_245_ = f_243_ - ((Class189) class189).aFloat2213;
			if (f_245_ > 0.0F) {
			    f_245_ /= ((Class189) class189).aFloat2214;
			    if (f_245_ > 1.0F)
				f_245_ = 1.0F;
			    f_201_ = f_245_;
			    int i_248_ = (int) ((float) (((Class201) class201)
							 .aShort2406)
						* f_245_);
			    if (i_248_ > 0)
				i_239_ -= i_248_;
			}
			f_245_ = f_244_ - ((Class189) class189).aFloat2213;
			if (f_245_ > 0.0F) {
			    f_245_ /= ((Class189) class189).aFloat2214;
			    if (f_245_ > 1.0F)
				f_245_ = 1.0F;
			    f_202_ = f_245_;
			    int i_249_ = (int) ((float) (((Class201) class201)
							 .aShort2402)
						* f_245_);
			    if (i_249_ > 0)
				i_240_ -= i_249_;
			}
		    } else if (((Class189) class189).aBool2209) {
			float f_250_
			    = f_241_ - ((Class189) class189).aFloat2213;
			if (f_250_ > 0.0F) {
			    f = f_250_ / ((Class189) class189).aFloat2214;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_250_ = f_242_ - ((Class189) class189).aFloat2213;
			if (f_250_ > 0.0F) {
			    f_200_ = f_250_ / ((Class189) class189).aFloat2214;
			    if (f_200_ > 1.0F)
				f_200_ = 1.0F;
			}
			f_250_ = f_243_ - ((Class189) class189).aFloat2213;
			if (f_250_ > 0.0F) {
			    f_201_ = f_250_ / ((Class189) class189).aFloat2214;
			    if (f_201_ > 1.0F)
				f_201_ = 1.0F;
			}
			f_250_ = f_244_ - ((Class189) class189).aFloat2213;
			if (f_250_ > 0.0F) {
			    f_202_ = f_250_ / ((Class189) class189).aFloat2214;
			    if (f_202_ > 1.0F)
				f_202_ = 1.0F;
			}
		    }
		    float f_251_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_196_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_237_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_198_)));
		    f_211_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_251_
				 / f_203_));
		    float f_252_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_196_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_237_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_198_)));
		    f_212_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_252_
				 / f_203_));
		    float f_253_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_197_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_238_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_198_)));
		    f_213_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_253_
				 / f_204_));
		    float f_254_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_197_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_238_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_198_)));
		    f_214_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_254_
				 / f_204_));
		    float f_255_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_197_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_239_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_199_)));
		    f_215_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_255_
				 / f_205_));
		    float f_256_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_197_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_239_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_199_)));
		    f_216_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_256_
				 / f_205_));
		    float f_257_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_196_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_240_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_199_)));
		    f_217_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_257_
				 / f_206_));
		    float f_258_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_196_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_240_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_199_)));
		    f_218_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_258_
				 / f_206_));
		}
		Class101 class101 = null;
		int i_259_ = -1;
		if (((Class201) class201).aShort2411 != -1) {
		    class101 = (((Class166_Sub3) this).aClass103_Sub2_9962
				    .aClass107_1458.method2680
				(((Class201) class201).aShort2411 & 0xffff,
				 883049302));
		    i_259_ = class101.anInt1403 * 218388063;
		}
		boolean bool_260_
		    = class101 != null && method16256(class101.aByte1427);
		float f_261_ = f_200_ + f_201_ + f_202_;
		if (((f_215_ - f_217_) * (f_214_ - f_218_)
		     - (f_216_ - f_218_) * (f_213_ - f_217_))
		    > 0.0F) {
		    ((Class155) class155).aBool1748
			= (f_215_ < 0.0F || f_217_ < 0.0F || f_213_ < 0.0F
			   || f_215_ > (float) ((Class155) class155).anInt1733
			   || f_217_ > (float) ((Class155) class155).anInt1733
			   || (f_213_
			       > (float) ((Class155) class155).anInt1733));
		    if (f_261_ < 3.0F) {
			if (f_261_ > 0.0F) {
			    if (i_259_ >= 0) {
				int i_262_ = -16777216;
				if (bool_260_)
				    i_262_ = -1694498816;
				class155.method3384
				    (true, true, false, f_216_, f_218_, f_214_,
				     f_215_, f_217_, f_213_, f_209_, f_210_,
				     f_208_, f_205_, f_206_, f_204_, 1.0F,
				     0.0F, 1.0F, 1.0F, 1.0F, 0.0F,
				     i_262_ | (((Class201) class201).anInt2404
					       & 0xffffff),
				     i_262_ | (((Class201) class201).anInt2405
					       & 0xffffff),
				     i_262_ | (((Class201) class201).anInt2401
					       & 0xffffff),
				     (((Class189) class189).anInt2215
				      * -338296791),
				     f_201_ * 255.0F, f_202_ * 255.0F,
				     f_200_ * 255.0F,
				     ((Class201) class201).aShort2411 & 0xffff,
				     i_259_);
			    } else {
				if (bool_260_)
				    ((Class155) class155).anInt1723 = 100;
				class155.method3385
				    (true, true, false, f_216_, f_218_, f_214_,
				     f_215_, f_217_, f_213_, f_209_, f_210_,
				     f_208_,
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2404,
				       ((int) (f_201_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       2070734410)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2405,
				       ((int) (f_202_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       1388895577)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2401,
				       ((int) (f_200_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       1257404619)));
				((Class155) class155).anInt1723 = 0;
			    }
			} else if (i_259_ >= 0) {
			    int i_263_ = -16777216;
			    if (bool_260_)
				i_263_ = -1694498816;
			    class155.method3384
				(true, true, false, f_216_, f_218_, f_214_,
				 f_215_, f_217_, f_213_, f_209_, f_210_,
				 f_208_, f_205_, f_206_, f_204_, 1.0F, 0.0F,
				 1.0F, 1.0F, 1.0F, 0.0F,
				 i_263_ | (((Class201) class201).anInt2404
					   & 0xffffff),
				 i_263_ | (((Class201) class201).anInt2405
					   & 0xffffff),
				 i_263_ | (((Class201) class201).anInt2401
					   & 0xffffff),
				 0, 0.0F, 0.0F, 0.0F,
				 ((Class201) class201).aShort2411 & 0xffff,
				 i_259_);
			} else {
			    if (bool_260_)
				((Class155) class155).anInt1723 = 100;
			    class155.method3385
				(true, true, false, f_216_, f_218_, f_214_,
				 f_215_, f_217_, f_213_, f_209_, f_210_,
				 f_208_, ((Class201) class201).anInt2404,
				 ((Class201) class201).anInt2405,
				 ((Class201) class201).anInt2401);
			    ((Class155) class155).anInt1723 = 0;
			}
		    } else
			class155.method3377(true, true, false, f_216_, f_218_,
					    f_214_, f_215_, f_217_, f_213_,
					    f_209_, f_210_, f_208_,
					    (((Class189) class189).anInt2215
					     * -338296791));
		}
		f_261_ = f + f_200_ + f_202_;
		if (((f_211_ - f_213_) * (f_218_ - f_214_)
		     - (f_212_ - f_214_) * (f_217_ - f_213_))
		    > 0.0F) {
		    ((Class155) class155).aBool1748
			= (f_211_ < 0.0F || f_213_ < 0.0F || f_217_ < 0.0F
			   || f_211_ > (float) ((Class155) class155).anInt1733
			   || f_213_ > (float) ((Class155) class155).anInt1733
			   || (f_217_
			       > (float) ((Class155) class155).anInt1733));
		    if (f_261_ < 3.0F) {
			if (bool_260_)
			    ((Class155) class155).anInt1723 = -1694498816;
			if (f_261_ > 0.0F) {
			    if (i_259_ >= 0) {
				int i_264_ = -16777216;
				if (bool_260_)
				    i_264_ = -1694498816;
				class155.method3384
				    (true, true, false, f_212_, f_214_, f_218_,
				     f_211_, f_213_, f_217_, f_207_, f_208_,
				     f_210_, f_203_, f_204_, f_206_, 0.0F,
				     1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
				     i_264_ | (((Class201) class201).anInt2410
					       & 0xffffff),
				     i_264_ | (((Class201) class201).anInt2401
					       & 0xffffff),
				     i_264_ | (((Class201) class201).anInt2405
					       & 0xffffff),
				     (((Class189) class189).anInt2215
				      * -338296791),
				     f * 255.0F, f_200_ * 255.0F,
				     f_202_ * 255.0F,
				     ((Class201) class201).aShort2411 & 0xffff,
				     i_259_);
			    } else {
				if (bool_260_)
				    ((Class155) class155).anInt1723 = 100;
				class155.method3385
				    (true, true, false, f_212_, f_214_, f_218_,
				     f_211_, f_213_, f_217_, f_207_, f_208_,
				     f_210_,
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2410,
				       ((int) (f * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       -1791548292)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2401,
				       ((int) (f_200_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       2130268989)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2405,
				       ((int) (f_202_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       -1285607293)));
				((Class155) class155).anInt1723 = 0;
			    }
			} else if (i_259_ >= 0) {
			    int i_265_ = -16777216;
			    if (bool_260_)
				i_265_ = -1694498816;
			    class155.method3384
				(true, true, false, f_212_, f_214_, f_218_,
				 f_211_, f_213_, f_217_, f_207_, f_208_,
				 f_210_, f_203_, f_204_, f_206_, 0.0F, 1.0F,
				 1.0F, 0.0F, 0.0F, 1.0F,
				 i_265_ | (((Class201) class201).anInt2410
					   & 0xffffff),
				 i_265_ | (((Class201) class201).anInt2401
					   & 0xffffff),
				 i_265_ | (((Class201) class201).anInt2405
					   & 0xffffff),
				 0, 0.0F, 0.0F, 0.0F,
				 ((Class201) class201).aShort2411 & 0xffff,
				 i_259_);
			} else {
			    if (bool_260_)
				((Class155) class155).anInt1723 = 100;
			    class155.method3385
				(true, true, false, f_212_, f_214_, f_218_,
				 f_211_, f_213_, f_217_, f_207_, f_208_,
				 f_210_, ((Class201) class201).anInt2410,
				 ((Class201) class201).anInt2401,
				 ((Class201) class201).anInt2405);
			    ((Class155) class155).anInt1723 = 0;
			}
		    } else
			class155.method3377(true, true, false, f_212_, f_214_,
					    f_218_, f_211_, f_213_, f_217_,
					    f_207_, f_208_, f_210_,
					    (((Class189) class189).anInt2215
					     * -338296791));
		}
	    }
	} else {
	    Class183 class183
		= ((Class166_Sub3) this).aClass183ArrayArray9969[i][i_190_];
	    if (class183 != null) {
		if (i_195_ != 0) {
		    if ((((Class183) class183).aByte2157 & 0x4) != 0) {
			if ((i_195_ & 0x1) != 0)
			    return;
		    } else if ((i_195_ & 0x2) != 0)
			return;
		}
		for (int i_266_ = 0; i_266_ < ((Class183) class183).aShort2154;
		     i_266_++) {
		    int i_267_ = (((Class183) class183).aShortArray2156[i_266_]
				  + (i << anInt2054 * -122333825));
		    int i_268_ = ((Class183) class183).aShortArray2153[i_266_];
		    int i_269_ = (((Class183) class183).aShortArray2158[i_266_]
				  + (i_190_ << anInt2054 * -122333825));
		    float f = (((Class166_Sub3) this).aFloat9988
			       + ((((Class166_Sub3) this).aFloat9976
				   * (float) i_267_)
				  + (((Class166_Sub3) this).aFloat9980
				     * (float) i_268_)
				  + (((Class166_Sub3) this).aFloat9984
				     * (float) i_269_)));
		    float f_270_ = (((Class166_Sub3) this).aFloat9974
				    + ((((Class166_Sub3) this).aFloat9977
					* (float) i_267_)
				       + (((Class166_Sub3) this).aFloat9989
					  * (float) i_268_)
				       + (((Class166_Sub3) this).aFloat9985
					  * (float) i_269_)));
		    if (f < -f_270_)
			return;
		    float f_271_
			= (((Class155) class155).aFloat1720
			   + ((Class155) class155).aFloat1732 * f / f_270_);
		    fs_194_[i_266_] = 0.0F;
		    if (bool) {
			float f_272_ = f - ((Class189) class189).aFloat2213;
			if (f_272_ > 0.0F) {
			    f_272_ /= ((Class189) class189).aFloat2214;
			    if (f_272_ > 1.0F)
				f_272_ = 1.0F;
			    fs_194_[i_266_] = f_272_;
			    int i_273_
				= (int) ((float) (((Class183) class183)
						  .aShortArray2159[i_266_])
					 * f_272_);
			    if (i_273_ > 0)
				i_268_ -= i_273_;
			}
		    } else if (((Class189) class189).aBool2209) {
			float f_274_ = f - ((Class189) class189).aFloat2213;
			if (f_274_ > 0.0F) {
			    fs_194_[i_266_]
				= f_274_ / ((Class189) class189).aFloat2214;
			    if (fs_194_[i_266_] > 1.0F)
				fs_194_[i_266_] = 1.0F;
			}
		    }
		    float f_275_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_267_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_268_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_269_)));
		    float f_276_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_267_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_268_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_269_)));
		    fs[i_266_] = (((Class155) class155).aFloat1727
				  + (((Class155) class155).aFloat1728 * f_275_
				     / f_270_));
		    fs_191_[i_266_] = (((Class155) class155).aFloat1731
				       + (((Class155) class155).aFloat1729
					  * f_276_ / f_270_));
		    fs_192_[i_266_] = f_271_;
		    fs_193_[i_266_] = f_270_;
		}
		if (((Class183) class183).aShortArray2161 != null) {
		    for (int i_277_ = 0;
			 i_277_ < ((Class183) class183).aShort2160; i_277_++) {
			int i_278_ = i_277_ * 3;
			int i_279_ = i_278_ + 1;
			int i_280_ = i_279_ + 1;
			float f = fs[i_278_];
			float f_281_ = fs[i_279_];
			float f_282_ = fs[i_280_];
			float f_283_ = fs_191_[i_278_];
			float f_284_ = fs_191_[i_279_];
			float f_285_ = fs_191_[i_280_];
			float f_286_ = (fs_194_[i_278_] + fs_194_[i_279_]
					+ fs_194_[i_280_]);
			if (((f - f_281_) * (f_285_ - f_284_)
			     - (f_283_ - f_284_) * (f_282_ - f_281_))
			    > 0.0F) {
			    ((Class155) class155).aBool1748
				= (f < 0.0F || f_281_ < 0.0F || f_282_ < 0.0F
				   || f > (float) (((Class155) class155)
						   .anInt1733)
				   || f_281_ > (float) (((Class155) class155)
							.anInt1733)
				   || f_282_ > (float) (((Class155) class155)
							.anInt1733));
			    Class101 class101 = null;
			    int i_287_ = -1;
			    if (((Class183) class183).aShortArray2161[i_277_]
				!= -1) {
				class101
				    = (((Class166_Sub3) this)
					   .aClass103_Sub2_9962.aClass107_1458
					   .method2680
				       ((((Class183) class183).aShortArray2161
					 [i_277_]) & 0xffff,
					1448585607));
				i_287_ = class101.anInt1403 * 218388063;
			    }
			    if (f_286_ < 3.0F) {
				if (f_286_ > 0.0F) {
				    if (i_287_ != -1) {
					int i_288_ = -16777216;
					if (i_287_ != -1
					    && method16256(class101.aByte1427))
					    i_288_ = -1694498816;
					class155.method3384
					    (true, true, false, f_283_, f_284_,
					     f_285_, f, f_281_, f_282_,
					     fs_192_[i_278_], fs_192_[i_279_],
					     fs_192_[i_280_], fs_193_[i_278_],
					     fs_193_[i_279_], fs_193_[i_280_],
					     ((float) (((Class183) class183)
						       .aShortArray2156
						       [i_278_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2156
						       [i_279_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2156
						       [i_280_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2158
						       [i_278_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2158
						       [i_279_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2158
						       [i_280_])
					      / (float) (anInt2053
							 * 2039042417)),
					     i_288_ | (((Class183) class183)
						       .anIntArray2163
						       [i_278_]) & 0xffffff,
					     i_288_ | (((Class183) class183)
						       .anIntArray2163
						       [i_279_]) & 0xffffff,
					     i_288_ | (((Class183) class183)
						       .anIntArray2163
						       [i_280_]) & 0xffffff,
					     (((Class189) class189).anInt2215
					      * -338296791),
					     fs_194_[i_278_] * 255.0F,
					     fs_194_[i_279_] * 255.0F,
					     fs_194_[i_280_] * 255.0F,
					     ((((Class183) class183)
					       .aShortArray2161[i_277_])
					      & 0xffff),
					     i_287_);
				    } else if (((((Class183) class183)
						 .anIntArray2163[i_278_])
						& 0xffffff)
					       != 0) {
					if (i_287_ != -1
					    && method16256(class101.aByte1427))
					    ((Class155) class155).anInt1723
						= -1694498816;
					class155.method3385
					    (true, true, false, f_283_, f_284_,
					     f_285_, f, f_281_, f_282_,
					     fs_192_[i_278_], fs_192_[i_279_],
					     fs_192_[i_280_],
					     (Class241_Sub18_Sub1.method17140
					      ((((Class183) class183)
						.anIntArray2163[i_278_]),
					       ((int) (fs_194_[i_278_]
						       * 255.0F) << 24
						| (((Class189) class189)
						   .anInt2215) * -338296791),
					       1964621873)),
					     (Class241_Sub18_Sub1.method17140
					      ((((Class183) class183)
						.anIntArray2163[i_279_]),
					       ((int) (fs_194_[i_279_]
						       * 255.0F) << 24
						| (((Class189) class189)
						   .anInt2215) * -338296791),
					       1912551873)),
					     (Class241_Sub18_Sub1.method17140
					      ((((Class183) class183)
						.anIntArray2163[i_280_]),
					       ((int) (fs_194_[i_280_]
						       * 255.0F) << 24
						| (((Class189) class189)
						   .anInt2215) * -338296791),
					       1041891561)));
					((Class155) class155).anInt1723 = 0;
				    }
				} else if (i_287_ != -1) {
				    int i_289_ = -16777216;
				    if (i_287_ != -1
					&& method16256(class101.aByte1427))
					i_289_ = -1694498816;
				    class155.method3384
					(true, true, false, f_283_, f_284_,
					 f_285_, f, f_281_, f_282_,
					 fs_192_[i_278_], fs_192_[i_279_],
					 fs_192_[i_280_], fs_193_[i_278_],
					 fs_193_[i_279_], fs_193_[i_280_],
					 ((float) (((Class183) class183)
						   .aShortArray2156[i_278_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2156[i_279_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2156[i_280_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2158[i_278_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2158[i_279_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2158[i_280_])
					  / (float) (anInt2053 * 2039042417)),
					 i_289_ | ((((Class183) class183)
						    .anIntArray2163[i_278_])
						   & 0xffffff),
					 i_289_ | ((((Class183) class183)
						    .anIntArray2163[i_279_])
						   & 0xffffff),
					 i_289_ | ((((Class183) class183)
						    .anIntArray2163[i_280_])
						   & 0xffffff),
					 0, 0.0F, 0.0F, 0.0F,
					 (((Class183) class183).aShortArray2161
					  [i_277_]) & 0xffff,
					 i_287_);
				} else if (((((Class183) class183)
					     .anIntArray2163[i_278_])
					    & 0xffffff)
					   != 0) {
				    if (i_287_ != -1
					&& method16256(class101.aByte1427))
					((Class155) class155).anInt1723
					    = -1694498816;
				    class155.method3385(true, true, false,
							f_283_, f_284_, f_285_,
							f, f_281_, f_282_,
							fs_192_[i_278_],
							fs_192_[i_279_],
							fs_192_[i_280_],
							(((Class183) class183)
							 .anIntArray2163
							 [i_278_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_279_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_280_]));
				    ((Class155) class155).anInt1723 = 0;
				}
			    } else
				class155.method3377(true, true, false, f_283_,
						    f_284_, f_285_, f, f_281_,
						    f_282_, fs_192_[i_278_],
						    fs_192_[i_279_],
						    fs_192_[i_280_],
						    (((Class189) class189)
						     .anInt2215) * -338296791);
			}
		    }
		} else {
		    for (int i_290_ = 0;
			 i_290_ < ((Class183) class183).aShort2160; i_290_++) {
			int i_291_ = i_290_ * 3;
			int i_292_ = i_291_ + 1;
			int i_293_ = i_292_ + 1;
			float f = fs[i_291_];
			float f_294_ = fs[i_292_];
			float f_295_ = fs[i_293_];
			float f_296_ = fs_191_[i_291_];
			float f_297_ = fs_191_[i_292_];
			float f_298_ = fs_191_[i_293_];
			float f_299_ = (fs_194_[i_291_] + fs_194_[i_292_]
					+ fs_194_[i_293_]);
			if (((f - f_294_) * (f_298_ - f_297_)
			     - (f_296_ - f_297_) * (f_295_ - f_294_))
			    > 0.0F) {
			    ((Class155) class155).aBool1748
				= (f < 0.0F || f_294_ < 0.0F || f_295_ < 0.0F
				   || f > (float) (((Class155) class155)
						   .anInt1733)
				   || f_294_ > (float) (((Class155) class155)
							.anInt1733)
				   || f_295_ > (float) (((Class155) class155)
							.anInt1733));
			    if (f_299_ < 3.0F) {
				if (f_299_ > 0.0F) {
				    if (((((Class183) class183).anIntArray2163
					  [i_291_])
					 & 0xffffff)
					!= 0)
					class155.method3385
					    (true, true, false, f_296_, f_297_,
					     f_298_, f, f_294_, f_295_,
					     fs_192_[i_291_], fs_192_[i_292_],
					     fs_192_[i_293_],
					     (Class54.method1306
					      ((((Class183) class183)
						.anIntArray2163[i_291_]),
					       (((Class189) class189).anInt2215
						* -338296791),
					       fs_194_[i_291_] * 255.0F,
					       1372221625)),
					     (Class54.method1306
					      ((((Class183) class183)
						.anIntArray2163[i_292_]),
					       (((Class189) class189).anInt2215
						* -338296791),
					       fs_194_[i_292_] * 255.0F,
					       1372221625)),
					     (Class54.method1306
					      ((((Class183) class183)
						.anIntArray2163[i_293_]),
					       (((Class189) class189).anInt2215
						* -338296791),
					       fs_194_[i_293_] * 255.0F,
					       1372221625)));
				} else if (((((Class183) class183)
					     .anIntArray2163[i_291_])
					    & 0xffffff)
					   != 0)
				    class155.method3385(true, true, false,
							f_296_, f_297_, f_298_,
							f, f_294_, f_295_,
							fs_192_[i_291_],
							fs_192_[i_292_],
							fs_192_[i_293_],
							(((Class183) class183)
							 .anIntArray2163
							 [i_291_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_292_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_293_]));
			    } else
				class155.method3377(true, true, false, f_296_,
						    f_297_, f_298_, f, f_294_,
						    f_295_, fs_192_[i_291_],
						    fs_192_[i_292_],
						    fs_192_[i_293_],
						    (((Class189) class189)
						     .anInt2215) * -338296791);
			}
		    }
		}
	    }
	}
    }
    
    void method16242(int i, int i_300_, int i_301_) {
	Class189 class189 = ((Class166_Sub3) this).aClass103_Sub2_9962
				.method15377(Thread.currentThread());
	((Class155) ((Class189) class189).aClass155_2223).anInt1723 = 0;
	if (((Class166_Sub3) this).aClass201ArrayArray9967 != null)
	    method16241(i, i_300_, ((Class189) class189).aBool2217, class189,
			((Class189) class189).aClass155_2223,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211,
			((Class189) class189).aFloatArray2251,
			((Class189) class189).aFloatArray2252,
			((Class189) class189).aFloatArray2250, i_301_);
	else if (((Class166_Sub3) this).aClass182ArrayArray9975 != null)
	    method16249(i, i_300_, ((Class189) class189).aClass155_2223,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211,
			((Class189) class189).aFloatArray2251,
			((Class189) class189).aFloatArray2252,
			((Class189) class189).aFloatArray2250, i_301_);
	else if (((Class166_Sub3) this).aClass143ArrayArray9979 != null)
	    method16248(i, i_300_, ((Class189) class189).aBool2217, class189,
			((Class189) class189).aClass155_2223,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211,
			((Class189) class189).aFloatArray2251,
			((Class189) class189).aFloatArray2252,
			((Class189) class189).aFloatArray2250, i_301_);
    }
    
    static int method16243(int i, int i_302_) {
	int i_303_ = (i & 0xff0000) * i_302_ >> 23;
	if (i_303_ < 2)
	    i_303_ = 2;
	else if (i_303_ > 253)
	    i_303_ = 253;
	int i_304_ = (i & 0xff00) * i_302_ >> 15;
	if (i_304_ < 2)
	    i_304_ = 2;
	else if (i_304_ > 253)
	    i_304_ = 253;
	int i_305_ = (i & 0xff) * i_302_ >> 7;
	if (i_305_ < 2)
	    i_305_ = 2;
	else if (i_305_ > 253)
	    i_305_ = 253;
	return i_303_ << 16 | i_304_ << 8 | i_305_;
    }
    
    void method16244(int i, int i_306_, boolean bool, Class189 class189,
		     Class155 class155, float[] fs, float[] fs_307_,
		     float[] fs_308_, float[] fs_309_, float[] fs_310_,
		     int i_311_) {
	Class201 class201
	    = ((Class166_Sub3) this).aClass201ArrayArray9967[i][i_306_];
	if (class201 != null) {
	    if ((((Class201) class201).aByte2409 & 0x2) == 0) {
		if (i_311_ != 0) {
		    if ((((Class201) class201).aByte2409 & 0x4) != 0) {
			if ((i_311_ & 0x1) != 0)
			    return;
		    } else if ((i_311_ & 0x2) != 0)
			return;
		}
		int i_312_ = i * (anInt2053 * 2039042417);
		int i_313_ = i_312_ + anInt2053 * 2039042417;
		int i_314_ = i_306_ * (anInt2053 * 2039042417);
		int i_315_ = i_314_ + anInt2053 * 2039042417;
		float f = 0.0F;
		float f_316_ = 0.0F;
		float f_317_ = 0.0F;
		float f_318_ = 0.0F;
		float f_319_;
		float f_320_;
		float f_321_;
		float f_322_;
		float f_323_;
		float f_324_;
		float f_325_;
		float f_326_;
		float f_327_;
		float f_328_;
		float f_329_;
		float f_330_;
		float f_331_;
		float f_332_;
		float f_333_;
		float f_334_;
		if ((((Class201) class201).aByte2409 & 0x1) != 0 && !bool) {
		    int i_335_ = anIntArrayArray2051[i][i_306_];
		    float f_336_
			= ((Class166_Sub3) this).aFloat9980 * (float) i_335_;
		    float f_337_
			= ((Class166_Sub3) this).aFloat9989 * (float) i_335_;
		    float f_338_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_312_)
				       + f_336_
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_314_)));
		    f_319_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_312_)
				 + f_337_
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_314_)));
		    if (f_338_ < -f_319_)
			return;
		    float f_339_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_313_)
				       + f_336_
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_314_)));
		    f_320_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_313_)
				 + f_337_
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_314_)));
		    if (f_339_ < -f_320_)
			return;
		    float f_340_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_313_)
				       + f_336_
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_315_)));
		    f_321_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_313_)
				 + f_337_
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_315_)));
		    if (f_340_ < -f_321_)
			return;
		    float f_341_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_312_)
				       + f_336_
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_315_)));
		    f_322_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_312_)
				 + f_337_
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_315_)));
		    if (f_341_ < -f_322_)
			return;
		    f_323_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_338_
				 / f_319_));
		    f_324_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_339_
				 / f_320_));
		    f_325_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_340_
				 / f_321_));
		    f_326_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_341_
				 / f_322_));
		    if (((Class189) class189).aBool2209) {
			float f_342_
			    = f_338_ - ((Class189) class189).aFloat2213;
			if (f_342_ > 0.0F) {
			    f = f_342_ / ((Class189) class189).aFloat2214;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_342_ = f_339_ - ((Class189) class189).aFloat2213;
			if (f_342_ > 0.0F) {
			    f_316_ = f_342_ / ((Class189) class189).aFloat2214;
			    if (f_316_ > 1.0F)
				f_316_ = 1.0F;
			}
			f_342_ = f_340_ - ((Class189) class189).aFloat2213;
			if (f_342_ > 0.0F) {
			    f_317_ = f_342_ / ((Class189) class189).aFloat2214;
			    if (f_317_ > 1.0F)
				f_317_ = 1.0F;
			}
			f_342_ = f_341_ - ((Class189) class189).aFloat2213;
			if (f_342_ > 0.0F) {
			    f_318_ = f_342_ / ((Class189) class189).aFloat2214;
			    if (f_318_ > 1.0F)
				f_318_ = 1.0F;
			}
		    }
		    float f_343_
			= ((Class166_Sub3) this).aFloat9978 * (float) i_335_;
		    float f_344_
			= ((Class166_Sub3) this).aFloat9965 * (float) i_335_;
		    float f_345_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_312_)
				       + f_343_
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_314_)));
		    f_327_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_345_
				 / f_319_));
		    float f_346_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_312_)
				       + f_344_
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_314_)));
		    f_328_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_346_
				 / f_319_));
		    float f_347_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_313_)
				       + f_343_
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_314_)));
		    f_329_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_347_
				 / f_320_));
		    float f_348_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_313_)
				       + f_344_
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_314_)));
		    f_330_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_348_
				 / f_320_));
		    float f_349_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_313_)
				       + f_343_
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_315_)));
		    f_331_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_349_
				 / f_321_));
		    float f_350_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_313_)
				       + f_344_
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_315_)));
		    f_332_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_350_
				 / f_321_));
		    float f_351_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_312_)
				       + f_343_
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_315_)));
		    f_333_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_351_
				 / f_322_));
		    float f_352_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_312_)
				       + f_344_
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_315_)));
		    f_334_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_352_
				 / f_322_));
		} else {
		    int i_353_ = anIntArrayArray2051[i][i_306_];
		    int i_354_ = anIntArrayArray2051[i + 1][i_306_];
		    int i_355_ = anIntArrayArray2051[i + 1][i_306_ + 1];
		    int i_356_ = anIntArrayArray2051[i][i_306_ + 1];
		    float f_357_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_312_)
				       + (((Class166_Sub3) this).aFloat9980
					  * (float) i_353_)
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_314_)));
		    f_319_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_312_)
				 + (((Class166_Sub3) this).aFloat9989
				    * (float) i_353_)
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_314_)));
		    if (f_357_ < -f_319_)
			return;
		    float f_358_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_313_)
				       + (((Class166_Sub3) this).aFloat9980
					  * (float) i_354_)
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_314_)));
		    f_320_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_313_)
				 + (((Class166_Sub3) this).aFloat9989
				    * (float) i_354_)
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_314_)));
		    if (f_358_ < -f_320_)
			return;
		    float f_359_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_313_)
				       + (((Class166_Sub3) this).aFloat9980
					  * (float) i_355_)
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_315_)));
		    f_321_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_313_)
				 + (((Class166_Sub3) this).aFloat9989
				    * (float) i_355_)
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_315_)));
		    if (f_359_ < -f_321_)
			return;
		    float f_360_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_312_)
				       + (((Class166_Sub3) this).aFloat9980
					  * (float) i_356_)
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_315_)));
		    f_322_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_312_)
				 + (((Class166_Sub3) this).aFloat9989
				    * (float) i_356_)
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_315_)));
		    if (f_360_ < -f_322_)
			return;
		    f_323_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_357_
				 / f_319_));
		    f_324_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_358_
				 / f_320_));
		    f_325_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_359_
				 / f_321_));
		    f_326_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_360_
				 / f_322_));
		    if (bool) {
			float f_361_
			    = f_357_ - ((Class189) class189).aFloat2213;
			if (f_361_ > 0.0F) {
			    f_361_ /= ((Class189) class189).aFloat2214;
			    if (f_361_ > 1.0F)
				f_361_ = 1.0F;
			    f = f_361_;
			    int i_362_ = (int) ((float) (((Class201) class201)
							 .aShort2403)
						* f_361_);
			    if (i_362_ > 0)
				i_353_ -= i_362_;
			}
			f_361_ = f_358_ - ((Class189) class189).aFloat2213;
			if (f_361_ > 0.0F) {
			    f_361_ /= ((Class189) class189).aFloat2214;
			    if (f_361_ > 1.0F)
				f_361_ = 1.0F;
			    f_316_ = f_361_;
			    int i_363_ = (int) ((float) (((Class201) class201)
							 .aShort2407)
						* f_361_);
			    if (i_363_ > 0)
				i_354_ -= i_363_;
			}
			f_361_ = f_359_ - ((Class189) class189).aFloat2213;
			if (f_361_ > 0.0F) {
			    f_361_ /= ((Class189) class189).aFloat2214;
			    if (f_361_ > 1.0F)
				f_361_ = 1.0F;
			    f_317_ = f_361_;
			    int i_364_ = (int) ((float) (((Class201) class201)
							 .aShort2406)
						* f_361_);
			    if (i_364_ > 0)
				i_355_ -= i_364_;
			}
			f_361_ = f_360_ - ((Class189) class189).aFloat2213;
			if (f_361_ > 0.0F) {
			    f_361_ /= ((Class189) class189).aFloat2214;
			    if (f_361_ > 1.0F)
				f_361_ = 1.0F;
			    f_318_ = f_361_;
			    int i_365_ = (int) ((float) (((Class201) class201)
							 .aShort2402)
						* f_361_);
			    if (i_365_ > 0)
				i_356_ -= i_365_;
			}
		    } else if (((Class189) class189).aBool2209) {
			float f_366_
			    = f_357_ - ((Class189) class189).aFloat2213;
			if (f_366_ > 0.0F) {
			    f = f_366_ / ((Class189) class189).aFloat2214;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_366_ = f_358_ - ((Class189) class189).aFloat2213;
			if (f_366_ > 0.0F) {
			    f_316_ = f_366_ / ((Class189) class189).aFloat2214;
			    if (f_316_ > 1.0F)
				f_316_ = 1.0F;
			}
			f_366_ = f_359_ - ((Class189) class189).aFloat2213;
			if (f_366_ > 0.0F) {
			    f_317_ = f_366_ / ((Class189) class189).aFloat2214;
			    if (f_317_ > 1.0F)
				f_317_ = 1.0F;
			}
			f_366_ = f_360_ - ((Class189) class189).aFloat2213;
			if (f_366_ > 0.0F) {
			    f_318_ = f_366_ / ((Class189) class189).aFloat2214;
			    if (f_318_ > 1.0F)
				f_318_ = 1.0F;
			}
		    }
		    float f_367_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_312_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_353_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_314_)));
		    f_327_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_367_
				 / f_319_));
		    float f_368_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_312_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_353_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_314_)));
		    f_328_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_368_
				 / f_319_));
		    float f_369_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_313_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_354_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_314_)));
		    f_329_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_369_
				 / f_320_));
		    float f_370_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_313_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_354_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_314_)));
		    f_330_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_370_
				 / f_320_));
		    float f_371_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_313_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_355_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_315_)));
		    f_331_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_371_
				 / f_321_));
		    float f_372_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_313_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_355_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_315_)));
		    f_332_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_372_
				 / f_321_));
		    float f_373_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_312_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_356_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_315_)));
		    f_333_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_373_
				 / f_322_));
		    float f_374_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_312_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_356_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_315_)));
		    f_334_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_374_
				 / f_322_));
		}
		Class101 class101 = null;
		int i_375_ = -1;
		if (((Class201) class201).aShort2411 != -1) {
		    class101 = (((Class166_Sub3) this).aClass103_Sub2_9962
				    .aClass107_1458.method2680
				(((Class201) class201).aShort2411 & 0xffff,
				 -1261755047));
		    i_375_ = class101.anInt1403 * 218388063;
		}
		boolean bool_376_
		    = class101 != null && method16256(class101.aByte1427);
		float f_377_ = f_316_ + f_317_ + f_318_;
		if (((f_331_ - f_333_) * (f_330_ - f_334_)
		     - (f_332_ - f_334_) * (f_329_ - f_333_))
		    > 0.0F) {
		    ((Class155) class155).aBool1748
			= (f_331_ < 0.0F || f_333_ < 0.0F || f_329_ < 0.0F
			   || f_331_ > (float) ((Class155) class155).anInt1733
			   || f_333_ > (float) ((Class155) class155).anInt1733
			   || (f_329_
			       > (float) ((Class155) class155).anInt1733));
		    if (f_377_ < 3.0F) {
			if (f_377_ > 0.0F) {
			    if (i_375_ >= 0) {
				int i_378_ = -16777216;
				if (bool_376_)
				    i_378_ = -1694498816;
				class155.method3384
				    (true, true, false, f_332_, f_334_, f_330_,
				     f_331_, f_333_, f_329_, f_325_, f_326_,
				     f_324_, f_321_, f_322_, f_320_, 1.0F,
				     0.0F, 1.0F, 1.0F, 1.0F, 0.0F,
				     i_378_ | (((Class201) class201).anInt2404
					       & 0xffffff),
				     i_378_ | (((Class201) class201).anInt2405
					       & 0xffffff),
				     i_378_ | (((Class201) class201).anInt2401
					       & 0xffffff),
				     (((Class189) class189).anInt2215
				      * -338296791),
				     f_317_ * 255.0F, f_318_ * 255.0F,
				     f_316_ * 255.0F,
				     ((Class201) class201).aShort2411 & 0xffff,
				     i_375_);
			    } else {
				if (bool_376_)
				    ((Class155) class155).anInt1723 = 100;
				class155.method3385
				    (true, true, false, f_332_, f_334_, f_330_,
				     f_331_, f_333_, f_329_, f_325_, f_326_,
				     f_324_,
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2404,
				       ((int) (f_317_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       52571765)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2405,
				       ((int) (f_318_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       1415954606)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2401,
				       ((int) (f_316_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       1675839866)));
				((Class155) class155).anInt1723 = 0;
			    }
			} else if (i_375_ >= 0) {
			    int i_379_ = -16777216;
			    if (bool_376_)
				i_379_ = -1694498816;
			    class155.method3384
				(true, true, false, f_332_, f_334_, f_330_,
				 f_331_, f_333_, f_329_, f_325_, f_326_,
				 f_324_, f_321_, f_322_, f_320_, 1.0F, 0.0F,
				 1.0F, 1.0F, 1.0F, 0.0F,
				 i_379_ | (((Class201) class201).anInt2404
					   & 0xffffff),
				 i_379_ | (((Class201) class201).anInt2405
					   & 0xffffff),
				 i_379_ | (((Class201) class201).anInt2401
					   & 0xffffff),
				 0, 0.0F, 0.0F, 0.0F,
				 ((Class201) class201).aShort2411 & 0xffff,
				 i_375_);
			} else {
			    if (bool_376_)
				((Class155) class155).anInt1723 = 100;
			    class155.method3385
				(true, true, false, f_332_, f_334_, f_330_,
				 f_331_, f_333_, f_329_, f_325_, f_326_,
				 f_324_, ((Class201) class201).anInt2404,
				 ((Class201) class201).anInt2405,
				 ((Class201) class201).anInt2401);
			    ((Class155) class155).anInt1723 = 0;
			}
		    } else
			class155.method3377(true, true, false, f_332_, f_334_,
					    f_330_, f_331_, f_333_, f_329_,
					    f_325_, f_326_, f_324_,
					    (((Class189) class189).anInt2215
					     * -338296791));
		}
		f_377_ = f + f_316_ + f_318_;
		if (((f_327_ - f_329_) * (f_334_ - f_330_)
		     - (f_328_ - f_330_) * (f_333_ - f_329_))
		    > 0.0F) {
		    ((Class155) class155).aBool1748
			= (f_327_ < 0.0F || f_329_ < 0.0F || f_333_ < 0.0F
			   || f_327_ > (float) ((Class155) class155).anInt1733
			   || f_329_ > (float) ((Class155) class155).anInt1733
			   || (f_333_
			       > (float) ((Class155) class155).anInt1733));
		    if (f_377_ < 3.0F) {
			if (bool_376_)
			    ((Class155) class155).anInt1723 = -1694498816;
			if (f_377_ > 0.0F) {
			    if (i_375_ >= 0) {
				int i_380_ = -16777216;
				if (bool_376_)
				    i_380_ = -1694498816;
				class155.method3384
				    (true, true, false, f_328_, f_330_, f_334_,
				     f_327_, f_329_, f_333_, f_323_, f_324_,
				     f_326_, f_319_, f_320_, f_322_, 0.0F,
				     1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
				     i_380_ | (((Class201) class201).anInt2410
					       & 0xffffff),
				     i_380_ | (((Class201) class201).anInt2401
					       & 0xffffff),
				     i_380_ | (((Class201) class201).anInt2405
					       & 0xffffff),
				     (((Class189) class189).anInt2215
				      * -338296791),
				     f * 255.0F, f_316_ * 255.0F,
				     f_318_ * 255.0F,
				     ((Class201) class201).aShort2411 & 0xffff,
				     i_375_);
			    } else {
				if (bool_376_)
				    ((Class155) class155).anInt1723 = 100;
				class155.method3385
				    (true, true, false, f_328_, f_330_, f_334_,
				     f_327_, f_329_, f_333_, f_323_, f_324_,
				     f_326_,
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2410,
				       ((int) (f * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       -548471907)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2401,
				       ((int) (f_316_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       1413743925)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2405,
				       ((int) (f_318_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       967452957)));
				((Class155) class155).anInt1723 = 0;
			    }
			} else if (i_375_ >= 0) {
			    int i_381_ = -16777216;
			    if (bool_376_)
				i_381_ = -1694498816;
			    class155.method3384
				(true, true, false, f_328_, f_330_, f_334_,
				 f_327_, f_329_, f_333_, f_323_, f_324_,
				 f_326_, f_319_, f_320_, f_322_, 0.0F, 1.0F,
				 1.0F, 0.0F, 0.0F, 1.0F,
				 i_381_ | (((Class201) class201).anInt2410
					   & 0xffffff),
				 i_381_ | (((Class201) class201).anInt2401
					   & 0xffffff),
				 i_381_ | (((Class201) class201).anInt2405
					   & 0xffffff),
				 0, 0.0F, 0.0F, 0.0F,
				 ((Class201) class201).aShort2411 & 0xffff,
				 i_375_);
			} else {
			    if (bool_376_)
				((Class155) class155).anInt1723 = 100;
			    class155.method3385
				(true, true, false, f_328_, f_330_, f_334_,
				 f_327_, f_329_, f_333_, f_323_, f_324_,
				 f_326_, ((Class201) class201).anInt2410,
				 ((Class201) class201).anInt2401,
				 ((Class201) class201).anInt2405);
			    ((Class155) class155).anInt1723 = 0;
			}
		    } else
			class155.method3377(true, true, false, f_328_, f_330_,
					    f_334_, f_327_, f_329_, f_333_,
					    f_323_, f_324_, f_326_,
					    (((Class189) class189).anInt2215
					     * -338296791));
		}
	    }
	} else {
	    Class183 class183
		= ((Class166_Sub3) this).aClass183ArrayArray9969[i][i_306_];
	    if (class183 != null) {
		if (i_311_ != 0) {
		    if ((((Class183) class183).aByte2157 & 0x4) != 0) {
			if ((i_311_ & 0x1) != 0)
			    return;
		    } else if ((i_311_ & 0x2) != 0)
			return;
		}
		for (int i_382_ = 0; i_382_ < ((Class183) class183).aShort2154;
		     i_382_++) {
		    int i_383_ = (((Class183) class183).aShortArray2156[i_382_]
				  + (i << anInt2054 * -122333825));
		    int i_384_ = ((Class183) class183).aShortArray2153[i_382_];
		    int i_385_ = (((Class183) class183).aShortArray2158[i_382_]
				  + (i_306_ << anInt2054 * -122333825));
		    float f = (((Class166_Sub3) this).aFloat9988
			       + ((((Class166_Sub3) this).aFloat9976
				   * (float) i_383_)
				  + (((Class166_Sub3) this).aFloat9980
				     * (float) i_384_)
				  + (((Class166_Sub3) this).aFloat9984
				     * (float) i_385_)));
		    float f_386_ = (((Class166_Sub3) this).aFloat9974
				    + ((((Class166_Sub3) this).aFloat9977
					* (float) i_383_)
				       + (((Class166_Sub3) this).aFloat9989
					  * (float) i_384_)
				       + (((Class166_Sub3) this).aFloat9985
					  * (float) i_385_)));
		    if (f < -f_386_)
			return;
		    float f_387_
			= (((Class155) class155).aFloat1720
			   + ((Class155) class155).aFloat1732 * f / f_386_);
		    fs_310_[i_382_] = 0.0F;
		    if (bool) {
			float f_388_ = f - ((Class189) class189).aFloat2213;
			if (f_388_ > 0.0F) {
			    f_388_ /= ((Class189) class189).aFloat2214;
			    if (f_388_ > 1.0F)
				f_388_ = 1.0F;
			    fs_310_[i_382_] = f_388_;
			    int i_389_
				= (int) ((float) (((Class183) class183)
						  .aShortArray2159[i_382_])
					 * f_388_);
			    if (i_389_ > 0)
				i_384_ -= i_389_;
			}
		    } else if (((Class189) class189).aBool2209) {
			float f_390_ = f - ((Class189) class189).aFloat2213;
			if (f_390_ > 0.0F) {
			    fs_310_[i_382_]
				= f_390_ / ((Class189) class189).aFloat2214;
			    if (fs_310_[i_382_] > 1.0F)
				fs_310_[i_382_] = 1.0F;
			}
		    }
		    float f_391_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_383_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_384_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_385_)));
		    float f_392_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_383_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_384_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_385_)));
		    fs[i_382_] = (((Class155) class155).aFloat1727
				  + (((Class155) class155).aFloat1728 * f_391_
				     / f_386_));
		    fs_307_[i_382_] = (((Class155) class155).aFloat1731
				       + (((Class155) class155).aFloat1729
					  * f_392_ / f_386_));
		    fs_308_[i_382_] = f_387_;
		    fs_309_[i_382_] = f_386_;
		}
		if (((Class183) class183).aShortArray2161 != null) {
		    for (int i_393_ = 0;
			 i_393_ < ((Class183) class183).aShort2160; i_393_++) {
			int i_394_ = i_393_ * 3;
			int i_395_ = i_394_ + 1;
			int i_396_ = i_395_ + 1;
			float f = fs[i_394_];
			float f_397_ = fs[i_395_];
			float f_398_ = fs[i_396_];
			float f_399_ = fs_307_[i_394_];
			float f_400_ = fs_307_[i_395_];
			float f_401_ = fs_307_[i_396_];
			float f_402_ = (fs_310_[i_394_] + fs_310_[i_395_]
					+ fs_310_[i_396_]);
			if (((f - f_397_) * (f_401_ - f_400_)
			     - (f_399_ - f_400_) * (f_398_ - f_397_))
			    > 0.0F) {
			    ((Class155) class155).aBool1748
				= (f < 0.0F || f_397_ < 0.0F || f_398_ < 0.0F
				   || f > (float) (((Class155) class155)
						   .anInt1733)
				   || f_397_ > (float) (((Class155) class155)
							.anInt1733)
				   || f_398_ > (float) (((Class155) class155)
							.anInt1733));
			    Class101 class101 = null;
			    int i_403_ = -1;
			    if (((Class183) class183).aShortArray2161[i_393_]
				!= -1) {
				class101
				    = (((Class166_Sub3) this)
					   .aClass103_Sub2_9962.aClass107_1458
					   .method2680
				       ((((Class183) class183).aShortArray2161
					 [i_393_]) & 0xffff,
					1239244593));
				i_403_ = class101.anInt1403 * 218388063;
			    }
			    if (f_402_ < 3.0F) {
				if (f_402_ > 0.0F) {
				    if (i_403_ != -1) {
					int i_404_ = -16777216;
					if (i_403_ != -1
					    && method16256(class101.aByte1427))
					    i_404_ = -1694498816;
					class155.method3384
					    (true, true, false, f_399_, f_400_,
					     f_401_, f, f_397_, f_398_,
					     fs_308_[i_394_], fs_308_[i_395_],
					     fs_308_[i_396_], fs_309_[i_394_],
					     fs_309_[i_395_], fs_309_[i_396_],
					     ((float) (((Class183) class183)
						       .aShortArray2156
						       [i_394_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2156
						       [i_395_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2156
						       [i_396_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2158
						       [i_394_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2158
						       [i_395_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2158
						       [i_396_])
					      / (float) (anInt2053
							 * 2039042417)),
					     i_404_ | (((Class183) class183)
						       .anIntArray2163
						       [i_394_]) & 0xffffff,
					     i_404_ | (((Class183) class183)
						       .anIntArray2163
						       [i_395_]) & 0xffffff,
					     i_404_ | (((Class183) class183)
						       .anIntArray2163
						       [i_396_]) & 0xffffff,
					     (((Class189) class189).anInt2215
					      * -338296791),
					     fs_310_[i_394_] * 255.0F,
					     fs_310_[i_395_] * 255.0F,
					     fs_310_[i_396_] * 255.0F,
					     ((((Class183) class183)
					       .aShortArray2161[i_393_])
					      & 0xffff),
					     i_403_);
				    } else if (((((Class183) class183)
						 .anIntArray2163[i_394_])
						& 0xffffff)
					       != 0) {
					if (i_403_ != -1
					    && method16256(class101.aByte1427))
					    ((Class155) class155).anInt1723
						= -1694498816;
					class155.method3385
					    (true, true, false, f_399_, f_400_,
					     f_401_, f, f_397_, f_398_,
					     fs_308_[i_394_], fs_308_[i_395_],
					     fs_308_[i_396_],
					     (Class241_Sub18_Sub1.method17140
					      ((((Class183) class183)
						.anIntArray2163[i_394_]),
					       ((int) (fs_310_[i_394_]
						       * 255.0F) << 24
						| (((Class189) class189)
						   .anInt2215) * -338296791),
					       -1013989420)),
					     (Class241_Sub18_Sub1.method17140
					      ((((Class183) class183)
						.anIntArray2163[i_395_]),
					       ((int) (fs_310_[i_395_]
						       * 255.0F) << 24
						| (((Class189) class189)
						   .anInt2215) * -338296791),
					       -1471369499)),
					     (Class241_Sub18_Sub1.method17140
					      ((((Class183) class183)
						.anIntArray2163[i_396_]),
					       ((int) (fs_310_[i_396_]
						       * 255.0F) << 24
						| (((Class189) class189)
						   .anInt2215) * -338296791),
					       1035225867)));
					((Class155) class155).anInt1723 = 0;
				    }
				} else if (i_403_ != -1) {
				    int i_405_ = -16777216;
				    if (i_403_ != -1
					&& method16256(class101.aByte1427))
					i_405_ = -1694498816;
				    class155.method3384
					(true, true, false, f_399_, f_400_,
					 f_401_, f, f_397_, f_398_,
					 fs_308_[i_394_], fs_308_[i_395_],
					 fs_308_[i_396_], fs_309_[i_394_],
					 fs_309_[i_395_], fs_309_[i_396_],
					 ((float) (((Class183) class183)
						   .aShortArray2156[i_394_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2156[i_395_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2156[i_396_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2158[i_394_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2158[i_395_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2158[i_396_])
					  / (float) (anInt2053 * 2039042417)),
					 i_405_ | ((((Class183) class183)
						    .anIntArray2163[i_394_])
						   & 0xffffff),
					 i_405_ | ((((Class183) class183)
						    .anIntArray2163[i_395_])
						   & 0xffffff),
					 i_405_ | ((((Class183) class183)
						    .anIntArray2163[i_396_])
						   & 0xffffff),
					 0, 0.0F, 0.0F, 0.0F,
					 (((Class183) class183).aShortArray2161
					  [i_393_]) & 0xffff,
					 i_403_);
				} else if (((((Class183) class183)
					     .anIntArray2163[i_394_])
					    & 0xffffff)
					   != 0) {
				    if (i_403_ != -1
					&& method16256(class101.aByte1427))
					((Class155) class155).anInt1723
					    = -1694498816;
				    class155.method3385(true, true, false,
							f_399_, f_400_, f_401_,
							f, f_397_, f_398_,
							fs_308_[i_394_],
							fs_308_[i_395_],
							fs_308_[i_396_],
							(((Class183) class183)
							 .anIntArray2163
							 [i_394_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_395_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_396_]));
				    ((Class155) class155).anInt1723 = 0;
				}
			    } else
				class155.method3377(true, true, false, f_399_,
						    f_400_, f_401_, f, f_397_,
						    f_398_, fs_308_[i_394_],
						    fs_308_[i_395_],
						    fs_308_[i_396_],
						    (((Class189) class189)
						     .anInt2215) * -338296791);
			}
		    }
		} else {
		    for (int i_406_ = 0;
			 i_406_ < ((Class183) class183).aShort2160; i_406_++) {
			int i_407_ = i_406_ * 3;
			int i_408_ = i_407_ + 1;
			int i_409_ = i_408_ + 1;
			float f = fs[i_407_];
			float f_410_ = fs[i_408_];
			float f_411_ = fs[i_409_];
			float f_412_ = fs_307_[i_407_];
			float f_413_ = fs_307_[i_408_];
			float f_414_ = fs_307_[i_409_];
			float f_415_ = (fs_310_[i_407_] + fs_310_[i_408_]
					+ fs_310_[i_409_]);
			if (((f - f_410_) * (f_414_ - f_413_)
			     - (f_412_ - f_413_) * (f_411_ - f_410_))
			    > 0.0F) {
			    ((Class155) class155).aBool1748
				= (f < 0.0F || f_410_ < 0.0F || f_411_ < 0.0F
				   || f > (float) (((Class155) class155)
						   .anInt1733)
				   || f_410_ > (float) (((Class155) class155)
							.anInt1733)
				   || f_411_ > (float) (((Class155) class155)
							.anInt1733));
			    if (f_415_ < 3.0F) {
				if (f_415_ > 0.0F) {
				    if (((((Class183) class183).anIntArray2163
					  [i_407_])
					 & 0xffffff)
					!= 0)
					class155.method3385
					    (true, true, false, f_412_, f_413_,
					     f_414_, f, f_410_, f_411_,
					     fs_308_[i_407_], fs_308_[i_408_],
					     fs_308_[i_409_],
					     (Class54.method1306
					      ((((Class183) class183)
						.anIntArray2163[i_407_]),
					       (((Class189) class189).anInt2215
						* -338296791),
					       fs_310_[i_407_] * 255.0F,
					       1372221625)),
					     (Class54.method1306
					      ((((Class183) class183)
						.anIntArray2163[i_408_]),
					       (((Class189) class189).anInt2215
						* -338296791),
					       fs_310_[i_408_] * 255.0F,
					       1372221625)),
					     (Class54.method1306
					      ((((Class183) class183)
						.anIntArray2163[i_409_]),
					       (((Class189) class189).anInt2215
						* -338296791),
					       fs_310_[i_409_] * 255.0F,
					       1372221625)));
				} else if (((((Class183) class183)
					     .anIntArray2163[i_407_])
					    & 0xffffff)
					   != 0)
				    class155.method3385(true, true, false,
							f_412_, f_413_, f_414_,
							f, f_410_, f_411_,
							fs_308_[i_407_],
							fs_308_[i_408_],
							fs_308_[i_409_],
							(((Class183) class183)
							 .anIntArray2163
							 [i_407_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_408_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_409_]));
			    } else
				class155.method3377(true, true, false, f_412_,
						    f_413_, f_414_, f, f_410_,
						    f_411_, fs_308_[i_407_],
						    fs_308_[i_408_],
						    fs_308_[i_409_],
						    (((Class189) class189)
						     .anInt2215) * -338296791);
			}
		    }
		}
	    }
	}
    }
    
    void method16245(int i, int i_416_, int i_417_, int i_418_, int i_419_,
		     int i_420_, int i_421_, boolean[][] bools,
		     Class189 class189, Class155 class155, float[] fs,
		     float[] fs_422_) {
	int i_423_ = (i_421_ - i_419_) * i_417_ / 256;
	int i_424_ = i_417_ >> 8;
	boolean bool = ((Class189) class189).aBool2220;
	((Class166_Sub3) this).aClass103_Sub2_9962.method2308(false);
	((Class155) class155).aBool1721 = false;
	((Class155) class155).aBool1722 = false;
	int i_425_ = i;
	int i_426_ = i_416_ + i_423_;
	for (int i_427_ = i_418_; i_427_ < i_420_; i_427_++) {
	    for (int i_428_ = i_419_; i_428_ < i_421_; i_428_++) {
		if (bools[i_427_ - i_418_][i_428_ - i_419_]) {
		    if ((((Class166_Sub3) this).aClass182ArrayArray9975[i_427_]
			 [i_428_])
			!= null) {
			Class182 class182
			    = (((Class166_Sub3) this).aClass182ArrayArray9975
			       [i_427_][i_428_]);
			if (((Class182) class182).aShort2149 != -1
			    && (((Class182) class182).aByte2150 & 0x2) == 0
			    && ((Class182) class182).anInt2151 == -1) {
			    int i_429_ = (((Class166_Sub3) this)
					      .aClass103_Sub2_9962.method15368
					  (((Class182) class182).aShort2149
					   & 0xffff));
			    class155.method3380
				(true, true, false, (float) (i_426_ - i_424_),
				 (float) (i_426_ - i_424_), (float) i_426_,
				 (float) (i_425_ + i_424_), (float) i_425_,
				 (float) (i_425_ + i_424_), 100.0F, 100.0F,
				 100.0F,
				 (float) Class639.method13606(i_429_,
							      ((((Class182)
								 class182)
								.aShort2147)
							       & 0xffff),
							      -855293887),
				 (float) Class639.method13606(i_429_,
							      ((((Class182)
								 class182)
								.aShort2152)
							       & 0xffff),
							      818096729),
				 (float) Class639.method13606(i_429_,
							      ((((Class182)
								 class182)
								.aShort2148)
							       & 0xffff),
							      -1484559478));
			    class155.method3380
				(true, true, false, (float) i_426_,
				 (float) i_426_, (float) (i_426_ - i_424_),
				 (float) i_425_, (float) (i_425_ + i_424_),
				 (float) i_425_, 100.0F, 100.0F, 100.0F,
				 (float) Class639.method13606(i_429_,
							      ((((Class182)
								 class182)
								.aShort2146)
							       & 0xffff),
							      1520229111),
				 (float) Class639.method13606(i_429_,
							      ((((Class182)
								 class182)
								.aShort2148)
							       & 0xffff),
							      -1504326591),
				 (float) Class639.method13606(i_429_,
							      ((((Class182)
								 class182)
								.aShort2152)
							       & 0xffff),
							      -2517204));
			} else if (((Class182) class182).anInt2151 == -1) {
			    class155.method3380
				(true, true, false, (float) (i_426_ - i_424_),
				 (float) (i_426_ - i_424_), (float) i_426_,
				 (float) (i_425_ + i_424_), (float) i_425_,
				 (float) (i_425_ + i_424_), 100.0F, 100.0F,
				 100.0F,
				 (float) (((Class182) class182).aShort2147
					  & 0xffff),
				 (float) (((Class182) class182).aShort2152
					  & 0xffff),
				 (float) (((Class182) class182).aShort2148
					  & 0xffff));
			    class155.method3380
				(true, true, false, (float) i_426_,
				 (float) i_426_, (float) (i_426_ - i_424_),
				 (float) i_425_, (float) (i_425_ + i_424_),
				 (float) i_425_, 100.0F, 100.0F, 100.0F,
				 (float) (((Class182) class182).aShort2146
					  & 0xffff),
				 (float) (((Class182) class182).aShort2148
					  & 0xffff),
				 (float) (((Class182) class182).aShort2152
					  & 0xffff));
			} else {
			    int i_430_ = ((Class182) class182).anInt2151;
			    class155.method3380(true, true, false,
						(float) (i_426_ - i_424_),
						(float) (i_426_ - i_424_),
						(float) i_426_,
						(float) (i_425_ + i_424_),
						(float) i_425_,
						(float) (i_425_ + i_424_),
						100.0F, 100.0F, 100.0F,
						(float) i_430_, (float) i_430_,
						(float) i_430_);
			    class155.method3380(true, true, false,
						(float) i_426_, (float) i_426_,
						(float) (i_426_ - i_424_),
						(float) i_425_,
						(float) (i_425_ + i_424_),
						(float) i_425_, 100.0F, 100.0F,
						100.0F, (float) i_430_,
						(float) i_430_,
						(float) i_430_);
			}
		    } else if ((((Class166_Sub3) this).aClass205ArrayArray9970
				[i_427_][i_428_])
			       != null) {
			Class205 class205
			    = (((Class166_Sub3) this).aClass205ArrayArray9970
			       [i_427_][i_428_]);
			for (int i_431_ = 0;
			     i_431_ < ((Class205) class205).aShort2431;
			     i_431_++) {
			    fs[i_431_]
				= (float) (i_425_
					   + ((((Class205) class205)
					       .aShortArray2433[i_431_])
					      * i_424_
					      / (anInt2053 * 2039042417)));
			    fs_422_[i_431_]
				= (float) (i_426_
					   - ((((Class205) class205)
					       .aShortArray2438[i_431_])
					      * i_424_
					      / (anInt2053 * 2039042417)));
			}
			for (int i_432_ = 0;
			     i_432_ < ((Class205) class205).aShort2441;
			     i_432_++) {
			    short i_433_ = (((Class205) class205)
					    .aShortArray2437[i_432_]);
			    short i_434_ = (((Class205) class205)
					    .aShortArray2430[i_432_]);
			    short i_435_ = (((Class205) class205)
					    .aShortArray2443[i_432_]);
			    float f = fs[i_433_];
			    float f_436_ = fs[i_434_];
			    float f_437_ = fs[i_435_];
			    float f_438_ = fs_422_[i_433_];
			    float f_439_ = fs_422_[i_434_];
			    float f_440_ = fs_422_[i_435_];
			    if (((Class205) class205).anIntArray2435 != null
				&& (((Class205) class205).anIntArray2435
				    [i_432_]) != -1) {
				int i_441_ = (((Class205) class205)
					      .anIntArray2435[i_432_]);
				class155.method3380
				    (true, true, false, f_438_, f_439_, f_440_,
				     f, f_436_, f_437_, 100.0F, 100.0F, 100.0F,
				     (float) (Class639.method13606
					      (i_441_,
					       (((Class205) class205)
						.aShortArray2436[i_433_]),
					       1709811480)),
				     (float) (Class639.method13606
					      (i_441_,
					       (((Class205) class205)
						.aShortArray2436[i_434_]),
					       189237357)),
				     (float) (Class639.method13606
					      (i_441_,
					       (((Class205) class205)
						.aShortArray2436[i_435_]),
					       -1284856034)));
			    } else if ((((Class205) class205).aShortArray2440
					!= null)
				       && (((Class205) class205)
					   .aShortArray2440[i_432_]) != -1) {
				int i_442_
				    = (((Class166_Sub3) this)
					   .aClass103_Sub2_9962.method15368
				       ((((Class205) class205).aShortArray2440
					 [i_432_]) & 0xffff));
				class155.method3380
				    (true, true, false, f_438_, f_439_, f_440_,
				     f, f_436_, f_437_, 100.0F, 100.0F, 100.0F,
				     (float) (Class639.method13606
					      (i_442_,
					       (((Class205) class205)
						.aShortArray2436[i_433_]),
					       -1666419112)),
				     (float) (Class639.method13606
					      (i_442_,
					       (((Class205) class205)
						.aShortArray2436[i_434_]),
					       329369232)),
				     (float) (Class639.method13606
					      (i_442_,
					       (((Class205) class205)
						.aShortArray2436[i_435_]),
					       -1656003587)));
			    } else {
				int i_443_ = (((Class205) class205)
					      .anIntArray2442[i_432_]);
				class155.method3380
				    (true, true, false, f_438_, f_439_, f_440_,
				     f, f_436_, f_437_, 100.0F, 100.0F, 100.0F,
				     (float) (Class639.method13606
					      (i_443_,
					       (((Class205) class205)
						.aShortArray2436[i_433_]),
					       602404009)),
				     (float) (Class639.method13606
					      (i_443_,
					       (((Class205) class205)
						.aShortArray2436[i_434_]),
					       1810149941)),
				     (float) (Class639.method13606
					      (i_443_,
					       (((Class205) class205)
						.aShortArray2436[i_435_]),
					       1166755951)));
			    }
			}
		    }
		}
		i_426_ -= i_424_;
	    }
	    i_426_ = i_416_ + i_423_;
	    i_425_ += i_424_;
	}
	((Class155) class155).aBool1721 = true;
	((Class166_Sub3) this).aClass103_Sub2_9962.method2308(bool);
    }
    
    void method16246(int i, int i_444_, int i_445_, int i_446_, int i_447_,
		     int i_448_, int i_449_, boolean[][] bools,
		     Class189 class189, Class155 class155, float[] fs,
		     float[] fs_450_) {
	int i_451_ = (i_449_ - i_447_) * i_445_ / 256;
	int i_452_ = i_445_ >> 8;
	boolean bool = ((Class189) class189).aBool2220;
	((Class166_Sub3) this).aClass103_Sub2_9962.method2308(false);
	((Class155) class155).aBool1721 = false;
	((Class155) class155).aBool1722 = false;
	int i_453_ = i;
	int i_454_ = i_444_ + i_451_;
	for (int i_455_ = i_446_; i_455_ < i_448_; i_455_++) {
	    for (int i_456_ = i_447_; i_456_ < i_449_; i_456_++) {
		if (bools[i_455_ - i_446_][i_456_ - i_447_]) {
		    if (((Class166_Sub3) this).aClass201ArrayArray9967
			!= null) {
			if ((((Class166_Sub3) this).aClass201ArrayArray9967
			     [i_455_][i_456_])
			    != null) {
			    Class201 class201
				= (((Class166_Sub3) this)
				   .aClass201ArrayArray9967[i_455_][i_456_]);
			    if (((Class201) class201).aShort2411 != -1
				&& (((Class201) class201).aByte2409 & 0x2) == 0
				&& ((Class201) class201).anInt2408 == 0) {
				int i_457_
				    = (((Class166_Sub3) this)
					   .aClass103_Sub2_9962.method15368
				       (((Class201) class201).aShort2411
					& 0xffff));
				class155.method3380
				    (true, true, false,
				     (float) (i_454_ - i_452_),
				     (float) (i_454_ - i_452_), (float) i_454_,
				     (float) (i_453_ + i_452_), (float) i_453_,
				     (float) (i_453_ + i_452_), 100.0F, 100.0F,
				     100.0F,
				     (float) Class639.method13606(i_457_,
								  (((Class201)
								    class201)
								   .anInt2404),
								  1798575847),
				     (float) Class639.method13606(i_457_,
								  (((Class201)
								    class201)
								   .anInt2405),
								  -115175290),
				     (float) Class639.method13606(i_457_,
								  (((Class201)
								    class201)
								   .anInt2401),
								  -388712090));
				class155.method3380
				    (true, true, false, (float) i_454_,
				     (float) i_454_, (float) (i_454_ - i_452_),
				     (float) i_453_, (float) (i_453_ + i_452_),
				     (float) i_453_, 100.0F, 100.0F, 100.0F,
				     (float) Class639.method13606(i_457_,
								  (((Class201)
								    class201)
								   .anInt2410),
								  1496846334),
				     (float) Class639.method13606(i_457_,
								  (((Class201)
								    class201)
								   .anInt2401),
								  648594360),
				     (float) (Class639.method13606
					      (i_457_,
					       ((Class201) class201).anInt2405,
					       -1083099098)));
			    } else if (((Class201) class201).anInt2408 == 0) {
				class155.method3385
				    (true, true, false,
				     (float) (i_454_ - i_452_),
				     (float) (i_454_ - i_452_), (float) i_454_,
				     (float) (i_453_ + i_452_), (float) i_453_,
				     (float) (i_453_ + i_452_), 100.0F, 100.0F,
				     100.0F, ((Class201) class201).anInt2404,
				     ((Class201) class201).anInt2405,
				     ((Class201) class201).anInt2401);
				class155.method3385
				    (true, true, false, (float) i_454_,
				     (float) i_454_, (float) (i_454_ - i_452_),
				     (float) i_453_, (float) (i_453_ + i_452_),
				     (float) i_453_, 100.0F, 100.0F, 100.0F,
				     ((Class201) class201).anInt2410,
				     ((Class201) class201).anInt2401,
				     ((Class201) class201).anInt2405);
			    } else {
				int i_458_ = ((Class201) class201).anInt2408;
				class155.method3385
				    (true, true, false,
				     (float) (i_454_ - i_452_),
				     (float) (i_454_ - i_452_), (float) i_454_,
				     (float) (i_453_ + i_452_), (float) i_453_,
				     (float) (i_453_ + i_452_), 100.0F, 100.0F,
				     100.0F,
				     (Class241_Sub18_Sub1.method17140
				      (i_458_, (((Class201) class201).anInt2404
						& ~0xffffff), -1489847614)),
				     (Class241_Sub18_Sub1.method17140
				      (i_458_, (((Class201) class201).anInt2405
						& ~0xffffff), 1769399218)),
				     (Class241_Sub18_Sub1.method17140
				      (i_458_, (((Class201) class201).anInt2401
						& ~0xffffff), -1453902046)));
				class155.method3385
				    (true, true, false, (float) i_454_,
				     (float) i_454_, (float) (i_454_ - i_452_),
				     (float) i_453_, (float) (i_453_ + i_452_),
				     (float) i_453_, 100.0F, 100.0F, 100.0F,
				     (Class241_Sub18_Sub1.method17140
				      (i_458_, (((Class201) class201).anInt2410
						& ~0xffffff), 1056796458)),
				     (Class241_Sub18_Sub1.method17140
				      (i_458_, (((Class201) class201).anInt2401
						& ~0xffffff), 1841602391)),
				     (Class241_Sub18_Sub1.method17140
				      (i_458_, (((Class201) class201).anInt2405
						& ~0xffffff), 978449047)));
			    }
			} else if ((((Class166_Sub3) this)
				    .aClass183ArrayArray9969[i_455_][i_456_])
				   != null) {
			    Class183 class183
				= (((Class166_Sub3) this)
				   .aClass183ArrayArray9969[i_455_][i_456_]);
			    for (int i_459_ = 0;
				 i_459_ < ((Class183) class183).aShort2154;
				 i_459_++) {
				fs[i_459_]
				    = (float) (i_453_
					       + ((((Class183) class183)
						   .aShortArray2156[i_459_])
						  * i_452_
						  / (anInt2053 * 2039042417)));
				fs_450_[i_459_]
				    = (float) (i_454_
					       - ((((Class183) class183)
						   .aShortArray2158[i_459_])
						  * i_452_
						  / (anInt2053 * 2039042417)));
			    }
			    for (int i_460_ = 0;
				 i_460_ < ((Class183) class183).aShort2160;
				 i_460_++) {
				int i_461_ = i_460_ * 3;
				int i_462_ = i_461_ + 1;
				int i_463_ = i_462_ + 1;
				float f = fs[i_461_];
				float f_464_ = fs[i_462_];
				float f_465_ = fs[i_463_];
				float f_466_ = fs_450_[i_461_];
				float f_467_ = fs_450_[i_462_];
				float f_468_ = fs_450_[i_463_];
				if ((((Class183) class183).anIntArray2155
				     != null)
				    && (((Class183) class183).anIntArray2155
					[i_460_]) != 0
				    && ((((Class183) class183).aShortArray2161
					 == null)
					|| ((((Class183) class183)
					     .aShortArray2161) != null
					    && ((((Class183) class183)
						 .aShortArray2161[i_460_])
						== -1)))) {
				    int i_469_ = (((Class183) class183)
						  .anIntArray2155[i_460_]);
				    class155.method3385
					(true, true, false, f_466_, f_467_,
					 f_468_, f, f_464_, f_465_, 100.0F,
					 100.0F, 100.0F,
					 (Class241_Sub18_Sub1.method17140
					  (i_469_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_461_])
							& ~0xffffff),
					   -673832568)),
					 (Class241_Sub18_Sub1.method17140
					  (i_469_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_462_])
							& ~0xffffff),
					   1538640689)),
					 (Class241_Sub18_Sub1.method17140
					  (i_469_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_463_])
							& ~0xffffff),
					   -776128684)));
				} else if ((((Class183) class183)
					    .aShortArray2161) != null
					   && ((((Class183) class183)
						.aShortArray2161[i_460_])
					       != -1)) {
				    int i_470_
					= (((Class166_Sub3) this)
					       .aClass103_Sub2_9962.method15368
					   ((((Class183) class183)
					     .aShortArray2161[i_460_])
					    & 0xffff));
				    class155.method3380(true, true, false,
							f_466_, f_467_, f_468_,
							f, f_464_, f_465_,
							100.0F, 100.0F, 100.0F,
							(float) i_470_,
							(float) i_470_,
							(float) i_470_);
				} else
				    class155.method3385(true, true, false,
							f_466_, f_467_, f_468_,
							f, f_464_, f_465_,
							100.0F, 100.0F, 100.0F,
							(((Class183) class183)
							 .anIntArray2163
							 [i_461_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_462_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_463_]));
			    }
			}
		    } else if ((((Class166_Sub3) this).aClass143ArrayArray9979
				[i_455_][i_456_])
			       != null) {
			Class143 class143
			    = (((Class166_Sub3) this).aClass143ArrayArray9979
			       [i_455_][i_456_]);
			for (int i_471_ = 0;
			     i_471_ < ((Class143) class143).aShort1669;
			     i_471_++) {
			    fs[i_471_]
				= (float) (i_453_
					   + ((((Class143) class143)
					       .aShortArray1666[i_471_])
					      * i_452_
					      / (anInt2053 * 2039042417)));
			    fs_450_[i_471_]
				= (float) (i_454_
					   - ((((Class143) class143)
					       .aShortArray1664[i_471_])
					      * i_452_
					      / (anInt2053 * 2039042417)));
			}
			for (int i_472_ = 0;
			     i_472_ < ((Class143) class143).aShort1668;
			     i_472_++) {
			    int i_473_ = i_472_ * 3;
			    int i_474_ = i_473_ + 1;
			    int i_475_ = i_474_ + 1;
			    float f = fs[i_473_];
			    float f_476_ = fs[i_474_];
			    float f_477_ = fs[i_475_];
			    float f_478_ = fs_450_[i_473_];
			    float f_479_ = fs_450_[i_474_];
			    float f_480_ = fs_450_[i_475_];
			    if (((Class143) class143).anIntArray1674 != null
				&& (((Class143) class143).anIntArray1674
				    [i_472_]) != 0) {
				int i_481_ = (((Class143) class143)
					      .anIntArray1674[i_472_]);
				class155.method3385(true, true, false, f_478_,
						    f_479_, f_480_, f, f_476_,
						    f_477_, 100.0F, 100.0F,
						    100.0F, i_481_, i_481_,
						    i_481_);
			    } else
				class155.method3385(true, true, false, f_478_,
						    f_479_, f_480_, f, f_476_,
						    f_477_, 100.0F, 100.0F,
						    100.0F,
						    (((Class143) class143)
						     .anIntArray1672[i_473_]),
						    (((Class143) class143)
						     .anIntArray1672[i_474_]),
						    (((Class143) class143)
						     .anIntArray1672[i_475_]));
			}
		    }
		}
		i_454_ -= i_452_;
	    }
	    i_454_ = i_444_ + i_451_;
	    i_453_ += i_452_;
	}
	((Class155) class155).aBool1721 = true;
	((Class166_Sub3) this).aClass103_Sub2_9962.method2308(bool);
    }
    
    public Class241_Sub39_Sub17 method3553
	(int i, int i_482_, Class241_Sub39_Sub17 class241_sub39_sub17) {
	return null;
    }
    
    public void method3548(int i, int i_483_, int i_484_, int i_485_,
			   int i_486_, int i_487_, int i_488_,
			   boolean[][] bools) {
	Class189 class189 = ((Class166_Sub3) this).aClass103_Sub2_9962
				.method15377(Thread.currentThread());
	Class155 class155 = ((Class189) class189).aClass155_2223;
	((Class155) class155).anInt1723 = 0;
	((Class155) class155).aBool1748 = true;
	((Class166_Sub3) this).aClass103_Sub2_9962.method15424();
	if (((Class166_Sub3) this).aClass201ArrayArray9967 != null
	    || ((Class166_Sub3) this).aClass143ArrayArray9979 != null)
	    method16246(i, i_483_, i_484_, i_485_, i_486_, i_487_, i_488_,
			bools, class189, class155,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211);
	else if (((Class166_Sub3) this).aClass182ArrayArray9975 != null)
	    method16245(i, i_483_, i_484_, i_485_, i_486_, i_487_, i_488_,
			bools, class189, class155,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211);
    }
    
    static int method16247(int i, int i_489_) {
	int i_490_ = (i & 0xff0000) * i_489_ >> 23;
	if (i_490_ < 2)
	    i_490_ = 2;
	else if (i_490_ > 253)
	    i_490_ = 253;
	int i_491_ = (i & 0xff00) * i_489_ >> 15;
	if (i_491_ < 2)
	    i_491_ = 2;
	else if (i_491_ > 253)
	    i_491_ = 253;
	int i_492_ = (i & 0xff) * i_489_ >> 7;
	if (i_492_ < 2)
	    i_492_ = 2;
	else if (i_492_ > 253)
	    i_492_ = 253;
	return i_490_ << 16 | i_491_ << 8 | i_492_;
    }
    
    public void method3555(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_493_, int i_494_, int i_495_, boolean bool) {
	/* empty */
    }
    
    public void method3557(Class241_Sub43 class241_sub43, int[] is) {
	/* empty */
    }
    
    void method16248(int i, int i_496_, boolean bool, Class189 class189,
		     Class155 class155, float[] fs, float[] fs_497_,
		     float[] fs_498_, float[] fs_499_, float[] fs_500_,
		     int i_501_) {
	Class143 class143
	    = ((Class166_Sub3) this).aClass143ArrayArray9979[i][i_496_];
	if (i_501_ == 0 || (i_501_ & 0x2) == 0) {
	    if (class143 != null) {
		for (int i_502_ = 0; i_502_ < ((Class143) class143).aShort1669;
		     i_502_++) {
		    int i_503_ = (((Class143) class143).aShortArray1666[i_502_]
				  + (i << anInt2054 * -122333825));
		    int i_504_ = ((Class143) class143).aShortArray1667[i_502_];
		    int i_505_ = (((Class143) class143).aShortArray1664[i_502_]
				  + (i_496_ << anInt2054 * -122333825));
		    float f = (((Class166_Sub3) this).aFloat9988
			       + ((((Class166_Sub3) this).aFloat9976
				   * (float) i_503_)
				  + (((Class166_Sub3) this).aFloat9980
				     * (float) i_504_)
				  + (((Class166_Sub3) this).aFloat9984
				     * (float) i_505_)));
		    float f_506_ = (((Class166_Sub3) this).aFloat9974
				    + ((((Class166_Sub3) this).aFloat9977
					* (float) i_503_)
				       + (((Class166_Sub3) this).aFloat9989
					  * (float) i_504_)
				       + (((Class166_Sub3) this).aFloat9985
					  * (float) i_505_)));
		    if (f < -f_506_)
			return;
		    fs_500_[i_502_] = 0.0F;
		    if (bool) {
			float f_507_ = f - ((Class189) class189).aFloat2213;
			if (f_507_ > 0.0F) {
			    f_507_ /= ((Class189) class189).aFloat2214;
			    if (f_507_ > 1.0F)
				f_507_ = 1.0F;
			    fs_500_[i_502_] = f_507_;
			    int i_508_
				= (int) ((float) (((Class143) class143)
						  .aShortArray1673[i_502_])
					 * f_507_);
			    if (i_508_ > 0)
				i_504_ -= i_508_;
			}
		    } else if (((Class189) class189).aBool2209) {
			float f_509_ = f - ((Class189) class189).aFloat2213;
			if (f_509_ > 0.0F) {
			    fs_500_[i_502_]
				= f_509_ / ((Class189) class189).aFloat2214;
			    if (fs_500_[i_502_] > 1.0F)
				fs_500_[i_502_] = 1.0F;
			}
		    }
		    float f_510_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_503_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_504_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_505_)));
		    float f_511_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_503_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_504_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_505_)));
		    fs[i_502_] = (((Class155) class155).aFloat1727
				  + (((Class155) class155).aFloat1728 * f_510_
				     / f_506_));
		    fs_497_[i_502_] = (((Class155) class155).aFloat1731
				       + (((Class155) class155).aFloat1729
					  * f_511_ / f_506_));
		    fs_498_[i_502_]
			= (((Class155) class155).aFloat1720
			   + ((Class155) class155).aFloat1732 * f / f_506_);
		    fs_499_[i_502_] = f_506_;
		}
		float f = (float) (anInt2053 * 2039042417);
		for (int i_512_ = 0; i_512_ < ((Class143) class143).aShort1668;
		     i_512_++) {
		    int i_513_ = i_512_ * 3;
		    int i_514_ = i_513_ + 1;
		    int i_515_ = i_514_ + 1;
		    float f_516_ = fs[i_513_];
		    float f_517_ = fs[i_514_];
		    float f_518_ = fs[i_515_];
		    float f_519_ = fs_497_[i_513_];
		    float f_520_ = fs_497_[i_514_];
		    float f_521_ = fs_497_[i_515_];
		    if (((f_516_ - f_517_) * (f_521_ - f_520_)
			 - (f_519_ - f_520_) * (f_518_ - f_517_))
			> 0.0F) {
			((Class155) class155).aBool1748
			    = (f_516_ < 0.0F || f_517_ < 0.0F || f_518_ < 0.0F
			       || (f_516_
				   > (float) ((Class155) class155).anInt1733)
			       || (f_517_
				   > (float) ((Class155) class155).anInt1733)
			       || (f_518_
				   > (float) ((Class155) class155).anInt1733));
			if (fs_500_[i_513_] + fs_500_[i_514_] + fs_500_[i_515_]
			    < 3.0F) {
			    int i_522_ = i << anInt2054 * -122333825;
			    int i_523_ = i_496_ << anInt2054 * -122333825;
			    if ((((Class143) class143).anIntArray1672[i_513_]
				 & 0xffffff)
				!= 0) {
				if ((((Class143) class143).aShortArray1670
				     [i_513_]) != -1
				    && (((Class143) class143).aShortArray1670
					[i_514_]) != -1
				    && (((Class143) class143).aShortArray1670
					[i_515_]) != -1) {
				    if (((((Class143) class143).aShortArray1670
					  [i_513_])
					 == (((Class143) class143)
					     .aShortArray1670[i_514_]))
					&& ((((Class143) class143)
					     .aShortArray1670[i_513_])
					    == (((Class143) class143)
						.aShortArray1670[i_515_]))
					&& ((((Class143) class143)
					     .aShortArray1671[i_513_])
					    == (((Class143) class143)
						.aShortArray1671[i_514_]))
					&& ((((Class143) class143)
					     .aShortArray1671[i_513_])
					    == (((Class143) class143)
						.aShortArray1671[i_515_])))
					class155.method3384
					    (true, true, false, f_519_, f_520_,
					     f_521_, f_516_, f_517_, f_518_,
					     fs_498_[i_513_], fs_498_[i_514_],
					     fs_498_[i_515_], fs_499_[i_513_],
					     fs_499_[i_514_], fs_499_[i_515_],
					     ((float) (i_522_
						       + (((Class143) class143)
							  .aShortArray1666
							  [i_513_]))
					      / (float) (((Class143) class143)
							 .aShortArray1671
							 [i_513_])),
					     ((float) (i_522_
						       + (((Class143) class143)
							  .aShortArray1666
							  [i_514_]))
					      / (float) (((Class143) class143)
							 .aShortArray1671
							 [i_514_])),
					     ((float) (i_522_
						       + (((Class143) class143)
							  .aShortArray1666
							  [i_515_]))
					      / (float) (((Class143) class143)
							 .aShortArray1671
							 [i_515_])),
					     ((float) (i_523_
						       + (((Class143) class143)
							  .aShortArray1664
							  [i_513_]))
					      / (float) (((Class143) class143)
							 .aShortArray1671
							 [i_513_])),
					     ((float) (i_523_
						       + (((Class143) class143)
							  .aShortArray1664
							  [i_514_]))
					      / (float) (((Class143) class143)
							 .aShortArray1671
							 [i_514_])),
					     ((float) (i_523_
						       + (((Class143) class143)
							  .aShortArray1664
							  [i_515_]))
					      / (float) (((Class143) class143)
							 .aShortArray1671
							 [i_515_])),
					     (((Class143) class143)
					      .anIntArray1672[i_513_]),
					     (((Class143) class143)
					      .anIntArray1672[i_514_]),
					     (((Class143) class143)
					      .anIntArray1672[i_515_]),
					     (((Class189) class189).anInt2215
					      * -338296791),
					     fs_500_[i_513_] * 255.0F,
					     fs_500_[i_514_] * 255.0F,
					     fs_500_[i_515_] * 255.0F,
					     ((((Class143) class143)
					       .aShortArray1670[i_513_])
					      & 0xffff),
					     (((Class166_Sub3) this)
						  .aClass103_Sub2_9962
						  .aClass107_1458.method2680
					      (((((Class143) class143)
						 .aShortArray1670[i_513_])
						& 0xffff),
					       -1025226692)
					      .anInt1403) * 218388063);
				    else
					class155.method3369
					    (true, true, false, f_519_, f_520_,
					     f_521_, f_516_, f_517_, f_518_,
					     fs_498_[i_513_], fs_498_[i_514_],
					     fs_498_[i_515_], fs_499_[i_513_],
					     fs_499_[i_514_], fs_499_[i_515_],
					     (float) (i_522_
						      + (((Class143) class143)
							 .aShortArray1666
							 [i_513_])) / f,
					     (float) (i_522_
						      + (((Class143) class143)
							 .aShortArray1666
							 [i_514_])) / f,
					     (float) (i_522_
						      + (((Class143) class143)
							 .aShortArray1666
							 [i_515_])) / f,
					     (float) (i_523_
						      + (((Class143) class143)
							 .aShortArray1664
							 [i_513_])) / f,
					     (float) (i_523_
						      + (((Class143) class143)
							 .aShortArray1664
							 [i_514_])) / f,
					     (float) (i_523_
						      + (((Class143) class143)
							 .aShortArray1664
							 [i_515_])) / f,
					     (((Class143) class143)
					      .anIntArray1672[i_513_]),
					     (((Class143) class143)
					      .anIntArray1672[i_514_]),
					     (((Class143) class143)
					      .anIntArray1672[i_515_]),
					     (((Class189) class189).anInt2215
					      * -338296791),
					     fs_500_[i_513_] * 255.0F,
					     fs_500_[i_514_] * 255.0F,
					     fs_500_[i_515_] * 255.0F,
					     ((((Class143) class143)
					       .aShortArray1670[i_513_])
					      & 0xffff),
					     (((Class166_Sub3) this)
						  .aClass103_Sub2_9962
						  .aClass107_1458.method2680
					      (((((Class143) class143)
						 .aShortArray1670[i_513_])
						& 0xffff),
					       1068589904)
					      .anInt1403) * 218388063,
					     f / (float) (((Class143) class143)
							  .aShortArray1671
							  [i_513_]),
					     ((((Class143) class143)
					       .aShortArray1670[i_514_])
					      & 0xffff),
					     (((Class166_Sub3) this)
						  .aClass103_Sub2_9962
						  .aClass107_1458.method2680
					      (((((Class143) class143)
						 .aShortArray1670[i_514_])
						& 0xffff),
					       1843480570)
					      .anInt1403) * 218388063,
					     f / (float) (((Class143) class143)
							  .aShortArray1671
							  [i_514_]),
					     ((((Class143) class143)
					       .aShortArray1670[i_515_])
					      & 0xffff),
					     (((Class166_Sub3) this)
						  .aClass103_Sub2_9962
						  .aClass107_1458.method2680
					      (((((Class143) class143)
						 .aShortArray1670[i_515_])
						& 0xffff),
					       1532385204)
					      .anInt1403) * 218388063,
					     f / (float) (((Class143) class143)
							  .aShortArray1671
							  [i_515_]));
				} else if ((fs_500_[i_513_] + fs_500_[i_514_]
					    + fs_500_[i_515_])
					   > 0.0F)
				    class155.method3385
					(true, true, false, f_519_, f_520_,
					 f_521_, f_516_, f_517_, f_518_,
					 fs_498_[i_513_], fs_498_[i_514_],
					 fs_498_[i_515_],
					 (Class54.method1306
					  ((((Class143) class143)
					    .anIntArray1672[i_513_]),
					   (((Class189) class189).anInt2215
					    * -338296791),
					   fs_500_[i_513_] * 255.0F,
					   1372221625)),
					 (Class54.method1306
					  ((((Class143) class143)
					    .anIntArray1672[i_514_]),
					   (((Class189) class189).anInt2215
					    * -338296791),
					   fs_500_[i_514_] * 255.0F,
					   1372221625)),
					 (Class54.method1306
					  ((((Class143) class143)
					    .anIntArray1672[i_515_]),
					   (((Class189) class189).anInt2215
					    * -338296791),
					   fs_500_[i_515_] * 255.0F,
					   1372221625)));
				else
				    class155.method3385(true, true, false,
							f_519_, f_520_, f_521_,
							f_516_, f_517_, f_518_,
							fs_498_[i_513_],
							fs_498_[i_514_],
							fs_498_[i_515_],
							(((Class143) class143)
							 .anIntArray1672
							 [i_513_]),
							(((Class143) class143)
							 .anIntArray1672
							 [i_514_]),
							(((Class143) class143)
							 .anIntArray1672
							 [i_515_]));
			    }
			} else
			    class155.method3377(true, true, false, f_519_,
						f_520_, f_521_, f_516_, f_517_,
						f_518_, fs_498_[i_513_],
						fs_498_[i_514_],
						fs_498_[i_515_],
						(((Class189) class189)
						 .anInt2215) * -338296791);
		    }
		}
	    }
	}
    }
    
    public void method3542(int i, int i_524_, int i_525_) {
	i = Math.min(((Class166_Sub3) this).aByteArrayArray9991.length - 1,
		     Math.max(0, i));
	i_524_ = Math.min((((Class166_Sub3) this).aByteArrayArray9991[i].length
			   - 1),
			  Math.max(0, i_524_));
	if (((Class166_Sub3) this).aByteArrayArray9991[i][i_524_] < i_525_)
	    ((Class166_Sub3) this).aByteArrayArray9991[i][i_524_]
		= (byte) i_525_;
    }
    
    void method16249(int i, int i_526_, Class155 class155, float[] fs,
		     float[] fs_527_, float[] fs_528_, float[] fs_529_,
		     float[] fs_530_, int i_531_) {
	Class182 class182
	    = ((Class166_Sub3) this).aClass182ArrayArray9975[i][i_526_];
	if (class182 != null) {
	    if ((((Class182) class182).aByte2150 & 0x2) == 0) {
		if (i_531_ != 0) {
		    if ((((Class182) class182).aByte2150 & 0x4) != 0) {
			if ((i_531_ & 0x1) != 0)
			    return;
		    } else if ((i_531_ & 0x2) != 0)
			return;
		}
		int i_532_ = i * (anInt2053 * 2039042417);
		int i_533_ = i_532_ + anInt2053 * 2039042417;
		int i_534_ = i_526_ * (anInt2053 * 2039042417);
		int i_535_ = i_534_ + anInt2053 * 2039042417;
		float f;
		float f_536_;
		float f_537_;
		float f_538_;
		float f_539_;
		float f_540_;
		float f_541_;
		float f_542_;
		float f_543_;
		float f_544_;
		float f_545_;
		float f_546_;
		float f_547_;
		float f_548_;
		float f_549_;
		float f_550_;
		if ((((Class182) class182).aByte2150 & 0x1) != 0) {
		    int i_551_ = anIntArrayArray2051[i][i_526_];
		    float f_552_
			= ((Class166_Sub3) this).aFloat9980 * (float) i_551_;
		    float f_553_
			= ((Class166_Sub3) this).aFloat9989 * (float) i_551_;
		    float f_554_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_532_)
				       + f_552_
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_534_)));
		    f = (((Class166_Sub3) this).aFloat9974
			 + (((Class166_Sub3) this).aFloat9977 * (float) i_532_
			    + f_553_
			    + (((Class166_Sub3) this).aFloat9985
			       * (float) i_534_)));
		    if (f_554_ < -f)
			return;
		    float f_555_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_533_)
				       + f_552_
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_534_)));
		    f_536_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_533_)
				 + f_553_
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_534_)));
		    if (f_555_ < -f_536_)
			return;
		    float f_556_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_533_)
				       + f_552_
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_535_)));
		    f_537_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_533_)
				 + f_553_
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_535_)));
		    if (f_556_ < -f_537_)
			return;
		    float f_557_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_532_)
				       + f_552_
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_535_)));
		    f_538_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_532_)
				 + f_553_
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_535_)));
		    if (f_557_ < -f_538_)
			return;
		    float f_558_
			= ((Class166_Sub3) this).aFloat9978 * (float) i_551_;
		    float f_559_
			= ((Class166_Sub3) this).aFloat9965 * (float) i_551_;
		    float f_560_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_532_)
				       + f_558_
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_534_)));
		    f_539_ = (((Class155) class155).aFloat1727
			      + ((Class155) class155).aFloat1728 * f_560_ / f);
		    float f_561_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_532_)
				       + f_559_
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_534_)));
		    f_540_ = (((Class155) class155).aFloat1731
			      + ((Class155) class155).aFloat1729 * f_561_ / f);
		    f_541_ = (((Class155) class155).aFloat1720
			      + ((Class155) class155).aFloat1732 * f_554_ / f);
		    float f_562_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_533_)
				       + f_558_
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_534_)));
		    f_542_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_562_
				 / f_536_));
		    float f_563_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_533_)
				       + f_559_
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_534_)));
		    f_543_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_563_
				 / f_536_));
		    f_544_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_555_
				 / f_536_));
		    float f_564_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_533_)
				       + f_558_
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_535_)));
		    f_545_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_564_
				 / f_537_));
		    float f_565_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_533_)
				       + f_559_
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_535_)));
		    f_546_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_565_
				 / f_537_));
		    f_547_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_556_
				 / f_537_));
		    float f_566_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_532_)
				       + f_558_
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_535_)));
		    f_548_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_566_
				 / f_538_));
		    float f_567_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_532_)
				       + f_559_
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_535_)));
		    f_549_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_567_
				 / f_538_));
		    f_550_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_557_
				 / f_538_));
		} else {
		    int i_568_ = anIntArrayArray2051[i][i_526_];
		    int i_569_ = anIntArrayArray2051[i + 1][i_526_];
		    int i_570_ = anIntArrayArray2051[i + 1][i_526_ + 1];
		    int i_571_ = anIntArrayArray2051[i][i_526_ + 1];
		    float f_572_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_532_)
				       + (((Class166_Sub3) this).aFloat9980
					  * (float) i_568_)
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_534_)));
		    f = (((Class166_Sub3) this).aFloat9974
			 + (((Class166_Sub3) this).aFloat9977 * (float) i_532_
			    + (((Class166_Sub3) this).aFloat9989
			       * (float) i_568_)
			    + (((Class166_Sub3) this).aFloat9985
			       * (float) i_534_)));
		    if (f_572_ < -f)
			return;
		    float f_573_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_533_)
				       + (((Class166_Sub3) this).aFloat9980
					  * (float) i_569_)
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_534_)));
		    f_536_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_533_)
				 + (((Class166_Sub3) this).aFloat9989
				    * (float) i_569_)
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_534_)));
		    if (f_573_ < -f_536_)
			return;
		    float f_574_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_533_)
				       + (((Class166_Sub3) this).aFloat9980
					  * (float) i_570_)
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_535_)));
		    f_537_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_533_)
				 + (((Class166_Sub3) this).aFloat9989
				    * (float) i_570_)
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_535_)));
		    if (f_574_ < -f_537_)
			return;
		    float f_575_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_532_)
				       + (((Class166_Sub3) this).aFloat9980
					  * (float) i_571_)
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_535_)));
		    f_538_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_532_)
				 + (((Class166_Sub3) this).aFloat9989
				    * (float) i_571_)
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_535_)));
		    if (f_575_ < -f_538_)
			return;
		    float f_576_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_532_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_568_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_534_)));
		    f_539_ = (((Class155) class155).aFloat1727
			      + ((Class155) class155).aFloat1728 * f_576_ / f);
		    float f_577_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_532_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_568_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_534_)));
		    f_540_ = (((Class155) class155).aFloat1731
			      + ((Class155) class155).aFloat1729 * f_577_ / f);
		    f_541_ = (((Class155) class155).aFloat1720
			      + ((Class155) class155).aFloat1732 * f_572_ / f);
		    float f_578_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_533_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_569_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_534_)));
		    f_542_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_578_
				 / f_536_));
		    float f_579_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_533_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_569_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_534_)));
		    f_543_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_579_
				 / f_536_));
		    f_544_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_573_
				 / f_536_));
		    float f_580_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_533_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_570_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_535_)));
		    f_545_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_580_
				 / f_537_));
		    float f_581_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_533_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_570_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_535_)));
		    f_546_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_581_
				 / f_537_));
		    f_547_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_574_
				 / f_537_));
		    float f_582_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_532_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_571_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_535_)));
		    f_548_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_582_
				 / f_538_));
		    float f_583_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_532_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_571_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_535_)));
		    f_549_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_583_
				 / f_538_));
		    f_550_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_575_
				 / f_538_));
		}
		int i_584_ = -1;
		if (((Class182) class182).aShort2149 != -1)
		    i_584_ = (((Class166_Sub3) this).aClass103_Sub2_9962
				  .aClass107_1458.method2680
			      (((Class182) class182).aShort2149 & 0xffff,
			       -1830541450)
			      .anInt1403) * 218388063;
		if (((f_545_ - f_548_) * (f_543_ - f_549_)
		     - (f_546_ - f_549_) * (f_542_ - f_548_))
		    > 0.0F) {
		    ((Class155) class155).aBool1748
			= (f_545_ < 0.0F || f_548_ < 0.0F || f_542_ < 0.0F
			   || f_545_ > (float) ((Class155) class155).anInt1733
			   || f_548_ > (float) ((Class155) class155).anInt1733
			   || (f_542_
			       > (float) ((Class155) class155).anInt1733));
		    if (i_584_ >= 0)
			class155.method3384
			    (true, true, false, f_546_, f_549_, f_543_, f_545_,
			     f_548_, f_542_, f_547_, f_550_, f_544_, f_537_,
			     f_538_, f_536_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F,
			     0.0F,
			     ~0xffffff | (Class474.anIntArray6382
					  [(((Class182) class182).aShort2147
					    & 0xffff)]) & 0xffffff,
			     ~0xffffff | (Class474.anIntArray6382
					  [(((Class182) class182).aShort2152
					    & 0xffff)]) & 0xffffff,
			     ~0xffffff | (Class474.anIntArray6382
					  [(((Class182) class182).aShort2148
					    & 0xffff)]) & 0xffffff,
			     0, 0.0F, 0.0F, 0.0F,
			     ((Class182) class182).aShort2149 & 0xffff,
			     i_584_);
		    else
			class155.method3380
			    (true, true, false, f_546_, f_549_, f_543_, f_545_,
			     f_548_, f_542_, f_547_, f_550_, f_544_,
			     (float) (((Class182) class182).aShort2147
				      & 0xffff),
			     (float) (((Class182) class182).aShort2152
				      & 0xffff),
			     (float) (((Class182) class182).aShort2148
				      & 0xffff));
		}
		if (((f_539_ - f_542_) * (f_549_ - f_543_)
		     - (f_540_ - f_543_) * (f_548_ - f_542_))
		    > 0.0F) {
		    ((Class155) class155).aBool1748
			= (f_539_ < 0.0F || f_542_ < 0.0F || f_548_ < 0.0F
			   || f_539_ > (float) ((Class155) class155).anInt1733
			   || f_542_ > (float) ((Class155) class155).anInt1733
			   || (f_548_
			       > (float) ((Class155) class155).anInt1733));
		    if (i_584_ >= 0)
			class155.method3384
			    (true, true, false, f_540_, f_543_, f_549_, f_539_,
			     f_542_, f_548_, f_541_, f_544_, f_550_, f, f_536_,
			     f_538_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
			     ~0xffffff | (Class474.anIntArray6382
					  [(((Class182) class182).aShort2146
					    & 0xffff)]) & 0xffffff,
			     ~0xffffff | (Class474.anIntArray6382
					  [(((Class182) class182).aShort2148
					    & 0xffff)]) & 0xffffff,
			     ~0xffffff | (Class474.anIntArray6382
					  [(((Class182) class182).aShort2152
					    & 0xffff)]) & 0xffffff,
			     0, 0.0F, 0.0F, 0.0F,
			     ((Class182) class182).aShort2149 & 0xffff,
			     i_584_);
		    else
			class155.method3380
			    (true, true, false, f_540_, f_543_, f_549_, f_539_,
			     f_542_, f_548_, f_541_, f_544_, f_550_,
			     (float) (((Class182) class182).aShort2146
				      & 0xffff),
			     (float) (((Class182) class182).aShort2148
				      & 0xffff),
			     (float) (((Class182) class182).aShort2152
				      & 0xffff));
		}
	    }
	} else {
	    Class205 class205
		= ((Class166_Sub3) this).aClass205ArrayArray9970[i][i_526_];
	    if (class205 != null) {
		if (i_531_ != 0) {
		    if ((((Class205) class205).aByte2432 & 0x4) != 0) {
			if ((i_531_ & 0x1) != 0)
			    return;
		    } else if ((i_531_ & 0x2) != 0)
			return;
		}
		for (int i_585_ = 0; i_585_ < ((Class205) class205).aShort2431;
		     i_585_++) {
		    int i_586_ = (((Class205) class205).aShortArray2433[i_585_]
				  + (i << anInt2054 * -122333825));
		    short i_587_
			= ((Class205) class205).aShortArray2439[i_585_];
		    int i_588_ = (((Class205) class205).aShortArray2438[i_585_]
				  + (i_526_ << anInt2054 * -122333825));
		    float f = (((Class166_Sub3) this).aFloat9988
			       + ((((Class166_Sub3) this).aFloat9976
				   * (float) i_586_)
				  + (((Class166_Sub3) this).aFloat9980
				     * (float) i_587_)
				  + (((Class166_Sub3) this).aFloat9984
				     * (float) i_588_)));
		    float f_589_ = (((Class166_Sub3) this).aFloat9974
				    + ((((Class166_Sub3) this).aFloat9977
					* (float) i_586_)
				       + (((Class166_Sub3) this).aFloat9989
					  * (float) i_587_)
				       + (((Class166_Sub3) this).aFloat9985
					  * (float) i_588_)));
		    if (f < -f_589_)
			return;
		    float f_590_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_586_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_587_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_588_)));
		    float f_591_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_586_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_587_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_588_)));
		    fs[i_585_] = (((Class155) class155).aFloat1727
				  + (((Class155) class155).aFloat1728 * f_590_
				     / f_589_));
		    fs_527_[i_585_] = (((Class155) class155).aFloat1731
				       + (((Class155) class155).aFloat1729
					  * f_591_ / f_589_));
		    fs_528_[i_585_]
			= (((Class155) class155).aFloat1720
			   + ((Class155) class155).aFloat1732 * f / f_589_);
		    fs_529_[i_585_] = f_589_;
		}
		if (((Class205) class205).aShortArray2440 != null) {
		    for (int i_592_ = 0;
			 i_592_ < ((Class205) class205).aShort2441; i_592_++) {
			short i_593_
			    = ((Class205) class205).aShortArray2437[i_592_];
			short i_594_
			    = ((Class205) class205).aShortArray2430[i_592_];
			short i_595_
			    = ((Class205) class205).aShortArray2443[i_592_];
			float f = fs[i_593_];
			float f_596_ = fs[i_594_];
			float f_597_ = fs[i_595_];
			float f_598_ = fs_527_[i_593_];
			float f_599_ = fs_527_[i_594_];
			float f_600_ = fs_527_[i_595_];
			if (((f - f_596_) * (f_600_ - f_599_)
			     - (f_598_ - f_599_) * (f_597_ - f_596_))
			    > 0.0F) {
			    ((Class155) class155).aBool1748
				= (f < 0.0F || f_596_ < 0.0F || f_597_ < 0.0F
				   || f > (float) (((Class155) class155)
						   .anInt1733)
				   || f_596_ > (float) (((Class155) class155)
							.anInt1733)
				   || f_597_ > (float) (((Class155) class155)
							.anInt1733));
			    int i_601_ = -1;
			    if (((Class205) class205).aShortArray2440[i_592_]
				!= -1)
				i_601_ = (((Class166_Sub3) this)
					      .aClass103_Sub2_9962
					      .aClass107_1458.method2680
					  ((((Class205) class205)
					    .aShortArray2440[i_592_]) & 0xffff,
					   585278454)
					  .anInt1403) * 218388063;
			    if (i_601_ != -1)
				class155.method3384
				    (true, true, false, f_598_, f_599_, f_600_,
				     f, f_596_, f_597_, fs_528_[i_593_],
				     fs_528_[i_594_], fs_528_[i_595_],
				     fs_529_[i_593_], fs_529_[i_594_],
				     fs_529_[i_595_],
				     ((float) (((Class205) class205)
					       .aShortArray2433[i_593_])
				      / (float) (anInt2053 * 2039042417)),
				     ((float) (((Class205) class205)
					       .aShortArray2433[i_594_])
				      / (float) (anInt2053 * 2039042417)),
				     ((float) (((Class205) class205)
					       .aShortArray2433[i_595_])
				      / (float) (anInt2053 * 2039042417)),
				     ((float) (((Class205) class205)
					       .aShortArray2438[i_593_])
				      / (float) (anInt2053 * 2039042417)),
				     ((float) (((Class205) class205)
					       .aShortArray2438[i_594_])
				      / (float) (anInt2053 * 2039042417)),
				     ((float) (((Class205) class205)
					       .aShortArray2438[i_595_])
				      / (float) (anInt2053 * 2039042417)),
				     ~0xffffff | (Class474.anIntArray6382
						  [((((Class205) class205)
						     .aShortArray2436[i_593_])
						    & 0xffff)]) & 0xffffff,
				     ~0xffffff | (Class474.anIntArray6382
						  [((((Class205) class205)
						     .aShortArray2436[i_594_])
						    & 0xffff)]) & 0xffffff,
				     ~0xffffff | (Class474.anIntArray6382
						  [((((Class205) class205)
						     .aShortArray2436[i_595_])
						    & 0xffff)]) & 0xffffff,
				     0, 0.0F, 0.0F, 0.0F,
				     (((Class205) class205).aShortArray2440
				      [i_592_]) & 0xffff,
				     i_601_);
			    else {
				int i_602_ = (((Class205) class205)
					      .anIntArray2442[i_592_]);
				if (i_602_ != -1)
				    class155.method3380
					(true, true, false, f_598_, f_599_,
					 f_600_, f, f_596_, f_597_,
					 fs_528_[i_593_], fs_528_[i_594_],
					 fs_528_[i_595_],
					 (float) (Class639.method13606
						  (i_602_,
						   (((Class205) class205)
						    .aShortArray2436[i_593_]),
						   1247453784)),
					 (float) (Class639.method13606
						  (i_602_,
						   (((Class205) class205)
						    .aShortArray2436[i_594_]),
						   1879533554)),
					 (float) (Class639.method13606
						  (i_602_,
						   (((Class205) class205)
						    .aShortArray2436[i_595_]),
						   -1102598886)));
			    }
			}
		    }
		} else {
		    for (int i_603_ = 0;
			 i_603_ < ((Class205) class205).aShort2441; i_603_++) {
			short i_604_
			    = ((Class205) class205).aShortArray2437[i_603_];
			short i_605_
			    = ((Class205) class205).aShortArray2430[i_603_];
			short i_606_
			    = ((Class205) class205).aShortArray2443[i_603_];
			float f = fs[i_604_];
			float f_607_ = fs[i_605_];
			float f_608_ = fs[i_606_];
			float f_609_ = fs_527_[i_604_];
			float f_610_ = fs_527_[i_605_];
			float f_611_ = fs_527_[i_606_];
			if (((f - f_607_) * (f_611_ - f_610_)
			     - (f_609_ - f_610_) * (f_608_ - f_607_))
			    > 0.0F) {
			    int i_612_
				= ((Class205) class205).anIntArray2442[i_603_];
			    if (i_612_ != -1) {
				((Class155) class155).aBool1748
				    = (f < 0.0F || f_607_ < 0.0F
				       || f_608_ < 0.0F
				       || f > (float) (((Class155) class155)
						       .anInt1733)
				       || f_607_ > (float) ((Class155)
							    class155).anInt1733
				       || (f_608_
					   > (float) (((Class155) class155)
						      .anInt1733)));
				class155.method3380
				    (true, true, false, f_609_, f_610_, f_611_,
				     f, f_607_, f_608_, fs_528_[i_604_],
				     fs_528_[i_605_], fs_528_[i_606_],
				     (float) (Class639.method13606
					      (i_612_,
					       (((Class205) class205)
						.aShortArray2436[i_604_]),
					       434163672)),
				     (float) (Class639.method13606
					      (i_612_,
					       (((Class205) class205)
						.aShortArray2436[i_605_]),
					       458190910)),
				     (float) (Class639.method13606
					      (i_612_,
					       (((Class205) class205)
						.aShortArray2436[i_606_]),
					       2063372718)));
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method3560(int i, int i_613_, int[] is, int[] is_614_,
			   int[] is_615_, int[] is_616_, int[] is_617_,
			   int[] is_618_, int[] is_619_, int[] is_620_,
			   int[] is_621_, int[] is_622_, int[] is_623_,
			   Class86 class86, boolean bool) {
	if (((Class166_Sub3) this).aClass182ArrayArray9975 == null) {
	    ((Class166_Sub3) this).aClass182ArrayArray9975
		= new Class182[anInt2055 * 266270313][anInt2052 * -14610189];
	    ((Class166_Sub3) this).aClass205ArrayArray9970
		= new Class205[anInt2055 * 266270313][anInt2052 * -14610189];
	} else if (((Class166_Sub3) this).aClass201ArrayArray9967 != null
		   || ((Class166_Sub3) this).aClass143ArrayArray9979 != null)
	    throw new IllegalStateException();
	boolean bool_624_ = false;
	if (is_620_.length == 2 && is_617_.length == 2
	    && (is_620_[0] == is_620_[1]
		|| is_622_[0] != -1 && is_622_[0] == is_622_[1])) {
	    bool_624_ = true;
	    for (int i_625_ = 1; i_625_ < 2; i_625_++) {
		int i_626_ = is[is_617_[i_625_]];
		int i_627_ = is_615_[is_617_[i_625_]];
		if (i_626_ != 0 && i_626_ != anInt2053 * 2039042417
		    || i_627_ != 0 && i_627_ != anInt2053 * 2039042417) {
		    bool_624_ = false;
		    break;
		}
	    }
	}
	if (!bool_624_) {
	    Class205 class205 = new Class205();
	    short i_628_ = (short) is.length;
	    int i_629_ = (short) is_620_.length;
	    ((Class205) class205).aShort2431 = i_628_;
	    ((Class205) class205).aShortArray2436 = new short[i_628_];
	    ((Class205) class205).aShortArray2433 = new short[i_628_];
	    ((Class205) class205).aShortArray2439 = new short[i_628_];
	    ((Class205) class205).aShortArray2438 = new short[i_628_];
	    for (int i_630_ = 0; i_630_ < i_628_; i_630_++) {
		int i_631_ = is[i_630_];
		int i_632_ = is_615_[i_630_];
		if (i_631_ == 0 && i_632_ == 0)
		    ((Class205) class205).aShortArray2436[i_630_]
			= (short) ((((Class166_Sub3) this).aByteArrayArray9990
				    [i][i_613_])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i][i_613_]));
		else if (i_631_ == 0 && i_632_ == anInt2053 * 2039042417)
		    ((Class205) class205).aShortArray2436[i_630_]
			= (short) ((((Class166_Sub3) this).aByteArrayArray9990
				    [i][i_613_ + 1])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i][i_613_ + 1]));
		else if (i_631_ == anInt2053 * 2039042417
			 && i_632_ == anInt2053 * 2039042417)
		    ((Class205) class205).aShortArray2436[i_630_]
			= (short) ((((Class166_Sub3) this).aByteArrayArray9990
				    [i + 1][i_613_ + 1])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i + 1]
				      [i_613_ + 1]));
		else if (i_631_ == anInt2053 * 2039042417 && i_632_ == 0)
		    ((Class205) class205).aShortArray2436[i_630_]
			= (short) ((((Class166_Sub3) this).aByteArrayArray9990
				    [i + 1][i_613_])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i + 1][i_613_]));
		else {
		    int i_633_
			= (((((Class166_Sub3) this).aByteArrayArray9990[i]
			     [i_613_])
			    - (((Class166_Sub3) this).aByteArrayArray9991[i]
			       [i_613_])) * (anInt2053 * 2039042417 - i_631_)
			   + ((((Class166_Sub3) this).aByteArrayArray9990
			       [i + 1][i_613_])
			      - (((Class166_Sub3) this).aByteArrayArray9991
				 [i + 1][i_613_])) * i_631_);
		    int i_634_
			= ((((((Class166_Sub3) this).aByteArrayArray9990[i]
			      [i_613_ + 1])
			     - (((Class166_Sub3) this).aByteArrayArray9991[i]
				[i_613_ + 1]))
			    * (anInt2053 * 2039042417 - i_631_))
			   + ((((Class166_Sub3) this).aByteArrayArray9990
			       [i + 1][i_613_ + 1])
			      - (((Class166_Sub3) this).aByteArrayArray9991
				 [i + 1][i_613_ + 1])) * i_631_);
		    ((Class205) class205).aShortArray2436[i_630_]
			= (short) ((i_633_ * (anInt2053 * 2039042417 - i_632_)
				    + i_634_ * i_632_)
				   >> anInt2054 * -244667650);
		}
		int i_635_ = (i << anInt2054 * -122333825) + i_631_;
		int i_636_ = (i_613_ << anInt2054 * -122333825) + i_632_;
		((Class205) class205).aShortArray2433[i_630_] = (short) i_631_;
		((Class205) class205).aShortArray2438[i_630_] = (short) i_632_;
		((Class205) class205).aShortArray2439[i_630_]
		    = (short) (method3574(i_635_, i_636_, -1761314037)
			       + (is_614_ != null ? is_614_[i_630_] : 0));
		if (((Class205) class205).aShortArray2436[i_630_] < 2)
		    ((Class205) class205).aShortArray2436[i_630_] = (short) 2;
	    }
	    boolean bool_637_ = false;
	    int i_638_ = 0;
	    for (int i_639_ = 0; i_639_ < i_629_; i_639_++) {
		if (is_620_[i_639_] >= 0
		    || is_621_ != null && is_621_[i_639_] >= 0)
		    i_638_++;
		int i_640_ = is_622_[i_639_];
		if (i_640_ != -1) {
		    Class101 class101
			= ((Class166_Sub3) this).aClass103_Sub2_9962
			      .aClass107_1458.method2680(i_640_, -21710470);
		    if (!class101.aBool1434) {
			bool_637_ = true;
			if (method16256(class101.aByte1427)
			    || class101.aByte1376 != 0
			    || class101.aByte1396 != 0)
			    ((Class205) class205).aByte2432 |= 0x4;
		    }
		}
	    }
	    ((Class205) class205).anIntArray2442 = new int[i_638_];
	    if (is_621_ != null)
		((Class205) class205).anIntArray2435 = new int[i_638_];
	    ((Class205) class205).aShortArray2437 = new short[i_638_];
	    ((Class205) class205).aShortArray2430 = new short[i_638_];
	    ((Class205) class205).aShortArray2443 = new short[i_638_];
	    if (bool_637_) {
		((Class205) class205).aShortArray2440 = new short[i_638_];
		((Class205) class205).aShortArray2434 = new short[i_638_];
	    }
	    for (int i_641_ = 0; i_641_ < i_629_; i_641_++) {
		if (is_620_[i_641_] >= 0
		    || is_621_ != null && is_621_[i_641_] >= 0) {
		    if (is_620_[i_641_] >= 0)
			((Class205) class205).anIntArray2442
			    [((Class205) class205).aShort2441]
			    = Class241_Sub42.method16451(is_620_[i_641_],
							 1358410357);
		    else
			((Class205) class205).anIntArray2442
			    [((Class205) class205).aShort2441]
			    = -1;
		    if (is_621_ != null) {
			if (is_621_[i_641_] != -1)
			    ((Class205) class205).anIntArray2435
				[((Class205) class205).aShort2441]
				= Class241_Sub42.method16451(is_621_[i_641_],
							     568267807);
			else
			    ((Class205) class205).anIntArray2435
				[((Class205) class205).aShort2441]
				= -1;
		    }
		    ((Class205) class205).aShortArray2437
			[((Class205) class205).aShort2441]
			= (short) is_617_[i_641_];
		    ((Class205) class205).aShortArray2430
			[((Class205) class205).aShort2441]
			= (short) is_618_[i_641_];
		    ((Class205) class205).aShortArray2443
			[((Class205) class205).aShort2441]
			= (short) is_619_[i_641_];
		    if (bool_637_) {
			if (is_622_[i_641_] != -1
			    && !(((Class166_Sub3) this).aClass103_Sub2_9962
				     .aClass107_1458.method2680
				 (is_622_[i_641_], 2116306397).aBool1434)) {
			    ((Class205) class205).aShortArray2440
				[((Class205) class205).aShort2441]
				= (short) is_622_[i_641_];
			    ((Class205) class205).aShortArray2434
				[((Class205) class205).aShort2441]
				= (short) is_623_[i_641_];
			} else
			    ((Class205) class205).aShortArray2440
				[((Class205) class205).aShort2441]
				= (short) -1;
		    }
		    ((Class205) class205).aShort2441++;
		}
	    }
	    ((Class166_Sub3) this).aClass205ArrayArray9970[i][i_613_]
		= class205;
	} else if (is_620_[0] >= 0 || is_621_ != null && is_621_[0] >= 0) {
	    Class182 class182 = new Class182();
	    int i_642_ = is_620_[0];
	    int i_643_ = is_622_[0];
	    if (is_621_ != null) {
		((Class182) class182).anInt2151
		    = (Class639.method13606
		       (Class241_Sub42.method16451(is_621_[0], 350190182),
			(((Class166_Sub3) this).aByteArrayArray9990[i][i_613_]
			 - (((Class166_Sub3) this).aByteArrayArray9991[i]
			    [i_613_])),
			1529409895));
		if (i_642_ == -1)
		    ((Class182) class182).aByte2150 |= 0x2;
	    }
	    if ((anIntArrayArray2051[i][i_613_]
		 == anIntArrayArray2051[i + 1][i_613_])
		&& (anIntArrayArray2051[i][i_613_]
		    == anIntArrayArray2051[i + 1][i_613_ + 1])
		&& (anIntArrayArray2051[i][i_613_]
		    == anIntArrayArray2051[i][i_613_ + 1]))
		((Class182) class182).aByte2150 |= 0x1;
	    Class101 class101 = null;
	    if (i_643_ != -1)
		class101 = ((Class166_Sub3) this).aClass103_Sub2_9962
			       .aClass107_1458.method2680(i_643_, 1753377457);
	    if (class101 != null
		&& (((Class182) class182).aByte2150 & 0x2) == 0
		&& !class101.aBool1434) {
		((Class182) class182).aShort2146
		    = (short) ((((Class166_Sub3) this).aByteArrayArray9990[i]
				[i_613_])
			       - (((Class166_Sub3) this).aByteArrayArray9991[i]
				  [i_613_]));
		((Class182) class182).aShort2148
		    = (short) ((((Class166_Sub3) this).aByteArrayArray9990
				[i + 1][i_613_])
			       - (((Class166_Sub3) this).aByteArrayArray9991
				  [i + 1][i_613_]));
		((Class182) class182).aShort2147
		    = (short) ((((Class166_Sub3) this).aByteArrayArray9990
				[i + 1][i_613_ + 1])
			       - (((Class166_Sub3) this).aByteArrayArray9991
				  [i + 1][i_613_ + 1]));
		((Class182) class182).aShort2152
		    = (short) ((((Class166_Sub3) this).aByteArrayArray9990[i]
				[i_613_ + 1])
			       - (((Class166_Sub3) this).aByteArrayArray9991[i]
				  [i_613_ + 1]));
		((Class182) class182).aShort2149 = (short) i_643_;
		if (method16256(class101.aByte1427) || class101.aByte1376 != 0
		    || class101.aByte1396 != 0)
		    ((Class182) class182).aByte2150 |= 0x4;
	    } else {
		short i_644_ = Class241_Sub42.method16451(i_642_, -1562927849);
		((Class182) class182).aShort2146
		    = (short) Class639.method13606(i_644_,
						   ((((Class166_Sub3) this)
						     .aByteArrayArray9990[i]
						     [i_613_])
						    - (((Class166_Sub3) this)
						       .aByteArrayArray9991[i]
						       [i_613_])),
						   -2016653349);
		((Class182) class182).aShort2148
		    = (short) Class639.method13606(i_644_,
						   ((((Class166_Sub3) this)
						     .aByteArrayArray9990
						     [i + 1][i_613_])
						    - (((Class166_Sub3) this)
						       .aByteArrayArray9991
						       [i + 1][i_613_])),
						   -1738750580);
		((Class182) class182).aShort2147
		    = (short) Class639.method13606(i_644_,
						   ((((Class166_Sub3) this)
						     .aByteArrayArray9990
						     [i + 1][i_613_ + 1])
						    - (((Class166_Sub3) this)
						       .aByteArrayArray9991
						       [i + 1][i_613_ + 1])),
						   682240053);
		((Class182) class182).aShort2152
		    = (short) Class639.method13606(i_644_,
						   ((((Class166_Sub3) this)
						     .aByteArrayArray9990[i]
						     [i_613_ + 1])
						    - (((Class166_Sub3) this)
						       .aByteArrayArray9991[i]
						       [i_613_ + 1])),
						   1474896871);
		((Class182) class182).aShort2149 = (short) -1;
	    }
	    ((Class166_Sub3) this).aClass182ArrayArray9975[i][i_613_]
		= class182;
	}
    }
    
    void method16250(int i, int i_645_, int i_646_) {
	Class189 class189 = ((Class166_Sub3) this).aClass103_Sub2_9962
				.method15377(Thread.currentThread());
	((Class155) ((Class189) class189).aClass155_2223).anInt1723 = 0;
	if (((Class166_Sub3) this).aClass201ArrayArray9967 != null)
	    method16241(i, i_645_, ((Class189) class189).aBool2217, class189,
			((Class189) class189).aClass155_2223,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211,
			((Class189) class189).aFloatArray2251,
			((Class189) class189).aFloatArray2252,
			((Class189) class189).aFloatArray2250, i_646_);
	else if (((Class166_Sub3) this).aClass182ArrayArray9975 != null)
	    method16249(i, i_645_, ((Class189) class189).aClass155_2223,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211,
			((Class189) class189).aFloatArray2251,
			((Class189) class189).aFloatArray2252,
			((Class189) class189).aFloatArray2250, i_646_);
	else if (((Class166_Sub3) this).aClass143ArrayArray9979 != null)
	    method16248(i, i_645_, ((Class189) class189).aBool2217, class189,
			((Class189) class189).aClass155_2223,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211,
			((Class189) class189).aFloatArray2251,
			((Class189) class189).aFloatArray2252,
			((Class189) class189).aFloatArray2250, i_646_);
    }
    
    public void method3562(int i, int i_647_, int[] is, int[] is_648_,
			   int[] is_649_, int[] is_650_, int[] is_651_,
			   int[] is_652_, int[] is_653_, int[] is_654_,
			   int[] is_655_, int[] is_656_, int[] is_657_,
			   Class86 class86, boolean bool) {
	if (((Class166_Sub3) this).aClass182ArrayArray9975 == null) {
	    ((Class166_Sub3) this).aClass182ArrayArray9975
		= new Class182[anInt2055 * 266270313][anInt2052 * -14610189];
	    ((Class166_Sub3) this).aClass205ArrayArray9970
		= new Class205[anInt2055 * 266270313][anInt2052 * -14610189];
	} else if (((Class166_Sub3) this).aClass201ArrayArray9967 != null
		   || ((Class166_Sub3) this).aClass143ArrayArray9979 != null)
	    throw new IllegalStateException();
	boolean bool_658_ = false;
	if (is_654_.length == 2 && is_651_.length == 2
	    && (is_654_[0] == is_654_[1]
		|| is_656_[0] != -1 && is_656_[0] == is_656_[1])) {
	    bool_658_ = true;
	    for (int i_659_ = 1; i_659_ < 2; i_659_++) {
		int i_660_ = is[is_651_[i_659_]];
		int i_661_ = is_649_[is_651_[i_659_]];
		if (i_660_ != 0 && i_660_ != anInt2053 * 2039042417
		    || i_661_ != 0 && i_661_ != anInt2053 * 2039042417) {
		    bool_658_ = false;
		    break;
		}
	    }
	}
	if (!bool_658_) {
	    Class205 class205 = new Class205();
	    short i_662_ = (short) is.length;
	    int i_663_ = (short) is_654_.length;
	    ((Class205) class205).aShort2431 = i_662_;
	    ((Class205) class205).aShortArray2436 = new short[i_662_];
	    ((Class205) class205).aShortArray2433 = new short[i_662_];
	    ((Class205) class205).aShortArray2439 = new short[i_662_];
	    ((Class205) class205).aShortArray2438 = new short[i_662_];
	    for (int i_664_ = 0; i_664_ < i_662_; i_664_++) {
		int i_665_ = is[i_664_];
		int i_666_ = is_649_[i_664_];
		if (i_665_ == 0 && i_666_ == 0)
		    ((Class205) class205).aShortArray2436[i_664_]
			= (short) ((((Class166_Sub3) this).aByteArrayArray9990
				    [i][i_647_])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i][i_647_]));
		else if (i_665_ == 0 && i_666_ == anInt2053 * 2039042417)
		    ((Class205) class205).aShortArray2436[i_664_]
			= (short) ((((Class166_Sub3) this).aByteArrayArray9990
				    [i][i_647_ + 1])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i][i_647_ + 1]));
		else if (i_665_ == anInt2053 * 2039042417
			 && i_666_ == anInt2053 * 2039042417)
		    ((Class205) class205).aShortArray2436[i_664_]
			= (short) ((((Class166_Sub3) this).aByteArrayArray9990
				    [i + 1][i_647_ + 1])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i + 1]
				      [i_647_ + 1]));
		else if (i_665_ == anInt2053 * 2039042417 && i_666_ == 0)
		    ((Class205) class205).aShortArray2436[i_664_]
			= (short) ((((Class166_Sub3) this).aByteArrayArray9990
				    [i + 1][i_647_])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i + 1][i_647_]));
		else {
		    int i_667_
			= (((((Class166_Sub3) this).aByteArrayArray9990[i]
			     [i_647_])
			    - (((Class166_Sub3) this).aByteArrayArray9991[i]
			       [i_647_])) * (anInt2053 * 2039042417 - i_665_)
			   + ((((Class166_Sub3) this).aByteArrayArray9990
			       [i + 1][i_647_])
			      - (((Class166_Sub3) this).aByteArrayArray9991
				 [i + 1][i_647_])) * i_665_);
		    int i_668_
			= ((((((Class166_Sub3) this).aByteArrayArray9990[i]
			      [i_647_ + 1])
			     - (((Class166_Sub3) this).aByteArrayArray9991[i]
				[i_647_ + 1]))
			    * (anInt2053 * 2039042417 - i_665_))
			   + ((((Class166_Sub3) this).aByteArrayArray9990
			       [i + 1][i_647_ + 1])
			      - (((Class166_Sub3) this).aByteArrayArray9991
				 [i + 1][i_647_ + 1])) * i_665_);
		    ((Class205) class205).aShortArray2436[i_664_]
			= (short) ((i_667_ * (anInt2053 * 2039042417 - i_666_)
				    + i_668_ * i_666_)
				   >> anInt2054 * -244667650);
		}
		int i_669_ = (i << anInt2054 * -122333825) + i_665_;
		int i_670_ = (i_647_ << anInt2054 * -122333825) + i_666_;
		((Class205) class205).aShortArray2433[i_664_] = (short) i_665_;
		((Class205) class205).aShortArray2438[i_664_] = (short) i_666_;
		((Class205) class205).aShortArray2439[i_664_]
		    = (short) (method3574(i_669_, i_670_, 613761838)
			       + (is_648_ != null ? is_648_[i_664_] : 0));
		if (((Class205) class205).aShortArray2436[i_664_] < 2)
		    ((Class205) class205).aShortArray2436[i_664_] = (short) 2;
	    }
	    boolean bool_671_ = false;
	    int i_672_ = 0;
	    for (int i_673_ = 0; i_673_ < i_663_; i_673_++) {
		if (is_654_[i_673_] >= 0
		    || is_655_ != null && is_655_[i_673_] >= 0)
		    i_672_++;
		int i_674_ = is_656_[i_673_];
		if (i_674_ != -1) {
		    Class101 class101
			= ((Class166_Sub3) this).aClass103_Sub2_9962
			      .aClass107_1458.method2680(i_674_, 237159724);
		    if (!class101.aBool1434) {
			bool_671_ = true;
			if (method16256(class101.aByte1427)
			    || class101.aByte1376 != 0
			    || class101.aByte1396 != 0)
			    ((Class205) class205).aByte2432 |= 0x4;
		    }
		}
	    }
	    ((Class205) class205).anIntArray2442 = new int[i_672_];
	    if (is_655_ != null)
		((Class205) class205).anIntArray2435 = new int[i_672_];
	    ((Class205) class205).aShortArray2437 = new short[i_672_];
	    ((Class205) class205).aShortArray2430 = new short[i_672_];
	    ((Class205) class205).aShortArray2443 = new short[i_672_];
	    if (bool_671_) {
		((Class205) class205).aShortArray2440 = new short[i_672_];
		((Class205) class205).aShortArray2434 = new short[i_672_];
	    }
	    for (int i_675_ = 0; i_675_ < i_663_; i_675_++) {
		if (is_654_[i_675_] >= 0
		    || is_655_ != null && is_655_[i_675_] >= 0) {
		    if (is_654_[i_675_] >= 0)
			((Class205) class205).anIntArray2442
			    [((Class205) class205).aShort2441]
			    = Class241_Sub42.method16451(is_654_[i_675_],
							 984111166);
		    else
			((Class205) class205).anIntArray2442
			    [((Class205) class205).aShort2441]
			    = -1;
		    if (is_655_ != null) {
			if (is_655_[i_675_] != -1)
			    ((Class205) class205).anIntArray2435
				[((Class205) class205).aShort2441]
				= Class241_Sub42.method16451(is_655_[i_675_],
							     1130142246);
			else
			    ((Class205) class205).anIntArray2435
				[((Class205) class205).aShort2441]
				= -1;
		    }
		    ((Class205) class205).aShortArray2437
			[((Class205) class205).aShort2441]
			= (short) is_651_[i_675_];
		    ((Class205) class205).aShortArray2430
			[((Class205) class205).aShort2441]
			= (short) is_652_[i_675_];
		    ((Class205) class205).aShortArray2443
			[((Class205) class205).aShort2441]
			= (short) is_653_[i_675_];
		    if (bool_671_) {
			if (is_656_[i_675_] != -1
			    && !(((Class166_Sub3) this).aClass103_Sub2_9962
				     .aClass107_1458.method2680
				 (is_656_[i_675_], -692784015).aBool1434)) {
			    ((Class205) class205).aShortArray2440
				[((Class205) class205).aShort2441]
				= (short) is_656_[i_675_];
			    ((Class205) class205).aShortArray2434
				[((Class205) class205).aShort2441]
				= (short) is_657_[i_675_];
			} else
			    ((Class205) class205).aShortArray2440
				[((Class205) class205).aShort2441]
				= (short) -1;
		    }
		    ((Class205) class205).aShort2441++;
		}
	    }
	    ((Class166_Sub3) this).aClass205ArrayArray9970[i][i_647_]
		= class205;
	} else if (is_654_[0] >= 0 || is_655_ != null && is_655_[0] >= 0) {
	    Class182 class182 = new Class182();
	    int i_676_ = is_654_[0];
	    int i_677_ = is_656_[0];
	    if (is_655_ != null) {
		((Class182) class182).anInt2151
		    = (Class639.method13606
		       (Class241_Sub42.method16451(is_655_[0], 1505372798),
			(((Class166_Sub3) this).aByteArrayArray9990[i][i_647_]
			 - (((Class166_Sub3) this).aByteArrayArray9991[i]
			    [i_647_])),
			927934638));
		if (i_676_ == -1)
		    ((Class182) class182).aByte2150 |= 0x2;
	    }
	    if ((anIntArrayArray2051[i][i_647_]
		 == anIntArrayArray2051[i + 1][i_647_])
		&& (anIntArrayArray2051[i][i_647_]
		    == anIntArrayArray2051[i + 1][i_647_ + 1])
		&& (anIntArrayArray2051[i][i_647_]
		    == anIntArrayArray2051[i][i_647_ + 1]))
		((Class182) class182).aByte2150 |= 0x1;
	    Class101 class101 = null;
	    if (i_677_ != -1)
		class101 = ((Class166_Sub3) this).aClass103_Sub2_9962
			       .aClass107_1458.method2680(i_677_, 1357368452);
	    if (class101 != null
		&& (((Class182) class182).aByte2150 & 0x2) == 0
		&& !class101.aBool1434) {
		((Class182) class182).aShort2146
		    = (short) ((((Class166_Sub3) this).aByteArrayArray9990[i]
				[i_647_])
			       - (((Class166_Sub3) this).aByteArrayArray9991[i]
				  [i_647_]));
		((Class182) class182).aShort2148
		    = (short) ((((Class166_Sub3) this).aByteArrayArray9990
				[i + 1][i_647_])
			       - (((Class166_Sub3) this).aByteArrayArray9991
				  [i + 1][i_647_]));
		((Class182) class182).aShort2147
		    = (short) ((((Class166_Sub3) this).aByteArrayArray9990
				[i + 1][i_647_ + 1])
			       - (((Class166_Sub3) this).aByteArrayArray9991
				  [i + 1][i_647_ + 1]));
		((Class182) class182).aShort2152
		    = (short) ((((Class166_Sub3) this).aByteArrayArray9990[i]
				[i_647_ + 1])
			       - (((Class166_Sub3) this).aByteArrayArray9991[i]
				  [i_647_ + 1]));
		((Class182) class182).aShort2149 = (short) i_677_;
		if (method16256(class101.aByte1427) || class101.aByte1376 != 0
		    || class101.aByte1396 != 0)
		    ((Class182) class182).aByte2150 |= 0x4;
	    } else {
		short i_678_ = Class241_Sub42.method16451(i_676_, -616696415);
		((Class182) class182).aShort2146
		    = (short) Class639.method13606(i_678_,
						   ((((Class166_Sub3) this)
						     .aByteArrayArray9990[i]
						     [i_647_])
						    - (((Class166_Sub3) this)
						       .aByteArrayArray9991[i]
						       [i_647_])),
						   606249493);
		((Class182) class182).aShort2148
		    = (short) Class639.method13606(i_678_,
						   ((((Class166_Sub3) this)
						     .aByteArrayArray9990
						     [i + 1][i_647_])
						    - (((Class166_Sub3) this)
						       .aByteArrayArray9991
						       [i + 1][i_647_])),
						   -1227547856);
		((Class182) class182).aShort2147
		    = (short) Class639.method13606(i_678_,
						   ((((Class166_Sub3) this)
						     .aByteArrayArray9990
						     [i + 1][i_647_ + 1])
						    - (((Class166_Sub3) this)
						       .aByteArrayArray9991
						       [i + 1][i_647_ + 1])),
						   -1287194182);
		((Class182) class182).aShort2152
		    = (short) Class639.method13606(i_678_,
						   ((((Class166_Sub3) this)
						     .aByteArrayArray9990[i]
						     [i_647_ + 1])
						    - (((Class166_Sub3) this)
						       .aByteArrayArray9991[i]
						       [i_647_ + 1])),
						   -1110179769);
		((Class182) class182).aShort2149 = (short) -1;
	    }
	    ((Class166_Sub3) this).aClass182ArrayArray9975[i][i_647_]
		= class182;
	}
    }
    
    public void method3573(int i, int i_679_, int[] is, int[] is_680_,
			   int[] is_681_, int[] is_682_, int[] is_683_,
			   int[] is_684_, int[] is_685_, int[] is_686_,
			   Class86 class86, boolean bool) {
	boolean bool_687_ = (((Class166_Sub3) this).anInt9968 & 0x20) == 0;
	if (((Class166_Sub3) this).aClass201ArrayArray9967 == null
	    && !bool_687_) {
	    ((Class166_Sub3) this).aClass201ArrayArray9967
		= new Class201[anInt2055 * 266270313][anInt2052 * -14610189];
	    ((Class166_Sub3) this).aClass183ArrayArray9969
		= new Class183[anInt2055 * 266270313][anInt2052 * -14610189];
	} else if (((Class166_Sub3) this).aClass143ArrayArray9979 == null
		   && bool_687_)
	    ((Class166_Sub3) this).aClass143ArrayArray9979
		= new Class143[anInt2055 * 266270313][anInt2052 * -14610189];
	else if (((Class166_Sub3) this).aClass182ArrayArray9975 != null)
	    throw new IllegalStateException();
	if (is != null && is.length != 0) {
	    for (int i_688_ = 0; i_688_ < is_683_.length; i_688_++) {
		if (is_683_[i_688_] == -1)
		    is_683_[i_688_] = 0;
		else
		    is_683_[i_688_]
			= ((Class474.anIntArray6382
			    [Class241_Sub42.method16451(is_683_[i_688_],
							1803243967) & 0xffff])
			   << 8) | 0xff;
	    }
	    if (is_684_ != null) {
		for (int i_689_ = 0; i_689_ < is_684_.length; i_689_++) {
		    if (is_684_[i_689_] == -1)
			is_684_[i_689_] = 0;
		    else
			is_684_[i_689_]
			    = (Class474.anIntArray6382
			       [(Class241_Sub42.method16451(is_684_[i_689_],
							    1941380758)
				 & 0xffff)]) << 8 | 0xff;
		}
	    }
	    if (bool_687_) {
		Class143 class143 = new Class143();
		((Class143) class143).aShort1669 = (short) is.length;
		((Class143) class143).aShort1668 = (short) (is.length / 3);
		((Class143) class143).aShortArray1666
		    = new short[((Class143) class143).aShort1669];
		((Class143) class143).aShortArray1667
		    = new short[((Class143) class143).aShort1669];
		((Class143) class143).aShortArray1664
		    = new short[((Class143) class143).aShort1669];
		((Class143) class143).anIntArray1672
		    = new int[((Class143) class143).aShort1669];
		((Class143) class143).aShortArray1670
		    = new short[((Class143) class143).aShort1669];
		((Class143) class143).aShortArray1671
		    = new short[((Class143) class143).aShort1669];
		((Class143) class143).aByteArray1665
		    = new byte[((Class143) class143).aShort1669];
		if (is_682_ != null)
		    ((Class143) class143).aShortArray1673
			= new short[((Class143) class143).aShort1669];
		for (int i_690_ = 0; i_690_ < ((Class143) class143).aShort1669;
		     i_690_++) {
		    int i_691_ = is[i_690_];
		    int i_692_ = is_681_[i_690_];
		    boolean bool_693_ = false;
		    int i_694_;
		    if (i_691_ == 0 && i_692_ == 0)
			i_694_ = ((((Class166_Sub3) this).aByteArrayArray9990
				   [i][i_679_])
				  - (((Class166_Sub3) this).aByteArrayArray9991
				     [i][i_679_]));
		    else if (i_691_ == 0 && i_692_ == anInt2053 * 2039042417)
			i_694_ = ((((Class166_Sub3) this).aByteArrayArray9990
				   [i][i_679_ + 1])
				  - (((Class166_Sub3) this).aByteArrayArray9991
				     [i][i_679_ + 1]));
		    else if (i_691_ == anInt2053 * 2039042417
			     && i_692_ == anInt2053 * 2039042417)
			i_694_ = ((((Class166_Sub3) this).aByteArrayArray9990
				   [i + 1][i_679_ + 1])
				  - (((Class166_Sub3) this).aByteArrayArray9991
				     [i + 1][i_679_ + 1]));
		    else if (i_691_ == anInt2053 * 2039042417 && i_692_ == 0)
			i_694_ = ((((Class166_Sub3) this).aByteArrayArray9990
				   [i + 1][i_679_])
				  - (((Class166_Sub3) this).aByteArrayArray9991
				     [i + 1][i_679_]));
		    else {
			int i_695_
			    = ((((((Class166_Sub3) this).aByteArrayArray9990[i]
				  [i_679_])
				 - (((Class166_Sub3) this).aByteArrayArray9991
				    [i][i_679_]))
				* (anInt2053 * 2039042417 - i_691_))
			       + ((((Class166_Sub3) this).aByteArrayArray9990
				   [i + 1][i_679_])
				  - (((Class166_Sub3) this).aByteArrayArray9991
				     [i + 1][i_679_])) * i_691_);
			int i_696_
			    = ((((((Class166_Sub3) this).aByteArrayArray9990[i]
				  [i_679_ + 1])
				 - (((Class166_Sub3) this).aByteArrayArray9991
				    [i][i_679_ + 1]))
				* (anInt2053 * 2039042417 - i_691_))
			       + ((((Class166_Sub3) this).aByteArrayArray9990
				   [i + 1][i_679_ + 1])
				  - (((Class166_Sub3) this).aByteArrayArray9991
				     [i + 1][i_679_ + 1])) * i_691_);
			i_694_ = (i_695_ * (anInt2053 * 2039042417 - i_692_)
				  + i_696_ * i_692_) >> anInt2054 * -244667650;
		    }
		    int i_697_ = (i << anInt2054 * -122333825) + i_691_;
		    int i_698_ = (i_679_ << anInt2054 * -122333825) + i_692_;
		    ((Class143) class143).aShortArray1666[i_690_]
			= (short) i_691_;
		    ((Class143) class143).aShortArray1664[i_690_]
			= (short) i_692_;
		    ((Class143) class143).aShortArray1667[i_690_]
			= (short) (method3574(i_697_, i_698_, 52662500)
				   + (is_680_ != null ? is_680_[i_690_] : 0));
		    if (i_694_ < 0)
			i_694_ = 0;
		    if (is_683_[i_690_] == 0) {
			((Class143) class143).anIntArray1672[i_690_] = 0;
			if (is_684_ != null)
			    ((Class143) class143).aByteArray1665[i_690_]
				= (byte) i_694_;
		    } else {
			int i_699_ = 0;
			if (is_682_ != null) {
			    int i_700_ = (((Class143) class143)
					      .aShortArray1673[i_690_]
					  = (short) is_682_[i_690_]);
			    if (class86.anInt1252 * -1282025259 != 0) {
				i_699_ = 255 * i_700_ / (class86.anInt1252
							 * -1282025259);
				if (i_699_ < 0)
				    i_699_ = 0;
				else if (i_699_ > 255)
				    i_699_ = 255;
			    }
			}
			int i_701_ = -16777216;
			if (is_685_[i_690_] != -1) {
			    Class101 class101
				= ((Class166_Sub3) this)
				      .aClass103_Sub2_9962.aClass107_1458
				      .method2680(is_685_[i_690_], 628651617);
			    if (class101.anInt1403 * 218388063 != -1
				&& method16256(class101.aByte1427))
				i_701_ = -1694498816;
			}
			((Class143) class143).anIntArray1672[i_690_]
			    = i_701_ | (CsDelta_Add.method17423
					(method16247(is_683_[i_690_] >> 8,
						     i_694_),
					 class86.anInt1251 * 1897985763,
					 i_699_, -1796297651));
			if (is_684_ != null)
			    ((Class143) class143).aByteArray1665[i_690_]
				= (byte) i_694_;
		    }
		    ((Class143) class143).aShortArray1670[i_690_]
			= (short) is_685_[i_690_];
		    ((Class143) class143).aShortArray1671[i_690_]
			= (short) is_686_[i_690_];
		}
		if (is_684_ != null) {
		    ((Class143) class143).anIntArray1674
			= new int[((Class143) class143).aShort1668];
		    for (int i_702_ = 0;
			 i_702_ < ((Class143) class143).aShort1668; i_702_++) {
			int i_703_ = i_702_ * 3;
			if (is_684_[i_703_] != 0)
			    ((Class143) class143).anIntArray1674[i_702_]
				= ~0xffffff | is_684_[i_703_] >> 8;
		    }
		}
		((Class166_Sub3) this).aClass143ArrayArray9979[i][i_679_]
		    = class143;
	    } else {
		boolean bool_704_ = true;
		int i_705_ = -1;
		int i_706_ = -1;
		int i_707_ = -1;
		int i_708_ = -1;
		if (is.length == 6) {
		    for (int i_709_ = 0; i_709_ < 6; i_709_++) {
			if (is[i_709_] == 0 && is_681_[i_709_] == 0) {
			    if (i_705_ != -1
				&& is_683_[i_705_] != is_683_[i_709_]) {
				bool_704_ = false;
				break;
			    }
			    i_705_ = i_709_;
			} else if (is[i_709_] == anInt2053 * 2039042417
				   && is_681_[i_709_] == 0) {
			    if (i_706_ != -1
				&& is_683_[i_706_] != is_683_[i_709_]) {
				bool_704_ = false;
				break;
			    }
			    i_706_ = i_709_;
			} else if (is[i_709_] == anInt2053 * 2039042417
				   && (is_681_[i_709_]
				       == anInt2053 * 2039042417)) {
			    if (i_707_ != -1
				&& is_683_[i_707_] != is_683_[i_709_]) {
				bool_704_ = false;
				break;
			    }
			    i_707_ = i_709_;
			} else if (is[i_709_] == 0
				   && (is_681_[i_709_]
				       == anInt2053 * 2039042417)) {
			    if (i_708_ != -1
				&& is_683_[i_708_] != is_683_[i_709_]) {
				bool_704_ = false;
				break;
			    }
			    i_708_ = i_709_;
			}
		    }
		    if (i_705_ == -1 || i_706_ == -1 || i_707_ == -1
			|| i_708_ == -1)
			bool_704_ = false;
		    if (bool_704_) {
			if (is_680_ != null) {
			    for (int i_710_ = 0; i_710_ < 4; i_710_++) {
				if (is_680_[i_710_] != 0) {
				    bool_704_ = false;
				    break;
				}
			    }
			}
			if (bool_704_) {
			    for (int i_711_ = 1; i_711_ < 4; i_711_++) {
				if (is[i_711_] != is[0]
				    && (is[i_711_]
					!= is[0] + anInt2053 * 2039042417)
				    && (is[i_711_]
					!= is[0] - anInt2053 * 2039042417)) {
				    bool_704_ = false;
				    break;
				}
				if (is_681_[i_711_] != is_681_[0]
				    && (is_681_[i_711_]
					!= is_681_[0] + anInt2053 * 2039042417)
				    && (is_681_[i_711_]
					!= (is_681_[0]
					    - anInt2053 * 2039042417))) {
				    bool_704_ = false;
				    break;
				}
			    }
			}
		    }
		} else
		    bool_704_ = false;
		if (bool_704_) {
		    Class201 class201 = new Class201();
		    int i_712_ = is_683_[0];
		    int i_713_ = is_685_[0];
		    if (is_684_ != null) {
			((Class201) class201).anInt2408 = is_684_[0] >> 8;
			if (i_712_ == 0)
			    ((Class201) class201).aByte2409 |= 0x2;
		    } else if (i_712_ == 0)
			return;
		    if ((anIntArrayArray2051[i][i_679_]
			 == anIntArrayArray2051[i + 1][i_679_])
			&& (anIntArrayArray2051[i][i_679_]
			    == anIntArrayArray2051[i + 1][i_679_ + 1])
			&& (anIntArrayArray2051[i][i_679_]
			    == anIntArrayArray2051[i][i_679_ + 1]))
			((Class201) class201).aByte2409 |= 0x1;
		    if (i_713_ != -1
			&& (((Class201) class201).aByte2409 & 0x2) == 0
			&& !(((Class166_Sub3) this).aClass103_Sub2_9962
				 .aClass107_1458.method2680
			     (i_713_, -847823657).aBool1434)) {
			int i_714_;
			if (is_682_ != null
			    && class86.anInt1252 * -1282025259 != 0) {
			    i_714_ = 255 * is_682_[i_705_] / (class86.anInt1252
							      * -1282025259);
			    if (i_714_ < 0)
				i_714_ = 0;
			    else if (i_714_ > 255)
				i_714_ = 255;
			} else
			    i_714_ = 0;
			((Class201) class201).anInt2410
			    = (CsDelta_Add.method17423
			       (method16247(is_683_[i_705_] >> 8,
					    ((((Class166_Sub3) this)
					      .aByteArrayArray9990[i][i_679_])
					     - (((Class166_Sub3) this)
						.aByteArrayArray9991[i]
						[i_679_]))),
				class86.anInt1251 * 1897985763, i_714_,
				-1544518429));
			if (((Class201) class201).anInt2408 != 0)
			    ((Class201) class201).anInt2410
				|= (255 - ((((Class166_Sub3) this)
					    .aByteArrayArray9990[i][i_679_])
					   - (((Class166_Sub3) this)
					      .aByteArrayArray9991[i][i_679_]))
				    << 25);
			if (is_682_ != null
			    && class86.anInt1252 * -1282025259 != 0) {
			    i_714_ = 255 * is_682_[i_706_] / (class86.anInt1252
							      * -1282025259);
			    if (i_714_ < 0)
				i_714_ = 0;
			    else if (i_714_ > 255)
				i_714_ = 255;
			} else
			    i_714_ = 0;
			((Class201) class201).anInt2401
			    = (CsDelta_Add.method17423
			       (method16247(is_683_[i_706_] >> 8,
					    ((((Class166_Sub3) this)
					      .aByteArrayArray9990[i + 1]
					      [i_679_])
					     - (((Class166_Sub3) this)
						.aByteArrayArray9991[i + 1]
						[i_679_]))),
				class86.anInt1251 * 1897985763, i_714_,
				-675750116));
			if (((Class201) class201).anInt2408 != 0)
			    ((Class201) class201).anInt2401
				|= 255 - ((((Class166_Sub3) this)
					   .aByteArrayArray9990[i + 1][i_679_])
					  - (((Class166_Sub3) this)
					     .aByteArrayArray9991[i + 1]
					     [i_679_])) << 25;
			if (is_682_ != null
			    && class86.anInt1252 * -1282025259 != 0) {
			    i_714_ = 255 * is_682_[i_707_] / (class86.anInt1252
							      * -1282025259);
			    if (i_714_ < 0)
				i_714_ = 0;
			    else if (i_714_ > 255)
				i_714_ = 255;
			} else
			    i_714_ = 0;
			((Class201) class201).anInt2404
			    = (CsDelta_Add.method17423
			       (method16247(is_683_[i_707_] >> 8,
					    ((((Class166_Sub3) this)
					      .aByteArrayArray9990[i + 1]
					      [i_679_ + 1])
					     - (((Class166_Sub3) this)
						.aByteArrayArray9991[i + 1]
						[i_679_ + 1]))),
				class86.anInt1251 * 1897985763, i_714_,
				-2096032602));
			if (((Class201) class201).anInt2408 != 0)
			    ((Class201) class201).anInt2404
				|= 255 - ((((Class166_Sub3) this)
					   .aByteArrayArray9990[i + 1]
					   [i_679_ + 1])
					  - (((Class166_Sub3) this)
					     .aByteArrayArray9991[i + 1]
					     [i_679_ + 1])) << 25;
			if (is_682_ != null
			    && class86.anInt1252 * -1282025259 != 0) {
			    i_714_ = 255 * is_682_[i_708_] / (class86.anInt1252
							      * -1282025259);
			    if (i_714_ < 0)
				i_714_ = 0;
			    else if (i_714_ > 255)
				i_714_ = 255;
			} else
			    i_714_ = 0;
			((Class201) class201).anInt2405
			    = (CsDelta_Add.method17423
			       (method16247(is_683_[i_708_] >> 8,
					    ((((Class166_Sub3) this)
					      .aByteArrayArray9990[i]
					      [i_679_ + 1])
					     - (((Class166_Sub3) this)
						.aByteArrayArray9991[i]
						[i_679_ + 1]))),
				class86.anInt1251 * 1897985763, i_714_,
				-2113312180));
			((Class201) class201).aShort2411 = (short) i_713_;
		    } else {
			int i_715_;
			if (is_682_ != null
			    && class86.anInt1252 * -1282025259 != 0) {
			    i_715_ = 255 * is_682_[i_705_] / (class86.anInt1252
							      * -1282025259);
			    if (i_715_ < 0)
				i_715_ = 0;
			    else if (i_715_ > 255)
				i_715_ = 255;
			} else
			    i_715_ = 0;
			((Class201) class201).anInt2410
			    = (CsDelta_Add.method17423
			       (method16247(is_683_[i_705_] >> 8,
					    ((((Class166_Sub3) this)
					      .aByteArrayArray9990[i][i_679_])
					     - (((Class166_Sub3) this)
						.aByteArrayArray9991[i]
						[i_679_]))),
				class86.anInt1251 * 1897985763, i_715_,
				-1259555408));
			if (((Class201) class201).anInt2408 != 0)
			    ((Class201) class201).anInt2410
				|= (255 - ((((Class166_Sub3) this)
					    .aByteArrayArray9990[i][i_679_])
					   - (((Class166_Sub3) this)
					      .aByteArrayArray9991[i][i_679_]))
				    << 25);
			if (is_682_ != null
			    && class86.anInt1252 * -1282025259 != 0) {
			    i_715_ = 255 * is_682_[i_706_] / (class86.anInt1252
							      * -1282025259);
			    if (i_715_ < 0)
				i_715_ = 0;
			    else if (i_715_ > 255)
				i_715_ = 255;
			} else
			    i_715_ = 0;
			((Class201) class201).anInt2401
			    = (CsDelta_Add.method17423
			       (method16247(is_683_[i_706_] >> 8,
					    ((((Class166_Sub3) this)
					      .aByteArrayArray9990[i + 1]
					      [i_679_])
					     - (((Class166_Sub3) this)
						.aByteArrayArray9991[i + 1]
						[i_679_]))),
				class86.anInt1251 * 1897985763, i_715_,
				-2131857987));
			if (((Class201) class201).anInt2408 != 0)
			    ((Class201) class201).anInt2401
				|= 255 - ((((Class166_Sub3) this)
					   .aByteArrayArray9990[i + 1][i_679_])
					  - (((Class166_Sub3) this)
					     .aByteArrayArray9991[i + 1]
					     [i_679_])) << 25;
			if (is_682_ != null
			    && class86.anInt1252 * -1282025259 != 0) {
			    i_715_ = 255 * is_682_[i_707_] / (class86.anInt1252
							      * -1282025259);
			    if (i_715_ < 0)
				i_715_ = 0;
			    else if (i_715_ > 255)
				i_715_ = 255;
			} else
			    i_715_ = 0;
			((Class201) class201).anInt2404
			    = (CsDelta_Add.method17423
			       (method16247(is_683_[i_707_] >> 8,
					    ((((Class166_Sub3) this)
					      .aByteArrayArray9990[i + 1]
					      [i_679_ + 1])
					     - (((Class166_Sub3) this)
						.aByteArrayArray9991[i + 1]
						[i_679_ + 1]))),
				class86.anInt1251 * 1897985763, i_715_,
				-610037063));
			if (((Class201) class201).anInt2408 != 0)
			    ((Class201) class201).anInt2404
				|= 255 - ((((Class166_Sub3) this)
					   .aByteArrayArray9990[i + 1]
					   [i_679_ + 1])
					  - (((Class166_Sub3) this)
					     .aByteArrayArray9991[i + 1]
					     [i_679_ + 1])) << 25;
			if (is_682_ != null
			    && class86.anInt1252 * -1282025259 != 0) {
			    i_715_ = 255 * is_682_[i_708_] / (class86.anInt1252
							      * -1282025259);
			    if (i_715_ < 0)
				i_715_ = 0;
			    else if (i_715_ > 255)
				i_715_ = 255;
			} else
			    i_715_ = 0;
			((Class201) class201).anInt2405
			    = (CsDelta_Add.method17423
			       (method16247(is_683_[i_708_] >> 8,
					    ((((Class166_Sub3) this)
					      .aByteArrayArray9990[i]
					      [i_679_ + 1])
					     - (((Class166_Sub3) this)
						.aByteArrayArray9991[i]
						[i_679_ + 1]))),
				class86.anInt1251 * 1897985763, i_715_,
				-778281778));
			if (((Class201) class201).anInt2408 != 0)
			    ((Class201) class201).anInt2405
				|= 255 - ((((Class166_Sub3) this)
					   .aByteArrayArray9990[i][i_679_ + 1])
					  - (((Class166_Sub3) this)
					     .aByteArrayArray9991[i]
					     [i_679_ + 1])) << 25;
			((Class201) class201).aShort2411 = (short) -1;
		    }
		    if (is_682_ != null) {
			((Class201) class201).aShort2406
			    = (short) is_682_[i_707_];
			((Class201) class201).aShort2402
			    = (short) is_682_[i_708_];
			((Class201) class201).aShort2407
			    = (short) is_682_[i_706_];
			((Class201) class201).aShort2403
			    = (short) is_682_[i_705_];
		    }
		    ((Class166_Sub3) this).aClass201ArrayArray9967[i][i_679_]
			= class201;
		} else {
		    Class183 class183 = new Class183();
		    ((Class183) class183).aShort2154 = (short) is.length;
		    ((Class183) class183).aShort2160 = (short) (is.length / 3);
		    ((Class183) class183).aShortArray2156
			= new short[((Class183) class183).aShort2154];
		    ((Class183) class183).aShortArray2153
			= new short[((Class183) class183).aShort2154];
		    ((Class183) class183).aShortArray2158
			= new short[((Class183) class183).aShort2154];
		    ((Class183) class183).anIntArray2163
			= new int[((Class183) class183).aShort2154];
		    if (is_682_ != null)
			((Class183) class183).aShortArray2159
			    = new short[((Class183) class183).aShort2154];
		    for (int i_716_ = 0;
			 i_716_ < ((Class183) class183).aShort2154; i_716_++) {
			int i_717_ = is[i_716_];
			int i_718_ = is_681_[i_716_];
			boolean bool_719_ = false;
			int i_720_;
			if (i_717_ == 0 && i_718_ == 0)
			    i_720_ = ((((Class166_Sub3) this)
				       .aByteArrayArray9990[i][i_679_])
				      - (((Class166_Sub3) this)
					 .aByteArrayArray9991[i][i_679_]));
			else if (i_717_ == 0
				 && i_718_ == anInt2053 * 2039042417)
			    i_720_ = ((((Class166_Sub3) this)
				       .aByteArrayArray9990[i][i_679_ + 1])
				      - (((Class166_Sub3) this)
					 .aByteArrayArray9991[i][i_679_ + 1]));
			else if (i_717_ == anInt2053 * 2039042417
				 && i_718_ == anInt2053 * 2039042417)
			    i_720_ = ((((Class166_Sub3) this)
				       .aByteArrayArray9990[i + 1][i_679_ + 1])
				      - (((Class166_Sub3) this)
					 .aByteArrayArray9991[i + 1]
					 [i_679_ + 1]));
			else if (i_717_ == anInt2053 * 2039042417
				 && i_718_ == 0)
			    i_720_ = ((((Class166_Sub3) this)
				       .aByteArrayArray9990[i + 1][i_679_])
				      - (((Class166_Sub3) this)
					 .aByteArrayArray9991[i + 1][i_679_]));
			else {
			    int i_721_
				= ((((((Class166_Sub3) this)
				      .aByteArrayArray9990[i][i_679_])
				     - (((Class166_Sub3) this)
					.aByteArrayArray9991[i][i_679_]))
				    * (anInt2053 * 2039042417 - i_717_))
				   + (((((Class166_Sub3) this)
					.aByteArrayArray9990[i + 1][i_679_])
				       - (((Class166_Sub3) this)
					  .aByteArrayArray9991[i + 1][i_679_]))
				      * i_717_));
			    int i_722_
				= ((((((Class166_Sub3) this)
				      .aByteArrayArray9990[i][i_679_ + 1])
				     - (((Class166_Sub3) this)
					.aByteArrayArray9991[i][i_679_ + 1]))
				    * (anInt2053 * 2039042417 - i_717_))
				   + ((((Class166_Sub3) this)
				       .aByteArrayArray9990[i + 1][i_679_ + 1])
				      - (((Class166_Sub3) this)
					 .aByteArrayArray9991[i + 1]
					 [i_679_ + 1])) * i_717_);
			    i_720_ = (i_721_ * (anInt2053 * 2039042417
						- i_718_) + i_722_ * i_718_
				      >> anInt2054 * -244667650);
			}
			int i_723_ = (i << anInt2054 * -122333825) + i_717_;
			int i_724_
			    = (i_679_ << anInt2054 * -122333825) + i_718_;
			((Class183) class183).aShortArray2156[i_716_]
			    = (short) i_717_;
			((Class183) class183).aShortArray2158[i_716_]
			    = (short) i_718_;
			((Class183) class183).aShortArray2153[i_716_]
			    = (short) (method3574(i_723_, i_724_, 889478516)
				       + (is_680_ != null ? is_680_[i_716_]
					  : 0));
			if (i_720_ < 0)
			    i_720_ = 0;
			if (is_683_[i_716_] == 0) {
			    if (is_684_ != null)
				((Class183) class183).anIntArray2163[i_716_]
				    = i_720_ << 25;
			    else
				((Class183) class183).anIntArray2163[i_716_]
				    = 0;
			} else {
			    int i_725_ = 0;
			    if (is_682_ != null) {
				int i_726_ = (((Class183) class183)
						  .aShortArray2159[i_716_]
					      = (short) is_682_[i_716_]);
				if (class86.anInt1252 * -1282025259 != 0) {
				    i_725_ = 255 * i_726_ / (class86.anInt1252
							     * -1282025259);
				    if (i_725_ < 0)
					i_725_ = 0;
				    else if (i_725_ > 255)
					i_725_ = 255;
				}
			    }
			    ((Class183) class183).anIntArray2163[i_716_]
				= (CsDelta_Add.method17423
				   (method16247(is_683_[i_716_] >> 8, i_720_),
				    class86.anInt1251 * 1897985763, i_725_,
				    -23727911));
			    if (is_684_ != null)
				((Class183) class183).anIntArray2163[i_716_]
				    |= i_720_ << 25;
			}
		    }
		    boolean bool_727_ = false;
		    for (int i_728_ = 0;
			 i_728_ < ((Class183) class183).aShort2160; i_728_++) {
			if (is_685_[i_728_ * 3] != -1
			    && !(((Class166_Sub3) this).aClass103_Sub2_9962
				     .aClass107_1458.method2680
				 (is_685_[i_728_ * 3], 774746097).aBool1434))
			    bool_727_ = true;
		    }
		    if (is_684_ != null)
			((Class183) class183).anIntArray2155
			    = new int[((Class183) class183).aShort2160];
		    if (bool_727_) {
			((Class183) class183).aShortArray2161
			    = new short[((Class183) class183).aShort2160];
			((Class183) class183).aShortArray2162
			    = new short[((Class183) class183).aShort2160];
		    }
		    for (int i_729_ = 0;
			 i_729_ < ((Class183) class183).aShort2160; i_729_++) {
			int i_730_ = i_729_ * 3;
			if (is_684_ != null && is_684_[i_730_] != 0)
			    ((Class183) class183).anIntArray2155[i_729_]
				= is_684_[i_730_] >> 8;
			if (bool_727_) {
			    int i_731_ = i_730_ + 1;
			    int i_732_ = i_731_ + 1;
			    boolean bool_733_ = false;
			    boolean bool_734_ = true;
			    int i_735_ = is_685_[i_730_];
			    if (i_735_ == -1
				|| (((Class166_Sub3) this)
					.aClass103_Sub2_9962.aClass107_1458
					.method2680
				    (i_735_, 2006259247).aBool1434))
				bool_734_ = false;
			    else
				bool_733_ = true;
			    i_735_ = is_685_[i_731_];
			    if (i_735_ == -1
				|| (((Class166_Sub3) this)
					.aClass103_Sub2_9962.aClass107_1458
					.method2680
				    (i_735_, 847712688).aBool1434))
				bool_734_ = false;
			    else
				bool_733_ = true;
			    i_735_ = is_685_[i_732_];
			    if (i_735_ == -1
				|| (((Class166_Sub3) this)
					.aClass103_Sub2_9962.aClass107_1458
					.method2680
				    (i_735_, 869604468).aBool1434))
				bool_734_ = false;
			    else
				bool_733_ = true;
			    if (bool_734_) {
				((Class183) class183).aShortArray2161[i_729_]
				    = (short) i_735_;
				((Class183) class183).aShortArray2162[i_729_]
				    = (short) is_686_[i_730_];
			    } else {
				if (bool_733_) {
				    i_735_ = is_685_[i_730_];
				    if (i_735_ != -1
					&& !(((Class166_Sub3) this)
						 .aClass103_Sub2_9962
						 .aClass107_1458.method2680
					     (i_735_, 771032017).aBool1434))
					((Class183) class183)
					    .anIntArray2163[i_730_]
					    = (Class474.anIntArray6382
					       [(Class241_Sub42.method16451
						 ((((Class166_Sub3) this)
						       .aClass103_Sub2_9962
						       .aClass107_1458
						       .method2680
						   (i_735_, 1665275963)
						   .aShort1436) & 0xffff,
						  -889892761)) & 0xffff]);
				    i_735_ = is_685_[i_731_];
				    if (i_735_ != -1
					&& !(((Class166_Sub3) this)
						 .aClass103_Sub2_9962
						 .aClass107_1458.method2680
					     (i_735_, 868719487).aBool1434))
					((Class183) class183)
					    .anIntArray2163[i_731_]
					    = (Class474.anIntArray6382
					       [(Class241_Sub42.method16451
						 ((((Class166_Sub3) this)
						       .aClass103_Sub2_9962
						       .aClass107_1458
						       .method2680
						   (i_735_, 239490197)
						   .aShort1436) & 0xffff,
						  816085830)) & 0xffff]);
				    i_735_ = is_685_[i_732_];
				    if (i_735_ != -1
					&& !(((Class166_Sub3) this)
						 .aClass103_Sub2_9962
						 .aClass107_1458.method2680
					     (i_735_, -1955310297).aBool1434))
					((Class183) class183)
					    .anIntArray2163[i_732_]
					    = (Class474.anIntArray6382
					       [(Class241_Sub42.method16451
						 ((((Class166_Sub3) this)
						       .aClass103_Sub2_9962
						       .aClass107_1458
						       .method2680
						   (i_735_, 1418471906)
						   .aShort1436) & 0xffff,
						  -2053453619)) & 0xffff]);
				}
				((Class183) class183).aShortArray2161[i_729_]
				    = (short) -1;
			    }
			}
		    }
		    ((Class166_Sub3) this).aClass183ArrayArray9969[i][i_679_]
			= class183;
		}
	    }
	}
    }
    
    void method16251(int i, int i_736_, int i_737_, int i_738_, int i_739_,
		     int i_740_, int i_741_, boolean[][] bools,
		     Class189 class189, Class155 class155, float[] fs,
		     float[] fs_742_) {
	int i_743_ = (i_741_ - i_739_) * i_737_ / 256;
	int i_744_ = i_737_ >> 8;
	boolean bool = ((Class189) class189).aBool2220;
	((Class166_Sub3) this).aClass103_Sub2_9962.method2308(false);
	((Class155) class155).aBool1721 = false;
	((Class155) class155).aBool1722 = false;
	int i_745_ = i;
	int i_746_ = i_736_ + i_743_;
	for (int i_747_ = i_738_; i_747_ < i_740_; i_747_++) {
	    for (int i_748_ = i_739_; i_748_ < i_741_; i_748_++) {
		if (bools[i_747_ - i_738_][i_748_ - i_739_]) {
		    if (((Class166_Sub3) this).aClass201ArrayArray9967
			!= null) {
			if ((((Class166_Sub3) this).aClass201ArrayArray9967
			     [i_747_][i_748_])
			    != null) {
			    Class201 class201
				= (((Class166_Sub3) this)
				   .aClass201ArrayArray9967[i_747_][i_748_]);
			    if (((Class201) class201).aShort2411 != -1
				&& (((Class201) class201).aByte2409 & 0x2) == 0
				&& ((Class201) class201).anInt2408 == 0) {
				int i_749_
				    = (((Class166_Sub3) this)
					   .aClass103_Sub2_9962.method15368
				       (((Class201) class201).aShort2411
					& 0xffff));
				class155.method3380
				    (true, true, false,
				     (float) (i_746_ - i_744_),
				     (float) (i_746_ - i_744_), (float) i_746_,
				     (float) (i_745_ + i_744_), (float) i_745_,
				     (float) (i_745_ + i_744_), 100.0F, 100.0F,
				     100.0F,
				     (float) Class639.method13606(i_749_,
								  (((Class201)
								    class201)
								   .anInt2404),
								  -1025013275),
				     (float) Class639.method13606(i_749_,
								  (((Class201)
								    class201)
								   .anInt2405),
								  -1151853832),
				     (float) Class639.method13606(i_749_,
								  (((Class201)
								    class201)
								   .anInt2401),
								  963080003));
				class155.method3380
				    (true, true, false, (float) i_746_,
				     (float) i_746_, (float) (i_746_ - i_744_),
				     (float) i_745_, (float) (i_745_ + i_744_),
				     (float) i_745_, 100.0F, 100.0F, 100.0F,
				     (float) Class639.method13606(i_749_,
								  (((Class201)
								    class201)
								   .anInt2410),
								  2076789919),
				     (float) Class639.method13606(i_749_,
								  (((Class201)
								    class201)
								   .anInt2401),
								  375062928),
				     (float) Class639.method13606(i_749_,
								  (((Class201)
								    class201)
								   .anInt2405),
								  1201123537));
			    } else if (((Class201) class201).anInt2408 == 0) {
				class155.method3385
				    (true, true, false,
				     (float) (i_746_ - i_744_),
				     (float) (i_746_ - i_744_), (float) i_746_,
				     (float) (i_745_ + i_744_), (float) i_745_,
				     (float) (i_745_ + i_744_), 100.0F, 100.0F,
				     100.0F, ((Class201) class201).anInt2404,
				     ((Class201) class201).anInt2405,
				     ((Class201) class201).anInt2401);
				class155.method3385
				    (true, true, false, (float) i_746_,
				     (float) i_746_, (float) (i_746_ - i_744_),
				     (float) i_745_, (float) (i_745_ + i_744_),
				     (float) i_745_, 100.0F, 100.0F, 100.0F,
				     ((Class201) class201).anInt2410,
				     ((Class201) class201).anInt2401,
				     ((Class201) class201).anInt2405);
			    } else {
				int i_750_ = ((Class201) class201).anInt2408;
				class155.method3385
				    (true, true, false,
				     (float) (i_746_ - i_744_),
				     (float) (i_746_ - i_744_), (float) i_746_,
				     (float) (i_745_ + i_744_), (float) i_745_,
				     (float) (i_745_ + i_744_), 100.0F, 100.0F,
				     100.0F,
				     (Class241_Sub18_Sub1.method17140
				      (i_750_, (((Class201) class201).anInt2404
						& ~0xffffff), -350368843)),
				     (Class241_Sub18_Sub1.method17140
				      (i_750_, (((Class201) class201).anInt2405
						& ~0xffffff), -317731998)),
				     (Class241_Sub18_Sub1.method17140
				      (i_750_, (((Class201) class201).anInt2401
						& ~0xffffff), -361460422)));
				class155.method3385
				    (true, true, false, (float) i_746_,
				     (float) i_746_, (float) (i_746_ - i_744_),
				     (float) i_745_, (float) (i_745_ + i_744_),
				     (float) i_745_, 100.0F, 100.0F, 100.0F,
				     (Class241_Sub18_Sub1.method17140
				      (i_750_, (((Class201) class201).anInt2410
						& ~0xffffff), -100038156)),
				     (Class241_Sub18_Sub1.method17140
				      (i_750_, (((Class201) class201).anInt2401
						& ~0xffffff), -2020523820)),
				     (Class241_Sub18_Sub1.method17140
				      (i_750_, (((Class201) class201).anInt2405
						& ~0xffffff), 1779253698)));
			    }
			} else if ((((Class166_Sub3) this)
				    .aClass183ArrayArray9969[i_747_][i_748_])
				   != null) {
			    Class183 class183
				= (((Class166_Sub3) this)
				   .aClass183ArrayArray9969[i_747_][i_748_]);
			    for (int i_751_ = 0;
				 i_751_ < ((Class183) class183).aShort2154;
				 i_751_++) {
				fs[i_751_]
				    = (float) (i_745_
					       + ((((Class183) class183)
						   .aShortArray2156[i_751_])
						  * i_744_
						  / (anInt2053 * 2039042417)));
				fs_742_[i_751_]
				    = (float) (i_746_
					       - ((((Class183) class183)
						   .aShortArray2158[i_751_])
						  * i_744_
						  / (anInt2053 * 2039042417)));
			    }
			    for (int i_752_ = 0;
				 i_752_ < ((Class183) class183).aShort2160;
				 i_752_++) {
				int i_753_ = i_752_ * 3;
				int i_754_ = i_753_ + 1;
				int i_755_ = i_754_ + 1;
				float f = fs[i_753_];
				float f_756_ = fs[i_754_];
				float f_757_ = fs[i_755_];
				float f_758_ = fs_742_[i_753_];
				float f_759_ = fs_742_[i_754_];
				float f_760_ = fs_742_[i_755_];
				if ((((Class183) class183).anIntArray2155
				     != null)
				    && (((Class183) class183).anIntArray2155
					[i_752_]) != 0
				    && ((((Class183) class183).aShortArray2161
					 == null)
					|| ((((Class183) class183)
					     .aShortArray2161) != null
					    && ((((Class183) class183)
						 .aShortArray2161[i_752_])
						== -1)))) {
				    int i_761_ = (((Class183) class183)
						  .anIntArray2155[i_752_]);
				    class155.method3385
					(true, true, false, f_758_, f_759_,
					 f_760_, f, f_756_, f_757_, 100.0F,
					 100.0F, 100.0F,
					 (Class241_Sub18_Sub1.method17140
					  (i_761_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_753_])
							& ~0xffffff),
					   446787583)),
					 (Class241_Sub18_Sub1.method17140
					  (i_761_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_754_])
							& ~0xffffff),
					   882196871)),
					 (Class241_Sub18_Sub1.method17140
					  (i_761_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_755_])
							& ~0xffffff),
					   1912646729)));
				} else if ((((Class183) class183)
					    .aShortArray2161) != null
					   && ((((Class183) class183)
						.aShortArray2161[i_752_])
					       != -1)) {
				    int i_762_
					= (((Class166_Sub3) this)
					       .aClass103_Sub2_9962.method15368
					   ((((Class183) class183)
					     .aShortArray2161[i_752_])
					    & 0xffff));
				    class155.method3380(true, true, false,
							f_758_, f_759_, f_760_,
							f, f_756_, f_757_,
							100.0F, 100.0F, 100.0F,
							(float) i_762_,
							(float) i_762_,
							(float) i_762_);
				} else
				    class155.method3385(true, true, false,
							f_758_, f_759_, f_760_,
							f, f_756_, f_757_,
							100.0F, 100.0F, 100.0F,
							(((Class183) class183)
							 .anIntArray2163
							 [i_753_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_754_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_755_]));
			    }
			}
		    } else if ((((Class166_Sub3) this).aClass143ArrayArray9979
				[i_747_][i_748_])
			       != null) {
			Class143 class143
			    = (((Class166_Sub3) this).aClass143ArrayArray9979
			       [i_747_][i_748_]);
			for (int i_763_ = 0;
			     i_763_ < ((Class143) class143).aShort1669;
			     i_763_++) {
			    fs[i_763_]
				= (float) (i_745_
					   + ((((Class143) class143)
					       .aShortArray1666[i_763_])
					      * i_744_
					      / (anInt2053 * 2039042417)));
			    fs_742_[i_763_]
				= (float) (i_746_
					   - ((((Class143) class143)
					       .aShortArray1664[i_763_])
					      * i_744_
					      / (anInt2053 * 2039042417)));
			}
			for (int i_764_ = 0;
			     i_764_ < ((Class143) class143).aShort1668;
			     i_764_++) {
			    int i_765_ = i_764_ * 3;
			    int i_766_ = i_765_ + 1;
			    int i_767_ = i_766_ + 1;
			    float f = fs[i_765_];
			    float f_768_ = fs[i_766_];
			    float f_769_ = fs[i_767_];
			    float f_770_ = fs_742_[i_765_];
			    float f_771_ = fs_742_[i_766_];
			    float f_772_ = fs_742_[i_767_];
			    if (((Class143) class143).anIntArray1674 != null
				&& (((Class143) class143).anIntArray1674
				    [i_764_]) != 0) {
				int i_773_ = (((Class143) class143)
					      .anIntArray1674[i_764_]);
				class155.method3385(true, true, false, f_770_,
						    f_771_, f_772_, f, f_768_,
						    f_769_, 100.0F, 100.0F,
						    100.0F, i_773_, i_773_,
						    i_773_);
			    } else
				class155.method3385(true, true, false, f_770_,
						    f_771_, f_772_, f, f_768_,
						    f_769_, 100.0F, 100.0F,
						    100.0F,
						    (((Class143) class143)
						     .anIntArray1672[i_765_]),
						    (((Class143) class143)
						     .anIntArray1672[i_766_]),
						    (((Class143) class143)
						     .anIntArray1672[i_767_]));
			}
		    }
		}
		i_746_ -= i_744_;
	    }
	    i_746_ = i_736_ + i_743_;
	    i_745_ += i_744_;
	}
	((Class155) class155).aBool1721 = true;
	((Class166_Sub3) this).aClass103_Sub2_9962.method2308(bool);
    }
    
    void method16252(int i, int i_774_, Class155 class155, float[] fs,
		     float[] fs_775_, float[] fs_776_, float[] fs_777_,
		     float[] fs_778_, int i_779_) {
	Class182 class182
	    = ((Class166_Sub3) this).aClass182ArrayArray9975[i][i_774_];
	if (class182 != null) {
	    if ((((Class182) class182).aByte2150 & 0x2) == 0) {
		if (i_779_ != 0) {
		    if ((((Class182) class182).aByte2150 & 0x4) != 0) {
			if ((i_779_ & 0x1) != 0)
			    return;
		    } else if ((i_779_ & 0x2) != 0)
			return;
		}
		int i_780_ = i * (anInt2053 * 2039042417);
		int i_781_ = i_780_ + anInt2053 * 2039042417;
		int i_782_ = i_774_ * (anInt2053 * 2039042417);
		int i_783_ = i_782_ + anInt2053 * 2039042417;
		float f;
		float f_784_;
		float f_785_;
		float f_786_;
		float f_787_;
		float f_788_;
		float f_789_;
		float f_790_;
		float f_791_;
		float f_792_;
		float f_793_;
		float f_794_;
		float f_795_;
		float f_796_;
		float f_797_;
		float f_798_;
		if ((((Class182) class182).aByte2150 & 0x1) != 0) {
		    int i_799_ = anIntArrayArray2051[i][i_774_];
		    float f_800_
			= ((Class166_Sub3) this).aFloat9980 * (float) i_799_;
		    float f_801_
			= ((Class166_Sub3) this).aFloat9989 * (float) i_799_;
		    float f_802_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_780_)
				       + f_800_
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_782_)));
		    f = (((Class166_Sub3) this).aFloat9974
			 + (((Class166_Sub3) this).aFloat9977 * (float) i_780_
			    + f_801_
			    + (((Class166_Sub3) this).aFloat9985
			       * (float) i_782_)));
		    if (f_802_ < -f)
			return;
		    float f_803_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_781_)
				       + f_800_
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_782_)));
		    f_784_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_781_)
				 + f_801_
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_782_)));
		    if (f_803_ < -f_784_)
			return;
		    float f_804_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_781_)
				       + f_800_
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_783_)));
		    f_785_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_781_)
				 + f_801_
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_783_)));
		    if (f_804_ < -f_785_)
			return;
		    float f_805_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_780_)
				       + f_800_
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_783_)));
		    f_786_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_780_)
				 + f_801_
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_783_)));
		    if (f_805_ < -f_786_)
			return;
		    float f_806_
			= ((Class166_Sub3) this).aFloat9978 * (float) i_799_;
		    float f_807_
			= ((Class166_Sub3) this).aFloat9965 * (float) i_799_;
		    float f_808_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_780_)
				       + f_806_
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_782_)));
		    f_787_ = (((Class155) class155).aFloat1727
			      + ((Class155) class155).aFloat1728 * f_808_ / f);
		    float f_809_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_780_)
				       + f_807_
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_782_)));
		    f_788_ = (((Class155) class155).aFloat1731
			      + ((Class155) class155).aFloat1729 * f_809_ / f);
		    f_789_ = (((Class155) class155).aFloat1720
			      + ((Class155) class155).aFloat1732 * f_802_ / f);
		    float f_810_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_781_)
				       + f_806_
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_782_)));
		    f_790_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_810_
				 / f_784_));
		    float f_811_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_781_)
				       + f_807_
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_782_)));
		    f_791_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_811_
				 / f_784_));
		    f_792_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_803_
				 / f_784_));
		    float f_812_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_781_)
				       + f_806_
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_783_)));
		    f_793_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_812_
				 / f_785_));
		    float f_813_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_781_)
				       + f_807_
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_783_)));
		    f_794_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_813_
				 / f_785_));
		    f_795_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_804_
				 / f_785_));
		    float f_814_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_780_)
				       + f_806_
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_783_)));
		    f_796_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_814_
				 / f_786_));
		    float f_815_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_780_)
				       + f_807_
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_783_)));
		    f_797_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_815_
				 / f_786_));
		    f_798_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_805_
				 / f_786_));
		} else {
		    int i_816_ = anIntArrayArray2051[i][i_774_];
		    int i_817_ = anIntArrayArray2051[i + 1][i_774_];
		    int i_818_ = anIntArrayArray2051[i + 1][i_774_ + 1];
		    int i_819_ = anIntArrayArray2051[i][i_774_ + 1];
		    float f_820_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_780_)
				       + (((Class166_Sub3) this).aFloat9980
					  * (float) i_816_)
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_782_)));
		    f = (((Class166_Sub3) this).aFloat9974
			 + (((Class166_Sub3) this).aFloat9977 * (float) i_780_
			    + (((Class166_Sub3) this).aFloat9989
			       * (float) i_816_)
			    + (((Class166_Sub3) this).aFloat9985
			       * (float) i_782_)));
		    if (f_820_ < -f)
			return;
		    float f_821_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_781_)
				       + (((Class166_Sub3) this).aFloat9980
					  * (float) i_817_)
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_782_)));
		    f_784_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_781_)
				 + (((Class166_Sub3) this).aFloat9989
				    * (float) i_817_)
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_782_)));
		    if (f_821_ < -f_784_)
			return;
		    float f_822_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_781_)
				       + (((Class166_Sub3) this).aFloat9980
					  * (float) i_818_)
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_783_)));
		    f_785_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_781_)
				 + (((Class166_Sub3) this).aFloat9989
				    * (float) i_818_)
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_783_)));
		    if (f_822_ < -f_785_)
			return;
		    float f_823_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_780_)
				       + (((Class166_Sub3) this).aFloat9980
					  * (float) i_819_)
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_783_)));
		    f_786_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_780_)
				 + (((Class166_Sub3) this).aFloat9989
				    * (float) i_819_)
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_783_)));
		    if (f_823_ < -f_786_)
			return;
		    float f_824_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_780_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_816_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_782_)));
		    f_787_ = (((Class155) class155).aFloat1727
			      + ((Class155) class155).aFloat1728 * f_824_ / f);
		    float f_825_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_780_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_816_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_782_)));
		    f_788_ = (((Class155) class155).aFloat1731
			      + ((Class155) class155).aFloat1729 * f_825_ / f);
		    f_789_ = (((Class155) class155).aFloat1720
			      + ((Class155) class155).aFloat1732 * f_820_ / f);
		    float f_826_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_781_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_817_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_782_)));
		    f_790_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_826_
				 / f_784_));
		    float f_827_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_781_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_817_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_782_)));
		    f_791_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_827_
				 / f_784_));
		    f_792_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_821_
				 / f_784_));
		    float f_828_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_781_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_818_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_783_)));
		    f_793_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_828_
				 / f_785_));
		    float f_829_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_781_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_818_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_783_)));
		    f_794_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_829_
				 / f_785_));
		    f_795_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_822_
				 / f_785_));
		    float f_830_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_780_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_819_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_783_)));
		    f_796_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_830_
				 / f_786_));
		    float f_831_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_780_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_819_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_783_)));
		    f_797_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_831_
				 / f_786_));
		    f_798_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_823_
				 / f_786_));
		}
		int i_832_ = -1;
		if (((Class182) class182).aShort2149 != -1)
		    i_832_ = (((Class166_Sub3) this).aClass103_Sub2_9962
				  .aClass107_1458.method2680
			      (((Class182) class182).aShort2149 & 0xffff,
			       -1491393587)
			      .anInt1403) * 218388063;
		if (((f_793_ - f_796_) * (f_791_ - f_797_)
		     - (f_794_ - f_797_) * (f_790_ - f_796_))
		    > 0.0F) {
		    ((Class155) class155).aBool1748
			= (f_793_ < 0.0F || f_796_ < 0.0F || f_790_ < 0.0F
			   || f_793_ > (float) ((Class155) class155).anInt1733
			   || f_796_ > (float) ((Class155) class155).anInt1733
			   || (f_790_
			       > (float) ((Class155) class155).anInt1733));
		    if (i_832_ >= 0)
			class155.method3384
			    (true, true, false, f_794_, f_797_, f_791_, f_793_,
			     f_796_, f_790_, f_795_, f_798_, f_792_, f_785_,
			     f_786_, f_784_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F,
			     0.0F,
			     ~0xffffff | (Class474.anIntArray6382
					  [(((Class182) class182).aShort2147
					    & 0xffff)]) & 0xffffff,
			     ~0xffffff | (Class474.anIntArray6382
					  [(((Class182) class182).aShort2152
					    & 0xffff)]) & 0xffffff,
			     ~0xffffff | (Class474.anIntArray6382
					  [(((Class182) class182).aShort2148
					    & 0xffff)]) & 0xffffff,
			     0, 0.0F, 0.0F, 0.0F,
			     ((Class182) class182).aShort2149 & 0xffff,
			     i_832_);
		    else
			class155.method3380
			    (true, true, false, f_794_, f_797_, f_791_, f_793_,
			     f_796_, f_790_, f_795_, f_798_, f_792_,
			     (float) (((Class182) class182).aShort2147
				      & 0xffff),
			     (float) (((Class182) class182).aShort2152
				      & 0xffff),
			     (float) (((Class182) class182).aShort2148
				      & 0xffff));
		}
		if (((f_787_ - f_790_) * (f_797_ - f_791_)
		     - (f_788_ - f_791_) * (f_796_ - f_790_))
		    > 0.0F) {
		    ((Class155) class155).aBool1748
			= (f_787_ < 0.0F || f_790_ < 0.0F || f_796_ < 0.0F
			   || f_787_ > (float) ((Class155) class155).anInt1733
			   || f_790_ > (float) ((Class155) class155).anInt1733
			   || (f_796_
			       > (float) ((Class155) class155).anInt1733));
		    if (i_832_ >= 0)
			class155.method3384
			    (true, true, false, f_788_, f_791_, f_797_, f_787_,
			     f_790_, f_796_, f_789_, f_792_, f_798_, f, f_784_,
			     f_786_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
			     ~0xffffff | (Class474.anIntArray6382
					  [(((Class182) class182).aShort2146
					    & 0xffff)]) & 0xffffff,
			     ~0xffffff | (Class474.anIntArray6382
					  [(((Class182) class182).aShort2148
					    & 0xffff)]) & 0xffffff,
			     ~0xffffff | (Class474.anIntArray6382
					  [(((Class182) class182).aShort2152
					    & 0xffff)]) & 0xffffff,
			     0, 0.0F, 0.0F, 0.0F,
			     ((Class182) class182).aShort2149 & 0xffff,
			     i_832_);
		    else
			class155.method3380
			    (true, true, false, f_788_, f_791_, f_797_, f_787_,
			     f_790_, f_796_, f_789_, f_792_, f_798_,
			     (float) (((Class182) class182).aShort2146
				      & 0xffff),
			     (float) (((Class182) class182).aShort2148
				      & 0xffff),
			     (float) (((Class182) class182).aShort2152
				      & 0xffff));
		}
	    }
	} else {
	    Class205 class205
		= ((Class166_Sub3) this).aClass205ArrayArray9970[i][i_774_];
	    if (class205 != null) {
		if (i_779_ != 0) {
		    if ((((Class205) class205).aByte2432 & 0x4) != 0) {
			if ((i_779_ & 0x1) != 0)
			    return;
		    } else if ((i_779_ & 0x2) != 0)
			return;
		}
		for (int i_833_ = 0; i_833_ < ((Class205) class205).aShort2431;
		     i_833_++) {
		    int i_834_ = (((Class205) class205).aShortArray2433[i_833_]
				  + (i << anInt2054 * -122333825));
		    short i_835_
			= ((Class205) class205).aShortArray2439[i_833_];
		    int i_836_ = (((Class205) class205).aShortArray2438[i_833_]
				  + (i_774_ << anInt2054 * -122333825));
		    float f = (((Class166_Sub3) this).aFloat9988
			       + ((((Class166_Sub3) this).aFloat9976
				   * (float) i_834_)
				  + (((Class166_Sub3) this).aFloat9980
				     * (float) i_835_)
				  + (((Class166_Sub3) this).aFloat9984
				     * (float) i_836_)));
		    float f_837_ = (((Class166_Sub3) this).aFloat9974
				    + ((((Class166_Sub3) this).aFloat9977
					* (float) i_834_)
				       + (((Class166_Sub3) this).aFloat9989
					  * (float) i_835_)
				       + (((Class166_Sub3) this).aFloat9985
					  * (float) i_836_)));
		    if (f < -f_837_)
			return;
		    float f_838_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_834_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_835_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_836_)));
		    float f_839_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_834_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_835_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_836_)));
		    fs[i_833_] = (((Class155) class155).aFloat1727
				  + (((Class155) class155).aFloat1728 * f_838_
				     / f_837_));
		    fs_775_[i_833_] = (((Class155) class155).aFloat1731
				       + (((Class155) class155).aFloat1729
					  * f_839_ / f_837_));
		    fs_776_[i_833_]
			= (((Class155) class155).aFloat1720
			   + ((Class155) class155).aFloat1732 * f / f_837_);
		    fs_777_[i_833_] = f_837_;
		}
		if (((Class205) class205).aShortArray2440 != null) {
		    for (int i_840_ = 0;
			 i_840_ < ((Class205) class205).aShort2441; i_840_++) {
			short i_841_
			    = ((Class205) class205).aShortArray2437[i_840_];
			short i_842_
			    = ((Class205) class205).aShortArray2430[i_840_];
			short i_843_
			    = ((Class205) class205).aShortArray2443[i_840_];
			float f = fs[i_841_];
			float f_844_ = fs[i_842_];
			float f_845_ = fs[i_843_];
			float f_846_ = fs_775_[i_841_];
			float f_847_ = fs_775_[i_842_];
			float f_848_ = fs_775_[i_843_];
			if (((f - f_844_) * (f_848_ - f_847_)
			     - (f_846_ - f_847_) * (f_845_ - f_844_))
			    > 0.0F) {
			    ((Class155) class155).aBool1748
				= (f < 0.0F || f_844_ < 0.0F || f_845_ < 0.0F
				   || f > (float) (((Class155) class155)
						   .anInt1733)
				   || f_844_ > (float) (((Class155) class155)
							.anInt1733)
				   || f_845_ > (float) (((Class155) class155)
							.anInt1733));
			    int i_849_ = -1;
			    if (((Class205) class205).aShortArray2440[i_840_]
				!= -1)
				i_849_ = (((Class166_Sub3) this)
					      .aClass103_Sub2_9962
					      .aClass107_1458.method2680
					  ((((Class205) class205)
					    .aShortArray2440[i_840_]) & 0xffff,
					   -1171626593)
					  .anInt1403) * 218388063;
			    if (i_849_ != -1)
				class155.method3384
				    (true, true, false, f_846_, f_847_, f_848_,
				     f, f_844_, f_845_, fs_776_[i_841_],
				     fs_776_[i_842_], fs_776_[i_843_],
				     fs_777_[i_841_], fs_777_[i_842_],
				     fs_777_[i_843_],
				     ((float) (((Class205) class205)
					       .aShortArray2433[i_841_])
				      / (float) (anInt2053 * 2039042417)),
				     ((float) (((Class205) class205)
					       .aShortArray2433[i_842_])
				      / (float) (anInt2053 * 2039042417)),
				     ((float) (((Class205) class205)
					       .aShortArray2433[i_843_])
				      / (float) (anInt2053 * 2039042417)),
				     ((float) (((Class205) class205)
					       .aShortArray2438[i_841_])
				      / (float) (anInt2053 * 2039042417)),
				     ((float) (((Class205) class205)
					       .aShortArray2438[i_842_])
				      / (float) (anInt2053 * 2039042417)),
				     ((float) (((Class205) class205)
					       .aShortArray2438[i_843_])
				      / (float) (anInt2053 * 2039042417)),
				     ~0xffffff | (Class474.anIntArray6382
						  [((((Class205) class205)
						     .aShortArray2436[i_841_])
						    & 0xffff)]) & 0xffffff,
				     ~0xffffff | (Class474.anIntArray6382
						  [((((Class205) class205)
						     .aShortArray2436[i_842_])
						    & 0xffff)]) & 0xffffff,
				     ~0xffffff | (Class474.anIntArray6382
						  [((((Class205) class205)
						     .aShortArray2436[i_843_])
						    & 0xffff)]) & 0xffffff,
				     0, 0.0F, 0.0F, 0.0F,
				     (((Class205) class205).aShortArray2440
				      [i_840_]) & 0xffff,
				     i_849_);
			    else {
				int i_850_ = (((Class205) class205)
					      .anIntArray2442[i_840_]);
				if (i_850_ != -1)
				    class155.method3380
					(true, true, false, f_846_, f_847_,
					 f_848_, f, f_844_, f_845_,
					 fs_776_[i_841_], fs_776_[i_842_],
					 fs_776_[i_843_],
					 (float) (Class639.method13606
						  (i_850_,
						   (((Class205) class205)
						    .aShortArray2436[i_841_]),
						   -1566605706)),
					 (float) (Class639.method13606
						  (i_850_,
						   (((Class205) class205)
						    .aShortArray2436[i_842_]),
						   -1956240514)),
					 (float) (Class639.method13606
						  (i_850_,
						   (((Class205) class205)
						    .aShortArray2436[i_843_]),
						   838249769)));
			    }
			}
		    }
		} else {
		    for (int i_851_ = 0;
			 i_851_ < ((Class205) class205).aShort2441; i_851_++) {
			short i_852_
			    = ((Class205) class205).aShortArray2437[i_851_];
			short i_853_
			    = ((Class205) class205).aShortArray2430[i_851_];
			short i_854_
			    = ((Class205) class205).aShortArray2443[i_851_];
			float f = fs[i_852_];
			float f_855_ = fs[i_853_];
			float f_856_ = fs[i_854_];
			float f_857_ = fs_775_[i_852_];
			float f_858_ = fs_775_[i_853_];
			float f_859_ = fs_775_[i_854_];
			if (((f - f_855_) * (f_859_ - f_858_)
			     - (f_857_ - f_858_) * (f_856_ - f_855_))
			    > 0.0F) {
			    int i_860_
				= ((Class205) class205).anIntArray2442[i_851_];
			    if (i_860_ != -1) {
				((Class155) class155).aBool1748
				    = (f < 0.0F || f_855_ < 0.0F
				       || f_856_ < 0.0F
				       || f > (float) (((Class155) class155)
						       .anInt1733)
				       || f_855_ > (float) ((Class155)
							    class155).anInt1733
				       || (f_856_
					   > (float) (((Class155) class155)
						      .anInt1733)));
				class155.method3380
				    (true, true, false, f_857_, f_858_, f_859_,
				     f, f_855_, f_856_, fs_776_[i_852_],
				     fs_776_[i_853_], fs_776_[i_854_],
				     (float) (Class639.method13606
					      (i_860_,
					       (((Class205) class205)
						.aShortArray2436[i_852_]),
					       1933019746)),
				     (float) (Class639.method13606
					      (i_860_,
					       (((Class205) class205)
						.aShortArray2436[i_853_]),
					       1694510458)),
				     (float) (Class639.method13606
					      (i_860_,
					       (((Class205) class205)
						.aShortArray2436[i_854_]),
					       -853379258)));
			    }
			}
		    }
		}
	    }
	}
    }
    
    static int method16253(int i, int i_861_) {
	int i_862_ = (i & 0xff0000) * i_861_ >> 23;
	if (i_862_ < 2)
	    i_862_ = 2;
	else if (i_862_ > 253)
	    i_862_ = 253;
	int i_863_ = (i & 0xff00) * i_861_ >> 15;
	if (i_863_ < 2)
	    i_863_ = 2;
	else if (i_863_ > 253)
	    i_863_ = 253;
	int i_864_ = (i & 0xff) * i_861_ >> 7;
	if (i_864_ < 2)
	    i_864_ = 2;
	else if (i_864_ > 253)
	    i_864_ = 253;
	return i_862_ << 16 | i_863_ << 8 | i_864_;
    }
    
    static int method16254(int i, int i_865_) {
	int i_866_ = (i & 0xff0000) * i_865_ >> 23;
	if (i_866_ < 2)
	    i_866_ = 2;
	else if (i_866_ > 253)
	    i_866_ = 253;
	int i_867_ = (i & 0xff00) * i_865_ >> 15;
	if (i_867_ < 2)
	    i_867_ = 2;
	else if (i_867_ > 253)
	    i_867_ = 253;
	int i_868_ = (i & 0xff) * i_865_ >> 7;
	if (i_868_ < 2)
	    i_868_ = 2;
	else if (i_868_ > 253)
	    i_868_ = 253;
	return i_866_ << 16 | i_867_ << 8 | i_868_;
    }
    
    public void method3565() {
	((Class166_Sub3) this).aByteArrayArray9990 = null;
	((Class166_Sub3) this).aByteArrayArray9991 = null;
    }
    
    void method16255(int i, int i_869_, boolean bool, Class189 class189,
		     Class155 class155, float[] fs, float[] fs_870_,
		     float[] fs_871_, float[] fs_872_, float[] fs_873_,
		     int i_874_) {
	Class201 class201
	    = ((Class166_Sub3) this).aClass201ArrayArray9967[i][i_869_];
	if (class201 != null) {
	    if ((((Class201) class201).aByte2409 & 0x2) == 0) {
		if (i_874_ != 0) {
		    if ((((Class201) class201).aByte2409 & 0x4) != 0) {
			if ((i_874_ & 0x1) != 0)
			    return;
		    } else if ((i_874_ & 0x2) != 0)
			return;
		}
		int i_875_ = i * (anInt2053 * 2039042417);
		int i_876_ = i_875_ + anInt2053 * 2039042417;
		int i_877_ = i_869_ * (anInt2053 * 2039042417);
		int i_878_ = i_877_ + anInt2053 * 2039042417;
		float f = 0.0F;
		float f_879_ = 0.0F;
		float f_880_ = 0.0F;
		float f_881_ = 0.0F;
		float f_882_;
		float f_883_;
		float f_884_;
		float f_885_;
		float f_886_;
		float f_887_;
		float f_888_;
		float f_889_;
		float f_890_;
		float f_891_;
		float f_892_;
		float f_893_;
		float f_894_;
		float f_895_;
		float f_896_;
		float f_897_;
		if ((((Class201) class201).aByte2409 & 0x1) != 0 && !bool) {
		    int i_898_ = anIntArrayArray2051[i][i_869_];
		    float f_899_
			= ((Class166_Sub3) this).aFloat9980 * (float) i_898_;
		    float f_900_
			= ((Class166_Sub3) this).aFloat9989 * (float) i_898_;
		    float f_901_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_875_)
				       + f_899_
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_877_)));
		    f_882_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_875_)
				 + f_900_
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_877_)));
		    if (f_901_ < -f_882_)
			return;
		    float f_902_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_876_)
				       + f_899_
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_877_)));
		    f_883_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_876_)
				 + f_900_
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_877_)));
		    if (f_902_ < -f_883_)
			return;
		    float f_903_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_876_)
				       + f_899_
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_878_)));
		    f_884_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_876_)
				 + f_900_
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_878_)));
		    if (f_903_ < -f_884_)
			return;
		    float f_904_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_875_)
				       + f_899_
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_878_)));
		    f_885_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_875_)
				 + f_900_
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_878_)));
		    if (f_904_ < -f_885_)
			return;
		    f_886_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_901_
				 / f_882_));
		    f_887_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_902_
				 / f_883_));
		    f_888_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_903_
				 / f_884_));
		    f_889_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_904_
				 / f_885_));
		    if (((Class189) class189).aBool2209) {
			float f_905_
			    = f_901_ - ((Class189) class189).aFloat2213;
			if (f_905_ > 0.0F) {
			    f = f_905_ / ((Class189) class189).aFloat2214;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_905_ = f_902_ - ((Class189) class189).aFloat2213;
			if (f_905_ > 0.0F) {
			    f_879_ = f_905_ / ((Class189) class189).aFloat2214;
			    if (f_879_ > 1.0F)
				f_879_ = 1.0F;
			}
			f_905_ = f_903_ - ((Class189) class189).aFloat2213;
			if (f_905_ > 0.0F) {
			    f_880_ = f_905_ / ((Class189) class189).aFloat2214;
			    if (f_880_ > 1.0F)
				f_880_ = 1.0F;
			}
			f_905_ = f_904_ - ((Class189) class189).aFloat2213;
			if (f_905_ > 0.0F) {
			    f_881_ = f_905_ / ((Class189) class189).aFloat2214;
			    if (f_881_ > 1.0F)
				f_881_ = 1.0F;
			}
		    }
		    float f_906_
			= ((Class166_Sub3) this).aFloat9978 * (float) i_898_;
		    float f_907_
			= ((Class166_Sub3) this).aFloat9965 * (float) i_898_;
		    float f_908_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_875_)
				       + f_906_
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_877_)));
		    f_890_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_908_
				 / f_882_));
		    float f_909_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_875_)
				       + f_907_
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_877_)));
		    f_891_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_909_
				 / f_882_));
		    float f_910_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_876_)
				       + f_906_
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_877_)));
		    f_892_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_910_
				 / f_883_));
		    float f_911_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_876_)
				       + f_907_
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_877_)));
		    f_893_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_911_
				 / f_883_));
		    float f_912_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_876_)
				       + f_906_
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_878_)));
		    f_894_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_912_
				 / f_884_));
		    float f_913_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_876_)
				       + f_907_
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_878_)));
		    f_895_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_913_
				 / f_884_));
		    float f_914_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_875_)
				       + f_906_
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_878_)));
		    f_896_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_914_
				 / f_885_));
		    float f_915_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_875_)
				       + f_907_
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_878_)));
		    f_897_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_915_
				 / f_885_));
		} else {
		    int i_916_ = anIntArrayArray2051[i][i_869_];
		    int i_917_ = anIntArrayArray2051[i + 1][i_869_];
		    int i_918_ = anIntArrayArray2051[i + 1][i_869_ + 1];
		    int i_919_ = anIntArrayArray2051[i][i_869_ + 1];
		    float f_920_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_875_)
				       + (((Class166_Sub3) this).aFloat9980
					  * (float) i_916_)
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_877_)));
		    f_882_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_875_)
				 + (((Class166_Sub3) this).aFloat9989
				    * (float) i_916_)
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_877_)));
		    if (f_920_ < -f_882_)
			return;
		    float f_921_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_876_)
				       + (((Class166_Sub3) this).aFloat9980
					  * (float) i_917_)
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_877_)));
		    f_883_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_876_)
				 + (((Class166_Sub3) this).aFloat9989
				    * (float) i_917_)
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_877_)));
		    if (f_921_ < -f_883_)
			return;
		    float f_922_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_876_)
				       + (((Class166_Sub3) this).aFloat9980
					  * (float) i_918_)
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_878_)));
		    f_884_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_876_)
				 + (((Class166_Sub3) this).aFloat9989
				    * (float) i_918_)
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_878_)));
		    if (f_922_ < -f_884_)
			return;
		    float f_923_ = (((Class166_Sub3) this).aFloat9988
				    + ((((Class166_Sub3) this).aFloat9976
					* (float) i_875_)
				       + (((Class166_Sub3) this).aFloat9980
					  * (float) i_919_)
				       + (((Class166_Sub3) this).aFloat9984
					  * (float) i_878_)));
		    f_885_ = (((Class166_Sub3) this).aFloat9974
			      + ((((Class166_Sub3) this).aFloat9977
				  * (float) i_875_)
				 + (((Class166_Sub3) this).aFloat9989
				    * (float) i_919_)
				 + (((Class166_Sub3) this).aFloat9985
				    * (float) i_878_)));
		    if (f_923_ < -f_885_)
			return;
		    f_886_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_920_
				 / f_882_));
		    f_887_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_921_
				 / f_883_));
		    f_888_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_922_
				 / f_884_));
		    f_889_ = (((Class155) class155).aFloat1720
			      + (((Class155) class155).aFloat1732 * f_923_
				 / f_885_));
		    if (bool) {
			float f_924_
			    = f_920_ - ((Class189) class189).aFloat2213;
			if (f_924_ > 0.0F) {
			    f_924_ /= ((Class189) class189).aFloat2214;
			    if (f_924_ > 1.0F)
				f_924_ = 1.0F;
			    f = f_924_;
			    int i_925_ = (int) ((float) (((Class201) class201)
							 .aShort2403)
						* f_924_);
			    if (i_925_ > 0)
				i_916_ -= i_925_;
			}
			f_924_ = f_921_ - ((Class189) class189).aFloat2213;
			if (f_924_ > 0.0F) {
			    f_924_ /= ((Class189) class189).aFloat2214;
			    if (f_924_ > 1.0F)
				f_924_ = 1.0F;
			    f_879_ = f_924_;
			    int i_926_ = (int) ((float) (((Class201) class201)
							 .aShort2407)
						* f_924_);
			    if (i_926_ > 0)
				i_917_ -= i_926_;
			}
			f_924_ = f_922_ - ((Class189) class189).aFloat2213;
			if (f_924_ > 0.0F) {
			    f_924_ /= ((Class189) class189).aFloat2214;
			    if (f_924_ > 1.0F)
				f_924_ = 1.0F;
			    f_880_ = f_924_;
			    int i_927_ = (int) ((float) (((Class201) class201)
							 .aShort2406)
						* f_924_);
			    if (i_927_ > 0)
				i_918_ -= i_927_;
			}
			f_924_ = f_923_ - ((Class189) class189).aFloat2213;
			if (f_924_ > 0.0F) {
			    f_924_ /= ((Class189) class189).aFloat2214;
			    if (f_924_ > 1.0F)
				f_924_ = 1.0F;
			    f_881_ = f_924_;
			    int i_928_ = (int) ((float) (((Class201) class201)
							 .aShort2402)
						* f_924_);
			    if (i_928_ > 0)
				i_919_ -= i_928_;
			}
		    } else if (((Class189) class189).aBool2209) {
			float f_929_
			    = f_920_ - ((Class189) class189).aFloat2213;
			if (f_929_ > 0.0F) {
			    f = f_929_ / ((Class189) class189).aFloat2214;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_929_ = f_921_ - ((Class189) class189).aFloat2213;
			if (f_929_ > 0.0F) {
			    f_879_ = f_929_ / ((Class189) class189).aFloat2214;
			    if (f_879_ > 1.0F)
				f_879_ = 1.0F;
			}
			f_929_ = f_922_ - ((Class189) class189).aFloat2213;
			if (f_929_ > 0.0F) {
			    f_880_ = f_929_ / ((Class189) class189).aFloat2214;
			    if (f_880_ > 1.0F)
				f_880_ = 1.0F;
			}
			f_929_ = f_923_ - ((Class189) class189).aFloat2213;
			if (f_929_ > 0.0F) {
			    f_881_ = f_929_ / ((Class189) class189).aFloat2214;
			    if (f_881_ > 1.0F)
				f_881_ = 1.0F;
			}
		    }
		    float f_930_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_875_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_916_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_877_)));
		    f_890_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_930_
				 / f_882_));
		    float f_931_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_875_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_916_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_877_)));
		    f_891_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_931_
				 / f_882_));
		    float f_932_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_876_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_917_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_877_)));
		    f_892_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_932_
				 / f_883_));
		    float f_933_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_876_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_917_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_877_)));
		    f_893_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_933_
				 / f_883_));
		    float f_934_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_876_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_918_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_878_)));
		    f_894_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_934_
				 / f_884_));
		    float f_935_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_876_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_918_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_878_)));
		    f_895_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_935_
				 / f_884_));
		    float f_936_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_875_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_919_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_878_)));
		    f_896_ = (((Class155) class155).aFloat1727
			      + (((Class155) class155).aFloat1728 * f_936_
				 / f_885_));
		    float f_937_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_875_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_919_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_878_)));
		    f_897_ = (((Class155) class155).aFloat1731
			      + (((Class155) class155).aFloat1729 * f_937_
				 / f_885_));
		}
		Class101 class101 = null;
		int i_938_ = -1;
		if (((Class201) class201).aShort2411 != -1) {
		    class101 = (((Class166_Sub3) this).aClass103_Sub2_9962
				    .aClass107_1458.method2680
				(((Class201) class201).aShort2411 & 0xffff,
				 -256095256));
		    i_938_ = class101.anInt1403 * 218388063;
		}
		boolean bool_939_
		    = class101 != null && method16256(class101.aByte1427);
		float f_940_ = f_879_ + f_880_ + f_881_;
		if (((f_894_ - f_896_) * (f_893_ - f_897_)
		     - (f_895_ - f_897_) * (f_892_ - f_896_))
		    > 0.0F) {
		    ((Class155) class155).aBool1748
			= (f_894_ < 0.0F || f_896_ < 0.0F || f_892_ < 0.0F
			   || f_894_ > (float) ((Class155) class155).anInt1733
			   || f_896_ > (float) ((Class155) class155).anInt1733
			   || (f_892_
			       > (float) ((Class155) class155).anInt1733));
		    if (f_940_ < 3.0F) {
			if (f_940_ > 0.0F) {
			    if (i_938_ >= 0) {
				int i_941_ = -16777216;
				if (bool_939_)
				    i_941_ = -1694498816;
				class155.method3384
				    (true, true, false, f_895_, f_897_, f_893_,
				     f_894_, f_896_, f_892_, f_888_, f_889_,
				     f_887_, f_884_, f_885_, f_883_, 1.0F,
				     0.0F, 1.0F, 1.0F, 1.0F, 0.0F,
				     i_941_ | (((Class201) class201).anInt2404
					       & 0xffffff),
				     i_941_ | (((Class201) class201).anInt2405
					       & 0xffffff),
				     i_941_ | (((Class201) class201).anInt2401
					       & 0xffffff),
				     (((Class189) class189).anInt2215
				      * -338296791),
				     f_880_ * 255.0F, f_881_ * 255.0F,
				     f_879_ * 255.0F,
				     ((Class201) class201).aShort2411 & 0xffff,
				     i_938_);
			    } else {
				if (bool_939_)
				    ((Class155) class155).anInt1723 = 100;
				class155.method3385
				    (true, true, false, f_895_, f_897_, f_893_,
				     f_894_, f_896_, f_892_, f_888_, f_889_,
				     f_887_,
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2404,
				       ((int) (f_880_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       -586119629)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2405,
				       ((int) (f_881_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       -1406959776)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2401,
				       ((int) (f_879_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       1629145003)));
				((Class155) class155).anInt1723 = 0;
			    }
			} else if (i_938_ >= 0) {
			    int i_942_ = -16777216;
			    if (bool_939_)
				i_942_ = -1694498816;
			    class155.method3384
				(true, true, false, f_895_, f_897_, f_893_,
				 f_894_, f_896_, f_892_, f_888_, f_889_,
				 f_887_, f_884_, f_885_, f_883_, 1.0F, 0.0F,
				 1.0F, 1.0F, 1.0F, 0.0F,
				 i_942_ | (((Class201) class201).anInt2404
					   & 0xffffff),
				 i_942_ | (((Class201) class201).anInt2405
					   & 0xffffff),
				 i_942_ | (((Class201) class201).anInt2401
					   & 0xffffff),
				 0, 0.0F, 0.0F, 0.0F,
				 ((Class201) class201).aShort2411 & 0xffff,
				 i_938_);
			} else {
			    if (bool_939_)
				((Class155) class155).anInt1723 = 100;
			    class155.method3385
				(true, true, false, f_895_, f_897_, f_893_,
				 f_894_, f_896_, f_892_, f_888_, f_889_,
				 f_887_, ((Class201) class201).anInt2404,
				 ((Class201) class201).anInt2405,
				 ((Class201) class201).anInt2401);
			    ((Class155) class155).anInt1723 = 0;
			}
		    } else
			class155.method3377(true, true, false, f_895_, f_897_,
					    f_893_, f_894_, f_896_, f_892_,
					    f_888_, f_889_, f_887_,
					    (((Class189) class189).anInt2215
					     * -338296791));
		}
		f_940_ = f + f_879_ + f_881_;
		if (((f_890_ - f_892_) * (f_897_ - f_893_)
		     - (f_891_ - f_893_) * (f_896_ - f_892_))
		    > 0.0F) {
		    ((Class155) class155).aBool1748
			= (f_890_ < 0.0F || f_892_ < 0.0F || f_896_ < 0.0F
			   || f_890_ > (float) ((Class155) class155).anInt1733
			   || f_892_ > (float) ((Class155) class155).anInt1733
			   || (f_896_
			       > (float) ((Class155) class155).anInt1733));
		    if (f_940_ < 3.0F) {
			if (bool_939_)
			    ((Class155) class155).anInt1723 = -1694498816;
			if (f_940_ > 0.0F) {
			    if (i_938_ >= 0) {
				int i_943_ = -16777216;
				if (bool_939_)
				    i_943_ = -1694498816;
				class155.method3384
				    (true, true, false, f_891_, f_893_, f_897_,
				     f_890_, f_892_, f_896_, f_886_, f_887_,
				     f_889_, f_882_, f_883_, f_885_, 0.0F,
				     1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
				     i_943_ | (((Class201) class201).anInt2410
					       & 0xffffff),
				     i_943_ | (((Class201) class201).anInt2401
					       & 0xffffff),
				     i_943_ | (((Class201) class201).anInt2405
					       & 0xffffff),
				     (((Class189) class189).anInt2215
				      * -338296791),
				     f * 255.0F, f_879_ * 255.0F,
				     f_881_ * 255.0F,
				     ((Class201) class201).aShort2411 & 0xffff,
				     i_938_);
			    } else {
				if (bool_939_)
				    ((Class155) class155).anInt1723 = 100;
				class155.method3385
				    (true, true, false, f_891_, f_893_, f_897_,
				     f_890_, f_892_, f_896_, f_886_, f_887_,
				     f_889_,
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2410,
				       ((int) (f * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       1547220094)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2401,
				       ((int) (f_879_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       -1993530344)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2405,
				       ((int) (f_881_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       -245666167)));
				((Class155) class155).anInt1723 = 0;
			    }
			} else if (i_938_ >= 0) {
			    int i_944_ = -16777216;
			    if (bool_939_)
				i_944_ = -1694498816;
			    class155.method3384
				(true, true, false, f_891_, f_893_, f_897_,
				 f_890_, f_892_, f_896_, f_886_, f_887_,
				 f_889_, f_882_, f_883_, f_885_, 0.0F, 1.0F,
				 1.0F, 0.0F, 0.0F, 1.0F,
				 i_944_ | (((Class201) class201).anInt2410
					   & 0xffffff),
				 i_944_ | (((Class201) class201).anInt2401
					   & 0xffffff),
				 i_944_ | (((Class201) class201).anInt2405
					   & 0xffffff),
				 0, 0.0F, 0.0F, 0.0F,
				 ((Class201) class201).aShort2411 & 0xffff,
				 i_938_);
			} else {
			    if (bool_939_)
				((Class155) class155).anInt1723 = 100;
			    class155.method3385
				(true, true, false, f_891_, f_893_, f_897_,
				 f_890_, f_892_, f_896_, f_886_, f_887_,
				 f_889_, ((Class201) class201).anInt2410,
				 ((Class201) class201).anInt2401,
				 ((Class201) class201).anInt2405);
			    ((Class155) class155).anInt1723 = 0;
			}
		    } else
			class155.method3377(true, true, false, f_891_, f_893_,
					    f_897_, f_890_, f_892_, f_896_,
					    f_886_, f_887_, f_889_,
					    (((Class189) class189).anInt2215
					     * -338296791));
		}
	    }
	} else {
	    Class183 class183
		= ((Class166_Sub3) this).aClass183ArrayArray9969[i][i_869_];
	    if (class183 != null) {
		if (i_874_ != 0) {
		    if ((((Class183) class183).aByte2157 & 0x4) != 0) {
			if ((i_874_ & 0x1) != 0)
			    return;
		    } else if ((i_874_ & 0x2) != 0)
			return;
		}
		for (int i_945_ = 0; i_945_ < ((Class183) class183).aShort2154;
		     i_945_++) {
		    int i_946_ = (((Class183) class183).aShortArray2156[i_945_]
				  + (i << anInt2054 * -122333825));
		    int i_947_ = ((Class183) class183).aShortArray2153[i_945_];
		    int i_948_ = (((Class183) class183).aShortArray2158[i_945_]
				  + (i_869_ << anInt2054 * -122333825));
		    float f = (((Class166_Sub3) this).aFloat9988
			       + ((((Class166_Sub3) this).aFloat9976
				   * (float) i_946_)
				  + (((Class166_Sub3) this).aFloat9980
				     * (float) i_947_)
				  + (((Class166_Sub3) this).aFloat9984
				     * (float) i_948_)));
		    float f_949_ = (((Class166_Sub3) this).aFloat9974
				    + ((((Class166_Sub3) this).aFloat9977
					* (float) i_946_)
				       + (((Class166_Sub3) this).aFloat9989
					  * (float) i_947_)
				       + (((Class166_Sub3) this).aFloat9985
					  * (float) i_948_)));
		    if (f < -f_949_)
			return;
		    float f_950_
			= (((Class155) class155).aFloat1720
			   + ((Class155) class155).aFloat1732 * f / f_949_);
		    fs_873_[i_945_] = 0.0F;
		    if (bool) {
			float f_951_ = f - ((Class189) class189).aFloat2213;
			if (f_951_ > 0.0F) {
			    f_951_ /= ((Class189) class189).aFloat2214;
			    if (f_951_ > 1.0F)
				f_951_ = 1.0F;
			    fs_873_[i_945_] = f_951_;
			    int i_952_
				= (int) ((float) (((Class183) class183)
						  .aShortArray2159[i_945_])
					 * f_951_);
			    if (i_952_ > 0)
				i_947_ -= i_952_;
			}
		    } else if (((Class189) class189).aBool2209) {
			float f_953_ = f - ((Class189) class189).aFloat2213;
			if (f_953_ > 0.0F) {
			    fs_873_[i_945_]
				= f_953_ / ((Class189) class189).aFloat2214;
			    if (fs_873_[i_945_] > 1.0F)
				fs_873_[i_945_] = 1.0F;
			}
		    }
		    float f_954_ = (((Class166_Sub3) this).aFloat9986
				    + ((((Class166_Sub3) this).aFloat9981
					* (float) i_946_)
				       + (((Class166_Sub3) this).aFloat9978
					  * (float) i_947_)
				       + (((Class166_Sub3) this).aFloat9982
					  * (float) i_948_)));
		    float f_955_ = (((Class166_Sub3) this).aFloat9987
				    + ((((Class166_Sub3) this).aFloat9973
					* (float) i_946_)
				       + (((Class166_Sub3) this).aFloat9965
					  * (float) i_947_)
				       + (((Class166_Sub3) this).aFloat9983
					  * (float) i_948_)));
		    fs[i_945_] = (((Class155) class155).aFloat1727
				  + (((Class155) class155).aFloat1728 * f_954_
				     / f_949_));
		    fs_870_[i_945_] = (((Class155) class155).aFloat1731
				       + (((Class155) class155).aFloat1729
					  * f_955_ / f_949_));
		    fs_871_[i_945_] = f_950_;
		    fs_872_[i_945_] = f_949_;
		}
		if (((Class183) class183).aShortArray2161 != null) {
		    for (int i_956_ = 0;
			 i_956_ < ((Class183) class183).aShort2160; i_956_++) {
			int i_957_ = i_956_ * 3;
			int i_958_ = i_957_ + 1;
			int i_959_ = i_958_ + 1;
			float f = fs[i_957_];
			float f_960_ = fs[i_958_];
			float f_961_ = fs[i_959_];
			float f_962_ = fs_870_[i_957_];
			float f_963_ = fs_870_[i_958_];
			float f_964_ = fs_870_[i_959_];
			float f_965_ = (fs_873_[i_957_] + fs_873_[i_958_]
					+ fs_873_[i_959_]);
			if (((f - f_960_) * (f_964_ - f_963_)
			     - (f_962_ - f_963_) * (f_961_ - f_960_))
			    > 0.0F) {
			    ((Class155) class155).aBool1748
				= (f < 0.0F || f_960_ < 0.0F || f_961_ < 0.0F
				   || f > (float) (((Class155) class155)
						   .anInt1733)
				   || f_960_ > (float) (((Class155) class155)
							.anInt1733)
				   || f_961_ > (float) (((Class155) class155)
							.anInt1733));
			    Class101 class101 = null;
			    int i_966_ = -1;
			    if (((Class183) class183).aShortArray2161[i_956_]
				!= -1) {
				class101
				    = (((Class166_Sub3) this)
					   .aClass103_Sub2_9962.aClass107_1458
					   .method2680
				       ((((Class183) class183).aShortArray2161
					 [i_956_]) & 0xffff,
					1296730560));
				i_966_ = class101.anInt1403 * 218388063;
			    }
			    if (f_965_ < 3.0F) {
				if (f_965_ > 0.0F) {
				    if (i_966_ != -1) {
					int i_967_ = -16777216;
					if (i_966_ != -1
					    && method16256(class101.aByte1427))
					    i_967_ = -1694498816;
					class155.method3384
					    (true, true, false, f_962_, f_963_,
					     f_964_, f, f_960_, f_961_,
					     fs_871_[i_957_], fs_871_[i_958_],
					     fs_871_[i_959_], fs_872_[i_957_],
					     fs_872_[i_958_], fs_872_[i_959_],
					     ((float) (((Class183) class183)
						       .aShortArray2156
						       [i_957_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2156
						       [i_958_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2156
						       [i_959_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2158
						       [i_957_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2158
						       [i_958_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2158
						       [i_959_])
					      / (float) (anInt2053
							 * 2039042417)),
					     i_967_ | (((Class183) class183)
						       .anIntArray2163
						       [i_957_]) & 0xffffff,
					     i_967_ | (((Class183) class183)
						       .anIntArray2163
						       [i_958_]) & 0xffffff,
					     i_967_ | (((Class183) class183)
						       .anIntArray2163
						       [i_959_]) & 0xffffff,
					     (((Class189) class189).anInt2215
					      * -338296791),
					     fs_873_[i_957_] * 255.0F,
					     fs_873_[i_958_] * 255.0F,
					     fs_873_[i_959_] * 255.0F,
					     ((((Class183) class183)
					       .aShortArray2161[i_956_])
					      & 0xffff),
					     i_966_);
				    } else if (((((Class183) class183)
						 .anIntArray2163[i_957_])
						& 0xffffff)
					       != 0) {
					if (i_966_ != -1
					    && method16256(class101.aByte1427))
					    ((Class155) class155).anInt1723
						= -1694498816;
					class155.method3385
					    (true, true, false, f_962_, f_963_,
					     f_964_, f, f_960_, f_961_,
					     fs_871_[i_957_], fs_871_[i_958_],
					     fs_871_[i_959_],
					     (Class241_Sub18_Sub1.method17140
					      ((((Class183) class183)
						.anIntArray2163[i_957_]),
					       ((int) (fs_873_[i_957_]
						       * 255.0F) << 24
						| (((Class189) class189)
						   .anInt2215) * -338296791),
					       1587812933)),
					     (Class241_Sub18_Sub1.method17140
					      ((((Class183) class183)
						.anIntArray2163[i_958_]),
					       ((int) (fs_873_[i_958_]
						       * 255.0F) << 24
						| (((Class189) class189)
						   .anInt2215) * -338296791),
					       1365086309)),
					     (Class241_Sub18_Sub1.method17140
					      ((((Class183) class183)
						.anIntArray2163[i_959_]),
					       ((int) (fs_873_[i_959_]
						       * 255.0F) << 24
						| (((Class189) class189)
						   .anInt2215) * -338296791),
					       1578154439)));
					((Class155) class155).anInt1723 = 0;
				    }
				} else if (i_966_ != -1) {
				    int i_968_ = -16777216;
				    if (i_966_ != -1
					&& method16256(class101.aByte1427))
					i_968_ = -1694498816;
				    class155.method3384
					(true, true, false, f_962_, f_963_,
					 f_964_, f, f_960_, f_961_,
					 fs_871_[i_957_], fs_871_[i_958_],
					 fs_871_[i_959_], fs_872_[i_957_],
					 fs_872_[i_958_], fs_872_[i_959_],
					 ((float) (((Class183) class183)
						   .aShortArray2156[i_957_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2156[i_958_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2156[i_959_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2158[i_957_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2158[i_958_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2158[i_959_])
					  / (float) (anInt2053 * 2039042417)),
					 i_968_ | ((((Class183) class183)
						    .anIntArray2163[i_957_])
						   & 0xffffff),
					 i_968_ | ((((Class183) class183)
						    .anIntArray2163[i_958_])
						   & 0xffffff),
					 i_968_ | ((((Class183) class183)
						    .anIntArray2163[i_959_])
						   & 0xffffff),
					 0, 0.0F, 0.0F, 0.0F,
					 (((Class183) class183).aShortArray2161
					  [i_956_]) & 0xffff,
					 i_966_);
				} else if (((((Class183) class183)
					     .anIntArray2163[i_957_])
					    & 0xffffff)
					   != 0) {
				    if (i_966_ != -1
					&& method16256(class101.aByte1427))
					((Class155) class155).anInt1723
					    = -1694498816;
				    class155.method3385(true, true, false,
							f_962_, f_963_, f_964_,
							f, f_960_, f_961_,
							fs_871_[i_957_],
							fs_871_[i_958_],
							fs_871_[i_959_],
							(((Class183) class183)
							 .anIntArray2163
							 [i_957_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_958_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_959_]));
				    ((Class155) class155).anInt1723 = 0;
				}
			    } else
				class155.method3377(true, true, false, f_962_,
						    f_963_, f_964_, f, f_960_,
						    f_961_, fs_871_[i_957_],
						    fs_871_[i_958_],
						    fs_871_[i_959_],
						    (((Class189) class189)
						     .anInt2215) * -338296791);
			}
		    }
		} else {
		    for (int i_969_ = 0;
			 i_969_ < ((Class183) class183).aShort2160; i_969_++) {
			int i_970_ = i_969_ * 3;
			int i_971_ = i_970_ + 1;
			int i_972_ = i_971_ + 1;
			float f = fs[i_970_];
			float f_973_ = fs[i_971_];
			float f_974_ = fs[i_972_];
			float f_975_ = fs_870_[i_970_];
			float f_976_ = fs_870_[i_971_];
			float f_977_ = fs_870_[i_972_];
			float f_978_ = (fs_873_[i_970_] + fs_873_[i_971_]
					+ fs_873_[i_972_]);
			if (((f - f_973_) * (f_977_ - f_976_)
			     - (f_975_ - f_976_) * (f_974_ - f_973_))
			    > 0.0F) {
			    ((Class155) class155).aBool1748
				= (f < 0.0F || f_973_ < 0.0F || f_974_ < 0.0F
				   || f > (float) (((Class155) class155)
						   .anInt1733)
				   || f_973_ > (float) (((Class155) class155)
							.anInt1733)
				   || f_974_ > (float) (((Class155) class155)
							.anInt1733));
			    if (f_978_ < 3.0F) {
				if (f_978_ > 0.0F) {
				    if (((((Class183) class183).anIntArray2163
					  [i_970_])
					 & 0xffffff)
					!= 0)
					class155.method3385
					    (true, true, false, f_975_, f_976_,
					     f_977_, f, f_973_, f_974_,
					     fs_871_[i_970_], fs_871_[i_971_],
					     fs_871_[i_972_],
					     (Class54.method1306
					      ((((Class183) class183)
						.anIntArray2163[i_970_]),
					       (((Class189) class189).anInt2215
						* -338296791),
					       fs_873_[i_970_] * 255.0F,
					       1372221625)),
					     (Class54.method1306
					      ((((Class183) class183)
						.anIntArray2163[i_971_]),
					       (((Class189) class189).anInt2215
						* -338296791),
					       fs_873_[i_971_] * 255.0F,
					       1372221625)),
					     (Class54.method1306
					      ((((Class183) class183)
						.anIntArray2163[i_972_]),
					       (((Class189) class189).anInt2215
						* -338296791),
					       fs_873_[i_972_] * 255.0F,
					       1372221625)));
				} else if (((((Class183) class183)
					     .anIntArray2163[i_970_])
					    & 0xffffff)
					   != 0)
				    class155.method3385(true, true, false,
							f_975_, f_976_, f_977_,
							f, f_973_, f_974_,
							fs_871_[i_970_],
							fs_871_[i_971_],
							fs_871_[i_972_],
							(((Class183) class183)
							 .anIntArray2163
							 [i_970_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_971_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_972_]));
			    } else
				class155.method3377(true, true, false, f_975_,
						    f_976_, f_977_, f, f_973_,
						    f_974_, fs_871_[i_970_],
						    fs_871_[i_971_],
						    fs_871_[i_972_],
						    (((Class189) class189)
						     .anInt2215) * -338296791);
			}
		    }
		}
	    }
	}
    }
    
    boolean method16256(int i) {
	if ((((Class166_Sub3) this).anInt9968 & 0x8) == 0)
	    return false;
	if (i == 4)
	    return true;
	if (i == 8)
	    return true;
	if (i == 9)
	    return true;
	return false;
    }
    
    void method16257(int i, int i_979_, int i_980_) {
	Class189 class189 = ((Class166_Sub3) this).aClass103_Sub2_9962
				.method15377(Thread.currentThread());
	((Class155) ((Class189) class189).aClass155_2223).anInt1723 = 0;
	if (((Class166_Sub3) this).aClass201ArrayArray9967 != null)
	    method16241(i, i_979_, ((Class189) class189).aBool2217, class189,
			((Class189) class189).aClass155_2223,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211,
			((Class189) class189).aFloatArray2251,
			((Class189) class189).aFloatArray2252,
			((Class189) class189).aFloatArray2250, i_980_);
	else if (((Class166_Sub3) this).aClass182ArrayArray9975 != null)
	    method16249(i, i_979_, ((Class189) class189).aClass155_2223,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211,
			((Class189) class189).aFloatArray2251,
			((Class189) class189).aFloatArray2252,
			((Class189) class189).aFloatArray2250, i_980_);
	else if (((Class166_Sub3) this).aClass143ArrayArray9979 != null)
	    method16248(i, i_979_, ((Class189) class189).aBool2217, class189,
			((Class189) class189).aClass155_2223,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211,
			((Class189) class189).aFloatArray2251,
			((Class189) class189).aFloatArray2252,
			((Class189) class189).aFloatArray2250, i_980_);
    }
    
    void method16258(int i, int i_981_, int i_982_) {
	Class189 class189 = ((Class166_Sub3) this).aClass103_Sub2_9962
				.method15377(Thread.currentThread());
	((Class155) ((Class189) class189).aClass155_2223).anInt1723 = 0;
	if (((Class166_Sub3) this).aClass201ArrayArray9967 != null)
	    method16241(i, i_981_, ((Class189) class189).aBool2217, class189,
			((Class189) class189).aClass155_2223,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211,
			((Class189) class189).aFloatArray2251,
			((Class189) class189).aFloatArray2252,
			((Class189) class189).aFloatArray2250, i_982_);
	else if (((Class166_Sub3) this).aClass182ArrayArray9975 != null)
	    method16249(i, i_981_, ((Class189) class189).aClass155_2223,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211,
			((Class189) class189).aFloatArray2251,
			((Class189) class189).aFloatArray2252,
			((Class189) class189).aFloatArray2250, i_982_);
	else if (((Class166_Sub3) this).aClass143ArrayArray9979 != null)
	    method16248(i, i_981_, ((Class189) class189).aBool2217, class189,
			((Class189) class189).aClass155_2223,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211,
			((Class189) class189).aFloatArray2251,
			((Class189) class189).aFloatArray2252,
			((Class189) class189).aFloatArray2250, i_982_);
    }
    
    Class166_Sub3(Class103_Sub2 class103_sub2, int i, int i_983_, int i_984_,
		  int i_985_, int[][] is, int[][] is_986_, int i_987_) {
	super(i_984_, i_985_, i_987_, is);
	((Class166_Sub3) this).aClass103_Sub2_9962 = class103_sub2;
	((Class166_Sub3) this).anInt9968 = i_983_;
	((Class166_Sub3) this).aByteArrayArray9990
	    = new byte[i_984_ + 1][i_985_ + 1];
	int i_988_
	    = ((((Class103_Sub2) ((Class166_Sub3) this).aClass103_Sub2_9962)
		.anInt9255) * 380315217
	       >> 9);
	for (int i_989_ = 1; i_989_ < i_985_; i_989_++) {
	    for (int i_990_ = 1; i_990_ < i_984_; i_990_++) {
		int i_991_ = i_988_;
		int i_992_ = (is_986_[i_990_ + 1][i_989_]
			      - is_986_[i_990_ - 1][i_989_]);
		int i_993_ = (is_986_[i_990_][i_989_ + 1]
			      - is_986_[i_990_][i_989_ - 1]);
		int i_994_
		    = (int) Math.sqrt((double) (i_992_ * i_992_ + 512 * i_987_
						+ i_993_ * i_993_));
		int i_995_ = (i_992_ << 8) / i_994_;
		int i_996_ = -512 * i_987_ / i_994_;
		int i_997_ = (i_993_ << 8) / i_994_;
		i_991_ += ((((Class103_Sub2) (((Class166_Sub3) this)
					      .aClass103_Sub2_9962)).anInt9266
			    * 1091642367 * i_995_)
			   + (((Class103_Sub2)
			       ((Class166_Sub3) this).aClass103_Sub2_9962)
			      .anInt9258) * 2068876759 * i_996_
			   + (((Class103_Sub2)
			       ((Class166_Sub3) this).aClass103_Sub2_9962)
			      .anInt9273) * -1017303393 * i_997_) >> 17;
		i_991_ >>= 1;
		if (i_991_ < 2)
		    i_991_ = 2;
		else if (i_991_ > 126)
		    i_991_ = 126;
		((Class166_Sub3) this).aByteArrayArray9990[i_990_][i_989_]
		    = (byte) i_991_;
	    }
	}
	((Class166_Sub3) this).aByteArrayArray9991
	    = new byte[i_984_ + 1][i_985_ + 1];
    }
    
    void method16259(int i, int i_998_, int i_999_, int i_1000_, int i_1001_,
		     int i_1002_, int i_1003_, boolean[][] bools,
		     Class189 class189, Class155 class155, float[] fs,
		     float[] fs_1004_) {
	int i_1005_ = (i_1003_ - i_1001_) * i_999_ / 256;
	int i_1006_ = i_999_ >> 8;
	boolean bool = ((Class189) class189).aBool2220;
	((Class166_Sub3) this).aClass103_Sub2_9962.method2308(false);
	((Class155) class155).aBool1721 = false;
	((Class155) class155).aBool1722 = false;
	int i_1007_ = i;
	int i_1008_ = i_998_ + i_1005_;
	for (int i_1009_ = i_1000_; i_1009_ < i_1002_; i_1009_++) {
	    for (int i_1010_ = i_1001_; i_1010_ < i_1003_; i_1010_++) {
		if (bools[i_1009_ - i_1000_][i_1010_ - i_1001_]) {
		    if ((((Class166_Sub3) this).aClass182ArrayArray9975
			 [i_1009_][i_1010_])
			!= null) {
			Class182 class182
			    = (((Class166_Sub3) this).aClass182ArrayArray9975
			       [i_1009_][i_1010_]);
			if (((Class182) class182).aShort2149 != -1
			    && (((Class182) class182).aByte2150 & 0x2) == 0
			    && ((Class182) class182).anInt2151 == -1) {
			    int i_1011_ = (((Class166_Sub3) this)
					       .aClass103_Sub2_9962.method15368
					   (((Class182) class182).aShort2149
					    & 0xffff));
			    class155.method3380
				(true, true, false,
				 (float) (i_1008_ - i_1006_),
				 (float) (i_1008_ - i_1006_), (float) i_1008_,
				 (float) (i_1007_ + i_1006_), (float) i_1007_,
				 (float) (i_1007_ + i_1006_), 100.0F, 100.0F,
				 100.0F,
				 (float) Class639.method13606(i_1011_,
							      ((((Class182)
								 class182)
								.aShort2147)
							       & 0xffff),
							      -1247373019),
				 (float) Class639.method13606(i_1011_,
							      ((((Class182)
								 class182)
								.aShort2152)
							       & 0xffff),
							      517949730),
				 (float) Class639.method13606(i_1011_,
							      ((((Class182)
								 class182)
								.aShort2148)
							       & 0xffff),
							      971794506));
			    class155.method3380
				(true, true, false, (float) i_1008_,
				 (float) i_1008_, (float) (i_1008_ - i_1006_),
				 (float) i_1007_, (float) (i_1007_ + i_1006_),
				 (float) i_1007_, 100.0F, 100.0F, 100.0F,
				 (float) Class639.method13606(i_1011_,
							      ((((Class182)
								 class182)
								.aShort2146)
							       & 0xffff),
							      1283491923),
				 (float) Class639.method13606(i_1011_,
							      ((((Class182)
								 class182)
								.aShort2148)
							       & 0xffff),
							      1833783996),
				 (float) Class639.method13606(i_1011_,
							      ((((Class182)
								 class182)
								.aShort2152)
							       & 0xffff),
							      -1120866182));
			} else if (((Class182) class182).anInt2151 == -1) {
			    class155.method3380
				(true, true, false,
				 (float) (i_1008_ - i_1006_),
				 (float) (i_1008_ - i_1006_), (float) i_1008_,
				 (float) (i_1007_ + i_1006_), (float) i_1007_,
				 (float) (i_1007_ + i_1006_), 100.0F, 100.0F,
				 100.0F,
				 (float) (((Class182) class182).aShort2147
					  & 0xffff),
				 (float) (((Class182) class182).aShort2152
					  & 0xffff),
				 (float) (((Class182) class182).aShort2148
					  & 0xffff));
			    class155.method3380
				(true, true, false, (float) i_1008_,
				 (float) i_1008_, (float) (i_1008_ - i_1006_),
				 (float) i_1007_, (float) (i_1007_ + i_1006_),
				 (float) i_1007_, 100.0F, 100.0F, 100.0F,
				 (float) (((Class182) class182).aShort2146
					  & 0xffff),
				 (float) (((Class182) class182).aShort2148
					  & 0xffff),
				 (float) (((Class182) class182).aShort2152
					  & 0xffff));
			} else {
			    int i_1012_ = ((Class182) class182).anInt2151;
			    class155.method3380(true, true, false,
						(float) (i_1008_ - i_1006_),
						(float) (i_1008_ - i_1006_),
						(float) i_1008_,
						(float) (i_1007_ + i_1006_),
						(float) i_1007_,
						(float) (i_1007_ + i_1006_),
						100.0F, 100.0F, 100.0F,
						(float) i_1012_,
						(float) i_1012_,
						(float) i_1012_);
			    class155.method3380(true, true, false,
						(float) i_1008_,
						(float) i_1008_,
						(float) (i_1008_ - i_1006_),
						(float) i_1007_,
						(float) (i_1007_ + i_1006_),
						(float) i_1007_, 100.0F,
						100.0F, 100.0F,
						(float) i_1012_,
						(float) i_1012_,
						(float) i_1012_);
			}
		    } else if ((((Class166_Sub3) this).aClass205ArrayArray9970
				[i_1009_][i_1010_])
			       != null) {
			Class205 class205
			    = (((Class166_Sub3) this).aClass205ArrayArray9970
			       [i_1009_][i_1010_]);
			for (int i_1013_ = 0;
			     i_1013_ < ((Class205) class205).aShort2431;
			     i_1013_++) {
			    fs[i_1013_]
				= (float) (i_1007_
					   + ((((Class205) class205)
					       .aShortArray2433[i_1013_])
					      * i_1006_
					      / (anInt2053 * 2039042417)));
			    fs_1004_[i_1013_]
				= (float) (i_1008_
					   - ((((Class205) class205)
					       .aShortArray2438[i_1013_])
					      * i_1006_
					      / (anInt2053 * 2039042417)));
			}
			for (int i_1014_ = 0;
			     i_1014_ < ((Class205) class205).aShort2441;
			     i_1014_++) {
			    short i_1015_ = (((Class205) class205)
					     .aShortArray2437[i_1014_]);
			    short i_1016_ = (((Class205) class205)
					     .aShortArray2430[i_1014_]);
			    short i_1017_ = (((Class205) class205)
					     .aShortArray2443[i_1014_]);
			    float f = fs[i_1015_];
			    float f_1018_ = fs[i_1016_];
			    float f_1019_ = fs[i_1017_];
			    float f_1020_ = fs_1004_[i_1015_];
			    float f_1021_ = fs_1004_[i_1016_];
			    float f_1022_ = fs_1004_[i_1017_];
			    if (((Class205) class205).anIntArray2435 != null
				&& (((Class205) class205).anIntArray2435
				    [i_1014_]) != -1) {
				int i_1023_ = (((Class205) class205)
					       .anIntArray2435[i_1014_]);
				class155.method3380
				    (true, true, false, f_1020_, f_1021_,
				     f_1022_, f, f_1018_, f_1019_, 100.0F,
				     100.0F, 100.0F,
				     (float) (Class639.method13606
					      (i_1023_,
					       (((Class205) class205)
						.aShortArray2436[i_1015_]),
					       -1659734439)),
				     (float) (Class639.method13606
					      (i_1023_,
					       (((Class205) class205)
						.aShortArray2436[i_1016_]),
					       -1321842881)),
				     (float) (Class639.method13606
					      (i_1023_,
					       (((Class205) class205)
						.aShortArray2436[i_1017_]),
					       434147919)));
			    } else if ((((Class205) class205).aShortArray2440
					!= null)
				       && (((Class205) class205)
					   .aShortArray2440[i_1014_]) != -1) {
				int i_1024_
				    = (((Class166_Sub3) this)
					   .aClass103_Sub2_9962.method15368
				       ((((Class205) class205).aShortArray2440
					 [i_1014_]) & 0xffff));
				class155.method3380
				    (true, true, false, f_1020_, f_1021_,
				     f_1022_, f, f_1018_, f_1019_, 100.0F,
				     100.0F, 100.0F,
				     (float) (Class639.method13606
					      (i_1024_,
					       (((Class205) class205)
						.aShortArray2436[i_1015_]),
					       -1583820756)),
				     (float) (Class639.method13606
					      (i_1024_,
					       (((Class205) class205)
						.aShortArray2436[i_1016_]),
					       -1410553999)),
				     (float) (Class639.method13606
					      (i_1024_,
					       (((Class205) class205)
						.aShortArray2436[i_1017_]),
					       1442590069)));
			    } else {
				int i_1025_ = (((Class205) class205)
					       .anIntArray2442[i_1014_]);
				class155.method3380
				    (true, true, false, f_1020_, f_1021_,
				     f_1022_, f, f_1018_, f_1019_, 100.0F,
				     100.0F, 100.0F,
				     (float) (Class639.method13606
					      (i_1025_,
					       (((Class205) class205)
						.aShortArray2436[i_1015_]),
					       -1883746936)),
				     (float) (Class639.method13606
					      (i_1025_,
					       (((Class205) class205)
						.aShortArray2436[i_1016_]),
					       657685962)),
				     (float) (Class639.method13606
					      (i_1025_,
					       (((Class205) class205)
						.aShortArray2436[i_1017_]),
					       -67367515)));
			    }
			}
		    }
		}
		i_1008_ -= i_1006_;
	    }
	    i_1008_ = i_998_ + i_1005_;
	    i_1007_ += i_1006_;
	}
	((Class155) class155).aBool1721 = true;
	((Class166_Sub3) this).aClass103_Sub2_9962.method2308(bool);
    }
    
    public void method3564() {
	((Class166_Sub3) this).aByteArrayArray9990 = null;
	((Class166_Sub3) this).aByteArrayArray9991 = null;
    }
    
    void method16260(int i, int i_1026_, boolean bool, Class189 class189,
		     Class155 class155, float[] fs, float[] fs_1027_,
		     float[] fs_1028_, float[] fs_1029_, float[] fs_1030_,
		     int i_1031_) {
	Class201 class201
	    = ((Class166_Sub3) this).aClass201ArrayArray9967[i][i_1026_];
	if (class201 != null) {
	    if ((((Class201) class201).aByte2409 & 0x2) == 0) {
		if (i_1031_ != 0) {
		    if ((((Class201) class201).aByte2409 & 0x4) != 0) {
			if ((i_1031_ & 0x1) != 0)
			    return;
		    } else if ((i_1031_ & 0x2) != 0)
			return;
		}
		int i_1032_ = i * (anInt2053 * 2039042417);
		int i_1033_ = i_1032_ + anInt2053 * 2039042417;
		int i_1034_ = i_1026_ * (anInt2053 * 2039042417);
		int i_1035_ = i_1034_ + anInt2053 * 2039042417;
		float f = 0.0F;
		float f_1036_ = 0.0F;
		float f_1037_ = 0.0F;
		float f_1038_ = 0.0F;
		float f_1039_;
		float f_1040_;
		float f_1041_;
		float f_1042_;
		float f_1043_;
		float f_1044_;
		float f_1045_;
		float f_1046_;
		float f_1047_;
		float f_1048_;
		float f_1049_;
		float f_1050_;
		float f_1051_;
		float f_1052_;
		float f_1053_;
		float f_1054_;
		if ((((Class201) class201).aByte2409 & 0x1) != 0 && !bool) {
		    int i_1055_ = anIntArrayArray2051[i][i_1026_];
		    float f_1056_
			= ((Class166_Sub3) this).aFloat9980 * (float) i_1055_;
		    float f_1057_
			= ((Class166_Sub3) this).aFloat9989 * (float) i_1055_;
		    float f_1058_ = (((Class166_Sub3) this).aFloat9988
				     + ((((Class166_Sub3) this).aFloat9976
					 * (float) i_1032_)
					+ f_1056_
					+ (((Class166_Sub3) this).aFloat9984
					   * (float) i_1034_)));
		    f_1039_ = (((Class166_Sub3) this).aFloat9974
			       + ((((Class166_Sub3) this).aFloat9977
				   * (float) i_1032_)
				  + f_1057_
				  + (((Class166_Sub3) this).aFloat9985
				     * (float) i_1034_)));
		    if (f_1058_ < -f_1039_)
			return;
		    float f_1059_ = (((Class166_Sub3) this).aFloat9988
				     + ((((Class166_Sub3) this).aFloat9976
					 * (float) i_1033_)
					+ f_1056_
					+ (((Class166_Sub3) this).aFloat9984
					   * (float) i_1034_)));
		    f_1040_ = (((Class166_Sub3) this).aFloat9974
			       + ((((Class166_Sub3) this).aFloat9977
				   * (float) i_1033_)
				  + f_1057_
				  + (((Class166_Sub3) this).aFloat9985
				     * (float) i_1034_)));
		    if (f_1059_ < -f_1040_)
			return;
		    float f_1060_ = (((Class166_Sub3) this).aFloat9988
				     + ((((Class166_Sub3) this).aFloat9976
					 * (float) i_1033_)
					+ f_1056_
					+ (((Class166_Sub3) this).aFloat9984
					   * (float) i_1035_)));
		    f_1041_ = (((Class166_Sub3) this).aFloat9974
			       + ((((Class166_Sub3) this).aFloat9977
				   * (float) i_1033_)
				  + f_1057_
				  + (((Class166_Sub3) this).aFloat9985
				     * (float) i_1035_)));
		    if (f_1060_ < -f_1041_)
			return;
		    float f_1061_ = (((Class166_Sub3) this).aFloat9988
				     + ((((Class166_Sub3) this).aFloat9976
					 * (float) i_1032_)
					+ f_1056_
					+ (((Class166_Sub3) this).aFloat9984
					   * (float) i_1035_)));
		    f_1042_ = (((Class166_Sub3) this).aFloat9974
			       + ((((Class166_Sub3) this).aFloat9977
				   * (float) i_1032_)
				  + f_1057_
				  + (((Class166_Sub3) this).aFloat9985
				     * (float) i_1035_)));
		    if (f_1061_ < -f_1042_)
			return;
		    f_1043_ = (((Class155) class155).aFloat1720
			       + (((Class155) class155).aFloat1732 * f_1058_
				  / f_1039_));
		    f_1044_ = (((Class155) class155).aFloat1720
			       + (((Class155) class155).aFloat1732 * f_1059_
				  / f_1040_));
		    f_1045_ = (((Class155) class155).aFloat1720
			       + (((Class155) class155).aFloat1732 * f_1060_
				  / f_1041_));
		    f_1046_ = (((Class155) class155).aFloat1720
			       + (((Class155) class155).aFloat1732 * f_1061_
				  / f_1042_));
		    if (((Class189) class189).aBool2209) {
			float f_1062_
			    = f_1058_ - ((Class189) class189).aFloat2213;
			if (f_1062_ > 0.0F) {
			    f = f_1062_ / ((Class189) class189).aFloat2214;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_1062_ = f_1059_ - ((Class189) class189).aFloat2213;
			if (f_1062_ > 0.0F) {
			    f_1036_
				= f_1062_ / ((Class189) class189).aFloat2214;
			    if (f_1036_ > 1.0F)
				f_1036_ = 1.0F;
			}
			f_1062_ = f_1060_ - ((Class189) class189).aFloat2213;
			if (f_1062_ > 0.0F) {
			    f_1037_
				= f_1062_ / ((Class189) class189).aFloat2214;
			    if (f_1037_ > 1.0F)
				f_1037_ = 1.0F;
			}
			f_1062_ = f_1061_ - ((Class189) class189).aFloat2213;
			if (f_1062_ > 0.0F) {
			    f_1038_
				= f_1062_ / ((Class189) class189).aFloat2214;
			    if (f_1038_ > 1.0F)
				f_1038_ = 1.0F;
			}
		    }
		    float f_1063_
			= ((Class166_Sub3) this).aFloat9978 * (float) i_1055_;
		    float f_1064_
			= ((Class166_Sub3) this).aFloat9965 * (float) i_1055_;
		    float f_1065_ = (((Class166_Sub3) this).aFloat9986
				     + ((((Class166_Sub3) this).aFloat9981
					 * (float) i_1032_)
					+ f_1063_
					+ (((Class166_Sub3) this).aFloat9982
					   * (float) i_1034_)));
		    f_1047_ = (((Class155) class155).aFloat1727
			       + (((Class155) class155).aFloat1728 * f_1065_
				  / f_1039_));
		    float f_1066_ = (((Class166_Sub3) this).aFloat9987
				     + ((((Class166_Sub3) this).aFloat9973
					 * (float) i_1032_)
					+ f_1064_
					+ (((Class166_Sub3) this).aFloat9983
					   * (float) i_1034_)));
		    f_1048_ = (((Class155) class155).aFloat1731
			       + (((Class155) class155).aFloat1729 * f_1066_
				  / f_1039_));
		    float f_1067_ = (((Class166_Sub3) this).aFloat9986
				     + ((((Class166_Sub3) this).aFloat9981
					 * (float) i_1033_)
					+ f_1063_
					+ (((Class166_Sub3) this).aFloat9982
					   * (float) i_1034_)));
		    f_1049_ = (((Class155) class155).aFloat1727
			       + (((Class155) class155).aFloat1728 * f_1067_
				  / f_1040_));
		    float f_1068_ = (((Class166_Sub3) this).aFloat9987
				     + ((((Class166_Sub3) this).aFloat9973
					 * (float) i_1033_)
					+ f_1064_
					+ (((Class166_Sub3) this).aFloat9983
					   * (float) i_1034_)));
		    f_1050_ = (((Class155) class155).aFloat1731
			       + (((Class155) class155).aFloat1729 * f_1068_
				  / f_1040_));
		    float f_1069_ = (((Class166_Sub3) this).aFloat9986
				     + ((((Class166_Sub3) this).aFloat9981
					 * (float) i_1033_)
					+ f_1063_
					+ (((Class166_Sub3) this).aFloat9982
					   * (float) i_1035_)));
		    f_1051_ = (((Class155) class155).aFloat1727
			       + (((Class155) class155).aFloat1728 * f_1069_
				  / f_1041_));
		    float f_1070_ = (((Class166_Sub3) this).aFloat9987
				     + ((((Class166_Sub3) this).aFloat9973
					 * (float) i_1033_)
					+ f_1064_
					+ (((Class166_Sub3) this).aFloat9983
					   * (float) i_1035_)));
		    f_1052_ = (((Class155) class155).aFloat1731
			       + (((Class155) class155).aFloat1729 * f_1070_
				  / f_1041_));
		    float f_1071_ = (((Class166_Sub3) this).aFloat9986
				     + ((((Class166_Sub3) this).aFloat9981
					 * (float) i_1032_)
					+ f_1063_
					+ (((Class166_Sub3) this).aFloat9982
					   * (float) i_1035_)));
		    f_1053_ = (((Class155) class155).aFloat1727
			       + (((Class155) class155).aFloat1728 * f_1071_
				  / f_1042_));
		    float f_1072_ = (((Class166_Sub3) this).aFloat9987
				     + ((((Class166_Sub3) this).aFloat9973
					 * (float) i_1032_)
					+ f_1064_
					+ (((Class166_Sub3) this).aFloat9983
					   * (float) i_1035_)));
		    f_1054_ = (((Class155) class155).aFloat1731
			       + (((Class155) class155).aFloat1729 * f_1072_
				  / f_1042_));
		} else {
		    int i_1073_ = anIntArrayArray2051[i][i_1026_];
		    int i_1074_ = anIntArrayArray2051[i + 1][i_1026_];
		    int i_1075_ = anIntArrayArray2051[i + 1][i_1026_ + 1];
		    int i_1076_ = anIntArrayArray2051[i][i_1026_ + 1];
		    float f_1077_ = (((Class166_Sub3) this).aFloat9988
				     + ((((Class166_Sub3) this).aFloat9976
					 * (float) i_1032_)
					+ (((Class166_Sub3) this).aFloat9980
					   * (float) i_1073_)
					+ (((Class166_Sub3) this).aFloat9984
					   * (float) i_1034_)));
		    f_1039_ = (((Class166_Sub3) this).aFloat9974
			       + ((((Class166_Sub3) this).aFloat9977
				   * (float) i_1032_)
				  + (((Class166_Sub3) this).aFloat9989
				     * (float) i_1073_)
				  + (((Class166_Sub3) this).aFloat9985
				     * (float) i_1034_)));
		    if (f_1077_ < -f_1039_)
			return;
		    float f_1078_ = (((Class166_Sub3) this).aFloat9988
				     + ((((Class166_Sub3) this).aFloat9976
					 * (float) i_1033_)
					+ (((Class166_Sub3) this).aFloat9980
					   * (float) i_1074_)
					+ (((Class166_Sub3) this).aFloat9984
					   * (float) i_1034_)));
		    f_1040_ = (((Class166_Sub3) this).aFloat9974
			       + ((((Class166_Sub3) this).aFloat9977
				   * (float) i_1033_)
				  + (((Class166_Sub3) this).aFloat9989
				     * (float) i_1074_)
				  + (((Class166_Sub3) this).aFloat9985
				     * (float) i_1034_)));
		    if (f_1078_ < -f_1040_)
			return;
		    float f_1079_ = (((Class166_Sub3) this).aFloat9988
				     + ((((Class166_Sub3) this).aFloat9976
					 * (float) i_1033_)
					+ (((Class166_Sub3) this).aFloat9980
					   * (float) i_1075_)
					+ (((Class166_Sub3) this).aFloat9984
					   * (float) i_1035_)));
		    f_1041_ = (((Class166_Sub3) this).aFloat9974
			       + ((((Class166_Sub3) this).aFloat9977
				   * (float) i_1033_)
				  + (((Class166_Sub3) this).aFloat9989
				     * (float) i_1075_)
				  + (((Class166_Sub3) this).aFloat9985
				     * (float) i_1035_)));
		    if (f_1079_ < -f_1041_)
			return;
		    float f_1080_ = (((Class166_Sub3) this).aFloat9988
				     + ((((Class166_Sub3) this).aFloat9976
					 * (float) i_1032_)
					+ (((Class166_Sub3) this).aFloat9980
					   * (float) i_1076_)
					+ (((Class166_Sub3) this).aFloat9984
					   * (float) i_1035_)));
		    f_1042_ = (((Class166_Sub3) this).aFloat9974
			       + ((((Class166_Sub3) this).aFloat9977
				   * (float) i_1032_)
				  + (((Class166_Sub3) this).aFloat9989
				     * (float) i_1076_)
				  + (((Class166_Sub3) this).aFloat9985
				     * (float) i_1035_)));
		    if (f_1080_ < -f_1042_)
			return;
		    f_1043_ = (((Class155) class155).aFloat1720
			       + (((Class155) class155).aFloat1732 * f_1077_
				  / f_1039_));
		    f_1044_ = (((Class155) class155).aFloat1720
			       + (((Class155) class155).aFloat1732 * f_1078_
				  / f_1040_));
		    f_1045_ = (((Class155) class155).aFloat1720
			       + (((Class155) class155).aFloat1732 * f_1079_
				  / f_1041_));
		    f_1046_ = (((Class155) class155).aFloat1720
			       + (((Class155) class155).aFloat1732 * f_1080_
				  / f_1042_));
		    if (bool) {
			float f_1081_
			    = f_1077_ - ((Class189) class189).aFloat2213;
			if (f_1081_ > 0.0F) {
			    f_1081_ /= ((Class189) class189).aFloat2214;
			    if (f_1081_ > 1.0F)
				f_1081_ = 1.0F;
			    f = f_1081_;
			    int i_1082_ = (int) ((float) (((Class201) class201)
							  .aShort2403)
						 * f_1081_);
			    if (i_1082_ > 0)
				i_1073_ -= i_1082_;
			}
			f_1081_ = f_1078_ - ((Class189) class189).aFloat2213;
			if (f_1081_ > 0.0F) {
			    f_1081_ /= ((Class189) class189).aFloat2214;
			    if (f_1081_ > 1.0F)
				f_1081_ = 1.0F;
			    f_1036_ = f_1081_;
			    int i_1083_ = (int) ((float) (((Class201) class201)
							  .aShort2407)
						 * f_1081_);
			    if (i_1083_ > 0)
				i_1074_ -= i_1083_;
			}
			f_1081_ = f_1079_ - ((Class189) class189).aFloat2213;
			if (f_1081_ > 0.0F) {
			    f_1081_ /= ((Class189) class189).aFloat2214;
			    if (f_1081_ > 1.0F)
				f_1081_ = 1.0F;
			    f_1037_ = f_1081_;
			    int i_1084_ = (int) ((float) (((Class201) class201)
							  .aShort2406)
						 * f_1081_);
			    if (i_1084_ > 0)
				i_1075_ -= i_1084_;
			}
			f_1081_ = f_1080_ - ((Class189) class189).aFloat2213;
			if (f_1081_ > 0.0F) {
			    f_1081_ /= ((Class189) class189).aFloat2214;
			    if (f_1081_ > 1.0F)
				f_1081_ = 1.0F;
			    f_1038_ = f_1081_;
			    int i_1085_ = (int) ((float) (((Class201) class201)
							  .aShort2402)
						 * f_1081_);
			    if (i_1085_ > 0)
				i_1076_ -= i_1085_;
			}
		    } else if (((Class189) class189).aBool2209) {
			float f_1086_
			    = f_1077_ - ((Class189) class189).aFloat2213;
			if (f_1086_ > 0.0F) {
			    f = f_1086_ / ((Class189) class189).aFloat2214;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_1086_ = f_1078_ - ((Class189) class189).aFloat2213;
			if (f_1086_ > 0.0F) {
			    f_1036_
				= f_1086_ / ((Class189) class189).aFloat2214;
			    if (f_1036_ > 1.0F)
				f_1036_ = 1.0F;
			}
			f_1086_ = f_1079_ - ((Class189) class189).aFloat2213;
			if (f_1086_ > 0.0F) {
			    f_1037_
				= f_1086_ / ((Class189) class189).aFloat2214;
			    if (f_1037_ > 1.0F)
				f_1037_ = 1.0F;
			}
			f_1086_ = f_1080_ - ((Class189) class189).aFloat2213;
			if (f_1086_ > 0.0F) {
			    f_1038_
				= f_1086_ / ((Class189) class189).aFloat2214;
			    if (f_1038_ > 1.0F)
				f_1038_ = 1.0F;
			}
		    }
		    float f_1087_ = (((Class166_Sub3) this).aFloat9986
				     + ((((Class166_Sub3) this).aFloat9981
					 * (float) i_1032_)
					+ (((Class166_Sub3) this).aFloat9978
					   * (float) i_1073_)
					+ (((Class166_Sub3) this).aFloat9982
					   * (float) i_1034_)));
		    f_1047_ = (((Class155) class155).aFloat1727
			       + (((Class155) class155).aFloat1728 * f_1087_
				  / f_1039_));
		    float f_1088_ = (((Class166_Sub3) this).aFloat9987
				     + ((((Class166_Sub3) this).aFloat9973
					 * (float) i_1032_)
					+ (((Class166_Sub3) this).aFloat9965
					   * (float) i_1073_)
					+ (((Class166_Sub3) this).aFloat9983
					   * (float) i_1034_)));
		    f_1048_ = (((Class155) class155).aFloat1731
			       + (((Class155) class155).aFloat1729 * f_1088_
				  / f_1039_));
		    float f_1089_ = (((Class166_Sub3) this).aFloat9986
				     + ((((Class166_Sub3) this).aFloat9981
					 * (float) i_1033_)
					+ (((Class166_Sub3) this).aFloat9978
					   * (float) i_1074_)
					+ (((Class166_Sub3) this).aFloat9982
					   * (float) i_1034_)));
		    f_1049_ = (((Class155) class155).aFloat1727
			       + (((Class155) class155).aFloat1728 * f_1089_
				  / f_1040_));
		    float f_1090_ = (((Class166_Sub3) this).aFloat9987
				     + ((((Class166_Sub3) this).aFloat9973
					 * (float) i_1033_)
					+ (((Class166_Sub3) this).aFloat9965
					   * (float) i_1074_)
					+ (((Class166_Sub3) this).aFloat9983
					   * (float) i_1034_)));
		    f_1050_ = (((Class155) class155).aFloat1731
			       + (((Class155) class155).aFloat1729 * f_1090_
				  / f_1040_));
		    float f_1091_ = (((Class166_Sub3) this).aFloat9986
				     + ((((Class166_Sub3) this).aFloat9981
					 * (float) i_1033_)
					+ (((Class166_Sub3) this).aFloat9978
					   * (float) i_1075_)
					+ (((Class166_Sub3) this).aFloat9982
					   * (float) i_1035_)));
		    f_1051_ = (((Class155) class155).aFloat1727
			       + (((Class155) class155).aFloat1728 * f_1091_
				  / f_1041_));
		    float f_1092_ = (((Class166_Sub3) this).aFloat9987
				     + ((((Class166_Sub3) this).aFloat9973
					 * (float) i_1033_)
					+ (((Class166_Sub3) this).aFloat9965
					   * (float) i_1075_)
					+ (((Class166_Sub3) this).aFloat9983
					   * (float) i_1035_)));
		    f_1052_ = (((Class155) class155).aFloat1731
			       + (((Class155) class155).aFloat1729 * f_1092_
				  / f_1041_));
		    float f_1093_ = (((Class166_Sub3) this).aFloat9986
				     + ((((Class166_Sub3) this).aFloat9981
					 * (float) i_1032_)
					+ (((Class166_Sub3) this).aFloat9978
					   * (float) i_1076_)
					+ (((Class166_Sub3) this).aFloat9982
					   * (float) i_1035_)));
		    f_1053_ = (((Class155) class155).aFloat1727
			       + (((Class155) class155).aFloat1728 * f_1093_
				  / f_1042_));
		    float f_1094_ = (((Class166_Sub3) this).aFloat9987
				     + ((((Class166_Sub3) this).aFloat9973
					 * (float) i_1032_)
					+ (((Class166_Sub3) this).aFloat9965
					   * (float) i_1076_)
					+ (((Class166_Sub3) this).aFloat9983
					   * (float) i_1035_)));
		    f_1054_ = (((Class155) class155).aFloat1731
			       + (((Class155) class155).aFloat1729 * f_1094_
				  / f_1042_));
		}
		Class101 class101 = null;
		int i_1095_ = -1;
		if (((Class201) class201).aShort2411 != -1) {
		    class101 = (((Class166_Sub3) this).aClass103_Sub2_9962
				    .aClass107_1458.method2680
				(((Class201) class201).aShort2411 & 0xffff,
				 -893891554));
		    i_1095_ = class101.anInt1403 * 218388063;
		}
		boolean bool_1096_
		    = class101 != null && method16256(class101.aByte1427);
		float f_1097_ = f_1036_ + f_1037_ + f_1038_;
		if (((f_1051_ - f_1053_) * (f_1050_ - f_1054_)
		     - (f_1052_ - f_1054_) * (f_1049_ - f_1053_))
		    > 0.0F) {
		    ((Class155) class155).aBool1748
			= (f_1051_ < 0.0F || f_1053_ < 0.0F || f_1049_ < 0.0F
			   || f_1051_ > (float) ((Class155) class155).anInt1733
			   || f_1053_ > (float) ((Class155) class155).anInt1733
			   || (f_1049_
			       > (float) ((Class155) class155).anInt1733));
		    if (f_1097_ < 3.0F) {
			if (f_1097_ > 0.0F) {
			    if (i_1095_ >= 0) {
				int i_1098_ = -16777216;
				if (bool_1096_)
				    i_1098_ = -1694498816;
				class155.method3384
				    (true, true, false, f_1052_, f_1054_,
				     f_1050_, f_1051_, f_1053_, f_1049_,
				     f_1045_, f_1046_, f_1044_, f_1041_,
				     f_1042_, f_1040_, 1.0F, 0.0F, 1.0F, 1.0F,
				     1.0F, 0.0F,
				     i_1098_ | (((Class201) class201).anInt2404
						& 0xffffff),
				     i_1098_ | (((Class201) class201).anInt2405
						& 0xffffff),
				     i_1098_ | (((Class201) class201).anInt2401
						& 0xffffff),
				     (((Class189) class189).anInt2215
				      * -338296791),
				     f_1037_ * 255.0F, f_1038_ * 255.0F,
				     f_1036_ * 255.0F,
				     ((Class201) class201).aShort2411 & 0xffff,
				     i_1095_);
			    } else {
				if (bool_1096_)
				    ((Class155) class155).anInt1723 = 100;
				class155.method3385
				    (true, true, false, f_1052_, f_1054_,
				     f_1050_, f_1051_, f_1053_, f_1049_,
				     f_1045_, f_1046_, f_1044_,
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2404,
				       ((int) (f_1037_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       556294928)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2405,
				       ((int) (f_1038_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       1517929171)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2401,
				       ((int) (f_1036_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       -1280261657)));
				((Class155) class155).anInt1723 = 0;
			    }
			} else if (i_1095_ >= 0) {
			    int i_1099_ = -16777216;
			    if (bool_1096_)
				i_1099_ = -1694498816;
			    class155.method3384
				(true, true, false, f_1052_, f_1054_, f_1050_,
				 f_1051_, f_1053_, f_1049_, f_1045_, f_1046_,
				 f_1044_, f_1041_, f_1042_, f_1040_, 1.0F,
				 0.0F, 1.0F, 1.0F, 1.0F, 0.0F,
				 i_1099_ | (((Class201) class201).anInt2404
					    & 0xffffff),
				 i_1099_ | (((Class201) class201).anInt2405
					    & 0xffffff),
				 i_1099_ | (((Class201) class201).anInt2401
					    & 0xffffff),
				 0, 0.0F, 0.0F, 0.0F,
				 ((Class201) class201).aShort2411 & 0xffff,
				 i_1095_);
			} else {
			    if (bool_1096_)
				((Class155) class155).anInt1723 = 100;
			    class155.method3385
				(true, true, false, f_1052_, f_1054_, f_1050_,
				 f_1051_, f_1053_, f_1049_, f_1045_, f_1046_,
				 f_1044_, ((Class201) class201).anInt2404,
				 ((Class201) class201).anInt2405,
				 ((Class201) class201).anInt2401);
			    ((Class155) class155).anInt1723 = 0;
			}
		    } else
			class155.method3377(true, true, false, f_1052_,
					    f_1054_, f_1050_, f_1051_, f_1053_,
					    f_1049_, f_1045_, f_1046_, f_1044_,
					    (((Class189) class189).anInt2215
					     * -338296791));
		}
		f_1097_ = f + f_1036_ + f_1038_;
		if (((f_1047_ - f_1049_) * (f_1054_ - f_1050_)
		     - (f_1048_ - f_1050_) * (f_1053_ - f_1049_))
		    > 0.0F) {
		    ((Class155) class155).aBool1748
			= (f_1047_ < 0.0F || f_1049_ < 0.0F || f_1053_ < 0.0F
			   || f_1047_ > (float) ((Class155) class155).anInt1733
			   || f_1049_ > (float) ((Class155) class155).anInt1733
			   || (f_1053_
			       > (float) ((Class155) class155).anInt1733));
		    if (f_1097_ < 3.0F) {
			if (bool_1096_)
			    ((Class155) class155).anInt1723 = -1694498816;
			if (f_1097_ > 0.0F) {
			    if (i_1095_ >= 0) {
				int i_1100_ = -16777216;
				if (bool_1096_)
				    i_1100_ = -1694498816;
				class155.method3384
				    (true, true, false, f_1048_, f_1050_,
				     f_1054_, f_1047_, f_1049_, f_1053_,
				     f_1043_, f_1044_, f_1046_, f_1039_,
				     f_1040_, f_1042_, 0.0F, 1.0F, 1.0F, 0.0F,
				     0.0F, 1.0F,
				     i_1100_ | (((Class201) class201).anInt2410
						& 0xffffff),
				     i_1100_ | (((Class201) class201).anInt2401
						& 0xffffff),
				     i_1100_ | (((Class201) class201).anInt2405
						& 0xffffff),
				     (((Class189) class189).anInt2215
				      * -338296791),
				     f * 255.0F, f_1036_ * 255.0F,
				     f_1038_ * 255.0F,
				     ((Class201) class201).aShort2411 & 0xffff,
				     i_1095_);
			    } else {
				if (bool_1096_)
				    ((Class155) class155).anInt1723 = 100;
				class155.method3385
				    (true, true, false, f_1048_, f_1050_,
				     f_1054_, f_1047_, f_1049_, f_1053_,
				     f_1043_, f_1044_, f_1046_,
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2410,
				       ((int) (f * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       -415436021)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2401,
				       ((int) (f_1036_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       1382005761)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2405,
				       ((int) (f_1038_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       -549040311)));
				((Class155) class155).anInt1723 = 0;
			    }
			} else if (i_1095_ >= 0) {
			    int i_1101_ = -16777216;
			    if (bool_1096_)
				i_1101_ = -1694498816;
			    class155.method3384
				(true, true, false, f_1048_, f_1050_, f_1054_,
				 f_1047_, f_1049_, f_1053_, f_1043_, f_1044_,
				 f_1046_, f_1039_, f_1040_, f_1042_, 0.0F,
				 1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
				 i_1101_ | (((Class201) class201).anInt2410
					    & 0xffffff),
				 i_1101_ | (((Class201) class201).anInt2401
					    & 0xffffff),
				 i_1101_ | (((Class201) class201).anInt2405
					    & 0xffffff),
				 0, 0.0F, 0.0F, 0.0F,
				 ((Class201) class201).aShort2411 & 0xffff,
				 i_1095_);
			} else {
			    if (bool_1096_)
				((Class155) class155).anInt1723 = 100;
			    class155.method3385
				(true, true, false, f_1048_, f_1050_, f_1054_,
				 f_1047_, f_1049_, f_1053_, f_1043_, f_1044_,
				 f_1046_, ((Class201) class201).anInt2410,
				 ((Class201) class201).anInt2401,
				 ((Class201) class201).anInt2405);
			    ((Class155) class155).anInt1723 = 0;
			}
		    } else
			class155.method3377(true, true, false, f_1048_,
					    f_1050_, f_1054_, f_1047_, f_1049_,
					    f_1053_, f_1043_, f_1044_, f_1046_,
					    (((Class189) class189).anInt2215
					     * -338296791));
		}
	    }
	} else {
	    Class183 class183
		= ((Class166_Sub3) this).aClass183ArrayArray9969[i][i_1026_];
	    if (class183 != null) {
		if (i_1031_ != 0) {
		    if ((((Class183) class183).aByte2157 & 0x4) != 0) {
			if ((i_1031_ & 0x1) != 0)
			    return;
		    } else if ((i_1031_ & 0x2) != 0)
			return;
		}
		for (int i_1102_ = 0;
		     i_1102_ < ((Class183) class183).aShort2154; i_1102_++) {
		    int i_1103_
			= (((Class183) class183).aShortArray2156[i_1102_]
			   + (i << anInt2054 * -122333825));
		    int i_1104_
			= ((Class183) class183).aShortArray2153[i_1102_];
		    int i_1105_
			= (((Class183) class183).aShortArray2158[i_1102_]
			   + (i_1026_ << anInt2054 * -122333825));
		    float f = (((Class166_Sub3) this).aFloat9988
			       + ((((Class166_Sub3) this).aFloat9976
				   * (float) i_1103_)
				  + (((Class166_Sub3) this).aFloat9980
				     * (float) i_1104_)
				  + (((Class166_Sub3) this).aFloat9984
				     * (float) i_1105_)));
		    float f_1106_ = (((Class166_Sub3) this).aFloat9974
				     + ((((Class166_Sub3) this).aFloat9977
					 * (float) i_1103_)
					+ (((Class166_Sub3) this).aFloat9989
					   * (float) i_1104_)
					+ (((Class166_Sub3) this).aFloat9985
					   * (float) i_1105_)));
		    if (f < -f_1106_)
			return;
		    float f_1107_
			= (((Class155) class155).aFloat1720
			   + ((Class155) class155).aFloat1732 * f / f_1106_);
		    fs_1030_[i_1102_] = 0.0F;
		    if (bool) {
			float f_1108_ = f - ((Class189) class189).aFloat2213;
			if (f_1108_ > 0.0F) {
			    f_1108_ /= ((Class189) class189).aFloat2214;
			    if (f_1108_ > 1.0F)
				f_1108_ = 1.0F;
			    fs_1030_[i_1102_] = f_1108_;
			    int i_1109_
				= (int) ((float) (((Class183) class183)
						  .aShortArray2159[i_1102_])
					 * f_1108_);
			    if (i_1109_ > 0)
				i_1104_ -= i_1109_;
			}
		    } else if (((Class189) class189).aBool2209) {
			float f_1110_ = f - ((Class189) class189).aFloat2213;
			if (f_1110_ > 0.0F) {
			    fs_1030_[i_1102_]
				= f_1110_ / ((Class189) class189).aFloat2214;
			    if (fs_1030_[i_1102_] > 1.0F)
				fs_1030_[i_1102_] = 1.0F;
			}
		    }
		    float f_1111_ = (((Class166_Sub3) this).aFloat9986
				     + ((((Class166_Sub3) this).aFloat9981
					 * (float) i_1103_)
					+ (((Class166_Sub3) this).aFloat9978
					   * (float) i_1104_)
					+ (((Class166_Sub3) this).aFloat9982
					   * (float) i_1105_)));
		    float f_1112_ = (((Class166_Sub3) this).aFloat9987
				     + ((((Class166_Sub3) this).aFloat9973
					 * (float) i_1103_)
					+ (((Class166_Sub3) this).aFloat9965
					   * (float) i_1104_)
					+ (((Class166_Sub3) this).aFloat9983
					   * (float) i_1105_)));
		    fs[i_1102_] = (((Class155) class155).aFloat1727
				   + (((Class155) class155).aFloat1728
				      * f_1111_ / f_1106_));
		    fs_1027_[i_1102_] = (((Class155) class155).aFloat1731
					 + (((Class155) class155).aFloat1729
					    * f_1112_ / f_1106_));
		    fs_1028_[i_1102_] = f_1107_;
		    fs_1029_[i_1102_] = f_1106_;
		}
		if (((Class183) class183).aShortArray2161 != null) {
		    for (int i_1113_ = 0;
			 i_1113_ < ((Class183) class183).aShort2160;
			 i_1113_++) {
			int i_1114_ = i_1113_ * 3;
			int i_1115_ = i_1114_ + 1;
			int i_1116_ = i_1115_ + 1;
			float f = fs[i_1114_];
			float f_1117_ = fs[i_1115_];
			float f_1118_ = fs[i_1116_];
			float f_1119_ = fs_1027_[i_1114_];
			float f_1120_ = fs_1027_[i_1115_];
			float f_1121_ = fs_1027_[i_1116_];
			float f_1122_ = (fs_1030_[i_1114_] + fs_1030_[i_1115_]
					 + fs_1030_[i_1116_]);
			if (((f - f_1117_) * (f_1121_ - f_1120_)
			     - (f_1119_ - f_1120_) * (f_1118_ - f_1117_))
			    > 0.0F) {
			    ((Class155) class155).aBool1748
				= (f < 0.0F || f_1117_ < 0.0F || f_1118_ < 0.0F
				   || f > (float) (((Class155) class155)
						   .anInt1733)
				   || f_1117_ > (float) (((Class155) class155)
							 .anInt1733)
				   || f_1118_ > (float) (((Class155) class155)
							 .anInt1733));
			    Class101 class101 = null;
			    int i_1123_ = -1;
			    if (((Class183) class183).aShortArray2161[i_1113_]
				!= -1) {
				class101
				    = (((Class166_Sub3) this)
					   .aClass103_Sub2_9962.aClass107_1458
					   .method2680
				       ((((Class183) class183).aShortArray2161
					 [i_1113_]) & 0xffff,
					1549357824));
				i_1123_ = class101.anInt1403 * 218388063;
			    }
			    if (f_1122_ < 3.0F) {
				if (f_1122_ > 0.0F) {
				    if (i_1123_ != -1) {
					int i_1124_ = -16777216;
					if (i_1123_ != -1
					    && method16256(class101.aByte1427))
					    i_1124_ = -1694498816;
					class155.method3384
					    (true, true, false, f_1119_,
					     f_1120_, f_1121_, f, f_1117_,
					     f_1118_, fs_1028_[i_1114_],
					     fs_1028_[i_1115_],
					     fs_1028_[i_1116_],
					     fs_1029_[i_1114_],
					     fs_1029_[i_1115_],
					     fs_1029_[i_1116_],
					     ((float) (((Class183) class183)
						       .aShortArray2156
						       [i_1114_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2156
						       [i_1115_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2156
						       [i_1116_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2158
						       [i_1114_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2158
						       [i_1115_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2158
						       [i_1116_])
					      / (float) (anInt2053
							 * 2039042417)),
					     i_1124_ | (((Class183) class183)
							.anIntArray2163
							[i_1114_]) & 0xffffff,
					     i_1124_ | (((Class183) class183)
							.anIntArray2163
							[i_1115_]) & 0xffffff,
					     i_1124_ | (((Class183) class183)
							.anIntArray2163
							[i_1116_]) & 0xffffff,
					     (((Class189) class189).anInt2215
					      * -338296791),
					     fs_1030_[i_1114_] * 255.0F,
					     fs_1030_[i_1115_] * 255.0F,
					     fs_1030_[i_1116_] * 255.0F,
					     ((((Class183) class183)
					       .aShortArray2161[i_1113_])
					      & 0xffff),
					     i_1123_);
				    } else if (((((Class183) class183)
						 .anIntArray2163[i_1114_])
						& 0xffffff)
					       != 0) {
					if (i_1123_ != -1
					    && method16256(class101.aByte1427))
					    ((Class155) class155).anInt1723
						= -1694498816;
					class155.method3385
					    (true, true, false, f_1119_,
					     f_1120_, f_1121_, f, f_1117_,
					     f_1118_, fs_1028_[i_1114_],
					     fs_1028_[i_1115_],
					     fs_1028_[i_1116_],
					     (Class241_Sub18_Sub1.method17140
					      ((((Class183) class183)
						.anIntArray2163[i_1114_]),
					       ((int) (fs_1030_[i_1114_]
						       * 255.0F) << 24
						| (((Class189) class189)
						   .anInt2215) * -338296791),
					       -912131463)),
					     (Class241_Sub18_Sub1.method17140
					      ((((Class183) class183)
						.anIntArray2163[i_1115_]),
					       ((int) (fs_1030_[i_1115_]
						       * 255.0F) << 24
						| (((Class189) class189)
						   .anInt2215) * -338296791),
					       1138768508)),
					     (Class241_Sub18_Sub1.method17140
					      ((((Class183) class183)
						.anIntArray2163[i_1116_]),
					       ((int) (fs_1030_[i_1116_]
						       * 255.0F) << 24
						| (((Class189) class189)
						   .anInt2215) * -338296791),
					       -1155187778)));
					((Class155) class155).anInt1723 = 0;
				    }
				} else if (i_1123_ != -1) {
				    int i_1125_ = -16777216;
				    if (i_1123_ != -1
					&& method16256(class101.aByte1427))
					i_1125_ = -1694498816;
				    class155.method3384
					(true, true, false, f_1119_, f_1120_,
					 f_1121_, f, f_1117_, f_1118_,
					 fs_1028_[i_1114_], fs_1028_[i_1115_],
					 fs_1028_[i_1116_], fs_1029_[i_1114_],
					 fs_1029_[i_1115_], fs_1029_[i_1116_],
					 ((float) (((Class183) class183)
						   .aShortArray2156[i_1114_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2156[i_1115_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2156[i_1116_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2158[i_1114_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2158[i_1115_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2158[i_1116_])
					  / (float) (anInt2053 * 2039042417)),
					 i_1125_ | ((((Class183) class183)
						     .anIntArray2163[i_1114_])
						    & 0xffffff),
					 i_1125_ | ((((Class183) class183)
						     .anIntArray2163[i_1115_])
						    & 0xffffff),
					 i_1125_ | ((((Class183) class183)
						     .anIntArray2163[i_1116_])
						    & 0xffffff),
					 0, 0.0F, 0.0F, 0.0F,
					 (((Class183) class183).aShortArray2161
					  [i_1113_]) & 0xffff,
					 i_1123_);
				} else if (((((Class183) class183)
					     .anIntArray2163[i_1114_])
					    & 0xffffff)
					   != 0) {
				    if (i_1123_ != -1
					&& method16256(class101.aByte1427))
					((Class155) class155).anInt1723
					    = -1694498816;
				    class155.method3385
					(true, true, false, f_1119_, f_1120_,
					 f_1121_, f, f_1117_, f_1118_,
					 fs_1028_[i_1114_], fs_1028_[i_1115_],
					 fs_1028_[i_1116_],
					 (((Class183) class183).anIntArray2163
					  [i_1114_]),
					 (((Class183) class183).anIntArray2163
					  [i_1115_]),
					 (((Class183) class183).anIntArray2163
					  [i_1116_]));
				    ((Class155) class155).anInt1723 = 0;
				}
			    } else
				class155.method3377(true, true, false, f_1119_,
						    f_1120_, f_1121_, f,
						    f_1117_, f_1118_,
						    fs_1028_[i_1114_],
						    fs_1028_[i_1115_],
						    fs_1028_[i_1116_],
						    (((Class189) class189)
						     .anInt2215) * -338296791);
			}
		    }
		} else {
		    for (int i_1126_ = 0;
			 i_1126_ < ((Class183) class183).aShort2160;
			 i_1126_++) {
			int i_1127_ = i_1126_ * 3;
			int i_1128_ = i_1127_ + 1;
			int i_1129_ = i_1128_ + 1;
			float f = fs[i_1127_];
			float f_1130_ = fs[i_1128_];
			float f_1131_ = fs[i_1129_];
			float f_1132_ = fs_1027_[i_1127_];
			float f_1133_ = fs_1027_[i_1128_];
			float f_1134_ = fs_1027_[i_1129_];
			float f_1135_ = (fs_1030_[i_1127_] + fs_1030_[i_1128_]
					 + fs_1030_[i_1129_]);
			if (((f - f_1130_) * (f_1134_ - f_1133_)
			     - (f_1132_ - f_1133_) * (f_1131_ - f_1130_))
			    > 0.0F) {
			    ((Class155) class155).aBool1748
				= (f < 0.0F || f_1130_ < 0.0F || f_1131_ < 0.0F
				   || f > (float) (((Class155) class155)
						   .anInt1733)
				   || f_1130_ > (float) (((Class155) class155)
							 .anInt1733)
				   || f_1131_ > (float) (((Class155) class155)
							 .anInt1733));
			    if (f_1135_ < 3.0F) {
				if (f_1135_ > 0.0F) {
				    if (((((Class183) class183).anIntArray2163
					  [i_1127_])
					 & 0xffffff)
					!= 0)
					class155.method3385
					    (true, true, false, f_1132_,
					     f_1133_, f_1134_, f, f_1130_,
					     f_1131_, fs_1028_[i_1127_],
					     fs_1028_[i_1128_],
					     fs_1028_[i_1129_],
					     (Class54.method1306
					      ((((Class183) class183)
						.anIntArray2163[i_1127_]),
					       (((Class189) class189).anInt2215
						* -338296791),
					       fs_1030_[i_1127_] * 255.0F,
					       1372221625)),
					     (Class54.method1306
					      ((((Class183) class183)
						.anIntArray2163[i_1128_]),
					       (((Class189) class189).anInt2215
						* -338296791),
					       fs_1030_[i_1128_] * 255.0F,
					       1372221625)),
					     (Class54.method1306
					      ((((Class183) class183)
						.anIntArray2163[i_1129_]),
					       (((Class189) class189).anInt2215
						* -338296791),
					       fs_1030_[i_1129_] * 255.0F,
					       1372221625)));
				} else if (((((Class183) class183)
					     .anIntArray2163[i_1127_])
					    & 0xffffff)
					   != 0)
				    class155.method3385
					(true, true, false, f_1132_, f_1133_,
					 f_1134_, f, f_1130_, f_1131_,
					 fs_1028_[i_1127_], fs_1028_[i_1128_],
					 fs_1028_[i_1129_],
					 (((Class183) class183).anIntArray2163
					  [i_1127_]),
					 (((Class183) class183).anIntArray2163
					  [i_1128_]),
					 (((Class183) class183).anIntArray2163
					  [i_1129_]));
			    } else
				class155.method3377(true, true, false, f_1132_,
						    f_1133_, f_1134_, f,
						    f_1130_, f_1131_,
						    fs_1028_[i_1127_],
						    fs_1028_[i_1128_],
						    fs_1028_[i_1129_],
						    (((Class189) class189)
						     .anInt2215) * -338296791);
			}
		    }
		}
	    }
	}
    }
    
    public boolean method3545(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			      int i_1136_, int i_1137_, int i_1138_,
			      boolean bool) {
	return false;
    }
    
    public void method3544(int i, int i_1139_, int[] is, int[] is_1140_,
			   int[] is_1141_, int[] is_1142_, int[] is_1143_,
			   int[] is_1144_, int[] is_1145_, int[] is_1146_,
			   Class86 class86, boolean bool) {
	boolean bool_1147_ = (((Class166_Sub3) this).anInt9968 & 0x20) == 0;
	if (((Class166_Sub3) this).aClass201ArrayArray9967 == null
	    && !bool_1147_) {
	    ((Class166_Sub3) this).aClass201ArrayArray9967
		= new Class201[anInt2055 * 266270313][anInt2052 * -14610189];
	    ((Class166_Sub3) this).aClass183ArrayArray9969
		= new Class183[anInt2055 * 266270313][anInt2052 * -14610189];
	} else if (((Class166_Sub3) this).aClass143ArrayArray9979 == null
		   && bool_1147_)
	    ((Class166_Sub3) this).aClass143ArrayArray9979
		= new Class143[anInt2055 * 266270313][anInt2052 * -14610189];
	else if (((Class166_Sub3) this).aClass182ArrayArray9975 != null)
	    throw new IllegalStateException();
	if (is != null && is.length != 0) {
	    for (int i_1148_ = 0; i_1148_ < is_1143_.length; i_1148_++) {
		if (is_1143_[i_1148_] == -1)
		    is_1143_[i_1148_] = 0;
		else
		    is_1143_[i_1148_]
			= ((Class474.anIntArray6382
			    [Class241_Sub42.method16451(is_1143_[i_1148_],
							1466457748) & 0xffff])
			   << 8) | 0xff;
	    }
	    if (is_1144_ != null) {
		for (int i_1149_ = 0; i_1149_ < is_1144_.length; i_1149_++) {
		    if (is_1144_[i_1149_] == -1)
			is_1144_[i_1149_] = 0;
		    else
			is_1144_[i_1149_]
			    = (Class474.anIntArray6382
			       [(Class241_Sub42.method16451(is_1144_[i_1149_],
							    303245762)
				 & 0xffff)]) << 8 | 0xff;
		}
	    }
	    if (bool_1147_) {
		Class143 class143 = new Class143();
		((Class143) class143).aShort1669 = (short) is.length;
		((Class143) class143).aShort1668 = (short) (is.length / 3);
		((Class143) class143).aShortArray1666
		    = new short[((Class143) class143).aShort1669];
		((Class143) class143).aShortArray1667
		    = new short[((Class143) class143).aShort1669];
		((Class143) class143).aShortArray1664
		    = new short[((Class143) class143).aShort1669];
		((Class143) class143).anIntArray1672
		    = new int[((Class143) class143).aShort1669];
		((Class143) class143).aShortArray1670
		    = new short[((Class143) class143).aShort1669];
		((Class143) class143).aShortArray1671
		    = new short[((Class143) class143).aShort1669];
		((Class143) class143).aByteArray1665
		    = new byte[((Class143) class143).aShort1669];
		if (is_1142_ != null)
		    ((Class143) class143).aShortArray1673
			= new short[((Class143) class143).aShort1669];
		for (int i_1150_ = 0;
		     i_1150_ < ((Class143) class143).aShort1669; i_1150_++) {
		    int i_1151_ = is[i_1150_];
		    int i_1152_ = is_1141_[i_1150_];
		    boolean bool_1153_ = false;
		    int i_1154_;
		    if (i_1151_ == 0 && i_1152_ == 0)
			i_1154_ = ((((Class166_Sub3) this).aByteArrayArray9990
				    [i][i_1139_])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i][i_1139_]));
		    else if (i_1151_ == 0 && i_1152_ == anInt2053 * 2039042417)
			i_1154_ = ((((Class166_Sub3) this).aByteArrayArray9990
				    [i][i_1139_ + 1])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i][i_1139_ + 1]));
		    else if (i_1151_ == anInt2053 * 2039042417
			     && i_1152_ == anInt2053 * 2039042417)
			i_1154_
			    = ((((Class166_Sub3) this).aByteArrayArray9990
				[i + 1][i_1139_ + 1])
			       - (((Class166_Sub3) this).aByteArrayArray9991
				  [i + 1][i_1139_ + 1]));
		    else if (i_1151_ == anInt2053 * 2039042417 && i_1152_ == 0)
			i_1154_ = ((((Class166_Sub3) this).aByteArrayArray9990
				    [i + 1][i_1139_])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i + 1][i_1139_]));
		    else {
			int i_1155_
			    = ((((((Class166_Sub3) this).aByteArrayArray9990[i]
				  [i_1139_])
				 - (((Class166_Sub3) this).aByteArrayArray9991
				    [i][i_1139_]))
				* (anInt2053 * 2039042417 - i_1151_))
			       + ((((Class166_Sub3) this).aByteArrayArray9990
				   [i + 1][i_1139_])
				  - (((Class166_Sub3) this).aByteArrayArray9991
				     [i + 1][i_1139_])) * i_1151_);
			int i_1156_
			    = ((((((Class166_Sub3) this).aByteArrayArray9990[i]
				  [i_1139_ + 1])
				 - (((Class166_Sub3) this).aByteArrayArray9991
				    [i][i_1139_ + 1]))
				* (anInt2053 * 2039042417 - i_1151_))
			       + ((((Class166_Sub3) this).aByteArrayArray9990
				   [i + 1][i_1139_ + 1])
				  - (((Class166_Sub3) this).aByteArrayArray9991
				     [i + 1][i_1139_ + 1])) * i_1151_);
			i_1154_
			    = (i_1155_ * (anInt2053 * 2039042417 - i_1152_)
			       + i_1156_ * i_1152_) >> anInt2054 * -244667650;
		    }
		    int i_1157_ = (i << anInt2054 * -122333825) + i_1151_;
		    int i_1158_
			= (i_1139_ << anInt2054 * -122333825) + i_1152_;
		    ((Class143) class143).aShortArray1666[i_1150_]
			= (short) i_1151_;
		    ((Class143) class143).aShortArray1664[i_1150_]
			= (short) i_1152_;
		    ((Class143) class143).aShortArray1667[i_1150_]
			= (short) (method3574(i_1157_, i_1158_, 526449760)
				   + (is_1140_ != null ? is_1140_[i_1150_]
				      : 0));
		    if (i_1154_ < 0)
			i_1154_ = 0;
		    if (is_1143_[i_1150_] == 0) {
			((Class143) class143).anIntArray1672[i_1150_] = 0;
			if (is_1144_ != null)
			    ((Class143) class143).aByteArray1665[i_1150_]
				= (byte) i_1154_;
		    } else {
			int i_1159_ = 0;
			if (is_1142_ != null) {
			    int i_1160_ = (((Class143) class143)
					       .aShortArray1673[i_1150_]
					   = (short) is_1142_[i_1150_]);
			    if (class86.anInt1252 * -1282025259 != 0) {
				i_1159_ = 255 * i_1160_ / (class86.anInt1252
							   * -1282025259);
				if (i_1159_ < 0)
				    i_1159_ = 0;
				else if (i_1159_ > 255)
				    i_1159_ = 255;
			    }
			}
			int i_1161_ = -16777216;
			if (is_1145_[i_1150_] != -1) {
			    Class101 class101
				= (((Class166_Sub3) this)
				       .aClass103_Sub2_9962.aClass107_1458
				       .method2680
				   (is_1145_[i_1150_], -447903785));
			    if (class101.anInt1403 * 218388063 != -1
				&& method16256(class101.aByte1427))
				i_1161_ = -1694498816;
			}
			((Class143) class143).anIntArray1672[i_1150_]
			    = i_1161_ | (CsDelta_Add.method17423
					 (method16247(is_1143_[i_1150_] >> 8,
						      i_1154_),
					  class86.anInt1251 * 1897985763,
					  i_1159_, -743052806));
			if (is_1144_ != null)
			    ((Class143) class143).aByteArray1665[i_1150_]
				= (byte) i_1154_;
		    }
		    ((Class143) class143).aShortArray1670[i_1150_]
			= (short) is_1145_[i_1150_];
		    ((Class143) class143).aShortArray1671[i_1150_]
			= (short) is_1146_[i_1150_];
		}
		if (is_1144_ != null) {
		    ((Class143) class143).anIntArray1674
			= new int[((Class143) class143).aShort1668];
		    for (int i_1162_ = 0;
			 i_1162_ < ((Class143) class143).aShort1668;
			 i_1162_++) {
			int i_1163_ = i_1162_ * 3;
			if (is_1144_[i_1163_] != 0)
			    ((Class143) class143).anIntArray1674[i_1162_]
				= ~0xffffff | is_1144_[i_1163_] >> 8;
		    }
		}
		((Class166_Sub3) this).aClass143ArrayArray9979[i][i_1139_]
		    = class143;
	    } else {
		boolean bool_1164_ = true;
		int i_1165_ = -1;
		int i_1166_ = -1;
		int i_1167_ = -1;
		int i_1168_ = -1;
		if (is.length == 6) {
		    for (int i_1169_ = 0; i_1169_ < 6; i_1169_++) {
			if (is[i_1169_] == 0 && is_1141_[i_1169_] == 0) {
			    if (i_1165_ != -1
				&& is_1143_[i_1165_] != is_1143_[i_1169_]) {
				bool_1164_ = false;
				break;
			    }
			    i_1165_ = i_1169_;
			} else if (is[i_1169_] == anInt2053 * 2039042417
				   && is_1141_[i_1169_] == 0) {
			    if (i_1166_ != -1
				&& is_1143_[i_1166_] != is_1143_[i_1169_]) {
				bool_1164_ = false;
				break;
			    }
			    i_1166_ = i_1169_;
			} else if (is[i_1169_] == anInt2053 * 2039042417
				   && (is_1141_[i_1169_]
				       == anInt2053 * 2039042417)) {
			    if (i_1167_ != -1
				&& is_1143_[i_1167_] != is_1143_[i_1169_]) {
				bool_1164_ = false;
				break;
			    }
			    i_1167_ = i_1169_;
			} else if (is[i_1169_] == 0
				   && (is_1141_[i_1169_]
				       == anInt2053 * 2039042417)) {
			    if (i_1168_ != -1
				&& is_1143_[i_1168_] != is_1143_[i_1169_]) {
				bool_1164_ = false;
				break;
			    }
			    i_1168_ = i_1169_;
			}
		    }
		    if (i_1165_ == -1 || i_1166_ == -1 || i_1167_ == -1
			|| i_1168_ == -1)
			bool_1164_ = false;
		    if (bool_1164_) {
			if (is_1140_ != null) {
			    for (int i_1170_ = 0; i_1170_ < 4; i_1170_++) {
				if (is_1140_[i_1170_] != 0) {
				    bool_1164_ = false;
				    break;
				}
			    }
			}
			if (bool_1164_) {
			    for (int i_1171_ = 1; i_1171_ < 4; i_1171_++) {
				if (is[i_1171_] != is[0]
				    && (is[i_1171_]
					!= is[0] + anInt2053 * 2039042417)
				    && (is[i_1171_]
					!= is[0] - anInt2053 * 2039042417)) {
				    bool_1164_ = false;
				    break;
				}
				if (is_1141_[i_1171_] != is_1141_[0]
				    && (is_1141_[i_1171_]
					!= (is_1141_[0]
					    + anInt2053 * 2039042417))
				    && (is_1141_[i_1171_]
					!= (is_1141_[0]
					    - anInt2053 * 2039042417))) {
				    bool_1164_ = false;
				    break;
				}
			    }
			}
		    }
		} else
		    bool_1164_ = false;
		if (bool_1164_) {
		    Class201 class201 = new Class201();
		    int i_1172_ = is_1143_[0];
		    int i_1173_ = is_1145_[0];
		    if (is_1144_ != null) {
			((Class201) class201).anInt2408 = is_1144_[0] >> 8;
			if (i_1172_ == 0)
			    ((Class201) class201).aByte2409 |= 0x2;
		    } else if (i_1172_ == 0)
			return;
		    if ((anIntArrayArray2051[i][i_1139_]
			 == anIntArrayArray2051[i + 1][i_1139_])
			&& (anIntArrayArray2051[i][i_1139_]
			    == anIntArrayArray2051[i + 1][i_1139_ + 1])
			&& (anIntArrayArray2051[i][i_1139_]
			    == anIntArrayArray2051[i][i_1139_ + 1]))
			((Class201) class201).aByte2409 |= 0x1;
		    if (i_1173_ != -1
			&& (((Class201) class201).aByte2409 & 0x2) == 0
			&& !(((Class166_Sub3) this).aClass103_Sub2_9962
				 .aClass107_1458.method2680
			     (i_1173_, 765401742).aBool1434)) {
			int i_1174_;
			if (is_1142_ != null
			    && class86.anInt1252 * -1282025259 != 0) {
			    i_1174_
				= 255 * is_1142_[i_1165_] / (class86.anInt1252
							     * -1282025259);
			    if (i_1174_ < 0)
				i_1174_ = 0;
			    else if (i_1174_ > 255)
				i_1174_ = 255;
			} else
			    i_1174_ = 0;
			((Class201) class201).anInt2410
			    = (CsDelta_Add.method17423
			       (method16247(is_1143_[i_1165_] >> 8,
					    ((((Class166_Sub3) this)
					      .aByteArrayArray9990[i][i_1139_])
					     - (((Class166_Sub3) this)
						.aByteArrayArray9991[i]
						[i_1139_]))),
				class86.anInt1251 * 1897985763, i_1174_,
				-708205769));
			if (((Class201) class201).anInt2408 != 0)
			    ((Class201) class201).anInt2410
				|= 255 - ((((Class166_Sub3) this)
					   .aByteArrayArray9990[i][i_1139_])
					  - (((Class166_Sub3) this)
					     .aByteArrayArray9991[i]
					     [i_1139_])) << 25;
			if (is_1142_ != null
			    && class86.anInt1252 * -1282025259 != 0) {
			    i_1174_
				= 255 * is_1142_[i_1166_] / (class86.anInt1252
							     * -1282025259);
			    if (i_1174_ < 0)
				i_1174_ = 0;
			    else if (i_1174_ > 255)
				i_1174_ = 255;
			} else
			    i_1174_ = 0;
			((Class201) class201).anInt2401
			    = (CsDelta_Add.method17423
			       (method16247(is_1143_[i_1166_] >> 8,
					    ((((Class166_Sub3) this)
					      .aByteArrayArray9990[i + 1]
					      [i_1139_])
					     - (((Class166_Sub3) this)
						.aByteArrayArray9991[i + 1]
						[i_1139_]))),
				class86.anInt1251 * 1897985763, i_1174_,
				-1504919037));
			if (((Class201) class201).anInt2408 != 0)
			    ((Class201) class201).anInt2401
				|= 255 - ((((Class166_Sub3) this)
					   .aByteArrayArray9990[i + 1]
					   [i_1139_])
					  - (((Class166_Sub3) this)
					     .aByteArrayArray9991[i + 1]
					     [i_1139_])) << 25;
			if (is_1142_ != null
			    && class86.anInt1252 * -1282025259 != 0) {
			    i_1174_
				= 255 * is_1142_[i_1167_] / (class86.anInt1252
							     * -1282025259);
			    if (i_1174_ < 0)
				i_1174_ = 0;
			    else if (i_1174_ > 255)
				i_1174_ = 255;
			} else
			    i_1174_ = 0;
			((Class201) class201).anInt2404
			    = (CsDelta_Add.method17423
			       (method16247(is_1143_[i_1167_] >> 8,
					    ((((Class166_Sub3) this)
					      .aByteArrayArray9990[i + 1]
					      [i_1139_ + 1])
					     - (((Class166_Sub3) this)
						.aByteArrayArray9991[i + 1]
						[i_1139_ + 1]))),
				class86.anInt1251 * 1897985763, i_1174_,
				-385416334));
			if (((Class201) class201).anInt2408 != 0)
			    ((Class201) class201).anInt2404
				|= 255 - ((((Class166_Sub3) this)
					   .aByteArrayArray9990[i + 1]
					   [i_1139_ + 1])
					  - (((Class166_Sub3) this)
					     .aByteArrayArray9991[i + 1]
					     [i_1139_ + 1])) << 25;
			if (is_1142_ != null
			    && class86.anInt1252 * -1282025259 != 0) {
			    i_1174_
				= 255 * is_1142_[i_1168_] / (class86.anInt1252
							     * -1282025259);
			    if (i_1174_ < 0)
				i_1174_ = 0;
			    else if (i_1174_ > 255)
				i_1174_ = 255;
			} else
			    i_1174_ = 0;
			((Class201) class201).anInt2405
			    = (CsDelta_Add.method17423
			       (method16247(is_1143_[i_1168_] >> 8,
					    ((((Class166_Sub3) this)
					      .aByteArrayArray9990[i]
					      [i_1139_ + 1])
					     - (((Class166_Sub3) this)
						.aByteArrayArray9991[i]
						[i_1139_ + 1]))),
				class86.anInt1251 * 1897985763, i_1174_,
				-2138773621));
			((Class201) class201).aShort2411 = (short) i_1173_;
		    } else {
			int i_1175_;
			if (is_1142_ != null
			    && class86.anInt1252 * -1282025259 != 0) {
			    i_1175_
				= 255 * is_1142_[i_1165_] / (class86.anInt1252
							     * -1282025259);
			    if (i_1175_ < 0)
				i_1175_ = 0;
			    else if (i_1175_ > 255)
				i_1175_ = 255;
			} else
			    i_1175_ = 0;
			((Class201) class201).anInt2410
			    = (CsDelta_Add.method17423
			       (method16247(is_1143_[i_1165_] >> 8,
					    ((((Class166_Sub3) this)
					      .aByteArrayArray9990[i][i_1139_])
					     - (((Class166_Sub3) this)
						.aByteArrayArray9991[i]
						[i_1139_]))),
				class86.anInt1251 * 1897985763, i_1175_,
				-841165549));
			if (((Class201) class201).anInt2408 != 0)
			    ((Class201) class201).anInt2410
				|= 255 - ((((Class166_Sub3) this)
					   .aByteArrayArray9990[i][i_1139_])
					  - (((Class166_Sub3) this)
					     .aByteArrayArray9991[i]
					     [i_1139_])) << 25;
			if (is_1142_ != null
			    && class86.anInt1252 * -1282025259 != 0) {
			    i_1175_
				= 255 * is_1142_[i_1166_] / (class86.anInt1252
							     * -1282025259);
			    if (i_1175_ < 0)
				i_1175_ = 0;
			    else if (i_1175_ > 255)
				i_1175_ = 255;
			} else
			    i_1175_ = 0;
			((Class201) class201).anInt2401
			    = (CsDelta_Add.method17423
			       (method16247(is_1143_[i_1166_] >> 8,
					    ((((Class166_Sub3) this)
					      .aByteArrayArray9990[i + 1]
					      [i_1139_])
					     - (((Class166_Sub3) this)
						.aByteArrayArray9991[i + 1]
						[i_1139_]))),
				class86.anInt1251 * 1897985763, i_1175_,
				-1999027626));
			if (((Class201) class201).anInt2408 != 0)
			    ((Class201) class201).anInt2401
				|= 255 - ((((Class166_Sub3) this)
					   .aByteArrayArray9990[i + 1]
					   [i_1139_])
					  - (((Class166_Sub3) this)
					     .aByteArrayArray9991[i + 1]
					     [i_1139_])) << 25;
			if (is_1142_ != null
			    && class86.anInt1252 * -1282025259 != 0) {
			    i_1175_
				= 255 * is_1142_[i_1167_] / (class86.anInt1252
							     * -1282025259);
			    if (i_1175_ < 0)
				i_1175_ = 0;
			    else if (i_1175_ > 255)
				i_1175_ = 255;
			} else
			    i_1175_ = 0;
			((Class201) class201).anInt2404
			    = (CsDelta_Add.method17423
			       (method16247(is_1143_[i_1167_] >> 8,
					    ((((Class166_Sub3) this)
					      .aByteArrayArray9990[i + 1]
					      [i_1139_ + 1])
					     - (((Class166_Sub3) this)
						.aByteArrayArray9991[i + 1]
						[i_1139_ + 1]))),
				class86.anInt1251 * 1897985763, i_1175_,
				-1143059360));
			if (((Class201) class201).anInt2408 != 0)
			    ((Class201) class201).anInt2404
				|= 255 - ((((Class166_Sub3) this)
					   .aByteArrayArray9990[i + 1]
					   [i_1139_ + 1])
					  - (((Class166_Sub3) this)
					     .aByteArrayArray9991[i + 1]
					     [i_1139_ + 1])) << 25;
			if (is_1142_ != null
			    && class86.anInt1252 * -1282025259 != 0) {
			    i_1175_
				= 255 * is_1142_[i_1168_] / (class86.anInt1252
							     * -1282025259);
			    if (i_1175_ < 0)
				i_1175_ = 0;
			    else if (i_1175_ > 255)
				i_1175_ = 255;
			} else
			    i_1175_ = 0;
			((Class201) class201).anInt2405
			    = (CsDelta_Add.method17423
			       (method16247(is_1143_[i_1168_] >> 8,
					    ((((Class166_Sub3) this)
					      .aByteArrayArray9990[i]
					      [i_1139_ + 1])
					     - (((Class166_Sub3) this)
						.aByteArrayArray9991[i]
						[i_1139_ + 1]))),
				class86.anInt1251 * 1897985763, i_1175_,
				-167234969));
			if (((Class201) class201).anInt2408 != 0)
			    ((Class201) class201).anInt2405
				|= 255 - ((((Class166_Sub3) this)
					   .aByteArrayArray9990[i]
					   [i_1139_ + 1])
					  - (((Class166_Sub3) this)
					     .aByteArrayArray9991[i]
					     [i_1139_ + 1])) << 25;
			((Class201) class201).aShort2411 = (short) -1;
		    }
		    if (is_1142_ != null) {
			((Class201) class201).aShort2406
			    = (short) is_1142_[i_1167_];
			((Class201) class201).aShort2402
			    = (short) is_1142_[i_1168_];
			((Class201) class201).aShort2407
			    = (short) is_1142_[i_1166_];
			((Class201) class201).aShort2403
			    = (short) is_1142_[i_1165_];
		    }
		    ((Class166_Sub3) this).aClass201ArrayArray9967[i][i_1139_]
			= class201;
		} else {
		    Class183 class183 = new Class183();
		    ((Class183) class183).aShort2154 = (short) is.length;
		    ((Class183) class183).aShort2160 = (short) (is.length / 3);
		    ((Class183) class183).aShortArray2156
			= new short[((Class183) class183).aShort2154];
		    ((Class183) class183).aShortArray2153
			= new short[((Class183) class183).aShort2154];
		    ((Class183) class183).aShortArray2158
			= new short[((Class183) class183).aShort2154];
		    ((Class183) class183).anIntArray2163
			= new int[((Class183) class183).aShort2154];
		    if (is_1142_ != null)
			((Class183) class183).aShortArray2159
			    = new short[((Class183) class183).aShort2154];
		    for (int i_1176_ = 0;
			 i_1176_ < ((Class183) class183).aShort2154;
			 i_1176_++) {
			int i_1177_ = is[i_1176_];
			int i_1178_ = is_1141_[i_1176_];
			boolean bool_1179_ = false;
			int i_1180_;
			if (i_1177_ == 0 && i_1178_ == 0)
			    i_1180_ = ((((Class166_Sub3) this)
					.aByteArrayArray9990[i][i_1139_])
				       - (((Class166_Sub3) this)
					  .aByteArrayArray9991[i][i_1139_]));
			else if (i_1177_ == 0
				 && i_1178_ == anInt2053 * 2039042417)
			    i_1180_
				= ((((Class166_Sub3) this).aByteArrayArray9990
				    [i][i_1139_ + 1])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i][i_1139_ + 1]));
			else if (i_1177_ == anInt2053 * 2039042417
				 && i_1178_ == anInt2053 * 2039042417)
			    i_1180_
				= ((((Class166_Sub3) this).aByteArrayArray9990
				    [i + 1][i_1139_ + 1])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i + 1]
				      [i_1139_ + 1]));
			else if (i_1177_ == anInt2053 * 2039042417
				 && i_1178_ == 0)
			    i_1180_
				= ((((Class166_Sub3) this).aByteArrayArray9990
				    [i + 1][i_1139_])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i + 1][i_1139_]));
			else {
			    int i_1181_
				= ((((((Class166_Sub3) this)
				      .aByteArrayArray9990[i][i_1139_])
				     - (((Class166_Sub3) this)
					.aByteArrayArray9991[i][i_1139_]))
				    * (anInt2053 * 2039042417 - i_1177_))
				   + ((((Class166_Sub3) this)
				       .aByteArrayArray9990[i + 1][i_1139_])
				      - (((Class166_Sub3) this)
					 .aByteArrayArray9991[i + 1]
					 [i_1139_])) * i_1177_);
			    int i_1182_
				= ((((((Class166_Sub3) this)
				      .aByteArrayArray9990[i][i_1139_ + 1])
				     - (((Class166_Sub3) this)
					.aByteArrayArray9991[i][i_1139_ + 1]))
				    * (anInt2053 * 2039042417 - i_1177_))
				   + ((((Class166_Sub3) this)
				       .aByteArrayArray9990[i + 1]
				       [i_1139_ + 1])
				      - (((Class166_Sub3) this)
					 .aByteArrayArray9991[i + 1]
					 [i_1139_ + 1])) * i_1177_);
			    i_1180_
				= (i_1181_ * (anInt2053 * 2039042417
					      - i_1178_) + i_1182_ * i_1178_
				   >> anInt2054 * -244667650);
			}
			int i_1183_ = (i << anInt2054 * -122333825) + i_1177_;
			int i_1184_
			    = (i_1139_ << anInt2054 * -122333825) + i_1178_;
			((Class183) class183).aShortArray2156[i_1176_]
			    = (short) i_1177_;
			((Class183) class183).aShortArray2158[i_1176_]
			    = (short) i_1178_;
			((Class183) class183).aShortArray2153[i_1176_]
			    = (short) (method3574(i_1183_, i_1184_,
						  -2111069891)
				       + (is_1140_ != null ? is_1140_[i_1176_]
					  : 0));
			if (i_1180_ < 0)
			    i_1180_ = 0;
			if (is_1143_[i_1176_] == 0) {
			    if (is_1144_ != null)
				((Class183) class183).anIntArray2163[i_1176_]
				    = i_1180_ << 25;
			    else
				((Class183) class183).anIntArray2163[i_1176_]
				    = 0;
			} else {
			    int i_1185_ = 0;
			    if (is_1142_ != null) {
				int i_1186_ = (((Class183) class183)
						   .aShortArray2159[i_1176_]
					       = (short) is_1142_[i_1176_]);
				if (class86.anInt1252 * -1282025259 != 0) {
				    i_1185_
					= 255 * i_1186_ / (class86.anInt1252
							   * -1282025259);
				    if (i_1185_ < 0)
					i_1185_ = 0;
				    else if (i_1185_ > 255)
					i_1185_ = 255;
				}
			    }
			    ((Class183) class183).anIntArray2163[i_1176_]
				= (CsDelta_Add.method17423
				   (method16247(is_1143_[i_1176_] >> 8,
						i_1180_),
				    class86.anInt1251 * 1897985763, i_1185_,
				    -170915067));
			    if (is_1144_ != null)
				((Class183) class183).anIntArray2163[i_1176_]
				    |= i_1180_ << 25;
			}
		    }
		    boolean bool_1187_ = false;
		    for (int i_1188_ = 0;
			 i_1188_ < ((Class183) class183).aShort2160;
			 i_1188_++) {
			if (is_1145_[i_1188_ * 3] != -1
			    && !(((Class166_Sub3) this).aClass103_Sub2_9962
				     .aClass107_1458.method2680
				 (is_1145_[i_1188_ * 3], 1761431).aBool1434))
			    bool_1187_ = true;
		    }
		    if (is_1144_ != null)
			((Class183) class183).anIntArray2155
			    = new int[((Class183) class183).aShort2160];
		    if (bool_1187_) {
			((Class183) class183).aShortArray2161
			    = new short[((Class183) class183).aShort2160];
			((Class183) class183).aShortArray2162
			    = new short[((Class183) class183).aShort2160];
		    }
		    for (int i_1189_ = 0;
			 i_1189_ < ((Class183) class183).aShort2160;
			 i_1189_++) {
			int i_1190_ = i_1189_ * 3;
			if (is_1144_ != null && is_1144_[i_1190_] != 0)
			    ((Class183) class183).anIntArray2155[i_1189_]
				= is_1144_[i_1190_] >> 8;
			if (bool_1187_) {
			    int i_1191_ = i_1190_ + 1;
			    int i_1192_ = i_1191_ + 1;
			    boolean bool_1193_ = false;
			    boolean bool_1194_ = true;
			    int i_1195_ = is_1145_[i_1190_];
			    if (i_1195_ == -1
				|| (((Class166_Sub3) this)
					.aClass103_Sub2_9962.aClass107_1458
					.method2680
				    (i_1195_, 2097916659).aBool1434))
				bool_1194_ = false;
			    else
				bool_1193_ = true;
			    i_1195_ = is_1145_[i_1191_];
			    if (i_1195_ == -1
				|| (((Class166_Sub3) this)
					.aClass103_Sub2_9962.aClass107_1458
					.method2680
				    (i_1195_, 1969608043).aBool1434))
				bool_1194_ = false;
			    else
				bool_1193_ = true;
			    i_1195_ = is_1145_[i_1192_];
			    if (i_1195_ == -1
				|| (((Class166_Sub3) this)
					.aClass103_Sub2_9962.aClass107_1458
					.method2680
				    (i_1195_, 1433521759).aBool1434))
				bool_1194_ = false;
			    else
				bool_1193_ = true;
			    if (bool_1194_) {
				((Class183) class183).aShortArray2161[i_1189_]
				    = (short) i_1195_;
				((Class183) class183).aShortArray2162[i_1189_]
				    = (short) is_1146_[i_1190_];
			    } else {
				if (bool_1193_) {
				    i_1195_ = is_1145_[i_1190_];
				    if (i_1195_ != -1
					&& !(((Class166_Sub3) this)
						 .aClass103_Sub2_9962
						 .aClass107_1458.method2680
					     (i_1195_, 1346062771).aBool1434))
					((Class183) class183)
					    .anIntArray2163[i_1190_]
					    = (Class474.anIntArray6382
					       [(Class241_Sub42.method16451
						 ((((Class166_Sub3) this)
						       .aClass103_Sub2_9962
						       .aClass107_1458
						       .method2680
						   (i_1195_, -1915046887)
						   .aShort1436) & 0xffff,
						  924468878)) & 0xffff]);
				    i_1195_ = is_1145_[i_1191_];
				    if (i_1195_ != -1
					&& !(((Class166_Sub3) this)
						 .aClass103_Sub2_9962
						 .aClass107_1458.method2680
					     (i_1195_, 994463946).aBool1434))
					((Class183) class183)
					    .anIntArray2163[i_1191_]
					    = (Class474.anIntArray6382
					       [(Class241_Sub42.method16451
						 ((((Class166_Sub3) this)
						       .aClass103_Sub2_9962
						       .aClass107_1458
						       .method2680
						   (i_1195_, -487536416)
						   .aShort1436) & 0xffff,
						  -955579815)) & 0xffff]);
				    i_1195_ = is_1145_[i_1192_];
				    if (i_1195_ != -1
					&& !(((Class166_Sub3) this)
						 .aClass103_Sub2_9962
						 .aClass107_1458.method2680
					     (i_1195_, 1335564369).aBool1434))
					((Class183) class183)
					    .anIntArray2163[i_1192_]
					    = (Class474.anIntArray6382
					       [(Class241_Sub42.method16451
						 ((((Class166_Sub3) this)
						       .aClass103_Sub2_9962
						       .aClass107_1458
						       .method2680
						   (i_1195_, -748621370)
						   .aShort1436) & 0xffff,
						  -1980981890)) & 0xffff]);
				}
				((Class183) class183).aShortArray2161[i_1189_]
				    = (short) -1;
			    }
			}
		    }
		    ((Class166_Sub3) this).aClass183ArrayArray9969[i][i_1139_]
			= class183;
		}
	    }
	}
    }
    
    void method16261(int i, int i_1196_, boolean bool, Class189 class189,
		     Class155 class155, float[] fs, float[] fs_1197_,
		     float[] fs_1198_, float[] fs_1199_, float[] fs_1200_,
		     int i_1201_) {
	Class201 class201
	    = ((Class166_Sub3) this).aClass201ArrayArray9967[i][i_1196_];
	if (class201 != null) {
	    if ((((Class201) class201).aByte2409 & 0x2) == 0) {
		if (i_1201_ != 0) {
		    if ((((Class201) class201).aByte2409 & 0x4) != 0) {
			if ((i_1201_ & 0x1) != 0)
			    return;
		    } else if ((i_1201_ & 0x2) != 0)
			return;
		}
		int i_1202_ = i * (anInt2053 * 2039042417);
		int i_1203_ = i_1202_ + anInt2053 * 2039042417;
		int i_1204_ = i_1196_ * (anInt2053 * 2039042417);
		int i_1205_ = i_1204_ + anInt2053 * 2039042417;
		float f = 0.0F;
		float f_1206_ = 0.0F;
		float f_1207_ = 0.0F;
		float f_1208_ = 0.0F;
		float f_1209_;
		float f_1210_;
		float f_1211_;
		float f_1212_;
		float f_1213_;
		float f_1214_;
		float f_1215_;
		float f_1216_;
		float f_1217_;
		float f_1218_;
		float f_1219_;
		float f_1220_;
		float f_1221_;
		float f_1222_;
		float f_1223_;
		float f_1224_;
		if ((((Class201) class201).aByte2409 & 0x1) != 0 && !bool) {
		    int i_1225_ = anIntArrayArray2051[i][i_1196_];
		    float f_1226_
			= ((Class166_Sub3) this).aFloat9980 * (float) i_1225_;
		    float f_1227_
			= ((Class166_Sub3) this).aFloat9989 * (float) i_1225_;
		    float f_1228_ = (((Class166_Sub3) this).aFloat9988
				     + ((((Class166_Sub3) this).aFloat9976
					 * (float) i_1202_)
					+ f_1226_
					+ (((Class166_Sub3) this).aFloat9984
					   * (float) i_1204_)));
		    f_1209_ = (((Class166_Sub3) this).aFloat9974
			       + ((((Class166_Sub3) this).aFloat9977
				   * (float) i_1202_)
				  + f_1227_
				  + (((Class166_Sub3) this).aFloat9985
				     * (float) i_1204_)));
		    if (f_1228_ < -f_1209_)
			return;
		    float f_1229_ = (((Class166_Sub3) this).aFloat9988
				     + ((((Class166_Sub3) this).aFloat9976
					 * (float) i_1203_)
					+ f_1226_
					+ (((Class166_Sub3) this).aFloat9984
					   * (float) i_1204_)));
		    f_1210_ = (((Class166_Sub3) this).aFloat9974
			       + ((((Class166_Sub3) this).aFloat9977
				   * (float) i_1203_)
				  + f_1227_
				  + (((Class166_Sub3) this).aFloat9985
				     * (float) i_1204_)));
		    if (f_1229_ < -f_1210_)
			return;
		    float f_1230_ = (((Class166_Sub3) this).aFloat9988
				     + ((((Class166_Sub3) this).aFloat9976
					 * (float) i_1203_)
					+ f_1226_
					+ (((Class166_Sub3) this).aFloat9984
					   * (float) i_1205_)));
		    f_1211_ = (((Class166_Sub3) this).aFloat9974
			       + ((((Class166_Sub3) this).aFloat9977
				   * (float) i_1203_)
				  + f_1227_
				  + (((Class166_Sub3) this).aFloat9985
				     * (float) i_1205_)));
		    if (f_1230_ < -f_1211_)
			return;
		    float f_1231_ = (((Class166_Sub3) this).aFloat9988
				     + ((((Class166_Sub3) this).aFloat9976
					 * (float) i_1202_)
					+ f_1226_
					+ (((Class166_Sub3) this).aFloat9984
					   * (float) i_1205_)));
		    f_1212_ = (((Class166_Sub3) this).aFloat9974
			       + ((((Class166_Sub3) this).aFloat9977
				   * (float) i_1202_)
				  + f_1227_
				  + (((Class166_Sub3) this).aFloat9985
				     * (float) i_1205_)));
		    if (f_1231_ < -f_1212_)
			return;
		    f_1213_ = (((Class155) class155).aFloat1720
			       + (((Class155) class155).aFloat1732 * f_1228_
				  / f_1209_));
		    f_1214_ = (((Class155) class155).aFloat1720
			       + (((Class155) class155).aFloat1732 * f_1229_
				  / f_1210_));
		    f_1215_ = (((Class155) class155).aFloat1720
			       + (((Class155) class155).aFloat1732 * f_1230_
				  / f_1211_));
		    f_1216_ = (((Class155) class155).aFloat1720
			       + (((Class155) class155).aFloat1732 * f_1231_
				  / f_1212_));
		    if (((Class189) class189).aBool2209) {
			float f_1232_
			    = f_1228_ - ((Class189) class189).aFloat2213;
			if (f_1232_ > 0.0F) {
			    f = f_1232_ / ((Class189) class189).aFloat2214;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_1232_ = f_1229_ - ((Class189) class189).aFloat2213;
			if (f_1232_ > 0.0F) {
			    f_1206_
				= f_1232_ / ((Class189) class189).aFloat2214;
			    if (f_1206_ > 1.0F)
				f_1206_ = 1.0F;
			}
			f_1232_ = f_1230_ - ((Class189) class189).aFloat2213;
			if (f_1232_ > 0.0F) {
			    f_1207_
				= f_1232_ / ((Class189) class189).aFloat2214;
			    if (f_1207_ > 1.0F)
				f_1207_ = 1.0F;
			}
			f_1232_ = f_1231_ - ((Class189) class189).aFloat2213;
			if (f_1232_ > 0.0F) {
			    f_1208_
				= f_1232_ / ((Class189) class189).aFloat2214;
			    if (f_1208_ > 1.0F)
				f_1208_ = 1.0F;
			}
		    }
		    float f_1233_
			= ((Class166_Sub3) this).aFloat9978 * (float) i_1225_;
		    float f_1234_
			= ((Class166_Sub3) this).aFloat9965 * (float) i_1225_;
		    float f_1235_ = (((Class166_Sub3) this).aFloat9986
				     + ((((Class166_Sub3) this).aFloat9981
					 * (float) i_1202_)
					+ f_1233_
					+ (((Class166_Sub3) this).aFloat9982
					   * (float) i_1204_)));
		    f_1217_ = (((Class155) class155).aFloat1727
			       + (((Class155) class155).aFloat1728 * f_1235_
				  / f_1209_));
		    float f_1236_ = (((Class166_Sub3) this).aFloat9987
				     + ((((Class166_Sub3) this).aFloat9973
					 * (float) i_1202_)
					+ f_1234_
					+ (((Class166_Sub3) this).aFloat9983
					   * (float) i_1204_)));
		    f_1218_ = (((Class155) class155).aFloat1731
			       + (((Class155) class155).aFloat1729 * f_1236_
				  / f_1209_));
		    float f_1237_ = (((Class166_Sub3) this).aFloat9986
				     + ((((Class166_Sub3) this).aFloat9981
					 * (float) i_1203_)
					+ f_1233_
					+ (((Class166_Sub3) this).aFloat9982
					   * (float) i_1204_)));
		    f_1219_ = (((Class155) class155).aFloat1727
			       + (((Class155) class155).aFloat1728 * f_1237_
				  / f_1210_));
		    float f_1238_ = (((Class166_Sub3) this).aFloat9987
				     + ((((Class166_Sub3) this).aFloat9973
					 * (float) i_1203_)
					+ f_1234_
					+ (((Class166_Sub3) this).aFloat9983
					   * (float) i_1204_)));
		    f_1220_ = (((Class155) class155).aFloat1731
			       + (((Class155) class155).aFloat1729 * f_1238_
				  / f_1210_));
		    float f_1239_ = (((Class166_Sub3) this).aFloat9986
				     + ((((Class166_Sub3) this).aFloat9981
					 * (float) i_1203_)
					+ f_1233_
					+ (((Class166_Sub3) this).aFloat9982
					   * (float) i_1205_)));
		    f_1221_ = (((Class155) class155).aFloat1727
			       + (((Class155) class155).aFloat1728 * f_1239_
				  / f_1211_));
		    float f_1240_ = (((Class166_Sub3) this).aFloat9987
				     + ((((Class166_Sub3) this).aFloat9973
					 * (float) i_1203_)
					+ f_1234_
					+ (((Class166_Sub3) this).aFloat9983
					   * (float) i_1205_)));
		    f_1222_ = (((Class155) class155).aFloat1731
			       + (((Class155) class155).aFloat1729 * f_1240_
				  / f_1211_));
		    float f_1241_ = (((Class166_Sub3) this).aFloat9986
				     + ((((Class166_Sub3) this).aFloat9981
					 * (float) i_1202_)
					+ f_1233_
					+ (((Class166_Sub3) this).aFloat9982
					   * (float) i_1205_)));
		    f_1223_ = (((Class155) class155).aFloat1727
			       + (((Class155) class155).aFloat1728 * f_1241_
				  / f_1212_));
		    float f_1242_ = (((Class166_Sub3) this).aFloat9987
				     + ((((Class166_Sub3) this).aFloat9973
					 * (float) i_1202_)
					+ f_1234_
					+ (((Class166_Sub3) this).aFloat9983
					   * (float) i_1205_)));
		    f_1224_ = (((Class155) class155).aFloat1731
			       + (((Class155) class155).aFloat1729 * f_1242_
				  / f_1212_));
		} else {
		    int i_1243_ = anIntArrayArray2051[i][i_1196_];
		    int i_1244_ = anIntArrayArray2051[i + 1][i_1196_];
		    int i_1245_ = anIntArrayArray2051[i + 1][i_1196_ + 1];
		    int i_1246_ = anIntArrayArray2051[i][i_1196_ + 1];
		    float f_1247_ = (((Class166_Sub3) this).aFloat9988
				     + ((((Class166_Sub3) this).aFloat9976
					 * (float) i_1202_)
					+ (((Class166_Sub3) this).aFloat9980
					   * (float) i_1243_)
					+ (((Class166_Sub3) this).aFloat9984
					   * (float) i_1204_)));
		    f_1209_ = (((Class166_Sub3) this).aFloat9974
			       + ((((Class166_Sub3) this).aFloat9977
				   * (float) i_1202_)
				  + (((Class166_Sub3) this).aFloat9989
				     * (float) i_1243_)
				  + (((Class166_Sub3) this).aFloat9985
				     * (float) i_1204_)));
		    if (f_1247_ < -f_1209_)
			return;
		    float f_1248_ = (((Class166_Sub3) this).aFloat9988
				     + ((((Class166_Sub3) this).aFloat9976
					 * (float) i_1203_)
					+ (((Class166_Sub3) this).aFloat9980
					   * (float) i_1244_)
					+ (((Class166_Sub3) this).aFloat9984
					   * (float) i_1204_)));
		    f_1210_ = (((Class166_Sub3) this).aFloat9974
			       + ((((Class166_Sub3) this).aFloat9977
				   * (float) i_1203_)
				  + (((Class166_Sub3) this).aFloat9989
				     * (float) i_1244_)
				  + (((Class166_Sub3) this).aFloat9985
				     * (float) i_1204_)));
		    if (f_1248_ < -f_1210_)
			return;
		    float f_1249_ = (((Class166_Sub3) this).aFloat9988
				     + ((((Class166_Sub3) this).aFloat9976
					 * (float) i_1203_)
					+ (((Class166_Sub3) this).aFloat9980
					   * (float) i_1245_)
					+ (((Class166_Sub3) this).aFloat9984
					   * (float) i_1205_)));
		    f_1211_ = (((Class166_Sub3) this).aFloat9974
			       + ((((Class166_Sub3) this).aFloat9977
				   * (float) i_1203_)
				  + (((Class166_Sub3) this).aFloat9989
				     * (float) i_1245_)
				  + (((Class166_Sub3) this).aFloat9985
				     * (float) i_1205_)));
		    if (f_1249_ < -f_1211_)
			return;
		    float f_1250_ = (((Class166_Sub3) this).aFloat9988
				     + ((((Class166_Sub3) this).aFloat9976
					 * (float) i_1202_)
					+ (((Class166_Sub3) this).aFloat9980
					   * (float) i_1246_)
					+ (((Class166_Sub3) this).aFloat9984
					   * (float) i_1205_)));
		    f_1212_ = (((Class166_Sub3) this).aFloat9974
			       + ((((Class166_Sub3) this).aFloat9977
				   * (float) i_1202_)
				  + (((Class166_Sub3) this).aFloat9989
				     * (float) i_1246_)
				  + (((Class166_Sub3) this).aFloat9985
				     * (float) i_1205_)));
		    if (f_1250_ < -f_1212_)
			return;
		    f_1213_ = (((Class155) class155).aFloat1720
			       + (((Class155) class155).aFloat1732 * f_1247_
				  / f_1209_));
		    f_1214_ = (((Class155) class155).aFloat1720
			       + (((Class155) class155).aFloat1732 * f_1248_
				  / f_1210_));
		    f_1215_ = (((Class155) class155).aFloat1720
			       + (((Class155) class155).aFloat1732 * f_1249_
				  / f_1211_));
		    f_1216_ = (((Class155) class155).aFloat1720
			       + (((Class155) class155).aFloat1732 * f_1250_
				  / f_1212_));
		    if (bool) {
			float f_1251_
			    = f_1247_ - ((Class189) class189).aFloat2213;
			if (f_1251_ > 0.0F) {
			    f_1251_ /= ((Class189) class189).aFloat2214;
			    if (f_1251_ > 1.0F)
				f_1251_ = 1.0F;
			    f = f_1251_;
			    int i_1252_ = (int) ((float) (((Class201) class201)
							  .aShort2403)
						 * f_1251_);
			    if (i_1252_ > 0)
				i_1243_ -= i_1252_;
			}
			f_1251_ = f_1248_ - ((Class189) class189).aFloat2213;
			if (f_1251_ > 0.0F) {
			    f_1251_ /= ((Class189) class189).aFloat2214;
			    if (f_1251_ > 1.0F)
				f_1251_ = 1.0F;
			    f_1206_ = f_1251_;
			    int i_1253_ = (int) ((float) (((Class201) class201)
							  .aShort2407)
						 * f_1251_);
			    if (i_1253_ > 0)
				i_1244_ -= i_1253_;
			}
			f_1251_ = f_1249_ - ((Class189) class189).aFloat2213;
			if (f_1251_ > 0.0F) {
			    f_1251_ /= ((Class189) class189).aFloat2214;
			    if (f_1251_ > 1.0F)
				f_1251_ = 1.0F;
			    f_1207_ = f_1251_;
			    int i_1254_ = (int) ((float) (((Class201) class201)
							  .aShort2406)
						 * f_1251_);
			    if (i_1254_ > 0)
				i_1245_ -= i_1254_;
			}
			f_1251_ = f_1250_ - ((Class189) class189).aFloat2213;
			if (f_1251_ > 0.0F) {
			    f_1251_ /= ((Class189) class189).aFloat2214;
			    if (f_1251_ > 1.0F)
				f_1251_ = 1.0F;
			    f_1208_ = f_1251_;
			    int i_1255_ = (int) ((float) (((Class201) class201)
							  .aShort2402)
						 * f_1251_);
			    if (i_1255_ > 0)
				i_1246_ -= i_1255_;
			}
		    } else if (((Class189) class189).aBool2209) {
			float f_1256_
			    = f_1247_ - ((Class189) class189).aFloat2213;
			if (f_1256_ > 0.0F) {
			    f = f_1256_ / ((Class189) class189).aFloat2214;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_1256_ = f_1248_ - ((Class189) class189).aFloat2213;
			if (f_1256_ > 0.0F) {
			    f_1206_
				= f_1256_ / ((Class189) class189).aFloat2214;
			    if (f_1206_ > 1.0F)
				f_1206_ = 1.0F;
			}
			f_1256_ = f_1249_ - ((Class189) class189).aFloat2213;
			if (f_1256_ > 0.0F) {
			    f_1207_
				= f_1256_ / ((Class189) class189).aFloat2214;
			    if (f_1207_ > 1.0F)
				f_1207_ = 1.0F;
			}
			f_1256_ = f_1250_ - ((Class189) class189).aFloat2213;
			if (f_1256_ > 0.0F) {
			    f_1208_
				= f_1256_ / ((Class189) class189).aFloat2214;
			    if (f_1208_ > 1.0F)
				f_1208_ = 1.0F;
			}
		    }
		    float f_1257_ = (((Class166_Sub3) this).aFloat9986
				     + ((((Class166_Sub3) this).aFloat9981
					 * (float) i_1202_)
					+ (((Class166_Sub3) this).aFloat9978
					   * (float) i_1243_)
					+ (((Class166_Sub3) this).aFloat9982
					   * (float) i_1204_)));
		    f_1217_ = (((Class155) class155).aFloat1727
			       + (((Class155) class155).aFloat1728 * f_1257_
				  / f_1209_));
		    float f_1258_ = (((Class166_Sub3) this).aFloat9987
				     + ((((Class166_Sub3) this).aFloat9973
					 * (float) i_1202_)
					+ (((Class166_Sub3) this).aFloat9965
					   * (float) i_1243_)
					+ (((Class166_Sub3) this).aFloat9983
					   * (float) i_1204_)));
		    f_1218_ = (((Class155) class155).aFloat1731
			       + (((Class155) class155).aFloat1729 * f_1258_
				  / f_1209_));
		    float f_1259_ = (((Class166_Sub3) this).aFloat9986
				     + ((((Class166_Sub3) this).aFloat9981
					 * (float) i_1203_)
					+ (((Class166_Sub3) this).aFloat9978
					   * (float) i_1244_)
					+ (((Class166_Sub3) this).aFloat9982
					   * (float) i_1204_)));
		    f_1219_ = (((Class155) class155).aFloat1727
			       + (((Class155) class155).aFloat1728 * f_1259_
				  / f_1210_));
		    float f_1260_ = (((Class166_Sub3) this).aFloat9987
				     + ((((Class166_Sub3) this).aFloat9973
					 * (float) i_1203_)
					+ (((Class166_Sub3) this).aFloat9965
					   * (float) i_1244_)
					+ (((Class166_Sub3) this).aFloat9983
					   * (float) i_1204_)));
		    f_1220_ = (((Class155) class155).aFloat1731
			       + (((Class155) class155).aFloat1729 * f_1260_
				  / f_1210_));
		    float f_1261_ = (((Class166_Sub3) this).aFloat9986
				     + ((((Class166_Sub3) this).aFloat9981
					 * (float) i_1203_)
					+ (((Class166_Sub3) this).aFloat9978
					   * (float) i_1245_)
					+ (((Class166_Sub3) this).aFloat9982
					   * (float) i_1205_)));
		    f_1221_ = (((Class155) class155).aFloat1727
			       + (((Class155) class155).aFloat1728 * f_1261_
				  / f_1211_));
		    float f_1262_ = (((Class166_Sub3) this).aFloat9987
				     + ((((Class166_Sub3) this).aFloat9973
					 * (float) i_1203_)
					+ (((Class166_Sub3) this).aFloat9965
					   * (float) i_1245_)
					+ (((Class166_Sub3) this).aFloat9983
					   * (float) i_1205_)));
		    f_1222_ = (((Class155) class155).aFloat1731
			       + (((Class155) class155).aFloat1729 * f_1262_
				  / f_1211_));
		    float f_1263_ = (((Class166_Sub3) this).aFloat9986
				     + ((((Class166_Sub3) this).aFloat9981
					 * (float) i_1202_)
					+ (((Class166_Sub3) this).aFloat9978
					   * (float) i_1246_)
					+ (((Class166_Sub3) this).aFloat9982
					   * (float) i_1205_)));
		    f_1223_ = (((Class155) class155).aFloat1727
			       + (((Class155) class155).aFloat1728 * f_1263_
				  / f_1212_));
		    float f_1264_ = (((Class166_Sub3) this).aFloat9987
				     + ((((Class166_Sub3) this).aFloat9973
					 * (float) i_1202_)
					+ (((Class166_Sub3) this).aFloat9965
					   * (float) i_1246_)
					+ (((Class166_Sub3) this).aFloat9983
					   * (float) i_1205_)));
		    f_1224_ = (((Class155) class155).aFloat1731
			       + (((Class155) class155).aFloat1729 * f_1264_
				  / f_1212_));
		}
		Class101 class101 = null;
		int i_1265_ = -1;
		if (((Class201) class201).aShort2411 != -1) {
		    class101 = (((Class166_Sub3) this).aClass103_Sub2_9962
				    .aClass107_1458.method2680
				(((Class201) class201).aShort2411 & 0xffff,
				 347107708));
		    i_1265_ = class101.anInt1403 * 218388063;
		}
		boolean bool_1266_
		    = class101 != null && method16256(class101.aByte1427);
		float f_1267_ = f_1206_ + f_1207_ + f_1208_;
		if (((f_1221_ - f_1223_) * (f_1220_ - f_1224_)
		     - (f_1222_ - f_1224_) * (f_1219_ - f_1223_))
		    > 0.0F) {
		    ((Class155) class155).aBool1748
			= (f_1221_ < 0.0F || f_1223_ < 0.0F || f_1219_ < 0.0F
			   || f_1221_ > (float) ((Class155) class155).anInt1733
			   || f_1223_ > (float) ((Class155) class155).anInt1733
			   || (f_1219_
			       > (float) ((Class155) class155).anInt1733));
		    if (f_1267_ < 3.0F) {
			if (f_1267_ > 0.0F) {
			    if (i_1265_ >= 0) {
				int i_1268_ = -16777216;
				if (bool_1266_)
				    i_1268_ = -1694498816;
				class155.method3384
				    (true, true, false, f_1222_, f_1224_,
				     f_1220_, f_1221_, f_1223_, f_1219_,
				     f_1215_, f_1216_, f_1214_, f_1211_,
				     f_1212_, f_1210_, 1.0F, 0.0F, 1.0F, 1.0F,
				     1.0F, 0.0F,
				     i_1268_ | (((Class201) class201).anInt2404
						& 0xffffff),
				     i_1268_ | (((Class201) class201).anInt2405
						& 0xffffff),
				     i_1268_ | (((Class201) class201).anInt2401
						& 0xffffff),
				     (((Class189) class189).anInt2215
				      * -338296791),
				     f_1207_ * 255.0F, f_1208_ * 255.0F,
				     f_1206_ * 255.0F,
				     ((Class201) class201).aShort2411 & 0xffff,
				     i_1265_);
			    } else {
				if (bool_1266_)
				    ((Class155) class155).anInt1723 = 100;
				class155.method3385
				    (true, true, false, f_1222_, f_1224_,
				     f_1220_, f_1221_, f_1223_, f_1219_,
				     f_1215_, f_1216_, f_1214_,
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2404,
				       ((int) (f_1207_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       -438725145)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2405,
				       ((int) (f_1208_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       1792430117)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2401,
				       ((int) (f_1206_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       1448734479)));
				((Class155) class155).anInt1723 = 0;
			    }
			} else if (i_1265_ >= 0) {
			    int i_1269_ = -16777216;
			    if (bool_1266_)
				i_1269_ = -1694498816;
			    class155.method3384
				(true, true, false, f_1222_, f_1224_, f_1220_,
				 f_1221_, f_1223_, f_1219_, f_1215_, f_1216_,
				 f_1214_, f_1211_, f_1212_, f_1210_, 1.0F,
				 0.0F, 1.0F, 1.0F, 1.0F, 0.0F,
				 i_1269_ | (((Class201) class201).anInt2404
					    & 0xffffff),
				 i_1269_ | (((Class201) class201).anInt2405
					    & 0xffffff),
				 i_1269_ | (((Class201) class201).anInt2401
					    & 0xffffff),
				 0, 0.0F, 0.0F, 0.0F,
				 ((Class201) class201).aShort2411 & 0xffff,
				 i_1265_);
			} else {
			    if (bool_1266_)
				((Class155) class155).anInt1723 = 100;
			    class155.method3385
				(true, true, false, f_1222_, f_1224_, f_1220_,
				 f_1221_, f_1223_, f_1219_, f_1215_, f_1216_,
				 f_1214_, ((Class201) class201).anInt2404,
				 ((Class201) class201).anInt2405,
				 ((Class201) class201).anInt2401);
			    ((Class155) class155).anInt1723 = 0;
			}
		    } else
			class155.method3377(true, true, false, f_1222_,
					    f_1224_, f_1220_, f_1221_, f_1223_,
					    f_1219_, f_1215_, f_1216_, f_1214_,
					    (((Class189) class189).anInt2215
					     * -338296791));
		}
		f_1267_ = f + f_1206_ + f_1208_;
		if (((f_1217_ - f_1219_) * (f_1224_ - f_1220_)
		     - (f_1218_ - f_1220_) * (f_1223_ - f_1219_))
		    > 0.0F) {
		    ((Class155) class155).aBool1748
			= (f_1217_ < 0.0F || f_1219_ < 0.0F || f_1223_ < 0.0F
			   || f_1217_ > (float) ((Class155) class155).anInt1733
			   || f_1219_ > (float) ((Class155) class155).anInt1733
			   || (f_1223_
			       > (float) ((Class155) class155).anInt1733));
		    if (f_1267_ < 3.0F) {
			if (bool_1266_)
			    ((Class155) class155).anInt1723 = -1694498816;
			if (f_1267_ > 0.0F) {
			    if (i_1265_ >= 0) {
				int i_1270_ = -16777216;
				if (bool_1266_)
				    i_1270_ = -1694498816;
				class155.method3384
				    (true, true, false, f_1218_, f_1220_,
				     f_1224_, f_1217_, f_1219_, f_1223_,
				     f_1213_, f_1214_, f_1216_, f_1209_,
				     f_1210_, f_1212_, 0.0F, 1.0F, 1.0F, 0.0F,
				     0.0F, 1.0F,
				     i_1270_ | (((Class201) class201).anInt2410
						& 0xffffff),
				     i_1270_ | (((Class201) class201).anInt2401
						& 0xffffff),
				     i_1270_ | (((Class201) class201).anInt2405
						& 0xffffff),
				     (((Class189) class189).anInt2215
				      * -338296791),
				     f * 255.0F, f_1206_ * 255.0F,
				     f_1208_ * 255.0F,
				     ((Class201) class201).aShort2411 & 0xffff,
				     i_1265_);
			    } else {
				if (bool_1266_)
				    ((Class155) class155).anInt1723 = 100;
				class155.method3385
				    (true, true, false, f_1218_, f_1220_,
				     f_1224_, f_1217_, f_1219_, f_1223_,
				     f_1213_, f_1214_, f_1216_,
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2410,
				       ((int) (f * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       -1070776686)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2401,
				       ((int) (f_1206_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       -1422793315)),
				     (Class241_Sub18_Sub1.method17140
				      (((Class201) class201).anInt2405,
				       ((int) (f_1208_ * 255.0F) << 24
					| (((Class189) class189).anInt2215
					   * -338296791)),
				       -175669092)));
				((Class155) class155).anInt1723 = 0;
			    }
			} else if (i_1265_ >= 0) {
			    int i_1271_ = -16777216;
			    if (bool_1266_)
				i_1271_ = -1694498816;
			    class155.method3384
				(true, true, false, f_1218_, f_1220_, f_1224_,
				 f_1217_, f_1219_, f_1223_, f_1213_, f_1214_,
				 f_1216_, f_1209_, f_1210_, f_1212_, 0.0F,
				 1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
				 i_1271_ | (((Class201) class201).anInt2410
					    & 0xffffff),
				 i_1271_ | (((Class201) class201).anInt2401
					    & 0xffffff),
				 i_1271_ | (((Class201) class201).anInt2405
					    & 0xffffff),
				 0, 0.0F, 0.0F, 0.0F,
				 ((Class201) class201).aShort2411 & 0xffff,
				 i_1265_);
			} else {
			    if (bool_1266_)
				((Class155) class155).anInt1723 = 100;
			    class155.method3385
				(true, true, false, f_1218_, f_1220_, f_1224_,
				 f_1217_, f_1219_, f_1223_, f_1213_, f_1214_,
				 f_1216_, ((Class201) class201).anInt2410,
				 ((Class201) class201).anInt2401,
				 ((Class201) class201).anInt2405);
			    ((Class155) class155).anInt1723 = 0;
			}
		    } else
			class155.method3377(true, true, false, f_1218_,
					    f_1220_, f_1224_, f_1217_, f_1219_,
					    f_1223_, f_1213_, f_1214_, f_1216_,
					    (((Class189) class189).anInt2215
					     * -338296791));
		}
	    }
	} else {
	    Class183 class183
		= ((Class166_Sub3) this).aClass183ArrayArray9969[i][i_1196_];
	    if (class183 != null) {
		if (i_1201_ != 0) {
		    if ((((Class183) class183).aByte2157 & 0x4) != 0) {
			if ((i_1201_ & 0x1) != 0)
			    return;
		    } else if ((i_1201_ & 0x2) != 0)
			return;
		}
		for (int i_1272_ = 0;
		     i_1272_ < ((Class183) class183).aShort2154; i_1272_++) {
		    int i_1273_
			= (((Class183) class183).aShortArray2156[i_1272_]
			   + (i << anInt2054 * -122333825));
		    int i_1274_
			= ((Class183) class183).aShortArray2153[i_1272_];
		    int i_1275_
			= (((Class183) class183).aShortArray2158[i_1272_]
			   + (i_1196_ << anInt2054 * -122333825));
		    float f = (((Class166_Sub3) this).aFloat9988
			       + ((((Class166_Sub3) this).aFloat9976
				   * (float) i_1273_)
				  + (((Class166_Sub3) this).aFloat9980
				     * (float) i_1274_)
				  + (((Class166_Sub3) this).aFloat9984
				     * (float) i_1275_)));
		    float f_1276_ = (((Class166_Sub3) this).aFloat9974
				     + ((((Class166_Sub3) this).aFloat9977
					 * (float) i_1273_)
					+ (((Class166_Sub3) this).aFloat9989
					   * (float) i_1274_)
					+ (((Class166_Sub3) this).aFloat9985
					   * (float) i_1275_)));
		    if (f < -f_1276_)
			return;
		    float f_1277_
			= (((Class155) class155).aFloat1720
			   + ((Class155) class155).aFloat1732 * f / f_1276_);
		    fs_1200_[i_1272_] = 0.0F;
		    if (bool) {
			float f_1278_ = f - ((Class189) class189).aFloat2213;
			if (f_1278_ > 0.0F) {
			    f_1278_ /= ((Class189) class189).aFloat2214;
			    if (f_1278_ > 1.0F)
				f_1278_ = 1.0F;
			    fs_1200_[i_1272_] = f_1278_;
			    int i_1279_
				= (int) ((float) (((Class183) class183)
						  .aShortArray2159[i_1272_])
					 * f_1278_);
			    if (i_1279_ > 0)
				i_1274_ -= i_1279_;
			}
		    } else if (((Class189) class189).aBool2209) {
			float f_1280_ = f - ((Class189) class189).aFloat2213;
			if (f_1280_ > 0.0F) {
			    fs_1200_[i_1272_]
				= f_1280_ / ((Class189) class189).aFloat2214;
			    if (fs_1200_[i_1272_] > 1.0F)
				fs_1200_[i_1272_] = 1.0F;
			}
		    }
		    float f_1281_ = (((Class166_Sub3) this).aFloat9986
				     + ((((Class166_Sub3) this).aFloat9981
					 * (float) i_1273_)
					+ (((Class166_Sub3) this).aFloat9978
					   * (float) i_1274_)
					+ (((Class166_Sub3) this).aFloat9982
					   * (float) i_1275_)));
		    float f_1282_ = (((Class166_Sub3) this).aFloat9987
				     + ((((Class166_Sub3) this).aFloat9973
					 * (float) i_1273_)
					+ (((Class166_Sub3) this).aFloat9965
					   * (float) i_1274_)
					+ (((Class166_Sub3) this).aFloat9983
					   * (float) i_1275_)));
		    fs[i_1272_] = (((Class155) class155).aFloat1727
				   + (((Class155) class155).aFloat1728
				      * f_1281_ / f_1276_));
		    fs_1197_[i_1272_] = (((Class155) class155).aFloat1731
					 + (((Class155) class155).aFloat1729
					    * f_1282_ / f_1276_));
		    fs_1198_[i_1272_] = f_1277_;
		    fs_1199_[i_1272_] = f_1276_;
		}
		if (((Class183) class183).aShortArray2161 != null) {
		    for (int i_1283_ = 0;
			 i_1283_ < ((Class183) class183).aShort2160;
			 i_1283_++) {
			int i_1284_ = i_1283_ * 3;
			int i_1285_ = i_1284_ + 1;
			int i_1286_ = i_1285_ + 1;
			float f = fs[i_1284_];
			float f_1287_ = fs[i_1285_];
			float f_1288_ = fs[i_1286_];
			float f_1289_ = fs_1197_[i_1284_];
			float f_1290_ = fs_1197_[i_1285_];
			float f_1291_ = fs_1197_[i_1286_];
			float f_1292_ = (fs_1200_[i_1284_] + fs_1200_[i_1285_]
					 + fs_1200_[i_1286_]);
			if (((f - f_1287_) * (f_1291_ - f_1290_)
			     - (f_1289_ - f_1290_) * (f_1288_ - f_1287_))
			    > 0.0F) {
			    ((Class155) class155).aBool1748
				= (f < 0.0F || f_1287_ < 0.0F || f_1288_ < 0.0F
				   || f > (float) (((Class155) class155)
						   .anInt1733)
				   || f_1287_ > (float) (((Class155) class155)
							 .anInt1733)
				   || f_1288_ > (float) (((Class155) class155)
							 .anInt1733));
			    Class101 class101 = null;
			    int i_1293_ = -1;
			    if (((Class183) class183).aShortArray2161[i_1283_]
				!= -1) {
				class101
				    = (((Class166_Sub3) this)
					   .aClass103_Sub2_9962.aClass107_1458
					   .method2680
				       ((((Class183) class183).aShortArray2161
					 [i_1283_]) & 0xffff,
					-36097797));
				i_1293_ = class101.anInt1403 * 218388063;
			    }
			    if (f_1292_ < 3.0F) {
				if (f_1292_ > 0.0F) {
				    if (i_1293_ != -1) {
					int i_1294_ = -16777216;
					if (i_1293_ != -1
					    && method16256(class101.aByte1427))
					    i_1294_ = -1694498816;
					class155.method3384
					    (true, true, false, f_1289_,
					     f_1290_, f_1291_, f, f_1287_,
					     f_1288_, fs_1198_[i_1284_],
					     fs_1198_[i_1285_],
					     fs_1198_[i_1286_],
					     fs_1199_[i_1284_],
					     fs_1199_[i_1285_],
					     fs_1199_[i_1286_],
					     ((float) (((Class183) class183)
						       .aShortArray2156
						       [i_1284_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2156
						       [i_1285_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2156
						       [i_1286_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2158
						       [i_1284_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2158
						       [i_1285_])
					      / (float) (anInt2053
							 * 2039042417)),
					     ((float) (((Class183) class183)
						       .aShortArray2158
						       [i_1286_])
					      / (float) (anInt2053
							 * 2039042417)),
					     i_1294_ | (((Class183) class183)
							.anIntArray2163
							[i_1284_]) & 0xffffff,
					     i_1294_ | (((Class183) class183)
							.anIntArray2163
							[i_1285_]) & 0xffffff,
					     i_1294_ | (((Class183) class183)
							.anIntArray2163
							[i_1286_]) & 0xffffff,
					     (((Class189) class189).anInt2215
					      * -338296791),
					     fs_1200_[i_1284_] * 255.0F,
					     fs_1200_[i_1285_] * 255.0F,
					     fs_1200_[i_1286_] * 255.0F,
					     ((((Class183) class183)
					       .aShortArray2161[i_1283_])
					      & 0xffff),
					     i_1293_);
				    } else if (((((Class183) class183)
						 .anIntArray2163[i_1284_])
						& 0xffffff)
					       != 0) {
					if (i_1293_ != -1
					    && method16256(class101.aByte1427))
					    ((Class155) class155).anInt1723
						= -1694498816;
					class155.method3385
					    (true, true, false, f_1289_,
					     f_1290_, f_1291_, f, f_1287_,
					     f_1288_, fs_1198_[i_1284_],
					     fs_1198_[i_1285_],
					     fs_1198_[i_1286_],
					     (Class241_Sub18_Sub1.method17140
					      ((((Class183) class183)
						.anIntArray2163[i_1284_]),
					       ((int) (fs_1200_[i_1284_]
						       * 255.0F) << 24
						| (((Class189) class189)
						   .anInt2215) * -338296791),
					       -235130394)),
					     (Class241_Sub18_Sub1.method17140
					      ((((Class183) class183)
						.anIntArray2163[i_1285_]),
					       ((int) (fs_1200_[i_1285_]
						       * 255.0F) << 24
						| (((Class189) class189)
						   .anInt2215) * -338296791),
					       797711157)),
					     (Class241_Sub18_Sub1.method17140
					      ((((Class183) class183)
						.anIntArray2163[i_1286_]),
					       ((int) (fs_1200_[i_1286_]
						       * 255.0F) << 24
						| (((Class189) class189)
						   .anInt2215) * -338296791),
					       832125029)));
					((Class155) class155).anInt1723 = 0;
				    }
				} else if (i_1293_ != -1) {
				    int i_1295_ = -16777216;
				    if (i_1293_ != -1
					&& method16256(class101.aByte1427))
					i_1295_ = -1694498816;
				    class155.method3384
					(true, true, false, f_1289_, f_1290_,
					 f_1291_, f, f_1287_, f_1288_,
					 fs_1198_[i_1284_], fs_1198_[i_1285_],
					 fs_1198_[i_1286_], fs_1199_[i_1284_],
					 fs_1199_[i_1285_], fs_1199_[i_1286_],
					 ((float) (((Class183) class183)
						   .aShortArray2156[i_1284_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2156[i_1285_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2156[i_1286_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2158[i_1284_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2158[i_1285_])
					  / (float) (anInt2053 * 2039042417)),
					 ((float) (((Class183) class183)
						   .aShortArray2158[i_1286_])
					  / (float) (anInt2053 * 2039042417)),
					 i_1295_ | ((((Class183) class183)
						     .anIntArray2163[i_1284_])
						    & 0xffffff),
					 i_1295_ | ((((Class183) class183)
						     .anIntArray2163[i_1285_])
						    & 0xffffff),
					 i_1295_ | ((((Class183) class183)
						     .anIntArray2163[i_1286_])
						    & 0xffffff),
					 0, 0.0F, 0.0F, 0.0F,
					 (((Class183) class183).aShortArray2161
					  [i_1283_]) & 0xffff,
					 i_1293_);
				} else if (((((Class183) class183)
					     .anIntArray2163[i_1284_])
					    & 0xffffff)
					   != 0) {
				    if (i_1293_ != -1
					&& method16256(class101.aByte1427))
					((Class155) class155).anInt1723
					    = -1694498816;
				    class155.method3385
					(true, true, false, f_1289_, f_1290_,
					 f_1291_, f, f_1287_, f_1288_,
					 fs_1198_[i_1284_], fs_1198_[i_1285_],
					 fs_1198_[i_1286_],
					 (((Class183) class183).anIntArray2163
					  [i_1284_]),
					 (((Class183) class183).anIntArray2163
					  [i_1285_]),
					 (((Class183) class183).anIntArray2163
					  [i_1286_]));
				    ((Class155) class155).anInt1723 = 0;
				}
			    } else
				class155.method3377(true, true, false, f_1289_,
						    f_1290_, f_1291_, f,
						    f_1287_, f_1288_,
						    fs_1198_[i_1284_],
						    fs_1198_[i_1285_],
						    fs_1198_[i_1286_],
						    (((Class189) class189)
						     .anInt2215) * -338296791);
			}
		    }
		} else {
		    for (int i_1296_ = 0;
			 i_1296_ < ((Class183) class183).aShort2160;
			 i_1296_++) {
			int i_1297_ = i_1296_ * 3;
			int i_1298_ = i_1297_ + 1;
			int i_1299_ = i_1298_ + 1;
			float f = fs[i_1297_];
			float f_1300_ = fs[i_1298_];
			float f_1301_ = fs[i_1299_];
			float f_1302_ = fs_1197_[i_1297_];
			float f_1303_ = fs_1197_[i_1298_];
			float f_1304_ = fs_1197_[i_1299_];
			float f_1305_ = (fs_1200_[i_1297_] + fs_1200_[i_1298_]
					 + fs_1200_[i_1299_]);
			if (((f - f_1300_) * (f_1304_ - f_1303_)
			     - (f_1302_ - f_1303_) * (f_1301_ - f_1300_))
			    > 0.0F) {
			    ((Class155) class155).aBool1748
				= (f < 0.0F || f_1300_ < 0.0F || f_1301_ < 0.0F
				   || f > (float) (((Class155) class155)
						   .anInt1733)
				   || f_1300_ > (float) (((Class155) class155)
							 .anInt1733)
				   || f_1301_ > (float) (((Class155) class155)
							 .anInt1733));
			    if (f_1305_ < 3.0F) {
				if (f_1305_ > 0.0F) {
				    if (((((Class183) class183).anIntArray2163
					  [i_1297_])
					 & 0xffffff)
					!= 0)
					class155.method3385
					    (true, true, false, f_1302_,
					     f_1303_, f_1304_, f, f_1300_,
					     f_1301_, fs_1198_[i_1297_],
					     fs_1198_[i_1298_],
					     fs_1198_[i_1299_],
					     (Class54.method1306
					      ((((Class183) class183)
						.anIntArray2163[i_1297_]),
					       (((Class189) class189).anInt2215
						* -338296791),
					       fs_1200_[i_1297_] * 255.0F,
					       1372221625)),
					     (Class54.method1306
					      ((((Class183) class183)
						.anIntArray2163[i_1298_]),
					       (((Class189) class189).anInt2215
						* -338296791),
					       fs_1200_[i_1298_] * 255.0F,
					       1372221625)),
					     (Class54.method1306
					      ((((Class183) class183)
						.anIntArray2163[i_1299_]),
					       (((Class189) class189).anInt2215
						* -338296791),
					       fs_1200_[i_1299_] * 255.0F,
					       1372221625)));
				} else if (((((Class183) class183)
					     .anIntArray2163[i_1297_])
					    & 0xffffff)
					   != 0)
				    class155.method3385
					(true, true, false, f_1302_, f_1303_,
					 f_1304_, f, f_1300_, f_1301_,
					 fs_1198_[i_1297_], fs_1198_[i_1298_],
					 fs_1198_[i_1299_],
					 (((Class183) class183).anIntArray2163
					  [i_1297_]),
					 (((Class183) class183).anIntArray2163
					  [i_1298_]),
					 (((Class183) class183).anIntArray2163
					  [i_1299_]));
			    } else
				class155.method3377(true, true, false, f_1302_,
						    f_1303_, f_1304_, f,
						    f_1300_, f_1301_,
						    fs_1198_[i_1297_],
						    fs_1198_[i_1298_],
						    fs_1198_[i_1299_],
						    (((Class189) class189)
						     .anInt2215) * -338296791);
			}
		    }
		}
	    }
	}
    }
    
    boolean method16262(int i) {
	if ((((Class166_Sub3) this).anInt9968 & 0x8) == 0)
	    return false;
	if (i == 4)
	    return true;
	if (i == 8)
	    return true;
	if (i == 9)
	    return true;
	return false;
    }
    
    public void method3576(int i, int i_1306_, int i_1307_, int i_1308_,
			   int i_1309_, int i_1310_, int i_1311_,
			   boolean[][] bools) {
	Class189 class189 = ((Class166_Sub3) this).aClass103_Sub2_9962
				.method15377(Thread.currentThread());
	Class155 class155 = ((Class189) class189).aClass155_2223;
	((Class155) class155).anInt1723 = 0;
	((Class155) class155).aBool1748 = true;
	((Class166_Sub3) this).aClass103_Sub2_9962.method15424();
	if (((Class166_Sub3) this).aClass201ArrayArray9967 != null
	    || ((Class166_Sub3) this).aClass143ArrayArray9979 != null)
	    method16246(i, i_1306_, i_1307_, i_1308_, i_1309_, i_1310_,
			i_1311_, bools, class189, class155,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211);
	else if (((Class166_Sub3) this).aClass182ArrayArray9975 != null)
	    method16245(i, i_1306_, i_1307_, i_1308_, i_1309_, i_1310_,
			i_1311_, bools, class189, class155,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211);
    }
    
    public void method3566(int i, int i_1312_, int i_1313_, int i_1314_,
			   int i_1315_, int i_1316_, int i_1317_,
			   boolean[][] bools) {
	Class189 class189 = ((Class166_Sub3) this).aClass103_Sub2_9962
				.method15377(Thread.currentThread());
	Class155 class155 = ((Class189) class189).aClass155_2223;
	((Class155) class155).anInt1723 = 0;
	((Class155) class155).aBool1748 = true;
	((Class166_Sub3) this).aClass103_Sub2_9962.method15424();
	if (((Class166_Sub3) this).aClass201ArrayArray9967 != null
	    || ((Class166_Sub3) this).aClass143ArrayArray9979 != null)
	    method16246(i, i_1312_, i_1313_, i_1314_, i_1315_, i_1316_,
			i_1317_, bools, class189, class155,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211);
	else if (((Class166_Sub3) this).aClass182ArrayArray9975 != null)
	    method16245(i, i_1312_, i_1313_, i_1314_, i_1315_, i_1316_,
			i_1317_, bools, class189, class155,
			((Class189) class189).aFloatArray2249,
			((Class189) class189).aFloatArray2211);
    }
    
    public void method3563(int i, int i_1318_, int[] is, int[] is_1319_,
			   int[] is_1320_, int[] is_1321_, int[] is_1322_,
			   int[] is_1323_, int[] is_1324_, int[] is_1325_,
			   int[] is_1326_, int[] is_1327_, int[] is_1328_,
			   Class86 class86, boolean bool) {
	if (((Class166_Sub3) this).aClass182ArrayArray9975 == null) {
	    ((Class166_Sub3) this).aClass182ArrayArray9975
		= new Class182[anInt2055 * 266270313][anInt2052 * -14610189];
	    ((Class166_Sub3) this).aClass205ArrayArray9970
		= new Class205[anInt2055 * 266270313][anInt2052 * -14610189];
	} else if (((Class166_Sub3) this).aClass201ArrayArray9967 != null
		   || ((Class166_Sub3) this).aClass143ArrayArray9979 != null)
	    throw new IllegalStateException();
	boolean bool_1329_ = false;
	if (is_1325_.length == 2 && is_1322_.length == 2
	    && (is_1325_[0] == is_1325_[1]
		|| is_1327_[0] != -1 && is_1327_[0] == is_1327_[1])) {
	    bool_1329_ = true;
	    for (int i_1330_ = 1; i_1330_ < 2; i_1330_++) {
		int i_1331_ = is[is_1322_[i_1330_]];
		int i_1332_ = is_1320_[is_1322_[i_1330_]];
		if (i_1331_ != 0 && i_1331_ != anInt2053 * 2039042417
		    || i_1332_ != 0 && i_1332_ != anInt2053 * 2039042417) {
		    bool_1329_ = false;
		    break;
		}
	    }
	}
	if (!bool_1329_) {
	    Class205 class205 = new Class205();
	    short i_1333_ = (short) is.length;
	    int i_1334_ = (short) is_1325_.length;
	    ((Class205) class205).aShort2431 = i_1333_;
	    ((Class205) class205).aShortArray2436 = new short[i_1333_];
	    ((Class205) class205).aShortArray2433 = new short[i_1333_];
	    ((Class205) class205).aShortArray2439 = new short[i_1333_];
	    ((Class205) class205).aShortArray2438 = new short[i_1333_];
	    for (int i_1335_ = 0; i_1335_ < i_1333_; i_1335_++) {
		int i_1336_ = is[i_1335_];
		int i_1337_ = is_1320_[i_1335_];
		if (i_1336_ == 0 && i_1337_ == 0)
		    ((Class205) class205).aShortArray2436[i_1335_]
			= (short) ((((Class166_Sub3) this).aByteArrayArray9990
				    [i][i_1318_])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i][i_1318_]));
		else if (i_1336_ == 0 && i_1337_ == anInt2053 * 2039042417)
		    ((Class205) class205).aShortArray2436[i_1335_]
			= (short) ((((Class166_Sub3) this).aByteArrayArray9990
				    [i][i_1318_ + 1])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i][i_1318_ + 1]));
		else if (i_1336_ == anInt2053 * 2039042417
			 && i_1337_ == anInt2053 * 2039042417)
		    ((Class205) class205).aShortArray2436[i_1335_]
			= (short) ((((Class166_Sub3) this).aByteArrayArray9990
				    [i + 1][i_1318_ + 1])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i + 1]
				      [i_1318_ + 1]));
		else if (i_1336_ == anInt2053 * 2039042417 && i_1337_ == 0)
		    ((Class205) class205).aShortArray2436[i_1335_]
			= (short) ((((Class166_Sub3) this).aByteArrayArray9990
				    [i + 1][i_1318_])
				   - (((Class166_Sub3) this)
				      .aByteArrayArray9991[i + 1][i_1318_]));
		else {
		    int i_1338_
			= (((((Class166_Sub3) this).aByteArrayArray9990[i]
			     [i_1318_])
			    - (((Class166_Sub3) this).aByteArrayArray9991[i]
			       [i_1318_])) * (anInt2053 * 2039042417 - i_1336_)
			   + ((((Class166_Sub3) this).aByteArrayArray9990
			       [i + 1][i_1318_])
			      - (((Class166_Sub3) this).aByteArrayArray9991
				 [i + 1][i_1318_])) * i_1336_);
		    int i_1339_
			= ((((((Class166_Sub3) this).aByteArrayArray9990[i]
			      [i_1318_ + 1])
			     - (((Class166_Sub3) this).aByteArrayArray9991[i]
				[i_1318_ + 1]))
			    * (anInt2053 * 2039042417 - i_1336_))
			   + ((((Class166_Sub3) this).aByteArrayArray9990
			       [i + 1][i_1318_ + 1])
			      - (((Class166_Sub3) this).aByteArrayArray9991
				 [i + 1][i_1318_ + 1])) * i_1336_);
		    ((Class205) class205).aShortArray2436[i_1335_]
			= (short) (i_1338_ * (anInt2053 * 2039042417
					      - i_1337_) + i_1339_ * i_1337_
				   >> anInt2054 * -244667650);
		}
		int i_1340_ = (i << anInt2054 * -122333825) + i_1336_;
		int i_1341_ = (i_1318_ << anInt2054 * -122333825) + i_1337_;
		((Class205) class205).aShortArray2433[i_1335_]
		    = (short) i_1336_;
		((Class205) class205).aShortArray2438[i_1335_]
		    = (short) i_1337_;
		((Class205) class205).aShortArray2439[i_1335_]
		    = (short) (method3574(i_1340_, i_1341_, -2010550206)
			       + (is_1319_ != null ? is_1319_[i_1335_] : 0));
		if (((Class205) class205).aShortArray2436[i_1335_] < 2)
		    ((Class205) class205).aShortArray2436[i_1335_] = (short) 2;
	    }
	    boolean bool_1342_ = false;
	    int i_1343_ = 0;
	    for (int i_1344_ = 0; i_1344_ < i_1334_; i_1344_++) {
		if (is_1325_[i_1344_] >= 0
		    || is_1326_ != null && is_1326_[i_1344_] >= 0)
		    i_1343_++;
		int i_1345_ = is_1327_[i_1344_];
		if (i_1345_ != -1) {
		    Class101 class101
			= ((Class166_Sub3) this).aClass103_Sub2_9962
			      .aClass107_1458.method2680(i_1345_, 473185593);
		    if (!class101.aBool1434) {
			bool_1342_ = true;
			if (method16256(class101.aByte1427)
			    || class101.aByte1376 != 0
			    || class101.aByte1396 != 0)
			    ((Class205) class205).aByte2432 |= 0x4;
		    }
		}
	    }
	    ((Class205) class205).anIntArray2442 = new int[i_1343_];
	    if (is_1326_ != null)
		((Class205) class205).anIntArray2435 = new int[i_1343_];
	    ((Class205) class205).aShortArray2437 = new short[i_1343_];
	    ((Class205) class205).aShortArray2430 = new short[i_1343_];
	    ((Class205) class205).aShortArray2443 = new short[i_1343_];
	    if (bool_1342_) {
		((Class205) class205).aShortArray2440 = new short[i_1343_];
		((Class205) class205).aShortArray2434 = new short[i_1343_];
	    }
	    for (int i_1346_ = 0; i_1346_ < i_1334_; i_1346_++) {
		if (is_1325_[i_1346_] >= 0
		    || is_1326_ != null && is_1326_[i_1346_] >= 0) {
		    if (is_1325_[i_1346_] >= 0)
			((Class205) class205).anIntArray2442
			    [((Class205) class205).aShort2441]
			    = Class241_Sub42.method16451(is_1325_[i_1346_],
							 150394818);
		    else
			((Class205) class205).anIntArray2442
			    [((Class205) class205).aShort2441]
			    = -1;
		    if (is_1326_ != null) {
			if (is_1326_[i_1346_] != -1)
			    ((Class205) class205).anIntArray2435
				[((Class205) class205).aShort2441]
				= Class241_Sub42.method16451(is_1326_[i_1346_],
							     245220819);
			else
			    ((Class205) class205).anIntArray2435
				[((Class205) class205).aShort2441]
				= -1;
		    }
		    ((Class205) class205).aShortArray2437
			[((Class205) class205).aShort2441]
			= (short) is_1322_[i_1346_];
		    ((Class205) class205).aShortArray2430
			[((Class205) class205).aShort2441]
			= (short) is_1323_[i_1346_];
		    ((Class205) class205).aShortArray2443
			[((Class205) class205).aShort2441]
			= (short) is_1324_[i_1346_];
		    if (bool_1342_) {
			if (is_1327_[i_1346_] != -1
			    && !(((Class166_Sub3) this).aClass103_Sub2_9962
				     .aClass107_1458.method2680
				 (is_1327_[i_1346_], -274735500).aBool1434)) {
			    ((Class205) class205).aShortArray2440
				[((Class205) class205).aShort2441]
				= (short) is_1327_[i_1346_];
			    ((Class205) class205).aShortArray2434
				[((Class205) class205).aShort2441]
				= (short) is_1328_[i_1346_];
			} else
			    ((Class205) class205).aShortArray2440
				[((Class205) class205).aShort2441]
				= (short) -1;
		    }
		    ((Class205) class205).aShort2441++;
		}
	    }
	    ((Class166_Sub3) this).aClass205ArrayArray9970[i][i_1318_]
		= class205;
	} else if (is_1325_[0] >= 0 || is_1326_ != null && is_1326_[0] >= 0) {
	    Class182 class182 = new Class182();
	    int i_1347_ = is_1325_[0];
	    int i_1348_ = is_1327_[0];
	    if (is_1326_ != null) {
		((Class182) class182).anInt2151
		    = (Class639.method13606
		       (Class241_Sub42.method16451(is_1326_[0], 200501243),
			(((Class166_Sub3) this).aByteArrayArray9990[i][i_1318_]
			 - (((Class166_Sub3) this).aByteArrayArray9991[i]
			    [i_1318_])),
			-1821984539));
		if (i_1347_ == -1)
		    ((Class182) class182).aByte2150 |= 0x2;
	    }
	    if ((anIntArrayArray2051[i][i_1318_]
		 == anIntArrayArray2051[i + 1][i_1318_])
		&& (anIntArrayArray2051[i][i_1318_]
		    == anIntArrayArray2051[i + 1][i_1318_ + 1])
		&& (anIntArrayArray2051[i][i_1318_]
		    == anIntArrayArray2051[i][i_1318_ + 1]))
		((Class182) class182).aByte2150 |= 0x1;
	    Class101 class101 = null;
	    if (i_1348_ != -1)
		class101 = ((Class166_Sub3) this).aClass103_Sub2_9962
			       .aClass107_1458.method2680(i_1348_, -333601853);
	    if (class101 != null
		&& (((Class182) class182).aByte2150 & 0x2) == 0
		&& !class101.aBool1434) {
		((Class182) class182).aShort2146
		    = (short) ((((Class166_Sub3) this).aByteArrayArray9990[i]
				[i_1318_])
			       - (((Class166_Sub3) this).aByteArrayArray9991[i]
				  [i_1318_]));
		((Class182) class182).aShort2148
		    = (short) ((((Class166_Sub3) this).aByteArrayArray9990
				[i + 1][i_1318_])
			       - (((Class166_Sub3) this).aByteArrayArray9991
				  [i + 1][i_1318_]));
		((Class182) class182).aShort2147
		    = (short) ((((Class166_Sub3) this).aByteArrayArray9990
				[i + 1][i_1318_ + 1])
			       - (((Class166_Sub3) this).aByteArrayArray9991
				  [i + 1][i_1318_ + 1]));
		((Class182) class182).aShort2152
		    = (short) ((((Class166_Sub3) this).aByteArrayArray9990[i]
				[i_1318_ + 1])
			       - (((Class166_Sub3) this).aByteArrayArray9991[i]
				  [i_1318_ + 1]));
		((Class182) class182).aShort2149 = (short) i_1348_;
		if (method16256(class101.aByte1427) || class101.aByte1376 != 0
		    || class101.aByte1396 != 0)
		    ((Class182) class182).aByte2150 |= 0x4;
	    } else {
		short i_1349_
		    = Class241_Sub42.method16451(i_1347_, -348027092);
		((Class182) class182).aShort2146
		    = (short) Class639.method13606(i_1349_,
						   ((((Class166_Sub3) this)
						     .aByteArrayArray9990[i]
						     [i_1318_])
						    - (((Class166_Sub3) this)
						       .aByteArrayArray9991[i]
						       [i_1318_])),
						   434515800);
		((Class182) class182).aShort2148
		    = (short) Class639.method13606(i_1349_,
						   ((((Class166_Sub3) this)
						     .aByteArrayArray9990
						     [i + 1][i_1318_])
						    - (((Class166_Sub3) this)
						       .aByteArrayArray9991
						       [i + 1][i_1318_])),
						   79945807);
		((Class182) class182).aShort2147
		    = (short) Class639.method13606(i_1349_,
						   ((((Class166_Sub3) this)
						     .aByteArrayArray9990
						     [i + 1][i_1318_ + 1])
						    - (((Class166_Sub3) this)
						       .aByteArrayArray9991
						       [i + 1][i_1318_ + 1])),
						   -323423027);
		((Class182) class182).aShort2152
		    = (short) Class639.method13606(i_1349_,
						   ((((Class166_Sub3) this)
						     .aByteArrayArray9990[i]
						     [i_1318_ + 1])
						    - (((Class166_Sub3) this)
						       .aByteArrayArray9991[i]
						       [i_1318_ + 1])),
						   -203942408);
		((Class182) class182).aShort2149 = (short) -1;
	    }
	    ((Class166_Sub3) this).aClass182ArrayArray9975[i][i_1318_]
		= class182;
	}
    }
    
    void method16263(int i, int i_1350_, int i_1351_, int i_1352_, int i_1353_,
		     int i_1354_, int i_1355_, boolean[][] bools,
		     Class189 class189, Class155 class155, float[] fs,
		     float[] fs_1356_) {
	int i_1357_ = (i_1355_ - i_1353_) * i_1351_ / 256;
	int i_1358_ = i_1351_ >> 8;
	boolean bool = ((Class189) class189).aBool2220;
	((Class166_Sub3) this).aClass103_Sub2_9962.method2308(false);
	((Class155) class155).aBool1721 = false;
	((Class155) class155).aBool1722 = false;
	int i_1359_ = i;
	int i_1360_ = i_1350_ + i_1357_;
	for (int i_1361_ = i_1352_; i_1361_ < i_1354_; i_1361_++) {
	    for (int i_1362_ = i_1353_; i_1362_ < i_1355_; i_1362_++) {
		if (bools[i_1361_ - i_1352_][i_1362_ - i_1353_]) {
		    if ((((Class166_Sub3) this).aClass182ArrayArray9975
			 [i_1361_][i_1362_])
			!= null) {
			Class182 class182
			    = (((Class166_Sub3) this).aClass182ArrayArray9975
			       [i_1361_][i_1362_]);
			if (((Class182) class182).aShort2149 != -1
			    && (((Class182) class182).aByte2150 & 0x2) == 0
			    && ((Class182) class182).anInt2151 == -1) {
			    int i_1363_ = (((Class166_Sub3) this)
					       .aClass103_Sub2_9962.method15368
					   (((Class182) class182).aShort2149
					    & 0xffff));
			    class155.method3380
				(true, true, false,
				 (float) (i_1360_ - i_1358_),
				 (float) (i_1360_ - i_1358_), (float) i_1360_,
				 (float) (i_1359_ + i_1358_), (float) i_1359_,
				 (float) (i_1359_ + i_1358_), 100.0F, 100.0F,
				 100.0F,
				 (float) Class639.method13606(i_1363_,
							      ((((Class182)
								 class182)
								.aShort2147)
							       & 0xffff),
							      837257006),
				 (float) Class639.method13606(i_1363_,
							      ((((Class182)
								 class182)
								.aShort2152)
							       & 0xffff),
							      -1283780246),
				 (float) Class639.method13606(i_1363_,
							      ((((Class182)
								 class182)
								.aShort2148)
							       & 0xffff),
							      1765981881));
			    class155.method3380
				(true, true, false, (float) i_1360_,
				 (float) i_1360_, (float) (i_1360_ - i_1358_),
				 (float) i_1359_, (float) (i_1359_ + i_1358_),
				 (float) i_1359_, 100.0F, 100.0F, 100.0F,
				 (float) Class639.method13606(i_1363_,
							      ((((Class182)
								 class182)
								.aShort2146)
							       & 0xffff),
							      -1814005921),
				 (float) Class639.method13606(i_1363_,
							      ((((Class182)
								 class182)
								.aShort2148)
							       & 0xffff),
							      -1291584139),
				 (float) Class639.method13606(i_1363_,
							      ((((Class182)
								 class182)
								.aShort2152)
							       & 0xffff),
							      -495215551));
			} else if (((Class182) class182).anInt2151 == -1) {
			    class155.method3380
				(true, true, false,
				 (float) (i_1360_ - i_1358_),
				 (float) (i_1360_ - i_1358_), (float) i_1360_,
				 (float) (i_1359_ + i_1358_), (float) i_1359_,
				 (float) (i_1359_ + i_1358_), 100.0F, 100.0F,
				 100.0F,
				 (float) (((Class182) class182).aShort2147
					  & 0xffff),
				 (float) (((Class182) class182).aShort2152
					  & 0xffff),
				 (float) (((Class182) class182).aShort2148
					  & 0xffff));
			    class155.method3380
				(true, true, false, (float) i_1360_,
				 (float) i_1360_, (float) (i_1360_ - i_1358_),
				 (float) i_1359_, (float) (i_1359_ + i_1358_),
				 (float) i_1359_, 100.0F, 100.0F, 100.0F,
				 (float) (((Class182) class182).aShort2146
					  & 0xffff),
				 (float) (((Class182) class182).aShort2148
					  & 0xffff),
				 (float) (((Class182) class182).aShort2152
					  & 0xffff));
			} else {
			    int i_1364_ = ((Class182) class182).anInt2151;
			    class155.method3380(true, true, false,
						(float) (i_1360_ - i_1358_),
						(float) (i_1360_ - i_1358_),
						(float) i_1360_,
						(float) (i_1359_ + i_1358_),
						(float) i_1359_,
						(float) (i_1359_ + i_1358_),
						100.0F, 100.0F, 100.0F,
						(float) i_1364_,
						(float) i_1364_,
						(float) i_1364_);
			    class155.method3380(true, true, false,
						(float) i_1360_,
						(float) i_1360_,
						(float) (i_1360_ - i_1358_),
						(float) i_1359_,
						(float) (i_1359_ + i_1358_),
						(float) i_1359_, 100.0F,
						100.0F, 100.0F,
						(float) i_1364_,
						(float) i_1364_,
						(float) i_1364_);
			}
		    } else if ((((Class166_Sub3) this).aClass205ArrayArray9970
				[i_1361_][i_1362_])
			       != null) {
			Class205 class205
			    = (((Class166_Sub3) this).aClass205ArrayArray9970
			       [i_1361_][i_1362_]);
			for (int i_1365_ = 0;
			     i_1365_ < ((Class205) class205).aShort2431;
			     i_1365_++) {
			    fs[i_1365_]
				= (float) (i_1359_
					   + ((((Class205) class205)
					       .aShortArray2433[i_1365_])
					      * i_1358_
					      / (anInt2053 * 2039042417)));
			    fs_1356_[i_1365_]
				= (float) (i_1360_
					   - ((((Class205) class205)
					       .aShortArray2438[i_1365_])
					      * i_1358_
					      / (anInt2053 * 2039042417)));
			}
			for (int i_1366_ = 0;
			     i_1366_ < ((Class205) class205).aShort2441;
			     i_1366_++) {
			    short i_1367_ = (((Class205) class205)
					     .aShortArray2437[i_1366_]);
			    short i_1368_ = (((Class205) class205)
					     .aShortArray2430[i_1366_]);
			    short i_1369_ = (((Class205) class205)
					     .aShortArray2443[i_1366_]);
			    float f = fs[i_1367_];
			    float f_1370_ = fs[i_1368_];
			    float f_1371_ = fs[i_1369_];
			    float f_1372_ = fs_1356_[i_1367_];
			    float f_1373_ = fs_1356_[i_1368_];
			    float f_1374_ = fs_1356_[i_1369_];
			    if (((Class205) class205).anIntArray2435 != null
				&& (((Class205) class205).anIntArray2435
				    [i_1366_]) != -1) {
				int i_1375_ = (((Class205) class205)
					       .anIntArray2435[i_1366_]);
				class155.method3380
				    (true, true, false, f_1372_, f_1373_,
				     f_1374_, f, f_1370_, f_1371_, 100.0F,
				     100.0F, 100.0F,
				     (float) (Class639.method13606
					      (i_1375_,
					       (((Class205) class205)
						.aShortArray2436[i_1367_]),
					       2039853608)),
				     (float) (Class639.method13606
					      (i_1375_,
					       (((Class205) class205)
						.aShortArray2436[i_1368_]),
					       230009171)),
				     (float) (Class639.method13606
					      (i_1375_,
					       (((Class205) class205)
						.aShortArray2436[i_1369_]),
					       986996774)));
			    } else if ((((Class205) class205).aShortArray2440
					!= null)
				       && (((Class205) class205)
					   .aShortArray2440[i_1366_]) != -1) {
				int i_1376_
				    = (((Class166_Sub3) this)
					   .aClass103_Sub2_9962.method15368
				       ((((Class205) class205).aShortArray2440
					 [i_1366_]) & 0xffff));
				class155.method3380
				    (true, true, false, f_1372_, f_1373_,
				     f_1374_, f, f_1370_, f_1371_, 100.0F,
				     100.0F, 100.0F,
				     (float) (Class639.method13606
					      (i_1376_,
					       (((Class205) class205)
						.aShortArray2436[i_1367_]),
					       -881870932)),
				     (float) (Class639.method13606
					      (i_1376_,
					       (((Class205) class205)
						.aShortArray2436[i_1368_]),
					       671890204)),
				     (float) (Class639.method13606
					      (i_1376_,
					       (((Class205) class205)
						.aShortArray2436[i_1369_]),
					       1310578824)));
			    } else {
				int i_1377_ = (((Class205) class205)
					       .anIntArray2442[i_1366_]);
				class155.method3380
				    (true, true, false, f_1372_, f_1373_,
				     f_1374_, f, f_1370_, f_1371_, 100.0F,
				     100.0F, 100.0F,
				     (float) (Class639.method13606
					      (i_1377_,
					       (((Class205) class205)
						.aShortArray2436[i_1367_]),
					       1516417002)),
				     (float) (Class639.method13606
					      (i_1377_,
					       (((Class205) class205)
						.aShortArray2436[i_1368_]),
					       1902662297)),
				     (float) (Class639.method13606
					      (i_1377_,
					       (((Class205) class205)
						.aShortArray2436[i_1369_]),
					       -1419924890)));
			    }
			}
		    }
		}
		i_1360_ -= i_1358_;
	    }
	    i_1360_ = i_1350_ + i_1357_;
	    i_1359_ += i_1358_;
	}
	((Class155) class155).aBool1721 = true;
	((Class166_Sub3) this).aClass103_Sub2_9962.method2308(bool);
    }
    
    void method16264(int i, int i_1378_, boolean bool, Class189 class189,
		     Class155 class155, float[] fs, float[] fs_1379_,
		     float[] fs_1380_, float[] fs_1381_, float[] fs_1382_,
		     int i_1383_) {
	Class143 class143
	    = ((Class166_Sub3) this).aClass143ArrayArray9979[i][i_1378_];
	if (i_1383_ == 0 || (i_1383_ & 0x2) == 0) {
	    if (class143 != null) {
		for (int i_1384_ = 0;
		     i_1384_ < ((Class143) class143).aShort1669; i_1384_++) {
		    int i_1385_
			= (((Class143) class143).aShortArray1666[i_1384_]
			   + (i << anInt2054 * -122333825));
		    int i_1386_
			= ((Class143) class143).aShortArray1667[i_1384_];
		    int i_1387_
			= (((Class143) class143).aShortArray1664[i_1384_]
			   + (i_1378_ << anInt2054 * -122333825));
		    float f = (((Class166_Sub3) this).aFloat9988
			       + ((((Class166_Sub3) this).aFloat9976
				   * (float) i_1385_)
				  + (((Class166_Sub3) this).aFloat9980
				     * (float) i_1386_)
				  + (((Class166_Sub3) this).aFloat9984
				     * (float) i_1387_)));
		    float f_1388_ = (((Class166_Sub3) this).aFloat9974
				     + ((((Class166_Sub3) this).aFloat9977
					 * (float) i_1385_)
					+ (((Class166_Sub3) this).aFloat9989
					   * (float) i_1386_)
					+ (((Class166_Sub3) this).aFloat9985
					   * (float) i_1387_)));
		    if (f < -f_1388_)
			return;
		    fs_1382_[i_1384_] = 0.0F;
		    if (bool) {
			float f_1389_ = f - ((Class189) class189).aFloat2213;
			if (f_1389_ > 0.0F) {
			    f_1389_ /= ((Class189) class189).aFloat2214;
			    if (f_1389_ > 1.0F)
				f_1389_ = 1.0F;
			    fs_1382_[i_1384_] = f_1389_;
			    int i_1390_
				= (int) ((float) (((Class143) class143)
						  .aShortArray1673[i_1384_])
					 * f_1389_);
			    if (i_1390_ > 0)
				i_1386_ -= i_1390_;
			}
		    } else if (((Class189) class189).aBool2209) {
			float f_1391_ = f - ((Class189) class189).aFloat2213;
			if (f_1391_ > 0.0F) {
			    fs_1382_[i_1384_]
				= f_1391_ / ((Class189) class189).aFloat2214;
			    if (fs_1382_[i_1384_] > 1.0F)
				fs_1382_[i_1384_] = 1.0F;
			}
		    }
		    float f_1392_ = (((Class166_Sub3) this).aFloat9986
				     + ((((Class166_Sub3) this).aFloat9981
					 * (float) i_1385_)
					+ (((Class166_Sub3) this).aFloat9978
					   * (float) i_1386_)
					+ (((Class166_Sub3) this).aFloat9982
					   * (float) i_1387_)));
		    float f_1393_ = (((Class166_Sub3) this).aFloat9987
				     + ((((Class166_Sub3) this).aFloat9973
					 * (float) i_1385_)
					+ (((Class166_Sub3) this).aFloat9965
					   * (float) i_1386_)
					+ (((Class166_Sub3) this).aFloat9983
					   * (float) i_1387_)));
		    fs[i_1384_] = (((Class155) class155).aFloat1727
				   + (((Class155) class155).aFloat1728
				      * f_1392_ / f_1388_));
		    fs_1379_[i_1384_] = (((Class155) class155).aFloat1731
					 + (((Class155) class155).aFloat1729
					    * f_1393_ / f_1388_));
		    fs_1380_[i_1384_]
			= (((Class155) class155).aFloat1720
			   + ((Class155) class155).aFloat1732 * f / f_1388_);
		    fs_1381_[i_1384_] = f_1388_;
		}
		float f = (float) (anInt2053 * 2039042417);
		for (int i_1394_ = 0;
		     i_1394_ < ((Class143) class143).aShort1668; i_1394_++) {
		    int i_1395_ = i_1394_ * 3;
		    int i_1396_ = i_1395_ + 1;
		    int i_1397_ = i_1396_ + 1;
		    float f_1398_ = fs[i_1395_];
		    float f_1399_ = fs[i_1396_];
		    float f_1400_ = fs[i_1397_];
		    float f_1401_ = fs_1379_[i_1395_];
		    float f_1402_ = fs_1379_[i_1396_];
		    float f_1403_ = fs_1379_[i_1397_];
		    if (((f_1398_ - f_1399_) * (f_1403_ - f_1402_)
			 - (f_1401_ - f_1402_) * (f_1400_ - f_1399_))
			> 0.0F) {
			((Class155) class155).aBool1748
			    = (f_1398_ < 0.0F || f_1399_ < 0.0F
			       || f_1400_ < 0.0F
			       || (f_1398_
				   > (float) ((Class155) class155).anInt1733)
			       || (f_1399_
				   > (float) ((Class155) class155).anInt1733)
			       || (f_1400_
				   > (float) ((Class155) class155).anInt1733));
			if ((fs_1382_[i_1395_] + fs_1382_[i_1396_]
			     + fs_1382_[i_1397_])
			    < 3.0F) {
			    int i_1404_ = i << anInt2054 * -122333825;
			    int i_1405_ = i_1378_ << anInt2054 * -122333825;
			    if ((((Class143) class143).anIntArray1672[i_1395_]
				 & 0xffffff)
				!= 0) {
				if ((((Class143) class143).aShortArray1670
				     [i_1395_]) != -1
				    && (((Class143) class143).aShortArray1670
					[i_1396_]) != -1
				    && (((Class143) class143).aShortArray1670
					[i_1397_]) != -1) {
				    if (((((Class143) class143).aShortArray1670
					  [i_1395_])
					 == (((Class143) class143)
					     .aShortArray1670[i_1396_]))
					&& ((((Class143) class143)
					     .aShortArray1670[i_1395_])
					    == (((Class143) class143)
						.aShortArray1670[i_1397_]))
					&& ((((Class143) class143)
					     .aShortArray1671[i_1395_])
					    == (((Class143) class143)
						.aShortArray1671[i_1396_]))
					&& ((((Class143) class143)
					     .aShortArray1671[i_1395_])
					    == (((Class143) class143)
						.aShortArray1671[i_1397_])))
					class155.method3384
					    (true, true, false, f_1401_,
					     f_1402_, f_1403_, f_1398_,
					     f_1399_, f_1400_,
					     fs_1380_[i_1395_],
					     fs_1380_[i_1396_],
					     fs_1380_[i_1397_],
					     fs_1381_[i_1395_],
					     fs_1381_[i_1396_],
					     fs_1381_[i_1397_],
					     ((float) (i_1404_
						       + (((Class143) class143)
							  .aShortArray1666
							  [i_1395_]))
					      / (float) (((Class143) class143)
							 .aShortArray1671
							 [i_1395_])),
					     ((float) (i_1404_
						       + (((Class143) class143)
							  .aShortArray1666
							  [i_1396_]))
					      / (float) (((Class143) class143)
							 .aShortArray1671
							 [i_1396_])),
					     ((float) (i_1404_
						       + (((Class143) class143)
							  .aShortArray1666
							  [i_1397_]))
					      / (float) (((Class143) class143)
							 .aShortArray1671
							 [i_1397_])),
					     ((float) (i_1405_
						       + (((Class143) class143)
							  .aShortArray1664
							  [i_1395_]))
					      / (float) (((Class143) class143)
							 .aShortArray1671
							 [i_1395_])),
					     ((float) (i_1405_
						       + (((Class143) class143)
							  .aShortArray1664
							  [i_1396_]))
					      / (float) (((Class143) class143)
							 .aShortArray1671
							 [i_1396_])),
					     ((float) (i_1405_
						       + (((Class143) class143)
							  .aShortArray1664
							  [i_1397_]))
					      / (float) (((Class143) class143)
							 .aShortArray1671
							 [i_1397_])),
					     (((Class143) class143)
					      .anIntArray1672[i_1395_]),
					     (((Class143) class143)
					      .anIntArray1672[i_1396_]),
					     (((Class143) class143)
					      .anIntArray1672[i_1397_]),
					     (((Class189) class189).anInt2215
					      * -338296791),
					     fs_1382_[i_1395_] * 255.0F,
					     fs_1382_[i_1396_] * 255.0F,
					     fs_1382_[i_1397_] * 255.0F,
					     ((((Class143) class143)
					       .aShortArray1670[i_1395_])
					      & 0xffff),
					     (((Class166_Sub3) this)
						  .aClass103_Sub2_9962
						  .aClass107_1458.method2680
					      (((((Class143) class143)
						 .aShortArray1670[i_1395_])
						& 0xffff),
					       -1385942190)
					      .anInt1403) * 218388063);
				    else
					class155.method3369
					    (true, true, false, f_1401_,
					     f_1402_, f_1403_, f_1398_,
					     f_1399_, f_1400_,
					     fs_1380_[i_1395_],
					     fs_1380_[i_1396_],
					     fs_1380_[i_1397_],
					     fs_1381_[i_1395_],
					     fs_1381_[i_1396_],
					     fs_1381_[i_1397_],
					     (float) (i_1404_
						      + (((Class143) class143)
							 .aShortArray1666
							 [i_1395_])) / f,
					     (float) (i_1404_
						      + (((Class143) class143)
							 .aShortArray1666
							 [i_1396_])) / f,
					     (float) (i_1404_
						      + (((Class143) class143)
							 .aShortArray1666
							 [i_1397_])) / f,
					     (float) (i_1405_
						      + (((Class143) class143)
							 .aShortArray1664
							 [i_1395_])) / f,
					     (float) (i_1405_
						      + (((Class143) class143)
							 .aShortArray1664
							 [i_1396_])) / f,
					     (float) (i_1405_
						      + (((Class143) class143)
							 .aShortArray1664
							 [i_1397_])) / f,
					     (((Class143) class143)
					      .anIntArray1672[i_1395_]),
					     (((Class143) class143)
					      .anIntArray1672[i_1396_]),
					     (((Class143) class143)
					      .anIntArray1672[i_1397_]),
					     (((Class189) class189).anInt2215
					      * -338296791),
					     fs_1382_[i_1395_] * 255.0F,
					     fs_1382_[i_1396_] * 255.0F,
					     fs_1382_[i_1397_] * 255.0F,
					     ((((Class143) class143)
					       .aShortArray1670[i_1395_])
					      & 0xffff),
					     (((Class166_Sub3) this)
						  .aClass103_Sub2_9962
						  .aClass107_1458.method2680
					      (((((Class143) class143)
						 .aShortArray1670[i_1395_])
						& 0xffff),
					       1163153709)
					      .anInt1403) * 218388063,
					     f / (float) (((Class143) class143)
							  .aShortArray1671
							  [i_1395_]),
					     ((((Class143) class143)
					       .aShortArray1670[i_1396_])
					      & 0xffff),
					     (((Class166_Sub3) this)
						  .aClass103_Sub2_9962
						  .aClass107_1458.method2680
					      (((((Class143) class143)
						 .aShortArray1670[i_1396_])
						& 0xffff),
					       -1886795830)
					      .anInt1403) * 218388063,
					     f / (float) (((Class143) class143)
							  .aShortArray1671
							  [i_1396_]),
					     ((((Class143) class143)
					       .aShortArray1670[i_1397_])
					      & 0xffff),
					     (((Class166_Sub3) this)
						  .aClass103_Sub2_9962
						  .aClass107_1458.method2680
					      (((((Class143) class143)
						 .aShortArray1670[i_1397_])
						& 0xffff),
					       -224460901)
					      .anInt1403) * 218388063,
					     f / (float) (((Class143) class143)
							  .aShortArray1671
							  [i_1397_]));
				} else if ((fs_1382_[i_1395_]
					    + fs_1382_[i_1396_]
					    + fs_1382_[i_1397_])
					   > 0.0F)
				    class155.method3385
					(true, true, false, f_1401_, f_1402_,
					 f_1403_, f_1398_, f_1399_, f_1400_,
					 fs_1380_[i_1395_], fs_1380_[i_1396_],
					 fs_1380_[i_1397_],
					 (Class54.method1306
					  ((((Class143) class143)
					    .anIntArray1672[i_1395_]),
					   (((Class189) class189).anInt2215
					    * -338296791),
					   fs_1382_[i_1395_] * 255.0F,
					   1372221625)),
					 (Class54.method1306
					  ((((Class143) class143)
					    .anIntArray1672[i_1396_]),
					   (((Class189) class189).anInt2215
					    * -338296791),
					   fs_1382_[i_1396_] * 255.0F,
					   1372221625)),
					 (Class54.method1306
					  ((((Class143) class143)
					    .anIntArray1672[i_1397_]),
					   (((Class189) class189).anInt2215
					    * -338296791),
					   fs_1382_[i_1397_] * 255.0F,
					   1372221625)));
				else
				    class155.method3385
					(true, true, false, f_1401_, f_1402_,
					 f_1403_, f_1398_, f_1399_, f_1400_,
					 fs_1380_[i_1395_], fs_1380_[i_1396_],
					 fs_1380_[i_1397_],
					 (((Class143) class143).anIntArray1672
					  [i_1395_]),
					 (((Class143) class143).anIntArray1672
					  [i_1396_]),
					 (((Class143) class143).anIntArray1672
					  [i_1397_]));
			    }
			} else
			    class155.method3377
				(true, true, false, f_1401_, f_1402_, f_1403_,
				 f_1398_, f_1399_, f_1400_, fs_1380_[i_1395_],
				 fs_1380_[i_1396_], fs_1380_[i_1397_],
				 ((Class189) class189).anInt2215 * -338296791);
		    }
		}
	    }
	}
    }
    
    void method16265(int i, int i_1406_, int i_1407_, int i_1408_, int i_1409_,
		     int i_1410_, int i_1411_, boolean[][] bools,
		     Class189 class189, Class155 class155, float[] fs,
		     float[] fs_1412_) {
	int i_1413_ = (i_1411_ - i_1409_) * i_1407_ / 256;
	int i_1414_ = i_1407_ >> 8;
	boolean bool = ((Class189) class189).aBool2220;
	((Class166_Sub3) this).aClass103_Sub2_9962.method2308(false);
	((Class155) class155).aBool1721 = false;
	((Class155) class155).aBool1722 = false;
	int i_1415_ = i;
	int i_1416_ = i_1406_ + i_1413_;
	for (int i_1417_ = i_1408_; i_1417_ < i_1410_; i_1417_++) {
	    for (int i_1418_ = i_1409_; i_1418_ < i_1411_; i_1418_++) {
		if (bools[i_1417_ - i_1408_][i_1418_ - i_1409_]) {
		    if (((Class166_Sub3) this).aClass201ArrayArray9967
			!= null) {
			if ((((Class166_Sub3) this).aClass201ArrayArray9967
			     [i_1417_][i_1418_])
			    != null) {
			    Class201 class201
				= (((Class166_Sub3) this)
				   .aClass201ArrayArray9967[i_1417_][i_1418_]);
			    if (((Class201) class201).aShort2411 != -1
				&& (((Class201) class201).aByte2409 & 0x2) == 0
				&& ((Class201) class201).anInt2408 == 0) {
				int i_1419_
				    = (((Class166_Sub3) this)
					   .aClass103_Sub2_9962.method15368
				       (((Class201) class201).aShort2411
					& 0xffff));
				class155.method3380
				    (true, true, false,
				     (float) (i_1416_ - i_1414_),
				     (float) (i_1416_ - i_1414_),
				     (float) i_1416_,
				     (float) (i_1415_ + i_1414_),
				     (float) i_1415_,
				     (float) (i_1415_ + i_1414_), 100.0F,
				     100.0F, 100.0F,
				     (float) Class639.method13606(i_1419_,
								  (((Class201)
								    class201)
								   .anInt2404),
								  1280039239),
				     (float) Class639.method13606(i_1419_,
								  (((Class201)
								    class201)
								   .anInt2405),
								  291659866),
				     (float) (Class639.method13606
					      (i_1419_,
					       ((Class201) class201).anInt2401,
					       -2056388958)));
				class155.method3380
				    (true, true, false, (float) i_1416_,
				     (float) i_1416_,
				     (float) (i_1416_ - i_1414_),
				     (float) i_1415_,
				     (float) (i_1415_ + i_1414_),
				     (float) i_1415_, 100.0F, 100.0F, 100.0F,
				     (float) Class639.method13606(i_1419_,
								  (((Class201)
								    class201)
								   .anInt2410),
								  1349313154),
				     (float) Class639.method13606(i_1419_,
								  (((Class201)
								    class201)
								   .anInt2401),
								  344639346),
				     (float) Class639.method13606(i_1419_,
								  (((Class201)
								    class201)
								   .anInt2405),
								  914548664));
			    } else if (((Class201) class201).anInt2408 == 0) {
				class155.method3385
				    (true, true, false,
				     (float) (i_1416_ - i_1414_),
				     (float) (i_1416_ - i_1414_),
				     (float) i_1416_,
				     (float) (i_1415_ + i_1414_),
				     (float) i_1415_,
				     (float) (i_1415_ + i_1414_), 100.0F,
				     100.0F, 100.0F,
				     ((Class201) class201).anInt2404,
				     ((Class201) class201).anInt2405,
				     ((Class201) class201).anInt2401);
				class155.method3385
				    (true, true, false, (float) i_1416_,
				     (float) i_1416_,
				     (float) (i_1416_ - i_1414_),
				     (float) i_1415_,
				     (float) (i_1415_ + i_1414_),
				     (float) i_1415_, 100.0F, 100.0F, 100.0F,
				     ((Class201) class201).anInt2410,
				     ((Class201) class201).anInt2401,
				     ((Class201) class201).anInt2405);
			    } else {
				int i_1420_ = ((Class201) class201).anInt2408;
				class155.method3385
				    (true, true, false,
				     (float) (i_1416_ - i_1414_),
				     (float) (i_1416_ - i_1414_),
				     (float) i_1416_,
				     (float) (i_1415_ + i_1414_),
				     (float) i_1415_,
				     (float) (i_1415_ + i_1414_), 100.0F,
				     100.0F, 100.0F,
				     (Class241_Sub18_Sub1.method17140
				      (i_1420_,
				       (((Class201) class201).anInt2404
					& ~0xffffff),
				       -1142185312)),
				     (Class241_Sub18_Sub1.method17140
				      (i_1420_,
				       (((Class201) class201).anInt2405
					& ~0xffffff),
				       -1531646114)),
				     (Class241_Sub18_Sub1.method17140
				      (i_1420_,
				       (((Class201) class201).anInt2401
					& ~0xffffff),
				       729305110)));
				class155.method3385
				    (true, true, false, (float) i_1416_,
				     (float) i_1416_,
				     (float) (i_1416_ - i_1414_),
				     (float) i_1415_,
				     (float) (i_1415_ + i_1414_),
				     (float) i_1415_, 100.0F, 100.0F, 100.0F,
				     (Class241_Sub18_Sub1.method17140
				      (i_1420_,
				       (((Class201) class201).anInt2410
					& ~0xffffff),
				       -1845865163)),
				     (Class241_Sub18_Sub1.method17140
				      (i_1420_,
				       (((Class201) class201).anInt2401
					& ~0xffffff),
				       -1348911242)),
				     (Class241_Sub18_Sub1.method17140
				      (i_1420_,
				       (((Class201) class201).anInt2405
					& ~0xffffff),
				       1325253546)));
			    }
			} else if ((((Class166_Sub3) this)
				    .aClass183ArrayArray9969[i_1417_][i_1418_])
				   != null) {
			    Class183 class183
				= (((Class166_Sub3) this)
				   .aClass183ArrayArray9969[i_1417_][i_1418_]);
			    for (int i_1421_ = 0;
				 i_1421_ < ((Class183) class183).aShort2154;
				 i_1421_++) {
				fs[i_1421_]
				    = (float) (i_1415_
					       + ((((Class183) class183)
						   .aShortArray2156[i_1421_])
						  * i_1414_
						  / (anInt2053 * 2039042417)));
				fs_1412_[i_1421_]
				    = (float) (i_1416_
					       - ((((Class183) class183)
						   .aShortArray2158[i_1421_])
						  * i_1414_
						  / (anInt2053 * 2039042417)));
			    }
			    for (int i_1422_ = 0;
				 i_1422_ < ((Class183) class183).aShort2160;
				 i_1422_++) {
				int i_1423_ = i_1422_ * 3;
				int i_1424_ = i_1423_ + 1;
				int i_1425_ = i_1424_ + 1;
				float f = fs[i_1423_];
				float f_1426_ = fs[i_1424_];
				float f_1427_ = fs[i_1425_];
				float f_1428_ = fs_1412_[i_1423_];
				float f_1429_ = fs_1412_[i_1424_];
				float f_1430_ = fs_1412_[i_1425_];
				if ((((Class183) class183).anIntArray2155
				     != null)
				    && (((Class183) class183).anIntArray2155
					[i_1422_]) != 0
				    && ((((Class183) class183).aShortArray2161
					 == null)
					|| ((((Class183) class183)
					     .aShortArray2161) != null
					    && ((((Class183) class183)
						 .aShortArray2161[i_1422_])
						== -1)))) {
				    int i_1431_ = (((Class183) class183)
						   .anIntArray2155[i_1422_]);
				    class155.method3385
					(true, true, false, f_1428_, f_1429_,
					 f_1430_, f, f_1426_, f_1427_, 100.0F,
					 100.0F, 100.0F,
					 (Class241_Sub18_Sub1.method17140
					  (i_1431_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_1423_])
							& ~0xffffff),
					   1165023652)),
					 (Class241_Sub18_Sub1.method17140
					  (i_1431_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_1424_])
							& ~0xffffff),
					   -455922811)),
					 (Class241_Sub18_Sub1.method17140
					  (i_1431_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_1425_])
							& ~0xffffff),
					   430083962)));
				} else if ((((Class183) class183)
					    .aShortArray2161) != null
					   && ((((Class183) class183)
						.aShortArray2161[i_1422_])
					       != -1)) {
				    int i_1432_
					= (((Class166_Sub3) this)
					       .aClass103_Sub2_9962.method15368
					   ((((Class183) class183)
					     .aShortArray2161[i_1422_])
					    & 0xffff));
				    class155.method3380(true, true, false,
							f_1428_, f_1429_,
							f_1430_, f, f_1426_,
							f_1427_, 100.0F,
							100.0F, 100.0F,
							(float) i_1432_,
							(float) i_1432_,
							(float) i_1432_);
				} else
				    class155.method3385(true, true, false,
							f_1428_, f_1429_,
							f_1430_, f, f_1426_,
							f_1427_, 100.0F,
							100.0F, 100.0F,
							(((Class183) class183)
							 .anIntArray2163
							 [i_1423_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_1424_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_1425_]));
			    }
			}
		    } else if ((((Class166_Sub3) this).aClass143ArrayArray9979
				[i_1417_][i_1418_])
			       != null) {
			Class143 class143
			    = (((Class166_Sub3) this).aClass143ArrayArray9979
			       [i_1417_][i_1418_]);
			for (int i_1433_ = 0;
			     i_1433_ < ((Class143) class143).aShort1669;
			     i_1433_++) {
			    fs[i_1433_]
				= (float) (i_1415_
					   + ((((Class143) class143)
					       .aShortArray1666[i_1433_])
					      * i_1414_
					      / (anInt2053 * 2039042417)));
			    fs_1412_[i_1433_]
				= (float) (i_1416_
					   - ((((Class143) class143)
					       .aShortArray1664[i_1433_])
					      * i_1414_
					      / (anInt2053 * 2039042417)));
			}
			for (int i_1434_ = 0;
			     i_1434_ < ((Class143) class143).aShort1668;
			     i_1434_++) {
			    int i_1435_ = i_1434_ * 3;
			    int i_1436_ = i_1435_ + 1;
			    int i_1437_ = i_1436_ + 1;
			    float f = fs[i_1435_];
			    float f_1438_ = fs[i_1436_];
			    float f_1439_ = fs[i_1437_];
			    float f_1440_ = fs_1412_[i_1435_];
			    float f_1441_ = fs_1412_[i_1436_];
			    float f_1442_ = fs_1412_[i_1437_];
			    if (((Class143) class143).anIntArray1674 != null
				&& (((Class143) class143).anIntArray1674
				    [i_1434_]) != 0) {
				int i_1443_ = (((Class143) class143)
					       .anIntArray1674[i_1434_]);
				class155.method3385(true, true, false, f_1440_,
						    f_1441_, f_1442_, f,
						    f_1438_, f_1439_, 100.0F,
						    100.0F, 100.0F, i_1443_,
						    i_1443_, i_1443_);
			    } else
				class155.method3385(true, true, false, f_1440_,
						    f_1441_, f_1442_, f,
						    f_1438_, f_1439_, 100.0F,
						    100.0F, 100.0F,
						    (((Class143) class143)
						     .anIntArray1672[i_1435_]),
						    (((Class143) class143)
						     .anIntArray1672[i_1436_]),
						    (((Class143) class143)
						     .anIntArray1672
						     [i_1437_]));
			}
		    }
		}
		i_1416_ -= i_1414_;
	    }
	    i_1416_ = i_1406_ + i_1413_;
	    i_1415_ += i_1414_;
	}
	((Class155) class155).aBool1721 = true;
	((Class166_Sub3) this).aClass103_Sub2_9962.method2308(bool);
    }
    
    void method16266(int i, int i_1444_, int i_1445_, int i_1446_, int i_1447_,
		     int i_1448_, int i_1449_, boolean[][] bools,
		     Class189 class189, Class155 class155, float[] fs,
		     float[] fs_1450_) {
	int i_1451_ = (i_1449_ - i_1447_) * i_1445_ / 256;
	int i_1452_ = i_1445_ >> 8;
	boolean bool = ((Class189) class189).aBool2220;
	((Class166_Sub3) this).aClass103_Sub2_9962.method2308(false);
	((Class155) class155).aBool1721 = false;
	((Class155) class155).aBool1722 = false;
	int i_1453_ = i;
	int i_1454_ = i_1444_ + i_1451_;
	for (int i_1455_ = i_1446_; i_1455_ < i_1448_; i_1455_++) {
	    for (int i_1456_ = i_1447_; i_1456_ < i_1449_; i_1456_++) {
		if (bools[i_1455_ - i_1446_][i_1456_ - i_1447_]) {
		    if (((Class166_Sub3) this).aClass201ArrayArray9967
			!= null) {
			if ((((Class166_Sub3) this).aClass201ArrayArray9967
			     [i_1455_][i_1456_])
			    != null) {
			    Class201 class201
				= (((Class166_Sub3) this)
				   .aClass201ArrayArray9967[i_1455_][i_1456_]);
			    if (((Class201) class201).aShort2411 != -1
				&& (((Class201) class201).aByte2409 & 0x2) == 0
				&& ((Class201) class201).anInt2408 == 0) {
				int i_1457_
				    = (((Class166_Sub3) this)
					   .aClass103_Sub2_9962.method15368
				       (((Class201) class201).aShort2411
					& 0xffff));
				class155.method3380
				    (true, true, false,
				     (float) (i_1454_ - i_1452_),
				     (float) (i_1454_ - i_1452_),
				     (float) i_1454_,
				     (float) (i_1453_ + i_1452_),
				     (float) i_1453_,
				     (float) (i_1453_ + i_1452_), 100.0F,
				     100.0F, 100.0F,
				     (float) Class639.method13606(i_1457_,
								  (((Class201)
								    class201)
								   .anInt2404),
								  -479352483),
				     (float) Class639.method13606(i_1457_,
								  (((Class201)
								    class201)
								   .anInt2405),
								  1083054974),
				     (float) Class639.method13606(i_1457_,
								  (((Class201)
								    class201)
								   .anInt2401),
								  45035004));
				class155.method3380
				    (true, true, false, (float) i_1454_,
				     (float) i_1454_,
				     (float) (i_1454_ - i_1452_),
				     (float) i_1453_,
				     (float) (i_1453_ + i_1452_),
				     (float) i_1453_, 100.0F, 100.0F, 100.0F,
				     (float) Class639.method13606(i_1457_,
								  (((Class201)
								    class201)
								   .anInt2410),
								  -1740838186),
				     (float) Class639.method13606(i_1457_,
								  (((Class201)
								    class201)
								   .anInt2401),
								  -2113266389),
				     (float) Class639.method13606(i_1457_,
								  (((Class201)
								    class201)
								   .anInt2405),
								  1083703056));
			    } else if (((Class201) class201).anInt2408 == 0) {
				class155.method3385
				    (true, true, false,
				     (float) (i_1454_ - i_1452_),
				     (float) (i_1454_ - i_1452_),
				     (float) i_1454_,
				     (float) (i_1453_ + i_1452_),
				     (float) i_1453_,
				     (float) (i_1453_ + i_1452_), 100.0F,
				     100.0F, 100.0F,
				     ((Class201) class201).anInt2404,
				     ((Class201) class201).anInt2405,
				     ((Class201) class201).anInt2401);
				class155.method3385
				    (true, true, false, (float) i_1454_,
				     (float) i_1454_,
				     (float) (i_1454_ - i_1452_),
				     (float) i_1453_,
				     (float) (i_1453_ + i_1452_),
				     (float) i_1453_, 100.0F, 100.0F, 100.0F,
				     ((Class201) class201).anInt2410,
				     ((Class201) class201).anInt2401,
				     ((Class201) class201).anInt2405);
			    } else {
				int i_1458_ = ((Class201) class201).anInt2408;
				class155.method3385
				    (true, true, false,
				     (float) (i_1454_ - i_1452_),
				     (float) (i_1454_ - i_1452_),
				     (float) i_1454_,
				     (float) (i_1453_ + i_1452_),
				     (float) i_1453_,
				     (float) (i_1453_ + i_1452_), 100.0F,
				     100.0F, 100.0F,
				     (Class241_Sub18_Sub1.method17140
				      (i_1458_,
				       (((Class201) class201).anInt2404
					& ~0xffffff),
				       581587719)),
				     (Class241_Sub18_Sub1.method17140
				      (i_1458_,
				       (((Class201) class201).anInt2405
					& ~0xffffff),
				       -1552727019)),
				     (Class241_Sub18_Sub1.method17140
				      (i_1458_,
				       (((Class201) class201).anInt2401
					& ~0xffffff),
				       541167807)));
				class155.method3385
				    (true, true, false, (float) i_1454_,
				     (float) i_1454_,
				     (float) (i_1454_ - i_1452_),
				     (float) i_1453_,
				     (float) (i_1453_ + i_1452_),
				     (float) i_1453_, 100.0F, 100.0F, 100.0F,
				     (Class241_Sub18_Sub1.method17140
				      (i_1458_,
				       (((Class201) class201).anInt2410
					& ~0xffffff),
				       -282850264)),
				     (Class241_Sub18_Sub1.method17140
				      (i_1458_,
				       (((Class201) class201).anInt2401
					& ~0xffffff),
				       1184326488)),
				     (Class241_Sub18_Sub1.method17140
				      (i_1458_,
				       (((Class201) class201).anInt2405
					& ~0xffffff),
				       1287098957)));
			    }
			} else if ((((Class166_Sub3) this)
				    .aClass183ArrayArray9969[i_1455_][i_1456_])
				   != null) {
			    Class183 class183
				= (((Class166_Sub3) this)
				   .aClass183ArrayArray9969[i_1455_][i_1456_]);
			    for (int i_1459_ = 0;
				 i_1459_ < ((Class183) class183).aShort2154;
				 i_1459_++) {
				fs[i_1459_]
				    = (float) (i_1453_
					       + ((((Class183) class183)
						   .aShortArray2156[i_1459_])
						  * i_1452_
						  / (anInt2053 * 2039042417)));
				fs_1450_[i_1459_]
				    = (float) (i_1454_
					       - ((((Class183) class183)
						   .aShortArray2158[i_1459_])
						  * i_1452_
						  / (anInt2053 * 2039042417)));
			    }
			    for (int i_1460_ = 0;
				 i_1460_ < ((Class183) class183).aShort2160;
				 i_1460_++) {
				int i_1461_ = i_1460_ * 3;
				int i_1462_ = i_1461_ + 1;
				int i_1463_ = i_1462_ + 1;
				float f = fs[i_1461_];
				float f_1464_ = fs[i_1462_];
				float f_1465_ = fs[i_1463_];
				float f_1466_ = fs_1450_[i_1461_];
				float f_1467_ = fs_1450_[i_1462_];
				float f_1468_ = fs_1450_[i_1463_];
				if ((((Class183) class183).anIntArray2155
				     != null)
				    && (((Class183) class183).anIntArray2155
					[i_1460_]) != 0
				    && ((((Class183) class183).aShortArray2161
					 == null)
					|| ((((Class183) class183)
					     .aShortArray2161) != null
					    && ((((Class183) class183)
						 .aShortArray2161[i_1460_])
						== -1)))) {
				    int i_1469_ = (((Class183) class183)
						   .anIntArray2155[i_1460_]);
				    class155.method3385
					(true, true, false, f_1466_, f_1467_,
					 f_1468_, f, f_1464_, f_1465_, 100.0F,
					 100.0F, 100.0F,
					 (Class241_Sub18_Sub1.method17140
					  (i_1469_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_1461_])
							& ~0xffffff),
					   -1832143254)),
					 (Class241_Sub18_Sub1.method17140
					  (i_1469_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_1462_])
							& ~0xffffff),
					   -1727565744)),
					 (Class241_Sub18_Sub1.method17140
					  (i_1469_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_1463_])
							& ~0xffffff),
					   593405005)));
				} else if ((((Class183) class183)
					    .aShortArray2161) != null
					   && ((((Class183) class183)
						.aShortArray2161[i_1460_])
					       != -1)) {
				    int i_1470_
					= (((Class166_Sub3) this)
					       .aClass103_Sub2_9962.method15368
					   ((((Class183) class183)
					     .aShortArray2161[i_1460_])
					    & 0xffff));
				    class155.method3380(true, true, false,
							f_1466_, f_1467_,
							f_1468_, f, f_1464_,
							f_1465_, 100.0F,
							100.0F, 100.0F,
							(float) i_1470_,
							(float) i_1470_,
							(float) i_1470_);
				} else
				    class155.method3385(true, true, false,
							f_1466_, f_1467_,
							f_1468_, f, f_1464_,
							f_1465_, 100.0F,
							100.0F, 100.0F,
							(((Class183) class183)
							 .anIntArray2163
							 [i_1461_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_1462_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_1463_]));
			    }
			}
		    } else if ((((Class166_Sub3) this).aClass143ArrayArray9979
				[i_1455_][i_1456_])
			       != null) {
			Class143 class143
			    = (((Class166_Sub3) this).aClass143ArrayArray9979
			       [i_1455_][i_1456_]);
			for (int i_1471_ = 0;
			     i_1471_ < ((Class143) class143).aShort1669;
			     i_1471_++) {
			    fs[i_1471_]
				= (float) (i_1453_
					   + ((((Class143) class143)
					       .aShortArray1666[i_1471_])
					      * i_1452_
					      / (anInt2053 * 2039042417)));
			    fs_1450_[i_1471_]
				= (float) (i_1454_
					   - ((((Class143) class143)
					       .aShortArray1664[i_1471_])
					      * i_1452_
					      / (anInt2053 * 2039042417)));
			}
			for (int i_1472_ = 0;
			     i_1472_ < ((Class143) class143).aShort1668;
			     i_1472_++) {
			    int i_1473_ = i_1472_ * 3;
			    int i_1474_ = i_1473_ + 1;
			    int i_1475_ = i_1474_ + 1;
			    float f = fs[i_1473_];
			    float f_1476_ = fs[i_1474_];
			    float f_1477_ = fs[i_1475_];
			    float f_1478_ = fs_1450_[i_1473_];
			    float f_1479_ = fs_1450_[i_1474_];
			    float f_1480_ = fs_1450_[i_1475_];
			    if (((Class143) class143).anIntArray1674 != null
				&& (((Class143) class143).anIntArray1674
				    [i_1472_]) != 0) {
				int i_1481_ = (((Class143) class143)
					       .anIntArray1674[i_1472_]);
				class155.method3385(true, true, false, f_1478_,
						    f_1479_, f_1480_, f,
						    f_1476_, f_1477_, 100.0F,
						    100.0F, 100.0F, i_1481_,
						    i_1481_, i_1481_);
			    } else
				class155.method3385(true, true, false, f_1478_,
						    f_1479_, f_1480_, f,
						    f_1476_, f_1477_, 100.0F,
						    100.0F, 100.0F,
						    (((Class143) class143)
						     .anIntArray1672[i_1473_]),
						    (((Class143) class143)
						     .anIntArray1672[i_1474_]),
						    (((Class143) class143)
						     .anIntArray1672
						     [i_1475_]));
			}
		    }
		}
		i_1454_ -= i_1452_;
	    }
	    i_1454_ = i_1444_ + i_1451_;
	    i_1453_ += i_1452_;
	}
	((Class155) class155).aBool1721 = true;
	((Class166_Sub3) this).aClass103_Sub2_9962.method2308(bool);
    }
    
    void method16267(int i, int i_1482_, int i_1483_, int i_1484_, int i_1485_,
		     int i_1486_, int i_1487_, boolean[][] bools,
		     Class189 class189, Class155 class155, float[] fs,
		     float[] fs_1488_) {
	int i_1489_ = (i_1487_ - i_1485_) * i_1483_ / 256;
	int i_1490_ = i_1483_ >> 8;
	boolean bool = ((Class189) class189).aBool2220;
	((Class166_Sub3) this).aClass103_Sub2_9962.method2308(false);
	((Class155) class155).aBool1721 = false;
	((Class155) class155).aBool1722 = false;
	int i_1491_ = i;
	int i_1492_ = i_1482_ + i_1489_;
	for (int i_1493_ = i_1484_; i_1493_ < i_1486_; i_1493_++) {
	    for (int i_1494_ = i_1485_; i_1494_ < i_1487_; i_1494_++) {
		if (bools[i_1493_ - i_1484_][i_1494_ - i_1485_]) {
		    if (((Class166_Sub3) this).aClass201ArrayArray9967
			!= null) {
			if ((((Class166_Sub3) this).aClass201ArrayArray9967
			     [i_1493_][i_1494_])
			    != null) {
			    Class201 class201
				= (((Class166_Sub3) this)
				   .aClass201ArrayArray9967[i_1493_][i_1494_]);
			    if (((Class201) class201).aShort2411 != -1
				&& (((Class201) class201).aByte2409 & 0x2) == 0
				&& ((Class201) class201).anInt2408 == 0) {
				int i_1495_
				    = (((Class166_Sub3) this)
					   .aClass103_Sub2_9962.method15368
				       (((Class201) class201).aShort2411
					& 0xffff));
				class155.method3380
				    (true, true, false,
				     (float) (i_1492_ - i_1490_),
				     (float) (i_1492_ - i_1490_),
				     (float) i_1492_,
				     (float) (i_1491_ + i_1490_),
				     (float) i_1491_,
				     (float) (i_1491_ + i_1490_), 100.0F,
				     100.0F, 100.0F,
				     (float) Class639.method13606(i_1495_,
								  (((Class201)
								    class201)
								   .anInt2404),
								  -562627488),
				     (float) Class639.method13606(i_1495_,
								  (((Class201)
								    class201)
								   .anInt2405),
								  1346540952),
				     (float) (Class639.method13606
					      (i_1495_,
					       ((Class201) class201).anInt2401,
					       -1744948495)));
				class155.method3380
				    (true, true, false, (float) i_1492_,
				     (float) i_1492_,
				     (float) (i_1492_ - i_1490_),
				     (float) i_1491_,
				     (float) (i_1491_ + i_1490_),
				     (float) i_1491_, 100.0F, 100.0F, 100.0F,
				     (float) Class639.method13606(i_1495_,
								  (((Class201)
								    class201)
								   .anInt2410),
								  2014741702),
				     (float) Class639.method13606(i_1495_,
								  (((Class201)
								    class201)
								   .anInt2401),
								  -1914297491),
				     (float) Class639.method13606(i_1495_,
								  (((Class201)
								    class201)
								   .anInt2405),
								  1560919471));
			    } else if (((Class201) class201).anInt2408 == 0) {
				class155.method3385
				    (true, true, false,
				     (float) (i_1492_ - i_1490_),
				     (float) (i_1492_ - i_1490_),
				     (float) i_1492_,
				     (float) (i_1491_ + i_1490_),
				     (float) i_1491_,
				     (float) (i_1491_ + i_1490_), 100.0F,
				     100.0F, 100.0F,
				     ((Class201) class201).anInt2404,
				     ((Class201) class201).anInt2405,
				     ((Class201) class201).anInt2401);
				class155.method3385
				    (true, true, false, (float) i_1492_,
				     (float) i_1492_,
				     (float) (i_1492_ - i_1490_),
				     (float) i_1491_,
				     (float) (i_1491_ + i_1490_),
				     (float) i_1491_, 100.0F, 100.0F, 100.0F,
				     ((Class201) class201).anInt2410,
				     ((Class201) class201).anInt2401,
				     ((Class201) class201).anInt2405);
			    } else {
				int i_1496_ = ((Class201) class201).anInt2408;
				class155.method3385
				    (true, true, false,
				     (float) (i_1492_ - i_1490_),
				     (float) (i_1492_ - i_1490_),
				     (float) i_1492_,
				     (float) (i_1491_ + i_1490_),
				     (float) i_1491_,
				     (float) (i_1491_ + i_1490_), 100.0F,
				     100.0F, 100.0F,
				     (Class241_Sub18_Sub1.method17140
				      (i_1496_,
				       (((Class201) class201).anInt2404
					& ~0xffffff),
				       -1911304827)),
				     (Class241_Sub18_Sub1.method17140
				      (i_1496_,
				       (((Class201) class201).anInt2405
					& ~0xffffff),
				       -486046493)),
				     (Class241_Sub18_Sub1.method17140
				      (i_1496_,
				       (((Class201) class201).anInt2401
					& ~0xffffff),
				       164401680)));
				class155.method3385
				    (true, true, false, (float) i_1492_,
				     (float) i_1492_,
				     (float) (i_1492_ - i_1490_),
				     (float) i_1491_,
				     (float) (i_1491_ + i_1490_),
				     (float) i_1491_, 100.0F, 100.0F, 100.0F,
				     (Class241_Sub18_Sub1.method17140
				      (i_1496_,
				       (((Class201) class201).anInt2410
					& ~0xffffff),
				       -348382868)),
				     (Class241_Sub18_Sub1.method17140
				      (i_1496_,
				       (((Class201) class201).anInt2401
					& ~0xffffff),
				       1832419137)),
				     (Class241_Sub18_Sub1.method17140
				      (i_1496_,
				       (((Class201) class201).anInt2405
					& ~0xffffff),
				       1881974099)));
			    }
			} else if ((((Class166_Sub3) this)
				    .aClass183ArrayArray9969[i_1493_][i_1494_])
				   != null) {
			    Class183 class183
				= (((Class166_Sub3) this)
				   .aClass183ArrayArray9969[i_1493_][i_1494_]);
			    for (int i_1497_ = 0;
				 i_1497_ < ((Class183) class183).aShort2154;
				 i_1497_++) {
				fs[i_1497_]
				    = (float) (i_1491_
					       + ((((Class183) class183)
						   .aShortArray2156[i_1497_])
						  * i_1490_
						  / (anInt2053 * 2039042417)));
				fs_1488_[i_1497_]
				    = (float) (i_1492_
					       - ((((Class183) class183)
						   .aShortArray2158[i_1497_])
						  * i_1490_
						  / (anInt2053 * 2039042417)));
			    }
			    for (int i_1498_ = 0;
				 i_1498_ < ((Class183) class183).aShort2160;
				 i_1498_++) {
				int i_1499_ = i_1498_ * 3;
				int i_1500_ = i_1499_ + 1;
				int i_1501_ = i_1500_ + 1;
				float f = fs[i_1499_];
				float f_1502_ = fs[i_1500_];
				float f_1503_ = fs[i_1501_];
				float f_1504_ = fs_1488_[i_1499_];
				float f_1505_ = fs_1488_[i_1500_];
				float f_1506_ = fs_1488_[i_1501_];
				if ((((Class183) class183).anIntArray2155
				     != null)
				    && (((Class183) class183).anIntArray2155
					[i_1498_]) != 0
				    && ((((Class183) class183).aShortArray2161
					 == null)
					|| ((((Class183) class183)
					     .aShortArray2161) != null
					    && ((((Class183) class183)
						 .aShortArray2161[i_1498_])
						== -1)))) {
				    int i_1507_ = (((Class183) class183)
						   .anIntArray2155[i_1498_]);
				    class155.method3385
					(true, true, false, f_1504_, f_1505_,
					 f_1506_, f, f_1502_, f_1503_, 100.0F,
					 100.0F, 100.0F,
					 (Class241_Sub18_Sub1.method17140
					  (i_1507_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_1499_])
							& ~0xffffff),
					   -841777961)),
					 (Class241_Sub18_Sub1.method17140
					  (i_1507_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_1500_])
							& ~0xffffff),
					   -310983676)),
					 (Class241_Sub18_Sub1.method17140
					  (i_1507_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_1501_])
							& ~0xffffff),
					   -1253938343)));
				} else if ((((Class183) class183)
					    .aShortArray2161) != null
					   && ((((Class183) class183)
						.aShortArray2161[i_1498_])
					       != -1)) {
				    int i_1508_
					= (((Class166_Sub3) this)
					       .aClass103_Sub2_9962.method15368
					   ((((Class183) class183)
					     .aShortArray2161[i_1498_])
					    & 0xffff));
				    class155.method3380(true, true, false,
							f_1504_, f_1505_,
							f_1506_, f, f_1502_,
							f_1503_, 100.0F,
							100.0F, 100.0F,
							(float) i_1508_,
							(float) i_1508_,
							(float) i_1508_);
				} else
				    class155.method3385(true, true, false,
							f_1504_, f_1505_,
							f_1506_, f, f_1502_,
							f_1503_, 100.0F,
							100.0F, 100.0F,
							(((Class183) class183)
							 .anIntArray2163
							 [i_1499_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_1500_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_1501_]));
			    }
			}
		    } else if ((((Class166_Sub3) this).aClass143ArrayArray9979
				[i_1493_][i_1494_])
			       != null) {
			Class143 class143
			    = (((Class166_Sub3) this).aClass143ArrayArray9979
			       [i_1493_][i_1494_]);
			for (int i_1509_ = 0;
			     i_1509_ < ((Class143) class143).aShort1669;
			     i_1509_++) {
			    fs[i_1509_]
				= (float) (i_1491_
					   + ((((Class143) class143)
					       .aShortArray1666[i_1509_])
					      * i_1490_
					      / (anInt2053 * 2039042417)));
			    fs_1488_[i_1509_]
				= (float) (i_1492_
					   - ((((Class143) class143)
					       .aShortArray1664[i_1509_])
					      * i_1490_
					      / (anInt2053 * 2039042417)));
			}
			for (int i_1510_ = 0;
			     i_1510_ < ((Class143) class143).aShort1668;
			     i_1510_++) {
			    int i_1511_ = i_1510_ * 3;
			    int i_1512_ = i_1511_ + 1;
			    int i_1513_ = i_1512_ + 1;
			    float f = fs[i_1511_];
			    float f_1514_ = fs[i_1512_];
			    float f_1515_ = fs[i_1513_];
			    float f_1516_ = fs_1488_[i_1511_];
			    float f_1517_ = fs_1488_[i_1512_];
			    float f_1518_ = fs_1488_[i_1513_];
			    if (((Class143) class143).anIntArray1674 != null
				&& (((Class143) class143).anIntArray1674
				    [i_1510_]) != 0) {
				int i_1519_ = (((Class143) class143)
					       .anIntArray1674[i_1510_]);
				class155.method3385(true, true, false, f_1516_,
						    f_1517_, f_1518_, f,
						    f_1514_, f_1515_, 100.0F,
						    100.0F, 100.0F, i_1519_,
						    i_1519_, i_1519_);
			    } else
				class155.method3385(true, true, false, f_1516_,
						    f_1517_, f_1518_, f,
						    f_1514_, f_1515_, 100.0F,
						    100.0F, 100.0F,
						    (((Class143) class143)
						     .anIntArray1672[i_1511_]),
						    (((Class143) class143)
						     .anIntArray1672[i_1512_]),
						    (((Class143) class143)
						     .anIntArray1672
						     [i_1513_]));
			}
		    }
		}
		i_1492_ -= i_1490_;
	    }
	    i_1492_ = i_1482_ + i_1489_;
	    i_1491_ += i_1490_;
	}
	((Class155) class155).aBool1721 = true;
	((Class166_Sub3) this).aClass103_Sub2_9962.method2308(bool);
    }
    
    public boolean method3552(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			      int i_1520_, int i_1521_, int i_1522_,
			      boolean bool) {
	return false;
    }
    
    void method16268(int i, int i_1523_, int i_1524_, int i_1525_, int i_1526_,
		     int i_1527_, int i_1528_, boolean[][] bools,
		     Class189 class189, Class155 class155, float[] fs,
		     float[] fs_1529_) {
	int i_1530_ = (i_1528_ - i_1526_) * i_1524_ / 256;
	int i_1531_ = i_1524_ >> 8;
	boolean bool = ((Class189) class189).aBool2220;
	((Class166_Sub3) this).aClass103_Sub2_9962.method2308(false);
	((Class155) class155).aBool1721 = false;
	((Class155) class155).aBool1722 = false;
	int i_1532_ = i;
	int i_1533_ = i_1523_ + i_1530_;
	for (int i_1534_ = i_1525_; i_1534_ < i_1527_; i_1534_++) {
	    for (int i_1535_ = i_1526_; i_1535_ < i_1528_; i_1535_++) {
		if (bools[i_1534_ - i_1525_][i_1535_ - i_1526_]) {
		    if (((Class166_Sub3) this).aClass201ArrayArray9967
			!= null) {
			if ((((Class166_Sub3) this).aClass201ArrayArray9967
			     [i_1534_][i_1535_])
			    != null) {
			    Class201 class201
				= (((Class166_Sub3) this)
				   .aClass201ArrayArray9967[i_1534_][i_1535_]);
			    if (((Class201) class201).aShort2411 != -1
				&& (((Class201) class201).aByte2409 & 0x2) == 0
				&& ((Class201) class201).anInt2408 == 0) {
				int i_1536_
				    = (((Class166_Sub3) this)
					   .aClass103_Sub2_9962.method15368
				       (((Class201) class201).aShort2411
					& 0xffff));
				class155.method3380
				    (true, true, false,
				     (float) (i_1533_ - i_1531_),
				     (float) (i_1533_ - i_1531_),
				     (float) i_1533_,
				     (float) (i_1532_ + i_1531_),
				     (float) i_1532_,
				     (float) (i_1532_ + i_1531_), 100.0F,
				     100.0F, 100.0F,
				     (float) Class639.method13606(i_1536_,
								  (((Class201)
								    class201)
								   .anInt2404),
								  -579952305),
				     (float) Class639.method13606(i_1536_,
								  (((Class201)
								    class201)
								   .anInt2405),
								  -117839431),
				     (float) Class639.method13606(i_1536_,
								  (((Class201)
								    class201)
								   .anInt2401),
								  1733194694));
				class155.method3380
				    (true, true, false, (float) i_1533_,
				     (float) i_1533_,
				     (float) (i_1533_ - i_1531_),
				     (float) i_1532_,
				     (float) (i_1532_ + i_1531_),
				     (float) i_1532_, 100.0F, 100.0F, 100.0F,
				     (float) Class639.method13606(i_1536_,
								  (((Class201)
								    class201)
								   .anInt2410),
								  -1835138995),
				     (float) Class639.method13606(i_1536_,
								  (((Class201)
								    class201)
								   .anInt2401),
								  -2138846640),
				     (float) Class639.method13606(i_1536_,
								  (((Class201)
								    class201)
								   .anInt2405),
								  209839136));
			    } else if (((Class201) class201).anInt2408 == 0) {
				class155.method3385
				    (true, true, false,
				     (float) (i_1533_ - i_1531_),
				     (float) (i_1533_ - i_1531_),
				     (float) i_1533_,
				     (float) (i_1532_ + i_1531_),
				     (float) i_1532_,
				     (float) (i_1532_ + i_1531_), 100.0F,
				     100.0F, 100.0F,
				     ((Class201) class201).anInt2404,
				     ((Class201) class201).anInt2405,
				     ((Class201) class201).anInt2401);
				class155.method3385
				    (true, true, false, (float) i_1533_,
				     (float) i_1533_,
				     (float) (i_1533_ - i_1531_),
				     (float) i_1532_,
				     (float) (i_1532_ + i_1531_),
				     (float) i_1532_, 100.0F, 100.0F, 100.0F,
				     ((Class201) class201).anInt2410,
				     ((Class201) class201).anInt2401,
				     ((Class201) class201).anInt2405);
			    } else {
				int i_1537_ = ((Class201) class201).anInt2408;
				class155.method3385
				    (true, true, false,
				     (float) (i_1533_ - i_1531_),
				     (float) (i_1533_ - i_1531_),
				     (float) i_1533_,
				     (float) (i_1532_ + i_1531_),
				     (float) i_1532_,
				     (float) (i_1532_ + i_1531_), 100.0F,
				     100.0F, 100.0F,
				     (Class241_Sub18_Sub1.method17140
				      (i_1537_,
				       (((Class201) class201).anInt2404
					& ~0xffffff),
				       -1087527085)),
				     (Class241_Sub18_Sub1.method17140
				      (i_1537_,
				       (((Class201) class201).anInt2405
					& ~0xffffff),
				       -1219370216)),
				     (Class241_Sub18_Sub1.method17140
				      (i_1537_,
				       (((Class201) class201).anInt2401
					& ~0xffffff),
				       -2145525542)));
				class155.method3385
				    (true, true, false, (float) i_1533_,
				     (float) i_1533_,
				     (float) (i_1533_ - i_1531_),
				     (float) i_1532_,
				     (float) (i_1532_ + i_1531_),
				     (float) i_1532_, 100.0F, 100.0F, 100.0F,
				     (Class241_Sub18_Sub1.method17140
				      (i_1537_,
				       (((Class201) class201).anInt2410
					& ~0xffffff),
				       604511872)),
				     (Class241_Sub18_Sub1.method17140
				      (i_1537_,
				       (((Class201) class201).anInt2401
					& ~0xffffff),
				       -267919163)),
				     (Class241_Sub18_Sub1.method17140
				      (i_1537_,
				       (((Class201) class201).anInt2405
					& ~0xffffff),
				       -1849130220)));
			    }
			} else if ((((Class166_Sub3) this)
				    .aClass183ArrayArray9969[i_1534_][i_1535_])
				   != null) {
			    Class183 class183
				= (((Class166_Sub3) this)
				   .aClass183ArrayArray9969[i_1534_][i_1535_]);
			    for (int i_1538_ = 0;
				 i_1538_ < ((Class183) class183).aShort2154;
				 i_1538_++) {
				fs[i_1538_]
				    = (float) (i_1532_
					       + ((((Class183) class183)
						   .aShortArray2156[i_1538_])
						  * i_1531_
						  / (anInt2053 * 2039042417)));
				fs_1529_[i_1538_]
				    = (float) (i_1533_
					       - ((((Class183) class183)
						   .aShortArray2158[i_1538_])
						  * i_1531_
						  / (anInt2053 * 2039042417)));
			    }
			    for (int i_1539_ = 0;
				 i_1539_ < ((Class183) class183).aShort2160;
				 i_1539_++) {
				int i_1540_ = i_1539_ * 3;
				int i_1541_ = i_1540_ + 1;
				int i_1542_ = i_1541_ + 1;
				float f = fs[i_1540_];
				float f_1543_ = fs[i_1541_];
				float f_1544_ = fs[i_1542_];
				float f_1545_ = fs_1529_[i_1540_];
				float f_1546_ = fs_1529_[i_1541_];
				float f_1547_ = fs_1529_[i_1542_];
				if ((((Class183) class183).anIntArray2155
				     != null)
				    && (((Class183) class183).anIntArray2155
					[i_1539_]) != 0
				    && ((((Class183) class183).aShortArray2161
					 == null)
					|| ((((Class183) class183)
					     .aShortArray2161) != null
					    && ((((Class183) class183)
						 .aShortArray2161[i_1539_])
						== -1)))) {
				    int i_1548_ = (((Class183) class183)
						   .anIntArray2155[i_1539_]);
				    class155.method3385
					(true, true, false, f_1545_, f_1546_,
					 f_1547_, f, f_1543_, f_1544_, 100.0F,
					 100.0F, 100.0F,
					 (Class241_Sub18_Sub1.method17140
					  (i_1548_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_1540_])
							& ~0xffffff),
					   67328259)),
					 (Class241_Sub18_Sub1.method17140
					  (i_1548_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_1541_])
							& ~0xffffff),
					   -1109632333)),
					 (Class241_Sub18_Sub1.method17140
					  (i_1548_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_1542_])
							& ~0xffffff),
					   -1714402794)));
				} else if ((((Class183) class183)
					    .aShortArray2161) != null
					   && ((((Class183) class183)
						.aShortArray2161[i_1539_])
					       != -1)) {
				    int i_1549_
					= (((Class166_Sub3) this)
					       .aClass103_Sub2_9962.method15368
					   ((((Class183) class183)
					     .aShortArray2161[i_1539_])
					    & 0xffff));
				    class155.method3380(true, true, false,
							f_1545_, f_1546_,
							f_1547_, f, f_1543_,
							f_1544_, 100.0F,
							100.0F, 100.0F,
							(float) i_1549_,
							(float) i_1549_,
							(float) i_1549_);
				} else
				    class155.method3385(true, true, false,
							f_1545_, f_1546_,
							f_1547_, f, f_1543_,
							f_1544_, 100.0F,
							100.0F, 100.0F,
							(((Class183) class183)
							 .anIntArray2163
							 [i_1540_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_1541_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_1542_]));
			    }
			}
		    } else if ((((Class166_Sub3) this).aClass143ArrayArray9979
				[i_1534_][i_1535_])
			       != null) {
			Class143 class143
			    = (((Class166_Sub3) this).aClass143ArrayArray9979
			       [i_1534_][i_1535_]);
			for (int i_1550_ = 0;
			     i_1550_ < ((Class143) class143).aShort1669;
			     i_1550_++) {
			    fs[i_1550_]
				= (float) (i_1532_
					   + ((((Class143) class143)
					       .aShortArray1666[i_1550_])
					      * i_1531_
					      / (anInt2053 * 2039042417)));
			    fs_1529_[i_1550_]
				= (float) (i_1533_
					   - ((((Class143) class143)
					       .aShortArray1664[i_1550_])
					      * i_1531_
					      / (anInt2053 * 2039042417)));
			}
			for (int i_1551_ = 0;
			     i_1551_ < ((Class143) class143).aShort1668;
			     i_1551_++) {
			    int i_1552_ = i_1551_ * 3;
			    int i_1553_ = i_1552_ + 1;
			    int i_1554_ = i_1553_ + 1;
			    float f = fs[i_1552_];
			    float f_1555_ = fs[i_1553_];
			    float f_1556_ = fs[i_1554_];
			    float f_1557_ = fs_1529_[i_1552_];
			    float f_1558_ = fs_1529_[i_1553_];
			    float f_1559_ = fs_1529_[i_1554_];
			    if (((Class143) class143).anIntArray1674 != null
				&& (((Class143) class143).anIntArray1674
				    [i_1551_]) != 0) {
				int i_1560_ = (((Class143) class143)
					       .anIntArray1674[i_1551_]);
				class155.method3385(true, true, false, f_1557_,
						    f_1558_, f_1559_, f,
						    f_1555_, f_1556_, 100.0F,
						    100.0F, 100.0F, i_1560_,
						    i_1560_, i_1560_);
			    } else
				class155.method3385(true, true, false, f_1557_,
						    f_1558_, f_1559_, f,
						    f_1555_, f_1556_, 100.0F,
						    100.0F, 100.0F,
						    (((Class143) class143)
						     .anIntArray1672[i_1552_]),
						    (((Class143) class143)
						     .anIntArray1672[i_1553_]),
						    (((Class143) class143)
						     .anIntArray1672
						     [i_1554_]));
			}
		    }
		}
		i_1533_ -= i_1531_;
	    }
	    i_1533_ = i_1523_ + i_1530_;
	    i_1532_ += i_1531_;
	}
	((Class155) class155).aBool1721 = true;
	((Class166_Sub3) this).aClass103_Sub2_9962.method2308(bool);
    }
    
    public Class241_Sub39_Sub17 method3559
	(int i, int i_1561_, Class241_Sub39_Sub17 class241_sub39_sub17) {
	return null;
    }
    
    public Class241_Sub39_Sub17 method3578
	(int i, int i_1562_, Class241_Sub39_Sub17 class241_sub39_sub17) {
	return null;
    }
    
    public Class241_Sub39_Sub17 method3570
	(int i, int i_1563_, Class241_Sub39_Sub17 class241_sub39_sub17) {
	return null;
    }
    
    public Class241_Sub39_Sub17 method3571
	(int i, int i_1564_, Class241_Sub39_Sub17 class241_sub39_sub17) {
	return null;
    }
    
    public void method3572(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_1565_, int i_1566_, int i_1567_,
			   boolean bool) {
	/* empty */
    }
    
    public void method3546(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_1568_, int i_1569_, int i_1570_,
			   boolean bool) {
	/* empty */
    }
    
    public void method3580(Class241_Sub43 class241_sub43, int[] is) {
	/* empty */
    }
    
    public void method3575(Class241_Sub43 class241_sub43, int[] is) {
	/* empty */
    }
    
    public void method3554(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_1571_, int i_1572_, int i_1573_,
			   boolean bool) {
	/* empty */
    }
    
    public void method3569(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_1574_, int i_1575_, int i_1576_,
			   boolean bool) {
	/* empty */
    }
    
    public void method3561(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_1577_, int i_1578_, int i_1579_,
			   boolean bool) {
	/* empty */
    }
    
    public void method3549(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_1580_, int i_1581_, int i_1582_,
			   boolean bool) {
	/* empty */
    }
    
    void method16269(int i, int i_1583_, int i_1584_, int i_1585_, int i_1586_,
		     int i_1587_, int i_1588_, boolean[][] bools,
		     Class189 class189, Class155 class155, float[] fs,
		     float[] fs_1589_) {
	int i_1590_ = (i_1588_ - i_1586_) * i_1584_ / 256;
	int i_1591_ = i_1584_ >> 8;
	boolean bool = ((Class189) class189).aBool2220;
	((Class166_Sub3) this).aClass103_Sub2_9962.method2308(false);
	((Class155) class155).aBool1721 = false;
	((Class155) class155).aBool1722 = false;
	int i_1592_ = i;
	int i_1593_ = i_1583_ + i_1590_;
	for (int i_1594_ = i_1585_; i_1594_ < i_1587_; i_1594_++) {
	    for (int i_1595_ = i_1586_; i_1595_ < i_1588_; i_1595_++) {
		if (bools[i_1594_ - i_1585_][i_1595_ - i_1586_]) {
		    if (((Class166_Sub3) this).aClass201ArrayArray9967
			!= null) {
			if ((((Class166_Sub3) this).aClass201ArrayArray9967
			     [i_1594_][i_1595_])
			    != null) {
			    Class201 class201
				= (((Class166_Sub3) this)
				   .aClass201ArrayArray9967[i_1594_][i_1595_]);
			    if (((Class201) class201).aShort2411 != -1
				&& (((Class201) class201).aByte2409 & 0x2) == 0
				&& ((Class201) class201).anInt2408 == 0) {
				int i_1596_
				    = (((Class166_Sub3) this)
					   .aClass103_Sub2_9962.method15368
				       (((Class201) class201).aShort2411
					& 0xffff));
				class155.method3380
				    (true, true, false,
				     (float) (i_1593_ - i_1591_),
				     (float) (i_1593_ - i_1591_),
				     (float) i_1593_,
				     (float) (i_1592_ + i_1591_),
				     (float) i_1592_,
				     (float) (i_1592_ + i_1591_), 100.0F,
				     100.0F, 100.0F,
				     (float) Class639.method13606(i_1596_,
								  (((Class201)
								    class201)
								   .anInt2404),
								  1080124502),
				     (float) Class639.method13606(i_1596_,
								  (((Class201)
								    class201)
								   .anInt2405),
								  -125343685),
				     (float) Class639.method13606(i_1596_,
								  (((Class201)
								    class201)
								   .anInt2401),
								  1743969097));
				class155.method3380
				    (true, true, false, (float) i_1593_,
				     (float) i_1593_,
				     (float) (i_1593_ - i_1591_),
				     (float) i_1592_,
				     (float) (i_1592_ + i_1591_),
				     (float) i_1592_, 100.0F, 100.0F, 100.0F,
				     (float) Class639.method13606(i_1596_,
								  (((Class201)
								    class201)
								   .anInt2410),
								  1481287850),
				     (float) Class639.method13606(i_1596_,
								  (((Class201)
								    class201)
								   .anInt2401),
								  -1391734687),
				     (float) Class639.method13606(i_1596_,
								  (((Class201)
								    class201)
								   .anInt2405),
								  974129509));
			    } else if (((Class201) class201).anInt2408 == 0) {
				class155.method3385
				    (true, true, false,
				     (float) (i_1593_ - i_1591_),
				     (float) (i_1593_ - i_1591_),
				     (float) i_1593_,
				     (float) (i_1592_ + i_1591_),
				     (float) i_1592_,
				     (float) (i_1592_ + i_1591_), 100.0F,
				     100.0F, 100.0F,
				     ((Class201) class201).anInt2404,
				     ((Class201) class201).anInt2405,
				     ((Class201) class201).anInt2401);
				class155.method3385
				    (true, true, false, (float) i_1593_,
				     (float) i_1593_,
				     (float) (i_1593_ - i_1591_),
				     (float) i_1592_,
				     (float) (i_1592_ + i_1591_),
				     (float) i_1592_, 100.0F, 100.0F, 100.0F,
				     ((Class201) class201).anInt2410,
				     ((Class201) class201).anInt2401,
				     ((Class201) class201).anInt2405);
			    } else {
				int i_1597_ = ((Class201) class201).anInt2408;
				class155.method3385
				    (true, true, false,
				     (float) (i_1593_ - i_1591_),
				     (float) (i_1593_ - i_1591_),
				     (float) i_1593_,
				     (float) (i_1592_ + i_1591_),
				     (float) i_1592_,
				     (float) (i_1592_ + i_1591_), 100.0F,
				     100.0F, 100.0F,
				     (Class241_Sub18_Sub1.method17140
				      (i_1597_,
				       (((Class201) class201).anInt2404
					& ~0xffffff),
				       453976183)),
				     (Class241_Sub18_Sub1.method17140
				      (i_1597_,
				       (((Class201) class201).anInt2405
					& ~0xffffff),
				       -1563982066)),
				     (Class241_Sub18_Sub1.method17140
				      (i_1597_,
				       (((Class201) class201).anInt2401
					& ~0xffffff),
				       1451373950)));
				class155.method3385
				    (true, true, false, (float) i_1593_,
				     (float) i_1593_,
				     (float) (i_1593_ - i_1591_),
				     (float) i_1592_,
				     (float) (i_1592_ + i_1591_),
				     (float) i_1592_, 100.0F, 100.0F, 100.0F,
				     (Class241_Sub18_Sub1.method17140
				      (i_1597_,
				       (((Class201) class201).anInt2410
					& ~0xffffff),
				       -1031481451)),
				     (Class241_Sub18_Sub1.method17140
				      (i_1597_,
				       (((Class201) class201).anInt2401
					& ~0xffffff),
				       -472537808)),
				     (Class241_Sub18_Sub1.method17140
				      (i_1597_,
				       (((Class201) class201).anInt2405
					& ~0xffffff),
				       538633926)));
			    }
			} else if ((((Class166_Sub3) this)
				    .aClass183ArrayArray9969[i_1594_][i_1595_])
				   != null) {
			    Class183 class183
				= (((Class166_Sub3) this)
				   .aClass183ArrayArray9969[i_1594_][i_1595_]);
			    for (int i_1598_ = 0;
				 i_1598_ < ((Class183) class183).aShort2154;
				 i_1598_++) {
				fs[i_1598_]
				    = (float) (i_1592_
					       + ((((Class183) class183)
						   .aShortArray2156[i_1598_])
						  * i_1591_
						  / (anInt2053 * 2039042417)));
				fs_1589_[i_1598_]
				    = (float) (i_1593_
					       - ((((Class183) class183)
						   .aShortArray2158[i_1598_])
						  * i_1591_
						  / (anInt2053 * 2039042417)));
			    }
			    for (int i_1599_ = 0;
				 i_1599_ < ((Class183) class183).aShort2160;
				 i_1599_++) {
				int i_1600_ = i_1599_ * 3;
				int i_1601_ = i_1600_ + 1;
				int i_1602_ = i_1601_ + 1;
				float f = fs[i_1600_];
				float f_1603_ = fs[i_1601_];
				float f_1604_ = fs[i_1602_];
				float f_1605_ = fs_1589_[i_1600_];
				float f_1606_ = fs_1589_[i_1601_];
				float f_1607_ = fs_1589_[i_1602_];
				if ((((Class183) class183).anIntArray2155
				     != null)
				    && (((Class183) class183).anIntArray2155
					[i_1599_]) != 0
				    && ((((Class183) class183).aShortArray2161
					 == null)
					|| ((((Class183) class183)
					     .aShortArray2161) != null
					    && ((((Class183) class183)
						 .aShortArray2161[i_1599_])
						== -1)))) {
				    int i_1608_ = (((Class183) class183)
						   .anIntArray2155[i_1599_]);
				    class155.method3385
					(true, true, false, f_1605_, f_1606_,
					 f_1607_, f, f_1603_, f_1604_, 100.0F,
					 100.0F, 100.0F,
					 (Class241_Sub18_Sub1.method17140
					  (i_1608_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_1600_])
							& ~0xffffff),
					   707121168)),
					 (Class241_Sub18_Sub1.method17140
					  (i_1608_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_1601_])
							& ~0xffffff),
					   27291859)),
					 (Class241_Sub18_Sub1.method17140
					  (i_1608_,
					   -16777216 - ((((Class183) class183)
							 .anIntArray2163
							 [i_1602_])
							& ~0xffffff),
					   1451084048)));
				} else if ((((Class183) class183)
					    .aShortArray2161) != null
					   && ((((Class183) class183)
						.aShortArray2161[i_1599_])
					       != -1)) {
				    int i_1609_
					= (((Class166_Sub3) this)
					       .aClass103_Sub2_9962.method15368
					   ((((Class183) class183)
					     .aShortArray2161[i_1599_])
					    & 0xffff));
				    class155.method3380(true, true, false,
							f_1605_, f_1606_,
							f_1607_, f, f_1603_,
							f_1604_, 100.0F,
							100.0F, 100.0F,
							(float) i_1609_,
							(float) i_1609_,
							(float) i_1609_);
				} else
				    class155.method3385(true, true, false,
							f_1605_, f_1606_,
							f_1607_, f, f_1603_,
							f_1604_, 100.0F,
							100.0F, 100.0F,
							(((Class183) class183)
							 .anIntArray2163
							 [i_1600_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_1601_]),
							(((Class183) class183)
							 .anIntArray2163
							 [i_1602_]));
			    }
			}
		    } else if ((((Class166_Sub3) this).aClass143ArrayArray9979
				[i_1594_][i_1595_])
			       != null) {
			Class143 class143
			    = (((Class166_Sub3) this).aClass143ArrayArray9979
			       [i_1594_][i_1595_]);
			for (int i_1610_ = 0;
			     i_1610_ < ((Class143) class143).aShort1669;
			     i_1610_++) {
			    fs[i_1610_]
				= (float) (i_1592_
					   + ((((Class143) class143)
					       .aShortArray1666[i_1610_])
					      * i_1591_
					      / (anInt2053 * 2039042417)));
			    fs_1589_[i_1610_]
				= (float) (i_1593_
					   - ((((Class143) class143)
					       .aShortArray1664[i_1610_])
					      * i_1591_
					      / (anInt2053 * 2039042417)));
			}
			for (int i_1611_ = 0;
			     i_1611_ < ((Class143) class143).aShort1668;
			     i_1611_++) {
			    int i_1612_ = i_1611_ * 3;
			    int i_1613_ = i_1612_ + 1;
			    int i_1614_ = i_1613_ + 1;
			    float f = fs[i_1612_];
			    float f_1615_ = fs[i_1613_];
			    float f_1616_ = fs[i_1614_];
			    float f_1617_ = fs_1589_[i_1612_];
			    float f_1618_ = fs_1589_[i_1613_];
			    float f_1619_ = fs_1589_[i_1614_];
			    if (((Class143) class143).anIntArray1674 != null
				&& (((Class143) class143).anIntArray1674
				    [i_1611_]) != 0) {
				int i_1620_ = (((Class143) class143)
					       .anIntArray1674[i_1611_]);
				class155.method3385(true, true, false, f_1617_,
						    f_1618_, f_1619_, f,
						    f_1615_, f_1616_, 100.0F,
						    100.0F, 100.0F, i_1620_,
						    i_1620_, i_1620_);
			    } else
				class155.method3385(true, true, false, f_1617_,
						    f_1618_, f_1619_, f,
						    f_1615_, f_1616_, 100.0F,
						    100.0F, 100.0F,
						    (((Class143) class143)
						     .anIntArray1672[i_1612_]),
						    (((Class143) class143)
						     .anIntArray1672[i_1613_]),
						    (((Class143) class143)
						     .anIntArray1672
						     [i_1614_]));
			}
		    }
		}
		i_1593_ -= i_1591_;
	    }
	    i_1593_ = i_1583_ + i_1590_;
	    i_1592_ += i_1591_;
	}
	((Class155) class155).aBool1721 = true;
	((Class166_Sub3) this).aClass103_Sub2_9962.method2308(bool);
    }
    
    public void method3581(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_1621_, int i_1622_, int i_1623_,
			   boolean bool) {
	/* empty */
    }
    
    public void method3588(int i, int i_1624_, int i_1625_, boolean[][] bools,
			   boolean bool, int i_1626_) {
	if ((((Class103_Sub2) ((Class166_Sub3) this).aClass103_Sub2_9962)
	     .anIntArray9245) == null
	    || (((Class103_Sub2) ((Class166_Sub3) this).aClass103_Sub2_9962)
		.aFloatArray9248) == null)
	    throw new IllegalStateException("");
	Class268 class268
	    = (((Class103_Sub2) ((Class166_Sub3) this).aClass103_Sub2_9962)
	       .aClass268_9262);
	((Class166_Sub3) this).aFloat9981 = class268.aFloatArray4353[0];
	((Class166_Sub3) this).aFloat9973 = class268.aFloatArray4353[1];
	((Class166_Sub3) this).aFloat9976 = class268.aFloatArray4353[2];
	((Class166_Sub3) this).aFloat9977 = class268.aFloatArray4353[3];
	((Class166_Sub3) this).aFloat9978 = class268.aFloatArray4353[4];
	((Class166_Sub3) this).aFloat9965 = class268.aFloatArray4353[5];
	((Class166_Sub3) this).aFloat9980 = class268.aFloatArray4353[6];
	((Class166_Sub3) this).aFloat9989 = class268.aFloatArray4353[7];
	((Class166_Sub3) this).aFloat9982 = class268.aFloatArray4353[8];
	((Class166_Sub3) this).aFloat9983 = class268.aFloatArray4353[9];
	((Class166_Sub3) this).aFloat9984 = class268.aFloatArray4353[10];
	((Class166_Sub3) this).aFloat9985 = class268.aFloatArray4353[11];
	((Class166_Sub3) this).aFloat9986 = class268.aFloatArray4353[12];
	((Class166_Sub3) this).aFloat9987 = class268.aFloatArray4353[13];
	((Class166_Sub3) this).aFloat9988 = class268.aFloatArray4353[14];
	((Class166_Sub3) this).aFloat9974 = class268.aFloatArray4353[15];
	for (int i_1627_ = 0; i_1627_ < i_1625_ + i_1625_; i_1627_++) {
	    for (int i_1628_ = 0; i_1628_ < i_1625_ + i_1625_; i_1628_++) {
		if (bools[i_1627_][i_1628_]) {
		    int i_1629_ = i - i_1625_ + i_1627_;
		    int i_1630_ = i_1624_ - i_1625_ + i_1628_;
		    if (i_1629_ >= 0 && i_1629_ < anInt2055 * 266270313
			&& i_1630_ >= 0 && i_1630_ < anInt2052 * -14610189)
			method16240(i_1629_, i_1630_, i_1626_);
		}
	    }
	}
    }
}
