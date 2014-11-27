/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class51
{
    Class57 aClass57_676;
    int anInt677;
    int[] anIntArray678;
    boolean[][] aBoolArrayArray679;
    int[][] anIntArrayArray680;
    int[] anIntArray681;
    int[][] anIntArrayArray682;
    int[] anIntArray683;
    int[] anIntArray684;
    int[][] anIntArrayArray685;
    int[] anIntArray686;
    boolean[] aBoolArray687;
    static int[] anIntArray688 = { 256, 128, 86, 64 };
    static float[] aFloatArray689
	= { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F,
	    1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F,
	    1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F,
	    2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F,
	    2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F,
	    3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F,
	    4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F,
	    6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F,
	    7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F,
	    1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F,
	    1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F,
	    1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F,
	    2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F,
	    2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F,
	    3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F,
	    4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F,
	    5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F,
	    7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F,
	    1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F,
	    1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F,
	    1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F,
	    2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F,
	    2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F,
	    3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F,
	    4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F,
	    6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F,
	    7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F,
	    1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F,
	    1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F,
	    1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F,
	    2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F,
	    2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F,
	    3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F,
	    4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F,
	    5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F,
	    7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F,
	    9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F,
	    0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F,
	    0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F,
	    0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F,
	    0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F,
	    0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F,
	    0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F,
	    0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F,
	    0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F,
	    0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F,
	    0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F,
	    0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F,
	    0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F,
	    0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F,
	    0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F,
	    0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F,
	    0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F,
	    0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F,
	    0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F,
	    0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F,
	    0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F,
	    0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F,
	    0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F,
	    0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F,
	    0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };
    
    void method1253(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method1254(int i) {
	if (((Class51) this).aBoolArray687[i]) {
	    int i_0_ = ((Class51) this).anIntArray686.length;
	    int i_1_ = anIntArray688[((Class51) this).anInt677 - 1];
	    boolean[] bools = ((Class51) this).aBoolArrayArray679[i];
	    ((Class51) this).aBoolArrayArray679[i][1] = true;
	    bools[0] = true;
	    for (int i_2_ = 2; i_2_ < i_0_; i_2_++) {
		int i_3_ = method1255(((Class51) this).anIntArray686, i_2_);
		int i_4_ = method1268(((Class51) this).anIntArray686, i_2_);
		int i_5_
		    = method1256(((Class51) this).anIntArray686[i_3_],
				 ((Class51) this).anIntArrayArray685[i][i_3_],
				 ((Class51) this).anIntArray686[i_4_],
				 ((Class51) this).anIntArrayArray685[i][i_4_],
				 ((Class51) this).anIntArray686[i_2_]);
		int i_6_ = ((Class51) this).anIntArrayArray685[i][i_2_];
		int i_7_ = i_1_ - i_5_;
		int i_8_ = i_5_;
		int i_9_ = (i_7_ < i_8_ ? i_7_ : i_8_) << 1;
		if (i_6_ != 0) {
		    boolean[] bools_10_
			= ((Class51) this).aBoolArrayArray679[i];
		    int i_11_ = i_3_;
		    ((Class51) this).aBoolArrayArray679[i][i_4_] = true;
		    bools_10_[i_11_] = true;
		    ((Class51) this).aBoolArrayArray679[i][i_2_] = true;
		    if (i_6_ >= i_9_)
			((Class51) this).anIntArrayArray685[i][i_2_]
			    = (i_7_ > i_8_ ? i_6_ - i_8_ + i_5_
			       : i_5_ - i_6_ + i_7_ - 1);
		    else
			((Class51) this).anIntArrayArray685[i][i_2_]
			    = ((i_6_ & 0x1) != 0 ? i_5_ - (i_6_ + 1 >> 1)
			       : i_5_ + (i_6_ >> 1));
		} else {
		    ((Class51) this).aBoolArrayArray679[i][i_2_] = false;
		    ((Class51) this).anIntArrayArray685[i][i_2_] = i_5_;
		}
	    }
	    for (int i_12_ = 0; i_12_ < i_0_; i_12_++) {
		if (!((Class51) this).aBoolArrayArray679[i][i_12_])
		    ((Class51) this).anIntArrayArray685[i][i_12_] = -1;
	    }
	}
    }
    
    static int method1255(int[] is, int i) {
	int i_13_ = is[i];
	int i_14_ = -1;
	int i_15_ = -2147483648;
	for (int i_16_ = 0; i_16_ < i; i_16_++) {
	    int i_17_ = is[i_16_];
	    if (i_17_ < i_13_ && i_17_ > i_15_) {
		i_14_ = i_16_;
		i_15_ = i_17_;
	    }
	}
	return i_14_;
    }
    
    Class51() {
	/* empty */
    }
    
    int method1256(int i, int i_18_, int i_19_, int i_20_, int i_21_) {
	int i_22_ = i_20_ - i_18_;
	int i_23_ = i_19_ - i;
	int i_24_ = i_22_ < 0 ? -i_22_ : i_22_;
	int i_25_ = i_24_ * (i_21_ - i);
	int i_26_ = i_25_ / i_23_;
	return i_22_ < 0 ? i_18_ - i_26_ : i_18_ + i_26_;
    }
    
    void method1257(int i, int i_27_, int i_28_, int i_29_, Class60 class60,
		    int i_30_) {
	int i_31_ = i_29_ - i_27_;
	int i_32_ = i_28_ - i;
	int i_33_ = i_31_ < 0 ? -i_31_ : i_31_;
	int i_34_ = i_31_ / i_32_;
	int i_35_ = i_27_;
	int i_36_ = 0;
	int i_37_ = i_31_ < 0 ? i_34_ - 1 : i_34_ + 1;
	i_33_ = i_33_ - (i_34_ < 0 ? -i_34_ : i_34_) * i_32_;
	((Class60) class60).aFloatArray1018[i] *= aFloatArray689[i_35_];
	if (i_28_ > i_30_)
	    i_28_ = i_30_;
	for (int i_38_ = i + 1; i_38_ < i_28_; i_38_++) {
	    i_36_ += i_33_;
	    if (i_36_ >= i_32_) {
		i_36_ -= i_32_;
		i_35_ += i_37_;
	    } else
		i_35_ += i_34_;
	    ((Class60) class60).aFloatArray1018[i_38_]
		*= aFloatArray689[i_35_];
	}
    }
    
    void method1258(Class57 class57, int i) {
	((Class51) this).aClass57_676 = class57;
	int i_39_ = ((Class51) this).aClass57_676.method1441(16);
	if (i_39_ != 1)
	    throw new RuntimeException();
	if (((Class51) this).aBoolArray687 == null
	    || ((Class51) this).aBoolArray687.length != i)
	    ((Class51) this).aBoolArray687 = new boolean[i];
	else {
	    for (int i_40_ = 0; i_40_ < ((Class51) this).aBoolArray687.length;
		 i_40_++)
		((Class51) this).aBoolArray687[i_40_] = false;
	}
	int i_41_ = ((Class51) this).aClass57_676.method1441(5);
	int i_42_ = 0;
	if (((Class51) this).anIntArray678 == null
	    || ((Class51) this).anIntArray678.length != i_41_)
	    ((Class51) this).anIntArray678 = new int[i_41_];
	else
	    method1253(((Class51) this).anIntArray678);
	for (int i_43_ = 0; i_43_ < i_41_; i_43_++) {
	    int i_44_ = ((Class51) this).aClass57_676.method1441(4);
	    ((Class51) this).anIntArray678[i_43_] = i_44_;
	    if (i_44_ >= i_42_)
		i_42_ = i_44_ + 1;
	}
	if (((Class51) this).anIntArray683 == null
	    || ((Class51) this).anIntArray683.length != i_42_)
	    ((Class51) this).anIntArray683 = new int[i_42_];
	else
	    method1253(((Class51) this).anIntArray683);
	if (((Class51) this).anIntArray684 == null
	    || ((Class51) this).anIntArray684.length != i_42_)
	    ((Class51) this).anIntArray684 = new int[i_42_];
	else
	    method1253(((Class51) this).anIntArray684);
	if (((Class51) this).anIntArray681 == null
	    || ((Class51) this).anIntArray681.length != i_42_)
	    ((Class51) this).anIntArray681 = new int[i_42_];
	else
	    method1253(((Class51) this).anIntArray681);
	if (((Class51) this).anIntArrayArray682 == null
	    || ((Class51) this).anIntArrayArray682.length != i_42_)
	    ((Class51) this).anIntArrayArray682 = new int[i_42_][];
	for (int i_45_ = 0; i_45_ < i_42_; i_45_++) {
	    ((Class51) this).anIntArray683[i_45_]
		= ((Class51) this).aClass57_676.method1441(3) + 1;
	    int i_46_ = (((Class51) this).anIntArray684[i_45_]
			 = ((Class51) this).aClass57_676.method1441(2));
	    if (i_46_ != 0)
		((Class51) this).anIntArray681[i_45_]
		    = ((Class51) this).aClass57_676.method1441(8);
	    i_46_ = 1 << i_46_;
	    int[] is = new int[i_46_];
	    ((Class51) this).anIntArrayArray682[i_45_] = is;
	    for (int i_47_ = 0; i_47_ < i_46_; i_47_++)
		is[i_47_] = ((Class51) this).aClass57_676.method1441(8) - 1;
	}
	((Class51) this).anInt677
	    = ((Class51) this).aClass57_676.method1441(2) + 1;
	int i_48_ = ((Class51) this).aClass57_676.method1441(4);
	int i_49_ = 2;
	for (int i_50_ = 0; i_50_ < i_41_; i_50_++)
	    i_49_ += (((Class51) this).anIntArray683
		      [((Class51) this).anIntArray678[i_50_]]);
	if (((Class51) this).anIntArray686 == null
	    || ((Class51) this).anIntArray686.length != i_49_)
	    ((Class51) this).anIntArray686 = new int[i_49_];
	else
	    method1253(((Class51) this).anIntArray686);
	((Class51) this).anIntArray686[0] = 0;
	((Class51) this).anIntArray686[1] = 1 << i_48_;
	i_49_ = 2;
	for (int i_51_ = 0; i_51_ < i_41_; i_51_++) {
	    int i_52_ = ((Class51) this).anIntArray678[i_51_];
	    for (int i_53_ = 0; i_53_ < ((Class51) this).anIntArray683[i_52_];
		 i_53_++)
		((Class51) this).anIntArray686[i_49_++]
		    = ((Class51) this).aClass57_676.method1441(i_48_);
	}
	if (((Class51) this).anIntArrayArray680 == null
	    || ((Class51) this).anIntArrayArray680.length < i_49_) {
	    ((Class51) this).anIntArrayArray680 = new int[i][i_49_];
	    ((Class51) this).anIntArrayArray685 = new int[i][i_49_];
	    ((Class51) this).aBoolArrayArray679 = new boolean[i][i_49_];
	}
    }
    
    void method1259(int i, int i_54_, int i_55_) {
	if (i < i_54_) {
	    int i_56_ = i;
	    int i_57_ = ((Class51) this).anIntArrayArray680[i_55_][i_56_];
	    int i_58_ = ((Class51) this).anIntArrayArray685[i_55_][i_56_];
	    boolean bool = ((Class51) this).aBoolArrayArray679[i_55_][i_56_];
	    for (int i_59_ = i + 1; i_59_ <= i_54_; i_59_++) {
		int i_60_ = ((Class51) this).anIntArrayArray680[i_55_][i_59_];
		if (i_60_ < i_57_) {
		    ((Class51) this).anIntArrayArray680[i_55_][i_56_] = i_60_;
		    ((Class51) this).anIntArrayArray685[i_55_][i_56_]
			= ((Class51) this).anIntArrayArray685[i_55_][i_59_];
		    ((Class51) this).aBoolArrayArray679[i_55_][i_56_]
			= ((Class51) this).aBoolArrayArray679[i_55_][i_59_];
		    i_56_++;
		    ((Class51) this).anIntArrayArray680[i_55_][i_59_]
			= ((Class51) this).anIntArrayArray680[i_55_][i_56_];
		    ((Class51) this).anIntArrayArray685[i_55_][i_59_]
			= ((Class51) this).anIntArrayArray685[i_55_][i_56_];
		    ((Class51) this).aBoolArrayArray679[i_55_][i_59_]
			= ((Class51) this).aBoolArrayArray679[i_55_][i_56_];
		}
	    }
	    ((Class51) this).anIntArrayArray680[i_55_][i_56_] = i_57_;
	    ((Class51) this).anIntArrayArray685[i_55_][i_56_] = i_58_;
	    ((Class51) this).aBoolArrayArray679[i_55_][i_56_] = bool;
	    method1259(i, i_56_ - 1, i_55_);
	    method1259(i_56_ + 1, i_54_, i_55_);
	}
    }
    
    boolean method1260(int i) {
	boolean bool = ((Class51) this).aClass57_676.method1411() != 0;
	((Class51) this).aBoolArray687[i] = bool;
	if (!bool)
	    return false;
	int i_61_ = ((Class51) this).anIntArray686.length;
	for (int i_62_ = 0; i_62_ < i_61_; i_62_++)
	    ((Class51) this).anIntArrayArray680[i][i_62_]
		= ((Class51) this).anIntArray686[i_62_];
	int i_63_ = anIntArray688[((Class51) this).anInt677 - 1];
	int i_64_ = Class436.method7795(i_63_ - 1, (byte) -88);
	((Class51) this).anIntArrayArray685[i][0]
	    = ((Class51) this).aClass57_676.method1441(i_64_);
	((Class51) this).anIntArrayArray685[i][1]
	    = ((Class51) this).aClass57_676.method1441(i_64_);
	int i_65_ = 2;
	for (int i_66_ = 0; i_66_ < ((Class51) this).anIntArray678.length;
	     i_66_++) {
	    int i_67_ = ((Class51) this).anIntArray678[i_66_];
	    int i_68_ = ((Class51) this).anIntArray683[i_67_];
	    int i_69_ = ((Class51) this).anIntArray684[i_67_];
	    int i_70_ = (1 << i_69_) - 1;
	    int i_71_ = 0;
	    if (i_69_ > 0)
		i_71_ = ((Class57) ((Class51) this).aClass57_676)
			    .aClass34Array755
			    [((Class51) this).anIntArray681[i_67_]]
			    .method984(((Class51) this).aClass57_676);
	    for (int i_72_ = 0; i_72_ < i_68_; i_72_++) {
		int i_73_ = (((Class51) this).anIntArrayArray682[i_67_]
			     [i_71_ & i_70_]);
		i_71_ >>>= i_69_;
		((Class51) this).anIntArrayArray685[i][i_65_]
		    = (i_73_ >= 0
		       ? ((Class57) ((Class51) this).aClass57_676)
			     .aClass34Array755[i_73_]
			     .method984(((Class51) this).aClass57_676)
		       : 0);
		i_65_++;
	    }
	}
	return true;
    }
    
    void method1261(int i) {
	if (((Class51) this).aBoolArray687[i]) {
	    int i_74_ = ((Class51) this).anIntArray686.length;
	    int i_75_ = anIntArray688[((Class51) this).anInt677 - 1];
	    boolean[] bools = ((Class51) this).aBoolArrayArray679[i];
	    ((Class51) this).aBoolArrayArray679[i][1] = true;
	    bools[0] = true;
	    for (int i_76_ = 2; i_76_ < i_74_; i_76_++) {
		int i_77_ = method1255(((Class51) this).anIntArray686, i_76_);
		int i_78_ = method1268(((Class51) this).anIntArray686, i_76_);
		int i_79_
		    = method1256(((Class51) this).anIntArray686[i_77_],
				 ((Class51) this).anIntArrayArray685[i][i_77_],
				 ((Class51) this).anIntArray686[i_78_],
				 ((Class51) this).anIntArrayArray685[i][i_78_],
				 ((Class51) this).anIntArray686[i_76_]);
		int i_80_ = ((Class51) this).anIntArrayArray685[i][i_76_];
		int i_81_ = i_75_ - i_79_;
		int i_82_ = i_79_;
		int i_83_ = (i_81_ < i_82_ ? i_81_ : i_82_) << 1;
		if (i_80_ != 0) {
		    boolean[] bools_84_
			= ((Class51) this).aBoolArrayArray679[i];
		    int i_85_ = i_77_;
		    ((Class51) this).aBoolArrayArray679[i][i_78_] = true;
		    bools_84_[i_85_] = true;
		    ((Class51) this).aBoolArrayArray679[i][i_76_] = true;
		    if (i_80_ >= i_83_)
			((Class51) this).anIntArrayArray685[i][i_76_]
			    = (i_81_ > i_82_ ? i_80_ - i_82_ + i_79_
			       : i_79_ - i_80_ + i_81_ - 1);
		    else
			((Class51) this).anIntArrayArray685[i][i_76_]
			    = ((i_80_ & 0x1) != 0 ? i_79_ - (i_80_ + 1 >> 1)
			       : i_79_ + (i_80_ >> 1));
		} else {
		    ((Class51) this).aBoolArrayArray679[i][i_76_] = false;
		    ((Class51) this).anIntArrayArray685[i][i_76_] = i_79_;
		}
	    }
	    for (int i_86_ = 0; i_86_ < i_74_; i_86_++) {
		if (!((Class51) this).aBoolArrayArray679[i][i_86_])
		    ((Class51) this).anIntArrayArray685[i][i_86_] = -1;
	    }
	}
    }
    
    void method1262(Class60 class60, int i, int i_87_) {
	if (((Class51) this).aBoolArray687[i_87_]) {
	    int i_88_ = ((Class51) this).anIntArray686.length;
	    method1259(0, i_88_ - 1, i_87_);
	    int i_89_ = 0;
	    int i_90_ = (((Class51) this).anIntArrayArray685[i_87_][0]
			 * ((Class51) this).anInt677);
	    for (int i_91_ = 1; i_91_ < i_88_; i_91_++) {
		if (((Class51) this).anIntArrayArray685[i_87_][i_91_] >= 0) {
		    int i_92_
			= ((Class51) this).anIntArrayArray680[i_87_][i_91_];
		    int i_93_
			= (((Class51) this).anIntArrayArray685[i_87_][i_91_]
			   * ((Class51) this).anInt677);
		    method1257(i_89_, i_90_, i_92_, i_93_, class60, i);
		    if (i_92_ < i) {
			/* empty */
		    }
		    i_89_ = i_92_;
		    i_90_ = i_93_;
		}
	    }
	    float f = aFloatArray689[i_90_];
	    for (int i_94_ = i_89_; i_94_ < i; i_94_++)
		((Class60) class60).aFloatArray1018[i_94_] *= f;
	}
    }
    
    void method1263(int i, int i_95_, int i_96_, int i_97_, Class60 class60,
		    int i_98_) {
	int i_99_ = i_97_ - i_95_;
	int i_100_ = i_96_ - i;
	int i_101_ = i_99_ < 0 ? -i_99_ : i_99_;
	int i_102_ = i_99_ / i_100_;
	int i_103_ = i_95_;
	int i_104_ = 0;
	int i_105_ = i_99_ < 0 ? i_102_ - 1 : i_102_ + 1;
	i_101_ = i_101_ - (i_102_ < 0 ? -i_102_ : i_102_) * i_100_;
	((Class60) class60).aFloatArray1018[i] *= aFloatArray689[i_103_];
	if (i_96_ > i_98_)
	    i_96_ = i_98_;
	for (int i_106_ = i + 1; i_106_ < i_96_; i_106_++) {
	    i_104_ += i_101_;
	    if (i_104_ >= i_100_) {
		i_104_ -= i_100_;
		i_103_ += i_105_;
	    } else
		i_103_ += i_102_;
	    ((Class60) class60).aFloatArray1018[i_106_]
		*= aFloatArray689[i_103_];
	}
    }
    
    static int method1264(int[] is, int i) {
	int i_107_ = is[i];
	int i_108_ = -1;
	int i_109_ = -2147483648;
	for (int i_110_ = 0; i_110_ < i; i_110_++) {
	    int i_111_ = is[i_110_];
	    if (i_111_ < i_107_ && i_111_ > i_109_) {
		i_108_ = i_110_;
		i_109_ = i_111_;
	    }
	}
	return i_108_;
    }
    
    static int method1265(int[] is, int i) {
	int i_112_ = is[i];
	int i_113_ = -1;
	int i_114_ = -2147483648;
	for (int i_115_ = 0; i_115_ < i; i_115_++) {
	    int i_116_ = is[i_115_];
	    if (i_116_ < i_112_ && i_116_ > i_114_) {
		i_113_ = i_115_;
		i_114_ = i_116_;
	    }
	}
	return i_113_;
    }
    
    static int method1266(int[] is, int i) {
	int i_117_ = is[i];
	int i_118_ = -1;
	int i_119_ = 2147483647;
	for (int i_120_ = 0; i_120_ < i; i_120_++) {
	    int i_121_ = is[i_120_];
	    if (i_121_ > i_117_ && i_121_ < i_119_) {
		i_118_ = i_120_;
		i_119_ = i_121_;
	    }
	}
	return i_118_;
    }
    
    void method1267(Class57 class57, int i) {
	((Class51) this).aClass57_676 = class57;
	int i_122_ = ((Class51) this).aClass57_676.method1441(16);
	if (i_122_ != 1)
	    throw new RuntimeException();
	if (((Class51) this).aBoolArray687 == null
	    || ((Class51) this).aBoolArray687.length != i)
	    ((Class51) this).aBoolArray687 = new boolean[i];
	else {
	    for (int i_123_ = 0;
		 i_123_ < ((Class51) this).aBoolArray687.length; i_123_++)
		((Class51) this).aBoolArray687[i_123_] = false;
	}
	int i_124_ = ((Class51) this).aClass57_676.method1441(5);
	int i_125_ = 0;
	if (((Class51) this).anIntArray678 == null
	    || ((Class51) this).anIntArray678.length != i_124_)
	    ((Class51) this).anIntArray678 = new int[i_124_];
	else
	    method1253(((Class51) this).anIntArray678);
	for (int i_126_ = 0; i_126_ < i_124_; i_126_++) {
	    int i_127_ = ((Class51) this).aClass57_676.method1441(4);
	    ((Class51) this).anIntArray678[i_126_] = i_127_;
	    if (i_127_ >= i_125_)
		i_125_ = i_127_ + 1;
	}
	if (((Class51) this).anIntArray683 == null
	    || ((Class51) this).anIntArray683.length != i_125_)
	    ((Class51) this).anIntArray683 = new int[i_125_];
	else
	    method1253(((Class51) this).anIntArray683);
	if (((Class51) this).anIntArray684 == null
	    || ((Class51) this).anIntArray684.length != i_125_)
	    ((Class51) this).anIntArray684 = new int[i_125_];
	else
	    method1253(((Class51) this).anIntArray684);
	if (((Class51) this).anIntArray681 == null
	    || ((Class51) this).anIntArray681.length != i_125_)
	    ((Class51) this).anIntArray681 = new int[i_125_];
	else
	    method1253(((Class51) this).anIntArray681);
	if (((Class51) this).anIntArrayArray682 == null
	    || ((Class51) this).anIntArrayArray682.length != i_125_)
	    ((Class51) this).anIntArrayArray682 = new int[i_125_][];
	for (int i_128_ = 0; i_128_ < i_125_; i_128_++) {
	    ((Class51) this).anIntArray683[i_128_]
		= ((Class51) this).aClass57_676.method1441(3) + 1;
	    int i_129_ = (((Class51) this).anIntArray684[i_128_]
			  = ((Class51) this).aClass57_676.method1441(2));
	    if (i_129_ != 0)
		((Class51) this).anIntArray681[i_128_]
		    = ((Class51) this).aClass57_676.method1441(8);
	    i_129_ = 1 << i_129_;
	    int[] is = new int[i_129_];
	    ((Class51) this).anIntArrayArray682[i_128_] = is;
	    for (int i_130_ = 0; i_130_ < i_129_; i_130_++)
		is[i_130_] = ((Class51) this).aClass57_676.method1441(8) - 1;
	}
	((Class51) this).anInt677
	    = ((Class51) this).aClass57_676.method1441(2) + 1;
	int i_131_ = ((Class51) this).aClass57_676.method1441(4);
	int i_132_ = 2;
	for (int i_133_ = 0; i_133_ < i_124_; i_133_++)
	    i_132_ += (((Class51) this).anIntArray683
		       [((Class51) this).anIntArray678[i_133_]]);
	if (((Class51) this).anIntArray686 == null
	    || ((Class51) this).anIntArray686.length != i_132_)
	    ((Class51) this).anIntArray686 = new int[i_132_];
	else
	    method1253(((Class51) this).anIntArray686);
	((Class51) this).anIntArray686[0] = 0;
	((Class51) this).anIntArray686[1] = 1 << i_131_;
	i_132_ = 2;
	for (int i_134_ = 0; i_134_ < i_124_; i_134_++) {
	    int i_135_ = ((Class51) this).anIntArray678[i_134_];
	    for (int i_136_ = 0;
		 i_136_ < ((Class51) this).anIntArray683[i_135_]; i_136_++)
		((Class51) this).anIntArray686[i_132_++]
		    = ((Class51) this).aClass57_676.method1441(i_131_);
	}
	if (((Class51) this).anIntArrayArray680 == null
	    || ((Class51) this).anIntArrayArray680.length < i_132_) {
	    ((Class51) this).anIntArrayArray680 = new int[i][i_132_];
	    ((Class51) this).anIntArrayArray685 = new int[i][i_132_];
	    ((Class51) this).aBoolArrayArray679 = new boolean[i][i_132_];
	}
    }
    
    static int method1268(int[] is, int i) {
	int i_137_ = is[i];
	int i_138_ = -1;
	int i_139_ = 2147483647;
	for (int i_140_ = 0; i_140_ < i; i_140_++) {
	    int i_141_ = is[i_140_];
	    if (i_141_ > i_137_ && i_141_ < i_139_) {
		i_138_ = i_140_;
		i_139_ = i_141_;
	    }
	}
	return i_138_;
    }
    
    void method1269(int i, int i_142_, int i_143_, int i_144_, Class60 class60,
		    int i_145_) {
	int i_146_ = i_144_ - i_142_;
	int i_147_ = i_143_ - i;
	int i_148_ = i_146_ < 0 ? -i_146_ : i_146_;
	int i_149_ = i_146_ / i_147_;
	int i_150_ = i_142_;
	int i_151_ = 0;
	int i_152_ = i_146_ < 0 ? i_149_ - 1 : i_149_ + 1;
	i_148_ = i_148_ - (i_149_ < 0 ? -i_149_ : i_149_) * i_147_;
	((Class60) class60).aFloatArray1018[i] *= aFloatArray689[i_150_];
	if (i_143_ > i_145_)
	    i_143_ = i_145_;
	for (int i_153_ = i + 1; i_153_ < i_143_; i_153_++) {
	    i_151_ += i_148_;
	    if (i_151_ >= i_147_) {
		i_151_ -= i_147_;
		i_150_ += i_152_;
	    } else
		i_150_ += i_149_;
	    ((Class60) class60).aFloatArray1018[i_153_]
		*= aFloatArray689[i_150_];
	}
    }
    
    void method1270(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method1271(int i, int i_154_, int i_155_) {
	if (i < i_154_) {
	    int i_156_ = i;
	    int i_157_ = ((Class51) this).anIntArrayArray680[i_155_][i_156_];
	    int i_158_ = ((Class51) this).anIntArrayArray685[i_155_][i_156_];
	    boolean bool = ((Class51) this).aBoolArrayArray679[i_155_][i_156_];
	    for (int i_159_ = i + 1; i_159_ <= i_154_; i_159_++) {
		int i_160_
		    = ((Class51) this).anIntArrayArray680[i_155_][i_159_];
		if (i_160_ < i_157_) {
		    ((Class51) this).anIntArrayArray680[i_155_][i_156_]
			= i_160_;
		    ((Class51) this).anIntArrayArray685[i_155_][i_156_]
			= ((Class51) this).anIntArrayArray685[i_155_][i_159_];
		    ((Class51) this).aBoolArrayArray679[i_155_][i_156_]
			= ((Class51) this).aBoolArrayArray679[i_155_][i_159_];
		    i_156_++;
		    ((Class51) this).anIntArrayArray680[i_155_][i_159_]
			= ((Class51) this).anIntArrayArray680[i_155_][i_156_];
		    ((Class51) this).anIntArrayArray685[i_155_][i_159_]
			= ((Class51) this).anIntArrayArray685[i_155_][i_156_];
		    ((Class51) this).aBoolArrayArray679[i_155_][i_159_]
			= ((Class51) this).aBoolArrayArray679[i_155_][i_156_];
		}
	    }
	    ((Class51) this).anIntArrayArray680[i_155_][i_156_] = i_157_;
	    ((Class51) this).anIntArrayArray685[i_155_][i_156_] = i_158_;
	    ((Class51) this).aBoolArrayArray679[i_155_][i_156_] = bool;
	    method1259(i, i_156_ - 1, i_155_);
	    method1259(i_156_ + 1, i_154_, i_155_);
	}
    }
    
    void method1272(int i, int i_161_, int i_162_) {
	if (i < i_161_) {
	    int i_163_ = i;
	    int i_164_ = ((Class51) this).anIntArrayArray680[i_162_][i_163_];
	    int i_165_ = ((Class51) this).anIntArrayArray685[i_162_][i_163_];
	    boolean bool = ((Class51) this).aBoolArrayArray679[i_162_][i_163_];
	    for (int i_166_ = i + 1; i_166_ <= i_161_; i_166_++) {
		int i_167_
		    = ((Class51) this).anIntArrayArray680[i_162_][i_166_];
		if (i_167_ < i_164_) {
		    ((Class51) this).anIntArrayArray680[i_162_][i_163_]
			= i_167_;
		    ((Class51) this).anIntArrayArray685[i_162_][i_163_]
			= ((Class51) this).anIntArrayArray685[i_162_][i_166_];
		    ((Class51) this).aBoolArrayArray679[i_162_][i_163_]
			= ((Class51) this).aBoolArrayArray679[i_162_][i_166_];
		    i_163_++;
		    ((Class51) this).anIntArrayArray680[i_162_][i_166_]
			= ((Class51) this).anIntArrayArray680[i_162_][i_163_];
		    ((Class51) this).anIntArrayArray685[i_162_][i_166_]
			= ((Class51) this).anIntArrayArray685[i_162_][i_163_];
		    ((Class51) this).aBoolArrayArray679[i_162_][i_166_]
			= ((Class51) this).aBoolArrayArray679[i_162_][i_163_];
		}
	    }
	    ((Class51) this).anIntArrayArray680[i_162_][i_163_] = i_164_;
	    ((Class51) this).anIntArrayArray685[i_162_][i_163_] = i_165_;
	    ((Class51) this).aBoolArrayArray679[i_162_][i_163_] = bool;
	    method1259(i, i_163_ - 1, i_162_);
	    method1259(i_163_ + 1, i_161_, i_162_);
	}
    }
    
    void method1273(Class60 class60, int i, int i_168_) {
	if (((Class51) this).aBoolArray687[i_168_]) {
	    int i_169_ = ((Class51) this).anIntArray686.length;
	    method1259(0, i_169_ - 1, i_168_);
	    int i_170_ = 0;
	    int i_171_ = (((Class51) this).anIntArrayArray685[i_168_][0]
			  * ((Class51) this).anInt677);
	    for (int i_172_ = 1; i_172_ < i_169_; i_172_++) {
		if (((Class51) this).anIntArrayArray685[i_168_][i_172_] >= 0) {
		    int i_173_
			= ((Class51) this).anIntArrayArray680[i_168_][i_172_];
		    int i_174_
			= (((Class51) this).anIntArrayArray685[i_168_][i_172_]
			   * ((Class51) this).anInt677);
		    method1257(i_170_, i_171_, i_173_, i_174_, class60, i);
		    if (i_173_ < i) {
			/* empty */
		    }
		    i_170_ = i_173_;
		    i_171_ = i_174_;
		}
	    }
	    float f = aFloatArray689[i_171_];
	    for (int i_175_ = i_170_; i_175_ < i; i_175_++)
		((Class60) class60).aFloatArray1018[i_175_] *= f;
	}
    }
    
    void method1274(int i, int i_176_, int i_177_) {
	if (i < i_176_) {
	    int i_178_ = i;
	    int i_179_ = ((Class51) this).anIntArrayArray680[i_177_][i_178_];
	    int i_180_ = ((Class51) this).anIntArrayArray685[i_177_][i_178_];
	    boolean bool = ((Class51) this).aBoolArrayArray679[i_177_][i_178_];
	    for (int i_181_ = i + 1; i_181_ <= i_176_; i_181_++) {
		int i_182_
		    = ((Class51) this).anIntArrayArray680[i_177_][i_181_];
		if (i_182_ < i_179_) {
		    ((Class51) this).anIntArrayArray680[i_177_][i_178_]
			= i_182_;
		    ((Class51) this).anIntArrayArray685[i_177_][i_178_]
			= ((Class51) this).anIntArrayArray685[i_177_][i_181_];
		    ((Class51) this).aBoolArrayArray679[i_177_][i_178_]
			= ((Class51) this).aBoolArrayArray679[i_177_][i_181_];
		    i_178_++;
		    ((Class51) this).anIntArrayArray680[i_177_][i_181_]
			= ((Class51) this).anIntArrayArray680[i_177_][i_178_];
		    ((Class51) this).anIntArrayArray685[i_177_][i_181_]
			= ((Class51) this).anIntArrayArray685[i_177_][i_178_];
		    ((Class51) this).aBoolArrayArray679[i_177_][i_181_]
			= ((Class51) this).aBoolArrayArray679[i_177_][i_178_];
		}
	    }
	    ((Class51) this).anIntArrayArray680[i_177_][i_178_] = i_179_;
	    ((Class51) this).anIntArrayArray685[i_177_][i_178_] = i_180_;
	    ((Class51) this).aBoolArrayArray679[i_177_][i_178_] = bool;
	    method1259(i, i_178_ - 1, i_177_);
	    method1259(i_178_ + 1, i_176_, i_177_);
	}
    }
    
    void method1275(int i) {
	if (((Class51) this).aBoolArray687[i]) {
	    int i_183_ = ((Class51) this).anIntArray686.length;
	    int i_184_ = anIntArray688[((Class51) this).anInt677 - 1];
	    boolean[] bools = ((Class51) this).aBoolArrayArray679[i];
	    ((Class51) this).aBoolArrayArray679[i][1] = true;
	    bools[0] = true;
	    for (int i_185_ = 2; i_185_ < i_183_; i_185_++) {
		int i_186_
		    = method1255(((Class51) this).anIntArray686, i_185_);
		int i_187_
		    = method1268(((Class51) this).anIntArray686, i_185_);
		int i_188_
		    = method1256(((Class51) this).anIntArray686[i_186_],
				 (((Class51) this).anIntArrayArray685[i]
				  [i_186_]),
				 ((Class51) this).anIntArray686[i_187_],
				 (((Class51) this).anIntArrayArray685[i]
				  [i_187_]),
				 ((Class51) this).anIntArray686[i_185_]);
		int i_189_ = ((Class51) this).anIntArrayArray685[i][i_185_];
		int i_190_ = i_184_ - i_188_;
		int i_191_ = i_188_;
		int i_192_ = (i_190_ < i_191_ ? i_190_ : i_191_) << 1;
		if (i_189_ != 0) {
		    boolean[] bools_193_
			= ((Class51) this).aBoolArrayArray679[i];
		    int i_194_ = i_186_;
		    ((Class51) this).aBoolArrayArray679[i][i_187_] = true;
		    bools_193_[i_194_] = true;
		    ((Class51) this).aBoolArrayArray679[i][i_185_] = true;
		    if (i_189_ >= i_192_)
			((Class51) this).anIntArrayArray685[i][i_185_]
			    = (i_190_ > i_191_ ? i_189_ - i_191_ + i_188_
			       : i_188_ - i_189_ + i_190_ - 1);
		    else
			((Class51) this).anIntArrayArray685[i][i_185_]
			    = ((i_189_ & 0x1) != 0 ? i_188_ - (i_189_ + 1 >> 1)
			       : i_188_ + (i_189_ >> 1));
		} else {
		    ((Class51) this).aBoolArrayArray679[i][i_185_] = false;
		    ((Class51) this).anIntArrayArray685[i][i_185_] = i_188_;
		}
	    }
	    for (int i_195_ = 0; i_195_ < i_183_; i_195_++) {
		if (!((Class51) this).aBoolArrayArray679[i][i_195_])
		    ((Class51) this).anIntArrayArray685[i][i_195_] = -1;
	    }
	}
    }
    
    void method1276(int i) {
	if (((Class51) this).aBoolArray687[i]) {
	    int i_196_ = ((Class51) this).anIntArray686.length;
	    int i_197_ = anIntArray688[((Class51) this).anInt677 - 1];
	    boolean[] bools = ((Class51) this).aBoolArrayArray679[i];
	    ((Class51) this).aBoolArrayArray679[i][1] = true;
	    bools[0] = true;
	    for (int i_198_ = 2; i_198_ < i_196_; i_198_++) {
		int i_199_
		    = method1255(((Class51) this).anIntArray686, i_198_);
		int i_200_
		    = method1268(((Class51) this).anIntArray686, i_198_);
		int i_201_
		    = method1256(((Class51) this).anIntArray686[i_199_],
				 (((Class51) this).anIntArrayArray685[i]
				  [i_199_]),
				 ((Class51) this).anIntArray686[i_200_],
				 (((Class51) this).anIntArrayArray685[i]
				  [i_200_]),
				 ((Class51) this).anIntArray686[i_198_]);
		int i_202_ = ((Class51) this).anIntArrayArray685[i][i_198_];
		int i_203_ = i_197_ - i_201_;
		int i_204_ = i_201_;
		int i_205_ = (i_203_ < i_204_ ? i_203_ : i_204_) << 1;
		if (i_202_ != 0) {
		    boolean[] bools_206_
			= ((Class51) this).aBoolArrayArray679[i];
		    int i_207_ = i_199_;
		    ((Class51) this).aBoolArrayArray679[i][i_200_] = true;
		    bools_206_[i_207_] = true;
		    ((Class51) this).aBoolArrayArray679[i][i_198_] = true;
		    if (i_202_ >= i_205_)
			((Class51) this).anIntArrayArray685[i][i_198_]
			    = (i_203_ > i_204_ ? i_202_ - i_204_ + i_201_
			       : i_201_ - i_202_ + i_203_ - 1);
		    else
			((Class51) this).anIntArrayArray685[i][i_198_]
			    = ((i_202_ & 0x1) != 0 ? i_201_ - (i_202_ + 1 >> 1)
			       : i_201_ + (i_202_ >> 1));
		} else {
		    ((Class51) this).aBoolArrayArray679[i][i_198_] = false;
		    ((Class51) this).anIntArrayArray685[i][i_198_] = i_201_;
		}
	    }
	    for (int i_208_ = 0; i_208_ < i_196_; i_208_++) {
		if (!((Class51) this).aBoolArrayArray679[i][i_208_])
		    ((Class51) this).anIntArrayArray685[i][i_208_] = -1;
	    }
	}
    }
    
    int method1277(int i, int i_209_, int i_210_, int i_211_, int i_212_) {
	int i_213_ = i_211_ - i_209_;
	int i_214_ = i_210_ - i;
	int i_215_ = i_213_ < 0 ? -i_213_ : i_213_;
	int i_216_ = i_215_ * (i_212_ - i);
	int i_217_ = i_216_ / i_214_;
	return i_213_ < 0 ? i_209_ - i_217_ : i_209_ + i_217_;
    }
    
    void method1278(Class60 class60, int i, int i_218_) {
	if (((Class51) this).aBoolArray687[i_218_]) {
	    int i_219_ = ((Class51) this).anIntArray686.length;
	    method1259(0, i_219_ - 1, i_218_);
	    int i_220_ = 0;
	    int i_221_ = (((Class51) this).anIntArrayArray685[i_218_][0]
			  * ((Class51) this).anInt677);
	    for (int i_222_ = 1; i_222_ < i_219_; i_222_++) {
		if (((Class51) this).anIntArrayArray685[i_218_][i_222_] >= 0) {
		    int i_223_
			= ((Class51) this).anIntArrayArray680[i_218_][i_222_];
		    int i_224_
			= (((Class51) this).anIntArrayArray685[i_218_][i_222_]
			   * ((Class51) this).anInt677);
		    method1257(i_220_, i_221_, i_223_, i_224_, class60, i);
		    if (i_223_ < i) {
			/* empty */
		    }
		    i_220_ = i_223_;
		    i_221_ = i_224_;
		}
	    }
	    float f = aFloatArray689[i_221_];
	    for (int i_225_ = i_220_; i_225_ < i; i_225_++)
		((Class60) class60).aFloatArray1018[i_225_] *= f;
	}
    }
}
