/* Class166_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Iterator;

import sun.misc.Unsafe;

@SuppressWarnings("restriction")
public class Class166_Sub1 extends Class166
{
    int[][][] anIntArrayArrayArray9757;
    long aLong9758;
    static final int anInt9759 = 74;
    int anInt9760;
    int anInt9761;
    int anInt9762;
    float aFloat9763;
    int anInt9764;
    Interface40 anInterface40_9765;
    HashTable aClass407_9766;
    Class103_Sub3 aClass103_Sub3_9767;
    int[] anIntArray9768;
    Class241_Sub17[][][] aClass241_Sub17ArrayArrayArray9769;
    static final int anInt9770 = 1;
    int[][][] anIntArrayArrayArray9771;
    int[][][] anIntArrayArrayArray9772;
    int anInt9773;
    int[][][] anIntArrayArrayArray9774;
    int[][][] anIntArrayArrayArray9775;
    byte[][] aByteArrayArray9776;
    NodeCollection aClass429_9777;
    Node[] aClass241Array9778;
    float aFloat9779 = 3.4028235E38F;
    Class364 aClass364_9780;
    Interface40 anInterface40_9781;
    int anInt9782;
    int anInt9783;
    int anInt9784;
    byte[][] aByteArrayArray9785;
    float[][] aFloatArrayArray9786;
    float[][] aFloatArrayArray9787;
    float[][] aFloatArrayArray9788;
    int anInt9789;
    Node[] aClass241Array9790;
    short[][] aShortArrayArray9791;
    long aLong9792;
    long aLong9793;
    int anInt9794;
    int[] anIntArray9795;
    int[] anIntArray9796;
    Class366 aClass366_9797;
    int anInt9798;
    int[][][] anIntArrayArrayArray9799;
    
    public Class241_Sub39_Sub17 method3578
	(int i, int i_0_, Class241_Sub39_Sub17 class241_sub39_sub17) {
	if ((((Class166_Sub1) this).aByteArrayArray9776[i][i_0_] & 0x1) == 0)
	    return null;
	int i_1_
	    = (anInt2053 * 2039042417
	       >> (((Class103_Sub3) ((Class166_Sub1) this).aClass103_Sub3_9767)
		   .anInt9489));
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1
	    = (Class241_Sub39_Sub17_Sub1) class241_sub39_sub17;
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1_2_;
	if (class241_sub39_sub17_sub1 != null
	    && class241_sub39_sub17_sub1.method17674(i_1_, i_1_)) {
	    class241_sub39_sub17_sub1_2_ = class241_sub39_sub17_sub1;
	    class241_sub39_sub17_sub1_2_.method17669();
	} else
	    class241_sub39_sub17_sub1_2_
		= new Class241_Sub39_Sub17_Sub1((((Class166_Sub1) this)
						 .aClass103_Sub3_9767),
						i_1_, i_1_);
	class241_sub39_sub17_sub1_2_.method17670(0, 0, i_1_, i_1_);
	method16145(class241_sub39_sub17_sub1_2_, i, i_0_);
	return class241_sub39_sub17_sub1_2_;
    }
    
    public void method3565() {
	if (((Class166_Sub1) this).anInt9783 <= 0) {
	    ((Class166_Sub1) this).aClass364_9780 = null;
	    method16144();
	} else {
	    byte[][] is = (new byte[anInt2055 * 266270313 + 1]
			   [anInt2052 * -14610189 + 1]);
	    for (int i = 1; i < anInt2055 * 266270313; i++) {
		for (int i_3_ = 1; i_3_ < anInt2052 * -14610189; i_3_++)
		    is[i][i_3_]
			= (byte) (((((Class166_Sub1) this).aByteArrayArray9785
				    [i - 1][i_3_])
				   >> 2)
				  + ((((Class166_Sub1) this)
				      .aByteArrayArray9785[i + 1][i_3_])
				     >> 3)
				  + ((((Class166_Sub1) this)
				      .aByteArrayArray9785[i][i_3_ - 1])
				     >> 2)
				  + ((((Class166_Sub1) this)
				      .aByteArrayArray9785[i][i_3_ + 1])
				     >> 3)
				  + ((((Class166_Sub1) this)
				      .aByteArrayArray9785[i][i_3_])
				     >> 1));
	    }
	    ((Class166_Sub1) this).aClass241Array9790
		= new Node[((Class166_Sub1) this).aClass407_9766
				   .method7306(1212232862)];
	    ((Class166_Sub1) this).aClass407_9766.method7305
		(((Class166_Sub1) this).aClass241Array9790, -2132947263);
	    for (int i = 0;
		 i < ((Class166_Sub1) this).aClass241Array9790.length; i++)
		((Class241_Sub17) ((Class166_Sub1) this).aClass241Array9790[i])
		    .method15020(((Class166_Sub1) this).anInt9783);
	    ((Class166_Sub1) this).anInt9773 = 20;
	    if (((Class166_Sub1) this).anIntArrayArrayArray9775 != null)
		((Class166_Sub1) this).anInt9773 += 4;
	    if ((((Class166_Sub1) this).anInt9789 & 0x7) != 0)
		((Class166_Sub1) this).anInt9773 += 12;
	    ((Class166_Sub1) this).aLong9758
		= (((Class166_Sub1) this).aClass103_Sub3_9767.anUnsafe9493
		       .allocateMemory
		   ((long) (((Class166_Sub1) this).anInt9783 * 4
			    + (((Class166_Sub1) this).anInt9783
			       * ((Class166_Sub1) this).anInt9773))));
	    ((Class166_Sub1) this).aLong9792
		= ((Class166_Sub1) this).aLong9758;
	    ((Class166_Sub1) this).aLong9793
		= (((Class166_Sub1) this).aLong9758
		   + (long) (((Class166_Sub1) this).anInt9783 * 4));
	    Class241_Sub17[] class241_sub17s
		= new Class241_Sub17[((Class166_Sub1) this).anInt9783];
	    int i = RSAKeys.method860(((Class166_Sub1) this).anInt9783 / 4,
				      -1959341094);
	    if (i < 1)
		i = 1;
	    HashTable class407 = new HashTable(i);
	    Class241_Sub17[] class241_sub17s_4_
		= new Class241_Sub17[((Class166_Sub1) this).anInt9784];
	    for (int i_5_ = 0; i_5_ < anInt2055 * 266270313; i_5_++) {
		for (int i_6_ = 0; i_6_ < anInt2052 * -14610189; i_6_++)
		    method16146(i_5_, i_6_, is, class241_sub17s_4_, class407,
				class241_sub17s);
	    }
	    for (int i_7_ = 0; i_7_ < ((Class166_Sub1) this).anInt9764;
		 i_7_++) {
		Class241_Sub17 class241_sub17 = class241_sub17s[i_7_];
		if (class241_sub17 != null)
		    class241_sub17.method15021(i_7_);
	    }
	    for (int i_8_ = 0; i_8_ < anInt2055 * 266270313; i_8_++) {
		for (int i_9_ = 0; i_9_ < anInt2052 * -14610189; i_9_++) {
		    short[] is_10_
			= (((Class166_Sub1) this).aShortArrayArray9791
			   [i_9_ * (anInt2055 * 266270313) + i_8_]);
		    if (is_10_ != null) {
			int i_11_ = 0;
			int i_12_ = 0;
			while (i_12_ < is_10_.length) {
			    int i_13_ = is_10_[i_12_++] & 0xffff;
			    int i_14_ = is_10_[i_12_++] & 0xffff;
			    int i_15_ = is_10_[i_12_++] & 0xffff;
			    Class241_Sub17 class241_sub17
				= class241_sub17s[i_13_];
			    Class241_Sub17 class241_sub17_16_
				= class241_sub17s[i_14_];
			    Class241_Sub17 class241_sub17_17_
				= class241_sub17s[i_15_];
			    Class241_Sub17 class241_sub17_18_ = null;
			    if (class241_sub17 != null) {
				class241_sub17.method15033(i_8_, i_9_, i_11_);
				class241_sub17_18_ = class241_sub17;
			    }
			    if (class241_sub17_16_ != null) {
				class241_sub17_16_.method15033(i_8_, i_9_,
							       i_11_);
				if (class241_sub17_18_ == null
				    || ((class241_sub17_16_.hashCode
					 * 4356572401218184725L)
					< (class241_sub17_18_.hashCode
					   * 4356572401218184725L)))
				    class241_sub17_18_ = class241_sub17_16_;
			    }
			    if (class241_sub17_17_ != null) {
				class241_sub17_17_.method15033(i_8_, i_9_,
							       i_11_);
				if (class241_sub17_18_ == null
				    || ((class241_sub17_17_.hashCode
					 * 4356572401218184725L)
					< (class241_sub17_18_.hashCode
					   * 4356572401218184725L)))
				    class241_sub17_18_ = class241_sub17_17_;
			    }
			    if (class241_sub17_18_ != null) {
				if (class241_sub17 != null)
				    class241_sub17_18_.method15021(i_13_);
				if (class241_sub17_16_ != null)
				    class241_sub17_18_.method15021(i_14_);
				if (class241_sub17_17_ != null)
				    class241_sub17_18_.method15021(i_15_);
				class241_sub17_18_.method15033(i_8_, i_9_,
							       i_11_);
			    }
			    i_11_++;
			}
		    }
		}
	    }
	    ((Class166_Sub1) this).anInt9782 = 0;
	    for (int i_19_ = 0;
		 i_19_ < ((Class166_Sub1) this).aClass241Array9790.length;
		 i_19_++) {
		Class241_Sub17 class241_sub17
		    = ((Class241_Sub17)
		       ((Class166_Sub1) this).aClass241Array9790[i_19_]);
		if (((Class241_Sub17) class241_sub17).anInt8991 > 0)
		    ((Class166_Sub1) this).aClass241Array9790
			[((Class166_Sub1) this).anInt9782++]
			= class241_sub17;
	    }
	    ((Class166_Sub1) this).aClass241Array9778
		= new Node[((Class166_Sub1) this).anInt9782];
	    long[] ls = new long[((Class166_Sub1) this).anInt9782];
	    for (int i_20_ = 0; i_20_ < ((Class166_Sub1) this).anInt9782;
		 i_20_++) {
		Class241_Sub17 class241_sub17
		    = ((Class241_Sub17)
		       ((Class166_Sub1) this).aClass241Array9790[i_20_]);
		ls[i_20_] = class241_sub17.hashCode * 4356572401218184725L;
		((Class166_Sub1) this).aClass241Array9778[i_20_]
		    = class241_sub17;
	    }
	    Class570.method12515(ls, ((Class166_Sub1) this).aClass241Array9778,
				 1713537755);
	    method16143();
	}
    }
    
    public boolean method3552(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			      int i_21_, int i_22_, int i_23_, boolean bool) {
	if (((Class166_Sub1) this).aClass364_9780 == null
	    || class241_sub39_sub17 == null)
	    return false;
	int i_24_
	    = (i - (i_21_ * ((Class103_Sub3) (((Class166_Sub1) this)
					      .aClass103_Sub3_9767)).anInt9520
		    >> 8)
	       >> (((Class103_Sub3) ((Class166_Sub1) this).aClass103_Sub3_9767)
		   .anInt9489));
	int i_25_
	    = (i_22_ - (i_21_ * (((Class103_Sub3)
				  ((Class166_Sub1) this).aClass103_Sub3_9767)
				 .anInt9627)
			>> 8)
	       >> (((Class103_Sub3) ((Class166_Sub1) this).aClass103_Sub3_9767)
		   .anInt9489));
	return ((Class166_Sub1) this).aClass364_9780
		   .method6536(class241_sub39_sub17, i_24_, i_25_);
    }
    
    public void method3568
	(int i, int i_26_, int[] is, int[] is_27_, int[] is_28_, int[] is_29_,
	 int[] is_30_, int[] is_31_, int[] is_32_, int[] is_33_, int[] is_34_,
	 int[] is_35_, int[] is_36_, Class86 class86, boolean bool) {
	int i_37_ = is_33_.length;
	int[] is_38_ = new int[i_37_ * 3];
	int[] is_39_ = new int[i_37_ * 3];
	int[] is_40_ = new int[i_37_ * 3];
	int[] is_41_ = new int[i_37_ * 3];
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
	    is_41_[i_46_] = is_34_ != null ? is_34_[i_47_] : is_33_[i_47_];
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
	    is_41_[i_46_] = is_34_ != null ? is_34_[i_47_] : is_33_[i_47_];
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
	    is_41_[i_46_] = is_34_ != null ? is_34_[i_47_] : is_33_[i_47_];
	    if (is_27_ != null)
		is_44_[i_46_] = is_27_[i_50_];
	    if (is_29_ != null)
		is_45_[i_46_] = is_29_[i_50_];
	    i_46_++;
	}
	method3544(i, i_26_, is_38_, is_44_, is_39_, is_45_, is_40_, is_41_,
		   is_42_, is_43_, class86, bool);
    }
    
    public void method3573(int i, int i_51_, int[] is, int[] is_52_,
			   int[] is_53_, int[] is_54_, int[] is_55_,
			   int[] is_56_, int[] is_57_, int[] is_58_,
			   Class86 class86, boolean bool) {
	Class107 class107
	    = ((Class166_Sub1) this).aClass103_Sub3_9767.aClass107_1458;
	if (is_54_ != null
	    && ((Class166_Sub1) this).anIntArrayArrayArray9775 == null)
	    ((Class166_Sub1) this).anIntArrayArrayArray9775
		= new int[anInt2055 * 266270313][anInt2052 * -14610189][];
	if (is_52_ != null
	    && ((Class166_Sub1) this).anIntArrayArrayArray9774 == null)
	    ((Class166_Sub1) this).anIntArrayArrayArray9774
		= new int[anInt2055 * 266270313][anInt2052 * -14610189][];
	((Class166_Sub1) this).anIntArrayArrayArray9772[i][i_51_] = is;
	((Class166_Sub1) this).anIntArrayArrayArray9799[i][i_51_] = is_53_;
	((Class166_Sub1) this).anIntArrayArrayArray9757[i][i_51_] = is_55_;
	((Class166_Sub1) this).anIntArrayArrayArray9771[i][i_51_] = is_56_;
	if (((Class166_Sub1) this).anIntArrayArrayArray9775 != null)
	    ((Class166_Sub1) this).anIntArrayArrayArray9775[i][i_51_] = is_54_;
	if (((Class166_Sub1) this).anIntArrayArrayArray9774 != null)
	    ((Class166_Sub1) this).anIntArrayArrayArray9774[i][i_51_] = is_52_;
	Class241_Sub17[] class241_sub17s
	    = (((Class166_Sub1) this).aClass241_Sub17ArrayArrayArray9769[i]
		   [i_51_]
	       = new Class241_Sub17[is_55_.length]);
	for (int i_59_ = 0; i_59_ < is_55_.length; i_59_++) {
	    int i_60_ = is_57_[i_59_];
	    int i_61_ = is_58_[i_59_];
	    if ((((Class166_Sub1) this).anInt9789 & 0x20) != 0 && i_60_ != -1
		&& class107.method2680(i_60_, 410755103).aBool1434) {
		i_61_ = 128;
		i_60_ = -1;
	    }
	    long l = ((long) (class86.anInt1253 * 642800105) << 48
		      | (long) (class86.anInt1252 * -1282025259) << 42
		      | (long) (class86.anInt1251 * 1897985763) << 28
		      | (long) (i_61_ << 14) | (long) i_60_);
	    Node class241;
	    for (class241
		     = ((Class166_Sub1) this).aClass407_9766.get(l);
		 class241 != null;
		 class241 = ((Class166_Sub1) this).aClass407_9766
				.method7289((byte) -17)) {
		Class241_Sub17 class241_sub17 = (Class241_Sub17) class241;
		if (((Class241_Sub17) class241_sub17).anInt8985 == i_60_
		    && (((Class241_Sub17) class241_sub17).aFloat8988
			== (float) i_61_)
		    && ((Class241_Sub17) class241_sub17).aClass86_8987
			   .method1849(class86, -2866992))
		    break;
	    }
	    if (class241 == null) {
		class241_sub17s[i_59_]
		    = new Class241_Sub17(this, i_60_, i_61_, class86);
		((Class166_Sub1) this).aClass407_9766
		    .put(class241_sub17s[i_59_], l);
	    } else
		class241_sub17s[i_59_] = (Class241_Sub17) class241;
	}
	if (bool)
	    ((Class166_Sub1) this).aByteArrayArray9776[i][i_51_] |= 0x1;
	if (is_55_.length > ((Class166_Sub1) this).anInt9784)
	    ((Class166_Sub1) this).anInt9784 = is_55_.length;
	((Class166_Sub1) this).anInt9783 += is_55_.length;
    }
    
    void method16143() {
	((Class166_Sub1) this).anInterface40_9781
	    = ((Class166_Sub1) this).aClass103_Sub3_9767.method15752(false);
	((Class166_Sub1) this).anInterface40_9781
	    .method221(((Class166_Sub1) this).anInt9764 * 4, 4);
	((Class166_Sub1) this).anInterface40_9781.method268
	    (0, ((Class166_Sub1) this).anInt9764 * 4,
	     ((Class166_Sub1) this).aLong9758);
	((Class166_Sub1) this).anInterface40_9765
	    = ((Class166_Sub1) this).aClass103_Sub3_9767.method15752(false);
	((Class166_Sub1) this).anInterface40_9765.method221
	    ((((Class166_Sub1) this).anInt9764
	      * ((Class166_Sub1) this).anInt9773),
	     ((Class166_Sub1) this).anInt9773);
	((Class166_Sub1) this).anInterface40_9765.method268
	    (0,
	     (((Class166_Sub1) this).anInt9764
	      * ((Class166_Sub1) this).anInt9773),
	     (((Class166_Sub1) this).aLong9758
	      + (long) (((Class166_Sub1) this).anInt9783 * 4)));
	((Class166_Sub1) this).aClass103_Sub3_9767.anUnsafe9493
	    .freeMemory(((Class166_Sub1) this).aLong9758);
	if ((((Class166_Sub1) this).anInt9789 & 0x7) != 0) {
	    if (((Class166_Sub1) this).anIntArrayArrayArray9775 != null)
		((Class166_Sub1) this).aClass366_9797
		    = (((Class166_Sub1) this).aClass103_Sub3_9767.method15697
		       (new Class314[]
			{ new Class314(new Class367[]
				       { Class367.aClass367_5545,
					 Class367.aClass367_5549,
					 Class367.aClass367_5559,
					 Class367.aClass367_5548 }),
			  new Class314(Class367.aClass367_5547) }));
	    else
		((Class166_Sub1) this).aClass366_9797
		    = (((Class166_Sub1) this).aClass103_Sub3_9767.method15697
		       (new Class314[]
			{ new Class314(new Class367[]
				       { Class367.aClass367_5545,
					 Class367.aClass367_5549,
					 Class367.aClass367_5548 }),
			  new Class314(Class367.aClass367_5547) }));
	} else if (((Class166_Sub1) this).anIntArrayArrayArray9775 != null)
	    ((Class166_Sub1) this).aClass366_9797
		= (((Class166_Sub1) this).aClass103_Sub3_9767.method15697
		   (new Class314[]
		    { new Class314(new Class367[] { Class367.aClass367_5545,
						    Class367.aClass367_5549,
						    Class367.aClass367_5559 }),
		      new Class314(Class367.aClass367_5547) }));
	else
	    ((Class166_Sub1) this).aClass366_9797
		= (((Class166_Sub1) this).aClass103_Sub3_9767.method15697
		   (new Class314[]
		    { new Class314(new Class367[] { Class367.aClass367_5545,
						    Class367.aClass367_5549 }),
		      new Class314(Class367.aClass367_5547) }));
	for (int i = 0; i < ((Class166_Sub1) this).anInt9782; i++) {
	    Class241_Sub17 class241_sub17
		= ((Class241_Sub17)
		   ((Class166_Sub1) this).aClass241Array9790[i]);
	    class241_sub17.method15035(((Class166_Sub1) this).anInt9764);
	}
	if (((Class166_Sub1) this).aClass364_9780 != null)
	    ((Class166_Sub1) this).aClass364_9780.method6532();
	method16144();
    }
    
    void method16144() {
	if ((((Class166_Sub1) this).anInt9762 & 0x2) == 0) {
	    ((Class166_Sub1) this).anIntArrayArrayArray9799 = null;
	    ((Class166_Sub1) this).anIntArrayArrayArray9772 = null;
	    ((Class166_Sub1) this).anIntArrayArrayArray9757 = null;
	}
	((Class166_Sub1) this).anIntArrayArrayArray9775 = null;
	((Class166_Sub1) this).anIntArrayArrayArray9771 = null;
	((Class166_Sub1) this).anIntArrayArrayArray9774 = null;
	((Class166_Sub1) this).aClass241_Sub17ArrayArrayArray9769 = null;
	((Class166_Sub1) this).aByteArrayArray9785 = null;
	((Class166_Sub1) this).aClass407_9766 = null;
	((Class166_Sub1) this).aClass241Array9790 = null;
	((Class166_Sub1) this).aFloatArrayArray9788 = null;
	((Class166_Sub1) this).aFloatArrayArray9787 = null;
	((Class166_Sub1) this).aFloatArrayArray9786 = null;
    }
    
    public void method3579() {
	if (((Class166_Sub1) this).anInt9783 <= 0) {
	    ((Class166_Sub1) this).aClass364_9780 = null;
	    method16144();
	} else {
	    byte[][] is = (new byte[anInt2055 * 266270313 + 1]
			   [anInt2052 * -14610189 + 1]);
	    for (int i = 1; i < anInt2055 * 266270313; i++) {
		for (int i_62_ = 1; i_62_ < anInt2052 * -14610189; i_62_++)
		    is[i][i_62_]
			= (byte) (((((Class166_Sub1) this).aByteArrayArray9785
				    [i - 1][i_62_])
				   >> 2)
				  + ((((Class166_Sub1) this)
				      .aByteArrayArray9785[i + 1][i_62_])
				     >> 3)
				  + ((((Class166_Sub1) this)
				      .aByteArrayArray9785[i][i_62_ - 1])
				     >> 2)
				  + ((((Class166_Sub1) this)
				      .aByteArrayArray9785[i][i_62_ + 1])
				     >> 3)
				  + ((((Class166_Sub1) this)
				      .aByteArrayArray9785[i][i_62_])
				     >> 1));
	    }
	    ((Class166_Sub1) this).aClass241Array9790
		= new Node[((Class166_Sub1) this).aClass407_9766
				   .method7306(640830486)];
	    ((Class166_Sub1) this).aClass407_9766.method7305
		(((Class166_Sub1) this).aClass241Array9790, -2144834690);
	    for (int i = 0;
		 i < ((Class166_Sub1) this).aClass241Array9790.length; i++)
		((Class241_Sub17) ((Class166_Sub1) this).aClass241Array9790[i])
		    .method15020(((Class166_Sub1) this).anInt9783);
	    ((Class166_Sub1) this).anInt9773 = 20;
	    if (((Class166_Sub1) this).anIntArrayArrayArray9775 != null)
		((Class166_Sub1) this).anInt9773 += 4;
	    if ((((Class166_Sub1) this).anInt9789 & 0x7) != 0)
		((Class166_Sub1) this).anInt9773 += 12;
	    ((Class166_Sub1) this).aLong9758
		= (((Class166_Sub1) this).aClass103_Sub3_9767.anUnsafe9493
		       .allocateMemory
		   ((long) (((Class166_Sub1) this).anInt9783 * 4
			    + (((Class166_Sub1) this).anInt9783
			       * ((Class166_Sub1) this).anInt9773))));
	    ((Class166_Sub1) this).aLong9792
		= ((Class166_Sub1) this).aLong9758;
	    ((Class166_Sub1) this).aLong9793
		= (((Class166_Sub1) this).aLong9758
		   + (long) (((Class166_Sub1) this).anInt9783 * 4));
	    Class241_Sub17[] class241_sub17s
		= new Class241_Sub17[((Class166_Sub1) this).anInt9783];
	    int i = RSAKeys.method860(((Class166_Sub1) this).anInt9783 / 4,
				      -1959341094);
	    if (i < 1)
		i = 1;
	    HashTable class407 = new HashTable(i);
	    Class241_Sub17[] class241_sub17s_63_
		= new Class241_Sub17[((Class166_Sub1) this).anInt9784];
	    for (int i_64_ = 0; i_64_ < anInt2055 * 266270313; i_64_++) {
		for (int i_65_ = 0; i_65_ < anInt2052 * -14610189; i_65_++)
		    method16146(i_64_, i_65_, is, class241_sub17s_63_,
				class407, class241_sub17s);
	    }
	    for (int i_66_ = 0; i_66_ < ((Class166_Sub1) this).anInt9764;
		 i_66_++) {
		Class241_Sub17 class241_sub17 = class241_sub17s[i_66_];
		if (class241_sub17 != null)
		    class241_sub17.method15021(i_66_);
	    }
	    for (int i_67_ = 0; i_67_ < anInt2055 * 266270313; i_67_++) {
		for (int i_68_ = 0; i_68_ < anInt2052 * -14610189; i_68_++) {
		    short[] is_69_
			= (((Class166_Sub1) this).aShortArrayArray9791
			   [i_68_ * (anInt2055 * 266270313) + i_67_]);
		    if (is_69_ != null) {
			int i_70_ = 0;
			int i_71_ = 0;
			while (i_71_ < is_69_.length) {
			    int i_72_ = is_69_[i_71_++] & 0xffff;
			    int i_73_ = is_69_[i_71_++] & 0xffff;
			    int i_74_ = is_69_[i_71_++] & 0xffff;
			    Class241_Sub17 class241_sub17
				= class241_sub17s[i_72_];
			    Class241_Sub17 class241_sub17_75_
				= class241_sub17s[i_73_];
			    Class241_Sub17 class241_sub17_76_
				= class241_sub17s[i_74_];
			    Class241_Sub17 class241_sub17_77_ = null;
			    if (class241_sub17 != null) {
				class241_sub17.method15033(i_67_, i_68_,
							   i_70_);
				class241_sub17_77_ = class241_sub17;
			    }
			    if (class241_sub17_75_ != null) {
				class241_sub17_75_.method15033(i_67_, i_68_,
							       i_70_);
				if (class241_sub17_77_ == null
				    || ((class241_sub17_75_.hashCode
					 * 4356572401218184725L)
					< (class241_sub17_77_.hashCode
					   * 4356572401218184725L)))
				    class241_sub17_77_ = class241_sub17_75_;
			    }
			    if (class241_sub17_76_ != null) {
				class241_sub17_76_.method15033(i_67_, i_68_,
							       i_70_);
				if (class241_sub17_77_ == null
				    || ((class241_sub17_76_.hashCode
					 * 4356572401218184725L)
					< (class241_sub17_77_.hashCode
					   * 4356572401218184725L)))
				    class241_sub17_77_ = class241_sub17_76_;
			    }
			    if (class241_sub17_77_ != null) {
				if (class241_sub17 != null)
				    class241_sub17_77_.method15021(i_72_);
				if (class241_sub17_75_ != null)
				    class241_sub17_77_.method15021(i_73_);
				if (class241_sub17_76_ != null)
				    class241_sub17_77_.method15021(i_74_);
				class241_sub17_77_.method15033(i_67_, i_68_,
							       i_70_);
			    }
			    i_70_++;
			}
		    }
		}
	    }
	    ((Class166_Sub1) this).anInt9782 = 0;
	    for (int i_78_ = 0;
		 i_78_ < ((Class166_Sub1) this).aClass241Array9790.length;
		 i_78_++) {
		Class241_Sub17 class241_sub17
		    = ((Class241_Sub17)
		       ((Class166_Sub1) this).aClass241Array9790[i_78_]);
		if (((Class241_Sub17) class241_sub17).anInt8991 > 0)
		    ((Class166_Sub1) this).aClass241Array9790
			[((Class166_Sub1) this).anInt9782++]
			= class241_sub17;
	    }
	    ((Class166_Sub1) this).aClass241Array9778
		= new Node[((Class166_Sub1) this).anInt9782];
	    long[] ls = new long[((Class166_Sub1) this).anInt9782];
	    for (int i_79_ = 0; i_79_ < ((Class166_Sub1) this).anInt9782;
		 i_79_++) {
		Class241_Sub17 class241_sub17
		    = ((Class241_Sub17)
		       ((Class166_Sub1) this).aClass241Array9790[i_79_]);
		ls[i_79_] = class241_sub17.hashCode * 4356572401218184725L;
		((Class166_Sub1) this).aClass241Array9778[i_79_]
		    = class241_sub17;
	    }
	    Class570.method12515(ls, ((Class166_Sub1) this).aClass241Array9778,
				 1713537755);
	    method16143();
	}
    }
    
    public void method3547(int i, int i_80_, int i_81_, boolean[][] bools,
			   boolean bool, int i_82_) {
	if (((Class166_Sub1) this).aClass241Array9778 != null) {
	    int i_83_ = i_81_ + i_81_ + 1;
	    i_83_ *= i_83_;
	    if (((Class166_Sub1) this).anIntArray9768.length < i_83_)
		((Class166_Sub1) this).anIntArray9768 = new int[i_83_];
	    int i_84_ = i - i_81_;
	    int i_85_ = i_84_;
	    if (i_84_ < 0)
		i_84_ = 0;
	    int i_86_ = i_80_ - i_81_;
	    int i_87_ = i_86_;
	    if (i_86_ < 0)
		i_86_ = 0;
	    int i_88_ = i + i_81_;
	    if (i_88_ > anInt2055 * 266270313 - 1)
		i_88_ = anInt2055 * 266270313 - 1;
	    int i_89_ = i_80_ + i_81_;
	    if (i_89_ > anInt2052 * -14610189 - 1)
		i_89_ = anInt2052 * -14610189 - 1;
	    ((Class166_Sub1) this).anInt9798 = 0;
	    for (int i_90_ = i_84_; i_90_ <= i_88_; i_90_++) {
		boolean[] bools_91_ = bools[i_90_ - i_85_];
		for (int i_92_ = i_86_; i_92_ <= i_89_; i_92_++) {
		    if (bools_91_[i_92_ - i_87_])
			((Class166_Sub1) this).anIntArray9768
			    [((Class166_Sub1) this).anInt9798++]
			    = i_92_ * (anInt2055 * 266270313) + i_90_;
		}
	    }
	    ByteBuffer bytebuffer
		= ((Class166_Sub1) this).aClass103_Sub3_9767.aByteBuffer9490;
	    bytebuffer.clear();
	    for (int i_93_ = 0;
		 i_93_ < ((Class166_Sub1) this).aClass241Array9778.length;
		 i_93_++) {
		Class241_Sub17 class241_sub17
		    = ((Class241_Sub17)
		       ((Class166_Sub1) this).aClass241Array9778[i_93_]);
		class241_sub17.method15025((((Class166_Sub1) this)
					    .anIntArray9768),
					   ((Class166_Sub1) this).anInt9798);
	    }
	    int i_94_ = bytebuffer.position();
	    Class361 class361
		= (((Class103_Sub3) ((Class166_Sub1) this).aClass103_Sub3_9767)
		   .aClass361_9540);
	    if (i_94_ != 0) {
		Interface33 interface33
		    = ((Class166_Sub1) this).aClass103_Sub3_9767
			  .method15630(i_94_ / 2);
		interface33.method268(0, i_94_,
				      (((Class166_Sub1) this)
				       .aClass103_Sub3_9767.aLong9491));
		((Class166_Sub1) this).aClass103_Sub3_9767.method15728();
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15955(0, ((Class166_Sub1) this).anInterface40_9765);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15718(interface33);
		class361.method6494(Class268.aClass268_4354);
		if (((Class166_Sub1) this).aClass103_Sub3_9767.anInt9613 > 0) {
		    class361.aClass287_5507.method5568
			((float) ((((Class166_Sub1) this).aClass103_Sub3_9767
				   .anInt9589) >> 16
				  & 0xff) / 255.0F,
			 (float) ((((Class166_Sub1) this).aClass103_Sub3_9767
				   .anInt9589) >> 8
				  & 0xff) / 255.0F,
			 (float) ((((Class166_Sub1) this).aClass103_Sub3_9767
				   .anInt9589) >> 0
				  & 0xff) / 255.0F);
		    class361.aClass285_5516.method5548(0.0F, 0.0F, 1.0F,
						       -(((Class166_Sub1) this)
							 .aClass103_Sub3_9767
							 .aFloat9615));
		    class361.aClass285_5516.method5543(((Class103_Sub3)
							(((Class166_Sub1) this)
							 .aClass103_Sub3_9767))
						       .aClass268_9645);
		    class361.aClass285_5516.method5531
			(1.0F / ((((Class166_Sub1) this).aClass103_Sub3_9767
				  .aFloat9616)
				 - (((Class166_Sub1) this).aClass103_Sub3_9767
				    .aFloat9615)));
		} else {
		    class361.aClass285_5516.method5548(0.0F, 0.0F, 0.0F, 0.0F);
		    class361.aClass287_5507.method5568(0.0F, 0.0F, 0.0F);
		}
		if ((((Class166_Sub1) this).anInt9789 & 0x7) == 0) {
		    int i_95_ = 0;
		    for (int i_96_ = 0;
			 (i_96_
			  < ((Class166_Sub1) this).aClass241Array9778.length);
			 i_96_++) {
			Class241_Sub17 class241_sub17
			    = (Class241_Sub17) (((Class166_Sub1) this)
						.aClass241Array9778[i_96_]);
			if (((Class241_Sub17) class241_sub17).anInt8993 != 0) {
			    if (((Class103_Sub3)
				 ((Class166_Sub1) this).aClass103_Sub3_9767)
				.aBool9565) {
				((Class166_Sub1) this).aClass103_Sub3_9767
				    .method2335
				    (0, (((Class241_Sub17) class241_sub17)
					 .aClass86_8987));
				class361.aClass285_5514.method5548
				    (0.0F, 1.0F, 0.0F,
				     ((float) (((Class103_Sub3)
						(((Class166_Sub1) this)
						 .aClass103_Sub3_9767))
					       .anInt9608)
				      + ((float) ((((Class241_Sub17)
						    class241_sub17)
						   .aClass86_8987.anInt1253)
						  * 642800105)
					 / 255.0F
					 * (float) ((((Class241_Sub17)
						      class241_sub17)
						     .aClass86_8987.anInt1252)
						    * -1282025259))));
				class361.aClass285_5514.method5531
				    (1.0F / (float) ((((Class241_Sub17)
						       class241_sub17)
						      .aClass86_8987.anInt1252)
						     * -1282025259));
				class361.aClass287_5515.method5568
				    ((float) (((((Class241_Sub17)
						 class241_sub17)
						.aClass86_8987.anInt1251)
					       * 1897985763) >> 16
					      & 0xff) / 255.0F,
				     (float) (((((Class241_Sub17)
						 class241_sub17)
						.aClass86_8987.anInt1251)
					       * 1897985763) >> 8
					      & 0xff) / 255.0F,
				     (float) (((((Class241_Sub17)
						 class241_sub17)
						.aClass86_8987.anInt1251)
					       * 1897985763) >> 0
					      & 0xff) / 255.0F);
			    } else {
				class361.aClass285_5514.method5548(0.0F, 0.0F,
								   0.0F, 0.0F);
				class361.aClass287_5515.method5568(0.0F, 0.0F,
								   0.0F);
			    }
			    boolean bool_97_ = false;
			    if (((Class241_Sub17) class241_sub17).anInt8985
				!= -1) {
				Class101 class101
				    = (((Class166_Sub1) this)
					   .aClass103_Sub3_9767.aClass107_1458
					   .method2680
				       ((((Class241_Sub17) class241_sub17)
					 .anInt8985),
					-1905776083));
				class361.anInterface41_5525
				    = ((Class103_Sub3) (((Class166_Sub1) this)
							.aClass103_Sub3_9767))
					  .aClass379_9518.method6844(class101);
				bool_97_
				    = !Class628.method13474(class101.aByte1427,
							    -768281831);
			    } else
				class361.anInterface41_5525
				    = (((Class166_Sub1) this)
				       .aClass103_Sub3_9767
				       .anInterface41_9584);
			    ((Class166_Sub1) this).aClass103_Sub3_9767
				.method15955
				(1, (((Class241_Sub17) class241_sub17)
				     .anInterface40_8990));
			    ((Class166_Sub1) this).aClass103_Sub3_9767
				.method15716
				(((Class166_Sub1) this).aClass366_9797);
			    class361.aClass268_5510.method5206
				(1.0F / (((Class241_Sub17) class241_sub17)
					 .aFloat8988),
				 1.0F / (((Class241_Sub17) class241_sub17)
					 .aFloat8988),
				 1.0F, 1.0F);
			    class361.anInt5522
				= ((Class241_Sub17) class241_sub17).anInt8994;
			    class361.anInt5523
				= (((Class241_Sub17) class241_sub17).anInt8989
				   - (((Class241_Sub17) class241_sub17)
				      .anInt8994)
				   + 1);
			    class361.anInt5506 = i_95_;
			    class361.anInt5517
				= (((Class241_Sub17) class241_sub17).anInt8993
				   / 3);
			    class361.method6495(bool_97_);
			    i_95_
				+= ((Class241_Sub17) class241_sub17).anInt8993;
			}
		    }
		} else {
		    class361.aClass287_5518.method5568((((Class166_Sub1) this)
							.aClass103_Sub3_9767
							.aFloatArray9558[0]),
						       (((Class166_Sub1) this)
							.aClass103_Sub3_9767
							.aFloatArray9558[1]),
						       (((Class166_Sub1) this)
							.aClass103_Sub3_9767
							.aFloatArray9558[2]));
		    class361.aClass287_5519.method5568
			((((Class166_Sub1) this).aClass103_Sub3_9767.aFloat9609
			  * (((Class166_Sub1) this).aClass103_Sub3_9767
			     .aFloat9563)),
			 (((Class166_Sub1) this).aClass103_Sub3_9767.aFloat9609
			  * (((Class166_Sub1) this).aClass103_Sub3_9767
			     .aFloat9564)),
			 (((Class166_Sub1) this).aClass103_Sub3_9767.aFloat9609
			  * (((Class166_Sub1) this).aClass103_Sub3_9767
			     .aFloat9556)));
		    class361.aClass287_5520.method5568
			((-(((Class166_Sub1) this).aClass103_Sub3_9767
			    .aFloat9568)
			  * (((Class166_Sub1) this).aClass103_Sub3_9767
			     .aFloat9563)),
			 (-(((Class166_Sub1) this).aClass103_Sub3_9767
			    .aFloat9568)
			  * (((Class166_Sub1) this).aClass103_Sub3_9767
			     .aFloat9564)),
			 (-(((Class166_Sub1) this).aClass103_Sub3_9767
			    .aFloat9568)
			  * (((Class166_Sub1) this).aClass103_Sub3_9767
			     .aFloat9556)));
		    class361.aClass287_5521.method5568
			((((Class166_Sub1) this).aClass103_Sub3_9767.aFloat9566
			  * (((Class166_Sub1) this).aClass103_Sub3_9767
			     .aFloat9563)),
			 (((Class166_Sub1) this).aClass103_Sub3_9767.aFloat9566
			  * (((Class166_Sub1) this).aClass103_Sub3_9767
			     .aFloat9564)),
			 (((Class166_Sub1) this).aClass103_Sub3_9767.aFloat9566
			  * (((Class166_Sub1) this).aClass103_Sub3_9767
			     .aFloat9556)));
		    int i_98_ = 0;
		    for (int i_99_ = 0;
			 (i_99_
			  < ((Class166_Sub1) this).aClass241Array9778.length);
			 i_99_++) {
			Class241_Sub17 class241_sub17
			    = (Class241_Sub17) (((Class166_Sub1) this)
						.aClass241Array9778[i_99_]);
			if (((Class241_Sub17) class241_sub17).anInt8993 > 0) {
			    if (((Class103_Sub3)
				 ((Class166_Sub1) this).aClass103_Sub3_9767)
				.aBool9565) {
				((Class166_Sub1) this).aClass103_Sub3_9767
				    .method2335
				    (0, (((Class241_Sub17) class241_sub17)
					 .aClass86_8987));
				float f = 0.15F;
				class361.aClass285_5514.method5548
				    (0.0F,
				     1.0F / ((float) ((((Class241_Sub17)
							class241_sub17)
						       .aClass86_8987
						       .anInt1252)
						      * -1282025259)
					     * f),
				     0.0F,
				     256.0F / ((float) ((((Class241_Sub17)
							  class241_sub17)
							 .aClass86_8987
							 .anInt1252)
							* -1282025259)
					       * f));
				class361.aClass287_5515.method5568
				    ((float) (((((Class241_Sub17)
						 class241_sub17)
						.aClass86_8987.anInt1251)
					       * 1897985763) >> 16
					      & 0xff) / 255.0F,
				     (float) (((((Class241_Sub17)
						 class241_sub17)
						.aClass86_8987.anInt1251)
					       * 1897985763) >> 8
					      & 0xff) / 255.0F,
				     (float) (((((Class241_Sub17)
						 class241_sub17)
						.aClass86_8987.anInt1251)
					       * 1897985763) >> 0
					      & 0xff) / 255.0F);
			    } else {
				class361.aClass285_5514.method5548(0.0F, 0.0F,
								   0.0F, 0.0F);
				class361.aClass287_5515.method5568(0.0F, 0.0F,
								   0.0F);
			    }
			    byte i_100_ = 11;
			    if (((Class241_Sub17) class241_sub17).anInt8985
				!= -1) {
				Class101 class101
				    = (((Class166_Sub1) this)
					   .aClass103_Sub3_9767.aClass107_1458
					   .method2680
				       ((((Class241_Sub17) class241_sub17)
					 .anInt8985),
					1730105969));
				i_100_ = class101.aByte1427;
				class361.anInterface41_5525
				    = ((Class103_Sub3) (((Class166_Sub1) this)
							.aClass103_Sub3_9767))
					  .aClass379_9518.method6844(class101);
				class361.method6493(class101.aByte1428);
			    } else
				class361.anInterface41_5525
				    = (((Class166_Sub1) this)
				       .aClass103_Sub3_9767
				       .anInterface41_9584);
			    ((Class166_Sub1) this).aClass103_Sub3_9767
				.method15955
				(1, (((Class241_Sub17) class241_sub17)
				     .anInterface40_8990));
			    ((Class166_Sub1) this).aClass103_Sub3_9767
				.method15716
				(((Class166_Sub1) this).aClass366_9797);
			    class361.aClass268_5510.method5206
				(1.0F / (((Class241_Sub17) class241_sub17)
					 .aFloat8988),
				 1.0F / (((Class241_Sub17) class241_sub17)
					 .aFloat8988),
				 1.0F, 1.0F);
			    class361.anInt5522
				= ((Class241_Sub17) class241_sub17).anInt8994;
			    class361.anInt5523
				= (((Class241_Sub17) class241_sub17).anInt8989
				   - (((Class241_Sub17) class241_sub17)
				      .anInt8994)
				   + 1);
			    class361.anInt5506 = i_98_;
			    class361.anInt5517
				= (((Class241_Sub17) class241_sub17).anInt8993
				   / 3);
			    switch (i_100_) {
			    case 2:
			    case 4:
			    case 8:
			    case 9:
				if (!(((Class166_Sub1) this)
				      .aClass103_Sub3_9767.aBool9488)
				    && (((Class166_Sub1) this).anInt9789
					& 0x8) != 0
				    && ((Class103_Sub3) (((Class166_Sub1) this)
							 .aClass103_Sub3_9767))
					   .aClass369_Sub1_Sub2_9597
					   .method17597(842629158)) {
				    Class369_Sub1_Sub2 class369_sub1_sub2
					= (((Class103_Sub3)
					    (((Class166_Sub1) this)
					     .aClass103_Sub3_9767))
					   .aClass369_Sub1_Sub2_9597);
				    if (i_100_ == 2)
					class369_sub1_sub2
					    = (((Class103_Sub3)
						(((Class166_Sub1) this)
						 .aClass103_Sub3_9767))
					       .aClass369_Sub1_Sub2_9554);
				    class369_sub1_sub2.aClass268_11194
					.method5199
					(((Class166_Sub1) this)
					 .aClass103_Sub3_9767.aClass268_9526);
				    class369_sub1_sub2.aClass268_11179
					.method5206
					(1.0F / (((Class241_Sub17)
						  class241_sub17).aFloat8988
						 * (float) ((((Class241_Sub17)
							      class241_sub17)
							     .aClass86_8987
							     .anInt1255)
							    * -449077211)),
					 1.0F / (((Class241_Sub17)
						  class241_sub17).aFloat8988
						 * (float) ((((Class241_Sub17)
							      class241_sub17)
							     .aClass86_8987
							     .anInt1255)
							    * -449077211)),
					 1.0F, 1.0F);
				    class369_sub1_sub2.aClass287_11181
					.method5568
					((((Class103_Sub3)
					   (((Class166_Sub1) this)
					    .aClass103_Sub3_9767))
					  .aClass268_9505.aFloatArray4353[12]),
					 (((Class103_Sub3)
					   (((Class166_Sub1) this)
					    .aClass103_Sub3_9767))
					  .aClass268_9505.aFloatArray4353[13]),
					 (((Class103_Sub3)
					   (((Class166_Sub1) this)
					    .aClass103_Sub3_9767))
					  .aClass268_9505.aFloatArray4353
					  [14]));
				    Class101 class101
					= (((Class166_Sub1) this)
					       .aClass103_Sub3_9767
					       .aClass107_1458.method2680
					   ((((Class241_Sub17) class241_sub17)
					     .anInt8985),
					    1984625837));
				    class369_sub1_sub2.anInt11182
					= class101.aByte1428 * 1842143805;
				    class369_sub1_sub2.anInt11197
					= (((Class241_Sub17) class241_sub17)
					   .anInt8994) * -1594561985;
				    class369_sub1_sub2.anInt11200
					= ((((Class241_Sub17) class241_sub17)
					    .anInt8989)
					   - (((Class241_Sub17) class241_sub17)
					      .anInt8994)
					   + 1) * 590437495;
				    class369_sub1_sub2.anInt11198
					= i_98_ * -1201183163;
				    class369_sub1_sub2.anInt11176
					= (((Class241_Sub17) class241_sub17)
					   .anInt8993) / 3 * -65765357;
				    class369_sub1_sub2.aClass285_11192
					.method5525(class361.aClass285_5514);
				    class369_sub1_sub2.aClass287_11180
					.method5655(class361.aClass287_5515);
				    class369_sub1_sub2.aClass285_11190
					.method5525(class361.aClass285_5516);
				    class369_sub1_sub2.aClass287_11196
					.method5655(class361.aClass287_5507);
				    class369_sub1_sub2.method17593(-4825608);
				} else
				    class361.method6496(0);
				break;
			    case 7:
				class361.aClass287_5508.method5568
				    ((((Class103_Sub3) (((Class166_Sub1) this)
							.aClass103_Sub3_9767))
				      .aClass268_9505.aFloatArray4353[12]),
				     (((Class103_Sub3) (((Class166_Sub1) this)
							.aClass103_Sub3_9767))
				      .aClass268_9505.aFloatArray4353[13]),
				     (((Class103_Sub3) (((Class166_Sub1) this)
							.aClass103_Sub3_9767))
				      .aClass268_9505.aFloatArray4353[14]));
				class361.aClass268_5511.method5198();
				class361.anInterface30_5509
				    = ((Class166_Sub1) this)
					  .aClass103_Sub3_9767.method15636();
				class361.method6506(0);
				break;
			    default:
				if (((Class103_Sub3) (((Class166_Sub1) this)
						      .aClass103_Sub3_9767))
				    .aBool9565)
				    class361.method6508();
				else
				    class361.method6496(0);
				break;
			    case 1:
				class361.aClass287_5508.method5568
				    ((((Class103_Sub3) (((Class166_Sub1) this)
							.aClass103_Sub3_9767))
				      .aClass268_9505.aFloatArray4353[12]),
				     (((Class103_Sub3) (((Class166_Sub1) this)
							.aClass103_Sub3_9767))
				      .aClass268_9505.aFloatArray4353[13]),
				     (((Class103_Sub3) (((Class166_Sub1) this)
							.aClass103_Sub3_9767))
				      .aClass268_9505.aFloatArray4353[14]));
				if (((Class103_Sub3) (((Class166_Sub1) this)
						      .aClass103_Sub3_9767))
				    .aBool9565)
				    class361.method6500();
				else
				    class361.method6507(0);
				break;
			    case 6:
				class361.method6495
				    (!Class628.method13474(i_100_,
							   -768281831));
			    }
			    i_98_
				+= ((Class241_Sub17) class241_sub17).anInt8993;
			}
		    }
		}
	    }
	    if (!((Class166_Sub1) this).aClass429_9777.isEmpty(775524730)) {
		((Class166_Sub1) this).aClass103_Sub3_9767.method15640(128);
		((Class166_Sub1) this).aClass103_Sub3_9767.method15701(false);
		Class287 class287 = new Class287(class361.aClass287_5507);
		class361.aClass287_5507.method5568(0.0F, 0.0F, 0.0F);
		Iterator iterator
		    = ((Class166_Sub1) this).aClass429_9777.iterator();
		while (iterator.hasNext()) {
		    Class241_Sub8 class241_sub8
			= (Class241_Sub8) iterator.next();
		    class241_sub8.method14897(class361, i, i_80_, i_81_, bools,
					      bool);
		}
		class361.aClass287_5507.method5655(class287);
	    }
	    if (((Class166_Sub1) this).aClass364_9780 != null) {
		((Class166_Sub1) this).aClass103_Sub3_9767.method15640(1);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15955(0, ((Class166_Sub1) this).anInterface40_9765);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15955(1, ((Class166_Sub1) this).anInterface40_9781);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15716(((Class166_Sub1) this).aClass366_9797);
		Class268 class268 = (((Class166_Sub1) this).aClass103_Sub3_9767
				     .aClass268_9511);
		class268.method5198();
		class268.aFloatArray4353[13] = -1.0F;
		class361.method6494(class268);
		((Class166_Sub1) this).aClass364_9780
		    .method6533(class361, i, i_80_, i_81_, bools, bool);
	    }
	}
    }
    
    public void method3558(int i, int i_101_, int i_102_) {
	i = Math.min(((Class166_Sub1) this).aByteArrayArray9785.length - 1,
		     Math.max(0, i));
	i_101_ = Math.min((((Class166_Sub1) this).aByteArrayArray9785[i].length
			   - 1),
			  Math.max(0, i_101_));
	if ((((Class166_Sub1) this).aByteArrayArray9785[i][i_101_] & 0xff)
	    < i_102_)
	    ((Class166_Sub1) this).aByteArrayArray9785[i][i_101_]
		= (byte) i_102_;
    }
    
    public Class241_Sub39_Sub17 method3553
	(int i, int i_103_, Class241_Sub39_Sub17 class241_sub39_sub17) {
	if ((((Class166_Sub1) this).aByteArrayArray9776[i][i_103_] & 0x1) == 0)
	    return null;
	int i_104_
	    = (anInt2053 * 2039042417
	       >> (((Class103_Sub3) ((Class166_Sub1) this).aClass103_Sub3_9767)
		   .anInt9489));
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1
	    = (Class241_Sub39_Sub17_Sub1) class241_sub39_sub17;
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1_105_;
	if (class241_sub39_sub17_sub1 != null
	    && class241_sub39_sub17_sub1.method17674(i_104_, i_104_)) {
	    class241_sub39_sub17_sub1_105_ = class241_sub39_sub17_sub1;
	    class241_sub39_sub17_sub1_105_.method17669();
	} else
	    class241_sub39_sub17_sub1_105_
		= new Class241_Sub39_Sub17_Sub1((((Class166_Sub1) this)
						 .aClass103_Sub3_9767),
						i_104_, i_104_);
	class241_sub39_sub17_sub1_105_.method17670(0, 0, i_104_, i_104_);
	method16145(class241_sub39_sub17_sub1_105_, i, i_103_);
	return class241_sub39_sub17_sub1_105_;
    }
    
    void method16145(Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1,
		     int i, int i_106_) {
	int[] is = ((Class166_Sub1) this).anIntArrayArrayArray9772[i][i_106_];
	int[] is_107_
	    = ((Class166_Sub1) this).anIntArrayArrayArray9799[i][i_106_];
	int i_108_ = is.length;
	if (((Class166_Sub1) this).anIntArray9796.length < i_108_) {
	    ((Class166_Sub1) this).anIntArray9796 = new int[i_108_];
	    ((Class166_Sub1) this).anIntArray9795 = new int[i_108_];
	}
	for (int i_109_ = 0; i_109_ < i_108_; i_109_++) {
	    ((Class166_Sub1) this).anIntArray9796[i_109_]
		= is[i_109_] >> (((Class103_Sub3)
				  ((Class166_Sub1) this).aClass103_Sub3_9767)
				 .anInt9489);
	    ((Class166_Sub1) this).anIntArray9795[i_109_]
		= is_107_[i_109_] >> (((Class103_Sub3) (((Class166_Sub1) this)
							.aClass103_Sub3_9767))
				      .anInt9489);
	}
	int i_110_ = 0;
	while (i_110_ < i_108_) {
	    int i_111_ = ((Class166_Sub1) this).anIntArray9796[i_110_];
	    int i_112_ = ((Class166_Sub1) this).anIntArray9795[i_110_++];
	    int i_113_ = ((Class166_Sub1) this).anIntArray9796[i_110_];
	    int i_114_ = ((Class166_Sub1) this).anIntArray9795[i_110_++];
	    int i_115_ = ((Class166_Sub1) this).anIntArray9796[i_110_];
	    int i_116_ = ((Class166_Sub1) this).anIntArray9795[i_110_++];
	    if (((i_111_ - i_113_) * (i_114_ - i_116_)
		 - (i_114_ - i_112_) * (i_115_ - i_113_))
		> 0)
		class241_sub39_sub17_sub1.method17676(i_112_, i_114_, i_116_,
						      i_111_, i_113_, i_115_);
	}
    }
    
    public boolean method3556(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			      int i_117_, int i_118_, int i_119_,
			      boolean bool) {
	if (((Class166_Sub1) this).aClass364_9780 == null
	    || class241_sub39_sub17 == null)
	    return false;
	int i_120_
	    = (i - (i_117_ * ((Class103_Sub3) (((Class166_Sub1) this)
					       .aClass103_Sub3_9767)).anInt9520
		    >> 8)
	       >> (((Class103_Sub3) ((Class166_Sub1) this).aClass103_Sub3_9767)
		   .anInt9489));
	int i_121_
	    = (i_118_ - (i_117_ * (((Class103_Sub3)
				    ((Class166_Sub1) this).aClass103_Sub3_9767)
				   .anInt9627)
			 >> 8)
	       >> (((Class103_Sub3) ((Class166_Sub1) this).aClass103_Sub3_9767)
		   .anInt9489));
	return ((Class166_Sub1) this).aClass364_9780
		   .method6536(class241_sub39_sub17, i_120_, i_121_);
    }
    
    public void method3554(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_122_, int i_123_, int i_124_, boolean bool) {
	if (((Class166_Sub1) this).aClass364_9780 != null
	    && class241_sub39_sub17 != null) {
	    int i_125_
		= (i - (i_122_ * (((Class103_Sub3)
				   ((Class166_Sub1) this).aClass103_Sub3_9767)
				  .anInt9520)
			>> 8)
		   >> ((Class103_Sub3)
		       ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9489);
	    int i_126_
		= (i_123_ - (i_122_ * (((Class103_Sub3) (((Class166_Sub1) this)
							 .aClass103_Sub3_9767))
				       .anInt9627)
			     >> 8)
		   >> ((Class103_Sub3)
		       ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9489);
	    ((Class166_Sub1) this).aClass364_9780
		.method6538(class241_sub39_sub17, i_125_, i_126_);
	}
    }
    
    public void method3555(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_127_, int i_128_, int i_129_, boolean bool) {
	if (((Class166_Sub1) this).aClass364_9780 != null
	    && class241_sub39_sub17 != null) {
	    int i_130_
		= (i - (i_127_ * (((Class103_Sub3)
				   ((Class166_Sub1) this).aClass103_Sub3_9767)
				  .anInt9520)
			>> 8)
		   >> ((Class103_Sub3)
		       ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9489);
	    int i_131_
		= (i_128_ - (i_127_ * (((Class103_Sub3) (((Class166_Sub1) this)
							 .aClass103_Sub3_9767))
				       .anInt9627)
			     >> 8)
		   >> ((Class103_Sub3)
		       ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9489);
	    ((Class166_Sub1) this).aClass364_9780
		.method6535(class241_sub39_sub17, i_130_, i_131_);
	}
    }
    
    public void method3557(Class241_Sub43 class241_sub43, int[] is) {
	((Class166_Sub1) this).aClass429_9777.addNode
	    (new Class241_Sub8(((Class166_Sub1) this).aClass103_Sub3_9767,
			       this, class241_sub43, is),
	     (short) -837);
    }
    
    void method16146(int i, int i_132_, byte[][] is,
		     Class241_Sub17[] class241_sub17s, HashTable class407,
		     Class241_Sub17[] class241_sub17s_133_) {
	if (((Class166_Sub1) this).anIntArrayArrayArray9757[i][i_132_]
	    != null) {
	    Class241_Sub17[] class241_sub17s_134_
		= (((Class166_Sub1) this).aClass241_Sub17ArrayArrayArray9769[i]
		   [i_132_]);
	    int[] is_135_
		= ((Class166_Sub1) this).anIntArrayArrayArray9772[i][i_132_];
	    int[] is_136_
		= ((Class166_Sub1) this).anIntArrayArrayArray9799[i][i_132_];
	    int[] is_137_
		= ((Class166_Sub1) this).anIntArrayArrayArray9771[i][i_132_];
	    int[] is_138_
		= ((Class166_Sub1) this).anIntArrayArrayArray9757[i][i_132_];
	    int[] is_139_
		= (((Class166_Sub1) this).anIntArrayArrayArray9774 != null
		   ? ((Class166_Sub1) this).anIntArrayArrayArray9774[i][i_132_]
		   : null);
	    int[] is_140_
		= (((Class166_Sub1) this).anIntArrayArrayArray9775 != null
		   ? ((Class166_Sub1) this).anIntArrayArrayArray9775[i][i_132_]
		   : null);
	    if (is_137_ == null)
		is_137_ = is_138_;
	    float f = ((Class166_Sub1) this).aFloatArrayArray9786[i][i_132_];
	    float f_141_
		= ((Class166_Sub1) this).aFloatArrayArray9787[i][i_132_];
	    float f_142_
		= ((Class166_Sub1) this).aFloatArrayArray9788[i][i_132_];
	    float f_143_
		= ((Class166_Sub1) this).aFloatArrayArray9786[i][i_132_ + 1];
	    float f_144_
		= ((Class166_Sub1) this).aFloatArrayArray9787[i][i_132_ + 1];
	    float f_145_
		= ((Class166_Sub1) this).aFloatArrayArray9788[i][i_132_ + 1];
	    float f_146_ = (((Class166_Sub1) this).aFloatArrayArray9786[i + 1]
			    [i_132_ + 1]);
	    float f_147_ = (((Class166_Sub1) this).aFloatArrayArray9787[i + 1]
			    [i_132_ + 1]);
	    float f_148_ = (((Class166_Sub1) this).aFloatArrayArray9788[i + 1]
			    [i_132_ + 1]);
	    float f_149_
		= ((Class166_Sub1) this).aFloatArrayArray9786[i + 1][i_132_];
	    float f_150_
		= ((Class166_Sub1) this).aFloatArrayArray9787[i + 1][i_132_];
	    float f_151_
		= ((Class166_Sub1) this).aFloatArrayArray9788[i + 1][i_132_];
	    int i_152_ = is[i][i_132_] & 0xff;
	    int i_153_ = is[i][i_132_ + 1] & 0xff;
	    int i_154_ = is[i + 1][i_132_ + 1] & 0xff;
	    int i_155_ = is[i + 1][i_132_] & 0xff;
	    int i_156_ = 0;
	while_120_:
	    for (int i_157_ = 0; i_157_ < is_138_.length; i_157_++) {
		Class241_Sub17 class241_sub17 = class241_sub17s_134_[i_157_];
		for (int i_158_ = 0; i_158_ < i_156_; i_158_++) {
		    if (class241_sub17s[i_158_] == class241_sub17)
			continue while_120_;
		}
		class241_sub17s[i_156_++] = class241_sub17;
	    }
	    short[] is_159_ = (((Class166_Sub1) this).aShortArrayArray9791
				   [i_132_ * (anInt2055 * 266270313) + i]
			       = new short[is_138_.length]);
	    for (int i_160_ = 0; i_160_ < is_138_.length; i_160_++) {
		int i_161_ = (i << anInt2054 * -122333825) + is_135_[i_160_];
		int i_162_
		    = (i_132_ << anInt2054 * -122333825) + is_136_[i_160_];
		int i_163_ = i_161_ >> ((Class166_Sub1) this).anInt9760;
		int i_164_ = i_162_ >> ((Class166_Sub1) this).anInt9760;
		int i_165_ = is_138_[i_160_];
		int i_166_ = is_137_[i_160_];
		int i_167_ = is_139_ != null ? is_139_[i_160_] : 0;
		long l = ((long) i_166_ << 48 | (long) i_165_ << 32
			  | (long) (i_163_ << 16) | (long) i_164_);
		int i_168_ = is_135_[i_160_];
		int i_169_ = is_136_[i_160_];
		int i_170_ = 74;
		int i_171_ = 0;
		float f_172_ = 1.0F;
		float f_173_;
		float f_174_;
		float f_175_;
		if (i_168_ == 0 && i_169_ == 0) {
		    f_173_ = f;
		    f_174_ = f_141_;
		    f_175_ = f_142_;
		    i_170_ -= i_152_;
		} else if (i_168_ == 0 && i_169_ == anInt2053 * 2039042417) {
		    f_173_ = f_143_;
		    f_174_ = f_144_;
		    f_175_ = f_145_;
		    i_170_ -= i_153_;
		} else if (i_168_ == anInt2053 * 2039042417
			   && i_169_ == anInt2053 * 2039042417) {
		    f_173_ = f_146_;
		    f_174_ = f_147_;
		    f_175_ = f_148_;
		    i_170_ -= i_154_;
		} else if (i_168_ == anInt2053 * 2039042417 && i_169_ == 0) {
		    f_173_ = f_149_;
		    f_174_ = f_150_;
		    f_175_ = f_151_;
		    i_170_ -= i_155_;
		} else {
		    float f_176_
			= (float) i_168_ / (float) (anInt2053 * 2039042417);
		    float f_177_
			= (float) i_169_ / (float) (anInt2053 * 2039042417);
		    float f_178_ = f + (f_149_ - f) * f_176_;
		    float f_179_ = f_141_ + (f_150_ - f_141_) * f_176_;
		    float f_180_ = f_142_ + (f_151_ - f_142_) * f_176_;
		    float f_181_ = f_143_ + (f_146_ - f_143_) * f_176_;
		    float f_182_ = f_144_ + (f_147_ - f_144_) * f_176_;
		    float f_183_ = f_145_ + (f_148_ - f_145_) * f_176_;
		    f_173_ = f_178_ + (f_181_ - f_178_) * f_177_;
		    f_174_ = f_179_ + (f_182_ - f_179_) * f_177_;
		    f_175_ = f_180_ + (f_183_ - f_180_) * f_177_;
		    int i_184_ = i_152_ + ((i_155_ - i_152_) * i_168_
					   >> anInt2054 * -122333825);
		    int i_185_ = i_153_ + ((i_154_ - i_153_) * i_168_
					   >> anInt2054 * -122333825);
		    i_170_ -= i_184_ + ((i_185_ - i_184_) * i_169_
					>> anInt2054 * -122333825);
		}
		if (i_165_ != -1) {
		    int i_186_ = (i_165_ & 0x7f) * i_170_ >> 7;
		    if (i_186_ < 2)
			i_186_ = 2;
		    else if (i_186_ > 126)
			i_186_ = 126;
		    i_171_ = Class474.anIntArray6380[i_165_ & 0xff80 | i_186_];
		    if ((((Class166_Sub1) this).anInt9789 & 0x7) == 0) {
			f_172_ = ((((Class166_Sub1) this).aClass103_Sub3_9767
				   .aFloatArray9558[0]) * f_173_
				  + (((Class166_Sub1) this).aClass103_Sub3_9767
				     .aFloatArray9558[1]) * f_174_
				  + (((Class166_Sub1) this).aClass103_Sub3_9767
				     .aFloatArray9558[2]) * f_175_);
			f_172_
			    = ((((Class166_Sub1) this).aClass103_Sub3_9767
				.aFloat9566)
			       + f_172_ * (f_172_ > 0.0F
					   ? (((Class166_Sub1) this)
					      .aClass103_Sub3_9767.aFloat9609)
					   : (((Class166_Sub1) this)
					      .aClass103_Sub3_9767
					      .aFloat9568)));
		    }
		}
		Node class241 = null;
		if ((i_161_ & ((Class166_Sub1) this).anInt9761 - 1) == 0
		    && (i_162_ & ((Class166_Sub1) this).anInt9761 - 1) == 0)
		    class241 = class407.get(l);
		int i_187_;
		if (class241 == null) {
		    int i_188_;
		    if (i_166_ != i_165_) {
			int i_189_ = (i_166_ & 0x7f) * i_170_ >> 7;
			if (i_189_ < 2)
			    i_189_ = 2;
			else if (i_189_ > 126)
			    i_189_ = 126;
			i_188_ = (Class474.anIntArray6380
				  [i_166_ & 0xff80 | i_189_]);
			if ((((Class166_Sub1) this).anInt9789 & 0x7) == 0) {
			    float f_190_
				= ((((Class166_Sub1) this).aClass103_Sub3_9767
				    .aFloatArray9558[0]) * f_173_
				   + ((((Class166_Sub1) this)
				       .aClass103_Sub3_9767.aFloatArray9558[1])
				      * f_174_)
				   + ((((Class166_Sub1) this)
				       .aClass103_Sub3_9767.aFloatArray9558[2])
				      * f_175_));
			    f_190_ = ((((Class166_Sub1) this)
				       .aClass103_Sub3_9767.aFloat9566)
				      + f_172_ * (f_172_ > 0.0F
						  ? (((Class166_Sub1) this)
						     .aClass103_Sub3_9767
						     .aFloat9609)
						  : (((Class166_Sub1) this)
						     .aClass103_Sub3_9767
						     .aFloat9568)));
			    int i_191_ = i_188_ >> 16 & 0xff;
			    int i_192_ = i_188_ >> 8 & 0xff;
			    int i_193_ = i_188_ & 0xff;
			    i_191_ *= f_190_;
			    if (i_191_ < 0)
				i_191_ = 0;
			    else if (i_191_ > 255)
				i_191_ = 255;
			    i_192_ *= f_190_;
			    if (i_192_ < 0)
				i_192_ = 0;
			    else if (i_192_ > 255)
				i_192_ = 255;
			    i_193_ *= f_190_;
			    if (i_193_ < 0)
				i_193_ = 0;
			    else if (i_193_ > 255)
				i_193_ = 255;
			    i_188_ = i_191_ << 16 | i_192_ << 8 | i_193_;
			}
		    } else
			i_188_ = i_171_;
		    Unsafe unsafe = (((Class166_Sub1) this).aClass103_Sub3_9767
				     .anUnsafe9493);
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) i_161_);
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) (method3574(i_161_, i_162_,
							-1701033350)
					     + i_167_));
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) i_162_);
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) i_161_);
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) i_162_);
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    if (((Class166_Sub1) this).anIntArrayArrayArray9775
			!= null) {
			unsafe.putFloat(((Class166_Sub1) this).aLong9793,
					(is_140_ != null
					 ? (float) (is_140_[i_160_] - 1)
					 : 0.0F));
			((Class166_Sub1) this).aLong9793 += 4L;
		    }
		    if ((((Class166_Sub1) this).anInt9789 & 0x7) != 0) {
			unsafe.putFloat(((Class166_Sub1) this).aLong9793,
					f_173_);
			((Class166_Sub1) this).aLong9793 += 4L;
			unsafe.putFloat(((Class166_Sub1) this).aLong9793,
					f_174_);
			((Class166_Sub1) this).aLong9793 += 4L;
			unsafe.putFloat(((Class166_Sub1) this).aLong9793,
					f_175_);
			((Class166_Sub1) this).aLong9793 += 4L;
		    }
		    if (((Class103_Sub3)
			 ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9633
			== 0) {
			int i_194_ = i_188_ & ~0xff00ff;
			i_194_ |= (i_188_ & 0xff0000) >> 16;
			i_194_ |= (i_188_ & 0xff) << 16;
			i_188_ = i_194_;
		    }
		    unsafe.putInt(((Class166_Sub1) this).aLong9792,
				  ~0xffffff | i_188_);
		    ((Class166_Sub1) this).aLong9792 += 4L;
		    i_187_ = ((Class166_Sub1) this).anInt9764++;
		    is_159_[i_160_] = (short) i_187_;
		    if (i_165_ != -1)
			class241_sub17s_133_[i_187_]
			    = class241_sub17s_134_[i_160_];
		    class407.put(new Class241_Sub7(is_159_[i_160_]), l);
		} else {
		    is_159_[i_160_] = ((Class241_Sub7) class241).aShort8826;
		    i_187_ = is_159_[i_160_] & 0xffff;
		    if (i_165_ != -1
			&& ((class241_sub17s_134_[i_160_].hashCode
			     * 4356572401218184725L)
			    < (class241_sub17s_133_[i_187_].hashCode
			       * 4356572401218184725L)))
			class241_sub17s_133_[i_187_]
			    = class241_sub17s_134_[i_160_];
		}
		for (int i_195_ = 0; i_195_ < i_156_; i_195_++)
		    class241_sub17s[i_195_].method15022(i_187_, i_171_, i_170_,
							f_172_);
		((Class166_Sub1) this).anInt9794++;
	    }
	}
    }
    
    public void method3542(int i, int i_196_, int i_197_) {
	i = Math.min(((Class166_Sub1) this).aByteArrayArray9785.length - 1,
		     Math.max(0, i));
	i_196_ = Math.min((((Class166_Sub1) this).aByteArrayArray9785[i].length
			   - 1),
			  Math.max(0, i_196_));
	if ((((Class166_Sub1) this).aByteArrayArray9785[i][i_196_] & 0xff)
	    < i_197_)
	    ((Class166_Sub1) this).aByteArrayArray9785[i][i_196_]
		= (byte) i_197_;
    }
    
    public void method3563(int i, int i_198_, int[] is, int[] is_199_,
			   int[] is_200_, int[] is_201_, int[] is_202_,
			   int[] is_203_, int[] is_204_, int[] is_205_,
			   int[] is_206_, int[] is_207_, int[] is_208_,
			   Class86 class86, boolean bool) {
	int i_209_ = is_205_.length;
	int[] is_210_ = new int[i_209_ * 3];
	int[] is_211_ = new int[i_209_ * 3];
	int[] is_212_ = new int[i_209_ * 3];
	int[] is_213_ = new int[i_209_ * 3];
	int[] is_214_ = new int[i_209_ * 3];
	int[] is_215_ = new int[i_209_ * 3];
	int[] is_216_ = is_199_ != null ? new int[i_209_ * 3] : null;
	int[] is_217_ = is_201_ != null ? new int[i_209_ * 3] : null;
	int i_218_ = 0;
	for (int i_219_ = 0; i_219_ < i_209_; i_219_++) {
	    int i_220_ = is_202_[i_219_];
	    int i_221_ = is_203_[i_219_];
	    int i_222_ = is_204_[i_219_];
	    is_210_[i_218_] = is[i_220_];
	    is_211_[i_218_] = is_200_[i_220_];
	    is_212_[i_218_] = is_205_[i_219_];
	    is_214_[i_218_] = is_207_[i_219_];
	    is_215_[i_218_] = is_208_[i_219_];
	    is_213_[i_218_]
		= is_206_ != null ? is_206_[i_219_] : is_205_[i_219_];
	    if (is_199_ != null)
		is_216_[i_218_] = is_199_[i_220_];
	    if (is_201_ != null)
		is_217_[i_218_] = is_201_[i_220_];
	    i_218_++;
	    is_210_[i_218_] = is[i_221_];
	    is_211_[i_218_] = is_200_[i_221_];
	    is_212_[i_218_] = is_205_[i_219_];
	    is_214_[i_218_] = is_207_[i_219_];
	    is_215_[i_218_] = is_208_[i_219_];
	    is_213_[i_218_]
		= is_206_ != null ? is_206_[i_219_] : is_205_[i_219_];
	    if (is_199_ != null)
		is_216_[i_218_] = is_199_[i_221_];
	    if (is_201_ != null)
		is_217_[i_218_] = is_201_[i_221_];
	    i_218_++;
	    is_210_[i_218_] = is[i_222_];
	    is_211_[i_218_] = is_200_[i_222_];
	    is_212_[i_218_] = is_205_[i_219_];
	    is_214_[i_218_] = is_207_[i_219_];
	    is_215_[i_218_] = is_208_[i_219_];
	    is_213_[i_218_]
		= is_206_ != null ? is_206_[i_219_] : is_205_[i_219_];
	    if (is_199_ != null)
		is_216_[i_218_] = is_199_[i_222_];
	    if (is_201_ != null)
		is_217_[i_218_] = is_201_[i_222_];
	    i_218_++;
	}
	method3544(i, i_198_, is_210_, is_216_, is_211_, is_217_, is_212_,
		   is_213_, is_214_, is_215_, class86, bool);
    }
    
    public void method3576(int i, int i_223_, int i_224_, int i_225_,
			   int i_226_, int i_227_, int i_228_,
			   boolean[][] bools) {
	if (((Class166_Sub1) this).anInt9783 > 0) {
	    Interface33 interface33
		= ((Class166_Sub1) this).aClass103_Sub3_9767
		      .method15630(((Class166_Sub1) this).anInt9794);
	    int i_229_ = 0;
	    int i_230_ = 32767;
	    int i_231_ = -32768;
	    ByteBuffer bytebuffer
		= ((Class166_Sub1) this).aClass103_Sub3_9767.aByteBuffer9490;
	    bytebuffer.clear();
	    for (int i_232_ = i_226_; i_232_ < i_228_; i_232_++) {
		int i_233_ = i_232_ * (anInt2055 * 266270313) + i_225_;
		for (int i_234_ = i_225_; i_234_ < i_227_; i_234_++) {
		    if (bools[i_234_ - i_225_][i_232_ - i_226_]) {
			short[] is = (((Class166_Sub1) this)
				      .aShortArrayArray9791[i_233_]);
			if (is != null) {
			    for (int i_235_ = 0; i_235_ < is.length;
				 i_235_++) {
				int i_236_ = is[i_235_] & 0xffff;
				if (i_236_ > i_231_)
				    i_231_ = i_236_;
				if (i_236_ < i_230_)
				    i_230_ = i_236_;
				bytebuffer.putShort((short) i_236_);
				i_229_++;
			    }
			}
		    }
		    i_233_++;
		}
	    }
	    interface33.method268(0, bytebuffer.position(),
				  (((Class166_Sub1) this).aClass103_Sub3_9767
				   .aLong9491));
	    if (i_229_ > 0) {
		((Class166_Sub1) this).aClass103_Sub3_9767.method15728();
		Class361 class361 = (((Class103_Sub3) (((Class166_Sub1) this)
						       .aClass103_Sub3_9767))
				     .aClass361_9540);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15955(0, ((Class166_Sub1) this).anInterface40_9765);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15955(1, ((Class166_Sub1) this).anInterface40_9781);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15716(((Class166_Sub1) this).aClass366_9797);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15718(interface33);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method2512(Class266.aClass266_4342);
		float f = (float) ((Class166_Sub1) this)
				      .aClass103_Sub3_9767.method2237
				      ((byte) 4).method2655();
		float f_237_ = (float) ((Class166_Sub1) this)
					   .aClass103_Sub3_9767.method2237
					   ((byte) 4).method2654();
		Class266 class266 = new Class266();
		Class266 class266_238_ = new Class266();
		class266.method5122(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F,
				    1.0F, 0.0F);
		class266_238_.method5120
		    ((float) i_224_ / (256.0F
				       * (float) (anInt2053 * 2039042417)),
		     (float) -i_224_ / (256.0F
					* (float) (anInt2053 * 2039042417)),
		     1.0F / (((Class166_Sub1) this).aFloat9763
			     - ((Class166_Sub1) this).aFloat9779));
		class266_238_.method5133
		    ((float) i - (float) (i_225_ * i_224_) / 256.0F,
		     (float) i_223_ + (float) (i_228_ * i_224_) / 256.0F,
		     (-((Class166_Sub1) this).aFloat9779
		      / (((Class166_Sub1) this).aFloat9763
			 - ((Class166_Sub1) this).aFloat9779)));
		class266_238_.method5130(2.0F / f, 2.0F / f_237_, 1.0F);
		class266_238_.method5133(-1.0F, -1.0F, 0.0F);
		((Class103_Sub3) ((Class166_Sub1) this).aClass103_Sub3_9767)
		    .aClass266_9588.method5135(class266, class266_238_);
		((Class166_Sub1) this).aClass103_Sub3_9767.aClass268_9511
		    .method5203
		    (((Class103_Sub3) (((Class166_Sub1) this)
				       .aClass103_Sub3_9767)).aClass266_9588);
		((Class166_Sub1) this).aClass103_Sub3_9767.method2309
		    (((Class166_Sub1) this).aClass103_Sub3_9767
		     .aClass268_9511);
		class361.method6494(Class268.aClass268_4354);
		class361.aClass285_5516.method5548(0.0F, 0.0F, 0.0F, 0.0F);
		class361.aClass287_5507.method5568(0.0F, 0.0F, 0.0F);
		class361.aClass285_5514.method5548(0.0F, 0.0F, 0.0F, 0.0F);
		class361.aClass287_5515.method5568(0.0F, 0.0F, 0.0F);
		class361.anInterface41_5525
		    = (((Class166_Sub1) this).aClass103_Sub3_9767
		       .anInterface41_9584);
		class361.aClass268_5510.method5198();
		class361.anInt5522 = i_230_;
		class361.anInt5523 = i_231_ - i_230_ + 1;
		class361.anInt5506 = 0;
		class361.anInt5517 = i_229_ / 3;
		if (((Class166_Sub1) this).aClass103_Sub3_9767.aBool9552) {
		    ((Class166_Sub1) this).aClass103_Sub3_9767
			.method2308(false);
		    class361.method6495(false);
		    ((Class166_Sub1) this).aClass103_Sub3_9767
			.method2308(true);
		} else
		    class361.method6495(false);
	    }
	}
    }
    
    public void method3567(int i, int i_239_, int[] is, int[] is_240_,
			   int[] is_241_, int[] is_242_, int[] is_243_,
			   int[] is_244_, int[] is_245_, int[] is_246_,
			   int[] is_247_, int[] is_248_, int[] is_249_,
			   Class86 class86, boolean bool) {
	int i_250_ = is_246_.length;
	int[] is_251_ = new int[i_250_ * 3];
	int[] is_252_ = new int[i_250_ * 3];
	int[] is_253_ = new int[i_250_ * 3];
	int[] is_254_ = new int[i_250_ * 3];
	int[] is_255_ = new int[i_250_ * 3];
	int[] is_256_ = new int[i_250_ * 3];
	int[] is_257_ = is_240_ != null ? new int[i_250_ * 3] : null;
	int[] is_258_ = is_242_ != null ? new int[i_250_ * 3] : null;
	int i_259_ = 0;
	for (int i_260_ = 0; i_260_ < i_250_; i_260_++) {
	    int i_261_ = is_243_[i_260_];
	    int i_262_ = is_244_[i_260_];
	    int i_263_ = is_245_[i_260_];
	    is_251_[i_259_] = is[i_261_];
	    is_252_[i_259_] = is_241_[i_261_];
	    is_253_[i_259_] = is_246_[i_260_];
	    is_255_[i_259_] = is_248_[i_260_];
	    is_256_[i_259_] = is_249_[i_260_];
	    is_254_[i_259_]
		= is_247_ != null ? is_247_[i_260_] : is_246_[i_260_];
	    if (is_240_ != null)
		is_257_[i_259_] = is_240_[i_261_];
	    if (is_242_ != null)
		is_258_[i_259_] = is_242_[i_261_];
	    i_259_++;
	    is_251_[i_259_] = is[i_262_];
	    is_252_[i_259_] = is_241_[i_262_];
	    is_253_[i_259_] = is_246_[i_260_];
	    is_255_[i_259_] = is_248_[i_260_];
	    is_256_[i_259_] = is_249_[i_260_];
	    is_254_[i_259_]
		= is_247_ != null ? is_247_[i_260_] : is_246_[i_260_];
	    if (is_240_ != null)
		is_257_[i_259_] = is_240_[i_262_];
	    if (is_242_ != null)
		is_258_[i_259_] = is_242_[i_262_];
	    i_259_++;
	    is_251_[i_259_] = is[i_263_];
	    is_252_[i_259_] = is_241_[i_263_];
	    is_253_[i_259_] = is_246_[i_260_];
	    is_255_[i_259_] = is_248_[i_260_];
	    is_256_[i_259_] = is_249_[i_260_];
	    is_254_[i_259_]
		= is_247_ != null ? is_247_[i_260_] : is_246_[i_260_];
	    if (is_240_ != null)
		is_257_[i_259_] = is_240_[i_263_];
	    if (is_242_ != null)
		is_258_[i_259_] = is_242_[i_263_];
	    i_259_++;
	}
	method3544(i, i_239_, is_251_, is_257_, is_252_, is_258_, is_253_,
		   is_254_, is_255_, is_256_, class86, bool);
    }
    
    public void method3549(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_264_, int i_265_, int i_266_, boolean bool) {
	if (((Class166_Sub1) this).aClass364_9780 != null
	    && class241_sub39_sub17 != null) {
	    int i_267_
		= (i - (i_264_ * (((Class103_Sub3)
				   ((Class166_Sub1) this).aClass103_Sub3_9767)
				  .anInt9520)
			>> 8)
		   >> ((Class103_Sub3)
		       ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9489);
	    int i_268_
		= (i_265_ - (i_264_ * (((Class103_Sub3) (((Class166_Sub1) this)
							 .aClass103_Sub3_9767))
				       .anInt9627)
			     >> 8)
		   >> ((Class103_Sub3)
		       ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9489);
	    ((Class166_Sub1) this).aClass364_9780
		.method6535(class241_sub39_sub17, i_267_, i_268_);
	}
    }
    
    public void method3560(int i, int i_269_, int[] is, int[] is_270_,
			   int[] is_271_, int[] is_272_, int[] is_273_,
			   int[] is_274_, int[] is_275_, int[] is_276_,
			   int[] is_277_, int[] is_278_, int[] is_279_,
			   Class86 class86, boolean bool) {
	int i_280_ = is_276_.length;
	int[] is_281_ = new int[i_280_ * 3];
	int[] is_282_ = new int[i_280_ * 3];
	int[] is_283_ = new int[i_280_ * 3];
	int[] is_284_ = new int[i_280_ * 3];
	int[] is_285_ = new int[i_280_ * 3];
	int[] is_286_ = new int[i_280_ * 3];
	int[] is_287_ = is_270_ != null ? new int[i_280_ * 3] : null;
	int[] is_288_ = is_272_ != null ? new int[i_280_ * 3] : null;
	int i_289_ = 0;
	for (int i_290_ = 0; i_290_ < i_280_; i_290_++) {
	    int i_291_ = is_273_[i_290_];
	    int i_292_ = is_274_[i_290_];
	    int i_293_ = is_275_[i_290_];
	    is_281_[i_289_] = is[i_291_];
	    is_282_[i_289_] = is_271_[i_291_];
	    is_283_[i_289_] = is_276_[i_290_];
	    is_285_[i_289_] = is_278_[i_290_];
	    is_286_[i_289_] = is_279_[i_290_];
	    is_284_[i_289_]
		= is_277_ != null ? is_277_[i_290_] : is_276_[i_290_];
	    if (is_270_ != null)
		is_287_[i_289_] = is_270_[i_291_];
	    if (is_272_ != null)
		is_288_[i_289_] = is_272_[i_291_];
	    i_289_++;
	    is_281_[i_289_] = is[i_292_];
	    is_282_[i_289_] = is_271_[i_292_];
	    is_283_[i_289_] = is_276_[i_290_];
	    is_285_[i_289_] = is_278_[i_290_];
	    is_286_[i_289_] = is_279_[i_290_];
	    is_284_[i_289_]
		= is_277_ != null ? is_277_[i_290_] : is_276_[i_290_];
	    if (is_270_ != null)
		is_287_[i_289_] = is_270_[i_292_];
	    if (is_272_ != null)
		is_288_[i_289_] = is_272_[i_292_];
	    i_289_++;
	    is_281_[i_289_] = is[i_293_];
	    is_282_[i_289_] = is_271_[i_293_];
	    is_283_[i_289_] = is_276_[i_290_];
	    is_285_[i_289_] = is_278_[i_290_];
	    is_286_[i_289_] = is_279_[i_290_];
	    is_284_[i_289_]
		= is_277_ != null ? is_277_[i_290_] : is_276_[i_290_];
	    if (is_270_ != null)
		is_287_[i_289_] = is_270_[i_293_];
	    if (is_272_ != null)
		is_288_[i_289_] = is_272_[i_293_];
	    i_289_++;
	}
	method3544(i, i_269_, is_281_, is_287_, is_282_, is_288_, is_283_,
		   is_284_, is_285_, is_286_, class86, bool);
    }
    
    public void method3564() {
	if (((Class166_Sub1) this).anInt9783 <= 0) {
	    ((Class166_Sub1) this).aClass364_9780 = null;
	    method16144();
	} else {
	    byte[][] is = (new byte[anInt2055 * 266270313 + 1]
			   [anInt2052 * -14610189 + 1]);
	    for (int i = 1; i < anInt2055 * 266270313; i++) {
		for (int i_294_ = 1; i_294_ < anInt2052 * -14610189; i_294_++)
		    is[i][i_294_]
			= (byte) (((((Class166_Sub1) this).aByteArrayArray9785
				    [i - 1][i_294_])
				   >> 2)
				  + ((((Class166_Sub1) this)
				      .aByteArrayArray9785[i + 1][i_294_])
				     >> 3)
				  + ((((Class166_Sub1) this)
				      .aByteArrayArray9785[i][i_294_ - 1])
				     >> 2)
				  + ((((Class166_Sub1) this)
				      .aByteArrayArray9785[i][i_294_ + 1])
				     >> 3)
				  + ((((Class166_Sub1) this)
				      .aByteArrayArray9785[i][i_294_])
				     >> 1));
	    }
	    ((Class166_Sub1) this).aClass241Array9790
		= new Node[((Class166_Sub1) this).aClass407_9766
				   .method7306(1427508643)];
	    ((Class166_Sub1) this).aClass407_9766.method7305
		(((Class166_Sub1) this).aClass241Array9790, -2144453678);
	    for (int i = 0;
		 i < ((Class166_Sub1) this).aClass241Array9790.length; i++)
		((Class241_Sub17) ((Class166_Sub1) this).aClass241Array9790[i])
		    .method15020(((Class166_Sub1) this).anInt9783);
	    ((Class166_Sub1) this).anInt9773 = 20;
	    if (((Class166_Sub1) this).anIntArrayArrayArray9775 != null)
		((Class166_Sub1) this).anInt9773 += 4;
	    if ((((Class166_Sub1) this).anInt9789 & 0x7) != 0)
		((Class166_Sub1) this).anInt9773 += 12;
	    ((Class166_Sub1) this).aLong9758
		= (((Class166_Sub1) this).aClass103_Sub3_9767.anUnsafe9493
		       .allocateMemory
		   ((long) (((Class166_Sub1) this).anInt9783 * 4
			    + (((Class166_Sub1) this).anInt9783
			       * ((Class166_Sub1) this).anInt9773))));
	    ((Class166_Sub1) this).aLong9792
		= ((Class166_Sub1) this).aLong9758;
	    ((Class166_Sub1) this).aLong9793
		= (((Class166_Sub1) this).aLong9758
		   + (long) (((Class166_Sub1) this).anInt9783 * 4));
	    Class241_Sub17[] class241_sub17s
		= new Class241_Sub17[((Class166_Sub1) this).anInt9783];
	    int i = RSAKeys.method860(((Class166_Sub1) this).anInt9783 / 4,
				      -1959341094);
	    if (i < 1)
		i = 1;
	    HashTable class407 = new HashTable(i);
	    Class241_Sub17[] class241_sub17s_295_
		= new Class241_Sub17[((Class166_Sub1) this).anInt9784];
	    for (int i_296_ = 0; i_296_ < anInt2055 * 266270313; i_296_++) {
		for (int i_297_ = 0; i_297_ < anInt2052 * -14610189; i_297_++)
		    method16146(i_296_, i_297_, is, class241_sub17s_295_,
				class407, class241_sub17s);
	    }
	    for (int i_298_ = 0; i_298_ < ((Class166_Sub1) this).anInt9764;
		 i_298_++) {
		Class241_Sub17 class241_sub17 = class241_sub17s[i_298_];
		if (class241_sub17 != null)
		    class241_sub17.method15021(i_298_);
	    }
	    for (int i_299_ = 0; i_299_ < anInt2055 * 266270313; i_299_++) {
		for (int i_300_ = 0; i_300_ < anInt2052 * -14610189;
		     i_300_++) {
		    short[] is_301_
			= (((Class166_Sub1) this).aShortArrayArray9791
			   [i_300_ * (anInt2055 * 266270313) + i_299_]);
		    if (is_301_ != null) {
			int i_302_ = 0;
			int i_303_ = 0;
			while (i_303_ < is_301_.length) {
			    int i_304_ = is_301_[i_303_++] & 0xffff;
			    int i_305_ = is_301_[i_303_++] & 0xffff;
			    int i_306_ = is_301_[i_303_++] & 0xffff;
			    Class241_Sub17 class241_sub17
				= class241_sub17s[i_304_];
			    Class241_Sub17 class241_sub17_307_
				= class241_sub17s[i_305_];
			    Class241_Sub17 class241_sub17_308_
				= class241_sub17s[i_306_];
			    Class241_Sub17 class241_sub17_309_ = null;
			    if (class241_sub17 != null) {
				class241_sub17.method15033(i_299_, i_300_,
							   i_302_);
				class241_sub17_309_ = class241_sub17;
			    }
			    if (class241_sub17_307_ != null) {
				class241_sub17_307_.method15033(i_299_, i_300_,
								i_302_);
				if (class241_sub17_309_ == null
				    || ((class241_sub17_307_.hashCode
					 * 4356572401218184725L)
					< (class241_sub17_309_.hashCode
					   * 4356572401218184725L)))
				    class241_sub17_309_ = class241_sub17_307_;
			    }
			    if (class241_sub17_308_ != null) {
				class241_sub17_308_.method15033(i_299_, i_300_,
								i_302_);
				if (class241_sub17_309_ == null
				    || ((class241_sub17_308_.hashCode
					 * 4356572401218184725L)
					< (class241_sub17_309_.hashCode
					   * 4356572401218184725L)))
				    class241_sub17_309_ = class241_sub17_308_;
			    }
			    if (class241_sub17_309_ != null) {
				if (class241_sub17 != null)
				    class241_sub17_309_.method15021(i_304_);
				if (class241_sub17_307_ != null)
				    class241_sub17_309_.method15021(i_305_);
				if (class241_sub17_308_ != null)
				    class241_sub17_309_.method15021(i_306_);
				class241_sub17_309_.method15033(i_299_, i_300_,
								i_302_);
			    }
			    i_302_++;
			}
		    }
		}
	    }
	    ((Class166_Sub1) this).anInt9782 = 0;
	    for (int i_310_ = 0;
		 i_310_ < ((Class166_Sub1) this).aClass241Array9790.length;
		 i_310_++) {
		Class241_Sub17 class241_sub17
		    = ((Class241_Sub17)
		       ((Class166_Sub1) this).aClass241Array9790[i_310_]);
		if (((Class241_Sub17) class241_sub17).anInt8991 > 0)
		    ((Class166_Sub1) this).aClass241Array9790
			[((Class166_Sub1) this).anInt9782++]
			= class241_sub17;
	    }
	    ((Class166_Sub1) this).aClass241Array9778
		= new Node[((Class166_Sub1) this).anInt9782];
	    long[] ls = new long[((Class166_Sub1) this).anInt9782];
	    for (int i_311_ = 0; i_311_ < ((Class166_Sub1) this).anInt9782;
		 i_311_++) {
		Class241_Sub17 class241_sub17
		    = ((Class241_Sub17)
		       ((Class166_Sub1) this).aClass241Array9790[i_311_]);
		ls[i_311_] = class241_sub17.hashCode * 4356572401218184725L;
		((Class166_Sub1) this).aClass241Array9778[i_311_]
		    = class241_sub17;
	    }
	    Class570.method12515(ls, ((Class166_Sub1) this).aClass241Array9778,
				 1713537755);
	    method16143();
	}
    }
    
    void method16147(Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1,
		     int i, int i_312_) {
	int[] is = ((Class166_Sub1) this).anIntArrayArrayArray9772[i][i_312_];
	int[] is_313_
	    = ((Class166_Sub1) this).anIntArrayArrayArray9799[i][i_312_];
	int i_314_ = is.length;
	if (((Class166_Sub1) this).anIntArray9796.length < i_314_) {
	    ((Class166_Sub1) this).anIntArray9796 = new int[i_314_];
	    ((Class166_Sub1) this).anIntArray9795 = new int[i_314_];
	}
	for (int i_315_ = 0; i_315_ < i_314_; i_315_++) {
	    ((Class166_Sub1) this).anIntArray9796[i_315_]
		= is[i_315_] >> (((Class103_Sub3)
				  ((Class166_Sub1) this).aClass103_Sub3_9767)
				 .anInt9489);
	    ((Class166_Sub1) this).anIntArray9795[i_315_]
		= is_313_[i_315_] >> (((Class103_Sub3) (((Class166_Sub1) this)
							.aClass103_Sub3_9767))
				      .anInt9489);
	}
	int i_316_ = 0;
	while (i_316_ < i_314_) {
	    int i_317_ = ((Class166_Sub1) this).anIntArray9796[i_316_];
	    int i_318_ = ((Class166_Sub1) this).anIntArray9795[i_316_++];
	    int i_319_ = ((Class166_Sub1) this).anIntArray9796[i_316_];
	    int i_320_ = ((Class166_Sub1) this).anIntArray9795[i_316_++];
	    int i_321_ = ((Class166_Sub1) this).anIntArray9796[i_316_];
	    int i_322_ = ((Class166_Sub1) this).anIntArray9795[i_316_++];
	    if (((i_317_ - i_319_) * (i_320_ - i_322_)
		 - (i_320_ - i_318_) * (i_321_ - i_319_))
		> 0)
		class241_sub39_sub17_sub1.method17676(i_318_, i_320_, i_322_,
						      i_317_, i_319_, i_321_);
	}
    }
    
    public void method3575(Class241_Sub43 class241_sub43, int[] is) {
	((Class166_Sub1) this).aClass429_9777.addNode
	    (new Class241_Sub8(((Class166_Sub1) this).aClass103_Sub3_9767,
			       this, class241_sub43, is),
	     (short) -24184);
    }
    
    public void method3566(int i, int i_323_, int i_324_, int i_325_,
			   int i_326_, int i_327_, int i_328_,
			   boolean[][] bools) {
	if (((Class166_Sub1) this).anInt9783 > 0) {
	    Interface33 interface33
		= ((Class166_Sub1) this).aClass103_Sub3_9767
		      .method15630(((Class166_Sub1) this).anInt9794);
	    int i_329_ = 0;
	    int i_330_ = 32767;
	    int i_331_ = -32768;
	    ByteBuffer bytebuffer
		= ((Class166_Sub1) this).aClass103_Sub3_9767.aByteBuffer9490;
	    bytebuffer.clear();
	    for (int i_332_ = i_326_; i_332_ < i_328_; i_332_++) {
		int i_333_ = i_332_ * (anInt2055 * 266270313) + i_325_;
		for (int i_334_ = i_325_; i_334_ < i_327_; i_334_++) {
		    if (bools[i_334_ - i_325_][i_332_ - i_326_]) {
			short[] is = (((Class166_Sub1) this)
				      .aShortArrayArray9791[i_333_]);
			if (is != null) {
			    for (int i_335_ = 0; i_335_ < is.length;
				 i_335_++) {
				int i_336_ = is[i_335_] & 0xffff;
				if (i_336_ > i_331_)
				    i_331_ = i_336_;
				if (i_336_ < i_330_)
				    i_330_ = i_336_;
				bytebuffer.putShort((short) i_336_);
				i_329_++;
			    }
			}
		    }
		    i_333_++;
		}
	    }
	    interface33.method268(0, bytebuffer.position(),
				  (((Class166_Sub1) this).aClass103_Sub3_9767
				   .aLong9491));
	    if (i_329_ > 0) {
		((Class166_Sub1) this).aClass103_Sub3_9767.method15728();
		Class361 class361 = (((Class103_Sub3) (((Class166_Sub1) this)
						       .aClass103_Sub3_9767))
				     .aClass361_9540);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15955(0, ((Class166_Sub1) this).anInterface40_9765);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15955(1, ((Class166_Sub1) this).anInterface40_9781);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15716(((Class166_Sub1) this).aClass366_9797);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15718(interface33);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method2512(Class266.aClass266_4342);
		float f = (float) ((Class166_Sub1) this)
				      .aClass103_Sub3_9767.method2237
				      ((byte) 4).method2655();
		float f_337_ = (float) ((Class166_Sub1) this)
					   .aClass103_Sub3_9767.method2237
					   ((byte) 4).method2654();
		Class266 class266 = new Class266();
		Class266 class266_338_ = new Class266();
		class266.method5122(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F,
				    1.0F, 0.0F);
		class266_338_.method5120
		    ((float) i_324_ / (256.0F
				       * (float) (anInt2053 * 2039042417)),
		     (float) -i_324_ / (256.0F
					* (float) (anInt2053 * 2039042417)),
		     1.0F / (((Class166_Sub1) this).aFloat9763
			     - ((Class166_Sub1) this).aFloat9779));
		class266_338_.method5133
		    ((float) i - (float) (i_325_ * i_324_) / 256.0F,
		     (float) i_323_ + (float) (i_328_ * i_324_) / 256.0F,
		     (-((Class166_Sub1) this).aFloat9779
		      / (((Class166_Sub1) this).aFloat9763
			 - ((Class166_Sub1) this).aFloat9779)));
		class266_338_.method5130(2.0F / f, 2.0F / f_337_, 1.0F);
		class266_338_.method5133(-1.0F, -1.0F, 0.0F);
		((Class103_Sub3) ((Class166_Sub1) this).aClass103_Sub3_9767)
		    .aClass266_9588.method5135(class266, class266_338_);
		((Class166_Sub1) this).aClass103_Sub3_9767.aClass268_9511
		    .method5203
		    (((Class103_Sub3) (((Class166_Sub1) this)
				       .aClass103_Sub3_9767)).aClass266_9588);
		((Class166_Sub1) this).aClass103_Sub3_9767.method2309
		    (((Class166_Sub1) this).aClass103_Sub3_9767
		     .aClass268_9511);
		class361.method6494(Class268.aClass268_4354);
		class361.aClass285_5516.method5548(0.0F, 0.0F, 0.0F, 0.0F);
		class361.aClass287_5507.method5568(0.0F, 0.0F, 0.0F);
		class361.aClass285_5514.method5548(0.0F, 0.0F, 0.0F, 0.0F);
		class361.aClass287_5515.method5568(0.0F, 0.0F, 0.0F);
		class361.anInterface41_5525
		    = (((Class166_Sub1) this).aClass103_Sub3_9767
		       .anInterface41_9584);
		class361.aClass268_5510.method5198();
		class361.anInt5522 = i_330_;
		class361.anInt5523 = i_331_ - i_330_ + 1;
		class361.anInt5506 = 0;
		class361.anInt5517 = i_329_ / 3;
		if (((Class166_Sub1) this).aClass103_Sub3_9767.aBool9552) {
		    ((Class166_Sub1) this).aClass103_Sub3_9767
			.method2308(false);
		    class361.method6495(false);
		    ((Class166_Sub1) this).aClass103_Sub3_9767
			.method2308(true);
		} else
		    class361.method6495(false);
	    }
	}
    }
    
    Class166_Sub1(Class103_Sub3 class103_sub3, int i, int i_339_, int i_340_,
		  int i_341_, int[][] is, int[][] is_342_, int i_343_) {
	super(i_340_, i_341_, i_343_, is);
	((Class166_Sub1) this).aFloat9763 = -3.4028235E38F;
	((Class166_Sub1) this).aClass429_9777 = new NodeCollection();
	((Class166_Sub1) this).anIntArray9796 = new int[1];
	((Class166_Sub1) this).anIntArray9795 = new int[1];
	((Class166_Sub1) this).anIntArray9768 = new int[1];
	((Class166_Sub1) this).aClass103_Sub3_9767 = class103_sub3;
	((Class166_Sub1) this).anInt9760 = anInt2054 * -122333825 - 2;
	((Class166_Sub1) this).anInt9761
	    = 1 << ((Class166_Sub1) this).anInt9760;
	((Class166_Sub1) this).anInt9762 = i;
	((Class166_Sub1) this).anInt9789 = i_339_;
	((Class166_Sub1) this).anIntArrayArrayArray9774
	    = new int[i_340_][i_341_][];
	((Class166_Sub1) this).aClass241_Sub17ArrayArrayArray9769
	    = new Class241_Sub17[i_340_][i_341_][];
	((Class166_Sub1) this).anIntArrayArrayArray9772
	    = new int[i_340_][i_341_][];
	((Class166_Sub1) this).anIntArrayArrayArray9799
	    = new int[i_340_][i_341_][];
	((Class166_Sub1) this).anIntArrayArrayArray9757
	    = new int[i_340_][i_341_][];
	((Class166_Sub1) this).anIntArrayArrayArray9771
	    = new int[i_340_][i_341_][];
	((Class166_Sub1) this).aShortArrayArray9791
	    = new short[i_340_ * i_341_][];
	((Class166_Sub1) this).aByteArrayArray9776 = new byte[i_340_][i_341_];
	((Class166_Sub1) this).aByteArrayArray9785
	    = new byte[i_340_ + 1][i_341_ + 1];
	((Class166_Sub1) this).aFloatArrayArray9786
	    = new float[anInt2055 * 266270313 + 1][anInt2052 * -14610189 + 1];
	((Class166_Sub1) this).aFloatArrayArray9787
	    = new float[anInt2055 * 266270313 + 1][anInt2052 * -14610189 + 1];
	((Class166_Sub1) this).aFloatArrayArray9788
	    = new float[anInt2055 * 266270313 + 1][anInt2052 * -14610189 + 1];
	for (int i_344_ = 0; i_344_ <= anInt2052 * -14610189; i_344_++) {
	    for (int i_345_ = 0; i_345_ <= anInt2055 * 266270313; i_345_++) {
		int i_346_ = anIntArrayArray2051[i_345_][i_344_];
		if ((float) i_346_ < ((Class166_Sub1) this).aFloat9779)
		    ((Class166_Sub1) this).aFloat9779 = (float) i_346_;
		if ((float) i_346_ > ((Class166_Sub1) this).aFloat9763)
		    ((Class166_Sub1) this).aFloat9763 = (float) i_346_;
		if (i_345_ > 0 && i_344_ > 0 && i_345_ < anInt2055 * 266270313
		    && i_344_ < anInt2052 * -14610189) {
		    int i_347_ = (is_342_[i_345_ + 1][i_344_]
				  - is_342_[i_345_ - 1][i_344_]);
		    int i_348_ = (is_342_[i_345_][i_344_ + 1]
				  - is_342_[i_345_][i_344_ - 1]);
		    float f
			= (float) (1.0
				   / Math.sqrt((double) (i_347_ * i_347_
							 + 4 * i_343_ * i_343_
							 + i_348_ * i_348_)));
		    ((Class166_Sub1) this).aFloatArrayArray9786[i_345_][i_344_]
			= (float) i_347_ * f;
		    ((Class166_Sub1) this).aFloatArrayArray9787[i_345_][i_344_]
			= (float) (-i_343_ * 2) * f;
		    ((Class166_Sub1) this).aFloatArrayArray9788[i_345_][i_344_]
			= (float) i_348_ * f;
		}
	    }
	}
	((Class166_Sub1) this).aFloat9779--;
	((Class166_Sub1) this).aFloat9763++;
	((Class166_Sub1) this).aClass407_9766 = new HashTable(128);
	if ((((Class166_Sub1) this).anInt9789 & 0x10) != 0)
	    ((Class166_Sub1) this).aClass364_9780
		= new Class364(((Class166_Sub1) this).aClass103_Sub3_9767,
			       this);
    }
    
    void method16148() {
	if ((((Class166_Sub1) this).anInt9762 & 0x2) == 0) {
	    ((Class166_Sub1) this).anIntArrayArrayArray9799 = null;
	    ((Class166_Sub1) this).anIntArrayArrayArray9772 = null;
	    ((Class166_Sub1) this).anIntArrayArrayArray9757 = null;
	}
	((Class166_Sub1) this).anIntArrayArrayArray9775 = null;
	((Class166_Sub1) this).anIntArrayArrayArray9771 = null;
	((Class166_Sub1) this).anIntArrayArrayArray9774 = null;
	((Class166_Sub1) this).aClass241_Sub17ArrayArrayArray9769 = null;
	((Class166_Sub1) this).aByteArrayArray9785 = null;
	((Class166_Sub1) this).aClass407_9766 = null;
	((Class166_Sub1) this).aClass241Array9790 = null;
	((Class166_Sub1) this).aFloatArrayArray9788 = null;
	((Class166_Sub1) this).aFloatArrayArray9787 = null;
	((Class166_Sub1) this).aFloatArrayArray9786 = null;
    }
    
    public Class241_Sub39_Sub17 method3570
	(int i, int i_349_, Class241_Sub39_Sub17 class241_sub39_sub17) {
	if ((((Class166_Sub1) this).aByteArrayArray9776[i][i_349_] & 0x1) == 0)
	    return null;
	int i_350_
	    = (anInt2053 * 2039042417
	       >> (((Class103_Sub3) ((Class166_Sub1) this).aClass103_Sub3_9767)
		   .anInt9489));
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1
	    = (Class241_Sub39_Sub17_Sub1) class241_sub39_sub17;
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1_351_;
	if (class241_sub39_sub17_sub1 != null
	    && class241_sub39_sub17_sub1.method17674(i_350_, i_350_)) {
	    class241_sub39_sub17_sub1_351_ = class241_sub39_sub17_sub1;
	    class241_sub39_sub17_sub1_351_.method17669();
	} else
	    class241_sub39_sub17_sub1_351_
		= new Class241_Sub39_Sub17_Sub1((((Class166_Sub1) this)
						 .aClass103_Sub3_9767),
						i_350_, i_350_);
	class241_sub39_sub17_sub1_351_.method17670(0, 0, i_350_, i_350_);
	method16145(class241_sub39_sub17_sub1_351_, i, i_349_);
	return class241_sub39_sub17_sub1_351_;
    }
    
    public Class241_Sub39_Sub17 method3571
	(int i, int i_352_, Class241_Sub39_Sub17 class241_sub39_sub17) {
	if ((((Class166_Sub1) this).aByteArrayArray9776[i][i_352_] & 0x1) == 0)
	    return null;
	int i_353_
	    = (anInt2053 * 2039042417
	       >> (((Class103_Sub3) ((Class166_Sub1) this).aClass103_Sub3_9767)
		   .anInt9489));
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1
	    = (Class241_Sub39_Sub17_Sub1) class241_sub39_sub17;
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1_354_;
	if (class241_sub39_sub17_sub1 != null
	    && class241_sub39_sub17_sub1.method17674(i_353_, i_353_)) {
	    class241_sub39_sub17_sub1_354_ = class241_sub39_sub17_sub1;
	    class241_sub39_sub17_sub1_354_.method17669();
	} else
	    class241_sub39_sub17_sub1_354_
		= new Class241_Sub39_Sub17_Sub1((((Class166_Sub1) this)
						 .aClass103_Sub3_9767),
						i_353_, i_353_);
	class241_sub39_sub17_sub1_354_.method17670(0, 0, i_353_, i_353_);
	method16145(class241_sub39_sub17_sub1_354_, i, i_352_);
	return class241_sub39_sub17_sub1_354_;
    }
    
    public void method3572(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_355_, int i_356_, int i_357_, boolean bool) {
	if (((Class166_Sub1) this).aClass364_9780 != null
	    && class241_sub39_sub17 != null) {
	    int i_358_
		= (i - (i_355_ * (((Class103_Sub3)
				   ((Class166_Sub1) this).aClass103_Sub3_9767)
				  .anInt9520)
			>> 8)
		   >> ((Class103_Sub3)
		       ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9489);
	    int i_359_
		= (i_356_ - (i_355_ * (((Class103_Sub3) (((Class166_Sub1) this)
							 .aClass103_Sub3_9767))
				       .anInt9627)
			     >> 8)
		   >> ((Class103_Sub3)
		       ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9489);
	    ((Class166_Sub1) this).aClass364_9780
		.method6538(class241_sub39_sub17, i_358_, i_359_);
	}
    }
    
    public void method3546(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_360_, int i_361_, int i_362_, boolean bool) {
	if (((Class166_Sub1) this).aClass364_9780 != null
	    && class241_sub39_sub17 != null) {
	    int i_363_
		= (i - (i_360_ * (((Class103_Sub3)
				   ((Class166_Sub1) this).aClass103_Sub3_9767)
				  .anInt9520)
			>> 8)
		   >> ((Class103_Sub3)
		       ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9489);
	    int i_364_
		= (i_361_ - (i_360_ * (((Class103_Sub3) (((Class166_Sub1) this)
							 .aClass103_Sub3_9767))
				       .anInt9627)
			     >> 8)
		   >> ((Class103_Sub3)
		       ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9489);
	    ((Class166_Sub1) this).aClass364_9780
		.method6538(class241_sub39_sub17, i_363_, i_364_);
	}
    }
    
    public void method3580(Class241_Sub43 class241_sub43, int[] is) {
	((Class166_Sub1) this).aClass429_9777.addNode
	    (new Class241_Sub8(((Class166_Sub1) this).aClass103_Sub3_9767,
			       this, class241_sub43, is),
	     (short) -18185);
    }
    
    public Class241_Sub39_Sub17 method3559
	(int i, int i_365_, Class241_Sub39_Sub17 class241_sub39_sub17) {
	if ((((Class166_Sub1) this).aByteArrayArray9776[i][i_365_] & 0x1) == 0)
	    return null;
	int i_366_
	    = (anInt2053 * 2039042417
	       >> (((Class103_Sub3) ((Class166_Sub1) this).aClass103_Sub3_9767)
		   .anInt9489));
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1
	    = (Class241_Sub39_Sub17_Sub1) class241_sub39_sub17;
	Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1_367_;
	if (class241_sub39_sub17_sub1 != null
	    && class241_sub39_sub17_sub1.method17674(i_366_, i_366_)) {
	    class241_sub39_sub17_sub1_367_ = class241_sub39_sub17_sub1;
	    class241_sub39_sub17_sub1_367_.method17669();
	} else
	    class241_sub39_sub17_sub1_367_
		= new Class241_Sub39_Sub17_Sub1((((Class166_Sub1) this)
						 .aClass103_Sub3_9767),
						i_366_, i_366_);
	class241_sub39_sub17_sub1_367_.method17670(0, 0, i_366_, i_366_);
	method16145(class241_sub39_sub17_sub1_367_, i, i_365_);
	return class241_sub39_sub17_sub1_367_;
    }
    
    public boolean method3545(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			      int i_368_, int i_369_, int i_370_,
			      boolean bool) {
	if (((Class166_Sub1) this).aClass364_9780 == null
	    || class241_sub39_sub17 == null)
	    return false;
	int i_371_
	    = (i - (i_368_ * ((Class103_Sub3) (((Class166_Sub1) this)
					       .aClass103_Sub3_9767)).anInt9520
		    >> 8)
	       >> (((Class103_Sub3) ((Class166_Sub1) this).aClass103_Sub3_9767)
		   .anInt9489));
	int i_372_
	    = (i_369_ - (i_368_ * (((Class103_Sub3)
				    ((Class166_Sub1) this).aClass103_Sub3_9767)
				   .anInt9627)
			 >> 8)
	       >> (((Class103_Sub3) ((Class166_Sub1) this).aClass103_Sub3_9767)
		   .anInt9489));
	return ((Class166_Sub1) this).aClass364_9780
		   .method6536(class241_sub39_sub17, i_371_, i_372_);
    }
    
    public void method3548(int i, int i_373_, int i_374_, int i_375_,
			   int i_376_, int i_377_, int i_378_,
			   boolean[][] bools) {
	if (((Class166_Sub1) this).anInt9783 > 0) {
	    Interface33 interface33
		= ((Class166_Sub1) this).aClass103_Sub3_9767
		      .method15630(((Class166_Sub1) this).anInt9794);
	    int i_379_ = 0;
	    int i_380_ = 32767;
	    int i_381_ = -32768;
	    ByteBuffer bytebuffer
		= ((Class166_Sub1) this).aClass103_Sub3_9767.aByteBuffer9490;
	    bytebuffer.clear();
	    for (int i_382_ = i_376_; i_382_ < i_378_; i_382_++) {
		int i_383_ = i_382_ * (anInt2055 * 266270313) + i_375_;
		for (int i_384_ = i_375_; i_384_ < i_377_; i_384_++) {
		    if (bools[i_384_ - i_375_][i_382_ - i_376_]) {
			short[] is = (((Class166_Sub1) this)
				      .aShortArrayArray9791[i_383_]);
			if (is != null) {
			    for (int i_385_ = 0; i_385_ < is.length;
				 i_385_++) {
				int i_386_ = is[i_385_] & 0xffff;
				if (i_386_ > i_381_)
				    i_381_ = i_386_;
				if (i_386_ < i_380_)
				    i_380_ = i_386_;
				bytebuffer.putShort((short) i_386_);
				i_379_++;
			    }
			}
		    }
		    i_383_++;
		}
	    }
	    interface33.method268(0, bytebuffer.position(),
				  (((Class166_Sub1) this).aClass103_Sub3_9767
				   .aLong9491));
	    if (i_379_ > 0) {
		((Class166_Sub1) this).aClass103_Sub3_9767.method15728();
		Class361 class361 = (((Class103_Sub3) (((Class166_Sub1) this)
						       .aClass103_Sub3_9767))
				     .aClass361_9540);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15955(0, ((Class166_Sub1) this).anInterface40_9765);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15955(1, ((Class166_Sub1) this).anInterface40_9781);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15716(((Class166_Sub1) this).aClass366_9797);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15718(interface33);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method2512(Class266.aClass266_4342);
		float f = (float) ((Class166_Sub1) this)
				      .aClass103_Sub3_9767.method2237
				      ((byte) 4).method2655();
		float f_387_ = (float) ((Class166_Sub1) this)
					   .aClass103_Sub3_9767.method2237
					   ((byte) 4).method2654();
		Class266 class266 = new Class266();
		Class266 class266_388_ = new Class266();
		class266.method5122(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F,
				    1.0F, 0.0F);
		class266_388_.method5120
		    ((float) i_374_ / (256.0F
				       * (float) (anInt2053 * 2039042417)),
		     (float) -i_374_ / (256.0F
					* (float) (anInt2053 * 2039042417)),
		     1.0F / (((Class166_Sub1) this).aFloat9763
			     - ((Class166_Sub1) this).aFloat9779));
		class266_388_.method5133
		    ((float) i - (float) (i_375_ * i_374_) / 256.0F,
		     (float) i_373_ + (float) (i_378_ * i_374_) / 256.0F,
		     (-((Class166_Sub1) this).aFloat9779
		      / (((Class166_Sub1) this).aFloat9763
			 - ((Class166_Sub1) this).aFloat9779)));
		class266_388_.method5130(2.0F / f, 2.0F / f_387_, 1.0F);
		class266_388_.method5133(-1.0F, -1.0F, 0.0F);
		((Class103_Sub3) ((Class166_Sub1) this).aClass103_Sub3_9767)
		    .aClass266_9588.method5135(class266, class266_388_);
		((Class166_Sub1) this).aClass103_Sub3_9767.aClass268_9511
		    .method5203
		    (((Class103_Sub3) (((Class166_Sub1) this)
				       .aClass103_Sub3_9767)).aClass266_9588);
		((Class166_Sub1) this).aClass103_Sub3_9767.method2309
		    (((Class166_Sub1) this).aClass103_Sub3_9767
		     .aClass268_9511);
		class361.method6494(Class268.aClass268_4354);
		class361.aClass285_5516.method5548(0.0F, 0.0F, 0.0F, 0.0F);
		class361.aClass287_5507.method5568(0.0F, 0.0F, 0.0F);
		class361.aClass285_5514.method5548(0.0F, 0.0F, 0.0F, 0.0F);
		class361.aClass287_5515.method5568(0.0F, 0.0F, 0.0F);
		class361.anInterface41_5525
		    = (((Class166_Sub1) this).aClass103_Sub3_9767
		       .anInterface41_9584);
		class361.aClass268_5510.method5198();
		class361.anInt5522 = i_380_;
		class361.anInt5523 = i_381_ - i_380_ + 1;
		class361.anInt5506 = 0;
		class361.anInt5517 = i_379_ / 3;
		if (((Class166_Sub1) this).aClass103_Sub3_9767.aBool9552) {
		    ((Class166_Sub1) this).aClass103_Sub3_9767
			.method2308(false);
		    class361.method6495(false);
		    ((Class166_Sub1) this).aClass103_Sub3_9767
			.method2308(true);
		} else
		    class361.method6495(false);
	    }
	}
    }
    
    public void method3561(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_389_, int i_390_, int i_391_, boolean bool) {
	if (((Class166_Sub1) this).aClass364_9780 != null
	    && class241_sub39_sub17 != null) {
	    int i_392_
		= (i - (i_389_ * (((Class103_Sub3)
				   ((Class166_Sub1) this).aClass103_Sub3_9767)
				  .anInt9520)
			>> 8)
		   >> ((Class103_Sub3)
		       ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9489);
	    int i_393_
		= (i_390_ - (i_389_ * (((Class103_Sub3) (((Class166_Sub1) this)
							 .aClass103_Sub3_9767))
				       .anInt9627)
			     >> 8)
		   >> ((Class103_Sub3)
		       ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9489);
	    ((Class166_Sub1) this).aClass364_9780
		.method6535(class241_sub39_sub17, i_392_, i_393_);
	}
    }
    
    public void method3562(int i, int i_394_, int[] is, int[] is_395_,
			   int[] is_396_, int[] is_397_, int[] is_398_,
			   int[] is_399_, int[] is_400_, int[] is_401_,
			   int[] is_402_, int[] is_403_, int[] is_404_,
			   Class86 class86, boolean bool) {
	int i_405_ = is_401_.length;
	int[] is_406_ = new int[i_405_ * 3];
	int[] is_407_ = new int[i_405_ * 3];
	int[] is_408_ = new int[i_405_ * 3];
	int[] is_409_ = new int[i_405_ * 3];
	int[] is_410_ = new int[i_405_ * 3];
	int[] is_411_ = new int[i_405_ * 3];
	int[] is_412_ = is_395_ != null ? new int[i_405_ * 3] : null;
	int[] is_413_ = is_397_ != null ? new int[i_405_ * 3] : null;
	int i_414_ = 0;
	for (int i_415_ = 0; i_415_ < i_405_; i_415_++) {
	    int i_416_ = is_398_[i_415_];
	    int i_417_ = is_399_[i_415_];
	    int i_418_ = is_400_[i_415_];
	    is_406_[i_414_] = is[i_416_];
	    is_407_[i_414_] = is_396_[i_416_];
	    is_408_[i_414_] = is_401_[i_415_];
	    is_410_[i_414_] = is_403_[i_415_];
	    is_411_[i_414_] = is_404_[i_415_];
	    is_409_[i_414_]
		= is_402_ != null ? is_402_[i_415_] : is_401_[i_415_];
	    if (is_395_ != null)
		is_412_[i_414_] = is_395_[i_416_];
	    if (is_397_ != null)
		is_413_[i_414_] = is_397_[i_416_];
	    i_414_++;
	    is_406_[i_414_] = is[i_417_];
	    is_407_[i_414_] = is_396_[i_417_];
	    is_408_[i_414_] = is_401_[i_415_];
	    is_410_[i_414_] = is_403_[i_415_];
	    is_411_[i_414_] = is_404_[i_415_];
	    is_409_[i_414_]
		= is_402_ != null ? is_402_[i_415_] : is_401_[i_415_];
	    if (is_395_ != null)
		is_412_[i_414_] = is_395_[i_417_];
	    if (is_397_ != null)
		is_413_[i_414_] = is_397_[i_417_];
	    i_414_++;
	    is_406_[i_414_] = is[i_418_];
	    is_407_[i_414_] = is_396_[i_418_];
	    is_408_[i_414_] = is_401_[i_415_];
	    is_410_[i_414_] = is_403_[i_415_];
	    is_411_[i_414_] = is_404_[i_415_];
	    is_409_[i_414_]
		= is_402_ != null ? is_402_[i_415_] : is_401_[i_415_];
	    if (is_395_ != null)
		is_412_[i_414_] = is_395_[i_418_];
	    if (is_397_ != null)
		is_413_[i_414_] = is_397_[i_418_];
	    i_414_++;
	}
	method3544(i, i_394_, is_406_, is_412_, is_407_, is_413_, is_408_,
		   is_409_, is_410_, is_411_, class86, bool);
    }
    
    public void method3569(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_419_, int i_420_, int i_421_, boolean bool) {
	if (((Class166_Sub1) this).aClass364_9780 != null
	    && class241_sub39_sub17 != null) {
	    int i_422_
		= (i - (i_419_ * (((Class103_Sub3)
				   ((Class166_Sub1) this).aClass103_Sub3_9767)
				  .anInt9520)
			>> 8)
		   >> ((Class103_Sub3)
		       ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9489);
	    int i_423_
		= (i_420_ - (i_419_ * (((Class103_Sub3) (((Class166_Sub1) this)
							 .aClass103_Sub3_9767))
				       .anInt9627)
			     >> 8)
		   >> ((Class103_Sub3)
		       ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9489);
	    ((Class166_Sub1) this).aClass364_9780
		.method6535(class241_sub39_sub17, i_422_, i_423_);
	}
    }
    
    public void method3581(Class241_Sub39_Sub17 class241_sub39_sub17, int i,
			   int i_424_, int i_425_, int i_426_, boolean bool) {
	if (((Class166_Sub1) this).aClass364_9780 != null
	    && class241_sub39_sub17 != null) {
	    int i_427_
		= (i - (i_424_ * (((Class103_Sub3)
				   ((Class166_Sub1) this).aClass103_Sub3_9767)
				  .anInt9520)
			>> 8)
		   >> ((Class103_Sub3)
		       ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9489);
	    int i_428_
		= (i_425_ - (i_424_ * (((Class103_Sub3) (((Class166_Sub1) this)
							 .aClass103_Sub3_9767))
				       .anInt9627)
			     >> 8)
		   >> ((Class103_Sub3)
		       ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9489);
	    ((Class166_Sub1) this).aClass364_9780
		.method6535(class241_sub39_sub17, i_427_, i_428_);
	}
    }
    
    void method16149() {
	if ((((Class166_Sub1) this).anInt9762 & 0x2) == 0) {
	    ((Class166_Sub1) this).anIntArrayArrayArray9799 = null;
	    ((Class166_Sub1) this).anIntArrayArrayArray9772 = null;
	    ((Class166_Sub1) this).anIntArrayArrayArray9757 = null;
	}
	((Class166_Sub1) this).anIntArrayArrayArray9775 = null;
	((Class166_Sub1) this).anIntArrayArrayArray9771 = null;
	((Class166_Sub1) this).anIntArrayArrayArray9774 = null;
	((Class166_Sub1) this).aClass241_Sub17ArrayArrayArray9769 = null;
	((Class166_Sub1) this).aByteArrayArray9785 = null;
	((Class166_Sub1) this).aClass407_9766 = null;
	((Class166_Sub1) this).aClass241Array9790 = null;
	((Class166_Sub1) this).aFloatArrayArray9788 = null;
	((Class166_Sub1) this).aFloatArrayArray9787 = null;
	((Class166_Sub1) this).aFloatArrayArray9786 = null;
    }
    
    public void method3544(int i, int i_429_, int[] is, int[] is_430_,
			   int[] is_431_, int[] is_432_, int[] is_433_,
			   int[] is_434_, int[] is_435_, int[] is_436_,
			   Class86 class86, boolean bool) {
	Class107 class107
	    = ((Class166_Sub1) this).aClass103_Sub3_9767.aClass107_1458;
	if (is_432_ != null
	    && ((Class166_Sub1) this).anIntArrayArrayArray9775 == null)
	    ((Class166_Sub1) this).anIntArrayArrayArray9775
		= new int[anInt2055 * 266270313][anInt2052 * -14610189][];
	if (is_430_ != null
	    && ((Class166_Sub1) this).anIntArrayArrayArray9774 == null)
	    ((Class166_Sub1) this).anIntArrayArrayArray9774
		= new int[anInt2055 * 266270313][anInt2052 * -14610189][];
	((Class166_Sub1) this).anIntArrayArrayArray9772[i][i_429_] = is;
	((Class166_Sub1) this).anIntArrayArrayArray9799[i][i_429_] = is_431_;
	((Class166_Sub1) this).anIntArrayArrayArray9757[i][i_429_] = is_433_;
	((Class166_Sub1) this).anIntArrayArrayArray9771[i][i_429_] = is_434_;
	if (((Class166_Sub1) this).anIntArrayArrayArray9775 != null)
	    ((Class166_Sub1) this).anIntArrayArrayArray9775[i][i_429_]
		= is_432_;
	if (((Class166_Sub1) this).anIntArrayArrayArray9774 != null)
	    ((Class166_Sub1) this).anIntArrayArrayArray9774[i][i_429_]
		= is_430_;
	Class241_Sub17[] class241_sub17s
	    = (((Class166_Sub1) this).aClass241_Sub17ArrayArrayArray9769[i]
		   [i_429_]
	       = new Class241_Sub17[is_433_.length]);
	for (int i_437_ = 0; i_437_ < is_433_.length; i_437_++) {
	    int i_438_ = is_435_[i_437_];
	    int i_439_ = is_436_[i_437_];
	    if ((((Class166_Sub1) this).anInt9789 & 0x20) != 0 && i_438_ != -1
		&& class107.method2680(i_438_, -601553489).aBool1434) {
		i_439_ = 128;
		i_438_ = -1;
	    }
	    long l = ((long) (class86.anInt1253 * 642800105) << 48
		      | (long) (class86.anInt1252 * -1282025259) << 42
		      | (long) (class86.anInt1251 * 1897985763) << 28
		      | (long) (i_439_ << 14) | (long) i_438_);
	    Node class241;
	    for (class241
		     = ((Class166_Sub1) this).aClass407_9766.get(l);
		 class241 != null;
		 class241 = ((Class166_Sub1) this).aClass407_9766
				.method7289((byte) 26)) {
		Class241_Sub17 class241_sub17 = (Class241_Sub17) class241;
		if (((Class241_Sub17) class241_sub17).anInt8985 == i_438_
		    && (((Class241_Sub17) class241_sub17).aFloat8988
			== (float) i_439_)
		    && ((Class241_Sub17) class241_sub17).aClass86_8987
			   .method1849(class86, 1511978957))
		    break;
	    }
	    if (class241 == null) {
		class241_sub17s[i_437_]
		    = new Class241_Sub17(this, i_438_, i_439_, class86);
		((Class166_Sub1) this).aClass407_9766
		    .put(class241_sub17s[i_437_], l);
	    } else
		class241_sub17s[i_437_] = (Class241_Sub17) class241;
	}
	if (bool)
	    ((Class166_Sub1) this).aByteArrayArray9776[i][i_429_] |= 0x1;
	if (is_433_.length > ((Class166_Sub1) this).anInt9784)
	    ((Class166_Sub1) this).anInt9784 = is_433_.length;
	((Class166_Sub1) this).anInt9783 += is_433_.length;
    }
    
    void method16150(int i, int i_440_, byte[][] is,
		     Class241_Sub17[] class241_sub17s, HashTable class407,
		     Class241_Sub17[] class241_sub17s_441_) {
	if (((Class166_Sub1) this).anIntArrayArrayArray9757[i][i_440_]
	    != null) {
	    Class241_Sub17[] class241_sub17s_442_
		= (((Class166_Sub1) this).aClass241_Sub17ArrayArrayArray9769[i]
		   [i_440_]);
	    int[] is_443_
		= ((Class166_Sub1) this).anIntArrayArrayArray9772[i][i_440_];
	    int[] is_444_
		= ((Class166_Sub1) this).anIntArrayArrayArray9799[i][i_440_];
	    int[] is_445_
		= ((Class166_Sub1) this).anIntArrayArrayArray9771[i][i_440_];
	    int[] is_446_
		= ((Class166_Sub1) this).anIntArrayArrayArray9757[i][i_440_];
	    int[] is_447_
		= (((Class166_Sub1) this).anIntArrayArrayArray9774 != null
		   ? ((Class166_Sub1) this).anIntArrayArrayArray9774[i][i_440_]
		   : null);
	    int[] is_448_
		= (((Class166_Sub1) this).anIntArrayArrayArray9775 != null
		   ? ((Class166_Sub1) this).anIntArrayArrayArray9775[i][i_440_]
		   : null);
	    if (is_445_ == null)
		is_445_ = is_446_;
	    float f = ((Class166_Sub1) this).aFloatArrayArray9786[i][i_440_];
	    float f_449_
		= ((Class166_Sub1) this).aFloatArrayArray9787[i][i_440_];
	    float f_450_
		= ((Class166_Sub1) this).aFloatArrayArray9788[i][i_440_];
	    float f_451_
		= ((Class166_Sub1) this).aFloatArrayArray9786[i][i_440_ + 1];
	    float f_452_
		= ((Class166_Sub1) this).aFloatArrayArray9787[i][i_440_ + 1];
	    float f_453_
		= ((Class166_Sub1) this).aFloatArrayArray9788[i][i_440_ + 1];
	    float f_454_ = (((Class166_Sub1) this).aFloatArrayArray9786[i + 1]
			    [i_440_ + 1]);
	    float f_455_ = (((Class166_Sub1) this).aFloatArrayArray9787[i + 1]
			    [i_440_ + 1]);
	    float f_456_ = (((Class166_Sub1) this).aFloatArrayArray9788[i + 1]
			    [i_440_ + 1]);
	    float f_457_
		= ((Class166_Sub1) this).aFloatArrayArray9786[i + 1][i_440_];
	    float f_458_
		= ((Class166_Sub1) this).aFloatArrayArray9787[i + 1][i_440_];
	    float f_459_
		= ((Class166_Sub1) this).aFloatArrayArray9788[i + 1][i_440_];
	    int i_460_ = is[i][i_440_] & 0xff;
	    int i_461_ = is[i][i_440_ + 1] & 0xff;
	    int i_462_ = is[i + 1][i_440_ + 1] & 0xff;
	    int i_463_ = is[i + 1][i_440_] & 0xff;
	    int i_464_ = 0;
	while_122_:
	    for (int i_465_ = 0; i_465_ < is_446_.length; i_465_++) {
		Class241_Sub17 class241_sub17 = class241_sub17s_442_[i_465_];
		for (int i_466_ = 0; i_466_ < i_464_; i_466_++) {
		    if (class241_sub17s[i_466_] == class241_sub17)
			continue while_122_;
		}
		class241_sub17s[i_464_++] = class241_sub17;
	    }
	    short[] is_467_ = (((Class166_Sub1) this).aShortArrayArray9791
				   [i_440_ * (anInt2055 * 266270313) + i]
			       = new short[is_446_.length]);
	    for (int i_468_ = 0; i_468_ < is_446_.length; i_468_++) {
		int i_469_ = (i << anInt2054 * -122333825) + is_443_[i_468_];
		int i_470_
		    = (i_440_ << anInt2054 * -122333825) + is_444_[i_468_];
		int i_471_ = i_469_ >> ((Class166_Sub1) this).anInt9760;
		int i_472_ = i_470_ >> ((Class166_Sub1) this).anInt9760;
		int i_473_ = is_446_[i_468_];
		int i_474_ = is_445_[i_468_];
		int i_475_ = is_447_ != null ? is_447_[i_468_] : 0;
		long l = ((long) i_474_ << 48 | (long) i_473_ << 32
			  | (long) (i_471_ << 16) | (long) i_472_);
		int i_476_ = is_443_[i_468_];
		int i_477_ = is_444_[i_468_];
		int i_478_ = 74;
		int i_479_ = 0;
		float f_480_ = 1.0F;
		float f_481_;
		float f_482_;
		float f_483_;
		if (i_476_ == 0 && i_477_ == 0) {
		    f_481_ = f;
		    f_482_ = f_449_;
		    f_483_ = f_450_;
		    i_478_ -= i_460_;
		} else if (i_476_ == 0 && i_477_ == anInt2053 * 2039042417) {
		    f_481_ = f_451_;
		    f_482_ = f_452_;
		    f_483_ = f_453_;
		    i_478_ -= i_461_;
		} else if (i_476_ == anInt2053 * 2039042417
			   && i_477_ == anInt2053 * 2039042417) {
		    f_481_ = f_454_;
		    f_482_ = f_455_;
		    f_483_ = f_456_;
		    i_478_ -= i_462_;
		} else if (i_476_ == anInt2053 * 2039042417 && i_477_ == 0) {
		    f_481_ = f_457_;
		    f_482_ = f_458_;
		    f_483_ = f_459_;
		    i_478_ -= i_463_;
		} else {
		    float f_484_
			= (float) i_476_ / (float) (anInt2053 * 2039042417);
		    float f_485_
			= (float) i_477_ / (float) (anInt2053 * 2039042417);
		    float f_486_ = f + (f_457_ - f) * f_484_;
		    float f_487_ = f_449_ + (f_458_ - f_449_) * f_484_;
		    float f_488_ = f_450_ + (f_459_ - f_450_) * f_484_;
		    float f_489_ = f_451_ + (f_454_ - f_451_) * f_484_;
		    float f_490_ = f_452_ + (f_455_ - f_452_) * f_484_;
		    float f_491_ = f_453_ + (f_456_ - f_453_) * f_484_;
		    f_481_ = f_486_ + (f_489_ - f_486_) * f_485_;
		    f_482_ = f_487_ + (f_490_ - f_487_) * f_485_;
		    f_483_ = f_488_ + (f_491_ - f_488_) * f_485_;
		    int i_492_ = i_460_ + ((i_463_ - i_460_) * i_476_
					   >> anInt2054 * -122333825);
		    int i_493_ = i_461_ + ((i_462_ - i_461_) * i_476_
					   >> anInt2054 * -122333825);
		    i_478_ -= i_492_ + ((i_493_ - i_492_) * i_477_
					>> anInt2054 * -122333825);
		}
		if (i_473_ != -1) {
		    int i_494_ = (i_473_ & 0x7f) * i_478_ >> 7;
		    if (i_494_ < 2)
			i_494_ = 2;
		    else if (i_494_ > 126)
			i_494_ = 126;
		    i_479_ = Class474.anIntArray6380[i_473_ & 0xff80 | i_494_];
		    if ((((Class166_Sub1) this).anInt9789 & 0x7) == 0) {
			f_480_ = ((((Class166_Sub1) this).aClass103_Sub3_9767
				   .aFloatArray9558[0]) * f_481_
				  + (((Class166_Sub1) this).aClass103_Sub3_9767
				     .aFloatArray9558[1]) * f_482_
				  + (((Class166_Sub1) this).aClass103_Sub3_9767
				     .aFloatArray9558[2]) * f_483_);
			f_480_
			    = ((((Class166_Sub1) this).aClass103_Sub3_9767
				.aFloat9566)
			       + f_480_ * (f_480_ > 0.0F
					   ? (((Class166_Sub1) this)
					      .aClass103_Sub3_9767.aFloat9609)
					   : (((Class166_Sub1) this)
					      .aClass103_Sub3_9767
					      .aFloat9568)));
		    }
		}
		Node class241 = null;
		if ((i_469_ & ((Class166_Sub1) this).anInt9761 - 1) == 0
		    && (i_470_ & ((Class166_Sub1) this).anInt9761 - 1) == 0)
		    class241 = class407.get(l);
		int i_495_;
		if (class241 == null) {
		    int i_496_;
		    if (i_474_ != i_473_) {
			int i_497_ = (i_474_ & 0x7f) * i_478_ >> 7;
			if (i_497_ < 2)
			    i_497_ = 2;
			else if (i_497_ > 126)
			    i_497_ = 126;
			i_496_ = (Class474.anIntArray6380
				  [i_474_ & 0xff80 | i_497_]);
			if ((((Class166_Sub1) this).anInt9789 & 0x7) == 0) {
			    float f_498_
				= ((((Class166_Sub1) this).aClass103_Sub3_9767
				    .aFloatArray9558[0]) * f_481_
				   + ((((Class166_Sub1) this)
				       .aClass103_Sub3_9767.aFloatArray9558[1])
				      * f_482_)
				   + ((((Class166_Sub1) this)
				       .aClass103_Sub3_9767.aFloatArray9558[2])
				      * f_483_));
			    f_498_ = ((((Class166_Sub1) this)
				       .aClass103_Sub3_9767.aFloat9566)
				      + f_480_ * (f_480_ > 0.0F
						  ? (((Class166_Sub1) this)
						     .aClass103_Sub3_9767
						     .aFloat9609)
						  : (((Class166_Sub1) this)
						     .aClass103_Sub3_9767
						     .aFloat9568)));
			    int i_499_ = i_496_ >> 16 & 0xff;
			    int i_500_ = i_496_ >> 8 & 0xff;
			    int i_501_ = i_496_ & 0xff;
			    i_499_ *= f_498_;
			    if (i_499_ < 0)
				i_499_ = 0;
			    else if (i_499_ > 255)
				i_499_ = 255;
			    i_500_ *= f_498_;
			    if (i_500_ < 0)
				i_500_ = 0;
			    else if (i_500_ > 255)
				i_500_ = 255;
			    i_501_ *= f_498_;
			    if (i_501_ < 0)
				i_501_ = 0;
			    else if (i_501_ > 255)
				i_501_ = 255;
			    i_496_ = i_499_ << 16 | i_500_ << 8 | i_501_;
			}
		    } else
			i_496_ = i_479_;
		    Unsafe unsafe = (((Class166_Sub1) this).aClass103_Sub3_9767
				     .anUnsafe9493);
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) i_469_);
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) (method3574(i_469_, i_470_,
							-1282852812)
					     + i_475_));
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) i_470_);
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) i_469_);
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) i_470_);
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    if (((Class166_Sub1) this).anIntArrayArrayArray9775
			!= null) {
			unsafe.putFloat(((Class166_Sub1) this).aLong9793,
					(is_448_ != null
					 ? (float) (is_448_[i_468_] - 1)
					 : 0.0F));
			((Class166_Sub1) this).aLong9793 += 4L;
		    }
		    if ((((Class166_Sub1) this).anInt9789 & 0x7) != 0) {
			unsafe.putFloat(((Class166_Sub1) this).aLong9793,
					f_481_);
			((Class166_Sub1) this).aLong9793 += 4L;
			unsafe.putFloat(((Class166_Sub1) this).aLong9793,
					f_482_);
			((Class166_Sub1) this).aLong9793 += 4L;
			unsafe.putFloat(((Class166_Sub1) this).aLong9793,
					f_483_);
			((Class166_Sub1) this).aLong9793 += 4L;
		    }
		    if (((Class103_Sub3)
			 ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9633
			== 0) {
			int i_502_ = i_496_ & ~0xff00ff;
			i_502_ |= (i_496_ & 0xff0000) >> 16;
			i_502_ |= (i_496_ & 0xff) << 16;
			i_496_ = i_502_;
		    }
		    unsafe.putInt(((Class166_Sub1) this).aLong9792,
				  ~0xffffff | i_496_);
		    ((Class166_Sub1) this).aLong9792 += 4L;
		    i_495_ = ((Class166_Sub1) this).anInt9764++;
		    is_467_[i_468_] = (short) i_495_;
		    if (i_473_ != -1)
			class241_sub17s_441_[i_495_]
			    = class241_sub17s_442_[i_468_];
		    class407.put(new Class241_Sub7(is_467_[i_468_]), l);
		} else {
		    is_467_[i_468_] = ((Class241_Sub7) class241).aShort8826;
		    i_495_ = is_467_[i_468_] & 0xffff;
		    if (i_473_ != -1
			&& ((class241_sub17s_442_[i_468_].hashCode
			     * 4356572401218184725L)
			    < (class241_sub17s_441_[i_495_].hashCode
			       * 4356572401218184725L)))
			class241_sub17s_441_[i_495_]
			    = class241_sub17s_442_[i_468_];
		}
		for (int i_503_ = 0; i_503_ < i_464_; i_503_++)
		    class241_sub17s[i_503_].method15022(i_495_, i_479_, i_478_,
							f_480_);
		((Class166_Sub1) this).anInt9794++;
	    }
	}
    }
    
    void method16151(int i, int i_504_, byte[][] is,
		     Class241_Sub17[] class241_sub17s, HashTable class407,
		     Class241_Sub17[] class241_sub17s_505_) {
	if (((Class166_Sub1) this).anIntArrayArrayArray9757[i][i_504_]
	    != null) {
	    Class241_Sub17[] class241_sub17s_506_
		= (((Class166_Sub1) this).aClass241_Sub17ArrayArrayArray9769[i]
		   [i_504_]);
	    int[] is_507_
		= ((Class166_Sub1) this).anIntArrayArrayArray9772[i][i_504_];
	    int[] is_508_
		= ((Class166_Sub1) this).anIntArrayArrayArray9799[i][i_504_];
	    int[] is_509_
		= ((Class166_Sub1) this).anIntArrayArrayArray9771[i][i_504_];
	    int[] is_510_
		= ((Class166_Sub1) this).anIntArrayArrayArray9757[i][i_504_];
	    int[] is_511_
		= (((Class166_Sub1) this).anIntArrayArrayArray9774 != null
		   ? ((Class166_Sub1) this).anIntArrayArrayArray9774[i][i_504_]
		   : null);
	    int[] is_512_
		= (((Class166_Sub1) this).anIntArrayArrayArray9775 != null
		   ? ((Class166_Sub1) this).anIntArrayArrayArray9775[i][i_504_]
		   : null);
	    if (is_509_ == null)
		is_509_ = is_510_;
	    float f = ((Class166_Sub1) this).aFloatArrayArray9786[i][i_504_];
	    float f_513_
		= ((Class166_Sub1) this).aFloatArrayArray9787[i][i_504_];
	    float f_514_
		= ((Class166_Sub1) this).aFloatArrayArray9788[i][i_504_];
	    float f_515_
		= ((Class166_Sub1) this).aFloatArrayArray9786[i][i_504_ + 1];
	    float f_516_
		= ((Class166_Sub1) this).aFloatArrayArray9787[i][i_504_ + 1];
	    float f_517_
		= ((Class166_Sub1) this).aFloatArrayArray9788[i][i_504_ + 1];
	    float f_518_ = (((Class166_Sub1) this).aFloatArrayArray9786[i + 1]
			    [i_504_ + 1]);
	    float f_519_ = (((Class166_Sub1) this).aFloatArrayArray9787[i + 1]
			    [i_504_ + 1]);
	    float f_520_ = (((Class166_Sub1) this).aFloatArrayArray9788[i + 1]
			    [i_504_ + 1]);
	    float f_521_
		= ((Class166_Sub1) this).aFloatArrayArray9786[i + 1][i_504_];
	    float f_522_
		= ((Class166_Sub1) this).aFloatArrayArray9787[i + 1][i_504_];
	    float f_523_
		= ((Class166_Sub1) this).aFloatArrayArray9788[i + 1][i_504_];
	    int i_524_ = is[i][i_504_] & 0xff;
	    int i_525_ = is[i][i_504_ + 1] & 0xff;
	    int i_526_ = is[i + 1][i_504_ + 1] & 0xff;
	    int i_527_ = is[i + 1][i_504_] & 0xff;
	    int i_528_ = 0;
	while_124_:
	    for (int i_529_ = 0; i_529_ < is_510_.length; i_529_++) {
		Class241_Sub17 class241_sub17 = class241_sub17s_506_[i_529_];
		for (int i_530_ = 0; i_530_ < i_528_; i_530_++) {
		    if (class241_sub17s[i_530_] == class241_sub17)
			continue while_124_;
		}
		class241_sub17s[i_528_++] = class241_sub17;
	    }
	    short[] is_531_ = (((Class166_Sub1) this).aShortArrayArray9791
				   [i_504_ * (anInt2055 * 266270313) + i]
			       = new short[is_510_.length]);
	    for (int i_532_ = 0; i_532_ < is_510_.length; i_532_++) {
		int i_533_ = (i << anInt2054 * -122333825) + is_507_[i_532_];
		int i_534_
		    = (i_504_ << anInt2054 * -122333825) + is_508_[i_532_];
		int i_535_ = i_533_ >> ((Class166_Sub1) this).anInt9760;
		int i_536_ = i_534_ >> ((Class166_Sub1) this).anInt9760;
		int i_537_ = is_510_[i_532_];
		int i_538_ = is_509_[i_532_];
		int i_539_ = is_511_ != null ? is_511_[i_532_] : 0;
		long l = ((long) i_538_ << 48 | (long) i_537_ << 32
			  | (long) (i_535_ << 16) | (long) i_536_);
		int i_540_ = is_507_[i_532_];
		int i_541_ = is_508_[i_532_];
		int i_542_ = 74;
		int i_543_ = 0;
		float f_544_ = 1.0F;
		float f_545_;
		float f_546_;
		float f_547_;
		if (i_540_ == 0 && i_541_ == 0) {
		    f_545_ = f;
		    f_546_ = f_513_;
		    f_547_ = f_514_;
		    i_542_ -= i_524_;
		} else if (i_540_ == 0 && i_541_ == anInt2053 * 2039042417) {
		    f_545_ = f_515_;
		    f_546_ = f_516_;
		    f_547_ = f_517_;
		    i_542_ -= i_525_;
		} else if (i_540_ == anInt2053 * 2039042417
			   && i_541_ == anInt2053 * 2039042417) {
		    f_545_ = f_518_;
		    f_546_ = f_519_;
		    f_547_ = f_520_;
		    i_542_ -= i_526_;
		} else if (i_540_ == anInt2053 * 2039042417 && i_541_ == 0) {
		    f_545_ = f_521_;
		    f_546_ = f_522_;
		    f_547_ = f_523_;
		    i_542_ -= i_527_;
		} else {
		    float f_548_
			= (float) i_540_ / (float) (anInt2053 * 2039042417);
		    float f_549_
			= (float) i_541_ / (float) (anInt2053 * 2039042417);
		    float f_550_ = f + (f_521_ - f) * f_548_;
		    float f_551_ = f_513_ + (f_522_ - f_513_) * f_548_;
		    float f_552_ = f_514_ + (f_523_ - f_514_) * f_548_;
		    float f_553_ = f_515_ + (f_518_ - f_515_) * f_548_;
		    float f_554_ = f_516_ + (f_519_ - f_516_) * f_548_;
		    float f_555_ = f_517_ + (f_520_ - f_517_) * f_548_;
		    f_545_ = f_550_ + (f_553_ - f_550_) * f_549_;
		    f_546_ = f_551_ + (f_554_ - f_551_) * f_549_;
		    f_547_ = f_552_ + (f_555_ - f_552_) * f_549_;
		    int i_556_ = i_524_ + ((i_527_ - i_524_) * i_540_
					   >> anInt2054 * -122333825);
		    int i_557_ = i_525_ + ((i_526_ - i_525_) * i_540_
					   >> anInt2054 * -122333825);
		    i_542_ -= i_556_ + ((i_557_ - i_556_) * i_541_
					>> anInt2054 * -122333825);
		}
		if (i_537_ != -1) {
		    int i_558_ = (i_537_ & 0x7f) * i_542_ >> 7;
		    if (i_558_ < 2)
			i_558_ = 2;
		    else if (i_558_ > 126)
			i_558_ = 126;
		    i_543_ = Class474.anIntArray6380[i_537_ & 0xff80 | i_558_];
		    if ((((Class166_Sub1) this).anInt9789 & 0x7) == 0) {
			f_544_ = ((((Class166_Sub1) this).aClass103_Sub3_9767
				   .aFloatArray9558[0]) * f_545_
				  + (((Class166_Sub1) this).aClass103_Sub3_9767
				     .aFloatArray9558[1]) * f_546_
				  + (((Class166_Sub1) this).aClass103_Sub3_9767
				     .aFloatArray9558[2]) * f_547_);
			f_544_
			    = ((((Class166_Sub1) this).aClass103_Sub3_9767
				.aFloat9566)
			       + f_544_ * (f_544_ > 0.0F
					   ? (((Class166_Sub1) this)
					      .aClass103_Sub3_9767.aFloat9609)
					   : (((Class166_Sub1) this)
					      .aClass103_Sub3_9767
					      .aFloat9568)));
		    }
		}
		Node class241 = null;
		if ((i_533_ & ((Class166_Sub1) this).anInt9761 - 1) == 0
		    && (i_534_ & ((Class166_Sub1) this).anInt9761 - 1) == 0)
		    class241 = class407.get(l);
		int i_559_;
		if (class241 == null) {
		    int i_560_;
		    if (i_538_ != i_537_) {
			int i_561_ = (i_538_ & 0x7f) * i_542_ >> 7;
			if (i_561_ < 2)
			    i_561_ = 2;
			else if (i_561_ > 126)
			    i_561_ = 126;
			i_560_ = (Class474.anIntArray6380
				  [i_538_ & 0xff80 | i_561_]);
			if ((((Class166_Sub1) this).anInt9789 & 0x7) == 0) {
			    float f_562_
				= ((((Class166_Sub1) this).aClass103_Sub3_9767
				    .aFloatArray9558[0]) * f_545_
				   + ((((Class166_Sub1) this)
				       .aClass103_Sub3_9767.aFloatArray9558[1])
				      * f_546_)
				   + ((((Class166_Sub1) this)
				       .aClass103_Sub3_9767.aFloatArray9558[2])
				      * f_547_));
			    f_562_ = ((((Class166_Sub1) this)
				       .aClass103_Sub3_9767.aFloat9566)
				      + f_544_ * (f_544_ > 0.0F
						  ? (((Class166_Sub1) this)
						     .aClass103_Sub3_9767
						     .aFloat9609)
						  : (((Class166_Sub1) this)
						     .aClass103_Sub3_9767
						     .aFloat9568)));
			    int i_563_ = i_560_ >> 16 & 0xff;
			    int i_564_ = i_560_ >> 8 & 0xff;
			    int i_565_ = i_560_ & 0xff;
			    i_563_ *= f_562_;
			    if (i_563_ < 0)
				i_563_ = 0;
			    else if (i_563_ > 255)
				i_563_ = 255;
			    i_564_ *= f_562_;
			    if (i_564_ < 0)
				i_564_ = 0;
			    else if (i_564_ > 255)
				i_564_ = 255;
			    i_565_ *= f_562_;
			    if (i_565_ < 0)
				i_565_ = 0;
			    else if (i_565_ > 255)
				i_565_ = 255;
			    i_560_ = i_563_ << 16 | i_564_ << 8 | i_565_;
			}
		    } else
			i_560_ = i_543_;
		    Unsafe unsafe = (((Class166_Sub1) this).aClass103_Sub3_9767
				     .anUnsafe9493);
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) i_533_);
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) (method3574(i_533_, i_534_,
							-221011970)
					     + i_539_));
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) i_534_);
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) i_533_);
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) i_534_);
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    if (((Class166_Sub1) this).anIntArrayArrayArray9775
			!= null) {
			unsafe.putFloat(((Class166_Sub1) this).aLong9793,
					(is_512_ != null
					 ? (float) (is_512_[i_532_] - 1)
					 : 0.0F));
			((Class166_Sub1) this).aLong9793 += 4L;
		    }
		    if ((((Class166_Sub1) this).anInt9789 & 0x7) != 0) {
			unsafe.putFloat(((Class166_Sub1) this).aLong9793,
					f_545_);
			((Class166_Sub1) this).aLong9793 += 4L;
			unsafe.putFloat(((Class166_Sub1) this).aLong9793,
					f_546_);
			((Class166_Sub1) this).aLong9793 += 4L;
			unsafe.putFloat(((Class166_Sub1) this).aLong9793,
					f_547_);
			((Class166_Sub1) this).aLong9793 += 4L;
		    }
		    if (((Class103_Sub3)
			 ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9633
			== 0) {
			int i_566_ = i_560_ & ~0xff00ff;
			i_566_ |= (i_560_ & 0xff0000) >> 16;
			i_566_ |= (i_560_ & 0xff) << 16;
			i_560_ = i_566_;
		    }
		    unsafe.putInt(((Class166_Sub1) this).aLong9792,
				  ~0xffffff | i_560_);
		    ((Class166_Sub1) this).aLong9792 += 4L;
		    i_559_ = ((Class166_Sub1) this).anInt9764++;
		    is_531_[i_532_] = (short) i_559_;
		    if (i_537_ != -1)
			class241_sub17s_505_[i_559_]
			    = class241_sub17s_506_[i_532_];
		    class407.put(new Class241_Sub7(is_531_[i_532_]), l);
		} else {
		    is_531_[i_532_] = ((Class241_Sub7) class241).aShort8826;
		    i_559_ = is_531_[i_532_] & 0xffff;
		    if (i_537_ != -1
			&& ((class241_sub17s_506_[i_532_].hashCode
			     * 4356572401218184725L)
			    < (class241_sub17s_505_[i_559_].hashCode
			       * 4356572401218184725L)))
			class241_sub17s_505_[i_559_]
			    = class241_sub17s_506_[i_532_];
		}
		for (int i_567_ = 0; i_567_ < i_528_; i_567_++)
		    class241_sub17s[i_567_].method15022(i_559_, i_543_, i_542_,
							f_544_);
		((Class166_Sub1) this).anInt9794++;
	    }
	}
    }
    
    void method16152(int i, int i_568_, byte[][] is,
		     Class241_Sub17[] class241_sub17s, HashTable class407,
		     Class241_Sub17[] class241_sub17s_569_) {
	if (((Class166_Sub1) this).anIntArrayArrayArray9757[i][i_568_]
	    != null) {
	    Class241_Sub17[] class241_sub17s_570_
		= (((Class166_Sub1) this).aClass241_Sub17ArrayArrayArray9769[i]
		   [i_568_]);
	    int[] is_571_
		= ((Class166_Sub1) this).anIntArrayArrayArray9772[i][i_568_];
	    int[] is_572_
		= ((Class166_Sub1) this).anIntArrayArrayArray9799[i][i_568_];
	    int[] is_573_
		= ((Class166_Sub1) this).anIntArrayArrayArray9771[i][i_568_];
	    int[] is_574_
		= ((Class166_Sub1) this).anIntArrayArrayArray9757[i][i_568_];
	    int[] is_575_
		= (((Class166_Sub1) this).anIntArrayArrayArray9774 != null
		   ? ((Class166_Sub1) this).anIntArrayArrayArray9774[i][i_568_]
		   : null);
	    int[] is_576_
		= (((Class166_Sub1) this).anIntArrayArrayArray9775 != null
		   ? ((Class166_Sub1) this).anIntArrayArrayArray9775[i][i_568_]
		   : null);
	    if (is_573_ == null)
		is_573_ = is_574_;
	    float f = ((Class166_Sub1) this).aFloatArrayArray9786[i][i_568_];
	    float f_577_
		= ((Class166_Sub1) this).aFloatArrayArray9787[i][i_568_];
	    float f_578_
		= ((Class166_Sub1) this).aFloatArrayArray9788[i][i_568_];
	    float f_579_
		= ((Class166_Sub1) this).aFloatArrayArray9786[i][i_568_ + 1];
	    float f_580_
		= ((Class166_Sub1) this).aFloatArrayArray9787[i][i_568_ + 1];
	    float f_581_
		= ((Class166_Sub1) this).aFloatArrayArray9788[i][i_568_ + 1];
	    float f_582_ = (((Class166_Sub1) this).aFloatArrayArray9786[i + 1]
			    [i_568_ + 1]);
	    float f_583_ = (((Class166_Sub1) this).aFloatArrayArray9787[i + 1]
			    [i_568_ + 1]);
	    float f_584_ = (((Class166_Sub1) this).aFloatArrayArray9788[i + 1]
			    [i_568_ + 1]);
	    float f_585_
		= ((Class166_Sub1) this).aFloatArrayArray9786[i + 1][i_568_];
	    float f_586_
		= ((Class166_Sub1) this).aFloatArrayArray9787[i + 1][i_568_];
	    float f_587_
		= ((Class166_Sub1) this).aFloatArrayArray9788[i + 1][i_568_];
	    int i_588_ = is[i][i_568_] & 0xff;
	    int i_589_ = is[i][i_568_ + 1] & 0xff;
	    int i_590_ = is[i + 1][i_568_ + 1] & 0xff;
	    int i_591_ = is[i + 1][i_568_] & 0xff;
	    int i_592_ = 0;
	while_126_:
	    for (int i_593_ = 0; i_593_ < is_574_.length; i_593_++) {
		Class241_Sub17 class241_sub17 = class241_sub17s_570_[i_593_];
		for (int i_594_ = 0; i_594_ < i_592_; i_594_++) {
		    if (class241_sub17s[i_594_] == class241_sub17)
			continue while_126_;
		}
		class241_sub17s[i_592_++] = class241_sub17;
	    }
	    short[] is_595_ = (((Class166_Sub1) this).aShortArrayArray9791
				   [i_568_ * (anInt2055 * 266270313) + i]
			       = new short[is_574_.length]);
	    for (int i_596_ = 0; i_596_ < is_574_.length; i_596_++) {
		int i_597_ = (i << anInt2054 * -122333825) + is_571_[i_596_];
		int i_598_
		    = (i_568_ << anInt2054 * -122333825) + is_572_[i_596_];
		int i_599_ = i_597_ >> ((Class166_Sub1) this).anInt9760;
		int i_600_ = i_598_ >> ((Class166_Sub1) this).anInt9760;
		int i_601_ = is_574_[i_596_];
		int i_602_ = is_573_[i_596_];
		int i_603_ = is_575_ != null ? is_575_[i_596_] : 0;
		long l = ((long) i_602_ << 48 | (long) i_601_ << 32
			  | (long) (i_599_ << 16) | (long) i_600_);
		int i_604_ = is_571_[i_596_];
		int i_605_ = is_572_[i_596_];
		int i_606_ = 74;
		int i_607_ = 0;
		float f_608_ = 1.0F;
		float f_609_;
		float f_610_;
		float f_611_;
		if (i_604_ == 0 && i_605_ == 0) {
		    f_609_ = f;
		    f_610_ = f_577_;
		    f_611_ = f_578_;
		    i_606_ -= i_588_;
		} else if (i_604_ == 0 && i_605_ == anInt2053 * 2039042417) {
		    f_609_ = f_579_;
		    f_610_ = f_580_;
		    f_611_ = f_581_;
		    i_606_ -= i_589_;
		} else if (i_604_ == anInt2053 * 2039042417
			   && i_605_ == anInt2053 * 2039042417) {
		    f_609_ = f_582_;
		    f_610_ = f_583_;
		    f_611_ = f_584_;
		    i_606_ -= i_590_;
		} else if (i_604_ == anInt2053 * 2039042417 && i_605_ == 0) {
		    f_609_ = f_585_;
		    f_610_ = f_586_;
		    f_611_ = f_587_;
		    i_606_ -= i_591_;
		} else {
		    float f_612_
			= (float) i_604_ / (float) (anInt2053 * 2039042417);
		    float f_613_
			= (float) i_605_ / (float) (anInt2053 * 2039042417);
		    float f_614_ = f + (f_585_ - f) * f_612_;
		    float f_615_ = f_577_ + (f_586_ - f_577_) * f_612_;
		    float f_616_ = f_578_ + (f_587_ - f_578_) * f_612_;
		    float f_617_ = f_579_ + (f_582_ - f_579_) * f_612_;
		    float f_618_ = f_580_ + (f_583_ - f_580_) * f_612_;
		    float f_619_ = f_581_ + (f_584_ - f_581_) * f_612_;
		    f_609_ = f_614_ + (f_617_ - f_614_) * f_613_;
		    f_610_ = f_615_ + (f_618_ - f_615_) * f_613_;
		    f_611_ = f_616_ + (f_619_ - f_616_) * f_613_;
		    int i_620_ = i_588_ + ((i_591_ - i_588_) * i_604_
					   >> anInt2054 * -122333825);
		    int i_621_ = i_589_ + ((i_590_ - i_589_) * i_604_
					   >> anInt2054 * -122333825);
		    i_606_ -= i_620_ + ((i_621_ - i_620_) * i_605_
					>> anInt2054 * -122333825);
		}
		if (i_601_ != -1) {
		    int i_622_ = (i_601_ & 0x7f) * i_606_ >> 7;
		    if (i_622_ < 2)
			i_622_ = 2;
		    else if (i_622_ > 126)
			i_622_ = 126;
		    i_607_ = Class474.anIntArray6380[i_601_ & 0xff80 | i_622_];
		    if ((((Class166_Sub1) this).anInt9789 & 0x7) == 0) {
			f_608_ = ((((Class166_Sub1) this).aClass103_Sub3_9767
				   .aFloatArray9558[0]) * f_609_
				  + (((Class166_Sub1) this).aClass103_Sub3_9767
				     .aFloatArray9558[1]) * f_610_
				  + (((Class166_Sub1) this).aClass103_Sub3_9767
				     .aFloatArray9558[2]) * f_611_);
			f_608_
			    = ((((Class166_Sub1) this).aClass103_Sub3_9767
				.aFloat9566)
			       + f_608_ * (f_608_ > 0.0F
					   ? (((Class166_Sub1) this)
					      .aClass103_Sub3_9767.aFloat9609)
					   : (((Class166_Sub1) this)
					      .aClass103_Sub3_9767
					      .aFloat9568)));
		    }
		}
		Node class241 = null;
		if ((i_597_ & ((Class166_Sub1) this).anInt9761 - 1) == 0
		    && (i_598_ & ((Class166_Sub1) this).anInt9761 - 1) == 0)
		    class241 = class407.get(l);
		int i_623_;
		if (class241 == null) {
		    int i_624_;
		    if (i_602_ != i_601_) {
			int i_625_ = (i_602_ & 0x7f) * i_606_ >> 7;
			if (i_625_ < 2)
			    i_625_ = 2;
			else if (i_625_ > 126)
			    i_625_ = 126;
			i_624_ = (Class474.anIntArray6380
				  [i_602_ & 0xff80 | i_625_]);
			if ((((Class166_Sub1) this).anInt9789 & 0x7) == 0) {
			    float f_626_
				= ((((Class166_Sub1) this).aClass103_Sub3_9767
				    .aFloatArray9558[0]) * f_609_
				   + ((((Class166_Sub1) this)
				       .aClass103_Sub3_9767.aFloatArray9558[1])
				      * f_610_)
				   + ((((Class166_Sub1) this)
				       .aClass103_Sub3_9767.aFloatArray9558[2])
				      * f_611_));
			    f_626_ = ((((Class166_Sub1) this)
				       .aClass103_Sub3_9767.aFloat9566)
				      + f_608_ * (f_608_ > 0.0F
						  ? (((Class166_Sub1) this)
						     .aClass103_Sub3_9767
						     .aFloat9609)
						  : (((Class166_Sub1) this)
						     .aClass103_Sub3_9767
						     .aFloat9568)));
			    int i_627_ = i_624_ >> 16 & 0xff;
			    int i_628_ = i_624_ >> 8 & 0xff;
			    int i_629_ = i_624_ & 0xff;
			    i_627_ *= f_626_;
			    if (i_627_ < 0)
				i_627_ = 0;
			    else if (i_627_ > 255)
				i_627_ = 255;
			    i_628_ *= f_626_;
			    if (i_628_ < 0)
				i_628_ = 0;
			    else if (i_628_ > 255)
				i_628_ = 255;
			    i_629_ *= f_626_;
			    if (i_629_ < 0)
				i_629_ = 0;
			    else if (i_629_ > 255)
				i_629_ = 255;
			    i_624_ = i_627_ << 16 | i_628_ << 8 | i_629_;
			}
		    } else
			i_624_ = i_607_;
		    Unsafe unsafe = (((Class166_Sub1) this).aClass103_Sub3_9767
				     .anUnsafe9493);
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) i_597_);
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) (method3574(i_597_, i_598_,
							1874566183)
					     + i_603_));
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) i_598_);
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) i_597_);
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) i_598_);
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    if (((Class166_Sub1) this).anIntArrayArrayArray9775
			!= null) {
			unsafe.putFloat(((Class166_Sub1) this).aLong9793,
					(is_576_ != null
					 ? (float) (is_576_[i_596_] - 1)
					 : 0.0F));
			((Class166_Sub1) this).aLong9793 += 4L;
		    }
		    if ((((Class166_Sub1) this).anInt9789 & 0x7) != 0) {
			unsafe.putFloat(((Class166_Sub1) this).aLong9793,
					f_609_);
			((Class166_Sub1) this).aLong9793 += 4L;
			unsafe.putFloat(((Class166_Sub1) this).aLong9793,
					f_610_);
			((Class166_Sub1) this).aLong9793 += 4L;
			unsafe.putFloat(((Class166_Sub1) this).aLong9793,
					f_611_);
			((Class166_Sub1) this).aLong9793 += 4L;
		    }
		    if (((Class103_Sub3)
			 ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9633
			== 0) {
			int i_630_ = i_624_ & ~0xff00ff;
			i_630_ |= (i_624_ & 0xff0000) >> 16;
			i_630_ |= (i_624_ & 0xff) << 16;
			i_624_ = i_630_;
		    }
		    unsafe.putInt(((Class166_Sub1) this).aLong9792,
				  ~0xffffff | i_624_);
		    ((Class166_Sub1) this).aLong9792 += 4L;
		    i_623_ = ((Class166_Sub1) this).anInt9764++;
		    is_595_[i_596_] = (short) i_623_;
		    if (i_601_ != -1)
			class241_sub17s_569_[i_623_]
			    = class241_sub17s_570_[i_596_];
		    class407.put(new Class241_Sub7(is_595_[i_596_]), l);
		} else {
		    is_595_[i_596_] = ((Class241_Sub7) class241).aShort8826;
		    i_623_ = is_595_[i_596_] & 0xffff;
		    if (i_601_ != -1
			&& ((class241_sub17s_570_[i_596_].hashCode
			     * 4356572401218184725L)
			    < (class241_sub17s_569_[i_623_].hashCode
			       * 4356572401218184725L)))
			class241_sub17s_569_[i_623_]
			    = class241_sub17s_570_[i_596_];
		}
		for (int i_631_ = 0; i_631_ < i_592_; i_631_++)
		    class241_sub17s[i_631_].method15022(i_623_, i_607_, i_606_,
							f_608_);
		((Class166_Sub1) this).anInt9794++;
	    }
	}
    }
    
    void method16153(int i, int i_632_, byte[][] is,
		     Class241_Sub17[] class241_sub17s, HashTable class407,
		     Class241_Sub17[] class241_sub17s_633_) {
	if (((Class166_Sub1) this).anIntArrayArrayArray9757[i][i_632_]
	    != null) {
	    Class241_Sub17[] class241_sub17s_634_
		= (((Class166_Sub1) this).aClass241_Sub17ArrayArrayArray9769[i]
		   [i_632_]);
	    int[] is_635_
		= ((Class166_Sub1) this).anIntArrayArrayArray9772[i][i_632_];
	    int[] is_636_
		= ((Class166_Sub1) this).anIntArrayArrayArray9799[i][i_632_];
	    int[] is_637_
		= ((Class166_Sub1) this).anIntArrayArrayArray9771[i][i_632_];
	    int[] is_638_
		= ((Class166_Sub1) this).anIntArrayArrayArray9757[i][i_632_];
	    int[] is_639_
		= (((Class166_Sub1) this).anIntArrayArrayArray9774 != null
		   ? ((Class166_Sub1) this).anIntArrayArrayArray9774[i][i_632_]
		   : null);
	    int[] is_640_
		= (((Class166_Sub1) this).anIntArrayArrayArray9775 != null
		   ? ((Class166_Sub1) this).anIntArrayArrayArray9775[i][i_632_]
		   : null);
	    if (is_637_ == null)
		is_637_ = is_638_;
	    float f = ((Class166_Sub1) this).aFloatArrayArray9786[i][i_632_];
	    float f_641_
		= ((Class166_Sub1) this).aFloatArrayArray9787[i][i_632_];
	    float f_642_
		= ((Class166_Sub1) this).aFloatArrayArray9788[i][i_632_];
	    float f_643_
		= ((Class166_Sub1) this).aFloatArrayArray9786[i][i_632_ + 1];
	    float f_644_
		= ((Class166_Sub1) this).aFloatArrayArray9787[i][i_632_ + 1];
	    float f_645_
		= ((Class166_Sub1) this).aFloatArrayArray9788[i][i_632_ + 1];
	    float f_646_ = (((Class166_Sub1) this).aFloatArrayArray9786[i + 1]
			    [i_632_ + 1]);
	    float f_647_ = (((Class166_Sub1) this).aFloatArrayArray9787[i + 1]
			    [i_632_ + 1]);
	    float f_648_ = (((Class166_Sub1) this).aFloatArrayArray9788[i + 1]
			    [i_632_ + 1]);
	    float f_649_
		= ((Class166_Sub1) this).aFloatArrayArray9786[i + 1][i_632_];
	    float f_650_
		= ((Class166_Sub1) this).aFloatArrayArray9787[i + 1][i_632_];
	    float f_651_
		= ((Class166_Sub1) this).aFloatArrayArray9788[i + 1][i_632_];
	    int i_652_ = is[i][i_632_] & 0xff;
	    int i_653_ = is[i][i_632_ + 1] & 0xff;
	    int i_654_ = is[i + 1][i_632_ + 1] & 0xff;
	    int i_655_ = is[i + 1][i_632_] & 0xff;
	    int i_656_ = 0;
	while_128_:
	    for (int i_657_ = 0; i_657_ < is_638_.length; i_657_++) {
		Class241_Sub17 class241_sub17 = class241_sub17s_634_[i_657_];
		for (int i_658_ = 0; i_658_ < i_656_; i_658_++) {
		    if (class241_sub17s[i_658_] == class241_sub17)
			continue while_128_;
		}
		class241_sub17s[i_656_++] = class241_sub17;
	    }
	    short[] is_659_ = (((Class166_Sub1) this).aShortArrayArray9791
				   [i_632_ * (anInt2055 * 266270313) + i]
			       = new short[is_638_.length]);
	    for (int i_660_ = 0; i_660_ < is_638_.length; i_660_++) {
		int i_661_ = (i << anInt2054 * -122333825) + is_635_[i_660_];
		int i_662_
		    = (i_632_ << anInt2054 * -122333825) + is_636_[i_660_];
		int i_663_ = i_661_ >> ((Class166_Sub1) this).anInt9760;
		int i_664_ = i_662_ >> ((Class166_Sub1) this).anInt9760;
		int i_665_ = is_638_[i_660_];
		int i_666_ = is_637_[i_660_];
		int i_667_ = is_639_ != null ? is_639_[i_660_] : 0;
		long l = ((long) i_666_ << 48 | (long) i_665_ << 32
			  | (long) (i_663_ << 16) | (long) i_664_);
		int i_668_ = is_635_[i_660_];
		int i_669_ = is_636_[i_660_];
		int i_670_ = 74;
		int i_671_ = 0;
		float f_672_ = 1.0F;
		float f_673_;
		float f_674_;
		float f_675_;
		if (i_668_ == 0 && i_669_ == 0) {
		    f_673_ = f;
		    f_674_ = f_641_;
		    f_675_ = f_642_;
		    i_670_ -= i_652_;
		} else if (i_668_ == 0 && i_669_ == anInt2053 * 2039042417) {
		    f_673_ = f_643_;
		    f_674_ = f_644_;
		    f_675_ = f_645_;
		    i_670_ -= i_653_;
		} else if (i_668_ == anInt2053 * 2039042417
			   && i_669_ == anInt2053 * 2039042417) {
		    f_673_ = f_646_;
		    f_674_ = f_647_;
		    f_675_ = f_648_;
		    i_670_ -= i_654_;
		} else if (i_668_ == anInt2053 * 2039042417 && i_669_ == 0) {
		    f_673_ = f_649_;
		    f_674_ = f_650_;
		    f_675_ = f_651_;
		    i_670_ -= i_655_;
		} else {
		    float f_676_
			= (float) i_668_ / (float) (anInt2053 * 2039042417);
		    float f_677_
			= (float) i_669_ / (float) (anInt2053 * 2039042417);
		    float f_678_ = f + (f_649_ - f) * f_676_;
		    float f_679_ = f_641_ + (f_650_ - f_641_) * f_676_;
		    float f_680_ = f_642_ + (f_651_ - f_642_) * f_676_;
		    float f_681_ = f_643_ + (f_646_ - f_643_) * f_676_;
		    float f_682_ = f_644_ + (f_647_ - f_644_) * f_676_;
		    float f_683_ = f_645_ + (f_648_ - f_645_) * f_676_;
		    f_673_ = f_678_ + (f_681_ - f_678_) * f_677_;
		    f_674_ = f_679_ + (f_682_ - f_679_) * f_677_;
		    f_675_ = f_680_ + (f_683_ - f_680_) * f_677_;
		    int i_684_ = i_652_ + ((i_655_ - i_652_) * i_668_
					   >> anInt2054 * -122333825);
		    int i_685_ = i_653_ + ((i_654_ - i_653_) * i_668_
					   >> anInt2054 * -122333825);
		    i_670_ -= i_684_ + ((i_685_ - i_684_) * i_669_
					>> anInt2054 * -122333825);
		}
		if (i_665_ != -1) {
		    int i_686_ = (i_665_ & 0x7f) * i_670_ >> 7;
		    if (i_686_ < 2)
			i_686_ = 2;
		    else if (i_686_ > 126)
			i_686_ = 126;
		    i_671_ = Class474.anIntArray6380[i_665_ & 0xff80 | i_686_];
		    if ((((Class166_Sub1) this).anInt9789 & 0x7) == 0) {
			f_672_ = ((((Class166_Sub1) this).aClass103_Sub3_9767
				   .aFloatArray9558[0]) * f_673_
				  + (((Class166_Sub1) this).aClass103_Sub3_9767
				     .aFloatArray9558[1]) * f_674_
				  + (((Class166_Sub1) this).aClass103_Sub3_9767
				     .aFloatArray9558[2]) * f_675_);
			f_672_
			    = ((((Class166_Sub1) this).aClass103_Sub3_9767
				.aFloat9566)
			       + f_672_ * (f_672_ > 0.0F
					   ? (((Class166_Sub1) this)
					      .aClass103_Sub3_9767.aFloat9609)
					   : (((Class166_Sub1) this)
					      .aClass103_Sub3_9767
					      .aFloat9568)));
		    }
		}
		Node class241 = null;
		if ((i_661_ & ((Class166_Sub1) this).anInt9761 - 1) == 0
		    && (i_662_ & ((Class166_Sub1) this).anInt9761 - 1) == 0)
		    class241 = class407.get(l);
		int i_687_;
		if (class241 == null) {
		    int i_688_;
		    if (i_666_ != i_665_) {
			int i_689_ = (i_666_ & 0x7f) * i_670_ >> 7;
			if (i_689_ < 2)
			    i_689_ = 2;
			else if (i_689_ > 126)
			    i_689_ = 126;
			i_688_ = (Class474.anIntArray6380
				  [i_666_ & 0xff80 | i_689_]);
			if ((((Class166_Sub1) this).anInt9789 & 0x7) == 0) {
			    float f_690_
				= ((((Class166_Sub1) this).aClass103_Sub3_9767
				    .aFloatArray9558[0]) * f_673_
				   + ((((Class166_Sub1) this)
				       .aClass103_Sub3_9767.aFloatArray9558[1])
				      * f_674_)
				   + ((((Class166_Sub1) this)
				       .aClass103_Sub3_9767.aFloatArray9558[2])
				      * f_675_));
			    f_690_ = ((((Class166_Sub1) this)
				       .aClass103_Sub3_9767.aFloat9566)
				      + f_672_ * (f_672_ > 0.0F
						  ? (((Class166_Sub1) this)
						     .aClass103_Sub3_9767
						     .aFloat9609)
						  : (((Class166_Sub1) this)
						     .aClass103_Sub3_9767
						     .aFloat9568)));
			    int i_691_ = i_688_ >> 16 & 0xff;
			    int i_692_ = i_688_ >> 8 & 0xff;
			    int i_693_ = i_688_ & 0xff;
			    i_691_ *= f_690_;
			    if (i_691_ < 0)
				i_691_ = 0;
			    else if (i_691_ > 255)
				i_691_ = 255;
			    i_692_ *= f_690_;
			    if (i_692_ < 0)
				i_692_ = 0;
			    else if (i_692_ > 255)
				i_692_ = 255;
			    i_693_ *= f_690_;
			    if (i_693_ < 0)
				i_693_ = 0;
			    else if (i_693_ > 255)
				i_693_ = 255;
			    i_688_ = i_691_ << 16 | i_692_ << 8 | i_693_;
			}
		    } else
			i_688_ = i_671_;
		    Unsafe unsafe = (((Class166_Sub1) this).aClass103_Sub3_9767
				     .anUnsafe9493);
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) i_661_);
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) (method3574(i_661_, i_662_,
							197308968)
					     + i_667_));
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) i_662_);
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) i_661_);
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    unsafe.putFloat(((Class166_Sub1) this).aLong9793,
				    (float) i_662_);
		    ((Class166_Sub1) this).aLong9793 += 4L;
		    if (((Class166_Sub1) this).anIntArrayArrayArray9775
			!= null) {
			unsafe.putFloat(((Class166_Sub1) this).aLong9793,
					(is_640_ != null
					 ? (float) (is_640_[i_660_] - 1)
					 : 0.0F));
			((Class166_Sub1) this).aLong9793 += 4L;
		    }
		    if ((((Class166_Sub1) this).anInt9789 & 0x7) != 0) {
			unsafe.putFloat(((Class166_Sub1) this).aLong9793,
					f_673_);
			((Class166_Sub1) this).aLong9793 += 4L;
			unsafe.putFloat(((Class166_Sub1) this).aLong9793,
					f_674_);
			((Class166_Sub1) this).aLong9793 += 4L;
			unsafe.putFloat(((Class166_Sub1) this).aLong9793,
					f_675_);
			((Class166_Sub1) this).aLong9793 += 4L;
		    }
		    if (((Class103_Sub3)
			 ((Class166_Sub1) this).aClass103_Sub3_9767).anInt9633
			== 0) {
			int i_694_ = i_688_ & ~0xff00ff;
			i_694_ |= (i_688_ & 0xff0000) >> 16;
			i_694_ |= (i_688_ & 0xff) << 16;
			i_688_ = i_694_;
		    }
		    unsafe.putInt(((Class166_Sub1) this).aLong9792,
				  ~0xffffff | i_688_);
		    ((Class166_Sub1) this).aLong9792 += 4L;
		    i_687_ = ((Class166_Sub1) this).anInt9764++;
		    is_659_[i_660_] = (short) i_687_;
		    if (i_665_ != -1)
			class241_sub17s_633_[i_687_]
			    = class241_sub17s_634_[i_660_];
		    class407.put(new Class241_Sub7(is_659_[i_660_]), l);
		} else {
		    is_659_[i_660_] = ((Class241_Sub7) class241).aShort8826;
		    i_687_ = is_659_[i_660_] & 0xffff;
		    if (i_665_ != -1
			&& ((class241_sub17s_634_[i_660_].hashCode
			     * 4356572401218184725L)
			    < (class241_sub17s_633_[i_687_].hashCode
			       * 4356572401218184725L)))
			class241_sub17s_633_[i_687_]
			    = class241_sub17s_634_[i_660_];
		}
		for (int i_695_ = 0; i_695_ < i_656_; i_695_++)
		    class241_sub17s[i_695_].method15022(i_687_, i_671_, i_670_,
							f_672_);
		((Class166_Sub1) this).anInt9794++;
	    }
	}
    }
    
    public void method3588(int i, int i_696_, int i_697_, boolean[][] bools,
			   boolean bool, int i_698_) {
	if (((Class166_Sub1) this).aClass241Array9778 != null) {
	    int i_699_ = i_697_ + i_697_ + 1;
	    i_699_ *= i_699_;
	    if (((Class166_Sub1) this).anIntArray9768.length < i_699_)
		((Class166_Sub1) this).anIntArray9768 = new int[i_699_];
	    int i_700_ = i - i_697_;
	    int i_701_ = i_700_;
	    if (i_700_ < 0)
		i_700_ = 0;
	    int i_702_ = i_696_ - i_697_;
	    int i_703_ = i_702_;
	    if (i_702_ < 0)
		i_702_ = 0;
	    int i_704_ = i + i_697_;
	    if (i_704_ > anInt2055 * 266270313 - 1)
		i_704_ = anInt2055 * 266270313 - 1;
	    int i_705_ = i_696_ + i_697_;
	    if (i_705_ > anInt2052 * -14610189 - 1)
		i_705_ = anInt2052 * -14610189 - 1;
	    ((Class166_Sub1) this).anInt9798 = 0;
	    for (int i_706_ = i_700_; i_706_ <= i_704_; i_706_++) {
		boolean[] bools_707_ = bools[i_706_ - i_701_];
		for (int i_708_ = i_702_; i_708_ <= i_705_; i_708_++) {
		    if (bools_707_[i_708_ - i_703_])
			((Class166_Sub1) this).anIntArray9768
			    [((Class166_Sub1) this).anInt9798++]
			    = i_708_ * (anInt2055 * 266270313) + i_706_;
		}
	    }
	    ByteBuffer bytebuffer
		= ((Class166_Sub1) this).aClass103_Sub3_9767.aByteBuffer9490;
	    bytebuffer.clear();
	    for (int i_709_ = 0;
		 i_709_ < ((Class166_Sub1) this).aClass241Array9778.length;
		 i_709_++) {
		Class241_Sub17 class241_sub17
		    = ((Class241_Sub17)
		       ((Class166_Sub1) this).aClass241Array9778[i_709_]);
		class241_sub17.method15025((((Class166_Sub1) this)
					    .anIntArray9768),
					   ((Class166_Sub1) this).anInt9798);
	    }
	    int i_710_ = bytebuffer.position();
	    Class361 class361
		= (((Class103_Sub3) ((Class166_Sub1) this).aClass103_Sub3_9767)
		   .aClass361_9540);
	    if (i_710_ != 0) {
		Interface33 interface33
		    = ((Class166_Sub1) this).aClass103_Sub3_9767
			  .method15630(i_710_ / 2);
		interface33.method268(0, i_710_,
				      (((Class166_Sub1) this)
				       .aClass103_Sub3_9767.aLong9491));
		((Class166_Sub1) this).aClass103_Sub3_9767.method15728();
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15955(0, ((Class166_Sub1) this).anInterface40_9765);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15718(interface33);
		class361.method6494(Class268.aClass268_4354);
		if (((Class166_Sub1) this).aClass103_Sub3_9767.anInt9613 > 0) {
		    class361.aClass287_5507.method5568
			((float) ((((Class166_Sub1) this).aClass103_Sub3_9767
				   .anInt9589) >> 16
				  & 0xff) / 255.0F,
			 (float) ((((Class166_Sub1) this).aClass103_Sub3_9767
				   .anInt9589) >> 8
				  & 0xff) / 255.0F,
			 (float) ((((Class166_Sub1) this).aClass103_Sub3_9767
				   .anInt9589) >> 0
				  & 0xff) / 255.0F);
		    class361.aClass285_5516.method5548(0.0F, 0.0F, 1.0F,
						       -(((Class166_Sub1) this)
							 .aClass103_Sub3_9767
							 .aFloat9615));
		    class361.aClass285_5516.method5543(((Class103_Sub3)
							(((Class166_Sub1) this)
							 .aClass103_Sub3_9767))
						       .aClass268_9645);
		    class361.aClass285_5516.method5531
			(1.0F / ((((Class166_Sub1) this).aClass103_Sub3_9767
				  .aFloat9616)
				 - (((Class166_Sub1) this).aClass103_Sub3_9767
				    .aFloat9615)));
		} else {
		    class361.aClass285_5516.method5548(0.0F, 0.0F, 0.0F, 0.0F);
		    class361.aClass287_5507.method5568(0.0F, 0.0F, 0.0F);
		}
		if ((((Class166_Sub1) this).anInt9789 & 0x7) == 0) {
		    int i_711_ = 0;
		    for (int i_712_ = 0;
			 (i_712_
			  < ((Class166_Sub1) this).aClass241Array9778.length);
			 i_712_++) {
			Class241_Sub17 class241_sub17
			    = (Class241_Sub17) (((Class166_Sub1) this)
						.aClass241Array9778[i_712_]);
			if (((Class241_Sub17) class241_sub17).anInt8993 != 0) {
			    if (((Class103_Sub3)
				 ((Class166_Sub1) this).aClass103_Sub3_9767)
				.aBool9565) {
				((Class166_Sub1) this).aClass103_Sub3_9767
				    .method2335
				    (0, (((Class241_Sub17) class241_sub17)
					 .aClass86_8987));
				class361.aClass285_5514.method5548
				    (0.0F, 1.0F, 0.0F,
				     ((float) (((Class103_Sub3)
						(((Class166_Sub1) this)
						 .aClass103_Sub3_9767))
					       .anInt9608)
				      + ((float) ((((Class241_Sub17)
						    class241_sub17)
						   .aClass86_8987.anInt1253)
						  * 642800105)
					 / 255.0F
					 * (float) ((((Class241_Sub17)
						      class241_sub17)
						     .aClass86_8987.anInt1252)
						    * -1282025259))));
				class361.aClass285_5514.method5531
				    (1.0F / (float) ((((Class241_Sub17)
						       class241_sub17)
						      .aClass86_8987.anInt1252)
						     * -1282025259));
				class361.aClass287_5515.method5568
				    ((float) (((((Class241_Sub17)
						 class241_sub17)
						.aClass86_8987.anInt1251)
					       * 1897985763) >> 16
					      & 0xff) / 255.0F,
				     (float) (((((Class241_Sub17)
						 class241_sub17)
						.aClass86_8987.anInt1251)
					       * 1897985763) >> 8
					      & 0xff) / 255.0F,
				     (float) (((((Class241_Sub17)
						 class241_sub17)
						.aClass86_8987.anInt1251)
					       * 1897985763) >> 0
					      & 0xff) / 255.0F);
			    } else {
				class361.aClass285_5514.method5548(0.0F, 0.0F,
								   0.0F, 0.0F);
				class361.aClass287_5515.method5568(0.0F, 0.0F,
								   0.0F);
			    }
			    boolean bool_713_ = false;
			    if (((Class241_Sub17) class241_sub17).anInt8985
				!= -1) {
				Class101 class101
				    = (((Class166_Sub1) this)
					   .aClass103_Sub3_9767.aClass107_1458
					   .method2680
				       ((((Class241_Sub17) class241_sub17)
					 .anInt8985),
					159861449));
				class361.anInterface41_5525
				    = ((Class103_Sub3) (((Class166_Sub1) this)
							.aClass103_Sub3_9767))
					  .aClass379_9518.method6844(class101);
				bool_713_
				    = !Class628.method13474(class101.aByte1427,
							    -768281831);
			    } else
				class361.anInterface41_5525
				    = (((Class166_Sub1) this)
				       .aClass103_Sub3_9767
				       .anInterface41_9584);
			    ((Class166_Sub1) this).aClass103_Sub3_9767
				.method15955
				(1, (((Class241_Sub17) class241_sub17)
				     .anInterface40_8990));
			    ((Class166_Sub1) this).aClass103_Sub3_9767
				.method15716
				(((Class166_Sub1) this).aClass366_9797);
			    class361.aClass268_5510.method5206
				(1.0F / (((Class241_Sub17) class241_sub17)
					 .aFloat8988),
				 1.0F / (((Class241_Sub17) class241_sub17)
					 .aFloat8988),
				 1.0F, 1.0F);
			    class361.anInt5522
				= ((Class241_Sub17) class241_sub17).anInt8994;
			    class361.anInt5523
				= (((Class241_Sub17) class241_sub17).anInt8989
				   - (((Class241_Sub17) class241_sub17)
				      .anInt8994)
				   + 1);
			    class361.anInt5506 = i_711_;
			    class361.anInt5517
				= (((Class241_Sub17) class241_sub17).anInt8993
				   / 3);
			    class361.method6495(bool_713_);
			    i_711_
				+= ((Class241_Sub17) class241_sub17).anInt8993;
			}
		    }
		} else {
		    class361.aClass287_5518.method5568((((Class166_Sub1) this)
							.aClass103_Sub3_9767
							.aFloatArray9558[0]),
						       (((Class166_Sub1) this)
							.aClass103_Sub3_9767
							.aFloatArray9558[1]),
						       (((Class166_Sub1) this)
							.aClass103_Sub3_9767
							.aFloatArray9558[2]));
		    class361.aClass287_5519.method5568
			((((Class166_Sub1) this).aClass103_Sub3_9767.aFloat9609
			  * (((Class166_Sub1) this).aClass103_Sub3_9767
			     .aFloat9563)),
			 (((Class166_Sub1) this).aClass103_Sub3_9767.aFloat9609
			  * (((Class166_Sub1) this).aClass103_Sub3_9767
			     .aFloat9564)),
			 (((Class166_Sub1) this).aClass103_Sub3_9767.aFloat9609
			  * (((Class166_Sub1) this).aClass103_Sub3_9767
			     .aFloat9556)));
		    class361.aClass287_5520.method5568
			((-(((Class166_Sub1) this).aClass103_Sub3_9767
			    .aFloat9568)
			  * (((Class166_Sub1) this).aClass103_Sub3_9767
			     .aFloat9563)),
			 (-(((Class166_Sub1) this).aClass103_Sub3_9767
			    .aFloat9568)
			  * (((Class166_Sub1) this).aClass103_Sub3_9767
			     .aFloat9564)),
			 (-(((Class166_Sub1) this).aClass103_Sub3_9767
			    .aFloat9568)
			  * (((Class166_Sub1) this).aClass103_Sub3_9767
			     .aFloat9556)));
		    class361.aClass287_5521.method5568
			((((Class166_Sub1) this).aClass103_Sub3_9767.aFloat9566
			  * (((Class166_Sub1) this).aClass103_Sub3_9767
			     .aFloat9563)),
			 (((Class166_Sub1) this).aClass103_Sub3_9767.aFloat9566
			  * (((Class166_Sub1) this).aClass103_Sub3_9767
			     .aFloat9564)),
			 (((Class166_Sub1) this).aClass103_Sub3_9767.aFloat9566
			  * (((Class166_Sub1) this).aClass103_Sub3_9767
			     .aFloat9556)));
		    int i_714_ = 0;
		    for (int i_715_ = 0;
			 (i_715_
			  < ((Class166_Sub1) this).aClass241Array9778.length);
			 i_715_++) {
			Class241_Sub17 class241_sub17
			    = (Class241_Sub17) (((Class166_Sub1) this)
						.aClass241Array9778[i_715_]);
			if (((Class241_Sub17) class241_sub17).anInt8993 > 0) {
			    if (((Class103_Sub3)
				 ((Class166_Sub1) this).aClass103_Sub3_9767)
				.aBool9565) {
				((Class166_Sub1) this).aClass103_Sub3_9767
				    .method2335
				    (0, (((Class241_Sub17) class241_sub17)
					 .aClass86_8987));
				float f = 0.15F;
				class361.aClass285_5514.method5548
				    (0.0F,
				     1.0F / ((float) ((((Class241_Sub17)
							class241_sub17)
						       .aClass86_8987
						       .anInt1252)
						      * -1282025259)
					     * f),
				     0.0F,
				     256.0F / ((float) ((((Class241_Sub17)
							  class241_sub17)
							 .aClass86_8987
							 .anInt1252)
							* -1282025259)
					       * f));
				class361.aClass287_5515.method5568
				    ((float) (((((Class241_Sub17)
						 class241_sub17)
						.aClass86_8987.anInt1251)
					       * 1897985763) >> 16
					      & 0xff) / 255.0F,
				     (float) (((((Class241_Sub17)
						 class241_sub17)
						.aClass86_8987.anInt1251)
					       * 1897985763) >> 8
					      & 0xff) / 255.0F,
				     (float) (((((Class241_Sub17)
						 class241_sub17)
						.aClass86_8987.anInt1251)
					       * 1897985763) >> 0
					      & 0xff) / 255.0F);
			    } else {
				class361.aClass285_5514.method5548(0.0F, 0.0F,
								   0.0F, 0.0F);
				class361.aClass287_5515.method5568(0.0F, 0.0F,
								   0.0F);
			    }
			    byte i_716_ = 11;
			    if (((Class241_Sub17) class241_sub17).anInt8985
				!= -1) {
				Class101 class101
				    = (((Class166_Sub1) this)
					   .aClass103_Sub3_9767.aClass107_1458
					   .method2680
				       ((((Class241_Sub17) class241_sub17)
					 .anInt8985),
					140543770));
				i_716_ = class101.aByte1427;
				class361.anInterface41_5525
				    = ((Class103_Sub3) (((Class166_Sub1) this)
							.aClass103_Sub3_9767))
					  .aClass379_9518.method6844(class101);
				class361.method6493(class101.aByte1428);
			    } else
				class361.anInterface41_5525
				    = (((Class166_Sub1) this)
				       .aClass103_Sub3_9767
				       .anInterface41_9584);
			    ((Class166_Sub1) this).aClass103_Sub3_9767
				.method15955
				(1, (((Class241_Sub17) class241_sub17)
				     .anInterface40_8990));
			    ((Class166_Sub1) this).aClass103_Sub3_9767
				.method15716
				(((Class166_Sub1) this).aClass366_9797);
			    class361.aClass268_5510.method5206
				(1.0F / (((Class241_Sub17) class241_sub17)
					 .aFloat8988),
				 1.0F / (((Class241_Sub17) class241_sub17)
					 .aFloat8988),
				 1.0F, 1.0F);
			    class361.anInt5522
				= ((Class241_Sub17) class241_sub17).anInt8994;
			    class361.anInt5523
				= (((Class241_Sub17) class241_sub17).anInt8989
				   - (((Class241_Sub17) class241_sub17)
				      .anInt8994)
				   + 1);
			    class361.anInt5506 = i_714_;
			    class361.anInt5517
				= (((Class241_Sub17) class241_sub17).anInt8993
				   / 3);
			    switch (i_716_) {
			    case 2:
			    case 4:
			    case 8:
			    case 9:
				if (!(((Class166_Sub1) this)
				      .aClass103_Sub3_9767.aBool9488)
				    && (((Class166_Sub1) this).anInt9789
					& 0x8) != 0
				    && ((Class103_Sub3) (((Class166_Sub1) this)
							 .aClass103_Sub3_9767))
					   .aClass369_Sub1_Sub2_9597
					   .method17597(842629158)) {
				    Class369_Sub1_Sub2 class369_sub1_sub2
					= (((Class103_Sub3)
					    (((Class166_Sub1) this)
					     .aClass103_Sub3_9767))
					   .aClass369_Sub1_Sub2_9597);
				    if (i_716_ == 2)
					class369_sub1_sub2
					    = (((Class103_Sub3)
						(((Class166_Sub1) this)
						 .aClass103_Sub3_9767))
					       .aClass369_Sub1_Sub2_9554);
				    class369_sub1_sub2.aClass268_11194
					.method5199
					(((Class166_Sub1) this)
					 .aClass103_Sub3_9767.aClass268_9526);
				    class369_sub1_sub2.aClass268_11179
					.method5206
					(1.0F / (((Class241_Sub17)
						  class241_sub17).aFloat8988
						 * (float) ((((Class241_Sub17)
							      class241_sub17)
							     .aClass86_8987
							     .anInt1255)
							    * -449077211)),
					 1.0F / (((Class241_Sub17)
						  class241_sub17).aFloat8988
						 * (float) ((((Class241_Sub17)
							      class241_sub17)
							     .aClass86_8987
							     .anInt1255)
							    * -449077211)),
					 1.0F, 1.0F);
				    class369_sub1_sub2.aClass287_11181
					.method5568
					((((Class103_Sub3)
					   (((Class166_Sub1) this)
					    .aClass103_Sub3_9767))
					  .aClass268_9505.aFloatArray4353[12]),
					 (((Class103_Sub3)
					   (((Class166_Sub1) this)
					    .aClass103_Sub3_9767))
					  .aClass268_9505.aFloatArray4353[13]),
					 (((Class103_Sub3)
					   (((Class166_Sub1) this)
					    .aClass103_Sub3_9767))
					  .aClass268_9505.aFloatArray4353
					  [14]));
				    Class101 class101
					= (((Class166_Sub1) this)
					       .aClass103_Sub3_9767
					       .aClass107_1458.method2680
					   ((((Class241_Sub17) class241_sub17)
					     .anInt8985),
					    -639415114));
				    class369_sub1_sub2.anInt11182
					= class101.aByte1428 * 1842143805;
				    class369_sub1_sub2.anInt11197
					= (((Class241_Sub17) class241_sub17)
					   .anInt8994) * -1594561985;
				    class369_sub1_sub2.anInt11200
					= ((((Class241_Sub17) class241_sub17)
					    .anInt8989)
					   - (((Class241_Sub17) class241_sub17)
					      .anInt8994)
					   + 1) * 590437495;
				    class369_sub1_sub2.anInt11198
					= i_714_ * -1201183163;
				    class369_sub1_sub2.anInt11176
					= (((Class241_Sub17) class241_sub17)
					   .anInt8993) / 3 * -65765357;
				    class369_sub1_sub2.aClass285_11192
					.method5525(class361.aClass285_5514);
				    class369_sub1_sub2.aClass287_11180
					.method5655(class361.aClass287_5515);
				    class369_sub1_sub2.aClass285_11190
					.method5525(class361.aClass285_5516);
				    class369_sub1_sub2.aClass287_11196
					.method5655(class361.aClass287_5507);
				    class369_sub1_sub2.method17593(1080235773);
				} else
				    class361.method6496(0);
				break;
			    case 7:
				class361.aClass287_5508.method5568
				    ((((Class103_Sub3) (((Class166_Sub1) this)
							.aClass103_Sub3_9767))
				      .aClass268_9505.aFloatArray4353[12]),
				     (((Class103_Sub3) (((Class166_Sub1) this)
							.aClass103_Sub3_9767))
				      .aClass268_9505.aFloatArray4353[13]),
				     (((Class103_Sub3) (((Class166_Sub1) this)
							.aClass103_Sub3_9767))
				      .aClass268_9505.aFloatArray4353[14]));
				class361.aClass268_5511.method5198();
				class361.anInterface30_5509
				    = ((Class166_Sub1) this)
					  .aClass103_Sub3_9767.method15636();
				class361.method6506(0);
				break;
			    default:
				if (((Class103_Sub3) (((Class166_Sub1) this)
						      .aClass103_Sub3_9767))
				    .aBool9565)
				    class361.method6508();
				else
				    class361.method6496(0);
				break;
			    case 1:
				class361.aClass287_5508.method5568
				    ((((Class103_Sub3) (((Class166_Sub1) this)
							.aClass103_Sub3_9767))
				      .aClass268_9505.aFloatArray4353[12]),
				     (((Class103_Sub3) (((Class166_Sub1) this)
							.aClass103_Sub3_9767))
				      .aClass268_9505.aFloatArray4353[13]),
				     (((Class103_Sub3) (((Class166_Sub1) this)
							.aClass103_Sub3_9767))
				      .aClass268_9505.aFloatArray4353[14]));
				if (((Class103_Sub3) (((Class166_Sub1) this)
						      .aClass103_Sub3_9767))
				    .aBool9565)
				    class361.method6500();
				else
				    class361.method6507(0);
				break;
			    case 6:
				class361.method6495
				    (!Class628.method13474(i_716_,
							   -768281831));
			    }
			    i_714_
				+= ((Class241_Sub17) class241_sub17).anInt8993;
			}
		    }
		}
	    }
	    if (!((Class166_Sub1) this).aClass429_9777.isEmpty(563058027)) {
		((Class166_Sub1) this).aClass103_Sub3_9767.method15640(128);
		((Class166_Sub1) this).aClass103_Sub3_9767.method15701(false);
		Class287 class287 = new Class287(class361.aClass287_5507);
		class361.aClass287_5507.method5568(0.0F, 0.0F, 0.0F);
		Iterator iterator
		    = ((Class166_Sub1) this).aClass429_9777.iterator();
		while (iterator.hasNext()) {
		    Class241_Sub8 class241_sub8
			= (Class241_Sub8) iterator.next();
		    class241_sub8.method14897(class361, i, i_696_, i_697_,
					      bools, bool);
		}
		class361.aClass287_5507.method5655(class287);
	    }
	    if (((Class166_Sub1) this).aClass364_9780 != null) {
		((Class166_Sub1) this).aClass103_Sub3_9767.method15640(1);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15955(0, ((Class166_Sub1) this).anInterface40_9765);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15955(1, ((Class166_Sub1) this).anInterface40_9781);
		((Class166_Sub1) this).aClass103_Sub3_9767
		    .method15716(((Class166_Sub1) this).aClass366_9797);
		Class268 class268 = (((Class166_Sub1) this).aClass103_Sub3_9767
				     .aClass268_9511);
		class268.method5198();
		class268.aFloatArray4353[13] = -1.0F;
		class361.method6494(class268);
		((Class166_Sub1) this).aClass364_9780
		    .method6533(class361, i, i_696_, i_697_, bools, bool);
	    }
	}
    }
    
    public void method3543(int i, int i_717_, int i_718_) {
	i = Math.min(((Class166_Sub1) this).aByteArrayArray9785.length - 1,
		     Math.max(0, i));
	i_717_ = Math.min((((Class166_Sub1) this).aByteArrayArray9785[i].length
			   - 1),
			  Math.max(0, i_717_));
	if ((((Class166_Sub1) this).aByteArrayArray9785[i][i_717_] & 0xff)
	    < i_718_)
	    ((Class166_Sub1) this).aByteArrayArray9785[i][i_717_]
		= (byte) i_718_;
    }
    
    void method16154(Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1,
		     int i, int i_719_) {
	int[] is = ((Class166_Sub1) this).anIntArrayArrayArray9772[i][i_719_];
	int[] is_720_
	    = ((Class166_Sub1) this).anIntArrayArrayArray9799[i][i_719_];
	int i_721_ = is.length;
	if (((Class166_Sub1) this).anIntArray9796.length < i_721_) {
	    ((Class166_Sub1) this).anIntArray9796 = new int[i_721_];
	    ((Class166_Sub1) this).anIntArray9795 = new int[i_721_];
	}
	for (int i_722_ = 0; i_722_ < i_721_; i_722_++) {
	    ((Class166_Sub1) this).anIntArray9796[i_722_]
		= is[i_722_] >> (((Class103_Sub3)
				  ((Class166_Sub1) this).aClass103_Sub3_9767)
				 .anInt9489);
	    ((Class166_Sub1) this).anIntArray9795[i_722_]
		= is_720_[i_722_] >> (((Class103_Sub3) (((Class166_Sub1) this)
							.aClass103_Sub3_9767))
				      .anInt9489);
	}
	int i_723_ = 0;
	while (i_723_ < i_721_) {
	    int i_724_ = ((Class166_Sub1) this).anIntArray9796[i_723_];
	    int i_725_ = ((Class166_Sub1) this).anIntArray9795[i_723_++];
	    int i_726_ = ((Class166_Sub1) this).anIntArray9796[i_723_];
	    int i_727_ = ((Class166_Sub1) this).anIntArray9795[i_723_++];
	    int i_728_ = ((Class166_Sub1) this).anIntArray9796[i_723_];
	    int i_729_ = ((Class166_Sub1) this).anIntArray9795[i_723_++];
	    if (((i_724_ - i_726_) * (i_727_ - i_729_)
		 - (i_727_ - i_725_) * (i_728_ - i_726_))
		> 0)
		class241_sub39_sub17_sub1.method17676(i_725_, i_727_, i_729_,
						      i_724_, i_726_, i_728_);
	}
    }
    
    void method16155(Class241_Sub39_Sub17_Sub1 class241_sub39_sub17_sub1,
		     int i, int i_730_) {
	int[] is = ((Class166_Sub1) this).anIntArrayArrayArray9772[i][i_730_];
	int[] is_731_
	    = ((Class166_Sub1) this).anIntArrayArrayArray9799[i][i_730_];
	int i_732_ = is.length;
	if (((Class166_Sub1) this).anIntArray9796.length < i_732_) {
	    ((Class166_Sub1) this).anIntArray9796 = new int[i_732_];
	    ((Class166_Sub1) this).anIntArray9795 = new int[i_732_];
	}
	for (int i_733_ = 0; i_733_ < i_732_; i_733_++) {
	    ((Class166_Sub1) this).anIntArray9796[i_733_]
		= is[i_733_] >> (((Class103_Sub3)
				  ((Class166_Sub1) this).aClass103_Sub3_9767)
				 .anInt9489);
	    ((Class166_Sub1) this).anIntArray9795[i_733_]
		= is_731_[i_733_] >> (((Class103_Sub3) (((Class166_Sub1) this)
							.aClass103_Sub3_9767))
				      .anInt9489);
	}
	int i_734_ = 0;
	while (i_734_ < i_732_) {
	    int i_735_ = ((Class166_Sub1) this).anIntArray9796[i_734_];
	    int i_736_ = ((Class166_Sub1) this).anIntArray9795[i_734_++];
	    int i_737_ = ((Class166_Sub1) this).anIntArray9796[i_734_];
	    int i_738_ = ((Class166_Sub1) this).anIntArray9795[i_734_++];
	    int i_739_ = ((Class166_Sub1) this).anIntArray9796[i_734_];
	    int i_740_ = ((Class166_Sub1) this).anIntArray9795[i_734_++];
	    if (((i_735_ - i_737_) * (i_738_ - i_740_)
		 - (i_738_ - i_736_) * (i_739_ - i_737_))
		> 0)
		class241_sub39_sub17_sub1.method17676(i_736_, i_738_, i_740_,
						      i_735_, i_737_, i_739_);
	}
    }
}
