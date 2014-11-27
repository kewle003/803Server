/* Class166_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public class Class166_Sub2 extends Class166
{
    int[][][] anIntArrayArrayArray9804;
    static final int anInt9805 = 74;
    float[][] aFloatArrayArray9806;
    int anInt9807;
    int anInt9808;
    Class151 aClass151_9809;
    int anInt9810;
    int anInt9811;
    int anInt9812;
    Class103_Sub1 aClass103_Sub1_9813;
    Class241_Sub45[][][] aClass241_Sub45ArrayArrayArray9814;
    int[][][] anIntArrayArrayArray9815;
    int[][][] anIntArrayArrayArray9816;
    int[][][] anIntArrayArrayArray9817;
    int[][][] anIntArrayArrayArray9818;
    int anInt9819;
    int[][][] anIntArrayArrayArray9820;
    float[][] aFloatArrayArray9821;
    Class159 aClass159_9822;
    NodeCollection aClass429_9823 = new NodeCollection();
    Node[] aClass241Array9824;
    Interface8 anInterface8_9825;
    Class151 aClass151_9826;
    static final int anInt9827 = 1;
    Class151 aClass151_9828;
    short[][] aShortArrayArray9829;
    Class151 aClass151_9830;
    int anInt9831;
    byte[][] aByteArrayArray9832;
    float[][] aFloatArrayArray9833;
    int anInt9834;
    HashTable aClass407_9835;
    byte[][] aByteArrayArray9836;
    static float[] aFloatArray9837 = new float[16];
    
    void method16156(Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2,
		     int i, int i_0_) {
	int[] is = ((Class166_Sub2) this).anIntArrayArrayArray9816[i][i_0_];
	int[] is_1_ = ((Class166_Sub2) this).anIntArrayArrayArray9818[i][i_0_];
	int i_2_ = is.length;
	if ((((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
	     .anIntArray9232).length
	    < i_2_) {
	    ((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		.anIntArray9232
		= new int[i_2_];
	    ((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		.anIntArray9175
		= new int[i_2_];
	}
	int[] is_3_
	    = (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
	       .anIntArray9232);
	int[] is_4_
	    = (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
	       .anIntArray9175);
	for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
	    is_3_[i_5_] = is[i_5_] >> (((Class103_Sub1) (((Class166_Sub2) this)
							 .aClass103_Sub1_9813))
				       .anInt9093);
	    is_4_[i_5_]
		= is_1_[i_5_] >> (((Class103_Sub1)
				   ((Class166_Sub2) this).aClass103_Sub1_9813)
				  .anInt9093);
	}
	int i_6_ = 0;
	while (i_6_ < i_2_) {
	    int i_7_ = is_3_[i_6_];
	    int i_8_ = is_4_[i_6_++];
	    int i_9_ = is_3_[i_6_];
	    int i_10_ = is_4_[i_6_++];
	    int i_11_ = is_3_[i_6_];
	    int i_12_ = is_4_[i_6_++];
	    if ((i_7_ - i_9_) * (i_10_ - i_12_) - (i_10_ - i_8_) * (i_11_
								    - i_9_)
		> 0)
		class241_sub39_sub17_sub2.method17914(i_8_, i_10_, i_12_, i_7_,
						      i_9_, i_11_);
	}
    }
    
    public void method3543(int i, int i_13_, int i_14_) {
		i = Math.min(((Class166_Sub2) this).aByteArrayArray9832.length - 1,
			     Math.max(0, i));
		i_13_ = Math.min((((Class166_Sub2) this).aByteArrayArray9832[i].length
				  - 1),
				 Math.max(0, i_13_));
		if ((((Class166_Sub2) this).aByteArrayArray9832[i][i_13_] & 0xff) < i_14_)
		    ((Class166_Sub2) this).aByteArrayArray9832[i][i_13_] = (byte) i_14_;
    }
    
    public void method3544(int i, int i_15_, int[] is, int[] is_16_,
			   int[] is_17_, int[] is_18_, int[] is_19_,
			   int[] is_20_, int[] is_21_, int[] is_22_,
			   Class86 class86, boolean bool) {
	Class107 class107
	    = ((Class166_Sub2) this).aClass103_Sub1_9813.aClass107_1458;
	if (is_18_ != null
	    && ((Class166_Sub2) this).anIntArrayArrayArray9820 == null)
	    ((Class166_Sub2) this).anIntArrayArrayArray9820
		= new int[anInt2055 * 266270313][anInt2052 * -14610189][];
	if (is_16_ != null
	    && ((Class166_Sub2) this).anIntArrayArrayArray9804 == null)
	    ((Class166_Sub2) this).anIntArrayArrayArray9804
		= new int[anInt2055 * 266270313][anInt2052 * -14610189][];
	((Class166_Sub2) this).anIntArrayArrayArray9816[i][i_15_] = is;
	((Class166_Sub2) this).anIntArrayArrayArray9818[i][i_15_] = is_17_;
	((Class166_Sub2) this).anIntArrayArrayArray9815[i][i_15_] = is_19_;
	((Class166_Sub2) this).anIntArrayArrayArray9817[i][i_15_] = is_20_;
	if (((Class166_Sub2) this).anIntArrayArrayArray9820 != null)
	    ((Class166_Sub2) this).anIntArrayArrayArray9820[i][i_15_] = is_18_;
	if (((Class166_Sub2) this).anIntArrayArrayArray9804 != null)
	    ((Class166_Sub2) this).anIntArrayArrayArray9804[i][i_15_] = is_16_;
	Class241_Sub45[] class241_sub45s
	    = (((Class166_Sub2) this).aClass241_Sub45ArrayArrayArray9814[i]
		   [i_15_]
	       = new Class241_Sub45[is_19_.length]);
	for (int i_23_ = 0; i_23_ < is_19_.length; i_23_++) {
	    int i_24_ = is_21_[i_23_];
	    int i_25_ = is_22_[i_23_];
	    if ((((Class166_Sub2) this).anInt9810 & 0x20) != 0 && i_24_ != -1
		&& class107.method2680(i_24_, 862451150).aBool1434) {
		i_25_ = 128;
		i_24_ = -1;
	    }
	    long l = ((long) (class86.anInt1253 * 642800105) << 48
		      | (long) (class86.anInt1252 * -1282025259) << 42
		      | (long) (class86.anInt1251 * 1897985763) << 28
		      | (long) (i_25_ << 14) | (long) i_24_);
	    Node class241;
	    for (class241
		     = ((Class166_Sub2) this).aClass407_9835.get(l);
		 class241 != null;
		 class241 = ((Class166_Sub2) this).aClass407_9835
				.method7289((byte) -27)) {
		Class241_Sub45 class241_sub45 = (Class241_Sub45) class241;
		if (((Class241_Sub45) class241_sub45).anInt10192 == i_24_
		    && (((Class241_Sub45) class241_sub45).aFloat10187
			== (float) i_25_)
		    && ((Class241_Sub45) class241_sub45).aClass86_10193
			   .method1849(class86, 352070048))
		    break;
	    }
	    if (class241 == null) {
		class241_sub45s[i_23_]
		    = new Class241_Sub45(this, i_24_, i_25_, class86);
		((Class166_Sub2) this).aClass407_9835
		    .put(class241_sub45s[i_23_], l);
	    } else
		class241_sub45s[i_23_] = (Class241_Sub45) class241;
	}
	if (bool)
	    ((Class166_Sub2) this).aByteArrayArray9836[i][i_15_] |= 0x1;
	if (is_19_.length > ((Class166_Sub2) this).anInt9831)
	    ((Class166_Sub2) this).anInt9831 = is_19_.length;
	((Class166_Sub2) this).anInt9834 += is_19_.length;
    }
    
    public void method3568
	(int i, int i_26_, int[] is, int[] is_27_, int[] is_28_, int[] is_29_,
	 int[] is_30_, int[] is_31_, int[] is_32_, int[] is_33_, int[] is_34_,
	 int[] is_35_, int[] is_36_, Class86 class86, boolean bool) {
	int i_37_ = is_33_.length;
	int[] is_38_ = new int[i_37_ * 3];
	int[] is_39_ = new int[i_37_ * 3];
	int[] is_40_ = new int[i_37_ * 3];
	int[] is_41_ = is_34_ != null ? new int[i_37_ * 3] : null;
	int[] is_42_ = new int[i_37_ * 3];
	int[] is_43_ = new int[i_37_ * 3];
	int[] is_44_ = is_27_ != null ? new int[i_37_ * 3] : null;
	int[] is_45_ = is_29_ != null ? new int[i_37_ * 3] : null;
	int i_46_ = 0;
	for (int i_47_ = 0; i_47_ < i_37_; i_47_++) {
	    int i_48_ = is_30_[i_47_];
	    int i_49_ = is_31_[i_47_];
	    int i_50_ = is_32_[i_47_];
	    is_38_[i_46_] = is[i_48_];
	    is_39_[i_46_] = is_28_[i_48_];
	    is_40_[i_46_] = is_33_[i_47_];
	    is_42_[i_46_] = is_35_[i_47_];
	    is_43_[i_46_] = is_36_[i_47_];
	    if (is_34_ != null)
		is_41_[i_46_] = is_34_[i_47_];
	    if (is_27_ != null)
		is_44_[i_46_] = is_27_[i_48_];
	    if (is_29_ != null)
		is_45_[i_46_] = is_29_[i_48_];
	    i_46_++;
	    is_38_[i_46_] = is[i_49_];
	    is_39_[i_46_] = is_28_[i_49_];
	    is_40_[i_46_] = is_33_[i_47_];
	    is_42_[i_46_] = is_35_[i_47_];
	    is_43_[i_46_] = is_36_[i_47_];
	    if (is_34_ != null)
		is_41_[i_46_] = is_34_[i_47_];
	    if (is_27_ != null)
		is_44_[i_46_] = is_27_[i_49_];
	    if (is_29_ != null)
		is_45_[i_46_] = is_29_[i_49_];
	    i_46_++;
	    is_38_[i_46_] = is[i_50_];
	    is_39_[i_46_] = is_28_[i_50_];
	    is_40_[i_46_] = is_33_[i_47_];
	    is_42_[i_46_] = is_35_[i_47_];
	    is_43_[i_46_] = is_36_[i_47_];
	    if (is_34_ != null)
		is_41_[i_46_] = is_34_[i_47_];
	    if (is_27_ != null)
		is_44_[i_46_] = is_27_[i_50_];
	    if (is_29_ != null)
		is_45_[i_46_] = is_29_[i_50_];
	    i_46_++;
	}
	method3544(i, i_26_, is_38_, is_44_, is_39_, is_45_, is_40_, is_41_,
		   is_42_, is_43_, class86, bool);
    }
    
    public void method3563
	(int i, int i_51_, int[] is, int[] is_52_, int[] is_53_, int[] is_54_,
	 int[] is_55_, int[] is_56_, int[] is_57_, int[] is_58_, int[] is_59_,
	 int[] is_60_, int[] is_61_, Class86 class86, boolean bool) {
	int i_62_ = is_58_.length;
	int[] is_63_ = new int[i_62_ * 3];
	int[] is_64_ = new int[i_62_ * 3];
	int[] is_65_ = new int[i_62_ * 3];
	int[] is_66_ = is_59_ != null ? new int[i_62_ * 3] : null;
	int[] is_67_ = new int[i_62_ * 3];
	int[] is_68_ = new int[i_62_ * 3];
	int[] is_69_ = is_52_ != null ? new int[i_62_ * 3] : null;
	int[] is_70_ = is_54_ != null ? new int[i_62_ * 3] : null;
	int i_71_ = 0;
	for (int i_72_ = 0; i_72_ < i_62_; i_72_++) {
	    int i_73_ = is_55_[i_72_];
	    int i_74_ = is_56_[i_72_];
	    int i_75_ = is_57_[i_72_];
	    is_63_[i_71_] = is[i_73_];
	    is_64_[i_71_] = is_53_[i_73_];
	    is_65_[i_71_] = is_58_[i_72_];
	    is_67_[i_71_] = is_60_[i_72_];
	    is_68_[i_71_] = is_61_[i_72_];
	    if (is_59_ != null)
		is_66_[i_71_] = is_59_[i_72_];
	    if (is_52_ != null)
		is_69_[i_71_] = is_52_[i_73_];
	    if (is_54_ != null)
		is_70_[i_71_] = is_54_[i_73_];
	    i_71_++;
	    is_63_[i_71_] = is[i_74_];
	    is_64_[i_71_] = is_53_[i_74_];
	    is_65_[i_71_] = is_58_[i_72_];
	    is_67_[i_71_] = is_60_[i_72_];
	    is_68_[i_71_] = is_61_[i_72_];
	    if (is_59_ != null)
		is_66_[i_71_] = is_59_[i_72_];
	    if (is_52_ != null)
		is_69_[i_71_] = is_52_[i_74_];
	    if (is_54_ != null)
		is_70_[i_71_] = is_54_[i_74_];
	    i_71_++;
	    is_63_[i_71_] = is[i_75_];
	    is_64_[i_71_] = is_53_[i_75_];
	    is_65_[i_71_] = is_58_[i_72_];
	    is_67_[i_71_] = is_60_[i_72_];
	    is_68_[i_71_] = is_61_[i_72_];
	    if (is_59_ != null)
		is_66_[i_71_] = is_59_[i_72_];
	    if (is_52_ != null)
		is_69_[i_71_] = is_52_[i_75_];
	    if (is_54_ != null)
		is_70_[i_71_] = is_54_[i_75_];
	    i_71_++;
	}
	method3544(i, i_51_, is_63_, is_69_, is_64_, is_70_, is_65_, is_66_,
		   is_67_, is_68_, class86, bool);
    }
    
    public void method3547(int i, int i_76_, int i_77_, boolean[][] bools,
			   boolean bool, int i_78_) {
	method16157(i, i_76_, i_77_, bools, bool, i_78_);
    }
    
    void method16157(int i, int i_79_, int i_80_, boolean[][] bools,
		     boolean bool, int i_81_) {
	if (((Class166_Sub2) this).aClass241Array9824 != null) {
	    int i_82_ = i_80_ + i_80_ + 1;
	    i_82_ *= i_82_;
	    if ((((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		 .anIntArray9051).length
		< i_82_)
		((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		    .anIntArray9051
		    = new int[i_82_];
	    if ((((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		 .aClass241_Sub3_Sub2_9231.payload).length
		< ((Class166_Sub2) this).anInt9811 * 2)
		((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		    .aClass241_Sub3_Sub2_9231
		    = new Class241_Sub3_Sub2(((Class166_Sub2) this).anInt9811
					     * 2);
	    int i_83_ = i - i_80_;
	    int i_84_ = i_83_;
	    if (i_83_ < 0)
		i_83_ = 0;
	    int i_85_ = i_79_ - i_80_;
	    int i_86_ = i_85_;
	    if (i_85_ < 0)
		i_85_ = 0;
	    int i_87_ = i + i_80_;
	    if (i_87_ > anInt2055 * 266270313 - 1)
		i_87_ = anInt2055 * 266270313 - 1;
	    int i_88_ = i_79_ + i_80_;
	    if (i_88_ > anInt2052 * -14610189 - 1)
		i_88_ = anInt2052 * -14610189 - 1;
	    int i_89_ = 0;
	    int[] is
		= (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		   .anIntArray9051);
	    for (int i_90_ = i_83_; i_90_ <= i_87_; i_90_++) {
		boolean[] bools_91_ = bools[i_90_ - i_84_];
		for (int i_92_ = i_85_; i_92_ <= i_88_; i_92_++) {
		    if (bools_91_[i_92_ - i_86_])
			is[i_89_++] = i_92_ * (anInt2055 * 266270313) + i_90_;
		}
	    }
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15259();
	    ((Class166_Sub2) this).aClass103_Sub1_9813
		.method15186((((Class166_Sub2) this).anInt9810 & 0x7) != 0);
	    for (int i_93_ = 0;
		 i_93_ < ((Class166_Sub2) this).aClass241Array9824.length - 0;
		 i_93_++)
		((Class241_Sub45)
		 ((Class166_Sub2) this).aClass241Array9824[i_93_])
		    .method16494(is, i_89_);
	    if (!((Class166_Sub2) this).aClass429_9823
		     .isEmpty(1437111974)) {
		int i_94_ = (((Class103_Sub1)
			      ((Class166_Sub2) this).aClass103_Sub1_9813)
			     .anInt9111);
		int i_95_ = (((Class103_Sub1)
			      ((Class166_Sub2) this).aClass103_Sub1_9813)
			     .anInt9172);
		((Class166_Sub2) this).aClass103_Sub1_9813.method2314
		    (0, i_95_,
		     ((Class103_Sub1)
		      ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9173);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15186(false);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15190(false);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15192(128);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15173(-2);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15177
		    (((Class103_Sub1)
		      ((Class166_Sub2) this).aClass103_Sub1_9813)
		     .aClass142_Sub4_9190);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15180(8448,
								       7681);
		((Class166_Sub2) this).aClass103_Sub1_9813
		    .method15181(0, 34166, 770);
		((Class166_Sub2) this).aClass103_Sub1_9813
		    .method15352(0, 34167, 770);
		for (Node class241 = ((Class166_Sub2) this)
					     .aClass429_9823
					     .method7694(16711935);
		     class241 != null;
		     class241 = ((Class166_Sub2) this).aClass429_9823
				    .method7692(950094751)) {
		    Class241_Sub36 class241_sub36 = (Class241_Sub36) class241;
		    class241_sub36.method16412(i, i_79_, i_80_, bools);
		}
		((Class166_Sub2) this).aClass103_Sub1_9813.method15181(0, 5890,
								       768);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15352(0, 5890,
								       770);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15177(null);
		((Class166_Sub2) this).aClass103_Sub1_9813.method2314
		    (i_94_, i_95_,
		     ((Class103_Sub1)
		      ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9173);
	    }
	    if (((Class166_Sub2) this).aClass159_9822 != null) {
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15168
		    (((Class166_Sub2) this).aClass151_9826, null, null,
		     ((Class166_Sub2) this).aClass151_9830);
		((Class166_Sub2) this).aClass159_9822
		    .method3410(i, i_79_, i_80_, bools, bool);
		OpenGL.glPopMatrix();
	    }
	}
    }
    
    public void method3548(int i, int i_96_, int i_97_, int i_98_, int i_99_,
			   int i_100_, int i_101_, boolean[][] bools) {
	Class105 class105
	    = ((Class166_Sub2) this).aClass103_Sub1_9813.method2237((byte) 4);
	if (((Class166_Sub2) this).anInt9834 > 0 && class105 != null) {
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15145();
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15185(false);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15186(false);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15189(false);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15190(false);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15192(0);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15173(-2);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15177(null);
	    aFloatArray9837[0]
		= (float) i_97_ / (128.0F * (float) (anInt2053 * 2039042417)
				   * (float) class105.method2655());
	    aFloatArray9837[1] = 0.0F;
	    aFloatArray9837[2] = 0.0F;
	    aFloatArray9837[3] = 0.0F;
	    aFloatArray9837[4] = 0.0F;
	    aFloatArray9837[5]
		= (float) i_97_ / (128.0F * (float) (anInt2053 * 2039042417)
				   * (float) class105.method2654());
	    aFloatArray9837[6] = 0.0F;
	    aFloatArray9837[7] = 0.0F;
	    aFloatArray9837[8] = 0.0F;
	    aFloatArray9837[9] = 0.0F;
	    aFloatArray9837[10] = 0.0F;
	    aFloatArray9837[11] = 0.0F;
	    aFloatArray9837[12]
		= -1.0F - (((float) (i_98_ * i_97_) / 128.0F - (float) (i * 2))
			   / (float) class105.method2655());
	    aFloatArray9837[13] = 1.0F - (((float) (2 * i_96_)
					   + (float) (i_101_ * i_97_) / 128.0F)
					  / (float) class105.method2654());
	    aFloatArray9837[14] = 0.0F;
	    aFloatArray9837[15] = 1.0F;
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glLoadMatrixf(aFloatArray9837, 0);
	    aFloatArray9837[0] = 1.0F;
	    aFloatArray9837[1] = 0.0F;
	    aFloatArray9837[2] = 0.0F;
	    aFloatArray9837[3] = 0.0F;
	    aFloatArray9837[4] = 0.0F;
	    aFloatArray9837[5] = 0.0F;
	    aFloatArray9837[6] = 1.0F;
	    aFloatArray9837[7] = 0.0F;
	    aFloatArray9837[8] = 0.0F;
	    aFloatArray9837[9] = 1.0F;
	    aFloatArray9837[10] = 0.0F;
	    aFloatArray9837[11] = 0.0F;
	    aFloatArray9837[12] = 0.0F;
	    aFloatArray9837[13] = 0.0F;
	    aFloatArray9837[14] = 0.0F;
	    aFloatArray9837[15] = 1.0F;
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glLoadMatrixf(aFloatArray9837, 0);
	    if ((((Class166_Sub2) this).anInt9810 & 0x7) != 0) {
		((Class166_Sub2) this).aClass103_Sub1_9813.method15186(true);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15126();
	    } else
		((Class166_Sub2) this).aClass103_Sub1_9813.method15186(false);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15168
		(((Class166_Sub2) this).aClass151_9826,
		 ((Class166_Sub2) this).aClass151_9828,
		 ((Class166_Sub2) this).aClass151_9809,
		 ((Class166_Sub2) this).aClass151_9830);
	    if ((((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		 .aClass241_Sub3_Sub2_9231.payload).length
		< ((Class166_Sub2) this).anInt9811 * 2)
		((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		    .aClass241_Sub3_Sub2_9231
		    = new Class241_Sub3_Sub2(((Class166_Sub2) this).anInt9811
					     * 2);
	    else
		((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		    .aClass241_Sub3_Sub2_9231.pointer
		    = 0;
	    int i_102_ = 0;
	    Class241_Sub3_Sub2 class241_sub3_sub2
		= (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		   .aClass241_Sub3_Sub2_9231);
	    if (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		.aBool9144) {
		for (int i_103_ = i_99_; i_103_ < i_101_; i_103_++) {
		    int i_104_ = i_103_ * (anInt2055 * 266270313) + i_98_;
		    for (int i_105_ = i_98_; i_105_ < i_100_; i_105_++) {
			if (bools[i_105_ - i_98_][i_103_ - i_99_]) {
			    short[] is = (((Class166_Sub2) this)
					  .aShortArrayArray9829[i_104_]);
			    if (is != null) {
				for (int i_106_ = 0; i_106_ < is.length;
				     i_106_++) {
				    class241_sub3_sub2.writeShort((is[i_106_]
								    & 0xffff),
								   -484048531);
				    i_102_++;
				}
			    }
			}
			i_104_++;
		    }
		}
	    } else {
		for (int i_107_ = i_99_; i_107_ < i_101_; i_107_++) {
		    int i_108_ = i_107_ * (anInt2055 * 266270313) + i_98_;
		    for (int i_109_ = i_98_; i_109_ < i_100_; i_109_++) {
			if (bools[i_109_ - i_98_][i_107_ - i_99_]) {
			    short[] is = (((Class166_Sub2) this)
					  .aShortArrayArray9829[i_108_]);
			    if (is != null) {
				for (int i_110_ = 0; i_110_ < is.length;
				     i_110_++) {
				    class241_sub3_sub2.method14621((is[i_110_]
								    & 0xffff),
								   (byte) -10);
				    i_102_++;
				}
			    }
			}
			i_108_++;
		    }
		}
	    }
	    if (i_102_ > 0) {
		Class149_Sub1 class149_sub1
		    = new Class149_Sub1((((Class166_Sub2) this)
					 .aClass103_Sub1_9813),
					5123,
					class241_sub3_sub2.payload,
					(class241_sub3_sub2.pointer
					 * 421967667));
		((Class166_Sub2) this).aClass103_Sub1_9813
		    .method15265(class149_sub1, 4, 0, i_102_);
	    }
	}
    }
    
    Class166_Sub2(Class103_Sub1 class103_sub1, int i, int i_111_, int i_112_,
		  int i_113_, int[][] is, int[][] is_114_, int i_115_) {
	super(i_112_, i_113_, i_115_, is);
	((Class166_Sub2) this).aClass103_Sub1_9813 = class103_sub1;
	((Class166_Sub2) this).anInt9807 = anInt2054 * -122333825 - 2;
	((Class166_Sub2) this).anInt9808
	    = 1 << ((Class166_Sub2) this).anInt9807;
	((Class166_Sub2) this).anInt9812 = i;
	((Class166_Sub2) this).anInt9810 = i_111_;
	((Class166_Sub2) this).anIntArrayArrayArray9804
	    = new int[i_112_][i_113_][];
	((Class166_Sub2) this).aClass241_Sub45ArrayArrayArray9814
	    = new Class241_Sub45[i_112_][i_113_][];
	((Class166_Sub2) this).anIntArrayArrayArray9816
	    = new int[i_112_][i_113_][];
	((Class166_Sub2) this).anIntArrayArrayArray9818
	    = new int[i_112_][i_113_][];
	((Class166_Sub2) this).anIntArrayArrayArray9815
	    = new int[i_112_][i_113_][];
	((Class166_Sub2) this).anIntArrayArrayArray9817
	    = new int[i_112_][i_113_][];
	((Class166_Sub2) this).aShortArrayArray9829
	    = new short[i_112_ * i_113_][];
	((Class166_Sub2) this).aByteArrayArray9836 = new byte[i_112_][i_113_];
	((Class166_Sub2) this).aByteArrayArray9832
	    = new byte[i_112_ + 1][i_113_ + 1];
	((Class166_Sub2) this).aFloatArrayArray9833
	    = new float[anInt2055 * 266270313 + 1][anInt2052 * -14610189 + 1];
	((Class166_Sub2) this).aFloatArrayArray9821
	    = new float[anInt2055 * 266270313 + 1][anInt2052 * -14610189 + 1];
	((Class166_Sub2) this).aFloatArrayArray9806
	    = new float[anInt2055 * 266270313 + 1][anInt2052 * -14610189 + 1];
	for (int i_116_ = 1; i_116_ < anInt2052 * -14610189; i_116_++) {
	    for (int i_117_ = 1; i_117_ < anInt2055 * 266270313; i_117_++) {
		int i_118_ = (is_114_[i_117_ + 1][i_116_]
			      - is_114_[i_117_ - 1][i_116_]);
		int i_119_ = (is_114_[i_117_][i_116_ + 1]
			      - is_114_[i_117_][i_116_ - 1]);
		float f
		    = (float) (1.0 / Math.sqrt((double) (i_118_ * i_118_
							 + 4 * i_115_ * i_115_
							 + i_119_ * i_119_)));
		((Class166_Sub2) this).aFloatArrayArray9833[i_117_][i_116_]
		    = (float) i_118_ * f;
		((Class166_Sub2) this).aFloatArrayArray9821[i_117_][i_116_]
		    = (float) (-i_115_ * 2) * f;
		((Class166_Sub2) this).aFloatArrayArray9806[i_117_][i_116_]
		    = (float) i_119_ * f;
	    }
	}
	((Class166_Sub2) this).aClass407_9835 = new HashTable(128);
	if ((((Class166_Sub2) this).anInt9810 & 0x10) != 0)
	    ((Class166_Sub2) this).aClass159_9822
		= new Class159(((Class166_Sub2) this).aClass103_Sub1_9813,
			       this);
    }
    
    void method16158(Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2,
		     int i, int i_120_) {
	int[] is = ((Class166_Sub2) this).anIntArrayArrayArray9816[i][i_120_];
	int[] is_121_
	    = ((Class166_Sub2) this).anIntArrayArrayArray9818[i][i_120_];
	int i_122_ = is.length;
	if ((((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
	     .anIntArray9232).length
	    < i_122_) {
	    ((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		.anIntArray9232
		= new int[i_122_];
	    ((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		.anIntArray9175
		= new int[i_122_];
	}
	int[] is_123_
	    = (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
	       .anIntArray9232);
	int[] is_124_
	    = (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
	       .anIntArray9175);
	for (int i_125_ = 0; i_125_ < i_122_; i_125_++) {
	    is_123_[i_125_]
		= is[i_125_] >> (((Class103_Sub1)
				  ((Class166_Sub2) this).aClass103_Sub1_9813)
				 .anInt9093);
	    is_124_[i_125_]
		= is_121_[i_125_] >> (((Class103_Sub1) (((Class166_Sub2) this)
							.aClass103_Sub1_9813))
				      .anInt9093);
	}
	int i_126_ = 0;
	while (i_126_ < i_122_) {
	    int i_127_ = is_123_[i_126_];
	    int i_128_ = is_124_[i_126_++];
	    int i_129_ = is_123_[i_126_];
	    int i_130_ = is_124_[i_126_++];
	    int i_131_ = is_123_[i_126_];
	    int i_132_ = is_124_[i_126_++];
	    if (((i_127_ - i_129_) * (i_130_ - i_132_)
		 - (i_130_ - i_128_) * (i_131_ - i_129_))
		> 0)
		class241_sub39_sub17_sub2.method17914(i_128_, i_130_, i_132_,
						      i_127_, i_129_, i_131_);
	}
    }
    
    public boolean method3556(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			      int i_133_, int i_134_, int i_135_,
			      boolean bool) {
	if (((Class166_Sub2) this).aClass159_9822 == null
	    || class241_sub39_sub17 == null)
	    return false;
	int i_136_
	    = (i - (i_133_ * ((Class103_Sub1) (((Class166_Sub2) this)
					       .aClass103_Sub1_9813)).anInt9181
		    >> 8)
	       >> (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		   .anInt9093));
	int i_137_
	    = (i_134_ - (i_133_ * (((Class103_Sub1)
				    ((Class166_Sub2) this).aClass103_Sub1_9813)
				   .anInt9169)
			 >> 8)
	       >> (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		   .anInt9093));
	return ((Class166_Sub2) this).aClass159_9822
		   .method3415(class241_sub39_sub17, i_136_, i_137_);
    }
    
    public void method3554(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_138_, int i_139_, int i_140_, boolean bool) {
	if (((Class166_Sub2) this).aClass159_9822 != null
	    && class241_sub39_sub17 != null) {
	    int i_141_
		= (i - (i_138_ * (((Class103_Sub1)
				   ((Class166_Sub2) this).aClass103_Sub1_9813)
				  .anInt9181)
			>> 8)
		   >> ((Class103_Sub1)
		       ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9093);
	    int i_142_
		= (i_139_ - (i_138_ * (((Class103_Sub1) (((Class166_Sub2) this)
							 .aClass103_Sub1_9813))
				       .anInt9169)
			     >> 8)
		   >> ((Class103_Sub1)
		       ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9093);
	    ((Class166_Sub2) this).aClass159_9822
		.method3411(class241_sub39_sub17, i_141_, i_142_);
	}
    }
    
    void method16159(int i, int i_143_, int i_144_, boolean[][] bools,
		     boolean bool, int i_145_) {
	if (((Class166_Sub2) this).aClass241Array9824 != null) {
	    int i_146_ = i_144_ + i_144_ + 1;
	    i_146_ *= i_146_;
	    if ((((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		 .anIntArray9051).length
		< i_146_)
		((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		    .anIntArray9051
		    = new int[i_146_];
	    if ((((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		 .aClass241_Sub3_Sub2_9231.payload).length
		< ((Class166_Sub2) this).anInt9811 * 2)
		((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		    .aClass241_Sub3_Sub2_9231
		    = new Class241_Sub3_Sub2(((Class166_Sub2) this).anInt9811
					     * 2);
	    int i_147_ = i - i_144_;
	    int i_148_ = i_147_;
	    if (i_147_ < 0)
		i_147_ = 0;
	    int i_149_ = i_143_ - i_144_;
	    int i_150_ = i_149_;
	    if (i_149_ < 0)
		i_149_ = 0;
	    int i_151_ = i + i_144_;
	    if (i_151_ > anInt2055 * 266270313 - 1)
		i_151_ = anInt2055 * 266270313 - 1;
	    int i_152_ = i_143_ + i_144_;
	    if (i_152_ > anInt2052 * -14610189 - 1)
		i_152_ = anInt2052 * -14610189 - 1;
	    int i_153_ = 0;
	    int[] is
		= (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		   .anIntArray9051);
	    for (int i_154_ = i_147_; i_154_ <= i_151_; i_154_++) {
		boolean[] bools_155_ = bools[i_154_ - i_148_];
		for (int i_156_ = i_149_; i_156_ <= i_152_; i_156_++) {
		    if (bools_155_[i_156_ - i_150_])
			is[i_153_++]
			    = i_156_ * (anInt2055 * 266270313) + i_154_;
		}
	    }
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15259();
	    ((Class166_Sub2) this).aClass103_Sub1_9813
		.method15186((((Class166_Sub2) this).anInt9810 & 0x7) != 0);
	    for (int i_157_ = 0;
		 i_157_ < ((Class166_Sub2) this).aClass241Array9824.length - 0;
		 i_157_++)
		((Class241_Sub45)
		 ((Class166_Sub2) this).aClass241Array9824[i_157_])
		    .method16494(is, i_153_);
	    if (!((Class166_Sub2) this).aClass429_9823
		     .isEmpty(1167491286)) {
		int i_158_ = (((Class103_Sub1)
			       ((Class166_Sub2) this).aClass103_Sub1_9813)
			      .anInt9111);
		int i_159_ = (((Class103_Sub1)
			       ((Class166_Sub2) this).aClass103_Sub1_9813)
			      .anInt9172);
		((Class166_Sub2) this).aClass103_Sub1_9813.method2314
		    (0, i_159_,
		     ((Class103_Sub1)
		      ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9173);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15186(false);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15190(false);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15192(128);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15173(-2);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15177
		    (((Class103_Sub1)
		      ((Class166_Sub2) this).aClass103_Sub1_9813)
		     .aClass142_Sub4_9190);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15180(8448,
								       7681);
		((Class166_Sub2) this).aClass103_Sub1_9813
		    .method15181(0, 34166, 770);
		((Class166_Sub2) this).aClass103_Sub1_9813
		    .method15352(0, 34167, 770);
		for (Node class241 = ((Class166_Sub2) this)
					     .aClass429_9823
					     .method7694(16711935);
		     class241 != null;
		     class241 = ((Class166_Sub2) this).aClass429_9823
				    .method7692(-193629870)) {
		    Class241_Sub36 class241_sub36 = (Class241_Sub36) class241;
		    class241_sub36.method16412(i, i_143_, i_144_, bools);
		}
		((Class166_Sub2) this).aClass103_Sub1_9813.method15181(0, 5890,
								       768);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15352(0, 5890,
								       770);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15177(null);
		((Class166_Sub2) this).aClass103_Sub1_9813.method2314
		    (i_158_, i_159_,
		     ((Class103_Sub1)
		      ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9173);
	    }
	    if (((Class166_Sub2) this).aClass159_9822 != null) {
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15168
		    (((Class166_Sub2) this).aClass151_9826, null, null,
		     ((Class166_Sub2) this).aClass151_9830);
		((Class166_Sub2) this).aClass159_9822
		    .method3410(i, i_143_, i_144_, bools, bool);
		OpenGL.glPopMatrix();
	    }
	}
    }
    
    public void method3557(Class241_Sub43 class241_sub43, int[] is) {
	((Class166_Sub2) this).aClass429_9823.addNode
	    (new Class241_Sub36(((Class166_Sub2) this).aClass103_Sub1_9813,
				this, class241_sub43, is),
	     (short) -3896);
    }
    
    public void method3567(int i, int i_160_, int[] is, int[] is_161_,
			   int[] is_162_, int[] is_163_, int[] is_164_,
			   int[] is_165_, int[] is_166_, int[] is_167_,
			   int[] is_168_, int[] is_169_, int[] is_170_,
			   Class86 class86, boolean bool) {
	int i_171_ = is_167_.length;
	int[] is_172_ = new int[i_171_ * 3];
	int[] is_173_ = new int[i_171_ * 3];
	int[] is_174_ = new int[i_171_ * 3];
	int[] is_175_ = is_168_ != null ? new int[i_171_ * 3] : null;
	int[] is_176_ = new int[i_171_ * 3];
	int[] is_177_ = new int[i_171_ * 3];
	int[] is_178_ = is_161_ != null ? new int[i_171_ * 3] : null;
	int[] is_179_ = is_163_ != null ? new int[i_171_ * 3] : null;
	int i_180_ = 0;
	for (int i_181_ = 0; i_181_ < i_171_; i_181_++) {
	    int i_182_ = is_164_[i_181_];
	    int i_183_ = is_165_[i_181_];
	    int i_184_ = is_166_[i_181_];
	    is_172_[i_180_] = is[i_182_];
	    is_173_[i_180_] = is_162_[i_182_];
	    is_174_[i_180_] = is_167_[i_181_];
	    is_176_[i_180_] = is_169_[i_181_];
	    is_177_[i_180_] = is_170_[i_181_];
	    if (is_168_ != null)
		is_175_[i_180_] = is_168_[i_181_];
	    if (is_161_ != null)
		is_178_[i_180_] = is_161_[i_182_];
	    if (is_163_ != null)
		is_179_[i_180_] = is_163_[i_182_];
	    i_180_++;
	    is_172_[i_180_] = is[i_183_];
	    is_173_[i_180_] = is_162_[i_183_];
	    is_174_[i_180_] = is_167_[i_181_];
	    is_176_[i_180_] = is_169_[i_181_];
	    is_177_[i_180_] = is_170_[i_181_];
	    if (is_168_ != null)
		is_175_[i_180_] = is_168_[i_181_];
	    if (is_161_ != null)
		is_178_[i_180_] = is_161_[i_183_];
	    if (is_163_ != null)
		is_179_[i_180_] = is_163_[i_183_];
	    i_180_++;
	    is_172_[i_180_] = is[i_184_];
	    is_173_[i_180_] = is_162_[i_184_];
	    is_174_[i_180_] = is_167_[i_181_];
	    is_176_[i_180_] = is_169_[i_181_];
	    is_177_[i_180_] = is_170_[i_181_];
	    if (is_168_ != null)
		is_175_[i_180_] = is_168_[i_181_];
	    if (is_161_ != null)
		is_178_[i_180_] = is_161_[i_184_];
	    if (is_163_ != null)
		is_179_[i_180_] = is_163_[i_184_];
	    i_180_++;
	}
	method3544(i, i_160_, is_172_, is_178_, is_173_, is_179_, is_174_,
		   is_175_, is_176_, is_177_, class86, bool);
    }
    
    public void method3558(int i, int i_185_, int i_186_) {
	i = Math.min(((Class166_Sub2) this).aByteArrayArray9832.length - 1,
		     Math.max(0, i));
	i_185_ = Math.min((((Class166_Sub2) this).aByteArrayArray9832[i].length
			   - 1),
			  Math.max(0, i_185_));
	if ((((Class166_Sub2) this).aByteArrayArray9832[i][i_185_] & 0xff)
	    < i_186_)
	    ((Class166_Sub2) this).aByteArrayArray9832[i][i_185_]
		= (byte) i_186_;
    }
    
    public Class241_Sub39_Sub17 method3553
	(int i, int i_187_, Class241_Sub39_Sub17 class241_sub39_sub17) {
	if ((((Class166_Sub2) this).aByteArrayArray9836[i][i_187_] & 0x1) == 0)
	    return null;
	int i_188_
	    = (anInt2053 * 2039042417
	       >> (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		   .anInt9093));
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2
	    = (Class241_Sub39_Sub17_Sub2) class241_sub39_sub17;
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2_189_;
	if (class241_sub39_sub17_sub2 != null
	    && class241_sub39_sub17_sub2.method17912(i_188_, i_188_)) {
	    class241_sub39_sub17_sub2_189_ = class241_sub39_sub17_sub2;
	    class241_sub39_sub17_sub2_189_.method17913();
	} else
	    class241_sub39_sub17_sub2_189_
		= new Class241_Sub39_Sub17_Sub2((((Class166_Sub2) this)
						 .aClass103_Sub1_9813),
						i_188_, i_188_);
	class241_sub39_sub17_sub2_189_.method17911(0, 0, i_188_, i_188_);
	method16156(class241_sub39_sub17_sub2_189_, i, i_187_);
	return class241_sub39_sub17_sub2_189_;
    }
    
    public Class241_Sub39_Sub17 method3570
	(int i, int i_190_, Class241_Sub39_Sub17 class241_sub39_sub17) {
	if ((((Class166_Sub2) this).aByteArrayArray9836[i][i_190_] & 0x1) == 0)
	    return null;
	int i_191_
	    = (anInt2053 * 2039042417
	       >> (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		   .anInt9093));
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2
	    = (Class241_Sub39_Sub17_Sub2) class241_sub39_sub17;
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2_192_;
	if (class241_sub39_sub17_sub2 != null
	    && class241_sub39_sub17_sub2.method17912(i_191_, i_191_)) {
	    class241_sub39_sub17_sub2_192_ = class241_sub39_sub17_sub2;
	    class241_sub39_sub17_sub2_192_.method17913();
	} else
	    class241_sub39_sub17_sub2_192_
		= new Class241_Sub39_Sub17_Sub2((((Class166_Sub2) this)
						 .aClass103_Sub1_9813),
						i_191_, i_191_);
	class241_sub39_sub17_sub2_192_.method17911(0, 0, i_191_, i_191_);
	method16156(class241_sub39_sub17_sub2_192_, i, i_190_);
	return class241_sub39_sub17_sub2_192_;
    }
    
    public Class241_Sub39_Sub17 method3559
	(int i, int i_193_, Class241_Sub39_Sub17 class241_sub39_sub17) {
	if ((((Class166_Sub2) this).aByteArrayArray9836[i][i_193_] & 0x1) == 0)
	    return null;
	int i_194_
	    = (anInt2053 * 2039042417
	       >> (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		   .anInt9093));
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2
	    = (Class241_Sub39_Sub17_Sub2) class241_sub39_sub17;
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2_195_;
	if (class241_sub39_sub17_sub2 != null
	    && class241_sub39_sub17_sub2.method17912(i_194_, i_194_)) {
	    class241_sub39_sub17_sub2_195_ = class241_sub39_sub17_sub2;
	    class241_sub39_sub17_sub2_195_.method17913();
	} else
	    class241_sub39_sub17_sub2_195_
		= new Class241_Sub39_Sub17_Sub2((((Class166_Sub2) this)
						 .aClass103_Sub1_9813),
						i_194_, i_194_);
	class241_sub39_sub17_sub2_195_.method17911(0, 0, i_194_, i_194_);
	method16156(class241_sub39_sub17_sub2_195_, i, i_193_);
	return class241_sub39_sub17_sub2_195_;
    }
    
    public void method3546(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_196_, int i_197_, int i_198_, boolean bool) {
	if (((Class166_Sub2) this).aClass159_9822 != null
	    && class241_sub39_sub17 != null) {
	    int i_199_
		= (i - (i_196_ * (((Class103_Sub1)
				   ((Class166_Sub2) this).aClass103_Sub1_9813)
				  .anInt9181)
			>> 8)
		   >> ((Class103_Sub1)
		       ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9093);
	    int i_200_
		= (i_197_ - (i_196_ * (((Class103_Sub1) (((Class166_Sub2) this)
							 .aClass103_Sub1_9813))
				       .anInt9169)
			     >> 8)
		   >> ((Class103_Sub1)
		       ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9093);
	    ((Class166_Sub2) this).aClass159_9822
		.method3411(class241_sub39_sub17, i_199_, i_200_);
	}
    }
    
    public void method3562(int i, int i_201_, int[] is, int[] is_202_,
			   int[] is_203_, int[] is_204_, int[] is_205_,
			   int[] is_206_, int[] is_207_, int[] is_208_,
			   int[] is_209_, int[] is_210_, int[] is_211_,
			   Class86 class86, boolean bool) {
	int i_212_ = is_208_.length;
	int[] is_213_ = new int[i_212_ * 3];
	int[] is_214_ = new int[i_212_ * 3];
	int[] is_215_ = new int[i_212_ * 3];
	int[] is_216_ = is_209_ != null ? new int[i_212_ * 3] : null;
	int[] is_217_ = new int[i_212_ * 3];
	int[] is_218_ = new int[i_212_ * 3];
	int[] is_219_ = is_202_ != null ? new int[i_212_ * 3] : null;
	int[] is_220_ = is_204_ != null ? new int[i_212_ * 3] : null;
	int i_221_ = 0;
	for (int i_222_ = 0; i_222_ < i_212_; i_222_++) {
	    int i_223_ = is_205_[i_222_];
	    int i_224_ = is_206_[i_222_];
	    int i_225_ = is_207_[i_222_];
	    is_213_[i_221_] = is[i_223_];
	    is_214_[i_221_] = is_203_[i_223_];
	    is_215_[i_221_] = is_208_[i_222_];
	    is_217_[i_221_] = is_210_[i_222_];
	    is_218_[i_221_] = is_211_[i_222_];
	    if (is_209_ != null)
		is_216_[i_221_] = is_209_[i_222_];
	    if (is_202_ != null)
		is_219_[i_221_] = is_202_[i_223_];
	    if (is_204_ != null)
		is_220_[i_221_] = is_204_[i_223_];
	    i_221_++;
	    is_213_[i_221_] = is[i_224_];
	    is_214_[i_221_] = is_203_[i_224_];
	    is_215_[i_221_] = is_208_[i_222_];
	    is_217_[i_221_] = is_210_[i_222_];
	    is_218_[i_221_] = is_211_[i_222_];
	    if (is_209_ != null)
		is_216_[i_221_] = is_209_[i_222_];
	    if (is_202_ != null)
		is_219_[i_221_] = is_202_[i_224_];
	    if (is_204_ != null)
		is_220_[i_221_] = is_204_[i_224_];
	    i_221_++;
	    is_213_[i_221_] = is[i_225_];
	    is_214_[i_221_] = is_203_[i_225_];
	    is_215_[i_221_] = is_208_[i_222_];
	    is_217_[i_221_] = is_210_[i_222_];
	    is_218_[i_221_] = is_211_[i_222_];
	    if (is_209_ != null)
		is_216_[i_221_] = is_209_[i_222_];
	    if (is_202_ != null)
		is_219_[i_221_] = is_202_[i_225_];
	    if (is_204_ != null)
		is_220_[i_221_] = is_204_[i_225_];
	    i_221_++;
	}
	method3544(i, i_201_, is_213_, is_219_, is_214_, is_220_, is_215_,
		   is_216_, is_217_, is_218_, class86, bool);
    }
    
    public void method3555(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_226_, int i_227_, int i_228_, boolean bool) {
	if (((Class166_Sub2) this).aClass159_9822 != null
	    && class241_sub39_sub17 != null) {
	    int i_229_
		= (i - (i_226_ * (((Class103_Sub1)
				   ((Class166_Sub2) this).aClass103_Sub1_9813)
				  .anInt9181)
			>> 8)
		   >> ((Class103_Sub1)
		       ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9093);
	    int i_230_
		= (i_227_ - (i_226_ * (((Class103_Sub1) (((Class166_Sub2) this)
							 .aClass103_Sub1_9813))
				       .anInt9169)
			     >> 8)
		   >> ((Class103_Sub1)
		       ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9093);
	    ((Class166_Sub2) this).aClass159_9822
		.method3412(class241_sub39_sub17, i_229_, i_230_);
	}
    }
    
    public void method3564() {
	if (((Class166_Sub2) this).anInt9834 > 0) {
	    byte[][] is = (new byte[anInt2055 * 266270313 + 1]
			   [anInt2052 * -14610189 + 1]);
	    for (int i = 1; i < anInt2055 * 266270313; i++) {
		for (int i_231_ = 1; i_231_ < anInt2052 * -14610189; i_231_++)
		    is[i][i_231_]
			= (byte) (((((Class166_Sub2) this).aByteArrayArray9832
				    [i - 1][i_231_])
				   >> 2)
				  + ((((Class166_Sub2) this)
				      .aByteArrayArray9832[i + 1][i_231_])
				     >> 3)
				  + ((((Class166_Sub2) this)
				      .aByteArrayArray9832[i][i_231_ - 1])
				     >> 2)
				  + ((((Class166_Sub2) this)
				      .aByteArrayArray9832[i][i_231_ + 1])
				     >> 3)
				  + ((((Class166_Sub2) this)
				      .aByteArrayArray9832[i][i_231_])
				     >> 1));
	    }
	    ((Class166_Sub2) this).aClass241Array9824
		= new Node[((Class166_Sub2) this).aClass407_9835
				   .method7306(2042054336)];
	    ((Class166_Sub2) this).aClass407_9835.method7305
		(((Class166_Sub2) this).aClass241Array9824, -2140010343);
	    for (int i = 0;
		 i < ((Class166_Sub2) this).aClass241Array9824.length; i++)
		((Class241_Sub45) ((Class166_Sub2) this).aClass241Array9824[i])
		    .method16498(((Class166_Sub2) this).anInt9834);
	    int i = 24;
	    if (((Class166_Sub2) this).anIntArrayArrayArray9820 != null)
		i += 4;
	    if ((((Class166_Sub2) this).anInt9810 & 0x7) != 0)
		i += 12;
	    NativeHeapBuffer nativeheapbuffer
		= ((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		      .aNativeHeap9165
		      .method963(((Class166_Sub2) this).anInt9834 * i, false);
	    Stream stream = new Stream(nativeheapbuffer);
	    Class241_Sub45[] class241_sub45s
		= new Class241_Sub45[((Class166_Sub2) this).anInt9834];
	    int i_232_
		= RSAKeys.method860(((Class166_Sub2) this).anInt9834 / 4,
				    -1959341094);
	    if (i_232_ < 1)
		i_232_ = 1;
	    HashTable class407 = new HashTable(i_232_);
	    Class241_Sub45[] class241_sub45s_233_
		= new Class241_Sub45[((Class166_Sub2) this).anInt9831];
	    for (int i_234_ = 0; i_234_ < anInt2055 * 266270313; i_234_++) {
		for (int i_235_ = 0; i_235_ < anInt2052 * -14610189;
		     i_235_++) {
		    if ((((Class166_Sub2) this).anIntArrayArrayArray9815
			 [i_234_][i_235_])
			!= null) {
			Class241_Sub45[] class241_sub45s_236_
			    = (((Class166_Sub2) this)
			       .aClass241_Sub45ArrayArrayArray9814[i_234_]
			       [i_235_]);
			int[] is_237_
			    = (((Class166_Sub2) this).anIntArrayArrayArray9816
			       [i_234_][i_235_]);
			int[] is_238_
			    = (((Class166_Sub2) this).anIntArrayArrayArray9818
			       [i_234_][i_235_]);
			int[] is_239_
			    = (((Class166_Sub2) this).anIntArrayArrayArray9817
			       [i_234_][i_235_]);
			int[] is_240_
			    = (((Class166_Sub2) this).anIntArrayArrayArray9815
			       [i_234_][i_235_]);
			int[] is_241_
			    = ((((Class166_Sub2) this).anIntArrayArrayArray9804
				!= null)
			       ? (((Class166_Sub2) this)
				  .anIntArrayArrayArray9804[i_234_][i_235_])
			       : null);
			int[] is_242_
			    = ((((Class166_Sub2) this).anIntArrayArrayArray9820
				!= null)
			       ? (((Class166_Sub2) this)
				  .anIntArrayArrayArray9820[i_234_][i_235_])
			       : null);
			if (is_239_ == null)
			    is_239_ = is_240_;
			float f = (((Class166_Sub2) this).aFloatArrayArray9833
				   [i_234_][i_235_]);
			float f_243_ = (((Class166_Sub2) this)
					.aFloatArrayArray9821[i_234_][i_235_]);
			float f_244_ = (((Class166_Sub2) this)
					.aFloatArrayArray9806[i_234_][i_235_]);
			float f_245_
			    = (((Class166_Sub2) this).aFloatArrayArray9833
			       [i_234_][i_235_ + 1]);
			float f_246_
			    = (((Class166_Sub2) this).aFloatArrayArray9821
			       [i_234_][i_235_ + 1]);
			float f_247_
			    = (((Class166_Sub2) this).aFloatArrayArray9806
			       [i_234_][i_235_ + 1]);
			float f_248_
			    = (((Class166_Sub2) this).aFloatArrayArray9833
			       [i_234_ + 1][i_235_ + 1]);
			float f_249_
			    = (((Class166_Sub2) this).aFloatArrayArray9821
			       [i_234_ + 1][i_235_ + 1]);
			float f_250_
			    = (((Class166_Sub2) this).aFloatArrayArray9806
			       [i_234_ + 1][i_235_ + 1]);
			float f_251_
			    = (((Class166_Sub2) this).aFloatArrayArray9833
			       [i_234_ + 1][i_235_]);
			float f_252_
			    = (((Class166_Sub2) this).aFloatArrayArray9821
			       [i_234_ + 1][i_235_]);
			float f_253_
			    = (((Class166_Sub2) this).aFloatArrayArray9806
			       [i_234_ + 1][i_235_]);
			int i_254_ = is[i_234_][i_235_] & 0xff;
			int i_255_ = is[i_234_][i_235_ + 1] & 0xff;
			int i_256_ = is[i_234_ + 1][i_235_ + 1] & 0xff;
			int i_257_ = is[i_234_ + 1][i_235_] & 0xff;
			int i_258_ = 0;
		    while_114_:
			for (int i_259_ = 0; i_259_ < is_240_.length;
			     i_259_++) {
			    Class241_Sub45 class241_sub45
				= class241_sub45s_236_[i_259_];
			    for (int i_260_ = 0; i_260_ < i_258_; i_260_++) {
				if (class241_sub45s_233_[i_260_]
				    == class241_sub45)
				    continue while_114_;
			    }
			    class241_sub45s_233_[i_258_++] = class241_sub45;
			}
			short[] is_261_
			    = (((Class166_Sub2) this).aShortArrayArray9829
				   [i_235_ * (anInt2055 * 266270313) + i_234_]
			       = new short[is_240_.length]);
			for (int i_262_ = 0; i_262_ < is_240_.length;
			     i_262_++) {
			    int i_263_ = ((i_234_ << anInt2054 * -122333825)
					  + is_237_[i_262_]);
			    int i_264_ = ((i_235_ << anInt2054 * -122333825)
					  + is_238_[i_262_]);
			    int i_265_
				= i_263_ >> ((Class166_Sub2) this).anInt9807;
			    int i_266_
				= i_264_ >> ((Class166_Sub2) this).anInt9807;
			    int i_267_ = is_240_[i_262_];
			    int i_268_ = is_239_[i_262_];
			    int i_269_ = is_241_ != null ? is_241_[i_262_] : 0;
			    long l = ((long) i_268_ << 48 | (long) i_267_ << 32
				      | (long) (i_265_ << 16) | (long) i_266_);
			    int i_270_ = is_237_[i_262_];
			    int i_271_ = is_238_[i_262_];
			    int i_272_ = 74;
			    int i_273_ = 0;
			    float f_274_ = 1.0F;
			    float f_275_;
			    float f_276_;
			    float f_277_;
			    if (i_270_ == 0 && i_271_ == 0) {
				f_275_ = f;
				f_276_ = f_243_;
				f_277_ = f_244_;
				i_272_ -= i_254_;
			    } else if (i_270_ == 0
				       && i_271_ == anInt2053 * 2039042417) {
				f_275_ = f_245_;
				f_276_ = f_246_;
				f_277_ = f_247_;
				i_272_ -= i_255_;
			    } else if (i_270_ == anInt2053 * 2039042417
				       && i_271_ == anInt2053 * 2039042417) {
				f_275_ = f_248_;
				f_276_ = f_249_;
				f_277_ = f_250_;
				i_272_ -= i_256_;
			    } else if (i_270_ == anInt2053 * 2039042417
				       && i_271_ == 0) {
				f_275_ = f_251_;
				f_276_ = f_252_;
				f_277_ = f_253_;
				i_272_ -= i_257_;
			    } else {
				float f_278_
				    = ((float) i_270_
				       / (float) (anInt2053 * 2039042417));
				float f_279_
				    = ((float) i_271_
				       / (float) (anInt2053 * 2039042417));
				float f_280_ = f + (f_251_ - f) * f_278_;
				float f_281_
				    = f_243_ + (f_252_ - f_243_) * f_278_;
				float f_282_
				    = f_244_ + (f_253_ - f_244_) * f_278_;
				float f_283_
				    = f_245_ + (f_248_ - f_245_) * f_278_;
				float f_284_
				    = f_246_ + (f_249_ - f_246_) * f_278_;
				float f_285_
				    = f_247_ + (f_250_ - f_247_) * f_278_;
				f_275_ = f_280_ + (f_283_ - f_280_) * f_279_;
				f_276_ = f_281_ + (f_284_ - f_281_) * f_279_;
				f_277_ = f_282_ + (f_285_ - f_282_) * f_279_;
				int i_286_
				    = i_254_ + ((i_257_ - i_254_) * i_270_
						>> anInt2054 * -122333825);
				int i_287_
				    = i_255_ + ((i_256_ - i_255_) * i_270_
						>> anInt2054 * -122333825);
				i_272_ -= i_286_ + ((i_287_ - i_286_) * i_271_
						    >> anInt2054 * -122333825);
			    }
			    if (i_267_ != -1) {
				int i_288_ = (i_267_ & 0x7f) * i_272_ >> 7;
				if (i_288_ < 2)
				    i_288_ = 2;
				else if (i_288_ > 126)
				    i_288_ = 126;
				i_273_ = (Class474.anIntArray6383
					  [i_267_ & 0xff80 | i_288_]);
				if ((((Class166_Sub2) this).anInt9810 & 0x7)
				    == 0) {
				    f_274_
					= ((((Class103_Sub1)
					     (((Class166_Sub2) this)
					      .aClass103_Sub1_9813))
					    .aFloatArray9156[0]) * f_275_
					   + (((Class103_Sub1)
					       (((Class166_Sub2) this)
						.aClass103_Sub1_9813))
					      .aFloatArray9156[1]) * f_276_
					   + (((Class103_Sub1)
					       (((Class166_Sub2) this)
						.aClass103_Sub1_9813))
					      .aFloatArray9156[2]) * f_277_);
				    f_274_
					= (((Class103_Sub1)
					    (((Class166_Sub2) this)
					     .aClass103_Sub1_9813)).aFloat9162
					   + (f_274_
					      * (f_274_ > 0.0F
						 ? (((Class103_Sub1)
						     (((Class166_Sub2) this)
						      .aClass103_Sub1_9813))
						    .aFloat9153)
						 : (((Class103_Sub1)
						     (((Class166_Sub2) this)
						      .aClass103_Sub1_9813))
						    .aFloat9171))));
				}
			    }
			    Node class241 = null;
			    if ((i_263_
				 & ((Class166_Sub2) this).anInt9808 - 1) == 0
				&& ((i_264_
				     & ((Class166_Sub2) this).anInt9808 - 1)
				    == 0))
				class241 = class407.get(l);
			    int i_289_;
			    if (class241 == null) {
				int i_290_;
				if (i_268_ != i_267_) {
				    int i_291_ = (i_268_ & 0x7f) * i_272_ >> 7;
				    if (i_291_ < 2)
					i_291_ = 2;
				    else if (i_291_ > 126)
					i_291_ = 126;
				    i_290_ = (Class474.anIntArray6383
					      [i_268_ & 0xff80 | i_291_]);
				    if ((((Class166_Sub2) this).anInt9810
					 & 0x7)
					== 0) {
					float f_292_
					    = ((((Class103_Sub1)
						 (((Class166_Sub2) this)
						  .aClass103_Sub1_9813))
						.aFloatArray9156[0]) * f_275_
					       + (((Class103_Sub1)
						   (((Class166_Sub2) this)
						    .aClass103_Sub1_9813))
						  .aFloatArray9156[1]) * f_276_
					       + ((((Class103_Sub1)
						    (((Class166_Sub2) this)
						     .aClass103_Sub1_9813))
						   .aFloatArray9156[2])
						  * f_277_));
					f_292_
					    = ((((Class103_Sub1)
						 (((Class166_Sub2) this)
						  .aClass103_Sub1_9813))
						.aFloat9162)
					       + (f_274_
						  * (f_274_ > 0.0F
						     ? (((Class103_Sub1)
							 (((Class166_Sub2)
							   this)
							  .aClass103_Sub1_9813))
							.aFloat9153)
						     : (((Class103_Sub1)
							 (((Class166_Sub2)
							   this)
							  .aClass103_Sub1_9813))
							.aFloat9171))));
					int i_293_ = i_290_ >> 16 & 0xff;
					int i_294_ = i_290_ >> 8 & 0xff;
					int i_295_ = i_290_ & 0xff;
					i_293_ *= f_292_;
					if (i_293_ < 0)
					    i_293_ = 0;
					else if (i_293_ > 255)
					    i_293_ = 255;
					i_294_ *= f_292_;
					if (i_294_ < 0)
					    i_294_ = 0;
					else if (i_294_ > 255)
					    i_294_ = 255;
					i_295_ *= f_292_;
					if (i_295_ < 0)
					    i_295_ = 0;
					else if (i_295_ > 255)
					    i_295_ = 255;
					i_290_ = (i_293_ << 16 | i_294_ << 8
						  | i_295_);
				    }
				} else
				    i_290_ = i_273_;
				if (((Class103_Sub1) (((Class166_Sub2) this)
						      .aClass103_Sub1_9813))
				    .aBool9144) {
				    stream.method3785((float) i_263_);
				    stream.method3785
					((float) (method3574(i_263_, i_264_,
							     -310041894)
						  + i_269_));
				    stream.method3785((float) i_264_);
				    stream.method3784((byte) (i_290_ >> 16));
				    stream.method3784((byte) (i_290_ >> 8));
				    stream.method3784((byte) i_290_);
				    stream.method3784(-1);
				    stream.method3785((float) i_263_);
				    stream.method3785((float) i_264_);
				    if ((((Class166_Sub2) this)
					 .anIntArrayArrayArray9820)
					!= null)
					stream.method3785(is_242_ != null
							  ? (float) ((is_242_
								      [i_262_])
								     - 1)
							  : 0.0F);
				    if ((((Class166_Sub2) this).anInt9810
					 & 0x7)
					!= 0) {
					stream.method3785(f_275_);
					stream.method3785(f_276_);
					stream.method3785(f_277_);
				    }
				} else {
				    stream.method3786((float) i_263_);
				    stream.method3786
					((float) (method3574(i_263_, i_264_,
							     678988618)
						  + i_269_));
				    stream.method3786((float) i_264_);
				    stream.method3784((byte) (i_290_ >> 16));
				    stream.method3784((byte) (i_290_ >> 8));
				    stream.method3784((byte) i_290_);
				    stream.method3784(-1);
				    stream.method3786((float) i_263_);
				    stream.method3786((float) i_264_);
				    if ((((Class166_Sub2) this)
					 .anIntArrayArrayArray9820)
					!= null)
					stream.method3786(is_242_ != null
							  ? (float) ((is_242_
								      [i_262_])
								     - 1)
							  : 0.0F);
				    if ((((Class166_Sub2) this).anInt9810
					 & 0x7)
					!= 0) {
					stream.method3786(f_275_);
					stream.method3786(f_276_);
					stream.method3786(f_277_);
				    }
				}
				i_289_ = ((Class166_Sub2) this).anInt9819++;
				is_261_[i_262_] = (short) i_289_;
				if (i_267_ != -1)
				    class241_sub45s[i_289_]
					= class241_sub45s_236_[i_262_];
				class407.put
				    (new Class241_Sub7(is_261_[i_262_]), l);
			    } else {
				is_261_[i_262_]
				    = ((Class241_Sub7) class241).aShort8826;
				i_289_ = is_261_[i_262_] & 0xffff;
				if (i_267_ != -1
				    && ((class241_sub45s_236_[i_262_].hashCode
					 * 4356572401218184725L)
					< (class241_sub45s[i_289_].hashCode
					   * 4356572401218184725L)))
				    class241_sub45s[i_289_]
					= class241_sub45s_236_[i_262_];
			    }
			    for (int i_296_ = 0; i_296_ < i_258_; i_296_++)
				class241_sub45s_233_[i_296_].method16492
				    (i_289_, i_273_, i_272_, f_274_);
			    ((Class166_Sub2) this).anInt9811++;
			}
		    }
		}
	    }
	    for (int i_297_ = 0; i_297_ < ((Class166_Sub2) this).anInt9819;
		 i_297_++) {
		Class241_Sub45 class241_sub45 = class241_sub45s[i_297_];
		if (class241_sub45 != null)
		    class241_sub45.method16490(i_297_);
	    }
	    for (int i_298_ = 0; i_298_ < anInt2055 * 266270313; i_298_++) {
		for (int i_299_ = 0; i_299_ < anInt2052 * -14610189;
		     i_299_++) {
		    short[] is_300_
			= (((Class166_Sub2) this).aShortArrayArray9829
			   [i_299_ * (anInt2055 * 266270313) + i_298_]);
		    if (is_300_ != null) {
			int i_301_ = 0;
			int i_302_ = 0;
			while (i_302_ < is_300_.length) {
			    int i_303_ = is_300_[i_302_++] & 0xffff;
			    int i_304_ = is_300_[i_302_++] & 0xffff;
			    int i_305_ = is_300_[i_302_++] & 0xffff;
			    Class241_Sub45 class241_sub45
				= class241_sub45s[i_303_];
			    Class241_Sub45 class241_sub45_306_
				= class241_sub45s[i_304_];
			    Class241_Sub45 class241_sub45_307_
				= class241_sub45s[i_305_];
			    Class241_Sub45 class241_sub45_308_ = null;
			    if (class241_sub45 != null) {
				class241_sub45.method16491(i_298_, i_299_,
							   i_301_);
				class241_sub45_308_ = class241_sub45;
			    }
			    if (class241_sub45_306_ != null) {
				class241_sub45_306_.method16491(i_298_, i_299_,
								i_301_);
				if (class241_sub45_308_ == null
				    || ((class241_sub45_306_.hashCode
					 * 4356572401218184725L)
					< (class241_sub45_308_.hashCode
					   * 4356572401218184725L)))
				    class241_sub45_308_ = class241_sub45_306_;
			    }
			    if (class241_sub45_307_ != null) {
				class241_sub45_307_.method16491(i_298_, i_299_,
								i_301_);
				if (class241_sub45_308_ == null
				    || ((class241_sub45_307_.hashCode
					 * 4356572401218184725L)
					< (class241_sub45_308_.hashCode
					   * 4356572401218184725L)))
				    class241_sub45_308_ = class241_sub45_307_;
			    }
			    if (class241_sub45_308_ != null) {
				if (class241_sub45 != null)
				    class241_sub45_308_.method16490(i_303_);
				if (class241_sub45_306_ != null)
				    class241_sub45_308_.method16490(i_304_);
				if (class241_sub45_307_ != null)
				    class241_sub45_308_.method16490(i_305_);
				class241_sub45_308_.method16491(i_298_, i_299_,
								i_301_);
			    }
			    i_301_++;
			}
		    }
		}
	    }
	    stream.method3787();
	    ((Class166_Sub2) this).anInterface8_9825
		= (((Class166_Sub2) this).aClass103_Sub1_9813.method15213
		   (i, nativeheapbuffer, stream.method3782(), false));
	    if (((Class166_Sub2) this).anInterface8_9825
		instanceof Class147_Sub1)
		nativeheapbuffer.method1686();
	    ((Class166_Sub2) this).aClass151_9826
		= new Class151(((Class166_Sub2) this).anInterface8_9825, 5126,
			       3, 0);
	    ((Class166_Sub2) this).aClass151_9809
		= new Class151(((Class166_Sub2) this).anInterface8_9825, 5121,
			       4, 12);
	    int i_309_;
	    if (((Class166_Sub2) this).anIntArrayArrayArray9820 != null) {
		((Class166_Sub2) this).aClass151_9830
		    = new Class151(((Class166_Sub2) this).anInterface8_9825,
				   5126, 3, 16);
		i_309_ = 28;
	    } else {
		((Class166_Sub2) this).aClass151_9830
		    = new Class151(((Class166_Sub2) this).anInterface8_9825,
				   5126, 2, 16);
		i_309_ = 24;
	    }
	    if ((((Class166_Sub2) this).anInt9810 & 0x7) != 0)
		((Class166_Sub2) this).aClass151_9828
		    = new Class151(((Class166_Sub2) this).anInterface8_9825,
				   5126, 3, i_309_);
	    long[] ls
		= new long[((Class166_Sub2) this).aClass241Array9824.length];
	    for (int i_310_ = 0;
		 i_310_ < ((Class166_Sub2) this).aClass241Array9824.length;
		 i_310_++) {
		Class241_Sub45 class241_sub45
		    = ((Class241_Sub45)
		       ((Class166_Sub2) this).aClass241Array9824[i_310_]);
		ls[i_310_] = class241_sub45.hashCode * 4356572401218184725L;
		class241_sub45.method16493(((Class166_Sub2) this).anInt9819);
	    }
	    Class570.method12515(ls, ((Class166_Sub2) this).aClass241Array9824,
				 1713537755);
	    if (((Class166_Sub2) this).aClass159_9822 != null)
		((Class166_Sub2) this).aClass159_9822.method3425();
	} else
	    ((Class166_Sub2) this).aClass159_9822 = null;
	if ((((Class166_Sub2) this).anInt9812 & 0x2) == 0) {
	    ((Class166_Sub2) this).anIntArrayArrayArray9818 = null;
	    ((Class166_Sub2) this).anIntArrayArrayArray9816 = null;
	    ((Class166_Sub2) this).anIntArrayArrayArray9815 = null;
	}
	((Class166_Sub2) this).anIntArrayArrayArray9820 = null;
	((Class166_Sub2) this).anIntArrayArrayArray9817 = null;
	((Class166_Sub2) this).anIntArrayArrayArray9804 = null;
	((Class166_Sub2) this).aClass241_Sub45ArrayArrayArray9814 = null;
	((Class166_Sub2) this).aByteArrayArray9832 = null;
	((Class166_Sub2) this).aClass407_9835 = null;
	((Class166_Sub2) this).aFloatArrayArray9806 = null;
	((Class166_Sub2) this).aFloatArrayArray9821 = null;
	((Class166_Sub2) this).aFloatArrayArray9833 = null;
    }
    
    public void method3565() {
	if (((Class166_Sub2) this).anInt9834 > 0) {
	    byte[][] is = (new byte[anInt2055 * 266270313 + 1]
			   [anInt2052 * -14610189 + 1]);
	    for (int i = 1; i < anInt2055 * 266270313; i++) {
		for (int i_311_ = 1; i_311_ < anInt2052 * -14610189; i_311_++)
		    is[i][i_311_]
			= (byte) (((((Class166_Sub2) this).aByteArrayArray9832
				    [i - 1][i_311_])
				   >> 2)
				  + ((((Class166_Sub2) this)
				      .aByteArrayArray9832[i + 1][i_311_])
				     >> 3)
				  + ((((Class166_Sub2) this)
				      .aByteArrayArray9832[i][i_311_ - 1])
				     >> 2)
				  + ((((Class166_Sub2) this)
				      .aByteArrayArray9832[i][i_311_ + 1])
				     >> 3)
				  + ((((Class166_Sub2) this)
				      .aByteArrayArray9832[i][i_311_])
				     >> 1));
	    }
	    ((Class166_Sub2) this).aClass241Array9824
		= new Node[((Class166_Sub2) this).aClass407_9835
				   .method7306(344863081)];
	    ((Class166_Sub2) this).aClass407_9835.method7305
		(((Class166_Sub2) this).aClass241Array9824, -2137156523);
	    for (int i = 0;
		 i < ((Class166_Sub2) this).aClass241Array9824.length; i++)
		((Class241_Sub45) ((Class166_Sub2) this).aClass241Array9824[i])
		    .method16498(((Class166_Sub2) this).anInt9834);
	    int i = 24;
	    if (((Class166_Sub2) this).anIntArrayArrayArray9820 != null)
		i += 4;
	    if ((((Class166_Sub2) this).anInt9810 & 0x7) != 0)
		i += 12;
	    NativeHeapBuffer nativeheapbuffer
		= ((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		      .aNativeHeap9165
		      .method963(((Class166_Sub2) this).anInt9834 * i, false);
	    Stream stream = new Stream(nativeheapbuffer);
	    Class241_Sub45[] class241_sub45s
		= new Class241_Sub45[((Class166_Sub2) this).anInt9834];
	    int i_312_
		= RSAKeys.method860(((Class166_Sub2) this).anInt9834 / 4,
				    -1959341094);
	    if (i_312_ < 1)
		i_312_ = 1;
	    HashTable class407 = new HashTable(i_312_);
	    Class241_Sub45[] class241_sub45s_313_
		= new Class241_Sub45[((Class166_Sub2) this).anInt9831];
	    for (int i_314_ = 0; i_314_ < anInt2055 * 266270313; i_314_++) {
		for (int i_315_ = 0; i_315_ < anInt2052 * -14610189;
		     i_315_++) {
		    if ((((Class166_Sub2) this).anIntArrayArrayArray9815
			 [i_314_][i_315_])
			!= null) {
			Class241_Sub45[] class241_sub45s_316_
			    = (((Class166_Sub2) this)
			       .aClass241_Sub45ArrayArrayArray9814[i_314_]
			       [i_315_]);
			int[] is_317_
			    = (((Class166_Sub2) this).anIntArrayArrayArray9816
			       [i_314_][i_315_]);
			int[] is_318_
			    = (((Class166_Sub2) this).anIntArrayArrayArray9818
			       [i_314_][i_315_]);
			int[] is_319_
			    = (((Class166_Sub2) this).anIntArrayArrayArray9817
			       [i_314_][i_315_]);
			int[] is_320_
			    = (((Class166_Sub2) this).anIntArrayArrayArray9815
			       [i_314_][i_315_]);
			int[] is_321_
			    = ((((Class166_Sub2) this).anIntArrayArrayArray9804
				!= null)
			       ? (((Class166_Sub2) this)
				  .anIntArrayArrayArray9804[i_314_][i_315_])
			       : null);
			int[] is_322_
			    = ((((Class166_Sub2) this).anIntArrayArrayArray9820
				!= null)
			       ? (((Class166_Sub2) this)
				  .anIntArrayArrayArray9820[i_314_][i_315_])
			       : null);
			if (is_319_ == null)
			    is_319_ = is_320_;
			float f = (((Class166_Sub2) this).aFloatArrayArray9833
				   [i_314_][i_315_]);
			float f_323_ = (((Class166_Sub2) this)
					.aFloatArrayArray9821[i_314_][i_315_]);
			float f_324_ = (((Class166_Sub2) this)
					.aFloatArrayArray9806[i_314_][i_315_]);
			float f_325_
			    = (((Class166_Sub2) this).aFloatArrayArray9833
			       [i_314_][i_315_ + 1]);
			float f_326_
			    = (((Class166_Sub2) this).aFloatArrayArray9821
			       [i_314_][i_315_ + 1]);
			float f_327_
			    = (((Class166_Sub2) this).aFloatArrayArray9806
			       [i_314_][i_315_ + 1]);
			float f_328_
			    = (((Class166_Sub2) this).aFloatArrayArray9833
			       [i_314_ + 1][i_315_ + 1]);
			float f_329_
			    = (((Class166_Sub2) this).aFloatArrayArray9821
			       [i_314_ + 1][i_315_ + 1]);
			float f_330_
			    = (((Class166_Sub2) this).aFloatArrayArray9806
			       [i_314_ + 1][i_315_ + 1]);
			float f_331_
			    = (((Class166_Sub2) this).aFloatArrayArray9833
			       [i_314_ + 1][i_315_]);
			float f_332_
			    = (((Class166_Sub2) this).aFloatArrayArray9821
			       [i_314_ + 1][i_315_]);
			float f_333_
			    = (((Class166_Sub2) this).aFloatArrayArray9806
			       [i_314_ + 1][i_315_]);
			int i_334_ = is[i_314_][i_315_] & 0xff;
			int i_335_ = is[i_314_][i_315_ + 1] & 0xff;
			int i_336_ = is[i_314_ + 1][i_315_ + 1] & 0xff;
			int i_337_ = is[i_314_ + 1][i_315_] & 0xff;
			int i_338_ = 0;
		    while_116_:
			for (int i_339_ = 0; i_339_ < is_320_.length;
			     i_339_++) {
			    Class241_Sub45 class241_sub45
				= class241_sub45s_316_[i_339_];
			    for (int i_340_ = 0; i_340_ < i_338_; i_340_++) {
				if (class241_sub45s_313_[i_340_]
				    == class241_sub45)
				    continue while_116_;
			    }
			    class241_sub45s_313_[i_338_++] = class241_sub45;
			}
			short[] is_341_
			    = (((Class166_Sub2) this).aShortArrayArray9829
				   [i_315_ * (anInt2055 * 266270313) + i_314_]
			       = new short[is_320_.length]);
			for (int i_342_ = 0; i_342_ < is_320_.length;
			     i_342_++) {
			    int i_343_ = ((i_314_ << anInt2054 * -122333825)
					  + is_317_[i_342_]);
			    int i_344_ = ((i_315_ << anInt2054 * -122333825)
					  + is_318_[i_342_]);
			    int i_345_
				= i_343_ >> ((Class166_Sub2) this).anInt9807;
			    int i_346_
				= i_344_ >> ((Class166_Sub2) this).anInt9807;
			    int i_347_ = is_320_[i_342_];
			    int i_348_ = is_319_[i_342_];
			    int i_349_ = is_321_ != null ? is_321_[i_342_] : 0;
			    long l = ((long) i_348_ << 48 | (long) i_347_ << 32
				      | (long) (i_345_ << 16) | (long) i_346_);
			    int i_350_ = is_317_[i_342_];
			    int i_351_ = is_318_[i_342_];
			    int i_352_ = 74;
			    int i_353_ = 0;
			    float f_354_ = 1.0F;
			    float f_355_;
			    float f_356_;
			    float f_357_;
			    if (i_350_ == 0 && i_351_ == 0) {
				f_355_ = f;
				f_356_ = f_323_;
				f_357_ = f_324_;
				i_352_ -= i_334_;
			    } else if (i_350_ == 0
				       && i_351_ == anInt2053 * 2039042417) {
				f_355_ = f_325_;
				f_356_ = f_326_;
				f_357_ = f_327_;
				i_352_ -= i_335_;
			    } else if (i_350_ == anInt2053 * 2039042417
				       && i_351_ == anInt2053 * 2039042417) {
				f_355_ = f_328_;
				f_356_ = f_329_;
				f_357_ = f_330_;
				i_352_ -= i_336_;
			    } else if (i_350_ == anInt2053 * 2039042417
				       && i_351_ == 0) {
				f_355_ = f_331_;
				f_356_ = f_332_;
				f_357_ = f_333_;
				i_352_ -= i_337_;
			    } else {
				float f_358_
				    = ((float) i_350_
				       / (float) (anInt2053 * 2039042417));
				float f_359_
				    = ((float) i_351_
				       / (float) (anInt2053 * 2039042417));
				float f_360_ = f + (f_331_ - f) * f_358_;
				float f_361_
				    = f_323_ + (f_332_ - f_323_) * f_358_;
				float f_362_
				    = f_324_ + (f_333_ - f_324_) * f_358_;
				float f_363_
				    = f_325_ + (f_328_ - f_325_) * f_358_;
				float f_364_
				    = f_326_ + (f_329_ - f_326_) * f_358_;
				float f_365_
				    = f_327_ + (f_330_ - f_327_) * f_358_;
				f_355_ = f_360_ + (f_363_ - f_360_) * f_359_;
				f_356_ = f_361_ + (f_364_ - f_361_) * f_359_;
				f_357_ = f_362_ + (f_365_ - f_362_) * f_359_;
				int i_366_
				    = i_334_ + ((i_337_ - i_334_) * i_350_
						>> anInt2054 * -122333825);
				int i_367_
				    = i_335_ + ((i_336_ - i_335_) * i_350_
						>> anInt2054 * -122333825);
				i_352_ -= i_366_ + ((i_367_ - i_366_) * i_351_
						    >> anInt2054 * -122333825);
			    }
			    if (i_347_ != -1) {
				int i_368_ = (i_347_ & 0x7f) * i_352_ >> 7;
				if (i_368_ < 2)
				    i_368_ = 2;
				else if (i_368_ > 126)
				    i_368_ = 126;
				i_353_ = (Class474.anIntArray6383
					  [i_347_ & 0xff80 | i_368_]);
				if ((((Class166_Sub2) this).anInt9810 & 0x7)
				    == 0) {
				    f_354_
					= ((((Class103_Sub1)
					     (((Class166_Sub2) this)
					      .aClass103_Sub1_9813))
					    .aFloatArray9156[0]) * f_355_
					   + (((Class103_Sub1)
					       (((Class166_Sub2) this)
						.aClass103_Sub1_9813))
					      .aFloatArray9156[1]) * f_356_
					   + (((Class103_Sub1)
					       (((Class166_Sub2) this)
						.aClass103_Sub1_9813))
					      .aFloatArray9156[2]) * f_357_);
				    f_354_
					= (((Class103_Sub1)
					    (((Class166_Sub2) this)
					     .aClass103_Sub1_9813)).aFloat9162
					   + (f_354_
					      * (f_354_ > 0.0F
						 ? (((Class103_Sub1)
						     (((Class166_Sub2) this)
						      .aClass103_Sub1_9813))
						    .aFloat9153)
						 : (((Class103_Sub1)
						     (((Class166_Sub2) this)
						      .aClass103_Sub1_9813))
						    .aFloat9171))));
				}
			    }
			    Node class241 = null;
			    if ((i_343_
				 & ((Class166_Sub2) this).anInt9808 - 1) == 0
				&& ((i_344_
				     & ((Class166_Sub2) this).anInt9808 - 1)
				    == 0))
				class241 = class407.get(l);
			    int i_369_;
			    if (class241 == null) {
				int i_370_;
				if (i_348_ != i_347_) {
				    int i_371_ = (i_348_ & 0x7f) * i_352_ >> 7;
				    if (i_371_ < 2)
					i_371_ = 2;
				    else if (i_371_ > 126)
					i_371_ = 126;
				    i_370_ = (Class474.anIntArray6383
					      [i_348_ & 0xff80 | i_371_]);
				    if ((((Class166_Sub2) this).anInt9810
					 & 0x7)
					== 0) {
					float f_372_
					    = ((((Class103_Sub1)
						 (((Class166_Sub2) this)
						  .aClass103_Sub1_9813))
						.aFloatArray9156[0]) * f_355_
					       + (((Class103_Sub1)
						   (((Class166_Sub2) this)
						    .aClass103_Sub1_9813))
						  .aFloatArray9156[1]) * f_356_
					       + ((((Class103_Sub1)
						    (((Class166_Sub2) this)
						     .aClass103_Sub1_9813))
						   .aFloatArray9156[2])
						  * f_357_));
					f_372_
					    = ((((Class103_Sub1)
						 (((Class166_Sub2) this)
						  .aClass103_Sub1_9813))
						.aFloat9162)
					       + (f_354_
						  * (f_354_ > 0.0F
						     ? (((Class103_Sub1)
							 (((Class166_Sub2)
							   this)
							  .aClass103_Sub1_9813))
							.aFloat9153)
						     : (((Class103_Sub1)
							 (((Class166_Sub2)
							   this)
							  .aClass103_Sub1_9813))
							.aFloat9171))));
					int i_373_ = i_370_ >> 16 & 0xff;
					int i_374_ = i_370_ >> 8 & 0xff;
					int i_375_ = i_370_ & 0xff;
					i_373_ *= f_372_;
					if (i_373_ < 0)
					    i_373_ = 0;
					else if (i_373_ > 255)
					    i_373_ = 255;
					i_374_ *= f_372_;
					if (i_374_ < 0)
					    i_374_ = 0;
					else if (i_374_ > 255)
					    i_374_ = 255;
					i_375_ *= f_372_;
					if (i_375_ < 0)
					    i_375_ = 0;
					else if (i_375_ > 255)
					    i_375_ = 255;
					i_370_ = (i_373_ << 16 | i_374_ << 8
						  | i_375_);
				    }
				} else
				    i_370_ = i_353_;
				if (((Class103_Sub1) (((Class166_Sub2) this)
						      .aClass103_Sub1_9813))
				    .aBool9144) {
				    stream.method3785((float) i_343_);
				    stream.method3785
					((float) (method3574(i_343_, i_344_,
							     -547061191)
						  + i_349_));
				    stream.method3785((float) i_344_);
				    stream.method3784((byte) (i_370_ >> 16));
				    stream.method3784((byte) (i_370_ >> 8));
				    stream.method3784((byte) i_370_);
				    stream.method3784(-1);
				    stream.method3785((float) i_343_);
				    stream.method3785((float) i_344_);
				    if ((((Class166_Sub2) this)
					 .anIntArrayArrayArray9820)
					!= null)
					stream.method3785(is_322_ != null
							  ? (float) ((is_322_
								      [i_342_])
								     - 1)
							  : 0.0F);
				    if ((((Class166_Sub2) this).anInt9810
					 & 0x7)
					!= 0) {
					stream.method3785(f_355_);
					stream.method3785(f_356_);
					stream.method3785(f_357_);
				    }
				} else {
				    stream.method3786((float) i_343_);
				    stream.method3786
					((float) (method3574(i_343_, i_344_,
							     -1353530182)
						  + i_349_));
				    stream.method3786((float) i_344_);
				    stream.method3784((byte) (i_370_ >> 16));
				    stream.method3784((byte) (i_370_ >> 8));
				    stream.method3784((byte) i_370_);
				    stream.method3784(-1);
				    stream.method3786((float) i_343_);
				    stream.method3786((float) i_344_);
				    if ((((Class166_Sub2) this)
					 .anIntArrayArrayArray9820)
					!= null)
					stream.method3786(is_322_ != null
							  ? (float) ((is_322_
								      [i_342_])
								     - 1)
							  : 0.0F);
				    if ((((Class166_Sub2) this).anInt9810
					 & 0x7)
					!= 0) {
					stream.method3786(f_355_);
					stream.method3786(f_356_);
					stream.method3786(f_357_);
				    }
				}
				i_369_ = ((Class166_Sub2) this).anInt9819++;
				is_341_[i_342_] = (short) i_369_;
				if (i_347_ != -1)
				    class241_sub45s[i_369_]
					= class241_sub45s_316_[i_342_];
				class407.put
				    (new Class241_Sub7(is_341_[i_342_]), l);
			    } else {
				is_341_[i_342_]
				    = ((Class241_Sub7) class241).aShort8826;
				i_369_ = is_341_[i_342_] & 0xffff;
				if (i_347_ != -1
				    && ((class241_sub45s_316_[i_342_].hashCode
					 * 4356572401218184725L)
					< (class241_sub45s[i_369_].hashCode
					   * 4356572401218184725L)))
				    class241_sub45s[i_369_]
					= class241_sub45s_316_[i_342_];
			    }
			    for (int i_376_ = 0; i_376_ < i_338_; i_376_++)
				class241_sub45s_313_[i_376_].method16492
				    (i_369_, i_353_, i_352_, f_354_);
			    ((Class166_Sub2) this).anInt9811++;
			}
		    }
		}
	    }
	    for (int i_377_ = 0; i_377_ < ((Class166_Sub2) this).anInt9819;
		 i_377_++) {
		Class241_Sub45 class241_sub45 = class241_sub45s[i_377_];
		if (class241_sub45 != null)
		    class241_sub45.method16490(i_377_);
	    }
	    for (int i_378_ = 0; i_378_ < anInt2055 * 266270313; i_378_++) {
		for (int i_379_ = 0; i_379_ < anInt2052 * -14610189;
		     i_379_++) {
		    short[] is_380_
			= (((Class166_Sub2) this).aShortArrayArray9829
			   [i_379_ * (anInt2055 * 266270313) + i_378_]);
		    if (is_380_ != null) {
			int i_381_ = 0;
			int i_382_ = 0;
			while (i_382_ < is_380_.length) {
			    int i_383_ = is_380_[i_382_++] & 0xffff;
			    int i_384_ = is_380_[i_382_++] & 0xffff;
			    int i_385_ = is_380_[i_382_++] & 0xffff;
			    Class241_Sub45 class241_sub45
				= class241_sub45s[i_383_];
			    Class241_Sub45 class241_sub45_386_
				= class241_sub45s[i_384_];
			    Class241_Sub45 class241_sub45_387_
				= class241_sub45s[i_385_];
			    Class241_Sub45 class241_sub45_388_ = null;
			    if (class241_sub45 != null) {
				class241_sub45.method16491(i_378_, i_379_,
							   i_381_);
				class241_sub45_388_ = class241_sub45;
			    }
			    if (class241_sub45_386_ != null) {
				class241_sub45_386_.method16491(i_378_, i_379_,
								i_381_);
				if (class241_sub45_388_ == null
				    || ((class241_sub45_386_.hashCode
					 * 4356572401218184725L)
					< (class241_sub45_388_.hashCode
					   * 4356572401218184725L)))
				    class241_sub45_388_ = class241_sub45_386_;
			    }
			    if (class241_sub45_387_ != null) {
				class241_sub45_387_.method16491(i_378_, i_379_,
								i_381_);
				if (class241_sub45_388_ == null
				    || ((class241_sub45_387_.hashCode
					 * 4356572401218184725L)
					< (class241_sub45_388_.hashCode
					   * 4356572401218184725L)))
				    class241_sub45_388_ = class241_sub45_387_;
			    }
			    if (class241_sub45_388_ != null) {
				if (class241_sub45 != null)
				    class241_sub45_388_.method16490(i_383_);
				if (class241_sub45_386_ != null)
				    class241_sub45_388_.method16490(i_384_);
				if (class241_sub45_387_ != null)
				    class241_sub45_388_.method16490(i_385_);
				class241_sub45_388_.method16491(i_378_, i_379_,
								i_381_);
			    }
			    i_381_++;
			}
		    }
		}
	    }
	    stream.method3787();
	    ((Class166_Sub2) this).anInterface8_9825
		= (((Class166_Sub2) this).aClass103_Sub1_9813.method15213
		   (i, nativeheapbuffer, stream.method3782(), false));
	    if (((Class166_Sub2) this).anInterface8_9825
		instanceof Class147_Sub1)
		nativeheapbuffer.method1686();
	    ((Class166_Sub2) this).aClass151_9826
		= new Class151(((Class166_Sub2) this).anInterface8_9825, 5126,
			       3, 0);
	    ((Class166_Sub2) this).aClass151_9809
		= new Class151(((Class166_Sub2) this).anInterface8_9825, 5121,
			       4, 12);
	    int i_389_;
	    if (((Class166_Sub2) this).anIntArrayArrayArray9820 != null) {
		((Class166_Sub2) this).aClass151_9830
		    = new Class151(((Class166_Sub2) this).anInterface8_9825,
				   5126, 3, 16);
		i_389_ = 28;
	    } else {
		((Class166_Sub2) this).aClass151_9830
		    = new Class151(((Class166_Sub2) this).anInterface8_9825,
				   5126, 2, 16);
		i_389_ = 24;
	    }
	    if ((((Class166_Sub2) this).anInt9810 & 0x7) != 0)
		((Class166_Sub2) this).aClass151_9828
		    = new Class151(((Class166_Sub2) this).anInterface8_9825,
				   5126, 3, i_389_);
	    long[] ls
		= new long[((Class166_Sub2) this).aClass241Array9824.length];
	    for (int i_390_ = 0;
		 i_390_ < ((Class166_Sub2) this).aClass241Array9824.length;
		 i_390_++) {
		Class241_Sub45 class241_sub45
		    = ((Class241_Sub45)
		       ((Class166_Sub2) this).aClass241Array9824[i_390_]);
		ls[i_390_] = class241_sub45.hashCode * 4356572401218184725L;
		class241_sub45.method16493(((Class166_Sub2) this).anInt9819);
	    }
	    Class570.method12515(ls, ((Class166_Sub2) this).aClass241Array9824,
				 1713537755);
	    if (((Class166_Sub2) this).aClass159_9822 != null)
		((Class166_Sub2) this).aClass159_9822.method3425();
	} else
	    ((Class166_Sub2) this).aClass159_9822 = null;
	if ((((Class166_Sub2) this).anInt9812 & 0x2) == 0) {
	    ((Class166_Sub2) this).anIntArrayArrayArray9818 = null;
	    ((Class166_Sub2) this).anIntArrayArrayArray9816 = null;
	    ((Class166_Sub2) this).anIntArrayArrayArray9815 = null;
	}
	((Class166_Sub2) this).anIntArrayArrayArray9820 = null;
	((Class166_Sub2) this).anIntArrayArrayArray9817 = null;
	((Class166_Sub2) this).anIntArrayArrayArray9804 = null;
	((Class166_Sub2) this).aClass241_Sub45ArrayArrayArray9814 = null;
	((Class166_Sub2) this).aByteArrayArray9832 = null;
	((Class166_Sub2) this).aClass407_9835 = null;
	((Class166_Sub2) this).aFloatArrayArray9806 = null;
	((Class166_Sub2) this).aFloatArrayArray9821 = null;
	((Class166_Sub2) this).aFloatArrayArray9833 = null;
    }
    
    public void method3560(int i, int i_391_, int[] is, int[] is_392_,
			   int[] is_393_, int[] is_394_, int[] is_395_,
			   int[] is_396_, int[] is_397_, int[] is_398_,
			   int[] is_399_, int[] is_400_, int[] is_401_,
			   Class86 class86, boolean bool) {
	int i_402_ = is_398_.length;
	int[] is_403_ = new int[i_402_ * 3];
	int[] is_404_ = new int[i_402_ * 3];
	int[] is_405_ = new int[i_402_ * 3];
	int[] is_406_ = is_399_ != null ? new int[i_402_ * 3] : null;
	int[] is_407_ = new int[i_402_ * 3];
	int[] is_408_ = new int[i_402_ * 3];
	int[] is_409_ = is_392_ != null ? new int[i_402_ * 3] : null;
	int[] is_410_ = is_394_ != null ? new int[i_402_ * 3] : null;
	int i_411_ = 0;
	for (int i_412_ = 0; i_412_ < i_402_; i_412_++) {
	    int i_413_ = is_395_[i_412_];
	    int i_414_ = is_396_[i_412_];
	    int i_415_ = is_397_[i_412_];
	    is_403_[i_411_] = is[i_413_];
	    is_404_[i_411_] = is_393_[i_413_];
	    is_405_[i_411_] = is_398_[i_412_];
	    is_407_[i_411_] = is_400_[i_412_];
	    is_408_[i_411_] = is_401_[i_412_];
	    if (is_399_ != null)
		is_406_[i_411_] = is_399_[i_412_];
	    if (is_392_ != null)
		is_409_[i_411_] = is_392_[i_413_];
	    if (is_394_ != null)
		is_410_[i_411_] = is_394_[i_413_];
	    i_411_++;
	    is_403_[i_411_] = is[i_414_];
	    is_404_[i_411_] = is_393_[i_414_];
	    is_405_[i_411_] = is_398_[i_412_];
	    is_407_[i_411_] = is_400_[i_412_];
	    is_408_[i_411_] = is_401_[i_412_];
	    if (is_399_ != null)
		is_406_[i_411_] = is_399_[i_412_];
	    if (is_392_ != null)
		is_409_[i_411_] = is_392_[i_414_];
	    if (is_394_ != null)
		is_410_[i_411_] = is_394_[i_414_];
	    i_411_++;
	    is_403_[i_411_] = is[i_415_];
	    is_404_[i_411_] = is_393_[i_415_];
	    is_405_[i_411_] = is_398_[i_412_];
	    is_407_[i_411_] = is_400_[i_412_];
	    is_408_[i_411_] = is_401_[i_412_];
	    if (is_399_ != null)
		is_406_[i_411_] = is_399_[i_412_];
	    if (is_392_ != null)
		is_409_[i_411_] = is_392_[i_415_];
	    if (is_394_ != null)
		is_410_[i_411_] = is_394_[i_415_];
	    i_411_++;
	}
	method3544(i, i_391_, is_403_, is_409_, is_404_, is_410_, is_405_,
		   is_406_, is_407_, is_408_, class86, bool);
    }
    
    public void method3580(Class241_Sub43 class241_sub43, int[] is) {
	((Class166_Sub2) this).aClass429_9823.addNode
	    (new Class241_Sub36(((Class166_Sub2) this).aClass103_Sub1_9813,
				this, class241_sub43, is),
	     (short) -11094);
    }
    
    public void method3566(int i, int i_416_, int i_417_, int i_418_,
			   int i_419_, int i_420_, int i_421_,
			   boolean[][] bools) {
	Class105 class105
	    = ((Class166_Sub2) this).aClass103_Sub1_9813.method2237((byte) 4);
	if (((Class166_Sub2) this).anInt9834 > 0 && class105 != null) {
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15145();
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15185(false);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15186(false);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15189(false);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15190(false);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15192(0);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15173(-2);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15177(null);
	    aFloatArray9837[0]
		= (float) i_417_ / (128.0F * (float) (anInt2053 * 2039042417)
				    * (float) class105.method2655());
	    aFloatArray9837[1] = 0.0F;
	    aFloatArray9837[2] = 0.0F;
	    aFloatArray9837[3] = 0.0F;
	    aFloatArray9837[4] = 0.0F;
	    aFloatArray9837[5]
		= (float) i_417_ / (128.0F * (float) (anInt2053 * 2039042417)
				    * (float) class105.method2654());
	    aFloatArray9837[6] = 0.0F;
	    aFloatArray9837[7] = 0.0F;
	    aFloatArray9837[8] = 0.0F;
	    aFloatArray9837[9] = 0.0F;
	    aFloatArray9837[10] = 0.0F;
	    aFloatArray9837[11] = 0.0F;
	    aFloatArray9837[12]
		= -1.0F - ((float) (i_418_ * i_417_) / 128.0F
			   - (float) (i * 2)) / (float) class105.method2655();
	    aFloatArray9837[13]
		= 1.0F - (((float) (2 * i_416_)
			   + (float) (i_421_ * i_417_) / 128.0F)
			  / (float) class105.method2654());
	    aFloatArray9837[14] = 0.0F;
	    aFloatArray9837[15] = 1.0F;
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glLoadMatrixf(aFloatArray9837, 0);
	    aFloatArray9837[0] = 1.0F;
	    aFloatArray9837[1] = 0.0F;
	    aFloatArray9837[2] = 0.0F;
	    aFloatArray9837[3] = 0.0F;
	    aFloatArray9837[4] = 0.0F;
	    aFloatArray9837[5] = 0.0F;
	    aFloatArray9837[6] = 1.0F;
	    aFloatArray9837[7] = 0.0F;
	    aFloatArray9837[8] = 0.0F;
	    aFloatArray9837[9] = 1.0F;
	    aFloatArray9837[10] = 0.0F;
	    aFloatArray9837[11] = 0.0F;
	    aFloatArray9837[12] = 0.0F;
	    aFloatArray9837[13] = 0.0F;
	    aFloatArray9837[14] = 0.0F;
	    aFloatArray9837[15] = 1.0F;
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glLoadMatrixf(aFloatArray9837, 0);
	    if ((((Class166_Sub2) this).anInt9810 & 0x7) != 0) {
		((Class166_Sub2) this).aClass103_Sub1_9813.method15186(true);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15126();
	    } else
		((Class166_Sub2) this).aClass103_Sub1_9813.method15186(false);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15168
		(((Class166_Sub2) this).aClass151_9826,
		 ((Class166_Sub2) this).aClass151_9828,
		 ((Class166_Sub2) this).aClass151_9809,
		 ((Class166_Sub2) this).aClass151_9830);
	    if ((((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		 .aClass241_Sub3_Sub2_9231.payload).length
		< ((Class166_Sub2) this).anInt9811 * 2)
		((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		    .aClass241_Sub3_Sub2_9231
		    = new Class241_Sub3_Sub2(((Class166_Sub2) this).anInt9811
					     * 2);
	    else
		((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		    .aClass241_Sub3_Sub2_9231.pointer
		    = 0;
	    int i_422_ = 0;
	    Class241_Sub3_Sub2 class241_sub3_sub2
		= (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		   .aClass241_Sub3_Sub2_9231);
	    if (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		.aBool9144) {
		for (int i_423_ = i_419_; i_423_ < i_421_; i_423_++) {
		    int i_424_ = i_423_ * (anInt2055 * 266270313) + i_418_;
		    for (int i_425_ = i_418_; i_425_ < i_420_; i_425_++) {
			if (bools[i_425_ - i_418_][i_423_ - i_419_]) {
			    short[] is = (((Class166_Sub2) this)
					  .aShortArrayArray9829[i_424_]);
			    if (is != null) {
				for (int i_426_ = 0; i_426_ < is.length;
				     i_426_++) {
				    class241_sub3_sub2.writeShort((is[i_426_]
								    & 0xffff),
								   -484048531);
				    i_422_++;
				}
			    }
			}
			i_424_++;
		    }
		}
	    } else {
		for (int i_427_ = i_419_; i_427_ < i_421_; i_427_++) {
		    int i_428_ = i_427_ * (anInt2055 * 266270313) + i_418_;
		    for (int i_429_ = i_418_; i_429_ < i_420_; i_429_++) {
			if (bools[i_429_ - i_418_][i_427_ - i_419_]) {
			    short[] is = (((Class166_Sub2) this)
					  .aShortArrayArray9829[i_428_]);
			    if (is != null) {
				for (int i_430_ = 0; i_430_ < is.length;
				     i_430_++) {
				    class241_sub3_sub2.method14621((is[i_430_]
								    & 0xffff),
								   (byte) -11);
				    i_422_++;
				}
			    }
			}
			i_428_++;
		    }
		}
	    }
	    if (i_422_ > 0) {
		Class149_Sub1 class149_sub1
		    = new Class149_Sub1((((Class166_Sub2) this)
					 .aClass103_Sub1_9813),
					5123,
					class241_sub3_sub2.payload,
					(class241_sub3_sub2.pointer
					 * 421967667));
		((Class166_Sub2) this).aClass103_Sub1_9813
		    .method15265(class149_sub1, 4, 0, i_422_);
	    }
	}
    }
    
    public Class241_Sub39_Sub17 method3578
	(int i, int i_431_, Class241_Sub39_Sub17 class241_sub39_sub17) {
	if ((((Class166_Sub2) this).aByteArrayArray9836[i][i_431_] & 0x1) == 0)
	    return null;
	int i_432_
	    = (anInt2053 * 2039042417
	       >> (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		   .anInt9093));
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2
	    = (Class241_Sub39_Sub17_Sub2) class241_sub39_sub17;
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2_433_;
	if (class241_sub39_sub17_sub2 != null
	    && class241_sub39_sub17_sub2.method17912(i_432_, i_432_)) {
	    class241_sub39_sub17_sub2_433_ = class241_sub39_sub17_sub2;
	    class241_sub39_sub17_sub2_433_.method17913();
	} else
	    class241_sub39_sub17_sub2_433_
		= new Class241_Sub39_Sub17_Sub2((((Class166_Sub2) this)
						 .aClass103_Sub1_9813),
						i_432_, i_432_);
	class241_sub39_sub17_sub2_433_.method17911(0, 0, i_432_, i_432_);
	method16156(class241_sub39_sub17_sub2_433_, i, i_431_);
	return class241_sub39_sub17_sub2_433_;
    }
    
    public void method3576(int i, int i_434_, int i_435_, int i_436_,
			   int i_437_, int i_438_, int i_439_,
			   boolean[][] bools) {
	Class105 class105
	    = ((Class166_Sub2) this).aClass103_Sub1_9813.method2237((byte) 4);
	if (((Class166_Sub2) this).anInt9834 > 0 && class105 != null) {
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15145();
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15185(false);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15186(false);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15189(false);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15190(false);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15192(0);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15173(-2);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15177(null);
	    aFloatArray9837[0]
		= (float) i_435_ / (128.0F * (float) (anInt2053 * 2039042417)
				    * (float) class105.method2655());
	    aFloatArray9837[1] = 0.0F;
	    aFloatArray9837[2] = 0.0F;
	    aFloatArray9837[3] = 0.0F;
	    aFloatArray9837[4] = 0.0F;
	    aFloatArray9837[5]
		= (float) i_435_ / (128.0F * (float) (anInt2053 * 2039042417)
				    * (float) class105.method2654());
	    aFloatArray9837[6] = 0.0F;
	    aFloatArray9837[7] = 0.0F;
	    aFloatArray9837[8] = 0.0F;
	    aFloatArray9837[9] = 0.0F;
	    aFloatArray9837[10] = 0.0F;
	    aFloatArray9837[11] = 0.0F;
	    aFloatArray9837[12]
		= -1.0F - ((float) (i_436_ * i_435_) / 128.0F
			   - (float) (i * 2)) / (float) class105.method2655();
	    aFloatArray9837[13]
		= 1.0F - (((float) (2 * i_434_)
			   + (float) (i_439_ * i_435_) / 128.0F)
			  / (float) class105.method2654());
	    aFloatArray9837[14] = 0.0F;
	    aFloatArray9837[15] = 1.0F;
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glLoadMatrixf(aFloatArray9837, 0);
	    aFloatArray9837[0] = 1.0F;
	    aFloatArray9837[1] = 0.0F;
	    aFloatArray9837[2] = 0.0F;
	    aFloatArray9837[3] = 0.0F;
	    aFloatArray9837[4] = 0.0F;
	    aFloatArray9837[5] = 0.0F;
	    aFloatArray9837[6] = 1.0F;
	    aFloatArray9837[7] = 0.0F;
	    aFloatArray9837[8] = 0.0F;
	    aFloatArray9837[9] = 1.0F;
	    aFloatArray9837[10] = 0.0F;
	    aFloatArray9837[11] = 0.0F;
	    aFloatArray9837[12] = 0.0F;
	    aFloatArray9837[13] = 0.0F;
	    aFloatArray9837[14] = 0.0F;
	    aFloatArray9837[15] = 1.0F;
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glLoadMatrixf(aFloatArray9837, 0);
	    if ((((Class166_Sub2) this).anInt9810 & 0x7) != 0) {
		((Class166_Sub2) this).aClass103_Sub1_9813.method15186(true);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15126();
	    } else
		((Class166_Sub2) this).aClass103_Sub1_9813.method15186(false);
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15168
		(((Class166_Sub2) this).aClass151_9826,
		 ((Class166_Sub2) this).aClass151_9828,
		 ((Class166_Sub2) this).aClass151_9809,
		 ((Class166_Sub2) this).aClass151_9830);
	    if ((((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		 .aClass241_Sub3_Sub2_9231.payload).length
		< ((Class166_Sub2) this).anInt9811 * 2)
		((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		    .aClass241_Sub3_Sub2_9231
		    = new Class241_Sub3_Sub2(((Class166_Sub2) this).anInt9811
					     * 2);
	    else
		((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		    .aClass241_Sub3_Sub2_9231.pointer
		    = 0;
	    int i_440_ = 0;
	    Class241_Sub3_Sub2 class241_sub3_sub2
		= (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		   .aClass241_Sub3_Sub2_9231);
	    if (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		.aBool9144) {
		for (int i_441_ = i_437_; i_441_ < i_439_; i_441_++) {
		    int i_442_ = i_441_ * (anInt2055 * 266270313) + i_436_;
		    for (int i_443_ = i_436_; i_443_ < i_438_; i_443_++) {
			if (bools[i_443_ - i_436_][i_441_ - i_437_]) {
			    short[] is = (((Class166_Sub2) this)
					  .aShortArrayArray9829[i_442_]);
			    if (is != null) {
				for (int i_444_ = 0; i_444_ < is.length;
				     i_444_++) {
				    class241_sub3_sub2.writeShort((is[i_444_]
								    & 0xffff),
								   -484048531);
				    i_440_++;
				}
			    }
			}
			i_442_++;
		    }
		}
	    } else {
		for (int i_445_ = i_437_; i_445_ < i_439_; i_445_++) {
		    int i_446_ = i_445_ * (anInt2055 * 266270313) + i_436_;
		    for (int i_447_ = i_436_; i_447_ < i_438_; i_447_++) {
			if (bools[i_447_ - i_436_][i_445_ - i_437_]) {
			    short[] is = (((Class166_Sub2) this)
					  .aShortArrayArray9829[i_446_]);
			    if (is != null) {
				for (int i_448_ = 0; i_448_ < is.length;
				     i_448_++) {
				    class241_sub3_sub2.method14621((is[i_448_]
								    & 0xffff),
								   (byte) -22);
				    i_440_++;
				}
			    }
			}
			i_446_++;
		    }
		}
	    }
	    if (i_440_ > 0) {
		Class149_Sub1 class149_sub1
		    = new Class149_Sub1((((Class166_Sub2) this)
					 .aClass103_Sub1_9813),
					5123,
					class241_sub3_sub2.payload,
					(class241_sub3_sub2.pointer
					 * 421967667));
		((Class166_Sub2) this).aClass103_Sub1_9813
		    .method15265(class149_sub1, 4, 0, i_440_);
	    }
	}
    }
    
    public Class241_Sub39_Sub17 method3571
	(int i, int i_449_, Class241_Sub39_Sub17 class241_sub39_sub17) {
	if ((((Class166_Sub2) this).aByteArrayArray9836[i][i_449_] & 0x1) == 0)
	    return null;
	int i_450_
	    = (anInt2053 * 2039042417
	       >> (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		   .anInt9093));
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2
	    = (Class241_Sub39_Sub17_Sub2) class241_sub39_sub17;
	Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2_451_;
	if (class241_sub39_sub17_sub2 != null
	    && class241_sub39_sub17_sub2.method17912(i_450_, i_450_)) {
	    class241_sub39_sub17_sub2_451_ = class241_sub39_sub17_sub2;
	    class241_sub39_sub17_sub2_451_.method17913();
	} else
	    class241_sub39_sub17_sub2_451_
		= new Class241_Sub39_Sub17_Sub2((((Class166_Sub2) this)
						 .aClass103_Sub1_9813),
						i_450_, i_450_);
	class241_sub39_sub17_sub2_451_.method17911(0, 0, i_450_, i_450_);
	method16156(class241_sub39_sub17_sub2_451_, i, i_449_);
	return class241_sub39_sub17_sub2_451_;
    }
    
    public void method3572(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_452_, int i_453_, int i_454_, boolean bool) {
	if (((Class166_Sub2) this).aClass159_9822 != null
	    && class241_sub39_sub17 != null) {
	    int i_455_
		= (i - (i_452_ * (((Class103_Sub1)
				   ((Class166_Sub2) this).aClass103_Sub1_9813)
				  .anInt9181)
			>> 8)
		   >> ((Class103_Sub1)
		       ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9093);
	    int i_456_
		= (i_453_ - (i_452_ * (((Class103_Sub1) (((Class166_Sub2) this)
							 .aClass103_Sub1_9813))
				       .anInt9169)
			     >> 8)
		   >> ((Class103_Sub1)
		       ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9093);
	    ((Class166_Sub2) this).aClass159_9822
		.method3411(class241_sub39_sub17, i_455_, i_456_);
	}
    }
    
    public void method3573(int i, int i_457_, int[] is, int[] is_458_,
			   int[] is_459_, int[] is_460_, int[] is_461_,
			   int[] is_462_, int[] is_463_, int[] is_464_,
			   Class86 class86, boolean bool) {
	Class107 class107
	    = ((Class166_Sub2) this).aClass103_Sub1_9813.aClass107_1458;
	if (is_460_ != null
	    && ((Class166_Sub2) this).anIntArrayArrayArray9820 == null)
	    ((Class166_Sub2) this).anIntArrayArrayArray9820
		= new int[anInt2055 * 266270313][anInt2052 * -14610189][];
	if (is_458_ != null
	    && ((Class166_Sub2) this).anIntArrayArrayArray9804 == null)
	    ((Class166_Sub2) this).anIntArrayArrayArray9804
		= new int[anInt2055 * 266270313][anInt2052 * -14610189][];
	((Class166_Sub2) this).anIntArrayArrayArray9816[i][i_457_] = is;
	((Class166_Sub2) this).anIntArrayArrayArray9818[i][i_457_] = is_459_;
	((Class166_Sub2) this).anIntArrayArrayArray9815[i][i_457_] = is_461_;
	((Class166_Sub2) this).anIntArrayArrayArray9817[i][i_457_] = is_462_;
	if (((Class166_Sub2) this).anIntArrayArrayArray9820 != null)
	    ((Class166_Sub2) this).anIntArrayArrayArray9820[i][i_457_]
		= is_460_;
	if (((Class166_Sub2) this).anIntArrayArrayArray9804 != null)
	    ((Class166_Sub2) this).anIntArrayArrayArray9804[i][i_457_]
		= is_458_;
	Class241_Sub45[] class241_sub45s
	    = (((Class166_Sub2) this).aClass241_Sub45ArrayArrayArray9814[i]
		   [i_457_]
	       = new Class241_Sub45[is_461_.length]);
	for (int i_465_ = 0; i_465_ < is_461_.length; i_465_++) {
	    int i_466_ = is_463_[i_465_];
	    int i_467_ = is_464_[i_465_];
	    if ((((Class166_Sub2) this).anInt9810 & 0x20) != 0 && i_466_ != -1
		&& class107.method2680(i_466_, 721683436).aBool1434) {
		i_467_ = 128;
		i_466_ = -1;
	    }
	    long l = ((long) (class86.anInt1253 * 642800105) << 48
		      | (long) (class86.anInt1252 * -1282025259) << 42
		      | (long) (class86.anInt1251 * 1897985763) << 28
		      | (long) (i_467_ << 14) | (long) i_466_);
	    Node class241;
	    for (class241
		     = ((Class166_Sub2) this).aClass407_9835.get(l);
		 class241 != null;
		 class241 = ((Class166_Sub2) this).aClass407_9835
				.method7289((byte) -96)) {
		Class241_Sub45 class241_sub45 = (Class241_Sub45) class241;
		if (((Class241_Sub45) class241_sub45).anInt10192 == i_466_
		    && (((Class241_Sub45) class241_sub45).aFloat10187
			== (float) i_467_)
		    && ((Class241_Sub45) class241_sub45).aClass86_10193
			   .method1849(class86, 209000972))
		    break;
	    }
	    if (class241 == null) {
		class241_sub45s[i_465_]
		    = new Class241_Sub45(this, i_466_, i_467_, class86);
		((Class166_Sub2) this).aClass407_9835
		    .put(class241_sub45s[i_465_], l);
	    } else
		class241_sub45s[i_465_] = (Class241_Sub45) class241;
	}
	if (bool)
	    ((Class166_Sub2) this).aByteArrayArray9836[i][i_457_] |= 0x1;
	if (is_461_.length > ((Class166_Sub2) this).anInt9831)
	    ((Class166_Sub2) this).anInt9831 = is_461_.length;
	((Class166_Sub2) this).anInt9834 += is_461_.length;
    }
    
    public void method3542(int i, int i_468_, int i_469_) {
	i = Math.min(((Class166_Sub2) this).aByteArrayArray9832.length - 1,
		     Math.max(0, i));
	i_468_ = Math.min((((Class166_Sub2) this).aByteArrayArray9832[i].length
			   - 1),
			  Math.max(0, i_468_));
	if ((((Class166_Sub2) this).aByteArrayArray9832[i][i_468_] & 0xff)
	    < i_469_)
	    ((Class166_Sub2) this).aByteArrayArray9832[i][i_468_]
		= (byte) i_469_;
    }
    
    public void method3575(Class241_Sub43 class241_sub43, int[] is) {
	((Class166_Sub2) this).aClass429_9823.addNode
	    (new Class241_Sub36(((Class166_Sub2) this).aClass103_Sub1_9813,
				this, class241_sub43, is),
	     (short) -2505);
    }
    
    void method16160(int i, int i_470_, int i_471_, boolean[][] bools,
		     boolean bool, int i_472_) {
	if (((Class166_Sub2) this).aClass241Array9824 != null) {
	    int i_473_ = i_471_ + i_471_ + 1;
	    i_473_ *= i_473_;
	    if ((((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		 .anIntArray9051).length
		< i_473_)
		((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		    .anIntArray9051
		    = new int[i_473_];
	    if ((((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		 .aClass241_Sub3_Sub2_9231.payload).length
		< ((Class166_Sub2) this).anInt9811 * 2)
		((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		    .aClass241_Sub3_Sub2_9231
		    = new Class241_Sub3_Sub2(((Class166_Sub2) this).anInt9811
					     * 2);
	    int i_474_ = i - i_471_;
	    int i_475_ = i_474_;
	    if (i_474_ < 0)
		i_474_ = 0;
	    int i_476_ = i_470_ - i_471_;
	    int i_477_ = i_476_;
	    if (i_476_ < 0)
		i_476_ = 0;
	    int i_478_ = i + i_471_;
	    if (i_478_ > anInt2055 * 266270313 - 1)
		i_478_ = anInt2055 * 266270313 - 1;
	    int i_479_ = i_470_ + i_471_;
	    if (i_479_ > anInt2052 * -14610189 - 1)
		i_479_ = anInt2052 * -14610189 - 1;
	    int i_480_ = 0;
	    int[] is
		= (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		   .anIntArray9051);
	    for (int i_481_ = i_474_; i_481_ <= i_478_; i_481_++) {
		boolean[] bools_482_ = bools[i_481_ - i_475_];
		for (int i_483_ = i_476_; i_483_ <= i_479_; i_483_++) {
		    if (bools_482_[i_483_ - i_477_])
			is[i_480_++]
			    = i_483_ * (anInt2055 * 266270313) + i_481_;
		}
	    }
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15259();
	    ((Class166_Sub2) this).aClass103_Sub1_9813
		.method15186((((Class166_Sub2) this).anInt9810 & 0x7) != 0);
	    for (int i_484_ = 0;
		 i_484_ < ((Class166_Sub2) this).aClass241Array9824.length - 0;
		 i_484_++)
		((Class241_Sub45)
		 ((Class166_Sub2) this).aClass241Array9824[i_484_])
		    .method16494(is, i_480_);
	    if (!((Class166_Sub2) this).aClass429_9823
		     .isEmpty(-378175713)) {
		int i_485_ = (((Class103_Sub1)
			       ((Class166_Sub2) this).aClass103_Sub1_9813)
			      .anInt9111);
		int i_486_ = (((Class103_Sub1)
			       ((Class166_Sub2) this).aClass103_Sub1_9813)
			      .anInt9172);
		((Class166_Sub2) this).aClass103_Sub1_9813.method2314
		    (0, i_486_,
		     ((Class103_Sub1)
		      ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9173);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15186(false);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15190(false);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15192(128);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15173(-2);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15177
		    (((Class103_Sub1)
		      ((Class166_Sub2) this).aClass103_Sub1_9813)
		     .aClass142_Sub4_9190);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15180(8448,
								       7681);
		((Class166_Sub2) this).aClass103_Sub1_9813
		    .method15181(0, 34166, 770);
		((Class166_Sub2) this).aClass103_Sub1_9813
		    .method15352(0, 34167, 770);
		for (Node class241 = ((Class166_Sub2) this)
					     .aClass429_9823
					     .method7694(16711935);
		     class241 != null;
		     class241 = ((Class166_Sub2) this).aClass429_9823
				    .method7692(1068002912)) {
		    Class241_Sub36 class241_sub36 = (Class241_Sub36) class241;
		    class241_sub36.method16412(i, i_470_, i_471_, bools);
		}
		((Class166_Sub2) this).aClass103_Sub1_9813.method15181(0, 5890,
								       768);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15352(0, 5890,
								       770);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15177(null);
		((Class166_Sub2) this).aClass103_Sub1_9813.method2314
		    (i_485_, i_486_,
		     ((Class103_Sub1)
		      ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9173);
	    }
	    if (((Class166_Sub2) this).aClass159_9822 != null) {
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15168
		    (((Class166_Sub2) this).aClass151_9826, null, null,
		     ((Class166_Sub2) this).aClass151_9830);
		((Class166_Sub2) this).aClass159_9822
		    .method3410(i, i_470_, i_471_, bools, bool);
		OpenGL.glPopMatrix();
	    }
	}
    }
    
    void method16161(int i, int i_487_, int i_488_, boolean[][] bools,
		     boolean bool, int i_489_) {
	if (((Class166_Sub2) this).aClass241Array9824 != null) {
	    int i_490_ = i_488_ + i_488_ + 1;
	    i_490_ *= i_490_;
	    if ((((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		 .anIntArray9051).length
		< i_490_)
		((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		    .anIntArray9051
		    = new int[i_490_];
	    if ((((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		 .aClass241_Sub3_Sub2_9231.payload).length
		< ((Class166_Sub2) this).anInt9811 * 2)
		((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		    .aClass241_Sub3_Sub2_9231
		    = new Class241_Sub3_Sub2(((Class166_Sub2) this).anInt9811
					     * 2);
	    int i_491_ = i - i_488_;
	    int i_492_ = i_491_;
	    if (i_491_ < 0)
		i_491_ = 0;
	    int i_493_ = i_487_ - i_488_;
	    int i_494_ = i_493_;
	    if (i_493_ < 0)
		i_493_ = 0;
	    int i_495_ = i + i_488_;
	    if (i_495_ > anInt2055 * 266270313 - 1)
		i_495_ = anInt2055 * 266270313 - 1;
	    int i_496_ = i_487_ + i_488_;
	    if (i_496_ > anInt2052 * -14610189 - 1)
		i_496_ = anInt2052 * -14610189 - 1;
	    int i_497_ = 0;
	    int[] is
		= (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		   .anIntArray9051);
	    for (int i_498_ = i_491_; i_498_ <= i_495_; i_498_++) {
		boolean[] bools_499_ = bools[i_498_ - i_492_];
		for (int i_500_ = i_493_; i_500_ <= i_496_; i_500_++) {
		    if (bools_499_[i_500_ - i_494_])
			is[i_497_++]
			    = i_500_ * (anInt2055 * 266270313) + i_498_;
		}
	    }
	    ((Class166_Sub2) this).aClass103_Sub1_9813.method15259();
	    ((Class166_Sub2) this).aClass103_Sub1_9813
		.method15186((((Class166_Sub2) this).anInt9810 & 0x7) != 0);
	    for (int i_501_ = 0;
		 i_501_ < ((Class166_Sub2) this).aClass241Array9824.length - 0;
		 i_501_++)
		((Class241_Sub45)
		 ((Class166_Sub2) this).aClass241Array9824[i_501_])
		    .method16494(is, i_497_);
	    if (!((Class166_Sub2) this).aClass429_9823.isEmpty(524072547)) {
		int i_502_ = (((Class103_Sub1)
			       ((Class166_Sub2) this).aClass103_Sub1_9813)
			      .anInt9111);
		int i_503_ = (((Class103_Sub1)
			       ((Class166_Sub2) this).aClass103_Sub1_9813)
			      .anInt9172);
		((Class166_Sub2) this).aClass103_Sub1_9813.method2314
		    (0, i_503_,
		     ((Class103_Sub1)
		      ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9173);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15186(false);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15190(false);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15192(128);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15173(-2);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15177
		    (((Class103_Sub1)
		      ((Class166_Sub2) this).aClass103_Sub1_9813)
		     .aClass142_Sub4_9190);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15180(8448,
								       7681);
		((Class166_Sub2) this).aClass103_Sub1_9813
		    .method15181(0, 34166, 770);
		((Class166_Sub2) this).aClass103_Sub1_9813
		    .method15352(0, 34167, 770);
		for (Node class241 = ((Class166_Sub2) this)
					     .aClass429_9823
					     .method7694(16711935);
		     class241 != null;
		     class241 = ((Class166_Sub2) this).aClass429_9823
				    .method7692(1134078884)) {
		    Class241_Sub36 class241_sub36 = (Class241_Sub36) class241;
		    class241_sub36.method16412(i, i_487_, i_488_, bools);
		}
		((Class166_Sub2) this).aClass103_Sub1_9813.method15181(0, 5890,
								       768);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15352(0, 5890,
								       770);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15177(null);
		((Class166_Sub2) this).aClass103_Sub1_9813.method2314
		    (i_502_, i_503_,
		     ((Class103_Sub1)
		      ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9173);
	    }
	    if (((Class166_Sub2) this).aClass159_9822 != null) {
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		((Class166_Sub2) this).aClass103_Sub1_9813.method15168
		    (((Class166_Sub2) this).aClass151_9826, null, null,
		     ((Class166_Sub2) this).aClass151_9830);
		((Class166_Sub2) this).aClass159_9822
		    .method3410(i, i_487_, i_488_, bools, bool);
		OpenGL.glPopMatrix();
	    }
	}
    }
    
    void method16162(Class241_Sub39_Sub17_Sub2 class241_sub39_sub17_sub2,
		     int i, int i_504_) {
	int[] is = ((Class166_Sub2) this).anIntArrayArrayArray9816[i][i_504_];
	int[] is_505_
	    = ((Class166_Sub2) this).anIntArrayArrayArray9818[i][i_504_];
	int i_506_ = is.length;
	if ((((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
	     .anIntArray9232).length
	    < i_506_) {
	    ((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		.anIntArray9232
		= new int[i_506_];
	    ((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		.anIntArray9175
		= new int[i_506_];
	}
	int[] is_507_
	    = (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
	       .anIntArray9232);
	int[] is_508_
	    = (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
	       .anIntArray9175);
	for (int i_509_ = 0; i_509_ < i_506_; i_509_++) {
	    is_507_[i_509_]
		= is[i_509_] >> (((Class103_Sub1)
				  ((Class166_Sub2) this).aClass103_Sub1_9813)
				 .anInt9093);
	    is_508_[i_509_]
		= is_505_[i_509_] >> (((Class103_Sub1) (((Class166_Sub2) this)
							.aClass103_Sub1_9813))
				      .anInt9093);
	}
	int i_510_ = 0;
	while (i_510_ < i_506_) {
	    int i_511_ = is_507_[i_510_];
	    int i_512_ = is_508_[i_510_++];
	    int i_513_ = is_507_[i_510_];
	    int i_514_ = is_508_[i_510_++];
	    int i_515_ = is_507_[i_510_];
	    int i_516_ = is_508_[i_510_++];
	    if (((i_511_ - i_513_) * (i_514_ - i_516_)
		 - (i_514_ - i_512_) * (i_515_ - i_513_))
		> 0)
		class241_sub39_sub17_sub2.method17914(i_512_, i_514_, i_516_,
						      i_511_, i_513_, i_515_);
	}
    }
    
    public void method3579() {
	if (((Class166_Sub2) this).anInt9834 > 0) {
	    byte[][] is = (new byte[anInt2055 * 266270313 + 1]
			   [anInt2052 * -14610189 + 1]);
	    for (int i = 1; i < anInt2055 * 266270313; i++) {
		for (int i_517_ = 1; i_517_ < anInt2052 * -14610189; i_517_++)
		    is[i][i_517_]
			= (byte) (((((Class166_Sub2) this).aByteArrayArray9832
				    [i - 1][i_517_])
				   >> 2)
				  + ((((Class166_Sub2) this)
				      .aByteArrayArray9832[i + 1][i_517_])
				     >> 3)
				  + ((((Class166_Sub2) this)
				      .aByteArrayArray9832[i][i_517_ - 1])
				     >> 2)
				  + ((((Class166_Sub2) this)
				      .aByteArrayArray9832[i][i_517_ + 1])
				     >> 3)
				  + ((((Class166_Sub2) this)
				      .aByteArrayArray9832[i][i_517_])
				     >> 1));
	    }
	    ((Class166_Sub2) this).aClass241Array9824
		= new Node[((Class166_Sub2) this).aClass407_9835
				   .method7306(198320183)];
	    ((Class166_Sub2) this).aClass407_9835.method7305
		(((Class166_Sub2) this).aClass241Array9824, -2132668592);
	    for (int i = 0;
		 i < ((Class166_Sub2) this).aClass241Array9824.length; i++)
		((Class241_Sub45) ((Class166_Sub2) this).aClass241Array9824[i])
		    .method16498(((Class166_Sub2) this).anInt9834);
	    int i = 24;
	    if (((Class166_Sub2) this).anIntArrayArrayArray9820 != null)
		i += 4;
	    if ((((Class166_Sub2) this).anInt9810 & 0x7) != 0)
		i += 12;
	    NativeHeapBuffer nativeheapbuffer
		= ((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		      .aNativeHeap9165
		      .method963(((Class166_Sub2) this).anInt9834 * i, false);
	    Stream stream = new Stream(nativeheapbuffer);
	    Class241_Sub45[] class241_sub45s
		= new Class241_Sub45[((Class166_Sub2) this).anInt9834];
	    int i_518_
		= RSAKeys.method860(((Class166_Sub2) this).anInt9834 / 4,
				    -1959341094);
	    if (i_518_ < 1)
		i_518_ = 1;
	    HashTable class407 = new HashTable(i_518_);
	    Class241_Sub45[] class241_sub45s_519_
		= new Class241_Sub45[((Class166_Sub2) this).anInt9831];
	    for (int i_520_ = 0; i_520_ < anInt2055 * 266270313; i_520_++) {
		for (int i_521_ = 0; i_521_ < anInt2052 * -14610189;
		     i_521_++) {
		    if ((((Class166_Sub2) this).anIntArrayArrayArray9815
			 [i_520_][i_521_])
			!= null) {
			Class241_Sub45[] class241_sub45s_522_
			    = (((Class166_Sub2) this)
			       .aClass241_Sub45ArrayArrayArray9814[i_520_]
			       [i_521_]);
			int[] is_523_
			    = (((Class166_Sub2) this).anIntArrayArrayArray9816
			       [i_520_][i_521_]);
			int[] is_524_
			    = (((Class166_Sub2) this).anIntArrayArrayArray9818
			       [i_520_][i_521_]);
			int[] is_525_
			    = (((Class166_Sub2) this).anIntArrayArrayArray9817
			       [i_520_][i_521_]);
			int[] is_526_
			    = (((Class166_Sub2) this).anIntArrayArrayArray9815
			       [i_520_][i_521_]);
			int[] is_527_
			    = ((((Class166_Sub2) this).anIntArrayArrayArray9804
				!= null)
			       ? (((Class166_Sub2) this)
				  .anIntArrayArrayArray9804[i_520_][i_521_])
			       : null);
			int[] is_528_
			    = ((((Class166_Sub2) this).anIntArrayArrayArray9820
				!= null)
			       ? (((Class166_Sub2) this)
				  .anIntArrayArrayArray9820[i_520_][i_521_])
			       : null);
			if (is_525_ == null)
			    is_525_ = is_526_;
			float f = (((Class166_Sub2) this).aFloatArrayArray9833
				   [i_520_][i_521_]);
			float f_529_ = (((Class166_Sub2) this)
					.aFloatArrayArray9821[i_520_][i_521_]);
			float f_530_ = (((Class166_Sub2) this)
					.aFloatArrayArray9806[i_520_][i_521_]);
			float f_531_
			    = (((Class166_Sub2) this).aFloatArrayArray9833
			       [i_520_][i_521_ + 1]);
			float f_532_
			    = (((Class166_Sub2) this).aFloatArrayArray9821
			       [i_520_][i_521_ + 1]);
			float f_533_
			    = (((Class166_Sub2) this).aFloatArrayArray9806
			       [i_520_][i_521_ + 1]);
			float f_534_
			    = (((Class166_Sub2) this).aFloatArrayArray9833
			       [i_520_ + 1][i_521_ + 1]);
			float f_535_
			    = (((Class166_Sub2) this).aFloatArrayArray9821
			       [i_520_ + 1][i_521_ + 1]);
			float f_536_
			    = (((Class166_Sub2) this).aFloatArrayArray9806
			       [i_520_ + 1][i_521_ + 1]);
			float f_537_
			    = (((Class166_Sub2) this).aFloatArrayArray9833
			       [i_520_ + 1][i_521_]);
			float f_538_
			    = (((Class166_Sub2) this).aFloatArrayArray9821
			       [i_520_ + 1][i_521_]);
			float f_539_
			    = (((Class166_Sub2) this).aFloatArrayArray9806
			       [i_520_ + 1][i_521_]);
			int i_540_ = is[i_520_][i_521_] & 0xff;
			int i_541_ = is[i_520_][i_521_ + 1] & 0xff;
			int i_542_ = is[i_520_ + 1][i_521_ + 1] & 0xff;
			int i_543_ = is[i_520_ + 1][i_521_] & 0xff;
			int i_544_ = 0;
		    while_118_:
			for (int i_545_ = 0; i_545_ < is_526_.length;
			     i_545_++) {
			    Class241_Sub45 class241_sub45
				= class241_sub45s_522_[i_545_];
			    for (int i_546_ = 0; i_546_ < i_544_; i_546_++) {
				if (class241_sub45s_519_[i_546_]
				    == class241_sub45)
				    continue while_118_;
			    }
			    class241_sub45s_519_[i_544_++] = class241_sub45;
			}
			short[] is_547_
			    = (((Class166_Sub2) this).aShortArrayArray9829
				   [i_521_ * (anInt2055 * 266270313) + i_520_]
			       = new short[is_526_.length]);
			for (int i_548_ = 0; i_548_ < is_526_.length;
			     i_548_++) {
			    int i_549_ = ((i_520_ << anInt2054 * -122333825)
					  + is_523_[i_548_]);
			    int i_550_ = ((i_521_ << anInt2054 * -122333825)
					  + is_524_[i_548_]);
			    int i_551_
				= i_549_ >> ((Class166_Sub2) this).anInt9807;
			    int i_552_
				= i_550_ >> ((Class166_Sub2) this).anInt9807;
			    int i_553_ = is_526_[i_548_];
			    int i_554_ = is_525_[i_548_];
			    int i_555_ = is_527_ != null ? is_527_[i_548_] : 0;
			    long l = ((long) i_554_ << 48 | (long) i_553_ << 32
				      | (long) (i_551_ << 16) | (long) i_552_);
			    int i_556_ = is_523_[i_548_];
			    int i_557_ = is_524_[i_548_];
			    int i_558_ = 74;
			    int i_559_ = 0;
			    float f_560_ = 1.0F;
			    float f_561_;
			    float f_562_;
			    float f_563_;
			    if (i_556_ == 0 && i_557_ == 0) {
				f_561_ = f;
				f_562_ = f_529_;
				f_563_ = f_530_;
				i_558_ -= i_540_;
			    } else if (i_556_ == 0
				       && i_557_ == anInt2053 * 2039042417) {
				f_561_ = f_531_;
				f_562_ = f_532_;
				f_563_ = f_533_;
				i_558_ -= i_541_;
			    } else if (i_556_ == anInt2053 * 2039042417
				       && i_557_ == anInt2053 * 2039042417) {
				f_561_ = f_534_;
				f_562_ = f_535_;
				f_563_ = f_536_;
				i_558_ -= i_542_;
			    } else if (i_556_ == anInt2053 * 2039042417
				       && i_557_ == 0) {
				f_561_ = f_537_;
				f_562_ = f_538_;
				f_563_ = f_539_;
				i_558_ -= i_543_;
			    } else {
				float f_564_
				    = ((float) i_556_
				       / (float) (anInt2053 * 2039042417));
				float f_565_
				    = ((float) i_557_
				       / (float) (anInt2053 * 2039042417));
				float f_566_ = f + (f_537_ - f) * f_564_;
				float f_567_
				    = f_529_ + (f_538_ - f_529_) * f_564_;
				float f_568_
				    = f_530_ + (f_539_ - f_530_) * f_564_;
				float f_569_
				    = f_531_ + (f_534_ - f_531_) * f_564_;
				float f_570_
				    = f_532_ + (f_535_ - f_532_) * f_564_;
				float f_571_
				    = f_533_ + (f_536_ - f_533_) * f_564_;
				f_561_ = f_566_ + (f_569_ - f_566_) * f_565_;
				f_562_ = f_567_ + (f_570_ - f_567_) * f_565_;
				f_563_ = f_568_ + (f_571_ - f_568_) * f_565_;
				int i_572_
				    = i_540_ + ((i_543_ - i_540_) * i_556_
						>> anInt2054 * -122333825);
				int i_573_
				    = i_541_ + ((i_542_ - i_541_) * i_556_
						>> anInt2054 * -122333825);
				i_558_ -= i_572_ + ((i_573_ - i_572_) * i_557_
						    >> anInt2054 * -122333825);
			    }
			    if (i_553_ != -1) {
				int i_574_ = (i_553_ & 0x7f) * i_558_ >> 7;
				if (i_574_ < 2)
				    i_574_ = 2;
				else if (i_574_ > 126)
				    i_574_ = 126;
				i_559_ = (Class474.anIntArray6383
					  [i_553_ & 0xff80 | i_574_]);
				if ((((Class166_Sub2) this).anInt9810 & 0x7)
				    == 0) {
				    f_560_
					= ((((Class103_Sub1)
					     (((Class166_Sub2) this)
					      .aClass103_Sub1_9813))
					    .aFloatArray9156[0]) * f_561_
					   + (((Class103_Sub1)
					       (((Class166_Sub2) this)
						.aClass103_Sub1_9813))
					      .aFloatArray9156[1]) * f_562_
					   + (((Class103_Sub1)
					       (((Class166_Sub2) this)
						.aClass103_Sub1_9813))
					      .aFloatArray9156[2]) * f_563_);
				    f_560_
					= (((Class103_Sub1)
					    (((Class166_Sub2) this)
					     .aClass103_Sub1_9813)).aFloat9162
					   + (f_560_
					      * (f_560_ > 0.0F
						 ? (((Class103_Sub1)
						     (((Class166_Sub2) this)
						      .aClass103_Sub1_9813))
						    .aFloat9153)
						 : (((Class103_Sub1)
						     (((Class166_Sub2) this)
						      .aClass103_Sub1_9813))
						    .aFloat9171))));
				}
			    }
			    Node class241 = null;
			    if ((i_549_
				 & ((Class166_Sub2) this).anInt9808 - 1) == 0
				&& ((i_550_
				     & ((Class166_Sub2) this).anInt9808 - 1)
				    == 0))
				class241 = class407.get(l);
			    int i_575_;
			    if (class241 == null) {
				int i_576_;
				if (i_554_ != i_553_) {
				    int i_577_ = (i_554_ & 0x7f) * i_558_ >> 7;
				    if (i_577_ < 2)
					i_577_ = 2;
				    else if (i_577_ > 126)
					i_577_ = 126;
				    i_576_ = (Class474.anIntArray6383
					      [i_554_ & 0xff80 | i_577_]);
				    if ((((Class166_Sub2) this).anInt9810
					 & 0x7)
					== 0) {
					float f_578_
					    = ((((Class103_Sub1)
						 (((Class166_Sub2) this)
						  .aClass103_Sub1_9813))
						.aFloatArray9156[0]) * f_561_
					       + (((Class103_Sub1)
						   (((Class166_Sub2) this)
						    .aClass103_Sub1_9813))
						  .aFloatArray9156[1]) * f_562_
					       + ((((Class103_Sub1)
						    (((Class166_Sub2) this)
						     .aClass103_Sub1_9813))
						   .aFloatArray9156[2])
						  * f_563_));
					f_578_
					    = ((((Class103_Sub1)
						 (((Class166_Sub2) this)
						  .aClass103_Sub1_9813))
						.aFloat9162)
					       + (f_560_
						  * (f_560_ > 0.0F
						     ? (((Class103_Sub1)
							 (((Class166_Sub2)
							   this)
							  .aClass103_Sub1_9813))
							.aFloat9153)
						     : (((Class103_Sub1)
							 (((Class166_Sub2)
							   this)
							  .aClass103_Sub1_9813))
							.aFloat9171))));
					int i_579_ = i_576_ >> 16 & 0xff;
					int i_580_ = i_576_ >> 8 & 0xff;
					int i_581_ = i_576_ & 0xff;
					i_579_ *= f_578_;
					if (i_579_ < 0)
					    i_579_ = 0;
					else if (i_579_ > 255)
					    i_579_ = 255;
					i_580_ *= f_578_;
					if (i_580_ < 0)
					    i_580_ = 0;
					else if (i_580_ > 255)
					    i_580_ = 255;
					i_581_ *= f_578_;
					if (i_581_ < 0)
					    i_581_ = 0;
					else if (i_581_ > 255)
					    i_581_ = 255;
					i_576_ = (i_579_ << 16 | i_580_ << 8
						  | i_581_);
				    }
				} else
				    i_576_ = i_559_;
				if (((Class103_Sub1) (((Class166_Sub2) this)
						      .aClass103_Sub1_9813))
				    .aBool9144) {
				    stream.method3785((float) i_549_);
				    stream.method3785
					((float) (method3574(i_549_, i_550_,
							     -264121106)
						  + i_555_));
				    stream.method3785((float) i_550_);
				    stream.method3784((byte) (i_576_ >> 16));
				    stream.method3784((byte) (i_576_ >> 8));
				    stream.method3784((byte) i_576_);
				    stream.method3784(-1);
				    stream.method3785((float) i_549_);
				    stream.method3785((float) i_550_);
				    if ((((Class166_Sub2) this)
					 .anIntArrayArrayArray9820)
					!= null)
					stream.method3785(is_528_ != null
							  ? (float) ((is_528_
								      [i_548_])
								     - 1)
							  : 0.0F);
				    if ((((Class166_Sub2) this).anInt9810
					 & 0x7)
					!= 0) {
					stream.method3785(f_561_);
					stream.method3785(f_562_);
					stream.method3785(f_563_);
				    }
				} else {
				    stream.method3786((float) i_549_);
				    stream.method3786
					((float) (method3574(i_549_, i_550_,
							     -318091700)
						  + i_555_));
				    stream.method3786((float) i_550_);
				    stream.method3784((byte) (i_576_ >> 16));
				    stream.method3784((byte) (i_576_ >> 8));
				    stream.method3784((byte) i_576_);
				    stream.method3784(-1);
				    stream.method3786((float) i_549_);
				    stream.method3786((float) i_550_);
				    if ((((Class166_Sub2) this)
					 .anIntArrayArrayArray9820)
					!= null)
					stream.method3786(is_528_ != null
							  ? (float) ((is_528_
								      [i_548_])
								     - 1)
							  : 0.0F);
				    if ((((Class166_Sub2) this).anInt9810
					 & 0x7)
					!= 0) {
					stream.method3786(f_561_);
					stream.method3786(f_562_);
					stream.method3786(f_563_);
				    }
				}
				i_575_ = ((Class166_Sub2) this).anInt9819++;
				is_547_[i_548_] = (short) i_575_;
				if (i_553_ != -1)
				    class241_sub45s[i_575_]
					= class241_sub45s_522_[i_548_];
				class407.put
				    (new Class241_Sub7(is_547_[i_548_]), l);
			    } else {
				is_547_[i_548_]
				    = ((Class241_Sub7) class241).aShort8826;
				i_575_ = is_547_[i_548_] & 0xffff;
				if (i_553_ != -1
				    && ((class241_sub45s_522_[i_548_].hashCode
					 * 4356572401218184725L)
					< (class241_sub45s[i_575_].hashCode
					   * 4356572401218184725L)))
				    class241_sub45s[i_575_]
					= class241_sub45s_522_[i_548_];
			    }
			    for (int i_582_ = 0; i_582_ < i_544_; i_582_++)
				class241_sub45s_519_[i_582_].method16492
				    (i_575_, i_559_, i_558_, f_560_);
			    ((Class166_Sub2) this).anInt9811++;
			}
		    }
		}
	    }
	    for (int i_583_ = 0; i_583_ < ((Class166_Sub2) this).anInt9819;
		 i_583_++) {
		Class241_Sub45 class241_sub45 = class241_sub45s[i_583_];
		if (class241_sub45 != null)
		    class241_sub45.method16490(i_583_);
	    }
	    for (int i_584_ = 0; i_584_ < anInt2055 * 266270313; i_584_++) {
		for (int i_585_ = 0; i_585_ < anInt2052 * -14610189;
		     i_585_++) {
		    short[] is_586_
			= (((Class166_Sub2) this).aShortArrayArray9829
			   [i_585_ * (anInt2055 * 266270313) + i_584_]);
		    if (is_586_ != null) {
			int i_587_ = 0;
			int i_588_ = 0;
			while (i_588_ < is_586_.length) {
			    int i_589_ = is_586_[i_588_++] & 0xffff;
			    int i_590_ = is_586_[i_588_++] & 0xffff;
			    int i_591_ = is_586_[i_588_++] & 0xffff;
			    Class241_Sub45 class241_sub45
				= class241_sub45s[i_589_];
			    Class241_Sub45 class241_sub45_592_
				= class241_sub45s[i_590_];
			    Class241_Sub45 class241_sub45_593_
				= class241_sub45s[i_591_];
			    Class241_Sub45 class241_sub45_594_ = null;
			    if (class241_sub45 != null) {
				class241_sub45.method16491(i_584_, i_585_,
							   i_587_);
				class241_sub45_594_ = class241_sub45;
			    }
			    if (class241_sub45_592_ != null) {
				class241_sub45_592_.method16491(i_584_, i_585_,
								i_587_);
				if (class241_sub45_594_ == null
				    || ((class241_sub45_592_.hashCode
					 * 4356572401218184725L)
					< (class241_sub45_594_.hashCode
					   * 4356572401218184725L)))
				    class241_sub45_594_ = class241_sub45_592_;
			    }
			    if (class241_sub45_593_ != null) {
				class241_sub45_593_.method16491(i_584_, i_585_,
								i_587_);
				if (class241_sub45_594_ == null
				    || ((class241_sub45_593_.hashCode
					 * 4356572401218184725L)
					< (class241_sub45_594_.hashCode
					   * 4356572401218184725L)))
				    class241_sub45_594_ = class241_sub45_593_;
			    }
			    if (class241_sub45_594_ != null) {
				if (class241_sub45 != null)
				    class241_sub45_594_.method16490(i_589_);
				if (class241_sub45_592_ != null)
				    class241_sub45_594_.method16490(i_590_);
				if (class241_sub45_593_ != null)
				    class241_sub45_594_.method16490(i_591_);
				class241_sub45_594_.method16491(i_584_, i_585_,
								i_587_);
			    }
			    i_587_++;
			}
		    }
		}
	    }
	    stream.method3787();
	    ((Class166_Sub2) this).anInterface8_9825
		= (((Class166_Sub2) this).aClass103_Sub1_9813.method15213
		   (i, nativeheapbuffer, stream.method3782(), false));
	    if (((Class166_Sub2) this).anInterface8_9825
		instanceof Class147_Sub1)
		nativeheapbuffer.method1686();
	    ((Class166_Sub2) this).aClass151_9826
		= new Class151(((Class166_Sub2) this).anInterface8_9825, 5126,
			       3, 0);
	    ((Class166_Sub2) this).aClass151_9809
		= new Class151(((Class166_Sub2) this).anInterface8_9825, 5121,
			       4, 12);
	    int i_595_;
	    if (((Class166_Sub2) this).anIntArrayArrayArray9820 != null) {
		((Class166_Sub2) this).aClass151_9830
		    = new Class151(((Class166_Sub2) this).anInterface8_9825,
				   5126, 3, 16);
		i_595_ = 28;
	    } else {
		((Class166_Sub2) this).aClass151_9830
		    = new Class151(((Class166_Sub2) this).anInterface8_9825,
				   5126, 2, 16);
		i_595_ = 24;
	    }
	    if ((((Class166_Sub2) this).anInt9810 & 0x7) != 0)
		((Class166_Sub2) this).aClass151_9828
		    = new Class151(((Class166_Sub2) this).anInterface8_9825,
				   5126, 3, i_595_);
	    long[] ls
		= new long[((Class166_Sub2) this).aClass241Array9824.length];
	    for (int i_596_ = 0;
		 i_596_ < ((Class166_Sub2) this).aClass241Array9824.length;
		 i_596_++) {
		Class241_Sub45 class241_sub45
		    = ((Class241_Sub45)
		       ((Class166_Sub2) this).aClass241Array9824[i_596_]);
		ls[i_596_] = class241_sub45.hashCode * 4356572401218184725L;
		class241_sub45.method16493(((Class166_Sub2) this).anInt9819);
	    }
	    Class570.method12515(ls, ((Class166_Sub2) this).aClass241Array9824,
				 1713537755);
	    if (((Class166_Sub2) this).aClass159_9822 != null)
		((Class166_Sub2) this).aClass159_9822.method3425();
	} else
	    ((Class166_Sub2) this).aClass159_9822 = null;
	if ((((Class166_Sub2) this).anInt9812 & 0x2) == 0) {
	    ((Class166_Sub2) this).anIntArrayArrayArray9818 = null;
	    ((Class166_Sub2) this).anIntArrayArrayArray9816 = null;
	    ((Class166_Sub2) this).anIntArrayArrayArray9815 = null;
	}
	((Class166_Sub2) this).anIntArrayArrayArray9820 = null;
	((Class166_Sub2) this).anIntArrayArrayArray9817 = null;
	((Class166_Sub2) this).anIntArrayArrayArray9804 = null;
	((Class166_Sub2) this).aClass241_Sub45ArrayArrayArray9814 = null;
	((Class166_Sub2) this).aByteArrayArray9832 = null;
	((Class166_Sub2) this).aClass407_9835 = null;
	((Class166_Sub2) this).aFloatArrayArray9806 = null;
	((Class166_Sub2) this).aFloatArrayArray9821 = null;
	((Class166_Sub2) this).aFloatArrayArray9833 = null;
    }
    
    public boolean method3545(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			      int i_597_, int i_598_, int i_599_,
			      boolean bool) {
	if (((Class166_Sub2) this).aClass159_9822 == null
	    || class241_sub39_sub17 == null)
	    return false;
	int i_600_
	    = (i - (i_597_ * ((Class103_Sub1) (((Class166_Sub2) this)
					       .aClass103_Sub1_9813)).anInt9181
		    >> 8)
	       >> (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		   .anInt9093));
	int i_601_
	    = (i_598_ - (i_597_ * (((Class103_Sub1)
				    ((Class166_Sub2) this).aClass103_Sub1_9813)
				   .anInt9169)
			 >> 8)
	       >> (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		   .anInt9093));
	return ((Class166_Sub2) this).aClass159_9822
		   .method3415(class241_sub39_sub17, i_600_, i_601_);
    }
    
    public boolean method3552(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			      int i_602_, int i_603_, int i_604_,
			      boolean bool) {
	if (((Class166_Sub2) this).aClass159_9822 == null
	    || class241_sub39_sub17 == null)
	    return false;
	int i_605_
	    = (i - (i_602_ * ((Class103_Sub1) (((Class166_Sub2) this)
					       .aClass103_Sub1_9813)).anInt9181
		    >> 8)
	       >> (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		   .anInt9093));
	int i_606_
	    = (i_603_ - (i_602_ * (((Class103_Sub1)
				    ((Class166_Sub2) this).aClass103_Sub1_9813)
				   .anInt9169)
			 >> 8)
	       >> (((Class103_Sub1) ((Class166_Sub2) this).aClass103_Sub1_9813)
		   .anInt9093));
	return ((Class166_Sub2) this).aClass159_9822
		   .method3415(class241_sub39_sub17, i_605_, i_606_);
    }
    
    public void method3561(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_607_, int i_608_, int i_609_, boolean bool) {
	if (((Class166_Sub2) this).aClass159_9822 != null
	    && class241_sub39_sub17 != null) {
	    int i_610_
		= (i - (i_607_ * (((Class103_Sub1)
				   ((Class166_Sub2) this).aClass103_Sub1_9813)
				  .anInt9181)
			>> 8)
		   >> ((Class103_Sub1)
		       ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9093);
	    int i_611_
		= (i_608_ - (i_607_ * (((Class103_Sub1) (((Class166_Sub2) this)
							 .aClass103_Sub1_9813))
				       .anInt9169)
			     >> 8)
		   >> ((Class103_Sub1)
		       ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9093);
	    ((Class166_Sub2) this).aClass159_9822
		.method3412(class241_sub39_sub17, i_610_, i_611_);
	}
    }
    
    public void method3549(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_612_, int i_613_, int i_614_, boolean bool) {
	if (((Class166_Sub2) this).aClass159_9822 != null
	    && class241_sub39_sub17 != null) {
	    int i_615_
		= (i - (i_612_ * (((Class103_Sub1)
				   ((Class166_Sub2) this).aClass103_Sub1_9813)
				  .anInt9181)
			>> 8)
		   >> ((Class103_Sub1)
		       ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9093);
	    int i_616_
		= (i_613_ - (i_612_ * (((Class103_Sub1) (((Class166_Sub2) this)
							 .aClass103_Sub1_9813))
				       .anInt9169)
			     >> 8)
		   >> ((Class103_Sub1)
		       ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9093);
	    ((Class166_Sub2) this).aClass159_9822
		.method3412(class241_sub39_sub17, i_615_, i_616_);
	}
    }
    
    public void method3569(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_617_, int i_618_, int i_619_, boolean bool) {
	if (((Class166_Sub2) this).aClass159_9822 != null
	    && class241_sub39_sub17 != null) {
	    int i_620_
		= (i - (i_617_ * (((Class103_Sub1)
				   ((Class166_Sub2) this).aClass103_Sub1_9813)
				  .anInt9181)
			>> 8)
		   >> ((Class103_Sub1)
		       ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9093);
	    int i_621_
		= (i_618_ - (i_617_ * (((Class103_Sub1) (((Class166_Sub2) this)
							 .aClass103_Sub1_9813))
				       .anInt9169)
			     >> 8)
		   >> ((Class103_Sub1)
		       ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9093);
	    ((Class166_Sub2) this).aClass159_9822
		.method3412(class241_sub39_sub17, i_620_, i_621_);
	}
    }
    
    public void method3581(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_622_, int i_623_, int i_624_, boolean bool) {
	if (((Class166_Sub2) this).aClass159_9822 != null
	    && class241_sub39_sub17 != null) {
	    int i_625_
		= (i - (i_622_ * (((Class103_Sub1)
				   ((Class166_Sub2) this).aClass103_Sub1_9813)
				  .anInt9181)
			>> 8)
		   >> ((Class103_Sub1)
		       ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9093);
	    int i_626_
		= (i_623_ - (i_622_ * (((Class103_Sub1) (((Class166_Sub2) this)
							 .aClass103_Sub1_9813))
				       .anInt9169)
			     >> 8)
		   >> ((Class103_Sub1)
		       ((Class166_Sub2) this).aClass103_Sub1_9813).anInt9093);
	    ((Class166_Sub2) this).aClass159_9822
		.method3412(class241_sub39_sub17, i_625_, i_626_);
	}
    }
    
    public void method3588(int i, int i_627_, int i_628_, boolean[][] bools,
			   boolean bool, int i_629_) {
	method16157(i, i_627_, i_628_, bools, bool, i_629_);
    }
}
