/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class45
{
    int anInt613;
    int anInt614;
    int anInt615;
    int anInt616;
    int anInt617;
    int anInt618;
    int[] anIntArray619;
    int[] anIntArray620;
    Class57 aClass57_621;
    int[][] anIntArrayArray622;
    
    Class45() {
	/* empty */
    }
    
    void method1109(Class57 class57) {
	((Class45) this).aClass57_621 = class57;
	((Class45) this).anInt613
	    = ((Class45) this).aClass57_621.method1441(16);
	((Class45) this).anInt614
	    = ((Class45) this).aClass57_621.method1441(24);
	((Class45) this).anInt615
	    = ((Class45) this).aClass57_621.method1441(24);
	((Class45) this).anInt616
	    = ((Class45) this).aClass57_621.method1441(24) + 1;
	((Class45) this).anInt617
	    = ((Class45) this).aClass57_621.method1441(6) + 1;
	((Class45) this).anInt618
	    = ((Class45) this).aClass57_621.method1441(8);
	if (((Class45) this).anIntArray620 == null
	    || (((Class45) this).anIntArray620.length
		!= ((Class45) this).anInt617))
	    ((Class45) this).anIntArray620
		= new int[((Class45) this).anInt617];
	for (int i = 0; i < ((Class45) this).anInt617; i++) {
	    int i_0_ = 0;
	    int i_1_ = ((Class45) this).aClass57_621.method1441(3);
	    boolean bool = ((Class45) this).aClass57_621.method1411() != 0;
	    if (bool)
		i_0_ = ((Class45) this).aClass57_621.method1441(5);
	    ((Class45) this).anIntArray620[i] = i_0_ << 3 | i_1_;
	}
	if (((Class45) this).anIntArray619 == null
	    || (((Class45) this).anIntArray619.length
		!= ((Class45) this).anInt617 * 8))
	    ((Class45) this).anIntArray619
		= new int[((Class45) this).anInt617 * 8];
	for (int i = 0; i < ((Class45) this).anInt617 * 8; i++)
	    ((Class45) this).anIntArray619[i]
		= ((((Class45) this).anIntArray620[i >> 3] & 1 << (i & 0x7))
		   != 0) ? ((Class45) this).aClass57_621.method1441(8) : -1;
    }
    
    void method1110(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    Class60[] method1111(Class60[] class60s, int i, boolean[] bools) {
	int i_2_ = class60s.length;
	for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
	    if (!bools[i_3_]) {
		for (int i_4_ = 0; i_4_ < i; i_4_++)
		    ((Class60) class60s[i_3_]).aFloatArray1018[i_4_] = 0.0F;
	    }
	}
	int i_5_ = (((Class34) (((Class57) ((Class45) this).aClass57_621)
				.aClass34Array755[((Class45) this).anInt618]))
		    .anInt371);
	int i_6_ = ((Class45) this).anInt615 - ((Class45) this).anInt614;
	int i_7_ = i_6_ / ((Class45) this).anInt616;
	if (((Class45) this).anIntArrayArray622 == null
	    || ((Class45) this).anIntArrayArray622.length != i_2_
	    || ((Class45) this).anIntArrayArray622[0].length != i_7_)
	    ((Class45) this).anIntArrayArray622 = new int[i_2_][i_7_];
	else {
	    for (int i_8_ = 0; i_8_ < i_2_; i_8_++)
		method1119(((Class45) this).anIntArrayArray622[i_8_]);
	}
	for (int i_9_ = 0; i_9_ < 8; i_9_++) {
	    int i_10_ = 0;
	    while (i_10_ < i_7_) {
		if (i_9_ == 0) {
		    for (int i_11_ = 0; i_11_ < i_2_; i_11_++) {
			if (!bools[i_11_]) {
			    int i_12_
				= (((Class57) ((Class45) this).aClass57_621)
				       .aClass34Array755
				       [((Class45) this).anInt618].method984
				   (((Class45) this).aClass57_621));
			    for (int i_13_ = i_5_ - 1; i_13_ >= 0; i_13_--) {
				if (i_10_ + i_13_ < i_7_)
				    ((Class45) this).anIntArrayArray622
					[i_11_][i_10_ + i_13_]
					= i_12_ % ((Class45) this).anInt617;
				i_12_ /= ((Class45) this).anInt617;
			    }
			}
		    }
		}
		for (int i_14_ = 0; i_14_ < i_5_; i_14_++) {
		    for (int i_15_ = 0; i_15_ < i_2_; i_15_++) {
			if (!bools[i_15_]) {
			    int i_16_ = (((Class45) this).anIntArrayArray622
					 [i_15_][i_10_]);
			    int i_17_ = (((Class45) this).anIntArray619
					 [i_16_ * 8 + i_9_]);
			    if (i_17_ >= 0) {
				int i_18_
				    = (((Class45) this).anInt614
				       + i_10_ * ((Class45) this).anInt616);
				Class34 class34 = (((Class57) (((Class45) this)
							       .aClass57_621))
						   .aClass34Array755[i_17_]);
				if (((Class45) this).anInt613 == 0) {
				    int i_19_
					= (((Class45) this).anInt616
					   / ((Class34) class34).anInt371);
				    for (int i_20_ = 0; i_20_ < i_19_;
					 i_20_++) {
					float[] fs
					    = class34.method985(((Class45)
								 this)
								.aClass57_621);
					for (int i_21_ = 0;
					     (i_21_
					      < ((Class34) class34).anInt371);
					     i_21_++)
					    ((Class60) class60s[i_15_])
						.aFloatArray1018
						[i_18_ + i_20_ + i_21_ * i_19_]
						+= fs[i_21_];
				    }
				} else if (((Class45) this).anInt613 == 1
					   || ((Class45) this).anInt613 == 2) {
				    int i_22_ = 0;
				    while (i_22_ < ((Class45) this).anInt616) {
					float[] fs
					    = class34.method985(((Class45)
								 this)
								.aClass57_621);
					for (int i_23_ = 0;
					     (i_23_
					      < ((Class34) class34).anInt371);
					     i_23_++) {
					    ((Class60) class60s[i_15_])
						.aFloatArray1018[i_18_ + i_22_]
						+= fs[i_23_];
					    i_22_++;
					}
				    }
				}
			    }
			}
		    }
		    if (++i_10_ >= i_7_)
			break;
		}
	    }
	}
	return class60s;
    }
    
    void method1112(Class57 class57) {
	((Class45) this).aClass57_621 = class57;
	((Class45) this).anInt613
	    = ((Class45) this).aClass57_621.method1441(16);
	((Class45) this).anInt614
	    = ((Class45) this).aClass57_621.method1441(24);
	((Class45) this).anInt615
	    = ((Class45) this).aClass57_621.method1441(24);
	((Class45) this).anInt616
	    = ((Class45) this).aClass57_621.method1441(24) + 1;
	((Class45) this).anInt617
	    = ((Class45) this).aClass57_621.method1441(6) + 1;
	((Class45) this).anInt618
	    = ((Class45) this).aClass57_621.method1441(8);
	if (((Class45) this).anIntArray620 == null
	    || (((Class45) this).anIntArray620.length
		!= ((Class45) this).anInt617))
	    ((Class45) this).anIntArray620
		= new int[((Class45) this).anInt617];
	for (int i = 0; i < ((Class45) this).anInt617; i++) {
	    int i_24_ = 0;
	    int i_25_ = ((Class45) this).aClass57_621.method1441(3);
	    boolean bool = ((Class45) this).aClass57_621.method1411() != 0;
	    if (bool)
		i_24_ = ((Class45) this).aClass57_621.method1441(5);
	    ((Class45) this).anIntArray620[i] = i_24_ << 3 | i_25_;
	}
	if (((Class45) this).anIntArray619 == null
	    || (((Class45) this).anIntArray619.length
		!= ((Class45) this).anInt617 * 8))
	    ((Class45) this).anIntArray619
		= new int[((Class45) this).anInt617 * 8];
	for (int i = 0; i < ((Class45) this).anInt617 * 8; i++)
	    ((Class45) this).anIntArray619[i]
		= ((((Class45) this).anIntArray620[i >> 3] & 1 << (i & 0x7))
		   != 0) ? ((Class45) this).aClass57_621.method1441(8) : -1;
    }
    
    void method1113(Class57 class57) {
	((Class45) this).aClass57_621 = class57;
	((Class45) this).anInt613
	    = ((Class45) this).aClass57_621.method1441(16);
	((Class45) this).anInt614
	    = ((Class45) this).aClass57_621.method1441(24);
	((Class45) this).anInt615
	    = ((Class45) this).aClass57_621.method1441(24);
	((Class45) this).anInt616
	    = ((Class45) this).aClass57_621.method1441(24) + 1;
	((Class45) this).anInt617
	    = ((Class45) this).aClass57_621.method1441(6) + 1;
	((Class45) this).anInt618
	    = ((Class45) this).aClass57_621.method1441(8);
	if (((Class45) this).anIntArray620 == null
	    || (((Class45) this).anIntArray620.length
		!= ((Class45) this).anInt617))
	    ((Class45) this).anIntArray620
		= new int[((Class45) this).anInt617];
	for (int i = 0; i < ((Class45) this).anInt617; i++) {
	    int i_26_ = 0;
	    int i_27_ = ((Class45) this).aClass57_621.method1441(3);
	    boolean bool = ((Class45) this).aClass57_621.method1411() != 0;
	    if (bool)
		i_26_ = ((Class45) this).aClass57_621.method1441(5);
	    ((Class45) this).anIntArray620[i] = i_26_ << 3 | i_27_;
	}
	if (((Class45) this).anIntArray619 == null
	    || (((Class45) this).anIntArray619.length
		!= ((Class45) this).anInt617 * 8))
	    ((Class45) this).anIntArray619
		= new int[((Class45) this).anInt617 * 8];
	for (int i = 0; i < ((Class45) this).anInt617 * 8; i++)
	    ((Class45) this).anIntArray619[i]
		= ((((Class45) this).anIntArray620[i >> 3] & 1 << (i & 0x7))
		   != 0) ? ((Class45) this).aClass57_621.method1441(8) : -1;
    }
    
    void method1114(Class57 class57) {
	((Class45) this).aClass57_621 = class57;
	((Class45) this).anInt613
	    = ((Class45) this).aClass57_621.method1441(16);
	((Class45) this).anInt614
	    = ((Class45) this).aClass57_621.method1441(24);
	((Class45) this).anInt615
	    = ((Class45) this).aClass57_621.method1441(24);
	((Class45) this).anInt616
	    = ((Class45) this).aClass57_621.method1441(24) + 1;
	((Class45) this).anInt617
	    = ((Class45) this).aClass57_621.method1441(6) + 1;
	((Class45) this).anInt618
	    = ((Class45) this).aClass57_621.method1441(8);
	if (((Class45) this).anIntArray620 == null
	    || (((Class45) this).anIntArray620.length
		!= ((Class45) this).anInt617))
	    ((Class45) this).anIntArray620
		= new int[((Class45) this).anInt617];
	for (int i = 0; i < ((Class45) this).anInt617; i++) {
	    int i_28_ = 0;
	    int i_29_ = ((Class45) this).aClass57_621.method1441(3);
	    boolean bool = ((Class45) this).aClass57_621.method1411() != 0;
	    if (bool)
		i_28_ = ((Class45) this).aClass57_621.method1441(5);
	    ((Class45) this).anIntArray620[i] = i_28_ << 3 | i_29_;
	}
	if (((Class45) this).anIntArray619 == null
	    || (((Class45) this).anIntArray619.length
		!= ((Class45) this).anInt617 * 8))
	    ((Class45) this).anIntArray619
		= new int[((Class45) this).anInt617 * 8];
	for (int i = 0; i < ((Class45) this).anInt617 * 8; i++)
	    ((Class45) this).anIntArray619[i]
		= ((((Class45) this).anIntArray620[i >> 3] & 1 << (i & 0x7))
		   != 0) ? ((Class45) this).aClass57_621.method1441(8) : -1;
    }
    
    void method1115(Class57 class57) {
	((Class45) this).aClass57_621 = class57;
	((Class45) this).anInt613
	    = ((Class45) this).aClass57_621.method1441(16);
	((Class45) this).anInt614
	    = ((Class45) this).aClass57_621.method1441(24);
	((Class45) this).anInt615
	    = ((Class45) this).aClass57_621.method1441(24);
	((Class45) this).anInt616
	    = ((Class45) this).aClass57_621.method1441(24) + 1;
	((Class45) this).anInt617
	    = ((Class45) this).aClass57_621.method1441(6) + 1;
	((Class45) this).anInt618
	    = ((Class45) this).aClass57_621.method1441(8);
	if (((Class45) this).anIntArray620 == null
	    || (((Class45) this).anIntArray620.length
		!= ((Class45) this).anInt617))
	    ((Class45) this).anIntArray620
		= new int[((Class45) this).anInt617];
	for (int i = 0; i < ((Class45) this).anInt617; i++) {
	    int i_30_ = 0;
	    int i_31_ = ((Class45) this).aClass57_621.method1441(3);
	    boolean bool = ((Class45) this).aClass57_621.method1411() != 0;
	    if (bool)
		i_30_ = ((Class45) this).aClass57_621.method1441(5);
	    ((Class45) this).anIntArray620[i] = i_30_ << 3 | i_31_;
	}
	if (((Class45) this).anIntArray619 == null
	    || (((Class45) this).anIntArray619.length
		!= ((Class45) this).anInt617 * 8))
	    ((Class45) this).anIntArray619
		= new int[((Class45) this).anInt617 * 8];
	for (int i = 0; i < ((Class45) this).anInt617 * 8; i++)
	    ((Class45) this).anIntArray619[i]
		= ((((Class45) this).anIntArray620[i >> 3] & 1 << (i & 0x7))
		   != 0) ? ((Class45) this).aClass57_621.method1441(8) : -1;
    }
    
    void method1116(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    Class60[] method1117(Class60[] class60s, int i, boolean[] bools) {
	int i_32_ = class60s.length;
	for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
	    if (!bools[i_33_]) {
		for (int i_34_ = 0; i_34_ < i; i_34_++)
		    ((Class60) class60s[i_33_]).aFloatArray1018[i_34_] = 0.0F;
	    }
	}
	int i_35_ = (((Class34) (((Class57) ((Class45) this).aClass57_621)
				 .aClass34Array755[((Class45) this).anInt618]))
		     .anInt371);
	int i_36_ = ((Class45) this).anInt615 - ((Class45) this).anInt614;
	int i_37_ = i_36_ / ((Class45) this).anInt616;
	if (((Class45) this).anIntArrayArray622 == null
	    || ((Class45) this).anIntArrayArray622.length != i_32_
	    || ((Class45) this).anIntArrayArray622[0].length != i_37_)
	    ((Class45) this).anIntArrayArray622 = new int[i_32_][i_37_];
	else {
	    for (int i_38_ = 0; i_38_ < i_32_; i_38_++)
		method1119(((Class45) this).anIntArrayArray622[i_38_]);
	}
	for (int i_39_ = 0; i_39_ < 8; i_39_++) {
	    int i_40_ = 0;
	    while (i_40_ < i_37_) {
		if (i_39_ == 0) {
		    for (int i_41_ = 0; i_41_ < i_32_; i_41_++) {
			if (!bools[i_41_]) {
			    int i_42_
				= (((Class57) ((Class45) this).aClass57_621)
				       .aClass34Array755
				       [((Class45) this).anInt618].method984
				   (((Class45) this).aClass57_621));
			    for (int i_43_ = i_35_ - 1; i_43_ >= 0; i_43_--) {
				if (i_40_ + i_43_ < i_37_)
				    ((Class45) this).anIntArrayArray622
					[i_41_][i_40_ + i_43_]
					= i_42_ % ((Class45) this).anInt617;
				i_42_ /= ((Class45) this).anInt617;
			    }
			}
		    }
		}
		for (int i_44_ = 0; i_44_ < i_35_; i_44_++) {
		    for (int i_45_ = 0; i_45_ < i_32_; i_45_++) {
			if (!bools[i_45_]) {
			    int i_46_ = (((Class45) this).anIntArrayArray622
					 [i_45_][i_40_]);
			    int i_47_ = (((Class45) this).anIntArray619
					 [i_46_ * 8 + i_39_]);
			    if (i_47_ >= 0) {
				int i_48_
				    = (((Class45) this).anInt614
				       + i_40_ * ((Class45) this).anInt616);
				Class34 class34 = (((Class57) (((Class45) this)
							       .aClass57_621))
						   .aClass34Array755[i_47_]);
				if (((Class45) this).anInt613 == 0) {
				    int i_49_
					= (((Class45) this).anInt616
					   / ((Class34) class34).anInt371);
				    for (int i_50_ = 0; i_50_ < i_49_;
					 i_50_++) {
					float[] fs
					    = class34.method985(((Class45)
								 this)
								.aClass57_621);
					for (int i_51_ = 0;
					     (i_51_
					      < ((Class34) class34).anInt371);
					     i_51_++)
					    ((Class60) class60s[i_45_])
						.aFloatArray1018
						[i_48_ + i_50_ + i_51_ * i_49_]
						+= fs[i_51_];
				    }
				} else if (((Class45) this).anInt613 == 1
					   || ((Class45) this).anInt613 == 2) {
				    int i_52_ = 0;
				    while (i_52_ < ((Class45) this).anInt616) {
					float[] fs
					    = class34.method985(((Class45)
								 this)
								.aClass57_621);
					for (int i_53_ = 0;
					     (i_53_
					      < ((Class34) class34).anInt371);
					     i_53_++) {
					    ((Class60) class60s[i_45_])
						.aFloatArray1018[i_48_ + i_52_]
						+= fs[i_53_];
					    i_52_++;
					}
				    }
				}
			    }
			}
		    }
		    if (++i_40_ >= i_37_)
			break;
		}
	    }
	}
	return class60s;
    }
    
    void method1118(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method1119(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
}
