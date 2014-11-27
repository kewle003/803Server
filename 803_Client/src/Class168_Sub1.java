/* Class168_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class168_Sub1 extends Class168
{
    boolean aBool9859;
    Interface41 anInterface41_9860;
    Interface4 anInterface4_9861;
    int anInt9862;
    int anInt9863;
    boolean aBool9864 = false;
    int anInt9865 = 0;
    Class103_Sub3 aClass103_Sub3_9866;
    int anInt9867;
    int anInt9868;
    int anInt9869;
    boolean aBool9870;
    boolean aBool9871;
    boolean aBool9872;
    
    public void method3639(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			   int i_4_) {
	int[] is = ((Class168_Sub1) this).aClass103_Sub3_9866
		       .method2251(i_3_, i_4_, i_1_, i_2_);
	if (is != null) {
	    for (int i_5_ = 0; i_5_ < is.length; i_5_++)
		is[i_5_] |= ~0xffffff;
	    method16200(i, i_0_, i_1_, i_2_, is, 0, i_1_);
	}
    }
    
    Class168_Sub1(Class103_Sub3 class103_sub3, int i, int i_6_, int[] is,
		  int i_7_, int i_8_) {
	((Class168_Sub1) this).anInt9863 = 0;
	((Class168_Sub1) this).anInt9867 = 0;
	((Class168_Sub1) this).anInt9868 = 0;
	((Class168_Sub1) this).aClass103_Sub3_9866 = class103_sub3;
	((Class168_Sub1) this).anInt9862 = i;
	((Class168_Sub1) this).anInt9869 = i_6_;
	((Class168_Sub1) this).anInterface4_9861 = null;
	((Class168_Sub1) this).anInterface41_9860
	    = class103_sub3.method15682(i, i_6_, false, is, i_7_, i_8_);
	((Class168_Sub1) this).anInterface41_9860.method228(true, true);
	((Class168_Sub1) this).aBool9872
	    = ((Class168_Sub1) this).anInterface41_9860.method55() != i;
	((Class168_Sub1) this).aBool9870
	    = ((Class168_Sub1) this).anInterface41_9860.method49() != i_6_;
	((Class168_Sub1) this).aBool9871
	    = (!((Class168_Sub1) this).aBool9872
	       && ((Class168_Sub1) this).anInterface41_9860.method227());
	((Class168_Sub1) this).aBool9859
	    = (!((Class168_Sub1) this).aBool9870
	       && ((Class168_Sub1) this).anInterface41_9860.method227());
    }
    
    Class168_Sub1(Class103_Sub3 class103_sub3, Interface41 interface41) {
	this(class103_sub3, interface41, interface41.method55(),
	     interface41.method49());
    }
    
    Class168_Sub1(Class103_Sub3 class103_sub3, Interface41 interface41, int i,
		  int i_9_) {
	((Class168_Sub1) this).anInt9863 = 0;
	((Class168_Sub1) this).anInt9867 = 0;
	((Class168_Sub1) this).anInt9868 = 0;
	((Class168_Sub1) this).aClass103_Sub3_9866 = class103_sub3;
	((Class168_Sub1) this).anInt9862 = i;
	((Class168_Sub1) this).anInt9869 = i_9_;
	((Class168_Sub1) this).anInterface41_9860 = interface41;
	((Class168_Sub1) this).anInterface4_9861 = null;
	((Class168_Sub1) this).aBool9872
	    = ((Class168_Sub1) this).anInterface41_9860.method55() != i;
	((Class168_Sub1) this).aBool9870
	    = ((Class168_Sub1) this).anInterface41_9860.method49() != i_9_;
	((Class168_Sub1) this).aBool9871
	    = (!((Class168_Sub1) this).aBool9872
	       && ((Class168_Sub1) this).anInterface41_9860.method227());
	((Class168_Sub1) this).aBool9859
	    = (!((Class168_Sub1) this).aBool9870
	       && ((Class168_Sub1) this).anInterface41_9860.method227());
    }
    
    public void method3675(int i, int i_10_, int i_11_, int i_12_, int i_13_,
			   int i_14_) {
	int[] is = ((Class168_Sub1) this).aClass103_Sub3_9866
		       .method2251(i_13_, i_14_, i_11_, i_12_);
	if (is != null) {
	    for (int i_15_ = 0; i_15_ < is.length; i_15_++)
		is[i_15_] |= ~0xffffff;
	    method16200(i, i_10_, i_11_, i_12_, is, 0, i_11_);
	}
    }
    
    public Interface4 method3608() {
	return ((Class168_Sub1) this).anInterface4_9861;
    }
    
    public void method3602(int i, int i_16_, int i_17_, int i_18_) {
	((Class168_Sub1) this).anInt9863 = i;
	((Class168_Sub1) this).anInt9865 = i_16_;
	((Class168_Sub1) this).anInt9868 = i_17_;
	((Class168_Sub1) this).anInt9867 = i_18_;
	((Class168_Sub1) this).aBool9864
	    = (((Class168_Sub1) this).anInt9863 != 0
	       || ((Class168_Sub1) this).anInt9865 != 0
	       || ((Class168_Sub1) this).anInt9868 != 0
	       || ((Class168_Sub1) this).anInt9867 != 0);
    }
    
    public void method3612(int[] is) {
	is[0] = ((Class168_Sub1) this).anInt9863;
	is[1] = ((Class168_Sub1) this).anInt9865;
	is[2] = ((Class168_Sub1) this).anInt9868;
	is[3] = ((Class168_Sub1) this).anInt9867;
    }
    
    public int method3631() {
	return ((Class168_Sub1) this).anInt9862;
    }
    
    public void method3679(int i, int i_19_, Class135 class135, int i_20_,
			   int i_21_) {
	((Class168_Sub1) this).aClass103_Sub3_9866.method15654();
	Class352 class352
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .aClass352_9593);
	class352.anInterface41_5433
	    = ((Class168_Sub1) this).anInterface41_9860;
	class352.method6408(1, -1);
	i += ((Class168_Sub1) this).anInt9863;
	i_19_ += ((Class168_Sub1) this).anInt9865;
	float f = (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2655();
	float f_22_
	    = (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			  ((byte) 4).method2654();
	class352.aClass268_5428.method5206
	    ((float) ((Class168_Sub1) this).anInt9862 * 2.0F / f,
	     (float) ((Class168_Sub1) this).anInt9869 * 2.0F / f_22_, 1.0F,
	     1.0F);
	class352.aClass268_5428.aFloatArray4353[12]
	    = (((float) i
		+ ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
	       * 2.0F / f) - 1.0F;
	class352.aClass268_5428.aFloatArray4353[13]
	    = (((float) i_19_
		+ ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
	       * 2.0F / f_22_) - 1.0F;
	class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
	class352.aClass268_5431.method5206
	    (((Class168_Sub1) this).anInterface41_9860
		 .method225((float) ((Class168_Sub1) this).anInt9862),
	     ((Class168_Sub1) this).anInterface41_9860
		 .method226((float) ((Class168_Sub1) this).anInt9869),
	     1.0F, 1.0F);
	class352.anInterface40_5432
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .anInterface40_9583);
	class352.anInt5434 = 0;
	class352.aClass366_5435
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .aClass366_9479);
	Interface41 interface41
	    = ((Class135_Sub2) (Class135_Sub2) class135).anInterface41_10002;
	class352.anInterface41_5429 = interface41;
	class352.aClass268_5427.method5206
	    (interface41.method225((float) ((Class168_Sub1) this).anInt9862),
	     interface41.method226((float) ((Class168_Sub1) this).anInt9869),
	     1.0F, 1.0F);
	class352.aClass268_5427.aFloatArray4353[12]
	    = interface41.method225((float) (i - i_20_));
	class352.aClass268_5427.aFloatArray4353[13]
	    = interface41.method226((float) (i_19_ - i_21_));
	class352.method6415();
    }
    
    public int method3606() {
	return ((Class168_Sub1) this).anInt9869;
    }
    
    Class168_Sub1(Class103_Sub3 class103_sub3, int i, int i_23_, boolean bool,
		  boolean bool_24_) {
	((Class168_Sub1) this).anInt9863 = 0;
	((Class168_Sub1) this).anInt9867 = 0;
	((Class168_Sub1) this).anInt9868 = 0;
	((Class168_Sub1) this).aClass103_Sub3_9866 = class103_sub3;
	((Class168_Sub1) this).anInt9862 = i;
	((Class168_Sub1) this).anInt9869 = i_23_;
	if (bool_24_) {
	    Interface43 interface43
		= class103_sub3.method15684((bool ? Class175.aClass175_2110
					     : Class175.aClass175_2111),
					    Class102.aClass102_1440, i, i_23_);
	    ((Class168_Sub1) this).anInterface4_9861
		= interface43.method274(0);
	    ((Class168_Sub1) this).anInterface41_9860 = interface43;
	} else {
	    ((Class168_Sub1) this).anInterface41_9860
		= class103_sub3.method15679((bool ? Class175.aClass175_2110
					     : Class175.aClass175_2111),
					    Class102.aClass102_1440, i, i_23_);
	    ((Class168_Sub1) this).anInterface4_9861 = null;
	}
	((Class168_Sub1) this).anInterface41_9860.method228(true, true);
	((Class168_Sub1) this).aBool9872
	    = ((Class168_Sub1) this).anInterface41_9860.method55() != i;
	((Class168_Sub1) this).aBool9870
	    = ((Class168_Sub1) this).anInterface41_9860.method49() != i_23_;
	((Class168_Sub1) this).aBool9871
	    = (!((Class168_Sub1) this).aBool9872
	       && ((Class168_Sub1) this).anInterface41_9860.method227());
	((Class168_Sub1) this).aBool9859
	    = (!((Class168_Sub1) this).aBool9870
	       && ((Class168_Sub1) this).anInterface41_9860.method227());
    }
    
    public int method64() {
	return (((Class168_Sub1) this).anInt9862
		+ ((Class168_Sub1) this).anInt9863
		+ ((Class168_Sub1) this).anInt9868);
    }
    
    public Interface4 method3654() {
	return ((Class168_Sub1) this).anInterface4_9861;
    }
    
    public void method3666(int i, int i_25_, int i_26_, int i_27_, int i_28_) {
	if (((Class168_Sub1) this).aClass103_Sub3_9866.method15624()
	    != Class376.aClass376_5635) {
	    i += ((Class168_Sub1) this).anInt9863;
	    i_25_ += ((Class168_Sub1) this).anInt9865;
	    ((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		.aClass390_9547.method6972
		((float) i, (float) i_25_,
		 (float) (i + ((Class168_Sub1) this).anInt9862),
		 (float) (i_25_ + ((Class168_Sub1) this).anInt9869), 0.0F,
		 0.0F, ((Class168_Sub1) this).anInterface41_9860.method242(),
		 ((Class168_Sub1) this).anInterface41_9860.method233(),
		 ((Class168_Sub1) this).anInterface41_9860, i_27_);
	} else {
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15654();
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15640(i_28_);
	    Class352 class352
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass352_9593);
	    class352.anInterface41_5433
		= ((Class168_Sub1) this).anInterface41_9860;
	    class352.method6408(i_26_, i_27_);
	    i += ((Class168_Sub1) this).anInt9863;
	    i_25_ += ((Class168_Sub1) this).anInt9865;
	    float f
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2655();
	    float f_29_
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2654();
	    class352.aClass268_5428.method5206
		((float) ((Class168_Sub1) this).anInt9862 * 2.0F / f,
		 (float) ((Class168_Sub1) this).anInt9869 * 2.0F / f_29_, 1.0F,
		 1.0F);
	    class352.aClass268_5428.aFloatArray4353[12]
		= (((float) i
		    + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
		   * 2.0F / f) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[13]
		= (((float) i_25_
		    + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
		   * 2.0F / f_29_) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
	    class352.aClass268_5431.method5206
		(((Class168_Sub1) this).anInterface41_9860
		     .method225((float) ((Class168_Sub1) this).anInt9862),
		 ((Class168_Sub1) this).anInterface41_9860
		     .method226((float) ((Class168_Sub1) this).anInt9869),
		 1.0F, 1.0F);
	    class352.anInterface40_5432
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .anInterface40_9583);
	    class352.anInt5434 = 0;
	    class352.aClass366_5435
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass366_9479);
	    class352.method6410();
	}
    }
    
    public void method3653(int i, int i_30_, int i_31_) {
	int[] is = (((Class168_Sub1) this).aClass103_Sub3_9866.method2251
		    (i, i_30_, ((Class168_Sub1) this).anInt9862,
		     ((Class168_Sub1) this).anInt9869));
	int[] is_32_ = new int[(((Class168_Sub1) this).anInt9862
				* ((Class168_Sub1) this).anInt9869)];
	((Class168_Sub1) this).anInterface41_9860.method231
	    (0, 0, ((Class168_Sub1) this).anInt9862,
	     ((Class168_Sub1) this).anInt9869, is_32_, 0);
	if (i_31_ == 0) {
	    for (int i_33_ = 0; i_33_ < ((Class168_Sub1) this).anInt9869;
		 i_33_++) {
		int i_34_ = i_33_ * ((Class168_Sub1) this).anInt9862;
		for (int i_35_ = 0; i_35_ < ((Class168_Sub1) this).anInt9862;
		     i_35_++)
		    is_32_[i_34_ + i_35_]
			= (is_32_[i_34_ + i_35_] & 0xffffff
			   | is[i_34_ + i_35_] << 8 & ~0xffffff);
	    }
	} else if (i_31_ == 1) {
	    for (int i_36_ = 0; i_36_ < ((Class168_Sub1) this).anInt9869;
		 i_36_++) {
		int i_37_ = i_36_ * ((Class168_Sub1) this).anInt9862;
		for (int i_38_ = 0; i_38_ < ((Class168_Sub1) this).anInt9862;
		     i_38_++)
		    is_32_[i_37_ + i_38_]
			= (is_32_[i_37_ + i_38_] & 0xffffff
			   | is[i_37_ + i_38_] << 16 & ~0xffffff);
	    }
	} else if (i_31_ == 2) {
	    for (int i_39_ = 0; i_39_ < ((Class168_Sub1) this).anInt9869;
		 i_39_++) {
		int i_40_ = i_39_ * ((Class168_Sub1) this).anInt9862;
		for (int i_41_ = 0; i_41_ < ((Class168_Sub1) this).anInt9862;
		     i_41_++)
		    is_32_[i_40_ + i_41_]
			= (is_32_[i_40_ + i_41_] & 0xffffff
			   | is[i_40_ + i_41_] << 24 & ~0xffffff);
	    }
	} else if (i_31_ == 3) {
	    for (int i_42_ = 0; i_42_ < ((Class168_Sub1) this).anInt9869;
		 i_42_++) {
		int i_43_ = i_42_ * ((Class168_Sub1) this).anInt9862;
		for (int i_44_ = 0; i_44_ < ((Class168_Sub1) this).anInt9862;
		     i_44_++)
		    is_32_[i_43_ + i_44_]
			= (is_32_[i_43_ + i_44_] & 0xffffff
			   | (is[i_43_ + i_44_] != 0 ? -16777216 : 0));
	    }
	}
	method16200(0, 0, ((Class168_Sub1) this).anInt9862,
		    ((Class168_Sub1) this).anInt9869, is_32_, 0,
		    ((Class168_Sub1) this).anInt9862);
    }
    
    void method3670(int i, int i_45_, int i_46_, int i_47_, int i_48_,
		    int i_49_, int i_50_, int i_51_) {
	if (((Class168_Sub1) this).aClass103_Sub3_9866.method15624()
	    != Class376.aClass376_5635) {
	    if (((Class168_Sub1) this).aBool9864) {
		i_46_ = i_46_ * ((Class168_Sub1) this).anInt9862 / method64();
		i_47_
		    = i_47_ * ((Class168_Sub1) this).anInt9869 / method3616();
		i += (((Class168_Sub1) this).anInt9863 * i_46_
		      / ((Class168_Sub1) this).anInt9862);
		i_45_ += (((Class168_Sub1) this).anInt9865 * i_47_
			  / ((Class168_Sub1) this).anInt9869);
	    }
	    ((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		.aClass390_9547.method6972
		((float) i, (float) i_45_, (float) (i + i_46_),
		 (float) (i_45_ + i_47_),
		 ((Class168_Sub1) this).anInterface41_9860.method225(0.0F),
		 ((Class168_Sub1) this).anInterface41_9860.method226(0.0F),
		 ((Class168_Sub1) this).anInterface41_9860
		     .method225((float) ((Class168_Sub1) this).anInt9862),
		 ((Class168_Sub1) this).anInterface41_9860
		     .method226((float) ((Class168_Sub1) this).anInt9869),
		 ((Class168_Sub1) this).anInterface41_9860, i_49_);
	} else {
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15654();
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15640(i_50_);
	    Class352 class352
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass352_9593);
	    class352.anInterface41_5433
		= ((Class168_Sub1) this).anInterface41_9860;
	    class352.method6408(i_48_, i_49_);
	    if (((Class168_Sub1) this).aBool9864) {
		i_46_ = i_46_ * ((Class168_Sub1) this).anInt9862 / method64();
		i_47_
		    = i_47_ * ((Class168_Sub1) this).anInt9869 / method3616();
		i += (((Class168_Sub1) this).anInt9863 * i_46_
		      / ((Class168_Sub1) this).anInt9862);
		i_45_ += (((Class168_Sub1) this).anInt9865 * i_47_
			  / ((Class168_Sub1) this).anInt9869);
	    }
	    float f
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2655();
	    float f_52_
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2654();
	    class352.aClass268_5428.method5206((float) i_46_ * 2.0F / f,
					       (float) i_47_ * 2.0F / f_52_,
					       1.0F, 1.0F);
	    class352.aClass268_5428.aFloatArray4353[12]
		= (((float) i
		    + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
		   * 2.0F / f) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[13]
		= (((float) i_45_
		    + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
		   * 2.0F / f_52_) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
	    class352.aClass268_5431.method5206
		(((Class168_Sub1) this).anInterface41_9860
		     .method225((float) ((Class168_Sub1) this).anInt9862),
		 ((Class168_Sub1) this).anInterface41_9860
		     .method226((float) ((Class168_Sub1) this).anInt9869),
		 1.0F, 1.0F);
	    class352.anInterface40_5432
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .anInterface40_9583);
	    class352.anInt5434 = 0;
	    class352.aClass366_5435
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass366_9479);
	    class352.method6410();
	}
    }
    
    public void method3618(int i, int i_53_, int i_54_, int i_55_, int i_56_,
			   int i_57_, int i_58_) {
	if (((Class168_Sub1) this).aClass103_Sub3_9866.method15624()
	    != Class376.aClass376_5635) {
	    int i_59_ = i_53_ + i_55_;
	    int i_60_ = i + i_54_;
	    int i_61_ = method64();
	    int i_62_ = method3616();
	    int i_63_ = i_53_ + ((Class168_Sub1) this).anInt9865;
	    for (int i_64_ = i_63_ + ((Class168_Sub1) this).anInt9869;
		 i_64_ <= i_59_; i_64_ += i_62_) {
		int i_65_ = i + ((Class168_Sub1) this).anInt9863;
		for (int i_66_ = i_65_ + ((Class168_Sub1) this).anInt9862;
		     i_66_ <= i_60_; i_66_ += i_61_) {
		    ((Class103_Sub3)
		     ((Class168_Sub1) this).aClass103_Sub3_9866)
			.aClass390_9547.method6972
			((float) i_65_, (float) i_63_,
			 (float) (i_65_ + ((Class168_Sub1) this).anInt9862),
			 (float) (i_63_ + ((Class168_Sub1) this).anInt9869),
			 0.0F, 0.0F,
			 ((Class168_Sub1) this).anInterface41_9860.method242(),
			 ((Class168_Sub1) this).anInterface41_9860.method233(),
			 ((Class168_Sub1) this).anInterface41_9860, i_57_);
		    i_65_ += i_61_;
		}
		if (i_65_ < i_60_) {
		    int i_67_ = i_60_ - i_65_;
		    ((Class103_Sub3)
		     ((Class168_Sub1) this).aClass103_Sub3_9866)
			.aClass390_9547.method6972
			((float) i_65_, (float) i_63_, (float) (i_65_ + i_67_),
			 (float) (i_63_ + ((Class168_Sub1) this).anInt9869),
			 0.0F, 0.0F,
			 ((float) i_67_
			  / (float) ((Class168_Sub1) this).anInt9862
			  * ((Class168_Sub1) this).anInterface41_9860
				.method242()),
			 ((Class168_Sub1) this).anInterface41_9860.method233(),
			 ((Class168_Sub1) this).anInterface41_9860, i_57_);
		}
		i_63_ += i_62_;
	    }
	    if (i_63_ < i_59_) {
		int i_68_ = i_59_ - i_63_;
		float f
		    = ((float) i_68_ / (float) ((Class168_Sub1) this).anInt9869
		       * ((Class168_Sub1) this).anInterface41_9860
			     .method233());
		int i_69_ = i + ((Class168_Sub1) this).anInt9863;
		for (int i_70_ = i_69_ + ((Class168_Sub1) this).anInt9862;
		     i_70_ <= i_60_; i_70_ += i_61_) {
		    ((Class103_Sub3)
		     ((Class168_Sub1) this).aClass103_Sub3_9866)
			.aClass390_9547.method6972
			((float) i_69_, (float) i_63_,
			 (float) (i_69_ + ((Class168_Sub1) this).anInt9862),
			 (float) (i_63_ + i_68_), 0.0F, 0.0F,
			 ((Class168_Sub1) this).anInterface41_9860.method242(),
			 f, ((Class168_Sub1) this).anInterface41_9860, i_57_);
		    i_69_ += i_61_;
		}
		if (i_69_ < i_60_) {
		    int i_71_ = i_60_ - i_69_;
		    ((Class103_Sub3)
		     ((Class168_Sub1) this).aClass103_Sub3_9866)
			.aClass390_9547.method6972
			((float) i_69_, (float) i_63_, (float) (i_69_ + i_71_),
			 (float) (i_63_ + i_68_), 0.0F, 0.0F,
			 ((float) i_71_
			  / (float) ((Class168_Sub1) this).anInt9862
			  * ((Class168_Sub1) this).anInterface41_9860
				.method242()),
			 f, ((Class168_Sub1) this).anInterface41_9860, i_57_);
		}
	    }
	} else {
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15654();
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15640(i_58_);
	    Class352 class352
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass352_9593);
	    class352.anInterface41_5433
		= ((Class168_Sub1) this).anInterface41_9860;
	    class352.method6408(i_56_, i_57_);
	    float f
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2655();
	    float f_72_
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2654();
	    class352.anInterface40_5432
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .anInterface40_9583);
	    class352.anInt5434 = 0;
	    class352.aClass366_5435
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass366_9479);
	    boolean bool = (((Class168_Sub1) this).aBool9859
			    && ((Class168_Sub1) this).anInt9865 == 0
			    && ((Class168_Sub1) this).anInt9867 == 0);
	    boolean bool_73_ = (((Class168_Sub1) this).aBool9871
				&& ((Class168_Sub1) this).anInt9863 == 0
				&& ((Class168_Sub1) this).anInt9868 == 0);
	    if (bool_73_ & bool) {
		class352.aClass268_5428.method5206((float) i_54_ * 2.0F / f,
						   ((float) i_55_ * 2.0F
						    / f_72_),
						   1.0F, 1.0F);
		class352.aClass268_5428.aFloatArray4353[12]
		    = ((float) i + ((Class168_Sub1) this)
				       .aClass103_Sub3_9866
				       .method15622()) * 2.0F / f - 1.0F;
		class352.aClass268_5428.aFloatArray4353[13]
		    = (((float) i_53_ + ((Class168_Sub1) this)
					    .aClass103_Sub3_9866.method15622())
		       * 2.0F / f_72_) - 1.0F;
		class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
		class352.aClass268_5431.method5206
		    (((Class168_Sub1) this).anInterface41_9860
			 .method225((float) i_54_),
		     ((Class168_Sub1) this).anInterface41_9860
			 .method226((float) i_55_),
		     1.0F, 1.0F);
		class352.method6410();
	    } else if (bool_73_) {
		int i_74_ = i_53_ + i_55_;
		int i_75_ = method3616();
		class352.aClass268_5431.method5206
		    (((Class168_Sub1) this).anInterface41_9860
			 .method225((float) i_54_),
		     ((Class168_Sub1) this).anInterface41_9860
			 .method226((float) ((Class168_Sub1) this).anInt9869),
		     1.0F, 1.0F);
		int i_76_ = i_53_ + ((Class168_Sub1) this).anInt9865;
		for (int i_77_ = i_76_ + ((Class168_Sub1) this).anInt9869;
		     i_77_ <= i_74_; i_77_ += i_75_) {
		    class352.aClass268_5428.method5206
			((float) i_54_ * 2.0F / f,
			 ((float) ((Class168_Sub1) this).anInt9869 * 2.0F
			  / f_72_),
			 1.0F, 1.0F);
		    class352.aClass268_5428.aFloatArray4353[12]
			= (((float) i + ((Class168_Sub1) this)
					    .aClass103_Sub3_9866.method15622())
			   * 2.0F / f) - 1.0F;
		    class352.aClass268_5428.aFloatArray4353[13]
			= ((float) i_76_
			   + ((Class168_Sub1) this).aClass103_Sub3_9866
				 .method15622()) * 2.0F / f_72_ - 1.0F;
		    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
		    class352.method6410();
		    i_76_ += i_75_;
		}
		if (i_76_ < i_74_) {
		    int i_78_ = i_74_ - i_76_;
		    class352.aClass268_5431.method5206
			(((Class168_Sub1) this).anInterface41_9860
			     .method225((float) i_54_),
			 ((Class168_Sub1) this).anInterface41_9860
			     .method226((float) i_78_),
			 1.0F, 1.0F);
		    class352.aClass268_5428.method5206(((float) i_54_ * 2.0F
							/ f),
						       ((float) i_78_ * 2.0F
							/ f_72_),
						       1.0F, 1.0F);
		    class352.aClass268_5428.aFloatArray4353[12]
			= (((float) i + ((Class168_Sub1) this)
					    .aClass103_Sub3_9866.method15622())
			   * 2.0F / f) - 1.0F;
		    class352.aClass268_5428.aFloatArray4353[13]
			= ((float) i_76_
			   + ((Class168_Sub1) this).aClass103_Sub3_9866
				 .method15622()) * 2.0F / f_72_ - 1.0F;
		    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
		    class352.method6410();
		}
	    } else if (bool) {
		int i_79_ = i + i_54_;
		int i_80_ = method64();
		class352.aClass268_5431.method5206
		    (((Class168_Sub1) this).anInterface41_9860
			 .method225((float) ((Class168_Sub1) this).anInt9862),
		     ((Class168_Sub1) this).anInterface41_9860
			 .method226((float) i_55_),
		     1.0F, 1.0F);
		int i_81_ = i + ((Class168_Sub1) this).anInt9863;
		for (int i_82_ = i_81_ + ((Class168_Sub1) this).anInt9862;
		     i_82_ <= i_79_; i_82_ += i_80_) {
		    class352.aClass268_5428.method5206
			((float) ((Class168_Sub1) this).anInt9862 * 2.0F / f,
			 (float) i_55_ * 2.0F / f_72_, 1.0F, 1.0F);
		    class352.aClass268_5428.aFloatArray4353[12]
			= ((float) i_81_
			   + ((Class168_Sub1) this).aClass103_Sub3_9866
				 .method15622()) * 2.0F / f - 1.0F;
		    class352.aClass268_5428.aFloatArray4353[13]
			= ((float) i_53_
			   + ((Class168_Sub1) this).aClass103_Sub3_9866
				 .method15622()) * 2.0F / f_72_ - 1.0F;
		    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
		    class352.method6410();
		    i_81_ += i_80_;
		}
		if (i_81_ < i_79_) {
		    int i_83_ = i_79_ - i_81_;
		    class352.aClass268_5431.method5206
			(((Class168_Sub1) this).anInterface41_9860
			     .method225((float) i_83_),
			 ((Class168_Sub1) this).anInterface41_9860
			     .method226((float) i_55_),
			 1.0F, 1.0F);
		    class352.aClass268_5428.method5206(((float) i_83_ * 2.0F
							/ f),
						       ((float) i_55_ * 2.0F
							/ f_72_),
						       1.0F, 1.0F);
		    class352.aClass268_5428.aFloatArray4353[12]
			= ((float) i_81_
			   + ((Class168_Sub1) this).aClass103_Sub3_9866
				 .method15622()) * 2.0F / f - 1.0F;
		    class352.aClass268_5428.aFloatArray4353[13]
			= ((float) i_53_
			   + ((Class168_Sub1) this).aClass103_Sub3_9866
				 .method15622()) * 2.0F / f_72_ - 1.0F;
		    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
		    class352.method6410();
		}
	    } else {
		int i_84_ = i_53_ + i_55_;
		int i_85_ = i + i_54_;
		int i_86_ = method64();
		int i_87_ = method3616();
		int i_88_ = i_53_ + ((Class168_Sub1) this).anInt9865;
		for (int i_89_ = i_88_ + ((Class168_Sub1) this).anInt9869;
		     i_89_ <= i_84_; i_89_ += i_87_) {
		    class352.aClass268_5431.method5206
			((((Class168_Sub1) this).anInterface41_9860.method225
			  ((float) ((Class168_Sub1) this).anInt9862)),
			 (((Class168_Sub1) this).anInterface41_9860.method226
			  ((float) ((Class168_Sub1) this).anInt9869)),
			 1.0F, 1.0F);
		    int i_90_ = i + ((Class168_Sub1) this).anInt9863;
		    for (int i_91_ = i_90_ + ((Class168_Sub1) this).anInt9862;
			 i_91_ <= i_85_; i_91_ += i_86_) {
			class352.aClass268_5428.method5206
			    (((float) ((Class168_Sub1) this).anInt9862 * 2.0F
			      / f),
			     ((float) ((Class168_Sub1) this).anInt9869 * 2.0F
			      / f_72_),
			     1.0F, 1.0F);
			class352.aClass268_5428.aFloatArray4353[12]
			    = ((float) i_90_
			       + ((Class168_Sub1) this).aClass103_Sub3_9866
				     .method15622()) * 2.0F / f - 1.0F;
			class352.aClass268_5428.aFloatArray4353[13]
			    = ((float) i_88_
			       + ((Class168_Sub1) this).aClass103_Sub3_9866
				     .method15622()) * 2.0F / f_72_ - 1.0F;
			class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
			class352.method6410();
			i_90_ += i_86_;
		    }
		    if (i_90_ < i_85_) {
			int i_92_ = i_85_ - i_90_;
			class352.aClass268_5431.method5206
			    (((Class168_Sub1) this).anInterface41_9860
				 .method225((float) i_92_),
			     (((Class168_Sub1) this).anInterface41_9860
				  .method226
			      ((float) ((Class168_Sub1) this).anInt9869)),
			     1.0F, 1.0F);
			class352.aClass268_5428.method5206
			    ((float) i_92_ * 2.0F / f,
			     ((float) ((Class168_Sub1) this).anInt9869 * 2.0F
			      / f_72_),
			     1.0F, 1.0F);
			class352.aClass268_5428.aFloatArray4353[12]
			    = ((float) i_90_
			       + ((Class168_Sub1) this).aClass103_Sub3_9866
				     .method15622()) * 2.0F / f - 1.0F;
			class352.aClass268_5428.aFloatArray4353[13]
			    = ((float) i_88_
			       + ((Class168_Sub1) this).aClass103_Sub3_9866
				     .method15622()) * 2.0F / f_72_ - 1.0F;
			class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
			class352.method6410();
		    }
		    i_88_ += i_87_;
		}
		if (i_88_ < i_84_) {
		    int i_93_ = i_84_ - i_88_;
		    class352.aClass268_5431.method5206
			((((Class168_Sub1) this).anInterface41_9860.method225
			  ((float) ((Class168_Sub1) this).anInt9862)),
			 ((Class168_Sub1) this).anInterface41_9860
			     .method226((float) i_93_),
			 1.0F, 1.0F);
		    int i_94_ = i + ((Class168_Sub1) this).anInt9863;
		    for (int i_95_ = i_94_ + ((Class168_Sub1) this).anInt9862;
			 i_95_ <= i_85_; i_95_ += i_86_) {
			class352.aClass268_5428.method5206
			    (((float) ((Class168_Sub1) this).anInt9862 * 2.0F
			      / f),
			     (float) i_93_ * 2.0F / f_72_, 1.0F, 1.0F);
			class352.aClass268_5428.aFloatArray4353[12]
			    = ((float) i_94_
			       + ((Class168_Sub1) this).aClass103_Sub3_9866
				     .method15622()) * 2.0F / f - 1.0F;
			class352.aClass268_5428.aFloatArray4353[13]
			    = ((float) i_88_
			       + ((Class168_Sub1) this).aClass103_Sub3_9866
				     .method15622()) * 2.0F / f_72_ - 1.0F;
			class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
			class352.method6410();
			i_94_ += i_86_;
		    }
		    if (i_94_ < i_85_) {
			int i_96_ = i_85_ - i_94_;
			class352.aClass268_5431.method5206
			    (((Class168_Sub1) this).anInterface41_9860
				 .method225((float) i_96_),
			     ((Class168_Sub1) this).anInterface41_9860
				 .method226((float) i_93_),
			     1.0F, 1.0F);
			class352.aClass268_5428.method5206(((float) i_96_
							    * 2.0F / f),
							   ((float) i_93_
							    * 2.0F / f_72_),
							   1.0F, 1.0F);
			class352.aClass268_5428.aFloatArray4353[12]
			    = ((float) i_94_
			       + ((Class168_Sub1) this).aClass103_Sub3_9866
				     .method15622()) * 2.0F / f - 1.0F;
			class352.aClass268_5428.aFloatArray4353[13]
			    = ((float) i_88_
			       + ((Class168_Sub1) this).aClass103_Sub3_9866
				     .method15622()) * 2.0F / f_72_ - 1.0F;
			class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
			class352.method6410();
		    }
		}
	    }
	}
    }
    
    void method3627(float f, float f_97_, float f_98_, float f_99_,
		    float f_100_, float f_101_, int i, int i_102_, int i_103_,
		    int i_104_) {
	if (((Class168_Sub1) this).aClass103_Sub3_9866.method15624()
	    != Class376.aClass376_5635)
	    ((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		.aClass390_9547.method6977
		(f, f_97_, f_98_, f_99_, f_100_, f_101_, f_98_ + f_100_ - f,
		 f_99_ + f_101_ - f_97_, 0.0F, 0.0F,
		 ((Class168_Sub1) this).anInterface41_9860.method242(), 0.0F,
		 0.0F, ((Class168_Sub1) this).anInterface41_9860.method233(),
		 ((Class168_Sub1) this).anInterface41_9860.method242(),
		 ((Class168_Sub1) this).anInterface41_9860.method233(),
		 ((Class168_Sub1) this).anInterface41_9860, i_102_);
	else {
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15654();
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15640(i_103_);
	    if (((Class168_Sub1) this).aBool9864) {
		float f_105_ = (float) method64();
		float f_106_ = (float) method3616();
		float f_107_ = (f_98_ - f) / f_105_;
		float f_108_ = (f_99_ - f_97_) / f_105_;
		float f_109_ = (f_100_ - f) / f_106_;
		float f_110_ = (f_101_ - f_97_) / f_106_;
		float f_111_
		    = f_109_ * (float) ((Class168_Sub1) this).anInt9865;
		float f_112_
		    = f_110_ * (float) ((Class168_Sub1) this).anInt9865;
		float f_113_
		    = f_107_ * (float) ((Class168_Sub1) this).anInt9863;
		float f_114_
		    = f_108_ * (float) ((Class168_Sub1) this).anInt9863;
		float f_115_
		    = -f_107_ * (float) ((Class168_Sub1) this).anInt9868;
		float f_116_
		    = -f_108_ * (float) ((Class168_Sub1) this).anInt9868;
		float f_117_
		    = -f_109_ * (float) ((Class168_Sub1) this).anInt9867;
		float f_118_
		    = -f_110_ * (float) ((Class168_Sub1) this).anInt9867;
		f = f + f_113_ + f_111_;
		f_97_ = f_97_ + f_114_ + f_112_;
		f_98_ = f_98_ + f_115_ + f_111_;
		f_99_ = f_99_ + f_116_ + f_112_;
		f_100_ = f_100_ + f_113_ + f_117_;
		f_101_ = f_101_ + f_114_ + f_118_;
	    }
	    Class352 class352
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass352_9593);
	    class352.anInterface41_5433
		= ((Class168_Sub1) this).anInterface41_9860;
	    class352.method6408(i, i_102_);
	    float f_119_
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2655();
	    float f_120_
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2654();
	    class352.aClass268_5428.method5198();
	    class352.aClass268_5428.aFloatArray4353[0]
		= (f_98_ - f) * 2.0F / f_119_;
	    class352.aClass268_5428.aFloatArray4353[1]
		= (f_99_ - f_97_) * 2.0F / f_120_;
	    class352.aClass268_5428.aFloatArray4353[4]
		= (f_100_ - f) * 2.0F / f_119_;
	    class352.aClass268_5428.aFloatArray4353[5]
		= (f_101_ - f_97_) * 2.0F / f_120_;
	    class352.aClass268_5428.aFloatArray4353[12]
		= ((f
		    + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
		   * 2.0F / f_119_) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[13]
		= ((f_97_
		    + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
		   * 2.0F / f_120_) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
	    class352.aClass268_5431.method5206
		(((Class168_Sub1) this).anInterface41_9860
		     .method225((float) ((Class168_Sub1) this).anInt9862),
		 ((Class168_Sub1) this).anInterface41_9860
		     .method226((float) ((Class168_Sub1) this).anInt9869),
		 1.0F, 1.0F);
	    class352.anInterface40_5432
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .anInterface40_9583);
	    class352.anInt5434 = 0;
	    class352.aClass366_5435
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass366_9479);
	    class352.method6410();
	}
    }
    
    void method3647(float f, float f_121_, float f_122_, float f_123_,
		    float f_124_, float f_125_, int i, Class135 class135,
		    int i_126_, int i_127_) {
	((Class168_Sub1) this).aClass103_Sub3_9866.method15654();
	Class352 class352
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .aClass352_9593);
	class352.anInterface41_5433
	    = ((Class168_Sub1) this).anInterface41_9860;
	class352.method6408(1, -1);
	float f_128_
	    = (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			  ((byte) 4).method2655();
	float f_129_
	    = (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			  ((byte) 4).method2654();
	class352.aClass268_5428.method5198();
	if (((Class168_Sub1) this).aBool9864) {
	    float f_130_ = ((float) ((Class168_Sub1) this).anInt9862
			    / (float) method64());
	    float f_131_ = ((float) ((Class168_Sub1) this).anInt9869
			    / (float) method3616());
	    class352.aClass268_5428.aFloatArray4353[0] = (f_122_ - f) * f_130_;
	    class352.aClass268_5428.aFloatArray4353[1]
		= (f_123_ - f_121_) * f_130_;
	    class352.aClass268_5428.aFloatArray4353[4] = (f_124_ - f) * f_131_;
	    class352.aClass268_5428.aFloatArray4353[5]
		= (f_125_ - f_121_) * f_131_;
	    class352.aClass268_5428.aFloatArray4353[12]
		= ((f + (float) ((Class168_Sub1) this).anInt9863) * f_130_
		   + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622());
	    class352.aClass268_5428.aFloatArray4353[13]
		= ((f_121_ + (float) ((Class168_Sub1) this).anInt9865) * f_131_
		   + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622());
	} else {
	    class352.aClass268_5428.aFloatArray4353[0] = f_122_ - f;
	    class352.aClass268_5428.aFloatArray4353[1] = f_123_ - f_121_;
	    class352.aClass268_5428.aFloatArray4353[4] = f_124_ - f;
	    class352.aClass268_5428.aFloatArray4353[5] = f_125_ - f_121_;
	    class352.aClass268_5428.aFloatArray4353[12]
		= f + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622();
	    class352.aClass268_5428.aFloatArray4353[13]
		= (f_121_
		   + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622());
	}
	Class268 class268
	    = ((Class168_Sub1) this).aClass103_Sub3_9866.aClass268_9511;
	class268.method5198();
	class268.aFloatArray4353[0] = 2.0F / f_128_;
	class268.aFloatArray4353[5] = 2.0F / f_129_;
	class268.aFloatArray4353[12] = -1.0F;
	class268.aFloatArray4353[13] = -1.0F;
	class268.aFloatArray4353[14] = -1.0F;
	class352.aClass268_5428.method5202(class268);
	class352.aClass268_5431.method5206
	    (((Class168_Sub1) this).anInterface41_9860
		 .method225((float) ((Class168_Sub1) this).anInt9862),
	     ((Class168_Sub1) this).anInterface41_9860
		 .method226((float) ((Class168_Sub1) this).anInt9869),
	     1.0F, 1.0F);
	class352.anInterface40_5432
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .anInterface40_9583);
	class352.anInt5434 = 0;
	class352.aClass366_5435
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .aClass366_9479);
	Interface41 interface41
	    = ((Class135_Sub2) (Class135_Sub2) class135).anInterface41_10002;
	class352.anInterface41_5429 = interface41;
	class352.aClass268_5427.method5198();
	class352.aClass268_5427.aFloatArray4353[0]
	    = (f_122_ - f) * interface41.method225(1.0F);
	class352.aClass268_5427.aFloatArray4353[1]
	    = (f_123_ - f_121_) * interface41.method225(1.0F);
	class352.aClass268_5427.aFloatArray4353[4]
	    = (f_124_ - f) * interface41.method226(1.0F);
	class352.aClass268_5427.aFloatArray4353[5]
	    = (f_125_ - f_121_) * interface41.method226(1.0F);
	class352.aClass268_5427.aFloatArray4353[12]
	    = (f - (float) i_126_) * interface41.method225(1.0F);
	class352.aClass268_5427.aFloatArray4353[13]
	    = (f_121_ - (float) i_127_) * interface41.method226(1.0F);
	class352.method6415();
    }
    
    void method3651(float f, float f_132_, float f_133_, float f_134_,
		    float f_135_, float f_136_, int i, Class135 class135,
		    int i_137_, int i_138_) {
	((Class168_Sub1) this).aClass103_Sub3_9866.method15654();
	Class352 class352
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .aClass352_9593);
	class352.anInterface41_5433
	    = ((Class168_Sub1) this).anInterface41_9860;
	class352.method6408(1, -1);
	float f_139_
	    = (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			  ((byte) 4).method2655();
	float f_140_
	    = (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			  ((byte) 4).method2654();
	class352.aClass268_5428.method5198();
	if (((Class168_Sub1) this).aBool9864) {
	    float f_141_ = ((float) ((Class168_Sub1) this).anInt9862
			    / (float) method64());
	    float f_142_ = ((float) ((Class168_Sub1) this).anInt9869
			    / (float) method3616());
	    class352.aClass268_5428.aFloatArray4353[0] = (f_133_ - f) * f_141_;
	    class352.aClass268_5428.aFloatArray4353[1]
		= (f_134_ - f_132_) * f_141_;
	    class352.aClass268_5428.aFloatArray4353[4] = (f_135_ - f) * f_142_;
	    class352.aClass268_5428.aFloatArray4353[5]
		= (f_136_ - f_132_) * f_142_;
	    class352.aClass268_5428.aFloatArray4353[12]
		= ((f + (float) ((Class168_Sub1) this).anInt9863) * f_141_
		   + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622());
	    class352.aClass268_5428.aFloatArray4353[13]
		= ((f_132_ + (float) ((Class168_Sub1) this).anInt9865) * f_142_
		   + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622());
	} else {
	    class352.aClass268_5428.aFloatArray4353[0] = f_133_ - f;
	    class352.aClass268_5428.aFloatArray4353[1] = f_134_ - f_132_;
	    class352.aClass268_5428.aFloatArray4353[4] = f_135_ - f;
	    class352.aClass268_5428.aFloatArray4353[5] = f_136_ - f_132_;
	    class352.aClass268_5428.aFloatArray4353[12]
		= f + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622();
	    class352.aClass268_5428.aFloatArray4353[13]
		= (f_132_
		   + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622());
	}
	Class268 class268
	    = ((Class168_Sub1) this).aClass103_Sub3_9866.aClass268_9511;
	class268.method5198();
	class268.aFloatArray4353[0] = 2.0F / f_139_;
	class268.aFloatArray4353[5] = 2.0F / f_140_;
	class268.aFloatArray4353[12] = -1.0F;
	class268.aFloatArray4353[13] = -1.0F;
	class268.aFloatArray4353[14] = -1.0F;
	class352.aClass268_5428.method5202(class268);
	class352.aClass268_5431.method5206
	    (((Class168_Sub1) this).anInterface41_9860
		 .method225((float) ((Class168_Sub1) this).anInt9862),
	     ((Class168_Sub1) this).anInterface41_9860
		 .method226((float) ((Class168_Sub1) this).anInt9869),
	     1.0F, 1.0F);
	class352.anInterface40_5432
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .anInterface40_9583);
	class352.anInt5434 = 0;
	class352.aClass366_5435
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .aClass366_9479);
	Interface41 interface41
	    = ((Class135_Sub2) (Class135_Sub2) class135).anInterface41_10002;
	class352.anInterface41_5429 = interface41;
	class352.aClass268_5427.method5198();
	class352.aClass268_5427.aFloatArray4353[0]
	    = (f_133_ - f) * interface41.method225(1.0F);
	class352.aClass268_5427.aFloatArray4353[1]
	    = (f_134_ - f_132_) * interface41.method225(1.0F);
	class352.aClass268_5427.aFloatArray4353[4]
	    = (f_135_ - f) * interface41.method226(1.0F);
	class352.aClass268_5427.aFloatArray4353[5]
	    = (f_136_ - f_132_) * interface41.method226(1.0F);
	class352.aClass268_5427.aFloatArray4353[12]
	    = (f - (float) i_137_) * interface41.method225(1.0F);
	class352.aClass268_5427.aFloatArray4353[13]
	    = (f_132_ - (float) i_138_) * interface41.method226(1.0F);
	class352.method6415();
    }
    
    public void method3630(int i, int i_143_, int i_144_) {
	int[] is = (((Class168_Sub1) this).aClass103_Sub3_9866.method2251
		    (i, i_143_, ((Class168_Sub1) this).anInt9862,
		     ((Class168_Sub1) this).anInt9869));
	int[] is_145_ = new int[(((Class168_Sub1) this).anInt9862
				 * ((Class168_Sub1) this).anInt9869)];
	((Class168_Sub1) this).anInterface41_9860.method231
	    (0, 0, ((Class168_Sub1) this).anInt9862,
	     ((Class168_Sub1) this).anInt9869, is_145_, 0);
	if (i_144_ == 0) {
	    for (int i_146_ = 0; i_146_ < ((Class168_Sub1) this).anInt9869;
		 i_146_++) {
		int i_147_ = i_146_ * ((Class168_Sub1) this).anInt9862;
		for (int i_148_ = 0; i_148_ < ((Class168_Sub1) this).anInt9862;
		     i_148_++)
		    is_145_[i_147_ + i_148_]
			= (is_145_[i_147_ + i_148_] & 0xffffff
			   | is[i_147_ + i_148_] << 8 & ~0xffffff);
	    }
	} else if (i_144_ == 1) {
	    for (int i_149_ = 0; i_149_ < ((Class168_Sub1) this).anInt9869;
		 i_149_++) {
		int i_150_ = i_149_ * ((Class168_Sub1) this).anInt9862;
		for (int i_151_ = 0; i_151_ < ((Class168_Sub1) this).anInt9862;
		     i_151_++)
		    is_145_[i_150_ + i_151_]
			= (is_145_[i_150_ + i_151_] & 0xffffff
			   | is[i_150_ + i_151_] << 16 & ~0xffffff);
	    }
	} else if (i_144_ == 2) {
	    for (int i_152_ = 0; i_152_ < ((Class168_Sub1) this).anInt9869;
		 i_152_++) {
		int i_153_ = i_152_ * ((Class168_Sub1) this).anInt9862;
		for (int i_154_ = 0; i_154_ < ((Class168_Sub1) this).anInt9862;
		     i_154_++)
		    is_145_[i_153_ + i_154_]
			= (is_145_[i_153_ + i_154_] & 0xffffff
			   | is[i_153_ + i_154_] << 24 & ~0xffffff);
	    }
	} else if (i_144_ == 3) {
	    for (int i_155_ = 0; i_155_ < ((Class168_Sub1) this).anInt9869;
		 i_155_++) {
		int i_156_ = i_155_ * ((Class168_Sub1) this).anInt9862;
		for (int i_157_ = 0; i_157_ < ((Class168_Sub1) this).anInt9862;
		     i_157_++)
		    is_145_[i_156_ + i_157_]
			= (is_145_[i_156_ + i_157_] & 0xffffff
			   | (is[i_156_ + i_157_] != 0 ? -16777216 : 0));
	    }
	}
	method16200(0, 0, ((Class168_Sub1) this).anInt9862,
		    ((Class168_Sub1) this).anInt9869, is_145_, 0,
		    ((Class168_Sub1) this).anInt9862);
    }
    
    void method3640(int i, int i_158_, int i_159_, int i_160_, int i_161_,
		    int i_162_, int i_163_, int i_164_) {
	if (((Class168_Sub1) this).aClass103_Sub3_9866.method15624()
	    != Class376.aClass376_5635) {
	    if (((Class168_Sub1) this).aBool9864) {
		i_159_
		    = i_159_ * ((Class168_Sub1) this).anInt9862 / method64();
		i_160_
		    = i_160_ * ((Class168_Sub1) this).anInt9869 / method3616();
		i += (((Class168_Sub1) this).anInt9863 * i_159_
		      / ((Class168_Sub1) this).anInt9862);
		i_158_ += (((Class168_Sub1) this).anInt9865 * i_160_
			   / ((Class168_Sub1) this).anInt9869);
	    }
	    ((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		.aClass390_9547.method6972
		((float) i, (float) i_158_, (float) (i + i_159_),
		 (float) (i_158_ + i_160_),
		 ((Class168_Sub1) this).anInterface41_9860.method225(0.0F),
		 ((Class168_Sub1) this).anInterface41_9860.method226(0.0F),
		 ((Class168_Sub1) this).anInterface41_9860
		     .method225((float) ((Class168_Sub1) this).anInt9862),
		 ((Class168_Sub1) this).anInterface41_9860
		     .method226((float) ((Class168_Sub1) this).anInt9869),
		 ((Class168_Sub1) this).anInterface41_9860, i_162_);
	} else {
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15654();
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15640(i_163_);
	    Class352 class352
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass352_9593);
	    class352.anInterface41_5433
		= ((Class168_Sub1) this).anInterface41_9860;
	    class352.method6408(i_161_, i_162_);
	    if (((Class168_Sub1) this).aBool9864) {
		i_159_
		    = i_159_ * ((Class168_Sub1) this).anInt9862 / method64();
		i_160_
		    = i_160_ * ((Class168_Sub1) this).anInt9869 / method3616();
		i += (((Class168_Sub1) this).anInt9863 * i_159_
		      / ((Class168_Sub1) this).anInt9862);
		i_158_ += (((Class168_Sub1) this).anInt9865 * i_160_
			   / ((Class168_Sub1) this).anInt9869);
	    }
	    float f
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2655();
	    float f_165_
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2654();
	    class352.aClass268_5428.method5206((float) i_159_ * 2.0F / f,
					       (float) i_160_ * 2.0F / f_165_,
					       1.0F, 1.0F);
	    class352.aClass268_5428.aFloatArray4353[12]
		= (((float) i
		    + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
		   * 2.0F / f) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[13]
		= (((float) i_158_
		    + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
		   * 2.0F / f_165_) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
	    class352.aClass268_5431.method5206
		(((Class168_Sub1) this).anInterface41_9860
		     .method225((float) ((Class168_Sub1) this).anInt9862),
		 ((Class168_Sub1) this).anInterface41_9860
		     .method226((float) ((Class168_Sub1) this).anInt9869),
		 1.0F, 1.0F);
	    class352.anInterface40_5432
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .anInterface40_9583);
	    class352.anInt5434 = 0;
	    class352.aClass366_5435
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass366_9479);
	    class352.method6410();
	}
    }
    
    public Interface4 method3636() {
	return ((Class168_Sub1) this).anInterface4_9861;
    }
    
    public Interface4 method3633() {
	return ((Class168_Sub1) this).anInterface4_9861;
    }
    
    public int method444() {
	return (((Class168_Sub1) this).anInt9862
		+ ((Class168_Sub1) this).anInt9863
		+ ((Class168_Sub1) this).anInt9868);
    }
    
    public Interface4 method3634() {
	return ((Class168_Sub1) this).anInterface4_9861;
    }
    
    public void method3635(int i, int i_166_, int i_167_, int i_168_,
			   int i_169_) {
	if (((Class168_Sub1) this).aClass103_Sub3_9866.method15624()
	    != Class376.aClass376_5635) {
	    i += ((Class168_Sub1) this).anInt9863;
	    i_166_ += ((Class168_Sub1) this).anInt9865;
	    ((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		.aClass390_9547.method6972
		((float) i, (float) i_166_,
		 (float) (i + ((Class168_Sub1) this).anInt9862),
		 (float) (i_166_ + ((Class168_Sub1) this).anInt9869), 0.0F,
		 0.0F, ((Class168_Sub1) this).anInterface41_9860.method242(),
		 ((Class168_Sub1) this).anInterface41_9860.method233(),
		 ((Class168_Sub1) this).anInterface41_9860, i_168_);
	} else {
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15654();
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15640(i_169_);
	    Class352 class352
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass352_9593);
	    class352.anInterface41_5433
		= ((Class168_Sub1) this).anInterface41_9860;
	    class352.method6408(i_167_, i_168_);
	    i += ((Class168_Sub1) this).anInt9863;
	    i_166_ += ((Class168_Sub1) this).anInt9865;
	    float f
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2655();
	    float f_170_
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2654();
	    class352.aClass268_5428.method5206
		((float) ((Class168_Sub1) this).anInt9862 * 2.0F / f,
		 (float) ((Class168_Sub1) this).anInt9869 * 2.0F / f_170_,
		 1.0F, 1.0F);
	    class352.aClass268_5428.aFloatArray4353[12]
		= (((float) i
		    + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
		   * 2.0F / f) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[13]
		= (((float) i_166_
		    + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
		   * 2.0F / f_170_) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
	    class352.aClass268_5431.method5206
		(((Class168_Sub1) this).anInterface41_9860
		     .method225((float) ((Class168_Sub1) this).anInt9862),
		 ((Class168_Sub1) this).anInterface41_9860
		     .method226((float) ((Class168_Sub1) this).anInt9869),
		 1.0F, 1.0F);
	    class352.anInterface40_5432
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .anInterface40_9583);
	    class352.anInt5434 = 0;
	    class352.aClass366_5435
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass366_9479);
	    class352.method6410();
	}
    }
    
    public void method3658(int i, int i_171_, int i_172_, int i_173_,
			   int i_174_) {
	if (((Class168_Sub1) this).aClass103_Sub3_9866.method15624()
	    != Class376.aClass376_5635) {
	    i += ((Class168_Sub1) this).anInt9863;
	    i_171_ += ((Class168_Sub1) this).anInt9865;
	    ((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		.aClass390_9547.method6972
		((float) i, (float) i_171_,
		 (float) (i + ((Class168_Sub1) this).anInt9862),
		 (float) (i_171_ + ((Class168_Sub1) this).anInt9869), 0.0F,
		 0.0F, ((Class168_Sub1) this).anInterface41_9860.method242(),
		 ((Class168_Sub1) this).anInterface41_9860.method233(),
		 ((Class168_Sub1) this).anInterface41_9860, i_173_);
	} else {
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15654();
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15640(i_174_);
	    Class352 class352
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass352_9593);
	    class352.anInterface41_5433
		= ((Class168_Sub1) this).anInterface41_9860;
	    class352.method6408(i_172_, i_173_);
	    i += ((Class168_Sub1) this).anInt9863;
	    i_171_ += ((Class168_Sub1) this).anInt9865;
	    float f
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2655();
	    float f_175_
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2654();
	    class352.aClass268_5428.method5206
		((float) ((Class168_Sub1) this).anInt9862 * 2.0F / f,
		 (float) ((Class168_Sub1) this).anInt9869 * 2.0F / f_175_,
		 1.0F, 1.0F);
	    class352.aClass268_5428.aFloatArray4353[12]
		= (((float) i
		    + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
		   * 2.0F / f) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[13]
		= (((float) i_171_
		    + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
		   * 2.0F / f_175_) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
	    class352.aClass268_5431.method5206
		(((Class168_Sub1) this).anInterface41_9860
		     .method225((float) ((Class168_Sub1) this).anInt9862),
		 ((Class168_Sub1) this).anInterface41_9860
		     .method226((float) ((Class168_Sub1) this).anInt9869),
		 1.0F, 1.0F);
	    class352.anInterface40_5432
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .anInterface40_9583);
	    class352.anInt5434 = 0;
	    class352.aClass366_5435
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass366_9479);
	    class352.method6410();
	}
    }
    
    public void method3637(int i, int i_176_, Class135 class135, int i_177_,
			   int i_178_) {
	((Class168_Sub1) this).aClass103_Sub3_9866.method15654();
	Class352 class352
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .aClass352_9593);
	class352.anInterface41_5433
	    = ((Class168_Sub1) this).anInterface41_9860;
	class352.method6408(1, -1);
	i += ((Class168_Sub1) this).anInt9863;
	i_176_ += ((Class168_Sub1) this).anInt9865;
	float f = (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2655();
	float f_179_
	    = (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			  ((byte) 4).method2654();
	class352.aClass268_5428.method5206
	    ((float) ((Class168_Sub1) this).anInt9862 * 2.0F / f,
	     (float) ((Class168_Sub1) this).anInt9869 * 2.0F / f_179_, 1.0F,
	     1.0F);
	class352.aClass268_5428.aFloatArray4353[12]
	    = (((float) i
		+ ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
	       * 2.0F / f) - 1.0F;
	class352.aClass268_5428.aFloatArray4353[13]
	    = (((float) i_176_
		+ ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
	       * 2.0F / f_179_) - 1.0F;
	class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
	class352.aClass268_5431.method5206
	    (((Class168_Sub1) this).anInterface41_9860
		 .method225((float) ((Class168_Sub1) this).anInt9862),
	     ((Class168_Sub1) this).anInterface41_9860
		 .method226((float) ((Class168_Sub1) this).anInt9869),
	     1.0F, 1.0F);
	class352.anInterface40_5432
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .anInterface40_9583);
	class352.anInt5434 = 0;
	class352.aClass366_5435
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .aClass366_9479);
	Interface41 interface41
	    = ((Class135_Sub2) (Class135_Sub2) class135).anInterface41_10002;
	class352.anInterface41_5429 = interface41;
	class352.aClass268_5427.method5206
	    (interface41.method225((float) ((Class168_Sub1) this).anInt9862),
	     interface41.method226((float) ((Class168_Sub1) this).anInt9869),
	     1.0F, 1.0F);
	class352.aClass268_5427.aFloatArray4353[12]
	    = interface41.method225((float) (i - i_177_));
	class352.aClass268_5427.aFloatArray4353[13]
	    = interface41.method226((float) (i_176_ - i_178_));
	class352.method6415();
    }
    
    public void method3638(int i, int i_180_, Class135 class135, int i_181_,
			   int i_182_) {
	((Class168_Sub1) this).aClass103_Sub3_9866.method15654();
	Class352 class352
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .aClass352_9593);
	class352.anInterface41_5433
	    = ((Class168_Sub1) this).anInterface41_9860;
	class352.method6408(1, -1);
	i += ((Class168_Sub1) this).anInt9863;
	i_180_ += ((Class168_Sub1) this).anInt9865;
	float f = (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2655();
	float f_183_
	    = (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			  ((byte) 4).method2654();
	class352.aClass268_5428.method5206
	    ((float) ((Class168_Sub1) this).anInt9862 * 2.0F / f,
	     (float) ((Class168_Sub1) this).anInt9869 * 2.0F / f_183_, 1.0F,
	     1.0F);
	class352.aClass268_5428.aFloatArray4353[12]
	    = (((float) i
		+ ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
	       * 2.0F / f) - 1.0F;
	class352.aClass268_5428.aFloatArray4353[13]
	    = (((float) i_180_
		+ ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
	       * 2.0F / f_183_) - 1.0F;
	class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
	class352.aClass268_5431.method5206
	    (((Class168_Sub1) this).anInterface41_9860
		 .method225((float) ((Class168_Sub1) this).anInt9862),
	     ((Class168_Sub1) this).anInterface41_9860
		 .method226((float) ((Class168_Sub1) this).anInt9869),
	     1.0F, 1.0F);
	class352.anInterface40_5432
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .anInterface40_9583);
	class352.anInt5434 = 0;
	class352.aClass366_5435
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .aClass366_9479);
	Interface41 interface41
	    = ((Class135_Sub2) (Class135_Sub2) class135).anInterface41_10002;
	class352.anInterface41_5429 = interface41;
	class352.aClass268_5427.method5206
	    (interface41.method225((float) ((Class168_Sub1) this).anInt9862),
	     interface41.method226((float) ((Class168_Sub1) this).anInt9869),
	     1.0F, 1.0F);
	class352.aClass268_5427.aFloatArray4353[12]
	    = interface41.method225((float) (i - i_181_));
	class352.aClass268_5427.aFloatArray4353[13]
	    = interface41.method226((float) (i_180_ - i_182_));
	class352.method6415();
    }
    
    public void method3607(int i, int i_184_, Class135 class135, int i_185_,
			   int i_186_) {
	((Class168_Sub1) this).aClass103_Sub3_9866.method15654();
	Class352 class352
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .aClass352_9593);
	class352.anInterface41_5433
	    = ((Class168_Sub1) this).anInterface41_9860;
	class352.method6408(1, -1);
	i += ((Class168_Sub1) this).anInt9863;
	i_184_ += ((Class168_Sub1) this).anInt9865;
	float f = (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2655();
	float f_187_
	    = (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			  ((byte) 4).method2654();
	class352.aClass268_5428.method5206
	    ((float) ((Class168_Sub1) this).anInt9862 * 2.0F / f,
	     (float) ((Class168_Sub1) this).anInt9869 * 2.0F / f_187_, 1.0F,
	     1.0F);
	class352.aClass268_5428.aFloatArray4353[12]
	    = (((float) i
		+ ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
	       * 2.0F / f) - 1.0F;
	class352.aClass268_5428.aFloatArray4353[13]
	    = (((float) i_184_
		+ ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
	       * 2.0F / f_187_) - 1.0F;
	class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
	class352.aClass268_5431.method5206
	    (((Class168_Sub1) this).anInterface41_9860
		 .method225((float) ((Class168_Sub1) this).anInt9862),
	     ((Class168_Sub1) this).anInterface41_9860
		 .method226((float) ((Class168_Sub1) this).anInt9869),
	     1.0F, 1.0F);
	class352.anInterface40_5432
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .anInterface40_9583);
	class352.anInt5434 = 0;
	class352.aClass366_5435
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .aClass366_9479);
	Interface41 interface41
	    = ((Class135_Sub2) (Class135_Sub2) class135).anInterface41_10002;
	class352.anInterface41_5429 = interface41;
	class352.aClass268_5427.method5206
	    (interface41.method225((float) ((Class168_Sub1) this).anInt9862),
	     interface41.method226((float) ((Class168_Sub1) this).anInt9869),
	     1.0F, 1.0F);
	class352.aClass268_5427.aFloatArray4353[12]
	    = interface41.method225((float) (i - i_185_));
	class352.aClass268_5427.aFloatArray4353[13]
	    = interface41.method226((float) (i_184_ - i_186_));
	class352.method6415();
    }
    
    public int method3652() {
	return ((Class168_Sub1) this).anInt9862;
    }
    
    void method3641(int i, int i_188_, int i_189_, int i_190_, int i_191_,
		    int i_192_, int i_193_, int i_194_) {
	if (((Class168_Sub1) this).aClass103_Sub3_9866.method15624()
	    != Class376.aClass376_5635) {
	    if (((Class168_Sub1) this).aBool9864) {
		i_189_
		    = i_189_ * ((Class168_Sub1) this).anInt9862 / method64();
		i_190_
		    = i_190_ * ((Class168_Sub1) this).anInt9869 / method3616();
		i += (((Class168_Sub1) this).anInt9863 * i_189_
		      / ((Class168_Sub1) this).anInt9862);
		i_188_ += (((Class168_Sub1) this).anInt9865 * i_190_
			   / ((Class168_Sub1) this).anInt9869);
	    }
	    ((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		.aClass390_9547.method6972
		((float) i, (float) i_188_, (float) (i + i_189_),
		 (float) (i_188_ + i_190_),
		 ((Class168_Sub1) this).anInterface41_9860.method225(0.0F),
		 ((Class168_Sub1) this).anInterface41_9860.method226(0.0F),
		 ((Class168_Sub1) this).anInterface41_9860
		     .method225((float) ((Class168_Sub1) this).anInt9862),
		 ((Class168_Sub1) this).anInterface41_9860
		     .method226((float) ((Class168_Sub1) this).anInt9869),
		 ((Class168_Sub1) this).anInterface41_9860, i_192_);
	} else {
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15654();
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15640(i_193_);
	    Class352 class352
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass352_9593);
	    class352.anInterface41_5433
		= ((Class168_Sub1) this).anInterface41_9860;
	    class352.method6408(i_191_, i_192_);
	    if (((Class168_Sub1) this).aBool9864) {
		i_189_
		    = i_189_ * ((Class168_Sub1) this).anInt9862 / method64();
		i_190_
		    = i_190_ * ((Class168_Sub1) this).anInt9869 / method3616();
		i += (((Class168_Sub1) this).anInt9863 * i_189_
		      / ((Class168_Sub1) this).anInt9862);
		i_188_ += (((Class168_Sub1) this).anInt9865 * i_190_
			   / ((Class168_Sub1) this).anInt9869);
	    }
	    float f
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2655();
	    float f_195_
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2654();
	    class352.aClass268_5428.method5206((float) i_189_ * 2.0F / f,
					       (float) i_190_ * 2.0F / f_195_,
					       1.0F, 1.0F);
	    class352.aClass268_5428.aFloatArray4353[12]
		= (((float) i
		    + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
		   * 2.0F / f) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[13]
		= (((float) i_188_
		    + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
		   * 2.0F / f_195_) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
	    class352.aClass268_5431.method5206
		(((Class168_Sub1) this).anInterface41_9860
		     .method225((float) ((Class168_Sub1) this).anInt9862),
		 ((Class168_Sub1) this).anInterface41_9860
		     .method226((float) ((Class168_Sub1) this).anInt9869),
		 1.0F, 1.0F);
	    class352.anInterface40_5432
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .anInterface40_9583);
	    class352.anInt5434 = 0;
	    class352.aClass366_5435
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass366_9479);
	    class352.method6410();
	}
    }
    
    public void method3656(int i, int i_196_, int i_197_, int i_198_) {
	((Class168_Sub1) this).anInt9863 = i;
	((Class168_Sub1) this).anInt9865 = i_196_;
	((Class168_Sub1) this).anInt9868 = i_197_;
	((Class168_Sub1) this).anInt9867 = i_198_;
	((Class168_Sub1) this).aBool9864
	    = (((Class168_Sub1) this).anInt9863 != 0
	       || ((Class168_Sub1) this).anInt9865 != 0
	       || ((Class168_Sub1) this).anInt9868 != 0
	       || ((Class168_Sub1) this).anInt9867 != 0);
    }
    
    public void method3643(int[] is) {
	is[0] = ((Class168_Sub1) this).anInt9863;
	is[1] = ((Class168_Sub1) this).anInt9865;
	is[2] = ((Class168_Sub1) this).anInt9868;
	is[3] = ((Class168_Sub1) this).anInt9867;
    }
    
    public int method397() {
	return (((Class168_Sub1) this).anInt9862
		+ ((Class168_Sub1) this).anInt9863
		+ ((Class168_Sub1) this).anInt9868);
    }
    
    void method3611(float f, float f_199_, float f_200_, float f_201_,
		    float f_202_, float f_203_, int i, int i_204_, int i_205_,
		    int i_206_) {
	if (((Class168_Sub1) this).aClass103_Sub3_9866.method15624()
	    != Class376.aClass376_5635)
	    ((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		.aClass390_9547.method6977
		(f, f_199_, f_200_, f_201_, f_202_, f_203_,
		 f_200_ + f_202_ - f, f_201_ + f_203_ - f_199_, 0.0F, 0.0F,
		 ((Class168_Sub1) this).anInterface41_9860.method242(), 0.0F,
		 0.0F, ((Class168_Sub1) this).anInterface41_9860.method233(),
		 ((Class168_Sub1) this).anInterface41_9860.method242(),
		 ((Class168_Sub1) this).anInterface41_9860.method233(),
		 ((Class168_Sub1) this).anInterface41_9860, i_204_);
	else {
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15654();
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15640(i_205_);
	    if (((Class168_Sub1) this).aBool9864) {
		float f_207_ = (float) method64();
		float f_208_ = (float) method3616();
		float f_209_ = (f_200_ - f) / f_207_;
		float f_210_ = (f_201_ - f_199_) / f_207_;
		float f_211_ = (f_202_ - f) / f_208_;
		float f_212_ = (f_203_ - f_199_) / f_208_;
		float f_213_
		    = f_211_ * (float) ((Class168_Sub1) this).anInt9865;
		float f_214_
		    = f_212_ * (float) ((Class168_Sub1) this).anInt9865;
		float f_215_
		    = f_209_ * (float) ((Class168_Sub1) this).anInt9863;
		float f_216_
		    = f_210_ * (float) ((Class168_Sub1) this).anInt9863;
		float f_217_
		    = -f_209_ * (float) ((Class168_Sub1) this).anInt9868;
		float f_218_
		    = -f_210_ * (float) ((Class168_Sub1) this).anInt9868;
		float f_219_
		    = -f_211_ * (float) ((Class168_Sub1) this).anInt9867;
		float f_220_
		    = -f_212_ * (float) ((Class168_Sub1) this).anInt9867;
		f = f + f_215_ + f_213_;
		f_199_ = f_199_ + f_216_ + f_214_;
		f_200_ = f_200_ + f_217_ + f_213_;
		f_201_ = f_201_ + f_218_ + f_214_;
		f_202_ = f_202_ + f_215_ + f_219_;
		f_203_ = f_203_ + f_216_ + f_220_;
	    }
	    Class352 class352
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass352_9593);
	    class352.anInterface41_5433
		= ((Class168_Sub1) this).anInterface41_9860;
	    class352.method6408(i, i_204_);
	    float f_221_
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2655();
	    float f_222_
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2654();
	    class352.aClass268_5428.method5198();
	    class352.aClass268_5428.aFloatArray4353[0]
		= (f_200_ - f) * 2.0F / f_221_;
	    class352.aClass268_5428.aFloatArray4353[1]
		= (f_201_ - f_199_) * 2.0F / f_222_;
	    class352.aClass268_5428.aFloatArray4353[4]
		= (f_202_ - f) * 2.0F / f_221_;
	    class352.aClass268_5428.aFloatArray4353[5]
		= (f_203_ - f_199_) * 2.0F / f_222_;
	    class352.aClass268_5428.aFloatArray4353[12]
		= ((f
		    + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
		   * 2.0F / f_221_) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[13]
		= ((f_199_
		    + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
		   * 2.0F / f_222_) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
	    class352.aClass268_5431.method5206
		(((Class168_Sub1) this).anInterface41_9860
		     .method225((float) ((Class168_Sub1) this).anInt9862),
		 ((Class168_Sub1) this).anInterface41_9860
		     .method226((float) ((Class168_Sub1) this).anInt9869),
		 1.0F, 1.0F);
	    class352.anInterface40_5432
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .anInterface40_9583);
	    class352.anInt5434 = 0;
	    class352.aClass366_5435
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass366_9479);
	    class352.method6410();
	}
    }
    
    public int method445() {
	return (((Class168_Sub1) this).anInt9862
		+ ((Class168_Sub1) this).anInt9863
		+ ((Class168_Sub1) this).anInt9868);
    }
    
    public int method3645() {
	return (((Class168_Sub1) this).anInt9869
		+ ((Class168_Sub1) this).anInt9865
		+ ((Class168_Sub1) this).anInt9867);
    }
    
    public void method3613(int i, int i_223_, int i_224_, int i_225_,
			   int i_226_, int i_227_, int i_228_) {
	if (((Class168_Sub1) this).aClass103_Sub3_9866.method15624()
	    != Class376.aClass376_5635) {
	    int i_229_ = i_223_ + i_225_;
	    int i_230_ = i + i_224_;
	    int i_231_ = method64();
	    int i_232_ = method3616();
	    int i_233_ = i_223_ + ((Class168_Sub1) this).anInt9865;
	    for (int i_234_ = i_233_ + ((Class168_Sub1) this).anInt9869;
		 i_234_ <= i_229_; i_234_ += i_232_) {
		int i_235_ = i + ((Class168_Sub1) this).anInt9863;
		for (int i_236_ = i_235_ + ((Class168_Sub1) this).anInt9862;
		     i_236_ <= i_230_; i_236_ += i_231_) {
		    ((Class103_Sub3)
		     ((Class168_Sub1) this).aClass103_Sub3_9866)
			.aClass390_9547.method6972
			((float) i_235_, (float) i_233_,
			 (float) (i_235_ + ((Class168_Sub1) this).anInt9862),
			 (float) (i_233_ + ((Class168_Sub1) this).anInt9869),
			 0.0F, 0.0F,
			 ((Class168_Sub1) this).anInterface41_9860.method242(),
			 ((Class168_Sub1) this).anInterface41_9860.method233(),
			 ((Class168_Sub1) this).anInterface41_9860, i_227_);
		    i_235_ += i_231_;
		}
		if (i_235_ < i_230_) {
		    int i_237_ = i_230_ - i_235_;
		    ((Class103_Sub3)
		     ((Class168_Sub1) this).aClass103_Sub3_9866)
			.aClass390_9547.method6972
			((float) i_235_, (float) i_233_,
			 (float) (i_235_ + i_237_),
			 (float) (i_233_ + ((Class168_Sub1) this).anInt9869),
			 0.0F, 0.0F,
			 ((float) i_237_
			  / (float) ((Class168_Sub1) this).anInt9862
			  * ((Class168_Sub1) this).anInterface41_9860
				.method242()),
			 ((Class168_Sub1) this).anInterface41_9860.method233(),
			 ((Class168_Sub1) this).anInterface41_9860, i_227_);
		}
		i_233_ += i_232_;
	    }
	    if (i_233_ < i_229_) {
		int i_238_ = i_229_ - i_233_;
		float f = ((float) i_238_
			   / (float) ((Class168_Sub1) this).anInt9869
			   * ((Class168_Sub1) this).anInterface41_9860
				 .method233());
		int i_239_ = i + ((Class168_Sub1) this).anInt9863;
		for (int i_240_ = i_239_ + ((Class168_Sub1) this).anInt9862;
		     i_240_ <= i_230_; i_240_ += i_231_) {
		    ((Class103_Sub3)
		     ((Class168_Sub1) this).aClass103_Sub3_9866)
			.aClass390_9547.method6972
			((float) i_239_, (float) i_233_,
			 (float) (i_239_ + ((Class168_Sub1) this).anInt9862),
			 (float) (i_233_ + i_238_), 0.0F, 0.0F,
			 ((Class168_Sub1) this).anInterface41_9860.method242(),
			 f, ((Class168_Sub1) this).anInterface41_9860, i_227_);
		    i_239_ += i_231_;
		}
		if (i_239_ < i_230_) {
		    int i_241_ = i_230_ - i_239_;
		    ((Class103_Sub3)
		     ((Class168_Sub1) this).aClass103_Sub3_9866)
			.aClass390_9547.method6972
			((float) i_239_, (float) i_233_,
			 (float) (i_239_ + i_241_), (float) (i_233_ + i_238_),
			 0.0F, 0.0F,
			 ((float) i_241_
			  / (float) ((Class168_Sub1) this).anInt9862
			  * ((Class168_Sub1) this).anInterface41_9860
				.method242()),
			 f, ((Class168_Sub1) this).anInterface41_9860, i_227_);
		}
	    }
	} else {
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15654();
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15640(i_228_);
	    Class352 class352
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass352_9593);
	    class352.anInterface41_5433
		= ((Class168_Sub1) this).anInterface41_9860;
	    class352.method6408(i_226_, i_227_);
	    float f
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2655();
	    float f_242_
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2654();
	    class352.anInterface40_5432
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .anInterface40_9583);
	    class352.anInt5434 = 0;
	    class352.aClass366_5435
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass366_9479);
	    boolean bool = (((Class168_Sub1) this).aBool9859
			    && ((Class168_Sub1) this).anInt9865 == 0
			    && ((Class168_Sub1) this).anInt9867 == 0);
	    boolean bool_243_ = (((Class168_Sub1) this).aBool9871
				 && ((Class168_Sub1) this).anInt9863 == 0
				 && ((Class168_Sub1) this).anInt9868 == 0);
	    if (bool_243_ & bool) {
		class352.aClass268_5428.method5206((float) i_224_ * 2.0F / f,
						   ((float) i_225_ * 2.0F
						    / f_242_),
						   1.0F, 1.0F);
		class352.aClass268_5428.aFloatArray4353[12]
		    = ((float) i + ((Class168_Sub1) this)
				       .aClass103_Sub3_9866
				       .method15622()) * 2.0F / f - 1.0F;
		class352.aClass268_5428.aFloatArray4353[13]
		    = ((float) i_223_
		       + ((Class168_Sub1) this).aClass103_Sub3_9866
			     .method15622()) * 2.0F / f_242_ - 1.0F;
		class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
		class352.aClass268_5431.method5206
		    (((Class168_Sub1) this).anInterface41_9860
			 .method225((float) i_224_),
		     ((Class168_Sub1) this).anInterface41_9860
			 .method226((float) i_225_),
		     1.0F, 1.0F);
		class352.method6410();
	    } else if (bool_243_) {
		int i_244_ = i_223_ + i_225_;
		int i_245_ = method3616();
		class352.aClass268_5431.method5206
		    (((Class168_Sub1) this).anInterface41_9860
			 .method225((float) i_224_),
		     ((Class168_Sub1) this).anInterface41_9860
			 .method226((float) ((Class168_Sub1) this).anInt9869),
		     1.0F, 1.0F);
		int i_246_ = i_223_ + ((Class168_Sub1) this).anInt9865;
		for (int i_247_ = i_246_ + ((Class168_Sub1) this).anInt9869;
		     i_247_ <= i_244_; i_247_ += i_245_) {
		    class352.aClass268_5428.method5206
			((float) i_224_ * 2.0F / f,
			 ((float) ((Class168_Sub1) this).anInt9869 * 2.0F
			  / f_242_),
			 1.0F, 1.0F);
		    class352.aClass268_5428.aFloatArray4353[12]
			= (((float) i + ((Class168_Sub1) this)
					    .aClass103_Sub3_9866.method15622())
			   * 2.0F / f) - 1.0F;
		    class352.aClass268_5428.aFloatArray4353[13]
			= ((float) i_246_
			   + ((Class168_Sub1) this).aClass103_Sub3_9866
				 .method15622()) * 2.0F / f_242_ - 1.0F;
		    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
		    class352.method6410();
		    i_246_ += i_245_;
		}
		if (i_246_ < i_244_) {
		    int i_248_ = i_244_ - i_246_;
		    class352.aClass268_5431.method5206
			(((Class168_Sub1) this).anInterface41_9860
			     .method225((float) i_224_),
			 ((Class168_Sub1) this).anInterface41_9860
			     .method226((float) i_248_),
			 1.0F, 1.0F);
		    class352.aClass268_5428.method5206(((float) i_224_ * 2.0F
							/ f),
						       ((float) i_248_ * 2.0F
							/ f_242_),
						       1.0F, 1.0F);
		    class352.aClass268_5428.aFloatArray4353[12]
			= (((float) i + ((Class168_Sub1) this)
					    .aClass103_Sub3_9866.method15622())
			   * 2.0F / f) - 1.0F;
		    class352.aClass268_5428.aFloatArray4353[13]
			= ((float) i_246_
			   + ((Class168_Sub1) this).aClass103_Sub3_9866
				 .method15622()) * 2.0F / f_242_ - 1.0F;
		    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
		    class352.method6410();
		}
	    } else if (bool) {
		int i_249_ = i + i_224_;
		int i_250_ = method64();
		class352.aClass268_5431.method5206
		    (((Class168_Sub1) this).anInterface41_9860
			 .method225((float) ((Class168_Sub1) this).anInt9862),
		     ((Class168_Sub1) this).anInterface41_9860
			 .method226((float) i_225_),
		     1.0F, 1.0F);
		int i_251_ = i + ((Class168_Sub1) this).anInt9863;
		for (int i_252_ = i_251_ + ((Class168_Sub1) this).anInt9862;
		     i_252_ <= i_249_; i_252_ += i_250_) {
		    class352.aClass268_5428.method5206
			((float) ((Class168_Sub1) this).anInt9862 * 2.0F / f,
			 (float) i_225_ * 2.0F / f_242_, 1.0F, 1.0F);
		    class352.aClass268_5428.aFloatArray4353[12]
			= ((float) i_251_
			   + ((Class168_Sub1) this).aClass103_Sub3_9866
				 .method15622()) * 2.0F / f - 1.0F;
		    class352.aClass268_5428.aFloatArray4353[13]
			= ((float) i_223_
			   + ((Class168_Sub1) this).aClass103_Sub3_9866
				 .method15622()) * 2.0F / f_242_ - 1.0F;
		    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
		    class352.method6410();
		    i_251_ += i_250_;
		}
		if (i_251_ < i_249_) {
		    int i_253_ = i_249_ - i_251_;
		    class352.aClass268_5431.method5206
			(((Class168_Sub1) this).anInterface41_9860
			     .method225((float) i_253_),
			 ((Class168_Sub1) this).anInterface41_9860
			     .method226((float) i_225_),
			 1.0F, 1.0F);
		    class352.aClass268_5428.method5206(((float) i_253_ * 2.0F
							/ f),
						       ((float) i_225_ * 2.0F
							/ f_242_),
						       1.0F, 1.0F);
		    class352.aClass268_5428.aFloatArray4353[12]
			= ((float) i_251_
			   + ((Class168_Sub1) this).aClass103_Sub3_9866
				 .method15622()) * 2.0F / f - 1.0F;
		    class352.aClass268_5428.aFloatArray4353[13]
			= ((float) i_223_
			   + ((Class168_Sub1) this).aClass103_Sub3_9866
				 .method15622()) * 2.0F / f_242_ - 1.0F;
		    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
		    class352.method6410();
		}
	    } else {
		int i_254_ = i_223_ + i_225_;
		int i_255_ = i + i_224_;
		int i_256_ = method64();
		int i_257_ = method3616();
		int i_258_ = i_223_ + ((Class168_Sub1) this).anInt9865;
		for (int i_259_ = i_258_ + ((Class168_Sub1) this).anInt9869;
		     i_259_ <= i_254_; i_259_ += i_257_) {
		    class352.aClass268_5431.method5206
			((((Class168_Sub1) this).anInterface41_9860.method225
			  ((float) ((Class168_Sub1) this).anInt9862)),
			 (((Class168_Sub1) this).anInterface41_9860.method226
			  ((float) ((Class168_Sub1) this).anInt9869)),
			 1.0F, 1.0F);
		    int i_260_ = i + ((Class168_Sub1) this).anInt9863;
		    for (int i_261_
			     = i_260_ + ((Class168_Sub1) this).anInt9862;
			 i_261_ <= i_255_; i_261_ += i_256_) {
			class352.aClass268_5428.method5206
			    (((float) ((Class168_Sub1) this).anInt9862 * 2.0F
			      / f),
			     ((float) ((Class168_Sub1) this).anInt9869 * 2.0F
			      / f_242_),
			     1.0F, 1.0F);
			class352.aClass268_5428.aFloatArray4353[12]
			    = ((float) i_260_
			       + ((Class168_Sub1) this).aClass103_Sub3_9866
				     .method15622()) * 2.0F / f - 1.0F;
			class352.aClass268_5428.aFloatArray4353[13]
			    = ((float) i_258_
			       + ((Class168_Sub1) this).aClass103_Sub3_9866
				     .method15622()) * 2.0F / f_242_ - 1.0F;
			class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
			class352.method6410();
			i_260_ += i_256_;
		    }
		    if (i_260_ < i_255_) {
			int i_262_ = i_255_ - i_260_;
			class352.aClass268_5431.method5206
			    (((Class168_Sub1) this).anInterface41_9860
				 .method225((float) i_262_),
			     (((Class168_Sub1) this).anInterface41_9860
				  .method226
			      ((float) ((Class168_Sub1) this).anInt9869)),
			     1.0F, 1.0F);
			class352.aClass268_5428.method5206
			    ((float) i_262_ * 2.0F / f,
			     ((float) ((Class168_Sub1) this).anInt9869 * 2.0F
			      / f_242_),
			     1.0F, 1.0F);
			class352.aClass268_5428.aFloatArray4353[12]
			    = ((float) i_260_
			       + ((Class168_Sub1) this).aClass103_Sub3_9866
				     .method15622()) * 2.0F / f - 1.0F;
			class352.aClass268_5428.aFloatArray4353[13]
			    = ((float) i_258_
			       + ((Class168_Sub1) this).aClass103_Sub3_9866
				     .method15622()) * 2.0F / f_242_ - 1.0F;
			class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
			class352.method6410();
		    }
		    i_258_ += i_257_;
		}
		if (i_258_ < i_254_) {
		    int i_263_ = i_254_ - i_258_;
		    class352.aClass268_5431.method5206
			((((Class168_Sub1) this).anInterface41_9860.method225
			  ((float) ((Class168_Sub1) this).anInt9862)),
			 ((Class168_Sub1) this).anInterface41_9860
			     .method226((float) i_263_),
			 1.0F, 1.0F);
		    int i_264_ = i + ((Class168_Sub1) this).anInt9863;
		    for (int i_265_
			     = i_264_ + ((Class168_Sub1) this).anInt9862;
			 i_265_ <= i_255_; i_265_ += i_256_) {
			class352.aClass268_5428.method5206
			    (((float) ((Class168_Sub1) this).anInt9862 * 2.0F
			      / f),
			     (float) i_263_ * 2.0F / f_242_, 1.0F, 1.0F);
			class352.aClass268_5428.aFloatArray4353[12]
			    = ((float) i_264_
			       + ((Class168_Sub1) this).aClass103_Sub3_9866
				     .method15622()) * 2.0F / f - 1.0F;
			class352.aClass268_5428.aFloatArray4353[13]
			    = ((float) i_258_
			       + ((Class168_Sub1) this).aClass103_Sub3_9866
				     .method15622()) * 2.0F / f_242_ - 1.0F;
			class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
			class352.method6410();
			i_264_ += i_256_;
		    }
		    if (i_264_ < i_255_) {
			int i_266_ = i_255_ - i_264_;
			class352.aClass268_5431.method5206
			    (((Class168_Sub1) this).anInterface41_9860
				 .method225((float) i_266_),
			     ((Class168_Sub1) this).anInterface41_9860
				 .method226((float) i_263_),
			     1.0F, 1.0F);
			class352.aClass268_5428.method5206(((float) i_266_
							    * 2.0F / f),
							   ((float) i_263_
							    * 2.0F / f_242_),
							   1.0F, 1.0F);
			class352.aClass268_5428.aFloatArray4353[12]
			    = ((float) i_264_
			       + ((Class168_Sub1) this).aClass103_Sub3_9866
				     .method15622()) * 2.0F / f - 1.0F;
			class352.aClass268_5428.aFloatArray4353[13]
			    = ((float) i_258_
			       + ((Class168_Sub1) this).aClass103_Sub3_9866
				     .method15622()) * 2.0F / f_242_ - 1.0F;
			class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
			class352.method6410();
		    }
		}
	    }
	}
    }
    
    void method3649(float f, float f_267_, float f_268_, float f_269_,
		    float f_270_, float f_271_, int i, Class135 class135,
		    int i_272_, int i_273_) {
	((Class168_Sub1) this).aClass103_Sub3_9866.method15654();
	Class352 class352
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .aClass352_9593);
	class352.anInterface41_5433
	    = ((Class168_Sub1) this).anInterface41_9860;
	class352.method6408(1, -1);
	float f_274_
	    = (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			  ((byte) 4).method2655();
	float f_275_
	    = (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			  ((byte) 4).method2654();
	class352.aClass268_5428.method5198();
	if (((Class168_Sub1) this).aBool9864) {
	    float f_276_ = ((float) ((Class168_Sub1) this).anInt9862
			    / (float) method64());
	    float f_277_ = ((float) ((Class168_Sub1) this).anInt9869
			    / (float) method3616());
	    class352.aClass268_5428.aFloatArray4353[0] = (f_268_ - f) * f_276_;
	    class352.aClass268_5428.aFloatArray4353[1]
		= (f_269_ - f_267_) * f_276_;
	    class352.aClass268_5428.aFloatArray4353[4] = (f_270_ - f) * f_277_;
	    class352.aClass268_5428.aFloatArray4353[5]
		= (f_271_ - f_267_) * f_277_;
	    class352.aClass268_5428.aFloatArray4353[12]
		= ((f + (float) ((Class168_Sub1) this).anInt9863) * f_276_
		   + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622());
	    class352.aClass268_5428.aFloatArray4353[13]
		= ((f_267_ + (float) ((Class168_Sub1) this).anInt9865) * f_277_
		   + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622());
	} else {
	    class352.aClass268_5428.aFloatArray4353[0] = f_268_ - f;
	    class352.aClass268_5428.aFloatArray4353[1] = f_269_ - f_267_;
	    class352.aClass268_5428.aFloatArray4353[4] = f_270_ - f;
	    class352.aClass268_5428.aFloatArray4353[5] = f_271_ - f_267_;
	    class352.aClass268_5428.aFloatArray4353[12]
		= f + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622();
	    class352.aClass268_5428.aFloatArray4353[13]
		= (f_267_
		   + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622());
	}
	Class268 class268
	    = ((Class168_Sub1) this).aClass103_Sub3_9866.aClass268_9511;
	class268.method5198();
	class268.aFloatArray4353[0] = 2.0F / f_274_;
	class268.aFloatArray4353[5] = 2.0F / f_275_;
	class268.aFloatArray4353[12] = -1.0F;
	class268.aFloatArray4353[13] = -1.0F;
	class268.aFloatArray4353[14] = -1.0F;
	class352.aClass268_5428.method5202(class268);
	class352.aClass268_5431.method5206
	    (((Class168_Sub1) this).anInterface41_9860
		 .method225((float) ((Class168_Sub1) this).anInt9862),
	     ((Class168_Sub1) this).anInterface41_9860
		 .method226((float) ((Class168_Sub1) this).anInt9869),
	     1.0F, 1.0F);
	class352.anInterface40_5432
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .anInterface40_9583);
	class352.anInt5434 = 0;
	class352.aClass366_5435
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .aClass366_9479);
	Interface41 interface41
	    = ((Class135_Sub2) (Class135_Sub2) class135).anInterface41_10002;
	class352.anInterface41_5429 = interface41;
	class352.aClass268_5427.method5198();
	class352.aClass268_5427.aFloatArray4353[0]
	    = (f_268_ - f) * interface41.method225(1.0F);
	class352.aClass268_5427.aFloatArray4353[1]
	    = (f_269_ - f_267_) * interface41.method225(1.0F);
	class352.aClass268_5427.aFloatArray4353[4]
	    = (f_270_ - f) * interface41.method226(1.0F);
	class352.aClass268_5427.aFloatArray4353[5]
	    = (f_271_ - f_267_) * interface41.method226(1.0F);
	class352.aClass268_5427.aFloatArray4353[12]
	    = (f - (float) i_272_) * interface41.method225(1.0F);
	class352.aClass268_5427.aFloatArray4353[13]
	    = (f_267_ - (float) i_273_) * interface41.method226(1.0F);
	class352.method6415();
    }
    
    void method3648(float f, float f_278_, float f_279_, float f_280_,
		    float f_281_, float f_282_, int i, int i_283_, int i_284_,
		    int i_285_) {
	if (((Class168_Sub1) this).aClass103_Sub3_9866.method15624()
	    != Class376.aClass376_5635)
	    ((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		.aClass390_9547.method6977
		(f, f_278_, f_279_, f_280_, f_281_, f_282_,
		 f_279_ + f_281_ - f, f_280_ + f_282_ - f_278_, 0.0F, 0.0F,
		 ((Class168_Sub1) this).anInterface41_9860.method242(), 0.0F,
		 0.0F, ((Class168_Sub1) this).anInterface41_9860.method233(),
		 ((Class168_Sub1) this).anInterface41_9860.method242(),
		 ((Class168_Sub1) this).anInterface41_9860.method233(),
		 ((Class168_Sub1) this).anInterface41_9860, i_283_);
	else {
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15654();
	    ((Class168_Sub1) this).aClass103_Sub3_9866.method15640(i_284_);
	    if (((Class168_Sub1) this).aBool9864) {
		float f_286_ = (float) method64();
		float f_287_ = (float) method3616();
		float f_288_ = (f_279_ - f) / f_286_;
		float f_289_ = (f_280_ - f_278_) / f_286_;
		float f_290_ = (f_281_ - f) / f_287_;
		float f_291_ = (f_282_ - f_278_) / f_287_;
		float f_292_
		    = f_290_ * (float) ((Class168_Sub1) this).anInt9865;
		float f_293_
		    = f_291_ * (float) ((Class168_Sub1) this).anInt9865;
		float f_294_
		    = f_288_ * (float) ((Class168_Sub1) this).anInt9863;
		float f_295_
		    = f_289_ * (float) ((Class168_Sub1) this).anInt9863;
		float f_296_
		    = -f_288_ * (float) ((Class168_Sub1) this).anInt9868;
		float f_297_
		    = -f_289_ * (float) ((Class168_Sub1) this).anInt9868;
		float f_298_
		    = -f_290_ * (float) ((Class168_Sub1) this).anInt9867;
		float f_299_
		    = -f_291_ * (float) ((Class168_Sub1) this).anInt9867;
		f = f + f_294_ + f_292_;
		f_278_ = f_278_ + f_295_ + f_293_;
		f_279_ = f_279_ + f_296_ + f_292_;
		f_280_ = f_280_ + f_297_ + f_293_;
		f_281_ = f_281_ + f_294_ + f_298_;
		f_282_ = f_282_ + f_295_ + f_299_;
	    }
	    Class352 class352
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass352_9593);
	    class352.anInterface41_5433
		= ((Class168_Sub1) this).anInterface41_9860;
	    class352.method6408(i, i_283_);
	    float f_300_
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2655();
	    float f_301_
		= (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			      ((byte) 4).method2654();
	    class352.aClass268_5428.method5198();
	    class352.aClass268_5428.aFloatArray4353[0]
		= (f_279_ - f) * 2.0F / f_300_;
	    class352.aClass268_5428.aFloatArray4353[1]
		= (f_280_ - f_278_) * 2.0F / f_301_;
	    class352.aClass268_5428.aFloatArray4353[4]
		= (f_281_ - f) * 2.0F / f_300_;
	    class352.aClass268_5428.aFloatArray4353[5]
		= (f_282_ - f_278_) * 2.0F / f_301_;
	    class352.aClass268_5428.aFloatArray4353[12]
		= ((f
		    + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
		   * 2.0F / f_300_) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[13]
		= ((f_278_
		    + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622())
		   * 2.0F / f_301_) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
	    class352.aClass268_5431.method5206
		(((Class168_Sub1) this).anInterface41_9860
		     .method225((float) ((Class168_Sub1) this).anInt9862),
		 ((Class168_Sub1) this).anInterface41_9860
		     .method226((float) ((Class168_Sub1) this).anInt9869),
		 1.0F, 1.0F);
	    class352.anInterface40_5432
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .anInterface40_9583);
	    class352.anInt5434 = 0;
	    class352.aClass366_5435
		= (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
		   .aClass366_9479);
	    class352.method6410();
	}
    }
    
    public void method3610(int i, int i_302_, int i_303_) {
	int[] is = (((Class168_Sub1) this).aClass103_Sub3_9866.method2251
		    (i, i_302_, ((Class168_Sub1) this).anInt9862,
		     ((Class168_Sub1) this).anInt9869));
	int[] is_304_ = new int[(((Class168_Sub1) this).anInt9862
				 * ((Class168_Sub1) this).anInt9869)];
	((Class168_Sub1) this).anInterface41_9860.method231
	    (0, 0, ((Class168_Sub1) this).anInt9862,
	     ((Class168_Sub1) this).anInt9869, is_304_, 0);
	if (i_303_ == 0) {
	    for (int i_305_ = 0; i_305_ < ((Class168_Sub1) this).anInt9869;
		 i_305_++) {
		int i_306_ = i_305_ * ((Class168_Sub1) this).anInt9862;
		for (int i_307_ = 0; i_307_ < ((Class168_Sub1) this).anInt9862;
		     i_307_++)
		    is_304_[i_306_ + i_307_]
			= (is_304_[i_306_ + i_307_] & 0xffffff
			   | is[i_306_ + i_307_] << 8 & ~0xffffff);
	    }
	} else if (i_303_ == 1) {
	    for (int i_308_ = 0; i_308_ < ((Class168_Sub1) this).anInt9869;
		 i_308_++) {
		int i_309_ = i_308_ * ((Class168_Sub1) this).anInt9862;
		for (int i_310_ = 0; i_310_ < ((Class168_Sub1) this).anInt9862;
		     i_310_++)
		    is_304_[i_309_ + i_310_]
			= (is_304_[i_309_ + i_310_] & 0xffffff
			   | is[i_309_ + i_310_] << 16 & ~0xffffff);
	    }
	} else if (i_303_ == 2) {
	    for (int i_311_ = 0; i_311_ < ((Class168_Sub1) this).anInt9869;
		 i_311_++) {
		int i_312_ = i_311_ * ((Class168_Sub1) this).anInt9862;
		for (int i_313_ = 0; i_313_ < ((Class168_Sub1) this).anInt9862;
		     i_313_++)
		    is_304_[i_312_ + i_313_]
			= (is_304_[i_312_ + i_313_] & 0xffffff
			   | is[i_312_ + i_313_] << 24 & ~0xffffff);
	    }
	} else if (i_303_ == 3) {
	    for (int i_314_ = 0; i_314_ < ((Class168_Sub1) this).anInt9869;
		 i_314_++) {
		int i_315_ = i_314_ * ((Class168_Sub1) this).anInt9862;
		for (int i_316_ = 0; i_316_ < ((Class168_Sub1) this).anInt9862;
		     i_316_++)
		    is_304_[i_315_ + i_316_]
			= (is_304_[i_315_ + i_316_] & 0xffffff
			   | (is[i_315_ + i_316_] != 0 ? -16777216 : 0));
	    }
	}
	method16200(0, 0, ((Class168_Sub1) this).anInt9862,
		    ((Class168_Sub1) this).anInt9869, is_304_, 0,
		    ((Class168_Sub1) this).anInt9862);
    }
    
    void method3650(float f, float f_317_, float f_318_, float f_319_,
		    float f_320_, float f_321_, int i, Class135 class135,
		    int i_322_, int i_323_) {
	((Class168_Sub1) this).aClass103_Sub3_9866.method15654();
	Class352 class352
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .aClass352_9593);
	class352.anInterface41_5433
	    = ((Class168_Sub1) this).anInterface41_9860;
	class352.method6408(1, -1);
	float f_324_
	    = (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			  ((byte) 4).method2655();
	float f_325_
	    = (float) ((Class168_Sub1) this).aClass103_Sub3_9866.method2237
			  ((byte) 4).method2654();
	class352.aClass268_5428.method5198();
	if (((Class168_Sub1) this).aBool9864) {
	    float f_326_ = ((float) ((Class168_Sub1) this).anInt9862
			    / (float) method64());
	    float f_327_ = ((float) ((Class168_Sub1) this).anInt9869
			    / (float) method3616());
	    class352.aClass268_5428.aFloatArray4353[0] = (f_318_ - f) * f_326_;
	    class352.aClass268_5428.aFloatArray4353[1]
		= (f_319_ - f_317_) * f_326_;
	    class352.aClass268_5428.aFloatArray4353[4] = (f_320_ - f) * f_327_;
	    class352.aClass268_5428.aFloatArray4353[5]
		= (f_321_ - f_317_) * f_327_;
	    class352.aClass268_5428.aFloatArray4353[12]
		= ((f + (float) ((Class168_Sub1) this).anInt9863) * f_326_
		   + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622());
	    class352.aClass268_5428.aFloatArray4353[13]
		= ((f_317_ + (float) ((Class168_Sub1) this).anInt9865) * f_327_
		   + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622());
	} else {
	    class352.aClass268_5428.aFloatArray4353[0] = f_318_ - f;
	    class352.aClass268_5428.aFloatArray4353[1] = f_319_ - f_317_;
	    class352.aClass268_5428.aFloatArray4353[4] = f_320_ - f;
	    class352.aClass268_5428.aFloatArray4353[5] = f_321_ - f_317_;
	    class352.aClass268_5428.aFloatArray4353[12]
		= f + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622();
	    class352.aClass268_5428.aFloatArray4353[13]
		= (f_317_
		   + ((Class168_Sub1) this).aClass103_Sub3_9866.method15622());
	}
	Class268 class268
	    = ((Class168_Sub1) this).aClass103_Sub3_9866.aClass268_9511;
	class268.method5198();
	class268.aFloatArray4353[0] = 2.0F / f_324_;
	class268.aFloatArray4353[5] = 2.0F / f_325_;
	class268.aFloatArray4353[12] = -1.0F;
	class268.aFloatArray4353[13] = -1.0F;
	class268.aFloatArray4353[14] = -1.0F;
	class352.aClass268_5428.method5202(class268);
	class352.aClass268_5431.method5206
	    (((Class168_Sub1) this).anInterface41_9860
		 .method225((float) ((Class168_Sub1) this).anInt9862),
	     ((Class168_Sub1) this).anInterface41_9860
		 .method226((float) ((Class168_Sub1) this).anInt9869),
	     1.0F, 1.0F);
	class352.anInterface40_5432
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .anInterface40_9583);
	class352.anInt5434 = 0;
	class352.aClass366_5435
	    = (((Class103_Sub3) ((Class168_Sub1) this).aClass103_Sub3_9866)
	       .aClass366_9479);
	Interface41 interface41
	    = ((Class135_Sub2) (Class135_Sub2) class135).anInterface41_10002;
	class352.anInterface41_5429 = interface41;
	class352.aClass268_5427.method5198();
	class352.aClass268_5427.aFloatArray4353[0]
	    = (f_318_ - f) * interface41.method225(1.0F);
	class352.aClass268_5427.aFloatArray4353[1]
	    = (f_319_ - f_317_) * interface41.method225(1.0F);
	class352.aClass268_5427.aFloatArray4353[4]
	    = (f_320_ - f) * interface41.method226(1.0F);
	class352.aClass268_5427.aFloatArray4353[5]
	    = (f_321_ - f_317_) * interface41.method226(1.0F);
	class352.aClass268_5427.aFloatArray4353[12]
	    = (f - (float) i_322_) * interface41.method225(1.0F);
	class352.aClass268_5427.aFloatArray4353[13]
	    = (f_317_ - (float) i_323_) * interface41.method226(1.0F);
	class352.method6415();
    }
    
    public int method3601() {
	return ((Class168_Sub1) this).anInt9862;
    }
    
    public int method3616() {
	return (((Class168_Sub1) this).anInt9869
		+ ((Class168_Sub1) this).anInt9865
		+ ((Class168_Sub1) this).anInt9867);
    }
    
    void method16200(int i, int i_328_, int i_329_, int i_330_, int[] is,
		     int i_331_, int i_332_) {
	((Class168_Sub1) this).anInterface41_9860
	    .method256(i, i_328_, i_329_, i_330_, is, i_331_, i_332_);
    }
    
    public int method3642() {
	return ((Class168_Sub1) this).anInt9869;
    }
    
    public int method3655() {
	return ((Class168_Sub1) this).anInt9869;
    }
    
    public int method3604() {
	return ((Class168_Sub1) this).anInt9869;
    }
    
    public int method3657() {
	return ((Class168_Sub1) this).anInt9869;
    }
    
    void method16201(int i, int i_333_, int i_334_, int i_335_, int[] is,
		     int i_336_, int i_337_) {
	((Class168_Sub1) this).anInterface41_9860
	    .method256(i, i_333_, i_334_, i_335_, is, i_336_, i_337_);
    }
    
    void method16202(int i, int i_338_, int i_339_, int i_340_, int[] is,
		     int i_341_, int i_342_) {
	((Class168_Sub1) this).anInterface41_9860
	    .method256(i, i_338_, i_339_, i_340_, is, i_341_, i_342_);
    }
    
    void method16203(int i, int i_343_, int i_344_, int i_345_, int[] is,
		     int i_346_, int i_347_) {
	((Class168_Sub1) this).anInterface41_9860
	    .method256(i, i_343_, i_344_, i_345_, is, i_346_, i_347_);
    }
    
    void method16204(int i, int i_348_, int i_349_, int i_350_, int[] is,
		     int i_351_, int i_352_) {
	((Class168_Sub1) this).anInterface41_9860
	    .method256(i, i_348_, i_349_, i_350_, is, i_351_, i_352_);
    }
}
