/* Class166 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class166
{
    public int[][] anIntArrayArray2051;
    public int anInt2052;
    public int anInt2053;
    public int anInt2054;
    public int anInt2055;
    
    public abstract void method3542(int i, int i_0_, int i_1_);
    
    public abstract void method3543(int i, int i_2_, int i_3_);
    
    public abstract void method3544(int i, int i_4_, int[] is, int[] is_5_,
				    int[] is_6_, int[] is_7_, int[] is_8_,
				    int[] is_9_, int[] is_10_, int[] is_11_,
				    Class86 class86, boolean bool);
    
    public abstract boolean method3545
	(Class241_Sub39_Sub17 class241_sub39_sub17, int i, int i_12_,
	 int i_13_, int i_14_, boolean bool);
    
    public abstract void method3546(Class241_Sub39_Sub17 class241_sub39_sub17,
				    int i, int i_15_, int i_16_, int i_17_,
				    boolean bool);
    
    public abstract void method3547(int i, int i_18_, int i_19_,
				    boolean[][] bools, boolean bool,
				    int i_20_);
    
    public abstract void method3548(int i, int i_21_, int i_22_, int i_23_,
				    int i_24_, int i_25_, int i_26_,
				    boolean[][] bools);
    
    public abstract void method3549(Class241_Sub39_Sub17 class241_sub39_sub17,
				    int i, int i_27_, int i_28_, int i_29_,
				    boolean bool);
    
    public final int method3550(int i, int i_30_, int i_31_) {
	int i_32_ = i >> -122333825 * anInt2054;
	int i_33_ = i_30_ >> anInt2054 * -122333825;
	i_32_ = Math.min(anInt2055 * 266270313 - 1, Math.max(0, i_32_));
	i_33_ = Math.min(anInt2052 * -14610189 - 1, Math.max(0, i_33_));
	int i_34_ = Math.min(anInt2055 * 266270313 - 1, 1 + i_32_);
	int i_35_ = Math.min(-14610189 * anInt2052 - 1, i_33_ + 1);
	int i_36_ = i & 2039042417 * anInt2053 - 1;
	int i_37_ = i_30_ & anInt2053 * 2039042417 - 1;
	int i_38_ = ((anIntArrayArray2051[i_34_][i_33_] * i_36_
		      + ((anInt2053 * 2039042417 - i_36_)
			 * anIntArrayArray2051[i_32_][i_33_]))
		     >> -122333825 * anInt2054);
	int i_39_
	    = ((anIntArrayArray2051[i_34_][i_35_] * i_36_
		+ anIntArrayArray2051[i_32_][i_35_] * (anInt2053 * 2039042417
						       - i_36_))
	       >> anInt2054 * -122333825);
	return (i_39_ * i_37_ + i_38_ * (anInt2053 * 2039042417 - i_37_)
		>> -122333825 * anInt2054);
    }
    
    public final int method3551(int i, int i_40_, int i_41_) {
	return anIntArrayArray2051[i][i_40_];
    }
    
    public abstract boolean method3552
	(Class241_Sub39_Sub17 class241_sub39_sub17, int i, int i_42_,
	 int i_43_, int i_44_, boolean bool);
    
    public abstract Class241_Sub39_Sub17 method3553
	(int i, int i_45_, Class241_Sub39_Sub17 class241_sub39_sub17);
    
    public abstract void method3554(Class241_Sub39_Sub17 class241_sub39_sub17,
				    int i, int i_46_, int i_47_, int i_48_,
				    boolean bool);
    
    public abstract void method3555(Class241_Sub39_Sub17 class241_sub39_sub17,
				    int i, int i_49_, int i_50_, int i_51_,
				    boolean bool);
    
    public abstract boolean method3556
	(Class241_Sub39_Sub17 class241_sub39_sub17, int i, int i_52_,
	 int i_53_, int i_54_, boolean bool);
    
    public abstract void method3557(Class241_Sub43 class241_sub43, int[] is);
    
    public abstract void method3558(int i, int i_55_, int i_56_);
    
    public abstract Class241_Sub39_Sub17 method3559
	(int i, int i_57_, Class241_Sub39_Sub17 class241_sub39_sub17);
    
    Class166(int i, int i_58_, int i_59_, int[][] is) {
	anInt2055 = i * 1930295769;
	anInt2052 = i_58_ * 1814071355;
	int i_60_ = 0;
	for (/**/; i_59_ > 1; i_59_ >>= 1)
	    i_60_++;
	anInt2053 = -16298095 * (1 << i_60_);
	anInt2054 = -1319343489 * i_60_;
	anIntArrayArray2051 = is;
    }
    
    public abstract void method3560
	(int i, int i_61_, int[] is, int[] is_62_, int[] is_63_, int[] is_64_,
	 int[] is_65_, int[] is_66_, int[] is_67_, int[] is_68_, int[] is_69_,
	 int[] is_70_, int[] is_71_, Class86 class86, boolean bool);
    
    public abstract void method3561(Class241_Sub39_Sub17 class241_sub39_sub17,
				    int i, int i_72_, int i_73_, int i_74_,
				    boolean bool);
    
    public abstract void method3562
	(int i, int i_75_, int[] is, int[] is_76_, int[] is_77_, int[] is_78_,
	 int[] is_79_, int[] is_80_, int[] is_81_, int[] is_82_, int[] is_83_,
	 int[] is_84_, int[] is_85_, Class86 class86, boolean bool);
    
    public abstract void method3563
	(int i, int i_86_, int[] is, int[] is_87_, int[] is_88_, int[] is_89_,
	 int[] is_90_, int[] is_91_, int[] is_92_, int[] is_93_, int[] is_94_,
	 int[] is_95_, int[] is_96_, Class86 class86, boolean bool);
    
    public abstract void method3564();
    
    public abstract void method3565();
    
    public abstract void method3566(int i, int i_97_, int i_98_, int i_99_,
				    int i_100_, int i_101_, int i_102_,
				    boolean[][] bools);
    
    public abstract void method3567
	(int i, int i_103_, int[] is, int[] is_104_, int[] is_105_,
	 int[] is_106_, int[] is_107_, int[] is_108_, int[] is_109_,
	 int[] is_110_, int[] is_111_, int[] is_112_, int[] is_113_,
	 Class86 class86, boolean bool);
    
    public abstract void method3568
	(int i, int i_114_, int[] is, int[] is_115_, int[] is_116_,
	 int[] is_117_, int[] is_118_, int[] is_119_, int[] is_120_,
	 int[] is_121_, int[] is_122_, int[] is_123_, int[] is_124_,
	 Class86 class86, boolean bool);
    
    public abstract void method3569(Class241_Sub39_Sub17 class241_sub39_sub17,
				    int i, int i_125_, int i_126_, int i_127_,
				    boolean bool);
    
    public abstract Class241_Sub39_Sub17 method3570
	(int i, int i_128_, Class241_Sub39_Sub17 class241_sub39_sub17);
    
    public abstract Class241_Sub39_Sub17 method3571
	(int i, int i_129_, Class241_Sub39_Sub17 class241_sub39_sub17);
    
    public abstract void method3572(Class241_Sub39_Sub17 class241_sub39_sub17,
				    int i, int i_130_, int i_131_, int i_132_,
				    boolean bool);
    
    public abstract void method3573
	(int i, int i_133_, int[] is, int[] is_134_, int[] is_135_,
	 int[] is_136_, int[] is_137_, int[] is_138_, int[] is_139_,
	 int[] is_140_, Class86 class86, boolean bool);
    
    public final int method3574(int i, int i_141_, int i_142_) {
	int i_143_ = i >> -122333825 * anInt2054;
	int i_144_ = i_141_ >> -122333825 * anInt2054;
	if (i_143_ < 0 || i_144_ < 0 || i_143_ > anInt2055 * 266270313 - 1
	    || i_144_ > anInt2052 * -14610189 - 1)
	    return 0;
	int i_145_ = i & anInt2053 * 2039042417 - 1;
	int i_146_ = i_141_ & anInt2053 * 2039042417 - 1;
	int i_147_
	    = ((anIntArrayArray2051[i_143_][i_144_] * (anInt2053 * 2039042417
						       - i_145_)
		+ anIntArrayArray2051[i_143_ + 1][i_144_] * i_145_)
	       >> -122333825 * anInt2054);
	int i_148_ = ((anIntArrayArray2051[1 + i_143_][1 + i_144_] * i_145_
		       + (anIntArrayArray2051[i_143_][1 + i_144_]
			  * (2039042417 * anInt2053 - i_145_)))
		      >> -122333825 * anInt2054);
	return ((anInt2053 * 2039042417 - i_146_) * i_147_ + i_146_ * i_148_
		>> -122333825 * anInt2054);
    }
    
    public abstract void method3575(Class241_Sub43 class241_sub43, int[] is);
    
    public abstract void method3576(int i, int i_149_, int i_150_, int i_151_,
				    int i_152_, int i_153_, int i_154_,
				    boolean[][] bools);
    
    public final int method3577(int i, int i_155_, int i_156_) {
	return (anIntArrayArray2051
		[Math.min(266270313 * anInt2055 - 1, Math.max(0, i))]
		[Math.min(anInt2052 * -14610189 - 1, Math.max(0, i_155_))]);
    }
    
    public abstract Class241_Sub39_Sub17 method3578
	(int i, int i_157_, Class241_Sub39_Sub17 class241_sub39_sub17);
    
    public abstract void method3579();
    
    public abstract void method3580(Class241_Sub43 class241_sub43, int[] is);
    
    public abstract void method3581(Class241_Sub39_Sub17 class241_sub39_sub17,
				    int i, int i_158_, int i_159_, int i_160_,
				    boolean bool);
    
    public final int method3582(int i, int i_161_) {
	int i_162_ = i >> -122333825 * anInt2054;
	int i_163_ = i_161_ >> -122333825 * anInt2054;
	if (i_162_ < 0 || i_163_ < 0 || i_162_ > anInt2055 * 266270313 - 1
	    || i_163_ > anInt2052 * -14610189 - 1)
	    return 0;
	int i_164_ = i & anInt2053 * 2039042417 - 1;
	int i_165_ = i_161_ & anInt2053 * 2039042417 - 1;
	int i_166_
	    = ((anIntArrayArray2051[i_162_][i_163_] * (anInt2053 * 2039042417
						       - i_164_)
		+ anIntArrayArray2051[i_162_ + 1][i_163_] * i_164_)
	       >> -122333825 * anInt2054);
	int i_167_ = ((anIntArrayArray2051[1 + i_162_][1 + i_163_] * i_164_
		       + (anIntArrayArray2051[i_162_][1 + i_163_]
			  * (2039042417 * anInt2053 - i_164_)))
		      >> -122333825 * anInt2054);
	return ((anInt2053 * 2039042417 - i_165_) * i_166_ + i_165_ * i_167_
		>> -122333825 * anInt2054);
    }
    
    public final int method3583(int i, int i_168_) {
	int i_169_ = i >> -122333825 * anInt2054;
	int i_170_ = i_168_ >> -122333825 * anInt2054;
	if (i_169_ < 0 || i_170_ < 0 || i_169_ > anInt2055 * 266270313 - 1
	    || i_170_ > anInt2052 * -14610189 - 1)
	    return 0;
	int i_171_ = i & anInt2053 * 2039042417 - 1;
	int i_172_ = i_168_ & anInt2053 * 2039042417 - 1;
	int i_173_
	    = ((anIntArrayArray2051[i_169_][i_170_] * (anInt2053 * 2039042417
						       - i_171_)
		+ anIntArrayArray2051[i_169_ + 1][i_170_] * i_171_)
	       >> -122333825 * anInt2054);
	int i_174_ = ((anIntArrayArray2051[1 + i_169_][1 + i_170_] * i_171_
		       + (anIntArrayArray2051[i_169_][1 + i_170_]
			  * (2039042417 * anInt2053 - i_171_)))
		      >> -122333825 * anInt2054);
	return ((anInt2053 * 2039042417 - i_172_) * i_173_ + i_172_ * i_174_
		>> -122333825 * anInt2054);
    }
    
    public final int method3584(int i, int i_175_) {
	int i_176_ = i >> -122333825 * anInt2054;
	int i_177_ = i_175_ >> anInt2054 * -122333825;
	i_176_ = Math.min(anInt2055 * 266270313 - 1, Math.max(0, i_176_));
	i_177_ = Math.min(anInt2052 * -14610189 - 1, Math.max(0, i_177_));
	int i_178_ = Math.min(anInt2055 * 266270313 - 1, 1 + i_176_);
	int i_179_ = Math.min(-14610189 * anInt2052 - 1, i_177_ + 1);
	int i_180_ = i & 2039042417 * anInt2053 - 1;
	int i_181_ = i_175_ & anInt2053 * 2039042417 - 1;
	int i_182_ = ((anIntArrayArray2051[i_178_][i_177_] * i_180_
		       + ((anInt2053 * 2039042417 - i_180_)
			  * anIntArrayArray2051[i_176_][i_177_]))
		      >> -122333825 * anInt2054);
	int i_183_
	    = ((anIntArrayArray2051[i_178_][i_179_] * i_180_
		+ anIntArrayArray2051[i_176_][i_179_] * (anInt2053 * 2039042417
							 - i_180_))
	       >> anInt2054 * -122333825);
	return (i_183_ * i_181_ + i_182_ * (anInt2053 * 2039042417 - i_181_)
		>> -122333825 * anInt2054);
    }
    
    public final int method3585(int i, int i_184_) {
	return anIntArrayArray2051[i][i_184_];
    }
    
    public final int method3586(int i, int i_185_) {
	return anIntArrayArray2051[i][i_185_];
    }
    
    public final int method3587(int i, int i_186_) {
	return (anIntArrayArray2051
		[Math.min(266270313 * anInt2055 - 1, Math.max(0, i))]
		[Math.min(anInt2052 * -14610189 - 1, Math.max(0, i_186_))]);
    }
    
    public abstract void method3588(int i, int i_187_, int i_188_,
				    boolean[][] bools, boolean bool,
				    int i_189_);
    
    public static void method3589(int i, int i_190_) {
	InterfaceComponent.anInt832 = -237831235 * i;
	InterfaceComponent.aClass129_863.reset(-1283127113);
    }
    
    static final void method3590(ClientScriptData class454, int i) {
	int i_191_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (Class409.aClass617_5932.list(i_191_, (byte) 90)
	       .size) * 295370337;
    }
    
    static final void method3591(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 531284545 * ((ClientScriptData) class454).clanSettings.replacementOwnerSlot;
    }
    
    static final void method3592(ClientScriptData class454, byte i) {
	Class5.method492(-1782846696);
    }
}
